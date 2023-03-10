# kapua 
 
# Bad smells
I found 1990 bad smells with 384 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryModifier | 225 | true |
| BoundedWildcard | 202 | false |
| ReturnNull | 197 | false |
| UnnecessaryFullyQualifiedName | 177 | false |
| RedundantImplements | 110 | false |
| DefaultAnnotationParam | 93 | false |
| DataFlowIssue | 68 | false |
| NonProtectedConstructorInAbstractClass | 67 | true |
| SynchronizeOnThis | 63 | false |
| ZeroLengthArrayInitialization | 48 | false |
| UnusedAssignment | 45 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 31 | false |
| DeprecatedIsStillUsed | 30 | false |
| SetReplaceableByEnumSet | 30 | false |
| CodeBlock2Expr | 28 | true |
| AssignmentToMethodParameter | 27 | false |
| DynamicRegexReplaceableByCompiledPattern | 26 | false |
| AssignmentToStaticFieldFromInstanceMethod | 25 | false |
| SizeReplaceableByIsEmpty | 23 | true |
| UNUSED_IMPORT | 22 | false |
| CallToStringConcatCanBeReplacedByOperator | 19 | false |
| UnnecessaryBoxing | 18 | false |
| UnstableApiUsage | 17 | false |
| Convert2MethodRef | 17 | false |
| EmptyMethod | 16 | false |
| ConstantValue | 16 | false |
| NonFinalFieldOfException | 15 | false |
| DoubleCheckedLocking | 14 | false |
| ObsoleteCollection | 12 | false |
| CommentedOutCode | 11 | false |
| UnnecessaryLocalVariable | 10 | true |
| DuplicateThrows | 9 | false |
| UnnecessarySemicolon | 9 | false |
| StringOperationCanBeSimplified | 9 | false |
| CatchMayIgnoreException | 9 | false |
| BusyWait | 8 | false |
| ExceptionNameDoesntEndWithException | 8 | false |
| Convert2Lambda | 8 | false |
| ClassNameSameAsAncestorName | 7 | false |
| RedundantMethodOverride | 7 | false |
| WaitNotInLoop | 7 | false |
| NonSerializableFieldInSerializableClass | 7 | false |
| EqualsWithItself | 6 | false |
| EqualsBetweenInconvertibleTypes | 6 | false |
| MismatchedCollectionQueryUpdate | 6 | false |
| NonStrictComparisonCanBeEquality | 6 | true |
| DuplicateExpressions | 6 | false |
| RegExpRedundantEscape | 5 | false |
| IntegerMultiplicationImplicitCastToLong | 5 | false |
| NestedAssignment | 5 | false |
| OptionalUsedAsFieldOrParameterType | 5 | false |
| InstanceofCatchParameter | 5 | false |
| UnnecessaryToStringCall | 5 | true |
| InnerClassMayBeStatic | 5 | true |
| ThrowableNotThrown | 5 | false |
| ToArrayCallWithZeroLengthArrayArgument | 4 | true |
| SuspiciousDateFormat | 4 | false |
| WhileCanBeForeach | 4 | false |
| UnnecessaryCallToStringValueOf | 4 | false |
| SamePackageImport | 4 | false |
| AssignmentToLambdaParameter | 4 | false |
| DuplicateBranchesInSwitch | 4 | false |
| StringBufferReplaceableByString | 4 | false |
| TypeParameterExtendsObject | 4 | false |
| AssignmentToForLoopParameter | 4 | false |
| StringEqualsEmptyString | 4 | false |
| ThrowablePrintStackTrace | 4 | false |
| EqualsWhichDoesntCheckParameterClass | 4 | false |
| IgnoreResultOfCall | 3 | false |
| SimplifyStreamApiCallChains | 3 | false |
| PointlessBooleanExpression | 3 | true |
| RedundantArrayCreation | 3 | true |
| UnnecessaryReturn | 3 | true |
| MissortedModifiers | 3 | false |
| UnnecessarySuperQualifier | 3 | false |
| UseOfPropertiesAsHashtable | 3 | false |
| RedundantStringFormatCall | 3 | false |
| FieldMayBeStatic | 3 | false |
| Finalize | 2 | false |
| UnnecessaryQualifierForThis | 2 | false |
| TrivialStringConcatenation | 2 | false |
| ReplaceAssignmentWithOperatorAssignment | 2 | false |
| SystemOutErr | 2 | false |
| UseBulkOperation | 2 | false |
| AbstractClassNeverImplemented | 2 | false |
| WhileLoopSpinsOnField | 2 | false |
| MalformedFormatString | 2 | false |
| IOResource | 2 | false |
| UtilityClassWithoutPrivateConstructor | 2 | true |
| AbstractMethodCallInConstructor | 2 | false |
| SynchronizeOnNonFinalField | 2 | false |
| CStyleArrayDeclaration | 1 | false |
| ObjectNotify | 1 | false |
| OptionalAssignedToNull | 1 | false |
| IndexOfReplaceableByContains | 1 | false |
| ReplaceInefficientStreamCount | 1 | false |
| SynchronizationOnLocalVariableOrMethodParameter | 1 | false |
| StaticCallOnSubclass | 1 | false |
| ConstantMathCall | 1 | false |
| ManualMinMaxCalculation | 1 | false |
| InstanceofIncompatibleInterface | 1 | false |
| IfStatementWithIdenticalBranches | 1 | false |
| SlowListContainsAll | 1 | false |
| StringBufferReplaceableByStringBuilder | 1 | false |
| NullArgumentToVariableArgMethod | 1 | false |
| NonExceptionNameEndsWithException | 1 | false |
| MethodOverridesStaticMethod | 1 | false |
| RedundantLengthCheck | 1 | false |
| SuspiciousMethodCalls | 1 | false |
| NestedSynchronizedStatement | 1 | false |
| ReplaceNullCheck | 1 | false |
| Anonymous2MethodRef | 1 | false |
| UnnecessaryContinue | 1 | false |
## RuleId[id=EqualsWithItself]
### EqualsWithItself
`equals()` called on itself
in `service/security/test-steps/src/main/java/org/eclipse/kapua/service/authorization/steps/AuthorizationServiceSteps.java`
#### Snippet
```java
            Domain tmpDom1 = domainRegistryService.create(tmpCreator);
            Assert.assertNotNull(tmpDom1);
            Assert.assertTrue(tmpDom1.equals(tmpDom1));
            Assert.assertFalse(tmpDom1.equals(null));
            Assert.assertFalse(tmpDom1.equals(String.valueOf("")));
```

### EqualsWithItself
`equals()` called on itself
in `service/security/test-steps/src/main/java/org/eclipse/kapua/service/authorization/steps/AuthorizationServiceSteps.java`
#### Snippet
```java
        Assert.assertNotNull(role2);
        Assert.assertNotNull(miscObj);
        Assert.assertTrue(role1.equals(role1));
        Assert.assertFalse(role1.equals(null));
        Assert.assertFalse(role1.equals(miscObj));
```

### EqualsWithItself
`equals()` called on itself
in `service/security/test-steps/src/main/java/org/eclipse/kapua/service/authorization/steps/AuthorizationServiceSteps.java`
#### Snippet
```java
        primeException();
        try {
            Assert.assertTrue(accRole1.equals(accRole1));
            Assert.assertFalse(accRole1.equals(null));
            Assert.assertFalse(accRole1.equals(Integer.valueOf(15)));
```

### EqualsWithItself
`equals()` called on itself
in `service/security/test-steps/src/main/java/org/eclipse/kapua/service/authorization/steps/AuthorizationServiceSteps.java`
#### Snippet
```java
        Permission tmpPerm1 = permissionFactory.newPermission(new TestDomain(), Actions.read, SYS_SCOPE_ID, getKapuaId());
        Permission tmpPerm2 = permissionFactory.newPermission(new TestDomain(), Actions.write, SYS_SCOPE_ID, getKapuaId());
        Assert.assertTrue(accPerm1.equals(accPerm1));
        Assert.assertFalse(accPerm1.equals(null));
        Assert.assertFalse(accPerm1.equals(Integer.valueOf(15)));
```

### EqualsWithItself
`equals()` called on itself
in `service/security/test-steps/src/main/java/org/eclipse/kapua/service/authorization/steps/AuthorizationServiceSteps.java`
#### Snippet
```java
        Permission perm1 = permissionFactory.newPermission(new TestDomain("test_domain_1"), Actions.read, getKapuaId(10), getKapuaId(100));
        Permission perm2 = permissionFactory.newPermission(new TestDomain("test_domain_1"), Actions.read, getKapuaId(10), getKapuaId(100));
        Assert.assertTrue(perm1.equals(perm1));
        Assert.assertFalse(perm1.equals(null));
        Assert.assertFalse(perm1.equals(Integer.valueOf(10)));
```

### EqualsWithItself
`equals()` called on itself
in `service/security/test-steps/src/main/java/org/eclipse/kapua/service/authorization/steps/AuthorizationServiceSteps.java`
#### Snippet
```java
        Assert.assertNotNull(perm1);
        Assert.assertNotNull(perm2);
        Assert.assertTrue(perm1.equals(perm1));
        Assert.assertFalse(perm1.equals(null));
        Assert.assertFalse(perm1.equals(miscObj));
```

## RuleId[id=ToArrayCallWithZeroLengthArrayArgument]
### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new UTF8Buffer\[topics.size()\]'
in `client/gateway/provider/fuse/src/main/java/org/eclipse/kapua/client/gateway/mqtt/fuse/FuseChannel.java`
#### Snippet
```java
        }

        connection.unsubscribe(topics.toArray(new UTF8Buffer[topics.size()]), new Promise<>());
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[expectedIssuers.size()\]'
in `plug-ins/sso/openid-connect/provider/src/main/java/org/eclipse/kapua/plugin/sso/openid/provider/jwt/AbstractJwtProcessor.java`
#### Snippet
```java
        List<String> audiences = getJwtAudiences();
        List<String> expectedIssuers = getJwtExpectedIssuers();
        this.expectedIssuers = expectedIssuers.toArray(new String[expectedIssuers.size()]);
        this.audiences = audiences.toArray(new String[audiences.size()]);
        this.timeout = Duration.ofHours(OpenIDSetting.getInstance().getInt(OpenIDSettingKeys.SSO_OPENID_JWT_PROCESSOR_TIMEOUT, 1));
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[audiences.size()\]'
in `plug-ins/sso/openid-connect/provider/src/main/java/org/eclipse/kapua/plugin/sso/openid/provider/jwt/AbstractJwtProcessor.java`
#### Snippet
```java
        List<String> expectedIssuers = getJwtExpectedIssuers();
        this.expectedIssuers = expectedIssuers.toArray(new String[expectedIssuers.size()]);
        this.audiences = audiences.toArray(new String[audiences.size()]);
        this.timeout = Duration.ofHours(OpenIDSetting.getInstance().getInt(OpenIDSettingKeys.SSO_OPENID_JWT_PROCESSOR_TIMEOUT, 1));
    }
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[topics.size()\]'
in `client/gateway/provider/paho/src/main/java/org/eclipse/kapua/client/gateway/mqtt/paho/PahoChannel.java`
#### Snippet
```java
        }

        client.unsubscribe(topics.toArray(new String[topics.size()]));
    }

```

## RuleId[id=Finalize]
### Finalize
'finalize()' should not be overridden
in `broker/client/src/main/java/org/eclipse/kapua/broker/client/pool/JmsProducerWrapper.java`
#### Snippet
```java

    @Override
    protected void finalize() throws Throwable {
        close();
        super.finalize();
```

### Finalize
'finalize()' should not be overridden
in `broker/client/src/main/java/org/eclipse/kapua/broker/client/pool/JmsConsumerWrapper.java`
#### Snippet
```java

    @Override
    protected void finalize() throws Throwable {
        close();
        super.finalize();
```

## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `service/security/registration/simple/src/main/java/org/eclipse/kapua/security/registration/simple/setting/SimpleSettingKeys.java`
#### Snippet
```java
    private String key;

    private SimpleSettingKeys(String key) {
        this.key = key;
    }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `client/gateway/api/src/main/java/org/eclipse/kapua/client/gateway/MessageErrorHandler.java`
#### Snippet
```java
public interface MessageErrorHandler {

    public void handleError(Throwable e);
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `client/gateway/api/src/main/java/org/eclipse/kapua/client/gateway/BinaryPayloadCodec.java`
#### Snippet
```java
     *             if anything goes wrong
     */
    public ByteBuffer encode(Payload payload, ByteBuffer buffer) throws Exception;

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `client/gateway/api/src/main/java/org/eclipse/kapua/client/gateway/BinaryPayloadCodec.java`
#### Snippet
```java
     *             if anything goes wrong
     */
    public Payload decode(ByteBuffer buffer) throws Exception;
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `client/gateway/api/src/main/java/org/eclipse/kapua/client/gateway/Sender.java`
#### Snippet
```java
    public CompletionStage<?> send(Payload payload);

    public default CompletionStage<?> send(final Payload.Builder payload) {
        return send(payload.build());
    }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `client/gateway/api/src/main/java/org/eclipse/kapua/client/gateway/Sender.java`
#### Snippet
```java
public interface Sender {

    public CompletionStage<?> send(Payload payload);

    public default CompletionStage<?> send(final Payload.Builder payload) {
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `client/gateway/api/src/main/java/org/eclipse/kapua/client/gateway/Data.java`
#### Snippet
```java
     *             if anything goes wrong on the subscription process
     */
    public CompletionStage<?> subscribe(MessageHandler handler, ErrorHandler<? extends Throwable> errorHandler) throws Exception;
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `client/gateway/api/src/main/java/org/eclipse/kapua/client/gateway/Application.java`
#### Snippet
```java
    public interface Builder {

        public Application build();
    }

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `client/gateway/api/src/main/java/org/eclipse/kapua/client/gateway/Data.java`
#### Snippet
```java
     *             if anything goes wrong on the subscription process
     */
    public default CompletionStage<?> subscribe(final MessageHandler handler) throws Exception {
        return subscribe(handler, Errors::ignore);
    }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `client/gateway/api/src/main/java/org/eclipse/kapua/client/gateway/ErrorHandler.java`
#### Snippet
```java
public interface ErrorHandler<X extends Throwable> {

    public void handleError(Throwable e, Optional<Payload> payload) throws X;
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `client/gateway/api/src/main/java/org/eclipse/kapua/client/gateway/Application.java`
#### Snippet
```java
     * @return the transport controller
     */
    public Transport transport();
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `client/gateway/api/src/main/java/org/eclipse/kapua/client/gateway/Application.java`
#### Snippet
```java
public interface Application extends AutoCloseable {

    public interface Builder {

        public Application build();
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `client/gateway/api/src/main/java/org/eclipse/kapua/client/gateway/Application.java`
#### Snippet
```java
     * @return the data controller
     */
    public Data data(Topic topic);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `client/gateway/api/src/main/java/org/eclipse/kapua/client/gateway/Client.java`
#### Snippet
```java
     * @return The transport control instance
     */
    public Transport transport();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `client/gateway/api/src/main/java/org/eclipse/kapua/client/gateway/Client.java`
#### Snippet
```java
public interface Client extends AutoCloseable {

    public interface Builder {

        public Client build() throws Exception;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `client/gateway/api/src/main/java/org/eclipse/kapua/client/gateway/Client.java`
#### Snippet
```java
     * @return the new {@link Application.Builder} instance
     */
    public Application.Builder buildApplication(String applicationId);
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `client/gateway/api/src/main/java/org/eclipse/kapua/client/gateway/Client.java`
#### Snippet
```java
    public interface Builder {

        public Client build() throws Exception;
    }

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `client/gateway/api/src/main/java/org/eclipse/kapua/client/gateway/MessageHandler.java`
#### Snippet
```java
public interface MessageHandler {

    public void handleMessage(Payload payload);
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `client/gateway/api/src/main/java/org/eclipse/kapua/client/gateway/Transport.java`
#### Snippet
```java
    public interface Listener {

        public void stateChange(boolean state);
    }

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `client/gateway/api/src/main/java/org/eclipse/kapua/client/gateway/Transport.java`
#### Snippet
```java
public interface Transport {

    public interface TransportEvents {

        public void connected(Runnable runnable);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `client/gateway/api/src/main/java/org/eclipse/kapua/client/gateway/Transport.java`
#### Snippet
```java
    public interface TransportEvents {

        public void connected(Runnable runnable);

        public void disconnected(Runnable runnable);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `client/gateway/api/src/main/java/org/eclipse/kapua/client/gateway/Transport.java`
#### Snippet
```java

    @FunctionalInterface
    public interface Listener {

        public void stateChange(boolean state);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `client/gateway/api/src/main/java/org/eclipse/kapua/client/gateway/Transport.java`
#### Snippet
```java

        @Override
        public void close();
    }

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `client/gateway/api/src/main/java/org/eclipse/kapua/client/gateway/Transport.java`
#### Snippet
```java
     *             if the wait got interrupted
     */
    public static boolean waitForConnection(final Transport transport, final Duration timeout) throws InterruptedException {
        Objects.requireNonNull(transport);
        Objects.requireNonNull(timeout);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `client/gateway/api/src/main/java/org/eclipse/kapua/client/gateway/Transport.java`
#### Snippet
```java
        public void connected(Runnable runnable);

        public void disconnected(Runnable runnable);
    }

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `client/gateway/api/src/main/java/org/eclipse/kapua/client/gateway/Transport.java`
#### Snippet
```java
     *
     */
    public default ListenerHandle events(final Consumer<TransportEvents> events) {
        class TransportEventsImpl implements TransportEvents {

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `client/gateway/api/src/main/java/org/eclipse/kapua/client/gateway/Transport.java`
#### Snippet
```java

    @FunctionalInterface
    public interface ListenerHandle extends AutoCloseable {

        @Override
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `client/gateway/api/src/main/java/org/eclipse/kapua/client/gateway/Transport.java`
#### Snippet
```java
     *             if the wait got interrupted
     */
    public static void waitForConnection(final Transport transport) throws InterruptedException {
        Objects.requireNonNull(transport);

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `client/gateway/api/src/main/java/org/eclipse/kapua/client/gateway/Transport.java`
#### Snippet
```java
     *            the listener to transport state changes
     */
    public ListenerHandle listen(Listener listener);

    /**
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `service/user/internal/src/main/java/org/eclipse/kapua/service/user/internal/setting/KapuaUserSettingKeys.java`
#### Snippet
```java
     * @since 1.0
     */
    private KapuaUserSettingKeys(String key) {
        this.key = key;
    }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `qa/common/src/main/java/org/eclipse/kapua/qa/common/ThrowingConsumer.java`
#### Snippet
```java
public interface ThrowingConsumer<T> {

    public void accept(T t) throws Exception;
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `qa/common/src/main/java/org/eclipse/kapua/qa/common/Suppressed.java`
#### Snippet
```java
    public static interface ExceptionSupplier<X> {

        public X createNew(Throwable cause) throws Exception;
    }

```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `qa/common/src/main/java/org/eclipse/kapua/qa/common/Suppressed.java`
#### Snippet
```java

    @FunctionalInterface
    public static interface ExceptionSupplier<X> {

        public X createNew(Throwable cause) throws Exception;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `qa/common/src/main/java/org/eclipse/kapua/qa/common/Wait.java`
#### Snippet
```java
    public interface Condition {

        public boolean test() throws Exception;
    }

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `qa/common/src/main/java/org/eclipse/kapua/qa/common/Wait.java`
#### Snippet
```java
    public interface AssertCondition {

        public void test() throws Exception;
    }

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `client/gateway/provider/mqtt/src/main/java/org/eclipse/kapua/client/gateway/mqtt/MqttMessageHandler.java`
#### Snippet
```java
public interface MqttMessageHandler {

    public void handleMessage(String topic, ByteBuffer payload) throws Exception;
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `client/gateway/provider/mqtt/src/main/java/org/eclipse/kapua/client/gateway/mqtt/MqttModuleContext.java`
#### Snippet
```java
    public CompletionStage<?> publishMqtt(String topic, ByteBuffer payload);

    public String getMqttClientId();

}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `client/gateway/provider/mqtt/src/main/java/org/eclipse/kapua/client/gateway/mqtt/MqttModuleContext.java`
#### Snippet
```java
public interface MqttModuleContext {

    public CompletionStage<?> publishMqtt(String topic, ByteBuffer payload);

    public String getMqttClientId();
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `client/gateway/provider/mqtt/src/main/java/org/eclipse/kapua/client/gateway/mqtt/MqttNamespace.java`
#### Snippet
```java
     * @return The topic or {@code null} if no topic could be rendered for the provided input parameters
     */
    public String dataTopic(String clientId, String applicationId, Topic topic);
}

```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `consumer/commons/src/main/java/org/eclipse/kapua/consumer/commons/setting/ConsumerSettingKey.java`
#### Snippet
```java
    private String key;

    private ConsumerSettingKey(String key) {
        this.key = key;
    }
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `service/account/internal/src/main/java/org/eclipse/kapua/service/account/internal/setting/KapuaAccountSettingKeys.java`
#### Snippet
```java
     *            The value mapped by this {@link Enum} value
     */
    private KapuaAccountSettingKeys(String key) {
        this.key = key;
    }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `client/gateway/profile/kura/src/main/java/org/eclipse/kapua/client/gateway/kura/KuraBirthCertificateModule.java`
#### Snippet
```java
        public void provideData(Map<String, String> values);

        public static final Provider JVM = new Provider() {

            @Override
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `client/gateway/profile/kura/src/main/java/org/eclipse/kapua/client/gateway/kura/KuraBirthCertificateModule.java`
#### Snippet
```java
        public void provideData(Map<String, String> values);

        public static final Provider JVM = new Provider() {

            @Override
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `client/gateway/profile/kura/src/main/java/org/eclipse/kapua/client/gateway/kura/KuraBirthCertificateModule.java`
#### Snippet
```java
        public void provideData(Map<String, String> values);

        public static final Provider JVM = new Provider() {

            @Override
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `client/gateway/profile/kura/src/main/java/org/eclipse/kapua/client/gateway/kura/KuraBirthCertificateModule.java`
#### Snippet
```java
        };

        public static final Provider RUNTIME = new Provider() {

            @Override
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `client/gateway/profile/kura/src/main/java/org/eclipse/kapua/client/gateway/kura/KuraBirthCertificateModule.java`
#### Snippet
```java
        };

        public static final Provider RUNTIME = new Provider() {

            @Override
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `client/gateway/profile/kura/src/main/java/org/eclipse/kapua/client/gateway/kura/KuraBirthCertificateModule.java`
#### Snippet
```java
        };

        public static final Provider RUNTIME = new Provider() {

            @Override
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `client/gateway/profile/kura/src/main/java/org/eclipse/kapua/client/gateway/kura/KuraBirthCertificateModule.java`
#### Snippet
```java
    public interface Provider {

        public void provideData(Map<String, String> values);

        public static final Provider JVM = new Provider() {
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `extras/es-migrator/src/main/java/org/eclipse/kapua/extras/esmigrator/settings/EsMigratorSettingKey.java`
#### Snippet
```java
    private final String key;

    private EsMigratorSettingKey(String key) {
        this.key = key;
    }
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `transport/jms/src/main/java/org/eclipse/kapua/transport/jms/setting/JmsClientSettingKeys.java`
#### Snippet
```java
     * @since 1.0.0
     */
    private JmsClientSettingKeys(String key) {
        this.key = key;
    }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `message/api/src/main/java/org/eclipse/kapua/message/device/data/KapuaDataMessageFactory.java`
#### Snippet
```java
     * @since 1.1.0
     */
    public KapuaDataMessage newKapuaDataMessage();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `broker/core/src/main/java/org/eclipse/kapua/broker/core/plugin/authorization/Authorizer.java`
#### Snippet
```java
public interface Authorizer {

    public enum ActionType {
        READ,
        WRITE,
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `broker/core/src/main/java/org/eclipse/kapua/broker/core/plugin/authentication/Authenticator.java`
#### Snippet
```java
     *            not null if the disconnection is due to an error not related to the client (network I/O error, server side error, ...)
     */
    public abstract void disconnect(KapuaSecurityContext kapuaSecurityContext, Throwable error);

    /**
```

### UnnecessaryModifier
Modifier `abstract` is redundant for interface methods
in `broker/core/src/main/java/org/eclipse/kapua/broker/core/plugin/authentication/Authenticator.java`
#### Snippet
```java
     *            not null if the disconnection is due to an error not related to the client (network I/O error, server side error, ...)
     */
    public abstract void disconnect(KapuaSecurityContext kapuaSecurityContext, Throwable error);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `broker/core/src/main/java/org/eclipse/kapua/broker/core/plugin/authentication/Authenticator.java`
#### Snippet
```java
     *             if any checks fails (credential not valid, profile missing, ...)
     */
    public abstract List<org.eclipse.kapua.broker.core.plugin.authentication.AuthorizationEntry> connect(KapuaSecurityContext kapuaSecurityContext)
            throws KapuaException;

```

### UnnecessaryModifier
Modifier `abstract` is redundant for interface methods
in `broker/core/src/main/java/org/eclipse/kapua/broker/core/plugin/authentication/Authenticator.java`
#### Snippet
```java
     *             if any checks fails (credential not valid, profile missing, ...)
     */
    public abstract List<org.eclipse.kapua.broker.core.plugin.authentication.AuthorizationEntry> connect(KapuaSecurityContext kapuaSecurityContext)
            throws KapuaException;

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `broker/core/src/main/java/org/eclipse/kapua/broker/core/plugin/authentication/Authenticator.java`
#### Snippet
```java
     * @param kapuaSecurityContext
     */
    public abstract void sendDisconnectMessage(KapuaSecurityContext kapuaSecurityContext);

}
```

### UnnecessaryModifier
Modifier `abstract` is redundant for interface methods
in `broker/core/src/main/java/org/eclipse/kapua/broker/core/plugin/authentication/Authenticator.java`
#### Snippet
```java
     * @param kapuaSecurityContext
     */
    public abstract void sendDisconnectMessage(KapuaSecurityContext kapuaSecurityContext);

}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `broker/core/src/main/java/org/eclipse/kapua/broker/core/plugin/authentication/Authenticator.java`
#### Snippet
```java
     * @param kapuaSecurityContext
     */
    public abstract void sendConnectMessage(KapuaSecurityContext kapuaSecurityContext);

    /**
```

### UnnecessaryModifier
Modifier `abstract` is redundant for interface methods
in `broker/core/src/main/java/org/eclipse/kapua/broker/core/plugin/authentication/Authenticator.java`
#### Snippet
```java
     * @param kapuaSecurityContext
     */
    public abstract void sendConnectMessage(KapuaSecurityContext kapuaSecurityContext);

    /**
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `broker/core/src/main/java/org/eclipse/kapua/broker/core/setting/BrokerSettingKey.java`
#### Snippet
```java
    private String key;

    private BrokerSettingKey(String key) {
        this.key = key;
    }
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `service/device/management/packages/internal/src/main/java/org/eclipse/kapua/service/device/management/packages/internal/setting/PackageManagementServiceSettingKeys.java`
#### Snippet
```java
     * @param key The value mapped by this {@link Enum} value
     */
    private PackageManagementServiceSettingKeys(String key) {
        this.key = key;
    }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/Transport.java`
#### Snippet
```java
     *            to unsubscribe from
     */
    public void unsubscribe(Topic topic);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/Transport.java`
#### Snippet
```java
     * A later call to {@link #connect()} must be possible.
     */
    public void disconnect();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/Transport.java`
#### Snippet
```java
     * Set the runnable which will be called when a connection was lost
     */
    public void whenDisconnected(Runnable runnable);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/Transport.java`
#### Snippet
```java
     * </p>
     */
    public void whenConnected(Runnable runnable);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/Transport.java`
#### Snippet
```java
     *            the consumer to call when a message was received
     */
    public void subscribe(Topic topic, Consumer<Message> consumer);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/Transport.java`
#### Snippet
```java
     * Connect
     */
    public void connect();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/Transport.java`
#### Snippet
```java
     *            the payload to send
     */
    public void sendMessage(Topic topic, byte[] payload);
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/Module.java`
#### Snippet
```java
public interface Module {

    public default void connected(final Transport transport) {
    }

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/Module.java`
#### Snippet
```java
    }

    public default void disconnected(final Transport transport) {
    }
}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/app/Handler.java`
#### Snippet
```java
    }

    public default void processMessage(final Message message) {
    }

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/app/Handler.java`
#### Snippet
```java

    @Override
    public default void close() throws Exception {
    }
}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/app/Handler.java`
#### Snippet
```java
public interface Handler extends AutoCloseable {

    public default void connected() {
    }

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/app/Handler.java`
#### Snippet
```java
    }

    public default void disconnected() {
    }

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/app/Application.java`
#### Snippet
```java
     * @return the application descriptor, must never return {@code null}
     */
    public Descriptor getDescriptor();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/app/Application.java`
#### Snippet
```java
     * @return a new application handler, must never return {@code null}
     */
    public Handler createHandler(ApplicationContext context);
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/app/ApplicationContext.java`
#### Snippet
```java
     * @return a new sender, never {@code null}
     */
    public Sender sender(Topic topic);
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/app/Sender.java`
#### Snippet
```java
    }

    public default void send(final Map<String, Object> metrics, final byte[] body) {
        final Builder payload = KuraPayload.newBuilder();

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/app/Sender.java`
#### Snippet
```java
    public void send(KuraPayload.Builder payload);

    public default void send(final byte[] body) {
        send(Collections.emptyMap(), body);
    }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/app/Sender.java`
#### Snippet
```java
public interface Sender {

    public void send(KuraPayload.Builder payload);

    public default void send(final byte[] body) {
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/app/Sender.java`
#### Snippet
```java
    }

    public static Sender transportSender(final Topic topic, final Transport transport) {
        return new Sender() {

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/app/Sender.java`
#### Snippet
```java
    }

    public default void send(final Map<String, Object> metrics) {
        send(metrics, null);
    }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/app/Sender.java`
#### Snippet
```java
    }

    public default void send(final String body) {
        send(Collections.emptyMap(), body.getBytes(StandardCharsets.UTF_8));
    }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/app/Sender.java`
#### Snippet
```java
    }

    public default void send() {
        send(null, (byte[]) null);
    }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/app/Sender.java`
#### Snippet
```java
    }

    public default void send(final String body, final Charset charset) {
        send(Collections.emptyMap(), body.getBytes(charset));
    }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/app/annotated/Application.java`
#### Snippet
```java
     * @return the application id
     */
    public String value();
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/main/NameFactory.java`
#### Snippet
```java
public interface NameFactory {

    public String generateName(int instanceNumber);
}

```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/app/deploy/DownloadSimulator.java`
#### Snippet
```java
    private final long bytesPerSecond;

    public static enum JobState {
        RUNNING, COMPLETED, CANCELED, FAILED;
    }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/generator/GeneratorScheduler.java`
#### Snippet
```java
    public interface Handle {

        public void remove();
    }

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/generator/Generator.java`
#### Snippet
```java
public interface Generator {

    public Payload update(Instant timestamp);

    public static Generator onlyMetrics(final Function<Instant, Map<String, Object>> metrics) {
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/generator/Generator.java`
#### Snippet
```java
    public Payload update(Instant timestamp);

    public static Generator onlyMetrics(final Function<Instant, Map<String, Object>> metrics) {
        Objects.requireNonNull(metrics);

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/app/annotated/AnnotatedApplication.java`
#### Snippet
```java
    private static interface ResourceHandler {

        public void handle(Request request) throws Exception;
    }

```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/app/annotated/AnnotatedApplication.java`
#### Snippet
```java
    private static final Logger logger = LoggerFactory.getLogger(AnnotatedApplication.class);

    private static interface ResourceHandler {

        public void handle(Request request) throws Exception;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/generator/GeneratorFactory.java`
#### Snippet
```java
public interface GeneratorFactory {

    public Optional<Generator> create(Map<String, Object> configuration);
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/simulation/Simulation.java`
#### Snippet
```java
public interface Simulation extends AutoCloseable {

    public Application createApplication(String simulatorId);
}

```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `transport/mqtt/src/main/java/org/eclipse/kapua/transport/mqtt/pooling/setting/MqttClientPoolSettingKeys.java`
#### Snippet
```java
     * @since 1.0.0
     */
    private MqttClientPoolSettingKeys(String key) {
        this.key = key;
    }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/topic/Topic.java`
#### Snippet
```java
        }

        public static Segment replace(final String key) {
            return new ReplaceSegment(key);
        }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/topic/Topic.java`
#### Snippet
```java
        }

        public static Segment account() {
            return replace("account-name");
        }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/topic/Topic.java`
#### Snippet
```java
        }

        public static Segment control() {
            return CONTROL;
        }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/topic/Topic.java`
#### Snippet
```java
        public String render(Function<String, String> replaceMapper);

        public default String render() {
            return render(key -> null);
        }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/topic/Topic.java`
#### Snippet
```java
        }

        public static List<Segment> plain(final String... segment) {
            Objects.requireNonNull(segment);
            return Arrays.stream(segment).map(Segment::plain).collect(Collectors.toList());
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/topic/Topic.java`
#### Snippet
```java
        }

        public static Segment plain(final String segment) {
            Objects.requireNonNull(segment);
            if (segment.isEmpty() || segment.contains("/")) {
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/topic/Topic.java`
#### Snippet
```java
    public interface Segment {

        public String render(Function<String, String> replaceMapper);

        public default String render() {
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/topic/Topic.java`
#### Snippet
```java
        }

        public static Segment wildcard() {
            return WILDCARD;
        }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/topic/Topic.java`
#### Snippet
```java
        }

        public static Segment clientId() {
            return replace("client-id");
        }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/topic/Topic.java`
#### Snippet
```java
        }

        public static Segment raw(final String raw) {
            Objects.requireNonNull(raw);

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/topic/Topic.java`
#### Snippet
```java
        }

        public static Segment applicationId() {
            return replace(APPLICATION_ID);
        }
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `service/datastore/internal/src/main/java/org/eclipse/kapua/service/datastore/internal/setting/DatastoreSettingsKey.java`
#### Snippet
```java
    private String key;

    private DatastoreSettingsKey(String key) {
        this.key = key;
    }
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `service/datastore/internal/src/main/java/org/eclipse/kapua/service/datastore/internal/mediator/ClientInfoField.java`
#### Snippet
```java
    private String field;

    private ClientInfoField(String name) {
        this.field = name;
    }
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `service/datastore/internal/src/main/java/org/eclipse/kapua/service/datastore/internal/mediator/MetricInfoField.java`
#### Snippet
```java
    private String field;

    private MetricInfoField(String name) {
        this.field = name;
    }
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `service/datastore/internal/src/main/java/org/eclipse/kapua/service/datastore/internal/mediator/ChannelInfoField.java`
#### Snippet
```java
    private String field;

    private ChannelInfoField(String name) {
        this.field = name;
    }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `service/endpoint/api/src/main/java/org/eclipse/kapua/service/endpoint/EndpointUsage.java`
#### Snippet
```java
public interface EndpointUsage {

    public String getName();

    public void setName(String name);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `service/endpoint/api/src/main/java/org/eclipse/kapua/service/endpoint/EndpointUsage.java`
#### Snippet
```java
    public String getName();

    public void setName(String name);

}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `client/gateway/spi/src/main/java/org/eclipse/kapua/client/gateway/spi/Channel.java`
#### Snippet
```java
    }

    public void handleInit(Context context);

    public void handleClose(Context context);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `client/gateway/spi/src/main/java/org/eclipse/kapua/client/gateway/spi/Channel.java`
#### Snippet
```java
    public CompletionStage<?> handlePublish(String applicationId, Topic topic, Payload payload);

    public void handleUnsubscribe(String applicationId, Collection<Topic> topics) throws Exception;

}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `client/gateway/spi/src/main/java/org/eclipse/kapua/client/gateway/spi/Channel.java`
#### Snippet
```java
    public <T> Optional<T> adapt(Class<T> clazz);

    public CompletionStage<?> handleSubscribe(String applicationId, Topic topic, MessageHandler messageHandler, ErrorHandler<? extends Throwable> errorHandler);

    public CompletionStage<?> handlePublish(String applicationId, Topic topic, Payload payload);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `client/gateway/spi/src/main/java/org/eclipse/kapua/client/gateway/spi/Channel.java`
#### Snippet
```java
        public void notifyConnected();

        public void notifyDisconnected();

        public ScheduledExecutorService executor();
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `client/gateway/spi/src/main/java/org/eclipse/kapua/client/gateway/spi/Channel.java`
#### Snippet
```java
    public CompletionStage<?> handleSubscribe(String applicationId, Topic topic, MessageHandler messageHandler, ErrorHandler<? extends Throwable> errorHandler);

    public CompletionStage<?> handlePublish(String applicationId, Topic topic, Payload payload);

    public void handleUnsubscribe(String applicationId, Collection<Topic> topics) throws Exception;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `client/gateway/spi/src/main/java/org/eclipse/kapua/client/gateway/spi/Channel.java`
#### Snippet
```java
    public void handleClose(Context context);

    public <T> Optional<T> adapt(Class<T> clazz);

    public CompletionStage<?> handleSubscribe(String applicationId, Topic topic, MessageHandler messageHandler, ErrorHandler<? extends Throwable> errorHandler);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `client/gateway/spi/src/main/java/org/eclipse/kapua/client/gateway/spi/Channel.java`
#### Snippet
```java
        public void notifyDisconnected();

        public ScheduledExecutorService executor();
    }

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `client/gateway/spi/src/main/java/org/eclipse/kapua/client/gateway/spi/Channel.java`
#### Snippet
```java
    public void handleInit(Context context);

    public void handleClose(Context context);

    public <T> Optional<T> adapt(Class<T> clazz);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `client/gateway/spi/src/main/java/org/eclipse/kapua/client/gateway/spi/Channel.java`
#### Snippet
```java
public interface Channel {

    public interface Context {

        public void notifyConnected();
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `client/gateway/spi/src/main/java/org/eclipse/kapua/client/gateway/spi/Channel.java`
#### Snippet
```java
    public interface Context {

        public void notifyConnected();

        public void notifyDisconnected();
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `client/gateway/spi/src/main/java/org/eclipse/kapua/client/gateway/spi/ModuleContext.java`
#### Snippet
```java
     * @return the client instance, never returns {@code null}
     */
    public Client getClient();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `client/gateway/spi/src/main/java/org/eclipse/kapua/client/gateway/spi/ModuleContext.java`
#### Snippet
```java
     * @return the result, never returns {@code null}, but may return {@link Optional#empty()}
     */
    public <T> Optional<T> adapt(Class<T> clazz);
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `client/gateway/spi/src/main/java/org/eclipse/kapua/client/gateway/spi/Module.java`
#### Snippet
```java
public interface Module {

    public default void initialize(final ModuleContext context) {
    }

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `client/gateway/spi/src/main/java/org/eclipse/kapua/client/gateway/spi/Module.java`
#### Snippet
```java
    }

    public default void connected() {
    }

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `client/gateway/spi/src/main/java/org/eclipse/kapua/client/gateway/spi/Module.java`
#### Snippet
```java
    }

    public default void applicationAdded(final String applicationId) {
    }

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `client/gateway/spi/src/main/java/org/eclipse/kapua/client/gateway/spi/Module.java`
#### Snippet
```java
    }

    public default void disconnected() {
    }
}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `client/gateway/spi/src/main/java/org/eclipse/kapua/client/gateway/spi/Module.java`
#### Snippet
```java
    }

    public default void applicationRemoved(final String applicationId) {
    }

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `client/gateway/spi/src/main/java/org/eclipse/kapua/client/gateway/spi/AbstractClient.java`
#### Snippet
```java
        public CompletionStage<?> subscribe(Topic topic, MessageHandler handler, ErrorHandler<? extends Throwable> errorHandler);

        public void close();

        public Transport transport();
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `client/gateway/spi/src/main/java/org/eclipse/kapua/client/gateway/spi/AbstractClient.java`
#### Snippet
```java
        public void close();

        public Transport transport();
    }

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `client/gateway/spi/src/main/java/org/eclipse/kapua/client/gateway/spi/AbstractClient.java`
#### Snippet
```java
    public interface Context {

        public String getId();

        public CompletionStage<?> publish(Topic topic, Payload payload);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `client/gateway/spi/src/main/java/org/eclipse/kapua/client/gateway/spi/AbstractClient.java`
#### Snippet
```java
        public String getId();

        public CompletionStage<?> publish(Topic topic, Payload payload);

        public CompletionStage<?> subscribe(Topic topic, MessageHandler handler, ErrorHandler<? extends Throwable> errorHandler);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `client/gateway/spi/src/main/java/org/eclipse/kapua/client/gateway/spi/AbstractClient.java`
#### Snippet
```java
        public CompletionStage<?> publish(Topic topic, Payload payload);

        public CompletionStage<?> subscribe(Topic topic, MessageHandler handler, ErrorHandler<? extends Throwable> errorHandler);

        public void close();
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `service/api/src/main/java/org/eclipse/kapua/model/query/FieldSortCriteria.java`
#### Snippet
```java
     * @return
     */
    public SortOrder getSortOrder();
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `service/api/src/main/java/org/eclipse/kapua/model/query/FieldSortCriteria.java`
#### Snippet
```java
     * @return
     */
    public String getAttributeName();

    /**
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `service/security/shiro/src/main/java/org/eclipse/kapua/service/authorization/shiro/setting/KapuaAuthorizationSettingKeys.java`
#### Snippet
```java
    private String key;

    private KapuaAuthorizationSettingKeys(String key) {
        this.key = key;
    }
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `service/security/shiro/src/main/java/org/eclipse/kapua/service/authentication/shiro/setting/KapuaCryptoSettingKeys.java`
#### Snippet
```java
    private String key;

    private KapuaCryptoSettingKeys(String key) {
        this.key = key;
    }
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `service/security/shiro/src/main/java/org/eclipse/kapua/service/authentication/shiro/setting/KapuaAuthenticationSettingKeys.java`
#### Snippet
```java
    private String key;

    private KapuaAuthenticationSettingKeys(String key) {
        this.key = key;
    }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `service/commons/storable/api/src/main/java/org/eclipse/kapua/service/storable/model/query/StorableQuery.java`
#### Snippet
```java
    @XmlElementWrapper(name = "fetchAttributeName")
    @XmlElement(name = "fetchAttributeName")
    public List<String> getFetchAttributes();

    /**
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `service/device/call/kura/src/main/java/org/eclipse/kapua/service/device/call/message/kura/setting/DeviceCallSettingKeys.java`
#### Snippet
```java
     * @since 1.0.0
     */
    private DeviceCallSettingKeys(String key) {
        this.key = key;
    }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `commons/src/main/java/org/eclipse/kapua/commons/jpa/TransactionManager.java`
#### Snippet
```java
     * @throws KapuaException
     */
    public void beginTransaction(EntityManager manager) throws KapuaException;

}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `commons/src/main/java/org/eclipse/kapua/commons/jpa/TransactionManager.java`
#### Snippet
```java
     * @throws KapuaException
     */
    public void commit(EntityManager manager) throws KapuaException;

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `commons/src/main/java/org/eclipse/kapua/commons/jpa/EntityManagerFactory.java`
#### Snippet
```java
     * @throws KapuaException
     */
    public EntityManager createEntityManager() throws KapuaException;

}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `commons/src/main/java/org/eclipse/kapua/commons/core/ClassProvider.java`
#### Snippet
```java
public interface ClassProvider {

    public List<Class<?>> getClasses();
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `commons/src/main/java/org/eclipse/kapua/commons/util/ThrowingRunnable.java`
#### Snippet
```java
public interface ThrowingRunnable {

    public void run() throws Exception;
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `commons/src/main/java/org/eclipse/kapua/commons/util/xml/JAXBContextProvider.java`
#### Snippet
```java
     * @throws KapuaException
     */
    public JAXBContext getJAXBContext() throws KapuaException;
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `commons/src/main/java/org/eclipse/kapua/commons/cache/Cache.java`
#### Snippet
```java
     * @return
     */
    public String getNamespace();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `commons/src/main/java/org/eclipse/kapua/commons/cache/Cache.java`
#### Snippet
```java
     * @return
     */
    public V get(K k);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `commons/src/main/java/org/eclipse/kapua/commons/cache/Cache.java`
#### Snippet
```java
     * @param namespace
     */
    public void setNamespace(String namespace);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `commons/src/main/java/org/eclipse/kapua/commons/cache/Cache.java`
#### Snippet
```java
     * Clear the cache
     */
    public void invalidateAll();

}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `commons/src/main/java/org/eclipse/kapua/commons/cache/Cache.java`
#### Snippet
```java
     * @param v
     */
    public void put(K k, V v);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `commons/src/main/java/org/eclipse/kapua/commons/cache/Cache.java`
#### Snippet
```java
     * @param k
     */
    public void remove(K k);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `commons/src/main/java/org/eclipse/kapua/commons/event/ServiceEventBusDriver.java`
#### Snippet
```java
    public void start() throws ServiceEventBusException;

    public void stop() throws ServiceEventBusException;

    public ServiceEventBus getEventBus();
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `commons/src/main/java/org/eclipse/kapua/commons/event/ServiceEventBusDriver.java`
#### Snippet
```java
    public String getType();

    public void start() throws ServiceEventBusException;

    public void stop() throws ServiceEventBusException;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `commons/src/main/java/org/eclipse/kapua/commons/event/ServiceEventBusDriver.java`
#### Snippet
```java
    public void stop() throws ServiceEventBusException;

    public ServiceEventBus getEventBus();
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `commons/src/main/java/org/eclipse/kapua/commons/event/ServiceEventBusDriver.java`
#### Snippet
```java
public interface ServiceEventBusDriver {

    public String getType();

    public void start() throws ServiceEventBusException;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `commons/src/main/java/org/eclipse/kapua/commons/metric/MetricsService.java`
#### Snippet
```java
     * @return MetricRegistry
     */
    public MetricRegistry getMetricRegistry();

}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `commons/src/main/java/org/eclipse/kapua/commons/metric/MetricsService.java`
#### Snippet
```java
     * @return
     */
    public Histogram getHistogram(String module, String component, String... names);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `commons/src/main/java/org/eclipse/kapua/commons/metric/MetricsService.java`
#### Snippet
```java
     * @return
     */
    public Timer getTimer(String module, String component, String... names);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `commons/src/main/java/org/eclipse/kapua/commons/metric/MetricsService.java`
#### Snippet
```java
     * @return
     */
    public Counter getCounter(String module, String component, String... names);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `commons/src/main/java/org/eclipse/kapua/commons/metric/MetricsService.java`
#### Snippet
```java
     *             if the metric is already defined
     */
    public void registerGauge(Gauge<?> gauge, String module, String component, String... names) throws KapuaException;

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `commons/src/main/java/org/eclipse/kapua/commons/service/event/store/api/EventStoreService.java`
#### Snippet
```java
     */
    @Override
    public EventStoreRecordListResult query(KapuaQuery query)
            throws KapuaException;

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `commons/src/main/java/org/eclipse/kapua/commons/service/event/store/api/EventStoreService.java`
#### Snippet
```java
     * @throws KapuaException
     */
    public EventStoreRecord find(KapuaId id)
            throws KapuaException;

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `commons/src/main/java/org/eclipse/kapua/commons/service/event/store/api/EventStoreRecord.java`
#### Snippet
```java
    public String getEntityType();

    public void setEntityType(String entityType);

    @XmlElement(name = "scopeId")
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `commons/src/main/java/org/eclipse/kapua/commons/service/event/store/api/EventStoreRecord.java`
#### Snippet
```java
    @XmlElement(name = "userId")
    @XmlJavaTypeAdapter(KapuaIdAdapter.class)
    public KapuaId getUserId();

    public void setUserId(KapuaId userId);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `commons/src/main/java/org/eclipse/kapua/commons/service/event/store/api/EventStoreRecord.java`
#### Snippet
```java
    public String getContextId();

    public void setContextId(String contextId);

    @XmlElement(name = "timestamp")
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `commons/src/main/java/org/eclipse/kapua/commons/service/event/store/api/EventStoreRecord.java`
#### Snippet
```java
    public String getOutputs();

    public void setOutputs(String outputs);

    @XmlElement(name = "status")
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `commons/src/main/java/org/eclipse/kapua/commons/service/event/store/api/EventStoreRecord.java`
#### Snippet
```java
    @XmlElement(name = "scopeId")
    @XmlJavaTypeAdapter(KapuaIdAdapter.class)
    public KapuaId getScopeId();

    public void setScopeId(KapuaId scopeId);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `commons/src/main/java/org/eclipse/kapua/commons/service/event/store/api/EventStoreRecord.java`
#### Snippet
```java

    @XmlElement(name = "entityType")
    public String getEntityType();

    public void setEntityType(String entityType);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `commons/src/main/java/org/eclipse/kapua/commons/service/event/store/api/EventStoreRecord.java`
#### Snippet
```java

    @XmlElement(name = "contextId")
    public String getContextId();

    public void setContextId(String contextId);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `commons/src/main/java/org/eclipse/kapua/commons/service/event/store/api/EventStoreRecord.java`
#### Snippet
```java
    public static final String TYPE = "eventStoreRecord";

    public default String getType() {
        return TYPE;
    }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `commons/src/main/java/org/eclipse/kapua/commons/service/event/store/api/EventStoreRecord.java`
#### Snippet
```java
    @XmlElement(name = "timestamp")
    @XmlJavaTypeAdapter(DateXmlAdapter.class)
    public Date getTimestamp();

    public void setTimestamp(Date timestamp);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `commons/src/main/java/org/eclipse/kapua/commons/service/event/store/api/EventStoreRecord.java`
#### Snippet
```java

    @XmlElement(name = "service")
    public String getService();

    public void setService(String service);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `commons/src/main/java/org/eclipse/kapua/commons/service/event/store/api/EventStoreRecord.java`
#### Snippet
```java

    @XmlElement(name = "status")
    public EventStatus getStatus();

    public void setStatus(EventStatus status);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `commons/src/main/java/org/eclipse/kapua/commons/service/event/store/api/EventStoreRecord.java`
#### Snippet
```java
public interface EventStoreRecord extends KapuaUpdatableEntity {

    public static final String TYPE = "eventStoreRecord";

    public default String getType() {
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `commons/src/main/java/org/eclipse/kapua/commons/service/event/store/api/EventStoreRecord.java`
#### Snippet
```java
public interface EventStoreRecord extends KapuaUpdatableEntity {

    public static final String TYPE = "eventStoreRecord";

    public default String getType() {
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `commons/src/main/java/org/eclipse/kapua/commons/service/event/store/api/EventStoreRecord.java`
#### Snippet
```java
public interface EventStoreRecord extends KapuaUpdatableEntity {

    public static final String TYPE = "eventStoreRecord";

    public default String getType() {
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `commons/src/main/java/org/eclipse/kapua/commons/service/event/store/api/EventStoreRecord.java`
#### Snippet
```java
    public String getService();

    public void setService(String service);

    @XmlElement(name = "entityType")
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `commons/src/main/java/org/eclipse/kapua/commons/service/event/store/api/EventStoreRecord.java`
#### Snippet
```java

    @XmlElement(name = "inputs")
    public String getInputs();

    public void setInputs(String inputs);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `commons/src/main/java/org/eclipse/kapua/commons/service/event/store/api/EventStoreRecord.java`
#### Snippet
```java
    public KapuaId getUserId();

    public void setUserId(KapuaId userId);

    @XmlElement(name = "service")
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `commons/src/main/java/org/eclipse/kapua/commons/service/event/store/api/EventStoreRecord.java`
#### Snippet
```java

    @XmlElement(name = "note")
    public String getNote();

    public void setNote(String note);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `commons/src/main/java/org/eclipse/kapua/commons/service/event/store/api/EventStoreRecord.java`
#### Snippet
```java
    public EventStatus getStatus();

    public void setStatus(EventStatus status);

    @XmlElement(name = "note")
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `commons/src/main/java/org/eclipse/kapua/commons/service/event/store/api/EventStoreRecord.java`
#### Snippet
```java
    public String getOperation();

    public void setOperation(String operation);

    @XmlElement(name = "inputs")
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `commons/src/main/java/org/eclipse/kapua/commons/service/event/store/api/EventStoreRecord.java`
#### Snippet
```java

    @XmlElement(name = "outputs")
    public String getOutputs();

    public void setOutputs(String outputs);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `commons/src/main/java/org/eclipse/kapua/commons/service/event/store/api/EventStoreRecord.java`
#### Snippet
```java
    public KapuaId getScopeId();

    public void setScopeId(KapuaId scopeId);

    @XmlElement(name = "entityId")
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `commons/src/main/java/org/eclipse/kapua/commons/service/event/store/api/EventStoreRecord.java`
#### Snippet
```java

    @XmlElement(name = "operation")
    public String getOperation();

    public void setOperation(String operation);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `commons/src/main/java/org/eclipse/kapua/commons/service/event/store/api/EventStoreRecord.java`
#### Snippet
```java
    public String getInputs();

    public void setInputs(String inputs);

    @XmlElement(name = "outputs")
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `commons/src/main/java/org/eclipse/kapua/commons/service/event/store/api/EventStoreRecord.java`
#### Snippet
```java
    public KapuaId getEntityId();

    public void setEntityId(KapuaId entityId);

    @XmlElement(name = "operation")
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `commons/src/main/java/org/eclipse/kapua/commons/service/event/store/api/EventStoreRecord.java`
#### Snippet
```java
    public String getNote();

    public void setNote(String note);

}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `commons/src/main/java/org/eclipse/kapua/commons/service/event/store/api/EventStoreRecord.java`
#### Snippet
```java
    public Date getTimestamp();

    public void setTimestamp(Date timestamp);

    @XmlElement(name = "userId")
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `commons/src/main/java/org/eclipse/kapua/commons/service/event/store/api/EventStoreRecord.java`
#### Snippet
```java
    @XmlElement(name = "entityId")
    @XmlJavaTypeAdapter(KapuaIdAdapter.class)
    public KapuaId getEntityId();

    public void setEntityId(KapuaId entityId);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `commons/src/main/java/org/eclipse/kapua/commons/setting/SettingKey.java`
#### Snippet
```java
     * @since 1.0.0
     */
    public String key();
}

```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `commons/src/main/java/org/eclipse/kapua/commons/setting/system/SystemSettingKey.java`
#### Snippet
```java
     * @param key
     */
    private SystemSettingKey(String key) {
        this.key = key;
    }
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `commons/src/main/java/org/eclipse/kapua/commons/liquibase/settings/LiquibaseClientSettingKeys.java`
#### Snippet
```java
     * @since 1.2.0
     */
    private LiquibaseClientSettingKeys(String key) {
        this.key = key;
    }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `commons/src/main/java/org/eclipse/kapua/commons/configuration/ServiceConfig.java`
#### Snippet
```java
     * Return the service type
     */
    public default String getType() {
        return TYPE;
    }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `commons/src/main/java/org/eclipse/kapua/commons/configuration/ServiceConfig.java`
#### Snippet
```java
     * @throws KapuaException
     */
    public void setConfigurations(Properties configurations) throws KapuaException;
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `commons/src/main/java/org/eclipse/kapua/commons/configuration/ServiceConfig.java`
#### Snippet
```java
     * @param pid
     */
    public void setPid(String pid);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `commons/src/main/java/org/eclipse/kapua/commons/configuration/ServiceConfig.java`
#### Snippet
```java
     * @throws KapuaException
     */
    public Properties getConfigurations() throws KapuaException;

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `commons/src/main/java/org/eclipse/kapua/commons/configuration/ServiceConfig.java`
#### Snippet
```java
     * Service configuration type
     */
    public static final String TYPE = "scfg";

    /**
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `commons/src/main/java/org/eclipse/kapua/commons/configuration/ServiceConfig.java`
#### Snippet
```java
     * Service configuration type
     */
    public static final String TYPE = "scfg";

    /**
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `commons/src/main/java/org/eclipse/kapua/commons/configuration/ServiceConfig.java`
#### Snippet
```java
     * Service configuration type
     */
    public static final String TYPE = "scfg";

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `commons/src/main/java/org/eclipse/kapua/commons/configuration/ServiceConfig.java`
#### Snippet
```java
     * @return
     */
    public String getPid();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `commons/src/main/java/org/eclipse/kapua/commons/configuration/ServiceConfigCreator.java`
#### Snippet
```java
     * @return
     */
    public String getPid();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `commons/src/main/java/org/eclipse/kapua/commons/configuration/ServiceConfigCreator.java`
#### Snippet
```java
     * @throws KapuaException
     */
    public Properties getConfigurations() throws KapuaException;

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `commons/src/main/java/org/eclipse/kapua/commons/configuration/ServiceConfigCreator.java`
#### Snippet
```java
     * @param pid
     */
    public void setPid(String pid);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `commons/src/main/java/org/eclipse/kapua/commons/configuration/ServiceConfigCreator.java`
#### Snippet
```java
     * @throws KapuaException
     */
    public void setConfigurations(Properties configurations) throws KapuaException;
}

```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `service/device/management/registry/api/src/main/java/org/eclipse/kapua/service/device/management/registry/operation/DeviceManagementOperation.java`
#### Snippet
```java
public interface DeviceManagementOperation extends KapuaUpdatableEntity {

    static final String TYPE = "deviceManagementOperation";

    @Override
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `service/device/management/registry/api/src/main/java/org/eclipse/kapua/service/device/management/registry/operation/DeviceManagementOperation.java`
#### Snippet
```java
public interface DeviceManagementOperation extends KapuaUpdatableEntity {

    static final String TYPE = "deviceManagementOperation";

    @Override
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `service/device/management/registry/api/src/main/java/org/eclipse/kapua/service/device/management/registry/operation/DeviceManagementOperationCreator.java`
#### Snippet
```java
    @XmlElement(name = "startedOn")
    @XmlJavaTypeAdapter(DateXmlAdapter.class)
    public Date getStartedOn();

    void setStartedOn(Date startedOn);
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `service/device/management/registry/api/src/main/java/org/eclipse/kapua/service/device/management/registry/operation/notification/ManagementOperationNotification.java`
#### Snippet
```java
public interface ManagementOperationNotification extends KapuaEntity {

    static final String TYPE = "managementOperationNotification";

    @Override
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `service/device/management/registry/api/src/main/java/org/eclipse/kapua/service/device/management/registry/operation/notification/ManagementOperationNotification.java`
#### Snippet
```java
public interface ManagementOperationNotification extends KapuaEntity {

    static final String TYPE = "managementOperationNotification";

    @Override
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `broker/client/src/main/java/org/eclipse/kapua/broker/client/setting/BrokerClientSettingKey.java`
#### Snippet
```java
    private String key;

    private BrokerClientSettingKey(String key) {
        this.key = key;
    }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `broker/client/src/main/java/org/eclipse/kapua/broker/client/protocol/ProtocolDescriptorProvider.java`
#### Snippet
```java
     * @return The connector descriptor, or {@code null} if this provider could not find one
     */
    public ProtocolDescriptor getDescriptor(String connectorName);
}

```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `job-engine/jbatch/src/main/java/org/eclipse/kapua/job/engine/jbatch/setting/JobEngineSettingKeys.java`
#### Snippet
```java
    private String key;

    private JobEngineSettingKeys(String key) {
        this.key = key;
    }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `transport/api/src/main/java/org/eclipse/kapua/transport/TransportClientConnectOptions.java`
#### Snippet
```java
     * @since 1.0.0
     */
    public void setUsername(String username);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `transport/api/src/main/java/org/eclipse/kapua/transport/TransportClientConnectOptions.java`
#### Snippet
```java
     * @since 1.0.0
     */
    public String getUsername();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `transport/api/src/main/java/org/eclipse/kapua/transport/TransportClientConnectOptions.java`
#### Snippet
```java
     * @since 1.0.0
     */
    public void setEndpointURI(URI endpontURI);
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `transport/api/src/main/java/org/eclipse/kapua/transport/TransportClientConnectOptions.java`
#### Snippet
```java
     * @since 1.0.0
     */
    public URI getEndpointURI();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `transport/api/src/main/java/org/eclipse/kapua/transport/TransportClientConnectOptions.java`
#### Snippet
```java
     * @since 1.0.0
     */
    public char[] getPassword();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `transport/api/src/main/java/org/eclipse/kapua/transport/TransportClientConnectOptions.java`
#### Snippet
```java
     * @since 1.0.0
     */
    public String getClientId();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `transport/api/src/main/java/org/eclipse/kapua/transport/TransportClientConnectOptions.java`
#### Snippet
```java
     * @since 1.0.0
     */
    public void setPassword(char[] password);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `transport/api/src/main/java/org/eclipse/kapua/transport/TransportClientConnectOptions.java`
#### Snippet
```java
     * @since 1.0.0
     */
    public void setClientId(String clientId);

    /**
```

## RuleId[id=SuspiciousDateFormat]
### SuspiciousDateFormat
Lowercase 'mm' (minute) pattern is used: probably 'MM' (month) was intended
in `qa/common/src/main/java/org/eclipse/kapua/qa/common/TestBase.java`
#### Snippet
```java

    public Date parseDateString(String date) {
        DateFormat df = new SimpleDateFormat("dd/mm/yyyy");
        Date expDate = null;
        Instant now = Instant.now();
```

### SuspiciousDateFormat
Lowercase 'mm' (minute) pattern is used: probably 'MM' (month) was intended
in `qa/common/src/main/java/org/eclipse/kapua/qa/common/cucumber/CucAccount.java`
#### Snippet
```java

    public Date getExpirationDate() {
        DateFormat df = new SimpleDateFormat("dd/mm/yyyy");
        Date expDate = null;
        Instant now = Instant.now();
```

### SuspiciousDateFormat
Lowercase 'mm' (minute) pattern is used: probably 'MM' (month) was intended
in `qa/common/src/main/java/org/eclipse/kapua/qa/common/cucumber/CucCredentials.java`
#### Snippet
```java

    public Date getExpirationDate() {
        DateFormat df = new SimpleDateFormat("dd/mm/yyyy");
        Date expDate = null;
        Instant now = Instant.now();
```

### SuspiciousDateFormat
Lowercase 'mm' (minute) pattern is used: probably 'MM' (month) was intended
in `qa/common/src/main/java/org/eclipse/kapua/qa/common/cucumber/CucUser.java`
#### Snippet
```java

    public Date getExpirationDate() {
        DateFormat df = new SimpleDateFormat("dd/mm/yyyy");
        Date expDate = null;
        Instant now = Instant.now();
```

## RuleId[id=DoubleCheckedLocking]
### DoubleCheckedLocking
Double-checked locking
in `qa/common/src/main/java/org/eclipse/kapua/qa/common/cache/MapCacheManager.java`
#### Snippet
```java

    public static MapCacheManager getInstance() {
        if (instance == null) {
            synchronized (MapCacheManager.class) {
                if (instance == null) {
```

### DoubleCheckedLocking
Double-checked locking
in `qa/common/src/main/java/org/eclipse/kapua/qa/common/cache/MapCachingProvider.java`
#### Snippet
```java

    public static MapCachingProvider getInstance() {
        if (instance == null) {
            synchronized (MapCachingProvider.class) {
                if (instance == null) {
```

### DoubleCheckedLocking
Double-checked locking
in `service/commons/elasticsearch/client-rest/src/main/java/org/eclipse/kapua/service/elasticsearch/client/rest/RestElasticsearchClientProvider.java`
#### Snippet
```java
     */
    private void reconnectClientTask(Callable<RestClient> initClientMethod) throws Exception {
        if (internalElasticsearchRestClient == null) {
            synchronized (RestElasticsearchClientProvider.class) {
                if (internalElasticsearchRestClient == null) {
```

### DoubleCheckedLocking
Double-checked locking
in `plug-ins/sso/openid-connect/provider/src/main/java/org/eclipse/kapua/plugin/sso/openid/provider/ProviderOpenIDLocator.java`
#### Snippet
```java
     */
    private static ProviderLocator findProvider(final String providerId) {
        if (locator == null) {
            synchronized (ProviderOpenIDLocator.class) {
                if (locator == null) {
```

### DoubleCheckedLocking
Double-checked locking
in `plug-ins/sso/openid-connect/provider-keycloak/src/main/java/org/eclipse/kapua/plugin/sso/openid/provider/keycloak/KeycloakOpenIDLocator.java`
#### Snippet
```java
    @Override
    public OpenIDService getService() {
        if (openIDServiceInstance == null) {
            synchronized (KeycloakOpenIDLocator.class) {
                if (openIDServiceInstance == null) {
```

### DoubleCheckedLocking
Double-checked locking
in `plug-ins/sso/openid-connect/provider-keycloak/src/main/java/org/eclipse/kapua/plugin/sso/openid/provider/keycloak/KeycloakOpenIDLocator.java`
#### Snippet
```java
    @Override
    public JwtProcessor getProcessor() throws OpenIDException {
        if (jwtProcessorInstance == null) {
            synchronized (KeycloakOpenIDLocator.class) {
                if (jwtProcessorInstance == null) {
```

### DoubleCheckedLocking
Double-checked locking
in `qa/integration-steps/src/main/java/org/eclipse/kapua/qa/integration/steps/DockerUtil.java`
#### Snippet
```java

    public static DockerClient getDockerClient() {
        if (dockerClient==null) {
            synchronized (DockerUtil.class) {
                if (dockerClient==null) {
```

### DoubleCheckedLocking
Double-checked locking
in `plug-ins/sso/openid-connect/provider-generic/src/main/java/org/eclipse/kapua/plugin/sso/openid/provider/generic/GenericOpenIDLocator.java`
#### Snippet
```java
    @Override
    public OpenIDService getService() {
        if (openidServiceInstance == null) {
            synchronized (GenericOpenIDLocator.class) {
                if (openidServiceInstance == null) {
```

### DoubleCheckedLocking
Double-checked locking
in `plug-ins/sso/openid-connect/provider-generic/src/main/java/org/eclipse/kapua/plugin/sso/openid/provider/generic/GenericOpenIDLocator.java`
#### Snippet
```java
    @Override
    public JwtProcessor getProcessor() throws OpenIDException {
        if (jwtProcessorInstance == null) {
            synchronized (GenericOpenIDLocator.class) {
                if (jwtProcessorInstance == null) {
```

### DoubleCheckedLocking
Double-checked locking
in `service/datastore/internal/src/main/java/org/eclipse/kapua/service/datastore/internal/client/DatastoreClientFactory.java`
#### Snippet
```java
     */
    public static void close() {
        if (elasticsearchClientProviderInstance != null) {
            synchronized (DatastoreClientFactory.class) {
                if (elasticsearchClientProviderInstance != null) {
```

### DoubleCheckedLocking
Double-checked locking
in `service/datastore/internal/src/main/java/org/eclipse/kapua/service/datastore/internal/client/DatastoreClientFactory.java`
#### Snippet
```java
     */
    public static ElasticsearchClientProvider<?> getInstance() {
        if (elasticsearchClientProviderInstance == null) {
            synchronized (DatastoreClientFactory.class) {
                if (elasticsearchClientProviderInstance == null) {
```

### DoubleCheckedLocking
Double-checked locking
in `service/security/shiro/src/main/java/org/eclipse/kapua/service/authentication/shiro/mfa/MfaAuthenticatorServiceLocator.java`
#### Snippet
```java

    public static MfaAuthenticatorServiceLocator getInstance() {
        if (locator == null) {
            synchronized (MfaAuthenticatorServiceLocator.class) {
                if (locator == null) {
```

### DoubleCheckedLocking
Double-checked locking
in `commons/src/main/java/org/eclipse/kapua/commons/metric/MetricServiceFactory.java`
#### Snippet
```java
     */
    public static MetricsService getInstance() {
        if (instance == null) {
            synchronized (MetricServiceFactory.class) {
                if (instance == null) {
```

### DoubleCheckedLocking
Double-checked locking
in `commons/src/main/java/org/eclipse/kapua/commons/service/internal/cache/dummy/CacheManager.java`
#### Snippet
```java

    public static CacheManager getInstance() {
        if (instance == null) {
            synchronized (CacheManager.class) {
                if (instance == null) {
```

## RuleId[id=WhileCanBeForeach]
### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `qa/common/src/main/java/org/eclipse/kapua/qa/common/StepData.java`
#### Snippet
```java
        Set<String> setOfKeys = stepDataMap.keySet();
        Iterator<String> keyIterator = setOfKeys.iterator();
        while (keyIterator.hasNext()) {
            keys.add(keyIterator.next());
        }
```

### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `service/user/test-steps/src/main/java/org/eclipse/kapua/service/user/steps/UserServiceSteps.java`
#### Snippet
```java
        HashSet<ComparableUser> createdList = createUsersInList(userList, (Account) stepData.get(LAST_ACCOUNT));
        Iterator<ComparableUser> userIterator = createdList.iterator();
        while (userIterator.hasNext()) {
            tmpUser = userIterator.next();
        }
```

### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `service/user/test-steps/src/main/java/org/eclipse/kapua/service/user/steps/UserServiceSteps.java`
#### Snippet
```java
        HashSet<ComparableUser> createdList = createUsersInList(userList, (Account) stepData.get(LAST_ACCOUNT));
        Iterator<ComparableUser> userIterator = createdList.iterator();
        while (userIterator.hasNext()) {
            tmpUser = userIterator.next();
        }
```

### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `service/user/test-steps/src/main/java/org/eclipse/kapua/service/user/steps/UserServiceSteps.java`
#### Snippet
```java
        HashSet<ComparableUser> createdList = createUsersInList(userList, (Account) stepData.get(LAST_ACCOUNT));
        Iterator<ComparableUser> userIterator = createdList.iterator();
        while (userIterator.hasNext()) {
            tmpUser = userIterator.next();
        }
```

## RuleId[id=CStyleArrayDeclaration]
### CStyleArrayDeclaration
C-style array declaration of parameter `argv`
in `qa/integration-steps/src/main/java/org/eclipse/kapua/qa/integration/steps/KapuaStartCluster.java`
#### Snippet
```java
    }

    public static void main(String argv[]) throws Exception {
        DockerSteps ds = new DockerSteps(null, null);
        ds.startFullDockerEnvironment();
```

## RuleId[id=AssignmentToStaticFieldFromInstanceMethod]
### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `broker` from instance context
in `qa/common/src/main/java/org/eclipse/kapua/qa/common/utils/EmbeddedBroker.java`
#### Snippet
```java
                broker.stop();
                broker.waitUntilStopped();
                broker = null;
            }

```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `broker` from instance context
in `qa/common/src/main/java/org/eclipse/kapua/qa/common/utils/EmbeddedBroker.java`
#### Snippet
```java
            // start the broker
            System.setProperty(KAHA_DB_DIRECTORY, DEFAULT_KAHA_DB_DIRECTORY);
            broker = BrokerFactory.createBroker(ACTIVEMQ_XML);
            broker.setDataDirectory(DEFAULT_DATA_DIRECTORY);
            logger.info("Setting ActiveMQ data directory to {}", broker.getBrokerDataDirectory());
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `jetty` from instance context
in `qa/common/src/main/java/org/eclipse/kapua/qa/common/utils/EmbeddedJetty.java`
#### Snippet
```java

        InetSocketAddress address = new InetSocketAddress(host, port);
        jetty = new Server(address);
        logger.info("Starting Jetty " + jetty);

```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `jmsServer` from instance context
in `qa/common/src/main/java/org/eclipse/kapua/qa/common/utils/EmbeddedEventBroker.java`
#### Snippet
```java
            if (jmsServer != null) {
                jmsServer.stop();
                jmsServer = null;
            }
        } catch (Exception e) {
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `jmsServer` from instance context
in `qa/common/src/main/java/org/eclipse/kapua/qa/common/utils/EmbeddedEventBroker.java`
#### Snippet
```java
            jmsConfig.getConnectionFactoryConfigurations().add(cfConfig);

            jmsServer = new EmbeddedJMS().setConfiguration(configuration).setJmsConfiguration(jmsConfig).start();

            if (EXTRA_STARTUP_DELAY > 0) {
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `clientReconnectCallCounter` from instance context
in `service/commons/elasticsearch/client-rest/src/main/java/org/eclipse/kapua/service/elasticsearch/client/rest/RestElasticsearchClientProvider.java`
#### Snippet
```java
                    .printLog();

            clientReconnectCallCounter = MetricServiceFactory.getInstance().getCounter(elasticsearchClientConfiguration.getModuleName(), "elasticsearch-client-rest", "reconnect_call", "count");

            // Close the current client if already initialized.
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `application` from instance context
in `consumer/commons/src/main/java/org/eclipse/kapua/consumer/commons/application/KapuaApplication.java`
#### Snippet
```java
            if (application != null) {
                application.shutdown();
                application = null;
            }
        }
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `application` from instance context
in `consumer/commons/src/main/java/org/eclipse/kapua/consumer/commons/application/KapuaApplication.java`
#### Snippet
```java
        synchronized (KapuaApplication.class) {
            if (application == null) {
                application = new ServiceModuleBundle() {

                };
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `locator` from instance context
in `plug-ins/sso/openid-connect/provider/src/main/java/org/eclipse/kapua/plugin/sso/openid/provider/ProviderOpenIDLocator.java`
#### Snippet
```java
                , null);
        if (providerId == null) {
            locator = DisabledLocator.INSTANCE;
        } else {
            locator = findProvider(providerId);
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `locator` from instance context
in `plug-ins/sso/openid-connect/provider/src/main/java/org/eclipse/kapua/plugin/sso/openid/provider/ProviderOpenIDLocator.java`
#### Snippet
```java
            locator = DisabledLocator.INSTANCE;
        } else {
            locator = findProvider(providerId);
        }
    }
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `openIDServiceInstance` from instance context
in `plug-ins/sso/openid-connect/provider-keycloak/src/main/java/org/eclipse/kapua/plugin/sso/openid/provider/keycloak/KeycloakOpenIDLocator.java`
#### Snippet
```java
            synchronized (KeycloakOpenIDLocator.class) {
                if (openIDServiceInstance == null) {
                    openIDServiceInstance = new KeycloakOpenIDService();
                }
            }
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `jwtProcessorInstance` from instance context
in `plug-ins/sso/openid-connect/provider-keycloak/src/main/java/org/eclipse/kapua/plugin/sso/openid/provider/keycloak/KeycloakOpenIDLocator.java`
#### Snippet
```java
            synchronized (KeycloakOpenIDLocator.class) {
                if (jwtProcessorInstance == null) {
                    jwtProcessorInstance = new KeycloakJwtProcessor();
                }
            }
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `openidServiceInstance` from instance context
in `plug-ins/sso/openid-connect/provider-generic/src/main/java/org/eclipse/kapua/plugin/sso/openid/provider/generic/GenericOpenIDLocator.java`
#### Snippet
```java
            synchronized (GenericOpenIDLocator.class) {
                if (openidServiceInstance == null) {
                    openidServiceInstance = new GenericOpenIDService();
                }
            }
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `jwtProcessorInstance` from instance context
in `plug-ins/sso/openid-connect/provider-generic/src/main/java/org/eclipse/kapua/plugin/sso/openid/provider/generic/GenericOpenIDLocator.java`
#### Snippet
```java
            synchronized (GenericOpenIDLocator.class) {
                if (jwtProcessorInstance == null) {
                    jwtProcessorInstance = new GenericJwtProcessor();
                }
            }
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `intervalJobTriggerDefinition` from instance context
in `service/scheduler/quartz/src/main/java/org/eclipse/kapua/service/scheduler/trigger/quartz/TriggerServiceImpl.java`
#### Snippet
```java
    private synchronized TriggerDefinition getIntervalJobTriggerDefinition() throws KapuaException {
        if (intervalJobTriggerDefinition == null) {
            intervalJobTriggerDefinition = getTriggerDefinition("Interval Job");
        }

```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `cronJobTriggerDefinition` from instance context
in `service/scheduler/quartz/src/main/java/org/eclipse/kapua/service/scheduler/trigger/quartz/TriggerServiceImpl.java`
#### Snippet
```java
    private synchronized TriggerDefinition getCronJobTriggerDefinition() throws KapuaException {
        if (cronJobTriggerDefinition == null) {
            cronJobTriggerDefinition = getTriggerDefinition("Cron Job");
        }

```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `kapuaApplication` from instance context
in `broker/core/src/main/java/org/eclipse/kapua/broker/core/plugin/KapuaApplicationBrokerFilter.java`
#### Snippet
```java
    public KapuaApplicationBrokerFilter(Broker next) throws KapuaException {
        super(next);
        kapuaApplication = new KapuaApplication();
    }

```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `authenticationService` from instance context
in `service/device/registry/test-steps/src/main/java/org/eclipse/kapua/service/device/registry/steps/AclSteps.java`
#### Snippet
```java
    public void setServices() {
        locator = KapuaLocator.getInstance();
        authenticationService = locator.getService(AuthenticationService.class);
        credentialsFactory = locator.getFactory(CredentialsFactory.class);

```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `credentialsFactory` from instance context
in `service/device/registry/test-steps/src/main/java/org/eclipse/kapua/service/device/registry/steps/AclSteps.java`
#### Snippet
```java
        locator = KapuaLocator.getInstance();
        authenticationService = locator.getService(AuthenticationService.class);
        credentialsFactory = locator.getFactory(CredentialsFactory.class);

        mqttDevice = new MqttDevice();
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `mqttDevice` from instance context
in `service/device/registry/test-steps/src/main/java/org/eclipse/kapua/service/device/registry/steps/AclSteps.java`
#### Snippet
```java
        credentialsFactory = locator.getFactory(CredentialsFactory.class);

        mqttDevice = new MqttDevice();
        clientMqttMessage = new HashMap<>();
        listenerMqttMessage = new HashMap<>();
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `clientMqttMessage` from instance context
in `service/device/registry/test-steps/src/main/java/org/eclipse/kapua/service/device/registry/steps/AclSteps.java`
#### Snippet
```java

        mqttDevice = new MqttDevice();
        clientMqttMessage = new HashMap<>();
        listenerMqttMessage = new HashMap<>();

```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `listenerMqttMessage` from instance context
in `service/device/registry/test-steps/src/main/java/org/eclipse/kapua/service/device/registry/steps/AclSteps.java`
#### Snippet
```java
        mqttDevice = new MqttDevice();
        clientMqttMessage = new HashMap<>();
        listenerMqttMessage = new HashMap<>();

        aclCreator = new AclCreator();
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `aclCreator` from instance context
in `service/device/registry/test-steps/src/main/java/org/eclipse/kapua/service/device/registry/steps/AclSteps.java`
#### Snippet
```java
        listenerMqttMessage = new HashMap<>();

        aclCreator = new AclCreator();
    }

```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `deviceConnectionService` from instance context
in `service/device/registry/test-steps/src/main/java/org/eclipse/kapua/service/device/registry/steps/BrokerSteps.java`
#### Snippet
```java
        deviceCommandManagementService = locator.getService(DeviceCommandManagementService.class);
        deviceCommandFactory = locator.getFactory(DeviceCommandFactory.class);
        deviceConnectionService = locator.getService(DeviceConnectionService.class);
        deviceAssetManagementService = locator.getService(DeviceAssetManagementService.class);
    }
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `deviceAssetManagementService` from instance context
in `service/device/registry/test-steps/src/main/java/org/eclipse/kapua/service/device/registry/steps/BrokerSteps.java`
#### Snippet
```java
        deviceCommandFactory = locator.getFactory(DeviceCommandFactory.class);
        deviceConnectionService = locator.getService(DeviceConnectionService.class);
        deviceAssetManagementService = locator.getService(DeviceAssetManagementService.class);
    }

```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (2 lines)
in `qa/common/src/main/java/org/eclipse/kapua/qa/common/cache/MapCacheManager.java`
#### Snippet
```java
    @Override
    public <K, V, C extends Configuration<K, V>> Cache<K, V> createCache(String cacheName, C configuration) throws IllegalArgumentException {
        //Class<K> kClass = configuration.getKeyType();
        //Class<V> vClass = configuration.getValueType();
        return new MapCache<>();
```

### CommentedOutCode
Commented out code (2 lines)
in `qa/common/src/main/java/org/eclipse/kapua/qa/common/SimulatedDeviceSteps.java`
#### Snippet
```java
        final DevicePackage pkg = findPackage(packageName, version);

        // Assert.assertNotNull(pkg.getInstallDate());
        // Assert.assertTrue(Instant.now().isAfter(pkg.getInstallDate().toInstant()));

```

### CommentedOutCode
Commented out code (2 lines)
in `qa/common/src/main/java/org/eclipse/kapua/qa/common/SimulatedDeviceSteps.java`
#### Snippet
```java
                    // Assert.assertEquals("ksim-part-123456-" + clientId, device.getPartNumber());
                    Assert.assertEquals("ksim-serial-123456-" + clientId, device.getSerialNumber());
                    // Assert.assertEquals( "1", device.getAvailableProcessors () );
                    // Assert.assertEquals( "640", device.getTotalMemory());
                    Assert.assertEquals("fw.v42", device.getFirmwareVersion());
```

### CommentedOutCode
Commented out code (4 lines)
in `qa/common/src/main/java/org/eclipse/kapua/qa/common/SimulatedDeviceSteps.java`
#### Snippet
```java
                    Assert.assertEquals("fw.v42", device.getFirmwareVersion());
                    Assert.assertEquals("bios.v42", device.getBiosVersion());
                    // Assert.assertEquals( "Kura Simulator (OS)", device.getOperatingSystem());
                    // Assert.assertEquals("ksim-os-v42", device.getOperatingSystemVersion());
                    // Assert.assertEquals("ksim-arch", device.getOperatingSystemArchitecture());
```

### CommentedOutCode
Commented out code (2 lines)
in `broker/core/src/main/java/org/eclipse/kapua/broker/core/plugin/KapuaSecurityBrokerFilter.java`
#### Snippet
```java
            if (entry.getAcl().isRead()) {
                entries.add(createAuthorizationEntry(kapuaSecurityContext, entry.getAcl(), MessageFormat.format(VT_DURABLE_PREFIX.get(0), kapuaSecurityContext.getFullClientId(), entry.getAddress())));
                // logger.info("pattern {} - clientid {} - topic {} - evaluated {}", new Object[]{JmsConstants.ACL_VT_DURABLE_PREFIX[1], clientId, topic,
                // MessageFormat.format(JmsConstants.ACL_VT_DURABLE_PREFIX[1], fullClientId, topic)});
                entries.add(createAuthorizationEntry(kapuaSecurityContext, entry.getAcl(), MessageFormat.format(VT_DURABLE_PREFIX.get(1), kapuaSecurityContext.getFullClientId(), entry.getAddress())));
```

### CommentedOutCode
Commented out code (4 lines)
in `service/security/shiro/src/main/java/org/eclipse/kapua/service/authentication/shiro/AuthenticationServiceShiroImpl.java`
#### Snippet
```java
        claims.setExpirationTime(NumericDate.fromMilliseconds(expiresOnDate.getTime()));

        // Jwts.builder().setIssuer(issuer)
        // .setIssuedAt(issuedAtDate)
        // .setExpiration(new Date(expiresOnDate))
```

### CommentedOutCode
Commented out code (16 lines)
in `service/job/test-steps/src/main/java/org/eclipse/kapua/service/job/steps/JobExecutionServiceSteps.java`
#### Snippet
```java
    }

//    @And("I query for the execution items for the current job and I count {int} or more")
//    public void iQueryForTheExecutionItemsForTheCurrentJobAndICountOrMore(int numberOfExecutions) throws Exception {
//        Job job = (Job) stepData.get("Job");
```

### CommentedOutCode
Commented out code (8 lines)
in `service/device/registry/test-steps/src/main/java/org/eclipse/kapua/service/device/registry/steps/DeviceRegistrySteps.java`
#### Snippet
```java
        logger.info("Events sie: {}", eventList.getSize());
        eventList.getItems().forEach((event) -> logger.info("\ttype: {} - id: {} - date: {} - {}", event.getType(), event.getDeviceId(), event.getCreatedOn(), event.getEventMessage()));
//        if (count > eventList.getSize()) {
//            logger.info("++++++++++++++++++++++++++++++++++++++++++++++++\n===========================================================\n\n");
//            Thread.sleep(30000);
```

### CommentedOutCode
Commented out code (8 lines)
in `commons/src/main/java/org/eclipse/kapua/commons/util/StringUtil.java`
#### Snippet
```java
     */
    public static String[] splitValues(String strValues) {
        // List<String> defaultValues = new ArrayList<String>();
        // String[] stringValues = defaultValue.split("(?<!\\\\)(?>\\\\\\\\)*,");
        // for (int i=0; i<stringValues.length; i++) {
```

### CommentedOutCode
Commented out code (3 lines)
in `commons/src/main/java/org/eclipse/kapua/commons/event/RaiseServiceEventInterceptor.java`
#### Snippet
```java
            // assuming that the KapuaService implemented is specified by the first implementing interface
            String serviceInterfaceName = implementedClass[0].getName();
            // String splittedServiceInterfaceName[] = serviceInterfaceName.split("\\.");
            // String serviceName = splittedServiceInterfaceName.length > 0 ? splittedServiceInterfaceName[splittedServiceInterfaceName.length-1] : "";
            // String cleanedServiceName = serviceName.substring(0, serviceName.length()-"Service".length()).toLowerCase();
```

### CommentedOutCode
Commented out code (6 lines)
in `job-engine/jbatch/src/main/java/org/eclipse/kapua/job/engine/jbatch/persistence/JPAPersistenceManagerImpl.java`
#### Snippet
```java
        // We are currently not using app tags. They always default to "NOTSET".
        // It, at some point, we want to use them. This code below can be uncommented.
        //        try {
        //            JpaJobInstanceData jobInstanceData = entityManagerSession.onResult(em -> JpaJobInstanceDataDAO.find(em, jobInstanceId));
        //            return jobInstanceData != null ? jobInstanceData.getAppTag() : null;
```

## RuleId[id=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\/` in RegExp
in `client/gateway/api/src/main/java/org/eclipse/kapua/client/gateway/Topic.java`
#### Snippet
```java
        }

        return new Topic(Arrays.asList(path.split("\\/+")));
    }

```

### RegExpRedundantEscape
Redundant character escape `\\,` in RegExp
in `qa/common/src/main/java/org/eclipse/kapua/qa/common/BasicSteps.java`
#### Snippet
```java
            if (str.startsWith(KAPUA_CUSTOM_PROPERTIES)) {
                String properties = str.substring(KAPUA_CUSTOM_PROPERTIES_SIZE, str.lastIndexOf("\""));
                String[] splittedProperties = properties.split("\\,");
                for (String property : splittedProperties) {
                    String[] splittedProperty = property.split("=");
```

### RegExpRedundantEscape
Redundant character escape `\\:` in RegExp
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/AbstractMqttTransport.java`
#### Snippet
```java
            final String ui = u.getUserInfo();
            if (ui != null && !ui.isEmpty()) {
                final String[] toks = ui.split("\\:", 2);
                if (toks.length == 2) {
                    result.setUserName(toks[0]);
```

### RegExpRedundantEscape
Redundant character escape `\\/` in RegExp
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/topic/Topic.java`
#### Snippet
```java

    public static Topic fromString(final String topic) {
        return from(Arrays.stream(topic.split("\\/")).map(Segment::plain).collect(Collectors.toList()));
    }

```

### RegExpRedundantEscape
Redundant character escape `\\,` in RegExp
in `commons/src/main/java/org/eclipse/kapua/commons/event/RaiseServiceEventInterceptor.java`
#### Snippet
```java
        String serviceInterface = implementedClass[0].getAnnotatedInterfaces()[0].getType().getTypeName();
        String genericsList = serviceInterface.substring(serviceInterface.indexOf('<') + 1, serviceInterface.indexOf('>'));
        String[] entityClassesToScan = genericsList.replaceAll("\\,", "").split(" ");
        for (String str : entityClassesToScan) {
            try {
```

## RuleId[id=ObjectNotify]
### ObjectNotify
`notify` should probably be replaced with 'notifyAll()'
in `commons/src/main/java/org/eclipse/kapua/commons/event/ServiceEventHousekeeper.java`
#### Snippet
```java
        running = false;
        synchronized (monitor) {
            monitor.notify();
        }
    }
```

## RuleId[id=UnnecessaryQualifierForThis]
### UnnecessaryQualifierForThis
Qualifier `HandlerImpl` on 'this' is unnecessary in this context
in `qa/common/src/main/java/org/eclipse/kapua/qa/common/SimulatedDeviceApplication.java`
#### Snippet
```java
        @Override
        public void close() throws Exception {
            closeHandler(HandlerImpl.this);
        }

```

### UnnecessaryQualifierForThis
Qualifier `Topic` on 'this' is unnecessary in this context
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/topic/Topic.java`
#### Snippet
```java
                return context.get(key);
            }
            return Topic.this.context.get(key);
        });
    }
```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`setterMethods.size() == 0` can be replaced with 'setterMethods.isEmpty()'
in `qa/common/src/main/java/org/eclipse/kapua/qa/common/cache/MapCache.java`
#### Snippet
```java
                }

                if (setterMethods.size() == 0) {
                    return object;
                }
```

### SizeReplaceableByIsEmpty
`tmpAct.length() != 0` can be replaced with '!tmpAct.isEmpty()'
in `qa/common/src/main/java/org/eclipse/kapua/qa/common/cucumber/CucRole.java`
#### Snippet
```java
        if (actions != null) {
            String tmpAct = actions.trim().toLowerCase();
            if (tmpAct.length() != 0) {
                actionSet = new HashSet<>();
                String[] tmpList = actions.split(",");
```

### SizeReplaceableByIsEmpty
`failuresNode.size() > 0` can be replaced with '!failuresNode.isEmpty()'
in `extras/es-migrator/src/main/java/org/eclipse/kapua/extras/esmigrator/EsClientWrapper.java`
#### Snippet
```java
                    reindexComplete = true;
                    ArrayNode failuresNode = getTaskResponseJsonNode.get("response").withArray("failures");
                    if (failuresNode.size() > 0) {
                        StringBuilder errorMessageStringBuilder = new StringBuilder(String.format("Error during reindex from index %s to index %s. Failures: ", sourceIndex, destIndex));
                        for (JsonNode failureNode : failuresNode) {
```

### SizeReplaceableByIsEmpty
`images.size() > 0` can be replaced with '!images.isEmpty()'
in `qa/integration-steps/src/main/java/org/eclipse/kapua/qa/integration/steps/DockerSteps.java`
#### Snippet
```java
    public void listImages(String imageName) throws DockerException, InterruptedException {
        List<Image> images = DockerUtil.getDockerClient().listImages(DockerClient.ListImagesParam.byName(imageName));
        if ((images != null) && (images.size() > 0)) {
            for (Image image : images) {
                logger.info("Image: " + image);
```

### SizeReplaceableByIsEmpty
`images.size() > 0` can be replaced with '!images.isEmpty()'
in `qa/integration-steps/src/main/java/org/eclipse/kapua/qa/integration/steps/DockerSteps.java`
#### Snippet
```java
        List<Image> images = DockerUtil.getDockerClient().listImages(DockerClient.ListImagesParam.allImages());
        int count = 0;
        if ((images != null) && (images.size() > 0)) {
            count = images.size();
            logger.info("ids:");
```

### SizeReplaceableByIsEmpty
`properties1.size() > 0` can be replaced with '!properties1.isEmpty()'
in `service/datastore/test-steps/src/main/java/org/eclipse/kapua/service/datastore/steps/DatastoreSteps.java`
#### Snippet
```java
        Assert.assertEquals(properties1.size(), properties2.size());

        if (properties1.size() > 0) {
            for (Map.Entry<String, Object> entry : properties1.entrySet()) {
                Assert.assertTrue(properties2.containsKey(entry.getKey()));
```

### SizeReplaceableByIsEmpty
`metrics.size() == 0` can be replaced with 'metrics.isEmpty()'
in `service/datastore/internal/src/main/java/org/eclipse/kapua/service/datastore/internal/schema/Schema.java`
#### Snippet
```java
    public void updateMessageMappings(KapuaId scopeId, long time, Map<String, Metric> metrics)
            throws ClientException, MappingException {
        if (metrics == null || metrics.size() == 0) {
            return;
        }
```

### SizeReplaceableByIsEmpty
`metricValue.size() > 0` can be replaced with '!metricValue.isEmpty()'
in `service/datastore/internal/src/main/java/org/eclipse/kapua/service/datastore/internal/converter/ModelContextImpl.java`
#### Snippet
```java
            for (String metricsName : metricNames) {
                Map<String, Object> metricValue = (Map<String, Object>) metrics.get(metricsName);
                if (metricValue.size() > 0) {
                    String[] valueTypes = metricValue.keySet().toArray(new String[]{});
                    Object value = metricValue.get(valueTypes[0]);
```

### SizeReplaceableByIsEmpty
`listenerMqttMessage.size() > 0` can be replaced with '!listenerMqttMessage.isEmpty()'
in `service/device/registry/test-steps/src/main/java/org/eclipse/kapua/service/device/registry/steps/AclSteps.java`
#### Snippet
```java
        } else {
            // TODO log (or append in the failure message) this error in a better way
            Assert.fail("Message not received by broker." + (listenerMqttMessage != null && listenerMqttMessage.size() > 0 ? listenerMqttMessage.get(0) : " NULL"));
        }
    }
```

### SizeReplaceableByIsEmpty
`topicFilter.length() > 0` can be replaced with '!topicFilter.isEmpty()'
in `service/device/registry/test-steps/src/main/java/org/eclipse/kapua/service/device/registry/steps/MqttDevice.java`
#### Snippet
```java
                new MemoryPersistence());
        mqttClient.connect(clientOpts);
        if ((topicFilter != null) && (topicFilter.length() > 0)) {
            mqttClient.subscribe(topicFilter, DEFAULT_QOS);
        }
```

### SizeReplaceableByIsEmpty
`value.trim().length() == 0` can be replaced with 'value.trim().isEmpty()'
in `commons/src/main/java/org/eclipse/kapua/commons/util/ArgumentValidator.java`
#### Snippet
```java
    public static void isEmptyOrNull(String value, String argumentName)
            throws KapuaIllegalArgumentException {
        if (!(value == null || value.trim().length() == 0)) {
            throw new KapuaIllegalArgumentException(argumentName, value);
        }
```

### SizeReplaceableByIsEmpty
`value.trim().length() == 0` can be replaced with 'value.trim().isEmpty()'
in `commons/src/main/java/org/eclipse/kapua/commons/util/ArgumentValidator.java`
#### Snippet
```java
    public static void notEmptyOrNull(String value, String argumentName)
            throws KapuaIllegalNullArgumentException {
        if (value == null || value.trim().length() == 0) {
            throw new KapuaIllegalNullArgumentException(argumentName);
        }
```

### SizeReplaceableByIsEmpty
`entities.size()>0` can be replaced with '!entities.isEmpty()'
in `commons/src/main/java/org/eclipse/kapua/commons/event/RaiseServiceEventInterceptor.java`
#### Snippet
```java
            LOG.debug("Service name '{}' ", cleanedServiceName);
            serviceEvent.setService(cleanedServiceName);
            if (entities.size()>0) {
                useEntityToFillEvent(serviceEvent, entities);
            }
```

### SizeReplaceableByIsEmpty
`ids.size()>0` can be replaced with '!ids.isEmpty()'
in `commons/src/main/java/org/eclipse/kapua/commons/event/RaiseServiceEventInterceptor.java`
#### Snippet
```java
                useEntityToFillEvent(serviceEvent, entities);
            }
            else if (ids.size()>0) {
                // otherwise assume that the second identifier is the entity id (and the first the scope id, if there are more than one) or take the first one (if there is one)
                useKapuaIdsToFillEvent(serviceEvent, ids, implementedClass);
```

### SizeReplaceableByIsEmpty
`address.trim().length() > 0` can be replaced with '!address.trim().isEmpty()'
in `commons/src/main/java/org/eclipse/kapua/commons/event/jms/JMSServiceEventBus.java`
#### Snippet
```java
        void publish(String address, ServiceEvent kapuaEvent)
                throws ServiceEventBusException {
            if (address != null && address.trim().length() > 0) {
                SenderPool senderPool = senders.get(address);
                Sender sender = null;
```

### SizeReplaceableByIsEmpty
`destination.trim().length() > 0` can be replaced with '!destination.trim().isEmpty()'
in `broker/client/src/main/java/org/eclipse/kapua/broker/client/pool/JmsProducerWrapper.java`
#### Snippet
```java
        }
        session = connection.createSession(transacted, Session.AUTO_ACKNOWLEDGE);
        if (destination != null && destination.trim().length() > 0) {
            producer = session.createProducer(session.createQueue(destination));
        } else {
```

### SizeReplaceableByIsEmpty
`jobContextWrapper.getTargetSublist().size() != 0` can be replaced with '!jobContextWrapper.getTargetSublist().isEmpty()'
in `job-engine/jbatch/src/main/java/org/eclipse/kapua/job/engine/jbatch/listener/KapuaJobListener.java`
#### Snippet
```java
        jobLogger.info("Running before job...");
        jobLogger.info("Run configuration:");
        jobLogger.info("\tTarget count:           {}", jobContextWrapper.getTargetSublist().size() != 0 ? jobContextWrapper.getTargetSublist().size() : "all");
        jobLogger.info("\tReset step index:       {}", jobContextWrapper.getResetStepIndex());
        jobLogger.info("\tFrom step index:        {}", jobContextWrapper.getFromStepIndex() != null ? jobContextWrapper.getFromStepIndex() : 0);
```

### SizeReplaceableByIsEmpty
`permissions.size() > 0` can be replaced with '!permissions.isEmpty()'
in `service/security/test-steps/src/main/java/org/eclipse/kapua/service/authorization/steps/AuthorizationServiceSteps.java`
#### Snippet
```java
        Assert.assertNotNull(permissionList);
        Assert.assertEquals(permissions.size(), permissionList.getSize());
        if (permissions.size() > 0) {
            for (RolePermission tmpRolePerm : permissionList.getItems()) {
                found = false;
```

### SizeReplaceableByIsEmpty
`tmpRole.getActions().size() > 0` can be replaced with '!tmpRole.getActions().isEmpty()'
in `service/security/test-steps/src/main/java/org/eclipse/kapua/service/authorization/steps/AuthorizationServiceSteps.java`
#### Snippet
```java
            tmpRole.doParse();
            permissions = new HashSet<>();
            if ((tmpRole.getActions() != null) && (tmpRole.getActions().size() > 0)) {
                for (Actions tmpAct : tmpRole.getActions()) {
                    permissions.add(permissionFactory.newPermission(domain.getDomain(), tmpAct, tmpRole.getScopeId()));
```

### SizeReplaceableByIsEmpty
`cucUser.getName().length() > 0` can be replaced with '!cucUser.getName().isEmpty()'
in `service/user/test-steps/src/main/java/org/eclipse/kapua/service/user/steps/UserServiceSteps.java`
#### Snippet
```java
        Assert.assertNotNull(user.getId());
        Assert.assertNotNull(user.getScopeId());
        if ((cucUser.getName() != null) && (cucUser.getName().length() > 0)) {
            Assert.assertEquals(cucUser.getName(), user.getName());
        }
```

### SizeReplaceableByIsEmpty
`cucUser.getDisplayName().length() > 0` can be replaced with '!cucUser.getDisplayName().isEmpty()'
in `service/user/test-steps/src/main/java/org/eclipse/kapua/service/user/steps/UserServiceSteps.java`
#### Snippet
```java
        Assert.assertNotNull(user.getModifiedOn());
        Assert.assertNotNull(user.getModifiedBy());
        if ((cucUser.getDisplayName() != null) && (cucUser.getDisplayName().length() > 0)) {
            Assert.assertEquals(cucUser.getDisplayName(), user.getDisplayName());
        }
```

### SizeReplaceableByIsEmpty
`cucUser.getEmail().length() > 0` can be replaced with '!cucUser.getEmail().isEmpty()'
in `service/user/test-steps/src/main/java/org/eclipse/kapua/service/user/steps/UserServiceSteps.java`
#### Snippet
```java
            Assert.assertEquals(cucUser.getDisplayName(), user.getDisplayName());
        }
        if ((cucUser.getEmail() != null) && (cucUser.getEmail().length() > 0)) {
            Assert.assertEquals(cucUser.getEmail(), user.getEmail());
        }
```

### SizeReplaceableByIsEmpty
`cucUser.getPhoneNumber().length() > 0` can be replaced with '!cucUser.getPhoneNumber().isEmpty()'
in `service/user/test-steps/src/main/java/org/eclipse/kapua/service/user/steps/UserServiceSteps.java`
#### Snippet
```java
            Assert.assertEquals(cucUser.getEmail(), user.getEmail());
        }
        if ((cucUser.getPhoneNumber() != null) && (cucUser.getPhoneNumber().length() > 0)) {
            Assert.assertEquals(cucUser.getPhoneNumber(), user.getPhoneNumber());
        }
```

## RuleId[id=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `qa/integration-steps/src/main/java/org/eclipse/kapua/qa/integration/steps/RestClientSteps.java`
#### Snippet
```java
            if (oValue instanceof String) {
                String value = (String) oValue;
                template = template.replace("" + key + "", value);
            }
        }
```

### TrivialStringConcatenation
Empty string used in concatenation
in `qa/integration-steps/src/main/java/org/eclipse/kapua/qa/integration/steps/RestClientSteps.java`
#### Snippet
```java
            if (oValue instanceof String) {
                String value = (String) oValue;
                template = template.replace("" + key + "", value);
            }
        }
```

## RuleId[id=EqualsBetweenInconvertibleTypes]
### EqualsBetweenInconvertibleTypes
`equals` between objects of inconvertible types 'Domain' and 'String'
in `service/security/test-steps/src/main/java/org/eclipse/kapua/service/authorization/steps/AuthorizationServiceSteps.java`
#### Snippet
```java
            Assert.assertTrue(tmpDom1.equals(tmpDom1));
            Assert.assertFalse(tmpDom1.equals(null));
            Assert.assertFalse(tmpDom1.equals(String.valueOf("")));
            Domain tmpDom2 = null;
            tmpDom2 = domainRegistryService.find(null, tmpDom1.getId());
```

### EqualsBetweenInconvertibleTypes
`equals` between objects of inconvertible types 'Role' and 'Integer'
in `service/security/test-steps/src/main/java/org/eclipse/kapua/service/authorization/steps/AuthorizationServiceSteps.java`
#### Snippet
```java
        Assert.assertTrue(role1.equals(role1));
        Assert.assertFalse(role1.equals(null));
        Assert.assertFalse(role1.equals(miscObj));
        Assert.assertTrue(role1.equals(role2));
        role2.setName("test_name_2");
```

### EqualsBetweenInconvertibleTypes
`equals` between objects of inconvertible types 'AccessRole' and 'Integer'
in `service/security/test-steps/src/main/java/org/eclipse/kapua/service/authorization/steps/AuthorizationServiceSteps.java`
#### Snippet
```java
            Assert.assertTrue(accRole1.equals(accRole1));
            Assert.assertFalse(accRole1.equals(null));
            Assert.assertFalse(accRole1.equals(Integer.valueOf(15)));
            Assert.assertTrue(accRole1.equals(accRole2));
            accRole2.setAccessInfoId(getKapuaId());
```

### EqualsBetweenInconvertibleTypes
`equals` between objects of inconvertible types 'AccessPermission' and 'Integer'
in `service/security/test-steps/src/main/java/org/eclipse/kapua/service/authorization/steps/AuthorizationServiceSteps.java`
#### Snippet
```java
        Assert.assertTrue(accPerm1.equals(accPerm1));
        Assert.assertFalse(accPerm1.equals(null));
        Assert.assertFalse(accPerm1.equals(Integer.valueOf(15)));
        Assert.assertTrue(accPerm1.equals(accPerm2));
        accPerm1.setAccessInfoId(null);
```

### EqualsBetweenInconvertibleTypes
`equals` between objects of inconvertible types 'Permission' and 'Integer'
in `service/security/test-steps/src/main/java/org/eclipse/kapua/service/authorization/steps/AuthorizationServiceSteps.java`
#### Snippet
```java
        Assert.assertTrue(perm1.equals(perm1));
        Assert.assertFalse(perm1.equals(null));
        Assert.assertFalse(perm1.equals(Integer.valueOf(10)));
        Assert.assertTrue(perm1.equals(perm2));
        perm1.setDomain(null);
```

### EqualsBetweenInconvertibleTypes
`equals` between objects of inconvertible types 'RolePermission' and 'Integer'
in `service/security/test-steps/src/main/java/org/eclipse/kapua/service/authorization/steps/AuthorizationServiceSteps.java`
#### Snippet
```java
        Assert.assertTrue(perm1.equals(perm1));
        Assert.assertFalse(perm1.equals(null));
        Assert.assertFalse(perm1.equals(miscObj));
        Assert.assertTrue(perm1.equals(perm2));
        perm2.setPermission(tmpPermission2);
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.mkdir()` is ignored
in `extras/es-migrator/src/main/java/org/eclipse/kapua/extras/esmigrator/Migrator.java`
#### Snippet
```java
        try {
            reportDir = new File("reports");
            reportDir.mkdir();
        } catch (SecurityException securityException) {
            LOGGER.warn("Unable to create report file", securityException);
```

### IgnoreResultOfCall
Result of `KapuaLocator.getInstance()` is ignored
in `commons/src/main/java/org/eclipse/kapua/commons/core/ServiceModuleJaxbClassProvider.java`
#### Snippet
```java
    public ServiceModuleJaxbClassProvider() {
        // Initialize the Kapua locator to force populate ServiceModuleJaxbConfiguration
        KapuaLocator.getInstance();
    }

```

### IgnoreResultOfCall
Result of `KapuaLocator.getInstance()` is ignored
in `commons/src/main/java/org/eclipse/kapua/commons/core/ServiceModuleBundle.java`
#### Snippet
```java
    public ServiceModuleBundle() {
        // Initialize the kapua locator
        KapuaLocator.getInstance();
    }

```

## RuleId[id=ClassNameSameAsAncestorName]
### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `client/gateway/provider/fuse/src/main/java/org/eclipse/kapua/client/gateway/mqtt/fuse/FuseChannel.java`
#### Snippet
```java
    private static final Logger logger = LoggerFactory.getLogger(FuseChannel.class);

    public static class Builder extends AbstractMqttChannel.Builder<Builder> {

        @Override
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `client/gateway/spi/src/main/java/org/eclipse/kapua/client/gateway/spi/DefaultClient.java`
#### Snippet
```java
public class DefaultClient extends AbstractClient {

    public static final class Builder extends AbstractClient.Builder<Builder> {

        private final Channel channel;
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `client/gateway/spi/src/main/java/org/eclipse/kapua/client/gateway/spi/AbstractClient.java`
#### Snippet
```java
    }

    public static abstract class Builder<T extends Builder<T>> implements Client.Builder {

        protected abstract T builder();
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `client/gateway/provider/paho/src/main/java/org/eclipse/kapua/client/gateway/mqtt/paho/PahoChannel.java`
#### Snippet
```java
    private static final Logger logger = LoggerFactory.getLogger(PahoChannel.class);

    public static class Builder extends AbstractMqttChannel.Builder<Builder> {

        private Supplier<MqttClientPersistence> persistenceProvider = MemoryPersistence::new;
```

### ClassNameSameAsAncestorName
Class name `CachingProvider` is the same as one of its superclass' names
in `commons/src/main/java/org/eclipse/kapua/commons/service/internal/cache/dummy/CachingProvider.java`
#### Snippet
```java
 * Dummy caching provider needed to instantiate {@link Cache}
 */
public class CachingProvider implements javax.cache.spi.CachingProvider {
    @Override
    public javax.cache.CacheManager getCacheManager(URI uri, ClassLoader classLoader, Properties properties) {
```

### ClassNameSameAsAncestorName
Class name `Cache` is the same as one of its superclass' names
in `commons/src/main/java/org/eclipse/kapua/commons/service/internal/cache/dummy/Cache.java`
#### Snippet
```java
 * @param <V>
 */
public class Cache<K, V> implements javax.cache.Cache<K, V> {

    public Cache() {
```

### ClassNameSameAsAncestorName
Class name `CacheManager` is the same as one of its superclass' names
in `commons/src/main/java/org/eclipse/kapua/commons/service/internal/cache/dummy/CacheManager.java`
#### Snippet
```java
 * Dummy cache manager needed to instantiate {@link Cache}
 */
public class CacheManager implements javax.cache.CacheManager {

    private static CacheManager instance;
```

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `getName()` is identical to its super method
in `service/datastore/internal/src/main/java/org/eclipse/kapua/service/datastore/internal/model/query/predicate/MetricExistsPredicateImpl.java`
#### Snippet
```java

    @Override
    public String getName() {
        return name;
    }
```

### RedundantMethodOverride
Method `getValue()` only delegates to its super method
in `service/device/management/request/internal/src/main/java/org/eclipse/kapua/service/device/management/request/internal/GenericAppProperties.java`
#### Snippet
```java

    @Override
    public String getValue() {
        return super.getValue();
    }
```

### RedundantMethodOverride
Method `setValue()` only delegates to its super method
in `service/device/management/request/internal/src/main/java/org/eclipse/kapua/service/device/management/request/internal/GenericAppProperties.java`
#### Snippet
```java

    @Override
    public void setValue(String value) {
        super.setValue(value);
    }
```

### RedundantMethodOverride
Method `getScopeId()` is identical to its super method
in `commons/src/main/java/org/eclipse/kapua/commons/service/event/store/internal/EventStoreRecordImpl.java`
#### Snippet
```java

    @Override
    public KapuaId getScopeId() {
        return scopeId;
    }
```

### RedundantMethodOverride
Method `setScopeId()` is identical to its super method
in `commons/src/main/java/org/eclipse/kapua/commons/service/event/store/internal/EventStoreRecordImpl.java`
#### Snippet
```java

    @Override
    public void setScopeId(KapuaId scopeId) {
        this.scopeId = KapuaEid.parseKapuaId(scopeId);
    }
```

### RedundantMethodOverride
Method `hashCode()` only delegates to its super method
in `broker/api/src/main/java/org/eclipse/kapua/broker/BrokerDomain.java`
#### Snippet
```java

    @Override
    public int hashCode() {
        return super.hashCode();
    }
```

### RedundantMethodOverride
Method `equals()` only delegates to its super method
in `broker/api/src/main/java/org/eclipse/kapua/broker/BrokerDomain.java`
#### Snippet
```java

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
```

## RuleId[id=IntegerMultiplicationImplicitCastToLong]
### IntegerMultiplicationImplicitCastToLong
timeout \* 1000: integer multiplication implicitly cast to long
in `service/job/test-steps/src/main/java/org/eclipse/kapua/service/job/steps/JobTargetServiceSteps.java`
#### Snippet
```java
        try {
            JobTarget jobTarget = (JobTarget) stepData.get(JOB_TARGET);
            long endWaitTime = System.currentTimeMillis() + timeout * 1000;
            JobTarget targetFound = null;
            do {
```

### IntegerMultiplicationImplicitCastToLong
timeout \* 1000: integer multiplication implicitly cast to long
in `service/job/test-steps/src/main/java/org/eclipse/kapua/service/job/steps/JobExecutionServiceSteps.java`
#### Snippet
```java

    private void iQueryForTheExecutionItemsForTheCurrentJobAndICountOrMoreInternal(int numberOfExecutions, int timeout, boolean greater) throws Exception {
        long endWaitTime = System.currentTimeMillis() + timeout * 1000;
        JobExecutionListResult resultList = null;
        do {
```

### IntegerMultiplicationImplicitCastToLong
secondsToWait \* 1000: integer multiplication implicitly cast to long
in `service/job/test-steps/src/main/java/org/eclipse/kapua/service/job/steps/JobExecutionServiceSteps.java`
#### Snippet
```java
    @When("I query for the job with the name {string} and I count {int} execution item(s) after {int} second(s)")
    public void iQueryForTheJobWithTheNameAndJobExecutionCountAfter(String jobName, int count, int secondsToWait) throws Exception {
        Thread.sleep(secondsToWait * 1000);
        primeException();
        try {
```

### IntegerMultiplicationImplicitCastToLong
timeout \* 1000: integer multiplication implicitly cast to long
in `service/job/test-steps/src/main/java/org/eclipse/kapua/service/job/steps/JobStepServiceSteps.java`
#### Snippet
```java
        KapuaId currentJobId = (KapuaId) stepData.get(CURRENT_JOB_ID);
        primeException();
        long endWaitTime = System.currentTimeMillis() + timeout * 1000;
        try {
            do {
```

### IntegerMultiplicationImplicitCastToLong
delay \* 1000: integer multiplication implicitly cast to long
in `service/device/registry/test-steps/src/main/java/org/eclipse/kapua/service/device/registry/steps/DeviceRegistrySteps.java`
#### Snippet
```java
    @Given("I wait for {int} seconds")
    public void waitForSpecifiedTime(int delay) throws InterruptedException {
        Thread.sleep(delay * 1000);
    }

```

## RuleId[id=OptionalAssignedToNull]
### OptionalAssignedToNull
Null is used for 'Optional' type in parameter
in `client/gateway/provider/mqtt/src/main/java/org/eclipse/kapua/client/gateway/mqtt/AbstractMqttChannel.java`
#### Snippet
```java
            } catch (final Exception e) {
                try {
                    errorHandler.handleError(e, null);
                } catch (final Exception e1) {
                    throw e1;
```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import org.apache.commons.pool2.BasePooledObjectFactory;`
in `commons/src/main/java/org/eclipse/kapua/commons/event/jms/JMSServiceEventBus.java`
#### Snippet
```java
package org.eclipse.kapua.commons.event.jms;

import org.apache.commons.pool2.BasePooledObjectFactory;
import org.apache.commons.pool2.PooledObject;
import org.apache.commons.pool2.impl.DefaultPooledObject;
```

### UNUSED_IMPORT
Unused import `import org.apache.commons.pool2.PooledObject;`
in `commons/src/main/java/org/eclipse/kapua/commons/event/jms/JMSServiceEventBus.java`
#### Snippet
```java

import org.apache.commons.pool2.BasePooledObjectFactory;
import org.apache.commons.pool2.PooledObject;
import org.apache.commons.pool2.impl.DefaultPooledObject;
import org.apache.commons.pool2.impl.GenericObjectPool;
```

### UNUSED_IMPORT
Unused import `import org.apache.commons.pool2.impl.DefaultPooledObject;`
in `commons/src/main/java/org/eclipse/kapua/commons/event/jms/JMSServiceEventBus.java`
#### Snippet
```java
import org.apache.commons.pool2.BasePooledObjectFactory;
import org.apache.commons.pool2.PooledObject;
import org.apache.commons.pool2.impl.DefaultPooledObject;
import org.apache.commons.pool2.impl.GenericObjectPool;
import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
```

### UNUSED_IMPORT
Unused import `import org.apache.commons.pool2.impl.GenericObjectPool;`
in `commons/src/main/java/org/eclipse/kapua/commons/event/jms/JMSServiceEventBus.java`
#### Snippet
```java
import org.apache.commons.pool2.PooledObject;
import org.apache.commons.pool2.impl.DefaultPooledObject;
import org.apache.commons.pool2.impl.GenericObjectPool;
import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import org.apache.qpid.jms.jndi.JmsInitialContextFactory;
```

### UNUSED_IMPORT
Unused import `import org.apache.commons.pool2.impl.GenericObjectPoolConfig;`
in `commons/src/main/java/org/eclipse/kapua/commons/event/jms/JMSServiceEventBus.java`
#### Snippet
```java
import org.apache.commons.pool2.impl.DefaultPooledObject;
import org.apache.commons.pool2.impl.GenericObjectPool;
import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import org.apache.qpid.jms.jndi.JmsInitialContextFactory;
import org.eclipse.kapua.KapuaException;
```

### UNUSED_IMPORT
Unused import `import org.apache.qpid.jms.jndi.JmsInitialContextFactory;`
in `commons/src/main/java/org/eclipse/kapua/commons/event/jms/JMSServiceEventBus.java`
#### Snippet
```java
import org.apache.commons.pool2.impl.GenericObjectPool;
import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import org.apache.qpid.jms.jndi.JmsInitialContextFactory;
import org.eclipse.kapua.KapuaException;
import org.eclipse.kapua.KapuaRuntimeException;
```

### UNUSED_IMPORT
Unused import `import org.eclipse.kapua.KapuaException;`
in `commons/src/main/java/org/eclipse/kapua/commons/event/jms/JMSServiceEventBus.java`
#### Snippet
```java
import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import org.apache.qpid.jms.jndi.JmsInitialContextFactory;
import org.eclipse.kapua.KapuaException;
import org.eclipse.kapua.KapuaRuntimeException;
import org.eclipse.kapua.commons.event.ServiceEventBusDriver;
```

### UNUSED_IMPORT
Unused import `import org.eclipse.kapua.KapuaRuntimeException;`
in `commons/src/main/java/org/eclipse/kapua/commons/event/jms/JMSServiceEventBus.java`
#### Snippet
```java
import org.apache.qpid.jms.jndi.JmsInitialContextFactory;
import org.eclipse.kapua.KapuaException;
import org.eclipse.kapua.KapuaRuntimeException;
import org.eclipse.kapua.commons.event.ServiceEventBusDriver;
import org.eclipse.kapua.commons.event.ServiceEventBusManager;
```

### UNUSED_IMPORT
Unused import `import org.eclipse.kapua.commons.event.ServiceEventBusDriver;`
in `commons/src/main/java/org/eclipse/kapua/commons/event/jms/JMSServiceEventBus.java`
#### Snippet
```java
import org.eclipse.kapua.KapuaException;
import org.eclipse.kapua.KapuaRuntimeException;
import org.eclipse.kapua.commons.event.ServiceEventBusDriver;
import org.eclipse.kapua.commons.event.ServiceEventBusManager;
import org.eclipse.kapua.commons.event.ServiceEventMarshaler;
```

### UNUSED_IMPORT
Unused import `import org.eclipse.kapua.commons.event.ServiceEventBusManager;`
in `commons/src/main/java/org/eclipse/kapua/commons/event/jms/JMSServiceEventBus.java`
#### Snippet
```java
import org.eclipse.kapua.KapuaRuntimeException;
import org.eclipse.kapua.commons.event.ServiceEventBusDriver;
import org.eclipse.kapua.commons.event.ServiceEventBusManager;
import org.eclipse.kapua.commons.event.ServiceEventMarshaler;
import org.eclipse.kapua.commons.event.ServiceEventScope;
```

### UNUSED_IMPORT
Unused import `import org.eclipse.kapua.commons.event.ServiceEventMarshaler;`
in `commons/src/main/java/org/eclipse/kapua/commons/event/jms/JMSServiceEventBus.java`
#### Snippet
```java
import org.eclipse.kapua.commons.event.ServiceEventBusDriver;
import org.eclipse.kapua.commons.event.ServiceEventBusManager;
import org.eclipse.kapua.commons.event.ServiceEventMarshaler;
import org.eclipse.kapua.commons.event.ServiceEventScope;
import org.eclipse.kapua.commons.metric.MetricServiceFactory;
```

### UNUSED_IMPORT
Unused import `import org.eclipse.kapua.commons.event.ServiceEventScope;`
in `commons/src/main/java/org/eclipse/kapua/commons/event/jms/JMSServiceEventBus.java`
#### Snippet
```java
import org.eclipse.kapua.commons.event.ServiceEventBusManager;
import org.eclipse.kapua.commons.event.ServiceEventMarshaler;
import org.eclipse.kapua.commons.event.ServiceEventScope;
import org.eclipse.kapua.commons.metric.MetricServiceFactory;
import org.eclipse.kapua.commons.security.KapuaSecurityUtils;
```

### UNUSED_IMPORT
Unused import `import org.eclipse.kapua.commons.security.KapuaSecurityUtils;`
in `commons/src/main/java/org/eclipse/kapua/commons/event/jms/JMSServiceEventBus.java`
#### Snippet
```java
import org.eclipse.kapua.commons.event.ServiceEventScope;
import org.eclipse.kapua.commons.metric.MetricServiceFactory;
import org.eclipse.kapua.commons.security.KapuaSecurityUtils;
import org.eclipse.kapua.commons.security.KapuaSession;
import org.eclipse.kapua.commons.setting.system.SystemSetting;
```

### UNUSED_IMPORT
Unused import `import org.eclipse.kapua.commons.security.KapuaSession;`
in `commons/src/main/java/org/eclipse/kapua/commons/event/jms/JMSServiceEventBus.java`
#### Snippet
```java
import org.eclipse.kapua.commons.metric.MetricServiceFactory;
import org.eclipse.kapua.commons.security.KapuaSecurityUtils;
import org.eclipse.kapua.commons.security.KapuaSession;
import org.eclipse.kapua.commons.setting.system.SystemSetting;
import org.eclipse.kapua.commons.setting.system.SystemSettingKey;
```

### UNUSED_IMPORT
Unused import `import org.eclipse.kapua.commons.setting.system.SystemSetting;`
in `commons/src/main/java/org/eclipse/kapua/commons/event/jms/JMSServiceEventBus.java`
#### Snippet
```java
import org.eclipse.kapua.commons.security.KapuaSecurityUtils;
import org.eclipse.kapua.commons.security.KapuaSession;
import org.eclipse.kapua.commons.setting.system.SystemSetting;
import org.eclipse.kapua.commons.setting.system.SystemSettingKey;
import org.eclipse.kapua.event.ServiceEvent;
```

### UNUSED_IMPORT
Unused import `import org.eclipse.kapua.commons.setting.system.SystemSettingKey;`
in `commons/src/main/java/org/eclipse/kapua/commons/event/jms/JMSServiceEventBus.java`
#### Snippet
```java
import org.eclipse.kapua.commons.security.KapuaSession;
import org.eclipse.kapua.commons.setting.system.SystemSetting;
import org.eclipse.kapua.commons.setting.system.SystemSettingKey;
import org.eclipse.kapua.event.ServiceEvent;
import org.eclipse.kapua.event.ServiceEventBus;
```

### UNUSED_IMPORT
Unused import `import org.eclipse.kapua.event.ServiceEvent;`
in `commons/src/main/java/org/eclipse/kapua/commons/event/jms/JMSServiceEventBus.java`
#### Snippet
```java
import org.eclipse.kapua.commons.setting.system.SystemSetting;
import org.eclipse.kapua.commons.setting.system.SystemSettingKey;
import org.eclipse.kapua.event.ServiceEvent;
import org.eclipse.kapua.event.ServiceEventBus;
import org.eclipse.kapua.event.ServiceEventBusException;
```

### UNUSED_IMPORT
Unused import `import org.eclipse.kapua.event.ServiceEventBus;`
in `commons/src/main/java/org/eclipse/kapua/commons/event/jms/JMSServiceEventBus.java`
#### Snippet
```java
import org.eclipse.kapua.commons.setting.system.SystemSettingKey;
import org.eclipse.kapua.event.ServiceEvent;
import org.eclipse.kapua.event.ServiceEventBus;
import org.eclipse.kapua.event.ServiceEventBusException;
import org.eclipse.kapua.event.ServiceEventBusListener;
```

### UNUSED_IMPORT
Unused import `import org.eclipse.kapua.event.ServiceEventBusException;`
in `commons/src/main/java/org/eclipse/kapua/commons/event/jms/JMSServiceEventBus.java`
#### Snippet
```java
import org.eclipse.kapua.event.ServiceEvent;
import org.eclipse.kapua.event.ServiceEventBus;
import org.eclipse.kapua.event.ServiceEventBusException;
import org.eclipse.kapua.event.ServiceEventBusListener;
import org.slf4j.Logger;
```

### UNUSED_IMPORT
Unused import `import org.eclipse.kapua.event.ServiceEventBusListener;`
in `commons/src/main/java/org/eclipse/kapua/commons/event/jms/JMSServiceEventBus.java`
#### Snippet
```java
import org.eclipse.kapua.event.ServiceEventBus;
import org.eclipse.kapua.event.ServiceEventBusException;
import org.eclipse.kapua.event.ServiceEventBusListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
```

### UNUSED_IMPORT
Unused import `import org.slf4j.Logger;`
in `commons/src/main/java/org/eclipse/kapua/commons/event/jms/JMSServiceEventBus.java`
#### Snippet
```java
import org.eclipse.kapua.event.ServiceEventBusException;
import org.eclipse.kapua.event.ServiceEventBusListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

```

### UNUSED_IMPORT
Unused import `import org.slf4j.LoggerFactory;`
in `commons/src/main/java/org/eclipse/kapua/commons/event/jms/JMSServiceEventBus.java`
#### Snippet
```java
import org.eclipse.kapua.event.ServiceEventBusListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.codahale.metrics.Counter;
```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `qa/common/src/main/java/org/eclipse/kapua/qa/common/cucumber/CucPermission.java`
#### Snippet
```java
    public KapuaId getTargetScopeId() {
        if (targetScope != null) {
            return targetScopeId = new KapuaEid(BigInteger.valueOf(targetScope));
        }
        return targetScopeId;
```

### NestedAssignment
Result of assignment expression used
in `qa/integration-steps/src/main/java/org/eclipse/kapua/qa/integration/steps/RestClientSteps.java`
#### Snippet
```java
                try (BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())))) {
                    String output;
                    while ((output = br.readLine()) != null) {
                        sb.append(output);
                    }
```

### NestedAssignment
Result of assignment expression used
in `qa/integration-steps/src/main/java/org/eclipse/kapua/qa/integration/steps/RestClientSteps.java`
#### Snippet
```java
                try (BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())))) {
                    String output;
                    while ((output = br.readLine()) != null) {
                        sb.append(output);
                    }
```

### NestedAssignment
Result of assignment expression used
in `commons/src/main/java/org/eclipse/kapua/commons/jpa/ResourceSqlScriptExecutor.java`
#### Snippet
```java

                    String sqlLine;
                    while ((sqlLine = bufferedReader.readLine()) != null) {
                        sqlStringBuilder.append(sqlLine).append(System.lineSeparator());
                    }
```

### NestedAssignment
Result of assignment expression used
in `commons/src/main/java/org/eclipse/kapua/commons/about/AboutScanner.java`
#### Snippet
```java

            ZipEntry entry;
            while ((entry = zis.getNextEntry()) != null) {
                if ("META-INF/MANIFEST.MF".equals(entry.getName())) {
                    result = processOsgiManifest(result, entry, zis);
```

## RuleId[id=ReplaceAssignmentWithOperatorAssignment]
### ReplaceAssignmentWithOperatorAssignment
`action = action + ": "` could be simplified to 'action += ": "'
in `qa/common/src/main/java/org/eclipse/kapua/qa/common/Wait.java`
#### Snippet
```java

        if (action != null) {
            action = action + ": ";
        } else {
            action = "";
```

### ReplaceAssignmentWithOperatorAssignment
`i = i + PAGE_SIZE` could be simplified to 'i += PAGE_SIZE'
in `extras/encryption-migrator/src/main/java/org/eclipse/kapua/extras/migrator/encryption/EntityAttributeMigrator.java`
#### Snippet
```java

            LOG.info("    Entities to migrate: {}", totalEntitiesToMigrate);
            for (int i = 0; i < totalEntitiesToMigrate; i = i + PAGE_SIZE) {
                LOG.info("        Migrating entities from {} to {} - total {}", i, i + PAGE_SIZE, totalEntitiesToMigrate);
                List entitiesToMigrate = entityAttributeMigrator.getChunk(i, PAGE_SIZE);
```

## RuleId[id=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `closables` are queried, but never updated
in `qa/common/src/main/java/org/eclipse/kapua/qa/common/utils/EmbeddedBroker.java`
#### Snippet
```java
    private static final int EXTRA_STARTUP_DELAY = Integer.getInteger("org.eclipse.kapua.qa.broker.extraStartupDelay", 0);

    private Map<String, List<AutoCloseable>> closables = new HashMap<>();

    private static BrokerService broker;
```

### MismatchedCollectionQueryUpdate
Contents of collection `closables` are queried, but never updated
in `qa/common/src/main/java/org/eclipse/kapua/qa/common/utils/EmbeddedEventBroker.java`
#### Snippet
```java
    private static final int EXTRA_STARTUP_DELAY = Integer.getInteger("org.eclipse.kapua.qa.broker.extraStartupDelay", 0);

    private static Map<String, List<AutoCloseable>> closables = new HashMap<>();

    private DBHelper database;
```

### MismatchedCollectionQueryUpdate
Contents of collection `APP_VERSION_DICTIONARY` are updated, but never queried
in `translator/kapua/kura/src/main/java/org/eclipse/kapua/translator/kura/kapua/event/TranslatorEventConfigurationKuraKapua.java`
#### Snippet
```java

    private static final Map<String, KapuaAppProperties> APP_NAME_DICTIONARY;
    private static final Map<String, KapuaAppProperties> APP_VERSION_DICTIONARY;

    static {
```

### MismatchedCollectionQueryUpdate
Contents of collection `APP_NAME_DICTIONARY` are updated, but never queried
in `translator/kapua/kura/src/main/java/org/eclipse/kapua/translator/kura/kapua/event/TranslatorEventConfigurationKuraKapua.java`
#### Snippet
```java
    private static final DeviceConfigurationFactory DEVICE_CONFIGURATION_FACTORY = LOCATOR.getFactory(DeviceConfigurationFactory.class);

    private static final Map<String, KapuaAppProperties> APP_NAME_DICTIONARY;
    private static final Map<String, KapuaAppProperties> APP_VERSION_DICTIONARY;

```

### MismatchedCollectionQueryUpdate
Contents of collection `envVar` are queried, but never updated
in `qa/integration-steps/src/main/java/org/eclipse/kapua/qa/integration/steps/DockerSteps.java`
#### Snippet
```java
    private String networkId;
    private boolean debug;
    private List<String> envVar;
    private Map<String, String> containerMap;
    public Map<String, Integer> portMap;
```

### MismatchedCollectionQueryUpdate
Contents of collection `order` are updated, but never queried
in `service/datastore/test-steps/src/main/java/org/eclipse/kapua/service/datastore/steps/DatastoreSteps.java`
#### Snippet
```java
        sort.add(orderConstraint(SortField.descending(MessageSchema.MESSAGE_CLIENT_ID), String.class));

        List<SortField> order = new ArrayList<>();
        order.add(SortField.descending(MessageSchema.MESSAGE_TIMESTAMP));
        return sort;
```

## RuleId[id=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `instance` is accessed in both synchronized and unsynchronized contexts
in `qa/common/src/main/java/org/eclipse/kapua/qa/common/cache/MapCacheManager.java`
#### Snippet
```java
public class MapCacheManager implements CacheManager {

    private static MapCacheManager instance;

    private MapCacheManager() {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `instance` is accessed in both synchronized and unsynchronized contexts
in `qa/common/src/main/java/org/eclipse/kapua/qa/common/cache/MapCachingProvider.java`
#### Snippet
```java
public class MapCachingProvider implements CachingProvider {

    private static MapCachingProvider instance;

    public static MapCachingProvider getInstance() {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `elasticsearchClientConfiguration` is accessed in both synchronized and unsynchronized contexts
in `service/commons/elasticsearch/client-rest/src/main/java/org/eclipse/kapua/service/elasticsearch/client/rest/RestElasticsearchClientProvider.java`
#### Snippet
```java
    private RestClient internalElasticsearchRestClient;

    private ElasticsearchClientConfiguration elasticsearchClientConfiguration;
    private ModelContext modelContext;
    private QueryConverter modelConverter;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `modelContext` is accessed in both synchronized and unsynchronized contexts
in `service/commons/elasticsearch/client-rest/src/main/java/org/eclipse/kapua/service/elasticsearch/client/rest/RestElasticsearchClientProvider.java`
#### Snippet
```java

    private ElasticsearchClientConfiguration elasticsearchClientConfiguration;
    private ModelContext modelContext;
    private QueryConverter modelConverter;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `modelConverter` is accessed in both synchronized and unsynchronized contexts
in `service/commons/elasticsearch/client-rest/src/main/java/org/eclipse/kapua/service/elasticsearch/client/rest/RestElasticsearchClientProvider.java`
#### Snippet
```java
    private ElasticsearchClientConfiguration elasticsearchClientConfiguration;
    private ModelContext modelContext;
    private QueryConverter modelConverter;

    private static Counter clientReconnectCallCounter;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `restElasticsearchClient` is accessed in both synchronized and unsynchronized contexts
in `service/commons/elasticsearch/client-rest/src/main/java/org/eclipse/kapua/service/elasticsearch/client/rest/RestElasticsearchClientProvider.java`
#### Snippet
```java
    private Counter runtimeExceptionCount;

    private RestElasticsearchClient restElasticsearchClient;
    private RestClient internalElasticsearchRestClient;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `locator` is accessed in both synchronized and unsynchronized contexts
in `plug-ins/sso/openid-connect/provider/src/main/java/org/eclipse/kapua/plugin/sso/openid/provider/ProviderOpenIDLocator.java`
#### Snippet
```java
public class ProviderOpenIDLocator implements OpenIDLocator, Closeable {

    private static ProviderLocator locator;

    /**
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `openIDServiceInstance` is accessed in both synchronized and unsynchronized contexts
in `plug-ins/sso/openid-connect/provider-keycloak/src/main/java/org/eclipse/kapua/plugin/sso/openid/provider/keycloak/KeycloakOpenIDLocator.java`
#### Snippet
```java

    private static JwtProcessor jwtProcessorInstance;
    private static OpenIDService openIDServiceInstance;

    @Override
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `jwtProcessorInstance` is accessed in both synchronized and unsynchronized contexts
in `plug-ins/sso/openid-connect/provider-keycloak/src/main/java/org/eclipse/kapua/plugin/sso/openid/provider/keycloak/KeycloakOpenIDLocator.java`
#### Snippet
```java
public class KeycloakOpenIDLocator implements ProviderLocator {

    private static JwtProcessor jwtProcessorInstance;
    private static OpenIDService openIDServiceInstance;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `dockerClient` is accessed in both synchronized and unsynchronized contexts
in `qa/integration-steps/src/main/java/org/eclipse/kapua/qa/integration/steps/DockerUtil.java`
#### Snippet
```java
    private static final Logger logger = LoggerFactory.getLogger(DockerUtil.class);

    private static DockerClient dockerClient;

    private DockerUtil() {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `openidServiceInstance` is accessed in both synchronized and unsynchronized contexts
in `plug-ins/sso/openid-connect/provider-generic/src/main/java/org/eclipse/kapua/plugin/sso/openid/provider/generic/GenericOpenIDLocator.java`
#### Snippet
```java

    private static JwtProcessor jwtProcessorInstance;
    private static OpenIDService openidServiceInstance;

    @Override
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `jwtProcessorInstance` is accessed in both synchronized and unsynchronized contexts
in `plug-ins/sso/openid-connect/provider-generic/src/main/java/org/eclipse/kapua/plugin/sso/openid/provider/generic/GenericOpenIDLocator.java`
#### Snippet
```java
public class GenericOpenIDLocator implements ProviderLocator {

    private static JwtProcessor jwtProcessorInstance;
    private static OpenIDService openidServiceInstance;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `scheduler` is accessed in both synchronized and unsynchronized contexts
in `service/scheduler/quartz/src/main/java/org/eclipse/kapua/service/scheduler/quartz/driver/QuartzTriggerDriver.java`
#### Snippet
```java
    private static final Logger LOG = LoggerFactory.getLogger(QuartzTriggerDriver.class);

    private static Scheduler scheduler;

    private QuartzTriggerDriver() {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `triggerDefinitionService` is accessed in both synchronized and unsynchronized contexts
in `service/scheduler/quartz/src/main/java/org/eclipse/kapua/service/scheduler/trigger/quartz/TriggerServiceImpl.java`
#### Snippet
```java

    @Inject
    private TriggerDefinitionService triggerDefinitionService;
    @Inject
    private TriggerDefinitionFactory triggerDefinitionFactory;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `allowedOrigins` is accessed in both synchronized and unsynchronized contexts
in `commons-rest/filters/src/main/java/org/eclipse/kapua/commons/rest/filters/CORSResponseFilter.java`
#### Snippet
```java
    private ScheduledFuture<?> refreshTask;

    private Multimap<String, KapuaId> allowedOrigins = HashMultimap.create();
    private final List<String> allowedSystemOrigins = KapuaRestFiltersSetting.getInstance().getList(String.class, KapuaRestFiltersSettingKeys.API_CORS_ORIGINS_ALLOWED);

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `refreshTask` is accessed in both synchronized and unsynchronized contexts
in `commons-rest/filters/src/main/java/org/eclipse/kapua/commons/rest/filters/CORSResponseFilter.java`
#### Snippet
```java

    private final ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
    private ScheduledFuture<?> refreshTask;

    private Multimap<String, KapuaId> allowedOrigins = HashMultimap.create();
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `job` is accessed in both synchronized and unsynchronized contexts
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/app/deploy/DownloadSimulator.java`
#### Snippet
```java

    private final ScheduledExecutorService executor;
    private Job job;
    private final long bytesPerSecond;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `pahoMqttClient` is accessed in both synchronized and unsynchronized contexts
in `transport/mqtt/src/main/java/org/eclipse/kapua/transport/mqtt/MqttClient.java`
#### Snippet
```java
     * @since 1.0.0
     */
    private org.eclipse.paho.client.mqttv3.MqttClient pahoMqttClient;

    /**
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `elasticsearchClientProviderInstance` is accessed in both synchronized and unsynchronized contexts
in `service/datastore/internal/src/main/java/org/eclipse/kapua/service/datastore/internal/client/DatastoreClientFactory.java`
#### Snippet
```java
    private static final Logger LOG = LoggerFactory.getLogger(DatastoreClientFactory.class);

    private static ElasticsearchClientProvider<?> elasticsearchClientProviderInstance;

    private DatastoreClientFactory() {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `locator` is accessed in both synchronized and unsynchronized contexts
in `service/security/shiro/src/main/java/org/eclipse/kapua/service/authentication/shiro/mfa/MfaAuthenticatorServiceLocator.java`
#### Snippet
```java
public class MfaAuthenticatorServiceLocator {

    private static MfaAuthenticatorServiceLocator locator;

    private final MfaAuthenticator mfaAuthenticator;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `context` is accessed in both synchronized and unsynchronized contexts
in `client/gateway/provider/paho/src/main/java/org/eclipse/kapua/client/gateway/mqtt/paho/PahoChannel.java`
#### Snippet
```java

    private final Map<String, MqttMessageHandler> subscriptions = new HashMap<>();
    private Context context;

    private PahoChannel(final String clientId, final MqttNamespace namespace, final BinaryPayloadCodec codec,
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `client` is accessed in both synchronized and unsynchronized contexts
in `client/gateway/provider/paho/src/main/java/org/eclipse/kapua/client/gateway/mqtt/paho/PahoChannel.java`
#### Snippet
```java

    private final MqttConnectOptions connectOptions;
    private MqttAsyncClient client;

    private final Map<String, MqttMessageHandler> subscriptions = new HashMap<>();
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `randomInstance` is accessed in both synchronized and unsynchronized contexts
in `commons/src/main/java/org/eclipse/kapua/commons/util/RandomUtils.java`
#### Snippet
```java
     * The singleton instance of {@link Random}
     */
    private static Random randomInstance = getInstance();

    private RandomUtils() {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `instance` is accessed in both synchronized and unsynchronized contexts
in `commons/src/main/java/org/eclipse/kapua/commons/metric/MetricServiceFactory.java`
#### Snippet
```java
public class MetricServiceFactory {

    private static MetricsService instance;

    private MetricServiceFactory() {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `jmsConnection` is accessed in both synchronized and unsynchronized contexts
in `commons/src/main/java/org/eclipse/kapua/commons/event/jms/JMSServiceEventBus.java`
#### Snippet
```java
    private class EventBusJMSConnectionBridge {

        private Connection jmsConnection;
        private Map<String, SenderPool> senders = new HashMap<>();
        private ExceptionListenerImpl exceptionListener;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `eventBusJMSConnectionBridge` is accessed in both synchronized and unsynchronized contexts
in `commons/src/main/java/org/eclipse/kapua/commons/event/jms/JMSServiceEventBus.java`
#### Snippet
```java

    private List<Subscription> subscriptionList = new ArrayList<>();
    private EventBusJMSConnectionBridge eventBusJMSConnectionBridge;
    private ServiceEventMarshaler eventBusMarshaler;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `senders` is accessed in both synchronized and unsynchronized contexts
in `commons/src/main/java/org/eclipse/kapua/commons/event/jms/JMSServiceEventBus.java`
#### Snippet
```java

        private Connection jmsConnection;
        private Map<String, SenderPool> senders = new HashMap<>();
        private ExceptionListenerImpl exceptionListener;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `instance` is accessed in both synchronized and unsynchronized contexts
in `commons/src/main/java/org/eclipse/kapua/commons/service/internal/cache/dummy/CacheManager.java`
#### Snippet
```java
public class CacheManager implements javax.cache.CacheManager {

    private static CacheManager instance;

    private CacheManager() {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `registeredCache` is accessed in both synchronized and unsynchronized contexts
in `commons/src/main/java/org/eclipse/kapua/commons/service/internal/cache/KapuaCacheManager.java`
#### Snippet
```java
    private static CacheManager cacheManager;
    private static Integer cacheStatus = new Integer(0);
    private static Counter registeredCache;

    static {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `cacheStatus` is accessed in both synchronized and unsynchronized contexts
in `commons/src/main/java/org/eclipse/kapua/commons/service/internal/cache/KapuaCacheManager.java`
#### Snippet
```java

    private static CacheManager cacheManager;
    private static Integer cacheStatus = new Integer(0);
    private static Counter registeredCache;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `logSb` is accessed in both synchronized and unsynchronized contexts
in `job-engine/commons/src/main/java/org/eclipse/kapua/job/engine/commons/logger/JobLogger.java`
#### Snippet
```java
    private Logger containerClassLog;

    private StringBuilder logSb = new StringBuilder();

    private KapuaId scopeId;
```

## RuleId[id=CallToStringConcatCanBeReplacedByOperator]
### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `service/commons/elasticsearch/client-api/src/main/java/org/eclipse/kapua/service/elasticsearch/client/configuration/ElasticsearchNode.java`
#### Snippet
```java
    @Override
    public String toString() {
        return address.concat(":").concat(String.valueOf(port));
    }
}
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `service/commons/elasticsearch/client-api/src/main/java/org/eclipse/kapua/service/elasticsearch/client/configuration/ElasticsearchNode.java`
#### Snippet
```java
    @Override
    public String toString() {
        return address.concat(":").concat(String.valueOf(port));
    }
}
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `service/scheduler/quartz/src/main/java/org/eclipse/kapua/service/scheduler/quartz/driver/QuartzTriggerDriver.java`
#### Snippet
```java

        // Quartz Trigger data map definition
        TriggerKey triggerKey = TriggerKey.triggerKey(jobId.toCompactId().concat("-").concat(uniqueId.toCompactId()), scopeId.toCompactId());

        // Quartz Trigger definition
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `service/scheduler/quartz/src/main/java/org/eclipse/kapua/service/scheduler/quartz/driver/QuartzTriggerDriver.java`
#### Snippet
```java

        // Quartz Trigger data map definition
        TriggerKey triggerKey = TriggerKey.triggerKey(jobId.toCompactId().concat("-").concat(uniqueId.toCompactId()), scopeId.toCompactId());

        // Quartz Trigger definition
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `translator/test-steps/src/main/java/org/eclipse/kapua/translator/test/steps/TranslatorSteps.java`
#### Snippet
```java
    public void mqttMessageWithChannelScopeClientIDAndBody(String scope, String clientId) {
        MqttMessage mqttMessage = (MqttMessage) stepData.get("MqttMessage");
        String requestTopic = scope.concat("/" + clientId);
        Assert.assertEquals(requestTopic, mqttMessage.getRequestTopic().getTopic());
        if (mqttMessage.getPayload().getBody().length == 0) {
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `service/datastore/internal/src/main/java/org/eclipse/kapua/service/datastore/internal/model/query/predicate/MetricPredicateImpl.java`
#### Snippet
```java
        termNode.set(
                getField().field()
                        .concat(".")
                        .concat(getName())
                        .concat(".")
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `service/datastore/internal/src/main/java/org/eclipse/kapua/service/datastore/internal/model/query/predicate/MetricPredicateImpl.java`
#### Snippet
```java
                getField().field()
                        .concat(".")
                        .concat(getName())
                        .concat(".")
                        .concat(DatastoreUtils.getClientMetricFromAcronym(getType().getSimpleName().toLowerCase())),
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `service/datastore/internal/src/main/java/org/eclipse/kapua/service/datastore/internal/model/query/predicate/MetricPredicateImpl.java`
#### Snippet
```java
                        .concat(".")
                        .concat(getName())
                        .concat(".")
                        .concat(DatastoreUtils.getClientMetricFromAcronym(getType().getSimpleName().toLowerCase())),
                valuesNode);
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `service/datastore/internal/src/main/java/org/eclipse/kapua/service/datastore/internal/model/query/predicate/MetricPredicateImpl.java`
#### Snippet
```java
                        .concat(getName())
                        .concat(".")
                        .concat(DatastoreUtils.getClientMetricFromAcronym(getType().getSimpleName().toLowerCase())),
                valuesNode);

```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `service/datastore/internal/src/main/java/org/eclipse/kapua/service/datastore/internal/mediator/DatastoreUtils.java`
#### Snippet
```java
        String concatString = "";
        for (String str : components) {
            concatString = concatString.concat(str);
        }

```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `service/security/shiro/src/main/java/org/eclipse/kapua/service/authentication/credential/shiro/CredentialServiceImpl.java`
#### Snippet
```java
            // Build search query
            String preSeparator = setting.getString(KapuaAuthenticationSettingKeys.AUTHENTICATION_CREDENTIAL_APIKEY_PRE_SEPARATOR);
            String apiKeyPreValue = apiKey.substring(0, preLength).concat(preSeparator);

            //
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `commons/src/main/java/org/eclipse/kapua/commons/util/log/ConfigurationPrinter.java`
#### Snippet
```java
        @Override
        public String toString() {
            return super.toString().concat(name);
        }
    }
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `commons/src/main/java/org/eclipse/kapua/commons/util/log/ConfigurationPrinter.java`
#### Snippet
```java
        @Override
        public String toString() {
            return super.toString().concat(": ").concat(value != null ? value.toString() : "N/A");
        }
    }
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `commons/src/main/java/org/eclipse/kapua/commons/util/log/ConfigurationPrinter.java`
#### Snippet
```java
        @Override
        public String toString() {
            return super.toString().concat(": ").concat(value != null ? value.toString() : "N/A");
        }
    }
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `commons/src/main/java/org/eclipse/kapua/commons/util/log/ConfigurationPrinter.java`
#### Snippet
```java
        //
        // End Line - Same length of Title
        String footerLog = new String(new char[alignedTitleFormat.length()]).replace('\0', '=').concat("========================================");
        printLogLeveled(footerLog);
    }
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `commons/src/main/java/org/eclipse/kapua/commons/setting/AbstractKapuaSetting.java`
#### Snippet
```java

        if (!configResourceDirName.endsWith("/")) {
            configResourceDirName = configResourceDirName.concat("/");
        }

```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `job-engine/jbatch/src/main/java/org/eclipse/kapua/job/engine/jbatch/driver/JbatchDriver.java`
#### Snippet
```java
        //
        // Retrieve job XML definition file. Delete it if exist
        File jobXmlDefinitionFile = new File(jobTempDirectory, jobId.toCompactId().concat("-").concat(String.valueOf(System.nanoTime())).concat(".xml"));
        if (jobXmlDefinitionFile.exists() && !jobXmlDefinitionFile.delete()) {
            throw new CannotCleanJobDefFileDriverException(jobName, jobXmlDefinitionFile.getAbsolutePath());
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `job-engine/jbatch/src/main/java/org/eclipse/kapua/job/engine/jbatch/driver/JbatchDriver.java`
#### Snippet
```java
        //
        // Retrieve job XML definition file. Delete it if exist
        File jobXmlDefinitionFile = new File(jobTempDirectory, jobId.toCompactId().concat("-").concat(String.valueOf(System.nanoTime())).concat(".xml"));
        if (jobXmlDefinitionFile.exists() && !jobXmlDefinitionFile.delete()) {
            throw new CannotCleanJobDefFileDriverException(jobName, jobXmlDefinitionFile.getAbsolutePath());
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `job-engine/jbatch/src/main/java/org/eclipse/kapua/job/engine/jbatch/driver/JbatchDriver.java`
#### Snippet
```java
        //
        // Retrieve job XML definition file. Delete it if exist
        File jobXmlDefinitionFile = new File(jobTempDirectory, jobId.toCompactId().concat("-").concat(String.valueOf(System.nanoTime())).concat(".xml"));
        if (jobXmlDefinitionFile.exists() && !jobXmlDefinitionFile.delete()) {
            throw new CannotCleanJobDefFileDriverException(jobName, jobXmlDefinitionFile.getAbsolutePath());
```

## RuleId[id=SynchronizeOnThis]
### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `qa/common/src/main/java/org/eclipse/kapua/qa/common/cache/MapCacheManager.java`
#### Snippet
```java
    public static MapCacheManager getInstance() {
        if (instance == null) {
            synchronized (MapCacheManager.class) {
                if (instance == null) {
                    instance = new MapCacheManager();
```

### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `qa/common/src/main/java/org/eclipse/kapua/qa/common/cache/MapCachingProvider.java`
#### Snippet
```java
    public static MapCachingProvider getInstance() {
        if (instance == null) {
            synchronized (MapCachingProvider.class) {
                if (instance == null) {
                    instance = new MapCachingProvider();
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `client/gateway/provider/fuse/src/main/java/org/eclipse/kapua/client/gateway/mqtt/fuse/FuseChannel.java`
#### Snippet
```java
        final List<UTF8Buffer> topics = new ArrayList<>(mqttTopics.size());

        synchronized (this) {
            for (final String topic : mqttTopics) {
                if (subscriptions.remove(topic) != null) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `client/gateway/provider/fuse/src/main/java/org/eclipse/kapua/client/gateway/mqtt/fuse/FuseChannel.java`
#### Snippet
```java
    @Override
    protected CompletionStage<?> subscribeMqtt(final String topic, final MqttMessageHandler messageHandler) {
        synchronized (this) {
            subscriptions.put(topic, messageHandler);

```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `client/gateway/provider/fuse/src/main/java/org/eclipse/kapua/client/gateway/mqtt/fuse/FuseChannel.java`
#### Snippet
```java
        final MqttMessageHandler handler;

        synchronized (this) {
            handler = subscriptions.get(topic);
        }
```

### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `service/commons/elasticsearch/client-rest/src/main/java/org/eclipse/kapua/service/elasticsearch/client/rest/RestElasticsearchClientProvider.java`
#### Snippet
```java
    private void reconnectClientTask(Callable<RestClient> initClientMethod) throws Exception {
        if (internalElasticsearchRestClient == null) {
            synchronized (RestElasticsearchClientProvider.class) {
                if (internalElasticsearchRestClient == null) {
                    clientReconnectCallCounter.inc();
```

### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `service/commons/elasticsearch/client-rest/src/main/java/org/eclipse/kapua/service/elasticsearch/client/rest/RestElasticsearchClientProvider.java`
#### Snippet
```java
    @Override
    public RestElasticsearchClientProvider init() throws ClientProviderInitException {
        synchronized (RestElasticsearchClientProvider.class) {
            if (elasticsearchClientConfiguration == null) {
                throw new ClientProviderInitException("Client configuration not defined");
```

### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `service/commons/elasticsearch/client-rest/src/main/java/org/eclipse/kapua/service/elasticsearch/client/rest/RestElasticsearchClientProvider.java`
#### Snippet
```java
    @Override
    public void close() {
        synchronized (RestElasticsearchClientProvider.class) {
            try {
                closeClient();
```

### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `consumer/commons/src/main/java/org/eclipse/kapua/consumer/commons/setting/ConsumerSetting.java`
#### Snippet
```java
     */
    public static void resetInstance() {
        synchronized (ConsumerSetting.class) {
            instance = null;
        }
```

### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `consumer/commons/src/main/java/org/eclipse/kapua/consumer/commons/setting/ConsumerSetting.java`
#### Snippet
```java
     */
    public static ConsumerSetting getInstance() {
        synchronized (ConsumerSetting.class) {
            if (instance == null) {
                instance = new ConsumerSetting();
```

### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `consumer/commons/src/main/java/org/eclipse/kapua/consumer/commons/application/KapuaApplication.java`
#### Snippet
```java
    public void destroy() throws Exception {
        logger.info(">>> Kapua Application: calling destroy...");
        synchronized (KapuaApplication.class) {
            if (application != null) {
                application.shutdown();
```

### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `consumer/commons/src/main/java/org/eclipse/kapua/consumer/commons/application/KapuaApplication.java`
#### Snippet
```java
    public void init() throws Exception {
        logger.info(">>> Kapua Application: calling init...");
        synchronized (KapuaApplication.class) {
            if (application == null) {
                application = new ServiceModuleBundle() {
```

### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `plug-ins/sso/openid-connect/provider/src/main/java/org/eclipse/kapua/plugin/sso/openid/provider/ProviderOpenIDLocator.java`
#### Snippet
```java
    private static ProviderLocator findProvider(final String providerId) {
        if (locator == null) {
            synchronized (ProviderOpenIDLocator.class) {
                if (locator == null) {
                    for (final OpenIDProvider provider : ServiceLoader.load(OpenIDProvider.class)) {
```

### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `plug-ins/sso/openid-connect/provider-keycloak/src/main/java/org/eclipse/kapua/plugin/sso/openid/provider/keycloak/KeycloakOpenIDLocator.java`
#### Snippet
```java
    public OpenIDService getService() {
        if (openIDServiceInstance == null) {
            synchronized (KeycloakOpenIDLocator.class) {
                if (openIDServiceInstance == null) {
                    openIDServiceInstance = new KeycloakOpenIDService();
```

### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `plug-ins/sso/openid-connect/provider-keycloak/src/main/java/org/eclipse/kapua/plugin/sso/openid/provider/keycloak/KeycloakOpenIDLocator.java`
#### Snippet
```java
    public JwtProcessor getProcessor() throws OpenIDException {
        if (jwtProcessorInstance == null) {
            synchronized (KeycloakOpenIDLocator.class) {
                if (jwtProcessorInstance == null) {
                    jwtProcessorInstance = new KeycloakJwtProcessor();
```

### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `extras/es-migrator/src/main/java/org/eclipse/kapua/extras/esmigrator/settings/EsMigratorSetting.java`
#### Snippet
```java
     */
    public static void resetInstance() {
        synchronized (EsMigratorSetting.class) {
            instance = null;
        }
```

### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `extras/es-migrator/src/main/java/org/eclipse/kapua/extras/esmigrator/settings/EsMigratorSetting.java`
#### Snippet
```java
     */
    public static EsMigratorSetting getInstance() {
        synchronized (EsMigratorSetting.class) {
            if (instance == null) {
                instance = new EsMigratorSetting();
```

### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `qa/integration-steps/src/main/java/org/eclipse/kapua/qa/integration/steps/DockerUtil.java`
#### Snippet
```java
    public static DockerClient getDockerClient() {
        if (dockerClient==null) {
            synchronized (DockerUtil.class) {
                if (dockerClient==null) {
                    logger.info("Creating docker client...");
```

### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `plug-ins/sso/openid-connect/provider-generic/src/main/java/org/eclipse/kapua/plugin/sso/openid/provider/generic/GenericOpenIDLocator.java`
#### Snippet
```java
    public OpenIDService getService() {
        if (openidServiceInstance == null) {
            synchronized (GenericOpenIDLocator.class) {
                if (openidServiceInstance == null) {
                    openidServiceInstance = new GenericOpenIDService();
```

### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `plug-ins/sso/openid-connect/provider-generic/src/main/java/org/eclipse/kapua/plugin/sso/openid/provider/generic/GenericOpenIDLocator.java`
#### Snippet
```java
    public JwtProcessor getProcessor() throws OpenIDException {
        if (jwtProcessorInstance == null) {
            synchronized (GenericOpenIDLocator.class) {
                if (jwtProcessorInstance == null) {
                    jwtProcessorInstance = new GenericJwtProcessor();
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `qa/integration-steps/src/main/java/org/eclipse/kapua/qa/integration/steps/DockerSteps.java`
#### Snippet
```java
        try {
            startMessageBrokerContainer(BasicSteps.MESSAGE_BROKER_CONTAINER_NAME);
            synchronized (this) {
                this.wait(WAIT_FOR_BROKER);
            }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `qa/integration-steps/src/main/java/org/eclipse/kapua/qa/integration/steps/DockerSteps.java`
#### Snippet
```java
            startMessageBrokerContainer(BasicSteps.MESSAGE_BROKER_CONTAINER_NAME);
            synchronized (this) {
                this.wait(WAIT_FOR_BROKER);
            }

```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `qa/integration-steps/src/main/java/org/eclipse/kapua/qa/integration/steps/DockerSteps.java`
#### Snippet
```java
                    throw new DockerException("Timeout waiting for cluster startup reached!");
                }
                synchronized (this) {
                    this.wait(WAIT_STEP);
                }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `qa/integration-steps/src/main/java/org/eclipse/kapua/qa/integration/steps/DockerSteps.java`
#### Snippet
```java
                }
                synchronized (this) {
                    this.wait(WAIT_STEP);
                }
                logger.info("Consumers not ready after {}s... wait", (loops * WAIT_STEP / 1000));
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `qa/integration-steps/src/main/java/org/eclipse/kapua/qa/integration/steps/DockerSteps.java`
#### Snippet
```java

            startDBContainer(BasicSteps.DB_CONTAINER_NAME);
            synchronized (this) {
                this.wait(WAIT_FOR_DB);
            }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `qa/integration-steps/src/main/java/org/eclipse/kapua/qa/integration/steps/DockerSteps.java`
#### Snippet
```java
            startDBContainer(BasicSteps.DB_CONTAINER_NAME);
            synchronized (this) {
                this.wait(WAIT_FOR_DB);
            }

```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `qa/integration-steps/src/main/java/org/eclipse/kapua/qa/integration/steps/DockerSteps.java`
#### Snippet
```java

            startESContainer(BasicSteps.ES_CONTAINER_NAME);
            synchronized (this) {
                this.wait(WAIT_FOR_ES);
            }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `qa/integration-steps/src/main/java/org/eclipse/kapua/qa/integration/steps/DockerSteps.java`
#### Snippet
```java
            startESContainer(BasicSteps.ES_CONTAINER_NAME);
            synchronized (this) {
                this.wait(WAIT_FOR_ES);
            }

```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `qa/integration-steps/src/main/java/org/eclipse/kapua/qa/integration/steps/DockerSteps.java`
#### Snippet
```java

            startEventBrokerContainer(BasicSteps.EVENTS_BROKER_CONTAINER_NAME);
            synchronized (this) {
                this.wait(WAIT_FOR_EVENTS_BROKER);
            }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `qa/integration-steps/src/main/java/org/eclipse/kapua/qa/integration/steps/DockerSteps.java`
#### Snippet
```java
            startEventBrokerContainer(BasicSteps.EVENTS_BROKER_CONTAINER_NAME);
            synchronized (this) {
                this.wait(WAIT_FOR_EVENTS_BROKER);
            }

```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `qa/integration-steps/src/main/java/org/eclipse/kapua/qa/integration/steps/DockerSteps.java`
#### Snippet
```java

            startJobEngineContainer(BasicSteps.JOB_ENGINE_CONTAINER_NAME);
            synchronized (this) {
                this.wait(WAIT_FOR_JOB_ENGINE);
            }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `qa/integration-steps/src/main/java/org/eclipse/kapua/qa/integration/steps/DockerSteps.java`
#### Snippet
```java
            startJobEngineContainer(BasicSteps.JOB_ENGINE_CONTAINER_NAME);
            synchronized (this) {
                this.wait(WAIT_FOR_JOB_ENGINE);
            }
        } catch (Exception e) {
```

### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `broker/core/src/main/java/org/eclipse/kapua/broker/core/setting/BrokerSetting.java`
#### Snippet
```java
     */
    public static void resetInstance() {
        synchronized (BrokerSetting.class) {
            instance = null;
        }
```

### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `broker/core/src/main/java/org/eclipse/kapua/broker/core/setting/BrokerSetting.java`
#### Snippet
```java
     */
    public static BrokerSetting getInstance() {
        synchronized (BrokerSetting.class) {
            if (instance == null) {
                instance = new BrokerSetting();
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/app/deploy/DownloadSimulator.java`
#### Snippet
```java
        Job job;

        synchronized (this) {
            if (this.job == null) {
                return false;
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/app/deploy/DownloadSimulator.java`
#### Snippet
```java
    protected void tick() {
        final DownloadState state;
        synchronized (this) {
            if (job == null) {
                // this should never happen ;)
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `transport/mqtt/src/main/java/org/eclipse/kapua/transport/mqtt/MqttResponseCallback.java`
#### Snippet
```java
            // Notify if all expected responses arrived
            if (expectedResponses >= responses.size()) {
                synchronized (this) {
                    notifyAll();
                }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `transport/mqtt/src/main/java/org/eclipse/kapua/transport/mqtt/MqttResponseCallback.java`
#### Snippet
```java
            if (expectedResponses >= responses.size()) {
                synchronized (this) {
                    notifyAll();
                }
            }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `transport/mqtt/src/main/java/org/eclipse/kapua/transport/mqtt/MqttResponseCallback.java`
#### Snippet
```java
        LOG.warn("Connection lost detected! {}", cause.getMessage());
        LOG.error("Connection lost detected!", cause);
        synchronized (this) {
            notifyAll();
        }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `transport/mqtt/src/main/java/org/eclipse/kapua/transport/mqtt/MqttResponseCallback.java`
#### Snippet
```java
        LOG.error("Connection lost detected!", cause);
        synchronized (this) {
            notifyAll();
        }
    }
```

### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `service/datastore/internal/src/main/java/org/eclipse/kapua/service/datastore/internal/client/DatastoreClientFactory.java`
#### Snippet
```java
    public static void close() {
        if (elasticsearchClientProviderInstance != null) {
            synchronized (DatastoreClientFactory.class) {
                if (elasticsearchClientProviderInstance != null) {
                    try {
```

### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `service/datastore/internal/src/main/java/org/eclipse/kapua/service/datastore/internal/client/DatastoreClientFactory.java`
#### Snippet
```java
    public static ElasticsearchClientProvider<?> getInstance() {
        if (elasticsearchClientProviderInstance == null) {
            synchronized (DatastoreClientFactory.class) {
                if (elasticsearchClientProviderInstance == null) {

```

### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `service/datastore/internal/src/main/java/org/eclipse/kapua/service/datastore/internal/schema/Schema.java`
#### Snippet
```java
        Map<String, Metric> diffs = null;

        synchronized (Schema.class) {
            // Update mappings only if a metric is new (not in cache)
            diffs = getMessageMappingDiffs(currentMetadata, metrics);
```

### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `service/datastore/internal/src/main/java/org/eclipse/kapua/service/datastore/internal/schema/Schema.java`
#### Snippet
```java

        LOG.debug("Before entering updating metadata");
        synchronized (Schema.class) {
            LOG.debug("Entered updating metadata");
            ElasticsearchClient<?> elasticsearchClient = DatastoreClientFactory.getInstance().getElasticsearchClient();
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `client/gateway/spi/src/main/java/org/eclipse/kapua/client/gateway/spi/AbstractClient.java`
#### Snippet
```java

    protected DefaultApplication internalBuildApplication(final Application.Builder builder, final String applicationId) {
        synchronized (this) {
            if (applications.containsKey(applicationId)) {
                throw new IllegalStateException(String.format("An application with the ID '%s' already exists", applicationId));
```

### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `service/security/shiro/src/main/java/org/eclipse/kapua/service/authentication/shiro/mfa/MfaAuthenticatorServiceLocator.java`
#### Snippet
```java
    public static MfaAuthenticatorServiceLocator getInstance() {
        if (locator == null) {
            synchronized (MfaAuthenticatorServiceLocator.class) {
                if (locator == null) {
                    locator = new MfaAuthenticatorServiceLocator();
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `client/gateway/provider/paho/src/main/java/org/eclipse/kapua/client/gateway/mqtt/paho/PahoChannel.java`
#### Snippet
```java

    protected void handleConnected() {
        synchronized (this) {
            context.notifyConnected();
            handleResubscribe();
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `client/gateway/provider/paho/src/main/java/org/eclipse/kapua/client/gateway/mqtt/paho/PahoChannel.java`
#### Snippet
```java
    @Override
    protected CompletionStage<?> subscribeMqtt(String topic, MqttMessageHandler messageHandler) {
        synchronized (this) {
            subscriptions.put(topic, messageHandler);
            return internalSubscribe(topic);
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `client/gateway/provider/paho/src/main/java/org/eclipse/kapua/client/gateway/mqtt/paho/PahoChannel.java`
#### Snippet
```java

    protected void handleDisconnected() {
        synchronized (this) {
            try {
                context.notifyDisconnected();
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `client/gateway/provider/paho/src/main/java/org/eclipse/kapua/client/gateway/mqtt/paho/PahoChannel.java`
#### Snippet
```java
        final List<String> topics = new ArrayList<>(mqttTopics.size());

        synchronized (this) {
            for (String topic : mqttTopics) {
                if (subscriptions.remove(topic) != null) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `client/gateway/provider/paho/src/main/java/org/eclipse/kapua/client/gateway/mqtt/paho/PahoChannel.java`
#### Snippet
```java
        final MqttAsyncClient client;

        synchronized (this) {
            client = this.client;
            if (client == null) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `service/device/call/kura/src/main/java/org/eclipse/kapua/service/device/call/kura/KuraDeviceResponseContainer.java`
#### Snippet
```java
    @Override
    public void responseReceived(KuraResponseMessage response) {
        synchronized (this) {
            add(response);
            notifyAll();
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `service/device/call/kura/src/main/java/org/eclipse/kapua/service/device/call/kura/KuraDeviceResponseContainer.java`
#### Snippet
```java
        synchronized (this) {
            add(response);
            notifyAll();
        }
    }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `service/device/call/kura/src/main/java/org/eclipse/kapua/service/device/call/kura/KuraDeviceResponseContainer.java`
#### Snippet
```java
    @Override
    public void timedOut() {
        synchronized (this) {
            notifyAll();
        }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `service/device/call/kura/src/main/java/org/eclipse/kapua/service/device/call/kura/KuraDeviceResponseContainer.java`
#### Snippet
```java
    public void timedOut() {
        synchronized (this) {
            notifyAll();
        }
    }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `service/device/call/kura/src/main/java/org/eclipse/kapua/service/device/call/kura/KuraDeviceCallback.java`
#### Snippet
```java
    @Override
    public void timedOut() {
        notifyAll();
    }
}
```

### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `commons/src/main/java/org/eclipse/kapua/commons/metric/MetricServiceFactory.java`
#### Snippet
```java
    public static MetricsService getInstance() {
        if (instance == null) {
            synchronized (MetricServiceFactory.class) {
                if (instance == null) {
                    instance = new MetricsServiceImpl();
```

### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `commons/src/main/java/org/eclipse/kapua/commons/service/internal/cache/dummy/CacheManager.java`
#### Snippet
```java
    public static CacheManager getInstance() {
        if (instance == null) {
            synchronized (CacheManager.class) {
                if (instance == null) {
                    instance = new CacheManager();
```

### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `commons/src/main/java/org/eclipse/kapua/commons/setting/system/SystemSetting.java`
#### Snippet
```java
     */
    public static SystemSetting getInstance() {
        synchronized (SystemSetting.class) {
            if (instance == null) {
                instance = new SystemSetting();
```

### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `commons/src/main/java/org/eclipse/kapua/commons/setting/system/SystemSetting.java`
#### Snippet
```java
     */
    public static void resetInstance() {
        synchronized (SystemSetting.class) {
            instance = null;
        }
```

### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `broker/client/src/main/java/org/eclipse/kapua/broker/client/setting/BrokerClientSetting.java`
#### Snippet
```java
     */
    public static void resetInstance() {
        synchronized (BrokerClientSetting.class) {
            instance = null;
        }
```

### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `broker/client/src/main/java/org/eclipse/kapua/broker/client/setting/BrokerClientSetting.java`
#### Snippet
```java
     */
    public static BrokerClientSetting getInstance() {
        synchronized (BrokerClientSetting.class) {
            if (instance == null) {
                instance = new BrokerClientSetting();
```

### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `broker/client/src/main/java/org/eclipse/kapua/broker/client/protocol/ProtocolDescriptorProviders.java`
#### Snippet
```java
     */
    public static ProtocolDescriptorProvider getInstance() {
        synchronized (ProtocolDescriptorProviders.class) {

            if (provider != null) {
```

## RuleId[id=DuplicateThrows]
### DuplicateThrows
There is a more general exception, 'org.eclipse.paho.client.mqttv3.MqttException', in the throws list already.
in `qa/integration-steps/src/main/java/org/eclipse/kapua/qa/integration/steps/KapuaStartCluster.java`
#### Snippet
```java
    }

    protected static void sendMessageBirth(MqttClient mqttClient, String accountName, int waitFor) throws MqttPersistenceException, MqttException, InterruptedException {
        int qos = 1;
        boolean retained = false;
```

### DuplicateThrows
There is a more general exception, 'org.eclipse.paho.client.mqttv3.MqttException', in the throws list already.
in `qa/integration-steps/src/main/java/org/eclipse/kapua/qa/integration/steps/KapuaStartCluster.java`
#### Snippet
```java
    }

    protected static void sendMessage(MqttClient mqttClient, String topic, int waitFor) throws MqttPersistenceException, MqttException, InterruptedException {
        int qos = 1;
        boolean retained = false;
```

### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `qa/integration-steps/src/main/java/org/eclipse/kapua/qa/integration/steps/DockerSteps.java`
#### Snippet
```java
    }

    private boolean isConsumerReady(String type) throws JsonParseException, JsonMappingException, IOException {
        URL consumerUrl = new URL(LIFECYCLE_HEALTH_URL);//lifecycle endpoint
        if (TELEMETRY_CHECK_WEB_APP.equals(type)) {
```

### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `qa/integration-steps/src/main/java/org/eclipse/kapua/qa/integration/steps/DockerSteps.java`
#### Snippet
```java
    }

    private boolean isConsumerReady(String type) throws JsonParseException, JsonMappingException, IOException {
        URL consumerUrl = new URL(LIFECYCLE_HEALTH_URL);//lifecycle endpoint
        if (TELEMETRY_CHECK_WEB_APP.equals(type)) {
```

### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `qa/integration-steps/src/main/java/org/eclipse/kapua/qa/integration/steps/DockerSteps.java`
#### Snippet
```java
    }

    private boolean areConsumersReady() throws JsonParseException, JsonMappingException, IOException {
        if (isConsumerReady(LIFECYCLE_CHECK_WEB_APP)) {
            return isConsumerReady(TELEMETRY_CHECK_WEB_APP);
```

### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `qa/integration-steps/src/main/java/org/eclipse/kapua/qa/integration/steps/DockerSteps.java`
#### Snippet
```java
    }

    private boolean areConsumersReady() throws JsonParseException, JsonMappingException, IOException {
        if (isConsumerReady(LIFECYCLE_CHECK_WEB_APP)) {
            return isConsumerReady(TELEMETRY_CHECK_WEB_APP);
```

### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `job-engine/app/core/src/main/java/org/eclipse/kapua/job/engine/app/core/jackson/deserializer/KapuaIdDeserializer.java`
#### Snippet
```java

    @Override
    public KapuaId deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        return kapuaIdFactory.newKapuaId(p.getValueAsString());
    }
```

### DuplicateThrows
There is a more general exception, 'org.eclipse.kapua.KapuaException', in the throws list already.
in `job-engine/jbatch/src/main/java/org/eclipse/kapua/job/engine/jbatch/driver/JbatchDriver.java`
#### Snippet
```java
    }

    public static void resumeJob(@NotNull KapuaId scopeId, @NotNull KapuaId jobId, @NotNull KapuaId toResumeJobExecutionId) throws JbatchDriverException, KapuaException {

        String jobName = getJbatchJobName(scopeId, jobId);
```

### DuplicateThrows
There is a more general exception, 'org.eclipse.kapua.KapuaException', in the throws list already.
in `job-engine/jbatch/src/main/java/org/eclipse/kapua/job/engine/jbatch/driver/JbatchDriver.java`
#### Snippet
```java
     * @since 1.0.0
     */
    public static void stopJob(@NotNull KapuaId scopeId, @NotNull KapuaId jobId, KapuaId toStopJobExecutionId) throws JbatchDriverException, KapuaException {

        String jobName = getJbatchJobName(scopeId, jobId);
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `containers` initializer `null` is redundant
in `qa/integration-steps/src/main/java/org/eclipse/kapua/qa/integration/steps/DockerSteps.java`
#### Snippet
```java
    private void removeContainer(String name) {
        logger.info("Removing container {}...", name);
        List<Container> containers = null;
        try {
            containers = DockerUtil.getDockerClient().listContainers(ListContainersParam.filter("name", name));
```

### UnusedAssignment
Variable `containers` initializer `null` is redundant
in `qa/integration-steps/src/main/java/org/eclipse/kapua/qa/integration/steps/DockerSteps.java`
#### Snippet
```java

    private void printContainerLog(String name) {
        List<Container> containers = null;
        try {
            containers = DockerUtil.getDockerClient().listContainers(ListContainersParam.filter("name", name));
```

### UnusedAssignment
Variable `tmpId` initializer `null` is redundant
in `service/datastore/test-steps/src/main/java/org/eclipse/kapua/service/datastore/steps/DatastoreSteps.java`
#### Snippet
```java
    public void insertRandomMessagesIntoDatastoreWithCurrentTimestamps(String msgListKey, String idListKey) throws KapuaException {
        List<KapuaDataMessage> tmpMsgList = (List<KapuaDataMessage>) stepData.get(msgListKey);
        StorableId tmpId = null;
        List<StorableId> tmpList = new ArrayList<>();
        for (KapuaDataMessage tmpMsg : tmpMsgList) {
```

### UnusedAssignment
Variable `tmpId` initializer `null` is redundant
in `service/datastore/test-steps/src/main/java/org/eclipse/kapua/service/datastore/steps/DatastoreSteps.java`
#### Snippet
```java
    private List<StorableId> insertMessagesInStore(List<KapuaDataMessage> messages) throws KapuaException {

        StorableId tmpId = null;
        List<StorableId> tmpList = new ArrayList<>();

```

### UnusedAssignment
Variable `tmpList` initializer `null` is redundant
in `service/datastore/test-steps/src/main/java/org/eclipse/kapua/service/datastore/steps/DatastoreSteps.java`
#### Snippet
```java
        AndPredicate andPredicate = datastorePredicateFactory.newAndPredicate();
        TermPredicate tmpPred = datastorePredicateFactory.newTermPredicate(MetricInfoField.CHANNEL, topic);
        MetricInfoListResult tmpList = null;
        andPredicate.getPredicates().add(tmpPred);
        tmpQuery.setPredicate(andPredicate);
```

### UnusedAssignment
Variable `tmpMsg` initializer `null` is redundant
in `service/datastore/test-steps/src/main/java/org/eclipse/kapua/service/datastore/steps/DatastoreSteps.java`
#### Snippet
```java
    public void prepareAListOfMessagesWithDifferentTopics(String listKey, List<CucTopic> topics) throws Exception {
        List<KapuaDataMessage> tmpList = new ArrayList<>();
        KapuaDataMessage tmpMsg = null;
        for (CucTopic tmpTopic : topics) {
            tmpMsg = createTestMessage(
```

### UnusedAssignment
Variable `tmpList` initializer `null` is redundant
in `service/datastore/test-steps/src/main/java/org/eclipse/kapua/service/datastore/steps/DatastoreSteps.java`
#### Snippet
```java
        AndPredicate andPredicate = datastorePredicateFactory.newAndPredicate();
        TermPredicate tmpPred = datastorePredicateFactory.newTermPredicate(MetricInfoField.CLIENT_ID, clientId);
        MetricInfoListResult tmpList = null;
        andPredicate.getPredicates().add(tmpPred);
        tmpQuery.setPredicate(andPredicate);
```

### UnusedAssignment
Variable `authorizationEntries` initializer `null` is redundant
in `broker/core/src/main/java/org/eclipse/kapua/broker/core/plugin/authentication/DefaultAuthenticator.java`
#### Snippet
```java
    public List<AuthorizationEntry> connect(KapuaSecurityContext kapuaSecurityContext)
            throws KapuaException {
        List<AuthorizationEntry> authorizationEntries = null;
        if (isAdminUser(kapuaSecurityContext)) {
            loginMetric.getKapuasysTokenAttempt().inc();
```

### UnusedAssignment
Variable `kapuaSecurityContext` initializer `null` is redundant
in `broker/core/src/main/java/org/eclipse/kapua/broker/core/plugin/KapuaSecurityBrokerFilter.java`
#### Snippet
```java
        ThreadContext.unbindSubject();
        Context loginTotalContext = loginMetric.getAddConnectionTime().time();
        KapuaSecurityContext kapuaSecurityContext = null;

        try {
```

### UnusedAssignment
Variable `responseMessage` initializer `null` is redundant
in `service/device/commons/src/main/java/org/eclipse/kapua/service/device/management/commons/call/DeviceCallExecutor.java`
#### Snippet
```java
            //
            // Send the request
            DeviceResponseMessage<?, ?> responseMessage = null;
            switch (requestMessage.getChannel().getMethod()) {
                case CREATE:
```

### UnusedAssignment
Variable `messageStoreConfiguration` initializer `null` is redundant
in `service/datastore/internal/src/main/java/org/eclipse/kapua/service/datastore/internal/ConfigurationProviderImpl.java`
#### Snippet
```java
    public MessageStoreConfiguration getConfiguration(KapuaId scopeId)
            throws ConfigurationException {
        MessageStoreConfiguration messageStoreConfiguration = null;
        try {
            messageStoreConfiguration = new MessageStoreConfiguration(configurableService.getConfigValues(scopeId));
```

### UnusedAssignment
Variable `response` initializer `null` is redundant
in `service/datastore/internal/src/main/java/org/eclipse/kapua/service/datastore/internal/ClientInfoRegistryFacade.java`
#### Snippet
```java
        StorableId storableId = STORABLE_ID_FACTORY.newStorableId(clientInfoId);

        UpdateResponse response = null;
        // Store channel. Look up channel in the cache, and cache it if it doesn't exist
        if (!DatastoreCacheManager.getInstance().getClientsCache().get(clientInfo.getClientId())) {
```

### UnusedAssignment
Variable `metricsMapping` initializer `null` is redundant
in `service/datastore/internal/src/main/java/org/eclipse/kapua/service/datastore/internal/schema/Schema.java`
#### Snippet
```java
        Metadata currentMetadata = DatastoreCacheManager.getInstance().getMetadataCache().get(newIndex);

        ObjectNode metricsMapping = null;
        Map<String, Metric> diffs = null;

```

### UnusedAssignment
Variable `diffs` initializer `null` is redundant
in `service/datastore/internal/src/main/java/org/eclipse/kapua/service/datastore/internal/schema/Schema.java`
#### Snippet
```java

        ObjectNode metricsMapping = null;
        Map<String, Metric> diffs = null;

        synchronized (Schema.class) {
```

### UnusedAssignment
Variable `convertedValue` initializer `null` is redundant
in `service/datastore/internal/src/main/java/org/eclipse/kapua/service/datastore/internal/mediator/DatastoreUtils.java`
#### Snippet
```java
     */
    public static Object convertToCorrectType(String acronymType, Object value) {
        Object convertedValue = null;
        if (CLIENT_METRIC_TYPE_DOUBLE_ACRONYM.equals(acronymType)) {
            if (value instanceof Number) {
```

### UnusedAssignment
Variable `normName` initializer `null` is redundant
in `service/datastore/internal/src/main/java/org/eclipse/kapua/service/datastore/internal/mediator/DatastoreUtils.java`
#### Snippet
```java

    private static String normalizeIndexName(String name) {
        String normName = null;
        try {
            DatastoreUtils.checkIdxAliasName(name);
```

### UnusedAssignment
Variable `jwt` initializer `null` is redundant
in `service/security/shiro/src/main/java/org/eclipse/kapua/service/authentication/shiro/AuthenticationServiceShiroImpl.java`
#### Snippet
```java
        claims.setClaim("sId", scopeId.toCompactId());

        String jwt = null;
        try {
            CertificateQuery certificateQuery = certificateFactory.newQuery(scopeId);
```

### UnusedAssignment
Variable `scratchCode` initializer `null` is redundant
in `service/security/shiro/src/main/java/org/eclipse/kapua/service/authentication/credential/mfa/shiro/ScratchCodeServiceImpl.java`
#### Snippet
```java
        //
        // Do create
        ScratchCode scratchCode = null;
        EntityManager em = AuthenticationEntityManagerFactory.getEntityManager();
        try {
```

### UnusedAssignment
Variable `mqttClient` initializer `null` is redundant
in `service/device/registry/test-steps/src/main/java/org/eclipse/kapua/service/device/registry/steps/MqttDevice.java`
#### Snippet
```java
        clientOpts.setUserName(userName);
        clientOpts.setPassword(password.toCharArray());
        MqttClient mqttClient = null;
        mqttClient = new MqttClient(BROKER_URI, clientId,
                new MemoryPersistence());
```

### UnusedAssignment
Variable `kuraPayload` initializer `null` is redundant
in `service/device/registry/test-steps/src/main/java/org/eclipse/kapua/service/device/registry/steps/KuraDevice.java`
#### Snippet
```java

        String value = null;
        KuraPayloadProto.KuraPayload kuraPayload = null;
        try {
            kuraPayload = KuraPayloadProto.KuraPayload.parseFrom(payload);
```

### UnusedAssignment
Variable `targetFound` initializer `null` is redundant
in `service/job/test-steps/src/main/java/org/eclipse/kapua/service/job/steps/JobTargetServiceSteps.java`
#### Snippet
```java
            JobTarget jobTarget = (JobTarget) stepData.get(JOB_TARGET);
            long endWaitTime = System.currentTimeMillis() + timeout * 1000;
            JobTarget targetFound = null;
            do {
                targetFound = jobTargetService.find(jobTarget.getScopeId(), jobTarget.getId());
```

### UnusedAssignment
Variable `protoPos` initializer `null` is redundant
in `service/device/call/kura/src/main/java/org/eclipse/kapua/service/device/call/message/kura/KuraPayload.java`
#### Snippet
```java

    private KuraPayloadProto.KuraPayload.KuraPosition buildPositionProtoBuf(DevicePosition position) {
        KuraPayloadProto.KuraPayload.KuraPosition.Builder protoPos = null;
        protoPos = KuraPayloadProto.KuraPayload.KuraPosition.newBuilder();

```

### UnusedAssignment
Variable `protoMsg` initializer `null` is redundant
in `service/device/call/kura/src/main/java/org/eclipse/kapua/service/device/call/message/kura/KuraPayload.java`
#### Snippet
```java
        //
        // Convert protobuf
        KuraPayloadProto.KuraPayload protoMsg = null;
        try {
            protoMsg = KuraPayloadProto.KuraPayload.parseFrom(bytes);
```

### UnusedAssignment
Variable `tmpCreator` initializer `null` is redundant
in `service/device/registry/test-steps/src/main/java/org/eclipse/kapua/service/device/registry/steps/DeviceRegistrySteps.java`
#### Snippet
```java
    @Then("All connection factory functions must return non null values")
    public void exerciseAllConnectionFactoryFunctions() {
        DeviceConnectionCreator tmpCreator = null;
        DeviceConnectionQuery tmpQuery = null;
        tmpCreator = deviceConnectionFactory.newCreator(SYS_SCOPE_ID);
```

### UnusedAssignment
Variable `tmpQuery` initializer `null` is redundant
in `service/device/registry/test-steps/src/main/java/org/eclipse/kapua/service/device/registry/steps/DeviceRegistrySteps.java`
#### Snippet
```java
    public void exerciseAllConnectionFactoryFunctions() {
        DeviceConnectionCreator tmpCreator = null;
        DeviceConnectionQuery tmpQuery = null;
        tmpCreator = deviceConnectionFactory.newCreator(SYS_SCOPE_ID);
        tmpQuery = deviceConnectionFactory.newQuery(SYS_SCOPE_ID);
```

### UnusedAssignment
Variable `tmpEvent` initializer `null` is redundant
in `service/device/registry/test-steps/src/main/java/org/eclipse/kapua/service/device/registry/steps/DeviceRegistrySteps.java`
#### Snippet
```java
    @Then("All device event factory functions must return non null objects")
    public void exerciseAllEventFactoryFunctions() {
        DeviceEvent tmpEvent = null;
        DeviceEventCreator tmpCreator = null;
        DeviceEventQuery tmpQuery = null;
```

### UnusedAssignment
Variable `tmpCreator` initializer `null` is redundant
in `service/device/registry/test-steps/src/main/java/org/eclipse/kapua/service/device/registry/steps/DeviceRegistrySteps.java`
#### Snippet
```java
    public void exerciseAllEventFactoryFunctions() {
        DeviceEvent tmpEvent = null;
        DeviceEventCreator tmpCreator = null;
        DeviceEventQuery tmpQuery = null;
        DeviceEventListResult tmpList = null;
```

### UnusedAssignment
Variable `tmpQuery` initializer `null` is redundant
in `service/device/registry/test-steps/src/main/java/org/eclipse/kapua/service/device/registry/steps/DeviceRegistrySteps.java`
#### Snippet
```java
        DeviceEvent tmpEvent = null;
        DeviceEventCreator tmpCreator = null;
        DeviceEventQuery tmpQuery = null;
        DeviceEventListResult tmpList = null;
        tmpEvent = eventFactory.newEntity(SYS_SCOPE_ID);
```

### UnusedAssignment
Variable `tmpList` initializer `null` is redundant
in `service/device/registry/test-steps/src/main/java/org/eclipse/kapua/service/device/registry/steps/DeviceRegistrySteps.java`
#### Snippet
```java
        DeviceEventCreator tmpCreator = null;
        DeviceEventQuery tmpQuery = null;
        DeviceEventListResult tmpList = null;
        tmpEvent = eventFactory.newEntity(SYS_SCOPE_ID);
        tmpCreator = eventFactory.newCreator(SYS_SCOPE_ID, getKapuaId(), new Date(), "");
```

### UnusedAssignment
Variable `kapuaEventHousekeeper` initializer `null` is redundant
in `commons/src/main/java/org/eclipse/kapua/commons/event/ServiceEventHousekeeper.java`
#### Snippet
```java

    private HousekeeperRun getLock(String serviceName) throws LockException, NoExecutionNeededException {
        HousekeeperRun kapuaEventHousekeeper = null;
        try {
            manager.beginTransaction();
```

### UnusedAssignment
Variable `returnObject` initializer `null` is redundant
in `commons/src/main/java/org/eclipse/kapua/commons/event/RaiseServiceEventInterceptor.java`
#### Snippet
```java
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        Object returnObject = null;

        try {
```

### UnusedAssignment
The value `null` assigned to `instanceToCleanUp` is never used
in `commons/src/main/java/org/eclipse/kapua/commons/event/jms/JMSServiceEventBus.java`
#### Snippet
```java
                LOGGER.error("Stopping old Service Event Bus instance. Cannot destroy instance: {}", e.getMessage(), e);
            } finally {
                instanceToCleanUp = null;
            }
        }
```

### UnusedAssignment
Variable `minVal` initializer `null` is redundant
in `commons/src/main/java/org/eclipse/kapua/commons/configuration/ValueTokenizer.java`
#### Snippet
```java
                // Check the type. Also check the range if min or max were declared.
                boolean rangeError = false;
                Object minVal = null;
                Object maxVal = null;
                TscalarImpl adScalarType = TscalarImpl.fromValue(ad.getType().value());
```

### UnusedAssignment
Variable `maxVal` initializer `null` is redundant
in `commons/src/main/java/org/eclipse/kapua/commons/configuration/ValueTokenizer.java`
#### Snippet
```java
                boolean rangeError = false;
                Object minVal = null;
                Object maxVal = null;
                TscalarImpl adScalarType = TscalarImpl.fromValue(ad.getType().value());
                switch (adScalarType) {
```

### UnusedAssignment
Variable `role` initializer `null` is redundant
in `service/security/test-steps/src/main/java/org/eclipse/kapua/service/authorization/steps/AuthorizationServiceSteps.java`
#### Snippet
```java
        ArrayList<Role> roleArrayList = new ArrayList<Role>();
        stepData.remove(ROLE_LIST);
        Role role = null;
        for (CucRole roleName : roleNames) {
            roleCreator.setName(roleName.getName());
```

### UnusedAssignment
Variable `tmpDom2` initializer `null` is redundant
in `service/security/test-steps/src/main/java/org/eclipse/kapua/service/authorization/steps/AuthorizationServiceSteps.java`
#### Snippet
```java
            Assert.assertFalse(tmpDom1.equals(null));
            Assert.assertFalse(tmpDom1.equals(String.valueOf("")));
            Domain tmpDom2 = null;
            tmpDom2 = domainRegistryService.find(null, tmpDom1.getId());
            Assert.assertNotNull(tmpDom2);
```

### UnusedAssignment
Variable `group` initializer `null` is redundant
in `service/security/test-steps/src/main/java/org/eclipse/kapua/service/authorization/steps/AuthorizationServiceSteps.java`
#### Snippet
```java
    @Given("I create the group(s)")
    public void createAListOfGroups(List<CucGroup> groups) throws Exception {
        Group group = null;
        GroupCreator groupCreator = null;
        stepData.remove(GROUP_CREATOR);
```

### UnusedAssignment
Variable `groupCreator` initializer `null` is redundant
in `service/security/test-steps/src/main/java/org/eclipse/kapua/service/authorization/steps/AuthorizationServiceSteps.java`
#### Snippet
```java
    public void createAListOfGroups(List<CucGroup> groups) throws Exception {
        Group group = null;
        GroupCreator groupCreator = null;
        stepData.remove(GROUP_CREATOR);
        stepData.remove(GROUP);
```

### UnusedAssignment
Variable `rolePermission` initializer `null` is redundant
in `service/security/test-steps/src/main/java/org/eclipse/kapua/service/authorization/steps/AuthorizationServiceSteps.java`
#### Snippet
```java
        Assert.assertEquals(accountName, account.getName());
        Domain domain = (Domain) stepData.get(DOMAIN);
        RolePermission rolePermission = null;
        ArrayList<RolePermission> rolePermissions = new ArrayList<>();
        stepData.remove(CHILD_ACCOUNT_ROLE_PERMISSION);
```

### UnusedAssignment
Variable `roleCreator` initializer `null` is redundant
in `service/security/test-steps/src/main/java/org/eclipse/kapua/service/authorization/steps/AuthorizationServiceSteps.java`
#### Snippet
```java
    public void createAListOfRoles(List<CucRole> roles) throws Exception {
        Domain domain = (Domain) stepData.get(DOMAIN);
        RoleCreator roleCreator = null;
        Set<Permission> permissions;
        Role role = null;
```

### UnusedAssignment
Variable `role` initializer `null` is redundant
in `service/security/test-steps/src/main/java/org/eclipse/kapua/service/authorization/steps/AuthorizationServiceSteps.java`
#### Snippet
```java
        RoleCreator roleCreator = null;
        Set<Permission> permissions;
        Role role = null;
        stepData.remove(PERMISSIONS);
        stepData.remove(ROLE_CREATOR);
```

### UnusedAssignment
Variable `roleCreator` initializer `null` is redundant
in `service/security/test-steps/src/main/java/org/eclipse/kapua/service/authorization/steps/AuthorizationServiceSteps.java`
#### Snippet
```java
        Account account = (Account) stepData.get(LAST_ACCOUNT);
        Assert.assertEquals(accountName, account.getName());
        RoleCreator roleCreator = null;
        roleCreator = roleFactory.newCreator(account.getId());
        roleCreator.setName(roleName);
```

### UnusedAssignment
Variable `tmpPerm` initializer `null` is redundant
in `service/security/test-steps/src/main/java/org/eclipse/kapua/service/authorization/steps/AuthorizationServiceSteps.java`
#### Snippet
```java
    @Then("The permission factory returns sane results")
    public void permissionFactorySanityChecks() throws KapuaException {
        Permission tmpPerm = null;
        TestDomain tmpDomain = new TestDomain();
        tmpPerm = permissionFactory.newPermission(tmpDomain, Actions.read, SYS_SCOPE_ID);
```

### UnusedAssignment
Variable `domainCreator` initializer `null` is redundant
in `service/security/test-steps/src/main/java/org/eclipse/kapua/service/authorization/steps/AuthorizationServiceSteps.java`
#### Snippet
```java
    @Given("I create the domain(s)")
    public void createAListOfDomains(List<CucDomain> domains) throws Exception {
        DomainCreator domainCreator = null;
        Domain domain = null;
        stepData.remove(DOMAIN_CREATOR);
```

### UnusedAssignment
Variable `domain` initializer `null` is redundant
in `service/security/test-steps/src/main/java/org/eclipse/kapua/service/authorization/steps/AuthorizationServiceSteps.java`
#### Snippet
```java
    public void createAListOfDomains(List<CucDomain> domains) throws Exception {
        DomainCreator domainCreator = null;
        Domain domain = null;
        stepData.remove(DOMAIN_CREATOR);
        stepData.remove(DOMAIN);
```

## RuleId[id=IndexOfReplaceableByContains]
### IndexOfReplaceableByContains
`channel.indexOf(SINGLE_LEVEL_WCARD) != -1` can be replaced with 'channel.contains(SINGLE_LEVEL_WCARD)'
in `service/datastore/internal/src/main/java/org/eclipse/kapua/service/datastore/internal/mediator/DatastoreChannel.java`
#### Snippet
```java

        // Check if there is one single level wild card or if the multi level wild card is present more than once or not at the end of the topic
        if (channel.indexOf(SINGLE_LEVEL_WCARD) != -1) {
            throw new InvalidChannelException(String.format("Invalid channel [%s]. The channel cannot contain [%s] wildcard!", channel, SINGLE_LEVEL_WCARD));
        }
```

## RuleId[id=ReplaceInefficientStreamCount]
### ReplaceInefficientStreamCount
Can be replaced with 'stream.noneMatch()'
in `commons/src/main/java/org/eclipse/kapua/commons/configuration/ValueTokenizer.java`
#### Snippet
```java
            for (String s : values) {
                // If options were declared and the value does not match one of them, the value is not valid.
                if (!ad.getOption().isEmpty() && ad.getOption().stream().filter(option -> s.equals(option.getValue())).count() == 0) {
                    return MessageFormat.format(VALUE_OUT_OF_OPTION, s);
                }
```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `consumer/lifecycle-app/src/main/java/org/eclipse/kapua/consumer/lifecycle/LifecycleRouteHealthIndicator.java`
#### Snippet
```java
                running++;
            }
        };
        details.put("running", running);
        if (routeCount <= running) {
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `service/user/api/src/main/java/org/eclipse/kapua/service/user/UserStatus.java`
#### Snippet
```java
     * Disabled
     */
    DISABLED;
}

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `consumer/telemetry-app/src/main/java/org/eclipse/kapua/consumer/telemetry/TelemetryRouteHealthIndicator.java`
#### Snippet
```java
                running++;
            }
        };
        details.put("running", running);
        if (routeCount <= running) {
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `service/device/registry/api/src/main/java/org/eclipse/kapua/service/device/registry/connection/option/ConnectionServiceErrorCodes.java`
#### Snippet
```java
     * User is already reserved by another connection
     */
    USER_ALREADY_RESERVED_BY_ANOTHER_CONNECTION;

}
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/app/deploy/DownloadSimulator.java`
#### Snippet
```java

    public static enum JobState {
        RUNNING, COMPLETED, CANCELED, FAILED;
    }

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `service/security/authentication/api/src/main/java/org/eclipse/kapua/service/authentication/credential/CredentialType.java`
#### Snippet
```java
     * Json Web Token
     */
    JWT;
}

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `service/device/call/kura/src/main/java/org/eclipse/kapua/service/device/call/kura/exception/KuraDeviceCallErrorCodes.java`
#### Snippet
```java
     */
    CLIENT_SEND_ERROR,
    ;
}

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `job-engine/jbatch/src/main/java/org/eclipse/kapua/job/engine/jbatch/driver/exception/JbatchDriverErrorCodes.java`
#### Snippet
```java
    JOB_EXECUTION_IS_RUNNING,

    CANNOT_CLEAN_JOB_DATA;
}

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `job-engine/commons/src/main/java/org/eclipse/kapua/job/engine/commons/operation/AbstractDeviceTargetProcessor.java`
#### Snippet
```java
    @Override
    protected String getTargetDisplayName(JobTarget jobTarget) throws KapuaException {
        Device device = KapuaSecurityUtils.doPrivileged(() -> DEVICE_REGISTRY_SERVICE.find(jobTarget.getScopeId(), jobTarget.getJobTargetId()));;
        if (device == null) {
            return "N/A";
```

## RuleId[id=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `client/gateway/spi/src/main/java/org/eclipse/kapua/client/gateway/spi/util/TransportAsync.java`
#### Snippet
```java

        final CopyOnWriteArraySet<Listener> listeners = new CopyOnWriteArraySet<>(this.listeners);
        return executor.submit(() -> listeners.stream().forEach(l -> l.stateChange(state)));
    }

```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `client/gateway/spi/src/main/java/org/eclipse/kapua/client/gateway/spi/util/TransportProxy.java`
#### Snippet
```java
    private void fireEvent(final boolean state, final Set<Listener> listeners) {
        executor.execute(() -> {
            listeners.stream().forEach(l -> l.stateChange(state));
        });
    }
```

### SimplifyStreamApiCallChains
'Arrays.asList().stream()' can be replaced with 'Arrays.stream()'
in `service/security/shiro/src/main/java/org/eclipse/kapua/service/security/EnhModularRealmAuthorizer.java`
#### Snippet
```java
    @Override
    public boolean[] isPermitted(PrincipalCollection principals, String... permissions) {
        return isPermitted(principals, Arrays.asList(permissions).stream()
                .map(permission -> getPermissionResolver().resolvePermission(permission))
                .collect(Collectors.toList()));
```

## RuleId[id=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
Unnecessary string length argument
in `service/datastore/test-steps/src/main/java/org/eclipse/kapua/service/datastore/steps/DatastoreSteps.java`
#### Snippet
```java
        int lastDot = field.lastIndexOf('.');
        if (lastDot > -1) {
            field = field.substring(lastDot + 1, field.length());
        }

```

### StringOperationCanBeSimplified
Call to `substring()` is redundant
in `broker/core/src/main/java/org/eclipse/kapua/broker/core/plugin/KapuaSecurityBrokerFilter.java`
#### Snippet
```java
            if (destinationsPath != null && destinationsPath.length >= 2 && destinationsPath[0].equals(VT_CONSUMER_PREFIX)) {
                StringBuilder sb = new StringBuilder();
                sb.append(destination.substring(0, destinationsPath[0].length() + 1));
                sb.append(context.getClientId());
                if (destinationsPath[1].endsWith(":EXACTLY_ONCE")) {
```

### StringOperationCanBeSimplified
Unnecessary string length argument
in `service/security/shiro/src/main/java/org/eclipse/kapua/service/authentication/credential/shiro/CredentialDAO.java`
#### Snippet
```java
        String hashedValue = credentialPlainKey.substring(0, preLength); // Add the pre in clear text
        hashedValue += preSeparator; // Add separator
        hashedValue += AuthenticationUtils.cryptCredential(CryptAlgorithm.BCRYPT, credentialPlainKey.substring(preLength, credentialPlainKey.length())); // Bcrypt the rest

        return hashedValue;
```

### StringOperationCanBeSimplified
`toUpperCase()` call can be replaced with 'equalsIgnoreCase()'
in `service/job/test-steps/src/main/java/org/eclipse/kapua/service/job/steps/JobStepDefinitionServiceSteps.java`
#### Snippet
```java

    private JobStepType getTypeFromString(String type) {
        if (type.trim().toUpperCase().equals("TARGET")) {
            return JobStepType.TARGET;
        } else {
```

### StringOperationCanBeSimplified
`toLowerCase()` call can be replaced with 'equalsIgnoreCase()'
in `service/device/registry/test-steps/src/main/java/org/eclipse/kapua/service/device/registry/steps/DeviceRegistrySteps.java`
#### Snippet
```java
        Device device = (Device) stepData.get(DEVICE);
        try {
            if (deviceStatus.trim().toLowerCase().equals("enabled")) {
                device.setStatus(DeviceStatus.ENABLED);
            } else if (deviceStatus.trim().toLowerCase().equals("disabled")) {
```

### StringOperationCanBeSimplified
`toLowerCase()` call can be replaced with 'equalsIgnoreCase()'
in `service/device/registry/test-steps/src/main/java/org/eclipse/kapua/service/device/registry/steps/DeviceRegistrySteps.java`
#### Snippet
```java
            if (deviceStatus.trim().toLowerCase().equals("enabled")) {
                device.setStatus(DeviceStatus.ENABLED);
            } else if (deviceStatus.trim().toLowerCase().equals("disabled")) {
                device.setStatus(DeviceStatus.DISABLED);
            }
```

### StringOperationCanBeSimplified
Call to `substring()` is redundant
in `commons/src/main/java/org/eclipse/kapua/commons/util/StringUtil.java`
#### Snippet
```java
                                }
                                if (c2 != DELIMITER) {
                                    buffer.append(strValues.substring(i, j));
                                }
                                // Let loop counter i catch up with the inner loop but keep in
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `commons/src/main/java/org/eclipse/kapua/commons/util/StringUtil.java`
#### Snippet
```java
            for (int i = 0; i < ss.length; i++) {
                if (ss[i] != null) {
                    sb.append(escapeString(ss[i].toString()));
                    if (i != ss.length - 1) {
                        sb.append(",");
```

### StringOperationCanBeSimplified
Call to `substring()` is redundant
in `commons/src/main/java/org/eclipse/kapua/commons/configuration/ValueTokenizer.java`
#### Snippet
```java
                            }
                            if (c2 != DELIMITER) {
                                buffer.append(valuesStr.substring(i, j));
                            }
                            // Let loop counter i catch up with the inner loop but keep in
```

## RuleId[id=UnnecessaryCallToStringValueOf]
### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `service/datastore/internal/src/main/java/org/eclipse/kapua/service/datastore/internal/mediator/DatastoreUtils.java`
#### Snippet
```java
            newName = newName.replace(String.valueOf(SPECIAL_DOLLAR), SPECIAL_DOLLAR_ESC);
            newName = newName.replace(String.valueOf(SPECIAL_DOT), SPECIAL_DOT_ESC);
            LOG.trace(String.format("Metric %s contains a special char '%s' that will be replaced with '%s'", name, String.valueOf(SPECIAL_DOT), SPECIAL_DOT_ESC));
        }
        return newName;
```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `service/device/registry/test-steps/src/main/java/org/eclipse/kapua/service/device/registry/steps/DeviceRegistrySteps.java`
#### Snippet
```java
            for (int i = 0; i < number; i++) {
                tmpId = new KapuaEid(BigInteger.valueOf(scope));
                tmpClient = "test_" + String.valueOf(random.nextInt());
                tmpDevCr = deviceFactory.newCreator(tmpId, tmpClient);
                deviceRegistryService.create(tmpDevCr);
```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `service/device/registry/test-steps/src/main/java/org/eclipse/kapua/service/device/registry/steps/DeviceRegistrySteps.java`
#### Snippet
```java
        try {
            for (int i = 0; i < number; i++) {
                tmpDevCr = deviceFactory.newCreator(getCurrentScopeId(), "test_" + String.valueOf(random.nextInt()));
                tmpDevCr.setBiosVersion(version);
                deviceRegistryService.create(tmpDevCr);
```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `service/security/test-steps/src/main/java/org/eclipse/kapua/service/authorization/steps/AuthorizationServiceSteps.java`
#### Snippet
```java
            Assert.assertTrue(tmpDom1.equals(tmpDom1));
            Assert.assertFalse(tmpDom1.equals(null));
            Assert.assertFalse(tmpDom1.equals(String.valueOf("")));
            Domain tmpDom2 = null;
            tmpDom2 = domainRegistryService.find(null, tmpDom1.getId());
```

## RuleId[id=NonStrictComparisonCanBeEquality]
### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `client/gateway/api/src/main/java/org/eclipse/kapua/client/gateway/Topic.java`
#### Snippet
```java
        }

        if (strings == null || strings.length <= 0) {
            return new Topic(Collections.singletonList(ensureNotSpecial(first)));
        }
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `service/datastore/test-steps/src/main/java/org/eclipse/kapua/service/datastore/steps/DatastoreSteps.java`
#### Snippet
```java

        String[] str = field.split("_");
        if (str.length <= 0) {
            throw new IllegalArgumentException(String.format("Invalid field name [%s]", field));
        }
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `service/security/shiro/src/main/java/org/eclipse/kapua/service/authentication/shiro/KapuaAuthenticator.java`
#### Snippet
```java
        if (supportedRealmFound && !loginSucceeded) {
            // if there is no realm able to authenticate the AuthenticationToken (but at least one realm for this AuthenticationToken was found) lets check the exceptions thrown by the logins
            if (exceptionList.size() <= 0) {
                // login failed and we have no exception to show so throw a ShiroException?
                // TODO move the error message to the message bundle
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `commons/src/main/java/org/eclipse/kapua/commons/jpa/EntityManagerSession.java`
#### Snippet
```java
            //override only if parameters are not evaluated
            logger.info("Updating service event entity infos (type, id and scope id) if missing...");
            if (serviceEvent.getEntityType() == null || serviceEvent.getEntityType().trim().length() <= 0) {
                logger.info("Kapua event - update entity type to '{}'", kapuaEntity.getClass().getName());
                serviceEvent.setEntityType(kapuaEntity.getClass().getName());
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `commons/src/main/java/org/eclipse/kapua/commons/util/ClassUtil.java`
#### Snippet
```java
            throw new KapuaException(KapuaErrorCodes.INTERNAL_ERROR, String.format(CANNOT_LOAD_INSTANCE_ERROR_MSG, clazz, clazzToInstantiate));
        }
        if (parameterTypes == null || parameterTypes.length <= 0) {
            try {
                instance = clazzToInstantiate.newInstance();
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `service/device/management/registry/api/src/main/java/org/eclipse/kapua/service/device/management/registry/manager/DeviceManagementRegistryManagerService.java`
#### Snippet
```java
                attempts++;

                if (attempts >= limit) {
                    throw e;
                } else {
```

## RuleId[id=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'payload'
in `client/gateway/api/src/main/java/org/eclipse/kapua/client/gateway/ErrorHandler.java`
#### Snippet
```java
public interface ErrorHandler<X extends Throwable> {

    public void handleError(Throwable e, Optional<Payload> payload) throws X;
}

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'payload'
in `client/gateway/api/src/main/java/org/eclipse/kapua/client/gateway/util/Errors.java`
#### Snippet
```java
    }

    public static void ignore(final Throwable e, final Optional<Payload> payload) {
        // Ignore the error
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'hostFromCli'
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/main/SimulatorRunner.java`
#### Snippet
```java
    }

    private static String createBrokerUrl(final Optional<String> hostFromCli) {
        final String broker = System.getenv("KSIM_BROKER_URL");
        if (broker != null && !broker.isEmpty()) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'type'
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/generator/basic/AbstractGeneratorFactory.java`
#### Snippet
```java
public abstract class AbstractGeneratorFactory implements GeneratorFactory {

    private final Optional<String> type;

    protected AbstractGeneratorFactory(final String typeName) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'schema'
in `commons/src/main/java/org/eclipse/kapua/commons/liquibase/KapuaLiquibaseClient.java`
#### Snippet
```java
     */
    @Deprecated
    public KapuaLiquibaseClient(String jdbcUrl, String username, String password, Optional<String> schema) {
        this(jdbcUrl, username, password, schema.orElse(null));
    }
```

## RuleId[id=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `qa/integration-steps/src/main/java/org/eclipse/kapua/qa/integration/steps/RestClientSteps.java`
#### Snippet
```java
        Account account = XmlUtil.unmarshalJson(restResponse, Account.class);
        KapuaId accId = account.getId();
        System.out.println("Account Id = " + accId);
        stepData.put("lastAccountId", accId.toStringId());
        stepData.put("lastAccountCompactId", accId.toCompactId());
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/main/SimulatorRunner.java`
#### Snippet
```java
            cli = new DefaultParser().parse(opts, args);
        } catch (final ParseException e) {
            System.err.println(e.getLocalizedMessage());
            System.exit(-1);
            return;
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `client/gateway/api/src/main/java/org/eclipse/kapua/client/gateway/Topic.java`
#### Snippet
```java
        }

        path = path.replaceAll("(^/+|/$)+", "");

        if (path.isEmpty()) {
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `client/gateway/api/src/main/java/org/eclipse/kapua/client/gateway/Topic.java`
#### Snippet
```java
        }

        return new Topic(Arrays.asList(path.split("\\/+")));
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `translator/kapua/kura/src/main/java/org/eclipse/kapua/translator/kura/kapua/keystore/TranslatorAppKeystoreCsrKuraKapua.java`
#### Snippet
```java

        String kuraKeystoreCsrString = new String(kuraResponsePayload.getBody());
        kuraKeystoreCsrString = kuraKeystoreCsrString.replace("\"", "");
        kuraKeystoreCsrString = kuraKeystoreCsrString.replace("\\n", "\n");

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `translator/kapua/kura/src/main/java/org/eclipse/kapua/translator/kura/kapua/keystore/TranslatorAppKeystoreCsrKuraKapua.java`
#### Snippet
```java
        String kuraKeystoreCsrString = new String(kuraResponsePayload.getBody());
        kuraKeystoreCsrString = kuraKeystoreCsrString.replace("\"", "");
        kuraKeystoreCsrString = kuraKeystoreCsrString.replace("\\n", "\n");

        KuraKeystoreCSR kuraKeystoreCSR = new KuraKeystoreCSR();
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `extras/es-migrator/src/main/java/org/eclipse/kapua/extras/esmigrator/Migrator.java`
#### Snippet
```java
            return;
        }
        File reportFile = new File(reportDir, new Date().toString().replace(" ", "_") + ".txt");
        try (PrintWriter printWriter = new PrintWriter(reportFile)) {
            for (Map.Entry<String, String> resultsEntry : migrationReport.entrySet()) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/main/NameFactories.java`
#### Snippet
```java
        }

        return string.replaceAll("\\.", "-").replaceAll("[^a-zA-Z0-9\\-]", "");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/main/NameFactories.java`
#### Snippet
```java
        }

        return string.replaceAll("\\.", "-").replaceAll("[^a-zA-Z0-9\\-]", "");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/birth/BirthCertificateBuilder.java`
#### Snippet
```java

                    // replace IPv6 interface
                    hostAddress = hostAddress.replaceAll("%.*$", "");

                    addresses.add(hostAddress);
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `rest-api/core/src/main/java/org/eclipse/kapua/app/api/core/auth/KapuaTokenAuthenticationFilter.java`
#### Snippet
```java
        String tokenId = null;
        if (authorizationHeader != null) {
            tokenId = httpRequest.getHeader(AUTHORIZATION_HEADER).replace(BEARER + " ", "");
        }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `service/datastore/internal/src/main/java/org/eclipse/kapua/service/datastore/internal/mediator/DatastoreUtils.java`
#### Snippet
```java
    public static String restoreMetricName(String normalizedName) {
        String oldName = normalizedName;
        oldName = oldName.replace(SPECIAL_DOT_ESC, String.valueOf(SPECIAL_DOT));
        oldName = oldName.replace(SPECIAL_DOLLAR_ESC, String.valueOf(SPECIAL_DOLLAR));
        return oldName;
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `service/datastore/internal/src/main/java/org/eclipse/kapua/service/datastore/internal/mediator/DatastoreUtils.java`
#### Snippet
```java
        String oldName = normalizedName;
        oldName = oldName.replace(SPECIAL_DOT_ESC, String.valueOf(SPECIAL_DOT));
        oldName = oldName.replace(SPECIAL_DOLLAR_ESC, String.valueOf(SPECIAL_DOLLAR));
        return oldName;
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `service/datastore/internal/src/main/java/org/eclipse/kapua/service/datastore/internal/mediator/DatastoreUtils.java`
#### Snippet
```java
    public static String normalizeIndexAliasName(String alias) {
        String aliasName = normalizeIndexName(alias);
        aliasName = aliasName.replace("-", "_");
        return aliasName;
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `service/device/registry/test-steps/src/main/java/org/eclipse/kapua/service/device/registry/steps/KuraDevice.java`
#### Snippet
```java
                    if (inventoryBundleStarted) {
                        responseBodyString =
                                responseBodyString.replace("\"name\": \"io.netty.transport-native-unix-common\",\n" +
                                                "      \"version\": \"4.1.68.Final\",\n" +
                                                "      \"id\": 140,\n" +
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `service/device/registry/test-steps/src/main/java/org/eclipse/kapua/service/device/registry/steps/KuraDevice.java`
#### Snippet
```java
                    if (inventoryBundleStopped) {
                        responseBodyString =
                                responseBodyString.replace("\"name\": \"org.apache.felix.fileinstall\",\n" +
                                                "      \"version\": \"3.6.4\",\n" +
                                                "      \"id\": 178,\n" +
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `commons/src/main/java/org/eclipse/kapua/commons/util/StringUtil.java`
#### Snippet
```java

        // remove all space at the beginning of the string which are not escaped
        value = value.replaceAll("^((?<!\\\\) )*", "");

        // remove all space at the end of the string which are not escaped
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `commons/src/main/java/org/eclipse/kapua/commons/util/StringUtil.java`
#### Snippet
```java

        // remove all space at the end of the string which are not escaped
        value = value.replaceAll("((?<!\\\\) )*$", "");

        // replace all escaped spaces with just space
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `commons/src/main/java/org/eclipse/kapua/commons/util/StringUtil.java`
#### Snippet
```java
        // replace all escaped spaces with just space
        // The pattern covers for any even number of backslashes before the space char
        value = value.replaceAll("\\\\(\\\\\\\\)* ", " ");

        // replace all escaped comma with just comma
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `commons/src/main/java/org/eclipse/kapua/commons/util/StringUtil.java`
#### Snippet
```java
        // replace all escaped comma with just comma
        // The pattern covers for any even number of backslashes before the comma char
        value = value.replaceAll("\\\\(\\\\\\\\)*,", ",");

        return value;
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `commons/src/main/java/org/eclipse/kapua/commons/util/StringUtil.java`
#### Snippet
```java
    public static String escapeString(String s) {
        String escaped = s;
        escaped = escaped.replace("\\", "\\\\");
        escaped = escaped.replace(",", "\\,");
        escaped = escaped.replace(" ", "\\ ");
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `commons/src/main/java/org/eclipse/kapua/commons/util/StringUtil.java`
#### Snippet
```java
        String escaped = s;
        escaped = escaped.replace("\\", "\\\\");
        escaped = escaped.replace(",", "\\,");
        escaped = escaped.replace(" ", "\\ ");
        return escaped;
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `commons/src/main/java/org/eclipse/kapua/commons/util/StringUtil.java`
#### Snippet
```java
        escaped = escaped.replace("\\", "\\\\");
        escaped = escaped.replace(",", "\\,");
        escaped = escaped.replace(" ", "\\ ");
        return escaped;
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `commons/src/main/java/org/eclipse/kapua/commons/event/RaiseServiceEventInterceptor.java`
#### Snippet
```java
        String serviceInterface = implementedClass[0].getAnnotatedInterfaces()[0].getType().getTypeName();
        String genericsList = serviceInterface.substring(serviceInterface.indexOf('<') + 1, serviceInterface.indexOf('>'));
        String[] entityClassesToScan = genericsList.replaceAll("\\,", "").split(" ");
        for (String str : entityClassesToScan) {
            try {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `commons/src/main/java/org/eclipse/kapua/commons/setting/EnvFriendlyConfiguration.java`
#### Snippet
```java

    private String envKey(String key) {
        return key.toUpperCase().replaceAll("\\.", "_");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `commons/src/main/java/org/eclipse/kapua/commons/liquibase/KapuaLiquibaseClient.java`
#### Snippet
```java
        for (String script : changeLogs) {
            URL scriptUrl = KapuaLiquibaseClient.class.getResource("/" + script);
            File changelogFile = new File(changelogTempDirectory, script.replaceFirst("liquibase/", ""));
            if (changelogFile.getParentFile() != null && !changelogFile.getParentFile().exists()) {
                boolean createdParent = changelogFile.getParentFile().mkdirs();
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `broker/client/src/main/java/org/eclipse/kapua/broker/client/protocol/DefaultProtocolDescriptionProvider.java`
#### Snippet
```java

        String transports = p.getProperty("transports", "");
        for (String transport : transports.split("\\s*,\\s*")) {
            if (!transport.isEmpty()) {
                ProtocolDescriptor desc = loadFromProperties(p, transport);
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `job-engine/jbatch/src/main/java/org/eclipse/kapua/job/engine/jbatch/driver/JbatchDriver.java`
#### Snippet
```java
        // Start job
        try {
            JOB_OPERATOR.start(jobXmlDefinitionFile.getAbsolutePath().replaceAll("\\.xml$", ""), new Properties());
        } catch (NoSuchJobExecutionException | NoSuchJobException | JobSecurityException e) {
            throw new JobStartingDriverException(e, jobName);
```

## RuleId[id=SamePackageImport]
### SamePackageImport
Unnecessary import from the same package `import org.eclipse.kapua.service.device.management.bundle.job.definition.DeviceBundlePropertyKeys;`
in `service/device/management/bundle/job/src/main/java/org/eclipse/kapua/service/device/management/bundle/job/definition/DeviceBundleStopStepDefinition.java`
#### Snippet
```java
import org.eclipse.kapua.locator.KapuaLocator;
import org.eclipse.kapua.service.device.management.bundle.job.DeviceBundleStopTargetProcessor;
import org.eclipse.kapua.service.device.management.bundle.job.definition.DeviceBundlePropertyKeys;
import org.eclipse.kapua.service.job.step.definition.JobStepDefinition;
import org.eclipse.kapua.service.job.step.definition.JobStepDefinitionFactory;
```

### SamePackageImport
Unnecessary import from the same package `import org.eclipse.kapua.service.device.management.bundle.job.definition.DeviceBundlePropertyKeys;`
in `service/device/management/bundle/job/src/main/java/org/eclipse/kapua/service/device/management/bundle/job/definition/DeviceBundleStartStepDefinition.java`
#### Snippet
```java
import org.eclipse.kapua.locator.KapuaLocator;
import org.eclipse.kapua.service.device.management.bundle.job.DeviceBundleStartTargetProcessor;
import org.eclipse.kapua.service.device.management.bundle.job.definition.DeviceBundlePropertyKeys;
import org.eclipse.kapua.service.job.step.definition.JobStepDefinition;
import org.eclipse.kapua.service.job.step.definition.JobStepDefinitionFactory;
```

### SamePackageImport
Unnecessary import from the same package `import org.eclipse.kapua.commons.service.event.store.api.EventStoreXmlRegistry;`
in `commons/src/main/java/org/eclipse/kapua/commons/service/event/store/api/EventStoreRecord.java`
#### Snippet
```java
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.kapua.commons.service.event.store.api.EventStoreXmlRegistry;
import org.eclipse.kapua.event.ServiceEvent.EventStatus;
import org.eclipse.kapua.model.KapuaUpdatableEntity;
```

### SamePackageImport
Unnecessary import from the same package `import org.eclipse.kapua.locator.guice.GuiceLocatorImpl;`
in `locator/guice/src/main/java/org/eclipse/kapua/locator/guice/LocatorConfig.java`
#### Snippet
```java
import org.eclipse.kapua.locator.KapuaLocatorErrorCodes;
import org.eclipse.kapua.locator.KapuaLocatorException;
import org.eclipse.kapua.locator.guice.GuiceLocatorImpl;

import javax.validation.constraints.NotNull;
```

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `AbstractStorableQuery()` of an abstract class should not be declared 'public'
in `service/commons/storable/internal/src/main/java/org/eclipse/kapua/service/storable/model/query/AbstractStorableQuery.java`
#### Snippet
```java
     * @since 1.0.0
     */
    public AbstractStorableQuery() {
        super();

```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractStorableQuery()` of an abstract class should not be declared 'public'
in `service/commons/storable/internal/src/main/java/org/eclipse/kapua/service/storable/model/query/AbstractStorableQuery.java`
#### Snippet
```java
     * @since 1.0.0
     */
    public AbstractStorableQuery(KapuaId scopeId) {
        this();

```

### NonProtectedConstructorInAbstractClass
Constructor `JobDeviceManagementTriggerException()` of an abstract class should not be declared 'public'
in `service/device/management/job/api/src/main/java/org/eclipse/kapua/service/device/management/job/scheduler/manager/exception/JobDeviceManagementTriggerException.java`
#### Snippet
```java
    private static final String KAPUA_ERROR_MESSAGES = "job-device-management-trigger-service-error-messages";

    public JobDeviceManagementTriggerException(JobDeviceManagementTriggerErrorCodes code, Object... arguments) {
        super(code, arguments);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `JobDeviceManagementTriggerException()` of an abstract class should not be declared 'public'
in `service/device/management/job/api/src/main/java/org/eclipse/kapua/service/device/management/job/scheduler/manager/exception/JobDeviceManagementTriggerException.java`
#### Snippet
```java
    }

    public JobDeviceManagementTriggerException(JobDeviceManagementTriggerErrorCodes code, Throwable cause, Object... arguments) {
        super(code, cause, arguments);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `KeystoreCertificateRequestMessage()` of an abstract class should not be declared 'public'
in `service/device/management/keystore/internal/src/main/java/org/eclipse/kapua/service/device/management/keystore/internal/message/request/KeystoreCertificateRequestMessage.java`
#### Snippet
```java
     * @since 1.5.0
     */
    public KeystoreCertificateRequestMessage() {
        super(KeystoreCertificateRequestMessage.class);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `KeystoreCsrRequestMessage()` of an abstract class should not be declared 'public'
in `service/device/management/keystore/internal/src/main/java/org/eclipse/kapua/service/device/management/keystore/internal/message/request/KeystoreCsrRequestMessage.java`
#### Snippet
```java
     * @since 1.5.0
     */
    public KeystoreCsrRequestMessage() {
        super(KeystoreCsrRequestMessage.class);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `KeystoreKeypairRequestMessage()` of an abstract class should not be declared 'public'
in `service/device/management/keystore/internal/src/main/java/org/eclipse/kapua/service/device/management/keystore/internal/message/request/KeystoreKeypairRequestMessage.java`
#### Snippet
```java
     * @since 1.5.0
     */
    public KeystoreKeypairRequestMessage() {
        super(KeystoreKeypairRequestMessage.class);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `KeystoreQueryRequestMessage()` of an abstract class should not be declared 'public'
in `service/device/management/keystore/internal/src/main/java/org/eclipse/kapua/service/device/management/keystore/internal/message/request/KeystoreQueryRequestMessage.java`
#### Snippet
```java
     * @since 1.5.0
     */
    public KeystoreQueryRequestMessage() {
        super(KeystoreQueryRequestMessage.class);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractMqttChannel()` of an abstract class should not be declared 'public'
in `client/gateway/provider/mqtt/src/main/java/org/eclipse/kapua/client/gateway/mqtt/AbstractMqttChannel.java`
#### Snippet
```java
    private final MqttNamespace namespace;

    public AbstractMqttChannel(final BinaryPayloadCodec codec, final MqttNamespace namespace, final String clientId) {
        this.clientId = clientId;
        this.codec = codec;
```

### NonProtectedConstructorInAbstractClass
Constructor `JobServiceException()` of an abstract class should not be declared 'public'
in `service/job/api/src/main/java/org/eclipse/kapua/service/job/exception/JobServiceException.java`
#### Snippet
```java
     * @since 1.5.0
     */
    public JobServiceException(JobServiceErrorCodes code, Throwable cause, Object... arguments) {
        super(code, cause, arguments);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `JobServiceException()` of an abstract class should not be declared 'public'
in `service/job/api/src/main/java/org/eclipse/kapua/service/job/exception/JobServiceException.java`
#### Snippet
```java
     * @since 1.5.0
     */
    public JobServiceException(JobServiceErrorCodes code) {
        super(code);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `JobServiceException()` of an abstract class should not be declared 'public'
in `service/job/api/src/main/java/org/eclipse/kapua/service/job/exception/JobServiceException.java`
#### Snippet
```java
     * @since 1.5.0
     */
    public JobServiceException(JobServiceErrorCodes code, Object... arguments) {
        super(code, arguments);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractJwtProcessor()` of an abstract class should not be declared 'public'
in `plug-ins/sso/openid-connect/provider/src/main/java/org/eclipse/kapua/plugin/sso/openid/provider/jwt/AbstractJwtProcessor.java`
#### Snippet
```java
     *                            getJwtExpectedIssuers} method throws such exception.
     */
    public AbstractJwtProcessor() throws OpenIDException {
        List<String> audiences = getJwtAudiences();
        List<String> expectedIssuers = getJwtExpectedIssuers();
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractOpenIDService()` of an abstract class should not be declared 'public'
in `plug-ins/sso/openid-connect/provider/src/main/java/org/eclipse/kapua/plugin/sso/openid/provider/AbstractOpenIDService.java`
#### Snippet
```java
     * @param openIDSettings the {@link OpenIDSetting} instance.
     */
    public AbstractOpenIDService(OpenIDSetting openIDSettings) {
        this.openIDSettings = openIDSettings;
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractTranslatorAppKeystoreKuraKapua()` of an abstract class should not be declared 'public'
in `translator/kapua/kura/src/main/java/org/eclipse/kapua/translator/kura/kapua/keystore/AbstractTranslatorAppKeystoreKuraKapua.java`
#### Snippet
```java
     * @since 1.5.0
     */
    public AbstractTranslatorAppKeystoreKuraKapua(Class<M> responseMessageClass) {
        super(responseMessageClass, KeystoreResponsePayload.class);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractSimpleTranslatorResponseKuraKapua()` of an abstract class should not be declared 'public'
in `translator/kapua/kura/src/main/java/org/eclipse/kapua/translator/kura/kapua/AbstractSimpleTranslatorResponseKuraKapua.java`
#### Snippet
```java
     * @since 1.0.0
     */
    public AbstractSimpleTranslatorResponseKuraKapua(Class<TO_M> messageClazz, Class<TO_P> payloadClazz) {
        this.messageClazz = messageClazz;
        this.payloadClazz = payloadClazz;
```

### NonProtectedConstructorInAbstractClass
Constructor `OpenIDException()` of an abstract class should not be declared 'public'
in `plug-ins/sso/openid-connect/api/src/main/java/org/eclipse/kapua/plugin/sso/openid/exception/OpenIDException.java`
#### Snippet
```java
     * @since 1.2.0
     */
    public OpenIDException(KapuaErrorCode code) {
        super(code);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `OpenIDException()` of an abstract class should not be declared 'public'
in `plug-ins/sso/openid-connect/api/src/main/java/org/eclipse/kapua/plugin/sso/openid/exception/OpenIDException.java`
#### Snippet
```java
     * @since 1.2.0
     */
    public OpenIDException(KapuaErrorCode code, Throwable cause, Object... arguments) {
        super(code, cause, arguments);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `OpenIDException()` of an abstract class should not be declared 'public'
in `plug-ins/sso/openid-connect/api/src/main/java/org/eclipse/kapua/plugin/sso/openid/exception/OpenIDException.java`
#### Snippet
```java
     * @since 1.2.0
     */
    public OpenIDException(KapuaErrorCode code, Object... arguments) {
        super(code, arguments);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `OpenIDJwtException()` of an abstract class should not be declared 'public'
in `plug-ins/sso/openid-connect/api/src/main/java/org/eclipse/kapua/plugin/sso/openid/exception/jwt/OpenIDJwtException.java`
#### Snippet
```java
     * @since 1.2.0
     */
    public OpenIDJwtException(KapuaErrorCode code, Throwable cause, Object... arguments) {
        super(code, cause, arguments);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `OpenIDJwtException()` of an abstract class should not be declared 'public'
in `plug-ins/sso/openid-connect/api/src/main/java/org/eclipse/kapua/plugin/sso/openid/exception/jwt/OpenIDJwtException.java`
#### Snippet
```java
     * @since 1.2.0
     */
    public OpenIDJwtException(KapuaErrorCode code) {
        super(code);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `OpenIDUriException()` of an abstract class should not be declared 'public'
in `plug-ins/sso/openid-connect/api/src/main/java/org/eclipse/kapua/plugin/sso/openid/exception/uri/OpenIDUriException.java`
#### Snippet
```java
     * @since 1.2.0
     */
    public OpenIDUriException(KapuaErrorCode code, Throwable cause, Object... arguments) {
        super(code, cause, arguments);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `QuartzTriggerDriverException()` of an abstract class should not be declared 'public'
in `service/scheduler/quartz/src/main/java/org/eclipse/kapua/service/scheduler/quartz/driver/exception/QuartzTriggerDriverException.java`
#### Snippet
```java
    private static final String KAPUA_ERROR_MESSAGES = "quartz-trigger-driver-error-messages";

    public QuartzTriggerDriverException(QuartzTriggerDriverErrorCodes code, Object... arguments) {
        this(code, null, arguments);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `QuartzTriggerDriverException()` of an abstract class should not be declared 'public'
in `service/scheduler/quartz/src/main/java/org/eclipse/kapua/service/scheduler/quartz/driver/exception/QuartzTriggerDriverException.java`
#### Snippet
```java
    }

    public QuartzTriggerDriverException(@NotNull QuartzTriggerDriverErrorCodes code, Throwable cause, Object... arguments) {
        super(code, cause, arguments);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `TranslateException()` of an abstract class should not be declared 'public'
in `translator/api/src/main/java/org/eclipse/kapua/translator/exception/TranslateException.java`
#### Snippet
```java
     * @since 1.2.0
     */
    public TranslateException(TranslatorErrorCodes code, Object... arguments) {
        super(code, arguments);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `TranslateException()` of an abstract class should not be declared 'public'
in `translator/api/src/main/java/org/eclipse/kapua/translator/exception/TranslateException.java`
#### Snippet
```java
     * @since 1.2.0
     */
    public TranslateException(TranslatorErrorCodes code) {
        super(code);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `TranslateException()` of an abstract class should not be declared 'public'
in `translator/api/src/main/java/org/eclipse/kapua/translator/exception/TranslateException.java`
#### Snippet
```java
     * @since 1.2.0
     */
    public TranslateException(TranslatorErrorCodes code, Throwable cause, Object... arguments) {
        super(code, cause, arguments);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `InvalidBodyException()` of an abstract class should not be declared 'public'
in `translator/api/src/main/java/org/eclipse/kapua/translator/exception/InvalidBodyException.java`
#### Snippet
```java
     * @since 1.5.0
     */
    public InvalidBodyException(TranslatorErrorCodes code, Object... arguments) {
        super(code, arguments);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `InvalidBodyException()` of an abstract class should not be declared 'public'
in `translator/api/src/main/java/org/eclipse/kapua/translator/exception/InvalidBodyException.java`
#### Snippet
```java
     * @since 1.5.0
     */
    public InvalidBodyException(TranslatorErrorCodes code, Throwable cause, Object... arguments) {
        super(code, cause, arguments);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `InvalidBodyException()` of an abstract class should not be declared 'public'
in `translator/api/src/main/java/org/eclipse/kapua/translator/exception/InvalidBodyException.java`
#### Snippet
```java
     * @since 1.5.0
     */
    public InvalidBodyException(TranslatorErrorCodes code) {
        super(code);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractMqttTransport()` of an abstract class should not be declared 'public'
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/AbstractMqttTransport.java`
#### Snippet
```java
    protected final Map<String, String> topicContext;

    public AbstractMqttTransport(final GatewayConfiguration configuration) {
        final Map<String, String> topicContext = new HashMap<>();
        topicContext.put("account-name", configuration.getAccountName());
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractDefaultApplication()` of an abstract class should not be declared 'public'
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/app/AbstractDefaultApplication.java`
#### Snippet
```java
    protected abstract void processRequest(final Request request) throws Exception;

    public AbstractDefaultApplication(final String applicationId) {
        this.descriptor = new Descriptor(applicationId);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractSingleTopicPeriodicGenerator()` of an abstract class should not be declared 'public'
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/app/data/AbstractSingleTopicPeriodicGenerator.java`
#### Snippet
```java
    private final Topic topic;

    public AbstractSingleTopicPeriodicGenerator(final ApplicationContext context, final GeneratorScheduler scheduler, final String dataTopic) {
        this.context = context;
        this.handle = scheduler.add(this::tick);
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractCommandApplication()` of an abstract class should not be declared 'public'
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/app/command/AbstractCommandApplication.java`
#### Snippet
```java
    public abstract Result executeCommand(String command);

    public AbstractCommandApplication() {
        super("CMD-V1");
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractTranslatorJmsKura()` of an abstract class should not be declared 'public'
in `translator/kura/jms/src/main/java/org/eclipse/kapua/translator/jms/kura/AbstractTranslatorJmsKura.java`
#### Snippet
```java
     * @since 2.0.0
     */
    public AbstractTranslatorJmsKura(Class<M> messageClazz) {
        this.messageClazz = messageClazz;
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractTranslatorEventJmsKura()` of an abstract class should not be declared 'public'
in `translator/kura/jms/src/main/java/org/eclipse/kapua/translator/jms/kura/event/AbstractTranslatorEventJmsKura.java`
#### Snippet
```java
     * @since 2.0.0
     */
    public AbstractTranslatorEventJmsKura(Class<M> deviceManagementEventClazz) {
        super(deviceManagementEventClazz);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractTranslatorLifecycleJmsKura()` of an abstract class should not be declared 'public'
in `translator/kura/jms/src/main/java/org/eclipse/kapua/translator/jms/kura/lifecycle/AbstractTranslatorLifecycleJmsKura.java`
#### Snippet
```java
     * @since 1.2.0
     */
    public AbstractTranslatorLifecycleJmsKura(Class<M> lifecycleMessageClazz) {
        super(lifecycleMessageClazz);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractRegistryFacade()` of an abstract class should not be declared 'public'
in `service/datastore/internal/src/main/java/org/eclipse/kapua/service/datastore/internal/AbstractRegistryFacade.java`
#### Snippet
```java
    private final ConfigurationProvider configProvider;

    public AbstractRegistryFacade(ConfigurationProvider configProvider) {
        this.configProvider = configProvider;
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractClient()` of an abstract class should not be declared 'public'
in `client/gateway/spi/src/main/java/org/eclipse/kapua/client/gateway/spi/AbstractClient.java`
#### Snippet
```java
    private final Map<String, Context> applications = new HashMap<>();

    public AbstractClient(final ScheduledExecutorService executor, final Set<Module> modules) {
        this.executor = executor;
        this.modules = new HashSet<>(modules);
```

### NonProtectedConstructorInAbstractClass
Constructor `InventoryBundleExecRequestMessage()` of an abstract class should not be declared 'public'
in `service/device/management/inventory/internal/src/main/java/org/eclipse/kapua/service/device/management/inventory/internal/message/InventoryBundleExecRequestMessage.java`
#### Snippet
```java
     * @since 1.5.0
     */
    public InventoryBundleExecRequestMessage() {
        super(InventoryBundleExecRequestMessage.class);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `InventoryEmptyRequestMessage()` of an abstract class should not be declared 'public'
in `service/device/management/inventory/internal/src/main/java/org/eclipse/kapua/service/device/management/inventory/internal/message/InventoryEmptyRequestMessage.java`
#### Snippet
```java
     * @since 1.5.0
     */
    public InventoryEmptyRequestMessage() {
        super(InventoryEmptyRequestMessage.class);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `InventoryContainerExecRequestMessage()` of an abstract class should not be declared 'public'
in `service/device/management/inventory/internal/src/main/java/org/eclipse/kapua/service/device/management/inventory/internal/message/InventoryContainerExecRequestMessage.java`
#### Snippet
```java
     * @since 2.0.0
     */
    public InventoryContainerExecRequestMessage() {
        super(InventoryContainerExecRequestMessage.class);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `TriggerCannotFireException()` of an abstract class should not be declared 'public'
in `service/scheduler/api/src/main/java/org/eclipse/kapua/service/scheduler/exception/TriggerCannotFireException.java`
#### Snippet
```java
     * @since 1.5.0
     */
    public TriggerCannotFireException(SchedulerServiceErrorCodes code, Throwable cause, Object... arguments) {
        super(code, cause, arguments);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `SchedulerServiceException()` of an abstract class should not be declared 'public'
in `service/scheduler/api/src/main/java/org/eclipse/kapua/service/scheduler/exception/SchedulerServiceException.java`
#### Snippet
```java
     * @since 1.5.0
     */
    public SchedulerServiceException(SchedulerServiceErrorCodes code, Throwable cause, Object... arguments) {
        super(code, cause, arguments);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractKuraKeystoreItem()` of an abstract class should not be declared 'public'
in `service/device/call/kura/src/main/java/org/eclipse/kapua/service/device/call/kura/model/keystore/AbstractKuraKeystoreItem.java`
#### Snippet
```java
     * @since 1.5.0
     */
    public AbstractKuraKeystoreItem() {
    }

```

### NonProtectedConstructorInAbstractClass
Constructor `KuraAppChannel()` of an abstract class should not be declared 'public'
in `service/device/call/kura/src/main/java/org/eclipse/kapua/service/device/call/message/kura/app/KuraAppChannel.java`
#### Snippet
```java
     * @since 1.0.0
     */
    public KuraAppChannel(String messageClassification, String scopeNamespace, String clientId) {
        super(messageClassification, scopeNamespace, clientId);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `KuraAppChannel()` of an abstract class should not be declared 'public'
in `service/device/call/kura/src/main/java/org/eclipse/kapua/service/device/call/message/kura/app/KuraAppChannel.java`
#### Snippet
```java
     * @since 1.0.0
     */
    public KuraAppChannel() {
        super();
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `KuraAppMessage()` of an abstract class should not be declared 'public'
in `service/device/call/kura/src/main/java/org/eclipse/kapua/service/device/call/message/kura/app/KuraAppMessage.java`
#### Snippet
```java
     * @since 1.0.0
     */
    public KuraAppMessage(C channel, Date timestamp, P payload) {
        super(channel, timestamp, payload);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `KuraAppMessage()` of an abstract class should not be declared 'public'
in `service/device/call/kura/src/main/java/org/eclipse/kapua/service/device/call/message/kura/app/KuraAppMessage.java`
#### Snippet
```java
     * @since 1.0.0
     */
    public KuraAppMessage() {
        super();
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractKuraAppsBirthChannel()` of an abstract class should not be declared 'public'
in `service/device/call/kura/src/main/java/org/eclipse/kapua/service/device/call/message/kura/lifecycle/AbstractKuraAppsBirthChannel.java`
#### Snippet
```java
     * @since 1.0.0
     */
    public AbstractKuraAppsBirthChannel(String messageClassification, String scopeNamespace, String clientId) {
        super(messageClassification, scopeNamespace, clientId);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractKuraLifecycleChannel()` of an abstract class should not be declared 'public'
in `service/device/call/kura/src/main/java/org/eclipse/kapua/service/device/call/message/kura/lifecycle/AbstractKuraLifecycleChannel.java`
#### Snippet
```java
     * @since 1.2.0
     */
    public AbstractKuraLifecycleChannel(String messageClassification, String scopeNamespace, String clientId) {
        super(messageClassification, scopeNamespace, clientId);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractEntityCacheFactory()` of an abstract class should not be declared 'public'
in `commons/src/main/java/org/eclipse/kapua/commons/jpa/AbstractEntityCacheFactory.java`
#### Snippet
```java
    private String idCacheName;

    public AbstractEntityCacheFactory(String idCacheName) {
        this.idCacheName = idCacheName;
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractNamedEntityCacheFactory()` of an abstract class should not be declared 'public'
in `commons/src/main/java/org/eclipse/kapua/commons/jpa/AbstractNamedEntityCacheFactory.java`
#### Snippet
```java
    private String nameCacheName;

    public AbstractNamedEntityCacheFactory(String idCacheName, String nameCacheName) {
        super(idCacheName);
        this.nameCacheName = nameCacheName;
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractKapuaModule()` of an abstract class should not be declared 'public'
in `commons/src/main/java/org/eclipse/kapua/commons/core/AbstractKapuaModule.java`
#### Snippet
```java
public abstract class AbstractKapuaModule extends AbstractModule {

    public AbstractKapuaModule() {
    }

```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractKapuaNamedEntity()` of an abstract class should not be declared 'public'
in `commons/src/main/java/org/eclipse/kapua/commons/model/AbstractKapuaNamedEntity.java`
#### Snippet
```java
     * @since 1.0.0
     */
    public AbstractKapuaNamedEntity(KapuaId scopeId, String name) {
        super(scopeId);

```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractKapuaNamedEntity()` of an abstract class should not be declared 'public'
in `commons/src/main/java/org/eclipse/kapua/commons/model/AbstractKapuaNamedEntity.java`
#### Snippet
```java
     * @since 1.0.0
     */
    public AbstractKapuaNamedEntity(KapuaId scopeId) {
        super(scopeId);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractKapuaEntity()` of an abstract class should not be declared 'public'
in `commons/src/main/java/org/eclipse/kapua/commons/model/AbstractKapuaEntity.java`
#### Snippet
```java
     * @since 1.0.0
     */
    public AbstractKapuaEntity(KapuaId scopeId) {
        this();

```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractKapuaUpdatableEntityCreator()` of an abstract class should not be declared 'public'
in `commons/src/main/java/org/eclipse/kapua/commons/model/AbstractKapuaUpdatableEntityCreator.java`
#### Snippet
```java
     * @since 1.0.0
     */
    public AbstractKapuaUpdatableEntityCreator(KapuaId scopeId) {
        super(scopeId);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractKapuaNamedEntityCreator()` of an abstract class should not be declared 'public'
in `commons/src/main/java/org/eclipse/kapua/commons/model/AbstractKapuaNamedEntityCreator.java`
#### Snippet
```java
    }

    public AbstractKapuaNamedEntityCreator(KapuaId scopeId) {
        super(scopeId);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractKapuaNamedQuery()` of an abstract class should not be declared 'public'
in `commons/src/main/java/org/eclipse/kapua/commons/model/query/AbstractKapuaNamedQuery.java`
#### Snippet
```java
     * @since 1.5.0
     */
    public AbstractKapuaNamedQuery(KapuaQuery query) {
        super(query);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractKapuaUpdatableEntity()` of an abstract class should not be declared 'public'
in `commons/src/main/java/org/eclipse/kapua/commons/model/AbstractKapuaUpdatableEntity.java`
#### Snippet
```java
     * @since 1.0.0
     */
    public AbstractKapuaUpdatableEntity(KapuaId scopeId) {
        super(scopeId);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractKapuaNamedQuery()` of an abstract class should not be declared 'public'
in `commons/src/main/java/org/eclipse/kapua/commons/model/query/AbstractKapuaNamedQuery.java`
#### Snippet
```java
     * @since 1.5.0
     */
    public AbstractKapuaNamedQuery(KapuaId scopeId) {
        super(scopeId);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractKapuaNamedQuery()` of an abstract class should not be declared 'public'
in `commons/src/main/java/org/eclipse/kapua/commons/model/query/AbstractKapuaNamedQuery.java`
#### Snippet
```java
     * @since 1.5.0
     */
    public AbstractKapuaNamedQuery() {
        super();
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractKapuaQuery()` of an abstract class should not be declared 'public'
in `commons/src/main/java/org/eclipse/kapua/commons/model/query/AbstractKapuaQuery.java`
#### Snippet
```java
     * @since 1.0.0
     */
    public AbstractKapuaQuery(KapuaId scopeId) {
        this();

```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractKapuaQuery()` of an abstract class should not be declared 'public'
in `commons/src/main/java/org/eclipse/kapua/commons/model/query/AbstractKapuaQuery.java`
#### Snippet
```java
     * @param query the query to clone.
     */
    public AbstractKapuaQuery(@NotNull KapuaQuery query) {
        setFetchAttributes(query.getFetchAttributes());
        setPredicate(query.getPredicate());
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractKapuaQuery()` of an abstract class should not be declared 'public'
in `commons/src/main/java/org/eclipse/kapua/commons/model/query/AbstractKapuaQuery.java`
#### Snippet
```java
     * @since 1.0.0
     */
    public AbstractKapuaQuery() {
    }

```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractEntityAttributeMigrator()` of an abstract class should not be declared 'public'
in `extras/encryption-migrator/src/main/java/org/eclipse/kapua/extras/migrator/encryption/api/AbstractEntityAttributeMigrator.java`
#### Snippet
```java
    protected final KapuaUpdatableEntityService<E> entityUpdatableService;

    public AbstractEntityAttributeMigrator(KapuaUpdatableEntityService<E> entityService) {
        this.entityService = (KapuaEntityService) entityService;
        this.entityUpdatableService = entityService;
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `path`
in `client/gateway/api/src/main/java/org/eclipse/kapua/client/gateway/Topic.java`
#### Snippet
```java
        }

        path = path.replaceAll("(^/+|/$)+", "");

        if (path.isEmpty()) {
```

### AssignmentToMethodParameter
Assignment to method parameter `action`
in `qa/common/src/main/java/org/eclipse/kapua/qa/common/Wait.java`
#### Snippet
```java

        if (action != null) {
            action = action + ": ";
        } else {
            action = "";
```

### AssignmentToMethodParameter
Assignment to method parameter `action`
in `qa/common/src/main/java/org/eclipse/kapua/qa/common/Wait.java`
#### Snippet
```java
            action = action + ": ";
        } else {
            action = "";
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `template`
in `qa/integration-steps/src/main/java/org/eclipse/kapua/qa/integration/steps/RestClientSteps.java`
#### Snippet
```java
            if (oValue instanceof String) {
                String value = (String) oValue;
                template = template.replace("" + key + "", value);
            }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `resource`
in `qa/integration-steps/src/main/java/org/eclipse/kapua/qa/integration/steps/RestClientSteps.java`
#### Snippet
```java
        String port = (String) stepData.get("port");
        String tokenId = (String) stepData.get(TOKEN_ID);
        resource = insertStepData(resource);
        json = insertStepData(json);
        URL url = new URL("http://" + host + ":" + port + resource);
```

### AssignmentToMethodParameter
Assignment to method parameter `json`
in `qa/integration-steps/src/main/java/org/eclipse/kapua/qa/integration/steps/RestClientSteps.java`
#### Snippet
```java
        String tokenId = (String) stepData.get(TOKEN_ID);
        resource = insertStepData(resource);
        json = insertStepData(json);
        URL url = new URL("http://" + host + ":" + port + resource);

```

### AssignmentToMethodParameter
Assignment to method parameter `resource`
in `qa/integration-steps/src/main/java/org/eclipse/kapua/qa/integration/steps/RestClientSteps.java`
#### Snippet
```java
        String port = (String) stepData.get("port");
        String tokenId = (String) stepData.get(TOKEN_ID);
        resource = insertStepData(resource);
        URL url = new URL("http://" + host + ":" + port + resource);

```

### AssignmentToMethodParameter
Assignment to method parameter `field`
in `service/datastore/test-steps/src/main/java/org/eclipse/kapua/service/datastore/steps/DatastoreSteps.java`
#### Snippet
```java
        int lastDot = field.lastIndexOf('.');
        if (lastDot > -1) {
            field = field.substring(lastDot + 1, field.length());
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `objectClass`
in `service/datastore/test-steps/src/main/java/org/eclipse/kapua/service/datastore/steps/DatastoreSteps.java`
#### Snippet
```java
                objField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                objectClass = objectClass.getSuperclass();
            }
        } while (objField == null && objectClass != null);
```

### AssignmentToMethodParameter
Assignment to method parameter `objetcClass`
in `service/datastore/test-steps/src/main/java/org/eclipse/kapua/service/datastore/steps/DatastoreSteps.java`
#### Snippet
```java
                objMethod = objetcClass.getMethod(fieldName, new Class[0]);
            } catch (NoSuchMethodException e) {
                objetcClass = objetcClass.getSuperclass();
            }
        } while (objMethod == null && objetcClass != null);
```

### AssignmentToMethodParameter
Assignment to method parameter `deviceConnection`
in `broker/core/src/main/java/org/eclipse/kapua/broker/core/plugin/authentication/UserAuthenticationLogic.java`
#### Snippet
```java
            deviceConnectionCreator.setUserCouplingMode(ConnectionUserCouplingMode.INHERITED);
            deviceConnectionCreator.setAllowUserChange(false);
            deviceConnection = KapuaSecurityUtils.doPrivileged(() -> deviceConnectionService.create(deviceConnectionCreator));
        } else {
            deviceConnection.setStatus(DeviceConnectionStatus.CONNECTED);
```

### AssignmentToMethodParameter
Assignment to method parameter `verb`
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/app/annotated/AnnotatedApplication.java`
#### Snippet
```java
        // allow proper verbs
        if ("DELETE".equals(verb)) {
            verb = "DEL";
        } else if ("EXECUTE".equals(verb)) {
            verb = "EXEC";
```

### AssignmentToMethodParameter
Assignment to method parameter `verb`
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/app/annotated/AnnotatedApplication.java`
#### Snippet
```java
            verb = "DEL";
        } else if ("EXECUTE".equals(verb)) {
            verb = "EXEC";
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `credentialCreator`
in `service/security/shiro/src/main/java/org/eclipse/kapua/service/authentication/credential/shiro/CredentialServiceImpl.java`
#### Snippet
```java
                    fullKey = pre + key;

                    credentialCreator = new CredentialCreatorImpl(credentialCreator.getScopeId(),
                            credentialCreator.getUserId(),
                            credentialCreator.getCredentialType(),
```

### AssignmentToMethodParameter
Assignment to method parameter `mfaOptionCreator`
in `service/security/shiro/src/main/java/org/eclipse/kapua/service/authentication/credential/mfa/shiro/MfaOptionServiceImpl.java`
#### Snippet
```java

            String fullKey = MFA_AUTHENTICATOR.generateKey();
            mfaOptionCreator = new MfaOptionCreatorImpl(mfaOptionCreator.getScopeId(), mfaOptionCreator.getUserId(), fullKey);
            mfaOption = MfaOptionDAO.create(em, mfaOptionCreator);
            mfaOption = MfaOptionDAO.find(em, mfaOption.getScopeId(), mfaOption.getId());
```

### AssignmentToMethodParameter
Assignment to method parameter `jobStep`
in `service/job/test-steps/src/main/java/org/eclipse/kapua/service/job/steps/JobStepServiceSteps.java`
#### Snippet
```java
        primeException();
        try {
            jobStep = jobStepService.update(jobStep);
            stepData.put(JOB_STEP, jobStep);
        } catch (KapuaException ex) {
```

### AssignmentToMethodParameter
Assignment to method parameter `bytes`
in `service/device/call/kura/src/main/java/org/eclipse/kapua/service/device/call/message/kura/KuraPayload.java`
#### Snippet
```java
        if (GZIPUtils.isCompressed(bytes)) {
            try {
                bytes = GZIPUtils.decompress(bytes);
            } catch (IOException ioe) {
                throw new MessageException(MessageErrorCodes.INVALID_MESSAGE, ioe, (Object[]) null);
```

### AssignmentToMethodParameter
Assignment to method parameter `domainName`
in `service/endpoint/test-steps/src/main/java/org/eclipse/kapua/service/endpoint/steps/EndpointServiceSteps.java`
#### Snippet
```java
        EndpointInfo endpointInfo = (EndpointInfo) stepData.get("EndpointInfo");
        if (domainName.equals("NULL")) {
            domainName = null;
        }
        try {
```

### AssignmentToMethodParameter
Assignment to method parameter `schema`
in `service/endpoint/test-steps/src/main/java/org/eclipse/kapua/service/endpoint/steps/EndpointServiceSteps.java`
#### Snippet
```java
        EndpointInfo endpointInfo = (EndpointInfo) stepData.get("EndpointInfo");
        if (schema.equals("NULL")) {
            schema = null;
        }
        try {
```

### AssignmentToMethodParameter
Assignment to method parameter `about`
in `commons/src/main/java/org/eclipse/kapua/commons/about/AboutScanner.java`
#### Snippet
```java
    private static AboutEntry processLicense(AboutEntry about, final URL url, final InputStream in) {

        about = needAbout(about);

        setIdFromUrl(about, url);
```

### AssignmentToMethodParameter
Assignment to method parameter `about`
in `commons/src/main/java/org/eclipse/kapua/commons/about/AboutScanner.java`
#### Snippet
```java
            if (groupId != null && artifactId != null && version != null) {

                about = needAbout(about);

                // check if an ID is already present, maven goes last
```

### AssignmentToMethodParameter
Assignment to method parameter `about`
in `commons/src/main/java/org/eclipse/kapua/commons/about/AboutScanner.java`
#### Snippet
```java
    private static AboutEntry processHtmlFile(AboutEntry about, final URL url, final InputStream in) {

        about = processNotice(about, url, in);

        final List<String> keywords = Arrays.asList("epl", "eclipse public license");
```

### AssignmentToMethodParameter
Assignment to method parameter `about`
in `commons/src/main/java/org/eclipse/kapua/commons/about/AboutScanner.java`
#### Snippet
```java
            }

            about = needAbout(about);
            setIdFromUrl(about, url);

```

### AssignmentToMethodParameter
Assignment to method parameter `about`
in `commons/src/main/java/org/eclipse/kapua/commons/about/AboutScanner.java`
#### Snippet
```java
    private static AboutEntry processNotice(AboutEntry about, final URL url, final InputStream in) {

        about = needAbout(about);

        setIdFromUrl(about, url);
```

### AssignmentToMethodParameter
Assignment to method parameter `about`
in `commons/src/main/java/org/eclipse/kapua/commons/about/AboutScanner.java`
#### Snippet
```java
            final String licenseString = mf.getMainAttributes().getValue("Bundle-License");

            about = needAbout(about);

            about.setId(String.format("osgi:%s:%s", bsn, version));
```

### AssignmentToMethodParameter
Assignment to method parameter `address`
in `commons/src/main/java/org/eclipse/kapua/commons/event/jms/JMSServiceEventBus.java`
#### Snippet
```java

            public Sender(Connection jmsConnection, String address) throws JMSException {
                address = String.format("events.%s", address);
                jmsSession = jmsConnection.createSession(false, Session.AUTO_ACKNOWLEDGE);
                Topic jmsTopic = jmsSession.createTopic(address);
```

### AssignmentToMethodParameter
Assignment to method parameter `configResourceDirName`
in `commons/src/main/java/org/eclipse/kapua/commons/setting/AbstractKapuaSetting.java`
#### Snippet
```java

        if (!configResourceDirName.endsWith("/")) {
            configResourceDirName = configResourceDirName.concat("/");
        }

```

## RuleId[id=SynchronizationOnLocalVariableOrMethodParameter]
### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on method parameter `mqttClientCallback`
in `transport/mqtt/src/main/java/org/eclipse/kapua/transport/mqtt/MqttFacade.java`
#### Snippet
```java

        try {
            synchronized (mqttClientCallback) {
                mqttClientCallback.wait();
            }
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `service/commons/storable/internal/src/main/java/org/eclipse/kapua/service/storable/model/AbstractStorableListResult.java`
#### Snippet
```java
    @Override
    public E getFirstItem() {
        return this.isEmpty() ? null : getItem(0);
    }

```

### ReturnNull
Return of `null`
in `client/gateway/api/src/main/java/org/eclipse/kapua/client/gateway/Credentials.java`
#### Snippet
```java
        public String getPasswordAsString() {
            if (password == null) {
                return null;
            }

```

### ReturnNull
Return of `null`
in `client/gateway/api/src/main/java/org/eclipse/kapua/client/gateway/Topic.java`
#### Snippet
```java
    public static Topic of(final String first, final String... strings) {
        if (first == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `client/gateway/api/src/main/java/org/eclipse/kapua/client/gateway/Topic.java`
#### Snippet
```java
    public static Topic of(final List<String> segments) {
        if (segments == null || segments.isEmpty()) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `client/gateway/api/src/main/java/org/eclipse/kapua/client/gateway/Topic.java`
#### Snippet
```java
    public static Topic split(String path) {
        if (path == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `client/gateway/api/src/main/java/org/eclipse/kapua/client/gateway/Topic.java`
#### Snippet
```java

        if (path.isEmpty()) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `service/device/management/asset-store/dummy/src/main/java/org/eclipse/kapua/service/device/management/asset/store/dummy/DeviceAssetStoreFactoryDummy.java`
#### Snippet
```java
    @Override
    public DeviceAssetStoreSettings newDeviceAssetStoreSettings() {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `service/device/management/asset-store/dummy/src/main/java/org/eclipse/kapua/service/device/management/asset/store/dummy/DeviceAssetStoreServiceDummy.java`
#### Snippet
```java
    @Override
    public KapuaTocd getConfigMetadata(KapuaId scopeId) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `service/device/management/asset-store/dummy/src/main/java/org/eclipse/kapua/service/device/management/asset/store/dummy/DeviceAssetStoreServiceDummy.java`
#### Snippet
```java
    @Override
    public DeviceAssets getAssetsValues(KapuaId scopeId, KapuaId deviceId, DeviceAssets deviceAssets) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `service/device/management/asset-store/dummy/src/main/java/org/eclipse/kapua/service/device/management/asset/store/dummy/DeviceAssetStoreServiceDummy.java`
#### Snippet
```java
    @Override
    public DeviceAssetStoreSettings getApplicationSettings(KapuaId scopeId, KapuaId deviceId) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `service/device/management/asset-store/dummy/src/main/java/org/eclipse/kapua/service/device/management/asset/store/dummy/DeviceAssetStoreServiceDummy.java`
#### Snippet
```java
    @Override
    public DeviceAssets getAssets(KapuaId scopeId, KapuaId deviceId, DeviceAssets deviceAssets) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `service/device/management/asset-store/dummy/src/main/java/org/eclipse/kapua/service/device/management/asset/store/dummy/DeviceAssetStoreServiceDummy.java`
#### Snippet
```java
    @Override
    public Map<String, Object> getConfigValues(KapuaId scopeId) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `service/device/management/registry/internal/src/main/java/org/eclipse/kapua/service/device/management/registry/operation/internal/DeviceManagementOperationPropertyImpl.java`
#### Snippet
```java
                        (DeviceManagementOperationPropertyImpl) jobStepProperty :
                        new DeviceManagementOperationPropertyImpl(jobStepProperty)) :
                null;
    }
}
```

### ReturnNull
Return of `null`
in `service/user/internal/src/main/java/org/eclipse/kapua/service/user/internal/UserServiceImpl.java`
#### Snippet
```java
                .onBeforeHandler(() -> {
                    entityCache.remove(null, user);
                    return null;
                }));
    }
```

### ReturnNull
Return of `null`
in `qa/common/src/main/java/org/eclipse/kapua/qa/common/TestBase.java`
#### Snippet
```java

        if (date == null) {
            return null;
        }
        // Special keywords for date
```

### ReturnNull
Return of `null`
in `qa/common/src/main/java/org/eclipse/kapua/qa/common/Util.java`
#### Snippet
```java

    public static BigInteger parseBigInteger(String value) {
        return value!=null ? BigInteger.valueOf(Long.parseLong(value)) : null;
    }

```

### ReturnNull
Return of `null`
in `qa/common/src/main/java/org/eclipse/kapua/qa/common/Util.java`
#### Snippet
```java

    public static KapuaId parseKapuaId(String value) {
        return value != null ? KapuaEid.parseCompactId(value) : null;
    }

```

### ReturnNull
Return of `null`
in `qa/common/src/main/java/org/eclipse/kapua/qa/common/Util.java`
#### Snippet
```java

    public static Actions parseAction(String value) {
        return value!=null ? Actions.valueOf(value) : null;
    }

```

### ReturnNull
Return of `null`
in `qa/common/src/main/java/org/eclipse/kapua/qa/common/Util.java`
#### Snippet
```java

    public static UserType parseUserType(String value) {
        return value!=null ? UserType.valueOf(value) : null;
    }

```

### ReturnNull
Return of `null`
in `qa/common/src/main/java/org/eclipse/kapua/qa/common/Util.java`
#### Snippet
```java

    public static Integer parseInteger(String value) {
        return value!=null ? Integer.valueOf(value) : null;
    }

```

### ReturnNull
Return of `null`
in `qa/common/src/main/java/org/eclipse/kapua/qa/common/Util.java`
#### Snippet
```java

    public static UserStatus parseUserStatus(String value) {
        return value!=null ? UserStatus.valueOf(value) : null;
    }

```

### ReturnNull
Return of `null`
in `qa/common/src/main/java/org/eclipse/kapua/qa/common/cucumber/CucAccount.java`
#### Snippet
```java

        if (expirationDate == null) {
            return null;
        }
        // Special keywords for date
```

### ReturnNull
Return of `null`
in `qa/common/src/main/java/org/eclipse/kapua/qa/common/cucumber/CucCredentials.java`
#### Snippet
```java

        if (expirationDate == null) {
            return null;
        }
        // Special keywords for date
```

### ReturnNull
Return of `null`
in `qa/common/src/main/java/org/eclipse/kapua/qa/common/cache/MapCache.java`
#### Snippet
```java
            logger.error("Error while getting value from cache", e);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `qa/common/src/main/java/org/eclipse/kapua/qa/common/cache/MapCache.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `qa/common/src/main/java/org/eclipse/kapua/qa/common/cucumber/CucUser.java`
#### Snippet
```java

        if (expirationDate == null) {
            return null;
        }
        // Special keywords for date
```

### ReturnNull
Return of `null`
in `qa/common/src/main/java/org/eclipse/kapua/qa/common/cucumber/CucConnection.java`
#### Snippet
```java
        DeviceConnectionStatus tmpStatus = null;
        if (status == null) {
            return null;
        }
        switch (status.trim().toUpperCase()) {
```

### ReturnNull
Return of `null`
in `qa/common/src/main/java/org/eclipse/kapua/qa/common/cucumber/CucConnection.java`
#### Snippet
```java
    public KapuaId getReservedUserId() throws KapuaException {
        if ((reservedUser == null) || reservedUser.isEmpty()) {
            return null;
        } else {
            return KapuaSecurityUtils.doPrivileged(() -> userService.findByName(reservedUser).getId());
```

### ReturnNull
Return of `null`
in `rest-api/resources/src/main/java/org/eclipse/kapua/app/api/resources/v1/resources/ServiceConfigurations.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `service/commons/elasticsearch/client-rest/src/main/java/org/eclipse/kapua/service/elasticsearch/client/rest/RestElasticsearchClient.java`
#### Snippet
```java
        ResultList<T> result = query(typeDescriptor, query, clazz);

        return result.getResult().isEmpty() ? null : result.getResult().get(0);
    }

```

### ReturnNull
Return of `null`
in `plug-ins/sso/openid-connect/provider/src/main/java/org/eclipse/kapua/plugin/sso/openid/provider/internal/DisabledLocator.java`
#### Snippet
```java
        @Override
        public String getLogoutUri(String idTokenHint, URI postLogoutRedirectUri, String state) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `plug-ins/sso/openid-connect/provider/src/main/java/org/eclipse/kapua/plugin/sso/openid/provider/internal/DisabledLocator.java`
#### Snippet
```java
        @Override
        public String getExternalUsernameClaimName() {
            return null;
        }
    };
```

### ReturnNull
Return of `null`
in `plug-ins/sso/openid-connect/provider/src/main/java/org/eclipse/kapua/plugin/sso/openid/provider/internal/DisabledLocator.java`
#### Snippet
```java
        @Override
        public JwtContext process(String jwt) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `plug-ins/sso/openid-connect/provider/src/main/java/org/eclipse/kapua/plugin/sso/openid/provider/internal/DisabledLocator.java`
#### Snippet
```java
        @Override
        public JsonObject getTokens(final String authCode, final URI redirectUri) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `plug-ins/sso/openid-connect/provider/src/main/java/org/eclipse/kapua/plugin/sso/openid/provider/internal/DisabledLocator.java`
#### Snippet
```java
        @Override
        public JsonObject getUserInfo(String authCode) {
            return null;
        }
    };
```

### ReturnNull
Return of `null`
in `plug-ins/sso/openid-connect/provider/src/main/java/org/eclipse/kapua/plugin/sso/openid/provider/internal/DisabledLocator.java`
#### Snippet
```java
        @Override
        public String getLoginUri(final String state, final URI redirectUri) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `plug-ins/sso/openid-connect/provider/src/main/java/org/eclipse/kapua/plugin/sso/openid/provider/internal/DisabledLocator.java`
#### Snippet
```java
        @Override
        public String getExternalIdClaimName() {
            return null;
        }

```

### ReturnNull
Return of `null`
in `service/account/internal/src/main/java/org/eclipse/kapua/service/account/internal/AccountServiceImpl.java`
#### Snippet
```java
                        .onBeforeHandler(() -> {
                            entityCache.remove(null, account);
                            return null;
                        })
                        .onResultHandler(em -> AccountDAO.update(em, account))
```

### ReturnNull
Return of `null`
in `client/gateway/profile/kura/src/main/java/org/eclipse/kapua/client/gateway/kura/internal/Metrics.java`
#### Snippet
```java
    public static Map<String, Object> extractMetrics(final KuraPayload payload) {
        if (payload == null) {
            return null;
        }
        return extractMetrics(payload.getMetricList());
```

### ReturnNull
Return of `null`
in `client/gateway/profile/kura/src/main/java/org/eclipse/kapua/client/gateway/kura/internal/Metrics.java`
#### Snippet
```java
    public static Map<String, Object> extractMetrics(final List<KuraMetric> metricList) {
        if (metricList == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `translator/kapua/kura/src/main/java/org/eclipse/kapua/translator/kura/kapua/TranslatorKuraKapuaUtils.java`
#### Snippet
```java
    public static KapuaResponseCode translate(KuraResponseCode kuraResponseCode) throws KapuaException {
        if (kuraResponseCode == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `extras/es-migrator/src/main/java/org/eclipse/kapua/extras/esmigrator/Migrator.java`
#### Snippet
```java
        } catch (Exception exception) {
            LOGGER.warn("Unable to gather Account IDs from the DB: {}", exception.getMessage());
            return null;
        }
        return accountIds;
```

### ReturnNull
Return of `null`
in `service/security/certificate/internal/src/main/java/org/eclipse/kapua/service/certificate/internal/CertificateFactoryImpl.java`
#### Snippet
```java
    @Override
    public CertificateGenerator newCertificateGenerator() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `service/security/certificate/internal/src/main/java/org/eclipse/kapua/service/certificate/internal/CertificateUsageImpl.java`
#### Snippet
```java

    public static CertificateUsageImpl parse(CertificateUsage certificateUsage) {
        return certificateUsage != null ? certificateUsage instanceof CertificateUsageImpl ? (CertificateUsageImpl) certificateUsage : new CertificateUsageImpl(certificateUsage) : null;
    }

```

### ReturnNull
Return of `null`
in `service/security/certificate/internal/src/main/java/org/eclipse/kapua/service/certificate/internal/KeyUsageSettingImpl.java`
#### Snippet
```java
            return keyUsageSetting instanceof KeyUsageSettingImpl ? (KeyUsageSettingImpl) keyUsageSetting : new KeyUsageSettingImpl(keyUsageSetting);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `service/account/test-steps/src/main/java/org/eclipse/kapua/service/account/steps/AccountServiceSteps.java`
#### Snippet
```java
            }

            return null;
        });

```

### ReturnNull
Return of `null`
in `service/account/test-steps/src/main/java/org/eclipse/kapua/service/account/steps/AccountServiceSteps.java`
#### Snippet
```java
        });

        return accountList.size() == 1 ? accountList.get(0) : null;
    }

```

### ReturnNull
Return of `null`
in `service/scheduler/quartz/src/main/java/org/eclipse/kapua/service/scheduler/trigger/definition/quartz/TriggerPropertyImpl.java`
#### Snippet
```java

    public static TriggerPropertyImpl parse(TriggerProperty triggerProperty) {
        return triggerProperty != null ? (triggerProperty instanceof TriggerPropertyImpl ? (TriggerPropertyImpl) triggerProperty : new TriggerPropertyImpl(triggerProperty)) : null;
    }
}
```

### ReturnNull
Return of `null`
in `message/api/src/main/java/org/eclipse/kapua/message/KapuaPosition.java`
#### Snippet
```java
        String displayString = Payloads.toDisplayString(properties);

        return displayString.isEmpty() ? null : displayString;
    }
}
```

### ReturnNull
Return of `null`
in `service/device/management/packages/internal/src/main/java/org/eclipse/kapua/service/device/management/packages/model/download/internal/AdvancedPackageDownloadOptionsImpl.java`
#### Snippet
```java

    public static AdvancedPackageDownloadOptionsImpl parse(AdvancedPackageDownloadOptions advancedPackageDownloadOptions) {
        return advancedPackageDownloadOptions != null ? (advancedPackageDownloadOptions instanceof AdvancedPackageDownloadOptionsImpl ? (AdvancedPackageDownloadOptionsImpl) advancedPackageDownloadOptions : new AdvancedPackageDownloadOptionsImpl(advancedPackageDownloadOptions)) : null;
    }
}
```

### ReturnNull
Return of `null`
in `service/device/management/packages/internal/src/main/java/org/eclipse/kapua/service/device/management/packages/message/internal/PackageRequestPayload.java`
#### Snippet
```java
        String fileType = (String) getMetrics().get(PackageAppProperties.APP_PROPERTY_PACKAGE_DOWNLOAD_FILE_TYPE.getValue());

        return Strings.isNullOrEmpty(fileType) ? null : FileType.valueOf(fileType);
    }

```

### ReturnNull
Return of `null`
in `service/device/registry/internal/src/main/java/org/eclipse/kapua/service/device/registry/event/internal/DeviceEventCreatorImpl.java`
#### Snippet
```java
    @Override
    public Date getReceivedOn() {
        return receivedOn != null ? new Date(receivedOn.getTime()) : null;
    }

```

### ReturnNull
Return of `null`
in `service/device/registry/internal/src/main/java/org/eclipse/kapua/service/device/registry/event/internal/DeviceEventCreatorImpl.java`
#### Snippet
```java
    @Override
    public Date getSentOn() {
        return sentOn != null ? new Date(sentOn.getTime()) : null;
    }

```

### ReturnNull
Return of `null`
in `service/device/registry/internal/src/main/java/org/eclipse/kapua/service/device/registry/internal/DeviceRegistryCache.java`
#### Snippet
```java
            return remove(kapuaEntity.getScopeId(), kapuaEntity.getId());
        }
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `service/device/registry/internal/src/main/java/org/eclipse/kapua/service/device/registry/internal/DeviceRegistryCache.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `service/device/registry/internal/src/main/java/org/eclipse/kapua/service/device/registry/internal/DeviceRegistryCache.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `service/device/registry/internal/src/main/java/org/eclipse/kapua/service/device/registry/internal/DeviceRegistryServiceImpl.java`
#### Snippet
```java
                        }).onBeforeHandler(() -> {
                                    entityCache.remove(device.getScopeId(), device);
                                    return null;
                                }
                        ));
```

### ReturnNull
Return of `null`
in `service/device/registry/internal/src/main/java/org/eclipse/kapua/service/device/registry/internal/DeviceExtendedPropertyImpl.java`
#### Snippet
```java
                        (DeviceExtendedPropertyImpl) deviceExtendedProperty :
                        new DeviceExtendedPropertyImpl(deviceExtendedProperty)
                : null;
    }
}
```

### ReturnNull
Return of `null`
in `service/device/registry/internal/src/main/java/org/eclipse/kapua/service/device/registry/connection/internal/DeviceConnectionServiceImpl.java`
#### Snippet
```java
                        }).onBeforeHandler(() -> {
                            ((DeviceRegistryCache) entityCache).removeByDeviceConnectionId(deviceConnection.getScopeId(), deviceConnection.getId());
                            return null;
                        }));
    }
```

### ReturnNull
Return of `null`
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/main/NameFactories.java`
#### Snippet
```java
    private static String dashify(final String string) {
        if (string == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/util/Get.java`
#### Snippet
```java

    public static Optional<String> getNonEmptyString(final Map<String, Object> configuration, final String key) {
        return getString(configuration, key).map(str -> !str.isEmpty() ? str : null);
    }

```

### ReturnNull
Return of `null`
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/payload/Message.java`
#### Snippet
```java

            if (!segValue1.equals(segValue2)) {
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/generator/Payload.java`
#### Snippet
```java
    private static ByteBuffer copy(final ByteBuffer source) {
        if (source == null || !source.hasRemaining()) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/payload/Metrics.java`
#### Snippet
```java
    public static Map<String, Object> extractMetrics(final KuraPayload payload) {
        if (payload == null) {
            return null;
        }
        return extractMetrics(payload.getMetricList());
```

### ReturnNull
Return of `null`
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/payload/Metrics.java`
#### Snippet
```java
    public static Map<String, Object> extractMetrics(final List<KuraMetric> metricList) {
        if (metricList == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/payload/Metrics.java`
#### Snippet
```java
    public static KuraPayload toKuraPayload(final Payload payload) {
        if (payload == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/simulation/ConfiguredSimulation.java`
#### Snippet
```java
    private static Topic convertTopic(final Configuration.Topic value) {
        if (value == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `transport/mqtt/src/main/java/org/eclipse/kapua/transport/mqtt/MqttFacade.java`
#### Snippet
```java
            return responses.get(0);
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/topic/Topic.java`
#### Snippet
```java

            if (!segValue1.equals(segValue2)) {
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `service/device/commons/src/main/java/org/eclipse/kapua/service/device/management/commons/AbstractDeviceManagementServiceImpl.java`
#### Snippet
```java
                }
            } else {
                return null;
            }
        } else {
```

### ReturnNull
Return of `null`
in `job-engine/app/core/src/main/java/org/eclipse/kapua/job/engine/app/core/converter/KapuaIdParamConverterProvider.java`
#### Snippet
```java
            };
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `service/datastore/internal/src/main/java/org/eclipse/kapua/service/datastore/internal/mediator/DatastoreChannel.java`
#### Snippet
```java
    public String getParentTopic() {
        int iLastSlash = channel.lastIndexOf(TOPIC_SEPARATOR);
        return iLastSlash != -1 ? channel.substring(0, iLastSlash) : null;
    }

```

### ReturnNull
Return of `null`
in `service/datastore/internal/src/main/java/org/eclipse/kapua/service/datastore/internal/mediator/DatastoreChannel.java`
#### Snippet
```java
        if (parentTopic != null) {
            int iLastSlash = parentTopic.lastIndexOf(TOPIC_SEPARATOR);
            return iLastSlash != -1 ? parentTopic.substring(0, iLastSlash) : null;
        } else {
            return null;
```

### ReturnNull
Return of `null`
in `service/datastore/internal/src/main/java/org/eclipse/kapua/service/datastore/internal/mediator/DatastoreChannel.java`
#### Snippet
```java
            return iLastSlash != -1 ? parentTopic.substring(0, iLastSlash) : null;
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `service/datastore/internal/src/main/java/org/eclipse/kapua/service/datastore/internal/schema/Schema.java`
#### Snippet
```java
    private Map<String, Metric> getMessageMappingDiffs(Metadata currentMetadata, Map<String, Metric> esMetrics) {
        if (esMetrics == null || esMetrics.isEmpty()) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `service/datastore/internal/src/main/java/org/eclipse/kapua/service/datastore/internal/schema/Schema.java`
#### Snippet
```java
    private ObjectNode getNewMessageMappingsBuilder(Map<String, Metric> esMetrics) throws MappingException {
        if (esMetrics == null) {
            return null;
        }
        // metrics mapping container (to be added to message mapping)
```

### ReturnNull
Return of `null`
in `service/datastore/internal/src/main/java/org/eclipse/kapua/service/datastore/internal/mediator/DatastoreUtils.java`
#### Snippet
```java
     */
    public static String[] getMetricParts(String fullName) {
        return fullName == null ? null : fullName.split(Pattern.quote("."));
    }

```

### ReturnNull
Return of `null`
in `client/gateway/spi/src/main/java/org/eclipse/kapua/client/gateway/spi/util/Buffers.java`
#### Snippet
```java
    public static byte[] toByteArray(final ByteBuffer buffer) {
        if (buffer == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `client/gateway/spi/src/main/java/org/eclipse/kapua/client/gateway/spi/util/Buffers.java`
#### Snippet
```java
    public static ByteBuffer wrap(final byte[] data) {
        if (data == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `service/stream/internal/src/main/java/org/eclipse/kapua/service/stream/internal/StreamServiceImpl.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `service/endpoint/internal/src/main/java/org/eclipse/kapua/service/endpoint/internal/EndpointUsageImpl.java`
#### Snippet
```java

    public static EndpointUsageImpl parse(EndpointUsage endpointUsage) {
        return endpointUsage != null ? endpointUsage instanceof EndpointUsageImpl ? (EndpointUsageImpl) endpointUsage : new EndpointUsageImpl(endpointUsage) : null;
    }
}
```

### ReturnNull
Return of `null`
in `service/api/src/main/java/org/eclipse/kapua/ExceptionMessageUtils.java`
#### Snippet
```java
        } catch (MissingResourceException mre) {
            LOG.warn("Could not load exception messages for resource: {} in locale: {}. A generic error message will be printed.", resourceBundleName, locale);
            return null;
        }
        if (code == null) {
```

### ReturnNull
Return of `null`
in `service/api/src/main/java/org/eclipse/kapua/ExceptionMessageUtils.java`
#### Snippet
```java
        if (code == null) {
            LOG.warn("Could not load exception messages for null code. A generic error message will be printed.");
            return null;
        }
        try {
```

### ReturnNull
Return of `null`
in `service/api/src/main/java/org/eclipse/kapua/model/id/KapuaIdAdapter.java`
#### Snippet
```java
    @Override
    public String marshal(KapuaId v) throws Exception {
        return v != null ? v.toCompactId() : null;
    }

```

### ReturnNull
Return of `null`
in `service/api/src/main/java/org/eclipse/kapua/model/id/KapuaIdAdapter.java`
#### Snippet
```java
    @Override
    public KapuaId unmarshal(String v) throws Exception {
        return v != null ? KAPUA_ID_FACTORY.newKapuaId(v) : null;
    }
}
```

### ReturnNull
Return of `null`
in `service/api/src/main/java/org/eclipse/kapua/model/xml/BinaryXmlAdapter.java`
#### Snippet
```java
    @Override
    public byte[] unmarshal(String binary) {
        return binary != null ? ByteArrayConverter.fromString(binary) : null;
    }
}
```

### ReturnNull
Return of `null`
in `service/api/src/main/java/org/eclipse/kapua/model/xml/BinaryXmlAdapter.java`
#### Snippet
```java
    @Override
    public String marshal(byte[] binary) {
        return binary != null ? ByteArrayConverter.toString(binary) : null;
    }

```

### ReturnNull
Return of `null`
in `service/api/src/main/java/org/eclipse/kapua/model/xml/DateXmlAdapter.java`
#### Snippet
```java
    public String marshal(Date v) throws Exception {
        if (v == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `service/api/src/main/java/org/eclipse/kapua/model/xml/DateXmlAdapter.java`
#### Snippet
```java
    public Date unmarshal(String v) {
        if (v == null || v.isEmpty()) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `service/api/src/main/java/org/eclipse/kapua/model/type/ObjectTypeConverter.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `service/api/src/main/java/org/eclipse/kapua/locator/KapuaLocator.java`
#### Snippet
```java

        logger.debug("No service locator class resolved. Falling back to default.");
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `service/security/shiro/src/main/java/org/eclipse/kapua/service/authorization/role/shiro/RoleServiceImpl.java`
#### Snippet
```java
                .onBeforeHandler(() -> {
                    entityCache.remove(null, role);
                    return null;
                }));
    }
```

### ReturnNull
Return of `null`
in `service/security/shiro/src/main/java/org/eclipse/kapua/service/authorization/shiro/KapuaAuthorizingRealm.java`
#### Snippet
```java
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token)
            throws AuthenticationException {
        return null;
    }

```

### ReturnNull
Return of `null`
in `service/security/shiro/src/main/java/org/eclipse/kapua/service/authorization/access/shiro/AccessInfoCache.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `service/security/shiro/src/main/java/org/eclipse/kapua/service/authorization/access/shiro/AccessInfoServiceImpl.java`
#### Snippet
```java
                        return result.getFirstItem();
                    }
                    return null;
                }).onBeforeHandler(() -> (AccessInfo) ((AccessInfoCache) entityCache).getByUserId(scopeId, userId))
                .onAfterHandler((entity) -> entityCache.put(entity)));
```

### ReturnNull
Return of `null`
in `service/security/shiro/src/main/java/org/eclipse/kapua/service/authentication/shiro/AccessTokenCredentialsImpl.java`
#### Snippet
```java
                        (AccessTokenCredentialsImpl) accessTokenCredentials :
                        new AccessTokenCredentialsImpl(accessTokenCredentials))
                : null;
    }
}
```

### ReturnNull
Return of `null`
in `service/security/shiro/src/main/java/org/eclipse/kapua/service/authentication/shiro/UsernamePasswordCredentialsImpl.java`
#### Snippet
```java
                        (UsernamePasswordCredentialsImpl) usernamePasswordCredentials :
                        new UsernamePasswordCredentialsImpl(usernamePasswordCredentials))
                : null;
    }
}
```

### ReturnNull
Return of `null`
in `service/security/shiro/src/main/java/org/eclipse/kapua/service/authentication/shiro/ApiKeyCredentialsImpl.java`
#### Snippet
```java
                        (ApiKeyCredentialsImpl) apiKeyCredentials :
                        new ApiKeyCredentialsImpl(apiKeyCredentials))
                : null;
    }

```

### ReturnNull
Return of `null`
in `service/security/shiro/src/main/java/org/eclipse/kapua/service/authentication/shiro/JwtCredentialsImpl.java`
#### Snippet
```java
                        (JwtCredentialsImpl) jwtCredentials :
                        new JwtCredentialsImpl(jwtCredentials))
                : null;
    }
}
```

### ReturnNull
Return of `null`
in `service/security/shiro/src/main/java/org/eclipse/kapua/service/authentication/shiro/realm/UserPassAuthenticatingRealm.java`
#### Snippet
```java
                List<Credential> passwordCredentialList = userCredentialList.getItems(c -> CredentialType.PASSWORD.equals(c.getCredentialType()));

                return passwordCredentialList.isEmpty() ? null : passwordCredentialList.get(0);
            });
        } catch (AuthenticationException ae) {
```

### ReturnNull
Return of `null`
in `service/security/shiro/src/main/java/org/eclipse/kapua/service/authentication/shiro/AuthenticationServiceShiroImpl.java`
#### Snippet
```java
                // Exception should not be propagated it is sometimes expected behaviour
            }
            return null;
        });
        return createAccessToken((KapuaEid) expiredAccessToken.getScopeId(), (KapuaEid) expiredAccessToken.getUserId());
```

### ReturnNull
Return of `null`
in `service/security/shiro/src/main/java/org/eclipse/kapua/service/authentication/shiro/AuthenticationServiceShiroImpl.java`
#### Snippet
```java
                    return credentialMatched;
                } else {
                    return null;
                }
            });
```

### ReturnNull
Return of `null`
in `service/device/registry/test-steps/src/main/java/org/eclipse/kapua/service/device/registry/steps/AclCreator.java`
#### Snippet
```java
            }

            return null;
        });
    }
```

### ReturnNull
Return of `null`
in `service/device/registry/test-steps/src/main/java/org/eclipse/kapua/service/device/registry/steps/AclCreator.java`
#### Snippet
```java
            }

            return null;
        });
    }
```

### ReturnNull
Return of `null`
in `service/device/registry/test-steps/src/main/java/org/eclipse/kapua/service/device/registry/steps/AclCreator.java`
#### Snippet
```java
            }

            return null;
        });
    }
```

### ReturnNull
Return of `null`
in `service/device/call/kura/src/main/java/org/eclipse/kapua/service/device/call/message/kura/app/response/KuraResponsePayload.java`
#### Snippet
```java
    public KuraResponseCode getResponseCode() {
        Integer exitCode = (Integer) getMetrics().get(KuraResponseMetrics.EXIT_CODE.getName());
        return exitCode != null ? KuraResponseCode.fromResponseCode(exitCode) : null;
    }

```

### ReturnNull
Return of `null`
in `service/device/call/kura/src/main/java/org/eclipse/kapua/service/device/call/message/kura/app/notification/KuraNotifyPayload.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `service/device/call/kura/src/main/java/org/eclipse/kapua/service/device/call/message/kura/app/notification/KuraNotifyPayload.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `commons/src/main/java/org/eclipse/kapua/commons/jpa/EntityManagerContainer.java`
#### Snippet
```java
        }
        else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `commons/src/main/java/org/eclipse/kapua/commons/jpa/EntityManagerSession.java`
#### Snippet
```java
            return ServiceEventScope.get();
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `service/device/registry/test-steps/src/main/java/org/eclipse/kapua/service/device/registry/steps/DeviceRegistrySteps.java`
#### Snippet
```java
                return ConnectionUserCouplingMode.STRICT;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `service/device/registry/test-steps/src/main/java/org/eclipse/kapua/service/device/registry/steps/DeviceRegistrySteps.java`
#### Snippet
```java
                return DeviceConnectionStatus.MISSING;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `commons/src/main/java/org/eclipse/kapua/commons/util/KapuaDateUtils.java`
#### Snippet
```java
    public static String formatDate(Date date) throws ParseException {
        if (date == null) {
            return null;
        } else {
            return FORMATTER.format(date.toInstant());
```

### ReturnNull
Return of `null`
in `commons/src/main/java/org/eclipse/kapua/commons/util/KapuaDateUtils.java`
#### Snippet
```java
    public static Date parseDate(String date) throws ParseException {
        if (date == null) {
            return null;
        } else {
            return Date.from(Instant.from(FORMATTER.parse(date)));
```

### ReturnNull
Return of `null`
in `commons/src/main/java/org/eclipse/kapua/commons/util/StringUtil.java`
#### Snippet
```java
        // return defaultValues.toArray( new String[]{});
        if (strValues == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `commons/src/main/java/org/eclipse/kapua/commons/util/StringUtil.java`
#### Snippet
```java
    public static Object stringToValue(String type, String string) throws KapuaException {
        if (string == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `commons/src/main/java/org/eclipse/kapua/commons/util/StringUtil.java`
#### Snippet
```java

        if (TscalarImpl.BOOLEAN.equals(scalarType)) {
            return StringUtils.isEmpty(string) ? null : Boolean.valueOf(string);
        }

```

### ReturnNull
Return of `null`
in `commons/src/main/java/org/eclipse/kapua/commons/util/StringUtil.java`
#### Snippet
```java

        if (TscalarImpl.BYTE.equals(scalarType)) {
            return StringUtils.isEmpty(string) ? null : Byte.valueOf(string);
        }

```

### ReturnNull
Return of `null`
in `commons/src/main/java/org/eclipse/kapua/commons/util/StringUtil.java`
#### Snippet
```java

        if (TscalarImpl.DOUBLE.equals(scalarType)) {
            return StringUtils.isEmpty(string) ? null : Double.valueOf(string);
        }

```

### ReturnNull
Return of `null`
in `commons/src/main/java/org/eclipse/kapua/commons/util/StringUtil.java`
#### Snippet
```java

        if (TscalarImpl.FLOAT.equals(scalarType)) {
            return StringUtils.isEmpty(string) ? null : Float.valueOf(string);
        }

```

### ReturnNull
Return of `null`
in `commons/src/main/java/org/eclipse/kapua/commons/util/StringUtil.java`
#### Snippet
```java

        if (TscalarImpl.INTEGER.equals(scalarType)) {
            return StringUtils.isEmpty(string) ? null : Integer.valueOf(string);
        }

```

### ReturnNull
Return of `null`
in `commons/src/main/java/org/eclipse/kapua/commons/util/StringUtil.java`
#### Snippet
```java

        if (TscalarImpl.LONG.equals(scalarType)) {
            return StringUtils.isEmpty(string) ? null : Long.valueOf(string);
        }

```

### ReturnNull
Return of `null`
in `commons/src/main/java/org/eclipse/kapua/commons/util/StringUtil.java`
#### Snippet
```java

        if (TscalarImpl.SHORT.equals(scalarType)) {
            return StringUtils.isEmpty(string) ? null : Short.valueOf(string);
        }

```

### ReturnNull
Return of `null`
in `commons/src/main/java/org/eclipse/kapua/commons/event/ServiceEventScope.java`
#### Snippet
```java
            return tmp.peek();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `commons/src/main/java/org/eclipse/kapua/commons/model/id/KapuaEid.java`
#### Snippet
```java
     */
    public static KapuaEid parseKapuaId(KapuaId kapuaId) {
        return kapuaId != null ? (kapuaId instanceof KapuaEid ? (KapuaEid) kapuaId : new KapuaEid(kapuaId)) : null;
    }

```

### ReturnNull
Return of `null`
in `commons/src/main/java/org/eclipse/kapua/commons/model/query/KapuaListResultImpl.java`
#### Snippet
```java
    @Override
    public E getFirstItem() {
        return this.isEmpty() ? null : getItem(0);
    }

```

### ReturnNull
Return of `null`
in `commons/src/main/java/org/eclipse/kapua/commons/service/internal/cache/NamedEntityCache.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `commons/src/main/java/org/eclipse/kapua/commons/service/internal/cache/dummy/CachingProvider.java`
#### Snippet
```java
    @Override
    public Properties getDefaultProperties() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `commons/src/main/java/org/eclipse/kapua/commons/service/internal/cache/dummy/CachingProvider.java`
#### Snippet
```java
    @Override
    public URI getDefaultURI() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `commons/src/main/java/org/eclipse/kapua/commons/service/internal/cache/dummy/CachingProvider.java`
#### Snippet
```java
    @Override
    public ClassLoader getDefaultClassLoader() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `commons/src/main/java/org/eclipse/kapua/commons/service/internal/cache/dummy/Cache.java`
#### Snippet
```java
    @Override
    public Object get(Object key) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `commons/src/main/java/org/eclipse/kapua/commons/service/internal/cache/dummy/CacheManager.java`
#### Snippet
```java
    @Override
    public CachingProvider getCachingProvider() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `commons/src/main/java/org/eclipse/kapua/commons/service/internal/cache/dummy/CacheManager.java`
#### Snippet
```java
    @Override
    public URI getURI() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `commons/src/main/java/org/eclipse/kapua/commons/service/internal/cache/dummy/CacheManager.java`
#### Snippet
```java
    @Override
    public Iterable<String> getCacheNames() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `commons/src/main/java/org/eclipse/kapua/commons/service/internal/cache/dummy/CacheManager.java`
#### Snippet
```java
    @Override
    public <T> T unwrap(Class<T> clazz) {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `commons/src/main/java/org/eclipse/kapua/commons/service/internal/cache/dummy/CacheManager.java`
#### Snippet
```java
    @Override
    public <K, V> javax.cache.Cache getCache(String cacheName) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `commons/src/main/java/org/eclipse/kapua/commons/service/internal/cache/dummy/CacheManager.java`
#### Snippet
```java
    @Override
    public Properties getProperties() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `commons/src/main/java/org/eclipse/kapua/commons/service/internal/cache/dummy/CacheManager.java`
#### Snippet
```java
    @Override
    public ClassLoader getClassLoader() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `commons/src/main/java/org/eclipse/kapua/commons/service/internal/cache/dummy/CacheManager.java`
#### Snippet
```java
    @Override
    public <K, V> javax.cache.Cache getCache(String cacheName, Class<K> keyType, Class<V> valueType) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `commons/src/main/java/org/eclipse/kapua/commons/service/internal/cache/EntityCache.java`
#### Snippet
```java
            return entity;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `commons/src/main/java/org/eclipse/kapua/commons/service/internal/cache/EntityCache.java`
#### Snippet
```java
                return entity;
            } else {
                return null;
            }
        } else {
```

### ReturnNull
Return of `null`
in `commons/src/main/java/org/eclipse/kapua/commons/service/internal/cache/EntityCache.java`
#### Snippet
```java
            }
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `commons/src/main/java/org/eclipse/kapua/commons/service/internal/cache/EntityCache.java`
#### Snippet
```java
                return entity;
            } else {
                return null;
            }
        } else {
```

### ReturnNull
Return of `null`
in `commons/src/main/java/org/eclipse/kapua/commons/service/internal/cache/EntityCache.java`
#### Snippet
```java
            }
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `commons/src/main/java/org/eclipse/kapua/commons/service/internal/cache/EntityCache.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `commons/src/main/java/org/eclipse/kapua/commons/service/internal/cache/EntityCache.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `commons/src/main/java/org/eclipse/kapua/commons/service/internal/cache/EntityCache.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `commons/src/main/java/org/eclipse/kapua/commons/setting/EnvFriendlyConfiguration.java`
#### Snippet
```java
            return property;
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `commons/src/main/java/org/eclipse/kapua/commons/setting/AbstractBaseKapuaSetting.java`
#### Snippet
```java
    public static <K extends SettingKey> AbstractBaseKapuaSetting<K> fromMap(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new AbstractBaseKapuaSetting<>(new DataConfiguration(new MapConfiguration(map)));
```

### ReturnNull
Return of `null`
in `commons/src/main/java/org/eclipse/kapua/commons/configuration/ValueTokenizer.java`
#### Snippet
```java
    public String getValuesAsString() {
        if (values.isEmpty()) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `commons/src/main/java/org/eclipse/kapua/commons/configuration/ValueTokenizer.java`
#### Snippet
```java
    public String[] getValuesAsArray() {
        if (values.isEmpty()) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `commons/src/main/java/org/eclipse/kapua/commons/configuration/metatype/EmptyTocd.java`
#### Snippet
```java
    @Override
    public String getDescription() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `service/job/internal/src/main/java/org/eclipse/kapua/service/job/step/definition/internal/JobStepPropertyImpl.java`
#### Snippet
```java

    public static JobStepPropertyImpl parse(JobStepProperty jobStepProperty) {
        return jobStepProperty != null ? (jobStepProperty instanceof JobStepPropertyImpl ? (JobStepPropertyImpl) jobStepProperty : new JobStepPropertyImpl(jobStepProperty)) : null;
    }
}
```

### ReturnNull
Return of `null`
in `service/device/management/registry/api/src/main/java/org/eclipse/kapua/service/device/management/registry/operation/DeviceManagementOperationStatus.java`
#### Snippet
```java
                return DeviceManagementOperationStatus.STALE;
            default:
                return null;
        }
    }
```

### ReturnNull
Return of `null`
in `commons/src/main/java/org/eclipse/kapua/commons/configuration/AbstractKapuaConfigurableService.java`
#### Snippet
```java

        if (url == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `commons/src/main/java/org/eclipse/kapua/commons/configuration/AbstractKapuaConfigurableService.java`
#### Snippet
```java
        KapuaTocd ocd = getConfigMetadata(scopeId, excludeDisabled);

        return ocd == null ? null : toValues(ocd, properties);
    }

```

### ReturnNull
Return of `null`
in `commons/src/main/java/org/eclipse/kapua/commons/configuration/AbstractKapuaConfigurableService.java`
#### Snippet
```java
                .onBeforeHandler(() -> {
                    PRIVATE_ENTITY_CACHE.removeList(serviceConfig.getScopeId(), pid);
                    return null;
                })
        );
```

### ReturnNull
Return of `null`
in `commons/src/main/java/org/eclipse/kapua/commons/configuration/AbstractKapuaConfigurableService.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `commons/src/main/java/org/eclipse/kapua/commons/configuration/AbstractKapuaConfigurableService.java`
#### Snippet
```java
                        .onBeforeHandler(() -> {
                            PRIVATE_ENTITY_CACHE.removeList(serviceConfig.getScopeId(), pid);
                            return null;
                        })
        );
```

### ReturnNull
Return of `null`
in `job-engine/jbatch/src/main/java/org/eclipse/kapua/job/engine/jbatch/JobStartOptionsImpl.java`
#### Snippet
```java

    public static JobStartOptionsImpl parse(JobStartOptions jobStartOptions) {
        return jobStartOptions != null ? (jobStartOptions instanceof JobStartOptionsImpl ? (JobStartOptionsImpl) jobStartOptions : new JobStartOptionsImpl(jobStartOptions)) : null;
    }
}
```

### ReturnNull
Return of `null`
in `job-engine/jbatch/src/main/java/org/eclipse/kapua/job/engine/jbatch/persistence/jpa/JpaStepStatusDAO.java`
#### Snippet
```java
        List<JpaStepStatus> queryResult = selectQuery.getResultList();

        return queryResult.isEmpty() ? null : queryResult.get(0);
    }
}
```

### ReturnNull
Return of `null`
in `job-engine/jbatch/src/main/java/org/eclipse/kapua/job/engine/jbatch/persistence/jpa/JpaStepExecutionInstanceData.java`
#### Snippet
```java

    public Timestamp getStartTime() {
        return startTime != null ? new Timestamp(startTime.getTime()) : null;
    }

```

### ReturnNull
Return of `null`
in `job-engine/jbatch/src/main/java/org/eclipse/kapua/job/engine/jbatch/persistence/jpa/JpaStepExecutionInstanceData.java`
#### Snippet
```java

    public Timestamp getEndTime() {
        return endTime != null ? new Timestamp(endTime.getTime()) : null;
    }

```

### ReturnNull
Return of `null`
in `job-engine/commons/src/main/java/org/eclipse/kapua/job/engine/commons/step/definition/AbstractGenericJobStepDefinition.java`
#### Snippet
```java
    @Override
    public String getWriterName() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `job-engine/commons/src/main/java/org/eclipse/kapua/job/engine/commons/step/definition/AbstractGenericJobStepDefinition.java`
#### Snippet
```java
    @Override
    public String getReaderName() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `job-engine/jbatch/src/main/java/org/eclipse/kapua/job/engine/jbatch/listener/KapuaJobListener.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `job-engine/jbatch/src/main/java/org/eclipse/kapua/job/engine/jbatch/persistence/jpa/JpaExecutionInstanceData.java`
#### Snippet
```java

    public Timestamp getUpdateTime() {
        return updateTime != null ? new Timestamp(updateTime.getTime()) : null;
    }

```

### ReturnNull
Return of `null`
in `job-engine/jbatch/src/main/java/org/eclipse/kapua/job/engine/jbatch/persistence/jpa/JpaExecutionInstanceData.java`
#### Snippet
```java

    public Timestamp getCreateTime() {
        return createTime != null ? new Timestamp(createTime.getTime()) : null;
    }

```

### ReturnNull
Return of `null`
in `job-engine/jbatch/src/main/java/org/eclipse/kapua/job/engine/jbatch/persistence/jpa/JpaExecutionInstanceData.java`
#### Snippet
```java

    public Timestamp getStartTime() {
        return startTime != null ? new Timestamp(startTime.getTime()) : null;
    }

```

### ReturnNull
Return of `null`
in `job-engine/jbatch/src/main/java/org/eclipse/kapua/job/engine/jbatch/persistence/jpa/JpaExecutionInstanceData.java`
#### Snippet
```java

    public Timestamp getEndTime() {
        return endTime != null ? new Timestamp(endTime.getTime()) : null;
    }

```

### ReturnNull
Return of `null`
in `job-engine/commons/src/main/java/org/eclipse/kapua/job/engine/commons/wrappers/JobContextWrapper.java`
#### Snippet
```java
    public KapuaId getScopeId() {
        String scopeIdString = getProperties().getProperty(JobContextPropertyNames.JOB_SCOPE_ID);
        return scopeIdString != null ? KapuaEid.parseCompactId(scopeIdString) : null;
    }

```

### ReturnNull
Return of `null`
in `job-engine/commons/src/main/java/org/eclipse/kapua/job/engine/commons/wrappers/JobContextWrapper.java`
#### Snippet
```java
    public Integer getFromStepIndex() {
        String fromStepIndexString = getProperties().getProperty(JobContextPropertyNames.JOB_STEP_FROM_INDEX);
        return Strings.isNullOrEmpty(fromStepIndexString) ? null : Integer.valueOf(fromStepIndexString);
    }

```

### ReturnNull
Return of `null`
in `job-engine/commons/src/main/java/org/eclipse/kapua/job/engine/commons/wrappers/JobContextWrapper.java`
#### Snippet
```java
    public KapuaId getResumedJobExecutionId() {
        String resumedKapuaExecutionIdString = getProperties().getProperty(JobContextPropertyNames.RESUMED_KAPUA_EXECUTION_ID);
        return Strings.isNullOrEmpty(resumedKapuaExecutionIdString) ? null : KapuaEid.parseCompactId(resumedKapuaExecutionIdString);
    }

```

### ReturnNull
Return of `null`
in `job-engine/commons/src/main/java/org/eclipse/kapua/job/engine/commons/wrappers/JobContextWrapper.java`
#### Snippet
```java
    public KapuaId getJobId() {
        String jobIdString = getProperties().getProperty(JobContextPropertyNames.JOB_ID);
        return jobIdString != null ? KapuaEid.parseCompactId(jobIdString) : null;
    }

```

### ReturnNull
Return of `null`
in `job-engine/commons/src/main/java/org/eclipse/kapua/job/engine/commons/wrappers/StepContextWrapper.java`
#### Snippet
```java
        Properties jobContextProperties = stepContext.getProperties();
        String stepNextIndexString = jobContextProperties.getProperty(StepContextPropertyNames.STEP_NEXT_INDEX);
        return stepNextIndexString != null ? Integer.parseInt(stepNextIndexString) : null;
    }

```

### ReturnNull
Return of `null`
in `job-engine/jbatch/src/main/java/org/eclipse/kapua/job/engine/jbatch/persistence/JPAPersistenceManagerImpl.java`
#### Snippet
```java
        try {
            JpaJobStatus jpaJobStatus = entityManagerSession.doTransactedAction(em -> JpaJobStatusDAO.create(em, jobInstanceId));
            return jpaJobStatus != null ? jpaJobStatus.toJobStatus() : null;
        } catch (Exception e) {
            throw new PersistenceException(e);
```

### ReturnNull
Return of `null`
in `job-engine/jbatch/src/main/java/org/eclipse/kapua/job/engine/jbatch/persistence/JPAPersistenceManagerImpl.java`
#### Snippet
```java
        try {
            JpaJobInstanceData jpaJobInstanceData = entityManagerSession.doTransactedAction(em -> JpaJobInstanceDataDAO.create(em, name, appTag, jobXml));
            return jpaJobInstanceData != null ? jpaJobInstanceData.toJobInstance() : null;
        } catch (Exception e) {
            throw new PersistenceException(e);
```

### ReturnNull
Return of `null`
in `job-engine/jbatch/src/main/java/org/eclipse/kapua/job/engine/jbatch/persistence/JPAPersistenceManagerImpl.java`
#### Snippet
```java
        try {
            JpaStepExecutionInstanceData jpaStepExecutionInstanceData = entityManagerSession.doTransactedAction(em -> JpaStepExecutionInstanceDataDAO.insert(em, jobExecutionId, stepContext));
            return jpaStepExecutionInstanceData != null ? jpaStepExecutionInstanceData.toStepExecution() : null;
        } catch (Exception e) {
            throw new PersistenceException(e);
```

### ReturnNull
Return of `null`
in `job-engine/jbatch/src/main/java/org/eclipse/kapua/job/engine/jbatch/persistence/JPAPersistenceManagerImpl.java`
#### Snippet
```java
        try {
            JpaStepStatus jpaStepStatus = entityManagerSession.doTransactedAction(em -> JpaStepStatusDAO.create(em, stepExecutionId));
            return jpaStepStatus != null ? jpaStepStatus.toStepStatus() : null;
        } catch (Exception e) {
            throw new PersistenceException(e);
```

### ReturnNull
Return of `null`
in `job-engine/jbatch/src/main/java/org/eclipse/kapua/job/engine/jbatch/persistence/JPAPersistenceManagerImpl.java`
#### Snippet
```java
        try {
            JpaStepStatus jpaStepStatus = entityManagerSession.doAction(em -> JpaStepStatusDAO.getStepStatusByJobInstance(em, jobInstanceId, stepName));
            return jpaStepStatus != null ? jpaStepStatus.toStepStatus() : null;
        } catch (Exception e) {
            throw new PersistenceException(e);
```

### ReturnNull
Return of `null`
in `job-engine/jbatch/src/main/java/org/eclipse/kapua/job/engine/jbatch/persistence/JPAPersistenceManagerImpl.java`
#### Snippet
```java
        try {
            JpaStepExecutionInstanceData jpaStepExecutionInstanceData = entityManagerSession.doAction(em -> JpaStepExecutionInstanceDataDAO.find(em, stepExecId));
            return jpaStepExecutionInstanceData != null ? jpaStepExecutionInstanceData.toStepExecution() : null;
        } catch (Exception e) {
            throw new PersistenceException(e);
```

### ReturnNull
Return of `null`
in `job-engine/jbatch/src/main/java/org/eclipse/kapua/job/engine/jbatch/persistence/JPAPersistenceManagerImpl.java`
#### Snippet
```java
        try {
            JpaCheckpointData jpaCheckpointData = entityManagerSession.doAction(em -> JpaCheckpointDataDAO.find(em, checkpointDataKey));
            return jpaCheckpointData != null ? jpaCheckpointData.toCheckpointData() : null;
        } catch (Exception e) {
            throw new PersistenceException(e);
```

### ReturnNull
Return of `null`
in `service/account/api/src/main/java/org/eclipse/kapua/service/account/xml/AccountParentPathXmlAdapter.java`
#### Snippet
```java
    public String marshal(String parentAccountPathLong) {
        if (Strings.isNullOrEmpty(parentAccountPathLong)) {
            return null;
        } else {
            String[] parentAccountPathLongTokens = parentAccountPathLong.substring(1).split("/");
```

### ReturnNull
Return of `null`
in `service/account/api/src/main/java/org/eclipse/kapua/service/account/xml/AccountParentPathXmlAdapter.java`
#### Snippet
```java
    public String unmarshal(String parentAccountPathBase64) throws KapuaIllegalArgumentException {
        if (Strings.isNullOrEmpty(parentAccountPathBase64)) {
            return null;
        } else {
            String[] parentAccountPathBase64Tokens = parentAccountPathBase64.substring(1).split("/");
```

### ReturnNull
Return of `null`
in `commons/src/main/java/org/eclipse/kapua/commons/service/internal/ServiceDAO.java`
#### Snippet
```java
                return entityToFind;
            } else { // If no match, return no result
                return null;
            }
        } else {
```

### ReturnNull
Return of `null`
in `commons/src/main/java/org/eclipse/kapua/commons/service/internal/ServiceDAO.java`
#### Snippet
```java
            }
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `extras/encryption-migrator/src/main/java/org/eclipse/kapua/extras/migrator/encryption/job/JobStepPropertyMigrator.java`
#### Snippet
```java

    public static JobStepPropertyMigrator parse(JobStepProperty jobStepProperty) {
        return jobStepProperty != null ? (jobStepProperty instanceof JobStepPropertyMigrator ? (JobStepPropertyMigrator) jobStepProperty : new JobStepPropertyMigrator(jobStepProperty)) : null;
    }

```

### ReturnNull
Return of `null`
in `service/device/management/configuration-store/dummy/src/main/java/org/eclipse/kapua/service/device/management/configuration/store/dummy/DeviceConfigurationStoreFactoryDummy.java`
#### Snippet
```java
    @Override
    public DeviceConfigurationStoreSettings newDeviceConfigurationStoreSettings() {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `service/device/management/configuration-store/dummy/src/main/java/org/eclipse/kapua/service/device/management/configuration/store/dummy/DeviceConfigurationStoreServiceDummy.java`
#### Snippet
```java
    @Override
    public Map<String, Object> getConfigValues(KapuaId scopeId) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `service/device/management/configuration-store/dummy/src/main/java/org/eclipse/kapua/service/device/management/configuration/store/dummy/DeviceConfigurationStoreServiceDummy.java`
#### Snippet
```java
    @Override
    public DeviceConfiguration getConfigurations(KapuaId scopeId, KapuaId deviceId) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `service/device/management/configuration-store/dummy/src/main/java/org/eclipse/kapua/service/device/management/configuration/store/dummy/DeviceConfigurationStoreServiceDummy.java`
#### Snippet
```java
    @Override
    public DeviceConfigurationStoreSettings getApplicationSettings(KapuaId scopeId, KapuaId deviceId) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `service/device/management/configuration-store/dummy/src/main/java/org/eclipse/kapua/service/device/management/configuration/store/dummy/DeviceConfigurationStoreServiceDummy.java`
#### Snippet
```java
    @Override
    public DeviceComponentConfiguration getConfigurations(KapuaId scopeId, KapuaId deviceId, String configurationComponentPid) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `service/device/management/configuration-store/dummy/src/main/java/org/eclipse/kapua/service/device/management/configuration/store/dummy/DeviceConfigurationStoreServiceDummy.java`
#### Snippet
```java
    @Override
    public KapuaTocd getConfigMetadata(KapuaId scopeId) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `service/security/test-steps/src/main/java/org/eclipse/kapua/service/authorization/steps/AuthorizationServiceSteps.java`
#### Snippet
```java
            Assert.assertFalse(tmpDom1.equals(tmpDom3));
            Assert.assertFalse(tmpDom1.equals(tmpDom4));
            return null;
        });
    }
```

### ReturnNull
Return of `null`
in `service/user/test-steps/src/main/java/org/eclipse/kapua/service/user/steps/UserServiceSteps.java`
#### Snippet
```java
                verifyException(ke);
            }
            return null;
        });
        return;
```

### ReturnNull
Return of `null`
in `service/user/test-steps/src/main/java/org/eclipse/kapua/service/user/steps/UserServiceSteps.java`
#### Snippet
```java
                verifyException(ke);
            }
            return null;
        });
        return users;
```

### ReturnNull
Return of `null`
in `service/user/test-steps/src/main/java/org/eclipse/kapua/service/user/steps/UserServiceSteps.java`
#### Snippet
```java
        }
        stepData.put(BasicSteps.LAST_CREDENTIAL_ID, credentialList.get(0).getId());
        return credentialList.size() == 1 ? credentialList.get(0) : null;
    }

```

## RuleId[id=AssignmentToLambdaParameter]
### AssignmentToLambdaParameter
Assignment to lambda parameter `value`
in `translator/kapua/kura/src/main/java/org/eclipse/kapua/translator/kura/kapua/TranslatorAppConfigurationKuraKapua.java`
#### Snippet
```java
            // Special management of Password type field
            if (value instanceof KuraPassword) {
                value = new Password(((KuraPassword) value).getPassword());
            } else if (value instanceof KuraPassword[]) {
                KuraPassword[] kuraPasswords = (KuraPassword[]) value;
```

### AssignmentToLambdaParameter
Assignment to lambda parameter `value`
in `translator/kapua/kura/src/main/java/org/eclipse/kapua/translator/kura/kapua/TranslatorAppConfigurationKuraKapua.java`
#### Snippet
```java
                }

                value = passwords;
            }

```

### AssignmentToLambdaParameter
Assignment to lambda parameter `value`
in `translator/kapua/kura/src/main/java/org/eclipse/kapua/translator/kapua/kura/TranslatorAppConfigurationKapuaKura.java`
#### Snippet
```java
            // Special management of Password type field
            if (value instanceof Password) {
                value = new KuraPassword(((Password) value).getPassword());
            } else if (value instanceof Password[]) {
                Password[] passwords = (Password[]) value;
```

### AssignmentToLambdaParameter
Assignment to lambda parameter `value`
in `translator/kapua/kura/src/main/java/org/eclipse/kapua/translator/kapua/kura/TranslatorAppConfigurationKapuaKura.java`
#### Snippet
```java
                }

                value = kuraPasswords;
            }

```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `result` is redundant
in `client/gateway/provider/fuse/src/main/java/org/eclipse/kapua/client/gateway/mqtt/fuse/FuseChannel.java`
#### Snippet
```java

            final CallbackConnection connection = mqtt.callbackConnection();
            final FuseChannel result = new FuseChannel(clientId, namespace, codec, connection);
            return result;
        }
```

### UnnecessaryLocalVariable
Local variable `issuedAtDate` is redundant
in `service/security/shiro/src/main/java/org/eclipse/kapua/service/authentication/shiro/AuthenticationServiceShiroImpl.java`
#### Snippet
```java
        // Reserved claims
        String issuer = settings.getString(KapuaAuthenticationSettingKeys.AUTHENTICATION_SESSION_JWT_ISSUER);
        Date issuedAtDate = now; // Issued at claim
        Date expiresOnDate = new Date(now.getTime() + ttl); // Expires claim.

```

### UnnecessaryLocalVariable
Local variable `passwd` is redundant
in `service/device/registry/test-steps/src/main/java/org/eclipse/kapua/service/device/registry/steps/AclSteps.java`
#### Snippet
```java
        waitInMillis(BROKER_START_WAIT_MILLIS);
        // Login with system user
        String passwd = SYS_PASSWORD;
        LoginCredentials credentials = credentialsFactory.newUsernamePasswordCredentials(SYS_USERNAME, passwd);
        authenticationService.login(credentials);
```

### UnnecessaryLocalVariable
Local variable `tmpPayload` is redundant
in `service/device/registry/test-steps/src/main/java/org/eclipse/kapua/service/device/registry/steps/DeviceRegistrySteps.java`
#### Snippet
```java

    private KapuaMissingPayload prepareDefaultMissingPayload() {
        KapuaMissingPayload tmpPayload = lifecycleMessageFactory.newKapuaMissingPayload();
        return tmpPayload;
    }
```

### UnnecessaryLocalVariable
Local variable `serviceInterfaceName` is redundant
in `commons/src/main/java/org/eclipse/kapua/commons/event/RaiseServiceEventInterceptor.java`
#### Snippet
```java
            Class<?>[] implementedClass = wrappedClass.getInterfaces();
            // assuming that the KapuaService implemented is specified by the first implementing interface
            String serviceInterfaceName = implementedClass[0].getName();
            // String splittedServiceInterfaceName[] = serviceInterfaceName.split("\\.");
            // String serviceName = splittedServiceInterfaceName.length > 0 ? splittedServiceInterfaceName[splittedServiceInterfaceName.length-1] : "";
```

### UnnecessaryLocalVariable
Local variable `cleanedServiceName` is redundant
in `commons/src/main/java/org/eclipse/kapua/commons/event/RaiseServiceEventInterceptor.java`
#### Snippet
```java
            // String serviceName = splittedServiceInterfaceName.length > 0 ? splittedServiceInterfaceName[splittedServiceInterfaceName.length-1] : "";
            // String cleanedServiceName = serviceName.substring(0, serviceName.length()-"Service".length()).toLowerCase();
            String cleanedServiceName = serviceInterfaceName;
            LOG.debug("Service name '{}' ", cleanedServiceName);
            serviceEvent.setService(cleanedServiceName);
```

### UnnecessaryLocalVariable
Local variable `scpId` is redundant
in `service/user/test-steps/src/main/java/org/eclipse/kapua/service/user/steps/UserServiceSteps.java`
#### Snippet
```java
    @Then("I search for the user with expiration date in the present")
    public void iSearchForTheUserWithExpirationDateInThePresent() throws KapuaException {
        KapuaId scpId = DEFAULT_ID;
        Set<ComparableUser> iFoundUsers;
        stepData.remove(USER_LIST);
```

### UnnecessaryLocalVariable
Local variable `scopeId` is redundant
in `service/user/test-steps/src/main/java/org/eclipse/kapua/service/user/steps/UserServiceSteps.java`
#### Snippet
```java
        Map<String, Object> valueMap = new HashMap<>();
        KapuaId accId = new KapuaEid(BigInteger.valueOf(accountId));
        KapuaId scopeId = SYS_SCOPE_ID;
        for (CucConfig config : cucConfigs) {
            config.addConfigToMap(valueMap);
```

### UnnecessaryLocalVariable
Local variable `scpId` is redundant
in `service/user/test-steps/src/main/java/org/eclipse/kapua/service/user/steps/UserServiceSteps.java`
#### Snippet
```java
    @Then("I search for the user with expiration date in the past")
    public void iSearchForTheUserWithExpirationDateInThePast() throws KapuaException {
        KapuaId scpId = DEFAULT_ID;
        Set<ComparableUser> iFoundUsers;
        stepData.remove(USER_LIST);
```

### UnnecessaryLocalVariable
Local variable `scpId` is redundant
in `service/user/test-steps/src/main/java/org/eclipse/kapua/service/user/steps/UserServiceSteps.java`
#### Snippet
```java
    @When("I search for users")
    public void searchForUsers() throws Exception {
        KapuaId scpId = DEFAULT_ID;
        Set<ComparableUser> iFoundUsers;
        stepData.remove(USER_LIST);
```

## RuleId[id=BusyWait]
### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `qa/common/src/main/java/org/eclipse/kapua/qa/common/Wait.java`
#### Snippet
```java
                    return true;
                }
                Thread.sleep(testPeriod.toMillis());
            } catch (final Exception e) {
                throw new RuntimeException(e);
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `service/commons/elasticsearch/client-rest/src/main/java/org/eclipse/kapua/service/elasticsearch/client/rest/RestElasticsearchClient.java`
#### Snippet
```java
                        if (retryCount < getClientConfiguration().getRequestConfiguration().getRequestRetryAttemptMax() - 1) {
                            try {
                                Thread.sleep((long) (getClientConfiguration().getRequestConfiguration().getRequestRetryAttemptWait() * (0.5 + RANDOM.nextFloat() / 2)));
                            } catch (InterruptedException e1) {
                                Thread.currentThread().interrupt();
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `service/scheduler/quartz/src/main/java/org/eclipse/kapua/service/scheduler/quartz/driver/QuartzTriggerDriver.java`
#### Snippet
```java
                    LOG.warn("Initializing Quartz Scheduler instance... ERROR! Retrying in a while ({}/{})... Error occurred: {}", attempt, maxAttempt, se.getMessage());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `service/device/registry/internal/src/main/java/org/eclipse/kapua/service/device/registry/lifecycle/internal/DeviceLifeCycleServiceImpl.java`
#### Snippet
```java
                if (retry < MAX_RETRY) {
                    try {
                        Thread.sleep((long) (Math.random() * MAX_WAIT));
                    } catch (InterruptedException e1) {
                        LOG.warn("Error while waiting retry: {}", e.getMessage());
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `service/job/test-steps/src/main/java/org/eclipse/kapua/service/job/steps/JobTargetServiceSteps.java`
#### Snippet
```java
                    return;
                }
                Thread.sleep(1000);
            }
            while (System.currentTimeMillis() < endWaitTime);
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `service/job/test-steps/src/main/java/org/eclipse/kapua/service/job/steps/JobExecutionServiceSteps.java`
#### Snippet
```java
                verifyException(ex);
            }
            Thread.sleep(1000);
        }
        while (System.currentTimeMillis() < endWaitTime);
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `service/job/test-steps/src/main/java/org/eclipse/kapua/service/job/steps/JobStepServiceSteps.java`
#### Snippet
```java
                    return;
                }
                Thread.sleep(1000);
            }
            while (System.currentTimeMillis() < endWaitTime);
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `commons/src/main/java/org/eclipse/kapua/commons/event/ServiceEventModule.java`
#### Snippet
```java
            while (houseKeeperHandler.isDone()) {
                try {
                    Thread.sleep(WAIT_TIME);
                } catch (InterruptedException e) {
                    // do nothing
```

## RuleId[id=WaitNotInLoop]
### WaitNotInLoop
Call to `wait()` is not in loop
in `qa/integration-steps/src/main/java/org/eclipse/kapua/qa/integration/steps/DockerSteps.java`
#### Snippet
```java
            startMessageBrokerContainer(BasicSteps.MESSAGE_BROKER_CONTAINER_NAME);
            synchronized (this) {
                this.wait(WAIT_FOR_BROKER);
            }

```

### WaitNotInLoop
Call to `wait()` is not in loop
in `qa/integration-steps/src/main/java/org/eclipse/kapua/qa/integration/steps/DockerSteps.java`
#### Snippet
```java
            startDBContainer(BasicSteps.DB_CONTAINER_NAME);
            synchronized (this) {
                this.wait(WAIT_FOR_DB);
            }

```

### WaitNotInLoop
Call to `wait()` is not in loop
in `qa/integration-steps/src/main/java/org/eclipse/kapua/qa/integration/steps/DockerSteps.java`
#### Snippet
```java
            startESContainer(BasicSteps.ES_CONTAINER_NAME);
            synchronized (this) {
                this.wait(WAIT_FOR_ES);
            }

```

### WaitNotInLoop
Call to `wait()` is not in loop
in `qa/integration-steps/src/main/java/org/eclipse/kapua/qa/integration/steps/DockerSteps.java`
#### Snippet
```java
            startEventBrokerContainer(BasicSteps.EVENTS_BROKER_CONTAINER_NAME);
            synchronized (this) {
                this.wait(WAIT_FOR_EVENTS_BROKER);
            }

```

### WaitNotInLoop
Call to `wait()` is not in loop
in `qa/integration-steps/src/main/java/org/eclipse/kapua/qa/integration/steps/DockerSteps.java`
#### Snippet
```java
            startJobEngineContainer(BasicSteps.JOB_ENGINE_CONTAINER_NAME);
            synchronized (this) {
                this.wait(WAIT_FOR_JOB_ENGINE);
            }
        } catch (Exception e) {
```

### WaitNotInLoop
Call to `wait()` is not in loop
in `transport/mqtt/src/main/java/org/eclipse/kapua/transport/mqtt/MqttFacade.java`
#### Snippet
```java
        try {
            synchronized (mqttClientCallback) {
                mqttClientCallback.wait();
            }
        } catch (InterruptedException e) {
```

### WaitNotInLoop
Call to `wait()` is not in loop
in `commons/src/main/java/org/eclipse/kapua/commons/event/ServiceEventHousekeeper.java`
#### Snippet
```java
        try {
            synchronized (monitor) {
                monitor.wait(WAIT_TIME);
            }
        } catch (InterruptedException e) {
```

## RuleId[id=PointlessBooleanExpression]
### PointlessBooleanExpression
`packageListChangedAfterUninstall == true` can be simplified to 'packageListChangedAfterUninstall'
in `service/device/registry/test-steps/src/main/java/org/eclipse/kapua/service/device/registry/steps/KuraDevice.java`
#### Snippet
```java

                responseTopic = $EDC + CLIENT_ACCOUNT + "/" + callbackParam.getClientId() + DEPLOY_V2_REPLY + callbackParam.getRequestId();
                responsePayload = Files.readAllBytes(Paths.get(getClass().getResource(packageListChanged ? "/mqtt/KapuaPool-client-id_DEPLOY-V2_REPLY_req-id_packages_updated_list.mqtt" : (packageListChangedAfterUninstall == true ? "/mqtt/KapuaPoolClient-id_DEPLOY_V2_REPLY_package_list_after_uninstall.mqtt" : "/mqtt/KapuaPool-client-id_DEPLOY-V2_REPLY_req-id_packages_initial_list.mqtt")).toURI()));

                mqttClient.publish(responseTopic, responsePayload, 0, false);
```

### PointlessBooleanExpression
`start == true` can be simplified to 'start'
in `broker/client/src/main/java/org/eclipse/kapua/broker/client/pool/JmsProducerWrapper.java`
#### Snippet
```java
    protected JmsProducerWrapper(ActiveMQConnectionFactory vmconnFactory, String destination, boolean transacted, boolean start) throws JMSException, KapuaException {
        connection = vmconnFactory.createConnection();
        if (start == true) {
            connection.start();
        }
```

### PointlessBooleanExpression
`start == true` can be simplified to 'start'
in `broker/client/src/main/java/org/eclipse/kapua/broker/client/pool/JmsConsumerWrapper.java`
#### Snippet
```java
        }
        connection = JmsConnectionFactory.VM_CONN_FACTORY.createConnection();
        if (start == true) {
            connection.start();
        }
```

## RuleId[id=UseBulkOperation]
### UseBulkOperation
Iteration can be replaced with bulk 'Collection.addAll()' call
in `qa/common/src/main/java/org/eclipse/kapua/qa/common/StepData.java`
#### Snippet
```java
        Iterator<String> keyIterator = setOfKeys.iterator();
        while (keyIterator.hasNext()) {
            keys.add(keyIterator.next());
        }

```

### UseBulkOperation
Iteration can be replaced with bulk 'Collection.addAll()' call
in `service/datastore/test-steps/src/main/java/org/eclipse/kapua/service/datastore/steps/DatastoreSteps.java`
#### Snippet
```java
            msgClients.add(tmpMsg.getClientId());
            for (String tmpMet : tmpMsg.getPayload().getMetrics().keySet()) {
                msgMetrics.add(tmpMet);
            }
        }
```

## RuleId[id=UnstableApiUsage]
### UnstableApiUsage
'withKeyValueSeparator(java.lang.String)' is marked unstable with @Beta
in `consumer/commons/src/main/java/org/eclipse/kapua/consumer/commons/message/system/DefaultSystemMessageCreator.java`
#### Snippet
```java

    public Map<String, String> convertFrom(String message) {
         return Splitter.on(FIELD_SEPARATOR).withKeyValueSeparator(PAIR_SEPARATOR).split(message);
    }

```

### UnstableApiUsage
'split(java.lang.CharSequence)' is declared in unstable class 'com.google.common.base.Splitter.MapSplitter' marked with @Beta
in `consumer/commons/src/main/java/org/eclipse/kapua/consumer/commons/message/system/DefaultSystemMessageCreator.java`
#### Snippet
```java

    public Map<String, String> convertFrom(String message) {
         return Splitter.on(FIELD_SEPARATOR).withKeyValueSeparator(PAIR_SEPARATOR).split(message);
    }

```

### UnstableApiUsage
'com.google.common.hash.Hashing' is marked unstable with @Beta
in `service/datastore/internal/src/main/java/org/eclipse/kapua/service/datastore/internal/mediator/DatastoreUtils.java`
#### Snippet
```java
        }

        byte[] hashCode = Hashing.sha256()
                .hashString(concatString, StandardCharsets.UTF_8)
                .asBytes();
```

### UnstableApiUsage
'sha256()' is declared in unstable class 'com.google.common.hash.Hashing' marked with @Beta
in `service/datastore/internal/src/main/java/org/eclipse/kapua/service/datastore/internal/mediator/DatastoreUtils.java`
#### Snippet
```java
        }

        byte[] hashCode = Hashing.sha256()
                .hashString(concatString, StandardCharsets.UTF_8)
                .asBytes();
```

### UnstableApiUsage
'hashString(java.lang.CharSequence, java.nio.charset.Charset)' is declared in unstable interface 'com.google.common.hash.HashFunction' marked with @Beta
in `service/datastore/internal/src/main/java/org/eclipse/kapua/service/datastore/internal/mediator/DatastoreUtils.java`
#### Snippet
```java

        byte[] hashCode = Hashing.sha256()
                .hashString(concatString, StandardCharsets.UTF_8)
                .asBytes();

```

### UnstableApiUsage
'asBytes()' is declared in unstable class 'com.google.common.hash.HashCode' marked with @Beta
in `service/datastore/internal/src/main/java/org/eclipse/kapua/service/datastore/internal/mediator/DatastoreUtils.java`
#### Snippet
```java
        byte[] hashCode = Hashing.sha256()
                .hashString(concatString, StandardCharsets.UTF_8)
                .asBytes();

        // ES 5.2 FIX
```

### UnstableApiUsage
'countTrue(boolean...)' is marked unstable with @Beta
in `service/device/call/kura/src/main/java/org/eclipse/kapua/service/device/call/message/kura/KuraPayload.java`
#### Snippet
```java
        // For performance reason check the position before
        if (devicePosition == null &&
                Booleans.countTrue(
                        protoPosition.hasLatitude(),
                        protoPosition.hasLatitude(),
```

### UnstableApiUsage
'com.google.common.reflect.ClassPath' is marked unstable with @Beta
in `locator/guice/src/main/java/org/eclipse/kapua/locator/guice/KapuaModule.java`
#### Snippet
```java

            ClassLoader classLoader = this.getClass().getClassLoader();
            ClassPath classPath = ClassPath.from(classLoader);
            boolean initialize = true;

```

### UnstableApiUsage
'com.google.common.reflect.ClassPath' is marked unstable with @Beta
in `locator/guice/src/main/java/org/eclipse/kapua/locator/guice/KapuaModule.java`
#### Snippet
```java

            ClassLoader classLoader = this.getClass().getClassLoader();
            ClassPath classPath = ClassPath.from(classLoader);
            boolean initialize = true;

```

### UnstableApiUsage
'from(java.lang.ClassLoader)' is declared in unstable class 'com.google.common.reflect.ClassPath' marked with @Beta
in `locator/guice/src/main/java/org/eclipse/kapua/locator/guice/KapuaModule.java`
#### Snippet
```java

            ClassLoader classLoader = this.getClass().getClassLoader();
            ClassPath classPath = ClassPath.from(classLoader);
            boolean initialize = true;

```

### UnstableApiUsage
'com.google.common.reflect.ClassPath.ClassInfo' is marked unstable with @Beta
in `locator/guice/src/main/java/org/eclipse/kapua/locator/guice/KapuaModule.java`
#### Snippet
```java
            for (String packageName : packageNames) {
                // Use the class loader of this (module) class
                ImmutableSet<ClassInfo> classInfos = classPath.getTopLevelClassesRecursive(packageName);
                for (ClassInfo classInfo : classInfos) {
                    if (isExcluded(classInfo.getName(), excludedPkgNames)) {
```

### UnstableApiUsage
'getTopLevelClassesRecursive(java.lang.String)' is declared in unstable class 'com.google.common.reflect.ClassPath' marked with @Beta
in `locator/guice/src/main/java/org/eclipse/kapua/locator/guice/KapuaModule.java`
#### Snippet
```java
            for (String packageName : packageNames) {
                // Use the class loader of this (module) class
                ImmutableSet<ClassInfo> classInfos = classPath.getTopLevelClassesRecursive(packageName);
                for (ClassInfo classInfo : classInfos) {
                    if (isExcluded(classInfo.getName(), excludedPkgNames)) {
```

### UnstableApiUsage
'com.google.common.reflect.ClassPath.ClassInfo' is marked unstable with @Beta
in `locator/guice/src/main/java/org/eclipse/kapua/locator/guice/KapuaModule.java`
#### Snippet
```java
                // Use the class loader of this (module) class
                ImmutableSet<ClassInfo> classInfos = classPath.getTopLevelClassesRecursive(packageName);
                for (ClassInfo classInfo : classInfos) {
                    if (isExcluded(classInfo.getName(), excludedPkgNames)) {
                         logger.trace("CLASS: {} ... excluded by configuration, skip", classInfo.getName());
```

### UnstableApiUsage
'getName()' is declared in unstable class 'com.google.common.reflect.ClassPath.ClassInfo' marked with @Beta
in `locator/guice/src/main/java/org/eclipse/kapua/locator/guice/KapuaModule.java`
#### Snippet
```java
                ImmutableSet<ClassInfo> classInfos = classPath.getTopLevelClassesRecursive(packageName);
                for (ClassInfo classInfo : classInfos) {
                    if (isExcluded(classInfo.getName(), excludedPkgNames)) {
                         logger.trace("CLASS: {} ... excluded by configuration, skip", classInfo.getName());
                         continue;
```

### UnstableApiUsage
'getName()' is declared in unstable class 'com.google.common.reflect.ClassPath.ClassInfo' marked with @Beta
in `locator/guice/src/main/java/org/eclipse/kapua/locator/guice/KapuaModule.java`
#### Snippet
```java
                for (ClassInfo classInfo : classInfos) {
                    if (isExcluded(classInfo.getName(), excludedPkgNames)) {
                         logger.trace("CLASS: {} ... excluded by configuration, skip", classInfo.getName());
                         continue;
                    }
```

### UnstableApiUsage
'getName()' is declared in unstable class 'com.google.common.reflect.ClassPath.ClassInfo' marked with @Beta
in `locator/guice/src/main/java/org/eclipse/kapua/locator/guice/KapuaModule.java`
#### Snippet
```java
                         continue;
                    }
                    logger.trace("CLASS: {}", classInfo.getName());
                    Class<?> theClass = Class.forName(classInfo.getName(), !initialize, classLoader);
                    KapuaProvider serviceProvider = theClass.getAnnotation(KapuaProvider.class);
```

### UnstableApiUsage
'getName()' is declared in unstable class 'com.google.common.reflect.ClassPath.ClassInfo' marked with @Beta
in `locator/guice/src/main/java/org/eclipse/kapua/locator/guice/KapuaModule.java`
#### Snippet
```java
                    }
                    logger.trace("CLASS: {}", classInfo.getName());
                    Class<?> theClass = Class.forName(classInfo.getName(), !initialize, classLoader);
                    KapuaProvider serviceProvider = theClass.getAnnotation(KapuaProvider.class);
                    if (serviceProvider != null) {
```

## RuleId[id=StaticCallOnSubclass]
### StaticCallOnSubclass
Static method `byNetworkName()` declared in class 'com.spotify.docker.client.DockerClient.ListNetworksParam' but referenced via subclass 'com.spotify.docker.client.DockerClient.ListNetworksFilterParam'
in `qa/integration-steps/src/main/java/org/eclipse/kapua/qa/integration/steps/DockerSteps.java`
#### Snippet
```java
    @Given("Remove network")
    public void removeNetwork() throws DockerException, InterruptedException {
        List<Network> networkList = DockerUtil.getDockerClient().listNetworks(ListNetworksFilterParam.byNetworkName(NETWORK_PREFIX));
        if (networkList != null) {
            for (Network network : networkList) {
```

## RuleId[id=ObsoleteCollection]
### ObsoleteCollection
Obsolete collection type `Vector` used
in `service/device/registry/test-steps/src/main/java/org/eclipse/kapua/service/device/registry/steps/DeviceRegistrySteps.java`
#### Snippet
```java
            stepData.put(DEVICE_CONNECTION, tmpConn);
            if (tmpConn != null) {
                Vector<DeviceConnection> dcv = new Vector<>();
                dcv.add(tmpConn);
                tmpConnLst.addItems(dcv);
```

### ObsoleteCollection
Obsolete collection type `Vector<>` used
in `service/device/registry/test-steps/src/main/java/org/eclipse/kapua/service/device/registry/steps/DeviceRegistrySteps.java`
#### Snippet
```java
            stepData.put(DEVICE_CONNECTION, tmpConn);
            if (tmpConn != null) {
                Vector<DeviceConnection> dcv = new Vector<>();
                dcv.add(tmpConn);
                tmpConnLst.addItems(dcv);
```

### ObsoleteCollection
Obsolete collection type `Vector` used
in `service/device/registry/test-steps/src/main/java/org/eclipse/kapua/service/device/registry/steps/DeviceRegistrySteps.java`
#### Snippet
```java
            Device tmpDev = deviceRegistryService.findByClientId(tmpAcc.getId(), clientId);
            if (tmpDev != null) {
                Vector<Device> dv = new Vector<>();
                dv.add(tmpDev);
                tmpList.addItems(dv);
```

### ObsoleteCollection
Obsolete collection type `Vector<>` used
in `service/device/registry/test-steps/src/main/java/org/eclipse/kapua/service/device/registry/steps/DeviceRegistrySteps.java`
#### Snippet
```java
            Device tmpDev = deviceRegistryService.findByClientId(tmpAcc.getId(), clientId);
            if (tmpDev != null) {
                Vector<Device> dv = new Vector<>();
                dv.add(tmpDev);
                tmpList.addItems(dv);
```

### ObsoleteCollection
Obsolete collection type `Stack` used
in `commons/src/main/java/org/eclipse/kapua/commons/event/ServiceEventScope.java`
#### Snippet
```java

        // Is it the first call in the stack? Is there already a Stack?
        Stack<ServiceEvent> eventStack = eventContextThdLocal.get();
        if (eventStack == null) {
            eventStack = new Stack<>();
```

### ObsoleteCollection
Obsolete collection type `Stack<>` used
in `commons/src/main/java/org/eclipse/kapua/commons/event/ServiceEventScope.java`
#### Snippet
```java
        Stack<ServiceEvent> eventStack = eventContextThdLocal.get();
        if (eventStack == null) {
            eventStack = new Stack<>();
            eventContextThdLocal.set(eventStack);
        }
```

### ObsoleteCollection
Obsolete collection type `Stack` used
in `commons/src/main/java/org/eclipse/kapua/commons/event/ServiceEventScope.java`
#### Snippet
```java
     */
    public static void set(ServiceEvent event) {
        Stack<ServiceEvent> eventStack = new Stack<>();
        eventStack.push(event);
        eventContextThdLocal.set(eventStack);
```

### ObsoleteCollection
Obsolete collection type `Stack<>` used
in `commons/src/main/java/org/eclipse/kapua/commons/event/ServiceEventScope.java`
#### Snippet
```java
     */
    public static void set(ServiceEvent event) {
        Stack<ServiceEvent> eventStack = new Stack<>();
        eventStack.push(event);
        eventContextThdLocal.set(eventStack);
```

### ObsoleteCollection
Obsolete collection type `Stack` used
in `commons/src/main/java/org/eclipse/kapua/commons/event/ServiceEventScope.java`
#### Snippet
```java
     */
    public static ServiceEvent get() {
        Stack<ServiceEvent> tmp = eventContextThdLocal.get();
        if (tmp != null && !tmp.empty()) {
            return tmp.peek();
```

### ObsoleteCollection
Obsolete collection type `Stack` used
in `commons/src/main/java/org/eclipse/kapua/commons/event/ServiceEventScope.java`
#### Snippet
```java
     */
    public static void end() {
        Stack<ServiceEvent> eventStack = eventContextThdLocal.get();
        if (eventStack == null || eventStack.empty()) {
            throw KapuaRuntimeException.internalError("Event stack shouldn't be 'null'");
```

### ObsoleteCollection
Obsolete collection type `Hashtable` used
in `commons/src/main/java/org/eclipse/kapua/commons/event/jms/JMSServiceEventBus.java`
#### Snippet
```java
            String eventbusPassword = SystemSetting.getInstance().getString(SystemSettingKey.EVENT_BUS_PASSWORD);

            Hashtable<String, String> environment = new Hashtable<>();
            environment.put("connectionfactory.eventBusUrl", eventbusUrl);
            environment.put("transport.useEpoll", TRANSPORT_USE_EPOLL);
```

### ObsoleteCollection
Obsolete collection type `Hashtable<>` used
in `commons/src/main/java/org/eclipse/kapua/commons/event/jms/JMSServiceEventBus.java`
#### Snippet
```java
            String eventbusPassword = SystemSetting.getInstance().getString(SystemSettingKey.EVENT_BUS_PASSWORD);

            Hashtable<String, String> environment = new Hashtable<>();
            environment.put("connectionfactory.eventBusUrl", eventbusUrl);
            environment.put("transport.useEpoll", TRANSPORT_USE_EPOLL);
```

## RuleId[id=RedundantArrayCreation]
### RedundantArrayCreation
Redundant array creation for calling varargs method
in `service/datastore/test-steps/src/main/java/org/eclipse/kapua/service/datastore/steps/DatastoreSteps.java`
#### Snippet
```java
            Method getMethod = getMethod(objetcClass, getterFieldName, "get");
            if (getMethod != null) {
                return clazz.cast(getMethod.invoke(object, new Object[0]));
            }
            getMethod = getMethod(objetcClass, getterFieldName, "is");
```

### RedundantArrayCreation
Redundant array creation for calling varargs method
in `service/datastore/test-steps/src/main/java/org/eclipse/kapua/service/datastore/steps/DatastoreSteps.java`
#### Snippet
```java
            getMethod = getMethod(objetcClass, getterFieldName, "is");
            if (getMethod != null) {
                return clazz.cast(getMethod.invoke(object, new Object[0]));
            }
            // else try by field access
```

### RedundantArrayCreation
Redundant array creation for calling varargs method
in `service/datastore/test-steps/src/main/java/org/eclipse/kapua/service/datastore/steps/DatastoreSteps.java`
#### Snippet
```java
        do {
            try {
                objMethod = objetcClass.getMethod(fieldName, new Class[0]);
            } catch (NoSuchMethodException e) {
                objetcClass = objetcClass.getSuperclass();
```

## RuleId[id=DuplicateBranchesInSwitch]
### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `qa/common/src/main/java/org/eclipse/kapua/qa/common/cucumber/CucConnection.java`
#### Snippet
```java
        switch (userCouplingMode.toUpperCase().trim()) {
        case "INHERITED":
            mode = ConnectionUserCouplingMode.INHERITED;
            break;
        case "LOOSE":
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `service/datastore/internal/src/main/java/org/eclipse/kapua/service/datastore/internal/model/query/MessageQueryImpl.java`
#### Snippet
```java
                break;
            case SOURCE_FULL:
                excludeSource = new String[]{""};
        }
        return excludeSource;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `rest-api/core/src/main/java/org/eclipse/kapua/app/api/core/model/data/JsonMessageQuery.java`
#### Snippet
```java
                break;
            case SOURCE_FULL:
                excludeSource = new String[]{""};
        }
        return excludeSource;
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `service/security/shiro/src/main/java/org/eclipse/kapua/service/authentication/credential/shiro/CredentialServiceImpl.java`
#### Snippet
```java
            switch (credentialCreator.getCredentialType()) {
                case API_KEY:
                    credential.setCredentialKey(fullKey);
                    break;
                case PASSWORD:
```

## RuleId[id=DuplicateExpressions]
### DuplicateExpressions
Multiple occurrences of `attributeValue.toString().replace(LIKE, ESCAPE + LIKE).replace(ANY, ESCAPE + ANY)`
in `commons/src/main/java/org/eclipse/kapua/commons/service/internal/ServiceDAO.java`
#### Snippet
```java
            switch (attrPred.getOperator()) {
                case LIKE:
                    strAttrValue = attributeValue.toString().replace(LIKE, ESCAPE + LIKE).replace(ANY, ESCAPE + ANY);
                    ParameterExpression<String> pl = cb.parameter(String.class);
                    binds.put(pl, LIKE + strAttrValue + LIKE);
```

### DuplicateExpressions
Multiple occurrences of `attributeValue.toString().replace(LIKE, ESCAPE + LIKE).replace(ANY, ESCAPE + ANY).toLowerCase()`
in `commons/src/main/java/org/eclipse/kapua/commons/service/internal/ServiceDAO.java`
#### Snippet
```java

                case LIKE_IGNORE_CASE:
                    strAttrValue = attributeValue.toString().replace(LIKE, ESCAPE + LIKE).replace(ANY, ESCAPE + ANY).toLowerCase();
                    ParameterExpression<String> plci = cb.parameter(String.class);
                    binds.put(plci, LIKE + strAttrValue + LIKE);
```

### DuplicateExpressions
Multiple occurrences of `attributeValue.toString().replace(LIKE, ESCAPE + LIKE).replace(ANY, ESCAPE + ANY)`
in `commons/src/main/java/org/eclipse/kapua/commons/service/internal/ServiceDAO.java`
#### Snippet
```java

                case LIKE_IGNORE_CASE:
                    strAttrValue = attributeValue.toString().replace(LIKE, ESCAPE + LIKE).replace(ANY, ESCAPE + ANY).toLowerCase();
                    ParameterExpression<String> plci = cb.parameter(String.class);
                    binds.put(plci, LIKE + strAttrValue + LIKE);
```

### DuplicateExpressions
Multiple occurrences of `attributeValue.toString().replace(LIKE, ESCAPE + LIKE).replace(ANY, ESCAPE + ANY)`
in `commons/src/main/java/org/eclipse/kapua/commons/service/internal/ServiceDAO.java`
#### Snippet
```java

                case STARTS_WITH:
                    strAttrValue = attributeValue.toString().replace(LIKE, ESCAPE + LIKE).replace(ANY, ESCAPE + ANY);
                    ParameterExpression<String> psw = cb.parameter(String.class);
                    binds.put(psw, strAttrValue + LIKE);
```

### DuplicateExpressions
Multiple occurrences of `attributeValue.toString().replace(LIKE, ESCAPE + LIKE).replace(ANY, ESCAPE + ANY).toLowerCase()`
in `commons/src/main/java/org/eclipse/kapua/commons/service/internal/ServiceDAO.java`
#### Snippet
```java

                case STARTS_WITH_IGNORE_CASE:
                    strAttrValue = attributeValue.toString().replace(LIKE, ESCAPE + LIKE).replace(ANY, ESCAPE + ANY).toLowerCase();
                    ParameterExpression<String> pswci = cb.parameter(String.class);
                    binds.put(pswci, strAttrValue + LIKE);
```

### DuplicateExpressions
Multiple occurrences of `attributeValue.toString().replace(LIKE, ESCAPE + LIKE).replace(ANY, ESCAPE + ANY)`
in `commons/src/main/java/org/eclipse/kapua/commons/service/internal/ServiceDAO.java`
#### Snippet
```java

                case STARTS_WITH_IGNORE_CASE:
                    strAttrValue = attributeValue.toString().replace(LIKE, ESCAPE + LIKE).replace(ANY, ESCAPE + ANY).toLowerCase();
                    ParameterExpression<String> pswci = cb.parameter(String.class);
                    binds.put(pswci, strAttrValue + LIKE);
```

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder builder` can be replaced with 'String'
in `consumer/commons/src/main/java/org/eclipse/kapua/consumer/commons/message/system/DefaultSystemMessageCreator.java`
#### Snippet
```java
    @Override
    public String createMessage(SystemMessageType systemMessageType, Map<Fields, String> parameters) {
        StringBuilder builder = new StringBuilder();
        builder.append(EVENT_KEY).append(PAIR_SEPARATOR).append(systemMessageType.name());
        builder.append(FIELD_SEPARATOR).append(DEVICE_ID_KEY).append(PAIR_SEPARATOR).append(parameters.get(Fields.clientId));
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `service/security/shiro/src/main/java/org/eclipse/kapua/service/authorization/permission/shiro/PermissionImpl.java`
#### Snippet
```java
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(domain != null ? domain : Permission.WILDCARD)
```

### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `job-engine/jbatch/src/main/java/org/eclipse/kapua/job/engine/jbatch/driver/utils/JbatchUtil.java`
#### Snippet
```java
        int checkInterval = JOB_ENGINE_SETTING.getInt(JobEngineSettingKeys.JOB_ENGINE_STOP_WAIT_CHECK_TIME_INTERVAL);

        String timerName = new StringBuilder().append(JbatchDriver.class.getSimpleName())
                .append("-")
                .append(WaitForJobExecutionStopTask.class.getSimpleName())
```

### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `job-engine/jbatch/src/main/java/org/eclipse/kapua/job/engine/jbatch/listener/KapuaJobListener.java`
#### Snippet
```java
    private void checkQueuedJobExecutions(KapuaId scopeId, KapuaId jobId, KapuaId jobExecutionId) {

        String timerName = new StringBuilder()
                .append(KapuaJobListener.class.getSimpleName())
                .append("-DelayedCheckTimer-")
```

## RuleId[id=UnnecessaryReturn]
### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `qa/integration-steps/src/main/java/org/eclipse/kapua/qa/integration/steps/DockerSteps.java`
#### Snippet
```java
                                containerMap.remove(name);
                                logger.info("Container {} removed. (Container id: {})", name, container.id());
                                return;
                            } catch (DockerException | InterruptedException e) {
                                //test fails since the environment is not cleaned up
```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `client/gateway/provider/paho/src/main/java/org/eclipse/kapua/client/gateway/mqtt/paho/PahoChannel.java`
#### Snippet
```java
            // consider this temporary and recoverable
            future.completeExceptionally(new TransmissionException(error));
            return;
        }
    }
```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `service/user/test-steps/src/main/java/org/eclipse/kapua/service/user/steps/UserServiceSteps.java`
#### Snippet
```java
            return null;
        });
        return;
    }

```

## RuleId[id=ConstantMathCall]
### ConstantMathCall
Constant call to `toRadians()` can be simplified
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/generator/basic/StraightPositionGeneratorFactory.java`
#### Snippet
```java
        final double latitude = 0.0; // equator
        final double longitude = LONGITUDE_FUNCTION.applyAsDouble(timestamp);
        final double heading = Math.toRadians(90.0D); // heading east
        final double speed = SPEED_FUNCTION.applyAsDouble(timestamp);

```

## RuleId[id=ManualMinMaxCalculation]
### ManualMinMaxCalculation
Can be replaced with 'Math.min()' call
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/util/Hex.java`
#### Snippet
```java
     */
    public static String toHex(final byte[] payload, final int maxLength) {
        return BaseEncoding.base16().encode(payload, 0, payload.length > maxLength ? maxLength : payload.length)
                + (payload.length > maxLength ? "..." : "");
    }
```

## RuleId[id=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `CachingProtocolDescriptorProvider` has no concrete subclass
in `broker/client/src/main/java/org/eclipse/kapua/broker/client/protocol/CachingProtocolDescriptorProvider.java`
#### Snippet
```java
import java.util.concurrent.ConcurrentHashMap;

public abstract class CachingProtocolDescriptorProvider implements ProtocolDescriptorProvider {

    private final Map<String, Optional<ProtocolDescriptor>> cache = new ConcurrentHashMap<>();
```

### AbstractClassNeverImplemented
Abstract class `AbstractGenericJobStepDefinition` has no concrete subclass
in `job-engine/commons/src/main/java/org/eclipse/kapua/job/engine/commons/step/definition/AbstractGenericJobStepDefinition.java`
#### Snippet
```java
import java.util.List;

public abstract class AbstractGenericJobStepDefinition extends AbstractKapuaNamedEntity implements JobStepDefinition {

    private static final long serialVersionUID = 474195961081702478L;
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends E`
in `service/commons/storable/internal/src/main/java/org/eclipse/kapua/service/storable/model/AbstractStorableListResult.java`
#### Snippet
```java
     * @since 1.3.0
     */
    public AbstractStorableListResult(List<E> storables, Long totalCount) {
        this();

```

### BoundedWildcard
Can generalize to `? extends StorableId`
in `service/commons/storable/internal/src/main/java/org/eclipse/kapua/service/storable/model/query/predicate/IdsPredicateImpl.java`
#### Snippet
```java

    @Override
    public IdsPredicate addIds(List<StorableId> ids) {
        getIds().addAll(ids);

```

### BoundedWildcard
Can generalize to `? super TransportEvents`
in `client/gateway/api/src/main/java/org/eclipse/kapua/client/gateway/Transport.java`
#### Snippet
```java
     *
     */
    public default ListenerHandle events(final Consumer<TransportEvents> events) {
        class TransportEventsImpl implements TransportEvents {

```

### BoundedWildcard
Can generalize to `? super Throwable`
in `client/gateway/api/src/main/java/org/eclipse/kapua/client/gateway/util/Errors.java`
#### Snippet
```java
    }

    public static ErrorHandler<RuntimeException> handle(final BiConsumer<Throwable, Optional<Payload>> handler) {
        return new ErrorHandler<RuntimeException>() {

```

### BoundedWildcard
Can generalize to `? super Optional`
in `client/gateway/api/src/main/java/org/eclipse/kapua/client/gateway/util/Errors.java`
#### Snippet
```java
    }

    public static ErrorHandler<RuntimeException> handle(final BiConsumer<Throwable, Optional<Payload>> handler) {
        return new ErrorHandler<RuntimeException>() {

```

### BoundedWildcard
Can generalize to `? extends DeviceManagementOperationProperty`
in `service/device/management/registry/internal/src/main/java/org/eclipse/kapua/service/device/management/registry/operation/internal/DeviceManagementOperationImpl.java`
#### Snippet
```java

    @Override
    public void setInputProperties(List<DeviceManagementOperationProperty> inputProperties) {
        this.inputProperties = new ArrayList<>();
        if (inputProperties != null) {
```

### BoundedWildcard
Can generalize to `? super String`
in `service/security/registration/simple/src/main/java/org/eclipse/kapua/security/registration/simple/SimpleRegistrationProcessor.java`
#### Snippet
```java
    }

    protected static void setChildEntityLimits(Map<String, Object> values, int limit) {
        Objects.requireNonNull(values);

```

### BoundedWildcard
Can generalize to `? super SimpleSettingKeys`
in `service/security/registration/simple/src/main/java/org/eclipse/kapua/security/registration/simple/SimpleRegistrationProcessor.java`
#### Snippet
```java
        }

        private static SimpleRegistrationProcessor.Settings applySimpleSettings(KapuaId rootAccount, AbstractKapuaSetting<SimpleSettingKeys> kapuaSettings) {
            Settings settings = new SimpleRegistrationProcessor.Settings(rootAccount);
            settings.setMaximumNumberOfUsers(kapuaSettings.getInt(SimpleSettingKeys.SIMPLE_MAX_NUMBER_OF_CHILD_USERS, 2));
```

### BoundedWildcard
Can generalize to `? extends X`
in `qa/common/src/main/java/org/eclipse/kapua/qa/common/Suppressed.java`
#### Snippet
```java
    private LinkedList<Throwable> errors;

    public Suppressed(final Class<X> clazz) {
        this.clazz = clazz;
        this.supplier = cause -> {
```

### BoundedWildcard
Can generalize to `? extends X`
in `qa/common/src/main/java/org/eclipse/kapua/qa/common/Suppressed.java`
#### Snippet
```java
    }

    public Suppressed(final Class<X> clazz, final ExceptionSupplier<X> supplier) {
        this.clazz = clazz;
        this.supplier = supplier;
```

### BoundedWildcard
Can generalize to `? extends X`
in `qa/common/src/main/java/org/eclipse/kapua/qa/common/Suppressed.java`
#### Snippet
```java
    }

    public Suppressed(final Class<X> clazz, final ExceptionSupplier<X> supplier) {
        this.clazz = clazz;
        this.supplier = supplier;
```

### BoundedWildcard
Can generalize to `? super User`
in `qa/common/src/main/java/org/eclipse/kapua/qa/common/With.java`
#### Snippet
```java
    }

    public static void withUserAccount(final String accountName, final ThrowingConsumer<User> consumer) throws Exception {
        final UserService userService = KapuaLocator.getInstance().getService(UserService.class);
        final User account = userService.findByName(accountName);
```

### BoundedWildcard
Can generalize to `? super Device`
in `qa/common/src/main/java/org/eclipse/kapua/qa/common/With.java`
#### Snippet
```java
    }

    public static void withDevice(final User account, final String clientId, final ThrowingConsumer<Device> consumer) throws Exception {
        DeviceRegistryService service = KapuaLocator.getInstance().getService(DeviceRegistryService.class);
        Device device = service.findByClientId(account.getId(), clientId);
```

### BoundedWildcard
Can generalize to `? super String`
in `qa/common/src/main/java/org/eclipse/kapua/qa/common/cucumber/CucConfig.java`
#### Snippet
```java
     *            map to add parameter to
     */
    public void addConfigToMap(Map<String, Object> valueMap) {

        switch (type) {
```

### BoundedWildcard
Can generalize to `? super T`
in `client/gateway/provider/fuse/src/main/java/org/eclipse/kapua/client/gateway/mqtt/fuse/internal/Callbacks.java`
#### Snippet
```java
    }

    public static <T> Callback<T> asCallback(final CompletableFuture<T> future) {
        return new Callback<T>() {

```

### BoundedWildcard
Can generalize to `? extends ElasticsearchNode`
in `service/commons/elasticsearch/client-api/src/main/java/org/eclipse/kapua/service/elasticsearch/client/utils/InetAddressParser.java`
#### Snippet
```java
    }

    public static List<InetSocketAddress> parseAddresses(List<ElasticsearchNode> elasticsearchNodes) {
        return elasticsearchNodes
                .stream()
```

### BoundedWildcard
Can generalize to `? extends T`
in `client/gateway/provider/mqtt/src/main/java/org/eclipse/kapua/client/gateway/mqtt/AbstractMqttChannel.java`
#### Snippet
```java

    @Override
    public <T> Optional<T> adapt(Class<T> clazz) {

        if (clazz.equals(MqttModuleContext.class)) {
```

### BoundedWildcard
Can generalize to `? extends RestClient`
in `service/commons/elasticsearch/client-rest/src/main/java/org/eclipse/kapua/service/elasticsearch/client/rest/RestElasticsearchClientProvider.java`
#### Snippet
```java
     * @since 1.0.0
     */
    private void reconnectClientTask(Callable<RestClient> initClientMethod) throws Exception {
        if (internalElasticsearchRestClient == null) {
            synchronized (RestElasticsearchClientProvider.class) {
```

### BoundedWildcard
Can generalize to `? extends T`
in `service/commons/elasticsearch/client-rest/src/main/java/org/eclipse/kapua/service/elasticsearch/client/rest/RestElasticsearchClient.java`
#### Snippet
```java

    @Override
    public <T> ResultList<T> query(TypeDescriptor typeDescriptor, Object query, Class<T> clazz) throws ClientException {
        JsonNode queryJsonNode = getModelConverter().convertQuery(query);
        LOG.debug(QUERY_CONVERTED_QUERY, queryJsonNode);
```

### BoundedWildcard
Can generalize to `? extends Response`
in `service/commons/elasticsearch/client-rest/src/main/java/org/eclipse/kapua/service/elasticsearch/client/rest/RestElasticsearchClient.java`
#### Snippet
```java
    }

    private Response restCallTimeoutHandler(Callable<Response> restAction, String index, String operationName) throws ClientException {
        int retryCount = 0;
        try {
```

### BoundedWildcard
Can generalize to `? extends Account`
in `service/account/internal/src/main/java/org/eclipse/kapua/service/account/internal/AccountImpl.java`
#### Snippet
```java
    }

    private void setChildAccounts(List<Account> childAccounts) {
        List<AccountImpl> accounts = new ArrayList<>();

```

### BoundedWildcard
Can generalize to `? extends NameValuePair`
in `plug-ins/sso/openid-connect/provider/src/main/java/org/eclipse/kapua/plugin/sso/openid/provider/AbstractOpenIDService.java`
#### Snippet
```java
    }

    private void logRequest(URL url, HttpURLConnection urlConnection, List<NameValuePair> parameters, JsonObject result) throws IOException {
        //
        // Log operation details
```

### BoundedWildcard
Can generalize to `? super B`
in `client/gateway/profile/kura/src/main/java/org/eclipse/kapua/client/gateway/profile/kura/KuraMqttProfile.java`
#### Snippet
```java
    }

    public KuraMqttProfile<B> customizer(final Consumer<B> customizer) {
        this.customizer = customizer;
        return this;
```

### BoundedWildcard
Can generalize to `? extends B`
in `client/gateway/profile/kura/src/main/java/org/eclipse/kapua/client/gateway/profile/kura/KuraMqttProfile.java`
#### Snippet
```java
    private Consumer<B> customizer;

    private KuraMqttProfile(final Supplier<B> builderSupplier) {
        this.builderSupplier = builderSupplier;
    }
```

### BoundedWildcard
Can generalize to `? extends Provider`
in `client/gateway/profile/kura/src/main/java/org/eclipse/kapua/client/gateway/kura/KuraBirthCertificateModule.java`
#### Snippet
```java
        }

        public Builder providers(final Collection<Provider> providers) {
            Objects.requireNonNull(providers);
            this.providers.addAll(providers);
```

### BoundedWildcard
Can generalize to `? super String`
in `client/gateway/profile/kura/src/main/java/org/eclipse/kapua/client/gateway/kura/KuraBirthCertificateModule.java`
#### Snippet
```java

            @Override
            public void provideData(final Map<String, String> values) {
                values.put("available_processors", Integer.toString(Runtime.getRuntime().availableProcessors()));
                values.put("total_memory", Long.toString(Runtime.getRuntime().totalMemory()));
```

### BoundedWildcard
Can generalize to `? super String`
in `client/gateway/profile/kura/src/main/java/org/eclipse/kapua/client/gateway/kura/KuraBirthCertificateModule.java`
#### Snippet
```java

            @Override
            public void provideData(final Map<String, String> values) {
                values.put("available_processors", Integer.toString(Runtime.getRuntime().availableProcessors()));
                values.put("total_memory", Long.toString(Runtime.getRuntime().totalMemory()));
```

### BoundedWildcard
Can generalize to `? super String`
in `client/gateway/profile/kura/src/main/java/org/eclipse/kapua/client/gateway/kura/KuraBirthCertificateModule.java`
#### Snippet
```java

            @Override
            public void provideData(final Map<String, String> values) {
                values.put("jvm_name", System.getProperty("java.vm.name"));
                values.put("jvm_version", System.getProperty("java.version"));
```

### BoundedWildcard
Can generalize to `? super String`
in `client/gateway/profile/kura/src/main/java/org/eclipse/kapua/client/gateway/kura/KuraBirthCertificateModule.java`
#### Snippet
```java

            @Override
            public void provideData(final Map<String, String> values) {
                values.put("jvm_name", System.getProperty("java.vm.name"));
                values.put("jvm_version", System.getProperty("java.version"));
```

### BoundedWildcard
Can generalize to `? extends TO_P`
in `translator/kapua/kura/src/main/java/org/eclipse/kapua/translator/kura/kapua/AbstractSimpleTranslatorResponseKuraKapua.java`
#### Snippet
```java
     * @since 1.0.0
     */
    public AbstractSimpleTranslatorResponseKuraKapua(Class<TO_M> messageClazz, Class<TO_P> payloadClazz) {
        this.messageClazz = messageClazz;
        this.payloadClazz = payloadClazz;
```

### BoundedWildcard
Can generalize to `? super String`
in `extras/es-migrator/src/main/java/org/eclipse/kapua/extras/esmigrator/Es7Migration.java`
#### Snippet
```java
    private static final String METRIC_SUFFIX = "-metric";

    public Es7Migration(EsClientWrapper client, EsClusterDescriptor esClusterDescriptor, Map<String, String> migrationReport) {
        this.client = client;
        this.esClusterDescriptor = esClusterDescriptor;
```

### BoundedWildcard
Can generalize to `? super String`
in `extras/es-migrator/src/main/java/org/eclipse/kapua/extras/esmigrator/Es7Migration.java`
#### Snippet
```java
    private static final String METRIC_SUFFIX = "-metric";

    public Es7Migration(EsClientWrapper client, EsClusterDescriptor esClusterDescriptor, Map<String, String> migrationReport) {
        this.client = client;
        this.esClusterDescriptor = esClusterDescriptor;
```

### BoundedWildcard
Can generalize to `? extends KeyUsageSetting`
in `service/security/certificate/internal/src/main/java/org/eclipse/kapua/service/certificate/info/internal/CertificateInfoImpl.java`
#### Snippet
```java

    @Override
    public void setKeyUsageSettings(Set<KeyUsageSetting> keyUsageSettings) {
        this.keyUsageSettings = new HashSet<>();

```

### BoundedWildcard
Can generalize to `? extends CertificateUsage`
in `service/security/certificate/internal/src/main/java/org/eclipse/kapua/service/certificate/info/internal/CertificateInfoImpl.java`
#### Snippet
```java

    @Override
    public void setCertificateUsages(Set<CertificateUsage> certificateUsages) {
        this.certificateUsages = new HashSet<>();

```

### BoundedWildcard
Can generalize to `? super String`
in `qa/integration-steps/src/main/java/org/eclipse/kapua/qa/integration/steps/DockerSteps.java`
#### Snippet
```java
     * @param hostPort     port on host
     */
    private void addHostPort(String host, Map<String, List<PortBinding>> portBindings,
                             int port, int hostPort) {

```

### BoundedWildcard
Can generalize to `? super List`
in `qa/integration-steps/src/main/java/org/eclipse/kapua/qa/integration/steps/DockerSteps.java`
#### Snippet
```java
     * @param hostPort     port on host
     */
    private void addHostPort(String host, Map<String, List<PortBinding>> portBindings,
                             int port, int hostPort) {

```

### BoundedWildcard
Can generalize to `? extends CucConfig`
in `service/account/test-steps/src/main/java/org/eclipse/kapua/service/account/steps/AccountServiceSteps.java`
#### Snippet
```java

    @When("I configure account service")
    public void setAccountServiceConfig(List<CucConfig> cucConfigs) throws Exception {
        Map<String, Object> valueMap = new HashMap<>();
        KapuaId accId;
```

### BoundedWildcard
Can generalize to `? extends CucAccount`
in `service/account/test-steps/src/main/java/org/eclipse/kapua/service/account/steps/AccountServiceSteps.java`
#### Snippet
```java

    @Given("Account")
    public void givenAccount(List<CucAccount> accountList) throws Exception {
        CucAccount cucAccount = accountList.get(0);
        // If accountId is not set in account list, use last created Account for scope id
```

### BoundedWildcard
Can generalize to `? extends TriggerProperty`
in `service/scheduler/quartz/src/main/java/org/eclipse/kapua/service/scheduler/trigger/quartz/TriggerImpl.java`
#### Snippet
```java

    @Override
    public void setTriggerProperties(List<TriggerProperty> triggerProperties) {
        this.triggerProperties = new ArrayList<>();

```

### BoundedWildcard
Can generalize to `? extends TriggerProperty`
in `service/scheduler/quartz/src/main/java/org/eclipse/kapua/service/scheduler/trigger/definition/quartz/TriggerDefinitionImpl.java`
#### Snippet
```java

    @Override
    public void setTriggerProperties(List<TriggerProperty> triggerProperties) {
        this.triggerProperties = new ArrayList<>();

```

### BoundedWildcard
Can generalize to `? extends KapuaBirthMessage`
in `consumer/lifecycle/src/main/java/org/eclipse/kapua/consumer/lifecycle/listener/DeviceMessageListener.java`
#### Snippet
```java
     * @since 1.0.0
     */
    public void processBirthMessage(CamelKapuaMessage<KapuaBirthMessage> birthMessage) {
        try {
            deviceLifeCycleService.birth(birthMessage.getConnectionId(), birthMessage.getMessage());
```

### BoundedWildcard
Can generalize to `? extends KapuaMissingMessage`
in `consumer/lifecycle/src/main/java/org/eclipse/kapua/consumer/lifecycle/listener/DeviceMessageListener.java`
#### Snippet
```java
     * @since 1.0.0
     */
    public void processMissingMessage(CamelKapuaMessage<KapuaMissingMessage> missingMessage) {
        try {
            deviceLifeCycleService.missing(missingMessage.getConnectionId(), missingMessage.getMessage());
```

### BoundedWildcard
Can generalize to `? extends KapuaAppsMessage`
in `consumer/lifecycle/src/main/java/org/eclipse/kapua/consumer/lifecycle/listener/DeviceMessageListener.java`
#### Snippet
```java
     * @since 1.0.0
     */
    public void processAppsMessage(CamelKapuaMessage<KapuaAppsMessage> appsMessage) {
        try {
            deviceLifeCycleService.applications(appsMessage.getConnectionId(), appsMessage.getMessage());
```

### BoundedWildcard
Can generalize to `? extends KapuaDisconnectMessage`
in `consumer/lifecycle/src/main/java/org/eclipse/kapua/consumer/lifecycle/listener/DeviceMessageListener.java`
#### Snippet
```java
     * @since 1.0.0
     */
    public void processDisconnectMessage(CamelKapuaMessage<KapuaDisconnectMessage> disconnectMessage) {
        try {
            deviceLifeCycleService.death(disconnectMessage.getConnectionId(), disconnectMessage.getMessage());
```

### BoundedWildcard
Can generalize to `? extends KapuaDataMessage`
in `service/datastore/test-steps/src/main/java/org/eclipse/kapua/service/datastore/steps/DatastoreSteps.java`
#### Snippet
```java
    }

    private List<StorableId> insertMessagesInStore(List<KapuaDataMessage> messages) throws KapuaException {

        StorableId tmpId = null;
```

### BoundedWildcard
Can generalize to `? extends T`
in `service/datastore/test-steps/src/main/java/org/eclipse/kapua/service/datastore/steps/DatastoreSteps.java`
#### Snippet
```java
    }

    private static <T extends Comparable<T>> Function<Object, T> fieldFunction(SortField field, Class<T> clazz) {

        return item -> getValue(item, field.getField(), clazz);
```

### BoundedWildcard
Can generalize to `? extends KapuaDataMessage`
in `service/datastore/test-steps/src/main/java/org/eclipse/kapua/service/datastore/steps/DatastoreSteps.java`
#### Snippet
```java
    // Check whether the supplied metric info list contains all the client ids and metric names that were
    // defined by the messages
    private void checkMetricInfoAgainstPreparedMessages(MetricInfoListResult metInfo, List<KapuaDataMessage> msgLst) {

        Set<String> msgMetrics = new HashSet<>();
```

### BoundedWildcard
Can generalize to `? extends CucMetric`
in `service/datastore/test-steps/src/main/java/org/eclipse/kapua/service/datastore/steps/DatastoreSteps.java`
#### Snippet
```java

    @And("I set the following metrics to the message {int} from the list {string}")
    public void appendMetricsToSelectedMessage(int idx, String lstKey, List<CucMetric> metLst) throws Exception {
        List<KapuaDataMessage> tmpMsgLst = (List<KapuaDataMessage>) stepData.get(lstKey);
        KapuaDataMessage tmpMsg = tmpMsgLst.get(idx);
```

### BoundedWildcard
Can generalize to `? extends MetricEntry`
in `service/datastore/test-steps/src/main/java/org/eclipse/kapua/service/datastore/steps/DatastoreSteps.java`
#### Snippet
```java
    // *******************

    private static Map<String, Object> toData(List<MetricEntry> metrics) {
        final Map<String, Object> data = new HashMap<>();

```

### BoundedWildcard
Can generalize to `? extends CucMessageRange`
in `service/datastore/test-steps/src/main/java/org/eclipse/kapua/service/datastore/steps/DatastoreSteps.java`
#### Snippet
```java

    @Given("I prepare a number of messages in the specified ranges and remember the list as {string}")
    public void prepareAListOfMessagesInTheSpecifiedRanges(String listKey, List<CucMessageRange> messages) throws Exception {
        List<KapuaDataMessage> tmpList = new ArrayList<>();
        KapuaDataMessage tmpMsg;
```

### BoundedWildcard
Can generalize to `? extends OrderConstraint`
in `service/datastore/test-steps/src/main/java/org/eclipse/kapua/service/datastore/steps/DatastoreSteps.java`
#### Snippet
```java
     * @param sortFieldList
     */
    private static void checkListOrder(StorableListResult<?> result, List<OrderConstraint<?>> sortFieldList) {

        Object previousItem = null;
```

### BoundedWildcard
Can generalize to `? extends CucTopic`
in `service/datastore/test-steps/src/main/java/org/eclipse/kapua/service/datastore/steps/DatastoreSteps.java`
#### Snippet
```java

    @Given("I prepare {int} randomly ordered messages and remember the list as {string}")
    public void prepareUnorderedRandomMessagesWithTopics(int number, String lstKey, List<CucTopic> topics) throws Exception {
        Account tmpAccount = (Account) stepData.get(LAST_ACCOUNT);
        KapuaDataMessage tmpMsg;
```

### BoundedWildcard
Can generalize to `? extends T`
in `service/datastore/test-steps/src/main/java/org/eclipse/kapua/service/datastore/steps/DatastoreSteps.java`
#### Snippet
```java
        private final Function<Object, T> valueFunction;

        public OrderConstraint(final SortField field, final Function<Object, T> valueFunction) {
            this.field = field;
            this.valueFunction = valueFunction;
```

### BoundedWildcard
Can generalize to `? extends KapuaDataMessage`
in `service/datastore/test-steps/src/main/java/org/eclipse/kapua/service/datastore/steps/DatastoreSteps.java`
#### Snippet
```java
    // Check whether the supplied metric info list contains all the client ids and metric names that were
    // defined by the messages
    private void checkClientInfoAgainstPreparedMessages(ClientInfoListResult cliInfo, List<KapuaDataMessage> msgLst) {

        Set<String> msgClients = new HashSet<>();
```

### BoundedWildcard
Can generalize to `? extends OrderConstraint`
in `service/datastore/test-steps/src/main/java/org/eclipse/kapua/service/datastore/steps/DatastoreSteps.java`
#### Snippet
```java

    // create a basic metric query with default parameters. Also set the requested ordering.
    private MetricInfoQuery getBaseMetricQuery(KapuaId scopeId, int limit, List<OrderConstraint<?>> order) {

        MetricInfoQuery tmpQuery = createBaseMetricInfoQuery(scopeId, limit);
```

### BoundedWildcard
Can generalize to `? extends KapuaDataMessage`
in `service/datastore/test-steps/src/main/java/org/eclipse/kapua/service/datastore/steps/DatastoreSteps.java`
#### Snippet
```java
    // Check whether the supplied channel info list contains all the client ids and topic names that were
    // defined by the messages
    private void checkChannelInfoAgainstPreparedMessages(ChannelInfoListResult chnInfo, List<KapuaDataMessage> msgLst) {

        Set<String> msgTopics = new HashSet<>();
```

### BoundedWildcard
Can generalize to `? extends CucMetric`
in `service/datastore/test-steps/src/main/java/org/eclipse/kapua/service/datastore/steps/DatastoreSteps.java`
#### Snippet
```java

    @And("I set the following metrics with messages from the list {string}")
    public void iSetTheFollowingMetricsFromTheList(String lstKey, List<CucMetric> metLst) throws Exception {
        List<KapuaDataMessage> tmpMsgLst = (List<KapuaDataMessage>) stepData.get(lstKey);

```

### BoundedWildcard
Can generalize to `? extends CucTopic`
in `service/datastore/test-steps/src/main/java/org/eclipse/kapua/service/datastore/steps/DatastoreSteps.java`
#### Snippet
```java

    @Then("The channel list {string} contains the following topics")
    public void checkThattheChannelInfoContainsTheSpecifiedTopics(String lstKey, List<CucTopic> topics) {
        ChannelInfoListResult tmpList = (ChannelInfoListResult) stepData.get(lstKey);
        Set<String> infoTopics = new HashSet<>();
```

### BoundedWildcard
Can generalize to `? extends OrderConstraint`
in `service/datastore/test-steps/src/main/java/org/eclipse/kapua/service/datastore/steps/DatastoreSteps.java`
#### Snippet
```java

    // create a basic message query with default parameters. Also set the requested ordering.
    private MessageQuery getBaseMessageQuery(KapuaId scopeId, int limit, List<OrderConstraint<?>> order) {

        return createBaseMessageQuery(scopeId, limit, order.stream().map(OrderConstraint::getField).collect(Collectors.toList()));
```

### BoundedWildcard
Can generalize to `? extends CucTopic`
in `service/datastore/test-steps/src/main/java/org/eclipse/kapua/service/datastore/steps/DatastoreSteps.java`
#### Snippet
```java

    @Given("I prepare a number of messages with the following details and remember the list as {string}")
    public void prepareAListOfMessagesWithDifferentTopics(String listKey, List<CucTopic> topics) throws Exception {
        List<KapuaDataMessage> tmpList = new ArrayList<>();
        KapuaDataMessage tmpMsg = null;
```

### BoundedWildcard
Can generalize to `? extends org.eclipse.kapua.broker.core.plugin.authentication.AuthorizationEntry`
in `broker/core/src/main/java/org/eclipse/kapua/broker/core/plugin/KapuaSecurityBrokerFilter.java`
#### Snippet
```java
    // ------------------------------------------------------------------

    protected void buildAuthorization(KapuaSecurityContext kapuaSecurityContext, List<org.eclipse.kapua.broker.core.plugin.authentication.AuthorizationEntry> authorizationEntries) {
        @SuppressWarnings("rawtypes")
        List<DestinationMapEntry> entries = new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? extends KapuaId`
in `service/device/registry/internal/src/main/java/org/eclipse/kapua/service/device/registry/internal/DeviceImpl.java`
#### Snippet
```java

    @Override
    public void setTagIds(Set<KapuaId> tagIds) {
        this.tagIds = new HashSet<>();

```

### BoundedWildcard
Can generalize to `? extends DeviceExtendedProperty`
in `service/device/registry/internal/src/main/java/org/eclipse/kapua/service/device/registry/internal/DeviceImpl.java`
#### Snippet
```java

    @Override
    public void setExtendedProperties(List<DeviceExtendedProperty> extendedProperties) {
        this.extendedProperties = new ArrayList<>();

```

### BoundedWildcard
Can generalize to `? super Message`
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/MqttAsyncTransport.java`
#### Snippet
```java

    @Override
    public void subscribe(final Topic topic, final Consumer<Message> consumer) {
        Objects.requireNonNull(consumer);

```

### BoundedWildcard
Can generalize to `? super String`
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/app/command/SimpleCommandApplication.java`
#### Snippet
```java
    private final Function<String, String> handler;

    public SimpleCommandApplication(final Function<String, String> handler) {
        Objects.requireNonNull(handler);
        this.handler = handler;
```

### BoundedWildcard
Can generalize to `? extends BundleInformation`
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/app/deploy/AbstractDeployApplication.java`
#### Snippet
```java
    }

    protected void fillBundlesDocument(final Document doc, final List<BundleInformation> bundles) {
        final Element bs = doc.createElement("bundles");
        doc.appendChild(bs);
```

### BoundedWildcard
Can generalize to `? extends DeploymentPackageInformation`
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/app/deploy/AbstractDeployApplication.java`
#### Snippet
```java
    }

    protected void fillPackagesDocument(final Document doc, final List<DeploymentPackageInformation> packages) {
        final Element ps = doc.createElement("packages");
        doc.appendChild(ps);
```

### BoundedWildcard
Can generalize to `? super Long`
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/app/deploy/AbstractDeployApplication.java`
#### Snippet
```java
    protected abstract void cancelDownload(Request request);

    public void executeOnBundle(final Request request, final Function<Long, Boolean> consumer) {
        final long bundleId = Long.parseLong(request.renderTopic(2));
        if (consumer.apply(bundleId)) {
```

### BoundedWildcard
Can generalize to `? super Document`
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/util/Documents.java`
#### Snippet
```java
    }

    public static void create(final Consumer<Document> documentBuilder, final Writer writer)
            throws ParserConfigurationException, TransformerException {
        final DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
```

### BoundedWildcard
Can generalize to `? extends AutoCloseable`
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/main/SimulatorRunner.java`
#### Snippet
```java
    }

    private static void closeAll(final List<AutoCloseable> close) throws Throwable {
        final LinkedList<Throwable> errors = new LinkedList<>();

```

### BoundedWildcard
Can generalize to `? super String`
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/birth/BirthCertificateBuilder.java`
#### Snippet
```java
    }

    protected static void fillInConnectionInformation(final Map<String, Object> metrics) {
        try {
            final Enumeration<NetworkInterface> nis = NetworkInterface.getNetworkInterfaces();
```

### BoundedWildcard
Can generalize to `? extends Set`
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/birth/BirthCertificateBuilder.java`
#### Snippet
```java

    public BirthCertificateBuilder(final GatewayConfiguration configuration, final Instant started,
            final Supplier<Set<String>> applicationIds) {
        this.configuration = configuration;
        this.started = started;
```

### BoundedWildcard
Can generalize to `? super Instant`
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/generator/GeneratorScheduler.java`
#### Snippet
```java
        private final Consumer<Instant> task;

        public Entry(final Consumer<Instant> task) {
            this.task = task;
        }
```

### BoundedWildcard
Can generalize to `? super Instant`
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/generator/Generator.java`
#### Snippet
```java
    public Payload update(Instant timestamp);

    public static Generator onlyMetrics(final Function<Instant, Map<String, Object>> metrics) {
        Objects.requireNonNull(metrics);

```

### BoundedWildcard
Can generalize to `? extends Map`
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/generator/Generator.java`
#### Snippet
```java
    public Payload update(Instant timestamp);

    public static Generator onlyMetrics(final Function<Instant, Map<String, Object>> metrics) {
        Objects.requireNonNull(metrics);

```

### BoundedWildcard
Can generalize to `? extends ResourceHandler`
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/app/annotated/AnnotatedApplication.java`
#### Snippet
```java
    private final Map<String, ResourceHandler> handlers;

    private AnnotatedApplication(final String applicationId, final Map<String, ResourceHandler> handlers) {
        super(applicationId);
        this.handlers = handlers;
```

### BoundedWildcard
Can generalize to `? super String`
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/app/annotated/AnnotatedApplication.java`
#### Snippet
```java
    }

    private static void mapMethod(final Map<String, ResourceHandler> handlers, final Object applicationInstance,
            final Method method, String verb, final String resource) throws IllegalAccessException {

```

### BoundedWildcard
Can generalize to `? super ResourceHandler`
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/app/annotated/AnnotatedApplication.java`
#### Snippet
```java
    }

    private static void mapMethod(final Map<String, ResourceHandler> handlers, final Object applicationInstance,
            final Method method, String verb, final String resource) throws IllegalAccessException {

```

### BoundedWildcard
Can generalize to `? extends GeneratorFactory`
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/generator/GeneratorFactories.java`
#### Snippet
```java
     * @return the optional result, never {@code null}
     */
    public static Optional<Generator> create(final Map<String, Object> configuration, final Iterable<GeneratorFactory> factories) {
        Objects.requireNonNull(configuration);
        Objects.requireNonNull(factories);
```

### BoundedWildcard
Can generalize to `? super MqttMessage`
in `transport/mqtt/src/main/java/org/eclipse/kapua/transport/mqtt/MqttResponseCallback.java`
#### Snippet
```java
     * @since 1.0.0
     */
    public MqttResponseCallback(@NotNull MqttTopic responseTopic, @NotNull List<MqttMessage> responses, int expectedResponses) {
        this.responseTopic = responseTopic;
        this.responses = responses;
```

### BoundedWildcard
Can generalize to `? super Exception`
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/simulation/Configuration.java`
#### Snippet
```java
        }

        private void validateGeneratorReference(final Map<String, Map<String, Object>> generators, final String location, final String generator, final List<Exception> violations) {
            if (!generators.containsKey(generator)) {
                violations.add(new IllegalStateException(String.format(" %s reference non-existing generator %s", location, generator)));
```

### BoundedWildcard
Can generalize to `? super Exception`
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/simulation/Configuration.java`
#### Snippet
```java
        }

        private void validate(final List<Exception> violations) {
            if (this.period <= 0) {
                violations.add(new IllegalArgumentException(String.format("Scheduler period must be greater than zero: ", this.period)));
```

### BoundedWildcard
Can generalize to `? extends Segment`
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/topic/Topic.java`
#### Snippet
```java
    }

    private String renderInternal(final List<Segment> segments, final Map<String, String> context) {
        return segments.stream().map(seg -> renderSegment(seg, context)).collect(Collectors.joining("/"));
    }
```

### BoundedWildcard
Can generalize to `? super String`
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/topic/Topic.java`
#### Snippet
```java

        @Override
        public String render(final Function<String, String> replaceMapper) {
            final String value = replaceMapper.apply(this.key);
            if (value == null || value.isEmpty()) {
```

### BoundedWildcard
Can generalize to `? extends F`
in `service/stream/internal/src/main/java/org/eclipse/kapua/service/stream/internal/StreamServiceImpl.java`
#### Snippet
```java
     * @since 1.0.0
     */
    protected <F extends Message<?, ?>, T extends Message<?, ?>> Translator<F, T> getTranslator(Class<F> from, Class<T> to) throws KuraDeviceCallException {
        Translator<F, T> translator;
        try {
```

### BoundedWildcard
Can generalize to `? extends T`
in `service/stream/internal/src/main/java/org/eclipse/kapua/service/stream/internal/StreamServiceImpl.java`
#### Snippet
```java
     * @since 1.0.0
     */
    protected <F extends Message<?, ?>, T extends Message<?, ?>> Translator<F, T> getTranslator(Class<F> from, Class<T> to) throws KuraDeviceCallException {
        Translator<F, T> translator;
        try {
```

### BoundedWildcard
Can generalize to `? extends Listener`
in `client/gateway/spi/src/main/java/org/eclipse/kapua/client/gateway/spi/util/TransportProxy.java`
#### Snippet
```java
    }

    private void fireEvent(final boolean state, final Set<Listener> listeners) {
        executor.execute(() -> {
            listeners.stream().forEach(l -> l.stateChange(state));
```

### BoundedWildcard
Can generalize to `? super Module`
in `client/gateway/spi/src/main/java/org/eclipse/kapua/client/gateway/spi/AbstractClient.java`
#### Snippet
```java
    }

    private void fireModuleEvent(final Consumer<Module> consumer) {
        for (final Module module : modules) {
            try {
```

### BoundedWildcard
Can generalize to `? extends T`
in `client/gateway/spi/src/main/java/org/eclipse/kapua/client/gateway/spi/util/Futures.java`
#### Snippet
```java
    }

    public static <T> CompletableFuture<T> mapFailed(final CompletionStage<T> stage, final Function<Throwable, CompletionStage<T>> function) {

        Objects.requireNonNull(stage);
```

### BoundedWildcard
Can generalize to `? super Throwable`
in `client/gateway/spi/src/main/java/org/eclipse/kapua/client/gateway/spi/util/Futures.java`
#### Snippet
```java
    }

    public static <T> CompletableFuture<T> mapFailed(final CompletionStage<T> stage, final Function<Throwable, CompletionStage<T>> function) {

        Objects.requireNonNull(stage);
```

### BoundedWildcard
Can generalize to `? extends CompletionStage`
in `client/gateway/spi/src/main/java/org/eclipse/kapua/client/gateway/spi/util/Futures.java`
#### Snippet
```java
    }

    public static <T> CompletableFuture<T> mapFailed(final CompletionStage<T> stage, final Function<Throwable, CompletionStage<T>> function) {

        Objects.requireNonNull(stage);
```

### BoundedWildcard
Can generalize to `? extends T`
in `client/gateway/spi/src/main/java/org/eclipse/kapua/client/gateway/spi/util/Futures.java`
#### Snippet
```java
    }

    public static <T, R> CompletableFuture<R> map(final CompletionStage<T> stage, final BiFunction<T, Throwable, CompletionStage<R>> function) {

        Objects.requireNonNull(stage);
```

### BoundedWildcard
Can generalize to `? super T`
in `client/gateway/spi/src/main/java/org/eclipse/kapua/client/gateway/spi/util/Futures.java`
#### Snippet
```java
    }

    public static <T, R> CompletableFuture<R> map(final CompletionStage<T> stage, final BiFunction<T, Throwable, CompletionStage<R>> function) {

        Objects.requireNonNull(stage);
```

### BoundedWildcard
Can generalize to `? super Throwable`
in `client/gateway/spi/src/main/java/org/eclipse/kapua/client/gateway/spi/util/Futures.java`
#### Snippet
```java
    }

    public static <T, R> CompletableFuture<R> map(final CompletionStage<T> stage, final BiFunction<T, Throwable, CompletionStage<R>> function) {

        Objects.requireNonNull(stage);
```

### BoundedWildcard
Can generalize to `? extends CompletionStage`
in `client/gateway/spi/src/main/java/org/eclipse/kapua/client/gateway/spi/util/Futures.java`
#### Snippet
```java
    }

    public static <T, R> CompletableFuture<R> map(final CompletionStage<T> stage, final BiFunction<T, Throwable, CompletionStage<R>> function) {

        Objects.requireNonNull(stage);
```

### BoundedWildcard
Can generalize to `? super T`
in `client/gateway/spi/src/main/java/org/eclipse/kapua/client/gateway/spi/util/Futures.java`
#### Snippet
```java
    }

    private static <T> CompletionStage<T> reportTo(final CompletionStage<T> source, final CompletableFuture<T> target) {
        return source.whenComplete((value, error) -> {
            if (error != null) {
```

### BoundedWildcard
Can generalize to `? extends EndpointUsage`
in `service/endpoint/internal/src/main/java/org/eclipse/kapua/service/endpoint/internal/EndpointInfoImpl.java`
#### Snippet
```java

    @Override
    public void setUsages(Set<EndpointUsage> usages) {
        this.usages = new HashSet<>();

```

### BoundedWildcard
Can generalize to `? extends Permission`
in `service/security/shiro/src/main/java/org/eclipse/kapua/service/authorization/permission/shiro/PermissionValidator.java`
#### Snippet
```java
    }

    public static void validatePermissions(@NotNull Set<Permission> permissions) throws KapuaException {

        if (!permissions.isEmpty()) {
```

### BoundedWildcard
Can generalize to `? extends StorablePredicate`
in `service/commons/storable/api/src/main/java/org/eclipse/kapua/service/storable/model/utils/MappingUtils.java`
#### Snippet
```java
     * @since 1.3.0
     */
    public static ArrayNode newArrayNodeFromPredicates(Collection<StorablePredicate> storablePredicates) throws MappingException {
        ArrayNode arrayNode = newArrayNode();

```

### BoundedWildcard
Can generalize to `? extends AclPermission`
in `service/device/registry/test-steps/src/main/java/org/eclipse/kapua/service/device/registry/steps/AclCreator.java`
#### Snippet
```java
     * @return AccessInfoCreator instance for creating user permissions
     */
    private AccessInfoCreator accessInfoCreatorCreator(List<AclPermission> permissionList,
                                                       User user, Account account) {

```

### BoundedWildcard
Can generalize to `? super String`
in `service/device/registry/test-steps/src/main/java/org/eclipse/kapua/service/device/registry/steps/MqttDevice.java`
#### Snippet
```java
     */
    public void mqttClientPublishString(String clientId, String payload, String topic,
                                        Map<String, Map<String, String>> clientMqttMessage,
                                        Map<String, String> listenerMqttMessage) {

```

### BoundedWildcard
Can generalize to `? super Map`
in `service/device/registry/test-steps/src/main/java/org/eclipse/kapua/service/device/registry/steps/MqttDevice.java`
#### Snippet
```java
     */
    public void mqttClientPublishString(String clientId, String payload, String topic,
                                        Map<String, Map<String, String>> clientMqttMessage,
                                        Map<String, String> listenerMqttMessage) {

```

### BoundedWildcard
Can generalize to `? super String`
in `service/device/registry/test-steps/src/main/java/org/eclipse/kapua/service/device/registry/steps/MqttDevice.java`
#### Snippet
```java
    public void mqttClientPublishString(String clientId, String payload, String topic,
                                        Map<String, Map<String, String>> clientMqttMessage,
                                        Map<String, String> listenerMqttMessage) {

        this.clientReceivedMqttMessage = clientMqttMessage;
```

### BoundedWildcard
Can generalize to `? super String`
in `service/device/registry/test-steps/src/main/java/org/eclipse/kapua/service/device/registry/steps/MqttDevice.java`
#### Snippet
```java
    public void mqttClientPublishString(String clientId, String payload, String topic,
                                        Map<String, Map<String, String>> clientMqttMessage,
                                        Map<String, String> listenerMqttMessage) {

        this.clientReceivedMqttMessage = clientMqttMessage;
```

### BoundedWildcard
Can generalize to `? super Throwable`
in `client/gateway/provider/paho/src/main/java/org/eclipse/kapua/client/gateway/mqtt/paho/internal/Listeners.java`
#### Snippet
```java
    }

    public static IMqttActionListener toListener(final Runnable success, final Consumer<Throwable> failure) {
        return new IMqttActionListener() {

```

### BoundedWildcard
Can generalize to `? extends CucJobStepProperty`
in `service/job/test-steps/src/main/java/org/eclipse/kapua/service/job/steps/JobStepDefinitionServiceSteps.java`
#### Snippet
```java

    @Given("A regular step definition creator with the name {string} and the following properties")
    public void iPrepareARegularStepDefinitionCreatorWithPropertyList(String name, List<CucJobStepProperty> list) {
        JobStepDefinitionCreator stepDefinitionCreator = prepareDefaultJobStepDefinitionCreator();
        stepDefinitionCreator.setName(name);
```

### BoundedWildcard
Can generalize to `? extends CucConfig`
in `service/job/test-steps/src/main/java/org/eclipse/kapua/service/job/steps/JobServiceSteps.java`
#### Snippet
```java

    @When("I configure the job service")
    public void setJobServiceConfigurationValue(List<CucConfig> cucConfigs) throws Exception {
        Map<String, Object> valueMap = new HashMap<>();
        KapuaId accId = getCurrentScopeId();
```

### BoundedWildcard
Can generalize to `? extends F`
in `service/device/call/kura/src/main/java/org/eclipse/kapua/service/device/call/kura/KuraDeviceCallImpl.java`
#### Snippet
```java
     * @since 1.0.0
     */
    protected <F extends Message<?, ?>, T extends Message<?, ?>> Translator<F, T> getTranslator(Class<F> from, Class<T> to) throws KuraDeviceCallException {
        Translator<F, T> translator;
        try {
```

### BoundedWildcard
Can generalize to `? extends T`
in `service/device/call/kura/src/main/java/org/eclipse/kapua/service/device/call/kura/KuraDeviceCallImpl.java`
#### Snippet
```java
     * @since 1.0.0
     */
    protected <F extends Message<?, ?>, T extends Message<?, ?>> Translator<F, T> getTranslator(Class<F> from, Class<T> to) throws KuraDeviceCallException {
        Translator<F, T> translator;
        try {
```

### BoundedWildcard
Can generalize to `? extends CucJobStepProperty`
in `service/job/test-steps/src/main/java/org/eclipse/kapua/service/job/steps/JobStepServiceSteps.java`
#### Snippet
```java

    @Given("I prepare a JobStepCreator with the name {string} and the following properties")
    public void iPrepareAJobStepCreatorWithPropertyList(String name, List<CucJobStepProperty> cucJobStepProperties) {
        KapuaId currentStepDefinitionId = (KapuaId) stepData.get(CURRENT_JOB_STEP_DEFINITION_ID);

```

### BoundedWildcard
Can generalize to `? extends CucJobStepProperty`
in `service/job/test-steps/src/main/java/org/eclipse/kapua/service/job/steps/JobStepServiceSteps.java`
#### Snippet
```java
    @And("I prepare a JobStepCreator with the name {string} and properties")
    // TODO Review implementation. These should be tested specifically for each JobStepDefinition
    public void iPrepareAJobStepCreatorWithPropertyList1(String name, List<CucJobStepProperty> tmpProperty) {
        JobStepCreator stepCreator;
        ArrayList<JobStepDefinition> jobStepDefinitions = (ArrayList<JobStepDefinition>) stepData.get(JOB_STEP_DEFINITIONS);
```

### BoundedWildcard
Can generalize to `? extends T`
in `commons/src/main/java/org/eclipse/kapua/commons/jpa/EntityManagerContainer.java`
#### Snippet
```java
    }

    public EntityManagerContainer<T> onResultHandler(EntityManagerCallback<T> resultCallback) {
        this.resultCallback = resultCallback;
        return this;
```

### BoundedWildcard
Can generalize to `? extends T`
in `commons/src/main/java/org/eclipse/kapua/commons/jpa/EntityManagerContainer.java`
#### Snippet
```java
    }

    public EntityManagerContainer<T> onBeforeHandler(OnBeforeResult<T> onBefore) {
        this.onBefore = onBefore;
        return this;
```

### BoundedWildcard
Can generalize to `? super T`
in `commons/src/main/java/org/eclipse/kapua/commons/jpa/EntityManagerContainer.java`
#### Snippet
```java
    }

    public EntityManagerContainer<T> onAfterHandler(OnAfterResult<T> onAfter) {
        this.onAfter= onAfter;
        return this;
```

### BoundedWildcard
Can generalize to `? extends CucDevice`
in `service/device/registry/test-steps/src/main/java/org/eclipse/kapua/service/device/registry/steps/DeviceRegistrySteps.java`
#### Snippet
```java

    @And("I filter devices by")
    public void iFilterDevices(List<CucDevice> parameters) throws Exception {
        CucDevice deviceParams = parameters.get(0);
        DeviceListResult devices;
```

### BoundedWildcard
Can generalize to `? extends CucConfig`
in `service/device/registry/test-steps/src/main/java/org/eclipse/kapua/service/device/registry/steps/DeviceRegistrySteps.java`
#### Snippet
```java

    @When("I configure the device registry service")
    public void setDeviceRegistryConfigurationValue(List<CucConfig> cucConfigs) throws Exception {
        Map<String, Object> valueMap = new HashMap<>();
        KapuaId accId = getCurrentScopeId();
```

### BoundedWildcard
Can generalize to `? extends CucConnection`
in `service/device/registry/test-steps/src/main/java/org/eclipse/kapua/service/device/registry/steps/DeviceRegistrySteps.java`
#### Snippet
```java

    @Given("The following device connections")
    public void createConnectionForDevice(List<CucConnection> connections) throws KapuaException {
        KapuaSecurityUtils.doPrivileged(() -> {
            for (CucConnection tmpConn : connections) {
```

### BoundedWildcard
Can generalize to `? extends CucDevice`
in `service/device/registry/test-steps/src/main/java/org/eclipse/kapua/service/device/registry/steps/DeviceRegistrySteps.java`
#### Snippet
```java


    private void createDevicesAsSpecifiedInternal(List<CucDevice> cucDevices, DeviceConnection deviceConnection) throws Exception {
        primeException();
        try {
```

### BoundedWildcard
Can generalize to `? extends CucDeviceExtendedProperty`
in `service/device/registry/test-steps/src/main/java/org/eclipse/kapua/service/device/registry/steps/DeviceRegistrySteps.java`
#### Snippet
```java

    @And("I add an extended (property)/(properties) to the device creator")
    public void addDeviceCreatorExtendedProperties(List<CucDeviceExtendedProperty> cucDeviceExtendedProperties) {
        DeviceCreator deviceCreator = (DeviceCreator) stepData.get(DEVICE_CREATOR);
        Assert.assertNotNull(deviceCreator);
```

### BoundedWildcard
Can generalize to `? extends CucConnection`
in `service/device/registry/test-steps/src/main/java/org/eclipse/kapua/service/device/registry/steps/DeviceRegistrySteps.java`
#### Snippet
```java

    @Given("I have the following connection(s)")
    public void createConnections(List<CucConnection> cucConnections) throws Exception {
        primeException();

```

### BoundedWildcard
Can generalize to `? extends CucDeviceExtendedProperty`
in `service/device/registry/test-steps/src/main/java/org/eclipse/kapua/service/device/registry/steps/DeviceRegistrySteps.java`
#### Snippet
```java

    @And("I change device extended (property)/(properties) to")
    public void iChangeDeviceExtendedPropertiesTo(List<CucDeviceExtendedProperty> cucDeviceExtendedProperties) throws Throwable {
        Device device = (Device) stepData.get(DEVICE);
        try {
```

### BoundedWildcard
Can generalize to `? extends CucConfig`
in `service/device/registry/test-steps/src/main/java/org/eclipse/kapua/service/device/registry/steps/DeviceRegistrySteps.java`
#### Snippet
```java

    @When("I configure the device connection service")
    public void setDeviceConnectionConfigurationValue(List<CucConfig> cucConfigs) throws Exception {
        Map<String, Object> valueMap = new HashMap<>();
        KapuaId accId = getCurrentScopeId();
```

### BoundedWildcard
Can generalize to `? extends CucUser`
in `service/device/registry/test-steps/src/main/java/org/eclipse/kapua/service/device/registry/steps/DeviceRegistrySteps.java`
#### Snippet
```java

    @Given("Such a set of privileged users for account {string}")
    public void createPrivilegedUsers(String accName, List<CucUser> users) throws Throwable {
        KapuaSecurityUtils.doPrivileged(() -> {
            Account account = accountService.findByName(accName);
```

### BoundedWildcard
Can generalize to `? extends CucConnection`
in `service/device/registry/test-steps/src/main/java/org/eclipse/kapua/service/device/registry/steps/DeviceRegistrySteps.java`
#### Snippet
```java

    @Then("The connection details match")
    public void checkConnectionDetails(List<CucConnection> connections) {
        DeviceConnection connection = (DeviceConnection) stepData.get(DEVICE_CONNECTION);
        // Only a single connection must be specified for this test!
```

### BoundedWildcard
Can generalize to `? extends CucConnection`
in `service/device/registry/test-steps/src/main/java/org/eclipse/kapua/service/device/registry/steps/DeviceRegistrySteps.java`
#### Snippet
```java

    @Given("I modify the connection details to")
    public void updateConnectionDetails(List<CucConnection> connections) throws Exception {
        // Only a single connection must be specified for this test!
        Assert.assertNotNull(connections);
```

### BoundedWildcard
Can generalize to `? extends ServiceEntry`
in `commons/src/main/java/org/eclipse/kapua/commons/event/ServiceMap.java`
#### Snippet
```java
     * @param servicesEntryList
     */
    public static synchronized void registerServices(String serviceDefaultAddress, List<ServiceEntry> servicesEntryList) {
        for (ServiceEntry serviceEntry : servicesEntryList) {
            //register service name
```

### BoundedWildcard
Can generalize to `? extends ServiceEntry`
in `commons/src/main/java/org/eclipse/kapua/commons/event/ServiceEventHousekeeper.java`
#### Snippet
```java
     * @throws KapuaException
     */
    public ServiceEventHousekeeper(EntityManagerFactory entityManagerFactory, ServiceEventBus eventbus, List<ServiceEntry> servicesEntryList) throws KapuaException {
        this.eventbus = eventbus;
        this.servicesEntryList = servicesEntryList;
```

### BoundedWildcard
Can generalize to `? extends KapuaEntity`
in `commons/src/main/java/org/eclipse/kapua/commons/event/RaiseServiceEventInterceptor.java`
#### Snippet
```java
    }

    private void useEntityToFillEvent(ServiceEvent serviceEvent, List<KapuaEntity> entities) {
        if (entities.size()>1) {
            LOG.warn("Found more than one KapuaEntity in the parameters! Assuming to use the first one!");
```

### BoundedWildcard
Can generalize to `? extends KapuaId`
in `commons/src/main/java/org/eclipse/kapua/commons/event/RaiseServiceEventInterceptor.java`
#### Snippet
```java
    }

    private void useKapuaIdsToFillEvent(ServiceEvent serviceEvent, List<KapuaId> ids, Class<?>[] implementedClass) {
        if (ids.size()>2) {
            LOG.warn("Found more than two KapuaId in the parameters! Assuming to use the first two!");
```

### BoundedWildcard
Can generalize to `? extends KapuaEntity`
in `commons/src/main/java/org/eclipse/kapua/commons/event/RaiseServiceEventInterceptor.java`
#### Snippet
```java
    }

    private void logFoundEntities(List<KapuaEntity> entities, List<KapuaId> ids) {
        LOG.debug("Entities found:");
        for (KapuaEntity tmp : entities) {
```

### BoundedWildcard
Can generalize to `? extends KapuaId`
in `commons/src/main/java/org/eclipse/kapua/commons/event/RaiseServiceEventInterceptor.java`
#### Snippet
```java
    }

    private void logFoundEntities(List<KapuaEntity> entities, List<KapuaId> ids) {
        LOG.debug("Entities found:");
        for (KapuaEntity tmp : entities) {
```

### BoundedWildcard
Can generalize to `? super E`
in `commons/src/main/java/org/eclipse/kapua/commons/model/query/KapuaListResultImpl.java`
#### Snippet
```java

    @Override
    public List<E> getItems(Predicate<E> filter) {
        return getItems().stream().filter(filter).collect(Collectors.toList());
    }
```

### BoundedWildcard
Can generalize to `? super E`
in `commons/src/main/java/org/eclipse/kapua/commons/model/query/KapuaListResultImpl.java`
#### Snippet
```java

    @Override
    public void sort(Comparator<E> comparator) {
        getItems().sort(comparator);
    }
```

### BoundedWildcard
Can generalize to `? super E`
in `commons/src/main/java/org/eclipse/kapua/commons/model/query/KapuaListResultImpl.java`
#### Snippet
```java

    @Override
    public <K> Map<K, E> getItemsAsMap(Function<E, K> keyMapper) {
        return getItems().stream().collect(Collectors.toMap(keyMapper, e -> e));
    }
```

### BoundedWildcard
Can generalize to `? extends K`
in `commons/src/main/java/org/eclipse/kapua/commons/model/query/KapuaListResultImpl.java`
#### Snippet
```java

    @Override
    public <K> Map<K, E> getItemsAsMap(Function<E, K> keyMapper) {
        return getItems().stream().collect(Collectors.toMap(keyMapper, e -> e));
    }
```

### BoundedWildcard
Can generalize to `? super E`
in `commons/src/main/java/org/eclipse/kapua/commons/model/query/KapuaListResultImpl.java`
#### Snippet
```java

    @Override
    public <K, V> Map<K, V> getItemsAsMap(Function<E, K> keyMapper, Function<E, V> valueMapper) {
        return getItems().stream().collect(Collectors.toMap(keyMapper, valueMapper));
    }
```

### BoundedWildcard
Can generalize to `? extends K`
in `commons/src/main/java/org/eclipse/kapua/commons/model/query/KapuaListResultImpl.java`
#### Snippet
```java

    @Override
    public <K, V> Map<K, V> getItemsAsMap(Function<E, K> keyMapper, Function<E, V> valueMapper) {
        return getItems().stream().collect(Collectors.toMap(keyMapper, valueMapper));
    }
```

### BoundedWildcard
Can generalize to `? super E`
in `commons/src/main/java/org/eclipse/kapua/commons/model/query/KapuaListResultImpl.java`
#### Snippet
```java

    @Override
    public <K, V> Map<K, V> getItemsAsMap(Function<E, K> keyMapper, Function<E, V> valueMapper) {
        return getItems().stream().collect(Collectors.toMap(keyMapper, valueMapper));
    }
```

### BoundedWildcard
Can generalize to `? extends V`
in `commons/src/main/java/org/eclipse/kapua/commons/model/query/KapuaListResultImpl.java`
#### Snippet
```java

    @Override
    public <K, V> Map<K, V> getItemsAsMap(Function<E, K> keyMapper, Function<E, V> valueMapper) {
        return getItems().stream().collect(Collectors.toMap(keyMapper, valueMapper));
    }
```

### BoundedWildcard
Can generalize to `? extends V`
in `commons/src/main/java/org/eclipse/kapua/commons/setting/AbstractBaseKapuaSetting.java`
#### Snippet
```java
     * @return
     */
    public <V> Map<String, V> getMap(Class<V> valueType, K prefixKey, String regex) {
        Map<String, V> map = new HashMap<>();
        Configuration subsetConfig = config.subset(prefixKey.key());
```

### BoundedWildcard
Can generalize to `? extends V`
in `commons/src/main/java/org/eclipse/kapua/commons/setting/AbstractBaseKapuaSetting.java`
#### Snippet
```java
     * @return
     */
    public <V> Map<String, V> getMap(Class<V> valueType, K prefixKey) {
        Map<String, V> map = new HashMap<>();
        Configuration subsetConfig = config.subset(prefixKey.key());
```

### BoundedWildcard
Can generalize to `? extends S`
in `commons/src/main/java/org/eclipse/kapua/commons/configuration/AbstractKapuaConfigurableResourceLimitedService.java`
#### Snippet
```java
            EntityManagerFactory entityManagerFactory,
            AbstractEntityCacheFactory abstractCacheFactory,
            Class<S> serviceClass,
            Class<F> factoryClass) {
        super(pid, domain, entityManagerFactory, abstractCacheFactory);
```

### BoundedWildcard
Can generalize to `? extends F`
in `commons/src/main/java/org/eclipse/kapua/commons/configuration/AbstractKapuaConfigurableResourceLimitedService.java`
#### Snippet
```java
            AbstractEntityCacheFactory abstractCacheFactory,
            Class<S> serviceClass,
            Class<F> factoryClass) {
        super(pid, domain, entityManagerFactory, abstractCacheFactory);

```

### BoundedWildcard
Can generalize to `? extends KapuaToption`
in `commons/src/main/java/org/eclipse/kapua/commons/configuration/metatype/TadImpl.java`
#### Snippet
```java

    @Override
    public void setOption(List<KapuaToption> option) {
        this.option = new ArrayList<>();
        for (KapuaToption singleOption : option) {
```

### BoundedWildcard
Can generalize to `? extends JobStepProperty`
in `service/job/internal/src/main/java/org/eclipse/kapua/service/job/step/internal/JobStepImpl.java`
#### Snippet
```java

    @Override
    public void setStepProperties(List<JobStepProperty> jobStepProperties) {

        this.stepProperties = new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? extends JobStepProperty`
in `service/job/internal/src/main/java/org/eclipse/kapua/service/job/step/definition/internal/JobStepDefinitionImpl.java`
#### Snippet
```java

    @Override
    public void setStepProperties(List<JobStepProperty> jobStepProperties) {
        this.jobStepProperties = new ArrayList<>();

```

### BoundedWildcard
Can generalize to `? extends KapuaId`
in `service/job/internal/src/main/java/org/eclipse/kapua/service/job/execution/internal/JobExecutionImpl.java`
#### Snippet
```java

    @Override
    public void setTargetIds(Set<KapuaId> tagIds) {
        this.targetIds = new HashSet<>();

```

### BoundedWildcard
Can generalize to `? extends JobStepProperty`
in `service/job/internal/src/main/java/org/eclipse/kapua/service/job/step/internal/JobStepServiceImpl.java`
#### Snippet
```java
    }

    private void validateJobStepProperties(List<JobStepProperty> jobStepProperties, JobStepDefinition jobStepDefinition) throws KapuaIllegalArgumentException {

        for (JobStepProperty jobStepProperty : jobStepProperties) {
```

### BoundedWildcard
Can generalize to `? super String`
in `broker/client/src/main/java/org/eclipse/kapua/broker/client/protocol/DefaultProtocolDescriptionProvider.java`
#### Snippet
```java
    }

    private static void loadConfigurations(Map<String, ProtocolDescriptor> configuration) throws Exception {
        String uri = BrokerClientSetting.getInstance().getString(BrokerClientSettingKey.CONFIGURATION_URI, null);

```

### BoundedWildcard
Can generalize to `? super ProtocolDescriptor`
in `broker/client/src/main/java/org/eclipse/kapua/broker/client/protocol/DefaultProtocolDescriptionProvider.java`
#### Snippet
```java
    }

    private static void loadConfigurations(Map<String, ProtocolDescriptor> configuration) throws Exception {
        String uri = BrokerClientSetting.getInstance().getString(BrokerClientSettingKey.CONFIGURATION_URI, null);

```

### BoundedWildcard
Can generalize to `? super String`
in `job-engine/jbatch/src/main/java/org/eclipse/kapua/job/engine/jbatch/driver/utils/JobDefinitionBuildUtils.java`
#### Snippet
```java
    }

    private static void addPropertiesToCustomStepProperties(Map<String, Property> customStepProperties, List<JobStepProperty> stepProperties) {
        for (JobStepProperty jobStepProperty : stepProperties) {
            if (jobStepProperty.getPropertyValue() != null) {
```

### BoundedWildcard
Can generalize to `? super Property`
in `job-engine/jbatch/src/main/java/org/eclipse/kapua/job/engine/jbatch/driver/utils/JobDefinitionBuildUtils.java`
#### Snippet
```java
    }

    private static void addPropertiesToCustomStepProperties(Map<String, Property> customStepProperties, List<JobStepProperty> stepProperties) {
        for (JobStepProperty jobStepProperty : stepProperties) {
            if (jobStepProperty.getPropertyValue() != null) {
```

### BoundedWildcard
Can generalize to `? extends JobStepProperty`
in `job-engine/jbatch/src/main/java/org/eclipse/kapua/job/engine/jbatch/driver/utils/JobDefinitionBuildUtils.java`
#### Snippet
```java
    }

    private static void addPropertiesToCustomStepProperties(Map<String, Property> customStepProperties, List<JobStepProperty> stepProperties) {
        for (JobStepProperty jobStepProperty : stepProperties) {
            if (jobStepProperty.getPropertyValue() != null) {
```

### BoundedWildcard
Can generalize to `? extends KapuaId`
in `job-engine/jbatch/src/main/java/org/eclipse/kapua/job/engine/jbatch/JobEngineServiceJbatch.java`
#### Snippet
```java

    @Override
    public Map<KapuaId, Boolean> isRunning(KapuaId scopeId, Set<KapuaId> jobIds) throws KapuaException {
        //
        // Argument Validation
```

### BoundedWildcard
Can generalize to `? extends QueryPredicate`
in `commons/src/main/java/org/eclipse/kapua/commons/service/internal/KapuaNamedEntityServiceUtils.java`
#### Snippet
```java
     * @since 2.0.0
     */
    public static <E extends KapuaNamedEntity> void checkEntityNameUniqueness(@NotNull KapuaEntityService<E, ?> kapuaNamedEntityService, @NotNull E entity, @NotNull List<QueryPredicate> additionalPredicates) throws KapuaException {
        KapuaQuery query = QUERY_FACTORY.newQuery();
        query.setScopeId(entity.getScopeId());
```

### BoundedWildcard
Can generalize to `? extends QueryPredicate`
in `commons/src/main/java/org/eclipse/kapua/commons/service/internal/KapuaNamedEntityServiceUtils.java`
#### Snippet
```java
     * @since 2.0.0
     */
    public static <E extends KapuaNamedEntity, C extends KapuaNamedEntityCreator<E>> void checkEntityNameUniqueness(@NotNull KapuaEntityService<E, C> kapuaNamedEntityService, @NotNull C creator, @NotNull List<QueryPredicate> additionalPredicates) throws KapuaException {
        KapuaQuery query = QUERY_FACTORY.newQuery();
        query.setScopeId(creator.getScopeId());
```

### BoundedWildcard
Can generalize to `? extends KapuaId`
in `job-engine/commons/src/main/java/org/eclipse/kapua/job/engine/commons/model/JobTargetSublist.java`
#### Snippet
```java
    }

    public JobTargetSublist(Set<KapuaId> targetIds) {
        this.targetIds.addAll(targetIds);
    }
```

### BoundedWildcard
Can generalize to `? extends KapuaId`
in `commons-rest/model/src/main/java/org/eclipse/kapua/commons/rest/model/IsJobRunningMultipleResponse.java`
#### Snippet
```java
    }

    public IsJobRunningMultipleResponse(Map<KapuaId, Boolean> map) {
        map.forEach((key, value) -> list.add(new IsJobRunningResponse(key, value)));
    }
```

### BoundedWildcard
Can generalize to `? extends CucConfig`
in `service/security/test-steps/src/main/java/org/eclipse/kapua/service/authentication/steps/AuthenticationServiceSteps.java`
#### Snippet
```java

    @When("I configure the credential service")
    public void setConfigurationValue(List<CucConfig> cucConfigs) throws Exception {
        Map<String, Object> valueMap = new HashMap<>();
        KapuaId scopeId;
```

### BoundedWildcard
Can generalize to `? extends CucConfig`
in `service/security/test-steps/src/main/java/org/eclipse/kapua/service/authentication/steps/AuthenticationServiceSteps.java`
#### Snippet
```java

    @When("I configure the credential service for the account with the id {int}")
    public void setCredentialServiceConfig(int accountId, List<CucConfig> cucConfigs) throws Exception {
        Map<String, Object> valueMap = new HashMap<>();
        KapuaId accId = getKapuaId(accountId);
```

### BoundedWildcard
Can generalize to `? super Permission`
in `commons/src/main/java/org/eclipse/kapua/commons/service/internal/ServiceDAO.java`
#### Snippet
```java
     * @since 1.0.0
     */
    private static boolean checkGroupPermission(@NonNull Domain domain, @NonNull List<Permission> groupPermissions, @NonNull Permission permission) {
        if ((permission.getDomain() == null || domain.getName().equals(permission.getDomain())) &&
                (permission.getAction() == null || Actions.read.equals(permission.getAction()))) {
```

### BoundedWildcard
Can generalize to `? extends QueryPredicate`
in `commons/src/main/java/org/eclipse/kapua/commons/service/internal/ServiceDAO.java`
#### Snippet
```java
    }

    private static <E> Predicate[] handlePredicate(@NonNull List<QueryPredicate> orPredicates,
                                                   @NonNull Map<ParameterExpression, Object> binds,
                                                   @NonNull CriteriaBuilder cb,
```

### BoundedWildcard
Can generalize to `? super ParameterExpression`
in `commons/src/main/java/org/eclipse/kapua/commons/service/internal/ServiceDAO.java`
#### Snippet
```java

    private static <E> Predicate handleAttributePredicate(@NonNull AttributePredicate<?> attrPred,
                                                          @NonNull Map<ParameterExpression, Object> binds,
                                                          @NonNull CriteriaBuilder cb,
                                                          @NonNull Root<E> entityRoot,
```

### BoundedWildcard
Can generalize to `? extends E`
in `commons/src/main/java/org/eclipse/kapua/commons/service/internal/ServiceDAO.java`
#### Snippet
```java
     * @since 1.0.0
     */
    public static <E extends KapuaUpdatableEntity> E update(@NonNull EntityManager em, @NonNull Class<E> clazz, @NonNull E entity) throws KapuaEntityNotFoundException {
        //
        // Checking existence
```

### BoundedWildcard
Can generalize to `? extends JobStepProperty`
in `extras/encryption-migrator/src/main/java/org/eclipse/kapua/extras/migrator/encryption/job/JobStepMigrator.java`
#### Snippet
```java

    @Override
    public void setStepProperties(List<JobStepProperty> jobStepProperties) {

        this.stepProperties = new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? extends E`
in `extras/encryption-migrator/src/main/java/org/eclipse/kapua/extras/migrator/encryption/api/AbstractEntityAttributeMigrator.java`
#### Snippet
```java

    @Override
    public void migrate(List<E> entitiesToMigrate) throws KapuaException {
        for (E entityToMigrate : entitiesToMigrate) {
            if (DRY_RUN) {
```

### BoundedWildcard
Can generalize to `? extends CucTriggerProperty`
in `service/scheduler/test-steps/src/main/java/org/eclipse/kapua/service/scheduler/steps/JobScheduleServiceSteps.java`
#### Snippet
```java

    @And("A regular trigger creator with the name {string} and following properties")
    public void aRegularTriggerCreatorWithTheNameAndFollowingProperties(String triggerName, List<CucTriggerProperty> list) {
        TriggerCreator triggerCreator = triggerFactory.newCreator(getCurrentScopeId());
        KapuaId currentTriggerDefId = (KapuaId) stepData.get(TRIGGER_DEFINITION_ID);
```

### BoundedWildcard
Can generalize to `? super String`
in `locator/guice/src/main/java/org/eclipse/kapua/locator/guice/LocatorConfig.java`
#### Snippet
```java
     * @since 1.0.0
     */
    private static void addAllStrings(List<String> list, Collection<?> other) {
        for (Object entry : other) {
            if (entry instanceof String) {
```

### BoundedWildcard
Can generalize to `? extends T`
in `locator/guice/src/main/java/org/eclipse/kapua/locator/guice/GuiceLocatorImpl.java`
#### Snippet
```java
     * @since 2.0.0
     */
    private <T extends Class<?>> Collection<T> sortedClass(Collection<T> classes) {
        return classes.stream().sorted(Comparator.comparing(Class::getName)).collect(Collectors.toList());
    }
```

### BoundedWildcard
Can generalize to `? extends C`
in `locator/guice/src/main/java/org/eclipse/kapua/locator/guice/GuiceLocatorImpl.java`
#### Snippet
```java
     * @since 2.0.0
     */
    private <C extends Comparable<?>> Collection<C> sortedComparable(Collection<C> strings) {
        return strings.stream().sorted().collect(Collectors.toList());
    }
```

### BoundedWildcard
Can generalize to `? extends AbstractKapuaModule`
in `locator/guice/src/main/java/org/eclipse/kapua/locator/guice/GuiceLocatorImpl.java`
#### Snippet
```java
     * @since 2.0.0
     */
    private void printLoadedKapuaModuleConfiguration(@NotNull URL resourceNameURL, @NotNull LocatorConfig locatorConfig, @NotNull List<AbstractKapuaModule> kapuaModules, @NotNull List<Class<? extends AbstractKapuaModule>> excludedKapuaModules) {
        ConfigurationPrinter configurationPrinter =
                ConfigurationPrinter
```

### BoundedWildcard
Can generalize to `? extends CucConfig`
in `service/tag/test-steps/src/main/java/org/eclipse/kapua/service/tag/steps/TagServiceSteps.java`
#### Snippet
```java

    @Given("I configure the tag service")
    public void setConfigurationValue(List<CucConfig> testConfigs) throws Exception {
        Account lastAcc = (Account) stepData.get("LastAccount");
        KapuaId scopeId = SYS_SCOPE_ID;
```

### BoundedWildcard
Can generalize to `? extends CucRole`
in `service/security/test-steps/src/main/java/org/eclipse/kapua/service/authorization/steps/AuthorizationServiceSteps.java`
#### Snippet
```java

    @And("I create the roles")
    public void iCreateTheRoles(List<CucRole> roleNames) throws Exception {
        RoleCreator roleCreator = roleFactory.newCreator(getCurrentScopeId());
        ArrayList<Role> roleArrayList = new ArrayList<Role>();
```

### BoundedWildcard
Can generalize to `? extends CucDomain`
in `service/security/test-steps/src/main/java/org/eclipse/kapua/service/authorization/steps/AuthorizationServiceSteps.java`
#### Snippet
```java

    @Then("The domain matches the parameters")
    public void checkDomainAgainstParameters(List<CucDomain> domains) {
        Domain domain = (Domain) stepData.get(DOMAIN);
        Assert.assertEquals(1, domains.size());
```

### BoundedWildcard
Can generalize to `? extends CucGroup`
in `service/security/test-steps/src/main/java/org/eclipse/kapua/service/authorization/steps/AuthorizationServiceSteps.java`
#### Snippet
```java

    @Given("I create the group(s)")
    public void createAListOfGroups(List<CucGroup> groups) throws Exception {
        Group group = null;
        GroupCreator groupCreator = null;
```

### BoundedWildcard
Can generalize to `? extends CucRolePermission`
in `service/security/test-steps/src/main/java/org/eclipse/kapua/service/authorization/steps/AuthorizationServiceSteps.java`
#### Snippet
```java

    @And("I create the following role permission(s) in account {string}")
    public void iCreateTheFollowingRolePermissionInSubaccount(String accountName, List<CucRolePermission> perms) throws Exception {
        Role role = (Role) stepData.get("Role");
        Account account = (Account) stepData.get(LAST_ACCOUNT);
```

### BoundedWildcard
Can generalize to `? extends CucRole`
in `service/security/test-steps/src/main/java/org/eclipse/kapua/service/authorization/steps/AuthorizationServiceSteps.java`
#### Snippet
```java

    @Then("I find the following actions")
    public void checkPermissionsAgainstList(List<CucRole> roles) {
        RolePermissionListResult permissionList = (RolePermissionListResult) stepData.get(PERMISSION_LIST);
        Assert.assertNotNull(roles);
```

### BoundedWildcard
Can generalize to `? extends CucRole`
in `service/security/test-steps/src/main/java/org/eclipse/kapua/service/authorization/steps/AuthorizationServiceSteps.java`
#### Snippet
```java

    @Given("I create the following role(s)")
    public void createAListOfRoles(List<CucRole> roles) throws Exception {
        Domain domain = (Domain) stepData.get(DOMAIN);
        RoleCreator roleCreator = null;
```

### BoundedWildcard
Can generalize to `? extends CucConfig`
in `service/security/test-steps/src/main/java/org/eclipse/kapua/service/authorization/steps/AuthorizationServiceSteps.java`
#### Snippet
```java

    @When("I configure the role service")
    public void setConfigurationValue(List<CucConfig> cucConfigs) throws Exception {
        Map<String, Object> valueMap = new HashMap<>();
        KapuaId scopeId;
```

### BoundedWildcard
Can generalize to `? extends CucConfig`
in `service/security/test-steps/src/main/java/org/eclipse/kapua/service/authorization/steps/AuthorizationServiceSteps.java`
#### Snippet
```java

    @When("I configure the group service")
    public void setGroupConfigurationValue(List<CucConfig> cucConfigs) throws Exception {
        Map<String, Object> valueMap = new HashMap<>();
        KapuaId scopeId;
```

### BoundedWildcard
Can generalize to `? extends CucConfig`
in `service/security/test-steps/src/main/java/org/eclipse/kapua/service/authorization/steps/AuthorizationServiceSteps.java`
#### Snippet
```java

    @When("I configure the role service for the account with the id {int}")
    public void setRoleServiceConfig(int accountId, List<CucConfig> cucConfigs) throws Exception {
        Map<String, Object> valueMap = new HashMap<>();
        KapuaId accId = getKapuaId(accountId);
```

### BoundedWildcard
Can generalize to `? extends CucUser`
in `service/security/test-steps/src/main/java/org/eclipse/kapua/service/authorization/steps/AuthorizationServiceSteps.java`
#### Snippet
```java

    @Then("I find granted user(s) with name")
    public void iFindGrantedUsersWithName(List<CucUser> grantedUsers) throws Exception {
        ArrayList<String> grantedUserNames = new ArrayList<>();
        ArrayList<User> grantedUsersList = (ArrayList<User>) stepData.get("GrantedUserList");
```

### BoundedWildcard
Can generalize to `? extends CucDomain`
in `service/security/test-steps/src/main/java/org/eclipse/kapua/service/authorization/steps/AuthorizationServiceSteps.java`
#### Snippet
```java

    @Given("I create the domain(s)")
    public void createAListOfDomains(List<CucDomain> domains) throws Exception {
        DomainCreator domainCreator = null;
        Domain domain = null;
```

### BoundedWildcard
Can generalize to `? extends CucRolePermission`
in `service/security/test-steps/src/main/java/org/eclipse/kapua/service/authorization/steps/AuthorizationServiceSteps.java`
#### Snippet
```java

    @Given("I create the following role permission(s)")
    public void createAListOfRolePermissions(List<CucRolePermission> perms) throws Exception {
        Role role = (Role) stepData.get("Role");
        Domain domain = (Domain) stepData.get(DOMAIN);
```

### BoundedWildcard
Can generalize to `? extends CucCredentials`
in `service/user/test-steps/src/main/java/org/eclipse/kapua/service/user/steps/UserServiceSteps.java`
#### Snippet
```java

    @Given("I add credentials")
    public void givenCredentials(List<CucCredentials> credentialsList) throws Exception {
        CucCredentials cucCredentials = credentialsList.get(0);
        createCredentials(cucCredentials);
```

### BoundedWildcard
Can generalize to `? extends CucUser`
in `service/user/test-steps/src/main/java/org/eclipse/kapua/service/user/steps/UserServiceSteps.java`
#### Snippet
```java

    @Then("I find users with email")
    public void iFindUsersWithTheSameEmailAddress(List<CucUser> userList) {
        Set<ComparableUser> iFoundUsers = (Set<ComparableUser>) stepData.get(USER_LIST);
        boolean userChecks;
```

### BoundedWildcard
Can generalize to `? extends CucUser`
in `service/user/test-steps/src/main/java/org/eclipse/kapua/service/user/steps/UserServiceSteps.java`
#### Snippet
```java

    @Then("I find users with emails")
    public void iFindUsersWithEmails(List<CucUser> userList) {
        Set<ComparableUser> iFoundUsers = (Set<ComparableUser>) stepData.get(USER_LIST);
        boolean userChecks;
```

### BoundedWildcard
Can generalize to `? extends CucUser`
in `service/user/test-steps/src/main/java/org/eclipse/kapua/service/user/steps/UserServiceSteps.java`
#### Snippet
```java

    @And("I find user with expiration date in the future")
    public void iFindUserWithExpirationDateInTheFuture(List<CucUser> userList) {
        Set<ComparableUser> iFoundUsers = (Set<ComparableUser>) stepData.get(USER_LIST);
        boolean userChecks;
```

### BoundedWildcard
Can generalize to `? extends CucUser`
in `service/user/test-steps/src/main/java/org/eclipse/kapua/service/user/steps/UserServiceSteps.java`
#### Snippet
```java

    @Then("I find user")
    public void findUserFull(List<CucUser> userList) {
        User user = (User) stepData.get("User");
        for (CucUser userItem : userList) {
```

### BoundedWildcard
Can generalize to `? extends CucUser`
in `service/user/test-steps/src/main/java/org/eclipse/kapua/service/user/steps/UserServiceSteps.java`
#### Snippet
```java

    @Then("I find users with phone number")
    public void iFindUsersWithPhoneNumber(List<CucUser> userList) {
        Set<ComparableUser> iFoundUsers = (Set<ComparableUser>) stepData.get(USER_LIST);
        boolean userChecks;
```

### BoundedWildcard
Can generalize to `? extends CucConfig`
in `service/user/test-steps/src/main/java/org/eclipse/kapua/service/user/steps/UserServiceSteps.java`
#### Snippet
```java

    @When("I configure user service")
    public void setUserServiceConfig(List<CucConfig> cucConfigs) throws Exception {
        Map<String, Object> valueMap = new HashMap<>();
        KapuaId accId;
```

### BoundedWildcard
Can generalize to `? extends CucUser`
in `service/user/test-steps/src/main/java/org/eclipse/kapua/service/user/steps/UserServiceSteps.java`
#### Snippet
```java
     * @throws Exception
     */
    private HashSet<ComparableUser> createUsersInList(List<CucUser> userList, Account account) throws Exception {
        HashSet<ComparableUser> users = new HashSet<>();
        KapuaSecurityUtils.doPrivileged(() -> {
```

### BoundedWildcard
Can generalize to `? extends CucUser`
in `service/user/test-steps/src/main/java/org/eclipse/kapua/service/user/steps/UserServiceSteps.java`
#### Snippet
```java

    @And("I find user with expiration date in the present")
    public void iFindUserWithExpirationDateInThePresent(List<CucUser> userList) {
        Set<ComparableUser> iFoundUsers = (Set<ComparableUser>) stepData.get(USER_LIST);
        boolean userChecks;
```

### BoundedWildcard
Can generalize to `? extends CucConfig`
in `service/user/test-steps/src/main/java/org/eclipse/kapua/service/user/steps/UserServiceSteps.java`
#### Snippet
```java

    @When("I configure the user service for the account with the id {int}")
    public void setUserServiceConfig(int accountId, List<CucConfig> cucConfigs) throws Exception {
        Map<String, Object> valueMap = new HashMap<>();
        KapuaId accId = new KapuaEid(BigInteger.valueOf(accountId));
```

### BoundedWildcard
Can generalize to `? extends CucPermission`
in `service/user/test-steps/src/main/java/org/eclipse/kapua/service/user/steps/UserServiceSteps.java`
#### Snippet
```java
     * @return AccessInfoCreator instance for creating user permissions
     */
    private AccessInfoCreator accessInfoCreatorCreator(List<CucPermission> permissionList, ComparableUser user, Account account) throws KapuaException {
        AccessInfoCreator accessInfoCreator = accessInfoFactory.newCreator(account.getId());
        accessInfoCreator.setUserId(user.getUser().getId());
```

### BoundedWildcard
Can generalize to `? extends CucUser`
in `service/user/test-steps/src/main/java/org/eclipse/kapua/service/user/steps/UserServiceSteps.java`
#### Snippet
```java

    @And("I find user with expiration date in the past")
    public void iFindUserWithExpirationDateInThePast(List<CucUser> userList) {
        Set<ComparableUser> iFoundUsers = (Set<ComparableUser>) stepData.get(USER_LIST);
        boolean userChecks;
```

### BoundedWildcard
Can generalize to `? extends CucConfig`
in `service/user/test-steps/src/main/java/org/eclipse/kapua/service/user/steps/UserServiceSteps.java`
#### Snippet
```java

    @When("I configure credential service")
    public void setCredentialServiceConfig(List<CucConfig> cucConfigs) throws Exception {
        Map<String, Object> valueMap = new HashMap<>();
        KapuaId accId;
```

### BoundedWildcard
Can generalize to `? extends CucUser`
in `service/user/test-steps/src/main/java/org/eclipse/kapua/service/user/steps/UserServiceSteps.java`
#### Snippet
```java

    @And("I create users with following names")
    public void iCreateUsersWithFollowingNames(List<CucUser> tmpUsers) throws Exception {
        UserCreator userCreator = userFactory.newCreator(getCurrentScopeId());
        ArrayList<User> userList = new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? extends CucUser`
in `service/user/test-steps/src/main/java/org/eclipse/kapua/service/user/steps/UserServiceSteps.java`
#### Snippet
```java

    @Then("I find users")
    public void findUsersFull(List<CucUser> userList) {
        Set<ComparableUser> iFoundUsers = (Set<ComparableUser>) stepData.get(USER_LIST);
        boolean userChecks;
```

### BoundedWildcard
Can generalize to `? extends CucUser`
in `service/user/test-steps/src/main/java/org/eclipse/kapua/service/user/steps/UserServiceSteps.java`
#### Snippet
```java

    @Given("I have the following (user/users)")
    public void haveUsers(List<CucUser> userList) throws Exception {
        Account account = (Account) stepData.get(LAST_ACCOUNT);
        KapuaId accountId = (KapuaId) stepData.get("LastAccountId");
```

### BoundedWildcard
Can generalize to `? extends CucUser`
in `service/user/test-steps/src/main/java/org/eclipse/kapua/service/user/steps/UserServiceSteps.java`
#### Snippet
```java

    @When("I change user to")
    public void changeUserTo(List<CucUser> userList) throws Exception {
        User user = (User) stepData.get("User");
        try {
```

### BoundedWildcard
Can generalize to `? extends CucUser`
in `service/user/test-steps/src/main/java/org/eclipse/kapua/service/user/steps/UserServiceSteps.java`
#### Snippet
```java

    @Given("I have the following user with expiration date in the future")
    public void iHaveTheFollowingUserWithExpirationDateInTheFuture(List<CucUser> userList) throws Exception {
        Account account = (Account) stepData.get(LAST_ACCOUNT);
        KapuaId accountId = (KapuaId) stepData.get("LastAccountId");
```

## RuleId[id=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `final static`
in `translator/kapua/kura/src/main/java/org/eclipse/kapua/translator/kura/kapua/keystore/AbstractTranslatorAppKeystoreKuraKapua.java`
#### Snippet
```java

    @Inject
    private final static DeviceKeystoreManagementFactory DEVICE_KEYSTORE_MANAGEMENT_FACTORY = LOCATOR.getFactory(DeviceKeystoreManagementFactory.class);

    /**
```

### MissortedModifiers
Missorted modifiers `static abstract`
in `client/gateway/spi/src/main/java/org/eclipse/kapua/client/gateway/spi/AbstractClient.java`
#### Snippet
```java
    }

    public static abstract class Builder<T extends Builder<T>> implements Client.Builder {

        protected abstract T builder();
```

### MissortedModifiers
Missorted modifiers `final static`
in `service/commons/storable/api/src/main/java/org/eclipse/kapua/service/storable/model/utils/MappingUtils.java`
#### Snippet
```java
public class MappingUtils {

    private final static JsonNodeFactory JSON_NODE_FACTORY = JsonNodeFactory.instance;
    private static final Logger LOG = LoggerFactory.getLogger(MappingUtils.class);

```

## RuleId[id=InstanceofIncompatibleInterface]
### InstanceofIncompatibleInterface
'instanceof' incompatible interface `KapuaEntity`
in `commons/src/main/java/org/eclipse/kapua/commons/jpa/EntityManagerSession.java`
#### Snippet
```java
                        transactionManager.commit(manager);
                        succeeded = true;
                        if (manager instanceof KapuaEntity) {
                            manager.detach((KapuaEntity) instance);
                            // TODO: check behavior without the detach (when all caches are implemented)
```

## RuleId[id=WhileLoopSpinsOnField]
### WhileLoopSpinsOnField
`while` loop spins on field
in `commons/src/main/java/org/eclipse/kapua/commons/event/ServiceEventHousekeeper.java`
#### Snippet
```java
        //TODO handling events table cleanup
        running = true;
        while (running) {
            waitStep();
            for (ServiceEntry serviceEntry : servicesEntryList) {
```

### WhileLoopSpinsOnField
`while` loop spins on field
in `commons/src/main/java/org/eclipse/kapua/commons/event/jms/JMSServiceEventBus.java`
#### Snippet
```java
                connectionErrorCount.inc();
                int i = 1;
                while (active) {
                    LOGGER.info("EventBus Listener {} - restarting attempt... {}", this, i);
                    try {
```

## RuleId[id=DefaultAnnotationParam]
### DefaultAnnotationParam
Redundant default parameter value assignment
in `service/device/management/registry/internal/src/main/java/org/eclipse/kapua/service/device/management/registry/operation/internal/DeviceManagementOperationImpl.java`
#### Snippet
```java

    @Basic
    @Column(name = "log", nullable = true, updatable = true)
    private String log;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `service/device/management/registry/internal/src/main/java/org/eclipse/kapua/service/device/management/registry/operation/internal/DeviceManagementOperationImpl.java`
#### Snippet
```java

    @Basic
    @Column(name = "log", nullable = true, updatable = true)
    private String log;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `service/device/management/registry/internal/src/main/java/org/eclipse/kapua/service/device/management/registry/operation/internal/DeviceManagementOperationImpl.java`
#### Snippet
```java

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false, updatable = true)
    private NotifyStatus status;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `service/device/management/registry/internal/src/main/java/org/eclipse/kapua/service/device/management/registry/operation/notification/internal/ManagementOperationNotificationImpl.java`
#### Snippet
```java

    @Basic
    @Column(name = "message", nullable = true, updatable = false)
    private String message;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `service/account/internal/src/main/java/org/eclipse/kapua/service/account/internal/AccountImpl.java`
#### Snippet
```java

    @Basic
    @Column(name = "parent_account_path", nullable = false, updatable = true)
    private String parentAccountPath;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `service/scheduler/quartz/src/main/java/org/eclipse/kapua/service/scheduler/trigger/fired/quartz/FiredTriggerImpl.java`
#### Snippet
```java

    @Basic
    @Column(name = "message", nullable = true, updatable = false)
    private String message;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `service/scheduler/quartz/src/main/java/org/eclipse/kapua/service/scheduler/trigger/quartz/TriggerImpl.java`
#### Snippet
```java

    @Basic
    @Column(name = "retry_interval", nullable = true, updatable = true)
    private Long retryInterval;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `service/scheduler/quartz/src/main/java/org/eclipse/kapua/service/scheduler/trigger/quartz/TriggerImpl.java`
#### Snippet
```java

    @Basic
    @Column(name = "retry_interval", nullable = true, updatable = true)
    private Long retryInterval;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `service/scheduler/quartz/src/main/java/org/eclipse/kapua/service/scheduler/trigger/quartz/TriggerImpl.java`
#### Snippet
```java

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "ends_on", nullable = true, updatable = true)
    private Date endsOn;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `service/scheduler/quartz/src/main/java/org/eclipse/kapua/service/scheduler/trigger/quartz/TriggerImpl.java`
#### Snippet
```java

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "ends_on", nullable = true, updatable = true)
    private Date endsOn;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `service/scheduler/quartz/src/main/java/org/eclipse/kapua/service/scheduler/trigger/quartz/TriggerImpl.java`
#### Snippet
```java

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "starts_on", nullable = true, updatable = true)
    private Date startsOn;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `service/scheduler/quartz/src/main/java/org/eclipse/kapua/service/scheduler/trigger/quartz/TriggerImpl.java`
#### Snippet
```java

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "starts_on", nullable = true, updatable = true)
    private Date startsOn;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `service/scheduler/quartz/src/main/java/org/eclipse/kapua/service/scheduler/trigger/quartz/TriggerImpl.java`
#### Snippet
```java

    @Basic
    @Column(name = "cron_scheduling", nullable = true, updatable = true)
    private String cronScheduling;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `service/scheduler/quartz/src/main/java/org/eclipse/kapua/service/scheduler/trigger/quartz/TriggerImpl.java`
#### Snippet
```java

    @Basic
    @Column(name = "cron_scheduling", nullable = true, updatable = true)
    private String cronScheduling;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `service/device/registry/internal/src/main/java/org/eclipse/kapua/service/device/registry/internal/DeviceExtendedPropertyImpl.java`
#### Snippet
```java

    @Basic
    @Column(name = "value_clob", nullable = true, updatable = false)
    private String valueClob;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `service/device/registry/internal/src/main/java/org/eclipse/kapua/service/device/registry/internal/DeviceExtendedPropertyImpl.java`
#### Snippet
```java

    @Basic
    @Column(name = "group_name", nullable = true, updatable = false)
    private String groupName;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `service/device/registry/internal/src/main/java/org/eclipse/kapua/service/device/registry/internal/DeviceExtendedPropertyImpl.java`
#### Snippet
```java

    @Basic
    @Column(name = "value", nullable = true, updatable = false)
    private String value;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `service/device/registry/internal/src/main/java/org/eclipse/kapua/service/device/registry/connection/option/internal/DeviceConnectionOptionImpl.java`
#### Snippet
```java

    @Basic
    @Column(name = "allow_user_change", nullable = false, updatable = true)
    private boolean allowUserChange;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `service/device/registry/internal/src/main/java/org/eclipse/kapua/service/device/registry/connection/option/internal/DeviceConnectionOptionImpl.java`
#### Snippet
```java
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "eid", column = @Column(name = "reserved_user_id", nullable = true, updatable = true))
    })
    private KapuaEid reservedUserId;
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `service/device/registry/internal/src/main/java/org/eclipse/kapua/service/device/registry/connection/option/internal/DeviceConnectionOptionImpl.java`
#### Snippet
```java
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "eid", column = @Column(name = "reserved_user_id", nullable = true, updatable = true))
    })
    private KapuaEid reservedUserId;
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `service/device/registry/internal/src/main/java/org/eclipse/kapua/service/device/registry/internal/DeviceImpl.java`
#### Snippet
```java
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "eid", column = @Column(name = "last_event_id", nullable = true, updatable = true))
    })
    private KapuaEid lastEventId;
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `service/device/registry/internal/src/main/java/org/eclipse/kapua/service/device/registry/internal/DeviceImpl.java`
#### Snippet
```java
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "eid", column = @Column(name = "last_event_id", nullable = true, updatable = true))
    })
    private KapuaEid lastEventId;
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `service/device/registry/internal/src/main/java/org/eclipse/kapua/service/device/registry/internal/DeviceImpl.java`
#### Snippet
```java
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "eid", column = @Column(name = "group_id", nullable = true, updatable = true))
    })
    private KapuaEid groupId;
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `service/device/registry/internal/src/main/java/org/eclipse/kapua/service/device/registry/internal/DeviceImpl.java`
#### Snippet
```java
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "eid", column = @Column(name = "group_id", nullable = true, updatable = true))
    })
    private KapuaEid groupId;
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `service/device/registry/internal/src/main/java/org/eclipse/kapua/service/device/registry/internal/DeviceImpl.java`
#### Snippet
```java
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "eid", column = @Column(name = "connection_id", nullable = true, updatable = true))
    })
    private KapuaEid connectionId;
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `service/device/registry/internal/src/main/java/org/eclipse/kapua/service/device/registry/internal/DeviceImpl.java`
#### Snippet
```java
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "eid", column = @Column(name = "connection_id", nullable = true, updatable = true))
    })
    private KapuaEid connectionId;
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `service/device/registry/internal/src/main/java/org/eclipse/kapua/service/device/registry/connection/internal/DeviceConnectionImpl.java`
#### Snippet
```java
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "eid", column = @Column(name = "user_id", nullable = false, updatable = true))
    })
    private KapuaEid userId;
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `service/device/registry/internal/src/main/java/org/eclipse/kapua/service/device/registry/connection/internal/DeviceConnectionImpl.java`
#### Snippet
```java

    @Basic
    @Column(name = "allow_user_change", nullable = false, updatable = true)
    private boolean allowUserChange;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `service/device/registry/internal/src/main/java/org/eclipse/kapua/service/device/registry/connection/internal/DeviceConnectionImpl.java`
#### Snippet
```java
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "eid", column = @Column(name = "reserved_user_id", nullable = true, updatable = true))
    })
    private KapuaEid reservedUserId;
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `service/device/registry/internal/src/main/java/org/eclipse/kapua/service/device/registry/connection/internal/DeviceConnectionImpl.java`
#### Snippet
```java
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "eid", column = @Column(name = "reserved_user_id", nullable = true, updatable = true))
    })
    private KapuaEid reservedUserId;
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `service/device/registry/internal/src/main/java/org/eclipse/kapua/service/device/registry/connection/internal/DeviceConnectionImpl.java`
#### Snippet
```java

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false, updatable = true)
    private DeviceConnectionStatus status;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `service/endpoint/internal/src/main/java/org/eclipse/kapua/service/endpoint/internal/EndpointInfoImpl.java`
#### Snippet
```java

    @Basic
    @Column(name = "port", updatable = true, nullable = false)
    private int port;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `service/endpoint/internal/src/main/java/org/eclipse/kapua/service/endpoint/internal/EndpointInfoImpl.java`
#### Snippet
```java

    @Basic
    @Column(name = "dns", updatable = true, nullable = false)
    private String dns;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `service/endpoint/internal/src/main/java/org/eclipse/kapua/service/endpoint/internal/EndpointInfoImpl.java`
#### Snippet
```java

    @Basic
    @Column(name = "secure", updatable = true, nullable = false)
    private boolean secure;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `service/endpoint/internal/src/main/java/org/eclipse/kapua/service/endpoint/internal/EndpointInfoImpl.java`
#### Snippet
```java

    @Basic
    @Column(name = "scheme", updatable = true, nullable = false)
    private String schema;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `service/security/shiro/src/main/java/org/eclipse/kapua/service/authorization/permission/shiro/PermissionImpl.java`
#### Snippet
```java
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "eid", column = @Column(name = "group_id", nullable = true, updatable = false))
    })
    private KapuaEid groupId;
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `service/security/shiro/src/main/java/org/eclipse/kapua/service/authorization/permission/shiro/PermissionImpl.java`
#### Snippet
```java

    @Enumerated(EnumType.STRING)
    @Column(name = "action", nullable = true, updatable = false)
    private Actions action;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `service/security/shiro/src/main/java/org/eclipse/kapua/service/authorization/permission/shiro/PermissionImpl.java`
#### Snippet
```java

    @Basic
    @Column(name = "domain", nullable = true, updatable = false)
    private String domain;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `service/security/shiro/src/main/java/org/eclipse/kapua/service/authorization/permission/shiro/PermissionImpl.java`
#### Snippet
```java
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "eid", column = @Column(name = "target_scope_id", nullable = true, updatable = false))
    })
    private KapuaEid targetScopeId;
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `service/security/shiro/src/main/java/org/eclipse/kapua/service/authentication/token/shiro/AccessTokenImpl.java`
#### Snippet
```java

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "invalidated_on", nullable = true)
    private Date invalidatedOn;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `commons/src/main/java/org/eclipse/kapua/commons/model/AbstractKapuaNamedEntity.java`
#### Snippet
```java

    @Basic
    @Column(name = "name", nullable = false, updatable = true)
    protected String name;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `commons/src/main/java/org/eclipse/kapua/commons/model/AbstractKapuaNamedEntity.java`
#### Snippet
```java

    @Basic
    @Column(name = "description", nullable = true, updatable = true)
    protected String description;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `commons/src/main/java/org/eclipse/kapua/commons/model/AbstractKapuaNamedEntity.java`
#### Snippet
```java

    @Basic
    @Column(name = "description", nullable = true, updatable = true)
    protected String description;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `commons/src/main/java/org/eclipse/kapua/commons/service/event/store/internal/EventStoreRecordImpl.java`
#### Snippet
```java

    @Basic
    @Column(name = "outputs", nullable = true, updatable = true)
    private String outputs;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `commons/src/main/java/org/eclipse/kapua/commons/service/event/store/internal/EventStoreRecordImpl.java`
#### Snippet
```java

    @Basic
    @Column(name = "outputs", nullable = true, updatable = true)
    private String outputs;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `commons/src/main/java/org/eclipse/kapua/commons/service/event/store/internal/EventStoreRecordImpl.java`
#### Snippet
```java

    @Basic
    @Column(name = "note", nullable = true, updatable = true)
    private String note;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `commons/src/main/java/org/eclipse/kapua/commons/service/event/store/internal/EventStoreRecordImpl.java`
#### Snippet
```java

    @Basic
    @Column(name = "note", nullable = true, updatable = true)
    private String note;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `commons/src/main/java/org/eclipse/kapua/commons/service/event/store/internal/EventStoreRecordImpl.java`
#### Snippet
```java

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = true, updatable = true)
    private EventStatus status;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `commons/src/main/java/org/eclipse/kapua/commons/service/event/store/internal/EventStoreRecordImpl.java`
#### Snippet
```java

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = true, updatable = true)
    private EventStatus status;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `service/job/internal/src/main/java/org/eclipse/kapua/service/job/step/internal/JobStepImpl.java`
#### Snippet
```java

    @Basic
    @Column(name = "step_index", nullable = false, updatable = true)
    private Integer stepIndex;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `service/job/internal/src/main/java/org/eclipse/kapua/service/job/step/definition/internal/JobStepPropertyImpl.java`
#### Snippet
```java

    @Basic
    @Column(name = "required", nullable = true, updatable = true)
    private Boolean required;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `service/job/internal/src/main/java/org/eclipse/kapua/service/job/step/definition/internal/JobStepPropertyImpl.java`
#### Snippet
```java

    @Basic
    @Column(name = "required", nullable = true, updatable = true)
    private Boolean required;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `service/job/internal/src/main/java/org/eclipse/kapua/service/job/step/definition/internal/JobStepPropertyImpl.java`
#### Snippet
```java

    @Basic
    @Column(name = "secret", nullable = true, updatable = true)
    private Boolean secret;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `service/job/internal/src/main/java/org/eclipse/kapua/service/job/step/definition/internal/JobStepPropertyImpl.java`
#### Snippet
```java

    @Basic
    @Column(name = "secret", nullable = true, updatable = true)
    private Boolean secret;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `service/job/internal/src/main/java/org/eclipse/kapua/service/job/step/definition/internal/JobStepPropertyImpl.java`
#### Snippet
```java

    @Basic
    @Column(name = "example_value", nullable = true, updatable = true)
    private String propertyExampleValue;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `service/job/internal/src/main/java/org/eclipse/kapua/service/job/step/definition/internal/JobStepPropertyImpl.java`
#### Snippet
```java

    @Basic
    @Column(name = "example_value", nullable = true, updatable = true)
    private String propertyExampleValue;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `service/job/internal/src/main/java/org/eclipse/kapua/service/job/step/definition/internal/JobStepPropertyImpl.java`
#### Snippet
```java

    @Basic
    @Column(name = "min_value", nullable = true, updatable = true)
    private String minValue;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `service/job/internal/src/main/java/org/eclipse/kapua/service/job/step/definition/internal/JobStepPropertyImpl.java`
#### Snippet
```java

    @Basic
    @Column(name = "min_value", nullable = true, updatable = true)
    private String minValue;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `service/job/internal/src/main/java/org/eclipse/kapua/service/job/step/definition/internal/JobStepPropertyImpl.java`
#### Snippet
```java

    @Basic
    @Column(name = "max_length", nullable = true, updatable = true)
    private Integer maxLength;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `service/job/internal/src/main/java/org/eclipse/kapua/service/job/step/definition/internal/JobStepPropertyImpl.java`
#### Snippet
```java

    @Basic
    @Column(name = "max_length", nullable = true, updatable = true)
    private Integer maxLength;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `service/job/internal/src/main/java/org/eclipse/kapua/service/job/step/definition/internal/JobStepPropertyImpl.java`
#### Snippet
```java

    @Basic
    @Column(name = "validation_regex", nullable = true, updatable = true)
    private String validationRegex;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `service/job/internal/src/main/java/org/eclipse/kapua/service/job/step/definition/internal/JobStepPropertyImpl.java`
#### Snippet
```java

    @Basic
    @Column(name = "validation_regex", nullable = true, updatable = true)
    private String validationRegex;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `service/job/internal/src/main/java/org/eclipse/kapua/service/job/step/definition/internal/JobStepPropertyImpl.java`
#### Snippet
```java

    @Basic
    @Column(name = "max_value", nullable = true, updatable = true)
    private String maxValue;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `service/job/internal/src/main/java/org/eclipse/kapua/service/job/step/definition/internal/JobStepPropertyImpl.java`
#### Snippet
```java

    @Basic
    @Column(name = "max_value", nullable = true, updatable = true)
    private String maxValue;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `service/job/internal/src/main/java/org/eclipse/kapua/service/job/step/definition/internal/JobStepPropertyImpl.java`
#### Snippet
```java

    @Basic
    @Column(name = "min_length", nullable = true, updatable = true)
    private Integer minLength;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `service/job/internal/src/main/java/org/eclipse/kapua/service/job/step/definition/internal/JobStepPropertyImpl.java`
#### Snippet
```java

    @Basic
    @Column(name = "min_length", nullable = true, updatable = true)
    private Integer minLength;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `service/job/internal/src/main/java/org/eclipse/kapua/service/job/targets/internal/JobTargetImpl.java`
#### Snippet
```java

    @Basic
    @Column(name = "step_index", nullable = false, updatable = true)
    private Integer stepIndex;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `service/job/internal/src/main/java/org/eclipse/kapua/service/job/targets/internal/JobTargetImpl.java`
#### Snippet
```java

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false, updatable = true)
    private JobTargetStatus status;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `service/job/internal/src/main/java/org/eclipse/kapua/service/job/targets/internal/JobTargetImpl.java`
#### Snippet
```java

    @Basic
    @Column(name = "status_message", nullable = true, updatable = true)
    private String statusMessage;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `service/job/internal/src/main/java/org/eclipse/kapua/service/job/targets/internal/JobTargetImpl.java`
#### Snippet
```java

    @Basic
    @Column(name = "status_message", nullable = true, updatable = true)
    private String statusMessage;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `service/job/internal/src/main/java/org/eclipse/kapua/service/job/internal/JobImpl.java`
#### Snippet
```java

    @Basic
    @Column(name = "job_xml_definition", nullable = true, updatable = true)
    private String jobXmlDefinition;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `service/job/internal/src/main/java/org/eclipse/kapua/service/job/internal/JobImpl.java`
#### Snippet
```java

    @Basic
    @Column(name = "job_xml_definition", nullable = true, updatable = true)
    private String jobXmlDefinition;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `service/job/internal/src/main/java/org/eclipse/kapua/service/job/execution/internal/JobExecutionImpl.java`
#### Snippet
```java

    @Lob
    @Column(name = "log", nullable = true, updatable = true)
    private String log;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `service/job/internal/src/main/java/org/eclipse/kapua/service/job/execution/internal/JobExecutionImpl.java`
#### Snippet
```java

    @Lob
    @Column(name = "log", nullable = true, updatable = true)
    private String log;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `service/job/internal/src/main/java/org/eclipse/kapua/service/job/execution/internal/JobExecutionImpl.java`
#### Snippet
```java

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "ended_on", nullable = true, updatable = true)
    private Date endedOn;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `service/job/internal/src/main/java/org/eclipse/kapua/service/job/execution/internal/JobExecutionImpl.java`
#### Snippet
```java

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "ended_on", nullable = true, updatable = true)
    private Date endedOn;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `job-engine/jbatch/src/main/java/org/eclipse/kapua/job/engine/queue/jbatch/QueuedJobExecutionImpl.java`
#### Snippet
```java

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false, updatable = true)
    private QueuedJobExecutionStatus status;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `extras/encryption-migrator/src/main/java/org/eclipse/kapua/extras/migrator/encryption/job/JobStepPropertyMigrator.java`
#### Snippet
```java

    @Basic
    @Column(name = "required", nullable = true, updatable = true)
    private Boolean required;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `extras/encryption-migrator/src/main/java/org/eclipse/kapua/extras/migrator/encryption/job/JobStepPropertyMigrator.java`
#### Snippet
```java

    @Basic
    @Column(name = "required", nullable = true, updatable = true)
    private Boolean required;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `extras/encryption-migrator/src/main/java/org/eclipse/kapua/extras/migrator/encryption/job/JobStepPropertyMigrator.java`
#### Snippet
```java

    @Basic
    @Column(name = "example_value", nullable = true, updatable = true)
    private String propertyExampleValue;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `extras/encryption-migrator/src/main/java/org/eclipse/kapua/extras/migrator/encryption/job/JobStepPropertyMigrator.java`
#### Snippet
```java

    @Basic
    @Column(name = "example_value", nullable = true, updatable = true)
    private String propertyExampleValue;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `extras/encryption-migrator/src/main/java/org/eclipse/kapua/extras/migrator/encryption/job/JobStepPropertyMigrator.java`
#### Snippet
```java

    @Basic
    @Column(name = "secret", nullable = true, updatable = true)
    private Boolean secret;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `extras/encryption-migrator/src/main/java/org/eclipse/kapua/extras/migrator/encryption/job/JobStepPropertyMigrator.java`
#### Snippet
```java

    @Basic
    @Column(name = "secret", nullable = true, updatable = true)
    private Boolean secret;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `extras/encryption-migrator/src/main/java/org/eclipse/kapua/extras/migrator/encryption/job/JobStepPropertyMigrator.java`
#### Snippet
```java

    @Basic
    @Column(name = "min_length", nullable = true, updatable = true)
    private Integer minLength;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `extras/encryption-migrator/src/main/java/org/eclipse/kapua/extras/migrator/encryption/job/JobStepPropertyMigrator.java`
#### Snippet
```java

    @Basic
    @Column(name = "min_length", nullable = true, updatable = true)
    private Integer minLength;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `extras/encryption-migrator/src/main/java/org/eclipse/kapua/extras/migrator/encryption/job/JobStepPropertyMigrator.java`
#### Snippet
```java

    @Basic
    @Column(name = "validation_regex", nullable = true, updatable = true)
    private String validationRegex;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `extras/encryption-migrator/src/main/java/org/eclipse/kapua/extras/migrator/encryption/job/JobStepPropertyMigrator.java`
#### Snippet
```java

    @Basic
    @Column(name = "validation_regex", nullable = true, updatable = true)
    private String validationRegex;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `extras/encryption-migrator/src/main/java/org/eclipse/kapua/extras/migrator/encryption/job/JobStepPropertyMigrator.java`
#### Snippet
```java

    @Basic
    @Column(name = "max_value", nullable = true, updatable = true)
    private String maxValue;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `extras/encryption-migrator/src/main/java/org/eclipse/kapua/extras/migrator/encryption/job/JobStepPropertyMigrator.java`
#### Snippet
```java

    @Basic
    @Column(name = "max_value", nullable = true, updatable = true)
    private String maxValue;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `extras/encryption-migrator/src/main/java/org/eclipse/kapua/extras/migrator/encryption/job/JobStepPropertyMigrator.java`
#### Snippet
```java

    @Basic
    @Column(name = "max_length", nullable = true, updatable = true)
    private Integer maxLength;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `extras/encryption-migrator/src/main/java/org/eclipse/kapua/extras/migrator/encryption/job/JobStepPropertyMigrator.java`
#### Snippet
```java

    @Basic
    @Column(name = "max_length", nullable = true, updatable = true)
    private Integer maxLength;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `extras/encryption-migrator/src/main/java/org/eclipse/kapua/extras/migrator/encryption/job/JobStepPropertyMigrator.java`
#### Snippet
```java

    @Basic
    @Column(name = "min_value", nullable = true, updatable = true)
    private String minValue;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `extras/encryption-migrator/src/main/java/org/eclipse/kapua/extras/migrator/encryption/job/JobStepPropertyMigrator.java`
#### Snippet
```java

    @Basic
    @Column(name = "min_value", nullable = true, updatable = true)
    private String minValue;

```

## RuleId[id=MalformedFormatString]
### MalformedFormatString
Too many arguments for format string (found: 1, expected: 0)
in `qa/common/src/main/java/org/eclipse/kapua/qa/common/BasicSteps.java`
#### Snippet
```java
        String assertErrorName = stepData.contains(ASSERT_ERROR_NAME) ? (String) stepData.get(ASSERT_ERROR_NAME) : "Unknown";
        boolean assertErrorCaught = stepData.contains(ASSERT_ERROR_CAUGHT) ? (boolean) stepData.get(ASSERT_ERROR_CAUGHT) : false;
        Assert.assertTrue(String.format("Assert error was expected but was not raised.", assertErrorName), assertErrorCaught);
    }

```

### MalformedFormatString
Too many arguments for format string (found: 1, expected: 0)
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/simulation/Configuration.java`
#### Snippet
```java
        private void validate(final List<Exception> violations) {
            if (this.period <= 0) {
                violations.add(new IllegalArgumentException(String.format("Scheduler period must be greater than zero: ", this.period)));
            }
        }
```

## RuleId[id=IfStatementWithIdenticalBranches]
### IfStatementWithIdenticalBranches
Common part can be extracted from 'if'
in `service/account/test-steps/src/main/java/org/eclipse/kapua/service/account/steps/AccountServiceSteps.java`
#### Snippet
```java
        try {
            Account tmpAccount = (Account) stepData.get(LAST_ACCOUNT);
            if (tmpAccount != null) {
                accId = tmpAccount.getId();
                scopeId = SYS_SCOPE_ID;
```

## RuleId[id=UnnecessarySuperQualifier]
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `service/datastore/internal/src/main/java/org/eclipse/kapua/service/datastore/internal/model/metric/IntMetric.java`
#### Snippet
```java
    @Override
    public int compareTo(Integer o) {
        return super.getValue().compareTo(o);
    }
}
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `rest-api/core/src/main/java/org/eclipse/kapua/app/api/core/model/DateParam.java`
#### Snippet
```java
        if (!Strings.isNullOrEmpty(stringDate)) {
            try {
                setDate(super.unmarshal(stringDate));
            } catch (IllegalArgumentException e) {
                throw new KapuaIllegalArgumentException("date", stringDate);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `rest-api/core/src/main/java/org/eclipse/kapua/app/api/core/model/ByteArrayParam.java`
#### Snippet
```java
     */
    public ByteArrayParam(@Nullable String base64encoded) {
        value = super.unmarshal(base64encoded);
    }

```

## RuleId[id=SlowListContainsAll]
### SlowListContainsAll
Call to 'list.containsAll(collection)' may have poor performance
in `commons/src/main/java/org/eclipse/kapua/commons/event/ServiceInspector.java`
#### Snippet
```java
                List<Class<?>> candidateParamTypes = Arrays.asList(method.getParameterTypes());

                if (candidateParamTypes.size() != methodParamTypes.size() || !candidateParamTypes.containsAll(methodParamTypes)) {
                    continue;
                }
```

## RuleId[id=CodeBlock2Expr]
### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `qa/common/src/main/java/org/eclipse/kapua/qa/common/SimulatedDeviceSteps.java`
#### Snippet
```java
    @Then("The download state changes to {string} in the next {int} second(s)")
    public void assertDownloadState(final String state, int waitSeconds) throws Exception {
        session.withLogin(() -> {
            With.withUserAccount(currentDevice.getAccountName(), account -> {
                With.withDevice(account, currentDevice.getClientId(), device -> {
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `qa/common/src/main/java/org/eclipse/kapua/qa/common/SimulatedDeviceSteps.java`
#### Snippet
```java
    public void assertDownloadState(final String state, int waitSeconds) throws Exception {
        session.withLogin(() -> {
            With.withUserAccount(currentDevice.getAccountName(), account -> {
                With.withDevice(account, currentDevice.getClientId(), device -> {
                    final DevicePackageManagementService service = KapuaLocator.getInstance().getService(DevicePackageManagementService.class);
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `qa/common/src/main/java/org/eclipse/kapua/qa/common/SimulatedDeviceSteps.java`
#### Snippet
```java
    @Then("Device {string} for account {string} is not registered after {int} seconds")
    public void deviceIsNotRegistered(final String clientId, final String accountName, final int timeout) throws Exception {
        Wait.assertFor("Wait for connection state to become " + DeviceConnectionStatus.DISCONNECTED, Duration.ofSeconds(timeout), defaultPeriod, () -> {
            session.withLogin(() -> {
                assertConnectionStatus(clientId, accountName, DeviceConnectionStatus.DISCONNECTED);
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `qa/common/src/main/java/org/eclipse/kapua/qa/common/SimulatedDeviceSteps.java`
#### Snippet
```java
    public void deviceIsNotRegistered(final String clientId, final String accountName, final int timeout) throws Exception {
        Wait.assertFor("Wait for connection state to become " + DeviceConnectionStatus.DISCONNECTED, Duration.ofSeconds(timeout), defaultPeriod, () -> {
            session.withLogin(() -> {
                assertConnectionStatus(clientId, accountName, DeviceConnectionStatus.DISCONNECTED);
            });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `qa/common/src/main/java/org/eclipse/kapua/qa/common/SimulatedDeviceSteps.java`
#### Snippet
```java
    @When("I start the bundle {string} with version {string}")
    public void startBundle(final String bundleSymbolicName, final String version) throws Exception {
        session.withLogin(() -> {
            With.withUserAccount(currentDevice.getAccountName(), account -> {
                With.withDevice(account, currentDevice.getClientId(), device -> {
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `qa/common/src/main/java/org/eclipse/kapua/qa/common/SimulatedDeviceSteps.java`
#### Snippet
```java
    public void startBundle(final String bundleSymbolicName, final String version) throws Exception {
        session.withLogin(() -> {
            With.withUserAccount(currentDevice.getAccountName(), account -> {
                With.withDevice(account, currentDevice.getClientId(), device -> {
                    DeviceBundle bundle = findBundle(bundleSymbolicName, version);
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `qa/common/src/main/java/org/eclipse/kapua/qa/common/SimulatedDeviceSteps.java`
#### Snippet
```java
    @When("I stop the bundle {string} with version {string}")
    public void stopBundle(final String bundleSymbolicName, final String version) throws Exception {
        session.withLogin(() -> {
            With.withUserAccount(currentDevice.getAccountName(), account -> {
                With.withDevice(account, currentDevice.getClientId(), device -> {
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `qa/common/src/main/java/org/eclipse/kapua/qa/common/SimulatedDeviceSteps.java`
#### Snippet
```java
    public void stopBundle(final String bundleSymbolicName, final String version) throws Exception {
        session.withLogin(() -> {
            With.withUserAccount(currentDevice.getAccountName(), account -> {
                With.withDevice(account, currentDevice.getClientId(), device -> {
                    DeviceBundle bundle = findBundle(bundleSymbolicName, version);
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `qa/common/src/main/java/org/eclipse/kapua/qa/common/SimulatedDeviceSteps.java`
#### Snippet
```java
    @When("I fetch the package states")
    public void fetchPackagesState() throws Exception {
        session.withLogin(() -> {
            With.withUserAccount(currentDevice.getAccountName(), account -> {
                With.withDevice(account, currentDevice.getClientId(), device -> {
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `qa/common/src/main/java/org/eclipse/kapua/qa/common/SimulatedDeviceSteps.java`
#### Snippet
```java
    public void fetchPackagesState() throws Exception {
        session.withLogin(() -> {
            With.withUserAccount(currentDevice.getAccountName(), account -> {
                With.withDevice(account, currentDevice.getClientId(), device -> {
                    final DevicePackageManagementService service = KapuaLocator.getInstance().getService(DevicePackageManagementService.class);
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `qa/common/src/main/java/org/eclipse/kapua/qa/common/SimulatedDeviceSteps.java`
#### Snippet
```java
    @When("I fetch the bundle states")
    public void fetchBundlesState() throws Exception {
        session.withLogin(() -> {
            With.withUserAccount(currentDevice.getAccountName(), account -> {
                With.withDevice(account, currentDevice.getClientId(), device -> {
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `qa/common/src/main/java/org/eclipse/kapua/qa/common/SimulatedDeviceSteps.java`
#### Snippet
```java
    public void fetchBundlesState() throws Exception {
        session.withLogin(() -> {
            With.withUserAccount(currentDevice.getAccountName(), account -> {
                With.withDevice(account, currentDevice.getClientId(), device -> {
                    DeviceBundleManagementService service = KapuaLocator.getInstance().getService(DeviceBundleManagementService.class);
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `qa/common/src/main/java/org/eclipse/kapua/qa/common/SimulatedDeviceSteps.java`
#### Snippet
```java
    @Then("Device {string} for account {string} is registered after {int} seconds")
    public void deviceIsRegistered(final String clientId, final String accountName, final int timeout) throws Exception {
        Wait.assertFor("Wait for connection state to become " + DeviceConnectionStatus.CONNECTED, Duration.ofSeconds(timeout), defaultPeriod, () -> {
            session.withLogin(() -> {
                assertConnectionStatus(clientId, accountName, DeviceConnectionStatus.CONNECTED);
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `qa/common/src/main/java/org/eclipse/kapua/qa/common/SimulatedDeviceSteps.java`
#### Snippet
```java
    public void deviceIsRegistered(final String clientId, final String accountName, final int timeout) throws Exception {
        Wait.assertFor("Wait for connection state to become " + DeviceConnectionStatus.CONNECTED, Duration.ofSeconds(timeout), defaultPeriod, () -> {
            session.withLogin(() -> {
                assertConnectionStatus(clientId, accountName, DeviceConnectionStatus.CONNECTED);
            });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `qa/common/src/main/java/org/eclipse/kapua/qa/common/SimulatedDeviceSteps.java`
#### Snippet
```java
    public void checkDeviceInformation() throws Exception {
        final String clientId = currentDevice.getClientId();
        session.withLogin(() -> {
            With.withUserAccount(currentDevice.getAccountName(), account -> {
                With.withDevice(account, clientId, device -> {
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `qa/common/src/main/java/org/eclipse/kapua/qa/common/SimulatedDeviceSteps.java`
#### Snippet
```java
        final String clientId = currentDevice.getClientId();
        session.withLogin(() -> {
            With.withUserAccount(currentDevice.getAccountName(), account -> {
                With.withDevice(account, clientId, device -> {

```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `qa/common/src/main/java/org/eclipse/kapua/qa/common/SimulatedDeviceSteps.java`
#### Snippet
```java
    @Then("I expect the device to report the applications")
    public void checkApplications(final List<String> applications) throws Exception {
        session.withLogin(() -> {
            With.withUserAccount(currentDevice.getAccountName(), account -> {
                With.withDevice(account, currentDevice.getClientId(), device -> {
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `qa/common/src/main/java/org/eclipse/kapua/qa/common/SimulatedDeviceSteps.java`
#### Snippet
```java
    public void checkApplications(final List<String> applications) throws Exception {
        session.withLogin(() -> {
            With.withUserAccount(currentDevice.getAccountName(), account -> {
                With.withDevice(account, currentDevice.getClientId(), device -> {
                    final Set<String> apps = new HashSet<>(Arrays.asList(device.getApplicationIdentifiers().split(",")));
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `qa/common/src/main/java/org/eclipse/kapua/qa/common/SimulatedDeviceSteps.java`
#### Snippet
```java
    @When("I start to download package {string} with version {string} from {string}")
    public void downloadPackage(final String packageName, final String version, final String uri) throws Exception {
        session.withLogin(() -> {
            With.withUserAccount(currentDevice.getAccountName(), account -> {
                With.withDevice(account, currentDevice.getClientId(), device -> {
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `qa/common/src/main/java/org/eclipse/kapua/qa/common/SimulatedDeviceSteps.java`
#### Snippet
```java
    public void downloadPackage(final String packageName, final String version, final String uri) throws Exception {
        session.withLogin(() -> {
            With.withUserAccount(currentDevice.getAccountName(), account -> {
                With.withDevice(account, currentDevice.getClientId(), device -> {
                    final DevicePackageManagementService service = KapuaLocator.getInstance().getService(DevicePackageManagementService.class);
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `client/gateway/profile/kura/src/main/java/org/eclipse/kapua/client/gateway/kura/KuraBirthCertificateModule.java`
#### Snippet
```java

        this.client = client.orElseThrow(() -> {
            return new IllegalStateException(
                    String.format("%s can only be used with a client providing an instance to %s",
                            KuraBirthCertificateModule.class.getSimpleName(),
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `qa/integration-steps/src/main/java/org/eclipse/kapua/qa/integration/steps/DockerSteps.java`
#### Snippet
```java
                logger.info("Cannot remove container '{}'. (Container not found!)", name);
            } else {
                containers.forEach(container -> {
                    container.names().forEach((containerName) -> {
                        if (containerName.equals(name)) {
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `qa/integration-steps/src/main/java/org/eclipse/kapua/qa/integration/steps/DockerSteps.java`
#### Snippet
```java
            List<Container> containerList = DockerUtil.getDockerClient().listContainers(ListContainersParam.allContainers());
            count = containerList.size();
            containerList.forEach(container -> {
                container.names().forEach((containerName) -> logger.info("\t\t{}", containerName));
            });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `client/gateway/spi/src/main/java/org/eclipse/kapua/client/gateway/spi/util/TransportProxy.java`
#### Snippet
```java

    private void fireEvent(final boolean state, final Set<Listener> listeners) {
        executor.execute(() -> {
            listeners.stream().forEach(l -> l.stateChange(state));
        });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `client/gateway/provider/paho/src/main/java/org/eclipse/kapua/client/gateway/mqtt/paho/PahoChannel.java`
#### Snippet
```java
    private void handleResubscribe() {
        for (final Map.Entry<String, MqttMessageHandler> entry : subscriptions.entrySet()) {
            internalSubscribe(entry.getKey()).whenComplete((value, ex) -> {
                logger.warn("Failed to re-subscribe to '{}'", entry.getKey(), ex);
            });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `service/job/test-steps/src/main/java/org/eclipse/kapua/service/job/steps/JobExecutionServiceSteps.java`
#### Snippet
```java
            } else {
                LOG.info("Job execution list size {}", jobExecutionList.getSize());
                jobExecutionList.getItems().forEach(jobExecutionTmp -> {
                    LOG.info("    s: {} - e: {} - log: {}", jobExecutionTmp.getStartedOn(), jobExecutionTmp.getEndedOn(), jobExecutionTmp.getLog());
                });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `commons/src/main/java/org/eclipse/kapua/commons/event/RaiseServiceEventInterceptor.java`
#### Snippet
```java
                serviceEventBus.setStatus(newServiceEventStatus);
                ((AbstractKapuaService) invocation.getThis()).getEntityManagerSession().doTransactedAction(EntityManagerContainer.<EventStoreRecord>create().onResultHandler(em -> {
                    return EventStoreDAO.update(em,
                            ServiceEventUtil.mergeToEntity(EventStoreDAO.find(em, serviceEventBus.getScopeId(), KapuaEid.parseCompactId(serviceEventBus.getId())), serviceEventBus));
                }));
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `job-engine/jbatch/src/main/java/org/eclipse/kapua/job/engine/jbatch/driver/JbatchDriver.java`
#### Snippet
```java
        // Do stop
        try {
            runningExecutions.forEach((runningExecution -> {
                JOB_OPERATOR.stop(runningExecution.getExecutionId());
            }));
```

## RuleId[id=UseOfPropertiesAsHashtable]
### UseOfPropertiesAsHashtable
Call to `Hashtable.get()` on properties object
in `job-engine/jbatch/src/main/java/org/eclipse/kapua/job/engine/jbatch/driver/JbatchDriver.java`
#### Snippet
```java
        org.eclipse.kapua.service.job.execution.JobExecution je = JOB_EXECUTION_SERVICE.find(scopeId, toResumeJobExecutionId);

        long toResumeJbatchExecutionId = Long.parseLong((String) je.getEntityAttributes().get(JBATCH_EXECUTION_ID));

        stoppedJobExecutions = stoppedJobExecutions.stream().filter(re -> re.getExecutionId() == toResumeJbatchExecutionId).collect(Collectors.toList());
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.get()` on properties object
in `job-engine/jbatch/src/main/java/org/eclipse/kapua/job/engine/jbatch/driver/JbatchDriver.java`
#### Snippet
```java
            org.eclipse.kapua.service.job.execution.JobExecution je = JOB_EXECUTION_SERVICE.find(scopeId, toStopJobExecutionId);

            long toStopJbatchExecutionId = Long.parseLong((String) je.getEntityAttributes().get(JBATCH_EXECUTION_ID));

            runningExecutions = runningExecutions.stream().filter(re -> re.getExecutionId() == toStopJbatchExecutionId).collect(Collectors.toList());
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.get()` on properties object
in `job-engine/commons/src/main/java/org/eclipse/kapua/job/engine/commons/wrappers/JobContextWrapper.java`
#### Snippet
```java
     */
    public KapuaId getKapuaExecutionId() {
        return (KapuaId) getProperties().get(JobContextPropertyNames.KAPUA_EXECUTION_ID);
    }

```

## RuleId[id=EmptyMethod]
### EmptyMethod
Method only calls its super
in `broker/api/src/main/java/org/eclipse/kapua/broker/BrokerDomain.java`
#### Snippet
```java

    @Override
    public int hashCode() {
        return super.hashCode();
    }
```

### EmptyMethod
The method is empty
in `client/gateway/api/src/main/java/org/eclipse/kapua/client/gateway/util/Errors.java`
#### Snippet
```java
    }

    public static void ignore(final Throwable e, final Optional<Payload> payload) {
        // Ignore the error
    }
```

### EmptyMethod
The method is empty
in `consumer/lifecycle-app/src/main/java/org/eclipse/kapua/consumer/lifecycle/LifecycleApplication.java`
#### Snippet
```java
    }

    public void doNothing() {
        //spring needs a public constructor but our checkstyle doesn't allow a class with only static methods and a public constructor
    }
```

### EmptyMethod
The method is empty
in `consumer/telemetry-app/src/main/java/org/eclipse/kapua/consumer/telemetry/TelemetryApplication.java`
#### Snippet
```java
    }

    public void doNothing() {
        //spring needs a public constructor but our checkstyle doesn't allow a class with only static methods and a public constructor
    }
```

### EmptyMethod
All implementations of this method are empty
in `service/datastore/internal/src/main/java/org/eclipse/kapua/service/datastore/internal/mediator/ChannelInfoRegistryMediator.java`
#### Snippet
```java
     * @throws ClientException
     */
    void onBeforeChannelInfoDelete(ChannelInfo channelInfo)
            throws KapuaIllegalArgumentException,
            ConfigurationException,
```

### EmptyMethod
All implementations of this method are empty
in `service/datastore/internal/src/main/java/org/eclipse/kapua/service/datastore/internal/mediator/ChannelInfoRegistryMediator.java`
#### Snippet
```java
     * @param channelInfo
     */
    void onAfterChannelInfoDelete(ChannelInfo channelInfo);
}

```

### EmptyMethod
All implementations of this method are empty
in `service/datastore/internal/src/main/java/org/eclipse/kapua/service/datastore/internal/mediator/ClientInfoRegistryMediator.java`
#### Snippet
```java
     * @throws ClientException
     */
    void onAfterClientInfoDelete(KapuaId scopeId, ClientInfo clientInfo)
            throws KapuaIllegalArgumentException,
            ConfigurationException,
```

### EmptyMethod
All implementations of this method are empty
in `service/datastore/internal/src/main/java/org/eclipse/kapua/service/datastore/internal/mediator/MetricInfoRegistryMediator.java`
#### Snippet
```java
     * @throws ClientException
     */
    void onAfterMetricInfoDelete(KapuaId scopeId, MetricInfo metricInfo) throws ClientException;
}

```

### EmptyMethod
All implementations of this method are empty
in `service/device/management/api/src/main/java/org/eclipse/kapua/service/device/management/app/settings/ByDeviceAppManagementSettingsService.java`
#### Snippet
```java
     * @since 2.0.0
     */
    void setApplicationSettings(KapuaId scopeId, KapuaId deviceId, C deviceApplicationSettings) throws KapuaException;

    /**
```

### EmptyMethod
All implementations of this method are empty
in `service/device/management/asset-store/api/src/main/java/org/eclipse/kapua/service/device/management/asset/store/DeviceAssetStoreService.java`
#### Snippet
```java
     * @since 2.0.0
     */
    void storeAssetValues(KapuaDataMessage message) throws KapuaException;

    /**
```

### EmptyMethod
All implementations of this method are empty
in `service/device/management/asset-store/api/src/main/java/org/eclipse/kapua/service/device/management/asset/store/DeviceAssetStoreService.java`
#### Snippet
```java
     * @since 2.0.0
     */
    void storeAssetsValues(KapuaId scopeId, KapuaId deviceId, DeviceAssets deviceAssets) throws KapuaException;

    /**
```

### EmptyMethod
All implementations of this method are empty
in `service/device/management/asset-store/api/src/main/java/org/eclipse/kapua/service/device/management/asset/store/DeviceAssetStoreService.java`
#### Snippet
```java
     * @since 2.0.0
     */
    void storeAssets(KapuaId scopeId, KapuaId deviceId, DeviceAssets deviceAssets) throws KapuaException;

    /**
```

### EmptyMethod
All implementations of this method are empty
in `service/device/management/configuration-store/api/src/main/java/org/eclipse/kapua/service/device/management/configuration/store/DeviceConfigurationStoreService.java`
#### Snippet
```java
     * @since 2.0.0
     */
    void storeConfigurations(KapuaId scopeId, KapuaId deviceId, DeviceConfiguration deviceConfiguration) throws KapuaException;

    /**
```

### EmptyMethod
All implementations of this method are empty
in `service/device/management/configuration-store/api/src/main/java/org/eclipse/kapua/service/device/management/configuration/store/DeviceConfigurationStoreService.java`
#### Snippet
```java
     * @since 2.0.0
     */
    void storeConfigurations(KapuaId scopeId, KapuaId deviceId, DeviceComponentConfiguration deviceComponentConfiguration) throws KapuaException;

    /**
```

### EmptyMethod
Method only calls its super
in `service/device/management/request/internal/src/main/java/org/eclipse/kapua/service/device/management/request/internal/GenericAppProperties.java`
#### Snippet
```java

    @Override
    public String getValue() {
        return super.getValue();
    }
```

### EmptyMethod
The method is empty
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/app/AbstractDefaultApplication.java`
#### Snippet
```java
    }

    protected void close() throws Exception {
    }

```

## RuleId[id=RedundantImplements]
### RedundantImplements
Redundant interface declaration `EntityManagerFactory`
in `service/user/internal/src/main/java/org/eclipse/kapua/service/user/internal/UserEntityManagerFactory.java`
#### Snippet
```java
 * @since 1.0.0
 */
public class UserEntityManagerFactory extends AbstractEntityManagerFactory implements EntityManagerFactory {

    private static final String PERSISTENCE_UNIT_NAME = "kapua-user";
```

### RedundantImplements
Redundant interface declaration `EntityManagerFactory`
in `service/device/management/registry/internal/src/main/java/org/eclipse/kapua/service/device/management/registry/operation/internal/DeviceManagementOperationEntityManagerFactory.java`
#### Snippet
```java
 * @since 1.1.0
 */
public class DeviceManagementOperationEntityManagerFactory extends AbstractEntityManagerFactory implements EntityManagerFactory {

    private static final String PERSISTENCE_UNIT_NAME = "kapua-device_management_operation_registry";
```

### RedundantImplements
Redundant interface declaration `KapuaRequestChannel`
in `service/device/management/keystore/internal/src/main/java/org/eclipse/kapua/service/device/management/keystore/internal/message/request/KeystoreRequestChannel.java`
#### Snippet
```java
 * @since 1.5.0
 */
public class KeystoreRequestChannel extends KapuaRequestChannelImpl implements KapuaRequestChannel {

    private static final long serialVersionUID = 9127157971609776985L;
```

### RedundantImplements
Redundant interface declaration `KapuaResponseMessage`
in `service/device/management/keystore/internal/src/main/java/org/eclipse/kapua/service/device/management/keystore/internal/message/response/KeystoreResponseMessage.java`
#### Snippet
```java
 */
public class KeystoreResponseMessage extends KapuaResponseMessageImpl<KeystoreResponseChannel, KeystoreResponsePayload>
        implements KapuaResponseMessage<KeystoreResponseChannel, KeystoreResponsePayload> {

    private static final long serialVersionUID = -1398713049819248123L;
```

### RedundantImplements
Redundant interface declaration `KapuaResponseChannel`
in `service/device/management/keystore/internal/src/main/java/org/eclipse/kapua/service/device/management/keystore/internal/message/response/KeystoreResponseChannel.java`
#### Snippet
```java
 * @since 1.5.0
 */
public class KeystoreResponseChannel extends KapuaResponseChannelImpl implements KapuaResponseChannel {

    private static final long serialVersionUID = 6073193292259010928L;
```

### RedundantImplements
Redundant interface declaration `KapuaResponsePayload`
in `service/device/management/keystore/internal/src/main/java/org/eclipse/kapua/service/device/management/keystore/internal/message/response/KeystoreResponsePayload.java`
#### Snippet
```java
 * @since 1.5.0
 */
public class KeystoreResponsePayload extends KapuaResponsePayloadImpl implements KapuaResponsePayload {

    private static final long serialVersionUID = 4380715272822080425L;
```

### RedundantImplements
Redundant interface declaration `Domain`
in `service/job/api/src/main/java/org/eclipse/kapua/service/job/JobDomain.java`
#### Snippet
```java
 * @since 1.0.0
 */
public class JobDomain extends AbstractDomain implements Domain {

    private final String name = "job";
```

### RedundantImplements
Redundant interface declaration `EntityManagerFactory`
in `service/account/internal/src/main/java/org/eclipse/kapua/service/account/internal/AccountEntityManagerFactory.java`
#### Snippet
```java
 * @since 1.0.0
 */
public class AccountEntityManagerFactory extends AbstractEntityManagerFactory implements EntityManagerFactory {

    private static final String PERSISTENCE_UNIT_NAME = "kapua-account";
```

### RedundantImplements
Redundant interface declaration `ServiceModule`
in `service/account/internal/src/main/java/org/eclipse/kapua/service/account/internal/AccountServiceModule.java`
#### Snippet
```java
 * @since 1.0.0
 */
public class AccountServiceModule extends ServiceEventModule implements ServiceModule {

    private static final KapuaAccountSetting ACCOUNT_SETTING = KapuaAccountSetting.getInstance();
```

### RedundantImplements
Redundant interface declaration `Module`
in `service/account/internal/src/main/java/org/eclipse/kapua/service/account/internal/AccountModule.java`
#### Snippet
```java
 * @since 2.0.0
 */
public class AccountModule extends AbstractKapuaModule implements Module {

    @Override
```

### RedundantImplements
Redundant interface declaration `CacheFactory`
in `service/account/internal/src/main/java/org/eclipse/kapua/service/account/internal/AccountCacheFactory.java`
#### Snippet
```java
 * @since 1.2.0
 */
public class AccountCacheFactory extends AbstractNamedEntityCacheFactory implements CacheFactory {

    /**
```

### RedundantImplements
Redundant interface declaration `KapuaResponseChannel`
in `service/device/management/command/internal/src/main/java/org/eclipse/kapua/service/device/management/command/message/internal/CommandResponseChannel.java`
#### Snippet
```java
 * @since 1.0.0
 */
public class CommandResponseChannel extends KapuaResponseChannelImpl implements KapuaResponseChannel {

    private static final long serialVersionUID = 1788983749020930113L;
```

### RedundantImplements
Redundant interface declaration `KapuaResponseMessage`
in `service/device/management/command/internal/src/main/java/org/eclipse/kapua/service/device/management/command/message/internal/CommandResponseMessage.java`
#### Snippet
```java
 */
public class CommandResponseMessage extends KapuaResponseMessageImpl<CommandResponseChannel, CommandResponsePayload>
        implements KapuaResponseMessage<CommandResponseChannel, CommandResponsePayload> {

    private static final long serialVersionUID = 3140375090327226295L;
```

### RedundantImplements
Redundant interface declaration `KapuaRequestChannel`
in `service/device/management/command/internal/src/main/java/org/eclipse/kapua/service/device/management/command/message/internal/CommandRequestChannel.java`
#### Snippet
```java
 * @since 1.0.0
 */
public class CommandRequestChannel extends KapuaRequestChannelImpl implements KapuaRequestChannel {

    private static final long serialVersionUID = 2526647955273510036L;
```

### RedundantImplements
Redundant interface declaration `KapuaResponsePayload`
in `service/device/management/command/internal/src/main/java/org/eclipse/kapua/service/device/management/command/message/internal/CommandResponsePayload.java`
#### Snippet
```java
 * @since 1.0.0
 */
public class CommandResponsePayload extends KapuaResponsePayloadImpl implements KapuaResponsePayload {

    private static final long serialVersionUID = -7611654604657980851L;
```

### RedundantImplements
Redundant interface declaration `TargetProcessor`
in `service/device/management/bundle/job/src/main/java/org/eclipse/kapua/service/device/management/bundle/job/DeviceBundleStartTargetProcessor.java`
#### Snippet
```java
 * @since 1.0.0
 */
public class DeviceBundleStartTargetProcessor extends AbstractDeviceTargetProcessor implements TargetProcessor {
    private static final KapuaLocator LOCATOR = KapuaLocator.getInstance();
    private static final DeviceBundleManagementService BUNDLE_MANAGEMENT_SERVICE = LOCATOR.getService(DeviceBundleManagementService.class);
```

### RedundantImplements
Redundant interface declaration `TargetProcessor`
in `service/device/management/bundle/job/src/main/java/org/eclipse/kapua/service/device/management/bundle/job/DeviceBundleStopTargetProcessor.java`
#### Snippet
```java
 * @since 1.0.0
 */
public class DeviceBundleStopTargetProcessor extends AbstractDeviceTargetProcessor implements TargetProcessor {
    private static final DeviceBundleManagementService BUNDLE_MANAGEMENT_SERVICE = LOCATOR.getService(DeviceBundleManagementService.class);

```

### RedundantImplements
Redundant interface declaration `JobStepDefinition`
in `service/device/management/bundle/job/src/main/java/org/eclipse/kapua/service/device/management/bundle/job/definition/DeviceBundleStopStepDefinition.java`
#### Snippet
```java
import java.util.List;

public class DeviceBundleStopStepDefinition extends AbstractTargetJobStepDefinition implements JobStepDefinition {

    private static final long serialVersionUID = -4994045121586264564L;
```

### RedundantImplements
Redundant interface declaration `JobStepDefinition`
in `service/device/management/bundle/job/src/main/java/org/eclipse/kapua/service/device/management/bundle/job/definition/DeviceBundleStartStepDefinition.java`
#### Snippet
```java
import java.util.List;

public class DeviceBundleStartStepDefinition extends AbstractTargetJobStepDefinition implements JobStepDefinition {

    private static final long serialVersionUID = -4994045121586264564L;
```

### RedundantImplements
Redundant interface declaration `TargetProcessor`
in `service/device/management/keystore/job/src/main/java/org/eclipse/kapua/service/device/management/keystore/job/DeviceKeystoreItemDeleteTargetProcessor.java`
#### Snippet
```java
 * @since 1.0.0
 */
public class DeviceKeystoreItemDeleteTargetProcessor extends AbstractDeviceTargetProcessor implements TargetProcessor {
    private static final DeviceKeystoreManagementService KEYSTORE_MANAGEMENT_SERVICE = LOCATOR.getService(DeviceKeystoreManagementService.class);

```

### RedundantImplements
Redundant interface declaration `TargetProcessor`
in `service/device/management/keystore/job/src/main/java/org/eclipse/kapua/service/device/management/keystore/job/DeviceKeystoreCertificateCreateTargetProcessor.java`
#### Snippet
```java
 * @since 1.0.0
 */
public class DeviceKeystoreCertificateCreateTargetProcessor extends AbstractDeviceTargetProcessor implements TargetProcessor {
    private static final DeviceKeystoreManagementService KEYSTORE_MANAGEMENT_SERVICE = LOCATOR.getService(DeviceKeystoreManagementService.class);
    private static final DeviceKeystoreManagementFactory KEYSTORE_MANAGEMENT_FACTORY = LOCATOR.getFactory(DeviceKeystoreManagementFactory.class);
```

### RedundantImplements
Redundant interface declaration `TargetProcessor`
in `service/device/management/keystore/job/src/main/java/org/eclipse/kapua/service/device/management/keystore/job/DeviceKeystoreKeypairCreateTargetProcessor.java`
#### Snippet
```java
 * @since 1.0.0
 */
public class DeviceKeystoreKeypairCreateTargetProcessor extends AbstractDeviceTargetProcessor implements TargetProcessor {
    private static final DeviceKeystoreManagementService KEYSTORE_MANAGEMENT_SERVICE = LOCATOR.getService(DeviceKeystoreManagementService.class);
    private static final DeviceKeystoreManagementFactory KEYSTORE_MANAGEMENT_FACTORY = LOCATOR.getFactory(DeviceKeystoreManagementFactory.class);
```

### RedundantImplements
Redundant interface declaration `KapuaResponseMessage`
in `service/device/management/configuration/internal/src/main/java/org/eclipse/kapua/service/device/management/snapshot/message/internal/SnapshotResponseMessage.java`
#### Snippet
```java
 */
public class SnapshotResponseMessage extends KapuaResponseMessageImpl<SnapshotResponseChannel, SnapshotResponsePayload>
        implements KapuaResponseMessage<SnapshotResponseChannel, SnapshotResponsePayload> {

    private static final long serialVersionUID = 4622573069731164789L;
```

### RedundantImplements
Redundant interface declaration `KapuaRequestChannel`
in `service/device/management/configuration/internal/src/main/java/org/eclipse/kapua/service/device/management/snapshot/message/internal/SnapshotRequestChannel.java`
#### Snippet
```java
 * @since 1.0.0
 */
public class SnapshotRequestChannel extends KapuaRequestChannelImpl implements KapuaRequestChannel {

    private static final long serialVersionUID = 7526183410364623630L;
```

### RedundantImplements
Redundant interface declaration `KapuaResponseChannel`
in `service/device/management/configuration/internal/src/main/java/org/eclipse/kapua/service/device/management/snapshot/message/internal/SnapshotResponseChannel.java`
#### Snippet
```java
 * @since 1.0.0
 */
public class SnapshotResponseChannel extends KapuaResponseChannelImpl implements KapuaResponseChannel {

    private static final long serialVersionUID = 7158015970265346958L;
```

### RedundantImplements
Redundant interface declaration `KapuaResponsePayload`
in `service/device/management/configuration/internal/src/main/java/org/eclipse/kapua/service/device/management/snapshot/message/internal/SnapshotResponsePayload.java`
#### Snippet
```java
 * @since 1.0.0
 */
public class SnapshotResponsePayload extends KapuaResponsePayloadImpl implements KapuaResponsePayload {

    private static final long serialVersionUID = -5650474443429208877L;
```

### RedundantImplements
Redundant interface declaration `KapuaRequestChannel`
in `service/device/management/configuration/internal/src/main/java/org/eclipse/kapua/service/device/management/configuration/message/internal/ConfigurationRequestChannel.java`
#### Snippet
```java
 * @since 1.0.0
 */
public class ConfigurationRequestChannel extends KapuaRequestChannelImpl implements KapuaRequestChannel {

    private static final long serialVersionUID = 4679870909531884966L;
```

### RedundantImplements
Redundant interface declaration `KapuaResponseMessage`
in `service/device/management/configuration/internal/src/main/java/org/eclipse/kapua/service/device/management/configuration/message/internal/ConfigurationResponseMessage.java`
#### Snippet
```java
 */
public class ConfigurationResponseMessage extends KapuaResponseMessageImpl<ConfigurationResponseChannel, ConfigurationResponsePayload>
        implements KapuaResponseMessage<ConfigurationResponseChannel, ConfigurationResponsePayload> {

    private static final long serialVersionUID = -211188083735456147L;
```

### RedundantImplements
Redundant interface declaration `KapuaResponseChannel`
in `service/device/management/configuration/internal/src/main/java/org/eclipse/kapua/service/device/management/configuration/message/internal/ConfigurationResponseChannel.java`
#### Snippet
```java
 * @since 1.0.0
 */
public class ConfigurationResponseChannel extends KapuaResponseChannelImpl implements KapuaResponseChannel {

    private static final long serialVersionUID = 2881485478711936989L;
```

### RedundantImplements
Redundant interface declaration `KapuaResponsePayload`
in `service/device/management/configuration/internal/src/main/java/org/eclipse/kapua/service/device/management/configuration/message/internal/ConfigurationResponsePayload.java`
#### Snippet
```java
 * @since 1.0.0
 */
public class ConfigurationResponsePayload extends KapuaResponsePayloadImpl implements KapuaResponsePayload {

    private static final Logger LOG = LoggerFactory.getLogger(ConfigurationResponsePayload.class);
```

### RedundantImplements
Redundant interface declaration `EntityManagerFactory`
in `service/scheduler/quartz/src/main/java/org/eclipse/kapua/service/scheduler/quartz/SchedulerEntityManagerFactory.java`
#### Snippet
```java
 * @since 1.0.0
 */
public class SchedulerEntityManagerFactory extends AbstractEntityManagerFactory implements EntityManagerFactory {

    private static final String PERSISTENCE_UNIT_NAME = "kapua-scheduler";
```

### RedundantImplements
Redundant interface declaration `JobStepDefinition`
in `service/device/management/packages/job/src/main/java/org/eclipse/kapua/service/device/management/packages/job/definition/DevicePackagesDownloadStepDefinition.java`
#### Snippet
```java
import java.util.List;

public class DevicePackagesDownloadStepDefinition extends AbstractTargetJobStepDefinition implements JobStepDefinition {

    private static final long serialVersionUID = -4994045121586264564L;
```

### RedundantImplements
Redundant interface declaration `TargetProcessor`
in `service/device/management/packages/job/src/main/java/org/eclipse/kapua/service/device/management/packages/job/DevicePackageDownloadTargetProcessor.java`
#### Snippet
```java
 * @since 1.0.0
 */
public class DevicePackageDownloadTargetProcessor extends AbstractDevicePackageTargetProcessor implements TargetProcessor {
    private static final KapuaLocator LOCATOR = KapuaLocator.getInstance();
    private static final DevicePackageManagementService PACKAGES_MANAGEMENT_SERVICE = LOCATOR.getService(DevicePackageManagementService.class);
```

### RedundantImplements
Redundant interface declaration `TargetProcessor`
in `service/device/management/packages/job/src/main/java/org/eclipse/kapua/service/device/management/packages/job/DevicePackageUninstallTargetProcessor.java`
#### Snippet
```java
 * @since 1.0.0
 */
public class DevicePackageUninstallTargetProcessor extends AbstractDevicePackageTargetProcessor implements TargetProcessor {
    private static final KapuaLocator LOCATOR = KapuaLocator.getInstance();
    private static final DevicePackageManagementService PACKAGES_MANAGEMENT_SERVICE = LOCATOR.getService(DevicePackageManagementService.class);
```

### RedundantImplements
Redundant interface declaration `KapuaResponseMessage`
in `service/device/management/asset/internal/src/main/java/org/eclipse/kapua/service/device/management/asset/message/internal/AssetResponseMessage.java`
#### Snippet
```java
 */
public class AssetResponseMessage extends KapuaResponseMessageImpl<AssetResponseChannel, AssetResponsePayload>
        implements KapuaResponseMessage<AssetResponseChannel, AssetResponsePayload> {

    private static final long serialVersionUID = -2842458086421864159L;
```

### RedundantImplements
Redundant interface declaration `JobStepDefinition`
in `service/device/management/packages/job/src/main/java/org/eclipse/kapua/service/device/management/packages/job/definition/DevicePackagesUninstallStepDefinition.java`
#### Snippet
```java
import java.util.List;

public class DevicePackagesUninstallStepDefinition extends AbstractTargetJobStepDefinition implements JobStepDefinition {

    private static final long serialVersionUID = -4994045121586264564L;
```

### RedundantImplements
Redundant interface declaration `KapuaRequestChannel`
in `service/device/management/asset/internal/src/main/java/org/eclipse/kapua/service/device/management/asset/message/internal/AssetRequestChannel.java`
#### Snippet
```java
 * @since 1.0.0
 */
public class AssetRequestChannel extends KapuaRequestChannelImpl implements KapuaRequestChannel {

    private static final long serialVersionUID = -5494940887992355430L;
```

### RedundantImplements
Redundant interface declaration `KapuaResponsePayload`
in `service/device/management/asset/internal/src/main/java/org/eclipse/kapua/service/device/management/asset/message/internal/AssetResponsePayload.java`
#### Snippet
```java
 * @since 1.0.0
 */
public class AssetResponsePayload extends KapuaResponsePayloadImpl implements KapuaResponsePayload {

    private static final long serialVersionUID = -9087980446970521618L;
```

### RedundantImplements
Redundant interface declaration `KapuaResponseChannel`
in `service/device/management/asset/internal/src/main/java/org/eclipse/kapua/service/device/management/asset/message/internal/AssetResponseChannel.java`
#### Snippet
```java
 * @since 1.0.0
 */
public class AssetResponseChannel extends KapuaResponseChannelImpl implements KapuaResponseChannel {

    private static final long serialVersionUID = 2129023762503450624L;
```

### RedundantImplements
Redundant interface declaration `KapuaResponsePayload`
in `service/device/management/asset/internal/src/main/java/org/eclipse/kapua/service/device/management/channel/message/internal/ChannelResponsePayload.java`
#### Snippet
```java
 * @since 1.0.0
 */
public class ChannelResponsePayload extends KapuaResponsePayloadImpl implements KapuaResponsePayload {

    private static final long serialVersionUID = -5663603861926093942L;
```

### RedundantImplements
Redundant interface declaration `TargetProcessor`
in `service/device/management/packages/job/src/main/java/org/eclipse/kapua/service/device/management/packages/job/AbstractDevicePackageTargetProcessor.java`
#### Snippet
```java
 * @since 1.1.0
 */
public abstract class AbstractDevicePackageTargetProcessor extends AbstractDeviceTargetProcessor implements TargetProcessor {
    private static final DeviceManagementOperationRegistryService DEVICE_MANAGEMENT_OPERATION_REGISTRY_SERVICE = LOCATOR.getService(DeviceManagementOperationRegistryService.class);
    private static final JobDeviceManagementOperationService JOB_DEVICE_MANAGEMENT_OPERATION_SERVICE = LOCATOR.getService(JobDeviceManagementOperationService.class);
```

### RedundantImplements
Redundant interface declaration `KapuaResponseChannel`
in `service/device/management/asset/internal/src/main/java/org/eclipse/kapua/service/device/management/channel/message/internal/ChannelResponseChannel.java`
#### Snippet
```java
 * @since 1.0.0
 */
public class ChannelResponseChannel extends KapuaResponseChannelImpl implements KapuaResponseChannel {

    private static final long serialVersionUID = 1138430616245565810L;
```

### RedundantImplements
Redundant interface declaration `KapuaRequestChannel`
in `service/device/management/asset/internal/src/main/java/org/eclipse/kapua/service/device/management/channel/message/internal/ChannelRequestChannel.java`
#### Snippet
```java
 * @since 1.0.0
 */
public class ChannelRequestChannel extends AssetRequestChannel implements KapuaRequestChannel {

    private static final long serialVersionUID = -1578380839404848475L;
```

### RedundantImplements
Redundant interface declaration `KapuaResponseMessage`
in `service/device/management/asset/internal/src/main/java/org/eclipse/kapua/service/device/management/channel/message/internal/ChannelResponseMessage.java`
#### Snippet
```java
 */
public class ChannelResponseMessage extends KapuaResponseMessageImpl<ChannelResponseChannel, ChannelResponsePayload>
        implements KapuaResponseMessage<ChannelResponseChannel, ChannelResponsePayload> {

    private static final long serialVersionUID = 3851995320275868922L;
```

### RedundantImplements
Redundant interface declaration `EntityManagerFactory`
in `service/tag/internal/src/main/java/org/eclipse/kapua/service/tag/internal/TagEntityManagerFactory.java`
#### Snippet
```java
 * @since 1.0.0
 */
public class TagEntityManagerFactory extends AbstractEntityManagerFactory implements EntityManagerFactory {

    private static final String PERSISTENCE_UNIT_NAME = "kapua-tag";
```

### RedundantImplements
Redundant interface declaration `KapuaResponseChannel`
in `service/device/management/packages/internal/src/main/java/org/eclipse/kapua/service/device/management/packages/message/internal/PackageResponseChannel.java`
#### Snippet
```java
 * @since 1.0.0
 */
public class PackageResponseChannel extends KapuaResponseChannelImpl implements KapuaResponseChannel {

    private static final long serialVersionUID = 6807938372603652236L;
```

### RedundantImplements
Redundant interface declaration `KapuaResponseMessage`
in `service/device/management/packages/internal/src/main/java/org/eclipse/kapua/service/device/management/packages/message/internal/PackageResponseMessage.java`
#### Snippet
```java
 */
public class PackageResponseMessage extends KapuaResponseMessageImpl<PackageResponseChannel, PackageResponsePayload>
        implements KapuaResponseMessage<PackageResponseChannel, PackageResponsePayload> {

    private static final long serialVersionUID = 1728387783187306831L;
```

### RedundantImplements
Redundant interface declaration `Cache`>
in `translator/api/src/main/java/org/eclipse/kapua/translator/cache/TranslatorCache.java`
#### Snippet
```java
 * @since 1.2.0
 */
public class TranslatorCache extends LocalCache<TranslatorCacheKey, Translator<?, ?>> implements Cache<TranslatorCacheKey, Translator<?, ?>> {

    private static final TranslatorCache TRANSLATOR_CACHE = new TranslatorCache();
```

### RedundantImplements
Redundant interface declaration `KapuaResponsePayload`
in `service/device/management/packages/internal/src/main/java/org/eclipse/kapua/service/device/management/packages/message/internal/PackageResponsePayload.java`
#### Snippet
```java
 * @since 1.0.0
 */
public class PackageResponsePayload extends KapuaResponsePayloadImpl implements KapuaResponsePayload {

    private static final long serialVersionUID = -2100712552502696907L;
```

### RedundantImplements
Redundant interface declaration `EntityManagerFactory`
in `service/device/registry/internal/src/main/java/org/eclipse/kapua/service/device/registry/internal/DeviceEntityManagerFactory.java`
#### Snippet
```java
 * @since 1.0.0
 */
public class DeviceEntityManagerFactory extends AbstractEntityManagerFactory implements EntityManagerFactory {

    private static final String PERSISTENCE_UNIT_NAME = "kapua-device";
```

### RedundantImplements
Redundant interface declaration `EntityManagerFactory`
in `service/datastore/internal/src/main/java/org/eclipse/kapua/service/datastore/internal/DatastoreEntityManagerFactory.java`
#### Snippet
```java
 * @since 1.0.0
 */
public class DatastoreEntityManagerFactory extends AbstractEntityManagerFactory implements EntityManagerFactory {

    private static final String PERSISTENCE_UNIT_NAME = "kapua-datastore";
```

### RedundantImplements
Redundant interface declaration `Metric`
in `service/datastore/internal/src/main/java/org/eclipse/kapua/service/datastore/internal/model/metric/FloatMetric.java`
#### Snippet
```java
 * @since 1.0
 */
public class FloatMetric extends MetricImpl<Float> implements Metric<Float> {

    /**
```

### RedundantImplements
Redundant interface declaration `Metric`
in `service/datastore/internal/src/main/java/org/eclipse/kapua/service/datastore/internal/model/metric/DoubleMetric.java`
#### Snippet
```java
 * @since 1.0
 */
public class DoubleMetric extends MetricImpl<Double> implements Metric<Double> {

    /**
```

### RedundantImplements
Redundant interface declaration `Metric`
in `service/datastore/internal/src/main/java/org/eclipse/kapua/service/datastore/internal/model/metric/LongMetric.java`
#### Snippet
```java
 * @since 1.0
 */
public class LongMetric extends MetricImpl<Long> implements Metric<Long> {

    /**
```

### RedundantImplements
Redundant interface declaration `Metric`
in `service/datastore/internal/src/main/java/org/eclipse/kapua/service/datastore/internal/model/metric/DateMetric.java`
#### Snippet
```java
 * @since 1.0
 */
public class DateMetric extends MetricImpl<Date> implements Metric<Date> {

    /**
```

### RedundantImplements
Redundant interface declaration `Metric`
in `service/datastore/internal/src/main/java/org/eclipse/kapua/service/datastore/internal/model/metric/StringMetric.java`
#### Snippet
```java
 * @since 1.0
 */
public class StringMetric extends MetricImpl<String> implements Metric<String> {

    /**
```

### RedundantImplements
Redundant interface declaration `Metric`
in `service/datastore/internal/src/main/java/org/eclipse/kapua/service/datastore/internal/model/metric/IntMetric.java`
#### Snippet
```java
 * @since 1.0
 */
public class IntMetric extends MetricImpl<Integer> implements Metric<Integer> {

    /**
```

### RedundantImplements
Redundant interface declaration `Metric`
in `service/datastore/internal/src/main/java/org/eclipse/kapua/service/datastore/internal/model/metric/BinaryMetric.java`
#### Snippet
```java
 * @since 1.0
 */
public class BinaryMetric extends MetricImpl<Byte[]> implements Metric<Byte[]> {

    /**
```

### RedundantImplements
Redundant interface declaration `Metric`
in `service/datastore/internal/src/main/java/org/eclipse/kapua/service/datastore/internal/model/metric/BooleanMetric.java`
#### Snippet
```java
 * @since 1.0
 */
public class BooleanMetric extends MetricImpl<Boolean> implements Metric<Boolean> {

    /**
```

### RedundantImplements
Redundant interface declaration `JobStepDefinition`
in `service/device/management/command/job/src/main/java/org/eclipse/kapua/service/device/management/command/job/definition/DeviceCommandExecStepDefinition.java`
#### Snippet
```java
import java.util.List;

public class DeviceCommandExecStepDefinition extends AbstractTargetJobStepDefinition implements JobStepDefinition {

    private static final long serialVersionUID = -4994045121586264564L;
```

### RedundantImplements
Redundant interface declaration `TargetProcessor`
in `service/device/management/command/job/src/main/java/org/eclipse/kapua/service/device/management/command/job/DeviceCommandExecTargetProcessor.java`
#### Snippet
```java
 * @since 1.0.0
 */
public class DeviceCommandExecTargetProcessor extends AbstractDeviceTargetProcessor implements TargetProcessor {
    private static final DeviceCommandManagementService COMMAND_MANAGEMENT_SERVICE = LOCATOR.getService(DeviceCommandManagementService.class);

```

### RedundantImplements
Redundant interface declaration `EntityManagerFactory`
in `service/endpoint/internal/src/main/java/org/eclipse/kapua/service/endpoint/internal/EndpointEntityManagerFactory.java`
#### Snippet
```java
 * @since 1.0.0
 */
public class EndpointEntityManagerFactory extends AbstractEntityManagerFactory implements EntityManagerFactory {

    private static final String PERSISTENCE_UNIT_NAME = "kapua-endpoint";
```

### RedundantImplements
Redundant interface declaration `EntityManagerFactory`
in `service/security/shiro/src/main/java/org/eclipse/kapua/service/authorization/shiro/AuthorizationEntityManagerFactory.java`
#### Snippet
```java
 * @since 1.0.0
 */
public class AuthorizationEntityManagerFactory extends AbstractEntityManagerFactory implements EntityManagerFactory {

    private static final String PERSISTENCE_UNIT_NAME = "kapua-authorization";
```

### RedundantImplements
Redundant interface declaration `Module`
in `service/security/shiro/src/main/java/org/eclipse/kapua/service/authentication/user/shiro/UserCredentialsModule.java`
#### Snippet
```java
 * @since 2.0.0
 */
public class UserCredentialsModule extends AbstractKapuaModule implements Module {
    @Override
    protected void configureModule() {
```

### RedundantImplements
Redundant interface declaration `EntityManagerFactory`
in `service/security/shiro/src/main/java/org/eclipse/kapua/service/authentication/shiro/AuthenticationEntityManagerFactory.java`
#### Snippet
```java
 * @since 1.0.0
 */
public class AuthenticationEntityManagerFactory extends AbstractEntityManagerFactory implements EntityManagerFactory {

    private static final String PERSISTENCE_UNIT_NAME = "kapua-authentication";
```

### RedundantImplements
Redundant interface declaration `org.apache.shiro.authz.Permission`
in `service/security/shiro/src/main/java/org/eclipse/kapua/service/authorization/permission/shiro/PermissionImpl.java`
#### Snippet
```java
 */
@Embeddable
public class PermissionImpl extends WildcardPermission implements Permission, org.apache.shiro.authz.Permission, Serializable {

    private static final long serialVersionUID = 1480557438886065675L;
```

### RedundantImplements
Redundant interface declaration `Serializable`
in `service/security/shiro/src/main/java/org/eclipse/kapua/service/authorization/permission/shiro/PermissionImpl.java`
#### Snippet
```java
 */
@Embeddable
public class PermissionImpl extends WildcardPermission implements Permission, org.apache.shiro.authz.Permission, Serializable {

    private static final long serialVersionUID = 1480557438886065675L;
```

### RedundantImplements
Redundant interface declaration `Serializable`
in `service/security/authentication/api/src/main/java/org/eclipse/kapua/service/authentication/token/AccessToken.java`
#### Snippet
```java
        factoryClass = AccessTokenXmlRegistry.class, //
        factoryMethod = "newAccessToken")
public interface AccessToken extends KapuaUpdatableEntity, Serializable {

    String TYPE = "accessToken";
```

### RedundantImplements
Redundant interface declaration `KapuaResponseChannel`
in `service/device/management/inventory/internal/src/main/java/org/eclipse/kapua/service/device/management/inventory/internal/message/InventoryResponseChannel.java`
#### Snippet
```java
 * @since 1.5.0
 */
public class InventoryResponseChannel extends KapuaResponseChannelImpl implements KapuaResponseChannel {

    private static final long serialVersionUID = 6073193292259010928L;
```

### RedundantImplements
Redundant interface declaration `KapuaResponseMessage`
in `service/device/management/inventory/internal/src/main/java/org/eclipse/kapua/service/device/management/inventory/internal/message/InventoryResponseMessage.java`
#### Snippet
```java
 */
public class InventoryResponseMessage extends KapuaResponseMessageImpl<InventoryResponseChannel, InventoryResponsePayload>
        implements KapuaResponseMessage<InventoryResponseChannel, InventoryResponsePayload> {

    private static final long serialVersionUID = -1398713049819248123L;
```

### RedundantImplements
Redundant interface declaration `KapuaRequestChannel`
in `service/device/management/inventory/internal/src/main/java/org/eclipse/kapua/service/device/management/inventory/internal/message/InventoryRequestChannel.java`
#### Snippet
```java
 * @since 1.5.0
 */
public class InventoryRequestChannel extends KapuaRequestChannelImpl implements KapuaRequestChannel {

    private static final long serialVersionUID = 9127157971609776985L;
```

### RedundantImplements
Redundant interface declaration `KapuaResponsePayload`
in `service/device/management/inventory/internal/src/main/java/org/eclipse/kapua/service/device/management/inventory/internal/message/InventoryResponsePayload.java`
#### Snippet
```java
 * @since 1.5.0
 */
public class InventoryResponsePayload extends KapuaResponsePayloadImpl implements KapuaResponsePayload {

    private static final long serialVersionUID = 4380715272822080425L;
```

### RedundantImplements
Redundant interface declaration `TargetProcessor`
in `service/job/test-steps/src/main/java/org/eclipse/kapua/service/job/steps/model/TestJobStepProcessor.java`
#### Snippet
```java
import javax.inject.Inject;

public class TestJobStepProcessor extends AbstractDeviceTargetProcessor implements TargetProcessor {
    @Inject
    JobContext jobContext;
```

### RedundantImplements
Redundant interface declaration `DeviceLifecycleMessage`
in `service/device/call/kura/src/main/java/org/eclipse/kapua/service/device/call/message/kura/lifecycle/KuraAppsMessage.java`
#### Snippet
```java
 * @since 1.0.0
 */
public class KuraAppsMessage extends AbstractKuraAppsBirthMessage<KuraAppsChannel, KuraAppsPayload> implements DeviceLifecycleMessage<KuraAppsChannel, KuraAppsPayload> {

    /**
```

### RedundantImplements
Redundant interface declaration `DeviceLifecycleMessage`
in `service/device/call/kura/src/main/java/org/eclipse/kapua/service/device/call/message/kura/lifecycle/KuraBirthMessage.java`
#### Snippet
```java
 * @since 1.0.0
 */
public class KuraBirthMessage extends AbstractKuraAppsBirthMessage<KuraBirthChannel, KuraBirthPayload> implements DeviceLifecycleMessage<KuraBirthChannel, KuraBirthPayload> {

    /**
```

### RedundantImplements
Redundant interface declaration `DeviceLifecycleChannel`
in `service/device/call/kura/src/main/java/org/eclipse/kapua/service/device/call/message/kura/lifecycle/KuraBirthChannel.java`
#### Snippet
```java
 * @since 1.0.0
 */
public class KuraBirthChannel extends AbstractKuraAppsBirthChannel implements DeviceLifecycleChannel {

    /**
```

### RedundantImplements
Redundant interface declaration `DeviceLifecyclePayload`
in `service/device/call/kura/src/main/java/org/eclipse/kapua/service/device/call/message/kura/lifecycle/KuraDisconnectPayload.java`
#### Snippet
```java
 * @since 1.0.0
 */
public class KuraDisconnectPayload extends AbstractKuraLifecyclePayload implements DeviceLifecyclePayload {

    /**
```

### RedundantImplements
Redundant interface declaration `DeviceLifecyclePayload`
in `service/device/call/kura/src/main/java/org/eclipse/kapua/service/device/call/message/kura/lifecycle/KuraMissingPayload.java`
#### Snippet
```java
 * @since 1.0.0
 */
public class KuraMissingPayload extends AbstractKuraLifecyclePayload implements DeviceLifecyclePayload {

}
```

### RedundantImplements
Redundant interface declaration `DeviceLifecycleMessage`
in `service/device/call/kura/src/main/java/org/eclipse/kapua/service/device/call/message/kura/lifecycle/AbstractKuraAppsBirthMessage.java`
#### Snippet
```java
 * @since 1.0.0
 */
public class AbstractKuraAppsBirthMessage<C extends AbstractKuraAppsBirthChannel, P extends AbstractKuraAppsBirthPayload> extends AbstractKuraLifecycleMessage<C, P> implements DeviceLifecycleMessage<C, P> {

    /**
```

### RedundantImplements
Redundant interface declaration `DeviceLifecyclePayload`
in `service/device/call/kura/src/main/java/org/eclipse/kapua/service/device/call/message/kura/lifecycle/KuraBirthPayload.java`
#### Snippet
```java
 * @since 1.0.0
 */
public class KuraBirthPayload extends AbstractKuraAppsBirthPayload implements DeviceLifecyclePayload {

}
```

### RedundantImplements
Redundant interface declaration `DeviceLifecycleChannel`
in `service/device/call/kura/src/main/java/org/eclipse/kapua/service/device/call/message/kura/lifecycle/KuraDisconnectChannel.java`
#### Snippet
```java
 * @since 1.0.0
 */
public class KuraDisconnectChannel extends AbstractKuraLifecycleChannel implements DeviceLifecycleChannel {

    /**
```

### RedundantImplements
Redundant interface declaration `DeviceLifecyclePayload`
in `service/device/call/kura/src/main/java/org/eclipse/kapua/service/device/call/message/kura/lifecycle/KuraAppsPayload.java`
#### Snippet
```java
 * @since 1.0.0
 */
public class KuraAppsPayload extends AbstractKuraAppsBirthPayload implements DeviceLifecyclePayload {

}
```

### RedundantImplements
Redundant interface declaration `DeviceLifecycleMessage`
in `service/device/call/kura/src/main/java/org/eclipse/kapua/service/device/call/message/kura/lifecycle/KuraMissingMessage.java`
#### Snippet
```java
 * @since 1.0.0
 */
public class KuraMissingMessage extends AbstractKuraLifecycleMessage<KuraMissingChannel, KuraMissingPayload> implements DeviceLifecycleMessage<KuraMissingChannel, KuraMissingPayload> {

    /**
```

### RedundantImplements
Redundant interface declaration `DeviceLifecycleChannel`
in `service/device/call/kura/src/main/java/org/eclipse/kapua/service/device/call/message/kura/lifecycle/KuraMissingChannel.java`
#### Snippet
```java
 * @since 1.0.0
 */
public class KuraMissingChannel extends AbstractKuraLifecycleChannel implements DeviceLifecycleChannel {

    /**
```

### RedundantImplements
Redundant interface declaration `DeviceLifecycleChannel`
in `service/device/call/kura/src/main/java/org/eclipse/kapua/service/device/call/message/kura/lifecycle/AbstractKuraAppsBirthChannel.java`
#### Snippet
```java
 * @since 1.0.0
 */
public abstract class AbstractKuraAppsBirthChannel extends AbstractKuraLifecycleChannel implements DeviceLifecycleChannel {

    /**
```

### RedundantImplements
Redundant interface declaration `DeviceLifecycleChannel`
in `service/device/call/kura/src/main/java/org/eclipse/kapua/service/device/call/message/kura/lifecycle/KuraAppsChannel.java`
#### Snippet
```java
 * @since 1.0.0
 */
public class KuraAppsChannel extends AbstractKuraAppsBirthChannel implements DeviceLifecycleChannel {

    /**
```

### RedundantImplements
Redundant interface declaration `DeviceLifecycleMessage`
in `service/device/call/kura/src/main/java/org/eclipse/kapua/service/device/call/message/kura/lifecycle/KuraDisconnectMessage.java`
#### Snippet
```java
 * @since 1.0.0
 */
public class KuraDisconnectMessage extends AbstractKuraLifecycleMessage<KuraDisconnectChannel, KuraDisconnectPayload> implements DeviceLifecycleMessage<KuraDisconnectChannel, KuraDisconnectPayload> {

    /**
```

### RedundantImplements
Redundant interface declaration `EntityManagerFactory`
in `commons/src/main/java/org/eclipse/kapua/commons/jpa/CommonsEntityManagerFactory.java`
#### Snippet
```java
 * @since 1.0.0
 */
public class CommonsEntityManagerFactory extends AbstractEntityManagerFactory implements EntityManagerFactory {

    private static final String PERSISTENCE_UNIT_NAME = "kapua-commons";
```

### RedundantImplements
Redundant interface declaration `DeviceLifecyclePayload`
in `service/device/call/kura/src/main/java/org/eclipse/kapua/service/device/call/message/kura/lifecycle/AbstractKuraAppsBirthPayload.java`
#### Snippet
```java
 * @since 1.0.0
 */
public class AbstractKuraAppsBirthPayload extends AbstractKuraLifecyclePayload implements DeviceLifecyclePayload {

    /**
```

### RedundantImplements
Redundant interface declaration `Serializable`
in `commons/src/main/java/org/eclipse/kapua/commons/model/AbstractKapuaEntity.java`
#### Snippet
```java
@MappedSuperclass
@Access(AccessType.FIELD)
public abstract class AbstractKapuaEntity implements KapuaEntity, Serializable {

    @EmbeddedId
```

### RedundantImplements
Redundant interface declaration `Serializable`
in `commons/src/main/java/org/eclipse/kapua/commons/model/id/KapuaEid.java`
#### Snippet
```java
 */
@Embeddable
public class KapuaEid implements KapuaId, Serializable {

    private static final long serialVersionUID = 8998805462408705432L;
```

### RedundantImplements
Redundant interface declaration `KapuaQuery`
in `commons/src/main/java/org/eclipse/kapua/commons/model/query/AbstractKapuaNamedQuery.java`
#### Snippet
```java
 * @since 1.5.0
 */
public abstract class AbstractKapuaNamedQuery extends AbstractKapuaQuery implements KapuaQuery {

    /**
```

### RedundantImplements
Redundant interface declaration `EntityManagerFactory`
in `service/job/internal/src/main/java/org/eclipse/kapua/service/job/internal/JobEntityManagerFactory.java`
#### Snippet
```java
 * @since 1.0.0
 */
public class JobEntityManagerFactory extends AbstractEntityManagerFactory implements EntityManagerFactory {

    private static final String PERSISTENCE_UNIT_NAME = "kapua-job";
```

### RedundantImplements
Redundant interface declaration `Domain`
in `service/device/management/registry/api/src/main/java/org/eclipse/kapua/service/device/management/registry/operation/DeviceManagementRegistryDomain.java`
#### Snippet
```java
 * @since 1.0.0
 */
public class DeviceManagementRegistryDomain extends AbstractDomain implements Domain {

    private String name = "device_management_registry";
```

### RedundantImplements
Redundant interface declaration `EntityManagerFactory`
in `job-engine/jbatch/src/main/java/org/eclipse/kapua/job/engine/jbatch/JobEngineEntityManagerFactory.java`
#### Snippet
```java
 * @since 1.1.0
 */
public class JobEngineEntityManagerFactory extends AbstractEntityManagerFactory implements EntityManagerFactory {

    private static final String PERSISTENCE_UNIT_NAME = "kapua-job-engine";
```

### RedundantImplements
Redundant interface declaration `List`
in `job-engine/jbatch/src/main/java/org/eclipse/kapua/job/engine/jbatch/driver/JbatchJobRunningStatuses.java`
#### Snippet
```java
 * @since 1.0.0
 */
public class JbatchJobRunningStatuses extends ArrayList<BatchStatus> implements List<BatchStatus> {

    private static final JbatchJobRunningStatuses STATUSES = new JbatchJobRunningStatuses();
```

### RedundantImplements
Redundant interface declaration `EntityManagerFactory`
in `job-engine/jbatch/src/main/java/org/eclipse/kapua/job/engine/jbatch/persistence/JbatchEntityManagerFactory.java`
#### Snippet
```java
 * @since 1.2.0
 */
public class JbatchEntityManagerFactory extends AbstractEntityManagerFactory implements EntityManagerFactory {

    private static final String PERSISTENCE_UNIT_NAME = "jbatch";
```

### RedundantImplements
Redundant interface declaration `JobListener`
in `job-engine/jbatch/src/main/java/org/eclipse/kapua/job/engine/jbatch/listener/KapuaJobListener.java`
#### Snippet
```java
 * @since 1.0.0
 */
public class KapuaJobListener extends AbstractJobListener implements JobListener {

    private static final Logger LOG = LoggerFactory.getLogger(KapuaJobListener.class);
```

### RedundantImplements
Redundant interface declaration `JobStepDefinition`
in `service/device/management/configuration/job/src/main/java/org/eclipse/kapua/service/device/management/configuration/job/definition/DeviceConfigurationPutStepDefinition.java`
#### Snippet
```java
import java.util.List;

public class DeviceConfigurationPutStepDefinition extends AbstractTargetJobStepDefinition implements JobStepDefinition {

    private static final long serialVersionUID = -4994045121586264564L;
```

### RedundantImplements
Redundant interface declaration `TargetProcessor`
in `service/device/management/configuration/job/src/main/java/org/eclipse/kapua/service/device/management/configuration/job/DeviceConfigurationPutTargetProcessor.java`
#### Snippet
```java
 * @since 1.0.0
 */
public class DeviceConfigurationPutTargetProcessor extends AbstractDeviceTargetProcessor implements TargetProcessor {
    private static final DeviceConfigurationManagementService CONFIGURATION_MANAGEMENT_SERVICE = LOCATOR.getService(DeviceConfigurationManagementService.class);

```

### RedundantImplements
Redundant interface declaration `TargetProcessor`
in `service/device/management/asset/job/src/main/java/org/eclipse/kapua/service/device/management/asset/job/DeviceAssetWriteTargetProcessor.java`
#### Snippet
```java
 * @since 1.0.0
 */
public class DeviceAssetWriteTargetProcessor extends AbstractDeviceTargetProcessor implements TargetProcessor {
    private static final DeviceAssetManagementService ASSET_MANAGEMENT_SERVICE = LOCATOR.getService(DeviceAssetManagementService.class);

```

### RedundantImplements
Redundant interface declaration `JobStepDefinition`
in `service/device/management/asset/job/src/main/java/org/eclipse/kapua/service/device/management/asset/job/definition/DeviceAssetWriteStepDefinition.java`
#### Snippet
```java
import java.util.List;

public class DeviceAssetWriteStepDefinition extends AbstractTargetJobStepDefinition implements JobStepDefinition {

    private static final long serialVersionUID = -4994045121586264564L;
```

### RedundantImplements
Redundant interface declaration `KapuaResponseMessage`
in `service/device/management/bundle/internal/src/main/java/org/eclipse/kapua/service/device/management/bundle/message/internal/BundleResponseMessage.java`
#### Snippet
```java
 */
public class BundleResponseMessage extends KapuaResponseMessageImpl<BundleResponseChannel, BundleResponsePayload>
        implements KapuaResponseMessage<BundleResponseChannel, BundleResponsePayload> {

    private static final long serialVersionUID = 7601989030774908547L;
```

### RedundantImplements
Redundant interface declaration `KapuaResponsePayload`
in `service/device/management/bundle/internal/src/main/java/org/eclipse/kapua/service/device/management/bundle/message/internal/BundleResponsePayload.java`
#### Snippet
```java
 * @since 1.0.0
 */
public class BundleResponsePayload extends KapuaResponsePayloadImpl implements KapuaResponsePayload {

    private static final long serialVersionUID = 4380715272822080425L;
```

### RedundantImplements
Redundant interface declaration `KapuaResponseChannel`
in `service/device/management/bundle/internal/src/main/java/org/eclipse/kapua/service/device/management/bundle/message/internal/BundleResponseChannel.java`
#### Snippet
```java
 * @since 1.0.0
 */
public class BundleResponseChannel extends KapuaResponseChannelImpl implements KapuaResponseChannel {

    private static final long serialVersionUID = 7627283688891772616L;
```

### RedundantImplements
Redundant interface declaration `KapuaRequestChannel`
in `service/device/management/bundle/internal/src/main/java/org/eclipse/kapua/service/device/management/bundle/message/internal/BundleRequestChannel.java`
#### Snippet
```java
 * @since 1.0.0
 */
public class BundleRequestChannel extends KapuaRequestChannelImpl implements KapuaRequestChannel {

    private static final long serialVersionUID = -1300715857785309970L;
```

### RedundantImplements
Redundant interface declaration `EntityManagerFactory`
in `extras/encryption-migrator/src/main/java/org/eclipse/kapua/extras/migrator/encryption/MigratorEntityManagerFactory.java`
#### Snippet
```java
 * @since 2.0.0
 */
public class MigratorEntityManagerFactory extends AbstractEntityManagerFactory implements EntityManagerFactory {

    private static final String PERSISTENCE_UNIT_NAME = "kapua-encryption-migrator";
```

### RedundantImplements
Redundant interface declaration `EntitySecretAttributeMigrator`
in `extras/encryption-migrator/src/main/java/org/eclipse/kapua/extras/migrator/encryption/job/JobStepAttributeMigrator.java`
#### Snippet
```java
import org.eclipse.kapua.service.job.step.JobStep;

public class JobStepAttributeMigrator extends AbstractEntityAttributeMigrator<JobStep> implements EntitySecretAttributeMigrator<JobStep> {

    private static final JobStepMigratorServiceImpl JOB_STEP_MIGRATOR_SERVICE = new JobStepMigratorServiceImpl();
```

### RedundantImplements
Redundant interface declaration `EntitySecretAttributeMigrator`
in `extras/encryption-migrator/src/main/java/org/eclipse/kapua/extras/migrator/encryption/authentication/MfaOptionAttributeMigrator.java`
#### Snippet
```java
import org.eclipse.kapua.service.authentication.credential.mfa.MfaOption;

public class MfaOptionAttributeMigrator extends AbstractEntityAttributeMigrator<MfaOption> implements EntitySecretAttributeMigrator<MfaOption> {

    private static final MfaOptionMigratorServiceImpl MFA_OPTION_MIGRATOR_SERVICE = new MfaOptionMigratorServiceImpl();
```

### RedundantImplements
Redundant interface declaration `EntityManagerFactory`
in `service/device/management/job/internal/src/main/java/org/eclipse/kapua/service/device/management/job/internal/JobDeviceManagementOperationEntityManagerFactory.java`
#### Snippet
```java
 * @since 1.1.0
 */
public class JobDeviceManagementOperationEntityManagerFactory extends AbstractEntityManagerFactory implements EntityManagerFactory {

    private static final String PERSISTENCE_UNIT_NAME = "kapua-job-device-management-operation";
```

## RuleId[id=InstanceofCatchParameter]
### InstanceofCatchParameter
'instanceof' on 'catch' parameter `se`
in `service/security/shiro/src/main/java/org/eclipse/kapua/service/authentication/shiro/AuthenticationServiceShiroImpl.java`
#### Snippet
```java

            KapuaAuthenticationException kae;
            if (se instanceof UnknownAccountException) {
                kae = new KapuaAuthenticationException(KapuaAuthenticationErrorCodes.UNKNOWN_SESSION_CREDENTIAL, se, shiroAuthenticationToken.getPrincipal());
            } else if (se instanceof DisabledAccountException) {
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `se`
in `service/security/shiro/src/main/java/org/eclipse/kapua/service/authentication/shiro/AuthenticationServiceShiroImpl.java`
#### Snippet
```java
            if (se instanceof UnknownAccountException) {
                kae = new KapuaAuthenticationException(KapuaAuthenticationErrorCodes.UNKNOWN_SESSION_CREDENTIAL, se, shiroAuthenticationToken.getPrincipal());
            } else if (se instanceof DisabledAccountException) {
                kae = new KapuaAuthenticationException(KapuaAuthenticationErrorCodes.DISABLED_SESSION_CREDENTIAL, se, shiroAuthenticationToken.getPrincipal());
            } else if (se instanceof LockedAccountException) {
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `se`
in `service/security/shiro/src/main/java/org/eclipse/kapua/service/authentication/shiro/AuthenticationServiceShiroImpl.java`
#### Snippet
```java
            } else if (se instanceof DisabledAccountException) {
                kae = new KapuaAuthenticationException(KapuaAuthenticationErrorCodes.DISABLED_SESSION_CREDENTIAL, se, shiroAuthenticationToken.getPrincipal());
            } else if (se instanceof LockedAccountException) {
                kae = new KapuaAuthenticationException(KapuaAuthenticationErrorCodes.LOCKED_SESSION_CREDENTIAL, se, shiroAuthenticationToken.getPrincipal());
            } else if (se instanceof IncorrectCredentialsException) {
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `se`
in `service/security/shiro/src/main/java/org/eclipse/kapua/service/authentication/shiro/AuthenticationServiceShiroImpl.java`
#### Snippet
```java
            } else if (se instanceof LockedAccountException) {
                kae = new KapuaAuthenticationException(KapuaAuthenticationErrorCodes.LOCKED_SESSION_CREDENTIAL, se, shiroAuthenticationToken.getPrincipal());
            } else if (se instanceof IncorrectCredentialsException) {
                kae = new KapuaAuthenticationException(KapuaAuthenticationErrorCodes.INVALID_SESSION_CREDENTIALS, se, shiroAuthenticationToken.getPrincipal());
            } else if (se instanceof ExpiredCredentialsException) {
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `se`
in `service/security/shiro/src/main/java/org/eclipse/kapua/service/authentication/shiro/AuthenticationServiceShiroImpl.java`
#### Snippet
```java
            } else if (se instanceof IncorrectCredentialsException) {
                kae = new KapuaAuthenticationException(KapuaAuthenticationErrorCodes.INVALID_SESSION_CREDENTIALS, se, shiroAuthenticationToken.getPrincipal());
            } else if (se instanceof ExpiredCredentialsException) {
                kae = new KapuaAuthenticationException(KapuaAuthenticationErrorCodes.EXPIRED_SESSION_CREDENTIALS, se, shiroAuthenticationToken.getPrincipal());
            } else {
```

## RuleId[id=ExceptionNameDoesntEndWithException]
### ExceptionNameDoesntEndWithException
Exception class name `RequestEntityWriteError` does not end with 'Exception'
in `service/commons/elasticsearch/client-rest/src/main/java/org/eclipse/kapua/service/elasticsearch/client/rest/exception/RequestEntityWriteError.java`
#### Snippet
```java
 * @since 1.3.0
 */
public class RequestEntityWriteError extends ClientInternalError {

    /**
```

### ExceptionNameDoesntEndWithException
Exception class name `ResponseEntityReadError` does not end with 'Exception'
in `service/commons/elasticsearch/client-rest/src/main/java/org/eclipse/kapua/service/elasticsearch/client/rest/exception/ResponseEntityReadError.java`
#### Snippet
```java
 * @since 1.3.0
 */
public class ResponseEntityReadError extends ClientInternalError {

    /**
```

### ExceptionNameDoesntEndWithException
Exception class name `ClientInternalError` does not end with 'Exception'
in `service/commons/elasticsearch/client-api/src/main/java/org/eclipse/kapua/service/elasticsearch/client/exception/ClientInternalError.java`
#### Snippet
```java
 * @since 1.3.0
 */
public class ClientInternalError extends ClientException {

    private final String reason;
```

### ExceptionNameDoesntEndWithException
Exception class name `DatastoreServiceError` does not end with 'Exception'
in `service/datastore/api/src/main/java/org/eclipse/kapua/service/datastore/exception/DatastoreServiceError.java`
#### Snippet
```java
 * @since 1.3.0
 */
public class DatastoreServiceError extends KapuaRuntimeException {

    private static final String DATASTORE_ERROR_MESSAGES = "datastore-service-error-messages";
```

### ExceptionNameDoesntEndWithException
Exception class name `DatastoreInternalError` does not end with 'Exception'
in `service/datastore/api/src/main/java/org/eclipse/kapua/service/datastore/exception/DatastoreInternalError.java`
#### Snippet
```java
 * @since 1.3.0
 */
public class DatastoreInternalError extends DatastoreServiceError {

    private final String message;
```

### ExceptionNameDoesntEndWithException
Exception class name `KapuaExceptionWithoutBundle` does not end with 'Exception'
in `service/api/src/main/java/org/eclipse/kapua/KapuaExceptionWithoutBundle.java`
#### Snippet
```java
 */
@Deprecated
public class KapuaExceptionWithoutBundle extends KapuaException {
    public KapuaExceptionWithoutBundle(KapuaErrorCode code) {
        super(code);
```

### ExceptionNameDoesntEndWithException
Exception class name `KapuaDuplicateNameInAnotherAccountError` does not end with 'Exception'
in `service/api/src/main/java/org/eclipse/kapua/KapuaDuplicateNameInAnotherAccountError.java`
#### Snippet
```java
 * @since 1.0.0
 */
public class KapuaDuplicateNameInAnotherAccountError extends KapuaException {

    private static final long serialVersionUID = 6086560691695487741L;
```

### ExceptionNameDoesntEndWithException
Exception class name `KapuaDuplicateExternalIdInAnotherAccountError` does not end with 'Exception'
in `service/api/src/main/java/org/eclipse/kapua/KapuaDuplicateExternalIdInAnotherAccountError.java`
#### Snippet
```java
 */
@Deprecated
public class KapuaDuplicateExternalIdInAnotherAccountError extends KapuaException {

    private static final long serialVersionUID = 6086560691695487741L;
```

## RuleId[id=StringBufferReplaceableByStringBuilder]
### StringBufferReplaceableByStringBuilder
`StringBuffer buffer` may be declared as 'StringBuilder'
in `commons/src/main/java/org/eclipse/kapua/commons/configuration/ValueTokenizer.java`
#### Snippet
```java
        // characters may or may not be escaped. Also, any character may be
        // escaped. The escape character is '\'. The delimiter is ','.
        StringBuffer buffer = new StringBuffer();
        // Loop over the characters within the input string and extract each
        // value token.
```

## RuleId[id=RedundantStringFormatCall]
### RedundantStringFormatCall
Redundant call to `format()`
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/app/annotated/AnnotatedApplication.java`
#### Snippet
```java
        if (appId == null || appId.isEmpty()) {
            throw new IllegalArgumentException(
                    String.format("Application annotation must have a valid application id value"));
        }

```

### RedundantStringFormatCall
Redundant call to `format()`
in `service/datastore/internal/src/main/java/org/eclipse/kapua/service/datastore/internal/mediator/DatastoreUtils.java`
#### Snippet
```java
            value = CLIENT_METRIC_TYPE_BINARY;
        } else {
            throw new IllegalArgumentException(String.format("Metric value type for "));
        }
        return value;
```

### RedundantStringFormatCall
Redundant call to `format()`
in `service/datastore/internal/src/main/java/org/eclipse/kapua/service/datastore/internal/mediator/DatastoreUtils.java`
#### Snippet
```java
        }
        if (alias.startsWith("_")) {
            throw new IllegalArgumentException(String.format("Alias name cannot start with _"));
        }
        for (int i = 0; i < alias.length(); i++) {
```

## RuleId[id=NonFinalFieldOfException]
### NonFinalFieldOfException
Non-final field `argumentName` of exception class
in `plug-ins/sso/openid-connect/api/src/main/java/org/eclipse/kapua/plugin/sso/openid/exception/OpenIDIllegalArgumentException.java`
#### Snippet
```java
public class OpenIDIllegalArgumentException extends OpenIDException {

    private String argumentName;
    private String argumentValue;

```

### NonFinalFieldOfException
Non-final field `argumentValue` of exception class
in `plug-ins/sso/openid-connect/api/src/main/java/org/eclipse/kapua/plugin/sso/openid/exception/OpenIDIllegalArgumentException.java`
#### Snippet
```java

    private String argumentName;
    private String argumentValue;

    /**
```

### NonFinalFieldOfException
Non-final field `uuid` of exception class
in `service/datastore/internal/src/main/java/org/eclipse/kapua/service/datastore/internal/mediator/DatastoreCommunicationException.java`
#### Snippet
```java
    private static final long serialVersionUID = 5211237236391747299L;

    private String uuid;

    /**
```

### NonFinalFieldOfException
Non-final field `entityName` of exception class
in `service/api/src/main/java/org/eclipse/kapua/KapuaEntityNotFoundException.java`
#### Snippet
```java
    private final String entityType;
    private KapuaId entityId;
    private String entityName;

    /**
```

### NonFinalFieldOfException
Non-final field `entityId` of exception class
in `service/api/src/main/java/org/eclipse/kapua/KapuaEntityNotFoundException.java`
#### Snippet
```java

    private final String entityType;
    private KapuaId entityId;
    private String entityName;

```

### NonFinalFieldOfException
Non-final field `status` of exception class
in `service/device/management/registry/api/src/main/java/org/eclipse/kapua/service/device/management/registry/manager/exception/ManagementOperationNotificationProcessingException.java`
#### Snippet
```java
    private KapuaId scopeId;
    private KapuaId operationId;
    private NotifyStatus status;
    private Date updatedOn;
    private Integer progress;
```

### NonFinalFieldOfException
Non-final field `updatedOn` of exception class
in `service/device/management/registry/api/src/main/java/org/eclipse/kapua/service/device/management/registry/manager/exception/ManagementOperationNotificationProcessingException.java`
#### Snippet
```java
    private KapuaId operationId;
    private NotifyStatus status;
    private Date updatedOn;
    private Integer progress;

```

### NonFinalFieldOfException
Non-final field `operationId` of exception class
in `service/device/management/registry/api/src/main/java/org/eclipse/kapua/service/device/management/registry/manager/exception/ManagementOperationNotificationProcessingException.java`
#### Snippet
```java

    private KapuaId scopeId;
    private KapuaId operationId;
    private NotifyStatus status;
    private Date updatedOn;
```

### NonFinalFieldOfException
Non-final field `progress` of exception class
in `service/device/management/registry/api/src/main/java/org/eclipse/kapua/service/device/management/registry/manager/exception/ManagementOperationNotificationProcessingException.java`
#### Snippet
```java
    private NotifyStatus status;
    private Date updatedOn;
    private Integer progress;

    public ManagementOperationNotificationProcessingException(KapuaException ke, KapuaId scopeId, KapuaId operationId, NotifyStatus status, Date updateOn, Integer progress) {
```

### NonFinalFieldOfException
Non-final field `scopeId` of exception class
in `service/device/management/registry/api/src/main/java/org/eclipse/kapua/service/device/management/registry/manager/exception/ManagementOperationNotificationProcessingException.java`
#### Snippet
```java
public class ManagementOperationNotificationProcessingException extends KapuaException {

    private KapuaId scopeId;
    private KapuaId operationId;
    private NotifyStatus status;
```

### NonFinalFieldOfException
Non-final field `progress` of exception class
in `service/device/management/registry/api/src/main/java/org/eclipse/kapua/service/device/management/registry/manager/exception/ManagementOperationNotificationInvalidStatusException.java`
#### Snippet
```java
    private NotifyStatus status;
    private Date updatedOn;
    private Integer progress;

    public ManagementOperationNotificationInvalidStatusException(KapuaId scopeId, KapuaId operationId, NotifyStatus status, Date updateOn, Integer progress) {
```

### NonFinalFieldOfException
Non-final field `scopeId` of exception class
in `service/device/management/registry/api/src/main/java/org/eclipse/kapua/service/device/management/registry/manager/exception/ManagementOperationNotificationInvalidStatusException.java`
#### Snippet
```java
public class ManagementOperationNotificationInvalidStatusException extends KapuaException {

    private KapuaId scopeId;
    private KapuaId operationId;
    private NotifyStatus status;
```

### NonFinalFieldOfException
Non-final field `status` of exception class
in `service/device/management/registry/api/src/main/java/org/eclipse/kapua/service/device/management/registry/manager/exception/ManagementOperationNotificationInvalidStatusException.java`
#### Snippet
```java
    private KapuaId scopeId;
    private KapuaId operationId;
    private NotifyStatus status;
    private Date updatedOn;
    private Integer progress;
```

### NonFinalFieldOfException
Non-final field `updatedOn` of exception class
in `service/device/management/registry/api/src/main/java/org/eclipse/kapua/service/device/management/registry/manager/exception/ManagementOperationNotificationInvalidStatusException.java`
#### Snippet
```java
    private KapuaId operationId;
    private NotifyStatus status;
    private Date updatedOn;
    private Integer progress;

```

### NonFinalFieldOfException
Non-final field `operationId` of exception class
in `service/device/management/registry/api/src/main/java/org/eclipse/kapua/service/device/management/registry/manager/exception/ManagementOperationNotificationInvalidStatusException.java`
#### Snippet
```java

    private KapuaId scopeId;
    private KapuaId operationId;
    private NotifyStatus status;
    private Date updatedOn;
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `service/user/internal/src/main/java/org/eclipse/kapua/service/user/internal/UserServiceModule.java`
#### Snippet
```java
                kas.getString(KapuaUserSettingKeys.USER_EVENT_ADDRESS),
                UserEntityManagerFactory.getInstance(),
                selc.toArray(new ServiceEventClientConfiguration[0]));
    }
}
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `service/commons/elasticsearch/client-rest/src/main/java/org/eclipse/kapua/service/elasticsearch/client/rest/RestElasticsearchClientProvider.java`
#### Snippet
```java

        // Init internal Elasticsearch client
        RestClientBuilder restClientBuilder = RestClient.builder(hosts.toArray(new HttpHost[0]));
        SSLContext sslContext = null;
        if (sslEnabled) {
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `qa/common/src/main/java/org/eclipse/kapua/qa/common/BasicSteps.java`
#### Snippet
```java

    private void setSpecificProperties(Scenario scenario) {
        String[] scenarioTags = scenario.getSourceTagNames().toArray(new String[]{});
        for (String str : scenarioTags) {
            if (str.startsWith(KAPUA_CUSTOM_PROPERTIES)) {
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `service/account/internal/src/main/java/org/eclipse/kapua/service/account/internal/AccountServiceModule.java`
#### Snippet
```java
                address,
                AccountEntityManagerFactory.getInstance(),
                eventBusClients.toArray(new ServiceEventClientConfiguration[0]));
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `service/device/management/command/internal/src/main/java/org/eclipse/kapua/service/device/management/command/message/internal/CommandRequestPayload.java`
#### Snippet
```java
        }

        return argumentsList.toArray(new String[0]);
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `service/device/management/command/internal/src/main/java/org/eclipse/kapua/service/device/management/command/message/internal/CommandRequestPayload.java`
#### Snippet
```java
        }

        return v.toArray(new String[0]);
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `translator/kapua/kura/src/main/java/org/eclipse/kapua/translator/kapua/kura/TranslatorAppRequestKapuaKura.java`
#### Snippet
```java
            kuraRequestChannel.setAppId(appIdSb.toString());
            kuraRequestChannel.setMethod(MethodDictionaryKapuaKura.translate(kapuaChannel.getMethod()));
            kuraRequestChannel.setResources(kapuaChannel.getResources().toArray(new String[0]));

            return kuraRequestChannel;
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `translator/kapua/kura/src/main/java/org/eclipse/kapua/translator/kapua/kura/TranslatorAppSnapshotKapuaKura.java`
#### Snippet
```java
                resources.add(snapshotId);
            }
            kuraRequestChannel.setResources(resources.toArray(new String[0]));

            // Return Kura Channel
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `translator/kapua/kura/src/main/java/org/eclipse/kapua/translator/kapua/kura/TranslatorAppBundleKapuaKura.java`
#### Snippet
```java
                    break;
            }
            kuraRequestChannel.setResources(resources.toArray(new String[0]));

            // Return Kura Channel
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `translator/kapua/kura/src/main/java/org/eclipse/kapua/translator/kapua/kura/TranslatorAppPackageKapuaKura.java`
#### Snippet
```java
                }
            }
            kuraRequestChannel.setResources(resources.toArray(new String[0]));

            // Return Kura Channel
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `translator/kapua/kura/src/main/java/org/eclipse/kapua/translator/kapua/kura/TranslatorAppConfigurationKapuaKura.java`
#### Snippet
```java
                }
            }
            kuraRequestChannel.setResources(resources.toArray(new String[0]));

            // Return Kura Channel
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `transport/jms/src/main/java/org/eclipse/kapua/transport/message/jms/JmsTopic.java`
#### Snippet
```java
    public String[] getSplittedTopic() {
        if (Strings.isNullOrEmpty(getTopic())) {
            return new String[0];
        }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `transport/jms/src/main/java/org/eclipse/kapua/transport/message/jms/JmsMessage.java`
#### Snippet
```java
    public JmsPayload getPayload() {
        if (payload == null) {
            payload = new JmsPayload(new byte[0]);
        }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `service/datastore/test-steps/src/main/java/org/eclipse/kapua/service/datastore/steps/DatastoreSteps.java`
#### Snippet
```java
            Method getMethod = getMethod(objetcClass, getterFieldName, "get");
            if (getMethod != null) {
                return clazz.cast(getMethod.invoke(object, new Object[0]));
            }
            getMethod = getMethod(objetcClass, getterFieldName, "is");
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `service/datastore/test-steps/src/main/java/org/eclipse/kapua/service/datastore/steps/DatastoreSteps.java`
#### Snippet
```java
            getMethod = getMethod(objetcClass, getterFieldName, "is");
            if (getMethod != null) {
                return clazz.cast(getMethod.invoke(object, new Object[0]));
            }
            // else try by field access
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `service/datastore/test-steps/src/main/java/org/eclipse/kapua/service/datastore/steps/DatastoreSteps.java`
#### Snippet
```java
        do {
            try {
                objMethod = objetcClass.getMethod(fieldName, new Class[0]);
            } catch (NoSuchMethodException e) {
                objetcClass = objetcClass.getSuperclass();
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `service/device/registry/internal/src/main/java/org/eclipse/kapua/service/device/registry/DeviceServiceModule.java`
#### Snippet
```java
                kapuaDeviceRegistrySettings.getString(KapuaDeviceRegistrySettingKeys.DEVICE_EVENT_ADDRESS),
                DeviceEntityManagerFactory.getInstance(),
                serviceEventListenerConfigurations.toArray(new ServiceEventClientConfiguration[0])
        );
    }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `broker/core/src/main/java/org/eclipse/kapua/broker/core/plugin/KapuaSecurityBrokerFilter.java`
#### Snippet
```java
        authenticator = ClassUtil.newInstance(AUTHENTICATOR_CLASS_NAME, DefaultAuthenticator.class, new Class<?>[]{Map.class}, new Object[]{options});
        logger.info(">>> Security broker filter: calling start... Initialize authorizer {}", AUTHORIZER_CLASS_NAME);
        authorizer = ClassUtil.newInstance(AUTHORIZER_CLASS_NAME, DefaultAuthorizer.class, new Class<?>[]{}, new Object[]{});
        logger.info(">>> Security broker filter: calling start... Initialize broker ip resolver");
        brokerIpResolver = ClassUtil.newInstance(BROKER_IP_RESOLVER_CLASS_NAME, DefaultBrokerIpResolver.class);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `broker/core/src/main/java/org/eclipse/kapua/broker/core/plugin/KapuaSecurityBrokerFilter.java`
#### Snippet
```java
        authenticator = ClassUtil.newInstance(AUTHENTICATOR_CLASS_NAME, DefaultAuthenticator.class, new Class<?>[]{Map.class}, new Object[]{options});
        logger.info(">>> Security broker filter: calling start... Initialize authorizer {}", AUTHORIZER_CLASS_NAME);
        authorizer = ClassUtil.newInstance(AUTHORIZER_CLASS_NAME, DefaultAuthorizer.class, new Class<?>[]{}, new Object[]{});
        logger.info(">>> Security broker filter: calling start... Initialize broker ip resolver");
        brokerIpResolver = ClassUtil.newInstance(BROKER_IP_RESOLVER_CLASS_NAME, DefaultBrokerIpResolver.class);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `transport/mqtt/src/main/java/org/eclipse/kapua/transport/message/mqtt/MqttPayload.java`
#### Snippet
```java
     */
    MqttPayload() {
        this(new byte[0]);
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `transport/mqtt/src/main/java/org/eclipse/kapua/transport/message/mqtt/MqttTopic.java`
#### Snippet
```java
    public String[] getSplittedTopic() {
        if (Strings.isNullOrEmpty(getTopic())) {
            return new String[0];
        }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `translator/kura/jms/src/main/java/org/eclipse/kapua/translator/kura/jms/data/TranslatorDataKuraJms.java`
#### Snippet
```java
            }

            return new JmsTopic(topicTokens.toArray(new String[0]));
        } catch (Exception e) {
            throw new InvalidChannelException(e, kuraDataChannel);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `rest-api/core/src/main/java/org/eclipse/kapua/app/api/core/AbstractJaxbContextResolver.java`
#### Snippet
```java
                    classes.addAll(provider.getClasses());
                    }
                context = JAXBContextFactory.createContext(classes.toArray(new Class<?>[] {}), properties);
                LOG.debug("Default JAXB context initialized!");
            }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `service/datastore/internal/src/main/java/org/eclipse/kapua/service/datastore/internal/mediator/DatastoreUtils.java`
#### Snippet
```java
            }
        }
        return result.toArray(new String[0]);
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `service/datastore/internal/src/main/java/org/eclipse/kapua/service/datastore/internal/converter/ModelContextImpl.java`
#### Snippet
```java
            Map<String, Object> metrics = (Map<String, Object>) messageMap.get(MessageSchema.MESSAGE_METRICS);
            Map<String, Object> payloadMetrics = new HashMap<>();
            String[] metricNames = metrics.keySet().toArray(new String[]{});
            for (String metricsName : metricNames) {
                Map<String, Object> metricValue = (Map<String, Object>) metrics.get(metricsName);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `service/datastore/internal/src/main/java/org/eclipse/kapua/service/datastore/internal/converter/ModelContextImpl.java`
#### Snippet
```java
                Map<String, Object> metricValue = (Map<String, Object>) metrics.get(metricsName);
                if (metricValue.size() > 0) {
                    String[] valueTypes = metricValue.keySet().toArray(new String[]{});
                    Object value = metricValue.get(valueTypes[0]);
                    // since elasticsearch doesn't return always the same type of the saved field
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `service/datastore/internal/src/main/java/org/eclipse/kapua/service/datastore/internal/converter/ModelContextImpl.java`
#### Snippet
```java
        if (kapuaMetrics != null) {
            Map<String, Object> metrics = new HashMap<>();
            String[] metricNames = kapuaMetrics.keySet().toArray(new String[]{});
            for (String kapuaMetricName : metricNames) {
                Object metricValue = kapuaMetrics.get(kapuaMetricName);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `service/device/management/configuration/api/src/main/java/org/eclipse/kapua/service/device/management/configuration/DeviceXmlConfigPropertiesAdapter.java`
#### Snippet
```java

        DeviceXmlConfigPropertiesAdapted result = new DeviceXmlConfigPropertiesAdapted();
        result.setProperties(adaptedValues.toArray(new DeviceXmlConfigPropertyAdapted[]{}));
        return result;
    }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `service/api/src/main/java/org/eclipse/kapua/service/config/ServiceXmlConfigPropertiesAdapter.java`
#### Snippet
```java

        ServiceXmlConfigPropertiesAdapted result = new ServiceXmlConfigPropertiesAdapted();
        result.setProperties(adaptedValues.toArray(new ServiceXmlConfigPropertyAdapted[] {}));
        return result;
    }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `service/security/shiro/src/main/java/org/eclipse/kapua/service/authorization/shiro/AuthorizationServiceModule.java`
#### Snippet
```java
                kdrs.getString(KapuaAuthorizationSettingKeys.AUTHORIZATION_EVENT_ADDRESS),
                AuthorizationEntityManagerFactory.getInstance(),
                selc.toArray(new ServiceEventClientConfiguration[0]));
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `service/security/shiro/src/main/java/org/eclipse/kapua/service/authentication/shiro/AuthenticationServiceModule.java`
#### Snippet
```java
                kas.getString(KapuaAuthenticationSettingKeys.AUTHENTICATION_EVENT_ADDRESS),
                AuthenticationEntityManagerFactory.getInstance(),
                selc.toArray(new ServiceEventClientConfiguration[0]));
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `service/device/call/kura/src/main/java/org/eclipse/kapua/service/device/call/kura/model/deploy/KuraDeploymentPackages.java`
#### Snippet
```java
    public KuraDeploymentPackage[] getDeploymentPackages() {
        if (deploymentPackages == null) {
            deploymentPackages = new KuraDeploymentPackage[0];
        }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `service/device/call/kura/src/main/java/org/eclipse/kapua/service/device/call/kura/model/deploy/KuraDeploymentPackage.java`
#### Snippet
```java
    public KuraBundleInfo[] getBundleInfos() {
        if (bundleInfos == null) {
            bundleInfos = new KuraBundleInfo[0];
        }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `service/device/call/kura/src/main/java/org/eclipse/kapua/service/device/call/message/kura/app/request/KuraRequestChannel.java`
#### Snippet
```java
    public String[] getResources() {
        if (resources == null) {
            resources = new String[0];
        }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `service/device/call/kura/src/main/java/org/eclipse/kapua/service/device/call/message/kura/app/notification/KuraNotifyChannel.java`
#### Snippet
```java
    public String[] getResources() {
        if (resources == null) {
            resources = new String[0];
        }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `service/device/call/kura/src/main/java/org/eclipse/kapua/service/device/call/message/kura/event/configuration/KuraConfigurationEventChannel.java`
#### Snippet
```java
    public String[] getResources() {
        if (resources == null) {
            resources = new String[0];
        }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `service/device/call/kura/src/main/java/org/eclipse/kapua/service/device/call/message/kura/utils/GZIPUtils.java`
#### Snippet
```java
    public static byte[] decompress(byte[] source) throws IOException {
        if (source == null) {
            return new byte[0];
        }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `service/device/call/kura/src/main/java/org/eclipse/kapua/service/device/call/message/kura/utils/GZIPUtils.java`
#### Snippet
```java
    public static byte[] compress(byte[] source) throws IOException {
        if (source == null) {
            return new byte[0];
        }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `service/device/call/kura/src/main/java/org/eclipse/kapua/service/device/call/kura/model/configuration/xml/KuraXmlConfigPropertiesAdapter.java`
#### Snippet
```java

        KuraXmlConfigPropertiesAdapted result = new KuraXmlConfigPropertiesAdapted();
        result.setProperties(adaptedValues.toArray(new XmlConfigPropertyAdapted[]{}));
        return result;
    }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `commons/src/main/java/org/eclipse/kapua/commons/jpa/SimpleSqlScriptExecutor.java`
#### Snippet
```java
        };

        String[] dirContents = new String[] {};
        File sqlDir = new File(scanPath);
        if (sqlDir.isDirectory()) {
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `commons/src/main/java/org/eclipse/kapua/commons/util/xml/JAXBContextProviderBase.java`
#### Snippet
```java
                    classes.addAll(provider.getClasses());
                }
                context = JAXBContextFactory.createContext(classes.toArray(new Class<?>[] {}), properties);
                LOG.debug("Default JAXB context initialized!");
            }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `commons/src/main/java/org/eclipse/kapua/commons/util/StringUtil.java`
#### Snippet
```java
        // Don't forget to add the last token.
        values.add(buffer.toString());
        return values.toArray(new String[]{});
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `commons/src/main/java/org/eclipse/kapua/commons/configuration/ValueTokenizer.java`
#### Snippet
```java
        }

        return values.toArray(new String[0]);
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `commons/src/main/java/org/eclipse/kapua/commons/util/xml/XmlUtil.java`
#### Snippet
```java
            if (context == null) {
                LOG.warn("No JAXBContext found! Creating one using JAXBContextFactory.createContext(...)");
                context = JAXBContextFactory.createContext(new Class[]{}, null);
            }
        } catch (KapuaException ex) {
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `commons/src/main/java/org/eclipse/kapua/commons/util/xml/XmlUtil.java`
#### Snippet
```java
        } catch (KapuaException ex) {
            LOG.warn("No JAXBContextProvider provided or error while getting one! Creating one using JAXBContextFactory.createContext(...)", ex);
            context = JAXBContextFactory.createContext(new Class[]{}, null);
        }
        return context;
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `translator/kura/mqtt/src/main/java/org/eclipse/kapua/translator/kura/mqtt/TranslatorDataKuraMqtt.java`
#### Snippet
```java
            }

            return new MqttTopic(topicTokens.toArray(new String[0]));
        } catch (Exception e) {
            throw new InvalidChannelException(e, kuraDataChannel);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `translator/kura/mqtt/src/main/java/org/eclipse/kapua/translator/kura/mqtt/TranslatorRequestKuraMqtt.java`
#### Snippet
```java
            topicTokens.add(kuraRequestChannel.getRequestId());

            return new MqttTopic(topicTokens.toArray(new String[0]));
        } catch (Exception e) {
            throw new InvalidChannelException(e, kuraRequestChannel);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `translator/kura/mqtt/src/main/java/org/eclipse/kapua/translator/kura/mqtt/TranslatorRequestKuraMqtt.java`
#### Snippet
```java

            // Return Mqtt Topic
            return new MqttTopic(topicTokens.toArray(new String[0]));
        } catch (Exception e) {
            throw new InvalidChannelException(e, kuraRequestChannel);
```

## RuleId[id=NullArgumentToVariableArgMethod]
### NullArgumentToVariableArgMethod
Confusing argument `null`, unclear if a varargs or non-varargs call is desired
in `qa/common/src/main/java/org/eclipse/kapua/qa/common/cache/MapCache.java`
#### Snippet
```java
                    Object fieldValue;
                    try {
                        fieldValue = getter.invoke(object, null);
                        Method setter = setterMethods.get("s" + getterName.substring(1));
                        if (setter != null) {
```

## RuleId[id=TypeParameterExtendsObject]
### TypeParameterExtendsObject
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/app/annotated/AnnotatedApplication.java`
#### Snippet
```java

    private static void fillHandlersFromResourceMethod(final Map<String, ResourceHandler> handlers,
            final Class<? extends Object> clazz, final Object applicationInstance, final Method method)
            throws Exception {

```

### TypeParameterExtendsObject
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/app/annotated/AnnotatedApplication.java`
#### Snippet
```java
        Objects.requireNonNull(applicationInstance);

        final Class<? extends Object> clazz = applicationInstance.getClass();
        final Application app = clazz.getAnnotation(Application.class);
        if (app == null) {
```

### TypeParameterExtendsObject
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/app/annotated/AnnotatedApplication.java`
#### Snippet
```java
    }

    private static void fillHandlers(final Map<String, ResourceHandler> handlers, final Class<? extends Object> clazz,
            final Object applicationInstance) throws Exception {

```

### TypeParameterExtendsObject
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/app/annotated/AnnotatedApplication.java`
#### Snippet
```java

    private static void fillHandlersFromMethod(final Map<String, ResourceHandler> handlers,
            final Class<? extends Object> clazz, final Object applicationInstance, final Method method)
            throws Exception {

```

## RuleId[id=NonExceptionNameEndsWithException]
### NonExceptionNameEndsWithException
Non-exception class name `WaitTimeoutException` ends with 'Exception'
in `qa/common/src/main/java/org/eclipse/kapua/qa/common/WaitTimeoutException.java`
#### Snippet
```java
import java.time.Duration;

public class WaitTimeoutException extends AssertionError {

    private static final String DEFAULT_MESSAGE = "Waiting for condition";
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `out != null` is always `false`
in `qa/integration-steps/src/main/java/org/eclipse/kapua/qa/integration/steps/DockerSteps.java`
#### Snippet
```java
                }
            }
            if (out != null) {
                try {
                    out.close();
```

### ConstantValue
Condition `tmpConnectionUserCouplingMode == null` is always `false`
in `broker/core/src/main/java/org/eclipse/kapua/broker/core/plugin/authentication/AuthenticationLogic.java`
#### Snippet
```java
        if (tmp != null) {
            ConnectionUserCouplingMode tmpConnectionUserCouplingMode = ConnectionUserCouplingMode.valueOf(tmp);
            if (tmpConnectionUserCouplingMode == null) {
                throw new SecurityException(String
                        .format("Cannot parse the default Device-User coupling mode in the registry service configuration! (found '%s' - allowed values are 'LOOSE' - 'STRICT')", tmp));
```

### ConstantValue
Condition `nis == null` is always `false`
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/birth/BirthCertificateBuilder.java`
#### Snippet
```java
        try {
            final Enumeration<NetworkInterface> nis = NetworkInterface.getNetworkInterfaces();
            if (nis == null) {
                return;
            }
```

### ConstantValue
Condition `resource == null` is always `false`
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/app/annotated/AnnotatedApplication.java`
#### Snippet
```java
        resource = resourceBuilder.toString();

        if (verb == null || verb.isEmpty() || resource == null || resource.isEmpty()) {
            throw new IllegalStateException(
                    String.format("Method '%s' of class '%s' has not a valid name", name, clazz.getName()));
```

### ConstantValue
Value `channel` is always 'null'
in `service/datastore/internal/src/main/java/org/eclipse/kapua/service/datastore/internal/mediator/DatastoreChannel.java`
#### Snippet
```java
        // Must be not null and not single level wild card
        if (channel == null) {
            throw new InvalidChannelException("Invalid channel: " + channel);
        }

```

### ConstantValue
Condition `se instanceof LockedAccountException` is always `false`
in `service/security/shiro/src/main/java/org/eclipse/kapua/service/authentication/shiro/AuthenticationServiceShiroImpl.java`
#### Snippet
```java
            } else if (se instanceof DisabledAccountException) {
                kae = new KapuaAuthenticationException(KapuaAuthenticationErrorCodes.DISABLED_SESSION_CREDENTIAL, se, shiroAuthenticationToken.getPrincipal());
            } else if (se instanceof LockedAccountException) {
                kae = new KapuaAuthenticationException(KapuaAuthenticationErrorCodes.LOCKED_SESSION_CREDENTIAL, se, shiroAuthenticationToken.getPrincipal());
            } else if (se instanceof IncorrectCredentialsException) {
```

### ConstantValue
Value `value` is always 'null'
in `service/device/registry/test-steps/src/main/java/org/eclipse/kapua/service/device/registry/steps/KuraDevice.java`
#### Snippet
```java

        if (kuraPayload == null) {
            return value;
        }

```

### ConstantValue
Value `clazzToInstantiate` is always 'null'
in `commons/src/main/java/org/eclipse/kapua/commons/util/ClassUtil.java`
#### Snippet
```java
        }
        else {
            throw new KapuaException(KapuaErrorCodes.INTERNAL_ERROR, String.format(CANNOT_LOAD_INSTANCE_ERROR_MSG, clazz, clazzToInstantiate));
        }
        if (parameterTypes == null || parameterTypes.length <= 0) {
```

### ConstantValue
Condition `stackTraceElements != null` is always `true`
in `commons/src/main/java/org/eclipse/kapua/commons/security/KapuaSession.java`
#### Snippet
```java
        // 3 ---> "outside" caller class that should be checked
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        if (stackTraceElements != null && stackTraceElements.length > 4) {
            return TRUSTED_CLASSES.contains(MessageFormat.format(TRUST_CLASS_METHOD_PATTERN, stackTraceElements[3].getClassName(), stackTraceElements[3].getMethodName()));
        } else {
```

### ConstantValue
Condition `locatorConfigurations.isEmpty()` is always `false`
in `locator/guice/src/main/java/org/eclipse/kapua/locator/guice/KapuaModule.java`
#### Snippet
```java
            // Find locator configuration file
            List<URL> locatorConfigurations = Arrays.asList(ResourceUtils.getResource(resourceName));
            if (locatorConfigurations.isEmpty()) {
                return;
            }
```

### ConstantValue
Result of `tmpDom1.equals(null)` is always 'false'
in `service/security/test-steps/src/main/java/org/eclipse/kapua/service/authorization/steps/AuthorizationServiceSteps.java`
#### Snippet
```java
            Assert.assertNotNull(tmpDom1);
            Assert.assertTrue(tmpDom1.equals(tmpDom1));
            Assert.assertFalse(tmpDom1.equals(null));
            Assert.assertFalse(tmpDom1.equals(String.valueOf("")));
            Domain tmpDom2 = null;
```

### ConstantValue
Result of `role1.equals(null)` is always 'false'
in `service/security/test-steps/src/main/java/org/eclipse/kapua/service/authorization/steps/AuthorizationServiceSteps.java`
#### Snippet
```java
        Assert.assertNotNull(miscObj);
        Assert.assertTrue(role1.equals(role1));
        Assert.assertFalse(role1.equals(null));
        Assert.assertFalse(role1.equals(miscObj));
        Assert.assertTrue(role1.equals(role2));
```

### ConstantValue
Result of `accRole1.equals(null)` is always 'false'
in `service/security/test-steps/src/main/java/org/eclipse/kapua/service/authorization/steps/AuthorizationServiceSteps.java`
#### Snippet
```java
        try {
            Assert.assertTrue(accRole1.equals(accRole1));
            Assert.assertFalse(accRole1.equals(null));
            Assert.assertFalse(accRole1.equals(Integer.valueOf(15)));
            Assert.assertTrue(accRole1.equals(accRole2));
```

### ConstantValue
Result of `accPerm1.equals(null)` is always 'false'
in `service/security/test-steps/src/main/java/org/eclipse/kapua/service/authorization/steps/AuthorizationServiceSteps.java`
#### Snippet
```java
        Permission tmpPerm2 = permissionFactory.newPermission(new TestDomain(), Actions.write, SYS_SCOPE_ID, getKapuaId());
        Assert.assertTrue(accPerm1.equals(accPerm1));
        Assert.assertFalse(accPerm1.equals(null));
        Assert.assertFalse(accPerm1.equals(Integer.valueOf(15)));
        Assert.assertTrue(accPerm1.equals(accPerm2));
```

### ConstantValue
Result of `perm1.equals(null)` is always 'false'
in `service/security/test-steps/src/main/java/org/eclipse/kapua/service/authorization/steps/AuthorizationServiceSteps.java`
#### Snippet
```java
        Permission perm2 = permissionFactory.newPermission(new TestDomain("test_domain_1"), Actions.read, getKapuaId(10), getKapuaId(100));
        Assert.assertTrue(perm1.equals(perm1));
        Assert.assertFalse(perm1.equals(null));
        Assert.assertFalse(perm1.equals(Integer.valueOf(10)));
        Assert.assertTrue(perm1.equals(perm2));
```

### ConstantValue
Result of `perm1.equals(null)` is always 'false'
in `service/security/test-steps/src/main/java/org/eclipse/kapua/service/authorization/steps/AuthorizationServiceSteps.java`
#### Snippet
```java
        Assert.assertNotNull(perm2);
        Assert.assertTrue(perm1.equals(perm1));
        Assert.assertFalse(perm1.equals(null));
        Assert.assertFalse(perm1.equals(miscObj));
        Assert.assertTrue(perm1.equals(perm2));
```

## RuleId[id=MethodOverridesStaticMethod]
### MethodOverridesStaticMethod
Method `internalError()` tries to override a static method of a superclass
in `commons/src/main/java/org/eclipse/kapua/commons/configuration/exception/KapuaConfigurationException.java`
#### Snippet
```java
     * @return
     */
    public static KapuaConfigurationException internalError(String message) {
        return new KapuaConfigurationException(KapuaConfigurationErrorCodes.INTERNAL_ERROR, null, message);
    }
```

## RuleId[id=IOResource]
### IOResource
'ProviderOpenIDLocator' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `service/security/shiro/src/main/java/org/eclipse/kapua/service/authentication/shiro/utils/JwtProcessors.java`
#### Snippet
```java

    public static JwtProcessor createDefault() throws OpenIDException {
        ProviderOpenIDLocator singleSignOnLocator = new ProviderOpenIDLocator();
        return singleSignOnLocator.getProcessor();
    }
```

### IOResource
'ProviderOpenIDLocator' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `service/security/shiro/src/main/java/org/eclipse/kapua/service/authentication/shiro/realm/JwtAuthenticatingRealm.java`
#### Snippet
```java
        // Get services
        UserService userService = KapuaLocator.getInstance().getService(UserService.class);
        ProviderOpenIDLocator singleSignOnLocator = new ProviderOpenIDLocator();
        OpenIDService openIDService = singleSignOnLocator.getService();

```

## RuleId[id=RedundantLengthCheck]
### RedundantLengthCheck
Redundant array length check
in `service/api/src/main/java/org/eclipse/kapua/ExceptionMessageUtils.java`
#### Snippet
```java
    private static String buildGenericErrorMessage(Object[] args) {
        StringJoiner joiner = new StringJoiner(", ");
        if (args != null && args.length > 0) {
            for (Object arg : args) {
                if (arg instanceof Iterable) {
```

## RuleId[id=FieldMayBeStatic]
### FieldMayBeStatic
Field `name` may be 'static'
in `service/job/api/src/main/java/org/eclipse/kapua/service/job/JobDomain.java`
#### Snippet
```java
public class JobDomain extends AbstractDomain implements Domain {

    private final String name = "job";
    private final Set<Actions> actions = new HashSet<>(Arrays.asList(Actions.read, Actions.delete, Actions.write, Actions.execute));

```

### FieldMayBeStatic
Field `name` may be 'static'
in `service/scheduler/api/src/main/java/org/eclipse/kapua/service/scheduler/SchedulerDomain.java`
#### Snippet
```java
public class SchedulerDomain extends AbstractDomain {

    private final String name = "scheduler";
    private final Set<Actions> actions = new HashSet<>(Arrays.asList(Actions.read, Actions.delete, Actions.write, Actions.execute));

```

### FieldMayBeStatic
Field `name` may be 'static'
in `service/account/api/src/main/java/org/eclipse/kapua/service/account/AccountDomain.java`
#### Snippet
```java
public class AccountDomain extends AbstractDomain {

    private final String name = "account";
    private final Set<Actions> actions = new HashSet<>(Arrays.asList(Actions.read, Actions.delete, Actions.write));

```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `PermissionAttributes` has only 'static' members, and lacks a 'private' constructor
in `service/security/authorization/api/src/main/java/org/eclipse/kapua/service/authorization/permission/PermissionAttributes.java`
#### Snippet
```java
package org.eclipse.kapua.service.authorization.permission;

public class PermissionAttributes {

    protected PermissionAttributes() { }
```

### UtilityClassWithoutPrivateConstructor
Class `Constants` has only 'static' members, and lacks a 'private' constructor
in `service/device/call/kura/src/main/java/org/eclipse/kapua/service/device/call/kura/model/deploy/PackageMetrics.java`
#### Snippet
```java
    }

    protected static class Constants {
        protected static final String DP_NAME = "dp.name";
        protected static final String DP_VERSION = "dp.version";
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `getService` may produce `NullPointerException`
in `service/user/internal/src/main/java/org/eclipse/kapua/service/user/internal/UserServiceImpl.java`
#### Snippet
```java
            // service bus error. Throw some exception?
        }
        LOGGER.info("UserService: received kapua event from {}, operation {}", kapuaEvent.getService(), kapuaEvent.getOperation());
        if ("account".equals(kapuaEvent.getService()) && "delete".equals(kapuaEvent.getOperation())) {
            deleteUserByAccountId(kapuaEvent.getScopeId(), kapuaEvent.getEntityId());
```

### DataFlowIssue
Method invocation `forEach` may produce `NullPointerException`
in `qa/integration-steps/src/main/java/org/eclipse/kapua/qa/integration/steps/DockerSteps.java`
#### Snippet
```java
                    StringBuilder builder = new StringBuilder();
                    builder.append(image.id());
                    image.repoTags().forEach(value -> builder.append("\t").append(value));
                    logger.info("{}", builder.toString());
                }
```

### DataFlowIssue
Method invocation `forEach` may produce `NullPointerException`
in `qa/integration-steps/src/main/java/org/eclipse/kapua/qa/integration/steps/DockerSteps.java`
#### Snippet
```java
            } else {
                containers.forEach(container -> {
                    container.names().forEach((containerName) -> {
                        if (containerName.equals(name)) {
                            try {
```

### DataFlowIssue
Method invocation `forEach` may produce `NullPointerException`
in `qa/integration-steps/src/main/java/org/eclipse/kapua/qa/integration/steps/DockerSteps.java`
#### Snippet
```java
            count = containerList.size();
            containerList.forEach(container -> {
                container.names().forEach((containerName) -> logger.info("\t\t{}", containerName));
            });
        } catch (DockerException | InterruptedException e) {
```

### DataFlowIssue
Dereference of `image.repoTags()` may produce `NullPointerException`
in `qa/integration-steps/src/main/java/org/eclipse/kapua/qa/integration/steps/DockerSteps.java`
#### Snippet
```java

    private boolean filterImageToPrint(Image image) {
        for (String tag : image.repoTags()) {
            String tagToLowerCase = tag.toLowerCase();
            if (tagToLowerCase.contains("kapua") || tagToLowerCase.contains("elasticsearch") || tagToLowerCase.contains("activemq") || tagToLowerCase.contains("artemis")) {
```

### DataFlowIssue
Method invocation `getService` may produce `NullPointerException`
in `service/device/registry/internal/src/main/java/org/eclipse/kapua/service/device/registry/internal/DeviceRegistryServiceImpl.java`
#### Snippet
```java
            //service bus error. Throw some exception?
        }
        LOGGER.info("DeviceRegistryService: received kapua event from {}, operation {}", kapuaEvent.getService(), kapuaEvent.getOperation());
        if ("group".equals(kapuaEvent.getService()) && "delete".equals(kapuaEvent.getOperation())) {
            deleteDeviceByGroupId(kapuaEvent.getScopeId(), kapuaEvent.getEntityId());
```

### DataFlowIssue
Method invocation `getClientId` may produce `NullPointerException`
in `service/device/registry/internal/src/main/java/org/eclipse/kapua/service/device/registry/lifecycle/internal/DeviceLifeCycleServiceImpl.java`
#### Snippet
```java
                break;
            } catch (KapuaOptimisticLockingException e) {
                LOG.warn("Concurrent update for device: {}... Attempt: {}/{}. {}", device.getClientId(), retry, MAX_RETRY, retry < MAX_RETRY ? "Retrying..." : "Raising exception!");

                if (retry < MAX_RETRY) {
```

### DataFlowIssue
Method invocation `getService` may produce `NullPointerException`
in `service/device/registry/internal/src/main/java/org/eclipse/kapua/service/device/registry/connection/internal/DeviceConnectionServiceImpl.java`
#### Snippet
```java
            //service bus error. Throw some exception?
        }
        LOG.info("DeviceConnectionService: received kapua event from {}, operation {}", kapuaEvent.getService(), kapuaEvent.getOperation());
        if ("account".equals(kapuaEvent.getService()) && "delete".equals(kapuaEvent.getOperation())) {
            deleteConnectionByAccountId(kapuaEvent.getScopeId(), kapuaEvent.getEntityId());
```

### DataFlowIssue
Method invocation `getDataIndexName` may produce `NullPointerException`
in `service/datastore/internal/src/main/java/org/eclipse/kapua/service/datastore/internal/MessageStoreFacade.java`
#### Snippet
```java
                LOG.warn("Retrieving metadata error", e);
            }
            String indexName = schemaMetadata.getDataIndexName();
            TypeDescriptor typeDescriptor = new TypeDescriptor(indexName, MessageSchema.MESSAGE_TYPE_NAME);
            getElasticsearchClient().delete(typeDescriptor, id.toString());
```

### DataFlowIssue
Method invocation `getService` may produce `NullPointerException`
in `service/security/shiro/src/main/java/org/eclipse/kapua/service/authorization/role/shiro/RoleServiceImpl.java`
#### Snippet
```java
        }

        LOG.info("RoleService: received kapua event from {}, operation {}", kapuaEvent.getService(), kapuaEvent.getOperation());
        if ("account".equals(kapuaEvent.getService()) && "delete".equals(kapuaEvent.getOperation())) {
            deleteRoleByAccountId(kapuaEvent.getScopeId(), kapuaEvent.getEntityId());
```

### DataFlowIssue
Method invocation `getService` may produce `NullPointerException`
in `service/security/shiro/src/main/java/org/eclipse/kapua/service/authorization/group/shiro/GroupServiceImpl.java`
#### Snippet
```java
        }

        LOG.info("GroupService: received kapua event from {}, operation {}", kapuaEvent.getService(), kapuaEvent.getOperation());
        if ("account".equals(kapuaEvent.getService()) && "delete".equals(kapuaEvent.getOperation())) {
            deleteGroupByAccountId(kapuaEvent.getScopeId(), kapuaEvent.getEntityId());
```

### DataFlowIssue
Method invocation `getService` may produce `NullPointerException`
in `service/security/shiro/src/main/java/org/eclipse/kapua/service/authorization/domain/shiro/DomainRegistryServiceImpl.java`
#### Snippet
```java
            //service bus error. Throw some exception?
        }
        LOGGER.info("DomainRegistryService: received kapua event from {}, operation {}", kapuaEvent.getService(), kapuaEvent.getOperation());
        if ("account".equals(kapuaEvent.getService()) && "delete".equals(kapuaEvent.getOperation())) {
            deleteDomainByAccountId(kapuaEvent.getEntityId());
```

### DataFlowIssue
Method invocation `getService` may produce `NullPointerException`
in `service/security/shiro/src/main/java/org/eclipse/kapua/service/authorization/access/shiro/AccessInfoServiceImpl.java`
#### Snippet
```java
            //service bus error. Throw some exception?
        }
        LOGGER.info("AccessInfoService: received kapua event from {}, operation {}", kapuaEvent.getService(), kapuaEvent.getOperation());
        if ("user".equals(kapuaEvent.getService()) && "delete".equals(kapuaEvent.getOperation())) {
            deleteAccessInfoByUserId(kapuaEvent.getScopeId(), kapuaEvent.getEntityId());
```

### DataFlowIssue
Method invocation `getScopeId` may produce `NullPointerException`
in `service/security/shiro/src/main/java/org/eclipse/kapua/service/authentication/shiro/realm/ApiKeyAuthenticatingRealm.java`
#### Snippet
```java
        //
        // Get CredentialService config
        Map<String, Object> credentialServiceConfig = getCredentialServiceConfig(credential.getScopeId());

        //
```

### DataFlowIssue
Method invocation `getScopeId` may produce `NullPointerException`
in `service/security/shiro/src/main/java/org/eclipse/kapua/service/authentication/shiro/realm/JwtAuthenticatingRealm.java`
#### Snippet
```java
        //
        // Check account
        Account account = checkAccount(user.getScopeId());

        //
```

### DataFlowIssue
Method invocation `getService` may produce `NullPointerException`
in `service/security/shiro/src/main/java/org/eclipse/kapua/service/authentication/token/shiro/AccessTokenServiceImpl.java`
#### Snippet
```java
        }

        LOGGER.info("AccessTokenService: received kapua event from {}, operation {}", kapuaEvent.getService(), kapuaEvent.getOperation());
        if ("user".equals(kapuaEvent.getService()) && "delete".equals(kapuaEvent.getOperation())) {
            deleteAccessTokenByUserId(kapuaEvent.getScopeId(), kapuaEvent.getEntityId());
```

### DataFlowIssue
Method invocation `getService` may produce `NullPointerException`
in `service/security/shiro/src/main/java/org/eclipse/kapua/service/authentication/credential/shiro/CredentialServiceImpl.java`
#### Snippet
```java
            //service bus error. Throw some exception?
        }
        LOGGER.info("CredentialService: received kapua event from {}, operation {}", kapuaEvent.getService(), kapuaEvent.getOperation());
        if ("user".equals(kapuaEvent.getService()) && "delete".equals(kapuaEvent.getOperation())) {
            deleteCredentialByUserId(kapuaEvent.getScopeId(), kapuaEvent.getEntityId());
```

### DataFlowIssue
Method invocation `getServerIp` may produce `NullPointerException`
in `service/device/registry/test-steps/src/main/java/org/eclipse/kapua/service/device/registry/steps/BrokerSteps.java`
#### Snippet
```java
            return;
        }
        Assert.assertEquals(serverIp, deviceConn.getServerIp());
    }

```

### DataFlowIssue
Method invocation `toURI` may produce `NullPointerException`
in `service/device/registry/test-steps/src/main/java/org/eclipse/kapua/service/device/registry/steps/BrokerSteps.java`
#### Snippet
```java
    public void publishMessageByClient(String topic, String content, String clientName) throws Exception {
        MqttClient mqttClient = (MqttClient) stepData.get(clientName);
        byte[] payload = Files.readAllBytes(Paths.get(getClass().getResource(content).toURI()));

        if (mqttClient == null) {
```

### DataFlowIssue
Method invocation `toURI` may produce `NullPointerException`
in `service/device/registry/test-steps/src/main/java/org/eclipse/kapua/service/device/registry/steps/KuraDevice.java`
#### Snippet
```java

                responseTopic = $EDC + CLIENT_ACCOUNT + "/" + callbackParam.getClientId() + "/ASSET-V1/REPLY/" + callbackParam.getRequestId();
                responsePayload = Files.readAllBytes(Paths.get(getClass().getResource(assetStateChanged ? "/mqtt/KapuaPool-client-id_ASSET-V1_READ_req-id_assets_updated_assets.mqtt" : "/mqtt/KapuaPool-client-id_ASSET-V1_READ_req-id_assets.mqtt").toURI()));

                mqttClient.publish(responseTopic, responsePayload, 0, false);
```

### DataFlowIssue
Method invocation `toURI` may produce `NullPointerException`
in `service/device/registry/test-steps/src/main/java/org/eclipse/kapua/service/device/registry/steps/KuraDevice.java`
#### Snippet
```java

                responseTopic = $EDC + CLIENT_ACCOUNT + "/" + callbackParam.getClientId() + "/ASSET-V1/REPLY/" + callbackParam.getRequestId();
                responsePayload = Files.readAllBytes(Paths.get(getClass().getResource("/mqtt/KapuaPool-client-id_ASSET-V1_WRITE_req-id_assets.mqtt").toURI()));

                assetStateChanged = true;
```

### DataFlowIssue
Method invocation `toURI` may produce `NullPointerException`
in `service/device/registry/test-steps/src/main/java/org/eclipse/kapua/service/device/registry/steps/KuraDevice.java`
#### Snippet
```java

                responseTopic = $EDC + CLIENT_ACCOUNT + "/" + callbackParam.getClientId() + "/CMD-V1/REPLY/" + callbackParam.getRequestId();
                responsePayload = Files.readAllBytes(Paths.get(getClass().getResource("/mqtt/KapuaPool-client-id_CMD-V1_REPLY_req-id_command.mqtt").toURI()));

                mqttClient.publish(responseTopic, responsePayload, 0, false);
```

### DataFlowIssue
Method invocation `toURI` may produce `NullPointerException`
in `service/device/registry/test-steps/src/main/java/org/eclipse/kapua/service/device/registry/steps/KuraDevice.java`
#### Snippet
```java

                responseTopic = $EDC + CLIENT_ACCOUNT + "/" + callbackParam.getClientId() + "/CONF-V1/REPLY/" + callbackParam.getRequestId();
                responsePayload = Files.readAllBytes(Paths.get(getClass().getResource(configurationChanged ? "/mqtt/KapuaPool-client-id_CONF-V1_REPLY_req-id_updated_configurations.mqtt" : "/mqtt/KapuaPool-client-id_CONF-V1_REPLY_req-id_inital_configurations.mqtt").toURI()));

                mqttClient.publish(responseTopic, responsePayload, 0, false);
```

### DataFlowIssue
Method invocation `toURI` may produce `NullPointerException`
in `service/device/registry/test-steps/src/main/java/org/eclipse/kapua/service/device/registry/steps/KuraDevice.java`
#### Snippet
```java

                responseTopic = $EDC + CLIENT_ACCOUNT + "/" + callbackParam.getClientId() + "/CONF-V1/REPLY/" + callbackParam.getRequestId();
                responsePayload = Files.readAllBytes(Paths.get(getClass().getResource("/mqtt/KapuaPool-client-id_CONF-V1_PUT_configurations.mqtt").toURI()));

                configurationChanged = true;
```

### DataFlowIssue
Method invocation `toURI` may produce `NullPointerException`
in `service/device/registry/test-steps/src/main/java/org/eclipse/kapua/service/device/registry/steps/KuraDevice.java`
#### Snippet
```java

                responseTopic = $EDC + CLIENT_ACCOUNT + "/" + callbackParam.getClientId() + DEPLOY_V2_REPLY + callbackParam.getRequestId();
                responsePayload = Files.readAllBytes(Paths.get(getClass().getResource(packageListChanged ? "/mqtt/KapuaPool-client-id_DEPLOY-V2_REPLY_req-id_packages_updated_list.mqtt" : (packageListChangedAfterUninstall == true ? "/mqtt/KapuaPoolClient-id_DEPLOY_V2_REPLY_package_list_after_uninstall.mqtt" : "/mqtt/KapuaPool-client-id_DEPLOY-V2_REPLY_req-id_packages_initial_list.mqtt")).toURI()));

                mqttClient.publish(responseTopic, responsePayload, 0, false);
```

### DataFlowIssue
Method invocation `toURI` may produce `NullPointerException`
in `service/device/registry/test-steps/src/main/java/org/eclipse/kapua/service/device/registry/steps/KuraDevice.java`
#### Snippet
```java

                responseTopic = $EDC + CLIENT_ACCOUNT + "/" + callbackParam.getClientId() + DEPLOY_V2_REPLY + callbackParam.getRequestId();
                responsePayload = Files.readAllBytes(Paths.get(getClass().getResource(bundleStateChanged ? "/mqtt/KapuaPool-client-id_DEPLOY-V2_REPLY_req-id_bundles_updated_state.mqtt" : "/mqtt/KapuaPool-client-id_DEPLOY-V2_REPLY_req-id_bundles_inital_state.mqtt").toURI()));

                mqttClient.publish(responseTopic, responsePayload, 0, false);
```

### DataFlowIssue
Method invocation `toURI` may produce `NullPointerException`
in `service/device/registry/test-steps/src/main/java/org/eclipse/kapua/service/device/registry/steps/KuraDevice.java`
#### Snippet
```java

                responseTopic = $EDC + CLIENT_ACCOUNT + "/" + callbackParam.getClientId() + DEPLOY_V2_REPLY + callbackParam.getRequestId();
                responsePayload = Files.readAllBytes(Paths.get(getClass().getResource("/mqtt/KapuaPool-client-id_DEPLOY-V2_EXEC_START_bundle_id.mqtt").toURI()));

                bundleStateChanged = true;
```

### DataFlowIssue
Method invocation `toURI` may produce `NullPointerException`
in `service/device/registry/test-steps/src/main/java/org/eclipse/kapua/service/device/registry/steps/KuraDevice.java`
#### Snippet
```java

                responseTopic = $EDC + CLIENT_ACCOUNT + "/" + callbackParam.getClientId() + DEPLOY_V2_REPLY + callbackParam.getRequestId();
                responsePayload = Files.readAllBytes(Paths.get(getClass().getResource("/mqtt/KapuaPool-client-id_DEPLOY-V2_EXEC_STOP_bundle_id.mqtt").toURI()));

                bundleStateChanged = true;
```

### DataFlowIssue
Method invocation `toURI` may produce `NullPointerException`
in `service/device/registry/test-steps/src/main/java/org/eclipse/kapua/service/device/registry/steps/KuraDevice.java`
#### Snippet
```java
                    responseTopic = $EDC + CLIENT_ACCOUNT + "/" + callbackParam.getClientId() + INVENTORY_V1_REPLY + callbackParam.getRequestId();

                    byte[] responseBody = Files.readAllBytes(Paths.get(getClass().getResource("/mqtt/INVENTORY-V1_GET_inventory_reply.json").toURI()));

                    KuraPayload kuraResponsePayload = new KuraPayload();
```

### DataFlowIssue
Method invocation `toURI` may produce `NullPointerException`
in `service/device/registry/test-steps/src/main/java/org/eclipse/kapua/service/device/registry/steps/KuraDevice.java`
#### Snippet
```java
                    callbackParam = extractCallback(requestPayload);

                    byte[] responseBody = Files.readAllBytes(Paths.get(getClass().getResource("/mqtt/INVENTORY-V1_GET_inventory_bundles_reply.json").toURI()));

                    String responseBodyString = new String(responseBody);
```

### DataFlowIssue
Method invocation `toURI` may produce `NullPointerException`
in `service/device/registry/test-steps/src/main/java/org/eclipse/kapua/service/device/registry/steps/KuraDevice.java`
#### Snippet
```java
                    responseTopic = $EDC + CLIENT_ACCOUNT + "/" + callbackParam.getClientId() + INVENTORY_V1_REPLY + callbackParam.getRequestId();

                    byte[] responseBody = Files.readAllBytes(Paths.get(getClass().getResource("/mqtt/INVENTORY-V1_GET_inventory_containers_reply.json").toURI()));

                    KuraPayload kuraResponsePayload = new KuraPayload();
```

### DataFlowIssue
Method invocation `toURI` may produce `NullPointerException`
in `service/device/registry/test-steps/src/main/java/org/eclipse/kapua/service/device/registry/steps/KuraDevice.java`
#### Snippet
```java
                    responseTopic = $EDC + CLIENT_ACCOUNT + "/" + callbackParam.getClientId() + INVENTORY_V1_REPLY + callbackParam.getRequestId();

                    byte[] responseBody = Files.readAllBytes(Paths.get(getClass().getResource("/mqtt/INVENTORY-V1_GET_inventory_system_reply.json").toURI()));

                    KuraPayload kuraResponsePayload = new KuraPayload();
```

### DataFlowIssue
Method invocation `toURI` may produce `NullPointerException`
in `service/device/registry/test-steps/src/main/java/org/eclipse/kapua/service/device/registry/steps/KuraDevice.java`
#### Snippet
```java
                    responseTopic = $EDC + CLIENT_ACCOUNT + "/" + callbackParam.getClientId() + INVENTORY_V1_REPLY + callbackParam.getRequestId();

                    byte[] responseBody = Files.readAllBytes(Paths.get(getClass().getResource("/mqtt/INVENTORY-V1_GET_inventory_packages_reply.json").toURI()));

                    KuraPayload kuraResponsePayload = new KuraPayload();
```

### DataFlowIssue
Method invocation `toURI` may produce `NullPointerException`
in `service/device/registry/test-steps/src/main/java/org/eclipse/kapua/service/device/registry/steps/KuraDevice.java`
#### Snippet
```java
                    responseTopic = $EDC + CLIENT_ACCOUNT + "/" + callbackParam.getClientId() + KEYS_V1_REPLY + callbackParam.getRequestId();

                    byte[] responseBody = Files.readAllBytes(Paths.get(getClass().getResource("/mqtt/KEYS-V1_GET_keystores_reply.json").toURI()));

                    KuraPayload kuraResponsePayload = new KuraPayload();
```

### DataFlowIssue
Method invocation `toURI` may produce `NullPointerException`
in `service/device/registry/test-steps/src/main/java/org/eclipse/kapua/service/device/registry/steps/KuraDevice.java`
#### Snippet
```java

                        if (queryJsonString.contains("alias")) {
                            responseBody = Files.readAllBytes(Paths.get(getClass().getResource("/mqtt/KEYS-V1_GET_keystores_entries_alias_reply.json").toURI()));
                        } else if (queryJsonString.contains("keystoreServicePid")) {
                            responseBody = Files.readAllBytes(Paths.get(getClass().getResource("/mqtt/KEYS-V1_GET_keystores_entries_keystore_reply.json").toURI()));
```

### DataFlowIssue
Method invocation `toURI` may produce `NullPointerException`
in `service/device/registry/test-steps/src/main/java/org/eclipse/kapua/service/device/registry/steps/KuraDevice.java`
#### Snippet
```java
                            responseBody = Files.readAllBytes(Paths.get(getClass().getResource("/mqtt/KEYS-V1_GET_keystores_entries_alias_reply.json").toURI()));
                        } else if (queryJsonString.contains("keystoreServicePid")) {
                            responseBody = Files.readAllBytes(Paths.get(getClass().getResource("/mqtt/KEYS-V1_GET_keystores_entries_keystore_reply.json").toURI()));
                        }
                    } else {
```

### DataFlowIssue
Method invocation `toURI` may produce `NullPointerException`
in `service/device/registry/test-steps/src/main/java/org/eclipse/kapua/service/device/registry/steps/KuraDevice.java`
#### Snippet
```java

                        if (keystoreInstalledCertificate == 0 && keystoreInstalledKeypair == 0) {
                            responseBody = Files.readAllBytes(Paths.get(getClass().getResource("/mqtt/KEYS-V1_GET_keystores_entries_default_reply.json").toURI()));
                        } else if (keystoreInstalledCertificate == 1 && keystoreInstalledKeypair == 0) {
                            responseBody = Files.readAllBytes(Paths.get(getClass().getResource("/mqtt/KEYS-V1_GET_keystores_entries_cert_installed_reply.json").toURI()));
```

### DataFlowIssue
Method invocation `toURI` may produce `NullPointerException`
in `service/device/registry/test-steps/src/main/java/org/eclipse/kapua/service/device/registry/steps/KuraDevice.java`
#### Snippet
```java
                            responseBody = Files.readAllBytes(Paths.get(getClass().getResource("/mqtt/KEYS-V1_GET_keystores_entries_default_reply.json").toURI()));
                        } else if (keystoreInstalledCertificate == 1 && keystoreInstalledKeypair == 0) {
                            responseBody = Files.readAllBytes(Paths.get(getClass().getResource("/mqtt/KEYS-V1_GET_keystores_entries_cert_installed_reply.json").toURI()));
                        } else if (keystoreInstalledCertificate == 1 && keystoreInstalledKeypair == 1) {
                            responseBody = Files.readAllBytes(Paths.get(getClass().getResource("/mqtt/KEYS-V1_GET_keystores_entries_cert_key_installed_reply.json").toURI()));
```

### DataFlowIssue
Method invocation `toURI` may produce `NullPointerException`
in `service/device/registry/test-steps/src/main/java/org/eclipse/kapua/service/device/registry/steps/KuraDevice.java`
#### Snippet
```java
                            responseBody = Files.readAllBytes(Paths.get(getClass().getResource("/mqtt/KEYS-V1_GET_keystores_entries_cert_installed_reply.json").toURI()));
                        } else if (keystoreInstalledCertificate == 1 && keystoreInstalledKeypair == 1) {
                            responseBody = Files.readAllBytes(Paths.get(getClass().getResource("/mqtt/KEYS-V1_GET_keystores_entries_cert_key_installed_reply.json").toURI()));
                        } else if (keystoreInstalledCertificate == 0 && keystoreInstalledKeypair == 1) {
                            responseBody = Files.readAllBytes(Paths.get(getClass().getResource("/mqtt/KEYS-V1_GET_keystores_entries_key_installed_reply.json").toURI()));
```

### DataFlowIssue
Method invocation `toURI` may produce `NullPointerException`
in `service/device/registry/test-steps/src/main/java/org/eclipse/kapua/service/device/registry/steps/KuraDevice.java`
#### Snippet
```java
                            responseBody = Files.readAllBytes(Paths.get(getClass().getResource("/mqtt/KEYS-V1_GET_keystores_entries_cert_key_installed_reply.json").toURI()));
                        } else if (keystoreInstalledCertificate == 0 && keystoreInstalledKeypair == 1) {
                            responseBody = Files.readAllBytes(Paths.get(getClass().getResource("/mqtt/KEYS-V1_GET_keystores_entries_key_installed_reply.json").toURI()));
                        }
                    }
```

### DataFlowIssue
Method invocation `toURI` may produce `NullPointerException`
in `service/device/registry/test-steps/src/main/java/org/eclipse/kapua/service/device/registry/steps/KuraDevice.java`
#### Snippet
```java
                        if (queryJsonString.contains("\"alias\":\"localhost\"") &&
                                queryJsonString.contains("\"keystoreServicePid\":\"HttpsKeystore\"")) {
                            responseBody = Files.readAllBytes(Paths.get(getClass().getResource("/mqtt/KEYS-V1_GET_keystores_entry_reply.json").toURI()));
                        }
                    }
```

### DataFlowIssue
Method invocation `toURI` may produce `NullPointerException`
in `service/device/registry/test-steps/src/main/java/org/eclipse/kapua/service/device/registry/steps/KuraDevice.java`
#### Snippet
```java

                            if (queryJsonString.contains("\"alias\":\"localhostFixed\"")) {
                                resposnseBody = Files.readAllBytes(Paths.get(getClass().getResource("/mqtt/KEYS-V1_POST_keystores_entries_csr_fixed_reply.json").toURI()));
                                responseCode = 200;
                            } else if (queryJsonString.contains("\"alias\":\"localhostKuraBugged\"")) {
```

### DataFlowIssue
Method invocation `toURI` may produce `NullPointerException`
in `service/device/registry/test-steps/src/main/java/org/eclipse/kapua/service/device/registry/steps/KuraDevice.java`
#### Snippet
```java
                                responseCode = 200;
                            } else if (queryJsonString.contains("\"alias\":\"localhostKuraBugged\"")) {
                                resposnseBody = Files.readAllBytes(Paths.get(getClass().getResource("/mqtt/KEYS-V1_POST_keystores_entries_csr_kurabugged_reply.txt").toURI()));
                                responseCode = 200;
                            } else {
```

### DataFlowIssue
Method invocation `toURI` may produce `NullPointerException`
in `service/device/registry/test-steps/src/main/java/org/eclipse/kapua/service/device/registry/steps/KuraDevice.java`
#### Snippet
```java
     */
    public void sendMessageFromFile(String topic, int qos, boolean retained, String fileName) throws MqttException, IOException, URISyntaxException {
        byte[] payload = Files.readAllBytes(Paths.get(getClass().getResource(fileName).toURI()));

        mqttClient.publish(topic, payload, qos, retained);
```

### DataFlowIssue
Argument `jobExecutionList` might be null
in `service/job/test-steps/src/main/java/org/eclipse/kapua/service/job/steps/JobExecutionServiceSteps.java`
#### Snippet
```java
                Thread.sleep(1000);
            }
            logJobInfo(jobExecutionList, job, execution);
            jobInfoAssertCheck(jobExecutionList, jobExecution, job, jobName, count, greaterThan);
        } catch (KapuaException ex) {
```

### DataFlowIssue
Argument `job` might be null
in `service/job/test-steps/src/main/java/org/eclipse/kapua/service/job/steps/JobExecutionServiceSteps.java`
#### Snippet
```java
                Thread.sleep(1000);
            }
            logJobInfo(jobExecutionList, job, execution);
            jobInfoAssertCheck(jobExecutionList, jobExecution, job, jobName, count, greaterThan);
        } catch (KapuaException ex) {
```

### DataFlowIssue
Method invocation `getSize` may produce `NullPointerException`
in `service/job/test-steps/src/main/java/org/eclipse/kapua/service/job/steps/JobExecutionServiceSteps.java`
#### Snippet
```java
        while (System.currentTimeMillis() < endWaitTime);
        if (greater) {
            Assert.assertTrue(resultList.getSize() >= numberOfExecutions);
        } else {
            Assert.assertEquals(numberOfExecutions, resultList.getSize());
```

### DataFlowIssue
Method invocation `getSize` may produce `NullPointerException`
in `service/job/test-steps/src/main/java/org/eclipse/kapua/service/job/steps/JobExecutionServiceSteps.java`
#### Snippet
```java
            Assert.assertTrue(resultList.getSize() >= numberOfExecutions);
        } else {
            Assert.assertEquals(numberOfExecutions, resultList.getSize());
        }
    }
```

### DataFlowIssue
Casting `value` to `byte[]` may produce `ClassCastException`
in `service/device/call/kura/src/main/java/org/eclipse/kapua/service/device/call/kura/model/type/KuraObjectValueConverter.java`
#### Snippet
```java
            Class<?> clazz = value.getClass();
            if (clazz == byte[].class || clazz == Byte[].class) {
                stringValue = DatatypeConverter.printBase64Binary((byte[]) value);
            } else {
                // String
```

### DataFlowIssue
Argument `inputStream` might be null
in `commons/src/main/java/org/eclipse/kapua/commons/jpa/ResourceSqlScriptExecutor.java`
#### Snippet
```java
                try (
                    InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream(qStr);
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream))) {

                    String sqlLine;
```

### DataFlowIssue
Dereference of `dirContents` may produce `NullPointerException`
in `commons/src/main/java/org/eclipse/kapua/commons/jpa/SimpleSqlScriptExecutor.java`
#### Snippet
```java

        String sep = String.valueOf(File.separatorChar);
        for (String sqlItem : dirContents) {
            String sqlFileName = scanPath + (scanPath.endsWith(sep) ? "" : sep) + sqlItem;
            File sqlFile = new File(sqlFileName);
```

### DataFlowIssue
Method invocation `isTransactionActive` may produce `NullPointerException`
in `commons/src/main/java/org/eclipse/kapua/commons/jpa/EntityManagerSession.java`
#### Snippet
```java
                        instance = container.onResult(manager);

                        if (manager.isTransactionActive()) {
                            appendKapuaEvent(instance, manager, getServiceEventIfPresent(instance));
                        }
```

### DataFlowIssue
Method invocation `rollback` may produce `NullPointerException`
in `commons/src/main/java/org/eclipse/kapua/commons/jpa/EntityManagerSession.java`
#### Snippet
```java
                            logger.warn("Entity already exists. Cannot insert the entity, try again!");
                        } else {
                            manager.rollback();
                            throw KapuaExceptionUtils.convertPersistenceException(e);
                        }
```

### DataFlowIssue
Argument `deviceEventList` might be null
in `service/device/registry/test-steps/src/main/java/org/eclipse/kapua/service/device/registry/steps/DeviceRegistrySteps.java`
#### Snippet
```java
        stepData.put(DEVICE_EVENT_LIST, deviceEventList);
        if (timeoutOccurred) {
            printEvents(deviceEventList, events);
            if (greater) {
                Assert.assertEquals("Wrong device events count", events, deviceEventList.getSize());
```

### DataFlowIssue
Method invocation `getSize` may produce `NullPointerException`
in `service/device/registry/test-steps/src/main/java/org/eclipse/kapua/service/device/registry/steps/DeviceRegistrySteps.java`
#### Snippet
```java
            }
        }
        return greater ? events <= deviceEventList.getSize() : events == deviceEventList.getSize();
    }

```

### DataFlowIssue
Method invocation `getSize` may produce `NullPointerException`
in `service/device/registry/test-steps/src/main/java/org/eclipse/kapua/service/device/registry/steps/DeviceRegistrySteps.java`
#### Snippet
```java
            }
        }
        return greater ? events <= deviceEventList.getSize() : events == deviceEventList.getSize();
    }

```

### DataFlowIssue
Method invocation `getId` may produce `NullPointerException`
in `service/device/registry/test-steps/src/main/java/org/eclipse/kapua/service/device/registry/steps/DeviceRegistrySteps.java`
#### Snippet
```java
            stepData.put(DEVICE_CONNECTION_CREATOR, connectionCreator);
            stepData.put(DEVICE_CONNECTION, deviceConnection);
            stepData.put(DEVICE_CONNECTION_ID, deviceConnection.getId());
            stepData.put(DEVICE_CONNECTION_LIST, deviceConnections);
        } catch (KapuaException ex) {
```

### DataFlowIssue
Variable is already assigned to this value
in `commons/src/main/java/org/eclipse/kapua/commons/util/StringUtil.java`
#### Snippet
```java
        String result = null;
        if (value == null) {
            result = null;
        } else if (value instanceof String) {
            result = value.toString();
```

### DataFlowIssue
Variable is already assigned to this value
in `commons/src/main/java/org/eclipse/kapua/commons/event/ServiceEventHousekeeper.java`
#### Snippet
```java
            }
        }
        running = false;
    }

```

### DataFlowIssue
Method invocation `invoke` may produce `NullPointerException`
in `commons/src/main/java/org/eclipse/kapua/commons/event/ServiceInspector.java`
#### Snippet
```java
                                serviceEvent -> {
                                    try {
                                        listenerMethod.invoke(aService, serviceEvent);
                                    } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                                        throw KapuaException.internalError(e, String.format("Error invoking method %s", method.getName()));
```

### DataFlowIssue
Unboxing of `maxVal` may produce `NullPointerException`
in `commons/src/main/java/org/eclipse/kapua/commons/configuration/ValueTokenizer.java`
#### Snippet
```java
                    minVal = ad.getMin() == null ? null : Integer.valueOf(ad.getMin());
                    maxVal = ad.getMax() == null ? null : Integer.valueOf(ad.getMax());
                    if (minVal != null && s.length() < (Integer) maxVal) {
                        rangeError = true;
                    } else if (maxVal != null && s.length() > (Integer) maxVal) {
```

### DataFlowIssue
Argument `minVal` might be null
in `commons/src/main/java/org/eclipse/kapua/commons/configuration/ValueTokenizer.java`
#### Snippet
```java
                    maxVal = ad.getMax() == null ? null : Long.valueOf(ad.getMax());
                    Long longVal = Long.valueOf(s);
                    if (ad.getMin() != null && longVal.compareTo((Long) minVal) < 0) {
                        rangeError = true;
                    } else if (maxVal != null && longVal.compareTo((Long) maxVal) > 0) {
```

### DataFlowIssue
Argument `scriptUrl` might be null
in `commons/src/main/java/org/eclipse/kapua/commons/liquibase/KapuaLiquibaseClient.java`
#### Snippet
```java
            }
            try (FileOutputStream tmpStream = new FileOutputStream(changelogFile)) {
                IOUtils.write(IOUtils.toString(scriptUrl), tmpStream);
            }
            LOG.trace("Copied file: {}", changelogFile.getAbsolutePath());
```

### DataFlowIssue
Argument `changelogTempDirectory.listFiles((dir, name) -> name.endsWith(preMaster))` might be null
in `commons/src/main/java/org/eclipse/kapua/commons/liquibase/KapuaLiquibaseClient.java`
#### Snippet
```java

    protected static void executeMasters(Connection connection, String schema, File changelogTempDirectory, String preMaster, List<String> contexts) throws LiquibaseException {
        List<File> masterChangelogs = Arrays.asList(changelogTempDirectory.listFiles((dir, name) -> name.endsWith(preMaster)));

        LOG.info("\tMaster Liquibase files found: {}", masterChangelogs.size());
```

### DataFlowIssue
Method invocation `getUser` may produce `NullPointerException`
in `service/user/test-steps/src/main/java/org/eclipse/kapua/service/user/steps/UserServiceSteps.java`
#### Snippet
```java
        stepData.put("UserA", tmpUser);
        stepData.put(LAST_USER, tmpUser);
        stepData.put("User", tmpUser.getUser());
    }

```

### DataFlowIssue
Method invocation `getLoginFailures` may produce `NullPointerException`
in `service/user/test-steps/src/main/java/org/eclipse/kapua/service/user/steps/UserServiceSteps.java`
#### Snippet
```java
        }

        Assert.assertEquals(expectedCounter, credential.getLoginFailures());
    }

```

### DataFlowIssue
Method invocation `getUser` may produce `NullPointerException`
in `service/user/test-steps/src/main/java/org/eclipse/kapua/service/user/steps/UserServiceSteps.java`
#### Snippet
```java
        stepData.put("UserB", tmpUser);
        stepData.put(LAST_USER, tmpUser);
        stepData.put("User", tmpUser.getUser());
    }

```

### DataFlowIssue
Method invocation `getUser` may produce `NullPointerException`
in `service/user/test-steps/src/main/java/org/eclipse/kapua/service/user/steps/UserServiceSteps.java`
#### Snippet
```java
        }
        stepData.put(LAST_USER, tmpUser);
        stepData.put("LastUserId", tmpUser.getUser().getId());
        stepData.put("User", tmpUser.getUser());
    }
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'KapuaExceptionWithoutBundle' is still used
in `service/api/src/main/java/org/eclipse/kapua/KapuaExceptionWithoutBundle.java`
#### Snippet
```java
 */
@Deprecated
public class KapuaExceptionWithoutBundle extends KapuaException {
    public KapuaExceptionWithoutBundle(KapuaErrorCode code) {
        super(code);
```

### DeprecatedIsStillUsed
Deprecated member 'DEVICE_NOT_FOUND' is still used
in `service/api/src/main/java/org/eclipse/kapua/KapuaErrorCodes.java`
#### Snippet
```java
     */
    @Deprecated
    DEVICE_NOT_FOUND,

    ADMIN_ROLE_DELETED_ERROR,
```

### DeprecatedIsStillUsed
Deprecated member 'KapuaDuplicateExternalIdInAnotherAccountError' is still used
in `service/api/src/main/java/org/eclipse/kapua/KapuaDuplicateExternalIdInAnotherAccountError.java`
#### Snippet
```java
 */
@Deprecated
public class KapuaDuplicateExternalIdInAnotherAccountError extends KapuaException {

    private static final long serialVersionUID = 6086560691695487741L;
```

### DeprecatedIsStillUsed
Deprecated member 'MqttClientPublishException' is still used
in `transport/mqtt/src/main/java/org/eclipse/kapua/transport/mqtt/exception/MqttClientPublishException.java`
#### Snippet
```java
     */
    @Deprecated
    public MqttClientPublishException(Throwable cause, String clientId, String topic, MqttMessage mqttMessage) {
        this(cause, clientId, new MqttTopic(topic), mqttMessage);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'KapuaProvider' is still used
in `service/api/src/main/java/org/eclipse/kapua/locator/KapuaProvider.java`
#### Snippet
```java
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface KapuaProvider {
}
```

### DeprecatedIsStillUsed
Deprecated member 'INVALID_CHANNEL_APP_VERSION' is still used
in `translator/api/src/main/java/org/eclipse/kapua/translator/exception/TranslatorErrorCodes.java`
#### Snippet
```java
     */
    @Deprecated
    INVALID_CHANNEL_APP_VERSION,

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'INVALID_CHANNEL_CLASSIFIER' is still used
in `translator/api/src/main/java/org/eclipse/kapua/translator/exception/TranslatorErrorCodes.java`
#### Snippet
```java
     */
    @Deprecated
    INVALID_CHANNEL_CLASSIFIER,

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'INVALID_CHANNEL_APP_NAME' is still used
in `translator/api/src/main/java/org/eclipse/kapua/translator/exception/TranslatorErrorCodes.java`
#### Snippet
```java
     */
    @Deprecated
    INVALID_CHANNEL_APP_NAME,

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'getException' is still used
in `service/job/api/src/main/java/org/eclipse/kapua/service/job/targets/JobTarget.java`
#### Snippet
```java
    @Deprecated
    @XmlTransient
    Exception getException();

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'setException' is still used
in `service/job/api/src/main/java/org/eclipse/kapua/service/job/targets/JobTarget.java`
#### Snippet
```java
    @Deprecated
    @XmlTransient
    void setException(Exception e);

}
```

### DeprecatedIsStillUsed
Deprecated member 'setJobXmlDefinition' is still used
in `service/job/api/src/main/java/org/eclipse/kapua/service/job/Job.java`
#### Snippet
```java
     */
    @Deprecated
    void setJobXmlDefinition(String jobXmlDefinition);

}
```

### DeprecatedIsStillUsed
Deprecated member 'getJobSteps' is still used
in `service/job/api/src/main/java/org/eclipse/kapua/service/job/Job.java`
#### Snippet
```java
    @Deprecated
    @XmlTransient
    List<JobStep> getJobSteps();

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'setJobSteps' is still used
in `service/job/api/src/main/java/org/eclipse/kapua/service/job/Job.java`
#### Snippet
```java
     */
    @Deprecated
    void setJobSteps(List<JobStep> jobSteps);

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'getJobXmlDefinition' is still used
in `service/job/api/src/main/java/org/eclipse/kapua/service/job/Job.java`
#### Snippet
```java
     */
    @Deprecated
    String getJobXmlDefinition();

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'decryptAes' is still used
in `service/security/shiro/src/main/java/org/eclipse/kapua/service/authentication/shiro/utils/AuthenticationUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static String decryptAes(String encryptedValue) {
        try {
            Key key = generateKey();
```

### DeprecatedIsStillUsed
Deprecated member 'encryptAes' is still used
in `service/security/shiro/src/main/java/org/eclipse/kapua/service/authentication/shiro/utils/AuthenticationUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static String encryptAes(String value) {
        try {
            Key key = generateKey();
```

### DeprecatedIsStillUsed
Deprecated member 'MfaOptionImpl' is still used
in `service/security/shiro/src/main/java/org/eclipse/kapua/service/authentication/credential/mfa/shiro/MfaOptionImpl.java`
#### Snippet
```java
     */
    @Deprecated
    public MfaOptionImpl(KapuaId scopeId, KapuaId userId, String mfaSecretKey) {
        super(scopeId);

```

### DeprecatedIsStillUsed
Deprecated member 'STALE' is still used
in `service/device/api/src/main/java/org/eclipse/kapua/service/device/management/message/notification/NotifyStatus.java`
#### Snippet
```java
     */
    @Deprecated
    STALE
}

```

### DeprecatedIsStillUsed
Deprecated member 'setRetryInterval' is still used
in `service/scheduler/api/src/main/java/org/eclipse/kapua/service/scheduler/trigger/TriggerCreator.java`
#### Snippet
```java
     */
    @Deprecated
    void setRetryInterval(Long retryInterval);

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'setCronScheduling' is still used
in `service/scheduler/api/src/main/java/org/eclipse/kapua/service/scheduler/trigger/TriggerCreator.java`
#### Snippet
```java
     */
    @Deprecated
    void setCronScheduling(String cronScheduling);

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'getRetryInterval' is still used
in `service/scheduler/api/src/main/java/org/eclipse/kapua/service/scheduler/trigger/TriggerCreator.java`
#### Snippet
```java
     */
    @Deprecated
    Long getRetryInterval();

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'getCronScheduling' is still used
in `service/scheduler/api/src/main/java/org/eclipse/kapua/service/scheduler/trigger/TriggerCreator.java`
#### Snippet
```java
     */
    @Deprecated
    String getCronScheduling();

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'JWK_GENERATION_ERROR' is still used
in `service/security/authentication/api/src/main/java/org/eclipse/kapua/service/authentication/exception/KapuaAuthenticationErrorCodes.java`
#### Snippet
```java
     */
    @Deprecated
    JWK_GENERATION_ERROR,

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'JWK_FILE_ERROR' is still used
in `service/security/authentication/api/src/main/java/org/eclipse/kapua/service/authentication/exception/KapuaAuthenticationErrorCodes.java`
#### Snippet
```java
     */
    @Deprecated
    JWK_FILE_ERROR,

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'PASSWORD_CANNOT_BE_CHANGED' is still used
in `service/security/authentication/api/src/main/java/org/eclipse/kapua/service/authentication/exception/KapuaAuthenticationErrorCodes.java`
#### Snippet
```java
     */
    @Deprecated
    PASSWORD_CANNOT_BE_CHANGED,

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'setCronScheduling' is still used
in `service/scheduler/api/src/main/java/org/eclipse/kapua/service/scheduler/trigger/Trigger.java`
#### Snippet
```java
     */
    @Deprecated
    void setCronScheduling(String cronScheduling);

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'getCronScheduling' is still used
in `service/scheduler/api/src/main/java/org/eclipse/kapua/service/scheduler/trigger/Trigger.java`
#### Snippet
```java
     */
    @Deprecated
    String getCronScheduling();

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'setRetryInterval' is still used
in `service/scheduler/api/src/main/java/org/eclipse/kapua/service/scheduler/trigger/Trigger.java`
#### Snippet
```java
     */
    @Deprecated
    void setRetryInterval(Long retryInterval);

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'getRetryInterval' is still used
in `service/scheduler/api/src/main/java/org/eclipse/kapua/service/scheduler/trigger/Trigger.java`
#### Snippet
```java
     */
    @Deprecated
    Long getRetryInterval();

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'downloadExec' is still used
in `service/device/management/packages/api/src/main/java/org/eclipse/kapua/service/device/management/packages/DevicePackageManagementService.java`
#### Snippet
```java
     */
    @Deprecated
    KapuaId downloadExec(KapuaId scopeId, KapuaId deviceId, DevicePackageDownloadRequest packageDownloadRequest, Long timeout) throws KapuaException;

    /**
```

## RuleId[id=Convert2MethodRef]
### Convert2MethodRef
Lambda can be replaced with method reference
in `service/user/internal/src/main/java/org/eclipse/kapua/service/user/internal/UserServiceImpl.java`
#### Snippet
```java
        return entityManagerSession.doAction(EntityManagerContainer.<User>create().onResultHandler(em -> UserDAO.find(em, scopeId, userId))
                .onBeforeHandler(() -> (User) entityCache.get(scopeId, userId))
                .onAfterHandler((entity) -> entityCache.put(entity))
        );
    }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `service/user/internal/src/main/java/org/eclipse/kapua/service/user/internal/UserServiceImpl.java`
#### Snippet
```java
        return entityManagerSession.doAction(EntityManagerContainer.<User>create().onResultHandler(em -> checkReadAccess(UserDAO.findByName(em, name)))
                .onBeforeHandler(() -> checkReadAccess((User) ((NamedEntityCache) entityCache).get(null, name)))
                .onAfterHandler((entity) -> entityCache.put(entity)));
    }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `service/user/internal/src/main/java/org/eclipse/kapua/service/user/internal/UserServiceImpl.java`
#### Snippet
```java
        // Do the find
        return entityManagerSession.doAction(EntityManagerContainer.<User>create().onResultHandler(em -> checkReadAccess(UserDAO.findByExternalUsername(em, externalUsername)))
                .onAfterHandler((entity) -> entityCache.put(entity)));
    }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `service/user/internal/src/main/java/org/eclipse/kapua/service/user/internal/UserServiceImpl.java`
#### Snippet
```java
        // Do the find
        return entityManagerSession.doAction(EntityManagerContainer.<User>create().onResultHandler(em -> checkReadAccess(UserDAO.findByExternalId(em, externalId)))
                .onAfterHandler((entity) -> entityCache.put(entity)));
    }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `qa/common/src/main/java/org/eclipse/kapua/qa/common/utils/EmbeddedBroker.java`
#### Snippet
```java
            // close all resources

            closables.values().stream().flatMap(values -> values.stream()).forEach(s::closeSuppressed);

            // shut down broker
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `qa/common/src/main/java/org/eclipse/kapua/qa/common/utils/EmbeddedEventBroker.java`
#### Snippet
```java
        try (final Suppressed<RuntimeException> s = Suppressed.withRuntimeException()) {
            // close all resources
            closables.values().stream().flatMap(values -> values.stream()).forEach(s::closeSuppressed);
            // shut down broker
            if (jmsServer != null) {
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `qa/integration-steps/src/main/java/org/eclipse/kapua/qa/integration/steps/RestClientSteps.java`
#### Snippet
```java

        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        try (AutoCloseable cconn = () -> conn.disconnect()) {
            conn.setRequestProperty("Accept-Language", "UTF-8");
            conn.setRequestMethod("POST");
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `qa/integration-steps/src/main/java/org/eclipse/kapua/qa/integration/steps/RestClientSteps.java`
#### Snippet
```java

        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        try (AutoCloseable cconn = () -> conn.disconnect()) {
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept-Language", "UTF-8");
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/generator/basic/SineGeneratorFactory.java`
#### Snippet
```java
        final Double amplitude = Get.getDouble(configuration, "amplitude").orElse(100.0);
        final Double offset = Get.getDouble(configuration, "offset").orElse(0.0);
        final Short shift = Get.getInteger(configuration, "shift").map(i -> i.shortValue()).orElse(null);

        return Optional.of(Generator.onlyMetrics(Generators.fromSingle("value", Generators.sine(period, amplitude, offset, shift))));
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/generator/Generators.java`
#### Snippet
```java
    public static Function<Instant, Double> sineBetween(final Duration period, final double lower, final double upper, final Short shift) {
        final ToDoubleFunction<Instant> func = sineDoubleBetween(period, lower, upper, shift);
        return timestamp -> func.applyAsDouble(timestamp);
    }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/generator/Generators.java`
#### Snippet
```java
    public static Function<Instant, Double> sine(final Duration period, final double amplitude, final double offset, final Short shift) {
        final ToDoubleFunction<Instant> func = sineDouble(period, amplitude, offset, shift);
        return timestamp -> func.applyAsDouble(timestamp);
    }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `service/security/shiro/src/main/java/org/eclipse/kapua/service/authorization/role/shiro/RoleServiceImpl.java`
#### Snippet
```java
        return entityManagerSession.doAction(EntityManagerContainer.<Role>create().onResultHandler(em -> RoleDAO.find(em, scopeId, roleId))
                .onBeforeHandler(() -> (Role) entityCache.get(scopeId, roleId))
                .onAfterHandler((entity) -> entityCache.put(entity)));
    }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `service/security/shiro/src/main/java/org/eclipse/kapua/service/authorization/role/shiro/RolePermissionServiceImpl.java`
#### Snippet
```java
        return entityManagerSession.doAction(EntityManagerContainer.<RolePermission>create().onResultHandler(em -> RolePermissionDAO.find(em, scopeId, rolePermissionId))
                .onBeforeHandler(() -> (RolePermission) entityCache.get(scopeId, rolePermissionId))
                .onAfterHandler((entity) -> entityCache.put(entity)));
    }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `service/security/shiro/src/main/java/org/eclipse/kapua/service/authorization/access/shiro/AccessInfoServiceImpl.java`
#### Snippet
```java
                    return null;
                }).onBeforeHandler(() -> (AccessInfo) ((AccessInfoCache) entityCache).getByUserId(scopeId, userId))
                .onAfterHandler((entity) -> entityCache.put(entity)));
    }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `service/security/shiro/src/main/java/org/eclipse/kapua/service/authorization/access/shiro/AccessInfoServiceImpl.java`
#### Snippet
```java
        return entityManagerSession.doAction(EntityManagerContainer.<AccessInfo>create().onResultHandler(em -> AccessInfoDAO.find(em, scopeId, accessInfoId))
                .onBeforeHandler(() -> (AccessInfo) entityCache.get(scopeId, accessInfoId))
                .onAfterHandler((entity) -> entityCache.put(entity))
        );
    }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `service/security/shiro/src/main/java/org/eclipse/kapua/service/authorization/access/shiro/AccessPermissionServiceImpl.java`
#### Snippet
```java
        return entityManagerSession.doAction(EntityManagerContainer.<AccessPermission>create().onResultHandler(em -> AccessPermissionDAO.find(em, scopeId, accessPermissionId))
                .onBeforeHandler(() -> (AccessPermission) entityCache.get(scopeId, accessPermissionId))
                .onAfterHandler((entity) -> entityCache.put(entity)));
    }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `commons/src/main/java/org/eclipse/kapua/commons/about/AboutScanner.java`
#### Snippet
```java

    public static AboutScanner scan(final Stream<URL> urls) {
        return new AboutScanner(urls.map(AboutScanner::map).filter(entry -> entry != null));
    }
}
```

## RuleId[id=AbstractMethodCallInConstructor]
### AbstractMethodCallInConstructor
Call to 'abstract' method `getJwtAudiences()` during object construction
in `plug-ins/sso/openid-connect/provider/src/main/java/org/eclipse/kapua/plugin/sso/openid/provider/jwt/AbstractJwtProcessor.java`
#### Snippet
```java
     */
    public AbstractJwtProcessor() throws OpenIDException {
        List<String> audiences = getJwtAudiences();
        List<String> expectedIssuers = getJwtExpectedIssuers();
        this.expectedIssuers = expectedIssuers.toArray(new String[expectedIssuers.size()]);
```

### AbstractMethodCallInConstructor
Call to 'abstract' method `getJwtExpectedIssuers()` during object construction
in `plug-ins/sso/openid-connect/provider/src/main/java/org/eclipse/kapua/plugin/sso/openid/provider/jwt/AbstractJwtProcessor.java`
#### Snippet
```java
    public AbstractJwtProcessor() throws OpenIDException {
        List<String> audiences = getJwtAudiences();
        List<String> expectedIssuers = getJwtExpectedIssuers();
        this.expectedIssuers = expectedIssuers.toArray(new String[expectedIssuers.size()]);
        this.audiences = audiences.toArray(new String[audiences.size()]);
```

## RuleId[id=NonSerializableFieldInSerializableClass]
### NonSerializableFieldInSerializableClass
Non-serializable field 'nextKey' in a Serializable class
in `service/commons/storable/internal/src/main/java/org/eclipse/kapua/service/storable/model/AbstractStorableListResult.java`
#### Snippet
```java
    private boolean limitExceeded;
    private ArrayList<E> items;
    private Object nextKey;
    private Long totalCount;

```

### NonSerializableFieldInSerializableClass
Non-serializable field 'typeDescriptor' in a Serializable class
in `service/commons/elasticsearch/client-api/src/main/java/org/eclipse/kapua/service/elasticsearch/client/model/Response.java`
#### Snippet
```java
     * @since 1.0.0
     */
    private TypeDescriptor typeDescriptor;

    /**
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'args' in a Serializable class
in `service/api/src/main/java/org/eclipse/kapua/KapuaRuntimeException.java`
#### Snippet
```java

    private final KapuaErrorCode code;
    private final Object[] args;

    /**
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'args' in a Serializable class
in `service/api/src/main/java/org/eclipse/kapua/KapuaException.java`
#### Snippet
```java

    private final KapuaErrorCode code;
    private final Object[] args;

    /**
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'value' in a Serializable class
in `service/commons/storable/api/src/main/java/org/eclipse/kapua/service/storable/exception/UnsupportedTypeMappingException.java`
#### Snippet
```java

    private final String name;
    private final Object value;
    private final Class<?> type;

```

### NonSerializableFieldInSerializableClass
Non-serializable field 'value' in a Serializable class
in `service/commons/storable/api/src/main/java/org/eclipse/kapua/service/storable/exception/InvalidValueMappingException.java`
#### Snippet
```java

    private final String name;
    private final Object value;
    private final Class<?> type;

```

### NonSerializableFieldInSerializableClass
Non-serializable field 'requestContent' in a Serializable class
in `service/device/management/api/src/main/java/org/eclipse/kapua/service/device/management/exception/DeviceManagementRequestContentException.java`
#### Snippet
```java
    private static final long serialVersionUID = 6369408505280888324L;

    private final Object requestContent;

    /**
```

## RuleId[id=CatchMayIgnoreException]
### CatchMayIgnoreException
Empty `catch` block
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/birth/BirthCertificateBuilder.java`
#### Snippet
```java
                metrics.put("connection_ip", connectionAddress.length()>64 ? connectionAddress.substring(0, 64) : connectionAddress);
            }
        } catch (final Exception e) {
        }
    }
```

### CatchMayIgnoreException
Empty `catch` block
in `client/gateway/provider/paho/src/main/java/org/eclipse/kapua/client/gateway/mqtt/paho/PahoChannel.java`
#### Snippet
```java
        try {
            client.disconnect().waitForCompletion();
        } catch (final MqttException e) {
        }

```

### CatchMayIgnoreException
Empty `catch` block
in `client/gateway/provider/paho/src/main/java/org/eclipse/kapua/client/gateway/mqtt/paho/PahoChannel.java`
#### Snippet
```java
        try {
            client.close();
        } catch (final MqttException e) {
        }
    }
```

### CatchMayIgnoreException
Empty `catch` block
in `commons/src/main/java/org/eclipse/kapua/commons/about/AboutEntry.java`
#### Snippet
```java
                urlApache = new URL("http://www.apache.org/licenses/");
                urlEpl = new URL("https://www.eclipse.org/legal/epl-2.0/");
            } catch (MalformedURLException e) {
            }

```

### CatchMayIgnoreException
Empty `catch` block
in `commons/src/main/java/org/eclipse/kapua/commons/about/AboutScanner.java`
#### Snippet
```java
            URL url = new URL(string);
            return new License(null, null, url);
        } catch (Exception e) {
        }

```

### CatchMayIgnoreException
Empty `catch` block
in `commons/src/main/java/org/eclipse/kapua/commons/about/AboutScanner.java`
#### Snippet
```java
                about.setLicense(new License(null, text, null));
            }
        } catch (Exception e) {
        }

```

### CatchMayIgnoreException
Empty `catch` block
in `commons/src/main/java/org/eclipse/kapua/commons/about/AboutScanner.java`
#### Snippet
```java
                }
            }
        } catch (Exception e) {
        }
        return about;
```

### CatchMayIgnoreException
Empty `catch` block
in `commons/src/main/java/org/eclipse/kapua/commons/about/AboutScanner.java`
#### Snippet
```java
        try {
            about.setNotice(CharStreams.toString(new InputStreamReader(in, StandardCharsets.UTF_8)));
        } catch (Exception e) {
        }

```

### CatchMayIgnoreException
Empty `catch` block
in `commons/src/main/java/org/eclipse/kapua/commons/about/AboutScanner.java`
#### Snippet
```java
            about.setLicense(parseOsgiLicense(licenseString));

        } catch (Exception e) {
        }
        return about;
```

## RuleId[id=AssignmentToForLoopParameter]
### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `commons/src/main/java/org/eclipse/kapua/commons/util/StringUtil.java`
#### Snippet
```java
                    // at the end of the loop.
                    if (i + 1 < strValues.length()) {
                        buffer.append(strValues.charAt(++i));
                    }
                    // If the ESCAPE character occurs as the last character
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `commons/src/main/java/org/eclipse/kapua/commons/util/StringUtil.java`
#### Snippet
```java
                                // Let loop counter i catch up with the inner loop but keep in
                                // mind it will still be incremented at the end of the outer loop.
                                i = j - 1;
                                break;
                            }
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `commons/src/main/java/org/eclipse/kapua/commons/configuration/ValueTokenizer.java`
#### Snippet
```java
                // at the end of the loop.
                if (i + 1 < valuesStr.length()) {
                    buffer.append(valuesStr.charAt(++i));
                } else {
                    // If the ESCAPE character occurs as the last character
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `commons/src/main/java/org/eclipse/kapua/commons/configuration/ValueTokenizer.java`
#### Snippet
```java
                            // Let loop counter i catch up with the inner loop but keep in
                            // mind it will still be incremented at the end of the outer loop.
                            i = j - 1;
                            break;
                        }
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `qa/integration-steps/src/main/java/org/eclipse/kapua/qa/integration/steps/DockerSteps.java`
#### Snippet
```java
                    builder.append(image.id());
                    image.repoTags().forEach(value -> builder.append("\t").append(value));
                    logger.info("{}", builder.toString());
                }
            }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `qa/integration-steps/src/main/java/org/eclipse/kapua/qa/integration/steps/DockerSteps.java`
#### Snippet
```java
                        int i = 0;
                        while (logStream.hasNext()) {
                            builder.append(StandardCharsets.UTF_8.decode(logStream.next().content()).toString());
                            if (++i % 100 == 0) {
                                brokerLogger.info(builder.toString());
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/main/NameFactories.java`
#### Snippet
```java
            sj.add(String.format("%02X", b));
        }
        return prefixed(sj.toString() + "-");
    }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `commons/src/main/java/org/eclipse/kapua/commons/about/AboutScanner.java`
#### Snippet
```java
            if (paths.length < 1) {
                // set the full URL, we don't understand it
                about.setId("url:" + url.toString());
            } else {
                // set URL based id
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `commons/src/main/java/org/eclipse/kapua/commons/service/internal/ServiceDAO.java`
#### Snippet
```java
                return result.get(0);
            default:
                throw new NonUniqueResultException(String.format("Multiple %s results found for field %s with value %s", clazz.getName(), pName, value.toString()));
        }
    }
```

## RuleId[id=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `CallbackParam` may be 'static'
in `service/device/registry/test-steps/src/main/java/org/eclipse/kapua/service/device/registry/steps/KuraDevice.java`
#### Snippet
```java
     * Simple tuple for callback parameters.
     */
    private class CallbackParam {

        private String clientId;
```

### InnerClassMayBeStatic
Inner class `NoExecutionNeededException` may be 'static'
in `commons/src/main/java/org/eclipse/kapua/commons/event/ServiceEventHousekeeper.java`
#### Snippet
```java
    }

    private class NoExecutionNeededException extends Exception {

        private static final long serialVersionUID = 7292333466656851052L;
```

### InnerClassMayBeStatic
Inner class `LockException` may be 'static'
in `commons/src/main/java/org/eclipse/kapua/commons/event/ServiceEventHousekeeper.java`
#### Snippet
```java
    }

    private class LockException extends Exception {

        private static final long serialVersionUID = 3099804470559976126L;
```

### InnerClassMayBeStatic
Inner class `Subscription` may be 'static'
in `commons/src/main/java/org/eclipse/kapua/commons/event/jms/JMSServiceEventBus.java`
#### Snippet
```java
    }

    private class Subscription {

        String name;
```

### InnerClassMayBeStatic
Inner class `ComparableUser` may be 'static'
in `service/user/test-steps/src/main/java/org/eclipse/kapua/service/user/steps/UserServiceSteps.java`
#### Snippet
```java
    // * Inner Classes *
    // *****************
    private class ComparableUser {

        private User user;
```

## RuleId[id=SuspiciousMethodCalls]
### SuspiciousMethodCalls
'Map' may not contain keys of type 'Integer'
in `service/device/registry/test-steps/src/main/java/org/eclipse/kapua/service/device/registry/steps/AclSteps.java`
#### Snippet
```java
        } else {
            // TODO log (or append in the failure message) this error in a better way
            Assert.fail("Message not received by broker." + (listenerMqttMessage != null && listenerMqttMessage.size() > 0 ? listenerMqttMessage.get(0) : " NULL"));
        }
    }
```

## RuleId[id=SetReplaceableByEnumSet]
### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `qa/common/src/main/java/org/eclipse/kapua/qa/common/Util.java`
#### Snippet
```java
        Set<Actions> actions = null;
        if (action!=null) {
            actions = new HashSet<>();
            for (String str : action.split(",")) {
                actions.add(parseAction(str));
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `qa/common/src/main/java/org/eclipse/kapua/qa/common/TestDomain.java`
#### Snippet
```java

    private String name = "test";
    private Set<Actions> actions = new HashSet<>(Lists.newArrayList(Actions.read, Actions.delete, Actions.write));
    private boolean groupable;

```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `qa/common/src/main/java/org/eclipse/kapua/qa/common/cucumber/CucDomain.java`
#### Snippet
```java
        if (this.actions != null) {
            String[] tmpList = this.actions.split(",");
            this.actionSet = new HashSet<>();

            for (String tmpS : tmpList) {
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `qa/common/src/main/java/org/eclipse/kapua/qa/common/cucumber/CucRole.java`
#### Snippet
```java
            String tmpAct = actions.trim().toLowerCase();
            if (tmpAct.length() != 0) {
                actionSet = new HashSet<>();
                String[] tmpList = actions.split(",");

```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `service/datastore/api/src/main/java/org/eclipse/kapua/service/datastore/DatastoreDomain.java`
#### Snippet
```java

    private String name = "datastore";
    private Set<Actions> actions = new HashSet<>(Arrays.asList(Actions.read, Actions.delete, Actions.write));

    @Override
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `service/job/api/src/main/java/org/eclipse/kapua/service/job/JobDomain.java`
#### Snippet
```java

    private final String name = "job";
    private final Set<Actions> actions = new HashSet<>(Arrays.asList(Actions.read, Actions.delete, Actions.write, Actions.execute));

    @Override
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `service/user/api/src/main/java/org/eclipse/kapua/service/user/UserDomain.java`
#### Snippet
```java

    private String name = "user";
    private Set<Actions> actions = new HashSet<>(Arrays.asList(Actions.read, Actions.delete, Actions.write));

    @Override
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `service/security/authorization/api/src/main/java/org/eclipse/kapua/service/authorization/role/RoleDomain.java`
#### Snippet
```java

    private String name = "role";
    private Set<Actions> actions = new HashSet<>(Arrays.asList(Actions.read, Actions.delete, Actions.write));

    @Override
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `service/security/authorization/api/src/main/java/org/eclipse/kapua/service/authorization/group/GroupDomain.java`
#### Snippet
```java

    private String name = "group";
    private Set<Actions> actions = new HashSet<>(Arrays.asList(Actions.read, Actions.delete, Actions.write));

    @Override
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `service/security/authorization/api/src/main/java/org/eclipse/kapua/service/authorization/access/AccessInfoDomain.java`
#### Snippet
```java

    private String name = "access_info";
    private Set<Actions> actions = new HashSet<>(Arrays.asList(Actions.read, Actions.delete, Actions.write));

    @Override
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `service/security/authorization/api/src/main/java/org/eclipse/kapua/service/authorization/domain/DomainDomain.java`
#### Snippet
```java

    private String name = "domain";
    private Set<Actions> actions = new HashSet<>(Arrays.asList(Actions.read, Actions.delete, Actions.write));

    @Override
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `service/tag/api/src/main/java/org/eclipse/kapua/service/tag/TagDomain.java`
#### Snippet
```java

    private String name = "tag";
    private Set<Actions> actions = new HashSet<>(Arrays.asList(Actions.read, Actions.delete, Actions.write));

    @Override
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `service/device/registry/api/src/main/java/org/eclipse/kapua/service/device/registry/DeviceDomain.java`
#### Snippet
```java

    private String name = "device";
    private Set<Actions> actions = new HashSet<>(Arrays.asList(Actions.read, Actions.delete, Actions.write));

    @Override
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `service/device/registry/api/src/main/java/org/eclipse/kapua/service/device/registry/event/DeviceEventDomain.java`
#### Snippet
```java

    private String name = "device_event";
    private Set<Actions> actions = new HashSet<>(Arrays.asList(Actions.read, Actions.delete, Actions.write));

    @Override
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `service/device/registry/api/src/main/java/org/eclipse/kapua/service/device/registry/lifecycle/DeviceLifecycleDomain.java`
#### Snippet
```java

    private String name = "device_lifecycle";
    private Set<Actions> actions = new HashSet<>(Arrays.asList(Actions.read, Actions.delete, Actions.write));

    @Override
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `service/device/registry/api/src/main/java/org/eclipse/kapua/service/device/registry/connection/DeviceConnectionDomain.java`
#### Snippet
```java

    private String name = "device_connection";
    private Set<Actions> actions = new HashSet<>(Arrays.asList(Actions.read, Actions.delete, Actions.write));

    @Override
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `service/endpoint/api/src/main/java/org/eclipse/kapua/service/endpoint/EndpointInfoDomain.java`
#### Snippet
```java

    private String name = "endpoint_info";
    private Set<Actions> actions = new HashSet<>(Arrays.asList(Actions.read, Actions.delete, Actions.write));

    @Override
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `service/stream/api/src/main/java/org/eclipse/kapua/service/stream/StreamDomain.java`
#### Snippet
```java

    private String name = "stream";
    private Set<Actions> actions = new HashSet<>(Arrays.asList(Actions.write));

    @Override
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `service/security/certificate/api/src/main/java/org/eclipse/kapua/service/certificate/CertificateDomain.java`
#### Snippet
```java

    private String name = "certificate";
    private Set<Actions> actions = new HashSet<>(Arrays.asList(Actions.read, Actions.delete, Actions.write));

    @Override
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `service/security/authentication/api/src/main/java/org/eclipse/kapua/service/authentication/token/AccessTokenDomain.java`
#### Snippet
```java

    private String name = "access_token";
    private Set<Actions> actions = new HashSet<>(Arrays.asList(Actions.read, Actions.delete, Actions.write));

    @Override
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `service/security/authentication/api/src/main/java/org/eclipse/kapua/service/authentication/credential/CredentialDomain.java`
#### Snippet
```java

    private String name = "credential";
    private Set<Actions> actions = new HashSet<>(Arrays.asList(Actions.read, Actions.delete, Actions.write));

    @Override
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `service/scheduler/api/src/main/java/org/eclipse/kapua/service/scheduler/SchedulerDomain.java`
#### Snippet
```java

    private final String name = "scheduler";
    private final Set<Actions> actions = new HashSet<>(Arrays.asList(Actions.read, Actions.delete, Actions.write, Actions.execute));

    @Override
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `service/device/registry/test-steps/src/main/java/org/eclipse/kapua/service/device/registry/steps/DeviceRegistrySteps.java`
#### Snippet
```java
        Domain tmpDomain = new TestDomain();
        tmpDomain.setName(TEST_DEVICE_NAME);
        tmpDomain.setActions(new HashSet<>(Lists.newArrayList(Actions.connect, Actions.execute)));
        Assert.assertEquals(TEST_DEVICE_NAME, tmpDomain.getName());
        Assert.assertEquals(2, tmpDomain.getActions().size());
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `service/device/registry/test-steps/src/main/java/org/eclipse/kapua/service/device/registry/steps/DeviceRegistrySteps.java`
#### Snippet
```java
        Domain tmpDomain = new TestDomain();
        tmpDomain.setName(TEST_DEVICE_NAME);
        tmpDomain.setActions(new HashSet<>(Lists.newArrayList(Actions.connect, Actions.execute)));
        Assert.assertEquals(TEST_DEVICE_NAME, tmpDomain.getName());
        Assert.assertEquals(2, tmpDomain.getActions().size());
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `commons/src/main/java/org/eclipse/kapua/commons/service/event/store/api/EventStoreDomain.java`
#### Snippet
```java

    private String name = "event_store";
    private Set<Actions> actions = new HashSet<>(Arrays.asList(Actions.read, Actions.delete, Actions.write));

    @Override
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `broker/api/src/main/java/org/eclipse/kapua/broker/BrokerDomain.java`
#### Snippet
```java

    private String name = "broker";
    private Set<Actions> actions = new HashSet<>(Arrays.asList(Actions.connect));

    @Override
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `service/device/management/registry/api/src/main/java/org/eclipse/kapua/service/device/management/registry/operation/DeviceManagementRegistryDomain.java`
#### Snippet
```java

    private String name = "device_management_registry";
    private Set<Actions> actions = new HashSet<>(Arrays.asList(Actions.execute, Actions.read, Actions.write));

    @Override
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `service/account/api/src/main/java/org/eclipse/kapua/service/account/AccountDomain.java`
#### Snippet
```java

    private final String name = "account";
    private final Set<Actions> actions = new HashSet<>(Arrays.asList(Actions.read, Actions.delete, Actions.write));

    @Override
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `service/device/management/api/src/main/java/org/eclipse/kapua/service/device/management/DeviceManagementDomain.java`
#### Snippet
```java

    private String name = "device_management";
    private Set<Actions> actions = new HashSet<>(Arrays.asList(Actions.execute, Actions.read, Actions.write));

    @Override
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `service/security/test-steps/src/main/java/org/eclipse/kapua/service/authorization/steps/AuthorizationServiceSteps.java`
#### Snippet
```java
        KapuaSecurityUtils.doPrivileged(() -> {
            DomainCreator tmpCreator = domainFactory.newCreator("name_1");
            HashSet<Actions> tmpAct = new HashSet<>();
            tmpAct.add(Actions.read);
            tmpAct.add(Actions.write);
```

## RuleId[id=NestedSynchronizedStatement]
### NestedSynchronizedStatement
Nested `synchronized` statement
in `transport/mqtt/src/main/java/org/eclipse/kapua/transport/mqtt/MqttResponseCallback.java`
#### Snippet
```java
            // Notify if all expected responses arrived
            if (expectedResponses >= responses.size()) {
                synchronized (this) {
                    notifyAll();
                }
```

## RuleId[id=StringEqualsEmptyString]
### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `translator/test-steps/src/main/java/org/eclipse/kapua/translator/test/steps/TranslatorSteps.java`
#### Snippet
```java
            MqttTopic mqttTopic = new MqttTopic(topic);
            KuraPayload kuraPayload = new KuraPayload();
            if (payload.equals("invalidPayload") || payload.equals("")) {
                kuraPayload.setBody(payload.getBytes());
            } else {
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `translator/test-steps/src/main/java/org/eclipse/kapua/translator/test/steps/TranslatorSteps.java`
#### Snippet
```java
        Class toClass;
        try {
            if (!from.equals("") && !to.equals("")) {
                fromClass = Class.forName(from);
                toClass = Class.forName(to);
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `translator/test-steps/src/main/java/org/eclipse/kapua/translator/test/steps/TranslatorSteps.java`
#### Snippet
```java
        Class toClass;
        try {
            if (!from.equals("") && !to.equals("")) {
                fromClass = Class.forName(from);
                toClass = Class.forName(to);
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `translator/test-steps/src/main/java/org/eclipse/kapua/translator/test/steps/TranslatorSteps.java`
#### Snippet
```java
            JmsTopic jmsTopic = new JmsTopic(topic);
            KuraPayload kuraPayload = new KuraPayload();
            if (payload.equals("invalidPayload") || payload.equals("")) {
                kuraPayload.setBody(payload.getBytes());
            } else {
```

## RuleId[id=UnnecessaryBoxing]
### UnnecessaryBoxing
Redundant boxing, `Integer.parseInt()` call can be used instead
in `qa/common/src/main/java/org/eclipse/kapua/qa/common/Util.java`
#### Snippet
```java

    public static int parseInt(String value) {
        return value!=null ? Integer.valueOf(value) : 0;
    }

```

### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `qa/common/src/main/java/org/eclipse/kapua/qa/common/Util.java`
#### Snippet
```java

    public static Boolean parseBoolean(String value) {
        return value!=null ? Boolean.valueOf(value) : false;
    }

```

### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `qa/common/src/main/java/org/eclipse/kapua/qa/common/cucumber/CucConnection.java`
#### Snippet
```java

    public boolean getAllowUserChange() {
        return Boolean.valueOf(allowUserChange);
    }

```

### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `qa/common/src/main/java/org/eclipse/kapua/qa/common/BasicSteps.java`
#### Snippet
```java
    @ParameterType(value = "true|True|TRUE|false|False|FALSE")
    public boolean booleanValue(String value) {
        return Boolean.valueOf(value);
    }

```

### UnnecessaryBoxing
Unnecessary boxing
in `consumer/lifecycle-app/src/main/java/org/eclipse/kapua/consumer/lifecycle/LifecycleRouteHealthIndicator.java`
#### Snippet
```java
        List<Route> routes = camelContext.getRoutes();
        Map<String, Object> details = new HashMap<>();
        details.put("routes", new Integer(routes.size()));
        int running = 0;
        for (Route route : routes) {
```

### UnnecessaryBoxing
Unnecessary boxing
in `consumer/telemetry-app/src/main/java/org/eclipse/kapua/consumer/telemetry/TelemetryRouteHealthIndicator.java`
#### Snippet
```java
        List<Route> routes = camelContext.getRoutes();
        Map<String, Object> details = new HashMap<>();
        details.put("routes", new Integer(routes.size()));
        int running = 0;
        for (Route route : routes) {
```

### UnnecessaryBoxing
Unnecessary boxing
in `service/datastore/test-steps/src/main/java/org/eclipse/kapua/service/datastore/steps/DatastoreSteps.java`
#### Snippet
```java
        Map<String, Object> tmpMetrics = new HashMap<>();
        tmpMetrics.put("float", random.nextFloat() * 100);
        tmpMetrics.put("float_int", Float.valueOf(random.nextInt()));
        tmpMetrics.put(DOUBLE, random.nextDouble() * 100);
        tmpMetrics.put("double_int", Float.valueOf(random.nextInt()));
```

### UnnecessaryBoxing
Unnecessary boxing
in `service/datastore/test-steps/src/main/java/org/eclipse/kapua/service/datastore/steps/DatastoreSteps.java`
#### Snippet
```java
        tmpMetrics.put("float_int", Float.valueOf(random.nextInt()));
        tmpMetrics.put(DOUBLE, random.nextDouble() * 100);
        tmpMetrics.put("double_int", Float.valueOf(random.nextInt()));
        tmpMetrics.put("integer", random.nextInt());
        tmpMetrics.put("long", random.nextLong());
```

### UnnecessaryBoxing
Unnecessary boxing
in `service/datastore/internal/src/main/java/org/eclipse/kapua/service/datastore/internal/mediator/DatastoreUtils.java`
#### Snippet
```java
        if (CLIENT_METRIC_TYPE_DOUBLE_ACRONYM.equals(acronymType)) {
            if (value instanceof Number) {
                convertedValue = new Double(((Number) value).doubleValue());
            } else if (value instanceof String) {
                convertedValue = Double.parseDouble((String) value);
```

### UnnecessaryBoxing
Unnecessary boxing
in `service/datastore/internal/src/main/java/org/eclipse/kapua/service/datastore/internal/mediator/DatastoreUtils.java`
#### Snippet
```java
        } else if (CLIENT_METRIC_TYPE_FLOAT_ACRONYM.equals(acronymType)) {
            if (value instanceof Number) {
                convertedValue = new Float(((Number) value).floatValue());
            } else if (value instanceof String) {
                convertedValue = Float.parseFloat((String) value);
```

### UnnecessaryBoxing
Unnecessary boxing
in `service/datastore/internal/src/main/java/org/eclipse/kapua/service/datastore/internal/mediator/DatastoreUtils.java`
#### Snippet
```java
        } else if (CLIENT_METRIC_TYPE_INTEGER_ACRONYM.equals(acronymType)) {
            if (value instanceof Number) {
                convertedValue = new Integer(((Number) value).intValue());
            } else if (value instanceof String) {
                convertedValue = Integer.parseInt((String) value);
```

### UnnecessaryBoxing
Unnecessary boxing
in `service/datastore/internal/src/main/java/org/eclipse/kapua/service/datastore/internal/mediator/DatastoreUtils.java`
#### Snippet
```java
        } else if (CLIENT_METRIC_TYPE_LONG_ACRONYM.equals(acronymType)) {
            if (value instanceof Number) {
                convertedValue = new Long(((Number) value).longValue());
            } else if (value instanceof String) {
                convertedValue = Long.parseLong((String) value);
```

### UnnecessaryBoxing
Redundant boxing, `Integer.parseInt()` call can be used instead
in `service/device/call/kura/src/main/java/org/eclipse/kapua/service/device/call/message/kura/app/response/KuraResponseCode.java`
#### Snippet
```java
     */
    public static KuraResponseCode fromResponseCode(String responseCode) {
        return fromResponseCode(Integer.valueOf(responseCode));
    }

```

### UnnecessaryBoxing
Unnecessary boxing
in `commons/src/main/java/org/eclipse/kapua/commons/service/internal/cache/KapuaCacheManager.java`
#### Snippet
```java

    private static CacheManager cacheManager;
    private static Integer cacheStatus = new Integer(0);
    private static Counter registeredCache;

```

### UnnecessaryBoxing
Redundant boxing, `Long.parseLong()` call can be used instead
in `broker/client/src/main/java/org/eclipse/kapua/broker/client/pool/JmsAssistantProducerWrapper.java`
#### Snippet
```java
        textMessage.setStringProperty(MessageConstants.PROPERTY_BROKER_ID, parameters.get(MessageConstants.PROPERTY_BROKER_ID));
        textMessage.setStringProperty(MessageConstants.PROPERTY_CLIENT_ID, parameters.get(MessageConstants.PROPERTY_CLIENT_ID));
        textMessage.setLongProperty(MessageConstants.PROPERTY_SCOPE_ID, Long.valueOf(parameters.get(MessageConstants.PROPERTY_SCOPE_ID)));
        textMessage.setStringProperty(MessageConstants.PROPERTY_ORIGINAL_TOPIC, JmsUtil.convertMqttWildCardToJms(topic));
        textMessage.setLongProperty(MessageConstants.PROPERTY_ENQUEUED_TIMESTAMP, System.currentTimeMillis());
```

### UnnecessaryBoxing
Unnecessary boxing
in `service/security/test-steps/src/main/java/org/eclipse/kapua/service/authorization/steps/AuthorizationServiceSteps.java`
#### Snippet
```java
            Assert.assertTrue(accRole1.equals(accRole1));
            Assert.assertFalse(accRole1.equals(null));
            Assert.assertFalse(accRole1.equals(Integer.valueOf(15)));
            Assert.assertTrue(accRole1.equals(accRole2));
            accRole2.setAccessInfoId(getKapuaId());
```

### UnnecessaryBoxing
Unnecessary boxing
in `service/security/test-steps/src/main/java/org/eclipse/kapua/service/authorization/steps/AuthorizationServiceSteps.java`
#### Snippet
```java
        Assert.assertTrue(accPerm1.equals(accPerm1));
        Assert.assertFalse(accPerm1.equals(null));
        Assert.assertFalse(accPerm1.equals(Integer.valueOf(15)));
        Assert.assertTrue(accPerm1.equals(accPerm2));
        accPerm1.setAccessInfoId(null);
```

### UnnecessaryBoxing
Unnecessary boxing
in `service/security/test-steps/src/main/java/org/eclipse/kapua/service/authorization/steps/AuthorizationServiceSteps.java`
#### Snippet
```java
        Assert.assertTrue(perm1.equals(perm1));
        Assert.assertFalse(perm1.equals(null));
        Assert.assertFalse(perm1.equals(Integer.valueOf(10)));
        Assert.assertTrue(perm1.equals(perm2));
        perm1.setDomain(null);
```

## RuleId[id=SynchronizeOnNonFinalField]
### SynchronizeOnNonFinalField
Synchronization on a non-final field `timerTask`
in `job-engine/jbatch/src/main/java/org/eclipse/kapua/job/engine/jbatch/driver/utils/WaitForJobExecutionStopTask.java`
#### Snippet
```java
            } else {
                LOG.error("Job {} did stopped in time! Expire date was: {}", runningJobExecution.getJobName(), expireDate);
                synchronized (timerTask) {
                    timerTask.cancel();
                }
```

### SynchronizeOnNonFinalField
Synchronization on a non-final field `timerTask`
in `job-engine/jbatch/src/main/java/org/eclipse/kapua/job/engine/jbatch/driver/utils/WaitForJobExecutionStopTask.java`
#### Snippet
```java
            try {
                LOG.info("Executing next action...");
                synchronized (timerTask) {
                    timerTask.cancel();
                }
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.service` is unnecessary and can be removed
in `service/device/management/inventory/api/src/main/java/org/eclipse/kapua/service/device/management/inventory/DeviceInventoryManagementService.java`
#### Snippet
```java
 * {@link DeviceInventoryItem} {@link KapuaService} definition.
 *
 * @see org.eclipse.kapua.service.KapuaService
 * @since 1.5.0
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.model` is unnecessary and can be removed
in `service/device/management/inventory/api/src/main/java/org/eclipse/kapua/service/device/management/inventory/DeviceInventoryManagementFactory.java`
#### Snippet
```java
 * {@link DeviceInventoryItem} {@link KapuaObjectFactory} definition.
 *
 * @see org.eclipse.kapua.model.KapuaObjectFactory
 * @since 1.5.0
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.service.user` is unnecessary and can be removed
in `service/user/internal/src/main/java/org/eclipse/kapua/service/user/internal/UserDAO.java`
#### Snippet
```java

    /**
     * Finds the {@link User} by the {@link org.eclipse.kapua.service.user.UserAttributes#NAME}
     *
     * @param em
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.service.device.management.registry.operation.notification` is unnecessary and can be removed
in `service/device/management/job/api/src/main/java/org/eclipse/kapua/service/device/management/job/manager/JobDeviceManagementOperationManagerService.java`
#### Snippet
```java

/**
 * Default logic to process a {@link org.eclipse.kapua.service.device.management.registry.operation.notification.ManagementOperationNotification}
 * from a Device after a DEPLOY-V2 has started.
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.fusesource.mqtt.client` is unnecessary, and can be replaced with an import
in `client/gateway/provider/fuse/src/main/java/org/eclipse/kapua/client/gateway/mqtt/fuse/FuseChannel.java`
#### Snippet
```java
            final CompletableFuture<byte[]> future = new CompletableFuture<>();
            connection.subscribe(
                    new org.fusesource.mqtt.client.Topic[] {
                            new org.fusesource.mqtt.client.Topic(topic, QoS.AT_LEAST_ONCE) },
                    Callbacks.asCallback(future));
```

### UnnecessaryFullyQualifiedName
Qualifier `org.fusesource.mqtt.client` is unnecessary, and can be replaced with an import
in `client/gateway/provider/fuse/src/main/java/org/eclipse/kapua/client/gateway/mqtt/fuse/FuseChannel.java`
#### Snippet
```java
            connection.subscribe(
                    new org.fusesource.mqtt.client.Topic[] {
                            new org.fusesource.mqtt.client.Topic(topic, QoS.AT_LEAST_ONCE) },
                    Callbacks.asCallback(future));

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.camel` is unnecessary and can be removed
in `consumer/commons/src/main/java/org/eclipse/kapua/consumer/commons/camel/CamelUtil.java`
#### Snippet
```java
     * @throws JMSException
     */
    public static String getTopic(org.apache.camel.Message message) throws JMSException {
        String topicOrig = message.getHeader(MessageConstants.PROPERTY_ORIGINAL_TOPIC, String.class);
        if (topicOrig != null) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.camel` is unnecessary and can be removed
in `consumer/commons/src/main/java/org/eclipse/kapua/consumer/commons/listener/error/FailureProcessor.java`
#### Snippet
```java
        }
        else {
            return (Exception)exchange.getProperty(org.apache.camel.Exchange.EXCEPTION_CAUGHT);
        }
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.model` is unnecessary and can be removed
in `service/job/api/src/main/java/org/eclipse/kapua/service/job/JobFactory.java`
#### Snippet
```java
 * {@link JobFactory} definition.
 *
 * @see org.eclipse.kapua.model.KapuaEntityFactory
 * @since 1.0.0
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.camel` is unnecessary and can be removed
in `consumer/commons/src/main/java/org/eclipse/kapua/consumer/commons/listener/error/ErrorMessageListener.java`
#### Snippet
```java
    // use already defined constants on the new versions
    public static final String JMS_EXCHANGE_REDELIVERY_COUNTER = org.apache.camel.Exchange.REDELIVERY_COUNTER;
    public static final String HEADER_DYNAMIC_ROUTE_CAMEL_EXCEPTION_CAUGHT = org.apache.camel.Exchange.EXCEPTION_CAUGHT;
    public static final String HEADER_DYNAMIC_ROUTE_CAMEL_FAILURE_ENDPOINT = org.apache.camel.Exchange.FAILURE_ENDPOINT;
    private static final String EMPTY_ENCODED_MESSAGE = "N/A";
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.camel` is unnecessary and can be removed
in `consumer/commons/src/main/java/org/eclipse/kapua/consumer/commons/listener/error/ErrorMessageListener.java`
#### Snippet
```java
    public static final String JMS_EXCHANGE_REDELIVERY_COUNTER = org.apache.camel.Exchange.REDELIVERY_COUNTER;
    public static final String HEADER_DYNAMIC_ROUTE_CAMEL_EXCEPTION_CAUGHT = org.apache.camel.Exchange.EXCEPTION_CAUGHT;
    public static final String HEADER_DYNAMIC_ROUTE_CAMEL_FAILURE_ENDPOINT = org.apache.camel.Exchange.FAILURE_ENDPOINT;
    private static final String EMPTY_ENCODED_MESSAGE = "N/A";
    private static final String EMPTY_FIELD = "N/A";
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.camel` is unnecessary and can be removed
in `consumer/commons/src/main/java/org/eclipse/kapua/consumer/commons/listener/error/ErrorMessageListener.java`
#### Snippet
```java

    // use already defined constants on the new versions
    public static final String JMS_EXCHANGE_REDELIVERY_COUNTER = org.apache.camel.Exchange.REDELIVERY_COUNTER;
    public static final String HEADER_DYNAMIC_ROUTE_CAMEL_EXCEPTION_CAUGHT = org.apache.camel.Exchange.EXCEPTION_CAUGHT;
    public static final String HEADER_DYNAMIC_ROUTE_CAMEL_FAILURE_ENDPOINT = org.apache.camel.Exchange.FAILURE_ENDPOINT;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.model` is unnecessary and can be removed
in `service/job/api/src/main/java/org/eclipse/kapua/service/job/step/JobStepFactory.java`
#### Snippet
```java
 * {@link JobStepFactory} definition.
 *
 * @see org.eclipse.kapua.model.KapuaEntityFactory
 * @since 1.0.0
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.model` is unnecessary and can be removed
in `service/job/api/src/main/java/org/eclipse/kapua/service/job/step/definition/JobStepDefinitionFactory.java`
#### Snippet
```java
 * {@link JobStepDefinitionFactory} definition.
 *
 * @see org.eclipse.kapua.model.KapuaEntityFactory
 * @since 1.0.0
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.model` is unnecessary and can be removed
in `service/job/api/src/main/java/org/eclipse/kapua/service/job/targets/JobTargetFactory.java`
#### Snippet
```java
 * {@link JobTargetFactory} definition.
 *
 * @see org.eclipse.kapua.model.KapuaEntityFactory
 * @since 1.0.0
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.model` is unnecessary and can be removed
in `service/job/api/src/main/java/org/eclipse/kapua/service/job/execution/JobExecutionFactory.java`
#### Snippet
```java
 * {@link JobExecutionFactory} definition.
 *
 * @see org.eclipse.kapua.model.KapuaEntityFactory
 * @since 1.0.0
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.transport.message.jms` is unnecessary and can be removed
in `qa/common/src/main/java/org/eclipse/kapua/qa/common/BasicSteps.java`
#### Snippet
```java

    @ParameterType(".*")
    public org.eclipse.kapua.transport.message.jms.JmsTopic topic(String topic) {
        return new JmsTopic(topic);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.service.job.targets` is unnecessary and can be removed
in `job-engine/api/src/main/java/org/eclipse/kapua/job/engine/JobStartOptions.java`
#### Snippet
```java

    /**
     * Adds a {@link org.eclipse.kapua.service.job.targets.JobTarget} {@link KapuaId} from sub{@link java.util.List} of {@link org.eclipse.kapua.service.job.targets.JobTarget} {@link KapuaId}s.
     *
     * @param targetId The {@link org.eclipse.kapua.service.job.targets.JobTarget} {@link KapuaId} to add.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.service.job.targets` is unnecessary and can be removed
in `job-engine/api/src/main/java/org/eclipse/kapua/job/engine/JobStartOptions.java`
#### Snippet
```java

    /**
     * Adds a {@link org.eclipse.kapua.service.job.targets.JobTarget} {@link KapuaId} from sub{@link java.util.List} of {@link org.eclipse.kapua.service.job.targets.JobTarget} {@link KapuaId}s.
     *
     * @param targetId The {@link org.eclipse.kapua.service.job.targets.JobTarget} {@link KapuaId} to add.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.service.job.targets` is unnecessary and can be removed
in `job-engine/api/src/main/java/org/eclipse/kapua/job/engine/JobStartOptions.java`
#### Snippet
```java
     * Adds a {@link org.eclipse.kapua.service.job.targets.JobTarget} {@link KapuaId} from sub{@link java.util.List} of {@link org.eclipse.kapua.service.job.targets.JobTarget} {@link KapuaId}s.
     *
     * @param targetId The {@link org.eclipse.kapua.service.job.targets.JobTarget} {@link KapuaId} to add.
     * @since 1.0.0
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.service.job.targets` is unnecessary and can be removed
in `job-engine/api/src/main/java/org/eclipse/kapua/job/engine/JobStartOptions.java`
#### Snippet
```java

    /**
     * Gets the sub{@link java.util.List} of {@link org.eclipse.kapua.service.job.targets.JobTarget} {@link KapuaId}s.
     *
     * @return The sub{@link java.util.List} of {@link org.eclipse.kapua.service.job.targets.JobTarget} {@link KapuaId}s.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.service.job.targets` is unnecessary and can be removed
in `job-engine/api/src/main/java/org/eclipse/kapua/job/engine/JobStartOptions.java`
#### Snippet
```java
     * Gets the sub{@link java.util.List} of {@link org.eclipse.kapua.service.job.targets.JobTarget} {@link KapuaId}s.
     *
     * @return The sub{@link java.util.List} of {@link org.eclipse.kapua.service.job.targets.JobTarget} {@link KapuaId}s.
     * @since 1.0.0
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.service.job.targets` is unnecessary and can be removed
in `job-engine/api/src/main/java/org/eclipse/kapua/job/engine/JobStartOptions.java`
#### Snippet
```java

    /**
     * Sets the sub{@link java.util.List} of {@link org.eclipse.kapua.service.job.targets.JobTarget} {@link KapuaId}s.
     *
     * @param targetIdSublist The sub{@link java.util.List} of {@link org.eclipse.kapua.service.job.targets.JobTarget} {@link KapuaId}s.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.service.job.targets` is unnecessary and can be removed
in `job-engine/api/src/main/java/org/eclipse/kapua/job/engine/JobStartOptions.java`
#### Snippet
```java
     * Sets the sub{@link java.util.List} of {@link org.eclipse.kapua.service.job.targets.JobTarget} {@link KapuaId}s.
     *
     * @param targetIdSublist The sub{@link java.util.List} of {@link org.eclipse.kapua.service.job.targets.JobTarget} {@link KapuaId}s.
     * @since 1.0.0
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.service.job.targets` is unnecessary and can be removed
in `job-engine/api/src/main/java/org/eclipse/kapua/job/engine/JobStartOptions.java`
#### Snippet
```java

    /**
     * Removes a {@link org.eclipse.kapua.service.job.targets.JobTarget} {@link KapuaId} from sub{@link java.util.List} of {@link org.eclipse.kapua.service.job.targets.JobTarget} {@link KapuaId}s.
     *
     * @param targetId The {@link org.eclipse.kapua.service.job.targets.JobTarget} {@link KapuaId} to remove.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.service.job.targets` is unnecessary and can be removed
in `job-engine/api/src/main/java/org/eclipse/kapua/job/engine/JobStartOptions.java`
#### Snippet
```java

    /**
     * Removes a {@link org.eclipse.kapua.service.job.targets.JobTarget} {@link KapuaId} from sub{@link java.util.List} of {@link org.eclipse.kapua.service.job.targets.JobTarget} {@link KapuaId}s.
     *
     * @param targetId The {@link org.eclipse.kapua.service.job.targets.JobTarget} {@link KapuaId} to remove.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.service.job.targets` is unnecessary and can be removed
in `job-engine/api/src/main/java/org/eclipse/kapua/job/engine/JobStartOptions.java`
#### Snippet
```java
     * Removes a {@link org.eclipse.kapua.service.job.targets.JobTarget} {@link KapuaId} from sub{@link java.util.List} of {@link org.eclipse.kapua.service.job.targets.JobTarget} {@link KapuaId}s.
     *
     * @param targetId The {@link org.eclipse.kapua.service.job.targets.JobTarget} {@link KapuaId} to remove.
     * @since 1.0.0
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `job-engine/api/src/main/java/org/eclipse/kapua/job/engine/JobEngineService.java`
#### Snippet
```java
     *
     * @param scopeId The scopeId of the {@link org.eclipse.kapua.service.job.Job}
     * @param jobIds  A {@link java.util.Set} containing The ids of the {@link org.eclipse.kapua.service.job.Job}s
     * @return A {@link java.util.Map} whose keys are {@link org.eclipse.kapua.service.job.Job} and values are {@code true} if the {@link org.eclipse.kapua.service.job.Job}
     *         are currently running inside the {@link JobEngineService}
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `job-engine/api/src/main/java/org/eclipse/kapua/job/engine/JobEngineService.java`
#### Snippet
```java
     * @param scopeId The scopeId of the {@link org.eclipse.kapua.service.job.Job}
     * @param jobIds  A {@link java.util.Set} containing The ids of the {@link org.eclipse.kapua.service.job.Job}s
     * @return A {@link java.util.Map} whose keys are {@link org.eclipse.kapua.service.job.Job} and values are {@code true} if the {@link org.eclipse.kapua.service.job.Job}
     *         are currently running inside the {@link JobEngineService}
     * @throws KapuaException if something goes bad when checking the status of the job
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.service.job` is unnecessary and can be removed
in `job-engine/api/src/main/java/org/eclipse/kapua/job/engine/exception/JobResumingException.java`
#### Snippet
```java

/**
 * The {@link org.eclipse.kapua.service.job.Job} resume has thrown an error.
 *
 * @since 1.0.0
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.model` is unnecessary and can be removed
in `service/user/api/src/main/java/org/eclipse/kapua/service/user/UserFactory.java`
#### Snippet
```java
 * {@link UserFactory} definition.
 *
 * @see org.eclipse.kapua.model.KapuaEntityFactory
 * @since 1.0.0
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.model` is unnecessary and can be removed
in `service/security/authorization/api/src/main/java/org/eclipse/kapua/service/authorization/role/RolePermissionFactory.java`
#### Snippet
```java
 * {@link RolePermissionFactory} definition.
 *
 * @see org.eclipse.kapua.model.KapuaEntityFactory
 * @since 1.0.0
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.model` is unnecessary and can be removed
in `service/security/authorization/api/src/main/java/org/eclipse/kapua/service/authorization/role/RoleFactory.java`
#### Snippet
```java
 * {@link RoleFactory} definition.
 *
 * @see org.eclipse.kapua.model.KapuaEntityFactory
 * @since 1.0.0
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.model` is unnecessary and can be removed
in `service/security/authorization/api/src/main/java/org/eclipse/kapua/service/authorization/group/GroupFactory.java`
#### Snippet
```java
 * {@link GroupFactory} definition.
 *
 * @see org.eclipse.kapua.model.KapuaEntityFactory
 * @since 1.0.0
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.model` is unnecessary and can be removed
in `service/security/authorization/api/src/main/java/org/eclipse/kapua/service/authorization/access/AccessRoleFactory.java`
#### Snippet
```java
 * {@link AccessRoleFactory} definition.
 *
 * @see org.eclipse.kapua.model.KapuaEntityFactory
 * @since 1.0.0
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.model` is unnecessary and can be removed
in `service/security/authorization/api/src/main/java/org/eclipse/kapua/service/authorization/access/AccessInfoFactory.java`
#### Snippet
```java
 * {@link AccessInfoFactory} definition.
 *
 * @see org.eclipse.kapua.model.KapuaEntityFactory
 * @since 1.0.0
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.model` is unnecessary and can be removed
in `service/security/authorization/api/src/main/java/org/eclipse/kapua/service/authorization/access/AccessPermissionFactory.java`
#### Snippet
```java
 * {@link AccessPermissionFactory} definition.
 *
 * @see org.eclipse.kapua.model.KapuaEntityFactory
 * @since 1.0.0
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.model` is unnecessary and can be removed
in `service/security/authorization/api/src/main/java/org/eclipse/kapua/service/authorization/domain/DomainFactory.java`
#### Snippet
```java
 * {@link DomainFactory} definition.
 *
 * @see org.eclipse.kapua.model.KapuaEntityFactory
 * @since 1.0.0
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.service.authorization.permission` is unnecessary and can be removed
in `service/security/authorization/api/src/main/java/org/eclipse/kapua/service/authorization/domain/DomainCreator.java`
#### Snippet
```java
    /**
     * Sets whether or not this {@link Domain} is group-able or not.
     * This determines if the {@link org.eclipse.kapua.service.authorization.permission.Permission} in this {@link Domain} can have a {@link org.eclipse.kapua.service.authorization.group.Group} or not.
     * This is related to the {@link org.eclipse.kapua.service.authorization.group.Groupable} property of a {@link KapuaEntityCreator}.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.service.authorization.permission` is unnecessary and can be removed
in `service/security/authorization/api/src/main/java/org/eclipse/kapua/service/authorization/domain/DomainCreator.java`
#### Snippet
```java
     * This is related to the {@link org.eclipse.kapua.service.authorization.group.Groupable} property of a {@link KapuaEntityCreator}.
     *
     * @param groupable {@code true} if the {@link org.eclipse.kapua.service.authorization.permission.Permission} on this {@link Domain} can have the {@link Permission#getGroupId()} property set, {@code false} otherwise.
     * @since 0.3.1
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.service.authorization.permission` is unnecessary and can be removed
in `service/security/authorization/api/src/main/java/org/eclipse/kapua/service/authorization/domain/Domain.java`
#### Snippet
```java
    /**
     * Sets whether or not this {@link Domain} is group-able or not.
     * This determines if the {@link org.eclipse.kapua.service.authorization.permission.Permission} in this {@link Domain} can have a {@link org.eclipse.kapua.service.authorization.group.Group} or not.
     * This is related to the {@link org.eclipse.kapua.service.authorization.group.Groupable} property of a {@link KapuaEntity}.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.service.authorization.permission` is unnecessary and can be removed
in `service/security/authorization/api/src/main/java/org/eclipse/kapua/service/authorization/domain/Domain.java`
#### Snippet
```java
     * This is related to the {@link org.eclipse.kapua.service.authorization.group.Groupable} property of a {@link KapuaEntity}.
     *
     * @param groupable {@code true} if the {@link org.eclipse.kapua.service.authorization.permission.Permission} on this {@link Domain} can have the {@link Permission#getGroupId()} property set, {@code false} otherwise.
     * @since 0.3.1
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.model.domain` is unnecessary and can be removed
in `service/security/authorization/api/src/main/java/org/eclipse/kapua/service/authorization/permission/Permission.java`
#### Snippet
```java

    /**
     * Sets the {@link org.eclipse.kapua.model.domain.Actions} that this {@link Permission} allows to do on the domain.
     *
     * @param action The {@link javax.swing.Action} that this {@link Permission} allows
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.message` is unnecessary and can be removed
in `message/api/src/main/java/org/eclipse/kapua/message/KapuaPosition.java`
#### Snippet
```java
 * {@link KapuaPosition} is a data structure to capture a geo location.
 * <p>
 * It can be associated to an {@link org.eclipse.kapua.message.KapuaPayload} to geotag an {@link org.eclipse.kapua.message.KapuaMessage} before sending to Kapua.
 *
 * @since 1.0.0
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.message` is unnecessary and can be removed
in `message/api/src/main/java/org/eclipse/kapua/message/KapuaPosition.java`
#### Snippet
```java
 * {@link KapuaPosition} is a data structure to capture a geo location.
 * <p>
 * It can be associated to an {@link org.eclipse.kapua.message.KapuaPayload} to geotag an {@link org.eclipse.kapua.message.KapuaMessage} before sending to Kapua.
 *
 * @since 1.0.0
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.model` is unnecessary and can be removed
in `service/tag/api/src/main/java/org/eclipse/kapua/service/tag/TagFactory.java`
#### Snippet
```java
 * {@link TagFactory} definition.
 *
 * @see org.eclipse.kapua.model.KapuaEntityFactory
 * @since 1.0.0
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.model` is unnecessary and can be removed
in `service/device/registry/api/src/main/java/org/eclipse/kapua/service/device/registry/DeviceFactory.java`
#### Snippet
```java
 * {@link Device} {@link KapuaEntityFactory} definition.
 *
 * @see org.eclipse.kapua.model.KapuaEntityFactory
 * @since 1.0.0
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.model` is unnecessary and can be removed
in `service/device/registry/api/src/main/java/org/eclipse/kapua/service/device/registry/event/DeviceEventFactory.java`
#### Snippet
```java
 * {@link DeviceEventFactory} definition.
 *
 * @see org.eclipse.kapua.model.KapuaEntityFactory
 * @since 1.0.0
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.model` is unnecessary and can be removed
in `service/device/registry/api/src/main/java/org/eclipse/kapua/service/device/registry/connection/DeviceConnectionFactory.java`
#### Snippet
```java
 * {@link DeviceConnectionFactory} definition.
 *
 * @see org.eclipse.kapua.model.KapuaEntityFactory
 * @since 1.0.0
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.model` is unnecessary and can be removed
in `service/device/registry/api/src/main/java/org/eclipse/kapua/service/device/registry/connection/option/DeviceConnectionOptionFactory.java`
#### Snippet
```java
 * {@link DeviceConnectionOptionFactory} definition.
 *
 * @see org.eclipse.kapua.model.KapuaEntityFactory
 * @since 1.0.0
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.glassfish.jersey.moxy.json` is unnecessary, and can be replaced with an import
in `rest-api/web/src/main/java/org/eclipse/kapua/app/api/web/RestApisApplication.java`
#### Snippet
```java

        //Manually adding MOXyJSONFeature
        register(org.glassfish.jersey.moxy.json.MoxyJsonFeature.class);
        register(MoxyJsonConfigContextResolver.class);
        register(UriConnegFilter.class);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.broker.core.plugin.authentication` is unnecessary and can be removed
in `broker/core/src/main/java/org/eclipse/kapua/broker/core/plugin/authentication/Authenticator.java`
#### Snippet
```java
     *             if any checks fails (credential not valid, profile missing, ...)
     */
    public abstract List<org.eclipse.kapua.broker.core.plugin.authentication.AuthorizationEntry> connect(KapuaSecurityContext kapuaSecurityContext)
            throws KapuaException;

```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.broker.core.plugin.authentication` is unnecessary and can be removed
in `broker/core/src/main/java/org/eclipse/kapua/broker/core/plugin/authentication/AuthenticationLogic.java`
#### Snippet
```java
     * @throws KapuaException
     */
    public abstract List<org.eclipse.kapua.broker.core.plugin.authentication.AuthorizationEntry> connect(KapuaSecurityContext kapuaSecurityContext)
            throws KapuaException;

```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `translator/api/src/main/java/org/eclipse/kapua/translator/Translator.java`
#### Snippet
```java
     * Return a {@link Translator} for the given {@link Message}s types.
     * <br>
     * This method will lookup instances of {@link Translator} through {@link java.util.ServiceLoader}
     *
     * @param fromMessageClass {@link Message} type from which {@link #translate(Message)}.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.kura.simulator.app.deploy` is unnecessary and can be removed
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/app/deploy/SimpleDeployApplication.java`
#### Snippet
```java
    }

    private List<org.eclipse.kapua.kura.simulator.app.deploy.DeploymentPackageInformation.BundleInformation> bundles(
            final String baseName, final String version, final int count) {
        if (count <= 0) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.kura.simulator.app.deploy` is unnecessary and can be removed
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/app/deploy/SimpleDeployApplication.java`
#### Snippet
```java
        }

        final List<org.eclipse.kapua.kura.simulator.app.deploy.DeploymentPackageInformation.BundleInformation> result = new ArrayList<>(
                count);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.kura.simulator.app.deploy` is unnecessary and can be removed
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/app/deploy/SimpleDeployApplication.java`
#### Snippet
```java
        for (int i = 0; i < count; i++) {
            final String name = String.format("%s.%s", baseName, i);
            result.add(new org.eclipse.kapua.kura.simulator.app.deploy.DeploymentPackageInformation.BundleInformation(
                    name, version));
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.logging` is unnecessary, and can be replaced with an import
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/main/SimulatorRunner.java`
#### Snippet
```java
     */
    private static void toInfinityAndBeyond() {
        java.util.logging.LogManager.getLogManager().reset();
        SLF4JBridgeHandler.removeHandlersForRootLogger();
        SLF4JBridgeHandler.install();
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.logging` is unnecessary, and can be replaced with an import
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/main/SimulatorRunner.java`
#### Snippet
```java
        SLF4JBridgeHandler.removeHandlersForRootLogger();
        SLF4JBridgeHandler.install();
        java.util.logging.Logger.getLogger("org.eclipse.paho.client.mqttv3").setLevel(java.util.logging.Level.ALL);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `ch.qos.logback.classic` is unnecessary, and can be replaced with an import
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/main/SimulatorRunner.java`
#### Snippet
```java
        final ch.qos.logback.classic.Logger rootLogger = context.getLogger(Logger.ROOT_LOGGER_NAME);
        if (cli.hasOption("d")) {
            rootLogger.setLevel(ch.qos.logback.classic.Level.ALL);
        } else if (cli.hasOption("v")) {
            rootLogger.setLevel(ch.qos.logback.classic.Level.INFO);
```

### UnnecessaryFullyQualifiedName
Qualifier `ch.qos.logback.classic` is unnecessary, and can be replaced with an import
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/main/SimulatorRunner.java`
#### Snippet
```java
            rootLogger.setLevel(ch.qos.logback.classic.Level.ALL);
        } else if (cli.hasOption("v")) {
            rootLogger.setLevel(ch.qos.logback.classic.Level.INFO);
        } else if (cli.hasOption("q")) {
            rootLogger.setLevel(ch.qos.logback.classic.Level.WARN);
```

### UnnecessaryFullyQualifiedName
Qualifier `ch.qos.logback.classic` is unnecessary, and can be replaced with an import
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/main/SimulatorRunner.java`
#### Snippet
```java
            rootLogger.setLevel(ch.qos.logback.classic.Level.INFO);
        } else if (cli.hasOption("q")) {
            rootLogger.setLevel(ch.qos.logback.classic.Level.WARN);
        } else {
            rootLogger.setLevel(ch.qos.logback.classic.Level.INFO);
```

### UnnecessaryFullyQualifiedName
Qualifier `ch.qos.logback.classic` is unnecessary, and can be replaced with an import
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/main/SimulatorRunner.java`
#### Snippet
```java
            rootLogger.setLevel(ch.qos.logback.classic.Level.WARN);
        } else {
            rootLogger.setLevel(ch.qos.logback.classic.Level.INFO);
        }
        rootLogger.addAppender(consoleAdapter);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.transport.mqtt` is unnecessary and can be removed
in `transport/mqtt/src/main/java/org/eclipse/kapua/transport/mqtt/exception/MqttClientNotConnectedException.java`
#### Snippet
```java
     * Constructor.
     *
     * @param clientId The clientId of the {@link org.eclipse.kapua.transport.mqtt.MqttClient} that produced this {@link MqttClientNotConnectedException}.
     * @since 1.2.0
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.transport.mqtt` is unnecessary and can be removed
in `transport/mqtt/src/main/java/org/eclipse/kapua/transport/mqtt/exception/MqttClientTerminateException.java`
#### Snippet
```java
     *
     * @param cause    The root {@link Throwable} that caused the error.
     * @param clientId The clientId of the {@link org.eclipse.kapua.transport.mqtt.MqttClient} that produced this {@link MqttClientTerminateException}.
     * @since 1.2.0
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.transport.message.mqtt` is unnecessary and can be removed
in `transport/mqtt/src/main/java/org/eclipse/kapua/transport/mqtt/exception/MqttClientSubscribeException.java`
#### Snippet
```java

    /**
     * The {@link org.eclipse.kapua.transport.message.mqtt.MqttTopic} where the {@link MqttClient} tired to subscribe to.
     *
     * @since 1.2.0
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.transport.mqtt` is unnecessary and can be removed
in `transport/mqtt/src/main/java/org/eclipse/kapua/transport/mqtt/exception/MqttClientSubscribeException.java`
#### Snippet
```java
     *
     * @param cause    The root {@link Throwable} that caused the error.
     * @param clientId The clientId of the {@link org.eclipse.kapua.transport.mqtt.MqttClient} that produced this {@link MqttClientSubscribeException}.
     * @param topic    The {@link org.eclipse.kapua.transport.message.mqtt.MqttTopic} where the {@link MqttClient} tired to subscribe to.
     * @since 1.2.0
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.transport.message.mqtt` is unnecessary and can be removed
in `transport/mqtt/src/main/java/org/eclipse/kapua/transport/mqtt/exception/MqttClientSubscribeException.java`
#### Snippet
```java
     * @param cause    The root {@link Throwable} that caused the error.
     * @param clientId The clientId of the {@link org.eclipse.kapua.transport.mqtt.MqttClient} that produced this {@link MqttClientSubscribeException}.
     * @param topic    The {@link org.eclipse.kapua.transport.message.mqtt.MqttTopic} where the {@link MqttClient} tired to subscribe to.
     * @since 1.2.0
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.transport.message.mqtt` is unnecessary and can be removed
in `transport/mqtt/src/main/java/org/eclipse/kapua/transport/mqtt/exception/MqttClientSubscribeException.java`
#### Snippet
```java

/**
 * {@link Exception} to {@code throw} when the {@link MqttClient} cannot subscribe to the {@link org.eclipse.kapua.transport.message.mqtt.MqttTopic}
 *
 * @since 1.2.0
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.transport.message.mqtt` is unnecessary and can be removed
in `transport/mqtt/src/main/java/org/eclipse/kapua/transport/mqtt/exception/MqttClientSubscribeException.java`
#### Snippet
```java

    /**
     * Gets the {@link org.eclipse.kapua.transport.message.mqtt.MqttTopic} where the {@link MqttClient} tired to subscribe to.
     *
     * @return The {@link org.eclipse.kapua.transport.message.mqtt.MqttTopic} where the {@link MqttClient} tired to subscribe to.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.transport.message.mqtt` is unnecessary and can be removed
in `transport/mqtt/src/main/java/org/eclipse/kapua/transport/mqtt/exception/MqttClientSubscribeException.java`
#### Snippet
```java
     * Gets the {@link org.eclipse.kapua.transport.message.mqtt.MqttTopic} where the {@link MqttClient} tired to subscribe to.
     *
     * @return The {@link org.eclipse.kapua.transport.message.mqtt.MqttTopic} where the {@link MqttClient} tired to subscribe to.
     * @since 1.2.0
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.transport.mqtt` is unnecessary and can be removed
in `transport/mqtt/src/main/java/org/eclipse/kapua/transport/mqtt/exception/MqttClientConnectException.java`
#### Snippet
```java
     * Constructor.
     *
     * @param clientId The clientId of the {@link org.eclipse.kapua.transport.mqtt.MqttClient} that produced this {@link MqttClientConnectException}.
     * @param username The username used to authenticate into the server.
     * @param uri      The {@link URI} of the server which the {@link MqttClient} was connecting to.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.transport.mqtt` is unnecessary and can be removed
in `transport/mqtt/src/main/java/org/eclipse/kapua/transport/mqtt/exception/MqttClientConnectException.java`
#### Snippet
```java
     *
     * @param cause    The root {@link Throwable} that caused the error.
     * @param clientId The clientId of the {@link org.eclipse.kapua.transport.mqtt.MqttClient} that produced this {@link MqttClientConnectException}.
     * @param username The username used to authenticate into the server.
     * @param uri      The {@link URI} of the server which the {@link MqttClient} was connecting to.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.transport.mqtt` is unnecessary and can be removed
in `transport/mqtt/src/main/java/org/eclipse/kapua/transport/mqtt/exception/MqttClientAlreadyConnectedException.java`
#### Snippet
```java
     * Constructor.
     *
     * @param clientId The clientId of the {@link org.eclipse.kapua.transport.mqtt.MqttClient} that produced this {@link MqttClientCleanException}.
     * @since 1.2.0
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.transport.message.mqtt` is unnecessary and can be removed
in `transport/mqtt/src/main/java/org/eclipse/kapua/transport/mqtt/exception/MqttClientUnsubscribeException.java`
#### Snippet
```java

    /**
     * Gets the {@link org.eclipse.kapua.transport.message.mqtt.MqttTopic} where the {@link MqttClient} tired to unsubscribe from.
     *
     * @return The {@link org.eclipse.kapua.transport.message.mqtt.MqttTopic} where the {@link MqttClient} tired to unsubscribe from.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.transport.message.mqtt` is unnecessary and can be removed
in `transport/mqtt/src/main/java/org/eclipse/kapua/transport/mqtt/exception/MqttClientUnsubscribeException.java`
#### Snippet
```java
     * Gets the {@link org.eclipse.kapua.transport.message.mqtt.MqttTopic} where the {@link MqttClient} tired to unsubscribe from.
     *
     * @return The {@link org.eclipse.kapua.transport.message.mqtt.MqttTopic} where the {@link MqttClient} tired to unsubscribe from.
     * @since 1.2.0
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.transport.mqtt` is unnecessary and can be removed
in `transport/mqtt/src/main/java/org/eclipse/kapua/transport/mqtt/exception/MqttClientUnsubscribeException.java`
#### Snippet
```java
     *
     * @param cause    The root {@link Throwable} that caused the error.
     * @param clientId The clientId of the {@link org.eclipse.kapua.transport.mqtt.MqttClient} that produced this {@link MqttClientSubscribeException}.
     * @param topic    The {@link org.eclipse.kapua.transport.message.mqtt.MqttTopic} where the {@link MqttClient} tired to unsubscribe from.
     * @since 1.2.0
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.transport.message.mqtt` is unnecessary and can be removed
in `transport/mqtt/src/main/java/org/eclipse/kapua/transport/mqtt/exception/MqttClientUnsubscribeException.java`
#### Snippet
```java
     * @param cause    The root {@link Throwable} that caused the error.
     * @param clientId The clientId of the {@link org.eclipse.kapua.transport.mqtt.MqttClient} that produced this {@link MqttClientSubscribeException}.
     * @param topic    The {@link org.eclipse.kapua.transport.message.mqtt.MqttTopic} where the {@link MqttClient} tired to unsubscribe from.
     * @since 1.2.0
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.transport.mqtt` is unnecessary and can be removed
in `transport/mqtt/src/main/java/org/eclipse/kapua/transport/mqtt/exception/MqttClientCallbackSetException.java`
#### Snippet
```java
     *
     * @param cause    The root {@link Throwable} that caused the error.
     * @param clientId The clientId of the {@link org.eclipse.kapua.transport.mqtt.MqttClient} that produced this {@link MqttClientCallbackSetException}.
     * @param topic    The response {@link MqttTopic} on which the {@link org.eclipse.kapua.transport.mqtt.MqttResponseCallback} was subscribed.
     * @since 1.2.0
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.transport.mqtt` is unnecessary and can be removed
in `transport/mqtt/src/main/java/org/eclipse/kapua/transport/mqtt/exception/MqttClientCleanException.java`
#### Snippet
```java
     *
     * @param cause    The root {@link Throwable} that caused the error
     * @param clientId The clientId of the {@link org.eclipse.kapua.transport.mqtt.MqttClient} that produced this {@link MqttClientCleanException}
     * @since 1.2.0
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.service.device.registry` is unnecessary and can be removed
in `service/device/commons/src/main/java/org/eclipse/kapua/service/device/management/commons/AbstractDeviceManagementServiceImpl.java`
#### Snippet
```java
     *
     * @param scopeId         The scopeId in which to create the {@link org.eclipse.kapua.service.device.registry.event.DeviceEvent}
     * @param deviceId        The {@link org.eclipse.kapua.service.device.registry.Device} id for which the {@link org.eclipse.kapua.service.device.registry.event.DeviceEvent} is created
     * @param requestMessage  The {@link KapuaRequestMessage} of the DeviceManagementService operation from which to extract data.
     * @param responseMessage The {@link KapuaResponseMessage} of the DeviceManagementService operation from which to extract data.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.commons.setting` is unnecessary and can be removed
in `service/datastore/internal/src/main/java/org/eclipse/kapua/service/datastore/internal/setting/DatastoreElasticsearchClientSettings.java`
#### Snippet
```java

/**
 * Datastore {@link org.eclipse.kapua.service.elasticsearch.client.ElasticsearchClient} {@link org.eclipse.kapua.commons.setting.AbstractKapuaSetting}
 *
 * @since 1.3.0
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.service` is unnecessary and can be removed
in `service/device/management/asset/api/src/main/java/org/eclipse/kapua/service/device/management/asset/DeviceAssetManagementService.java`
#### Snippet
```java
 * {@link DeviceAsset} {@link KapuaService} definition.
 *
 * @see org.eclipse.kapua.service.KapuaService
 * @since 1.0.0
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.model` is unnecessary and can be removed
in `service/device/management/asset/api/src/main/java/org/eclipse/kapua/service/device/management/asset/DeviceAssetFactory.java`
#### Snippet
```java
 * {@link DeviceAsset} {@link KapuaObjectFactory} definition.
 *
 * @see org.eclipse.kapua.model.KapuaObjectFactory
 * @since 1.0.0
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.xml.bind.annotation.adapters` is unnecessary and can be removed
in `service/device/management/asset/api/src/main/java/org/eclipse/kapua/service/device/management/asset/xml/DeviceAssetChannelXmlAdapter.java`
#### Snippet
```java
 * {@link DeviceAssetChannel} {@link XmlAdapter} implementation.
 *
 * @see javax.xml.bind.annotation.adapters.XmlAdapter
 * @since 1.0.0
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `service/api/src/main/java/org/eclipse/kapua/KapuaRuntimeErrorCodes.java`
#### Snippet
```java

    /**
     * Error while writing {@link java.util.Properties} to {@link KapuaUpdatableEntity#setEntityAttributes(Properties)} or {@link KapuaUpdatableEntity#setEntityProperties(Properties)}
     *
     * @since 1.1.0
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `service/api/src/main/java/org/eclipse/kapua/KapuaRuntimeErrorCodes.java`
#### Snippet
```java

    /**
     * Error while reading {@link java.util.Properties} from {@link KapuaUpdatableEntity#getEntityAttributes()} or {@link KapuaUpdatableEntity#getEntityProperties()}
     *
     * @since 1.1.0
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.model` is unnecessary and can be removed
in `service/api/src/main/java/org/eclipse/kapua/model/KapuaUpdatableEntityAttributes.java`
#### Snippet
```java
 * {@link KapuaUpdatableEntity} attributes.
 *
 * @see org.eclipse.kapua.model.KapuaEntityAttributes
 * @since 1.0.0
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.model` is unnecessary and can be removed
in `service/api/src/main/java/org/eclipse/kapua/model/KapuaNamedEntityAttributes.java`
#### Snippet
```java
 * {@link KapuaNamedEntityAttributes} attributes.
 *
 * @see org.eclipse.kapua.model.KapuaEntityAttributes
 * @since 1.0.0
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.model` is unnecessary and can be removed
in `service/security/certificate/api/src/main/java/org/eclipse/kapua/service/certificate/CertificateFactory.java`
#### Snippet
```java
 * {@link CertificateFactory} definition.
 *
 * @see org.eclipse.kapua.model.KapuaEntityFactory
 * @since 1.0.0
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security.cert` is unnecessary, and can be replaced with an import
in `service/security/certificate/api/src/main/java/org/eclipse/kapua/service/certificate/util/CertificateUtils.java`
#### Snippet
```java
        try {
            byte[] decoded = Base64.getDecoder().decode(getBytesOnly(certificateString));
            java.security.cert.CertificateFactory cf = java.security.cert.CertificateFactory.getInstance("X.509");
            return (X509Certificate) cf.generateCertificate(new ByteArrayInputStream(decoded));
        } catch (CertificateException e) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security.cert` is unnecessary, and can be replaced with an import
in `service/security/certificate/api/src/main/java/org/eclipse/kapua/service/certificate/util/CertificateUtils.java`
#### Snippet
```java
        try {
            byte[] decoded = Base64.getDecoder().decode(getBytesOnly(certificateString));
            java.security.cert.CertificateFactory cf = java.security.cert.CertificateFactory.getInstance("X.509");
            return (X509Certificate) cf.generateCertificate(new ByteArrayInputStream(decoded));
        } catch (CertificateException e) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `service/security/shiro/src/main/java/org/eclipse/kapua/service/authentication/shiro/realm/AccessTokenAuthenticatingRealm.java`
#### Snippet
```java
            AccessTokenQuery accessTokenQuery = ACCESS_TOKEN_FACTORY.newQuery(null);
            AndPredicate andPredicate = accessTokenQuery.andPredicate(
                    accessTokenQuery.attributePredicate(AccessTokenAttributes.EXPIRES_ON, new java.sql.Timestamp(now.getTime()), Operator.GREATER_THAN_OR_EQUAL),
                    accessTokenQuery.attributePredicate(AccessTokenAttributes.INVALIDATED_ON, null, Operator.IS_NULL),
                    accessTokenQuery.attributePredicate(AccessTokenAttributes.TOKEN_ID, tokenTokenId)
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `service/security/shiro/src/main/java/org/eclipse/kapua/service/authentication/shiro/AuthenticationServiceShiroImpl.java`
#### Snippet
```java
        AccessTokenQuery accessTokenQuery = accessTokenFactory.newQuery(null);
        AndPredicate andPredicate = accessTokenQuery.andPredicate(
                accessTokenQuery.attributePredicate(AccessTokenAttributes.REFRESH_EXPIRES_ON, new java.sql.Timestamp(new Date().getTime()), Operator.GREATER_THAN_OR_EQUAL),
                accessTokenQuery.attributePredicate(AccessTokenAttributes.INVALIDATED_ON, null, Operator.IS_NULL),
                accessTokenQuery.attributePredicate(AccessTokenAttributes.TOKEN_ID, tokenId)
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `service/security/shiro/src/main/java/org/eclipse/kapua/service/authentication/shiro/AuthenticationServiceShiroImpl.java`
#### Snippet
```java
                    AccessTokenQuery accessTokenQuery = accessTokenFactory.newQuery(null);
                    AndPredicate andPredicate = accessTokenQuery.andPredicate(
                            accessTokenQuery.attributePredicate(AccessTokenAttributes.EXPIRES_ON, new java.sql.Timestamp(new Date().getTime()), Operator.GREATER_THAN_OR_EQUAL),
                            accessTokenQuery.attributePredicate(AccessTokenAttributes.INVALIDATED_ON, null, Operator.IS_NULL),
                            accessTokenQuery.attributePredicate(AccessTokenAttributes.TOKEN_ID, tokenId)
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `service/device/registry/test-steps/src/main/java/org/eclipse/kapua/service/device/registry/steps/MqttDevice.java`
#### Snippet
```java
     * Listening mqtt client name.
     */
    private static final java.lang.String LISTENER_NAME = "ListenerClient_";

    /**
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `service/security/authentication/api/src/main/java/org/eclipse/kapua/service/authentication/KapuaPrincipal.java`
#### Snippet
```java
 */
// TODO it's an object used by both authorization and authentication... should leave it in authentication module?
public interface KapuaPrincipal extends Principal, java.io.Serializable {

    /**
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.model` is unnecessary and can be removed
in `service/security/authentication/api/src/main/java/org/eclipse/kapua/service/authentication/token/AccessTokenFactory.java`
#### Snippet
```java
 * {@link AccessTokenFactory} definition.
 *
 * @see org.eclipse.kapua.model.KapuaEntityFactory
 * @since 1.0.0
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.model` is unnecessary and can be removed
in `service/security/authentication/api/src/main/java/org/eclipse/kapua/service/authentication/credential/CredentialFactory.java`
#### Snippet
```java
 * {@link CredentialFactory} definition.
 *
 * @see org.eclipse.kapua.model.KapuaEntityFactory
 * @since 1.0.0
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.model.domain` is unnecessary and can be removed
in `service/scheduler/api/src/main/java/org/eclipse/kapua/service/scheduler/SchedulerDomain.java`
#### Snippet
```java
 * {@link TriggerService} {@link Domain}.
 *
 * @see org.eclipse.kapua.model.domain.Domain
 * @since 1.0.0
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.model` is unnecessary and can be removed
in `service/scheduler/api/src/main/java/org/eclipse/kapua/service/scheduler/trigger/fired/FiredTriggerCreator.java`
#### Snippet
```java

/**
 * {@link FiredTrigger} {@link org.eclipse.kapua.model.KapuaEntityCreator} definition.
 *
 * @since 1.5.0
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.model` is unnecessary and can be removed
in `service/scheduler/api/src/main/java/org/eclipse/kapua/service/scheduler/trigger/fired/FiredTrigger.java`
#### Snippet
```java

/**
 * {@link FiredTrigger} {@link org.eclipse.kapua.model.KapuaEntity} definition.
 * <p>
 * Contains data for each one of the {@link Trigger} fires.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.model` is unnecessary and can be removed
in `service/scheduler/api/src/main/java/org/eclipse/kapua/service/scheduler/trigger/TriggerCreator.java`
#### Snippet
```java
 * {@link Trigger} {@link KapuaNamedEntityCreator} definition.
 *
 * @see org.eclipse.kapua.model.KapuaNamedEntityCreator
 * @since 1.0.0
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.service` is unnecessary and can be removed
in `service/scheduler/api/src/main/java/org/eclipse/kapua/service/scheduler/trigger/fired/FiredTriggerService.java`
#### Snippet
```java
 * {@link FiredTrigger} {@link KapuaEntityService} definition.
 *
 * @see org.eclipse.kapua.service.KapuaEntityService
 * @since 1.5.0
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.model` is unnecessary and can be removed
in `service/scheduler/api/src/main/java/org/eclipse/kapua/service/scheduler/trigger/fired/FiredTriggerAttributes.java`
#### Snippet
```java

/**
 * {@link FiredTrigger} {@link org.eclipse.kapua.model.KapuaEntityAttributes}.
 *
 * @since 1.5.0
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.service` is unnecessary and can be removed
in `service/scheduler/api/src/main/java/org/eclipse/kapua/service/scheduler/trigger/definition/TriggerDefinitionService.java`
#### Snippet
```java
 * {@link TriggerDefinition} {@link KapuaEntityService} definition.
 *
 * @see org.eclipse.kapua.service.KapuaEntityService
 * @see org.eclipse.kapua.service.KapuaUpdatableEntityService
 * @since 1.1.0
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.service` is unnecessary and can be removed
in `service/scheduler/api/src/main/java/org/eclipse/kapua/service/scheduler/trigger/definition/TriggerDefinitionService.java`
#### Snippet
```java
 *
 * @see org.eclipse.kapua.service.KapuaEntityService
 * @see org.eclipse.kapua.service.KapuaUpdatableEntityService
 * @since 1.1.0
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.service.scheduler.trigger` is unnecessary and can be removed
in `service/scheduler/api/src/main/java/org/eclipse/kapua/service/scheduler/exception/TriggerInvalidDatesException.java`
#### Snippet
```java

/**
 * {@link SchedulerServiceException} to {@code throw} when the {@link org.eclipse.kapua.service.scheduler.trigger.Trigger} dates do not make sense with the current date.
 *
 * @since 1.5.0
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.xml.bind.annotation` is unnecessary, and can be replaced with an import
in `service/device/call/kura/src/main/java/org/eclipse/kapua/service/device/call/kura/model/bundle/package-info.java`
#### Snippet
```java
//

@javax.xml.bind.annotation.XmlSchema(xmlns = {
        @XmlNs(namespaceURI = "http://eurotech.com/esf/2.0", prefix = "esf"),
        @XmlNs(namespaceURI = "http://www.osgi.org/xmlns/metatype/v1.2.0", prefix = "ocd")
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.xml.bind.annotation` is unnecessary, and can be replaced with an import
in `service/device/call/kura/src/main/java/org/eclipse/kapua/service/device/call/kura/model/bundle/package-info.java`
#### Snippet
```java
        @XmlNs(namespaceURI = "http://eurotech.com/esf/2.0", prefix = "esf"),
        @XmlNs(namespaceURI = "http://www.osgi.org/xmlns/metatype/v1.2.0", prefix = "ocd")
}, elementFormDefault = javax.xml.bind.annotation.XmlNsForm.QUALIFIED, attributeFormDefault = javax.xml.bind.annotation.XmlNsForm.UNQUALIFIED)
package org.eclipse.kapua.service.device.call.kura.model.bundle;

```

### UnnecessaryFullyQualifiedName
Qualifier `javax.xml.bind.annotation` is unnecessary, and can be replaced with an import
in `service/device/call/kura/src/main/java/org/eclipse/kapua/service/device/call/kura/model/bundle/package-info.java`
#### Snippet
```java
        @XmlNs(namespaceURI = "http://eurotech.com/esf/2.0", prefix = "esf"),
        @XmlNs(namespaceURI = "http://www.osgi.org/xmlns/metatype/v1.2.0", prefix = "ocd")
}, elementFormDefault = javax.xml.bind.annotation.XmlNsForm.QUALIFIED, attributeFormDefault = javax.xml.bind.annotation.XmlNsForm.UNQUALIFIED)
package org.eclipse.kapua.service.device.call.kura.model.bundle;

```

### UnnecessaryFullyQualifiedName
Qualifier `javax.xml.bind.annotation` is unnecessary, and can be replaced with an import
in `service/device/call/kura/src/main/java/org/eclipse/kapua/service/device/call/kura/model/deploy/package-info.java`
#### Snippet
```java
//

@javax.xml.bind.annotation.XmlSchema(xmlns = {
        @XmlNs(namespaceURI = "http://eurotech.com/esf/2.0", prefix = "esf"),
        @XmlNs(namespaceURI = "http://www.osgi.org/xmlns/metatype/v1.2.0", prefix = "ocd")
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.xml.bind.annotation` is unnecessary, and can be replaced with an import
in `service/device/call/kura/src/main/java/org/eclipse/kapua/service/device/call/kura/model/deploy/package-info.java`
#### Snippet
```java
        @XmlNs(namespaceURI = "http://eurotech.com/esf/2.0", prefix = "esf"),
        @XmlNs(namespaceURI = "http://www.osgi.org/xmlns/metatype/v1.2.0", prefix = "ocd")
}, elementFormDefault = javax.xml.bind.annotation.XmlNsForm.QUALIFIED, attributeFormDefault = javax.xml.bind.annotation.XmlNsForm.UNQUALIFIED)
package org.eclipse.kapua.service.device.call.kura.model.deploy;

```

### UnnecessaryFullyQualifiedName
Qualifier `javax.xml.bind.annotation` is unnecessary, and can be replaced with an import
in `service/device/call/kura/src/main/java/org/eclipse/kapua/service/device/call/kura/model/deploy/package-info.java`
#### Snippet
```java
        @XmlNs(namespaceURI = "http://eurotech.com/esf/2.0", prefix = "esf"),
        @XmlNs(namespaceURI = "http://www.osgi.org/xmlns/metatype/v1.2.0", prefix = "ocd")
}, elementFormDefault = javax.xml.bind.annotation.XmlNsForm.QUALIFIED, attributeFormDefault = javax.xml.bind.annotation.XmlNsForm.UNQUALIFIED)
package org.eclipse.kapua.service.device.call.kura.model.deploy;

```

### UnnecessaryFullyQualifiedName
Qualifier `javax.xml.bind.annotation` is unnecessary, and can be replaced with an import
in `service/device/call/kura/src/main/java/org/eclipse/kapua/service/device/call/kura/model/snapshot/package-info.java`
#### Snippet
```java
//

@javax.xml.bind.annotation.XmlSchema(namespace = "http://eurotech.com/esf/2.0", xmlns = {
        @XmlNs(namespaceURI = "http://eurotech.com/esf/2.0", prefix = "esf"),
        @XmlNs(namespaceURI = "http://www.osgi.org/xmlns/metatype/v1.2.0", prefix = "ocd")
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.xml.bind.annotation` is unnecessary, and can be replaced with an import
in `service/device/call/kura/src/main/java/org/eclipse/kapua/service/device/call/kura/model/snapshot/package-info.java`
#### Snippet
```java
        @XmlNs(namespaceURI = "http://eurotech.com/esf/2.0", prefix = "esf"),
        @XmlNs(namespaceURI = "http://www.osgi.org/xmlns/metatype/v1.2.0", prefix = "ocd")
}, elementFormDefault = javax.xml.bind.annotation.XmlNsForm.QUALIFIED, attributeFormDefault = javax.xml.bind.annotation.XmlNsForm.UNQUALIFIED)
package org.eclipse.kapua.service.device.call.kura.model.snapshot;

```

### UnnecessaryFullyQualifiedName
Qualifier `javax.xml.bind.annotation` is unnecessary, and can be replaced with an import
in `service/device/call/kura/src/main/java/org/eclipse/kapua/service/device/call/kura/model/snapshot/package-info.java`
#### Snippet
```java
        @XmlNs(namespaceURI = "http://eurotech.com/esf/2.0", prefix = "esf"),
        @XmlNs(namespaceURI = "http://www.osgi.org/xmlns/metatype/v1.2.0", prefix = "ocd")
}, elementFormDefault = javax.xml.bind.annotation.XmlNsForm.QUALIFIED, attributeFormDefault = javax.xml.bind.annotation.XmlNsForm.UNQUALIFIED)
package org.eclipse.kapua.service.device.call.kura.model.snapshot;

```

### UnnecessaryFullyQualifiedName
Qualifier `javax.xml.bind.annotation` is unnecessary, and can be replaced with an import
in `service/device/call/kura/src/main/java/org/eclipse/kapua/service/device/call/kura/model/configuration/package-info.java`
#### Snippet
```java
//

@javax.xml.bind.annotation.XmlSchema(namespace = "http://eurotech.com/esf/2.0", xmlns = {
        @XmlNs(namespaceURI = "http://eurotech.com/esf/2.0", prefix = "esf"),
        @XmlNs(namespaceURI = "http://www.osgi.org/xmlns/metatype/v1.2.0", prefix = "ocd")
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.xml.bind.annotation` is unnecessary, and can be replaced with an import
in `service/device/call/kura/src/main/java/org/eclipse/kapua/service/device/call/kura/model/configuration/package-info.java`
#### Snippet
```java
        @XmlNs(namespaceURI = "http://eurotech.com/esf/2.0", prefix = "esf"),
        @XmlNs(namespaceURI = "http://www.osgi.org/xmlns/metatype/v1.2.0", prefix = "ocd")
}, elementFormDefault = javax.xml.bind.annotation.XmlNsForm.QUALIFIED, attributeFormDefault = javax.xml.bind.annotation.XmlNsForm.UNQUALIFIED)
package org.eclipse.kapua.service.device.call.kura.model.configuration;

```

### UnnecessaryFullyQualifiedName
Qualifier `javax.xml.bind.annotation` is unnecessary, and can be replaced with an import
in `service/device/call/kura/src/main/java/org/eclipse/kapua/service/device/call/kura/model/configuration/package-info.java`
#### Snippet
```java
        @XmlNs(namespaceURI = "http://eurotech.com/esf/2.0", prefix = "esf"),
        @XmlNs(namespaceURI = "http://www.osgi.org/xmlns/metatype/v1.2.0", prefix = "ocd")
}, elementFormDefault = javax.xml.bind.annotation.XmlNsForm.QUALIFIED, attributeFormDefault = javax.xml.bind.annotation.XmlNsForm.UNQUALIFIED)
package org.eclipse.kapua.service.device.call.kura.model.configuration;

```

### UnnecessaryFullyQualifiedName
Qualifier `javax.xml.bind.annotation` is unnecessary, and can be replaced with an import
in `service/device/call/kura/src/main/java/org/eclipse/kapua/service/device/call/kura/model/configuration/xml/package-info.java`
#### Snippet
```java
//

@javax.xml.bind.annotation.XmlSchema(namespace = "http://eurotech.com/esf/2.0", xmlns = {
        @XmlNs(namespaceURI = "http://eurotech.com/esf/2.0", prefix = "esf"),
        @XmlNs(namespaceURI = "http://www.osgi.org/xmlns/metatype/v1.2.0", prefix = "ocd")
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.xml.bind.annotation` is unnecessary, and can be replaced with an import
in `service/device/call/kura/src/main/java/org/eclipse/kapua/service/device/call/kura/model/configuration/xml/package-info.java`
#### Snippet
```java
        @XmlNs(namespaceURI = "http://eurotech.com/esf/2.0", prefix = "esf"),
        @XmlNs(namespaceURI = "http://www.osgi.org/xmlns/metatype/v1.2.0", prefix = "ocd")
}, elementFormDefault = javax.xml.bind.annotation.XmlNsForm.QUALIFIED, attributeFormDefault = javax.xml.bind.annotation.XmlNsForm.UNQUALIFIED)
package org.eclipse.kapua.service.device.call.kura.model.configuration.xml;

```

### UnnecessaryFullyQualifiedName
Qualifier `javax.xml.bind.annotation` is unnecessary, and can be replaced with an import
in `service/device/call/kura/src/main/java/org/eclipse/kapua/service/device/call/kura/model/configuration/xml/package-info.java`
#### Snippet
```java
        @XmlNs(namespaceURI = "http://eurotech.com/esf/2.0", prefix = "esf"),
        @XmlNs(namespaceURI = "http://www.osgi.org/xmlns/metatype/v1.2.0", prefix = "ocd")
}, elementFormDefault = javax.xml.bind.annotation.XmlNsForm.QUALIFIED, attributeFormDefault = javax.xml.bind.annotation.XmlNsForm.UNQUALIFIED)
package org.eclipse.kapua.service.device.call.kura.model.configuration.xml;

```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.service.device.call.message` is unnecessary and can be removed
in `service/device/call/kura/src/main/java/org/eclipse/kapua/service/device/call/message/kura/KuraMessage.java`
#### Snippet
```java
     * @param timestamp The timestamp.
     * @param payload   The {@link KuraPayload}.
     * @see org.eclipse.kapua.service.device.call.message.DeviceMessage
     * @since 1.0.0
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.model` is unnecessary and can be removed
in `service/scheduler/api/src/main/java/org/eclipse/kapua/service/scheduler/trigger/Trigger.java`
#### Snippet
```java
 * {@link Trigger} {@link KapuaNamedEntity} definition.
 *
 * @see org.eclipse.kapua.model.KapuaNamedEntity
 * @since 1.0.0
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.event` is unnecessary, and can be replaced with an import
in `commons/src/main/java/org/eclipse/kapua/commons/jpa/EntityManagerSession.java`
#### Snippet
```java
    private <T> EventStoreRecord appendKapuaEvent(Object instance, TransactionManager transactionManager) throws KapuaException {
        EventStoreRecord persistedKapuaEvent = null;
        org.eclipse.kapua.event.ServiceEvent serviceEvent = getServiceEventIfPresent(instance);
        if (serviceEvent != null) {
            EntityManager manager = entityManagerFactory.createEntityManager();
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.event` is unnecessary, and can be replaced with an import
in `commons/src/main/java/org/eclipse/kapua/commons/jpa/EntityManagerSession.java`
#### Snippet
```java
    }

    private <T> EventStoreRecord appendKapuaEvent(Object instance, EntityManager em, org.eclipse.kapua.event.ServiceEvent serviceEvent) throws KapuaException {
        EventStoreRecord persistedKapuaEvent = null;
        if (serviceEvent != null) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.event` is unnecessary, and can be replaced with an import
in `commons/src/main/java/org/eclipse/kapua/commons/jpa/EntityManagerSession.java`
#### Snippet
```java
    }

    private org.eclipse.kapua.event.ServiceEvent getServiceEventIfPresent(Object instance) {
        if (!(instance instanceof EventStoreRecord)) {
            return ServiceEventScope.get();
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.event` is unnecessary, and can be replaced with an import
in `commons/src/main/java/org/eclipse/kapua/commons/jpa/EntityManagerSession.java`
#### Snippet
```java
    }

    private boolean isNewEvent(org.eclipse.kapua.event.ServiceEvent event) {
        return (event.getId() == null);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.event` is unnecessary, and can be replaced with an import
in `commons/src/main/java/org/eclipse/kapua/commons/jpa/EntityManagerSession.java`
#### Snippet
```java
    }

    private EventStoreRecord persistServiceEvent(EntityManager em, org.eclipse.kapua.event.ServiceEvent serviceEvent, Object instance) throws KapuaException {
        EventStoreRecord persistedKapuaEvent;
        if (instance instanceof KapuaEntity) {
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.persistence.criteria` is unnecessary and can be removed
in `commons/src/main/java/org/eclipse/kapua/commons/jpa/EntityManager.java`
#### Snippet
```java

    /**
     * Return the {@link javax.persistence.criteria.CriteriaBuilder}
     *
     * @return
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.commons.jpa` is unnecessary and can be removed
in `commons/src/main/java/org/eclipse/kapua/commons/jpa/EntityManager.java`
#### Snippet
```java
     * Opens a Jpa Transaction.
     *
     * @throws KapuaException if {@link org.eclipse.kapua.commons.jpa.EntityManager} is {@code null}
     */
    public void beginTransaction()
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.model.query.predicate` is unnecessary and can be removed
in `commons/src/main/java/org/eclipse/kapua/commons/model/query/predicate/AttributePredicateImpl.java`
#### Snippet
```java
     * Constructor.
     * <p>
     * Defaults ot {@link org.eclipse.kapua.model.query.predicate.AttributePredicate.Operator#EQUAL}
     *
     * @param attributeName  The name of {@link org.eclipse.kapua.model.KapuaEntityAttributes} to set into the {@link AttributePredicate}.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.model.query.predicate` is unnecessary and can be removed
in `commons/src/main/java/org/eclipse/kapua/commons/model/query/predicate/AttributePredicateImpl.java`
#### Snippet
```java
     * @param attributeName  The name of {@link org.eclipse.kapua.model.KapuaEntityAttributes} to set into the {@link AttributePredicate}.
     * @param attributeValue The value of {@link org.eclipse.kapua.model.KapuaEntityAttributes} to set into the {@link AttributePredicate}.
     * @param operator       The {@link org.eclipse.kapua.model.query.predicate.AttributePredicate.Operator} to set into the {@link AttributePredicate}.
     * @since 1.0.0
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.model` is unnecessary and can be removed
in `commons/src/main/java/org/eclipse/kapua/commons/service/event/store/api/EventStoreFactory.java`
#### Snippet
```java
 * {@link EventStoreFactory} definition.
 *
 * @see org.eclipse.kapua.model.KapuaEntityFactory
 * @since 1.0.0
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.event` is unnecessary, and can be replaced with an import
in `commons/src/main/java/org/eclipse/kapua/commons/service/event/store/api/ServiceEventUtil.java`
#### Snippet
```java
     *             if the service event bus id is not null
     */
    public static EventStoreRecord fromServiceEventBus(org.eclipse.kapua.event.ServiceEvent serviceEventBus) throws KapuaIllegalArgumentException {
        if (serviceEventBus.getId() != null) {
            throw new KapuaIllegalArgumentException("id", serviceEventBus.getId());
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.event` is unnecessary, and can be replaced with an import
in `commons/src/main/java/org/eclipse/kapua/commons/service/event/store/api/ServiceEventUtil.java`
#### Snippet
```java
    }

    private static EventStoreRecord mergeToEntityInternal(EventStoreRecord serviceEventEntity, org.eclipse.kapua.event.ServiceEvent serviceEventBus) {
        serviceEventEntity.setContextId(serviceEventBus.getContextId());
        serviceEventEntity.setTimestamp(serviceEventBus.getTimestamp());
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.event` is unnecessary, and can be replaced with an import
in `commons/src/main/java/org/eclipse/kapua/commons/service/event/store/api/ServiceEventUtil.java`
#### Snippet
```java
     * @throws KapuaIllegalArgumentException
     */
    public static org.eclipse.kapua.event.ServiceEvent toServiceEventBus(EventStoreRecord serviceEventEntity) throws KapuaIllegalArgumentException {
        org.eclipse.kapua.event.ServiceEvent newEvent = new org.eclipse.kapua.event.ServiceEvent();
        if (serviceEventEntity.getId() == null) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.event` is unnecessary, and can be replaced with an import
in `commons/src/main/java/org/eclipse/kapua/commons/service/event/store/api/ServiceEventUtil.java`
#### Snippet
```java
     */
    public static org.eclipse.kapua.event.ServiceEvent toServiceEventBus(EventStoreRecord serviceEventEntity) throws KapuaIllegalArgumentException {
        org.eclipse.kapua.event.ServiceEvent newEvent = new org.eclipse.kapua.event.ServiceEvent();
        if (serviceEventEntity.getId() == null) {
            throw new KapuaIllegalArgumentException("id", null);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.event` is unnecessary, and can be replaced with an import
in `commons/src/main/java/org/eclipse/kapua/commons/service/event/store/api/ServiceEventUtil.java`
#### Snippet
```java
     */
    public static org.eclipse.kapua.event.ServiceEvent toServiceEventBus(EventStoreRecord serviceEventEntity) throws KapuaIllegalArgumentException {
        org.eclipse.kapua.event.ServiceEvent newEvent = new org.eclipse.kapua.event.ServiceEvent();
        if (serviceEventEntity.getId() == null) {
            throw new KapuaIllegalArgumentException("id", null);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.event` is unnecessary, and can be replaced with an import
in `commons/src/main/java/org/eclipse/kapua/commons/service/event/store/api/ServiceEventUtil.java`
#### Snippet
```java
     *             if the service event bus id is null or differs to the service event entity
     */
    public static EventStoreRecord mergeToEntity(EventStoreRecord serviceEventEntity, org.eclipse.kapua.event.ServiceEvent serviceEventBus) throws KapuaIllegalArgumentException {
        if (serviceEventEntity.getId() == null) {
            throw new KapuaIllegalArgumentException("id", null);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.event` is unnecessary and can be removed
in `commons/src/main/java/org/eclipse/kapua/commons/service/internal/AbstractKapuaService.java`
#### Snippet
```java

    /**
     * Registers a {@link ServiceEventBusListener} into the {@link org.eclipse.kapua.event.ServiceEventBus}.
     *
     * @param listener The {@link ServiceEventBusListener} to register.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `commons/src/main/java/org/eclipse/kapua/commons/liquibase/KapuaLiquibaseClient.java`
#### Snippet
```java
     * @param username The username to connect to to the database.
     * @param password The password to connect to to the database.
     * @param schema   The {@link java.util.Optional} schema name.
     * @since 1.0.0
     * @deprecated Since 1.2.0. Removed usage of {@link Optional} as parameter.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.model` is unnecessary and can be removed
in `service/device/management/registry/api/src/main/java/org/eclipse/kapua/service/device/management/registry/operation/DeviceManagementOperationFactory.java`
#### Snippet
```java
 * {@link DeviceManagementOperationFactory} definition.
 *
 * @see org.eclipse.kapua.model.KapuaEntityFactory
 * @since 1.0.0
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.model` is unnecessary and can be removed
in `service/device/management/registry/api/src/main/java/org/eclipse/kapua/service/device/management/registry/operation/notification/ManagementOperationNotificationFactory.java`
#### Snippet
```java
 * {@link ManagementOperationNotificationFactory} definition.
 *
 * @see org.eclipse.kapua.model.KapuaEntityFactory
 * @since 1.0.0
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.activemq` is unnecessary and can be removed
in `broker/client/src/main/java/org/eclipse/kapua/broker/client/pool/JmsProducerWrapper.java`
#### Snippet
```java
 * Jms producer wrapper.<BR>
 * This class wrap a single session per connection and manage the close operation of connection on session close.<BR>
 * The connection is taken from a connection pool ({@link org.apache.activemq.ActiveMQConnectionFactory})
 *
 * @since 1.0
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.service.device.call.message.kura.lifecycle` is unnecessary, and can be replaced with an import
in `broker/client/src/main/java/org/eclipse/kapua/broker/client/protocol/DefaultProtocolDescriptionProvider.java`
#### Snippet
```java
    private static ProtocolDescriptor createDefaultDescriptor() {
        Map<MessageType, Class<? extends DeviceMessage<?, ?>>> deviceClass = new EnumMap<>(MessageType.class);
        deviceClass.put(MessageType.APP, org.eclipse.kapua.service.device.call.message.kura.lifecycle.KuraAppsMessage.class);
        deviceClass.put(MessageType.BIRTH, org.eclipse.kapua.service.device.call.message.kura.lifecycle.KuraBirthMessage.class);
        deviceClass.put(MessageType.DISCONNECT, org.eclipse.kapua.service.device.call.message.kura.lifecycle.KuraDisconnectMessage.class);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.service.device.call.message.kura.lifecycle` is unnecessary, and can be replaced with an import
in `broker/client/src/main/java/org/eclipse/kapua/broker/client/protocol/DefaultProtocolDescriptionProvider.java`
#### Snippet
```java
        Map<MessageType, Class<? extends DeviceMessage<?, ?>>> deviceClass = new EnumMap<>(MessageType.class);
        deviceClass.put(MessageType.APP, org.eclipse.kapua.service.device.call.message.kura.lifecycle.KuraAppsMessage.class);
        deviceClass.put(MessageType.BIRTH, org.eclipse.kapua.service.device.call.message.kura.lifecycle.KuraBirthMessage.class);
        deviceClass.put(MessageType.DISCONNECT, org.eclipse.kapua.service.device.call.message.kura.lifecycle.KuraDisconnectMessage.class);
        deviceClass.put(MessageType.MISSING, org.eclipse.kapua.service.device.call.message.kura.lifecycle.KuraMissingMessage.class);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.service.device.call.message.kura.lifecycle` is unnecessary, and can be replaced with an import
in `broker/client/src/main/java/org/eclipse/kapua/broker/client/protocol/DefaultProtocolDescriptionProvider.java`
#### Snippet
```java
        deviceClass.put(MessageType.APP, org.eclipse.kapua.service.device.call.message.kura.lifecycle.KuraAppsMessage.class);
        deviceClass.put(MessageType.BIRTH, org.eclipse.kapua.service.device.call.message.kura.lifecycle.KuraBirthMessage.class);
        deviceClass.put(MessageType.DISCONNECT, org.eclipse.kapua.service.device.call.message.kura.lifecycle.KuraDisconnectMessage.class);
        deviceClass.put(MessageType.MISSING, org.eclipse.kapua.service.device.call.message.kura.lifecycle.KuraMissingMessage.class);
        deviceClass.put(MessageType.NOTIFY, KuraNotifyMessage.class);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.service.device.call.message.kura.lifecycle` is unnecessary, and can be replaced with an import
in `broker/client/src/main/java/org/eclipse/kapua/broker/client/protocol/DefaultProtocolDescriptionProvider.java`
#### Snippet
```java
        deviceClass.put(MessageType.BIRTH, org.eclipse.kapua.service.device.call.message.kura.lifecycle.KuraBirthMessage.class);
        deviceClass.put(MessageType.DISCONNECT, org.eclipse.kapua.service.device.call.message.kura.lifecycle.KuraDisconnectMessage.class);
        deviceClass.put(MessageType.MISSING, org.eclipse.kapua.service.device.call.message.kura.lifecycle.KuraMissingMessage.class);
        deviceClass.put(MessageType.NOTIFY, KuraNotifyMessage.class);
        deviceClass.put(MessageType.DATA, org.eclipse.kapua.service.device.call.message.kura.data.KuraDataMessage.class);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.service.device.call.message.kura.data` is unnecessary, and can be replaced with an import
in `broker/client/src/main/java/org/eclipse/kapua/broker/client/protocol/DefaultProtocolDescriptionProvider.java`
#### Snippet
```java
        deviceClass.put(MessageType.MISSING, org.eclipse.kapua.service.device.call.message.kura.lifecycle.KuraMissingMessage.class);
        deviceClass.put(MessageType.NOTIFY, KuraNotifyMessage.class);
        deviceClass.put(MessageType.DATA, org.eclipse.kapua.service.device.call.message.kura.data.KuraDataMessage.class);

        Map<MessageType, Class<? extends KapuaMessage<?, ?>>> kapuaClass = new EnumMap<>(MessageType.class);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.message.device.lifecycle` is unnecessary, and can be replaced with an import
in `broker/client/src/main/java/org/eclipse/kapua/broker/client/protocol/DefaultProtocolDescriptionProvider.java`
#### Snippet
```java

        Map<MessageType, Class<? extends KapuaMessage<?, ?>>> kapuaClass = new EnumMap<>(MessageType.class);
        kapuaClass.put(MessageType.APP, org.eclipse.kapua.message.device.lifecycle.KapuaAppsMessage.class);
        kapuaClass.put(MessageType.BIRTH, org.eclipse.kapua.message.device.lifecycle.KapuaBirthMessage.class);
        kapuaClass.put(MessageType.DISCONNECT, org.eclipse.kapua.message.device.lifecycle.KapuaDisconnectMessage.class);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.message.device.lifecycle` is unnecessary, and can be replaced with an import
in `broker/client/src/main/java/org/eclipse/kapua/broker/client/protocol/DefaultProtocolDescriptionProvider.java`
#### Snippet
```java
        Map<MessageType, Class<? extends KapuaMessage<?, ?>>> kapuaClass = new EnumMap<>(MessageType.class);
        kapuaClass.put(MessageType.APP, org.eclipse.kapua.message.device.lifecycle.KapuaAppsMessage.class);
        kapuaClass.put(MessageType.BIRTH, org.eclipse.kapua.message.device.lifecycle.KapuaBirthMessage.class);
        kapuaClass.put(MessageType.DISCONNECT, org.eclipse.kapua.message.device.lifecycle.KapuaDisconnectMessage.class);
        kapuaClass.put(MessageType.MISSING, org.eclipse.kapua.message.device.lifecycle.KapuaMissingMessage.class);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.message.device.lifecycle` is unnecessary, and can be replaced with an import
in `broker/client/src/main/java/org/eclipse/kapua/broker/client/protocol/DefaultProtocolDescriptionProvider.java`
#### Snippet
```java
        kapuaClass.put(MessageType.APP, org.eclipse.kapua.message.device.lifecycle.KapuaAppsMessage.class);
        kapuaClass.put(MessageType.BIRTH, org.eclipse.kapua.message.device.lifecycle.KapuaBirthMessage.class);
        kapuaClass.put(MessageType.DISCONNECT, org.eclipse.kapua.message.device.lifecycle.KapuaDisconnectMessage.class);
        kapuaClass.put(MessageType.MISSING, org.eclipse.kapua.message.device.lifecycle.KapuaMissingMessage.class);
        kapuaClass.put(MessageType.NOTIFY, KapuaNotifyMessage.class);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.message.device.lifecycle` is unnecessary, and can be replaced with an import
in `broker/client/src/main/java/org/eclipse/kapua/broker/client/protocol/DefaultProtocolDescriptionProvider.java`
#### Snippet
```java
        kapuaClass.put(MessageType.BIRTH, org.eclipse.kapua.message.device.lifecycle.KapuaBirthMessage.class);
        kapuaClass.put(MessageType.DISCONNECT, org.eclipse.kapua.message.device.lifecycle.KapuaDisconnectMessage.class);
        kapuaClass.put(MessageType.MISSING, org.eclipse.kapua.message.device.lifecycle.KapuaMissingMessage.class);
        kapuaClass.put(MessageType.NOTIFY, KapuaNotifyMessage.class);
        kapuaClass.put(MessageType.DATA, org.eclipse.kapua.message.device.data.KapuaDataMessage.class);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.message.device.data` is unnecessary, and can be replaced with an import
in `broker/client/src/main/java/org/eclipse/kapua/broker/client/protocol/DefaultProtocolDescriptionProvider.java`
#### Snippet
```java
        kapuaClass.put(MessageType.MISSING, org.eclipse.kapua.message.device.lifecycle.KapuaMissingMessage.class);
        kapuaClass.put(MessageType.NOTIFY, KapuaNotifyMessage.class);
        kapuaClass.put(MessageType.DATA, org.eclipse.kapua.message.device.data.KapuaDataMessage.class);

        return new ProtocolDescriptor(DEFAULT_TRANSPORT_PROTOCOL, deviceClass, kapuaClass);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.service.job` is unnecessary and can be removed
in `job-engine/jbatch/src/main/java/org/eclipse/kapua/job/engine/jbatch/driver/JbatchDriver.java`
#### Snippet
```java
     * @param scopeId         The scopeId of the {@link Job}
     * @param jobId           The id of the {@link Job}
     * @param jobStartOptions The {@link JobStartOptions} for this start {@link org.eclipse.kapua.service.job.Job} request.
     * @throws CannotBuildJobDefDriverException     if the creation of the {@link JSLJob} fails
     * @throws CannotCreateTmpDirDriverException    if the temp directory for storing the XML job definition file cannot be created
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.service.job` is unnecessary and can be removed
in `job-engine/jbatch/src/main/java/org/eclipse/kapua/job/engine/jbatch/listener/KapuaJobListener.java`
#### Snippet
```java

    /**
     * Before starting the actual {@link org.eclipse.kapua.service.job.Job} processing, create the {@link JobExecution} to track progress and
     * check if there are other {@link JobExecution}s running with the same {@link JobExecution#getTargetIds()}.
     * <p>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.service.job.targets` is unnecessary and can be removed
in `job-engine/jbatch/src/main/java/org/eclipse/kapua/job/engine/jbatch/listener/KapuaJobListener.java`
#### Snippet
```java
     * If 0, no {@link JobExecution} is currently running, returns {@code null}.
     * <p>
     * If greater than 0, it checks if the running {@link JobExecution} has a subset of {@link org.eclipse.kapua.service.job.targets.JobTarget}s compatible with the current {@link JobTargetSublist}.
     * If the current {@link JobTargetSublist} doesn't match {@link org.eclipse.kapua.service.job.targets.JobTarget}s of any other running JobExecution, returns the current running {@link JobExecution}.
     * <p>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.service.job.targets` is unnecessary and can be removed
in `job-engine/jbatch/src/main/java/org/eclipse/kapua/job/engine/jbatch/listener/KapuaJobListener.java`
#### Snippet
```java
     * <p>
     * If greater than 0, it checks if the running {@link JobExecution} has a subset of {@link org.eclipse.kapua.service.job.targets.JobTarget}s compatible with the current {@link JobTargetSublist}.
     * If the current {@link JobTargetSublist} doesn't match {@link org.eclipse.kapua.service.job.targets.JobTarget}s of any other running JobExecution, returns the current running {@link JobExecution}.
     * <p>
     * In other all other cases returns {@code null}.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.service.job` is unnecessary and can be removed
in `job-engine/jbatch/src/main/java/org/eclipse/kapua/job/engine/jbatch/listener/KapuaJobListener.java`
#### Snippet
```java
     * Creates the {@link JobExecution} from the data in the {@link JobContextWrapper}.
     * <p>
     * If the {@link org.eclipse.kapua.service.job.Job} has started without a defined set of {@link JobStartOptions#getTargetIdSublist()}
     * all {@link org.eclipse.kapua.service.job.targets.JobTarget}s will be added to the {@link JobExecution#getTargetIds()}.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.service.job.targets` is unnecessary and can be removed
in `job-engine/jbatch/src/main/java/org/eclipse/kapua/job/engine/jbatch/listener/KapuaJobListener.java`
#### Snippet
```java
     * <p>
     * If the {@link org.eclipse.kapua.service.job.Job} has started without a defined set of {@link JobStartOptions#getTargetIdSublist()}
     * all {@link org.eclipse.kapua.service.job.targets.JobTarget}s will be added to the {@link JobExecution#getTargetIds()}.
     *
     * @param scopeId           The {@link Job#getScopeId()}
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.service.job.execution` is unnecessary and can be removed
in `job-engine/commons/src/main/java/org/eclipse/kapua/job/engine/commons/wrappers/JobContextWrapper.java`
#### Snippet
```java

    /**
     * Gets the {@link JobTargetSublist} of the {@link org.eclipse.kapua.service.job.execution.JobExecution}.
     *
     * @return The current {@link JobTargetSublist} of the {@link org.eclipse.kapua.service.job.execution.JobExecution}.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.service.job.execution` is unnecessary and can be removed
in `job-engine/commons/src/main/java/org/eclipse/kapua/job/engine/commons/wrappers/JobContextWrapper.java`
#### Snippet
```java
     * Gets the {@link JobTargetSublist} of the {@link org.eclipse.kapua.service.job.execution.JobExecution}.
     *
     * @return The current {@link JobTargetSublist} of the {@link org.eclipse.kapua.service.job.execution.JobExecution}.
     * @since 1.0.0
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.service.job.execution` is unnecessary and can be removed
in `job-engine/commons/src/main/java/org/eclipse/kapua/job/engine/commons/wrappers/JobContextWrapper.java`
#### Snippet
```java

    /**
     * Gets the scope {@link KapuaId} of the {@link org.eclipse.kapua.service.job.execution.JobExecution}.
     *
     * @return The current scope {@link KapuaId} of the {@link org.eclipse.kapua.service.job.execution.JobExecution}.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.service.job.execution` is unnecessary and can be removed
in `job-engine/commons/src/main/java/org/eclipse/kapua/job/engine/commons/wrappers/JobContextWrapper.java`
#### Snippet
```java
     * Gets the scope {@link KapuaId} of the {@link org.eclipse.kapua.service.job.execution.JobExecution}.
     *
     * @return The current scope {@link KapuaId} of the {@link org.eclipse.kapua.service.job.execution.JobExecution}.
     * @since 1.0.0
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.service.job.execution` is unnecessary and can be removed
in `job-engine/commons/src/main/java/org/eclipse/kapua/job/engine/commons/wrappers/JobContextWrapper.java`
#### Snippet
```java

    /**
     * Gets the start step index of the {@link org.eclipse.kapua.service.job.execution.JobExecution}.
     *
     * @return The start step index of the {@link org.eclipse.kapua.service.job.execution.JobExecution}.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.service.job.execution` is unnecessary and can be removed
in `job-engine/commons/src/main/java/org/eclipse/kapua/job/engine/commons/wrappers/JobContextWrapper.java`
#### Snippet
```java
     * Gets the start step index of the {@link org.eclipse.kapua.service.job.execution.JobExecution}.
     *
     * @return The start step index of the {@link org.eclipse.kapua.service.job.execution.JobExecution}.
     * @since 1.0.0
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.service.job.execution` is unnecessary and can be removed
in `job-engine/commons/src/main/java/org/eclipse/kapua/job/engine/commons/wrappers/JobContextWrapper.java`
#### Snippet
```java

    /**
     * Gets the {@link org.eclipse.kapua.service.job.Job} {@link KapuaId} of the {@link org.eclipse.kapua.service.job.execution.JobExecution}.
     *
     * @return The current {@link org.eclipse.kapua.service.job.Job} {@link KapuaId} of the {@link org.eclipse.kapua.service.job.execution.JobExecution}.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.service.job.execution` is unnecessary and can be removed
in `job-engine/commons/src/main/java/org/eclipse/kapua/job/engine/commons/wrappers/JobContextWrapper.java`
#### Snippet
```java
     * Gets the {@link org.eclipse.kapua.service.job.Job} {@link KapuaId} of the {@link org.eclipse.kapua.service.job.execution.JobExecution}.
     *
     * @return The current {@link org.eclipse.kapua.service.job.Job} {@link KapuaId} of the {@link org.eclipse.kapua.service.job.execution.JobExecution}.
     * @since 1.0.0
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.model.query.predicate` is unnecessary and can be removed
in `job-engine/commons/src/main/java/org/eclipse/kapua/job/engine/commons/operation/DefaultTargetReader.java`
#### Snippet
```java
     * <p>
     * If the {@link JobContextWrapper#getTargetSublist()} has one or more {@link org.eclipse.kapua.model.id.KapuaId}s they will be added to the
     * {@link org.eclipse.kapua.model.query.predicate.AndPredicate} to select only given {@link JobTarget}.
     *
     * @param jobContextWrapper The {@link JobContextWrapper} from which extract data
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.model.query.predicate` is unnecessary and can be removed
in `job-engine/commons/src/main/java/org/eclipse/kapua/job/engine/commons/operation/DefaultTargetReader.java`
#### Snippet
```java
     * @param jobContextWrapper The {@link JobContextWrapper} from which extract data
     * @param query             The {@link KapuaQuery} to perform
     * @param andPredicate      The {@link org.eclipse.kapua.model.query.predicate.AndPredicate} where to apply {@link org.eclipse.kapua.model.query.predicate.QueryPredicate}
     * @since 1.0.0
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.model.query.predicate` is unnecessary and can be removed
in `job-engine/commons/src/main/java/org/eclipse/kapua/job/engine/commons/operation/DefaultTargetReader.java`
#### Snippet
```java
     * @param stepContextWrapper The {@link StepContextWrapper} from which extract data
     * @param query              The {@link KapuaQuery} to perform
     * @param andPredicate       The {@link org.eclipse.kapua.model.query.predicate.AndPredicate} where to apply {@link org.eclipse.kapua.model.query.predicate.QueryPredicate}
     * @since 1.0.0
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.service.job.execution` is unnecessary and can be removed
in `job-engine/commons/src/main/java/org/eclipse/kapua/job/engine/commons/logger/JobLogger.java`
#### Snippet
```java
 * This {@link JobLogger} logs to the standard {@link Logger} of the current Java class (after setting it using {@link #setClassLog(Logger)})
 * and keeps a copy of the log inside. Then, by invoking {@link #flush()} method it is possible to retrieve the copy of the log and store it
 * into the {@link org.eclipse.kapua.service.job.execution.JobExecution#setLog(String)}.
 *
 * @since 1.1.0
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `extras/encryption-migrator/src/main/java/org/eclipse/kapua/extras/migrator/encryption/authentication/MfaOptionMigrator.java`
#### Snippet
```java
                decryptCipher.init(Cipher.DECRYPT_MODE, key);

                byte[] decryptedValueBase64 = java.util.Base64.getUrlDecoder().decode(mfaSecretKey);
                byte[] decryptedValueBytes = decryptCipher.doFinal(decryptedValueBase64);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.model` is unnecessary and can be removed
in `service/device/management/keystore/api/src/main/java/org/eclipse/kapua/service/device/management/keystore/DeviceKeystoreManagementFactory.java`
#### Snippet
```java
 * {@link DeviceKeystore} {@link KapuaObjectFactory} definition.
 *
 * @see org.eclipse.kapua.model.KapuaObjectFactory
 * @since 1.5.0
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.kapua.service.device.registry` is unnecessary and can be removed
in `service/device/management/packages/api/src/main/java/org/eclipse/kapua/service/device/management/packages/DevicePackageManagementService.java`
#### Snippet
```java
 * {@link DevicePackageManagementService} definition.
 * <p>
 * The {@link DevicePackageManagementService} is used to interact with the DEPLOY-V2 {@link org.eclipse.kapua.service.device.registry.Device} application.
 *
 * @since 1.0.0
```

## RuleId[id=ThrowablePrintStackTrace]
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `service/user/test-steps/src/main/java/org/eclipse/kapua/service/user/steps/UserServiceSteps.java`
#### Snippet
```java
            });
        } catch (KapuaException e) {
            e.printStackTrace();
        }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `service/user/test-steps/src/main/java/org/eclipse/kapua/service/user/steps/UserServiceSteps.java`
#### Snippet
```java
            });
        } catch (KapuaException e) {
            e.printStackTrace();
        }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `service/user/test-steps/src/main/java/org/eclipse/kapua/service/user/steps/UserServiceSteps.java`
#### Snippet
```java
            mfaOptionService.create(mfaCreator);
        } catch (KapuaException e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `service/user/test-steps/src/main/java/org/eclipse/kapua/service/user/steps/UserServiceSteps.java`
#### Snippet
```java
            mfaOption = mfaOptionService.findByUserId(scopeId, userId);
        } catch (KapuaException e) {
            e.printStackTrace();
        }
        Assert.assertNotNull(mfaOption);
```

## RuleId[id=ReplaceNullCheck]
### ReplaceNullCheck
'if' statement can be replaced with call to 'Objects.requireNonNullElseGet()'
in `client/gateway/provider/paho/src/main/java/org/eclipse/kapua/client/gateway/mqtt/paho/PahoChannel.java`
#### Snippet
```java

        public Builder persistentProvider(final Supplier<MqttClientPersistence> provider) {
            if (provider != null) {
                persistenceProvider = provider;
            } else {
```

## RuleId[id=Anonymous2MethodRef]
### Anonymous2MethodRef
Anonymous new ErrorHandler() can be replaced with method reference
in `client/gateway/api/src/main/java/org/eclipse/kapua/client/gateway/util/Errors.java`
#### Snippet
```java

    public static ErrorHandler<RuntimeException> handle(final BiConsumer<Throwable, Optional<Payload>> handler) {
        return new ErrorHandler<RuntimeException>() {

            @Override
```

## RuleId[id=Convert2Lambda]
### Convert2Lambda
Anonymous new ErrorHandler() can be replaced with lambda
in `client/gateway/api/src/main/java/org/eclipse/kapua/client/gateway/util/Errors.java`
#### Snippet
```java

    public static ErrorHandler<RuntimeException> handle(final BiConsumer<Throwable, Optional<Payload>> handler) {
        return new ErrorHandler<RuntimeException>() {

            @Override
```

### Convert2Lambda
Anonymous new Provider() can be replaced with lambda
in `client/gateway/profile/kura/src/main/java/org/eclipse/kapua/client/gateway/kura/KuraBirthCertificateModule.java`
#### Snippet
```java
        public void provideData(Map<String, String> values);

        public static final Provider JVM = new Provider() {

            @Override
```

### Convert2Lambda
Anonymous new Provider() can be replaced with lambda
in `client/gateway/profile/kura/src/main/java/org/eclipse/kapua/client/gateway/kura/KuraBirthCertificateModule.java`
#### Snippet
```java
        };

        public static final Provider RUNTIME = new Provider() {

            @Override
```

### Convert2Lambda
Anonymous new Generator() can be replaced with lambda
in `simulator-kura/src/main/java/org/eclipse/kapua/kura/simulator/generator/Generator.java`
#### Snippet
```java
        Objects.requireNonNull(metrics);

        return new Generator() {

            @Override
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `service/endpoint/test-steps/src/main/java/org/eclipse/kapua/service/endpoint/steps/EndpointServiceSteps.java`
#### Snippet
```java
    @Then("I have (\\d+) CORS filters?$")
    public void iHaveCORSFilter(int expectedNum) throws KapuaException {
        int corsFilter = KapuaSecurityUtils.doPrivileged(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `service/user/test-steps/src/main/java/org/eclipse/kapua/service/user/steps/UserServiceSteps.java`
#### Snippet
```java
        KapuaId scopeIdTmp = null;
        try {
            userIdTmp = KapuaSecurityUtils.doPrivileged(new Callable<KapuaId>() {
                @Override
                public KapuaId call() throws Exception {
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `service/user/test-steps/src/main/java/org/eclipse/kapua/service/user/steps/UserServiceSteps.java`
#### Snippet
```java
                }
            });
            scopeIdTmp = KapuaSecurityUtils.doPrivileged(new Callable<KapuaId>() {
                @Override
                public KapuaId call() throws Exception {
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `service/user/test-steps/src/main/java/org/eclipse/kapua/service/user/steps/UserServiceSteps.java`
#### Snippet
```java
        final KapuaId scopeId = scopeIdTmp;
        try {
            credential = KapuaSecurityUtils.doPrivileged(new Callable<Credential>() {
                @Override
                public Credential call() throws Exception {
```

## RuleId[id=UnnecessaryContinue]
### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `locator/guice/src/main/java/org/eclipse/kapua/locator/guice/KapuaModule.java`
#### Snippet
```java
                        serviceModulesBindings.addBinding().to(resolver.getImplementationClass());
                    }
                    continue;
                }
            }
```

## RuleId[id=ThrowableNotThrown]
### ThrowableNotThrown
Result of `internalError()` not thrown
in `commons/src/main/java/org/eclipse/kapua/commons/event/ServiceInspector.java`
#### Snippet
```java
            }
            if (!ArrayUtils.isEmpty(listenAnnotations) && !ArrayUtils.isEmpty(raiseAnnotations)) {
                KapuaRuntimeException.internalError(String.format("A method cannot be annotated with both %s and %s", ListenServiceEvent.class, RaiseServiceEvent.class));
            }
            if (!ArrayUtils.isEmpty(listenAnnotations)) {
```

### ThrowableNotThrown
Result of `internalError()` not thrown
in `commons/src/main/java/org/eclipse/kapua/commons/event/ServiceInspector.java`
#### Snippet
```java
                    enhancedMethod = aService.getClass().getMethod(method.getName(), method.getParameterTypes());
                    if (!enhancedMethod.getReturnType().equals(Void.class)) {
                        KapuaRuntimeException.internalError("Invalid method signature: return type, expected Void");
                    }
                    int paramsSize = enhancedMethod.getParameterTypes().length;
```

### ThrowableNotThrown
Result of `internalError()` not thrown
in `commons/src/main/java/org/eclipse/kapua/commons/event/ServiceInspector.java`
#### Snippet
```java
                    int paramsSize = enhancedMethod.getParameterTypes().length;
                    if (paramsSize != 1) {
                        KapuaRuntimeException.internalError(String.format("Invalid method signature: number of parameters %d, expected 1", paramsSize));
                    }
                    Class<?> paramClazz = enhancedMethod.getParameterTypes()[0];
```

### ThrowableNotThrown
Result of `internalError()` not thrown
in `commons/src/main/java/org/eclipse/kapua/commons/event/ServiceInspector.java`
#### Snippet
```java
                    Class<?> paramClazz = enhancedMethod.getParameterTypes()[0];
                    if (!enhancedMethod.getParameterTypes()[0].equals(ServiceEvent.class)) {
                        KapuaRuntimeException.internalError(String.format("Invalid method signature: type of parameters %s, expected ServiceEvent", paramClazz));
                    }
                } catch (NoSuchMethodException | SecurityException e1) {
```

### ThrowableNotThrown
Result of `internalError()` not thrown
in `commons/src/main/java/org/eclipse/kapua/commons/event/ServiceInspector.java`
#### Snippet
```java
                    }
                } catch (NoSuchMethodException | SecurityException e1) {
                    KapuaRuntimeException.internalError(e1, String.format("Unable to get the annotated method: annotation %s", ListenServiceEvent.class));
                }

```

## RuleId[id=EqualsWhichDoesntCheckParameterClass]
### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `rest-api/core/src/main/java/org/eclipse/kapua/app/api/core/model/EntityId.java`
#### Snippet
```java

    @Override
    public boolean equals(Object obj) {
        return KapuaId.areEquals(this, obj);
    }
```

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `rest-api/core/src/main/java/org/eclipse/kapua/app/api/core/model/ScopeId.java`
#### Snippet
```java

    @Override
    public boolean equals(Object obj) {
        return KapuaId.areEquals(this, obj);
    }
```

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `service/api/src/main/java/org/eclipse/kapua/model/id/KapuaIdImpl.java`
#### Snippet
```java

    @Override
    public boolean equals(Object obj) {
        return KapuaId.areEquals(this, obj);
    }
```

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `commons/src/main/java/org/eclipse/kapua/commons/model/id/KapuaEid.java`
#### Snippet
```java

    @Override
    public boolean equals(Object obj) {
        return KapuaId.areEquals(this, obj);
    }
```

