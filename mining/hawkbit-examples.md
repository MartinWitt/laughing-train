# hawkbit-examples 
 
# Bad smells
I found 40 bad smells with 2 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessarySuperQualifier | 6 | false |
| BoundedWildcard | 6 | false |
| DataFlowIssue | 4 | false |
| DuplicateExpressions | 4 | false |
| NestedAssignment | 3 | false |
| UnnecessaryBoxing | 3 | false |
| NonStrictComparisonCanBeEquality | 1 | true |
| OptionalUsedAsFieldOrParameterType | 1 | false |
| CharsetObjectCanBeUsed | 1 | false |
| UtilityClassWithoutPrivateConstructor | 1 | true |
| DynamicRegexReplaceableByCompiledPattern | 1 | false |
| SimplifyOptionalCallChains | 1 | false |
| UnnecessarySemicolon | 1 | false |
| StringOperationCanBeSimplified | 1 | false |
| Convert2MethodRef | 1 | false |
| MismatchedCollectionQueryUpdate | 1 | false |
| RedundantFieldInitialization | 1 | false |
| ZeroLengthArrayInitialization | 1 | false |
| UnusedAssignment | 1 | false |
| UnstableApiUsage | 1 | false |
## RuleId[id=NonStrictComparisonCanBeEquality]
### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `hawkbit-device-simulator/src/main/java/org/eclipse/hawkbit/simulator/amqp/DmfSenderService.java`
#### Snippet
```java
    private static boolean isCorrelationIdEmpty(final Message message) {
        return message.getMessageProperties().getCorrelationId() == null
                || message.getMessageProperties().getCorrelationId().length() <= 0;
    }

```

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

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `Start` has only 'static' members, and lacks a 'private' constructor
in `hawkbit-custom-theme-example/src/main/java/org/eclipse/hawkbit/app/Start.java`
#### Snippet
```java
// Exception squid:S1118 - Spring boot standard behavior
@SuppressWarnings({ "squid:S1118" })
public class Start {
    /**
     * Main method to start the spring-boot application.
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `hawkbit-device-simulator/src/main/java/org/eclipse/hawkbit/simulator/amqp/DmfReceiverService.java`
#### Snippet
```java
                .substring(messageAsString.indexOf('{') + 1, messageAsString.indexOf('}'));
        final String[] splitMessageContent = requiredMessageContent.split(",");
        return Long.parseLong(splitMessageContent[0].replaceAll(REGEX_EXTRACT_ACTIONID, ""));
    }

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

## RuleId[id=UnnecessarySuperQualifier]
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `hawkbit-device-simulator/src/main/java/org/eclipse/hawkbit/simulator/DMFSimulatedDevice.java`
#### Snippet
```java
        }

        spSenderService.updateAttributesOfThing(super.getTenant(), super.getId(), updateMode, key, value);
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `hawkbit-device-simulator/src/main/java/org/eclipse/hawkbit/simulator/DMFSimulatedDevice.java`
#### Snippet
```java
        }

        spSenderService.updateAttributesOfThing(super.getTenant(), super.getId(), updateMode, key, value);
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `hawkbit-device-simulator/src/main/java/org/eclipse/hawkbit/simulator/DMFSimulatedDevice.java`
#### Snippet
```java
    @Override
    public void poll() {
        spSenderService.createOrUpdateThing(super.getTenant(), super.getId());
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `hawkbit-device-simulator/src/main/java/org/eclipse/hawkbit/simulator/DMFSimulatedDevice.java`
#### Snippet
```java
    @Override
    public void poll() {
        spSenderService.createOrUpdateThing(super.getTenant(), super.getId());
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `hawkbit-device-simulator/src/main/java/org/eclipse/hawkbit/simulator/DDISimulatedDevice.java`
#### Snippet
```java
        final DdiConfigData configData = new DdiConfigData(Collections.singletonMap(key, value), updateMode);

        controllerResource.putConfigData(configData, super.getTenant(), super.getId());
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `hawkbit-device-simulator/src/main/java/org/eclipse/hawkbit/simulator/DDISimulatedDevice.java`
#### Snippet
```java
        final DdiConfigData configData = new DdiConfigData(Collections.singletonMap(key, value), updateMode);

        controllerResource.putConfigData(configData, super.getTenant(), super.getId());
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

### DataFlowIssue
Method invocation `get` may produce `NullPointerException`
in `hawkbit-example-mgmt-simulator/src/main/java/org/eclipse/hawkbit/mgmt/client/scenarios/ConfigurableScenario.java`
#### Snippet
```java
                .map(group -> targetTagResource
                        .createTargetTags(new TagBuilder().name(group).description("Group " + group).build()).getBody()
                        .get(0).getTagId())
                .collect(Collectors.toList());
    }
```

### DataFlowIssue
Argument `softwareModuleResource.createSoftwareModules( new SoftwareModuleBuilder().name(scena...` might be null
in `hawkbit-example-mgmt-simulator/src/main/java/org/eclipse/hawkbit/mgmt/client/scenarios/ConfigurableScenario.java`
#### Snippet
```java
        }

        modules.addAll(softwareModuleResource.createSoftwareModules(
                new SoftwareModuleBuilder().name(scenario.getSmSwName() + "-app").version(dsSet.getVersion() + ".")
                        .type("application").buildAsList(scenario.getAppModulesPerDistributionSet()))
                .getBody());

        for (int iArtifact = 0; iArtifact < scenario.getArtifactsPerSM(); iArtifact++) {
```

### DataFlowIssue
Passing `null` argument to parameter annotated as @NotNull
in `hawkbit-device-simulator/src/main/java/org/eclipse/hawkbit/simulator/amqp/DmfSenderService.java`
#### Snippet
```java
        }

        rabbitTemplate.send(address, null, message, new CorrelationData(correlationId));
    }

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

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `hawkbit-example-mgmt-simulator/src/main/java/org/eclipse/hawkbit/mgmt/client/scenarios/ConfigurableScenario.java`
#### Snippet
```java
                Thread.currentThread().interrupt();
            }
        } while ((rollout = rolloutResource.getRollout(id).getBody()) != null
                && !"READY".equalsIgnoreCase(rollout.getStatus()));
    }
```

### NestedAssignment
Result of assignment expression used
in `hawkbit-example-mgmt-simulator/src/main/java/org/eclipse/hawkbit/mgmt/client/scenarios/ConfigurableScenario.java`
#### Snippet
```java
        PagedList<MgmtRolloutResponseBody> rollouts;

        while ((rollouts = rolloutResource.getRollouts(0, PAGE_SIZE, null, null, "compact").getBody()) != null
                && rollouts.getTotal() > 0) {
            rollouts.getContent().parallelStream().forEach(rollout -> {
```

### NestedAssignment
Result of assignment expression used
in `hawkbit-example-mgmt-simulator/src/main/java/org/eclipse/hawkbit/mgmt/client/scenarios/ConfigurableScenario.java`
#### Snippet
```java
                Thread.currentThread().interrupt();
            }
        } while ((rollout = rolloutResource.getRollout(id).getBody()) != null
                && !"FINISHED".equalsIgnoreCase(rollout.getStatus()));
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

## RuleId[id=Convert2MethodRef]
### Convert2MethodRef
Lambda can be replaced with method reference
in `hawkbit-device-simulator/src/main/java/org/eclipse/hawkbit/simulator/NextPollTimeController.java`
#### Snippet
```java
                if (nextCounter < 0) {
                    try {
                        pollService.submit(() -> device.poll());
                    } catch (final IllegalStateException e) {
                        LOGGER.trace("Device could not be polled", e);
```

## RuleId[id=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `jsonHeaders` are updated, but never queried
in `hawkbit-example-mgmt-simulator/src/main/java/org/eclipse/hawkbit/mgmt/client/scenarios/upload/FeignMultipartEncoder.java`
#### Snippet
```java
    private final List<HttpMessageConverter<?>> converters = new RestTemplate().getMessageConverters();
    private final HttpHeaders multipartHeaders = new HttpHeaders();
    private final HttpHeaders jsonHeaders = new HttpHeaders();

    private static final Charset UTF_8 = Charset.forName("UTF-8");
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `false` is redundant
in `hawkbit-device-simulator/src/main/java/org/eclipse/hawkbit/simulator/amqp/AmqpProperties.java`
#### Snippet
```java
     * Set to true for the simulator run DMF health check.
     */
    private boolean checkDmfHealth = false;

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

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `hawkbit-example-mgmt-simulator/src/main/java/org/eclipse/hawkbit/mgmt/client/scenarios/upload/ArtifactFile.java`
#### Snippet
```java
        this.originalFilename = Optional.ofNullable(originalFilename).orElse("");
        this.contentType = contentType;
        this.content = Optional.ofNullable(content).orElse(new byte[0]);
    }

```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends DdiChunk`
in `hawkbit-device-simulator/src/main/java/org/eclipse/hawkbit/simulator/DDISimulatedDevice.java`
#### Snippet
```java
    }

    private void startDdiUpdate(final long actionId, final HandlingType updateType, final List<DdiChunk> modules) {

        deviceUpdater.startUpdate(getTenant(), getId(),
```

### BoundedWildcard
Can generalize to `? extends DmfSoftwareModule`
in `hawkbit-device-simulator/src/main/java/org/eclipse/hawkbit/simulator/DeviceSimulatorUpdater.java`
#### Snippet
```java

        private DeviceSimulatorUpdateThread(final AbstractSimulatedDevice device, final UpdaterCallback callback,
                final List<DmfSoftwareModule> modules, final EventTopic actionType, final String gatewayToken,
                final boolean downloadAuthenticationEnabled) {
            this.device = device;
```

### BoundedWildcard
Can generalize to `? super UpdateStatus`
in `hawkbit-device-simulator/src/main/java/org/eclipse/hawkbit/simulator/DeviceSimulatorUpdater.java`
#### Snippet
```java

        private static void handleArtifact(final String targetToken, final String gatewayToken,
                final List<UpdateStatus> status, final DmfArtifact artifact) {

            if (artifact.getUrls().containsKey("HTTPS")) {
```

### BoundedWildcard
Can generalize to `? extends MgmtDistributionSet`
in `hawkbit-example-mgmt-simulator/src/main/java/org/eclipse/hawkbit/mgmt/client/scenarios/ConfigurableScenario.java`
#### Snippet
```java
    }

    private void assignSoftwareModulesTo(final Scenario scenario, final List<MgmtDistributionSet> sets) {
        final byte[] artifact = generateArtifact(scenario);
        sets.forEach(dsSet -> {
```

### BoundedWildcard
Can generalize to `? extends MgmtTarget`
in `hawkbit-example-mgmt-simulator/src/main/java/org/eclipse/hawkbit/mgmt/client/scenarios/ConfigurableScenario.java`
#### Snippet
```java
    }

    private void tagTargets(final Scenario scenario, final int page, final List<MgmtTarget> targets,
            final List<Long> deviceGroupTags) {
        if (scenario.getTargetTags() > 0) {
```

### BoundedWildcard
Can generalize to `? extends MgmtDistributionSet`
in `hawkbit-example-mgmt-simulator/src/main/java/org/eclipse/hawkbit/mgmt/client/scenarios/ConfigurableScenario.java`
#### Snippet
```java
    }

    private void tagDistributionSets(final int page, final List<MgmtDistributionSet> sets) {
        final List<MgmtTag> tags = distributionSetTagResource
                .createDistributionSetTags(
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

## RuleId[id=UnnecessaryBoxing]
### UnnecessaryBoxing
Redundant boxing, `Integer.parseInt()` call can be used instead
in `hawkbit-example-mgmt-simulator/src/main/java/org/eclipse/hawkbit/mgmt/client/scenarios/ConfigurableScenario.java`
#### Snippet
```java
        final String size = s.toUpperCase();
        if (size.endsWith("KB")) {
            return Integer.valueOf(size.substring(0, size.length() - 2)) * 1024;
        }
        if (size.endsWith("MB")) {
```

### UnnecessaryBoxing
Redundant boxing, `Integer.parseInt()` call can be used instead
in `hawkbit-example-mgmt-simulator/src/main/java/org/eclipse/hawkbit/mgmt/client/scenarios/ConfigurableScenario.java`
#### Snippet
```java
        }
        if (size.endsWith("MB")) {
            return Integer.valueOf(size.substring(0, size.length() - 2)) * 1024 * 1024;
        }
        return Integer.valueOf(size);
```

### UnnecessaryBoxing
Redundant boxing, `Integer.parseInt()` call can be used instead
in `hawkbit-example-mgmt-simulator/src/main/java/org/eclipse/hawkbit/mgmt/client/scenarios/ConfigurableScenario.java`
#### Snippet
```java
            return Integer.valueOf(size.substring(0, size.length() - 2)) * 1024 * 1024;
        }
        return Integer.valueOf(size);
    }

```

