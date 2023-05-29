# leshan 
 
# Bad smells
I found 826 bad smells with 219 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryModifier | 130 | true |
| TrivialIf | 108 | false |
| JavadocLinkAsPlainText | 81 | false |
| FieldMayBeFinal | 60 | false |
| DuplicatedCode | 59 | false |
| UnnecessarySemicolon | 35 | false |
| UnnecessaryReturn | 28 | true |
| AutoCloseableResource | 27 | false |
| ToArrayCallWithZeroLengthArrayArgument | 23 | true |
| UnusedAssignment | 21 | false |
| StringBufferReplaceableByString | 17 | false |
| ConstantValue | 17 | false |
| DataFlowIssue | 16 | false |
| UnnecessaryToStringCall | 13 | true |
| LongLiteralsEndingWithLowercaseL | 12 | false |
| IgnoreResultOfCall | 12 | false |
| RedundantCast | 12 | false |
| UnnecessaryLocalVariable | 12 | true |
| ArraysAsListWithZeroOrOneArgument | 10 | false |
| WrapperTypeMayBePrimitive | 9 | false |
| FieldCanBeLocal | 9 | false |
| JavadocReference | 9 | false |
| PlaceholderCountMatchesArgumentCount | 9 | false |
| PointlessBooleanExpression | 9 | true |
| RedundantStringFormatCall | 7 | false |
| CatchMayIgnoreException | 6 | false |
| IfStatementWithIdenticalBranches | 5 | false |
| IOStreamConstructor | 5 | false |
| CStyleArrayDeclaration | 4 | false |
| DuplicateBranchesInSwitch | 4 | false |
| DefaultAnnotationParam | 4 | false |
| UnnecessaryCallToStringValueOf | 4 | false |
| CollectionAddAllCanBeReplacedWithConstructor | 4 | false |
| JavadocDeclaration | 4 | false |
| RegExpRedundantEscape | 3 | false |
| NumberEquality | 3 | false |
| InnerClassMayBeStatic | 3 | true |
| CommentedOutCode | 2 | false |
| DuplicateExpressions | 2 | false |
| StringOperationCanBeSimplified | 2 | false |
| SuspiciousMethodCalls | 2 | false |
| ConditionCoveredByFurtherCondition | 2 | false |
| SynchronizationOnLocalVariableOrMethodParameter | 2 | false |
| UnpredictableBigDecimalConstructorCall | 2 | false |
| BusyWait | 2 | false |
| ThrowableNotThrown | 2 | false |
| RedundantArrayCreation | 1 | true |
| SimplifiableConditionalExpression | 1 | false |
| RedundantMethodOverride | 1 | false |
| DuplicateThrows | 1 | false |
| PointlessNullCheck | 1 | false |
| RedundantOperationOnEmptyContainer | 1 | false |
| ManualArrayToCollectionCopy | 1 | false |
| InstantiatingObjectToGetClassObject | 1 | false |
| SwitchStatementWithTooFewBranches | 1 | false |
| DanglingJavadoc | 1 | false |
| ImplicitArrayToString | 1 | false |
| SuspiciousToArrayCall | 1 | false |
| UseBulkOperation | 1 | false |
| BigDecimalMethodWithoutRoundingCalled | 1 | false |
## RuleId[id=ToArrayCallWithZeroLengthArrayArgument]
### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new LwM2mLink\[links.size()\]'
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/util/LinkFormatHelper.java`
#### Snippet
```java
        }

        return links.toArray(new LwM2mLink[links.size()]);
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new LwM2mLink\[links.size()\]'
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/util/LinkFormatHelper.java`
#### Snippet
```java
            links.add(getResourceDescription(objectEnabler, instanceId, resourceId, rootPath));
        }
        return links.toArray(new LwM2mLink[links.size()]);
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new Attribute\[attributes.size()\]'
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/object/LwM2mTestObject.java`
#### Snippet
```java
                attributes.put(attr.getName(), attr);
            }
            return attributes.values().toArray(new Attribute[attributes.size()]);
        }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new LwM2mPath\[newInstances.size()\]'
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/resource/SimpleInstanceEnabler.java`
#### Snippet
```java
        // Either we raise resource instance changes or resource change.
        if (!newInstances.isEmpty()) {
            fireResourcesChange(newInstances.toArray(new LwM2mPath[newInstances.size()]));
        } else if (!newValue.equals(previousValue)) {
            fireResourceChange(resourceid);
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new LwM2mPath\[changingResources.size()\]'
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/resource/SimpleInstanceEnabler.java`
#### Snippet
```java
        }

        return changingResources.toArray(new LwM2mPath[changingResources.size()]);
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new LwM2mPath\[resourcesChanged.size()\]'
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/resource/TransactionalObjectListener.java`
#### Snippet
```java
            fireObjectInstancesRemoved(toIntArray(instancesRemoved));
        if (!resourcesChanged.isEmpty())
            fireResourcesChanged(resourcesChanged.toArray(new LwM2mPath[resourcesChanged.size()]));
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new ModuleDefinitionsProvider\[moduleDefinitions.size()\]'
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/endpoint/AbstractEndpointFactoryBuilder.java`
#### Snippet
```java
        List<ModuleDefinitionsProvider> moduleDefinitions = getModuleDefinitionsProviders();
        Configuration configuration = new Configuration(
                moduleDefinitions.toArray(new ModuleDefinitionsProvider[moduleDefinitions.size()]));
        // Apply default value
        applyDefaultValue(configuration);
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new ModuleDefinitionsProvider\[moduleProviders.size()\]'
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/endpoint/CaliforniumServerEndpointsProvider.java`
#### Snippet
```java
            // create Californium Configuration
            Configuration configuration = new Configuration(
                    moduleProviders.toArray(new ModuleDefinitionsProvider[moduleProviders.size()]));

            // apply default value
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new Resource\[resources.size()\]'
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/endpoint/CaliforniumServerEndpointsProvider.java`
#### Snippet
```java
        // create resources
        List<Resource> resources = messagetranslator.createResources(requestReceiver, toolbox, identityHandlerProvider);
        coapServer.add(resources.toArray(new Resource[resources.size()]));
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new Resource\[resources.size()\]'
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/bootstrap/endpoint/CaliforniumBootstrapServerEndpointsProvider.java`
#### Snippet
```java
        // create resources
        List<Resource> resources = messagetranslator.createResources(requestReceiver, toolbox, identityHandlerProvider);
        coapServer.add(resources.toArray(new Resource[resources.size()]));
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new ModuleDefinitionsProvider\[moduleProviders.size()\]'
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/bootstrap/endpoint/CaliforniumBootstrapServerEndpointsProvider.java`
#### Snippet
```java
            // create Californium Configuration
            Configuration configuration = new Configuration(
                    moduleProviders.toArray(new ModuleDefinitionsProvider[moduleProviders.size()]));

            // apply default value
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new ModuleDefinitionsProvider\[moduleProviders.size()\]'
in `leshan-client-cf/src/main/java/org/eclipse/leshan/client/californium/endpoint/CaliforniumClientEndpointsProvider.java`
#### Snippet
```java
            // create Californium Configuration
            Configuration configuration = new Configuration(
                    moduleProviders.toArray(new ModuleDefinitionsProvider[moduleProviders.size()]));

            // apply default value
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new Resource\[resources.size()\]'
in `leshan-client-cf/src/main/java/org/eclipse/leshan/client/californium/endpoint/CaliforniumClientEndpointsProvider.java`
#### Snippet
```java
        List<Resource> resources = messagetranslator.createResources(coapServer, identityHandlerProvider,
                identityExtrator, requestReceiver, toolbox, objectTree);
        coapServer.add(resources.toArray(new Resource[resources.size()]));
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new LwM2mObjectInstance\[object.getInstances().values().size()\]'
in `leshan-client-cf/src/main/java/org/eclipse/leshan/client/californium/object/ObjectResource.java`
#### Snippet
```java
            } else {
                createRequest = new CreateRequest(contentFormat, coapRequest, URI, object.getInstances().values()
                        .toArray(new LwM2mObjectInstance[object.getInstances().values().size()]));
            }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new Certificate\[trustStore.size()\]'
in `leshan-bsserver-demo/src/main/java/org/eclipse/leshan/server/bootstrap/demo/LeshanBootstrapServerDemo.java`
#### Snippet
```java
            // Define trust store
            List<Certificate> trustStore = cli.identity.getTrustStore();
            builder.setTrustedCertificates(trustStore.toArray(new Certificate[trustStore.size()]));
        } else if (cli.identity.isRPK()) {
            // use RPK only
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new Link\[links.size()\]'
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/DefaultLinkParser.java`
#### Snippet
```java
            parser.consumeChar(',');
        }
        return links.toArray(new Link[links.size()]);
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[queries.size()\]'
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/lwm2m/attributes/MixedLwM2mAttributeSet.java`
#### Snippet
```java
            }
        }
        return queries.toArray(new String[queries.size()]);
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new LwM2mResource\[resources.size()\]'
in `leshan-core/src/main/java/org/eclipse/leshan/core/request/CreateRequest.java`
#### Snippet
```java
    public CreateRequest(ContentFormat contentFormat, int objectId, Collection<LwM2mResource> resources)
            throws InvalidRequestException {
        this(contentFormat, objectId, resources.toArray(new LwM2mResource[resources.size()]));
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new LwM2mResource\[resources.size()\]'
in `leshan-core/src/main/java/org/eclipse/leshan/core/request/CreateRequest.java`
#### Snippet
```java
    public CreateRequest(ContentFormat contentFormat, Object coapRequest, String path,
            Collection<LwM2mResource> resources) throws InvalidRequestException {
        this(contentFormat, coapRequest, path, resources.toArray(new LwM2mResource[resources.size()]));
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new LwM2mResource\[resources.size()\]'
in `leshan-core/src/main/java/org/eclipse/leshan/core/request/CreateRequest.java`
#### Snippet
```java
     */
    public CreateRequest(String path, Collection<LwM2mResource> resources) throws InvalidRequestException {
        this(path, resources.toArray(new LwM2mResource[resources.size()]));
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new LwM2mResource\[resources.size()\]'
in `leshan-core/src/main/java/org/eclipse/leshan/core/request/CreateRequest.java`
#### Snippet
```java
    public CreateRequest(ContentFormat contentFormat, String path, Collection<LwM2mResource> resources)
            throws InvalidRequestException {
        this(contentFormat, path, resources.toArray(new LwM2mResource[resources.size()]));
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new LwM2mResource\[resources.size()\]'
in `leshan-core/src/main/java/org/eclipse/leshan/core/request/CreateRequest.java`
#### Snippet
```java
     */
    public CreateRequest(int objectId, Collection<LwM2mResource> resources) {
        this(objectId, resources.toArray(new LwM2mResource[resources.size()]));
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new Certificate\[trustStore.size()\]'
in `leshan-server-demo/src/main/java/org/eclipse/leshan/server/demo/LeshanServerDemo.java`
#### Snippet
```java
            // Define trust store
            List<Certificate> trustStore = cli.identity.getTrustStore();
            builder.setTrustedCertificates(trustStore.toArray(new Certificate[trustStore.size()]));
        } else if (cli.identity.isRPK()) {
            // use RPK only
```

## RuleId[id=WrapperTypeMayBePrimitive]
### WrapperTypeMayBePrimitive
Type may be primitive
in `leshan-core-demo/src/main/java/org/eclipse/leshan/core/demo/cli/converters/StrictlyPositiveIntegerConverter.java`
#### Snippet
```java
    @Override
    public Integer convert(String value) throws Exception {
        Integer res = Integer.parseInt(value);

        if (res <= 0)
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `leshan-core-demo/src/main/java/org/eclipse/leshan/core/demo/cli/converters/CIDConverter.java`
#### Snippet
```java
            return onValue;
        } else {
            Integer res = Integer.parseInt(cid);
            return res < 0 ? null : res;
        }
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `leshan-core-demo/src/main/java/org/eclipse/leshan/core/demo/cli/converters/PortConverter.java`
#### Snippet
```java
    @Override
    public Integer convert(String value) throws Exception {
        Integer res = Integer.parseInt(value);

        if (res < 0 || 65535 < res)
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2m.java`
#### Snippet
```java
            for (int i = 0; i < 2; i++) {
                try {
                    Short parsedShort = Short.parseShort(versionPart[i]);
                    if (parsedShort < 0) {
                        return String.format("version (%s) part %d (%s) is not a valid short", version, i + 1,
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/codec/tlv/LwM2mNodeTlvDecoder.java`
#### Snippet
```java
    private LwM2mResourceInstance parseResourceInstanceTlv(Tlv tlv, LwM2mPath resourceInstancePath, Type expectedType)
            throws CodecException {
        Integer resourceInstanceId = tlv.getIdentifier();
        if (tlv.getType() != TlvType.RESOURCE_INSTANCE) {
            throw new CodecException("Expected TLV of type RESOURCE_INSTANCE but was %s for path %s", tlv.getType(),
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/codec/tlv/LwM2mNodeTlvDecoder.java`
#### Snippet
```java
    private LwM2mResource parseResourceTlv(Tlv tlv, LwM2mPath resourcePath, LwM2mModel model) throws CodecException {
        Type expectedType = getResourceType(resourcePath, model);
        Integer resourceId = tlv.getIdentifier();
        switch (tlv.getType()) {
        case MULTIPLE_RESOURCE:
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `leshan-core/src/main/java/org/eclipse/leshan/core/model/DDFFileParser.java`
#### Snippet
```java
        String name = null;
        Operations operations = null;
        Boolean multiple = false;
        Boolean mandatory = false;
        Type type = null;
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `leshan-core/src/main/java/org/eclipse/leshan/core/model/DDFFileParser.java`
#### Snippet
```java
        Operations operations = null;
        Boolean multiple = false;
        Boolean mandatory = false;
        Type type = null;
        String rangeEnumeration = null;
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `leshan-server-demo/src/main/java/org/eclipse/leshan/server/demo/model/DdfDownloader.java`
#### Snippet
```java
                Node item = items.item(i);
                Node id = ((Element) item).getElementsByTagName("ObjectID").item(0);
                Integer objectId;
                if (id == null) {
                    LOG.warn("Item without ObjectID : {}" + item.getTextContent());
```

## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/bootstrap/BootstrapSessionListener.java`
#### Snippet
```java
     *
     */
    public void onResponseError(BootstrapSession session, BootstrapDownlinkRequest<? extends LwM2mResponse> request,
            LwM2mResponse response);

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/bootstrap/BootstrapSessionListener.java`
#### Snippet
```java
     *
     */
    public void onRequestFailure(BootstrapSession session, BootstrapDownlinkRequest<? extends LwM2mResponse> request,
            Throwable cause);

```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/bootstrap/SmsSecurityMode.java`
#### Snippet
```java
    public final int code;

    private SmsSecurityMode(int code) {
        this.code = code;
    }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/bootstrap/BootstrapTaskProvider.java`
#### Snippet
```java
     *
     */
    public class Tasks {
        /**
         * the list of request to send
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/bootstrap/BootstrapSessionManager.java`
#### Snippet
```java
     * @return a BootstrapSession, possibly authorized.
     */
    public BootstrapSession begin(BootstrapRequest request, Identity clientIdentity, URI endpointUsed);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/bootstrap/BootstrapSessionManager.java`
#### Snippet
```java
     * @param cause why the bootstrap failed.
     */
    public void failed(BootstrapSession bsSession, BootstrapFailureCause cause);
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/bootstrap/BootstrapSessionManager.java`
#### Snippet
```java
     * @return true if there is a bootstrap requests to send for this client.
     */
    public boolean hasConfigFor(BootstrapSession bsSession);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/bootstrap/BootstrapSessionManager.java`
#### Snippet
```java
     * @return a {@link BootstrapPolicy} given the way to continue the bootstrap session.
     */
    public BootstrapPolicy onResponseError(BootstrapSession bsSession,
            BootstrapDownlinkRequest<? extends LwM2mResponse> request, LwM2mResponse response);

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/bootstrap/BootstrapSessionManager.java`
#### Snippet
```java
     * @param bsSession the bootstrap session which ends successfully.
     */
    public void end(BootstrapSession bsSession);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/bootstrap/BootstrapSessionManager.java`
#### Snippet
```java
     * @return a {@link BootstrapPolicy} given the way to continue the bootstrap session.
     */
    public BootstrapPolicy onResponseSuccess(BootstrapSession bsSession,
            BootstrapDownlinkRequest<? extends LwM2mResponse> request, LwM2mResponse response);

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/bootstrap/BootstrapSessionManager.java`
#### Snippet
```java
     * @return the first request to send.
     */
    public BootstrapDownlinkRequest<? extends LwM2mResponse> getFirstRequest(BootstrapSession bsSession);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/bootstrap/BootstrapSessionManager.java`
#### Snippet
```java
     * @return a {@link BootstrapPolicy} given the way to continue the bootstrap session.
     */
    public BootstrapPolicy onRequestFailure(BootstrapSession bsSession,
            BootstrapDownlinkRequest<? extends LwM2mResponse> request, Throwable cause);

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/bootstrap/BootstrapSessionManager.java`
#### Snippet
```java
     * If the session continue, it also define which request must be send next.
     */
    public class BootstrapPolicy {

        private final boolean failed;
```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/object/LwM2mTestObject.java`
#### Snippet
```java
    /* ***************** Random Generator ****************** */

    static interface ValueGenerator<T> {
        T generate();
    }
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/engine/DefaultRegistrationEngine.java`
#### Snippet
```java
    private final boolean queueMode;

    private static enum Status {
        SUCCESS, FAILURE, TIMEOUT
    }
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `leshan-core/src/main/java/org/eclipse/leshan/core/SecurityMode.java`
#### Snippet
```java
    public final int code;

    private SecurityMode(int code) {
        this.code = code;
    }
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `leshan-core/src/main/java/org/eclipse/leshan/core/CertificateUsage.java`
#### Snippet
```java
    public final ULong code;

    private CertificateUsage(int code) {
        this.code = ULong.valueOf(code);
    }
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `leshan-core/src/main/java/org/eclipse/leshan/core/MatchingType.java`
#### Snippet
```java
    public final ULong code;

    private MatchingType(int code) {
        this.code = ULong.valueOf(code);
    }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java
    public static final int SERVER = 1;
    public static final int ACCESS_CONTROL = 2;
    public static final int DEVICE = 3;
    public static final int CONNECTIVITY_MONITORING = 4;
    public static final int FIRMWARE = 5;
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java
    public static final int SERVER = 1;
    public static final int ACCESS_CONTROL = 2;
    public static final int DEVICE = 3;
    public static final int CONNECTIVITY_MONITORING = 4;
    public static final int FIRMWARE = 5;
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java
    public static final int SERVER = 1;
    public static final int ACCESS_CONTROL = 2;
    public static final int DEVICE = 3;
    public static final int CONNECTIVITY_MONITORING = 4;
    public static final int FIRMWARE = 5;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java
    public static final int SRV_SERVER_ID = 0;
    public static final int SRV_LIFETIME = 1;
    public static final int SRV_BINDING = 7;

    /* ACCESS CONTROL RESOURCES */
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java
    public static final int SRV_SERVER_ID = 0;
    public static final int SRV_LIFETIME = 1;
    public static final int SRV_BINDING = 7;

    /* ACCESS CONTROL RESOURCES */
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java
    public static final int SRV_SERVER_ID = 0;
    public static final int SRV_LIFETIME = 1;
    public static final int SRV_BINDING = 7;

    /* ACCESS CONTROL RESOURCES */
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java
    public static final int ACL_OBJECT_INSTANCE_ID = 1;
    public static final int ACL_ACL = 2;
    public static final int ACL_ACCESS_CONTROL_OWNER = 3;

    /* DEVICE RESOURCES */
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java
    public static final int ACL_OBJECT_INSTANCE_ID = 1;
    public static final int ACL_ACL = 2;
    public static final int ACL_ACCESS_CONTROL_OWNER = 3;

    /* DEVICE RESOURCES */
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java
    public static final int ACL_OBJECT_INSTANCE_ID = 1;
    public static final int ACL_ACL = 2;
    public static final int ACL_ACCESS_CONTROL_OWNER = 3;

    /* DEVICE RESOURCES */
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java

    public static final int SRV_SERVER_ID = 0;
    public static final int SRV_LIFETIME = 1;
    public static final int SRV_BINDING = 7;

```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java

    public static final int SRV_SERVER_ID = 0;
    public static final int SRV_LIFETIME = 1;
    public static final int SRV_BINDING = 7;

```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java

    public static final int SRV_SERVER_ID = 0;
    public static final int SRV_LIFETIME = 1;
    public static final int SRV_BINDING = 7;

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java
    public static final int OSCORE_RECIPIENT_ID = 2;
    public static final int OSCORE_AEAD_ALGORITHM = 3;
    public static final int OSCORE_HMAC_ALGORITHM = 4;
    public static final int OSCORE_MASTER_SALT = 5;

```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java
    public static final int OSCORE_RECIPIENT_ID = 2;
    public static final int OSCORE_AEAD_ALGORITHM = 3;
    public static final int OSCORE_HMAC_ALGORITHM = 4;
    public static final int OSCORE_MASTER_SALT = 5;

```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java
    public static final int OSCORE_RECIPIENT_ID = 2;
    public static final int OSCORE_AEAD_ALGORITHM = 3;
    public static final int OSCORE_HMAC_ALGORITHM = 4;
    public static final int OSCORE_MASTER_SALT = 5;

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java
    /* SERVER RESOURCES */

    public static final int SRV_SERVER_ID = 0;
    public static final int SRV_LIFETIME = 1;
    public static final int SRV_BINDING = 7;
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java
    /* SERVER RESOURCES */

    public static final int SRV_SERVER_ID = 0;
    public static final int SRV_LIFETIME = 1;
    public static final int SRV_BINDING = 7;
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java
    /* SERVER RESOURCES */

    public static final int SRV_SERVER_ID = 0;
    public static final int SRV_LIFETIME = 1;
    public static final int SRV_BINDING = 7;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java

    public static final int OSCORE_MASTER_SECRET = 0;
    public static final int OSCORE_SENDER_ID = 1;
    public static final int OSCORE_RECIPIENT_ID = 2;
    public static final int OSCORE_AEAD_ALGORITHM = 3;
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java

    public static final int OSCORE_MASTER_SECRET = 0;
    public static final int OSCORE_SENDER_ID = 1;
    public static final int OSCORE_RECIPIENT_ID = 2;
    public static final int OSCORE_AEAD_ALGORITHM = 3;
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java

    public static final int OSCORE_MASTER_SECRET = 0;
    public static final int OSCORE_SENDER_ID = 1;
    public static final int OSCORE_RECIPIENT_ID = 2;
    public static final int OSCORE_AEAD_ALGORITHM = 3;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java
    /* SECURITY RESOURCES */

    public static final int SEC_SERVER_URI = 0;
    public static final int SEC_BOOTSTRAP = 1;
    public static final int SEC_SECURITY_MODE = 2;
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java
    /* SECURITY RESOURCES */

    public static final int SEC_SERVER_URI = 0;
    public static final int SEC_BOOTSTRAP = 1;
    public static final int SEC_SECURITY_MODE = 2;
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java
    /* SECURITY RESOURCES */

    public static final int SEC_SERVER_URI = 0;
    public static final int SEC_BOOTSTRAP = 1;
    public static final int SEC_SECURITY_MODE = 2;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java
    public static final int SECURITY = 0;
    public static final int SERVER = 1;
    public static final int ACCESS_CONTROL = 2;
    public static final int DEVICE = 3;
    public static final int CONNECTIVITY_MONITORING = 4;
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java
    public static final int SECURITY = 0;
    public static final int SERVER = 1;
    public static final int ACCESS_CONTROL = 2;
    public static final int DEVICE = 3;
    public static final int CONNECTIVITY_MONITORING = 4;
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java
    public static final int SECURITY = 0;
    public static final int SERVER = 1;
    public static final int ACCESS_CONTROL = 2;
    public static final int DEVICE = 3;
    public static final int CONNECTIVITY_MONITORING = 4;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java
    public static final int SEC_SECURITY_MODE = 2;
    public static final int SEC_PUBKEY_IDENTITY = 3;
    public static final int SEC_SERVER_PUBKEY = 4;
    public static final int SEC_SECRET_KEY = 5;
    public static final int SEC_SERVER_ID = 10;
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java
    public static final int SEC_SECURITY_MODE = 2;
    public static final int SEC_PUBKEY_IDENTITY = 3;
    public static final int SEC_SERVER_PUBKEY = 4;
    public static final int SEC_SECRET_KEY = 5;
    public static final int SEC_SERVER_ID = 10;
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java
    public static final int SEC_SECURITY_MODE = 2;
    public static final int SEC_PUBKEY_IDENTITY = 3;
    public static final int SEC_SERVER_PUBKEY = 4;
    public static final int SEC_SECRET_KEY = 5;
    public static final int SEC_SERVER_ID = 10;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java
    public static final int FIRMWARE = 5;
    public static final int LOCATION = 6;
    public static final int CONNECTIVITY_STATISTICS = 7;
    public static final int SOFTWARE_MANAGEMENT = 9;
    public static final int OSCORE = 21;
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java
    public static final int FIRMWARE = 5;
    public static final int LOCATION = 6;
    public static final int CONNECTIVITY_STATISTICS = 7;
    public static final int SOFTWARE_MANAGEMENT = 9;
    public static final int OSCORE = 21;
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java
    public static final int FIRMWARE = 5;
    public static final int LOCATION = 6;
    public static final int CONNECTIVITY_STATISTICS = 7;
    public static final int SOFTWARE_MANAGEMENT = 9;
    public static final int OSCORE = 21;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java
    public static final int SEC_PUBKEY_IDENTITY = 3;
    public static final int SEC_SERVER_PUBKEY = 4;
    public static final int SEC_SECRET_KEY = 5;
    public static final int SEC_SERVER_ID = 10;
    public static final int SEC_CERTIFICATE_USAGE = 15;
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java
    public static final int SEC_PUBKEY_IDENTITY = 3;
    public static final int SEC_SERVER_PUBKEY = 4;
    public static final int SEC_SECRET_KEY = 5;
    public static final int SEC_SERVER_ID = 10;
    public static final int SEC_CERTIFICATE_USAGE = 15;
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java
    public static final int SEC_PUBKEY_IDENTITY = 3;
    public static final int SEC_SERVER_PUBKEY = 4;
    public static final int SEC_SECRET_KEY = 5;
    public static final int SEC_SERVER_ID = 10;
    public static final int SEC_CERTIFICATE_USAGE = 15;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java
    public static final int LOCATION = 6;
    public static final int CONNECTIVITY_STATISTICS = 7;
    public static final int SOFTWARE_MANAGEMENT = 9;
    public static final int OSCORE = 21;

```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java
    public static final int LOCATION = 6;
    public static final int CONNECTIVITY_STATISTICS = 7;
    public static final int SOFTWARE_MANAGEMENT = 9;
    public static final int OSCORE = 21;

```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java
    public static final int LOCATION = 6;
    public static final int CONNECTIVITY_STATISTICS = 7;
    public static final int SOFTWARE_MANAGEMENT = 9;
    public static final int OSCORE = 21;

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java
    public static final int SEC_SECRET_KEY = 5;
    public static final int SEC_SERVER_ID = 10;
    public static final int SEC_CERTIFICATE_USAGE = 15;
    public static final int SEC_OSCORE_SECURITY_MODE = 17;

```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java
    public static final int SEC_SECRET_KEY = 5;
    public static final int SEC_SERVER_ID = 10;
    public static final int SEC_CERTIFICATE_USAGE = 15;
    public static final int SEC_OSCORE_SECURITY_MODE = 17;

```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java
    public static final int SEC_SECRET_KEY = 5;
    public static final int SEC_SERVER_ID = 10;
    public static final int SEC_CERTIFICATE_USAGE = 15;
    public static final int SEC_OSCORE_SECURITY_MODE = 17;

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java

    public static final int SECURITY = 0;
    public static final int SERVER = 1;
    public static final int ACCESS_CONTROL = 2;
    public static final int DEVICE = 3;
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java

    public static final int SECURITY = 0;
    public static final int SERVER = 1;
    public static final int ACCESS_CONTROL = 2;
    public static final int DEVICE = 3;
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java

    public static final int SECURITY = 0;
    public static final int SERVER = 1;
    public static final int ACCESS_CONTROL = 2;
    public static final int DEVICE = 3;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java
    public static final int OSCORE_SENDER_ID = 1;
    public static final int OSCORE_RECIPIENT_ID = 2;
    public static final int OSCORE_AEAD_ALGORITHM = 3;
    public static final int OSCORE_HMAC_ALGORITHM = 4;
    public static final int OSCORE_MASTER_SALT = 5;
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java
    public static final int OSCORE_SENDER_ID = 1;
    public static final int OSCORE_RECIPIENT_ID = 2;
    public static final int OSCORE_AEAD_ALGORITHM = 3;
    public static final int OSCORE_HMAC_ALGORITHM = 4;
    public static final int OSCORE_MASTER_SALT = 5;
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java
    public static final int OSCORE_SENDER_ID = 1;
    public static final int OSCORE_RECIPIENT_ID = 2;
    public static final int OSCORE_AEAD_ALGORITHM = 3;
    public static final int OSCORE_HMAC_ALGORITHM = 4;
    public static final int OSCORE_MASTER_SALT = 5;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java
    public static final int ACCESS_CONTROL = 2;
    public static final int DEVICE = 3;
    public static final int CONNECTIVITY_MONITORING = 4;
    public static final int FIRMWARE = 5;
    public static final int LOCATION = 6;
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java
    public static final int ACCESS_CONTROL = 2;
    public static final int DEVICE = 3;
    public static final int CONNECTIVITY_MONITORING = 4;
    public static final int FIRMWARE = 5;
    public static final int LOCATION = 6;
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java
    public static final int ACCESS_CONTROL = 2;
    public static final int DEVICE = 3;
    public static final int CONNECTIVITY_MONITORING = 4;
    public static final int FIRMWARE = 5;
    public static final int LOCATION = 6;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java
    public static final int SEC_SERVER_URI = 0;
    public static final int SEC_BOOTSTRAP = 1;
    public static final int SEC_SECURITY_MODE = 2;
    public static final int SEC_PUBKEY_IDENTITY = 3;
    public static final int SEC_SERVER_PUBKEY = 4;
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java
    public static final int SEC_SERVER_URI = 0;
    public static final int SEC_BOOTSTRAP = 1;
    public static final int SEC_SECURITY_MODE = 2;
    public static final int SEC_PUBKEY_IDENTITY = 3;
    public static final int SEC_SERVER_PUBKEY = 4;
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java
    public static final int SEC_SERVER_URI = 0;
    public static final int SEC_BOOTSTRAP = 1;
    public static final int SEC_SECURITY_MODE = 2;
    public static final int SEC_PUBKEY_IDENTITY = 3;
    public static final int SEC_SERVER_PUBKEY = 4;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java
    /* OBJECTS */

    public static final int SECURITY = 0;
    public static final int SERVER = 1;
    public static final int ACCESS_CONTROL = 2;
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java
    /* OBJECTS */

    public static final int SECURITY = 0;
    public static final int SERVER = 1;
    public static final int ACCESS_CONTROL = 2;
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java
    /* OBJECTS */

    public static final int SECURITY = 0;
    public static final int SERVER = 1;
    public static final int ACCESS_CONTROL = 2;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java
    /* OSCORE RESOURCES */

    public static final int OSCORE_MASTER_SECRET = 0;
    public static final int OSCORE_SENDER_ID = 1;
    public static final int OSCORE_RECIPIENT_ID = 2;
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java
    /* OSCORE RESOURCES */

    public static final int OSCORE_MASTER_SECRET = 0;
    public static final int OSCORE_SENDER_ID = 1;
    public static final int OSCORE_RECIPIENT_ID = 2;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `leshan-core/src/main/java/org/eclipse/leshan/core/json/LwM2mJsonEncoder.java`
#### Snippet
```java
public interface LwM2mJsonEncoder {

    public String toJsonLwM2m(JsonRootObject jro) throws LwM2mJsonException;

}
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java
    /* OSCORE RESOURCES */

    public static final int OSCORE_MASTER_SECRET = 0;
    public static final int OSCORE_SENDER_ID = 1;
    public static final int OSCORE_RECIPIENT_ID = 2;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java
    /* DEVICE RESOURCES */

    public static final int DVC_SUPPORTED_BINDING = 16;
}

```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java
    /* DEVICE RESOURCES */

    public static final int DVC_SUPPORTED_BINDING = 16;
}

```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java
    /* DEVICE RESOURCES */

    public static final int DVC_SUPPORTED_BINDING = 16;
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java
    public static final int SEC_BOOTSTRAP = 1;
    public static final int SEC_SECURITY_MODE = 2;
    public static final int SEC_PUBKEY_IDENTITY = 3;
    public static final int SEC_SERVER_PUBKEY = 4;
    public static final int SEC_SECRET_KEY = 5;
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java
    public static final int SEC_BOOTSTRAP = 1;
    public static final int SEC_SECURITY_MODE = 2;
    public static final int SEC_PUBKEY_IDENTITY = 3;
    public static final int SEC_SERVER_PUBKEY = 4;
    public static final int SEC_SECRET_KEY = 5;
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java
    public static final int SEC_BOOTSTRAP = 1;
    public static final int SEC_SECURITY_MODE = 2;
    public static final int SEC_PUBKEY_IDENTITY = 3;
    public static final int SEC_SERVER_PUBKEY = 4;
    public static final int SEC_SECRET_KEY = 5;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java

    /* ACCESS CONTROL RESOURCES */
    public static final int ACL_OBJECT_ID = 0;
    public static final int ACL_OBJECT_INSTANCE_ID = 1;
    public static final int ACL_ACL = 2;
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java

    /* ACCESS CONTROL RESOURCES */
    public static final int ACL_OBJECT_ID = 0;
    public static final int ACL_OBJECT_INSTANCE_ID = 1;
    public static final int ACL_ACL = 2;
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java

    /* ACCESS CONTROL RESOURCES */
    public static final int ACL_OBJECT_ID = 0;
    public static final int ACL_OBJECT_INSTANCE_ID = 1;
    public static final int ACL_ACL = 2;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java
    /* ACCESS CONTROL RESOURCES */
    public static final int ACL_OBJECT_ID = 0;
    public static final int ACL_OBJECT_INSTANCE_ID = 1;
    public static final int ACL_ACL = 2;
    public static final int ACL_ACCESS_CONTROL_OWNER = 3;
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java
    /* ACCESS CONTROL RESOURCES */
    public static final int ACL_OBJECT_ID = 0;
    public static final int ACL_OBJECT_INSTANCE_ID = 1;
    public static final int ACL_ACL = 2;
    public static final int ACL_ACCESS_CONTROL_OWNER = 3;
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java
    /* ACCESS CONTROL RESOURCES */
    public static final int ACL_OBJECT_ID = 0;
    public static final int ACL_OBJECT_INSTANCE_ID = 1;
    public static final int ACL_ACL = 2;
    public static final int ACL_ACCESS_CONTROL_OWNER = 3;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java
    public static final int OSCORE_AEAD_ALGORITHM = 3;
    public static final int OSCORE_HMAC_ALGORITHM = 4;
    public static final int OSCORE_MASTER_SALT = 5;

    /* SERVER RESOURCES */
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java
    public static final int OSCORE_AEAD_ALGORITHM = 3;
    public static final int OSCORE_HMAC_ALGORITHM = 4;
    public static final int OSCORE_MASTER_SALT = 5;

    /* SERVER RESOURCES */
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java
    public static final int OSCORE_AEAD_ALGORITHM = 3;
    public static final int OSCORE_HMAC_ALGORITHM = 4;
    public static final int OSCORE_MASTER_SALT = 5;

    /* SERVER RESOURCES */
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java
    public static final int ACL_OBJECT_ID = 0;
    public static final int ACL_OBJECT_INSTANCE_ID = 1;
    public static final int ACL_ACL = 2;
    public static final int ACL_ACCESS_CONTROL_OWNER = 3;

```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java
    public static final int ACL_OBJECT_ID = 0;
    public static final int ACL_OBJECT_INSTANCE_ID = 1;
    public static final int ACL_ACL = 2;
    public static final int ACL_ACCESS_CONTROL_OWNER = 3;

```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java
    public static final int ACL_OBJECT_ID = 0;
    public static final int ACL_OBJECT_INSTANCE_ID = 1;
    public static final int ACL_ACL = 2;
    public static final int ACL_ACCESS_CONTROL_OWNER = 3;

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java
    public static final int CONNECTIVITY_MONITORING = 4;
    public static final int FIRMWARE = 5;
    public static final int LOCATION = 6;
    public static final int CONNECTIVITY_STATISTICS = 7;
    public static final int SOFTWARE_MANAGEMENT = 9;
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java
    public static final int CONNECTIVITY_MONITORING = 4;
    public static final int FIRMWARE = 5;
    public static final int LOCATION = 6;
    public static final int CONNECTIVITY_STATISTICS = 7;
    public static final int SOFTWARE_MANAGEMENT = 9;
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java
    public static final int CONNECTIVITY_MONITORING = 4;
    public static final int FIRMWARE = 5;
    public static final int LOCATION = 6;
    public static final int CONNECTIVITY_STATISTICS = 7;
    public static final int SOFTWARE_MANAGEMENT = 9;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java

    public static final int SEC_SERVER_URI = 0;
    public static final int SEC_BOOTSTRAP = 1;
    public static final int SEC_SECURITY_MODE = 2;
    public static final int SEC_PUBKEY_IDENTITY = 3;
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java

    public static final int SEC_SERVER_URI = 0;
    public static final int SEC_BOOTSTRAP = 1;
    public static final int SEC_SECURITY_MODE = 2;
    public static final int SEC_PUBKEY_IDENTITY = 3;
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java

    public static final int SEC_SERVER_URI = 0;
    public static final int SEC_BOOTSTRAP = 1;
    public static final int SEC_SECURITY_MODE = 2;
    public static final int SEC_PUBKEY_IDENTITY = 3;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java
    public static final int OSCORE_MASTER_SECRET = 0;
    public static final int OSCORE_SENDER_ID = 1;
    public static final int OSCORE_RECIPIENT_ID = 2;
    public static final int OSCORE_AEAD_ALGORITHM = 3;
    public static final int OSCORE_HMAC_ALGORITHM = 4;
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java
    public static final int OSCORE_MASTER_SECRET = 0;
    public static final int OSCORE_SENDER_ID = 1;
    public static final int OSCORE_RECIPIENT_ID = 2;
    public static final int OSCORE_AEAD_ALGORITHM = 3;
    public static final int OSCORE_HMAC_ALGORITHM = 4;
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java
    public static final int OSCORE_MASTER_SECRET = 0;
    public static final int OSCORE_SENDER_ID = 1;
    public static final int OSCORE_RECIPIENT_ID = 2;
    public static final int OSCORE_AEAD_ALGORITHM = 3;
    public static final int OSCORE_HMAC_ALGORITHM = 4;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java
    public static final int SEC_SERVER_PUBKEY = 4;
    public static final int SEC_SECRET_KEY = 5;
    public static final int SEC_SERVER_ID = 10;
    public static final int SEC_CERTIFICATE_USAGE = 15;
    public static final int SEC_OSCORE_SECURITY_MODE = 17;
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java
    public static final int SEC_SERVER_PUBKEY = 4;
    public static final int SEC_SECRET_KEY = 5;
    public static final int SEC_SERVER_ID = 10;
    public static final int SEC_CERTIFICATE_USAGE = 15;
    public static final int SEC_OSCORE_SECURITY_MODE = 17;
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java
    public static final int SEC_SERVER_PUBKEY = 4;
    public static final int SEC_SECRET_KEY = 5;
    public static final int SEC_SERVER_ID = 10;
    public static final int SEC_CERTIFICATE_USAGE = 15;
    public static final int SEC_OSCORE_SECURITY_MODE = 17;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java
    public static final int DEVICE = 3;
    public static final int CONNECTIVITY_MONITORING = 4;
    public static final int FIRMWARE = 5;
    public static final int LOCATION = 6;
    public static final int CONNECTIVITY_STATISTICS = 7;
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java
    public static final int DEVICE = 3;
    public static final int CONNECTIVITY_MONITORING = 4;
    public static final int FIRMWARE = 5;
    public static final int LOCATION = 6;
    public static final int CONNECTIVITY_STATISTICS = 7;
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java
    public static final int DEVICE = 3;
    public static final int CONNECTIVITY_MONITORING = 4;
    public static final int FIRMWARE = 5;
    public static final int LOCATION = 6;
    public static final int CONNECTIVITY_STATISTICS = 7;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java
    public static final int SEC_SERVER_ID = 10;
    public static final int SEC_CERTIFICATE_USAGE = 15;
    public static final int SEC_OSCORE_SECURITY_MODE = 17;

    /* OSCORE RESOURCES */
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java
    public static final int SEC_SERVER_ID = 10;
    public static final int SEC_CERTIFICATE_USAGE = 15;
    public static final int SEC_OSCORE_SECURITY_MODE = 17;

    /* OSCORE RESOURCES */
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java
    public static final int SEC_SERVER_ID = 10;
    public static final int SEC_CERTIFICATE_USAGE = 15;
    public static final int SEC_OSCORE_SECURITY_MODE = 17;

    /* OSCORE RESOURCES */
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java
    public static final int CONNECTIVITY_STATISTICS = 7;
    public static final int SOFTWARE_MANAGEMENT = 9;
    public static final int OSCORE = 21;

    /* SECURITY RESOURCES */
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java
    public static final int CONNECTIVITY_STATISTICS = 7;
    public static final int SOFTWARE_MANAGEMENT = 9;
    public static final int OSCORE = 21;

    /* SECURITY RESOURCES */
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2mId.java`
#### Snippet
```java
    public static final int CONNECTIVITY_STATISTICS = 7;
    public static final int SOFTWARE_MANAGEMENT = 9;
    public static final int OSCORE = 21;

    /* SECURITY RESOURCES */
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2m.java`
#### Snippet
```java

    /** The default CoAP port for secure CoAP communication */
    public static final int DEFAULT_COAP_SECURE_PORT = 5684;
}

```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2m.java`
#### Snippet
```java

    /** The default CoAP port for secure CoAP communication */
    public static final int DEFAULT_COAP_SECURE_PORT = 5684;
}

```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2m.java`
#### Snippet
```java

    /** The default CoAP port for secure CoAP communication */
    public static final int DEFAULT_COAP_SECURE_PORT = 5684;
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2m.java`
#### Snippet
```java

    /** The default CoAP port for unsecured CoAP communication */
    public static final int DEFAULT_COAP_PORT = 5683;

    /** The default CoAP port for secure CoAP communication */
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2m.java`
#### Snippet
```java

    /** The default CoAP port for unsecured CoAP communication */
    public static final int DEFAULT_COAP_PORT = 5683;

    /** The default CoAP port for secure CoAP communication */
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2m.java`
#### Snippet
```java

    /** The default CoAP port for unsecured CoAP communication */
    public static final int DEFAULT_COAP_PORT = 5683;

    /** The default CoAP port for secure CoAP communication */
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2m.java`
#### Snippet
```java
     * Generic class to handle Version (e.g. Object versioning)
     */
    public class Version implements Comparable<Version> {

        public static Version V1_0 = new Version("1.0");
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2m.java`
#### Snippet
```java
     * Version of LWM2M specification.
     */
    public class LwM2mVersion extends Version {

        public static LwM2mVersion V1_0 = new LwM2mVersion("1.0", true);
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `leshan-core/src/main/java/org/eclipse/leshan/core/util/X509CertUtil.java`
#### Snippet
```java
         * @param value the integer value of the code
         */
        private GeneralName(final int value) {
            this.value = value;
        }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `leshan-core/src/main/java/org/eclipse/leshan/core/model/DDFFileValidator.java`
#### Snippet
```java
     * @throws InvalidDDFFileException if ddf file is invalid.
     */
    public void validate(Node xmlToValidate) throws InvalidDDFFileException;
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `leshan-core/src/main/java/org/eclipse/leshan/core/model/ObjectModelValidator.java`
#### Snippet
```java
     * @throws InvalidModelException is raised when an {@link ObjectModel} is Invalid
     */
    public void validate(List<ObjectModel> models, String modelName) throws InvalidModelException;
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `leshan-core/src/main/java/org/eclipse/leshan/senml/SenMLEncoder.java`
#### Snippet
```java
public interface SenMLEncoder {

    public byte[] toSenML(SenMLPack pack) throws SenMLException;

}
```

## RuleId[id=CStyleArrayDeclaration]
### CStyleArrayDeclaration
C-style array declaration of field `knownResponseCode`
in `leshan-core/src/main/java/org/eclipse/leshan/core/ResponseCode.java`
#### Snippet
```java
            "INTERNAL_SERVER_ERROR");

    private static final ResponseCode knownResponseCode[] = new ResponseCode[] { CREATED, DELETED, CHANGED, CONTENT,
            BAD_REQUEST, UNAUTHORIZED, METHOD_NOT_ALLOWED, FORBIDDEN, NOT_FOUND, NOT_ACCEPTABLE,
            REQUEST_ENTITY_INCOMPLETE, PRECONDITION_FAILED, REQUEST_ENTITY_TOO_LARGE, UNSUPPORTED_CONTENT_FORMAT,
```

### CStyleArrayDeclaration
C-style array declaration of field `knownHkdfAlgorithms`
in `leshan-core/src/main/java/org/eclipse/leshan/core/oscore/HkdfAlgorithm.java`
#### Snippet
```java
    public static final HkdfAlgorithm HKDF_HMAC_AES_256 = new HkdfAlgorithm("HKDF-AES-256", -13); //

    public static final HkdfAlgorithm knownHkdfAlgorithms[] = new HkdfAlgorithm[] { //
            HKDF_HMAC_SHA_256, HKDF_HMAC_SHA_512, HKDF_HMAC_AES_128, HKDF_HMAC_AES_256 };

```

### CStyleArrayDeclaration
C-style array declaration of field `knownAeadAlgorithms`
in `leshan-core/src/main/java/org/eclipse/leshan/core/oscore/AeadAlgorithm.java`
#### Snippet
```java
    public static final AeadAlgorithm AES_CCM_64_128_256 = new AeadAlgorithm("AES-CCM-64-128-256", 33, 7); //

    public static final AeadAlgorithm knownAeadAlgorithms[] = new AeadAlgorithm[] { //
            AES_GCM_128, AES_GCM_192, AES_GCM_256, //
            AES_CCM_16_64_128, AES_CCM_16_64_256, AES_CCM_64_64_128, AES_CCM_64_64_256, //
```

### CStyleArrayDeclaration
C-style array declaration of field `knownContentFormat`
in `leshan-core/src/main/java/org/eclipse/leshan/core/request/ContentFormat.java`
#### Snippet
```java
    public static final ContentFormat DEFAULT = TLV;

    public static final ContentFormat knownContentFormat[] = new ContentFormat[] { TLV, JSON, SENML_JSON, SENML_CBOR,
            TEXT, OPAQUE, CBOR, LINK };

```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (5 lines)
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/bootstrap/BootstrapConfig.java`
#### Snippet
```java

        // TODO OSCORE : not yet implemented
        // /**
        // * This resource MUST be used to store an OSCORE identifier called ID Context. This identifier is used to
        // * identify the Common Context and derive the security context used by OSCORE.
```

### CommentedOutCode
Commented out code (2 lines)
in `leshan-client-cf/src/main/java/org/eclipse/leshan/client/californium/object/ObjectResource.java`
#### Snippet
```java

        // TODO TL : should we keep this feature ?
        // ContentFormat format = nodeEnabler.getDefaultEncodingFormat(request);
        // return format == null ? ContentFormat.DEFAULT : format;

```

## RuleId[id=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\=` in RegExp
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/bootstrap/BootstrapResource.java`
#### Snippet
```java
                }
            } else {
                String[] tokens = param.split("\\=");
                if (tokens != null && tokens.length == 2) {
                    additionalParams.put(tokens[0], tokens[1]);
```

### RegExpRedundantEscape
Redundant character escape `\\=` in RegExp
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/registration/RegisterResource.java`
#### Snippet
```java
                binding = BindingMode.parse(param.substring(2));
            } else {
                String[] tokens = param.split("\\=");
                if (tokens != null && tokens.length == 2) {
                    additionalParams.put(tokens[0], tokens[1]);
```

### RegExpRedundantEscape
Redundant character escape `\\=` in RegExp
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/registration/RegisterResource.java`
#### Snippet
```java
                queueMode = true;
            } else {
                String[] tokens = param.split("\\=");
                if (tokens != null && tokens.length == 2) {
                    additionalParams.put(tokens[0], tokens[1]);
```

## RuleId[id=LongLiteralsEndingWithLowercaseL]
### LongLiteralsEndingWithLowercaseL
'long' literal `1000l` ends with lowercase 'l'
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/LeshanServer.java`
#### Snippet
```java
    // We choose a default timeout a bit higher to the MAX_TRANSMIT_WAIT(62-93s) which is the time from starting to
    // send a Confirmable message to the time when an acknowledgement is no longer expected.
    private static final long DEFAULT_TIMEOUT = 2 * 60 * 1000l; // 2min in ms

    // LWM2M attributes
```

### LongLiteralsEndingWithLowercaseL
'long' literal `1000l` ends with lowercase 'l'
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/bootstrap/DefaultBootstrapHandler.java`
#### Snippet
```java
    // We choose a default timeout a bit higher to the MAX_TRANSMIT_WAIT(62-93s) which is the time from starting to
    // send a Confirmable message to the time when an acknowledgement is no longer expected.
    public static final long DEFAULT_TIMEOUT = 2 * 60 * 1000l; // 2min in ms

    protected final BootstrapDownlinkRequestSender sender;
```

### LongLiteralsEndingWithLowercaseL
'long' literal `1000l` ends with lowercase 'l'
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/engine/DefaultRegistrationEngineFactory.java`
#### Snippet
```java
public class DefaultRegistrationEngineFactory implements RegistrationEngineFactory {

    private long requestTimeoutInMs = 2 * 60 * 1000l; // 2min in ms
    private long deregistrationTimeoutInMs = 1000; // 1s in ms
    private int bootstrapSessionTimeoutInSec = 93;
```

### LongLiteralsEndingWithLowercaseL
'long' literal `1024l` ends with lowercase 'l'
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/object/LwM2mTestObject.java`
#### Snippet
```java

    public static final String INITIAL_STRING_VALUE = "initial value";
    public static final Long INITIAL_INTEGER_VALUE = 1024l;
    public static final ULong INITIAL_UNSIGNED_INTEGER_VALUE = ULong.valueOf("9223372036854775808");
    public static final Double INITIAL_FLOAT_VALUE = 3.14159d;
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0l` ends with lowercase 'l'
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/object/LwM2mTestObject.java`
#### Snippet
```java
        // single
        clearedValues.put(110, "");
        clearedValues.put(120, 0l);
        clearedValues.put(125, ULong.valueOf(0l));
        clearedValues.put(130, 0.0d);
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0l` ends with lowercase 'l'
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/object/LwM2mTestObject.java`
#### Snippet
```java
        clearedValues.put(110, "");
        clearedValues.put(120, 0l);
        clearedValues.put(125, ULong.valueOf(0l));
        clearedValues.put(130, 0.0d);
        clearedValues.put(140, false);
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0l` ends with lowercase 'l'
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/object/LwM2mTestObject.java`
#### Snippet
```java
        clearedValues.put(140, false);
        clearedValues.put(150, new byte[0]);
        clearedValues.put(160, new Date(0l));
        clearedValues.put(170, new ObjectLink());
        clearedValues.put(180, new Link[0]);
```

### LongLiteralsEndingWithLowercaseL
'long' literal `31557600000l` ends with lowercase 'l'
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/object/LwM2mTestObject.java`
#### Snippet
```java

            // remove year randomly
            rd -= (random.nextInt(20) - 10) * 31557600000l;

            // add some variance in the year
```

### LongLiteralsEndingWithLowercaseL
'long' literal `1000l` ends with lowercase 'l'
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/object/LwM2mTestObject.java`
#### Snippet
```java

            // add some variance in the year
            rd += random.nextInt(3155760) * 1000l;

            return new Date(rd);
```

### LongLiteralsEndingWithLowercaseL
'long' literal `946684800000l` ends with lowercase 'l'
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/object/LwM2mTestObject.java`
#### Snippet
```java
    public static final Boolean INITIAL_BOOLEAN_VALUE = true;
    public static final byte[] INITIAL_OPAQUE_VALUE = Hex.decodeHex("0123456789ABCDEF".toCharArray());
    public static final Date INITIAL_TIME_VALUE = new Date(946684800000l);
    public static final ObjectLink INITIAL_OBJLINK_VALUE = new ObjectLink(3, 0);
    public static final Link[] INITIAL_CORELINK_VALUE = new Link[] { new LwM2mLink(null, new LwM2mPath(3442)) };
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0l` ends with lowercase 'l'
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/endpoint/CaliforniumServerEndpoint.java`
#### Snippet
```java
    }

    private final AtomicLong idGenerator = new AtomicLong(0l);

    private class CleanerMessageObserver extends MessageObserverAdapter {
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0l` ends with lowercase 'l'
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/bootstrap/endpoint/CaliforniumBootstrapServerEndpoint.java`
#### Snippet
```java
    }

    private final AtomicLong idGenerator = new AtomicLong(0l);

    private class CleanerMessageObserver extends MessageObserverAdapter {
```

## RuleId[id=RedundantArrayCreation]
### RedundantArrayCreation
Redundant array creation for calling varargs method
in `leshan-core/src/main/java/org/eclipse/leshan/core/tlv/Tlv.java`
#### Snippet
```java
    @Override
    public String toString() {
        return String.format("Tlv [type=%s, children=%s, value=%s, identifier=%s]", new Object[] { type.name(),
                Arrays.toString(children), Arrays.toString(value), Integer.toString(identifier) });
    }

```

## RuleId[id=DuplicateBranchesInSwitch]
### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/codec/json/LwM2mNodeJsonDecoder.java`
#### Snippet
```java
                return base64decoder.decode((String) value);
            case STRING:
                return value;
            case OBJLNK:
                return ObjectLink.decodeFromString((String) value);
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/codec/senml/LwM2mNodeSenMLDecoder.java`
#### Snippet
```java
                return new Date(numberToLong((Number) value, permissiveNumberConversion) * 1000L);
            case OPAQUE:
                return value;
            case STRING:
                return value;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/codec/senml/LwM2mNodeSenMLDecoder.java`
#### Snippet
```java
                return value;
            case STRING:
                return value;
            case OBJLNK:
                return ObjectLink.decodeFromString((String) value);
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `leshan-server-demo/src/main/java/org/eclipse/leshan/server/demo/servlet/json/JacksonLwM2mNodeSerializer.java`
#### Snippet
```java
            // We use String to be consistent with INTEGER but to be sure to not get any restriction from javascript
            // world.
            return value.toString();
        case CORELINK:
            return linkSerializer.serializeCoreLinkFormat((Link[]) value);
```

## RuleId[id=DuplicateExpressions]
### DuplicateExpressions
Multiple occurrences of `Paths.get(downloadFolderPath)`
in `leshan-server-demo/src/main/java/org/eclipse/leshan/server/demo/model/DdfDownloader.java`
#### Snippet
```java

        LOG.info("Downloading DDF files in [{}] folder ...", downloadFolderPath);
        if (!Files.isDirectory(Paths.get(downloadFolderPath))) {
            String absoluteDownloadPath = Paths.get(downloadFolderPath).normalize().toAbsolutePath().toString();
            LOG.warn("Files will be downloaded in [{}] but this is not exist or is not a directory : \n=>  {}",
```

### DuplicateExpressions
Multiple occurrences of `Paths.get(downloadFolderPath)`
in `leshan-server-demo/src/main/java/org/eclipse/leshan/server/demo/model/DdfDownloader.java`
#### Snippet
```java
        LOG.info("Downloading DDF files in [{}] folder ...", downloadFolderPath);
        if (!Files.isDirectory(Paths.get(downloadFolderPath))) {
            String absoluteDownloadPath = Paths.get(downloadFolderPath).normalize().toAbsolutePath().toString();
            LOG.warn("Files will be downloaded in [{}] but this is not exist or is not a directory : \n=>  {}",
                    downloadFolderPath, absoluteDownloadPath);
```

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder b` can be replaced with 'String'
in `leshan-bsserver-demo/src/main/java/org/eclipse/leshan/server/bootstrap/demo/servlet/EventServlet.java`
#### Snippet
```java
            try {
                String endpointName = session.getEndpoint();
                StringBuilder b = new StringBuilder();
                b.append("Bootstrap session failed : ");
                b.append(cause.toString());
```

### StringBufferReplaceableByString
`StringBuilder b` can be replaced with 'String'
in `leshan-bsserver-demo/src/main/java/org/eclipse/leshan/server/bootstrap/demo/servlet/EventServlet.java`
#### Snippet
```java
            try {
                String endpointName = request.getEndpointName();
                StringBuilder b = new StringBuilder();
                b.append(clientIdentity);
                b.append(" is not allowed to connect.");
```

### StringBufferReplaceableByString
`StringBuilder b` can be replaced with 'String'
in `leshan-bsserver-demo/src/main/java/org/eclipse/leshan/server/bootstrap/demo/servlet/EventServlet.java`
#### Snippet
```java
                if (request instanceof BootstrapDiscoverRequest) {
                    String endpointName = session.getEndpoint();
                    StringBuilder b = new StringBuilder();
                    b.append("Send DISCOVER request on ");
                    b.append(request.getPath().toString());
```

### StringBufferReplaceableByString
`StringBuilder b` can be replaced with 'String'
in `leshan-bsserver-demo/src/main/java/org/eclipse/leshan/server/bootstrap/demo/servlet/EventServlet.java`
#### Snippet
```java
                } else if (request instanceof BootstrapDeleteRequest) {
                    String endpointName = session.getEndpoint();
                    StringBuilder b = new StringBuilder();
                    b.append("Send DELETE request on ");
                    b.append(request.getPath().toString());
```

### StringBufferReplaceableByString
`StringBuilder b` can be replaced with 'String'
in `leshan-bsserver-demo/src/main/java/org/eclipse/leshan/server/bootstrap/demo/servlet/EventServlet.java`
#### Snippet
```java
                } else {
                    String endpointName = session.getEndpoint();
                    StringBuilder b = new StringBuilder();
                    b.append("Send request: ");
                    b.append(request.toString());
```

### StringBufferReplaceableByString
`StringBuilder b` can be replaced with 'String'
in `leshan-bsserver-demo/src/main/java/org/eclipse/leshan/server/bootstrap/demo/servlet/EventServlet.java`
#### Snippet
```java
            try {
                String endpointName = session.getEndpoint();
                StringBuilder b = new StringBuilder();
                b.append("No config to apply to this client.");

```

### StringBufferReplaceableByString
`StringBuilder b` can be replaced with 'String'
in `leshan-bsserver-demo/src/main/java/org/eclipse/leshan/server/bootstrap/demo/servlet/EventServlet.java`
#### Snippet
```java
                if (request instanceof BootstrapDiscoverResponse) {
                    String endpointName = session.getEndpoint();
                    StringBuilder b = new StringBuilder();
                    b.append("Receive DISCOVER reponse\n");
                    b.append(response.getCode().toString());
```

### StringBufferReplaceableByString
`StringBuilder b` can be replaced with 'String'
in `leshan-bsserver-demo/src/main/java/org/eclipse/leshan/server/bootstrap/demo/servlet/EventServlet.java`
#### Snippet
```java
                } else {
                    String endpointName = session.getEndpoint();
                    StringBuilder b = new StringBuilder();
                    b.append("Receive ");
                    b.append(response.getCode().toString());
```

### StringBufferReplaceableByString
`StringBuilder b` can be replaced with 'String'
in `leshan-bsserver-demo/src/main/java/org/eclipse/leshan/server/bootstrap/demo/servlet/EventServlet.java`
#### Snippet
```java
            try {
                String endpointName = session.getEndpoint();
                StringBuilder b = new StringBuilder();
                b.append(session.getIdentity());
                b.append(" is allowed to connect.");
```

### StringBufferReplaceableByString
`StringBuilder b` can be replaced with 'String'
in `leshan-bsserver-demo/src/main/java/org/eclipse/leshan/server/bootstrap/demo/servlet/EventServlet.java`
#### Snippet
```java
            try {
                String endpointName = session.getEndpoint();
                StringBuilder b = new StringBuilder();
                b.append("Bootstrap session finished with success");

```

### StringBufferReplaceableByString
`StringBuilder builder` can be replaced with 'String'
in `leshan-core/src/main/java/org/eclipse/leshan/core/model/ResourceModel.java`
#### Snippet
```java
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("ResourceDesc [id=").append(id).append(", name=").append(name).append(", operations=")
                .append(operations).append(", multiple=").append(multiple).append(", mandatory=").append(mandatory)
```

### StringBufferReplaceableByString
`StringBuilder builder` can be replaced with 'String'
in `leshan-core/src/main/java/org/eclipse/leshan/core/request/CreateRequest.java`
#### Snippet
```java
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("CreateRequest [").append(getPath()).append("]");
        return builder.toString();
```

### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `leshan-server-demo/src/main/java/org/eclipse/leshan/server/demo/servlet/EventServlet.java`
#### Snippet
```java
                    String jsonContent = EventServlet.this.mapper.writeValueAsString(data.getNodes());

                    String eventData = new StringBuilder("{\"ep\":\"") //
                            .append(registration.getEndpoint()) //
                            .append("\",\"val\":") //
```

### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `leshan-server-demo/src/main/java/org/eclipse/leshan/server/demo/servlet/EventServlet.java`
#### Snippet
```java

            if (registration != null) {
                String data = new StringBuilder("{\"ep\":\"") //
                        .append(registration.getEndpoint()) //
                        .append("\",\"kind\":\"composite\"") //
```

### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `leshan-server-demo/src/main/java/org/eclipse/leshan/server/demo/servlet/EventServlet.java`
#### Snippet
```java
        @Override
        public void onAwake(Registration registration) {
            String data = new StringBuilder("{\"ep\":\"").append(registration.getEndpoint()).append("\"}").toString();
            sendEvent(EVENT_AWAKE, data, registration.getEndpoint());
        }
```

### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `leshan-server-demo/src/main/java/org/eclipse/leshan/server/demo/servlet/EventServlet.java`
#### Snippet
```java

            if (registration != null) {
                String data = new StringBuilder("{\"ep\":\"") //
                        .append(registration.getEndpoint()) //
                        .append("\",\"kind\":\"single\"") //
```

### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `leshan-server-demo/src/main/java/org/eclipse/leshan/server/demo/servlet/EventServlet.java`
#### Snippet
```java
        @Override
        public void onSleeping(Registration registration) {
            String data = new StringBuilder("{\"ep\":\"").append(registration.getEndpoint()).append("\"}").toString();

            sendEvent(EVENT_SLEEPING, data, registration.getEndpoint());
```

## RuleId[id=UnnecessaryReturn]
### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/engine/DefaultRegistrationEngine.java`
#### Snippet
```java
            registerFuture = schedExecutor.submit(new RegistrationTask(dmServer));
        }
        return;
    }

```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/send/SendResource.java`
#### Snippet
```java
                exchange.respond(toCoapResponseCode(response.getCode()));
                sendableResponse.sent();
                return;
            } else {
                exchange.respond(toCoapResponseCode(response.getCode()), response.getErrorMessage());
```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/send/SendResource.java`
#### Snippet
```java
                exchange.respond(toCoapResponseCode(response.getCode()), response.getErrorMessage());
                sendableResponse.sent();
                return;
            }
        } catch (CodecException e) {
```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/send/SendResource.java`
#### Snippet
```java
                    new InvalidRequestException(e, "Invalid payload in [%s] from [%s]", coapRequest, sender),
                    SendRequest.class, exchange.advanced().getEndpoint().getUri());
            return;
        } catch (RuntimeException e) {
            receiver.onError(sender, clientProfile, e, SendRequest.class, exchange.advanced().getEndpoint().getUri());
```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `leshan-client-cf/src/main/java/org/eclipse/leshan/client/californium/RootResource.java`
#### Snippet
```java
            if (response.getCode().isError()) {
                exchange.respond(toCoapResponseCode(response.getCode()), response.getErrorMessage());
                return;
            } else {
                exchange.respond(toCoapResponseCode(response.getCode()), toolbox.getEncoder()
```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `leshan-client-cf/src/main/java/org/eclipse/leshan/client/californium/RootResource.java`
#### Snippet
```java
                        .encodeNodes(response.getContent(), responseContentFormat, toolbox.getModel()),
                        responseContentFormat.getCode());
                return;
            }
        } else {
```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `leshan-client-cf/src/main/java/org/eclipse/leshan/client/californium/RootResource.java`
#### Snippet
```java
                        responseContentFormat.getCode());
            }
            return;
        }
    }
```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `leshan-client-cf/src/main/java/org/eclipse/leshan/client/californium/RootResource.java`
#### Snippet
```java
                    MediaTypeRegistry.APPLICATION_LINK_FORMAT);
        }
        return;
    }

```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `leshan-client-cf/src/main/java/org/eclipse/leshan/client/californium/RootResource.java`
#### Snippet
```java
            exchange.respond(toCoapResponseCode(response.getCode()));
        }
        return;
    }

```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/registration/RegisterResource.java`
#### Snippet
```java
        if (uri.size() == 1) {
            handleRegister(exchange, request);
            return;
        } else if (uri.size() == 2) {
            handleUpdate(exchange, request, uri.get(1));
```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/registration/RegisterResource.java`
#### Snippet
```java
        } else if (uri.size() == 2) {
            handleUpdate(exchange, request, uri.get(1));
            return;
        } else {
            handleInvalidRequest(exchange, "Bad URI");
```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/registration/RegisterResource.java`
#### Snippet
```java
        } else {
            handleInvalidRequest(exchange, "Bad URI");
            return;
        }
    }
```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `leshan-client-cf/src/main/java/org/eclipse/leshan/client/californium/object/ObjectResource.java`
#### Snippet
```java
                    exchange.setLocationPath(response.getLocation());
                exchange.respond(toCoapResponseCode(response.getCode()));
                return;
            } else {
                exchange.respond(toCoapResponseCode(response.getCode()), response.getErrorMessage());
```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `leshan-client-cf/src/main/java/org/eclipse/leshan/client/californium/object/ObjectResource.java`
#### Snippet
```java
            } else {
                exchange.respond(toCoapResponseCode(response.getCode()), response.getErrorMessage());
                return;
            }
        } catch (CodecException e) {
```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `leshan-client-cf/src/main/java/org/eclipse/leshan/client/californium/object/ObjectResource.java`
#### Snippet
```java
        } catch (CodecException e) {
            handleInvalidRequest(exchange.advanced(), "Unable to decode payload on CREATE", e);
            return;
        }
    }
```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `leshan-client-cf/src/main/java/org/eclipse/leshan/client/californium/object/ObjectResource.java`
#### Snippet
```java
                            MediaTypeRegistry.APPLICATION_LINK_FORMAT);
                }
                return;
            } else {
                // Manage Discover Request
```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `leshan-client-cf/src/main/java/org/eclipse/leshan/client/californium/object/ObjectResource.java`
#### Snippet
```java
                            MediaTypeRegistry.APPLICATION_LINK_FORMAT);
                }
                return;
            }
        } else {
```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `leshan-client-cf/src/main/java/org/eclipse/leshan/client/californium/object/ObjectResource.java`
#### Snippet
```java
                    exchange.respond(ResponseCode.CONTENT,
                            toolbox.getEncoder().encode(content, format, path, toolbox.getModel()), format.getCode());
                    return;
                } else {
                    exchange.respond(toCoapResponseCode(response.getCode()), response.getErrorMessage());
```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `leshan-client-cf/src/main/java/org/eclipse/leshan/client/californium/object/ObjectResource.java`
#### Snippet
```java
                } else {
                    exchange.respond(toCoapResponseCode(response.getCode()), response.getErrorMessage());
                    return;
                }
            } else {
```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `leshan-client-cf/src/main/java/org/eclipse/leshan/client/californium/object/ObjectResource.java`
#### Snippet
```java
                                toolbox.getEncoder().encode(content, format, path, toolbox.getModel()),
                                format.getCode());
                        return;
                    } else {
                        exchange.respond(toCoapResponseCode(response.getCode()), response.getErrorMessage());
```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `leshan-client-cf/src/main/java/org/eclipse/leshan/client/californium/object/ObjectResource.java`
#### Snippet
```java
                    } else {
                        exchange.respond(toCoapResponseCode(response.getCode()), response.getErrorMessage());
                        return;
                    }
                } else {
```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `leshan-client-cf/src/main/java/org/eclipse/leshan/client/californium/object/ObjectResource.java`
#### Snippet
```java
                                toolbox.getEncoder().encode(content, format, path, toolbox.getModel()),
                                format.getCode());
                        return;
                    } else {
                        exchange.respond(toCoapResponseCode(response.getCode()), response.getErrorMessage());
```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `leshan-client-cf/src/main/java/org/eclipse/leshan/client/californium/object/ObjectResource.java`
#### Snippet
```java
                    } else {
                        exchange.respond(toCoapResponseCode(response.getCode()), response.getErrorMessage());
                        return;
                    }
                }
```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `leshan-client-cf/src/main/java/org/eclipse/leshan/client/californium/object/ObjectResource.java`
#### Snippet
```java
                coapExchange.respond(toCoapResponseCode(response.getCode()));
            }
            return;
        }
        // Manage Write and Bootstrap Write Request (replace)
```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `leshan-client-cf/src/main/java/org/eclipse/leshan/client/californium/object/ObjectResource.java`
#### Snippet
```java
                }

                return;
            } catch (CodecException e) {
                handleInvalidRequest(coapExchange.advanced(), "Unable to decode payload on WRITE", e);
```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `leshan-client-cf/src/main/java/org/eclipse/leshan/client/californium/object/ObjectResource.java`
#### Snippet
```java
            } catch (CodecException e) {
                handleInvalidRequest(coapExchange.advanced(), "Unable to decode payload on WRITE", e);
                return;
            }

```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `leshan-server-demo/src/main/java/org/eclipse/leshan/server/demo/servlet/ObjectSpecServlet.java`
#### Snippet
```java
            throw new ServletException(e);
        }
        return;

    }
```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `leshan-server-demo/src/main/java/org/eclipse/leshan/server/demo/servlet/ClientServlet.java`
#### Snippet
```java
                handleException(e, resp);
            }
            return;
        }
    }
```

## RuleId[id=SimplifiableConditionalExpression]
### SimplifiableConditionalExpression
`queueMode == null ? false : queueMode` can be simplified to 'queueMode!=null \&\& queueMode'
in `leshan-core/src/main/java/org/eclipse/leshan/core/request/RegisterRequest.java`
#### Snippet
```java
                this.queueMode = null;
        } else {
            this.queueMode = queueMode == null ? false : queueMode;
        }

```

## RuleId[id=NumberEquality]
### NumberEquality
Number objects are compared using `!=`, not 'equals()'
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/resource/BaseInstanceEnablerFactory.java`
#### Snippet
```java
        } else {
            // check id is well set
            if (instance.getId() != id) {
                throw new IllegalStateException(
                        String.format("instance id should be %d but was %d", id, instance.getId()));
```

### NumberEquality
Number objects are compared using `!=`, not 'equals()'
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2m.java`
#### Snippet
```java
        @Override
        public int compareTo(Version other) {
            if (major != other.major)
                return major - other.major;

```

### NumberEquality
Number objects are compared using `==`, not 'equals()'
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/LwM2mPath.java`
#### Snippet
```java

    private int compareInteger(Integer i1, Integer i2) {
        if (i1 == i2) {
            return 0;
        } else if (i1 == null) {
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/request/DownlinkRequestSender.java`
#### Snippet
```java
     * @param lowerLayerConfig to tweak lower layer request (e.g. coap request)
     * @param timeoutInMs The global timeout to wait in milliseconds (see
     *        https://github.com/eclipse/leshan/wiki/Request-Timeout)
     * @param responseCallback a callback called when a response is received (successful or error response). This
     *        callback MUST NOT be null.
```

### JavadocLinkAsPlainText
Link specified as plain text
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/request/DownlinkRequestSender.java`
#### Snippet
```java
     *        <li>{@link ClientSleepingException} if client is currently sleeping.</li>
     *        <li>{@link TimeoutException} if the timeout expires (see
     *        https://github.com/eclipse/leshan/wiki/Request-Timeout).</li>
     *        <li>or any other RuntimeException for unexpected issue.
     *        </ul>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/request/DownlinkRequestSender.java`
#### Snippet
```java
     * @param lowerLayerConfig to tweak lower layer request (e.g. coap request)
     * @param timeoutInMs The global timeout to wait in milliseconds (see
     *        https://github.com/eclipse/leshan/wiki/Request-Timeout)
     * @param <T> The expected type of the response received.
     * @return the LWM2M response. The response can be <code>null</code> if the timeout expires (see
```

### JavadocLinkAsPlainText
Link specified as plain text
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/request/DownlinkRequestSender.java`
#### Snippet
```java
     * @param <T> The expected type of the response received.
     * @return the LWM2M response. The response can be <code>null</code> if the timeout expires (see
     *         https://github.com/eclipse/leshan/wiki/Request-Timeout).
     *
     * @throws CodecException if request payload can not be encoded.
```

### JavadocLinkAsPlainText
Link specified as plain text
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/request/DefaultDownlinkRequestSender.java`
#### Snippet
```java
     * @param lowerLayerConfig to tweak lower layer request (e.g. coap request)
     * @param timeoutInMs The global timeout to wait in milliseconds (see
     *        https://github.com/eclipse/leshan/wiki/Request-Timeout)
     * @return the LWM2M response. The response can be <code>null</code> if the timeout expires (see
     *         https://github.com/eclipse/leshan/wiki/Request-Timeout).
```

### JavadocLinkAsPlainText
Link specified as plain text
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/request/DefaultDownlinkRequestSender.java`
#### Snippet
```java
     *        https://github.com/eclipse/leshan/wiki/Request-Timeout)
     * @return the LWM2M response. The response can be <code>null</code> if the timeout expires (see
     *         https://github.com/eclipse/leshan/wiki/Request-Timeout).
     *
     * @throws CodecException if request payload can not be encoded.
```

### JavadocLinkAsPlainText
Link specified as plain text
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/request/DefaultDownlinkRequestSender.java`
#### Snippet
```java
     * @param lowerLayerConfig to tweak lower layer request (e.g. coap request)
     * @param timeoutInMs The global timeout to wait in milliseconds (see
     *        https://github.com/eclipse/leshan/wiki/Request-Timeout)
     * @param responseCallback a callback called when a response is received (successful or error response). This
     *        callback MUST NOT be null.
```

### JavadocLinkAsPlainText
Link specified as plain text
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/request/DefaultDownlinkRequestSender.java`
#### Snippet
```java
     *        <li>{@link UnconnectedPeerException} if client is not connected (no dtls connection available).</li>
     *        <li>{@link TimeoutException} if the timeout expires (see
     *        https://github.com/eclipse/leshan/wiki/Request-Timeout).</li>
     *        <li>or any other RuntimeException for unexpected issue.
     *        </ul>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/LeshanServer.java`
#### Snippet
```java
     * @param request The request to send to the client.
     * @param timeoutInMs The global timeout to wait in milliseconds (see
     *        https://github.com/eclipse/leshan/wiki/Request-Timeout)
     * @param responseCallback a callback called when a response is received (successful or error response). This
     *        callback MUST NOT be null.
```

### JavadocLinkAsPlainText
Link specified as plain text
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/LeshanServer.java`
#### Snippet
```java
     *        <li>{@link ClientSleepingException} if client is currently sleeping.</li>
     *        <li>{@link TimeoutException} if the timeout expires (see
     *        https://github.com/eclipse/leshan/wiki/Request-Timeout).</li>
     *        <li>or any other RuntimeException for unexpected issue.
     *        </ul>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/LeshanServer.java`
#### Snippet
```java
     * @param lowerLayerConfig to tweak lower layer request (e.g. coap request)
     * @param timeoutInMs The global timeout to wait in milliseconds (see
     *        https://github.com/eclipse/leshan/wiki/Request-Timeout)
     * @param responseCallback a callback called when a response is received (successful or error response). This
     *        callback MUST NOT be null.
```

### JavadocLinkAsPlainText
Link specified as plain text
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/LeshanServer.java`
#### Snippet
```java
     *        <li>{@link ClientSleepingException} if client is currently sleeping.</li>
     *        <li>{@link TimeoutException} if the timeout expires (see
     *        https://github.com/eclipse/leshan/wiki/Request-Timeout).</li>
     *        <li>or any other RuntimeException for unexpected issue.
     *        </ul>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/LeshanServer.java`
#### Snippet
```java
     * @param request The request to send to the client.
     * @param timeoutInMs The global timeout to wait in milliseconds (see
     *        https://github.com/eclipse/leshan/wiki/Request-Timeout)
     * @return the LWM2M response. The response can be <code>null</code> if the timeout expires (see
     *         https://github.com/eclipse/leshan/wiki/Request-Timeout).
```

### JavadocLinkAsPlainText
Link specified as plain text
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/LeshanServer.java`
#### Snippet
```java
     *        https://github.com/eclipse/leshan/wiki/Request-Timeout)
     * @return the LWM2M response. The response can be <code>null</code> if the timeout expires (see
     *         https://github.com/eclipse/leshan/wiki/Request-Timeout).
     *
     * @throws CodecException if request payload can not be encoded.
```

### JavadocLinkAsPlainText
Link specified as plain text
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/LeshanServer.java`
#### Snippet
```java
     *        <li>{@link ClientSleepingException} if client is currently sleeping.</li>
     *        <li>{@link TimeoutException} if the timeout expires (see
     *        https://github.com/eclipse/leshan/wiki/Request-Timeout).</li>
     *        <li>or any other RuntimeException for unexpected issue.
     *        </ul>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/LeshanServer.java`
#### Snippet
```java
     * @param lowerLayerConfig to tweak lower layer request (e.g. coap request)
     * @param timeoutInMs The global timeout to wait in milliseconds (see
     *        https://github.com/eclipse/leshan/wiki/Request-Timeout)
     * @return the LWM2M response. The response can be <code>null</code> if the timeout expires (see
     *         https://github.com/eclipse/leshan/wiki/Request-Timeout).
```

### JavadocLinkAsPlainText
Link specified as plain text
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/LeshanServer.java`
#### Snippet
```java
     *        https://github.com/eclipse/leshan/wiki/Request-Timeout)
     * @return the LWM2M response. The response can be <code>null</code> if the timeout expires (see
     *         https://github.com/eclipse/leshan/wiki/Request-Timeout).
     *
     * @throws CodecException if request payload can not be encoded.
```

### JavadocLinkAsPlainText
Link specified as plain text
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/LeshanServer.java`
#### Snippet
```java
     * @param request The request to send to the client.
     * @return the LWM2M response. The response can be <code>null</code> if the timeout expires (see
     *         https://github.com/eclipse/leshan/wiki/Request-Timeout).
     *
     * @throws CodecException if request payload can not be encoded.
```

### JavadocLinkAsPlainText
Link specified as plain text
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/bootstrap/BootstrapConfig.java`
#### Snippet
```java
     * <p>
     * WARNING BootstrapConfig support OSCORE object since version 2.0 :
     * https://github.com/OpenMobileAlliance/OMA_LwM2M_for_Developers/issues/521
     * <p>
     * This LwM2M Object provides the keying material and related information of a LwM2M Client appropriate to access a
```

### JavadocLinkAsPlainText
Link specified as plain text
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/bootstrap/BootstrapConfig.java`
#### Snippet
```java
         * When this resource is present it instructs the TLS/DTLS client to propose the indicated ciphersuite(s) in the
         * ClientHello of the handshake. A ciphersuite is indicated as a 32-bit integer value. The IANA TLS ciphersuite
         * registry is maintained at https://www.iana.org/assignments/tls-parameters/tls-parameters.xhtml. As an
         * example, the TLS_PSK_WITH_AES_128_CCM_8 ciphersuite is represented with the following string "0xC0,0xA8". To
         * form an integer value the two values are concatenated. In this example, the value is 0xc0a8 or 49320.
```

### JavadocLinkAsPlainText
Link specified as plain text
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/bootstrap/LwM2mBootstrapRequestSender.java`
#### Snippet
```java
     * @param request The request to send to the client.
     * @param timeoutInMs The global timeout to wait in milliseconds (see
     *        https://github.com/eclipse/leshan/wiki/Request-Timeout)
     * @param responseCallback a callback called when a response is received (successful or error response). This
     *        callback MUST NOT be null.
```

### JavadocLinkAsPlainText
Link specified as plain text
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/bootstrap/LwM2mBootstrapRequestSender.java`
#### Snippet
```java
     *        <li>{@link InvalidResponseException} if the response received is malformed.</li>
     *        <li>{@link TimeoutException} if the timeout expires (see
     *        https://github.com/eclipse/leshan/wiki/Request-Timeout).</li>
     *        <li>or any other RuntimeException for unexpected issue.
     *        </ul>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/bootstrap/LwM2mBootstrapRequestSender.java`
#### Snippet
```java
     * @param request The request to send to the client.
     * @param timeoutInMs The global timeout to wait in milliseconds (see
     *        https://github.com/eclipse/leshan/wiki/Request-Timeout)
     * @param <T> The expected type of the response received.
     * @return the LWM2M response. The response can be <code>null</code> if the timeout expires (see
```

### JavadocLinkAsPlainText
Link specified as plain text
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/bootstrap/LwM2mBootstrapRequestSender.java`
#### Snippet
```java
     * @param <T> The expected type of the response received.
     * @return the LWM2M response. The response can be <code>null</code> if the timeout expires (see
     *         https://github.com/eclipse/leshan/wiki/Request-Timeout).
     *
     * @throws CodecException if request payload can not be encoded.
```

### JavadocLinkAsPlainText
Link specified as plain text
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/bootstrap/request/BootstrapDownlinkRequestSender.java`
#### Snippet
```java
     * @param request The request to send to the client.
     * @param timeoutInMs The global timeout to wait in milliseconds (see
     *        https://github.com/eclipse/leshan/wiki/Request-Timeout)
     * @param responseCallback a callback called when a response is received (successful or error response). This
     *        callback MUST NOT be null.
```

### JavadocLinkAsPlainText
Link specified as plain text
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/bootstrap/request/BootstrapDownlinkRequestSender.java`
#### Snippet
```java
     *        <li>{@link ClientSleepingException} if client is currently sleeping.</li>
     *        <li>{@link TimeoutException} if the timeout expires (see
     *        https://github.com/eclipse/leshan/wiki/Request-Timeout).</li>
     *        <li>or any other RuntimeException for unexpected issue.
     *        </ul>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/bootstrap/request/BootstrapDownlinkRequestSender.java`
#### Snippet
```java
     * @param request The request to send to the client.
     * @param timeoutInMs The global timeout to wait in milliseconds (see
     *        https://github.com/eclipse/leshan/wiki/Request-Timeout)
     * @param <T> The expected type of the response received.
     * @return the LWM2M response. The response can be <code>null</code> if the timeout expires (see
```

### JavadocLinkAsPlainText
Link specified as plain text
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/bootstrap/request/BootstrapDownlinkRequestSender.java`
#### Snippet
```java
     * @param <T> The expected type of the response received.
     * @return the LWM2M response. The response can be <code>null</code> if the timeout expires (see
     *         https://github.com/eclipse/leshan/wiki/Request-Timeout).
     *
     * @throws CodecException if request payload can not be encoded.
```

### JavadocLinkAsPlainText
Link specified as plain text
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/send/SendService.java`
#### Snippet
```java
     * @param paths the list of LWM2M node path to send.
     * @param timeoutInMs The global timeout to wait in milliseconds (see
     *        https://github.com/eclipse/leshan/wiki/Request-Timeout)
     * @param responseCallback a callback called when a response is received (successful or error response). This
     *        callback MUST NOT be null.
```

### JavadocLinkAsPlainText
Link specified as plain text
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/send/SendService.java`
#### Snippet
```java
     *        <li>{@link UnconnectedPeerException} if client is not connected (no dtls connection available).</li>
     *        <li>{@link TimeoutException} if the timeout expires (see
     *        https://github.com/eclipse/leshan/wiki/Request-Timeout).</li>
     *        <li>or any other RuntimeException for unexpected issue.
     *        </ul>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/send/SendService.java`
#### Snippet
```java
     * @param paths the list of LWM2M node path to send.
     * @param timeoutInMs The global timeout to wait in milliseconds (see
     *        https://github.com/eclipse/leshan/wiki/Request-Timeout)
     * @return the LWM2M response. The response can be <code>null</code> if the timeout expires (see
     *         https://github.com/eclipse/leshan/wiki/Request-Timeout).
```

### JavadocLinkAsPlainText
Link specified as plain text
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/send/SendService.java`
#### Snippet
```java
     *        https://github.com/eclipse/leshan/wiki/Request-Timeout)
     * @return the LWM2M response. The response can be <code>null</code> if the timeout expires (see
     *         https://github.com/eclipse/leshan/wiki/Request-Timeout).
     *
     * @throws InterruptedException if the thread was interrupted.
```

### JavadocLinkAsPlainText
Link specified as plain text
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/registration/Registration.java`
#### Snippet
```java
     * @return URI of the server endpoint used by client to register.
     *         <p>
     *         This can be changed in next milestones : https://github.com/eclipse/leshan/issues/1415
     */
    public URI getLastEndpointUsed() {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/object/Oscore.java`
#### Snippet
```java
 * for recipientId, SenderId, MasterKey, MasterSalt.
 * <p>
 * See for more details : https://github.com/OpenMobileAlliance/OMA_LwM2M_for_Developers/issues/521
 */
public class Oscore extends BaseInstanceEnabler {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/request/UplinkRequestSender.java`
#### Snippet
```java
     * @param request The request to send to the client.
     * @param timeoutInMs The global timeout to wait in milliseconds (see
     *        https://github.com/eclipse/leshan/wiki/Request-Timeout)
     * @param responseCallback a callback called when a response is received (successful or error response). This
     *        callback MUST NOT be null.
```

### JavadocLinkAsPlainText
Link specified as plain text
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/request/UplinkRequestSender.java`
#### Snippet
```java
     *        <li>{@link ClientSleepingException} if client is currently sleeping.</li>
     *        <li>{@link TimeoutException} if the timeout expires (see
     *        https://github.com/eclipse/leshan/wiki/Request-Timeout).</li>
     *        <li>or any other RuntimeException for unexpected issue.
     *        </ul>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/request/UplinkRequestSender.java`
#### Snippet
```java
     * @param request The request to send to the client.
     * @param timeoutInMs The global timeout to wait in milliseconds (see
     *        https://github.com/eclipse/leshan/wiki/Request-Timeout)
     * @param <T> The expected type of the response received.
     * @return the LWM2M response. The response can be <code>null</code> if the timeout expires (see
```

### JavadocLinkAsPlainText
Link specified as plain text
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/request/UplinkRequestSender.java`
#### Snippet
```java
     * @param <T> The expected type of the response received.
     * @return the LWM2M response. The response can be <code>null</code> if the timeout expires (see
     *         https://github.com/eclipse/leshan/wiki/Request-Timeout).
     *
     * @throws CodecException if request payload can not be encoded.
```

### JavadocLinkAsPlainText
Link specified as plain text
in `leshan-core-cf/src/main/java/org/eclipse/leshan/core/californium/SyncRequestObserver.java`
#### Snippet
```java
     *
     * @return the LWM2M response. The response can be <code>null</code> if the timeout expires (see
     *         https://github.com/eclipse/leshan/wiki/Request-Timeout).
     *
     * @throws InterruptedException if the thread was interrupted.
```

### JavadocLinkAsPlainText
Link specified as plain text
in `leshan-core-cf/src/main/java/org/eclipse/leshan/core/californium/AsyncRequestObserver.java`
#### Snippet
```java
     * @param errorCallback This is called when an error happens. This MUST NOT be null.
     * @param timeoutInMs A response timeout(in millisecond) which is raised if neither a response or error happens (see
     *        https://github.com/eclipse/leshan/wiki/Request-Timeout).
     * @param executor used to scheduled timeout tasks.
     */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `leshan-core-cf/src/main/java/org/eclipse/leshan/core/californium/oscore/cf/OscoreStore.java`
#### Snippet
```java
 * A store holding OSCORE pre-established inputs which will be used to derive security context.
 * <p>
 * See : https://datatracker.ietf.org/doc/html/rfc8613#section-3.2
 *
 */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `leshan-core-cf/src/main/java/org/eclipse/leshan/core/californium/CoapSyncRequestObserver.java`
#### Snippet
```java
     *
     * @return the CoAP response. The response can be <code>null</code> if the timeout expires (see
     *         https://github.com/eclipse/leshan/wiki/Request-Timeout).
     *
     * @throws InterruptedException if the thread was interrupted.
```

### JavadocLinkAsPlainText
Link specified as plain text
in `leshan-core-cf/src/main/java/org/eclipse/leshan/core/californium/CoapSyncRequestObserver.java`
#### Snippet
```java
     * @param coapRequest The CoAP request to observe.
     * @param timeoutInMs A response timeout(in millisecond) which is raised if neither a response or error happens (see
     *        https://github.com/eclipse/leshan/wiki/Request-Timeout).
     */
    public CoapSyncRequestObserver(Request coapRequest, long timeoutInMs, ExceptionTranslator exceptionTranslator) {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `leshan-core-cf/src/main/java/org/eclipse/leshan/core/californium/oscore/cf/OscoreParameters.java`
#### Snippet
```java
 * OSCORE Parameters.
 * <p>
 * See : https://datatracker.ietf.org/doc/html/rfc8613#section-3.2
 */
public class OscoreParameters {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `leshan-core-cf/src/main/java/org/eclipse/leshan/core/californium/CoapAsyncRequestObserver.java`
#### Snippet
```java
     * @param errorCallback This is called when an error happens. This MUST NOT be null.
     * @param timeoutInMs A response timeout(in millisecond) which is raised if neither a response or error happens (see
     *        https://github.com/eclipse/leshan/wiki/Request-Timeout).
     * @param executor used to scheduled timeout tasks.
     */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `leshan-core-demo/src/main/java/org/eclipse/leshan/core/demo/cli/interactive/JLineInteractiveCommands.java`
#### Snippet
```java
     * A convenience method to write a formatted string to this writer using the specified format string and arguments.
     * <p>
     * This function support ANSI color tag, see https://picocli.info/#_usage_help_with_styles_and_colors
     * <p>
     * See {@link PrintWriter#printf(String, Object...)}
```

### JavadocLinkAsPlainText
Link specified as plain text
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/DefaultLinkSerializer.java`
#### Snippet
```java

    /***
     * Serialize severals {@code Link} to {@code String} as defined in http://tools.ietf.org/html/rfc6690.
     *
     * @param linkObjects links to serialize.
```

### JavadocLinkAsPlainText
Link specified as plain text
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/DefaultLinkSerializer.java`
#### Snippet
```java
     * @param linkObjects links to serialize.
     *
     * @return a {@code String} representation like defined in http://tools.ietf.org/html/rfc6690. If LinkObjects is
     *         empty return an empty {@code String};
     */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/DefaultLinkSerializer.java`
#### Snippet
```java

/**
 * A Link as defined in http://tools.ietf.org/html/rfc6690.
 */
public class DefaultLinkSerializer implements LinkSerializer {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/LinkSerializer.java`
#### Snippet
```java
 * <p>
 * Serializer will serialize links {@link Link} in format defined in
 * https://datatracker.ietf.org/doc/html/RFC6690#section-2
 */
public interface LinkSerializer {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/LinkParser.java`
#### Snippet
```java
 * A CoRE Link parser interface.
 * <p>
 * Parser should implement rules defined in https://datatracker.ietf.org/doc/html/RFC6690#section-2
 */
public interface LinkParser {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/Link.java`
#### Snippet
```java

/**
 * A Link as defined in http://tools.ietf.org/html/rfc6690.
 */
public class Link {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/DefaultLinkParser.java`
#### Snippet
```java

/**
 * A Link as defined in http://tools.ietf.org/html/rfc6690.
 */
public class DefaultLinkParser implements LinkParser {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/DefaultLinkParser.java`
#### Snippet
```java

    /**
     * consume URI-Reference with rules (subset of RFC3986 (https://datatracker.ietf.org/doc/html/rfc3986#appendix-A)):
     *
     * <pre>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/DefaultLinkParser.java`
#### Snippet
```java
    /**
     * consume a segment/segment-nz with rules (subset of RFC3986
     * (https://datatracker.ietf.org/doc/html/rfc3986#appendix-A)):
     *
     * <pre>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/DefaultLinkParser.java`
#### Snippet
```java

    /**
     * consume a link-value with rules (subset of RFC6690 (https://datatracker.ietf.org/doc/html/RFC6690#section-2)):
     *
     * <pre>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/DefaultLinkParser.java`
#### Snippet
```java
    /**
     * Parse a byte arrays representation of a {@code String} encoding with UTF_8 {@link Charset} with rules (subset of
     * RFC6690 (https://datatracker.ietf.org/doc/html/RFC6690#section-2)):
     *
     * <pre>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/DefaultLinkParser.java`
#### Snippet
```java

    /**
     * consume parmname as defined in RFC5987 (https://datatracker.ietf.org/doc/html/rfc5987#section-3.2.1):
     *
     * <pre>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/lwm2m/attributes/StringAttributeModel.java`
#### Snippet
```java
    /**
     *
     * Validate a quoted-string from https://datatracker.ietf.org/doc/html/rfc2616#section-2.2:
     *
     * <pre>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/lwm2m/attributes/ObjectVersionAttributeModel.java`
#### Snippet
```java
/**
 * Object Version Attribute model as defined at
 * http://www.openmobilealliance.org/release/LightweightM2M/V1_1_1-20190617-A/HTML-Version/OMA-TS-LightweightM2M_Core-V1_1_1-20190617-A.html#Table-512-1-lessPROPERTIESgreater-Class-Attributes
 */
public class ObjectVersionAttributeModel extends LwM2mAttributeModel<Version> {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/attributes/DefaultAttributeParser.java`
#### Snippet
```java

    /**
     * consume Attribute as defined in RFC6690 (https://datatracker.ietf.org/doc/html/RFC6690#section-2):
     *
     * <pre>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/attributes/QuotedStringAttribute.java`
#### Snippet
```java
    /**
     * Validate a quoted-string with rules (subset of RFC2616
     * (https://datatracker.ietf.org/doc/html/rfc2616#section-2.2)):
     *
     * <pre>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/attributes/Attribute.java`
#### Snippet
```java
 * A key/value pair that describes the link or its target.
 * <p>
 * See https://datatracker.ietf.org/doc/html/rfc6690#section-1.3
 */
public interface Attribute {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/attributes/ContentFormatAttribute.java`
#### Snippet
```java
         * Consume a 'ct' attribute value as described in :
         * <ul>
         * <li>https://datatracker.ietf.org/doc/html/rfc7252#section-7.2.1</li>
         * <li>https://datatracker.ietf.org/doc/html/rfc6690#section-2</li>
         * </ul>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/attributes/ContentFormatAttribute.java`
#### Snippet
```java
         * <ul>
         * <li>https://datatracker.ietf.org/doc/html/rfc7252#section-7.2.1</li>
         * <li>https://datatracker.ietf.org/doc/html/rfc6690#section-2</li>
         * </ul>
         * Grammar:
```

### JavadocLinkAsPlainText
Link specified as plain text
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/attributes/ContentFormatAttribute.java`
#### Snippet
```java

/**
 * A ContentFormat Attribute as defined in https://datatracker.ietf.org/doc/html/rfc7252#section-7.2.1
 */
public class ContentFormatAttribute extends BaseAttribute {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/attributes/UnquotedStringAttribute.java`
#### Snippet
```java

    /**
     * Validate ptoken with rules (subset of RFC6690 (https://datatracker.ietf.org/doc/html/RFC6690#section-2)):
     *
     * <pre>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/attributes/ResourceTypeAttribute.java`
#### Snippet
```java

/**
 * A Resource Type attribute as described at https://datatracker.ietf.org/doc/html/rfc6690#section-3.1
 */
public class ResourceTypeAttribute extends BaseAttribute {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/attributes/ResourceTypeAttribute.java`
#### Snippet
```java

        /**
         * Consume relation-type as described in https://datatracker.ietf.org/doc/html/rfc6690#section-2.
         * <p>
         * OFFICIAL Grammar:
```

### JavadocLinkAsPlainText
Link specified as plain text
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/attributes/ResourceTypeAttribute.java`
#### Snippet
```java

        /**
         * Consume a 'rt' attribute value as described in https://datatracker.ietf.org/doc/html/rfc6690#section-2.
         * <p>
         * Grammar:
```

### JavadocLinkAsPlainText
Link specified as plain text
in `leshan-core/src/main/java/org/eclipse/leshan/core/oscore/HkdfAlgorithm.java`
#### Snippet
```java

/**
 * Some utility method about code HKDF Algoritm as defined at https://datatracker.ietf.org/doc/html/rfc8152#section-11.1
 * and https://datatracker.ietf.org/doc/html/rfc8152#section-12.1.2
 */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `leshan-core/src/main/java/org/eclipse/leshan/core/oscore/HkdfAlgorithm.java`
#### Snippet
```java
/**
 * Some utility method about code HKDF Algoritm as defined at https://datatracker.ietf.org/doc/html/rfc8152#section-11.1
 * and https://datatracker.ietf.org/doc/html/rfc8152#section-12.1.2
 */
public class HkdfAlgorithm implements Serializable {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `leshan-core/src/main/java/org/eclipse/leshan/core/oscore/OscoreSetting.java`
#### Snippet
```java
 * OSCORE Settings.
 * <p>
 * See : https://datatracker.ietf.org/doc/html/rfc8613#section-3.2
 */
public class OscoreSetting implements Serializable {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `leshan-core/src/main/java/org/eclipse/leshan/core/oscore/AeadAlgorithm.java`
#### Snippet
```java

/**
 * Some utility method about code AEAD Algoritm as defined at https://datatracker.ietf.org/doc/html/rfc8152#section-10
 */
public class AeadAlgorithm implements Serializable {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `leshan-core/src/main/java/org/eclipse/leshan/core/parser/StringParser.java`
#### Snippet
```java

    /**
     * HEXDIG as defined at https://datatracker.ietf.org/doc/html/rfc2234#section-6.1
     *
     * <pre>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `leshan-core/src/main/java/org/eclipse/leshan/core/parser/StringParser.java`
#### Snippet
```java

    /**
     * LOALPHA as defined at https://datatracker.ietf.org/doc/html/rfc6690#section-2
     *
     * <pre>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `leshan-core/src/main/java/org/eclipse/leshan/core/parser/StringParser.java`
#### Snippet
```java

    /**
     * Consume cardinal as described at https://datatracker.ietf.org/doc/html/rfc6690#section-2
     *
     * <pre>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `leshan-core/src/main/java/org/eclipse/leshan/core/parser/StringParser.java`
#### Snippet
```java

    /**
     * ALPHA as defined at https://datatracker.ietf.org/doc/html/rfc2234#section-6.1
     *
     * <pre>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `leshan-core/src/main/java/org/eclipse/leshan/core/parser/StringParser.java`
#### Snippet
```java

    /**
     * DIGIT as defined at https://datatracker.ietf.org/doc/html/rfc2234#section-6.1
     *
     * <pre>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `leshan-core/src/main/java/org/eclipse/leshan/core/request/exception/TimeoutException.java`
#### Snippet
```java
     * Get the kind of timeout.
     * <p>
     * See https://github.com/eclipse/leshan/wiki/Request-Timeout for more details.
     * <p>
     * Current implementation is not able to make differences between CoAP and Blockwise timeout, all is regroup over
```

### JavadocLinkAsPlainText
Link specified as plain text
in `leshan-server-redis/src/main/java/org/eclipse/leshan/server/redis/RedisLock.java`
#### Snippet
```java
/**
 * Utility class providing locking methods based on the Redis SETNX primitive (see
 * http://redis.io/topics/distlock#correct-implementation-with-a-single-instance for more information).
 *
 * @deprecated use a {@link SingleInstanceJedisLock} instead or any {@link JedisLock} implementation.
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/LeshanClient.java`
#### Snippet
```java

    private final LwM2mObjectTree objectTree;
    private final BootstrapHandler bootstrapHandler;
    private final LwM2mRootEnabler rootEnabler;
    private final RegistrationEngine engine;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/LeshanClient.java`
#### Snippet
```java
    private final LwM2mObjectTree objectTree;
    private final BootstrapHandler bootstrapHandler;
    private final LwM2mRootEnabler rootEnabler;
    private final RegistrationEngine engine;
    private final LwM2mClientObserverDispatcher observers;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/LeshanClient.java`
#### Snippet
```java
    private final LwM2mClientEndpointsProvider endpointsProvider;
    private final EndpointsManager endpointsManager;
    private final UplinkRequestSender requestSender;

    private final LwM2mObjectTree objectTree;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `leshan-bsserver-demo/src/main/java/org/eclipse/leshan/server/bootstrap/demo/servlet/EventServlet.java`
#### Snippet
```java
    }

    private final BootstrapSessionListener sessionListener = new BootstrapSessionListener() {

        @Override
```

### FieldCanBeLocal
Field can be converted to a local variable
in `leshan-core/src/main/java/org/eclipse/leshan/core/model/DefaultDDFFileValidator.java`
#### Snippet
```java
public class DefaultDDFFileValidator implements DDFFileValidator {
    private static String LWM2M_V1_0_SCHEMA_PATH = "/schemas/LWM2M.xsd";
    private static String LWM2M_V1_1_SCHEMA_PATH = "/schemas/LWM2M-v1_1.xsd";

    private final String schema;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `leshan-core/src/main/java/org/eclipse/leshan/core/model/DefaultDDFFileValidator.java`
#### Snippet
```java

public class DefaultDDFFileValidator implements DDFFileValidator {
    private static String LWM2M_V1_0_SCHEMA_PATH = "/schemas/LWM2M.xsd";
    private static String LWM2M_V1_1_SCHEMA_PATH = "/schemas/LWM2M-v1_1.xsd";

```

### FieldCanBeLocal
Field can be converted to a local variable
in `leshan-server-demo/src/main/java/org/eclipse/leshan/server/demo/servlet/EventServlet.java`
#### Snippet
```java
    };

    private final SendListener sendListener = new SendListener() {

        @Override
```

### FieldCanBeLocal
Field can be converted to a local variable
in `leshan-server-demo/src/main/java/org/eclipse/leshan/server/demo/servlet/EventServlet.java`
#### Snippet
```java
    };

    private final ObservationListener observationListener = new ObservationListener() {

        @Override
```

### FieldCanBeLocal
Field can be converted to a local variable
in `leshan-server-demo/src/main/java/org/eclipse/leshan/server/demo/servlet/EventServlet.java`
#### Snippet
```java
            .newSetFromMap(new ConcurrentHashMap<LeshanEventSource, Boolean>());

    private final RegistrationListener registrationListener = new RegistrationListener() {

        @Override
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `ExecutorService.awaitTermination()` is ignored
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/queue/PresenceServiceImpl.java`
#### Snippet
```java
        clientTimersExecutor.shutdownNow();
        try {
            clientTimersExecutor.awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            LOG.warn("Destroying presence service was interrupted.", e);
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/security/FileSecurityStore.java`
#### Snippet
```java
                File parent = file.getParentFile();
                if (parent != null) {
                    parent.mkdirs();
                }
                file.createNewFile();
```

### IgnoreResultOfCall
Result of `File.createNewFile()` is ignored
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/security/FileSecurityStore.java`
#### Snippet
```java
                    parent.mkdirs();
                }
                file.createNewFile();
            }
            try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename));) {
```

### IgnoreResultOfCall
Result of `UpdatedRegistration.getUpdatedRegistration()` is ignored
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/observation/ObservationServiceImpl.java`
#### Snippet
```java
                return;
            }
            updatedRegistration.getUpdatedRegistration();
        }
    }
```

### IgnoreResultOfCall
Result of `ExecutorService.awaitTermination()` is ignored
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/registration/InMemoryRegistrationStore.java`
#### Snippet
```java
        schedExecutor.shutdownNow();
        try {
            schedExecutor.awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            LOG.warn("Destroying InMemoryRegistrationStore was interrupted.", e);
```

### IgnoreResultOfCall
Result of `ExecutorService.awaitTermination()` is ignored
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/engine/DefaultRegistrationEngine.java`
#### Snippet
```java
            if (attachedExecutor) {
                schedExecutor.shutdownNow();
                schedExecutor.awaitTermination(bootstrapSessionTimeoutInSec, TimeUnit.SECONDS);
            } else {
                cancelUpdateTask(true);
```

### IgnoreResultOfCall
Result of `ExecutorService.awaitTermination()` is ignored
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/endpoint/CaliforniumServerEndpointsProvider.java`
#### Snippet
```java
        executor.shutdownNow();
        try {
            executor.awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            LOG.warn("Destroying RequestSender was interrupted.", e);
```

### IgnoreResultOfCall
Result of `ExecutorService.awaitTermination()` is ignored
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/bootstrap/endpoint/CaliforniumBootstrapServerEndpointsProvider.java`
#### Snippet
```java
        executor.shutdownNow();
        try {
            executor.awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            LOG.warn("Destroying RequestSender was interrupted.", e);
```

### IgnoreResultOfCall
Result of `ExecutorService.awaitTermination()` is ignored
in `leshan-client-cf/src/main/java/org/eclipse/leshan/client/californium/endpoint/CaliforniumClientEndpointsProvider.java`
#### Snippet
```java
        executor.shutdownNow();
        try {
            executor.awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            LOG.warn("Destroying RequestSender was interrupted.", e);
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `leshan-bsserver-demo/src/main/java/org/eclipse/leshan/server/bootstrap/demo/JSONFileBootstrapStore.java`
#### Snippet
```java
                File parent = file.getParentFile();
                if (parent != null) {
                    parent.mkdirs();
                }
                file.createNewFile();
```

### IgnoreResultOfCall
Result of `File.createNewFile()` is ignored
in `leshan-bsserver-demo/src/main/java/org/eclipse/leshan/server/bootstrap/demo/JSONFileBootstrapStore.java`
#### Snippet
```java
                    parent.mkdirs();
                }
                file.createNewFile();
            }

```

### IgnoreResultOfCall
Result of `ExecutorService.awaitTermination()` is ignored
in `leshan-server-redis/src/main/java/org/eclipse/leshan/server/redis/RedisRegistrationStore.java`
#### Snippet
```java
        schedExecutor.shutdownNow();
        try {
            schedExecutor.awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            LOG.warn("Destroying RedisRegistrationStore was interrupted.", e);
```

## RuleId[id=DefaultAnnotationParam]
### DefaultAnnotationParam
Redundant default parameter value assignment
in `leshan-bsserver-demo/src/main/java/org/eclipse/leshan/server/bootstrap/demo/cli/LeshanBsServerDemoCLI.java`
#### Snippet
```java

    /* ********************************** Identity Section ******************************** */
    @ArgGroup(exclusive = true)
    public IdentitySection identity = new IdentitySection();

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `leshan-server-demo/src/main/java/org/eclipse/leshan/server/demo/cli/LeshanServerDemoCLI.java`
#### Snippet
```java

    /* ********************************** Identity Section ******************************** */
    @ArgGroup(exclusive = true)
    public IdentitySection identity = new IdentitySection();

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `leshan-client-demo/src/main/java/org/eclipse/leshan/client/demo/cli/IdentitySection.java`
#### Snippet
```java
        private PrivateKey cprik;

        @ArgGroup(exclusive = true)
        private RpkOrX509Section rpkOrX509;
    }
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `leshan-client-demo/src/main/java/org/eclipse/leshan/client/demo/cli/LeshanClientDemoCLI.java`
#### Snippet
```java

    /* ********************************** Identity Section ******************************** */
    @ArgGroup(exclusive = true)
    public IdentitySection identity = new IdentitySection();

```

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `execute()` is identical to its super method
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/resource/SimpleInstanceEnabler.java`
#### Snippet
```java

    @Override
    public ExecuteResponse execute(ServerIdentity identity, int resourceid, Arguments arguments) {
        return ExecuteResponse.notFound();
    }
```

## RuleId[id=IfStatementWithIdenticalBranches]
### IfStatementWithIdenticalBranches
Common part can be extracted from 'if'
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/security/SecurityChecker.java`
#### Snippet
```java
        // if this is a secure end-point, we must check that the registering client is using the right identity.
        if (clientIdentity.isSecure()) {
            if (securityInfos == null || !securityInfos.hasNext()) {
                LOG.debug("Client '{}' without security info try to connect through the secure endpoint", endpoint);
                return false;
```

### IfStatementWithIdenticalBranches
Common part can be extracted from 'if'
in `leshan-client-cf/src/main/java/org/eclipse/leshan/client/californium/object/ObjectResource.java`
#### Snippet
```java

            CreateResponse response = requestReceiver.requestReceived(identity, createRequest).getResponse();
            if (response.getCode() == org.eclipse.leshan.core.ResponseCode.CREATED) {
                if (response.getLocation() != null)
                    exchange.setLocationPath(response.getLocation());
```

### IfStatementWithIdenticalBranches
Common part can be extracted from 'if'
in `leshan-client-cf/src/main/java/org/eclipse/leshan/client/californium/object/ObjectResource.java`
#### Snippet
```java
                ObserveRequest observeRequest = new ObserveRequest(requestedContentFormat, URI, coapRequest);
                ObserveResponse response = requestReceiver.requestReceived(identity, observeRequest).getResponse();
                if (response.getCode() == org.eclipse.leshan.core.ResponseCode.CONTENT) {
                    LwM2mPath path = getPath(URI);
                    LwM2mNode content = response.getContent();
```

### IfStatementWithIdenticalBranches
Common part can be extracted from 'if'
in `leshan-client-cf/src/main/java/org/eclipse/leshan/client/californium/object/ObjectResource.java`
#### Snippet
```java
                    BootstrapReadResponse response = requestReceiver.requestReceived(identity, readRequest)
                            .getResponse();
                    if (response.getCode() == org.eclipse.leshan.core.ResponseCode.CONTENT) {
                        LwM2mPath path = getPath(URI);
                        LwM2mNode content = response.getContent();
```

### IfStatementWithIdenticalBranches
Common part can be extracted from 'if'
in `leshan-client-cf/src/main/java/org/eclipse/leshan/client/californium/object/ObjectResource.java`
#### Snippet
```java
                    ReadRequest readRequest = new ReadRequest(requestedContentFormat, URI, coapRequest);
                    ReadResponse response = requestReceiver.requestReceived(identity, readRequest).getResponse();
                    if (response.getCode() == org.eclipse.leshan.core.ResponseCode.CONTENT) {
                        LwM2mPath path = getPath(URI);
                        LwM2mNode content = response.getContent();
```

## RuleId[id=DuplicateThrows]
### DuplicateThrows
There is a more general exception, 'java.lang.IllegalArgumentException', in the throws list already.
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/LwM2mPath.java`
#### Snippet
```java
     */
    public static LwM2mPath parse(String fullpath, String lwm2mRootpath)
            throws NumberFormatException, InvalidLwM2mPathException, IllegalArgumentException {
        if (lwm2mRootpath == null) {
            return new LwM2mPath(fullpath);
```

## RuleId[id=RedundantStringFormatCall]
### RedundantStringFormatCall
Redundant call to `format()`
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/endpoint/coaps/CoapsServerEndpointFactory.java`
#### Snippet
```java
        if (incompleteConfig.getCertificateIdentityProvider() != null) {
            if (serverSecurityInfo.getPrivateKey() != null) {
                throw new IllegalStateException(String.format(
                        "Configuration conflict between LeshanBuilder and DtlsConnectorConfig.Builder for private key"));
            }
```

### RedundantStringFormatCall
Redundant call to `format()`
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/endpoint/coaps/CoapsServerEndpointFactory.java`
#### Snippet
```java
            }
            if (serverSecurityInfo.getPublicKey() != null) {
                throw new IllegalStateException(String.format(
                        "Configuration conflict between LeshanBuilder and DtlsConnectorConfig.Builder for public key"));
            }
```

### RedundantStringFormatCall
Redundant call to `format()`
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/endpoint/coaps/CoapsServerEndpointFactory.java`
#### Snippet
```java
            }
            if (serverSecurityInfo.getCertificateChain() != null) {
                throw new IllegalStateException(String.format(
                        "Configuration conflict between LeshanBuilder and DtlsConnectorConfig.Builder for certificate chain"));
            }
```

### RedundantStringFormatCall
Redundant call to `format()`
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/bootstrap/endpoint/coaps/CoapsBootstrapServerEndpointFactory.java`
#### Snippet
```java
        if (incompleteConfig.getCertificateIdentityProvider() != null) {
            if (serverSecurityInfo.getPrivateKey() != null) {
                throw new IllegalStateException(String.format(
                        "Configuration conflict between LeshanBuilder and DtlsConnectorConfig.Builder for private key"));
            }
```

### RedundantStringFormatCall
Redundant call to `format()`
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/bootstrap/endpoint/coaps/CoapsBootstrapServerEndpointFactory.java`
#### Snippet
```java
            }
            if (serverSecurityInfo.getPublicKey() != null) {
                throw new IllegalStateException(String.format(
                        "Configuration conflict between LeshanBuilder and DtlsConnectorConfig.Builder for public key"));
            }
```

### RedundantStringFormatCall
Redundant call to `format()`
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/bootstrap/endpoint/coaps/CoapsBootstrapServerEndpointFactory.java`
#### Snippet
```java
            }
            if (serverSecurityInfo.getCertificateChain() != null) {
                throw new IllegalStateException(String.format(
                        "Configuration conflict between LeshanBuilder and DtlsConnectorConfig.Builder for certificate chain"));
            }
```

### RedundantStringFormatCall
Redundant call to `format()`
in `leshan-core/src/main/java/org/eclipse/leshan/core/request/BootstrapFinishRequest.java`
#### Snippet
```java
    @Override
    public String toString() {
        return String.format("BootstrapFinishRequest");
    }
}
```

## RuleId[id=PointlessNullCheck]
### PointlessNullCheck
Unnecessary 'null' check before 'equals()' call
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/engine/DefaultRegistrationEngine.java`
#### Snippet
```java
            return false;
        ServerIdentity bootstrapServer = currentBootstrapServer.get();
        if (bootstrapServer != null && foreingPeer.equals(bootstrapServer)) {
            return true;
        } else {
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `response` initializer `null` is redundant
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/queue/QueueModeLwM2mRequestSender.java`
#### Snippet
```java
        // Use delegation to send the request
        try {
            T response = null;
            response = delegatedSender.send(destination, request, lowerLayerConfig, timeout);
            if (response != null) {
```

### UnusedAssignment
Variable `wasStarted` initializer `false` is redundant
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/engine/DefaultRegistrationEngine.java`
#### Snippet
```java
    @Override
    public void destroy(boolean deregister) {
        boolean wasStarted = false;
        synchronized (this) {
            wasStarted = started;
```

### UnusedAssignment
The value `null` assigned to `registrationID` is never used
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/engine/DefaultRegistrationEngine.java`
#### Snippet
```java
            UpdateResponse response = sender.send(server, request, requestTimeoutInMs);
            if (response == null) {
                registrationID = null;
                LOG.info("Registration update failed: Timeout.");
                if (observer != null) {
```

### UnusedAssignment
The value `null` assigned to `registrationID` is never used
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/engine/DefaultRegistrationEngine.java`
#### Snippet
```java
            DeregisterResponse response = sender.send(server, request, deregistrationTimeoutInMs);
            if (response == null) {
                registrationID = null;
                LOG.info("Deregistration failed: Timeout.");
                if (observer != null) {
```

### UnusedAssignment
The value `null` assigned to `registrationID` is never used
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/engine/DefaultRegistrationEngine.java`
#### Snippet
```java
            } else if (response.isSuccess() || response.getCode() == ResponseCode.NOT_FOUND) {
                registeredServers.remove(registrationID);
                registrationID = null;
                cancelUpdateTask(true);
                LOG.info("De-register response {} {}.", response.getCode(), response.getErrorMessage());
```

### UnusedAssignment
Variable `oscoreCtxDB` initializer `null` is redundant
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/bootstrap/endpoint/coap/CoapOscoreBootstrapServerEndpointFactory.java`
#### Snippet
```java
        if (server.getSecurityStore() != null) {
            // Handle OSCORE support.
            OSCoreCtxDB oscoreCtxDB = null;
            OscoreBootstrapListener sessionHolder = null;
            BootstrapOscoreContextCleaner oscoreContextCleaner = null;
```

### UnusedAssignment
Variable `sessionHolder` initializer `null` is redundant
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/bootstrap/endpoint/coap/CoapOscoreBootstrapServerEndpointFactory.java`
#### Snippet
```java
            // Handle OSCORE support.
            OSCoreCtxDB oscoreCtxDB = null;
            OscoreBootstrapListener sessionHolder = null;
            BootstrapOscoreContextCleaner oscoreContextCleaner = null;
            if (server.getSecurityStore() != null) {
```

### UnusedAssignment
Variable `oscoreContextCleaner` initializer `null` is redundant
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/bootstrap/endpoint/coap/CoapOscoreBootstrapServerEndpointFactory.java`
#### Snippet
```java
            OSCoreCtxDB oscoreCtxDB = null;
            OscoreBootstrapListener sessionHolder = null;
            BootstrapOscoreContextCleaner oscoreContextCleaner = null;
            if (server.getSecurityStore() != null) {
                sessionHolder = new OscoreBootstrapListener();
```

### UnusedAssignment
Variable `hkdfAlg` initializer `null` is redundant
in `leshan-client-cf/src/main/java/org/eclipse/leshan/client/californium/endpoint/coap/CoapOscoreClientEndpointFactory.java`
#### Snippet
```java
            }

            AlgorithmID hkdfAlg = null;
            try {
                hkdfAlg = AlgorithmID
```

### UnusedAssignment
Variable `aeadAlg` initializer `null` is redundant
in `leshan-client-cf/src/main/java/org/eclipse/leshan/client/californium/endpoint/coap/CoapOscoreClientEndpointFactory.java`
#### Snippet
```java
                        serverInfo, serverInfo.oscoreSetting), e);
            }
            AlgorithmID aeadAlg = null;
            try {
                aeadAlg = AlgorithmID
```

### UnusedAssignment
Variable `timeElapsed` initializer `false` is redundant
in `leshan-core-cf/src/main/java/org/eclipse/leshan/core/californium/CoapSyncRequestObserver.java`
#### Snippet
```java
    public Response waitForCoapResponse() throws InterruptedException {
        try {
            boolean timeElapsed = false;
            timeElapsed = !latch.await(timeout, TimeUnit.MILLISECONDS);
            if (timeElapsed || coapTimeout.get()) {
```

### UnusedAssignment
The value `0b0001_1000` assigned to `typeByte` is never used
in `leshan-core/src/main/java/org/eclipse/leshan/core/tlv/TlvEncoder.java`
#### Snippet
```java
                b.put((byte) msb);
                b.putShort((short) (length & 0xFF_FF));
                typeByte |= 0b0001_1000;
            }
        }
```

### UnusedAssignment
Variable `node` initializer `null` is redundant
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/codec/senml/LwM2mNodeSenMLDecoder.java`
#### Snippet
```java

        // Create lwm2m node
        LwM2mNode node = null;
        if (nodeClass == LwM2mObject.class) {
            Collection<LwM2mObjectInstance> instances = new ArrayList<>();
```

### UnusedAssignment
Variable `registrationId` initializer `null` is redundant
in `leshan-core/src/main/java/org/eclipse/leshan/core/request/DeregisterRequest.java`
#### Snippet
```java
        implements UplinkRequest<DeregisterResponse> {

    private String registrationId = null;

    /**
```

### UnusedAssignment
Variable `node` initializer `null` is redundant
in `leshan-server-demo/src/main/java/org/eclipse/leshan/server/demo/servlet/json/JacksonLwM2mNodeDeserializer.java`
#### Snippet
```java
        JsonNode object = p.getCodec().readTree(p);

        LwM2mNode node = null;

        if (object.isObject()) {
```

### UnusedAssignment
Variable `jReg` initializer `null` is redundant
in `leshan-server-demo/src/main/java/org/eclipse/leshan/server/demo/servlet/EventServlet.java`
#### Snippet
```java
        public void unregistered(Registration registration, Collection<Observation> observations, boolean expired,
                Registration newReg) {
            String jReg = null;
            try {
                jReg = EventServlet.this.mapper.writeValueAsString(registration);
```

### UnusedAssignment
Variable `jsonContent` initializer `null` is redundant
in `leshan-server-demo/src/main/java/org/eclipse/leshan/server/demo/servlet/EventServlet.java`
#### Snippet
```java
                LOG.debug("Received composite notificationfrom [{}] containing value [{}]", response.getContent());
            }
            String jsonContent = null;
            String jsonListOfPath = null;
            try {
```

### UnusedAssignment
Variable `jsonListOfPath` initializer `null` is redundant
in `leshan-server-demo/src/main/java/org/eclipse/leshan/server/demo/servlet/EventServlet.java`
#### Snippet
```java
            }
            String jsonContent = null;
            String jsonListOfPath = null;
            try {
                jsonContent = mapper.writeValueAsString(response.getContent());
```

### UnusedAssignment
Variable `jReg` initializer `null` is redundant
in `leshan-server-demo/src/main/java/org/eclipse/leshan/server/demo/servlet/EventServlet.java`
#### Snippet
```java
        public void registered(Registration registration, Registration previousReg,
                Collection<Observation> previousObservations) {
            String jReg = null;
            try {
                jReg = EventServlet.this.mapper.writeValueAsString(registration);
```

### UnusedAssignment
Variable `jReg` initializer `null` is redundant
in `leshan-server-demo/src/main/java/org/eclipse/leshan/server/demo/servlet/EventServlet.java`
#### Snippet
```java
            regUpdate.registration = updatedRegistration;
            regUpdate.update = update;
            String jReg = null;
            try {
                jReg = EventServlet.this.mapper.writeValueAsString(regUpdate);
```

### UnusedAssignment
Variable `jsonContent` initializer `null` is redundant
in `leshan-server-demo/src/main/java/org/eclipse/leshan/server/demo/servlet/EventServlet.java`
#### Snippet
```java
                        response.getContent());
            }
            String jsonContent = null;
            try {
                jsonContent = mapper.writeValueAsString(response.getContent());
```

## RuleId[id=ConstantValue]
### ConstantValue
Value `format` is always 'null'
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/engine/DefaultRegistrationEngineFactory.java`
#### Snippet
```java
        // handle null case
        if (format == null) {
            this.preferredContentFormat = format;
            return this;
        }
```

### ConstantValue
Condition `aeadAlgorithm != null` is always `true`
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/object/Oscore.java`
#### Snippet
```java
            Long longValue = (Long) value.getValue();
            aeadAlgorithm = AeadAlgorithm.fromValue(longValue);
            if (aeadAlgorithm != null) {
                return WriteResponse.success();
            } else {
```

### ConstantValue
Condition `hkdfAlgorithm != null` is always `true`
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/object/Oscore.java`
#### Snippet
```java
            Long longValue = (Long) value.getValue();
            hkdfAlgorithm = HkdfAlgorithm.fromValue(longValue);
            if (hkdfAlgorithm != null) {
                return WriteResponse.success();
            } else {
```

### ConstantValue
Condition `isBootstrapServer != null` is always `true`
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/util/LinkFormatHelper.java`
#### Snippet
```java
                    Boolean isBootstrapServer = objectEnabler.getId() == LwM2mId.SECURITY
                            && ServersInfoExtractor.isBootstrapServer(objectEnabler, instanceId);
                    if (isBootstrapServer != null && !isBootstrapServer) {
                        Long shortServerId = ServersInfoExtractor.getServerId(objectEnabler, instanceId);
                        if (shortServerId != null)
```

### ConstantValue
Result of `instances.size()` is always '0'
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/resource/ObjectEnabler.java`
#### Snippet
```java
            instances.clear();
            // fired instances removed
            int[] instanceIds = new int[instances.size()];
            int i = 0;
            for (Entry<Integer, LwM2mInstanceEnabler> instance : instances.entrySet()) {
```

### ConstantValue
Condition `"observation must be a CompositeObservation or a SingleObservation but was " + observation == null` is always `false`
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/endpoint/ServerCoapMessageTranslator.java`
#### Snippet
```java

            throw new IllegalStateException(
                    "observation must be a CompositeObservation or a SingleObservation but was " + observation == null
                            ? null
                            : observation.getClass().getSimpleName());
```

### ConstantValue
Condition `tokens != null` is always `true`
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/bootstrap/BootstrapResource.java`
#### Snippet
```java
            } else {
                String[] tokens = param.split("\\=");
                if (tokens != null && tokens.length == 2) {
                    additionalParams.put(tokens[0], tokens[1]);
                }
```

### ConstantValue
Value `rootpath` is always 'null'
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/request/LwM2mResponseBuilder.java`
#### Snippet
```java
                    // See : https://github.com/OpenMobileAlliance/OMA_LwM2M_for_Developers/issues/534
                    String rootpath = null;
                    links = linkParser.parseLwM2mLinkFromCoreLinkFormat(coapResponse.getPayload(), rootpath);
                } catch (LinkParseException e) {
                    throw new InvalidResponseException(e,
```

### ConstantValue
Condition `tokens != null` is always `true`
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/registration/RegisterResource.java`
#### Snippet
```java
            } else {
                String[] tokens = param.split("\\=");
                if (tokens != null && tokens.length == 2) {
                    additionalParams.put(tokens[0], tokens[1]);
                }
```

### ConstantValue
Condition `tokens != null` is always `true`
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/registration/RegisterResource.java`
#### Snippet
```java
            } else {
                String[] tokens = param.split("\\=");
                if (tokens != null && tokens.length == 2) {
                    additionalParams.put(tokens[0], tokens[1]);
                }
```

### ConstantValue
Condition `attributes == null` is always `false`
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/attributes/AttributeSet.java`
#### Snippet
```java
            return false;
        AttributeSet other = (AttributeSet) obj;
        if (attributes == null) {
            if (other.attributes != null)
                return false;
```

### ConstantValue
Condition `attributes == null` is always `false` when reached
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/attributes/AttributeSet.java`
#### Snippet
```java
        final int prime = 31;
        int result = 1;
        result = prime * result + ((attributes == null) ? 0 : attributes.hashCode());
        return result;
    }
```

### ConstantValue
Condition `0 > p.length` is always `false`
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/LwM2mPath.java`
#### Snippet
```java
        }
        String[] p = path.split("/");
        if (0 > p.length || p.length > 4) {
            throw new InvalidLwM2mPathException("Invalid length for path: ", path);
        }
```

### ConstantValue
Condition `key == null` is always `false`
in `leshan-core/src/main/java/org/eclipse/leshan/core/model/LwM2mModelRepository.java`
#### Snippet
```java
                // create Key
                Key key = getKey(model.id, model.version);
                if (key == null) {
                    throw new IllegalArgumentException(
                            String.format("Model %s is invalid : object id is missing.", model));
```

### ConstantValue
Condition `other.name != null` is always `false`
in `leshan-core/src/main/java/org/eclipse/leshan/senml/SenMLRecord.java`
#### Snippet
```java
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
```

### ConstantValue
Condition `!name.equals(other.name)` is always `false`
in `leshan-core/src/main/java/org/eclipse/leshan/senml/SenMLRecord.java`
#### Snippet
```java
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (objectLinkValue == null) {
```

### ConstantValue
Condition `path.length >= 3` is always `true`
in `leshan-server-demo/src/main/java/org/eclipse/leshan/server/demo/servlet/ClientServlet.java`
#### Snippet
```java
            Registration registration = server.getRegistrationService().getByEndpoint(clientEndpoint);
            if (registration != null) {
                if (path.length >= 3 && "attributes".equals(path[path.length - 1])) {
                    // create & process request WriteAttributes request
                    target = StringUtils.removeEnd(target, path[path.length - 1]);
```

## RuleId[id=RedundantOperationOnEmptyContainer]
### RedundantOperationOnEmptyContainer
Collection `instances.entrySet()` is always empty
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/resource/ObjectEnabler.java`
#### Snippet
```java
            int[] instanceIds = new int[instances.size()];
            int i = 0;
            for (Entry<Integer, LwM2mInstanceEnabler> instance : instances.entrySet()) {
                instanceIds[i] = instance.getKey();
                i++;
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `getBytesUnchecked(String, String)`
in `leshan-core/src/main/java/org/eclipse/leshan/core/util/StringUtils.java`
#### Snippet
```java
     * @since As of 1.7, throws {@link NullPointerException} instead of UnsupportedEncodingException
     * @see <a href="http://download.oracle.com/javase/6/docs/api/java/nio/charset/Charset.html">Standard charsets</a>
     * @see #getBytesUnchecked(String, String)
     */
    public static byte[] getBytesUtf8(final String string) {
```

### JavadocReference
Cannot resolve symbol `strip(String)`
in `leshan-core/src/main/java/org/eclipse/leshan/core/util/StringUtils.java`
#### Snippet
```java
     * <p>
     * The String is trimmed using {@link String#trim()}. Trim removes start and end characters &lt;= 32. To strip
     * whitespace use {@link #strip(String)}.
     * </p>
     *
```

### JavadocReference
Cannot resolve symbol `strip(String, String)`
in `leshan-core/src/main/java/org/eclipse/leshan/core/util/StringUtils.java`
#### Snippet
```java
     *
     * <p>
     * To trim your choice of characters, use the {@link #strip(String, String)} methods.
     * </p>
     *
```

### JavadocReference
Cannot resolve symbol `DecoderException`
in `leshan-core/src/main/java/org/eclipse/leshan/core/util/Hex.java`
#### Snippet
```java
     * @param index The index of the character in the source
     * @return An integer
     * @throws DecoderException Thrown if ch is an illegal hex character
     */
    protected static int toDigit(final char ch, final int index) throws IllegalArgumentException {
```

### JavadocReference
Cannot resolve symbol `DEFAULT_CHARSET_NAME`
in `leshan-core/src/main/java/org/eclipse/leshan/core/util/Hex.java`
#### Snippet
```java
/**
 * Converts hexadecimal Strings. The charset used for certain operation can be set, the default is set in
 * {@link #DEFAULT_CHARSET_NAME}
 *
 * This class is thread-safe.
```

### JavadocReference
Cannot resolve symbol `DecoderException`
in `leshan-core/src/main/java/org/eclipse/leshan/core/util/Hex.java`
#### Snippet
```java
     * @param array An array of character bytes containing hexadecimal digits
     * @return A byte array containing binary data decoded from the supplied byte array (representing characters).
     * @throws DecoderException Thrown if an odd number of characters is supplied to this function
     * @see #decodeHex(char[])
     */
```

### JavadocReference
Cannot resolve symbol `EncoderException`
in `leshan-core/src/main/java/org/eclipse/leshan/core/util/Hex.java`
#### Snippet
```java
     * @param object a String, or byte[] to convert to Hex characters
     * @return A char[] containing hexadecimal characters
     * @throws EncoderException Thrown if the given object is not a String or byte[]
     * @see #encodeHex(byte[])
     */
```

### JavadocReference
Cannot resolve symbol `DecoderException`
in `leshan-core/src/main/java/org/eclipse/leshan/core/util/Hex.java`
#### Snippet
```java
     * @param object A String or, an array of character bytes containing hexadecimal digits
     * @return A byte array containing binary data decoded from the supplied byte array (representing characters).
     * @throws DecoderException Thrown if an odd number of characters is supplied to this function or the object is not
     *         a String or char[]
     * @see #decodeHex(char[])
```

### JavadocReference
Cannot resolve symbol `DecoderException`
in `leshan-core/src/main/java/org/eclipse/leshan/core/util/Hex.java`
#### Snippet
```java
     * @param data An array of characters containing hexadecimal digits
     * @return A byte array containing binary data decoded from the supplied char array.
     * @throws DecoderException Thrown if an odd number or illegal of characters is supplied
     */
    public static byte[] decodeHex(final char[] data) throws IllegalArgumentException {
```

## RuleId[id=ManualArrayToCollectionCopy]
### ManualArrayToCollectionCopy
Manual array to collection copy
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/registration/Registration.java`
#### Snippet
```java
        public Builder supportedContentFormats(ContentFormat... supportedContentFormats) {
            this.supportedContentFormats = new HashSet<>();
            for (ContentFormat contentFormat : supportedContentFormats) {
                this.supportedContentFormats.add(contentFormat);
            }
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Unboxing of `ServersInfoExtractor.isBootstrapServer(objectEnabler, instanceId)` may produce `NullPointerException`
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/util/LinkFormatHelper.java`
#### Snippet
```java
                if (objectEnabler.getId() == LwM2mId.SECURITY || objectEnabler.getId() == LwM2mId.SERVER) {
                    Boolean isBootstrapServer = objectEnabler.getId() == LwM2mId.SECURITY
                            && ServersInfoExtractor.isBootstrapServer(objectEnabler, instanceId);
                    if (isBootstrapServer != null && !isBootstrapServer) {
                        Long shortServerId = ServersInfoExtractor.getServerId(objectEnabler, instanceId);
```

### DataFlowIssue
Dereference of `info` may produce `NullPointerException`
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/servers/ServersInfoExtractor.java`
#### Snippet
```java
                    // create device management info
                    DmServerInfo info = createDMServerInfo(security, servers);
                    infos.deviceManagements.put(info.serverId, info);
                } catch (RuntimeException e) {
                    LOG.debug("Unable to get info for DM server /O/{}", security.getId(), e);
```

### DataFlowIssue
Dereference of `info` may produce `NullPointerException`
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/bootstrap/BaseBootstrapConsistencyChecker.java`
#### Snippet
```java
            ServersInfo info = ServersInfoExtractor.getInfo(objectEnablers, true);

            if (info.bootstrap != null) {
                checkBootstrapServerInfo(info.bootstrap, errors);
            }
```

### DataFlowIssue
Method invocation `getUri` may produce `NullPointerException`
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/engine/DefaultRegistrationEngine.java`
#### Snippet
```java
                            return null;
                        } else {
                            LOG.info("Bootstrap finished {}.", bootstrapServer.getUri());
                            ServerInfo serverInfo = selectServer(
                                    ServersInfoExtractor.getInfo(objectEnablers).deviceManagements);
```

### DataFlowIssue
Method invocation `getPeerAddress` may produce `NullPointerException`
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/endpoint/coaps/CoapsServerEndpointFactory.java`
#### Snippet
```java
                            .add(DtlsEndpointContext.KEY_HANDSHAKE_MODE, DtlsEndpointContext.HANDSHAKE_MODE_AUTO));
                }
                return new AddressEndpointContext(identity.getPeerAddress(), peerIdentity);
            }
        };
```

### DataFlowIssue
Dereference of `removed` may produce `NullPointerException`
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/observation/LwM2mObservationStore.java`
#### Snippet
```java
            }
        }
        for (org.eclipse.leshan.core.observation.Observation observation : removed) {
            notificationListener.cancelled(observation);
        }
```

### DataFlowIssue
Dereference of `removed` may produce `NullPointerException`
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/observation/LwM2mObservationStore.java`
#### Snippet
```java
            }
        }
        for (org.eclipse.leshan.core.observation.Observation observation : removed) {
            notificationListener.cancelled(observation);
        }
```

### DataFlowIssue
Method invocation `getPeerAddress` may produce `NullPointerException`
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/bootstrap/endpoint/coaps/CoapsBootstrapServerEndpointFactory.java`
#### Snippet
```java
                            .add(DtlsEndpointContext.KEY_HANDSHAKE_MODE, DtlsEndpointContext.HANDSHAKE_MODE_AUTO));
                }
                return new AddressEndpointContext(identity.getPeerAddress(), peerIdentity);
            }
        };
```

### DataFlowIssue
Method invocation `getPeerAddress` may produce `NullPointerException`
in `leshan-client-cf/src/main/java/org/eclipse/leshan/client/californium/endpoint/coaps/CoapsClientEndpointFactory.java`
#### Snippet
```java
                            .add(DtlsEndpointContext.KEY_HANDSHAKE_MODE, DtlsEndpointContext.HANDSHAKE_MODE_AUTO));
                }
                return new AddressEndpointContext(identity.getPeerAddress(), peerIdentity);
            }
        };
```

### DataFlowIssue
Dereference of `files` may produce `NullPointerException`
in `leshan-core-demo/src/main/java/org/eclipse/leshan/core/demo/cli/converters/TruststoreConverter.java`
#### Snippet
```java
                files = new File[] { input };
            }
            for (File file : files) {
                try {
                    trustStore.add(SecurityUtil.certificate.readFromFile(file.getAbsolutePath()));
```

### DataFlowIssue
Method invocation `toExternalForm` may produce `NullPointerException`
in `leshan-bsserver-demo/src/main/java/org/eclipse/leshan/server/bootstrap/demo/LeshanBootstrapServerDemo.java`
#### Snippet
```java
        WebAppContext root = new WebAppContext();
        root.setContextPath("/");
        root.setResourceBase(LeshanBootstrapServerDemo.class.getClassLoader().getResource("webapp").toExternalForm());
        root.setParentLoaderPriority(true);

```

### DataFlowIssue
Variable update does nothing
in `leshan-core/src/main/java/org/eclipse/leshan/core/tlv/TlvEncoder.java`
#### Snippet
```java

        if (length < 8) {
            size += 0;
        } else if (length < MAX_LENGTH_8BIT) {
            size += 1;
```

### DataFlowIssue
Dereference of `modelsDir.listFiles()` may produce `NullPointerException`
in `leshan-core/src/main/java/org/eclipse/leshan/core/model/ObjectLoader.java`
#### Snippet
```java
        } else {
            // get all files
            for (File file : modelsDir.listFiles()) {
                if (!file.canRead())
                    continue;
```

### DataFlowIssue
Argument `in` might be null
in `leshan-core/src/main/java/org/eclipse/leshan/core/credentials/CredentialsReader.java`
#### Snippet
```java
    public T readFromResource(String resourcePath) throws IOException, GeneralSecurityException {
        try (InputStream in = ClassLoader.getSystemResourceAsStream(resourcePath)) {
            return decode(in);
        }
    }
```

### DataFlowIssue
Dereference of `files` may produce `NullPointerException`
in `leshan-server-demo/src/main/java/org/eclipse/leshan/server/demo/model/FileLister.java`
#### Snippet
```java
        StringBuilder builder = new StringBuilder();
        SortedMap<String, String> sortedFiles = new TreeMap<>();
        for (File file : files) {
            DDFFileParser ddfFileParser = new DDFFileParser();
            ObjectModel model = ddfFileParser.parse(file).iterator().next();
```

### DataFlowIssue
Method invocation `toExternalForm` may produce `NullPointerException`
in `leshan-server-demo/src/main/java/org/eclipse/leshan/server/demo/LeshanServerDemo.java`
#### Snippet
```java
        WebAppContext root = new WebAppContext();
        root.setContextPath("/");
        root.setResourceBase(LeshanServerDemo.class.getClassLoader().getResource("webapp").toExternalForm());
        root.setParentLoaderPriority(true);
        server.setHandler(root);
```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/send/SendHandler.java`
#### Snippet
```java
public class SendHandler implements SendService {

    private final List<SendListener> listeners = new CopyOnWriteArrayList<>();;

    @Override
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/security/FileSecurityStore.java`
#### Snippet
```java
                file.createNewFile();
            }
            try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename));) {
                out.writeObject(this.getAll().toArray(new SecurityInfo[0]));
            }
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/security/FileSecurityStore.java`
#### Snippet
```java
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));) {
            SecurityInfo[] infos = (SecurityInfo[]) in.readObject();

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/observation/ObservationServiceImpl.java`
#### Snippet
```java
    private final boolean updateRegistrationOnNotification;

    private final List<ObservationListener> listeners = new CopyOnWriteArrayList<>();;

    /**
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/registration/RegistrationHandler.java`
#### Snippet
```java
                    registrationService.fireUnregistered(deregistration.getRegistration(),
                            deregistration.getObservations(), null);
                };
            };
            return new SendableResponse<>(DeregisterResponse.success(), whenSent);
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/registration/RegistrationHandler.java`
#### Snippet
```java
                    registrationService.fireUpdated(update, updatedRegistration.getUpdatedRegistration(),
                            updatedRegistration.getPreviousRegistration());
                };
            };
            return new SendableResponse<>(UpdateResponse.success(), whenSent);
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `leshan-client-cf/src/main/java/org/eclipse/leshan/client/californium/endpoint/coap/CoapClientEndpointFactory.java`
#### Snippet
```java
    public IdentityHandler createIdentityHandler() {
        return new DefaultCoapIdentityHandler();
    };

    @Override
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `leshan-core-demo/src/main/java/org/eclipse/leshan/core/demo/cli/converters/VersionConverter.java`
#### Snippet
```java
        return new Version(input);
    }
};

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `leshan-core-demo/src/main/java/org/eclipse/leshan/core/demo/cli/converters/CIDConverter.java`
#### Snippet
```java
        }
    }
};

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `leshan-core/src/main/java/org/eclipse/leshan/core/json/jackson/JsonRootObjectSerDes.java`
#### Snippet
```java

        return o;
    };

    @Override
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `leshan-core/src/main/java/org/eclipse/leshan/core/tlv/Tlv.java`
#### Snippet
```java

    public enum TlvType {
        OBJECT_INSTANCE, RESOURCE_INSTANCE, MULTIPLE_RESOURCE, RESOURCE_VALUE;
    }

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `leshan-core/src/main/java/org/eclipse/leshan/core/json/jackson/JsonArrayEntrySerDes.java`
#### Snippet
```java
            o.put("t", jae.getTime());
        return o;
    };

    @Override
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/lwm2m/attributes/LwM2mAttributes.java`
#### Snippet
```java
            }
            return null;
        };

        @Override
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/lwm2m/attributes/LwM2mAttributes.java`
#### Snippet
```java
            }
            return null;
        };
    };
    // uri
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/lwm2m/attributes/LwM2mAttributes.java`
#### Snippet
```java
            }
            return null;
        };
    };
    // lt
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/lwm2m/attributes/LwM2mAttributes.java`
#### Snippet
```java
            }
            return null;
        };

        @Override
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/lwm2m/attributes/LwM2mAttributes.java`
#### Snippet
```java
            }
            return null;
        };
    };
    // ssid
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/lwm2m/attributes/LwM2mAttributes.java`
#### Snippet
```java
            }
            return null;
        };
    };
    // pmax
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/lwm2m/attributes/LwM2mAttributes.java`
#### Snippet
```java
            }
            return null;
        };
    };
    public static Map<String, LwM2mAttributeModel<?>> modelMap;
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/lwm2m/attributes/LwM2mAttributes.java`
#### Snippet
```java
            }
            return null;
        };
    };
    // st
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/lwm2m/attributes/LwM2mAttributes.java`
#### Snippet
```java
            }
            return null;
        };
    };
    // gt
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/lwm2m/attributes/LwM2mAttributes.java`
#### Snippet
```java
            }
            return null;
        };
    };
    // epmax
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/lwm2m/attributes/LwM2mAttributes.java`
#### Snippet
```java
            }
            return null;
        };
    };
    // ver
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/lwm2m/attributes/LwM2mAttributes.java`
#### Snippet
```java
            }
            return null;
        };
    };
    // epmin
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/codec/DefaultLwM2mDecoder.java`
#### Snippet
```java
    public Set<ContentFormat> getSupportedContentFormat() {
        return nodeDecoders.keySet();
    };
}

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/codec/senml/LwM2mSenMLResolver.java`
#### Snippet
```java
        }
    }
};

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `leshan-core/src/main/java/org/eclipse/leshan/core/parser/StringParser.java`
#### Snippet
```java
    public void raiseException(String message, Object... args) throws T {
        raiseException(null, message, args);
    };

    /**
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `leshan-server-core-demo/src/main/java/org/eclipse/leshan/server/core/demo/cli/converters/ServerCIDConverter.java`
#### Snippet
```java
        super(6);
    }
};

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `leshan-client-demo/src/main/java/org/eclipse/leshan/client/demo/cli/OscoreSection.java`
#### Snippet
```java
            return aeadAlgorithm.getValue();
        }
    };

    @Option(required = true,
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `leshan-client-demo/src/main/java/org/eclipse/leshan/client/demo/cli/OscoreSection.java`
#### Snippet
```java
            return hkdfAlgorithm.getValue();
        }
    };

    // ---------------------------------------------------------------------------------------//
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `leshan-client-demo/src/main/java/org/eclipse/leshan/client/demo/cli/IdentitySection.java`
#### Snippet
```java
                return CertificateUsage.fromCode(Integer.parseInt(s));
            }
        };

        @Option(names = { "-ts", "--truststore" },
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `leshan-client-demo/src/main/java/org/eclipse/leshan/client/demo/LeshanClientDemo.java`
#### Snippet
```java
                            builder.setConnectionListener(new PrincipalMdcConnectionListener());
                        return builder;
                    };
                };
            }
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `leshan-client-demo/src/main/java/org/eclipse/leshan/client/demo/cli/LeshanClientDemoCLI.java`
#### Snippet
```java
                super(0);
            }
        };

        @Option(names = { "-c", "--cipher-suites" }, //
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `leshan-client-demo/src/main/java/org/eclipse/leshan/client/demo/cli/LeshanClientDemoCLI.java`
#### Snippet
```java
            public Float latitude;
            public Float longitude;
        };

        private static class PositionConverter implements ITypeConverter<Position> {
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `leshan-client-demo/src/main/java/org/eclipse/leshan/client/demo/cli/LeshanClientDemoCLI.java`
#### Snippet
```java
                return position;
            }
        };

        @Option(names = { "-sf", "--scale-factor" },
```

## RuleId[id=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
`toLowerCase()` call can be replaced with 'equalsIgnoreCase()'
in `leshan-core-demo/src/main/java/org/eclipse/leshan/core/demo/cli/interactive/InteractiveCLI.java`
#### Snippet
```java
        // So use picocli heuristic instead :
        if (!Help.Ansi.AUTO.enabled() && //
                Configuration.getString(TerminalFactory.JLINE_TERMINAL, TerminalFactory.AUTO).toLowerCase()
                        .equals(TerminalFactory.AUTO)) {
            TerminalFactory.configure(Type.NONE);
```

### StringOperationCanBeSimplified
Unnecessary string length argument
in `leshan-core/src/main/java/org/eclipse/leshan/core/parser/StringParser.java`
#### Snippet
```java
     */
    public String getRemainingStringToParse() {
        return strToParse.substring(cursor, strToParse.length());
    }

```

## RuleId[id=PlaceholderCountMatchesArgumentCount]
### PlaceholderCountMatchesArgumentCount
More arguments provided (1) than placeholders specified (0)
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/LwM2mOscoreStore.java`
#### Snippet
```java
                            : securityInfo.getOscoreSetting().getMasterSalt());
        } catch (CoseException e) {
            LOG.error("Unable to create OscoreParameters from OoscoreSetting %s", securityInfo.getOscoreSetting(), e);
            return null;
        }
```

### PlaceholderCountMatchesArgumentCount
More arguments provided (1) than placeholders specified (0)
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/LwM2mOscoreStore.java`
#### Snippet
```java
            }
        } catch (URISyntaxException | SecurityException | IllegalArgumentException e) {
            LOG.error("Unable to extract InetScocketAddress from uri %s", uri, e);
            return null;
        }
```

### PlaceholderCountMatchesArgumentCount
More arguments provided (1) than placeholders specified (0)
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/bootstrap/LwM2mBootstrapOscoreStore.java`
#### Snippet
```java
                            : securityInfo.getOscoreSetting().getMasterSalt());
        } catch (CoseException e) {
            LOG.error("Unable to create OscoreParameters from OoscoreSetting %s", securityInfo.getOscoreSetting(), e);
            return null;
        }
```

### PlaceholderCountMatchesArgumentCount
More arguments provided (1) than placeholders specified (0)
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/bootstrap/LwM2mBootstrapOscoreStore.java`
#### Snippet
```java
            }
        } catch (URISyntaxException | SecurityException | IllegalArgumentException e) {
            LOG.error("Unable to extract InetScocketAddress from uri %s", uri, e);
            return null;
        }
```

### PlaceholderCountMatchesArgumentCount
More arguments provided (3) than placeholders specified (2)
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/codec/DefaultLwM2mEncoder.java`
#### Snippet
```java
            throw new CodecException("Cannot encode timestampedNode with format %s. [%s]", format, path);
        }
        LOG.trace("Encoding time-stamped nodes for path {} and format {}", timestampedNodes, path, format);
        byte[] encoded = ((TimestampedNodeEncoder) encoder).encodeTimestampedData(timestampedNodes, path, model,
                converter);
```

### PlaceholderCountMatchesArgumentCount
More arguments provided (2) than placeholders specified (1)
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/codec/DefaultLwM2mEncoder.java`
#### Snippet
```java
        byte[] encoded = ((TimestampedNodeEncoder) encoder).encodeTimestampedData(timestampedNodes, path, model,
                converter);
        LOG.trace("Encoded node timestampedNode: {}", timestampedNodes, encoded);
        return encoded;

```

### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (0) than placeholders specified (at least 1)
in `leshan-server-demo/src/main/java/org/eclipse/leshan/server/demo/model/DdfDownloader.java`
#### Snippet
```java
                Integer objectId;
                if (id == null) {
                    LOG.warn("Item without ObjectID : {}" + item.getTextContent());
                    continue;
                }
```

### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (0) than placeholders specified (at least 1)
in `leshan-server-demo/src/main/java/org/eclipse/leshan/server/demo/model/DdfDownloader.java`
#### Snippet
```java
                    objectId = Integer.parseInt(id.getTextContent());
                } catch (NumberFormatException e) {
                    LOG.warn("Item with Invalid ObjectID : {}" + item.getTextContent());
                    continue;
                }
```

### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (1) than placeholders specified (2)
in `leshan-server-demo/src/main/java/org/eclipse/leshan/server/demo/servlet/EventServlet.java`
#### Snippet
```java
                ObserveCompositeResponse response) {
            if (LOG.isDebugEnabled()) {
                LOG.debug("Received composite notificationfrom [{}] containing value [{}]", response.getContent());
            }
            String jsonContent = null;
```

## RuleId[id=UnnecessaryCallToStringValueOf]
### UnnecessaryCallToStringValueOf
Unnecessary `Integer.toString()` call
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/codec/json/LwM2mNodeJsonEncoder.java`
#### Snippet
```java
            for (LwM2mObjectInstance instance : object.getInstances().values()) {
                for (LwM2mResource resource : instance.getResources().values()) {
                    String prefixPath = Integer.toString(instance.getId()) + "/" + Integer.toString(resource.getId());
                    resourceList.addAll(lwM2mResourceToJsonArrayEntry(prefixPath, timestampInSeconds, resource));
                }
```

### UnnecessaryCallToStringValueOf
Unnecessary `Integer.toString()` call
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/codec/json/LwM2mNodeJsonEncoder.java`
#### Snippet
```java
            for (LwM2mObjectInstance instance : object.getInstances().values()) {
                for (LwM2mResource resource : instance.getResources().values()) {
                    String prefixPath = Integer.toString(instance.getId()) + "/" + Integer.toString(resource.getId());
                    resourceList.addAll(lwM2mResourceToJsonArrayEntry(prefixPath, timestampInSeconds, resource));
                }
```

### UnnecessaryCallToStringValueOf
Unnecessary `Integer.toString()` call
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/codec/senml/LwM2mNodeSenMLEncoder.java`
#### Snippet
```java
            for (LwM2mObjectInstance instance : object.getInstances().values()) {
                for (LwM2mResource resource : instance.getResources().values()) {
                    String prefixPath = Integer.toString(instance.getId()) + "/" + Integer.toString(resource.getId());
                    lwM2mResourceToSenMLRecord(prefixPath, resource);
                }
```

### UnnecessaryCallToStringValueOf
Unnecessary `Integer.toString()` call
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/codec/senml/LwM2mNodeSenMLEncoder.java`
#### Snippet
```java
            for (LwM2mObjectInstance instance : object.getInstances().values()) {
                for (LwM2mResource resource : instance.getResources().values()) {
                    String prefixPath = Integer.toString(instance.getId()) + "/" + Integer.toString(resource.getId());
                    lwM2mResourceToSenMLRecord(prefixPath, resource);
                }
```

## RuleId[id=InstantiatingObjectToGetClassObject]
### InstantiatingObjectToGetClassObject
Instantiating object to get Class object
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/LwM2mMultipleResource.java`
#### Snippet
```java
            break;
        case CORELINK:
            LwM2mNodeUtil.allElementsOfType(values.values(), (new Link[] {}).getClass());
            break;
        case UNSIGNED_INTEGER:
```

## RuleId[id=SwitchStatementWithTooFewBranches]
### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `leshan-client-demo/src/main/java/org/eclipse/leshan/client/demo/RandomTemperatureSensor.java`
#### Snippet
```java
    public synchronized ExecuteResponse execute(ServerIdentity identity, int resourceId, Arguments arguments) {
        LOG.info("Execute on Temperature resource /{}/{}/{}", getModel().id, getId(), resourceId);
        switch (resourceId) {
        case RESET_MIN_MAX_MEASURED_VALUES:
            resetMinMaxMeasuredValues();
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `leshan-bsserver-demo/src/main/java/org/eclipse/leshan/server/bootstrap/demo/LeshanBootstrapServerDemo.java`
#### Snippet
```java
        } catch (Exception e) {

            // Handler Execution Error
            PrintWriter printer = command.getErr();
            printer.print(command.getColorScheme().errorText("Unable to create and start server ..."));
            printer.printf("%n%n");
            printer.print(command.getColorScheme().stackTraceText(e));
            printer.flush();
            System.exit(1);
        }
```

### DuplicatedCode
Duplicated code
in `leshan-bsserver-demo/src/main/java/org/eclipse/leshan/server/bootstrap/demo/LeshanBootstrapServerDemo.java`
#### Snippet
```java
        if (cli.identity.isx509()) {
            // use X.509 mode (+ RPK)
            builder.setPrivateKey(cli.identity.getPrivateKey());
            builder.setCertificateChain(cli.identity.getCertChain());

            // Define trust store
            List<Certificate> trustStore = cli.identity.getTrustStore();
            builder.setTrustedCertificates(trustStore.toArray(new Certificate[trustStore.size()]));
        } else if (cli.identity.isRPK()) {
            // use RPK only
            builder.setPublicKey(cli.identity.getPublicKey());
            builder.setPrivateKey(cli.identity.getPrivateKey());
        }
```

### DuplicatedCode
Duplicated code
in `leshan-bsserver-demo/src/main/java/org/eclipse/leshan/server/bootstrap/demo/LeshanBootstrapServerDemo.java`
#### Snippet
```java
        if (cli.dtls.cid != null) {
            serverCoapConfig.set(DtlsConfig.DTLS_CONNECTION_ID_LENGTH, cli.dtls.cid);
        }

        // Persist configuration
        File configFile = new File(CF_CONFIGURATION_FILENAME);
        if (configFile.isFile()) {
            serverCoapConfig.load(configFile);
        } else {
            serverCoapConfig.store(configFile, CF_CONFIGURATION_HEADER);
        }
```

### DuplicatedCode
Duplicated code
in `leshan-bsserver-demo/src/main/java/org/eclipse/leshan/server/bootstrap/demo/LeshanBootstrapServerDemo.java`
#### Snippet
```java
        endpointsBuilder.setConfiguration(serverCoapConfig);

        // Create CoAP endpoint
        int coapPort = cli.main.localPort == null ? serverCoapConfig.get(CoapConfig.COAP_PORT) : cli.main.localPort;
        InetSocketAddress coapAddr = cli.main.localAddress == null ? new InetSocketAddress(coapPort)
                : new InetSocketAddress(cli.main.localAddress, coapPort);
```

### DuplicatedCode
Duplicated code
in `leshan-bsserver-demo/src/main/java/org/eclipse/leshan/server/bootstrap/demo/LeshanBootstrapServerDemo.java`
#### Snippet
```java
        int coapsPort = cli.main.secureLocalPort == null ? serverCoapConfig.get(CoapConfig.COAP_SECURE_PORT)
                : cli.main.secureLocalPort;
        InetSocketAddress coapsAddr = cli.main.secureLocalAddress == null ? new InetSocketAddress(coapsPort)
                : new InetSocketAddress(cli.main.secureLocalAddress, coapsPort);
        endpointsBuilder.addEndpoint(coapsAddr, Protocol.COAPS);

        // Create LWM2M server
        builder.setEndpointsProvider(endpointsBuilder.build());
        return builder.build();
```

### DuplicatedCode
Duplicated code
in `leshan-bsserver-demo/src/main/java/org/eclipse/leshan/server/bootstrap/demo/LeshanBootstrapServerDemo.java`
#### Snippet
```java
        InetSocketAddress jettyAddr;
        if (cli.main.webhost == null) {
            jettyAddr = new InetSocketAddress(cli.main.webPort);
        } else {
            jettyAddr = new InetSocketAddress(cli.main.webhost, cli.main.webPort);
        }
        Server server = new Server(jettyAddr);
        WebAppContext root = new WebAppContext();
        root.setContextPath("/");
```

### DuplicatedCode
Duplicated code
in `leshan-bsserver-demo/src/main/java/org/eclipse/leshan/server/bootstrap/demo/LeshanBootstrapServerDemo.java`
#### Snippet
```java
        ServletHolder serverServletHolder;
        if (cli.identity.isRPK()) {
            serverServletHolder = new ServletHolder(new ServerServlet(bsServer, cli.identity.getPublicKey()));
        } else {
            serverServletHolder = new ServletHolder(new ServerServlet(bsServer, cli.identity.getCertChain()[0]));
        }
        root.addServlet(serverServletHolder, "/api/server/*");
```

### DuplicatedCode
Duplicated code
in `leshan-bsserver-demo/src/main/java/org/eclipse/leshan/server/bootstrap/demo/servlet/BootstrapServlet.java`
#### Snippet
```java
        if (req.getPathInfo() == null) {
            // we need the endpoint in the URL
            sendError(resp, HttpServletResponse.SC_BAD_REQUEST, "endpoint name should be specified in the URL");
            return;
        }

        String[] path = StringUtils.split(req.getPathInfo(), '/');

        // endPoint
        if (path.length != 1) {
            sendError(resp, HttpServletResponse.SC_BAD_REQUEST,
                    "endpoint name should be specified in the URL, nothing more");
            return;
        }

        String endpoint = path[0];
```

### DuplicatedCode
Duplicated code
in `leshan-bsserver-demo/src/main/java/org/eclipse/leshan/server/bootstrap/demo/servlet/ServerServlet.java`
#### Snippet
```java
        String[] path = StringUtils.split(req.getPathInfo(), '/');

        if (path.length != 1) {
            resp.sendError(HttpServletResponse.SC_BAD_REQUEST);
            return;
        }

        if ("security".equals(path[0])) {
            ObjectNode security = JsonNodeFactory.instance.objectNode();
            if (publicKey != null) {
                security.set("pubkey", publicKeySerDes.jSerialize(publicKey));
            } else if (serverCertificate != null) {
                security.set("certificate", certificateSerDes.jSerialize(serverCertificate));
            }
            resp.setContentType("application/json");
            resp.getOutputStream().write(security.toString().getBytes(StandardCharsets.UTF_8));
            resp.setStatus(HttpServletResponse.SC_OK);
            return;
        }

        // search coap and coaps port
        Integer coapPort = null;
        Integer coapsPort = null;
```

### DuplicatedCode
Duplicated code
in `leshan-server-core-demo/src/main/java/org/eclipse/leshan/server/core/demo/json/servlet/SecurityServlet.java`
#### Snippet
```java
            ObjectNode security = JsonNodeFactory.instance.objectNode();
            if (serverPublicKey != null) {
                security.set("pubkey", publicKeySerDes.jSerialize(serverPublicKey));
            } else if (serverCertificate != null) {
                security.set("certificate", certificateSerDes.jSerialize(serverCertificate));
            }
            resp.setContentType("application/json");
            resp.getOutputStream().write(security.toString().getBytes(StandardCharsets.UTF_8));
            resp.setStatus(HttpServletResponse.SC_OK);
            return;
```

### DuplicatedCode
Duplicated code
in `leshan-bsserver-demo/src/main/java/org/eclipse/leshan/server/bootstrap/demo/servlet/ServerServlet.java`
#### Snippet
```java
        if ("endpoint".equals(path[0])) {
            resp.setStatus(HttpServletResponse.SC_OK);
            resp.setContentType("application/json");
            resp.getOutputStream().write(String
                    .format("{ \"securedEndpointPort\":\"%s\", \"unsecuredEndpointPort\":\"%s\"}", coapsPort, coapPort)
                    .getBytes(StandardCharsets.UTF_8));
            return;
        }

        resp.sendError(HttpServletResponse.SC_BAD_REQUEST);
```

### DuplicatedCode
Duplicated code
in `leshan-client-cf/src/main/java/org/eclipse/leshan/client/californium/RootResource.java`
#### Snippet
```java
        BootstrapDiscoverResponse response = requestReceiver
                .requestReceived(identity, new BootstrapDiscoverRequest(URI, coapRequest)).getResponse();
        if (response.getCode().isError()) {
            exchange.respond(toCoapResponseCode(response.getCode()), response.getErrorMessage());
        } else {
            exchange.respond(toCoapResponseCode(response.getCode()),
                    toolbox.getLinkSerializer().serializeCoreLinkFormat(response.getObjectLinks()),
                    MediaTypeRegistry.APPLICATION_LINK_FORMAT);
        }
        return;
```

### DuplicatedCode
Duplicated code
in `leshan-client-cf/src/main/java/org/eclipse/leshan/client/californium/X509Util.java`
#### Snippet
```java
        ArrayList<X509Certificate> x509Certificates = new ArrayList<>();

        for (Certificate cert : certificates) {
            if (!(cert instanceof X509Certificate)) {
                throw new CertificateException(String.format(
                        "%s certificate format is not supported, Only X.509 certificate is supported", cert.getType()));
            }
            x509Certificates.add((X509Certificate) cert);
        }
```

### DuplicatedCode
Duplicated code
in `leshan-client-cf/src/main/java/org/eclipse/leshan/client/californium/endpoint/coap/CoapOscoreClientEndpointFactory.java`
#### Snippet
```java
        return new IdentityHandler() {

            @Override
            public Identity getIdentity(Message receivedMessage) {
                EndpointContext context = receivedMessage.getSourceContext();
                InetSocketAddress peerAddress = context.getPeerAddress();
                Principal senderIdentity = context.getPeerIdentity();
                if (senderIdentity == null) {
                    // Build identity for OSCORE if it is used
                    if (context.get(OSCoreEndpointContextInfo.OSCORE_RECIPIENT_ID) != null) {
                        String recipient = context.get(OSCoreEndpointContextInfo.OSCORE_RECIPIENT_ID);
                        return Identity.oscoreOnly(peerAddress,
                                new OscoreIdentity(Hex.decodeHex(recipient.toCharArray())));
                    }
                    return Identity.unsecure(peerAddress);
                } else {
                    return null;
                }
            }

            @Override
            public EndpointContext createEndpointContext(Identity identity, boolean allowConnectionInitiation) {
                // TODO OSCORE : should we add properties to endpoint context ?
                return new AddressEndpointContext(identity.getPeerAddress());
            }
        };
```

### DuplicatedCode
Duplicated code
in `leshan-client-cf/src/main/java/org/eclipse/leshan/client/californium/endpoint/coaps/CoapsClientEndpointFactory.java`
#### Snippet
```java
return new IdentityHandler() {

            @Override
            public Identity getIdentity(Message receivedMessage) {
                EndpointContext context = receivedMessage.getSourceContext();
                InetSocketAddress peerAddress = context.getPeerAddress();
                Principal senderIdentity = context.getPeerIdentity();
                if (senderIdentity != null) {
                    if (senderIdentity instanceof PreSharedKeyIdentity) {
                        return Identity.psk(peerAddress, ((PreSharedKeyIdentity) senderIdentity).getIdentity());
                    } else if (senderIdentity instanceof RawPublicKeyIdentity) {
                        PublicKey publicKey = ((RawPublicKeyIdentity) senderIdentity).getKey();
                        return Identity.rpk(peerAddress, publicKey);
                    } else if (senderIdentity instanceof X500Principal || senderIdentity instanceof X509CertPath) {
                        // Extract common name
                        String x509CommonName = X509CertUtil.extractCN(senderIdentity.getName());
                        return Identity.x509(peerAddress, x509CommonName);
                    }
                    throw new IllegalStateException(
                            String.format("Unable to extract sender identity : unexpected type of Principal %s [%s]",
                                    senderIdentity.getClass(), senderIdentity.toString()));
                }
                return null;
            }

            @Override
            public EndpointContext createEndpointContext(Identity identity, boolean allowConnectionInitiation) {
                Principal peerIdentity = null;
                if (identity != null) {
                    if (identity.isPSK()) {
                        peerIdentity = new PreSharedKeyIdentity(identity.getPskIdentity());
                    } else if (identity.isRPK()) {
                        peerIdentity = new RawPublicKeyIdentity(identity.getRawPublicKey());
                    } else if (identity.isX509()) {
                        /* simplify distinguished name to CN= part */
                        peerIdentity = new X500Principal("CN=" + identity.getX509CommonName());
                    }
                }
                if (peerIdentity != null && allowConnectionInitiation) {
                    return new MapBasedEndpointContext(identity.getPeerAddress(), peerIdentity, new Attributes()
                            .add(DtlsEndpointContext.KEY_HANDSHAKE_MODE, DtlsEndpointContext.HANDSHAKE_MODE_AUTO));
                }
                return new AddressEndpointContext(identity.getPeerAddress(), peerIdentity);
            }
        };
```

### DuplicatedCode
Duplicated code
in `leshan-client-cf/src/main/java/org/eclipse/leshan/client/californium/object/ObjectResource.java`
#### Snippet
```java
                if (response.getCode() == org.eclipse.leshan.core.ResponseCode.CONTENT) {
                    LwM2mPath path = getPath(URI);
                    LwM2mNode content = response.getContent();
                    ContentFormat format = getContentFormat(observeRequest, requestedContentFormat);
                    exchange.respond(ResponseCode.CONTENT,
                            toolbox.getEncoder().encode(content, format, path, toolbox.getModel()), format.getCode());
                    return;
                } else {
                    exchange.respond(toCoapResponseCode(response.getCode()), response.getErrorMessage());
                    return;
                }
```

### DuplicatedCode
Duplicated code
in `leshan-client-cf/src/main/java/org/eclipse/leshan/client/californium/object/ObjectResource.java`
#### Snippet
```java
            if (!coapExchange.getRequestOptions().hasContentFormat()) {
                handleInvalidRequest(coapExchange, "Content Format is mandatory");
                return;
            }

            ContentFormat contentFormat = ContentFormat.fromCode(coapExchange.getRequestOptions().getContentFormat());
            if (!toolbox.getDecoder().isSupported(contentFormat)) {
                coapExchange.respond(ResponseCode.UNSUPPORTED_CONTENT_FORMAT);
                return;
            }
```

### DuplicatedCode
Duplicated code
in `leshan-client-cf/src/main/java/org/eclipse/leshan/client/californium/object/ObjectResource.java`
#### Snippet
```java
            try {
                LwM2mNode lwM2mNode = toolbox.getDecoder().decode(exchange.getRequestPayload(), contentFormat, path,
                        toolbox.getModel());
                WriteResponse response = requestReceiver
                        .requestReceived(identity,
                                new WriteRequest(Mode.UPDATE, contentFormat, URI, lwM2mNode, coapRequest))
                        .getResponse();
                if (response.getCode().isError()) {
                    exchange.respond(toCoapResponseCode(response.getCode()), response.getErrorMessage());
                } else {
                    exchange.respond(toCoapResponseCode(response.getCode()));
                }
            } catch (CodecException e) {
                handleInvalidRequest(exchange.advanced(), "Unable to decode payload on WRITE", e);
            }
            return;
```

### DuplicatedCode
Duplicated code
in `leshan-core/src/main/java/org/eclipse/leshan/core/json/JsonArrayEntry.java`
#### Snippet
```java
        if (booleanValue != null) {
            return booleanValue;
        }
        if (floatValue != null) {
            return floatValue;
        }
        if (objectLinkValue != null) {
            return objectLinkValue;
        }
        if (stringValue != null) {
            return stringValue;
        }
```

### DuplicatedCode
Duplicated code
in `leshan-core/src/main/java/org/eclipse/leshan/core/json/jackson/JsonArrayEntrySerDes.java`
#### Snippet
```java
                if (value instanceof Byte) {
                    o.put("v", value.byteValue());
                } else if (value instanceof Short) {
                    o.put("v", value.shortValue());
                } else if (value instanceof Integer) {
                    o.put("v", value.intValue());
                } else if (value instanceof Long) {
                    o.put("v", value.longValue());
                } else if (value instanceof BigInteger) {
                    o.put("v", (BigInteger) value);
                }
                // unsigned integer
                else if (value instanceof ULong) {
                    o.put("v", ((ULong) value).toBigInteger());
                }
                // floating-point
                else if (value instanceof Float) {
                    o.put("v", value.floatValue());
                } else if (value instanceof Double) {
                    o.put("v", value.doubleValue());
                } else if (value instanceof BigDecimal) {
                    o.put("v", (BigDecimal) value);
                }
```

### DuplicatedCode
Duplicated code
in `leshan-core/src/main/java/org/eclipse/leshan/core/json/jackson/JsonArrayEntrySerDes.java`
#### Snippet
```java
        JsonNode n = o.get("n");
        if (n != null && n.isTextual())
            jae.setName(n.asText());

        JsonNode t = o.get("t");
        if (t != null && t.isNumber())
            jae.setTime(new BigDecimal(t.asText()));

        JsonNode v = o.get("v");
```

### DuplicatedCode
Duplicated code
in `leshan-core/src/main/java/org/eclipse/leshan/core/json/jackson/JsonRootObjectSerDes.java`
#### Snippet
```java
        JsonNode bn = jsonNode.get("bn");
        if (bn != null && bn.isTextual())
            jro.setBaseName(bn.asText());

        JsonNode bt = jsonNode.get("bt");
        if (bt != null && bt.isNumber())
            jro.setBaseTime(new BigDecimal(bt.asText()));
```

### DuplicatedCode
Duplicated code
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/lwm2m/attributes/LwM2mVersionAttributeModel.java`
#### Snippet
```java
        boolean quotedVersion = false;
        if (parser.nextCharIs('"')) {
            parser.consumeNextChar();
            quotedVersion = true;
        }

        // parse Major
        int start = parser.getPosition();
        parser.consumeDIGIT();
        while (parser.nextCharIsDIGIT()) {
            parser.consumeNextChar();
        }
        parser.consumeChar('.');
        parser.consumeDIGIT();
        while (parser.nextCharIsDIGIT()) {
            parser.consumeNextChar();
        }
        int end = parser.getPosition();

        // handle ending quote
        if (quotedVersion) {
            parser.consumeChar('"');
        }

        // validate version
        String strValue = parser.substring(start, end);
        String err = Version.validate(strValue);
```

### DuplicatedCode
Duplicated code
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/LwM2mNodeUtil.java`
#### Snippet
```java
            cause = getInvalidObjectIdCause(path.getObjectId());
            if (cause != null)
                return cause;
            cause = getInvalidObjectInstanceIdCause(path.getObjectInstanceId());
            if (cause != null)
                return cause;
            cause = getInvalidResourceIdCause(path.getResourceId());
            if (cause != null)
                return cause;
```

### DuplicatedCode
Duplicated code
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/LwM2mNodeUtil.java`
#### Snippet
```java
            cause = getInvalidObjectIdCause(path.getObjectId());
            if (cause != null)
                return cause;
            cause = getInvalidUndefinedObjectInstanceIdCause(path.getObjectInstanceId());
            if (cause != null)
                return cause;
            cause = getInvalidResourceIdCause(path.getResourceId());
            if (cause != null)
                return cause;
```

### DuplicatedCode
Duplicated code
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/codec/DefaultLwM2mDecoder.java`
#### Snippet
```java
        LOG.trace("Decoding value for path {} and format {}: {}", path, format, content);
        Validate.notNull(path);

        if (format == null) {
            throw new CodecException("Content format is mandatory. [%s]", path);
        }

        NodeDecoder decoder = nodeDecoders.get(format);
        if (decoder == null) {
            throw new CodecException("Content format %s is not supported [%s]", format, path);
        }
```

### DuplicatedCode
Duplicated code
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/codec/cbor/LwM2mNodeCborEncoder.java`
#### Snippet
```java
        Validate.notNull(node);
        Validate.notNull(path);
        Validate.notNull(model);

        InternalEncoder internalEncoder = new InternalEncoder();
        internalEncoder.path = path;
        internalEncoder.model = model;
        internalEncoder.converter = converter;
        node.accept(internalEncoder);
```

### DuplicatedCode
Duplicated code
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/codec/cbor/LwM2mNodeCborEncoder.java`
#### Snippet
```java
            ResourceModel rSpec = model.getResourceModel(path.getObjectId(), resource.getId());
            Type expectedType = rSpec != null ? rSpec.type : resource.getType();
            Object val = converter.convertValue(resource.getValue(), resource.getType(), expectedType, path);

            if (expectedType == null) {
                throw new CodecException(
                        "Unable to encode value for resource {} without type(probably a executable one)", path);
            }
```

### DuplicatedCode
Duplicated code
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/codec/cbor/LwM2mNodeCborEncoder.java`
#### Snippet
```java
            ResourceModel rSpec = model.getResourceModel(path.getObjectId(), path.getResourceId());
            Type expectedType = rSpec != null ? rSpec.type : instance.getType();
            Object val = converter.convertValue(instance.getValue(), instance.getType(), expectedType, path);

            if (expectedType == null) {
                throw new CodecException(
                        "Unable to encode value for resource {} without type(probably a executable one)", path);
            }
```

### DuplicatedCode
Duplicated code
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/codec/json/LwM2mNodeJsonDecoder.java`
#### Snippet
```java
                LwM2mResource resource = resourcesMap.values().iterator().next();
                if (!resource.isMultiInstances()) {
                    throw new CodecException("Resource should be multi Instances resource [path:%s]", requestPath);
                }

                if (resource.getInstances().isEmpty()) {
                    throw new CodecException("Resource instances should not be not empty [path:%s]", requestPath);
                }

                if (resource.getInstances().size() > 1) {
                    throw new CodecException("Resource instances should not be > 1 [path:%s]", requestPath);
                }
```

### DuplicatedCode
Duplicated code
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/codec/json/LwM2mNodeJsonDecoder.java`
#### Snippet
```java
        SortedMap<BigDecimal, Collection<JsonArrayEntry>> result = new TreeMap<>(new Comparator<BigDecimal>() {
            @Override
            public int compare(BigDecimal o1, BigDecimal o2) {
                // comparator which
                // - supports null (time null means 0 if there is a base time)
                // - reverses natural order (most recent value in first)
                if (o1 == null) {
                    return o2 == null ? 0 : 1;
                } else if (o2 == null) {
                    return -1;
                } else {
                    return o2.compareTo(o1);
                }
            }
        });
```

### DuplicatedCode
Duplicated code
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/codec/json/LwM2mNodeJsonDecoder.java`
#### Snippet
```java
                ResourceModel resourceModel = model.getResourceModel(path.getObjectId(), path.getResourceId());
                // We create it only if this respect the model
                if (resourceModel == null || resourceModel.multiple) {
                    Type resourceType = getResourceType(path, model, null);
                    lwM2mResourceMap.put(path.getResourceId(), LwM2mMultipleResource.newResource(path.getResourceId(),
                            new HashMap<Integer, Object>(), resourceType));
                }
```

### DuplicatedCode
Duplicated code
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/codec/json/LwM2mNodeJsonEncoder.java`
#### Snippet
```java
        Validate.notNull(node);
        Validate.notNull(path);
        Validate.notNull(model);

        InternalEncoder internalEncoder = new InternalEncoder();
        internalEncoder.objectId = path.getObjectId();
        internalEncoder.model = model;
        internalEncoder.requestPath = path;
        internalEncoder.converter = converter;
        node.accept(internalEncoder);
```

### DuplicatedCode
Duplicated code
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/codec/senml/LwM2mNodeSenMLEncoder.java`
#### Snippet
```java
            LwM2mPath path = entry.getKey();
            InternalEncoder internalEncoder = new InternalEncoder();
            internalEncoder.objectId = path.getObjectId();
            internalEncoder.model = model;
            internalEncoder.requestPath = path;
            internalEncoder.converter = converter;
            internalEncoder.records = new ArrayList<>();
            LwM2mNode node = entry.getValue();
```

### DuplicatedCode
Duplicated code
in `leshan-core/src/main/java/org/eclipse/leshan/core/response/BootstrapReadResponse.java`
#### Snippet
```java
        switch (code.getCode()) {
        case ResponseCode.CONTENT_CODE:
        case ResponseCode.BAD_REQUEST_CODE:
        case ResponseCode.UNAUTHORIZED_CODE:
        case ResponseCode.NOT_FOUND_CODE:
        case ResponseCode.METHOD_NOT_ALLOWED_CODE:
        case ResponseCode.NOT_ACCEPTABLE_CODE:
        case ResponseCode.INTERNAL_SERVER_ERROR_CODE:
            return true;
        default:
            return false;
        }
```

### DuplicatedCode
Duplicated code
in `leshan-core/src/main/java/org/eclipse/leshan/core/response/ExecuteResponse.java`
#### Snippet
```java
        switch (code.getCode()) {
        case ResponseCode.CHANGED_CODE:
        case ResponseCode.BAD_REQUEST_CODE:
        case ResponseCode.UNAUTHORIZED_CODE:
        case ResponseCode.NOT_FOUND_CODE:
        case ResponseCode.METHOD_NOT_ALLOWED_CODE:
        case ResponseCode.INTERNAL_SERVER_ERROR_CODE:
            return true;
        default:
            return false;
        }
```

### DuplicatedCode
Duplicated code
in `leshan-core/src/main/java/org/eclipse/leshan/core/response/SendResponse.java`
#### Snippet
```java
        switch (code.getCode()) {
        case ResponseCode.CHANGED_CODE:
        case ResponseCode.BAD_REQUEST_CODE:
        case ResponseCode.NOT_FOUND_CODE:
        case ResponseCode.INTERNAL_SERVER_ERROR_CODE:
            return true;
        default:
            return false;
        }
```

### DuplicatedCode
Duplicated code
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/LwM2mOscoreStore.java`
#### Snippet
```java
        OscoreIdentity oscoreIdentity = new OscoreIdentity(recipientID);
        SecurityInfo securityInfo = securityStore.getByOscoreIdentity(oscoreIdentity);
        if (securityInfo == null || !securityInfo.useOSCORE())
            return null;

        try {
            return new OscoreParameters(//
                    securityInfo.getOscoreSetting().getSenderId(), //
                    securityInfo.getOscoreSetting().getRecipientId(), //
                    securityInfo.getOscoreSetting().getMasterSecret(), //
                    // TODO OSCORE we maybe need an API without the need to create a CBOR Object
                    AlgorithmID.FromCBOR(
                            CBORObject.FromObject(securityInfo.getOscoreSetting().getAeadAlgorithm().getValue())), //
                    AlgorithmID.FromCBOR(
                            CBORObject.FromObject(securityInfo.getOscoreSetting().getHkdfAlgorithm().getValue())), //
                    // TODO OSCORE kind of hack because californium doesn't support an empty byte[] array for salt ?
                    securityInfo.getOscoreSetting().getMasterSalt().length == 0 ? null
                            : securityInfo.getOscoreSetting().getMasterSalt());
        } catch (CoseException e) {
            LOG.error("Unable to create OscoreParameters from OoscoreSetting %s", securityInfo.getOscoreSetting(), e);
            return null;
        }
```

### DuplicatedCode
Duplicated code
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/bootstrap/endpoint/coaps/CoapsBootstrapServerEndpointFactory.java`
#### Snippet
```java
        if (server.getSecurityStore() == null) {
            return null;
        }

        // defined Configuration to use
        Configuration configurationToUse;
        if (configuration == null) {
            // if specific configuration for this endpoint is null, used the default one which is the coapServer
            // Configuration shared with all endpoints by default.
            configurationToUse = defaultConfiguration;
        } else {
            configurationToUse = configuration;
        }

        // create DTLS connector Config
        DtlsConnectorConfig.Builder dtlsConfigBuilder = createDtlsConnectorConfigBuilder(configurationToUse);
        setUpDtlsConfig(dtlsConfigBuilder, EndpointUriUtil.getSocketAddr(endpointUri), serverSecurityInfo, server);
        DtlsConnectorConfig dtlsConfig;
        try {
            dtlsConfig = dtlsConfigBuilder.build();
        } catch (IllegalStateException e) {
            LOG.warn("Unable to create DTLS config for endpont {}.", endpointUri.toString(), e);
            return null;
        }
```

### DuplicatedCode
Duplicated code
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/bootstrap/endpoint/coaps/CoapsBootstrapServerEndpointFactory.java`
#### Snippet
```java
if (incompleteConfig.getCertificateIdentityProvider() != null) {
            if (serverSecurityInfo.getPrivateKey() != null) {
                throw new IllegalStateException(String.format(
                        "Configuration conflict between LeshanBuilder and DtlsConnectorConfig.Builder for private key"));
            }
            if (serverSecurityInfo.getPublicKey() != null) {
                throw new IllegalStateException(String.format(
                        "Configuration conflict between LeshanBuilder and DtlsConnectorConfig.Builder for public key"));
            }
            if (serverSecurityInfo.getCertificateChain() != null) {
                throw new IllegalStateException(String.format(
                        "Configuration conflict between LeshanBuilder and DtlsConnectorConfig.Builder for certificate chain"));
            }
        } else if (serverSecurityInfo.getPrivateKey() != null) {
            // if in raw key mode and not in X.509 set the raw keys
            if (serverSecurityInfo.getCertificateChain() == null && serverSecurityInfo.getPublicKey() != null) {
                dtlsConfigBuilder.setCertificateIdentityProvider(new SingleCertificateProvider(
                        serverSecurityInfo.getPrivateKey(), serverSecurityInfo.getPublicKey()));
            }
            // if in X.509 mode set the private key, certificate chain, public key is extracted from the certificate
            if (serverSecurityInfo.getCertificateChain() != null
                    && serverSecurityInfo.getCertificateChain().length > 0) {

                dtlsConfigBuilder.setCertificateIdentityProvider(new SingleCertificateProvider(
                        serverSecurityInfo.getPrivateKey(), serverSecurityInfo.getCertificateChain(),
                        CertificateType.X_509, CertificateType.RAW_PUBLIC_KEY));
            }
        }

        // handle trusted certificates or RPK
        if (incompleteConfig.getAdvancedCertificateVerifier() != null) {
            if (serverSecurityInfo.getTrustedCertificates() != null) {
                throw new IllegalStateException(
                        "Configuration conflict between LeshanBuilder and DtlsConnectorConfig.Builder: if a AdvancedCertificateVerifier is set, trustedCertificates must not be set.");
            }
        } else if (incompleteConfig.getCertificateIdentityProvider() != null) {
            StaticNewAdvancedCertificateVerifier.Builder verifierBuilder = StaticNewAdvancedCertificateVerifier
                    .builder();
            // by default trust all RPK
            verifierBuilder.setTrustAllRPKs();
            if (serverSecurityInfo.getTrustedCertificates() != null) {
                verifierBuilder.setTrustedCertificates(serverSecurityInfo.getTrustedCertificates());
            }
            dtlsConfigBuilder.setAdvancedCertificateVerifier(verifierBuilder.build());
        }
```

### DuplicatedCode
Duplicated code
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/bootstrap/request/CoapRequestBuilder.java`
#### Snippet
```java
        coapRequest = Request.newPut();
        coapRequest.setConfirmable(true);
        ContentFormat format = request.getContentFormat();
        coapRequest.getOptions().setContentFormat(format.getCode());
        coapRequest.setPayload(encoder.encode(request.getNode(), format, request.getPath(), model));
        setURI(coapRequest, request.getPath());
        setSecurityContext(coapRequest);
```

### DuplicatedCode
Duplicated code
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/bootstrap/request/CoapRequestBuilder.java`
#### Snippet
```java
        if (path.getObjectId() != null) {
            coapRequest.getOptions().addUriPath(Integer.toString(path.getObjectId()));
        }

        // objectInstanceId
        if (path.getObjectInstanceId() == null) {
            if (path.getResourceId() != null) {
                coapRequest.getOptions().addUriPath("0"); // default instanceId
            }
        } else {
            coapRequest.getOptions().addUriPath(Integer.toString(path.getObjectInstanceId()));
        }

        // resourceId
        if (path.getResourceId() != null) {
            coapRequest.getOptions().addUriPath(Integer.toString(path.getResourceId()));
        }

        // resourceInstanceId
        if (path.getResourceInstanceId() != null) {
            coapRequest.getOptions().addUriPath(Integer.toString(path.getResourceInstanceId()));
        }
```

### DuplicatedCode
Duplicated code
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/bootstrap/request/LwM2mResponseBuilder.java`
#### Snippet
```java
        if (coapResponse.isError()) {
            // handle error response:
            lwM2mresponse = new BootstrapDiscoverResponse(toLwM2mResponseCode(coapResponse.getCode()), null,
                    coapResponse.getPayloadString(), coapResponse);
        } else if (isResponseCodeContent()) {
            // handle success response:
            LwM2mLink[] links;
            if (MediaTypeRegistry.APPLICATION_LINK_FORMAT != coapResponse.getOptions().getContentFormat()) {
                throw new InvalidResponseException("Client [%s] returned unexpected content format [%s] for [%s]",
                        clientEndpoint, coapResponse.getOptions().getContentFormat(), request);
            } else {
                try {
                    links = linkParser.parseLwM2mLinkFromCoreLinkFormat(coapResponse.getPayload(), null);
                } catch (LinkParseException e) {
                    throw new InvalidResponseException(e,
                            "Unable to decode response payload of request [%s] from client [%s]", request,
                            clientEndpoint);
                }
            }
            lwM2mresponse = new BootstrapDiscoverResponse(ResponseCode.CONTENT, links, null, coapResponse);
        } else {
            // handle unexpected response:
            handleUnexpectedResponseCode(clientEndpoint, request, coapResponse);
        }
```

### DuplicatedCode
Duplicated code
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/bootstrap/request/LwM2mResponseBuilder.java`
#### Snippet
```java
        if (coapResponse.isError()) {
            // handle error response:
            lwM2mresponse = new BootstrapReadResponse(toLwM2mResponseCode(coapResponse.getCode()), null,
                    coapResponse.getPayloadString(), coapResponse);
        } else if (isResponseCodeContent()) {
            // handle success response:
            LwM2mNode content = decodeCoapResponse(request.getPath(), coapResponse, request, clientEndpoint);
            lwM2mresponse = new BootstrapReadResponse(ResponseCode.CONTENT, content, null, coapResponse);
        } else {
            // handle unexpected response:
            handleUnexpectedResponseCode(clientEndpoint, request, coapResponse);
        }
```

### DuplicatedCode
Duplicated code
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/bootstrap/request/LwM2mResponseBuilder.java`
#### Snippet
```java
        if (coapResponse.isError()) {
            // handle error response:
            lwM2mresponse = new BootstrapDeleteResponse(toLwM2mResponseCode(coapResponse.getCode()),
                    coapResponse.getPayloadString(), coapResponse);
        } else if (coapResponse.getCode() == org.eclipse.californium.core.coap.CoAP.ResponseCode.DELETED) {
            // handle success response:
            lwM2mresponse = new BootstrapDeleteResponse(ResponseCode.DELETED, null, coapResponse);
        } else {
            // handle unexpected response:
            handleUnexpectedResponseCode(clientEndpoint, request, coapResponse);
        }
```

### DuplicatedCode
Duplicated code
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/bootstrap/request/LwM2mResponseBuilder.java`
#### Snippet
```java
        ContentFormat contentFormat = null;
        if (coapResponse.getOptions().hasContentFormat()) {
            contentFormat = ContentFormat.fromCode(coapResponse.getOptions().getContentFormat());
        }

        // Decode payload
        try {
            return decoder.decode(coapResponse.getPayload(), contentFormat, path, model);
        } catch (CodecException e) {
            if (LOG.isDebugEnabled()) {
                byte[] payload = coapResponse.getPayload() == null ? new byte[0] : coapResponse.getPayload();
                LOG.debug(
                        String.format("Unable to decode response payload of request [%s] from client [%s] [payload:%s]",
                                request, endpoint, Hex.encodeHexString(payload)));
            }
            throw new InvalidResponseException(e, "Unable to decode response payload of request [%s] from client [%s]",
                    request, endpoint);
        }
```

### DuplicatedCode
Duplicated code
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/request/LwM2mResponseBuilder.java`
#### Snippet
```java
        } catch (CodecException e) {
            if (LOG.isDebugEnabled()) {
                byte[] payload = coapResponse.getPayload() == null ? new byte[0] : coapResponse.getPayload();
                LOG.debug(
                        String.format("Unable to decode response payload of request [%s] from client [%s] [payload:%s]",
                                request, endpoint, Hex.encodeHexString(payload)));
            }
            throw new InvalidResponseException(e, "Unable to decode response payload of request [%s] from client [%s]",
                    request, endpoint);
        }
```

### DuplicatedCode
Duplicated code
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/endpoint/CaliforniumServerEndpoint.java`
#### Snippet
```java
            @Override
            public T buildResponse(Response coapResponse) {
                // Build LwM2m response
                T lwM2mResponse = translator.createLwM2mResponse(destination, lwm2mRequest, coapRequest, coapResponse,
                        toolbox);
                // Handle special observe case
                if (lwM2mResponse != null && lwM2mResponse.isSuccess()) {
                    Observation observation = null;
                    if (lwM2mResponse instanceof ObserveResponse) {
                        observation = ((ObserveResponse) lwM2mResponse).getObservation();
                    } else if (lwM2mResponse instanceof ObserveCompositeResponse) {
                        observation = ((ObserveCompositeResponse) lwM2mResponse).getObservation();
                    }
                    if (observation != null) {
                        notificationReceiver.newObservation(observation, destination.getRegistration());
                    }
                }
                return lwM2mResponse;
            }
```

### DuplicatedCode
Duplicated code
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/observation/LwM2mObservationStore.java`
#### Snippet
```java
        Observation previousObservation = null;
        if (removed != null && !removed.isEmpty()) {
            for (org.eclipse.leshan.core.observation.Observation observation : removed) {
                if (Arrays.equals(observation.getId().getBytes(), token.getBytes())) {
                    previousObservation = buildCoapObservation(observation);
                    break;
                }
            }
        }
        for (org.eclipse.leshan.core.observation.Observation observation : removed) {
            notificationListener.cancelled(observation);
        }
        return previousObservation;
```

### DuplicatedCode
Duplicated code
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/request/CoapRequestBuilder.java`
#### Snippet
```java
        ContentFormat format = request.getContentFormat();
        coapRequest.getOptions().setContentFormat(format.getCode());
        coapRequest.setPayload(encoder.encode(request.getNode(), format, request.getPath(), model));
        setURI(coapRequest, request.getPath());
        setSecurityContext(coapRequest);
        applyLowerLayerConfig(coapRequest);
```

### DuplicatedCode
Duplicated code
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/request/CoapRequestBuilder.java`
#### Snippet
```java
        coapRequest.getOptions().setContentFormat(request.getRequestContentFormat().getCode());
        coapRequest.setPayload(encoder.encodePaths(request.getPaths(), request.getRequestContentFormat()));
        if (request.getResponseContentFormat() != null) {
            coapRequest.getOptions().setAccept(request.getResponseContentFormat().getCode());
        }

        setURI(coapRequest, LwM2mPath.ROOTPATH);
        setSecurityContext(coapRequest);
        applyLowerLayerConfig(coapRequest);
```

### DuplicatedCode
Duplicated code
in `leshan-server-core-demo/src/main/java/org/eclipse/leshan/server/core/demo/json/JacksonSecurityDeserializer.java`
#### Snippet
```java
                String identity;
                if (oPsk.has("identity")) {
                    identity = oPsk.get("identity").asText();
                } else {
                    throw new JsonParseException(p, "Missing PSK identity");
                }

                // get key
                byte[] key;
                try {
                    key = Hex.decodeHex(oPsk.get("key").asText().toCharArray());
                } catch (IllegalArgumentException e) {
                    throw new JsonParseException(p, "key parameter must be a valid hex string", e);
                }
```

### DuplicatedCode
Duplicated code
in `leshan-server-core-demo/src/main/java/org/eclipse/leshan/server/core/demo/json/PublicKeySerDes.java`
#### Snippet
```java
        byte[] x = ecPublicKey.getW().getAffineX().toByteArray();
        if (x[0] == 0)
            x = Arrays.copyOfRange(x, 1, x.length);
        o.put("x", Hex.encodeHexString(x));

        // Get Y coordinate
        byte[] y = ecPublicKey.getW().getAffineY().toByteArray();
        if (y[0] == 0)
            y = Arrays.copyOfRange(y, 1, y.length);
        o.put("y", Hex.encodeHexString(y));
```

### DuplicatedCode
Duplicated code
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/bootstrap/BootstrapUtil.java`
#### Snippet
```java
        for (Entry<Integer, ServerConfig> server : bootstrapConfig.servers.entrySet()) {
            requests.add(toWriteRequest(server.getKey(), server.getValue(), contentFormat));
        }
        // handle acl
        for (Entry<Integer, ACLConfig> acl : bootstrapConfig.acls.entrySet()) {
            requests.add(toWriteRequest(acl.getKey(), acl.getValue(), contentFormat));
        }
        // handle oscore
        for (Entry<Integer, OscoreObject> oscore : bootstrapConfig.oscore.entrySet()) {
            requests.add(toWriteRequest(oscore.getKey(), oscore.getValue(), contentFormat));
        }
        return (requests);
```

### DuplicatedCode
Duplicated code
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/registration/InMemoryRegistrationStore.java`
#### Snippet
```java
        if (observation instanceof SingleObservation && obs instanceof SingleObservation) {
            return ((SingleObservation) observation).getPath().equals(((SingleObservation) obs).getPath());
        }
        if (observation instanceof CompositeObservation && obs instanceof CompositeObservation) {
            return ((CompositeObservation) observation).getPaths().equals(((CompositeObservation) obs).getPaths());
        }
        return false;
```

### DuplicatedCode
Duplicated code
in `leshan-server-demo/src/main/java/org/eclipse/leshan/server/demo/model/ObjectModelSerDes.java`
#### Snippet
```java
        if (o == null)
            return null;

        if (!o.isObject())
            return null;

        int id = o.get("id").asInt(-1);
        if (id < 0)
            return null;

        String name = o.get("name").asText();
```

### DuplicatedCode
Duplicated code
in `leshan-server-demo/src/main/java/org/eclipse/leshan/server/demo/servlet/ClientServlet.java`
#### Snippet
```java
                    String pathContentFormatParam = req.getParameter(PATH_FORMAT_PARAM);
                    ContentFormat pathContentFormat = pathContentFormatParam != null
                            ? ContentFormat.fromName(pathContentFormatParam.toUpperCase())
                            : null;
                    String nodeContentFormatParam = req.getParameter(NODE_FORMAT_PARAM);
                    ContentFormat nodeContentFormat = nodeContentFormatParam != null
                            ? ContentFormat.fromName(nodeContentFormatParam.toUpperCase())
                            : null;
```

### DuplicatedCode
Duplicated code
in `leshan-server-demo/src/main/java/org/eclipse/leshan/server/demo/servlet/json/JacksonSecurityDeserializer.java`
#### Snippet
```java
                        byte[] x = Hex.decodeHex(rpk.get("x").asText().toCharArray());
                        byte[] y = Hex.decodeHex(rpk.get("y").asText().toCharArray());
                        String params = rpk.get("params").asText();

                        AlgorithmParameters algoParameters = AlgorithmParameters.getInstance("EC");
                        algoParameters.init(new ECGenParameterSpec(params));
                        ECParameterSpec parameterSpec = algoParameters.getParameterSpec(ECParameterSpec.class);

                        KeySpec keySpec = new ECPublicKeySpec(new ECPoint(new BigInteger(1, x), new BigInteger(1, y)),
                                parameterSpec);

                        key = KeyFactory.getInstance("EC").generatePublic(keySpec);
```

### DuplicatedCode
Duplicated code
in `leshan-server-redis/src/main/java/org/eclipse/leshan/server/redis/serialization/ObservationSerDes.java`
#### Snippet
```java
            Map<String, String> context = null;
            ObjectNode jUserContext = (ObjectNode) n.get(OBS_USER_CONTEXT);
            if (jUserContext != null) {
                context = new HashMap<>();
                for (Iterator<String> it = jUserContext.fieldNames(); it.hasNext();) {
                    String k = it.next();
                    context.put(k, jUserContext.get(k).asText());
                }
            }
```

## RuleId[id=CatchMayIgnoreException]
### CatchMayIgnoreException
Empty `catch` block
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/engine/DefaultRegistrationEngine.java`
#### Snippet
```java
                }
            }
        } catch (InterruptedException e) {
        }
    }
```

### CatchMayIgnoreException
Empty `catch` block
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/engine/DefaultRegistrationEngine.java`
#### Snippet
```java
                }
            }
        } catch (InterruptedException e) {
        }
    }
```

### CatchMayIgnoreException
Empty `catch` block
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/engine/DefaultRegistrationEngine.java`
#### Snippet
```java
                                }
                            }
                        } catch (InterruptedException e) {
                        }

```

### CatchMayIgnoreException
Empty `catch` block
in `leshan-server-redis/src/main/java/org/eclipse/leshan/server/redis/SingleInstanceJedisLock.java`
#### Snippet
```java
            try {
                Thread.sleep(iterationTime);
            } catch (InterruptedException e) {
            }
        }
```

### CatchMayIgnoreException
Empty `catch` block
in `leshan-server-redis/src/main/java/org/eclipse/leshan/server/redis/RedisLock.java`
#### Snippet
```java
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
            }
        }
```

### CatchMayIgnoreException
Empty `catch` block
in `leshan-client-demo/src/main/java/org/eclipse/leshan/client/demo/MyDevice.java`
#### Snippet
```java
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                    }
                    getLwM2mClient().start();
```

## RuleId[id=IOStreamConstructor]
### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/security/FileSecurityStore.java`
#### Snippet
```java
                file.createNewFile();
            }
            try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename));) {
                out.writeObject(this.getAll().toArray(new SecurityInfo[0]));
            }
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/security/FileSecurityStore.java`
#### Snippet
```java
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));) {
            SecurityInfo[] infos = (SecurityInfo[]) in.readObject();

```

### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `leshan-bsserver-demo/src/main/java/org/eclipse/leshan/server/bootstrap/demo/JSONFileBootstrapStore.java`
#### Snippet
```java

            // Write file
            try (OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream(filename))) {
                out.write(mapper.writeValueAsString(getAll()));
            }
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `leshan-bsserver-demo/src/main/java/org/eclipse/leshan/server/bootstrap/demo/JSONFileBootstrapStore.java`
#### Snippet
```java
            File file = new File(filename);
            if (file.exists()) {
                try (InputStreamReader in = new InputStreamReader(new FileInputStream(file))) {
                    TypeReference<Map<String, BootstrapConfig>> bootstrapConfigTypeRef = new TypeReference<Map<String, BootstrapConfig>>() {
                    };
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `leshan-core/src/main/java/org/eclipse/leshan/core/model/DDFFileParser.java`
#### Snippet
```java
     */
    public List<ObjectModel> parse(File ddfFile) throws InvalidDDFFileException, IOException {
        try (InputStream input = new FileInputStream(ddfFile)) {
            return parse(input, ddfFile.getName());
        }
```

## RuleId[id=CollectionAddAllCanBeReplacedWithConstructor]
### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/registration/Registration.java`
#### Snippet
```java

            // add content format from ct attributes
            supportedContentFormats.addAll(ctValue.getValue());

            // add mandatory content format
```

### CollectionAddAllCanBeReplacedWithConstructor
'putAll()' call can be replaced with parametrized constructor call
in `leshan-client-cf/src/main/java/org/eclipse/leshan/client/californium/request/CoapRequestBuilder.java`
#### Snippet
```java

        HashMap<String, String> attributes = new HashMap<>();
        attributes.putAll(request.getAdditionalAttributes());

        attributes.put("ep", request.getEndpointName());
```

### CollectionAddAllCanBeReplacedWithConstructor
'putAll()' call can be replaced with parametrized constructor call
in `leshan-client-cf/src/main/java/org/eclipse/leshan/client/californium/request/CoapRequestBuilder.java`
#### Snippet
```java
        // @since 1.1
        HashMap<String, String> attributes = new HashMap<>();
        attributes.putAll(request.getAdditionalAttributes());
        attributes.put("ep", request.getEndpointName());
        if (request.getPreferredContentFormat() != null) {
```

### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `leshan-core/src/main/java/org/eclipse/leshan/core/model/ObjectLoader.java`
#### Snippet
```java
        LOG.debug("Loading OMA standard object models");
        try {
            models.addAll(loadDdfResources("/models/", ddfpaths));
        } catch (Exception e) {
            throw new IllegalStateException("Unable to load models", e);
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/endpoint/coaps/CoapsServerEndpointFactory.java`
#### Snippet
```java
                    throw new IllegalStateException(
                            String.format("Unable to extract sender identity : unexpected type of Principal %s [%s]",
                                    senderIdentity.getClass(), senderIdentity.toString()));
                }
                return null;
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/endpoint/coaps/CoapsServerEndpointFactory.java`
#### Snippet
```java
            dtlsConfig = dtlsConfigBuilder.build();
        } catch (IllegalStateException e) {
            LOG.warn("Unable to create DTLS config for endpont {}.", endpointUri.toString(), e);
            return null;
        }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/bootstrap/endpoint/coaps/CoapsBootstrapServerEndpointFactory.java`
#### Snippet
```java
                    throw new IllegalStateException(
                            String.format("Unable to extract sender identity : unexpected type of Principal %s [%s]",
                                    senderIdentity.getClass(), senderIdentity.toString()));
                }
                return null;
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/bootstrap/endpoint/coaps/CoapsBootstrapServerEndpointFactory.java`
#### Snippet
```java
            dtlsConfig = dtlsConfigBuilder.build();
        } catch (IllegalStateException e) {
            LOG.warn("Unable to create DTLS config for endpont {}.", endpointUri.toString(), e);
            return null;
        }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `leshan-client-cf/src/main/java/org/eclipse/leshan/client/californium/endpoint/coaps/CoapsClientEndpointFactory.java`
#### Snippet
```java
                    throw new IllegalStateException(
                            String.format("Unable to extract sender identity : unexpected type of Principal %s [%s]",
                                    senderIdentity.getClass(), senderIdentity.toString()));
                }
                return null;
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `leshan-core-demo/src/main/java/org/eclipse/leshan/core/demo/cli/ShortErrorMessageHandler.java`
#### Snippet
```java
            Layout layout = help.createDefaultLayout();
            layout.addOption((OptionSpec) ex.getArgSpec(), help.createDefaultParamLabelRenderer());
            writer.println(layout.toString());
        } else if (ex.getArgSpec() instanceof PositionalParamSpec) {
            Help help = cmd.getHelpFactory().create(cmd.getCommandSpec(), cmd.getColorScheme());
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `leshan-core-demo/src/main/java/org/eclipse/leshan/core/demo/cli/ShortErrorMessageHandler.java`
#### Snippet
```java
            layout.addPositionalParameter((PositionalParamSpec) ex.getArgSpec(),
                    help.createDefaultParamLabelRenderer());
            writer.println(layout.toString());
        }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `leshan-core-demo/src/main/java/org/eclipse/leshan/core/demo/cli/converters/TruststoreConverter.java`
#### Snippet
```java
            if (!input.exists()) {
                throw new TypeConversionException(
                        "Failed to load trust store - file or directory does not exist : " + input.toString());
            }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/lwm2m/MixedLwM2mLink.java`
#### Snippet
```java
            return rootPath;
        } else {
            return rootPath + path.toString();
        }
    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/LwM2mPath.java`
#### Snippet
```java
            return pathToAdd;
        } else {
            return new LwM2mPath(this.toString() + pathToAdd.toString());
        }
    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/LwM2mPath.java`
#### Snippet
```java
            return pathToAdd;
        } else {
            return new LwM2mPath(this.toString() + pathToAdd.toString());
        }
    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `leshan-server-demo/src/main/java/org/eclipse/leshan/server/demo/model/FileLister.java`
#### Snippet
```java
        }

        System.out.println(builder.toString());

    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `leshan-server-demo/src/main/java/org/eclipse/leshan/server/demo/servlet/EventServlet.java`
#### Snippet
```java
                    sendEvent(EVENT_SEND, eventData, registration.getEndpoint());
                } catch (JsonProcessingException e) {
                    Log.warn(String.format("Error while processing json [%s] : [%s]", data.toString(), e.getMessage()));
                }
            }
```

## RuleId[id=DanglingJavadoc]
### DanglingJavadoc
Dangling Javadoc comment
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/observation/EndpointContextSerDes.java`
#### Snippet
```java
            }
        }
        /** copy the attributes **/
        Map<Definition<?>, Object> attributes = context.entries();
        if (!attributes.isEmpty()) {
```

## RuleId[id=SuspiciousMethodCalls]
### SuspiciousMethodCalls
'ConcurrentMap' may not contain keys of type 'Identity'
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/bootstrap/OscoreBootstrapListener.java`
#### Snippet
```java
    @Override
    public void end(BootstrapSession session) {
        addrToSession.remove(session.getIdentity(), session);

    }
```

### SuspiciousMethodCalls
'ConcurrentMap' may not contain keys of type 'Identity'
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/bootstrap/OscoreBootstrapListener.java`
#### Snippet
```java
    @Override
    public void failed(BootstrapSession session, BootstrapFailureCause cause) {
        addrToSession.remove(session.getIdentity(), session);
    }

```

## RuleId[id=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `ErrorResponseCreator` may be 'static'
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/request/DefaultDownlinkReceiver.java`
#### Snippet
```java
    }

    public class ErrorResponseCreator<T extends LwM2mResponse> implements DownlinkRequestVisitor {

        private final ResponseCode code;
```

### InnerClassMayBeStatic
Inner class `BootstrapEvent` may be 'static'
in `leshan-bsserver-demo/src/main/java/org/eclipse/leshan/server/bootstrap/demo/servlet/EventServlet.java`
#### Snippet
```java

    @SuppressWarnings("unused")
    private class BootstrapEvent {
        public String name;
        public String endpoint;
```

### InnerClassMayBeStatic
Inner class `RegUpdate` may be 'static'
in `leshan-server-demo/src/main/java/org/eclipse/leshan/server/demo/servlet/EventServlet.java`
#### Snippet
```java

    @SuppressWarnings("unused")
    private class RegUpdate {
        public Registration registration;
        public RegistrationUpdate update;
```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/security/SecurityInfo.java`
#### Snippet
```java
            return false;
        if (oscoreSetting == null) {
            if (other.oscoreSetting != null)
                return false;
        } else if (!oscoreSetting.equals(other.oscoreSetting))
```

### TrivialIf
`if` statement can be simplified
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/security/SecurityInfo.java`
#### Snippet
```java
            if (other.oscoreSetting != null)
                return false;
        } else if (!oscoreSetting.equals(other.oscoreSetting))
            return false;

```

### TrivialIf
`if` statement can be simplified
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/bootstrap/InMemoryBootstrapConfigStore.java`
#### Snippet
```java
                return false;
            if (serverUrl == null) {
                if (other.serverUrl != null)
                    return false;
            } else if (!serverUrl.equals(other.serverUrl))
```

### TrivialIf
`if` statement can be simplified
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/bootstrap/InMemoryBootstrapConfigStore.java`
#### Snippet
```java
                if (other.serverUrl != null)
                    return false;
            } else if (!serverUrl.equals(other.serverUrl))
                return false;
            return true;
```

### TrivialIf
`if` statement can be simplified
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/registration/InMemoryRegistrationStore.java`
#### Snippet
```java
            lock.readLock().lock();
            Observation observation = unsafeGetObservation(observationId);
            if (observation != null) {
                return observation;
            }
```

### TrivialIf
`if` statement can be simplified
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/registration/Registration.java`
#### Snippet
```java
            return false;
        if (supportedObjects == null) {
            if (other.supportedObjects != null)
                return false;
        } else if (!supportedObjects.equals(other.supportedObjects))
```

### TrivialIf
`if` statement can be simplified
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/registration/Registration.java`
#### Snippet
```java
            if (other.supportedObjects != null)
                return false;
        } else if (!supportedObjects.equals(other.supportedObjects))
            return false;
        return true;
```

### TrivialIf
`if` statement can be simplified
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/servers/ServerIdentity.java`
#### Snippet
```java
        } else if (!identity.equals(other.identity))
            return false;
        if (role != other.role)
            return false;
        return true;
```

### TrivialIf
`if` statement can be simplified
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/resource/ObjectEnabler.java`
#### Snippet
```java
        }

        if (pathToValidate.getObjectInstanceId() != instanceId) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `leshan-client-cf/src/main/java/org/eclipse/leshan/client/californium/ObserveCompositeRelationFilter.java`
#### Snippet
```java
            return false;
        }
        if (!request.getOptions().hasContentFormat()) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `leshan-core-cf/src/main/java/org/eclipse/leshan/core/californium/oscore/cf/OscoreParameters.java`
#### Snippet
```java
        if (!Arrays.equals(recipientId, other.recipientId))
            return false;
        if (!Arrays.equals(senderId, other.senderId))
            return false;
        return true;
```

### TrivialIf
`if` statement can be simplified
in `leshan-core/src/main/java/org/eclipse/leshan/core/ResponseCode.java`
#### Snippet
```java
            return false;
        ResponseCode other = (ResponseCode) obj;
        if (code != other.code)
            return false;
        return true;
```

### TrivialIf
`if` statement can be simplified
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2m.java`
#### Snippet
```java
                return false;
            LwM2mVersion other = (LwM2mVersion) obj;
            if (supported != other.supported)
                return false;
            return true;
```

### TrivialIf
`if` statement can be simplified
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2m.java`
#### Snippet
```java
                return false;
            if (minor == null) {
                if (other.minor != null)
                    return false;
            } else if (!minor.equals(other.minor))
```

### TrivialIf
`if` statement can be simplified
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2m.java`
#### Snippet
```java
                if (other.minor != null)
                    return false;
            } else if (!minor.equals(other.minor))
                return false;
            return true;
```

### TrivialIf
`if` statement can be simplified
in `leshan-core/src/main/java/org/eclipse/leshan/core/json/JsonRootObject.java`
#### Snippet
```java
            return false;
        if (jsonArray == null) {
            if (other.jsonArray != null)
                return false;
        } else if (!jsonArray.equals(other.jsonArray))
```

### TrivialIf
`if` statement can be simplified
in `leshan-core/src/main/java/org/eclipse/leshan/core/json/JsonRootObject.java`
#### Snippet
```java
            if (other.jsonArray != null)
                return false;
        } else if (!jsonArray.equals(other.jsonArray))
            return false;
        return true;
```

### TrivialIf
`if` statement can be simplified
in `leshan-core/src/main/java/org/eclipse/leshan/core/json/JsonArrayEntry.java`
#### Snippet
```java
            return false;
        if (time == null) {
            if (other.time != null)
                return false;
        } else if (!time.equals(other.time))
```

### TrivialIf
`if` statement can be simplified
in `leshan-core/src/main/java/org/eclipse/leshan/core/json/JsonArrayEntry.java`
#### Snippet
```java
            if (other.time != null)
                return false;
        } else if (!time.equals(other.time))
            return false;
        return true;
```

### TrivialIf
`if` statement can be simplified
in `leshan-core/src/main/java/org/eclipse/leshan/core/tlv/Tlv.java`
#### Snippet
```java
        if (type != other.type)
            return false;
        if (!Arrays.equals(value, other.value))
            return false;
        return true;
```

### TrivialIf
`if` statement can be simplified
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/Link.java`
#### Snippet
```java
            return false;
        if (uriReference == null) {
            if (other.uriReference != null)
                return false;
        } else if (!uriReference.equals(other.uriReference))
```

### TrivialIf
`if` statement can be simplified
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/Link.java`
#### Snippet
```java
            if (other.uriReference != null)
                return false;
        } else if (!uriReference.equals(other.uriReference))
            return false;
        return true;
```

### TrivialIf
`if` statement can be simplified
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/lwm2m/MixedLwM2mLink.java`
#### Snippet
```java
            return false;
        if (rootPath == null) {
            if (other.rootPath != null)
                return false;
        } else if (!rootPath.equals(other.rootPath))
```

### TrivialIf
`if` statement can be simplified
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/lwm2m/MixedLwM2mLink.java`
#### Snippet
```java
            if (other.rootPath != null)
                return false;
        } else if (!rootPath.equals(other.rootPath))
            return false;
        return true;
```

### TrivialIf
`if` statement can be simplified
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/attributes/ValuelessAttribute.java`
#### Snippet
```java
        ValuelessAttribute other = (ValuelessAttribute) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
```

### TrivialIf
`if` statement can be simplified
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/attributes/ValuelessAttribute.java`
#### Snippet
```java
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
```

### TrivialIf
`if` statement can be simplified
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/lwm2m/attributes/LwM2mAttribute.java`
#### Snippet
```java
            return false;
        if (value == null) {
            if (other.value != null)
                return false;
        } else if (!value.equals(other.value))
```

### TrivialIf
`if` statement can be simplified
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/lwm2m/attributes/LwM2mAttribute.java`
#### Snippet
```java
            if (other.value != null)
                return false;
        } else if (!value.equals(other.value))
            return false;
        return true;
```

### TrivialIf
`if` statement can be simplified
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/attributes/BaseAttribute.java`
#### Snippet
```java
            return false;
        if (value == null) {
            if (other.value != null)
                return false;
        } else if (!value.equals(other.value))
```

### TrivialIf
`if` statement can be simplified
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/attributes/BaseAttribute.java`
#### Snippet
```java
            if (other.value != null)
                return false;
        } else if (!value.equals(other.value))
            return false;
        return true;
```

### TrivialIf
`if` statement can be simplified
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/ObjectLink.java`
#### Snippet
```java
        if (objectId != other.objectId)
            return false;
        if (objectInstanceId != other.objectInstanceId)
            return false;
        return true;
```

### TrivialIf
`if` statement can be simplified
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/TimestampedLwM2mNode.java`
#### Snippet
```java
            return false;
        if (timestamp == null) {
            if (other.timestamp != null)
                return false;
        } else if (!timestamp.equals(other.timestamp))
```

### TrivialIf
`if` statement can be simplified
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/TimestampedLwM2mNode.java`
#### Snippet
```java
            if (other.timestamp != null)
                return false;
        } else if (!timestamp.equals(other.timestamp))
            return false;
        return true;
```

### TrivialIf
`if` statement can be simplified
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/attributes/AttributeSet.java`
#### Snippet
```java
        AttributeSet other = (AttributeSet) obj;
        if (attributes == null) {
            if (other.attributes != null)
                return false;
        } else if (!attributes.equals(other.attributes))
```

### TrivialIf
`if` statement can be simplified
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/attributes/AttributeSet.java`
#### Snippet
```java
            if (other.attributes != null)
                return false;
        } else if (!attributes.equals(other.attributes))
            return false;
        return true;
```

### TrivialIf
`if` statement can be simplified
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/LwM2mObjectInstance.java`
#### Snippet
```java
        }
        if (resources == null) {
            if (other.resources != null) {
                return false;
            }
```

### TrivialIf
`if` statement can be simplified
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/LwM2mObjectInstance.java`
#### Snippet
```java
                return false;
            }
        } else if (!resources.equals(other.resources)) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/LwM2mNodeUtil.java`
#### Snippet
```java
                return cause;
            cause = getInvalidUndefinedObjectInstanceIdCause(path.getObjectInstanceId());
            if (cause != null)
                return cause;
        } else if (path.isResource()) {
```

### TrivialIf
`if` statement can be simplified
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/LwM2mNodeUtil.java`
#### Snippet
```java
                return cause;
            cause = getInvalidResourceIdCause(path.getResourceId());
            if (cause != null)
                return cause;
        } else if (path.isResourceInstance()) {
```

### TrivialIf
`if` statement can be simplified
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/LwM2mNodeUtil.java`
#### Snippet
```java
                return cause;
            cause = getInvalidResourceInstanceIdCause(path.getResourceInstanceId());
            if (cause != null)
                return cause;
        } else {
```

### TrivialIf
`if` statement can be simplified
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/LwM2mNodeUtil.java`
#### Snippet
```java
        if (path.isObject()) {
            cause = getInvalidObjectIdCause(path.getObjectId());
            if (cause != null)
                return cause;
        } else if (path.isObjectInstance()) {
```

### TrivialIf
`if` statement can be simplified
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/LwM2mNodeUtil.java`
#### Snippet
```java
                return cause;
            cause = getInvalidObjectInstanceIdCause(path.getObjectInstanceId());
            if (cause != null)
                return cause;
        } else if (path.isResource()) {
```

### TrivialIf
`if` statement can be simplified
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/LwM2mNodeUtil.java`
#### Snippet
```java
                return cause;
            cause = getInvalidResourceIdCause(path.getResourceId());
            if (cause != null)
                return cause;
        } else if (path.isResourceInstance()) {
```

### TrivialIf
`if` statement can be simplified
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/LwM2mNodeUtil.java`
#### Snippet
```java
                return cause;
            cause = getInvalidResourceInstanceIdCause(path.getResourceInstanceId());
            if (cause != null)
                return cause;
        } else if (!path.isRoot()) {
```

### TrivialIf
`if` statement can be simplified
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/LwM2mObject.java`
#### Snippet
```java
        }
        if (instances == null) {
            if (other.instances != null) {
                return false;
            }
```

### TrivialIf
`if` statement can be simplified
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/LwM2mObject.java`
#### Snippet
```java
                return false;
            }
        } else if (!instances.equals(other.instances)) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/LwM2mResourceInstance.java`
#### Snippet
```java
            return false;
        if (value == null) {
            if (other.value != null)
                return false;
        } else {
```

### TrivialIf
`if` statement can be simplified
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/LwM2mMultipleResource.java`
#### Snippet
```java
            return false;
        if (instances == null) {
            if (other.instances != null)
                return false;
        } else if (!instances.equals(other.instances))
```

### TrivialIf
`if` statement can be simplified
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/LwM2mMultipleResource.java`
#### Snippet
```java
            if (other.instances != null)
                return false;
        } else if (!instances.equals(other.instances))
            return false;
        return true;
```

### TrivialIf
`if` statement can be simplified
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/TimestampedLwM2mNodes.java`
#### Snippet
```java
        TimestampedLwM2mNodes other = (TimestampedLwM2mNodes) obj;
        if (timestampedPathNodesMap == null) {
            if (other.timestampedPathNodesMap != null)
                return false;
        } else if (!timestampedPathNodesMap.equals(other.timestampedPathNodesMap))
```

### TrivialIf
`if` statement can be simplified
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/TimestampedLwM2mNodes.java`
#### Snippet
```java
            if (other.timestampedPathNodesMap != null)
                return false;
        } else if (!timestampedPathNodesMap.equals(other.timestampedPathNodesMap))
            return false;
        return true;
```

### TrivialIf
`if` statement can be simplified
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/LwM2mPath.java`
#### Snippet
```java
        if (start.getResourceInstanceId() == null)
            return true;
        if (!start.getResourceInstanceId().equals(this.getResourceInstanceId())) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/LwM2mPath.java`
#### Snippet
```java
        }
        if (resourceInstanceId == null) {
            if (other.resourceInstanceId != null) {
                return false;
            }
```

### TrivialIf
`if` statement can be simplified
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/LwM2mPath.java`
#### Snippet
```java
                return false;
            }
        } else if (!resourceInstanceId.equals(other.resourceInstanceId)) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/LwM2mSingleResource.java`
#### Snippet
```java
            return false;
        if (value == null) {
            if (other.value != null)
                return false;
        } else {
```

### TrivialIf
`if` statement can be simplified
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/codec/json/LwM2mNodeJsonDecoder.java`
#### Snippet
```java
            }
        } else {
            if (time != null) {
                timestampInSeconds = time;
            } else {
```

### TrivialIf
`if` statement can be simplified
in `leshan-core/src/main/java/org/eclipse/leshan/core/oscore/OscoreIdentity.java`
#### Snippet
```java
            return false;
        OscoreIdentity other = (OscoreIdentity) obj;
        if (!Arrays.equals(recipientId, other.recipientId))
            return false;
        return true;
```

### TrivialIf
`if` statement can be simplified
in `leshan-core/src/main/java/org/eclipse/leshan/core/model/LwM2mModelRepository.java`
#### Snippet
```java
                return false;
            if (version == null) {
                if (other.version != null)
                    return false;
            } else if (!version.equals(other.version))
```

### TrivialIf
`if` statement can be simplified
in `leshan-core/src/main/java/org/eclipse/leshan/core/model/LwM2mModelRepository.java`
#### Snippet
```java
                if (other.version != null)
                    return false;
            } else if (!version.equals(other.version))
                return false;
            return true;
```

### TrivialIf
`if` statement can be simplified
in `leshan-core/src/main/java/org/eclipse/leshan/core/oscore/OscoreSetting.java`
#### Snippet
```java
        if (!Arrays.equals(recipientId, other.recipientId))
            return false;
        if (!Arrays.equals(senderId, other.senderId))
            return false;
        return true;
```

### TrivialIf
`if` statement can be simplified
in `leshan-core/src/main/java/org/eclipse/leshan/core/oscore/AeadAlgorithm.java`
#### Snippet
```java
        if (nonceSize != other.nonceSize)
            return false;
        if (value != other.value)
            return false;
        return true;
```

### TrivialIf
`if` statement can be simplified
in `leshan-core/src/main/java/org/eclipse/leshan/core/request/BootstrapReadRequest.java`
#### Snippet
```java
            return false;
        BootstrapReadRequest other = (BootstrapReadRequest) obj;
        if (format != other.format)
            return false;
        return true;
```

### TrivialIf
`if` statement can be simplified
in `leshan-core/src/main/java/org/eclipse/leshan/core/request/DeregisterRequest.java`
#### Snippet
```java
        DeregisterRequest other = (DeregisterRequest) obj;
        if (registrationId == null) {
            if (other.registrationId != null)
                return false;
        } else if (!registrationId.equals(other.registrationId))
```

### TrivialIf
`if` statement can be simplified
in `leshan-core/src/main/java/org/eclipse/leshan/core/request/DeregisterRequest.java`
#### Snippet
```java
            if (other.registrationId != null)
                return false;
        } else if (!registrationId.equals(other.registrationId))
            return false;
        return true;
```

### TrivialIf
`if` statement can be simplified
in `leshan-core/src/main/java/org/eclipse/leshan/core/request/BootstrapRequest.java`
#### Snippet
```java
            return false;
        if (preferredContentFormat == null) {
            if (other.preferredContentFormat != null)
                return false;
        } else if (!preferredContentFormat.equals(other.preferredContentFormat))
```

### TrivialIf
`if` statement can be simplified
in `leshan-core/src/main/java/org/eclipse/leshan/core/request/BootstrapRequest.java`
#### Snippet
```java
            if (other.preferredContentFormat != null)
                return false;
        } else if (!preferredContentFormat.equals(other.preferredContentFormat))
            return false;
        return true;
```

### TrivialIf
`if` statement can be simplified
in `leshan-core/src/main/java/org/eclipse/leshan/core/request/ObserveRequest.java`
#### Snippet
```java
            return false;
        ObserveRequest other = (ObserveRequest) obj;
        if (format != other.format)
            return false;
        return true;
```

### TrivialIf
`if` statement can be simplified
in `leshan-core/src/main/java/org/eclipse/leshan/core/request/Identity.java`
#### Snippet
```java
            return false;
        if (oscoreIdentity == null) {
            if (other.oscoreIdentity != null)
                return false;
        } else if (!oscoreIdentity.equals(other.oscoreIdentity))
```

### TrivialIf
`if` statement can be simplified
in `leshan-core/src/main/java/org/eclipse/leshan/core/request/Identity.java`
#### Snippet
```java
            if (other.oscoreIdentity != null)
                return false;
        } else if (!oscoreIdentity.equals(other.oscoreIdentity))
            return false;
        return true;
```

### TrivialIf
`if` statement can be simplified
in `leshan-core/src/main/java/org/eclipse/leshan/core/request/ReadCompositeRequest.java`
#### Snippet
```java
            return false;
        if (responseContentFormat == null) {
            if (other.responseContentFormat != null)
                return false;
        } else if (!responseContentFormat.equals(other.responseContentFormat))
```

### TrivialIf
`if` statement can be simplified
in `leshan-core/src/main/java/org/eclipse/leshan/core/request/ReadCompositeRequest.java`
#### Snippet
```java
            if (other.responseContentFormat != null)
                return false;
        } else if (!responseContentFormat.equals(other.responseContentFormat))
            return false;
        return true;
```

### TrivialIf
`if` statement can be simplified
in `leshan-core/src/main/java/org/eclipse/leshan/core/request/AbstractSimpleDownlinkRequest.java`
#### Snippet
```java
        AbstractSimpleDownlinkRequest<?> other = (AbstractSimpleDownlinkRequest<?>) obj;
        if (path == null) {
            if (other.path != null)
                return false;
        } else if (!path.equals(other.path))
```

### TrivialIf
`if` statement can be simplified
in `leshan-core/src/main/java/org/eclipse/leshan/core/request/AbstractSimpleDownlinkRequest.java`
#### Snippet
```java
            if (other.path != null)
                return false;
        } else if (!path.equals(other.path))
            return false;
        return true;
```

### TrivialIf
`if` statement can be simplified
in `leshan-core/src/main/java/org/eclipse/leshan/core/request/ExecuteRequest.java`
#### Snippet
```java
        ExecuteRequest other = (ExecuteRequest) obj;
        if (arguments == null) {
            if (other.arguments != null)
                return false;
        } else if (!arguments.equals(other.arguments))
```

### TrivialIf
`if` statement can be simplified
in `leshan-core/src/main/java/org/eclipse/leshan/core/request/ExecuteRequest.java`
#### Snippet
```java
            if (other.arguments != null)
                return false;
        } else if (!arguments.equals(other.arguments))
            return false;
        return true;
```

### TrivialIf
`if` statement can be simplified
in `leshan-core/src/main/java/org/eclipse/leshan/core/request/WriteAttributesRequest.java`
#### Snippet
```java
        WriteAttributesRequest other = (WriteAttributesRequest) obj;
        if (attributes == null) {
            if (other.attributes != null)
                return false;
        } else if (!attributes.equals(other.attributes))
```

### TrivialIf
`if` statement can be simplified
in `leshan-core/src/main/java/org/eclipse/leshan/core/request/WriteAttributesRequest.java`
#### Snippet
```java
            if (other.attributes != null)
                return false;
        } else if (!attributes.equals(other.attributes))
            return false;
        return true;
```

### TrivialIf
`if` statement can be simplified
in `leshan-core/src/main/java/org/eclipse/leshan/core/request/CancelObservationRequest.java`
#### Snippet
```java
        CancelObservationRequest other = (CancelObservationRequest) obj;
        if (observation == null) {
            if (other.observation != null)
                return false;
        } else if (!observation.equals(other.observation))
```

### TrivialIf
`if` statement can be simplified
in `leshan-core/src/main/java/org/eclipse/leshan/core/request/CancelObservationRequest.java`
#### Snippet
```java
            if (other.observation != null)
                return false;
        } else if (!observation.equals(other.observation))
            return false;
        return true;
```

### TrivialIf
`if` statement can be simplified
in `leshan-core/src/main/java/org/eclipse/leshan/core/request/UpdateRequest.java`
#### Snippet
```java
            return false;
        if (smsNumber == null) {
            if (other.smsNumber != null)
                return false;
        } else if (!smsNumber.equals(other.smsNumber))
```

### TrivialIf
`if` statement can be simplified
in `leshan-core/src/main/java/org/eclipse/leshan/core/request/UpdateRequest.java`
#### Snippet
```java
            if (other.smsNumber != null)
                return false;
        } else if (!smsNumber.equals(other.smsNumber))
            return false;
        return true;
```

### TrivialIf
`if` statement can be simplified
in `leshan-core/src/main/java/org/eclipse/leshan/core/request/ReadRequest.java`
#### Snippet
```java
            return false;
        ReadRequest other = (ReadRequest) obj;
        if (format != other.format)
            return false;
        return true;
```

### TrivialIf
`if` statement can be simplified
in `leshan-core/src/main/java/org/eclipse/leshan/core/request/ContentFormat.java`
#### Snippet
```java
            return false;
        ContentFormat other = (ContentFormat) obj;
        if (code != other.code)
            return false;
        return true;
```

### TrivialIf
`if` statement can be simplified
in `leshan-core/src/main/java/org/eclipse/leshan/core/request/RegisterRequest.java`
#### Snippet
```java
            return false;
        if (smsNumber == null) {
            if (other.smsNumber != null)
                return false;
        } else if (!smsNumber.equals(other.smsNumber))
```

### TrivialIf
`if` statement can be simplified
in `leshan-core/src/main/java/org/eclipse/leshan/core/request/RegisterRequest.java`
#### Snippet
```java
            if (other.smsNumber != null)
                return false;
        } else if (!smsNumber.equals(other.smsNumber))
            return false;
        return true;
```

### TrivialIf
`if` statement can be simplified
in `leshan-core/src/main/java/org/eclipse/leshan/core/request/WriteRequest.java`
#### Snippet
```java
            return false;
        if (node == null) {
            if (other.node != null)
                return false;
        } else if (!node.equals(other.node))
```

### TrivialIf
`if` statement can be simplified
in `leshan-core/src/main/java/org/eclipse/leshan/core/request/WriteRequest.java`
#### Snippet
```java
            if (other.node != null)
                return false;
        } else if (!node.equals(other.node))
            return false;
        return true;
```

### TrivialIf
`if` statement can be simplified
in `leshan-core/src/main/java/org/eclipse/leshan/core/request/SendRequest.java`
#### Snippet
```java
            return false;
        if (timestampedNodes == null) {
            if (other.timestampedNodes != null)
                return false;
        } else if (!timestampedNodes.equals(other.timestampedNodes))
```

### TrivialIf
`if` statement can be simplified
in `leshan-core/src/main/java/org/eclipse/leshan/core/request/SendRequest.java`
#### Snippet
```java
            if (other.timestampedNodes != null)
                return false;
        } else if (!timestampedNodes.equals(other.timestampedNodes))
            return false;
        return true;
```

### TrivialIf
`if` statement can be simplified
in `leshan-core/src/main/java/org/eclipse/leshan/core/request/CreateRequest.java`
#### Snippet
```java
            return false;
        if (resources == null) {
            if (other.resources != null)
                return false;
        } else if (!resources.equals(other.resources))
```

### TrivialIf
`if` statement can be simplified
in `leshan-core/src/main/java/org/eclipse/leshan/core/request/CreateRequest.java`
#### Snippet
```java
            if (other.resources != null)
                return false;
        } else if (!resources.equals(other.resources))
            return false;
        return true;
```

### TrivialIf
`if` statement can be simplified
in `leshan-core/src/main/java/org/eclipse/leshan/core/request/argument/Argument.java`
#### Snippet
```java
            return false;
        if (value == null) {
            if (other.value != null)
                return false;
        } else if (!value.equals(other.value))
```

### TrivialIf
`if` statement can be simplified
in `leshan-core/src/main/java/org/eclipse/leshan/core/request/argument/Argument.java`
#### Snippet
```java
            if (other.value != null)
                return false;
        } else if (!value.equals(other.value))
            return false;
        return true;
```

### TrivialIf
`if` statement can be simplified
in `leshan-core/src/main/java/org/eclipse/leshan/core/endpoint/Protocol.java`
#### Snippet
```java
        Protocol other = (Protocol) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
```

### TrivialIf
`if` statement can be simplified
in `leshan-core/src/main/java/org/eclipse/leshan/core/endpoint/Protocol.java`
#### Snippet
```java
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
```

### TrivialIf
`if` statement can be simplified
in `leshan-core/src/main/java/org/eclipse/leshan/core/request/argument/Arguments.java`
#### Snippet
```java
        Arguments other = (Arguments) obj;
        if (argumentMap == null) {
            if (other.argumentMap != null)
                return false;
        } else if (!argumentMap.equals(other.argumentMap))
```

### TrivialIf
`if` statement can be simplified
in `leshan-core/src/main/java/org/eclipse/leshan/core/request/argument/Arguments.java`
#### Snippet
```java
            if (other.argumentMap != null)
                return false;
        } else if (!argumentMap.equals(other.argumentMap))
            return false;
        return true;
```

### TrivialIf
`if` statement can be simplified
in `leshan-core/src/main/java/org/eclipse/leshan/core/observation/SingleObservation.java`
#### Snippet
```java
            return false;
        if (path == null) {
            if (other.path != null)
                return false;
        } else if (!path.equals(other.path))
```

### TrivialIf
`if` statement can be simplified
in `leshan-core/src/main/java/org/eclipse/leshan/core/observation/SingleObservation.java`
#### Snippet
```java
            if (other.path != null)
                return false;
        } else if (!path.equals(other.path))
            return false;
        return true;
```

### TrivialIf
`if` statement can be simplified
in `leshan-core/src/main/java/org/eclipse/leshan/core/observation/ObservationIdentifier.java`
#### Snippet
```java
            return false;
        ObservationIdentifier other = (ObservationIdentifier) obj;
        if (!Arrays.equals(bytes, other.bytes))
            return false;
        return true;
```

### TrivialIf
`if` statement can be simplified
in `leshan-core/src/main/java/org/eclipse/leshan/core/observation/Observation.java`
#### Snippet
```java
            return false;
        if (registrationId == null) {
            if (other.registrationId != null)
                return false;
        } else if (!registrationId.equals(other.registrationId))
```

### TrivialIf
`if` statement can be simplified
in `leshan-core/src/main/java/org/eclipse/leshan/core/observation/Observation.java`
#### Snippet
```java
            if (other.registrationId != null)
                return false;
        } else if (!registrationId.equals(other.registrationId))
            return false;
        return true;
```

### TrivialIf
`if` statement can be simplified
in `leshan-core/src/main/java/org/eclipse/leshan/core/observation/CompositeObservation.java`
#### Snippet
```java
            return false;
        if (responseContentFormat == null) {
            if (other.responseContentFormat != null)
                return false;
        } else if (!responseContentFormat.equals(other.responseContentFormat))
```

### TrivialIf
`if` statement can be simplified
in `leshan-core/src/main/java/org/eclipse/leshan/core/observation/CompositeObservation.java`
#### Snippet
```java
            if (other.responseContentFormat != null)
                return false;
        } else if (!responseContentFormat.equals(other.responseContentFormat))
            return false;
        return true;
```

### TrivialIf
`if` statement can be simplified
in `leshan-core/src/main/java/org/eclipse/leshan/senml/SenMLPack.java`
#### Snippet
```java
        SenMLPack other = (SenMLPack) obj;
        if (records == null) {
            if (other.records != null)
                return false;
        } else if (!records.equals(other.records))
```

### TrivialIf
`if` statement can be simplified
in `leshan-core/src/main/java/org/eclipse/leshan/senml/SenMLPack.java`
#### Snippet
```java
            if (other.records != null)
                return false;
        } else if (!records.equals(other.records))
            return false;
        return true;
```

### TrivialIf
`if` statement can be simplified
in `leshan-core/src/main/java/org/eclipse/leshan/senml/SenMLRecord.java`
#### Snippet
```java
            return false;
        if (opaqueValue == null) {
            if (other.opaqueValue != null)
                return false;
        } else if (!Arrays.equals(opaqueValue, other.opaqueValue))
```

### TrivialIf
`if` statement can be simplified
in `leshan-core/src/main/java/org/eclipse/leshan/senml/SenMLRecord.java`
#### Snippet
```java
            if (other.opaqueValue != null)
                return false;
        } else if (!Arrays.equals(opaqueValue, other.opaqueValue))
            return false;

```

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'PrintWriter' used without 'try'-with-resources statement
in `leshan-server-demo/src/main/java/org/eclipse/leshan/server/demo/servlet/ObjectSpecServlet.java`
#### Snippet
```java
        if (registration == null) {
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            resp.getWriter().format("no registered client with id '%s'", clientEndpoint).flush();
        }

```

### AutoCloseableResource
'JmDNS' used without 'try'-with-resources statement
in `leshan-server-demo/src/main/java/org/eclipse/leshan/server/demo/LeshanServerDemo.java`
#### Snippet
```java

                // Create a JmDNS instance
                JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());

                // Publish Leshan HTTP Service
```

### AutoCloseableResource
'PrintWriter' used without 'try'-with-resources statement
in `leshan-server-demo/src/main/java/org/eclipse/leshan/server/demo/servlet/ClientServlet.java`
#### Snippet
```java
                } else {
                    resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
                    resp.getWriter().format("no registered client with id '%s'", clientEndpoint).flush();
                }
            } catch (RuntimeException e) {
```

### AutoCloseableResource
'PrintWriter' used without 'try'-with-resources statement
in `leshan-server-demo/src/main/java/org/eclipse/leshan/server/demo/servlet/ClientServlet.java`
#### Snippet
```java
                } else {
                    resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
                    resp.getWriter().format("no registered client with id '%s'", clientEndpoint).flush();
                }
            } catch (RuntimeException e) {
```

### AutoCloseableResource
'PrintWriter' used without 'try'-with-resources statement
in `leshan-server-demo/src/main/java/org/eclipse/leshan/server/demo/servlet/ClientServlet.java`
#### Snippet
```java
            } else {
                resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
                resp.getWriter().format("no registered client with id '%s'", clientEndpoint).flush();
            }
        } catch (RuntimeException | InterruptedException e) {
```

### AutoCloseableResource
'PrintWriter' used without 'try'-with-resources statement
in `leshan-server-demo/src/main/java/org/eclipse/leshan/server/demo/servlet/ClientServlet.java`
#### Snippet
```java
                } else {
                    resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
                    resp.getWriter().format("no registered client with id '%s'", clientEndpoint).flush();
                }
            } catch (RuntimeException | InterruptedException e) {
```

### AutoCloseableResource
'PrintWriter' used without 'try'-with-resources statement
in `leshan-server-demo/src/main/java/org/eclipse/leshan/server/demo/servlet/ClientServlet.java`
#### Snippet
```java
            } else {
                resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
                resp.getWriter().format("No registered client with id '%s'", clientEndpoint).flush();
            }
        } catch (RuntimeException | InterruptedException | InvalidAttributeException e) {
```

### AutoCloseableResource
'PrintWriter' used without 'try'-with-resources statement
in `leshan-server-demo/src/main/java/org/eclipse/leshan/server/demo/servlet/ClientServlet.java`
#### Snippet
```java
            } else {
                resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
                resp.getWriter().format("no registered client with id '%s'", clientEndpoint).flush();
            }
            return;
```

### AutoCloseableResource
'PrintWriter' used without 'try'-with-resources statement
in `leshan-server-demo/src/main/java/org/eclipse/leshan/server/demo/servlet/ClientServlet.java`
#### Snippet
```java
                } else {
                    resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
                    resp.getWriter().format("No registered client with id '%s'", clientEndpoint).flush();
                }
            } catch (RuntimeException | InterruptedException e) {
```

### AutoCloseableResource
'PrintWriter' used without 'try'-with-resources statement
in `leshan-server-demo/src/main/java/org/eclipse/leshan/server/demo/servlet/ClientServlet.java`
#### Snippet
```java
                } else {
                    resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
                    resp.getWriter().format("No registered client with id '%s'", clientEndpoint).flush();
                }
            } catch (RuntimeException | InterruptedException e) {
```

### AutoCloseableResource
'PrintWriter' used without 'try'-with-resources statement
in `leshan-server-demo/src/main/java/org/eclipse/leshan/server/demo/servlet/ClientServlet.java`
#### Snippet
```java
            } else {
                resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
                resp.getWriter().format("No registered client with id '%s'", clientEndpoint).flush();
            }
        } catch (RuntimeException | InterruptedException e) {
```

### AutoCloseableResource
'PrintWriter' used without 'try'-with-resources statement
in `leshan-server-demo/src/main/java/org/eclipse/leshan/server/demo/servlet/ClientServlet.java`
#### Snippet
```java
                } else {
                    resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
                    resp.getWriter().format("No registered client with id '%s'", clientEndpoint).flush();
                }
            } catch (RuntimeException | InterruptedException e) {
```

### AutoCloseableResource
'PrintWriter' used without 'try'-with-resources statement
in `leshan-server-demo/src/main/java/org/eclipse/leshan/server/demo/servlet/ClientServlet.java`
#### Snippet
```java
                } else {
                    resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
                    resp.getWriter().format("no registered client with id '%s'", clientEndpoint).flush();
                }
            } catch (RuntimeException | InterruptedException e) {
```

### AutoCloseableResource
'PrintWriter' used without 'try'-with-resources statement
in `leshan-server-demo/src/main/java/org/eclipse/leshan/server/demo/servlet/ClientServlet.java`
#### Snippet
```java
                } else {
                    resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
                    resp.getWriter().format("no registered client with id '%s'", clientEndpoint).flush();
                }
            } catch (RuntimeException | InterruptedException e) {
```

### AutoCloseableResource
'PrintWriter' used without 'try'-with-resources statement
in `leshan-server-demo/src/main/java/org/eclipse/leshan/server/demo/servlet/ClientServlet.java`
#### Snippet
```java
                } else {
                    resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
                    resp.getWriter().format("no registered client with id '%s'", clientEndpoint).flush();
                }
            } catch (RuntimeException | InterruptedException e) {
```

### AutoCloseableResource
'PrintWriter' used without 'try'-with-resources statement
in `leshan-client-demo/src/main/java/org/eclipse/leshan/client/demo/cli/interactive/InteractiveCommands.java`
#### Snippet
```java
            Map<String, ServerIdentity> registeredServers = sendCommand.parent.client.getRegisteredServers();
            if (registeredServers.isEmpty()) {
                sendCommand.parent.printf("There is no registered server to send to.%n").flush();
            }
            for (final ServerIdentity server : registeredServers.values()) {
```

### AutoCloseableResource
'PrintWriter' used without 'try'-with-resources statement
in `leshan-client-demo/src/main/java/org/eclipse/leshan/client/demo/cli/interactive/InteractiveCommands.java`
#### Snippet
```java
            Map<String, ServerIdentity> registeredServers = sendCommand.parent.client.getRegisteredServers();
            if (registeredServers.isEmpty()) {
                sendCommand.parent.printf("There is no registered server to send to.%n").flush();
            }
            // for each server send data
```

### AutoCloseableResource
'PrintWriter' used without 'try'-with-resources statement
in `leshan-client-demo/src/main/java/org/eclipse/leshan/client/demo/cli/interactive/InteractiveCommands.java`
#### Snippet
```java
                            .sendCollectedData(server, sendCommand.contentFormat, sendCommand.timeout, false);
                } catch (NoDataException e) {
                    sendCommand.parent.printf("No data collected, use `collect` command before.%n").flush();
                }
            }
```

### AutoCloseableResource
'PrintWriter' used without 'try'-with-resources statement
in `leshan-client-demo/src/main/java/org/eclipse/leshan/client/demo/cli/interactive/InteractiveCommands.java`
#### Snippet
```java
        public void run() {
            if (objectId == 0 || objectId == 1 || objectId == 3) {
                parent.printf("Object %d can not be disabled.%n", objectId).flush();
            } else if (parent.client.getObjectTree().getObjectEnabler(objectId) == null) {
                parent.printf("Object %d is not enabled.%n", objectId).flush();
```

### AutoCloseableResource
'PrintWriter' used without 'try'-with-resources statement
in `leshan-client-demo/src/main/java/org/eclipse/leshan/client/demo/cli/interactive/InteractiveCommands.java`
#### Snippet
```java
                parent.printf("Object %d can not be disabled.%n", objectId).flush();
            } else if (parent.client.getObjectTree().getObjectEnabler(objectId) == null) {
                parent.printf("Object %d is not enabled.%n", objectId).flush();
            } else {
                parent.client.getObjectTree().removeObjectEnabler(objectId);
```

### AutoCloseableResource
'PrintWriter' used without 'try'-with-resources statement
in `leshan-client-demo/src/main/java/org/eclipse/leshan/client/demo/cli/interactive/InteractiveCommands.java`
#### Snippet
```java
            ObjectModel objectModel = objectEnabler.getObjectModel();
            objectEnabler.getAvailableInstanceIds().forEach(instance -> {
                parent.printfAnsi("@|bold,fg(magenta) /%d/%d : |@ @|bold,fg(green) %s |@ %n", objectModel.id, instance,
                        objectModel.name);
                List<Integer> availableResources = objectEnabler.getAvailableResourceIds(instance);
```

### AutoCloseableResource
'PrintWriter' used without 'try'-with-resources statement
in `leshan-client-demo/src/main/java/org/eclipse/leshan/client/demo/cli/interactive/InteractiveCommands.java`
#### Snippet
```java
                availableResources.forEach(resourceId -> {
                    ResourceModel resourceModel = objectModel.resources.get(resourceId);
                    parent.printfAnsi("  /%d : @|bold,fg(cyan) %s |@ %n", resourceId, resourceModel.name);
                });
            });
```

### AutoCloseableResource
'PrintWriter' used without 'try'-with-resources statement
in `leshan-client-demo/src/main/java/org/eclipse/leshan/client/demo/cli/interactive/InteractiveCommands.java`
#### Snippet
```java
            LwM2mObjectTree objectTree = parent.client.getObjectTree();
            if (objectTree == null) {
                parent.printf("no object.%n");
                parent.flush();
                return;
```

### AutoCloseableResource
'PrintWriter' used without 'try'-with-resources statement
in `leshan-client-demo/src/main/java/org/eclipse/leshan/client/demo/cli/interactive/InteractiveCommands.java`
#### Snippet
```java
                LwM2mObjectEnabler objectEnabler = objectTree.getObjectEnablers().get(objectId);
                if (objectEnabler == null) {
                    parent.printf("no object available with id %d.%n", objectId);
                    parent.flush();
                    return;
```

### AutoCloseableResource
'PrintWriter' used without 'try'-with-resources statement
in `leshan-client-demo/src/main/java/org/eclipse/leshan/client/demo/cli/interactive/InteractiveCommands.java`
#### Snippet
```java
        public void run() {
            if (parent.client.getObjectTree().getObjectEnabler(objectId) != null) {
                parent.printf("Object %d already enabled.%n", objectId).flush();
            } else {
                ObjectModel objectModel;
```

### AutoCloseableResource
'PrintWriter' used without 'try'-with-resources statement
in `leshan-client-demo/src/main/java/org/eclipse/leshan/client/demo/cli/interactive/InteractiveCommands.java`
#### Snippet
```java
                if (objectModel == null) {
                    if (version == null) {
                        parent.printf("Unable to enable Object %d : there no model for this object.%n", objectId);
                    } else {
                        parent.printf("Unable to enable Object %d : there no model for this object in version %s.%n",
```

### AutoCloseableResource
'PrintWriter' used without 'try'-with-resources statement
in `leshan-client-demo/src/main/java/org/eclipse/leshan/client/demo/cli/interactive/InteractiveCommands.java`
#### Snippet
```java
                        parent.printf("Unable to enable Object %d : there no model for this object.%n", objectId);
                    } else {
                        parent.printf("Unable to enable Object %d : there no model for this object in version %s.%n",
                                objectId, version);
                    }
```

## RuleId[id=ImplicitArrayToString]
### ImplicitArrayToString
Call to 'toString()' on array
in `leshan-bsserver-demo/src/main/java/org/eclipse/leshan/server/bootstrap/demo/servlet/EventServlet.java`
#### Snippet
```java
                    b.append("Receive DISCOVER reponse\n");
                    b.append(response.getCode().toString());
                    b.append(((BootstrapDiscoverResponse) request).getObjectLinks().toString());
                    sendEvent(EVENT_BOOTSTRAP_SESSION,
                            objectMapper.writeValueAsString(
```

## RuleId[id=ConditionCoveredByFurtherCondition]
### ConditionCoveredByFurtherCondition
Condition 'model == null' covered by subsequent condition '!(model instanceof LwM2mAttributeModel)'
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/lwm2m/attributes/DefaultLwM2mAttributeParser.java`
#### Snippet
```java
        // search model
        AttributeModel<?> model = getKnownAttributes().get(attributeName);
        if (model == null || !(model instanceof LwM2mAttributeModel<?>)) {
            throw new InvalidAttributeException("%s attribute is unknown or not a LWM2M attribute", attributeName);
        }
```

### ConditionCoveredByFurtherCondition
Condition 'objectEnabler != null' covered by subsequent condition 'objectEnabler instanceof ObjectEnabler'
in `leshan-client-demo/src/main/java/org/eclipse/leshan/client/demo/cli/interactive/InteractiveCommands.java`
#### Snippet
```java
        public void run() {
            LwM2mObjectEnabler objectEnabler = parent.client.getObjectTree().getObjectEnabler(LwM2mId.LOCATION);
            if (objectEnabler != null && objectEnabler instanceof ObjectEnabler) {
                LwM2mInstanceEnabler instance = ((ObjectEnabler) objectEnabler).getInstance(0);
                if (instance instanceof MyLocation) {
```

## RuleId[id=SuspiciousToArrayCall]
### SuspiciousToArrayCall
Array of type 'org.eclipse.leshan.core.link.Link\[\]' expected, 'org.eclipse.leshan.core.link.lwm2m.LwM2mLink\[\]' found
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/util/LinkFormatHelper.java`
#### Snippet
```java
            links.addAll(getBootstrapObjectDescriptionWithoutRoot(objectEnabler, oscoreAttributesByInstanceId));
        }
        return links.toArray(new LwM2mLink[] {});
    }

```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@param jsonEntries` tag description is missing
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/codec/json/LwM2mNodeJsonDecoder.java`
#### Snippet
```java
     * Group all JsonArrayEntry by instanceId
     *
     * @param jsonEntries
     * @param baseName
     *
```

### JavadocDeclaration
`@param baseName` tag description is missing
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/codec/json/LwM2mNodeJsonDecoder.java`
#### Snippet
```java
     *
     * @param jsonEntries
     * @param baseName
     *
     * @return a map (instanceId => collection of JsonArrayEntry)
```

### JavadocDeclaration
Wrong tag `return``true`
in `leshan-core/src/main/java/org/eclipse/leshan/core/parser/StringParser.java`
#### Snippet
```java
     * </pre>
     *
     * @return<code>true</code> if there is a next char and it is a ALPHA
     */
    public boolean nextCharIsLOALPHA() {
```

### JavadocDeclaration
Wrong tag `return``true`
in `leshan-core/src/main/java/org/eclipse/leshan/core/parser/StringParser.java`
#### Snippet
```java
     * </pre>
     *
     * @return<code>true</code> if there is a next char and it is a ALPHA
     */
    public boolean nextCharIsALPHA() {
```

## RuleId[id=RedundantCast]
### RedundantCast
Casting `value` to `LwM2mMultipleResource` is redundant
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/resource/SimpleInstanceEnabler.java`
#### Snippet
```java
                Map<Integer, LwM2mResourceInstance> mergedInstances = new HashMap<>(multipleResource.getInstances());
                // try to detect resource instance changes
                for (Entry<Integer, LwM2mResourceInstance> entry : ((LwM2mMultipleResource) value).getInstances()
                        .entrySet()) {
                    LwM2mResourceInstance previous = mergedInstances.put(entry.getKey(), entry.getValue());
```

### RedundantCast
Casting `new RegisterResource(...)` to `Resource` is redundant
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/endpoint/ServerCoapMessageTranslator.java`
#### Snippet
```java
            IdentityHandlerProvider identityHandlerProvider) {
        return Arrays.asList( //
                (Resource) new RegisterResource(receiver, toolbox.getLinkParser(), identityHandlerProvider), //
                (Resource) new SendResource(receiver, toolbox.getDecoder(), toolbox.getProfileProvider(),
                        identityHandlerProvider));
```

### RedundantCast
Casting `new SendResource(...)` to `Resource` is redundant
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/endpoint/ServerCoapMessageTranslator.java`
#### Snippet
```java
        return Arrays.asList( //
                (Resource) new RegisterResource(receiver, toolbox.getLinkParser(), identityHandlerProvider), //
                (Resource) new SendResource(receiver, toolbox.getDecoder(), toolbox.getProfileProvider(),
                        identityHandlerProvider));
    }
```

### RedundantCast
Casting `new BootstrapResource(...)` to `Resource` is redundant
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/bootstrap/endpoint/BootstrapServerCoapMessageTranslator.java`
#### Snippet
```java
    public List<Resource> createResources(BootstrapUplinkRequestReceiver receiver,
            BootstrapServerEndpointToolbox toolbox, IdentityHandlerProvider identityHandlerProvider) {
        return Arrays.asList((Resource) new BootstrapResource(receiver, identityHandlerProvider));
    }
}
```

### RedundantCast
Casting `b` to `Buffer` is redundant
in `leshan-core/src/main/java/org/eclipse/leshan/core/tlv/TlvEncoder.java`
#### Snippet
```java
        // HACK the cast is necessary for binary backward compatibility bug introduce in Java 9
        // https://github.com/apache/felix/pull/114
        ((Buffer) b).flip();
        return b;
    }
```

### RedundantCast
Casting `slice` to `Buffer` is redundant
in `leshan-core/src/main/java/org/eclipse/leshan/core/tlv/TlvDecoder.java`
#### Snippet
```java
                        // HACK the cast is necessary for binary backward compatibility bug introduce in Java 9
                        // https://github.com/apache/felix/pull/114
                        ((Buffer) slice).limit(length);

                        Tlv[] children = decode(slice);
```

### RedundantCast
Casting `input` to `Buffer` is redundant
in `leshan-core/src/main/java/org/eclipse/leshan/core/tlv/TlvDecoder.java`
#### Snippet
```java
                        // HACK the cast is necessary for binary backward compatibility bug introduce in Java 9
                        // https://github.com/apache/felix/pull/114
                        ((Buffer) input).position(((Buffer) input).position() + length);

                        Tlv tlv = new Tlv(type, children, null, identifier);
```

### RedundantCast
Casting `input` to `Buffer` is redundant
in `leshan-core/src/main/java/org/eclipse/leshan/core/tlv/TlvDecoder.java`
#### Snippet
```java
                        // HACK the cast is necessary for binary backward compatibility bug introduce in Java 9
                        // https://github.com/apache/felix/pull/114
                        ((Buffer) input).position(((Buffer) input).position() + length);

                        Tlv tlv = new Tlv(type, children, null, identifier);
```

### RedundantCast
Casting `v.ToObject(...)` to `BigInteger` is redundant
in `leshan-core/src/main/java/org/eclipse/leshan/senml/cbor/upokecenter/SenMLCborPackSerDes.java`
#### Snippet
```java
                                record.setNumberValue(number.ToInt64Unchecked());
                            } else {
                                record.setNumberValue((BigInteger) v.ToObject(BigInteger.class));
                            }
                        } else {
```

### RedundantCast
Casting `v.ToObject(...)` to `BigInteger` is redundant
in `leshan-core/src/main/java/org/eclipse/leshan/senml/cbor/upokecenter/SenMLCborPackSerDes.java`
#### Snippet
```java
                                record.setNumberValue(ULong.valueOf(number.ToInt64Unchecked()));
                            } else {
                                record.setNumberValue((BigInteger) v.ToObject(BigInteger.class));
                            }
                        }
```

### RedundantCast
Casting `v.ToObject(...)` to `BigDecimal` is redundant
in `leshan-core/src/main/java/org/eclipse/leshan/senml/cbor/upokecenter/SenMLCborPackSerDes.java`
#### Snippet
```java
                            record.setNumberValue(v.AsDoubleValue());
                        } else {
                            record.setNumberValue((BigDecimal) v.ToObject(BigDecimal.class));
                        }
                        break;
```

### RedundantCast
Casting `value` to `ULong` is redundant
in `leshan-core/src/main/java/org/eclipse/leshan/senml/cbor/upokecenter/SenMLCborPackSerDes.java`
#### Snippet
```java
                        // unsigned integer
                        else if (value instanceof ULong) {
                            cborRecord.Add(2, NumberUtil.unsignedLongToEInteger(((ULong) value).longValue()));
                        }
                        // floating-point
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `repository` may be 'final'
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/model/VersionedModelProvider.java`
#### Snippet
```java
public class VersionedModelProvider implements LwM2mModelProvider {

    private LwM2mModelRepository repository;

    public VersionedModelProvider(Collection<ObjectModel> objectModels) {
```

### FieldMayBeFinal
Field `repository` may be 'final'
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/model/VersionedBootstrapModelProvider.java`
#### Snippet
```java
public class VersionedBootstrapModelProvider implements LwM2mBootstrapModelProvider {

    private LwM2mModelRepository repository;

    public VersionedBootstrapModelProvider(Collection<ObjectModel> objectModels) {
```

### FieldMayBeFinal
Field `store` may be 'final'
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/security/BootstrapSecurityStoreAdapter.java`
#### Snippet
```java
public class BootstrapSecurityStoreAdapter implements BootstrapSecurityStore {

    private SecurityStore store;

    public BootstrapSecurityStoreAdapter(SecurityStore store) {
```

### FieldMayBeFinal
Field `trustedCertificates` may be 'final'
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/security/ServerSecurityInfo.java`
#### Snippet
```java
    private PublicKey publicKey;
    private X509Certificate[] certificateChain;
    private Certificate[] trustedCertificates;

    public ServerSecurityInfo(PrivateKey privateKey, PublicKey publicKey, X509Certificate[] certificateChain,
```

### FieldMayBeFinal
Field `certificateChain` may be 'final'
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/security/ServerSecurityInfo.java`
#### Snippet
```java
    private PrivateKey privateKey;
    private PublicKey publicKey;
    private X509Certificate[] certificateChain;
    private Certificate[] trustedCertificates;

```

### FieldMayBeFinal
Field `DECLINED` may be 'final'
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/security/Authorization.java`
#### Snippet
```java

    private static Authorization APPROVED = new Authorization(true, null);
    private static Authorization DECLINED = new Authorization(false, null);

    private final boolean approved;
```

### FieldMayBeFinal
Field `APPROVED` may be 'final'
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/security/Authorization.java`
#### Snippet
```java
public class Authorization {

    private static Authorization APPROVED = new Authorization(true, null);
    private static Authorization DECLINED = new Authorization(false, null);

```

### FieldMayBeFinal
Field `privateKey` may be 'final'
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/security/ServerSecurityInfo.java`
#### Snippet
```java
public class ServerSecurityInfo {

    private PrivateKey privateKey;
    private PublicKey publicKey;
    private X509Certificate[] certificateChain;
```

### FieldMayBeFinal
Field `publicKey` may be 'final'
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/security/ServerSecurityInfo.java`
#### Snippet
```java

    private PrivateKey privateKey;
    private PublicKey publicKey;
    private X509Certificate[] certificateChain;
    private Certificate[] trustedCertificates;
```

### FieldMayBeFinal
Field `presenceService` may be 'final'
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/LeshanServer.java`
#### Snippet
```java
    private final SecurityStore securityStore;
    private final LwM2mModelProvider modelProvider;
    private PresenceServiceImpl presenceService;
    private final DownlinkRequestSender requestSender;

```

### FieldMayBeFinal
Field `store` may be 'final'
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/bootstrap/BootstrapConfigStoreTaskProvider.java`
#### Snippet
```java
    private static final Logger LOG = LoggerFactory.getLogger(BootstrapConfigStoreTaskProvider.class);

    private BootstrapConfigStore store;

    public BootstrapConfigStoreTaskProvider(BootstrapConfigStore store) {
```

### FieldMayBeFinal
Field `listeners` may be 'final'
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/bootstrap/BootstrapSessionDispatcher.java`
#### Snippet
```java
public class BootstrapSessionDispatcher implements BootstrapSessionListener {

    private List<BootstrapSessionListener> listeners = new CopyOnWriteArrayList<>();

    public void addListener(BootstrapSessionListener listener) {
```

### FieldMayBeFinal
Field `oscoreValidator` may be 'final'
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/bootstrap/ConfigurationChecker.java`
#### Snippet
```java
public class ConfigurationChecker {

    private OscoreValidator oscoreValidator = new OscoreValidator();

    /**
```

### FieldMayBeFinal
Field `store` may be 'final'
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/registration/RegistrationServiceImpl.java`
#### Snippet
```java
    private final List<RegistrationListener> listeners = new CopyOnWriteArrayList<>();

    private RegistrationStore store;

    public RegistrationServiceImpl(RegistrationStore store) {
```

### FieldMayBeFinal
Field `random` may be 'final'
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/object/LwM2mTestObject.java`
#### Snippet
```java
    public static final Link[] INITIAL_CORELINK_VALUE = new Link[] { new LwM2mLink(null, new LwM2mPath(3442)) };

    private Random random = new Random(System.currentTimeMillis());

    public LwM2mTestObject() {
```

### FieldMayBeFinal
Field `LOG` may be 'final'
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/resource/TransactionalObjectListener.java`
#### Snippet
```java
public class TransactionalObjectListener implements ObjectListener {

    private static Logger LOG = LoggerFactory.getLogger(TransactionalObjectListener.class);

    protected int currentLevel = 0;
```

### FieldMayBeFinal
Field `checker` may be 'final'
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/bootstrap/BootstrapHandler.java`
#### Snippet
```java

    private final Map<Integer, LwM2mObjectEnabler> objects;
    private BootstrapConsistencyChecker checker;

    public BootstrapHandler(Map<Integer, LwM2mObjectEnabler> objectEnablers, BootstrapConsistencyChecker checker) {
```

### FieldMayBeFinal
Field `LOG` may be 'final'
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/resource/DummyInstanceEnabler.java`
#### Snippet
```java
public class DummyInstanceEnabler extends SimpleInstanceEnabler {

    private static Logger LOG = LoggerFactory.getLogger(DummyInstanceEnabler.class);

    public DummyInstanceEnabler() {
```

### FieldMayBeFinal
Field `securityStore` may be 'final'
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/LwM2mPskStore.java`
#### Snippet
```java
public class LwM2mPskStore implements AdvancedPskStore {

    private SecurityStore securityStore;
    private RegistrationStore registrationStore;

```

### FieldMayBeFinal
Field `registrationStore` may be 'final'
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/LwM2mPskStore.java`
#### Snippet
```java

    private SecurityStore securityStore;
    private RegistrationStore registrationStore;

    public LwM2mPskStore(SecurityStore securityStore) {
```

### FieldMayBeFinal
Field `LOG` may be 'final'
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/resource/ObjectEnabler.java`
#### Snippet
```java
public class ObjectEnabler extends BaseObjectEnabler implements Destroyable, Startable, Stoppable {

    private static Logger LOG = LoggerFactory.getLogger(DummyInstanceEnabler.class);

    protected Map<Integer, LwM2mInstanceEnabler> instances;
```

### FieldMayBeFinal
Field `bsSecurityStore` may be 'final'
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/bootstrap/LwM2mBootstrapPskStore.java`
#### Snippet
```java
public class LwM2mBootstrapPskStore implements AdvancedPskStore {

    private BootstrapSecurityStore bsSecurityStore;

    public LwM2mBootstrapPskStore(BootstrapSecurityStore bsSecurityStore) {
```

### FieldMayBeFinal
Field `parameters` may be 'final'
in `leshan-core-cf/src/main/java/org/eclipse/leshan/core/californium/oscore/cf/StaticOscoreStore.java`
#### Snippet
```java
public class StaticOscoreStore implements OscoreStore {

    private OscoreParameters parameters;

    public StaticOscoreStore(OscoreParameters parameters) {
```

### FieldMayBeFinal
Field `argSpecs` may be 'final'
in `leshan-core-demo/src/main/java/org/eclipse/leshan/core/demo/cli/MultiParameterException.java`
#### Snippet
```java
    private static final long serialVersionUID = 1L;

    private List<ArgSpec> argSpecs;

    public MultiParameterException(CommandLine commandLine, String msg, String... optionNames) {
```

### FieldMayBeFinal
Field `onValue` may be 'final'
in `leshan-core-demo/src/main/java/org/eclipse/leshan/core/demo/cli/converters/CIDConverter.java`
#### Snippet
```java
public class CIDConverter implements ITypeConverter<Integer> {

    private Integer onValue;

    public CIDConverter(Integer onValue) {
```

### FieldMayBeFinal
Field `commandLine` may be 'final'
in `leshan-core-demo/src/main/java/org/eclipse/leshan/core/demo/cli/interactive/InteractiveCLI.java`
#### Snippet
```java

    private ConsoleReader console;
    private CommandLine commandLine;

    public InteractiveCLI(JLineInteractiveCommands interactivesCommands) throws IOException {
```

### FieldMayBeFinal
Field `console` may be 'final'
in `leshan-core-demo/src/main/java/org/eclipse/leshan/core/demo/cli/interactive/InteractiveCLI.java`
#### Snippet
```java
public class InteractiveCLI {

    private ConsoleReader console;
    private CommandLine commandLine;

```

### FieldMayBeFinal
Field `code` may be 'final'
in `leshan-core/src/main/java/org/eclipse/leshan/core/ResponseCode.java`
#### Snippet
```java
            INTERNAL_SERVER_ERROR };

    private int code;
    private String name;

```

### FieldMayBeFinal
Field `name` may be 'final'
in `leshan-core/src/main/java/org/eclipse/leshan/core/ResponseCode.java`
#### Snippet
```java

    private int code;
    private String name;

    public ResponseCode(int code, String name) {
```

### FieldMayBeFinal
Field `supportedVersions` may be 'final'
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2m.java`
#### Snippet
```java
        public static LwM2mVersion V1_0 = new LwM2mVersion("1.0", true);
        public static LwM2mVersion V1_1 = new LwM2mVersion("1.1", true);
        private static LwM2mVersion[] supportedVersions = new LwM2mVersion[] { V1_0, V1_1 };

        private final boolean supported;
```

### FieldMayBeFinal
Field `serDes` may be 'final'
in `leshan-core/src/main/java/org/eclipse/leshan/core/json/jackson/JsonRootObjectSerDes.java`
#### Snippet
```java
public class JsonRootObjectSerDes extends JacksonJsonSerDes<JsonRootObject> {

    private JsonArrayEntrySerDes serDes = new JsonArrayEntrySerDes();

    @Override
```

### FieldMayBeFinal
Field `path` may be 'final'
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/lwm2m/MixedLwM2mLink.java`
#### Snippet
```java
public class MixedLwM2mLink extends Link {

    private LwM2mPath path;
    private String rootPath;

```

### FieldMayBeFinal
Field `rootPath` may be 'final'
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/lwm2m/MixedLwM2mLink.java`
#### Snippet
```java

    private LwM2mPath path;
    private String rootPath;

    public MixedLwM2mLink(String rootPath, LwM2mPath path, Attribute... attributes) {
```

### FieldMayBeFinal
Field `endpoint` may be 'final'
in `leshan-bsserver-demo/src/main/java/org/eclipse/leshan/server/bootstrap/demo/servlet/EventServlet.java`
#### Snippet
```java
    private class LeshanEventSource implements EventSource {

        private String endpoint;
        private Emitter emitter;

```

### FieldMayBeFinal
Field `attributeParser` may be 'final'
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/DefaultLinkParser.java`
#### Snippet
```java
public class DefaultLinkParser implements LinkParser {

    private AttributeParser attributeParser;

    public DefaultLinkParser() {
```

### FieldMayBeFinal
Field `parser` may be 'final'
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/lwm2m/DefaultLwM2mLinkParser.java`
#### Snippet
```java
public class DefaultLwM2mLinkParser implements LwM2mLinkParser {

    private LinkParser parser;

    public DefaultLwM2mLinkParser() {
```

### FieldMayBeFinal
Field `name` may be 'final'
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/attributes/ValuelessAttribute.java`
#### Snippet
```java
public class ValuelessAttribute implements Attribute {

    private String name;

    public ValuelessAttribute(String name) {
```

### FieldMayBeFinal
Field `knownAttributes` may be 'final'
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/attributes/DefaultAttributeParser.java`
#### Snippet
```java
public class DefaultAttributeParser implements AttributeParser {

    private Map<String, AttributeModel<?>> knownAttributes;

    public DefaultAttributeParser() {
```

### FieldMayBeFinal
Field `name` may be 'final'
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/attributes/AttributeModel.java`
#### Snippet
```java
public abstract class AttributeModel<T extends Attribute> {

    private String name;

    public AttributeModel(String name) {
```

### FieldMayBeFinal
Field `name` may be 'final'
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/attributes/BaseAttribute.java`
#### Snippet
```java
    private static final Pattern parnamePattern = Pattern.compile("[!#$&+\\-.^_`|~a-zA-Z0-9]+");

    private String name;
    private Object value;

```

### FieldMayBeFinal
Field `value` may be 'final'
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/attributes/BaseAttribute.java`
#### Snippet
```java

    private String name;
    private Object value;

    public BaseAttribute(String name, Object value, boolean validate) {
```

### FieldMayBeFinal
Field `id` may be 'final'
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/LwM2mObject.java`
#### Snippet
```java
public class LwM2mObject implements LwM2mNode {

    private int id;

    private final Map<Integer, LwM2mObjectInstance> instances;
```

### FieldMayBeFinal
Field `lwm2mAttributes` may be 'final'
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/lwm2m/attributes/MixedLwM2mAttributeSet.java`
#### Snippet
```java
public class MixedLwM2mAttributeSet extends AttributeSet {

    private Iterable<LwM2mAttribute<?>> lwm2mAttributes;

    public MixedLwM2mAttributeSet(Attribute... attributes) {
```

### FieldMayBeFinal
Field `out` may be 'final'
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/codec/tlv/LwM2mNodeTlvEncoder.java`
#### Snippet
```java

        // visitor output
        private ByteArrayOutputStream out = new ByteArrayOutputStream();

        @Override
```

### FieldMayBeFinal
Field `path` may be 'final'
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/codec/senml/LwM2mResolvedSenMLRecord.java`
#### Snippet
```java
public class LwM2mResolvedSenMLRecord extends ResolvedSenMLRecord {

    private LwM2mPath path;

    /**
```

### FieldMayBeFinal
Field `extactCNPattern` may be 'final'
in `leshan-core/src/main/java/org/eclipse/leshan/core/util/X509CertUtil.java`
#### Snippet
```java
    }

    private static Pattern extactCNPattern = Pattern.compile("CN=(.*?)(,|$)");

    /**
```

### FieldMayBeFinal
Field `permissiveNumberConversion` may be 'final'
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/codec/senml/LwM2mNodeSenMLDecoder.java`
#### Snippet
```java

    private final SenMLDecoder decoder;
    private boolean permissiveNumberConversion;
    // parser used for core link data type
    private final LinkParser linkParser;
```

### FieldMayBeFinal
Field `LWM2M_V1_1_SCHEMA_PATH` may be 'final'
in `leshan-core/src/main/java/org/eclipse/leshan/core/model/DefaultDDFFileValidator.java`
#### Snippet
```java
public class DefaultDDFFileValidator implements DDFFileValidator {
    private static String LWM2M_V1_0_SCHEMA_PATH = "/schemas/LWM2M.xsd";
    private static String LWM2M_V1_1_SCHEMA_PATH = "/schemas/LWM2M-v1_1.xsd";

    private final String schema;
```

### FieldMayBeFinal
Field `LWM2M_V1_0_SCHEMA_PATH` may be 'final'
in `leshan-core/src/main/java/org/eclipse/leshan/core/model/DefaultDDFFileValidator.java`
#### Snippet
```java

public class DefaultDDFFileValidator implements DDFFileValidator {
    private static String LWM2M_V1_0_SCHEMA_PATH = "/schemas/LWM2M.xsd";
    private static String LWM2M_V1_1_SCHEMA_PATH = "/schemas/LWM2M-v1_1.xsd";

```

### FieldMayBeFinal
Field `strToParse` may be 'final'
in `leshan-core/src/main/java/org/eclipse/leshan/core/parser/StringParser.java`
#### Snippet
```java
public abstract class StringParser<T extends Throwable> {

    private String strToParse;
    private int cursor;

```

### FieldMayBeFinal
Field `mandatoryForClient` may be 'final'
in `leshan-core/src/main/java/org/eclipse/leshan/core/request/ContentFormat.java`
#### Snippet
```java
    private final String mediaType;
    private final int code;
    private Set<LwM2mVersion> mandatoryForClient; // lwm2m version where this content format is mandatory at client side

    public ContentFormat(String name, String mediaType, int code, Collection<LwM2mVersion> mandatory) {
```

### FieldMayBeFinal
Field `response` may be 'final'
in `leshan-core/src/main/java/org/eclipse/leshan/core/response/SendableResponse.java`
#### Snippet
```java
    private static final Logger LOG = LoggerFactory.getLogger(SendableResponse.class);

    private T response;
    private Runnable sentCallback;

```

### FieldMayBeFinal
Field `sentCallback` may be 'final'
in `leshan-core/src/main/java/org/eclipse/leshan/core/response/SendableResponse.java`
#### Snippet
```java

    private T response;
    private Runnable sentCallback;

    public SendableResponse(T response) {
```

### FieldMayBeFinal
Field `location` may be 'final'
in `leshan-core/src/main/java/org/eclipse/leshan/core/response/CreateResponse.java`
#### Snippet
```java
public class CreateResponse extends AbstractLwM2mResponse {

    private String location;

    public CreateResponse(ResponseCode code, String location, String errorMessage) {
```

### FieldMayBeFinal
Field `record` may be 'final'
in `leshan-core/src/main/java/org/eclipse/leshan/senml/ResolvedSenMLRecord.java`
#### Snippet
```java
 */
public class ResolvedSenMLRecord {
    private SenMLRecord record;
    private String name;
    private BigDecimal timestampInSeconds;
```

### FieldMayBeFinal
Field `name` may be 'final'
in `leshan-core/src/main/java/org/eclipse/leshan/senml/ResolvedSenMLRecord.java`
#### Snippet
```java
public class ResolvedSenMLRecord {
    private SenMLRecord record;
    private String name;
    private BigDecimal timestampInSeconds;

```

### FieldMayBeFinal
Field `timestampInSeconds` may be 'final'
in `leshan-core/src/main/java/org/eclipse/leshan/senml/ResolvedSenMLRecord.java`
#### Snippet
```java
    private SenMLRecord record;
    private String name;
    private BigDecimal timestampInSeconds;

    public ResolvedSenMLRecord(SenMLRecord unresolvedRecord, String resolvedName, BigDecimal resolvedTimestamp) {
```

### FieldMayBeFinal
Field `currentTimestampInSeconds` may be 'final'
in `leshan-core/src/main/java/org/eclipse/leshan/senml/SenMLResolver.java`
#### Snippet
```java
public abstract class SenMLResolver<T extends ResolvedSenMLRecord> {

    private BigDecimal currentTimestampInSeconds = TimestampUtil.fromInstant(Instant.now());
    private String currentBasename = null;
    private BigDecimal currentBasetime = null;
```

### FieldMayBeFinal
Field `linkSerializer` may be 'final'
in `leshan-server-demo/src/main/java/org/eclipse/leshan/server/demo/servlet/json/JacksonLwM2mNodeSerializer.java`
#### Snippet
```java
    private static final long serialVersionUID = 1L;

    private LinkSerializer linkSerializer = new DefaultLinkSerializer();

    protected JacksonLwM2mNodeSerializer(Class<LwM2mNode> t) {
```

### FieldMayBeFinal
Field `linkparser` may be 'final'
in `leshan-server-demo/src/main/java/org/eclipse/leshan/server/demo/servlet/json/JacksonLwM2mNodeDeserializer.java`
#### Snippet
```java
public class JacksonLwM2mNodeDeserializer extends JsonDeserializer<LwM2mNode> {

    private LinkParser linkparser = new DefaultLwM2mLinkParser();

    @Override
```

## RuleId[id=SynchronizationOnLocalVariableOrMethodParameter]
### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on method parameter `session`
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/bootstrap/DefaultBootstrapHandler.java`
#### Snippet
```java
    protected <T extends LwM2mResponse> void send(BootstrapSession session, BootstrapDownlinkRequest<T> request,
            ResponseCallback<T> responseCallback, ErrorCallback errorCallback) {
        synchronized (session) {
            if (!session.isCancelled()) {
                sender.send(session, request, requestTimeout, responseCallback, errorCallback);
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `oldSession`
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/bootstrap/DefaultBootstrapHandler.java`
#### Snippet
```java
        if (oldSession != null) {
            // stop previous ongoing session.
            synchronized (oldSession) {
                oldSession.cancel();
                this.sender.cancelOngoingRequests(oldSession);
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `response` is redundant
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/send/SendHandler.java`
#### Snippet
```java

    public SendableResponse<SendResponse> handleSend(final Registration registration, final SendRequest request) {
        SendableResponse<SendResponse> response = new SendableResponse<>(SendResponse.success(), new Runnable() {
            @Override
            public void run() {
```

### UnnecessaryLocalVariable
Local variable `response` is redundant
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/request/DefaultDownlinkRequestSender.java`
#### Snippet
```java

        // Send requests synchronously
        T response = endpoint.send(new ClientProfile(destination, model), request, lowerLayerConfig, timeoutInMs);
        return response;
    }
```

### UnnecessaryLocalVariable
Local variable `observationService` is redundant
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/LeshanServer.java`
#### Snippet
```java
            boolean updateRegistrationOnNotification, LwM2mServerEndpointsProvider endpointsProvider) {

        ObservationServiceImpl observationService = new ObservationServiceImpl(registrationStore, endpointsProvider,
                updateRegistrationOnNotification);
        return observationService;
```

### UnnecessaryLocalVariable
Local variable `response` is redundant
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/bootstrap/request/DefaultBootstrapDownlinkRequestSender.java`
#### Snippet
```java

        // Send requests synchronously
        T response = endpoint.send(destination, request, timeoutInMs);
        return response;
    }
```

### UnnecessaryLocalVariable
Local variable `obs` is redundant
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/registration/InMemoryRegistrationStore.java`
#### Snippet
```java

    private Observation unsafeGetObservation(ObservationIdentifier token) {
        Observation obs = obsByToken.get(token);
        return obs;
    }
```

### UnnecessaryLocalVariable
Local variable `factory` is redundant
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/resource/ObjectsInitializer.java`
#### Snippet
```java

    protected LwM2mInstanceEnablerFactory getClassFactory(final Class<? extends LwM2mInstanceEnabler> clazz) {
        LwM2mInstanceEnablerFactory factory = new BaseInstanceEnablerFactory() {
            @Override
            public LwM2mInstanceEnabler create() {
```

### UnnecessaryLocalVariable
Local variable `lwM2mResponse` is redundant
in `leshan-client-cf/src/main/java/org/eclipse/leshan/client/californium/endpoint/CaliforniumClientEndpoint.java`
#### Snippet
```java
            public T buildResponse(Response coapResponse) {
                // Build LwM2m response
                T lwM2mResponse = translator.createLwM2mResponse(server, lwm2mRequest, coapRequest, coapResponse,
                        toolbox);
                return lwM2mResponse;
```

### UnnecessaryLocalVariable
Local variable `lwM2mResponse` is redundant
in `leshan-client-cf/src/main/java/org/eclipse/leshan/client/californium/endpoint/CaliforniumClientEndpoint.java`
#### Snippet
```java
            public T buildResponse(Response coapResponse) {
                // Build LwM2m response
                T lwM2mResponse = translator.createLwM2mResponse(server, lwm2mRequest, coapRequest, coapResponse,
                        toolbox);
                return lwM2mResponse;
```

### UnnecessaryLocalVariable
Local variable `endpoint` is redundant
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/bootstrap/endpoint/coaps/CoapsBootstrapServerEndpointFactory.java`
#### Snippet
```java

        // create CoAP endpoint
        CoapEndpoint endpoint = createEndpointBuilder(dtlsConfig, configurationToUse).build();

        return endpoint;
```

### UnnecessaryLocalVariable
Local variable `endpoint` is redundant
in `leshan-client-cf/src/main/java/org/eclipse/leshan/client/californium/endpoint/coaps/CoapsClientEndpointFactory.java`
#### Snippet
```java

        // create CoAP endpoint
        CoapEndpoint endpoint = createEndpointBuilder(dtlsConfig, defaultConfiguration).build();

        return endpoint;
```

### UnnecessaryLocalVariable
Local variable `valueUnescaped` is redundant
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/attributes/QuotedStringAttribute.java`
#### Snippet
```java

        String unquotedValue = parser.substring(start, end);
        String valueUnescaped = unquotedValue.replace("\\\"", "\"");
        return valueUnescaped;
    }
```

### UnnecessaryLocalVariable
Local variable `relationType` is redundant
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/attributes/ResourceTypeAttribute.java`
#### Snippet
```java
            }
            int end = parser.getPosition();
            String relationType = parser.substring(start, end);
            return relationType;
        }
```

## RuleId[id=UnpredictableBigDecimalConstructorCall]
### UnpredictableBigDecimalConstructorCall
Unpredictable `new BigDecimal()` call
in `leshan-core/src/main/java/org/eclipse/leshan/core/util/datatype/NumberUtil.java`
#### Snippet
```java
            BigDecimal bigDec = null;
            if (number instanceof Float || number instanceof Double) {
                bigDec = new BigDecimal(number.doubleValue());
            } else if (number instanceof BigDecimal) {
                bigDec = (BigDecimal) number;
```

### UnpredictableBigDecimalConstructorCall
Unpredictable `new BigDecimal()` call
in `leshan-core/src/main/java/org/eclipse/leshan/core/util/datatype/NumberUtil.java`
#### Snippet
```java
            BigDecimal bigDec = null;
            if (number instanceof Float || number instanceof Double) {
                bigDec = new BigDecimal(number.doubleValue());
            } else if (number instanceof BigDecimal) {
                bigDec = (BigDecimal) number;
```

## RuleId[id=BusyWait]
### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `leshan-server-redis/src/main/java/org/eclipse/leshan/server/redis/SingleInstanceJedisLock.java`
#### Snippet
```java
                        String.format("Could not acquire a lock from redis after waiting for %dms", maxTime));
            try {
                Thread.sleep(iterationTime);
            } catch (InterruptedException e) {
            }
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `leshan-server-redis/src/main/java/org/eclipse/leshan/server/redis/RedisLock.java`
#### Snippet
```java
                throw new IllegalStateException("Could not acquire a lock from redis");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
            }
```

## RuleId[id=ThrowableNotThrown]
### ThrowableNotThrown
Runtime exception instance `new LwM2mNodeException()` is not thrown
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/LwM2mMultipleResource.java`
#### Snippet
```java
        for (LwM2mResourceInstance instance : instances) {
            if (type != instance.getType())
                new LwM2mNodeException("Invalid resource instance %d, type is %s but resource is %s.", id,
                        instance.getType(), type);
            instancesMap.put(instance.getId(), instance);
```

### ThrowableNotThrown
Runtime exception instance `new InvalidRequestException()` is not thrown
in `leshan-core/src/main/java/org/eclipse/leshan/core/request/WriteCompositeRequest.java`
#### Snippet
```java
                internalNodes.put(path, LwM2mResourceInstance.newInstance(path.getResourceId(), entry.getValue()));
            } else {
                new InvalidRequestException("Invalid value : path (%s) should target a resource or resource instance");
            }
        }
```

## RuleId[id=ArraysAsListWithZeroOrOneArgument]
### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/security/BootstrapSecurityStoreAdapter.java`
#### Snippet
```java
        if (securityInfo == null)
            return null;
        return Arrays.asList(securityInfo).iterator();
    }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/bootstrap/endpoint/BootstrapServerCoapMessageTranslator.java`
#### Snippet
```java
    public List<Resource> createResources(BootstrapUplinkRequestReceiver receiver,
            BootstrapServerEndpointToolbox toolbox, IdentityHandlerProvider identityHandlerProvider) {
        return Arrays.asList((Resource) new BootstrapResource(receiver, identityHandlerProvider));
    }
}
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `leshan-client-cf/src/main/java/org/eclipse/leshan/client/californium/BaseCertificateVerifier.java`
#### Snippet
```java
public abstract class BaseCertificateVerifier implements NewAdvancedCertificateVerifier {

    private final List<CertificateType> supportedCertificateType = Arrays.asList(CertificateType.X_509);

    @Override
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `leshan-client-cf/src/main/java/org/eclipse/leshan/client/californium/endpoint/CaliforniumClientEndpointsProvider.java`
#### Snippet
```java
    @Override
    public List<LwM2mClientEndpoint> getEndpoints() {
        return Arrays.asList(endpoint);
    }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/codec/senml/LwM2mNodeSenMLDecoder.java`
#### Snippet
```java
                LwM2mResolvedSenMLRecord resolvedRecord = resolver.resolve(record);
                LwM2mPath path = resolvedRecord.getPath();
                LwM2mNode node = parseRecords(Arrays.asList(resolvedRecord), path, model,
                        DefaultLwM2mDecoder.nodeClassFromPath(path));
                nodes.put(TimestampUtil.fromSeconds(resolvedRecord.getTimeStamp()), path, node);
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/codec/senml/LwM2mNodeSenMLDecoder.java`
#### Snippet
```java
                    LwM2mResolvedSenMLRecord resolvedRecord = resolver.resolve(record);
                    LwM2mPath path = resolvedRecord.getPath();
                    LwM2mNode node = parseRecords(Arrays.asList(resolvedRecord), path, model,
                            DefaultLwM2mDecoder.nodeClassFromPath(path));
                    nodes.put(path, node);
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `leshan-core/src/main/java/org/eclipse/leshan/core/request/ContentFormat.java`
#### Snippet
```java
            Arrays.asList(LwM2mVersion.V1_1));
    public static final ContentFormat OPAQUE = new ContentFormat("OPAQUE", "application/octet-stream", OPAQUE_CODE,
            Arrays.asList(LwM2mVersion.V1_1));
    public static final ContentFormat LINK = new ContentFormat("LINK", "application/link-format", LINK_CODE,
            Arrays.asList(LwM2mVersion.V1_1));
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `leshan-core/src/main/java/org/eclipse/leshan/core/request/ContentFormat.java`
#### Snippet
```java
    public static final ContentFormat JSON = new ContentFormat("JSON", "application/vnd.oma.lwm2m+json", JSON_CODE);
    public static final ContentFormat TEXT = new ContentFormat("TEXT", "text/plain", TEXT_CODE,
            Arrays.asList(LwM2mVersion.V1_1));
    public static final ContentFormat OPAQUE = new ContentFormat("OPAQUE", "application/octet-stream", OPAQUE_CODE,
            Arrays.asList(LwM2mVersion.V1_1));
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `leshan-core/src/main/java/org/eclipse/leshan/core/request/ContentFormat.java`
#### Snippet
```java

    public static final ContentFormat TLV = new ContentFormat("TLV", "application/vnd.oma.lwm2m+tlv", TLV_CODE,
            Arrays.asList(LwM2mVersion.V1_0));
    public static final ContentFormat JSON = new ContentFormat("JSON", "application/vnd.oma.lwm2m+json", JSON_CODE);
    public static final ContentFormat TEXT = new ContentFormat("TEXT", "text/plain", TEXT_CODE,
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `leshan-core/src/main/java/org/eclipse/leshan/core/request/ContentFormat.java`
#### Snippet
```java
            Arrays.asList(LwM2mVersion.V1_1));
    public static final ContentFormat LINK = new ContentFormat("LINK", "application/link-format", LINK_CODE,
            Arrays.asList(LwM2mVersion.V1_1));
    public static final ContentFormat SENML_JSON = new ContentFormat("SENML_JSON", "application/senml+json",
            SENML_JSON_CODE);
```

## RuleId[id=PointlessBooleanExpression]
### PointlessBooleanExpression
`clazz.isInstance(it.next()) == false` can be simplified to '!clazz.isInstance(it.next())'
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/LwM2mNodeUtil.java`
#### Snippet
```java
        int i = 0;
        for (Iterator<?> it = collection.iterator(); it.hasNext(); i++) {
            if (clazz.isInstance(it.next()) == false) {
                throw new LwM2mNodeException("The validated collection contains an element not of type "
                        + clazz.getName() + " at index: " + i);
```

### PointlessBooleanExpression
`Character.isDigit(str.charAt(i)) == false` can be simplified to '!Character.isDigit(str.charAt(i))'
in `leshan-core/src/main/java/org/eclipse/leshan/core/util/StringUtils.java`
#### Snippet
```java
        int sz = str.length();
        for (int i = 0; i < sz; i++) {
            if (Character.isDigit(str.charAt(i)) == false) {
                return false;
            }
```

### PointlessBooleanExpression
`expression == false` can be simplified to '!expression'
in `leshan-core/src/main/java/org/eclipse/leshan/core/util/Validate.java`
#### Snippet
```java
     */
    public static void isTrue(boolean expression, String message, double value) {
        if (expression == false) {
            throw new IllegalArgumentException(message + value);
        }
```

### PointlessBooleanExpression
`expression == false` can be simplified to '!expression'
in `leshan-core/src/main/java/org/eclipse/leshan/core/util/Validate.java`
#### Snippet
```java
     */
    public static void isTrue(boolean expression, String message) {
        if (expression == false) {
            throw new IllegalArgumentException(message);
        }
```

### PointlessBooleanExpression
`expression == false` can be simplified to '!expression'
in `leshan-core/src/main/java/org/eclipse/leshan/core/util/Validate.java`
#### Snippet
```java
     */
    public static void isTrue(boolean expression, String message, Object value) {
        if (expression == false) {
            throw new IllegalArgumentException(message + value);
        }
```

### PointlessBooleanExpression
`expression == false` can be simplified to '!expression'
in `leshan-core/src/main/java/org/eclipse/leshan/core/util/Validate.java`
#### Snippet
```java
     */
    public static void isTrue(boolean expression, String message, long value) {
        if (expression == false) {
            throw new IllegalArgumentException(message + value);
        }
```

### PointlessBooleanExpression
`clazz.isInstance(it.next()) == false` can be simplified to '!clazz.isInstance(it.next())'
in `leshan-core/src/main/java/org/eclipse/leshan/core/util/Validate.java`
#### Snippet
```java
        int i = 0;
        for (Iterator it = collection.iterator(); it.hasNext(); i++) {
            if (clazz.isInstance(it.next()) == false) {
                throw new IllegalArgumentException("The validated collection contains an element not of type "
                        + clazz.getName() + " at index: " + i);
```

### PointlessBooleanExpression
`expression == false` can be simplified to '!expression'
in `leshan-core/src/main/java/org/eclipse/leshan/core/util/Validate.java`
#### Snippet
```java
     */
    public static void isTrue(boolean expression) {
        if (expression == false) {
            throw new IllegalArgumentException("The validated expression is false");
        }
```

### PointlessBooleanExpression
`clazz.isInstance(it.next()) == false` can be simplified to '!clazz.isInstance(it.next())'
in `leshan-core/src/main/java/org/eclipse/leshan/core/util/Validate.java`
#### Snippet
```java
        Validate.notNull(clazz);
        for (Iterator it = collection.iterator(); it.hasNext();) {
            if (clazz.isInstance(it.next()) == false) {
                throw new IllegalArgumentException(message);
            }
```

## RuleId[id=UseBulkOperation]
### UseBulkOperation
Iteration can be replaced with bulk 'Collection.addAll()' call
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/registration/Registration.java`
#### Snippet
```java
            this.supportedContentFormats = new HashSet<>();
            for (ContentFormat contentFormat : supportedContentFormats) {
                this.supportedContentFormats.add(contentFormat);
            }
            return this;
```

## RuleId[id=BigDecimalMethodWithoutRoundingCalled]
### BigDecimalMethodWithoutRoundingCalled
'BigDecimal.divide()' called without a rounding mode argument
in `leshan-core/src/main/java/org/eclipse/leshan/core/util/TimestampUtil.java`
#### Snippet
```java
        }

        BigDecimal decimalPoints = new BigDecimal(timestamp.getNano()).divide(new BigDecimal(1_000_000_000));
        return BigDecimal.valueOf(timestamp.getEpochSecond()).add(decimalPoints);
    }
```

