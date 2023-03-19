# mosaic 
 
# Bad smells
I found 1438 bad smells with 97 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| MissortedModifiers | 351 | false |
| ClassNameSameAsAncestorName | 154 | false |
| RedundantFieldInitialization | 151 | false |
| ReturnNull | 116 | false |
| PublicFieldAccessedInSynchronizedContext | 87 | false |
| BoundedWildcard | 71 | false |
| UnnecessarySuperQualifier | 53 | false |
| UtilityClassWithoutPrivateConstructor | 52 | true |
| SystemOutErr | 49 | false |
| NullableProblems | 24 | false |
| DataFlowIssue | 21 | false |
| UnnecessaryFullyQualifiedName | 21 | false |
| AssignmentToMethodParameter | 19 | false |
| SizeReplaceableByIsEmpty | 16 | true |
| UnnecessaryToStringCall | 14 | true |
| NestedAssignment | 13 | false |
| NonProtectedConstructorInAbstractClass | 13 | true |
| FieldAccessedSynchronizedAndUnsynchronized | 12 | false |
| NonSerializableFieldInSerializableClass | 11 | false |
| StaticCallOnSubclass | 10 | false |
| ObsoleteCollection | 10 | false |
| RedundantImplements | 10 | false |
| DynamicRegexReplaceableByCompiledPattern | 9 | false |
| RedundantMethodOverride | 8 | false |
| ReplaceAssignmentWithOperatorAssignment | 8 | false |
| MethodOverloadsParentMethod | 8 | false |
| RegExpRedundantEscape | 7 | false |
| ZeroLengthArrayInitialization | 7 | false |
| TrivialStringConcatenation | 6 | false |
| MissingDeprecatedAnnotation | 6 | false |
| PointlessArithmeticExpression | 5 | false |
| StringBufferReplaceableByString | 5 | false |
| UNUSED_IMPORT | 5 | false |
| EmptyMethod | 5 | false |
| SuspiciousNameCombination | 5 | false |
| DeprecatedIsStillUsed | 5 | false |
| ManualMinMaxCalculation | 4 | false |
| StringBufferReplaceableByStringBuilder | 4 | false |
| UnusedAssignment | 4 | false |
| EqualsAndHashcode | 3 | false |
| IOResource | 3 | false |
| StringOperationCanBeSimplified | 3 | false |
| AssignmentToForLoopParameter | 3 | false |
| BusyWait | 3 | false |
| CommentedOutCode | 2 | false |
| AssignmentToStaticFieldFromInstanceMethod | 2 | false |
| NonShortCircuitBoolean | 2 | false |
| IntegerMultiplicationImplicitCastToLong | 2 | false |
| DuplicateThrows | 2 | false |
| TypeParameterExtendsObject | 2 | false |
| ConstantValue | 2 | false |
| SimplifyStreamApiCallChains | 2 | false |
| MismatchedJavadocCode | 2 | false |
| SwitchStatementWithConfusingDeclaration | 2 | false |
| Convert2Lambda | 2 | false |
| RegExpUnnecessaryNonCapturingGroup | 2 | false |
| UnnecessaryModifier | 1 | true |
| StaticPseudoFunctionalStyleMethod | 1 | false |
| DuplicateBranchesInSwitch | 1 | false |
| UnnecessaryQualifierForThis | 1 | false |
| AbstractClassNeverImplemented | 1 | false |
| IgnoreResultOfCall | 1 | false |
| WhileLoopSpinsOnField | 1 | false |
| SlowListContainsAll | 1 | false |
| CodeBlock2Expr | 1 | true |
| HtmlWrongAttributeValue | 1 | false |
| SynchronizeOnThis | 1 | false |
| OptionalGetWithoutIsPresent | 1 | false |
| MethodOverridesStaticMethod | 1 | false |
| SocketResource | 1 | false |
| UnnecessarySemicolon | 1 | false |
| SetReplaceableByEnumSet | 1 | false |
| NestedSynchronizedStatement | 1 | false |
| RedundantSuppression | 1 | false |
| ComparatorMethodParameterNotUsed | 1 | false |
| RedundantFileCreation | 1 | false |
## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/api/VehicleSetRemove.java`
#### Snippet
```java
     * Enum class that represents the different remove type.
     */
    public enum Reason {
        TELEPORT(0),
        PARKING(1),
```

## RuleId[id=PointlessArithmeticExpression]
### PointlessArithmeticExpression
`1 * TIME.SECOND` can be replaced with 'TIME.SECOND'
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/config/CEtsi.java`
#### Snippet
```java
     */
    @JsonAdapter(TimeFieldAdapter.NanoSeconds.class)
    public long maxStartOffset = 1 * TIME.SECOND;

    /**
```

### PointlessArithmeticExpression
`1 * TIME.SECOND` can be replaced with 'TIME.SECOND'
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/config/CEtsi.java`
#### Snippet
```java
     */
    @JsonAdapter(TimeFieldAdapter.NanoSeconds.class)
    public Long maxInterval = 1 * TIME.SECOND;

    /**
```

### PointlessArithmeticExpression
`1 * TIME.SECOND` can be replaced with 'TIME.SECOND'
in `app/tutorials/example-applications/src/main/java/org/eclipse/mosaic/app/examples/emergencybrake/CEmergencyBrakeApp.java`
#### Snippet
```java
     * Minimal duration of a deceleration to be detected as emergency break
     */
    public long minimalBrakeDuration = 1 * TIME.SECOND;

    /**
```

### PointlessArithmeticExpression
`1 * TIME.SECOND` can be replaced with 'TIME.SECOND'
in `app/tutorials/example-applications/src/main/java/org/eclipse/mosaic/app/tutorial/trafficlight/TrafficLightControlApp.java`
#### Snippet
```java
        }

        final Event nextEvent = new Event(getOs().getSimulationTime() + 1 * TIME.SECOND, this::checkTrafficLightPhase);
        getOs().getEventManager().addEvent(nextEvent);
    }
```

### PointlessArithmeticExpression
`1 * TIME.SECOND` can be replaced with 'TIME.SECOND'
in `app/tutorials/example-applications/src/main/java/org/eclipse/mosaic/app/tutorial/eventprocessing/sampling/IntervalSamplingApp.java`
#### Snippet
```java
    public void onStartup() {
        // Each vehicle will get a random offset, which can be different from another vehicle's offset.
        this.timeOffset = this.getRandom().nextLong(100 * TIME.MILLI_SECOND, 1 * TIME.SECOND);

        getLog().infoSimTime(this, "Set time offset for first event to {}", TIME.format(this.timeOffset));
```

## RuleId[id=StaticCallOnSubclass]
### StaticCallOnSubclass
Static method `valueOf()` declared in class 'java.lang.Enum' but referenced via subclass 'null'
in `lib/mosaic-utils/src/main/java/org/eclipse/mosaic/lib/util/gson/AbstractEnumDefaultValueTypeAdapter.java`
#### Snippet
```java
        }
        try {
            return (E) E.valueOf(defaultValue.getClass(), in.nextString());
        } catch (IllegalArgumentException e) {
            return defaultValue;
```

### StaticCallOnSubclass
Static method `getByAddress()` declared in class 'java.net.InetAddress' but referenced via subclass 'java.net.Inet4Address'
in `lib/mosaic-objects/src/main/java/org/eclipse/mosaic/lib/objects/addressing/NetworkAddress.java`
#### Snippet
```java
        require32BitAddress(ipv4Address.length);
        try {
            this.address = (Inet4Address) Inet4Address.getByAddress(ipv4Address);
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
```

### StaticCallOnSubclass
Static method `getByAddress()` declared in class 'java.net.InetAddress' but referenced via subclass 'java.net.Inet4Address'
in `lib/mosaic-objects/src/main/java/org/eclipse/mosaic/lib/objects/addressing/IpResolver.java`
#### Snippet
```java
                final Inet4Address ipResult;
                try {
                    ipResult = (Inet4Address) Inet4Address.getByAddress(addressFlatToArray(network | unitNumber));
                } catch (UnknownHostException ex) {
                    throw new RuntimeException("Error converting hostname to IP, address is not IPv4");
```

### StaticCallOnSubclass
Static method `getByName()` declared in class 'java.net.InetAddress' but referenced via subclass 'java.net.Inet4Address'
in `lib/mosaic-objects/src/main/java/org/eclipse/mosaic/lib/objects/addressing/IpResolver.java`
#### Snippet
```java
        Objects.requireNonNull(configuration.serverNet, "Invalid IpResolver configuration: No serverNet given");
        try {
            this.netMask = (Inet4Address) Inet4Address.getByName(configuration.netMask);

            unitNetworks.put(UnitType.VEHICLE, (Inet4Address) Inet4Address.getByName(configuration.vehicleNet));
```

### StaticCallOnSubclass
Static method `getByName()` declared in class 'java.net.InetAddress' but referenced via subclass 'java.net.Inet4Address'
in `lib/mosaic-objects/src/main/java/org/eclipse/mosaic/lib/objects/addressing/IpResolver.java`
#### Snippet
```java
            this.netMask = (Inet4Address) Inet4Address.getByName(configuration.netMask);

            unitNetworks.put(UnitType.VEHICLE, (Inet4Address) Inet4Address.getByName(configuration.vehicleNet));
            unitNetworks.put(UnitType.ROAD_SIDE_UNIT, (Inet4Address) Inet4Address.getByName(configuration.rsuNet));
            unitNetworks.put(UnitType.TRAFFIC_MANAGEMENT_CENTER, (Inet4Address) Inet4Address.getByName(configuration.tmcNet));
```

### StaticCallOnSubclass
Static method `getByName()` declared in class 'java.net.InetAddress' but referenced via subclass 'java.net.Inet4Address'
in `lib/mosaic-objects/src/main/java/org/eclipse/mosaic/lib/objects/addressing/IpResolver.java`
#### Snippet
```java

            unitNetworks.put(UnitType.VEHICLE, (Inet4Address) Inet4Address.getByName(configuration.vehicleNet));
            unitNetworks.put(UnitType.ROAD_SIDE_UNIT, (Inet4Address) Inet4Address.getByName(configuration.rsuNet));
            unitNetworks.put(UnitType.TRAFFIC_MANAGEMENT_CENTER, (Inet4Address) Inet4Address.getByName(configuration.tmcNet));
            unitNetworks.put(UnitType.TRAFFIC_LIGHT, (Inet4Address) Inet4Address.getByName(configuration.tlNet));
```

### StaticCallOnSubclass
Static method `getByName()` declared in class 'java.net.InetAddress' but referenced via subclass 'java.net.Inet4Address'
in `lib/mosaic-objects/src/main/java/org/eclipse/mosaic/lib/objects/addressing/IpResolver.java`
#### Snippet
```java
            unitNetworks.put(UnitType.VEHICLE, (Inet4Address) Inet4Address.getByName(configuration.vehicleNet));
            unitNetworks.put(UnitType.ROAD_SIDE_UNIT, (Inet4Address) Inet4Address.getByName(configuration.rsuNet));
            unitNetworks.put(UnitType.TRAFFIC_MANAGEMENT_CENTER, (Inet4Address) Inet4Address.getByName(configuration.tmcNet));
            unitNetworks.put(UnitType.TRAFFIC_LIGHT, (Inet4Address) Inet4Address.getByName(configuration.tlNet));
            unitNetworks.put(UnitType.CHARGING_STATION, (Inet4Address) Inet4Address.getByName(configuration.csNet));
```

### StaticCallOnSubclass
Static method `getByName()` declared in class 'java.net.InetAddress' but referenced via subclass 'java.net.Inet4Address'
in `lib/mosaic-objects/src/main/java/org/eclipse/mosaic/lib/objects/addressing/IpResolver.java`
#### Snippet
```java
            unitNetworks.put(UnitType.ROAD_SIDE_UNIT, (Inet4Address) Inet4Address.getByName(configuration.rsuNet));
            unitNetworks.put(UnitType.TRAFFIC_MANAGEMENT_CENTER, (Inet4Address) Inet4Address.getByName(configuration.tmcNet));
            unitNetworks.put(UnitType.TRAFFIC_LIGHT, (Inet4Address) Inet4Address.getByName(configuration.tlNet));
            unitNetworks.put(UnitType.CHARGING_STATION, (Inet4Address) Inet4Address.getByName(configuration.csNet));
            unitNetworks.put(UnitType.SERVER, (Inet4Address) Inet4Address.getByName(configuration.serverNet));
```

### StaticCallOnSubclass
Static method `getByName()` declared in class 'java.net.InetAddress' but referenced via subclass 'java.net.Inet4Address'
in `lib/mosaic-objects/src/main/java/org/eclipse/mosaic/lib/objects/addressing/IpResolver.java`
#### Snippet
```java
            unitNetworks.put(UnitType.TRAFFIC_MANAGEMENT_CENTER, (Inet4Address) Inet4Address.getByName(configuration.tmcNet));
            unitNetworks.put(UnitType.TRAFFIC_LIGHT, (Inet4Address) Inet4Address.getByName(configuration.tlNet));
            unitNetworks.put(UnitType.CHARGING_STATION, (Inet4Address) Inet4Address.getByName(configuration.csNet));
            unitNetworks.put(UnitType.SERVER, (Inet4Address) Inet4Address.getByName(configuration.serverNet));

```

### StaticCallOnSubclass
Static method `getByName()` declared in class 'java.net.InetAddress' but referenced via subclass 'java.net.Inet4Address'
in `lib/mosaic-objects/src/main/java/org/eclipse/mosaic/lib/objects/addressing/IpResolver.java`
#### Snippet
```java
            unitNetworks.put(UnitType.TRAFFIC_LIGHT, (Inet4Address) Inet4Address.getByName(configuration.tlNet));
            unitNetworks.put(UnitType.CHARGING_STATION, (Inet4Address) Inet4Address.getByName(configuration.csNet));
            unitNetworks.put(UnitType.SERVER, (Inet4Address) Inet4Address.getByName(configuration.serverNet));

        } catch (UnknownHostException ex) {
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (2 lines)
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandRetrieveLaneAreaState.java`
#### Snippet
```java
     */
    public final static int VAR_LAST_STEP_HALTING_VEHICLE_NUMBER = 0x14;
    // public final static int VAR_LAST_STEP_LENGTH_OF_JAM_IN_NUMBER_OF_VEHICLES = 0x18;
    // public final static int VAR_LAST_STEP_LENGTH_OF_JAM_IN_METERS = 0x19;

```

### CommentedOutCode
Commented out code (2 lines)
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandRetrieveLaneAreaState.java`
#### Snippet
```java
     */
    public final static int VAR_LANE_ID = 0x51;
    // public final static int VAR_POSITION = 0x42;
    // public final static int VAR_ID_LIST = 0x00;

```

## RuleId[id=AssignmentToStaticFieldFromInstanceMethod]
### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `mosaicVersion` from instance context
in `rti/mosaic-rti-api/src/main/java/org/eclipse/mosaic/rti/api/MosaicVersion.java`
#### Snippet
```java
        // make sure there is something to check
        Objects.requireNonNull(version);
        mosaicVersion = version;
        // check for snapshot
        String[] split = version.split("-");
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `cnt` from instance context
in `fed/mosaic-output/src/main/java/org/eclipse/mosaic/fed/output/generator/file/write/WriteByLog.java`
#### Snippet
```java

    public WriteByLog(File outputFile, boolean append) {
        appenderIdx = cnt++;

        init(outputFile.getPath(), append);
```

## RuleId[id=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\/` in RegExp
in `lib/mosaic-utils/src/main/java/org/eclipse/mosaic/lib/util/gson/UnitFieldAdapter.java`
#### Snippet
```java

    private final static Pattern DISTANCE_PATTERN = Pattern.compile("^(-?[0-9]+\\.?[0-9]*) ?((|k|d|c|m|\\u00b5|n|kilo|deci|centi|milli|micro|nano)(miles|mile|meter|metre|m))$");
    private final static Pattern SPEED_PATTERN = Pattern.compile("^([0-9]+\\.?[0-9]*) ?(mph|kmh|(?:(|k|d|c|m|\\u00b5|n|kilo|deci|centi|milli|micro|nano)(meter|metre|m)(?:p|per|\\/)(h|hr|s|sec|second|hour)))$");

    private final static Pattern WEIGHT_PATTERN = Pattern.compile("^(-?[0-9]+\\.?[0-9]*) ?((|k|d|c|m|\\u00b5|n|kilo|deci|centi|milli|micro|nano)(g|gram|grams))$");
```

### RegExpRedundantEscape
Redundant character escape `\\/` in RegExp
in `lib/mosaic-docker/src/main/java/org/eclipse/mosaic/lib/docker/DockerClient.java`
#### Snippet
```java
    }

    private final static Pattern PORT_PATTERN = Pattern.compile("^([0-9]+)\\/.*:([0-9]+)$");

    /**
```

### RegExpRedundantEscape
Redundant character escape `\\]` in RegExp
in `rti/mosaic-rti-api/src/main/java/org/eclipse/mosaic/rti/api/federatestarter/ExecutableFederateExecutor.java`
#### Snippet
```java
            if (line.length() > 0) {
                log.debug(line);
                if (line.matches("\\s*\\[\\d+\\]\\s\\d+\\s*")) {
                    pid = Integer.parseInt(line.split("\\s")[1]);
                    log.info("Started with pid=" + pid + ".");
```

### RegExpRedundantEscape
Redundant character escape `\\\"` in RegExp
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/util/ClassNameParser.java`
#### Snippet
```java
    // ^(\d+|\d+\.\d*|\"[^\"\n]*\"|false|true)$
    private final static Pattern parameterPattern =
            Pattern.compile("^(?:((?:\\d+\\.\\d*|\\d+d))|(\\d+l)|(\\d+)|\\\"([^\\\"\\n]*)\\\"|'([^'\\n]*)'|(false|true))$");

    private final Logger logger;
```

### RegExpRedundantEscape
Redundant character escape `\\\"` in RegExp
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/util/ClassNameParser.java`
#### Snippet
```java
    // ^(\d+|\d+\.\d*|\"[^\"\n]*\"|false|true)$
    private final static Pattern parameterPattern =
            Pattern.compile("^(?:((?:\\d+\\.\\d*|\\d+d))|(\\d+l)|(\\d+)|\\\"([^\\\"\\n]*)\\\"|'([^'\\n]*)'|(false|true))$");

    private final Logger logger;
```

### RegExpRedundantEscape
Redundant character escape `\\\"` in RegExp
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/util/ClassNameParser.java`
#### Snippet
```java
    // ^(\d+|\d+\.\d*|\"[^\"\n]*\"|false|true)$
    private final static Pattern parameterPattern =
            Pattern.compile("^(?:((?:\\d+\\.\\d*|\\d+d))|(\\d+l)|(\\d+)|\\\"([^\\\"\\n]*)\\\"|'([^'\\n]*)'|(false|true))$");

    private final Logger logger;
```

### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/util/ClassNameParser.java`
#### Snippet
```java

    // ^([a-zA-Z_$][a-zA-Z\d\._$]*)(?:|\((.+)\))$
    private final static Pattern classPattern = Pattern.compile("^([a-zA-Z_$][a-zA-Z\\d\\._$]*)(?:|\\((.+)\\))$");
    // ^(\d+|\d+\.\d*|\"[^\"\n]*\"|false|true)$
    private final static Pattern parameterPattern =
```

## RuleId[id=ObsoleteCollection]
### ObsoleteCollection
Obsolete collection type `Vector<>` used
in `lib/mosaic-docker/src/main/java/org/eclipse/mosaic/lib/docker/DockerClient.java`
#### Snippet
```java
     */
    private List<Pair<Integer, Integer>> readPortBinding(String containerName) {
        final List<Pair<Integer, Integer>> bindings = new Vector<>();
        String result = docker.port(containerName).replace("\r", "");
        for (String line : StringUtils.split(result, "\n")) {
```

### ObsoleteCollection
Obsolete collection type `Vector` used
in `lib/mosaic-docker/src/main/java/org/eclipse/mosaic/lib/docker/DockerClient.java`
#### Snippet
```java

    private final DockerCommandLine docker;
    private final Vector<DockerContainer> runningContainers = new Vector<>();

    private final Logger logger = LoggerFactory.getLogger(getClass());
```

### ObsoleteCollection
Obsolete collection type `Vector<>` used
in `lib/mosaic-docker/src/main/java/org/eclipse/mosaic/lib/docker/DockerClient.java`
#### Snippet
```java

    private final DockerCommandLine docker;
    private final Vector<DockerContainer> runningContainers = new Vector<>();

    private final Logger logger = LoggerFactory.getLogger(getClass());
```

### ObsoleteCollection
Obsolete collection type `Vector<>` used
in `lib/mosaic-docker/src/main/java/org/eclipse/mosaic/lib/docker/DockerRun.java`
#### Snippet
```java
    private String name;
    private List<Pair<String, Object>> parameters = new Vector<>();
    private List<Pair<Integer, Integer>> portBindings = new Vector<>();
    private String user;
    private List<Pair<File, String>> volumeBindings = new Vector<>();
```

### ObsoleteCollection
Obsolete collection type `Vector<>` used
in `lib/mosaic-docker/src/main/java/org/eclipse/mosaic/lib/docker/DockerRun.java`
#### Snippet
```java
    private List<Pair<Integer, Integer>> portBindings = new Vector<>();
    private String user;
    private List<Pair<File, String>> volumeBindings = new Vector<>();
    private boolean removeAfterRun = false;
    private boolean removeBeforeRun;
```

### ObsoleteCollection
Obsolete collection type `Vector<>` used
in `lib/mosaic-docker/src/main/java/org/eclipse/mosaic/lib/docker/DockerRun.java`
#### Snippet
```java
    private final String image;
    private String name;
    private List<Pair<String, Object>> parameters = new Vector<>();
    private List<Pair<Integer, Integer>> portBindings = new Vector<>();
    private String user;
```

### ObsoleteCollection
Obsolete collection type `Vector<>` used
in `lib/mosaic-docker/src/main/java/org/eclipse/mosaic/lib/docker/DockerRun.java`
#### Snippet
```java
     */
    public DockerContainer execute() {
        List<String> options = new Vector<>();

        if (removeAfterRun) {
```

### ObsoleteCollection
Obsolete collection type `Vector<>` used
in `lib/mosaic-routing/src/main/java/org/eclipse/mosaic/lib/routing/graphhopper/extended/ExtendedGHResponse.java`
#### Snippet
```java
    public ExtendedGHResponse setPath(Path path) {
        this.path = path;
        this.responses = new Vector<>();
        return this;
    }
```

### ObsoleteCollection
Obsolete collection type `Vector` used
in `rti/mosaic-rti-core/src/main/java/org/eclipse/mosaic/rti/federation/DistributedFederationManagement.java`
#### Snippet
```java
     */
    private void removeDirectory(ChannelSftp channel, String dirName) throws SftpException {
        Vector<LsEntry> entries = channel.ls(dirName);
        channel.cd(dirName);
        String file;
```

### ObsoleteCollection
Obsolete collection type `Vector<>` used
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/simulation/VehicleParameters.java`
#### Snippet
```java
            newParameters = new VehicleParameters(before);
            this.vehicleOperatingSystem = vehicleOperatingSystem;
            changedParameters = new Vector<>();
        }

```

## RuleId[id=StaticPseudoFunctionalStyleMethod]
### StaticPseudoFunctionalStyleMethod
Pseudo functional style code
in `lib/mosaic-routing/src/main/java/org/eclipse/mosaic/lib/routing/graphhopper/GraphHopperEdgeProperties.java`
#### Snippet
```java
    public Iterable<GeoPoint> getGeometry() {
        Validate.notNull(currentEdgeIterator, "Edge iterator is null");
        return Iterables.transform(
                currentEdgeIterator.fetchWayGeometry(3), // 3 = fetch all pillar nodes inclusive the base and adjacent tower node
                ghPoint3D -> GeoPoint.latLon(ghPoint3D.getLat(), ghPoint3D.getLon(), ghPoint3D.getElevation())
```

## RuleId[id=DuplicateBranchesInSwitch]
### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/api/complex/SumoSpeedMode.java`
#### Snippet
```java
                break;
            case DEFAULT:
                mode.setRegardSafeSpeed(true);
                mode.setRegardMaximumAcceleration(true);
                mode.setRegardMaximumDeceleration(true);
                mode.setRegardRightOfWay(true);
                mode.setBrakeHardToAvoidRedLight(true);
                break;
            default:
```

## RuleId[id=UnnecessaryQualifierForThis]
### UnnecessaryQualifierForThis
Qualifier `AbstractOutputGenerator` on 'this' is unnecessary in this context
in `fed/mosaic-output/src/main/java/org/eclipse/mosaic/fed/output/ambassador/AbstractOutputGenerator.java`
#### Snippet
```java
            registerInteractionForOutputGeneration(annotatedTypeId, (Interaction interaction) -> {
                try {
                    m.invoke(AbstractOutputGenerator.this, interaction);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    log.warn("Could not invoke handle method for method " + interaction.getTypeId(), e.getCause());
```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`connections.size() > 0` can be replaced with '!connections.isEmpty()'
in `lib/mosaic-database/src/main/java/org/eclipse/mosaic/lib/database/route/Route.java`
#### Snippet
```java
     */
    public void addConnection(@Nonnull Connection connection) {
        if (connections.size() > 0 && Iterables.getLast(connections).getId().equals(connection.getId())) {
            return;
        }
```

### SizeReplaceableByIsEmpty
`processors.size() > 0` can be replaced with '!processors.isEmpty()'
in `lib/mosaic-utils/src/main/java/org/eclipse/mosaic/lib/util/scheduling/Event.java`
#### Snippet
```java
        this.time = time;

        Validate.isTrue(processors.size() > 0, "The processor list must contain at minimum one processor.");
        for (EventProcessor processor : processors) {
            Objects.requireNonNull(processor, "All event processors must not be null.");
```

### SizeReplaceableByIsEmpty
`processors.size() > 0` can be replaced with '!processors.isEmpty()'
in `lib/mosaic-utils/src/main/java/org/eclipse/mosaic/lib/util/scheduling/EventInterceptor.java`
#### Snippet
```java
        this.eventManager = Objects.requireNonNull(eventManager);

        Validate.isTrue(processors.size() > 0, "The processor list must contain at minimum one processor.");
        for (EventProcessor eventProcessor : processors) {
            Objects.requireNonNull(eventProcessor, "All event processors must not be null.");
```

### SizeReplaceableByIsEmpty
`applications.size() > 0` can be replaced with '!applications.isEmpty()'
in `lib/mosaic-objects/src/main/java/org/eclipse/mosaic/lib/objects/mapping/UnitMapping.java`
#### Snippet
```java

    public boolean hasApplication() {
        return applications.size() > 0;
    }

```

### SizeReplaceableByIsEmpty
`interfaces.size() == 0` can be replaced with 'interfaces.isEmpty()'
in `lib/mosaic-objects/src/main/java/org/eclipse/mosaic/lib/objects/communication/AdHocConfiguration.java`
#### Snippet
```java
     */
    public RadioMode getRadioMode() {
        if (interfaces.size() == 0) {
            return RadioMode.OFF;
        } else if (interfaces.size() == 1) {
```

### SizeReplaceableByIsEmpty
`line.length() > 0` can be replaced with '!line.isEmpty()'
in `rti/mosaic-rti-api/src/main/java/org/eclipse/mosaic/rti/api/federatestarter/ExecutableFederateExecutor.java`
#### Snippet
```java
        int pid = -1;
        while ((line = reader.readLine()) != null) {
            if (line.length() > 0) {
                log.debug(line);
                if (line.matches("\\s*\\[\\d+\\]\\s\\d+\\s*")) {
```

### SizeReplaceableByIsEmpty
`this.events.size() > 0` can be replaced with '!this.events.isEmpty()'
in `rti/mosaic-rti-core/src/main/java/org/eclipse/mosaic/rti/time/MultiThreadedTimeManagement.java`
#### Snippet
```java

        // run while events are available
        while (this.events.size() > 0 && this.time < getEndTime()) {

            // remove first event of queue
```

### SizeReplaceableByIsEmpty
`handovers.size() > 0` can be replaced with '!handovers.isEmpty()'
in `fed/mosaic-cell/src/main/java/org/eclipse/mosaic/fed/cell/ambassador/CellAmbassador.java`
#### Snippet
```java
        }

        if (handovers.size() > 0) {
            chainManager.sendInteractionToRti(new CellularHandoverUpdates(currentTime, handovers));
        }
```

### SizeReplaceableByIsEmpty
`searchSet.size() > 0` can be replaced with '!searchSet.isEmpty()'
in `lib/mosaic-utils/src/main/java/org/eclipse/mosaic/lib/util/FileUtils.java`
#### Snippet
```java
        final Set<File> matchingSet = new HashSet<>();
        while (maxDepth-- > 0) {
            if (searchSet.size() > 0) {
                Set<File> newDirectorySet = new HashSet<>();
                for (File f : searchSet) {
```

### SizeReplaceableByIsEmpty
`spatialObjects.size() == 0` can be replaced with 'spatialObjects.isEmpty()'
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/simulation/perception/errormodels/WallOcclusionModifier.java`
#### Snippet
```java
    @Override
    public <T extends SpatialObject> List<T> apply(PerceptionModuleOwner owner, List<T> spatialObjects) {
        if (spatialObjects.size() == 0) {
            return spatialObjects;
        }
```

### SizeReplaceableByIsEmpty
`spatialObjects.size() == 0` can be replaced with 'spatialObjects.isEmpty()'
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/simulation/perception/errormodels/DistanceModifier.java`
#### Snippet
```java
    @Override
    public <T extends SpatialObject> List<T> apply(PerceptionModuleOwner owner, List<T> spatialObjects) {
        if (spatialObjects.size() == 0) {
            return spatialObjects;
        }
```

### SizeReplaceableByIsEmpty
`spatialObjects.size() == 0` can be replaced with 'spatialObjects.isEmpty()'
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/simulation/perception/errormodels/SimpleOcclusionModifier.java`
#### Snippet
```java
    @Override
    public <T extends SpatialObject> List<T> apply(PerceptionModuleOwner owner, List<T> spatialObjects) {
        if (spatialObjects.size() == 0) {
            return spatialObjects;
        }
```

### SizeReplaceableByIsEmpty
`laneAssignment.getAllowedVehicleClasses().size() == 0` can be replaced with 'laneAssignment.getAllowedVehicleClasses().isEmpty()'
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/util/TrafficSignManager.java`
#### Snippet
```java
        } else if (laneAssignment.getAllowedVehicleClasses().size() == 1 && laneAssignment.isVehicleClassAllowed(VehicleClass.ElectricVehicle)) {
            assignment = "EV";
        } else if (laneAssignment.getAllowedVehicleClasses().size() == 0) {
            //special case: load empty sign with speed-limit background
            Path imageFile = imageCreatorSpeedLimits.getOrCreateImage(null, laneAssignment.getLane());
```

### SizeReplaceableByIsEmpty
`resultObjects.size() > 0` can be replaced with '!resultObjects.isEmpty()'
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/AbstractTraciCommand.java`
#### Snippet
```java
                        }
                    }
                    if (resultObjects.size() > 0) {
                        results.add(constructResult(status, resultObjects.toArray(new Object[0])));
                    }
```

### SizeReplaceableByIsEmpty
`line.length() > 0` can be replaced with '!line.isEmpty()'
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/ambassador/AbstractSumoAmbassador.java`
#### Snippet
```java
            Thread.sleep(1000);
            while (((line = sumoInputReader.readLine()) != null)) {
                if (line.length() > 0) {
                    if (log.isDebugEnabled()) {
                        log.debug(line);
```

### SizeReplaceableByIsEmpty
`line.length() > 0` can be replaced with '!line.isEmpty()'
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/ambassador/AbstractSumoAmbassador.java`
#### Snippet
```java
                BufferedReader sumoErrorReader = new BufferedReader(new InputStreamReader(err, StandardCharsets.UTF_8));
                while (((line = sumoErrorReader.readLine()) != null)) {
                    if (line.length() > 0) {
                        log.error(line);
                    }
```

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `lib/mosaic-utils/src/main/java/org/eclipse/mosaic/lib/util/objects/ObjectInstantiation.java`
#### Snippet
```java
        }
        boolean containsLineseperator = json.contains("\n");
        return new StringBuilder()
                .append(json.substring(0, maxLength - 100))
                .append(containsLineseperator ? NEWLINE : "")
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `lib/mosaic-objects/src/main/java/org/eclipse/mosaic/lib/objects/v2x/etsi/cam/VehicleAwarenessData.java`
#### Snippet
```java
    public String toString() {
        if (cachedString == null) {
            StringBuilder sb = new StringBuilder("VehicleAwarenessData[");
            sb.append("vehicleClass:").append(vehicleClass);
            sb.append(", width:").append(width);
```

### StringBufferReplaceableByString
`StringBuffer sb` can be replaced with 'String'
in `app/tutorials/traffic-light-communication/src/main/java/org/eclipse/mosaic/app/tutorial/message/IntraVehicleMsg.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("IntraVehicleMsg{");
        sb.append("origin='").append(origin).append('\'');
        sb.append(", id=").append(id);
```

### StringBufferReplaceableByString
`StringBuffer sb` can be replaced with 'String'
in `app/tutorials/traffic-light-communication/src/main/java/org/eclipse/mosaic/app/tutorial/message/GreenWaveMsg.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("GreenWaveMsg{");
        sb.append("message='").append(message).append('\'');
        sb.append('}');
```

### StringBufferReplaceableByString
`StringBuffer sb` can be replaced with 'String'
in `app/tutorials/traffic-light-communication/src/main/java/org/eclipse/mosaic/app/tutorial/message/InterVehicleMsg.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("InterVehicleMsg{");
        sb.append("senderPosition=").append(senderPosition);
        sb.append('}');
```

## RuleId[id=NonShortCircuitBoolean]
### NonShortCircuitBoolean
Non-short-circuit boolean expression `isValidPackage |= info.getName().startsWith(allowedPackageName)`
in `lib/mosaic-utils/src/main/java/org/eclipse/mosaic/lib/util/InteractionUtils.java`
#### Snippet
```java
                    boolean isValidPackage = info.getName().startsWith("org.eclipse.mosaic");;
                    for (String allowedPackageName: allowedPackages) {
                        isValidPackage |= info.getName().startsWith(allowedPackageName);
                    }
                    if (!isValidPackage || info.getName().contains("ClientServerChannelProtos")) {
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `fillEdgesFrom(shortestWeightsFrom, heapFrom) & fillEdgesTo(shortestWeightsTo, he...`
in `lib/mosaic-routing/src/main/java/org/eclipse/mosaic/lib/routing/graphhopper/algorithm/AbstractCamvitChoiceRouting.java`
#### Snippet
```java
        boolean finished = false;
        while (!finished) {
            finished = fillEdgesFrom(shortestWeightsFrom, heapFrom) & fillEdgesTo(shortestWeightsTo,
                    heapTo);
        }

```

## RuleId[id=ManualMinMaxCalculation]
### ManualMinMaxCalculation
Can be replaced with 'Math.min()' call
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/math/MathUtils.java`
#### Snippet
```java
        if (a < b && a < c) {
            return a;
        } else if (b < c) {
            return b;
        } else {
```

### ManualMinMaxCalculation
Can be replaced with 'Math.max()' call
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/math/MathUtils.java`
#### Snippet
```java
        if (a > b && a > c) {
            return a;
        } else if (b > c) {
            return b;
        } else {
```

### ManualMinMaxCalculation
Can be replaced with 'Math.min()' call
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/math/MathUtils.java`
#### Snippet
```java
        if (a < b && a < c) {
            return a;
        } else if (b < c) {
            return b;
        } else {
```

### ManualMinMaxCalculation
Can be replaced with 'Math.max()' call
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/math/MathUtils.java`
#### Snippet
```java
        if (a > b && a > c) {
            return a;
        } else if (b > c) {
            return b;
        } else {
```

## RuleId[id=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `lib/mosaic-database/src/main/java/org/eclipse/mosaic/lib/database/DatabaseUtils.java`
#### Snippet
```java
                if (connectionOutgoing.size() == 1) {
                    databaseBuilder.addRestriction(
                            ++restrictionIdCounter + "",
                            Restriction.Type.Only,
                            connection.getWay().getId(),
```

### TrivialStringConcatenation
Empty string used in concatenation
in `lib/mosaic-database/src/main/java/org/eclipse/mosaic/lib/database/DatabaseUtils.java`
#### Snippet
```java
                        if (!connectionOutgoing.contains(outgoing)) {
                            databaseBuilder.addRestriction(
                                    ++restrictionIdCounter + "",
                                    Restriction.Type.Not,
                                    connection.getWay().getId(),
```

### TrivialStringConcatenation
Empty string used in concatenation
in `rti/mosaic-rti-core/src/main/java/org/eclipse/mosaic/rti/time/AbstractTimeManagement.java`
#### Snippet
```java
    public void startExternalWatchDog(String simId, int port) {
        if (port > 0) {
            progressLogger.info("" + port);
            externalWatchDog = new ExternalWatchDog(federation, port);
            externalWatchDog.start();
```

### TrivialStringConcatenation
Empty string used in concatenation
in `fed/mosaic-cell/src/main/java/org/eclipse/mosaic/fed/cell/config/util/ConfigurationReader.java`
#### Snippet
```java
            return oiRegion.readFile(configFile, configBuilder);
        } catch (InstantiationException | JsonParseException ex) {
            log.error("Could not read configuration " + configPath + "", ex);
            throw new InternalFederateException(ex);
        }
```

### TrivialStringConcatenation
Empty string used in concatenation
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/gson/UtmPointAdapter.java`
#### Snippet
```java
        object.add("easting", new JsonPrimitive(point.getEasting()));
        object.add("northing", new JsonPrimitive(point.getNorthing()));
        object.add("zone", new JsonPrimitive(point.getZone().getNumber() + "" + point.getZone().getLetter()));
        return object;
    }
```

### TrivialStringConcatenation
Empty string used in concatenation
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/util/TrafficSignImageCreator.java`
#### Snippet
```java

                // Add text (lane index)
                text = "" + lane;
                int maxWidth = width - 6 * borderWidth;
                Dimension textSize = makeTextFitDimension(g, new Dimension(maxWidth, maxWidth), text, false);
```

## RuleId[id=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `LogStatements` has no concrete subclass
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/ambassador/LogStatements.java`
#### Snippet
```java
 * information. Using constants improves the performance.
 */
abstract class LogStatements {

    static String VEHICLE_SLOWDOWN_REQ = "Receive VehicleSlowDown request";
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends Node`
in `lib/mosaic-database/src/main/java/org/eclipse/mosaic/lib/database/DatabaseUtils.java`
#### Snippet
```java
     * @return Lists of graph nodes.
     */
    public static ArrayList<Set<Node>> detectGraphs(Collection<Node> nodes) {
        Set<Node> visitedNodes = new HashSet<>();
        ArrayList<Set<Node>> foundGraphs = new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? extends Node`
in `lib/mosaic-database/src/main/java/org/eclipse/mosaic/lib/database/road/Connection.java`
#### Snippet
```java
     * @param node Nodes to add.
     */
    public void addNodes(@Nonnull List<Node> node) {
        Objects.requireNonNull(node);
        nodes.addAll(node);
```

### BoundedWildcard
Can generalize to `? extends T`
in `lib/mosaic-database/src/main/java/org/eclipse/mosaic/lib/database/persistence/SQLiteAccess.java`
#### Snippet
```java
        }

        protected <T> T get(String columnName, T defaultValue, Function<Object, T> objectMapper) {
            Integer column = columnIndex.get(columnName);
            if (column != null) {
```

### BoundedWildcard
Can generalize to `? super String`
in `lib/mosaic-utils/src/main/java/org/eclipse/mosaic/lib/util/ProcessLoggingThread.java`
#### Snippet
```java
    private boolean running = true;

    public ProcessLoggingThread(String processName, InputStream stream, Consumer<String> lineConsumer) {
        this.processName = processName;
        this.stream = stream;
```

### BoundedWildcard
Can generalize to `? super CartesianPoint`
in `fed/mosaic-sns/src/main/java/org/eclipse/mosaic/fed/sns/ambassador/TransmissionSimulator.java`
#### Snippet
```java
     */
    public static Map<String, SimulationNode> getEntitiesInArea(
            Map<String, SimulationNode> relevantEntities, Area<CartesianPoint> range) {
        Map<String, SimulationNode> results = new HashMap<>();

```

### BoundedWildcard
Can generalize to `? super CartesianPoint`
in `fed/mosaic-sns/src/main/java/org/eclipse/mosaic/fed/sns/ambassador/TransmissionSimulator.java`
#### Snippet
```java
    }

    private boolean isNodeInArea(CartesianPoint nodePosition, Area<CartesianPoint> destinationArea) {
        if (nodePosition == null) {
            log.warn("position of the unit is null");
```

### BoundedWildcard
Can generalize to `? extends EventProcessor`
in `lib/mosaic-utils/src/main/java/org/eclipse/mosaic/lib/util/scheduling/EventBuilder.java`
#### Snippet
```java
     * @return this {@link EventBuilder} to continue building
     */
    public EventBuilder withProcessors(Collection<EventProcessor> processors) {
        this.processors.addAll(processors);
        return this;
```

### BoundedWildcard
Can generalize to `? extends Callable`
in `lib/mosaic-utils/src/main/java/org/eclipse/mosaic/lib/util/scheduling/MultiThreadedEventScheduler.java`
#### Snippet
```java
     * @return the total of processed events by all threads.
     */
    private int executeEvents(List<Callable<Integer>> executables) {
        int processedEvents = 0;

```

### BoundedWildcard
Can generalize to `? extends T`
in `lib/mosaic-utils/src/main/java/org/eclipse/mosaic/lib/util/objects/ObjectInstantiation.java`
#### Snippet
```java
     * @param logger The logger which is used to log debug information and warnings.
     */
    public ObjectInstantiation(Class<T> clazz, Logger logger) {
        this.clazz = clazz;
        this.logger = logger;
```

### BoundedWildcard
Can generalize to `? extends SimulationNode`
in `fed/mosaic-sns/src/main/java/org/eclipse/mosaic/fed/sns/model/SophisticatedAdhocTransmissionModel.java`
#### Snippet
```java
     */
    private Map<String, TransmissionResult> flooding(
            String senderName, Map<String, SimulationNode> receivers,
            TransmissionParameter transmissionParameter, Map<String, SimulationNode> currentNodes) {
        Map<String, TransmissionResult> results = new HashMap<>();
```

### BoundedWildcard
Can generalize to `? extends SimulationNode`
in `fed/mosaic-sns/src/main/java/org/eclipse/mosaic/fed/sns/model/SophisticatedAdhocTransmissionModel.java`
#### Snippet
```java
    private Map<String, TransmissionResult> flooding(
            String senderName, Map<String, SimulationNode> receivers,
            TransmissionParameter transmissionParameter, Map<String, SimulationNode> currentNodes) {
        Map<String, TransmissionResult> results = new HashMap<>();
        receivers.forEach((receiverName, receiver) -> results.put(receiverName, new TransmissionResult(false, 0)));
```

### BoundedWildcard
Can generalize to `? extends SimulationNode`
in `fed/mosaic-sns/src/main/java/org/eclipse/mosaic/fed/sns/model/SophisticatedAdhocTransmissionModel.java`
#### Snippet
```java
     */
    private boolean canReachEntityInDestinationArea(String senderName,
                                                    Map<String, SimulationNode> possibleReceivers,
                                                    Map<String, SimulationNode> currentNodes) {
        SimulationNode sender = currentNodes.get(senderName);
```

### BoundedWildcard
Can generalize to `? extends SimulationNode`
in `fed/mosaic-sns/src/main/java/org/eclipse/mosaic/fed/sns/model/SophisticatedAdhocTransmissionModel.java`
#### Snippet
```java
    private boolean canReachEntityInDestinationArea(String senderName,
                                                    Map<String, SimulationNode> possibleReceivers,
                                                    Map<String, SimulationNode> currentNodes) {
        SimulationNode sender = currentNodes.get(senderName);
        CartesianPoint senderPosition = sender.getPosition();
```

### BoundedWildcard
Can generalize to `? extends FederateDescriptor`
in `rti/mosaic-starter/src/main/java/org/eclipse/mosaic/starter/MosaicSimulation.java`
#### Snippet
```java
     * @throws Exception if something went wrong during initalization of any federate
     */
    private ComponentProvider createFederation(final MosaicComponentParameters simulationParams, final List<FederateDescriptor> federates) throws Exception {
        final ComponentProvider componentProvider = componentProviderFactory.createComponentProvider(simulationParams);

```

### BoundedWildcard
Can generalize to `? super String`
in `fed/mosaic-mapping/src/main/java/org/eclipse/mosaic/fed/mapping/ambassador/VehicleFlowGenerator.java`
#### Snippet
```java
    }

    void collectVehicleTypes(HashMap<String, VehicleType> types) {
        for (VehicleTypeSpawner vehicleTypeSpawner : this.types) {
            String key = vehicleTypeSpawner.getPrototypeName();
```

### BoundedWildcard
Can generalize to `? super VehicleType`
in `fed/mosaic-mapping/src/main/java/org/eclipse/mosaic/fed/mapping/ambassador/VehicleFlowGenerator.java`
#### Snippet
```java
    }

    void collectVehicleTypes(HashMap<String, VehicleType> types) {
        for (VehicleTypeSpawner vehicleTypeSpawner : this.types) {
            String key = vehicleTypeSpawner.getPrototypeName();
```

### BoundedWildcard
Can generalize to `? extends Segment`
in `lib/mosaic-objects/src/main/java/org/eclipse/mosaic/lib/objects/v2x/etsi/IvimContent.java`
#### Snippet
```java
    }

    public IvimContent addSegments(List<Segment> segments) {
        this.segments.addAll(segments);
        return this;
```

### BoundedWildcard
Can generalize to `? extends List`
in `fed/mosaic-mapping/src/main/java/org/eclipse/mosaic/fed/mapping/ambassador/SpawningFramework.java`
#### Snippet
```java

    private List<CPrototype> replaceWithTypesFromPredefinedDistribution(
            CVehicle spawner, Map<String, List<CPrototype>> typeDistributions, RandomNumberGenerator rng) {
        // return distribution given by typeDistribution
        if (spawner.typeDistribution != null) {
```

### BoundedWildcard
Can generalize to `? extends CPrototype`
in `fed/mosaic-mapping/src/main/java/org/eclipse/mosaic/fed/mapping/ambassador/SpawningFramework.java`
#### Snippet
```java
    }

    private void randomizeWeights(RandomNumberGenerator rng, List<CPrototype> types) {
        double sum = 0d;
        for (CPrototype type : types) {
```

### BoundedWildcard
Can generalize to `? extends T`
in `lib/mosaic-objects/src/main/java/org/eclipse/mosaic/lib/objects/trafficsign/TrafficSign.java`
#### Snippet
```java
    }

    void addSignContents(List<T> signContents) {
        this.signContents.addAll(signContents);
    }
```

### BoundedWildcard
Can generalize to `? extends Route`
in `lib/mosaic-routing/src/main/java/org/eclipse/mosaic/lib/routing/database/RouteManager.java`
#### Snippet
```java
    }

    private int getMaxRouteID(Collection<Route> routes) {
        int id = 0;
        for (Route r : routes) {
```

### BoundedWildcard
Can generalize to `? extends Connection`
in `lib/mosaic-routing/src/main/java/org/eclipse/mosaic/lib/routing/util/RouteFixer.java`
#### Snippet
```java
    }

    private double lengthOfConnections(List<Connection> connections) {
        return connections == null ? Double.MAX_VALUE : connections.stream().map(Connection::getLength).reduce(0d, Double::sum);
    }
```

### BoundedWildcard
Can generalize to `? extends Connection`
in `lib/mosaic-routing/src/main/java/org/eclipse/mosaic/lib/routing/util/RouteFixer.java`
#### Snippet
```java
    }

    private List<String> convertConnectionsToIds(List<Connection> fixedRoute) {
        return fixedRoute.stream().map(Connection::getId).collect(Collectors.toList());
    }
```

### BoundedWildcard
Can generalize to `? extends Node`
in `lib/mosaic-routing/src/main/java/org/eclipse/mosaic/lib/routing/graphhopper/DatabaseGraphLoader.java`
#### Snippet
```java
     * @return List of points representing the geometry.
     */
    private PointList getWayGeometry(Node from, Node to, List<Node> wayNodeList) {
        PointList points = new PointList(1000, true);

```

### BoundedWildcard
Can generalize to `? super String`
in `lib/mosaic-routing/src/main/java/org/eclipse/mosaic/lib/routing/graphhopper/GraphHopperRouting.java`
#### Snippet
```java
     * @return True, if not duplicate in the set.
     */
    private boolean checkForDuplicate(CandidateRoute route, Set<String> duplicateSet) {
        String nodeIdList = StringUtils.join(route.getConnectionIds(), ",");
        return duplicateSet.add(nodeIdList);
```

### BoundedWildcard
Can generalize to `? extends InteractionDescriptor`
in `rti/mosaic-rti-core/src/main/java/org/eclipse/mosaic/rti/interaction/TypeBasedInteractionManagement.java`
#### Snippet
```java

    @Override
    public void subscribeInteractions(String federateId, Collection<InteractionDescriptor> interactionIds) throws IllegalArgumentException {
        if (!federation.getFederationManagement().isFederateJoined(federateId)) {
            throw new IllegalArgumentException("Federate with id \"" + federateId + "\" is unknown.");
```

### BoundedWildcard
Can generalize to `? super SPTEntry`
in `lib/mosaic-routing/src/main/java/org/eclipse/mosaic/lib/routing/graphhopper/algorithm/DijkstraCamvitChoiceRouting.java`
#### Snippet
```java
    }

    void fillEdges(SPTEntry curr, PriorityQueue<SPTEntry> prioQueue,
                   IntObjectMap<SPTEntry> shortestWeightMap, EdgeExplorer explorer, boolean reverse) {

```

### BoundedWildcard
Can generalize to `? super SPTEntry`
in `lib/mosaic-routing/src/main/java/org/eclipse/mosaic/lib/routing/graphhopper/algorithm/AStarCamvitChoiceRouting.java`
#### Snippet
```java
    }

    private void fillEdges(SPTEntry curr, PriorityQueue<SPTEntry> prioQueueOpenSet,
                           IntObjectMap<SPTEntry> shortestWeightMap, EdgeExplorer explorer, boolean reverse) {

```

### BoundedWildcard
Can generalize to `? super SPTEntry`
in `lib/mosaic-routing/src/main/java/org/eclipse/mosaic/lib/routing/graphhopper/algorithm/AStarCamvitChoiceRouting.java`
#### Snippet
```java

    private void fillEdges(SPTEntry curr, PriorityQueue<SPTEntry> prioQueueOpenSet,
                           IntObjectMap<SPTEntry> shortestWeightMap, EdgeExplorer explorer, boolean reverse) {

        int currNode = curr.adjNode;
```

### BoundedWildcard
Can generalize to `? extends OutputGeneratorLoader`
in `fed/mosaic-output/src/main/java/org/eclipse/mosaic/fed/output/ambassador/OutputAmbassador.java`
#### Snippet
```java
     * @param loaders the loaders to create output generators.
     */
    private void createOutputGenerator(Collection<OutputGeneratorLoader> loaders) {
        for (OutputGeneratorLoader config : loaders) {
            final AbstractOutputGenerator generator;
```

### BoundedWildcard
Can generalize to `? extends File`
in `lib/mosaic-utils/src/main/java/org/eclipse/mosaic/lib/util/FileUtils.java`
#### Snippet
```java
    }

    public static Collection<File> searchForFiles(Collection<File> rootFiles, Predicate<File> acceptPredicate, int maxDepth) {
        Set<File> searchSet = new HashSet<>(rootFiles);

```

### BoundedWildcard
Can generalize to `? super File`
in `lib/mosaic-utils/src/main/java/org/eclipse/mosaic/lib/util/FileUtils.java`
#### Snippet
```java
    }

    public static Collection<File> searchForFiles(Collection<File> rootFiles, Predicate<File> acceptPredicate, int maxDepth) {
        Set<File> searchSet = new HashSet<>(rootFiles);

```

### BoundedWildcard
Can generalize to `? super INode`
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/navigation/CentralNavigationComponent.java`
#### Snippet
```java
     * @return A node if a valid one is found, otherwise {@code null}.
     */
    INode getNextNodeOnRoute(String routeId, IRoadPosition roadPosition, Predicate<INode> nodeCondition) {
        VehicleRoute currentRoute = routeMap.get(routeId);

```

### BoundedWildcard
Can generalize to `? extends CandidateRoute`
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/navigation/CentralNavigationComponent.java`
#### Snippet
```java
     */
    @SuppressWarnings("unused")
    public Collection<CandidateRoute> approximateCosts(Collection<CandidateRoute> candidateRoutes, String lastNodeId) {
        List<CandidateRoute> routesWithCosts = new ArrayList<>();
        for (CandidateRoute candidateRoute : candidateRoutes) {
```

### BoundedWildcard
Can generalize to `? extends T`
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/simulation/perception/AbstractPerceptionModule.java`
#### Snippet
```java
    abstract List<SpatialObject> getObjectsInRange();

    private <T extends SpatialObject<T>> List<T> applyPerceptionModifiers(List<T> objectsInRange) {
        List<T> filteredList = new ArrayList<>(objectsInRange);
        // create copy of all perceived objects to avoid interference with modifiers of other perception modules.
```

### BoundedWildcard
Can generalize to `? extends VehicleData`
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/simulation/perception/index/providers/VehicleIndex.java`
#### Snippet
```java
     * @param vehiclesToUpdate the list of vehicles to add or update in the index
     */
    public void updateVehicles(Iterable<VehicleData> vehiclesToUpdate) {
        vehiclesToUpdate.forEach(v -> {
            CartesianPoint vehiclePosition = v.getProjectedPosition();
```

### BoundedWildcard
Can generalize to `? extends VehicleObject`
in `app/tutorials/example-applications/src/main/java/org/eclipse/mosaic/app/tutorial/vehicle/PerceptionApp.java`
#### Snippet
```java
    }

    private void colorVehicles(List<VehicleObject> vehiclesToColor, List<VehicleObject> previouslyColoredVehicles, Color color) {
        for (VehicleObject currentVehicle : vehiclesToColor) {
            if (!previouslyColoredVehicles.contains(currentVehicle)) {
```

### BoundedWildcard
Can generalize to `? extends GeoPoint`
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/geo/GeoPolygon.java`
#### Snippet
```java
    }

    private GeoRectangle calcBoundingBox(List<GeoPoint> vertices) {
        double maxLat = -90;
        double minLat = 90;
```

### BoundedWildcard
Can generalize to `? extends GeoPoint`
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/geo/GeoPolygon.java`
#### Snippet
```java
     * @param coordinates A list of lists of {@link GeoPoint}s
     */
    public GeoPolygon(List<GeoPoint> coordinates) {
        final List<GeoPoint> verticesTmp = new ArrayList<>(coordinates);
        if (!verticesTmp.get(0).equals(verticesTmp.get(verticesTmp.size() - 1))) {
```

### BoundedWildcard
Can generalize to `? extends CartesianPoint`
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/geo/CartesianPolygon.java`
#### Snippet
```java
     * @param coordinates A list of lists of {@link CartesianPoint}s
     */
    public CartesianPolygon(List<CartesianPoint> coordinates) {
        final List<CartesianPoint> verticesTmp = new ArrayList<>(coordinates);
        if (!verticesTmp.get(0).equals(verticesTmp.get(verticesTmp.size() - 1))) {
```

### BoundedWildcard
Can generalize to `? extends CartesianPoint`
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/geo/CartesianPolygon.java`
#### Snippet
```java
    }

    private CartesianRectangle calcBoundingBox(List<CartesianPoint> vertices) {
        double maxY = -Long.MAX_VALUE;
        double minY = Long.MAX_VALUE;
```

### BoundedWildcard
Can generalize to `? super T`
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/spatial/LineString.java`
#### Snippet
```java
    }

    public void walk(Walker<T> walker) {
        double pos = 0;
        for (int i = 0; i < size(); i++) {
```

### BoundedWildcard
Can generalize to `? super T`
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/spatial/LineString.java`
#### Snippet
```java
    }

    public <R extends LineString<T>> R translateLateralByPoints(Function<T, Double> translationFun, R result) {
        checkNotSingular();
        result.clear();
```

### BoundedWildcard
Can generalize to `? super Double`
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/spatial/LineString.java`
#### Snippet
```java
    }

    public <R extends LineString<T>> R translateLateral(Function<Double, Double> translationFun, R result) {
        checkNotSingular();
        result.clear();
```

### BoundedWildcard
Can generalize to `? extends Vector3d`
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/spatial/QuickHull2d.java`
#### Snippet
```java
    }

    private QuickHull2d(ArrayList<Vector3d> points) {
        this.points = points;
    }
```

### BoundedWildcard
Can generalize to `? extends P`
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/spatial/AStar.java`
#### Snippet
```java
         * cost: e.g. travel speed, road capacity, etc.
         */
        default double getCost(Node<T, P> nextNode) {
            return getPosition().distanceTo(nextNode.getPosition());
        }
```

### BoundedWildcard
Can generalize to `? extends P`
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/spatial/AStar.java`
#### Snippet
```java
         * other factors (travel speed, ...) as well.
         */
        default double estimateCost(Node<T, P> destinationNode) {
            return getPosition().distanceTo(destinationNode.getPosition());
        }
```

### BoundedWildcard
Can generalize to `? extends T`
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/spatial/KdTree.java`
#### Snippet
```java
        }

        private void split(List<T> items) {
            if (bounds.size.x > bounds.size.y && bounds.size.x > bounds.size.z) {
                items.sort(xCmp);
```

### BoundedWildcard
Can generalize to `? extends TrafficLightState`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/util/TrafficLightStateDecoder.java`
#### Snippet
```java
    }

    public static String encodeStateList(List<TrafficLightState> customStateList) {
        return customStateList.stream().map(
                (state) -> state.isGreen() ? "G"
```

### BoundedWildcard
Can generalize to `? super T`
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/spatial/Grid.java`
#### Snippet
```java
     * @return the list of results
     */
    public List<T> getItemsInBoundingArea(BoundingBox area, Predicate<T> filter, List<T> result) {
        synchronized (tmpIndexA) {
            CellIndex minIndex = toCellIndex(Math.max(area.min.x, minX), Math.max(area.min.z, minZ), tmpIndexA);
```

### BoundedWildcard
Can generalize to `? super T`
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/spatial/Grid.java`
#### Snippet
```java
    }

    public Grid(final SpatialItemAdapter<T> adapter, double cellWidth, double cellHeight,
                double minX, double maxX, double minZ, double maxZ) {
        this.adapter = adapter;
```

### BoundedWildcard
Can generalize to `? extends Phase`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/api/complex/SumoTrafficLightLogic.java`
#### Snippet
```java
     * @param currentPhase The index of the phase.
     */
    public SumoTrafficLightLogic(String logicId, List<Phase> phases, int currentPhase) {
        this.logicId = logicId;
        this.phases = phases;
```

### BoundedWildcard
Can generalize to `? extends Map`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/util/SumoVehicleTypesWriter.java`
#### Snippet
```java
    }

    private void applyParametersFromSumoConfiguration(Map<String, Map<String, String>> newVehicleTypes) {
        for (Entry<String, Map<String, String>> sumoParameterEntry : additionalVehicleTypeParameters.entrySet()) {
            String currentVehicleType = sumoParameterEntry.getKey();
```

### BoundedWildcard
Can generalize to `? super T`
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/spatial/QuadTreeTraversal.java`
#### Snippet
```java
    }

    private static <T> void selectInRadius(QuadTree.TreeNode node, Vector3d center, double rSqr, Predicate<T> filter, List<T> result) {
        if (node.isLeaf()) {
            for (int i = 0; i < node.objects.size(); i++) {
```

### BoundedWildcard
Can generalize to `? super T`
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/spatial/QuadTreeTraversal.java`
#### Snippet
```java
    }

    private static <T> void selectInRadius(QuadTree.TreeNode node, Vector3d center, double rSqr, Predicate<T> filter, List<T> result) {
        if (node.isLeaf()) {
            for (int i = 0; i < node.objects.size(); i++) {
```

### BoundedWildcard
Can generalize to `? super T`
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/spatial/QuadTreeTraversal.java`
#### Snippet
```java
    }

    private static <T> void selectInArea(QuadTree.TreeNode node, BoundingBox area, Predicate<T> filter, List<T> result) {
        if (node.isLeaf()) {
            for (int i = 0; i < node.objects.size(); i++) {
```

### BoundedWildcard
Can generalize to `? super T`
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/spatial/QuadTreeTraversal.java`
#### Snippet
```java
    }

    private static <T> void selectInArea(QuadTree.TreeNode node, BoundingBox area, Predicate<T> filter, List<T> result) {
        if (node.isLeaf()) {
            for (int i = 0; i < node.objects.size(); i++) {
```

### BoundedWildcard
Can generalize to `? extends SumoVar`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/VehicleSubscribe.java`
#### Snippet
```java
     */
    @SuppressWarnings("WeakerAccess")
    public VehicleSubscribe(Bridge bridge, Collection<SumoVar> subscriptionCodes) {
        super(TraciVersion.LOWEST);

```

### BoundedWildcard
Can generalize to `? extends T`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/reader/ListTraciReader.java`
#### Snippet
```java
    }

    public ListTraciReader(AbstractTraciResultReader<T> itemReader, boolean expectByteBeforeLength) {
        super(null);
        this.itemReader = itemReader;
```

### BoundedWildcard
Can generalize to `? super T`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/reader/AbstractTraciResultReader.java`
#### Snippet
```java
     *                <code>null</code>, if the value read from the stream should be returned by {@link #read(DataInputStream, int)}
     */
    protected AbstractTraciResultReader(@Nullable Matcher<T> matcher) {
        this.matcher = matcher;
    }
```

### BoundedWildcard
Can generalize to `? super T`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/writer/ListTraciWriter.java`
#### Snippet
```java
    }

    private static <T> int calcLengthOfList(AbstractTraciParameterWriter<T> itemWriter, List<T> list) {
        int length = 0;
        for (T item : list) {
```

### BoundedWildcard
Can generalize to `? extends T`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/writer/ListTraciWriter.java`
#### Snippet
```java
    }

    private static <T> int calcLengthOfList(AbstractTraciParameterWriter<T> itemWriter, List<T> list) {
        int length = 0;
        for (T item : list) {
```

### BoundedWildcard
Can generalize to `? super AbstractSubscriptionResult`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/libsumo/SimulationSimulateStep.java`
#### Snippet
```java
    }

    private void readLaneAreas(List<AbstractSubscriptionResult> results) {
        for (String laneArea : LANE_AREA_SUBSCRIPTIONS) {
            LaneAreaSubscriptionResult result = new LaneAreaSubscriptionResult();
```

### BoundedWildcard
Can generalize to `? super AbstractSubscriptionResult`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/libsumo/SimulationSimulateStep.java`
#### Snippet
```java
    }

    private void readInductionLoops(List<AbstractSubscriptionResult> results) {
        for (String inductionLoop : INDUCTION_LOOP_SUBSCRIPTIONS) {
            InductionLoopSubscriptionResult result = new InductionLoopSubscriptionResult();
```

### BoundedWildcard
Can generalize to `? super AbstractSubscriptionResult`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/libsumo/SimulationSimulateStep.java`
#### Snippet
```java
    }

    private void readSurroundingVehiclesFromContextSubscriptions(List<AbstractSubscriptionResult> results) {
        ContextSubscriptionResults contextResults = Vehicle.getAllContextSubscriptionResults();
        contextResults.forEach((sumoId, subscriptionResults) -> {
```

### BoundedWildcard
Can generalize to `? super AbstractSubscriptionResult`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/libsumo/SimulationSimulateStep.java`
#### Snippet
```java
    }

    private void readTrafficLights(List<AbstractSubscriptionResult> results) {
        for (String trafficLight : TRAFFIC_LIGHT_SUBSCRIPTIONS) {
            TrafficLightSubscriptionResult result = new TrafficLightSubscriptionResult();
```

### BoundedWildcard
Can generalize to `? super AbstractSubscriptionResult`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/libsumo/SimulationSimulateStep.java`
#### Snippet
```java
    }

    private void readVehicles(List<AbstractSubscriptionResult> results) {
        StringVector arrivedIds = Simulation.getArrivedIDList();
        for (String arrived : arrivedIds) {
```

### BoundedWildcard
Can generalize to `? extends SumoTrafficLightLogic.Phase`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/libsumo/TrafficLightAddProgram.java`
#### Snippet
```java
public class TrafficLightAddProgram implements org.eclipse.mosaic.fed.sumo.bridge.api.TrafficLightAddProgram {

    public void execute(Bridge bridge, String tlId, String programId, int phaseIndex, List<SumoTrafficLightLogic.Phase> phases) {
        TraCIPhaseVector traciPhases = new TraCIPhaseVector();
        for (SumoTrafficLightLogic.Phase phase : phases) {
```

### BoundedWildcard
Can generalize to `? extends TrafficLightGetControlledLinks.TrafficLightControlledLink`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/facades/TrafficLightFacade.java`
#### Snippet
```java
    private List<TrafficLight> createTrafficLights(
            TrafficLightProgram currentProgram,
            List<TrafficLightGetControlledLinks.TrafficLightControlledLink> controlledLinks,
            GeoPoint junctionPosition
    ) {
```

### BoundedWildcard
Can generalize to `? extends SumoTrafficLightLogic`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/facades/TrafficLightFacade.java`
#### Snippet
```java
     * @return Map with TrafficLightPrograms as values and their ids as keys.
     */
    private Map<String, TrafficLightProgram> transformDefinitionsIntoPrograms(List<SumoTrafficLightLogic> programDefinitions) {
        Map<String, TrafficLightProgram> programs = new LinkedHashMap<>();
        for (SumoTrafficLightLogic programDefinition : programDefinitions) {
```

### BoundedWildcard
Can generalize to `? extends AbstractSubscriptionResult`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/facades/SimulationFacade.java`
#### Snippet
```java
     * @return The segment of the vehicle.
     */
    private Map<String, String> calculateVehicleSegmentInfo(List<AbstractSubscriptionResult> subscriptions) {
        Map<String, String> vehicleToSegmentMap = new HashMap<>();
        for (AbstractSubscriptionResult laneAreaDetector : subscriptions) {
```

## RuleId[id=NullableProblems]
### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `lib/mosaic-interactions/src/main/java/org/eclipse/mosaic/interactions/communication/V2xMessageReception.java`
#### Snippet
```java
     * information given.
     */
    @Nonnull
    private final V2xReceiverInformation receiverInformation;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `lib/mosaic-utils/src/main/java/org/eclipse/mosaic/lib/util/objects/TimeCache.java`
#### Snippet
```java
     * Map containing all the message ids with the corresponding messages.
     */
    @Nonnull
    private final Map<Integer, Pair<Long, T>> cache = new ConcurrentHashMap<>();
    
```

### NullableProblems
Primitive type members cannot be annotated
in `lib/mosaic-utils/src/main/java/org/eclipse/mosaic/lib/util/scheduling/EventScheduler.java`
#### Snippet
```java
    long getScheduledTime();

    @Nonnull
    int scheduleEvents(long time);

```

### NullableProblems
Primitive type members cannot be annotated
in `lib/mosaic-utils/src/main/java/org/eclipse/mosaic/lib/util/scheduling/DefaultEventScheduler.java`
#### Snippet
```java

    @Override
    @Nonnull
    public int scheduleEvents(final long time) {
        int processedEvents = 0;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `lib/mosaic-utils/src/main/java/org/eclipse/mosaic/lib/util/scheduling/Event.java`
#### Snippet
```java
     * increase the performance.
     */
    @Nonnull
    private final List<EventProcessor> processors;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `lib/mosaic-utils/src/main/java/org/eclipse/mosaic/lib/util/scheduling/Event.java`
#### Snippet
```java
     * The resource to process.
     */
    @Nullable
    private final Object resource;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `lib/mosaic-utils/src/main/java/org/eclipse/mosaic/lib/util/scheduling/EventInterceptor.java`
#### Snippet
```java
     * The list is an unmodifiable view of all processors.
     */
    @Nonnull
    private final List<EventProcessor> processors;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `rti/mosaic-starter/src/main/java/org/eclipse/mosaic/starter/config/CScenario.java`
#### Snippet
```java
         * simulation run may return different results.
         */
        @Nullable
        public Long randomSeed;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `lib/mosaic-routing/src/main/java/org/eclipse/mosaic/lib/routing/database/LazyLoadingNode.java`
#### Snippet
```java
    /* This reference must be kept transient, since it should never be serialized (e.g. by GSON) */
    @SuppressWarnings("SE_TRANSIENT_FIELD_NOT_RESTORED")
    @Nullable
    private transient Node scenarioDatabaseNode;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `lib/mosaic-routing/src/main/java/org/eclipse/mosaic/lib/routing/database/LazyLoadingNode.java`
#### Snippet
```java

    /* This reference must be kept transient, since it should never be serialized (e.g. by GSON) */
    @Nullable
    private final transient Database database;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `lib/mosaic-routing/src/main/java/org/eclipse/mosaic/lib/routing/database/LazyLoadingWay.java`
#### Snippet
```java

    /* This reference must be kept transient, since it should never be serialized (e.g. by GSON) */
    @Nullable
    private final transient Database database;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `lib/mosaic-routing/src/main/java/org/eclipse/mosaic/lib/routing/database/LazyLoadingWay.java`
#### Snippet
```java
    /* This reference must be kept transient, since it should never be serialized (e.g. by GSON) */
    @SuppressWarnings("SE_TRANSIENT_FIELD_NOT_RESTORED")
    @Nullable
    private transient Way scenarioDatabaseWay;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `lib/mosaic-routing/src/main/java/org/eclipse/mosaic/lib/routing/database/LazyLoadingRoadPosition.java`
#### Snippet
```java

    /* This reference must be kept transient, since it should never be serialized (e.g. by GSON) */
    @Nullable
    private final transient Database database;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `lib/mosaic-routing/src/main/java/org/eclipse/mosaic/lib/routing/database/LazyLoadingConnection.java`
#### Snippet
```java

    /* This reference must be kept transient, since it should never be serialized (e.g. by GSON) */
    @Nullable
    private final transient Database database;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `lib/mosaic-routing/src/main/java/org/eclipse/mosaic/lib/routing/database/LazyLoadingConnection.java`
#### Snippet
```java
    /* This reference must be kept transient, since it should never be serialized (e.g. by GSON) */
    @SuppressWarnings("SE_TRANSIENT_FIELD_NOT_RESTORED")
    @Nullable
    private transient Connection scenarioDatabaseConnection;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/SimulationKernel.java`
#### Snippet
```java
     */
    @SuppressWarnings(value = "SE_BAD_FIELD", justification = "The simulation kernel mustn't be serializable.")
    @Nullable
    private EventManager eventManager;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/SimulationKernel.java`
#### Snippet
```java
     */
    @SuppressWarnings(value = "SE_BAD_FIELD", justification = "The simulation kernel mustn't serializable.")
    @Nullable
    private Interactable interactable;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/SimulationKernel.java`
#### Snippet
```java
     * The configuration path for the application simulator.
     */
    @Nullable
    private File configurationPath;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/SimulationKernel.java`
#### Snippet
```java
     * The configuration for the application simulator.
     */
    @Nullable
    private CApplicationAmbassador configuration;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/simulation/ChargingStationUnit.java`
#### Snippet
```java
public class ChargingStationUnit extends AbstractSimulationUnit implements ChargingStationOperatingSystem {

    @Nullable
    private ChargingStationData cs;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/simulation/VehicleUnit.java`
#### Snippet
```java
public class VehicleUnit extends AbstractSimulationUnit implements VehicleOperatingSystem {

    @Nonnull
    private final NavigationModule navigationModule;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/simulation/VehicleUnit.java`
#### Snippet
```java
    private final NavigationModule navigationModule;

    @Nonnull
    private final PerceptionModule<SimplePerceptionConfiguration> perceptionModule;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/simulation/VehicleUnit.java`
#### Snippet
```java
    private final PerceptionModule<SimplePerceptionConfiguration> perceptionModule;

    @Nonnull
    private VehicleParameters vehicleParameters;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/simulation/AbstractSimulationUnit.java`
#### Snippet
```java
     * Id (name) which indicates the unit.
     */
    @Nonnull
    private final String id;

```

## RuleId[id=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-interactions/src/main/java/org/eclipse/mosaic/interactions/traffic/InductionLoopDetectorSubscription.java`
#### Snippet
```java
     * String identifying the type of this interaction.
     */
    public final static String TYPE_ID = createTypeIdentifier(InductionLoopDetectorSubscription.class);

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-interactions/src/main/java/org/eclipse/mosaic/interactions/traffic/TrafficLightSubscription.java`
#### Snippet
```java
     * String identifying the type of this interaction.
     */
    public final static String TYPE_ID = createTypeIdentifier(org.eclipse.mosaic.interactions.traffic.TrafficLightSubscription.class);

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-interactions/src/main/java/org/eclipse/mosaic/interactions/traffic/LaneAreaDetectorSubscription.java`
#### Snippet
```java
     * String identifying the type of this interaction.
     */
    public final static String TYPE_ID = createTypeIdentifier(LaneAreaDetectorSubscription.class);

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-interactions/src/main/java/org/eclipse/mosaic/interactions/mapping/VehicleRegistration.java`
#### Snippet
```java
     * String identifying the type of this interaction.
     */
    public final static String TYPE_ID = createTypeIdentifier(VehicleRegistration.class);

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-interactions/src/main/java/org/eclipse/mosaic/interactions/traffic/TrafficLightStateChange.java`
#### Snippet
```java
     * String identifying the type of this interaction.
     */
    public final static String TYPE_ID = createTypeIdentifier(TrafficLightStateChange.class);


```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-interactions/src/main/java/org/eclipse/mosaic/interactions/mapping/TmcRegistration.java`
#### Snippet
```java
    private static final long serialVersionUID = 1;

    public final static String TYPE_ID = createTypeIdentifier(TmcRegistration.class);

    private final TmcMapping tmcMapping;
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-interactions/src/main/java/org/eclipse/mosaic/interactions/traffic/VehicleRoutesInitialization.java`
#### Snippet
```java
     * String identifying the type of this interaction.
     */
    public final static String TYPE_ID = createTypeIdentifier(VehicleRoutesInitialization.class);

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-interactions/src/main/java/org/eclipse/mosaic/interactions/traffic/LanePropertyChange.java`
#### Snippet
```java
     * String identifying the type of this interaction.
     */
    public final static String TYPE_ID = createTypeIdentifier(LanePropertyChange.class);

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-interactions/src/main/java/org/eclipse/mosaic/interactions/mapping/RsuRegistration.java`
#### Snippet
```java
     * String identifying the type of this interaction.
     */
    public final static String TYPE_ID = createTypeIdentifier(RsuRegistration.class);

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-interactions/src/main/java/org/eclipse/mosaic/interactions/traffic/TrafficDetectorUpdates.java`
#### Snippet
```java
     * String identifying the type of this interaction.
     */
    public final static String TYPE_ID = createTypeIdentifier(TrafficDetectorUpdates.class);

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-interactions/src/main/java/org/eclipse/mosaic/interactions/traffic/VehicleTypesInitialization.java`
#### Snippet
```java
     * String identifying the type of this interaction.
     */
    public final static String TYPE_ID = createTypeIdentifier(VehicleTypesInitialization.class);

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-interactions/src/main/java/org/eclipse/mosaic/interactions/mapping/TrafficLightRegistration.java`
#### Snippet
```java
     * String identifying the type of this interaction.
     */
    public final static String TYPE_ID = createTypeIdentifier(TrafficLightRegistration.class);

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-interactions/src/main/java/org/eclipse/mosaic/interactions/traffic/TrafficLightUpdates.java`
#### Snippet
```java
     * String identifying the type of this interaction.
     */
    public final static String TYPE_ID = createTypeIdentifier(TrafficLightUpdates.class);

    private final Map<String, TrafficLightGroupInfo> updatedTrafficLights;
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-interactions/src/main/java/org/eclipse/mosaic/interactions/mapping/ServerRegistration.java`
#### Snippet
```java
     * String identifying the type of this interaction.
     */
    public final static String TYPE_ID = createTypeIdentifier(ServerRegistration.class);

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-interactions/src/main/java/org/eclipse/mosaic/interactions/mapping/advanced/RoutelessVehicleRegistration.java`
#### Snippet
```java
     * String identifying the type of this interaction.
     */
    public final static String TYPE_ID = createTypeIdentifier(RoutelessVehicleRegistration.class);

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-interactions/src/main/java/org/eclipse/mosaic/interactions/mapping/advanced/ScenarioVehicleRegistration.java`
#### Snippet
```java
     * String identifying the type of this interaction.
     */
    public final static String TYPE_ID = createTypeIdentifier(ScenarioVehicleRegistration.class);

    private final String name;
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-interactions/src/main/java/org/eclipse/mosaic/interactions/mapping/advanced/ScenarioTrafficLightRegistration.java`
#### Snippet
```java
     * String identifying the type of this interaction.
     */
    public final static String TYPE_ID = createTypeIdentifier(ScenarioTrafficLightRegistration.class);

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-interactions/src/main/java/org/eclipse/mosaic/interactions/vehicle/VehicleLaneChange.java`
#### Snippet
```java
     * string identifying the type of this interaction.
     */
    public final static String TYPE_ID = createTypeIdentifier(VehicleLaneChange.class);

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-interactions/src/main/java/org/eclipse/mosaic/interactions/traffic/VehicleUpdates.java`
#### Snippet
```java
     * String identifying the type of this interaction.
     */
    public final static String TYPE_ID = createTypeIdentifier(VehicleUpdates.class);

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-interactions/src/main/java/org/eclipse/mosaic/interactions/vehicle/VehicleRouteChange.java`
#### Snippet
```java
     * String identifying the type of this interaction.
     */
    public final static String TYPE_ID = createTypeIdentifier(VehicleRouteChange.class);

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-network/src/main/java/org/eclipse/mosaic/lib/coupling/NetworkEntityIdTransformer.java`
#### Snippet
```java
public class NetworkEntityIdTransformer implements IdTransformer<Integer, String> {

    private final static Logger log = LoggerFactory.getLogger(NetworkEntityIdTransformer.class);
    private BiMap<String, Integer> idMap = HashBiMap.create();
    private AtomicInteger nextId = new AtomicInteger();
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-interactions/src/main/java/org/eclipse/mosaic/interactions/vehicle/VehicleSensorActivation.java`
#### Snippet
```java
     * String identifying the type of this interaction.
     */
    public final static String TYPE_ID = createTypeIdentifier(VehicleSensorActivation.class);

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-interactions/src/main/java/org/eclipse/mosaic/interactions/vehicle/VehicleSpeedChange.java`
#### Snippet
```java
     * String identifying the type of this interaction.
     */
    public final static String TYPE_ID = createTypeIdentifier(VehicleSpeedChange.class);

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-interactions/src/main/java/org/eclipse/mosaic/interactions/vehicle/VehicleRouteRegistration.java`
#### Snippet
```java
     * String identifying the type of this interaction.
     */
    public final static String TYPE_ID = createTypeIdentifier(VehicleRouteRegistration.class);

    private final VehicleRoute route;
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-interactions/src/main/java/org/eclipse/mosaic/interactions/vehicle/VehicleSlowDown.java`
#### Snippet
```java
     * String identifying the type of this interaction.
     */
    public final static String TYPE_ID = createTypeIdentifier(VehicleSlowDown.class);

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-interactions/src/main/java/org/eclipse/mosaic/interactions/vehicle/VehicleFederateAssignment.java`
#### Snippet
```java
     * String identifying the type of this interaction.
     */
    public final static String TYPE_ID = createTypeIdentifier(VehicleFederateAssignment.class);

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-interactions/src/main/java/org/eclipse/mosaic/interactions/vehicle/VehicleSightDistanceConfiguration.java`
#### Snippet
```java
    private static final long serialVersionUID = 1L;

    public final static String TYPE_ID = createTypeIdentifier(VehicleSightDistanceConfiguration.class);

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-interactions/src/main/java/org/eclipse/mosaic/interactions/vehicle/VehicleParametersChange.java`
#### Snippet
```java
     * String identifying the type of this interaction.
     */
    public final static String TYPE_ID = createTypeIdentifier(VehicleParametersChange.class);

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-interactions/src/main/java/org/eclipse/mosaic/interactions/application/SumoTraciResponse.java`
#### Snippet
```java
     * String identifying the type of this interaction.
     */
    public final static String TYPE_ID = createTypeIdentifier(SumoTraciResponse.class);

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-interactions/src/main/java/org/eclipse/mosaic/interactions/application/ApplicationInteraction.java`
#### Snippet
```java
     * String identifying the type of this interaction.
     */
    public final static String TYPE_ID = createTypeIdentifier(ApplicationInteraction.class);

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-interactions/src/main/java/org/eclipse/mosaic/interactions/application/SumoTraciRequest.java`
#### Snippet
```java
     * String identifying the type of this interaction.
     */
    public final static String TYPE_ID = createTypeIdentifier(SumoTraciRequest.class);

    private final String requestId;
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-interactions/src/main/java/org/eclipse/mosaic/interactions/electricity/VehicleBatteryUpdates.java`
#### Snippet
```java
    private static final long serialVersionUID = 1L;

    public final static String TYPE_ID = createTypeIdentifier(VehicleBatteryUpdates.class);

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-interactions/src/main/java/org/eclipse/mosaic/interactions/trafficsigns/TrafficSignRegistration.java`
#### Snippet
```java
     * String identifying the type of this interaction.
     */
    public final static String TYPE_ID = createTypeIdentifier(TrafficSignRegistration.class);

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-interactions/src/main/java/org/eclipse/mosaic/interactions/environment/EnvironmentSensorActivation.java`
#### Snippet
```java
     * String identifying the type of this interaction.
     */
    public final static String TYPE_ID = createTypeIdentifier(EnvironmentSensorActivation.class);

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-interactions/src/main/java/org/eclipse/mosaic/interactions/trafficsigns/TrafficSignSpeedLimitChange.java`
#### Snippet
```java
public final class TrafficSignSpeedLimitChange extends Interaction {

    public final static String TYPE_ID = createTypeIdentifier(TrafficSignSpeedLimitChange.class);

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-interactions/src/main/java/org/eclipse/mosaic/interactions/trafficsigns/VehicleSeenTrafficSignsUpdate.java`
#### Snippet
```java
public final class VehicleSeenTrafficSignsUpdate extends Interaction {

    public final static String TYPE_ID = createTypeIdentifier(VehicleSeenTrafficSignsUpdate.class);

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-interactions/src/main/java/org/eclipse/mosaic/interactions/environment/GlobalEnvironmentUpdates.java`
#### Snippet
```java
     * String identifying the type of this interaction.
     */
    public final static String TYPE_ID = createTypeIdentifier(GlobalEnvironmentUpdates.class);

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-interactions/src/main/java/org/eclipse/mosaic/interactions/trafficsigns/TrafficSignLaneAssignmentChange.java`
#### Snippet
```java
    private static final long serialVersionUID = 1L;

    public final static String TYPE_ID = createTypeIdentifier(TrafficSignLaneAssignmentChange.class);

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-network/src/main/java/org/eclipse/mosaic/lib/coupling/ClientServerChannel.java`
#### Snippet
```java
         * Geo address with rectangular shaped area.
         */
        public final static int GEORECTANGLE = 3;
    }

```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-network/src/main/java/org/eclipse/mosaic/lib/coupling/ClientServerChannel.java`
#### Snippet
```java
         * Success message, returned by federate upon successful execution of command.
         */
        public final static int SUCCESS = 41;
    }

```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-network/src/main/java/org/eclipse/mosaic/lib/coupling/ClientServerChannel.java`
#### Snippet
```java
         * Stop simulation.
         */
        public final static int SHUT_DOWN = 4;

        /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-network/src/main/java/org/eclipse/mosaic/lib/coupling/ClientServerChannel.java`
#### Snippet
```java
         * Geo address with circular shaped area.
         */
        public final static int GEOCIRCLE = 2;

        /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-network/src/main/java/org/eclipse/mosaic/lib/coupling/ClientServerChannel.java`
#### Snippet
```java
         * Topological address.
         */
        public final static int TOPOCAST = 1;

        /**
```

### MissortedModifiers
Missorted modifiers `final private`
in `lib/mosaic-network/src/main/java/org/eclipse/mosaic/lib/coupling/ClientServerChannel.java`
#### Snippet
```java
     * Logger
     *///TODO: implement usage
    final private Logger log;

    /**
```

### MissortedModifiers
Missorted modifiers `final private`
in `lib/mosaic-network/src/main/java/org/eclipse/mosaic/lib/coupling/ClientServerChannel.java`
#### Snippet
```java
     * Output stream to network federate.
     */
    final private OutputStream out;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-network/src/main/java/org/eclipse/mosaic/lib/coupling/ClientServerChannel.java`
#### Snippet
```java
         * A virtual node has received a message.
         */
        public final static int MSG_RECV = 22;

        /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-network/src/main/java/org/eclipse/mosaic/lib/coupling/ClientServerChannel.java`
#### Snippet
```java
         * Advance simulation time.
         */
        public final static int ADVANCE_TIME = 20;

        /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-network/src/main/java/org/eclipse/mosaic/lib/coupling/ClientServerChannel.java`
#### Snippet
```java
         * Scheduling request at the next event time.
         */
        public final static int NEXT_EVENT = 21;

        /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-network/src/main/java/org/eclipse/mosaic/lib/coupling/ClientServerChannel.java`
#### Snippet
```java
         * Undefined Message.
         */
        public final static int UNDEF = -1;

        /**
```

### MissortedModifiers
Missorted modifiers `final private`
in `lib/mosaic-network/src/main/java/org/eclipse/mosaic/lib/coupling/ClientServerChannel.java`
#### Snippet
```java
     * Input stream from network federate.
     */
    final private InputStream in;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-network/src/main/java/org/eclipse/mosaic/lib/coupling/ClientServerChannel.java`
#### Snippet
```java
         * initialize the federate.
         */
        public final static int INIT = 1;

        /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-interactions/src/main/java/org/eclipse/mosaic/interactions/communication/V2xMessageReception.java`
#### Snippet
```java
     * String identifying the type of this interaction.
     */
    public final static String TYPE_ID = createTypeIdentifier(V2xMessageReception.class);

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-interactions/src/main/java/org/eclipse/mosaic/interactions/communication/AdHocCommunicationConfiguration.java`
#### Snippet
```java
     * String identifying the type of this interaction.
     */
    public final static String TYPE_ID = createTypeIdentifier(AdHocCommunicationConfiguration.class);

    private final AdHocConfiguration configuration;
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-interactions/src/main/java/org/eclipse/mosaic/interactions/communication/AdHocCommunicationConfiguration.java`
#### Snippet
```java
public final class AdHocCommunicationConfiguration extends Interaction {

    private final static long serialVersionUID = 1L;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-interactions/src/main/java/org/eclipse/mosaic/interactions/communication/V2xMessageRemoval.java`
#### Snippet
```java
     * String identifying the type of this interaction.
     */
    public final static String TYPE_ID = createTypeIdentifier(V2xMessageRemoval.class);

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-interactions/src/main/java/org/eclipse/mosaic/interactions/communication/CellularHandoverUpdates.java`
#### Snippet
```java
     * String identifying the type of this interaction.
     */
    public final static String TYPE_ID = createTypeIdentifier(CellularHandoverUpdates.class);

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-interactions/src/main/java/org/eclipse/mosaic/interactions/communication/V2xFullMessageReception.java`
#### Snippet
```java
     * String identifying the type of this interaction.
     */
    public final static String TYPE_ID = createTypeIdentifier(V2xFullMessageReception.class);

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-network/src/main/java/org/eclipse/mosaic/lib/coupling/AbstractNetworkAmbassador.java`
#### Snippet
```java
public abstract class AbstractNetworkAmbassador extends AbstractFederateAmbassador {

    private final static class RegisteredNode {

        private AdHocCommunicationConfiguration configuration;
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-interactions/src/main/java/org/eclipse/mosaic/interactions/communication/CellularCommunicationConfiguration.java`
#### Snippet
```java
     * String identifying the type of this interaction.
     */
    public final static String TYPE_ID = createTypeIdentifier(CellularCommunicationConfiguration.class);

    private final CellConfiguration configuration;
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-interactions/src/main/java/org/eclipse/mosaic/interactions/communication/V2xMessageAcknowledgement.java`
#### Snippet
```java
     * String identifying the type of this interaction.
     */
    public final static String TYPE_ID = createTypeIdentifier(V2xMessageAcknowledgement.class);

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-interactions/src/main/java/org/eclipse/mosaic/interactions/communication/V2xMessageTransmission.java`
#### Snippet
```java
     * String identifying the type of this interaction.
     */
    public final static String TYPE_ID = createTypeIdentifier(V2xMessageTransmission.class);

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-database/src/main/java/org/eclipse/mosaic/lib/database/spatial/NodeFinder.java`
#### Snippet
```java

    @SuppressWarnings(value = "SE_BAD_FIELD", justification = "The EdgeWrapper won't be serialized.")
    private final static class NodeWrapper extends Vector3d {

        private final Node node;
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-database/src/main/java/org/eclipse/mosaic/lib/database/spatial/EdgeFinder.java`
#### Snippet
```java

    @SuppressWarnings(value = "SE_BAD_FIELD", justification = "The EdgeWrapper won't be serialized.")
    private final static class EdgeWrapper extends org.eclipse.mosaic.lib.spatial.Edge<Vector3d> {

        private final Edge edge;
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-database/src/main/java/org/eclipse/mosaic/lib/database/persistence/SQLiteTypeDetector.java`
#### Snippet
```java
public class SQLiteTypeDetector extends FileTypeDetector {

    public final static String MIME_TYPE = "application/x-sqlite3";

    private final Logger log = LoggerFactory.getLogger(this.getClass());
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-database/src/main/java/org/eclipse/mosaic/lib/database/persistence/SQLiteTypeDetector.java`
#### Snippet
```java

    private final Logger log = LoggerFactory.getLogger(this.getClass());
    private final static String forComparison = "SQLite format 3";

    @Override
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sns/src/main/java/org/eclipse/mosaic/fed/sns/ambassador/TransmissionSimulator.java`
#### Snippet
```java
public class TransmissionSimulator {

    private final static Logger log = LoggerFactory.getLogger(SnsAmbassador.class);

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-utils/src/main/java/org/eclipse/mosaic/lib/util/PerformanceMonitor.java`
#### Snippet
```java
public class PerformanceMonitor {

    private final static PerformanceMonitor INSTANCE = new PerformanceMonitor(LoggerFactory.getLogger("performance"));

    public static PerformanceMonitor getInstance() {
```

### MissortedModifiers
Missorted modifiers `final private`
in `fed/mosaic-sns/src/main/java/org/eclipse/mosaic/fed/sns/ambassador/SnsAmbassador.java`
#### Snippet
```java
     * Distance configurations of vehicles which have not been moved yet by the traffic simulator.
     */
    final private Map<String, Double> registeredVehicles = new HashMap<>();

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-utils/src/main/java/org/eclipse/mosaic/lib/util/XmlUtils.java`
#### Snippet
```java
public class XmlUtils {

    private final static int DEFAULT_XML_INDENTATION = 4;

    private XmlUtils() {
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-utils/src/main/java/org/eclipse/mosaic/lib/util/gson/TimeFieldAdapter.java`
#### Snippet
```java

    private final static Pattern TIME_PATTERN = Pattern.compile("^([0-9]+[0-9_]*?\\.?[0-9]*) ?(min|minute|minutes|h|hour|hours|(|m|\\u00b5|n|milli|micro|nano)(?:|s|sec|second|seconds))$");
    private final static Map<String, Long> MULTIPLIERS = ImmutableMap.<String, Long>builder()
            .put("", TIME.SECOND)
            .put("n", TIME.NANO_SECOND)
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-utils/src/main/java/org/eclipse/mosaic/lib/util/gson/TimeFieldAdapter.java`
#### Snippet
```java
    private static final Logger log = LoggerFactory.getLogger(TimeFieldAdapter.class);

    private final static Pattern TIME_PATTERN = Pattern.compile("^([0-9]+[0-9_]*?\\.?[0-9]*) ?(min|minute|minutes|h|hour|hours|(|m|\\u00b5|n|milli|micro|nano)(?:|s|sec|second|seconds))$");
    private final static Map<String, Long> MULTIPLIERS = ImmutableMap.<String, Long>builder()
            .put("", TIME.SECOND)
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-utils/src/main/java/org/eclipse/mosaic/lib/util/gson/UnitFieldAdapter.java`
#### Snippet
```java
    private final static Pattern WEIGHT_PATTERN = Pattern.compile("^(-?[0-9]+\\.?[0-9]*) ?((|k|d|c|m|\\u00b5|n|kilo|deci|centi|milli|micro|nano)(g|gram|grams))$");

    private final static Pattern VOLTAGE_PATTERN = Pattern.compile("^(-?[0-9]+\\.?[0-9]*) ?((|k|d|c|m|\\u00b5|n|kilo|deci|centi|milli|micro|nano)(volt|volts|v))$");
    private final static Pattern CURRENT_PATTERN = Pattern.compile("^(-?[0-9]+\\.?[0-9]*) ?((|k|d|c|m|\\u00b5|n|kilo|deci|centi|milli|micro|nano)(ampere|amperes|a))$");
    private final static Pattern CAPACITY_PATTERN = Pattern.compile("^(-?[0-9]+\\.?[0-9]*) ?((|k|d|c|m|\\u00b5|n|kilo|deci|centi|milli|micro|nano)(amperehour|ampereshour|amperehours|ampereshours|ah|ahr))$");
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-utils/src/main/java/org/eclipse/mosaic/lib/util/gson/UnitFieldAdapter.java`
#### Snippet
```java

    private final static Pattern VOLTAGE_PATTERN = Pattern.compile("^(-?[0-9]+\\.?[0-9]*) ?((|k|d|c|m|\\u00b5|n|kilo|deci|centi|milli|micro|nano)(volt|volts|v))$");
    private final static Pattern CURRENT_PATTERN = Pattern.compile("^(-?[0-9]+\\.?[0-9]*) ?((|k|d|c|m|\\u00b5|n|kilo|deci|centi|milli|micro|nano)(ampere|amperes|a))$");
    private final static Pattern CAPACITY_PATTERN = Pattern.compile("^(-?[0-9]+\\.?[0-9]*) ?((|k|d|c|m|\\u00b5|n|kilo|deci|centi|milli|micro|nano)(amperehour|ampereshour|amperehours|ampereshours|ah|ahr))$");

```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-utils/src/main/java/org/eclipse/mosaic/lib/util/gson/UnitFieldAdapter.java`
#### Snippet
```java
    private final static Pattern VOLTAGE_PATTERN = Pattern.compile("^(-?[0-9]+\\.?[0-9]*) ?((|k|d|c|m|\\u00b5|n|kilo|deci|centi|milli|micro|nano)(volt|volts|v))$");
    private final static Pattern CURRENT_PATTERN = Pattern.compile("^(-?[0-9]+\\.?[0-9]*) ?((|k|d|c|m|\\u00b5|n|kilo|deci|centi|milli|micro|nano)(ampere|amperes|a))$");
    private final static Pattern CAPACITY_PATTERN = Pattern.compile("^(-?[0-9]+\\.?[0-9]*) ?((|k|d|c|m|\\u00b5|n|kilo|deci|centi|milli|micro|nano)(amperehour|ampereshour|amperehours|ampereshours|ah|ahr))$");

    private final static Map<String, Double> UNIT_MULTIPLIERS = ImmutableMap.<String, Double>builder()
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-utils/src/main/java/org/eclipse/mosaic/lib/util/gson/UnitFieldAdapter.java`
#### Snippet
```java
    private static final Logger log = LoggerFactory.getLogger(UnitFieldAdapter.class);

    private final static Pattern DISTANCE_PATTERN = Pattern.compile("^(-?[0-9]+\\.?[0-9]*) ?((|k|d|c|m|\\u00b5|n|kilo|deci|centi|milli|micro|nano)(miles|mile|meter|metre|m))$");
    private final static Pattern SPEED_PATTERN = Pattern.compile("^([0-9]+\\.?[0-9]*) ?(mph|kmh|(?:(|k|d|c|m|\\u00b5|n|kilo|deci|centi|milli|micro|nano)(meter|metre|m)(?:p|per|\\/)(h|hr|s|sec|second|hour)))$");

```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-utils/src/main/java/org/eclipse/mosaic/lib/util/gson/UnitFieldAdapter.java`
#### Snippet
```java
    private final static Pattern CAPACITY_PATTERN = Pattern.compile("^(-?[0-9]+\\.?[0-9]*) ?((|k|d|c|m|\\u00b5|n|kilo|deci|centi|milli|micro|nano)(amperehour|ampereshour|amperehours|ampereshours|ah|ahr))$");

    private final static Map<String, Double> UNIT_MULTIPLIERS = ImmutableMap.<String, Double>builder()
            .put("n", 1 / 1_000_000_000d).put("nano", 1 / 1_000_000_000d)
            .put("\u00b5", 1 / 1_000_000d).put("micro", 1 / 1_000_000d)
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-utils/src/main/java/org/eclipse/mosaic/lib/util/gson/UnitFieldAdapter.java`
#### Snippet
```java

    private final static Pattern DISTANCE_PATTERN = Pattern.compile("^(-?[0-9]+\\.?[0-9]*) ?((|k|d|c|m|\\u00b5|n|kilo|deci|centi|milli|micro|nano)(miles|mile|meter|metre|m))$");
    private final static Pattern SPEED_PATTERN = Pattern.compile("^([0-9]+\\.?[0-9]*) ?(mph|kmh|(?:(|k|d|c|m|\\u00b5|n|kilo|deci|centi|milli|micro|nano)(meter|metre|m)(?:p|per|\\/)(h|hr|s|sec|second|hour)))$");

    private final static Pattern WEIGHT_PATTERN = Pattern.compile("^(-?[0-9]+\\.?[0-9]*) ?((|k|d|c|m|\\u00b5|n|kilo|deci|centi|milli|micro|nano)(g|gram|grams))$");
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-utils/src/main/java/org/eclipse/mosaic/lib/util/gson/UnitFieldAdapter.java`
#### Snippet
```java
    private final static Pattern SPEED_PATTERN = Pattern.compile("^([0-9]+\\.?[0-9]*) ?(mph|kmh|(?:(|k|d|c|m|\\u00b5|n|kilo|deci|centi|milli|micro|nano)(meter|metre|m)(?:p|per|\\/)(h|hr|s|sec|second|hour)))$");

    private final static Pattern WEIGHT_PATTERN = Pattern.compile("^(-?[0-9]+\\.?[0-9]*) ?((|k|d|c|m|\\u00b5|n|kilo|deci|centi|milli|micro|nano)(g|gram|grams))$");

    private final static Pattern VOLTAGE_PATTERN = Pattern.compile("^(-?[0-9]+\\.?[0-9]*) ?((|k|d|c|m|\\u00b5|n|kilo|deci|centi|milli|micro|nano)(volt|volts|v))$");
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-utils/src/main/java/org/eclipse/mosaic/lib/util/gson/DataFieldAdapter.java`
#### Snippet
```java
    private final static String UNLIMITED = "unlimited";

    private final static Pattern BANDWIDTH_PATTERN = Pattern.compile("^([0-9]+\\.?[0-9]*) ?(|(|k|M|G|T|Ki|Mi|Gi|Ti)(B|b|bit|Bit|bits|Bits|byte|Byte|bytes|Bytes)(|ps))$");
    private final static Map<String, Long> MULTIPLIERS = ImmutableMap.<String, Long>builder()
            .put("", DATA.BIT)
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-utils/src/main/java/org/eclipse/mosaic/lib/util/gson/DataFieldAdapter.java`
#### Snippet
```java

    private final static Pattern BANDWIDTH_PATTERN = Pattern.compile("^([0-9]+\\.?[0-9]*) ?(|(|k|M|G|T|Ki|Mi|Gi|Ti)(B|b|bit|Bit|bits|Bits|byte|Byte|bytes|Bytes)(|ps))$");
    private final static Map<String, Long> MULTIPLIERS = ImmutableMap.<String, Long>builder()
            .put("", DATA.BIT)
            .put("k", DATA.KILOBIT)
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-utils/src/main/java/org/eclipse/mosaic/lib/util/gson/DataFieldAdapter.java`
#### Snippet
```java
    private static final Logger log = LoggerFactory.getLogger(DataFieldAdapter.class);

    private final static String UNLIMITED = "unlimited";

    private final static Pattern BANDWIDTH_PATTERN = Pattern.compile("^([0-9]+\\.?[0-9]*) ?(|(|k|M|G|T|Ki|Mi|Gi|Ti)(B|b|bit|Bit|bits|Bits|byte|Byte|bytes|Bytes)(|ps))$");
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-utils/src/main/java/org/eclipse/mosaic/lib/util/gson/PolymorphismTypeAdapterFactory.java`
#### Snippet
```java
public class PolymorphismTypeAdapterFactory implements TypeAdapterFactory {

    private final static String classFieldName = "__class";

    public static class PolymorphismTypeAdapter<R> extends TypeAdapter<R> {
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-utils/src/main/java/org/eclipse/mosaic/lib/util/InteractionUtils.java`
#### Snippet
```java
public class InteractionUtils {

    private final static Logger log = LoggerFactory.getLogger(InteractionUtils.class);

    private static Map<String, Class<?>> supportedInteractions = new HashMap<>();
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-utils/src/main/java/org/eclipse/mosaic/lib/util/scheduling/DefaultEventScheduler.java`
#### Snippet
```java
public class DefaultEventScheduler implements EventScheduler {

    private final static AtomicLong SEQUENCE = new AtomicLong();

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-utils/src/main/java/org/eclipse/mosaic/lib/util/cli/CommandLineParser.java`
#### Snippet
```java
public class CommandLineParser<T> {

    private final static Logger log = LoggerFactory.getLogger(CommandLineParser.class);

    private final org.apache.commons.cli.CommandLineParser parser = new PosixParser();
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-utils/src/main/java/org/eclipse/mosaic/lib/util/objects/ObjectInstantiation.java`
#### Snippet
```java
public class ObjectInstantiation<T> {

    private final static String NEWLINE = System.lineSeparator();

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sns/src/main/java/org/eclipse/mosaic/fed/sns/model/SophisticatedAdhocTransmissionModel.java`
#### Snippet
```java
public class SophisticatedAdhocTransmissionModel extends AdhocTransmissionModel {

    private final static Logger log = LoggerFactory.getLogger(SimpleAdhocTransmissionModel.class);

    @Override
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-communication/src/main/java/org/eclipse/mosaic/lib/model/delay/GammaRandomDelay.java`
#### Snippet
```java
     * GammaDistribution with p=2, b=2, which fits best to the delay measurements in the smartv2x project.
     */
    private final static GammaDistribution GAMMA = new GammaDistribution(2, 2);

    @Override
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-objects/src/main/java/org/eclipse/mosaic/lib/objects/v2x/V2xMessage.java`
#### Snippet
```java
    private static final long serialVersionUID = 1L;
    
    private final static AtomicInteger idGenerator = new AtomicInteger();

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-objects/src/main/java/org/eclipse/mosaic/lib/objects/v2x/EncodedPayload.java`
#### Snippet
```java
    private static final long serialVersionUID = 1L;

    public final static EncodedPayload EMPTY_PAYLOAD = new EncodedPayload(0L);

    private final String contentClassName;
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-objects/src/main/java/org/eclipse/mosaic/lib/objects/v2x/etsi/cam/VehicleAwarenessData.java`
#### Snippet
```java
     * Indicates a negative {@link #longitudinalAcceleration} of 16m/s^2 or more.
     */
    public final static double LONGITUDINAL_ACC_MAX_POSITIVE = 16.0;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-objects/src/main/java/org/eclipse/mosaic/lib/objects/v2x/etsi/cam/VehicleAwarenessData.java`
#### Snippet
```java
     * Indicates that a {@link #longitudinalAcceleration} is not available.
     */
    public final static double LONGITUDINAL_ACC_UNAVAILABLE = Double.MAX_VALUE;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-objects/src/main/java/org/eclipse/mosaic/lib/objects/v2x/etsi/cam/VehicleAwarenessData.java`
#### Snippet
```java
     * Indicates a negative {@link #longitudinalAcceleration} of -16m/s^2 or less.
     */
    public final static double LONGITUDINAL_ACC_MAX_NEGATIVE = -16.0;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-objects/src/main/java/org/eclipse/mosaic/lib/objects/vehicle/VehicleType.java`
#### Snippet
```java
     * The default acceleration of a vehicle. Unit: [m/s^2]
     */
    public final static double DEFAULT_ACCELERATION = 2.6;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-objects/src/main/java/org/eclipse/mosaic/lib/objects/vehicle/VehicleType.java`
#### Snippet
```java
     * The default width of a vehicle. Unit: [m]
     */
    public final static double DEFAULT_VEHICLE_WIDTH = 1.8;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-objects/src/main/java/org/eclipse/mosaic/lib/objects/vehicle/VehicleType.java`
#### Snippet
```java
     * The default minimum distance between two vehicles. Unit: [m]
     */
    public final static double DEFAULT_MINIMAL_GAP = 2.5;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-objects/src/main/java/org/eclipse/mosaic/lib/objects/vehicle/VehicleType.java`
#### Snippet
```java
     * The default height of a vehicle. Unit: [m]
     */
    public final static double DEFAULT_VEHICLE_HEIGHT = 1.5;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-objects/src/main/java/org/eclipse/mosaic/lib/objects/vehicle/VehicleType.java`
#### Snippet
```java
     * The default speed factor of the vehicles driver.
     */
    public final static double DEFAULT_SPEED_FACTOR = 1.0;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-objects/src/main/java/org/eclipse/mosaic/lib/objects/vehicle/VehicleType.java`
#### Snippet
```java
     * The default value for driver imperfection.
     */
    public final static double DEFAULT_SIGMA = 0.5;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-objects/src/main/java/org/eclipse/mosaic/lib/objects/vehicle/VehicleType.java`
#### Snippet
```java
     * The default reaction time of the vehicles driver. Unit: [m]
     */
    public final static double DEFAULT_TAU = 1.0;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-objects/src/main/java/org/eclipse/mosaic/lib/objects/vehicle/VehicleType.java`
#### Snippet
```java
     * The default deviation of the speed factor the vehicles driver. Unit: [m]
     */
    public final static double DEFAULT_SPEED_DEVIATION = 0.0;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-objects/src/main/java/org/eclipse/mosaic/lib/objects/vehicle/VehicleType.java`
#### Snippet
```java
     * The default length of a vehicle. Unit: [m]
     */
    public final static double DEFAULT_VEHICLE_LENGTH = 5;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-objects/src/main/java/org/eclipse/mosaic/lib/objects/vehicle/VehicleType.java`
#### Snippet
```java
     * The default deceleration of a vehicle. Unit: [m/s^2]
     */
    public final static double DEFAULT_DECELERATION = 4.5;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-objects/src/main/java/org/eclipse/mosaic/lib/objects/vehicle/VehicleType.java`
#### Snippet
```java
     * The default maximum speed. Unit: [m/2]
     */
    public final static double DEFAULT_MAX_SPEED_MS = 70;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-objects/src/main/java/org/eclipse/mosaic/lib/objects/addressing/AdHocMessageRoutingBuilder.java`
#### Snippet
```java
     * The maximum time to live (TTL).
     */
    private final static int MAXIMUM_TTL = 255;

    private static int require8BitTtl(final int ttl) {
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-objects/src/main/java/org/eclipse/mosaic/lib/objects/addressing/NetworkAddress.java`
#### Snippet
```java
     * Special IPv4 address for Broadcasts (IP address 255.255.255.255)
     */
    public final static Inet4Address BROADCAST_ADDRESS = createIPv4Address(255, 255, 255, 255);

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-objects/src/main/java/org/eclipse/mosaic/lib/objects/addressing/NetworkAddress.java`
#### Snippet
```java
     * Special IPv4 address for GeoAnycast (IP address 255.255.255.254)
     */
    final static Inet4Address ANYCAST_ADDRESS = createIPv4Address(255, 255, 255, 254);


```

### MissortedModifiers
Missorted modifiers `public @Nullable`
in `lib/mosaic-objects/src/main/java/org/eclipse/mosaic/lib/objects/vehicle/VehicleData.java`
#### Snippet
```java
     * the vehicle is currently driving. Might be <code>null</code>.
     */
    public @Nullable
    String getLaneAreaId() {
        return laneAreaId;
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-objects/src/main/java/org/eclipse/mosaic/lib/objects/trafficlight/TrafficLightState.java`
#### Snippet
```java

    public final static TrafficLightState OFF = new TrafficLightState(false, false, false);
    public final static TrafficLightState GREEN = new TrafficLightState(false, true, false);
    public final static TrafficLightState YELLOW = new TrafficLightState(false, false, true);
    public final static TrafficLightState RED = new TrafficLightState(true, false, false);
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-objects/src/main/java/org/eclipse/mosaic/lib/objects/trafficlight/TrafficLightState.java`
#### Snippet
```java
    private static final long serialVersionUID = 1L;

    public final static TrafficLightState OFF = new TrafficLightState(false, false, false);
    public final static TrafficLightState GREEN = new TrafficLightState(false, true, false);
    public final static TrafficLightState YELLOW = new TrafficLightState(false, false, true);
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-objects/src/main/java/org/eclipse/mosaic/lib/objects/trafficlight/TrafficLightState.java`
#### Snippet
```java
    public final static TrafficLightState GREEN = new TrafficLightState(false, true, false);
    public final static TrafficLightState YELLOW = new TrafficLightState(false, false, true);
    public final static TrafficLightState RED = new TrafficLightState(true, false, false);
    public final static TrafficLightState RED_YELLOW = new TrafficLightState(true, false, true);

```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-objects/src/main/java/org/eclipse/mosaic/lib/objects/trafficlight/TrafficLightState.java`
#### Snippet
```java
    public final static TrafficLightState OFF = new TrafficLightState(false, false, false);
    public final static TrafficLightState GREEN = new TrafficLightState(false, true, false);
    public final static TrafficLightState YELLOW = new TrafficLightState(false, false, true);
    public final static TrafficLightState RED = new TrafficLightState(true, false, false);
    public final static TrafficLightState RED_YELLOW = new TrafficLightState(true, false, true);
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-objects/src/main/java/org/eclipse/mosaic/lib/objects/trafficlight/TrafficLightState.java`
#### Snippet
```java
    public final static TrafficLightState YELLOW = new TrafficLightState(false, false, true);
    public final static TrafficLightState RED = new TrafficLightState(true, false, false);
    public final static TrafficLightState RED_YELLOW = new TrafficLightState(true, false, true);

    private final boolean red;
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-objects/src/main/java/org/eclipse/mosaic/lib/objects/trafficsign/TrafficSignSpeed.java`
#### Snippet
```java
    private static final long serialVersionUID = 1L;

    public final static String TYPE_ID = TrafficSignSpeed.class.getSimpleName();

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-objects/src/main/java/org/eclipse/mosaic/lib/objects/trafficsign/TrafficSignLaneAssignment.java`
#### Snippet
```java
    private static final long serialVersionUID = 1L;

    public final static String TYPE_ID = TrafficSignLaneAssignment.class.getSimpleName();

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-docker/src/main/java/org/eclipse/mosaic/lib/docker/DockerClient.java`
#### Snippet
```java
    }

    private final static Pattern PORT_PATTERN = Pattern.compile("^([0-9]+)\\/.*:([0-9]+)$");

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-docker/src/main/java/org/eclipse/mosaic/lib/docker/DockerRun.java`
#### Snippet
```java
 */
public class DockerRun {
    private final static Logger LOG = LoggerFactory.getLogger(DockerRun.class);

    private final DockerClient client;
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-routing/src/main/java/org/eclipse/mosaic/lib/routing/util/RouteFixer.java`
#### Snippet
```java
public class RouteFixer {

    private final static Logger log = LoggerFactory.getLogger(RouteFixer.class);

    private final Database database;
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-routing/src/main/java/org/eclipse/mosaic/lib/routing/database/DatabaseRouting.java`
#### Snippet
```java
public class DatabaseRouting implements Routing {

    private final static Logger log = LoggerFactory.getLogger(DatabaseRouting.class);

    private Database scenarioDatabase;
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-routing/src/main/java/org/eclipse/mosaic/lib/routing/graphhopper/util/TurnCostAnalyzer.java`
#### Snippet
```java

    /* fetch pillar nodes only */
    private final static int GEOMETRY_FETCH_MODE_PILLAR_NODES_ONLY = 0;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-routing/src/main/java/org/eclipse/mosaic/lib/routing/graphhopper/util/TurnCostAnalyzer.java`
#### Snippet
```java
     * max_a = (coefficient of friction = 0.9 (dry asphalt) times gravity on Earth = 9.81 m/s^2)
     */
    private final static double MAX_A = 9.81 * 0.9;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `rti/mosaic-rti-core/src/main/java/org/eclipse/mosaic/rti/ExternalWatchDog.java`
#### Snippet
```java
public class ExternalWatchDog extends Thread {

    private final static int CLOSE_STATUS = 3;

    private final ComponentProvider federation;
```

### MissortedModifiers
Missorted modifiers `final static`
in `rti/mosaic-rti-core/src/main/java/org/eclipse/mosaic/rti/time/AbstractTimeManagement.java`
#### Snippet
```java
     * Unit: [ms]. Set to <code>0</code> to disable this feature.
     */
    private final static long SIMULATION_INFO_LOG_INTERVAL = 500 * TIME.MILLI_SECOND;

    protected final static int STATUS_CODE_SUCCESS = 101;
```

### MissortedModifiers
Missorted modifiers `final static`
in `rti/mosaic-rti-core/src/main/java/org/eclipse/mosaic/rti/time/AbstractTimeManagement.java`
#### Snippet
```java
    private final static long SIMULATION_INFO_LOG_INTERVAL = 500 * TIME.MILLI_SECOND;

    protected final static int STATUS_CODE_SUCCESS = 101;

    protected static final DecimalFormat FORMAT_ONE_DIGIT = new DecimalFormat("#0.0", DecimalFormatSymbols.getInstance(Locale.ENGLISH));
```

### MissortedModifiers
Missorted modifiers `final static`
in `rti/mosaic-rti-core/src/main/java/org/eclipse/mosaic/rti/interaction/TypeBasedInteractionManagement.java`
#### Snippet
```java
public class TypeBasedInteractionManagement implements InteractionManagement {

    private final static Logger LOG = LoggerFactory.getLogger(TypeBasedInteractionManagement.class);

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-cell/src/main/java/org/eclipse/mosaic/fed/cell/module/CellModuleNames.java`
#### Snippet
```java
    public final static String DOWNSTREAM_MODULE = "Downstream";
    public final static String UPSTREAM_MODULE = "Upstream";
    public final static String GEOCASTER = "Geocaster";
}

```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-cell/src/main/java/org/eclipse/mosaic/fed/cell/module/CellModuleNames.java`
#### Snippet
```java

public class CellModuleNames {
    public final static String DOWNSTREAM_MODULE = "Downstream";
    public final static String UPSTREAM_MODULE = "Upstream";
    public final static String GEOCASTER = "Geocaster";
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-cell/src/main/java/org/eclipse/mosaic/fed/cell/module/CellModuleNames.java`
#### Snippet
```java
public class CellModuleNames {
    public final static String DOWNSTREAM_MODULE = "Downstream";
    public final static String UPSTREAM_MODULE = "Upstream";
    public final static String GEOCASTER = "Geocaster";
}
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-cell/src/main/java/org/eclipse/mosaic/fed/cell/viz/PerRegionBandwidthMeasurement.java`
#### Snippet
```java
    private final long interval;

    private final static int EXPORT_STEP_SIZE = 600;

    private long nextExport;
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-cell/src/main/java/org/eclipse/mosaic/fed/cell/viz/PerRegionBandwidthMeasurement.java`
#### Snippet
```java
    private final static Logger log = LoggerFactory.getLogger(PerRegionBandwidthMeasurement.class);

    final static String WILDCARD_ALL = "*";

    private final File parentDir;
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-cell/src/main/java/org/eclipse/mosaic/fed/cell/viz/PerRegionBandwidthMeasurement.java`
#### Snippet
```java
     * in the bandwidth measurement.
     */
    private final static long STARTING_TIME = 0;
    private final static long STARTING_TIME_NANO = STARTING_TIME * TIME.SECOND;

```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-cell/src/main/java/org/eclipse/mosaic/fed/cell/viz/PerRegionBandwidthMeasurement.java`
#### Snippet
```java
     * the bandwidth measurement.
     */
    private final static long END_TIME_NANO = Long.MAX_VALUE;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-cell/src/main/java/org/eclipse/mosaic/fed/cell/viz/PerRegionBandwidthMeasurement.java`
#### Snippet
```java
     */
    private final static long STARTING_TIME = 0;
    private final static long STARTING_TIME_NANO = STARTING_TIME * TIME.SECOND;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-cell/src/main/java/org/eclipse/mosaic/fed/cell/viz/PerRegionBandwidthMeasurement.java`
#### Snippet
```java
public class PerRegionBandwidthMeasurement implements StreamListener {

    private final static Logger log = LoggerFactory.getLogger(PerRegionBandwidthMeasurement.class);

    final static String WILDCARD_ALL = "*";
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-output/src/main/java/org/eclipse/mosaic/fed/output/generator/file/FileOutput.java`
#### Snippet
```java
public class FileOutput extends AbstractOutputGenerator {

    private final static Logger log = LoggerFactory.getLogger(FileOutput.class);

    /**
```

### MissortedModifiers
Missorted modifiers `public static @Nonnull`
in `fed/mosaic-output/src/main/java/org/eclipse/mosaic/fed/output/generator/file/filter/FilterFactory.java`
#### Snippet
```java
     * @return a filter which matches to the given filter definition. An empty filter is returned, if no such filter exists.
     */
    public static @Nonnull
    Filter createFilter(Method m, String filterDef) {
        final String filterName = StringUtils.substringBefore(filterDef, "=").trim();
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-output/src/main/java/org/eclipse/mosaic/fed/output/generator/file/format/ExtendedMethodSet.java`
#### Snippet
```java
public class ExtendedMethodSet {

    private final static SortedMap<Integer, V2xMessage> V2X_MESSAGES = new TreeMap<>();

    public static void deleteV2xMessage(int messageId) {
```

### MissortedModifiers
Missorted modifiers `static public`
in `fed/mosaic-output/src/main/java/org/eclipse/mosaic/fed/output/generator/file/format/ExtendedMethodSet.java`
#### Snippet
```java
    }

    static public Object getTimeInSec(Interaction interaction) {
        return interaction == null ? "" : interaction.getTime() / TIME.SECOND;
    }
```

### MissortedModifiers
Missorted modifiers `static public`
in `fed/mosaic-output/src/main/java/org/eclipse/mosaic/fed/output/generator/file/format/ExtendedMethodSet.java`
#### Snippet
```java
    }

    static public Object getType(V2xMessageTransmission interaction) {
        V2xMessage message = Objects.requireNonNull(V2X_MESSAGES.get(interaction.getMessageId()));
        if (message instanceof GenericV2xMessage) {
```

### MissortedModifiers
Missorted modifiers `static public`
in `fed/mosaic-output/src/main/java/org/eclipse/mosaic/fed/output/generator/file/format/ExtendedMethodSet.java`
#### Snippet
```java
    }

    static public Object getTimeInMs(Interaction interaction) {
        return interaction == null ? "" : interaction.getTime() / TIME.MILLI_SECOND;
    }
```

### MissortedModifiers
Missorted modifiers `static public`
in `fed/mosaic-output/src/main/java/org/eclipse/mosaic/fed/output/generator/file/format/ExtendedMethodSet.java`
#### Snippet
```java
    }

    static public Object getType(V2xMessageReception interaction) {
        V2xMessage message = Objects.requireNonNull(V2X_MESSAGES.get(interaction.getMessageId()));
        if (message instanceof GenericV2xMessage) {
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-output/src/main/java/org/eclipse/mosaic/fed/output/ambassador/AbstractOutputGenerator.java`
#### Snippet
```java
public class AbstractOutputGenerator {

    protected final static Logger log = LoggerFactory.getLogger(AbstractOutputGenerator.class);

    private final Map<String, Consumer<Interaction>> interactionRegistry = new HashMap<>();
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-output/src/main/java/org/eclipse/mosaic/fed/output/ambassador/RegistrationSubscriptionTypes.java`
#### Snippet
```java
public final class RegistrationSubscriptionTypes {

    private final static Set<String> registrationSubscriptionTypes = Collections.unmodifiableSet(Sets.newHashSet(
            RsuRegistration.TYPE_ID,
            TmcRegistration.TYPE_ID,
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/util/EventNicenessPriorityRegister.java`
#### Snippet
```java

    // update traffic detectors
    public final static long updateTrafficDetectors = -99_999_600;

    // update charging station
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/util/EventNicenessPriorityRegister.java`
#### Snippet
```java
    public final static long vehicleAdded = -99_999_900;
    public final static long vehicleUpdated = -99_999_800;
    public final static long vehicleRemoved = -99_999_700;

    // update traffic detectors
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/util/EventNicenessPriorityRegister.java`
#### Snippet
```java
public class EventNicenessPriorityRegister {
    // vehicle
    public final static long vehicleAdded = -99_999_900;
    public final static long vehicleUpdated = -99_999_800;
    public final static long vehicleRemoved = -99_999_700;
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/util/EventNicenessPriorityRegister.java`
#### Snippet
```java

    // batteryUpdated
    public final static long batteryUpdated = -99_998_900;
}

```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/util/EventNicenessPriorityRegister.java`
#### Snippet
```java

    // v2x messages
    public final static long v2xMessageAcknowledgement = -99_999_200;
    public final static long v2xMessageReception = -99_999_100;
    public final static long v2xFullMessageReception = -99_999_99;
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/util/EventNicenessPriorityRegister.java`
#### Snippet
```java
    public final static long updateChargingStation = -99_999_500;
    // update seen traffic signs
    public final static long updateSeenTrafficSign = -99_999_450;
    // update traffic light
    public final static long updateTrafficLight = -99_999_400;
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/util/EventNicenessPriorityRegister.java`
#### Snippet
```java
    // vehicle
    public final static long vehicleAdded = -99_999_900;
    public final static long vehicleUpdated = -99_999_800;
    public final static long vehicleRemoved = -99_999_700;

```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/util/EventNicenessPriorityRegister.java`
#### Snippet
```java
    public final static long v2xFullMessageReception = -99_999_99;
    // charging status
    public final static long chargingRejected = -99_999_000;

    // batteryUpdated
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/util/EventNicenessPriorityRegister.java`
#### Snippet
```java
    public final static long v2xMessageAcknowledgement = -99_999_200;
    public final static long v2xMessageReception = -99_999_100;
    public final static long v2xFullMessageReception = -99_999_99;
    // charging status
    public final static long chargingRejected = -99_999_000;
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/util/EventNicenessPriorityRegister.java`
#### Snippet
```java
    // v2x messages
    public final static long v2xMessageAcknowledgement = -99_999_200;
    public final static long v2xMessageReception = -99_999_100;
    public final static long v2xFullMessageReception = -99_999_99;
    // charging status
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/util/EventNicenessPriorityRegister.java`
#### Snippet
```java
    public final static long updateSeenTrafficSign = -99_999_450;
    // update traffic light
    public final static long updateTrafficLight = -99_999_400;


```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/util/EventNicenessPriorityRegister.java`
#### Snippet
```java

    // update charging station
    public final static long updateChargingStation = -99_999_500;
    // update seen traffic signs
    public final static long updateSeenTrafficSign = -99_999_450;
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/util/UnitLoggerImpl.java`
#### Snippet
```java
     * <code>&lt;logger name="ApplicationLogDelegate" additivity="false" level="INFO"&gt;</code>
     */
    private final static String ROOT_LOGGER = "ApplicationLogDelegate";

    private static final String SIMTIME_LOG_POSTFIX = " (at simulation time {})";
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/util/ClassNameParser.java`
#### Snippet
```java
    private final static Pattern classPattern = Pattern.compile("^([a-zA-Z_$][a-zA-Z\\d\\._$]*)(?:|\\((.+)\\))$");
    // ^(\d+|\d+\.\d*|\"[^\"\n]*\"|false|true)$
    private final static Pattern parameterPattern =
            Pattern.compile("^(?:((?:\\d+\\.\\d*|\\d+d))|(\\d+l)|(\\d+)|\\\"([^\\\"\\n]*)\\\"|'([^'\\n]*)'|(false|true))$");

```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/util/ClassNameParser.java`
#### Snippet
```java
     * Static class used to hold primitive parameter types and values.
     */
    private final static class ParameterDeclaration {
        private Class<?> paramClazz;
        private Object paramValue;
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/util/ClassNameParser.java`
#### Snippet
```java

    // ^([a-zA-Z_$][a-zA-Z\d\._$]*)(?:|\((.+)\))$
    private final static Pattern classPattern = Pattern.compile("^([a-zA-Z_$][a-zA-Z\\d\\._$]*)(?:|\\((.+)\\))$");
    // ^(\d+|\d+\.\d*|\"[^\"\n]*\"|false|true)$
    private final static Pattern parameterPattern =
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/UnitSimulator.java`
#### Snippet
```java
     * The log instance.
     */
    public final static Logger log = LoggerFactory.getLogger(UnitSimulator.class);

    /**
```

### MissortedModifiers
Missorted modifiers `final private`
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/simulation/TrafficLightGroupUnit.java`
#### Snippet
```java
     * Traffic Light group, only used for this special type of RSU.
     */
    final private TrafficLightGroup trafficLightGroup;

    private TrafficLightGroupInfo trafficLightGroupInfo;
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/simulation/perception/CentralPerceptionComponent.java`
#### Snippet
```java
public class CentralPerceptionComponent {

    private final static Logger LOG = LoggerFactory.getLogger(CentralPerceptionComponent.class);

    private CartesianRectangle scenarioBounds;
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/simulation/communication/CellModule.java`
#### Snippet
```java
     * Default radius for geographic cam dissemination over the cellular network [m].
     */
    private final static long DEFAULT_CAM_GEO_RADIUS = 300;

    public CellModule(OperatingSystem owner, Logger log) {
```

### MissortedModifiers
Missorted modifiers `final static`
in `app/tutorials/traffic-light-communication/src/main/java/org/eclipse/mosaic/app/tutorial/VehicleToTrafficLightApp.java`
#### Snippet
```java

public final class VehicleToTrafficLightApp extends AbstractApplication<VehicleOperatingSystem> {
    private final static long TIME_INTERVAL = TIME.SECOND;

    //Use TopoBroadcast instead of GeoBroadcast because latter is not compatible with OMNeT++ or ns-3
```

### MissortedModifiers
Missorted modifiers `final static`
in `app/tutorials/traffic-light-communication/src/main/java/org/eclipse/mosaic/app/tutorial/message/GreenWaveMsg.java`
#### Snippet
```java
    private final String         message;
    private final EncodedPayload payload;
    private final static long    MIN_LEN = 8L;

    public GreenWaveMsg(MessageRouting routing, String message) {
```

### MissortedModifiers
Missorted modifiers `final static`
in `app/tutorials/traffic-light-communication/src/main/java/org/eclipse/mosaic/app/tutorial/EventSendingApp.java`
#### Snippet
```java
     * Used for choosing a RAND id for the message that is sent intra-vehicle.
     */
    private final static int MAX_ID = 1000;

    @Override
```

### MissortedModifiers
Missorted modifiers `final static`
in `app/tutorials/traffic-light-communication/src/main/java/org/eclipse/mosaic/app/tutorial/RoadSideUnitApp.java`
#### Snippet
```java
     * Interval at which messages are sent (every 2 seconds).
     */
    private final static long TIME_INTERVAL = 2 * TIME.SECOND;

    private void sendAdHocBroadcast() {
```

### MissortedModifiers
Missorted modifiers `final static`
in `app/tutorials/traffic-light-communication/src/main/java/org/eclipse/mosaic/app/tutorial/message/InterVehicleMsg.java`
#### Snippet
```java
    private final GeoPoint senderPosition;
    private final EncodedPayload payload;
    private final static long minLen = 128L;

    public InterVehicleMsg(MessageRouting routing, GeoPoint senderPosition) {
```

### MissortedModifiers
Missorted modifiers `final static`
in `app/tutorials/traffic-light-communication/src/main/java/org/eclipse/mosaic/app/tutorial/TrafficLightApp.java`
#### Snippet
```java

public final class TrafficLightApp extends AbstractApplication<TrafficLightOperatingSystem> implements CommunicationApplication {
    public final static String SECRET = "open sesame!";
    private final static short GREEN_DURATION = 10;

```

### MissortedModifiers
Missorted modifiers `final static`
in `app/tutorials/traffic-light-communication/src/main/java/org/eclipse/mosaic/app/tutorial/TrafficLightApp.java`
#### Snippet
```java
public final class TrafficLightApp extends AbstractApplication<TrafficLightOperatingSystem> implements CommunicationApplication {
    public final static String SECRET = "open sesame!";
    private final static short GREEN_DURATION = 10;

    private static final String DEFAULT_PROGRAM = "1";
```

### MissortedModifiers
Missorted modifiers `final static`
in `app/tutorials/weather-warning/src/main/java/org/eclipse/mosaic/app/tutorial/SlowDownApp.java`
#### Snippet
```java
public class SlowDownApp extends AbstractApplication<VehicleOperatingSystem> implements VehicleApplication {

    private final static float SPEED = 25 / 3.6f;

    private boolean hazardousArea = false;
```

### MissortedModifiers
Missorted modifiers `final static`
in `app/tutorials/weather-warning/src/main/java/org/eclipse/mosaic/app/tutorial/WeatherServerApp.java`
#### Snippet
```java
     * Road ID where hazard is located.
     */
    private final static String HAZARD_ROAD = "311964536_1313885442_2879911873";

    private final static SensorType SENSOR_TYPE = SensorType.ICE;
```

### MissortedModifiers
Missorted modifiers `final static`
in `app/tutorials/weather-warning/src/main/java/org/eclipse/mosaic/app/tutorial/WeatherServerApp.java`
#### Snippet
```java
     * Send hazard location at this interval, in seconds.
     */
    private final static long INTERVAL = 2 * TIME.SECOND;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `app/tutorials/weather-warning/src/main/java/org/eclipse/mosaic/app/tutorial/WeatherServerApp.java`
#### Snippet
```java

    private final static SensorType SENSOR_TYPE = SensorType.ICE;
    private final static float SPEED = 25 / 3.6f;


```

### MissortedModifiers
Missorted modifiers `final static`
in `app/tutorials/weather-warning/src/main/java/org/eclipse/mosaic/app/tutorial/WeatherServerApp.java`
#### Snippet
```java
    private final static String HAZARD_ROAD = "311964536_1313885442_2879911873";

    private final static SensorType SENSOR_TYPE = SensorType.ICE;
    private final static float SPEED = 25 / 3.6f;

```

### MissortedModifiers
Missorted modifiers `final static`
in `app/tutorials/weather-warning/src/main/java/org/eclipse/mosaic/app/tutorial/WeatherServerApp.java`
#### Snippet
```java
     * Location of the hazard which causes the route change.
     */
    private final static GeoPoint HAZARD_LOCATION = GeoPoint.latLon(52.633047, 13.565314);

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `app/tutorials/weather-warning/src/main/java/org/eclipse/mosaic/app/tutorial/WeatherWarningApp.java`
#### Snippet
```java
     * This is the speed for the DEN message sent for rerouting.
     */
    private final static float SPEED = 25 / 3.6f;


```

### MissortedModifiers
Missorted modifiers `final static`
in `app/tutorials/example-applications/src/main/java/org/eclipse/mosaic/app/tutorial/eventprocessing/sampling/HelloWorldApp.java`
#### Snippet
```java
     * Sample interval. Unit: [ns].
     */
    private final static long TIME_INTERVAL = TIME.SECOND;

    private void sample() {
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/geo/UtmZone.java`
#### Snippet
```java
    private static final long serialVersionUID = 1L;

    private final static char[] UTM_LETTERS = {
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
    };
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/geo/UtmZone.java`
#### Snippet
```java
    private static final int ZONE_HEIGHT_SHARING = 4;

    private final static UtmZone[][] ZONE_CACHE = new UtmZone[ZONE_MAX_VALUE][26];

    public final int number;
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/gson/GeoAreaAdapterFactory.java`
#### Snippet
```java
    public static class GeoAreaAdapter extends AbstractTypeAdapterFactory<GeoArea> {

        private final static String TYPE_RECTANGLE = "rectangle";
        private final static String TYPE_CIRCLE = "circle";
        private final static String TYPE_POLYGON = "polygon";
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/gson/GeoAreaAdapterFactory.java`
#### Snippet
```java
        private final static String TYPE_RECTANGLE = "rectangle";
        private final static String TYPE_CIRCLE = "circle";
        private final static String TYPE_POLYGON = "polygon";

        private GeoAreaAdapter(TypeAdapterFactory parentFactory, Gson gson) {
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/gson/GeoAreaAdapterFactory.java`
#### Snippet
```java

        private final static String TYPE_RECTANGLE = "rectangle";
        private final static String TYPE_CIRCLE = "circle";
        private final static String TYPE_POLYGON = "polygon";

```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/gson/AbstractTypeAdapterFactory.java`
#### Snippet
```java
public abstract class AbstractTypeAdapterFactory<T> extends TypeAdapter<T> {

    private final static String TYPE_FIELD = "type";

    private final Gson gson;
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/geo/GeoUtils.java`
#### Snippet
```java
    }

    private final static double LINE_MATCHING_RESOLUTION_IN_METERS = 50;

    /**
```

### MissortedModifiers
Missorted modifiers `synchronized static`
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/math/GlobalRandom.java`
#### Snippet
```java
    }

    public synchronized static void initialize(RandomNumberGenerator randomNumberGenerator) {
        GlobalRandom.RANDOM = randomNumberGenerator;
    }
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/spatial/Edge.java`
#### Snippet
```java
public class Edge<T extends Vector3d> implements Serializable {

    private final static long serialVersionUID = 1L;

    public T a;
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/transform/HarvesineGeoCalculator.java`
#### Snippet
```java

    private final static Vector3d NORTH = VectorUtils.NORTH;
    private final static double EARTH_R = ReferenceEllipsoid.WGS_84.equatorialRadius;

    @Override
```

### MissortedModifiers
Missorted modifiers `final static`
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/transform/HarvesineGeoCalculator.java`
#### Snippet
```java
public class HarvesineGeoCalculator implements GeoCalculator {

    private final static Vector3d NORTH = VectorUtils.NORTH;
    private final static double EARTH_R = ReferenceEllipsoid.WGS_84.equatorialRadius;

```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/util/MosaicConformVehicleIdTransformer.java`
#### Snippet
```java
public class MosaicConformVehicleIdTransformer implements IdTransformer<String, String> {

    private final static Logger log = LoggerFactory.getLogger(MosaicConformVehicleIdTransformer.class);

    private final BiMap<String, String> vehicleIdMap = HashBiMap.create(1024);
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/util/SumoVehicleClassMapping.java`
#### Snippet
```java
public class SumoVehicleClassMapping {

    private final static BiMap<String, VehicleClass> vehicleClassBiMap = new ImmutableBiMap.Builder<String, VehicleClass>()
            .put("private", VehicleClass.Unknown)
            .put("passenger", VehicleClass.Car)
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/SumoVersion.java`
#### Snippet
```java
    }

    private final static Pattern VERSION_PATTERN = Pattern.compile("^SUMO v?([0-9]\\.[0-9]+)\\..*$");

    private static boolean matches(String sumoVersionString, String sumoVersionPattern) {
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/util/TrafficSignImageCreator.java`
#### Snippet
```java
class TrafficSignImageCreator {

    private final static Logger LOG = LoggerFactory.getLogger(TrafficSignImageCreator.class);
    public static final String SIGN_FONT = "Helvetica";

```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/util/TrafficSignManager.java`
#### Snippet
```java
public class TrafficSignManager {

    private final static Logger LOG = LoggerFactory.getLogger(TrafficSignManager.class);

    private final double laneWidth;
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/api/complex/LeadFollowVehicle.java`
#### Snippet
```java
     * @param distance         the distance towards the leading or following vehicle
     */
    public LeadFollowVehicle(final @Nonnull String leadingVehicleId, double distance) {
        this.otherVehicleId = leadingVehicleId;
        this.distance = distance;
```

### MissortedModifiers
Missorted modifiers `public final @Nonnull`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/api/complex/LeadFollowVehicle.java`
#### Snippet
```java
     * @return the id of the leading or following vehicle.
     */
    public final @Nonnull
    String getOtherVehicleId() {
        return otherVehicleId;
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/util/SumoVehicleTypesWriter.java`
#### Snippet
```java
    private final static Logger log = LoggerFactory.getLogger(SumoVehicleTypesWriter.class);

    final static String MOSAIC_TYPES_FILE_NAME = "mosaic_types.add.xml";
    /**
     * Document used to write vehicle types (prototypes) from Mapping to.
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/util/SumoVehicleTypesWriter.java`
#### Snippet
```java
public class SumoVehicleTypesWriter {

    private final static Logger log = LoggerFactory.getLogger(SumoVehicleTypesWriter.class);

    final static String MOSAIC_TYPES_FILE_NAME = "mosaic_types.add.xml";
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/AbstractTraciCommand.java`
#### Snippet
```java
     * method calls reflects the order of readers used to read the message response.
     */
    protected final static class TraciCommandResultReaderBuilder {

        private final AbstractTraciCommand<?> command;
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/AbstractTraciCommand.java`
#### Snippet
```java
    protected abstract T constructResult(Status status, Object... objects);

    protected final static class TraciCommandWriterBuilder {

        private final AbstractTraciCommand<?> command;
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandLanePropertyChange.java`
#### Snippet
```java
     * Disallowed vehicle classes.
     */
    public final static int VAR_DISALLOWED = 0x35;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandLanePropertyChange.java`
#### Snippet
```java
     * Allowed vehicle classes.
     */
    public final static int VAR_ALLOWED = 0x34;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandLanePropertyChange.java`
#### Snippet
```java
     * Maximum speed allowed on the lane.
     */
    public final static int VAR_VMAX = 0x41;
}

```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandRetrieveTrafficLightValue.java`
#### Snippet
```java
     * The links controlled by the traffic light.
     */
    public final static int VAR_CONTROLLED_LINKS = 0x27;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandRetrieveTrafficLightValue.java`
#### Snippet
```java
     * The list of lanes which are controlled by the traffic light.
     */
    public final static int VAR_CONTROLLED_LANES = 0x26;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandRetrieveTrafficLightValue.java`
#### Snippet
```java
     * The tl's state of light definitions.
     */
    public final static int VAR_STATE = 0x20;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandRetrieveTrafficLightValue.java`
#### Snippet
```java
     * Currently, not implemented in TraCI server of SUMO.
     */
    public final static int VAR_CONTROLLED_JUNCTIONS = 0x2a;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandRetrieveTrafficLightValue.java`
#### Snippet
```java
     * Ids of traffic light groups within the simulation.
     */
    public final static int VAR_ID_LIST = 0x00;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandRetrieveTrafficLightValue.java`
#### Snippet
```java
     * The assumed time at which the traffic lights change the phase.
     */
    public final static int VAR_TIME_OF_NEXT_SWITCH = 0x2d;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandRetrieveTrafficLightValue.java`
#### Snippet
```java
     * The default total duration of the currently active phase.
     */
    public final static int VAR_PHASE_DEFAULT_DURATION = 0x24;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandRetrieveTrafficLightValue.java`
#### Snippet
```java
     * The index of the current phase in the current program.
     */
    public final static int VAR_CURRENT_PHASE_INDEX = 0x28;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandRetrieveVehicleTypeState.java`
#### Snippet
```java
    public final static SumoVar VAR_WIDTH = SumoVar.var(0x4d);

    public final static SumoVar VAR_HEIGHT = SumoVar.var(0xbc);
}

```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandRetrieveVehicleTypeState.java`
#### Snippet
```java
    public final static SumoVar VAR_VCLASS = SumoVar.var(0x49);

    public final static SumoVar VAR_LENGTH = SumoVar.var(0x44);

    public final static SumoVar VAR_WIDTH = SumoVar.var(0x4d);
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandRetrieveVehicleTypeState.java`
#### Snippet
```java
    public final static SumoVar VAR_ACCEL = SumoVar.var(0x46);

    public final static SumoVar VAR_DECEL = SumoVar.var(0x47);

    public final static SumoVar VAR_TAU = SumoVar.var(0x48);
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandRetrieveVehicleTypeState.java`
#### Snippet
```java
    public final static int COMMAND = 0xa5;

    public final static SumoVar VAR_MIN_GAP = SumoVar.var(0x4c);

    public final static SumoVar VAR_MAX_SPEED = SumoVar.var(0x41);
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandRetrieveVehicleTypeState.java`
#### Snippet
```java
    public final static SumoVar VAR_DECEL = SumoVar.var(0x47);

    public final static SumoVar VAR_TAU = SumoVar.var(0x48);

    public final static SumoVar VAR_SIGMA = SumoVar.var(0x5d);
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandRetrieveVehicleTypeState.java`
#### Snippet
```java
public class CommandRetrieveVehicleTypeState {

    public final static int COMMAND = 0xa5;

    public final static SumoVar VAR_MIN_GAP = SumoVar.var(0x4c);
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandRetrieveVehicleTypeState.java`
#### Snippet
```java
    public final static SumoVar VAR_SIGMA = SumoVar.var(0x5d);

    public final static SumoVar VAR_SPEED_FACTOR = SumoVar.var(0x5e);

    public final static SumoVar VAR_VCLASS = SumoVar.var(0x49);
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandRetrieveVehicleTypeState.java`
#### Snippet
```java
    public final static SumoVar VAR_LENGTH = SumoVar.var(0x44);

    public final static SumoVar VAR_WIDTH = SumoVar.var(0x4d);

    public final static SumoVar VAR_HEIGHT = SumoVar.var(0xbc);
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandRetrieveVehicleTypeState.java`
#### Snippet
```java
    public final static SumoVar VAR_TAU = SumoVar.var(0x48);

    public final static SumoVar VAR_SIGMA = SumoVar.var(0x5d);

    public final static SumoVar VAR_SPEED_FACTOR = SumoVar.var(0x5e);
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandRetrieveVehicleTypeState.java`
#### Snippet
```java
    public final static SumoVar VAR_SPEED_FACTOR = SumoVar.var(0x5e);

    public final static SumoVar VAR_VCLASS = SumoVar.var(0x49);

    public final static SumoVar VAR_LENGTH = SumoVar.var(0x44);
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandRetrieveVehicleTypeState.java`
#### Snippet
```java
    public final static SumoVar VAR_MAX_SPEED = SumoVar.var(0x41);

    public final static SumoVar VAR_ACCEL = SumoVar.var(0x46);

    public final static SumoVar VAR_DECEL = SumoVar.var(0x47);
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandRetrieveVehicleTypeState.java`
#### Snippet
```java
    public final static SumoVar VAR_MIN_GAP = SumoVar.var(0x4c);

    public final static SumoVar VAR_MAX_SPEED = SumoVar.var(0x41);

    public final static SumoVar VAR_ACCEL = SumoVar.var(0x46);
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandChangeTrafficLightState.java`
#### Snippet
```java
     * Index of the phase.
     */
    public final static int VAR_PHASE_INDEX = 0x22;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandChangeTrafficLightState.java`
#### Snippet
```java
     * Id of the traffic light program.
     */
    public final static int VAR_PROGRAM_ID = 0x23;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandChangeTrafficLightState.java`
#### Snippet
```java
     * Change the state of a traffic light.
     */
    public final static int COMMAND = 0xc2;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandChangeTrafficLightState.java`
#### Snippet
```java
     * Phase duration.
     */
    public final static int VAR_PHASE_DURATION = 0x24;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandChangeTrafficLightState.java`
#### Snippet
```java
     * Traffic light states.
     */
    public final static int VAR_STATE = 0x20;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandChangeTrafficLightState.java`
#### Snippet
```java
     * Complete program definition.
     */
    public final static int VAR_COMPLETE_PROGRAM = 0x2c;
}

```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandRetrieveVehicleState.java`
#### Snippet
```java
    public final static SumoVar VAR_LENGTH = SumoVar.var(0x44);
    public final static SumoVar VAR_WIDTH = SumoVar.var(0x4d);
    public final static SumoVar VAR_HEIGHT = SumoVar.var(0xbc);
}

```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandRetrieveRouteValue.java`
#### Snippet
```java
     * The Id's of the edges the vehicle's route is made of.
     */
    public final static int VAR_EDGES = 0x54;
}

```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandRetrieveRouteValue.java`
#### Snippet
```java
     * Vehicle Id's running within the scenario.
     */
    public final static int VAR_ID_LIST = 0x00;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandRetrieveRouteValue.java`
#### Snippet
```java
     * Command for the tracking the given vehicle.
     */
    public final static int COMMAND = 0xa6;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandRetrieveVehicleState.java`
#### Snippet
```java
    public final static SumoVar VAR_POSITION = SumoVar.var(0x42);

    public final static SumoVar VAR_POSITION_3D = SumoVar.var(0x39);

    public final static SumoVar VAR_ACCELERATION = SumoVar.var(0x72);
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandRetrieveVehicleState.java`
#### Snippet
```java
    public final static SumoVar VAR_POSITION_3D = SumoVar.var(0x39);

    public final static SumoVar VAR_ACCELERATION = SumoVar.var(0x72);

    public final static SumoVar VAR_ANGLE = SumoVar.var(0x43);
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandRetrieveVehicleState.java`
#### Snippet
```java
    public final static SumoVar VAR_DISTANCE = SumoVar.var(0x84);

    public final static SumoVar VAR_SIGNAL_STATES = SumoVar.var(0x5b);

    public final static SumoVar VAR_EMISSIONS_CO2 = SumoVar.var(0x60);
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandRetrieveTrafficLightValue.java`
#### Snippet
```java
     * Command to asking for the value of a certain variable of the traffic light.
     */
    public final static int COMMAND = 0xa2;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandRetrieveVehicleState.java`
#### Snippet
```java
    public final static SumoVar VAR_LANE_POSITION = SumoVar.var(0x56);

    public final static SumoVar VAR_LATERAL_LANE_POSITION = SumoVar.var(0xb8);

    public static final SumoVar VAR_LEADER = SumoVar.WithParam.var(0x68, 100d);
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandRetrieveVehicleState.java`
#### Snippet
```java
    public final static SumoVar VAR_EMISSIONS_NOX = SumoVar.var(0x64);

    public final static SumoVar VAR_EMISSIONS_FUEL = SumoVar.var(0x65);

    public final static SumoVar VAR_EMISSIONS_ELECTRICITY = SumoVar.var(0x71);
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandRetrieveTrafficLightValue.java`
#### Snippet
```java
     * Definition of the complete traffic light program.
     */
    public final static int VAR_COMPLETE_DEFINITION = 0x2b;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandRetrieveVehicleState.java`
#### Snippet
```java
    public final static SumoVar VAR_SLOPE = SumoVar.var(0x36);
    public final static SumoVar VAR_LENGTH = SumoVar.var(0x44);
    public final static SumoVar VAR_WIDTH = SumoVar.var(0x4d);
    public final static SumoVar VAR_HEIGHT = SumoVar.var(0xbc);
}
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandRetrieveVehicleState.java`
#### Snippet
```java

    public final static SumoVar VAR_SLOPE = SumoVar.var(0x36);
    public final static SumoVar VAR_LENGTH = SumoVar.var(0x44);
    public final static SumoVar VAR_WIDTH = SumoVar.var(0x4d);
    public final static SumoVar VAR_HEIGHT = SumoVar.var(0xbc);
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandRetrieveVehicleState.java`
#### Snippet
```java
    public static final SumoVar VAR_FOLLOWER = SumoVar.WithParam.var(0x78, 100d);

    public final static SumoVar VAR_DISTANCE = SumoVar.var(0x84);

    public final static SumoVar VAR_SIGNAL_STATES = SumoVar.var(0x5b);
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandRetrieveLaneAreaState.java`
#### Snippet
```java
     * The Id's of the vehicles stopped in the last simulation step.
     */
    public final static int VAR_LAST_STEP_VEHICLE_IDS = 0x12;
}

```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandRetrieveLaneAreaState.java`
#### Snippet
```java
     * The percentage of time the detector was occupied by a vehicle in the last simulation step.
     */
    public final static int VAR_LAST_STEP_OCCUPANCY = 0x13;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandRetrieveLaneAreaState.java`
#### Snippet
```java
     * The length of the vehicles.
     */
    public final static int VAR_LENGTH = 0x44;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandRetrieveLaneAreaState.java`
#### Snippet
```java
     * Command for a value of a certain variable of the vehicle.
     */
    public final static int COMMAND = 0xa4;
    // public final static int VAR_COUNT = 0x01;

```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandRetrieveLaneAreaState.java`
#### Snippet
```java
     * The number of halting vehicles in the last simulation step.
     */
    public final static int VAR_LAST_STEP_HALTING_VEHICLE_NUMBER = 0x14;
    // public final static int VAR_LAST_STEP_LENGTH_OF_JAM_IN_NUMBER_OF_VEHICLES = 0x18;
    // public final static int VAR_LAST_STEP_LENGTH_OF_JAM_IN_METERS = 0x19;
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandRetrieveLaneAreaState.java`
#### Snippet
```java
     * The mean speed of vehicles that were on the induction loop within the last simulation step.
     */
    public final static int VAR_LAST_STEP_MEAN_SPEED = 0x11;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandRetrieveLaneAreaState.java`
#### Snippet
```java
     * The Id of the lane the vehicle was at within the last step.
     */
    public final static int VAR_LANE_ID = 0x51;
    // public final static int VAR_POSITION = 0x42;
    // public final static int VAR_ID_LIST = 0x00;
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandRetrieveLaneAreaState.java`
#### Snippet
```java
     * The number of vehicles that were on the induction loop within the last simulation step.
     */
    public final static int VAR_LAST_STEP_VEHICLE_NUMBER = 0x10;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandRetrieveVehicleState.java`
#### Snippet
```java
    public final static int COMMAND = 0xa4;

    public final static SumoVar VAR_MIN_GAP = SumoVar.var(0x4c);

    public final static SumoVar VAR_SPEED = SumoVar.var(0x40);
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandRetrieveVehicleState.java`
#### Snippet
```java
    public final static SumoVar VAR_EMISSIONS_FUEL = SumoVar.var(0x65);

    public final static SumoVar VAR_EMISSIONS_ELECTRICITY = SumoVar.var(0x71);

    public final static SumoVar VAR_GET_NEXT_STOPS = SumoVar.var(0x73);
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandRetrieveVehicleState.java`
#### Snippet
```java
    public final static SumoVar VAR_MIN_GAP = SumoVar.var(0x4c);

    public final static SumoVar VAR_SPEED = SumoVar.var(0x40);

    public final static SumoVar VAR_POSITION = SumoVar.var(0x42);
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandRetrieveVehicleState.java`
#### Snippet
```java
    public final static SumoVar VAR_EMISSIONS_HC = SumoVar.var(0x62);

    public final static SumoVar VAR_EMISSIONS_PMX = SumoVar.var(0x63);

    public final static SumoVar VAR_EMISSIONS_NOX = SumoVar.var(0x64);
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandRetrieveVehicleState.java`
#### Snippet
```java
    public final static SumoVar VAR_EMISSIONS_PMX = SumoVar.var(0x63);

    public final static SumoVar VAR_EMISSIONS_NOX = SumoVar.var(0x64);

    public final static SumoVar VAR_EMISSIONS_FUEL = SumoVar.var(0x65);
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandRetrieveVehicleState.java`
#### Snippet
```java
    public final static SumoVar VAR_ACCELERATION = SumoVar.var(0x72);

    public final static SumoVar VAR_ANGLE = SumoVar.var(0x43);

    public final static SumoVar VAR_TYPE_ID = SumoVar.var(0x4f);
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandRetrieveVehicleState.java`
#### Snippet
```java
    public final static SumoVar VAR_EMISSIONS_ELECTRICITY = SumoVar.var(0x71);

    public final static SumoVar VAR_GET_NEXT_STOPS = SumoVar.var(0x73);
    public final static SumoVar VAR_GET_LINE = SumoVar.var(0xbd);

```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandRetrieveVehicleState.java`
#### Snippet
```java
    public final static SumoVar VAR_STOP_STATE = SumoVar.var(0xb5);

    public final static SumoVar VAR_SLOPE = SumoVar.var(0x36);
    public final static SumoVar VAR_LENGTH = SumoVar.var(0x44);
    public final static SumoVar VAR_WIDTH = SumoVar.var(0x4d);
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandRetrieveVehicleState.java`
#### Snippet
```java
    public final static SumoVar VAR_SPEED = SumoVar.var(0x40);

    public final static SumoVar VAR_POSITION = SumoVar.var(0x42);

    public final static SumoVar VAR_POSITION_3D = SumoVar.var(0x39);
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandRetrieveVehicleState.java`
#### Snippet
```java
    public final static SumoVar VAR_EMISSIONS_CO = SumoVar.var(0x61);

    public final static SumoVar VAR_EMISSIONS_HC = SumoVar.var(0x62);

    public final static SumoVar VAR_EMISSIONS_PMX = SumoVar.var(0x63);
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandRetrieveVehicleState.java`
#### Snippet
```java
    public final static SumoVar VAR_ROUTE_ID = SumoVar.var(0x53);

    public final static SumoVar VAR_LANE_POSITION = SumoVar.var(0x56);

    public final static SumoVar VAR_LATERAL_LANE_POSITION = SumoVar.var(0xb8);
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandRetrieveVehicleState.java`
#### Snippet
```java
    public final static SumoVar VAR_LANE_ID = SumoVar.var(0x51);

    public final static SumoVar VAR_LANE_INDEX = SumoVar.var(0x52);

    public final static SumoVar VAR_ROUTE_ID = SumoVar.var(0x53);
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandRetrieveVehicleState.java`
#### Snippet
```java
    public final static SumoVar VAR_TYPE_ID = SumoVar.var(0x4f);

    public final static SumoVar VAR_ROAD_ID = SumoVar.var(0x50);

    public final static SumoVar VAR_LANE_ID = SumoVar.var(0x51);
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandRetrieveVehicleState.java`
#### Snippet
```java
    public final static SumoVar VAR_EMISSIONS_CO2 = SumoVar.var(0x60);

    public final static SumoVar VAR_EMISSIONS_CO = SumoVar.var(0x61);

    public final static SumoVar VAR_EMISSIONS_HC = SumoVar.var(0x62);
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandRetrieveVehicleState.java`
#### Snippet
```java
    public final static SumoVar VAR_SIGNAL_STATES = SumoVar.var(0x5b);

    public final static SumoVar VAR_EMISSIONS_CO2 = SumoVar.var(0x60);

    public final static SumoVar VAR_EMISSIONS_CO = SumoVar.var(0x61);
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandRetrieveInductionLoopState.java`
#### Snippet
```java
     * The id of the lane the vehicle was at within the last step.
     */
    public final static int VAR_LANE_ID = 0x51;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandRetrieveInductionLoopState.java`
#### Snippet
```java
     * Position of the vehicle.
     */
    public final static int VAR_POSITION = 0x42;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandRetrieveInductionLoopState.java`
#### Snippet
```java
     * Information about vehicles which passed the detector.
     */
    public final static int VAR_LAST_STEP_VEHICLE_DATA = 0x17;
}

```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandRetrieveInductionLoopState.java`
#### Snippet
```java
     * Vehicle Id's running within the scenario.
     */
    public final static int VAR_ID_LIST = 0x00;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandRetrieveVehicleState.java`
#### Snippet
```java

    public final static SumoVar VAR_GET_NEXT_STOPS = SumoVar.var(0x73);
    public final static SumoVar VAR_GET_LINE = SumoVar.var(0xbd);

    public final static SumoVar VAR_STOP_STATE = SumoVar.var(0xb5);
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandRetrieveInductionLoopState.java`
#### Snippet
```java
     * The time since last detection.
     */
    public final static int VAR_LAST_STEP_TIME_SINCE_LAST_DETECTION = 0x16;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandRetrieveVehicleState.java`
#### Snippet
```java
public class CommandRetrieveVehicleState {

    public final static int COMMAND = 0xa4;

    public final static SumoVar VAR_MIN_GAP = SumoVar.var(0x4c);
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandRetrieveVehicleState.java`
#### Snippet
```java
    public final static SumoVar VAR_GET_LINE = SumoVar.var(0xbd);

    public final static SumoVar VAR_STOP_STATE = SumoVar.var(0xb5);

    public final static SumoVar VAR_SLOPE = SumoVar.var(0x36);
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandRetrieveInductionLoopState.java`
#### Snippet
```java
     * The mean length of vehicles which were on the detector in the last step.
     */
    public final static int VAR_LAST_STEP_MEAN_VEHICLE_LENGTH = 0x15;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandRetrieveVehicleState.java`
#### Snippet
```java
    public final static SumoVar VAR_LANE_INDEX = SumoVar.var(0x52);

    public final static SumoVar VAR_ROUTE_ID = SumoVar.var(0x53);

    public final static SumoVar VAR_LANE_POSITION = SumoVar.var(0x56);
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandRetrieveInductionLoopState.java`
#### Snippet
```java
     * The mean speed of vehicles that were on the induction loop within the last simulation step.
     */
    public final static int VAR_LAST_STEP_MEAN_SPEED = 0x11;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandRetrieveVehicleState.java`
#### Snippet
```java
    public final static SumoVar VAR_ANGLE = SumoVar.var(0x43);

    public final static SumoVar VAR_TYPE_ID = SumoVar.var(0x4f);

    public final static SumoVar VAR_ROAD_ID = SumoVar.var(0x50);
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandRetrieveInductionLoopState.java`
#### Snippet
```java
     * The number of vehicles that were on the induction loop within the last simulation step.
     */
    public final static int VAR_LAST_STEP_VEHICLE_NUMBER = 0x10;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandRetrieveVehicleState.java`
#### Snippet
```java
    public final static SumoVar VAR_ROAD_ID = SumoVar.var(0x50);

    public final static SumoVar VAR_LANE_ID = SumoVar.var(0x51);

    public final static SumoVar VAR_LANE_INDEX = SumoVar.var(0x52);
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandRetrieveInductionLoopState.java`
#### Snippet
```java
     * Command for a value of a certain variable of the vehicle.
     */
    public final static int COMMAND = 0xa4;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandRetrieveInductionLoopState.java`
#### Snippet
```java
     * The percentage of time the detector was occupied by a vehicle in the last simulation step.
     */
    public final static int VAR_LAST_STEP_OCCUPANCY = 0x13;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandVariableSubscriptions.java`
#### Snippet
```java
     * Retrieve information from a traffic light group.
     */
    public final static int COMMAND_SUBSCRIBE_TRAFFIC_LIGHT_VALUES = 0xd2;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandVariableSubscriptions.java`
#### Snippet
```java
     * Command to subscribe induction loop variable.
     */
    public final static int COMMAND_SUBSCRIBE_INDUCTION_LOOP_VALUES = 0xd0;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandVariableSubscriptions.java`
#### Snippet
```java
     * Response to subscribe traffic light group variable.
     */
    public final static int RESPONSE_SUBSCRIBE_TRAFFIC_LIGHT_VALUES = 0xe2;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandVariableSubscriptions.java`
#### Snippet
```java
     * Response to subscribe vehicle variable.
     */
    public final static int RESPONSE_SUBSCRIBE_VEHICLE_VALUES = 0xe4;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandVariableSubscriptions.java`
#### Snippet
```java
     * Add a filter to reduce previous set context subscription.
     */
    public final static int COMMAND_ADD_CONTEXT_SUBSCRIPTION_FILTER = 0x7e;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandVariableSubscriptions.java`
#### Snippet
```java
     * Command to subscribe areal detector variable.
     */
    public final static int COMMAND_SUBSCRIBE_LANE_AREA_VALUES = 0xdd;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandRetrieveJunctionValue.java`
#### Snippet
```java
     * Command for the value of a certain variable of the junction.
     */
    public final static int COMMAND = 0xa9;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandRetrieveJunctionValue.java`
#### Snippet
```java
     * The position of the named junction.
     */
    public final static int VAR_POSITION = 0x42;
}

```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandVariableSubscriptions.java`
#### Snippet
```java
     * Response to subscribe induction loop variable.
     */
    public final static int RESPONSE_SUBSCRIBE_INDUCTION_LOOP_VALUES = 0xe0;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandVariableSubscriptions.java`
#### Snippet
```java
     * Command to subscribe vehicle variable.
     */
    public final static int COMMAND_SUBSCRIBE_VEHICLE_VALUES = 0xd4;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandVariableSubscriptions.java`
#### Snippet
```java
     * A subscription filter to return vehicles within field of vision
     */
    public final static int SUBSCRIPTION_FILTER_FIELD_OF_VISION = 0x0a;

}
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandVariableSubscriptions.java`
#### Snippet
```java
     * Subscribe for vehicle values within a context of another vehicle.
     */
    public final static int COMMAND_SUBSCRIBE_CONTEXT_VEHICLE_VALUES = 0x84;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandVariableSubscriptions.java`
#### Snippet
```java
     * Change the state of a lane.
     */
    public final static int COMMAND_CHANGE_LANE_STATE = 0xc3;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandVariableSubscriptions.java`
#### Snippet
```java
     * Response to subscribe areal detector variable.
     */
    public final static int RESPONSE_SUBSCRIBE_LANE_AREA_VALUES = 0xed;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandVariableSubscriptions.java`
#### Snippet
```java
     * Response to vehicle context subscriptions.
     */
    public final static int RESPONSE_SUBSCRIBE_CONTEXT_VEHICLE_VALUES = 0x94;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandSimulationControl.java`
#### Snippet
```java
     * The TraCI closes the connection to any client, stops simulation and shuts down SUMO.
     */
    public final static int COMMAND_CLOSE = 0x7f;
}

```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandSimulationControl.java`
#### Snippet
```java
     * Command forces SUMO to perform simulation until the given time step is reached.
     */
    public final static int COMMAND_SIMULATION_STEP = 0x02;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandSimulationControl.java`
#### Snippet
```java
     * Command to get the API version.
     */
    public final static int COMMAND_VERSION = 0x00;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandRetrieveSimulationValue.java`
#### Snippet
```java
     * Id's of vehicles which departed in this time step.
     */
    public final static int VAR_DEPARTED_VEHICLES = 0x74;
}

```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandRetrieveSimulationValue.java`
#### Snippet
```java
     * Command for the value of a certain variable of the induction loop within the last simulation step.
     */
    public final static int COMMAND = 0xab;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandChangePoiState.java`
#### Snippet
```java
    public final static int VAR_IMAGE_PATH = 0x93;

    public final static int VAR_WIDTH = 0x4d;

    public final static int VAR_HEIGHT = 0xbc;
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandChangePoiState.java`
#### Snippet
```java
    public final static int VAR_HEIGHT = 0xbc;

    public final static int VAR_ANGLE = 0x43;

}
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandChangePoiState.java`
#### Snippet
```java
public class CommandChangePoiState {

    public final static int COMMAND = 0xc7;

    public final static int VAR_ADD = 0x80;
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandChangePoiState.java`
#### Snippet
```java
    public final static int VAR_REMOVE = 0x81;

    public final static int VAR_IMAGE_PATH = 0x93;

    public final static int VAR_WIDTH = 0x4d;
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandChangePoiState.java`
#### Snippet
```java
    public final static int VAR_WIDTH = 0x4d;

    public final static int VAR_HEIGHT = 0xbc;

    public final static int VAR_ANGLE = 0x43;
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandChangePoiState.java`
#### Snippet
```java
    public final static int VAR_ADD = 0x80;

    public final static int VAR_REMOVE = 0x81;

    public final static int VAR_IMAGE_PATH = 0x93;
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandChangePoiState.java`
#### Snippet
```java
    public final static int COMMAND = 0xc7;

    public final static int VAR_ADD = 0x80;

    public final static int VAR_REMOVE = 0x81;
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandRetrieveLaneValue.java`
#### Snippet
```java
     * Command for the Lane value retrieval.
     */
    public final static int COMMAND = 0xa3;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandRetrieveLaneValue.java`
#### Snippet
```java
     * Command to retrieve the length of a lane.
     */
    public final static int VAR_LENGTH = 0x44;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandRetrieveLaneValue.java`
#### Snippet
```java
     * Command to retrieve the shape of a lane.
     */
    public final static int VAR_SHAPE = 0x4e;
}

```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandChangeRouteState.java`
#### Snippet
```java
     * Change Route State.
     */
    public final static int COMMAND = 0xc6;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandChangeRouteState.java`
#### Snippet
```java
     * Add a new route.
     */
    public final static int VAR_ADD = 0x80;
}

```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandChangeVehicleValue.java`
#### Snippet
```java
     * Lane change mode of the vehicle.
     */
    public final static int VAR_LANE_CHANGE_MODE = 0xb6;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandChangeVehicleValue.java`
#### Snippet
```java
     * Resume from a stop.
     */
    public final static int VAR_RESUME = 0x19;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandChangeVehicleValue.java`
#### Snippet
```java
     * Highlighting the vehicle in the GUI.
     */
    public final static int VAR_HIGHLIGHT = 0x6c;
}

```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandChangeVehicleValue.java`
#### Snippet
```java
     * The vehicle speed.
     */
    public final static int VAR_SPEED = 0x40;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandChangeVehicleValue.java`
#### Snippet
```java
     * Changes the speed for slow down.
     */
    public final static int VAR_SLOW_DOWN = 0x14;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandChangeVehicleValue.java`
#### Snippet
```java
     * Speed mode.
     */
    public final static int VAR_SPEED_MODE = 0xb3;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandChangeVehicleValue.java`
#### Snippet
```java
     * Change route vy given Id.
     */
    public final static int VAR_CHANGE_ROUTE_BY_ID = 0x53;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandChangeVehicleValue.java`
#### Snippet
```java
     * Vehicle stop.
     */
    public final static int VAR_STOP = 0x12;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandChangeVehicleValue.java`
#### Snippet
```java
     * The vehicle's minimum headway gap.
     */
    public final static int VAR_MIN_GAP = 0x4c;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandChangeVehicleValue.java`
#### Snippet
```java
     * Moves the vehicle to a new specific position.
     */
    public final static int VAR_MOVE_TO_XY = 0xb4;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandChangeVehicleValue.java`
#### Snippet
```java
     * Change to the lane.
     */
    public final static int VAR_CHANGE_LANE = 0x13;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandChangeVehicleValue.java`
#### Snippet
```java
     * Driver reaction time.
     */
    public final static int VAR_TAU = 0x48;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandChangeVehicleValue.java`
#### Snippet
```java
     * The maximum speed of the vehicle.
     */
    public final static int VAR_MAX_SPEED = 0x41;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandChangeVehicleValue.java`
#### Snippet
```java
     * Speed factor to exceed the maximum permitted speed or to decelerate.
     */
    public final static int VAR_SPEED_FACTOR = 0x5e;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandChangeVehicleValue.java`
#### Snippet
```java
     * The maximum deceleration.
     */
    public final static int VAR_DECELERATION = 0x47;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandChangeVehicleValue.java`
#### Snippet
```java
     * The vehicle's color.
     */
    public final static int VAR_COLOR = 0x45;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandChangeVehicleValue.java`
#### Snippet
```java
     * The length of the vehicle.
     */
    public final static int VAR_LENGTH = 0x44;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandChangeVehicleValue.java`
#### Snippet
```java
     * Add a vehicle.
     */
    public final static int VAR_ADD = 0x85;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandChangeVehicleValue.java`
#### Snippet
```java
     * Command to set vehicle variable.
     */
    public final static int COMMAND = 0xc4;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandChangeVehicleValue.java`
#### Snippet
```java
     * The maximum acceleration.
     */
    public final static int VAR_ACCELERATION = 0x46;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandChangeVehicleValue.java`
#### Snippet
```java
     */

    public final static int VAR_IMPERFECTION = 0x5d;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandChangeVehicleValue.java`
#### Snippet
```java
     * Additional parameter for the vehicle.
     */
    public final static int VAR_PARAMETER = 0x7e;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandChangeVehicleValue.java`
#### Snippet
```java
     * Remove the vehicle.
     */
    public final static int VAR_REMOVE = 0x81;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/libsumo/SimulationSimulateStep.java`
#### Snippet
```java
    final static List<String> INDUCTION_LOOP_SUBSCRIPTIONS = new ArrayList<>();
    final static List<String> LANE_AREA_SUBSCRIPTIONS = new ArrayList<>();
    final static List<String> TRAFFIC_LIGHT_SUBSCRIPTIONS = new ArrayList<>();

    private final boolean fetchRoadPosition;
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/libsumo/SimulationSimulateStep.java`
#### Snippet
```java

    final static List<String> VEHICLE_SUBSCRIPTIONS = new ArrayList<>();
    final static List<String> INDUCTION_LOOP_SUBSCRIPTIONS = new ArrayList<>();
    final static List<String> LANE_AREA_SUBSCRIPTIONS = new ArrayList<>();
    final static List<String> TRAFFIC_LIGHT_SUBSCRIPTIONS = new ArrayList<>();
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/libsumo/SimulationSimulateStep.java`
#### Snippet
```java
public class SimulationSimulateStep implements org.eclipse.mosaic.fed.sumo.bridge.api.SimulationSimulateStep {

    private final static Logger LOG = LoggerFactory.getLogger(SimulationSimulateStep.class);

    final static List<String> VEHICLE_SUBSCRIPTIONS = new ArrayList<>();
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/libsumo/SimulationSimulateStep.java`
#### Snippet
```java
    private final static Logger LOG = LoggerFactory.getLogger(SimulationSimulateStep.class);

    final static List<String> VEHICLE_SUBSCRIPTIONS = new ArrayList<>();
    final static List<String> INDUCTION_LOOP_SUBSCRIPTIONS = new ArrayList<>();
    final static List<String> LANE_AREA_SUBSCRIPTIONS = new ArrayList<>();
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/libsumo/SimulationSimulateStep.java`
#### Snippet
```java
    final static List<String> VEHICLE_SUBSCRIPTIONS = new ArrayList<>();
    final static List<String> INDUCTION_LOOP_SUBSCRIPTIONS = new ArrayList<>();
    final static List<String> LANE_AREA_SUBSCRIPTIONS = new ArrayList<>();
    final static List<String> TRAFFIC_LIGHT_SUBSCRIPTIONS = new ArrayList<>();

```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/config/CSumo.java`
#### Snippet
```java
    public VehicleSetMoveToXY.Mode moveToXyMode = org.eclipse.mosaic.fed.sumo.bridge.api.VehicleSetMoveToXY.Mode.SWITCH_ROUTE;

    public final static String HIGHLIGHT_CHANGE_LANE = "changeLane";
    public final static String HIGHLIGHT_CHANGE_ROUTE = "changeRoute";
}
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/config/CSumo.java`
#### Snippet
```java
     * CO2, NOX, and more, including fuel consumption.
     */
    public final static String SUBSCRIPTION_EMISSIONS = "emissions";

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/config/CSumo.java`
#### Snippet
```java
     * such as the ID of the road.
     */
    public final static String SUBSCRIPTION_ROAD_POSITION = "roadposition";

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/config/CSumo.java`
#### Snippet
```java

    public final static String HIGHLIGHT_CHANGE_LANE = "changeLane";
    public final static String HIGHLIGHT_CHANGE_ROUTE = "changeRoute";
}

```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/config/CSumo.java`
#### Snippet
```java
     * Subscription identifier for subscribing to train information such next stops and line information.
     */
    public final static String SUBSCRIPTION_TRAINS = "trains";

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/config/CSumo.java`
#### Snippet
```java
     * Subscription identifier for everything which is related to the signals on the vehicle.
     */
    public final static String SUBSCRIPTION_SIGNALS = "signals";

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/config/CSumo.java`
#### Snippet
```java
     * Subscription identifier for subscribing to leader and follower information for each vehicle.
     */
    public final static String SUBSCRIPTION_LEADER = "leader";

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/facades/SimulationFacade.java`
#### Snippet
```java
     * fuel consumptions in mg, thus we convert it back to ml for compatibility.
     */
    private final static double FUEL_DENSITY = 0.74; // g/m^3

    private final Logger log = LoggerFactory.getLogger(this.getClass());
```

### MissortedModifiers
Missorted modifiers `final static`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/ambassador/AbstractSumoAmbassador.java`
#### Snippet
```java
     * Sleep after each connection try. Unit: [ms].
     */
    private final static long SLEEP_AFTER_ATTEMPT = 1000L;

    /**
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `DataInputStream.read()` is ignored
in `app/tutorials/example-applications/src/main/java/org/eclipse/mosaic/app/tutorial/traci/SumoTraciInteractionApp.java`
#### Snippet
```java
        final byte[] result = new byte[bytes];

        in.read(result, 0, bytes);

        return result;
```

## RuleId[id=WhileLoopSpinsOnField]
### WhileLoopSpinsOnField
`while` loop spins on field
in `lib/mosaic-utils/src/main/java/org/eclipse/mosaic/lib/util/ProcessLoggingThread.java`
#### Snippet
```java

            String line;
            while (running) {
                if ((line = reader.readLine()) != null) {
                    lineConsumer.accept("Process " + processName + ": " + line);
```

## RuleId[id=ClassNameSameAsAncestorName]
### ClassNameSameAsAncestorName
Class name `InRadius` is the same as one of its superclass' names
in `lib/mosaic-database/src/main/java/org/eclipse/mosaic/lib/database/spatial/Edge.java`
#### Snippet
```java
    }

    public static class InRadius<V extends Vector3d, E extends org.eclipse.mosaic.lib.spatial.Edge<V>> extends SpatialTreeTraverser.InRadius<E> {
        @Override
        protected double getCenterDistanceSqr(E item, SpatialTree<E> tree) {
```

### ClassNameSameAsAncestorName
Class name `Nearest` is the same as one of its superclass' names
in `lib/mosaic-database/src/main/java/org/eclipse/mosaic/lib/database/spatial/Edge.java`
#### Snippet
```java
    }

    static class Nearest<V extends Vector3d, E extends org.eclipse.mosaic.lib.spatial.Edge<V>> extends SpatialTreeTraverser.Nearest<E> {
        @Override
        protected double getCenterDistanceSqr(E item, SpatialTree<E> tree) {
```

### ClassNameSameAsAncestorName
Class name `SimulationTraciRequest` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/SimulationTraciRequest.java`
#### Snippet
```java
 * Implementation for a byte array message from the simulation.
 */
public class SimulationTraciRequest
        extends AbstractTraciCommand<SumoTraciResult>
        implements org.eclipse.mosaic.fed.sumo.bridge.api.SimulationTraciRequest {
```

### ClassNameSameAsAncestorName
Class name `VehicleSetResume` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/VehicleSetResume.java`
#### Snippet
```java
 * This class represents the SUMO command which allows to set the vehicle value in order to resume the previous properties.
 */
public class VehicleSetResume
        extends AbstractTraciCommand<Void>
        implements org.eclipse.mosaic.fed.sumo.bridge.api.VehicleSetResume {
```

### ClassNameSameAsAncestorName
Class name `PoiSetHeight` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/PoiSetHeight.java`
#### Snippet
```java
 * This class sets the height of a PoI object in the SUMO-GUI.
 */
public class PoiSetHeight
        extends AbstractTraciCommand<Void>
        implements org.eclipse.mosaic.fed.sumo.bridge.api.PoiSetHeight {
```

### ClassNameSameAsAncestorName
Class name `TrafficLightGetTimeOfNextSwitch` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/TrafficLightGetTimeOfNextSwitch.java`
#### Snippet
```java
import java.util.Locale;

public class TrafficLightGetTimeOfNextSwitch
        extends AbstractTraciCommand<Double>
        implements org.eclipse.mosaic.fed.sumo.bridge.api.TrafficLightGetTimeOfNextSwitch {
```

### ClassNameSameAsAncestorName
Class name `VehicleSetMinGap` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/VehicleSetMinGap.java`
#### Snippet
```java
 * This class represents the SUMO command which allows to set a minimum gap between the vehicles in "traffic congestion".
 */
public class VehicleSetMinGap
        extends AbstractVehicleSetSingleDoubleValue
        implements org.eclipse.mosaic.fed.sumo.bridge.api.VehicleSetMinGap {
```

### ClassNameSameAsAncestorName
Class name `SimulationSimulateStep` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/SimulationSimulateStep.java`
#### Snippet
```java
 * This class represents the SUMO command which allows to set the simulation step.
 */
public class SimulationSimulateStep
        extends AbstractTraciCommand<AbstractSubscriptionResult>
        implements org.eclipse.mosaic.fed.sumo.bridge.api.SimulationSimulateStep {
```

### ClassNameSameAsAncestorName
Class name `VehicleSetColor` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/VehicleSetColor.java`
#### Snippet
```java
 * This class represents the SUMO command which allows to set the color of a vehicle.
 */
public class VehicleSetColor
        extends AbstractTraciCommand<Void>
        implements org.eclipse.mosaic.fed.sumo.bridge.api.VehicleSetColor {
```

### ClassNameSameAsAncestorName
Class name `VehicleTypeGetWidth` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/VehicleTypeGetWidth.java`
#### Snippet
```java
import org.eclipse.mosaic.rti.api.InternalFederateException;

public class VehicleTypeGetWidth
        extends AbstractTraciCommand<Double>
        implements org.eclipse.mosaic.fed.sumo.bridge.api.VehicleTypeGetWidth {
```

### ClassNameSameAsAncestorName
Class name `VehicleGetRouteId` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/VehicleGetRouteId.java`
#### Snippet
```java
 * This class represents the SUMO command which allows to get the Id of the vehicle route.
 */
public class VehicleGetRouteId
        extends AbstractTraciCommand<String>
        implements org.eclipse.mosaic.fed.sumo.bridge.api.VehicleGetRouteId {
```

### ClassNameSameAsAncestorName
Class name `RouteGetIds` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/RouteGetIds.java`
#### Snippet
```java
import java.util.List;

public class RouteGetIds
        extends AbstractTraciCommand<List<String>>
        implements org.eclipse.mosaic.fed.sumo.bridge.api.RouteGetIds {
```

### ClassNameSameAsAncestorName
Class name `JunctionGetPosition` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/JunctionGetPosition.java`
#### Snippet
```java
import java.util.Locale;

public class JunctionGetPosition
        extends AbstractTraciCommand<Position>
        implements org.eclipse.mosaic.fed.sumo.bridge.api.JunctionGetPosition {
```

### ClassNameSameAsAncestorName
Class name `TrafficLightSetProgram` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/TrafficLightSetProgram.java`
#### Snippet
```java
 * This class represents the SUMO command which allows to set the traffic light program.
 */
public class TrafficLightSetProgram
        extends AbstractTraciCommand<Void>
        implements org.eclipse.mosaic.fed.sumo.bridge.api.TrafficLightSetProgram {
```

### ClassNameSameAsAncestorName
Class name `VehicleSetMaxSpeed` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/VehicleSetMaxSpeed.java`
#### Snippet
```java
 * This class represents the SUMO command which allows to set a maximum speed for the vehicle.
 */
public class VehicleSetMaxSpeed
        extends AbstractVehicleSetSingleDoubleValue
        implements org.eclipse.mosaic.fed.sumo.bridge.api.VehicleSetMaxSpeed {
```

### ClassNameSameAsAncestorName
Class name `LaneGetLength` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/LaneGetLength.java`
#### Snippet
```java
import java.util.Locale;

public class LaneGetLength
        extends AbstractTraciCommand<Double>
        implements org.eclipse.mosaic.fed.sumo.bridge.api.LaneGetLength {
```

### ClassNameSameAsAncestorName
Class name `PoiSetWidth` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/PoiSetWidth.java`
#### Snippet
```java
 * This class sets the width of a PoI object in the SUMO-GUI.
 */
public class PoiSetWidth
        extends AbstractTraciCommand<Void>
        implements org.eclipse.mosaic.fed.sumo.bridge.api.PoiSetWidth {
```

### ClassNameSameAsAncestorName
Class name `VehicleTypeGetDecel` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/VehicleTypeGetDecel.java`
#### Snippet
```java
import org.eclipse.mosaic.rti.api.InternalFederateException;

public class VehicleTypeGetDecel
        extends AbstractTraciCommand<Double>
        implements org.eclipse.mosaic.fed.sumo.bridge.api.VehicleTypeGetDecel {
```

### ClassNameSameAsAncestorName
Class name `VehicleSetMaxAcceleration` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/VehicleSetMaxAcceleration.java`
#### Snippet
```java
 * This class represents the SUMO command which allows to set a maximum acceleration for the vehicle.
 */
public class VehicleSetMaxAcceleration
        extends AbstractVehicleSetSingleDoubleValue
        implements org.eclipse.mosaic.fed.sumo.bridge.api.VehicleSetMaxAcceleration {
```

### ClassNameSameAsAncestorName
Class name `TrafficLightGetState` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/TrafficLightGetState.java`
#### Snippet
```java
 * This class retrieves the current state of the traffic light application.
 */
public class TrafficLightGetState
        extends AbstractTraciCommand<String>
        implements org.eclipse.mosaic.fed.sumo.bridge.api.TrafficLightGetState {
```

### ClassNameSameAsAncestorName
Class name `SimulationGetTrafficLightIds` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/SimulationGetTrafficLightIds.java`
#### Snippet
```java
 * This class represents the SUMO command which allows to get the Id's of the traffic light groups.
 */
public class SimulationGetTrafficLightIds
        extends AbstractTraciCommand<List<String>>
        implements org.eclipse.mosaic.fed.sumo.bridge.api.SimulationGetTrafficLightIds {
```

### ClassNameSameAsAncestorName
Class name `LaneAreaSubscribe` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/LaneAreaSubscribe.java`
#### Snippet
```java
import java.util.Collection;

public class LaneAreaSubscribe
        extends AbstractTraciCommand<Void>
        implements org.eclipse.mosaic.fed.sumo.bridge.api.LaneAreaSubscribe {
```

### ClassNameSameAsAncestorName
Class name `PoiSetImage` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/PoiSetImage.java`
#### Snippet
```java
 * This class sets the image path of a PoI object in the SUMO-GUI.
 */
public class PoiSetImage
        extends AbstractTraciCommand<Void>
        implements org.eclipse.mosaic.fed.sumo.bridge.api.PoiSetImage {
```

### ClassNameSameAsAncestorName
Class name `InductionLoopSubscribe` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/InductionLoopSubscribe.java`
#### Snippet
```java
import java.util.Collection;

public class InductionLoopSubscribe
        extends AbstractTraciCommand<Void>
        implements org.eclipse.mosaic.fed.sumo.bridge.api.InductionLoopSubscribe {
```

### ClassNameSameAsAncestorName
Class name `LaneSetMaxSpeed` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/LaneSetMaxSpeed.java`
#### Snippet
```java
 * This class represents the SUMO command which sets the maximum lane speed.
 */
public class LaneSetMaxSpeed
        extends AbstractTraciCommand<Void>
        implements org.eclipse.mosaic.fed.sumo.bridge.api.LaneSetMaxSpeed {
```

### ClassNameSameAsAncestorName
Class name `SimulationGetDepartedVehicleIds` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/SimulationGetDepartedVehicleIds.java`
#### Snippet
```java
 * This class represents the SUMO command which allows to get the Id's of the vehicles departed the simulation.
 */
public class SimulationGetDepartedVehicleIds
        extends AbstractTraciCommand<List<String>>
        implements org.eclipse.mosaic.fed.sumo.bridge.api.SimulationGetDepartedVehicleIds {
```

### ClassNameSameAsAncestorName
Class name `LaneSetAllow` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/LaneSetAllow.java`
#### Snippet
```java
 * This class represents the SUMO command which sets the allowed classes to a specific lane.
 */
public class LaneSetAllow
        extends AbstractTraciCommand<Void>
        implements org.eclipse.mosaic.fed.sumo.bridge.api.LaneSetAllow {
```

### ClassNameSameAsAncestorName
Class name `VehicleSetVehicleLength` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/VehicleSetVehicleLength.java`
#### Snippet
```java
import org.eclipse.mosaic.fed.sumo.bridge.traci.constants.CommandChangeVehicleValue;

public class VehicleSetVehicleLength
        extends AbstractVehicleSetSingleDoubleValue
        implements org.eclipse.mosaic.fed.sumo.bridge.api.VehicleSetVehicleLength {
```

### ClassNameSameAsAncestorName
Class name `VehicleSetSpeed` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/VehicleSetSpeed.java`
#### Snippet
```java
 * This class represents the SUMO command which allows to set the speed for the vehicle for.
 */
public class VehicleSetSpeed
        extends AbstractVehicleSetSingleDoubleValue
        implements org.eclipse.mosaic.fed.sumo.bridge.api.VehicleSetSpeed {
```

### ClassNameSameAsAncestorName
Class name `VehicleSetRouteById` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/VehicleSetRouteById.java`
#### Snippet
```java
 * This class represents the SUMO command which allows to change the vehicles route to the route with the given id.
 */
public class VehicleSetRouteById
        extends AbstractTraciCommand<Void>
        implements org.eclipse.mosaic.fed.sumo.bridge.api.VehicleSetRouteById {
```

### ClassNameSameAsAncestorName
Class name `VehicleTypeGetHeight` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/VehicleTypeGetHeight.java`
#### Snippet
```java
import org.eclipse.mosaic.rti.api.InternalFederateException;

public class VehicleTypeGetHeight
        extends AbstractTraciCommand<Double>
        implements org.eclipse.mosaic.fed.sumo.bridge.api.VehicleTypeGetHeight {
```

### ClassNameSameAsAncestorName
Class name `SimulationGetVersion` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/SimulationGetVersion.java`
#### Snippet
```java
 * This class represents the SUMO command which allows to get the version of the Traci API.
 */
public class SimulationGetVersion
        extends AbstractTraciCommand<org.eclipse.mosaic.fed.sumo.bridge.api.SimulationGetVersion.CurrentVersion>
        implements org.eclipse.mosaic.fed.sumo.bridge.api.SimulationGetVersion {
```

### ClassNameSameAsAncestorName
Class name `TrafficLightGetControlledJunctions` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/TrafficLightGetControlledJunctions.java`
#### Snippet
```java
import java.util.List;

public class TrafficLightGetControlledJunctions implements org.eclipse.mosaic.fed.sumo.bridge.api.TrafficLightGetControlledJunctions {

    boolean warned = false;
```

### ClassNameSameAsAncestorName
Class name `VehicleSubscribeSurroundingVehicle` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/VehicleSubscribeSurroundingVehicle.java`
#### Snippet
```java
 * Several options for vehicle subscription are implemented in this class.
 */
public class VehicleSubscribeSurroundingVehicle
        extends AbstractTraciCommand<Void>
        implements org.eclipse.mosaic.fed.sumo.bridge.api.VehicleSubscribeSurroundingVehicle {
```

### ClassNameSameAsAncestorName
Class name `PoiAdd` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/PoiAdd.java`
#### Snippet
```java
 * This class adds a PoI object in the SUMO-GUI.
 */
public class PoiAdd
        extends AbstractTraciCommand<Void>
        implements org.eclipse.mosaic.fed.sumo.bridge.api.PoiAdd {
```

### ClassNameSameAsAncestorName
Class name `TrafficLightSetPhaseIndex` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/TrafficLightSetPhaseIndex.java`
#### Snippet
```java
import org.eclipse.mosaic.rti.api.InternalFederateException;

public class TrafficLightSetPhaseIndex
        extends AbstractTraciCommand<Void>
        implements org.eclipse.mosaic.fed.sumo.bridge.api.TrafficLightSetPhaseIndex {
```

### ClassNameSameAsAncestorName
Class name `TrafficLightSetRemainingPhaseDuration` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/TrafficLightSetRemainingPhaseDuration.java`
#### Snippet
```java
import org.eclipse.mosaic.rti.api.InternalFederateException;

public class TrafficLightSetRemainingPhaseDuration
        extends AbstractTraciCommand<Void>
        implements org.eclipse.mosaic.fed.sumo.bridge.api.TrafficLightSetRemainingPhaseDuration {
```

### ClassNameSameAsAncestorName
Class name `VehicleSetSpeedFactor` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/VehicleSetSpeedFactor.java`
#### Snippet
```java
 * for the possible exceeding of the maximum permitted speed by 10 percent.
 */
public class VehicleSetSpeedFactor
        extends AbstractVehicleSetSingleDoubleValue
        implements org.eclipse.mosaic.fed.sumo.bridge.api.VehicleSetSpeedFactor {
```

### ClassNameSameAsAncestorName
Class name `VehicleSetStop` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/VehicleSetStop.java`
#### Snippet
```java
 * e.g. parking, chargingStation.
 */
public class VehicleSetStop
        extends AbstractTraciCommand<Void>
        implements org.eclipse.mosaic.fed.sumo.bridge.api.VehicleSetStop {
```

### ClassNameSameAsAncestorName
Class name `VehicleSubscriptionSetFieldOfVision` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/VehicleSubscriptionSetFieldOfVision.java`
#### Snippet
```java
 * collect all vehicles surrounding a specific vehicle.
 */
public class VehicleSubscriptionSetFieldOfVision
        extends AbstractTraciCommand<Void>
        implements org.eclipse.mosaic.fed.sumo.bridge.api.VehicleSubscriptionSetFieldOfVision {
```

### ClassNameSameAsAncestorName
Class name `TrafficLightGetCurrentProgram` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/TrafficLightGetCurrentProgram.java`
#### Snippet
```java
 * This class retrieves the current traffic light program.
 */
public class TrafficLightGetCurrentProgram
        extends AbstractTraciCommand<String>
        implements org.eclipse.mosaic.fed.sumo.bridge.api.TrafficLightGetCurrentProgram {
```

### ClassNameSameAsAncestorName
Class name `VehicleSetParameter` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/VehicleSetParameter.java`
#### Snippet
```java
 * This class writes a parameter value for specific a vehicle.
 */
public class VehicleSetParameter
        extends AbstractTraciCommand<Void>
        implements org.eclipse.mosaic.fed.sumo.bridge.api.VehicleSetParameter {
```

### ClassNameSameAsAncestorName
Class name `VehicleGetParameter` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/VehicleGetParameter.java`
#### Snippet
```java
 * This class reads a parameter value for specific a vehicle.
 */
public class VehicleGetParameter
        extends AbstractTraciCommand<String>
        implements org.eclipse.mosaic.fed.sumo.bridge.api.VehicleGetParameter {
```

### ClassNameSameAsAncestorName
Class name `VehicleSetMaxDeceleration` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/VehicleSetMaxDeceleration.java`
#### Snippet
```java
 * This class represents the SUMO command which allows to set a maximum deceleration for the vehicle.
 */
public class VehicleSetMaxDeceleration
        extends AbstractVehicleSetSingleDoubleValue
        implements org.eclipse.mosaic.fed.sumo.bridge.api.VehicleSetMaxDeceleration {
```

### ClassNameSameAsAncestorName
Class name `VehicleSetMoveToXY` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/VehicleSetMoveToXY.java`
#### Snippet
```java
 * This class represents the SUMO command which allows to set the vehicle move to explicit position.
 */
public class VehicleSetMoveToXY
        extends AbstractTraciCommand<Void>
        implements org.eclipse.mosaic.fed.sumo.bridge.api.VehicleSetMoveToXY {
```

### ClassNameSameAsAncestorName
Class name `VehicleSetReactionTime` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/VehicleSetReactionTime.java`
#### Snippet
```java
 * This class represents the SUMO command which allows to set the vehicle headway in "traffic flow".
 */
public class VehicleSetReactionTime
        extends AbstractVehicleSetSingleDoubleValue
        implements org.eclipse.mosaic.fed.sumo.bridge.api.VehicleSetReactionTime {
```

### ClassNameSameAsAncestorName
Class name `TrafficLightGetControlledLinks` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/TrafficLightGetControlledLinks.java`
#### Snippet
```java
 * This class represents the SUMO command which allows to get the links controlled by a traffic light.
 */
public class TrafficLightGetControlledLinks
        extends AbstractTraciCommand<List<org.eclipse.mosaic.fed.sumo.bridge.api.TrafficLightGetControlledLinks.TrafficLightControlledLink>>
        implements org.eclipse.mosaic.fed.sumo.bridge.api.TrafficLightGetControlledLinks {
```

### ClassNameSameAsAncestorName
Class name `VehicleTypeGetSigma` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/VehicleTypeGetSigma.java`
#### Snippet
```java
import org.eclipse.mosaic.rti.api.InternalFederateException;

public class VehicleTypeGetSigma
        extends AbstractTraciCommand<Double>
        implements org.eclipse.mosaic.fed.sumo.bridge.api.VehicleTypeGetSigma {
```

### ClassNameSameAsAncestorName
Class name `VehicleAdd` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/VehicleAdd.java`
#### Snippet
```java
import org.eclipse.mosaic.rti.api.InternalFederateException;

public class VehicleAdd
        extends AbstractTraciCommand<Void>
        implements org.eclipse.mosaic.fed.sumo.bridge.api.VehicleAdd {
```

### ClassNameSameAsAncestorName
Class name `RouteAdd` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/RouteAdd.java`
#### Snippet
```java
 * This class represents the SUMO command which adds a route to the scenario.
 */
public class RouteAdd
        extends AbstractTraciCommand<List<String>>
        implements org.eclipse.mosaic.fed.sumo.bridge.api.RouteAdd {
```

### ClassNameSameAsAncestorName
Class name `SimulationClose` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/SimulationClose.java`
#### Snippet
```java
 * This class represents the SUMO command which closes the simulation.
 */
public class SimulationClose
        extends AbstractTraciCommand<Void>
        implements org.eclipse.mosaic.fed.sumo.bridge.api.SimulationClose {
```

### ClassNameSameAsAncestorName
Class name `LaneGetShape` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/LaneGetShape.java`
#### Snippet
```java
import java.util.Locale;

public class LaneGetShape extends AbstractTraciCommand<List<Position>>
        implements org.eclipse.mosaic.fed.sumo.bridge.api.LaneGetShape {

```

### ClassNameSameAsAncestorName
Class name `VehicleTypeGetMaxSpeed` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/VehicleTypeGetMaxSpeed.java`
#### Snippet
```java
import org.eclipse.mosaic.rti.api.InternalFederateException;

public class VehicleTypeGetMaxSpeed
        extends AbstractTraciCommand<Double>
        implements org.eclipse.mosaic.fed.sumo.bridge.api.VehicleTypeGetMaxSpeed {
```

### ClassNameSameAsAncestorName
Class name `VehicleSetRemove` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/VehicleSetRemove.java`
#### Snippet
```java
import org.eclipse.mosaic.rti.api.InternalFederateException;

public class VehicleSetRemove
        extends AbstractTraciCommand<Void>
        implements org.eclipse.mosaic.fed.sumo.bridge.api.VehicleSetRemove {
```

### ClassNameSameAsAncestorName
Class name `TrafficLightAddProgram` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/TrafficLightAddProgram.java`
#### Snippet
```java
 * Adds a complete definition of a traffic light program. Does only work with SUMO >= 1.1.0.
 */
public class TrafficLightAddProgram
        extends AbstractTraciCommand<Void>
        implements org.eclipse.mosaic.fed.sumo.bridge.api.TrafficLightAddProgram {
```

### ClassNameSameAsAncestorName
Class name `VehicleTypeGetSpeedFactor` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/VehicleTypeGetSpeedFactor.java`
#### Snippet
```java
import org.eclipse.mosaic.rti.api.InternalFederateException;

public class VehicleTypeGetSpeedFactor
        extends AbstractTraciCommand<Double>
        implements org.eclipse.mosaic.fed.sumo.bridge.api.VehicleTypeGetSpeedFactor {
```

### ClassNameSameAsAncestorName
Class name `VehicleSetHighlight` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/VehicleSetHighlight.java`
#### Snippet
```java
 * This class highlights a specific vehicle in the SUMO-GUI.
 */
public class VehicleSetHighlight
        extends AbstractTraciCommand<Void>
        implements org.eclipse.mosaic.fed.sumo.bridge.api.VehicleSetHighlight {
```

### ClassNameSameAsAncestorName
Class name `PoiSetAngle` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/PoiSetAngle.java`
#### Snippet
```java
 * This rotates a PoI object in the SUMO-GUI.
 */
public class PoiSetAngle
        extends AbstractTraciCommand<Void>
        implements org.eclipse.mosaic.fed.sumo.bridge.api.PoiSetAngle {
```

### ClassNameSameAsAncestorName
Class name `VehicleTypeGetLength` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/VehicleTypeGetLength.java`
#### Snippet
```java
import org.eclipse.mosaic.rti.api.InternalFederateException;

public class VehicleTypeGetLength
        extends AbstractTraciCommand<Double>
        implements org.eclipse.mosaic.fed.sumo.bridge.api.VehicleTypeGetLength {
```

### ClassNameSameAsAncestorName
Class name `VehicleTypeGetAccel` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/VehicleTypeGetAccel.java`
#### Snippet
```java
import org.eclipse.mosaic.rti.api.InternalFederateException;

public class VehicleTypeGetAccel
        extends AbstractTraciCommand<Double>
        implements org.eclipse.mosaic.fed.sumo.bridge.api.VehicleTypeGetAccel {
```

### ClassNameSameAsAncestorName
Class name `TrafficLightGetCurrentPhase` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/TrafficLightGetCurrentPhase.java`
#### Snippet
```java
import java.util.Locale;

public class TrafficLightGetCurrentPhase
        extends AbstractTraciCommand<Integer>
        implements org.eclipse.mosaic.fed.sumo.bridge.api.TrafficLightGetCurrentPhase {
```

### ClassNameSameAsAncestorName
Class name `VehicleSetLaneChangeMode` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/VehicleSetLaneChangeMode.java`
#### Snippet
```java
 * - Obligation to drive on the right
 */
public class VehicleSetLaneChangeMode
        extends AbstractVehicleSetSingleIntegerValue
        implements org.eclipse.mosaic.fed.sumo.bridge.api.VehicleSetLaneChangeMode {
```

### ClassNameSameAsAncestorName
Class name `VehicleSetSlowDown` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/VehicleSetSlowDown.java`
#### Snippet
```java
 * This class represents the SUMO command which allows to set the new speed value for the vehicle for a specific time.
 */
public class VehicleSetSlowDown
        extends AbstractTraciCommand<Void>
        implements org.eclipse.mosaic.fed.sumo.bridge.api.VehicleSetSlowDown {
```

### ClassNameSameAsAncestorName
Class name `VehicleTypeGetVClass` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/VehicleTypeGetVClass.java`
#### Snippet
```java
import org.eclipse.mosaic.rti.api.InternalFederateException;

public class VehicleTypeGetVClass
        extends AbstractTraciCommand<String>
        implements org.eclipse.mosaic.fed.sumo.bridge.api.VehicleTypeGetVClass {
```

### ClassNameSameAsAncestorName
Class name `PoiRemove` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/PoiRemove.java`
#### Snippet
```java
 * This removes adds a PoI object in the SUMO-GUI.
 */
public class PoiRemove
        extends AbstractTraciCommand<Void>
        implements org.eclipse.mosaic.fed.sumo.bridge.api.PoiRemove {
```

### ClassNameSameAsAncestorName
Class name `VehicleSetSpeedMode` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/VehicleSetSpeedMode.java`
#### Snippet
```java
 * it follows the right-of-way rules. Furthermore, tt may not exceed the bounds on acceleration and deceleration.
 */
public class VehicleSetSpeedMode
        extends AbstractVehicleSetSingleIntegerValue
        implements org.eclipse.mosaic.fed.sumo.bridge.api.VehicleSetSpeedMode {
```

### ClassNameSameAsAncestorName
Class name `VehicleSetUpdateBestLanes` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/VehicleSetUpdateBestLanes.java`
#### Snippet
```java
 * This class represents the SUMO command which allows to set the updates of the internal data structures for best lane choice.
 */
public class VehicleSetUpdateBestLanes
        extends AbstractTraciCommand<Void>
        implements org.eclipse.mosaic.fed.sumo.bridge.api.VehicleSetUpdateBestLanes {
```

### ClassNameSameAsAncestorName
Class name `VehicleTypeGetMinGap` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/VehicleTypeGetMinGap.java`
#### Snippet
```java
import org.eclipse.mosaic.rti.api.InternalFederateException;

public class VehicleTypeGetMinGap
        extends AbstractTraciCommand<Double>
        implements org.eclipse.mosaic.fed.sumo.bridge.api.VehicleTypeGetMinGap {
```

### ClassNameSameAsAncestorName
Class name `RouteGetEdges` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/RouteGetEdges.java`
#### Snippet
```java
 * This class represents the SUMO command which allows to get the edge Id's of a route.
 */
public class RouteGetEdges
        extends AbstractTraciCommand<List<String>>
        implements org.eclipse.mosaic.fed.sumo.bridge.api.RouteGetEdges {
```

### ClassNameSameAsAncestorName
Class name `VehicleSetImperfection` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/VehicleSetImperfection.java`
#### Snippet
```java
 * This class represents the SUMO command which allows to set an imperfection value for the driver.
 */
public class VehicleSetImperfection
        extends AbstractVehicleSetSingleDoubleValue
        implements org.eclipse.mosaic.fed.sumo.bridge.api.VehicleSetImperfection {
```

### ClassNameSameAsAncestorName
Class name `TrafficLightSetState` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/TrafficLightSetState.java`
#### Snippet
```java
import org.eclipse.mosaic.rti.api.InternalFederateException;

public class TrafficLightSetState
        extends AbstractTraciCommand<Void>
        implements org.eclipse.mosaic.fed.sumo.bridge.api.TrafficLightSetState {
```

### ClassNameSameAsAncestorName
Class name `VehicleTypeGetTau` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/VehicleTypeGetTau.java`
#### Snippet
```java
import org.eclipse.mosaic.rti.api.InternalFederateException;

public class VehicleTypeGetTau
        extends AbstractTraciCommand<Double>
        implements org.eclipse.mosaic.fed.sumo.bridge.api.VehicleTypeGetTau {
```

### ClassNameSameAsAncestorName
Class name `VehicleSetChangeLane` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/VehicleSetChangeLane.java`
#### Snippet
```java
 * This class represents the SUMO command which allows to set a lane for the vehicle for a specific time.
 */
public class VehicleSetChangeLane
        extends AbstractTraciCommand<Void>
        implements org.eclipse.mosaic.fed.sumo.bridge.api.VehicleSetChangeLane {
```

### ClassNameSameAsAncestorName
Class name `TrafficLightGetControlledLanes` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/TrafficLightGetControlledLanes.java`
#### Snippet
```java
 * This class represents the SUMO command which allows to get the controlled lanes by traffic light apps.
 */
public class TrafficLightGetControlledLanes
        extends AbstractTraciCommand<List<String>>
        implements org.eclipse.mosaic.fed.sumo.bridge.api.TrafficLightGetControlledLanes {
```

### ClassNameSameAsAncestorName
Class name `VehicleGetVehicleTypeId` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/VehicleGetVehicleTypeId.java`
#### Snippet
```java
 * This class represents the SUMO command which allows to get the Id of the vehicle type.
 */
public class VehicleGetVehicleTypeId
        extends AbstractTraciCommand<String>
        implements org.eclipse.mosaic.fed.sumo.bridge.api.VehicleGetVehicleTypeId {
```

### ClassNameSameAsAncestorName
Class name `TrafficLightGetPrograms` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/TrafficLightGetPrograms.java`
#### Snippet
```java
 * prior API versions an empty list is returned.
 */
public class TrafficLightGetPrograms
        extends AbstractTraciCommand<List<SumoTrafficLightLogic>>
        implements org.eclipse.mosaic.fed.sumo.bridge.api.TrafficLightGetPrograms {
```

### ClassNameSameAsAncestorName
Class name `LaneSetDisallow` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/LaneSetDisallow.java`
#### Snippet
```java
 * This class represents the SUMO command which sets the disallowed classes to a specific lane.
 */
public class LaneSetDisallow
        extends AbstractTraciCommand<Void>
        implements org.eclipse.mosaic.fed.sumo.bridge.api.LaneSetDisallow {
```

### ClassNameSameAsAncestorName
Class name `TrafficLightSubscribe` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/TrafficLightSubscribe.java`
#### Snippet
```java
 * For more information check https://sumo.dlr.de/docs/TraCI/Object_Variable_Subscription.html
 */
public class TrafficLightSubscribe
        extends AbstractTraciCommand<Void>
        implements org.eclipse.mosaic.fed.sumo.bridge.api.TrafficLightSubscribe {
```

### ClassNameSameAsAncestorName
Class name `VehicleSubscribe` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/VehicleSubscribe.java`
#### Snippet
```java
 * Several options for vehicle subscription are implemented in this class.
 */
public class VehicleSubscribe
        extends AbstractTraciCommand<Void>
        implements org.eclipse.mosaic.fed.sumo.bridge.api.VehicleSubscribe {
```

### ClassNameSameAsAncestorName
Class name `VehicleSetResume` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/libsumo/VehicleSetResume.java`
#### Snippet
```java
import org.eclipse.sumo.libsumo.Vehicle;

public class VehicleSetResume implements org.eclipse.mosaic.fed.sumo.bridge.api.VehicleSetResume {

    public void execute(Bridge bridge, String vehicleId) {
```

### ClassNameSameAsAncestorName
Class name `TrafficLightGetTimeOfNextSwitch` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/libsumo/TrafficLightGetTimeOfNextSwitch.java`
#### Snippet
```java
import org.eclipse.sumo.libsumo.TrafficLight;

public class TrafficLightGetTimeOfNextSwitch implements org.eclipse.mosaic.fed.sumo.bridge.api.TrafficLightGetTimeOfNextSwitch {

    public double execute(Bridge bridge, String tlId) throws CommandException {
```

### ClassNameSameAsAncestorName
Class name `PoiSetHeight` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/libsumo/PoiSetHeight.java`
#### Snippet
```java
 * This class sets the height of a PoI object in the SUMO-GUI.
 */
public class PoiSetHeight implements org.eclipse.mosaic.fed.sumo.bridge.api.PoiSetHeight {
    /**
     * Executes the command in order to set the height of a previously added PoI object.
```

### ClassNameSameAsAncestorName
Class name `VehicleSetColor` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/libsumo/VehicleSetColor.java`
#### Snippet
```java
import org.eclipse.sumo.libsumo.Vehicle;

public class VehicleSetColor implements org.eclipse.mosaic.fed.sumo.bridge.api.VehicleSetColor {

    public void execute(Bridge bridge, String vehicleId, int red, int green, int blue, int alpha) {
```

### ClassNameSameAsAncestorName
Class name `VehicleTypeGetWidth` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/libsumo/VehicleTypeGetWidth.java`
#### Snippet
```java
import org.eclipse.sumo.libsumo.VehicleType;

public class VehicleTypeGetWidth implements org.eclipse.mosaic.fed.sumo.bridge.api.VehicleTypeGetWidth {

    public double execute(Bridge bridge, String typeId) {
```

### ClassNameSameAsAncestorName
Class name `JunctionGetPosition` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/libsumo/JunctionGetPosition.java`
#### Snippet
```java
import org.eclipse.sumo.libsumo.TraCIPosition;

public class JunctionGetPosition implements org.eclipse.mosaic.fed.sumo.bridge.api.JunctionGetPosition {

    public Position execute(Bridge bridge, String junctionId) throws CommandException {
```

### ClassNameSameAsAncestorName
Class name `VehicleSetMinGap` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/libsumo/VehicleSetMinGap.java`
#### Snippet
```java
import org.eclipse.sumo.libsumo.Vehicle;

public class VehicleSetMinGap implements org.eclipse.mosaic.fed.sumo.bridge.api.VehicleSetMinGap {

    public void execute(Bridge bridge, String vehicleId, double value) {
```

### ClassNameSameAsAncestorName
Class name `VehicleGetRouteId` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/libsumo/VehicleGetRouteId.java`
#### Snippet
```java
import org.eclipse.sumo.libsumo.Vehicle;

public class VehicleGetRouteId implements org.eclipse.mosaic.fed.sumo.bridge.api.VehicleGetRouteId {

    public String execute(Bridge bridge, String vehicle) {
```

### ClassNameSameAsAncestorName
Class name `RouteGetIds` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/libsumo/RouteGetIds.java`
#### Snippet
```java
import java.util.List;

public class RouteGetIds implements org.eclipse.mosaic.fed.sumo.bridge.api.RouteGetIds {

    public List<String> execute(Bridge bridge) {
```

### ClassNameSameAsAncestorName
Class name `TrafficLightSetProgram` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/libsumo/TrafficLightSetProgram.java`
#### Snippet
```java
import org.eclipse.sumo.libsumo.TrafficLight;

public class TrafficLightSetProgram implements org.eclipse.mosaic.fed.sumo.bridge.api.TrafficLightSetProgram {

    public void execute(Bridge bridge, String tlId, String programId) {
```

### ClassNameSameAsAncestorName
Class name `PoiSetWidth` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/libsumo/PoiSetWidth.java`
#### Snippet
```java
 * This class sets the width of a PoI object in the SUMO-GUI.
 */
public class PoiSetWidth implements org.eclipse.mosaic.fed.sumo.bridge.api.PoiSetWidth {
    /**
     * Executes the command in order to set the width of a previously added PoI object.
```

### ClassNameSameAsAncestorName
Class name `LaneGetLength` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/libsumo/LaneGetLength.java`
#### Snippet
```java
import org.eclipse.sumo.libsumo.Lane;

public class LaneGetLength implements org.eclipse.mosaic.fed.sumo.bridge.api.LaneGetLength {

    public Double execute(Bridge bridge, String laneId) {
```

### ClassNameSameAsAncestorName
Class name `LaneAreaSubscribe` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/libsumo/LaneAreaSubscribe.java`
#### Snippet
```java
import org.eclipse.mosaic.fed.sumo.bridge.Bridge;

public class LaneAreaSubscribe implements org.eclipse.mosaic.fed.sumo.bridge.api.LaneAreaSubscribe {

    public void execute(Bridge bridge, String laneAreaId, long startTime, long endTime) {
```

### ClassNameSameAsAncestorName
Class name `VehicleSetMaxSpeed` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/libsumo/VehicleSetMaxSpeed.java`
#### Snippet
```java
import org.eclipse.sumo.libsumo.Vehicle;

public class VehicleSetMaxSpeed implements org.eclipse.mosaic.fed.sumo.bridge.api.VehicleSetMaxSpeed {

    public void execute(Bridge bridge, String vehicleId, double value) {
```

### ClassNameSameAsAncestorName
Class name `InductionLoopSubscribe` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/libsumo/InductionLoopSubscribe.java`
#### Snippet
```java
import org.eclipse.mosaic.fed.sumo.bridge.Bridge;

public class InductionLoopSubscribe implements org.eclipse.mosaic.fed.sumo.bridge.api.InductionLoopSubscribe {

    public void execute(Bridge bridge, String inductionLoopId, long startTime, long endTime) {
```

### ClassNameSameAsAncestorName
Class name `SimulationGetTrafficLightIds` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/libsumo/SimulationGetTrafficLightIds.java`
#### Snippet
```java
import java.util.List;

public class SimulationGetTrafficLightIds implements org.eclipse.mosaic.fed.sumo.bridge.api.SimulationGetTrafficLightIds {

    public List<String> execute(Bridge bridge) {
```

### ClassNameSameAsAncestorName
Class name `TrafficLightGetState` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/libsumo/TrafficLightGetState.java`
#### Snippet
```java
import org.eclipse.sumo.libsumo.TrafficLight;

public class TrafficLightGetState implements org.eclipse.mosaic.fed.sumo.bridge.api.TrafficLightGetState {

    public String execute(Bridge bridge, String tlId) throws CommandException {
```

### ClassNameSameAsAncestorName
Class name `VehicleTypeGetDecel` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/libsumo/VehicleTypeGetDecel.java`
#### Snippet
```java
import org.eclipse.sumo.libsumo.VehicleType;

public class VehicleTypeGetDecel implements org.eclipse.mosaic.fed.sumo.bridge.api.VehicleTypeGetDecel {

    public double execute(Bridge bridge, String typeId) {
```

### ClassNameSameAsAncestorName
Class name `VehicleSetMaxAcceleration` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/libsumo/VehicleSetMaxAcceleration.java`
#### Snippet
```java
import org.eclipse.sumo.libsumo.Vehicle;

public class VehicleSetMaxAcceleration implements org.eclipse.mosaic.fed.sumo.bridge.api.VehicleSetMaxAcceleration {

    public void execute(Bridge bridge, String vehicleId, double value) throws CommandException, InternalFederateException {
```

### ClassNameSameAsAncestorName
Class name `PoiSetImage` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/libsumo/PoiSetImage.java`
#### Snippet
```java
 * This class sets the image path of a PoI object in the SUMO-GUI.
 */
public class PoiSetImage implements org.eclipse.mosaic.fed.sumo.bridge.api.PoiSetImage {
    /**
     * Executes the command in order to set the image path of a previously added PoI object.
```

### ClassNameSameAsAncestorName
Class name `SimulationGetDepartedVehicleIds` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/libsumo/SimulationGetDepartedVehicleIds.java`
#### Snippet
```java
import java.util.stream.Collectors;

public class SimulationGetDepartedVehicleIds implements org.eclipse.mosaic.fed.sumo.bridge.api.SimulationGetDepartedVehicleIds {

    public List<String> execute(Bridge bridge) {
```

### ClassNameSameAsAncestorName
Class name `LaneSetMaxSpeed` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/libsumo/LaneSetMaxSpeed.java`
#### Snippet
```java
import org.eclipse.sumo.libsumo.Lane;

public class LaneSetMaxSpeed implements org.eclipse.mosaic.fed.sumo.bridge.api.LaneSetMaxSpeed {

    public void execute(Bridge bridge, String laneId, double maxSpeed) {
```

### ClassNameSameAsAncestorName
Class name `VehicleSetVehicleLength` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/libsumo/VehicleSetVehicleLength.java`
#### Snippet
```java
import org.eclipse.sumo.libsumo.Vehicle;

public class VehicleSetVehicleLength implements org.eclipse.mosaic.fed.sumo.bridge.api.VehicleSetVehicleLength {

    public void execute(Bridge bridge, String vehicleId, double value) throws CommandException, InternalFederateException {
```

### ClassNameSameAsAncestorName
Class name `VehicleTypeGetHeight` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/libsumo/VehicleTypeGetHeight.java`
#### Snippet
```java
import org.eclipse.sumo.libsumo.VehicleType;

public class VehicleTypeGetHeight implements org.eclipse.mosaic.fed.sumo.bridge.api.VehicleTypeGetHeight {

    public double execute(Bridge bridge, String typeId) {
```

### ClassNameSameAsAncestorName
Class name `VehicleSubscribeSurroundingVehicle` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/libsumo/VehicleSubscribeSurroundingVehicle.java`
#### Snippet
```java
 * Several options for vehicle subscription are implemented in this class.
 */
public class VehicleSubscribeSurroundingVehicle
        implements org.eclipse.mosaic.fed.sumo.bridge.api.VehicleSubscribeSurroundingVehicle {

```

### ClassNameSameAsAncestorName
Class name `LaneSetAllow` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/libsumo/LaneSetAllow.java`
#### Snippet
```java
import java.util.List;

public class LaneSetAllow implements org.eclipse.mosaic.fed.sumo.bridge.api.LaneSetAllow {

    public void execute(Bridge bridge, String laneId, List<String> allowedVClasses) {
```

### ClassNameSameAsAncestorName
Class name `VehicleSetRouteById` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/libsumo/VehicleSetRouteById.java`
#### Snippet
```java
import org.eclipse.sumo.libsumo.Vehicle;

public class VehicleSetRouteById implements org.eclipse.mosaic.fed.sumo.bridge.api.VehicleSetRouteById {

    public void execute(Bridge bridge, String vehicleId, String routeId) {
```

### ClassNameSameAsAncestorName
Class name `TrafficLightSetPhaseIndex` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/libsumo/TrafficLightSetPhaseIndex.java`
#### Snippet
```java
import org.eclipse.sumo.libsumo.TrafficLight;

public class TrafficLightSetPhaseIndex implements org.eclipse.mosaic.fed.sumo.bridge.api.TrafficLightSetPhaseIndex {

    public void execute(Bridge bridge, String tlId, int phaseIndex) {
```

### ClassNameSameAsAncestorName
Class name `VehicleSetSpeed` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/libsumo/VehicleSetSpeed.java`
#### Snippet
```java
import org.eclipse.sumo.libsumo.Vehicle;

public class VehicleSetSpeed implements org.eclipse.mosaic.fed.sumo.bridge.api.VehicleSetSpeed {

    public void execute(Bridge bridge, String vehicleId, double value) {
```

### ClassNameSameAsAncestorName
Class name `TrafficLightSetRemainingPhaseDuration` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/libsumo/TrafficLightSetRemainingPhaseDuration.java`
#### Snippet
```java
import org.eclipse.sumo.libsumo.TrafficLight;

public class TrafficLightSetRemainingPhaseDuration implements org.eclipse.mosaic.fed.sumo.bridge.api.TrafficLightSetRemainingPhaseDuration {

    public void execute(Bridge bridge, String tlId, double remainingDurationS) {
```

### ClassNameSameAsAncestorName
Class name `VehicleSubscriptionSetFieldOfVision` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/libsumo/VehicleSubscriptionSetFieldOfVision.java`
#### Snippet
```java
 * collect all vehicles surrounding a specific vehicle.
 */
public class VehicleSubscriptionSetFieldOfVision
        implements org.eclipse.mosaic.fed.sumo.bridge.api.VehicleSubscriptionSetFieldOfVision {

```

### ClassNameSameAsAncestorName
Class name `TrafficLightGetControlledJunctions` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/libsumo/TrafficLightGetControlledJunctions.java`
#### Snippet
```java
import java.util.List;

public class TrafficLightGetControlledJunctions implements org.eclipse.mosaic.fed.sumo.bridge.api.TrafficLightGetControlledJunctions {

    public List<String> execute(Bridge bridge, String tlId) throws CommandException {
```

### ClassNameSameAsAncestorName
Class name `VehicleSetStop` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/libsumo/VehicleSetStop.java`
#### Snippet
```java
import org.eclipse.sumo.libsumo.Vehicle;

public class VehicleSetStop implements org.eclipse.mosaic.fed.sumo.bridge.api.VehicleSetStop {

    /**
```

### ClassNameSameAsAncestorName
Class name `PoiAdd` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/libsumo/PoiAdd.java`
#### Snippet
```java
 * This class adds a PoI object in the SUMO-GUI.
 */
public class PoiAdd implements org.eclipse.mosaic.fed.sumo.bridge.api.PoiAdd {

    /**
```

### ClassNameSameAsAncestorName
Class name `VehicleSetSpeedFactor` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/libsumo/VehicleSetSpeedFactor.java`
#### Snippet
```java
import org.eclipse.sumo.libsumo.Vehicle;

public class VehicleSetSpeedFactor implements org.eclipse.mosaic.fed.sumo.bridge.api.VehicleSetSpeedFactor {

    public void execute(Bridge bridge, String vehicleId, double value) {
```

### ClassNameSameAsAncestorName
Class name `VehicleSetMoveToXY` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/libsumo/VehicleSetMoveToXY.java`
#### Snippet
```java
import org.eclipse.sumo.libsumo.Vehicle;

public class VehicleSetMoveToXY implements org.eclipse.mosaic.fed.sumo.bridge.api.VehicleSetMoveToXY {

    public void execute(Bridge bridge, String vehicleId, String edgeId, int laneIndex, CartesianPoint position, double angle, Mode keepRouteMode) {
```

### ClassNameSameAsAncestorName
Class name `VehicleSetParameter` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/libsumo/VehicleSetParameter.java`
#### Snippet
```java
 * This class writes a parameter value for specific a vehicle.
 */
public class VehicleSetParameter implements org.eclipse.mosaic.fed.sumo.bridge.api.VehicleSetParameter {
    /**
     * This method executes the command with the given arguments in order to set the
```

### ClassNameSameAsAncestorName
Class name `TrafficLightGetCurrentProgram` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/libsumo/TrafficLightGetCurrentProgram.java`
#### Snippet
```java
import org.eclipse.sumo.libsumo.TrafficLight;

public class TrafficLightGetCurrentProgram implements org.eclipse.mosaic.fed.sumo.bridge.api.TrafficLightGetCurrentProgram {

    public String execute(Bridge bridge, String tlId) throws CommandException {
```

### ClassNameSameAsAncestorName
Class name `VehicleTypeGetSigma` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/libsumo/VehicleTypeGetSigma.java`
#### Snippet
```java
import org.eclipse.sumo.libsumo.VehicleType;

public class VehicleTypeGetSigma implements org.eclipse.mosaic.fed.sumo.bridge.api.VehicleTypeGetSigma {

    public double execute(Bridge bridge, String typeId) {
```

### ClassNameSameAsAncestorName
Class name `VehicleSetReactionTime` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/libsumo/VehicleSetReactionTime.java`
#### Snippet
```java
import org.eclipse.sumo.libsumo.Vehicle;

public class VehicleSetReactionTime
        implements org.eclipse.mosaic.fed.sumo.bridge.api.VehicleSetReactionTime {

```

### ClassNameSameAsAncestorName
Class name `TrafficLightGetControlledLinks` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/libsumo/TrafficLightGetControlledLinks.java`
#### Snippet
```java
import java.util.List;

public class TrafficLightGetControlledLinks implements org.eclipse.mosaic.fed.sumo.bridge.api.TrafficLightGetControlledLinks {


```

### ClassNameSameAsAncestorName
Class name `VehicleSetRemove` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/libsumo/VehicleSetRemove.java`
#### Snippet
```java
import org.eclipse.sumo.libsumo.Vehicle;

public class VehicleSetRemove implements org.eclipse.mosaic.fed.sumo.bridge.api.VehicleSetRemove {

    public void execute(Bridge bridge, String vehicleId, Reason reason) throws CommandException, InternalFederateException {
```

### ClassNameSameAsAncestorName
Class name `VehicleGetParameter` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/libsumo/VehicleGetParameter.java`
#### Snippet
```java
 * This class reads a parameter value for specific a vehicle.
 */
public class VehicleGetParameter implements org.eclipse.mosaic.fed.sumo.bridge.api.VehicleGetParameter {
    /**
     * This method executes the command with the given arguments in order to get the value of a specific parameter of the given vehicle.
```

### ClassNameSameAsAncestorName
Class name `VehicleAdd` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/libsumo/VehicleAdd.java`
#### Snippet
```java
import org.eclipse.sumo.libsumo.Vehicle;

public class VehicleAdd implements org.eclipse.mosaic.fed.sumo.bridge.api.VehicleAdd {

    public void execute(Bridge bridge, String vehicleId, String routeId, String vehicleType, String departLane, String departPosition, String departSpeed) throws CommandException, InternalFederateException {
```

### ClassNameSameAsAncestorName
Class name `SimulationClose` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/libsumo/SimulationClose.java`
#### Snippet
```java
import org.eclipse.sumo.libsumo.Simulation;

public class SimulationClose implements org.eclipse.mosaic.fed.sumo.bridge.api.SimulationClose {

    public void execute(Bridge bridge) {
```

### ClassNameSameAsAncestorName
Class name `VehicleTypeGetMaxSpeed` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/libsumo/VehicleTypeGetMaxSpeed.java`
#### Snippet
```java
import org.eclipse.sumo.libsumo.VehicleType;

public class VehicleTypeGetMaxSpeed implements org.eclipse.mosaic.fed.sumo.bridge.api.VehicleTypeGetMaxSpeed {

    public double execute(Bridge bridge, String typeId) {
```

### ClassNameSameAsAncestorName
Class name `VehicleTypeGetSpeedFactor` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/libsumo/VehicleTypeGetSpeedFactor.java`
#### Snippet
```java
import org.eclipse.sumo.libsumo.VehicleType;

public class VehicleTypeGetSpeedFactor implements org.eclipse.mosaic.fed.sumo.bridge.api.VehicleTypeGetSpeedFactor {

    public double execute(Bridge bridge, String typeId) {
```

### ClassNameSameAsAncestorName
Class name `LaneGetShape` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/libsumo/LaneGetShape.java`
#### Snippet
```java
import java.util.List;

public class LaneGetShape implements org.eclipse.mosaic.fed.sumo.bridge.api.LaneGetShape {
    @Override
    public List<Position> execute(Bridge bridge, String laneId) throws CommandException, InternalFederateException {
```

### ClassNameSameAsAncestorName
Class name `VehicleSetMaxDeceleration` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/libsumo/VehicleSetMaxDeceleration.java`
#### Snippet
```java
import org.eclipse.sumo.libsumo.Vehicle;

public class VehicleSetMaxDeceleration implements org.eclipse.mosaic.fed.sumo.bridge.api.VehicleSetMaxDeceleration {

    public void execute(Bridge bridge, String vehicleId, double value) {
```

### ClassNameSameAsAncestorName
Class name `TrafficLightGetCurrentPhase` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/libsumo/TrafficLightGetCurrentPhase.java`
#### Snippet
```java
import org.eclipse.sumo.libsumo.TrafficLight;

public class TrafficLightGetCurrentPhase implements org.eclipse.mosaic.fed.sumo.bridge.api.TrafficLightGetCurrentPhase {

    public int execute(Bridge bridge, String tlId) throws CommandException {
```

### ClassNameSameAsAncestorName
Class name `VehicleSetHighlight` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/libsumo/VehicleSetHighlight.java`
#### Snippet
```java
 * This class highlights a specific vehicle in the SUMO-GUI.
 */
public class VehicleSetHighlight implements org.eclipse.mosaic.fed.sumo.bridge.api.VehicleSetHighlight {
    /**
     * This method executes the command with the given arguments in order to highlight a vehicle in the SUMO-GUI with a circle
```

### ClassNameSameAsAncestorName
Class name `VehicleTypeGetLength` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/libsumo/VehicleTypeGetLength.java`
#### Snippet
```java
import org.eclipse.sumo.libsumo.VehicleType;

public class VehicleTypeGetLength implements org.eclipse.mosaic.fed.sumo.bridge.api.VehicleTypeGetLength {

    public double execute(Bridge bridge, String typeId) {
```

### ClassNameSameAsAncestorName
Class name `PoiSetAngle` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/libsumo/PoiSetAngle.java`
#### Snippet
```java
 * This rotates a PoI object in the SUMO-GUI.
 */
public class PoiSetAngle implements org.eclipse.mosaic.fed.sumo.bridge.api.PoiSetAngle {
    /**
     * Executes the command in order to set the direction of a previously added PoI object.
```

### ClassNameSameAsAncestorName
Class name `SimulationSimulateStep` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/libsumo/SimulationSimulateStep.java`
#### Snippet
```java


public class SimulationSimulateStep implements org.eclipse.mosaic.fed.sumo.bridge.api.SimulationSimulateStep {

    private final static Logger LOG = LoggerFactory.getLogger(SimulationSimulateStep.class);
```

### ClassNameSameAsAncestorName
Class name `TrafficLightAddProgram` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/libsumo/TrafficLightAddProgram.java`
#### Snippet
```java
import java.util.List;

public class TrafficLightAddProgram implements org.eclipse.mosaic.fed.sumo.bridge.api.TrafficLightAddProgram {

    public void execute(Bridge bridge, String tlId, String programId, int phaseIndex, List<SumoTrafficLightLogic.Phase> phases) {
```

### ClassNameSameAsAncestorName
Class name `VehicleTypeGetVClass` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/libsumo/VehicleTypeGetVClass.java`
#### Snippet
```java
import org.eclipse.sumo.libsumo.VehicleType;

public class VehicleTypeGetVClass implements org.eclipse.mosaic.fed.sumo.bridge.api.VehicleTypeGetVClass {

    public String execute(Bridge bridge, String typeId) {
```

### ClassNameSameAsAncestorName
Class name `VehicleSetSlowDown` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/libsumo/VehicleSetSlowDown.java`
#### Snippet
```java
import org.eclipse.sumo.libsumo.Vehicle;

public class VehicleSetSlowDown implements org.eclipse.mosaic.fed.sumo.bridge.api.VehicleSetSlowDown {

    /**
```

### ClassNameSameAsAncestorName
Class name `VehicleSetUpdateBestLanes` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/libsumo/VehicleSetUpdateBestLanes.java`
#### Snippet
```java
import org.eclipse.sumo.libsumo.Vehicle;

public class VehicleSetUpdateBestLanes implements org.eclipse.mosaic.fed.sumo.bridge.api.VehicleSetUpdateBestLanes {

    public void execute(Bridge bridge, String vehicleId) {
```

### ClassNameSameAsAncestorName
Class name `VehicleTypeGetAccel` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/libsumo/VehicleTypeGetAccel.java`
#### Snippet
```java
import org.eclipse.sumo.libsumo.VehicleType;

public class VehicleTypeGetAccel implements org.eclipse.mosaic.fed.sumo.bridge.api.VehicleTypeGetAccel {

    public double execute(Bridge bridge, String typeId) {
```

### ClassNameSameAsAncestorName
Class name `VehicleSetLaneChangeMode` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/libsumo/VehicleSetLaneChangeMode.java`
#### Snippet
```java
import org.eclipse.sumo.libsumo.Vehicle;

public class VehicleSetLaneChangeMode implements org.eclipse.mosaic.fed.sumo.bridge.api.VehicleSetLaneChangeMode {

    public void execute(Bridge bridge, String vehicleId, int value) {
```

### ClassNameSameAsAncestorName
Class name `TrafficLightSubscribe` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/libsumo/TrafficLightSubscribe.java`
#### Snippet
```java
 * For more information check https://sumo.dlr.de/docs/TraCI/Object_Variable_Subscription.html
 */
public class TrafficLightSubscribe implements org.eclipse.mosaic.fed.sumo.bridge.api.TrafficLightSubscribe {
    /**
     * This method executes the command with the given arguments in order to subscribe the traffic light group to the application.
```

### ClassNameSameAsAncestorName
Class name `VehicleTypeGetTau` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/libsumo/VehicleTypeGetTau.java`
#### Snippet
```java
import org.eclipse.sumo.libsumo.VehicleType;

public class VehicleTypeGetTau implements org.eclipse.mosaic.fed.sumo.bridge.api.VehicleTypeGetTau {

    public double execute(Bridge bridge, String typeId) {
```

### ClassNameSameAsAncestorName
Class name `RouteGetEdges` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/libsumo/RouteGetEdges.java`
#### Snippet
```java
import java.util.List;

public class RouteGetEdges implements org.eclipse.mosaic.fed.sumo.bridge.api.RouteGetEdges {


```

### ClassNameSameAsAncestorName
Class name `PoiRemove` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/libsumo/PoiRemove.java`
#### Snippet
```java
 * This removes adds a PoI object in the SUMO-GUI.
 */
public class PoiRemove implements org.eclipse.mosaic.fed.sumo.bridge.api.PoiRemove {
    /**
     * Executes the command in order to remove a previously added PoI in the SUMO-GUI.
```

### ClassNameSameAsAncestorName
Class name `VehicleTypeGetMinGap` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/libsumo/VehicleTypeGetMinGap.java`
#### Snippet
```java
import org.eclipse.sumo.libsumo.VehicleType;

public class VehicleTypeGetMinGap implements org.eclipse.mosaic.fed.sumo.bridge.api.VehicleTypeGetMinGap {

    public double execute(Bridge bridge, String typeId) {
```

### ClassNameSameAsAncestorName
Class name `RouteAdd` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/libsumo/RouteAdd.java`
#### Snippet
```java
import java.util.List;

public class RouteAdd implements org.eclipse.mosaic.fed.sumo.bridge.api.RouteAdd {

    public void execute(Bridge bridge, String routeId, List<String> edges) {
```

### ClassNameSameAsAncestorName
Class name `TrafficLightGetControlledLanes` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/libsumo/TrafficLightGetControlledLanes.java`
#### Snippet
```java
import java.util.List;

public class TrafficLightGetControlledLanes implements org.eclipse.mosaic.fed.sumo.bridge.api.TrafficLightGetControlledLanes {

    public List<String> execute(Bridge bridge, String tlId) throws CommandException {
```

### ClassNameSameAsAncestorName
Class name `VehicleSetSpeedMode` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/libsumo/VehicleSetSpeedMode.java`
#### Snippet
```java
import org.eclipse.sumo.libsumo.Vehicle;

public class VehicleSetSpeedMode implements org.eclipse.mosaic.fed.sumo.bridge.api.VehicleSetSpeedMode {

    public void execute(Bridge bridge, String vehicleId, int value) {
```

### ClassNameSameAsAncestorName
Class name `VehicleSetImperfection` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/libsumo/VehicleSetImperfection.java`
#### Snippet
```java
import org.eclipse.sumo.libsumo.Vehicle;

public class VehicleSetImperfection implements org.eclipse.mosaic.fed.sumo.bridge.api.VehicleSetImperfection {

    public void execute(Bridge bridge, String vehicleId, double value) {
```

### ClassNameSameAsAncestorName
Class name `TrafficLightSetState` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/libsumo/TrafficLightSetState.java`
#### Snippet
```java
import org.eclipse.sumo.libsumo.TrafficLight;

public class TrafficLightSetState implements org.eclipse.mosaic.fed.sumo.bridge.api.TrafficLightSetState {

    public void execute(Bridge bridge, String tlId, String phaseDefinition) {
```

### ClassNameSameAsAncestorName
Class name `VehicleSetChangeLane` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/libsumo/VehicleSetChangeLane.java`
#### Snippet
```java
import org.eclipse.sumo.libsumo.Vehicle;

public class VehicleSetChangeLane implements org.eclipse.mosaic.fed.sumo.bridge.api.VehicleSetChangeLane {

    public void execute(Bridge bridge, String vehicleId, int laneIndex, long duration) {
```

### ClassNameSameAsAncestorName
Class name `VehicleSubscribe` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/libsumo/VehicleSubscribe.java`
#### Snippet
```java
import org.eclipse.mosaic.fed.sumo.bridge.Bridge;

public class VehicleSubscribe implements org.eclipse.mosaic.fed.sumo.bridge.api.VehicleSubscribe {

    public void execute(Bridge bridge, String vehicleId, long startTime, long endTime) {
```

### ClassNameSameAsAncestorName
Class name `VehicleGetVehicleTypeId` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/libsumo/VehicleGetVehicleTypeId.java`
#### Snippet
```java
import org.eclipse.sumo.libsumo.Vehicle;

public class VehicleGetVehicleTypeId implements org.eclipse.mosaic.fed.sumo.bridge.api.VehicleGetVehicleTypeId {

    public String execute(Bridge bridge, String vehicle) {
```

### ClassNameSameAsAncestorName
Class name `TrafficLightGetPrograms` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/libsumo/TrafficLightGetPrograms.java`
#### Snippet
```java
import java.util.List;

public class TrafficLightGetPrograms implements org.eclipse.mosaic.fed.sumo.bridge.api.TrafficLightGetPrograms {

    public List<SumoTrafficLightLogic> execute(Bridge bridge, String tlId) throws CommandException, InternalFederateException {
```

### ClassNameSameAsAncestorName
Class name `LaneSetDisallow` is the same as one of its superclass' names
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/libsumo/LaneSetDisallow.java`
#### Snippet
```java
import java.util.List;

public class LaneSetDisallow implements org.eclipse.mosaic.fed.sumo.bridge.api.LaneSetDisallow {

    public void execute(Bridge bridge, String laneId, List<String> disallowedVClasses) {
```

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `hashCode()` only delegates to its super method
in `lib/mosaic-database/src/main/java/org/eclipse/mosaic/lib/database/road/TrafficLightNode.java`
#### Snippet
```java

    @Override
    public int hashCode() {
        return super.hashCode();
    }
```

### RedundantMethodOverride
Method `isSpawningActive()` is identical to its super method
in `fed/mosaic-mapping/src/main/java/org/eclipse/mosaic/fed/mapping/ambassador/spawning/flow/ConstantSpawningMode.java`
#### Snippet
```java

    @Override
    public boolean isSpawningActive(long currentTime) {
        return end > currentTime;
    }
```

### RedundantMethodOverride
Method `addTrafficLightGroup()` only delegates to its super method
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/simulation/perception/CentralPerceptionComponent.java`
#### Snippet
```java

        @Override
        public void addTrafficLightGroup(TrafficLightGroup trafficLightGroup) {
            super.addTrafficLightGroup(trafficLightGroup);
        }
```

### RedundantMethodOverride
Method `getNumberOfTrafficLights()` only delegates to its super method
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/simulation/perception/CentralPerceptionComponent.java`
#### Snippet
```java

        @Override
        public int getNumberOfTrafficLights() {
            return super.getNumberOfTrafficLights();
        }
```

### RedundantMethodOverride
Method `getNumberOfVehicles()` only delegates to its super method
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/simulation/perception/CentralPerceptionComponent.java`
#### Snippet
```java

        @Override
        public int getNumberOfVehicles() {
            return super.getNumberOfVehicles();
        }
```

### RedundantMethodOverride
Method `canProcessEvent()` is identical to its super method
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/simulation/AbstractSimulationUnit.java`
#### Snippet
```java
    }

    public boolean canProcessEvent() {
        return true;
    }
```

### RedundantMethodOverride
Method `initialize()` only delegates to its super method
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/ambassador/SumoAmbassador.java`
#### Snippet
```java

    @Override
    public void initialize(long startTime, long endTime) throws InternalFederateException {
        super.initialize(startTime, endTime);
    }
```

### RedundantMethodOverride
Method `canProcessEvent()` is identical to its super method
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/ambassador/AbstractSumoAmbassador.java`
#### Snippet
```java

    @Override
    public boolean canProcessEvent() {
        return true;
    }
```

## RuleId[id=IntegerMultiplicationImplicitCastToLong]
### IntegerMultiplicationImplicitCastToLong
1 \<\< i: integer shift implicitly cast to long
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/geo/GeoUtils.java`
#### Snippet
```java
        long quadKey = 0;
        for (int i = 0; i <= zoom; i++) {
            quadKey = quadKey | ((y & (1 << i)) << (i + 1)) | ((x & (1 << i)) << i);
        }
        return quadKey;
```

### IntegerMultiplicationImplicitCastToLong
1 \<\< i: integer shift implicitly cast to long
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/geo/GeoUtils.java`
#### Snippet
```java
        long quadKey = 0;
        for (int i = 0; i <= zoom; i++) {
            quadKey = quadKey | ((y & (1 << i)) << (i + 1)) | ((x & (1 << i)) << i);
        }
        return quadKey;
```

## RuleId[id=UnnecessarySuperQualifier]
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lib/mosaic-utils/src/main/java/org/eclipse/mosaic/lib/util/scheduling/MultiThreadedEventScheduler.java`
#### Snippet
```java

        while (true) {
            final Event nextEvent = super.eventQueue.peek();
            if (nextEvent == null) {
                processedEvents += executeEvents(executables);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lib/mosaic-utils/src/main/java/org/eclipse/mosaic/lib/util/scheduling/MultiThreadedEventScheduler.java`
#### Snippet
```java
                throw new RuntimeException("Scheduled event lies in the past.");
            } else if (nextEvent.getTime() == time && nextEvent.getNice() == nice) {
                super.eventQueue.remove(); // remove the head of the queue
                executables.add(nextEvent::execute);
            } else if (nextEvent.getTime() == time) {
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lib/mosaic-utils/src/main/java/org/eclipse/mosaic/lib/util/scheduling/MultiThreadedEventScheduler.java`
#### Snippet
```java
                executables.add(nextEvent::execute);
            } else if (nextEvent.getTime() == time) {
                super.eventQueue.remove(); // remove the head of the queue
                // same time, but different nice value
                processedEvents += executeEvents(executables);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lib/mosaic-objects/src/main/java/org/eclipse/mosaic/lib/objects/traffic/LaneAreaDetectorInfo.java`
#### Snippet
```java
    public String toString() {
        return "LaneAreaDetectorInfo{"
                + "name=" + super.getName()
                + ", length=" + length
                + ", vehicleCount=" + vehicleCount
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lib/mosaic-objects/src/main/java/org/eclipse/mosaic/lib/objects/traffic/InductionLoopInfo.java`
#### Snippet
```java
    public String toString() {
        return "InductionLoopInfo{"
                + "name=" + super.getName()
                + ", vehicleCount=" + vehicleCount
                + ", meanSpeed=" + meanSpeed
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lib/mosaic-objects/src/main/java/org/eclipse/mosaic/lib/objects/trafficsign/TrafficSignLaneAssignment.java`
#### Snippet
```java
    public TrafficSignLaneAssignment(String id, Position position, String connectionId, List<LaneAssignment> laneAssignments) {
        super(id, position, connectionId);
        super.addSignContents(laneAssignments);
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `lib/mosaic-routing/src/main/java/org/eclipse/mosaic/lib/routing/graphhopper/algorithm/AbstractCamvitChoiceRouting.java`
#### Snippet
```java
     */
    protected boolean accept(EdgeIterator edge, SPTEntry currEdge) {
        return (currEdge.edge == EdgeIterator.NO_EDGE || edge.getEdge() != currEdge.edge) && super.accept(edge, currEdge.edge);
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `rti/mosaic-rti-core/src/main/java/org/eclipse/mosaic/rti/federation/DistributedFederationManagement.java`
#### Snippet
```java
            CLocalHost host = handle.getHost();
            if (!(host instanceof CRemoteHost)) {
                super.stopFederate(handle, true);
                return;
            }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/simulation/ServerUnit.java`
#### Snippet
```java
    public void processEvent(Event event) throws Exception {
        // never remove the preProcessEvent call!
        final boolean preProcessed = super.preProcessEvent(event);

        // don't handle processed events
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/simulation/ChargingStationUnit.java`
#### Snippet
```java
    public void processEvent(@Nonnull final Event event) throws Exception {
        // never remove the preProcessEvent call!
        final boolean preProcessed = super.preProcessEvent(event);

        // failsafe
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/simulation/TrafficManagementCenterUnit.java`
#### Snippet
```java
    public void processEvent(Event event) throws Exception {
        // never remove the preProcessEvent call!
        final boolean preProcessed = super.preProcessEvent(event);

        // don't handle processed events
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/simulation/RoadSideUnit.java`
#### Snippet
```java
    public void processEvent(@Nonnull final Event event) throws Exception {
        // never remove the preProcessEvent call!
        final boolean preProcessed = super.preProcessEvent(event);

        // failsafe
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/simulation/VehicleUnit.java`
#### Snippet
```java
    public void processEvent(@Nonnull final Event event) throws Exception {
        // never remove the preProcessEvent call!
        final boolean preProcessed = super.preProcessEvent(event);

        // failsafe
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/simulation/TrafficLightGroupUnit.java`
#### Snippet
```java
    public void processEvent(@Nonnull final Event event) throws Exception {
        // never remove the preProcessEvent call!
        final boolean preProcessed = super.preProcessEvent(event);

        // don't handle processed events
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/simulation/communication/CellModule.java`
#### Snippet
```java
            }
        }
        return super.sendCam(routing);
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/simulation/communication/AdHocModule.java`
#### Snippet
```java

        final MessageRouting routing = createMessageRouting().topoBroadCast();
        return super.sendCam(routing);
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/SimulationTraciRequest.java`
#### Snippet
```java
            throws CommandException, InternalFederateException {
        this.msgId = messageId;
        return super.executeAndReturn(bridge, (Object) messageContent).orElse(
                new SumoTraciResult(
                        messageId,
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/SimulationSimulateStep.java`
#### Snippet
```java
     */
    public List<AbstractSubscriptionResult> execute(Bridge bridge, long time) throws CommandException, InternalFederateException {
        return super.executeAndReturnList(bridge, (double) (time) / TIME.SECOND);
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/VehicleTypeGetWidth.java`
#### Snippet
```java

    public double execute(Bridge bridge, String vehicleTypeId) throws CommandException, InternalFederateException {
        return super.executeAndReturn(bridge, vehicleTypeId).orElse(0d);
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/RouteGetIds.java`
#### Snippet
```java

    public List<String> execute(Bridge bridge) throws CommandException, InternalFederateException {
        return super.executeAndReturn(bridge).orElseThrow(
                () -> new CommandException("Could not read list of Route Ids.")
        );
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/JunctionGetPosition.java`
#### Snippet
```java
     */
    public Position execute(Bridge bridge, String junctionId) throws CommandException, InternalFederateException {
        return super.executeAndReturn(bridge, junctionId).orElseThrow(
                () -> new CommandException(
                        String.format(Locale.ENGLISH, "Couldn't get Position of Junction %s.", junctionId)
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/LaneGetLength.java`
#### Snippet
```java
     */
    public Double execute(Bridge bridge, String laneId) throws CommandException, InternalFederateException {
        return super.executeAndReturn(bridge, laneId).orElseThrow(
                () -> new CommandException(
                        String.format(Locale.ENGLISH, "Couldn't get Length of Lane %s.", laneId)
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/VehicleTypeGetDecel.java`
#### Snippet
```java

    public double execute(Bridge bridge, String vehicleTypeId) throws CommandException, InternalFederateException {
        return super.executeAndReturn(bridge, vehicleTypeId).orElse(0d);
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/SimulationGetTrafficLightIds.java`
#### Snippet
```java
     */
    public List<String> execute(Bridge bridge) throws CommandException, InternalFederateException {
        return super.executeAndReturn(bridge).orElseThrow(
                () -> new CommandException("Could not read list of TrafficLight Ids.")
        );
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/LaneAreaSubscribe.java`
#### Snippet
```java
     */
    public void execute(Bridge bridge, String laneAreaId, long startTime, long endTime) throws CommandException, InternalFederateException {
        super.execute(bridge, ((double) startTime) / TIME.SECOND, ((double) endTime) / TIME.SECOND, laneAreaId);
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/InductionLoopSubscribe.java`
#### Snippet
```java
     */
    public void execute(Bridge bridge, String inductionLoopId, long startTime, long endTime) throws CommandException, InternalFederateException {
        super.execute(bridge, ((double) startTime) / TIME.SECOND, ((double) endTime) / TIME.SECOND, inductionLoopId);
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/VehicleTypeGetHeight.java`
#### Snippet
```java

    public double execute(Bridge bridge, String vehicleTypeId) throws CommandException, InternalFederateException {
        return super.executeAndReturn(bridge, vehicleTypeId).orElse(0d);
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/VehicleSubscribeSurroundingVehicle.java`
#### Snippet
```java
     */
    public void execute(Bridge bridge, String vehicleId, long startTime, long endTime, double range) throws CommandException, InternalFederateException {
        super.execute(bridge, ((double) startTime) / TIME.SECOND, ((double) endTime) / TIME.SECOND, vehicleId, range);
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/PoiAdd.java`
#### Snippet
```java
     */
    public void execute(Bridge bridge, String poiId, int layer, CartesianPoint position, Color color) throws CommandException, InternalFederateException {
        super.execute(bridge, poiId, poiId,
                color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha(),
                layer, position.getX(), position.getY()
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/VehicleSetStop.java`
#### Snippet
```java
     */
    public void execute(Bridge bridge, String vehicleId, String edgeId, double position, int laneIndex, long duration, int stopFlag) throws CommandException, InternalFederateException {
        super.execute(bridge, vehicleId, edgeId, position, laneIndex, duration / (double) TIME.SECOND, stopFlag);
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/VehicleGetParameter.java`
#### Snippet
```java
     */
    public String execute(Bridge bridge, String vehicleId, String parameterName) throws CommandException, InternalFederateException {
        return super.executeAndReturn(bridge, vehicleId, parameterName).orElse(null);
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/VehicleSetMoveToXY.java`
#### Snippet
```java
     */
    public void execute(Bridge bridge, String vehicleId, String edgeId, int laneIndex, CartesianPoint position, double angle, Mode keepRouteMode) throws CommandException, InternalFederateException {
        super.execute(bridge, vehicleId, edgeId, laneIndex, position.getX(), position.getY(), angle, keepRouteMode.mode);
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/TrafficLightGetControlledLinks.java`
#### Snippet
```java

    public List<TrafficLightControlledLink> execute(Bridge bridge, String tlId) throws CommandException, InternalFederateException {
        return super.executeAndReturn(bridge, tlId).orElseThrow(
                () -> new CommandException(
                        String.format(Locale.ENGLISH, "Could not read list of controlled Links for TrafficLight %s.", tlId)
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/VehicleTypeGetSigma.java`
#### Snippet
```java

    public double execute(Bridge bridge, String vehicleTypeId) throws CommandException, InternalFederateException {
        return super.executeAndReturn(bridge, vehicleTypeId).orElse(0d);
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/LaneGetShape.java`
#### Snippet
```java
    @Override
    public List<Position> execute(Bridge bridge, String laneId) throws CommandException, InternalFederateException {
        return super.executeAndReturn(bridge, laneId).orElseThrow(
                () -> new CommandException(
                        String.format(Locale.ENGLISH, "Couldn't get shape of of Lane %s.", laneId)
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/VehicleTypeGetMaxSpeed.java`
#### Snippet
```java

    public double execute(Bridge bridge, String vehicleTypeId) throws CommandException, InternalFederateException {
        return super.executeAndReturn(bridge, vehicleTypeId).orElse(0d);
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/VehicleSetRemove.java`
#### Snippet
```java
     */
    public void execute(Bridge bridge, String vehicleId, Reason reason) throws CommandException, InternalFederateException {
        super.execute(bridge, vehicleId, reason.reasonByte);
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/VehicleTypeGetSpeedFactor.java`
#### Snippet
```java

    public double execute(Bridge bridge, String vehicleTypeId) throws CommandException, InternalFederateException {
        return super.executeAndReturn(bridge, vehicleTypeId).orElse(0d);
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/VehicleSetHighlight.java`
#### Snippet
```java
     */
    public void execute(Bridge bridge, String vehicleId, Color color) throws CommandException, InternalFederateException {
        super.execute(bridge, vehicleId, color.getRed(), color.getGreen(), color.getBlue());
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/VehicleTypeGetLength.java`
#### Snippet
```java

    public double execute(Bridge bridge, String vehicleTypeId) throws CommandException, InternalFederateException {
        return super.executeAndReturn(bridge, vehicleTypeId).orElse(0d);
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/VehicleTypeGetAccel.java`
#### Snippet
```java

    public double execute(Bridge bridge, String vehicleTypeId) throws CommandException, InternalFederateException {
        return super.executeAndReturn(bridge, vehicleTypeId).orElse(0d);
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/VehicleSetSlowDown.java`
#### Snippet
```java
     */
    public void execute(Bridge bridge, String vehicleId, double newSpeedMps, long time) throws CommandException, InternalFederateException {
        super.execute(bridge, vehicleId, newSpeedMps, (double) time / TIME.SECOND);
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/VehicleTypeGetVClass.java`
#### Snippet
```java

    public String execute(Bridge bridge, String vehicleTypeId) throws CommandException, InternalFederateException {
        return super.executeAndReturn(bridge, vehicleTypeId).orElse("passenger");
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/RouteGetEdges.java`
#### Snippet
```java
     */
    public List<String> execute(Bridge bridge, String routeId) throws CommandException, InternalFederateException {
        return super.executeAndReturn(bridge, routeId).orElseThrow(
                () -> new CommandException(
                        String.format(Locale.ENGLISH, "Couldn't extract Edges of Route %s.", routeId)
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/VehicleTypeGetMinGap.java`
#### Snippet
```java

    public double execute(Bridge bridge, String vehicleTypeId) throws CommandException, InternalFederateException {
        return super.executeAndReturn(bridge, vehicleTypeId).orElse(0d);
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/VehicleTypeGetTau.java`
#### Snippet
```java

    public double execute(Bridge bridge, String vehicleTypeId) throws CommandException, InternalFederateException {
        return super.executeAndReturn(bridge, vehicleTypeId).orElse(0d);
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/VehicleSetChangeLane.java`
#### Snippet
```java
     */
    public void execute(Bridge bridge, String vehicleId, int laneIndex, long duration) throws CommandException, InternalFederateException {
        super.execute(bridge, vehicleId, laneIndex, duration / (double) TIME.SECOND);
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/TrafficLightGetControlledLanes.java`
#### Snippet
```java
     */
    public List<String> execute(Bridge bridge, String tlId) throws CommandException, InternalFederateException {
        return super.executeAndReturn(bridge, tlId).orElseThrow(
                () -> new CommandException(String.format(
                        Locale.ENGLISH, "Could not read list of controlled Lanes for TrafficLight %s.", tlId)
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/TrafficLightSubscribe.java`
#### Snippet
```java
     */
    public void execute(Bridge bridge, String trafficLightGroupId, long startTime, long endTime) throws CommandException, InternalFederateException {
        super.execute(bridge, ((double) startTime) / TIME.SECOND, ((double) endTime) / TIME.SECOND, trafficLightGroupId);
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/VehicleSubscribe.java`
#### Snippet
```java
     */
    public void execute(Bridge bridge, String vehicleId, long startTime, long endTime) throws CommandException, InternalFederateException {
        super.execute(bridge, ((double) startTime) / TIME.SECOND, ((double) endTime) / TIME.SECOND, vehicleId);
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/writer/ListTraciWriter.java`
#### Snippet
```java
    @Override
    public void write(DataOutputStream out) throws IOException {
        writeVariableArgument(out, super.value);
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/ambassador/SumoGuiAmbassador.java`
#### Snippet
```java
                this.descriptor,
                AbstractSumoAmbassador.getFromSumoHome("sumo-gui"),
                super.getProgramArguments(port)
        );
        this.startCmdPort = port;
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/ambassador/SumoAmbassador.java`
#### Snippet
```java
                routes.put(route.getId(), route);
                // propagate new route
                final VehicleRouteRegistration vehicleRouteRegistration = new VehicleRouteRegistration(super.nextTimeStep, route);
                try {
                    rti.triggerInteraction(vehicleRouteRegistration);
```

## RuleId[id=SlowListContainsAll]
### SlowListContainsAll
Call to 'list.containsAll(collection)' may have poor performance
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/ambassador/AbstractSumoAmbassador.java`
#### Snippet
```java
            log.info("Change disallowed vehicle classes of lane with ID={}", laneId);

            if (lanePropertyChange.getDisallowedVehicleClasses().containsAll(Lists.newArrayList(VehicleClass.values()))) {
                bridge.getSimulationControl().setLaneAllowedVehicles(laneId, Lists.newArrayList());
            } else {
```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import org.eclipse.mosaic.lib.objects.v2x.V2xMessage;`
in `app/tutorials/weather-warning/src/test/java/WeatherWarningAppTest.java`
#### Snippet
```java
import org.eclipse.mosaic.lib.objects.road.IRoadPosition;
import org.eclipse.mosaic.lib.objects.v2x.MessageRouting;
import org.eclipse.mosaic.lib.objects.v2x.V2xMessage;
import org.eclipse.mosaic.lib.objects.v2x.V2xReceiverInformation;
import org.eclipse.mosaic.lib.objects.v2x.etsi.Denm;
```

### UNUSED_IMPORT
Unused import `import org.eclipse.mosaic.fed.application.ambassador.simulation.communication.AdHocModule;`
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/simulation/TrafficManagementCenterUnit.java`
#### Snippet
```java

import org.eclipse.mosaic.fed.application.ambassador.ErrorRegister;
import org.eclipse.mosaic.fed.application.ambassador.simulation.communication.AdHocModule;
import org.eclipse.mosaic.fed.application.ambassador.simulation.communication.CamBuilder;
import org.eclipse.mosaic.fed.application.ambassador.simulation.tmc.InductionLoop;
```

### UNUSED_IMPORT
Unused import `import org.eclipse.mosaic.fed.application.ambassador.simulation.communication.CamBuilder;`
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/simulation/TrafficManagementCenterUnit.java`
#### Snippet
```java
import org.eclipse.mosaic.fed.application.ambassador.ErrorRegister;
import org.eclipse.mosaic.fed.application.ambassador.simulation.communication.AdHocModule;
import org.eclipse.mosaic.fed.application.ambassador.simulation.communication.CamBuilder;
import org.eclipse.mosaic.fed.application.ambassador.simulation.tmc.InductionLoop;
import org.eclipse.mosaic.fed.application.ambassador.simulation.tmc.LaneAreaDetector;
```

### UNUSED_IMPORT
Unused import `import org.eclipse.mosaic.lib.geo.GeoPoint;`
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/simulation/TrafficManagementCenterUnit.java`
#### Snippet
```java
import org.eclipse.mosaic.interactions.traffic.TrafficDetectorUpdates;
import org.eclipse.mosaic.lib.enums.VehicleClass;
import org.eclipse.mosaic.lib.geo.GeoPoint;
import org.eclipse.mosaic.lib.objects.mapping.TmcMapping;
import org.eclipse.mosaic.lib.objects.traffic.InductionLoopInfo;
```

### UNUSED_IMPORT
Unused import `import org.eclipse.mosaic.lib.objects.electricity.ChargingStationData;`
in `lib/mosaic-interactions/src/main/java/org/eclipse/mosaic/interactions/electricity/BatteryChargingStop.java`
#### Snippet
```java
import static org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;

import org.eclipse.mosaic.lib.objects.electricity.ChargingStationData;
import org.eclipse.mosaic.rti.api.Interaction;

```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `lib/mosaic-network/src/main/java/org/eclipse/mosaic/lib/coupling/AbstractNetworkAmbassador.java`
#### Snippet
```java
            String matchedError = null;

            while ((matchedOutPort = outputScanner.findInLine(outPortPattern)) == null
                    && (matchedError = outputScanner.findInLine(errorPattern)) == null) {
                this.log.trace(outputScanner.nextLine());
```

### NestedAssignment
Result of assignment expression used
in `lib/mosaic-network/src/main/java/org/eclipse/mosaic/lib/coupling/AbstractNetworkAmbassador.java`
#### Snippet
```java

            while ((matchedOutPort = outputScanner.findInLine(outPortPattern)) == null
                    && (matchedError = outputScanner.findInLine(errorPattern)) == null) {
                this.log.trace(outputScanner.nextLine());
            }
```

### NestedAssignment
Result of assignment expression used
in `lib/mosaic-utils/src/main/java/org/eclipse/mosaic/lib/util/ProcessLoggingThread.java`
#### Snippet
```java
            String line;
            while (running) {
                if ((line = reader.readLine()) != null) {
                    lineConsumer.accept("Process " + processName + ": " + line);
                }
```

### NestedAssignment
Result of assignment expression used
in `lib/mosaic-utils/src/main/java/org/eclipse/mosaic/lib/util/objects/ObjectInstantiation.java`
#### Snippet
```java
        byte[] buffer = new byte[1024];
        int c;
        while ((c = in.read(buffer)) != -1) {
            out.write(buffer, 0, c);
        }
```

### NestedAssignment
Result of assignment expression used
in `rti/mosaic-rti-api/src/main/java/org/eclipse/mosaic/rti/api/federatestarter/ExecutableFederateExecutor.java`
#### Snippet
```java
        String line;
        int pid = -1;
        while ((line = reader.readLine()) != null) {
            if (line.length() > 0) {
                log.debug(line);
```

### NestedAssignment
Result of assignment expression used
in `lib/mosaic-routing/src/main/java/org/eclipse/mosaic/lib/routing/graphhopper/algorithm/BellmanFordRouting.java`
#### Snippet
```java
        boolean weightsUpdated = false;
        for (int i = 0; i < graph.getNodes(); i++) {
            if (!(weightsUpdated = updateWeightsOfEdges())) {
                // if nothing has been updated in this iteration, we can skip all further iterations
                break;
```

### NestedAssignment
Result of assignment expression used
in `fed/mosaic-cell/src/main/java/org/eclipse/mosaic/fed/cell/config/util/ConfigurationReader.java`
#### Snippet
```java
                        + "Servers can't be addressed with multicasts. Your set values will be dismissed");
            }
            server.downlink.maxCapacity = server.downlink.capacity = Long.MAX_VALUE;
            server.uplink.maxCapacity = server.uplink.capacity = Long.MAX_VALUE;
            server.downlink.multicast = null;
```

### NestedAssignment
Result of assignment expression used
in `fed/mosaic-cell/src/main/java/org/eclipse/mosaic/fed/cell/config/util/ConfigurationReader.java`
#### Snippet
```java
            }
            server.downlink.maxCapacity = server.downlink.capacity = Long.MAX_VALUE;
            server.uplink.maxCapacity = server.uplink.capacity = Long.MAX_VALUE;
            server.downlink.multicast = null;
        });
```

### NestedAssignment
Result of assignment expression used
in `fed/mosaic-output/src/main/java/org/eclipse/mosaic/fed/output/generator/file/format/MethodManager.java`
#### Snippet
```java

        // initialize iteration methods
        for (int level = 1; (iterationMethodIndex = findIterationMethod(methods)) != -1; level++) {
            // what is the name of this iteration method, without "get"
            String methodName = getIterationMethodName(methods.get(iterationMethodIndex));
```

### NestedAssignment
Result of assignment expression used
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/spatial/QuickHull2d.java`
#### Snippet
```java
        // find the left and right extrema. These define the chord that separates the upper and
        // lower sets
        minX = maxX = points.get(0).x;
        iLeft = iRight = 0;
        for (i = 1; i < points.size(); i++) {
```

### NestedAssignment
Result of assignment expression used
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/spatial/QuickHull2d.java`
#### Snippet
```java
        // lower sets
        minX = maxX = points.get(0).x;
        iLeft = iRight = 0;
        for (i = 1; i < points.size(); i++) {
            q = points.get(i);
```

### NestedAssignment
Result of assignment expression used
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/ambassador/AbstractSumoAmbassador.java`
#### Snippet
```java
            // hold the thread for a second to allow sumo to print possible error message to the error stream
            Thread.sleep(1000);
            while (((line = sumoInputReader.readLine()) != null)) {
                if (line.length() > 0) {
                    if (log.isDebugEnabled()) {
```

### NestedAssignment
Result of assignment expression used
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/ambassador/AbstractSumoAmbassador.java`
#### Snippet
```java
                log.error(myError);
                BufferedReader sumoErrorReader = new BufferedReader(new InputStreamReader(err, StandardCharsets.UTF_8));
                while (((line = sumoErrorReader.readLine()) != null)) {
                    if (line.length() > 0) {
                        log.error(line);
```

## RuleId[id=ReplaceAssignmentWithOperatorAssignment]
### ReplaceAssignmentWithOperatorAssignment
`vehicleConfiguration.startingTime = vehicleConfiguration.startingTime - config.start` could be simplified to 'vehicleConfiguration.startingTime -= config.start'
in `fed/mosaic-mapping/src/main/java/org/eclipse/mosaic/fed/mapping/ambassador/SpawningFramework.java`
#### Snippet
```java

                if (config != null && config.adjustStartingTimes && config.start != null) {
                    vehicleConfiguration.startingTime = vehicleConfiguration.startingTime - config.start;
                    if (vehicleConfiguration.maxTime != null) {
                        vehicleConfiguration.maxTime = vehicleConfiguration.maxTime - config.start;
```

### ReplaceAssignmentWithOperatorAssignment
`vehicleConfiguration.maxTime = vehicleConfiguration.maxTime - config.start` could be simplified to 'vehicleConfiguration.maxTime -= config.start'
in `fed/mosaic-mapping/src/main/java/org/eclipse/mosaic/fed/mapping/ambassador/SpawningFramework.java`
#### Snippet
```java
                    vehicleConfiguration.startingTime = vehicleConfiguration.startingTime - config.start;
                    if (vehicleConfiguration.maxTime != null) {
                        vehicleConfiguration.maxTime = vehicleConfiguration.maxTime - config.start;
                    }
                }
```

### ReplaceAssignmentWithOperatorAssignment
`netPart = netPart & ip` could be simplified to 'netPart \&= ip'
in `lib/mosaic-objects/src/main/java/org/eclipse/mosaic/lib/objects/addressing/IpResolver.java`
#### Snippet
```java
        int netPart = addressArrayToFlat(netMask.getAddress());
        int client = ip & ~netPart;
        netPart = netPart & ip;

        for (Map.Entry<UnitType, Inet4Address> unitNetworkEntry : unitNetworks.entrySet()) {
```

### ReplaceAssignmentWithOperatorAssignment
`region.downlink.capacity = (region.downlink.capacity - bandwidthToConsumeInBps)` could be simplified to 'region.downlink.capacity -= bandwidthToConsumeInBps'
in `fed/mosaic-cell/src/main/java/org/eclipse/mosaic/fed/cell/utility/RegionCapacityUtility.java`
#### Snippet
```java
        }
        if (bandwidthToConsumeInBps > 0) {
            region.downlink.capacity = (region.downlink.capacity - bandwidthToConsumeInBps);
        } else {
            log.warn("Could not consume the capacity in the region {} in the DL because the consume value of {} is negative or zero.", region, bandwidthToConsumeInBps);
```

### ReplaceAssignmentWithOperatorAssignment
`region.uplink.capacity = region.uplink.capacity + bandwidthToFreeInBps` could be simplified to 'region.uplink.capacity += bandwidthToFreeInBps'
in `fed/mosaic-cell/src/main/java/org/eclipse/mosaic/fed/cell/utility/RegionCapacityUtility.java`
#### Snippet
```java
        }
        if (region.uplink.capacity + bandwidthToFreeInBps <= region.uplink.maxCapacity) {
            region.uplink.capacity = region.uplink.capacity + bandwidthToFreeInBps;
            log.trace("Freeing {} bit/s in the uplink direction in region {} (capacity now: {} bit/s)",
                    bandwidthToFreeInBps, region.id, region.uplink.capacity);
```

### ReplaceAssignmentWithOperatorAssignment
`region.uplink.capacity = (region.uplink.capacity - bandwidthToConsumeInBps)` could be simplified to 'region.uplink.capacity -= bandwidthToConsumeInBps'
in `fed/mosaic-cell/src/main/java/org/eclipse/mosaic/fed/cell/utility/RegionCapacityUtility.java`
#### Snippet
```java

        if (bandwidthToConsumeInBps > 0) {
            region.uplink.capacity = (region.uplink.capacity - bandwidthToConsumeInBps);
        } else {
            log.warn("Could not consume the capacity in the region {} in the UL because the consume value of {} is negative or zero.", region, bandwidthToConsumeInBps);
```

### ReplaceAssignmentWithOperatorAssignment
`region.downlink.capacity = region.downlink.capacity + bandwidthToFreeInBps` could be simplified to 'region.downlink.capacity += bandwidthToFreeInBps'
in `fed/mosaic-cell/src/main/java/org/eclipse/mosaic/fed/cell/utility/RegionCapacityUtility.java`
#### Snippet
```java
        }
        if (region.downlink.capacity + bandwidthToFreeInBps <= region.downlink.maxCapacity) {
            region.downlink.capacity = region.downlink.capacity + bandwidthToFreeInBps;
            log.trace("Freeing {} bit/s in the downlink direction in region {} (capacity now: {} bit/s)",
                    bandwidthToFreeInBps, region.id, region.downlink.capacity);
```

### ReplaceAssignmentWithOperatorAssignment
`quadKey = quadKey | ((y & (1 << i)) << (i + 1)) | ((x & (1 << i)) << i)` could be simplified to 'quadKey \|= ((y \& (1 \<\< i)) \<\< (i + 1)) \| ((x \& (1 \<\< i)) \<\< i)'
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/geo/GeoUtils.java`
#### Snippet
```java
        long quadKey = 0;
        for (int i = 0; i <= zoom; i++) {
            quadKey = quadKey | ((y & (1 << i)) << (i + 1)) | ((x & (1 << i)) << i);
        }
        return quadKey;
```

## RuleId[id=CodeBlock2Expr]
### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `lib/mosaic-objects/src/main/java/org/eclipse/mosaic/lib/objects/v2x/etsi/ivim/Segment.java`
#### Snippet
```java
        Segment copy = new Segment(this.name);
        copy.edges.addAll(edges);
        advices.forEach((k,v) -> {
            copy.advices.put(k, v.copy());
        });
```

## RuleId[id=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `ambassadorFederateChannel` is accessed in both synchronized and unsynchronized contexts
in `lib/mosaic-network/src/main/java/org/eclipse/mosaic/lib/coupling/AbstractNetworkAmbassador.java`
#### Snippet
```java
     * This channel is for communication from the ambassador to the federate
     */
    ClientServerChannel ambassadorFederateChannel;

    /**
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `federateAmbassadorChannel` is accessed in both synchronized and unsynchronized contexts
in `lib/mosaic-network/src/main/java/org/eclipse/mosaic/lib/coupling/AbstractNetworkAmbassador.java`
#### Snippet
```java
     * This channel is for communication from the federate to the ambassador
     */
    ClientServerChannel federateAmbassadorChannel;

    /**
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `interactionQueue` is accessed in both synchronized and unsynchronized contexts
in `rti/mosaic-rti-api/src/main/java/org/eclipse/mosaic/rti/api/AbstractFederateAmbassador.java`
#### Snippet
```java
     * A priority queue that holds unprocessed interactions.
     */
    protected InteractionQueue interactionQueue = new InteractionQueue();

    protected FederateDescriptor descriptor;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `rti` is accessed in both synchronized and unsynchronized contexts
in `rti/mosaic-rti-api/src/main/java/org/eclipse/mosaic/rti/api/AbstractFederateAmbassador.java`
#### Snippet
```java
     * The bridge for interacting with the RTI.
     */
    protected RtiAmbassador rti;

    /**
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `routingCostFunction` is accessed in both synchronized and unsynchronized contexts
in `lib/mosaic-routing/src/main/java/org/eclipse/mosaic/lib/routing/graphhopper/GraphHopperWeighting.java`
#### Snippet
```java
    private final double maxSpeed;

    private RoutingCostFunction routingCostFunction;

    public GraphHopperWeighting(FlagEncoder encoder, GraphhopperToDatabaseMapper graphMapper) {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `running` is accessed in both synchronized and unsynchronized contexts
in `rti/mosaic-rti-core/src/main/java/org/eclipse/mosaic/rti/time/ThreadPool.java`
#### Snippet
```java
    private final Worker[] workers;
    private final ComponentProvider federation;
    private boolean running = false;

    private ScheduledEvents queue = null;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `queue` is accessed in both synchronized and unsynchronized contexts
in `rti/mosaic-rti-core/src/main/java/org/eclipse/mosaic/rti/time/ThreadPool.java`
#### Snippet
```java
    private boolean running = false;

    private ScheduledEvents queue = null;
    private int activeCount = 0;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `cachedVehicleTypesInitialization` is accessed in both synchronized and unsynchronized contexts
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/ambassador/SumoAmbassador.java`
#### Snippet
```java
     * the {@link VehicleRoutesInitialization}-interaction.
     */
    private VehicleTypesInitialization cachedVehicleTypesInitialization;

    /**
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `nextTimeStep` is accessed in both synchronized and unsynchronized contexts
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/ambassador/AbstractSumoAmbassador.java`
#### Snippet
```java
     * Simulation time at which the positions are published next.
     */
    long nextTimeStep;

    /**
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `sumoConfig` is accessed in both synchronized and unsynchronized contexts
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/ambassador/AbstractSumoAmbassador.java`
#### Snippet
```java
     * Configuration object.
     */
    CSumo sumoConfig;

    /**
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `bridge` is accessed in both synchronized and unsynchronized contexts
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/ambassador/AbstractSumoAmbassador.java`
#### Snippet
```java
     * Connection to SUMO.
     */
    Bridge bridge;

    /**
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `socket` is accessed in both synchronized and unsynchronized contexts
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/ambassador/AbstractSumoAmbassador.java`
#### Snippet
```java
     * Socket with which data is exchanged with SUMO.
     */
    Socket socket;

    /**
```

## RuleId[id=EmptyMethod]
### EmptyMethod
Method only calls its super
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/simulation/perception/CentralPerceptionComponent.java`
#### Snippet
```java

        @Override
        public int getNumberOfVehicles() {
            return super.getNumberOfVehicles();
        }
```

### EmptyMethod
Method only calls its super
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/simulation/perception/CentralPerceptionComponent.java`
#### Snippet
```java

        @Override
        public int getNumberOfTrafficLights() {
            return super.getNumberOfTrafficLights();
        }
```

### EmptyMethod
All implementations of this method are empty
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/simulation/perception/index/providers/TrafficLightIndex.java`
#### Snippet
```java
     * Method called to initialize index after configuration has been read.
     */
    public abstract void initialize();

    /**
```

### EmptyMethod
The method is empty
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/AbstractTraciCommand.java`
#### Snippet
```java
         * Skip all remaining bytes of this command.
         */
        public void skipRemaining() {
            // nop, just for providing a fluent API
        }
```

### EmptyMethod
Method only calls its super
in `lib/mosaic-database/src/main/java/org/eclipse/mosaic/lib/database/road/TrafficLightNode.java`
#### Snippet
```java

    @Override
    public int hashCode() {
        return super.hashCode();
    }
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `false` is redundant
in `lib/mosaic-network/src/main/java/org/eclipse/mosaic/lib/coupling/CAbstractNetworkAmbassador.java`
#### Snippet
```java
        private boolean ipv4UnicastAddress = false;
        private boolean ipv4BroadcastAddress = true;
        private boolean ipv4AnycastAddress = false;
    }
}
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `lib/mosaic-network/src/main/java/org/eclipse/mosaic/lib/coupling/CAbstractNetworkAmbassador.java`
#### Snippet
```java
    @SuppressWarnings("FieldCanBeLocal")
    static class CDestinationAdress {
        private boolean ipv4UnicastAddress = false;
        private boolean ipv4BroadcastAddress = true;
        private boolean ipv4AnycastAddress = false;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `lib/mosaic-network/src/main/java/org/eclipse/mosaic/lib/coupling/AbstractNetworkAmbassador.java`
#### Snippet
```java
     * Docker-Executor for running the actual simulator (OMNeT++ or ns-3) in a Container.
     */
    protected DockerFederateExecutor dockerFederateExecutor = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `lib/mosaic-network/src/main/java/org/eclipse/mosaic/lib/coupling/AbstractNetworkAmbassador.java`
#### Snippet
```java
     * is processed.
     */
    private VehicleUpdates latestVehicleUpdates = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `lib/mosaic-database/src/main/java/org/eclipse/mosaic/lib/database/road/Way.java`
#### Snippet
```java
    private double maxSpeedInMs = 0;
    private int lanesForward = 0;
    private int lanesBackward = 0;

    private final List<Node> nodes = new ArrayList<>();
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `lib/mosaic-database/src/main/java/org/eclipse/mosaic/lib/database/road/Way.java`
#### Snippet
```java
    private final String type;

    private double maxSpeedInMs = 0;
    private int lanesForward = 0;
    private int lanesBackward = 0;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `lib/mosaic-database/src/main/java/org/eclipse/mosaic/lib/database/road/Way.java`
#### Snippet
```java

    private double maxSpeedInMs = 0;
    private int lanesForward = 0;
    private int lanesBackward = 0;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `lib/mosaic-database/src/main/java/org/eclipse/mosaic/lib/database/road/Way.java`
#### Snippet
```java
     * Tells whether the way is a oneway.
     */
    private boolean isOneway = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `lib/mosaic-database/src/main/java/org/eclipse/mosaic/lib/database/building/Wall.java`
#### Snippet
```java
     * Length of this wall, determined by the distance between its two corners im meters.
     */
    public transient Double length = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `lib/mosaic-database/src/main/java/org/eclipse/mosaic/lib/database/road/Node.java`
#### Snippet
```java
     * Flag indicating if this node has been generated from an edge's shape.
     */
    private boolean generated = false;
    
    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `lib/mosaic-database/src/main/java/org/eclipse/mosaic/lib/database/road/Node.java`
#### Snippet
```java
     * Flag indicating if this node is an intersection.
     */
    private boolean intersection = false;

    private final List<Way> ways = new ArrayList<>();
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `lib/mosaic-utils/src/main/java/org/eclipse/mosaic/lib/util/RingBuffer.java`
#### Snippet
```java
    private final T[] elements;

    private int head = 0;
    private boolean ringMode = false;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `lib/mosaic-utils/src/main/java/org/eclipse/mosaic/lib/util/RingBuffer.java`
#### Snippet
```java

    private int head = 0;
    private boolean ringMode = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `lib/mosaic-utils/src/main/java/org/eclipse/mosaic/lib/util/RingBuffer.java`
#### Snippet
```java
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int index = 0;

            public boolean hasNext() {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `lib/mosaic-utils/src/main/java/org/eclipse/mosaic/lib/util/PerformanceMonitor.java`
#### Snippet
```java
        private long total = 0;
        private long min = Long.MAX_VALUE;
        private long max = 0;


```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `lib/mosaic-utils/src/main/java/org/eclipse/mosaic/lib/util/PerformanceMonitor.java`
#### Snippet
```java
    private static class MeasurementAggregation {
        private long calls = 0;
        private long total = 0;
        private long min = Long.MAX_VALUE;
        private long max = 0;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `lib/mosaic-utils/src/main/java/org/eclipse/mosaic/lib/util/PerformanceMonitor.java`
#### Snippet
```java

    private static class MeasurementAggregation {
        private long calls = 0;
        private long total = 0;
        private long min = Long.MAX_VALUE;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `lib/mosaic-database/src/main/java/org/eclipse/mosaic/lib/database/Database.java`
#### Snippet
```java
    private final MutableGeoPoint maxBounds = new MutableGeoPoint(-90, -180);

    private transient List<String> borderNodes = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `lib/mosaic-utils/src/main/java/org/eclipse/mosaic/lib/util/scheduling/Event.java`
#### Snippet
```java
            justification = "It's ok for now, until one finds a better way to set a sequence number once the event has been scheduled."
    )
    long seqNr = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `rti/mosaic-starter/src/main/java/org/eclipse/mosaic/starter/cli/MosaicParameters.java`
#### Snippet
```java

    @CommandLineOption(shortOption = "e", longOption = "external-watchdog", argName = "PORTNUMBER", description = "Specific external watchdog port number")
    public String externalWatchDog = null;

}
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `rti/mosaic-starter/src/main/java/org/eclipse/mosaic/starter/cli/MosaicParameters.java`
#### Snippet
```java

    @CommandLineOption(shortOption = "v", longOption = "start-visualizer", description = "Starts the web socket visualizer.")
    public boolean startVisualizer = false;

    @CommandLineOption(shortOption = "b", longOption = "realtime-brake", argName = "REALTIMEFACTOR", description = "Set value for real time brake.")
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `rti/mosaic-starter/src/main/java/org/eclipse/mosaic/starter/cli/MosaicParameters.java`
#### Snippet
```java

    @CommandLineOption(shortOption = "w", longOption = "watchdog-interval", argName = "SECONDS", description = "Kill MOSAIC process after n seconds if a federate is not responding. 0 disables the watchdog. (default: 30)")
    public String watchdogInterval = null;

    @CommandLineOption(shortOption = "r", longOption = "random-seed", argName = "SEED", description = "Overrides the random seed which is given in the scenario configuration file")
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `rti/mosaic-starter/src/main/java/org/eclipse/mosaic/starter/cli/MosaicParameters.java`
#### Snippet
```java

    @CommandLineOption(shortOption = "s", longOption = "scenario", argName = "NAME", description = "The name of the MOSAIC scenario. Can be used instead of \"-c\" parameter. (mandatory)", group = "config")
    public String scenarioName = null;

    @CommandLineOption(shortOption = "w", longOption = "watchdog-interval", argName = "SECONDS", description = "Kill MOSAIC process after n seconds if a federate is not responding. 0 disables the watchdog. (default: 30)")
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `rti/mosaic-starter/src/main/java/org/eclipse/mosaic/starter/cli/MosaicParameters.java`
#### Snippet
```java

    @CommandLineOption(longOption = "hosts", argName = "PATH", description = "Path to host configuration file (default: etc/hosts.json)")
    public String hostsConfiguration = null;

    @CommandLineOption(shortOption = "l", longOption = "logger", argName = "PATH", description = "Path to logback configuration file (default: etc/logback.xml)")
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `rti/mosaic-starter/src/main/java/org/eclipse/mosaic/starter/cli/MosaicParameters.java`
#### Snippet
```java

    @CommandLineOption(shortOption = "b", longOption = "realtime-brake", argName = "REALTIMEFACTOR", description = "Set value for real time brake.")
    public String realtimeBrake = null;

    @CommandLineOption(shortOption = "o", longOption = "log-level", argName = "LOGLEVEL", description = "Overrides the log level to new value (e.g. DEBUG)")
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `rti/mosaic-starter/src/main/java/org/eclipse/mosaic/starter/cli/MosaicParameters.java`
#### Snippet
```java

    @CommandLineOption(shortOption = "o", longOption = "log-level", argName = "LOGLEVEL", description = "Overrides the log level to new value (e.g. DEBUG)")
    public String logLevel = null;

    @CommandLineOption(longOption = "runtime", argName = "PATH", description = "Path to MOSAIC RTI configuration file (default: etc/runtime.json)")
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `rti/mosaic-starter/src/main/java/org/eclipse/mosaic/starter/cli/MosaicParameters.java`
#### Snippet
```java

    @CommandLineOption(shortOption = "c", longOption = "config", argName = "PATH", description = "Path to MOSAIC scenario configuration file (scenario_config.json). Can be used instead of \"-s\" parameter. (mandatory).", group = "config")
    public String configurationPath = null;

    @CommandLineOption(shortOption = "s", longOption = "scenario", argName = "NAME", description = "The name of the MOSAIC scenario. Can be used instead of \"-c\" parameter. (mandatory)", group = "config")
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `rti/mosaic-starter/src/main/java/org/eclipse/mosaic/starter/cli/MosaicParameters.java`
#### Snippet
```java

    @CommandLineOption(longOption = "runtime", argName = "PATH", description = "Path to MOSAIC RTI configuration file (default: etc/runtime.json)")
    public String runtimeConfiguration = null;

    @CommandLineOption(longOption = "hosts", argName = "PATH", description = "Path to host configuration file (default: etc/hosts.json)")
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `rti/mosaic-starter/src/main/java/org/eclipse/mosaic/starter/cli/MosaicParameters.java`
#### Snippet
```java

    @CommandLineOption(shortOption = "l", longOption = "logger", argName = "PATH", description = "Path to logback configuration file (default: etc/logback.xml)")
    public String loggerConfiguration = null;

    @CommandLineOption(shortOption = "e", longOption = "external-watchdog", argName = "PORTNUMBER", description = "Specific external watchdog port number")
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `rti/mosaic-starter/src/main/java/org/eclipse/mosaic/starter/config/CRuntime.java`
#### Snippet
```java

        public int port = 0;
        public boolean deploy = false;
        public boolean start = false;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `rti/mosaic-starter/src/main/java/org/eclipse/mosaic/starter/config/CRuntime.java`
#### Snippet
```java
        public int port = 0;
        public boolean deploy = false;
        public boolean start = false;

        @JacksonXmlElementWrapper(localName = "subscriptions")
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `rti/mosaic-starter/src/main/java/org/eclipse/mosaic/starter/config/CRuntime.java`
#### Snippet
```java
        public String host = "local";

        public int port = 0;
        public boolean deploy = false;
        public boolean start = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `fed/mosaic-mapping/src/main/java/org/eclipse/mosaic/fed/mapping/config/CMappingConfiguration.java`
#### Snippet
```java
     * All spawners before {@code start} will be completely ignored then.
     */
    public boolean adjustStartingTimes = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `fed/mosaic-mapping/src/main/java/org/eclipse/mosaic/fed/mapping/config/CMappingConfiguration.java`
#### Snippet
```java
     * If set to {@code true}, the starting times of all vehicle spawner definitions are randomized by {@code +-60} seconds.
     */
    public boolean randomizeStartingTimes = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `fed/mosaic-mapping/src/main/java/org/eclipse/mosaic/fed/mapping/config/CMappingConfiguration.java`
#### Snippet
```java
     * result in slightly randomized departure times. The specified `targetFlow` of the vehicle spawner is kept.
     */
    public boolean randomizeFlows = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `fed/mosaic-mapping/src/main/java/org/eclipse/mosaic/fed/mapping/config/CMappingConfiguration.java`
#### Snippet
```java
     * If set to {@code true}, the configured weights of all types are slightly randomized by {@code +-1%} of the sum of all weights.
     */
    public boolean randomizeWeights = false;
}

```

### RedundantFieldInitialization
Field initialization to `0.0` is redundant
in `fed/mosaic-mapping/src/main/java/org/eclipse/mosaic/fed/mapping/config/CParameterDeviations.java`
#### Snippet
```java
    public double accel = 0.0;
    public double decel = 0.0;
    public double tau = 0.0;

    public CParameterDeviations copy() {
```

### RedundantFieldInitialization
Field initialization to `0.0` is redundant
in `fed/mosaic-mapping/src/main/java/org/eclipse/mosaic/fed/mapping/config/CParameterDeviations.java`
#### Snippet
```java
    public double length = 0.0;
    public double width = 0.0;
    public double height = 0.0;
    public double minGap = 0.0;
    public double maxSpeed = 0.0;
```

### RedundantFieldInitialization
Field initialization to `0.0` is redundant
in `fed/mosaic-mapping/src/main/java/org/eclipse/mosaic/fed/mapping/config/CParameterDeviations.java`
#### Snippet
```java
public class CParameterDeviations {

    public double length = 0.0;
    public double width = 0.0;
    public double height = 0.0;
```

### RedundantFieldInitialization
Field initialization to `0.0` is redundant
in `fed/mosaic-mapping/src/main/java/org/eclipse/mosaic/fed/mapping/config/CParameterDeviations.java`
#### Snippet
```java
    public double width = 0.0;
    public double height = 0.0;
    public double minGap = 0.0;
    public double maxSpeed = 0.0;
    public double speedFactor = 0.0;
```

### RedundantFieldInitialization
Field initialization to `0.0` is redundant
in `fed/mosaic-mapping/src/main/java/org/eclipse/mosaic/fed/mapping/config/CParameterDeviations.java`
#### Snippet
```java
    public double minGap = 0.0;
    public double maxSpeed = 0.0;
    public double speedFactor = 0.0;
    public double accel = 0.0;
    public double decel = 0.0;
```

### RedundantFieldInitialization
Field initialization to `0.0` is redundant
in `fed/mosaic-mapping/src/main/java/org/eclipse/mosaic/fed/mapping/config/CParameterDeviations.java`
#### Snippet
```java
    public double maxSpeed = 0.0;
    public double speedFactor = 0.0;
    public double accel = 0.0;
    public double decel = 0.0;
    public double tau = 0.0;
```

### RedundantFieldInitialization
Field initialization to `0.0` is redundant
in `fed/mosaic-mapping/src/main/java/org/eclipse/mosaic/fed/mapping/config/CParameterDeviations.java`
#### Snippet
```java
    public double height = 0.0;
    public double minGap = 0.0;
    public double maxSpeed = 0.0;
    public double speedFactor = 0.0;
    public double accel = 0.0;
```

### RedundantFieldInitialization
Field initialization to `0.0` is redundant
in `fed/mosaic-mapping/src/main/java/org/eclipse/mosaic/fed/mapping/config/CParameterDeviations.java`
#### Snippet
```java
    public double speedFactor = 0.0;
    public double accel = 0.0;
    public double decel = 0.0;
    public double tau = 0.0;

```

### RedundantFieldInitialization
Field initialization to `0.0` is redundant
in `fed/mosaic-mapping/src/main/java/org/eclipse/mosaic/fed/mapping/config/CParameterDeviations.java`
#### Snippet
```java

    public double length = 0.0;
    public double width = 0.0;
    public double height = 0.0;
    public double minGap = 0.0;
```

### RedundantFieldInitialization
Field initialization to `0.0` is redundant
in `fed/mosaic-mapping/src/main/java/org/eclipse/mosaic/fed/mapping/config/units/COriginDestinationMatrixMapper.java`
#### Snippet
```java
     */
    @JsonAdapter(TimeFieldAdapter.DoubleSeconds.class)
    public double startingTime = 0.0;

    /**
```

### RedundantFieldInitialization
Field initialization to `0.0` is redundant
in `fed/mosaic-mapping/src/main/java/org/eclipse/mosaic/fed/mapping/config/units/CVehicle.java`
#### Snippet
```java
     */
    @JsonAdapter(TimeFieldAdapter.DoubleSeconds.class)
    public double startingTime = 0.0;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `fed/mosaic-mapping/src/main/java/org/eclipse/mosaic/fed/mapping/config/units/CVehicle.java`
#### Snippet
```java
     * The index of the connection of the route where the vehicle will start on.
     */
    public int departConnectionIndex = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `fed/mosaic-mapping/src/main/java/org/eclipse/mosaic/fed/mapping/config/units/CVehicle.java`
#### Snippet
```java
     * Position within the connection of the route where the vehicle(-s) should be spawned.
     */
    public int pos = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `rti/mosaic-starter/src/main/java/org/eclipse/mosaic/starter/MosaicSimulation.java`
#### Snippet
```java
    private int realtimeBrake = 0;
    private int watchdogInterval = DEFAULT_WATCHDOG_INTERVAL;
    private int externalWatchdogPort = 0;

    private Logger log = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `rti/mosaic-starter/src/main/java/org/eclipse/mosaic/starter/MosaicSimulation.java`
#### Snippet
```java
    private int externalWatchdogPort = 0;

    private Logger log = null;
    private ClassLoader classLoader = ClassLoader.getSystemClassLoader();

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `rti/mosaic-starter/src/main/java/org/eclipse/mosaic/starter/MosaicSimulation.java`
#### Snippet
```java
    private String logLevelOverride;

    private int realtimeBrake = 0;
    private int watchdogInterval = DEFAULT_WATCHDOG_INTERVAL;
    private int externalWatchdogPort = 0;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `fed/mosaic-mapping/src/main/java/org/eclipse/mosaic/fed/mapping/ambassador/spawning/lane/RoundRobinLaneIndexSelector.java`
#### Snippet
```java
    private final List<Integer> lanes;

    private int selections = 0;

    public RoundRobinLaneIndexSelector(List<Integer> lanes) {
```

### RedundantFieldInitialization
Field initialization to `0.0d` is redundant
in `lib/mosaic-communication/src/main/java/org/eclipse/mosaic/lib/model/transmission/CTransmission.java`
#### Snippet
```java
     * means that lossProbability=0 (lossfree), lossProbability=1 (100% lossy).
     */
    public double lossProbability = 0.0d;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `fed/mosaic-mapping/src/main/java/org/eclipse/mosaic/fed/mapping/ambassador/VehicleFlowGenerator.java`
#### Snippet
```java
    private VehicleDeparture.DepartureSpeedMode departureSpeedMode;
    private VehicleDeparture.LaneSelectionMode laneSelectionMode;
    private long start = 0;
    private long end = Long.MAX_VALUE;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `fed/mosaic-mapping/src/main/java/org/eclipse/mosaic/fed/mapping/ambassador/weighting/DeterministicSelector.java`
#### Snippet
```java
     * Number of objects already generated.
     */
    private int totalSelections = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `lib/mosaic-objects/src/main/java/org/eclipse/mosaic/lib/objects/v2x/etsi/EtsiPayloadConfiguration.java`
#### Snippet
```java
    }

    private static EtsiPayloadConfiguration globalConfiguration = null;

    public static EtsiPayloadConfiguration getPayloadConfiguration() {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `lib/mosaic-objects/src/main/java/org/eclipse/mosaic/lib/objects/v2x/etsi/Spatm.java`
#### Snippet
```java
     * The encoded message.
     */
    private EncodedPayload payload = null;

    @Override
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `lib/mosaic-objects/src/main/java/org/eclipse/mosaic/lib/objects/v2x/etsi/cam/TrafficLightAwarenessData.java`
#### Snippet
```java
     * therefore it will not be available after a encoded DENM message has been decoded.
     */
    private transient TrafficLightGroup trafficLightGroup = null;
    
    public TrafficLightAwarenessData(DataInput dataInput) throws IOException {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `lib/mosaic-objects/src/main/java/org/eclipse/mosaic/lib/objects/v2x/etsi/cam/VehicleAwarenessData.java`
#### Snippet
```java
     */
    @SuppressWarnings(value = "JCIP_FIELD_ISNT_FINAL_IN_IMMUTABLE_CLASS", justification = "is only used for caching purposes")
    private transient String cachedString = null;

    @Override
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `fed/mosaic-mapping/src/main/java/org/eclipse/mosaic/fed/mapping/ambassador/SpawningFramework.java`
#### Snippet
```java
     * for initializing static objects such as RSUs, TMCs and charging stations.
     */
    private boolean immobileUnitsInitialized = false;
    /**
     * Flag used to indicate if traffic lights have been initialized
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `fed/mosaic-mapping/src/main/java/org/eclipse/mosaic/fed/mapping/ambassador/SpawningFramework.java`
#### Snippet
```java
     * (relevant for external scenarios).
     */
    private boolean trafficLightsInitialized = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `fed/mosaic-mapping/src/main/java/org/eclipse/mosaic/fed/mapping/ambassador/SpawningFramework.java`
#### Snippet
```java
     * The simulation time. Unit: [ns].
     */
    private long time = 0;
    /**
     * The ambassador of the runtime infrastructure.
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `lib/mosaic-objects/src/main/java/org/eclipse/mosaic/lib/objects/v2x/etsi/ivim/Advice.java`
#### Snippet
```java
     * Tells whether the lane is dedicated for AVs only.
     */
    private boolean dedicatedForAvsOnly = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `lib/mosaic-objects/src/main/java/org/eclipse/mosaic/lib/objects/trafficsign/SpeedLimit.java`
#### Snippet
```java
    private double speedLimit;

    private Double initialSpeedLimit = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `0.0` is redundant
in `lib/mosaic-objects/src/main/java/org/eclipse/mosaic/lib/objects/trafficsign/TrafficSign.java`
#### Snippet
```java
     * 0.0 is north, 90.0 is east
     */
    private double angle = 0.0;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `lib/mosaic-objects/src/main/java/org/eclipse/mosaic/lib/objects/trafficsign/TrafficSign.java`
#### Snippet
```java
     * Tells if the traffic sign is variable.
     */
    private boolean isVariable = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `rti/mosaic-rti-api/src/main/java/org/eclipse/mosaic/rti/api/AbstractFederateAmbassador.java`
#### Snippet
```java
     * The current lookahead for time advance requests.
     */
    protected long lookahead = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `rti/mosaic-rti-api/src/main/java/org/eclipse/mosaic/rti/api/parameters/FederateDescriptor.java`
#### Snippet
```java
     * can be found.
     */
    private File binariesDir = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `rti/mosaic-rti-api/src/main/java/org/eclipse/mosaic/rti/api/parameters/FederateDescriptor.java`
#### Snippet
```java
     * Flag signalizing whether to start/stop the federate external component (e.g. an external executable).
     */
    private boolean startAndStop = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `rti/mosaic-rti-api/src/main/java/org/eclipse/mosaic/rti/api/parameters/FederateDescriptor.java`
#### Snippet
```java
     * The configuration directory for the federate.
     */
    private File configDir = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `rti/mosaic-rti-api/src/main/java/org/eclipse/mosaic/rti/api/parameters/FederateDescriptor.java`
#### Snippet
```java
     * be deployed and started.
     */
    private CLocalHost host = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `rti/mosaic-rti-api/src/main/java/org/eclipse/mosaic/rti/api/parameters/FederateDescriptor.java`
#### Snippet
```java
     * working directory before starting it.
     */
    private boolean deployAndUndeploy = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `rti/mosaic-rti-api/src/main/java/org/eclipse/mosaic/rti/api/federatestarter/JavaFederateExecutor.java`
#### Snippet
```java
    private final FederateDescriptor handle;

    private ExecutableFederateExecutor delegateExecFederateStarter = null;

    public JavaFederateExecutor(FederateDescriptor handle, String mainClass, String programArguments) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `lib/mosaic-docker/src/main/java/org/eclipse/mosaic/lib/docker/DockerContainer.java`
#### Snippet
```java
     * The process which corresponds with the running container.
     */
    private Process process = null;

    DockerContainer(String image, String name, List<Pair<Integer, Integer>> portBindings) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `lib/mosaic-docker/src/main/java/org/eclipse/mosaic/lib/docker/DockerRun.java`
#### Snippet
```java
    private String user;
    private List<Pair<File, String>> volumeBindings = new Vector<>();
    private boolean removeAfterRun = false;
    private boolean removeBeforeRun;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `lib/mosaic-routing/src/main/java/org/eclipse/mosaic/lib/routing/RoutingParameters.java`
#### Snippet
```java
    private RoutingCostFunction routingCostFunction = RoutingCostFunction.Fastest;

    private boolean considerTurnCosts = false;

    private double restrictionCosts = Double.POSITIVE_INFINITY;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `lib/mosaic-routing/src/main/java/org/eclipse/mosaic/lib/routing/RoutingParameters.java`
#### Snippet
```java
public class RoutingParameters {

    private int numAlternativeRoutes = 0;

    private RoutingCostFunction routingCostFunction = RoutingCostFunction.Fastest;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `lib/mosaic-routing/src/main/java/org/eclipse/mosaic/lib/routing/config/CRouting.java`
#### Snippet
```java
     * The source for the route calculation, e.g. the path to the database containing the road network.
     */
    public String source = null;

}
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `rti/mosaic-rti-api/src/main/java/org/eclipse/mosaic/rti/api/federatestarter/ExecutableFederateExecutor.java`
#### Snippet
```java
    private final List<String> args;

    protected Process currentLocalProcess = null;
    protected int currentRemoteProcessId = -1;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `lib/mosaic-routing/src/main/java/org/eclipse/mosaic/lib/routing/graphhopper/algorithm/BellmanFordRouting.java`
#### Snippet
```java

    private SPTEntry toNode = null;
    private boolean finished = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `lib/mosaic-routing/src/main/java/org/eclipse/mosaic/lib/routing/graphhopper/algorithm/BellmanFordRouting.java`
#### Snippet
```java
    private final IntObjectMap<SPTEntry> nodeEntries = new IntObjectHashMap<>();

    private SPTEntry toNode = null;
    private boolean finished = false;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `rti/mosaic-rti-core/src/main/java/org/eclipse/mosaic/rti/MosaicComponentParameters.java`
#### Snippet
```java
     * The realtime break to slow down simulation for debugging/visualization purposes.
     */
    private int realTimeBreak = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `rti/mosaic-rti-core/src/main/java/org/eclipse/mosaic/rti/WatchDogThread.java`
#### Snippet
```java
     * Current time in milliseconds, used to check if program is still alive.
     */
    private volatile long timeOfLastUpdate = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `rti/mosaic-rti-core/src/main/java/org/eclipse/mosaic/rti/time/ThreadPool.java`
#### Snippet
```java
    private int activeCount = 0;

    private InternalFederateException exceptionInThread = null;

    ThreadPool(ComponentProvider federation, int numberOfThreads) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `rti/mosaic-rti-core/src/main/java/org/eclipse/mosaic/rti/time/ThreadPool.java`
#### Snippet
```java

    private ScheduledEvents queue = null;
    private int activeCount = 0;

    private InternalFederateException exceptionInThread = null;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `rti/mosaic-rti-core/src/main/java/org/eclipse/mosaic/rti/time/ThreadPool.java`
#### Snippet
```java
    private final Worker[] workers;
    private final ComponentProvider federation;
    private boolean running = false;

    private ScheduledEvents queue = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `rti/mosaic-rti-core/src/main/java/org/eclipse/mosaic/rti/time/ThreadPool.java`
#### Snippet
```java
    private boolean running = false;

    private ScheduledEvents queue = null;
    private int activeCount = 0;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `lib/mosaic-routing/src/main/java/org/eclipse/mosaic/lib/routing/graphhopper/algorithm/AbstractCamvitChoiceRouting.java`
#### Snippet
```java
    private HashSet<Integer> relevantEdgesIDs;

    private int requestAlternatives = 0;

    private List<Path> alternativePaths;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `rti/mosaic-rti-core/src/main/java/org/eclipse/mosaic/rti/time/AbstractTimeManagement.java`
#### Snippet
```java

        private double passedSimulationTimeSinceLogNs = 0;
        private long passedRealtimeSinceLogNs = 0;
        private long lastSimTime = 0;
        private long lastRealTimeNs = 0;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `rti/mosaic-rti-core/src/main/java/org/eclipse/mosaic/rti/time/AbstractTimeManagement.java`
#### Snippet
```java
        private long passedRealtimeSinceLogNs = 0;
        private long lastSimTime = 0;
        private long lastRealTimeNs = 0;

        private PerformanceInformation performance = new PerformanceInformation();
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `rti/mosaic-rti-core/src/main/java/org/eclipse/mosaic/rti/time/AbstractTimeManagement.java`
#### Snippet
```java
    private final Logger progressLogger;

    private long lastLogTime = 0;

    private long simStartRealtimeNs;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `rti/mosaic-rti-core/src/main/java/org/eclipse/mosaic/rti/time/AbstractTimeManagement.java`
#### Snippet
```java
    protected static class PerformanceCalculator {

        private double passedSimulationTimeSinceLogNs = 0;
        private long passedRealtimeSinceLogNs = 0;
        private long lastSimTime = 0;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `rti/mosaic-rti-core/src/main/java/org/eclipse/mosaic/rti/time/AbstractTimeManagement.java`
#### Snippet
```java
        private double passedSimulationTimeSinceLogNs = 0;
        private long passedRealtimeSinceLogNs = 0;
        private long lastSimTime = 0;
        private long lastRealTimeNs = 0;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `fed/mosaic-cell/src/main/java/org/eclipse/mosaic/fed/cell/config/CCell.java`
#### Snippet
```java
     * @see #bandwidthMeasurements
     */
    public boolean bandwidthMeasurementCompression = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `fed/mosaic-cell/src/main/java/org/eclipse/mosaic/fed/cell/viz/PerRegionBandwidthMeasurement.java`
#### Snippet
```java
    static class Row {

        private Long[] content = null;
        private final int size;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `fed/mosaic-cell/src/main/java/org/eclipse/mosaic/fed/cell/module/GeocasterModule.java`
#### Snippet
```java

    private final RandomNumberGenerator rng;
    private long processedMessages = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `fed/mosaic-cell/src/main/java/org/eclipse/mosaic/fed/cell/chain/ChainManager.java`
#### Snippet
```java

    private static final Logger log = LoggerFactory.getLogger(ChainManager.class);
    private long lastAdvanceTime = 0;

    public RtiAmbassador getRti() {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `fed/mosaic-cell/src/main/java/org/eclipse/mosaic/fed/cell/message/CellModuleMessage.java`
#### Snippet
```java
        private long startTime;
        private long endTime;
        private Object resource = null;

        public Builder(String emittingModule, String nextModule) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `fed/mosaic-output/src/main/java/org/eclipse/mosaic/fed/output/generator/file/write/WriteByLog.java`
#### Snippet
```java

    private final int appenderIdx;
    private static int cnt = 0;

    public WriteByLog(File outputFile, boolean append) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/app/AbstractApplication.java`
#### Snippet
```java

    private OS operatingSystem = null;
    private UnitLogger log = null;

    private boolean isSetUp;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/app/AbstractApplication.java`
#### Snippet
```java
public abstract class AbstractApplication<OS extends OperatingSystem> implements EventProcessor, Application, OperatingSystemAccess<OS> {

    private OS operatingSystem = null;
    private UnitLogger log = null;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/config/CApplicationAmbassador.java`
#### Snippet
```java
     * Routing/Navigation (CentralNavigationComponent).
     */
    public CRoutingByType navigationConfiguration = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/config/CApplicationAmbassador.java`
#### Snippet
```java
         * or any full-qualified java class name.
         */
        public String type = null;
    }

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/config/CApplicationAmbassador.java`
#### Snippet
```java
         * of the perception backend.
         */
        public boolean measurePerformance = false;
    }
}
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/app/etsi/AbstractCamSendingApp.java`
#### Snippet
```java
         * Time of the data in ns.
         */
        public long time = 0;
    }

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/simulation/VehicleParameters.java`
#### Snippet
```java
        private final VehicleParameters newParameters;
        private final VehicleOperatingSystem vehicleOperatingSystem;
        private boolean invalidated = false;

        VehicleParametersChangeRequest(VehicleOperatingSystem vehicleOperatingSystem, VehicleParameters before) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/simulation/perception/AbstractPerceptionModule.java`
#### Snippet
```java
    protected SimplePerceptionConfiguration configuration;

    private WallFinder wallIndex = null;

    AbstractPerceptionModule(PerceptionModuleOwner owner, Database database, Logger log) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/simulation/perception/CentralPerceptionComponent.java`
#### Snippet
```java
     * If set to true, the traffic light index will be updated when {@code updateSpatialIndices} is called.
     */
    private boolean updateTrafficLightIndex = false;

    public CentralPerceptionComponent(CApplicationAmbassador.CPerception perceptionConfiguration) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/simulation/perception/CentralPerceptionComponent.java`
#### Snippet
```java
     * If set to true, the traffic light index will be updated when {@code updateSpatialIndices} is called.
     */
    private boolean updateVehicleIndex = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/simulation/perception/index/TrafficObjectIndex.java`
#### Snippet
```java
        private final Logger log;
        private VehicleIndex vehicleIndex = null;
        private TrafficLightIndex trafficLightIndex = null;

        public Builder(Logger log) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/simulation/perception/index/TrafficObjectIndex.java`
#### Snippet
```java
    public static class Builder {
        private final Logger log;
        private VehicleIndex vehicleIndex = null;
        private TrafficLightIndex trafficLightIndex = null;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/simulation/communication/AbstractCommunicationModuleConfiguration.java`
#### Snippet
```java
public abstract class AbstractCommunicationModuleConfiguration implements CommunicationModuleConfiguration {

    Long camMinimalPayloadLength = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/simulation/communication/CellModuleConfiguration.java`
#### Snippet
```java
     * (intended for application ambassador)
     */
    private CellCamConfiguration camConfiguration = null;

    public CellModuleConfiguration maxDownlinkBitrate(long bitrate) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/simulation/communication/AdHocModuleConfiguration.java`
#### Snippet
```java

        private double power = -1;  // Default value -1 indicates power configuration through federate
        private Double distance = null;

        private AdHocChannel channel0;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/simulation/communication/AdHocModuleConfiguration.java`
#### Snippet
```java
        private AdHocChannel channel0;
        private AdHocChannel channel1;
        private int nrOfChannels = 0;

        private AdHocModuleRadioConfiguration(AdHocModuleConfiguration parent) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/simulation/AbstractSimulationUnit.java`
#### Snippet
```java
     * User defined tagged value for the next CAM.
     */
    private byte[] userTaggedValue = null;

    private Class<? extends OperatingSystem> operatingSystemCheck;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `app/tutorials/weather-warning/src/main/java/org/eclipse/mosaic/app/tutorial/SlowDownApp.java`
#### Snippet
```java
    private final static float SPEED = 25 / 3.6f;

    private boolean hazardousArea = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `app/tutorials/example-applications/src/main/java/org/eclipse/mosaic/app/examples/commuter/SimpleCommuterApp.java`
#### Snippet
```java
    private final long activityDuration;

    private boolean initialTripPlanned = false;
    private boolean returnTripPlanned = false;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `app/tutorials/example-applications/src/main/java/org/eclipse/mosaic/app/examples/commuter/SimpleCommuterApp.java`
#### Snippet
```java

    private boolean initialTripPlanned = false;
    private boolean returnTripPlanned = false;

    private StopWatch stopWatch;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `app/tutorials/example-applications/src/main/java/org/eclipse/mosaic/app/examples/emergencybrake/EmergencyBrakeApp.java`
#### Snippet
```java
    // Keep track of the vehicle movement for the emergency brake detection
    private float lastSpeed = 0;
    private float lastTime = 0;
    private long startedBrakingAt = Long.MIN_VALUE;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `app/tutorials/example-applications/src/main/java/org/eclipse/mosaic/app/examples/emergencybrake/EmergencyBrakeApp.java`
#### Snippet
```java

    // Keep status of the emergency brake performed on obstacle
    private boolean emergencyBrake = false;
    private long stoppedAt = Long.MIN_VALUE;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `app/tutorials/example-applications/src/main/java/org/eclipse/mosaic/app/examples/emergencybrake/EmergencyBrakeApp.java`
#### Snippet
```java

    // Keep track of the vehicle movement for the emergency brake detection
    private float lastSpeed = 0;
    private float lastTime = 0;
    private long startedBrakingAt = Long.MIN_VALUE;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `app/tutorials/example-applications/src/main/java/org/eclipse/mosaic/app/tutorial/trafficlight/TrafficLightControlApp.java`
#### Snippet
```java
public class TrafficLightControlApp extends AbstractApplication<TrafficLightOperatingSystem> {

    private boolean lengthened = false;

    @Override
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `app/tutorials/weather-warning/src/main/java/org/eclipse/mosaic/app/tutorial/WeatherWarningApp.java`
#### Snippet
```java
     * Flag that is set if the route has already been changed.
     */
    private boolean routeChanged = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/spatial/SpatialTreeTraverser.java`
#### Snippet
```java

    public static class Nearest<T> extends CenterDistanceBased<T> {
        protected T nearest = null;
        protected double distanceSqr = Double.POSITIVE_INFINITY;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/spatial/SpatialTreeTraverser.java`
#### Snippet
```java

    public static class InRadius<T> extends CenterDistanceBased<T> {
        protected double radiusSqr = 0;
        protected final List<T> result = new ArrayList<>();

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/spatial/KdTree.java`
#### Snippet
```java

    private class KdNode extends Node {
        private List<Node> children = null;
        private List<T> items = null;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/spatial/KdTree.java`
#### Snippet
```java
    private class KdNode extends Node {
        private List<Node> children = null;
        private List<T> items = null;

        KdNode(List<T> items, int bucketSz, int depth) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/transform/GeoProjection.java`
#### Snippet
```java
    }

    private volatile GeoCalculator geoCalculator = null;

    public GeoProjection setGeoCalculator(GeoCalculator geoCalculator) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/transform/LazyGeoProjection.java`
#### Snippet
```java

    private final ProjectionFactory projectionFactory;
    private GeoProjection inst = null;

    public LazyGeoProjection() {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/transform/Wgs84Projection.java`
#### Snippet
```java
    private final UtmPoint utmOrigin;

    private boolean failIfOutsideWorld = false;
    private boolean useZoneOfUtmOrigin = false;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/transform/Wgs84Projection.java`
#### Snippet
```java

    private boolean failIfOutsideWorld = false;
    private boolean useZoneOfUtmOrigin = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/util/InductionLoop.java`
#### Snippet
```java
     * Latest time stamp when traffic flow was cached.
     */
    private long trafficFlowCacheTime = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/spatial/QuadTree.java`
#### Snippet
```java

    class ObjectAndNode {
        TreeNode node = null;
        final T object;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/spatial/QuadTree.java`
#### Snippet
```java
        final ArrayList<QuadTree<?>.ObjectAndNode> objects = new ArrayList<>();
        int objectsCount = 0;
        TreeNode[] childNodes = null;

        private TreeNode(int depth, double minX, double maxX, double minZ, double maxZ) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/spatial/QuadTree.java`
#### Snippet
```java

        final ArrayList<QuadTree<?>.ObjectAndNode> objects = new ArrayList<>();
        int objectsCount = 0;
        TreeNode[] childNodes = null;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/SimulationTraciRequest.java`
#### Snippet
```java
        implements org.eclipse.mosaic.fed.sumo.bridge.api.SimulationTraciRequest {

    private String msgId = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/TrafficLightGetControlledJunctions.java`
#### Snippet
```java
public class TrafficLightGetControlledJunctions implements org.eclipse.mosaic.fed.sumo.bridge.api.TrafficLightGetControlledJunctions {

    boolean warned = false;

    public List<String> execute(Bridge bridge, String tlId) throws CommandException, InternalFederateException {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/reader/AbstractTraciResultReader.java`
#### Snippet
```java
     * Number of bytes that have benn read.
     */
    protected int numBytesRead = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/reader/AbstractTraciResultReader.java`
#### Snippet
```java
     * Total number od bytes.
     */
    protected int totalBytesLeft = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/config/CSumo.java`
#### Snippet
```java
     * Prints out all traci calls.
     */
    public boolean debugTraciCalls = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/config/CSumo.java`
#### Snippet
```java
     * This could be helpful as IDM should be parametrized with lower time gaps to achieve specific time gap values.
     */
    public double timeGapOffset = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/ambassador/ExternalVehicleState.java`
#### Snippet
```java
     * added during simulation.
     */
    private boolean added = false;

    private VehicleData lastMovementInfo = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/ambassador/ExternalVehicleState.java`
#### Snippet
```java
    private boolean added = false;

    private VehicleData lastMovementInfo = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/facades/SimulationFacade.java`
#### Snippet
```java
        private final String id;
        private VehicleData currentVehicleData = null;
        private VehicleData lastVehicleData = null;
        private Double frontSensorDistance = null;
        private Double rearSensorDistance = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/facades/SimulationFacade.java`
#### Snippet
```java
        private VehicleData lastVehicleData = null;
        private Double frontSensorDistance = null;
        private Double rearSensorDistance = null;

        private SumoVehicleState(String id) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/facades/SimulationFacade.java`
#### Snippet
```java
        private VehicleData currentVehicleData = null;
        private VehicleData lastVehicleData = null;
        private Double frontSensorDistance = null;
        private Double rearSensorDistance = null;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/facades/SimulationFacade.java`
#### Snippet
```java
     * before the next simulation step.
     */
    private boolean updateBestLanesBeforeNextSimulationStep = false;
    private boolean noRearSensorConfigured = true;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/facades/SimulationFacade.java`
#### Snippet
```java
    private static class SumoVehicleState {
        private final String id;
        private VehicleData currentVehicleData = null;
        private VehicleData lastVehicleData = null;
        private Double frontSensorDistance = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/ambassador/AbstractSumoAmbassador.java`
#### Snippet
```java
     * Command used to start Sumo.
     */
    FederateExecutor federateExecutor = null;

    /**
```

## RuleId[id=EqualsAndHashcode]
### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `lib/mosaic-objects/src/main/java/org/eclipse/mosaic/lib/objects/vehicle/PublicTransportData.java`
#### Snippet
```java
     * Class representing a vehicle stopping place.
     */
    public static class StoppingPlace {
        /**
         * Id of the stop.
```

### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/simulation/perception/index/objects/TrafficLightObject.java`
#### Snippet
```java
import org.apache.commons.lang3.builder.EqualsBuilder;

public class TrafficLightObject extends SpatialObject<TrafficLightObject> {
    /**
     * Id of the group the individual traffic light belongs to.
```

### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/simulation/perception/index/objects/VehicleObject.java`
#### Snippet
```java
import javax.annotation.Nullable;

public class VehicleObject extends SpatialObject<VehicleObject> {

    /**
```

## RuleId[id=RedundantImplements]
### RedundantImplements
Redundant interface declaration `Runnable`
in `fed/mosaic-output/src/main/java/org/eclipse/mosaic/fed/output/generator/websocket/WebsocketVisualizerServer.java`
#### Snippet
```java

@SuppressWarnings("UnstableApiUsage")
public class WebsocketVisualizerServer extends WebSocketServer implements Runnable {

    private final Logger log = LoggerFactory.getLogger(this.getClass());
```

### RedundantImplements
Redundant interface declaration `Application`
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/app/api/ChargingStationApplication.java`
#### Snippet
```java
 * are to implement this interface.
 */
public interface ChargingStationApplication extends Application, OperatingSystemAccess<ChargingStationOperatingSystem> {

    /**
```

### RedundantImplements
Redundant interface declaration `Application`
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/app/api/TrafficManagementCenterApplication.java`
#### Snippet
```java
 * are to implement this interface.
 */
public interface TrafficManagementCenterApplication extends Application, OperatingSystemAccess<TrafficManagementCenterOperatingSystem> {

    /**
```

### RedundantImplements
Redundant interface declaration `Application`
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/app/api/ElectricVehicleApplication.java`
#### Snippet
```java
 * are to implement this interface.
 */
public interface ElectricVehicleApplication extends VehicleApplication, Application {

    /**
```

### RedundantImplements
Redundant interface declaration `EventProcessor`
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/app/AbstractApplication.java`
#### Snippet
```java
 */
@SuppressWarnings("checkstyle:ClassTypeParameterName")
public abstract class AbstractApplication<OS extends OperatingSystem> implements EventProcessor, Application, OperatingSystemAccess<OS> {

    private OS operatingSystem = null;
```

### RedundantImplements
Redundant interface declaration `Application`
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/app/AbstractApplication.java`
#### Snippet
```java
 */
@SuppressWarnings("checkstyle:ClassTypeParameterName")
public abstract class AbstractApplication<OS extends OperatingSystem> implements EventProcessor, Application, OperatingSystemAccess<OS> {

    private OS operatingSystem = null;
```

### RedundantImplements
Redundant interface declaration `Serializable`
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/config/CApplicationAmbassador.java`
#### Snippet
```java
     * implementation to use.
     */
    public static class CRoutingByType extends CRouting implements Serializable {

        /**
```

### RedundantImplements
Redundant interface declaration `Rectangle`
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/geo/GeoRectangle.java`
#### Snippet
```java
 * Together they form a rectangular area.
 */
public class GeoRectangle implements Rectangle<GeoPoint>, Bounds<GeoPoint>, GeoArea {

    private static final long serialVersionUID = 1L;
```

### RedundantImplements
Redundant interface declaration `Rectangle`
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/geo/CartesianRectangle.java`
#### Snippet
```java
package org.eclipse.mosaic.lib.geo;

public class CartesianRectangle implements Rectangle<CartesianPoint>, Bounds<CartesianPoint>, CartesianArea {

    private static final long serialVersionUID = 1L;
```

### RedundantImplements
Redundant interface declaration `Serializable`
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/spatial/LineString.java`
#### Snippet
```java
import java.util.stream.Stream;

public abstract class LineString<T extends Vector3d> extends ArrayList<T> implements Serializable {

    private static final long serialVersionUID = 1L;
```

## RuleId[id=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-03-19-09-30-25.202.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[id=StringBufferReplaceableByStringBuilder]
### StringBufferReplaceableByStringBuilder
`StringBuffer b` may be declared as 'StringBuilder'
in `fed/mosaic-cell/src/main/java/org/eclipse/mosaic/fed/cell/viz/PerRegionBandwidthMeasurement.java`
#### Snippet
```java
        int endRowIndex = max(csvSize, csvSize + exportSize);

        StringBuffer b;
        for (int rowIndex = csvSize; rowIndex < endRowIndex; rowIndex++) {
            b = new StringBuffer(Long.toUnsignedString((csvSize * interval) / TIME.SECOND));
```

### StringBufferReplaceableByStringBuilder
`StringBuffer sb` may be declared as 'StringBuilder'
in `app/tutorials/traffic-light-communication/src/main/java/org/eclipse/mosaic/app/tutorial/message/IntraVehicleMsg.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("IntraVehicleMsg{");
        sb.append("origin='").append(origin).append('\'');
        sb.append(", id=").append(id);
```

### StringBufferReplaceableByStringBuilder
`StringBuffer sb` may be declared as 'StringBuilder'
in `app/tutorials/traffic-light-communication/src/main/java/org/eclipse/mosaic/app/tutorial/message/GreenWaveMsg.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("GreenWaveMsg{");
        sb.append("message='").append(message).append('\'');
        sb.append('}');
```

### StringBufferReplaceableByStringBuilder
`StringBuffer sb` may be declared as 'StringBuilder'
in `app/tutorials/traffic-light-communication/src/main/java/org/eclipse/mosaic/app/tutorial/message/InterVehicleMsg.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("InterVehicleMsg{");
        sb.append("senderPosition=").append(senderPosition);
        sb.append('}');
```

## RuleId[id=DuplicateThrows]
### DuplicateThrows
Duplicate throws
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/api/LaneAreaSubscribe.java`
#### Snippet
```java
     */

    void execute(Bridge bridge, String laneAreaId, long startTime, long endTime) throws CommandException, InternalFederateException, InternalFederateException;
}

```

### DuplicateThrows
Duplicate throws
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/api/VehicleSetMaxAcceleration.java`
#### Snippet
```java
public interface VehicleSetMaxAcceleration {

    void execute(Bridge bridge, String vehicleId, double value) throws CommandException, InternalFederateException, InternalFederateException;
}

```

## RuleId[id=SynchronizeOnThis]
### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/transform/GeoProjection.java`
#### Snippet
```java
    public final GeoCalculator getGeoCalculator() {
        if (geoCalculator == null) {
            synchronized (this) {
                if (geoCalculator == null) {
                    setGeoCalculator(new SimpleGeoCalculator());
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `lib/mosaic-utils/src/main/java/org/eclipse/mosaic/lib/util/cli/CommandLineParser.java`
#### Snippet
```java

        // parse command line
        final CommandLine line = parser.parse(options, argumentsToParse.toArray(new String[0]));

        // write option values into parameter object
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `rti/mosaic-starter/src/main/java/org/eclipse/mosaic/starter/MosaicClassLoader.java`
#### Snippet
```java
                    .toArray(URL[]::new);
        } catch (Exception e) {
            return new URL[0];
        }
    }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `rti/mosaic-starter/src/main/java/org/eclipse/mosaic/starter/MosaicClassLoader.java`
#### Snippet
```java
                return new MosaicClassLoader(collectJarFiles(libraryPath), ClassLoader.getSystemClassLoader());
            }
            return new MosaicClassLoader(new URL[0], ClassLoader.getSystemClassLoader());
        });
    }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `lib/mosaic-objects/src/main/java/org/eclipse/mosaic/lib/objects/v2x/EncodedPayload.java`
#### Snippet
```java
    public byte[] getBytes() {
        if (bytes == null) {
            return new byte[0];
        }
        return bytes.clone();
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/ApplicationAmbassador.java`
#### Snippet
```java
        }
        SimulationKernel.SimulationKernel.setClassLoader(new URLClassLoader(
                urls.toArray(new URL[0]),
                Thread.currentThread().getContextClassLoader()
        ));
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/SimulationTraciRequest.java`
#### Snippet
```java
                        Status.STATUS_ERR,
                        "TraCI return value couldn't be extracted.",
                        new byte[0]
                )
        );
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/AbstractTraciCommand.java`
#### Snippet
```java
                    }
                    if (resultObjects.size() > 0) {
                        results.add(constructResult(status, resultObjects.toArray(new Object[0])));
                    }

```

## RuleId[id=TypeParameterExtendsObject]
### TypeParameterExtendsObject
Type parameter `T` explicitly extends 'java.lang.Object'
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/CommandRegister.java`
#### Snippet
```java
     * Pre-register commands.
     */
    public <T extends Object> T register(Class<? extends T> clazz, T command) {
        commands.put(clazz, command);
        return command;
```

### TypeParameterExtendsObject
Type parameter `T` explicitly extends 'java.lang.Object'
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/CommandRegister.java`
#### Snippet
```java
     * @throws IllegalArgumentException if the given class could not be instantiated.
     */
    public <T extends Object> T getOrCreate(Class<T> commandClass) {
        T command = (T) commands.get(commandClass);
        if (command == null) {
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `foundMagic` initializer `false` is redundant
in `lib/mosaic-utils/src/main/java/org/eclipse/mosaic/lib/util/JsonUtils.java`
#### Snippet
```java
        boolean inMultilineComment = false;
        boolean inSinglelineComment = false;
        boolean foundMagic = false;

        String tmp;
```

### UnusedAssignment
Variable `payload` initializer `null` is redundant
in `lib/mosaic-objects/src/main/java/org/eclipse/mosaic/lib/objects/v2x/etsi/Spatm.java`
#### Snippet
```java
     * The encoded message.
     */
    private EncodedPayload payload = null;

    @Override
```

### UnusedAssignment
Variable `type` initializer `null` is redundant
in `app/tutorials/weather-warning/src/main/java/org/eclipse/mosaic/app/tutorial/WeatherWarningApp.java`
#### Snippet
```java

        // Initialize sensor type
        SensorType type = null;
        // Initialize sensor strength
        int strength = 0;
```

### UnusedAssignment
Variable `strength` initializer `0` is redundant
in `app/tutorials/weather-warning/src/main/java/org/eclipse/mosaic/app/tutorial/WeatherWarningApp.java`
#### Snippet
```java
        SensorType type = null;
        // Initialize sensor strength
        int strength = 0;

        /*
```

## RuleId[id=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/geo/GeoUtils.java`
#### Snippet
```java
        }

        return closestDistances.stream().min(Comparator.comparingDouble(Tuple::getA)).get().getB();
    }

```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `obj == null` is always `false`
in `lib/mosaic-utils/src/main/java/org/eclipse/mosaic/lib/util/objects/ObjectInstantiation.java`
#### Snippet
```java
        } else {
            obj = createWithDefaultDefaultConstructor();
            if (obj == null) {
                throw new InstantiationException("Could not read or instantiate the object.");
            }
```

### ConstantValue
Condition `isLeftTurn` is always `false`
in `lib/mosaic-routing/src/main/java/org/eclipse/mosaic/lib/routing/graphhopper/util/TurnCostAnalyzer.java`
#### Snippet
```java
            //else, the maximum turn speed depends on the angle between incoming and outgoing edge
        } else {
            if (isLeftTurn || isRightTurn) {
                //when turning, the max speed on the outgoing edge also depends on its length (i.e., if the 
                //outgoing edge is very short, we don't need to accelerate till max speed)
```

## RuleId[id=MethodOverridesStaticMethod]
### MethodOverridesStaticMethod
Method `identityMatrix()` tries to override a static method of a superclass
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/spatial/TransformationMatrix.java`
#### Snippet
```java
     * Creates a new transformation matrix. The initial values match the identity matrix.
     */
    public static TransformationMatrix identityMatrix() {
        return new TransformationMatrix();
    }
```

## RuleId[id=IOResource]
### IOResource
'Scanner' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `lib/mosaic-network/src/main/java/org/eclipse/mosaic/lib/coupling/AbstractNetworkAmbassador.java`
#### Snippet
```java
    public void connectToFederate(String host, InputStream in, InputStream err) throws InternalFederateException {
        try {
            final Scanner outputScanner = new Scanner(in);
            final String outPortPattern = "OutPort=\\d{1,5}";
            final String errorPattern = ".*Error:.*";
```

### IOResource
'DataInputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `rti/mosaic-rti-core/src/main/java/org/eclipse/mosaic/rti/ExternalWatchDog.java`
#### Snippet
```java
        try {
            final Socket socket = serverSocket.accept();
            final DataInputStream in = new DataInputStream(socket.getInputStream());
            int status = in.readInt();
            if (status == CLOSE_STATUS) {
```

### IOResource
'DataOutputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `app/tutorials/example-applications/src/main/java/org/eclipse/mosaic/app/tutorial/traci/SumoTraciInteractionApp.java`
#### Snippet
```java
    private byte[] assembleTraciCommand(String vehicleId) {
        final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        final DataOutputStream dos = new DataOutputStream(baos);
        final byte TRACI_VEHICLE = (byte) 0xa4;
        final byte TRACI_GET_SPEED = (byte) 0x40;
```

## RuleId[id=SuspiciousNameCombination]
### SuspiciousNameCombination
'maxWidth' should probably not be passed as parameter 'height'
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/util/TrafficSignImageCreator.java`
#### Snippet
```java
                g.setColor(textColor);
                int maxWidth = backgroundImage.getWidth() - 2 * minPadding;
                Dimension textSize = makeTextFitDimension(g, new Dimension(maxWidth, maxWidth), text, true);
                int left = (backgroundImage.getWidth() - textSize.width) / 2;
                int top = backgroundImage.getHeight() / 2 + textSize.height / 2;
```

### SuspiciousNameCombination
'width' should probably not be passed as parameter 'height'
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/util/TrafficSignImageCreator.java`
#### Snippet
```java
                int top = backgroundImage.getHeight() - width;
                g.setColor(Color.BLACK);
                g.fillRect(left, top, width, width);

                // Draw inner box
```

### SuspiciousNameCombination
'innerWidth' should probably not be passed as parameter 'height'
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/util/TrafficSignImageCreator.java`
#### Snippet
```java
                int innerWidth = width - 2 * borderWidth;
                g.setColor(Color.WHITE);
                g.fillRect(left + borderWidth, top + borderWidth, innerWidth, innerWidth);

                // Add text (lane index)
```

### SuspiciousNameCombination
'maxWidth' should probably not be passed as parameter 'height'
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/util/TrafficSignImageCreator.java`
#### Snippet
```java
                text = "" + lane;
                int maxWidth = width - 6 * borderWidth;
                Dimension textSize = makeTextFitDimension(g, new Dimension(maxWidth, maxWidth), text, false);
                left += (innerWidth - textSize.width) / 2;
                top += borderWidth + innerWidth / 2 + textSize.height / 2;
```

### SuspiciousNameCombination
'laneWidth' should probably not be passed as parameter 'height'
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/util/TrafficSignManager.java`
#### Snippet
```java
        double y = basePoint.getY() + Math.cos(Math.toRadians(angle + 90)) * distanceFromBase;
        if (bridge != null && image != null) {
            bridge.getPoiControl().addImagePoi(id, CartesianPoint.xy(x, y), image, laneWidth, laneWidth, angle);
        } else {
            LOG.error("Could not add traffic sign image.");
```

## RuleId[id=SocketResource]
### SocketResource
'Socket' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `rti/mosaic-rti-core/src/main/java/org/eclipse/mosaic/rti/ExternalWatchDog.java`
#### Snippet
```java
    public void run() {
        try {
            final Socket socket = serverSocket.accept();
            final DataInputStream in = new DataInputStream(socket.getInputStream());
            int status = in.readInt();
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `CMD` has only 'static' members, and lacks a 'private' constructor
in `lib/mosaic-network/src/main/java/org/eclipse/mosaic/lib/coupling/ClientServerChannel.java`
#### Snippet
```java
    }

    public static final class CMD {
        /**
         * Undefined Message.
```

### UtilityClassWithoutPrivateConstructor
Class `ADDRESSTYPE` has only 'static' members, and lacks a 'private' constructor
in `lib/mosaic-network/src/main/java/org/eclipse/mosaic/lib/coupling/ClientServerChannel.java`
#### Snippet
```java
     * Allowed address types.
     */
    public static final class ADDRESSTYPE {

        /**
```

### UtilityClassWithoutPrivateConstructor
Class `DatabaseUtils` has only 'static' members, and lacks a 'private' constructor
in `lib/mosaic-database/src/main/java/org/eclipse/mosaic/lib/database/DatabaseUtils.java`
#### Snippet
```java
 * contained in {@link Database}s.
 */
public class DatabaseUtils {

    static final Logger log = LoggerFactory.getLogger(Database.class);
```

### UtilityClassWithoutPrivateConstructor
Class `TABLES` has only 'static' members, and lacks a 'private' constructor
in `lib/mosaic-database/src/main/java/org/eclipse/mosaic/lib/database/persistence/TABLES.java`
#### Snippet
```java
package org.eclipse.mosaic.lib.database.persistence;

final class TABLES {
    static String PROPERTIES = "Properties";
    static String NODE = "Node";
```

### UtilityClassWithoutPrivateConstructor
Class `InteractionUtils` has only 'static' members, and lacks a 'private' constructor
in `lib/mosaic-utils/src/main/java/org/eclipse/mosaic/lib/util/InteractionUtils.java`
#### Snippet
```java
import java.util.Optional;

public class InteractionUtils {

    private final static Logger log = LoggerFactory.getLogger(InteractionUtils.class);
```

### UtilityClassWithoutPrivateConstructor
Class `TransmissionModel` has only 'static' members, and lacks a 'private' constructor
in `lib/mosaic-communication/src/main/java/org/eclipse/mosaic/lib/model/transmission/TransmissionModel.java`
#### Snippet
```java
 * Logic of the loss probability model to simulate packet transmission.
 */
public class TransmissionModel {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `UnitNameGenerator` has only 'static' members, and lacks a 'private' constructor
in `lib/mosaic-objects/src/main/java/org/eclipse/mosaic/lib/objects/UnitNameGenerator.java`
#### Snippet
```java
 * Helper class to generate unique names for the objects in the simulation.
 */
public class UnitNameGenerator {

    private static final Map<UnitType, AtomicInteger> unitCounters = new HashMap<>();
```

### UtilityClassWithoutPrivateConstructor
Class `FederatePriority` has only 'static' members, and lacks a 'private' constructor
in `rti/mosaic-rti-api/src/main/java/org/eclipse/mosaic/rti/api/parameters/FederatePriority.java`
#### Snippet
```java
 * Constant values for prioritizing federates.
 */
public final class FederatePriority {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `WayTypeEncoder` has only 'static' members, and lacks a 'private' constructor
in `lib/mosaic-routing/src/main/java/org/eclipse/mosaic/lib/routing/graphhopper/util/WayTypeEncoder.java`
#### Snippet
```java
import java.util.Set;

public class WayTypeEncoder {

    private static final BiMap<String, Integer> wayTypeIntMap = HashBiMap.create();
```

### UtilityClassWithoutPrivateConstructor
Class `ConfigBuilderFactory` has only 'static' members, and lacks a 'private' constructor
in `fed/mosaic-cell/src/main/java/org/eclipse/mosaic/fed/cell/config/gson/ConfigBuilderFactory.java`
#### Snippet
```java
import com.google.gson.GsonBuilder;

public class ConfigBuilderFactory {

    public static GsonBuilder getConfigBuilder() throws RuntimeException {
```

### UtilityClassWithoutPrivateConstructor
Class `CellModuleNames` has only 'static' members, and lacks a 'private' constructor
in `fed/mosaic-cell/src/main/java/org/eclipse/mosaic/fed/cell/module/CellModuleNames.java`
#### Snippet
```java
package org.eclipse.mosaic.fed.cell.module;

public class CellModuleNames {
    public final static String DOWNSTREAM_MODULE = "Downstream";
    public final static String UPSTREAM_MODULE = "Upstream";
```

### UtilityClassWithoutPrivateConstructor
Class `ConfigurationReader` has only 'static' members, and lacks a 'private' constructor
in `fed/mosaic-cell/src/main/java/org/eclipse/mosaic/fed/cell/config/util/ConfigurationReader.java`
#### Snippet
```java
 * some values used for calculation.
 */
public class ConfigurationReader {

    private static final Logger log = LoggerFactory.getLogger(ConfigurationReader.class);
```

### UtilityClassWithoutPrivateConstructor
Class `StreamModulesDebugLogger` has only 'static' members, and lacks a 'private' constructor
in `fed/mosaic-cell/src/main/java/org/eclipse/mosaic/fed/cell/module/streammodules/StreamModulesDebugLogger.java`
#### Snippet
```java
 * All messages are only available for log level lower or equals DEBUG
 */
class StreamModulesDebugLogger {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `HandoverUtility` has only 'static' members, and lacks a 'private' constructor
in `fed/mosaic-cell/src/main/java/org/eclipse/mosaic/fed/cell/utility/HandoverUtility.java`
#### Snippet
```java
import org.apache.commons.lang3.StringUtils;

public class HandoverUtility {

    public static boolean isAfterHandover(String currentRegion, String previousRegion) {
```

### UtilityClassWithoutPrivateConstructor
Class `RetransmissionLossUtility` has only 'static' members, and lacks a 'private' constructor
in `fed/mosaic-cell/src/main/java/org/eclipse/mosaic/fed/cell/utility/RetransmissionLossUtility.java`
#### Snippet
```java
 */
@SuppressWarnings(value = {"NP_UNWRITTEN_PUBLIC_OR_PROTECTED_FIELD"}, justification = "filled by GSON")
public class RetransmissionLossUtility {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `NodeUtility` has only 'static' members, and lacks a 'private' constructor
in `fed/mosaic-cell/src/main/java/org/eclipse/mosaic/fed/cell/utility/NodeUtility.java`
#### Snippet
```java
 * This class contains static methods to make the handling of the configuration of the nodes easier.
 */
public class NodeUtility {

    private static final SimulationData simData = SimulationData.INSTANCE;
```

### UtilityClassWithoutPrivateConstructor
Class `DelayUtility` has only 'static' members, and lacks a 'private' constructor
in `fed/mosaic-cell/src/main/java/org/eclipse/mosaic/fed/cell/utility/DelayUtility.java`
#### Snippet
```java
 */
@SuppressWarnings(value = {"NP_UNWRITTEN_PUBLIC_OR_PROTECTED_FIELD"}, justification = "filled by GSON")
public final class DelayUtility {

    private static final Logger log = LoggerFactory.getLogger(DelayUtility.class);
```

### UtilityClassWithoutPrivateConstructor
Class `CapacityUtility` has only 'static' members, and lacks a 'private' constructor
in `fed/mosaic-cell/src/main/java/org/eclipse/mosaic/fed/cell/utility/CapacityUtility.java`
#### Snippet
```java
 */
@SuppressWarnings(value = {"NP_UNWRITTEN_PUBLIC_OR_PROTECTED_FIELD"}, justification = "filled by GSON")
public final class CapacityUtility {

    private static final Logger log = LoggerFactory.getLogger(CapacityUtility.class);
```

### UtilityClassWithoutPrivateConstructor
Class `NodeCapacityUtility` has only 'static' members, and lacks a 'private' constructor
in `fed/mosaic-cell/src/main/java/org/eclipse/mosaic/fed/cell/utility/NodeCapacityUtility.java`
#### Snippet
```java
 * Static methods for handling the bandwidth calculation.
 */
public final class NodeCapacityUtility {

    private static final Logger log = LoggerFactory.getLogger(NodeCapacityUtility.class);
```

### UtilityClassWithoutPrivateConstructor
Class `RegionCapacityUtility` has only 'static' members, and lacks a 'private' constructor
in `fed/mosaic-cell/src/main/java/org/eclipse/mosaic/fed/cell/utility/RegionCapacityUtility.java`
#### Snippet
```java
 */
@SuppressWarnings(value = {"NP_UNWRITTEN_PUBLIC_OR_PROTECTED_FIELD"}, justification = "filled by GSON")
public final class RegionCapacityUtility {

    private static final Logger log = LoggerFactory.getLogger(RegionCapacityUtility.class);
```

### UtilityClassWithoutPrivateConstructor
Class `RegionUtility` has only 'static' members, and lacks a 'private' constructor
in `fed/mosaic-cell/src/main/java/org/eclipse/mosaic/fed/cell/utility/RegionUtility.java`
#### Snippet
```java
 * This class contains static methods to make the region handling easier.
 */
public class RegionUtility {

    private static final Logger log = LoggerFactory.getLogger(RegionUtility.class);
```

### UtilityClassWithoutPrivateConstructor
Class `FilterFactory` has only 'static' members, and lacks a 'private' constructor
in `fed/mosaic-output/src/main/java/org/eclipse/mosaic/fed/output/generator/file/filter/FilterFactory.java`
#### Snippet
```java
import javax.annotation.Nonnull;

public class FilterFactory {

    private static final Filter NO_FILTER = new Filter(null) {
```

### UtilityClassWithoutPrivateConstructor
Class `ExtendedMethodSet` has only 'static' members, and lacks a 'private' constructor
in `fed/mosaic-output/src/main/java/org/eclipse/mosaic/fed/output/generator/file/format/ExtendedMethodSet.java`
#### Snippet
```java
import java.util.TreeMap;

public class ExtendedMethodSet {

    private final static SortedMap<Integer, V2xMessage> V2X_MESSAGES = new TreeMap<>();
```

### UtilityClassWithoutPrivateConstructor
Class `ConfigHelper` has only 'static' members, and lacks a 'private' constructor
in `fed/mosaic-output/src/main/java/org/eclipse/mosaic/fed/output/ambassador/ConfigHelper.java`
#### Snippet
```java
 * This class is intended to contain helper methods to read the output generator configuration file.
 */
public class ConfigHelper {

    private static final int DEFAULT_UPDATE_INTERVAL = 1;
```

### UtilityClassWithoutPrivateConstructor
Class `RegistrationSubscriptionTypes` has only 'static' members, and lacks a 'private' constructor
in `fed/mosaic-output/src/main/java/org/eclipse/mosaic/fed/output/ambassador/RegistrationSubscriptionTypes.java`
#### Snippet
```java
 * This Class is used to identify initialization interaction types.
 */
public final class RegistrationSubscriptionTypes {

    private final static Set<String> registrationSubscriptionTypes = Collections.unmodifiableSet(Sets.newHashSet(
```

### UtilityClassWithoutPrivateConstructor
Class `EventNicenessPriorityRegister` has only 'static' members, and lacks a 'private' constructor
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/util/EventNicenessPriorityRegister.java`
#### Snippet
```java
 * top = highest priority. bottom lowest priority.
 */
public class EventNicenessPriorityRegister {
    // vehicle
    public final static long vehicleAdded = -99_999_900;
```

### UtilityClassWithoutPrivateConstructor
Class `RoadPositionFactory` has only 'static' members, and lacks a 'private' constructor
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/navigation/RoadPositionFactory.java`
#### Snippet
```java
 * is mainly used for stop instructions for vehicles.
 */
public class RoadPositionFactory {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `SpeedUtils` has only 'static' members, and lacks a 'private' constructor
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/math/SpeedUtils.java`
#### Snippet
```java
package org.eclipse.mosaic.lib.math;

public class SpeedUtils {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `GeoUtils` has only 'static' members, and lacks a 'private' constructor
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/geo/GeoUtils.java`
#### Snippet
```java
import java.util.Comparator;

public class GeoUtils {

    private static final GeoCalculator DEFAULT_GEO_CALCULATOR = new SimpleGeoCalculator();
```

### UtilityClassWithoutPrivateConstructor
Class `GlobalRandom` has only 'static' members, and lacks a 'private' constructor
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/math/GlobalRandom.java`
#### Snippet
```java
package org.eclipse.mosaic.lib.math;

public class GlobalRandom {

    private static RandomNumberGenerator RANDOM = createGoodRand(0);
```

### UtilityClassWithoutPrivateConstructor
Class `VectorUtils` has only 'static' members, and lacks a 'private' constructor
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/math/VectorUtils.java`
#### Snippet
```java
package org.eclipse.mosaic.lib.math;

public class VectorUtils {

    public static final Vector3d NORTH = new Vector3d(0, 0, -1);
```

### UtilityClassWithoutPrivateConstructor
Class `MathUtils` has only 'static' members, and lacks a 'private' constructor
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/math/MathUtils.java`
#### Snippet
```java
package org.eclipse.mosaic.lib.math;

public class MathUtils {

    // values below epsilon constants will be considered as zero by isZero() functions
```

### UtilityClassWithoutPrivateConstructor
Class `TrafficLightStateDecoder` has only 'static' members, and lacks a 'private' constructor
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/util/TrafficLightStateDecoder.java`
#### Snippet
```java
import java.util.stream.Collectors;

public class TrafficLightStateDecoder {

    public static List<TrafficLightState> createStateListFromEncodedString(String encoded) {
```

### UtilityClassWithoutPrivateConstructor
Class `SumoVehicleClassMapping` has only 'static' members, and lacks a 'private' constructor
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/util/SumoVehicleClassMapping.java`
#### Snippet
```java
import com.google.common.collect.ImmutableBiMap;

public class SumoVehicleClassMapping {

    private final static BiMap<String, VehicleClass> vehicleClassBiMap = new ImmutableBiMap.Builder<String, VehicleClass>()
```

### UtilityClassWithoutPrivateConstructor
Class `QuadTreeTraversal` has only 'static' members, and lacks a 'private' constructor
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/spatial/QuadTreeTraversal.java`
#### Snippet
```java
import java.util.function.Predicate;

class QuadTreeTraversal {

    static <T> void getObjectsInRadius(QuadTree<T> tree, Vector3d center, double radius, List<T> result) {
```

### UtilityClassWithoutPrivateConstructor
Class `CommandLanePropertyChange` has only 'static' members, and lacks a 'private' constructor
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandLanePropertyChange.java`
#### Snippet
```java
package org.eclipse.mosaic.fed.sumo.bridge.traci.constants;

public class CommandLanePropertyChange {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `CommandRetrieveVehicleTypeState` has only 'static' members, and lacks a 'private' constructor
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandRetrieveVehicleTypeState.java`
#### Snippet
```java
package org.eclipse.mosaic.fed.sumo.bridge.traci.constants;

public class CommandRetrieveVehicleTypeState {

    public final static int COMMAND = 0xa5;
```

### UtilityClassWithoutPrivateConstructor
Class `CommandChangeTrafficLightState` has only 'static' members, and lacks a 'private' constructor
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandChangeTrafficLightState.java`
#### Snippet
```java
package org.eclipse.mosaic.fed.sumo.bridge.traci.constants;

public class CommandChangeTrafficLightState {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `CommandRetrieveRouteValue` has only 'static' members, and lacks a 'private' constructor
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandRetrieveRouteValue.java`
#### Snippet
```java
package org.eclipse.mosaic.fed.sumo.bridge.traci.constants;

public class CommandRetrieveRouteValue {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `CommandRetrieveTrafficLightValue` has only 'static' members, and lacks a 'private' constructor
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandRetrieveTrafficLightValue.java`
#### Snippet
```java
package org.eclipse.mosaic.fed.sumo.bridge.traci.constants;

public class CommandRetrieveTrafficLightValue {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `CommandRetrieveLaneAreaState` has only 'static' members, and lacks a 'private' constructor
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandRetrieveLaneAreaState.java`
#### Snippet
```java
package org.eclipse.mosaic.fed.sumo.bridge.traci.constants;

public class CommandRetrieveLaneAreaState {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `CommandRetrieveVehicleState` has only 'static' members, and lacks a 'private' constructor
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandRetrieveVehicleState.java`
#### Snippet
```java
package org.eclipse.mosaic.fed.sumo.bridge.traci.constants;

public class CommandRetrieveVehicleState {

    public final static int COMMAND = 0xa4;
```

### UtilityClassWithoutPrivateConstructor
Class `CommandRetrieveInductionLoopState` has only 'static' members, and lacks a 'private' constructor
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandRetrieveInductionLoopState.java`
#### Snippet
```java
package org.eclipse.mosaic.fed.sumo.bridge.traci.constants;

public class CommandRetrieveInductionLoopState {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `TraciDatatypes` has only 'static' members, and lacks a 'private' constructor
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/TraciDatatypes.java`
#### Snippet
```java
package org.eclipse.mosaic.fed.sumo.bridge.traci.constants;

public class TraciDatatypes {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `CommandRetrieveJunctionValue` has only 'static' members, and lacks a 'private' constructor
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandRetrieveJunctionValue.java`
#### Snippet
```java
package org.eclipse.mosaic.fed.sumo.bridge.traci.constants;

public class CommandRetrieveJunctionValue {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `CommandVariableSubscriptions` has only 'static' members, and lacks a 'private' constructor
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandVariableSubscriptions.java`
#### Snippet
```java
package org.eclipse.mosaic.fed.sumo.bridge.traci.constants;

public class CommandVariableSubscriptions {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `CommandSimulationControl` has only 'static' members, and lacks a 'private' constructor
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandSimulationControl.java`
#### Snippet
```java
package org.eclipse.mosaic.fed.sumo.bridge.traci.constants;

public class CommandSimulationControl {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `CommandRetrieveSimulationValue` has only 'static' members, and lacks a 'private' constructor
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandRetrieveSimulationValue.java`
#### Snippet
```java
package org.eclipse.mosaic.fed.sumo.bridge.traci.constants;

public class CommandRetrieveSimulationValue {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `CommandChangePoiState` has only 'static' members, and lacks a 'private' constructor
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandChangePoiState.java`
#### Snippet
```java
package org.eclipse.mosaic.fed.sumo.bridge.traci.constants;

public class CommandChangePoiState {

    public final static int COMMAND = 0xc7;
```

### UtilityClassWithoutPrivateConstructor
Class `CommandRetrieveLaneValue` has only 'static' members, and lacks a 'private' constructor
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandRetrieveLaneValue.java`
#### Snippet
```java
package org.eclipse.mosaic.fed.sumo.bridge.traci.constants;

public class CommandRetrieveLaneValue {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `CommandChangeRouteState` has only 'static' members, and lacks a 'private' constructor
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandChangeRouteState.java`
#### Snippet
```java
package org.eclipse.mosaic.fed.sumo.bridge.traci.constants;

public class CommandChangeRouteState {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `CommandChangeVehicleValue` has only 'static' members, and lacks a 'private' constructor
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/CommandChangeVehicleValue.java`
#### Snippet
```java
package org.eclipse.mosaic.fed.sumo.bridge.traci.constants;

public class CommandChangeVehicleValue {

    /**
```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `lib/mosaic-utils/src/main/java/org/eclipse/mosaic/lib/util/InteractionUtils.java`
#### Snippet
```java
                        continue;
                    }
                    boolean isValidPackage = info.getName().startsWith("org.eclipse.mosaic");;
                    for (String allowedPackageName: allowedPackages) {
                        isValidPackage |= info.getName().startsWith(allowedPackageName);
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Argument `dac.getAdhocChannelId()` might be null
in `lib/mosaic-network/src/main/java/org/eclipse/mosaic/lib/coupling/ClientServerChannel.java`
#### Snippet
```java
        writeCommand(CMD.MSG_SEND);
        SendMessageMessage.Builder sendMess = SendMessageMessage.newBuilder();  //Add message details to the builder
        sendMess.setTime(time).setNodeId(srcNodeId).setChannelId(translateChannel(dac.getAdhocChannelId())).setMessageId(msgId).setLength(msgLength);

        ByteBuffer buffer = ByteBuffer.allocate(Long.SIZE);
```

### DataFlowIssue
Method invocation `getTime` may produce `NullPointerException`
in `lib/mosaic-utils/src/main/java/org/eclipse/mosaic/lib/util/scheduling/DefaultEventScheduler.java`
#### Snippet
```java
            throw new IllegalStateException("No event in the queue.");
        }
        return eventQueue.peek().getTime();
    }

```

### DataFlowIssue
Method invocation `getNice` may produce `NullPointerException`
in `lib/mosaic-utils/src/main/java/org/eclipse/mosaic/lib/util/scheduling/MultiThreadedEventScheduler.java`
#### Snippet
```java
            throw new IllegalStateException("No event in the queue.");
        }
        return eventQueue.peek().getNice();
    }

```

### DataFlowIssue
Method invocation `getWay` may produce `NullPointerException`
in `lib/mosaic-routing/src/main/java/org/eclipse/mosaic/lib/routing/database/LazyLoadingWay.java`
#### Snippet
```java
    public double getMaxSpeedInMs() {
        if (scenarioDatabaseWay == null) {
            scenarioDatabaseWay = database.getWay(getId());
        }
        return scenarioDatabaseWay != null ? scenarioDatabaseWay.getMaxSpeedInMs() : currentWay.getMaxSpeedInMs();
```

### DataFlowIssue
Method invocation `getMaxSpeedInMs` may produce `NullPointerException`
in `lib/mosaic-routing/src/main/java/org/eclipse/mosaic/lib/routing/database/LazyLoadingWay.java`
#### Snippet
```java
            scenarioDatabaseWay = database.getWay(getId());
        }
        return scenarioDatabaseWay != null ? scenarioDatabaseWay.getMaxSpeedInMs() : currentWay.getMaxSpeedInMs();
    }

```

### DataFlowIssue
Method invocation `getId` may produce `NullPointerException`
in `lib/mosaic-routing/src/main/java/org/eclipse/mosaic/lib/routing/database/LazyLoadingWay.java`
#### Snippet
```java
    @Override
    public String getId() {
        return scenarioDatabaseWay != null ? scenarioDatabaseWay.getId() : currentWay.getId();
    }

```

### DataFlowIssue
Method invocation `getType` may produce `NullPointerException`
in `lib/mosaic-routing/src/main/java/org/eclipse/mosaic/lib/routing/database/LazyLoadingWay.java`
#### Snippet
```java
    @Override
    public String getType() {
        if (scenarioDatabaseWay == null && currentWay.getType() == null) {
            scenarioDatabaseWay = database.getWay(getId());
        }
```

### DataFlowIssue
Method invocation `getWay` may produce `NullPointerException`
in `lib/mosaic-routing/src/main/java/org/eclipse/mosaic/lib/routing/database/LazyLoadingWay.java`
#### Snippet
```java
    public String getType() {
        if (scenarioDatabaseWay == null && currentWay.getType() == null) {
            scenarioDatabaseWay = database.getWay(getId());
        }
        return scenarioDatabaseWay != null ? scenarioDatabaseWay.getType() : currentWay.getType();
```

### DataFlowIssue
Method invocation `getNode` may produce `NullPointerException`
in `lib/mosaic-routing/src/main/java/org/eclipse/mosaic/lib/routing/database/LazyLoadingConnection.java`
#### Snippet
```java

    private Connection getConnectionBetweenNodes(INode from, INode to) {
        final Node fromNode = database.getNode(from.getId());
        final Collection<Connection> fromNodeConnections = fromNode.getOutgoingConnections().isEmpty() ? fromNode.getPartOfConnections() : fromNode.getOutgoingConnections();

```

### DataFlowIssue
Method invocation `getRequestedTime` may produce `NullPointerException`
in `rti/mosaic-rti-core/src/main/java/org/eclipse/mosaic/rti/time/MultiThreadedTimeManagement.java`
#### Snippet
```java
            if (this.events.peek() != null
                    && priority == this.events.peek().getPriority()
                    && event.getRequestedTime() + event.getLookahead() >= this.events.peek().getRequestedTime()
            ) {
                try {
```

### DataFlowIssue
Method invocation `getRequestedTime` may produce `NullPointerException`
in `rti/mosaic-rti-core/src/main/java/org/eclipse/mosaic/rti/time/MultiThreadedTimeManagement.java`
#### Snippet
```java
                while (this.events.peek() != null
                        && priority == this.events.peek().getPriority()
                        && scheduledEvents.getMaximumValidTime() >= this.events.peek().getRequestedTime()
                ) {
                    synchronized (events) {
```

### DataFlowIssue
Method invocation `getFederateId` may produce `NullPointerException`
in `rti/mosaic-rti-core/src/main/java/org/eclipse/mosaic/rti/time/MultiThreadedTimeManagement.java`
#### Snippet
```java
                        event = this.events.poll();
                    }
                    this.logger.trace("Parallel execution: {} time={} lookahead={}", event.getFederateId(), event.getRequestedTime(), event.getLookahead());
                    federation.getMonitor().onScheduling(id, event);
                    this.scheduledEvents.addEvent(event);
```

### DataFlowIssue
Dereference of `plateau.targetRev.parent` may produce `NullPointerException`
in `lib/mosaic-routing/src/main/java/org/eclipse/mosaic/lib/routing/graphhopper/algorithm/AbstractCamvitChoiceRouting.java`
#### Snippet
```java

            // the local optimality = weight of plateau / weight of optimal path
            plateau.localOptimality = (plateau.startRev.weight - plateau.targetRev.parent.weight) / optimalWeight;

            // if plateau consists of only one edge or is not locally optimal,
```

### DataFlowIssue
Argument `methodName` might be null
in `fed/mosaic-output/src/main/java/org/eclipse/mosaic/fed/output/generator/file/format/MethodManager.java`
#### Snippet
```java
            int objLevel = objLevels.get(iterationMethodIndex);

            MethodElement me = new MethodElement(objLevel, declare, methodName);

            this.iterationMethods.add(me);
```

### DataFlowIssue
Method invocation `getRoadPosition` may produce `NullPointerException`
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/navigation/NavigationModule.java`
#### Snippet
```java
    @VisibleForTesting
    boolean onRouteQuery(VehicleRoute route) {
        return route.getConnectionIds().contains(this.getVehicleData().getRoadPosition().getConnectionId());
    }

```

### DataFlowIssue
Method invocation `getTime` may produce `NullPointerException`
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/navigation/NavigationModule.java`
#### Snippet
```java
        if (newRoadPosition != null) {
            setVehicleData(
                    new VehicleData.Builder(getVehicleData().getTime(), getVehicleData().getName())
                            .copyFrom(getVehicleData())
                            .road(newRoadPosition).create()
```

### DataFlowIssue
Method invocation `isStopped` may produce `NullPointerException`
in `app/tutorials/example-applications/src/main/java/org/eclipse/mosaic/app/examples/commuter/SimpleCommuterApp.java`
#### Snippet
```java
        }

        if (!returnTripPlanned && getOs().getVehicleData().isStopped()) {
            stopWatch.stop(getLog());
            double distanceToTarget = getOs().getPosition().distanceTo(getOs().getNavigationModule().getTargetPosition());
```

### DataFlowIssue
Method invocation `getDistanceDriven` may produce `NullPointerException`
in `app/tutorials/example-applications/src/main/java/org/eclipse/mosaic/app/examples/commuter/SimpleCommuterApp.java`
#### Snippet
```java
        public double stop(UnitLogger logger) {
            double timeInS = ((double) (os.getSimulationTime() - startTime)) / TIME.SECOND;
            logger.info("Trip finished. Duration: {} s, Distance driven: {}", timeInS, os.getVehicleData().getDistanceDriven());
            return timeInS;
        }
```

### DataFlowIssue
Method invocation `getSpeed` may produce `NullPointerException`
in `app/tutorials/example-applications/src/main/java/org/eclipse/mosaic/app/tutorial/configurableapp/VehicleConfigurationApp.java`
#### Snippet
```java
        if (this.config.fooInteger != null) {
            int wantedSpeed = this.config.fooInteger;
            if (getOs().getVehicleData().getSpeed() > wantedSpeed) {
                getLog().info("The current speed equals {}m/s will be slowed down to the wanted speed equals {}m/s",
                        getOs().getVehicleData().getSpeed(), wantedSpeed);
```

### DataFlowIssue
Method invocation `getSpeed` may produce `NullPointerException`
in `app/tutorials/example-applications/src/main/java/org/eclipse/mosaic/app/examples/emergencybrake/EmergencyBrakeApp.java`
#### Snippet
```java
    private void detectEmergencyBrake() {

        float curSpeed = (float) getOs().getNavigationModule().getVehicleData().getSpeed();

        // Calculate brake deceleration
```

### DataFlowIssue
Method invocation `getSpeed` may produce `NullPointerException`
in `app/tutorials/example-applications/src/main/java/org/eclipse/mosaic/app/examples/emergencybrake/EmergencyBrakeApp.java`
#### Snippet
```java

    private boolean reachedSpeed(double speed) {
        return Math.abs(getOs().getVehicleData().getSpeed() - speed) < 0.1d;
    }

```

## RuleId[id=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
Can be replaced with 'String.join'
in `lib/mosaic-utils/src/main/java/org/eclipse/mosaic/lib/util/JsonUtils.java`
#### Snippet
```java

        newLines.add(rc);
        return newLines.stream().collect(Collectors.joining());
    }

```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `lib/mosaic-utils/src/main/java/org/eclipse/mosaic/lib/util/cli/CommandLineParser.java`
#### Snippet
```java
            }
        }
        optionGroups.values().stream().forEach(options::addOptionGroup);
    }

```

## RuleId[id=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
Unnecessary string length argument
in `lib/mosaic-utils/src/main/java/org/eclipse/mosaic/lib/util/JsonUtils.java`
#### Snippet
```java
        while (matcher.find()) {
            lc = jsonString.substring(0, matcher.start());
            rc = jsonString.substring(matcher.end(), jsonString.length());
            tmp = jsonString.substring(matcher.start(), matcher.end());

```

### StringOperationCanBeSimplified
Call to `substring()` is redundant
in `lib/mosaic-utils/src/main/java/org/eclipse/mosaic/lib/util/objects/ObjectInstantiation.java`
#### Snippet
```java
        boolean containsLineseperator = json.contains("\n");
        return new StringBuilder()
                .append(json.substring(0, maxLength - 100))
                .append(containsLineseperator ? NEWLINE : "")
                .append(" ... ")
```

### StringOperationCanBeSimplified
`toLowerCase()` call can be replaced with 'equalsIgnoreCase()'
in `lib/mosaic-utils/src/main/java/org/eclipse/mosaic/lib/util/FileUtils.java`
#### Snippet
```java
    public static Collection<File> searchForFilesWithName(Collection<File> rootFiles, String fileName) {
        return searchForFiles(rootFiles, f ->
                f.canRead() && (f.isDirectory() || (f.isFile() && f.getName().toLowerCase().equals(fileName.toLowerCase())))
        );
    }
```

## RuleId[id=MethodOverloadsParentMethod]
### MethodOverloadsParentMethod
Method `transpose()` overloads a compatible method of a superclass, when overriding might have been intended
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/spatial/TransformationMatrix.java`
#### Snippet
```java
    }

    public TransformationMatrix transpose(TransformationMatrix result) {
        return (TransformationMatrix) super.transpose(result);
    }
```

### MethodOverloadsParentMethod
Method `add()` overloads a compatible method of a superclass, when overriding might have been intended
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/spatial/TransformationMatrix.java`
#### Snippet
```java
    }

    public TransformationMatrix add(Matrix4d mat, TransformationMatrix result) {
        return (TransformationMatrix) super.add(mat, result);
    }
```

### MethodOverloadsParentMethod
Method `multiply()` overloads a compatible method of a superclass, when overriding might have been intended
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/spatial/TransformationMatrix.java`
#### Snippet
```java
    }

    public TransformationMatrix multiply(Matrix4d mat, TransformationMatrix result) {
        return (TransformationMatrix) super.multiply(mat, result);
    }
```

### MethodOverloadsParentMethod
Method `subtract()` overloads a compatible method of a superclass, when overriding might have been intended
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/spatial/TransformationMatrix.java`
#### Snippet
```java
    }

    public TransformationMatrix subtract(Matrix4d mat, TransformationMatrix result) {
        return (TransformationMatrix) super.subtract(mat, result);
    }
```

### MethodOverloadsParentMethod
Method `multiply()` overloads a compatible method of a superclass, when overriding might have been intended
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/spatial/RotationMatrix.java`
#### Snippet
```java
    }

    public RotationMatrix multiply(Matrix3d mat, RotationMatrix result) {
        return (RotationMatrix) super.multiply(mat, result);
    }
```

### MethodOverloadsParentMethod
Method `subtract()` overloads a compatible method of a superclass, when overriding might have been intended
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/spatial/RotationMatrix.java`
#### Snippet
```java
    }

    public RotationMatrix subtract(Matrix3d mat, RotationMatrix result) {
        return (RotationMatrix) super.subtract(mat, result);
    }
```

### MethodOverloadsParentMethod
Method `add()` overloads a compatible method of a superclass, when overriding might have been intended
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/spatial/RotationMatrix.java`
#### Snippet
```java
    }

    public RotationMatrix add(Matrix3d mat, RotationMatrix result) {
        return (RotationMatrix) super.add(mat, result);
    }
```

### MethodOverloadsParentMethod
Method `transpose()` overloads a compatible method of a superclass, when overriding might have been intended
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/spatial/RotationMatrix.java`
#### Snippet
```java
    }

    public RotationMatrix transpose(RotationMatrix result) {
        return (RotationMatrix) super.transpose(result);
    }
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'WALL' is still used
in `lib/mosaic-database/src/main/java/org/eclipse/mosaic/lib/database/persistence/TABLES.java`
#### Snippet
```java
     */
    @Deprecated
    static String WALL = "Wall";


```

### DeprecatedIsStillUsed
Deprecated member 'CORNER' is still used
in `lib/mosaic-database/src/main/java/org/eclipse/mosaic/lib/database/persistence/TABLES.java`
#### Snippet
```java
     */
    @Deprecated
    static String CORNER = "Corner";
    /**
     * Will no longer be written to, but used to update old versions of databases.
```

### DeprecatedIsStillUsed
Deprecated member 'addRoute' is still used
in `lib/mosaic-database/src/main/java/org/eclipse/mosaic/lib/database/Database.java`
#### Snippet
```java
         * @deprecated use addRoute instead
         */
        public void addRoute(Route route) {
            database.routes.put(route.getId(), route);
        }
```

### DeprecatedIsStillUsed
Deprecated member 'addWay' is still used
in `lib/mosaic-database/src/main/java/org/eclipse/mosaic/lib/database/Database.java`
#### Snippet
```java
         * @deprecated use {@link #addWay(String, String, String)} instead
         */
        public Builder addWay(Way way) {
            database.ways.put(way.getId(), way);

```

### DeprecatedIsStillUsed
Deprecated member 'Wgs84Projection' is still used
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/transform/Wgs84Projection.java`
#### Snippet
```java
     * @deprecated Legacy constructor.
     */
    public Wgs84Projection(GeoPoint playgroundCenter, CartesianPoint cartesianOffset) {
        final UtmZone zone = UtmZone.from(playgroundCenter);
        this.utmOrigin = new MutableUtmPoint(
```

## RuleId[id=NonSerializableFieldInSerializableClass]
### NonSerializableFieldInSerializableClass
Non-serializable field 'node' in a Serializable class
in `lib/mosaic-database/src/main/java/org/eclipse/mosaic/lib/database/spatial/NodeFinder.java`
#### Snippet
```java
    private final static class NodeWrapper extends Vector3d {

        private final Node node;

        private NodeWrapper(Node node) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'edge' in a Serializable class
in `lib/mosaic-database/src/main/java/org/eclipse/mosaic/lib/database/spatial/EdgeFinder.java`
#### Snippet
```java
    private final static class EdgeWrapper extends org.eclipse.mosaic.lib.spatial.Edge<Vector3d> {

        private final Edge edge;

        public EdgeWrapper(Edge edge) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'value' in a Serializable class
in `lib/mosaic-objects/src/main/java/org/eclipse/mosaic/lib/objects/vehicle/VehicleParameter.java`
#### Snippet
```java
    private final VehicleParameterType parameterType;

    private final Object value;

    public VehicleParameter(@Nonnull final VehicleParameterType parameterType, @Nonnull final Object value) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'additionalData' in a Serializable class
in `lib/mosaic-objects/src/main/java/org/eclipse/mosaic/lib/objects/vehicle/VehicleData.java`
#### Snippet
```java
     */
    @JsonAdapter(PolymorphismTypeAdapterFactory.class)
    private final Object additionalData;

    /**
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'regionConfig' in a Serializable class
in `fed/mosaic-cell/src/main/java/org/eclipse/mosaic/fed/cell/data/ConfigurationData.java`
#### Snippet
```java
    private CCell cellAmbassadorConfig;
    private CNetwork networkConfig;
    private CRegion regionConfig;

    /**
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'networkConfig' in a Serializable class
in `fed/mosaic-cell/src/main/java/org/eclipse/mosaic/fed/cell/data/ConfigurationData.java`
#### Snippet
```java

    private CCell cellAmbassadorConfig;
    private CNetwork networkConfig;
    private CRegion regionConfig;

```

### NonSerializableFieldInSerializableClass
Non-serializable field 'cellAmbassadorConfig' in a Serializable class
in `fed/mosaic-cell/src/main/java/org/eclipse/mosaic/fed/cell/data/ConfigurationData.java`
#### Snippet
```java
    INSTANCE;

    private CCell cellAmbassadorConfig;
    private CNetwork networkConfig;
    private CRegion regionConfig;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'areaRegion' in a Serializable class
in `fed/mosaic-cell/src/main/java/org/eclipse/mosaic/fed/cell/utility/RegionsIndex.java`
#### Snippet
```java

        @SuppressWarnings(value = "SE_BAD_FIELD", justification = "That's fine, we do not serialize this class.")
        private final CMobileNetworkProperties areaRegion;

        private MobileNetworkPropertiesWrapper(CMobileNetworkProperties region) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'vehicleTree' in a Serializable class
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/simulation/perception/index/providers/VehicleTree.java`
#### Snippet
```java
     * The Quad-Tree to be used for spatial search of {@link VehicleObject}s.
     */
    private QuadTree<VehicleObject> vehicleTree;

    /**
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'vehicleGrid' in a Serializable class
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/simulation/perception/index/providers/VehicleGrid.java`
#### Snippet
```java
     * The Grid to be used for spatial search of {@link VehicleObject}s.
     */
    private Grid<VehicleObject> vehicleGrid;

    /**
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'status' in a Serializable class
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/CommandException.java`
#### Snippet
```java
public class CommandException extends Exception {

    private final Status status;

    public CommandException(String errorMessage) {
```

## RuleId[id=MismatchedJavadocCode]
### MismatchedJavadocCode
Method is specified to return list but the return type is map
in `fed/mosaic-sns/src/main/java/org/eclipse/mosaic/fed/sns/model/SophisticatedAdhocTransmissionModel.java`
#### Snippet
```java
     * @param transmissionParameter Data class holding the maximumTtl, the {@link Delay} and the current map of simulated entities
     * @param currentNodes          a reference to all currently online nodes
     * @return List of the transmission results.
     */
    private Map<String, TransmissionResult> flooding(
```

### MismatchedJavadocCode
Method is specified to return list but the return type is map
in `lib/mosaic-routing/src/main/java/org/eclipse/mosaic/lib/routing/database/RouteManager.java`
#### Snippet
```java
     * in the database in a message friendly way.
     *
     * @return List of all known routes.
     */
    public final Map<String, VehicleRoute> getRoutesFromDatabaseForMessage() {
```

## RuleId[id=AssignmentToForLoopParameter]
### AssignmentToForLoopParameter
Assignment to for-loop parameter `begin`
in `fed/mosaic-output/src/main/java/org/eclipse/mosaic/fed/output/generator/file/format/MethodElement.java`
#### Snippet
```java
            if (end == -1) {
                methodName = methods.substring(begin);
                begin = end;
            } else {
                methodName = methods.substring(begin, end);
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `begin`
in `fed/mosaic-output/src/main/java/org/eclipse/mosaic/fed/output/generator/file/format/MethodElement.java`
#### Snippet
```java
            } else {
                methodName = methods.substring(begin, end);
                begin = end + 1;
                end = methods.indexOf(".", begin);
            }
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `end`
in `fed/mosaic-output/src/main/java/org/eclipse/mosaic/fed/output/generator/file/format/MethodElement.java`
#### Snippet
```java
                methodName = methods.substring(begin, end);
                begin = end + 1;
                end = methods.indexOf(".", begin);
            }

```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `lib/mosaic-network/src/main/java/org/eclipse/mosaic/lib/coupling/ClientServerChannel.java`
#### Snippet
```java
                return ClientServerChannelProtos.RadioChannel.PROTO_SCH6;
            default:
                throw new RuntimeException("Channel " + channel.toString() + " does not exist in MOSAIC");
        }
    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `lib/mosaic-network/src/main/java/org/eclipse/mosaic/lib/coupling/AbstractNetworkAmbassador.java`
#### Snippet
```java
            this.log.info("Connected to {} for reading on port {}", federateName, port);
        } catch (UnknownHostException ex) {
            this.log.error("Unknown host: " + ex.toString());
            throw new RuntimeException(ex);
        } catch (IOException ex) {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `lib/mosaic-network/src/main/java/org/eclipse/mosaic/lib/coupling/AbstractNetworkAmbassador.java`
#### Snippet
```java
                    "This V2XMessage requires a destination type ({}) currently not supported by this network simulator."
                            + " Skip this message. Sender={}, Receiver={}, V2XMessage.id={}, time={}",
                    dac.getType().toString(),
                    sac.getSourceName(),
                    dac.getAddress().toString(),
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `lib/mosaic-network/src/main/java/org/eclipse/mosaic/lib/coupling/AbstractNetworkAmbassador.java`
#### Snippet
```java
                    dac.getType().toString(),
                    sac.getSourceName(),
                    dac.getAddress().toString(),
                    interaction.getMessage().getId(),
                    TIME.format(interaction.getTime())
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `rti/mosaic-starter/src/main/java/org/eclipse/mosaic/starter/MosaicSimulation.java`
#### Snippet
```java
    protected void printMosaicVersion() {
        LoggerFactory.getLogger(Logger.ROOT_LOGGER_NAME).info("Running Eclipse MOSAIC {} on Java JRE v{} ({})",
                MosaicVersion.get().toString(),
                System.getProperty("java.version"),
                System.getProperty("java.vendor")
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `rti/mosaic-starter/src/main/java/org/eclipse/mosaic/starter/MosaicStarter.java`
#### Snippet
```java

    protected void printVersionAndCopyrightInfo() {
        System.out.println("Eclipse MOSAIC [Version " + MosaicVersion.get().toString() + "]");
        System.out.println("Copyright (c) 2022 Fraunhofer FOKUS and others. All rights reserved.");
        System.out.println("License EPL-2.0: Eclipse Public License Version 2 [https://eclipse.org/legal/epl-v20.html].");
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `rti/mosaic-rti-core/src/main/java/org/eclipse/mosaic/rti/federation/LocalFederationManagement.java`
#### Snippet
```java
                removeDirectory(file);
            } else if (!file.delete()) {
                this.log.error("Error while deleting file: {}", file.toString());
            }
        }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `rti/mosaic-rti-core/src/main/java/org/eclipse/mosaic/rti/federation/LocalFederationManagement.java`
#### Snippet
```java
            log.debug("Destination directory does not exist, try to create it.");
            if (!hostDeployDir.mkdirs()) {
                log.warn("Could not create directory {}", hostDeployDir.toString());
            }
        }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `rti/mosaic-rti-core/src/main/java/org/eclipse/mosaic/rti/federation/LocalFederationManagement.java`
#### Snippet
```java
                removeDirectory(fedDeployDir);
                if (!fedDeployDir.mkdirs()) {
                    log.warn("Could not create directory {}", fedDeployDir.toString());
                }
            }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `fed/mosaic-cell/src/main/java/org/eclipse/mosaic/fed/cell/config/model/CMobileNetworkProperties.java`
#### Snippet
```java
    @Override
    public String toString() {
        return super.toString() + ", " + ((polygon != null) ? "polygon: " + polygon.toString() : "area: " + area.toString());
    }
}
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `fed/mosaic-cell/src/main/java/org/eclipse/mosaic/fed/cell/utility/DelayUtility.java`
#### Snippet
```java
        if (log.isDebugEnabled()) {
            log.debug("Calculated {}-delay for message in region \"{}\": {} ns (not considering retransmission and maximum node bandwidth)",
                    mode.toString(), region.id, delayValueInNs);
        }
        return delayValueInNs;
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/ErrorRegister.java`
#### Snippet
```java
        }
        sb.append(hexString);
        return "Error code: 0x" + sb.toString() + ": " + description;
    }
}
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/util/ClassNameParser.java`
#### Snippet
```java
            final Class<?> clazz = Class.forName(fullQualifiedClassName, true, urlClassLoader);
            if (!assignableCheckClass.isAssignableFrom(clazz)) {
                logger.error(ErrorRegister.SIMULATION_UNIT_IsNotAssignableFrom.toString() + " : " + className);
                throw new RuntimeException(ErrorRegister.SIMULATION_UNIT_IsNotAssignableFrom.toString());
            }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/util/SumoVehicleTypesWriter.java`
#### Snippet
```java
            StreamResult result = new StreamResult(file);
            transformer.transform(source, result);
            log.info("{} file successfully written.", file.toString());
        } catch (TransformerException e) {
            log.debug("Couldn't write additional-file.");
```

## RuleId[id=SetReplaceableByEnumSet]
### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/simulation/AbstractSimulationUnit.java`
#### Snippet
```java
    public final void cleanPastEnvironmentEvents() {
        // first, create a set to collect all sensor types, which should be deleted.
        Set<SensorType> toRemove = new HashSet<>();

        for (Entry<SensorType, EnvironmentEvent> entrySet : environmentEvents.entrySet()) {
```

## RuleId[id=SwitchStatementWithConfusingDeclaration]
### SwitchStatementWithConfusingDeclaration
Local variable `pos` declared in one 'switch' branch and used in another
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/reader/TypeBasedTraciReader.java`
#### Snippet
```java
                return readFloat(in);
            case TraciDatatypes.POSITION2D:
                Position pos = position2dReader.read(in, totalBytesLeft - numBytesRead);
                numBytesRead += position2dReader.getNumberOfBytesRead();
                return pos;
```

### SwitchStatementWithConfusingDeclaration
Local variable `laneId` declared in one 'switch' branch and used in another
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/ambassador/AbstractSumoAmbassador.java`
#### Snippet
```java
                    break;
                case TO_LEFT:
                    int laneId = vehicleLaneChange.getCurrentLaneId();
                    targetLaneId = laneId + 1;
                    break;
```

## RuleId[id=NestedSynchronizedStatement]
### NestedSynchronizedStatement
Nested `synchronized` statement
in `rti/mosaic-rti-core/src/main/java/org/eclipse/mosaic/rti/time/ThreadPool.java`
#### Snippet
```java
                        }
                    }
                    synchronized (queue.isEmptyMutex) {
                        ev = queue.getNextScheduledEvent();
                        activeCount++;
```

## RuleId[id=PublicFieldAccessedInSynchronizedContext]
### PublicFieldAccessedInSynchronizedContext
Non-private field `ambassadorFederateChannel` accessed in synchronized context
in `lib/mosaic-network/src/main/java/org/eclipse/mosaic/lib/coupling/AbstractNetworkAmbassador.java`
#### Snippet
```java
                nodesToAdd.add(new NodeDataContainer(id, virtualNode.position));  // Add TL to the list
                // Let channel send list and get an acknowledgement
                if (CMD.SUCCESS != ambassadorFederateChannel.writeAddRsuNodeMessage(time, nodesToAdd)) {
                    this.log.error("Could not add new RSU: {}", this.federateAmbassadorChannel.getLastStatusMessage());
                    throw new InternalFederateException(
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `this.federateAmbassadorChannel` accessed in synchronized context
in `lib/mosaic-network/src/main/java/org/eclipse/mosaic/lib/coupling/AbstractNetworkAmbassador.java`
#### Snippet
```java
                // Let channel send list and get an acknowledgement
                if (CMD.SUCCESS != ambassadorFederateChannel.writeAddRsuNodeMessage(time, nodesToAdd)) {
                    this.log.error("Could not add new RSU: {}", this.federateAmbassadorChannel.getLastStatusMessage());
                    throw new InternalFederateException(
                            "Error in " + this.federateName + ": " + this.federateAmbassadorChannel.getLastStatusMessage()
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `this.federateAmbassadorChannel` accessed in synchronized context
in `lib/mosaic-network/src/main/java/org/eclipse/mosaic/lib/coupling/AbstractNetworkAmbassador.java`
#### Snippet
```java
                    this.log.error("Could not add new RSU: {}", this.federateAmbassadorChannel.getLastStatusMessage());
                    throw new InternalFederateException(
                            "Error in " + this.federateName + ": " + this.federateAmbassadorChannel.getLastStatusMessage()
                    );
                }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `config` accessed in synchronized context
in `lib/mosaic-network/src/main/java/org/eclipse/mosaic/lib/coupling/AbstractNetworkAmbassador.java`
#### Snippet
```java
        final DestinationAddressContainer dac = interaction.getMessage().getRouting().getDestination();

        if (!config.isRoutingTypeSupported(dac.getType())) {
            log.warn(
                    "This V2XMessage requires a destination type ({}) currently not supported by this network simulator."
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `config` accessed in synchronized context
in `lib/mosaic-network/src/main/java/org/eclipse/mosaic/lib/coupling/AbstractNetworkAmbassador.java`
#### Snippet
```java
            return;
        }
        if (!config.isAddressTypeSupported(dac.getAddress())) {
            log.warn(
                    "This V2XMessage requires a routing scheme currently not supported by this network simulator."
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `config` accessed in synchronized context
in `lib/mosaic-network/src/main/java/org/eclipse/mosaic/lib/coupling/AbstractNetworkAmbassador.java`
#### Snippet
```java
            return;
        }
        if (!config.isProtocolSupported(dac.getProtocolType())) {
            log.warn(
                    "This V2XMessage requires a transport protocol ({})"
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `ambassadorFederateChannel` accessed in synchronized context
in `lib/mosaic-network/src/main/java/org/eclipse/mosaic/lib/coupling/AbstractNetworkAmbassador.java`
#### Snippet
```java
            // Write the message onto the channel and to the federate
            // Then wait for ack
            int ack = ambassadorFederateChannel.writeSendMessage(
                    interaction.getTime(),
                    sourceId,
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `this.federateAmbassadorChannel` accessed in synchronized context
in `lib/mosaic-network/src/main/java/org/eclipse/mosaic/lib/coupling/AbstractNetworkAmbassador.java`
#### Snippet
```java
                this.log.error(
                        "Could not insert V2X message into network: {}",
                        this.federateAmbassadorChannel.getLastStatusMessage()
                );
                throw new InternalFederateException(
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `this.federateAmbassadorChannel` accessed in synchronized context
in `lib/mosaic-network/src/main/java/org/eclipse/mosaic/lib/coupling/AbstractNetworkAmbassador.java`
#### Snippet
```java
                );
                throw new InternalFederateException(
                        "Error in " + this.federateName + this.federateAmbassadorChannel.getLastStatusMessage()
                );
            }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `this.ambassadorFederateChannel` accessed in synchronized context
in `lib/mosaic-network/src/main/java/org/eclipse/mosaic/lib/coupling/AbstractNetworkAmbassador.java`
#### Snippet
```java
                }
                // actually write the data to the federate
                if (CMD.SUCCESS != this.ambassadorFederateChannel.writeConfigMessage(time, interactionId, externalId, configuration)) {
                    LoggerFactory.getLogger(this.getClass()).error(
                            "Could not configure node {}s radio: " + this.federateAmbassadorChannel.getLastStatusMessage(),
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `this.federateAmbassadorChannel` accessed in synchronized context
in `lib/mosaic-network/src/main/java/org/eclipse/mosaic/lib/coupling/AbstractNetworkAmbassador.java`
#### Snippet
```java
                if (CMD.SUCCESS != this.ambassadorFederateChannel.writeConfigMessage(time, interactionId, externalId, configuration)) {
                    LoggerFactory.getLogger(this.getClass()).error(
                            "Could not configure node {}s radio: " + this.federateAmbassadorChannel.getLastStatusMessage(),
                            configuration.getNodeId()
                    );
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `this.federateAmbassadorChannel` accessed in synchronized context
in `lib/mosaic-network/src/main/java/org/eclipse/mosaic/lib/coupling/AbstractNetworkAmbassador.java`
#### Snippet
```java
                    );
                    throw new InternalFederateException(
                            "Error in " + this.federateName + this.federateAmbassadorChannel.getLastStatusMessage()
                    );
                }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `ambassadorFederateChannel` accessed in synchronized context
in `lib/mosaic-network/src/main/java/org/eclipse/mosaic/lib/coupling/AbstractNetworkAmbassador.java`
#### Snippet
```java
                int id = simulatedNodes.toExternalId(nodeId);
                nodesToAdd.add(new NodeDataContainer(id, registeredNode.position));
                if (CMD.SUCCESS != ambassadorFederateChannel.writeAddNodeMessage(time, nodesToAdd)) {
                    this.log.error("Could not add new vehicles: {}", this.federateAmbassadorChannel.getLastStatusMessage());
                    throw new InternalFederateException(
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `this.federateAmbassadorChannel` accessed in synchronized context
in `lib/mosaic-network/src/main/java/org/eclipse/mosaic/lib/coupling/AbstractNetworkAmbassador.java`
#### Snippet
```java
                nodesToAdd.add(new NodeDataContainer(id, registeredNode.position));
                if (CMD.SUCCESS != ambassadorFederateChannel.writeAddNodeMessage(time, nodesToAdd)) {
                    this.log.error("Could not add new vehicles: {}", this.federateAmbassadorChannel.getLastStatusMessage());
                    throw new InternalFederateException(
                            "Error in " + this.federateName + ": " + this.federateAmbassadorChannel.getLastStatusMessage()
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `this.federateAmbassadorChannel` accessed in synchronized context
in `lib/mosaic-network/src/main/java/org/eclipse/mosaic/lib/coupling/AbstractNetworkAmbassador.java`
#### Snippet
```java
                    this.log.error("Could not add new vehicles: {}", this.federateAmbassadorChannel.getLastStatusMessage());
                    throw new InternalFederateException(
                            "Error in " + this.federateName + ": " + this.federateAmbassadorChannel.getLastStatusMessage()
                    );
                }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `this.ambassadorFederateChannel` accessed in synchronized context
in `lib/mosaic-network/src/main/java/org/eclipse/mosaic/lib/coupling/AbstractNetworkAmbassador.java`
#### Snippet
```java
                    }
                }
                if (CMD.SUCCESS != this.ambassadorFederateChannel.writeUpdatePositionsMessage(time, nodesToUpdate)) {
                    LoggerFactory.getLogger(this.getClass()).error(
                            "Could not update nodes: " + this.federateAmbassadorChannel.getLastStatusMessage()
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `this.federateAmbassadorChannel` accessed in synchronized context
in `lib/mosaic-network/src/main/java/org/eclipse/mosaic/lib/coupling/AbstractNetworkAmbassador.java`
#### Snippet
```java
                if (CMD.SUCCESS != this.ambassadorFederateChannel.writeUpdatePositionsMessage(time, nodesToUpdate)) {
                    LoggerFactory.getLogger(this.getClass()).error(
                            "Could not update nodes: " + this.federateAmbassadorChannel.getLastStatusMessage()
                    );
                    throw new InternalFederateException("Could not update nodes: " + this.federateAmbassadorChannel.getLastStatusMessage());
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `this.federateAmbassadorChannel` accessed in synchronized context
in `lib/mosaic-network/src/main/java/org/eclipse/mosaic/lib/coupling/AbstractNetworkAmbassador.java`
#### Snippet
```java
                            "Could not update nodes: " + this.federateAmbassadorChannel.getLastStatusMessage()
                    );
                    throw new InternalFederateException("Could not update nodes: " + this.federateAmbassadorChannel.getLastStatusMessage());
                }
            }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `interactionQueue` accessed in synchronized context
in `rti/mosaic-rti-api/src/main/java/org/eclipse/mosaic/rti/api/AbstractFederateAmbassador.java`
#### Snippet
```java
    @Override
    public final synchronized void advanceTime(long time) throws InternalFederateException {
        Interaction nextInteraction = interactionQueue.getNextInteraction(time);
        while (nextInteraction != null) {
            rti.getMonitor().onProcessInteraction(getId(), nextInteraction);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `rti` accessed in synchronized context
in `rti/mosaic-rti-api/src/main/java/org/eclipse/mosaic/rti/api/AbstractFederateAmbassador.java`
#### Snippet
```java
        Interaction nextInteraction = interactionQueue.getNextInteraction(time);
        while (nextInteraction != null) {
            rti.getMonitor().onProcessInteraction(getId(), nextInteraction);
            processInteraction(nextInteraction);
            nextInteraction = interactionQueue.getNextInteraction(time);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `interactionQueue` accessed in synchronized context
in `rti/mosaic-rti-api/src/main/java/org/eclipse/mosaic/rti/api/AbstractFederateAmbassador.java`
#### Snippet
```java
            rti.getMonitor().onProcessInteraction(getId(), nextInteraction);
            processInteraction(nextInteraction);
            nextInteraction = interactionQueue.getNextInteraction(time);
        }
        processTimeAdvanceGrant(time);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `this.time` accessed in synchronized context
in `rti/mosaic-rti-core/src/main/java/org/eclipse/mosaic/rti/time/SequentialTimeManagement.java`
#### Snippet
```java
                // advance global time
                if (event == null || event.getRequestedTime() > getEndTime()) {
                    this.time = getEndTime();
                    break;
                } else {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `this.time` accessed in synchronized context
in `rti/mosaic-rti-core/src/main/java/org/eclipse/mosaic/rti/time/SequentialTimeManagement.java`
#### Snippet
```java
                    break;
                } else {
                    this.time = event.getRequestedTime();
                }
            }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `LANE_AREA_DETECTOR_SUBSCRIPTION` accessed in synchronized context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/ambassador/AbstractSumoAmbassador.java`
#### Snippet
```java
    private synchronized void receiveInteraction(LaneAreaDetectorSubscription laneAreaDetectorSubscription) throws InternalFederateException {
        log.info(
                LANE_AREA_DETECTOR_SUBSCRIPTION + " Subscribe to LaneArea with ID={}",
                laneAreaDetectorSubscription.getLaneAreaId()
        );
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `bridge` accessed in synchronized context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/ambassador/AbstractSumoAmbassador.java`
#### Snippet
```java
        );

        bridge.getSimulationControl().subscribeForLaneArea(
                laneAreaDetectorSubscription.getLaneAreaId(),
                laneAreaDetectorSubscription.getTime(),
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `VEHICLE_RESUME_REQ` accessed in synchronized context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/ambassador/AbstractSumoAmbassador.java`
#### Snippet
```java
        if (log.isInfoEnabled()) {
            log.info("{} at simulation time {}: " + "vehicleId=\"{}\"",
                    VEHICLE_RESUME_REQ, TIME.format(vehicleResume.getTime()), vehicleResume.getVehicleId());
        }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `bridge` accessed in synchronized context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/ambassador/AbstractSumoAmbassador.java`
#### Snippet
```java
        }

        bridge.getVehicleControl().resume(vehicleResume.getVehicleId());
    }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `VEHICLE_SIGHT_DISTANCE_REQ` accessed in synchronized context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/ambassador/AbstractSumoAmbassador.java`
#### Snippet
```java
    private synchronized void receiveInteraction(VehicleSightDistanceConfiguration vehicleSightDistanceConfiguration) throws InternalFederateException {
        log.info("{} at simulation time {}: vehicleId=\"{}\", range={}, angle={}",
                VEHICLE_SIGHT_DISTANCE_REQ,
                TIME.format(vehicleSightDistanceConfiguration.getTime()),
                vehicleSightDistanceConfiguration.getVehicleId(),
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `bridge` accessed in synchronized context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/ambassador/AbstractSumoAmbassador.java`
#### Snippet
```java
        );

        bridge.getSimulationControl().subscribeForVehiclesWithinFieldOfVision(
                vehicleSightDistanceConfiguration.getVehicleId(),
                vehicleSightDistanceConfiguration.getTime(), getEndTime(),
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `bridge` accessed in synchronized context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/ambassador/AbstractSumoAmbassador.java`
#### Snippet
```java
    private synchronized void receiveInteraction(SumoTraciRequest sumoTraciRequest) throws InternalFederateException {
        try {
            if (bridge instanceof TraciClientBridge) {
                log.info(
                        "{} at simulation time {}: " + "length=\"{}\", id=\"{}\" data={}",
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `SUMO_TRACI_BYTE_ARRAY_MESSAGE` accessed in synchronized context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/ambassador/AbstractSumoAmbassador.java`
#### Snippet
```java
                log.info(
                        "{} at simulation time {}: " + "length=\"{}\", id=\"{}\" data={}",
                        SUMO_TRACI_BYTE_ARRAY_MESSAGE,
                        TIME.format(sumoTraciRequest.getTime()),
                        sumoTraciRequest.getCommandLength(),
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `bridge` accessed in synchronized context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/ambassador/AbstractSumoAmbassador.java`
#### Snippet
```java

                SumoTraciResult sumoTraciResult =
                        ((TraciClientBridge) bridge).writeByteArrayMessage(sumoTraciRequest.getRequestId(), sumoTraciRequest.getCommand());
                rti.triggerInteraction(new SumoTraciResponse(sumoTraciRequest.getTime(), sumoTraciResult));
            } else {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `rti` accessed in synchronized context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/ambassador/AbstractSumoAmbassador.java`
#### Snippet
```java
                SumoTraciResult sumoTraciResult =
                        ((TraciClientBridge) bridge).writeByteArrayMessage(sumoTraciRequest.getRequestId(), sumoTraciRequest.getCommand());
                rti.triggerInteraction(new SumoTraciResponse(sumoTraciRequest.getTime(), sumoTraciResult));
            } else {
                log.warn("SumoTraciRequests are not supported.");
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `VEHICLE_STOP_REQ` accessed in synchronized context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/ambassador/AbstractSumoAmbassador.java`
#### Snippet
```java
                        "{} at simulation time {}: vehicleId=\"{}\", edgeId=\"{}\", position=\"{}\", laneIndex={}, duration={}, "
                                + "stopMode={}",
                        VEHICLE_STOP_REQ,
                        TIME.format(vehicleStop.getTime()),
                        vehicleStop.getVehicleId(),
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `TRAFFIC_LIGHT_SUBSCRIPTION` accessed in synchronized context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/ambassador/AbstractSumoAmbassador.java`
#### Snippet
```java
    private synchronized void receiveInteraction(TrafficLightSubscription trafficLightSubscription) throws InternalFederateException {
        log.info("{} at simulation time {}: Subscribe to Traffic light group with ID={}",
                TRAFFIC_LIGHT_SUBSCRIPTION, TIME.format(trafficLightSubscription.getTime()),
                trafficLightSubscription.getTrafficLightGroupId()
        );
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `bridge` accessed in synchronized context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/ambassador/AbstractSumoAmbassador.java`
#### Snippet
```java
        );

        bridge.getSimulationControl().subscribeForTrafficLight(
                trafficLightSubscription.getTrafficLightGroupId(),
                trafficLightSubscription.getTime(),
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `bridge` accessed in synchronized context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/ambassador/AbstractSumoAmbassador.java`
#### Snippet
```java
    private synchronized void receiveInteraction(VehicleRouteChange vehicleRouteChange) throws InternalFederateException {
        if (log.isInfoEnabled()) {
            VehicleData lastKnownVehicleData = bridge.getSimulationControl().getLastKnownVehicleData(vehicleRouteChange.getVehicleId());
            log.info(
                    "{} at simulation time {}: vehicleId=\"{}\", newRouteId={}, current edge: {}",
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `VEHICLE_ROUTE_CHANGE_REQ` accessed in synchronized context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/ambassador/AbstractSumoAmbassador.java`
#### Snippet
```java
            log.info(
                    "{} at simulation time {}: vehicleId=\"{}\", newRouteId={}, current edge: {}",
                    VEHICLE_ROUTE_CHANGE_REQ, TIME.format(vehicleRouteChange.getTime()),
                    vehicleRouteChange.getVehicleId(), vehicleRouteChange.getRouteId(),
                    lastKnownVehicleData != null ? lastKnownVehicleData.getRoadPosition().getConnectionId() : null
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `bridge` accessed in synchronized context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/ambassador/AbstractSumoAmbassador.java`
#### Snippet
```java
        }

        bridge.getVehicleControl().setRouteById(vehicleRouteChange.getVehicleId(), vehicleRouteChange.getRouteId());

        if (sumoConfig.highlights.contains(CSumo.HIGHLIGHT_CHANGE_ROUTE)) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `sumoConfig` accessed in synchronized context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/ambassador/AbstractSumoAmbassador.java`
#### Snippet
```java
        bridge.getVehicleControl().setRouteById(vehicleRouteChange.getVehicleId(), vehicleRouteChange.getRouteId());

        if (sumoConfig.highlights.contains(CSumo.HIGHLIGHT_CHANGE_ROUTE)) {
            bridge.getVehicleControl().highlight(vehicleRouteChange.getVehicleId(), Color.BLUE);
        }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `bridge` accessed in synchronized context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/ambassador/AbstractSumoAmbassador.java`
#### Snippet
```java

        if (sumoConfig.highlights.contains(CSumo.HIGHLIGHT_CHANGE_ROUTE)) {
            bridge.getVehicleControl().highlight(vehicleRouteChange.getVehicleId(), Color.BLUE);
        }
    }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `VEHICLE_LANE_CHANGE_REQ` accessed in synchronized context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/ambassador/AbstractSumoAmbassador.java`
#### Snippet
```java
            if (log.isInfoEnabled()) {
                log.info("{} at simulation time {}: vehicleId=\"{}\", mode={}, lane={}",
                        VEHICLE_LANE_CHANGE_REQ,
                        TIME.format(vehicleLaneChange.getTime()),
                        vehicleLaneChange.getVehicleId(),
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `bridge` accessed in synchronized context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/ambassador/AbstractSumoAmbassador.java`
#### Snippet
```java
                    return;
            }
            bridge.getVehicleControl().changeLane(vehicleLaneChange.getVehicleId(), targetLaneId, vehicleLaneChange.getDuration());

            if (sumoConfig.highlights.contains(CSumo.HIGHLIGHT_CHANGE_LANE)) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `sumoConfig` accessed in synchronized context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/ambassador/AbstractSumoAmbassador.java`
#### Snippet
```java
            bridge.getVehicleControl().changeLane(vehicleLaneChange.getVehicleId(), targetLaneId, vehicleLaneChange.getDuration());

            if (sumoConfig.highlights.contains(CSumo.HIGHLIGHT_CHANGE_LANE)) {
                VehicleData vehicleData = bridge.getSimulationControl().getLastKnownVehicleData(vehicleLaneChange.getVehicleId());
                if (vehicleData.getRoadPosition().getLaneIndex() != targetLaneId) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `bridge` accessed in synchronized context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/ambassador/AbstractSumoAmbassador.java`
#### Snippet
```java

            if (sumoConfig.highlights.contains(CSumo.HIGHLIGHT_CHANGE_LANE)) {
                VehicleData vehicleData = bridge.getSimulationControl().getLastKnownVehicleData(vehicleLaneChange.getVehicleId());
                if (vehicleData.getRoadPosition().getLaneIndex() != targetLaneId) {
                    bridge.getVehicleControl().highlight(vehicleLaneChange.getVehicleId(), Color.RED);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `bridge` accessed in synchronized context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/ambassador/AbstractSumoAmbassador.java`
#### Snippet
```java
                VehicleData vehicleData = bridge.getSimulationControl().getLastKnownVehicleData(vehicleLaneChange.getVehicleId());
                if (vehicleData.getRoadPosition().getLaneIndex() != targetLaneId) {
                    bridge.getVehicleControl().highlight(vehicleLaneChange.getVehicleId(), Color.RED);
                }
            }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `INDUCTION_LOOP_DETECTOR_SUBSCRIPTION` accessed in synchronized context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/ambassador/AbstractSumoAmbassador.java`
#### Snippet
```java
    private synchronized void receiveInteraction(InductionLoopDetectorSubscription inductionLoopDetectorSubscription) throws InternalFederateException {
        log.info(
                INDUCTION_LOOP_DETECTOR_SUBSCRIPTION + " Subscribe to InductionLoop with ID={}",
                inductionLoopDetectorSubscription.getInductionLoopId()
        );
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `bridge` accessed in synchronized context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/ambassador/AbstractSumoAmbassador.java`
#### Snippet
```java
        );

        bridge.getSimulationControl().subscribeForInductionLoop(
                inductionLoopDetectorSubscription.getInductionLoopId(),
                inductionLoopDetectorSubscription.getTime(),
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `LANE_PROPERTY_CHANGE` accessed in synchronized context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/ambassador/AbstractSumoAmbassador.java`
#### Snippet
```java
    private synchronized void receiveInteraction(LanePropertyChange lanePropertyChange) throws InternalFederateException {

        log.info("{} at simulation time {}", LANE_PROPERTY_CHANGE, TIME.format(lanePropertyChange.getTime()));

        final String laneId = lanePropertyChange.getEdgeId() + "_" + lanePropertyChange.getLaneIndex();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `bridge` accessed in synchronized context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/ambassador/AbstractSumoAmbassador.java`
#### Snippet
```java
            List<String> allowedVehicleClasses = lanePropertyChange.getAllowedVehicleClasses().stream()
                    .map(SumoVehicleClassMapping::toSumo).collect(Collectors.toList());
            bridge.getSimulationControl().setLaneAllowedVehicles(laneId, allowedVehicleClasses);
        }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `bridge` accessed in synchronized context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/ambassador/AbstractSumoAmbassador.java`
#### Snippet
```java

            if (lanePropertyChange.getDisallowedVehicleClasses().containsAll(Lists.newArrayList(VehicleClass.values()))) {
                bridge.getSimulationControl().setLaneAllowedVehicles(laneId, Lists.newArrayList());
            } else {
                List<String> disallowedVehicleClasses = lanePropertyChange.getDisallowedVehicleClasses().stream()
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `bridge` accessed in synchronized context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/ambassador/AbstractSumoAmbassador.java`
#### Snippet
```java
                List<String> disallowedVehicleClasses = lanePropertyChange.getDisallowedVehicleClasses().stream()
                        .map(SumoVehicleClassMapping::toSumo).collect(Collectors.toList());
                bridge.getSimulationControl().setLaneDisallowedVehicles(laneId, disallowedVehicleClasses);
            }
        }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `bridge` accessed in synchronized context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/ambassador/AbstractSumoAmbassador.java`
#### Snippet
```java
        if (lanePropertyChange.getMaxSpeed() != null) {
            log.info("Change max speed of lane with ID={}", laneId);
            bridge.getSimulationControl().setLaneMaxSpeed(laneId, lanePropertyChange.getMaxSpeed());
        }
    }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `TRAFFIC_LIGHTS_STATE_CHANGE_REQ` accessed in synchronized context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/ambassador/AbstractSumoAmbassador.java`
#### Snippet
```java
    private synchronized void receiveInteraction(TrafficLightStateChange trafficLightStateChange) throws InternalFederateException {
        try {
            log.info(TRAFFIC_LIGHTS_STATE_CHANGE_REQ);

            String trafficLightGroupId = trafficLightStateChange.getTrafficLightGroupId();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `bridge` accessed in synchronized context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/ambassador/AbstractSumoAmbassador.java`
#### Snippet
```java
                            trafficLightGroupId, trafficLightStateChange.getPhaseIndex()
                    );
                    bridge.getTrafficLightControl().setPhaseIndex(trafficLightGroupId, trafficLightStateChange.getPhaseIndex());
                    break;

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `bridge` accessed in synchronized context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/ambassador/AbstractSumoAmbassador.java`
#### Snippet
```java
                            trafficLightGroupId, durationInSeconds
                    );
                    bridge.getTrafficLightControl().setPhaseRemainingDuration(trafficLightGroupId, durationInSeconds);
                    break;

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `bridge` accessed in synchronized context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/ambassador/AbstractSumoAmbassador.java`
#### Snippet
```java
                            trafficLightGroupId, trafficLightStateChange.getProgramId()
                    );
                    bridge.getTrafficLightControl().setProgramById(trafficLightGroupId, trafficLightStateChange.getProgramId());
                    break;

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `bridge` accessed in synchronized context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/ambassador/AbstractSumoAmbassador.java`
#### Snippet
```java
                            trafficLightGroupId, trafficLightStateChange.getProgramId(), trafficLightStateChange.getPhaseIndex()
                    );
                    bridge.getTrafficLightControl().setProgramById(trafficLightGroupId, trafficLightStateChange.getProgramId());
                    bridge.getTrafficLightControl().setPhaseIndex(trafficLightGroupId, trafficLightStateChange.getPhaseIndex());
                    break;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `bridge` accessed in synchronized context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/ambassador/AbstractSumoAmbassador.java`
#### Snippet
```java
                    );
                    bridge.getTrafficLightControl().setProgramById(trafficLightGroupId, trafficLightStateChange.getProgramId());
                    bridge.getTrafficLightControl().setPhaseIndex(trafficLightGroupId, trafficLightStateChange.getPhaseIndex());
                    break;

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `bridge` accessed in synchronized context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/ambassador/AbstractSumoAmbassador.java`
#### Snippet
```java
                case ChangeToCustomState:
                    log.info("Changing to custom states for traffic light group '{}'.", trafficLightGroupId);
                    bridge.getTrafficLightControl().setPhase(trafficLightGroupId, trafficLightStateChange.getCustomStateList());
                    break;
                default:
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `bridge` accessed in synchronized context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/ambassador/AbstractSumoAmbassador.java`
#### Snippet
```java
            }

            String programId = bridge.getTrafficLightControl().getCurrentProgram(trafficLightGroupId);
            int phaseIndex = bridge.getTrafficLightControl().getCurrentPhase(trafficLightGroupId);
            long assumedNextTimeSwitch = (long) (bridge.getTrafficLightControl().getNextSwitchTime(trafficLightGroupId) * TIME.SECOND);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `bridge` accessed in synchronized context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/ambassador/AbstractSumoAmbassador.java`
#### Snippet
```java

            String programId = bridge.getTrafficLightControl().getCurrentProgram(trafficLightGroupId);
            int phaseIndex = bridge.getTrafficLightControl().getCurrentPhase(trafficLightGroupId);
            long assumedNextTimeSwitch = (long) (bridge.getTrafficLightControl().getNextSwitchTime(trafficLightGroupId) * TIME.SECOND);
            List<TrafficLightState> currentStates = bridge.getTrafficLightControl().getCurrentStates(trafficLightGroupId);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `bridge` accessed in synchronized context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/ambassador/AbstractSumoAmbassador.java`
#### Snippet
```java
            String programId = bridge.getTrafficLightControl().getCurrentProgram(trafficLightGroupId);
            int phaseIndex = bridge.getTrafficLightControl().getCurrentPhase(trafficLightGroupId);
            long assumedNextTimeSwitch = (long) (bridge.getTrafficLightControl().getNextSwitchTime(trafficLightGroupId) * TIME.SECOND);
            List<TrafficLightState> currentStates = bridge.getTrafficLightControl().getCurrentStates(trafficLightGroupId);

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `bridge` accessed in synchronized context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/ambassador/AbstractSumoAmbassador.java`
#### Snippet
```java
            int phaseIndex = bridge.getTrafficLightControl().getCurrentPhase(trafficLightGroupId);
            long assumedNextTimeSwitch = (long) (bridge.getTrafficLightControl().getNextSwitchTime(trafficLightGroupId) * TIME.SECOND);
            List<TrafficLightState> currentStates = bridge.getTrafficLightControl().getCurrentStates(trafficLightGroupId);

            Map<String, TrafficLightGroupInfo> changedTrafficLightGroupInfo = new HashMap<>();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `this.rti` accessed in synchronized context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/ambassador/AbstractSumoAmbassador.java`
#### Snippet
```java

            // now tell the RTI that an update happened so that the update can reach other federates
            this.rti.triggerInteraction(
                    new TrafficLightUpdates(trafficLightStateChange.getTime(), changedTrafficLightGroupInfo)
            );
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `VEHICLE_SPEED_CHANGE_REQ` accessed in synchronized context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/ambassador/AbstractSumoAmbassador.java`
#### Snippet
```java
            log.info(
                    "{} at simulation time {}: " + "vehicleId=\"{}\", targetSpeed={}m/s, interval={}ms",
                    VEHICLE_SPEED_CHANGE_REQ, TIME.format(vehicleSpeedChange.getTime()), vehicleSpeedChange.getVehicleId(),
                    vehicleSpeedChange.getSpeed(), vehicleSpeedChange.getDuration()
            );
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `bridge` accessed in synchronized context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/ambassador/AbstractSumoAmbassador.java`
#### Snippet
```java
            case RESET:
                // reset speed to car-following rules
                bridge.getVehicleControl().setSpeed(vehicleSpeedChange.getVehicleId(), -1.0);
                break;
            case WITH_DURATION:
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `bridge` accessed in synchronized context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/ambassador/AbstractSumoAmbassador.java`
#### Snippet
```java
                    log.debug("slow down vehicle {} and schedule change speed event for timestep {} ns ",
                            vehicleSpeedChange.getVehicleId(), changeSpeedTimestep);
                    bridge.getVehicleControl()
                            .slowDown(vehicleSpeedChange.getVehicleId(), vehicleSpeedChange.getSpeed(), vehicleSpeedChange.getDuration());

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `sumoConfig` accessed in synchronized context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/ambassador/AbstractSumoAmbassador.java`
#### Snippet
```java

                    // set speed permanently after given interval (in the future) via the event scheduler
                    long adjustedTime = adjustToSumoTimeStep(changeSpeedTimestep, sumoConfig.updateInterval);
                    eventScheduler.addEvent(new Event(adjustedTime, this, vehicleSpeedChange)
                    );
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `bridge` accessed in synchronized context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/ambassador/AbstractSumoAmbassador.java`
#### Snippet
```java
                } else {
                    // set speed immediately
                    bridge.getVehicleControl().setSpeed(vehicleSpeedChange.getVehicleId(), vehicleSpeedChange.getSpeed());
                }
                break;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `bridge` accessed in synchronized context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/ambassador/AbstractSumoAmbassador.java`
#### Snippet
```java
        for (String removed : vehicleUpdates.getRemovedNames()) {
            if (externalVehicles.containsKey(removed)) {
                bridge.getSimulationControl().removeVehicle(removed, VehicleSetRemove.Reason.ARRIVED);
            }
        }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `bridge` accessed in synchronized context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/ambassador/AbstractSumoAmbassador.java`
#### Snippet
```java
    @Override
    public synchronized void processTimeAdvanceGrant(long time) throws InternalFederateException {
        if (bridge instanceof TraciClientBridge && socket == null) {
            throw new InternalFederateException("Error during advance time (" + time + "): Sumo not yet ready.");
        }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `socket` accessed in synchronized context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/ambassador/AbstractSumoAmbassador.java`
#### Snippet
```java
    @Override
    public synchronized void processTimeAdvanceGrant(long time) throws InternalFederateException {
        if (bridge instanceof TraciClientBridge && socket == null) {
            throw new InternalFederateException("Error during advance time (" + time + "): Sumo not yet ready.");
        }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `nextTimeStep` accessed in synchronized context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/ambassador/AbstractSumoAmbassador.java`
#### Snippet
```java
        interactionList.clear();

        if (time < nextTimeStep) {
            // process time advance only if time is equal or greater than the next simulation time step
            return;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `SIM_TRAFFIC` accessed in synchronized context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/ambassador/AbstractSumoAmbassador.java`
#### Snippet
```java
        try {
            if (log.isTraceEnabled()) {
                log.trace(SIM_TRAFFIC, time);
            }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `bridge` accessed in synchronized context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/ambassador/AbstractSumoAmbassador.java`
#### Snippet
```java

            setExternalVehiclesToLatestPositions();
            TraciSimulationStepResult simulationStepResult = bridge.getSimulationControl().simulateUntil(time);

            VehicleUpdates vehicleUpdates = simulationStepResult.getVehicleUpdates();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `nextTimeStep` accessed in synchronized context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/ambassador/AbstractSumoAmbassador.java`
#### Snippet
```java
            propagateSumoVehiclesToRti(time);

            nextTimeStep += sumoConfig.updateInterval * TIME.MILLI_SECOND;
            simulationStepResult.getVehicleUpdates().setNextUpdate(nextTimeStep);

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `sumoConfig` accessed in synchronized context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/ambassador/AbstractSumoAmbassador.java`
#### Snippet
```java
            propagateSumoVehiclesToRti(time);

            nextTimeStep += sumoConfig.updateInterval * TIME.MILLI_SECOND;
            simulationStepResult.getVehicleUpdates().setNextUpdate(nextTimeStep);

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `nextTimeStep` accessed in synchronized context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/ambassador/AbstractSumoAmbassador.java`
#### Snippet
```java

            nextTimeStep += sumoConfig.updateInterval * TIME.MILLI_SECOND;
            simulationStepResult.getVehicleUpdates().setNextUpdate(nextTimeStep);

            rti.triggerInteraction(vehicleUpdates);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `rti` accessed in synchronized context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/ambassador/AbstractSumoAmbassador.java`
#### Snippet
```java
            simulationStepResult.getVehicleUpdates().setNextUpdate(nextTimeStep);

            rti.triggerInteraction(vehicleUpdates);
            rti.triggerInteraction(simulationStepResult.getTrafficDetectorUpdates());
            this.rti.triggerInteraction(simulationStepResult.getTrafficLightUpdates());
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `rti` accessed in synchronized context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/ambassador/AbstractSumoAmbassador.java`
#### Snippet
```java

            rti.triggerInteraction(vehicleUpdates);
            rti.triggerInteraction(simulationStepResult.getTrafficDetectorUpdates());
            this.rti.triggerInteraction(simulationStepResult.getTrafficLightUpdates());

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `this.rti` accessed in synchronized context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/ambassador/AbstractSumoAmbassador.java`
#### Snippet
```java
            rti.triggerInteraction(vehicleUpdates);
            rti.triggerInteraction(simulationStepResult.getTrafficDetectorUpdates());
            this.rti.triggerInteraction(simulationStepResult.getTrafficLightUpdates());

            rti.requestAdvanceTime(nextTimeStep, 0, FederatePriority.higher(descriptor.getPriority()));
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `rti` accessed in synchronized context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/ambassador/AbstractSumoAmbassador.java`
#### Snippet
```java
            this.rti.triggerInteraction(simulationStepResult.getTrafficLightUpdates());

            rti.requestAdvanceTime(nextTimeStep, 0, FederatePriority.higher(descriptor.getPriority()));

            lastAdvanceTime = time;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `nextTimeStep` accessed in synchronized context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/ambassador/AbstractSumoAmbassador.java`
#### Snippet
```java
            this.rti.triggerInteraction(simulationStepResult.getTrafficLightUpdates());

            rti.requestAdvanceTime(nextTimeStep, 0, FederatePriority.higher(descriptor.getPriority()));

            lastAdvanceTime = time;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `descriptor` accessed in synchronized context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/ambassador/AbstractSumoAmbassador.java`
#### Snippet
```java
            this.rti.triggerInteraction(simulationStepResult.getTrafficLightUpdates());

            rti.requestAdvanceTime(nextTimeStep, 0, FederatePriority.higher(descriptor.getPriority()));

            lastAdvanceTime = time;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `VEHICLE_SLOWDOWN_REQ` accessed in synchronized context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/ambassador/AbstractSumoAmbassador.java`
#### Snippet
```java
            log.info(
                    "{} at simulation time {}: vehicleId=\"{}\", targetSpeed={}m/s, interval={}ms",
                    VEHICLE_SLOWDOWN_REQ,
                    TIME.format(vehicleSlowDown.getTime()),
                    vehicleSlowDown.getVehicleId(),
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `bridge` accessed in synchronized context
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/ambassador/AbstractSumoAmbassador.java`
#### Snippet
```java
            );
        }
        bridge.getVehicleControl()
                .slowDown(vehicleSlowDown.getVehicleId(), vehicleSlowDown.getSpeed(), vehicleSlowDown.getDuration());
    }
```

## RuleId[id=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `lib/mosaic-network/src/main/java/org/eclipse/mosaic/lib/coupling/CAbstractNetworkAmbassador.java`
#### Snippet
```java

    @SuppressWarnings("FieldCanBeLocal")
    static class CDestinationAdress {
        private boolean ipv4UnicastAddress = false;
        private boolean ipv4BroadcastAddress = true;
```

## RuleId[id=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `lib/mosaic-utils/src/main/java/org/eclipse/mosaic/lib/util/cli/CommandLineParser.java`
#### Snippet
```java

    public void printHelp() {
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out, StandardCharsets.UTF_8));
        printHelp(pw);
        pw.flush();
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `rti/mosaic-starter/src/main/java/org/eclipse/mosaic/starter/MosaicStarter.java`
#### Snippet
```java
            logDirectory = ((LoggerContext) LoggerFactory.getILoggerFactory()).getProperty("logDirectory");
        } catch (Throwable ex) {
            System.err.println("Could not initialize logging");
            System.err.println(ExceptionUtils.getStackTrace(exception));
        }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `rti/mosaic-starter/src/main/java/org/eclipse/mosaic/starter/MosaicStarter.java`
#### Snippet
```java
        } catch (Throwable ex) {
            System.err.println("Could not initialize logging");
            System.err.println(ExceptionUtils.getStackTrace(exception));
        }

```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `rti/mosaic-starter/src/main/java/org/eclipse/mosaic/starter/MosaicStarter.java`
#### Snippet
```java
        }

        System.err.println();
        System.err.println("--------------------------------------------------------------------------------");
        System.err.println(" Stopping simulation due to a critical error:");
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `rti/mosaic-starter/src/main/java/org/eclipse/mosaic/starter/MosaicStarter.java`
#### Snippet
```java

        System.err.println();
        System.err.println("--------------------------------------------------------------------------------");
        System.err.println(" Stopping simulation due to a critical error:");
        System.err.println("\t- " + ExceptionUtils.getMessage(exception));
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `rti/mosaic-starter/src/main/java/org/eclipse/mosaic/starter/MosaicStarter.java`
#### Snippet
```java
        System.err.println();
        System.err.println("--------------------------------------------------------------------------------");
        System.err.println(" Stopping simulation due to a critical error:");
        System.err.println("\t- " + ExceptionUtils.getMessage(exception));
        System.err.println("\t- Root Cause: " + ExceptionUtils.getRootCauseMessage(exception));
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `rti/mosaic-starter/src/main/java/org/eclipse/mosaic/starter/MosaicStarter.java`
#### Snippet
```java
        System.err.println("--------------------------------------------------------------------------------");
        System.err.println(" Stopping simulation due to a critical error:");
        System.err.println("\t- " + ExceptionUtils.getMessage(exception));
        System.err.println("\t- Root Cause: " + ExceptionUtils.getRootCauseMessage(exception));
        if (logDirectory != null) {
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `rti/mosaic-starter/src/main/java/org/eclipse/mosaic/starter/MosaicStarter.java`
#### Snippet
```java
        System.err.println(" Stopping simulation due to a critical error:");
        System.err.println("\t- " + ExceptionUtils.getMessage(exception));
        System.err.println("\t- Root Cause: " + ExceptionUtils.getRootCauseMessage(exception));
        if (logDirectory != null) {
            System.err.println(" Please see the log files for details.");
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `rti/mosaic-starter/src/main/java/org/eclipse/mosaic/starter/MosaicStarter.java`
#### Snippet
```java
        System.err.println("\t- Root Cause: " + ExceptionUtils.getRootCauseMessage(exception));
        if (logDirectory != null) {
            System.err.println(" Please see the log files for details.");
            System.err.println("\t- Log-Directory: " + logDirectory);
        }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `rti/mosaic-starter/src/main/java/org/eclipse/mosaic/starter/MosaicStarter.java`
#### Snippet
```java
        if (logDirectory != null) {
            System.err.println(" Please see the log files for details.");
            System.err.println("\t- Log-Directory: " + logDirectory);
        }
        System.err.println("--------------------------------------------------------------------------------");
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `rti/mosaic-starter/src/main/java/org/eclipse/mosaic/starter/MosaicStarter.java`
#### Snippet
```java
            System.err.println("\t- Log-Directory: " + logDirectory);
        }
        System.err.println("--------------------------------------------------------------------------------");
        System.err.println(" MOSAIC will now shut down.");
        System.err.println("--------------------------------------------------------------------------------");
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `rti/mosaic-starter/src/main/java/org/eclipse/mosaic/starter/MosaicStarter.java`
#### Snippet
```java
        }
        System.err.println("--------------------------------------------------------------------------------");
        System.err.println(" MOSAIC will now shut down.");
        System.err.println("--------------------------------------------------------------------------------");
        System.err.println();
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `rti/mosaic-starter/src/main/java/org/eclipse/mosaic/starter/MosaicStarter.java`
#### Snippet
```java
        System.err.println("--------------------------------------------------------------------------------");
        System.err.println(" MOSAIC will now shut down.");
        System.err.println("--------------------------------------------------------------------------------");
        System.err.println();

```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `rti/mosaic-starter/src/main/java/org/eclipse/mosaic/starter/MosaicStarter.java`
#### Snippet
```java
        System.err.println(" MOSAIC will now shut down.");
        System.err.println("--------------------------------------------------------------------------------");
        System.err.println();

        if (logger == null || logger.isDebugEnabled()) {
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `rti/mosaic-starter/src/main/java/org/eclipse/mosaic/starter/MosaicStarter.java`
#### Snippet
```java

        if (logger == null || logger.isDebugEnabled()) {
            System.err.println("\t- Detailed Stacktrace: ");
            System.err.println();
            System.err.println(ExceptionUtils.getStackTrace(exception));
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `rti/mosaic-starter/src/main/java/org/eclipse/mosaic/starter/MosaicStarter.java`
#### Snippet
```java
        if (logger == null || logger.isDebugEnabled()) {
            System.err.println("\t- Detailed Stacktrace: ");
            System.err.println();
            System.err.println(ExceptionUtils.getStackTrace(exception));
            System.err.println();
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `rti/mosaic-starter/src/main/java/org/eclipse/mosaic/starter/MosaicStarter.java`
#### Snippet
```java
            System.err.println("\t- Detailed Stacktrace: ");
            System.err.println();
            System.err.println(ExceptionUtils.getStackTrace(exception));
            System.err.println();
            System.err.println("--------------------------------------------------------------------------------");
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `rti/mosaic-starter/src/main/java/org/eclipse/mosaic/starter/MosaicStarter.java`
#### Snippet
```java
            System.err.println();
            System.err.println(ExceptionUtils.getStackTrace(exception));
            System.err.println();
            System.err.println("--------------------------------------------------------------------------------");
        }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `rti/mosaic-starter/src/main/java/org/eclipse/mosaic/starter/MosaicStarter.java`
#### Snippet
```java
            System.err.println(ExceptionUtils.getStackTrace(exception));
            System.err.println();
            System.err.println("--------------------------------------------------------------------------------");
        }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `rti/mosaic-starter/src/main/java/org/eclipse/mosaic/starter/MosaicStarter.java`
#### Snippet
```java
        }
        String usage = new String(baos.toByteArray(), StandardCharsets.UTF_8);
        System.out.format("Invalid command line arguments: %s%n%s", error, usage);
    }

```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `rti/mosaic-starter/src/main/java/org/eclipse/mosaic/starter/MosaicStarter.java`
#### Snippet
```java
     */
    protected void printAndLog(String string, Throwable reason) {
        System.err.println(string);
        System.err.println("   Stacktrace: " + ExceptionUtils.getStackTrace(reason));
        if (getLogger() != null) {
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `rti/mosaic-starter/src/main/java/org/eclipse/mosaic/starter/MosaicStarter.java`
#### Snippet
```java
    protected void printAndLog(String string, Throwable reason) {
        System.err.println(string);
        System.err.println("   Stacktrace: " + ExceptionUtils.getStackTrace(reason));
        if (getLogger() != null) {
            getLogger().error(string, reason);
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `rti/mosaic-starter/src/main/java/org/eclipse/mosaic/starter/MosaicStarter.java`
#### Snippet
```java
            getLogger().warn("Could not start visualization", e);
        } catch (UnsupportedOperationException e) {
            System.err.println();
            System.err.println("Could not open " + VISUALIZER_PATH + " in the browser.");
            System.err.println("The Desktop API might not be supported on the current system.");
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `rti/mosaic-starter/src/main/java/org/eclipse/mosaic/starter/MosaicStarter.java`
#### Snippet
```java
        } catch (UnsupportedOperationException e) {
            System.err.println();
            System.err.println("Could not open " + VISUALIZER_PATH + " in the browser.");
            System.err.println("The Desktop API might not be supported on the current system.");
            if (SystemUtils.IS_OS_UNIX) {
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `rti/mosaic-starter/src/main/java/org/eclipse/mosaic/starter/MosaicStarter.java`
#### Snippet
```java
            System.err.println();
            System.err.println("Could not open " + VISUALIZER_PATH + " in the browser.");
            System.err.println("The Desktop API might not be supported on the current system.");
            if (SystemUtils.IS_OS_UNIX) {
                System.err.println("On Linux, installing libgnome2-0 should fix this problem.");
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `rti/mosaic-starter/src/main/java/org/eclipse/mosaic/starter/MosaicStarter.java`
#### Snippet
```java
            System.err.println("The Desktop API might not be supported on the current system.");
            if (SystemUtils.IS_OS_UNIX) {
                System.err.println("On Linux, installing libgnome2-0 should fix this problem.");
            }
            System.err.println();
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `rti/mosaic-starter/src/main/java/org/eclipse/mosaic/starter/MosaicStarter.java`
#### Snippet
```java
                System.err.println("On Linux, installing libgnome2-0 should fix this problem.");
            }
            System.err.println();
        }
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `rti/mosaic-starter/src/main/java/org/eclipse/mosaic/starter/MosaicStarter.java`
#### Snippet
```java

    protected void printVersionAndCopyrightInfo() {
        System.out.println("Eclipse MOSAIC [Version " + MosaicVersion.get().toString() + "]");
        System.out.println("Copyright (c) 2022 Fraunhofer FOKUS and others. All rights reserved.");
        System.out.println("License EPL-2.0: Eclipse Public License Version 2 [https://eclipse.org/legal/epl-v20.html].");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `rti/mosaic-starter/src/main/java/org/eclipse/mosaic/starter/MosaicStarter.java`
#### Snippet
```java
    protected void printVersionAndCopyrightInfo() {
        System.out.println("Eclipse MOSAIC [Version " + MosaicVersion.get().toString() + "]");
        System.out.println("Copyright (c) 2022 Fraunhofer FOKUS and others. All rights reserved.");
        System.out.println("License EPL-2.0: Eclipse Public License Version 2 [https://eclipse.org/legal/epl-v20.html].");
        System.out.println();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `rti/mosaic-starter/src/main/java/org/eclipse/mosaic/starter/MosaicStarter.java`
#### Snippet
```java
        System.out.println("Eclipse MOSAIC [Version " + MosaicVersion.get().toString() + "]");
        System.out.println("Copyright (c) 2022 Fraunhofer FOKUS and others. All rights reserved.");
        System.out.println("License EPL-2.0: Eclipse Public License Version 2 [https://eclipse.org/legal/epl-v20.html].");
        System.out.println();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `rti/mosaic-starter/src/main/java/org/eclipse/mosaic/starter/MosaicStarter.java`
#### Snippet
```java
        System.out.println("Copyright (c) 2022 Fraunhofer FOKUS and others. All rights reserved.");
        System.out.println("License EPL-2.0: Eclipse Public License Version 2 [https://eclipse.org/legal/epl-v20.html].");
        System.out.println();
    }

```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `rti/mosaic-starter/src/main/java/org/eclipse/mosaic/starter/MosaicStarter.java`
#### Snippet
```java
     */
    protected void printAndLog(String message) {
        System.err.println(message);
        if (getLogger() != null) {
            getLogger().error(message);
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `rti/mosaic-rti-core/src/main/java/org/eclipse/mosaic/rti/ExternalWatchDog.java`
#### Snippet
```java
                    federation.getFederationManagement().stopFederation();
                } catch (Exception e) {
                    System.err.format("Could not stop federation. Stacktrace: %n%s%n", ExceptionUtils.getStackTrace(e));
                }
                System.out.println("External Watchdog kills the Simulation");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `rti/mosaic-rti-core/src/main/java/org/eclipse/mosaic/rti/ExternalWatchDog.java`
#### Snippet
```java
                    System.err.format("Could not stop federation. Stacktrace: %n%s%n", ExceptionUtils.getStackTrace(e));
                }
                System.out.println("External Watchdog kills the Simulation");
                System.exit(333);
            }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `rti/mosaic-rti-core/src/main/java/org/eclipse/mosaic/rti/WatchDogThread.java`
#### Snippet
```java
            if (timeSinceLastUpdate > this.maxIdleTime * 1000L && watching) {
                try {
                    System.err.println();
                    System.err.println("--------------------------------------------------------------------------------");
                    System.err.println(" ERROR: One or more federates did not respond for " + maxIdleTime + " seconds.");
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `rti/mosaic-rti-core/src/main/java/org/eclipse/mosaic/rti/WatchDogThread.java`
#### Snippet
```java
                try {
                    System.err.println();
                    System.err.println("--------------------------------------------------------------------------------");
                    System.err.println(" ERROR: One or more federates did not respond for " + maxIdleTime + " seconds.");
                    System.err.println("        This could be caused by an error in a federate.");
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `rti/mosaic-rti-core/src/main/java/org/eclipse/mosaic/rti/WatchDogThread.java`
#### Snippet
```java
                    System.err.println();
                    System.err.println("--------------------------------------------------------------------------------");
                    System.err.println(" ERROR: One or more federates did not respond for " + maxIdleTime + " seconds.");
                    System.err.println("        This could be caused by an error in a federate.");
                    System.err.println("        You can increase the timeout using the -w parameter.");
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `rti/mosaic-rti-core/src/main/java/org/eclipse/mosaic/rti/WatchDogThread.java`
#### Snippet
```java
                    System.err.println("--------------------------------------------------------------------------------");
                    System.err.println(" ERROR: One or more federates did not respond for " + maxIdleTime + " seconds.");
                    System.err.println("        This could be caused by an error in a federate.");
                    System.err.println("        You can increase the timeout using the -w parameter.");
                    System.err.println("        Using \"-w 0\" disables the watchdog.");
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `rti/mosaic-rti-core/src/main/java/org/eclipse/mosaic/rti/WatchDogThread.java`
#### Snippet
```java
                    System.err.println(" ERROR: One or more federates did not respond for " + maxIdleTime + " seconds.");
                    System.err.println("        This could be caused by an error in a federate.");
                    System.err.println("        You can increase the timeout using the -w parameter.");
                    System.err.println("        Using \"-w 0\" disables the watchdog.");
                    System.err.println("--------------------------------------------------------------------------------");
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `rti/mosaic-rti-core/src/main/java/org/eclipse/mosaic/rti/WatchDogThread.java`
#### Snippet
```java
                    System.err.println("        This could be caused by an error in a federate.");
                    System.err.println("        You can increase the timeout using the -w parameter.");
                    System.err.println("        Using \"-w 0\" disables the watchdog.");
                    System.err.println("--------------------------------------------------------------------------------");
                    System.err.println(" MOSAIC will now shut down.");
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `rti/mosaic-rti-core/src/main/java/org/eclipse/mosaic/rti/WatchDogThread.java`
#### Snippet
```java
                    System.err.println("        You can increase the timeout using the -w parameter.");
                    System.err.println("        Using \"-w 0\" disables the watchdog.");
                    System.err.println("--------------------------------------------------------------------------------");
                    System.err.println(" MOSAIC will now shut down.");
                    System.err.println("--------------------------------------------------------------------------------");
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `rti/mosaic-rti-core/src/main/java/org/eclipse/mosaic/rti/WatchDogThread.java`
#### Snippet
```java
                    System.err.println("        Using \"-w 0\" disables the watchdog.");
                    System.err.println("--------------------------------------------------------------------------------");
                    System.err.println(" MOSAIC will now shut down.");
                    System.err.println("--------------------------------------------------------------------------------");
                    System.err.println();
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `rti/mosaic-rti-core/src/main/java/org/eclipse/mosaic/rti/WatchDogThread.java`
#### Snippet
```java
                    System.err.println("--------------------------------------------------------------------------------");
                    System.err.println(" MOSAIC will now shut down.");
                    System.err.println("--------------------------------------------------------------------------------");
                    System.err.println();

```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `rti/mosaic-rti-core/src/main/java/org/eclipse/mosaic/rti/WatchDogThread.java`
#### Snippet
```java
                    System.err.println(" MOSAIC will now shut down.");
                    System.err.println("--------------------------------------------------------------------------------");
                    System.err.println();

                    // wait a second to complete print lines
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/ambassador/LogStatements.java`
#### Snippet
```java
     */
    static void printStartSumoGuiInfo() {
        System.out.println(StringUtils.repeat("=", 70));
        System.out.println("| SUMO will now be started in GUI Mode." + StringUtils.repeat(" ", 30) + "|");
        System.out.println("| Please make sure you have started Eclipse MOSAIC with \"-w 0\"" + StringUtils.repeat(" ", 7) + "|");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/ambassador/LogStatements.java`
#### Snippet
```java
    static void printStartSumoGuiInfo() {
        System.out.println(StringUtils.repeat("=", 70));
        System.out.println("| SUMO will now be started in GUI Mode." + StringUtils.repeat(" ", 30) + "|");
        System.out.println("| Please make sure you have started Eclipse MOSAIC with \"-w 0\"" + StringUtils.repeat(" ", 7) + "|");
        System.out.println("| Start the simulation manually in SUMO-GUI." + StringUtils.repeat(" ", 25) + "|");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/ambassador/LogStatements.java`
#### Snippet
```java
        System.out.println(StringUtils.repeat("=", 70));
        System.out.println("| SUMO will now be started in GUI Mode." + StringUtils.repeat(" ", 30) + "|");
        System.out.println("| Please make sure you have started Eclipse MOSAIC with \"-w 0\"" + StringUtils.repeat(" ", 7) + "|");
        System.out.println("| Start the simulation manually in SUMO-GUI." + StringUtils.repeat(" ", 25) + "|");
        System.out.println(StringUtils.repeat("=", 70));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/ambassador/LogStatements.java`
#### Snippet
```java
        System.out.println("| SUMO will now be started in GUI Mode." + StringUtils.repeat(" ", 30) + "|");
        System.out.println("| Please make sure you have started Eclipse MOSAIC with \"-w 0\"" + StringUtils.repeat(" ", 7) + "|");
        System.out.println("| Start the simulation manually in SUMO-GUI." + StringUtils.repeat(" ", 25) + "|");
        System.out.println(StringUtils.repeat("=", 70));
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/ambassador/LogStatements.java`
#### Snippet
```java
        System.out.println("| Please make sure you have started Eclipse MOSAIC with \"-w 0\"" + StringUtils.repeat(" ", 7) + "|");
        System.out.println("| Start the simulation manually in SUMO-GUI." + StringUtils.repeat(" ", 25) + "|");
        System.out.println(StringUtils.repeat("=", 70));
    }
}
```

## RuleId[id=MissingDeprecatedAnnotation]
### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `lib/mosaic-database/src/main/java/org/eclipse/mosaic/lib/database/Database.java`
#### Snippet
```java
         * @deprecated use addRoute instead
         */
        public void addRoute(Route route) {
            database.routes.put(route.getId(), route);
        }
```

### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `lib/mosaic-database/src/main/java/org/eclipse/mosaic/lib/database/Database.java`
#### Snippet
```java
         * @deprecated use {@link #addConnection(String, String)} instead
         */
        public Builder addConnection(Connection connection) {
            database.connections.put(connection.getId(), connection);

```

### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `lib/mosaic-database/src/main/java/org/eclipse/mosaic/lib/database/Database.java`
#### Snippet
```java
         * @deprecated will be removed in future versions. It should not be required to have access to a Database which is being currently built.
         */
        public Database getIntermediateDatabase() {
            return database;
        }
```

### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `lib/mosaic-database/src/main/java/org/eclipse/mosaic/lib/database/Database.java`
#### Snippet
```java
         * @deprecated use {@link #addNode(String, GeoPoint)} instead
         */
        public Builder addNode(Node node) {
            if (node != null) {
                database.nodes.put(node.getId(), node);
```

### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `lib/mosaic-database/src/main/java/org/eclipse/mosaic/lib/database/Database.java`
#### Snippet
```java
         * @deprecated use {@link #addWay(String, String, String)} instead
         */
        public Builder addWay(Way way) {
            database.ways.put(way.getId(), way);

```

### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/transform/Wgs84Projection.java`
#### Snippet
```java
     * @deprecated Legacy constructor.
     */
    public Wgs84Projection(GeoPoint playgroundCenter, CartesianPoint cartesianOffset) {
        final UtmZone zone = UtmZone.from(playgroundCenter);
        this.utmOrigin = new MutableUtmPoint(
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `lib/mosaic-utils/src/main/java/org/eclipse/mosaic/lib/util/JsonUtils.java`
#### Snippet
```java
                tmp2 = lc.substring(from);
                if (!inString) {
                    tmp2 = tmp2.replaceAll("(\\n|\\r|\\s)*", "");
                }

```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `lib/mosaic-utils/src/main/java/org/eclipse/mosaic/lib/util/JsonUtils.java`
#### Snippet
```java
            } else if ((tmp.startsWith("\n") || tmp.startsWith("\r")) && !inString && !inMultilineComment && inSinglelineComment) {
                inSinglelineComment = false;
            } else if (!inMultilineComment && !inSinglelineComment && !tmp.substring(0, 1).matches("\\n|\\r|\\s")) {
                newLines.add(tmp);
            }
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `lib/mosaic-docker/src/main/java/org/eclipse/mosaic/lib/docker/DockerClient.java`
#### Snippet
```java
    private List<Pair<Integer, Integer>> readPortBinding(String containerName) {
        final List<Pair<Integer, Integer>> bindings = new Vector<>();
        String result = docker.port(containerName).replace("\r", "");
        for (String line : StringUtils.split(result, "\n")) {
            Matcher m = PORT_PATTERN.matcher(line);
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `lib/mosaic-docker/src/main/java/org/eclipse/mosaic/lib/docker/DockerRun.java`
#### Snippet
```java
        for (Pair<File, String> binding : volumeBindings) {
            options.add("-v");
            options.add(binding.getKey().getAbsolutePath().replace('\\', '/').replace(" ", "\\ ") + ":" + binding.getValue());
        }

```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `rti/mosaic-rti-api/src/main/java/org/eclipse/mosaic/rti/api/federatestarter/ExecutableFederateExecutor.java`
#### Snippet
```java
            if (line.length() > 0) {
                log.debug(line);
                if (line.matches("\\s*\\[\\d+\\]\\s\\d+\\s*")) {
                    pid = Integer.parseInt(line.split("\\s")[1]);
                    log.info("Started with pid=" + pid + ".");
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `rti/mosaic-rti-api/src/main/java/org/eclipse/mosaic/rti/api/federatestarter/ExecutableFederateExecutor.java`
#### Snippet
```java
                log.debug(line);
                if (line.matches("\\s*\\[\\d+\\]\\s\\d+\\s*")) {
                    pid = Integer.parseInt(line.split("\\s")[1]);
                    log.info("Started with pid=" + pid + ".");
                    break;
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `lib/mosaic-routing/src/main/java/org/eclipse/mosaic/lib/routing/util/RouteFixer.java`
#### Snippet
```java
        }
        return !database.getConnections().isEmpty()
                && database.getConnections().iterator().next().getId().matches("^\\w+_\\w+_\\w+$");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/CommandRegister.java`
#### Snippet
```java
        String className = commandClass.getCanonicalName();
        if (className.contains(".api.")) {
            String newClassName = className.replace(".api.",
                    implPackage == null
                            ? "."
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/ambassador/LibSumoAmbassador.java`
#### Snippet
```java
            Process p = new ProcessBuilder(getFromSumoHome("sumo"), "--version").start();
            String sumoOutput = Iterables.getFirst(IOUtils.readLines(p.getInputStream(), Charset.defaultCharset()), null);
            return sumoOutput == null || !sumoOutput.matches(".*(" + VALID_LIBSUMO_VERSIONS + ").*");
        } catch (IOException e) {
            return true;
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.mosaic.interactions.traffic` is unnecessary and can be removed
in `lib/mosaic-interactions/src/main/java/org/eclipse/mosaic/interactions/traffic/TrafficLightSubscription.java`
#### Snippet
```java
     * String identifying the type of this interaction.
     */
    public final static String TYPE_ID = createTypeIdentifier(org.eclipse.mosaic.interactions.traffic.TrafficLightSubscription.class);

    /**
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `lib/mosaic-network/src/main/java/org/eclipse/mosaic/lib/coupling/ClientServerChannel.java`
#### Snippet
```java
     *
     * @return the read time as long
     * @throws java.io.IOException
     */
    public long readTimeBody() throws IOException {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `lib/mosaic-network/src/main/java/org/eclipse/mosaic/lib/coupling/ClientServerChannel.java`
#### Snippet
```java
     * Closes the channel.
     *
     * @throws java.io.IOException
     */
    public void close() throws IOException {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `lib/mosaic-network/src/main/java/org/eclipse/mosaic/lib/coupling/ClientServerChannel.java`
#### Snippet
```java
     *
     * @return the read port as int
     * @throws java.io.IOException
     */
    public int readPortBody() throws IOException {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `lib/mosaic-network/src/main/java/org/eclipse/mosaic/lib/coupling/ClientServerChannel.java`
#### Snippet
```java
     *
     * @return The read message.
     * @throws java.io.IOException
     */ //TODO: ChannelID (and length) not yet treated
    public ReceiveMessageContainer readMessage(IdTransformer<Integer, String> idTransformer) throws IOException {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `lib/mosaic-network/src/main/java/org/eclipse/mosaic/lib/coupling/ClientServerChannel.java`
#### Snippet
```java
     *
     * @return the read command
     * @throws java.io.IOException
     */
    public int readCommand() throws IOException {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.mosaic.lib.database.spatial` is unnecessary and can be removed
in `lib/mosaic-database/src/main/java/org/eclipse/mosaic/lib/database/spatial/EdgeFinder.java`
#### Snippet
```java
        }
        edgeIndex = new KdTree<>(new SpatialItemAdapter.EdgeAdapter<>(), items);
        edgeSearch = new org.eclipse.mosaic.lib.database.spatial.Edge.Nearest<>();
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `lib/mosaic-database/src/main/java/org/eclipse/mosaic/lib/database/road/Node.java`
#### Snippet
```java
     * Returns all {@link Connection}s that start at this node.
     *
     * @return An unmodifiable {@link java.util.List} view from {@link #outgoingConnections}.
     */
    @Nonnull
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `lib/mosaic-database/src/main/java/org/eclipse/mosaic/lib/database/road/Node.java`
#### Snippet
```java
     * Returns all {@link Connection}s that this node is a part of (but does not start or end at).
     *
     * @return An unmodifiable {@link java.util.List} view from {@link #partOfConnections}.
     */
    @Nonnull
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `lib/mosaic-database/src/main/java/org/eclipse/mosaic/lib/database/road/Node.java`
#### Snippet
```java
     * Returns all {@link Connection}s that end at this node.
     *
     * @return An unmodifiable {@link java.util.List} view from {@link #incomingConnections}.
     */
    @Nonnull
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `lib/mosaic-database/src/main/java/org/eclipse/mosaic/lib/database/road/Node.java`
#### Snippet
```java
     * Returns all {@link Way}s that this node is part of.
     *
     * @return An unmodifiable {@link java.util.List} view from {@link #ways}.
     */
    @Nonnull
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `lib/mosaic-database/src/main/java/org/eclipse/mosaic/lib/database/persistence/SQLiteAccess.java`
#### Snippet
```java

    /**
     * Connects to the database defined by {@link #setDatabaseFile(java.lang.String)}.
     *
     * @throws SQLException thrown if connection couldn't be established of the statement couldn't be created
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `lib/mosaic-database/src/main/java/org/eclipse/mosaic/lib/database/persistence/SQLiteAccess.java`
#### Snippet
```java
    /**
     * Constructor for accessing new or existing databases.
     * Make sure to call {@link #setDatabaseFile(java.lang.String)} before use of object.
     */
    protected SQLiteAccess() {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.function` is unnecessary and can be removed
in `fed/mosaic-output/src/main/java/org/eclipse/mosaic/fed/output/ambassador/AbstractOutputGenerator.java`
#### Snippet
```java
 *  }
 *  </pre>
 * As a third method, the {@link #registerInteractionForOutputGeneration(String, java.util.function.Consumer)}  method can be used in the constructor.
 * <pre>
 *  MyOutputGenerator() {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.mosaic.fed.sumo.bridge.api.complex` is unnecessary and can be removed
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/api/complex/InductionLoopVehicleData.java`
#### Snippet
```java
/**
 * Vehicle data saved by an induction loop.
 * (cf. {@link org.eclipse.mosaic.fed.sumo.bridge.api.complex.InductionLoopSubscriptionResult})
 */
@SuppressWarnings("URF_UNREAD_PUBLIC_OR_PROTECTED_FIELD")
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/LaneGetLength.java`
#### Snippet
```java
    /**
     * Creates a new {@link LaneGetLength} object.
     * Called by {@link CommandRegister#getOrCreate(java.lang.Class)}.
     * Access needs to be public, because command is called using Reflection.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.mosaic.fed.sumo.config` is unnecessary and can be removed
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/util/SumoVehicleTypesWriter.java`
#### Snippet
```java

    /**
     * Stores additional vehicle type parameters specified in {@link org.eclipse.mosaic.fed.sumo.config.CSumo}.
     */
    private final Map<String, Map<String, String>> additionalVehicleTypeParameters;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.mosaic.fed.sumo.config` is unnecessary and can be removed
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/util/SumoVehicleTypesWriter.java`
#### Snippet
```java
    /**
     * Document used to write vehicle types (prototypes) from Mapping to.
     * Note: parameters from {@link org.eclipse.mosaic.fed.sumo.config.CSumo#additionalVehicleTypeParameters}
     * will also be written into this file, overwriting values from Mapping.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/LaneAreaSubscribe.java`
#### Snippet
```java
    /**
     * Default constructor used in TraciSimulationFacade.
     * Called by {@link CommandRegister#getOrCreate(java.lang.Class)}.
     * Access needs to be public, because command is called using Reflection.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/InductionLoopSubscribe.java`
#### Snippet
```java
    /**
     * Default constructor for {@link InductionLoopSubscribe}.
     * Called by {@link CommandRegister#getOrCreate(java.lang.Class)}.
     * Access needs to be public, because command is called using Reflection.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.sumo.libsumo` is unnecessary, and can be replaced with an import
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/libsumo/LaneGetShape.java`
#### Snippet
```java
        TraCPositionVector shapeVector = Lane.getShape(laneId).getValue();
        List<Position> shape = new ArrayList<>();
        for (org.eclipse.sumo.libsumo.TraCIPosition traciPosition : shapeVector) {
            shape.add(new Position(CartesianPoint.xy(traciPosition.getX(), traciPosition.getY())));
        }
```

## RuleId[id=ComparatorMethodParameterNotUsed]
### ComparatorMethodParameterNotUsed
Comparator does not return 0 for equal elements
in `rti/mosaic-rti-api/src/main/java/org/eclipse/mosaic/rti/api/time/FederateEvent.java`
#### Snippet
```java

    @Override
    public int compareTo(@Nonnull FederateEvent event) {
        if (event.requestedTime == this.requestedTime) {
            int priorityCompare = FederatePriority.compareTo(event.priority, this.priority);
```

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `ApplicationInteraction()` of an abstract class should not be declared 'public'
in `lib/mosaic-interactions/src/main/java/org/eclipse/mosaic/interactions/application/ApplicationInteraction.java`
#### Snippet
```java
     *               all simulation simulated units will be notified.
     */
    public ApplicationInteraction(long time, @Nullable String unitId) {
        super(time);
        this.unitId = unitId;
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractEnumDefaultValueTypeAdapter()` of an abstract class should not be declared 'public'
in `lib/mosaic-utils/src/main/java/org/eclipse/mosaic/lib/util/gson/AbstractEnumDefaultValueTypeAdapter.java`
#### Snippet
```java
    private final E defaultValue;

    public AbstractEnumDefaultValueTypeAdapter(E defaultValue) {
        this.defaultValue = defaultValue;
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `UnitData()` of an abstract class should not be declared 'public'
in `lib/mosaic-objects/src/main/java/org/eclipse/mosaic/lib/objects/UnitData.java`
#### Snippet
```java
     * @param position position of the unit
     */
    public UnitData(long time, String name, GeoPoint position) {
        this.time = time;
        this.name = name;
```

### NonProtectedConstructorInAbstractClass
Constructor `V2xMessage()` of an abstract class should not be declared 'public'
in `lib/mosaic-objects/src/main/java/org/eclipse/mosaic/lib/objects/v2x/V2xMessage.java`
#### Snippet
```java
     * @param routing the routing configuration of this {@link V2xMessage}.
     */
    public V2xMessage(final MessageRouting routing) {
        this.routing = Objects.requireNonNull(routing);
        id = idGenerator.getAndIncrement();
```

### NonProtectedConstructorInAbstractClass
Constructor `TrafficSign()` of an abstract class should not be declared 'public'
in `lib/mosaic-objects/src/main/java/org/eclipse/mosaic/lib/objects/trafficsign/TrafficSign.java`
#### Snippet
```java
     * @param connectionId     The corresponding edge of the sign.
     */
    public TrafficSign(String id, Position position, String connectionId) {
        this.id = id;
        this.position = position.getProjectedPosition();
```

### NonProtectedConstructorInAbstractClass
Constructor `CellModule()` of an abstract class should not be declared 'public'
in `fed/mosaic-cell/src/main/java/org/eclipse/mosaic/fed/cell/module/CellModule.java`
#### Snippet
```java
    protected final ChainManager chainManager;

    public CellModule(String moduleName, ChainManager chainManager) {
        this.moduleName = moduleName;
        this.chainManager = chainManager;
```

### NonProtectedConstructorInAbstractClass
Constructor `ConfigurableApplication()` of an abstract class should not be declared 'public'
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/app/ConfigurableApplication.java`
#### Snippet
```java
     * @param configurationFileName The name identifying the configuration file.
     */
    public ConfigurableApplication(Class<? extends ConfigT> configClass, String configurationFileName) {
        this.configClass = configClass;
        this.configFileName = ObjectUtils.defaultIfNull(configurationFileName, this.getClass().getSimpleName());
```

### NonProtectedConstructorInAbstractClass
Constructor `ConfigurableApplication()` of an abstract class should not be declared 'public'
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/app/ConfigurableApplication.java`
#### Snippet
```java
     * @param configClass The class of the config.
     */
    public ConfigurableApplication(Class<? extends ConfigT> configClass) {
        this(configClass, null);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `SpatialObject()` of an abstract class should not be declared 'public'
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/simulation/perception/index/objects/SpatialObject.java`
#### Snippet
```java
    final MutableCartesianPoint cartesianPosition = new MutableCartesianPoint();

    public SpatialObject(String id) {
        this.id = id;
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `LineString()` of an abstract class should not be declared 'public'
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/spatial/LineString.java`
#### Snippet
```java
    }

    public LineString(Stream<? extends T> points) {
        points.forEach(this::addPoint);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `LineString()` of an abstract class should not be declared 'public'
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/spatial/LineString.java`
#### Snippet
```java
    public LineString() { }

    public LineString(List<? extends T> copyFrom) {
        super(copyFrom);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `LineString()` of an abstract class should not be declared 'public'
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/spatial/LineString.java`
#### Snippet
```java
    }

    public LineString() { }

    public LineString(List<? extends T> copyFrom) {
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractSubscriptionTraciReader()` of an abstract class should not be declared 'public'
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/reader/AbstractSubscriptionTraciReader.java`
#### Snippet
```java
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    public AbstractSubscriptionTraciReader() {
        super(null);
    }
```

## RuleId[id=Convert2Lambda]
### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `rti/mosaic-starter/src/main/java/org/eclipse/mosaic/starter/MosaicSimulation.java`
#### Snippet
```java
        }
        // try to avoid a race condition between the exit of the JVM and logbacks attempt to log
        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            @Override
            public void run() {
```

### Convert2Lambda
Anonymous new Comparator() can be replaced with lambda
in `lib/mosaic-routing/src/main/java/org/eclipse/mosaic/lib/routing/graphhopper/algorithm/AbstractCamvitChoiceRouting.java`
#### Snippet
```java
    private void determinePlateaus(double optimalWeight) {
        plateaus = new PriorityQueue<Plateau>(Math.max(1, relevantEdgesQ.size() / 10),
                new Comparator<Plateau>() {
                    @Override
                    public int compare(Plateau o1, Plateau o2) {
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `fileName`
in `lib/mosaic-database/src/main/java/org/eclipse/mosaic/lib/database/persistence/SQLiteWriter.java`
#### Snippet
```java
        // make sure the file has the correct ending
        if (!fileName.endsWith(".db")) {
            fileName += ".db";
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `obj`
in `lib/mosaic-utils/src/main/java/org/eclipse/mosaic/lib/util/objects/ObjectInstantiation.java`
#### Snippet
```java
            debug("File has been loaded into the destination object.");
        } else {
            obj = createWithDefaultDefaultConstructor();
            if (obj == null) {
                throw new InstantiationException("Could not read or instantiate the object.");
```

### AssignmentToMethodParameter
Assignment to method parameter `speed`
in `lib/mosaic-communication/src/main/java/org/eclipse/mosaic/lib/model/delay/GammaSpeedDelay.java`
#### Snippet
```java
    private static double getSpeedPenalty(double speed) {
        // Convert speed as the graph is fitted to km/h
        speed *= 3.6;
        // Define coefficients as estimated by a fitting algorithm
        final double a = 1;
```

### AssignmentToMethodParameter
Assignment to method parameter `containerName`
in `lib/mosaic-docker/src/main/java/org/eclipse/mosaic/lib/docker/DockerClient.java`
#### Snippet
```java
        }
        // set name of container to default value if it hasn't been set
        containerName = StringUtils.defaultString(containerName, image);
        if (!options.contains("--name")) {
            options.add("--name");
```

### AssignmentToMethodParameter
Assignment to method parameter `additionalFlags`
in `lib/mosaic-routing/src/main/java/org/eclipse/mosaic/lib/routing/graphhopper/util/WayTypeEncoder.java`
#### Snippet
```java
    public static int encode(String wayType, int numberLanes, int additionalFlags) {
        if (highwayTypes.contains(wayType)) {
            additionalFlags |= HIGHWAY;
        }
        if (residentialTypes.contains(wayType)) {
```

### AssignmentToMethodParameter
Assignment to method parameter `additionalFlags`
in `lib/mosaic-routing/src/main/java/org/eclipse/mosaic/lib/routing/graphhopper/util/WayTypeEncoder.java`
#### Snippet
```java
        }
        if (residentialTypes.contains(wayType)) {
            additionalFlags |= RESIDENTIAL;
        }
        if (numberLanes == 1 && !oneLaneIgnoreTypes.contains(wayType)) {
```

### AssignmentToMethodParameter
Assignment to method parameter `additionalFlags`
in `lib/mosaic-routing/src/main/java/org/eclipse/mosaic/lib/routing/graphhopper/util/WayTypeEncoder.java`
#### Snippet
```java
        }
        if (numberLanes == 1 && !oneLaneIgnoreTypes.contains(wayType)) {
            additionalFlags |= ONE_LANE;
        }
        if (mainroadTypes.contains(wayType)) {
```

### AssignmentToMethodParameter
Assignment to method parameter `additionalFlags`
in `lib/mosaic-routing/src/main/java/org/eclipse/mosaic/lib/routing/graphhopper/util/WayTypeEncoder.java`
#### Snippet
```java
        }
        if (mainroadTypes.contains(wayType)) {
            additionalFlags |= MAIN_ROAD;
        }
        if (cyclewayTypes.contains(wayType)) {
```

### AssignmentToMethodParameter
Assignment to method parameter `additionalFlags`
in `lib/mosaic-routing/src/main/java/org/eclipse/mosaic/lib/routing/graphhopper/util/WayTypeEncoder.java`
#### Snippet
```java
        }
        if (cyclewayTypes.contains(wayType)) {
            additionalFlags |= CYCLEWAY;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `geoArea`
in `fed/mosaic-cell/src/main/java/org/eclipse/mosaic/fed/cell/utility/RegionUtility.java`
#### Snippet
```java
        } else {
            if (geoArea instanceof GeoRectangle) {
                geoArea = ((GeoRectangle) geoArea).toPolygon();
            }
            CartesianPolygon destPolygon = ((GeoPolygon) geoArea).toCartesian();
```

### AssignmentToMethodParameter
Assignment to method parameter `maxDepth`
in `lib/mosaic-utils/src/main/java/org/eclipse/mosaic/lib/util/FileUtils.java`
#### Snippet
```java

        final Set<File> matchingSet = new HashSet<>();
        while (maxDepth-- > 0) {
            if (searchSet.size() > 0) {
                Set<File> newDirectorySet = new HashSet<>();
```

### AssignmentToMethodParameter
Assignment to method parameter `currentPosition`
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/navigation/CentralNavigationComponent.java`
#### Snippet
```java
        for (String nodeId : nodeList) {
            distanceToPoint += currentPosition.distanceTo(getPositionOfNode(nodeId));
            currentPosition = getPositionOfNode(nodeId);
        }
        return distanceToPoint;
```

### AssignmentToMethodParameter
Assignment to method parameter `a`
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/math/MathUtils.java`
#### Snippet
```java
        if (a > Math.PI) {
            int mul = (int) (a / Math.PI) + 1;
            a -= Math.PI * mul;
        } else if (a < -Math.PI) {
            int mul = (int) (a / Math.PI) - 1;
```

### AssignmentToMethodParameter
Assignment to method parameter `a`
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/math/MathUtils.java`
#### Snippet
```java
        } else if (a < -Math.PI) {
            int mul = (int) (a / Math.PI) - 1;
            a -= Math.PI * mul;
        }
        return a;
```

### AssignmentToMethodParameter
Assignment to method parameter `position`
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/spatial/LineString.java`
#### Snippet
```java
            double l = get(i).distanceTo(get(i + 1));
            if (l < position) {
                position -= l;
            } else {
                get(i + 1).subtract(get(i), result).norm();
```

### AssignmentToMethodParameter
Assignment to method parameter `position`
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/spatial/LineString.java`
#### Snippet
```java
        checkNotSingular();
        for (int i = 0; i < size() - 1; i++) {
            position -= get(i).distanceTo(get(i + 1));
            if (position < 0) {
                return i;
```

### AssignmentToMethodParameter
Assignment to method parameter `text`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/util/TrafficSignImageCreator.java`
#### Snippet
```java

                // Add text (lane index)
                text = "" + lane;
                int maxWidth = width - 6 * borderWidth;
                Dimension textSize = makeTextFitDimension(g, new Dimension(maxWidth, maxWidth), text, false);
```

### AssignmentToMethodParameter
Assignment to method parameter `dSqr`
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/spatial/QuadTreeTraversal.java`
#### Snippet
```java
                if (d < dSqr && (filter == null || filter.test((T) oan.object))) {
                    o = oan;
                    dSqr = d;
                }
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `dSqr`
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/spatial/QuadTreeTraversal.java`
#### Snippet
```java
                    if (r != null) {
                        // found vehicle in child node that is nearer tha dSqr
                        dSqr = r.objectPos.distanceSqrTo(center);
                        o = r;
                    }
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `lib/mosaic-network/src/main/java/org/eclipse/mosaic/lib/coupling/AbstractNetworkAmbassador.java`
#### Snippet
```java
    private synchronized VehicleData fetchVehicleDataFromLastUpdate(String vehicleId) {
        if (latestVehicleUpdates == null) {
            return null;
        }
        // see if vehicle was added or updated within the last vehicle update
```

### ReturnNull
Return of `null`
in `lib/mosaic-database/src/main/java/org/eclipse/mosaic/lib/database/road/Restriction.java`
#### Snippet
```java
                return Type.Only;
            }
            return null;
        }

```

### ReturnNull
Return of `null`
in `lib/mosaic-database/src/main/java/org/eclipse/mosaic/lib/database/spatial/NodeFinder.java`
#### Snippet
```java
            NodeWrapper result = nodeSearch.getNearest();
            if (result == null) {
                return null;
            }
            return result.node;
```

### ReturnNull
Return of `null`
in `lib/mosaic-database/src/main/java/org/eclipse/mosaic/lib/database/DatabaseUtils.java`
#### Snippet
```java
            log.warn("either the 'from' or the 'to' node of the connection to check against "
                    + "duplicates was not found in the database, this COULD be an unwanted inconsistency");
            return null;
        }

```

### ReturnNull
Return of `null`
in `lib/mosaic-database/src/main/java/org/eclipse/mosaic/lib/database/DatabaseUtils.java`
#### Snippet
```java
                    log.warn("a duplicate connection was found referenced in the nodes but not "
                            + "in the database, this COULD be an unwanted inconsistency.");
                    return null;
                }

```

### ReturnNull
Return of `null`
in `lib/mosaic-database/src/main/java/org/eclipse/mosaic/lib/database/DatabaseUtils.java`
#### Snippet
```java
                    for (int i = 0; i < currentConnectionNodes.size(); i++) {
                        if (!connectionNodes.get(i).equals(currentConnectionNodes.get(i))) {
                            return null;
                        }
                    }
```

### ReturnNull
Return of `null`
in `lib/mosaic-database/src/main/java/org/eclipse/mosaic/lib/database/DatabaseUtils.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `lib/mosaic-database/src/main/java/org/eclipse/mosaic/lib/database/DatabaseUtils.java`
#### Snippet
```java
        final List<Node> nodes = connection.getNodes();
        if (nodes.isEmpty()) {
            return null;
        }
        if (index < 0) {
```

### ReturnNull
Return of `null`
in `lib/mosaic-database/src/main/java/org/eclipse/mosaic/lib/database/spatial/EdgeFinder.java`
#### Snippet
```java
            EdgeWrapper result = edgeSearch.getNearest();
            if (result == null) {
                return null;
            }
            return result.edge;
```

### ReturnNull
Return of `null`
in `lib/mosaic-database/src/main/java/org/eclipse/mosaic/lib/database/persistence/SQLiteTypeDetector.java`
#### Snippet
```java
        if (!file.exists()) {
            log.debug("file '{}': does not exist, invalid path set?", file);
            return null;
        }

```

### ReturnNull
Return of `null`
in `lib/mosaic-database/src/main/java/org/eclipse/mosaic/lib/database/persistence/SQLiteTypeDetector.java`
#### Snippet
```java
        if (!file.canRead()) {
            log.debug("file '{}': cannot read file", file);
            return null;
        }

```

### ReturnNull
Return of `null`
in `lib/mosaic-database/src/main/java/org/eclipse/mosaic/lib/database/persistence/SQLiteTypeDetector.java`
#### Snippet
```java
        if (file.length() < forComparison.length()) {
            log.debug("file '{}': file size indicates it can't be a sqlite file", file.getAbsolutePath());
            return null;
        }

```

### ReturnNull
Return of `null`
in `lib/mosaic-database/src/main/java/org/eclipse/mosaic/lib/database/persistence/SQLiteTypeDetector.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `lib/mosaic-database/src/main/java/org/eclipse/mosaic/lib/database/persistence/SQLiteAccess.java`
#### Snippet
```java
        @Override
        protected <T> T get(String columnName, T defaultValue, Function<Object, T> objectMapper) {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `lib/mosaic-database/src/main/java/org/eclipse/mosaic/lib/database/persistence/SQLiteAccess.java`
#### Snippet
```java
            log.error("- error message: {}", e.getMessage());
            disconnect(statement);
            return null;
        }

```

### ReturnNull
Return of `null`
in `fed/mosaic-sns/src/main/java/org/eclipse/mosaic/fed/sns/ambassador/TransmissionSimulator.java`
#### Snippet
```java
                    destinationAddress
            );
            return null;
        }
        if (dac.getTimeToLive() != SINGLE_HOP_TTL) { // inform about dismissed TTL
```

### ReturnNull
Return of `null`
in `fed/mosaic-sns/src/main/java/org/eclipse/mosaic/fed/sns/ambassador/TransmissionSimulator.java`
#### Snippet
```java
        final String senderName = interaction.getSourceName();
        if (!isValidSender(senderName)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `lib/mosaic-utils/src/main/java/org/eclipse/mosaic/lib/util/gson/AbstractEnumDefaultValueTypeAdapter.java`
#### Snippet
```java
        if (in.peek() == JsonToken.NULL) {
            in.nextNull();
            return null;
        }
        try {
```

### ReturnNull
Return of `null`
in `lib/mosaic-utils/src/main/java/org/eclipse/mosaic/lib/util/gson/PolymorphismTypeAdapterFactory.java`
#### Snippet
```java
                return delegate.fromJsonTree(jsonElement);
            } catch (ClassNotFoundException e) {
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `lib/mosaic-utils/src/main/java/org/eclipse/mosaic/lib/util/cli/CommandLineParser.java`
#### Snippet
```java
        if (args.length == 0 || ArrayUtils.contains(args, "--help") || ArrayUtils.contains(args, "-h")) {
            printHelp();
            return null;
        }

```

### ReturnNull
Return of `null`
in `rti/mosaic-starter/src/main/java/org/eclipse/mosaic/starter/MosaicClassLoader.java`
#### Snippet
```java
            return path.toUri().toURL();
        } catch (MalformedURLException e) {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `fed/mosaic-sns/src/main/java/org/eclipse/mosaic/fed/sns/model/SophisticatedAdhocTransmissionModel.java`
#### Snippet
```java
            String forwardingEntityName = getForwardingEntity(reachableEntities, receivers);
            if (forwardingEntityName == null) { // if no entity to forward the message to was found, Forwarding fails
                return null;
            }
            // simulate the transmission to the forwarding entity
```

### ReturnNull
Return of `null`
in `fed/mosaic-sns/src/main/java/org/eclipse/mosaic/fed/sns/model/SophisticatedAdhocTransmissionModel.java`
#### Snippet
```java
                    );
            if (!transmissionResult.success) { // whenever the transmission on the way to the destination area fails, everything fails
                return null;
            }
            transmissionResult.numberOfHops = previousTransmissionResult.numberOfHops + 1;
```

### ReturnNull
Return of `null`
in `fed/mosaic-sns/src/main/java/org/eclipse/mosaic/fed/sns/model/SophisticatedAdhocTransmissionModel.java`
#### Snippet
```java
        }
        // if destination area couldn't be reached in ttl, fail
        return null;

    }
```

### ReturnNull
Return of `null`
in `rti/mosaic-starter/src/main/java/org/eclipse/mosaic/starter/MosaicSimulation.java`
#### Snippet
```java
        } catch (Exception e) {
            getLogger().warn("Could not read the log folder from " + logbackConfigPath, e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `fed/mosaic-mapping/src/main/java/org/eclipse/mosaic/fed/mapping/ambassador/weighting/DeterministicSelector.java`
#### Snippet
```java

        if (selectedItem == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `lib/mosaic-objects/src/main/java/org/eclipse/mosaic/lib/objects/v2x/EncodedPayload.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `lib/mosaic-objects/src/main/java/org/eclipse/mosaic/lib/objects/v2x/etsi/CamContent.java`
#### Snippet
```java
    public byte[] getUserTaggedValue() {
        if (userTaggedValue == null) {
            return null;
        }
        return userTaggedValue.clone();
```

### ReturnNull
Return of `null`
in `fed/mosaic-mapping/src/main/java/org/eclipse/mosaic/fed/mapping/ambassador/SpawningFramework.java`
#### Snippet
```java
        }
        // if no types could be defined
        return null;
    }

```

### ReturnNull
Return of `null`
in `fed/mosaic-mapping/src/main/java/org/eclipse/mosaic/fed/mapping/ambassador/SpawningFramework.java`
#### Snippet
```java
    CPrototype getPrototypeByName(String name) {
        if (name == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `fed/mosaic-mapping/src/main/java/org/eclipse/mosaic/fed/mapping/ambassador/SpawningFramework.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `lib/mosaic-objects/src/main/java/org/eclipse/mosaic/lib/objects/road/SimpleRoadPosition.java`
#### Snippet
```java
        @Override
        public IWay getWay() {
            return null;
        }

```

### ReturnNull
Return of `null`
in `lib/mosaic-objects/src/main/java/org/eclipse/mosaic/lib/objects/road/SimpleRoadPosition.java`
#### Snippet
```java
        @Override
        public INode getEndNode() {
            return null;
        }

```

### ReturnNull
Return of `null`
in `lib/mosaic-objects/src/main/java/org/eclipse/mosaic/lib/objects/road/SimpleRoadPosition.java`
#### Snippet
```java
        @Override
        public GeoPoint getPosition() {
            return null;
        }

```

### ReturnNull
Return of `null`
in `lib/mosaic-objects/src/main/java/org/eclipse/mosaic/lib/objects/road/SimpleRoadPosition.java`
#### Snippet
```java
        @Override
        public INode getStartNode() {
            return null;
        }

```

### ReturnNull
Return of `null`
in `lib/mosaic-objects/src/main/java/org/eclipse/mosaic/lib/objects/electricity/ChargingStationData.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `lib/mosaic-objects/src/main/java/org/eclipse/mosaic/lib/objects/addressing/IpResolver.java`
#### Snippet
```java
        return hostname != null
                ? addressMap.get(hostname)
                : null;
    }

```

### ReturnNull
Return of `null`
in `lib/mosaic-objects/src/main/java/org/eclipse/mosaic/lib/objects/addressing/IpResolver.java`
#### Snippet
```java
        return address != null
                ? addressMap.inverse().get(address)
                : null;
    }

```

### ReturnNull
Return of `null`
in `lib/mosaic-objects/src/main/java/org/eclipse/mosaic/lib/objects/trafficsign/TrafficSignSpeed.java`
#### Snippet
```java
    public SpeedLimit getSpeedLimit(int lane) {
        if (lane < 0 || lane >= getSignContents().size()) {
            return null;
        }
        return getSignContents().get(lane);
```

### ReturnNull
Return of `null`
in `lib/mosaic-objects/src/main/java/org/eclipse/mosaic/lib/objects/trafficsign/TrafficSignSpeed.java`
#### Snippet
```java
                        return speedLimit.clone();
                    } catch (Exception e) {
                        return null;
                    }
                })
```

### ReturnNull
Return of `null`
in `rti/mosaic-rti-api/src/main/java/org/eclipse/mosaic/rti/api/AbstractFederateAmbassador.java`
#### Snippet
```java
                return this.poll();
            }
            return null;
        }

```

### ReturnNull
Return of `null`
in `rti/mosaic-rti-api/src/main/java/org/eclipse/mosaic/rti/api/federatestarter/NopFederateExecutor.java`
#### Snippet
```java
    public Process startLocalFederate(File workingDir) {
        //nop
        return null;
    }

```

### ReturnNull
Return of `null`
in `rti/mosaic-rti-api/src/main/java/org/eclipse/mosaic/rti/config/CHosts.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `rti/mosaic-rti-api/src/main/java/org/eclipse/mosaic/rti/config/CHosts.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `lib/mosaic-objects/src/main/java/org/eclipse/mosaic/lib/objects/trafficsign/TrafficSignLaneAssignment.java`
#### Snippet
```java
    public LaneAssignment getLaneAssignment(int lane) {
        if (lane < 0 || lane >= getSignContents().size()) {
            return null;
        }
        return getSignContents().get(lane);
```

### ReturnNull
Return of `null`
in `lib/mosaic-objects/src/main/java/org/eclipse/mosaic/lib/objects/trafficsign/TrafficSignLaneAssignment.java`
#### Snippet
```java
                        return laneAssignment.clone();
                    } catch (Exception e) {
                        return null;
                    }
                })
```

### ReturnNull
Return of `null`
in `lib/mosaic-routing/src/main/java/org/eclipse/mosaic/lib/routing/database/LazyLoadingNode.java`
#### Snippet
```java
            scenarioDatabaseNode = database.getNode(getId());
        }
        return scenarioDatabaseNode != null ? scenarioDatabaseNode.getPosition() : null;
    }

```

### ReturnNull
Return of `null`
in `lib/mosaic-routing/src/main/java/org/eclipse/mosaic/lib/routing/norouting/NoRouting.java`
#### Snippet
```java
    @Override
    public IRoadPosition findClosestRoadPosition(GeoPoint point) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `lib/mosaic-routing/src/main/java/org/eclipse/mosaic/lib/routing/norouting/NoRouting.java`
#### Snippet
```java
    @Override
    public INode getNode(String nodeId) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `lib/mosaic-routing/src/main/java/org/eclipse/mosaic/lib/routing/norouting/NoRouting.java`
#### Snippet
```java
    @Override
    public IConnection getConnection(String nodeId) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `lib/mosaic-routing/src/main/java/org/eclipse/mosaic/lib/routing/norouting/NoRouting.java`
#### Snippet
```java
    @Override
    public INode findClosestNode(GeoPoint point) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `lib/mosaic-routing/src/main/java/org/eclipse/mosaic/lib/routing/norouting/NoRouting.java`
#### Snippet
```java
    @Override
    public VehicleRoute createRouteForRTI(CandidateRoute candidateRoute) throws IllegalRouteException {
        return null;
    }

```

### ReturnNull
Return of `null`
in `lib/mosaic-routing/src/main/java/org/eclipse/mosaic/lib/routing/util/RouteFixer.java`
#### Snippet
```java
    private List<Connection> findIntermediateConnectionsRecursively(Connection from, Connection to, int depth) {
        if (depth == 0) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `lib/mosaic-routing/src/main/java/org/eclipse/mosaic/lib/routing/database/LazyLoadingConnection.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `lib/mosaic-routing/src/main/java/org/eclipse/mosaic/lib/routing/database/DatabaseRouting.java`
#### Snippet
```java
        File[] dirs = baseDir.listFiles();
        if (dirs == null) {
            return null;
        }
        for (File file : dirs) {
```

### ReturnNull
Return of `null`
in `lib/mosaic-routing/src/main/java/org/eclipse/mosaic/lib/routing/database/DatabaseRouting.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `lib/mosaic-routing/src/main/java/org/eclipse/mosaic/lib/routing/database/DatabaseRouting.java`
#### Snippet
```java
        return node != null
                ? new LazyLoadingNode(node)
                : null;
    }

```

### ReturnNull
Return of `null`
in `lib/mosaic-routing/src/main/java/org/eclipse/mosaic/lib/routing/database/DatabaseRouting.java`
#### Snippet
```java
        Edge closestEdge = findClosestEdge(location);
        if (closestEdge == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `lib/mosaic-routing/src/main/java/org/eclipse/mosaic/lib/routing/graphhopper/DatabaseGraphLoader.java`
#### Snippet
```java
            return encoding.handleWayTags(osmWay, aw, 0);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `lib/mosaic-routing/src/main/java/org/eclipse/mosaic/lib/routing/graphhopper/algorithm/BellmanFordRouting.java`
#### Snippet
```java
            return new Path(this.graph, this.weighting).setWeight(toNode.weight).setSPTEntry(toNode).extract();
        }
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `lib/mosaic-routing/src/main/java/org/eclipse/mosaic/lib/routing/graphhopper/GraphHopperRouting.java`
#### Snippet
```java
        double distanceToOriginalTarget = distanceCalculation.calcDist(pathTarget.lat, pathTarget.lon, origTarget.lat, origTarget.lon);
        if (distanceToOriginalTarget > MAX_DISTANCE_TO_TARGET) {
            return null;
        }
        Iterator<EdgeIteratorState> edgesIt = newPath.calcEdges().iterator();
```

### ReturnNull
Return of `null`
in `lib/mosaic-routing/src/main/java/org/eclipse/mosaic/lib/routing/graphhopper/GraphHopperRouting.java`
#### Snippet
```java
        Iterator<EdgeIteratorState> edgesIt = newPath.calcEdges().iterator();
        if (!edgesIt.hasNext()) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `lib/mosaic-routing/src/main/java/org/eclipse/mosaic/lib/routing/graphhopper/GraphHopperRouting.java`
#### Snippet
```java
                            "Something went wrong during path search: The found route has infinite weight. Maybe there's a turn restriction or unconnected "
                                    + "sub-graphs in the network. Route will be ignored.");
                    return null;
                }
            } else {
```

### ReturnNull
Return of `null`
in `lib/mosaic-routing/src/main/java/org/eclipse/mosaic/lib/routing/graphhopper/algorithm/AbstractCamvitChoiceRouting.java`
#### Snippet
```java
    private PlateauPath createPathFromPlateau(PlateauPath optimalPath) {
        if (plateaus.isEmpty()) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `fed/mosaic-cell/src/main/java/org/eclipse/mosaic/fed/cell/data/ConfigurationData.java`
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
in `fed/mosaic-cell/src/main/java/org/eclipse/mosaic/fed/cell/viz/BandwidthMeasurementManager.java`
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
in `fed/mosaic-cell/src/main/java/org/eclipse/mosaic/fed/cell/data/SimulationData.java`
#### Snippet
```java
    public CartesianPoint getPositionOfNode(String nodeId) {
        SimulationNode node = simulationNodeMap.get(nodeId);
        return node != null ? node.position : null;
    }

```

### ReturnNull
Return of `null`
in `fed/mosaic-cell/src/main/java/org/eclipse/mosaic/fed/cell/data/SimulationData.java`
#### Snippet
```java
    public CNetworkProperties getRegionOfNode(String nodeId) {
        SimulationNode node = simulationNodeMap.get(nodeId);
        return node != null ? node.region : null;
    }

```

### ReturnNull
Return of `null`
in `fed/mosaic-cell/src/main/java/org/eclipse/mosaic/fed/cell/utility/RegionUtility.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `fed/mosaic-cell/src/main/java/org/eclipse/mosaic/fed/cell/utility/RegionsIndex.java`
#### Snippet
```java
        inArea.traverse(regionIndex);

        return inArea.getNearest() != null ? inArea.getNearest().areaRegion : null;
    }

```

### ReturnNull
Return of `null`
in `fed/mosaic-cell/src/main/java/org/eclipse/mosaic/fed/cell/ambassador/CellAmbassador.java`
#### Snippet
```java
    private VehicleData fetchVehicleDataFromLastUpdate(String vehicleId) {
        if (latestVehicleUpdates == null) {
            return null;
        }
        // see if vehicle was added or updated within the last vehicle update
```

### ReturnNull
Return of `null`
in `fed/mosaic-output/src/main/java/org/eclipse/mosaic/fed/output/generator/file/format/MethodElement.java`
#### Snippet
```java

        if (!this.hasInitialized()) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `fed/mosaic-output/src/main/java/org/eclipse/mosaic/fed/output/generator/file/format/MethodElement.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `fed/mosaic-output/src/main/java/org/eclipse/mosaic/fed/output/generator/file/format/MethodElement.java`
#### Snippet
```java

        if (declareObj == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `fed/mosaic-output/src/main/java/org/eclipse/mosaic/fed/output/generator/file/format/MethodElement.java`
#### Snippet
```java
            } else {
                // if a null object is returned, then stop invoking remaining methods
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/app/etsi/VehicleCamSendingApp.java`
#### Snippet
```java
        // failsafe
        if (vehicleData == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/app/etsi/AbstractCamSendingApp.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/app/etsi/AbstractCamSendingApp.java`
#### Snippet
```java
                    return doubleDelta.toString();
                }
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `fed/mosaic-output/src/main/java/org/eclipse/mosaic/fed/output/generator/file/format/MethodManager.java`
#### Snippet
```java
        int i = method.indexOf(":");
        if (i == -1) {
            return null;
        } else {
            return method.substring(0, i);
```

### ReturnNull
Return of `null`
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/util/ClassNameParser.java`
#### Snippet
```java
        Matcher m = classPattern.matcher(className);
        if (!m.matches()) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/navigation/CentralNavigationComponent.java`
#### Snippet
```java
            return getPositionOfNode(firstNodeId);
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/navigation/CentralNavigationComponent.java`
#### Snippet
```java
        // check if there is an upcoming node
        if (indexOfUpcomingNode < 0) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/navigation/CentralNavigationComponent.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/navigation/CentralNavigationComponent.java`
#### Snippet
```java
                    } catch (IllegalRouteException e) {
                        log.error("[CNC.createRouteForODInfo]: Could not create route.", e);
                        return null;
                    } catch (InternalFederateException e) {
                        log.error("[CNC.createRouteForODInfo]: unable to send PropagateRoute message.", e);
```

### ReturnNull
Return of `null`
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/navigation/CentralNavigationComponent.java`
#### Snippet
```java
                    } catch (InternalFederateException e) {
                        log.error("[CNC.createRouteForODInfo]: unable to send PropagateRoute message.", e);
                        return null;
                    }
                }
```

### ReturnNull
Return of `null`
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/navigation/CentralNavigationComponent.java`
#### Snippet
```java

        log.error("[CNC.createRouteForODInfo]: Insufficient or wrong data in OD info.");
        return null;
    }

```

### ReturnNull
Return of `null`
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/navigation/CentralNavigationComponent.java`
#### Snippet
```java
    public IRoadPosition refineRoadPosition(IRoadPosition roadPosition) {
        if (roadPosition == null) {
            return null;
        }
        return routing.refineRoadPosition(roadPosition);
```

### ReturnNull
Return of `null`
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/navigation/CentralNavigationComponent.java`
#### Snippet
```java
            return getPositionOfNode(lastNodeId);
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/navigation/NavigationModule.java`
#### Snippet
```java
        } catch (IllegalArgumentException e) {
            belongingUnit.getOsLog().warn("NavigationModule#getNextTrafficLightNode received an invalid parameter", e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/navigation/NavigationModule.java`
#### Snippet
```java
    @Override
    public IRoadPosition getRoadPosition() {
        return vehicleData == null ? null : vehicleData.getRoadPosition();
    }

```

### ReturnNull
Return of `null`
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/navigation/NavigationModule.java`
#### Snippet
```java
        } catch (IllegalArgumentException e) {
            belongingUnit.getOsLog().warn("NavigationModule#getNextJunctionNode received an invalid parameter", e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/simulation/VehicleUnit.java`
#### Snippet
```java
        if (vehicleData == null) {
            getOsLog().warn("Cannot assemble CAM because " + this.getId() + " isn't ready yet.");
            return null;
        }

```

### ReturnNull
Return of `null`
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/simulation/perception/index/providers/SumoIndex.java`
#### Snippet
```java
    @Override
    public List<VehicleObject> getVehiclesInRange(PerceptionModel perceptionModel) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/simulation/communication/CellModule.java`
#### Snippet
```java
        if (!isEnabled()) {
            log.warn("sendCAM: Cell communication disabled (!cellModule.isEnabled()).");
            return null;
        }
        if (configuration == null || configuration.getCamConfiguration() == null) {
```

### ReturnNull
Return of `null`
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/simulation/communication/CellModule.java`
#### Snippet
```java
        if (configuration == null || configuration.getCamConfiguration() == null) {
            log.warn("sendCAM: No camConfiguration with addressingMode and geoRadius given.");
            return null;
        }
        CellModuleConfiguration.CellCamConfiguration camConfiguration = configuration.getCamConfiguration();
```

### ReturnNull
Return of `null`
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/simulation/communication/AdHocModule.java`
#### Snippet
```java
        if (!isEnabled()) {
            log.warn("sendCAM: Ad hoc communication disabled (!adhocModule.isEnabled()).");
            return null;
        }

```

### ReturnNull
Return of `null`
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/gson/GeoAreaAdapterFactory.java`
#### Snippet
```java
                    : TYPE_RECTANGLE.equalsIgnoreCase(type) ? GeoRectangle.class
                    : TYPE_POLYGON.equalsIgnoreCase(type) ? GeoPolygon.class
                    : null;
        }

```

### ReturnNull
Return of `null`
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/gson/GeoAreaAdapterFactory.java`
#### Snippet
```java
                    : GeoRectangle.class.isAssignableFrom(typeClass) ? TYPE_RECTANGLE
                    : GeoPolygon.class.isAssignableFrom(typeClass) ? TYPE_POLYGON
                    : null;
        }
    }
```

### ReturnNull
Return of `null`
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/spatial/AStar.java`
#### Snippet
```java
            return route;
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/util/TrafficSignManager.java`
#### Snippet
```java
    private String getImageForLaneAssignment(LaneAssignment laneAssignment) {
        if (imageCreatorSpeedLimits == null || imageCreatorLaneAssignments == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/util/TrafficSignManager.java`
#### Snippet
```java
    private String getImageForSpeedLimit(SpeedLimit speedLimit) {
        if (imageCreatorSpeedLimits == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/CommandRegister.java`
#### Snippet
```java
                return (Class<T>) Class.forName(newClassName);
            } catch (ClassNotFoundException e) {
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/CommandRegister.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/util/SumoVehicleTypesWriter.java`
#### Snippet
```java
            log.warn("Couldn't instantiate DocumentBuilder, this will result in no additional-file being written");
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/spatial/QuadTreeTraversal.java`
#### Snippet
```java
    static <T> T getNearestObject(QuadTree<T> tree, Vector3d center, Predicate<T> filter) {
        QuadTree<T>.ObjectAndNode r = selectNearest(tree.getRoot(), center, Double.MAX_VALUE, filter);
        return r != null ? r.object : null;
    }

```

### ReturnNull
Return of `null`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/RouteAdd.java`
#### Snippet
```java
    @Override
    protected List<String> constructResult(Status status, Object... objects) {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/reader/AbstractTraciResultReader.java`
#### Snippet
```java
            throw new IOException("Matcher of " + this.getClass().getSimpleName() + " failed.");
        } else if (matcher != null) {
            return null;
        }
        return result;
```

### ReturnNull
Return of `null`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/facades/VehicleFacade.java`
#### Snippet
```java
        } catch (IllegalArgumentException | CommandException e) {
            log.error("Could not retrieve or transform parameter {} for vehicle {}.", parameterName, vehicleId);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/libsumo/SimulationSimulateStep.java`
#### Snippet
```java
    private List<PublicTransportData.StoppingPlace> getNextStop(TraCINextStopDataVector2 stops) {
        if (stops.isEmpty()) {
            return null;
        }
        List<PublicTransportData.StoppingPlace> nextStops = new ArrayList<>();
```

### ReturnNull
Return of `null`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/libsumo/SimulationSimulateStep.java`
#### Snippet
```java
        try {
            if (traCIPosition.getX() < -1000 && traCIPosition.getY() < -1000) {
                return null;
            }
            return new Position(CartesianPoint.xyz(traCIPosition.getX(), traCIPosition.getY(), traCIPosition.getZ() < -1000 ? 0 : traCIPosition.getZ()));
```

### ReturnNull
Return of `null`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/facades/TrafficLightFacade.java`
#### Snippet
```java
                    );
            if (trafficLights.isEmpty()) { // railway signals can be defined without a phase logic and will be ignored
                return null;
            }
            return new TrafficLightGroup(trafficLightGroupId, trafficLightPrograms, trafficLights);
```

### ReturnNull
Return of `null`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/facades/TrafficLightFacade.java`
#### Snippet
```java
            return TrafficLightStateDecoder.createStateListFromEncodedString(getCurrentState.execute(bridge, trafficLightGroupId));
        } catch (CommandException e) {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/facades/SimulationFacade.java`
#### Snippet
```java
    public VehicleData getLastKnownVehicleData(String vehicleId) {
        SumoVehicleState vehicle = sumoVehicles.get(vehicleId);
        return vehicle != null ? vehicle.currentVehicleData : null;
    }

```

### ReturnNull
Return of `null`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/facades/SimulationFacade.java`
#### Snippet
```java
             * We ignore this vehicle until it's added to the simulation. */
            log.debug("Skip vehicle {} which is loaded but not yet simulated.", veh.id);
            return null;
        }

```

### ReturnNull
Return of `null`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/facades/SimulationFacade.java`
#### Snippet
```java
        if (isParking && isNewVehicle) {
            log.warn("Skip vehicle {} which is inserted into simulation in PARKED state.", veh.id);
            return null;
        }

```

### ReturnNull
Return of `null`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/facades/SimulationFacade.java`
#### Snippet
```java
    private IRoadPosition getRoadPosition(VehicleSubscriptionResult veh, VehicleData lastVehicleData) {
        if (veh.edgeId == null) {
            return null;
        }

```

## RuleId[id=BusyWait]
### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `lib/mosaic-docker/src/main/java/org/eclipse/mosaic/lib/docker/DockerClient.java`
#### Snippet
```java
            result = docker.status(name);
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                throw new DockerRuntimeException(e);
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `rti/mosaic-rti-core/src/main/java/org/eclipse/mosaic/rti/WatchDogThread.java`
#### Snippet
```java
        while (watching) {
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                // be quiet
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `rti/mosaic-rti-core/src/main/java/org/eclipse/mosaic/rti/WatchDogThread.java`
#### Snippet
```java
                    // wait a second to complete print lines
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        // be quiet
```

## RuleId[id=RegExpUnnecessaryNonCapturingGroup]
### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:(|k|d|c|m|\\u00b5|n|kilo|deci|centi|milli|micro|nano)(meter|metre|m)(?:p|per|\\/)(h|hr|s|sec|second|hour))`
in `lib/mosaic-utils/src/main/java/org/eclipse/mosaic/lib/util/gson/UnitFieldAdapter.java`
#### Snippet
```java

    private final static Pattern DISTANCE_PATTERN = Pattern.compile("^(-?[0-9]+\\.?[0-9]*) ?((|k|d|c|m|\\u00b5|n|kilo|deci|centi|milli|micro|nano)(miles|mile|meter|metre|m))$");
    private final static Pattern SPEED_PATTERN = Pattern.compile("^([0-9]+\\.?[0-9]*) ?(mph|kmh|(?:(|k|d|c|m|\\u00b5|n|kilo|deci|centi|milli|micro|nano)(meter|metre|m)(?:p|per|\\/)(h|hr|s|sec|second|hour)))$");

    private final static Pattern WEIGHT_PATTERN = Pattern.compile("^(-?[0-9]+\\.?[0-9]*) ?((|k|d|c|m|\\u00b5|n|kilo|deci|centi|milli|micro|nano)(g|gram|grams))$");
```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:\\d+\\.\\d*|\\d+d)`
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/util/ClassNameParser.java`
#### Snippet
```java
    // ^(\d+|\d+\.\d*|\"[^\"\n]*\"|false|true)$
    private final static Pattern parameterPattern =
            Pattern.compile("^(?:((?:\\d+\\.\\d*|\\d+d))|(\\d+l)|(\\d+)|\\\"([^\\\"\\n]*)\\\"|'([^'\\n]*)'|(false|true))$");

    private final Logger logger;
```

## RuleId[id=RedundantFileCreation]
### RedundantFileCreation
`new File` is redundant
in `fed/mosaic-output/src/main/java/org/eclipse/mosaic/fed/output/generator/file/write/WriteByFileCompress.java`
#### Snippet
```java

    public WriteByFileCompress(File file, boolean append) throws IOException {
        super(new GZIPOutputStream(new FileOutputStream(new File(file.getPath() + ".gz"), append)));
    }
}
```

