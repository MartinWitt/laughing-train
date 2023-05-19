# hawkbit-examples 
 
# Bad smells
I found 130 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| JavadocReference | 53 | false |
| SpringBootApplicationProperties | 43 | false |
| Deprecation | 6 | false |
| ArraysAsListWithZeroOrOneArgument | 6 | false |
| DuplicateExpressions | 4 | false |
| JavadocDeclaration | 2 | false |
| FieldMayBeFinal | 2 | false |
| DanglingJavadoc | 2 | false |
| TrivialIf | 2 | false |
| OptionalUsedAsFieldOrParameterType | 1 | false |
| CharsetObjectCanBeUsed | 1 | false |
| SimplifyOptionalCallChains | 1 | false |
| DataFlowIssue | 1 | false |
| UnnecessarySemicolon | 1 | false |
| StringOperationCanBeSimplified | 1 | false |
| UnusedAssignment | 1 | false |
| JavadocLinkAsPlainText | 1 | false |
| FieldCanBeLocal | 1 | false |
| UnstableApiUsage | 1 | false |
## RuleId[id=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'spSenderService'
in `hawkbit-device-simulator/src/main/java/org/eclipse/hawkbit/simulator/SimulationController.java`
#### Snippet
```java
    private final SimulationProperties simulationProperties;

    private Optional<DmfSenderService> spSenderService = Optional.empty();

    @Autowired
```

## RuleId[id=CharsetObjectCanBeUsed]
### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `hawkbit-example-mgmt-simulator/src/main/java/org/eclipse/hawkbit/mgmt/client/scenarios/upload/FeignMultipartEncoder.java`
#### Snippet
```java
    private final HttpHeaders jsonHeaders = new HttpHeaders();

    private static final Charset UTF_8 = Charset.forName("UTF-8");

    public FeignMultipartEncoder() {
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `MgmtRolloutRestRequestBody`
in `hawkbit-example-mgmt-feign-client/src/main/java/org/eclipse/hawkbit/mgmt/client/resource/builder/RolloutBuilder.java`
#### Snippet
```java
/**
 * 
 * Builder pattern for building {@link MgmtRolloutRestRequestBody}.
 *
 */
```

### JavadocReference
Cannot resolve symbol `MgmtSoftwareModuleAssigment`
in `hawkbit-example-mgmt-feign-client/src/main/java/org/eclipse/hawkbit/mgmt/client/resource/builder/SoftwareModuleAssigmentBuilder.java`
#### Snippet
```java
/**
 * 
 * Builder pattern for building {@link MgmtSoftwareModuleAssigment}.
 *
 */
```

### JavadocReference
Cannot resolve symbol `MgmtSoftwareModuleAssigment`
in `hawkbit-example-mgmt-feign-client/src/main/java/org/eclipse/hawkbit/mgmt/client/resource/builder/SoftwareModuleAssigmentBuilder.java`
#### Snippet
```java

    /**
     * Builds a list with a single entry of {@link MgmtSoftwareModuleAssigment}
     * which can directly be used in the RESTful-API.
     * 
```

### JavadocReference
Cannot resolve symbol `MgmtSoftwareModuleAssigment`
in `hawkbit-example-mgmt-feign-client/src/main/java/org/eclipse/hawkbit/mgmt/client/resource/builder/SoftwareModuleAssigmentBuilder.java`
#### Snippet
```java
     * which can directly be used in the RESTful-API.
     * 
     * @return a single entry list of {@link MgmtSoftwareModuleAssigment}
     */
    public List<MgmtSoftwareModuleAssigment> build() {
```

### JavadocReference
Cannot resolve symbol `MgmtSoftwareModuleRequestBodyPost`
in `hawkbit-example-mgmt-feign-client/src/main/java/org/eclipse/hawkbit/mgmt/client/resource/builder/SoftwareModuleBuilder.java`
#### Snippet
```java
    /**
     * Builds a list with a single entry of
     * {@link MgmtSoftwareModuleRequestBodyPost} which can directly be used in
     * the RESTful-API.
     * 
```

### JavadocReference
Cannot resolve symbol `MgmtSoftwareModuleRequestBodyPost`
in `hawkbit-example-mgmt-feign-client/src/main/java/org/eclipse/hawkbit/mgmt/client/resource/builder/SoftwareModuleBuilder.java`
#### Snippet
```java
     * the RESTful-API.
     * 
     * @return a single entry list of {@link MgmtSoftwareModuleRequestBodyPost}
     */
    public List<MgmtSoftwareModuleRequestBodyPost> build() {
```

### JavadocReference
Cannot resolve symbol `MgmtSoftwareModuleRequestBodyPost`
in `hawkbit-example-mgmt-feign-client/src/main/java/org/eclipse/hawkbit/mgmt/client/resource/builder/SoftwareModuleBuilder.java`
#### Snippet
```java
/**
 * 
 * Builder pattern for building {@link MgmtSoftwareModuleRequestBodyPost}.
 *
 */
```

### JavadocReference
Cannot resolve symbol `MgmtSoftwareModuleRequestBodyPost`
in `hawkbit-example-mgmt-feign-client/src/main/java/org/eclipse/hawkbit/mgmt/client/resource/builder/SoftwareModuleBuilder.java`
#### Snippet
```java

    /**
     * Builds a list of multiple {@link MgmtSoftwareModuleRequestBodyPost} to
     * create multiple software module at once. An increasing number will be
     * added to the version of the software module. The name and type will
```

### JavadocReference
Cannot resolve symbol `MgmtSoftwareModuleTypeRequestBodyPost`
in `hawkbit-example-mgmt-feign-client/src/main/java/org/eclipse/hawkbit/mgmt/client/resource/builder/SoftwareModuleTypeBuilder.java`
#### Snippet
```java

    /**
     * Builds a list of multiple {@link MgmtSoftwareModuleTypeRequestBodyPost}
     * to create multiple software module types at once. An increasing number
     * will be added to the name and key of the software module type.
```

### JavadocReference
Cannot resolve symbol `MgmtDistributionSetTypeRequestBodyPost`
in `hawkbit-example-mgmt-feign-client/src/main/java/org/eclipse/hawkbit/mgmt/client/resource/builder/SoftwareModuleBuilder.java`
#### Snippet
```java
     * @param count
     *            the amount of software module body which should be created
     * @return a list of {@link MgmtDistributionSetTypeRequestBodyPost}
     */
    public List<MgmtSoftwareModuleRequestBodyPost> buildAsList(final int count) {
```

### JavadocReference
Cannot resolve symbol `MgmtDistributionSetRequestBodyPost`
in `hawkbit-example-mgmt-feign-client/src/main/java/org/eclipse/hawkbit/mgmt/client/resource/builder/DistributionSetBuilder.java`
#### Snippet
```java

/**
 * Builder pattern for building {@link MgmtDistributionSetRequestBodyPost}.
 */
// Exception squid:S1701 - builder pattern
```

### JavadocReference
Cannot resolve symbol `MgmtDistributionSetTypeRequestBodyPost`
in `hawkbit-example-mgmt-feign-client/src/main/java/org/eclipse/hawkbit/mgmt/client/resource/builder/DistributionSetTypeBuilder.java`
#### Snippet
```java
    /**
     * Builds a list with a single entry of
     * {@link MgmtDistributionSetTypeRequestBodyPost} which can directly be used
     * in the RESTful-API.
     * 
```

### JavadocReference
Cannot resolve symbol `MgmtDistributionSetRequestBodyPost`
in `hawkbit-example-mgmt-feign-client/src/main/java/org/eclipse/hawkbit/mgmt/client/resource/builder/DistributionSetBuilder.java`
#### Snippet
```java

    /**
     * Builds a list of multiple {@link MgmtDistributionSetRequestBodyPost} to
     * create multiple distribution sets at once. An increasing number will be
     * used for version of the distribution set starting from given offset. The
```

### JavadocReference
Cannot resolve symbol `MgmtSoftwareModuleTypeRequestBodyPost`
in `hawkbit-example-mgmt-feign-client/src/main/java/org/eclipse/hawkbit/mgmt/client/resource/builder/SoftwareModuleTypeBuilder.java`
#### Snippet
```java
     *            the amount of software module type bodies which should be
     *            created
     * @return a list of {@link MgmtSoftwareModuleTypeRequestBodyPost}
     */
    public List<MgmtSoftwareModuleTypeRequestBodyPost> buildAsList(final int count) {
```

### JavadocReference
Cannot resolve symbol `MgmtDistributionSetRequestBodyPost`
in `hawkbit-example-mgmt-feign-client/src/main/java/org/eclipse/hawkbit/mgmt/client/resource/builder/DistributionSetBuilder.java`
#### Snippet
```java
     * @param offset
     *            for for index start
     * @return a list of {@link MgmtDistributionSetRequestBodyPost}
     */
    public List<MgmtDistributionSetRequestBodyPost> buildAsList(final int offset, final int count) {
```

### JavadocReference
Cannot resolve symbol `MgmtDistributionSetTypeRequestBodyPost`
in `hawkbit-example-mgmt-feign-client/src/main/java/org/eclipse/hawkbit/mgmt/client/resource/builder/DistributionSetTypeBuilder.java`
#### Snippet
```java
     * 
     * @return a single entry list of
     *         {@link MgmtDistributionSetTypeRequestBodyPost}
     */
    public List<MgmtDistributionSetTypeRequestBodyPost> build() {
```

### JavadocReference
Cannot resolve symbol `MgmtTargetRequestBody`
in `hawkbit-example-mgmt-feign-client/src/main/java/org/eclipse/hawkbit/mgmt/client/resource/builder/TargetBuilder.java`
#### Snippet
```java

    /**
     * Builds a list of multiple {@link MgmtTargetRequestBody} to create
     * multiple targets at once. An increasing number will be added to the
     * controllerId and name of the target starting from the provided offset.
```

### JavadocReference
Cannot resolve symbol `MgmtDistributionSetTypeRequestBodyPost`
in `hawkbit-example-mgmt-feign-client/src/main/java/org/eclipse/hawkbit/mgmt/client/resource/builder/DistributionSetTypeBuilder.java`
#### Snippet
```java
/**
 * 
 * Builder pattern for building {@link MgmtDistributionSetTypeRequestBodyPost}.
 *
 */
```

### JavadocReference
Cannot resolve symbol `MgmtSoftwareModuleTypeRequestBodyPost`
in `hawkbit-example-mgmt-feign-client/src/main/java/org/eclipse/hawkbit/mgmt/client/resource/builder/TargetBuilder.java`
#### Snippet
```java
     * @param offset
     *            for for index start
     * @return a list of {@link MgmtSoftwareModuleTypeRequestBodyPost}
     */
    public List<MgmtTargetRequestBody> buildAsList(final int offset, final int count) {
```

### JavadocReference
Cannot resolve symbol `MgmtSoftwareModuleRequestBodyPost`
in `hawkbit-example-mgmt-feign-client/src/main/java/org/eclipse/hawkbit/mgmt/client/resource/builder/SoftwareModuleTypeBuilder.java`
#### Snippet
```java
/**
 * 
 * Builder pattern for building {@link MgmtSoftwareModuleRequestBodyPost}.
 *
 */
```

### JavadocReference
Cannot resolve symbol `MgmtTargetRequestBody`
in `hawkbit-example-mgmt-feign-client/src/main/java/org/eclipse/hawkbit/mgmt/client/resource/builder/TargetBuilder.java`
#### Snippet
```java
/**
 * 
 * Builder pattern for building {@link MgmtTargetRequestBody}.
 *
 */
```

### JavadocReference
Cannot resolve symbol `MgmtDistributionSetTypeRequestBodyPost`
in `hawkbit-example-mgmt-feign-client/src/main/java/org/eclipse/hawkbit/mgmt/client/resource/builder/DistributionSetTypeBuilder.java`
#### Snippet
```java

    /**
     * Builds a list of multiple {@link MgmtDistributionSetTypeRequestBodyPost}
     * to create multiple distribution set types at once. An increasing number
     * will be added to the name and key of the distribution set type. The
```

### JavadocReference
Cannot resolve symbol `MgmtTargetRequestBody`
in `hawkbit-example-mgmt-feign-client/src/main/java/org/eclipse/hawkbit/mgmt/client/resource/builder/TargetBuilder.java`
#### Snippet
```java

    /**
     * Builds a list of multiple {@link MgmtTargetRequestBody} to create
     * multiple targets at once. An increasing number will be added to the
     * controllerId and name of the target. The description will remain.
```

### JavadocReference
Cannot resolve symbol `MgmtDistributionSetRequestBodyPost`
in `hawkbit-example-mgmt-feign-client/src/main/java/org/eclipse/hawkbit/mgmt/client/resource/builder/DistributionSetBuilder.java`
#### Snippet
```java
    /**
     * Builds a list with a single entry of
     * {@link MgmtDistributionSetRequestBodyPost} which can directly be used to
     * post on the RESTful-API.
     * 
```

### JavadocReference
Cannot resolve symbol `MgmtDistributionSetTypeRequestBodyPost`
in `hawkbit-example-mgmt-feign-client/src/main/java/org/eclipse/hawkbit/mgmt/client/resource/builder/DistributionSetTypeBuilder.java`
#### Snippet
```java
     *            the amount of distribution sets type body which should be
     *            created
     * @return a list of {@link MgmtDistributionSetTypeRequestBodyPost}
     */
    public List<MgmtDistributionSetTypeRequestBodyPost> buildAsList(final int count) {
```

### JavadocReference
Cannot resolve symbol `MgmtDistributionSetRequestBodyPost`
in `hawkbit-example-mgmt-feign-client/src/main/java/org/eclipse/hawkbit/mgmt/client/resource/builder/DistributionSetBuilder.java`
#### Snippet
```java
     * post on the RESTful-API.
     * 
     * @return a single entry list of {@link MgmtDistributionSetRequestBodyPost}
     */
    public List<MgmtDistributionSetRequestBodyPost> build() {
```

### JavadocReference
Cannot resolve symbol `MgmtSoftwareModuleTypeRequestBodyPost`
in `hawkbit-example-mgmt-feign-client/src/main/java/org/eclipse/hawkbit/mgmt/client/resource/builder/TargetBuilder.java`
#### Snippet
```java
     * @param count
     *            the amount of target bodies which should be created
     * @return a list of {@link MgmtSoftwareModuleTypeRequestBodyPost}
     */
    public List<MgmtTargetRequestBody> buildAsList(final int count) {
```

### JavadocReference
Cannot resolve symbol `MgmtTargetRequestBody`
in `hawkbit-example-mgmt-feign-client/src/main/java/org/eclipse/hawkbit/mgmt/client/resource/builder/TargetBuilder.java`
#### Snippet
```java

    /**
     * Builds a list with a single entry of {@link MgmtTargetRequestBody} which
     * can directly be used in the RESTful-API.
     * 
```

### JavadocReference
Cannot resolve symbol `MgmtDistributionSetRequestBodyPost`
in `hawkbit-example-mgmt-feign-client/src/main/java/org/eclipse/hawkbit/mgmt/client/resource/builder/DistributionSetBuilder.java`
#### Snippet
```java

    /**
     * Builds a list of multiple {@link MgmtDistributionSetRequestBodyPost} to
     * create multiple distribution sets at once. An increasing number will be
     * used for version of the distribution set. The name and type will remain
```

### JavadocReference
Cannot resolve symbol `MgmtTargetRequestBody`
in `hawkbit-example-mgmt-feign-client/src/main/java/org/eclipse/hawkbit/mgmt/client/resource/builder/TargetBuilder.java`
#### Snippet
```java
     * can directly be used in the RESTful-API.
     * 
     * @return a single entry list of {@link MgmtTargetRequestBody}
     */
    public List<MgmtTargetRequestBody> build() {
```

### JavadocReference
Cannot resolve symbol `MgmtDistributionSetRequestBodyPost`
in `hawkbit-example-mgmt-feign-client/src/main/java/org/eclipse/hawkbit/mgmt/client/resource/builder/DistributionSetBuilder.java`
#### Snippet
```java
     * @param count
     *            the amount of distribution sets body which should be created
     * @return a list of {@link MgmtDistributionSetRequestBodyPost}
     */
    public List<MgmtDistributionSetRequestBodyPost> buildAsList(final int count) {
```

### JavadocReference
Cannot resolve symbol `MgmtSoftwareModuleTypeRequestBodyPost`
in `hawkbit-example-mgmt-feign-client/src/main/java/org/eclipse/hawkbit/mgmt/client/resource/builder/SoftwareModuleTypeBuilder.java`
#### Snippet
```java
    /**
     * Builds a list with a single entry of
     * {@link MgmtSoftwareModuleTypeRequestBodyPost} which can directly be used
     * in the RESTful-API.
     * 
```

### JavadocReference
Cannot resolve symbol `MgmtSoftwareModuleTypeRequestBodyPost`
in `hawkbit-example-mgmt-feign-client/src/main/java/org/eclipse/hawkbit/mgmt/client/resource/builder/SoftwareModuleTypeBuilder.java`
#### Snippet
```java
     * 
     * @return a single entry list of
     *         {@link MgmtSoftwareModuleTypeRequestBodyPost}
     */
    public List<MgmtSoftwareModuleTypeRequestBodyPost> build() {
```

### JavadocReference
Cannot resolve symbol `MgmtTargetFilterQueryRequestBody`
in `hawkbit-example-mgmt-feign-client/src/main/java/org/eclipse/hawkbit/mgmt/client/resource/builder/TargetFilterQueryBuilder.java`
#### Snippet
```java

/**
 * Builder pattern for building {@link MgmtTargetFilterQueryRequestBody}.
 */
// Exception squid:S1701 - builder pattern
```

### JavadocReference
Cannot resolve symbol `MgmtTargetFilterQueryRequestBody`
in `hawkbit-example-mgmt-feign-client/src/main/java/org/eclipse/hawkbit/mgmt/client/resource/builder/TargetFilterQueryBuilder.java`
#### Snippet
```java

    /**
     * Builds a single entry of {@link MgmtTargetFilterQueryRequestBody} which
     * can directly be used to post on the RESTful-API.
     * 
```

### JavadocReference
Cannot resolve symbol `MgmtTargetFilterQueryRequestBody`
in `hawkbit-example-mgmt-feign-client/src/main/java/org/eclipse/hawkbit/mgmt/client/resource/builder/TargetFilterQueryBuilder.java`
#### Snippet
```java
     * can directly be used to post on the RESTful-API.
     * 
     * @return a single entry of {@link MgmtTargetFilterQueryRequestBody}
     */
    public MgmtTargetFilterQueryRequestBody build() {
```

### JavadocReference
Cannot resolve symbol `SpringMvcContract`
in `hawkbit-example-core-feign-client/src/main/java/org/eclipse/hawkbit/feign/core/client/IgnoreMultipleConsumersProducersSpringMvcContract.java`
#### Snippet
```java

/**
 * Own implementation of the {@link SpringMvcContract} which catches the
 * {@link IllegalStateException} which occurs due multiple produces and consumes
 * values in the request-mapping
```

### JavadocReference
Cannot resolve symbol `MgmtSystemManagementRestApi`
in `hawkbit-example-mgmt-feign-client/src/main/java/org/eclipse/hawkbit/mgmt/client/resource/MgmtSystemManagementClientResource.java`
#### Snippet
```java

/**
 * Client binding for the {@link MgmtSystemManagementRestApi}.
 *
 */
```

### JavadocReference
Cannot resolve symbol `SpringBootApplication`
in `hawkbit-custom-theme-example/src/main/java/org/eclipse/hawkbit/app/Start.java`
#### Snippet
```java

/**
 * A {@link SpringBootApplication} annotated class with a main method to start.
 * The minimal configuration for the stand alone hawkBit server.
 *
```

### JavadocReference
Cannot resolve symbol `AbstractHawkbitLoginUI`
in `hawkbit-custom-theme-example/src/main/java/org/eclipse/hawkbit/app/MyLoginUI.java`
#### Snippet
```java
 * A {@link SpringUI} annotated class must be present in the classpath for the
 * login path. The easiest way to get an hawkBit login UI running is to extend
 * the {@link AbstractHawkbitLoginUI} and to annotated it with {@link SpringUI}
 * as in this example to the defined {@link HawkbitTheme#LOGIN_UI_PATH}.
 * 
```

### JavadocReference
Cannot resolve symbol `HawkbitTheme`
in `hawkbit-custom-theme-example/src/main/java/org/eclipse/hawkbit/app/MyLoginUI.java`
#### Snippet
```java
 * login path. The easiest way to get an hawkBit login UI running is to extend
 * the {@link AbstractHawkbitLoginUI} and to annotated it with {@link SpringUI}
 * as in this example to the defined {@link HawkbitTheme#LOGIN_UI_PATH}.
 * 
 */
```

### JavadocReference
Cannot resolve symbol `LOGIN_UI_PATH`
in `hawkbit-custom-theme-example/src/main/java/org/eclipse/hawkbit/app/MyLoginUI.java`
#### Snippet
```java
 * login path. The easiest way to get an hawkBit login UI running is to extend
 * the {@link AbstractHawkbitLoginUI} and to annotated it with {@link SpringUI}
 * as in this example to the defined {@link HawkbitTheme#LOGIN_UI_PATH}.
 * 
 */
```

### JavadocReference
Cannot resolve symbol `MgmtTenantManagementRestApi`
in `hawkbit-example-mgmt-feign-client/src/main/java/org/eclipse/hawkbit/mgmt/client/resource/MgmtTenantManagementClientResource.java`
#### Snippet
```java

/**
 * Client binding for the {@link MgmtTenantManagementRestApi}.
 *
 */
```

### JavadocReference
Cannot resolve symbol `AbstractHawkbitUI`
in `hawkbit-custom-theme-example/src/main/java/org/eclipse/hawkbit/app/MyUI.java`
#### Snippet
```java
 * A {@link SpringUI} annotated class must be present in the classpath. The
 * easiest way to get an hawkBit UI running is to extend the
 * {@link AbstractHawkbitUI} and to annotated it with {@link SpringUI} as in
 * this example.
 *
```

### JavadocReference
Cannot resolve symbol `MultipartFile`
in `hawkbit-example-mgmt-simulator/src/main/java/org/eclipse/hawkbit/mgmt/client/scenarios/upload/FeignMultipartEncoder.java`
#### Snippet
```java

/**
 * A feign encoder implementation which handles {@link MultipartFile} body.
 */
public class FeignMultipartEncoder implements Encoder {
```

### JavadocReference
Cannot resolve symbol `MgmtTagRequestBodyPut`
in `hawkbit-example-mgmt-feign-client/src/main/java/org/eclipse/hawkbit/mgmt/client/resource/builder/TagBuilder.java`
#### Snippet
```java

    /**
     * Builds a list of multiple {@link MgmtTagRequestBodyPut} to create
     * multiple tags at once. An increasing number will be added to the name of
     * the tag. The color and description will remain the same.
```

### JavadocReference
Cannot resolve symbol `MgmtTagRequestBodyPut`
in `hawkbit-example-mgmt-feign-client/src/main/java/org/eclipse/hawkbit/mgmt/client/resource/builder/TagBuilder.java`
#### Snippet
```java
     * @param count
     *            the amount of distribution sets body which should be created
     * @return a list of {@link MgmtTagRequestBodyPut}
     */
    public List<MgmtTagRequestBodyPut> buildAsList(final int count) {
```

### JavadocReference
Cannot resolve symbol `MgmtTagRequestBodyPut`
in `hawkbit-example-mgmt-feign-client/src/main/java/org/eclipse/hawkbit/mgmt/client/resource/builder/TagBuilder.java`
#### Snippet
```java

    /**
     * Builds a list with a single entry of {@link MgmtTagRequestBodyPut} which
     * can directly be used in the RESTful-API.
     * 
```

### JavadocReference
Cannot resolve symbol `MgmtTagRequestBodyPut`
in `hawkbit-example-mgmt-feign-client/src/main/java/org/eclipse/hawkbit/mgmt/client/resource/builder/TagBuilder.java`
#### Snippet
```java
     * can directly be used in the RESTful-API.
     * 
     * @return a single entry list of {@link MgmtTagRequestBodyPut}
     */
    public List<MgmtTagRequestBodyPut> build() {
```

### JavadocReference
Cannot resolve symbol `MgmtTagRequestBodyPut`
in `hawkbit-example-mgmt-feign-client/src/main/java/org/eclipse/hawkbit/mgmt/client/resource/builder/TagBuilder.java`
#### Snippet
```java

/**
 * Builder pattern for building {@link MgmtTagRequestBodyPut}.
 *
 */
```

### JavadocReference
Cannot resolve symbol `receiverConnectorQueueFromHawkBit()`
in `hawkbit-device-simulator/src/main/java/org/eclipse/hawkbit/simulator/amqp/AmqpConfiguration.java`
#### Snippet
```java
    /**
     * Create the Binding
     * {@link AmqpConfiguration#receiverConnectorQueueFromHawkBit()} to
     * {@link AmqpConfiguration#exchangeQueueToConnector()}.
     *
```

### JavadocReference
Cannot resolve symbol `exchangeQueueToConnector()`
in `hawkbit-device-simulator/src/main/java/org/eclipse/hawkbit/simulator/amqp/AmqpConfiguration.java`
#### Snippet
```java
     * Create the Binding
     * {@link AmqpConfiguration#receiverConnectorQueueFromHawkBit()} to
     * {@link AmqpConfiguration#exchangeQueueToConnector()}.
     *
     * @return the binding and create the queue and exchange
```

### JavadocReference
Cannot resolve symbol `MultipartFile`
in `hawkbit-example-mgmt-simulator/src/main/java/org/eclipse/hawkbit/mgmt/client/scenarios/upload/ArtifactFile.java`
#### Snippet
```java

/**
 * Implementation for {@link MultipartFile} for hawkBit artifact upload.
 *
 */
```

## RuleId[id=SimplifyOptionalCallChains]
### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `hawkbit-device-simulator/src/main/java/org/eclipse/hawkbit/simulator/SimulationController.java`
#### Snippet
```java
            @RequestParam(value = "controllerId") final String controllerId) {

        if (!spSenderService.isPresent()) {
            return createAmqpDisabledResponse();
        }
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `toString` may produce `NullPointerException`
in `hawkbit-device-simulator/src/main/java/org/eclipse/hawkbit/simulator/amqp/DmfReceiverService.java`
#### Snippet
```java
        // Exception squid:S2259 - Checked before
        @SuppressWarnings({ "squid:S2259" })
        final EventTopic eventTopic = EventTopic.valueOf(eventHeader.toString());
        switch (eventTopic) {
        case CONFIRM:
```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `hawkbit-device-simulator/src/main/java/org/eclipse/hawkbit/simulator/UpdateStatus.java`
#### Snippet
```java
         * Device has been approved for the installation.
         */
        CONFIRMED;
    }

```

## RuleId[id=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
Unnecessary string length argument
in `hawkbit-device-simulator/src/main/java/org/eclipse/hawkbit/simulator/DeviceSimulatorUpdater.java`
#### Snippet
```java

            return targetToken.substring(0, 2) + "***"
                    + targetToken.substring(targetToken.length() - 2, targetToken.length());
        }

```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@param pollDelaySec` tag description is missing
in `hawkbit-device-simulator/src/main/java/org/eclipse/hawkbit/simulator/AbstractSimulatedDevice.java`
#### Snippet
```java
     * @param tenant
     *            the tenant of the simulated device
     * @param pollDelaySec
     */
    AbstractSimulatedDevice(final String id, final String tenant, final Protocol protocol, final int pollDelaySec) {
```

### JavadocDeclaration
`@throws` tag description is missing
in `hawkbit-device-simulator/src/main/java/org/eclipse/hawkbit/simulator/SimulationController.java`
#### Snippet
```java
     *            is enforced in hawkbit
     * @return a response string that devices has been created
     * @throws MalformedURLException
     */
    @GetMapping("/start")
```

## RuleId[id=SpringBootApplicationProperties]
### SpringBootApplicationProperties
Cannot resolve configuration property 'hawkbit.device.simulator.amqp.enabled'
in `hawkbit-device-simulator/src/main/resources/application.properties`
#### Snippet
```java


hawkbit.device.simulator.amqp.enabled=true
hawkbit.device.simulator.amqp.receiverConnectorQueueFromSp=simulator_receiver
hawkbit.device.simulator.amqp.deadLetterQueue=simulator_deadletter
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'hawkbit.device.simulator.amqp.receiverConnectorQueueFromSp'
in `hawkbit-device-simulator/src/main/resources/application.properties`
#### Snippet
```java

hawkbit.device.simulator.amqp.enabled=true
hawkbit.device.simulator.amqp.receiverConnectorQueueFromSp=simulator_receiver
hawkbit.device.simulator.amqp.deadLetterQueue=simulator_deadletter
hawkbit.device.simulator.amqp.deadLetterExchange=simulator.deadletter
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'hawkbit.device.simulator.amqp.deadLetterQueue'
in `hawkbit-device-simulator/src/main/resources/application.properties`
#### Snippet
```java
hawkbit.device.simulator.amqp.enabled=true
hawkbit.device.simulator.amqp.receiverConnectorQueueFromSp=simulator_receiver
hawkbit.device.simulator.amqp.deadLetterQueue=simulator_deadletter
hawkbit.device.simulator.amqp.deadLetterExchange=simulator.deadletter
hawkbit.device.simulator.amqp.senderForSpExchange=simulator.replyTo
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'hawkbit.device.simulator.amqp.deadLetterExchange'
in `hawkbit-device-simulator/src/main/resources/application.properties`
#### Snippet
```java
hawkbit.device.simulator.amqp.receiverConnectorQueueFromSp=simulator_receiver
hawkbit.device.simulator.amqp.deadLetterQueue=simulator_deadletter
hawkbit.device.simulator.amqp.deadLetterExchange=simulator.deadletter
hawkbit.device.simulator.amqp.senderForSpExchange=simulator.replyTo

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'hawkbit.device.simulator.amqp.senderForSpExchange'
in `hawkbit-device-simulator/src/main/resources/application.properties`
#### Snippet
```java
hawkbit.device.simulator.amqp.deadLetterQueue=simulator_deadletter
hawkbit.device.simulator.amqp.deadLetterExchange=simulator.deadletter
hawkbit.device.simulator.amqp.senderForSpExchange=simulator.replyTo

hawkbit.device.simulator.default-tenant=DEFAULT
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'hawkbit.device.simulator.autostarts.\[0\].tenant'
in `hawkbit-device-simulator/src/main/resources/application.properties`
#### Snippet
```java

## Configuration for simulations
hawkbit.device.simulator.autostarts.[0].tenant=${hawkbit.device.simulator.default-tenant}

hawkbit.device.simulator.attributes[0].key=isoCode
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'hawkbit.device.simulator.attributes\[0\].key'
in `hawkbit-device-simulator/src/main/resources/application.properties`
#### Snippet
```java
hawkbit.device.simulator.autostarts.[0].tenant=${hawkbit.device.simulator.default-tenant}

hawkbit.device.simulator.attributes[0].key=isoCode
hawkbit.device.simulator.attributes[0].random=DE,US,AU,FR,DK,CA
hawkbit.device.simulator.attributes[1].key=hwRevision
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'hawkbit.device.simulator.attributes\[0\].random'
in `hawkbit-device-simulator/src/main/resources/application.properties`
#### Snippet
```java

hawkbit.device.simulator.attributes[0].key=isoCode
hawkbit.device.simulator.attributes[0].random=DE,US,AU,FR,DK,CA
hawkbit.device.simulator.attributes[1].key=hwRevision
hawkbit.device.simulator.attributes[1].value=1.1
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'hawkbit.device.simulator.attributes\[1\].key'
in `hawkbit-device-simulator/src/main/resources/application.properties`
#### Snippet
```java
hawkbit.device.simulator.attributes[0].key=isoCode
hawkbit.device.simulator.attributes[0].random=DE,US,AU,FR,DK,CA
hawkbit.device.simulator.attributes[1].key=hwRevision
hawkbit.device.simulator.attributes[1].value=1.1
hawkbit.device.simulator.attributes[2].key=serial
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'hawkbit.device.simulator.attributes\[1\].value'
in `hawkbit-device-simulator/src/main/resources/application.properties`
#### Snippet
```java
hawkbit.device.simulator.attributes[0].random=DE,US,AU,FR,DK,CA
hawkbit.device.simulator.attributes[1].key=hwRevision
hawkbit.device.simulator.attributes[1].value=1.1
hawkbit.device.simulator.attributes[2].key=serial
hawkbit.device.simulator.attributes[2].value=${random.value}
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'hawkbit.device.simulator.attributes\[2\].key'
in `hawkbit-device-simulator/src/main/resources/application.properties`
#### Snippet
```java
hawkbit.device.simulator.attributes[1].key=hwRevision
hawkbit.device.simulator.attributes[1].value=1.1
hawkbit.device.simulator.attributes[2].key=serial
hawkbit.device.simulator.attributes[2].value=${random.value}

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'hawkbit.device.simulator.attributes\[2\].value'
in `hawkbit-device-simulator/src/main/resources/application.properties`
#### Snippet
```java
hawkbit.device.simulator.attributes[1].value=1.1
hawkbit.device.simulator.attributes[2].key=serial
hawkbit.device.simulator.attributes[2].value=${random.value}

management.endpoints.enabled-by-default=false
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'management.endpoints.enabled-by-default'
in `hawkbit-device-simulator/src/main/resources/application.properties`
#### Snippet
```java
hawkbit.device.simulator.attributes[2].value=${random.value}

management.endpoints.enabled-by-default=false
management.endpoint.health.enabled=true

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'management.endpoint.health.enabled'
in `hawkbit-device-simulator/src/main/resources/application.properties`
#### Snippet
```java

management.endpoints.enabled-by-default=false
management.endpoint.health.enabled=true

## Configuration for local RabbitMQ integration
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'spring.rabbitmq.username'
in `hawkbit-device-simulator/src/main/resources/application.properties`
#### Snippet
```java

## Configuration for local RabbitMQ integration
spring.rabbitmq.username=guest
spring.rabbitmq.password=guest
spring.rabbitmq.virtualHost=/
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'spring.rabbitmq.password'
in `hawkbit-device-simulator/src/main/resources/application.properties`
#### Snippet
```java
## Configuration for local RabbitMQ integration
spring.rabbitmq.username=guest
spring.rabbitmq.password=guest
spring.rabbitmq.virtualHost=/
spring.rabbitmq.host=localhost
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'spring.rabbitmq.virtualHost'
in `hawkbit-device-simulator/src/main/resources/application.properties`
#### Snippet
```java
spring.rabbitmq.username=guest
spring.rabbitmq.password=guest
spring.rabbitmq.virtualHost=/
spring.rabbitmq.host=localhost
spring.rabbitmq.port=5672
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'spring.rabbitmq.host'
in `hawkbit-device-simulator/src/main/resources/application.properties`
#### Snippet
```java
spring.rabbitmq.password=guest
spring.rabbitmq.virtualHost=/
spring.rabbitmq.host=localhost
spring.rabbitmq.port=5672
spring.rabbitmq.dynamic=true
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'spring.rabbitmq.port'
in `hawkbit-device-simulator/src/main/resources/application.properties`
#### Snippet
```java
spring.rabbitmq.virtualHost=/
spring.rabbitmq.host=localhost
spring.rabbitmq.port=5672
spring.rabbitmq.dynamic=true

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'spring.rabbitmq.dynamic'
in `hawkbit-device-simulator/src/main/resources/application.properties`
#### Snippet
```java
spring.rabbitmq.host=localhost
spring.rabbitmq.port=5672
spring.rabbitmq.dynamic=true

## Configuration for basic auth
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'hawkbit.device.simulator.auth.enabled'
in `hawkbit-device-simulator/src/main/resources/application.properties`
#### Snippet
```java

## Configuration for basic auth
hawkbit.device.simulator.auth.enabled=false
hawkbit.device.simulator.auth.user=username
hawkbit.device.simulator.auth.password=password
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'hawkbit.device.simulator.auth.user'
in `hawkbit-device-simulator/src/main/resources/application.properties`
#### Snippet
```java
## Configuration for basic auth
hawkbit.device.simulator.auth.enabled=false
hawkbit.device.simulator.auth.user=username
hawkbit.device.simulator.auth.password=password

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'hawkbit.device.simulator.auth.password'
in `hawkbit-device-simulator/src/main/resources/application.properties`
#### Snippet
```java
hawkbit.device.simulator.auth.enabled=false
hawkbit.device.simulator.auth.user=username
hawkbit.device.simulator.auth.password=password

server.port=8083
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'server.port'
in `hawkbit-device-simulator/src/main/resources/application.properties`
#### Snippet
```java
hawkbit.device.simulator.auth.password=password

server.port=8083

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'hawkbit.url'
in `hawkbit-example-mgmt-simulator/src/main/resources/application.properties`
#### Snippet
```java
#

hawkbit.url=http://localhost:8080
hawkbit.username=admin
hawkbit.password=admin
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'hawkbit.username'
in `hawkbit-example-mgmt-simulator/src/main/resources/application.properties`
#### Snippet
```java

hawkbit.url=http://localhost:8080
hawkbit.username=admin
hawkbit.password=admin

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'hawkbit.password'
in `hawkbit-example-mgmt-simulator/src/main/resources/application.properties`
#### Snippet
```java
hawkbit.url=http://localhost:8080
hawkbit.username=admin
hawkbit.password=admin

spring.main.banner-mode=off
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'spring.main.banner-mode'
in `hawkbit-example-mgmt-simulator/src/main/resources/application.properties`
#### Snippet
```java
hawkbit.password=admin

spring.main.banner-mode=off

feign.hystrix.enabled=false
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'feign.hystrix.enabled'
in `hawkbit-example-mgmt-simulator/src/main/resources/application.properties`
#### Snippet
```java
spring.main.banner-mode=off

feign.hystrix.enabled=false

hawkbit.scenarios.[0].cleanRepository=false
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'hawkbit.scenarios.\[0\].cleanRepository'
in `hawkbit-example-mgmt-simulator/src/main/resources/application.properties`
#### Snippet
```java
feign.hystrix.enabled=false

hawkbit.scenarios.[0].cleanRepository=false
hawkbit.scenarios.[0].targets=0
hawkbit.scenarios.[0].ds-name=gettingstarted-example
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'hawkbit.scenarios.\[0\].targets'
in `hawkbit-example-mgmt-simulator/src/main/resources/application.properties`
#### Snippet
```java

hawkbit.scenarios.[0].cleanRepository=false
hawkbit.scenarios.[0].targets=0
hawkbit.scenarios.[0].ds-name=gettingstarted-example
hawkbit.scenarios.[0].distribution-sets=3
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'hawkbit.scenarios.\[0\].ds-name'
in `hawkbit-example-mgmt-simulator/src/main/resources/application.properties`
#### Snippet
```java
hawkbit.scenarios.[0].cleanRepository=false
hawkbit.scenarios.[0].targets=0
hawkbit.scenarios.[0].ds-name=gettingstarted-example
hawkbit.scenarios.[0].distribution-sets=3
hawkbit.scenarios.[0].sm-fw-name=gettingstarted-example
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'hawkbit.scenarios.\[0\].distribution-sets'
in `hawkbit-example-mgmt-simulator/src/main/resources/application.properties`
#### Snippet
```java
hawkbit.scenarios.[0].targets=0
hawkbit.scenarios.[0].ds-name=gettingstarted-example
hawkbit.scenarios.[0].distribution-sets=3
hawkbit.scenarios.[0].sm-fw-name=gettingstarted-example
hawkbit.scenarios.[0].sm-sw-name=gettingstarted-example
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'hawkbit.scenarios.\[0\].sm-fw-name'
in `hawkbit-example-mgmt-simulator/src/main/resources/application.properties`
#### Snippet
```java
hawkbit.scenarios.[0].ds-name=gettingstarted-example
hawkbit.scenarios.[0].distribution-sets=3
hawkbit.scenarios.[0].sm-fw-name=gettingstarted-example
hawkbit.scenarios.[0].sm-sw-name=gettingstarted-example
hawkbit.scenarios.[0].runRollouts=false
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'hawkbit.scenarios.\[0\].sm-sw-name'
in `hawkbit-example-mgmt-simulator/src/main/resources/application.properties`
#### Snippet
```java
hawkbit.scenarios.[0].distribution-sets=3
hawkbit.scenarios.[0].sm-fw-name=gettingstarted-example
hawkbit.scenarios.[0].sm-sw-name=gettingstarted-example
hawkbit.scenarios.[0].runRollouts=false
hawkbit.scenarios.[0].runSemiAutomaticRollouts=false
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'hawkbit.scenarios.\[0\].runRollouts'
in `hawkbit-example-mgmt-simulator/src/main/resources/application.properties`
#### Snippet
```java
hawkbit.scenarios.[0].sm-fw-name=gettingstarted-example
hawkbit.scenarios.[0].sm-sw-name=gettingstarted-example
hawkbit.scenarios.[0].runRollouts=false
hawkbit.scenarios.[0].runSemiAutomaticRollouts=false
hawkbit.scenarios.[0].artifactsPerSM=0
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'hawkbit.scenarios.\[0\].runSemiAutomaticRollouts'
in `hawkbit-example-mgmt-simulator/src/main/resources/application.properties`
#### Snippet
```java
hawkbit.scenarios.[0].sm-sw-name=gettingstarted-example
hawkbit.scenarios.[0].runRollouts=false
hawkbit.scenarios.[0].runSemiAutomaticRollouts=false
hawkbit.scenarios.[0].artifactsPerSM=0

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'hawkbit.scenarios.\[0\].artifactsPerSM'
in `hawkbit-example-mgmt-simulator/src/main/resources/application.properties`
#### Snippet
```java
hawkbit.scenarios.[0].runRollouts=false
hawkbit.scenarios.[0].runSemiAutomaticRollouts=false
hawkbit.scenarios.[0].artifactsPerSM=0

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'hawkbit.server.ui.demo.password'
in `hawkbit-custom-theme-example/src/main/resources/application.properties`
#### Snippet
```java

# UI demo account
hawkbit.server.ui.demo.password=admin
hawkbit.server.ui.demo.user=admin
hawkbit.server.ui.demo.tenant=DEFAULT
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'hawkbit.server.ui.demo.user'
in `hawkbit-custom-theme-example/src/main/resources/application.properties`
#### Snippet
```java
# UI demo account
hawkbit.server.ui.demo.password=admin
hawkbit.server.ui.demo.user=admin
hawkbit.server.ui.demo.tenant=DEFAULT

```

### SpringBootApplicationProperties
Cannot resolve configuration property 'hawkbit.server.ui.demo.tenant'
in `hawkbit-custom-theme-example/src/main/resources/application.properties`
#### Snippet
```java
hawkbit.server.ui.demo.password=admin
hawkbit.server.ui.demo.user=admin
hawkbit.server.ui.demo.tenant=DEFAULT

# UI help links
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'hawkbit.server.ui.links.documentation.root'
in `hawkbit-custom-theme-example/src/main/resources/application.properties`
#### Snippet
```java

# UI help links
hawkbit.server.ui.links.documentation.root=https://www.eclipse.org/hawkbit/documentation/guide/customtheme.html

spring.main.allow-bean-definition-overriding=true
```

### SpringBootApplicationProperties
Cannot resolve configuration property 'spring.main.allow-bean-definition-overriding'
in `hawkbit-custom-theme-example/src/main/resources/application.properties`
#### Snippet
```java
hawkbit.server.ui.links.documentation.root=https://www.eclipse.org/hawkbit/documentation/guide/customtheme.html

spring.main.allow-bean-definition-overriding=true
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `basicAuthProperties` may be 'final'
in `hawkbit-device-simulator/src/main/java/org/eclipse/hawkbit/simulator/http/BasicAuthSecurityConfiguration.java`
#### Snippet
```java
public class BasicAuthSecurityConfiguration extends WebSecurityConfigurerAdapter {

    private BasicAuthProperties basicAuthProperties;

    protected BasicAuthSecurityConfiguration(BasicAuthProperties basicAuthProperties) {
```

### FieldMayBeFinal
Field `startCacheTime` may be 'final'
in `hawkbit-device-simulator/src/main/java/org/eclipse/hawkbit/simulator/amqp/SimulatedUpdate.java`
#### Snippet
```java
    private final String thingId;
    private final Long actionId;
    private transient LocalDateTime startCacheTime;

    /**
```

## RuleId[id=DuplicateExpressions]
### DuplicateExpressions
Multiple occurrences of `Integer.valueOf(size.substring(0, size.length() - 2))`
in `hawkbit-example-mgmt-simulator/src/main/java/org/eclipse/hawkbit/mgmt/client/scenarios/ConfigurableScenario.java`
#### Snippet
```java
        final String size = s.toUpperCase();
        if (size.endsWith("KB")) {
            return Integer.valueOf(size.substring(0, size.length() - 2)) * 1024;
        }
        if (size.endsWith("MB")) {
```

### DuplicateExpressions
Multiple occurrences of `size.substring(0, size.length() - 2)`
in `hawkbit-example-mgmt-simulator/src/main/java/org/eclipse/hawkbit/mgmt/client/scenarios/ConfigurableScenario.java`
#### Snippet
```java
        final String size = s.toUpperCase();
        if (size.endsWith("KB")) {
            return Integer.valueOf(size.substring(0, size.length() - 2)) * 1024;
        }
        if (size.endsWith("MB")) {
```

### DuplicateExpressions
Multiple occurrences of `Integer.valueOf(size.substring(0, size.length() - 2))`
in `hawkbit-example-mgmt-simulator/src/main/java/org/eclipse/hawkbit/mgmt/client/scenarios/ConfigurableScenario.java`
#### Snippet
```java
        }
        if (size.endsWith("MB")) {
            return Integer.valueOf(size.substring(0, size.length() - 2)) * 1024 * 1024;
        }
        return Integer.valueOf(size);
```

### DuplicateExpressions
Multiple occurrences of `size.substring(0, size.length() - 2)`
in `hawkbit-example-mgmt-simulator/src/main/java/org/eclipse/hawkbit/mgmt/client/scenarios/ConfigurableScenario.java`
#### Snippet
```java
        }
        if (size.endsWith("MB")) {
            return Integer.valueOf(size.substring(0, size.length() - 2)) * 1024 * 1024;
        }
        return Integer.valueOf(size);
```

## RuleId[id=Deprecation]
### Deprecation
'decode404()' is deprecated
in `hawkbit-example-mgmt-simulator/src/main/java/org/eclipse/hawkbit/mgmt/client/Application.java`
#### Snippet
```java
                .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
                .registerModule(new Jackson2HalModule());
        return Feign.builder().contract(new IgnoreMultipleConsumersProducersSpringMvcContract()).decode404()
                .requestInterceptor(
                        new BasicAuthRequestInterceptor(configuration.getUsername(), configuration.getPassword()))
```

### Deprecation
'divide(java.math.BigDecimal, int)' is deprecated
in `hawkbit-example-mgmt-simulator/src/main/java/org/eclipse/hawkbit/mgmt/client/scenarios/ConfigurableScenario.java`
#### Snippet
```java
        LOGGER.info("Creating {} distribution sets", scenario.getDistributionSets());
        final BigDecimal pages = new BigDecimal(scenario.getDistributionSets())
                .divide(new BigDecimal(PAGE_SIZE), BigDecimal.ROUND_UP).max(new BigDecimal(1));

        IntStream.range(0, pages.intValue()).parallel().forEach(i -> createDistributionSetPage(scenario, i));
```

### Deprecation
'ROUND_UP' is deprecated
in `hawkbit-example-mgmt-simulator/src/main/java/org/eclipse/hawkbit/mgmt/client/scenarios/ConfigurableScenario.java`
#### Snippet
```java
        LOGGER.info("Creating {} distribution sets", scenario.getDistributionSets());
        final BigDecimal pages = new BigDecimal(scenario.getDistributionSets())
                .divide(new BigDecimal(PAGE_SIZE), BigDecimal.ROUND_UP).max(new BigDecimal(1));

        IntStream.range(0, pages.intValue()).parallel().forEach(i -> createDistributionSetPage(scenario, i));
```

### Deprecation
'divide(java.math.BigDecimal, int)' is deprecated
in `hawkbit-example-mgmt-simulator/src/main/java/org/eclipse/hawkbit/mgmt/client/scenarios/ConfigurableScenario.java`
#### Snippet
```java
        LOGGER.info("Creating {} targets", scenario.getTargets());
        final BigDecimal pages = new BigDecimal(scenario.getTargets())
                .divide(new BigDecimal(PAGE_SIZE), BigDecimal.ROUND_UP).max(new BigDecimal(1));

        IntStream.range(0, pages.intValue()).parallel().forEach(i -> createTargetPage(scenario, i, deviceGroupTags));
```

### Deprecation
'ROUND_UP' is deprecated
in `hawkbit-example-mgmt-simulator/src/main/java/org/eclipse/hawkbit/mgmt/client/scenarios/ConfigurableScenario.java`
#### Snippet
```java
        LOGGER.info("Creating {} targets", scenario.getTargets());
        final BigDecimal pages = new BigDecimal(scenario.getTargets())
                .divide(new BigDecimal(PAGE_SIZE), BigDecimal.ROUND_UP).max(new BigDecimal(1));

        IntStream.range(0, pages.intValue()).parallel().forEach(i -> createTargetPage(scenario, i, deviceGroupTags));
```

### Deprecation
'decode404()' is deprecated
in `hawkbit-device-simulator/src/main/java/org/eclipse/hawkbit/simulator/SimulatedDeviceFactory.java`
#### Snippet
```java
                .contract(new IgnoreMultipleConsumersProducersSpringMvcContract()).logLevel(Level.HEADERS)
                .decoder(new ResponseEntityDecoder(new JacksonDecoder(mapper))).encoder(new JacksonEncoder())
                .logger(new Slf4jLogger()).decode404()
                .target(RootControllerResourceClient.class, baseEndpoint.toString());

```

## RuleId[id=ArraysAsListWithZeroOrOneArgument]
### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `hawkbit-example-mgmt-feign-client/src/main/java/org/eclipse/hawkbit/mgmt/client/resource/builder/SoftwareModuleBuilder.java`
#### Snippet
```java
     */
    public List<MgmtSoftwareModuleRequestBodyPost> build() {
        return Arrays.asList(doBuild(""));
    }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `hawkbit-example-mgmt-feign-client/src/main/java/org/eclipse/hawkbit/mgmt/client/resource/builder/DistributionSetTypeBuilder.java`
#### Snippet
```java
     */
    public List<MgmtDistributionSetTypeRequestBodyPost> build() {
        return Arrays.asList(doBuild(""));
    }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `hawkbit-example-mgmt-feign-client/src/main/java/org/eclipse/hawkbit/mgmt/client/resource/builder/DistributionSetBuilder.java`
#### Snippet
```java
     */
    public List<MgmtDistributionSetRequestBodyPost> build() {
        return Arrays.asList(doBuild(""));
    }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `hawkbit-example-mgmt-feign-client/src/main/java/org/eclipse/hawkbit/mgmt/client/resource/builder/TargetBuilder.java`
#### Snippet
```java
     */
    public List<MgmtTargetRequestBody> build() {
        return Arrays.asList(doBuild(""));
    }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `hawkbit-example-mgmt-feign-client/src/main/java/org/eclipse/hawkbit/mgmt/client/resource/builder/SoftwareModuleTypeBuilder.java`
#### Snippet
```java
     */
    public List<MgmtSoftwareModuleTypeRequestBodyPost> build() {
        return Arrays.asList(doBuild(""));
    }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `hawkbit-example-mgmt-feign-client/src/main/java/org/eclipse/hawkbit/mgmt/client/resource/builder/TagBuilder.java`
#### Snippet
```java
     */
    public List<MgmtTagRequestBodyPut> build() {
        return Arrays.asList(doBuild(name));
    }

```

## RuleId[id=DanglingJavadoc]
### DanglingJavadoc
Dangling Javadoc comment
in `hawkbit-custom-theme-example/src/main/java/org/eclipse/hawkbit/app/Start.java`
#### Snippet
```java
package org.eclipse.hawkbit.app;
/**
 * Copyright (c) 2015 Bosch Software Innovations GmbH and others.
 *
```

### DanglingJavadoc
Dangling Javadoc comment
in `hawkbit-custom-theme-example/src/main/java/org/eclipse/hawkbit/app/MyUI.java`
#### Snippet
```java
package org.eclipse.hawkbit.app;
/**
 * Copyright (c) 2015 Bosch Software Innovations GmbH and others.
 *
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `poll` initializer `null` is redundant
in `hawkbit-device-simulator/src/main/java/org/eclipse/hawkbit/simulator/DDISimulatedDevice.java`
#### Snippet
```java

    private Optional<Link> getRequiredLink(final String nameOfTheLink) {
        ResponseEntity<DdiControllerBase> poll = null;
        try {
            poll = controllerResource.getControllerBase(getTenant(), getId());
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `hawkbit-example-core-feign-client/src/main/java/org/eclipse/hawkbit/feign/core/client/IgnoreMultipleConsumersProducersSpringMvcContract.java`
#### Snippet
```java
 * {@link IllegalStateException} which occurs due multiple produces and consumes
 * values in the request-mapping
 * annoation.https://github.com/spring-cloud/spring-cloud-netflix/issues/808
 */
public class IgnoreMultipleConsumersProducersSpringMvcContract extends SpringMvcContract {
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `hawkbit-example-mgmt-simulator/src/main/java/org/eclipse/hawkbit/mgmt/client/scenarios/upload/FeignMultipartEncoder.java`
#### Snippet
```java
    private final List<HttpMessageConverter<?>> converters = new RestTemplate().getMessageConverters();
    private final HttpHeaders multipartHeaders = new HttpHeaders();
    private final HttpHeaders jsonHeaders = new HttpHeaders();

    private static final Charset UTF_8 = Charset.forName("UTF-8");
```

## RuleId[id=UnstableApiUsage]
### UnstableApiUsage
'nullOutputStream()' is marked unstable with @Beta
in `hawkbit-device-simulator/src/main/java/org/eclipse/hawkbit/simulator/DeviceSimulatorUpdater.java`
#### Snippet
```java
            long overallread;

            try (final OutputStream os = ByteStreams.nullOutputStream();
                    final BufferedOutputStream bos = new BufferedOutputStream(new DigestOutputStream(os, md))) {

```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `hawkbit-device-simulator/src/main/java/org/eclipse/hawkbit/simulator/DeviceSimulatorRepository.java`
#### Snippet
```java
            }
            if (tenant == null) {
                if (other.tenant != null) {
                    return false;
                }
```

### TrivialIf
`if` statement can be simplified
in `hawkbit-device-simulator/src/main/java/org/eclipse/hawkbit/simulator/DeviceSimulatorRepository.java`
#### Snippet
```java
                    return false;
                }
            } else if (!tenant.equals(other.tenant)) {
                return false;
            }
```

