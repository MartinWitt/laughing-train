# leshan 
 
# Bad smells
I found 1069 bad smells with 280 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| ReturnNull | 209 | false |
| UnnecessaryModifier | 130 | true |
| BoundedWildcard | 51 | false |
| RedundantFieldInitialization | 49 | false |
| ZeroLengthArrayInitialization | 42 | false |
| MissortedModifiers | 41 | false |
| UnnecessarySemicolon | 35 | false |
| UnnecessaryFullyQualifiedName | 31 | false |
| UtilityClassWithoutPrivateConstructor | 30 | true |
| UnnecessaryReturn | 28 | true |
| ToArrayCallWithZeroLengthArrayArgument | 23 | true |
| MethodOverridesStaticMethod | 23 | false |
| AssignmentToMethodParameter | 23 | false |
| UnusedAssignment | 21 | false |
| PublicFieldAccessedInSynchronizedContext | 20 | false |
| ConstantValue | 18 | false |
| SizeReplaceableByIsEmpty | 17 | true |
| StringBufferReplaceableByString | 17 | false |
| DataFlowIssue | 16 | false |
| Convert2Lambda | 15 | false |
| UnnecessaryToStringCall | 13 | true |
| LongLiteralsEndingWithLowercaseL | 12 | false |
| NonProtectedConstructorInAbstractClass | 12 | true |
| UnnecessaryLocalVariable | 12 | true |
| NonSerializableFieldInSerializableClass | 11 | false |
| WrapperTypeMayBePrimitive | 9 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 9 | false |
| PointlessBooleanExpression | 9 | true |
| SynchronizeOnThis | 8 | false |
| Java8MapApi | 8 | false |
| RedundantStringFormatCall | 7 | false |
| CatchMayIgnoreException | 6 | false |
| AssignmentToForLoopParameter | 6 | false |
| ThrowablePrintStackTrace | 6 | false |
| IgnoreResultOfCall | 5 | false |
| IfStatementWithIdenticalBranches | 5 | false |
| ReplaceAssignmentWithOperatorAssignment | 5 | false |
| CStyleArrayDeclaration | 4 | false |
| DuplicateBranchesInSwitch | 4 | false |
| DefaultAnnotationParam | 4 | false |
| NestedAssignment | 4 | false |
| UnnecessaryCallToStringValueOf | 4 | false |
| DynamicRegexReplaceableByCompiledPattern | 4 | false |
| Anonymous2MethodRef | 4 | false |
| RegExpRedundantEscape | 3 | false |
| NumberEquality | 3 | false |
| RedundantMethodOverride | 3 | false |
| UnnecessarySuperQualifier | 3 | false |
| EmptyMethod | 3 | false |
| InnerClassMayBeStatic | 3 | true |
| UnnecessaryBoxing | 3 | false |
| CommentedOutCode | 2 | false |
| DuplicateExpressions | 2 | false |
| CodeBlock2Expr | 2 | true |
| NonFinalFieldOfException | 2 | false |
| StringOperationCanBeSimplified | 2 | false |
| NonSynchronizedMethodOverridesSynchronizedMethod | 2 | false |
| SuspiciousMethodCalls | 2 | false |
| UtilityClassWithPublicConstructor | 2 | false |
| ConditionCoveredByFurtherCondition | 2 | false |
| SynchronizationOnLocalVariableOrMethodParameter | 2 | false |
| BusyWait | 2 | false |
| ThrowableNotThrown | 2 | false |
| KeySetIterationMayUseEntrySet | 1 | false |
| RedundantArrayCreation | 1 | true |
| AnonymousHasLambdaAlternative | 1 | false |
| DuplicateThrows | 1 | false |
| RedundantOperationOnEmptyContainer | 1 | false |
| FieldMayBeStatic | 1 | false |
| ManualArrayToCollectionCopy | 1 | false |
| InstantiatingObjectToGetClassObject | 1 | false |
| SystemOutErr | 1 | false |
| ImplicitArrayToString | 1 | false |
| SuspiciousToArrayCall | 1 | false |
| UseCompareMethod | 1 | false |
| UseBulkOperation | 1 | false |
| BigDecimalMethodWithoutRoundingCalled | 1 | false |
## RuleId[id=ToArrayCallWithZeroLengthArrayArgument]
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
Call to `toArray()` with pre-sized array argument 'new LwM2mLink\[links.size()\]'
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/util/LinkFormatHelper.java`
#### Snippet
```java
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
Call to `toArray()` with pre-sized array argument 'new LwM2mPath\[changingResources.size()\]'
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/resource/SimpleInstanceEnabler.java`
#### Snippet
```java
        }

        return changingResources.toArray(new LwM2mPath[changingResources.size()]);
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
in `leshan-core/src/main/java/org/eclipse/leshan/core/json/LwM2mJsonEncoder.java`
#### Snippet
```java
public interface LwM2mJsonEncoder {

    public String toJsonLwM2m(JsonRootObject jro) throws LwM2mJsonException;

}
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
    public BootstrapPolicy onResponseSuccess(BootstrapSession bsSession,
            BootstrapDownlinkRequest<? extends LwM2mResponse> request, LwM2mResponse response);

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

## RuleId[id=KeySetIterationMayUseEntrySet]
### KeySetIterationMayUseEntrySet
Iteration over `attributes.keySet()` may be replaced with 'entrySet()' iteration
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/observation/EndpointContextSerDes.java`
#### Snippet
```java
        if (!attributes.isEmpty()) {
            ObjectNode attContext = JsonNodeFactory.instance.objectNode();
            for (Definition<?> key : attributes.keySet()) {
                // write all values as string
                Object value = attributes.get(key);
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

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`segment.length() != 0` can be replaced with '!segment.isEmpty()'
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/DefaultLinkParser.java`
#### Snippet
```java
            // try to consume a segment
            String segment = consumeSegment(parser);
            if (segment.length() != 0) {
                // segment is not empty, so this is a segment-nz, we continue
                while (parser.nextCharIs('/')) {
```

### SizeReplaceableByIsEmpty
`parmName.length() == 0` can be replaced with 'parmName.isEmpty()'
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/DefaultLinkParser.java`
#### Snippet
```java

        // check parmName is at least 1 char length
        if (parmName.length() == 0) {
            throw new LinkParseException("Unable to parse [%s] : parmname should not be empty after %s",
                    parser.getStringToParse(), parser.getAlreadyParsedString());
```

### SizeReplaceableByIsEmpty
`ptoken.length() == 0` can be replaced with 'ptoken.isEmpty()'
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/attributes/UnquotedStringAttribute.java`
#### Snippet
```java

        // check parmName is at least 1 char length
        if (ptoken.length() == 0) {
            parser.raiseException("Unable to parse [%s] : ptoken should not be empty after %s",
                    parser.getStringToParse(), parser.getAlreadyParsedString());
```

### SizeReplaceableByIsEmpty
`str.length() == 0` can be replaced with 'str.isEmpty()'
in `leshan-core/src/main/java/org/eclipse/leshan/core/util/StringUtils.java`
#### Snippet
```java
     */
    public static boolean isEmpty(String str) {
        return str == null || str.length() == 0;
    }

```

### SizeReplaceableByIsEmpty
`timestampedNodes.size() == 0` can be replaced with 'timestampedNodes.isEmpty()'
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/codec/json/LwM2mNodeJsonDecoder.java`
#### Snippet
```java
            JsonRootObject json = decoder.fromJsonLwM2m(jsonStrValue);
            List<TimestampedLwM2mNode> timestampedNodes = parseJSON(json, path, model, nodeClass);
            if (timestampedNodes.size() == 0) {
                return null;
            } else {
```

### SizeReplaceableByIsEmpty
`map.size() == 0` can be replaced with 'map.isEmpty()'
in `leshan-core/src/main/java/org/eclipse/leshan/core/util/Validate.java`
#### Snippet
```java
     */
    public static void notEmpty(Map map, String message) {
        if (map == null || map.size() == 0) {
            throw new IllegalArgumentException(message);
        }
```

### SizeReplaceableByIsEmpty
`collection.size() == 0` can be replaced with 'collection.isEmpty()'
in `leshan-core/src/main/java/org/eclipse/leshan/core/util/Validate.java`
#### Snippet
```java
     */
    public static void notEmpty(Collection collection, String message) {
        if (collection == null || collection.size() == 0) {
            throw new IllegalArgumentException(message);
        }
```

### SizeReplaceableByIsEmpty
`string.length() == 0` can be replaced with 'string.isEmpty()'
in `leshan-core/src/main/java/org/eclipse/leshan/core/util/Validate.java`
#### Snippet
```java
     */
    public static void notEmpty(String string, String message) {
        if (string == null || string.length() == 0) {
            throw new IllegalArgumentException(message);
        }
```

### SizeReplaceableByIsEmpty
`recordsByInstanceId.size() == 0` can be replaced with 'recordsByInstanceId.isEmpty()'
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/codec/senml/LwM2mNodeSenMLDecoder.java`
#### Snippet
```java

            // handle empty multi instance resource ?
            if (recordsByInstanceId.size() == 0) {
                ResourceModel resourceModel = model.getResourceModel(path.getObjectId(), path.getResourceId());
                if (resourceModel == null || !resourceModel.multiple) {
```

### SizeReplaceableByIsEmpty
`sb.toString().length() == 0` can be replaced with 'sb.toString().isEmpty()'
in `leshan-core/src/main/java/org/eclipse/leshan/core/request/argument/Arguments.java`
#### Snippet
```java
        }

        if (sb.toString().length() == 0) {
            return null;
        }
```

### SizeReplaceableByIsEmpty
`record.getBaseName().length() > 0` can be replaced with '!record.getBaseName().isEmpty()'
in `leshan-core/src/main/java/org/eclipse/leshan/senml/json/jackson/SenMLJsonRecordSerDes.java`
#### Snippet
```java
        ObjectNode jsonObj = JsonNodeFactory.withExactBigDecimals(true).objectNode();

        if (record.getBaseName() != null && record.getBaseName().length() > 0) {
            jsonObj.put("bn", record.getBaseName());
        }
```

### SizeReplaceableByIsEmpty
`record.getName().length() > 0` can be replaced with '!record.getName().isEmpty()'
in `leshan-core/src/main/java/org/eclipse/leshan/senml/json/jackson/SenMLJsonRecordSerDes.java`
#### Snippet
```java
        }

        if (record.getName() != null && record.getName().length() > 0) {
            jsonObj.put("n", record.getName());
        }
```

### SizeReplaceableByIsEmpty
`instances.size() > 0` can be replaced with '!instances.isEmpty()'
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/resource/ObjectEnabler.java`
#### Snippet
```java
    @Override
    protected CreateResponse doCreate(ServerIdentity identity, CreateRequest request) {
        if (!getObjectModel().multiple && instances.size() > 0) {
            return CreateResponse.badRequest("an instance already exist for this single instance object");
        }
```

### SizeReplaceableByIsEmpty
`lwm2mPaths.size() == 0` can be replaced with 'lwm2mPaths.isEmpty()'
in `leshan-core-cf/src/main/java/org/eclipse/leshan/core/californium/ObserveUtil.java`
#### Snippet
```java
            }

            if (lwm2mPaths == null || lwm2mPaths.size() == 0) {
                throw new IllegalStateException("missing path in request context");
            }
```

### SizeReplaceableByIsEmpty
`lwm2mPath.size() == 0` can be replaced with 'lwm2mPath.isEmpty()'
in `leshan-core-cf/src/main/java/org/eclipse/leshan/core/californium/ObserveUtil.java`
#### Snippet
```java
            }

            if (lwm2mPath.size() == 0) {
                throw new IllegalStateException("missing paths in request context");
            }
```

### SizeReplaceableByIsEmpty
`certChain.getCertificates().size() == 0` can be replaced with 'certChain.getCertificates().isEmpty()'
in `leshan-client-cf/src/main/java/org/eclipse/leshan/client/californium/BaseCertificateVerifier.java`
#### Snippet
```java
     */
    protected void validateCertificateChainNotEmpty(CertPath certChain) throws HandshakeException {
        if (certChain.getCertificates().size() == 0) {
            AlertMessage alert = new AlertMessage(AlertLevel.FATAL, AlertDescription.BAD_CERTIFICATE);
            throw new HandshakeException("Certificate chain could not be validated : server cert chain is empty",
```

### SizeReplaceableByIsEmpty
`uri.size() == 0` can be replaced with 'uri.isEmpty()'
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/registration/RegisterResource.java`
#### Snippet
```java

        List<String> uri = exchange.getRequestOptions().getUriPath();
        if (uri == null || uri.size() == 0 || !RESOURCE_NAME.equals(uri.get(0))) {
            handleInvalidRequest(exchange, "Bad URI");
            return;
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
                b.append("Bootstrap session finished with success");

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
            try {
                String endpointName = session.getEndpoint();
                StringBuilder b = new StringBuilder();
                b.append(session.getIdentity());
                b.append(" is allowed to connect.");
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
        @Override
        public void onSleeping(Registration registration) {
            String data = new StringBuilder("{\"ep\":\"").append(registration.getEndpoint()).append("\"}").toString();

            sendEvent(EVENT_SLEEPING, data, registration.getEndpoint());
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

            if (registration != null) {
                String data = new StringBuilder("{\"ep\":\"") //
                        .append(registration.getEndpoint()) //
                        .append("\",\"kind\":\"single\"") //
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
in `leshan-server-demo/src/main/java/org/eclipse/leshan/server/demo/servlet/ClientServlet.java`
#### Snippet
```java
                handleException(e, resp);
            }
            return;
        }
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

## RuleId[id=NumberEquality]
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

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends Attribute`
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/Link.java`
#### Snippet
```java
     * @param attributes the object link attributes if the link has no attributes
     */
    public Link(String uriReference, Collection<Attribute> attributes) {
        this(uriReference, new AttributeSet(attributes));
    }
```

### BoundedWildcard
Can generalize to `? extends LinkParseException`
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/DefaultLinkParser.java`
#### Snippet
```java
     * </pre>
     */
    protected String consumeSegment(StringParser<LinkParseException> parser) throws LinkParseException {
        int start = parser.getPosition();

```

### BoundedWildcard
Can generalize to `? extends LwM2mPath`
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/LwM2mPath.java`
#### Snippet
```java
     * @exception IllegalArgumentException if there exists any pair of overlapping paths in the list
     */
    public static void validateNotOverlapping(List<LwM2mPath> paths) {
        for (int i = 0; i < paths.size(); i++) {
            LwM2mPath firstPath = paths.get(i);
```

### BoundedWildcard
Can generalize to `? extends LwM2mResource`
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/codec/tlv/LwM2mNodeTlvEncoder.java`
#### Snippet
```java
        }

        private Tlv[] encodeResources(Collection<LwM2mResource> resources, LwM2mPath instancePath) {
            Tlv[] rTlvs = new Tlv[resources.size()];
            int i = 0;
```

### BoundedWildcard
Can generalize to `? extends LwM2mPath`
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/codec/senml/LwM2mPathSenMLEncoder.java`
#### Snippet
```java

    @Override
    public byte[] encode(List<LwM2mPath> paths) {
        // Create SenML Pack
        SenMLPack pack = new SenMLPack();
```

### BoundedWildcard
Can generalize to `? extends TimestampedLwM2mNode`
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/codec/json/LwM2mNodeJsonEncoder.java`
#### Snippet
```java

    @Override
    public byte[] encodeTimestampedData(List<TimestampedLwM2mNode> timestampedNodes, LwM2mPath path, LwM2mModel model,
            LwM2mValueConverter converter) {
        Validate.notNull(timestampedNodes);
```

### BoundedWildcard
Can generalize to `? extends JsonArrayEntry`
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/codec/json/LwM2mNodeJsonDecoder.java`
#### Snippet
```java
     * @return a map (instanceId => collection of JsonArrayEntry)
     */
    private Map<Integer, Collection<JsonArrayEntry>> groupJsonEntryByInstanceId(Collection<JsonArrayEntry> jsonEntries,
            String baseName, LwM2mPath requestPath) throws CodecException {
        Map<Integer, Collection<JsonArrayEntry>> result = new HashMap<>();
```

### BoundedWildcard
Can generalize to `? extends JsonArrayEntry`
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/codec/json/LwM2mNodeJsonDecoder.java`
#### Snippet
```java
    }

    private Map<Integer, LwM2mResource> extractLwM2mResources(Collection<JsonArrayEntry> jsonArrayEntries,
            String baseName, LwM2mModel model, LwM2mPath requestPath) throws CodecException {
        if (jsonArrayEntries == null)
```

### BoundedWildcard
Can generalize to `? extends T`
in `leshan-core/src/main/java/org/eclipse/leshan/core/util/json/JacksonJsonSerDes.java`
#### Snippet
```java
    }

    public ArrayNode jSerialize(Collection<T> jaes) throws JsonException {
        ArrayNode array = JsonNodeFactory.instance.arrayNode();
        for (T jae : jaes) {
```

### BoundedWildcard
Can generalize to `? extends JsonNode`
in `leshan-core/src/main/java/org/eclipse/leshan/core/util/json/JacksonJsonSerDes.java`
#### Snippet
```java
    public abstract T deserialize(JsonNode o) throws JsonException;

    public List<T> deserialize(Iterator<JsonNode> nodes) throws JsonException {
        ArrayList<T> res = new ArrayList<>();
        while (nodes.hasNext()) {
```

### BoundedWildcard
Can generalize to `? extends TimestampedLwM2mNode`
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/codec/senml/LwM2mNodeSenMLEncoder.java`
#### Snippet
```java

    @Override
    public byte[] encodeTimestampedData(List<TimestampedLwM2mNode> timestampedNodes, LwM2mPath path, LwM2mModel model,
            LwM2mValueConverter converter) throws CodecException {
        Validate.notNull(timestampedNodes);
```

### BoundedWildcard
Can generalize to `? extends ObjectModel`
in `leshan-core/src/main/java/org/eclipse/leshan/core/model/StaticModel.java`
#### Snippet
```java
    }

    public StaticModel(Collection<ObjectModel> objectModels) {
        if (objectModels == null) {
            objects = new HashMap<>();
```

### BoundedWildcard
Can generalize to `? extends ObjectModel`
in `leshan-core/src/main/java/org/eclipse/leshan/core/model/DefaultObjectModelValidator.java`
#### Snippet
```java

    @Override
    public void validate(List<ObjectModel> models, String modelName) throws InvalidModelException {
        for (ObjectModel model : models) {
            validate(model, modelName);
```

### BoundedWildcard
Can generalize to `? extends ObjectModel`
in `leshan-core/src/main/java/org/eclipse/leshan/core/model/LwM2mModelRepository.java`
#### Snippet
```java
    }

    public LwM2mModelRepository(Collection<ObjectModel> objectModels) {
        if (objectModels == null) {
            objects = new TreeMap<>();
```

### BoundedWildcard
Can generalize to `? extends LwM2mPath`
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/codec/senml/LwM2mNodeSenMLDecoder.java`
#### Snippet
```java
     * E.g. for recordPath="/3/0/1" and paths=["/1/0","/2/0/","/3"] result will be "/3"
     */
    private LwM2mPath selectPath(LwM2mPath recordPath, List<LwM2mPath> paths) {
        for (LwM2mPath path : paths) {
            if (recordPath.startWith(path)) {
```

### BoundedWildcard
Can generalize to `? extends SenMLRecord`
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/codec/senml/LwM2mNodeSenMLDecoder.java`
#### Snippet
```java
     */
    private SortedMap<BigDecimal, Collection<LwM2mResolvedSenMLRecord>> groupRecordByTimestamp(
            List<SenMLRecord> records, LwM2mPath requestPath) throws SenMLException {
        SortedMap<BigDecimal, Collection<LwM2mResolvedSenMLRecord>> result = new TreeMap<>(
                new Comparator<BigDecimal>() {
```

### BoundedWildcard
Can generalize to `? extends LwM2mResolvedSenMLRecord`
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/codec/senml/LwM2mNodeSenMLDecoder.java`
#### Snippet
```java
    }

    private Map<Integer, LwM2mResource> extractLwM2mResources(Collection<LwM2mResolvedSenMLRecord> records,
            LwM2mPath requestPath, LwM2mModel model) throws CodecException {
        if (records == null)
```

### BoundedWildcard
Can generalize to `? extends LwM2mResolvedSenMLRecord`
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/codec/senml/LwM2mNodeSenMLDecoder.java`
#### Snippet
```java
     */
    private Map<Integer, Collection<LwM2mResolvedSenMLRecord>> groupRecordsByInstanceId(
            Collection<LwM2mResolvedSenMLRecord> records) throws CodecException {
        Map<Integer, Collection<LwM2mResolvedSenMLRecord>> result = new HashMap<>();
        for (LwM2mResolvedSenMLRecord record : records) {
```

### BoundedWildcard
Can generalize to `? extends SenMLRecord`
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/codec/senml/LwM2mNodeSenMLDecoder.java`
#### Snippet
```java
     * Resolved record then group it by LwM2mPath
     */
    private Map<LwM2mPath, Collection<LwM2mResolvedSenMLRecord>> groupByPath(List<SenMLRecord> records,
            List<LwM2mPath> paths) throws SenMLException {

```

### BoundedWildcard
Can generalize to `? extends ContentFormat`
in `leshan-core/src/main/java/org/eclipse/leshan/core/request/ContentFormat.java`
#### Snippet
```java
     * @return only optional {@link ContentFormat}
     */
    public static List<ContentFormat> getOptionalContentFormatForClient(Collection<ContentFormat> contentFormat,
            LwM2mVersion lwm2mVersion) {
        List<ContentFormat> optionalFormat = new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? extends SenMLRecord`
in `leshan-core/src/main/java/org/eclipse/leshan/senml/SenMLPack.java`
#### Snippet
```java
    }

    public void addRecords(List<SenMLRecord> records) {
        if (this.records == null) {
            this.records = new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? extends LwM2mObjectEnabler`
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/util/LinkFormatHelper.java`
#### Snippet
```java

    private static Map<Integer, List<LwM2mAttribute<?>>> extractOscoreAttributes(
            Collection<LwM2mObjectEnabler> objectEnablers) {
        Map<Integer/* oscore instance id */, List<LwM2mAttribute<?>>> oscoreAttributes = new HashMap<>();
        for (LwM2mObjectEnabler objectEnabler : objectEnablers) {
```

### BoundedWildcard
Can generalize to `? extends List`>
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/util/LinkFormatHelper.java`
#### Snippet
```java

    private static List<LwM2mLink> getBootstrapObjectDescriptionWithoutRoot(LwM2mObjectEnabler objectEnabler,
            Map<Integer, List<LwM2mAttribute<?>>> oscoreAttributesByInstanceId) {
        List<LwM2mLink> links = new ArrayList<>();

```

### BoundedWildcard
Can generalize to `? extends LwM2mObjectEnabler`
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/util/LinkFormatHelper.java`
#### Snippet
```java
    }

    public static Link[] getClientDescription(Collection<LwM2mObjectEnabler> objectEnablers, String rootPath,
            List<ContentFormat> supportedContentFormats) {
        List<Link> links = new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? extends DataSender`
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/LeshanClient.java`
#### Snippet
```java
    }

    protected DataSenderManager createDataSenderManager(List<DataSender> dataSenders, LwM2mRootEnabler rootEnabler,
            UplinkRequestSender requestSender) {
        Map<String, DataSender> dataSenderMap = new HashMap<>();
```

### BoundedWildcard
Can generalize to `? extends LwM2mObjectEnabler`
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/resource/LwM2mObjectTree.java`
#### Snippet
```java
    }

    public void endTransaction(Map<Integer, LwM2mObjectEnabler> enablers) {
        for (LwM2mObjectEnabler enabler : enablers.values()) {
            enabler.endTransaction(LwM2mPath.ROOT_DEPTH);
```

### BoundedWildcard
Can generalize to `? extends LwM2mObjectEnabler`
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/resource/LwM2mObjectTree.java`
#### Snippet
```java
    }

    public void beginTransaction(Map<Integer, LwM2mObjectEnabler> enablers) {
        for (LwM2mObjectEnabler enabler : enablers.values()) {
            enabler.beginTransaction(LwM2mPath.ROOT_DEPTH);
```

### BoundedWildcard
Can generalize to `? extends LwM2mResource`
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/resource/ObjectEnabler.java`
#### Snippet
```java

    protected LwM2mInstanceEnabler createInstance(ServerIdentity identity, Integer instanceId,
            Collection<LwM2mResource> resources) {
        // create the new instance
        LwM2mInstanceEnabler newInstance = instanceFactory.create(getObjectModel(), instanceId, instances.keySet());
```

### BoundedWildcard
Can generalize to `? super String`
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/bootstrap/DefaultBootstrapConsistencyChecker.java`
#### Snippet
```java
    }

    private void checkCertificateIsValid(ServerInfo serverInfo, List<String> errors) {
        if (serverInfo.secureMode == SecurityMode.X509) {
            if (!CertPathUtil.canBeUsedForAuthentication((X509Certificate) serverInfo.clientCertificate, true)) {
```

### BoundedWildcard
Can generalize to `? super String`
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/bootstrap/DefaultBootstrapConsistencyChecker.java`
#### Snippet
```java
    }

    private void checkOscoreIsValid(ServerInfo serverInfo, List<String> errors) {
        if (serverInfo.useOscore) {
            try {
```

### BoundedWildcard
Can generalize to `? extends LwM2mResource`
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/resource/BaseObjectEnabler.java`
#### Snippet
```java
    }

    protected boolean missingMandatoryResource(Collection<LwM2mResource> resources) {
        // check, if all mandatory writable resources are provided
        // Collect all mandatory writable resource IDs from the model
```

### BoundedWildcard
Can generalize to `? extends LwM2mObjectEnabler`
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/servers/ServersInfoExtractor.java`
#### Snippet
```java
    }

    public static ServersInfo getInfo(Map<Integer, LwM2mObjectEnabler> objectEnablers, boolean raiseException)
            throws IllegalStateException {

```

### BoundedWildcard
Can generalize to `? extends LwM2mObjectEnabler`
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/bootstrap/BaseBootstrapConsistencyChecker.java`
#### Snippet
```java
     * Check device object is valid
     */
    protected void checkDeviceObjectEnabler(Map<Integer, LwM2mObjectEnabler> objectEnablers, List<String> errors) {
        LwM2mObjectEnabler deviceObjectEnabler = objectEnablers.get(DEVICE);
        if (deviceObjectEnabler.getAvailableInstanceIds().size() != 1
```

### BoundedWildcard
Can generalize to `? super String`
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/bootstrap/BaseBootstrapConsistencyChecker.java`
#### Snippet
```java
     * Check device object is valid
     */
    protected void checkDeviceObjectEnabler(Map<Integer, LwM2mObjectEnabler> objectEnablers, List<String> errors) {
        LwM2mObjectEnabler deviceObjectEnabler = objectEnablers.get(DEVICE);
        if (deviceObjectEnabler.getAvailableInstanceIds().size() != 1
```

### BoundedWildcard
Can generalize to `? super String`
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/bootstrap/BaseBootstrapConsistencyChecker.java`
#### Snippet
```java
     * Check mandatory object enabler are present
     */
    protected void checkMandatoryObjectEnabler(Map<Integer, LwM2mObjectEnabler> objectEnablers, List<String> errors) {
        // Maybe it could make sense to use LwM2mModel and search for mandatory Object.
        // But there is some issue with current LeshanClient design :
```

### BoundedWildcard
Can generalize to `? super T`
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/request/DefaultDownlinkRequestSender.java`
#### Snippet
```java
    @Override
    public <T extends LwM2mResponse> void send(final Registration destination, DownlinkRequest<T> request,
            LowerLayerConfig lowerLayerConfig, long timeoutInMs, final ResponseCallback<T> responseCallback,
            ErrorCallback errorCallback) {

```

### BoundedWildcard
Can generalize to `? extends SecurityInfo`
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/security/SecurityChecker.java`
#### Snippet
```java
     * @see SecurityInfo
     */
    public boolean checkSecurityInfos(String endpoint, Identity clientIdentity, Iterator<SecurityInfo> securityInfos) {
        // if this is a secure end-point, we must check that the registering client is using the right identity.
        if (clientIdentity.isSecure()) {
```

### BoundedWildcard
Can generalize to `? extends DmServerInfo`
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/engine/DefaultRegistrationEngine.java`
#### Snippet
```java
     * implementation select the first one.
     */
    protected DmServerInfo selectServer(Map<Long, DmServerInfo> servers) {
        if (servers != null && !servers.isEmpty()) {
            if (servers.size() > 1) {
```

### BoundedWildcard
Can generalize to `? super T`
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/bootstrap/request/DefaultBootstrapDownlinkRequestSender.java`
#### Snippet
```java
    @Override
    public <T extends LwM2mResponse> void send(final BootstrapSession destination, BootstrapDownlinkRequest<T> request,
            long timeoutInMs, final ResponseCallback<T> responseCallback, ErrorCallback errorCallback) {

        // find endpoint to use
```

### BoundedWildcard
Can generalize to `? super T`
in `leshan-core-cf/src/main/java/org/eclipse/leshan/core/californium/AsyncRequestObserver.java`
#### Snippet
```java
     * @param executor used to scheduled timeout tasks.
     */
    public AsyncRequestObserver(Request coapRequest, final ResponseCallback<T> responseCallback,
            final ErrorCallback errorCallback, long timeoutInMs, ScheduledExecutorService executor,
            ExceptionTranslator exceptionTranslator) {
```

### BoundedWildcard
Can generalize to `? super String`
in `leshan-core-cf/src/main/java/org/eclipse/leshan/core/californium/ObserveUtil.java`
#### Snippet
```java
     * @param paths the list of {@link LwM2mPath}
     */
    public static void addPathsIntoContext(Map<String, String> context, List<LwM2mPath> paths) {
        StringBuilder sb = new StringBuilder();
        for (LwM2mPath path : paths) {
```

### BoundedWildcard
Can generalize to `? super String`
in `leshan-core-cf/src/main/java/org/eclipse/leshan/core/californium/ObserveUtil.java`
#### Snippet
```java
     * @param paths the list of {@link LwM2mPath}
     */
    public static void addPathsIntoContext(Map<String, String> context, List<LwM2mPath> paths) {
        StringBuilder sb = new StringBuilder();
        for (LwM2mPath path : paths) {
```

### BoundedWildcard
Can generalize to `? extends LwM2mPath`
in `leshan-core-cf/src/main/java/org/eclipse/leshan/core/californium/ObserveUtil.java`
#### Snippet
```java
     * @param paths the list of {@link LwM2mPath}
     */
    public static void addPathsIntoContext(Map<String, String> context, List<LwM2mPath> paths) {
        StringBuilder sb = new StringBuilder();
        for (LwM2mPath path : paths) {
```

### BoundedWildcard
Can generalize to `? extends LwM2mPath`
in `leshan-server-demo/src/main/java/org/eclipse/leshan/server/demo/servlet/json/JacksonRegistrationSerializer.java`
#### Snippet
```java
    }

    private Map<Integer, Set<Integer>> serializeAvailableInstances(Set<LwM2mPath> instances) {
        SortedMap<Integer, Set<Integer>> result = new TreeMap<>();
        for (LwM2mPath path : instances) {
```

### BoundedWildcard
Can generalize to `? super Configuration`
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/endpoint/AbstractEndpointFactoryBuilder.java`
#### Snippet
```java
    }

    public SELF setConfiguration(Consumer<Configuration> configurationInitializer) {
        // Create Configuration
        List<ModuleDefinitionsProvider> moduleDefinitions = getModuleDefinitionsProviders();
```

### BoundedWildcard
Can generalize to `? super Configuration`
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/endpoint/CaliforniumServerEndpointsProvider.java`
#### Snippet
```java
         * </pre>
         */
        public Builder setConfiguration(Consumer<Configuration> configurationSetter) {
            Configuration cfg = createDefaultConfiguration();
            configurationSetter.accept(cfg);
```

### BoundedWildcard
Can generalize to `? super Configuration`
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/bootstrap/endpoint/CaliforniumBootstrapServerEndpointsProvider.java`
#### Snippet
```java
         * </pre>
         */
        public Builder setConfiguration(Consumer<Configuration> configurationSetter) {
            Configuration cfg = createDefaultConfiguration();
            configurationSetter.accept(cfg);
```

### BoundedWildcard
Can generalize to `? extends T`
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/endpoint/CaliforniumServerEndpoint.java`
#### Snippet
```java

    @Override
    public <T extends LwM2mResponse> void send(ClientProfile destination, DownlinkRequest<T> lwm2mRequest,
            ResponseCallback<T> responseCallback, ErrorCallback errorCallback, LowerLayerConfig lowerLayerConfig,
            long timeoutInMs) {
```

### BoundedWildcard
Can generalize to `? extends T`
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/bootstrap/endpoint/CaliforniumBootstrapServerEndpoint.java`
#### Snippet
```java

    @Override
    public <T extends LwM2mResponse> void send(BootstrapSession destination, BootstrapDownlinkRequest<T> lwm2mRequest,
            ResponseCallback<T> responseCallback, ErrorCallback errorCallback, long timeoutInMs) {
        Validate.notNull(responseCallback);
```

### BoundedWildcard
Can generalize to `? extends T`
in `leshan-client-cf/src/main/java/org/eclipse/leshan/client/californium/endpoint/CaliforniumClientEndpoint.java`
#### Snippet
```java

    @Override
    public <T extends LwM2mResponse> void send(ServerIdentity server, UplinkRequest<T> lwm2mRequest,
            ResponseCallback<T> responseCallback, ErrorCallback errorCallback, long timeoutInMs) {
        Validate.notNull(responseCallback);
```

### BoundedWildcard
Can generalize to `? extends Certificate`
in `leshan-client-cf/src/main/java/org/eclipse/leshan/client/californium/endpoint/coaps/CoapsClientEndpointFactory.java`
#### Snippet
```java
    protected DtlsConnectorConfig.Builder createEffectiveDtlsConnectorConfigBuilder(InetSocketAddress addr,
            ServerInfo serverInfo, DtlsConnectorConfig.Builder rootDtlsConfigBuilder, Configuration coapConfig,
            boolean clientInitiatedOnly, List<Certificate> trustStore) {

        if (serverInfo.isSecure()) {
```

## RuleId[id=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `final static`
in `leshan-core-demo/src/main/java/org/eclipse/leshan/core/demo/LwM2mDemoConstant.java`
#### Snippet
```java

public class LwM2mDemoConstant {
    public final static String[] modelPaths = new String[] { "8.xml", "9.xml", "10-1_0.xml", "10.xml", "11-1_0.xml",
            "11.xml", "12-1_0.xml", "12.xml", "13-1_0.xml", "13.xml", "14.xml", "15-1_0.xml", "15.xml", "16.xml",
            "19.xml", "20.xml", "22-1_0.xml", "22.xml", "25.xml", "28.xml", "500.xml", "501.xml", "502.xml", "503.xml",
```

### MissortedModifiers
Missorted modifiers `final static`
in `leshan-core/src/main/java/org/eclipse/leshan/core/ResponseCode.java`
#### Snippet
```java

    // LwM2m Response codes
    public final static ResponseCode CREATED = new ResponseCode(CREATED_CODE, "CREATED");
    public final static ResponseCode DELETED = new ResponseCode(DELETED_CODE, "DELETED");
    public final static ResponseCode CHANGED = new ResponseCode(CHANGED_CODE, "CHANGED");
```

### MissortedModifiers
Missorted modifiers `final static`
in `leshan-core/src/main/java/org/eclipse/leshan/core/ResponseCode.java`
#### Snippet
```java
    public final static int FORBIDDEN_CODE = 403;
    /** Resource not found */
    public final static int NOT_FOUND_CODE = 404;
    /** None of the preferred Content-Formats can be returned */
    public final static int NOT_ACCEPTABLE_CODE = 406;
```

### MissortedModifiers
Missorted modifiers `final static`
in `leshan-core/src/main/java/org/eclipse/leshan/core/ResponseCode.java`
#### Snippet
```java
    public final static ResponseCode CREATED = new ResponseCode(CREATED_CODE, "CREATED");
    public final static ResponseCode DELETED = new ResponseCode(DELETED_CODE, "DELETED");
    public final static ResponseCode CHANGED = new ResponseCode(CHANGED_CODE, "CHANGED");
    public final static ResponseCode CONTENT = new ResponseCode(CONTENT_CODE, "CONTENT");
    public final static ResponseCode BAD_REQUEST = new ResponseCode(BAD_REQUEST_CODE, "BAD_REQUEST");
```

### MissortedModifiers
Missorted modifiers `final static`
in `leshan-core/src/main/java/org/eclipse/leshan/core/ResponseCode.java`
#### Snippet
```java
    public final static ResponseCode BAD_REQUEST = new ResponseCode(BAD_REQUEST_CODE, "BAD_REQUEST");
    public final static ResponseCode UNAUTHORIZED = new ResponseCode(UNAUTHORIZED_CODE, "UNAUTHORIZED");
    public final static ResponseCode METHOD_NOT_ALLOWED = new ResponseCode(METHOD_NOT_ALLOWED_CODE,
            "METHOD_NOT_ALLOWED");
    public final static ResponseCode FORBIDDEN = new ResponseCode(FORBIDDEN_CODE, "FORBIDDEN");
```

### MissortedModifiers
Missorted modifiers `final static`
in `leshan-core/src/main/java/org/eclipse/leshan/core/ResponseCode.java`
#### Snippet
```java

    /** Resource correctly created */
    public final static int CREATED_CODE = 201;
    /** Resource correctly deleted */
    public final static int DELETED_CODE = 202;
```

### MissortedModifiers
Missorted modifiers `final static`
in `leshan-core/src/main/java/org/eclipse/leshan/core/ResponseCode.java`
#### Snippet
```java
    public final static int CHANGED_CODE = 204;
    /** Content correctly delivered */
    public final static int CONTENT_CODE = 205;
    /** Bad request format (missing parameters, bad encoding ...) */
    public final static int BAD_REQUEST_CODE = 400;
```

### MissortedModifiers
Missorted modifiers `final static`
in `leshan-core/src/main/java/org/eclipse/leshan/core/ResponseCode.java`
#### Snippet
```java

    /** Common name for unknown response code. That means "not explicitly" defined in the LWM2M specification */
    public final static String UNKNOWN = "UNKNOWN";

    /** Resource correctly created */
```

### MissortedModifiers
Missorted modifiers `final static`
in `leshan-core/src/main/java/org/eclipse/leshan/core/ResponseCode.java`
#### Snippet
```java
    public final static int UNSUPPORTED_CONTENT_FORMAT_CODE = 415;
    /** generic response code for unexpected error */
    public final static int INTERNAL_SERVER_ERROR_CODE = 500;

    // LwM2m Response codes
```

### MissortedModifiers
Missorted modifiers `final static`
in `leshan-core/src/main/java/org/eclipse/leshan/core/ResponseCode.java`
#### Snippet
```java
    public final static ResponseCode UNSUPPORTED_CONTENT_FORMAT = new ResponseCode(UNSUPPORTED_CONTENT_FORMAT_CODE,
            "UNSUPPORTED_CONTENT_FORMAT");
    public final static ResponseCode INTERNAL_SERVER_ERROR = new ResponseCode(INTERNAL_SERVER_ERROR_CODE,
            "INTERNAL_SERVER_ERROR");

```

### MissortedModifiers
Missorted modifiers `final static`
in `leshan-core/src/main/java/org/eclipse/leshan/core/ResponseCode.java`
#### Snippet
```java
    public final static ResponseCode REQUEST_ENTITY_INCOMPLETE = new ResponseCode(REQUEST_ENTITY_INCOMPLETE_CODE,
            "REQUEST_ENTITY_INCOMPLETE");
    public final static ResponseCode PRECONDITION_FAILED = new ResponseCode(PRECONDITION_FAILED_CODE,
            "PRECONDITION_FAILED");
    public final static ResponseCode REQUEST_ENTITY_TOO_LARGE = new ResponseCode(REQUEST_ENTITY_TOO_LARGE_CODE,
```

### MissortedModifiers
Missorted modifiers `final static`
in `leshan-core/src/main/java/org/eclipse/leshan/core/ResponseCode.java`
#### Snippet
```java
    public final static int CONTENT_CODE = 205;
    /** Bad request format (missing parameters, bad encoding ...) */
    public final static int BAD_REQUEST_CODE = 400;
    /** Access Right Permission Denied */
    public final static int UNAUTHORIZED_CODE = 401;
```

### MissortedModifiers
Missorted modifiers `final static`
in `leshan-core/src/main/java/org/eclipse/leshan/core/ResponseCode.java`
#### Snippet
```java
    public final static int UNAUTHORIZED_CODE = 401;
    /** This method (GET/PUT/POST/DELETE) is not allowed on this resource */
    public final static int METHOD_NOT_ALLOWED_CODE = 405;
    /** The Endpoint Client Name registration in the LWM2M Server is not allowed */
    public final static int FORBIDDEN_CODE = 403;
```

### MissortedModifiers
Missorted modifiers `final static`
in `leshan-core/src/main/java/org/eclipse/leshan/core/ResponseCode.java`
#### Snippet
```java
    public final static int REQUEST_ENTITY_INCOMPLETE_CODE = 408;
    /** Supported LwM2M Versions of the Server and the Client are not compatible */
    public final static int PRECONDITION_FAILED_CODE = 412;
    /** None of the preferred Content-Formats can be returned */
    public final static int REQUEST_ENTITY_TOO_LARGE_CODE = 413;
```

### MissortedModifiers
Missorted modifiers `final static`
in `leshan-core/src/main/java/org/eclipse/leshan/core/ResponseCode.java`
#### Snippet
```java
    public final static ResponseCode CONTENT = new ResponseCode(CONTENT_CODE, "CONTENT");
    public final static ResponseCode BAD_REQUEST = new ResponseCode(BAD_REQUEST_CODE, "BAD_REQUEST");
    public final static ResponseCode UNAUTHORIZED = new ResponseCode(UNAUTHORIZED_CODE, "UNAUTHORIZED");
    public final static ResponseCode METHOD_NOT_ALLOWED = new ResponseCode(METHOD_NOT_ALLOWED_CODE,
            "METHOD_NOT_ALLOWED");
```

### MissortedModifiers
Missorted modifiers `final static`
in `leshan-core/src/main/java/org/eclipse/leshan/core/ResponseCode.java`
#### Snippet
```java
    public final static ResponseCode DELETED = new ResponseCode(DELETED_CODE, "DELETED");
    public final static ResponseCode CHANGED = new ResponseCode(CHANGED_CODE, "CHANGED");
    public final static ResponseCode CONTENT = new ResponseCode(CONTENT_CODE, "CONTENT");
    public final static ResponseCode BAD_REQUEST = new ResponseCode(BAD_REQUEST_CODE, "BAD_REQUEST");
    public final static ResponseCode UNAUTHORIZED = new ResponseCode(UNAUTHORIZED_CODE, "UNAUTHORIZED");
```

### MissortedModifiers
Missorted modifiers `final static`
in `leshan-core/src/main/java/org/eclipse/leshan/core/ResponseCode.java`
#### Snippet
```java
    public final static int PRECONDITION_FAILED_CODE = 412;
    /** None of the preferred Content-Formats can be returned */
    public final static int REQUEST_ENTITY_TOO_LARGE_CODE = 413;
    /** The specified format is not supported */
    public final static int UNSUPPORTED_CONTENT_FORMAT_CODE = 415;
```

### MissortedModifiers
Missorted modifiers `final static`
in `leshan-core/src/main/java/org/eclipse/leshan/core/ResponseCode.java`
#### Snippet
```java
            "METHOD_NOT_ALLOWED");
    public final static ResponseCode FORBIDDEN = new ResponseCode(FORBIDDEN_CODE, "FORBIDDEN");
    public final static ResponseCode NOT_FOUND = new ResponseCode(NOT_FOUND_CODE, "NOT_FOUND");
    public final static ResponseCode NOT_ACCEPTABLE = new ResponseCode(NOT_ACCEPTABLE_CODE, "NOT_ACCEPTABLE");
    public final static ResponseCode REQUEST_ENTITY_INCOMPLETE = new ResponseCode(REQUEST_ENTITY_INCOMPLETE_CODE,
```

### MissortedModifiers
Missorted modifiers `final static`
in `leshan-core/src/main/java/org/eclipse/leshan/core/ResponseCode.java`
#### Snippet
```java
    public final static int BAD_REQUEST_CODE = 400;
    /** Access Right Permission Denied */
    public final static int UNAUTHORIZED_CODE = 401;
    /** This method (GET/PUT/POST/DELETE) is not allowed on this resource */
    public final static int METHOD_NOT_ALLOWED_CODE = 405;
```

### MissortedModifiers
Missorted modifiers `final static`
in `leshan-core/src/main/java/org/eclipse/leshan/core/ResponseCode.java`
#### Snippet
```java
    public final static int NOT_FOUND_CODE = 404;
    /** None of the preferred Content-Formats can be returned */
    public final static int NOT_ACCEPTABLE_CODE = 406;
    /** None of the preferred Content-Formats can be returned */
    public final static int REQUEST_ENTITY_INCOMPLETE_CODE = 408;
```

### MissortedModifiers
Missorted modifiers `final static`
in `leshan-core/src/main/java/org/eclipse/leshan/core/ResponseCode.java`
#### Snippet
```java
    public final static ResponseCode NOT_FOUND = new ResponseCode(NOT_FOUND_CODE, "NOT_FOUND");
    public final static ResponseCode NOT_ACCEPTABLE = new ResponseCode(NOT_ACCEPTABLE_CODE, "NOT_ACCEPTABLE");
    public final static ResponseCode REQUEST_ENTITY_INCOMPLETE = new ResponseCode(REQUEST_ENTITY_INCOMPLETE_CODE,
            "REQUEST_ENTITY_INCOMPLETE");
    public final static ResponseCode PRECONDITION_FAILED = new ResponseCode(PRECONDITION_FAILED_CODE,
```

### MissortedModifiers
Missorted modifiers `final static`
in `leshan-core/src/main/java/org/eclipse/leshan/core/ResponseCode.java`
#### Snippet
```java
    public final static int DELETED_CODE = 202;
    /** Resource correctly changed */
    public final static int CHANGED_CODE = 204;
    /** Content correctly delivered */
    public final static int CONTENT_CODE = 205;
```

### MissortedModifiers
Missorted modifiers `final static`
in `leshan-core/src/main/java/org/eclipse/leshan/core/ResponseCode.java`
#### Snippet
```java
    public final static ResponseCode REQUEST_ENTITY_TOO_LARGE = new ResponseCode(REQUEST_ENTITY_TOO_LARGE_CODE,
            "REQUEST_ENTITY_TOO_LARGE");
    public final static ResponseCode UNSUPPORTED_CONTENT_FORMAT = new ResponseCode(UNSUPPORTED_CONTENT_FORMAT_CODE,
            "UNSUPPORTED_CONTENT_FORMAT");
    public final static ResponseCode INTERNAL_SERVER_ERROR = new ResponseCode(INTERNAL_SERVER_ERROR_CODE,
```

### MissortedModifiers
Missorted modifiers `final static`
in `leshan-core/src/main/java/org/eclipse/leshan/core/ResponseCode.java`
#### Snippet
```java
    public final static ResponseCode CHANGED = new ResponseCode(CHANGED_CODE, "CHANGED");
    public final static ResponseCode CONTENT = new ResponseCode(CONTENT_CODE, "CONTENT");
    public final static ResponseCode BAD_REQUEST = new ResponseCode(BAD_REQUEST_CODE, "BAD_REQUEST");
    public final static ResponseCode UNAUTHORIZED = new ResponseCode(UNAUTHORIZED_CODE, "UNAUTHORIZED");
    public final static ResponseCode METHOD_NOT_ALLOWED = new ResponseCode(METHOD_NOT_ALLOWED_CODE,
```

### MissortedModifiers
Missorted modifiers `final static`
in `leshan-core/src/main/java/org/eclipse/leshan/core/ResponseCode.java`
#### Snippet
```java
    public final static ResponseCode PRECONDITION_FAILED = new ResponseCode(PRECONDITION_FAILED_CODE,
            "PRECONDITION_FAILED");
    public final static ResponseCode REQUEST_ENTITY_TOO_LARGE = new ResponseCode(REQUEST_ENTITY_TOO_LARGE_CODE,
            "REQUEST_ENTITY_TOO_LARGE");
    public final static ResponseCode UNSUPPORTED_CONTENT_FORMAT = new ResponseCode(UNSUPPORTED_CONTENT_FORMAT_CODE,
```

### MissortedModifiers
Missorted modifiers `final static`
in `leshan-core/src/main/java/org/eclipse/leshan/core/ResponseCode.java`
#### Snippet
```java
    public final static ResponseCode METHOD_NOT_ALLOWED = new ResponseCode(METHOD_NOT_ALLOWED_CODE,
            "METHOD_NOT_ALLOWED");
    public final static ResponseCode FORBIDDEN = new ResponseCode(FORBIDDEN_CODE, "FORBIDDEN");
    public final static ResponseCode NOT_FOUND = new ResponseCode(NOT_FOUND_CODE, "NOT_FOUND");
    public final static ResponseCode NOT_ACCEPTABLE = new ResponseCode(NOT_ACCEPTABLE_CODE, "NOT_ACCEPTABLE");
```

### MissortedModifiers
Missorted modifiers `final static`
in `leshan-core/src/main/java/org/eclipse/leshan/core/ResponseCode.java`
#### Snippet
```java
    public final static int CREATED_CODE = 201;
    /** Resource correctly deleted */
    public final static int DELETED_CODE = 202;
    /** Resource correctly changed */
    public final static int CHANGED_CODE = 204;
```

### MissortedModifiers
Missorted modifiers `final static`
in `leshan-core/src/main/java/org/eclipse/leshan/core/ResponseCode.java`
#### Snippet
```java
    public final static int METHOD_NOT_ALLOWED_CODE = 405;
    /** The Endpoint Client Name registration in the LWM2M Server is not allowed */
    public final static int FORBIDDEN_CODE = 403;
    /** Resource not found */
    public final static int NOT_FOUND_CODE = 404;
```

### MissortedModifiers
Missorted modifiers `final static`
in `leshan-core/src/main/java/org/eclipse/leshan/core/ResponseCode.java`
#### Snippet
```java
    public final static int NOT_ACCEPTABLE_CODE = 406;
    /** None of the preferred Content-Formats can be returned */
    public final static int REQUEST_ENTITY_INCOMPLETE_CODE = 408;
    /** Supported LwM2M Versions of the Server and the Client are not compatible */
    public final static int PRECONDITION_FAILED_CODE = 412;
```

### MissortedModifiers
Missorted modifiers `final static`
in `leshan-core/src/main/java/org/eclipse/leshan/core/ResponseCode.java`
#### Snippet
```java
    public final static ResponseCode FORBIDDEN = new ResponseCode(FORBIDDEN_CODE, "FORBIDDEN");
    public final static ResponseCode NOT_FOUND = new ResponseCode(NOT_FOUND_CODE, "NOT_FOUND");
    public final static ResponseCode NOT_ACCEPTABLE = new ResponseCode(NOT_ACCEPTABLE_CODE, "NOT_ACCEPTABLE");
    public final static ResponseCode REQUEST_ENTITY_INCOMPLETE = new ResponseCode(REQUEST_ENTITY_INCOMPLETE_CODE,
            "REQUEST_ENTITY_INCOMPLETE");
```

### MissortedModifiers
Missorted modifiers `final static`
in `leshan-core/src/main/java/org/eclipse/leshan/core/ResponseCode.java`
#### Snippet
```java
    public final static int REQUEST_ENTITY_TOO_LARGE_CODE = 413;
    /** The specified format is not supported */
    public final static int UNSUPPORTED_CONTENT_FORMAT_CODE = 415;
    /** generic response code for unexpected error */
    public final static int INTERNAL_SERVER_ERROR_CODE = 500;
```

### MissortedModifiers
Missorted modifiers `final static`
in `leshan-core/src/main/java/org/eclipse/leshan/core/ResponseCode.java`
#### Snippet
```java
    // LwM2m Response codes
    public final static ResponseCode CREATED = new ResponseCode(CREATED_CODE, "CREATED");
    public final static ResponseCode DELETED = new ResponseCode(DELETED_CODE, "DELETED");
    public final static ResponseCode CHANGED = new ResponseCode(CHANGED_CODE, "CHANGED");
    public final static ResponseCode CONTENT = new ResponseCode(CONTENT_CODE, "CONTENT");
```

### MissortedModifiers
Missorted modifiers `final static`
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/ObjectLink.java`
#### Snippet
```java
 */
public class ObjectLink {
    public final static int MAXID = 65535;

    private final int objectId;
```

### MissortedModifiers
Missorted modifiers `final static`
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/LwM2mPath.java`
#### Snippet
```java
    private final Integer resourceInstanceId;

    public final static LwM2mPath ROOTPATH = new LwM2mPath();

    private LwM2mPath() {
```

### MissortedModifiers
Missorted modifiers `static public`
in `leshan-core/src/main/java/org/eclipse/leshan/core/util/datatype/LwM2mValueUtil.java`
#### Snippet
```java
public class LwM2mValueUtil {

    static public String toPrettyString(ResourceModel.Type type, Object value) {
        switch (type) {
        case OPAQUE:
```

### MissortedModifiers
Missorted modifiers `final static`
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/send/ManualDataSender.java`
#### Snippet
```java
public class ManualDataSender implements DataSender {

    public final static String DEFAULT_NAME = "MANUAL_SENDER";

    private TimestampedLwM2mNodes.Builder builder = new TimestampedLwM2mNodes.Builder();
```

### MissortedModifiers
Missorted modifiers `final static`
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/object/Server.java`
#### Snippet
```java
    private static final Logger LOG = LoggerFactory.getLogger(Server.class);

    private final static List<Integer> supportedResources = Arrays.asList(0, 1, 2, 3, 6, 7, 8, 22);

    private int shortServerId;
```

### MissortedModifiers
Missorted modifiers `final static`
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/object/Oscore.java`
#### Snippet
```java
    private static final Logger LOG = LoggerFactory.getLogger(Security.class);

    private final static List<Integer> supportedResources = Arrays.asList(OSCORE_MASTER_SECRET, OSCORE_SENDER_ID,
            OSCORE_RECIPIENT_ID, OSCORE_AEAD_ALGORITHM, OSCORE_HMAC_ALGORITHM, OSCORE_MASTER_SALT);

```

### MissortedModifiers
Missorted modifiers `final static`
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/object/Security.java`
#### Snippet
```java
    private static final Logger LOG = LoggerFactory.getLogger(Security.class);

    private final static List<Integer> supportedResources = Arrays.asList(SEC_SERVER_URI, SEC_BOOTSTRAP,
            SEC_SECURITY_MODE, SEC_PUBKEY_IDENTITY, SEC_SERVER_PUBKEY, SEC_SECRET_KEY, SEC_SERVER_ID,
            SEC_CERTIFICATE_USAGE, SEC_OSCORE_SECURITY_MODE);
```

### MissortedModifiers
Missorted modifiers `final static`
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/servers/ServerIdentity.java`
#### Snippet
```java
     * Identity for system calls.
     */
    public final static ServerIdentity SYSTEM = new ServerIdentity(
            Identity.unsecure(InetSocketAddress.createUnresolved(Role.SYSTEM.toString(), 1)), null, Role.SYSTEM, null);

```

### MissortedModifiers
Missorted modifiers `final static`
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/bootstrap/LeshanBootstrapServer.java`
#### Snippet
```java
public class LeshanBootstrapServer {

    private final static Logger LOG = LoggerFactory.getLogger(LeshanBootstrapServer.class);

    private final BootstrapSessionDispatcher dispatcher = new BootstrapSessionDispatcher();
```

## RuleId[id=AnonymousHasLambdaAlternative]
### AnonymousHasLambdaAlternative
Anonymous new Thread() can be replaced with new Thread(() -\> {...})
in `leshan-client-demo/src/main/java/org/eclipse/leshan/client/demo/LeshanClientDemo.java`
#### Snippet
```java

            // De-register on shutdown and stop client.
            Runtime.getRuntime().addShutdownHook(new Thread() {
                @Override
                public void run() {
```

## RuleId[id=IgnoreResultOfCall]
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

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `execute()` only delegates to its super method
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/object/Security.java`
#### Snippet
```java

    @Override
    public ExecuteResponse execute(ServerIdentity identity, int resourceid, Arguments arguments) {
        return super.execute(identity, resourceid, arguments);
    }
```

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

### RedundantMethodOverride
Method `createConnectionController()` is identical to its super method
in `leshan-client-cf/src/main/java/org/eclipse/leshan/client/californium/endpoint/coap/CoapOscoreClientEndpointFactory.java`
#### Snippet
```java

    @Override
    public CaliforniumConnectionController createConnectionController() {
        return new CaliforniumConnectionController() {
            @Override
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

### DefaultAnnotationParam
Redundant default parameter value assignment
in `leshan-server-demo/src/main/java/org/eclipse/leshan/server/demo/cli/LeshanServerDemoCLI.java`
#### Snippet
```java

    /* ********************************** Identity Section ******************************** */
    @ArgGroup(exclusive = true)
    public IdentitySection identity = new IdentitySection();

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

## RuleId[id=UnnecessarySuperQualifier]
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/lwm2m/attributes/LwM2mAttributeSet.java`
#### Snippet
```java

    public boolean contains(LwM2mAttributeModel<?> model) {
        return super.contains(model.getName());
    }
}
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `leshan-core-cf/src/main/java/org/eclipse/leshan/core/californium/oscore/cf/InMemoryOscoreContextDB.java`
#### Snippet
```java
                osCoreCtx = deriveContext(params);
                // add new new context in local DB
                super.addContext(osCoreCtx);
            }
        }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `leshan-core-cf/src/main/java/org/eclipse/leshan/core/californium/oscore/cf/InMemoryOscoreContextDB.java`
#### Snippet
```java
                osCoreCtx = deriveContext(params);
                // add new new context in local DB
                super.addContext(osCoreCtx);
            }
        }
```

## RuleId[id=ReplaceAssignmentWithOperatorAssignment]
### ReplaceAssignmentWithOperatorAssignment
`f = f | toDigit(data[j], j)` could be simplified to 'f \|= toDigit(data\[j\], j)'
in `leshan-core/src/main/java/org/eclipse/leshan/core/util/Hex.java`
#### Snippet
```java
            int f = toDigit(data[j], j) << 4;
            j++;
            f = f | toDigit(data[j], j);
            j++;
            out[i] = (byte) (f & 0xFF);
```

### ReplaceAssignmentWithOperatorAssignment
`i = i + 2` could be simplified to 'i += 2'
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/resource/SimpleInstanceEnabler.java`
#### Snippet
```java
        if (initialValues.length > 0) {
            this.initialValues = new HashMap<>(initialValues.length / 2);
            for (int i = 0; i < initialValues.length; i = i + 2) {
                this.initialValues.put((Integer) initialValues[i], initialValues[i + 1]);
            }
```

### ReplaceAssignmentWithOperatorAssignment
`latitude = latitude + delta * scaleFactor` could be simplified to 'latitude += delta \* scaleFactor'
in `leshan-client-demo/src/main/java/org/eclipse/leshan/client/demo/MyLocation.java`
#### Snippet
```java

    private void moveLatitude(float delta) {
        latitude = latitude + delta * scaleFactor;
        timestamp = new Date();
        fireResourcesChange(getResourcePath(0), getResourcePath(5));
```

### ReplaceAssignmentWithOperatorAssignment
`longitude = longitude + delta * scaleFactor` could be simplified to 'longitude += delta \* scaleFactor'
in `leshan-client-demo/src/main/java/org/eclipse/leshan/client/demo/MyLocation.java`
#### Snippet
```java

    private void moveLongitude(float delta) {
        longitude = longitude + delta * scaleFactor;
        timestamp = new Date();
        fireResourcesChange(getResourcePath(1), getResourcePath(5));
```

### ReplaceAssignmentWithOperatorAssignment
`rootPath = rootPath + "/"` could be simplified to 'rootPath += "/"'
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/registration/Registration.java`
#### Snippet
```java
                    rootPath = root.getUriReference();
                    if (!rootPath.endsWith("/")) {
                        rootPath = rootPath + "/";
                    }
                } else {
```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `leshan-core-demo/src/main/java/org/eclipse/leshan/core/demo/cli/interactive/InteractiveCLI.java`
#### Snippet
```java
        // start the shell and process input until the user quits with Ctl-D
        String line;
        while ((line = console.readLine()) != null) {
            ArgumentList list = new WhitespaceArgumentDelimiter().delimit(line, line.length());
            commandLine.execute(list.getArguments());
```

### NestedAssignment
Result of assignment expression used
in `leshan-core/src/main/java/org/eclipse/leshan/core/credentials/CredentialsReader.java`
#### Snippet
```java
            int nRead;
            byte[] data = new byte[1024];
            while ((nRead = in.read(data, 0, data.length)) != -1) {
                buffer.write(data, 0, nRead);
            }
```

### NestedAssignment
Result of assignment expression used
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/observation/EndpointContextSerDes.java`
#### Snippet
```java
        if (value != null) {
            principal = new PreSharedKeyIdentity(value.asText());
        } else if ((value = peer.get(KEY_RPK)) != null) {
            try {
                byte[] rpk = Hex.decodeHex(value.asText().toCharArray());
```

### NestedAssignment
Result of assignment expression used
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/observation/EndpointContextSerDes.java`
#### Snippet
```java
                throw new IllegalStateException("Invalid security info content", e);
            }
        } else if ((value = peer.get(KEY_DN)) != null) {
            principal = new X500Principal(value.asText());
        }
```

## RuleId[id=CodeBlock2Expr]
### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/send/ManualDataSender.java`
#### Snippet
```java
                restoreData(data);
            }
        }, error -> {
            restoreData(data);
        }, timeoutInMs);
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `leshan-client-demo/src/main/java/org/eclipse/leshan/client/demo/cli/interactive/InteractiveCommands.java`
#### Snippet
```java
            } else {
                // print all objects
                objectTree.getObjectEnablers().forEach((objectId, objectEnabler) -> {
                    printObject(objectEnabler);
                });
```

## RuleId[id=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `dataSenderManager` is accessed in both synchronized and unsynchronized contexts
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/send/ManualDataSender.java`
#### Snippet
```java

    private TimestampedLwM2mNodes.Builder builder = new TimestampedLwM2mNodes.Builder();
    private DataSenderManager dataSenderManager;
    private final String name;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `instances` is accessed in both synchronized and unsynchronized contexts
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/resource/ObjectEnabler.java`
#### Snippet
```java
    private static Logger LOG = LoggerFactory.getLogger(DummyInstanceEnabler.class);

    protected Map<Integer, LwM2mInstanceEnabler> instances;
    protected LwM2mInstanceEnablerFactory instanceFactory;
    protected ContentFormat defaultContentFormat;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `bootstrappingLatch` is accessed in both synchronized and unsynchronized contexts
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/bootstrap/BootstrapHandler.java`
#### Snippet
```java

    private boolean bootstrapping = false;
    private CountDownLatch bootstrappingLatch = new CountDownLatch(1);
    // last session state (null means no error)
    private volatile List<String> lastConsistencyError = null;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `updateFuture` is accessed in both synchronized and unsynchronized contexts
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/engine/DefaultRegistrationEngine.java`
#### Snippet
```java
    private Future<?> bootstrapFuture;
    private Future<?> registerFuture;
    private Future<?> updateFuture;
    private final Object taskLock = new Object(); // a lock to avoid several task to be executed at the same time
    private final ScheduledExecutorService schedExecutor;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `registerFuture` is accessed in both synchronized and unsynchronized contexts
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/engine/DefaultRegistrationEngine.java`
#### Snippet
```java
    private boolean started = false;
    private Future<?> bootstrapFuture;
    private Future<?> registerFuture;
    private Future<?> updateFuture;
    private final Object taskLock = new Object(); // a lock to avoid several task to be executed at the same time
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `bootstrapFuture` is accessed in both synchronized and unsynchronized contexts
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/engine/DefaultRegistrationEngine.java`
#### Snippet
```java
    // tasks stuff
    private boolean started = false;
    private Future<?> bootstrapFuture;
    private Future<?> registerFuture;
    private Future<?> updateFuture;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `currentTemp` is accessed in both synchronized and unsynchronized contexts
in `leshan-client-demo/src/main/java/org/eclipse/leshan/client/demo/RandomTemperatureSensor.java`
#### Snippet
```java
    private final ScheduledExecutorService scheduler;
    private final Random rng = new Random();
    private double currentTemp = 20d;
    private double minMeasuredValue = currentTemp;
    private double maxMeasuredValue = currentTemp;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `coapServer` is accessed in both synchronized and unsynchronized contexts
in `leshan-client-cf/src/main/java/org/eclipse/leshan/client/californium/endpoint/CaliforniumClientEndpointsProvider.java`
#### Snippet
```java
    private ServerIdentity currentServer;
    private CaliforniumClientEndpoint endpoint;
    private CoapServer coapServer;

    public CaliforniumClientEndpointsProvider() {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `started` is accessed in both synchronized and unsynchronized contexts
in `leshan-client-cf/src/main/java/org/eclipse/leshan/client/californium/endpoint/CaliforniumClientEndpointsProvider.java`
#### Snippet
```java
            new NamedThreadFactory("Leshan Async Request timeout"));

    protected boolean started = false;

    private final Configuration serverConfig;
```

## RuleId[id=EmptyMethod]
### EmptyMethod
All implementations of this method are empty
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/request/DownlinkRequestReceiver.java`
#### Snippet
```java
    <T extends LwM2mResponse> SendableResponse<T> requestReceived(ServerIdentity identity, DownlinkRequest<T> request);

    void onError(ServerIdentity identity, Exception e,
            Class<? extends LwM2mRequest<? extends LwM2mResponse>> requestType);
}
```

### EmptyMethod
All implementations of this method are empty
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/bootstrap/request/BootstrapUplinkRequestReceiver.java`
#### Snippet
```java
            URI serverEndpointUri);

    void onError(Identity senderIdentity, Exception exception,
            Class<? extends UplinkRequest<? extends LwM2mResponse>> requestType, URI serverEndpointUri);
}
```

### EmptyMethod
All implementations of this method are empty
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/observation/ObservationListener.java`
#### Snippet
```java
     * @param registration the related registration
     */
    void newObservation(Observation observation, Registration registration);

    /**
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `0` is redundant
in `leshan-core-demo/src/main/java/org/eclipse/leshan/core/demo/cli/StandardHelpOptions.java`
#### Snippet
```java
    private boolean versionRequested;

    private int verboseLevel = 0;

    @Option(names = { "-v", "--verbose" },
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `leshan-core/src/main/java/org/eclipse/leshan/core/json/JsonRootObject.java`
#### Snippet
```java
public class JsonRootObject {

    private String baseName = null;

    private List<JsonArrayEntry> jsonArray;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/codec/cbor/LwM2mNodeCborEncoder.java`
#### Snippet
```java

        // visitor output
        private byte[] encoded = null;

        @Override
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/codec/text/LwM2mNodeTextEncoder.java`
#### Snippet
```java

        // visitor output
        private byte[] encoded = null;

        @Override
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/codec/json/LwM2mNodeJsonEncoder.java`
#### Snippet
```java

        // visitor output
        private ArrayList<JsonArrayEntry> resourceList = null;
        private String baseName = null;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/codec/json/LwM2mNodeJsonEncoder.java`
#### Snippet
```java
        // visitor output
        private ArrayList<JsonArrayEntry> resourceList = null;
        private String baseName = null;

        @Override
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/codec/opaque/LwM2mNodeOpaqueEncoder.java`
#### Snippet
```java
        LwM2mValueConverter converter;

        byte[] encoded = null;

        @Override
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `leshan-core/src/main/java/org/eclipse/leshan/core/request/DeregisterRequest.java`
#### Snippet
```java
        implements UplinkRequest<DeregisterResponse> {

    private String registrationId = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `leshan-core/src/main/java/org/eclipse/leshan/senml/SenMLResolver.java`
#### Snippet
```java
    private BigDecimal currentTimestampInSeconds = TimestampUtil.fromInstant(Instant.now());
    private String currentBasename = null;
    private BigDecimal currentBasetime = null;

    public T resolve(SenMLRecord record) throws SenMLException {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `leshan-core/src/main/java/org/eclipse/leshan/senml/SenMLResolver.java`
#### Snippet
```java

    private BigDecimal currentTimestampInSeconds = TimestampUtil.fromInstant(Instant.now());
    private String currentBasename = null;
    private BigDecimal currentBasetime = null;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `leshan-core/src/main/java/org/eclipse/leshan/senml/SenMLRecord.java`
#### Snippet
```java
    }

    private String baseName = null;
    private BigDecimal baseTime;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/servers/ServerInfo.java`
#### Snippet
```java

    public long serverId;
    public boolean bootstrap = false;
    public URI serverUri;
    public SecurityMode secureMode;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/engine/DefaultRegistrationEngineFactory.java`
#### Snippet
```java
    private boolean reconnectOnUpdate = false;
    private boolean resumeOnConnect = true;
    private boolean queueMode = false;
    private ContentFormat preferredContentFormat = ContentFormat.SENML_CBOR;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/engine/DefaultRegistrationEngineFactory.java`
#### Snippet
```java
    private int bootstrapSessionTimeoutInSec = 93;
    private int retryWaitingTimeInMs = 10 * 60 * 1000; // 10min in ms
    private Integer communicationPeriodInMs = null;
    private boolean reconnectOnUpdate = false;
    private boolean resumeOnConnect = true;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/engine/DefaultRegistrationEngineFactory.java`
#### Snippet
```java
    private int retryWaitingTimeInMs = 10 * 60 * 1000; // 10min in ms
    private Integer communicationPeriodInMs = null;
    private boolean reconnectOnUpdate = false;
    private boolean resumeOnConnect = true;
    private boolean queueMode = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/endpoint/DefaultEndpointsManager.java`
#### Snippet
```java

    // state
    protected boolean started = false;

    public DefaultEndpointsManager(LwM2mClientEndpointsProvider endpointProvider, ClientEndpointToolbox toolbox,
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/resource/BaseInstanceEnabler.java`
#### Snippet
```java

    protected List<ResourceListener> listeners = new ArrayList<>();
    protected Integer id = null;
    protected ObjectModel model;
    protected LwM2mClient lwm2mClient;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/resource/TransactionalObjectListener.java`
#### Snippet
```java
    private static Logger LOG = LoggerFactory.getLogger(TransactionalObjectListener.class);

    protected int currentLevel = 0;
    protected List<Integer> instancesAdded = new ArrayList<>();
    protected List<Integer> instancesRemoved = new ArrayList<>();
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/LeshanServerBuilder.java`
#### Snippet
```java
    private Certificate[] trustedCertificates;

    private boolean noQueueMode = false;
    private boolean updateRegistrationOnNotification;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/bootstrap/BootstrapHandler.java`
#### Snippet
```java
    private CountDownLatch bootstrappingLatch = new CountDownLatch(1);
    // last session state (null means no error)
    private volatile List<String> lastConsistencyError = null;

    private final Map<Integer, LwM2mObjectEnabler> objects;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/bootstrap/BootstrapHandler.java`
#### Snippet
```java
public class BootstrapHandler {

    private boolean bootstrapping = false;
    private CountDownLatch bootstrappingLatch = new CountDownLatch(1);
    // last session state (null means no error)
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/servers/ServersInfoExtractor.java`
#### Snippet
```java
public class ServersInfoExtractor {
    private static final Logger LOG = LoggerFactory.getLogger(ServersInfoExtractor.class);
    private static LwM2mObject oscores = null;

    public static ServersInfo getInfo(Map<Integer, LwM2mObjectEnabler> objectEnablers) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/bootstrap/BootstrapConfig.java`
#### Snippet
```java
         * Since Security v1.1
         */
        public CertificateUsage certificateUsage = null;

        /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/bootstrap/BootstrapConfig.java`
#### Snippet
```java
         * Since Server v1.1
         */
        public BindingMode preferredTransport = null;
        /**
         * If true or the Resource is not present, the LwM2M Client Send command capability is de-activated. If false,
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/bootstrap/BootstrapConfig.java`
#### Snippet
```java
         * OSCORE.
         */
        public Integer oscoreHmacAlgorithm = null;
        /**
         * This resource MUST be used to store a non-secret random value called the Master Salt. The Master Salt is used
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/bootstrap/BootstrapConfig.java`
#### Snippet
```java
         * Since Server v1.1
         */
        public Integer apnLink = null;

        /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/bootstrap/BootstrapConfig.java`
#### Snippet
```java
         * This resource MUST store an OSCORE identifier for the LwM2M Client called the Recipient ID.
         */
        public byte[] oscoreRecipientId = null;
        /**
         * This resource MUST be used to store the encoding of the AEAD Algorithm as defined in Table 10 of RFC 8152.
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/bootstrap/BootstrapConfig.java`
#### Snippet
```java
         * Since Server v1.1
         */
        public Boolean muteSend = null;

        @Override
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/bootstrap/BootstrapConfig.java`
#### Snippet
```java
     * more details .
     */
    public boolean autoIdForSecurityObject = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/bootstrap/BootstrapConfig.java`
#### Snippet
```java
         * (false).
         */
        public boolean bootstrapServer = false;
        /**
         * Determines which UDP payload security mode is used
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/bootstrap/BootstrapConfig.java`
#### Snippet
```java
         * to derive the security context used by OSCORE.
         */
        public byte[] oscoreMasterSalt = null;

        // TODO OSCORE : not yet implemented
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/bootstrap/BootstrapConfig.java`
#### Snippet
```java
         * Since Security v1.1
         */
        public List<CipherSuiteId> cipherSuite = null;

        @Override
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/bootstrap/BootstrapConfig.java`
#### Snippet
```java
         * Since Server v1.1
         */
        public Boolean trigger = null;

        /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/bootstrap/BootstrapConfig.java`
#### Snippet
```java
     * if <code>null</code> content format used is the preferred one by the client (pct attribute from BootstrapRequest)
     */
    public ContentFormat contentFormat = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/bootstrap/BootstrapConfig.java`
#### Snippet
```java
         * parameter being included in an Observation.
         */
        public Integer defaultMaxPeriod = null;
        /**
         * If this Resource is executed, this LwM2M Server Object is disabled for a certain period defined in the
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/bootstrap/BootstrapConfig.java`
#### Snippet
```java
         * This resource MUST store an OSCORE identifier for the LwM2M Client called the Sender ID.
         */
        public byte[] oscoreSenderId = null;
        /**
         * This resource MUST store an OSCORE identifier for the LwM2M Client called the Recipient ID.
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/bootstrap/BootstrapConfig.java`
#### Snippet
```java
         * MUST NOT send any message to the Server and ignore all the messages from the LwM2M Server for the period.
         */
        public Integer disableTimeout = null;
        /**
         * If true, the LwM2M Client stores “Notify” operations to the LwM2M Server while the LwM2M Server account is
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/bootstrap/BootstrapConfig.java`
#### Snippet
```java
         * The AEAD is used by OSCORE for encryption and integrity protection of CoAP message fields.
         */
        public Integer oscoreAeadAlgorithm = null;
        /**
         * This resource MUST be used to store the encoding of the HMAC Algorithm used in the HKDF. The encoding of HMAC
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/bootstrap/BootstrapConfig.java`
#### Snippet
```java
         * Server/Bootstrap-Server, called the Master Secret.
         */
        public byte[] oscoreMasterSecret = null;
        /**
         * This resource MUST store an OSCORE identifier for the LwM2M Client called the Sender ID.
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/bootstrap/BootstrapConfig.java`
#### Snippet
```java
         * Since Security v1.1
         */
        public MatchingType matchingType = null;

        /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/bootstrap/BootstrapConfig.java`
#### Snippet
```java
         * Since Security v1.1
         */
        public String sni = null;

        /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/engine/DefaultRegistrationEngine.java`
#### Snippet
```java

    // tasks stuff
    private boolean started = false;
    private Future<?> bootstrapFuture;
    private Future<?> registerFuture;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `leshan-client-demo/src/main/java/org/eclipse/leshan/client/demo/DtlsSessionLogger.java`
#### Snippet
```java
    private static final Logger LOG = LoggerFactory.getLogger(DtlsSessionLogger.class);

    private SessionId sessionIdentifier = null;

    @Override
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/registration/InMemoryRegistrationStore.java`
#### Snippet
```java
    private final ScheduledExecutorService schedExecutor;
    private ScheduledFuture<?> cleanerTask;
    private boolean started = false;
    private final long cleanPeriod; // in seconds

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/bootstrap/DefaultBootstrapSession.java`
#### Snippet
```java
    private volatile List<BootstrapDownlinkRequest<? extends LwM2mResponse>> requests;
    private volatile List<LwM2mResponse> responses;
    private volatile boolean moreTasks = false;
    private volatile boolean cancelled = false;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/bootstrap/DefaultBootstrapSession.java`
#### Snippet
```java
    private volatile List<LwM2mResponse> responses;
    private volatile boolean moreTasks = false;
    private volatile boolean cancelled = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `leshan-core-cf/src/main/java/org/eclipse/leshan/core/californium/CoapAsyncRequestObserver.java`
#### Snippet
```java
    private final long timeoutInMs;
    private ScheduledFuture<?> cleaningTask;
    private boolean cancelled = false;
    private final ScheduledExecutorService executor;
    private final ExceptionTranslator exceptionTranslator;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `leshan-client-cf/src/main/java/org/eclipse/leshan/client/californium/endpoint/CaliforniumClientEndpointsProvider.java`
#### Snippet
```java
            new NamedThreadFactory("Leshan Async Request timeout"));

    protected boolean started = false;

    private final Configuration serverConfig;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `leshan-server-redis/src/main/java/org/eclipse/leshan/server/redis/RedisRegistrationStore.java`
#### Snippet
```java
    private final ScheduledExecutorService schedExecutor;
    private ScheduledFuture<?> cleanerTask;
    private boolean started = false;

    private final long cleanPeriod; // in seconds
```

## RuleId[id=SynchronizeOnThis]
### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/send/ManualDataSender.java`
#### Snippet
```java
        Instant currentTimestamp = Instant.now();
        Map<LwM2mPath, LwM2mNode> currentValues = dataSenderManager.getCurrentValues(ServerIdentity.SYSTEM, paths);
        synchronized (this) {
            builder.addNodes(currentTimestamp, currentValues);
        }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/send/ManualDataSender.java`
#### Snippet
```java
            throws NoDataException {
        TimestampedLwM2mNodes data;
        synchronized (this) {
            data = builder.build();
            if (data.isEmpty()) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/engine/DefaultRegistrationEngine.java`
#### Snippet
```java
    @Override
    public boolean triggerClientInitiatedBootstrap(final boolean deregister) {
        synchronized (this) {
            if (started) {

```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/engine/DefaultRegistrationEngine.java`
#### Snippet
```java
    public void destroy(boolean deregister) {
        boolean wasStarted = false;
        synchronized (this) {
            wasStarted = started;
            started = false;
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/engine/DefaultRegistrationEngine.java`
#### Snippet
```java
            return;

        synchronized (this) {
            if (started) {
                LOG.info("Triggering registration update...");
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/engine/DefaultRegistrationEngine.java`
#### Snippet
```java
    @Override
    public void triggerRegistrationUpdate(RegistrationUpdate registrationUpdate) {
        synchronized (this) {
            if (started) {
                LOG.info("Triggering registration update...");
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/engine/DefaultRegistrationEngine.java`
#### Snippet
```java
    public void start() {
        stop(false); // Stop without de-register
        synchronized (this) {
            started = true;
            // Try factory bootstrap
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/engine/DefaultRegistrationEngine.java`
#### Snippet
```java
    @Override
    public void stop(boolean deregister) {
        synchronized (this) {
            if (!started)
                return;
```

## RuleId[id=RedundantStringFormatCall]
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

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `leshan-core/src/main/java/org/eclipse/leshan/core/tlv/TlvDecoder.java`
#### Snippet
```java
            }

            return tlvs.toArray(new Tlv[] {});
        } catch (TlvException ex) {
            String printHexBinary = Hex.encodeHexString(input.array());
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/DefaultLinkParser.java`
#### Snippet
```java
        // manage null/empty case
        if (bytes == null || bytes.length == 0) {
            return new Link[] {};
        }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/codec/tlv/LwM2mNodeTlvDecoder.java`
#### Snippet
```java
            throws CodecException {
        try {
            Tlv[] tlvs = TlvDecoder.decode(ByteBuffer.wrap(content != null ? content : new byte[0]));
            return parseTlv(tlvs, path, model, nodeClass);
        } catch (TlvException | LwM2mNodeException | InvalidLwM2mPathException e) {
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/codec/opaque/LwM2mNodeOpaqueDecoder.java`
#### Snippet
```java
        if (path.isResource()) {
            return (T) LwM2mSingleResource.newBinaryResource(path.getResourceId(),
                    content != null ? content : new byte[0]);
        } else {
            return (T) LwM2mResourceInstance.newBinaryInstance(path.getResourceInstanceId(),
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/codec/opaque/LwM2mNodeOpaqueDecoder.java`
#### Snippet
```java
        } else {
            return (T) LwM2mResourceInstance.newBinaryInstance(path.getResourceInstanceId(),
                    content != null ? content : new byte[0]);
        }
    }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `leshan-core/src/main/java/org/eclipse/leshan/core/util/SecurityUtil.java`
#### Snippet
```java
            }

            return x509Certificates.toArray(new X509Certificate[0]);
        }
    };
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/LwM2mMultipleResource.java`
#### Snippet
```java
            break;
        case CORELINK:
            LwM2mNodeUtil.allElementsOfType(values.values(), (new Link[] {}).getClass());
            break;
        case UNSIGNED_INTEGER:
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/util/LinkFormatHelper.java`
#### Snippet
```java
            links.addAll(getBootstrapObjectDescriptionWithoutRoot(objectEnabler, oscoreAttributesByInstanceId));
        }
        return links.toArray(new LwM2mLink[] {});
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/util/LinkFormatHelper.java`
#### Snippet
```java
        }

        return links.toArray(new Link[] {});
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/util/LinkFormatHelper.java`
#### Snippet
```java
        links.addAll(getBootstrapObjectDescriptionWithoutRoot(objectEnabler, null));

        return links.toArray(new LwM2mLink[] {});
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/object/Security.java`
#### Snippet
```java
     */
    public static Security psk(String serverUri, int shortServerId, byte[] pskIdentity, byte[] privateKey) {
        return new Security(serverUri, false, SecurityMode.PSK.code, pskIdentity.clone(), new byte[0],
                privateKey.clone(), shortServerId, CertificateUsage.DOMAIN_ISSUER_CERTIFICATE.code, new ObjectLink());
    }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/object/Security.java`
#### Snippet
```java
     */
    public static Security oscoreOnlyBootstrap(String serverUri, int oscoreObjectInstanceId) {
        return new Security(serverUri, true, SecurityMode.NO_SEC.code, new byte[0], new byte[0], new byte[0], null,
                CertificateUsage.DOMAIN_ISSUER_CERTIFICATE.code, new ObjectLink(OSCORE, oscoreObjectInstanceId));
    }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/object/Security.java`
#### Snippet
```java
     */
    public static Security oscoreOnlyBootstrap(String serverUri, int oscoreObjectInstanceId) {
        return new Security(serverUri, true, SecurityMode.NO_SEC.code, new byte[0], new byte[0], new byte[0], null,
                CertificateUsage.DOMAIN_ISSUER_CERTIFICATE.code, new ObjectLink(OSCORE, oscoreObjectInstanceId));
    }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/object/Security.java`
#### Snippet
```java
     */
    public static Security oscoreOnlyBootstrap(String serverUri, int oscoreObjectInstanceId) {
        return new Security(serverUri, true, SecurityMode.NO_SEC.code, new byte[0], new byte[0], new byte[0], null,
                CertificateUsage.DOMAIN_ISSUER_CERTIFICATE.code, new ObjectLink(OSCORE, oscoreObjectInstanceId));
    }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/object/Security.java`
#### Snippet
```java
     */
    public static Security pskBootstrap(String serverUri, byte[] pskIdentity, byte[] privateKey) {
        return new Security(serverUri, true, SecurityMode.PSK.code, pskIdentity.clone(), new byte[0],
                privateKey.clone(), null, CertificateUsage.DOMAIN_ISSUER_CERTIFICATE.code, new ObjectLink());
    }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/object/Security.java`
#### Snippet
```java
     */
    public static Security oscoreOnly(String serverUri, int shortServerId, int oscoreObjectInstanceId) {
        return new Security(serverUri, false, SecurityMode.NO_SEC.code, new byte[0], new byte[0], new byte[0],
                shortServerId, CertificateUsage.DOMAIN_ISSUER_CERTIFICATE.code,
                new ObjectLink(OSCORE, oscoreObjectInstanceId));
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/object/Security.java`
#### Snippet
```java
     */
    public static Security oscoreOnly(String serverUri, int shortServerId, int oscoreObjectInstanceId) {
        return new Security(serverUri, false, SecurityMode.NO_SEC.code, new byte[0], new byte[0], new byte[0],
                shortServerId, CertificateUsage.DOMAIN_ISSUER_CERTIFICATE.code,
                new ObjectLink(OSCORE, oscoreObjectInstanceId));
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/object/Security.java`
#### Snippet
```java
     */
    public static Security oscoreOnly(String serverUri, int shortServerId, int oscoreObjectInstanceId) {
        return new Security(serverUri, false, SecurityMode.NO_SEC.code, new byte[0], new byte[0], new byte[0],
                shortServerId, CertificateUsage.DOMAIN_ISSUER_CERTIFICATE.code,
                new ObjectLink(OSCORE, oscoreObjectInstanceId));
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/object/Security.java`
#### Snippet
```java
     */
    public static Security noSecBootstrap(String serverUri) {
        return new Security(serverUri, true, SecurityMode.NO_SEC.code, new byte[0], new byte[0], new byte[0], null,
                CertificateUsage.DOMAIN_ISSUER_CERTIFICATE.code, new ObjectLink());
    }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/object/Security.java`
#### Snippet
```java
     */
    public static Security noSecBootstrap(String serverUri) {
        return new Security(serverUri, true, SecurityMode.NO_SEC.code, new byte[0], new byte[0], new byte[0], null,
                CertificateUsage.DOMAIN_ISSUER_CERTIFICATE.code, new ObjectLink());
    }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/object/Security.java`
#### Snippet
```java
     */
    public static Security noSecBootstrap(String serverUri) {
        return new Security(serverUri, true, SecurityMode.NO_SEC.code, new byte[0], new byte[0], new byte[0], null,
                CertificateUsage.DOMAIN_ISSUER_CERTIFICATE.code, new ObjectLink());
    }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/object/Security.java`
#### Snippet
```java
     */
    public static Security noSec(String serverUri, int shortServerId) {
        return new Security(serverUri, false, SecurityMode.NO_SEC.code, new byte[0], new byte[0], new byte[0],
                shortServerId, CertificateUsage.DOMAIN_ISSUER_CERTIFICATE.code, new ObjectLink());
    }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/object/Security.java`
#### Snippet
```java
     */
    public static Security noSec(String serverUri, int shortServerId) {
        return new Security(serverUri, false, SecurityMode.NO_SEC.code, new byte[0], new byte[0], new byte[0],
                shortServerId, CertificateUsage.DOMAIN_ISSUER_CERTIFICATE.code, new ObjectLink());
    }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/object/Security.java`
#### Snippet
```java
     */
    public static Security noSec(String serverUri, int shortServerId) {
        return new Security(serverUri, false, SecurityMode.NO_SEC.code, new byte[0], new byte[0], new byte[0],
                shortServerId, CertificateUsage.DOMAIN_ISSUER_CERTIFICATE.code, new ObjectLink());
    }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/object/LwM2mTestObject.java`
#### Snippet
```java
        clearedValues.put(130, 0.0d);
        clearedValues.put(140, false);
        clearedValues.put(150, new byte[0]);
        clearedValues.put(160, new Date(0l));
        clearedValues.put(170, new ObjectLink());
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/object/LwM2mTestObject.java`
#### Snippet
```java
        clearedValues.put(160, new Date(0l));
        clearedValues.put(170, new ObjectLink());
        clearedValues.put(180, new Link[0]);

        // multi
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/resource/ObjectsInitializer.java`
#### Snippet
```java

    protected LwM2mInstanceEnabler[] createInstances(ObjectModel objectModel) {
        LwM2mInstanceEnabler[] newInstances = new LwM2mInstanceEnabler[0];
        if (instances.containsKey(objectModel.id)) {
            newInstances = instances.get(objectModel.id);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/resource/SimpleInstanceEnabler.java`
#### Snippet
```java

    protected byte[] createDefaultOpaqueValueFor(ObjectModel objectModel, ResourceModel resourceModel) {
        return new byte[0];
    }
}
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/security/FileSecurityStore.java`
#### Snippet
```java
            }
            try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename));) {
                out.writeObject(this.getAll().toArray(new SecurityInfo[0]));
            }
        } catch (IOException e) {
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/bootstrap/BootstrapConfig.java`
#### Snippet
```java
         * The format is defined in Section E.1.1 of the LwM2M version 1.0 specification.
         */
        public byte[] publicKeyOrId = new byte[] {};
        /**
         * Stores the LwM2M Server’s or LwM2M Bootstrap-Server’s Certificate (Certificate mode), public key (RPK mode).
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/bootstrap/BootstrapConfig.java`
#### Snippet
```java
         * by a bootstrap-server and MUST NOT be readable by any server.
         */
        public byte[] smsBindingKeySecret = new byte[] {};
        /**
         * MSISDN used by the LwM2M Client to send messages to the LwM2M Server via the SMS binding. The LwM2M Client
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/bootstrap/BootstrapConfig.java`
#### Snippet
```java
         * This Resource MUST only be changed by a bootstrap-server and MUST NOT be readable by any server.
         */
        public byte[] secretKey = new byte[] {};
        /**
         * Determines which SMS security mode is used (see section 7.2 of the LwM2M version 1.0 specification)
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/bootstrap/BootstrapConfig.java`
#### Snippet
```java
         * The format is defined in Section E.1.1 of the LwM2M version 1.0 specification.
         */
        public byte[] serverPublicKey = new byte[] {};
        /**
         * Stores the secret key or private key of the security mode.
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/bootstrap/BootstrapConfig.java`
#### Snippet
```java
         * The format is defined in Section E.1.2 of the LwM2M version 1.0 specification.
         */
        public byte[] smsBindingKeyParam = new byte[] {};
        /**
         * 16-32-48 bytes array stores the values of the key(s) for the SMS binding. This resource MUST only be changed
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/endpoint/ServerCoapMessageTranslator.java`
#### Snippet
```java
        } catch (CodecException e) {
            if (LOG.isDebugEnabled()) {
                byte[] payload = coapResponse.getPayload() == null ? new byte[0] : coapResponse.getPayload();
                LOG.debug(String.format("Unable to decode notification payload [%s] of observation [%s] ",
                        Hex.encodeHexString(payload), observation), e);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/bootstrap/request/LwM2mResponseBuilder.java`
#### Snippet
```java
        } catch (CodecException e) {
            if (LOG.isDebugEnabled()) {
                byte[] payload = coapResponse.getPayload() == null ? new byte[0] : coapResponse.getPayload();
                LOG.debug(
                        String.format("Unable to decode response payload of request [%s] from client [%s] [payload:%s]",
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/request/LwM2mResponseBuilder.java`
#### Snippet
```java
        } catch (CodecException e) {
            if (LOG.isDebugEnabled()) {
                byte[] payload = coapResponse.getPayload() == null ? new byte[0] : coapResponse.getPayload();
                LOG.debug(
                        String.format("Unable to decode response payload of request [%s] from client [%s] [payload:%s]",
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/request/LwM2mResponseBuilder.java`
#### Snippet
```java
        } catch (CodecException e) {
            if (LOG.isDebugEnabled()) {
                byte[] payload = coapResponse.getPayload() == null ? new byte[0] : coapResponse.getPayload();
                LOG.debug(
                        String.format("Unable to decode response payload of request [%s] from client [%s] [payload:%s]",
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `leshan-server-demo/src/main/java/org/eclipse/leshan/server/demo/servlet/ClientServlet.java`
#### Snippet
```java
            }

            String json = this.mapper.writeValueAsString(registrations.toArray(new Registration[] {}));
            resp.setContentType("application/json");
            resp.getOutputStream().write(json.getBytes(StandardCharsets.UTF_8));
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `leshan-client-cf/src/main/java/org/eclipse/leshan/client/californium/X509Util.java`
#### Snippet
```java
        }

        return x509Certificates.toArray(new X509Certificate[0]);
    }
}
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `leshan-client-cf/src/main/java/org/eclipse/leshan/client/californium/object/ObjectResource.java`
#### Snippet
```java
                // This is probably the pretty strange use case where
                // instance ID is not defined an no resources available.
                createRequest = new CreateRequest(contentFormat, coapRequest, URI, new LwM2mResource[0]);
            } else if (object.getInstances().size() == 1 && newInstance != null) {
                // the instance Id was not part of the create request payload.
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `leshan-server-redis/src/main/java/org/eclipse/leshan/server/redis/RedisRegistrationStore.java`
#### Snippet
```java
                    this.scanResult = new ArrayList<>();
                    if (sr.getResult() != null && !sr.getResult().isEmpty()) {
                        for (byte[] value : j.mget(sr.getResult().toArray(new byte[][] {}))) {
                            this.scanResult.add(deserializeReg(value));
                        }
```

## RuleId[id=NonFinalFieldOfException]
### NonFinalFieldOfException
Non-final field `argSpecs` of exception class
in `leshan-core-demo/src/main/java/org/eclipse/leshan/core/demo/cli/MultiParameterException.java`
#### Snippet
```java
    private static final long serialVersionUID = 1L;

    private List<ArgSpec> argSpecs;

    public MultiParameterException(CommandLine commandLine, String msg, String... optionNames) {
```

### NonFinalFieldOfException
Non-final field `type` of exception class
in `leshan-core/src/main/java/org/eclipse/leshan/core/request/exception/TimeoutException.java`
#### Snippet
```java
    private static final long serialVersionUID = -8966041387554358975L;

    private Type type;

    public TimeoutException(Type type, String message, Object... args) {
```

## RuleId[id=UnusedAssignment]
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
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/codec/senml/LwM2mNodeSenMLDecoder.java`
#### Snippet
```java

        // Create lwm2m node
        LwM2mNode node = null;
        if (nodeClass == LwM2mObject.class) {
            Collection<LwM2mObjectInstance> instances = new ArrayList<>();
```

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

## RuleId[id=ConstantValue]
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
Result of `name.equals(other.name)` is always 'true'
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

## RuleId[id=MethodOverridesStaticMethod]
### MethodOverridesStaticMethod
Method `getDefault()` tries to override a static method of a superclass
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2m.java`
#### Snippet
```java
        }

        public static LwM2mVersion getDefault() {
            return V1_0;
        }
```

### MethodOverridesStaticMethod
Method `methodNotAllowed()` tries to override a static method of a superclass
in `leshan-core/src/main/java/org/eclipse/leshan/core/response/ObserveCompositeResponse.java`
#### Snippet
```java
    }

    public static ObserveCompositeResponse methodNotAllowed() {
        return new ObserveCompositeResponse(ResponseCode.METHOD_NOT_ALLOWED, null, null, null, null);
    }
```

### MethodOverridesStaticMethod
Method `success()` tries to override a static method of a superclass
in `leshan-core/src/main/java/org/eclipse/leshan/core/response/ObserveCompositeResponse.java`
#### Snippet
```java
    // Syntactic sugar static constructors:

    public static ObserveCompositeResponse success(Map<LwM2mPath, LwM2mNode> content) {
        return new ObserveCompositeResponse(ResponseCode.CONTENT, content, null, null, null);
    }
```

### MethodOverridesStaticMethod
Method `internalServerError()` tries to override a static method of a superclass
in `leshan-core/src/main/java/org/eclipse/leshan/core/response/ObserveCompositeResponse.java`
#### Snippet
```java
    }

    public static ObserveCompositeResponse internalServerError(String errorMessage) {
        return new ObserveCompositeResponse(ResponseCode.INTERNAL_SERVER_ERROR, null, errorMessage, null, null);
    }
```

### MethodOverridesStaticMethod
Method `notFound()` tries to override a static method of a superclass
in `leshan-core/src/main/java/org/eclipse/leshan/core/response/ObserveCompositeResponse.java`
#### Snippet
```java
    }

    public static ObserveCompositeResponse notFound() {
        return new ObserveCompositeResponse(ResponseCode.NOT_FOUND, null, null, null, null);
    }
```

### MethodOverridesStaticMethod
Method `unauthorized()` tries to override a static method of a superclass
in `leshan-core/src/main/java/org/eclipse/leshan/core/response/ObserveCompositeResponse.java`
#### Snippet
```java
    }

    public static ObserveCompositeResponse unauthorized() {
        return new ObserveCompositeResponse(ResponseCode.UNAUTHORIZED, null, null, null, null);
    }
```

### MethodOverridesStaticMethod
Method `notAcceptable()` tries to override a static method of a superclass
in `leshan-core/src/main/java/org/eclipse/leshan/core/response/ObserveCompositeResponse.java`
#### Snippet
```java
    }

    public static ObserveCompositeResponse notAcceptable() {
        return new ObserveCompositeResponse(ResponseCode.UNSUPPORTED_CONTENT_FORMAT, null, null, null, null);
    }
```

### MethodOverridesStaticMethod
Method `badRequest()` tries to override a static method of a superclass
in `leshan-core/src/main/java/org/eclipse/leshan/core/response/ObserveCompositeResponse.java`
#### Snippet
```java
    }

    public static ObserveCompositeResponse badRequest(String errorMessage) {
        return new ObserveCompositeResponse(ResponseCode.BAD_REQUEST, null, errorMessage, null, null);
    }
```

### MethodOverridesStaticMethod
Method `unauthorized()` tries to override a static method of a superclass
in `leshan-core/src/main/java/org/eclipse/leshan/core/response/CancelObservationResponse.java`
#### Snippet
```java
    }

    public static CancelObservationResponse unauthorized() {
        return new CancelObservationResponse(ResponseCode.UNAUTHORIZED, null, null, null, null);
    }
```

### MethodOverridesStaticMethod
Method `success()` tries to override a static method of a superclass
in `leshan-core/src/main/java/org/eclipse/leshan/core/response/CancelObservationResponse.java`
#### Snippet
```java
    }

    public static CancelObservationResponse success(List<TimestampedLwM2mNode> timestampedValues) {
        return new CancelObservationResponse(ResponseCode.CONTENT, null, timestampedValues, null, null);
    }
```

### MethodOverridesStaticMethod
Method `notAcceptable()` tries to override a static method of a superclass
in `leshan-core/src/main/java/org/eclipse/leshan/core/response/CancelObservationResponse.java`
#### Snippet
```java
    }

    public static CancelObservationResponse notAcceptable() {
        return new CancelObservationResponse(ResponseCode.NOT_ACCEPTABLE, null, null, null, null);
    }
```

### MethodOverridesStaticMethod
Method `internalServerError()` tries to override a static method of a superclass
in `leshan-core/src/main/java/org/eclipse/leshan/core/response/CancelObservationResponse.java`
#### Snippet
```java
    }

    public static CancelObservationResponse internalServerError(String errorMessage) {
        return new CancelObservationResponse(ResponseCode.INTERNAL_SERVER_ERROR, null, null, null, errorMessage);
    }
```

### MethodOverridesStaticMethod
Method `success()` tries to override a static method of a superclass
in `leshan-core/src/main/java/org/eclipse/leshan/core/response/CancelObservationResponse.java`
#### Snippet
```java
    // Syntactic sugar static constructors :

    public static CancelObservationResponse success(LwM2mNode content) {
        return new CancelObservationResponse(ResponseCode.CONTENT, content, null, null, null);
    }
```

### MethodOverridesStaticMethod
Method `badRequest()` tries to override a static method of a superclass
in `leshan-core/src/main/java/org/eclipse/leshan/core/response/CancelObservationResponse.java`
#### Snippet
```java
    }

    public static CancelObservationResponse badRequest(String errorMessage) {
        return new CancelObservationResponse(ResponseCode.BAD_REQUEST, null, null, null, errorMessage);
    }
```

### MethodOverridesStaticMethod
Method `methodNotAllowed()` tries to override a static method of a superclass
in `leshan-core/src/main/java/org/eclipse/leshan/core/response/CancelObservationResponse.java`
#### Snippet
```java
    }

    public static CancelObservationResponse methodNotAllowed() {
        return new CancelObservationResponse(ResponseCode.METHOD_NOT_ALLOWED, null, null, null, null);
    }
```

### MethodOverridesStaticMethod
Method `notFound()` tries to override a static method of a superclass
in `leshan-core/src/main/java/org/eclipse/leshan/core/response/CancelObservationResponse.java`
#### Snippet
```java
    }

    public static CancelObservationResponse notFound() {
        return new CancelObservationResponse(ResponseCode.NOT_FOUND, null, null, null, null);
    }
```

### MethodOverridesStaticMethod
Method `notAcceptable()` tries to override a static method of a superclass
in `leshan-core/src/main/java/org/eclipse/leshan/core/response/ObserveResponse.java`
#### Snippet
```java
    }

    public static ObserveResponse notAcceptable() {
        return new ObserveResponse(ResponseCode.NOT_ACCEPTABLE, null, null, null, null);
    }
```

### MethodOverridesStaticMethod
Method `success()` tries to override a static method of a superclass
in `leshan-core/src/main/java/org/eclipse/leshan/core/response/ObserveResponse.java`
#### Snippet
```java
    // Syntactic sugar static constructors :

    public static ObserveResponse success(LwM2mNode content) {
        return new ObserveResponse(ResponseCode.CONTENT, content, null, null, null);
    }
```

### MethodOverridesStaticMethod
Method `methodNotAllowed()` tries to override a static method of a superclass
in `leshan-core/src/main/java/org/eclipse/leshan/core/response/ObserveResponse.java`
#### Snippet
```java
    }

    public static ObserveResponse methodNotAllowed() {
        return new ObserveResponse(ResponseCode.METHOD_NOT_ALLOWED, null, null, null, null);
    }
```

### MethodOverridesStaticMethod
Method `unauthorized()` tries to override a static method of a superclass
in `leshan-core/src/main/java/org/eclipse/leshan/core/response/ObserveResponse.java`
#### Snippet
```java
    }

    public static ObserveResponse unauthorized() {
        return new ObserveResponse(ResponseCode.UNAUTHORIZED, null, null, null, null);
    }
```

### MethodOverridesStaticMethod
Method `internalServerError()` tries to override a static method of a superclass
in `leshan-core/src/main/java/org/eclipse/leshan/core/response/ObserveResponse.java`
#### Snippet
```java
    }

    public static ObserveResponse internalServerError(String errorMessage) {
        return new ObserveResponse(ResponseCode.INTERNAL_SERVER_ERROR, null, null, null, errorMessage);
    }
```

### MethodOverridesStaticMethod
Method `badRequest()` tries to override a static method of a superclass
in `leshan-core/src/main/java/org/eclipse/leshan/core/response/ObserveResponse.java`
#### Snippet
```java
    }

    public static ObserveResponse badRequest(String errorMessage) {
        return new ObserveResponse(ResponseCode.BAD_REQUEST, null, null, null, errorMessage);
    }
```

### MethodOverridesStaticMethod
Method `notFound()` tries to override a static method of a superclass
in `leshan-core/src/main/java/org/eclipse/leshan/core/response/ObserveResponse.java`
#### Snippet
```java
    }

    public static ObserveResponse notFound() {
        return new ObserveResponse(ResponseCode.NOT_FOUND, null, null, null, null);
    }
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

## RuleId[id=FieldMayBeStatic]
### FieldMayBeStatic
Field `DEFAULT_RANDOM_SIZE` may be 'static'
in `leshan-server-redis/src/main/java/org/eclipse/leshan/server/redis/SingleInstanceJedisLock.java`
#### Snippet
```java
    private static final Logger LOG = LoggerFactory.getLogger(SingleInstanceJedisLock.class);

    protected final int DEFAULT_RANDOM_SIZE = 10;
    protected final int DEFAULT_VALUE_SIZE = DEFAULT_RANDOM_SIZE + Long.SIZE / 8;

```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `LwM2mDemoConstant` has only 'static' members, and lacks a 'private' constructor
in `leshan-core-demo/src/main/java/org/eclipse/leshan/core/demo/LwM2mDemoConstant.java`
#### Snippet
```java
package org.eclipse.leshan.core.demo;

public class LwM2mDemoConstant {
    public final static String[] modelPaths = new String[] { "8.xml", "9.xml", "10-1_0.xml", "10.xml", "11-1_0.xml",
            "11.xml", "12-1_0.xml", "12.xml", "13-1_0.xml", "13.xml", "14.xml", "15-1_0.xml", "15.xml", "16.xml",
```

### UtilityClassWithoutPrivateConstructor
Class `LeshanBootstrapServerDemo` has only 'static' members, and lacks a 'private' constructor
in `leshan-bsserver-demo/src/main/java/org/eclipse/leshan/server/bootstrap/demo/LeshanBootstrapServerDemo.java`
#### Snippet
```java
import picocli.CommandLine;

public class LeshanBootstrapServerDemo {

    static {
```

### UtilityClassWithoutPrivateConstructor
Class `TlvEncoder` has only 'static' members, and lacks a 'private' constructor
in `leshan-core/src/main/java/org/eclipse/leshan/core/tlv/TlvEncoder.java`
#### Snippet
```java
import org.slf4j.LoggerFactory;

public class TlvEncoder {

    private static final Logger LOG = LoggerFactory.getLogger(TlvEncoder.class);
```

### UtilityClassWithoutPrivateConstructor
Class `TlvDecoder` has only 'static' members, and lacks a 'private' constructor
in `leshan-core/src/main/java/org/eclipse/leshan/core/tlv/TlvDecoder.java`
#### Snippet
```java
import org.slf4j.LoggerFactory;

public class TlvDecoder {

    private static final Logger LOG = LoggerFactory.getLogger(TlvDecoder.class);
```

### UtilityClassWithoutPrivateConstructor
Class `LwM2mAttributes` has only 'static' members, and lacks a 'private' constructor
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/lwm2m/attributes/LwM2mAttributes.java`
#### Snippet
```java
import org.eclipse.leshan.core.node.LwM2mPath;

public final class LwM2mAttributes {

    // dim
```

### UtilityClassWithoutPrivateConstructor
Class `LwM2mNodeUtil` has only 'static' members, and lacks a 'private' constructor
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/LwM2mNodeUtil.java`
#### Snippet
```java
 * Utility class about {@link LwM2mNode} and {@link LwM2mPath}.
 */
public class LwM2mNodeUtil {

    public static void validateNotNull(Object value, String message, Object... args) throws LwM2mNodeException {
```

### UtilityClassWithoutPrivateConstructor
Class `TimestampUtil` has only 'static' members, and lacks a 'private' constructor
in `leshan-core/src/main/java/org/eclipse/leshan/core/util/TimestampUtil.java`
#### Snippet
```java
 * </p>
 */
public class TimestampUtil {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `SecurityUtil` has only 'static' members, and lacks a 'private' constructor
in `leshan-core/src/main/java/org/eclipse/leshan/core/util/SecurityUtil.java`
#### Snippet
```java
import org.eclipse.leshan.core.credentials.CredentialsReader;

public class SecurityUtil {

    public static CredentialsReader<PrivateKey> privateKey = new CredentialsReader<PrivateKey>() {
```

### UtilityClassWithoutPrivateConstructor
Class `RandomStringUtils` has only 'static' members, and lacks a 'private' constructor
in `leshan-core/src/main/java/org/eclipse/leshan/core/util/RandomStringUtils.java`
#### Snippet
```java
 * @version $Id: RandomStringUtils.java 1056988 2011-01-09 17:58:53Z niallp $
 */
public class RandomStringUtils {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `StringUtils` has only 'static' members, and lacks a 'private' constructor
in `leshan-core/src/main/java/org/eclipse/leshan/core/util/StringUtils.java`
#### Snippet
```java
 */
// @Immutable
public class StringUtils {

    // Equals
```

### UtilityClassWithoutPrivateConstructor
Class `Validate` has only 'static' members, and lacks a 'private' constructor
in `leshan-core/src/main/java/org/eclipse/leshan/core/util/Validate.java`
#### Snippet
```java
 */
@SuppressWarnings("rawtypes")
public class Validate {
    // Validate has no dependencies on other classes in Commons Lang at present

```

### UtilityClassWithoutPrivateConstructor
Class `X509CertUtil` has only 'static' members, and lacks a 'private' constructor
in `leshan-core/src/main/java/org/eclipse/leshan/core/util/X509CertUtil.java`
#### Snippet
```java
 * X.509 Certificate Utilities for accessing certificate details.
 */
public class X509CertUtil {
    /**
     * <a href="https://tools.ietf.org/html/rfc3280#section-4.2.1.7">rfc3280#section-4.2.1.7</a> - GeneralName
```

### UtilityClassWithoutPrivateConstructor
Class `LwM2mValueUtil` has only 'static' members, and lacks a 'private' constructor
in `leshan-core/src/main/java/org/eclipse/leshan/core/util/datatype/LwM2mValueUtil.java`
#### Snippet
```java
import org.eclipse.leshan.core.model.ResourceModel;

public class LwM2mValueUtil {

    static public String toPrettyString(ResourceModel.Type type, Object value) {
```

### UtilityClassWithoutPrivateConstructor
Class `URN` has only 'static' members, and lacks a 'private' constructor
in `leshan-core/src/main/java/org/eclipse/leshan/core/model/URN.java`
#### Snippet
```java
 * @since 1.1
 */
public class URN {
    public static final String OMA_LABEL = "oma";
    public static final String EXT_LABEL = "ext";
```

### UtilityClassWithoutPrivateConstructor
Class `NumberUtil` has only 'static' members, and lacks a 'private' constructor
in `leshan-core/src/main/java/org/eclipse/leshan/core/util/datatype/NumberUtil.java`
#### Snippet
```java
import com.upokecenter.numbers.EInteger;

public class NumberUtil {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `ObjectLoader` has only 'static' members, and lacks a 'private' constructor
in `leshan-core/src/main/java/org/eclipse/leshan/core/model/ObjectLoader.java`
#### Snippet
```java
import org.slf4j.LoggerFactory;

public class ObjectLoader {

    private static final Logger LOG = LoggerFactory.getLogger(ObjectLoader.class);
```

### UtilityClassWithoutPrivateConstructor
Class `EndpointUriUtil` has only 'static' members, and lacks a 'private' constructor
in `leshan-core/src/main/java/org/eclipse/leshan/core/endpoint/EndpointUriUtil.java`
#### Snippet
```java
import org.eclipse.leshan.core.util.Validate;

public class EndpointUriUtil {

    public static URI createUri(String scheme, String host, int port) {
```

### UtilityClassWithoutPrivateConstructor
Class `CertPathUtil` has only 'static' members, and lacks a 'private' constructor
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/bootstrap/CertPathUtil.java`
#### Snippet
```java
 * @since 2.1
 */
public class CertPathUtil {

    private static final Logger LOGGER = LoggerFactory.getLogger(CertPathUtil.class);
```

### UtilityClassWithoutPrivateConstructor
Class `ServersInfoExtractor` has only 'static' members, and lacks a 'private' constructor
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/servers/ServersInfoExtractor.java`
#### Snippet
```java
 * Extract from LwM2m object tree all the servers information like server uri, security mode, ...
 */
public class ServersInfoExtractor {
    private static final Logger LOG = LoggerFactory.getLogger(ServersInfoExtractor.class);
    private static LwM2mObject oscores = null;
```

### UtilityClassWithoutPrivateConstructor
Class `BootstrapUtil` has only 'static' members, and lacks a 'private' constructor
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/bootstrap/BootstrapUtil.java`
#### Snippet
```java
import org.eclipse.leshan.server.bootstrap.BootstrapConfig.ServerSecurity;

public class BootstrapUtil {
    public static LwM2mObjectInstance toSecurityInstance(int instanceId, ServerSecurity securityConfig) {
        Collection<LwM2mResource> resources = new ArrayList<>();
```

### UtilityClassWithoutPrivateConstructor
Class `LeshanClientDemo` has only 'static' members, and lacks a 'private' constructor
in `leshan-client-demo/src/main/java/org/eclipse/leshan/client/demo/LeshanClientDemo.java`
#### Snippet
```java
import picocli.CommandLine;

public class LeshanClientDemo {

    static {
```

### UtilityClassWithoutPrivateConstructor
Class `ResponseCodeUtil` has only 'static' members, and lacks a 'private' constructor
in `leshan-core-cf/src/main/java/org/eclipse/leshan/core/californium/ResponseCodeUtil.java`
#### Snippet
```java
import org.eclipse.leshan.core.util.Validate;

public class ResponseCodeUtil {

    public static int toLwM2mCode(org.eclipse.californium.core.coap.CoAP.ResponseCode coapResponseCode) {
```

### UtilityClassWithoutPrivateConstructor
Class `ObserveUtil` has only 'static' members, and lacks a 'private' constructor
in `leshan-core-cf/src/main/java/org/eclipse/leshan/core/californium/ObserveUtil.java`
#### Snippet
```java
 * Utility functions to help to handle observation in Leshan.
 */
public class ObserveUtil {

    /* keys used to populate the request context */
```

### UtilityClassWithoutPrivateConstructor
Class `FileLister` has only 'static' members, and lacks a 'private' constructor
in `leshan-server-demo/src/main/java/org/eclipse/leshan/server/demo/model/FileLister.java`
#### Snippet
```java
 * LeshanClientDemo.
 */
public class FileLister {
    public static void main(String[] args) throws InvalidDDFFileException, IOException {
        String ddfFilesPath = DdfDownloader.DOWNLOAD_FOLDER_PATH;
```

### UtilityClassWithoutPrivateConstructor
Class `LeshanServerDemo` has only 'static' members, and lacks a 'private' constructor
in `leshan-server-demo/src/main/java/org/eclipse/leshan/server/demo/LeshanServerDemo.java`
#### Snippet
```java
import picocli.CommandLine;

public class LeshanServerDemo {

    static {
```

### UtilityClassWithoutPrivateConstructor
Class `X509Util` has only 'static' members, and lacks a 'private' constructor
in `leshan-client-cf/src/main/java/org/eclipse/leshan/client/californium/X509Util.java`
#### Snippet
```java
import org.eclipse.californium.elements.util.CertPathUtil;

public class X509Util {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `EndpointContextSerDes` has only 'static' members, and lacks a 'private' constructor
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/observation/EndpointContextSerDes.java`
#### Snippet
```java
 * Functions for serializing and deserializing a Californium {@link EndpointContext} in JSON.
 */
public class EndpointContextSerDes {

    private static final Logger LOG = LoggerFactory.getLogger(EndpointContextSerDes.class);
```

### UtilityClassWithoutPrivateConstructor
Class `IdentitySerDes` has only 'static' members, and lacks a 'private' constructor
in `leshan-server-redis/src/main/java/org/eclipse/leshan/server/redis/serialization/IdentitySerDes.java`
#### Snippet
```java
import com.fasterxml.jackson.databind.node.ObjectNode;

public class IdentitySerDes {

    private static final String KEY_ADDRESS = "address";
```

### UtilityClassWithoutPrivateConstructor
Class `SecurityInfoSerDes` has only 'static' members, and lacks a 'private' constructor
in `leshan-server-redis/src/main/java/org/eclipse/leshan/server/redis/serialization/SecurityInfoSerDes.java`
#### Snippet
```java
 * Functions for serialize and deserialize security information in JSON for storage.
 */
public class SecurityInfoSerDes {

    public static byte[] serialize(SecurityInfo s) {
```

### UtilityClassWithoutPrivateConstructor
Class `RedisLock` has only 'static' members, and lacks a 'private' constructor
in `leshan-server-redis/src/main/java/org/eclipse/leshan/server/redis/RedisLock.java`
#### Snippet
```java
 */
@Deprecated
public class RedisLock {
    private static final Logger LOG = LoggerFactory.getLogger(RedisLock.class);

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

## RuleId[id=UnnecessarySemicolon]
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
in `leshan-core/src/main/java/org/eclipse/leshan/core/tlv/Tlv.java`
#### Snippet
```java

    public enum TlvType {
        OBJECT_INSTANCE, RESOURCE_INSTANCE, MULTIPLE_RESOURCE, RESOURCE_VALUE;
    }

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
    // epmin
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
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/codec/senml/LwM2mSenMLResolver.java`
#### Snippet
```java
        }
    }
};

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
                    registrationService.fireUpdated(update, updatedRegistration.getUpdatedRegistration(),
                            updatedRegistration.getPreviousRegistration());
                };
            };
            return new SendableResponse<>(UpdateResponse.success(), whenSent);
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
in `leshan-client-cf/src/main/java/org/eclipse/leshan/client/californium/endpoint/coap/CoapClientEndpointFactory.java`
#### Snippet
```java
    public IdentityHandler createIdentityHandler() {
        return new DefaultCoapIdentityHandler();
    };

    @Override
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

## RuleId[id=NonSynchronizedMethodOverridesSynchronizedMethod]
### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `remove()` overrides synchronized method
in `leshan-bsserver-demo/src/main/java/org/eclipse/leshan/server/bootstrap/demo/JSONFileBootstrapStore.java`
#### Snippet
```java

    @Override
    public BootstrapConfig remove(String enpoint) {
        writeLock.lock();
        try {
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `add()` overrides synchronized method
in `leshan-bsserver-demo/src/main/java/org/eclipse/leshan/server/bootstrap/demo/JSONFileBootstrapStore.java`
#### Snippet
```java

    @Override
    public void add(String endpoint, BootstrapConfig config) throws InvalidConfigurationException {
        writeLock.lock();
        try {
```

## RuleId[id=NonSerializableFieldInSerializableClass]
### NonSerializableFieldInSerializableClass
Non-serializable field 'publicKeySerDes' in a Serializable class
in `leshan-bsserver-demo/src/main/java/org/eclipse/leshan/server/bootstrap/demo/servlet/ServerServlet.java`
#### Snippet
```java

    private final X509CertificateSerDes certificateSerDes;
    private final PublicKeySerDes publicKeySerDes;

    private final LeshanBootstrapServer server;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'certificateSerDes' in a Serializable class
in `leshan-bsserver-demo/src/main/java/org/eclipse/leshan/server/bootstrap/demo/servlet/ServerServlet.java`
#### Snippet
```java
    private static final long serialVersionUID = 1L;

    private final X509CertificateSerDes certificateSerDes;
    private final PublicKeySerDes publicKeySerDes;

```

### NonSerializableFieldInSerializableClass
Non-serializable field 'server' in a Serializable class
in `leshan-bsserver-demo/src/main/java/org/eclipse/leshan/server/bootstrap/demo/servlet/ServerServlet.java`
#### Snippet
```java
    private final PublicKeySerDes publicKeySerDes;

    private final LeshanBootstrapServer server;
    private final PublicKey publicKey;
    private final X509Certificate serverCertificate;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'publicKeySerDes' in a Serializable class
in `leshan-server-core-demo/src/main/java/org/eclipse/leshan/server/core/demo/json/servlet/SecurityServlet.java`
#### Snippet
```java

    private final X509CertificateSerDes certificateSerDes;
    private final PublicKeySerDes publicKeySerDes;

    private final ObjectMapper mapper;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'certificateSerDes' in a Serializable class
in `leshan-server-core-demo/src/main/java/org/eclipse/leshan/server/core/demo/json/servlet/SecurityServlet.java`
#### Snippet
```java
    private final X509Certificate serverCertificate;

    private final X509CertificateSerDes certificateSerDes;
    private final PublicKeySerDes publicKeySerDes;

```

### NonSerializableFieldInSerializableClass
Non-serializable field 'serializer' in a Serializable class
in `leshan-server-demo/src/main/java/org/eclipse/leshan/server/demo/servlet/ObjectSpecServlet.java`
#### Snippet
```java
    private static final long serialVersionUID = 1L;

    private final ObjectModelSerDes serializer;

    private final LwM2mModelProvider modelProvider;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'server' in a Serializable class
in `leshan-server-demo/src/main/java/org/eclipse/leshan/server/demo/servlet/ServerServlet.java`
#### Snippet
```java
    private final PublicKeySerDes publicKeySerDes;

    private final LeshanServer server;
    private final PublicKey publicKey;
    private final X509Certificate serverCertificate;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'publicKeySerDes' in a Serializable class
in `leshan-server-demo/src/main/java/org/eclipse/leshan/server/demo/servlet/ServerServlet.java`
#### Snippet
```java

    private final X509CertificateSerDes certificateSerDes;
    private final PublicKeySerDes publicKeySerDes;

    private final LeshanServer server;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'certificateSerDes' in a Serializable class
in `leshan-server-demo/src/main/java/org/eclipse/leshan/server/demo/servlet/ServerServlet.java`
#### Snippet
```java
    private static final long serialVersionUID = 1L;

    private final X509CertificateSerDes certificateSerDes;
    private final PublicKeySerDes publicKeySerDes;

```

### NonSerializableFieldInSerializableClass
Non-serializable field 'coapMessageTracer' in a Serializable class
in `leshan-server-demo/src/main/java/org/eclipse/leshan/server/demo/servlet/EventServlet.java`
#### Snippet
```java
    private final ObjectMapper mapper;

    private final CoapMessageTracer coapMessageTracer;

    private final Set<LeshanEventSource> eventSources = Collections
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'server' in a Serializable class
in `leshan-server-demo/src/main/java/org/eclipse/leshan/server/demo/servlet/ClientServlet.java`
#### Snippet
```java
    private static final long serialVersionUID = 1L;

    private final LeshanServer server;
    private final ObjectMapper mapper;
    private final LwM2mAttributeParser attributeParser;
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
in `leshan-server-redis/src/main/java/org/eclipse/leshan/server/redis/SingleInstanceJedisLock.java`
#### Snippet
```java
            try {
                Thread.sleep(iterationTime);
            } catch (InterruptedException e) {
            }
        }
```

## RuleId[id=AssignmentToForLoopParameter]
### AssignmentToForLoopParameter
Assignment to for-loop parameter `j`
in `leshan-core/src/main/java/org/eclipse/leshan/core/util/Hex.java`
#### Snippet
```java
        for (int i = 0, j = 0; j < len; i++) {
            int f = toDigit(data[j], j) << 4;
            j++;
            f = f | toDigit(data[j], j);
            j++;
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `j`
in `leshan-core/src/main/java/org/eclipse/leshan/core/util/Hex.java`
#### Snippet
```java
            j++;
            f = f | toDigit(data[j], j);
            j++;
            out[i] = (byte) (f & 0xFF);
        }
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `j`
in `leshan-core/src/main/java/org/eclipse/leshan/core/util/Hex.java`
#### Snippet
```java
        // two characters form the hex value.
        for (int i = 0, j = 0; i < l; i++) {
            out[j++] = toDigits[(0xF0 & data[i]) >>> 4];
            out[j++] = toDigits[0x0F & data[i]];
        }
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `j`
in `leshan-core/src/main/java/org/eclipse/leshan/core/util/Hex.java`
#### Snippet
```java
        for (int i = 0, j = 0; i < l; i++) {
            out[j++] = toDigits[(0xF0 & data[i]) >>> 4];
            out[j++] = toDigits[0x0F & data[i]];
        }
        return out;
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `leshan-core/src/main/java/org/eclipse/leshan/core/util/X509CertUtil.java`
#### Snippet
```java
                        int val = Integer.parseInt(name.substring(i + 1, i + 2), 16);
                        value.append((char) val);
                        i += 2;
                    } else {
                        value.append(nextCh);
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `leshan-core/src/main/java/org/eclipse/leshan/core/util/X509CertUtil.java`
#### Snippet
```java
                    } else {
                        value.append(nextCh);
                        i++;
                    }
                } else if (ch == ',' || ch == '+') {
```

## RuleId[id=UnnecessaryToStringCall]
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
in `leshan-client-cf/src/main/java/org/eclipse/leshan/client/californium/endpoint/coaps/CoapsClientEndpointFactory.java`
#### Snippet
```java
                    throw new IllegalStateException(
                            String.format("Unable to extract sender identity : unexpected type of Principal %s [%s]",
                                    senderIdentity.getClass(), senderIdentity.toString()));
                }
                return null;
```

## RuleId[id=SuspiciousMethodCalls]
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

## RuleId[id=InnerClassMayBeStatic]
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
Inner class `ErrorResponseCreator` may be 'static'
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/request/DefaultDownlinkReceiver.java`
#### Snippet
```java
    }

    public class ErrorResponseCreator<T extends LwM2mResponse> implements DownlinkRequestVisitor {

        private final ResponseCode code;
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

## RuleId[id=PublicFieldAccessedInSynchronizedContext]
### PublicFieldAccessedInSynchronizedContext
Non-private field `endpointProvider` accessed in synchronized context
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/endpoint/DefaultEndpointsManager.java`
#### Snippet
```java

    public synchronized LwM2mClientEndpoint getEndpoint(ServerIdentity server) {
        return endpointProvider.getEndpoint(server);
    }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `endpointProvider` accessed in synchronized context
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/endpoint/DefaultEndpointsManager.java`
#### Snippet
```java
    @Override
    public synchronized void destroy() {
        endpointProvider.destroy();
    }
}
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `endpointProvider` accessed in synchronized context
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/endpoint/DefaultEndpointsManager.java`
#### Snippet
```java
    @Override
    public synchronized void start() {
        endpointProvider.start();
    }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `endpointProvider` accessed in synchronized context
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/endpoint/DefaultEndpointsManager.java`
#### Snippet
```java
    @Override
    public synchronized void stop() {
        endpointProvider.stop();

    }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `endpointProvider` accessed in synchronized context
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/endpoint/DefaultEndpointsManager.java`
#### Snippet
```java
    public synchronized ServerIdentity createEndpoint(ServerInfo serverInfo, boolean clientInitiatedOnly) {
        // Clear previous endpoint
        endpointProvider.destroyEndpoints();

        // Create new endpoint
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `endpointProvider` accessed in synchronized context
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/endpoint/DefaultEndpointsManager.java`
#### Snippet
```java

        // Create new endpoint
        return endpointProvider.createEndpoint(serverInfo, clientInitiatedOnly, trustStore, toolbox);
    }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `trustStore` accessed in synchronized context
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/endpoint/DefaultEndpointsManager.java`
#### Snippet
```java

        // Create new endpoint
        return endpointProvider.createEndpoint(serverInfo, clientInitiatedOnly, trustStore, toolbox);
    }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `toolbox` accessed in synchronized context
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/endpoint/DefaultEndpointsManager.java`
#### Snippet
```java

        // Create new endpoint
        return endpointProvider.createEndpoint(serverInfo, clientInitiatedOnly, trustStore, toolbox);
    }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `instances` accessed in synchronized context
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/resource/ObjectEnabler.java`
#### Snippet
```java

    public synchronized LwM2mInstanceEnabler removeInstance(int instanceId) {
        LwM2mInstanceEnabler removedInstance = instances.remove(instanceId);
        if (removedInstance != null) {
            fireInstancesRemoved(removedInstance.getId());
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `instances` accessed in synchronized context
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/resource/ObjectEnabler.java`
#### Snippet
```java
    @Override
    public synchronized List<Integer> getAvailableResourceIds(int instanceId) {
        LwM2mInstanceEnabler instanceEnabler = instances.get(instanceId);
        if (instanceEnabler != null) {
            return instanceEnabler.getAvailableResourceIds(getObjectModel());
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `instances` accessed in synchronized context
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/resource/ObjectEnabler.java`
#### Snippet
```java

    public synchronized LwM2mInstanceEnabler getInstance(int instanceId) {
        return instances.get(instanceId);
    }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `instances` accessed in synchronized context
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/resource/ObjectEnabler.java`
#### Snippet
```java

    public synchronized void addInstance(int instanceId, LwM2mInstanceEnabler newInstance) {
        instances.put(instanceId, newInstance);
        listenInstance(newInstance, instanceId);
        fireInstancesAdded(instanceId);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `instances` accessed in synchronized context
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/resource/ObjectEnabler.java`
#### Snippet
```java
    @Override
    public synchronized List<Integer> getAvailableInstanceIds() {
        List<Integer> ids = new ArrayList<>(instances.keySet());
        Collections.sort(ids);
        return ids;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `coapRequest` accessed in synchronized context
in `leshan-core-cf/src/main/java/org/eclipse/leshan/core/californium/CoapAsyncRequestObserver.java`
#### Snippet
```java
        if (!cancelled)
            if (cleaningTask == null) {
                LOG.trace("Schedule Cleaning Task for {}", coapRequest);
                cleaningTask = executor.schedule(new Runnable() {
                    @Override
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `started` accessed in synchronized context
in `leshan-client-cf/src/main/java/org/eclipse/leshan/client/californium/endpoint/CaliforniumClientEndpointsProvider.java`
#### Snippet
```java
    @Override
    public synchronized void stop() {
        if (!started)
            return;
        started = false;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `started` accessed in synchronized context
in `leshan-client-cf/src/main/java/org/eclipse/leshan/client/californium/endpoint/CaliforniumClientEndpointsProvider.java`
#### Snippet
```java
        if (!started)
            return;
        started = false;

        // If we have no endpoint this means that we never start coap server
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `started` accessed in synchronized context
in `leshan-client-cf/src/main/java/org/eclipse/leshan/client/californium/endpoint/CaliforniumClientEndpointsProvider.java`
#### Snippet
```java
    @Override
    public synchronized void start() {
        if (started)
            return;
        started = true;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `started` accessed in synchronized context
in `leshan-client-cf/src/main/java/org/eclipse/leshan/client/californium/endpoint/CaliforniumClientEndpointsProvider.java`
#### Snippet
```java
        if (started)
            return;
        started = true;

        // we don't have any endpoint so nothing to start
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `started` accessed in synchronized context
in `leshan-client-cf/src/main/java/org/eclipse/leshan/client/californium/endpoint/CaliforniumClientEndpointsProvider.java`
#### Snippet
```java
    @Override
    public synchronized void destroy() {
        if (started)
            started = false;

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `started` accessed in synchronized context
in `leshan-client-cf/src/main/java/org/eclipse/leshan/client/californium/endpoint/CaliforniumClientEndpointsProvider.java`
#### Snippet
```java
    public synchronized void destroy() {
        if (started)
            started = false;

        executor.shutdownNow();
```

## RuleId[id=UtilityClassWithPublicConstructor]
### UtilityClassWithPublicConstructor
Class `RandomStringUtils` has only 'static' members, and a 'public' constructor
in `leshan-core/src/main/java/org/eclipse/leshan/core/util/RandomStringUtils.java`
#### Snippet
```java
 * @version $Id: RandomStringUtils.java 1056988 2011-01-09 17:58:53Z niallp $
 */
public class RandomStringUtils {

    /**
```

### UtilityClassWithPublicConstructor
Class `Validate` has only 'static' members, and a 'public' constructor
in `leshan-core/src/main/java/org/eclipse/leshan/core/util/Validate.java`
#### Snippet
```java
 */
@SuppressWarnings("rawtypes")
public class Validate {
    // Validate has no dependencies on other classes in Commons Lang at present

```

## RuleId[id=UnnecessaryBoxing]
### UnnecessaryBoxing
Redundant boxing, `Long.parseLong()` call can be used instead
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/codec/text/LwM2mNodeTextDecoder.java`
#### Snippet
```java
            // number of seconds since 1970/1/1
            try {
                return new Date(Long.valueOf(value) * 1000L);
            } catch (NumberFormatException e) {
                throw new CodecException("Invalid value [%s] for date resource [%s]", value, path);
```

### UnnecessaryBoxing
Redundant boxing, `Integer.parseInt()` call can be used instead
in `leshan-server-demo/src/main/java/org/eclipse/leshan/server/demo/servlet/ClientServlet.java`
#### Snippet
```java
        } else if ("text/plain".equals(contentType)) {
            String content = IOUtils.toString(req.getInputStream(), req.getCharacterEncoding());
            int rscId = Integer.valueOf(target.substring(target.lastIndexOf("/") + 1));
            return LwM2mSingleResource.newStringResource(rscId, content);
        }
```

### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `leshan-server-demo/src/main/java/org/eclipse/leshan/server/demo/servlet/ClientServlet.java`
#### Snippet
```java
                    boolean replace = true;
                    if (replaceParam != null)
                        replace = Boolean.valueOf(replaceParam);

                    // create & process request
```

## RuleId[id=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `leshan-server-demo/src/main/java/org/eclipse/leshan/server/demo/model/FileLister.java`
#### Snippet
```java
        }

        System.out.println(builder.toString());

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

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/lwm2m/attributes/StringAttributeModel.java`
#### Snippet
```java
    @Override
    public String toCoreLinkValue(LwM2mAttribute<String> attr) {
        String valueEscaped = attr.getValue().replace("\"", "\\\"");
        return "\"" + valueEscaped + "\"";
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/attributes/QuotedStringAttribute.java`
#### Snippet
```java

        String unquotedValue = parser.substring(start, end);
        String valueUnescaped = unquotedValue.replace("\\\"", "\"");
        return valueUnescaped;
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/attributes/QuotedStringAttribute.java`
#### Snippet
```java
    @Override
    public String getCoreLinkValue() {
        String valueEscaped = getValue().replace("\"", "\\\"");
        return "\"" + valueEscaped + "\"";
    }
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `leshan-client-demo/src/main/java/org/eclipse/leshan/client/demo/cli/OscoreSection.java`
#### Snippet
```java
        public Integer convert(String s) {
            HkdfAlgorithm hkdfAlgorithm;
            if (s.matches("-?\\d+")) {
                try {
                    // Indicated as integer
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `leshan-core/src/main/java/org/eclipse/leshan/core/util/StringUtils.java`
#### Snippet
```java
/**
 * <p>
 * Operations on {@link java.lang.String} that are <code>null</code> safe.
 * </p>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `leshan-core/src/main/java/org/eclipse/leshan/core/util/StringUtils.java`
#### Snippet
```java
 * </p>
 *
 * @see java.lang.String
 * @author Apache Software Foundation
 * @author <a href="http://jakarta.apache.org/turbine/">Apache Jakarta Turbine</a>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `leshan-core/src/main/java/org/eclipse/leshan/core/util/StringUtils.java`
#### Snippet
```java
     * </pre>
     *
     * @see java.lang.String#equals(Object)
     * @param str1 the first String, may be null
     * @param str2 the second String, may be null
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `leshan-core/src/main/java/org/eclipse/leshan/core/util/StringUtils.java`
#### Snippet
```java
     * </pre>
     *
     * @see java.lang.String#equalsIgnoreCase(String)
     * @param str1 the first String, may be null
     * @param str2 the second String, may be null
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `leshan-core/src/main/java/org/eclipse/leshan/core/credentials/CredentialsReader.java`
#### Snippet
```java
     * Read credential from resource (in a jar, war, ...)
     *
     * @see java.lang.ClassLoader#getResourceAsStream(String)
     */
    public T readFromResource(String resourcePath) throws IOException, GeneralSecurityException {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/resource/BaseInstanceEnablerFactory.java`
#### Snippet
```java
            return 0;
        } else {
            return java.util.Collections.max(alreadyUsedIdentifier) + 1;
        }
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.californium.core.coap` is unnecessary and can be removed
in `leshan-core-cf/src/main/java/org/eclipse/leshan/core/californium/ResponseCodeUtil.java`
#### Snippet
```java

    public static ResponseCode toLwM2mResponseCode(
            org.eclipse.californium.core.coap.CoAP.ResponseCode coapResponseCode) {
        return ResponseCode.fromCode(toLwM2mCode(coapResponseCode));
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.californium.core.coap` is unnecessary and can be removed
in `leshan-core-cf/src/main/java/org/eclipse/leshan/core/californium/ResponseCodeUtil.java`
#### Snippet
```java
public class ResponseCodeUtil {

    public static int toLwM2mCode(org.eclipse.californium.core.coap.CoAP.ResponseCode coapResponseCode) {
        return coapResponseCode.codeClass * 100 + coapResponseCode.codeDetail;
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.californium.core.coap` is unnecessary and can be removed
in `leshan-core-cf/src/main/java/org/eclipse/leshan/core/californium/ResponseCodeUtil.java`
#### Snippet
```java
    }

    public static org.eclipse.californium.core.coap.CoAP.ResponseCode toCoapResponseCode(
            ResponseCode Lwm2mResponseCode) {
        Validate.notNull(Lwm2mResponseCode);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.californium.core.coap` is unnecessary and can be removed
in `leshan-core-cf/src/main/java/org/eclipse/leshan/core/californium/ResponseCodeUtil.java`
#### Snippet
```java
        Validate.notNull(Lwm2mResponseCode);
        try {
            return org.eclipse.californium.core.coap.CoAP.ResponseCode.valueOf(toCoapCode(Lwm2mResponseCode.getCode()));
        } catch (MessageFormatException e) {
            throw new IllegalArgumentException("Invalid CoAP code for LWM2M response: " + Lwm2mResponseCode);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.californium.core.observe` is unnecessary and can be removed
in `leshan-core-cf/src/main/java/org/eclipse/leshan/core/californium/ObserveUtil.java`
#### Snippet
```java
     * Validate the Californium observation. It is valid if it contains all necessary context for Leshan.
     */
    public static String validateCoapObservation(org.eclipse.californium.core.observe.Observation observation) {
        if (!observation.getRequest().getUserContext().containsKey(CTX_REGID))
            throw new IllegalStateException("missing registrationId info in the request context");
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.californium.core.observe` is unnecessary and can be removed
in `leshan-core-cf/src/main/java/org/eclipse/leshan/core/californium/ObserveUtil.java`
#### Snippet
```java
    }

    public static LwM2mPath extractLwm2mPath(org.eclipse.californium.core.observe.Observation observation) {
        if (observation.getRequest().getCode() == CoAP.Code.GET) {
            return new LwM2mPath(observation.getRequest().getUserContext().get(CTX_LWM2M_PATH));
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.californium.core.observe` is unnecessary and can be removed
in `leshan-core-cf/src/main/java/org/eclipse/leshan/core/californium/ObserveUtil.java`
#### Snippet
```java
    }

    public static String extractRegistrationId(org.eclipse.californium.core.observe.Observation observation) {
        return observation.getRequest().getUserContext().get(CTX_REGID);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.californium.core.observe` is unnecessary and can be removed
in `leshan-core-cf/src/main/java/org/eclipse/leshan/core/californium/ObserveUtil.java`
#### Snippet
```java
    }

    public static String extractEndpoint(org.eclipse.californium.core.observe.Observation observation) {
        return observation.getRequest().getUserContext().get(CTX_ENDPOINT);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.californium.core.observe` is unnecessary and can be removed
in `leshan-core-cf/src/main/java/org/eclipse/leshan/core/californium/ObserveUtil.java`
#### Snippet
```java
    }

    public static List<LwM2mPath> extractLwm2mPaths(org.eclipse.californium.core.observe.Observation observation) {
        if (observation.getRequest().getCode() == CoAP.Code.FETCH) {
            List<LwM2mPath> lwm2mPath = new ArrayList<>();
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.californium.scandium.dtls` is unnecessary, and can be replaced with an import
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/LwM2mPskStore.java`
#### Snippet
```java

    @Override
    public void setResultHandler(org.eclipse.californium.scandium.dtls.HandshakeResultHandler resultHandler) {
        // we don't use async mode.
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.californium.scandium.dtls` is unnecessary, and can be replaced with an import
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/bootstrap/LwM2mBootstrapPskStore.java`
#### Snippet
```java

    @Override
    public void setResultHandler(org.eclipse.californium.scandium.dtls.HandshakeResultHandler resultHandler) {
        // we don't use async mode.
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.californium.core.coap` is unnecessary, and can be replaced with an import
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/bootstrap/request/LwM2mResponseBuilder.java`
#### Snippet
```java
            lwM2mresponse = new BootstrapDeleteResponse(toLwM2mResponseCode(coapResponse.getCode()),
                    coapResponse.getPayloadString(), coapResponse);
        } else if (coapResponse.getCode() == org.eclipse.californium.core.coap.CoAP.ResponseCode.DELETED) {
            // handle success response:
            lwM2mresponse = new BootstrapDeleteResponse(ResponseCode.DELETED, null, coapResponse);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.californium.core.coap` is unnecessary, and can be replaced with an import
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/bootstrap/request/LwM2mResponseBuilder.java`
#### Snippet
```java

    private boolean isResponseCodeChanged() {
        return coapResponse.getCode() == org.eclipse.californium.core.coap.CoAP.ResponseCode.CHANGED;
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.californium.core.coap` is unnecessary, and can be replaced with an import
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/bootstrap/request/LwM2mResponseBuilder.java`
#### Snippet
```java

    private boolean isResponseCodeContent() {
        return coapResponse.getCode() == org.eclipse.californium.core.coap.CoAP.ResponseCode.CONTENT;
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.californium.core.coap` is unnecessary, and can be replaced with an import
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/request/LwM2mResponseBuilder.java`
#### Snippet
```java
            lwM2mresponse = new BootstrapDeleteResponse(toLwM2mResponseCode(coapResponse.getCode()),
                    coapResponse.getPayloadString(), coapResponse);
        } else if (coapResponse.getCode() == org.eclipse.californium.core.coap.CoAP.ResponseCode.DELETED) {
            // handle success response:
            lwM2mresponse = new BootstrapDeleteResponse(ResponseCode.DELETED, null, coapResponse);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.californium.core.coap` is unnecessary, and can be replaced with an import
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/request/LwM2mResponseBuilder.java`
#### Snippet
```java

    private boolean isResponseCodeContent() {
        return coapResponse.getCode() == org.eclipse.californium.core.coap.CoAP.ResponseCode.CONTENT;
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.californium.core.coap` is unnecessary, and can be replaced with an import
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/request/LwM2mResponseBuilder.java`
#### Snippet
```java

    private boolean isResponseCodeChanged() {
        return coapResponse.getCode() == org.eclipse.californium.core.coap.CoAP.ResponseCode.CHANGED;
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.californium.core.coap` is unnecessary, and can be replaced with an import
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/request/LwM2mResponseBuilder.java`
#### Snippet
```java
            lwM2mresponse = new DeleteResponse(toLwM2mResponseCode(coapResponse.getCode()),
                    coapResponse.getPayloadString(), coapResponse);
        } else if (coapResponse.getCode() == org.eclipse.californium.core.coap.CoAP.ResponseCode.DELETED) {
            // handle success response:
            lwM2mresponse = new DeleteResponse(ResponseCode.DELETED, null, coapResponse);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.californium.core.coap` is unnecessary, and can be replaced with an import
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/request/LwM2mResponseBuilder.java`
#### Snippet
```java
            lwM2mresponse = new CreateResponse(toLwM2mResponseCode(coapResponse.getCode()), null,
                    coapResponse.getPayloadString(), coapResponse);
        } else if (coapResponse.getCode() == org.eclipse.californium.core.coap.CoAP.ResponseCode.CREATED) {
            // handle success response:
            lwM2mresponse = new CreateResponse(ResponseCode.CREATED,
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.californium.scandium.config` is unnecessary and can be removed
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/bootstrap/endpoint/coaps/CoapsBootstrapServerEndpointFactory.java`
#### Snippet
```java

    public CoapsBootstrapServerEndpointFactory(URI uri, String loggingTagPrefix, Configuration configuration,
            Consumer<org.eclipse.californium.scandium.config.DtlsConnectorConfig.Builder> dtlsConnectorConfigInitializer,
            Consumer<Builder> coapEndpointConfigInitializer) {
        EndpointUriUtil.validateURI(uri);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.californium.core.coap` is unnecessary, and can be replaced with an import
in `leshan-client-cf/src/main/java/org/eclipse/leshan/client/californium/request/LwM2mResponseBuilder.java`
#### Snippet
```java
            lwM2mresponse = new UpdateResponse(toLwM2mResponseCode(coapResponse.getCode()),
                    coapResponse.getPayloadString());
        } else if (coapResponse.getCode() == org.eclipse.californium.core.coap.CoAP.ResponseCode.CHANGED) {
            // handle success response:
            lwM2mresponse = UpdateResponse.success();
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.californium.core.coap` is unnecessary, and can be replaced with an import
in `leshan-client-cf/src/main/java/org/eclipse/leshan/client/californium/request/LwM2mResponseBuilder.java`
#### Snippet
```java
            lwM2mresponse = new RegisterResponse(toLwM2mResponseCode(coapResponse.getCode()), null,
                    coapResponse.getPayloadString());
        } else if (coapResponse.getCode() == org.eclipse.californium.core.coap.CoAP.ResponseCode.CREATED) {
            // handle success response:
            lwM2mresponse = RegisterResponse.success(coapResponse.getOptions().getLocationString());
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.californium.core.coap` is unnecessary, and can be replaced with an import
in `leshan-client-cf/src/main/java/org/eclipse/leshan/client/californium/request/LwM2mResponseBuilder.java`
#### Snippet
```java
            lwM2mresponse = new DeregisterResponse(toLwM2mResponseCode(coapResponse.getCode()),
                    coapResponse.getPayloadString());
        } else if (coapResponse.getCode() == org.eclipse.californium.core.coap.CoAP.ResponseCode.DELETED) {
            // handle success response:
            lwM2mresponse = DeregisterResponse.success();
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.californium.core.coap` is unnecessary, and can be replaced with an import
in `leshan-client-cf/src/main/java/org/eclipse/leshan/client/californium/request/LwM2mResponseBuilder.java`
#### Snippet
```java
            lwM2mresponse = new BootstrapResponse(toLwM2mResponseCode(coapResponse.getCode()),
                    coapResponse.getPayloadString());
        } else if (coapResponse.getCode() == org.eclipse.californium.core.coap.CoAP.ResponseCode.CHANGED) {
            // handle success response:
            lwM2mresponse = BootstrapResponse.success();
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.californium.core.coap` is unnecessary, and can be replaced with an import
in `leshan-client-cf/src/main/java/org/eclipse/leshan/client/californium/request/LwM2mResponseBuilder.java`
#### Snippet
```java
            lwM2mresponse = new SendResponse(toLwM2mResponseCode(coapResponse.getCode()),
                    coapResponse.getPayloadString());
        } else if (coapResponse.getCode() == org.eclipse.californium.core.coap.CoAP.ResponseCode.CHANGED) {
            // handle success response:
            lwM2mresponse = SendResponse.success();
```

## RuleId[id=ThrowablePrintStackTrace]
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `leshan-core-demo/src/main/java/org/eclipse/leshan/core/demo/cli/interactive/TerminalAppender.java`
#### Snippet
```java
                console.resetPromptLine("", "", -1);
            } catch (IOException e) {
                e.printStackTrace();
            }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `leshan-core-demo/src/main/java/org/eclipse/leshan/core/demo/cli/interactive/TerminalAppender.java`
#### Snippet
```java
                console.resetPromptLine(prompt, stashed, -1);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `leshan-bsserver-demo/src/main/java/org/eclipse/leshan/server/bootstrap/demo/servlet/BootstrapServlet.java`
#### Snippet
```java
            resp.getOutputStream().write(mapper.writeValueAsString(bsStore.getAll()).getBytes(StandardCharsets.UTF_8));
        } catch (Exception e) {
            e.printStackTrace();
        }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `leshan-bsserver-demo/src/main/java/org/eclipse/leshan/server/bootstrap/demo/servlet/EventServlet.java`
#### Snippet
```java
                emitter.event(event, data);
            } catch (IOException e) {
                e.printStackTrace();
                onClose();
            }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `leshan-server-demo/src/main/java/org/eclipse/leshan/server/demo/servlet/EventServlet.java`
#### Snippet
```java
                emitter.event(event, data);
            } catch (IOException e) {
                e.printStackTrace();
                onClose();
            }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `leshan-client-cf/src/main/java/org/eclipse/leshan/client/californium/endpoint/CaliforniumClientEndpoint.java`
#### Snippet
```java
        } catch (URISyntaxException e) {
            // TODO TL : handle this properly
            e.printStackTrace();
            throw new IllegalStateException(e);
        }
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

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `AttributeModel()` of an abstract class should not be declared 'public'
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/attributes/AttributeModel.java`
#### Snippet
```java
    private String name;

    public AttributeModel(String name) {
        this.name = name;
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `BaseAttribute()` of an abstract class should not be declared 'public'
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/attributes/BaseAttribute.java`
#### Snippet
```java
    private Object value;

    public BaseAttribute(String name, Object value, boolean validate) {
        this.name = name;
        this.value = value;
```

### NonProtectedConstructorInAbstractClass
Constructor `StringParser()` of an abstract class should not be declared 'public'
in `leshan-core/src/main/java/org/eclipse/leshan/core/parser/StringParser.java`
#### Snippet
```java
    private int cursor;

    public StringParser(String stringToParse) {
        Validate.notNull(stringToParse);
        strToParse = stringToParse;
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractLwM2mRequest()` of an abstract class should not be declared 'public'
in `leshan-core/src/main/java/org/eclipse/leshan/core/request/AbstractLwM2mRequest.java`
#### Snippet
```java
    private final Object coapRequest;

    public AbstractLwM2mRequest(Object coapRequest) {
        this.coapRequest = coapRequest;
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractLwM2mResponse()` of an abstract class should not be declared 'public'
in `leshan-core/src/main/java/org/eclipse/leshan/core/response/AbstractLwM2mResponse.java`
#### Snippet
```java
    private final Object coapResponse;

    public AbstractLwM2mResponse(ResponseCode code, String errorMessage, Object coapResponse) {
        if (code == null)
            throw new InvalidResponseException("response code is mandatory");
```

### NonProtectedConstructorInAbstractClass
Constructor `Observation()` of an abstract class should not be declared 'public'
in `leshan-core/src/main/java/org/eclipse/leshan/core/observation/Observation.java`
#### Snippet
```java
     * @param context additional information relative to this observation.
     */
    public Observation(ObservationIdentifier id, String registrationId, Map<String, String> context,
            Map<String, String> protocolData) {
        this.id = id;
```

### NonProtectedConstructorInAbstractClass
Constructor `BaseObjectEnabler()` of an abstract class should not be declared 'public'
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/resource/BaseObjectEnabler.java`
#### Snippet
```java
    private LwM2mClient lwm2mClient;

    public BaseObjectEnabler(int id, ObjectModel objectModel) {
        this.id = id;
        this.objectModel = objectModel;
```

### NonProtectedConstructorInAbstractClass
Constructor `SafeResponseCallback()` of an abstract class should not be declared 'public'
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/bootstrap/DefaultBootstrapHandler.java`
#### Snippet
```java
        private final BootstrapSession session;

        public SafeResponseCallback(BootstrapSession session) {
            this.session = session;
        }
```

### NonProtectedConstructorInAbstractClass
Constructor `SafeErrorCallback()` of an abstract class should not be declared 'public'
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/bootstrap/DefaultBootstrapHandler.java`
#### Snippet
```java
        private final BootstrapSession session;

        public SafeErrorCallback(BootstrapSession session) {
            this.session = session;
        }
```

### NonProtectedConstructorInAbstractClass
Constructor `SyncRequestObserver()` of an abstract class should not be declared 'public'
in `leshan-core-cf/src/main/java/org/eclipse/leshan/core/californium/SyncRequestObserver.java`
#### Snippet
```java
public abstract class SyncRequestObserver<T extends LwM2mResponse> extends CoapSyncRequestObserver {

    public SyncRequestObserver(Request coapRequest, long timeout, ExceptionTranslator exceptionTranslator) {
        super(coapRequest, timeout, exceptionTranslator);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractRequestObserver()` of an abstract class should not be declared 'public'
in `leshan-core-cf/src/main/java/org/eclipse/leshan/core/californium/AbstractRequestObserver.java`
#### Snippet
```java
    Request coapRequest;

    public AbstractRequestObserver(Request coapRequest) {
        this.coapRequest = coapRequest;
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AsyncRequestObserver()` of an abstract class should not be declared 'public'
in `leshan-core-cf/src/main/java/org/eclipse/leshan/core/californium/AsyncRequestObserver.java`
#### Snippet
```java
     * @param executor used to scheduled timeout tasks.
     */
    public AsyncRequestObserver(Request coapRequest, final ResponseCallback<T> responseCallback,
            final ErrorCallback errorCallback, long timeoutInMs, ScheduledExecutorService executor,
            ExceptionTranslator exceptionTranslator) {
```

## RuleId[id=Anonymous2MethodRef]
### Anonymous2MethodRef
Anonymous new ResponseCallback() can be replaced with method reference
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/request/DefaultDownlinkRequestSender.java`
#### Snippet
```java

        // Send requests asynchronously
        endpoint.send(new ClientProfile(destination, model), request, new ResponseCallback<T>() {
            @Override
            public void onResponse(T response) {
```

### Anonymous2MethodRef
Anonymous new BootstrapHandlerFactory() can be replaced with method reference
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/bootstrap/LeshanBootstrapServerBuilder.java`
#### Snippet
```java
    public LeshanBootstrapServer build() {
        if (bootstrapHandlerFactory == null)
            bootstrapHandlerFactory = new BootstrapHandlerFactory() {
                @Override
                public BootstrapHandler create(BootstrapDownlinkRequestSender sender,
```

### Anonymous2MethodRef
Anonymous new ResponseCallback() can be replaced with method reference
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/bootstrap/request/DefaultBootstrapDownlinkRequestSender.java`
#### Snippet
```java

        // Send requests asynchronously
        endpoint.send(destination, request, new ResponseCallback<T>() {
            @Override
            public void onResponse(T response) {
```

### Anonymous2MethodRef
Anonymous new Runnable() can be replaced with method reference
in `leshan-client-demo/src/main/java/org/eclipse/leshan/client/demo/RandomTemperatureSensor.java`
#### Snippet
```java
    public RandomTemperatureSensor() {
        this.scheduler = Executors.newSingleThreadScheduledExecutor(new NamedThreadFactory("Temperature Sensor"));
        scheduler.scheduleAtFixedRate(new Runnable() {

            @Override
```

## RuleId[id=Java8MapApi]
### Java8MapApi
Can be replaced with single 'Map.computeIfAbsent' method call
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/codec/json/LwM2mNodeJsonDecoder.java`
#### Snippet
```java
            // Get jsonArray for this instance
            Collection<JsonArrayEntry> jsonArray = result.get(nodePath.getObjectInstanceId());
            if (jsonArray == null) {
                jsonArray = new ArrayList<>();
                result.put(nodePath.getObjectInstanceId(), jsonArray);
```

### Java8MapApi
Can be replaced with single 'Map.computeIfAbsent' method call
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/codec/json/LwM2mNodeJsonDecoder.java`
#### Snippet
```java
                        nodePath.getResourceId());
                Map<Integer, JsonArrayEntry> multiResource = multiResourceMap.get(resourcePath);
                if (multiResource == null) {
                    multiResource = new HashMap<>();
                    multiResourceMap.put(resourcePath, multiResource);
```

### Java8MapApi
Can be replaced with single 'Map.computeIfAbsent' method call
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/codec/json/LwM2mNodeJsonDecoder.java`
#### Snippet
```java
            // Get jsonArray for this time-stamp
            Collection<JsonArrayEntry> jsonArray = result.get(time);
            if (jsonArray == null) {
                jsonArray = new ArrayList<>();
                result.put(time, jsonArray);
```

### Java8MapApi
Can be replaced with single 'Map.computeIfAbsent' method call
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/codec/senml/LwM2mNodeSenMLDecoder.java`
#### Snippet
```java
            // Get record list for this time-stamp
            Collection<LwM2mResolvedSenMLRecord> recordList = result.get(resolvedRecord.getTimeStamp());
            if (recordList == null) {
                recordList = new ArrayList<>();
                result.put(resolvedRecord.getTimeStamp(), recordList);
```

### Java8MapApi
Can be replaced with single 'Map.computeIfAbsent' method call
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/codec/senml/LwM2mNodeSenMLDecoder.java`
#### Snippet
```java
                        nodePath.getResourceId());
                Map<Integer, SenMLRecord> multiResource = multiResourceMap.get(resourcePath);
                if (multiResource == null) {
                    multiResource = new HashMap<>();
                    multiResourceMap.put(resourcePath, multiResource);
```

### Java8MapApi
Can be replaced with single 'Map.computeIfAbsent' method call
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/codec/senml/LwM2mNodeSenMLDecoder.java`
#### Snippet
```java
            // Get SenML records for this instance
            Collection<LwM2mResolvedSenMLRecord> recordForInstance = result.get(record.getPath().getObjectInstanceId());
            if (recordForInstance == null) {
                recordForInstance = new ArrayList<>();
                result.put(record.getPath().getObjectInstanceId(), recordForInstance);
```

### Java8MapApi
Can be replaced with single 'Map.computeIfAbsent' method call
in `leshan-server-demo/src/main/java/org/eclipse/leshan/server/demo/servlet/log/CoapMessage.java`
#### Snippet
```java
                    String strOption = getOption(opt.getNumber());
                    List<String> values = optMap.get(strOption);
                    if (values == null) {
                        values = new ArrayList<>();
                        optMap.put(strOption, values);
```

### Java8MapApi
Can be replaced with single 'Map.computeIfAbsent' method call
in `leshan-server-demo/src/main/java/org/eclipse/leshan/server/demo/servlet/json/JacksonRegistrationSerializer.java`
#### Snippet
```java
            Set<Integer> instancesList = result.get(path.getObjectId());
            // add list if does not already exist
            if (instancesList == null) {
                instancesList = new TreeSet<Integer>();
                result.put(path.getObjectId(), instancesList);
```

## RuleId[id=Convert2Lambda]
### Convert2Lambda
Anonymous new Comparator() can be replaced with lambda
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/codec/json/LwM2mNodeJsonDecoder.java`
#### Snippet
```java
     */
    private SortedMap<BigDecimal, Collection<JsonArrayEntry>> groupJsonEntryByTimestamp(JsonRootObject jsonObject) {
        SortedMap<BigDecimal, Collection<JsonArrayEntry>> result = new TreeMap<>(new Comparator<BigDecimal>() {
            @Override
            public int compare(BigDecimal o1, BigDecimal o2) {
```

### Convert2Lambda
Anonymous new Comparator() can be replaced with lambda
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/codec/senml/LwM2mNodeSenMLDecoder.java`
#### Snippet
```java
            List<SenMLRecord> records, LwM2mPath requestPath) throws SenMLException {
        SortedMap<BigDecimal, Collection<LwM2mResolvedSenMLRecord>> result = new TreeMap<>(
                new Comparator<BigDecimal>() {
                    @Override
                    public int compare(BigDecimal o1, BigDecimal o2) {
```

### Convert2Lambda
Anonymous new Comparator() can be replaced with lambda
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/util/LinkFormatHelper.java`
#### Snippet
```java
        // sort object
        List<LwM2mObjectEnabler> objEnablerList = new ArrayList<>(objectEnablers);
        Collections.sort(objEnablerList, new Comparator<LwM2mObjectEnabler>() {
            @Override
            public int compare(LwM2mObjectEnabler o1, LwM2mObjectEnabler o2) {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/send/SendHandler.java`
#### Snippet
```java

    public SendableResponse<SendResponse> handleSend(final Registration registration, final SendRequest request) {
        SendableResponse<SendResponse> response = new SendableResponse<>(SendResponse.success(), new Runnable() {
            @Override
            public void run() {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/bootstrap/BootstrapHandler.java`
#### Snippet
```java
            }

            Runnable whenSent = new Runnable() {
                @Override
                public void run() {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/queue/PresenceServiceImpl.java`
#### Snippet
```java
            int clientAwakeTime = awakeTimeProvider.getClientAwakeTime(reg);
            if (clientAwakeTime != 0) {
                timerFuture.set(clientTimersExecutor.schedule(new Runnable() {
                    @Override
                    public void run() {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/engine/DefaultRegistrationEngine.java`
#### Snippet
```java
                cancelBootstrapTask();

                schedExecutor.submit(new Runnable() {

                    @Override
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/bootstrap/DefaultBootstrapHandler.java`
#### Snippet
```java

            // Start bootstrap once response is sent.
            Runnable onSent = new Runnable() {
                @Override
                public void run() {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/registration/RegistrationHandler.java`
#### Snippet
```java
            LOG.debug("Deregistered client: {}", deregistration.getRegistration());
            // Create callback to notify new de-registration
            Runnable whenSent = new Runnable() {
                @Override
                public void run() {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/registration/RegistrationHandler.java`
#### Snippet
```java
            LOG.debug("Updated registration {} by {}", updatedRegistration, update);
            // Create callback to notify registration update
            Runnable whenSent = new Runnable() {
                @Override
                public void run() {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/registration/RegistrationHandler.java`
#### Snippet
```java
        // Create callback to notify new registration and de-registration
        LOG.debug("New registration: {}", approvedRegistration);
        Runnable whenSent = new Runnable() {
            @Override
            public void run() {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `leshan-client-demo/src/main/java/org/eclipse/leshan/client/demo/RandomTemperatureSensor.java`
#### Snippet
```java
    public RandomTemperatureSensor() {
        this.scheduler = Executors.newSingleThreadScheduledExecutor(new NamedThreadFactory("Temperature Sensor"));
        scheduler.scheduleAtFixedRate(new Runnable() {

            @Override
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `leshan-core-cf/src/main/java/org/eclipse/leshan/core/californium/CoapAsyncRequestObserver.java`
#### Snippet
```java
            if (cleaningTask == null) {
                LOG.trace("Schedule Cleaning Task for {}", coapRequest);
                cleaningTask = executor.schedule(new Runnable() {
                    @Override
                    public void run() {
```

### Convert2Lambda
Anonymous new Comparator() can be replaced with lambda
in `leshan-server-demo/src/main/java/org/eclipse/leshan/server/demo/servlet/ObjectSpecServlet.java`
#### Snippet
```java
            resp.setContentType("application/json");
            List<ObjectModel> objectModels = new ArrayList<>(model.getObjectModels());
            Collections.sort(objectModels, new Comparator<ObjectModel>() {
                @Override
                public int compare(ObjectModel o1, ObjectModel o2) {
```

### Convert2Lambda
Anonymous new Comparator() can be replaced with lambda
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/registration/Registration.java`
#### Snippet
```java
        Link[] res = Arrays.copyOf(objectLinks, objectLinks.length);

        Arrays.sort(res, new Comparator<Link>() {

            /* sort by path */
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `rootpath`
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/lwm2m/DefaultLwM2mLinkParser.java`
#### Snippet
```java
        // define default lwm2m root path
        if (rootpath == null) {
            rootpath = "/";
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `path`
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/LwM2mPath.java`
#### Snippet
```java
        Validate.notNull(path);
        if (path.startsWith("/")) {
            path = path.substring(1);
        }
        if (path.endsWith("/")) {
```

### AssignmentToMethodParameter
Assignment to method parameter `path`
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/LwM2mPath.java`
#### Snippet
```java
        }
        if (path.endsWith("/")) {
            path = path.substring(0, path.length() - 1);
        }
        String[] p = path.split("/");
```

### AssignmentToMethodParameter
Assignment to method parameter `tlvs`
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/codec/tlv/LwM2mNodeTlvDecoder.java`
#### Snippet
```java
                            path, tlvs[0].getIdentifier());
                }
                tlvs = tlvs[0].getChildren();
            }

```

### AssignmentToMethodParameter
Assignment to method parameter `end`
in `leshan-core/src/main/java/org/eclipse/leshan/core/util/RandomStringUtils.java`
#### Snippet
```java
        }
        if ((start == 0) && (end == 0)) {
            end = 'z' + 1;
            start = ' ';
            if (!letters && !numbers) {
```

### AssignmentToMethodParameter
Assignment to method parameter `start`
in `leshan-core/src/main/java/org/eclipse/leshan/core/util/RandomStringUtils.java`
#### Snippet
```java
        if ((start == 0) && (end == 0)) {
            end = 'z' + 1;
            start = ' ';
            if (!letters && !numbers) {
                start = 0;
```

### AssignmentToMethodParameter
Assignment to method parameter `start`
in `leshan-core/src/main/java/org/eclipse/leshan/core/util/RandomStringUtils.java`
#### Snippet
```java
            start = ' ';
            if (!letters && !numbers) {
                start = 0;
                end = Integer.MAX_VALUE;
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `end`
in `leshan-core/src/main/java/org/eclipse/leshan/core/util/RandomStringUtils.java`
#### Snippet
```java
            if (!letters && !numbers) {
                start = 0;
                end = Integer.MAX_VALUE;
            }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `count`
in `leshan-core/src/main/java/org/eclipse/leshan/core/util/RandomStringUtils.java`
#### Snippet
```java
        int gap = end - start;

        while (count-- != 0) {
            char ch;
            if (chars == null) {
```

### AssignmentToMethodParameter
Assignment to method parameter `count`
in `leshan-core/src/main/java/org/eclipse/leshan/core/util/RandomStringUtils.java`
#### Snippet
```java
                if (ch >= 56320 && ch <= 57343) {
                    if (count == 0) {
                        count++;
                    } else {
                        // low surrogate, insert high surrogate after putting it in
```

### AssignmentToMethodParameter
Assignment to method parameter `count`
in `leshan-core/src/main/java/org/eclipse/leshan/core/util/RandomStringUtils.java`
#### Snippet
```java
                        // low surrogate, insert high surrogate after putting it in
                        buffer[count] = ch;
                        count--;
                        buffer[count] = (char) (55296 + random.nextInt(128));
                    }
```

### AssignmentToMethodParameter
Assignment to method parameter `count`
in `leshan-core/src/main/java/org/eclipse/leshan/core/util/RandomStringUtils.java`
#### Snippet
```java
                } else if (ch >= 55296 && ch <= 56191) {
                    if (count == 0) {
                        count++;
                    } else {
                        // high surrogate, insert low surrogate before putting it in
```

### AssignmentToMethodParameter
Assignment to method parameter `count`
in `leshan-core/src/main/java/org/eclipse/leshan/core/util/RandomStringUtils.java`
#### Snippet
```java
                        // high surrogate, insert low surrogate before putting it in
                        buffer[count] = (char) (56320 + random.nextInt(128));
                        count--;
                        buffer[count] = ch;
                    }
```

### AssignmentToMethodParameter
Assignment to method parameter `count`
in `leshan-core/src/main/java/org/eclipse/leshan/core/util/RandomStringUtils.java`
#### Snippet
```java
                } else if (ch >= 56192 && ch <= 56319) {
                    // private high surrogate, no effing clue, so skip it
                    count++;
                } else {
                    buffer[count] = ch;
```

### AssignmentToMethodParameter
Assignment to method parameter `count`
in `leshan-core/src/main/java/org/eclipse/leshan/core/util/RandomStringUtils.java`
#### Snippet
```java
                }
            } else {
                count++;
            }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `x`
in `leshan-core/src/main/java/org/eclipse/leshan/core/util/datatype/ULong.java`
#### Snippet
```java

    public static int compare(long x, long y) {
        x += Long.MIN_VALUE;
        y += Long.MIN_VALUE;
        return (x < y) ? -1 : ((x == y) ? 0 : 1);
```

### AssignmentToMethodParameter
Assignment to method parameter `y`
in `leshan-core/src/main/java/org/eclipse/leshan/core/util/datatype/ULong.java`
#### Snippet
```java
    public static int compare(long x, long y) {
        x += Long.MIN_VALUE;
        y += Long.MIN_VALUE;
        return (x < y) ? -1 : ((x == y) ? 0 : 1);
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `streamName`
in `leshan-core/src/main/java/org/eclipse/leshan/core/model/DDFFileParser.java`
#### Snippet
```java
    public List<ObjectModel> parse(InputStream inputStream, String streamName)
            throws InvalidDDFFileException, IOException {
        streamName = streamName == null ? "" : streamName;

        LOG.debug("Parsing DDF file {}", streamName);
```

### AssignmentToMethodParameter
Assignment to method parameter `id`
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/resource/BaseInstanceEnablerFactory.java`
#### Snippet
```java
        // generate a new id if needed
        if (id == null) {
            id = getNewInstanceId(alreadyUsedIdentifier);
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `registrationID`
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/engine/DefaultRegistrationEngine.java`
#### Snippet
```java
            UpdateResponse response = sender.send(server, request, requestTimeoutInMs);
            if (response == null) {
                registrationID = null;
                LOG.info("Registration update failed: Timeout.");
                if (observer != null) {
```

### AssignmentToMethodParameter
Assignment to method parameter `registrationID`
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/engine/DefaultRegistrationEngine.java`
#### Snippet
```java
            DeregisterResponse response = sender.send(server, request, deregistrationTimeoutInMs);
            if (response == null) {
                registrationID = null;
                LOG.info("Deregistration failed: Timeout.");
                if (observer != null) {
```

### AssignmentToMethodParameter
Assignment to method parameter `registrationID`
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/engine/DefaultRegistrationEngine.java`
#### Snippet
```java
            } else if (response.isSuccess() || response.getCode() == ResponseCode.NOT_FOUND) {
                registeredServers.remove(registrationID);
                registrationID = null;
                cancelUpdateTask(true);
                LOG.info("De-register response {} {}.", response.getCode(), response.getErrorMessage());
```

### AssignmentToMethodParameter
Assignment to method parameter `cursor`
in `leshan-server-redis/src/main/java/org/eclipse/leshan/server/redis/RedisRegistrationStore.java`
#### Snippet
```java
                    }

                    cursor = sr.getCursor();
                } while (!"0".equals(cursor) && scanResult.isEmpty());

```

## RuleId[id=SynchronizationOnLocalVariableOrMethodParameter]
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

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `leshan-core-demo/src/main/java/org/eclipse/leshan/core/demo/cli/converters/CIDConverter.java`
#### Snippet
```java
    public Integer convert(String cid) {
        if ("off".equals(cid)) {
            return null;
        } else if ("on".equals(cid)) {
            return onValue;
```

### ReturnNull
Return of `null`
in `leshan-core-demo/src/main/java/org/eclipse/leshan/core/demo/cli/converters/CIDConverter.java`
#### Snippet
```java
        } else {
            Integer res = Integer.parseInt(cid);
            return res < 0 ? null : res;
        }
    }
```

### ReturnNull
Return of `null`
in `leshan-core-demo/src/main/java/org/eclipse/leshan/core/demo/LeshanProperties.java`
#### Snippet
```java
        String timestamp = prop.getProperty(TIMESTAMP);
        if (!hasRealValue(timestamp)) {
            return null;
        } else {
            return Long.parseLong(timestamp);
```

### ReturnNull
Return of `null`
in `leshan-bsserver-demo/src/main/java/org/eclipse/leshan/server/bootstrap/demo/json/EnumSetBindingModeDeserializer.java`
#### Snippet
```java
            return BindingMode.parse(((TextNode) treeNode).asText());
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `leshan-bsserver-demo/src/main/java/org/eclipse/leshan/server/bootstrap/demo/json/EnumSetDeserializer.java`
#### Snippet
```java
    @Override
    public EnumSet<BindingMode> deserialize(JsonParser p, DeserializationContext ctxt) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `leshan-core/src/main/java/org/eclipse/leshan/core/ResponseCode.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `leshan-core/src/main/java/org/eclipse/leshan/core/json/JsonArrayEntry.java`
#### Snippet
```java
            return stringValue;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `leshan-core/src/main/java/org/eclipse/leshan/core/json/JsonArrayEntry.java`
#### Snippet
```java
            return Type.STRING;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `leshan-core/src/main/java/org/eclipse/leshan/core/LwM2m.java`
#### Snippet
```java
                }
            }
            return null;
        }

```

### ReturnNull
Return of `null`
in `leshan-core/src/main/java/org/eclipse/leshan/core/json/jackson/JsonRootObjectSerDes.java`
#### Snippet
```java
    public JsonRootObject deserialize(JsonNode jsonNode) throws JsonException {
        if (jsonNode == null)
            return null;

        JsonRootObject jro = new JsonRootObject();
```

### ReturnNull
Return of `null`
in `leshan-core/src/main/java/org/eclipse/leshan/core/json/jackson/JsonArrayEntrySerDes.java`
#### Snippet
```java
    public JsonArrayEntry deserialize(JsonNode o) throws JsonException {
        if (o == null)
            return null;

        JsonArrayEntry jae = new JsonArrayEntry();
```

### ReturnNull
Return of `null`
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/lwm2m/attributes/LwM2mAttributeModel.java`
#### Snippet
```java
                    getAssignationLevels(), path);
        }
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/lwm2m/attributes/LwM2mAttributeModel.java`
#### Snippet
```java
    public String getInvalidValueCause(T value) {
        // do nothing by default
        return null;
    }

```

### ReturnNull
Return of `null`
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/lwm2m/attributes/LongAttributeModel.java`
#### Snippet
```java
            parser.raiseException(e, "%s value '%s' is not a valid long in %s", getName(), strValue,
                    parser.getStringToParse());
            return null;
        } catch (IllegalArgumentException e) {
            parser.raiseException(e, "%s value '%s' is not a valid in %s", getName(), strValue,
```

### ReturnNull
Return of `null`
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/lwm2m/attributes/LongAttributeModel.java`
#### Snippet
```java
            parser.raiseException(e, "%s value '%s' is not a valid in %s", getName(), strValue,
                    parser.getStringToParse());
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/lwm2m/attributes/DefaultLwM2mAttributeParser.java`
#### Snippet
```java
    public Collection<LwM2mAttribute<?>> parseUriQuery(String uriQueries) throws InvalidAttributeException {
        if (uriQueries == null)
            return null;

        String[] queriesArray = uriQueries.split("&");
```

### ReturnNull
Return of `null`
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/lwm2m/attributes/DoubleAttributeModel.java`
#### Snippet
```java
            parser.raiseException(e, "%s value '%s' is not a valid Double in %s", getName(), strValue,
                    parser.getStringToParse());
            return null;
        } catch (IllegalArgumentException e) {
            parser.raiseException(e, "%s value '%s' is not a valid in %s", getName(), strValue,
```

### ReturnNull
Return of `null`
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/lwm2m/attributes/DoubleAttributeModel.java`
#### Snippet
```java
            parser.raiseException(e, "%s value '%s' is not a valid in %s", getName(), strValue,
                    parser.getStringToParse());
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/DefaultLinkParser.java`
#### Snippet
```java
            } catch (InvalidAttributeException e) {
                parser.raiseException(e, "Invalid Link %s :", parser.getStringToParse());
                return null;
            }
        } else {
```

### ReturnNull
Return of `null`
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/lwm2m/attributes/StringAttributeModel.java`
#### Snippet
```java
            parser.raiseException(e, "%s value '%s' is not a valid in %s", getName(), strValue,
                    parser.getStringToParse());
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/attributes/ValuelessAttribute.java`
#### Snippet
```java
    @Override
    public String getCoreLinkValue() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/attributes/ValuelessAttribute.java`
#### Snippet
```java
    @Override
    public Object getValue() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/lwm2m/attributes/LwM2mAttributes.java`
#### Snippet
```java
                }
            }
            return null;
        };
    };
```

### ReturnNull
Return of `null`
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/lwm2m/attributes/LwM2mAttributes.java`
#### Snippet
```java
                }
            }
            return null;
        };
    };
```

### ReturnNull
Return of `null`
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/lwm2m/attributes/LwM2mAttributes.java`
#### Snippet
```java
                }
            }
            return null;
        };
    };
```

### ReturnNull
Return of `null`
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/lwm2m/attributes/LwM2mAttributes.java`
#### Snippet
```java
                }
            }
            return null;
        };
    };
```

### ReturnNull
Return of `null`
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/lwm2m/attributes/LwM2mAttributes.java`
#### Snippet
```java
                }
            }
            return null;
        };
    };
```

### ReturnNull
Return of `null`
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/lwm2m/attributes/LwM2mAttributes.java`
#### Snippet
```java
                return "'Server URI' attribute is only applicable to Security(ID:0)";
            }
            return null;
        };
    };
```

### ReturnNull
Return of `null`
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/lwm2m/attributes/LwM2mAttributes.java`
#### Snippet
```java
                return "'Dimension' attribute value must be between [0-255]";
            }
            return null;
        };

```

### ReturnNull
Return of `null`
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/lwm2m/attributes/LwM2mAttributes.java`
#### Snippet
```java
                return "'Short Server ID' attribute value must be between [1-65534]";
            }
            return null;
        };

```

### ReturnNull
Return of `null`
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/lwm2m/attributes/LwM2mAttributes.java`
#### Snippet
```java
                }
            }
            return null;
        };
    };
```

### ReturnNull
Return of `null`
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/lwm2m/attributes/LwM2mAttributes.java`
#### Snippet
```java
                }
            }
            return null;
        };
    };
```

### ReturnNull
Return of `null`
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/lwm2m/attributes/LwM2mAttributes.java`
#### Snippet
```java
                }
            }
            return null;
        };
    };
```

### ReturnNull
Return of `null`
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/lwm2m/attributes/LwM2mAttributes.java`
#### Snippet
```java
                return "'Short Server ID' attribute is only applicable to Security (ID:0), Server(ID:1) object.";
            }
            return null;
        };
    };
```

### ReturnNull
Return of `null`
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/lwm2m/attributes/MixedLwM2mAttributeSet.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `leshan-core/src/main/java/org/eclipse/leshan/core/link/lwm2m/attributes/MixedLwM2mAttributeSet.java`
#### Snippet
```java
            return (LwM2mAttribute<?>) attribute;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/LwM2mNodeUtil.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/LwM2mNodeUtil.java`
#### Snippet
```java
            return String.format("Invalid object id %d, It MUST be an unsigned int.", id);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/LwM2mNodeUtil.java`
#### Snippet
```java
                    path.getResourceId(), path.getResourceInstanceId());
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/LwM2mNodeUtil.java`
#### Snippet
```java
                    path.getObjectInstanceId(), path.getResourceId(), path.getResourceInstanceId());
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/LwM2mNodeUtil.java`
#### Snippet
```java
            return String.format("Invalid object instance id %d, It MUST be an unsigned int. (65535 is reserved)", id);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/LwM2mNodeUtil.java`
#### Snippet
```java
            return String.format("Invalid resource id %d, It MUST be an unsigned int.", id);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/LwM2mNodeUtil.java`
#### Snippet
```java
            return String.format("Invalid resource instance id %d, It MUST be an unsigned int.", id);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/LwM2mNodeUtil.java`
#### Snippet
```java
            return String.format("Instance id should be undefined(%d) but was %d", LwM2mObjectInstance.UNDEFINED, id);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/LwM2mPath.java`
#### Snippet
```java

        if (!fullpath.startsWith(lwm2mRootpath))
            return null;
        String path = fullpath.substring(lwm2mRootpath.length());

```

### ReturnNull
Return of `null`
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/TimestampedLwM2mNodes.java`
#### Snippet
```java
            return Collections.unmodifiableMap(timestampedPathNodesMap.get(timestamp));
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/codec/cbor/LwM2mNodeCborDecoder.java`
#### Snippet
```java

        if (content == null)
            return null;

        // Parse CBOR
```

### ReturnNull
Return of `null`
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/codec/cbor/LwM2mNodeCborDecoder.java`
#### Snippet
```java
        try {
            if (cborObject.isNull())
                return null;

            switch (type) {
```

### ReturnNull
Return of `null`
in `leshan-core/src/main/java/org/eclipse/leshan/core/util/TimestampUtil.java`
#### Snippet
```java
    public static BigDecimal fromInstant(Instant timestamp) {
        if (timestamp == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `leshan-core/src/main/java/org/eclipse/leshan/core/util/TimestampUtil.java`
#### Snippet
```java
    public static Instant fromSeconds(BigDecimal timestampInSeconds) {
        if (timestampInSeconds == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `leshan-core/src/main/java/org/eclipse/leshan/core/util/StringUtils.java`
#### Snippet
```java
    private static byte[] getBytes(final String string, final Charset charset) {
        if (string == null) {
            return null;
        }
        return string.getBytes(charset);
```

### ReturnNull
Return of `null`
in `leshan-core/src/main/java/org/eclipse/leshan/core/util/StringUtils.java`
#### Snippet
```java
     */
    private static String newString(final byte[] bytes, final Charset charset) {
        return bytes == null ? null : new String(bytes, charset);
    }

```

### ReturnNull
Return of `null`
in `leshan-core/src/main/java/org/eclipse/leshan/core/util/StringUtils.java`
#### Snippet
```java
     */
    public static String trim(String str) {
        return str == null ? null : str.trim();
    }

```

### ReturnNull
Return of `null`
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/codec/json/LwM2mNodeJsonDecoder.java`
#### Snippet
```java
            List<TimestampedLwM2mNode> timestampedNodes = parseJSON(json, path, model, nodeClass);
            if (timestampedNodes.size() == 0) {
                return null;
            } else {
                // return the most recent value
```

### ReturnNull
Return of `null`
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/LwM2mMultipleResource.java`
#### Snippet
```java
        if (resourceInstance != null)
            return resourceInstance.getValue();
        return null;
    }

```

### ReturnNull
Return of `null`
in `leshan-core/src/main/java/org/eclipse/leshan/core/util/X509CertUtil.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `leshan-core/src/main/java/org/eclipse/leshan/core/model/StaticModel.java`
#### Snippet
```java
            return object.resources.get(resourceId);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `leshan-core/src/main/java/org/eclipse/leshan/core/oscore/HkdfAlgorithm.java`
#### Snippet
```java
                return alg;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `leshan-core/src/main/java/org/eclipse/leshan/core/model/LwM2mModelRepository.java`
#### Snippet
```java
        Key floorKey = objects.floorKey(getKey(objectId, Version.MAX));
        if (floorKey == null || !floorKey.id.equals(objectId)) {
            return null;
        }
        return objects.get(floorKey);
```

### ReturnNull
Return of `null`
in `leshan-core/src/main/java/org/eclipse/leshan/core/model/LwM2mModelRepository.java`
#### Snippet
```java
                ObjectModel objectModel = getObjectModel(objectId);
                if (objectModel == null)
                    return null;

                return objectModel.resources.get(resourceId);
```

### ReturnNull
Return of `null`
in `leshan-core/src/main/java/org/eclipse/leshan/core/oscore/AeadAlgorithm.java`
#### Snippet
```java
                return alg;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `leshan-core/src/main/java/org/eclipse/leshan/core/request/BindingMode.java`
#### Snippet
```java
                return err;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `leshan-core/src/main/java/org/eclipse/leshan/core/request/BindingMode.java`
#### Snippet
```java
        default:
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/codec/senml/LwM2mNodeSenMLDecoder.java`
#### Snippet
```java
            }
        default:
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `leshan-core/src/main/java/org/eclipse/leshan/core/node/codec/senml/LwM2mNodeSenMLDecoder.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `leshan-core/src/main/java/org/eclipse/leshan/core/request/BootstrapFinishRequest.java`
#### Snippet
```java
    public LwM2mPath getPath() {
        // not targeting a node.
        return null;
    }

```

### ReturnNull
Return of `null`
in `leshan-core/src/main/java/org/eclipse/leshan/core/request/ContentFormat.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `leshan-core/src/main/java/org/eclipse/leshan/core/request/ContentFormat.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `leshan-core/src/main/java/org/eclipse/leshan/core/request/argument/Arguments.java`
#### Snippet
```java

        if (sb.toString().length() == 0) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `leshan-core/src/main/java/org/eclipse/leshan/core/response/BootstrapDiscoverResponse.java`
#### Snippet
```java
     */
    public LwM2mLink[] getObjectLinks() {
        return links != null ? Arrays.copyOf(links, links.length) : null;
    }

```

### ReturnNull
Return of `null`
in `leshan-core/src/main/java/org/eclipse/leshan/core/response/DiscoverResponse.java`
#### Snippet
```java
     */
    public LwM2mLink[] getObjectLinks() {
        return links != null ? Arrays.copyOf(links, links.length) : null;
    }

```

### ReturnNull
Return of `null`
in `leshan-core/src/main/java/org/eclipse/leshan/senml/SenMLRecord.java`
#### Snippet
```java
            return opaqueValue;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `leshan-core/src/main/java/org/eclipse/leshan/senml/SenMLRecord.java`
#### Snippet
```java
            return Type.OPAQUE;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `leshan-core/src/main/java/org/eclipse/leshan/senml/cbor/upokecenter/SenMLCborUpokecenterEncoderDecoder.java`
#### Snippet
```java
    public byte[] toSenML(SenMLPack pack) throws SenMLException {
        if (pack == null)
            return null;
        return serDes.serializeToCbor(pack);
    }
```

### ReturnNull
Return of `null`
in `leshan-core/src/main/java/org/eclipse/leshan/senml/json/jackson/SenMLJsonRecordSerDes.java`
#### Snippet
```java
    public SenMLRecord deserialize(JsonNode o) throws JsonException {
        if (o == null)
            return null;

        SenMLRecord record = new SenMLRecord();
```

### ReturnNull
Return of `null`
in `leshan-core/src/main/java/org/eclipse/leshan/senml/json/jackson/SenMLJsonJacksonEncoderDecoder.java`
#### Snippet
```java
    public byte[] toSenML(SenMLPack pack) throws SenMLException {
        if (pack == null)
            return null;
        try {
            return serDes.bSerialize(pack.getRecords());
```

### ReturnNull
Return of `null`
in `leshan-server-core-demo/src/main/java/org/eclipse/leshan/server/core/demo/json/JacksonSecurityDeserializer.java`
#### Snippet
```java
            return SecurityInfo.newOscoreInfo(endpoint, new OscoreSetting(sid, rid, msec, 10, -10, null));
        }
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/util/LinkFormatHelper.java`
#### Snippet
```java
    private static Version getVersion(ObjectModel objectModel) {
        if (StringUtils.isEmpty(objectModel.version) || ObjectModel.DEFAULT_VERSION.equals(objectModel.version)) {
            return null;
        }
        return new Version(objectModel.version);
```

### ReturnNull
Return of `null`
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/util/LinkFormatHelper.java`
#### Snippet
```java
        Version version = getVersion(objectModel);
        if (version == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/object/LwM2mTestObject.java`
#### Snippet
```java
                        random.nextInt(ObjectLink.MAXID - 1), random.nextInt(ObjectLink.MAXID - 1));
            }
            return null; // should not happened
        }

```

### ReturnNull
Return of `null`
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/servers/ServerIdentity.java`
#### Snippet
```java
            return String.format("%s[%s %d]", getUri(), getRole(), getId());
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/endpoint/DefaultEndpointsManager.java`
#### Snippet
```java
            boolean clientInitiatedOnly) {
        if (serverInfo == null || serverInfo.isEmpty())
            return null;
        else {
            // TODO support multi server
```

### ReturnNull
Return of `null`
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/resource/SimpleInstanceEnabler.java`
#### Snippet
```java
            Object initialValue = initialValues.get(resourceModel.id);
            if (initialValue == null)
                return null;
            return LwM2mSingleResource.newResource(resourceModel.id, initialValue, resourceModel.type);
        } else {
```

### ReturnNull
Return of `null`
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/resource/SimpleInstanceEnabler.java`
#### Snippet
```java
            default:
                // this should not happened
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/resource/SimpleInstanceEnabler.java`
#### Snippet
```java
            Object initialValue = initialValues.get(resourceModel.id);
            if (initialValue == null)
                return null;

            if (initialValue instanceof LwM2mResourceInstance) {
```

### ReturnNull
Return of `null`
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/resource/SimpleInstanceEnabler.java`
#### Snippet
```java
                return LwM2mMultipleResource.newResource(resourceModel.id, val, resourceModel.type);
            }
            return null;
        } else {
            // no default value
```

### ReturnNull
Return of `null`
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/resource/LwM2mObjectTree.java`
#### Snippet
```java
                if (objectModel != null)
                    return objectModel.resources.get(resourceId);
                return null;
            }

```

### ReturnNull
Return of `null`
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/resource/LwM2mObjectTree.java`
#### Snippet
```java
                if (objectEnabler != null)
                    return objectEnabler.getObjectModel();
                return null;
            }
        };
```

### ReturnNull
Return of `null`
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/resource/DummyInstanceEnabler.java`
#### Snippet
```java
            return LwM2mMultipleResource.newResource(resourceModel.id, values, resourceModel.type);
        else
            return null;
    }

```

### ReturnNull
Return of `null`
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/servers/ServersInfoExtractor.java`
#### Snippet
```java
        ServersInfo info = getInfo(objectEnablers);
        if (info == null)
            return null;

        return info.deviceManagements.get(shortID);
```

### ReturnNull
Return of `null`
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/servers/ServersInfoExtractor.java`
#### Snippet
```java
            return (Long) ((LwM2mResource) response.getContent()).getValue();
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/servers/ServersInfoExtractor.java`
#### Snippet
```java

        if (securityEnabler == null || serverEnabler == null)
            return null;

        ServersInfo infos = new ServersInfo();
```

### ReturnNull
Return of `null`
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/servers/ServersInfoExtractor.java`
#### Snippet
```java
            return (Long) ((LwM2mResource) response.getContent()).getValue();
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/servers/ServersInfoExtractor.java`
#### Snippet
```java
        LwM2mResource resource = oscoreInstance.getResource(OSCORE_MASTER_SALT);
        if (resource == null)
            return null;

        byte[] value = (byte[]) resource.getValue();
```

### ReturnNull
Return of `null`
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/servers/ServersInfoExtractor.java`
#### Snippet
```java
        byte[] value = (byte[]) resource.getValue();
        if (value.length == 0) {
            return null;
        } else {
            return value;
```

### ReturnNull
Return of `null`
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/servers/ServersInfoExtractor.java`
#### Snippet
```java
        ServersInfo info = getInfo(objectEnablers);
        if (info == null)
            return null;

        return info.bootstrap;
```

### ReturnNull
Return of `null`
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/servers/ServersInfoExtractor.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/servers/ServersInfoExtractor.java`
#### Snippet
```java
            return (String) ((LwM2mResource) response.getContent()).getValue();
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/servers/ServersInfoExtractor.java`
#### Snippet
```java
        if (resource != null)
            return ((ObjectLink) resource.getValue()).getObjectInstanceId();
        return null;
    }

```

### ReturnNull
Return of `null`
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/servers/ServersInfoExtractor.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/servers/ServersInfoExtractor.java`
#### Snippet
```java
            return BindingMode.parse((String) ((LwM2mResource) response.getContent()).getValue());
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/servers/ServersInfoExtractor.java`
#### Snippet
```java
            return BindingMode.parse((String) ((LwM2mResource) response.getContent()).getValue());
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/servers/ServersInfoExtractor.java`
#### Snippet
```java
            return (Boolean) ((LwM2mResource) response.getContent()).getValue();
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/model/VersionedModelProvider.java`
#### Snippet
```java
                return objectModel.resources.get(resourceId);
            else
                return null;
        }

```

### ReturnNull
Return of `null`
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/model/VersionedModelProvider.java`
#### Snippet
```java
                return repository.getObjectModel(objectId, version);
            }
            return null;
        }

```

### ReturnNull
Return of `null`
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/bootstrap/BaseBootstrapConsistencyChecker.java`
#### Snippet
```java
            return errors;
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/model/VersionedBootstrapModelProvider.java`
#### Snippet
```java
                return repository.getObjectModel(objectId, version);
            }
            return null;
        }

```

### ReturnNull
Return of `null`
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/model/VersionedBootstrapModelProvider.java`
#### Snippet
```java
                return objectModel.resources.get(resourceId);
            else
                return null;
        }

```

### ReturnNull
Return of `null`
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/security/BootstrapSecurityStoreAdapter.java`
#### Snippet
```java
        SecurityInfo securityInfo = store.getByEndpoint(endpoint);
        if (securityInfo == null)
            return null;
        return Arrays.asList(securityInfo).iterator();
    }
```

### ReturnNull
Return of `null`
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/bootstrap/BootstrapConfigStoreTaskProvider.java`
#### Snippet
```java
        BootstrapConfig config = store.get(session.getEndpoint(), session.getIdentity(), session);
        if (config == null)
            return null;

        if (previousResponse == null && shouldStartWithDiscover(config)) {
```

### ReturnNull
Return of `null`
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/bootstrap/BootstrapConfigStoreTaskProvider.java`
#### Snippet
```java
                            "Bootstrap Discover return error {} : unable to continue bootstrap session with autoIdForSecurityObject mode. {}",
                            response, session);
                    return null;
                }

```

### ReturnNull
Return of `null`
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/bootstrap/BootstrapConfigStoreTaskProvider.java`
#### Snippet
```java
                            "Unable to find bootstrap server instance in Security Object (0) in response {}: unable to continue bootstrap session with autoIdForSecurityObject mode. {}",
                            response, session);
                    return null;
                }

```

### ReturnNull
Return of `null`
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/bootstrap/BootstrapConfigStoreTaskProvider.java`
#### Snippet
```java
            }
        }
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/bootstrap/InMemoryBootstrapConfigStore.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/engine/DefaultRegistrationEngine.java`
#### Snippet
```java
        if (bootstrapServerInfo == null) {
            LOG.error("Trying to bootstrap device but there is no bootstrap server config.");
            return null;
        }

```

### ReturnNull
Return of `null`
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/engine/DefaultRegistrationEngine.java`
#### Snippet
```java
                        observer.onBootstrapTimeout(bootstrapServer, request);
                    }
                    return null;
                } else if (response.isSuccess()) {
                    LOG.info("Bootstrap started");
```

### ReturnNull
Return of `null`
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/engine/DefaultRegistrationEngine.java`
#### Snippet
```java
                                observer.onBootstrapTimeout(bootstrapServer, request);
                            }
                            return null;
                        } else {
                            LOG.info("Bootstrap finished {}.", bootstrapServer.getUri());
```

### ReturnNull
Return of `null`
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/engine/DefaultRegistrationEngine.java`
#### Snippet
```java
                            observer.onBootstrapFailure(bootstrapServer, request, null, null, e);
                        }
                        return null;
                    }
                } else {
```

### ReturnNull
Return of `null`
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/engine/DefaultRegistrationEngine.java`
#### Snippet
```java
                                response.getErrorMessage(), null);
                    }
                    return null;
                }
            } catch (RuntimeException e) {
```

### ReturnNull
Return of `null`
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/engine/DefaultRegistrationEngine.java`
#### Snippet
```java
                    observer.onBootstrapFailure(bootstrapServer, request, null, null, e);
                }
                return null;
            } finally {
                currentBootstrapServer.set(null);
```

### ReturnNull
Return of `null`
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/engine/DefaultRegistrationEngine.java`
#### Snippet
```java
        } else {
            LOG.warn("Bootstrap sequence already started.");
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/engine/DefaultRegistrationEngine.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/engine/DefaultRegistrationEngine.java`
#### Snippet
```java
    public String getRegistrationId(ServerIdentity server) {
        if (server == null)
            return null;
        for (Entry<String, ServerIdentity> entry : registeredServers.entrySet()) {
            if (server.equals(entry.getValue())) {
```

### ReturnNull
Return of `null`
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/engine/DefaultRegistrationEngine.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/engine/DefaultRegistrationEngine.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `leshan-client-core/src/main/java/org/eclipse/leshan/client/engine/DefaultRegistrationEngine.java`
#### Snippet
```java
            return endpointsManager.createEndpoint(serverInfo, isClientInitiatedOnly());
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/bootstrap/LeshanBootstrapServer.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/bootstrap/ConfigurationChecker.java`
#### Snippet
```java
            }
        }
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/LeshanServer.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/registration/InMemoryRegistrationStore.java`
#### Snippet
```java
            lock.writeLock().unlock();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/registration/InMemoryRegistrationStore.java`
#### Snippet
```java
            Registration registration = getRegistration(update.getRegistrationId());
            if (registration == null) {
                return null;
            } else {
                Registration updatedRegistration = update.update(registration);
```

### ReturnNull
Return of `null`
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/registration/InMemoryRegistrationStore.java`
#### Snippet
```java
                return observation;
            }
            return null;
        } finally {
            lock.readLock().unlock();
```

### ReturnNull
Return of `null`
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/registration/InMemoryRegistrationStore.java`
#### Snippet
```java
                return observation;
            }
            return null;
        } finally {
            lock.readLock().unlock();
```

### ReturnNull
Return of `null`
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/registration/InMemoryRegistrationStore.java`
#### Snippet
```java
                return new Deregistration(registration, observationsRemoved);
            }
            return null;
        } finally {
            lock.writeLock().unlock();
```

### ReturnNull
Return of `null`
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/registration/InMemoryRegistrationStore.java`
#### Snippet
```java
                return observation;
            }
            return null;
        } finally {
            lock.writeLock().unlock();
```

### ReturnNull
Return of `null`
in `leshan-client-demo/src/main/java/org/eclipse/leshan/client/demo/RandomTemperatureSensor.java`
#### Snippet
```java
            return MIN_MEASURED_VALUE;
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `leshan-core-cf/src/main/java/org/eclipse/leshan/core/californium/SyncRequestObserver.java`
#### Snippet
```java
            return buildResponse(coapResponse);
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `leshan-core-cf/src/main/java/org/eclipse/leshan/core/californium/LwM2mCoapResource.java`
#### Snippet
```java
            return identityHandler.getIdentity(receivedMessage);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `leshan-core-cf/src/main/java/org/eclipse/leshan/core/californium/LwM2mCoapResource.java`
#### Snippet
```java
        } catch (RuntimeException e) {
            LOG.error("Unable to extract identity", e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `leshan-core-cf/src/main/java/org/eclipse/leshan/core/californium/identity/DefaultCoapIdentityHandler.java`
#### Snippet
```java
            return Identity.unsecure(peerAddress);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `leshan-core-cf/src/main/java/org/eclipse/leshan/core/californium/oscore/cf/InMemoryOscoreContextDB.java`
#### Snippet
```java
        } catch (OSException e) {
            LOG.error("Unable to derive context from {}", oscoreParameters, e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `leshan-core-cf/src/main/java/org/eclipse/leshan/core/californium/ObserveUtil.java`
#### Snippet
```java
            String serializedObservation) {
        if (observation == null)
            return null;

        if (observation.getRequest().getCode() == CoAP.Code.GET) {
```

### ReturnNull
Return of `null`
in `leshan-core-cf/src/main/java/org/eclipse/leshan/core/californium/ObserveUtil.java`
#### Snippet
```java
            return lwm2mPaths;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `leshan-server-demo/src/main/java/org/eclipse/leshan/server/demo/model/ResourceModelSerDes.java`
#### Snippet
```java
    public ResourceModel deserialize(JsonNode o) {
        if (o == null)
            return null;

        if (!o.isObject())
```

### ReturnNull
Return of `null`
in `leshan-server-demo/src/main/java/org/eclipse/leshan/server/demo/model/ResourceModelSerDes.java`
#### Snippet
```java

        if (!o.isObject())
            return null;

        int id = o.get("id").asInt(-1);
```

### ReturnNull
Return of `null`
in `leshan-server-demo/src/main/java/org/eclipse/leshan/server/demo/model/ResourceModelSerDes.java`
#### Snippet
```java
        int id = o.get("id").asInt(-1);
        if (id < 0)
            return null;

        String name = o.get("name").asText();
```

### ReturnNull
Return of `null`
in `leshan-server-demo/src/main/java/org/eclipse/leshan/server/demo/model/ObjectModelSerDes.java`
#### Snippet
```java
    public ObjectModel deserialize(JsonNode o) throws JsonException {
        if (o == null)
            return null;

        if (!o.isObject())
```

### ReturnNull
Return of `null`
in `leshan-server-demo/src/main/java/org/eclipse/leshan/server/demo/model/ObjectModelSerDes.java`
#### Snippet
```java

        if (!o.isObject())
            return null;

        int id = o.get("id").asInt(-1);
```

### ReturnNull
Return of `null`
in `leshan-server-demo/src/main/java/org/eclipse/leshan/server/demo/model/ObjectModelSerDes.java`
#### Snippet
```java
        int id = o.get("id").asInt(-1);
        if (id < 0)
            return null;

        String name = o.get("name").asText();
```

### ReturnNull
Return of `null`
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/LwM2mPskStore.java`
#### Snippet
```java
    public PskPublicInformation getIdentity(InetSocketAddress peerAddress, ServerNames virtualHost) {
        if (registrationStore == null)
            return null;

        Registration registration = registrationStore.getRegistrationByAdress(peerAddress);
```

### ReturnNull
Return of `null`
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/LwM2mPskStore.java`
#### Snippet
```java
                return new PskPublicInformation(securityInfo.getPskIdentity());
            }
            return null;
        }
        return null;
```

### ReturnNull
Return of `null`
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/LwM2mPskStore.java`
#### Snippet
```java
            return null;
        }
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/LwM2mPskStore.java`
#### Snippet
```java
            boolean useExtendedMasterSecret) {
        if (securityStore == null)
            return null;

        SecurityInfo info = securityStore.getByIdentity(identity.getPublicInfoAsString());
```

### ReturnNull
Return of `null`
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/LwM2mOscoreStore.java`
#### Snippet
```java
        } catch (URISyntaxException | SecurityException | IllegalArgumentException e) {
            LOG.error("Unable to extract InetScocketAddress from uri %s", uri, e);
            return null;
        }
        return null;
```

### ReturnNull
Return of `null`
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/LwM2mOscoreStore.java`
#### Snippet
```java
            return null;
        }
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/LwM2mOscoreStore.java`
#### Snippet
```java
        SecurityInfo securityInfo = securityStore.getByOscoreIdentity(oscoreIdentity);
        if (securityInfo == null || !securityInfo.useOSCORE())
            return null;

        try {
```

### ReturnNull
Return of `null`
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/LwM2mOscoreStore.java`
#### Snippet
```java
        } catch (CoseException e) {
            LOG.error("Unable to create OscoreParameters from OoscoreSetting %s", securityInfo.getOscoreSetting(), e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `leshan-server-core/src/main/java/org/eclipse/leshan/server/registration/Registration.java`
#### Snippet
```java
        // sort the list of objects
        if (objectLinks == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/endpoint/coap/CoapOscoreServerEndpointFactory.java`
#### Snippet
```java
                    return Identity.unsecure(peerAddress);
                } else {
                    return null;
                }
            }
```

### ReturnNull
Return of `null`
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/endpoint/CaliforniumServerEndpointsProvider.java`
#### Snippet
```java
                return endpoint;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/bootstrap/LwM2mBootstrapOscoreStore.java`
#### Snippet
```java
        SecurityInfo securityInfo = securityStore.getByOscoreIdentity(oscoreIdentity);
        if (securityInfo == null || !securityInfo.useOSCORE())
            return null;

        try {
```

### ReturnNull
Return of `null`
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/bootstrap/LwM2mBootstrapOscoreStore.java`
#### Snippet
```java
        } catch (CoseException e) {
            LOG.error("Unable to create OscoreParameters from OoscoreSetting %s", securityInfo.getOscoreSetting(), e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/bootstrap/LwM2mBootstrapOscoreStore.java`
#### Snippet
```java
        } catch (URISyntaxException | SecurityException | IllegalArgumentException e) {
            LOG.error("Unable to extract InetScocketAddress from uri %s", uri, e);
            return null;
        }
        return null;
```

### ReturnNull
Return of `null`
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/bootstrap/LwM2mBootstrapOscoreStore.java`
#### Snippet
```java
            return null;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/bootstrap/endpoint/coap/CoapOscoreBootstrapServerEndpointFactory.java`
#### Snippet
```java
                    return Identity.unsecure(peerAddress);
                } else {
                    return null;
                }
            }
```

### ReturnNull
Return of `null`
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/bootstrap/endpoint/CaliforniumBootstrapServerEndpointsProvider.java`
#### Snippet
```java
                return endpoint;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/endpoint/coaps/CoapsServerEndpointFactory.java`
#### Snippet
```java
        // we do no create coaps endpoint if server does have security store
        if (server.getSecurityStore() == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/endpoint/coaps/CoapsServerEndpointFactory.java`
#### Snippet
```java
        } catch (IllegalStateException e) {
            LOG.warn("Unable to create DTLS config for endpont {}.", endpointUri.toString(), e);
            return null;
        }

```

### ReturnNull
Return of `null`
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/endpoint/coaps/CoapsServerEndpointFactory.java`
#### Snippet
```java
                                    senderIdentity.getClass(), senderIdentity.toString()));
                }
                return null;
            }

```

### ReturnNull
Return of `null`
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/observation/LwM2mObservationStore.java`
#### Snippet
```java
        String serializedObservation = ObserveUtil.extractSerializedObservation(observation);
        if (serializedObservation == null)
            return null;

        return observationSerDes.deserialize(serializedObservation);
```

### ReturnNull
Return of `null`
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/observation/LwM2mObservationStore.java`
#### Snippet
```java
                .getObservation(new ObservationIdentifier(token.getBytes()));
        if (observation == null) {
            return null;
        } else {
            return buildCoapObservation(observation);
```

### ReturnNull
Return of `null`
in `leshan-client-cf/src/main/java/org/eclipse/leshan/client/californium/LwM2mClientCoapResource.java`
#### Snippet
```java

        exchange.respond(ResponseCode.INTERNAL_SERVER_ERROR, "unknown server");
        return null;
    }

```

### ReturnNull
Return of `null`
in `leshan-client-cf/src/main/java/org/eclipse/leshan/client/californium/LwM2mClientCoapResource.java`
#### Snippet
```java
        Identity foreignPeerIdentity = getForeignPeerIdentity(exchange, receivedMessage);
        if (foreignPeerIdentity == null)
            return null;
        return serverIdentityExtractor.extractIdentity(exchange, foreignPeerIdentity);
    }
```

### ReturnNull
Return of `null`
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/bootstrap/endpoint/coaps/CoapsBootstrapServerEndpointFactory.java`
#### Snippet
```java
        // we do no create coaps endpoint if server does have security store
        if (server.getSecurityStore() == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/bootstrap/endpoint/coaps/CoapsBootstrapServerEndpointFactory.java`
#### Snippet
```java
        } catch (IllegalStateException e) {
            LOG.warn("Unable to create DTLS config for endpont {}.", endpointUri.toString(), e);
            return null;
        }

```

### ReturnNull
Return of `null`
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/bootstrap/endpoint/coaps/CoapsBootstrapServerEndpointFactory.java`
#### Snippet
```java
                                    senderIdentity.getClass(), senderIdentity.toString()));
                }
                return null;
            }

```

### ReturnNull
Return of `null`
in `leshan-client-cf/src/main/java/org/eclipse/leshan/client/californium/endpoint/coap/CoapOscoreClientEndpointFactory.java`
#### Snippet
```java
                    return Identity.unsecure(peerAddress);
                } else {
                    return null;
                }
            }
```

### ReturnNull
Return of `null`
in `leshan-client-cf/src/main/java/org/eclipse/leshan/client/californium/endpoint/CaliforniumClientEndpointsProvider.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `leshan-client-cf/src/main/java/org/eclipse/leshan/client/californium/endpoint/CaliforniumClientEndpointsProvider.java`
#### Snippet
```java
            return endpoint;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `leshan-client-cf/src/main/java/org/eclipse/leshan/client/californium/endpoint/CaliforniumClientEndpointsProvider.java`
#### Snippet
```java
            boolean clientInitiatedOnly, List<Certificate> trustStore, ClientEndpointToolbox toolbox) {
        // TODO TL : need to be implemented or removed ?
        return null;
    }

```

### ReturnNull
Return of `null`
in `leshan-client-cf/src/main/java/org/eclipse/leshan/client/californium/endpoint/CaliforniumClientEndpointsProvider.java`
#### Snippet
```java
                    if (endpoint.getProtocol().equals(Protocol.COAP) && !currentServer.getIdentity().getPeerAddress()
                            .equals(foreignPeerIdentity.getPeerAddress())) {
                        return null;
                    }
                    // For OSCORE, be sure OSCORE is used.
```

### ReturnNull
Return of `null`
in `leshan-client-cf/src/main/java/org/eclipse/leshan/client/californium/endpoint/CaliforniumClientEndpointsProvider.java`
#### Snippet
```java
                                || !foreignPeerIdentity.getOscoreIdentity()
                                        .equals(currentServer.getIdentity().getOscoreIdentity())) {
                            return null;
                        }
                    }
```

### ReturnNull
Return of `null`
in `leshan-client-cf/src/main/java/org/eclipse/leshan/client/californium/endpoint/CaliforniumClientEndpointsProvider.java`
#### Snippet
```java
                    return currentServer;
                }
                return null;
            }
        };
```

### ReturnNull
Return of `null`
in `leshan-client-cf/src/main/java/org/eclipse/leshan/client/californium/endpoint/coaps/CoapsClientEndpointFactory.java`
#### Snippet
```java
            return effectiveBuilder;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `leshan-client-cf/src/main/java/org/eclipse/leshan/client/californium/endpoint/coaps/CoapsClientEndpointFactory.java`
#### Snippet
```java
        // we can not create CoAPs endpoint if server is not secure data.
        if (!serverInfo.isSecure()) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `leshan-client-cf/src/main/java/org/eclipse/leshan/client/californium/endpoint/coaps/CoapsClientEndpointFactory.java`
#### Snippet
```java
        } catch (IllegalStateException e) {
            LOG.warn("Unable to create DTLS config to create endpont to connect to {}.", serverInfo.getFullUri(), e);
            return null;
        }

```

### ReturnNull
Return of `null`
in `leshan-client-cf/src/main/java/org/eclipse/leshan/client/californium/endpoint/coaps/CoapsClientEndpointFactory.java`
#### Snippet
```java
                                    senderIdentity.getClass(), senderIdentity.toString()));
                }
                return null;
            }

```

### ReturnNull
Return of `null`
in `leshan-server-redis/src/main/java/org/eclipse/leshan/server/redis/RedisSecurityStore.java`
#### Snippet
```java
            byte[] data = j.get((securityInfoByEndpointPrefix + endpoint).getBytes());
            if (data == null) {
                return null;
            } else {
                return deserialize(data);
```

### ReturnNull
Return of `null`
in `leshan-server-redis/src/main/java/org/eclipse/leshan/server/redis/RedisSecurityStore.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `leshan-server-redis/src/main/java/org/eclipse/leshan/server/redis/RedisSecurityStore.java`
#### Snippet
```java
    public SecurityInfo getByOscoreIdentity(OscoreIdentity pskIdentity) {
        // TODO OSCORE to be implemented
        return null;
    }

```

### ReturnNull
Return of `null`
in `leshan-server-redis/src/main/java/org/eclipse/leshan/server/redis/RedisSecurityStore.java`
#### Snippet
```java
            String ep = j.hget(endpointByPskIdKey, identity);
            if (ep == null) {
                return null;
            } else {
                byte[] data = j.get((securityInfoByEndpointPrefix + ep).getBytes());
```

### ReturnNull
Return of `null`
in `leshan-server-redis/src/main/java/org/eclipse/leshan/server/redis/RedisSecurityStore.java`
#### Snippet
```java
                byte[] data = j.get((securityInfoByEndpointPrefix + ep).getBytes());
                if (data == null) {
                    return null;
                } else {
                    return deserialize(data);
```

### ReturnNull
Return of `null`
in `leshan-server-redis/src/main/java/org/eclipse/leshan/server/redis/RedisRegistrationStore.java`
#### Snippet
```java
            byte[] ep = j.get(toRegIdKey(update.getRegistrationId()));
            if (ep == null) {
                return null;
            }

```

### ReturnNull
Return of `null`
in `leshan-server-redis/src/main/java/org/eclipse/leshan/server/redis/RedisRegistrationStore.java`
#### Snippet
```java
                byte[] data = j.get(toEndpointKey(ep));
                if (data == null) {
                    return null;
                }

```

### ReturnNull
Return of `null`
in `leshan-server-redis/src/main/java/org/eclipse/leshan/server/redis/RedisRegistrationStore.java`
#### Snippet
```java
                }

                return null;
            } finally {
                lock.release(j, lockKey, lockValue);
```

### ReturnNull
Return of `null`
in `leshan-server-redis/src/main/java/org/eclipse/leshan/server/redis/RedisRegistrationStore.java`
#### Snippet
```java
            byte[] ep = j.get(toRegIdentityKey(identity));
            if (ep == null) {
                return null;
            }
            byte[] data = j.get(toEndpointKey(ep));
```

### ReturnNull
Return of `null`
in `leshan-server-redis/src/main/java/org/eclipse/leshan/server/redis/RedisRegistrationStore.java`
#### Snippet
```java
            byte[] data = j.get(toEndpointKey(ep));
            if (data == null) {
                return null;
            }
            return deserializeReg(data);
```

### ReturnNull
Return of `null`
in `leshan-server-redis/src/main/java/org/eclipse/leshan/server/redis/RedisRegistrationStore.java`
#### Snippet
```java
                return observation;
            }
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `leshan-server-redis/src/main/java/org/eclipse/leshan/server/redis/RedisRegistrationStore.java`
#### Snippet
```java
        byte[] obs = j.get(toKey(observationTokenPrefix, observationId.getBytes()));
        if (obs == null) {
            return null;
        } else {
            return deserializeObs(obs);
```

### ReturnNull
Return of `null`
in `leshan-server-redis/src/main/java/org/eclipse/leshan/server/redis/RedisRegistrationStore.java`
#### Snippet
```java
            byte[] ep = j.get(toRegAddrKey(address));
            if (ep == null) {
                return null;
            }
            byte[] data = j.get(toEndpointKey(ep));
```

### ReturnNull
Return of `null`
in `leshan-server-redis/src/main/java/org/eclipse/leshan/server/redis/RedisRegistrationStore.java`
#### Snippet
```java
            byte[] data = j.get(toEndpointKey(ep));
            if (data == null) {
                return null;
            }
            return deserializeReg(data);
```

### ReturnNull
Return of `null`
in `leshan-server-redis/src/main/java/org/eclipse/leshan/server/redis/RedisRegistrationStore.java`
#### Snippet
```java
            byte[] data = j.get(toEndpointKey(endpoint));
            if (data == null) {
                return null;
            }
            return deserializeReg(data);
```

### ReturnNull
Return of `null`
in `leshan-server-redis/src/main/java/org/eclipse/leshan/server/redis/RedisRegistrationStore.java`
#### Snippet
```java
        byte[] ep = j.get(toRegIdKey(registrationId));
        if (ep == null) {
            return null;
        }
        byte[] data = j.get(toEndpointKey(ep));
```

### ReturnNull
Return of `null`
in `leshan-server-redis/src/main/java/org/eclipse/leshan/server/redis/RedisRegistrationStore.java`
#### Snippet
```java
        byte[] data = j.get(toEndpointKey(ep));
        if (data == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `leshan-server-redis/src/main/java/org/eclipse/leshan/server/redis/RedisRegistrationStore.java`
#### Snippet
```java
            byte[] ep = j.get(toRegIdKey(registrationId));
            if (ep == null) {
                return null;
            }

```

### ReturnNull
Return of `null`
in `leshan-server-redis/src/main/java/org/eclipse/leshan/server/redis/RedisRegistrationStore.java`
#### Snippet
```java
                    return observation;
                }
                return null;

            } finally {
```

### ReturnNull
Return of `null`
in `leshan-server-redis/src/main/java/org/eclipse/leshan/server/redis/RedisRegistrationStore.java`
#### Snippet
```java
        byte[] ep = j.get(toRegIdKey(registrationId));
        if (ep == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `leshan-server-redis/src/main/java/org/eclipse/leshan/server/redis/RedisRegistrationStore.java`
#### Snippet
```java
            byte[] data = j.get(toEndpointKey(ep));
            if (data == null) {
                return null;
            }
            Registration r = deserializeReg(data);
```

### ReturnNull
Return of `null`
in `leshan-server-redis/src/main/java/org/eclipse/leshan/server/redis/RedisRegistrationStore.java`
#### Snippet
```java
                }
            }
            return null;
        } finally {
            lock.release(j, lockKey, lockValue);
```

## RuleId[id=UnnecessaryLocalVariable]
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
Local variable `endpoint` is redundant
in `leshan-server-cf/src/main/java/org/eclipse/leshan/server/californium/bootstrap/endpoint/coaps/CoapsBootstrapServerEndpointFactory.java`
#### Snippet
```java

        // create CoAP endpoint
        CoapEndpoint endpoint = createEndpointBuilder(dtlsConfig, configurationToUse).build();

        return endpoint;
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
in `leshan-client-cf/src/main/java/org/eclipse/leshan/client/californium/endpoint/coaps/CoapsClientEndpointFactory.java`
#### Snippet
```java

        // create CoAP endpoint
        CoapEndpoint endpoint = createEndpointBuilder(dtlsConfig, defaultConfiguration).build();

        return endpoint;
```

## RuleId[id=BusyWait]
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

## RuleId[id=UseCompareMethod]
### UseCompareMethod
Expression can be replaced with 'Long.compare'
in `leshan-core/src/main/java/org/eclipse/leshan/core/util/datatype/ULong.java`
#### Snippet
```java
        x += Long.MIN_VALUE;
        y += Long.MIN_VALUE;
        return (x < y) ? -1 : ((x == y) ? 0 : 1);
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
    public static void isTrue(boolean expression, String message, long value) {
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
    public static void isTrue(boolean expression) {
        if (expression == false) {
            throw new IllegalArgumentException("The validated expression is false");
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
    public static void isTrue(boolean expression, String message, Object value) {
        if (expression == false) {
            throw new IllegalArgumentException(message + value);
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

