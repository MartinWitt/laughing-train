# mina-sshd 
 
# Bad smells
I found 1694 bad smells with 62 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| ReturnNull | 549 | false |
| AssignmentToMethodParameter | 183 | false |
| PublicFieldAccessedInSynchronizedContext | 95 | false |
| DataFlowIssue | 74 | false |
| ConstantValue | 55 | false |
| AssignmentToForLoopParameter | 55 | false |
| UnnecessaryFullyQualifiedName | 46 | false |
| SystemOutErr | 45 | false |
| BoundedWildcard | 43 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 42 | false |
| CStyleArrayDeclaration | 30 | false |
| OctalLiteral | 29 | false |
| UnusedAssignment | 27 | false |
| RedundantUnmodifiable | 25 | false |
| UnnecessaryUnboxing | 23 | false |
| RedundantClassCall | 22 | false |
| UnnecessaryCallToStringValueOf | 21 | false |
| UnnecessaryQualifierForThis | 20 | false |
| UnnecessaryToStringCall | 20 | true |
| InstanceofCatchParameter | 19 | false |
| RedundantSuppression | 17 | false |
| UnnecessaryBoxing | 15 | false |
| RedundantMethodOverride | 14 | false |
| RedundantImplements | 12 | false |
| DeprecatedIsStillUsed | 11 | false |
| ToArrayCallWithZeroLengthArrayArgument | 10 | true |
| FinalStaticMethod | 10 | false |
| EmptyMethod | 10 | false |
| SynchronizeOnThis | 10 | false |
| UnnecessaryLocalVariable | 10 | true |
| NonShortCircuitBoolean | 9 | false |
| NonStrictComparisonCanBeEquality | 9 | true |
| UnnecessaryReturn | 7 | true |
| DynamicRegexReplaceableByCompiledPattern | 7 | false |
| UnnecessaryContinue | 7 | false |
| IgnoreResultOfCall | 6 | false |
| ZeroLengthArrayInitialization | 5 | false |
| SynchronizeOnNonFinalField | 5 | false |
| SynchronizationOnLocalVariableOrMethodParameter | 5 | false |
| SizeReplaceableByIsEmpty | 4 | true |
| ThrowFromFinallyBlock | 4 | false |
| UnnecessarySuperQualifier | 4 | false |
| StringBufferReplaceableByStringBuilder | 4 | false |
| PointlessArithmeticExpression | 3 | false |
| DuplicateBranchesInSwitch | 3 | false |
| MissortedModifiers | 3 | false |
| NonSerializableFieldInSerializableClass | 3 | false |
| CharsetObjectCanBeUsed | 3 | false |
| ThrowableNotThrown | 3 | false |
| UnnecessaryStringEscape | 2 | true |
| FunctionalExpressionCanBeFolded | 2 | false |
| ClassNameSameAsAncestorName | 2 | false |
| InfiniteLoopStatement | 2 | false |
| NestedAssignment | 2 | false |
| MismatchedCollectionQueryUpdate | 2 | false |
| ArrayEquality | 2 | false |
| NonFinalFieldOfException | 2 | false |
| OptionalGetWithoutIsPresent | 2 | false |
| IOResource | 2 | false |
| UnnecessarySemicolon | 2 | false |
| SimplifyStreamApiCallChains | 2 | false |
| ParameterCanBeLocal | 2 | false |
| StringOperationCanBeSimplified | 2 | false |
| NonSynchronizedMethodOverridesSynchronizedMethod | 2 | false |
| CatchMayIgnoreException | 2 | false |
| ConditionCoveredByFurtherCondition | 2 | false |
| CastCanBeRemovedNarrowingVariableType | 2 | false |
| Finalize | 1 | false |
| WrapperTypeMayBePrimitive | 1 | false |
| StringEquality | 1 | false |
| WaitWhileHoldingTwoLocks | 1 | false |
| AssignmentToStaticFieldFromInstanceMethod | 1 | false |
| ObsoleteCollection | 1 | false |
| KeySetIterationMayUseEntrySet | 1 | false |
| FinalPrivateMethod | 1 | false |
| SuspiciousInvocationHandlerImplementation | 1 | false |
| EqualsBetweenInconvertibleTypes | 1 | false |
| InstanceofIncompatibleInterface | 1 | false |
| DefaultAnnotationParam | 1 | false |
| RedundantStreamOptionalCall | 1 | false |
| ReplaceAssignmentWithOperatorAssignment | 1 | false |
| TypeParameterExtendsObject | 1 | false |
| MismatchedJavadocCode | 1 | false |
| NestedSynchronizedStatement | 1 | false |
| OptionalUsedAsFieldOrParameterType | 1 | false |
| Java8MapApi | 1 | false |
| Convert2Lambda | 1 | false |
| BusyWait | 1 | false |
| WaitNotInLoop | 1 | false |
## RuleId[id=ToArrayCallWithZeroLengthArrayArgument]
### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[values.size()\]'
in `sshd-common/src/main/java/org/apache/sshd/common/util/GenericUtils.java`
#### Snippet
```java
        }

        return values.toArray(new String[values.size()]);
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new DirEntry\[result.size()\]'
in `sshd-spring-sftp/src/main/java/org/apache/sshd/sftp/spring/integration/SpringSftpSession.java`
#### Snippet
```java
        }

        return result.toArray(new DirEntry[result.size()]);
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[names.size()\]'
in `sshd-spring-sftp/src/main/java/org/apache/sshd/sftp/spring/integration/SpringSftpSession.java`
#### Snippet
```java
        }

        return names.toArray(new String[names.size()]);
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[strs.size()\]'
in `sshd-git/src/main/java/org/apache/sshd/git/pgm/GitPgmCommand.java`
#### Snippet
```java
        try {
            List<String> strs = parseDelimitedString(command, " ", true);
            String[] args = strs.toArray(new String[strs.size()]);
            for (int i = 0; i < args.length; i++) {
                String argVal = args[i];
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[effective.size()\]'
in `sshd-cli/src/main/java/org/apache/sshd/cli/client/ScpCommandMain.java`
#### Snippet
```java
        }

        return effective.toArray(new String[effective.size()]);
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[arguments.size()\]'
in `sshd-git/src/main/java/org/apache/sshd/git/pgm/EmbeddedCommandRunner.java`
#### Snippet
```java
        }
        try {
            cmd.execute(arguments.toArray(new String[arguments.size()]));
        } finally {
            if (get(cmd, "outw") != null) {
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[strs.size()\]'
in `sshd-git/src/main/java/org/apache/sshd/git/pack/GitPackCommand.java`
#### Snippet
```java
        try {
            List<String> strs = parseDelimitedString(command, " ", true);
            String[] args = strs.toArray(new String[strs.size()]);
            for (int i = 0; i < args.length; i++) {
                String argVal = args[i];
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new FileAttribute\[fileAttributes.size()\]'
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/server/FileHandle.java`
#### Snippet
```java
        FileAttribute<?>[] fileAttrs = GenericUtils.isEmpty(fileAttributes)
                ? IoUtils.EMPTY_FILE_ATTRIBUTES
                : fileAttributes.toArray(new FileAttribute<?>[fileAttributes.size()]);

        SftpFileSystemAccessor accessor = subsystem.getFileSystemAccessor();
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new CopyOption\[opts.size()\]'
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/server/SftpFileSystemAccessor.java`
#### Snippet
```java
                GenericUtils.isEmpty(opts)
                        ? IoUtils.EMPTY_COPY_OPTIONS
                        : opts.toArray(new CopyOption[opts.size()]));
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new CopyOption\[opts.size()\]'
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/server/SftpFileSystemAccessor.java`
#### Snippet
```java
                GenericUtils.isEmpty(opts)
                        ? IoUtils.EMPTY_COPY_OPTIONS
                        : opts.toArray(new CopyOption[opts.size()]));
    }

```

## RuleId[id=Finalize]
### Finalize
'finalize()' should not be overridden
in `sshd-core/src/main/java/org/apache/sshd/agent/unix/AprLibrary.java`
#### Snippet
```java
    @Override
    @SuppressWarnings({ "checkstyle:NoFinalizer", "deprecation" })
    protected void finalize() throws Throwable {
        library = null;
        Pool.destroy(pool);
```

## RuleId[id=WrapperTypeMayBePrimitive]
### WrapperTypeMayBePrimitive
Type may be primitive
in `sshd-common/src/main/java/org/apache/sshd/common/util/security/AbstractSecurityProviderRegistrar.java`
#### Snippet
```java
        }

        Boolean supportFlag;
        synchronized (supportMap) {
            supportFlag = supportMap.computeIfAbsent(
```

## RuleId[id=StringEquality]
### StringEquality
String values are compared using `==`, not 'equals()'
in `sshd-common/src/main/java/org/apache/sshd/common/util/GenericUtils.java`
#### Snippet
```java
     */
    public static final Comparator<String> CASE_SENSITIVE_ORDER = (s1, s2) -> {
        if (s1 == s2) {
            return 0;
        } else {
```

## RuleId[id=PointlessArithmeticExpression]
### PointlessArithmeticExpression
`0 - delta` can be replaced with '- delta'
in `sshd-common/src/main/java/org/apache/sshd/common/util/functors/Int2IntFunction.java`
#### Snippet
```java

    public static IntUnaryOperator sub(int delta) {
        return add(0 - delta);
    }

```

### PointlessArithmeticExpression
`0 - bufferSize` can be replaced with '- bufferSize'
in `sshd-core/src/main/java/org/apache/sshd/common/channel/BufferedIoOutputStream.java`
#### Snippet
```java
            int stillPending;
            synchronized (pendingBytesCount) {
                stillPending = pendingBytesCount.addAndGet(0 - bufferSize);
                pendingBytesCount.notifyAll();
            }
```

### PointlessArithmeticExpression
`0 - variance` can be replaced with '- variance'
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/SessionHelper.java`
#### Snippet
```java
        }

        int extra = r.random((variance < 0) ? (0 - variance) : variance);
        long count = (variance < 0) ? (freq - extra) : (freq + extra);
        if (log.isTraceEnabled()) {
```

## RuleId[id=WaitWhileHoldingTwoLocks]
### WaitWhileHoldingTwoLocks
Call to `wait()` is made while holding two locks
in `sshd-core/src/main/java/org/apache/sshd/common/channel/ChannelOutputStream.java`
#### Snippet
```java
                while (isFlushing) {
                    try {
                        bufferLock.wait(millis, nanos);
                    } catch (InterruptedException e) {
                        InterruptedIOException interrupted = new InterruptedIOException(
```

## RuleId[id=RedundantClassCall]
### RedundantClassCall
Redundant call to `cast()`
in `sshd-common/src/main/java/org/apache/sshd/common/util/security/eddsa/EdDSASecurityProviderUtils.java`
#### Snippet
```java
        EdDSAPublicKeySpec keySpec = new EdDSAPublicKeySpec(prvKey.getAbyte(), prvKey.getParams());
        KeyFactory factory = SecurityUtils.getKeyFactory(SecurityUtils.EDDSA);
        return EdDSAPublicKey.class.cast(factory.generatePublic(keySpec));
    }

```

### RedundantClassCall
Redundant call to `cast()`
in `sshd-common/src/main/java/org/apache/sshd/common/util/security/eddsa/Ed25519PublicKeyDecoder.java`
#### Snippet
```java
            throws IOException, GeneralSecurityException {
        byte[] seed = KeyEntryResolver.readRLEBytes(keyData, MAX_ALLOWED_SEED_LEN);
        return EdDSAPublicKey.class.cast(SecurityUtils.generateEDDSAPublicKey(keyType, seed));
    }

```

### RedundantClassCall
Redundant call to `cast()`
in `sshd-common/src/main/java/org/apache/sshd/common/util/security/eddsa/Ed25519PEMResourceKeyParser.java`
#### Snippet
```java
        EdDSAPrivateKeySpec keySpec = new EdDSAPrivateKeySpec(seed, params);
        KeyFactory factory = SecurityUtils.getKeyFactory(SecurityUtils.EDDSA);
        return EdDSAPrivateKey.class.cast(factory.generatePrivate(keySpec));
    }
}
```

### RedundantClassCall
Redundant call to `cast()`
in `sshd-common/src/main/java/org/apache/sshd/common/util/closeable/NioChannelDelegateInvocationHandler.java`
#### Snippet
```java

    public Channel getChannelDelegate() {
        return Channel.class.cast(super.getAutoCloseableDelegate());
    }

```

### RedundantClassCall
Redundant call to `cast()`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/KeyUtils.java`
#### Snippet
```java
    public static boolean compareKeys(PrivateKey k1, PrivateKey k2) {
        if ((k1 instanceof RSAPrivateKey) && (k2 instanceof RSAPrivateKey)) {
            return compareRSAKeys(RSAPrivateKey.class.cast(k1), RSAPrivateKey.class.cast(k2));
        } else if ((k1 instanceof DSAPrivateKey) && (k2 instanceof DSAPrivateKey)) {
            return compareDSAKeys(DSAPrivateKey.class.cast(k1), DSAPrivateKey.class.cast(k2));
```

### RedundantClassCall
Redundant call to `cast()`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/KeyUtils.java`
#### Snippet
```java
    public static boolean compareKeys(PrivateKey k1, PrivateKey k2) {
        if ((k1 instanceof RSAPrivateKey) && (k2 instanceof RSAPrivateKey)) {
            return compareRSAKeys(RSAPrivateKey.class.cast(k1), RSAPrivateKey.class.cast(k2));
        } else if ((k1 instanceof DSAPrivateKey) && (k2 instanceof DSAPrivateKey)) {
            return compareDSAKeys(DSAPrivateKey.class.cast(k1), DSAPrivateKey.class.cast(k2));
```

### RedundantClassCall
Redundant call to `cast()`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/KeyUtils.java`
#### Snippet
```java
            return compareRSAKeys(RSAPrivateKey.class.cast(k1), RSAPrivateKey.class.cast(k2));
        } else if ((k1 instanceof DSAPrivateKey) && (k2 instanceof DSAPrivateKey)) {
            return compareDSAKeys(DSAPrivateKey.class.cast(k1), DSAPrivateKey.class.cast(k2));
        } else if ((k1 instanceof ECPrivateKey) && (k2 instanceof ECPrivateKey)) {
            return compareECKeys(ECPrivateKey.class.cast(k1), ECPrivateKey.class.cast(k2));
```

### RedundantClassCall
Redundant call to `cast()`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/KeyUtils.java`
#### Snippet
```java
            return compareRSAKeys(RSAPrivateKey.class.cast(k1), RSAPrivateKey.class.cast(k2));
        } else if ((k1 instanceof DSAPrivateKey) && (k2 instanceof DSAPrivateKey)) {
            return compareDSAKeys(DSAPrivateKey.class.cast(k1), DSAPrivateKey.class.cast(k2));
        } else if ((k1 instanceof ECPrivateKey) && (k2 instanceof ECPrivateKey)) {
            return compareECKeys(ECPrivateKey.class.cast(k1), ECPrivateKey.class.cast(k2));
```

### RedundantClassCall
Redundant call to `cast()`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/KeyUtils.java`
#### Snippet
```java
            return compareDSAKeys(DSAPrivateKey.class.cast(k1), DSAPrivateKey.class.cast(k2));
        } else if ((k1 instanceof ECPrivateKey) && (k2 instanceof ECPrivateKey)) {
            return compareECKeys(ECPrivateKey.class.cast(k1), ECPrivateKey.class.cast(k2));
        } else if ((k1 != null) && SecurityUtils.EDDSA.equalsIgnoreCase(k1.getAlgorithm())
                && (k2 != null) && SecurityUtils.EDDSA.equalsIgnoreCase(k2.getAlgorithm())) {
```

### RedundantClassCall
Redundant call to `cast()`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/KeyUtils.java`
#### Snippet
```java
            return compareDSAKeys(DSAPrivateKey.class.cast(k1), DSAPrivateKey.class.cast(k2));
        } else if ((k1 instanceof ECPrivateKey) && (k2 instanceof ECPrivateKey)) {
            return compareECKeys(ECPrivateKey.class.cast(k1), ECPrivateKey.class.cast(k2));
        } else if ((k1 != null) && SecurityUtils.EDDSA.equalsIgnoreCase(k1.getAlgorithm())
                && (k2 != null) && SecurityUtils.EDDSA.equalsIgnoreCase(k2.getAlgorithm())) {
```

### RedundantClassCall
Redundant call to `cast()`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/KeyUtils.java`
#### Snippet
```java
    public static boolean compareKeys(PublicKey k1, PublicKey k2) {
        if ((k1 instanceof RSAPublicKey) && (k2 instanceof RSAPublicKey)) {
            return compareRSAKeys(RSAPublicKey.class.cast(k1), RSAPublicKey.class.cast(k2));
        } else if ((k1 instanceof DSAPublicKey) && (k2 instanceof DSAPublicKey)) {
            return compareDSAKeys(DSAPublicKey.class.cast(k1), DSAPublicKey.class.cast(k2));
```

### RedundantClassCall
Redundant call to `cast()`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/KeyUtils.java`
#### Snippet
```java
    public static boolean compareKeys(PublicKey k1, PublicKey k2) {
        if ((k1 instanceof RSAPublicKey) && (k2 instanceof RSAPublicKey)) {
            return compareRSAKeys(RSAPublicKey.class.cast(k1), RSAPublicKey.class.cast(k2));
        } else if ((k1 instanceof DSAPublicKey) && (k2 instanceof DSAPublicKey)) {
            return compareDSAKeys(DSAPublicKey.class.cast(k1), DSAPublicKey.class.cast(k2));
```

### RedundantClassCall
Redundant call to `cast()`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/KeyUtils.java`
#### Snippet
```java
            return compareRSAKeys(RSAPublicKey.class.cast(k1), RSAPublicKey.class.cast(k2));
        } else if ((k1 instanceof DSAPublicKey) && (k2 instanceof DSAPublicKey)) {
            return compareDSAKeys(DSAPublicKey.class.cast(k1), DSAPublicKey.class.cast(k2));
        } else if ((k1 instanceof ECPublicKey) && (k2 instanceof ECPublicKey)) {
            return compareECKeys(ECPublicKey.class.cast(k1), ECPublicKey.class.cast(k2));
```

### RedundantClassCall
Redundant call to `cast()`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/KeyUtils.java`
#### Snippet
```java
            return compareRSAKeys(RSAPublicKey.class.cast(k1), RSAPublicKey.class.cast(k2));
        } else if ((k1 instanceof DSAPublicKey) && (k2 instanceof DSAPublicKey)) {
            return compareDSAKeys(DSAPublicKey.class.cast(k1), DSAPublicKey.class.cast(k2));
        } else if ((k1 instanceof ECPublicKey) && (k2 instanceof ECPublicKey)) {
            return compareECKeys(ECPublicKey.class.cast(k1), ECPublicKey.class.cast(k2));
```

### RedundantClassCall
Redundant call to `cast()`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/KeyUtils.java`
#### Snippet
```java
            return compareDSAKeys(DSAPublicKey.class.cast(k1), DSAPublicKey.class.cast(k2));
        } else if ((k1 instanceof ECPublicKey) && (k2 instanceof ECPublicKey)) {
            return compareECKeys(ECPublicKey.class.cast(k1), ECPublicKey.class.cast(k2));
        } else if ((k1 instanceof SkEcdsaPublicKey) && (k2 instanceof SkEcdsaPublicKey)) {
            return compareSkEcdsaKeys(SkEcdsaPublicKey.class.cast(k1), SkEcdsaPublicKey.class.cast(k2));
```

### RedundantClassCall
Redundant call to `cast()`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/KeyUtils.java`
#### Snippet
```java
            return compareDSAKeys(DSAPublicKey.class.cast(k1), DSAPublicKey.class.cast(k2));
        } else if ((k1 instanceof ECPublicKey) && (k2 instanceof ECPublicKey)) {
            return compareECKeys(ECPublicKey.class.cast(k1), ECPublicKey.class.cast(k2));
        } else if ((k1 instanceof SkEcdsaPublicKey) && (k2 instanceof SkEcdsaPublicKey)) {
            return compareSkEcdsaKeys(SkEcdsaPublicKey.class.cast(k1), SkEcdsaPublicKey.class.cast(k2));
```

### RedundantClassCall
Redundant call to `cast()`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/KeyUtils.java`
#### Snippet
```java
            return compareECKeys(ECPublicKey.class.cast(k1), ECPublicKey.class.cast(k2));
        } else if ((k1 instanceof SkEcdsaPublicKey) && (k2 instanceof SkEcdsaPublicKey)) {
            return compareSkEcdsaKeys(SkEcdsaPublicKey.class.cast(k1), SkEcdsaPublicKey.class.cast(k2));
        } else if ((k1 != null) && SecurityUtils.EDDSA.equalsIgnoreCase(k1.getAlgorithm())
                && (k2 != null) && SecurityUtils.EDDSA.equalsIgnoreCase(k2.getAlgorithm())) {
```

### RedundantClassCall
Redundant call to `cast()`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/KeyUtils.java`
#### Snippet
```java
            return compareECKeys(ECPublicKey.class.cast(k1), ECPublicKey.class.cast(k2));
        } else if ((k1 instanceof SkEcdsaPublicKey) && (k2 instanceof SkEcdsaPublicKey)) {
            return compareSkEcdsaKeys(SkEcdsaPublicKey.class.cast(k1), SkEcdsaPublicKey.class.cast(k2));
        } else if ((k1 != null) && SecurityUtils.EDDSA.equalsIgnoreCase(k1.getAlgorithm())
                && (k2 != null) && SecurityUtils.EDDSA.equalsIgnoreCase(k2.getAlgorithm())) {
```

### RedundantClassCall
Redundant call to `cast()`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/KeyUtils.java`
#### Snippet
```java
            return SecurityUtils.compareEDDSAPPublicKeys(k1, k2);
        } else if ((k1 instanceof SkED25519PublicKey) && (k2 instanceof SkED25519PublicKey)) {
            return compareSkEd25519Keys(SkED25519PublicKey.class.cast(k1), SkED25519PublicKey.class.cast(k2));
        } else if ((k1 instanceof OpenSshCertificate) && (k2 instanceof OpenSshCertificate)) {
            return compareOpenSSHCertificateKeys(OpenSshCertificate.class.cast(k1), OpenSshCertificate.class.cast(k2));
```

### RedundantClassCall
Redundant call to `cast()`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/KeyUtils.java`
#### Snippet
```java
            return SecurityUtils.compareEDDSAPPublicKeys(k1, k2);
        } else if ((k1 instanceof SkED25519PublicKey) && (k2 instanceof SkED25519PublicKey)) {
            return compareSkEd25519Keys(SkED25519PublicKey.class.cast(k1), SkED25519PublicKey.class.cast(k2));
        } else if ((k1 instanceof OpenSshCertificate) && (k2 instanceof OpenSshCertificate)) {
            return compareOpenSSHCertificateKeys(OpenSshCertificate.class.cast(k1), OpenSshCertificate.class.cast(k2));
```

### RedundantClassCall
Redundant call to `cast()`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/KeyUtils.java`
#### Snippet
```java
            return compareSkEd25519Keys(SkED25519PublicKey.class.cast(k1), SkED25519PublicKey.class.cast(k2));
        } else if ((k1 instanceof OpenSshCertificate) && (k2 instanceof OpenSshCertificate)) {
            return compareOpenSSHCertificateKeys(OpenSshCertificate.class.cast(k1), OpenSshCertificate.class.cast(k2));
        } else {
            return false; // either key is null or not of same class
```

### RedundantClassCall
Redundant call to `cast()`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/KeyUtils.java`
#### Snippet
```java
            return compareSkEd25519Keys(SkED25519PublicKey.class.cast(k1), SkED25519PublicKey.class.cast(k2));
        } else if ((k1 instanceof OpenSshCertificate) && (k2 instanceof OpenSshCertificate)) {
            return compareOpenSSHCertificateKeys(OpenSshCertificate.class.cast(k1), OpenSshCertificate.class.cast(k2));
        } else {
            return false; // either key is null or not of same class
```

## RuleId[id=UnnecessaryStringEscape]
### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `sshd-common/src/main/java/org/apache/sshd/common/file/util/BaseFileSystem.java`
#### Snippet
```java
                break;
            default:
                throw new UnsupportedOperationException("Unsupported path matcher syntax: \'" + syntax + "\'");
        }
        if (log.isTraceEnabled()) {
```

### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `sshd-common/src/main/java/org/apache/sshd/common/file/util/BaseFileSystem.java`
#### Snippet
```java
                break;
            default:
                throw new UnsupportedOperationException("Unsupported path matcher syntax: \'" + syntax + "\'");
        }
        if (log.isTraceEnabled()) {
```

## RuleId[id=AssignmentToStaticFieldFromInstanceMethod]
### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `library` from instance context
in `sshd-core/src/main/java/org/apache/sshd/agent/unix/AprLibrary.java`
#### Snippet
```java
    @SuppressWarnings({ "checkstyle:NoFinalizer", "deprecation" })
    protected void finalize() throws Throwable {
        library = null;
        Pool.destroy(pool);
        Library.terminate();
```

## RuleId[id=CStyleArrayDeclaration]
### CStyleArrayDeclaration
C-style array declaration of local variable `hashed_bytes`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/openssh/kdf/BCrypt.java`
#### Snippet
```java
   */
  public static boolean checkpw(String plaintext, String hashed) {
      byte hashed_bytes[];
      byte try_bytes[];
      try {
```

### CStyleArrayDeclaration
C-style array declaration of local variable `try_bytes`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/openssh/kdf/BCrypt.java`
#### Snippet
```java
  public static boolean checkpw(String plaintext, String hashed) {
      byte hashed_bytes[];
      byte try_bytes[];
      try {
          String try_pw = hashpw(plaintext, hashed);
```

### CStyleArrayDeclaration
C-style array declaration of parameter `key`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/openssh/kdf/BCrypt.java`
#### Snippet
```java
   * @param key   an array containing the key
   */
  private void key(byte key[]) {
      int i;
      int koffp[] = { 0 };
```

### CStyleArrayDeclaration
C-style array declaration of local variable `koffp`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/openssh/kdf/BCrypt.java`
#### Snippet
```java
  private void key(byte key[]) {
      int i;
      int koffp[] = { 0 };
      int lr[] = { 0, 0 };
      int plen = P.length, slen = S.length;
```

### CStyleArrayDeclaration
C-style array declaration of local variable `lr`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/openssh/kdf/BCrypt.java`
#### Snippet
```java
      int i;
      int koffp[] = { 0 };
      int lr[] = { 0, 0 };
      int plen = P.length, slen = S.length;

```

### CStyleArrayDeclaration
C-style array declaration of field `index_64`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/openssh/kdf/BCrypt.java`
#### Snippet
```java

  // Table for Base64 decoding
  static private final byte index_64[] = {
      -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
      -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
```

### CStyleArrayDeclaration
C-style array declaration of field `base64_code`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/openssh/kdf/BCrypt.java`
#### Snippet
```java

  // Table for Base64 encoding
  static private final char base64_code[] = {
      '.', '/', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
      'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V',
```

### CStyleArrayDeclaration
C-style array declaration of field `P_orig`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/openssh/kdf/BCrypt.java`
#### Snippet
```java

  // Initial contents of key schedule
  private static final int P_orig[] = {
      0x243f6a88, 0x85a308d3, 0x13198a2e, 0x03707344,
      0xa4093822, 0x299f31d0, 0x082efa98, 0xec4e6c89,
```

### CStyleArrayDeclaration
C-style array declaration of parameter `password`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/openssh/kdf/BCrypt.java`
#### Snippet
```java
   * @return  an array containing the binary hashed password
   */
  public byte[] crypt_raw(byte password[], byte salt[], int log_rounds,
      int cdata[]) {
      int rounds, i, j;
```

### CStyleArrayDeclaration
C-style array declaration of parameter `salt`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/openssh/kdf/BCrypt.java`
#### Snippet
```java
   * @return  an array containing the binary hashed password
   */
  public byte[] crypt_raw(byte password[], byte salt[], int log_rounds,
      int cdata[]) {
      int rounds, i, j;
```

### CStyleArrayDeclaration
C-style array declaration of parameter `cdata`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/openssh/kdf/BCrypt.java`
#### Snippet
```java
   */
  public byte[] crypt_raw(byte password[], byte salt[], int log_rounds,
      int cdata[]) {
      int rounds, i, j;
      int clen = cdata.length;
```

### CStyleArrayDeclaration
C-style array declaration of local variable `ret`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/openssh/kdf/BCrypt.java`
#### Snippet
```java
      int rounds, i, j;
      int clen = cdata.length;
      byte ret[];

      if (log_rounds < 4 || log_rounds > 30)
```

### CStyleArrayDeclaration
C-style array declaration of parameter `lr`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/openssh/kdf/BCrypt.java`
#### Snippet
```java
   * @param off   the position in the array of the blocks
   */
  private final void encipher(int lr[], int off) {
      int i, n, l = lr[off], r = lr[off + 1];

```

### CStyleArrayDeclaration
C-style array declaration of parameter `d`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/openssh/kdf/BCrypt.java`
#### Snippet
```java
   * @exception IllegalArgumentException if the length is invalid
   */
  private static String encode_base64(byte d[], int len)
      throws IllegalArgumentException {
      int off = 0;
```

### CStyleArrayDeclaration
C-style array declaration of parameter `data`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/openssh/kdf/BCrypt.java`
#### Snippet
```java
   * @param key   password information
   */
  private void ekskey(byte data[], byte key[]) {
      int i;
      int koffp[] = { 0 }, doffp[] = { 0 };
```

### CStyleArrayDeclaration
C-style array declaration of parameter `key`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/openssh/kdf/BCrypt.java`
#### Snippet
```java
   * @param key   password information
   */
  private void ekskey(byte data[], byte key[]) {
      int i;
      int koffp[] = { 0 }, doffp[] = { 0 };
```

### CStyleArrayDeclaration
C-style array declaration of local variable `koffp`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/openssh/kdf/BCrypt.java`
#### Snippet
```java
  private void ekskey(byte data[], byte key[]) {
      int i;
      int koffp[] = { 0 }, doffp[] = { 0 };
      int lr[] = { 0, 0 };
      int plen = P.length, slen = S.length;
```

### CStyleArrayDeclaration
C-style array declaration of local variable `doffp`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/openssh/kdf/BCrypt.java`
#### Snippet
```java
  private void ekskey(byte data[], byte key[]) {
      int i;
      int koffp[] = { 0 }, doffp[] = { 0 };
      int lr[] = { 0, 0 };
      int plen = P.length, slen = S.length;
```

### CStyleArrayDeclaration
C-style array declaration of local variable `lr`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/openssh/kdf/BCrypt.java`
#### Snippet
```java
      int i;
      int koffp[] = { 0 }, doffp[] = { 0 };
      int lr[] = { 0, 0 };
      int plen = P.length, slen = S.length;

```

### CStyleArrayDeclaration
C-style array declaration of local variable `rnd`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/openssh/kdf/BCrypt.java`
#### Snippet
```java
  public static String gensalt(int log_rounds, SecureRandom random) {
      StringBuffer rs = new StringBuffer();
      byte rnd[] = new byte[BCRYPT_SALT_LEN];

      random.nextBytes(rnd);
```

### CStyleArrayDeclaration
C-style array declaration of field `bf_crypt_ciphertext`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/openssh/kdf/BCrypt.java`
#### Snippet
```java
  // this "ciphertext", but it is really plaintext or an IV. We keep
  // the name to make code comparison easier.
  static private final int bf_crypt_ciphertext[] = {
      0x4f727068, 0x65616e42, 0x65686f6c,
      0x64657253, 0x63727944, 0x6f756274
```

### CStyleArrayDeclaration
C-style array declaration of local variable `passwordb`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/openssh/kdf/BCrypt.java`
#### Snippet
```java
      BCrypt B;
      String real_salt;
      byte passwordb[], saltb[], hashed[];
      char minor = (char)0;
      int rounds, off = 0;
```

### CStyleArrayDeclaration
C-style array declaration of local variable `saltb`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/openssh/kdf/BCrypt.java`
#### Snippet
```java
      BCrypt B;
      String real_salt;
      byte passwordb[], saltb[], hashed[];
      char minor = (char)0;
      int rounds, off = 0;
```

### CStyleArrayDeclaration
C-style array declaration of local variable `hashed`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/openssh/kdf/BCrypt.java`
#### Snippet
```java
      BCrypt B;
      String real_salt;
      byte passwordb[], saltb[], hashed[];
      char minor = (char)0;
      int rounds, off = 0;
```

### CStyleArrayDeclaration
C-style array declaration of parameter `data`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/openssh/kdf/BCrypt.java`
#### Snippet
```java
   * @return  the next word of material from data
   */
  private static int streamtoword(byte data[], int offp[]) {
      int i;
      int word = 0;
```

### CStyleArrayDeclaration
C-style array declaration of parameter `offp`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/openssh/kdf/BCrypt.java`
#### Snippet
```java
   * @return  the next word of material from data
   */
  private static int streamtoword(byte data[], int offp[]) {
      int i;
      int word = 0;
```

### CStyleArrayDeclaration
C-style array declaration of local variable `ret`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/openssh/kdf/BCrypt.java`
#### Snippet
```java
      StringBuffer rs = new StringBuffer();
      int off = 0, slen = s.length(), olen = 0;
      byte ret[];
      byte c1, c2, c3, c4, o;

```

### CStyleArrayDeclaration
C-style array declaration of field `S`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/openssh/kdf/BCrypt.java`
#### Snippet
```java
  // Expanded Blowfish key
  private int P[];
  private int S[];

  /**
```

### CStyleArrayDeclaration
C-style array declaration of field `S_orig`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/openssh/kdf/BCrypt.java`
#### Snippet
```java
      0x9216d5d9, 0x8979fb1b
  };
  private static final int S_orig[] = {
      0xd1310ba6, 0x98dfb5ac, 0x2ffd72db, 0xd01adfb7,
      0xb8e1afed, 0x6a267e96, 0xba7c9045, 0xf12c7f99,
```

### CStyleArrayDeclaration
C-style array declaration of field `P`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/openssh/kdf/BCrypt.java`
#### Snippet
```java

  // Expanded Blowfish key
  private int P[];
  private int S[];

```

## RuleId[id=ObsoleteCollection]
### ObsoleteCollection
Obsolete collection type `Hashtable<>` used
in `sshd-ldap/src/main/java/org/apache/sshd/ldap/LdapNetworkConnector.java`
#### Snippet
```java
            throws NamingException {
        Map<String, ?> ldapConfig = setupDirContextEnvironment(queryContext, env, username, password);
        return new InitialDirContext(new Hashtable<>(ldapConfig));
    }

```

## RuleId[id=KeySetIterationMayUseEntrySet]
### KeySetIterationMayUseEntrySet
Iteration over `mina.keySet()` may be replaced with 'entrySet()' iteration
in `sshd-mina/src/main/java/org/apache/sshd/mina/MinaService.java`
#### Snippet
```java
        Map<Long, IoSession> mina = new HashMap<>(managedMap);
        Map<Long, org.apache.sshd.common.io.IoSession> sessions = new HashMap<>(mina.size());
        for (Long id : mina.keySet()) {
            // Avoid possible NPE if the MinaSession hasn't been created yet
            IoSession minaSession = mina.get(id);
```

## RuleId[id=DuplicateBranchesInSwitch]
### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/server/AbstractSftpSubsystemHelper.java`
#### Snippet
```java
                    break;
                case IoUtils.GROUPID_VIEW_ATTR:
                    view = "unix";
                    break;
                case IoUtils.OWNER_VIEW_ATTR:
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/server/AbstractSftpSubsystemHelper.java`
#### Snippet
```java
                    break;
                case IoUtils.LASTMOD_TIME_VIEW_ATTR:
                    view = "basic";
                    break;
                case IoUtils.LASTACC_TIME_VIEW_ATTR:
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/server/AbstractSftpSubsystemHelper.java`
#### Snippet
```java
                    break;
                case IoUtils.LASTACC_TIME_VIEW_ATTR:
                    view = "basic";
                    break;
                case IoUtils.EXTENDED_VIEW_ATTR:
```

## RuleId[id=UnnecessaryQualifierForThis]
### UnnecessaryQualifierForThis
Qualifier `AbstractInnerCloseable` on 'super' is unnecessary in this context
in `sshd-common/src/main/java/org/apache/sshd/common/util/closeable/AbstractInnerCloseable.java`
#### Snippet
```java
    protected final void doCloseImmediately() {
        Closeable innerCloser = getInnerCloseable();
        innerCloser.close(true).addListener(future -> AbstractInnerCloseable.super.doCloseImmediately());
    }
}
```

### UnnecessaryQualifierForThis
Qualifier `AbstractCloseable` on 'this' is unnecessary in this context
in `sshd-common/src/main/java/org/apache/sshd/common/util/closeable/AbstractCloseable.java`
#### Snippet
```java
                            doCloseImmediately();
                            if (debugEnabled) {
                                log.debug("close({}][Graceful] - operationComplete() closed", AbstractCloseable.this);
                            }
                        }
```

### UnnecessaryQualifierForThis
Qualifier `NettyIoSession` on 'this' is unnecessary in this context
in `sshd-netty/src/main/java/org/apache/sshd/netty/NettyIoSession.java`
#### Snippet
```java

    protected void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        handler.exceptionCaught(NettyIoSession.this, cause);
    }

```

### UnnecessaryQualifierForThis
Qualifier `NettyIoSession` on 'this' is unnecessary in this context
in `sshd-netty/src/main/java/org/apache/sshd/netty/NettyIoSession.java`
#### Snippet
```java

    protected void channelRead(ChannelHandlerContext ctx, Readable msg) throws Exception {
        handler.messageReceived(NettyIoSession.this, msg);
    }

```

### UnnecessaryQualifierForThis
Qualifier `NettyIoSession` on 'this' is unnecessary in this context
in `sshd-netty/src/main/java/org/apache/sshd/netty/NettyIoSession.java`
#### Snippet
```java
        Channel channel = ctx.channel();
        service.channelGroup.add(channel);
        service.sessions.put(id, NettyIoSession.this);
        prev = context.newPromise().setSuccess();
        remoteAddr = channel.remoteAddress();
```

### UnnecessaryQualifierForThis
Qualifier `NettyIoSession` on 'this' is unnecessary in this context
in `sshd-netty/src/main/java/org/apache/sshd/netty/NettyIoSession.java`
#### Snippet
```java
        IoConnectFuture future = connectFuture.get();
        try {
            handler.sessionCreated(NettyIoSession.this);
            if (future != null) {
                future.setSession(NettyIoSession.this);
```

### UnnecessaryQualifierForThis
Qualifier `NettyIoSession` on 'this' is unnecessary in this context
in `sshd-netty/src/main/java/org/apache/sshd/netty/NettyIoSession.java`
#### Snippet
```java
            handler.sessionCreated(NettyIoSession.this);
            if (future != null) {
                future.setSession(NettyIoSession.this);
            }
        } catch (Throwable e) {
```

### UnnecessaryQualifierForThis
Qualifier `NettyIoSession` on 'this' is unnecessary in this context
in `sshd-netty/src/main/java/org/apache/sshd/netty/NettyIoSession.java`
#### Snippet
```java
        service.sessions.remove(id);
        try {
            handler.sessionClosed(NettyIoSession.this);
        } catch (MissingAttachedSessionException e) {
            // handler.sessionClosed() is supposed to close the attached SSH session. If there isn't one,
```

### UnnecessaryQualifierForThis
Qualifier `AgentServerProxy` on 'this' is unnecessary in this context
in `sshd-core/src/main/java/org/apache/sshd/agent/unix/AgentServerProxy.java`
#### Snippet
```java
                            }

                            Session session = AgentServerProxy.this.service.getSession();
                            Socket.timeoutSet(clientSock,
                                    CoreModuleProperties.AUTH_SOCKET_TIMEOUT.getRequired(session).toMillis() * 1000);
```

### UnnecessaryQualifierForThis
Qualifier `AgentServerProxy` on 'this' is unnecessary in this context
in `sshd-core/src/main/java/org/apache/sshd/agent/unix/AgentServerProxy.java`
#### Snippet
```java
                            String channelType = CoreModuleProperties.PROXY_CHANNEL_TYPE.getRequired(session);
                            AgentForwardedChannel channel = new AgentForwardedChannel(clientSock, channelType);
                            AgentServerProxy.this.service.registerChannel(channel);
                            channel.open().verify(CoreModuleProperties.CHANNEL_OPEN_TIMEOUT.getRequired(session));
                        } catch (Exception e) {
```

### UnnecessaryQualifierForThis
Qualifier `AbstractClientChannel` on 'this' is unnecessary in this context
in `sshd-core/src/main/java/org/apache/sshd/client/channel/AbstractClientChannel.java`
#### Snippet
```java
        addChannelSignalRequestHandlers(event -> {
            if (log.isDebugEnabled()) {
                log.debug("notifyEvent({}): {}", AbstractClientChannel.this, event);
            }
            notifyStateChanged(event);
```

### UnnecessaryQualifierForThis
Qualifier `AbstractChannel` on 'this' is unnecessary in this context
in `sshd-core/src/main/java/org/apache/sshd/common/channel/AbstractChannel.java`
#### Snippet
```java
                .run(toString(), () -> {
                    if (service != null) {
                        service.unregisterChannel(AbstractChannel.this);
                    }
                }).build();
```

### UnnecessaryQualifierForThis
Qualifier `AbstractConnectionService` on 'this' is unnecessary in this context
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/AbstractConnectionService.java`
#### Snippet
```java
                    } else {
                        log.warn("operationComplete({}) no exception on closed future={}",
                                AbstractConnectionService.this, future);
                    }

```

### UnnecessaryQualifierForThis
Qualifier `AbstractConnectionService` on 'this' is unnecessary in this context
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/AbstractConnectionService.java`
#### Snippet
```java
            } catch (IOException e) {
                warn("operationComplete({}) {}: {}",
                        AbstractConnectionService.this, e.getClass().getSimpleName(), e.getMessage(), e);
                session.exceptionCaught(e);
            }
```

### UnnecessaryQualifierForThis
Qualifier `ChannelSession` on 'this' is unnecessary in this context
in `sshd-core/src/main/java/org/apache/sshd/server/channel/ChannelSession.java`
#### Snippet
```java
                if (log.isDebugEnabled()) {
                    log.debug("onExit({}) code={} message='{}' shell closed",
                            ChannelSession.this, exitValue, exitMessage);
                }
            } catch (IOException e) {
```

### UnnecessaryQualifierForThis
Qualifier `ChannelSession` on 'this' is unnecessary in this context
in `sshd-core/src/main/java/org/apache/sshd/server/channel/ChannelSession.java`
#### Snippet
```java
            } catch (IOException e) {
                log.warn("onExit({}) code={} message='{}' {} closing shell: {}",
                        ChannelSession.this, exitValue, exitMessage, e.getClass().getSimpleName(), e.getMessage());
            }
        });
```

### UnnecessaryQualifierForThis
Qualifier `AbstractSession` on 'this' is unnecessary in this context
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/AbstractSession.java`
#### Snippet
```java
            t.initCause(e);
            if (log.isDebugEnabled()) {
                log.debug("writePacket({}): {}", AbstractSession.this, t.getMessage());
            }
            timedOut.setValue(t);
```

### UnnecessaryQualifierForThis
Qualifier `AbstractSession` on 'this' is unnecessary in this context
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/AbstractSession.java`
#### Snippet
```java
            Throwable t = new TimeoutException("Timeout writing packet: " + timeout + " " + unit);
            if (log.isDebugEnabled()) {
                log.debug("writePacket({}): {}", AbstractSession.this, t.getMessage());
            }
            future.setValue(t);
```

### UnnecessaryQualifierForThis
Qualifier `SessionHelper` on 'this' is unnecessary in this context
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/SessionHelper.java`
#### Snippet
```java
                if (debugEnabled) {
                    log.debug("disconnect({}) operation successfully completed for reason={} [{}]",
                            SessionHelper.this, SshConstants.getDisconnectReasonName(reason), msg);
                }
            } else {
```

### UnnecessaryQualifierForThis
Qualifier `SessionHelper` on 'this' is unnecessary in this context
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/SessionHelper.java`
#### Snippet
```java
                if (debugEnabled) {
                    debug("disconnect({}) operation failed ({}) for reason={} [{}]: {}",
                            SessionHelper.this, t.getClass().getSimpleName(),
                            SshConstants.getDisconnectReasonName(reason), msg, t.getMessage(), t);
                }
```

## RuleId[id=FinalPrivateMethod]
### FinalPrivateMethod
'private' method declared `final`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/openssh/kdf/BCrypt.java`
#### Snippet
```java
   * @param off   the position in the array of the blocks
   */
  private final void encipher(int lr[], int off) {
      int i, n, l = lr[off], r = lr[off + 1];

```

## RuleId[id=OctalLiteral]
### OctalLiteral
Octal integer `0000040`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/common/SftpConstants.java`
#### Snippet
```java
    public static final int S_IWUSR = 0000200;
    public static final int S_IXUSR = 0000100;
    public static final int S_IRGRP = 0000040;
    public static final int S_IWGRP = 0000020;
    public static final int S_IXGRP = 0000010;
```

### OctalLiteral
Octal integer `0000002`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/common/SftpConstants.java`
#### Snippet
```java
    public static final int S_IXGRP = 0000010;
    public static final int S_IROTH = 0000004;
    public static final int S_IWOTH = 0000002;
    public static final int S_IXOTH = 0000001;

```

### OctalLiteral
Octal integer `0060000`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/common/SftpConstants.java`
#### Snippet
```java
    public static final int S_IFLNK = 0120000; // symbolic link
    public static final int S_IFREG = 0100000; // regular file
    public static final int S_IFBLK = 0060000; // block device
    public static final int S_IFDIR = 0040000; // directory
    public static final int S_IFCHR = 0020000; // character device
```

### OctalLiteral
Octal integer `0140000`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/common/SftpConstants.java`
#### Snippet
```java

    public static final int S_IFMT = 0170000; // bitmask for the file type bitfields
    public static final int S_IFSOCK = 0140000; // socket
    public static final int S_IFLNK = 0120000; // symbolic link
    public static final int S_IFREG = 0100000; // regular file
```

### OctalLiteral
Octal integer `0000200`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/common/SftpConstants.java`
#### Snippet
```java
    public static final int S_ISVTX = 0001000; // sticky bit
    public static final int S_IRUSR = 0000400;
    public static final int S_IWUSR = 0000200;
    public static final int S_IXUSR = 0000100;
    public static final int S_IRGRP = 0000040;
```

### OctalLiteral
Octal integer `0100000`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/common/SftpConstants.java`
#### Snippet
```java
    public static final int S_IFSOCK = 0140000; // socket
    public static final int S_IFLNK = 0120000; // symbolic link
    public static final int S_IFREG = 0100000; // regular file
    public static final int S_IFBLK = 0060000; // block device
    public static final int S_IFDIR = 0040000; // directory
```

### OctalLiteral
Octal integer `0001000`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/common/SftpConstants.java`
#### Snippet
```java
    public static final int S_ISUID = 0004000; // set UID bit
    public static final int S_ISGID = 0002000; // set GID bit
    public static final int S_ISVTX = 0001000; // sticky bit
    public static final int S_IRUSR = 0000400;
    public static final int S_IWUSR = 0000200;
```

### OctalLiteral
Octal integer `0120000`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/common/SftpConstants.java`
#### Snippet
```java
    public static final int S_IFMT = 0170000; // bitmask for the file type bitfields
    public static final int S_IFSOCK = 0140000; // socket
    public static final int S_IFLNK = 0120000; // symbolic link
    public static final int S_IFREG = 0100000; // regular file
    public static final int S_IFBLK = 0060000; // block device
```

### OctalLiteral
Octal integer `0000004`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/common/SftpConstants.java`
#### Snippet
```java
    public static final int S_IWGRP = 0000020;
    public static final int S_IXGRP = 0000010;
    public static final int S_IROTH = 0000004;
    public static final int S_IWOTH = 0000002;
    public static final int S_IXOTH = 0000001;
```

### OctalLiteral
Octal integer `0010000`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/common/SftpConstants.java`
#### Snippet
```java
    public static final int S_IFDIR = 0040000; // directory
    public static final int S_IFCHR = 0020000; // character device
    public static final int S_IFIFO = 0010000; // fifo
    public static final int S_ISUID = 0004000; // set UID bit
    public static final int S_ISGID = 0002000; // set GID bit
```

### OctalLiteral
Octal integer `0020000`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/common/SftpConstants.java`
#### Snippet
```java
    public static final int S_IFBLK = 0060000; // block device
    public static final int S_IFDIR = 0040000; // directory
    public static final int S_IFCHR = 0020000; // character device
    public static final int S_IFIFO = 0010000; // fifo
    public static final int S_ISUID = 0004000; // set UID bit
```

### OctalLiteral
Octal integer `0000100`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/common/SftpConstants.java`
#### Snippet
```java
    public static final int S_IRUSR = 0000400;
    public static final int S_IWUSR = 0000200;
    public static final int S_IXUSR = 0000100;
    public static final int S_IRGRP = 0000040;
    public static final int S_IWGRP = 0000020;
```

### OctalLiteral
Octal integer `0000010`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/common/SftpConstants.java`
#### Snippet
```java
    public static final int S_IRGRP = 0000040;
    public static final int S_IWGRP = 0000020;
    public static final int S_IXGRP = 0000010;
    public static final int S_IROTH = 0000004;
    public static final int S_IWOTH = 0000002;
```

### OctalLiteral
Octal integer `0004000`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/common/SftpConstants.java`
#### Snippet
```java
    public static final int S_IFCHR = 0020000; // character device
    public static final int S_IFIFO = 0010000; // fifo
    public static final int S_ISUID = 0004000; // set UID bit
    public static final int S_ISGID = 0002000; // set GID bit
    public static final int S_ISVTX = 0001000; // sticky bit
```

### OctalLiteral
Octal integer `0170000`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/common/SftpConstants.java`
#### Snippet
```java
    public static final int ACE4_SYNCHRONIZE = 0x00100000;

    public static final int S_IFMT = 0170000; // bitmask for the file type bitfields
    public static final int S_IFSOCK = 0140000; // socket
    public static final int S_IFLNK = 0120000; // symbolic link
```

### OctalLiteral
Octal integer `0000001`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/common/SftpConstants.java`
#### Snippet
```java
    public static final int S_IROTH = 0000004;
    public static final int S_IWOTH = 0000002;
    public static final int S_IXOTH = 0000001;

    public static final int SFTP_V3 = 3;
```

### OctalLiteral
Octal integer `0002000`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/common/SftpConstants.java`
#### Snippet
```java
    public static final int S_IFIFO = 0010000; // fifo
    public static final int S_ISUID = 0004000; // set UID bit
    public static final int S_ISGID = 0002000; // set GID bit
    public static final int S_ISVTX = 0001000; // sticky bit
    public static final int S_IRUSR = 0000400;
```

### OctalLiteral
Octal integer `0000400`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/common/SftpConstants.java`
#### Snippet
```java
    public static final int S_ISGID = 0002000; // set GID bit
    public static final int S_ISVTX = 0001000; // sticky bit
    public static final int S_IRUSR = 0000400;
    public static final int S_IWUSR = 0000200;
    public static final int S_IXUSR = 0000100;
```

### OctalLiteral
Octal integer `0000020`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/common/SftpConstants.java`
#### Snippet
```java
    public static final int S_IXUSR = 0000100;
    public static final int S_IRGRP = 0000040;
    public static final int S_IWGRP = 0000020;
    public static final int S_IXGRP = 0000010;
    public static final int S_IROTH = 0000004;
```

### OctalLiteral
Octal integer `0040000`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/common/SftpConstants.java`
#### Snippet
```java
    public static final int S_IFREG = 0100000; // regular file
    public static final int S_IFBLK = 0060000; // block device
    public static final int S_IFDIR = 0040000; // directory
    public static final int S_IFCHR = 0020000; // character device
    public static final int S_IFIFO = 0010000; // fifo
```

### OctalLiteral
Octal integer `0000100`
in `sshd-scp/src/main/java/org/apache/sshd/scp/common/helpers/ScpPathCommandDetailsSupport.java`
#### Snippet
```java
    public static final int S_IRUSR = 0000400;
    public static final int S_IWUSR = 0000200;
    public static final int S_IXUSR = 0000100;
    public static final int S_IRGRP = 0000040;
    public static final int S_IWGRP = 0000020;
```

### OctalLiteral
Octal integer `0000001`
in `sshd-scp/src/main/java/org/apache/sshd/scp/common/helpers/ScpPathCommandDetailsSupport.java`
#### Snippet
```java
    public static final int S_IROTH = 0000004;
    public static final int S_IWOTH = 0000002;
    public static final int S_IXOTH = 0000001;

    private Set<PosixFilePermission> permissions;
```

### OctalLiteral
Octal integer `0000020`
in `sshd-scp/src/main/java/org/apache/sshd/scp/common/helpers/ScpPathCommandDetailsSupport.java`
#### Snippet
```java
    public static final int S_IXUSR = 0000100;
    public static final int S_IRGRP = 0000040;
    public static final int S_IWGRP = 0000020;
    public static final int S_IXGRP = 0000010;
    public static final int S_IROTH = 0000004;
```

### OctalLiteral
Octal integer `0000040`
in `sshd-scp/src/main/java/org/apache/sshd/scp/common/helpers/ScpPathCommandDetailsSupport.java`
#### Snippet
```java
    public static final int S_IWUSR = 0000200;
    public static final int S_IXUSR = 0000100;
    public static final int S_IRGRP = 0000040;
    public static final int S_IWGRP = 0000020;
    public static final int S_IXGRP = 0000010;
```

### OctalLiteral
Octal integer `0000004`
in `sshd-scp/src/main/java/org/apache/sshd/scp/common/helpers/ScpPathCommandDetailsSupport.java`
#### Snippet
```java
    public static final int S_IWGRP = 0000020;
    public static final int S_IXGRP = 0000010;
    public static final int S_IROTH = 0000004;
    public static final int S_IWOTH = 0000002;
    public static final int S_IXOTH = 0000001;
```

### OctalLiteral
Octal integer `0000400`
in `sshd-scp/src/main/java/org/apache/sshd/scp/common/helpers/ScpPathCommandDetailsSupport.java`
#### Snippet
```java
public abstract class ScpPathCommandDetailsSupport extends AbstractScpCommandDetails implements NamedResource {
    // File permissions masks
    public static final int S_IRUSR = 0000400;
    public static final int S_IWUSR = 0000200;
    public static final int S_IXUSR = 0000100;
```

### OctalLiteral
Octal integer `0000002`
in `sshd-scp/src/main/java/org/apache/sshd/scp/common/helpers/ScpPathCommandDetailsSupport.java`
#### Snippet
```java
    public static final int S_IXGRP = 0000010;
    public static final int S_IROTH = 0000004;
    public static final int S_IWOTH = 0000002;
    public static final int S_IXOTH = 0000001;

```

### OctalLiteral
Octal integer `0000010`
in `sshd-scp/src/main/java/org/apache/sshd/scp/common/helpers/ScpPathCommandDetailsSupport.java`
#### Snippet
```java
    public static final int S_IRGRP = 0000040;
    public static final int S_IWGRP = 0000020;
    public static final int S_IXGRP = 0000010;
    public static final int S_IROTH = 0000004;
    public static final int S_IWOTH = 0000002;
```

### OctalLiteral
Octal integer `0000200`
in `sshd-scp/src/main/java/org/apache/sshd/scp/common/helpers/ScpPathCommandDetailsSupport.java`
#### Snippet
```java
    // File permissions masks
    public static final int S_IRUSR = 0000400;
    public static final int S_IWUSR = 0000200;
    public static final int S_IXUSR = 0000100;
    public static final int S_IRGRP = 0000040;
```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`repl.length() == 0` can be replaced with 'repl.isEmpty()'
in `sshd-common/src/main/java/org/apache/sshd/common/util/GenericUtils.java`
#### Snippet
```java
    @SuppressWarnings("PMD.AssignmentInOperand")
    public static String replace(String text, String repl, String with, int max) {
        if ((text == null) || (repl == null) || (with == null) || (repl.length() == 0)) {
            return text;
        }
```

### SizeReplaceableByIsEmpty
`data.length() > 0` can be replaced with '!data.isEmpty()'
in `sshd-common/src/main/java/org/apache/sshd/common/util/buffer/Buffer.java`
#### Snippet
```java
                if (dataBuffer.available() > 0) {
                    data = GenericUtils.trimToEmpty(dataBuffer.getString(charset));
                    data = data.length() > 0 ? data : null;
                }
                list.add(new OpenSshCertificate.CertificateOption(name, data));
```

### SizeReplaceableByIsEmpty
`l.length() > 0` can be replaced with '!l.isEmpty()'
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/KeyRandomArt.java`
#### Snippet
```java
            for (int index = 0; index < lines.length; index++) {
                String l = lines[index];
                if ((l.length() > 0) && (l.charAt(l.length() - 1) == '\r')) {
                    l = l.substring(0, l.length() - 1);
                    lines[index] = l;
```

### SizeReplaceableByIsEmpty
`override.length() == 0` can be replaced with 'override.isEmpty()'
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/server/AbstractSftpSubsystemHelper.java`
#### Snippet
```java
        }

        if (override.length() == 0) {
            return Collections.emptySet();
        }
```

## RuleId[id=NonShortCircuitBoolean]
### NonShortCircuitBoolean
Non-short-circuit boolean expression `replaceExisting |= opt == StandardCopyOption.REPLACE_EXISTING`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/client/fs/SftpFileSystemProvider.java`
#### Snippet
```java
        boolean noFollowLinks = false;
        for (CopyOption opt : options) {
            replaceExisting |= opt == StandardCopyOption.REPLACE_EXISTING;
            copyAttributes |= opt == StandardCopyOption.COPY_ATTRIBUTES;
            noFollowLinks |= opt == LinkOption.NOFOLLOW_LINKS;
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `copyAttributes |= opt == StandardCopyOption.COPY_ATTRIBUTES`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/client/fs/SftpFileSystemProvider.java`
#### Snippet
```java
        for (CopyOption opt : options) {
            replaceExisting |= opt == StandardCopyOption.REPLACE_EXISTING;
            copyAttributes |= opt == StandardCopyOption.COPY_ATTRIBUTES;
            noFollowLinks |= opt == LinkOption.NOFOLLOW_LINKS;
        }
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `noFollowLinks |= opt == LinkOption.NOFOLLOW_LINKS`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/client/fs/SftpFileSystemProvider.java`
#### Snippet
```java
            replaceExisting |= opt == StandardCopyOption.REPLACE_EXISTING;
            copyAttributes |= opt == StandardCopyOption.COPY_ATTRIBUTES;
            noFollowLinks |= opt == LinkOption.NOFOLLOW_LINKS;
        }
        LinkOption[] linkOptions = IoUtils.getLinkOptions(!noFollowLinks);
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `replaceExisting |= opt == StandardCopyOption.REPLACE_EXISTING`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/client/fs/SftpFileSystemProvider.java`
#### Snippet
```java
        boolean noFollowLinks = false;
        for (CopyOption opt : options) {
            replaceExisting |= opt == StandardCopyOption.REPLACE_EXISTING;
            copyAttributes |= opt == StandardCopyOption.COPY_ATTRIBUTES;
            noFollowLinks |= opt == LinkOption.NOFOLLOW_LINKS;
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `copyAttributes |= opt == StandardCopyOption.COPY_ATTRIBUTES`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/client/fs/SftpFileSystemProvider.java`
#### Snippet
```java
        for (CopyOption opt : options) {
            replaceExisting |= opt == StandardCopyOption.REPLACE_EXISTING;
            copyAttributes |= opt == StandardCopyOption.COPY_ATTRIBUTES;
            noFollowLinks |= opt == LinkOption.NOFOLLOW_LINKS;
        }
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `noFollowLinks |= opt == LinkOption.NOFOLLOW_LINKS`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/client/fs/SftpFileSystemProvider.java`
#### Snippet
```java
            replaceExisting |= opt == StandardCopyOption.REPLACE_EXISTING;
            copyAttributes |= opt == StandardCopyOption.COPY_ATTRIBUTES;
            noFollowLinks |= opt == LinkOption.NOFOLLOW_LINKS;
        }
        LinkOption[] linkOptions = IoUtils.getLinkOptions(noFollowLinks);
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `writeState.windowExpanded |= resume`
in `sshd-core/src/main/java/org/apache/sshd/common/channel/ChannelAsyncOutputStream.java`
#### Snippet
```java
        State openState;
        synchronized (writeState) {
            writeState.windowExpanded |= resume;
            if (writeState.pendingWrite == null) {
                // Just set the flag if there's nothing to write, or a writePacket() call is in progress.
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `foundNoAuth |= authMethods[i] == 0`
in `sshd-core/src/main/java/org/apache/sshd/common/forward/SocksProxy.java`
#### Snippet
```java
                boolean foundNoAuth = false;
                for (int i = 0; i < nbAuthMethods; i++) {
                    foundNoAuth |= authMethods[i] == 0;
                }
                buffer = new ByteArrayBuffer(Byte.SIZE, false);
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `success |= l.isEmpty()`
in `sshd-core/src/main/java/org/apache/sshd/server/session/ServerUserAuthService.java`
#### Snippet
```java
            if ((GenericUtils.size(l) > 0) && l.get(0).equals(authMethod)) {
                l.remove(0);
                success |= l.isEmpty();
            }
        }
```

## RuleId[id=UnnecessaryReturn]
### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `sshd-common/src/main/java/org/apache/sshd/common/util/logging/SimplifiedLoggerSkeleton.java`
#### Snippet
```java
        @Override
        public void log(Level level, Object message, Throwable t) {
            return;
        }

```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `sshd-common/src/main/java/org/apache/sshd/common/util/logging/LoggingUtils.java`
#### Snippet
```java
    public static void logMessage(Logger logger, Level level, Object message, Throwable t) {
        if ((logger == null) || (level == null) || Level.OFF.equals(level)) {
            return;
        } else if (Level.SEVERE.equals(level)) {
            logger.error(Objects.toString(message), t);
```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/IdentityUtils.java`
#### Snippet
```java
            KeyPair prev = pairsMap.put(keyType, kp);
            if (prev != null) {
                return; // less of an offense if 2 pairs mapped to same key type
            }
        });
```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `sshd-common/src/main/java/org/apache/sshd/server/shell/TtyFilterOutputStream.java`
#### Snippet
```java
        } else if (ttyOptions.contains(PtyMode.IGNCR)) {
            // Ignore CR on input
            return;
        } else {
            writeRawOutput('\r');
```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `sshd-cli/src/main/java/org/apache/sshd/cli/CliSupport.java`
#### Snippet
```java
        if (GenericUtils.isNotEmpty(methods)) {
            manager.setUserAuthFactoriesNameList(methods);
            return;
        }
    }
```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `sshd-netty/src/main/java/org/apache/sshd/netty/NettyIoSession.java`
#### Snippet
```java
                    // arrives.
                    ioBuffer = buf;
                    return;
                } else {
                    // Second ByteBuf: copy the ioBuffer, release and null it. Then copy buf and release it.
```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `sshd-core/src/main/java/org/apache/sshd/common/channel/AbstractChannel.java`
#### Snippet
```java
            if (gracefulState.compareAndSet(GracefulState.Opened, GracefulState.CloseSent)) {
                // Waiting for CLOSE message to come back from the remote side
                return;
            } else if (gracefulState.compareAndSet(GracefulState.CloseReceived, GracefulState.Closed)) {
                gracefulFuture.setClosed();
```

## RuleId[id=FinalStaticMethod]
### FinalStaticMethod
'static' method declared `final`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/DESPrivateKeyObfuscator.java`
#### Snippet
```java
    }

    public static final PrivateKeyEncryptionContext resolveEffectiveContext(PrivateKeyEncryptionContext encContext) {
        if (encContext == null) {
            return null;
```

### FinalStaticMethod
'static' method declared `final`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/PrivateKeyEncryptionContext.java`
#### Snippet
```java
    }

    public static final <
            C extends PrivateKeyEncryptionContext> C initializeObfuscator(C context, PrivateKeyObfuscator o, String password) {
        context.setCipherName(o.getCipherName());
```

### FinalStaticMethod
'static' method declared `final`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/PrivateKeyEncryptionContext.java`
#### Snippet
```java
    }

    public static final PrivateKeyObfuscator getRegisteredPrivateKeyObfuscator(String cipherName) {
        if (GenericUtils.isEmpty(cipherName)) {
            return null;
```

### FinalStaticMethod
'static' method declared `final`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/PrivateKeyEncryptionContext.java`
#### Snippet
```java
     * @return         The updated context
     */
    public static final <C extends PrivateKeyEncryptionContext> C parseAlgorithmInfo(C context, String algInfo) {
        ValidateUtils.checkNotNullAndNotEmpty(algInfo, "No encryption algorithm data");

```

### FinalStaticMethod
'static' method declared `final`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/PrivateKeyEncryptionContext.java`
#### Snippet
```java
    }

    public static final List<PrivateKeyObfuscator> getRegisteredPrivateKeyObfuscators() {
        synchronized (OBFUSCATORS) {
            Collection<? extends PrivateKeyObfuscator> l = OBFUSCATORS.values();
```

### FinalStaticMethod
'static' method declared `final`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/PrivateKeyEncryptionContext.java`
#### Snippet
```java
    }

    public static final NavigableSet<String> getRegisteredPrivateKeyObfuscatorCiphers() {
        synchronized (OBFUSCATORS) {
            Collection<String> names = OBFUSCATORS.keySet();
```

### FinalStaticMethod
'static' method declared `final`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/PrivateKeyEncryptionContext.java`
#### Snippet
```java
    }

    public static final PrivateKeyEncryptionContext newPrivateKeyEncryptionContext(PrivateKeyObfuscator o, String password) {
        return initializeObfuscator(new PrivateKeyEncryptionContext(), o, password);
    }
```

### FinalStaticMethod
'static' method declared `final`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/pem/ECDSAPEMResourceKeyPairParser.java`
#### Snippet
```java
     * @throws IOException If failed to create the point
     */
    public static final ECPoint decodeECPublicKeyValue(DERParser parser) throws IOException {
        return decodeECPublicKeyValue(parser.readObject());
    }
```

### FinalStaticMethod
'static' method declared `final`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/pem/ECDSAPEMResourceKeyPairParser.java`
#### Snippet
```java
    }

    public static final ECPoint decodeECPublicKeyValue(ASN1Object dataObject) throws IOException {
        // see openssl asn1parse -inform PEM -in ...file... -dump
        if (dataObject == null) {
```

### FinalStaticMethod
'static' method declared `final`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/pem/ECDSAPEMResourceKeyPairParser.java`
#### Snippet
```java
    }

    public static final ECPoint decodeECPointData(ASN1Object pointData) throws IOException {
        if (pointData == null) {
            throw new StreamCorruptedException("Missing public key data parameter");
```

## RuleId[id=SuspiciousInvocationHandlerImplementation]
### SuspiciousInvocationHandlerImplementation
Null might be returned when proxying method 'equals()': this may cause NullPointerException
in `sshd-common/src/main/java/org/apache/sshd/common/util/EventListenerUtils.java`
#### Snippet
```java
            }

            return null; // we assume always void return value...
        });
    }
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends ClientIdentityProvider`
in `sshd-common/src/main/java/org/apache/sshd/client/config/keys/ClientIdentitiesWatcher.java`
#### Snippet
```java
    }

    public ClientIdentitiesWatcher(Collection<ClientIdentityProvider> providers) {
        this.providers = providers;
    }
```

### BoundedWildcard
Can generalize to `? extends HostPatternValue`
in `sshd-common/src/main/java/org/apache/sshd/client/config/hosts/HostPatternsHolder.java`
#### Snippet
```java
    }

    public static boolean isHostMatch(String host, int port, Collection<HostPatternValue> patterns) {
        if (GenericUtils.isEmpty(patterns)) {
            return false;
```

### BoundedWildcard
Can generalize to `? extends AttributeKey`
in `sshd-common/src/main/java/org/apache/sshd/common/AttributeRepository.java`
#### Snippet
```java
    }

    static AttributeRepository ofAttributesMap(Map<AttributeKey<?>, ?> attributes) {
        return new AttributeRepository() {
            @Override
```

### BoundedWildcard
Can generalize to `? extends Path`
in `sshd-common/src/main/java/org/apache/sshd/common/file/root/RootedFileSystemProvider.java`
#### Snippet
```java
    }

    protected Iterator<Path> root(RootedFileSystem rfs, Iterator<Path> iter) {
        return new Iterator<Path>() {
            @Override
```

### BoundedWildcard
Can generalize to `? extends T`
in `sshd-common/src/main/java/org/apache/sshd/common/util/GenericUtils.java`
#### Snippet
```java
    }

    public static <T> List<T> unmodifiableList(Stream<T> values) {
        return unmodifiableList(values.collect(Collectors.toList()));
    }
```

### BoundedWildcard
Can generalize to `? extends Closeable`
in `sshd-common/src/main/java/org/apache/sshd/common/util/closeable/Builder.java`
#### Snippet
```java
    }

    public Builder sequential(Object id, Iterable<Closeable> closeables) {
        return close(new SequentialCloseable(id, lock, closeables));
    }
```

### BoundedWildcard
Can generalize to `? extends OpenSshCertificate.CertificateOption`
in `sshd-common/src/main/java/org/apache/sshd/common/util/buffer/Buffer.java`
#### Snippet
```java
     * @param charset The {@link Charset} to use for string options
     */
    public void putCertificateOptions(List<OpenSshCertificate.CertificateOption> options, Charset charset) {
        int numObjects = GenericUtils.size(options);

```

### BoundedWildcard
Can generalize to `? super String`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/AuthorizedKeyEntry.java`
#### Snippet
```java
     * @throws IllegalStateException If a boolean option is re-specified
     */
    public static SimpleImmutableEntry<String, String> addLoginOption(Map<String, String> optsMap, String option) {
        String p = GenericUtils.trimToEmpty(option);
        if (GenericUtils.isEmpty(p)) {
```

### BoundedWildcard
Can generalize to `? super String`
in `sshd-common/src/main/java/org/apache/sshd/common/PropertyResolverUtils.java`
#### Snippet
```java
    }

    public static Object updateProperty(Map<String, Object> props, String name, Object value) {
        String key = ValidateUtils.checkNotNullAndNotEmpty(name, "No property name");
        if ((value == null) || ((value instanceof CharSequence) && GenericUtils.isEmpty((CharSequence) value))) {
```

### BoundedWildcard
Can generalize to `? extends E`
in `sshd-common/src/main/java/org/apache/sshd/common/PropertyResolverUtils.java`
#### Snippet
```java
     */
    public static <E extends Enum<E>> E toEnum(
            Class<E> enumType, Object value, boolean failIfNoMatch, Collection<E> available) {
        if (value == null) {
            return null;
```

### BoundedWildcard
Can generalize to `? extends E`
in `sshd-common/src/main/java/org/apache/sshd/common/PropertyResolverUtils.java`
#### Snippet
```java
     */
    public static <E extends Enum<E>> E toEnum(
            Class<E> enumType, Object value, boolean failIfNoMatch, Collection<E> available) {
        if (value == null) {
            return null;
```

### BoundedWildcard
Can generalize to `? super T`
in `sshd-common/src/main/java/org/apache/sshd/common/future/AbstractSshFuture.java`
#### Snippet
```java
    }

    protected void notifyListener(SshFutureListener<T> l) {
        try {
            T arg = asT();
```

### BoundedWildcard
Can generalize to `? extends Key`
in `sshd-openpgp/src/main/java/org/apache/sshd/openpgp/PGPPublicRingWatcher.java`
#### Snippet
```java

    protected NavigableMap<String, PublicKey> reloadRingKeys(
            SessionContext session, NamedResource resourceKey, Collection<Key> keys)
            throws IOException, GeneralSecurityException, PGPException {
        if (GenericUtils.isEmpty(keys)) {
```

### BoundedWildcard
Can generalize to `? super String`
in `sshd-ldap/src/main/java/org/apache/sshd/ldap/LdapNetworkConnector.java`
#### Snippet
```java

    @SuppressWarnings("unchecked")
    protected Object accumulateAttributeValue(C queryContext, Map<String, Object> attrsMap, String attrID, Object attrVal) {
        Object prev = attrsMap.put(attrID, attrVal);
        if (prev == null) {
```

### BoundedWildcard
Can generalize to `? extends NamedFactory`
in `sshd-cli/src/main/java/org/apache/sshd/cli/CliSupport.java`
#### Snippet
```java
    // returns null - e.g., re-specified or no supported cipher found
    public static List<NamedFactory<Cipher>> setupCiphers(
            String argName, String argVal, List<NamedFactory<Cipher>> current, PrintStream stderr) {
        if (GenericUtils.size(current) > 0) {
            CliLogger.showError(stderr, argName + " option value re-specified: " + NamedResource.getNames(current));
```

### BoundedWildcard
Can generalize to `? extends NamedFactory`
in `sshd-cli/src/main/java/org/apache/sshd/cli/CliSupport.java`
#### Snippet
```java

    public static List<NamedFactory<Compression>> setupCompressions(
            String argName, String argVal, List<NamedFactory<Compression>> current, PrintStream stderr) {
        if (GenericUtils.size(current) > 0) {
            CliLogger.showError(stderr, argName + " option value re-specified: " + NamedResource.getNames(current));
```

### BoundedWildcard
Can generalize to `? extends NamedFactory`
in `sshd-cli/src/main/java/org/apache/sshd/cli/CliSupport.java`
#### Snippet
```java

    public static List<NamedFactory<Mac>> setupMacs(
            String argName, String argVal, List<NamedFactory<Mac>> current, PrintStream stderr) {
        if (GenericUtils.size(current) > 0) {
            CliLogger.showError(stderr, argName + " option value re-specified: " + NamedResource.getNames(current));
```

### BoundedWildcard
Can generalize to `? extends Exception`
in `sshd-spring-sftp/src/main/java/org/apache/sshd/sftp/spring/integration/SpringSftpSession.java`
#### Snippet
```java
    }

    protected void closeSessionInstance(Callable<Exception> closer) throws Exception {
        if (closer == null) {
            return;
```

### BoundedWildcard
Can generalize to `? super String`
in `sshd-cli/src/main/java/org/apache/sshd/cli/client/ScpCommandMain.java`
#### Snippet
```java

    private static void adjustRemoteTargetArguments(
            ScpLocation remote, ScpLocation source, ScpLocation target, Collection<String> effective) {
        int port = remote.resolvePort();
        if (port != SshConstants.DEFAULT_PORT) {
```

### BoundedWildcard
Can generalize to `? extends List`>
in `sshd-cli/src/main/java/org/apache/sshd/cli/client/SshKeyScanMain.java`
#### Snippet
```java
    protected void resolveServerKeys(
            SshClient client, String host,
            Map<String, List<KeyPair>> pairsMap, Map<String, List<NamedFactory<Signature>>> sigFactories)
            throws IOException {
        // Cannot use forEach because of the potential for throwing IOException by the invoked code
```

### BoundedWildcard
Can generalize to `? super Path`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/client/impl/SftpPathImpl.java`
#### Snippet
```java
     * @throws IOException if thrown by the {@code operation}
     */
    public <T> T withAttributeCache(IOFunction<Path, T> operation) throws IOException {
        cacheAttributes(true);
        try {
```

### BoundedWildcard
Can generalize to `? super Boolean`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/server/FileHandle.java`
#### Snippet
```java

    @SuppressWarnings("resource")
    public int read(byte[] data, int doff, int length, long offset, AtomicReference<Boolean> eof) throws IOException {
        SeekableByteChannel channel = getFileChannel();
        channel = channel.position(offset);
```

### BoundedWildcard
Can generalize to `? super Boolean`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/client/impl/AbstractSftpClient.java`
#### Snippet
```java
    }

    protected int checkDataResponse(SftpResponse response, int dstoff, byte[] dst, AtomicReference<Boolean> eofSignalled)
            throws IOException {
        switch (response.getType()) {
```

### BoundedWildcard
Can generalize to `? super Boolean`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/client/impl/AbstractSftpClient.java`
#### Snippet
```java
    }

    protected List<DirEntry> checkDirResponse(SftpResponse response, AtomicReference<Boolean> eolIndicator)
            throws IOException {
        if (eolIndicator != null) {
```

### BoundedWildcard
Can generalize to `? extends CloseableExecutorService`
in `sshd-core/src/main/java/org/apache/sshd/agent/unix/ChannelAgentForwardingFactory.java`
#### Snippet
```java
    }

    public ChannelAgentForwardingFactory(String name, Factory<CloseableExecutorService> executorServiceFactory) {
        this.name = ValidateUtils.checkNotNullAndNotEmpty(name, "No channel factory name specified");
        this.executorServiceFactory = executorServiceFactory;
```

### BoundedWildcard
Can generalize to `? extends HostConfigEntry`
in `sshd-core/src/main/java/org/apache/sshd/client/SshClient.java`
#### Snippet
```java

    protected ConnectFuture doConnect(
            HostConfigEntry hostConfig, List<HostConfigEntry> jumps,
            AttributeRepository context, SocketAddress localAddress)
            throws IOException {
```

### BoundedWildcard
Can generalize to `? super String`
in `sshd-core/src/main/java/org/apache/sshd/client/channel/AbstractClientChannel.java`
#### Snippet
```java
    }

    protected void addChannelSignalRequestHandlers(EventNotifier<String> notifier) {
        addRequestHandler(new ExitStatusChannelRequestHandler(exitStatusHolder, notifier));
        addRequestHandler(new ExitSignalChannelRequestHandler(exitSignalHolder, notifier));
```

### BoundedWildcard
Can generalize to `? extends HostEntryPair`
in `sshd-core/src/main/java/org/apache/sshd/client/keyverifier/KnownHostsServerKeyVerifier.java`
#### Snippet
```java

    protected HostEntryPair findKnownHostEntry(
            ClientSession clientSession, SocketAddress remoteAddress, Collection<HostEntryPair> knownHosts) {
        if (GenericUtils.isEmpty(knownHosts)) {
            return null;
```

### BoundedWildcard
Can generalize to `? super String`
in `sshd-core/src/main/java/org/apache/sshd/common/kex/extension/DefaultServerKexExtensionHandler.java`
#### Snippet
```java
     */
    @SuppressWarnings("javadoc")
    public void collectExtensions(Session session, KexPhase phase, BiConsumer<String, Object> marshaller) {
        if (phase == KexPhase.NEWKEYS) {
            Collection<String> algorithms = session.getSignatureFactoriesNames();
```

### BoundedWildcard
Can generalize to `? super ChannelListener`
in `sshd-core/src/main/java/org/apache/sshd/common/channel/AbstractChannel.java`
#### Snippet
```java
    }

    protected void invokeChannelSignaller(Invoker<ChannelListener, Void> invoker) throws Throwable {
        Session session = getSession();
        FactoryManager manager = (session == null) ? null : session.getFactoryManager();
```

### BoundedWildcard
Can generalize to `? super String`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/server/AbstractSftpSubsystemHelper.java`
#### Snippet
```java
    protected void handleSetFileAttributeFailure(
            Path file, String view, String attribute, Object value,
            Collection<String> unsupported, Exception e)
            throws IOException {
        boolean debugEnabled = log.isDebugEnabled();
```

### BoundedWildcard
Can generalize to `? super String`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/server/AbstractSftpSubsystemHelper.java`
#### Snippet
```java
     */
    protected void writeDirEntry(
            int id, DirectoryHandle dir, Map<String, Path> entries, Buffer buffer,
            int index, Path f, String shortName, LinkOption... options)
            throws IOException {
```

### BoundedWildcard
Can generalize to `? super Path`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/server/AbstractSftpSubsystemHelper.java`
#### Snippet
```java
     */
    protected void writeDirEntry(
            int id, DirectoryHandle dir, Map<String, Path> entries, Buffer buffer,
            int index, Path f, String shortName, LinkOption... options)
            throws IOException {
```

### BoundedWildcard
Can generalize to `? super PortForwardingEventListener`
in `sshd-core/src/main/java/org/apache/sshd/common/forward/DefaultForwarder.java`
#### Snippet
```java

    protected void invokePortEventListenerSignallerListeners(
            Collection<? extends PortForwardingEventListener> listeners, Invoker<PortForwardingEventListener, Void> invoker)
            throws Throwable {
        if (GenericUtils.isEmpty(listeners)) {
```

### BoundedWildcard
Can generalize to `? super PortForwardingEventListener`
in `sshd-core/src/main/java/org/apache/sshd/common/forward/DefaultForwarder.java`
#### Snippet
```java
    protected void invokePortEventListenerSignallerHolders(
            Collection<? extends PortForwardingEventListenerManager> holders,
            Invoker<PortForwardingEventListener, Void> invoker)
            throws Throwable {
        if (GenericUtils.isEmpty(holders)) {
```

### BoundedWildcard
Can generalize to `? extends Moduli.DhGroup`
in `sshd-core/src/main/java/org/apache/sshd/server/kex/DHGEXServer.java`
#### Snippet
```java

    protected List<Moduli.DhGroup> selectModuliGroups(
            ServerSession session, int min, int prf, int max, List<Moduli.DhGroup> groups)
            throws Exception {
        int maxDHGroupExchangeKeySize = SecurityUtils.getMaxDHGroupExchangeKeySize();
```

### BoundedWildcard
Can generalize to `? extends AuthorizedKeyEntry`
in `sshd-core/src/main/java/org/apache/sshd/server/config/keys/AuthorizedKeysAuthenticator.java`
#### Snippet
```java
    protected PublickeyAuthenticator createDelegateAuthenticator(
            String username, ServerSession session, Path path,
            Collection<AuthorizedKeyEntry> entries, PublicKeyEntryResolver fallbackResolver)
            throws IOException, GeneralSecurityException {
        return PublickeyAuthenticator.fromAuthorizedEntries(path, session, entries, fallbackResolver);
```

### BoundedWildcard
Can generalize to `? extends OpenSshCertificate.CertificateOption`
in `sshd-core/src/main/java/org/apache/sshd/certificate/OpenSshCertificateBuilder.java`
#### Snippet
```java
     * @throws IllegalArgumentException if there are duplicates
     */
    private void validateOptions(List<OpenSshCertificate.CertificateOption> options) {
        if (options != null && !options.isEmpty()) {
            // check if any duplicates
```

### BoundedWildcard
Can generalize to `? extends OpenSshCertificate.CertificateOption`
in `sshd-core/src/main/java/org/apache/sshd/certificate/OpenSshCertificateBuilder.java`
#### Snippet
```java
     */
    private List<OpenSshCertificate.CertificateOption> lexicallyOrderOptions(
            List<OpenSshCertificate.CertificateOption> options) {
        if (options != null && !options.isEmpty()) {
            return options.stream()
```

### BoundedWildcard
Can generalize to `? super Boolean`
in `sshd-core/src/main/java/org/apache/sshd/server/session/ServerUserAuthService.java`
#### Snippet
```java

    protected boolean handleUserAuthRequestMessage(
            ServerSession session, Buffer buffer, AtomicReference<Boolean> authHolder)
            throws Exception {
        boolean debugEnabled = log.isDebugEnabled();
```

### BoundedWildcard
Can generalize to `? super SessionListener`
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/SessionHelper.java`
#### Snippet
```java
    }

    protected void invokeSessionSignaller(Invoker<SessionListener, Void> invoker) throws Throwable {
        FactoryManager manager = getFactoryManager();
        SessionListener[] listeners = {
```

### BoundedWildcard
Can generalize to `? super KexProposalOption`
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/SessionHelper.java`
#### Snippet
```java
    // returns the proposal argument
    protected Map<KexProposalOption, String> mergeProposals(
            Map<KexProposalOption, String> current, Map<KexProposalOption, String> proposal) {
        // Checking references by design
        if (current == proposal) {
```

### BoundedWildcard
Can generalize to `? super String`
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/SessionHelper.java`
#### Snippet
```java
    // returns the proposal argument
    protected Map<KexProposalOption, String> mergeProposals(
            Map<KexProposalOption, String> current, Map<KexProposalOption, String> proposal) {
        // Checking references by design
        if (current == proposal) {
```

## RuleId[id=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `static private`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/openssh/kdf/BCrypt.java`
#### Snippet
```java
  // this "ciphertext", but it is really plaintext or an IV. We keep
  // the name to make code comparison easier.
  static private final int bf_crypt_ciphertext[] = {
      0x4f727068, 0x65616e42, 0x65686f6c,
      0x64657253, 0x63727944, 0x6f756274
```

### MissortedModifiers
Missorted modifiers `static private`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/openssh/kdf/BCrypt.java`
#### Snippet
```java

  // Table for Base64 decoding
  static private final byte index_64[] = {
      -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
      -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
```

### MissortedModifiers
Missorted modifiers `static private`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/openssh/kdf/BCrypt.java`
#### Snippet
```java

  // Table for Base64 encoding
  static private final char base64_code[] = {
      '.', '/', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
      'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V',
```

## RuleId[id=EqualsBetweenInconvertibleTypes]
### EqualsBetweenInconvertibleTypes
No class found which is a subtype of both 'ArrayDeque' and 'List'
in `sshd-common/src/main/java/org/apache/sshd/common/file/util/BasePath.java`
#### Snippet
```java
        }

        return newNames.equals(names) ? asT() : create(root, newNames);
    }

```

## RuleId[id=InstanceofIncompatibleInterface]
### InstanceofIncompatibleInterface
'instanceof' incompatible interface `ConnectionService`
in `sshd-core/src/main/java/org/apache/sshd/server/session/AbstractServerSession.java`
#### Snippet
```java
    @Override
    protected ConnectionService getConnectionService() {
        return (this.currentService instanceof ConnectionService)
                ? (ConnectionService) this.currentService
                : null;
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.setReadable()` is ignored
in `sshd-common/src/main/java/org/apache/sshd/common/util/io/IoUtils.java`
#### Snippet
```java
                        || perms.contains(PosixFilePermission.GROUP_READ)
                        || perms.contains(PosixFilePermission.OTHERS_READ));
        f.setReadable(readable, false);

        boolean writable = havePermissions
```

### IgnoreResultOfCall
Result of `File.setWritable()` is ignored
in `sshd-common/src/main/java/org/apache/sshd/common/util/io/IoUtils.java`
#### Snippet
```java
                        || perms.contains(PosixFilePermission.GROUP_WRITE)
                        || perms.contains(PosixFilePermission.OTHERS_WRITE));
        f.setWritable(writable, false);

        boolean executable = havePermissions
```

### IgnoreResultOfCall
Result of `File.setExecutable()` is ignored
in `sshd-common/src/main/java/org/apache/sshd/common/util/io/IoUtils.java`
#### Snippet
```java
                        || perms.contains(PosixFilePermission.GROUP_EXECUTE)
                        || perms.contains(PosixFilePermission.OTHERS_EXECUTE));
        f.setExecutable(executable, false);
    }

```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `sshd-core/src/main/java/org/apache/sshd/agent/unix/AprLibrary.java`
#### Snippet
```java

            File socket = File.createTempFile("mina", "apr", dir);
            socket.delete();
            name = socket.getAbsolutePath();
        } else {
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `sshd-core/src/main/java/org/apache/sshd/agent/unix/AprLibrary.java`
#### Snippet
```java
        } else {
            File socket = File.createTempFile("mina", "apr");
            socket.delete();
            name = "\\\\.\\pipe\\" + socket.getName();
        }
```

### IgnoreResultOfCall
Result of `CharsetDecoder.averageCharsPerByte()` is ignored
in `sshd-scp/src/main/java/org/apache/sshd/scp/server/InputStreamReader.java`
#### Snippet
```java
    public InputStreamReader(InputStream in, CharsetDecoder dec) {
        super(in);
        dec.averageCharsPerByte();
        this.in = in;
        decoder = dec;
```

## RuleId[id=FunctionalExpressionCanBeFolded]
### FunctionalExpressionCanBeFolded
Method reference can be replaced with qualifier
in `sshd-core/src/main/java/org/apache/sshd/client/SshClient.java`
#### Snippet
```java
        if (defaultIdentities == null) {
            KeyIdentityProvider idsWatcher = new DefaultClientIdentitiesWatcher(
                    this::getClientIdentityLoader, this::getFilePasswordProvider);
            setKeyIdentityProvider(idsWatcher);
        }
```

### FunctionalExpressionCanBeFolded
Method reference can be replaced with qualifier
in `sshd-core/src/main/java/org/apache/sshd/client/SshClient.java`
#### Snippet
```java
        if (defaultIdentities == null) {
            KeyIdentityProvider idsWatcher = new DefaultClientIdentitiesWatcher(
                    this::getClientIdentityLoader, this::getFilePasswordProvider);
            setKeyIdentityProvider(idsWatcher);
        }
```

## RuleId[id=UnnecessaryUnboxing]
### UnnecessaryUnboxing
Unnecessary unboxing
in `sshd-common/src/main/java/org/apache/sshd/common/util/GenericUtils.java`
#### Snippet
```java
        } else if (useUppercase == null) {
            return s.hashCode();
        } else if (useUppercase.booleanValue()) {
            return s.toUpperCase().hashCode();
        } else {
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `sshd-common/src/main/java/org/apache/sshd/common/util/security/eddsa/EdDSASecurityProviderRegistrar.java`
#### Snippet
```java
            supported = supportHolder.get();
            if (supported != null) {
                return supported.booleanValue();
            }

```

### UnnecessaryUnboxing
Unnecessary unboxing
in `sshd-common/src/main/java/org/apache/sshd/common/util/security/eddsa/EdDSASecurityProviderRegistrar.java`
#### Snippet
```java
        }

        return supported.booleanValue();
    }
}
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `sshd-common/src/main/java/org/apache/sshd/common/util/security/bouncycastle/BouncyCastleSecurityProviderRegistrar.java`
#### Snippet
```java
            supported = supportHolder.get();
            if (supported != null) {
                return supported.booleanValue();
            }

```

### UnnecessaryUnboxing
Unnecessary unboxing
in `sshd-common/src/main/java/org/apache/sshd/common/util/security/bouncycastle/BouncyCastleSecurityProviderRegistrar.java`
#### Snippet
```java
        }

        return supported.booleanValue();
    }
}
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/AESPrivateKeyObfuscator.java`
#### Snippet
```java
            List<Integer> sizes = getSupportedKeySizes();
            for (Integer s : sizes) {
                if (s.intValue() == keyLength) {
                    return keyLength;
                }
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `sshd-common/src/main/java/org/apache/sshd/common/signature/SignatureFactory.java`
#### Snippet
```java
            int resIndex;
            if (order < prefValue) {
                resIndex = curIndex.intValue() + 1;
            } else if (order > prefValue) {
                resIndex = curIndex.intValue(); // by using same index we insert in front of it in effect
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `sshd-common/src/main/java/org/apache/sshd/common/signature/SignatureFactory.java`
#### Snippet
```java
                resIndex = curIndex.intValue() + 1;
            } else if (order > prefValue) {
                resIndex = curIndex.intValue(); // by using same index we insert in front of it in effect
            } else {
                continue; // should not happen, but tolerate
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `sshd-cli/src/main/java/org/apache/sshd/cli/client/SshClientCliSupport.java`
#### Snippet
```java
        boolean autoDetect = "auto".equalsIgnoreCase(s);
        Boolean ptyEnabled = autoDetect ? Boolean.TRUE : PropertyResolverUtils.parseBoolean(s);
        if ((ptyEnabled == null) || (!ptyEnabled.booleanValue())) {
            return null;
        }
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/client/impl/SftpInputStreamAsync.java`
#### Snippet
```java
                buf.rpos(rpos + dlen);
                Boolean b = SftpHelper.getEndOfFileIndicatorValue(buf, client.getVersion());
                if ((b != null) && b.booleanValue()) {
                    eofIndicator = true;
                }
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/client/impl/SftpInputStreamAsync.java`
#### Snippet
```java
                }
                Boolean eofSignal = eof.getAndSet(null);
                if ((dlen < 0) || ((eofSignal != null) && eofSignal.booleanValue())) {
                    eofIndicator = true;
                    break;
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `sshd-contrib/src/main/java/org/apache/sshd/contrib/common/session/helpers/ChannelIdTrackingUnknownChannelReferenceHandler.java`
#### Snippet
```java
        Session session = service.getSession();
        Long lastTracked = session.getAttribute(LAST_CHANNEL_ID_KEY);
        if ((lastTracked != null) && (channelId <= lastTracked.longValue())) {
            // Use TRACE level in order to avoid messages flooding
            if (log.isTraceEnabled()) {
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `sshd-mina/src/main/java/org/apache/sshd/mina/MinaService.java`
#### Snippet
```java
        intVal = getInteger(CoreModuleProperties.MIN_READ_BUFFER_SIZE);
        if (intVal != null) {
            int readBufferSize = intVal.intValue();
            if (readBufferSize > defaultMinReadBufferSize) {
                readBufferSize = Math.min(readBufferSize, config.getMaxReadBufferSize());
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `sshd-mina/src/main/java/org/apache/sshd/mina/MinaService.java`
#### Snippet
```java
        intVal = getInteger(CoreModuleProperties.NIO2_READ_BUFFER_SIZE);
        if (intVal != null) {
            int readBufferSize = intVal.intValue();
            if (readBufferSize >= defaultMinReadBufferSize) {
                readBufferSize = Math.max(readBufferSize, config.getMinReadBufferSize());
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `sshd-core/src/main/java/org/apache/sshd/client/auth/pubkey/UserAuthPublicKey.java`
#### Snippet
```java
        PublicKey serverKey = null;
        Integer hostBoundPubKeyVersion = session.getAttribute(DefaultClientKexExtensionHandler.HOSTBOUND_AUTHENTICATION);
        boolean doHostBoundAuth = hostBoundPubKeyVersion != null && hostBoundPubKeyVersion.intValue() == 0;
        if (doHostBoundAuth) {
            name = HostBoundPubkeyAuthentication.AUTH_NAME;
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `sshd-core/src/main/java/org/apache/sshd/client/auth/pubkey/UserAuthPublicKey.java`
#### Snippet
```java
        String name = getName();
        Integer hostBoundPubKeyVersion = session.getAttribute(DefaultClientKexExtensionHandler.HOSTBOUND_AUTHENTICATION);
        boolean doHostBoundAuth = hostBoundPubKeyVersion != null && hostBoundPubKeyVersion.intValue() == 0;
        if (doHostBoundAuth) {
            name = HostBoundPubkeyAuthentication.AUTH_NAME;
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `sshd-core/src/main/java/org/apache/sshd/client/channel/ClientChannel.java`
#### Snippet
```java
            throw new RemoteException("No exit status returned for command=" + command);
        }
        if (exitStatus.intValue() != 0) {
            throw new RemoteException("Remote command failed (" + exitStatus + "): " + command,
                    new ServerException(exitStatus.toString()));
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `sshd-core/src/main/java/org/apache/sshd/common/kex/extension/DefaultClientKexExtensionHandler.java`
#### Snippet
```java
                            HostBoundPubkeyAuthentication.NAME);
                }
            } else if (version.intValue() != 0) {
                if (log.isDebugEnabled()) {
                    log.debug("handleKexExtensionRequest({}) : ignoring unknown {} version {}", session,
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `sshd-core/src/main/java/org/apache/sshd/common/kex/extension/DefaultServerKexExtensionHandler.java`
#### Snippet
```java
        if (phase == KexPhase.NEWKEYS) {
            Boolean alreadySent = session.getAttribute(EXT_INFO_SENT_AT_NEWKEYS);
            if ((alreadySent != null) && alreadySent.booleanValue()) {
                // It's not the first NEWKEYS.
                return;
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `sshd-core/src/main/java/org/apache/sshd/common/kex/extension/DefaultServerKexExtensionHandler.java`
#### Snippet
```java
        }
        Boolean doExtInfo = session.getAttribute(CLIENT_REQUESTED_EXT_INFO);
        if ((doExtInfo == null) || !doExtInfo.booleanValue()) {
            if (log.isTraceEnabled()) {
                log.trace("sendKexExtensions({})[{}]: client did not send ext-info-c; skipping sending SSH_MSG_EXT_INFO",
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/KeyExchangeMessageHandler.java`
#### Snippet
```java
                    kexFlushedFuture);
        });
        items.getValue().setValue(Boolean.valueOf(items.getKey().intValue() == 0));
        flushRunner.shutdownNow();
    }
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/AbstractSession.java`
#### Snippet
```java

        // Flush the queue asynchronously.
        int numPending = flushDone.getKey().intValue();
        if (numPending == 0) {
            if (log.isDebugEnabled()) {
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/AbstractSession.java`
#### Snippet
```java
            }
            return Boolean.valueOf(isRunning);
        }).booleanValue();

        if (kexRunning) {
```

## RuleId[id=DefaultAnnotationParam]
### DefaultAnnotationParam
Redundant default parameter value assignment
in `sshd-git/src/main/java/org/apache/sshd/git/pgm/EmbeddedCommandRunner.java`
#### Snippet
```java
    private String gitdir;

    @Argument(index = 0, metaVar = "metaVar_command", required = true, handler = SubcommandHandler.class)
    private TextBuiltin subcommand;

```

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `isNamedProviderUsed()` is identical to its super method
in `sshd-common/src/main/java/org/apache/sshd/common/util/security/SecurityProviderChoice.java`
#### Snippet
```java

            @Override
            public boolean isNamedProviderUsed() {
                return true;
            }
```

### RedundantMethodOverride
Method `awaitTermination()` only delegates to its super method
in `sshd-common/src/main/java/org/apache/sshd/common/util/threads/SshThreadPoolExecutor.java`
#### Snippet
```java

    @Override
    public boolean awaitTermination(long timeout, TimeUnit unit) throws InterruptedException {
        return super.awaitTermination(timeout, unit);
    }
```

### RedundantMethodOverride
Method `shutdown()` only delegates to its super method
in `sshd-common/src/main/java/org/apache/sshd/common/util/threads/SshThreadPoolExecutor.java`
#### Snippet
```java

    @Override
    public void shutdown() {
        super.shutdown();
    }
```

### RedundantMethodOverride
Method `isShutdown()` only delegates to its super method
in `sshd-common/src/main/java/org/apache/sshd/common/util/threads/SshThreadPoolExecutor.java`
#### Snippet
```java

    @Override
    public boolean isShutdown() {
        return super.isShutdown();
    }
```

### RedundantMethodOverride
Method `isTerminating()` only delegates to its super method
in `sshd-common/src/main/java/org/apache/sshd/common/util/threads/SshThreadPoolExecutor.java`
#### Snippet
```java

    @Override
    public boolean isTerminating() {
        return super.isTerminating();
    }
```

### RedundantMethodOverride
Method `isTerminated()` only delegates to its super method
in `sshd-common/src/main/java/org/apache/sshd/common/util/threads/SshThreadPoolExecutor.java`
#### Snippet
```java

    @Override
    public boolean isTerminated() {
        return super.isTerminated();
    }
```

### RedundantMethodOverride
Method `shutdownNow()` only delegates to its super method
in `sshd-common/src/main/java/org/apache/sshd/common/util/threads/SshThreadPoolExecutor.java`
#### Snippet
```java

    @Override
    public List<Runnable> shutdownNow() {
        return super.shutdownNow();
    }
```

### RedundantMethodOverride
Method `equals()` only delegates to its super method
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/AuthorizedKeyEntry.java`
#### Snippet
```java

    @Override // to avoid Findbugs[EQ_DOESNT_OVERRIDE_EQUALS]
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
```

### RedundantMethodOverride
Method `hashCode()` only delegates to its super method
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/AuthorizedKeyEntry.java`
#### Snippet
```java

    @Override // to avoid Findbugs[EQ_DOESNT_OVERRIDE_EQUALS]
    public int hashCode() {
        return super.hashCode();
    }
```

### RedundantMethodOverride
Method `isInteractionAllowed()` is identical to its super method
in `sshd-cli/src/main/java/org/apache/sshd/cli/client/SshKeyScanMain.java`
#### Snippet
```java
                client.setUserInteraction(new UserInteraction() {
                    @Override
                    public boolean isInteractionAllowed(ClientSession session) {
                        return true;
                    }
```

### RedundantMethodOverride
Method `equals()` only delegates to its super method
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/client/impl/DefaultCloseableHandle.java`
#### Snippet
```java

    @Override // to avoid Findbugs[EQ_DOESNT_OVERRIDE_EQUALS]
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
```

### RedundantMethodOverride
Method `hashCode()` only delegates to its super method
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/client/impl/DefaultCloseableHandle.java`
#### Snippet
```java

    @Override // to avoid Findbugs[EQ_DOESNT_OVERRIDE_EQUALS]
    public int hashCode() {
        return super.hashCode();
    }
```

### RedundantMethodOverride
Method `isInteractionAllowed()` is identical to its super method
in `sshd-cli/src/main/java/org/apache/sshd/cli/client/SshClientCliSupport.java`
#### Snippet
```java
        UserInteraction ui = new UserInteraction() {
            @Override
            public boolean isInteractionAllowed(ClientSession session) {
                return true;
            }
```

### RedundantMethodOverride
Method `getChannel()` is identical to its super method
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/client/impl/AbstractSftpClient.java`
#### Snippet
```java

    @Override
    public Channel getChannel() {
        return getClientChannel();
    }
```

## RuleId[id=RedundantStreamOptionalCall]
### RedundantStreamOptionalCall
Redundant 'map()' call
in `sshd-common/src/main/java/org/apache/sshd/common/util/GenericUtils.java`
#### Snippet
```java
    public static <T> Iterable<T> multiIterableSuppliers(
            Iterable<? extends Supplier<? extends Iterable<? extends T>>> providers) {
        return () -> stream(providers).<T> flatMap(s -> stream(s.get())).map(Function.identity()).iterator();
    }

```

## RuleId[id=ClassNameSameAsAncestorName]
### ClassNameSameAsAncestorName
Class name `Closeable` is the same as one of its superclass' names
in `sshd-common/src/main/java/org/apache/sshd/common/Closeable.java`
#### Snippet
```java
 * @author <a href="mailto:dev@mina.apache.org">Apache MINA SSHD Project</a>
 */
public interface Closeable extends Channel {

    /**
```

### ClassNameSameAsAncestorName
Class name `Channel` is the same as one of its superclass' names
in `sshd-core/src/main/java/org/apache/sshd/common/channel/Channel.java`
#### Snippet
```java
 * @author <a href="mailto:dev@mina.apache.org">Apache MINA SSHD Project</a>
 */
public interface Channel
        extends SessionHolder<Session>,
        ChannelIdentifier,
```

## RuleId[id=ThrowFromFinallyBlock]
### ThrowFromFinallyBlock
`throw` inside 'finally' block
in `sshd-core/src/main/java/org/apache/sshd/client/session/ClientSession.java`
#### Snippet
```java
                if (stderr.size() > 0) {
                    String errorMessage = stderr.toString(StandardCharsets.US_ASCII.name());
                    throw new RemoteException("Error reported from remote command=" + command,
                            new ServerException(errorMessage));
                }
```

### ThrowFromFinallyBlock
`throw` inside 'finally' block
in `sshd-core/src/main/java/org/apache/sshd/common/io/nio2/Nio2Acceptor.java`
#### Snippet
```java
            IOException err = IoUtils.closeQuietly(bound);
            if (err != null) {
                throw err;
            }
        }
```

### ThrowFromFinallyBlock
`throw` inside 'finally' block
in `sshd-core/src/main/java/org/apache/sshd/common/forward/DefaultForwarder.java`
#### Snippet
```java
                } catch (RuntimeException e) {
                    signalTornDownDynamicTunnel(local, e);
                    throw e;
                }
            }
```

### ThrowFromFinallyBlock
`throw` inside 'finally' block
in `sshd-core/src/main/java/org/apache/sshd/common/forward/DefaultForwarder.java`
#### Snippet
```java
                } catch (RuntimeException e) {
                    signalTornDownExplicitTunnel(boundAddress, true, remote, e);
                    throw e;
                }
            }
```

## RuleId[id=UnnecessarySuperQualifier]
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `sshd-common/src/main/java/org/apache/sshd/common/util/closeable/NioChannelDelegateInvocationHandler.java`
#### Snippet
```java

    public Channel getChannelDelegate() {
        return Channel.class.cast(super.getAutoCloseableDelegate());
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `sshd-core/src/main/java/org/apache/sshd/agent/unix/ChannelAgentForwarding.java`
#### Snippet
```java
        // be sent after we return.
        //
        super.close(true);

        // We also need to close the socket.
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `sshd-core/src/main/java/org/apache/sshd/agent/local/ChannelAgentForwarding.java`
#### Snippet
```java
            }
        } finally {
            super.close(true);
        }
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `sshd-core/src/main/java/org/apache/sshd/server/forward/TcpipServerChannel.java`
#### Snippet
```java
                            SshConstants.SSH_OPEN_ADMINISTRATIVELY_PROHIBITED, "Connection denied"));
                } finally {
                    super.close(true);
                }
                return f;
```

## RuleId[id=InfiniteLoopStatement]
### InfiniteLoopStatement
`while` statement cannot complete without throwing an exception
in `sshd-core/src/main/java/org/apache/sshd/agent/unix/AgentServer.java`
#### Snippet
```java
        agentThread = executor.submit(() -> {
            try {
                while (true) {
                    long clientSock = Local.accept(handle);
                    Socket.timeoutSet(clientSock, 10000000L); // TODO make this configurable
```

### InfiniteLoopStatement
`while` statement cannot complete without throwing an exception
in `sshd-core/src/main/java/org/apache/sshd/agent/unix/ChannelAgentForwarding.java`
#### Snippet
```java
                try {
                    byte[] buf = new byte[copyBufSize];
                    while (true) {
                        int len = Socket.recv(handle, buf, 0, buf.length);
                        if (len > 0) {
```

## RuleId[id=ReplaceAssignmentWithOperatorAssignment]
### ReplaceAssignmentWithOperatorAssignment
`input = input >> 2` could be simplified to 'input \>\>= 2'
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/KeyRandomArt.java`
#### Snippet
```java
                    field[x][y]++;
                }
                input = input >> 2;
            }
        }
```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `sshd-common/src/main/java/org/apache/sshd/common/util/SelectorUtils.java`
#### Snippet
```java
        // Process characters before first star
        // CHECKSTYLE:OFF
        while (((ch = patArr[patIdxStart]) != '*') && (strIdxStart <= strIdxEnd)) {
            if ((ch != '?') && (!equals(ch, strArr[strIdxStart], isCaseSensitive))) {
                return false; // Character mismatch
```

### NestedAssignment
Result of assignment expression used
in `sshd-common/src/main/java/org/apache/sshd/common/util/SelectorUtils.java`
#### Snippet
```java
        // Process characters after last star
        // CHECKSTYLE:OFF
        while (((ch = patArr[patIdxEnd]) != '*') && (strIdxStart <= strIdxEnd)) {
            if ((ch != '?') && (!equals(ch, strArr[strIdxEnd], isCaseSensitive))) {
                return false; // Character mismatch
```

## RuleId[id=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `new TreeMap<>(String.CASE_INSENSITIVE_ORDER)` are updated, but never queried
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/pem/AbstractPEMResourceKeyPairParser.java`
#### Snippet
```java
            if (!hdrsAvailable) {
                Map<String, String> accHeaders = MapEntryUtils.isEmpty(headers)
                        ? new TreeMap<>(String.CASE_INSENSITIVE_ORDER)
                        : headers;
                accHeaders.put(hdrName, hdrValue);
```

### MismatchedCollectionQueryUpdate
Contents of collection `arguments` are queried, but never updated
in `sshd-git/src/main/java/org/apache/sshd/git/pgm/EmbeddedCommandRunner.java`
#### Snippet
```java

    @Argument(index = 1, metaVar = "metaVar_arg")
    private List<String> arguments = new ArrayList<>();

    private Path rootDir;
```

## RuleId[id=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `s` is accessed in both synchronized and unsynchronized contexts
in `sshd-common/src/main/java/org/apache/sshd/common/mac/BaseMac.java`
#### Snippet
```java
    private final boolean etmMode;
    private javax.crypto.Mac mac;
    private String s;

    public BaseMac(String algorithm, int bsize, int defbsize, boolean etmMode) {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `strValue` is accessed in both synchronized and unsynchronized contexts
in `sshd-common/src/main/java/org/apache/sshd/common/file/util/BasePath.java`
#### Snippet
```java
    protected final List<String> names;
    private final FS fileSystem;
    private String strValue;
    private int hashValue;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `hashValue` is accessed in both synchronized and unsynchronized contexts
in `sshd-common/src/main/java/org/apache/sshd/common/file/util/BasePath.java`
#### Snippet
```java
    private final FS fileSystem;
    private String strValue;
    private int hashValue;

    protected BasePath(FS fileSystem, String root, List<String> names) {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `s` is accessed in both synchronized and unsynchronized contexts
in `sshd-common/src/main/java/org/apache/sshd/common/cipher/BaseCipher.java`
#### Snippet
```java
    private final int blkSize;
    private final String transformation;
    private String s;

    public BaseCipher(int ivsize, int authSize, int kdfSize, String algorithm,
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `s` is accessed in both synchronized and unsynchronized contexts
in `sshd-common/src/main/java/org/apache/sshd/common/digest/BaseDigest.java`
#### Snippet
```java
    private final int bsize;
    private int h;
    private String s;
    private MessageDigest md;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `h` is accessed in both synchronized and unsynchronized contexts
in `sshd-common/src/main/java/org/apache/sshd/common/digest/BaseDigest.java`
#### Snippet
```java
    private final String algorithm;
    private final int bsize;
    private int h;
    private String s;
    private MessageDigest md;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `listeners` is accessed in both synchronized and unsynchronized contexts
in `sshd-common/src/main/java/org/apache/sshd/common/future/DefaultSshFuture.java`
#### Snippet
```java
     */
    private final Object lock;
    private Object listeners;
    private Object result;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `result` is accessed in both synchronized and unsynchronized contexts
in `sshd-common/src/main/java/org/apache/sshd/common/future/DefaultSshFuture.java`
#### Snippet
```java
    private final Object lock;
    private Object listeners;
    private Object result;

    /**
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `lastChar` is accessed in both synchronized and unsynchronized contexts
in `sshd-common/src/main/java/org/apache/sshd/server/shell/TtyFilterInputStream.java`
#### Snippet
```java
    private final Set<PtyMode> ttyOptions;
    private Buffer buffer = new ByteArrayBuffer(Integer.SIZE, false);
    private int lastChar = -1;

    public TtyFilterInputStream(InputStream in, Map<PtyMode, ?> modes) {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `buffer` is accessed in both synchronized and unsynchronized contexts
in `sshd-common/src/main/java/org/apache/sshd/server/shell/TtyFilterInputStream.java`
#### Snippet
```java

    private final Set<PtyMode> ttyOptions;
    private Buffer buffer = new ByteArrayBuffer(Integer.SIZE, false);
    private int lastChar = -1;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `library` is accessed in both synchronized and unsynchronized contexts
in `sshd-core/src/main/java/org/apache/sshd/agent/unix/AprLibrary.java`
#### Snippet
```java
public final class AprLibrary {
    // is APR library was initialized (load of native libraries)
    private static AprLibrary library;

    // APR memory pool (package wide mother pool)
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `openFuture` is accessed in both synchronized and unsynchronized contexts
in `sshd-core/src/main/java/org/apache/sshd/client/channel/AbstractClientChannel.java`
#### Snippet
```java
    protected String openFailureMsg;
    protected String openFailureLang;
    protected OpenFuture openFuture;

    private final String channelType;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `clientHeartbeat` is accessed in both synchronized and unsynchronized contexts
in `sshd-core/src/main/java/org/apache/sshd/client/session/ClientConnectionService.java`
#### Snippet
```java
    protected final Duration heartbeatReplyMaxWait;
    /** Non-null only if using the &quot;keep-alive&quot; request mechanism */
    protected ScheduledFuture<?> clientHeartbeat;

    public ClientConnectionService(AbstractClientSession s) throws SshException {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `factory` is accessed in both synchronized and unsynchronized contexts
in `sshd-core/src/main/java/org/apache/sshd/common/io/DefaultIoServiceFactoryFactory.java`
#### Snippet
```java
    private static final Logger LOGGER = LoggerFactory.getLogger(DefaultIoServiceFactoryFactory.class);

    private IoServiceFactoryFactory factory;

    protected DefaultIoServiceFactoryFactory() {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `packetSize` is accessed in both synchronized and unsynchronized contexts
in `sshd-core/src/main/java/org/apache/sshd/common/channel/Window.java`
#### Snippet
```java
    private long size; // the window size
    private long maxSize; // actually uint32
    private long packetSize; // actually uint32

    protected Window(Channel channel, boolean isClient) {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `size` is accessed in both synchronized and unsynchronized contexts
in `sshd-core/src/main/java/org/apache/sshd/common/channel/Window.java`
#### Snippet
```java
    private final String suffix;

    private long size; // the window size
    private long maxSize; // actually uint32
    private long packetSize; // actually uint32
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `maxSize` is accessed in both synchronized and unsynchronized contexts
in `sshd-core/src/main/java/org/apache/sshd/common/channel/Window.java`
#### Snippet
```java

    private long size; // the window size
    private long maxSize; // actually uint32
    private long packetSize; // actually uint32

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `released` is accessed in both synchronized and unsynchronized contexts
in `sshd-core/src/main/java/org/apache/sshd/common/channel/LocalWindow.java`
#### Snippet
```java
    private final AtomicLong adjustment = new AtomicLong();

    private long released;

    public LocalWindow(AbstractChannel channel, boolean isClient) {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `bufferLength` is accessed in both synchronized and unsynchronized contexts
in `sshd-core/src/main/java/org/apache/sshd/common/channel/ChannelOutputStream.java`
#### Snippet
```java
    private final Object bufferLock = new Object();
    private Buffer buffer;
    private int bufferLength;
    private int lastSize;
    private boolean isFlushing;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `tunnelEntrance` is accessed in both synchronized and unsynchronized contexts
in `sshd-core/src/main/java/org/apache/sshd/common/forward/TcpipClientChannel.java`
#### Snippet
```java

    private final Type typeEnum;
    private SshdSocketAddress tunnelEntrance;
    private SshdSocketAddress tunnelExit;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `localEntry` is accessed in both synchronized and unsynchronized contexts
in `sshd-core/src/main/java/org/apache/sshd/common/forward/TcpipClientChannel.java`
#### Snippet
```java
    protected final SshdSocketAddress remote;
    protected final ChannelToPortHandler port;
    protected SshdSocketAddress localEntry;

    private final Type typeEnum;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `tunnelExit` is accessed in both synchronized and unsynchronized contexts
in `sshd-core/src/main/java/org/apache/sshd/common/forward/TcpipClientChannel.java`
#### Snippet
```java
    private final Type typeEnum;
    private SshdSocketAddress tunnelEntrance;
    private SshdSocketAddress tunnelExit;

    public TcpipClientChannel(Type type, IoSession serverSession, SshdSocketAddress remote) {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `ioServiceFactory` is accessed in both synchronized and unsynchronized contexts
in `sshd-core/src/main/java/org/apache/sshd/common/helpers/AbstractFactoryManager.java`
#### Snippet
```java
public abstract class AbstractFactoryManager extends AbstractKexFactoryManager implements FactoryManager {
    protected IoServiceFactoryFactory ioServiceFactoryFactory;
    protected IoServiceFactory ioServiceFactory;
    protected Factory<? extends Random> randomFactory;
    protected List<? extends ChannelFactory> channelFactories;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `ioServiceFactoryFactory` is accessed in both synchronized and unsynchronized contexts
in `sshd-core/src/main/java/org/apache/sshd/common/helpers/AbstractFactoryManager.java`
#### Snippet
```java
 */
public abstract class AbstractFactoryManager extends AbstractKexFactoryManager implements FactoryManager {
    protected IoServiceFactoryFactory ioServiceFactoryFactory;
    protected IoServiceFactory ioServiceFactory;
    protected Factory<? extends Random> randomFactory;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `dynamicAcceptor` is accessed in both synchronized and unsynchronized contexts
in `sshd-core/src/main/java/org/apache/sshd/common/forward/DefaultForwarder.java`
#### Snippet
```java

    private IoAcceptor localAcceptor;
    private IoAcceptor dynamicAcceptor;

    public DefaultForwarder(ConnectionService service) {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `localAcceptor` is accessed in both synchronized and unsynchronized contexts
in `sshd-core/src/main/java/org/apache/sshd/common/forward/DefaultForwarder.java`
#### Snippet
```java
    private final PortForwardingEventListener listenerProxy;

    private IoAcceptor localAcceptor;
    private IoAcceptor dynamicAcceptor;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `heartBeat` is accessed in both synchronized and unsynchronized contexts
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/AbstractConnectionService.java`
#### Snippet
```java
    protected final AtomicLong nextChannelId = new AtomicLong(0L);
    protected final AtomicLong heartbeatCount = new AtomicLong(0L);
    private ScheduledFuture<?> heartBeat;

    private final AtomicReference<AgentForwardSupport> agentForwardHolder = new AtomicReference<>();
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `acceptor` is accessed in both synchronized and unsynchronized contexts
in `sshd-core/src/main/java/org/apache/sshd/server/x11/DefaultX11ForwardSupport.java`
#### Snippet
```java
public class DefaultX11ForwardSupport extends AbstractInnerCloseable implements X11ForwardSupport {
    private final ConnectionService service;
    private IoAcceptor acceptor;

    public DefaultX11ForwardSupport(ConnectionService service) {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `shellOut` is accessed in both synchronized and unsynchronized contexts
in `sshd-core/src/main/java/org/apache/sshd/server/shell/InvertedShellWrapper.java`
#### Snippet
```java
    private OutputStream err;
    private OutputStream shellIn;
    private InputStream shellOut;
    private InputStream shellErr;
    private ExitCallback callback;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `shellIn` is accessed in both synchronized and unsynchronized contexts
in `sshd-core/src/main/java/org/apache/sshd/server/shell/InvertedShellWrapper.java`
#### Snippet
```java
    private OutputStream out;
    private OutputStream err;
    private OutputStream shellIn;
    private InputStream shellOut;
    private InputStream shellErr;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `shellErr` is accessed in both synchronized and unsynchronized contexts
in `sshd-core/src/main/java/org/apache/sshd/server/shell/InvertedShellWrapper.java`
#### Snippet
```java
    private OutputStream shellIn;
    private InputStream shellOut;
    private InputStream shellErr;
    private ExitCallback callback;
    private boolean shutdownExecutor;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `currentAuth` is accessed in both synchronized and unsynchronized contexts
in `sshd-core/src/main/java/org/apache/sshd/server/session/ServerUserAuthService.java`
#### Snippet
```java
    private String authMethod;
    private String authService;
    private UserAuth currentAuth;

    private int maxAuthRequests;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `maxRekyPackets` is accessed in both synchronized and unsynchronized contexts
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/AbstractSession.java`
#### Snippet
```java
    protected final AtomicReference<Instant> lastKeyTimeValue = new AtomicReference<>(Instant.now());
    // we initialize them here in case super constructor calls some methods that use these values
    protected long maxRekyPackets;
    protected long maxRekeyBytes;
    protected Duration maxRekeyInterval;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `ignorePacketsVariance` is accessed in both synchronized and unsynchronized contexts
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/AbstractSession.java`
#### Snippet
```java
    protected int ignorePacketDataLength;
    protected long ignorePacketsFrequency;
    protected int ignorePacketsVariance;

    protected final AtomicLong maxRekeyBlocks
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `ignorePacketsFrequency` is accessed in both synchronized and unsynchronized contexts
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/AbstractSession.java`
#### Snippet
```java
    // SSH_MSG_IGNORE stream padding
    protected int ignorePacketDataLength;
    protected long ignorePacketsFrequency;
    protected int ignorePacketsVariance;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `maxRekeyInterval` is accessed in both synchronized and unsynchronized contexts
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/AbstractSession.java`
#### Snippet
```java
    protected long maxRekyPackets;
    protected long maxRekeyBytes;
    protected Duration maxRekeyInterval;

    /**
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `ignorePacketDataLength` is accessed in both synchronized and unsynchronized contexts
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/AbstractSession.java`
#### Snippet
```java

    // SSH_MSG_IGNORE stream padding
    protected int ignorePacketDataLength;
    protected long ignorePacketsFrequency;
    protected int ignorePacketsVariance;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `clientVersion` is accessed in both synchronized and unsynchronized contexts
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/AbstractSession.java`
#### Snippet
```java
    protected byte[] sessionId;
    protected String serverVersion;
    protected String clientVersion;
    // if empty then means not-initialized
    protected final Map<KexProposalOption, String> serverProposal = new EnumMap<>(KexProposalOption.class);
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `maxRekeyBytes` is accessed in both synchronized and unsynchronized contexts
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/AbstractSession.java`
#### Snippet
```java
    // we initialize them here in case super constructor calls some methods that use these values
    protected long maxRekyPackets;
    protected long maxRekeyBytes;
    protected Duration maxRekeyInterval;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `serverVersion` is accessed in both synchronized and unsynchronized contexts
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/AbstractSession.java`
#### Snippet
```java
     */
    protected byte[] sessionId;
    protected String serverVersion;
    protected String clientVersion;
    // if empty then means not-initialized
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `decoder` is accessed in both synchronized and unsynchronized contexts
in `sshd-scp/src/main/java/org/apache/sshd/scp/server/InputStreamReader.java`
#### Snippet
```java
    private static final int BUFFER_SIZE = 4;

    CharsetDecoder decoder;

    ByteBuffer bytes = ByteBuffer.allocate(BUFFER_SIZE);
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `in` is accessed in both synchronized and unsynchronized contexts
in `sshd-scp/src/main/java/org/apache/sshd/scp/server/InputStreamReader.java`
#### Snippet
```java
    char pending = (char) -1;

    private InputStream in;

    private boolean endOfInput;
```

## RuleId[id=EmptyMethod]
### EmptyMethod
Method only calls its super
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/AuthorizedKeyEntry.java`
#### Snippet
```java

    @Override // to avoid Findbugs[EQ_DOESNT_OVERRIDE_EQUALS]
    public int hashCode() {
        return super.hashCode();
    }
```

### EmptyMethod
Method only calls its super
in `sshd-common/src/main/java/org/apache/sshd/common/util/logging/SimplifiedLoggerSkeleton.java`
#### Snippet
```java

        @Override
        public void log(Level level, Object message, Throwable t) {
            return;
        }
```

### EmptyMethod
Method only calls its super
in `sshd-common/src/main/java/org/apache/sshd/common/util/threads/SshThreadPoolExecutor.java`
#### Snippet
```java

    @Override
    public void shutdown() {
        super.shutdown();
    }
```

### EmptyMethod
Method only calls its super
in `sshd-common/src/main/java/org/apache/sshd/common/util/threads/SshThreadPoolExecutor.java`
#### Snippet
```java

    @Override
    public List<Runnable> shutdownNow() {
        return super.shutdownNow();
    }
```

### EmptyMethod
Method only calls its super
in `sshd-common/src/main/java/org/apache/sshd/common/util/threads/SshThreadPoolExecutor.java`
#### Snippet
```java

    @Override
    public boolean isShutdown() {
        return super.isShutdown();
    }
```

### EmptyMethod
Method only calls its super
in `sshd-common/src/main/java/org/apache/sshd/common/util/threads/SshThreadPoolExecutor.java`
#### Snippet
```java

    @Override
    public boolean isTerminating() {
        return super.isTerminating();
    }
```

### EmptyMethod
Method only calls its super
in `sshd-common/src/main/java/org/apache/sshd/common/util/threads/SshThreadPoolExecutor.java`
#### Snippet
```java

    @Override
    public boolean isTerminated() {
        return super.isTerminated();
    }
```

### EmptyMethod
All implementations of this method are empty
in `sshd-core/src/main/java/org/apache/sshd/server/SignalListener.java`
#### Snippet
```java
     * @param signal  The received {@link Signal}
     */
    void signal(Channel channel, Signal signal);

    static <L extends SignalListener> L validateListener(L listener) {
```

### EmptyMethod
All implementations of this method are empty
in `sshd-core/src/main/java/org/apache/sshd/server/command/AsyncCommandInputStreamAware.java`
#### Snippet
```java
     * @param in The {@link IoInputStream} used by the shell to read input
     */
    void setIoInputStream(IoInputStream in);

}
```

### EmptyMethod
Method only calls its super
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/client/impl/DefaultCloseableHandle.java`
#### Snippet
```java

    @Override // to avoid Findbugs[EQ_DOESNT_OVERRIDE_EQUALS]
    public int hashCode() {
        return super.hashCode();
    }
```

## RuleId[id=RedundantImplements]
### RedundantImplements
Redundant interface declaration `KeyPairProvider`
in `sshd-common/src/main/java/org/apache/sshd/client/config/keys/ClientIdentitiesWatcher.java`
#### Snippet
```java
 * @author <a href="mailto:dev@mina.apache.org">Apache MINA SSHD Project</a>
 */
public class ClientIdentitiesWatcher extends AbstractKeyPairProvider implements KeyPairProvider {
    private final Collection<ClientIdentityProvider> providers;

```

### RedundantImplements
Redundant interface declaration `Closeable`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/client/SftpClient.java`
#### Snippet
```java

    // CHECKSTYLE:OFF
    abstract class CloseableHandle extends Handle implements Channel, Closeable {
        protected CloseableHandle(String path, byte[] id) {
            super(path, id);
```

### RedundantImplements
Redundant interface declaration `SftpEventListenerManager`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/server/SftpSubsystemFactory.java`
#### Snippet
```java
        extends AbstractSftpEventListenerManager
        implements ManagedExecutorServiceSupplier, SubsystemFactory,
        SftpEventListenerManager, SftpFileSystemAccessorManager,
        SftpSubsystemConfigurator {

```

### RedundantImplements
Redundant interface declaration `Closeable`
in `sshd-mina/src/main/java/org/apache/sshd/mina/MinaService.java`
#### Snippet
```java
 */
public abstract class MinaService extends AbstractCloseable
        implements org.apache.sshd.common.io.IoService, IoHandler, Closeable {
    protected final FactoryManager manager;
    protected final org.apache.sshd.common.io.IoHandler handler;
```

### RedundantImplements
Redundant interface declaration `IoHandler`
in `sshd-mina/src/main/java/org/apache/sshd/mina/MinaConnector.java`
#### Snippet
```java
 * @author <a href="mailto:dev@mina.apache.org">Apache MINA SSHD Project</a>
 */
public class MinaConnector extends MinaService implements org.apache.sshd.common.io.IoConnector, IoHandler {
    protected final AtomicReference<IoConnector> connectorHolder = new AtomicReference<>(null);

```

### RedundantImplements
Redundant interface declaration `IoHandler`
in `sshd-mina/src/main/java/org/apache/sshd/mina/MinaAcceptor.java`
#### Snippet
```java
 * @author <a href="mailto:dev@mina.apache.org">Apache MINA SSHD Project</a>
 */
public class MinaAcceptor extends MinaService implements org.apache.sshd.common.io.IoAcceptor, IoHandler {
    protected final AtomicReference<IoAcceptor> acceptorHolder = new AtomicReference<>(null);

```

### RedundantImplements
Redundant interface declaration `Command`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/server/SftpSubsystem.java`
#### Snippet
```java
public class SftpSubsystem
        extends AbstractSftpSubsystemHelper
        implements Command, Runnable, FileSystemAware, ExecutorServiceCarrier,
        AsyncCommand, ChannelDataReceiver {
    protected static final Buffer CLOSE = new ByteArrayBuffer(null, 0, 0);
```

### RedundantImplements
Redundant interface declaration `SimpleClientConfigurator`
in `sshd-core/src/main/java/org/apache/sshd/client/simple/SimpleClient.java`
#### Snippet
```java
 */
public interface SimpleClient
        extends SimpleClientConfigurator,
        SimpleSessionClient,
        Channel {
```

### RedundantImplements
Redundant interface declaration `Channel`
in `sshd-core/src/main/java/org/apache/sshd/client/simple/SimpleClient.java`
#### Snippet
```java
        extends SimpleClientConfigurator,
        SimpleSessionClient,
        Channel {
    // marker interface
}
```

### RedundantImplements
Redundant interface declaration `Closeable`
in `sshd-core/src/main/java/org/apache/sshd/client/SshClient.java`
#### Snippet
```java
 * @author <a href="mailto:dev@mina.apache.org">Apache MINA SSHD Project</a>
 */
public class SshClient extends AbstractFactoryManager implements ClientFactoryManager, Closeable {
    public static final Factory<SshClient> DEFAULT_SSH_CLIENT_FACTORY = SshClient::new;

```

### RedundantImplements
Redundant interface declaration `Closeable`
in `sshd-core/src/main/java/org/apache/sshd/server/SshServer.java`
#### Snippet
```java
 * @see    org.apache.sshd.common.FactoryManager
 */
public class SshServer extends AbstractFactoryManager implements ServerFactoryManager, Closeable {
    public static final Factory<SshServer> DEFAULT_SSH_SERVER_FACTORY = SshServer::new;

```

### RedundantImplements
Redundant interface declaration `PortForwardingEventListenerManager`
in `sshd-core/src/main/java/org/apache/sshd/common/forward/DefaultForwarder.java`
#### Snippet
```java
public class DefaultForwarder
        extends AbstractInnerCloseable
        implements Forwarder, SessionHolder<Session>, PortForwardingEventListenerManager {

    public static final Set<ClientChannelEvent> STATIC_IO_MSG_RECEIVED_EVENTS
```

## RuleId[id=InstanceofCatchParameter]
### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `sshd-common/src/main/java/org/apache/sshd/client/config/hosts/ConfigFileHostEntryResolver.java`
#### Snippet
```java
            debug("resolveEffectiveHost({}@{}:{}/{}) failed ({}) to resolve: {}",
                    username, host, port, proxyJump, e.getClass().getSimpleName(), e.getMessage(), e);
            if (e instanceof IOException) {
                throw (IOException) e;
            } else {
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `sshd-openpgp/src/main/java/org/apache/sshd/openpgp/PGPKeyPairResourceParser.java`
#### Snippet
```java
                switch (result) {
                    case TERMINATE:
                        if (e instanceof PGPException) {
                            throw new StreamCorruptedException("Failed (" + e.getClass().getSimpleName() + ")"
                                                               + " to decode " + resourceKey + ": " + e.getMessage());
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `sshd-openpgp/src/main/java/org/apache/sshd/openpgp/PGPKeyPairResourceParser.java`
#### Snippet
```java
                            throw new StreamCorruptedException("Failed (" + e.getClass().getSimpleName() + ")"
                                                               + " to decode " + resourceKey + ": " + e.getMessage());
                        } else if (e instanceof IOException) {
                            throw (IOException) e;
                        } else if (e instanceof GeneralSecurityException) {
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `sshd-openpgp/src/main/java/org/apache/sshd/openpgp/PGPKeyPairResourceParser.java`
#### Snippet
```java
                        } else if (e instanceof IOException) {
                            throw (IOException) e;
                        } else if (e instanceof GeneralSecurityException) {
                            throw (GeneralSecurityException) e;
                        } else {
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `sshd-cli/src/main/java/org/apache/sshd/cli/client/SshKeyScanMain.java`
#### Snippet
```java
                }

                if (e instanceof ConnectException) {
                    return; // makes no sense to try again with another key type...
                }
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `sshd-cli/src/main/java/org/apache/sshd/cli/client/SshKeyScanMain.java`
#### Snippet
```java
                        } catch (Exception e) {
                            // check if interrupted while scanning host keys
                            if (e instanceof InterruptedIOException) {
                                throw e;
                            }
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/client/fs/SftpFileSystemProvider.java`
#### Snippet
```java
                }

                if (e instanceof IOException) {
                    throw (IOException) e;
                } else if (e instanceof RuntimeException) {
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/client/fs/SftpFileSystemProvider.java`
#### Snippet
```java
                if (e instanceof IOException) {
                    throw (IOException) e;
                } else if (e instanceof RuntimeException) {
                    throw (RuntimeException) e;
                } else {
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `t`
in `sshd-core/src/main/java/org/apache/sshd/agent/local/AgentServerProxy.java`
#### Snippet
```java
            }

            if (t instanceof IOException) {
                throw (IOException) t;
            }
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `t`
in `sshd-core/src/main/java/org/apache/sshd/agent/common/DefaultAgentForwardSupport.java`
#### Snippet
```java
            error("initialize({}) failed ({}) to create server: {}",
                    session, t.getClass().getSimpleName(), t.getMessage(), t);
            if (t instanceof IOException) {
                throw (IOException) t;
            } else {
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `sshd-core/src/main/java/org/apache/sshd/client/channel/exit/AbstractChannelExitRequestHandler.java`
#### Snippet
```java
            warn("notifyStateChanged({})[{}] Failed ({}) to notify event={}: {}",
                    channel, request, e.getClass().getSimpleName(), event, e.getMessage(), e);
            if (e instanceof RuntimeException) {
                throw (RuntimeException) e;
            } else {
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `sshd-core/src/main/java/org/apache/sshd/common/io/nio2/Nio2Session.java`
#### Snippet
```java
            future.setWritten();

            if (e instanceof RuntimeException) {
                throw (RuntimeException) e;
            } else {
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `t`
in `sshd-core/src/main/java/org/apache/sshd/client/session/AbstractClientSession.java`
#### Snippet
```java
                    this, t.getClass().getSimpleName(), t.getMessage(), t);

            if (t instanceof Exception) {
                throw (Exception) t;
            } else {
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `sshd-core/src/main/java/org/apache/sshd/common/channel/ChannelOutputStream.java`
#### Snippet
```java
                                this, e.getClass().getSimpleName(), l, e.getMessage(), e);

                        if ((e instanceof WindowClosedException) && (OpenState.OPEN == openState.getAndSet(OpenState.CLOSED))) {
                            if (debugEnabled) {
                                log.debug("write({})[len={}] closing due to window closed", this, l);
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `sshd-core/src/main/java/org/apache/sshd/common/channel/BufferedIoOutputStream.java`
#### Snippet
```java
            startWriting();
        } catch (IOException e) {
            if (e instanceof SshChannelBufferedOutputException) {
                pendingException.compareAndSet(null, (SshChannelBufferedOutputException) e);
            } else {
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `t`
in `sshd-core/src/main/java/org/apache/sshd/server/session/AbstractServerSession.java`
#### Snippet
```java
                        this, t.getClass().getSimpleName(), t.getMessage(), t);

                if (t instanceof IOException) {
                    throw (IOException) t;
                } else {
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/AbstractSession.java`
#### Snippet
```java
            }

            if (e instanceof Exception) {
                throw (Exception) e;
            } else {
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `sshd-scp/src/main/java/org/apache/sshd/scp/server/ScpCommand.java`
#### Snippet
```java
            try {
                Integer statusCode = null;
                if (e instanceof ScpException) {
                    statusCode = ((ScpException) e).getExitStatus();
                }
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `sshd-scp/src/main/java/org/apache/sshd/scp/server/ScpShell.java`
#### Snippet
```java
            variables.put(STATUS, 0);
        } catch (IOException e) {
            Integer statusCode = e instanceof ScpException ? ((ScpException) e).getExitStatus() : null;
            int exitValue = (statusCode == null) ? ScpAckInfo.ERROR : statusCode;
            // this is an exception so status cannot be OK/WARNING
```

## RuleId[id=ArrayEquality]
### ArrayEquality
Array objects are compared using `!=`, not 'Arrays.equals()'
in `sshd-common/src/main/java/org/apache/sshd/common/util/io/output/SecureByteArrayOutputStream.java`
#### Snippet
```java
        byte[] oldBuf = buf;
        super.write(b, off, len);
        if (buf != oldBuf) {
            Arrays.fill(oldBuf, (byte) 0);
        }
```

### ArrayEquality
Array objects are compared using `!=`, not 'Arrays.equals()'
in `sshd-common/src/main/java/org/apache/sshd/common/util/io/output/SecureByteArrayOutputStream.java`
#### Snippet
```java
        byte[] oldBuf = buf;
        super.write(b);
        if (buf != oldBuf) {
            Arrays.fill(oldBuf, (byte) 0);
        }
```

## RuleId[id=StringBufferReplaceableByStringBuilder]
### StringBufferReplaceableByStringBuilder
`StringBuffer rs` may be declared as 'StringBuilder'
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/openssh/kdf/BCrypt.java`
#### Snippet
```java
      throws IllegalArgumentException {
      int off = 0;
      StringBuffer rs = new StringBuffer();
      int c1, c2;

```

### StringBufferReplaceableByStringBuilder
`StringBuffer rs` may be declared as 'StringBuilder'
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/openssh/kdf/BCrypt.java`
#### Snippet
```java
   */
  public static String gensalt(int log_rounds, SecureRandom random) {
      StringBuffer rs = new StringBuffer();
      byte rnd[] = new byte[BCRYPT_SALT_LEN];

```

### StringBufferReplaceableByStringBuilder
`StringBuffer rs` may be declared as 'StringBuilder'
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/openssh/kdf/BCrypt.java`
#### Snippet
```java
      char minor = (char)0;
      int rounds, off = 0;
      StringBuffer rs = new StringBuffer();

      if (salt.charAt(0) != '$' || salt.charAt(1) != '2')
```

### StringBufferReplaceableByStringBuilder
`StringBuffer rs` may be declared as 'StringBuilder'
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/openssh/kdf/BCrypt.java`
#### Snippet
```java
  private static byte[] decode_base64(String s, int maxolen)
      throws IllegalArgumentException {
      StringBuffer rs = new StringBuffer();
      int off = 0, slen = s.length(), olen = 0;
      byte ret[];
```

## RuleId[id=NonFinalFieldOfException]
### NonFinalFieldOfException
Non-final field `listener` of exception class
in `sshd-core/src/main/java/org/apache/sshd/server/auth/AsyncAuthException.java`
#### Snippet
```java
    private static final long serialVersionUID = 6741236101797649869L;

    protected transient Object listener;
    protected Boolean authed;

```

### NonFinalFieldOfException
Non-final field `authed` of exception class
in `sshd-core/src/main/java/org/apache/sshd/server/auth/AsyncAuthException.java`
#### Snippet
```java

    protected transient Object listener;
    protected Boolean authed;

    public AsyncAuthException() {
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `sshd-git/src/main/java/org/apache/sshd/git/pgm/EmbeddedCommandRunner.java`
#### Snippet
```java
    private Object call(Object obj, String name)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        return call(obj, name, new Class[0], new Object[0]);
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `sshd-git/src/main/java/org/apache/sshd/git/pgm/EmbeddedCommandRunner.java`
#### Snippet
```java
    private Object call(Object obj, String name)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        return call(obj, name, new Class[0], new Object[0]);
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/AbstractSession.java`
#### Snippet
```java
                            log.debug("makeGlobalRequest({})[{}] want-reply=false sent", this, getId());
                        }
                        setValue(new ByteArrayBuffer(new byte[0]));
                        GlobalRequestFuture.ReplyHandler handler = getHandler();
                        if (handler != null) {
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `sshd-scp/src/main/java/org/apache/sshd/scp/server/ScpShell.java`
#### Snippet
```java
                }
                if (!args.isEmpty()) {
                    cmds.add(args.toArray(new String[0]));
                }
                args.clear();
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `sshd-scp/src/main/java/org/apache/sshd/scp/server/ScpShell.java`
#### Snippet
```java
        }
        if (!args.isEmpty()) {
            cmds.add(args.toArray(new String[0]));
        }
        return cmds;
```

## RuleId[id=SynchronizeOnThis]
### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `sshd-common/src/main/java/org/apache/sshd/common/mac/BaseMac.java`
#### Snippet
```java
    @Override
    public String toString() {
        synchronized (this) {
            if (s == null) {
                s = getClass().getSimpleName() + "[" + getAlgorithm() + "] - "
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `sshd-common/src/main/java/org/apache/sshd/common/file/util/BasePath.java`
#### Snippet
```java
    @Override
    public int hashCode() {
        synchronized (this) {
            if (hashValue == 0) {
                hashValue = calculatedHashCode();
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `sshd-common/src/main/java/org/apache/sshd/common/file/util/BasePath.java`
#### Snippet
```java
    @Override
    public String toString() {
        synchronized (this) {
            if (strValue == null) {
                strValue = asString();
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `sshd-common/src/main/java/org/apache/sshd/common/cipher/BaseCipher.java`
#### Snippet
```java
    @Override
    public String toString() {
        synchronized (this) {
            if (s == null) {
                s = getClass().getSimpleName()
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `sshd-common/src/main/java/org/apache/sshd/common/digest/BaseDigest.java`
#### Snippet
```java
    @Override
    public String toString() {
        synchronized (this) {
            if (s == null) {
                s = getClass().getSimpleName() + "[" + getAlgorithm() + ":" + getBlockSize() + "]";
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `sshd-common/src/main/java/org/apache/sshd/common/digest/BaseDigest.java`
#### Snippet
```java
    @Override
    public int hashCode() {
        synchronized (this) {
            if (h == 0) {
                h = Objects.hashCode(getAlgorithm()) + getBlockSize();
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `sshd-core/src/main/java/org/apache/sshd/common/io/DefaultIoServiceFactoryFactory.java`
#### Snippet
```java
     */
    public IoServiceFactoryFactory getIoServiceProvider() {
        synchronized (this) {
            if (factory != null) {
                return factory;
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/CurrentService.java`
#### Snippet
```java
        ValidateUtils.checkNotNullAndNotEmpty(name, "No service name specified");
        Objects.requireNonNull(service, "No service specified");
        synchronized (this) {
            currentName = name;
            currentService = service;
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `sshd-core/src/main/java/org/apache/sshd/server/auth/AsyncAuthException.java`
#### Snippet
```java
    public void setAuthed(boolean authed) {
        Object listener;
        synchronized (this) {
            if (this.authed != null) {
                return;
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `sshd-core/src/main/java/org/apache/sshd/server/auth/AsyncAuthException.java`
#### Snippet
```java
    public void addListener(Consumer<? super Boolean> listener) {
        Boolean result;
        synchronized (this) {
            if (this.listener == null) {
                this.listener = listener;
```

## RuleId[id=RedundantUnmodifiable]
### RedundantUnmodifiable
Redundant usage of the 'unmodifiableList' wrapper
in `sshd-common/src/main/java/org/apache/sshd/common/util/OsUtils.java`
#### Snippet
```java
            = Collections.unmodifiableList(Arrays.asList(LINUX_SHELL_COMMAND_NAME, "-i", "-l"));
    public static final List<String> WINDOWS_COMMAND
            = Collections.unmodifiableList(Collections.singletonList(WINDOWS_SHELL_COMMAND_NAME));

    private static final AtomicReference<String> CURRENT_USER_HOLDER = new AtomicReference<>(null);
```

### RedundantUnmodifiable
Redundant usage of the 'unmodifiableList' wrapper
in `sshd-common/src/main/java/org/apache/sshd/common/util/security/eddsa/OpenSSHEd25519PrivateKeyEntryDecoder.java`
#### Snippet
```java
    public OpenSSHEd25519PrivateKeyEntryDecoder() {
        super(EdDSAPublicKey.class, EdDSAPrivateKey.class,
              Collections.unmodifiableList(
                      Collections.singletonList(
                              KeyPairProvider.SSH_ED25519)));
```

### RedundantUnmodifiable
Redundant usage of the 'unmodifiableList' wrapper
in `sshd-common/src/main/java/org/apache/sshd/common/util/security/eddsa/Ed25519PublicKeyDecoder.java`
#### Snippet
```java
    private Ed25519PublicKeyDecoder() {
        super(EdDSAPublicKey.class, EdDSAPrivateKey.class,
              Collections.unmodifiableList(
                      Collections.singletonList(
                              KeyPairProvider.SSH_ED25519)));
```

### RedundantUnmodifiable
Redundant usage of the 'unmodifiableList' wrapper
in `sshd-common/src/main/java/org/apache/sshd/common/util/security/eddsa/Ed25519PEMResourceKeyParser.java`
#### Snippet
```java
    // TODO find out how the markers really look like for now provide something
    public static final String BEGIN_MARKER = "BEGIN EDDSA PRIVATE KEY";
    public static final List<String> BEGINNERS = Collections.unmodifiableList(Collections.singletonList(BEGIN_MARKER));

    public static final String END_MARKER = "END EDDSA PRIVATE KEY";
```

### RedundantUnmodifiable
Redundant usage of the 'unmodifiableList' wrapper
in `sshd-common/src/main/java/org/apache/sshd/common/util/security/eddsa/Ed25519PEMResourceKeyParser.java`
#### Snippet
```java

    public static final String END_MARKER = "END EDDSA PRIVATE KEY";
    public static final List<String> ENDERS = Collections.unmodifiableList(Collections.singletonList(END_MARKER));

    /**
```

### RedundantUnmodifiable
Redundant usage of the 'unmodifiableList' wrapper
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/impl/DSSPublicKeyEntryDecoder.java`
#### Snippet
```java
    public DSSPublicKeyEntryDecoder() {
        super(DSAPublicKey.class, DSAPrivateKey.class,
              Collections.unmodifiableList(Collections.singletonList(KeyPairProvider.SSH_DSS)));
    }

```

### RedundantUnmodifiable
Redundant usage of the 'unmodifiableList' wrapper
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/DESPrivateKeyObfuscator.java`
#### Snippet
```java
public class DESPrivateKeyObfuscator extends AbstractPrivateKeyObfuscator {
    public static final int DEFAULT_KEY_LENGTH = 24 /* hardwired size for 3DES */;
    public static final List<Integer> AVAILABLE_KEY_LENGTHS = Collections.unmodifiableList(
            Collections.singletonList(
                    Integer.valueOf(DEFAULT_KEY_LENGTH)));
```

### RedundantUnmodifiable
Redundant usage of the 'unmodifiableList' wrapper
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/pem/DSSPEMResourceKeyPairParser.java`
#### Snippet
```java

    public static final String END_MARKER = "END DSA PRIVATE KEY";
    public static final List<String> ENDERS = Collections.unmodifiableList(Collections.singletonList(END_MARKER));

    public static final String DSS_OID = "1.2.840.10040.4.1";
```

### RedundantUnmodifiable
Redundant usage of the 'unmodifiableList' wrapper
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/pem/DSSPEMResourceKeyPairParser.java`
#### Snippet
```java
    // Not exactly according to standard but good enough
    public static final String BEGIN_MARKER = "BEGIN DSA PRIVATE KEY";
    public static final List<String> BEGINNERS = Collections.unmodifiableList(Collections.singletonList(BEGIN_MARKER));

    public static final String END_MARKER = "END DSA PRIVATE KEY";
```

### RedundantUnmodifiable
Redundant usage of the 'unmodifiableList' wrapper
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/pem/RSAPEMResourceKeyPairParser.java`
#### Snippet
```java
    // Not exactly according to standard but good enough
    public static final String BEGIN_MARKER = "BEGIN RSA PRIVATE KEY";
    public static final List<String> BEGINNERS = Collections.unmodifiableList(Collections.singletonList(BEGIN_MARKER));

    public static final String END_MARKER = "END RSA PRIVATE KEY";
```

### RedundantUnmodifiable
Redundant usage of the 'unmodifiableList' wrapper
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/pem/RSAPEMResourceKeyPairParser.java`
#### Snippet
```java

    public static final String END_MARKER = "END RSA PRIVATE KEY";
    public static final List<String> ENDERS = Collections.unmodifiableList(Collections.singletonList(END_MARKER));

    public static final String RSA_OID = "1.2.840.113549.1.1.1";
```

### RedundantUnmodifiable
Redundant usage of the 'unmodifiableList' wrapper
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/pem/ECDSAPEMResourceKeyPairParser.java`
#### Snippet
```java

    public static final String END_MARKER = "END EC PRIVATE KEY";
    public static final List<String> ENDERS = Collections.unmodifiableList(Collections.singletonList(END_MARKER));

    /**
```

### RedundantUnmodifiable
Redundant usage of the 'unmodifiableList' wrapper
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/pem/ECDSAPEMResourceKeyPairParser.java`
#### Snippet
```java
public class ECDSAPEMResourceKeyPairParser extends AbstractPEMResourceKeyPairParser {
    public static final String BEGIN_MARKER = "BEGIN EC PRIVATE KEY";
    public static final List<String> BEGINNERS = Collections.unmodifiableList(Collections.singletonList(BEGIN_MARKER));

    public static final String END_MARKER = "END EC PRIVATE KEY";
```

### RedundantUnmodifiable
Redundant usage of the 'unmodifiableList' wrapper
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/openssh/OpenSSHRSAPrivateKeyDecoder.java`
#### Snippet
```java
    public OpenSSHRSAPrivateKeyDecoder() {
        super(RSAPublicKey.class, RSAPrivateKey.class,
              Collections.unmodifiableList(Collections.singletonList(KeyPairProvider.SSH_RSA)));
    }

```

### RedundantUnmodifiable
Redundant usage of the 'unmodifiableList' wrapper
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/openssh/OpenSSHDSSPrivateKeyEntryDecoder.java`
#### Snippet
```java
    public OpenSSHDSSPrivateKeyEntryDecoder() {
        super(DSAPublicKey.class, DSAPrivateKey.class,
              Collections.unmodifiableList(Collections.singletonList(KeyPairProvider.SSH_DSS)));
    }

```

### RedundantUnmodifiable
Redundant usage of the 'unmodifiableList' wrapper
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/pem/PKCS8PEMResourceKeyPairParser.java`
#### Snippet
```java
    // Not exactly according to standard but good enough
    public static final String BEGIN_MARKER = "BEGIN PRIVATE KEY";
    public static final List<String> BEGINNERS = Collections.unmodifiableList(Collections.singletonList(BEGIN_MARKER));

    public static final String END_MARKER = "END PRIVATE KEY";
```

### RedundantUnmodifiable
Redundant usage of the 'unmodifiableList' wrapper
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/pem/PKCS8PEMResourceKeyPairParser.java`
#### Snippet
```java

    public static final String END_MARKER = "END PRIVATE KEY";
    public static final List<String> ENDERS = Collections.unmodifiableList(Collections.singletonList(END_MARKER));

    public static final String PKCS8_FORMAT = "PKCS#8";
```

### RedundantUnmodifiable
Redundant usage of the 'unmodifiableList' wrapper
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/openssh/OpenSSHKeyPairResourceParser.java`
#### Snippet
```java

    public static final String END_MARKER = "END OPENSSH PRIVATE KEY";
    public static final List<String> ENDERS = Collections.unmodifiableList(Collections.singletonList(END_MARKER));

    public static final String AUTH_MAGIC = "openssh-key-v1";
```

### RedundantUnmodifiable
Redundant usage of the 'unmodifiableList' wrapper
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/openssh/OpenSSHKeyPairResourceParser.java`
#### Snippet
```java
public class OpenSSHKeyPairResourceParser extends AbstractKeyPairResourceParser {
    public static final String BEGIN_MARKER = "BEGIN OPENSSH PRIVATE KEY";
    public static final List<String> BEGINNERS = Collections.unmodifiableList(Collections.singletonList(BEGIN_MARKER));

    public static final String END_MARKER = "END OPENSSH PRIVATE KEY";
```

### RedundantUnmodifiable
Redundant usage of the 'unmodifiableList' wrapper
in `sshd-openpgp/src/main/java/org/apache/sshd/openpgp/PGPKeyPairResourceParser.java`
#### Snippet
```java
        PGPPrivateKeyExtractor {
    public static final String BEGIN_MARKER = "BEGIN PGP PRIVATE KEY BLOCK";
    public static final List<String> BEGINNERS = Collections.unmodifiableList(Collections.singletonList(BEGIN_MARKER));

    public static final String END_MARKER = "END PGP PRIVATE KEY BLOCK";
```

### RedundantUnmodifiable
Redundant usage of the 'unmodifiableList' wrapper
in `sshd-openpgp/src/main/java/org/apache/sshd/openpgp/PGPKeyPairResourceParser.java`
#### Snippet
```java

    public static final String END_MARKER = "END PGP PRIVATE KEY BLOCK";
    public static final List<String> ENDERS = Collections.unmodifiableList(Collections.singletonList(END_MARKER));

    public static final PGPKeyPairResourceParser INSTANCE = new PGPKeyPairResourceParser();
```

### RedundantUnmodifiable
Redundant usage of the 'unmodifiableList' wrapper
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/client/fs/SftpFileSystem.java`
#### Snippet
```java
        this.selector = selector;
        this.errorDataHandler = errorDataHandler;
        this.stores = Collections.unmodifiableList(Collections.<FileStore> singletonList(new SftpFileStore(id, this)));
        this.pool = new LinkedBlockingQueue<>(SftpModuleProperties.POOL_SIZE.getRequired(session));
        try (SftpClient client = getClient()) {
```

### RedundantUnmodifiable
Redundant usage of the 'unmodifiableList' wrapper
in `sshd-core/src/main/java/org/apache/sshd/client/ClientBuilder.java`
#### Snippet
```java
            = Collections.unmodifiableList(Collections.singletonList(ForwardedTcpipFactory.INSTANCE));
    public static final List<RequestHandler<ConnectionService>> DEFAULT_GLOBAL_REQUEST_HANDLERS
            = Collections.unmodifiableList(Collections.singletonList(OpenSshHostKeysHandler.INSTANCE));

    public static final ServerKeyVerifier DEFAULT_SERVER_KEY_VERIFIER = AcceptAllServerKeyVerifier.INSTANCE;
```

### RedundantUnmodifiable
Redundant usage of the 'unmodifiableList' wrapper
in `sshd-core/src/main/java/org/apache/sshd/client/ClientBuilder.java`
#### Snippet
```java

    public static final List<ChannelFactory> DEFAULT_CHANNEL_FACTORIES
            = Collections.unmodifiableList(Collections.singletonList(ForwardedTcpipFactory.INSTANCE));
    public static final List<RequestHandler<ConnectionService>> DEFAULT_GLOBAL_REQUEST_HANDLERS
            = Collections.unmodifiableList(Collections.singletonList(OpenSshHostKeysHandler.INSTANCE));
```

### RedundantUnmodifiable
Redundant usage of the 'unmodifiableList' wrapper
in `sshd-core/src/main/java/org/apache/sshd/client/ClientBuilder.java`
#### Snippet
```java
    // Compression is not enabled by default for the client
    public static final List<CompressionFactory> DEFAULT_COMPRESSION_FACTORIES
            = Collections.unmodifiableList(Collections.singletonList(BuiltinCompressions.none));

    public static final List<ChannelFactory> DEFAULT_CHANNEL_FACTORIES
```

## RuleId[id=TypeParameterExtendsObject]
### TypeParameterExtendsObject
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `sshd-common/src/main/java/org/apache/sshd/common/util/closeable/AutoCloseableDelegateInvocationHandler.java`
#### Snippet
```java
                method.invoke(c, args);
            } catch (Throwable t) {
                Class<? extends Object> closerType = c.getClass();
                Logger log = LoggerFactory.getLogger(closerType);
                LoggingUtils.debug(log, "invoke({}#{}) failed ({}) to execute: {}",
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `username` initializer `null` is redundant
in `sshd-common/src/main/java/org/apache/sshd/common/util/OsUtils.java`
#### Snippet
```java
     */
    public static String getCurrentUser() {
        String username = null;
        synchronized (CURRENT_USER_HOLDER) {
            username = CURRENT_USER_HOLDER.get();
```

### UnusedAssignment
Variable `octetInt` initializer `0` is redundant
in `sshd-common/src/main/java/org/apache/sshd/common/util/net/SshdSocketAddress.java`
#### Snippet
```java
            }

            int octetInt = 0;
            try {
                octetInt = Integer.parseInt(octet, 16);
```

### UnusedAssignment
The value `null` assigned to `password` is never used
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/AbstractPrivateKeyObfuscator.java`
#### Snippet
```java
            return keyValue;
        } finally {
            password = null;
            Arrays.fill(passBytes, (byte) 0); // clean up sensitive data a.s.a.p.
            Arrays.fill(prevHash, (byte) 0); // clean up sensitive data a.s.a.p.
```

### UnusedAssignment
Variable `factory` initializer `null` is redundant
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/KeyUtils.java`
#### Snippet
```java
     */
    public static DigestFactory getDefaultFingerPrintFactory() {
        DigestFactory factory = null;
        synchronized (DEFAULT_DIGEST_HOLDER) {
            factory = DEFAULT_DIGEST_HOLDER.get();
```

### UnusedAssignment
The value `hdrValue.toUpperCase()` assigned to `hdrValue` is never used
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/pem/AbstractPEMResourceKeyPairParser.java`
#### Snippet
```java
                }

                hdrValue = hdrValue.toUpperCase();
                encrypted = Boolean.valueOf(line.contains("ENCRYPTED"));
            } else if (hdrName.equalsIgnoreCase("DEK-Info")) {
```

### UnusedAssignment
The value `null` assigned to `password` is never used
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/pem/AbstractPEMResourceKeyPairParser.java`
#### Snippet
```java
                    ResourceDecodeResult result
                            = passwordProvider.handleDecodeAttemptResult(session, resourceKey, retryIndex, password, e);
                    password = null; // get rid of sensitive data a.s.a.p.
                    if (result == null) {
                        result = ResourceDecodeResult.TERMINATE;
```

### UnusedAssignment
The value `null` assigned to `password` is never used
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/pem/AbstractPEMResourceKeyPairParser.java`
#### Snippet
```java

                passwordProvider.handleDecodeAttemptResult(session, resourceKey, retryIndex, password, null);
                password = null; // get rid of sensitive data a.s.a.p.
                return keys;
            }
```

### UnusedAssignment
Variable `off` initializer `0` is redundant
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/openssh/kdf/BCrypt.java`
#### Snippet
```java
      byte passwordb[], saltb[], hashed[];
      char minor = (char)0;
      int rounds, off = 0;
      StringBuffer rs = new StringBuffer();

```

### UnusedAssignment
The value `null` assigned to `pwd` is never used
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/openssh/OpenSSHKeyPairResourceParser.java`
#### Snippet
```java
                    ResourceDecodeResult result
                            = passwordProvider.handleDecodeAttemptResult(session, resourceKey, retryCount, pwd, e);
                    pwd = null; // get rid of sensitive data a.s.a.p.
                    if (result == null) {
                        result = ResourceDecodeResult.TERMINATE;
```

### UnusedAssignment
The value `null` assigned to `pwd` is never used
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/openssh/OpenSSHKeyPairResourceParser.java`
#### Snippet
```java

                passwordProvider.handleDecodeAttemptResult(session, resourceKey, retryCount, pwd, null);
                pwd = null; // get rid of sensitive data a.s.a.p.
                return keys;
            }
```

### UnusedAssignment
Variable `kp` initializer `null` is redundant
in `sshd-common/src/main/java/org/apache/sshd/server/keyprovider/AbstractGeneratorHostKeyProvider.java`
#### Snippet
```java

        // either no file specified or no key in file
        KeyPair kp = null;
        try {
            kp = generateKeyPair(alg);
```

### UnusedAssignment
Variable `values` initializer `null` is redundant
in `sshd-ldap/src/main/java/org/apache/sshd/ldap/LdapNetworkConnector.java`
#### Snippet
```java
        }

        List<Object> values = null;
        if (prev instanceof List<?>) {
            values = (List<Object>) prev;
```

### UnusedAssignment
The value `buffer.getInt()` assigned to `valid` is never used
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/client/impl/AbstractSftpClient.java`
#### Snippet
```java
                int valid = 0xffffffff;
                if (version >= SftpConstants.SFTP_V6) {
                    valid = buffer.getInt();
                }
                // TODO: handle attrib bits
```

### UnusedAssignment
The value `buffer.getInt()` assigned to `valid` is never used
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/common/SftpHelper.java`
#### Snippet
```java
                int valid = 0xffffffff;
                if (version >= SftpConstants.SFTP_V6) {
                    valid = buffer.getInt();
                }
                // TODO: handle attrib bits
```

### UnusedAssignment
The value `buffer.getInt()` assigned to `aclFlags` is never used
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/common/SftpHelper.java`
#### Snippet
```java
        int aclFlags = 0; // TODO handle ACL flags
        if (version >= SftpConstants.SFTP_V6) {
            aclFlags = buffer.getInt();
        }

```

### UnusedAssignment
The value `null` assigned to `password` is never used
in `sshd-putty/src/main/java/org/apache/sshd/putty/AbstractPuttyKeyDecoder.java`
#### Snippet
```java
                    ResourceDecodeResult result
                            = passwordProvider.handleDecodeAttemptResult(session, resourceKey, retryIndex, password, e);
                    password = null; // get rid of sensitive data a.s.a.p.
                    if (result == null) {
                        result = ResourceDecodeResult.TERMINATE;
```

### UnusedAssignment
The value `null` assigned to `password` is never used
in `sshd-putty/src/main/java/org/apache/sshd/putty/AbstractPuttyKeyDecoder.java`
#### Snippet
```java
                    }

                    password = null; // GC hint - don't keep sensitive data in memory longer than necessary
                    switch (result) {
                        case TERMINATE:
```

### UnusedAssignment
The value `null` assigned to `password` is never used
in `sshd-putty/src/main/java/org/apache/sshd/putty/AbstractPuttyKeyDecoder.java`
#### Snippet
```java

                passwordProvider.handleDecodeAttemptResult(session, resourceKey, retryIndex, password, null);
                password = null; // get rid of sensitive data a.s.a.p.
                return keys;
            }
```

### UnusedAssignment
Variable `reply` initializer `null` is redundant
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/server/SftpSubsystem.java`
#### Snippet
```java
        }

        Buffer reply = null;
        try {
            DirectoryHandle dh = validateHandle(handle, h, DirectoryHandle.class);
```

### UnusedAssignment
The value `StandardCharsets.US_ASCII` assigned to `charset` is never used
in `sshd-core/src/main/java/org/apache/sshd/client/session/ClientSession.java`
#### Snippet
```java
            throws IOException {
        if (charset == null) {
            charset = StandardCharsets.US_ASCII;
        }

```

### UnusedAssignment
Variable `currentWrite` initializer `null` is redundant
in `sshd-core/src/main/java/org/apache/sshd/common/channel/ChannelAsyncOutputStream.java`
#### Snippet
```java

    protected void doWriteIfPossible(boolean resume) {
        IoWriteFutureImpl currentWrite = null;
        State openState;
        synchronized (writeState) {
```

### UnusedAssignment
Variable `current` initializer `null` is redundant
in `sshd-core/src/main/java/org/apache/sshd/common/channel/ChannelAsyncOutputStream.java`
#### Snippet
```java

    protected void shutdown() {
        IoWriteFutureImpl current = null;
        int total;
        int notSent;
```

### UnusedAssignment
Variable `hashMatches` initializer `false` is redundant
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/server/AbstractSftpSubsystemHelper.java`
#### Snippet
```java
        byte[] digestBuf = new byte[(int) Math.min(effectiveLength, SftpConstants.MD5_QUICK_HASH_SIZE)];
        ByteBuffer wb = ByteBuffer.wrap(digestBuf);
        boolean hashMatches = false;
        byte[] hashValue = null;
        SftpFileSystemAccessor accessor = getFileSystemAccessor();
```

### UnusedAssignment
Variable `block` initializer `null` is redundant
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/KeyExchangeMessageHandler.java`
#### Snippet
```java
        boolean holdsFutureLock = Thread.holdsLock(session.getFutureLock());
        for (;;) {
            DefaultKeyExchangeFuture block = null;
            // We must decide _and_ write the packet while holding the lock. If we'd write the packet outside this
            // lock, there is no guarantee that a concurrently running KEX_INIT received from the peer doesn't change
```

### UnusedAssignment
Variable `future` initializer `null` is redundant
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/KeyExchangeMessageHandler.java`
#### Snippet
```java
        boolean isLowLevelMessage = cmd <= SshConstants.SSH_MSG_KEX_LAST && cmd != SshConstants.SSH_MSG_SERVICE_REQUEST
                && cmd != SshConstants.SSH_MSG_SERVICE_ACCEPT;
        IoWriteFuture future = null;
        try {
            if (isLowLevelMessage) {
```

### UnusedAssignment
Variable `done` initializer `false` is redundant
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/AbstractSession.java`
#### Snippet
```java
        GlobalRequestFuture future = request(buffer, request, null);
        Object result;
        boolean done = false;
        try {
            if (debugEnabled) {
```

### UnusedAssignment
The value `true` assigned to `optDirAsPlain` is never used
in `sshd-scp/src/main/java/org/apache/sshd/scp/server/ScpShell.java`
#### Snippet
```java
                            break;
                        case 'd':
                            optDirAsPlain = true;
                            break;
                        case 'l':
```

## RuleId[id=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `sshd-common/src/main/java/org/apache/sshd/common/Property.java`
#### Snippet
```java

    default T getRequiredDefault() {
        return getDefault().get();
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `sshd-common/src/main/java/org/apache/sshd/common/Property.java`
#### Snippet
```java
     */
    default T getRequired(PropertyResolver resolver) {
        return get(resolver).get();
    }

```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `modified` is always `false` when reached
in `sshd-common/src/main/java/org/apache/sshd/client/config/hosts/HostConfigEntry.java`
#### Snippet
```java
         * NOTE !!! DO NOT TRY TO CHANGE THE ORDER OF THE OR-ing AS IT WOULD CAUSE INVALID CODE EXECUTION
         */
        modified = updateGlobalPort(globalEntry.getPort()) || modified;
        modified = updateGlobalHostName(globalEntry.getHostName()) || modified;
        modified = updateGlobalUserName(globalEntry.getUsername()) || modified;
```

### ConstantValue
Value `t` is always 'null'
in `sshd-common/src/main/java/org/apache/sshd/common/util/ExceptionUtils.java`
#### Snippet
```java
        // NOTE: check order is important - e.g., InvocationTargetException extends ReflectiveOperationException
        if (t == null) {
            return t;
        } else if (t instanceof UndeclaredThrowableException) {
            Throwable wrapped = ((UndeclaredThrowableException) t).getUndeclaredThrowable();
```

### ConstantValue
Value `t` is always 'null'
in `sshd-common/src/main/java/org/apache/sshd/common/util/ExceptionUtils.java`
#### Snippet
```java
    public static Throwable resolveExceptionCause(Throwable t) {
        if (t == null) {
            return t;
        }

```

### ConstantValue
Condition `inetAddresses != null` is always `true`
in `sshd-common/src/main/java/org/apache/sshd/common/util/net/SshdSocketAddress.java`
#### Snippet
```java

                for (Enumeration<InetAddress> inetAddresses = netint.getInetAddresses();
                     (inetAddresses != null) && inetAddresses.hasMoreElements();) {
                    InetAddress inetAddress = inetAddresses.nextElement();
                    if (isValidHostAddress(inetAddress)) {
```

### ConstantValue
Condition `iter == null` is always `false`
in `sshd-common/src/main/java/org/apache/sshd/common/util/GenericUtils.java`
#### Snippet
```java
        } else {
            Iterator<? extends T> iter = it.iterator();
            return ((iter == null) || (!iter.hasNext())) ? null : iter.next();
        }
    }
```

### ConstantValue
Condition `!iterator.hasNext()` is always `true`
in `sshd-common/src/main/java/org/apache/sshd/common/util/closeable/SequentialCloseable.java`
#### Snippet
```java
                    }
                }
                if (!iterator.hasNext()) {
                    if (log.isDebugEnabled()) {
                        log.debug("doClose({}) signal close complete immediately={}", this, immediately);
```

### ConstantValue
Result of `iterator.hasNext()` is always 'false'
in `sshd-common/src/main/java/org/apache/sshd/common/util/closeable/SequentialCloseable.java`
#### Snippet
```java
                    }
                }
                if (!iterator.hasNext()) {
                    if (log.isDebugEnabled()) {
                        log.debug("doClose({}) signal close complete immediately={}", this, immediately);
```

### ConstantValue
Value `immediately` is always 'false'
in `sshd-common/src/main/java/org/apache/sshd/common/util/closeable/FuturesCloseable.java`
#### Snippet
```java
                int pendingCount = count.decrementAndGet();
                if (traceEnabled) {
                    log.trace("doClose({}) complete pending: {}", immediately, pendingCount);
                }
                if (pendingCount == 0) {
```

### ConstantValue
Value `immediately` is always 'false'
in `sshd-common/src/main/java/org/apache/sshd/common/util/closeable/FuturesCloseable.java`
#### Snippet
```java
                    int pendingCount = count.incrementAndGet();
                    if (traceEnabled) {
                        log.trace("doClose({}) future pending: {}", immediately, pendingCount);
                    }
                    f.addListener(listener);
```

### ConstantValue
Condition `buffer == null` is always `false` when reached
in `sshd-common/src/main/java/org/apache/sshd/common/util/buffer/Buffer.java`
#### Snippet
```java
        } else {
            throw new IllegalArgumentException("No buffered overload found for "
                                               + ((buffer == null) ? null : buffer.getClass().getName()));
        }
    }
```

### ConstantValue
Condition `initVector != null` is always `false`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/pem/AbstractPEMResourceKeyPairParser.java`
#### Snippet
```java

        List<String> dataLines = lines.subList(dataStartIndex, lines.size());
        if ((encrypted != null) || (algInfo != null) || (initVector != null)) {
            if (passwordProvider == null) {
                throw new CredentialException("Missing password provider for encrypted resource=" + resourceKey);
```

### ConstantValue
Condition `x < 0` is always `false`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/openssh/kdf/BCrypt.java`
#### Snippet
```java
   */
  private static byte char64(char x) {
      if (x < 0 || x > index_64.length)
          return -1;
      return index_64[x];
```

### ConstantValue
Condition `idx3 < 0` is always `false`
in `sshd-common/src/main/java/org/apache/sshd/common/channel/SttySupport.java`
#### Snippet
```java
                continue;
            }
            String val = stty.substring(idx2 + 1, idx3 < 0 ? stty.length() : idx3).trim();
            if (val.contains("undef")) {
                return -1;
```

### ConstantValue
Condition `key == null` is always `false`
in `sshd-openpgp/src/main/java/org/apache/sshd/openpgp/PGPPublicKeyFileWatcher.java`
#### Snippet
```java
        }

        return (key == null) ? null : key.toPublicKey();
    }
}
```

### ConstantValue
Condition `logStream != null` is always `true`
in `sshd-cli/src/main/java/org/apache/sshd/cli/client/SftpCommandMain.java`
#### Snippet
```java
            try {
                SftpClientFactory clientFactory = resolveSftpClientFactory(session);
                Logger logger = (logStream != null)
                        ? CliLogger.getLogger(SftpCommandMain.class, level,
                                (logStream instanceof PrintStream) ? (PrintStream) logStream : new PrintStream(logStream))
```

### ConstantValue
Value `err` is always 'null'
in `sshd-spring-sftp/src/main/java/org/apache/sshd/sftp/spring/integration/SpringSftpSession.java`
#### Snippet
```java
            closeClientInstance(client);
        } catch (Exception e) {
            err = ExceptionUtils.accumulateException(err, e);
        }

```

### ConstantValue
Condition `!error` is always `true` when reached
in `sshd-cli/src/main/java/org/apache/sshd/cli/client/ScpCommandMain.java`
#### Snippet
```java
        boolean error = false;
        boolean threeWay = false;
        for (int index = 0; (index < numArgs) && (!error); index++) {
            String argName = args[index];
            // handled by 'setupClientSession'
```

### ConstantValue
Value `error` is always 'false'
in `sshd-cli/src/main/java/org/apache/sshd/cli/client/ScpCommandMain.java`
#### Snippet
```java
        boolean error = false;
        boolean threeWay = false;
        for (int index = 0; (index < numArgs) && (!error); index++) {
            String argName = args[index];
            // handled by 'setupClientSession'
```

### ConstantValue
Value `err` is always 'null'
in `sshd-cli/src/main/java/org/apache/sshd/cli/client/SshKeyScanMain.java`
#### Snippet
```java
                input.close();
            } catch (IOException e) {
                err = ExceptionUtils.accumulateException(err, e);
            } finally {
                input = null;
```

### ConstantValue
Condition `!error` is always `true`
in `sshd-cli/src/main/java/org/apache/sshd/cli/client/SshClientCliSupport.java`
#### Snippet
```java
        List<NamedFactory<Compression>> compressions = null;
        int numArgs = GenericUtils.length(args);
        for (int i = 0; (!error) && (i < numArgs); i++) {
            String argName = args[i];
            String argVal = null;
```

### ConstantValue
Value `error` is always 'false'
in `sshd-cli/src/main/java/org/apache/sshd/cli/client/SshClientCliSupport.java`
#### Snippet
```java
        List<NamedFactory<Compression>> compressions = null;
        int numArgs = GenericUtils.length(args);
        for (int i = 0; (!error) && (i < numArgs); i++) {
            String argName = args[i];
            String argVal = null;
```

### ConstantValue
Value `err` is always 'null'
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/client/impl/SimpleSftpClientImpl.java`
#### Snippet
```java
                return closer;
            } catch (Exception e) {
                err = ExceptionUtils.accumulateException(err, e);
            } finally {
                if (client != null) {
```

### ConstantValue
Value `completed` is always 'true'
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/client/impl/SftpRemotePathChannel.java`
#### Snippet
```java
        if (debugEnabled) {
            log.debug("doWrite({})[position={}] used {}/{} with copySize={} - totalWritten={}, completed={}",
                    this, position, numBufsUsed, buffers.size(), copySize, totalWritten, completed);
        }

```

### ConstantValue
Value `completed` is always 'true'
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/client/impl/SftpRemotePathChannel.java`
#### Snippet
```java
        if (debugEnabled) {
            log.debug("doRead({})[position={}] filled {}/{} with copySize={} - totalRead={}, completed={}, eof={}",
                    this, position, numBufsUsed, buffers.size(), copySize, totalRead, completed, eof);
        }

```

### ConstantValue
Value `completed` is always 'true'
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/client/impl/SftpRemotePathChannel.java`
#### Snippet
```java
        if (debugEnabled) {
            log.debug("transferFrom({})[position={}, count={}] use copySize={} - totalRead={}, completed={} for source={}",
                    this, position, count, copySize, totalRead, completed, src);
        }
        return totalRead;
```

### ConstantValue
Condition `e instanceof RuntimeException` is always `true`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/client/fs/SftpFileSystemProvider.java`
#### Snippet
```java
                if (e instanceof IOException) {
                    throw (IOException) e;
                } else if (e instanceof RuntimeException) {
                    throw (RuntimeException) e;
                } else {
```

### ConstantValue
Condition `"false".equals("value")` is always `false` when reached
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/client/fs/SftpFileSystemProvider.java`
#### Snippet
```java
            if (NumberUtils.isIntegerNumber(value)) {
                map.put(key, Long.valueOf(value));
            } else if ("true".equals(value) || "false".equals("value")) {
                map.put(key, Boolean.valueOf(value));
            } else {
```

### ConstantValue
Condition `parsed == null` is always `false`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/client/impl/AbstractSftpClient.java`
#### Snippet
```java
        if (parsed == null) {
            parsed = ParserUtils.parse(extensions);
            if (parsed == null) {
                parsed = Collections.emptyMap();
            }
```

### ConstantValue
Condition `count >= 0` is always `true`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/common/SftpHelper.java`
#### Snippet
```java
        }

        ValidateUtils.checkTrue(count >= 0, "Invalid ACL entries count: %d", count);
        if (count == 0) {
            return Collections.emptyList();
```

### ConstantValue
Value `err` is always 'null'
in `sshd-contrib/src/main/java/org/apache/sshd/contrib/common/compression/DeflatingInputStream.java`
#### Snippet
```java
            compressor.close();
        } catch (IOException e) {
            err = ExceptionUtils.accumulateException(err, e);
        }

```

### ConstantValue
Value `err` is always 'null'
in `sshd-core/src/main/java/org/apache/sshd/client/simple/AbstractSimpleClientSessionCreator.java`
#### Snippet
```java
            session = null; // disable auto-close
        } catch (IOException e) {
            err = ExceptionUtils.accumulateException(err, e);
        } finally {
            if (session != null) {
```

### ConstantValue
Value `err` is always 'null'
in `sshd-core/src/main/java/org/apache/sshd/client/SshClient.java`
#### Snippet
```java
                    client.close();
                } catch (Exception e) {
                    err = ExceptionUtils.accumulateException(err, e);
                }

```

### ConstantValue
Value `service` is always 'null'
in `sshd-core/src/main/java/org/apache/sshd/common/io/AbstractIoServiceFactory.java`
#### Snippet
```java
    protected <S extends IoService> S autowireCreatedService(S service) {
        if (service == null) {
            return service;
        }

```

### ConstantValue
Condition `length > Integer.MAX_VALUE` is always `false`
in `sshd-core/src/main/java/org/apache/sshd/common/channel/ChannelOutputStream.java`
#### Snippet
```java
                long lenToSend = Math.min(available, total);
                long length = Math.min(lenToSend, remoteWindow.getPacketSize());
                if (length > Integer.MAX_VALUE) {
                    throw new StreamCorruptedException("Accumulated " + SshConstants.getCommandMessageName(cmd)
                                                       + " command bytes size (" + length + ") exceeds int boundaries");
```

### ConstantValue
Condition `l2 <= Integer.MAX_VALUE` is always `true`
in `sshd-core/src/main/java/org/apache/sshd/common/channel/ChannelOutputStream.java`
#### Snippet
```java
                    }

                    ValidateUtils.checkTrue(l2 <= Integer.MAX_VALUE, "Accumulated bytes length exceeds int boundary: %d", l2);
                    buffer.putRawBytes(buf, s, (int) l2);
                    bufferLength += l2;
```

### ConstantValue
Condition `!flushed` is always `true` when reached
in `sshd-core/src/main/java/org/apache/sshd/common/channel/ChannelOutputStream.java`
#### Snippet
```java
        }

        if (isNoDelay() && !flushed) {
            flush();
        } else {
```

### ConstantValue
Value `flushed` is always 'false'
in `sshd-core/src/main/java/org/apache/sshd/common/channel/ChannelOutputStream.java`
#### Snippet
```java
        }

        if (isNoDelay() && !flushed) {
            flush();
        } else {
```

### ConstantValue
Value `immediately` is always 'false'
in `sshd-core/src/main/java/org/apache/sshd/common/channel/AbstractChannel.java`
#### Snippet
```java
            } else if (!gracefulFuture.isClosed()) {
                if (debugEnabled) {
                    log.debug("close({})[immediately={}] send SSH_MSG_CHANNEL_CLOSE", channel, immediately);
                }

```

### ConstantValue
Value `immediately` is always 'false'
in `sshd-core/src/main/java/org/apache/sshd/common/channel/AbstractChannel.java`
#### Snippet
```java
                    s.writePacket(buffer, timeout).addListener(future -> {
                        if (future.isWritten()) {
                            handleClosePacketWritten(channel, immediately);
                        } else {
                            handleClosePacketWriteFailure(channel, immediately, future.getException());
```

### ConstantValue
Value `immediately` is always 'false'
in `sshd-core/src/main/java/org/apache/sshd/common/channel/AbstractChannel.java`
#### Snippet
```java
                            handleClosePacketWritten(channel, immediately);
                        } else {
                            handleClosePacketWriteFailure(channel, immediately, future.getException());
                        }
                    });
```

### ConstantValue
Value `immediately` is always 'false'
in `sshd-core/src/main/java/org/apache/sshd/common/channel/AbstractChannel.java`
#### Snippet
```java
                } catch (IOException e) {
                    debug("close({})[immediately={}] {} while writing SSH_MSG_CHANNEL_CLOSE packet on channel: {}",
                            channel, immediately, e.getClass().getSimpleName(), e.getMessage(), e);
                    channel.close(true);
                }
```

### ConstantValue
Condition `session == null` is always `false`
in `sshd-core/src/main/java/org/apache/sshd/common/forward/DefaultForwarder.java`
#### Snippet
```java
        }

        FactoryManager manager = (session == null) ? null : session.getFactoryManager();
        l = (manager == null) ? null : manager.getPortForwardingEventListenerProxy();
        if (l != null) {
```

### ConstantValue
Value `err` is always 'null'
in `sshd-core/src/main/java/org/apache/sshd/common/forward/DefaultForwarder.java`
#### Snippet
```java
        } catch (Throwable t) {
            Throwable e = ExceptionUtils.peelException(t);
            err = ExceptionUtils.accumulateException(err, e);
        }

```

### ConstantValue
Value `proxy` is always 'null'
in `sshd-core/src/main/java/org/apache/sshd/common/forward/DefaultForwarder.java`
#### Snippet
```java
                if (prevProxy != null) {
                    throw new IOException("Multiple dynamic port mappings found for port=" + port
                                          + ": current=" + proxy + ", previous=" + prevProxy);
                }

```

### ConstantValue
Value `remote` is always 'null'
in `sshd-core/src/main/java/org/apache/sshd/common/forward/DefaultForwarder.java`
#### Snippet
```java
                    if (log.isDebugEnabled()) {
                        log.debug("sessionCreated({})[local={}, remote={}, accepted={}] localEntry={}",
                                session, local, remote, accepted, localEntry);
                    }
                    channel.updateLocalForwardingEntry(localEntry);
```

### ConstantValue
Value `remote` is always 'null'
in `sshd-core/src/main/java/org/apache/sshd/common/forward/DefaultForwarder.java`
#### Snippet
```java
                } else {
                    log.warn("sessionCreated({})[local={}, remote={}] cannot locate original local entry for accepted={}",
                            session, local, remote, accepted);
                }
            } else {
```

### ConstantValue
Condition `!allFlushed` is always `true`
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/KeyExchangeMessageHandler.java`
#### Snippet
```java
                int lastSize = -1;
                int take = 2;
                while (!allFlushed) {
                    if (!session.isOpen()) {
                        log.info("flushQueue({}): Session closed while flushing pending packets at end of KEX", session);
```

### ConstantValue
Value `allFlushed` is always 'false'
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/KeyExchangeMessageHandler.java`
#### Snippet
```java
                int lastSize = -1;
                int take = 2;
                while (!allFlushed) {
                    if (!session.isOpen()) {
                        log.info("flushQueue({}): Session closed while flushing pending packets at end of KEX", session);
```

### ConstantValue
Value `err` is always 'null'
in `sshd-core/src/main/java/org/apache/sshd/server/shell/InvertedShellWrapper.java`
#### Snippet
```java
            warn("destroy({}) failed ({}) to destroy shell: {}",
                    this, e.getClass().getSimpleName(), e.getMessage(), e);
            err = ExceptionUtils.accumulateException(err, e);
        }

```

### ConstantValue
Value `authed` is always 'false'
in `sshd-core/src/main/java/org/apache/sshd/server/session/ServerUserAuthService.java`
#### Snippet
```java

        if (cmd == SshConstants.SSH_MSG_USERAUTH_REQUEST) {
            AtomicReference<Boolean> authHolder = new AtomicReference<>(authed);
            if (!handleUserAuthRequestMessage(session, buffer, authHolder)) {
                return;
```

### ConstantValue
Value `immediately` is always 'false'
in `sshd-core/src/main/java/org/apache/sshd/server/channel/ChannelSession.java`
#### Snippet
```java
                    if (debugEnabled) {
                        log.debug("close({})[immediately={}] failed ({}) to close receiver(s): {}",
                                this, immediately, e.getClass().getSimpleName(), e.getMessage());
                    }
                }
```

### ConstantValue
Condition `opcode <= 255` is always `true` when reached
in `sshd-core/src/main/java/org/apache/sshd/server/channel/ChannelSession.java`
#### Snippet
```java
             * Opcodes 160 to 255 are not yet defined, and cause parsing to stop
             */
            if ((opcode >= 160) && (opcode <= 255)) {
                log.warn("handlePtyReq({}) unknown reserved pty opcode value: {}", this, opcode);
                break;
```

### ConstantValue
Condition `bufSize < 0` is always `false`
in `sshd-scp/src/main/java/org/apache/sshd/scp/common/ScpHelper.java`
#### Snippet
```java
        }

        if (bufSize < 0) { // TODO consider throwing an exception
            log.warn("sendStream({})[{}] bad buffer size ({}) using default ({})", this, resolver, bufSize,
                    MIN_SEND_BUFFER_SIZE);
```

### ConstantValue
Condition `variance < 0` is always `false`
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/SessionHelper.java`
#### Snippet
```java
        }

        int extra = r.random((variance < 0) ? (0 - variance) : variance);
        long count = (variance < 0) ? (freq - extra) : (freq + extra);
        if (log.isTraceEnabled()) {
```

### ConstantValue
Condition `variance < 0` is always `false`
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/SessionHelper.java`
#### Snippet
```java

        int extra = r.random((variance < 0) ? (0 - variance) : variance);
        long count = (variance < 0) ? (freq - extra) : (freq + extra);
        if (log.isTraceEnabled()) {
            log.trace("calculateNextIgnorePacketCount({}) count={}", this, count);
```

## RuleId[id=IOResource]
### IOResource
'SftpOutputStreamAsync' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/client/impl/SftpRemotePathChannel.java`
#### Snippet
```java
                // DO NOT CLOSE THE OUTPUT STREAM AS IT WOULD CLOSE THE HANDLE
                @SuppressWarnings("resource")
                SftpOutputStreamAsync output = new SftpOutputStreamAsync(
                        (AbstractSftpClient) sftp,
                        copySize, getRemotePath(), handle);
```

### IOResource
'SftpInputStreamAsync' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/client/impl/SftpRemotePathChannel.java`
#### Snippet
```java
                // DO NOT CLOSE THE STREAM AS IT WOULD CLOSE THE HANDLE
                @SuppressWarnings("resource")
                SftpInputStreamAsync input = new SftpInputStreamAsync(
                        (AbstractSftpClient) sftp,
                        copySize, position, count, getRemotePath(), handle);
```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `sshd-common/src/main/java/org/apache/sshd/common/util/closeable/AbstractCloseable.java`
#### Snippet
```java
        /** Connection is closed */
        Closed,
        /* end */;
    }

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `sshd-core/src/main/java/org/apache/sshd/common/kex/extension/KexExtensionHandler.java`
#### Snippet
```java
         * sessions, but code should not rely on this implicit assumption.
         */
        AUTHOK;
    }

```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Argument `lineBuf` might be null
in `sshd-common/src/main/java/org/apache/sshd/common/util/io/output/LineOutputStream.java`
#### Snippet
```java
            byte[] tmp = new byte[reqLen + Byte.SIZE /* a bit extra to avoid frequent re-sizing */];
            if (usedLen > 0) {
                System.arraycopy(lineBuf, 0, tmp, 0, usedLen);
            }
            lineBuf = tmp;
```

### DataFlowIssue
Argument `w` might be null
in `sshd-common/src/main/java/org/apache/sshd/common/util/buffer/keys/ECBufferPublicKeyParser.java`
#### Snippet
```java
        }

        return generatePublicKey(KeyUtils.EC_ALGORITHM, new ECPublicKeySpec(w, spec));
    }
}
```

### DataFlowIssue
Method invocation `replaceAll` may produce `NullPointerException`
in `sshd-common/src/main/java/org/apache/sshd/common/util/net/SshdSocketAddress.java`
#### Snippet
```java
            return null;
        } else {
            return ip.replaceAll(".*/", "");
        }
    }
```

### DataFlowIssue
Method invocation `getSecurityProvider` may produce `NullPointerException`
in `sshd-common/src/main/java/org/apache/sshd/common/util/security/SecurityProviderRegistrar.java`
#### Snippet
```java

        p = ValidateUtils.checkNotNull(
                registrar.getSecurityProvider(), "No provider created for registrar of %s", name);
        if (registrar.isNamedProviderUsed()) {
            Security.addProvider(p);
```

### DataFlowIssue
Argument `group` might be null
in `sshd-common/src/main/java/org/apache/sshd/common/util/buffer/Buffer.java`
#### Snippet
```java

        KeyFactory keyFactory = SecurityUtils.getKeyFactory(KeyUtils.EC_ALGORITHM);
        PublicKey pubKey = keyFactory.generatePublic(new ECPublicKeySpec(group, spec));
        PrivateKey privKey = keyFactory.generatePrivate(new ECPrivateKeySpec(exponent, spec));
        return new KeyPair(pubKey, privKey);
```

### DataFlowIssue
Method invocation `getValue` may produce `NullPointerException`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/AuthorizedKeyEntry.java`
#### Snippet
```java
        if (decoder == null) {
            Map.Entry<String, String> comps = resolveEntryComponents(line);
            entry = parseAuthorizedKeyEntry(comps.getValue());
            ValidateUtils.checkTrue(entry != null, "Bad format (no key data after login options): %s", line);
            entry.setLoginOptions(parseLoginOptions(comps.getKey()));
```

### DataFlowIssue
Method invocation `setLoginOptions` may produce `NullPointerException`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/AuthorizedKeyEntry.java`
#### Snippet
```java
            entry = parseAuthorizedKeyEntry(comps.getValue());
            ValidateUtils.checkTrue(entry != null, "Bad format (no key data after login options): %s", line);
            entry.setLoginOptions(parseLoginOptions(comps.getKey()));
        } else {
            String encData = (endPos < (line.length() - 1)) ? line.substring(0, endPos).trim() : line;
```

### DataFlowIssue
Condition `err instanceof GeneralSecurityException` is redundant and can be replaced with a null check
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/openssh/kdf/BCryptKdfOptions.java`
#### Snippet
```java
            if (err instanceof IOException) {
                throw (IOException) err;
            } else if (err instanceof GeneralSecurityException) {
                throw (GeneralSecurityException) err;
            } else {
```

### DataFlowIssue
Method invocation `encodePrivateKey` may produce `NullPointerException`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/writer/openssh/OpenSSHKeyPairResourceWriter.java`
#### Snippet
```java
                    = (PrivateKeyEntryDecoder<PublicKey, PrivateKey>) OpenSSHKeyPairResourceParser
                            .getPrivateKeyEntryDecoder(keyType);
            if (encoder.encodePrivateKey(out, key.getPrivate(), key.getPublic()) == null) {
                throw new GeneralSecurityException("Cannot encode key of type " + keyType);
            }
```

### DataFlowIssue
Method invocation `length` may produce `NullPointerException`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/writer/openssh/OpenSSHKeyPairResourceWriter.java`
#### Snippet
```java
        }

        for (int pos = 0, len = password.length(); pos < len; pos++) {
            char ch = password.charAt(pos);
            if (!Character.isWhitespace(ch)) {
```

### DataFlowIssue
Method invocation `getValue` may produce `NullPointerException`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/openssh/OpenSSHKeyPairResourceParser.java`
#### Snippet
```java
            if (traceEnabled) {
                log.trace("extractKeyPairs({}) add private key #{}: {} {}",
                        resourceKey, keyIndex, prvType, prvData.getValue());
            }
            keyPairs.add(new KeyPair(pubKey, prvKey));
```

### DataFlowIssue
Immutable object is modified
in `sshd-openpgp/src/main/java/org/apache/sshd/openpgp/PGPPublicRingWatcher.java`
#### Snippet
```java
                matches = new ArrayList<>(numEntries);
            }
            matches.add(key);
        }

```

### DataFlowIssue
Immutable object is modified
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/AbstractKeyPairResourceParser.java`
#### Snippet
```java
                    keyPairs = new LinkedList<>(kps);
                } else {
                    keyPairs.addAll(kps);
                }
            }
```

### DataFlowIssue
Immutable object is modified
in `sshd-cli/src/main/java/org/apache/sshd/cli/CliSupport.java`
#### Snippet
```java
                String[] extra = GenericUtils.split(prefix, ' ');
                if (!GenericUtils.isEmpty(extra)) {
                    args.addAll(Arrays.asList(extra));
                }

```

### DataFlowIssue
Immutable object is modified
in `sshd-cli/src/main/java/org/apache/sshd/cli/CliSupport.java`
#### Snippet
```java

                String value = line.substring(startPos + 1, endPos);
                args.add(value);

                line = (endPos < (line.length() - 1)) ? line.substring(endPos + 1).trim() : "";
```

### DataFlowIssue
Immutable object is modified
in `sshd-cli/src/main/java/org/apache/sshd/cli/CliSupport.java`
#### Snippet
```java
                args = new LinkedList<>();
            }
            args.addAll(Arrays.asList(extra));
        }

```

### DataFlowIssue
Argument `command` might be null
in `sshd-cli/src/main/java/org/apache/sshd/cli/client/SshClientMain.java`
#### Snippet
```java
                            cmdValue = Channel.CHANNEL_SHELL;
                        } else {
                            cmdValue = String.join(" ", command).trim();
                            channel = session.createExecChannel(cmdValue, ptyConfig, env);
                        }
```

### DataFlowIssue
Immutable object is modified
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/KeyPairResourceParser.java`
#### Snippet
```java
                        keyPairs = new LinkedList<>(kps);
                    } else {
                        keyPairs.addAll(kps);
                    }
                }
```

### DataFlowIssue
Method invocation `charAt` may produce `NullPointerException`
in `sshd-cli/src/main/java/org/apache/sshd/cli/client/SftpCommandMain.java`
#### Snippet
```java
            String flags = (numComps >= 2) ? GenericUtils.trimToEmpty(comps[0]) : null;
            // ignore all flags
            if ((GenericUtils.length(pathArg) > 0) && (pathArg.charAt(0) == '-')) {
                flags = pathArg;
                pathArg = null;
```

### DataFlowIssue
Method invocation `close` may produce `NullPointerException`
in `sshd-cli/src/main/java/org/apache/sshd/cli/client/SftpCommandMain.java`
#### Snippet
```java
        } finally {
            if ((logStream != stdout) && (logStream != stderr)) {
                logStream.close();
            }
        }
```

### DataFlowIssue
Method invocation `charAt` may produce `NullPointerException`
in `sshd-cli/src/main/java/org/apache/sshd/cli/client/SftpCommandMain.java`
#### Snippet
```java
            String flags = (numComps >= 2) ? GenericUtils.trimToEmpty(comps[0]) : null;
            // ignore all flags
            if ((GenericUtils.length(pathArg) > 0) && (pathArg.charAt(0) == '-')) {
                flags = pathArg;
                pathArg = null;
```

### DataFlowIssue
Method invocation `indexOf` may produce `NullPointerException`
in `sshd-cli/src/main/java/org/apache/sshd/cli/client/SftpCommandMain.java`
#### Snippet
```java
            int version = sftp.getVersion();
            boolean showLongName
                    = (version == SftpConstants.SFTP_V3) && (GenericUtils.length(flags) > 1) && (flags.indexOf('l') > 0);
            for (SftpClient.DirEntry entry : sftp.readDir(path)) {
                String fileName = entry.getFilename();
```

### DataFlowIssue
Method invocation `startsWith` may produce `NullPointerException`
in `sshd-cli/src/main/java/org/apache/sshd/cli/server/SshServerCliSupport.java`
#### Snippet
```java
        boolean useScp = false;
        // SCP + CUSTOM SHELL
        if (factory.startsWith(ScpCommandFactory.SCP_FACTORY_NAME + "+")) {
            factory = factory.substring(ScpCommandFactory.SCP_FACTORY_NAME.length() + 1);
            ValidateUtils.checkNotNullAndNotEmpty(factory, "No extra custom shell factory class specified");
```

### DataFlowIssue
Array access `args[numArgs - 2]` may produce `NullPointerException`
in `sshd-cli/src/main/java/org/apache/sshd/cli/client/ScpCommandMain.java`
#### Snippet
```java

            // see the way normalizeCommandArguments works...
            ScpLocation source = (numArgs >= 2) ? new ScpLocation(args[numArgs - 2]) : null;
            ScpLocation target = (numArgs >= 2) ? new ScpLocation(args[numArgs - 1]) : null;

```

### DataFlowIssue
Array access `args[index]` may produce `NullPointerException`
in `sshd-cli/src/main/java/org/apache/sshd/cli/client/ScpCommandMain.java`
#### Snippet
```java
            boolean threeWay = false;
            for (int index = 0; index < numArgs; index++) {
                String argName = args[index];
                if ("-q".equals(argName)) {
                    quiet = true;
```

### DataFlowIssue
Method invocation `close` may produce `NullPointerException`
in `sshd-cli/src/main/java/org/apache/sshd/cli/client/ScpCommandMain.java`
#### Snippet
```java
        } finally {
            if ((logStream != stdout) && (logStream != stderr)) {
                logStream.close();
            }
        }
```

### DataFlowIssue
Method invocation `resolve` may produce `NullPointerException`
in `sshd-git/src/main/java/org/apache/sshd/git/pack/GitPackCommand.java`
#### Snippet
```java

        ValidateUtils.checkNotNullAndNotEmpty(pathArg, "No %s command sub-path specified", args[0]);
        return rootDir.resolve(pathArg);
    }
}
```

### DataFlowIssue
Argument `argVal` might be null
in `sshd-cli/src/main/java/org/apache/sshd/cli/client/SshClientCliSupport.java`
#### Snippet
```java
                }

                port = Integer.parseInt(argVal);
                if (port <= 0) {
                    error = CliLogger.showError(stderr, "Bad option value for " + argName + ": " + port);
```

### DataFlowIssue
Method invocation `getUsername` may produce `NullPointerException`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/client/fs/SftpFileSystemProvider.java`
#### Snippet
```java
        ValidateUtils.checkState(credentials != null, "No credentials provided");

        String username = credentials.getUsername();
        String id = getFileSystemIdentifier(host, port, username);
        SftpFileSystemInitializationContext context = new SftpFileSystemInitializationContext(id, uri, env);
```

### DataFlowIssue
Argument `extra` might be null
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/common/extensions/ParserUtils.java`
#### Snippet
```java

        Set<String> result = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        result.addAll(extra);
        result.addAll(extra2);
        return result;
```

### DataFlowIssue
Argument `extra2` might be null
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/common/extensions/ParserUtils.java`
#### Snippet
```java
        Set<String> result = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        result.addAll(extra);
        result.addAll(extra2);
        return result;
    }
```

### DataFlowIssue
Variable is already assigned to this value
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/common/SftpHelper.java`
#### Snippet
```java

            if ((flagsMask & SftpConstants.SSH_FILEXFER_ATTR_ACMODTIME) != 0) {
                buffer = writeTime(buffer, sftpVersion, flagsMask, attributes.getAccessTime());
                buffer = writeTime(buffer, sftpVersion, flagsMask, attributes.getModifyTime());
            }
```

### DataFlowIssue
Variable is already assigned to this value
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/common/SftpHelper.java`
#### Snippet
```java
            if ((flagsMask & SftpConstants.SSH_FILEXFER_ATTR_ACMODTIME) != 0) {
                buffer = writeTime(buffer, sftpVersion, flagsMask, attributes.getAccessTime());
                buffer = writeTime(buffer, sftpVersion, flagsMask, attributes.getModifyTime());
            }
        } else if (sftpVersion >= SftpConstants.SFTP_V4) {
```

### DataFlowIssue
Variable is already assigned to this value
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/common/SftpHelper.java`
#### Snippet
```java
            }
            if ((flagsMask & SftpConstants.SSH_FILEXFER_ATTR_ACCESSTIME) != 0) {
                buffer = writeTime(buffer, sftpVersion, flagsMask, attributes.getAccessTime());
            }
            if ((flagsMask & SftpConstants.SSH_FILEXFER_ATTR_CREATETIME) != 0) {
```

### DataFlowIssue
Variable is already assigned to this value
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/common/SftpHelper.java`
#### Snippet
```java
            }
            if ((flagsMask & SftpConstants.SSH_FILEXFER_ATTR_CREATETIME) != 0) {
                buffer = writeTime(buffer, sftpVersion, flagsMask, attributes.getCreateTime());
            }
            if ((flagsMask & SftpConstants.SSH_FILEXFER_ATTR_MODIFYTIME) != 0) {
```

### DataFlowIssue
Variable is already assigned to this value
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/common/SftpHelper.java`
#### Snippet
```java
            }
            if ((flagsMask & SftpConstants.SSH_FILEXFER_ATTR_MODIFYTIME) != 0) {
                buffer = writeTime(buffer, sftpVersion, flagsMask, attributes.getModifyTime());
            }
            if ((flagsMask & SftpConstants.SSH_FILEXFER_ATTR_ACL) != 0) {
```

### DataFlowIssue
Variable is already assigned to this value
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/common/SftpHelper.java`
#### Snippet
```java
            }
            if ((flagsMask & SftpConstants.SSH_FILEXFER_ATTR_ACL) != 0) {
                buffer = writeACLs(buffer, sftpVersion, attributes.getAcl());
            }

```

### DataFlowIssue
Variable is already assigned to this value
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/common/SftpHelper.java`
#### Snippet
```java

        if ((flagsMask & SftpConstants.SSH_FILEXFER_ATTR_EXTENDED) != 0) {
            buffer = writeExtensions(buffer, attributes.getExtensions());
        }

```

### DataFlowIssue
Variable is already assigned to this value
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/common/SftpHelper.java`
#### Snippet
```java
        }
        if ((flags & SftpConstants.SSH_FILEXFER_ATTR_ACMODTIME) != 0) {
            buffer = writeTime(buffer, version, flags, lastAccessTime);
            buffer = writeTime(buffer, version, flags, lastModifiedTime);
        }
```

### DataFlowIssue
Variable is already assigned to this value
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/common/SftpHelper.java`
#### Snippet
```java
        if ((flags & SftpConstants.SSH_FILEXFER_ATTR_ACMODTIME) != 0) {
            buffer = writeTime(buffer, version, flags, lastAccessTime);
            buffer = writeTime(buffer, version, flags, lastModifiedTime);
        }
        if ((flags & SftpConstants.SSH_FILEXFER_ATTR_EXTENDED) != 0) {
```

### DataFlowIssue
Variable is already assigned to this value
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/common/SftpHelper.java`
#### Snippet
```java
        }
        if ((flags & SftpConstants.SSH_FILEXFER_ATTR_EXTENDED) != 0) {
            buffer = writeExtensions(buffer, extensions);
        }

```

### DataFlowIssue
Argument `ValidateUtils.checkNotNull(decodeAclEntryType(aclType), "Unknown ACL type: %d", aclType)` might be null
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/common/SftpHelper.java`
#### Snippet
```java
        UserPrincipal who = new DefaultGroupPrincipal(aclWho);
        return AclEntry.newBuilder()
                .setType(ValidateUtils.checkNotNull(decodeAclEntryType(aclType), "Unknown ACL type: %d", aclType))
                .setFlags(decodeAclFlags(aclFlag))
                .setPermissions(decodeAclMask(aclMask))
```

### DataFlowIssue
Method invocation `longValue` may produce `NullPointerException`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/common/SftpHelper.java`
#### Snippet
```java
                : SftpConstants.SSH_FILEXFER_TYPE_UNKNOWN));
        if ((flags & SftpConstants.SSH_FILEXFER_ATTR_SIZE) != 0) {
            buffer.putLong(size.longValue());
        }
        if ((flags & SftpConstants.SSH_FILEXFER_ATTR_OWNERGROUP) != 0) {
```

### DataFlowIssue
Variable is already assigned to this value
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/common/SftpHelper.java`
#### Snippet
```java

        if ((flags & SftpConstants.SSH_FILEXFER_ATTR_ACCESSTIME) != 0) {
            buffer = writeTime(buffer, version, flags, lastAccessTime);
        }

```

### DataFlowIssue
Variable is already assigned to this value
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/common/SftpHelper.java`
#### Snippet
```java

        if ((flags & SftpConstants.SSH_FILEXFER_ATTR_CREATETIME) != 0) {
            buffer = writeTime(buffer, version, flags, creationTime);
        }
        if ((flags & SftpConstants.SSH_FILEXFER_ATTR_MODIFYTIME) != 0) {
```

### DataFlowIssue
Variable is already assigned to this value
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/common/SftpHelper.java`
#### Snippet
```java
        }
        if ((flags & SftpConstants.SSH_FILEXFER_ATTR_MODIFYTIME) != 0) {
            buffer = writeTime(buffer, version, flags, lastModifiedTime);
        }
        if ((flags & SftpConstants.SSH_FILEXFER_ATTR_ACL) != 0) {
```

### DataFlowIssue
Variable is already assigned to this value
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/common/SftpHelper.java`
#### Snippet
```java
        }
        if ((flags & SftpConstants.SSH_FILEXFER_ATTR_ACL) != 0) {
            buffer = writeACLs(buffer, version, acl);
        }
        // TODO: ctime
```

### DataFlowIssue
Variable is already assigned to this value
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/common/SftpHelper.java`
#### Snippet
```java
        // TODO: bits
        if ((flags & SftpConstants.SSH_FILEXFER_ATTR_EXTENDED) != 0) {
            buffer = writeExtensions(buffer, extensions);
        }

```

### DataFlowIssue
Method invocation `create` may produce `NullPointerException`
in `sshd-contrib/src/main/java/org/apache/sshd/contrib/common/signature/LegacyDSASigner.java`
#### Snippet
```java
        if (appRandom == null) {
            ValidateUtils.checkState(randomFactory != null, "No signing random factory provided");
            random = randomFactory.create();
        } else {
            random = null;
```

### DataFlowIssue
Variable is already assigned to this value
in `sshd-putty/src/main/java/org/apache/sshd/putty/AbstractPuttyKeyDecoder.java`
#### Snippet
```java
                    }

                    password = null; // GC hint - don't keep sensitive data in memory longer than necessary
                    switch (result) {
                        case TERMINATE:
```

### DataFlowIssue
Method invocation `initVerifier` may produce `NullPointerException`
in `sshd-core/src/main/java/org/apache/sshd/client/kex/DHGClient.java`
#### Snippet
```java
                NamedFactory.create(session.getSignatureFactories(), keyAlg),
                "No KeyExchange CA verifier located for algorithm=%s of key ID=%s", keyAlg, keyId);
        verif.initVerifier(session, signatureKey);
        verif.update(session, openSshKey.getMessage());

```

### DataFlowIssue
Method invocation `initVerifier` may produce `NullPointerException`
in `sshd-core/src/main/java/org/apache/sshd/client/kex/DHGClient.java`
#### Snippet
```java
                NamedFactory.create(session.getSignatureFactories(), keyAlg),
                "No verifier located for algorithm=%s", keyAlg);
        verif.initVerifier(session, serverPublicHostKey);
        verif.update(session, h);
        if (!verif.verify(session, sig)) {
```

### DataFlowIssue
Method invocation `initSigner` may produce `NullPointerException`
in `sshd-core/src/main/java/org/apache/sshd/client/auth/pubkey/KeyPairIdentity.java`
#### Snippet
```java
        Signature verifier = (factory == null) ? null : factory.create();
        ValidateUtils.checkNotNull(verifier, "No signer could be located for key type=%s", algo);
        verifier.initSigner(session, pair.getPrivate());
        verifier.update(session, data);

```

### DataFlowIssue
Method invocation `initVerifier` may produce `NullPointerException`
in `sshd-core/src/main/java/org/apache/sshd/client/kex/DHGEXClient.java`
#### Snippet
```java
                    NamedFactory.create(session.getSignatureFactories(), keyAlg),
                    "No verifier located for algorithm=%s", keyAlg);
            verif.initVerifier(session, serverKey);
            verif.update(session, h);
            if (!verif.verify(session, sig)) {
```

### DataFlowIssue
Method invocation `getName` may produce `NullPointerException`
in `sshd-core/src/main/java/org/apache/sshd/client/auth/pubkey/KeyPairIdentity.java`
#### Snippet
```java

        byte[] signature = verifier.sign(session);
        return new SimpleImmutableEntry<>(factory.getName(), signature);
    }

```

### DataFlowIssue
Method invocation `initSigner` may produce `NullPointerException`
in `sshd-core/src/main/java/org/apache/sshd/client/auth/hostbased/UserAuthHostBased.java`
#### Snippet
```java
            }
        }
        verifier.initSigner(session, kp.getPrivate());

        byte[] keyBytes = buffer.getCompactData();
```

### DataFlowIssue
Variable update does nothing
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/server/AbstractSftpSubsystemHelper.java`
#### Snippet
```java
            if ((flags & SftpConstants.SSH_FXF_CREAT) != 0) {
                if ((flags & SftpConstants.SSH_FXF_EXCL) != 0) {
                    pflags |= SftpConstants.SSH_FXF_CREATE_NEW;
                } else if ((flags & SftpConstants.SSH_FXF_TRUNC) != 0) {
                    pflags |= SftpConstants.SSH_FXF_CREATE_TRUNCATE;
```

### DataFlowIssue
Method invocation `start` may produce `NullPointerException`
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/CurrentService.java`
#### Snippet
```java
        Service current = getService();
        ValidateUtils.checkState(current != null, "No current SSH service; cannot start");
        current.start();
    }

```

### DataFlowIssue
Method invocation `initSigner` may produce `NullPointerException`
in `sshd-core/src/main/java/org/apache/sshd/server/kex/DHGServer.java`
#### Snippet
```java
                NamedFactory.create(session.getSignatureFactories(), algo),
                "Unknown negotiated server keys: %s", algo);
        sig.initSigner(session, kp.getPrivate());

        buffer = new ByteArrayBuffer();
```

### DataFlowIssue
Method invocation `initSigner` may produce `NullPointerException`
in `sshd-core/src/main/java/org/apache/sshd/server/kex/DHGEXServer.java`
#### Snippet
```java
                    NamedFactory.create(session.getSignatureFactories(), algo),
                    "Unknown negotiated server keys: %s", algo);
            sig.initSigner(session, kp.getPrivate());

            buffer = new ByteArrayBuffer();
```

### DataFlowIssue
Method invocation `initVerifier` may produce `NullPointerException`
in `sshd-core/src/main/java/org/apache/sshd/server/auth/pubkey/UserAuthPublicKey.java`
#### Snippet
```java
                "No verifier located for algorithm=%s",
                alg);
        verifier.initVerifier(session, key);
        buffer.wpos(oldLim);

```

### DataFlowIssue
Method invocation `initVerifier` may produce `NullPointerException`
in `sshd-core/src/main/java/org/apache/sshd/server/auth/hostbased/UserAuthHostBased.java`
#### Snippet
```java
                "No verifier located for algorithm=%s",
                keyType);
        verifier.initVerifier(session, clientKey);

        byte[] id = session.getSessionId();
```

### DataFlowIssue
Method invocation `initSigner` may produce `NullPointerException`
in `sshd-core/src/main/java/org/apache/sshd/server/global/OpenSshHostKeysHandler.java`
#### Snippet
```java
                throw new RuntimeSshException(e);
            }
            verifier.initSigner(session, kp.getPrivate());

            buf.clear();
```

### DataFlowIssue
Method invocation `initSigner` may produce `NullPointerException`
in `sshd-core/src/main/java/org/apache/sshd/certificate/OpenSshCertificateBuilder.java`
#### Snippet
```java

        final byte[] toSign = toBeSignedBuf.getCompactData();
        signer.initSigner(null, caKeypair.getPrivate());
        signer.update(null, toSign);

```

### DataFlowIssue
Method invocation `getName` may produce `NullPointerException`
in `sshd-core/src/main/java/org/apache/sshd/certificate/OpenSshCertificateBuilder.java`
#### Snippet
```java

        final ByteArrayBuffer tmpBuffer = new ByteArrayBuffer();
        tmpBuffer.putString(factory.getName());
        tmpBuffer.putBytes(signer.sign(null));

```

### DataFlowIssue
Method invocation `send` may produce `NullPointerException`
in `sshd-scp/src/main/java/org/apache/sshd/scp/client/ScpRemote2RemoteTransferHelper.java`
#### Snippet
```java
            log.debug("transferStatusCode({})[{}] {}", this, logHint, ackInfo);
        }
        ackInfo.send(out, csOut);
        return ackInfo;
    }
```

### DataFlowIssue
Method invocation `validateCommandStatusCode` may produce `NullPointerException`
in `sshd-scp/src/main/java/org/apache/sshd/scp/client/ScpRemote2RemoteTransferHelper.java`
#### Snippet
```java
        // wait for destination to signal data received
        ackInfo = ScpAckInfo.readAck(dstIn, csIn, false);
        ackInfo.validateCommandStatusCode("[DST-EOF] " + header, "transferSimpleFile");
        return xferCount;
    }
```

### DataFlowIssue
Variable is already assigned to this value
in `sshd-scp/src/main/java/org/apache/sshd/scp/client/DefaultScpClient.java`
#### Snippet
```java
            String remote, Collection<Option> options, Collection<T> local, AbstractScpClient.ScpOperationExecutor<T> executor)
            throws IOException {
        local = ValidateUtils.checkNotNullAndNotEmpty(local, "Invalid argument local: %s", local);
        remote = ValidateUtils.checkNotNullAndNotEmpty(remote, "Invalid argument remote: %s", remote);
        if (local.size() > 1) {
```

### DataFlowIssue
Method invocation `getKdfSize` may produce `NullPointerException`
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/AbstractSession.java`
#### Snippet
```java
        Cipher s2ccipher = ValidateUtils.checkNotNull(
                NamedFactory.create(getCipherFactories(), value), "Unknown s2c cipher: %s", value);
        e_s2c = resizeKey(e_s2c, s2ccipher.getKdfSize(), hash, k, h);

        Mac s2cmac;
```

### DataFlowIssue
Method invocation `getKdfSize` may produce `NullPointerException`
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/AbstractSession.java`
#### Snippet
```java
        Cipher c2scipher = ValidateUtils.checkNotNull(
                NamedFactory.create(getCipherFactories(), value), "Unknown c2s cipher: %s", value);
        e_c2s = resizeKey(e_c2s, c2scipher.getKdfSize(), hash, k, h);

        Mac c2smac;
```

### DataFlowIssue
Method invocation `createKeyExchange` may produce `NullPointerException`
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/AbstractSession.java`
#### Snippet
```java
        }

        kex = kexFactory.createKeyExchange(this);
        kex.init(v_s, v_c, i_s, i_c);

```

### DataFlowIssue
Variable is already assigned to this value
in `sshd-scp/src/main/java/org/apache/sshd/scp/client/AbstractScpClient.java`
#### Snippet
```java
    @Override
    public void download(String[] remote, Path local, Collection<Option> options) throws IOException {
        remote = ValidateUtils.checkNotNullAndNotEmpty(remote, "Invalid argument remote: %s", (Object) remote);

        if (remote.length > 1) {
```

### DataFlowIssue
Variable is already assigned to this value
in `sshd-scp/src/main/java/org/apache/sshd/scp/client/AbstractScpClient.java`
#### Snippet
```java
    public void download(String[] remote, String local, Collection<Option> options) throws IOException {
        local = ValidateUtils.checkNotNullAndNotEmpty(local, "Invalid argument local: %s", local);
        remote = ValidateUtils.checkNotNullAndNotEmpty(remote, "Invalid argument remote: %s", (Object) remote);

        if (remote.length > 1) {
```

### DataFlowIssue
Variable is already assigned to this value
in `sshd-scp/src/main/java/org/apache/sshd/scp/client/AbstractScpClient.java`
#### Snippet
```java
    @Override
    public void download(String remote, Path local, Collection<Option> options) throws IOException {
        local = ValidateUtils.checkNotNull(local, "Invalid argument local: %s", local);
        remote = ValidateUtils.checkNotNullAndNotEmpty(remote, "Invalid argument remote: %s", remote);

```

## RuleId[id=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
'filter()' and 'map()' can be swapped
in `sshd-core/src/main/java/org/apache/sshd/certificate/OpenSshCertificateBuilder.java`
#### Snippet
```java
            Set<String> names = new HashSet<>();
            Set<String> duplicates = options.stream().filter(option -> !names.add(option.getName()))
                    .map(OpenSshCertificate.CertificateOption::getName)
                    .collect(Collectors.toSet());
            if (!duplicates.isEmpty()) {
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `sshd-scp/src/main/java/org/apache/sshd/scp/server/ScpShell.java`
#### Snippet
```java
            envValues.entrySet()
                    .stream()
                    .forEach(e -> println(argv[0], e.getKey() + "=" + e.getValue(), stdout, envVarsEnodingCharset));
            variables.put(STATUS, 0);
            return;
```

## RuleId[id=ParameterCanBeLocal]
### ParameterCanBeLocal
Parameter can be converted to a local variable
in `sshd-core/src/main/java/org/apache/sshd/server/auth/password/UserAuthPassword.java`
#### Snippet
```java
     */
    protected Boolean handleServerPasswordChangeRequest(
            Buffer buffer, ServerSession session, String username, String password, PasswordChangeRequiredException e)
            throws Exception {
        String prompt = e.getPrompt();
```

### ParameterCanBeLocal
Parameter can be converted to a local variable
in `sshd-core/src/main/java/org/apache/sshd/server/session/ServerUserAuthService.java`
#### Snippet
```java
    }

    protected void handleAuthenticationFailure(int cmd, Buffer buffer) throws Exception {
        ServerSession session = getServerSession();
        boolean debugEnabled = log.isDebugEnabled();
```

## RuleId[id=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
Call to `substring()` is redundant
in `sshd-common/src/main/java/org/apache/sshd/common/util/GenericUtils.java`
#### Snippet
```java
        StringBuilder buf = new StringBuilder(text.length());
        for (int end = text.indexOf(repl, start); end != -1; end = text.indexOf(repl, start)) {
            buf.append(text.substring(start, end)).append(with);
            start = end + repl.length();

```

### StringOperationCanBeSimplified
Call to `substring()` is redundant
in `sshd-core/src/main/java/org/apache/sshd/client/keyverifier/KnownHostsServerKeyVerifier.java`
#### Snippet
```java
        ValidateUtils.checkTrue((pos > 0) && (pos < (curLine.length() - 1)), "Missing encoded key in line=%s", curLine);
        StringBuilder sb = new StringBuilder(curLine.length());
        sb.append(curLine.substring(0, pos)); // copy the marker/patterns as-is
        PublicKeyEntry.appendPublicKeyEntry(sb.append(' '), actual);
        return sb.toString();
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'hmacmd596' is still used
in `sshd-common/src/main/java/org/apache/sshd/common/mac/BuiltinMacs.java`
#### Snippet
```java
     */
    @Deprecated
    hmacmd596(Constants.HMAC_MD5_96, "HmacMD5", 12, 16),
    hmacsha1(Constants.HMAC_SHA1, "HmacSHA1", 20, 20),
    hmacsha1etm(Constants.ETM_HMAC_SHA1, "HmacSHA1", 20, 20) {
```

### DeprecatedIsStillUsed
Deprecated member 'hmacsha196' is still used
in `sshd-common/src/main/java/org/apache/sshd/common/mac/BuiltinMacs.java`
#### Snippet
```java
     */
    @Deprecated
    hmacsha196(Constants.HMAC_SHA1_96, "HmacSHA1", 12, 20),
    /** See <A HREF="https://tools.ietf.org/html/rfc6668">RFC 6668</A> */
    hmacsha256(Constants.HMAC_SHA2_256, "HmacSHA256", 32, 32),
```

### DeprecatedIsStillUsed
Deprecated member 'hmacmd5' is still used
in `sshd-common/src/main/java/org/apache/sshd/common/mac/BuiltinMacs.java`
#### Snippet
```java
     */
    @Deprecated
    hmacmd5(Constants.HMAC_MD5, "HmacMD5", 16, 16),
    /**
     * @deprecated
```

### DeprecatedIsStillUsed
Deprecated member 'REGISTER_BOUNCY_CASTLE_PROP' is still used
in `sshd-common/src/main/java/org/apache/sshd/common/util/security/SecurityUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static final String REGISTER_BOUNCY_CASTLE_PROP = "org.apache.sshd.registerBouncyCastle";

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'EDDSA_SUPPORTED_PROP' is still used
in `sshd-common/src/main/java/org/apache/sshd/common/util/security/SecurityUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static final String EDDSA_SUPPORTED_PROP = "org.apache.sshd.eddsaSupport";

    public static final String PROP_DEFAULT_SECURITY_PROVIDER = "org.apache.sshd.security.defaultProvider";
```

### DeprecatedIsStillUsed
Deprecated member 'tripledescbc' is still used
in `sshd-common/src/main/java/org/apache/sshd/common/cipher/BuiltinCiphers.java`
#### Snippet
```java
     */
    @Deprecated
    tripledescbc(Constants.TRIPLE_DES_CBC, 8, 0, 24, "DESede", 192, "DESede/CBC/NoPadding", 8);

    public static final Set<BuiltinCiphers> VALUES = Collections.unmodifiableSet(EnumSet.allOf(BuiltinCiphers.class));
```

### DeprecatedIsStillUsed
Deprecated member 'blowfishcbc' is still used
in `sshd-common/src/main/java/org/apache/sshd/common/cipher/BuiltinCiphers.java`
#### Snippet
```java
     */
    @Deprecated
    blowfishcbc(Constants.BLOWFISH_CBC, 8, 0, 16, "Blowfish", 128, "Blowfish/CBC/NoPadding", 8),
    cc20p1305_openssh(Constants.CC20P1305_OPENSSH, 8, 16, 64, "ChaCha", 256, "ChaCha", 8) {
        @Override
```

### DeprecatedIsStillUsed
Deprecated member 'arcfour128' is still used
in `sshd-common/src/main/java/org/apache/sshd/common/cipher/BuiltinCiphers.java`
#### Snippet
```java
     */
    @Deprecated
    arcfour128(Constants.ARCFOUR128, 8, 0, 16, "ARCFOUR", 128, "RC4", 16) {
        @Override
        public Cipher create() {
```

### DeprecatedIsStillUsed
Deprecated member 'arcfour256' is still used
in `sshd-common/src/main/java/org/apache/sshd/common/cipher/BuiltinCiphers.java`
#### Snippet
```java
     */
    @Deprecated
    arcfour256(Constants.ARCFOUR256, 8, 0, 32, "ARCFOUR", 256, "RC4", 32) {
        @Override
        public Cipher create() {
```

### DeprecatedIsStillUsed
Deprecated member 'rsa_cert' is still used
in `sshd-common/src/main/java/org/apache/sshd/common/signature/BuiltinSignatures.java`
#### Snippet
```java
     */
    @Deprecated
    rsa_cert(KeyPairProvider.SSH_RSA_CERT) {
        @Override
        public Signature create() {
```

### DeprecatedIsStillUsed
Deprecated member 'dsa_cert' is still used
in `sshd-common/src/main/java/org/apache/sshd/common/signature/BuiltinSignatures.java`
#### Snippet
```java
     */
    @Deprecated
    dsa_cert(KeyPairProvider.SSH_DSS_CERT) {
        @Override
        public Signature create() {
```

## RuleId[id=UnnecessaryCallToStringValueOf]
### UnnecessaryCallToStringValueOf
Unnecessary `Character.toString()` call
in `sshd-common/src/main/java/org/apache/sshd/common/util/SelectorUtils.java`
#### Snippet
```java
            return (p2.length() == 1) ? p1 : p1 + p2; // /a/b/c + /d/e/f
        } else {
            return p1 + Character.toString(fsSeparator) + p2;    // /a/b/c + d/e/f
        }
    }
```

### UnnecessaryCallToStringValueOf
Unnecessary `Objects.toString()` call
in `sshd-common/src/main/java/org/apache/sshd/common/util/io/der/ASN1Object.java`
#### Snippet
```java
    @Override
    public String toString() {
        return Objects.toString(getObjClass())
               + "/" + getObjType()
               + "/" + isConstructed()
```

### UnnecessaryCallToStringValueOf
Unnecessary `Objects.toString()` call
in `sshd-common/src/main/java/org/apache/sshd/common/util/GenericUtils.java`
#### Snippet
```java
                sb.append(ch);
            }
            sb.append(Objects.toString(o));
        } while (iter.hasNext());

```

### UnnecessaryCallToStringValueOf
Unnecessary `Objects.toString()` call
in `sshd-common/src/main/java/org/apache/sshd/common/util/GenericUtils.java`
#### Snippet
```java
                sb.append(sep);
            }
            sb.append(Objects.toString(o));
        } while (iter.hasNext());

```

### UnnecessaryCallToStringValueOf
Unnecessary `Integer.toString()` call
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/openssh/kdf/BCrypt.java`
#### Snippet
```java
          throw new IllegalArgumentException("log_rounds exceeds maximum (30)");
      }
      rs.append(Integer.toString(log_rounds));
      rs.append("$");
      rs.append(encode_base64(rnd, rnd.length));
```

### UnnecessaryCallToStringValueOf
Unnecessary `Integer.toString()` call
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/openssh/kdf/BCrypt.java`
#### Snippet
```java
          throw new IllegalArgumentException("rounds exceeds maximum (30)");
      }
      rs.append(Integer.toString(rounds));
      rs.append("$");
      rs.append(encode_base64(saltb, saltb.length));
```

### UnnecessaryCallToStringValueOf
Unnecessary `Character.toString()` call
in `sshd-cli/src/main/java/org/apache/sshd/cli/client/SftpCommandMain.java`
#### Snippet
```java
                            break;
                        default:
                            throw new IllegalArgumentException("Unknown flag (" + Character.toString(ch) + ")");
                    }
                }
```

### UnnecessaryCallToStringValueOf
Unnecessary `Character.toString()` call
in `sshd-cli/src/main/java/org/apache/sshd/cli/client/SftpCommandMain.java`
#### Snippet
```java
                            break;
                        default:
                            throw new IllegalArgumentException("Unknown flag (" + Character.toString(ch) + ")");
                    }
                }
```

### UnnecessaryCallToStringValueOf
Unnecessary `Integer.toString()` call
in `sshd-core/src/main/java/org/apache/sshd/common/forward/SocksProxy.java`
#### Snippet
```java
                String host;
                if (type == 0x01) {
                    host = Integer.toString(getUByte(buffer)) + "."
                           + Integer.toString(getUByte(buffer)) + "."
                           + Integer.toString(getUByte(buffer)) + "."
```

### UnnecessaryCallToStringValueOf
Unnecessary `Integer.toString()` call
in `sshd-core/src/main/java/org/apache/sshd/common/forward/SocksProxy.java`
#### Snippet
```java
                if (type == 0x01) {
                    host = Integer.toString(getUByte(buffer)) + "."
                           + Integer.toString(getUByte(buffer)) + "."
                           + Integer.toString(getUByte(buffer)) + "."
                           + Integer.toString(getUByte(buffer));
```

### UnnecessaryCallToStringValueOf
Unnecessary `Integer.toString()` call
in `sshd-core/src/main/java/org/apache/sshd/common/forward/SocksProxy.java`
#### Snippet
```java
                    host = Integer.toString(getUByte(buffer)) + "."
                           + Integer.toString(getUByte(buffer)) + "."
                           + Integer.toString(getUByte(buffer)) + "."
                           + Integer.toString(getUByte(buffer));
                } else if (type == 0x03) {
```

### UnnecessaryCallToStringValueOf
Unnecessary `Integer.toString()` call
in `sshd-core/src/main/java/org/apache/sshd/common/forward/SocksProxy.java`
#### Snippet
```java
                           + Integer.toString(getUByte(buffer)) + "."
                           + Integer.toString(getUByte(buffer)) + "."
                           + Integer.toString(getUByte(buffer));
                } else if (type == 0x03) {
                    host = getBLString(buffer);
```

### UnnecessaryCallToStringValueOf
Unnecessary `Integer.toString()` call
in `sshd-core/src/main/java/org/apache/sshd/common/forward/SocksProxy.java`
#### Snippet
```java
                }
                int port = getUShort(buffer);
                String host = Integer.toString(getUByte(buffer)) + "."
                              + Integer.toString(getUByte(buffer)) + "."
                              + Integer.toString(getUByte(buffer)) + "."
```

### UnnecessaryCallToStringValueOf
Unnecessary `Integer.toString()` call
in `sshd-core/src/main/java/org/apache/sshd/common/forward/SocksProxy.java`
#### Snippet
```java
                int port = getUShort(buffer);
                String host = Integer.toString(getUByte(buffer)) + "."
                              + Integer.toString(getUByte(buffer)) + "."
                              + Integer.toString(getUByte(buffer)) + "."
                              + Integer.toString(getUByte(buffer));
```

### UnnecessaryCallToStringValueOf
Unnecessary `Integer.toString()` call
in `sshd-core/src/main/java/org/apache/sshd/common/forward/SocksProxy.java`
#### Snippet
```java
                String host = Integer.toString(getUByte(buffer)) + "."
                              + Integer.toString(getUByte(buffer)) + "."
                              + Integer.toString(getUByte(buffer)) + "."
                              + Integer.toString(getUByte(buffer));
                String userId = getNTString(buffer);
```

### UnnecessaryCallToStringValueOf
Unnecessary `Integer.toString()` call
in `sshd-core/src/main/java/org/apache/sshd/common/forward/SocksProxy.java`
#### Snippet
```java
                              + Integer.toString(getUByte(buffer)) + "."
                              + Integer.toString(getUByte(buffer)) + "."
                              + Integer.toString(getUByte(buffer));
                String userId = getNTString(buffer);
                // Socks4a
```

### UnnecessaryCallToStringValueOf
Unnecessary `Character.toString()` call
in `sshd-scp/src/main/java/org/apache/sshd/scp/client/ScpRemote2RemoteTransferHelper.java`
#### Snippet
```java
        }

        return Character.toString((char) c) + line;
    }

```

### UnnecessaryCallToStringValueOf
Unnecessary `Character.toString()` call
in `sshd-scp/src/main/java/org/apache/sshd/scp/common/ScpHelper.java`
#### Snippet
```java
                case ScpReceiveDirCommandDetails.COMMAND_NAME:
                    line = ScpIoUtils.readLine(in, csIn);
                    line = Character.toString((char) c) + line;
                    isDir = true;
                    if (debugEnabled) {
```

### UnnecessaryCallToStringValueOf
Unnecessary `Character.toString()` call
in `sshd-scp/src/main/java/org/apache/sshd/scp/common/ScpHelper.java`
#### Snippet
```java
                case ScpReceiveFileCommandDetails.COMMAND_NAME:
                    line = ScpIoUtils.readLine(in, csIn);
                    line = Character.toString((char) c) + line;
                    if (debugEnabled) {
                        log.debug("receive({}) - Received 'C' header: {}", this, line);
```

### UnnecessaryCallToStringValueOf
Unnecessary `Character.toString()` call
in `sshd-scp/src/main/java/org/apache/sshd/scp/common/ScpHelper.java`
#### Snippet
```java
                case ScpTimestampCommandDetails.COMMAND_NAME:
                    line = ScpIoUtils.readLine(in, csIn);
                    line = Character.toString((char) c) + line;
                    if (debugEnabled) {
                        log.debug("receive({}) - Received 'T' header: {}", this, line);
```

### UnnecessaryCallToStringValueOf
Unnecessary `Character.toString()` call
in `sshd-scp/src/main/java/org/apache/sshd/scp/common/ScpHelper.java`
#### Snippet
```java
                case ScpDirEndCommandDetails.COMMAND_NAME:
                    line = ScpIoUtils.readLine(in, csIn);
                    line = Character.toString((char) c) + line;
                    if (debugEnabled) {
                        log.debug("receive({}) - Received 'E' header: {}", this, line);
```

## RuleId[id=NonSerializableFieldInSerializableClass]
### NonSerializableFieldInSerializableClass
Non-serializable field 'params' in a Serializable class
in `sshd-common/src/main/java/org/apache/sshd/common/cipher/ECCurves.java`
#### Snippet
```java
    private final String oidString;
    private final List<Integer> oidValue;
    private final ECParameterSpec params;
    private final int keySize;
    private final int numOctets;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'logStream' in a Serializable class
in `sshd-cli/src/main/java/org/apache/sshd/cli/CliLogger.java`
#### Snippet
```java

    protected final Level threshold;
    protected final PrintStream logStream;

    protected CliLogger(String name, Level threshold, PrintStream logStream) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'keyFactory' in a Serializable class
in `sshd-core/src/main/java/org/apache/sshd/common/kex/MontgomeryCurve.java`
#### Snippet
```java
    private final DigestFactory digestFactory;
    private final KeyPairGenerator keyPairGenerator;
    private final KeyFactory keyFactory;
    private final byte[] encodedPublicKeyPrefix;

```

## RuleId[id=NonSynchronizedMethodOverridesSynchronizedMethod]
### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `write()` overrides synchronized method
in `sshd-common/src/main/java/org/apache/sshd/common/util/io/output/SecureByteArrayOutputStream.java`
#### Snippet
```java

    @Override
    public void write(byte[] b, int off, int len) {
        byte[] oldBuf = buf;
        super.write(b, off, len);
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `write()` overrides synchronized method
in `sshd-common/src/main/java/org/apache/sshd/common/util/io/output/SecureByteArrayOutputStream.java`
#### Snippet
```java

    @Override
    public void write(int b) {
        byte[] oldBuf = buf;
        super.write(b);
```

## RuleId[id=CatchMayIgnoreException]
### CatchMayIgnoreException
Unexpected VM exception like 'java.lang.NullPointerException' might be ignored in a `catch` block
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/KeyExchangeMessageHandler.java`
#### Snippet
```java
                throw ValidateUtils.initializeExceptionCause(new ProtocolException(
                        "Failed (" + e.getClass().getSimpleName() + ")" + " to check re-key necessity: " + e.getMessage()), e);
            } catch (Exception e) {
                ExceptionUtils.rethrowAsIoException(e);
            }
```

### CatchMayIgnoreException
Unexpected VM exception like 'java.lang.NullPointerException' might be ignored in a `catch` block
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/SessionHelper.java`
#### Snippet
```java
        try {
            signalSessionEvent(SessionListener.Event.Authenticated);
        } catch (Exception e) {
            ExceptionUtils.rethrowAsIoException(e);
        }
```

## RuleId[id=MismatchedJavadocCode]
### MismatchedJavadocCode
Method is specified to return number but the return type is array
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/writer/openssh/OpenSSHKeyPairResourceWriter.java`
#### Snippet
```java
         * {@link #deriveEncryptionKey(PrivateKeyEncryptionContext, int)} has been called.
         *
         * @return the number of KDF rounds applied
         */
        public byte[] getKdfOptions() {
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `sshd-common/src/main/java/org/apache/sshd/common/file/root/RootedFileSystemProvider.java`
#### Snippet
```java
            Path root = rfs.getRoot();
            Path rel = root.relativize(nat);
            return rfs.getPath("/" + rel.toString());
        } else {
            return rfs.getPath(nat.toString());
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/PrivateKeyEncryptionContext.java`
#### Snippet
```java
            return copy;
        } catch (CloneNotSupportedException e) { // unexpected
            throw new RuntimeException("Failed to clone: " + toString());
        }
    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/client/extensions/openssh/OpenSSHStatExtensionInfo.java`
#### Snippet
```java
            return getClass().cast(super.clone());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Failed to close " + toString() + ": " + e.getMessage());
        }
    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/client/extensions/openssh/OpenSSHLimitsExtensionInfo.java`
#### Snippet
```java
            return getClass().cast(super.clone());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Failed to close " + toString() + ": " + e.getMessage());
        }
    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/common/extensions/NewlineParser.java`
#### Snippet
```java
                return getClass().cast(super.clone());
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException("Failed to clone " + toString() + ": " + e.getMessage(), e);
            }
        }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/common/extensions/FilenameCharsetParser.java`
#### Snippet
```java
                return getClass().cast(super.clone());
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException("Failed to clone " + toString() + ": " + e.getMessage(), e);
            }
        }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/common/extensions/AclSupportedParser.java`
#### Snippet
```java
                return getClass().cast(super.clone());
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException("Failed to clone " + toString() + ": " + e.getMessage(), e);
            }
        }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/common/extensions/SpaceAvailableExtensionInfo.java`
#### Snippet
```java
            return getClass().cast(super.clone());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Failed to close " + toString() + ": " + e.getMessage());
        }
    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/common/extensions/openssh/AbstractOpenSSHExtensionParser.java`
#### Snippet
```java
                return getClass().cast(super.clone());
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException("Unexpected clone exception " + toString() + ": " + e.getMessage());
            }
        }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/server/DirectoryHandle.java`
#### Snippet
```java
    @Override
    public void remove() {
        throw new UnsupportedOperationException("Not allowed to remove " + toString());
    }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `sshd-core/src/main/java/org/apache/sshd/common/io/nio2/Nio2ServiceFactory.java`
#### Snippet
```java
        try {
            group = AsynchronousChannelGroup.withThreadPool(ThreadUtils.noClose(getExecutorService()));
            resuming = ThreadUtils.newFixedThreadPoolIf(resumeTasks, factoryManager.toString() + "-nio2-resume",
                    getNioWorkers(factoryManager));
        } catch (IOException e) {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `sshd-core/src/main/java/org/apache/sshd/common/channel/ChannelAsyncOutputStream.java`
#### Snippet
```java
        this.packetWriter = channelInstance.resolveChannelStreamWriter(channel, cmd);
        this.cmd = cmd;
        this.packetWriteId = channel.toString() + "[" + SshConstants.getCommandMessageName(cmd) + "]";
    }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/server/AbstractSftpSubsystemHelper.java`
#### Snippet
```java
            } else if (Files.isDirectory(p, options)) {
                throw signalRemovalPreConditionFailure(id, path, p,
                        new SftpException(SftpConstants.SSH_FX_FILE_IS_A_DIRECTORY, p.toString() + " is a folder"), false);
            }
            return null;
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `sshd-core/src/main/java/org/apache/sshd/common/helpers/AbstractFactoryManager.java`
#### Snippet
```java
        if (getScheduledExecutorService() == null) {
            setScheduledExecutorService(
                    ThreadUtils.newSingleThreadScheduledExecutor(this.toString() + "-timer"),
                    true);
        }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `sshd-core/src/main/java/org/apache/sshd/server/auth/keyboard/PromptEntry.java`
#### Snippet
```java
            return getClass().cast(super.clone());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Failed to clone " + toString() + ": " + e.getMessage(), e);
        }
    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `sshd-core/src/main/java/org/apache/sshd/server/auth/keyboard/InteractiveChallenge.java`
#### Snippet
```java
            return other;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Failed to clone " + toString() + ": " + e.getMessage(), e);
        }
    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `sshd-scp/src/main/java/org/apache/sshd/scp/common/ScpLocation.java`
#### Snippet
```java
            return getClass().cast(super.clone());
        } catch (CloneNotSupportedException e) { // unexpected
            throw new RuntimeException("Failed to clone " + toString(), e);
        }
    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `sshd-scp/src/main/java/org/apache/sshd/scp/client/AbstractScpClient.java`
#### Snippet
```java
            Boolean status = IoUtils.checkFileExists(local, opts);
            if (status == null) {
                throw new SshException("Target directory " + local.toString() + " is probably inaccesible");
            }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `sshd-scp/src/main/java/org/apache/sshd/scp/client/AbstractScpClient.java`
#### Snippet
```java

            if (!status) {
                throw new SshException("Target directory " + local.toString() + " does not exist");
            }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `sshd-scp/src/main/java/org/apache/sshd/scp/client/AbstractScpClient.java`
#### Snippet
```java

            if (!Files.isDirectory(local, opts)) {
                throw new SshException("Target directory " + local.toString() + " is not a directory");
            }
        }
```

## RuleId[id=AssignmentToForLoopParameter]
### AssignmentToForLoopParameter
Assignment to for-loop parameter `line`
in `sshd-common/src/main/java/org/apache/sshd/client/config/hosts/KnownHostEntry.java`
#### Snippet
```java
        int lineNumber = 1;
        for (String line = rdr.readLine(); line != null; line = rdr.readLine(), lineNumber++) {
            line = GenericUtils.trimToEmpty(line);
            if (GenericUtils.isEmpty(line)) {
                continue;
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `line`
in `sshd-common/src/main/java/org/apache/sshd/client/config/hosts/KnownHostEntry.java`
#### Snippet
```java

            if (pos > 0) {
                line = line.substring(0, pos);
                line = line.trim();
            }
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `line`
in `sshd-common/src/main/java/org/apache/sshd/client/config/hosts/KnownHostEntry.java`
#### Snippet
```java
            if (pos > 0) {
                line = line.substring(0, pos);
                line = line.trim();
            }

```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `sshd-common/src/main/java/org/apache/sshd/common/file/util/BaseFileSystem.java`
#### Snippet
```java
            switch (ch) {
                case '\\':
                    i++;
                    if (i >= arr.length) {
                        sb.append('\\');
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `line`
in `sshd-common/src/main/java/org/apache/sshd/client/config/hosts/HostConfigEntry.java`
#### Snippet
```java
        int lineNumber = 1;
        for (String line = rdr.readLine(); line != null; line = rdr.readLine(), lineNumber++) {
            line = GenericUtils.replaceWhitespaceAndTrim(line);
            if (GenericUtils.isEmpty(line)) {
                continue;
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `line`
in `sshd-common/src/main/java/org/apache/sshd/client/config/hosts/HostConfigEntry.java`
#### Snippet
```java

            if (pos > 0) {
                line = line.substring(0, pos);
                line = line.trim();
            }
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `line`
in `sshd-common/src/main/java/org/apache/sshd/client/config/hosts/HostConfigEntry.java`
#### Snippet
```java
            if (pos > 0) {
                line = line.substring(0, pos);
                line = line.trim();
            }

```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `curPos`
in `sshd-common/src/main/java/org/apache/sshd/client/config/hosts/HostConfigEntry.java`
#### Snippet
```java
                    PathUtils.appendUserHome(sb);
                } else if (ch == PATH_MACRO_CHAR) {
                    curPos++;
                    ValidateUtils.checkTrue(curPos < elem.length(), "Missing macro modifier in %s", id);
                    ch = elem.charAt(curPos);
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `curPos`
in `sshd-common/src/main/java/org/apache/sshd/common/util/io/der/ASN1Object.java`
#### Snippet
```java

            long curVal = v & 0x7F;
            curPos++;

            for (int subLen = 1;; subLen++, curPos++) {
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `curPos`
in `sshd-common/src/main/java/org/apache/sshd/common/util/io/der/ASN1Object.java`
#### Snippet
```java
            curPos++;

            for (int subLen = 1;; subLen++, curPos++) {
                if (curPos >= vLen) {
                    throw new EOFException("Incomplete OID value");
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `totalLen`
in `sshd-common/src/main/java/org/apache/sshd/common/util/buffer/BufferUtils.java`
#### Snippet
```java

            int dumpSize = Math.min(chunkSize, remainLen);
            totalLen += dumpSize;
            sb.append('(').append(totalLen).append('/').append(len).append(')');

```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `remainLen`
in `sshd-common/src/main/java/org/apache/sshd/common/util/buffer/BufferUtils.java`
#### Snippet
```java

            logger.log(level, sb.toString());
            remainLen -= dumpSize;
            curOffset += dumpSize;
        }
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `curOffset`
in `sshd-common/src/main/java/org/apache/sshd/common/util/buffer/BufferUtils.java`
#### Snippet
```java
            logger.log(level, sb.toString());
            remainLen -= dumpSize;
            curOffset += dumpSize;
        }
    }
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `line`
in `sshd-common/src/main/java/org/apache/sshd/common/config/ConfigFileReaderSupport.java`
#### Snippet
```java
        int lineNumber = 1;
        for (String line = rdr.readLine(); line != null; line = rdr.readLine(), lineNumber++) {
            line = GenericUtils.replaceWhitespaceAndTrim(line);
            if (GenericUtils.isEmpty(line)) {
                continue;
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `line`
in `sshd-common/src/main/java/org/apache/sshd/common/config/ConfigFileReaderSupport.java`
#### Snippet
```java

            if (pos > 0) {
                line = line.substring(0, pos);
                line = line.trim();
            }
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `line`
in `sshd-common/src/main/java/org/apache/sshd/common/config/ConfigFileReaderSupport.java`
#### Snippet
```java
            if (pos > 0) {
                line = line.substring(0, pos);
                line = line.trim();
            }

```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `curPos`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/AuthorizedKeyEntry.java`
#### Snippet
```java
            addLoginOption(optsMap, line.substring(lastPos, nextPos));
            lastPos = nextPos + 1;
            curPos = lastPos;
        }

```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `j`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/openssh/kdf/BCrypt.java`
#### Snippet
```java
      for (int i = 0, j = 0; i < buf.length; i++) {
          // Output of this is little endian
          output[j++] = (byte)(buf[i] & 0xff);
          output[j++] = (byte)((buf[i] >> 8) & 0xff);
          output[j++] = (byte)((buf[i] >> 16) & 0xff);
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `j`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/openssh/kdf/BCrypt.java`
#### Snippet
```java
          // Output of this is little endian
          output[j++] = (byte)(buf[i] & 0xff);
          output[j++] = (byte)((buf[i] >> 8) & 0xff);
          output[j++] = (byte)((buf[i] >> 16) & 0xff);
          output[j++] = (byte)((buf[i] >> 24) & 0xff);
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `j`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/openssh/kdf/BCrypt.java`
#### Snippet
```java
          output[j++] = (byte)(buf[i] & 0xff);
          output[j++] = (byte)((buf[i] >> 8) & 0xff);
          output[j++] = (byte)((buf[i] >> 16) & 0xff);
          output[j++] = (byte)((buf[i] >> 24) & 0xff);
      }
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `j`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/openssh/kdf/BCrypt.java`
#### Snippet
```java
          output[j++] = (byte)((buf[i] >> 8) & 0xff);
          output[j++] = (byte)((buf[i] >> 16) & 0xff);
          output[j++] = (byte)((buf[i] >> 24) & 0xff);
      }
  }
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `index`
in `sshd-common/src/main/java/org/apache/sshd/common/signature/SignatureFactory.java`
#### Snippet
```java
            if (!providedKeys.contains(kt)) {
                supported.remove(index);
                index--; // compensate for auto-increment
            }
        }
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `index`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/ssh2/Ssh2PublicKeyEntryDecoder.java`
#### Snippet
```java
            if (value.charAt(vLen - 1) == HEADER_CONTINUATION_INDICATOR) {
                value = value.substring(0, vLen - 1);
                for (index++ /* skip current line */; index < len; index++) {
                    l = lines.get(index);
                    vLen = l.length();
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `index`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/ssh2/Ssh2PublicKeyEntryDecoder.java`
#### Snippet
```java
            if (value.charAt(vLen - 1) == HEADER_CONTINUATION_INDICATOR) {
                value = value.substring(0, vLen - 1);
                for (index++ /* skip current line */; index < len; index++) {
                    l = lines.get(index);
                    vLen = l.length();
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `index`
in `sshd-cli/src/main/java/org/apache/sshd/cli/CliSupport.java`
#### Snippet
```java
            }

            index++;
            if (index >= numArgs) {
                stderr.println("option requires an argument: " + argName);
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `index`
in `sshd-cli/src/main/java/org/apache/sshd/cli/CliSupport.java`
#### Snippet
```java
                }

                index = -1; // start delimiters again
            }
        }
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `sshd-cli/src/main/java/org/apache/sshd/cli/client/SshClientMain.java`
#### Snippet
```java
                }

                i++;
                continue;
            }
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `sshd-cli/src/main/java/org/apache/sshd/cli/client/SshClientMain.java`
#### Snippet
```java
                }

                socksPort = Integer.parseInt(args[++i]);
                if (socksPort <= 0) {
                    error = CliLogger.showError(stderr, "Bad option value for " + argName + ": " + socksPort);
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `remLen`
in `sshd-putty/src/main/java/org/apache/sshd/putty/PuttyKeyPairResourceParser.java`
#### Snippet
```java
                        Arrays.fill(digest, (byte) 0); // eliminate sensitive data a.s.a.p.
                    }
                    remLen -= 20;
                }
            } finally {
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `sshd-cli/src/main/java/org/apache/sshd/cli/server/SshServerMain.java`
#### Snippet
```java
            String argName = args[i];
            if ("-p".equals(argName)) {
                i++;
                if (i >= numArgs) {
                    System.err.println("option requires an argument: " + argName);
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `sshd-cli/src/main/java/org/apache/sshd/cli/server/SshServerMain.java`
#### Snippet
```java
                port = Integer.parseInt(args[i]);
            } else if ("-key-type".equals(argName)) {
                i++;
                if (i >= numArgs) {
                    System.err.println("option requires an argument: " + argName);
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `sshd-cli/src/main/java/org/apache/sshd/cli/server/SshServerMain.java`
#### Snippet
```java
                hostKeyType = args[i].toUpperCase();
            } else if ("-key-size".equals(argName)) {
                i++;
                if (i >= numArgs) {
                    System.err.println("option requires an argument: " + argName);
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `sshd-cli/src/main/java/org/apache/sshd/cli/server/SshServerMain.java`
#### Snippet
```java
                hostKeySize = Integer.parseInt(args[i]);
            } else if ("-key-file".equals(argName)) {
                i++;
                if (i >= numArgs) {
                    System.err.println("option requires an argument: " + argName);
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `sshd-cli/src/main/java/org/apache/sshd/cli/server/SshServerMain.java`
#### Snippet
```java
                keyFiles.add(keyFilePath);
            } else if ("-o".equals(argName)) {
                i++;
                if (i >= numArgs) {
                    System.err.println("option requires and argument: " + argName);
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `index`
in `sshd-cli/src/main/java/org/apache/sshd/cli/client/ScpCommandMain.java`
#### Snippet
```java
            // handled by 'setupClientSession'
            if (isArgumentedOption(SCP_PORT_OPTION, argName) || "-creator".equals(argName)) {
                index++;
                if (index >= numArgs) {
                    error = CliLogger.showError(stderr, "option requires an argument: " + argName);
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `index`
in `sshd-cli/src/main/java/org/apache/sshd/cli/client/ScpCommandMain.java`
#### Snippet
```java
                break;
            } else {
                index++;
                if (index >= numArgs) {
                    error = CliLogger.showError(stderr, "Not enough arguments");
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `index`
in `sshd-cli/src/main/java/org/apache/sshd/cli/client/ScpCommandMain.java`
#### Snippet
```java
            String argName = args[index];
            if ("-creator".equals(argName)) {
                index++;
                if (index >= numArgs) {
                    CliLogger.showError(stderr, "option requires an argument: " + argName);
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `index`
in `sshd-cli/src/main/java/org/apache/sshd/cli/client/SshKeyScanMain.java`
#### Snippet
```java
            String optName = args[index];
            if ("-f".equals(optName)) {
                index++;
                ValidateUtils.checkTrue(index < numArgs, "Missing %s option argument", optName);
                ValidateUtils.checkTrue(scanner.getInputStream() == null, "%s option re-specified", optName);
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `index`
in `sshd-cli/src/main/java/org/apache/sshd/cli/client/SshKeyScanMain.java`
#### Snippet
```java
                }
            } else if ("-t".equals(optName)) {
                index++;
                ValidateUtils.checkTrue(index < numArgs, "Missing %s option argument", optName);
                ValidateUtils.checkTrue(GenericUtils.isEmpty(scanner.getKeyTypes()), "%s option re-specified", optName);
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `index`
in `sshd-cli/src/main/java/org/apache/sshd/cli/client/SshKeyScanMain.java`
#### Snippet
```java
                scanner.setKeyTypes(Arrays.asList(types));
            } else if ("-p".equals(optName)) {
                index++;
                ValidateUtils.checkTrue(index < numArgs, "Missing %s option argument", optName);
                ValidateUtils.checkTrue(scanner.getPort() <= 0, "%s option re-specified", optName);
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `index`
in `sshd-cli/src/main/java/org/apache/sshd/cli/client/SshKeyScanMain.java`
#### Snippet
```java
                scanner.setPort(port);
            } else if ("-T".equals(optName)) {
                index++;
                ValidateUtils.checkTrue(index < numArgs, "Missing %s option argument", optName);
                ValidateUtils.checkTrue(scanner.getTimeout() <= 0, "%s option re-specified", optName);
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `index`
in `sshd-cli/src/main/java/org/apache/sshd/cli/client/SshKeyScanMain.java`
#### Snippet
```java
                }

                String provider = args[++index];
                BuiltinIoServiceFactoryFactories factory
                        = CliSupport.resolveBuiltinIoServiceFactory(System.err, optName, provider);
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `index`
in `sshd-cli/src/main/java/org/apache/sshd/cli/client/SshKeyScanMain.java`
#### Snippet
```java

                List<String> hosts = new ArrayList<>(remaining);
                for (; index < numArgs; index++) {
                    hosts.add(args[index]);
                }
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `line`
in `sshd-cli/src/main/java/org/apache/sshd/cli/client/SshKeyScanMain.java`
#### Snippet
```java
                client.start();
                for (String line = rdr.readLine(); line != null; line = rdr.readLine()) {
                    line = GenericUtils.replaceWhitespaceAndTrim(line);

                    String[] hosts = GenericUtils.split(line, ',');
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `sshd-cli/src/main/java/org/apache/sshd/cli/client/SshClientCliSupport.java`
#### Snippet
```java
            String argVal = null;
            if (isArgumentedOption(portOption, argName)) {
                i++;
                if (i >= numArgs) {
                    error = CliLogger.showError(stderr, "option requires an argument: " + argName);
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `index`
in `sshd-putty/src/main/java/org/apache/sshd/putty/AbstractPuttyKeyDecoder.java`
#### Snippet
```java
                case PUBLIC_LINES_HEADER:
                    pubLines = extractDataLines(resourceKey, lines, index + 1, hdrName, hdrValue, pubLines);
                    index += pubLines.size();
                    break;
                case PRIVATE_LINES_HEADER:
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `index`
in `sshd-putty/src/main/java/org/apache/sshd/putty/AbstractPuttyKeyDecoder.java`
#### Snippet
```java
                case PRIVATE_LINES_HEADER:
                    prvLines = extractDataLines(resourceKey, lines, index + 1, hdrName, hdrValue, prvLines);
                    index += prvLines.size();
                    break;
                default: // ignored
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `line`
in `sshd-core/src/main/java/org/apache/sshd/client/keyverifier/KnownHostsServerKeyVerifier.java`
#### Snippet
```java
                        continue;
                    }
                    line = GenericUtils.trimToEmpty(line);
                    if (GenericUtils.isEmpty(line)) {
                        lines.add(line);
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `line`
in `sshd-core/src/main/java/org/apache/sshd/client/keyverifier/KnownHostsServerKeyVerifier.java`
#### Snippet
```java

                    if (pos > 0) {
                        line = line.substring(0, pos);
                        line = line.trim();
                    }
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `line`
in `sshd-core/src/main/java/org/apache/sshd/client/keyverifier/KnownHostsServerKeyVerifier.java`
#### Snippet
```java
                    if (pos > 0) {
                        line = line.substring(0, pos);
                        line = line.trim();
                    }

```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `line`
in `sshd-core/src/main/java/org/apache/sshd/server/kex/Moduli.java`
#### Snippet
```java
        List<DhGroup> groups = new ArrayList<>();
        for (String line = r.readLine(); line != null; line = r.readLine()) {
            line = line.trim();
            if (line.isEmpty()) {
                continue;   // skip empty lines
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `dirEndSignal`
in `sshd-scp/src/main/java/org/apache/sshd/scp/client/ScpRemote2RemoteTransferHelper.java`
#### Snippet
```java
                        ScpDirEndCommandDetails details = ScpDirEndCommandDetails.parse(header);
                        signalReceivedCommand(details);
                        dirEndSignal = true;
                        break;
                    }
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `time`
in `sshd-scp/src/main/java/org/apache/sshd/scp/common/ScpHelper.java`
#### Snippet
```java
                        log.debug("receive({}) - Received 'T' header: {}", this, line);
                    }
                    time = ScpTimestampCommandDetails.parse(line);
                    sendOk();
                    continue;
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `time`
in `sshd-scp/src/main/java/org/apache/sshd/scp/common/ScpHelper.java`
#### Snippet
```java
                handler.process(session, line, isDir, time);
            } finally {
                time = null;
            }
        }
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `buffer`
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/SessionHelper.java`
#### Snippet
```java
        for (Buffer buffer = null; kdfSize > e.length; buffer = BufferUtils.clear(buffer)) {
            if (buffer == null) {
                buffer = new ByteArrayBuffer();
            }

```

## RuleId[id=NestedSynchronizedStatement]
### NestedSynchronizedStatement
Nested `synchronized` statement
in `sshd-core/src/main/java/org/apache/sshd/client/keyverifier/KnownHostsServerKeyVerifier.java`
#### Snippet
```java
            }

            synchronized (match) {
                match.setServerKey(actual);
                entry.setConfigLine(newLine);
```

## RuleId[id=PublicFieldAccessedInSynchronizedContext]
### PublicFieldAccessedInSynchronizedContext
Non-private field `this.in` accessed in synchronized context
in `sshd-common/src/main/java/org/apache/sshd/server/shell/TtyFilterInputStream.java`
#### Snippet
```java
        if (buffer.available() == 0) {
            buffer.compact();
            int nb = this.in.read(b, off, len);
            if (nb == -1) {
                return nb;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `streaming` accessed in synchronized context
in `sshd-core/src/main/java/org/apache/sshd/agent/unix/AgentForwardedChannel.java`
#### Snippet
```java
    @Override
    protected synchronized void doOpen() throws IOException {
        ValidateUtils.checkTrue(!Streaming.Async.equals(streaming),
                "Asynchronous streaming isn't supported yet on this channel");
        invertedIn = new ChannelOutputStream(this, getRemoteWindow(), log, SshConstants.SSH_MSG_CHANNEL_DATA, true);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `invertedIn` accessed in synchronized context
in `sshd-core/src/main/java/org/apache/sshd/agent/unix/AgentForwardedChannel.java`
#### Snippet
```java
        ValidateUtils.checkTrue(!Streaming.Async.equals(streaming),
                "Asynchronous streaming isn't supported yet on this channel");
        invertedIn = new ChannelOutputStream(this, getRemoteWindow(), log, SshConstants.SSH_MSG_CHANNEL_DATA, true);
    }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `openFuture` accessed in synchronized context
in `sshd-core/src/main/java/org/apache/sshd/client/channel/ChannelDirectTcpip.java`
#### Snippet
```java
        }

        openFuture = new DefaultOpenFuture(remote, futureLock);
        if (log.isDebugEnabled()) {
            log.debug("open({}) SSH_MSG_CHANNEL_OPEN", this);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `openFuture` accessed in synchronized context
in `sshd-core/src/main/java/org/apache/sshd/client/channel/ChannelDirectTcpip.java`
#### Snippet
```java
        buffer.putUInt(local.getPort());
        writePacket(buffer);
        return openFuture;
    }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `openFuture` accessed in synchronized context
in `sshd-core/src/main/java/org/apache/sshd/client/channel/AbstractClientChannel.java`
#### Snippet
```java
        }

        openFuture = new DefaultOpenFuture(this.toString(), futureLock);
        String type = getChannelType();
        if (log.isDebugEnabled()) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `openFuture` accessed in synchronized context
in `sshd-core/src/main/java/org/apache/sshd/client/channel/AbstractClientChannel.java`
#### Snippet
```java
        buffer.putUInt(wLocal.getPacketSize());
        writePacket(buffer);
        return openFuture;
    }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `clientHeartbeat` accessed in synchronized context
in `sshd-core/src/main/java/org/apache/sshd/client/session/ClientConnectionService.java`
#### Snippet
```java
            FactoryManager manager = session.getFactoryManager();
            ScheduledExecutorService service = manager.getScheduledExecutorService();
            clientHeartbeat = service.scheduleAtFixedRate(
                    this::sendHeartBeat, heartbeatInterval.toMillis(), heartbeatInterval.toMillis(), TimeUnit.MILLISECONDS);
            if (log.isDebugEnabled()) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `clientHeartbeat` accessed in synchronized context
in `sshd-core/src/main/java/org/apache/sshd/client/session/ClientConnectionService.java`
#### Snippet
```java
            }

            return clientHeartbeat;
        } else {
            return super.startHeartBeat();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `clientHeartbeat` accessed in synchronized context
in `sshd-core/src/main/java/org/apache/sshd/client/session/ClientConnectionService.java`
#### Snippet
```java
        } finally {
            // No need to cancel since this is the same reference as the superclass heartbeat future
            if (clientHeartbeat != null) {
                clientHeartbeat = null;
            }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `clientHeartbeat` accessed in synchronized context
in `sshd-core/src/main/java/org/apache/sshd/client/session/ClientConnectionService.java`
#### Snippet
```java
            // No need to cancel since this is the same reference as the superclass heartbeat future
            if (clientHeartbeat != null) {
                clientHeartbeat = null;
            }
        }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `kexInitializedFuture` accessed in synchronized context
in `sshd-core/src/main/java/org/apache/sshd/client/session/AbstractClientSession.java`
#### Snippet
```java

                synchronized (kexState) {
                    DefaultKeyExchangeFuture initFuture = kexInitializedFuture;
                    if (initFuture == null) {
                        initFuture = new DefaultKeyExchangeFuture(toString(), null);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `kexInitializedFuture` accessed in synchronized context
in `sshd-core/src/main/java/org/apache/sshd/client/session/AbstractClientSession.java`
#### Snippet
```java
                    if (initFuture == null) {
                        initFuture = new DefaultKeyExchangeFuture(toString(), null);
                        kexInitializedFuture = initFuture;
                    }
                    try {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `streaming` accessed in synchronized context
in `sshd-core/src/main/java/org/apache/sshd/common/forward/TcpipClientChannel.java`
#### Snippet
```java
    @Override
    protected synchronized void doOpen() throws IOException {
        if (streaming == Streaming.Async) {
            asyncIn = new ChannelAsyncOutputStream(this, SshConstants.SSH_MSG_CHANNEL_DATA) {
                @SuppressWarnings("synthetic-access")
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `asyncIn` accessed in synchronized context
in `sshd-core/src/main/java/org/apache/sshd/common/forward/TcpipClientChannel.java`
#### Snippet
```java
    protected synchronized void doOpen() throws IOException {
        if (streaming == Streaming.Async) {
            asyncIn = new ChannelAsyncOutputStream(this, SshConstants.SSH_MSG_CHANNEL_DATA) {
                @SuppressWarnings("synthetic-access")
                @Override
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `asyncOut` accessed in synchronized context
in `sshd-core/src/main/java/org/apache/sshd/common/forward/TcpipClientChannel.java`
#### Snippet
```java
                }
            };
            asyncOut = new ChannelAsyncInputStream(this);
        } else {
            out = new ChannelOutputStream(
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `out` accessed in synchronized context
in `sshd-core/src/main/java/org/apache/sshd/common/forward/TcpipClientChannel.java`
#### Snippet
```java
            asyncOut = new ChannelAsyncInputStream(this);
        } else {
            out = new ChannelOutputStream(
                    this, getRemoteWindow(), log, SshConstants.SSH_MSG_CHANNEL_DATA, true);
            invertedIn = out;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `invertedIn` accessed in synchronized context
in `sshd-core/src/main/java/org/apache/sshd/common/forward/TcpipClientChannel.java`
#### Snippet
```java
            out = new ChannelOutputStream(
                    this, getRemoteWindow(), log, SshConstants.SSH_MSG_CHANNEL_DATA, true);
            invertedIn = out;
        }
    }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `out` accessed in synchronized context
in `sshd-core/src/main/java/org/apache/sshd/common/forward/TcpipClientChannel.java`
#### Snippet
```java
            out = new ChannelOutputStream(
                    this, getRemoteWindow(), log, SshConstants.SSH_MSG_CHANNEL_DATA, true);
            invertedIn = out;
        }
    }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `localEntry` accessed in synchronized context
in `sshd-core/src/main/java/org/apache/sshd/common/forward/TcpipClientChannel.java`
#### Snippet
```java
            case Forwarded:
                src = (InetSocketAddress) portSession.getRemoteAddress();
                dst = localEntry;
                tunnelEntrance = new SshdSocketAddress(src.getHostString(), src.getPort());
                tunnelExit = new SshdSocketAddress(loc.getHostString(), loc.getPort());
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `openFuture` accessed in synchronized context
in `sshd-core/src/main/java/org/apache/sshd/common/forward/TcpipClientChannel.java`
#### Snippet
```java
        }

        openFuture = new DefaultOpenFuture(src, futureLock);
        if (log.isDebugEnabled()) {
            log.debug("open({}) send SSH_MSG_CHANNEL_OPEN", this);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `openFuture` accessed in synchronized context
in `sshd-core/src/main/java/org/apache/sshd/common/forward/TcpipClientChannel.java`
#### Snippet
```java
        buffer.putUInt(src.getPort());
        writePacket(buffer);
        return openFuture;
    }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `ioServiceFactoryFactory` accessed in synchronized context
in `sshd-core/src/main/java/org/apache/sshd/common/helpers/AbstractFactoryManager.java`
#### Snippet
```java
    @Override
    public IoServiceFactory getIoServiceFactory() {
        synchronized (ioServiceFactoryFactory) {
            if (ioServiceFactory == null) {
                ioServiceFactory = ioServiceFactoryFactory.create(this);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `ioServiceFactory` accessed in synchronized context
in `sshd-core/src/main/java/org/apache/sshd/common/helpers/AbstractFactoryManager.java`
#### Snippet
```java
    public IoServiceFactory getIoServiceFactory() {
        synchronized (ioServiceFactoryFactory) {
            if (ioServiceFactory == null) {
                ioServiceFactory = ioServiceFactoryFactory.create(this);
            }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `ioServiceFactory` accessed in synchronized context
in `sshd-core/src/main/java/org/apache/sshd/common/helpers/AbstractFactoryManager.java`
#### Snippet
```java
        synchronized (ioServiceFactoryFactory) {
            if (ioServiceFactory == null) {
                ioServiceFactory = ioServiceFactoryFactory.create(this);
            }
        }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `ioServiceFactoryFactory` accessed in synchronized context
in `sshd-core/src/main/java/org/apache/sshd/common/helpers/AbstractFactoryManager.java`
#### Snippet
```java
        synchronized (ioServiceFactoryFactory) {
            if (ioServiceFactory == null) {
                ioServiceFactory = ioServiceFactoryFactory.create(this);
            }
        }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `streaming` accessed in synchronized context
in `sshd-core/src/main/java/org/apache/sshd/server/x11/ChannelForwardedX11.java`
#### Snippet
```java
    @Override
    protected synchronized void doOpen() throws IOException {
        if (Streaming.Async.equals(streaming)) {
            throw new IllegalArgumentException("Asynchronous streaming isn't supported yet on this channel");
        }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `out` accessed in synchronized context
in `sshd-core/src/main/java/org/apache/sshd/server/x11/ChannelForwardedX11.java`
#### Snippet
```java
        }

        out = new ChannelOutputStream(
                this, getRemoteWindow(), log, SshConstants.SSH_MSG_CHANNEL_DATA, true);
        invertedIn = out;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `invertedIn` accessed in synchronized context
in `sshd-core/src/main/java/org/apache/sshd/server/x11/ChannelForwardedX11.java`
#### Snippet
```java
        out = new ChannelOutputStream(
                this, getRemoteWindow(), log, SshConstants.SSH_MSG_CHANNEL_DATA, true);
        invertedIn = out;
    }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `out` accessed in synchronized context
in `sshd-core/src/main/java/org/apache/sshd/server/x11/ChannelForwardedX11.java`
#### Snippet
```java
        out = new ChannelOutputStream(
                this, getRemoteWindow(), log, SshConstants.SSH_MSG_CHANNEL_DATA, true);
        invertedIn = out;
    }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `openFuture` accessed in synchronized context
in `sshd-core/src/main/java/org/apache/sshd/server/x11/ChannelForwardedX11.java`
#### Snippet
```java
            throw new SshException("Session has been closed");
        }
        openFuture = new DefaultOpenFuture(remote, futureLock);

        Session session = getSession();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `openFuture` accessed in synchronized context
in `sshd-core/src/main/java/org/apache/sshd/server/x11/ChannelForwardedX11.java`
#### Snippet
```java
        buffer.putUInt(remote.getPort());
        writePacket(buffer);
        return openFuture;
    }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `this.authed` accessed in synchronized context
in `sshd-core/src/main/java/org/apache/sshd/server/auth/AsyncAuthException.java`
#### Snippet
```java
        Object listener;
        synchronized (this) {
            if (this.authed != null) {
                return;
            }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `this.authed` accessed in synchronized context
in `sshd-core/src/main/java/org/apache/sshd/server/auth/AsyncAuthException.java`
#### Snippet
```java
                return;
            }
            this.authed = authed;
            listener = this.listener;
        }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `this.listener` accessed in synchronized context
in `sshd-core/src/main/java/org/apache/sshd/server/auth/AsyncAuthException.java`
#### Snippet
```java
            }
            this.authed = authed;
            listener = this.listener;
        }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `this.listener` accessed in synchronized context
in `sshd-core/src/main/java/org/apache/sshd/server/auth/AsyncAuthException.java`
#### Snippet
```java
        Boolean result;
        synchronized (this) {
            if (this.listener == null) {
                this.listener = listener;
            } else if (this.listener instanceof Consumer<?>) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `this.listener` accessed in synchronized context
in `sshd-core/src/main/java/org/apache/sshd/server/auth/AsyncAuthException.java`
#### Snippet
```java
        synchronized (this) {
            if (this.listener == null) {
                this.listener = listener;
            } else if (this.listener instanceof Consumer<?>) {
                this.listener = new Object[] { this.listener, listener };
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `this.listener` accessed in synchronized context
in `sshd-core/src/main/java/org/apache/sshd/server/auth/AsyncAuthException.java`
#### Snippet
```java
            if (this.listener == null) {
                this.listener = listener;
            } else if (this.listener instanceof Consumer<?>) {
                this.listener = new Object[] { this.listener, listener };
            } else {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `this.listener` accessed in synchronized context
in `sshd-core/src/main/java/org/apache/sshd/server/auth/AsyncAuthException.java`
#### Snippet
```java
                this.listener = listener;
            } else if (this.listener instanceof Consumer<?>) {
                this.listener = new Object[] { this.listener, listener };
            } else {
                Object[] ol = (Object[]) this.listener;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `this.listener` accessed in synchronized context
in `sshd-core/src/main/java/org/apache/sshd/server/auth/AsyncAuthException.java`
#### Snippet
```java
                this.listener = listener;
            } else if (this.listener instanceof Consumer<?>) {
                this.listener = new Object[] { this.listener, listener };
            } else {
                Object[] ol = (Object[]) this.listener;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `this.listener` accessed in synchronized context
in `sshd-core/src/main/java/org/apache/sshd/server/auth/AsyncAuthException.java`
#### Snippet
```java
                this.listener = new Object[] { this.listener, listener };
            } else {
                Object[] ol = (Object[]) this.listener;
                int l = ol.length;
                Object[] nl = new Object[l + 1];
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `this.listener` accessed in synchronized context
in `sshd-core/src/main/java/org/apache/sshd/server/auth/AsyncAuthException.java`
#### Snippet
```java
                System.arraycopy(ol, 0, nl, 0, l);
                nl[l] = listener;
                this.listener = nl;
            }
            result = this.authed;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `this.authed` accessed in synchronized context
in `sshd-core/src/main/java/org/apache/sshd/server/auth/AsyncAuthException.java`
#### Snippet
```java
                this.listener = nl;
            }
            result = this.authed;
        }
        if (result != null) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `ignorePacketsFrequency` accessed in synchronized context
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/AbstractSession.java`
#### Snippet
```java
        synchronized (random) {
            count = calculateNextIgnorePacketCount(
                    random, ignorePacketsFrequency, ignorePacketsVariance);
            ignorePacketsCount.set(count);
            return ignorePacketDataLength + random.random(ignorePacketDataLength);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `ignorePacketsVariance` accessed in synchronized context
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/AbstractSession.java`
#### Snippet
```java
        synchronized (random) {
            count = calculateNextIgnorePacketCount(
                    random, ignorePacketsFrequency, ignorePacketsVariance);
            ignorePacketsCount.set(count);
            return ignorePacketDataLength + random.random(ignorePacketDataLength);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `ignorePacketDataLength` accessed in synchronized context
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/AbstractSession.java`
#### Snippet
```java
                    random, ignorePacketsFrequency, ignorePacketsVariance);
            ignorePacketsCount.set(count);
            return ignorePacketDataLength + random.random(ignorePacketDataLength);
        }
    }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `ignorePacketDataLength` accessed in synchronized context
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/AbstractSession.java`
#### Snippet
```java
                    random, ignorePacketsFrequency, ignorePacketsVariance);
            ignorePacketsCount.set(count);
            return ignorePacketDataLength + random.random(ignorePacketDataLength);
        }
    }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `kexInitializedFuture` accessed in synchronized context
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/AbstractSession.java`
#### Snippet
```java
        byte[] seed;
        synchronized (kexState) {
            DefaultKeyExchangeFuture initFuture = kexInitializedFuture;
            if (initFuture == null) {
                initFuture = new DefaultKeyExchangeFuture(toString(), null);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `kexInitializedFuture` accessed in synchronized context
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/AbstractSession.java`
#### Snippet
```java
            if (initFuture == null) {
                initFuture = new DefaultKeyExchangeFuture(toString(), null);
                kexInitializedFuture = initFuture;
            }
            try {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `kexInitializedFuture` accessed in synchronized context
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/AbstractSession.java`
#### Snippet
```java

        synchronized (kexState) {
            kexInitializedFuture = null;
        }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `maxRekeyBytes` accessed in synchronized context
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/AbstractSession.java`
#### Snippet
```java
        synchronized (random) {
            // re-keying configuration
            maxRekeyBytes = CoreModuleProperties.REKEY_BYTES_LIMIT.getRequired(this);
            maxRekeyInterval = CoreModuleProperties.REKEY_TIME_LIMIT.getRequired(this);
            maxRekyPackets = CoreModuleProperties.REKEY_PACKETS_LIMIT.getRequired(this);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `maxRekeyInterval` accessed in synchronized context
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/AbstractSession.java`
#### Snippet
```java
            // re-keying configuration
            maxRekeyBytes = CoreModuleProperties.REKEY_BYTES_LIMIT.getRequired(this);
            maxRekeyInterval = CoreModuleProperties.REKEY_TIME_LIMIT.getRequired(this);
            maxRekyPackets = CoreModuleProperties.REKEY_PACKETS_LIMIT.getRequired(this);

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `maxRekyPackets` accessed in synchronized context
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/AbstractSession.java`
#### Snippet
```java
            maxRekeyBytes = CoreModuleProperties.REKEY_BYTES_LIMIT.getRequired(this);
            maxRekeyInterval = CoreModuleProperties.REKEY_TIME_LIMIT.getRequired(this);
            maxRekyPackets = CoreModuleProperties.REKEY_PACKETS_LIMIT.getRequired(this);

            // intermittent SSH_MSG_IGNORE stream padding
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `ignorePacketDataLength` accessed in synchronized context
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/AbstractSession.java`
#### Snippet
```java

            // intermittent SSH_MSG_IGNORE stream padding
            ignorePacketDataLength = CoreModuleProperties.IGNORE_MESSAGE_SIZE.getRequired(this);
            ignorePacketsFrequency = CoreModuleProperties.IGNORE_MESSAGE_FREQUENCY.getRequired(this);
            ignorePacketsVariance = CoreModuleProperties.IGNORE_MESSAGE_VARIANCE.getRequired(this);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `ignorePacketsFrequency` accessed in synchronized context
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/AbstractSession.java`
#### Snippet
```java
            // intermittent SSH_MSG_IGNORE stream padding
            ignorePacketDataLength = CoreModuleProperties.IGNORE_MESSAGE_SIZE.getRequired(this);
            ignorePacketsFrequency = CoreModuleProperties.IGNORE_MESSAGE_FREQUENCY.getRequired(this);
            ignorePacketsVariance = CoreModuleProperties.IGNORE_MESSAGE_VARIANCE.getRequired(this);
            if (ignorePacketsVariance >= ignorePacketsFrequency) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `ignorePacketsVariance` accessed in synchronized context
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/AbstractSession.java`
#### Snippet
```java
            ignorePacketDataLength = CoreModuleProperties.IGNORE_MESSAGE_SIZE.getRequired(this);
            ignorePacketsFrequency = CoreModuleProperties.IGNORE_MESSAGE_FREQUENCY.getRequired(this);
            ignorePacketsVariance = CoreModuleProperties.IGNORE_MESSAGE_VARIANCE.getRequired(this);
            if (ignorePacketsVariance >= ignorePacketsFrequency) {
                ignorePacketsVariance = 0;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `ignorePacketsVariance` accessed in synchronized context
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/AbstractSession.java`
#### Snippet
```java
            ignorePacketsFrequency = CoreModuleProperties.IGNORE_MESSAGE_FREQUENCY.getRequired(this);
            ignorePacketsVariance = CoreModuleProperties.IGNORE_MESSAGE_VARIANCE.getRequired(this);
            if (ignorePacketsVariance >= ignorePacketsFrequency) {
                ignorePacketsVariance = 0;
            }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `ignorePacketsFrequency` accessed in synchronized context
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/AbstractSession.java`
#### Snippet
```java
            ignorePacketsFrequency = CoreModuleProperties.IGNORE_MESSAGE_FREQUENCY.getRequired(this);
            ignorePacketsVariance = CoreModuleProperties.IGNORE_MESSAGE_VARIANCE.getRequired(this);
            if (ignorePacketsVariance >= ignorePacketsFrequency) {
                ignorePacketsVariance = 0;
            }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `ignorePacketsVariance` accessed in synchronized context
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/AbstractSession.java`
#### Snippet
```java
            ignorePacketsVariance = CoreModuleProperties.IGNORE_MESSAGE_VARIANCE.getRequired(this);
            if (ignorePacketsVariance >= ignorePacketsFrequency) {
                ignorePacketsVariance = 0;
            }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `ignorePacketsFrequency` accessed in synchronized context
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/AbstractSession.java`
#### Snippet
```java

            long countValue = calculateNextIgnorePacketCount(
                    random, ignorePacketsFrequency, ignorePacketsVariance);
            ignorePacketsCount.set(countValue);
        }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `ignorePacketsVariance` accessed in synchronized context
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/AbstractSession.java`
#### Snippet
```java

            long countValue = calculateNextIgnorePacketCount(
                    random, ignorePacketsFrequency, ignorePacketsVariance);
            ignorePacketsCount.set(countValue);
        }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `kexInitializedFuture` accessed in synchronized context
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/AbstractSession.java`
#### Snippet
```java
        DefaultKeyExchangeFuture initFuture;
        synchronized (kexState) {
            initFuture = kexInitializedFuture;
        }
        if (initFuture != null) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `clientVersion` accessed in synchronized context
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/AbstractSession.java`
#### Snippet
```java
            // One of those properties will be set by the constructor and the other
            // one should be set by the readIdentification method
            if ((clientVersion == null) || (serverVersion == null)) {
                if (readIdentification(decoderBuffer)) {
                    decoderBuffer.compact();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `serverVersion` accessed in synchronized context
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/AbstractSession.java`
#### Snippet
```java
            // One of those properties will be set by the constructor and the other
            // one should be set by the readIdentification method
            if ((clientVersion == null) || (serverVersion == null)) {
                if (readIdentification(decoderBuffer)) {
                    decoderBuffer.compact();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `kexInitializedFuture` accessed in synchronized context
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/AbstractSession.java`
#### Snippet
```java
                DefaultKeyExchangeFuture initFuture;
                synchronized (kexState) {
                    initFuture = kexInitializedFuture;
                    if (initFuture == null) {
                        initFuture = new DefaultKeyExchangeFuture(toString(), null);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `kexInitializedFuture` accessed in synchronized context
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/AbstractSession.java`
#### Snippet
```java
                    if (initFuture == null) {
                        initFuture = new DefaultKeyExchangeFuture(toString(), null);
                        kexInitializedFuture = initFuture;
                    }
                }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `kexInitializedFuture` accessed in synchronized context
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/AbstractSession.java`
#### Snippet
```java

        synchronized (kexState) {
            kexInitializedFuture = null;
        }
        signalSessionEvent(SessionListener.Event.KexCompleted);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `lock` accessed in synchronized context
in `sshd-scp/src/main/java/org/apache/sshd/scp/server/InputStreamReader.java`
#### Snippet
```java
    @Override
    public boolean ready() throws IOException {
        synchronized (lock) {
            if (in == null) {
                throw new IOException("InputStreamReader is closed.");
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `bytes` accessed in synchronized context
in `sshd-scp/src/main/java/org/apache/sshd/scp/server/InputStreamReader.java`
#### Snippet
```java
            }
            try {
                return bytes.hasRemaining() || in.available() > 0;
            } catch (IOException e) {
                return false;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `lock` accessed in synchronized context
in `sshd-scp/src/main/java/org/apache/sshd/scp/server/InputStreamReader.java`
#### Snippet
```java
    @Override
    public int read() throws IOException {
        synchronized (lock) {
            if (!isOpen()) {
                throw new IOException("InputStreamReader is closed.");
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `pending` accessed in synchronized context
in `sshd-scp/src/main/java/org/apache/sshd/scp/server/InputStreamReader.java`
#### Snippet
```java
            }

            if (pending != (char) -1) {
                char c = pending;
                pending = (char) -1;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `pending` accessed in synchronized context
in `sshd-scp/src/main/java/org/apache/sshd/scp/server/InputStreamReader.java`
#### Snippet
```java

            if (pending != (char) -1) {
                char c = pending;
                pending = (char) -1;
                return c;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `pending` accessed in synchronized context
in `sshd-scp/src/main/java/org/apache/sshd/scp/server/InputStreamReader.java`
#### Snippet
```java
            if (pending != (char) -1) {
                char c = pending;
                pending = (char) -1;
                return c;
            }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `pending` accessed in synchronized context
in `sshd-scp/src/main/java/org/apache/sshd/scp/server/InputStreamReader.java`
#### Snippet
```java
            int nb = read(buf, 0, 2);
            if (nb == 2) {
                pending = buf[1];
            }
            if (nb > 0) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `lock` accessed in synchronized context
in `sshd-scp/src/main/java/org/apache/sshd/scp/server/InputStreamReader.java`
#### Snippet
```java
    @Override
    public int read(char[] buf, int offset, int length) throws IOException {
        synchronized (lock) {
            if (!isOpen()) {
                throw new IOException("InputStreamReader is closed.");
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `bytes` accessed in synchronized context
in `sshd-scp/src/main/java/org/apache/sshd/scp/server/InputStreamReader.java`
#### Snippet
```java
            // bytes.remaining() indicates number of bytes in buffer
            // when 1-st time entered, it'll be equal to zero
            boolean needInput = !bytes.hasRemaining();

            while (out.position() == offset) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `bytes` accessed in synchronized context
in `sshd-scp/src/main/java/org/apache/sshd/scp/server/InputStreamReader.java`
#### Snippet
```java
                    }

                    int off = bytes.arrayOffset() + bytes.limit();
                    int was_red = in.read(bytes.array(), off, 1);

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `bytes` accessed in synchronized context
in `sshd-scp/src/main/java/org/apache/sshd/scp/server/InputStreamReader.java`
#### Snippet
```java
                    }

                    int off = bytes.arrayOffset() + bytes.limit();
                    int was_red = in.read(bytes.array(), off, 1);

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `bytes` accessed in synchronized context
in `sshd-scp/src/main/java/org/apache/sshd/scp/server/InputStreamReader.java`
#### Snippet
```java

                    int off = bytes.arrayOffset() + bytes.limit();
                    int was_red = in.read(bytes.array(), off, 1);

                    if (was_red == -1) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `bytes` accessed in synchronized context
in `sshd-scp/src/main/java/org/apache/sshd/scp/server/InputStreamReader.java`
#### Snippet
```java
                        break;
                    }
                    bytes.limit(bytes.limit() + was_red);
                }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `bytes` accessed in synchronized context
in `sshd-scp/src/main/java/org/apache/sshd/scp/server/InputStreamReader.java`
#### Snippet
```java
                        break;
                    }
                    bytes.limit(bytes.limit() + was_red);
                }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `decoder` accessed in synchronized context
in `sshd-scp/src/main/java/org/apache/sshd/scp/server/InputStreamReader.java`
#### Snippet
```java

                // decode bytes
                result = decoder.decode(bytes, out, false);

                if (result.isUnderflow()) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `bytes` accessed in synchronized context
in `sshd-scp/src/main/java/org/apache/sshd/scp/server/InputStreamReader.java`
#### Snippet
```java

                // decode bytes
                result = decoder.decode(bytes, out, false);

                if (result.isUnderflow()) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `bytes` accessed in synchronized context
in `sshd-scp/src/main/java/org/apache/sshd/scp/server/InputStreamReader.java`
#### Snippet
```java
                if (result.isUnderflow()) {
                    // compact the buffer if no space left
                    if (bytes.limit() == bytes.capacity()) {
                        bytes.compact();
                        bytes.limit(bytes.position());
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `bytes` accessed in synchronized context
in `sshd-scp/src/main/java/org/apache/sshd/scp/server/InputStreamReader.java`
#### Snippet
```java
                if (result.isUnderflow()) {
                    // compact the buffer if no space left
                    if (bytes.limit() == bytes.capacity()) {
                        bytes.compact();
                        bytes.limit(bytes.position());
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `bytes` accessed in synchronized context
in `sshd-scp/src/main/java/org/apache/sshd/scp/server/InputStreamReader.java`
#### Snippet
```java
                    // compact the buffer if no space left
                    if (bytes.limit() == bytes.capacity()) {
                        bytes.compact();
                        bytes.limit(bytes.position());
                        bytes.position(0);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `bytes` accessed in synchronized context
in `sshd-scp/src/main/java/org/apache/sshd/scp/server/InputStreamReader.java`
#### Snippet
```java
                    if (bytes.limit() == bytes.capacity()) {
                        bytes.compact();
                        bytes.limit(bytes.position());
                        bytes.position(0);
                    }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `bytes` accessed in synchronized context
in `sshd-scp/src/main/java/org/apache/sshd/scp/server/InputStreamReader.java`
#### Snippet
```java
                    if (bytes.limit() == bytes.capacity()) {
                        bytes.compact();
                        bytes.limit(bytes.position());
                        bytes.position(0);
                    }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `bytes` accessed in synchronized context
in `sshd-scp/src/main/java/org/apache/sshd/scp/server/InputStreamReader.java`
#### Snippet
```java
                        bytes.compact();
                        bytes.limit(bytes.position());
                        bytes.position(0);
                    }
                    needInput = true;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `decoder` accessed in synchronized context
in `sshd-scp/src/main/java/org/apache/sshd/scp/server/InputStreamReader.java`
#### Snippet
```java

            if (result == CoderResult.UNDERFLOW && endOfInput) {
                result = decoder.decode(bytes, out, true);
                decoder.flush(out);
                decoder.reset();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `bytes` accessed in synchronized context
in `sshd-scp/src/main/java/org/apache/sshd/scp/server/InputStreamReader.java`
#### Snippet
```java

            if (result == CoderResult.UNDERFLOW && endOfInput) {
                result = decoder.decode(bytes, out, true);
                decoder.flush(out);
                decoder.reset();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `decoder` accessed in synchronized context
in `sshd-scp/src/main/java/org/apache/sshd/scp/server/InputStreamReader.java`
#### Snippet
```java
            if (result == CoderResult.UNDERFLOW && endOfInput) {
                result = decoder.decode(bytes, out, true);
                decoder.flush(out);
                decoder.reset();
            }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `decoder` accessed in synchronized context
in `sshd-scp/src/main/java/org/apache/sshd/scp/server/InputStreamReader.java`
#### Snippet
```java
                result = decoder.decode(bytes, out, true);
                decoder.flush(out);
                decoder.reset();
            }
            if (result.isMalformed()) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `lock` accessed in synchronized context
in `sshd-scp/src/main/java/org/apache/sshd/scp/server/InputStreamReader.java`
#### Snippet
```java
    @Override
    public void close() throws IOException {
        synchronized (lock) {
            decoder = null;
            if (in != null) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `decoder` accessed in synchronized context
in `sshd-scp/src/main/java/org/apache/sshd/scp/server/InputStreamReader.java`
#### Snippet
```java
    public void close() throws IOException {
        synchronized (lock) {
            decoder = null;
            if (in != null) {
                in.close();
```

## RuleId[id=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `sshd-common/src/main/java/org/apache/sshd/common/util/io/IoUtils.java`
#### Snippet
```java
     */
    @SuppressWarnings("ThrowableResultOfMethodCallIgnored")
    public static IOException closeQuietly(Closeable... closeables) {
        return closeQuietly(GenericUtils.isEmpty(closeables)
                ? Collections.emptyList()
```

### RedundantSuppression
Redundant suppression
in `sshd-common/src/main/java/org/apache/sshd/common/util/io/IoUtils.java`
#### Snippet
```java
     */
    @SuppressWarnings("ThrowableResultOfMethodCallIgnored")
    public static IOException closeQuietly(Closeable c) {
        if (c != null) {
            try {
```

### RedundantSuppression
Redundant suppression
in `sshd-common/src/main/java/org/apache/sshd/common/util/io/IoUtils.java`
#### Snippet
```java
     */
    @SuppressWarnings("ThrowableResultOfMethodCallIgnored")
    public static IOException closeQuietly(Collection<? extends Closeable> closeables) {
        if (GenericUtils.isEmpty(closeables)) {
            return null;
```

### RedundantSuppression
Redundant suppression
in `sshd-common/src/main/java/org/apache/sshd/common/util/io/der/DERWriter.java`
#### Snippet
```java
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        AtomicBoolean dataWritten = new AtomicBoolean(false);
        @SuppressWarnings("resource")
        DERWriter encloser = this;
        return new DERWriter(baos) {
            @Override
```

### RedundantSuppression
Redundant suppression
in `sshd-core/src/main/java/org/apache/sshd/agent/unix/AprLibrary.java`
#### Snippet
```java
    @Override
    @SuppressWarnings({ "checkstyle:NoFinalizer", "deprecation" })
    protected void finalize() throws Throwable {
        library = null;
        Pool.destroy(pool);
```

### RedundantSuppression
Redundant suppression
in `sshd-core/src/main/java/org/apache/sshd/common/kex/extension/DefaultServerKexExtensionHandler.java`
#### Snippet
```java
     */
    @SuppressWarnings("javadoc")
    public static final AttributeKey<Boolean> EXT_INFO_SENT_AT_NEWKEYS = new AttributeKey<>();

    public DefaultServerKexExtensionHandler() {
```

### RedundantSuppression
Redundant suppression
in `sshd-core/src/main/java/org/apache/sshd/common/kex/extension/DefaultServerKexExtensionHandler.java`
#### Snippet
```java
     */
    @SuppressWarnings("javadoc")
    public void collectExtensions(Session session, KexPhase phase, BiConsumer<String, Object> marshaller) {
        if (phase == KexPhase.NEWKEYS) {
            Collection<String> algorithms = session.getSignatureFactoriesNames();
```

### RedundantSuppression
Redundant suppression
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/SessionTimeoutListener.java`
#### Snippet
```java
    @SuppressWarnings("SuspiciousMethodCalls")
    @Override
    public void sessionClosed(Session s) {
        if (sessions.remove(s)) {
            if (log.isDebugEnabled()) {
```

### RedundantSuppression
Redundant suppression
in `sshd-netty/src/main/java/org/apache/sshd/netty/NettyIoAcceptor.java`
#### Snippet
```java

                            ChannelPipeline p = ch.pipeline();
                            @SuppressWarnings("resource")
                            NettyIoSession nettyIoSession = new NettyIoSession(NettyIoAcceptor.this, handler, service);
                            p.addLast(nettyIoSession.adapter);
                        } catch (Exception e) {
```

### RedundantSuppression
Redundant suppression
in `sshd-netty/src/main/java/org/apache/sshd/netty/NettyIoConnector.java`
#### Snippet
```java
                            }

                            @SuppressWarnings("resource")
                            NettyIoSession session = new NettyIoSession(NettyIoConnector.this, handler, null);
                            if (context != null) {
                                session.setAttribute(AttributeRepository.class, context);
```

### RedundantSuppression
Redundant suppression
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/client/fs/SftpPath.java`
#### Snippet
```java
     */
    @SuppressWarnings("javadoc")
    public SftpClient.Attributes getAttributes() {
        // Subclasses may override
        return null;
```

### RedundantSuppression
Redundant suppression
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/client/impl/SftpRemotePathChannel.java`
#### Snippet
```java

                // DO NOT CLOSE THE STREAM AS IT WOULD CLOSE THE HANDLE
                @SuppressWarnings("resource")
                SftpInputStreamAsync input = new SftpInputStreamAsync(
                        (AbstractSftpClient) sftp,
                        copySize, position, count, getRemotePath(), handle);
                totalRead = input.transferTo(count, target);
                eof = input.isEof();
```

### RedundantSuppression
Redundant suppression
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/client/impl/SftpRemotePathChannel.java`
#### Snippet
```java

                // DO NOT CLOSE THE OUTPUT STREAM AS IT WOULD CLOSE THE HANDLE
                @SuppressWarnings("resource")
                SftpOutputStreamAsync output = new SftpOutputStreamAsync(
                        (AbstractSftpClient) sftp,
                        copySize, getRemotePath(), handle);
                output.setOffset(position);

```

### RedundantSuppression
Redundant suppression
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/server/FileHandle.java`
#### Snippet
```java

    @SuppressWarnings("resource")
    public int read(byte[] data, int doff, int length, long offset, AtomicReference<Boolean> eof) throws IOException {
        SeekableByteChannel channel = getFileChannel();
        channel = channel.position(offset);
```

### RedundantSuppression
Redundant suppression
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/server/SftpSubsystem.java`
#### Snippet
```java
    @Override
    @SuppressWarnings("resource")
    protected void doCopyData(
            int id, String readHandle, long readOffset, long readLength, String writeHandle, long writeOffset)
            throws IOException {
```

### RedundantSuppression
Redundant suppression
in `sshd-spring-sftp/src/main/java/org/apache/sshd/sftp/spring/integration/SpringSftpSession.java`
#### Snippet
```java
    public String getHostPort() {
        SftpClient client = getClientInstance();
        @SuppressWarnings("resource")
        org.apache.sshd.common.session.Session session = (client == null) ? null : client.getSession();
        @SuppressWarnings("resource")
        IoSession ioSession = (session == null) ? null : session.getIoSession();
```

### RedundantSuppression
Redundant suppression
in `sshd-spring-sftp/src/main/java/org/apache/sshd/sftp/spring/integration/SpringSftpSession.java`
#### Snippet
```java
        @SuppressWarnings("resource")
        org.apache.sshd.common.session.Session session = (client == null) ? null : client.getSession();
        @SuppressWarnings("resource")
        IoSession ioSession = (session == null) ? null : session.getIoSession();
        SocketAddress peerAddress = (ioSession == null) ? null : ioSession.getRemoteAddress();
        if (peerAddress instanceof InetSocketAddress) {
```

## RuleId[id=UnnecessaryBoxing]
### UnnecessaryBoxing
Unnecessary boxing
in `sshd-common/src/main/java/org/apache/sshd/common/kex/extension/parser/HostBoundPubkeyAuthentication.java`
#### Snippet
```java
        String value = new String(data, off, len, StandardCharsets.UTF_8);
        try {
            Integer result = Integer.valueOf(Integer.parseUnsignedInt(value));
            LOG.info("Server announced support for {} version {}", NAME, result);
            return result;
```

### UnnecessaryBoxing
Unnecessary boxing
in `sshd-common/src/main/java/org/apache/sshd/common/util/io/der/ASN1Object.java`
#### Snippet
```java
        byte[] bytes = getValue();
        int val1 = bytes[0] & 0xFF;
        oid.add(Integer.valueOf(val1 / 40));
        oid.add(Integer.valueOf(val1 % 40));

```

### UnnecessaryBoxing
Unnecessary boxing
in `sshd-common/src/main/java/org/apache/sshd/common/util/io/der/ASN1Object.java`
#### Snippet
```java
        int val1 = bytes[0] & 0xFF;
        oid.add(Integer.valueOf(val1 / 40));
        oid.add(Integer.valueOf(val1 % 40));

        for (int curPos = 1; curPos < vLen; curPos++) {
```

### UnnecessaryBoxing
Unnecessary boxing
in `sshd-common/src/main/java/org/apache/sshd/common/util/io/der/ASN1Object.java`
#### Snippet
```java
            int v = bytes[curPos] & 0xFF;
            if (v <= 0x7F) { // short form
                oid.add(Integer.valueOf(v));
                continue;
            }
```

### UnnecessaryBoxing
Unnecessary boxing
in `sshd-common/src/main/java/org/apache/sshd/common/util/io/der/ASN1Object.java`
#### Snippet
```java
            }

            oid.add(Integer.valueOf((int) (curVal & 0x7FFFFFFFL)));
        }

```

### UnnecessaryBoxing
Unnecessary boxing
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/KeyEntryResolver.java`
#### Snippet
```java
        offset += Integer.BYTES;
        System.arraycopy(buf, offset, bytes, 0, len);
        return new SimpleImmutableEntry<>(bytes, Integer.valueOf(offset + len));
    }

```

### UnnecessaryBoxing
Unnecessary boxing
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/AESPrivateKeyObfuscator.java`
#### Snippet
```java
                    Cipher c = SecurityUtils.getCipher(CIPHER_NAME);
                    c.init(Cipher.DECRYPT_MODE, key);
                    sizes.add(Integer.valueOf(keyLength));
                } catch (GeneralSecurityException e) {
                    return sizes;
```

### UnnecessaryBoxing
Unnecessary boxing
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/DESPrivateKeyObfuscator.java`
#### Snippet
```java
    public static final List<Integer> AVAILABLE_KEY_LENGTHS = Collections.unmodifiableList(
            Collections.singletonList(
                    Integer.valueOf(DEFAULT_KEY_LENGTH)));
    public static final DESPrivateKeyObfuscator INSTANCE = new DESPrivateKeyObfuscator();

```

### UnnecessaryBoxing
Unnecessary boxing
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/pem/AbstractPEMResourceKeyPairParser.java`
#### Snippet
```java

                hdrValue = hdrValue.toUpperCase();
                encrypted = Boolean.valueOf(line.contains("ENCRYPTED"));
            } else if (hdrName.equalsIgnoreCase("DEK-Info")) {
                if ((initVector != null) || (algInfo != null)) {
```

### UnnecessaryBoxing
Unnecessary boxing
in `sshd-core/src/main/java/org/apache/sshd/client/SshClient.java`
#### Snippet
```java
        session.setConnectAddress(address);
        boolean useDefaultIdentities = !hostConfig.isIdentitiesOnly();
        session.setAttribute(UserAuthPublicKey.USE_DEFAULT_IDENTITIES, Boolean.valueOf(useDefaultIdentities));
        String identityAgent = hostConfig.getProperty(HostConfigEntry.IDENTITY_AGENT);
        session.setAttribute(UserAuthPublicKey.IDENTITY_AGENT, identityAgent == null ? "" : identityAgent);
```

### UnnecessaryBoxing
Unnecessary boxing
in `sshd-core/src/main/java/org/apache/sshd/common/forward/DefaultForwarder.java`
#### Snippet
```java
        ValidateUtils.checkTrue(port > 0, "Invalid remote port: %d", port);

        Integer portKey = Integer.valueOf(port);
        synchronized (remoteToLocal) {
            return remoteToLocal.get(portKey);
```

### UnnecessaryBoxing
Unnecessary boxing
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/KeyExchangeMessageHandler.java`
#### Snippet
```java
                kexFlushed = true;
            }
            return new SimpleImmutableEntry<>(Integer.valueOf(numPending), kexFlushedFuture);
        });
    }
```

### UnnecessaryBoxing
Unnecessary boxing
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/KeyExchangeMessageHandler.java`
#### Snippet
```java
            shutDown = true;
            return new SimpleImmutableEntry<Integer, DefaultKeyExchangeFuture>(
                    Integer.valueOf(pendingPackets.size()),
                    kexFlushedFuture);
        });
```

### UnnecessaryBoxing
Unnecessary boxing
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/KeyExchangeMessageHandler.java`
#### Snippet
```java
                    kexFlushedFuture);
        });
        items.getValue().setValue(Boolean.valueOf(items.getKey().intValue() == 0));
        flushRunner.shutdownNow();
    }
```

### UnnecessaryBoxing
Unnecessary boxing
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/AbstractSession.java`
#### Snippet
```java
                kexHandler.initNewKeyExchange();
            }
            return Boolean.valueOf(isRunning);
        }).booleanValue();

```

## RuleId[id=SynchronizeOnNonFinalField]
### SynchronizeOnNonFinalField
Synchronization on a non-final field `ioServiceFactoryFactory`
in `sshd-core/src/main/java/org/apache/sshd/common/helpers/AbstractFactoryManager.java`
#### Snippet
```java
    @Override
    public IoServiceFactory getIoServiceFactory() {
        synchronized (ioServiceFactoryFactory) {
            if (ioServiceFactory == null) {
                ioServiceFactory = ioServiceFactoryFactory.create(this);
```

### SynchronizeOnNonFinalField
Synchronization on a non-final field `lock`
in `sshd-scp/src/main/java/org/apache/sshd/scp/server/InputStreamReader.java`
#### Snippet
```java
    @Override
    public boolean ready() throws IOException {
        synchronized (lock) {
            if (in == null) {
                throw new IOException("InputStreamReader is closed.");
```

### SynchronizeOnNonFinalField
Synchronization on a non-final field `lock`
in `sshd-scp/src/main/java/org/apache/sshd/scp/server/InputStreamReader.java`
#### Snippet
```java
    @Override
    public int read() throws IOException {
        synchronized (lock) {
            if (!isOpen()) {
                throw new IOException("InputStreamReader is closed.");
```

### SynchronizeOnNonFinalField
Synchronization on a non-final field `lock`
in `sshd-scp/src/main/java/org/apache/sshd/scp/server/InputStreamReader.java`
#### Snippet
```java
    @Override
    public int read(char[] buf, int offset, int length) throws IOException {
        synchronized (lock) {
            if (!isOpen()) {
                throw new IOException("InputStreamReader is closed.");
```

### SynchronizeOnNonFinalField
Synchronization on a non-final field `lock`
in `sshd-scp/src/main/java/org/apache/sshd/scp/server/InputStreamReader.java`
#### Snippet
```java
    @Override
    public void close() throws IOException {
        synchronized (lock) {
            decoder = null;
            if (in != null) {
```

## RuleId[id=NonStrictComparisonCanBeEquality]
### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `sshd-common/src/main/java/org/apache/sshd/common/util/io/resource/PathResource.java`
#### Snippet
```java
    public OpenOption[] getOpenOptions() {
        // Use a clone to avoid shared instance modification
        return (openOptions.length <= 0) ? openOptions : openOptions.clone();
    }

```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `sshd-common/src/main/java/org/apache/sshd/common/util/io/IoUtils.java`
#### Snippet
```java
     */
    public static boolean isWindowsExecutable(String fileName) {
        if ((fileName == null) || (fileName.length() <= 0)) {
            return false;
        }
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/AbstractPrivateKeyObfuscator.java`
#### Snippet
```java

        int remLen = dataSize % blockSize;
        if (remLen <= 0) {
            return cipher.doFinal(bytes);
        }
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/openssh/kdf/BCrypt.java`
#### Snippet
```java
      real_salt = salt.substring(off + 3, off + 25);
      try {
          passwordb = (password + (minor >= 'a' ? "\000" : "")).getBytes("UTF-8");
      } catch (UnsupportedEncodingException uee) {
          throw new AssertionError("UTF-8 is not supported");
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/openssh/kdf/BCrypt.java`
#### Snippet
```java

      rs.append("$2");
      if (minor >= 'a')
          rs.append(minor);
      rs.append("$");
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `sshd-common/src/main/java/org/apache/sshd/common/keyprovider/AbstractResourceKeyPairProvider.java`
#### Snippet
```java
        Collection<String> toDelete = Collections.emptySet();
        synchronized (cacheMap) {
            if (cacheMap.size() <= 0) {
                return; // already empty - nothing to keep
            }
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `sshd-core/src/main/java/org/apache/sshd/common/io/DefaultIoServiceFactoryFactory.java`
#### Snippet
```java

        int numDetected = services.size();
        if (numDetected <= 0) {
            return null;
        }
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/server/AbstractSftpSubsystemHelper.java`
#### Snippet
```java
        }

        if (value.length() <= 0) { // means don't report any extensions
            return Collections.emptyMap();
        }
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `sshd-core/src/main/java/org/apache/sshd/server/auth/keyboard/UserAuthKeyboardInteractive.java`
#### Snippet
```java
        }

        List<String> responses = (num <= 0) ? Collections.emptyList() : new ArrayList<>(num);
        for (int index = 1; index <= num; index++) {
            String value = buffer.getString();
```

## RuleId[id=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'defaultValue'
in `sshd-common/src/main/java/org/apache/sshd/common/Property.java`
#### Snippet
```java
        private final String name;
        private final Class<T> type;
        private final Optional<T> defaultValue;

        protected BaseProperty(String name, Class<T> type) {
```

## RuleId[id=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `sshd-cli/src/main/java/org/apache/sshd/cli/CliLogger.java`
#### Snippet
```java

    public static PrintStream resolveSystemPrintStream(Level threshold) {
        return resolvePrintStream(threshold, System.out, System.err);
    }

```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `sshd-cli/src/main/java/org/apache/sshd/cli/CliLogger.java`
#### Snippet
```java

    public static PrintStream resolveSystemPrintStream(Level threshold) {
        return resolvePrintStream(threshold, System.out, System.err);
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `sshd-cli/src/main/java/org/apache/sshd/cli/CliLogger.java`
#### Snippet
```java

    public static Logger resolveSystemLogger(String name, Level threshold) {
        return resolveLogger(name, threshold, System.out, System.err);
    }

```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `sshd-cli/src/main/java/org/apache/sshd/cli/CliLogger.java`
#### Snippet
```java

    public static Logger resolveSystemLogger(String name, Level threshold) {
        return resolveLogger(name, threshold, System.out, System.err);
    }

```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `sshd-cli/src/main/java/org/apache/sshd/cli/CliSupport.java`
#### Snippet
```java
        BuiltinIoServiceFactoryFactories factory = BuiltinIoServiceFactoryFactories.fromFactoryName(provider);
        if (factory == null) {
            System.err.println(argName + " - unknown provider (" + provider + ")"
                               + " should be one of " + BuiltinIoServiceFactoryFactories.VALUES);
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `sshd-cli/src/main/java/org/apache/sshd/cli/client/SshClientMain.java`
#### Snippet
```java
    @SuppressWarnings("checkstyle:methodlength")
    public static void main(String[] args) throws Exception {
        PrintStream stdout = System.out;
        PrintStream stderr = System.err;
        boolean agentForward = false;
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `sshd-cli/src/main/java/org/apache/sshd/cli/client/SshClientMain.java`
#### Snippet
```java
    public static void main(String[] args) throws Exception {
        PrintStream stdout = System.out;
        PrintStream stderr = System.err;
        boolean agentForward = false;
        List<String> command = null;
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `sshd-cli/src/main/java/org/apache/sshd/cli/client/SshClientMain.java`
#### Snippet
```java

            if (error) {
                System.err.println("usage: ssh [-A|-a] [-v[v][v]] [-E logoutputfile] [-D socksPort]"
                                   + " [-J proxyJump] [-l login] [" + SSH_CLIENT_PORT_OPTION + " port] [-o option=value]"
                                   + " [-w password] [-c cipherslist] [-m maclist] [-C]"
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `sshd-cli/src/main/java/org/apache/sshd/cli/client/SshClientMain.java`
#### Snippet
```java
                        }

                        try (OutputStream channelOut = new NoCloseOutputStream(System.out);
                             OutputStream channelErr = new NoCloseOutputStream(System.err)) {
                            channel.setOut(channelOut);
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `sshd-cli/src/main/java/org/apache/sshd/cli/client/SshClientMain.java`
#### Snippet
```java

                        try (OutputStream channelOut = new NoCloseOutputStream(System.out);
                             OutputStream channelErr = new NoCloseOutputStream(System.err)) {
                            channel.setOut(channelOut);
                            channel.setErr(channelErr);
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `sshd-cli/src/main/java/org/apache/sshd/cli/client/SshClientMain.java`
#### Snippet
```java
            }
        } catch (Exception e) {
            e.printStackTrace(System.err);
            throw e;
        } finally {
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `sshd-cli/src/main/java/org/apache/sshd/cli/server/SshServerMain.java`
#### Snippet
```java
                i++;
                if (i >= numArgs) {
                    System.err.println("option requires an argument: " + argName);
                    error = true;
                    break;
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `sshd-cli/src/main/java/org/apache/sshd/cli/server/SshServerMain.java`
#### Snippet
```java
                i++;
                if (i >= numArgs) {
                    System.err.println("option requires an argument: " + argName);
                    error = true;
                    break;
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `sshd-cli/src/main/java/org/apache/sshd/cli/server/SshServerMain.java`
#### Snippet
```java

                if (keyFiles != null) {
                    System.err.println("option conflicts with -key-file: " + argName);
                    error = true;
                    break;
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `sshd-cli/src/main/java/org/apache/sshd/cli/server/SshServerMain.java`
#### Snippet
```java
                i++;
                if (i >= numArgs) {
                    System.err.println("option requires an argument: " + argName);
                    error = true;
                    break;
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `sshd-cli/src/main/java/org/apache/sshd/cli/server/SshServerMain.java`
#### Snippet
```java

                if (keyFiles != null) {
                    System.err.println("option conflicts with -key-file: " + argName);
                    error = true;
                    break;
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `sshd-cli/src/main/java/org/apache/sshd/cli/server/SshServerMain.java`
#### Snippet
```java
                i++;
                if (i >= numArgs) {
                    System.err.println("option requires an argument: " + argName);
                    error = true;
                    break;
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `sshd-cli/src/main/java/org/apache/sshd/cli/server/SshServerMain.java`
#### Snippet
```java
                i++;
                if (i >= numArgs) {
                    System.err.println("option requires and argument: " + argName);
                    error = true;
                    break;
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `sshd-cli/src/main/java/org/apache/sshd/cli/server/SshServerMain.java`
#### Snippet
```java
                int idx = opt.indexOf('=');
                if (idx <= 0) {
                    System.err.println("bad syntax for option: " + opt);
                    error = true;
                    break;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `sshd-cli/src/main/java/org/apache/sshd/cli/server/SshServerMain.java`
#### Snippet
```java
                : setupIoServiceFactory(
                        SshServer.setUpDefaultServer(), resolver,
                        level, System.out, System.err, args);
        if (sshd == null) {
            error = true;
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `sshd-cli/src/main/java/org/apache/sshd/cli/server/SshServerMain.java`
#### Snippet
```java
                : setupIoServiceFactory(
                        SshServer.setUpDefaultServer(), resolver,
                        level, System.out, System.err, args);
        if (sshd == null) {
            error = true;
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `sshd-cli/src/main/java/org/apache/sshd/cli/server/SshServerMain.java`
#### Snippet
```java

        if (error) {
            System.err.println(
                    "usage: sshd [-p port] [-io mina|nio2|netty] [-key-type RSA|DSA|EC] [-key-size NNNN] [-key-file <path>] [-o option=value]");
            System.exit(-1);
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `sshd-cli/src/main/java/org/apache/sshd/cli/server/SshServerMain.java`
#### Snippet
```java

        SshServerConfigFileReader.configure(sshd, resolver, true, true);
        KeyPairProvider hostKeyProvider = resolveServerKeys(System.err, hostKeyType, hostKeySize, keyFiles);
        sshd.setKeyPairProvider(hostKeyProvider);
        if (GenericUtils.isNotEmpty(certFiles)) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `sshd-cli/src/main/java/org/apache/sshd/cli/server/SshServerMain.java`
#### Snippet
```java
        sshd.setPort(port);

        ShellFactory shellFactory = resolveShellFactory(level, System.out, System.err, resolver);
        if (shellFactory != null) {
            if (logger.isInfoEnabled()) {
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `sshd-cli/src/main/java/org/apache/sshd/cli/server/SshServerMain.java`
#### Snippet
```java
        sshd.setPort(port);

        ShellFactory shellFactory = resolveShellFactory(level, System.out, System.err, resolver);
        if (shellFactory != null) {
            if (logger.isInfoEnabled()) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `sshd-cli/src/main/java/org/apache/sshd/cli/server/SshServerMain.java`
#### Snippet
```java
        sshd.setPublickeyAuthenticator(AcceptAllPublickeyAuthenticator.INSTANCE);
        setupUserAuthFactories(sshd, resolver);
        setupServerForwarding(sshd, level, System.out, System.err, resolver);
        setupCommandFactory(sshd, level, System.out, System.err, shellFactory);

```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `sshd-cli/src/main/java/org/apache/sshd/cli/server/SshServerMain.java`
#### Snippet
```java
        sshd.setPublickeyAuthenticator(AcceptAllPublickeyAuthenticator.INSTANCE);
        setupUserAuthFactories(sshd, resolver);
        setupServerForwarding(sshd, level, System.out, System.err, resolver);
        setupCommandFactory(sshd, level, System.out, System.err, shellFactory);

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `sshd-cli/src/main/java/org/apache/sshd/cli/server/SshServerMain.java`
#### Snippet
```java
        setupUserAuthFactories(sshd, resolver);
        setupServerForwarding(sshd, level, System.out, System.err, resolver);
        setupCommandFactory(sshd, level, System.out, System.err, shellFactory);

        List<SubsystemFactory> subsystems = resolveServerSubsystems(sshd, level, System.out, System.err, resolver);
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `sshd-cli/src/main/java/org/apache/sshd/cli/server/SshServerMain.java`
#### Snippet
```java
        setupUserAuthFactories(sshd, resolver);
        setupServerForwarding(sshd, level, System.out, System.err, resolver);
        setupCommandFactory(sshd, level, System.out, System.err, shellFactory);

        List<SubsystemFactory> subsystems = resolveServerSubsystems(sshd, level, System.out, System.err, resolver);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `sshd-cli/src/main/java/org/apache/sshd/cli/server/SshServerMain.java`
#### Snippet
```java
        setupCommandFactory(sshd, level, System.out, System.err, shellFactory);

        List<SubsystemFactory> subsystems = resolveServerSubsystems(sshd, level, System.out, System.err, resolver);
        if (GenericUtils.isNotEmpty(subsystems)) {
            if (logger.isInfoEnabled()) {
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `sshd-cli/src/main/java/org/apache/sshd/cli/server/SshServerMain.java`
#### Snippet
```java
        setupCommandFactory(sshd, level, System.out, System.err, shellFactory);

        List<SubsystemFactory> subsystems = resolveServerSubsystems(sshd, level, System.out, System.err, resolver);
        if (GenericUtils.isNotEmpty(subsystems)) {
            if (logger.isInfoEnabled()) {
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `sshd-cli/src/main/java/org/apache/sshd/cli/server/SshServerMain.java`
#### Snippet
```java
        }

        System.err.println("Starting SSHD on port " + port);
        sshd.start();
        Thread.sleep(Long.MAX_VALUE);
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `sshd-cli/src/main/java/org/apache/sshd/cli/server/SshServerMain.java`
#### Snippet
```java
        sshd.start();
        Thread.sleep(Long.MAX_VALUE);
        System.err.println("Exiting after a very (very very) long time");
    }

```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `sshd-cli/src/main/java/org/apache/sshd/cli/client/SftpCommandMain.java`
#### Snippet
```java
                return ReflectionUtils.newInstance(clazz, SftpClientFactory.class);
            } catch (Throwable t) {
                System.err.append("Failed (").append(t.getClass().getSimpleName()).append(')')
                        .append(" to instantiate ").append(factoryName)
                        .append(": ").println(t.getMessage());
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `sshd-cli/src/main/java/org/apache/sshd/cli/client/SftpCommandMain.java`
#### Snippet
```java
                        .append(" to instantiate ").append(factoryName)
                        .append(": ").println(t.getMessage());
                System.err.flush();
                throw ExceptionUtils.toRuntimeException(t, true);
            }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `sshd-cli/src/main/java/org/apache/sshd/cli/client/SftpCommandMain.java`
#### Snippet
```java

    public static void main(String[] args) throws Exception {
        PrintStream stdout = System.out;
        PrintStream stderr = System.err;
        OutputStream logStream = stderr;
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `sshd-cli/src/main/java/org/apache/sshd/cli/client/SftpCommandMain.java`
#### Snippet
```java
    public static void main(String[] args) throws Exception {
        PrintStream stdout = System.out;
        PrintStream stderr = System.err;
        OutputStream logStream = stderr;
        try (BufferedReader stdin = new BufferedReader(new InputStreamReader(new NoCloseInputStream(System.in)))) {
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `sshd-cli/src/main/java/org/apache/sshd/cli/client/SftpCommandMain.java`
#### Snippet
```java
                    : setupClientSession(SFTP_PORT_OPTION, stdin, level, stdout, stderr, args);
            if (session == null) {
                System.err.println("usage: sftp [-v[v][v]] [-E logoutput] [-i identity] [-io nio2|mina|netty]"
                                   + " [-J proxyJump] [-l login] [" + SFTP_PORT_OPTION + " port] [-o option=value]"
                                   + " [-w password] [-c cipherlist] [-m maclist] [-C] hostname/user@host");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `sshd-cli/src/main/java/org/apache/sshd/cli/client/ScpCommandMain.java`
#### Snippet
```java

    public static void main(String[] args) throws Exception {
        PrintStream stdout = System.out;
        PrintStream stderr = System.err;
        OutputStream logStream = stdout;
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `sshd-cli/src/main/java/org/apache/sshd/cli/client/ScpCommandMain.java`
#### Snippet
```java
    public static void main(String[] args) throws Exception {
        PrintStream stdout = System.out;
        PrintStream stderr = System.err;
        OutputStream logStream = stdout;
        try (BufferedReader stdin = new BufferedReader(
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `sshd-git/src/main/java/org/apache/sshd/git/pgm/EmbeddedCommandRunner.java`
#### Snippet
```java
    public void execute(String[] argv, InputStream in, OutputStream out, OutputStream err) throws Exception {
        CmdLineParser clp = new CmdLineParser(this);
        PrintWriter writer = new PrintWriter(err != null ? err : System.err);
        try {
            clp.parseArgument(argv);
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `sshd-cli/src/main/java/org/apache/sshd/cli/client/SshKeyScanMain.java`
#### Snippet
```java
            } else if ("-io".equals(optName)) {
                if ((index + 1) >= numArgs) {
                    System.err.println("option requires an argument: " + optName);
                    break;
                }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `sshd-cli/src/main/java/org/apache/sshd/cli/client/SshKeyScanMain.java`
#### Snippet
```java
                String provider = args[++index];
                BuiltinIoServiceFactoryFactories factory
                        = CliSupport.resolveBuiltinIoServiceFactory(System.err, optName, provider);
                if (factory != null) {
                    System.setProperty(IoServiceFactory.class.getName(), factory.getFactoryClassName());
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `sshd-cli/src/main/java/org/apache/sshd/cli/client/SshKeyScanMain.java`
#### Snippet
```java
    public void log(Level level, Object message, Throwable t) {
        if (isEnabledLevel(level)) {
            PrintStream ps = System.out;
            if ((t != null) || Level.SEVERE.equals(level) || Level.WARNING.equals(level)) {
                ps = System.err;
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `sshd-cli/src/main/java/org/apache/sshd/cli/client/SshKeyScanMain.java`
#### Snippet
```java
            PrintStream ps = System.out;
            if ((t != null) || Level.SEVERE.equals(level) || Level.WARNING.equals(level)) {
                ps = System.err;
            }

```

## RuleId[id=CharsetObjectCanBeUsed]
### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/openssh/kdf/BCrypt.java`
#### Snippet
```java
      try {
          String try_pw = hashpw(plaintext, hashed);
          hashed_bytes = hashed.getBytes("UTF-8");
          try_bytes = try_pw.getBytes("UTF-8");
      } catch (UnsupportedEncodingException uee) {
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/openssh/kdf/BCrypt.java`
#### Snippet
```java
          String try_pw = hashpw(plaintext, hashed);
          hashed_bytes = hashed.getBytes("UTF-8");
          try_bytes = try_pw.getBytes("UTF-8");
      } catch (UnsupportedEncodingException uee) {
          return false;
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/openssh/kdf/BCrypt.java`
#### Snippet
```java
      real_salt = salt.substring(off + 3, off + 25);
      try {
          passwordb = (password + (minor >= 'a' ? "\000" : "")).getBytes("UTF-8");
      } catch (UnsupportedEncodingException uee) {
          throw new AssertionError("UTF-8 is not supported");
```

## RuleId[id=ConditionCoveredByFurtherCondition]
### ConditionCoveredByFurtherCondition
Condition 'beginIndex \>= maxIndex' covered by subsequent conditions
in `sshd-common/src/main/java/org/apache/sshd/common/file/util/BasePath.java`
#### Snippet
```java
    public T subpath(int beginIndex, int endIndex) {
        int maxIndex = getNameCount();
        if ((beginIndex < 0) || (beginIndex >= maxIndex) || (endIndex > maxIndex) || (beginIndex >= endIndex)) {
            throw new IllegalArgumentException(
                    "subpath(" + beginIndex + "," + endIndex + ") bad index range - allowed [0-" + maxIndex + "]");
```

### ConditionCoveredByFurtherCondition
Condition 'number \< 0' covered by subsequent condition '(number \& 0xFFFF_FFFFL) != number'
in `sshd-core/src/main/java/org/apache/sshd/common/future/GlobalRequestFuture.java`
#### Snippet
```java
     */
    public void setSequenceNumber(long number) {
        if (number < 0 || ((number & 0xFFFF_FFFFL) != number)) {
            throw new IllegalArgumentException("Invalid sequence number " + number);
        }
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `sshd-common/src/main/java/org/apache/sshd/common/util/net/SshdSocketAddress.java`
#### Snippet
```java
            return null;
        } else {
            return ip.replaceAll(".*/", "");
        }
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `sshd-common/src/main/java/org/apache/sshd/common/digest/DigestUtils.java`
#### Snippet
```java

        Base64.Encoder encoder = Base64.getEncoder();
        return algo.replace("-", "").toUpperCase() + ":" + encoder.encodeToString(data).replaceAll("=", "");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `sshd-common/src/main/java/org/apache/sshd/common/digest/DigestUtils.java`
#### Snippet
```java

        Base64.Encoder encoder = Base64.getEncoder();
        return algo.replace("-", "").toUpperCase() + ":" + encoder.encodeToString(data).replaceAll("=", "");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/KeyPairResourceParser.java`
#### Snippet
```java
    static String joinDataLines(Collection<String> lines) {
        String data = GenericUtils.join(lines, ' ');
        data = data.replaceAll("\\s", "");
        data = data.trim();
        return data;
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `sshd-core/src/main/java/org/apache/sshd/common/kex/DHGroupData.java`
#### Snippet
```java
        String str = lines
                .map(GenericUtils::trimToEmpty)
                .map(s -> s.replaceAll("\\s", ""))
                .filter(GenericUtils::isNotEmpty)
                .filter(s -> !s.startsWith("#"))
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `sshd-core/src/main/java/org/apache/sshd/server/kex/Moduli.java`
#### Snippet
```java
            }

            String[] parts = line.split("\\s+");
            // Ensure valid line
            if (parts.length != 7) {
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `sshd-core/src/main/java/org/apache/sshd/server/session/ServerUserAuthService.java`
#### Snippet
```java
                log.debug("ServerUserAuthService({}) using configured methods={}", s, mths);
            }
            for (String mthl : mths.split("\\s")) {
                authMethods.add(new ArrayList<>(Arrays.asList(GenericUtils.split(mthl, ','))));
            }
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `sshd-common/src/main/java/org/apache/sshd/client/auth/hostbased/HostKeyIdentityProvider.java`
#### Snippet
```java
     * @param  session                  The {@link SessionContext} for invoking this load command - may be {@code null}
     *                                  if not invoked within a session context (e.g., offline tool).
     * @return                          The host keys as a {@link java.util.Map.Entry} of key + certificates (which can
     *                                  be {@code null}/empty)
     * @throws IOException              If failed to load the keys
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.sshd.common.session` is unnecessary and can be removed
in `sshd-common/src/main/java/org/apache/sshd/common/CommonModuleProperties.java`
#### Snippet
```java

    /**
     * Property used to register the {@link org.apache.sshd.common.session.SessionHeartbeatController.HeartbeatType} -
     * if non-existent or {@code NONE} then disabled. Same if some unknown string value is set as the property value.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.sshd.common` is unnecessary and can be removed
in `sshd-common/src/main/java/org/apache/sshd/common/mac/BuiltinMacs.java`
#### Snippet
```java

    /**
     * @param  factory The {@link org.apache.sshd.common.NamedFactory} for the MAC - ignored if {@code null}
     * @return         The matching {@link org.apache.sshd.common.mac.BuiltinMacs} whose factory name matches (case
     *                 <U>insensitive</U>) the digest factory name
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.sshd.common.mac` is unnecessary and can be removed
in `sshd-common/src/main/java/org/apache/sshd/common/mac/BuiltinMacs.java`
#### Snippet
```java
    /**
     * @param  factory The {@link org.apache.sshd.common.NamedFactory} for the MAC - ignored if {@code null}
     * @return         The matching {@link org.apache.sshd.common.mac.BuiltinMacs} whose factory name matches (case
     *                 <U>insensitive</U>) the digest factory name
     * @see            #fromFactoryName(String)
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.sshd.common.mac` is unnecessary and can be removed
in `sshd-common/src/main/java/org/apache/sshd/common/mac/BuiltinMacs.java`
#### Snippet
```java
    /**
     * @param  s The {@link Enum}'s name - ignored if {@code null}/empty
     * @return   The matching {@link org.apache.sshd.common.mac.BuiltinMacs} whose {@link Enum#name()} matches (case
     *           <U>insensitive</U>) the provided argument - {@code null} if no match
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `sshd-common/src/main/java/org/apache/sshd/common/util/MapEntryUtils.java`
#### Snippet
```java
     * @param  <K> The {@link Comparable} key type
     * @param  <V> The associated entry value
     * @return     A {@link Comparator} for {@link java.util.Map.Entry}-ies that compares the key values
     */
    @SuppressWarnings({ "unchecked", "rawtypes" })
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.sshd.common.signature` is unnecessary, and can be replaced with an import
in `sshd-common/src/main/java/org/apache/sshd/common/util/security/eddsa/EdDSASecurityProviderUtils.java`
#### Snippet
```java
    }

    public static org.apache.sshd.common.signature.Signature getEDDSASignature() {
        ValidateUtils.checkTrue(SecurityUtils.isEDDSACurveSupported(), SecurityUtils.EDDSA + " not supported");
        return new SignatureEd25519();
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.sshd.common.digest` is unnecessary and can be removed
in `sshd-common/src/main/java/org/apache/sshd/common/digest/BuiltinDigests.java`
#### Snippet
```java
    /**
     * @param  s The {@link Enum}'s name - ignored if {@code null}/empty
     * @return   The matching {@link org.apache.sshd.common.digest.BuiltinDigests} whose {@link Enum#name()} matches
     *           (case <U>insensitive</U>) the provided argument - {@code null} if no match
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.sshd.common.digest` is unnecessary and can be removed
in `sshd-common/src/main/java/org/apache/sshd/common/digest/BuiltinDigests.java`
#### Snippet
```java
    /**
     * @param  d The {@link Digest} instance - ignored if {@code null}
     * @return   The matching {@link org.apache.sshd.common.digest.BuiltinDigests} whose algorithm matches (case
     *           <U>insensitive</U>) the digets's algorithm - {@code null} if no match
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.sshd.common.digest` is unnecessary and can be removed
in `sshd-common/src/main/java/org/apache/sshd/common/digest/BuiltinDigests.java`
#### Snippet
```java
    /**
     * @param  name The factory name - ignored if {@code null}/empty
     * @return      The matching {@link org.apache.sshd.common.digest.BuiltinDigests} whose factory name matches (case
     *              <U>insensitive</U>) the provided name - {@code null} if no match
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.sshd.common` is unnecessary and can be removed
in `sshd-common/src/main/java/org/apache/sshd/common/digest/BuiltinDigests.java`
#### Snippet
```java

    /**
     * @param  factory The {@link org.apache.sshd.common.NamedFactory} for the cipher - ignored if {@code null}
     * @return         The matching {@link org.apache.sshd.common.digest.BuiltinDigests} whose factory name matches
     *                 (case <U>insensitive</U>) the digest factory name
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.sshd.common.digest` is unnecessary and can be removed
in `sshd-common/src/main/java/org/apache/sshd/common/digest/BuiltinDigests.java`
#### Snippet
```java
    /**
     * @param  factory The {@link org.apache.sshd.common.NamedFactory} for the cipher - ignored if {@code null}
     * @return         The matching {@link org.apache.sshd.common.digest.BuiltinDigests} whose factory name matches
     *                 (case <U>insensitive</U>) the digest factory name
     * @see            #fromFactoryName(String)
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.sshd.common.digest` is unnecessary and can be removed
in `sshd-common/src/main/java/org/apache/sshd/common/digest/BuiltinDigests.java`
#### Snippet
```java
    /**
     * @param  algo The algorithm to find - ignored if {@code null}/empty
     * @return      The matching {@link org.apache.sshd.common.digest.BuiltinDigests} whose algorithm matches (case
     *              <U>insensitive</U>) the provided name - {@code null} if no match
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.sshd.common` is unnecessary and can be removed
in `sshd-common/src/main/java/org/apache/sshd/common/signature/BuiltinSignatures.java`
#### Snippet
```java

    /**
     * @param  factory The {@link org.apache.sshd.common.NamedFactory} for the signature - ignored if {@code null}
     * @return         The matching {@link org.apache.sshd.common.signature.BuiltinSignatures} whose factory name
     *                 matches (case <U>insensitive</U>) the digest factory name
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.sshd.common.signature` is unnecessary and can be removed
in `sshd-common/src/main/java/org/apache/sshd/common/signature/BuiltinSignatures.java`
#### Snippet
```java
    /**
     * @param  factory The {@link org.apache.sshd.common.NamedFactory} for the signature - ignored if {@code null}
     * @return         The matching {@link org.apache.sshd.common.signature.BuiltinSignatures} whose factory name
     *                 matches (case <U>insensitive</U>) the digest factory name
     * @see            #fromFactoryName(String)
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.sshd.common.signature` is unnecessary and can be removed
in `sshd-common/src/main/java/org/apache/sshd/common/signature/BuiltinSignatures.java`
#### Snippet
```java
    /**
     * @param  s The {@link Enum}'s name - ignored if {@code null}/empty
     * @return   The matching {@link org.apache.sshd.common.signature.BuiltinSignatures} whose {@link Enum#name()}
     *           matches (case <U>insensitive</U>) the provided argument - {@code null} if no match
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio.file` is unnecessary and can be removed
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/client/fs/SftpDirectoryStream.java`
#### Snippet
```java
     *
     * @param  path        The remote {@link SftpPath}
     * @param  filter      An <U>optional</U> {@link java.nio.file.DirectoryStream.Filter filter} - ignored if
     *                     {@code null}
     * @throws IOException If failed to initialize the directory access handle
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/client/extensions/CheckFileNameExtension.java`
#### Snippet
```java
     * @param  blockSize   Input block size to calculate individual hashes - if zero the <U>one</U> hash of <U>all</U>
     *                     the data
     * @return             An <U>immutable</U> {@link java.util.Map.Entry} key left=hash algorithm name, value=the
     *                     calculated hashes.
     * @throws IOException If failed to execute the command
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/client/extensions/CheckFileHandleExtension.java`
#### Snippet
```java
     * @param  blockSize   Input block size to calculate individual hashes - if zero the <U>one</U> hash of <U>all</U>
     *                     the data
     * @return             An <U>immutable</U> {@link java.util.Map.Entry} where key=hash algorithm name, value=the
     *                     calculated hashes.
     * @throws IOException If failed to execute the command
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio.channels` is unnecessary, and can be replaced with an import
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/server/Handle.java`
#### Snippet
```java
 * @author <a href="mailto:dev@mina.apache.org">Apache MINA SSHD Project</a>
 */
public abstract class Handle implements java.nio.channels.Channel, AttributeStore {
    private final SftpSubsystem sftpSubsystem;
    private final AtomicBoolean closed = new AtomicBoolean(false);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary, and can be replaced with an import
in `sshd-contrib/src/main/java/org/apache/sshd/contrib/common/signature/LegacyDSASigner.java`
#### Snippet
```java
 * @see    <a href="https://issues.apache.org/jira/browse/SSHD-945">SSHD-945 issue</a>
 */
public class LegacyDSASigner extends java.security.Signature {
    public static final String LEGACY_SIGNATURE = "LegacySHA1withDSA";

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.mina.core.service` is unnecessary, and can be replaced with an import
in `sshd-mina/src/main/java/org/apache/sshd/mina/MinaConnector.java`
#### Snippet
```java

    @Override
    protected org.apache.mina.core.service.IoService getIoService() {
        return getConnector();
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio.channels` is unnecessary, and can be replaced with an import
in `sshd-core/src/main/java/org/apache/sshd/agent/SshAgent.java`
#### Snippet
```java
 * SSH key agent server
 */
public interface SshAgent extends java.nio.channels.Channel {

    String SSH_AUTHSOCKET_ENV_NAME = "SSH_AUTH_SOCK";
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `sshd-core/src/main/java/org/apache/sshd/agent/unix/AgentServer.java`
#### Snippet
```java
     *
     * @param  code                APR error code
     * @throws java.io.IOException the produced exception for the given APR error number
     */
    private static void throwException(int code) throws IOException {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `sshd-core/src/main/java/org/apache/sshd/agent/unix/AgentClient.java`
#### Snippet
```java
     *
     * @param  code                APR error code
     * @throws java.io.IOException the produced exception for the given APR error number
     */
    protected void throwException(int code) throws IOException {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.tomcat.jni` is unnecessary, and can be replaced with an import
in `sshd-core/src/main/java/org/apache/sshd/agent/unix/AprLibrary.java`
#### Snippet
```java
            perms |= org.apache.tomcat.jni.File.APR_FPROT_UEXECUTE;
        }
        if (org.apache.tomcat.jni.File.permsSet(authSocket, perms) != org.apache.tomcat.jni.Status.APR_SUCCESS) {
            throw new IOException("Unable to secure local socket");
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `sshd-core/src/main/java/org/apache/sshd/agent/unix/ChannelAgentForwarding.java`
#### Snippet
```java
     *
     * @param  code                APR error code
     * @throws java.io.IOException the produced exception for the given APR error number
     */
    private static void throwException(int code) throws IOException {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio.charset` is unnecessary and can be removed
in `sshd-core/src/main/java/org/apache/sshd/core/CoreModuleProperties.java`
#### Snippet
```java
    /**
     * The charset to use if the configured welcome banner points to a file - if not specified (either as a string or a
     * {@link java.nio.charset.Charset} then the local default is used.
     */
    public static final Property<Charset> WELCOME_BANNER_CHARSET
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio.channels` is unnecessary, and can be replaced with an import
in `sshd-core/src/main/java/org/apache/sshd/client/SshClient.java`
#### Snippet
```java
        Objects.requireNonNull(client, "No client instance");
        // wrap the client so that close() is also stop()
        final java.nio.channels.Channel channel = new java.nio.channels.Channel() {
            @Override
            public boolean isOpen() {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio.channels` is unnecessary, and can be replaced with an import
in `sshd-core/src/main/java/org/apache/sshd/client/SshClient.java`
#### Snippet
```java
        Objects.requireNonNull(client, "No client instance");
        // wrap the client so that close() is also stop()
        final java.nio.channels.Channel channel = new java.nio.channels.Channel() {
            @Override
            public boolean isOpen() {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.net` is unnecessary and can be removed
in `sshd-core/src/main/java/org/apache/sshd/client/SshClient.java`
#### Snippet
```java
 * <P>
 * Sessions can then be created using on of the {@link #connect(String, String, int)} or
 * {@link #connect(String, java.net.SocketAddress)} methods.
 * </P>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary and can be removed
in `sshd-core/src/main/java/org/apache/sshd/client/session/ClientSession.java`
#### Snippet
```java
 * A client session is established using the {@link org.apache.sshd.client.SshClient}. Once the session has been
 * created, the user has to authenticate using either {@link #addPasswordIdentity(String)} or
 * {@link #addPublicKeyIdentity(java.security.KeyPair)} followed by a call to {@link #auth()}.
 * </P>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary and can be removed
in `sshd-core/src/main/java/org/apache/sshd/client/session/ClientSession.java`
#### Snippet
```java
     * Starts the authentication process. User identities will be tried until the server successfully authenticate the
     * user. User identities must be provided before calling this method using {@link #addPasswordIdentity(String)} or
     * {@link #addPublicKeyIdentity(java.security.KeyPair)}.
     *
     * @return             the authentication future
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary and can be removed
in `sshd-core/src/main/java/org/apache/sshd/client/session/ClientSession.java`
#### Snippet
```java
     * @throws IOException if failed to generate the future
     * @see                #addPasswordIdentity(String)
     * @see                #addPublicKeyIdentity(java.security.KeyPair)
     */
    AuthFuture auth() throws IOException;
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.crypto` is unnecessary and can be removed
in `sshd-core/src/main/java/org/apache/sshd/common/kex/AbstractDH.java`
#### Snippet
```java

    /**
     * The shared secret returned by {@link javax.crypto.KeyAgreement#generateSecret()} is a byte array, which can (by
     * chance, roughly 1 out of 256 times) begin with zero byte (some JCE providers might strip this, though). In SSH,
     * the shared secret is an integer, so we need to strip the leading zero(es).
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.sshd.common.io` is unnecessary and can be removed
in `sshd-core/src/main/java/org/apache/sshd/common/session/Session.java`
#### Snippet
```java
    /**
     * Encode and send the given buffer with the specified timeout. If the buffer could not be written before the
     * timeout elapses, the returned {@link org.apache.sshd.common.io.IoWriteFuture} will be set with a
     * {@link java.util.concurrent.TimeoutException} exception to indicate a timeout.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.sshd.common.io` is unnecessary and can be removed
in `sshd-core/src/main/java/org/apache/sshd/common/session/Session.java`
#### Snippet
```java
    /**
     * Encode and send the given buffer with the specified timeout. If the buffer could not be written before the
     * timeout elapses, the returned {@link org.apache.sshd.common.io.IoWriteFuture} will be set with a
     * {@link java.util.concurrent.TimeoutException} exception to indicate a timeout.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.sshd.common.io` is unnecessary and can be removed
in `sshd-core/src/main/java/org/apache/sshd/common/session/Session.java`
#### Snippet
```java
    /**
     * Encode and send the given buffer with the specified timeout. If the buffer could not be written before the
     * timeout elapses, the returned {@link org.apache.sshd.common.io.IoWriteFuture} will be set with a
     * {@link java.util.concurrent.TimeoutException} exception to indicate a timeout.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.sshd.server` is unnecessary and can be removed
in `sshd-core/src/main/java/org/apache/sshd/server/Environment.java`
#### Snippet
```java
 * Interface providing access to the environment map and allowing the registration of listeners for certain signals.
 *
 * @see org.apache.sshd.server.Signal
 */
public interface Environment {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.sshd.common.keyprovider` is unnecessary and can be removed
in `sshd-core/src/main/java/org/apache/sshd/server/SshServer.java`
#### Snippet
```java
 * {@link #setUpDefaultServer()} method, which will known ciphers, macs, channels, etc... Besides this basic setup, a
 * few things have to be manually configured such as the port number, {@link Factory}, the
 * {@link org.apache.sshd.common.keyprovider.KeyPairProvider} and the {@link PasswordAuthenticator}.
 * </p>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.sshd.common` is unnecessary and can be removed
in `sshd-core/src/main/java/org/apache/sshd/server/auth/pubkey/CachingPublicKeyAuthenticator.java`
#### Snippet
```java
public class CachingPublicKeyAuthenticator extends AbstractLoggingBean implements PublickeyAuthenticator {
    /**
     * The {@link org.apache.sshd.common.AttributeRepository.AttributeKey AttributeKey} used to store the cached
     * authentication results on the session instance
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.sshd.server.channel` is unnecessary and can be removed
in `sshd-core/src/main/java/org/apache/sshd/server/channel/ChannelDataReceiver.java`
#### Snippet
```java
 * {@link ChannelSession#setDataReceiver(ChannelDataReceiver)} to do so. (And to grab a reference to
 * {@link ChannelSession}, a {@link org.apache.sshd.server.command.Command} should implement
 * {@link org.apache.sshd.server.channel.ChannelSessionAware}.)
 * </p>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.sshd.server.channel` is unnecessary and can be removed
in `sshd-core/src/main/java/org/apache/sshd/server/channel/ChannelDataReceiver.java`
#### Snippet
```java
 *
 * @see ChannelSession#setDataReceiver(ChannelDataReceiver)
 * @see org.apache.sshd.server.channel.ChannelSessionAware
 */
public interface ChannelDataReceiver extends Closeable {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `sshd-core/src/main/java/org/apache/sshd/server/command/CommandLifecycle.java`
#### Snippet
```java
    /**
     * Starts the command execution. All streams must have been set <U>before</U> calling this method. The command
     * should implement {@link java.lang.Runnable}, and this method should spawn a new thread like:
     * 
     * <pre>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `sshd-scp/src/main/java/org/apache/sshd/scp/client/DefaultScpStreamResolver.java`
#### Snippet
```java

    @Override
    public String getFileName() throws java.io.IOException {
        return name;
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.sshd.common.future` is unnecessary and can be removed
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/AbstractSession.java`
#### Snippet
```java
     * @see <a href="https://tools.ietf.org/html/rfc4254#section-4">RFC 4254: Global Requests</a>
     * @see <a href="https://tools.ietf.org/html/rfc4253#section-11.4">RFC 4254: Reserved Messages</a>
     * @see {@link #request(Buffer, String, org.apache.sshd.common.future.GlobalRequestFuture.ReplyHandler)}
     * @see {@link #requestSuccess(Buffer)}
     * @see {@link #requestFailure(Buffer)}
```

## RuleId[id=Java8MapApi]
### Java8MapApi
Can be replaced with single 'Map.computeIfAbsent' method call
in `sshd-common/src/main/java/org/apache/sshd/common/util/logging/LoggingUtils.java`
#### Snippet
```java
                Integer key = NumberUtils.toInteger(value);
                List<String> nameList = opcodesMap.get(key);
                if (nameList == null) {
                    nameList = new ArrayList<>();
                    opcodesMap.put(key, nameList);
```

## RuleId[id=Convert2Lambda]
### Convert2Lambda
Anonymous new SshFutureListener() can be replaced with lambda
in `sshd-spring-sftp/src/main/java/org/apache/sshd/sftp/spring/integration/ApacheSshdSftpSessionFactory.java`
#### Snippet
```java
        if (sharedSession != null) {
            log.info("resetSharedSession - session={}", sharedSession);
            sharedSession.close(false).addListener(new SshFutureListener<CloseFuture>() {
                @Override
                @SuppressWarnings("synthetic-access")
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `length`
in `sshd-common/src/main/java/org/apache/sshd/common/mac/Mac.java`
#### Snippet
```java

        if (len1 < (a1Offset + length)) {
            length = Math.min(length, len1 - a1Offset);
            length = Math.max(length, 0);
            result |= 0x00FF;
```

### AssignmentToMethodParameter
Assignment to method parameter `length`
in `sshd-common/src/main/java/org/apache/sshd/common/mac/Mac.java`
#### Snippet
```java
        if (len1 < (a1Offset + length)) {
            length = Math.min(length, len1 - a1Offset);
            length = Math.max(length, 0);
            result |= 0x00FF;
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `length`
in `sshd-common/src/main/java/org/apache/sshd/common/mac/Mac.java`
#### Snippet
```java

        if (len2 < (a2Offset + length)) {
            length = Math.min(length, len2 - a2Offset);
            length = Math.max(length, 0);
            result |= 0xFF00;
```

### AssignmentToMethodParameter
Assignment to method parameter `length`
in `sshd-common/src/main/java/org/apache/sshd/common/mac/Mac.java`
#### Snippet
```java
        if (len2 < (a2Offset + length)) {
            length = Math.min(length, len2 - a2Offset);
            length = Math.max(length, 0);
            result |= 0xFF00;
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `a1Offset`
in `sshd-common/src/main/java/org/apache/sshd/common/mac/Mac.java`
#### Snippet
```java
        }

        for (int cmpLen = length; cmpLen > 0; a1Offset++, a2Offset++, cmpLen--) {
            result |= a1[a1Offset] ^ a2[a2Offset];
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `a2Offset`
in `sshd-common/src/main/java/org/apache/sshd/common/mac/Mac.java`
#### Snippet
```java
        }

        for (int cmpLen = length; cmpLen > 0; a1Offset++, a2Offset++, cmpLen--) {
            result |= a1[a1Offset] ^ a2[a2Offset];
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `key`
in `sshd-common/src/main/java/org/apache/sshd/common/mac/BaseMac.java`
#### Snippet
```java
            byte[] tmp = new byte[defbsize];
            System.arraycopy(key, 0, tmp, 0, defbsize);
            key = tmp;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `sshd-common/src/main/java/org/apache/sshd/common/mac/Poly1305Mac.java`
#### Snippet
```java
            int toCopy = Math.min(length, BLOCK_SIZE - currentBlockOffset);
            System.arraycopy(in, offset, currentBlock, currentBlockOffset, toCopy);
            offset += toCopy;
            length -= toCopy;
            currentBlockOffset += toCopy;
```

### AssignmentToMethodParameter
Assignment to method parameter `length`
in `sshd-common/src/main/java/org/apache/sshd/common/mac/Poly1305Mac.java`
#### Snippet
```java
            System.arraycopy(in, offset, currentBlock, currentBlockOffset, toCopy);
            offset += toCopy;
            length -= toCopy;
            currentBlockOffset += toCopy;
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `user`
in `sshd-common/src/main/java/org/apache/sshd/common/util/OsUtils.java`
#### Snippet
```java
            int pos = user.lastIndexOf('\\');
            if (pos > 0) {
                user = user.substring(pos + 1);
            }

```

### AssignmentToMethodParameter
Assignment to method parameter `user`
in `sshd-common/src/main/java/org/apache/sshd/common/util/OsUtils.java`
#### Snippet
```java
            pos = user.indexOf(' ');
            if (pos > 0) {
                user = user.substring(0, pos).trim();
            }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `entries`
in `sshd-common/src/main/java/org/apache/sshd/client/config/hosts/HostConfigEntry.java`
#### Snippet
```java

        if (entries == null) {
            entries = new ArrayList<>();
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `t`
in `sshd-common/src/main/java/org/apache/sshd/common/util/ValidateUtils.java`
#### Snippet
```java

    public static String checkNotNullAndNotEmpty(String t, String message, Object arg) {
        t = checkNotNull(t, message, arg).trim();
        checkTrue(GenericUtils.length(t) > 0, message, arg);
        return t;
```

### AssignmentToMethodParameter
Assignment to method parameter `t`
in `sshd-common/src/main/java/org/apache/sshd/common/util/ValidateUtils.java`
#### Snippet
```java

    public static String checkNotNullAndNotEmpty(String t, String message) {
        t = checkNotNull(t, message).trim();
        checkTrue(GenericUtils.length(t) > 0, message);
        return t;
```

### AssignmentToMethodParameter
Assignment to method parameter `t`
in `sshd-common/src/main/java/org/apache/sshd/common/util/ValidateUtils.java`
#### Snippet
```java

    public static String checkNotNullAndNotEmpty(String t, String message, Object... args) {
        t = checkNotNull(t, message, args).trim();
        checkTrue(GenericUtils.length(t) > 0, message, args);
        return t;
```

### AssignmentToMethodParameter
Assignment to method parameter `path`
in `sshd-common/src/main/java/org/apache/sshd/common/util/SelectorUtils.java`
#### Snippet
```java
            }

            path = sb.toString();
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `pattern`
in `sshd-common/src/main/java/org/apache/sshd/common/util/SelectorUtils.java`
#### Snippet
```java
                && pattern.startsWith(REGEX_HANDLER_PREFIX)
                && pattern.endsWith(PATTERN_HANDLER_SUFFIX)) {
            pattern = pattern.substring(REGEX_HANDLER_PREFIX.length(), pattern.length() - PATTERN_HANDLER_SUFFIX.length());
            return str.matches(pattern);
        } else {
```

### AssignmentToMethodParameter
Assignment to method parameter `pattern`
in `sshd-common/src/main/java/org/apache/sshd/common/util/SelectorUtils.java`
#### Snippet
```java
                    && pattern.startsWith(ANT_HANDLER_PREFIX)
                    && pattern.endsWith(PATTERN_HANDLER_SUFFIX)) {
                pattern = pattern.substring(ANT_HANDLER_PREFIX.length(), pattern.length() - PATTERN_HANDLER_SUFFIX.length());
            }

```

### AssignmentToMethodParameter
Assignment to method parameter `pattern`
in `sshd-common/src/main/java/org/apache/sshd/common/util/SelectorUtils.java`
#### Snippet
```java
                    && pattern.startsWith(ANT_HANDLER_PREFIX)
                    && pattern.endsWith(PATTERN_HANDLER_SUFFIX)) {
                pattern = pattern.substring(ANT_HANDLER_PREFIX.length(), pattern.length() - PATTERN_HANDLER_SUFFIX.length());
            }

```

### AssignmentToMethodParameter
Assignment to method parameter `pattern`
in `sshd-common/src/main/java/org/apache/sshd/common/util/io/PathScanningMatcher.java`
#### Snippet
```java
     */
    public static String normalizePattern(String pattern) {
        pattern = pattern.trim();

        if (pattern.startsWith(SelectorUtils.REGEX_HANDLER_PREFIX)) {
```

### AssignmentToMethodParameter
Assignment to method parameter `pattern`
in `sshd-common/src/main/java/org/apache/sshd/common/util/io/PathScanningMatcher.java`
#### Snippet
```java
        if (pattern.startsWith(SelectorUtils.REGEX_HANDLER_PREFIX)) {
            if (File.separatorChar == '\\') {
                pattern = GenericUtils.replace(pattern, "/", "\\\\", -1);
            } else {
                pattern = GenericUtils.replace(pattern, "\\\\", "/", -1);
```

### AssignmentToMethodParameter
Assignment to method parameter `pattern`
in `sshd-common/src/main/java/org/apache/sshd/common/util/io/PathScanningMatcher.java`
#### Snippet
```java
                pattern = GenericUtils.replace(pattern, "/", "\\\\", -1);
            } else {
                pattern = GenericUtils.replace(pattern, "\\\\", "/", -1);
            }
        } else {
```

### AssignmentToMethodParameter
Assignment to method parameter `pattern`
in `sshd-common/src/main/java/org/apache/sshd/common/util/io/PathScanningMatcher.java`
#### Snippet
```java
            }
        } else {
            pattern = pattern.replace(File.separatorChar == '/' ? '\\' : '/', File.separatorChar);

            if (pattern.endsWith(File.separator)) {
```

### AssignmentToMethodParameter
Assignment to method parameter `pattern`
in `sshd-common/src/main/java/org/apache/sshd/common/util/io/PathScanningMatcher.java`
#### Snippet
```java

            if (pattern.endsWith(File.separator)) {
                pattern += "**";
            }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `path`
in `sshd-common/src/main/java/org/apache/sshd/common/util/io/PathUtils.java`
#### Snippet
```java
            Path homeDir = Objects.requireNonNull(getUserHomeFolder(), "No user home folder available");
            if (path.length() > 1) {
                path = homeDir + path.substring(1);
            } else {
                path = homeDir.toString();
```

### AssignmentToMethodParameter
Assignment to method parameter `path`
in `sshd-common/src/main/java/org/apache/sshd/common/util/io/PathUtils.java`
#### Snippet
```java
                path = homeDir + path.substring(1);
            } else {
                path = homeDir.toString();
            }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `off`
in `sshd-common/src/main/java/org/apache/sshd/common/util/io/der/DERWriter.java`
#### Snippet
```java
        // Strip leading zeroes
        while (len > 1 && bytes[off] == 0 && isPositive(bytes[off + 1])) {
            off++;
            len--;
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `len`
in `sshd-common/src/main/java/org/apache/sshd/common/util/io/der/DERWriter.java`
#### Snippet
```java
        while (len > 1 && bytes[off] == 0 && isPositive(bytes[off + 1])) {
            off++;
            len--;
        }
        // indicate it is an INTEGER
```

### AssignmentToMethodParameter
Assignment to method parameter `address`
in `sshd-common/src/main/java/org/apache/sshd/common/util/net/SshdSocketAddress.java`
#### Snippet
```java
    // Based on org.apache.commons.validator.routines.InetAddressValidator#isValidInet6Address
    public static boolean isIPv6Address(String address) {
        address = GenericUtils.trimToEmpty(address);
        if (GenericUtils.isEmpty(address)) {
            return false;
```

### AssignmentToMethodParameter
Assignment to method parameter `addr`
in `sshd-common/src/main/java/org/apache/sshd/common/util/net/SshdSocketAddress.java`
#### Snippet
```java

    public static boolean isIPv4Address(String addr) {
        addr = GenericUtils.trimToEmpty(addr);
        if (GenericUtils.isEmpty(addr)) {
            return false;
```

### AssignmentToMethodParameter
Assignment to method parameter `i1`
in `sshd-common/src/main/java/org/apache/sshd/common/util/GenericUtils.java`
#### Snippet
```java
        Objects.requireNonNull(equator, "No equator provided");

        i1 = iteratorOf(i1);
        i2 = iteratorOf(i2);
        for (int index = 0;; index++) {
```

### AssignmentToMethodParameter
Assignment to method parameter `i2`
in `sshd-common/src/main/java/org/apache/sshd/common/util/GenericUtils.java`
#### Snippet
```java

        i1 = iteratorOf(i1);
        i2 = iteratorOf(i2);
        for (int index = 0;; index++) {
            if (i1.hasNext()) {
```

### AssignmentToMethodParameter
Assignment to method parameter `max`
in `sshd-common/src/main/java/org/apache/sshd/common/util/GenericUtils.java`
#### Snippet
```java
            start = end + repl.length();

            if (--max == 0) {
                break;
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `s`
in `sshd-common/src/main/java/org/apache/sshd/common/util/GenericUtils.java`
#### Snippet
```java
    public static String replaceWhitespaceAndTrim(String s) {
        if (s != null) {
            s = s.replace('\t', ' ');
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `length`
in `sshd-common/src/main/java/org/apache/sshd/common/util/buffer/BufferUtils.java`
#### Snippet
```java
        }

        while (length-- > 0) {
            if (a1[a1Offset++] != a2[a2Offset++]) {
                return false;
```

### AssignmentToMethodParameter
Assignment to method parameter `a1Offset`
in `sshd-common/src/main/java/org/apache/sshd/common/util/buffer/BufferUtils.java`
#### Snippet
```java

        while (length-- > 0) {
            if (a1[a1Offset++] != a2[a2Offset++]) {
                return false;
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `a2Offset`
in `sshd-common/src/main/java/org/apache/sshd/common/util/buffer/BufferUtils.java`
#### Snippet
```java

        while (length-- > 0) {
            if (a1[a1Offset++] != a2[a2Offset++]) {
                return false;
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `inputLen`
in `sshd-common/src/main/java/org/apache/sshd/common/cipher/BaseGCMCipher.java`
#### Snippet
```java
    public void update(byte[] input, int inputOffset, int inputLen) throws Exception {
        if (mode == Mode.Decrypt) {
            inputLen += getAuthenticationTagSize();
        }
        Cipher cipher = getInitializedCipherInstance();
```

### AssignmentToMethodParameter
Assignment to method parameter `data`
in `sshd-common/src/main/java/org/apache/sshd/common/cipher/BaseCipher.java`
#### Snippet
```java
            byte[] tmp = new byte[size];
            System.arraycopy(data, 0, tmp, 0, size);
            data = tmp;
        }
        return data;
```

### AssignmentToMethodParameter
Assignment to method parameter `key`
in `sshd-common/src/main/java/org/apache/sshd/common/cipher/BaseCipher.java`
#### Snippet
```java
    @Override
    public void init(Mode mode, byte[] key, byte[] iv) throws Exception {
        key = initializeKeyData(mode, key, getKdfSize());
        iv = initializeIVData(mode, iv, getIVSize());
        cipher = createCipherInstance(mode, key, iv);
```

### AssignmentToMethodParameter
Assignment to method parameter `iv`
in `sshd-common/src/main/java/org/apache/sshd/common/cipher/BaseCipher.java`
#### Snippet
```java
    public void init(Mode mode, byte[] key, byte[] iv) throws Exception {
        key = initializeKeyData(mode, key, getKdfSize());
        iv = initializeIVData(mode, iv, getIVSize());
        cipher = createCipherInstance(mode, key, iv);
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `dstOff`
in `sshd-common/src/main/java/org/apache/sshd/common/cipher/ChaCha20Cipher.java`
#### Snippet
```java
        private static void unpackIntsLE(byte[] buf, int off, int nrInts, int[] dst, int dstOff) {
            for (int i = 0; i < nrInts; i++) {
                dst[dstOff++] = unpackIntLE(buf, off);
                off += Integer.BYTES;
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `off`
in `sshd-common/src/main/java/org/apache/sshd/common/cipher/ChaCha20Cipher.java`
#### Snippet
```java
            for (int i = 0; i < nrInts; i++) {
                dst[dstOff++] = unpackIntLE(buf, off);
                off += Integer.BYTES;
            }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `sshd-common/src/main/java/org/apache/sshd/common/cipher/ChaCha20Cipher.java`
#### Snippet
```java
                    int output = keyStream ^ input;
                    packIntLE(output, out, outOffset, take);
                    offset += take;
                    outOffset += take;
                    length -= take;
```

### AssignmentToMethodParameter
Assignment to method parameter `outOffset`
in `sshd-common/src/main/java/org/apache/sshd/common/cipher/ChaCha20Cipher.java`
#### Snippet
```java
                    packIntLE(output, out, outOffset, take);
                    offset += take;
                    outOffset += take;
                    length -= take;
                }
```

### AssignmentToMethodParameter
Assignment to method parameter `length`
in `sshd-common/src/main/java/org/apache/sshd/common/cipher/ChaCha20Cipher.java`
#### Snippet
```java
                    offset += take;
                    outOffset += take;
                    length -= take;
                }
                int lo = ++engineState[COUNTER_OFFSET];
```

### AssignmentToMethodParameter
Assignment to method parameter `available`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/KeyEntryResolver.java`
#### Snippet
```java
        }

        available -= Integer.BYTES;
        if (len > available) {
            throw new IndexOutOfBoundsException("Requested block length (" + len + ") exceeds remaing (" + available + ")");
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/KeyEntryResolver.java`
#### Snippet
```java

        byte[] bytes = new byte[len];
        offset += Integer.BYTES;
        System.arraycopy(buf, offset, bytes, 0, len);
        return new SimpleImmutableEntry<>(bytes, Integer.valueOf(offset + len));
```

### AssignmentToMethodParameter
Assignment to method parameter `encoder`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/PublicKeyEntry.java`
#### Snippet
```java
            byte[] bytes = s.toByteArray();
            if (encoder == null) {
                encoder = resolveKeyDataEntryResolver(keyType);
            }

```

### AssignmentToMethodParameter
Assignment to method parameter `keyType`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/PublicKeyEntry.java`
#### Snippet
```java
     */
    public static PublicKeyEntryDataResolver unregisterKeyDataEntryResolver(String keyType) {
        keyType = ValidateUtils.checkNotNullAndNotEmpty(keyType, "No key type provided");

        synchronized (KEY_DATA_RESOLVERS) {
```

### AssignmentToMethodParameter
Assignment to method parameter `keyType`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/PublicKeyEntry.java`
#### Snippet
```java
     */
    public static PublicKeyEntryDataResolver getKeyDataEntryResolver(String keyType) {
        keyType = ValidateUtils.checkNotNullAndNotEmpty(keyType, "No key type provided");

        synchronized (KEY_DATA_RESOLVERS) {
```

### AssignmentToMethodParameter
Assignment to method parameter `decoder`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/PublicKeyEntry.java`
#### Snippet
```java
        String keyType = data.substring(0, startPos);
        if (decoder == null) {
            decoder = resolveKeyDataEntryResolver(keyType);
        }
        String b64Data = data.substring(startPos + 1, endPos).trim();
```

### AssignmentToMethodParameter
Assignment to method parameter `keyType`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/PublicKeyEntry.java`
#### Snippet
```java
     */
    public static PublicKeyEntryDataResolver resolveKeyDataEntryResolver(String keyType) {
        keyType = ValidateUtils.checkNotNullAndNotEmpty(keyType, "No key type provided");

        PublicKeyEntryDataResolver resolver = getKeyDataEntryResolver(keyType);
```

### AssignmentToMethodParameter
Assignment to method parameter `expected`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/KeyUtils.java`
#### Snippet
```java
            }

            expected = name.toUpperCase() + ":" + value;
        } else {
            expectedFactory = BuiltinDigests.md5;
```

### AssignmentToMethodParameter
Assignment to method parameter `expected`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/KeyUtils.java`
#### Snippet
```java
        } else {
            expectedFactory = BuiltinDigests.md5;
            expected = expectedFactory.getName().toUpperCase() + ":" + expected;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `keyType`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/KeyUtils.java`
#### Snippet
```java
    public static PublicKeyEntryDecoder<?, ?> registerPublicKeyEntryDecoderForKeyType(
            String keyType, PublicKeyEntryDecoder<?, ?> decoder) {
        keyType = ValidateUtils.checkNotNullAndNotEmpty(keyType, "No key type specified");
        Objects.requireNonNull(decoder, "No decoder specified");

```

### AssignmentToMethodParameter
Assignment to method parameter `keyType`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/KeyUtils.java`
#### Snippet
```java
     */
    public static PublicKeyEntryDecoder<?, ?> unregisterPublicKeyEntryDecoderForKeyType(String keyType) {
        keyType = ValidateUtils.checkNotNullAndNotEmpty(keyType, "No key type specified");

        synchronized (BY_KEY_TYPE_DECODERS_MAP) {
```

### AssignmentToMethodParameter
Assignment to method parameter `curve`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/pem/ECDSAPEMResourceKeyPairParser.java`
#### Snippet
```java
            }
        } else if (curve == null) {
            curve = namedParam;
        } else if (namedParam != curve) {
            throw new StreamCorruptedException("Mismatched provide (" + curve + ") vs. parsed curve (" + namedParam + ")");
```

### AssignmentToMethodParameter
Assignment to method parameter `stream`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/openssh/OpenSSHKeyPairResourceParser.java`
#### Snippet
```java
        boolean debugEnabled = log.isDebugEnabled();

        stream = validateStreamMagicMarker(session, resourceKey, stream);

        String cipher = KeyEntryResolver.decodeString(stream, MAX_CIPHER_NAME_LENGTH);
```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `sshd-ldap/src/main/java/org/apache/sshd/ldap/LdapNetworkConnector.java`
#### Snippet
```java
     */
    public void setBinaryAttributes(String value) {
        value = ValidateUtils.checkNotNullAndNotEmpty(value, "No attributes").replace(',', ' ');
        ldapEnv.put("java.naming.ldap.attributes.binary", value);
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `line`
in `sshd-cli/src/main/java/org/apache/sshd/cli/CliSupport.java`
#### Snippet
```java

    public static String[] splitCommandLineArguments(String line) {
        line = GenericUtils.trimToEmpty(line);
        if (GenericUtils.isBlank(line)) {
            return GenericUtils.EMPTY_STRING_ARRAY;
```

### AssignmentToMethodParameter
Assignment to method parameter `line`
in `sshd-cli/src/main/java/org/apache/sshd/cli/CliSupport.java`
#### Snippet
```java
                args.add(value);

                line = (endPos < (line.length() - 1)) ? line.substring(endPos + 1).trim() : "";
                if (GenericUtils.isBlank(line)) {
                    break;
```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `sshd-git/src/main/java/org/apache/sshd/git/AbstractGitCommand.java`
#### Snippet
```java
    public static List<String> parseDelimitedString(String value, String delim, boolean trim) {
        if (value == null) {
            value = "";
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `args`
in `sshd-cli/src/main/java/org/apache/sshd/cli/client/ScpCommandMain.java`
#### Snippet
```java
        try (BufferedReader stdin = new BufferedReader(
                new InputStreamReader(new NoCloseInputStream(System.in), Charset.defaultCharset()))) {
            args = normalizeCommandArguments(stdout, stderr, args);

            Level level = Level.SEVERE;
```

### AssignmentToMethodParameter
Assignment to method parameter `passwords`
in `sshd-git/src/main/java/org/apache/sshd/git/transport/GitSshdSession.java`
#### Snippet
```java
        try {
            if (passwords == null) {
                passwords = GenericUtils.EMPTY_STRING_ARRAY;
            }

```

### AssignmentToMethodParameter
Assignment to method parameter `pattern`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/client/fs/SftpPathDirectoryScanner.java`
#### Snippet
```java

    public static String adjustPattern(String pattern) {
        pattern = pattern.trim();
        if ((!pattern.startsWith(SelectorUtils.REGEX_HANDLER_PREFIX)) && pattern.endsWith("/")) {
            return pattern + "**";
```

### AssignmentToMethodParameter
Assignment to method parameter `ciphers`
in `sshd-cli/src/main/java/org/apache/sshd/cli/client/SshClientCliSupport.java`
#### Snippet
```java
            throws Exception {
        if (GenericUtils.isEmpty(ciphers)) {
            ciphers = setupCiphers(resolver, stderr);
            if (ciphers == null) {
                return null;
```

### AssignmentToMethodParameter
Assignment to method parameter `macs`
in `sshd-cli/src/main/java/org/apache/sshd/cli/client/SshClientCliSupport.java`
#### Snippet
```java

        if (GenericUtils.isEmpty(macs)) {
            macs = setupMacs(resolver, stderr);
            if (macs == null) {
                return null;
```

### AssignmentToMethodParameter
Assignment to method parameter `compressions`
in `sshd-cli/src/main/java/org/apache/sshd/cli/client/SshClientCliSupport.java`
#### Snippet
```java

        if (GenericUtils.isEmpty(compressions)) {
            compressions = setupCompressions(resolver, stderr);
            if (compressions == null) {
                return null;
```

### AssignmentToMethodParameter
Assignment to method parameter `off`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/client/impl/SftpOutputStreamAsync.java`
#### Snippet
```java
            buffer.putRawBytes(b, off, nb);

            off += nb;
            len -= nb;
            writtenCount += nb;
```

### AssignmentToMethodParameter
Assignment to method parameter `len`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/client/impl/SftpOutputStreamAsync.java`
#### Snippet
```java

            off += nb;
            len -= nb;
            writtenCount += nb;

```

### AssignmentToMethodParameter
Assignment to method parameter `max`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/client/impl/SftpInputStreamAsync.java`
#### Snippet
```java
                buffer.rpos(buffer.rpos() + nb);
                clientOffset += nb;
                max -= nb;
            }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `attrs`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/client/fs/SftpFileSystemProvider.java`
#### Snippet
```java
            throws IOException {
        if ("*".equals(attrs)) {
            attrs = "acl,owner";
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `client`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/client/fs/SftpFileSystemProvider.java`
#### Snippet
```java
        if (client == null) {
            // TODO: make this configurable using system properties
            client = SshClient.setUpDefaultClient();
            client.start();
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `params`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/client/fs/SftpFileSystemProvider.java`
#### Snippet
```java
                return Collections.emptyMap();
            }
            params = params.substring(1);
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `attrs`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/client/fs/SftpFileSystemProvider.java`
#### Snippet
```java
        PosixFileAttributes v = readAttributes(path, PosixFileAttributes.class, options);
        if ("*".equals(attrs)) {
            attrs = IoUtils.LASTMOD_TIME_VIEW_ATTR
                    + "," + IoUtils.LASTACC_TIME_VIEW_ATTR
                    + "," + IoUtils.CREATE_TIME_VIEW_ATTR
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/common/extensions/AclSupportedParser.java`
#### Snippet
```java
            }

            name = name.toUpperCase();
            if (!name.startsWith(LazyAclCapabilityNameHolder.ACL_CAP_NAME_PREFIX)) {
                name += LazyAclCapabilityNameHolder.ACL_CAP_NAME_PREFIX;
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/common/extensions/AclSupportedParser.java`
#### Snippet
```java
            name = name.toUpperCase();
            if (!name.startsWith(LazyAclCapabilityNameHolder.ACL_CAP_NAME_PREFIX)) {
                name += LazyAclCapabilityNameHolder.ACL_CAP_NAME_PREFIX;
            }

```

### AssignmentToMethodParameter
Assignment to method parameter `attrs`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/server/SftpFileSystemAccessor.java`
#### Snippet
```java
         */
        if (Files.exists(file)) {
            attrs = IoUtils.EMPTY_FILE_ATTRIBUTES;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `bufferSize`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/client/impl/AbstractSftpClient.java`
#### Snippet
```java
    public OutputStream write(String path, int bufferSize, Collection<OpenMode> mode) throws IOException {
        if (bufferSize <= 0) {
            bufferSize = getWriteBufferSize();
        }
        if (bufferSize < MIN_WRITE_BUFFER_SIZE) {
```

### AssignmentToMethodParameter
Assignment to method parameter `bufferSize`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/client/impl/AbstractSftpClient.java`
#### Snippet
```java
    public InputStream read(String path, int bufferSize, Collection<OpenMode> mode) throws IOException {
        if (bufferSize <= 0) {
            bufferSize = getReadBufferSize();
        }
        if (bufferSize < MIN_READ_BUFFER_SIZE) {
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/client/impl/AbstractSftpClient.java`
#### Snippet
```java
         */
        if (GenericUtils.isEmpty(options)) {
            options = EnumSet.of(OpenMode.Read);
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `fileOffset`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/client/impl/AbstractSftpClient.java`
#### Snippet
```java
            checkCommandStatus(SftpConstants.SSH_FXP_WRITE, buffer);

            fileOffset += writeSize;
            srcOffset += writeSize;
            remLen -= writeSize;
```

### AssignmentToMethodParameter
Assignment to method parameter `srcOffset`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/client/impl/AbstractSftpClient.java`
#### Snippet
```java

            fileOffset += writeSize;
            srcOffset += writeSize;
            remLen -= writeSize;
        } while (remLen > 0);
```

### AssignmentToMethodParameter
Assignment to method parameter `buffer`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/common/SftpHelper.java`
#### Snippet
```java

            if ((flagsMask & SftpConstants.SSH_FILEXFER_ATTR_ACMODTIME) != 0) {
                buffer = writeTime(buffer, sftpVersion, flagsMask, attributes.getAccessTime());
                buffer = writeTime(buffer, sftpVersion, flagsMask, attributes.getModifyTime());
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `buffer`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/common/SftpHelper.java`
#### Snippet
```java
            if ((flagsMask & SftpConstants.SSH_FILEXFER_ATTR_ACMODTIME) != 0) {
                buffer = writeTime(buffer, sftpVersion, flagsMask, attributes.getAccessTime());
                buffer = writeTime(buffer, sftpVersion, flagsMask, attributes.getModifyTime());
            }
        } else if (sftpVersion >= SftpConstants.SFTP_V4) {
```

### AssignmentToMethodParameter
Assignment to method parameter `buffer`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/common/SftpHelper.java`
#### Snippet
```java
            }
            if ((flagsMask & SftpConstants.SSH_FILEXFER_ATTR_ACCESSTIME) != 0) {
                buffer = writeTime(buffer, sftpVersion, flagsMask, attributes.getAccessTime());
            }
            if ((flagsMask & SftpConstants.SSH_FILEXFER_ATTR_CREATETIME) != 0) {
```

### AssignmentToMethodParameter
Assignment to method parameter `buffer`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/common/SftpHelper.java`
#### Snippet
```java
            }
            if ((flagsMask & SftpConstants.SSH_FILEXFER_ATTR_CREATETIME) != 0) {
                buffer = writeTime(buffer, sftpVersion, flagsMask, attributes.getCreateTime());
            }
            if ((flagsMask & SftpConstants.SSH_FILEXFER_ATTR_MODIFYTIME) != 0) {
```

### AssignmentToMethodParameter
Assignment to method parameter `buffer`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/common/SftpHelper.java`
#### Snippet
```java
            }
            if ((flagsMask & SftpConstants.SSH_FILEXFER_ATTR_MODIFYTIME) != 0) {
                buffer = writeTime(buffer, sftpVersion, flagsMask, attributes.getModifyTime());
            }
            if ((flagsMask & SftpConstants.SSH_FILEXFER_ATTR_ACL) != 0) {
```

### AssignmentToMethodParameter
Assignment to method parameter `buffer`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/common/SftpHelper.java`
#### Snippet
```java
            }
            if ((flagsMask & SftpConstants.SSH_FILEXFER_ATTR_ACL) != 0) {
                buffer = writeACLs(buffer, sftpVersion, attributes.getAcl());
            }

```

### AssignmentToMethodParameter
Assignment to method parameter `buffer`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/common/SftpHelper.java`
#### Snippet
```java

        if ((flagsMask & SftpConstants.SSH_FILEXFER_ATTR_EXTENDED) != 0) {
            buffer = writeExtensions(buffer, attributes.getExtensions());
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `buffer`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/common/SftpHelper.java`
#### Snippet
```java
        }
        if ((flags & SftpConstants.SSH_FILEXFER_ATTR_ACMODTIME) != 0) {
            buffer = writeTime(buffer, version, flags, lastAccessTime);
            buffer = writeTime(buffer, version, flags, lastModifiedTime);
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `buffer`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/common/SftpHelper.java`
#### Snippet
```java
        if ((flags & SftpConstants.SSH_FILEXFER_ATTR_ACMODTIME) != 0) {
            buffer = writeTime(buffer, version, flags, lastAccessTime);
            buffer = writeTime(buffer, version, flags, lastModifiedTime);
        }
        if ((flags & SftpConstants.SSH_FILEXFER_ATTR_EXTENDED) != 0) {
```

### AssignmentToMethodParameter
Assignment to method parameter `buffer`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/common/SftpHelper.java`
#### Snippet
```java
        }
        if ((flags & SftpConstants.SSH_FILEXFER_ATTR_EXTENDED) != 0) {
            buffer = writeExtensions(buffer, extensions);
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `buffer`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/common/SftpHelper.java`
#### Snippet
```java

        if ((flags & SftpConstants.SSH_FILEXFER_ATTR_ACCESSTIME) != 0) {
            buffer = writeTime(buffer, version, flags, lastAccessTime);
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `buffer`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/common/SftpHelper.java`
#### Snippet
```java

        if ((flags & SftpConstants.SSH_FILEXFER_ATTR_CREATETIME) != 0) {
            buffer = writeTime(buffer, version, flags, creationTime);
        }
        if ((flags & SftpConstants.SSH_FILEXFER_ATTR_MODIFYTIME) != 0) {
```

### AssignmentToMethodParameter
Assignment to method parameter `buffer`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/common/SftpHelper.java`
#### Snippet
```java
        }
        if ((flags & SftpConstants.SSH_FILEXFER_ATTR_MODIFYTIME) != 0) {
            buffer = writeTime(buffer, version, flags, lastModifiedTime);
        }
        if ((flags & SftpConstants.SSH_FILEXFER_ATTR_ACL) != 0) {
```

### AssignmentToMethodParameter
Assignment to method parameter `buffer`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/common/SftpHelper.java`
#### Snippet
```java
        }
        if ((flags & SftpConstants.SSH_FILEXFER_ATTR_ACL) != 0) {
            buffer = writeACLs(buffer, version, acl);
        }
        // TODO: ctime
```

### AssignmentToMethodParameter
Assignment to method parameter `buffer`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/common/SftpHelper.java`
#### Snippet
```java
        // TODO: bits
        if ((flags & SftpConstants.SSH_FILEXFER_ATTR_EXTENDED) != 0) {
            buffer = writeExtensions(buffer, extensions);
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `off`
in `sshd-core/src/main/java/org/apache/sshd/agent/local/AgentForwardedChannel.java`
#### Snippet
```java
            receiveBuffer.putBuffer(new ByteArrayBuffer(data, off, (int) len));
            if (receiveBuffer.available() >= Integer.BYTES) {
                off = receiveBuffer.rpos();
                len = receiveBuffer.getInt();
                receiveBuffer.rpos(off);
```

### AssignmentToMethodParameter
Assignment to method parameter `len`
in `sshd-core/src/main/java/org/apache/sshd/agent/local/AgentForwardedChannel.java`
#### Snippet
```java
            if (receiveBuffer.available() >= Integer.BYTES) {
                off = receiveBuffer.rpos();
                len = receiveBuffer.getInt();
                receiveBuffer.rpos(off);
                if (receiveBuffer.available() >= (Integer.BYTES + len)) {
```

### AssignmentToMethodParameter
Assignment to method parameter `buffer`
in `sshd-core/src/main/java/org/apache/sshd/client/kex/DHGClient.java`
#### Snippet
```java
        k = dh.getK();

        buffer = new ByteArrayBuffer(k_s);
        PublicKey serverKey = buffer.getRawPublicKey();
        PublicKey serverPublicHostKey = serverKey;
```

### AssignmentToMethodParameter
Assignment to method parameter `buffer`
in `sshd-core/src/main/java/org/apache/sshd/client/kex/DHGClient.java`
#### Snippet
```java
        }

        buffer = new ByteArrayBuffer();
        buffer.putBytes(v_c);
        buffer.putBytes(v_s);
```

### AssignmentToMethodParameter
Assignment to method parameter `readOffset`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/server/SftpSubsystem.java`
#### Snippet
```java

            effectiveLength -= readLen;
            readOffset += readLen;
            writeOffset += readLen;
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `writeOffset`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/server/SftpSubsystem.java`
#### Snippet
```java
            effectiveLength -= readLen;
            readOffset += readLen;
            writeOffset += readLen;
        }
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `buffer`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/server/SftpSubsystem.java`
#### Snippet
```java
        }

        buffer = prepareReply(buffer);

        buffer.putByte((byte) SftpConstants.SSH_FXP_VERSION);
```

### AssignmentToMethodParameter
Assignment to method parameter `algo`
in `sshd-core/src/main/java/org/apache/sshd/client/auth/pubkey/KeyPairIdentity.java`
#### Snippet
```java
        if (GenericUtils.isEmpty(algo)) {
            KeyPair kp = getKeyIdentity();
            algo = KeyUtils.getKeyType(kp.getPublic());
            // SSHD-1104 check if the key type is aliased
            factory = SignatureFactory.resolveSignatureFactory(algo, getSignatureFactories());
```

### AssignmentToMethodParameter
Assignment to method parameter `buffer`
in `sshd-core/src/main/java/org/apache/sshd/client/kex/DHGEXClient.java`
#### Snippet
```java
            }

            buffer = session.createBuffer(
                    SshConstants.SSH_MSG_KEX_DH_GEX_INIT, e.length + Byte.SIZE);
            buffer.putMPInt(e);
```

### AssignmentToMethodParameter
Assignment to method parameter `buffer`
in `sshd-core/src/main/java/org/apache/sshd/client/kex/DHGEXClient.java`
#### Snippet
```java
            k = dh.getK();

            buffer = new ByteArrayBuffer(k_s);
            PublicKey serverKey = buffer.getRawPublicKey();

```

### AssignmentToMethodParameter
Assignment to method parameter `buffer`
in `sshd-core/src/main/java/org/apache/sshd/client/kex/DHGEXClient.java`
#### Snippet
```java
            }

            buffer = new ByteArrayBuffer();
            buffer.putBytes(v_c);
            buffer.putBytes(v_s);
```

### AssignmentToMethodParameter
Assignment to method parameter `buffer`
in `sshd-core/src/main/java/org/apache/sshd/client/auth/password/UserAuthPassword.java`
#### Snippet
```java
        int length = GenericUtils.length(username) + GenericUtils.length(service) + GenericUtils.length(name)
                     + GenericUtils.length(oldPassword) + (modified ? GenericUtils.length(newPassword) : 0) + Long.SIZE;
        buffer = session.createBuffer(SshConstants.SSH_MSG_USERAUTH_REQUEST, length);
        buffer.putString(username);
        buffer.putString(service);
```

### AssignmentToMethodParameter
Assignment to method parameter `buffer`
in `sshd-core/src/main/java/org/apache/sshd/client/auth/keyboard/UserAuthKeyboardInteractive.java`
#### Snippet
```java

        int numResponses = rep.length;
        buffer = session.createBuffer(
                SshConstants.SSH_MSG_USERAUTH_INFO_RESPONSE, numResponses * Long.SIZE + Byte.SIZE);
        buffer.putUInt(numResponses);
```

### AssignmentToMethodParameter
Assignment to method parameter `buffer`
in `sshd-core/src/main/java/org/apache/sshd/client/auth/pubkey/UserAuthPublicKey.java`
#### Snippet
```java
        int length = GenericUtils.length(username) + GenericUtils.length(service) + GenericUtils.length(name)
                     + GenericUtils.length(algo) + ByteArrayBuffer.DEFAULT_SIZE + Long.SIZE;
        buffer = session.createBuffer(SshConstants.SSH_MSG_USERAUTH_REQUEST, length);
        buffer.putString(username);
        buffer.putString(service);
```

### AssignmentToMethodParameter
Assignment to method parameter `local`
in `sshd-core/src/main/java/org/apache/sshd/client/channel/ChannelDirectTcpip.java`
#### Snippet
```java
            try {
                InetAddress localHost = InetAddress.getLocalHost();
                local = new SshdSocketAddress(localHost.getHostName(), 0);
            } catch (UnknownHostException e) {
                throw new IllegalStateException("Unable to retrieve local host name");
```

### AssignmentToMethodParameter
Assignment to method parameter `charset`
in `sshd-core/src/main/java/org/apache/sshd/client/session/ClientSession.java`
#### Snippet
```java
            throws IOException {
        if (charset == null) {
            charset = StandardCharsets.US_ASCII;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `charset`
in `sshd-core/src/main/java/org/apache/sshd/client/session/ClientSession.java`
#### Snippet
```java
    default String executeRemoteCommand(String command, OutputStream stderr, Charset charset) throws IOException {
        if (charset == null) {
            charset = StandardCharsets.US_ASCII;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `len`
in `sshd-core/src/main/java/org/apache/sshd/common/channel/ChannelPipedInputStream.java`
#### Snippet
```java

            if (len > buffer.available()) {
                len = buffer.available();
            }
            buffer.getRawBytes(b, off, len);
```

### AssignmentToMethodParameter
Assignment to method parameter `s`
in `sshd-core/src/main/java/org/apache/sshd/common/channel/ChannelOutputStream.java`
#### Snippet
```java
                    buffer.putRawBytes(buf, s, (int) l2);
                    bufferLength += l2;
                    s += l2;
                    l -= l2;
                }
```

### AssignmentToMethodParameter
Assignment to method parameter `l`
in `sshd-core/src/main/java/org/apache/sshd/common/channel/ChannelOutputStream.java`
#### Snippet
```java
                    bufferLength += l2;
                    s += l2;
                    l -= l2;
                }
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `resume`
in `sshd-core/src/main/java/org/apache/sshd/common/channel/ChannelAsyncOutputStream.java`
#### Snippet
```java
                if (writeState.windowExpanded) {
                    writeState.windowExpanded = false;
                    resume = true;
                    currentWrite = nextWrite; // Try again.
                } else {
```

### AssignmentToMethodParameter
Assignment to method parameter `buffer`
in `sshd-core/src/main/java/org/apache/sshd/common/forward/SocksProxy.java`
#### Snippet
```java
                    foundNoAuth |= authMethods[i] == 0;
                }
                buffer = new ByteArrayBuffer(Byte.SIZE, false);
                buffer.putByte((byte) 0x05);
                buffer.putByte((byte) (foundNoAuth ? 0x00 : 0xFF));
```

### AssignmentToMethodParameter
Assignment to method parameter `buffer`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/server/AbstractSftpSubsystemHelper.java`
#### Snippet
```java
        }

        buffer = prepareReply(buffer);
        buffer.putByte((byte) SftpConstants.SSH_FXP_EXTENDED_REPLY);
        buffer.putInt(id);
```

### AssignmentToMethodParameter
Assignment to method parameter `buffer`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/server/AbstractSftpSubsystemHelper.java`
#### Snippet
```java
    protected void doOpenSSHLimits(Buffer buffer, int id) throws IOException {
        OpenSSHLimitsExtensionInfo info = getOpenSSHLimitsExtensionInfo(id, getServerChannelSession());
        buffer = prepareReply(buffer);
        buffer.putByte((byte) SftpConstants.SSH_FXP_EXTENDED_REPLY);
        buffer.putInt(id);
```

### AssignmentToMethodParameter
Assignment to method parameter `buffer`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/server/AbstractSftpSubsystemHelper.java`
#### Snippet
```java
            ValidateUtils.checkTrue(readLen >= 0, "Illegal requested read length: %d", readLen);

            buffer = prepareReply(buffer);
            buffer.ensureCapacity(readLen + Long.SIZE /* the header */, IntUnaryOperator.identity());

```

### AssignmentToMethodParameter
Assignment to method parameter `current`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/server/AbstractSftpSubsystemHelper.java`
#### Snippet
```java

        if (current == null) {
            current = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `buffer`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/server/AbstractSftpSubsystemHelper.java`
#### Snippet
```java
        }

        buffer = prepareReply(buffer);
        buffer.putByte((byte) SftpConstants.SSH_FXP_EXTENDED_REPLY);
        buffer.putInt(id);
```

### AssignmentToMethodParameter
Assignment to method parameter `followLinks`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/server/AbstractSftpSubsystemHelper.java`
#### Snippet
```java
        try {
            accessor.createDirectory(this, resolvedPath);
            followLinks = resolvePathResolutionFollowLinks(SftpConstants.SSH_FXP_MKDIR, "", resolvedPath);
            doSetAttributes(SftpConstants.SSH_FXP_MKDIR, "", resolvedPath, attrs, followLinks);
        } catch (IOException | RuntimeException | Error e) {
```

### AssignmentToMethodParameter
Assignment to method parameter `p`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/server/AbstractSftpSubsystemHelper.java`
#### Snippet
```java

            for (String p2 : extraPaths) {
                p = p.resolve(p2);
                options = getPathResolutionLinkOption(
                        SftpConstants.SSH_FXP_REALPATH, "", p);
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/server/AbstractSftpSubsystemHelper.java`
#### Snippet
```java
            for (String p2 : extraPaths) {
                p = p.resolve(p2);
                options = getPathResolutionLinkOption(
                        SftpConstants.SSH_FXP_REALPATH, "", p);
                sb.append('/').append(p2);
```

### AssignmentToMethodParameter
Assignment to method parameter `path`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/server/AbstractSftpSubsystemHelper.java`
#### Snippet
```java
            }

            path = sb.toString();
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `proposed`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/server/AbstractSftpSubsystemHelper.java`
#### Snippet
```java
                        session, id, proposed, hig, available);
            }
            proposed = hig; // debug breakpoint
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `buffer`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/server/AbstractSftpSubsystemHelper.java`
#### Snippet
```java
        int blockSize = buffer.getInt();
        try {
            buffer = prepareReply(buffer);
            buffer.putByte((byte) SftpConstants.SSH_FXP_EXTENDED_REPLY);
            buffer.putInt(id);
```

### AssignmentToMethodParameter
Assignment to method parameter `followLinks`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/server/AbstractSftpSubsystemHelper.java`
#### Snippet
```java
        Path p = resolveFile(path);
        if (followLinks == null) {
            followLinks = resolvePathResolutionFollowLinks(cmd, extension, p);
        }
        doSetAttributes(cmd, extension, p, attrs, followLinks);
```

### AssignmentToMethodParameter
Assignment to method parameter `buffer`
in `sshd-core/src/main/java/org/apache/sshd/server/kex/DHGServer.java`
#### Snippet
```java
        sig.initSigner(session, kp.getPrivate());

        buffer = new ByteArrayBuffer();
        buffer.putRawPublicKey(kp.getPublic());
        byte[] k_s = buffer.getCompactData();
```

### AssignmentToMethodParameter
Assignment to method parameter `buffer`
in `sshd-core/src/main/java/org/apache/sshd/server/kex/DHGServer.java`
#### Snippet
```java
        }

        buffer = session.prepareBuffer(SshConstants.SSH_MSG_KEXDH_REPLY, BufferUtils.clear(buffer));
        buffer.putBytes(k_s);
        dh.putF(buffer, f);
```

### AssignmentToMethodParameter
Assignment to method parameter `min`
in `sshd-core/src/main/java/org/apache/sshd/server/kex/DHGEXServer.java`
#### Snippet
```java
        int maxDHGroupExchangeKeySize = SecurityUtils.getMaxDHGroupExchangeKeySize();
        int minDHGroupExchangeKeySize = SecurityUtils.getMinDHGroupExchangeKeySize();
        min = Math.max(min, minDHGroupExchangeKeySize);
        prf = Math.max(prf, minDHGroupExchangeKeySize);
        prf = Math.min(prf, maxDHGroupExchangeKeySize);
```

### AssignmentToMethodParameter
Assignment to method parameter `prf`
in `sshd-core/src/main/java/org/apache/sshd/server/kex/DHGEXServer.java`
#### Snippet
```java
        int minDHGroupExchangeKeySize = SecurityUtils.getMinDHGroupExchangeKeySize();
        min = Math.max(min, minDHGroupExchangeKeySize);
        prf = Math.max(prf, minDHGroupExchangeKeySize);
        prf = Math.min(prf, maxDHGroupExchangeKeySize);
        max = Math.min(max, maxDHGroupExchangeKeySize);
```

### AssignmentToMethodParameter
Assignment to method parameter `prf`
in `sshd-core/src/main/java/org/apache/sshd/server/kex/DHGEXServer.java`
#### Snippet
```java
        min = Math.max(min, minDHGroupExchangeKeySize);
        prf = Math.max(prf, minDHGroupExchangeKeySize);
        prf = Math.min(prf, maxDHGroupExchangeKeySize);
        max = Math.min(max, maxDHGroupExchangeKeySize);

```

### AssignmentToMethodParameter
Assignment to method parameter `max`
in `sshd-core/src/main/java/org/apache/sshd/server/kex/DHGEXServer.java`
#### Snippet
```java
        prf = Math.max(prf, minDHGroupExchangeKeySize);
        prf = Math.min(prf, maxDHGroupExchangeKeySize);
        max = Math.min(max, maxDHGroupExchangeKeySize);

        List<Moduli.DhGroup> selected = new ArrayList<>();
```

### AssignmentToMethodParameter
Assignment to method parameter `buffer`
in `sshd-core/src/main/java/org/apache/sshd/server/kex/DHGEXServer.java`
#### Snippet
```java
            }

            buffer = session.createBuffer(SshConstants.SSH_MSG_KEX_DH_GEX_GROUP);
            buffer.putMPInt(pValue);
            buffer.putMPInt(dh.getG());
```

### AssignmentToMethodParameter
Assignment to method parameter `buffer`
in `sshd-core/src/main/java/org/apache/sshd/server/kex/DHGEXServer.java`
#### Snippet
```java
                        this, session, min, prf, max);
            }
            buffer = session.createBuffer(SshConstants.SSH_MSG_KEX_DH_GEX_GROUP);
            buffer.putMPInt(pValue);
            buffer.putMPInt(dh.getG());
```

### AssignmentToMethodParameter
Assignment to method parameter `buffer`
in `sshd-core/src/main/java/org/apache/sshd/server/kex/DHGEXServer.java`
#### Snippet
```java
            sig.initSigner(session, kp.getPrivate());

            buffer = new ByteArrayBuffer();
            buffer.putRawPublicKey(kp.getPublic());

```

### AssignmentToMethodParameter
Assignment to method parameter `buffer`
in `sshd-core/src/main/java/org/apache/sshd/server/kex/DHGEXServer.java`
#### Snippet
```java
            }

            buffer = session.prepareBuffer(
                    SshConstants.SSH_MSG_KEX_DH_GEX_REPLY, BufferUtils.clear(buffer));
            buffer.putBytes(k_s);
```

### AssignmentToMethodParameter
Assignment to method parameter `buffer`
in `sshd-core/src/main/java/org/apache/sshd/server/auth/keyboard/UserAuthKeyboardInteractive.java`
#### Snippet
```java

        // Prompt for password
        buffer = session.createBuffer(SshConstants.SSH_MSG_USERAUTH_INFO_REQUEST);
        challenge.append(buffer);
        session.writePacket(buffer);
```

### AssignmentToMethodParameter
Assignment to method parameter `buffer`
in `sshd-core/src/main/java/org/apache/sshd/server/auth/password/UserAuthPassword.java`
#### Snippet
```java
        }

        buffer = session.createBuffer(SshConstants.SSH_MSG_USERAUTH_PASSWD_CHANGEREQ,
                GenericUtils.length(prompt) + GenericUtils.length(lang) + Integer.SIZE);
        buffer.putString(prompt);
```

### AssignmentToMethodParameter
Assignment to method parameter `buffer`
in `sshd-core/src/main/java/org/apache/sshd/server/global/CancelTcpipForwardHandler.java`
#### Snippet
```java
        if (wantReply) {
            Session session = connectionService.getSession();
            buffer = session.createBuffer(SshConstants.SSH_MSG_REQUEST_SUCCESS, Integer.BYTES);
            buffer.putUInt(port);
            session.writePacket(buffer);
```

### AssignmentToMethodParameter
Assignment to method parameter `buffer`
in `sshd-core/src/main/java/org/apache/sshd/server/global/KeepAliveHandler.java`
#### Snippet
```java
        if (wantReply) {
            Session session = connectionService.getSession();
            buffer = session.createBuffer(SshConstants.SSH_MSG_REQUEST_SUCCESS, Integer.BYTES);
            session.writePacket(buffer);
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `buffer`
in `sshd-core/src/main/java/org/apache/sshd/server/global/TcpipForwardHandler.java`
#### Snippet
```java
        if (wantReply) {
            Session session = connectionService.getSession();
            buffer = session.createBuffer(SshConstants.SSH_MSG_REQUEST_SUCCESS, Integer.BYTES);
            buffer.putUInt(port);
            session.writePacket(buffer);
```

### AssignmentToMethodParameter
Assignment to method parameter `buffer`
in `sshd-core/src/main/java/org/apache/sshd/server/global/OpenSshHostKeysHandler.java`
#### Snippet
```java

        // generate the required signatures
        buffer = session.createBuffer(SshConstants.SSH_MSG_REQUEST_SUCCESS);

        Buffer buf = new ByteArrayBuffer();
```

### AssignmentToMethodParameter
Assignment to method parameter `buffer`
in `sshd-core/src/main/java/org/apache/sshd/server/session/ServerUserAuthService.java`
#### Snippet
```java
        }

        buffer = session.createBuffer(SshConstants.SSH_MSG_USERAUTH_FAILURE, remaining.length() + Byte.SIZE);
        buffer.putString(remaining);
        buffer.putBoolean(false); // no partial success ...
```

### AssignmentToMethodParameter
Assignment to method parameter `header`
in `sshd-scp/src/main/java/org/apache/sshd/scp/client/ScpRemote2RemoteTransferHelper.java`
#### Snippet
```java
                }

                header = (String) data;
                if (debugEnabled) {
                    log.debug("handleDirectoryTransferRequest({})[depth={}] {} => {}: header={}",
```

### AssignmentToMethodParameter
Assignment to method parameter `header`
in `sshd-scp/src/main/java/org/apache/sshd/scp/client/ScpRemote2RemoteTransferHelper.java`
#### Snippet
```java
                    signalReceivedCommand(time);

                    header = transferTimestampCommand(source, srcIn, srcOut, destination, dstIn, dstOut, header);
                    if (debugEnabled) {
                        log.debug("handleDirectoryTransferRequest({})[depth={}] {} => {}: header={}",
```

### AssignmentToMethodParameter
Assignment to method parameter `basedir`
in `sshd-scp/src/main/java/org/apache/sshd/scp/common/ScpFileOpener.java`
#### Snippet
```java
            String cwdLocal = System.getProperty("user.dir");
            Path cwdPath = Paths.get(cwdLocal);
            basedir = cwdPath.toAbsolutePath();
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `local`
in `sshd-scp/src/main/java/org/apache/sshd/scp/client/DefaultScpClient.java`
#### Snippet
```java
            String remote, Collection<Option> options, Collection<T> local, AbstractScpClient.ScpOperationExecutor<T> executor)
            throws IOException {
        local = ValidateUtils.checkNotNullAndNotEmpty(local, "Invalid argument local: %s", local);
        remote = ValidateUtils.checkNotNullAndNotEmpty(remote, "Invalid argument remote: %s", remote);
        if (local.size() > 1) {
```

### AssignmentToMethodParameter
Assignment to method parameter `remote`
in `sshd-scp/src/main/java/org/apache/sshd/scp/client/DefaultScpClient.java`
#### Snippet
```java
            throws IOException {
        local = ValidateUtils.checkNotNullAndNotEmpty(local, "Invalid argument local: %s", local);
        remote = ValidateUtils.checkNotNullAndNotEmpty(remote, "Invalid argument remote: %s", remote);
        if (local.size() > 1) {
            options = addTargetIsDirectory(options);
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `sshd-scp/src/main/java/org/apache/sshd/scp/client/DefaultScpClient.java`
#### Snippet
```java
        remote = ValidateUtils.checkNotNullAndNotEmpty(remote, "Invalid argument remote: %s", remote);
        if (local.size() > 1) {
            options = addTargetIsDirectory(options);
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `buffer`
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/AbstractSession.java`
#### Snippet
```java
            Buffer nb = preProcessEncodeBuffer(cmd, buffer);
            if (nb != buffer) {
                buffer = nb;
                curPos = buffer.rpos();

```

### AssignmentToMethodParameter
Assignment to method parameter `buffer`
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/AbstractSession.java`
#### Snippet
```java
        byte[] data = buffer.array();
        int cmd = data[curPos] & 0xFF; // usually the 1st byte is the command
        buffer = validateTargetBuffer(cmd, buffer);

        if (ignoreBuf != null) {
```

### AssignmentToMethodParameter
Assignment to method parameter `len`
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/AbstractSession.java`
#### Snippet
```java
        boolean authMode = authLen > 0;
        int pad = calculatePadLength(len, outCipherSize, etmMode || authMode);
        len += SshConstants.SSH_PACKET_HEADER_LEN + pad + authLen;
        if (outMac != null) {
            len += outMacSize;
```

### AssignmentToMethodParameter
Assignment to method parameter `len`
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/AbstractSession.java`
#### Snippet
```java
        len += SshConstants.SSH_PACKET_HEADER_LEN + pad + authLen;
        if (outMac != null) {
            len += outMacSize;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `len`
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/AbstractSession.java`
#### Snippet
```java
         */

        len++; // the pad length
        if (!etmMode) {
            len += Integer.BYTES;
```

### AssignmentToMethodParameter
Assignment to method parameter `len`
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/AbstractSession.java`
#### Snippet
```java
        len++; // the pad length
        if (!etmMode) {
            len += Integer.BYTES;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `buffer`
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/AbstractSession.java`
#### Snippet
```java
    @Override
    public Buffer prepareBuffer(byte cmd, Buffer buffer) {
        buffer = validateTargetBuffer(cmd & 0xFF, buffer);
        buffer.rpos(SshConstants.SSH_PACKET_HEADER_LEN);
        buffer.wpos(SshConstants.SSH_PACKET_HEADER_LEN);
```

### AssignmentToMethodParameter
Assignment to method parameter `buffer`
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/AbstractSession.java`
#### Snippet
```java
    @Override
    protected Buffer preProcessEncodeBuffer(int cmd, Buffer buffer) throws IOException {
        buffer = super.preProcessEncodeBuffer(cmd, buffer);
        // SSHD-968 - remember global request outgoing sequence number
        LongConsumer setter = globalSequenceNumbers.remove(buffer);
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `sshd-scp/src/main/java/org/apache/sshd/scp/common/helpers/DefaultScpFileOpener.java`
#### Snippet
```java
            Session session, Path file, long size, Set<PosixFilePermission> permissions, OpenOption... options)
            throws IOException {
        options = resolveOpenOptions(session, file, size, permissions, options);
        if (log.isDebugEnabled()) {
            log.debug("openWrite({}) size={}, permissions={}, file={}, options={}",
```

### AssignmentToMethodParameter
Assignment to method parameter `time`
in `sshd-scp/src/main/java/org/apache/sshd/scp/common/ScpHelper.java`
#### Snippet
```java
        sendOk();

        time = null;

        listener.startFolderEvent(session, FileOperation.RECEIVE, path, perms);
```

### AssignmentToMethodParameter
Assignment to method parameter `header`
in `sshd-scp/src/main/java/org/apache/sshd/scp/common/ScpHelper.java`
#### Snippet
```java
        try {
            for (;;) {
                header = readLine();
                if (debugEnabled) {
                    log.debug("receiveDir({})[{}] Received header: {}", this, file, header);
```

### AssignmentToMethodParameter
Assignment to method parameter `time`
in `sshd-scp/src/main/java/org/apache/sshd/scp/common/ScpHelper.java`
#### Snippet
```java
                if (cmdChar == ScpReceiveFileCommandDetails.COMMAND_NAME) {
                    receiveFile(header, file, time, preserve, bufferSize);
                    time = null;
                } else if (cmdChar == ScpReceiveDirCommandDetails.COMMAND_NAME) {
                    receiveDir(header, file, time, preserve, bufferSize);
```

### AssignmentToMethodParameter
Assignment to method parameter `time`
in `sshd-scp/src/main/java/org/apache/sshd/scp/common/ScpHelper.java`
#### Snippet
```java
                } else if (cmdChar == ScpReceiveDirCommandDetails.COMMAND_NAME) {
                    receiveDir(header, file, time, preserve, bufferSize);
                    time = null;
                } else if (cmdChar == ScpDirEndCommandDetails.COMMAND_NAME) {
                    sendOk();
```

### AssignmentToMethodParameter
Assignment to method parameter `time`
in `sshd-scp/src/main/java/org/apache/sshd/scp/common/ScpHelper.java`
#### Snippet
```java
                    break;
                } else if (cmdChar == ScpTimestampCommandDetails.COMMAND_NAME) {
                    time = ScpTimestampCommandDetails.parse(header);
                    sendOk();
                } else {
```

### AssignmentToMethodParameter
Assignment to method parameter `remote`
in `sshd-scp/src/main/java/org/apache/sshd/scp/client/AbstractScpClient.java`
#### Snippet
```java
    @Override
    public void download(String[] remote, Path local, Collection<Option> options) throws IOException {
        remote = ValidateUtils.checkNotNullAndNotEmpty(remote, "Invalid argument remote: %s", (Object) remote);

        if (remote.length > 1) {
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `sshd-scp/src/main/java/org/apache/sshd/scp/client/AbstractScpClient.java`
#### Snippet
```java

        if (remote.length > 1) {
            options = addTargetIsDirectory(options);
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `sshd-scp/src/main/java/org/apache/sshd/scp/client/AbstractScpClient.java`
#### Snippet
```java
        if (GenericUtils.isEmpty(options) || (!options.contains(Option.TargetIsDirectory))) {
            // create a copy in case the original collection is un-modifiable
            options = GenericUtils.isEmpty(options) ? EnumSet.noneOf(Option.class) : GenericUtils.of(options);
            options.add(Option.TargetIsDirectory);
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `local`
in `sshd-scp/src/main/java/org/apache/sshd/scp/client/AbstractScpClient.java`
#### Snippet
```java
    @Override
    public void download(String[] remote, String local, Collection<Option> options) throws IOException {
        local = ValidateUtils.checkNotNullAndNotEmpty(local, "Invalid argument local: %s", local);
        remote = ValidateUtils.checkNotNullAndNotEmpty(remote, "Invalid argument remote: %s", (Object) remote);

```

### AssignmentToMethodParameter
Assignment to method parameter `remote`
in `sshd-scp/src/main/java/org/apache/sshd/scp/client/AbstractScpClient.java`
#### Snippet
```java
    public void download(String[] remote, String local, Collection<Option> options) throws IOException {
        local = ValidateUtils.checkNotNullAndNotEmpty(local, "Invalid argument local: %s", local);
        remote = ValidateUtils.checkNotNullAndNotEmpty(remote, "Invalid argument remote: %s", (Object) remote);

        if (remote.length > 1) {
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `sshd-scp/src/main/java/org/apache/sshd/scp/client/AbstractScpClient.java`
#### Snippet
```java

        if (remote.length > 1) {
            options = addTargetIsDirectory(options);
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `local`
in `sshd-scp/src/main/java/org/apache/sshd/scp/client/AbstractScpClient.java`
#### Snippet
```java
    @Override
    public void download(String remote, Path local, Collection<Option> options) throws IOException {
        local = ValidateUtils.checkNotNull(local, "Invalid argument local: %s", local);
        remote = ValidateUtils.checkNotNullAndNotEmpty(remote, "Invalid argument remote: %s", remote);

```

### AssignmentToMethodParameter
Assignment to method parameter `remote`
in `sshd-scp/src/main/java/org/apache/sshd/scp/client/AbstractScpClient.java`
#### Snippet
```java
    public void download(String remote, Path local, Collection<Option> options) throws IOException {
        local = ValidateUtils.checkNotNull(local, "Invalid argument local: %s", local);
        remote = ValidateUtils.checkNotNullAndNotEmpty(remote, "Invalid argument remote: %s", remote);

        LinkOption[] opts = IoUtils.getLinkOptions(true);
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `sshd-scp/src/main/java/org/apache/sshd/scp/client/AbstractScpClient.java`
#### Snippet
```java
        LinkOption[] opts = IoUtils.getLinkOptions(true);
        if (Files.isDirectory(local, opts)) {
            options = addTargetIsDirectory(options);
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `local`
in `sshd-scp/src/main/java/org/apache/sshd/scp/client/AbstractScpClient.java`
#### Snippet
```java
    @Override
    public void download(String remote, String local, Collection<Option> options) throws IOException {
        local = ValidateUtils.checkNotNullAndNotEmpty(local, "Invalid argument local: %s", local);

        ClientSession session = getClientSession();
```

### AssignmentToMethodParameter
Assignment to method parameter `data`
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/SessionHelper.java`
#### Snippet
```java
    @Override
    public IoWriteFuture sendIgnoreMessage(byte... data) throws IOException {
        data = (data == null) ? GenericUtils.EMPTY_BYTE_ARRAY : data;
        Buffer buffer = createBuffer(SshConstants.SSH_MSG_IGNORE, data.length + Byte.SIZE);
        buffer.putBytes(data);
```

### AssignmentToMethodParameter
Assignment to method parameter `e`
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/SessionHelper.java`
#### Snippet
```java
            System.arraycopy(e, 0, bar, 0, e.length);
            System.arraycopy(foo, 0, bar, e.length, foo.length);
            e = bar;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `lang`
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/SessionHelper.java`
#### Snippet
```java
    public IoWriteFuture sendDebugMessage(boolean display, Object msg, String lang) throws IOException {
        String text = Objects.toString(msg, "");
        lang = (lang == null) ? "" : lang;

        Buffer buffer = createBuffer(SshConstants.SSH_MSG_DEBUG,
```

## RuleId[id=UnnecessaryContinue]
### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `sshd-common/src/main/java/org/apache/sshd/common/util/logging/LoggingUtils.java`
#### Snippet
```java
                }
            } catch (Exception e) {
                continue; // debug breakpoint
            }
        }
```

### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `sshd-common/src/main/java/org/apache/sshd/common/keyprovider/KeyPairProvider.java`
#### Snippet
```java

                    if (!types.add(t)) {
                        continue; // debug breakpoint
                    }
                }
```

### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `sshd-common/src/main/java/org/apache/sshd/common/keyprovider/AbstractResourceKeyPairProvider.java`
#### Snippet
```java

                if (!toDelete.add(resourceKey)) {
                    continue; // debug breakpoint
                }
            }
```

### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `sshd-cli/src/main/java/org/apache/sshd/cli/client/SshClientCliSupport.java`
#### Snippet
```java
            Integer prev = ptyModes.put(mode, value);
            if (prev != null) {
                continue; // debug breakpoint
            }
        }
```

### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `sshd-cli/src/main/java/org/apache/sshd/cli/client/SshClientCliSupport.java`
#### Snippet
```java
                Object prev = env.put(key, value);
                if (prev != null) {
                    continue; // debug breakpoint
                }
            }
```

### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/client/SftpClient.java`
#### Snippet
```java
                     * The option is ignored when the file system does not support the creation of sparse files
                     */
                    continue;
                } else {
                    throw new IllegalArgumentException("Unsupported open option: " + option);
```

### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/common/extensions/VersionsParser.java`
#### Snippet
```java

                if (!available.add(Integer.valueOf(v))) {
                    continue; // debug breakpoint
                }
            }
```

## RuleId[id=SynchronizationOnLocalVariableOrMethodParameter]
### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `supportMap`
in `sshd-common/src/main/java/org/apache/sshd/common/util/security/AbstractSecurityProviderRegistrar.java`
#### Snippet
```java

        Boolean supportFlag;
        synchronized (supportMap) {
            supportFlag = supportMap.computeIfAbsent(
                    name, k -> SecurityProviderRegistrar.super.isSecurityEntitySupported(entityType, name));
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `factoriesMap`
in `sshd-common/src/main/java/org/apache/sshd/common/util/security/SecurityUtils.java`
#### Snippet
```java
        String effectiveName = SecurityProviderRegistrar.getEffectiveSecurityEntityName(entityType, algorithm);
        SecurityEntityFactory<?> factoryEntry;
        synchronized (factoriesMap) {
            factoryEntry = factoriesMap.computeIfAbsent(
                    effectiveName, k -> createSecurityEntityFactory(entityType, entitySelector));
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on method parameter `holder`
in `sshd-common/src/main/java/org/apache/sshd/common/util/security/SecurityUtils.java`
#### Snippet
```java
            AtomicInteger holder, String propName, int maxKeySize) {
        int maxSupportedKeySize;
        synchronized (holder) {
            maxSupportedKeySize = holder.get();
            if (maxSupportedKeySize != 0) { // 1st time we are called ?
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on method parameter `match`
in `sshd-core/src/main/java/org/apache/sshd/client/keyverifier/KnownHostsServerKeyVerifier.java`
#### Snippet
```java
            }

            synchronized (match) {
                match.setServerKey(actual);
                entry.setConfigLine(newLine);
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on method parameter `current`
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/SessionHelper.java`
#### Snippet
```java
        }

        synchronized (current) {
            if (!current.isEmpty()) {
                current.clear(); // debug breakpoint
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/client/config/keys/LazyClientKeyIdentityProvider.java`
#### Snippet
```java
            if (!loader.isValidLocation(location)) {
                if (ignoreInvalid) {
                    return null;
                }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/client/config/keys/LazyClientKeyIdentityProvider.java`
#### Snippet
```java
        } catch (IOException e) {
            if (ignoreInvalid) {
                return null;
            }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/client/config/keys/ClientIdentityFileWatcher.java`
#### Snippet
```java
                    log.debug("reloadClientIdentity({}) ignore due to {}", path, violation.getKey());
                }
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/client/config/keys/ClientIdentityFileWatcher.java`
#### Snippet
```java
        }

        return null;
    }
}
```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/client/config/hosts/HostConfigEntryResolver.java`
#### Snippet
```java
                AttributeRepository context)
                throws IOException {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/client/config/keys/ClientIdentitiesWatcher.java`
#### Snippet
```java
            warn("loadKeys({}) failed ({}) to load key: {}",
                    p, e.getClass().getSimpleName(), e.getMessage(), e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/NamedResource.java`
#### Snippet
```java
     * Returns the value of {@link #getName()} - or {@code null} if argument is {@code null}
     */
    Function<NamedResource, String> NAME_EXTRACTOR = input -> input == null ? null : input.getName();

    /**
```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/NamedResource.java`
#### Snippet
```java
            Collection<String> names, Comparator<? super String> c, Collection<? extends R> resources) {
        return (GenericUtils.isEmpty(names) || GenericUtils.isEmpty(resources))
                ? null
                : GenericUtils.stream(resources)
                        .filter(r -> GenericUtils.findFirstMatchingMember(n -> c.compare(n, r.getName()) == 0, names) != null)
```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/NamedResource.java`
#### Snippet
```java
            String name, Comparator<? super String> c, Collection<? extends R> resources) {
        return (GenericUtils.isEmpty(name) || GenericUtils.isEmpty(resources))
                ? null
                : GenericUtils.stream(resources)
                        .filter(r -> c.compare(name, r.getName()) == 0)
```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/NamedFactory.java`
#### Snippet
```java
            return f.create();
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/client/config/hosts/HostPatternsHolder.java`
#### Snippet
```java
        String pattern = GenericUtils.replaceWhitespaceAndTrim(Objects.toString(patternString, null));
        if (GenericUtils.isEmpty(pattern)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/AttributeRepository.java`
#### Snippet
```java
            public <T> T getAttribute(AttributeKey<T> key) {
                Objects.requireNonNull(key, "No key provided");
                return MapEntryUtils.isEmpty(attributes) ? null : (T) attributes.get(key);
            }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/AttributeStore.java`
#### Snippet
```java
        value = resolver.apply(key);
        if (value == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/SyspropsMapWrapper.java`
#### Snippet
```java
    public Object get(Object key) {
        String propName = getMappedSyspropKey(key);
        return (key instanceof String) ? System.getProperty(propName) : null;
    }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/SyspropsMapWrapper.java`
#### Snippet
```java
        @Override
        public PropertyResolver getParentPropertyResolver() {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/client/config/keys/ClientIdentity.java`
#### Snippet
```java
                || (name.length() <= ID_FILE_PREFIX.length())
                || (!name.startsWith(ID_FILE_PREFIX))) {
            return null;
        } else {
            return name.substring(ID_FILE_PREFIX.length());
```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/PropertyResolver.java`
#### Snippet
```java
        @Override
        public PropertyResolver getParentPropertyResolver() {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/io/AbstractIoWriteFuture.java`
#### Snippet
```java
            return (Throwable) v;
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/kex/KexProposalOption.java`
#### Snippet
```java
    public static KexProposalOption fromName(String n) {
        if (GenericUtils.isEmpty(n)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/kex/KexProposalOption.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/kex/KexProposalOption.java`
#### Snippet
```java
    public static KexProposalOption fromProposalIndex(int index) {
        if ((index < 0) || (index >= VALUES.size())) {
            return null;
        } else {
            return VALUES.get(index);
```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/kex/extension/parser/HostBoundPubkeyAuthentication.java`
#### Snippet
```java
                LOG.debug("Inconsistent KEX extension {} received; no data (len={})", NAME, len);
            }
            return null;
        }
        String value = new String(data, off, len, StandardCharsets.UTF_8);
```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/kex/extension/parser/HostBoundPubkeyAuthentication.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/auth/UserAuthMethodFactory.java`
#### Snippet
```java
            return f.createUserAuth(session);
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/Property.java`
#### Snippet
```java
        protected Duration fromStorage(Object value) {
            Long val = PropertyResolverUtils.toLong(value);
            return (val != null) ? Duration.ofMillis(val) : null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/Property.java`
#### Snippet
```java

        private static Long toMillis(Duration value) {
            return value == null ? null : value.toMillis();
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/Property.java`
#### Snippet
```java
        protected Duration fromStorage(Object value) {
            Long val = PropertyResolverUtils.toLong(value);
            return val != null ? Duration.ofSeconds(val) : null;
        }
    }
```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/Property.java`
#### Snippet
```java
        protected Object toStorage(Duration value) {
            atLeast(getName(), value, min);
            return (value != null) ? value.getSeconds() : null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/Property.java`
#### Snippet
```java
        protected Object toStorage(Duration value) {
            atLeast(getName(), value, min);
            return (value != null) ? value.toMillis() : null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/Property.java`
#### Snippet
```java
        @Override
        protected String fromStorage(Object value) {
            return (value != null) ? value.toString() : null;
        }
    }
```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/file/nonefs/NoneFileSystemFactory.java`
#### Snippet
```java
    @Override
    public Path getUserHomeDir(SessionContext session) throws IOException {
        return null;
    }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/file/util/MockPath.java`
#### Snippet
```java
    @Override
    public Path getParent() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/file/nonefs/NoneFileSystemProvider.java`
#### Snippet
```java
    @Override
    public <V extends FileAttributeView> V getFileAttributeView(Path path, Class<V> type, LinkOption... options) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/file/nativefs/NativeFileSystemFactory.java`
#### Snippet
```java
        String userName = session.getUsername();
        if (GenericUtils.isEmpty(userName)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/file/nativefs/NativeFileSystemFactory.java`
#### Snippet
```java
        String homeRoot = getUsersHomeDir();
        if (GenericUtils.isEmpty(homeRoot)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/mac/BuiltinMacs.java`
#### Snippet
```java
    public static MacFactory resolveFactory(String name) {
        if (GenericUtils.isEmpty(name)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/mac/BuiltinMacs.java`
#### Snippet
```java
    public static BuiltinMacs fromFactory(NamedFactory<Mac> factory) {
        if (factory == null) {
            return null;
        } else {
            return fromFactoryName(factory.getName());
```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/mac/BuiltinMacs.java`
#### Snippet
```java
    public static BuiltinMacs fromString(String s) {
        if (GenericUtils.isEmpty(s)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/mac/BuiltinMacs.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/mac/BuiltinMacs.java`
#### Snippet
```java
    public static MacFactory unregisterExtension(String name) {
        if (GenericUtils.isEmpty(name)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/util/IgnoringEmptyMap.java`
#### Snippet
```java
    public V get(Object key) {
        Objects.requireNonNull(key, "No key provided");
        return null;
    }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/util/IgnoringEmptyMap.java`
#### Snippet
```java
    public V remove(Object key) {
        Objects.requireNonNull(key, "No key provided");
        return null;
    }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/util/ReflectionUtils.java`
#### Snippet
```java
 */
public final class ReflectionUtils {
    public static final Function<Field, String> FIELD_NAME_EXTRACTOR = f -> (f == null) ? null : f.getName();

    private ReflectionUtils() {
```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/client/config/hosts/HostConfigEntry.java`
#### Snippet
```java
            throws IOException {
        if (entry == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/client/config/hosts/HostConfigEntry.java`
#### Snippet
```java
    public static HostConfigEntry findBestMatch(Iterable<? extends HostConfigEntry> matches) {
        if (matches == null) {
            return null;
        } else {
            return findBestMatch(matches.iterator());
```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/client/config/hosts/HostConfigEntry.java`
#### Snippet
```java
        Map<String, String> props = getProperties();
        if (MapEntryUtils.isEmpty(props)) {
            return null;
        } else {
            return props.remove(key);
```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/client/config/hosts/HostConfigEntry.java`
#### Snippet
```java
    public static HostConfigEntry findBestMatch(Iterator<? extends HostConfigEntry> matches) {
        if ((matches == null) || (!matches.hasNext())) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/client/config/hosts/HostConfigEntry.java`
#### Snippet
```java
                // if both are specific then no best match
                if (isSpecificHostPattern(candidatePattern)) {
                    return null;
                }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/client/config/hosts/HostConfigEntry.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/client/config/hosts/HostConfigEntry.java`
#### Snippet
```java
                int numMatches = GenericUtils.size(matches);
                if (numMatches <= 0) {
                    return null;
                }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/client/config/hosts/HostConfigEntry.java`
#### Snippet
```java
    public static HostConfigEntry findBestMatch(Collection<? extends HostConfigEntry> matches) {
        if (GenericUtils.isEmpty(matches)) {
            return null;
        } else {
            return findBestMatch(matches.iterator());
```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/util/VersionInfo.java`
#### Snippet
```java
        String[] comps = GenericUtils.split(version, '.');
        if (GenericUtils.isEmpty(comps)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/util/NumberUtils.java`
#### Snippet
```java
    public static Integer toInteger(Number n) {
        if (n == null) {
            return null;
        } else if (n instanceof Integer) {
            return (Integer) n;
```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/util/io/ModifiableFileWatcher.java`
#### Snippet
```java
            return attrs.lastModifiedTime();
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/util/io/ModifiableFileWatcher.java`
#### Snippet
```java
            throws IOException {
        if ((path == null) || (!Files.exists(path, options))) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/util/io/ModifiableFileWatcher.java`
#### Snippet
```java
        Collection<PosixFilePermission> perms = IoUtils.getPermissions(path, options);
        if (GenericUtils.isEmpty(perms)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/util/io/ModifiableFileWatcher.java`
#### Snippet
```java
            // general issue: jvm does not support permissions
            // security issue: specific filesystem does not support permissions
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/util/io/ModifiableFileWatcher.java`
#### Snippet
```java
        }

        return null;
    }
}
```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/util/EventListenerUtils.java`
#### Snippet
```java
            }

            return null; // we assume always void return value...
        });
    }
```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/util/io/der/ASN1Class.java`
#### Snippet
```java
        // all 4 values are defined
        if ((value < 0) || (value >= VALUES.size())) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/util/io/der/ASN1Class.java`
#### Snippet
```java
    public static ASN1Class fromName(String s) {
        if (GenericUtils.isEmpty(s)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/util/io/der/ASN1Class.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/util/io/der/ASN1Type.java`
#### Snippet
```java
    public static ASN1Type fromName(String s) {
        if (GenericUtils.isEmpty(s)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/util/io/der/ASN1Type.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/util/io/der/ASN1Type.java`
#### Snippet
```java
    public static ASN1Type fromTypeValue(int value) {
        if ((value < 0) || (value > 0x1F)) { // only 5 bits are used
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/util/io/der/ASN1Type.java`
#### Snippet
```java
        }

        return null;
    }
}
```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/util/io/der/DERParser.java`
#### Snippet
```java
        int tag = read();
        if (tag == -1) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/file/util/BasePath.java`
#### Snippet
```java
    public T getParent() {
        if (names.isEmpty() || ((names.size() == 1) && (root == null))) {
            return null;
        }
        return create(root, names.subList(0, names.size() - 1));
```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/file/util/BasePath.java`
#### Snippet
```java
            return create(null, names.get(names.size() - 1));
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/file/util/BasePath.java`
#### Snippet
```java
            return create(root);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/util/io/functors/Invoker.java`
#### Snippet
```java
            ARG arg, Collection<? extends Invoker<? super ARG, ?>> invokers) {
        if (GenericUtils.isEmpty(invokers)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/util/io/functors/Invoker.java`
#### Snippet
```java
        }

        return null;
    }
}
```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/util/io/IoUtils.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/util/io/IoUtils.java`
#### Snippet
```java
            Collection<PosixFilePermission> perms, Collection<PosixFilePermission> excluded) {
        if (GenericUtils.isEmpty(perms) || GenericUtils.isEmpty(excluded)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/util/io/IoUtils.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/util/io/IoUtils.java`
#### Snippet
```java
            return OsUtils.getCanonicalUser(owner);
        } catch (UnsupportedOperationException e) {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/util/io/IoUtils.java`
#### Snippet
```java
            return Boolean.FALSE;
        } catch (IOException e) {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/util/io/IoUtils.java`
#### Snippet
```java
    public static IOException closeQuietly(Collection<? extends Closeable> closeables) {
        if (GenericUtils.isEmpty(closeables)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/util/io/resource/IoResource.java`
#### Snippet
```java
    static IoResource<?> forResource(Object resource) {
        if (resource == null) {
            return null;
        } else if (resource instanceof Path) {
            return new PathResource((Path) resource);
```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/util/net/SshdSocketAddress.java`
#### Snippet
```java
    public static <V> V removeByOptionalWildcardAddress(Map<SshdSocketAddress, ? extends V> map, SshdSocketAddress address) {
        Map.Entry<SshdSocketAddress, ? extends V> entry = findMatchingOptionalWildcardEntry(map, address);
        return (entry == null) ? null : map.remove(entry.getKey());
    }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/util/net/SshdSocketAddress.java`
#### Snippet
```java
    public static InetSocketAddress toInetSocketAddress(SocketAddress remoteAddress) {
        if (remoteAddress == null) {
            return null;
        } else if (remoteAddress instanceof InetSocketAddress) {
            return (InetSocketAddress) remoteAddress;
```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/util/net/SshdSocketAddress.java`
#### Snippet
```java
    public static InetAddress getFirstExternalNetwork4Address() {
        List<? extends InetAddress> addresses = getExternalNetwork4Addresses();
        return (GenericUtils.size(addresses) > 0) ? addresses.get(0) : null;
    }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/util/net/SshdSocketAddress.java`
#### Snippet
```java
        String ip = (addr == null) ? null : addr.toString();
        if (GenericUtils.isEmpty(ip)) {
            return null;
        } else {
            return ip.replaceAll(".*/", "");
```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/util/net/SshdSocketAddress.java`
#### Snippet
```java
            Map<SshdSocketAddress, ? extends V> map, SshdSocketAddress address) {
        if (MapEntryUtils.isEmpty(map) || (address == null)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/util/net/SshdSocketAddress.java`
#### Snippet
```java
    public static <V> V findByOptionalWildcardAddress(Map<SshdSocketAddress, ? extends V> map, SshdSocketAddress address) {
        Map.Entry<SshdSocketAddress, ? extends V> entry = findMatchingOptionalWildcardEntry(map, address);
        return (entry == null) ? null : entry.getValue();
    }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/util/net/SshdSocketAddress.java`
#### Snippet
```java
    public static String toAddressString(SocketAddress addr) {
        if (addr == null) {
            return null;
        } else if (addr instanceof InetSocketAddress) {
            return ((InetSocketAddress) addr).getHostString();
```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/util/net/SshdSocketAddress.java`
#### Snippet
```java
    public static SshdSocketAddress toSshdSocketAddress(SocketAddress addr) {
        if (addr == null) {
            return null;
        } else if (addr instanceof SshdSocketAddress) {
            return (SshdSocketAddress) addr;
```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/util/GenericUtils.java`
#### Snippet
```java
    public static <T> T head(Iterable<? extends T> it) {
        if (it == null) {
            return null;
        } else if (it instanceof Deque<?>) { // check before (!) instanceof List since LinkedList implements List
            Deque<? extends T> l = (Deque<? extends T>) it;
```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/util/GenericUtils.java`
#### Snippet
```java
        } else if (it instanceof Deque<?>) { // check before (!) instanceof List since LinkedList implements List
            Deque<? extends T> l = (Deque<? extends T>) it;
            return !l.isEmpty() ? l.getFirst() : null;
        } else if (it instanceof List<?>) {
            List<? extends T> l = (List<? extends T>) it;
```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/util/GenericUtils.java`
#### Snippet
```java
        } else if (it instanceof List<?>) {
            List<? extends T> l = (List<? extends T>) it;
            return !l.isEmpty() ? l.get(0) : null;
        } else if (it instanceof SortedSet<?>) {
            SortedSet<? extends T> s = (SortedSet<? extends T>) it;
```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/util/GenericUtils.java`
#### Snippet
```java
        } else if (it instanceof SortedSet<?>) {
            SortedSet<? extends T> s = (SortedSet<? extends T>) it;
            return !s.isEmpty() ? s.first() : null;
        } else {
            Iterator<? extends T> iter = it.iterator();
```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/util/GenericUtils.java`
#### Snippet
```java
        } else {
            Iterator<? extends T> iter = it.iterator();
            return ((iter == null) || (!iter.hasNext())) ? null : iter.next();
        }
    }
```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/util/GenericUtils.java`
#### Snippet
```java
            Predicate<? super T> acceptor, Collection<? extends T> values) {
        List<T> matches = selectMatchingMembers(acceptor, values);
        return GenericUtils.isEmpty(matches) ? null : matches.get(0);
    }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/util/GenericUtils.java`
#### Snippet
```java
        Objects.requireNonNull(type, "No type selector specified");
        if (values == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/util/GenericUtils.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/util/buffer/BufferUtils.java`
#### Snippet
```java
    public static BigInteger fromMPIntBytes(byte[] mpInt) {
        if (NumberUtils.isEmpty(mpInt)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/util/threads/ExecutorServiceProvider.java`
#### Snippet
```java
    default CloseableExecutorService resolveExecutorService() {
        Supplier<? extends CloseableExecutorService> provider = getExecutorServiceProvider();
        return (provider == null) ? null : provider.get();
    }
}
```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/util/threads/ThreadUtils.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/util/security/SecurityProviderChoice.java`
#### Snippet
```java
            @Override
            public Provider getSecurityProvider() {
                return null;
            }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/util/security/SecurityProviderChoice.java`
#### Snippet
```java
        @Override
        public String getName() {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/util/security/SecurityProviderChoice.java`
#### Snippet
```java
        @Override
        public Provider getSecurityProvider() {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/util/logging/LoggingUtils.java`
#### Snippet
```java
    public static org.slf4j.event.Level slf4jLevelFromName(String name) {
        return GenericUtils.isEmpty(name)
                ? null
                : SLF4J_LEVELS.stream()
                        .filter(l -> name.equalsIgnoreCase(l.name()))
```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/util/security/eddsa/OpenSSHEd25519PrivateKeyEntryDecoder.java`
#### Snippet
```java
    public EdDSAPublicKey clonePublicKey(EdDSAPublicKey key) throws GeneralSecurityException {
        if (key == null) {
            return null;
        } else {
            return generatePublicKey(new EdDSAPublicKeySpec(key.getA(), key.getParams()));
```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/util/security/eddsa/OpenSSHEd25519PrivateKeyEntryDecoder.java`
#### Snippet
```java
    public EdDSAPrivateKey clonePrivateKey(EdDSAPrivateKey key) throws GeneralSecurityException {
        if (key == null) {
            return null;
        } else {
            return generatePrivateKey(new EdDSAPrivateKeySpec(key.getSeed(), key.getParams()));
```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/util/security/eddsa/Ed25519PublicKeyDecoder.java`
#### Snippet
```java
    public EdDSAPublicKey clonePublicKey(EdDSAPublicKey key) throws GeneralSecurityException {
        if (key == null) {
            return null;
        } else {
            return generatePublicKey(new EdDSAPublicKeySpec(key.getA(), key.getParams()));
```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/util/security/eddsa/Ed25519PublicKeyDecoder.java`
#### Snippet
```java
    public static byte[] getSeedValue(EdDSAPublicKey key) {
        // a bit of reverse-engineering on the EdDSAPublicKeySpec
        return (key == null) ? null : key.getAbyte();
    }
}
```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/util/security/eddsa/Ed25519PublicKeyDecoder.java`
#### Snippet
```java
    public EdDSAPrivateKey clonePrivateKey(EdDSAPrivateKey key) throws GeneralSecurityException {
        if (key == null) {
            return null;
        } else {
            return generatePrivateKey(new EdDSAPrivateKeySpec(key.getSeed(), key.getParams()));
```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/util/closeable/AbstractCloseable.java`
#### Snippet
```java

    protected CloseFuture doCloseGracefully() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/util/security/SecurityUtils.java`
#### Snippet
```java
        int numLoaded = GenericUtils.size(ids);
        if (numLoaded <= 0) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/util/closeable/AutoCloseableDelegateInvocationHandler.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/cipher/ECCurves.java`
#### Snippet
```java
    public static BigInteger octetStringToInteger(byte... octets) {
        if (octets == null) {
            return null;
        } else if (octets.length == 0) {
            return BigInteger.ZERO;
```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/cipher/ECCurves.java`
#### Snippet
```java
    public static ECPoint octetStringToEcPoint(byte... octets) {
        if (NumberUtils.isEmpty(octets)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/cipher/ECCurves.java`
#### Snippet
```java
    public static ECCurves fromOID(String oid) {
        if (GenericUtils.isEmpty(oid)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/cipher/ECCurves.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/cipher/ECCurves.java`
#### Snippet
```java
    public static ECCurves fromCurveParameters(ECParameterSpec params) {
        if (params == null) {
            return null;
        } else {
            return fromCurveSize(getCurveSize(params));
```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/cipher/ECCurves.java`
#### Snippet
```java
    public static ECCurves fromKeyType(String type) {
        if (GenericUtils.isEmpty(type)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/cipher/ECCurves.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/cipher/ECCurves.java`
#### Snippet
```java
    public static ECCurves fromCurveSize(int keySize) {
        if (keySize <= 0) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/cipher/ECCurves.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/cipher/ECCurves.java`
#### Snippet
```java
    public static ECCurves fromOIDValue(List<? extends Number> oid) {
        if (GenericUtils.isEmpty(oid)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/cipher/ECCurves.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/cipher/ECCurves.java`
#### Snippet
```java
        public static ECPointCompression fromIndicatorValue(int value) {
            if ((value < 0) || (value > 0xFF)) {
                return null; // must be a byte value
            }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/cipher/ECCurves.java`
#### Snippet
```java
            }

            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/TimeValueConfig.java`
#### Snippet
```java
    public static TimeValueConfig fromValueChar(char ch) {
        if ((ch <= ' ') || (ch >= 0x7F)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/TimeValueConfig.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/SyslogFacilityValue.java`
#### Snippet
```java
    public static SyslogFacilityValue fromName(String n) {
        if (GenericUtils.isEmpty(n)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/SyslogFacilityValue.java`
#### Snippet
```java
        }

        return null;
    }
}
```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/LogLevelValue.java`
#### Snippet
```java
    public static LogLevelValue fromName(String n) {
        if (GenericUtils.isEmpty(n)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/LogLevelValue.java`
#### Snippet
```java
        }

        return null;
    }
}
```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/CompressionConfigValue.java`
#### Snippet
```java
    public static CompressionConfigValue fromName(String n) {
        if (GenericUtils.isEmpty(n)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/CompressionConfigValue.java`
#### Snippet
```java
        }

        return null;
    }
}
```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/PublicKeyEntryResolver.java`
#### Snippet
```java
        public PublicKey resolve(SessionContext session, String keyType, byte[] keyData, Map<String, String> headers)
                throws IOException, GeneralSecurityException {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/IdentityUtils.java`
#### Snippet
```java
    public static String getIdentityFileName(String prefix, String type, String suffix) {
        if (GenericUtils.isEmpty(type)) {
            return null;
        } else {
            return GenericUtils.trimToEmpty(prefix)
```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/IdentityUtils.java`
#### Snippet
```java
    public static KeyPairProvider createKeyPairProvider(Map<String, KeyPair> ids, boolean supportedOnly) {
        if (MapEntryUtils.isEmpty(ids)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/IdentityUtils.java`
#### Snippet
```java

        if (MapEntryUtils.isEmpty(pairsMap)) {
            return null;
        } else {
            return new MappedKeyPairProvider(pairsMap);
```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/BuiltinIdentities.java`
#### Snippet
```java
    public static BuiltinIdentities fromAlgorithm(String algorithm) {
        if (GenericUtils.isEmpty(algorithm)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/BuiltinIdentities.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/BuiltinIdentities.java`
#### Snippet
```java
    public static BuiltinIdentities fromKeyType(Class<?> clazz) {
        if ((clazz == null) || (!Key.class.isAssignableFrom(clazz))) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/BuiltinIdentities.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/BuiltinIdentities.java`
#### Snippet
```java
    public static BuiltinIdentities fromKeyPair(KeyPair kp) {
        if (kp == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/BuiltinIdentities.java`
#### Snippet
```java
            return i1;
        } else {
            return null; // some kind of mixed keys...
        }
    }
```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/KeyEntryResolver.java`
#### Snippet
```java
    default KeyPair cloneKeyPair(KeyPair kp) throws GeneralSecurityException {
        if (kp == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/FilePasswordProvider.java`
#### Snippet
```java
     * An &quot;empty&quot; provider that returns {@code null} - i.e., unprotected key file
     */
    FilePasswordProvider EMPTY = (session, resourceKey, retryIndex) -> null;

    /**
```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/PrivateKeyEntryDecoder.java`
#### Snippet
```java
     */
    default PUB recoverPublicKey(PRV prvKey) throws GeneralSecurityException {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/PrivateKeyEntryDecoder.java`
#### Snippet
```java
    default String encodePrivateKey(SecureByteArrayOutputStream s, PRV key, PUB pubKey) throws IOException {
        Objects.requireNonNull(key, "No private key provided");
        return null;
    }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/PrivateKeyEntryDecoder.java`
#### Snippet
```java
            throws IOException, GeneralSecurityException {
        if (length <= 0) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/KeyTypeNamesSupport.java`
#### Snippet
```java
    static <S extends KeyTypeNamesSupport> S findSupporterByKeyTypeName(String typeName, Collection<? extends S> supporters) {
        return (GenericUtils.isEmpty(typeName) || GenericUtils.isEmpty(supporters))
                ? null
                : supporters.stream()
                        .filter(s -> {
```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/PublicKeyRawDataDecoder.java`
#### Snippet
```java
            throws IOException, GeneralSecurityException {
        if (length <= 0) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/OpenSshCertificateImpl.java`
#### Snippet
```java
    @Override
    public String getRawKeyType() {
        return GenericUtils.isEmpty(keyType) ? null : keyType.split("@")[0].substring(0, keyType.indexOf("-cert"));
    }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/OpenSshCertificateImpl.java`
#### Snippet
```java
    @Override
    public String getSignatureAlgorithm() {
        return NumberUtils.isEmpty(signature) ? null : new ByteArrayBuffer(signature).getString();
    }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/OpenSshCertificateImpl.java`
#### Snippet
```java
    public byte[] getRawSignature() {
        if (signature == null) {
            return null;
        }
        ByteArrayBuffer buffer = new ByteArrayBuffer(signature);
```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/OpenSshCertificateImpl.java`
#### Snippet
```java
    @Override
    public String getAlgorithm() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/OpenSshCertificateImpl.java`
#### Snippet
```java
    @Override
    public String getFormat() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/PrivateKeyEntryResolver.java`
#### Snippet
```java
        public PrivateKey resolve(SessionContext session, String keyType, byte[] keyData)
                throws IOException, GeneralSecurityException {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/AuthorizedKeyEntry.java`
#### Snippet
```java
        String line = GenericUtils.replaceWhitespaceAndTrim(value);
        if (GenericUtils.isEmpty(line) || (line.charAt(0) == COMMENT_CHAR) /* comment ? */) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/AuthorizedKeyEntry.java`
#### Snippet
```java
        String line = GenericUtils.replaceWhitespaceAndTrim(entryLine);
        if (GenericUtils.isEmpty(line) || (line.charAt(0) == COMMENT_CHAR) /* comment ? */) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/AuthorizedKeyEntry.java`
#### Snippet
```java
        String p = GenericUtils.trimToEmpty(option);
        if (GenericUtils.isEmpty(p)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/u2f/SkEcdsaPublicKey.java`
#### Snippet
```java
    @Override
    public String getFormat() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/u2f/SkEcdsaPublicKey.java`
#### Snippet
```java
    @Override
    public byte[] getEncoded() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/u2f/SkED25519PublicKey.java`
#### Snippet
```java
    @Override
    public byte[] getEncoded() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/u2f/SkED25519PublicKey.java`
#### Snippet
```java
    @Override
    public String getFormat() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/PublicKeyEntry.java`
#### Snippet
```java
        String data = GenericUtils.replaceWhitespaceAndTrim(encData);
        if (GenericUtils.isEmpty(data)) {
            return null;
        } else {
            return parsePublicKeyEntry(new PublicKeyEntry(), data, decoder);
```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/PropertyResolverUtils.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/PropertyResolverUtils.java`
#### Snippet
```java
    public static Boolean parseBoolean(String value) {
        if (GenericUtils.isEmpty(value)) {
            return null;
        } else if (TRUE_VALUES.contains(value)) {
            return Boolean.TRUE;
```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/PropertyResolverUtils.java`
#### Snippet
```java
    public static Integer toInteger(Object value) {
        if (value == null) {
            return null;
        } else if (value instanceof Integer) {
            return (Integer) value;
```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/PropertyResolverUtils.java`
#### Snippet
```java
    public static Charset toCharset(Object value) {
        if (value == null) {
            return null;
        } else if (value instanceof Charset) {
            return (Charset) value;
```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/PropertyResolverUtils.java`
#### Snippet
```java
            Class<E> enumType, Object value, boolean failIfNoMatch, Collection<E> available) {
        if (value == null) {
            return null;
        } else if (enumType.isInstance(value)) {
            return enumType.cast(value);
```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/PropertyResolverUtils.java`
#### Snippet
```java
            }

            return null;
        } else {
            throw new IllegalArgumentException("Bad value type for enum conversion: " + value.getClass().getSimpleName());
```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/PropertyResolverUtils.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/PropertyResolverUtils.java`
#### Snippet
```java
    public static Object resolvePropertyValue(Map<String, ?> props, String name) {
        String key = ValidateUtils.checkNotNullAndNotEmpty(name, "No property name");
        return (props != null) ? props.get(key) : null;
    }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/PropertyResolverUtils.java`
#### Snippet
```java
    public static Boolean toBoolean(Object value) {
        if (value == null) {
            return null;
        } else if (value instanceof Boolean) {
            return (Boolean) value;
```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/PropertyResolverUtils.java`
#### Snippet
```java
    public static Long toLong(Object value) {
        if (value == null) {
            return null;
        } else if (value instanceof Long) {
            return (Long) value;
```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/impl/SkED25519PublicKeyEntryDecoder.java`
#### Snippet
```java
    public SkED25519PublicKey clonePublicKey(SkED25519PublicKey key) {
        if (key == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/impl/RSAPublicKeyDecoder.java`
#### Snippet
```java
    public RSAPrivateKey clonePrivateKey(RSAPrivateKey key) throws GeneralSecurityException {
        if (key == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/impl/RSAPublicKeyDecoder.java`
#### Snippet
```java
    public RSAPublicKey clonePublicKey(RSAPublicKey key) throws GeneralSecurityException {
        if (key == null) {
            return null;
        } else {
            return generatePublicKey(new RSAPublicKeySpec(key.getModulus(), key.getPublicExponent()));
```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/impl/DSSPublicKeyEntryDecoder.java`
#### Snippet
```java
    public DSAPrivateKey clonePrivateKey(DSAPrivateKey key) throws GeneralSecurityException {
        if (key == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/impl/DSSPublicKeyEntryDecoder.java`
#### Snippet
```java
    public DSAPublicKey clonePublicKey(DSAPublicKey key) throws GeneralSecurityException {
        if (key == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/impl/SkECDSAPublicKeyEntryDecoder.java`
#### Snippet
```java
    public SkEcdsaPublicKey clonePublicKey(SkEcdsaPublicKey key) throws GeneralSecurityException {
        if (key == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/impl/ECDSAPublicKeyEntryDecoder.java`
#### Snippet
```java

        if (key == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/impl/ECDSAPublicKeyEntryDecoder.java`
#### Snippet
```java

        if (key == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/impl/OpenSSHCertificateDecoder.java`
#### Snippet
```java
    @Override
    public KeyPairGenerator getKeyPairGenerator() throws GeneralSecurityException {
        return null;
    }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/impl/OpenSSHCertificateDecoder.java`
#### Snippet
```java
    @Override
    public KeyFactory getKeyFactoryInstance() throws GeneralSecurityException {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/DESPrivateKeyObfuscator.java`
#### Snippet
```java
    public static final PrivateKeyEncryptionContext resolveEffectiveContext(PrivateKeyEncryptionContext encContext) {
        if (encContext == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/PrivateKeyEncryptionContext.java`
#### Snippet
```java
    public static final PrivateKeyObfuscator getRegisteredPrivateKeyObfuscator(String cipherName) {
        if (GenericUtils.isEmpty(cipherName)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/KeyUtils.java`
#### Snippet
```java
            return SecurityUtils.recoverEDDSAPublicKey(key);
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/KeyUtils.java`
#### Snippet
```java
    public static String getFingerPrint(Digest d, String s, Charset charset) {
        if (GenericUtils.isEmpty(s)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/KeyUtils.java`
#### Snippet
```java
        List<AuthorizedKeyEntry> keys = AuthorizedKeyEntry.readAuthorizedKeys(Objects.requireNonNull(path));
        if (GenericUtils.isEmpty(keys)) {
            return null;
        }
        if (keys.size() > 1) {
```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/KeyUtils.java`
#### Snippet
```java
    public static String getKeyType(Key key) {
        if (key == null) {
            return null;
        } else if (key instanceof DSAKey) {
            return KeyPairProvider.SSH_DSS;
```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/KeyUtils.java`
#### Snippet
```java
            ECCurves curve = ECCurves.fromCurveParameters(ecSpec);
            if (curve == null) {
                return null; // debug breakpoint
            } else {
                return curve.getKeyType();
```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/KeyUtils.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/KeyUtils.java`
#### Snippet
```java
            throws IOException {
        if ((path == null) || (!Files.exists(path, options))) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/KeyUtils.java`
#### Snippet
```java
        Collection<PosixFilePermission> perms = IoUtils.getPermissions(path, options);
        if (GenericUtils.isEmpty(perms)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/KeyUtils.java`
#### Snippet
```java
            // general issue: jvm does not support permissions
            // security issue: specific filesystem does not support permissions
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/KeyUtils.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/KeyUtils.java`
#### Snippet
```java
    public static PublicKey findMatchingKey(PublicKey key, Collection<? extends PublicKey> keySet) {
        if (key == null || GenericUtils.isEmpty(keySet)) {
            return null;
        }
        for (PublicKey k : keySet) {
```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/KeyUtils.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/KeyUtils.java`
#### Snippet
```java
    public static String getKeyType(KeyPair kp) {
        if (kp == null) {
            return null;
        }
        PrivateKey key = kp.getPrivate();
```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/KeyUtils.java`
#### Snippet
```java
    public static PublicKeyEntryDecoder<?, ?> getPublicKeyEntryDecoder(KeyPair kp) {
        if (kp == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/KeyUtils.java`
#### Snippet
```java
            return d1;
        } else {
            return null; // some kind of mixed keys...
        }
    }
```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/KeyUtils.java`
#### Snippet
```java
     */
    public static String getFingerPrint(Factory<? extends Digest> f, PublicKey key) {
        return (key == null) ? null : getFingerPrint(Objects.requireNonNull(f, "No digest factory").create(), key);
    }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/KeyUtils.java`
#### Snippet
```java

    public static byte[] getRawFingerprint(Factory<? extends Digest> f, PublicKey key) throws Exception {
        return (key == null) ? null : getRawFingerprint(Objects.requireNonNull(f, "No digest factory").create(), key);
    }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/KeyUtils.java`
#### Snippet
```java
    public static PublicKeyEntryDecoder<?, ?> getPublicKeyEntryDecoder(Key key) {
        if (key == null) {
            return null;
        } else {
            return getPublicKeyEntryDecoder(key.getClass());
```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/KeyUtils.java`
#### Snippet
```java
    public static SimpleImmutableEntry<Boolean, String> checkFingerPrint(String expected, Digest d, PublicKey key) {
        if (key == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/KeyUtils.java`
#### Snippet
```java
    public static PublicKeyEntryDecoder<?, ?> getPublicKeyEntryDecoder(String keyType) {
        if (GenericUtils.isEmpty(keyType)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/KeyUtils.java`
#### Snippet
```java
    public static PublicKey findMatchingKey(PublicKey key, PublicKey... keySet) {
        if (key == null || GenericUtils.isEmpty(keySet)) {
            return null;
        } else {
            return findMatchingKey(key, Arrays.asList(keySet));
```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/KeyUtils.java`
#### Snippet
```java
    public static byte[] getRawFingerprint(Digest d, PublicKey key) throws Exception {
        if (key == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/KeyUtils.java`
#### Snippet
```java
    public static PublicKeyEntryDecoder<?, ?> getPublicKeyEntryDecoder(Class<?> keyType) {
        if ((keyType == null) || (!Key.class.isAssignableFrom(keyType))) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/KeyUtils.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/KeyUtils.java`
#### Snippet
```java
    public static String getFingerPrint(Digest d, PublicKey key) {
        if (key == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/pem/ECDSAPEMResourceKeyPairParser.java`
#### Snippet
```java
    public static Map.Entry<ECCurves, ASN1Object> parseCurveParameter(ASN1Object paramsObject) throws IOException {
        if (paramsObject == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/pem/ECDSAPEMResourceKeyPairParser.java`
#### Snippet
```java
        ASN1Type objType = paramsObject.getObjType();
        if (objType == ASN1Type.NULL) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/cipher/BuiltinCiphers.java`
#### Snippet
```java
    public static CipherFactory resolveFactory(String name) {
        if (GenericUtils.isEmpty(name)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/cipher/BuiltinCiphers.java`
#### Snippet
```java
    public static BuiltinCiphers fromString(String s) {
        if (GenericUtils.isEmpty(s)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/cipher/BuiltinCiphers.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/cipher/BuiltinCiphers.java`
#### Snippet
```java
    public static BuiltinCiphers fromFactory(NamedFactory<Cipher> factory) {
        if (factory == null) {
            return null;
        } else {
            return fromFactoryName(factory.getName());
```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/cipher/BuiltinCiphers.java`
#### Snippet
```java
    public static NamedFactory<Cipher> unregisterExtension(String name) {
        if (GenericUtils.isEmpty(name)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/openssh/OpenSSHRSAPrivateKeyDecoder.java`
#### Snippet
```java
    public RSAPublicKey clonePublicKey(RSAPublicKey key) throws GeneralSecurityException {
        if (key == null) {
            return null;
        } else {
            return generatePublicKey(new RSAPublicKeySpec(key.getModulus(), key.getPublicExponent()));
```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/openssh/OpenSSHRSAPrivateKeyDecoder.java`
#### Snippet
```java
            return KeyPairProvider.SSH_RSA;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/openssh/OpenSSHRSAPrivateKeyDecoder.java`
#### Snippet
```java
    public RSAPrivateKey clonePrivateKey(RSAPrivateKey key) throws GeneralSecurityException {
        if (key == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/openssh/OpenSSHECDSAPrivateKeyEntryDecoder.java`
#### Snippet
```java
        ECCurves curve = ECCurves.fromECKey(key);
        if (curve == null) {
            return null;
        }
        String curveName = curve.getName();
```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/openssh/OpenSSHECDSAPrivateKeyEntryDecoder.java`
#### Snippet
```java

        if (key == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/openssh/OpenSSHECDSAPrivateKeyEntryDecoder.java`
#### Snippet
```java

        if (key == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/openssh/OpenSSHDSSPrivateKeyEntryDecoder.java`
#### Snippet
```java
    public DSAPublicKey clonePublicKey(DSAPublicKey key) throws GeneralSecurityException {
        if (key == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/openssh/OpenSSHDSSPrivateKeyEntryDecoder.java`
#### Snippet
```java
    public DSAPrivateKey clonePrivateKey(DSAPrivateKey key) throws GeneralSecurityException {
        if (key == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/writer/openssh/OpenSSHKeyPairResourceWriter.java`
#### Snippet
```java
        CharSequence password = (options == null) ? null : options.getPassword();
        if (GenericUtils.isEmpty(password)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/writer/openssh/OpenSSHKeyPairResourceWriter.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/digest/DigestUtils.java`
#### Snippet
```java
    public static byte[] getRawFingerprint(Digest d, byte[] buf, int offset, int len) throws Exception {
        if (len <= 0) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/digest/DigestUtils.java`
#### Snippet
```java
            String algo, Comparator<? super String> comp, Collection<? extends F> factories) {
        if (GenericUtils.isEmpty(algo) || GenericUtils.isEmpty(factories)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/digest/DigestUtils.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/digest/DigestUtils.java`
#### Snippet
```java
    public static String getFingerPrint(Digest d, String s, Charset charset) throws Exception {
        if (GenericUtils.isEmpty(s)) {
            return null;
        } else {
            return DigestUtils.getFingerPrint(d, s.getBytes(charset));
```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/digest/DigestUtils.java`
#### Snippet
```java
    public static String getFingerPrint(Digest d, byte[] buf, int offset, int len) throws Exception {
        if (len <= 0) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/digest/DigestUtils.java`
#### Snippet
```java
            String algo, Comparator<? super String> comp, Collection<? extends D> digests) {
        if (GenericUtils.isEmpty(algo) || GenericUtils.isEmpty(digests)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/digest/DigestUtils.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/digest/BuiltinDigests.java`
#### Snippet
```java
    public static BuiltinDigests fromString(String s) {
        if (GenericUtils.isEmpty(s)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/digest/BuiltinDigests.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/digest/BuiltinDigests.java`
#### Snippet
```java
    public static BuiltinDigests fromFactory(NamedFactory<? extends Digest> factory) {
        if (factory == null) {
            return null;
        } else {
            return fromFactoryName(factory.getName());
```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/future/AbstractSshFuture.java`
#### Snippet
```java
            ThreadUtils.runAsInternal(() -> {
                l.operationComplete(arg);
                return null;
            });
        } catch (Throwable t) {
```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/future/DefaultSshFuture.java`
#### Snippet
```java
    public Object getValue() {
        synchronized (lock) {
            return (result == GenericUtils.NULL) ? null : result;
        }
    }
```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/channel/PtyChannelConfigurationMutator.java`
#### Snippet
```java
            throws IOException, InterruptedException {
        if (mutator == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/openssh/OpenSSHKeyPairResourceParser.java`
#### Snippet
```java
    public static PrivateKeyEntryDecoder<?, ?> getPrivateKeyEntryDecoder(Class<?> keyType) {
        if ((keyType == null) || (!Key.class.isAssignableFrom(keyType))) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/openssh/OpenSSHKeyPairResourceParser.java`
#### Snippet
```java
        }

        return null;
    }
}
```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/openssh/OpenSSHKeyPairResourceParser.java`
#### Snippet
```java
    public static PrivateKeyEntryDecoder<?, ?> getPrivateKeyEntryDecoder(KeyPair kp) {
        if (kp == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/openssh/OpenSSHKeyPairResourceParser.java`
#### Snippet
```java
            return d1;
        } else {
            return null; // some kind of mixed keys...
        }
    }
```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/openssh/OpenSSHKeyPairResourceParser.java`
#### Snippet
```java
    public static PrivateKeyEntryDecoder<?, ?> getPrivateKeyEntryDecoder(String keyType) {
        if (GenericUtils.isEmpty(keyType)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/openssh/OpenSSHKeyPairResourceParser.java`
#### Snippet
```java
    public static PrivateKeyEntryDecoder<?, ?> getPrivateKeyEntryDecoder(Key key) {
        if (key == null) {
            return null;
        } else {
            return getPrivateKeyEntryDecoder(key.getClass());
```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/session/SessionHeartbeatController.java`
#### Snippet
```java
        public static HeartbeatType fromName(String name) {
            return GenericUtils.isEmpty(name)
                    ? null
                    : VALUES.stream()
                            .filter(v -> name.equalsIgnoreCase(v.name()))
```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/session/helpers/TimeoutIndicator.java`
#### Snippet
```java

    public static String toDisplayDurationValue(Duration d) {
        return (d == null) ? null : Long.toString(d.toMillis());
    }
}
```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/signature/AbstractSignature.java`
#### Snippet
```java
        // if it is encoded then we must have at least 2 UINT32 values
        if (dataLen < (2 * Integer.BYTES)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/signature/AbstractSignature.java`
#### Snippet
```java
        // after the key type we MUST have data bytes
        if (keyTypeLen >= (dataLen - Integer.BYTES)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/signature/AbstractSignature.java`
#### Snippet
```java
        // must have UINT32 with the data bytes length
        if (remainLen < Integer.BYTES) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/signature/AbstractSignature.java`
#### Snippet
```java
        // make sure reported number of bytes does not exceed available
        if (dataBytesLen > (remainLen - Integer.BYTES)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/signature/AbstractSignature.java`
#### Snippet
```java
        String keyType = new String(sig, keyTypeStartPos, (int) keyTypeLen, StandardCharsets.UTF_8);
        if (!typeSelector.test(keyType)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/signature/AbstractSignature.java`
#### Snippet
```java
     */
    protected Map.Entry<String, byte[]> extractEncodedSignature(byte[] sig, Collection<String> expectedTypes) {
        return GenericUtils.isEmpty(expectedTypes) ? null : extractEncodedSignature(sig, expectedTypes::contains);
    }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/pem/PEMResourceParserUtils.java`
#### Snippet
```java
    public static KeyPairPEMResourceParser getPEMResourceParserByOid(String oid) {
        if (GenericUtils.isEmpty(oid)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/pem/PEMResourceParserUtils.java`
#### Snippet
```java
    public static KeyPairPEMResourceParser getPEMResourceParserByAlgorithm(String algorithm) {
        if (GenericUtils.isEmpty(algorithm)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/signature/SignatureFactoriesManager.java`
#### Snippet
```java
     */
    static List<NamedFactory<Signature>> getSignatureFactories(SignatureFactoriesManager manager) {
        return (manager == null) ? null : manager.getSignatureFactories();
    }
}
```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/compression/BuiltinCompressions.java`
#### Snippet
```java
    public static CompressionFactory unregisterExtension(String name) {
        if (GenericUtils.isEmpty(name)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/compression/BuiltinCompressions.java`
#### Snippet
```java
    public static CompressionFactory resolveFactory(String name) {
        if (GenericUtils.isEmpty(name)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/keyprovider/KeyPairProvider.java`
#### Snippet
```java
        @Override
        public KeyPair loadKey(SessionContext session, String type) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/keyprovider/KeyPairProvider.java`
#### Snippet
```java
                }

                return null;
            }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/keyprovider/FileKeyPairProvider.java`
#### Snippet
```java
    @Override
    protected IoResource<Path> getIoResource(SessionContext session, Path resource) {
        return (resource == null) ? null : new PathResource(resource);
    }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/signature/SignatureFactory.java`
#### Snippet
```java
            String keyType, Collection<? extends NamedFactory<? extends Signature>> factories) {
        if (GenericUtils.isEmpty(keyType) || GenericUtils.isEmpty(factories)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/signature/SignatureFactory.java`
#### Snippet
```java
            throws InvalidKeySpecException {
        if (pubKey == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/keyprovider/KeyIdentityProvider.java`
#### Snippet
```java
        }

        return null;
    }
}
```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/signature/BuiltinSignatures.java`
#### Snippet
```java
    public static BuiltinSignatures fromFactory(NamedFactory<Signature> factory) {
        if (factory == null) {
            return null;
        } else {
            return fromFactoryName(factory.getName());
```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/signature/BuiltinSignatures.java`
#### Snippet
```java
    public static BuiltinSignatures fromString(String s) {
        if (GenericUtils.isEmpty(s)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/signature/BuiltinSignatures.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/signature/BuiltinSignatures.java`
#### Snippet
```java
    public static SignatureFactory unregisterExtension(String name) {
        if (GenericUtils.isEmpty(name)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/signature/BuiltinSignatures.java`
#### Snippet
```java
    public static SignatureFactory resolveFactory(String name) {
        if (GenericUtils.isEmpty(name)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/signature/BuiltinSignatures.java`
#### Snippet
```java
    public static Signature getSignerByCurveSize(ECParameterSpec params) {
        NamedFactory<Signature> factory = getFactoryByCurveSize(params);
        return (factory == null) ? null : factory.create();
    }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/server/Signal.java`
#### Snippet
```java
     */
    public static Signal get(String name) {
        return GenericUtils.isEmpty(name) ? null : NAME_LOOKUP_TABLE.get(name);
    }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/ssh2/Ssh2PublicKeyEntryDecoder.java`
#### Snippet
```java
        Map.Entry<Integer, Integer> markerPos = KeyPairResourceParser.findMarkerLine(lines, START_MARKERS);
        if (markerPos == null) {
            return null; // be lenient
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/server/keyprovider/AbstractGeneratorHostKeyProvider.java`
#### Snippet
```java
        LinkOption[] options = IoUtils.getLinkOptions(true);
        if ((!Files.exists(keyPath, options)) || (!Files.isRegularFile(keyPath, options))) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/server/keyprovider/AbstractGeneratorHostKeyProvider.java`
#### Snippet
```java
        KeyPair kp = GenericUtils.head(ids);
        if (kp == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/server/keyprovider/AbstractGeneratorHostKeyProvider.java`
#### Snippet
```java
        }
        Files.deleteIfExists(keyPath);
        return null;
    }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/server/keyprovider/AbstractGeneratorHostKeyProvider.java`
#### Snippet
```java
            kp = generateKeyPair(alg);
            if (kp == null) {
                return null;
            }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/server/keyprovider/AbstractGeneratorHostKeyProvider.java`
#### Snippet
```java
            warn("resolveKeyPair({})[{}] Failed ({}) to generate {} key-pair: {}",
                    keyPath, alg, e.getClass().getSimpleName(), alg, e.getMessage(), e);
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-openpgp/src/main/java/org/apache/sshd/openpgp/PGPPublicKeyFileWatcher.java`
#### Snippet
```java
        }

        return (key == null) ? null : key.toPublicKey();
    }
}
```

### ReturnNull
Return of `null`
in `sshd-openpgp/src/main/java/org/apache/sshd/openpgp/PGPPublicKeyFileWatcher.java`
#### Snippet
```java
            keyHolder.set(null); // mark as stale
            if (!exists()) {
                return null;
            }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/channel/PtyMode.java`
#### Snippet
```java
    public static PtyMode fromName(String name) {
        if (GenericUtils.isEmpty(name)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/channel/PtyMode.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `sshd-openpgp/src/main/java/org/apache/sshd/openpgp/PGPPublicKeyEntryDataResolver.java`
#### Snippet
```java
            case PublicKeyAlgorithmTags.EDDSA: // TODO find out how these key types are called
            default:
                return null;

        }
```

### ReturnNull
Return of `null`
in `sshd-openpgp/src/main/java/org/apache/sshd/openpgp/PGPPublicRingWatcher.java`
#### Snippet
```java
        }

        return null;
    }
}
```

### ReturnNull
Return of `null`
in `sshd-openpgp/src/main/java/org/apache/sshd/openpgp/PGPPublicRingWatcher.java`
#### Snippet
```java
        log.warn("handlePublicKeyExtractionError({}) failed ({}) to extract value for fingerprint={} from {}: {}",
                session, reason.getClass().getSimpleName(), fingerprint, resourceKey.getName(), reason.getMessage());
        return null;
    }

```

### ReturnNull
Return of `null`
in `sshd-openpgp/src/main/java/org/apache/sshd/openpgp/PGPAuthorizedKeyEntriesLoader.java`
#### Snippet
```java
            throws IOException, GeneralSecurityException {
        if (!PGPPublicKeyEntryDataResolver.PGP_KEY_TYPES.contains(keyType)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-openpgp/src/main/java/org/apache/sshd/openpgp/PGPAuthorizedKeyEntriesLoader.java`
#### Snippet
```java
        String fingerprint = PGPPublicKeyEntryDataResolver.encodeKeyFingerprint(keyData);
        if (GenericUtils.isEmpty(fingerprint)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-openpgp/src/main/java/org/apache/sshd/openpgp/PGPPrivateKeyExtractor.java`
#### Snippet
```java
            throws IOException, GeneralSecurityException {
        if (bcKey == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-openpgp/src/main/java/org/apache/sshd/openpgp/PGPPrivateKeyExtractor.java`
#### Snippet
```java
            throws IOException, GeneralSecurityException {
        if (bcKey == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-openpgp/src/main/java/org/apache/sshd/openpgp/PGPPrivateKeyExtractor.java`
#### Snippet
```java
            throws IOException, GeneralSecurityException {
        if (bcKey == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-openpgp/src/main/java/org/apache/sshd/openpgp/PGPPrivateKeyExtractor.java`
#### Snippet
```java
            throws IOException, GeneralSecurityException {
        if (bcKey == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-openpgp/src/main/java/org/apache/sshd/openpgp/PGPPrivateKeyExtractor.java`
#### Snippet
```java
            throws IOException, GeneralSecurityException, PGPException {
        if (sk == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-openpgp/src/main/java/org/apache/sshd/openpgp/PGPPublicKeyExtractor.java`
#### Snippet
```java
            throws IOException, GeneralSecurityException {
        if (bcKey == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-openpgp/src/main/java/org/apache/sshd/openpgp/PGPPublicKeyExtractor.java`
#### Snippet
```java
            throws IOException, GeneralSecurityException {
        if (sk == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-openpgp/src/main/java/org/apache/sshd/openpgp/PGPPublicKeyExtractor.java`
#### Snippet
```java
            throws IOException, GeneralSecurityException {
        if (bcKey == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-openpgp/src/main/java/org/apache/sshd/openpgp/PGPPublicKeyExtractor.java`
#### Snippet
```java
            throws IOException, GeneralSecurityException {
        if (bcKey == null) {
            return null;
        } else if (bcKey instanceof EdDSAPublicBCPGKey) {
            return extractEdDSAPublicKey(resourceKey, (EdDSAPublicBCPGKey) bcKey);
```

### ReturnNull
Return of `null`
in `sshd-openpgp/src/main/java/org/apache/sshd/openpgp/PGPPublicKeyExtractor.java`
#### Snippet
```java
            throws IOException, GeneralSecurityException {
        if (bcKey == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-openpgp/src/main/java/org/apache/sshd/openpgp/PGPPublicKeyExtractor.java`
#### Snippet
```java
            throws IOException, GeneralSecurityException {
        if (bcKey == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-ldap/src/main/java/org/apache/sshd/ldap/LdapPublickeyAuthenticator.java`
#### Snippet
```java
            throws GeneralSecurityException, IOException {
        if (keyData == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-openpgp/src/main/java/org/apache/sshd/openpgp/PGPUtils.java`
#### Snippet
```java
    public static EncryptionAlgorithm fromCipherName(String name) {
        if (GenericUtils.isEmpty(name)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-openpgp/src/main/java/org/apache/sshd/openpgp/PGPUtils.java`
#### Snippet
```java
    public static Subkey findSubkeyByFingerprint(Collection<? extends Subkey> subKeys, String fingerprint) {
        if (GenericUtils.isEmpty(subKeys) || GenericUtils.isEmpty(fingerprint)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-openpgp/src/main/java/org/apache/sshd/openpgp/PGPUtils.java`
#### Snippet
```java
    public static CompressionAlgorithm fromCompressionName(String name) {
        if (GenericUtils.isEmpty(name)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-ldap/src/main/java/org/apache/sshd/ldap/LdapNetworkConnector.java`
#### Snippet
```java
    public static String toString(Object attrVal) {
        if (attrVal == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-ldap/src/main/java/org/apache/sshd/ldap/LdapNetworkConnector.java`
#### Snippet
```java
        Object prev = attrsMap.put(attrID, attrVal);
        if (prev == null) {
            return null; // debug breakpoint
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/util/security/bouncycastle/BouncyCastleKeyPairResourceParser.java`
#### Snippet
```java
                                continue;
                            case IGNORE:
                                return null;
                            default:
                                throw new ProtocolException(
```

### ReturnNull
Return of `null`
in `sshd-cli/src/main/java/org/apache/sshd/cli/CliSupport.java`
#### Snippet
```java
            if (factory != null) {
                stderr.println("I/O factory re-specified - already set as " + factory);
                return null;
            }

```

### ReturnNull
Return of `null`
in `sshd-cli/src/main/java/org/apache/sshd/cli/CliSupport.java`
#### Snippet
```java
            if (index >= numArgs) {
                stderr.println("option requires an argument: " + argName);
                return null;
            }

```

### ReturnNull
Return of `null`
in `sshd-cli/src/main/java/org/apache/sshd/cli/CliSupport.java`
#### Snippet
```java
            factory = resolveBuiltinIoServiceFactory(stderr, argName, provider);
            if (factory == null) {
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `sshd-cli/src/main/java/org/apache/sshd/cli/CliSupport.java`
#### Snippet
```java
        if (value == null) {
            CliLogger.showError(stderr, "Unknown compression configuration value: " + argVal);
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-cli/src/main/java/org/apache/sshd/cli/CliSupport.java`
#### Snippet
```java
        if (GenericUtils.size(current) > 0) {
            CliLogger.showError(stderr, argName + " option value re-specified: " + NamedResource.getNames(current));
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-cli/src/main/java/org/apache/sshd/cli/CliSupport.java`
#### Snippet
```java
        if (GenericUtils.isEmpty(available)) {
            CliLogger.showError(stderr, "WARNING: No known ciphers in " + argVal);
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-cli/src/main/java/org/apache/sshd/cli/CliSupport.java`
#### Snippet
```java
        if (GenericUtils.size(current) > 0) {
            CliLogger.showError(stderr, argName + " option value re-specified: " + NamedResource.getNames(current));
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-cli/src/main/java/org/apache/sshd/cli/CliSupport.java`
#### Snippet
```java
        if (GenericUtils.isEmpty(available)) {
            CliLogger.showError(stderr, "No known compressions in " + argVal);
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-cli/src/main/java/org/apache/sshd/cli/CliSupport.java`
#### Snippet
```java
        if (GenericUtils.size(current) > 0) {
            CliLogger.showError(stderr, argName + " option value re-specified: " + NamedResource.getNames(current));
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-cli/src/main/java/org/apache/sshd/cli/CliSupport.java`
#### Snippet
```java
        if (GenericUtils.isEmpty(available)) {
            CliLogger.showError(stderr, "No known MACs in " + argVal);
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-cli/src/main/java/org/apache/sshd/cli/CliSupport.java`
#### Snippet
```java
        BuiltinIoServiceFactoryFactories factory = resolveIoServiceFactory(stderr, args);
        if (factory == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/KeyPairResourceParser.java`
#### Snippet
```java
    static SimpleImmutableEntry<Integer, Integer> findMarkerLine(List<String> lines, int startLine, List<String> markers) {
        if (GenericUtils.isEmpty(lines) || GenericUtils.isEmpty(markers)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/loader/KeyPairResourceParser.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `sshd-putty/src/main/java/org/apache/sshd/putty/PuttyKeyPairResourceParser.java`
#### Snippet
```java

    static String getStringHeaderValue(Map<String, String> headers, String key) {
        return MapEntryUtils.isEmpty(headers) ? null : headers.get(key);
    }

```

### ReturnNull
Return of `null`
in `sshd-cli/src/main/java/org/apache/sshd/cli/server/SshServerCliSupport.java`
#### Snippet
```java

        if (PropertyResolverUtils.isNoneValue(factory)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-spring-sftp/src/main/java/org/apache/sshd/sftp/spring/integration/SpringSftpSession.java`
#### Snippet
```java

    public SpringSftpSession(SftpClient clientInstance) {
        this(clientInstance, () -> null);
    }

```

### ReturnNull
Return of `null`
in `sshd-spring-sftp/src/main/java/org/apache/sshd/sftp/spring/integration/ApacheSshdSftpSessionFactory.java`
#### Snippet
```java
        Resource location = getPrivateKeyLocation();
        if (location == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-spring-sftp/src/main/java/org/apache/sshd/sftp/spring/integration/ApacheSshdSftpSessionFactory.java`
#### Snippet
```java
                            try {
                                sessionInstance.close();
                                return null;
                            } catch (Exception e) {
                                return e;
```

### ReturnNull
Return of `null`
in `sshd-cli/src/main/java/org/apache/sshd/cli/client/ScpCommandMain.java`
#### Snippet
```java

        if (error) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-cli/src/main/java/org/apache/sshd/cli/client/ScpCommandMain.java`
#### Snippet
```java
                if (index >= numArgs) {
                    CliLogger.showError(stderr, "option requires an argument: " + argName);
                    return null;
                }

```

### ReturnNull
Return of `null`
in `sshd-cli/src/main/java/org/apache/sshd/cli/client/ScpCommandMain.java`
#### Snippet
```java
                    .append(": ").println(e.getMessage());
            stderr.flush();
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `sshd-cli/src/main/java/org/apache/sshd/cli/client/SshKeyScanMain.java`
#### Snippet
```java
    private static String toString(SocketAddress addr) {
        if (addr == null) {
            return null;
        } else if (addr instanceof InetSocketAddress) {
            return ((InetSocketAddress) addr).getHostString();
```

### ReturnNull
Return of `null`
in `sshd-cli/src/main/java/org/apache/sshd/cli/client/SshKeyScanMain.java`
#### Snippet
```java
                    @Override
                    public String getUpdatedPassword(ClientSession session, String prompt, String lang) {
                        return null;
                    }

```

### ReturnNull
Return of `null`
in `sshd-cli/src/main/java/org/apache/sshd/cli/client/SshKeyScanMain.java`
#### Snippet
```java
                            ClientSession session, String name, String instruction,
                            String lang, String[] prompt, boolean[] echo) {
                        return null;
                    }

```

### ReturnNull
Return of `null`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/client/fs/SftpPath.java`
#### Snippet
```java
    public SftpClient.Attributes getAttributes() {
        // Subclasses may override
        return null;
    }

```

### ReturnNull
Return of `null`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/client/fs/SftpFileStore.java`
#### Snippet
```java
    @Override
    public Object getAttribute(String attribute) throws IOException {
        return null; // no special attributes supported
    }
}
```

### ReturnNull
Return of `null`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/client/fs/SftpFileStore.java`
#### Snippet
```java
    @Override
    public <V extends FileStoreAttributeView> V getFileStoreAttributeView(Class<V> type) {
        return null; // no special views supported
    }

```

### ReturnNull
Return of `null`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/client/fs/SftpPosixFileAttributes.java`
#### Snippet
```java
    public GroupPrincipal group() {
        String group = attributes.getGroup();
        return GenericUtils.isEmpty(group) ? null : new SftpFileSystem.DefaultGroupPrincipal(group);
    }

```

### ReturnNull
Return of `null`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/client/fs/SftpPosixFileAttributes.java`
#### Snippet
```java
    public UserPrincipal owner() {
        String owner = attributes.getOwner();
        return GenericUtils.isEmpty(owner) ? null : new SftpFileSystem.DefaultUserPrincipal(owner);
    }

```

### ReturnNull
Return of `null`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/client/fs/SftpPosixFileAttributes.java`
#### Snippet
```java
    public Object fileKey() {
        // TODO consider implementing this
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/client/fs/SftpPathIterator.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `sshd-cli/src/main/java/org/apache/sshd/cli/client/SshClientCliSupport.java`
#### Snippet
```java
                if ((index + 1) >= maxIndex) {
                    CliLogger.showError(stderr, "Missing " + argName + " option argument");
                    return null;
                }

```

### ReturnNull
Return of `null`
in `sshd-cli/src/main/java/org/apache/sshd/cli/client/SshClientCliSupport.java`
#### Snippet
```java
                    CliLogger.showError(stderr,
                            "Failed (" + e.getClass().getSimpleName() + ") to open " + argVal + ": " + e.getMessage());
                    return null;
                }
            }
```

### ReturnNull
Return of `null`
in `sshd-cli/src/main/java/org/apache/sshd/cli/client/SshClientCliSupport.java`
#### Snippet
```java

        if (GenericUtils.isEmpty(identities)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-cli/src/main/java/org/apache/sshd/cli/client/SshClientCliSupport.java`
#### Snippet
```java
        Boolean ptyEnabled = autoDetect ? Boolean.TRUE : PropertyResolverUtils.parseBoolean(s);
        if ((ptyEnabled == null) || (!ptyEnabled.booleanValue())) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-cli/src/main/java/org/apache/sshd/cli/client/SshClientCliSupport.java`
#### Snippet
```java
            ciphers = setupCiphers(resolver, stderr);
            if (ciphers == null) {
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `sshd-cli/src/main/java/org/apache/sshd/cli/client/SshClientCliSupport.java`
#### Snippet
```java
            macs = setupMacs(resolver, stderr);
            if (macs == null) {
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `sshd-cli/src/main/java/org/apache/sshd/cli/client/SshClientCliSupport.java`
#### Snippet
```java
            compressions = setupCompressions(resolver, stderr);
            if (compressions == null) {
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `sshd-cli/src/main/java/org/apache/sshd/cli/client/SshClientCliSupport.java`
#### Snippet
```java
        SshClient client = setupDefaultClient(resolver, level, stdout, stderr, args);
        if (client == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-cli/src/main/java/org/apache/sshd/cli/client/SshClientCliSupport.java`
#### Snippet
```java
            CliLogger.showError(stderr, "Failed (" + t.getClass().getSimpleName() + ") to setup client: " + t.getMessage());
            client.close();
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `sshd-cli/src/main/java/org/apache/sshd/cli/client/SshClientCliSupport.java`
#### Snippet
```java

        if (error) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-cli/src/main/java/org/apache/sshd/cli/client/SshClientCliSupport.java`
#### Snippet
```java
                stdin, stdout, stderr, level, args);
        if (client == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-cli/src/main/java/org/apache/sshd/cli/client/SshClientCliSupport.java`
#### Snippet
```java
                    stderr.append("WARNING: ").append(e.getClass().getSimpleName())
                            .append(" while read password: ").println(e.getMessage());
                    return null;
                }
            }
```

### ReturnNull
Return of `null`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/client/impl/SftpDirEntryIterator.java`
#### Snippet
```java
                    log.trace("load({})[{}] exhausted all entries on previous call", getPath(), handle);
                }
                return null;
            }

```

### ReturnNull
Return of `null`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/client/SftpClient.java`
#### Snippet
```java
        Object instance = getExtension(BuiltinSftpClientExtensions.fromType(extensionType));
        if (instance == null) {
            return null;
        } else {
            return extensionType.cast(instance);
```

### ReturnNull
Return of `null`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/client/extensions/helpers/AbstractSftpClientExtension.java`
#### Snippet
```java
                }

                return null;
            default:
                throw new SshException(
```

### ReturnNull
Return of `null`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/client/impl/DefaultSftpClient.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/client/fs/SftpFileSystemProvider.java`
#### Snippet
```java
    public SftpFileSystem getFileSystem(String id) {
        if (GenericUtils.isEmpty(id)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/client/fs/SftpFileSystemProvider.java`
#### Snippet
```java
    public static MutableBasicCredentials parseCredentials(String userInfo) {
        if (GenericUtils.isEmpty(userInfo)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/client/fs/SftpFileSystemProvider.java`
#### Snippet
```java
    public SftpFileSystem removeFileSystem(String id) {
        if (GenericUtils.isEmpty(id)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/common/extensions/AclSupportedParser.java`
#### Snippet
```java
        public static Integer getAclCapabilityValue(String name) {
            if (GenericUtils.isEmpty(name)) {
                return null;
            }

```

### ReturnNull
Return of `null`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/client/extensions/BuiltinSftpClientExtensions.java`
#### Snippet
```java
    public static BuiltinSftpClientExtensions fromType(Class<?> type) {
        if ((type == null) || (!SftpClientExtension.class.isAssignableFrom(type))) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/client/extensions/BuiltinSftpClientExtensions.java`
#### Snippet
```java
        // the base class is assignable to everybody so we cannot distinguish between the enum(s)
        if (SftpClientExtension.class == type) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/client/extensions/BuiltinSftpClientExtensions.java`
#### Snippet
```java
        }

        return null;
    }
}
```

### ReturnNull
Return of `null`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/common/extensions/ParserUtils.java`
#### Snippet
```java
    public static ExtensionParser<?> getRegisteredParser(String name) {
        if (GenericUtils.isEmpty(name)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/common/extensions/ParserUtils.java`
#### Snippet
```java
        ExtensionParser<?> parser = getRegisteredParser(name);
        if (parser == null) {
            return null;
        } else {
            return parser.parse(encoded);
```

### ReturnNull
Return of `null`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/common/extensions/ParserUtils.java`
#### Snippet
```java
    public static ExtensionParser<?> unregisterParser(String name) {
        if (GenericUtils.isEmpty(name)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/server/FileHandle.java`
#### Snippet
```java
                throw new IllegalArgumentException("Not allowed to use " + key + "=" + val);
            }
            return null;
        } else if (IoUtils.REGFILE_VIEW_ATTR.equals(key)) {
            if (!(Boolean) val) {
```

### ReturnNull
Return of `null`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/server/FileHandle.java`
#### Snippet
```java
                throw new IllegalArgumentException("Not allowed to use " + key + "=" + val);
            }
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-netty/src/main/java/org/apache/sshd/netty/NettyIoConnector.java`
#### Snippet
```java
        public IoSession getSession() {
            Object v = getValue();
            return (v instanceof IoSession) ? (IoSession) v : null;
        }

```

### ReturnNull
Return of `null`
in `sshd-netty/src/main/java/org/apache/sshd/netty/NettyIoConnector.java`
#### Snippet
```java
        public Throwable getException() {
            Object v = getValue();
            return (v instanceof Throwable) ? (Throwable) v : null;
        }

```

### ReturnNull
Return of `null`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/client/impl/AbstractSftpClient.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/client/impl/AbstractSftpClient.java`
#### Snippet
```java
            case SftpConstants.SSH_FXP_STATUS:
                throwStatusException(response.getCmd(), response.getId(), SftpStatus.parse(response));
                return null;
            default:
                return handleUnexpectedAttributesPacket(response);
```

### ReturnNull
Return of `null`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/client/impl/AbstractSftpClient.java`
#### Snippet
```java
    public SftpClientExtension getExtension(SftpClientExtensionFactory factory) {
        if (factory == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/client/impl/AbstractSftpClient.java`
#### Snippet
```java
        Object instance = getExtension(BuiltinSftpClientExtensions.fromType(extensionType));
        if (instance == null) {
            return null;
        } else {
            return extensionType.cast(instance);
```

### ReturnNull
Return of `null`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/client/impl/AbstractSftpClient.java`
#### Snippet
```java
                    log.trace("checkDirResponse({})[id={}] - status: {}", getClientChannel(), response.getId(), status);
                }
                return null;
            default:
                return handleUnknownDirListingPacket(response);
```

### ReturnNull
Return of `null`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/client/impl/AbstractSftpClient.java`
#### Snippet
```java
            case SftpConstants.SSH_FXP_STATUS:
                throwStatusException(response.getCmd(), response.getId(), SftpStatus.parse(response));
                return null;
            default:
                return handleUnexpectedHandlePacket(response);
```

### ReturnNull
Return of `null`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/client/impl/AbstractSftpClient.java`
#### Snippet
```java
            case SftpConstants.SSH_FXP_STATUS:
                throwStatusException(response.getCmd(), response.getId(), SftpStatus.parse(response));
                return null;
            default:
                return handleUnknownOneNamePacket(response);
```

### ReturnNull
Return of `null`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/client/impl/AbstractSftpClient.java`
#### Snippet
```java
            throw err;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `sshd-contrib/src/main/java/org/apache/sshd/contrib/common/io/EndlessWriteFuture.java`
#### Snippet
```java
    @Override
    public Throwable getException() {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `sshd-contrib/src/main/java/org/apache/sshd/contrib/common/io/EndlessWriteFuture.java`
#### Snippet
```java
    public IoWriteFuture verify(long timeoutMillis) throws IOException {
        await(timeoutMillis);
        return null;
    }

```

### ReturnNull
Return of `null`
in `sshd-contrib/src/main/java/org/apache/sshd/contrib/client/auth/password/InteractivePasswordIdentityProvider.java`
#### Snippet
```java
        UserInteraction ui = getUserInteraction();
        if (!ui.isInteractionAllowed(session)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-netty/src/main/java/org/apache/sshd/netty/NettyIoSession.java`
#### Snippet
```java
    public SocketAddress getLocalAddress() {
        Channel channel = (context == null) ? null : context.channel();
        return (channel == null) ? null : channel.localAddress();
    }

```

### ReturnNull
Return of `null`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/common/SftpHelper.java`
#### Snippet
```java
     */
    public static Boolean getEndOfFileIndicatorValue(Buffer buffer, int version) {
        return (version < SftpConstants.SFTP_V6) || (buffer.available() < 1) ? null : buffer.getBoolean();
    }

```

### ReturnNull
Return of `null`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/common/SftpHelper.java`
#### Snippet
```java
     */
    public static Boolean getEndOfListIndicatorValue(Buffer buffer, int version) {
        return (version < SftpConstants.SFTP_V6) || (buffer.available() < 1) ? null : buffer.getBoolean();
    }

```

### ReturnNull
Return of `null`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/common/SftpHelper.java`
#### Snippet
```java
                return AclEntryType.ALARM;
            default:
                return null;
        }
    }
```

### ReturnNull
Return of `null`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/common/SftpHelper.java`
#### Snippet
```java
            Buffer buffer, int version, PropertyResolver resolver, boolean indicatorValue) {
        if (version < SftpConstants.SFTP_V6) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/common/SftpHelper.java`
#### Snippet
```java

        if (!SftpModuleProperties.APPEND_END_OF_LIST_INDICATOR.getRequired(resolver)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-contrib/src/main/java/org/apache/sshd/contrib/common/signature/LegacyDSASigner.java`
#### Snippet
```java
    @Deprecated
    protected Object engineGetParameter(String key) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `sshd-mina/src/main/java/org/apache/sshd/mina/MinaConnector.java`
#### Snippet
```java
            public org.apache.sshd.common.io.IoSession getSession() {
                Object v = getValue();
                return v instanceof org.apache.sshd.common.io.IoSession ? (org.apache.sshd.common.io.IoSession) v : null;
            }

```

### ReturnNull
Return of `null`
in `sshd-mina/src/main/java/org/apache/sshd/mina/MinaConnector.java`
#### Snippet
```java
            public Throwable getException() {
                Object v = getValue();
                return v instanceof Throwable ? (Throwable) v : null;
            }

```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/agent/SshAgent.java`
#### Snippet
```java
     */
    default KeyPair resolveLocalIdentity(PublicKey key) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/agent/unix/UnixAgentFactory.java`
#### Snippet
```java

    protected CloseableExecutorService newExecutor() {
        return executorServiceFactory != null ? executorServiceFactory.create() : null;
    }

```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/agent/local/LocalAgentFactory.java`
#### Snippet
```java
    @Override
    public SshAgentServer createServer(ConnectionService service) throws IOException {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/agent/local/AgentImpl.java`
#### Snippet
```java
    public KeyPair resolveLocalIdentity(PublicKey key) {
        Map.Entry<KeyPair, String> pp = getKeyPair(keys, key);
        return (pp == null) ? null : pp.getKey();
    }

```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/agent/local/AgentImpl.java`
#### Snippet
```java
            Collection<? extends Map.Entry<KeyPair, String>> keys, PublicKey key) {
        if (GenericUtils.isEmpty(keys) || (key == null)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/agent/local/AgentImpl.java`
#### Snippet
```java
        }

        return null;
    }
}
```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/client/ClientBuilder.java`
#### Snippet
```java
    @SuppressWarnings("checkstyle:Indentation")
    public static final Function<DHFactory, KeyExchangeFactory> DH2KEX = factory -> factory == null
            ? null
            : factory.isGroupExchange()
                    ? DHGEXClient.newFactory(factory)
```

### ReturnNull
Return of `null`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/server/SftpSubsystem.java`
#### Snippet
```java
                        new AccessDeniedException(p.toString(), p.toString(), "Not readable"));
            }
            return null;
        });
        // Directory exists and is readable
```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/client/auth/pubkey/UserAuthPublicKeyIterator.java`
#### Snippet
```java
        SshAgentFactory factory = manager.getAgentFactory();
        if (factory == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/client/auth/pubkey/UserAuthPublicKeyIterator.java`
#### Snippet
```java
        agent = factory.createClient(session, manager);
        if (agent == null) {
            return null;
        }
        return new Iterable<KeyAgentIdentity>() {
```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/client/auth/pubkey/UserAuthPublicKeyFactory.java`
#### Snippet
```java
        @Override
        public List<NamedFactory<Signature>> getSignatureFactories() {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/client/auth/BuiltinUserAuthFactories.java`
#### Snippet
```java
    public static UserAuthFactory resolveFactory(String name) {
        if (GenericUtils.isEmpty(name)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/client/auth/BuiltinUserAuthFactories.java`
#### Snippet
```java
        Factory<UserAuthFactory> factory = NamedResource.findByName(name, String.CASE_INSENSITIVE_ORDER, VALUES);
        if (factory == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/client/auth/keyboard/UserInteraction.java`
#### Snippet
```java
     */
    default String resolveAuthPasswordAttempt(ClientSession session) throws Exception {
        return null;
    }

```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/client/auth/keyboard/UserInteraction.java`
#### Snippet
```java
     */
    default KeyPair resolveAuthPublicKeyIdentityAttempt(ClientSession session) throws Exception {
        return null;
    }

```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/client/auth/hostbased/UserAuthHostBasedFactory.java`
#### Snippet
```java
        @Override
        public HostKeyIdentityProvider getClientHostKeys() {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/client/auth/hostbased/UserAuthHostBasedFactory.java`
#### Snippet
```java
        @Override
        public String getClientHostname() {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/client/auth/hostbased/UserAuthHostBasedFactory.java`
#### Snippet
```java
        @Override
        public List<NamedFactory<Signature>> getSignatureFactories() {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/client/auth/hostbased/UserAuthHostBasedFactory.java`
#### Snippet
```java
        @Override
        public String getClientUsername() {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/client/future/DefaultAuthFuture.java`
#### Snippet
```java
            return (Throwable) v;
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/client/future/DefaultOpenFuture.java`
#### Snippet
```java
            return (Throwable) v;
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/client/auth/password/UserAuthPassword.java`
#### Snippet
```java
                        maxAttempts);
            }
            return null;
        }
        UserInteraction ui = session.getUserInteraction();
```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/client/auth/password/UserAuthPassword.java`
#### Snippet
```java
        UserInteraction ui = session.getUserInteraction();
        if ((ui == null) || (!ui.isInteractionAllowed(session))) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/client/future/DefaultConnectFuture.java`
#### Snippet
```java
            return (ClientSession) v;
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/client/future/DefaultConnectFuture.java`
#### Snippet
```java
            return (Throwable) v;
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/client/auth/keyboard/UserAuthKeyboardInteractive.java`
#### Snippet
```java
            return passwords.next();
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/client/auth/keyboard/UserAuthKeyboardInteractive.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/client/auth/pubkey/UserAuthPublicKey.java`
#### Snippet
```java
            KeyPair keyPair, String keyType)
            throws Exception {
        return null;
    }

```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/client/auth/pubkey/UserAuthPublicKey.java`
#### Snippet
```java
        UserInteraction ui = session.getUserInteraction();
        if ((ui == null) || (!ui.isInteractionAllowed(session))) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/client/auth/pubkey/UserAuthPublicKey.java`
#### Snippet
```java
        KeyPair kp = ui.resolveAuthPublicKeyIdentityAttempt(session);
        if (kp == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/client/SshClient.java`
#### Snippet
```java
    public String removePasswordIdentity(String password) {
        if (GenericUtils.isEmpty(password)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/client/SshClient.java`
#### Snippet
```java
            return (String) identities.remove(index);
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/client/SshClient.java`
#### Snippet
```java
    public KeyPair removePublicKeyIdentity(KeyPair kp) {
        if (kp == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/client/SshClient.java`
#### Snippet
```java
            return (KeyPair) identities.remove(index);
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/common/ServiceFactory.java`
#### Snippet
```java
        ServiceFactory factory = NamedResource.findByName(name, String.CASE_INSENSITIVE_ORDER, factories);
        if (factory == null) {
            return null;
        } else {
            return factory.create(session);
```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/common/FactoryManager.java`
#### Snippet
```java
    static <T> T resolveAttribute(FactoryManager manager, AttributeRepository.AttributeKey<T> key) {
        Objects.requireNonNull(key, "No key");
        return (manager == null) ? null : manager.getAttribute(key);
    }
}
```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/common/io/BuiltinIoServiceFactoryFactories.java`
#### Snippet
```java
    public static BuiltinIoServiceFactoryFactories fromFactoryClass(Class<?> clazz) {
        if ((clazz == null) || (!IoServiceFactoryFactory.class.isAssignableFrom(clazz))) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/common/io/BuiltinIoServiceFactoryFactories.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/common/io/AbstractIoServiceFactoryFactory.java`
#### Snippet
```java

    protected CloseableExecutorService newExecutor() {
        return executorServiceFactory != null ? executorServiceFactory.create() : null;
    }
}
```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/common/io/nio2/Nio2CompletionHandler.java`
#### Snippet
```java
        AccessController.doPrivileged((PrivilegedAction<Object>) () -> {
            onCompleted(result, attachment);
            return null;
        });
    }
```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/common/io/nio2/Nio2CompletionHandler.java`
#### Snippet
```java
        AccessController.doPrivileged((PrivilegedAction<Object>) () -> {
            onFailed(exc, attachment);
            return null;
        });
    }
```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/common/io/DefaultIoServiceFactoryFactory.java`
#### Snippet
```java
        int numDetected = services.size();
        if (numDetected <= 0) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/common/io/DefaultIoServiceFactoryFactory.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/common/io/nio2/Nio2Connector.java`
#### Snippet
```java
        public IoSession getSession() {
            Object v = getValue();
            return v instanceof IoSession ? (IoSession) v : null;
        }

```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/common/io/nio2/Nio2Connector.java`
#### Snippet
```java
        public Throwable getException() {
            Object v = getValue();
            return v instanceof Throwable ? (Throwable) v : null;
        }

```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/common/kex/DHGroupData.java`
#### Snippet
```java
    public static byte[] getOakleyGroupPrimeValue(String name) {
        byte[] value = OAKLEY_GROUPS.computeIfAbsent(name, DHGroupData::readOakleyGroupPrimeValue);
        return (value == null) ? null : value.clone();
    }

```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/client/keyverifier/KnownHostsServerKeyVerifier.java`
#### Snippet
```java
            ClientSession clientSession, SocketAddress remoteAddress, Collection<HostEntryPair> knownHosts) {
        if (GenericUtils.isEmpty(knownHosts)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/client/keyverifier/KnownHostsServerKeyVerifier.java`
#### Snippet
```java

        if (GenericUtils.isEmpty(candidates)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/client/keyverifier/KnownHostsServerKeyVerifier.java`
#### Snippet
```java
        }

        return null; // no match found
    }

```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/client/keyverifier/KnownHostsServerKeyVerifier.java`
#### Snippet
```java
    protected NamedFactory<Mac> getHostValueDigester(
            ClientSession clientSession, SocketAddress remoteAddress, SshdSocketAddress hostIdentity) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/client/keyverifier/KnownHostsServerKeyVerifier.java`
#### Snippet
```java
            }

            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/client/keyverifier/KnownHostsServerKeyVerifier.java`
#### Snippet
```java
        Collection<SshdSocketAddress> patterns = resolveHostNetworkIdentities(clientSession, remoteAddress);
        if (GenericUtils.isEmpty(patterns)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/client/keyverifier/KnownHostsServerKeyVerifier.java`
#### Snippet
```java
            throws IOException, GeneralSecurityException {
        if (entry == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/common/future/DefaultKeyExchangeFuture.java`
#### Snippet
```java
            return (Throwable) v;
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/common/future/GlobalRequestFuture.java`
#### Snippet
```java
            return (Buffer) value;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/common/future/GlobalRequestFuture.java`
#### Snippet
```java
            return (Throwable) value;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/common/channel/RequestHandler.java`
#### Snippet
```java
        public static Result fromName(String name) {
            if (GenericUtils.isEmpty(name)) {
                return null;
            }

```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/common/channel/RequestHandler.java`
#### Snippet
```java
            }

            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/common/kex/BuiltinDHFactories.java`
#### Snippet
```java
    public static DHFactory resolveFactory(String name) {
        if (GenericUtils.isEmpty(name)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/common/kex/BuiltinDHFactories.java`
#### Snippet
```java
    public static DHFactory unregisterExtension(String name) {
        if (GenericUtils.isEmpty(name)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/client/session/AbstractClientSession.java`
#### Snippet
```java
    public KeyPair removePublicKeyIdentity(KeyPair kp) {
        if (kp == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/client/session/AbstractClientSession.java`
#### Snippet
```java
            return (KeyPair) identities.remove(index);
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/client/session/AbstractClientSession.java`
#### Snippet
```java
    public String removePasswordIdentity(String password) {
        if (GenericUtils.isEmpty(password)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/client/session/AbstractClientSession.java`
#### Snippet
```java
            return (String) identities.remove(index);
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/common/channel/ChannelAsyncInputStream.java`
#### Snippet
```java
                return (Throwable) v;
            } else {
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/common/channel/ChannelAsyncInputStream.java`
#### Snippet
```java
        @Override
        public Buffer getBuffer() {
            return isDone() ? buffer : null;
        }

```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/common/channel/Channel.java`
#### Snippet
```java
        Objects.requireNonNull(key, "No key");
        if (channel == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/common/channel/ChannelFactory.java`
#### Snippet
```java
            return f.createChannel(session);
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/common/channel/ChannelAsyncOutputStream.java`
#### Snippet
```java
            }
            future.setValue(Boolean.TRUE);
            return null;
        }
        Channel channel = getChannel();
```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/common/channel/ChannelAsyncOutputStream.java`
#### Snippet
```java
            }
            f.setValue(e);
            return null;
        }
        IoWriteFutureImpl thisFuture = f;
```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/common/channel/ChannelAsyncOutputStream.java`
#### Snippet
```java
        writeFuture.addListener(w -> onWritten(thisFuture, stillToSend, chunkLength, w));
        // If something remains it will be written via the listener we just added.
        return null;
    }

```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/common/forward/LocalForwardingEntry.java`
#### Snippet
```java
            String host, boolean anyLocalAddress, int port, Collection<? extends LocalForwardingEntry> entries) {
        if ((port <= 0) || (GenericUtils.isEmpty(entries))) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/common/forward/LocalForwardingEntry.java`
#### Snippet
```java

        if (GenericUtils.isEmpty(host) && (!anyLocalAddress)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/common/forward/LocalForwardingEntry.java`
#### Snippet
```java
        }

        return null; // no match found
    }
}
```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/common/channel/BufferedIoOutputStream.java`
#### Snippet
```java
            // No more pending requests
            if (future == null) {
                return null;
            }

```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/common/channel/BufferedIoOutputStream.java`
#### Snippet
```java

                writes.clear();
                return null;
            }

```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/common/channel/BufferedIoOutputStream.java`
#### Snippet
```java
            // Cannot honor this request yet since other pending one incomplete
            if (!currentWrite.compareAndSet(null, future)) {
                return null;
            }

```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/common/session/ReservedSessionMessagesHandler.java`
#### Snippet
```java
            Session session, String version, List<String> extraLines)
            throws Exception {
        return null;
    }

```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/common/session/ReservedSessionMessagesHandler.java`
#### Snippet
```java
            Session session, Map<KexProposalOption, String> proposal, Buffer packet)
            throws Exception {
        return null;
    }

```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/common/channel/AbstractChannel.java`
#### Snippet
```java
                log.debug("sendEof({}) already closing or closed - state={}", this, state);
            }
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/common/channel/AbstractChannel.java`
#### Snippet
```java
                log.debug("sendEof({}) already sent (state={})", this, channelState);
            }
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/common/channel/AbstractChannel.java`
#### Snippet
```java
    protected Date addPendingRequest(String request, boolean wantReply) {
        if (!wantReply) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/common/session/Session.java`
#### Snippet
```java
        Objects.requireNonNull(key, "No key");
        if (session == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/common/session/Session.java`
#### Snippet
```java
    default SocketAddress getLocalAddress() {
        IoSession s = getIoSession();
        return (s == null) ? null : s.getLocalAddress();
    }

```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/common/session/Session.java`
#### Snippet
```java
    default SocketAddress getRemoteAddress() {
        IoSession s = getIoSession();
        return (s == null) ? null : s.getRemoteAddress();
    }

```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/ReservedSessionMessagesHandlerAdapter.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/server/AbstractSftpSubsystemHelper.java`
#### Snippet
```java
    protected Path normalize(Path f) {
        if (f == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/server/AbstractSftpSubsystemHelper.java`
#### Snippet
```java
                        new SftpException(SftpConstants.SSH_FX_FILE_IS_A_DIRECTORY, p.toString() + " is a folder"), false);
            }
            return null;
        });
        // File exists and is not a directory
```

### ReturnNull
Return of `null`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/server/AbstractSftpSubsystemHelper.java`
#### Snippet
```java
        } catch (IOException e) {
            handleUserPrincipalLookupServiceException(GroupPrincipal.class, name.toString(), e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/server/AbstractSftpSubsystemHelper.java`
#### Snippet
```java
                }
            }
            return null;
        });
        // Directory does not exist yet
```

### ReturnNull
Return of `null`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/server/AbstractSftpSubsystemHelper.java`
#### Snippet
```java
            sendStatus(prepareReply(buffer), id, failureOpcode,
                    "Proposed version (" + proposed + ") not in supported range: " + available);
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/server/AbstractSftpSubsystemHelper.java`
#### Snippet
```java
        Map.Entry<Integer, String> result = checkVersionCompatibility(buffer, id, proposed, SftpConstants.SSH_FX_FAILURE);
        if (result == null) { // validation failed
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/server/AbstractSftpSubsystemHelper.java`
#### Snippet
```java
        } catch (IOException e) {
            handleUserPrincipalLookupServiceException(UserPrincipal.class, name.toString(), e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/DefaultUnknownChannelReferenceHandler.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/server/ServerBuilder.java`
#### Snippet
```java
    @SuppressWarnings("checkstyle:Indentation")
    public static final Function<DHFactory, KeyExchangeFactory> DH2KEX = factory -> factory == null
            ? null
            : factory.isGroupExchange()
                    ? DHGEXServer.newFactory(factory)
```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/common/forward/DefaultForwarder.java`
#### Snippet
```java
                    log.debug("localPortForwardingRequested({})[{}][haveFilter={}] rejected", session, local, filter != null);
                }
                return null;
            }
        } catch (Error e) {
```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/KeyExchangeMessageHandler.java`
#### Snippet
```java
        updateState(() -> {
            update.run();
            return null;
        });
    }
```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/AbstractConnectionService.java`
#### Snippet
```java

        Session s = getSession();
        return (s == null) ? null : s.resolveUnknownChannelReferenceHandler();
    }

```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/server/x11/DefaultX11ForwardSupport.java`
#### Snippet
```java
                        authenticationProtocol, authenticationCookie, screen);
            }
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/server/x11/DefaultX11ForwardSupport.java`
#### Snippet
```java
            }

            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/server/x11/DefaultX11ForwardSupport.java`
#### Snippet
```java
            warn("createDisplay({}) failed ({}) run xauth: {}",
                    authDisplay, e.getClass().getSimpleName(), e.getMessage(), e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/AbstractConnectionService.java`
#### Snippet
```java

        if ((heartbeatType == null) || (heartbeatType == HeartbeatType.NONE) || (GenericUtils.isNegativeOrNull(interval))) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/server/auth/BuiltinUserAuthFactories.java`
#### Snippet
```java
    public static UserAuthFactory resolveFactory(String name) {
        if (GenericUtils.isEmpty(name)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/server/auth/BuiltinUserAuthFactories.java`
#### Snippet
```java
        Factory<UserAuthFactory> factory = NamedResource.findByName(name, String.CASE_INSENSITIVE_ORDER, VALUES);
        if (factory == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/server/auth/pubkey/UserAuthPublicKeyFactory.java`
#### Snippet
```java
        @Override
        public List<NamedFactory<Signature>> getSignatureFactories() {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/server/auth/keyboard/KeyboardInteractiveAuthenticator.java`
#### Snippet
```java
                ServerSession session, String username, String lang, String subMethods)
                throws Exception {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/server/auth/keyboard/DefaultKeyboardInteractiveAuthenticator.java`
#### Snippet
```java
                log.debug("generateChallenge({})[{}] no password authenticator", session, username);
            }
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/server/auth/gss/UserAuthGSS.java`
#### Snippet
```java
                session.writePacket(b);

                return null;
            }

```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/server/auth/gss/UserAuthGSS.java`
#### Snippet
```java
                    b.putBytes(out);
                    session.writePacket(b);
                    return null;
                } else {
                    return established;
```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/server/auth/gss/UserAuthGSS.java`
#### Snippet
```java
        } catch (GSSException e) {
            // won't happen
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/server/auth/keyboard/UserAuthKeyboardInteractive.java`
#### Snippet
```java
        challenge.append(buffer);
        session.writePacket(buffer);
        return null;
    }

```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/server/auth/password/UserAuthPassword.java`
#### Snippet
```java
        buffer.putString(lang);
        session.writePacket(buffer);
        return null; // authentication incomplete
    }
}
```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/server/shell/ShellFactorySelector.java`
#### Snippet
```java
            throws IOException {
        if (GenericUtils.isEmpty(selectors)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/server/shell/ShellFactorySelector.java`
#### Snippet
```java
        }

        return null;
    }
}
```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/server/auth/hostbased/UserAuthHostBasedFactory.java`
#### Snippet
```java
        @Override
        public List<NamedFactory<Signature>> getSignatureFactories() {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/server/config/AllowTcpForwardingValue.java`
#### Snippet
```java
    public static AllowTcpForwardingValue fromString(String s) {
        if (GenericUtils.isEmpty(s)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/server/config/AllowTcpForwardingValue.java`
#### Snippet
```java
        }

        return null;
    }
}
```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/server/auth/pubkey/UserAuthPublicKey.java`
#### Snippet
```java
        if (!hasSig) {
            sendPublicKeyResponse(session, username, alg, key, buffer.array(), oldPos, 4 + len, buffer);
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/server/config/SshServerConfigFileReader.java`
#### Snippet
```java
            return "Welcome to SSHD\n";
        } else if (PropertyResolverUtils.isNoneValue(bannerOption)) {
            return null;
        } else if (CoreModuleProperties.AUTO_WELCOME_BANNER_VALUE.equalsIgnoreCase(bannerOption)) {
            return bannerOption;
```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/server/config/SshServerConfigFileReader.java`
#### Snippet
```java
            return Paths.get(bannerOption);
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/server/config/keys/ServerIdentity.java`
#### Snippet
```java
                || (!name.startsWith(ID_FILE_PREFIX))
                || (!name.endsWith(ID_FILE_SUFFIX))) {
            return null;
        } else {
            return name.substring(ID_FILE_PREFIX.length(), name.length() - ID_FILE_SUFFIX.length());
```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/server/global/OpenSshHostKeysHandler.java`
#### Snippet
```java
        @Override
        public List<NamedFactory<Signature>> getSignatureFactories() {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/server/forward/TcpForwardingFilter.java`
#### Snippet
```java
        public static Type fromEnumName(String name) {
            if (GenericUtils.isEmpty(name)) {
                return null;
            }

```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/server/forward/TcpForwardingFilter.java`
#### Snippet
```java
            }

            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/server/forward/TcpForwardingFilter.java`
#### Snippet
```java
        public static Type fromString(String name) {
            if (GenericUtils.isEmpty(name)) {
                return null;
            }

```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/server/subsystem/SubsystemFactory.java`
#### Snippet
```java
            return factory.createSubsystem(channel);
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/server/forward/TcpipServerChannel.java`
#### Snippet
```java
        @Override
        public CloseableExecutorService getExecutorService() {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/server/forward/TcpipServerChannel.java`
#### Snippet
```java
                    protected CloseFuture doCloseGracefully() {
                        executor.submit(() -> connector.close(false));
                        return null;
                    }

```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/server/session/ServerUserAuthService.java`
#### Snippet
```java
        Object bannerValue = CoreModuleProperties.WELCOME_BANNER.getOrNull(this);
        if (bannerValue == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/server/session/ServerUserAuthService.java`
#### Snippet
```java
            String message = bannerValue.toString();
            if (GenericUtils.isEmpty(message)) {
                return null;
            }

```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/server/session/ServerUserAuthService.java`
#### Snippet
```java
                    log.debug("resolveWelcomeBanner({}) file is empty/does not exist {}", session, path);
                }
                return null;
            }
            bannerValue = path.toUri();
```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/server/session/ServerUserAuthService.java`
#### Snippet
```java
                log.debug("sendWelcomeBanner({}) already sent", session);
            }
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/server/session/ServerUserAuthService.java`
#### Snippet
```java
        String welcomeBanner = resolveWelcomeBanner(session);
        if (GenericUtils.isEmpty(welcomeBanner)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/server/session/AbstractServerSession.java`
#### Snippet
```java
        return (this.currentService instanceof ConnectionService)
                ? (ConnectionService) this.currentService
                : null;
    }
}
```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/server/session/AbstractServerSession.java`
#### Snippet
```java
                    this, provided, supported);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/server/session/AbstractServerSession.java`
#### Snippet
```java
        String keyType = KeyUtils.getCanonicalKeyType(proposedKey);
        if (GenericUtils.isEmpty(keyType)) {
            return null;    // OK if not negotiated yet
        }

```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/server/channel/ChannelSession.java`
#### Snippet
```java
    protected Command prepareCommand(String requestType, Command command) throws IOException {
        if (command == null) {
            return null;
        }
        // Add the user
```

### ReturnNull
Return of `null`
in `sshd-scp/src/main/java/org/apache/sshd/scp/client/SimpleScpClientImpl.java`
#### Snippet
```java

            ExceptionUtils.rethrowAsIoException(e);
            return null;    // actually dead code...
        }
    }
```

### ReturnNull
Return of `null`
in `sshd-scp/src/main/java/org/apache/sshd/scp/common/ScpLocation.java`
#### Snippet
```java
     */
    public static ScpLocation parse(String locSpec) {
        return GenericUtils.isEmpty(locSpec) ? null : update(locSpec, new ScpLocation());
    }

```

### ReturnNull
Return of `null`
in `sshd-scp/src/main/java/org/apache/sshd/scp/common/helpers/ScpReceiveFileCommandDetails.java`
#### Snippet
```java

    public static ScpReceiveFileCommandDetails parse(String header) {
        return GenericUtils.isEmpty(header) ? null : new ScpReceiveFileCommandDetails(header);
    }
}
```

### ReturnNull
Return of `null`
in `sshd-scp/src/main/java/org/apache/sshd/scp/common/helpers/ScpTimestampCommandDetails.java`
#### Snippet
```java
     */
    public static ScpTimestampCommandDetails parse(String line) throws NumberFormatException {
        return GenericUtils.isEmpty(line) ? null : new ScpTimestampCommandDetails(line);
    }
}
```

### ReturnNull
Return of `null`
in `sshd-scp/src/main/java/org/apache/sshd/scp/common/helpers/ScpReceiveDirCommandDetails.java`
#### Snippet
```java

    public static ScpReceiveDirCommandDetails parse(String header) {
        return GenericUtils.isEmpty(header) ? null : new ScpReceiveDirCommandDetails(header);
    }
}
```

### ReturnNull
Return of `null`
in `sshd-scp/src/main/java/org/apache/sshd/scp/common/helpers/ScpAckInfo.java`
#### Snippet
```java
        if (statusCode == -1) {
            if (canEof) {
                return null;
            }
            throw new EOFException("readAck - EOF before ACK");
```

### ReturnNull
Return of `null`
in `sshd-scp/src/main/java/org/apache/sshd/scp/common/helpers/ScpIoUtils.java`
#### Snippet
```java
                        throw new EOFException("EOF while await end of line");
                    }
                    return null;
                } else {
                    baos.write(c);
```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/AbstractSession.java`
#### Snippet
```java
     */
    protected KeyExchangeFuture checkRekey() throws Exception {
        return isRekeyRequired() ? requestNewKeysExchange() : null;
    }

```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/AbstractSession.java`
#### Snippet
```java
    protected byte[] getClientKexData() {
        synchronized (kexState) {
            return (clientKexData == null) ? null : clientKexData.clone();
        }
    }
```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/AbstractSession.java`
#### Snippet
```java
    protected IoWriteFuture notImplemented(int cmd, Buffer buffer) throws Exception {
        if (doInvokeUnimplementedMessageHandler(cmd, buffer)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/AbstractSession.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/AbstractSession.java`
#### Snippet
```java
            }

            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/AbstractSession.java`
#### Snippet
```java
            ThreadUtils.runAsInternal(() -> {
                doHandleMessage(buffer);
                return null;
            });
        } catch (Throwable e) {
```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/AbstractSession.java`
#### Snippet
```java
    public String getNegotiatedKexParameter(KexProposalOption paramType) {
        if (paramType == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/AbstractSession.java`
#### Snippet
```java
    protected byte[] getServerKexData() {
        synchronized (kexState) {
            return (serverKexData == null) ? null : serverKexData.clone();
        }
    }
```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/AbstractSession.java`
#### Snippet
```java
        } catch (Exception e) {
            ExceptionUtils.rethrowAsIoException(e);
            return null;    // actually dead code
        }

```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/AbstractSession.java`
#### Snippet
```java
                            SshConstants.getCommandMessageName(((GlobalRequestException) result).getCode()));
                }
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/AbstractSession.java`
#### Snippet
```java
            return (Buffer) result;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `sshd-scp/src/main/java/org/apache/sshd/scp/common/helpers/ScpDirEndCommandDetails.java`
#### Snippet
```java
    public static ScpDirEndCommandDetails parse(String header) {
        if (GenericUtils.isEmpty(header)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `sshd-scp/src/main/java/org/apache/sshd/scp/server/InputStreamReader.java`
#### Snippet
```java
    public String getEncoding() {
        if (!isOpen()) {
            return null;
        }
        return decoder.charset().name();
```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/SessionHelper.java`
#### Snippet
```java
            return new TimeoutIndicator(TimeoutStatus.IdleTimeout, idleTimeout, d);
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/SessionHelper.java`
#### Snippet
```java
            return new TimeoutIndicator(TimeoutStatus.AuthTimeout, authTimeout, d);
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/SessionHelper.java`
#### Snippet
```java
    public SshdSocketAddress getBoundRemotePortForward(int port) {
        Forwarder forwarder = getForwarder();
        return (forwarder == null) ? null : forwarder.getBoundRemotePortForward(port);
    }

```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/SessionHelper.java`
#### Snippet
```java
                    // Need more data, so undo reading and return null
                    buffer.rpos(rpos);
                    return null;
                }

```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/SessionHelper.java`
#### Snippet
```java

        IoSession s = getIoSession();
        return (s == null) ? null : s.getRemoteAddress();
    }

```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/SessionHelper.java`
#### Snippet
```java

        FactoryManager mgr = getFactoryManager();
        return (mgr == null) ? null : mgr.resolveUnknownChannelReferenceHandler();
    }

```

### ReturnNull
Return of `null`
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/SessionHelper.java`
#### Snippet
```java
    protected Forwarder getForwarder() {
        ConnectionService service = getConnectionService();
        return (service == null) ? null : service.getForwarder();
    }

```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `cert` is redundant
in `sshd-common/src/main/java/org/apache/sshd/common/config/keys/impl/OpenSSHCertificateDecoder.java`
#### Snippet
```java
        buffer.putRawBytes(IoUtils.toByteArray(keyData));
        buffer.getString(); // Skip the key type just prepended
        OpenSshCertificate cert = OpenSSHCertPublicKeyParser.INSTANCE.getRawPublicKey(keyType, buffer);

        return cert;
```

### UnnecessaryLocalVariable
Local variable `v` is redundant
in `sshd-common/src/main/java/org/apache/sshd/common/channel/SttySupport.java`
#### Snippet
```java
            }
            if (val.length() == 2 && val.charAt(0) == '^') {
                int v = (val.charAt(1) - 'A' + 129) % 128;
                return v;
            } else {
```

### UnnecessaryLocalVariable
Local variable `result` is redundant
in `sshd-common/src/main/java/org/apache/sshd/common/channel/SttySupport.java`
#### Snippet
```java
            p.waitFor();

            String result = new String(bout.toByteArray(), Charset.defaultCharset());
            return result;
        }
```

### UnnecessaryLocalVariable
Local variable `opt` is redundant
in `sshd-cli/src/main/java/org/apache/sshd/cli/client/SshClientCliSupport.java`
#### Snippet
```java
                }
            } else if ("-o".equals(argName)) {
                String opt = argVal;
                int idx = opt.indexOf('=');
                if (idx <= 0) {
```

### UnnecessaryLocalVariable
Local variable `channel` is redundant
in `sshd-core/src/main/java/org/apache/sshd/agent/unix/ChannelAgentForwardingFactory.java`
#### Snippet
```java
    public Channel createChannel(Session session) throws IOException {
        CloseableExecutorService executorService = executorServiceFactory != null ? executorServiceFactory.create() : null;
        ChannelAgentForwarding channel = new ChannelAgentForwarding(executorService);
        return channel;
    }
```

### UnnecessaryLocalVariable
Local variable `pos` is redundant
in `sshd-core/src/main/java/org/apache/sshd/client/channel/ChannelSession.java`
#### Snippet
```java
            if (out == null) {
                ChannelPipedInputStream pis = new ChannelPipedInputStream(this, wLocal);
                ChannelPipedOutputStream pos = new ChannelPipedOutputStream(pis);
                out = pos;
                invertedOut = pis;
```

### UnnecessaryLocalVariable
Local variable `pos` is redundant
in `sshd-core/src/main/java/org/apache/sshd/client/channel/ChannelSession.java`
#### Snippet
```java
                } else {
                    ChannelPipedInputStream pis = new ChannelPipedInputStream(this, wLocal);
                    ChannelPipedOutputStream pos = new ChannelPipedOutputStream(pis);
                    err = pos;
                    invertedErr = pis;
```

### UnnecessaryLocalVariable
Local variable `result` is redundant
in `sshd-core/src/main/java/org/apache/sshd/common/kex/MontgomeryCurve.java`
#### Snippet
```java
        // Per the ASN.1 of SubjectPublicKeyInfo, the key must be the last keySize bytes of the X.509 encoding
        byte[] subjectPublicKeyInfo = key.getEncoded();
        byte[] result = Arrays.copyOfRange(subjectPublicKeyInfo, subjectPublicKeyInfo.length - getKeySize(),
                subjectPublicKeyInfo.length);
        return result;
```

### UnnecessaryLocalVariable
Local variable `boundAddress` is redundant
in `sshd-core/src/main/java/org/apache/sshd/common/forward/DefaultForwarder.java`
#### Snippet
```java
            }

            InetSocketAddress boundAddress = (InetSocketAddress) GenericUtils.head(after);
            return boundAddress;
        } catch (IOException bindErr) {
```

### UnnecessaryLocalVariable
Local variable `future` is redundant
in `sshd-core/src/main/java/org/apache/sshd/common/session/helpers/AbstractSession.java`
#### Snippet
```java
            Buffer packet = resolveOutputPacket(buffer);
            IoSession networkSession = getIoSession();
            IoWriteFuture future = networkSession.writeBuffer(packet);
            return future;
        }
```

## RuleId[id=BusyWait]
### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `sshd-core/src/main/java/org/apache/sshd/server/shell/InvertedShellWrapper.java`
#### Snippet
```java
                // input streams are not selectable for nio, and any other blocking
                // method would consume at least two threads
                Thread.sleep(pumpSleepTime.toMillis());
            }
        } catch (Throwable e) {
```

## RuleId[id=ThrowableNotThrown]
### ThrowableNotThrown
Result of `closeQuietly()` not thrown
in `sshd-core/src/main/java/org/apache/sshd/client/channel/AbstractClientChannel.java`
#### Snippet
```java
                        gracefulFuture.setClosed();
                    }
                    IoUtils.closeQuietly(in, out, err);
                    IoUtils.closeQuietly(invertedIn);
                    // Don't close invertedOut and invertedErr; it's the application's business to do so!
```

### ThrowableNotThrown
Result of `closeQuietly()` not thrown
in `sshd-core/src/main/java/org/apache/sshd/client/channel/AbstractClientChannel.java`
#### Snippet
```java
                    }
                    IoUtils.closeQuietly(in, out, err);
                    IoUtils.closeQuietly(invertedIn);
                    // Don't close invertedOut and invertedErr; it's the application's business to do so!
                })
```

### ThrowableNotThrown
Result of `closeQuietly()` not thrown
in `sshd-core/src/main/java/org/apache/sshd/common/channel/SimpleIoOutputStream.java`
#### Snippet
```java
    @Override
    protected void doCloseImmediately() {
        IoUtils.closeQuietly(os);
        super.doCloseImmediately();
    }
```

## RuleId[id=WaitNotInLoop]
### WaitNotInLoop
Call to `wait()` is not in loop
in `sshd-sftp/src/main/java/org/apache/sshd/sftp/client/impl/DefaultSftpClient.java`
#### Snippet
```java
            if (GenericUtils.isPositive(idleTimeout)) {
                try {
                    messages.wait(idleTimeout.toMillis(), idleTimeout.getNano() % 1_000_000);
                } catch (InterruptedException e) {
                    throw (IOException) new InterruptedIOException("Interrupted while waiting for messages").initCause(e);
```

## RuleId[id=CastCanBeRemovedNarrowingVariableType]
### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'session' to 'ServerSession'
in `sshd-core/src/main/java/org/apache/sshd/server/channel/ChannelSession.java`
#### Snippet
```java
        // If the shell wants to be aware of the session, let's do that
        if (command instanceof ServerSessionAware) {
            ((ServerSessionAware) command).setSession((ServerSession) session);
        }
        if (command instanceof ChannelSessionAware) {
```

### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'session' to 'ServerSession'
in `sshd-core/src/main/java/org/apache/sshd/server/channel/ChannelSession.java`
#### Snippet
```java
        // If the shell wants to be aware of the file system, let's do that too
        if (command instanceof FileSystemAware) {
            ServerFactoryManager manager = ((ServerSession) session).getFactoryManager();
            FileSystemFactory factory = manager.getFileSystemFactory();
            ((FileSystemAware) command).setFileSystemFactory(factory, session);
```

