# mosaic 
 
# Bad smells
I found 352 bad smells with 15 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| FieldMayBeFinal | 63 | false |
| FinalMethodInFinalClass | 46 | false |
| UNCHECKED_WARNING | 29 | false |
| NullableProblems | 24 | false |
| DataFlowIssue | 16 | false |
| JavadocDeclaration | 15 | false |
| UnnecessaryToStringCall | 14 | true |
| DuplicatedCode | 13 | false |
| JavadocLinkAsPlainText | 11 | false |
| UNUSED_IMPORT | 10 | false |
| RegExpRedundantEscape | 7 | false |
| IOStreamConstructor | 7 | false |
| TrivialStringConcatenation | 6 | false |
| TrivialIf | 6 | false |
| PointlessArithmeticExpression | 5 | false |
| Deprecation | 5 | false |
| StringBufferReplaceableByString | 5 | false |
| SuspiciousNameCombination | 5 | false |
| DeprecatedIsStillUsed | 5 | false |
| ManualMinMaxCalculation | 4 | false |
| UnusedAssignment | 4 | false |
| StringOperationCanBeSimplified | 4 | false |
| RedundantCast | 4 | false |
| RedundantMethodOverride | 3 | false |
| ConstantValue | 3 | false |
| BusyWait | 3 | false |
| CommentedOutCode | 2 | false |
| NonFinalFieldInEnum | 2 | false |
| IgnoreResultOfCall | 2 | false |
| IntegerMultiplicationImplicitCastToLong | 2 | false |
| DuplicateThrows | 2 | false |
| TypeParameterExtendsObject | 2 | false |
| SimplifyStreamApiCallChains | 2 | false |
| MismatchedJavadocCode | 2 | false |
| SwitchStatementWithConfusingDeclaration | 2 | false |
| UnnecessaryUnicodeEscape | 2 | false |
| RegExpUnnecessaryNonCapturingGroup | 2 | false |
| UnnecessaryModifier | 1 | true |
| CloneableImplementsClone | 1 | false |
| DuplicateBranchesInSwitch | 1 | false |
| RedundantTypeArguments | 1 | false |
| FieldCanBeLocal | 1 | false |
| SlowListContainsAll | 1 | false |
| OptionalGetWithoutIsPresent | 1 | false |
| UnnecessarySemicolon | 1 | false |
| JavaReflectionMemberAccess | 1 | false |
| SuspiciousMethodCalls | 1 | false |
| AutoCloseableResource | 1 | false |
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
    public Long maxInterval = 1 * TIME.SECOND;

    /**
```

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

## RuleId[id=CloneableImplementsClone]
### CloneableImplementsClone
`Interaction` is 'Cloneable' but does not define 'clone()' method
in `rti/mosaic-rti-api/src/main/java/org/eclipse/mosaic/rti/api/Interaction.java`
#### Snippet
```java
 * exchanged between federates.
 */
public abstract class Interaction implements Comparable<Interaction>, Cloneable, Serializable {

    private static final long serialVersionUID = 1L;
```

## RuleId[id=RegExpRedundantEscape]
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

## RuleId[id=FinalMethodInFinalClass]
### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/simulation/VehicleParameters.java`
#### Snippet
```java
    }

    public final double getSpeedFactor() {
        return speedFactor;
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/simulation/VehicleParameters.java`
#### Snippet
```java
    }

    public final double getMaxAcceleration() {
        return maxAcceleration;
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/simulation/VehicleParameters.java`
#### Snippet
```java
    }

    public final double getMaxDeceleration() {
        return maxDeceleration;
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/simulation/VehicleParameters.java`
#### Snippet
```java
    }

    public final VehicleType getInitialVehicleType() {
        return initialVehicleType;
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/simulation/VehicleParameters.java`
#### Snippet
```java
    }

    public final double getMinimumGap() {
        return minimumGap;
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/simulation/VehicleParameters.java`
#### Snippet
```java
    }

    public final LaneChangeMode getLaneChangeMode() {
        return laneChangeMode;
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/simulation/VehicleParameters.java`
#### Snippet
```java
    }

    public final double getReactionTime() {
        return reactionTime;
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/simulation/VehicleParameters.java`
#### Snippet
```java
    }

    public final double getMaxSpeed() {
        return maxSpeed;
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/simulation/VehicleParameters.java`
#### Snippet
```java
    }

    public final double getImperfection() {
        return imperfection;
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/geo/UtmZone.java`
#### Snippet
```java
    }

    public final int getNumber() {
        return number;
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/AbstractTraciCommand.java`
#### Snippet
```java
         */
        @SuppressWarnings("UnusedReturnValue")
        public final TraciCommandWriterBuilder writeDoubleParam() {
            command.writers.add(new DoubleTraciWriter());
            return this;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/AbstractTraciCommand.java`
#### Snippet
```java
         */
        @SuppressWarnings("UnusedReturnValue")
        public final TraciCommandResultReaderBuilder readDoubleWithType() {
            command.readers.add(new ByteTraciReader((Integer i) -> i == TraciDatatypes.DOUBLE));
            command.readers.add(new DoubleTraciReader());
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/AbstractTraciCommand.java`
#### Snippet
```java
         */
        @SuppressWarnings("UnusedReturnValue")
        public final TraciCommandResultReaderBuilder readComplex(AbstractTraciResultReader<?> complexReader) {
            command.readers.add(complexReader);
            return this;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/AbstractTraciCommand.java`
#### Snippet
```java
         */
        @SuppressWarnings("UnusedReturnValue")
        public final TraciCommandWriterBuilder writeStringListParamWithType() {
            writeByte(TraciDatatypes.STRING_LIST);
            return writeStringListParam();
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/AbstractTraciCommand.java`
#### Snippet
```java
         */
        @SuppressWarnings("UnusedReturnValue")
        public final TraciCommandWriterBuilder writeStringParam() {
            command.writers.add(new StringTraciWriter());
            return this;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/AbstractTraciCommand.java`
#### Snippet
```java
         * Defines the command identifier (usually the first writer).
         */
        public final TraciCommandWriterBuilder command(int commandIdentifier) {
            command.writers.add(new ByteTraciWriter(commandIdentifier));
            return this;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/AbstractTraciCommand.java`
#### Snippet
```java
         */
        @SuppressWarnings("UnusedReturnValue")
        public final TraciCommandResultReaderBuilder expectByte(final int expected) {
            command.readers.add(new ByteTraciReader((Integer i) -> i == expected));
            return this;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/AbstractTraciCommand.java`
#### Snippet
```java
         */
        @SuppressWarnings("UnusedReturnValue")
        public final TraciCommandWriterBuilder writeVehicleIdParam() {
            command.writers.add(new VehicleIdTraciWriter());
            return this;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/AbstractTraciCommand.java`
#### Snippet
```java
         */
        @SuppressWarnings("UnusedReturnValue")
        public final TraciCommandWriterBuilder writeStringWithType(String stringValue) {
            writeByte(TraciDatatypes.STRING);
            return writeString(stringValue);
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/AbstractTraciCommand.java`
#### Snippet
```java
         */
        @SuppressWarnings("UnusedReturnValue")
        public final TraciCommandWriterBuilder writeComplex(AbstractTraciParameterWriter<?> complexTraciWriter) {
            command.writers.add(complexTraciWriter);
            return this;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/AbstractTraciCommand.java`
#### Snippet
```java
         */
        @SuppressWarnings("UnusedReturnValue")
        public final TraciCommandWriterBuilder writeDoubleParamWithType() {
            writeByte(TraciDatatypes.DOUBLE);
            command.writers.add(new DoubleTraciWriter());
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/AbstractTraciCommand.java`
#### Snippet
```java
         */
        @SuppressWarnings("UnusedReturnValue")
        public final TraciCommandWriterBuilder writeInt(int intValue) {
            command.writers.add(new IntegerTraciWriter(intValue));
            return this;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/AbstractTraciCommand.java`
#### Snippet
```java
         */
        @SuppressWarnings("UnusedReturnValue")
        public final TraciCommandWriterBuilder writeString(String stringValue) {
            command.writers.add(new StringTraciWriter(stringValue));
            return this;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/AbstractTraciCommand.java`
#### Snippet
```java
         */
        @SuppressWarnings("UnusedReturnValue")
        public final TraciCommandWriterBuilder writeDoubleWithType(double doubleValue) {
            writeByte(TraciDatatypes.DOUBLE);
            return writeDouble(doubleValue);
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/AbstractTraciCommand.java`
#### Snippet
```java
         */
        @SuppressWarnings("UnusedReturnValue")
        public final TraciCommandWriterBuilder writeIntParamWithType() {
            writeByte(TraciDatatypes.INTEGER);
            command.writers.add(new IntegerTraciWriter());
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/AbstractTraciCommand.java`
#### Snippet
```java
         */
        @SuppressWarnings("UnusedReturnValue")
        public final TraciCommandResultReaderBuilder skipString() {
            command.readers.add(new StringTraciReader((String s) -> true));
            return this;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/AbstractTraciCommand.java`
#### Snippet
```java
         */
        @SuppressWarnings("UnusedReturnValue")
        public final TraciCommandResultReaderBuilder readString() {
            command.readers.add(new StringTraciReader());
            return this;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/AbstractTraciCommand.java`
#### Snippet
```java
         */
        @SuppressWarnings("UnusedReturnValue")
        public final TraciCommandResultReaderBuilder readIntegerWithType() {
            command.readers.add(new ByteTraciReader((Integer i) -> i == TraciDatatypes.INTEGER));
            command.readers.add(new IntegerTraciReader());
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/AbstractTraciCommand.java`
#### Snippet
```java
         */
        @SuppressWarnings("UnusedReturnValue")
        public final TraciCommandWriterBuilder writeDouble(double doubleValue) {
            command.writers.add(new DoubleTraciWriter(doubleValue));
            return this;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/AbstractTraciCommand.java`
#### Snippet
```java
         */
        @SuppressWarnings("UnusedReturnValue")
        public final TraciCommandWriterBuilder writeByte(int byteValue) {
            command.writers.add(new ByteTraciWriter(byteValue));
            return this;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/AbstractTraciCommand.java`
#### Snippet
```java
         */
        @SuppressWarnings("UnusedReturnValue")
        public final TraciCommandWriterBuilder writeStringParamWithType() {
            writeByte(TraciDatatypes.STRING);
            return writeStringParam();
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/AbstractTraciCommand.java`
#### Snippet
```java
         */
        @SuppressWarnings("UnusedReturnValue")
        public final TraciCommandResultReaderBuilder expectInteger(final int expected) {
            command.readers.add(new IntegerTraciReader((Integer i) -> i == expected));
            return this;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/AbstractTraciCommand.java`
#### Snippet
```java
         * Defines the variable identifier (usually the second writer).
         */
        public final TraciCommandWriterBuilder variable(int variableIdentifier) {
            command.writers.add(new ByteTraciWriter(variableIdentifier));
            return this;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/AbstractTraciCommand.java`
#### Snippet
```java
         */
        @SuppressWarnings("UnusedReturnValue")
        public final TraciCommandWriterBuilder writeByteParam() {
            command.writers.add(new ByteTraciWriter());
            return this;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/AbstractTraciCommand.java`
#### Snippet
```java
         */
        @SuppressWarnings("UnusedReturnValue")
        public final TraciCommandWriterBuilder writeStringListParam() {
            command.writers.add(new ListTraciWriter<>(new StringTraciWriter()));
            return this;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/AbstractTraciCommand.java`
#### Snippet
```java
         */
        @SuppressWarnings("UnusedReturnValue")
        public final TraciCommandResultReaderBuilder skipBytes(int numberOfBytes) {
            for (int i = 0; i < numberOfBytes; i++) {
                skipByte();
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/AbstractTraciCommand.java`
#### Snippet
```java
         */
        @SuppressWarnings("UnusedReturnValue")
        public final TraciCommandWriterBuilder writeIntWithType(int intValue) {
            writeByte(TraciDatatypes.INTEGER);
            return writeInt(intValue);
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/AbstractTraciCommand.java`
#### Snippet
```java
         * Defines the variable identifier (usually the second writer).
         */
        public final TraciCommandWriterBuilder variable(SumoVar variableIdentifier) {
            command.writers.add(new ByteTraciWriter(variableIdentifier.var));
            return this;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/AbstractTraciCommand.java`
#### Snippet
```java
         */
        @SuppressWarnings("UnusedReturnValue")
        public final TraciCommandResultReaderBuilder readStringWithType() {
            command.readers.add(new ByteTraciReader((Integer i) -> i == TraciDatatypes.STRING));
            command.readers.add(new StringTraciReader());
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/AbstractTraciCommand.java`
#### Snippet
```java
         */
        @SuppressWarnings("UnusedReturnValue")
        public final TraciCommandResultReaderBuilder skipInteger() {
            command.readers.add(new IntegerTraciReader((Integer b) -> true));
            return this;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/AbstractTraciCommand.java`
#### Snippet
```java
        @SuppressWarnings("UnusedReturnValue")

        public final TraciCommandWriterBuilder writeByteParamWithType() {
            writeByte(TraciDatatypes.BYTE);
            command.writers.add(new ByteTraciWriter());
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/AbstractTraciCommand.java`
#### Snippet
```java
         */
        @SuppressWarnings("UnusedReturnValue")
        public final TraciCommandResultReaderBuilder readInteger() {
            command.readers.add(new IntegerTraciReader());
            return this;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/AbstractTraciCommand.java`
#### Snippet
```java
         */
        @SuppressWarnings("UnusedReturnValue")
        public final TraciCommandWriterBuilder writeIntParam() {
            command.writers.add(new IntegerTraciWriter());
            return this;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/AbstractTraciCommand.java`
#### Snippet
```java
         */
        @SuppressWarnings("UnusedReturnValue")
        public final TraciCommandResultReaderBuilder readVehicleIdWithType() {
            command.readers.add(new ByteTraciReader((Integer i) -> i == TraciDatatypes.STRING));
            command.readers.add(new VehicleIdTraciReader());
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/AbstractTraciCommand.java`
#### Snippet
```java
         */
        @SuppressWarnings("UnusedReturnValue")
        public final TraciCommandResultReaderBuilder skipByte() {
            command.readers.add(new ByteTraciReader((Integer i) -> true));
            return this;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `lib/mosaic-objects/src/main/java/org/eclipse/mosaic/lib/objects/v2x/EncodedPayload.java`
#### Snippet
```java
     */
    @SuppressWarnings("unchecked")
    public final <T extends ToDataOutput> T decodePayload() throws IllegalStateException {
        if (contentClassName != null && getBytes() != null && getBytes().length > 0) {
            try {
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

## RuleId[id=NonFinalFieldInEnum]
### NonFinalFieldInEnum
Non-final field `channelNr` in enum 'AdHocChannel'
in `lib/mosaic-objects/src/main/java/org/eclipse/mosaic/lib/enums/AdHocChannel.java`
#### Snippet
```java
    SCH6(6);

    int channelNr;

    AdHocChannel(int channelNr) {
```

### NonFinalFieldInEnum
Non-final field `parameterType` in enum 'VehicleParameterType'
in `lib/mosaic-objects/src/main/java/org/eclipse/mosaic/lib/objects/vehicle/VehicleParameter.java`
#### Snippet
```java
        COLOR(Color.class);

        private Class<? extends Serializable> parameterType;

        VehicleParameterType(Class<? extends Serializable> parameterType) {
```

## RuleId[id=Deprecation]
### Deprecation
'org.apache.commons.cli.PosixParser' is deprecated
in `lib/mosaic-utils/src/main/java/org/eclipse/mosaic/lib/util/cli/CommandLineParser.java`
#### Snippet
```java
    private final static Logger log = LoggerFactory.getLogger(CommandLineParser.class);

    private final org.apache.commons.cli.CommandLineParser parser = new PosixParser();
    private final Options options = new Options();
    private final List<Field> parameterFields;
```

### Deprecation
'LINE_SEPARATOR' is deprecated
in `fed/mosaic-cell/src/main/java/org/eclipse/mosaic/fed/cell/viz/PerRegionBandwidthMeasurement.java`
#### Snippet
```java
        try {
            csvWriter.write(s);
            csvWriter.write(SystemUtils.LINE_SEPARATOR);
        } catch (IOException e) {
            log.error("Could not write line", e);
```

### Deprecation
'UTF_8' is deprecated
in `fed/mosaic-cell/src/main/java/org/eclipse/mosaic/fed/cell/viz/PerRegionBandwidthMeasurement.java`
#### Snippet
```java
                out = new FileOutputStream(new File(parentDir, csvName + ".csv"));
            }
            csvWriter = new OutputStreamWriter(out, Charsets.UTF_8);
        } catch (IOException e) {
            throw new RuntimeException(e);
```

### Deprecation
'CORNER' is deprecated
in `lib/mosaic-database/src/main/java/org/eclipse/mosaic/lib/database/persistence/SQLiteWriter.java`
#### Snippet
```java
        statement.addBatch("DROP TABLE IF EXISTS " + TABLES.ROUNDABOUT_CONSISTS_OF + ";");
        // removing deprecated tables
        statement.addBatch("DROP TABLE IF EXISTS " + TABLES.CORNER + ";");
        statement.addBatch("DROP TABLE IF EXISTS " + TABLES.WALL + ";");
        statement.executeBatch();
```

### Deprecation
'WALL' is deprecated
in `lib/mosaic-database/src/main/java/org/eclipse/mosaic/lib/database/persistence/SQLiteWriter.java`
#### Snippet
```java
        // removing deprecated tables
        statement.addBatch("DROP TABLE IF EXISTS " + TABLES.CORNER + ";");
        statement.addBatch("DROP TABLE IF EXISTS " + TABLES.WALL + ";");
        statement.executeBatch();
        sqlite.getConnection().commit();
```

## RuleId[id=StringBufferReplaceableByString]
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

## RuleId[id=ManualMinMaxCalculation]
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

## RuleId[id=TrivialStringConcatenation]
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

## RuleId[id=RedundantTypeArguments]
### RedundantTypeArguments
Explicit type arguments can be inferred
in `lib/mosaic-utils/src/main/java/org/eclipse/mosaic/lib/util/cli/CommandLineParser.java`
#### Snippet
```java
        }

        helpFormatter.setOptionComparator(Comparator.<Option>comparingInt(o -> ordering.indexOf(o.getLongOpt())));
        helpFormatter.printHelp(printWriter, 120, usageHint, header, getOptions(), 1, 3, footer);
    }
```

## RuleId[id=NullableProblems]
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
     */
    @SuppressWarnings(value = "SE_BAD_FIELD", justification = "The simulation kernel mustn't be serializable.")
    @Nullable
    private EventManager eventManager;

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
    private final PerceptionModule<SimplePerceptionConfiguration> perceptionModule;

    @Nonnull
    private VehicleParameters vehicleParameters;

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
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/simulation/AbstractSimulationUnit.java`
#### Snippet
```java
     * Id (name) which indicates the unit.
     */
    @Nonnull
    private final String id;

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
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `rti/mosaic-starter/src/main/java/org/eclipse/mosaic/starter/config/CScenario.java`
#### Snippet
```java
         * simulation run may return different results.
         */
        @Nullable
        public Long randomSeed;

```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `lib/mosaic-docker/src/main/java/org/eclipse/mosaic/lib/docker/DockerRun.java`
#### Snippet
```java

    /**
     * Sets the user and group of container. See https://docs.docker.com/engine/reference/run/#user for details.
     *
     * @param user the user and group as string accepted by Docker's CLI parameter "--user".
```

### JavadocLinkAsPlainText
Link specified as plain text
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/util/UnitLoggerImpl.java`
#### Snippet
```java
 * Implementation of the {@link UnitLogger} interface
 * <p></p>
 * http://logback.qos.ch/manual/mdc.html set the unitId for the discriminator
 * (Mapped Diagnostic Context)
 */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `fed/mosaic-mapping/src/main/java/org/eclipse/mosaic/fed/mapping/ambassador/spawning/lane/RoundRobinLaneIndexSelector.java`
#### Snippet
```java

/**
 * Look up https://en.wikipedia.org/wiki/Round-robin_scheduling
 */
public class RoundRobinLaneIndexSelector implements LaneIndexSelector {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `app/tutorials/example-applications/src/main/java/org/eclipse/mosaic/app/tutorial/trafficlight/TrafficLightControlApp.java`
#### Snippet
```java
 * - Sets the remaining duration for the current traffic light phase
 *
 * See http://sumo.dlr.de/wiki/Simulation/Traffic_Lights and {@link org.eclipse.mosaic.app.tutorial.TrafficLightApp} for more details.
 */
@SuppressWarnings("JavadocReference")
```

### JavadocLinkAsPlainText
Link specified as plain text
in `app/tutorials/example-applications/src/main/java/org/eclipse/mosaic/app/tutorial/traci/SumoTraciInteractionApp.java`
#### Snippet
```java
     * that follows the traci protocol. With the byte array constructed
     * here we instruct sumo directly to give us the speed for the
     * provided vehicle. https://sumo.dlr.de/wiki/TraCI/Vehicle_Value_Retrieval
     *
     * @param vehicleId Vehicle to get the speed from
```

### JavadocLinkAsPlainText
Link specified as plain text
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/spatial/QuickHull2d.java`
#### Snippet
```java
 * This class implements the QuickHull algorithm to compute the convex hull from a set of points.
 * FIXME: For now the algorithm is 2D and considers only the X- and Z-coordinates. Modified version
 * from http://read.pudn.com/downloads50/sourcecode/graph/172533/QuickHull.java__.htm
 */
public class QuickHull2d {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/util/TrafficLightStateDecoder.java`
#### Snippet
```java
    /**
     * Creates a TrafficLightState object from a character describing the traffic light state in a phase definition.
     * see https://sumo.dlr.de/docs/Simulation/Traffic_Lights.html#signal_state_definitions for more information
     *
     * @param stateChar a character describing the traffic light state in a phase definition
```

### JavadocLinkAsPlainText
Link specified as plain text
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/api/TrafficLightSubscribe.java`
#### Snippet
```java
/**
 * This class represents the SUMO command which allows to subscribe the traffic light to the application.
 * For more information check https://sumo.dlr.de/docs/TraCI/Object_Variable_Subscription.html
 */
public interface TrafficLightSubscribe {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/api/complex/SumoTrafficLightLogic.java`
#### Snippet
```java
/**
 * This class represents a traffic light program based on SUMO definition
 * as described on https://sumo.dlr.de/docs/Simulation/Traffic_Lights.html#defining_new_tls-programs.
 */
public class SumoTrafficLightLogic extends AbstractSubscriptionResult {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/TrafficLightSubscribe.java`
#### Snippet
```java
/**
 * This class represents the SUMO command which allows to subscribe the traffic light to the application.
 * For more information check https://sumo.dlr.de/docs/TraCI/Object_Variable_Subscription.html
 */
public class TrafficLightSubscribe
```

### JavadocLinkAsPlainText
Link specified as plain text
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/libsumo/TrafficLightSubscribe.java`
#### Snippet
```java
/**
 * This class represents the SUMO command which allows to subscribe the traffic light to the application.
 * For more information check https://sumo.dlr.de/docs/TraCI/Object_Variable_Subscription.html
 */
public class TrafficLightSubscribe implements org.eclipse.mosaic.fed.sumo.bridge.api.TrafficLightSubscribe {
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `lib/mosaic-network/src/main/java/org/eclipse/mosaic/lib/coupling/ClientServerChannel.java`
#### Snippet
```java
     * Last message from the federate.
     */  //TODO: implement usage
    private String lastStatusMessage = "";

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

### IgnoreResultOfCall
Result of `PriorityBlockingQueue.remove()` is ignored
in `rti/mosaic-rti-core/src/main/java/org/eclipse/mosaic/rti/time/ScheduledEvents.java`
#### Snippet
```java
     */
    void setEventProcessed(FederateEvent event) {
        this.lookahead.remove(event.getRequestedTime() + event.getLookahead());
    }

```

## RuleId[id=RedundantMethodOverride]
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
Unused import `import java.util.stream.Collectors;`
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/simulation/perception/index/providers/WallTree.java`
#### Snippet
```java
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class WallTree extends WallIndex {
```

### UNUSED_IMPORT
Unused import `import com.google.common.collect.Lists;`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/libsumo/VehicleGetTeleportingList.java`
#### Snippet
```java
import org.eclipse.mosaic.rti.api.InternalFederateException;

import com.google.common.collect.Lists;
import org.eclipse.sumo.libsumo.StringVector;
import org.eclipse.sumo.libsumo.Vehicle;
```

### UNUSED_IMPORT
Unused import `import org.eclipse.sumo.libsumo.StringVector;`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/libsumo/VehicleGetTeleportingList.java`
#### Snippet
```java

import com.google.common.collect.Lists;
import org.eclipse.sumo.libsumo.StringVector;
import org.eclipse.sumo.libsumo.Vehicle;

```

### UNUSED_IMPORT
Unused import `import java.util.ArrayList;`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/libsumo/VehicleGetTeleportingList.java`
#### Snippet
```java
import org.eclipse.sumo.libsumo.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
```

### UNUSED_IMPORT
Unused import `import org.eclipse.mosaic.fed.sumo.bridge.traci.reader.StringTraciReader;`
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/VehicleGetTeleportingList.java`
#### Snippet
```java
import org.eclipse.mosaic.fed.sumo.bridge.traci.constants.TraciDatatypes;
import org.eclipse.mosaic.fed.sumo.bridge.traci.reader.ListTraciReader;
import org.eclipse.mosaic.fed.sumo.bridge.traci.reader.StringTraciReader;
import org.eclipse.mosaic.fed.sumo.bridge.traci.reader.VehicleIdTraciReader;
import org.eclipse.mosaic.rti.api.InternalFederateException;
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
Value `id` is always 'null'
in `lib/mosaic-routing/src/main/java/org/eclipse/mosaic/lib/routing/database/LazyLoadingConnection.java`
#### Snippet
```java
        }
        final Connection con = getConnectionFromDatabase();
        return con != null ? con.getId() : defaultIfNull(id, "?");
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

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked overriding: return type requires unchecked conversion. Found 'java.util.List', required 'java.util.List'
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/simulation/perception/AbstractPerceptionModule.java`
#### Snippet
```java

    @Override
    public List<SpatialObject> getPerceivedObjects() {
        List<SpatialObject> objectsInRange = getObjectsInRange();
        objectsInRange = applyPerceptionModifiers(objectsInRange);
```

### UNCHECKED_WARNING
Unchecked method 'applyPerceptionModifiers(List)' invocation
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/simulation/perception/AbstractPerceptionModule.java`
#### Snippet
```java
    public List<SpatialObject> getPerceivedObjects() {
        List<SpatialObject> objectsInRange = getObjectsInRange();
        objectsInRange = applyPerceptionModifiers(objectsInRange);
        return objectsInRange;
    }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'org.eclipse.mosaic.fed.application.ambassador.simulation.perception.index.objects.SpatialObject'
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/simulation/perception/index/objects/SpatialObject.java`
#### Snippet
```java
        }

        SpatialObject<T> that = (SpatialObject<T>) o;

        return new EqualsBuilder()
```

### UNCHECKED_WARNING
Unchecked cast: 'org.eclipse.mosaic.lib.spatial.QuadTree\>.ObjectAndNode' to 'org.eclipse.mosaic.lib.spatial.QuadTree.ObjectAndNode'
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/spatial/QuadTreeTraversal.java`
#### Snippet
```java
        if (node.isLeaf()) {
            for (int i = 0; i < node.objects.size(); i++) {
                QuadTree<T>.ObjectAndNode oan = (QuadTree<T>.ObjectAndNode) node.objects.get(i);
                if (center.distanceSqrTo(oan.objectPos) < rSqr && (filter == null || filter.test(oan.object))) {
                    result.add(oan.object);
```

### UNCHECKED_WARNING
Unchecked cast: 'org.eclipse.mosaic.lib.spatial.QuadTree\>.ObjectAndNode' to 'org.eclipse.mosaic.lib.spatial.QuadTree.ObjectAndNode'
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/spatial/QuadTreeTraversal.java`
#### Snippet
```java
        if (node.isLeaf()) {
            for (int i = 0; i < node.objects.size(); i++) {
                QuadTree<T>.ObjectAndNode oan = (QuadTree<T>.ObjectAndNode) node.objects.get(i);
                if (containsOnPlane(area, oan.objectPos) && (filter == null || filter.test(oan.object))) {
                    result.add(oan.object);
```

### UNCHECKED_WARNING
Unchecked cast: 'org.eclipse.mosaic.lib.spatial.QuadTree\>.ObjectAndNode' to 'org.eclipse.mosaic.lib.spatial.QuadTree.ObjectAndNode'
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/spatial/QuadTreeTraversal.java`
#### Snippet
```java
        if (node.isLeaf()) {
            for (int i = 0; i < node.objects.size(); i++) {
                QuadTree<T>.ObjectAndNode oan = (QuadTree<T>.ObjectAndNode) node.objects.get(i);
                double d = center.distanceSqrTo(oan.objectPos);
                if (d < dSqr && (filter == null || filter.test((T) oan.object))) {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Class\>' to 'java.lang.Class'
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/CommandRegister.java`
#### Snippet
```java
            );
            try {
                return (Class<T>) Class.forName(newClassName);
            } catch (ClassNotFoundException e) {
                return null;
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/CommandRegister.java`
#### Snippet
```java
     */
    public <T extends Object> T getOrCreate(Class<T> commandClass) {
        T command = (T) commands.get(commandClass);
        if (command == null) {
            try {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/RouteGetIds.java`
#### Snippet
```java
    @Override
    protected List<String> constructResult(Status status, Object... objects) {
        return (List<String>) objects[0];
    }
}
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/SimulationGetTrafficLightIds.java`
#### Snippet
```java
    @Override
    protected List<String> constructResult(Status status, Object... objects) {
        return (List<String>) objects[0];
    }
}
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/SimulationGetDepartedVehicleIds.java`
#### Snippet
```java
    @Override
    protected List<String> constructResult(Status status, Object... objects) {
        return (List<String>) objects[0];
    }
}
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List\>\>'
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/TrafficLightGetControlledLinks.java`
#### Snippet
```java
    protected List<TrafficLightControlledLink> constructResult(Status status, Object... objects) {
        if (objects[0] instanceof Iterable) {
            List<List<List<String>>> rawResult = (List<List<List<String>>>) objects[0];
            List<TrafficLightControlledLink> result = new ArrayList<>(rawResult.size());
            int i = 0;
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/LaneGetShape.java`
#### Snippet
```java
    @Override
    protected List<Position> constructResult(Status status, Object... objects) {
        return (List<Position>) objects[0];
    }
}
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/VehicleGetTeleportingList.java`
#### Snippet
```java
    @Override
    protected List<String> constructResult(Status status, Object... objects) {
        return (List<String>) objects[0];
    }
}
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/RouteGetEdges.java`
#### Snippet
```java
    @Override
    protected List<String> constructResult(Status status, Object... objects) {
        return (List<String>) objects[0];
    }
}
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/TrafficLightGetControlledLanes.java`
#### Snippet
```java
    @Override
    protected List<String> constructResult(Status status, Object... objects) {
        return (List<String>) objects[0];
    }
}
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/reader/InductionLoopSubscriptionTraciReader.java`
#### Snippet
```java
                break;
            case CommandRetrieveInductionLoopState.VAR_LAST_STEP_VEHICLE_DATA:
                result.vehiclesOnInductionLoop = (List<InductionLoopVehicleData>) varValue;
                break;
            default:
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/reader/LaneAreaSubscriptionTraciReader.java`
#### Snippet
```java
                break;
            case CommandRetrieveLaneAreaState.VAR_LAST_STEP_VEHICLE_IDS:
                result.vehicles = (List<String>) varValue;
                break;
            default:
```

### UNCHECKED_WARNING
Unchecked call to 'getVariableLength(T)' as a member of raw type 'org.eclipse.mosaic.fed.sumo.bridge.traci.writer.AbstractTraciParameterWriter'
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/AbstractTraciCommand.java`
#### Snippet
```java
                            "Too many arguments given. Please revise writer configuration in the constructor."
                    );
                    messageLength += block.getVariableLength(arguments[i++]);
                } else {
                    messageLength += block.getLength();
```

### UNCHECKED_WARNING
Unchecked call to 'writeVariableArgument(DataOutputStream, T)' as a member of raw type 'org.eclipse.mosaic.fed.sumo.bridge.traci.writer.AbstractTraciParameterWriter'
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/AbstractTraciCommand.java`
#### Snippet
```java
            for (AbstractTraciParameterWriter block : writers) {
                if (block.isVariable()) {
                    block.writeVariableArgument(bridge.getOut(), arguments[i++]);
                } else {
                    block.write(bridge.getOut());
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/reader/VehicleSubscriptionTraciReader.java`
#### Snippet
```java
            result.minGap = (double) varValue;
        } else if (varId == CommandRetrieveVehicleState.VAR_NEXT_STOPS.var) {
            result.nextStops = (List<PublicTransportData.StoppingPlace>) varValue;
        } else if (varId == CommandRetrieveVehicleState.VAR_LINE.var) {
            result.line = (String) varValue;
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `fed/mosaic-sns/src/main/java/org/eclipse/mosaic/fed/sns/ambassador/TransmissionSimulator.java`
#### Snippet
```java
    protected Map<String, TransmissionResult> sendMessageAsGeocast(String senderName, DestinationAddressContainer dac) {
        if (dac.getGeoArea() == null) {
            return Collections.EMPTY_MAP;
        }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Vector' to 'java.util.Vector'
in `rti/mosaic-rti-core/src/main/java/org/eclipse/mosaic/rti/federation/DistributedFederationManagement.java`
#### Snippet
```java
     */
    private void removeDirectory(ChannelSftp channel, String dirName) throws SftpException {
        Vector<LsEntry> entries = channel.ls(dirName);
        channel.cd(dirName);
        String file;
```

### UNCHECKED_WARNING
Unchecked cast: 'capture' to 'T'
in `lib/mosaic-objects/src/main/java/org/eclipse/mosaic/lib/objects/v2x/EncodedPayload.java`
#### Snippet
```java
                Class<?> contentClass = Class.forName(contentClassName);
                Constructor<?> constructorDataInput = contentClass.getConstructor(DataInput.class);
                return (T) constructorDataInput.newInstance(new DataInputStream(new ByteArrayInputStream(getBytes())));
            } catch (Exception e) {
                throw new IllegalStateException(e);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'
in `fed/mosaic-output/src/main/java/org/eclipse/mosaic/fed/output/generator/websocket/WebsocketVisualizerServer.java`
#### Snippet
```java
                    .create());
        }
        return new VehicleUpdates(original.getTime(), Collections.EMPTY_LIST, reducedUpdates, Collections.EMPTY_LIST);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'
in `fed/mosaic-output/src/main/java/org/eclipse/mosaic/fed/output/generator/websocket/WebsocketVisualizerServer.java`
#### Snippet
```java
                    .create());
        }
        return new VehicleUpdates(original.getTime(), Collections.EMPTY_LIST, reducedUpdates, Collections.EMPTY_LIST);
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.function.Consumer' to 'java.util.function.Consumer'
in `fed/mosaic-output/src/main/java/org/eclipse/mosaic/fed/output/ambassador/AbstractOutputGenerator.java`
#### Snippet
```java

    protected <M extends Interaction> void registerInteractionForOutputGeneration(String type, Consumer<M> handleMethod) {
        interactionRegistry.put(type, (Consumer<Interaction>) handleMethod);
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Class\>' to 'java.lang.Class'
in `rti/mosaic-starter/src/main/java/org/eclipse/mosaic/starter/MosaicStarter.java`
#### Snippet
```java
    private <T> T loadJsonConfiguration(Path configurationFile, T defaultObject) {
        try (InputStream inputStream = loadResource(configurationFile)) {
            return new ObjectInstantiation<>((Class<T>) defaultObject.getClass()).read(inputStream);
        } catch (IOException | InstantiationException e) {
            getLogger().warn("Could not load file {}. Using default configuration.", configurationFile);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Class\>' to 'java.lang.Class'
in `rti/mosaic-starter/src/main/java/org/eclipse/mosaic/starter/MosaicSimulation.java`
#### Snippet
```java

        Class<? extends FederateAmbassador> ambassadorClass =
                (Class<? extends FederateAmbassador>) classLoader.loadClass(federate.classname);

        final AmbassadorParameter ambassadorParameter = new AmbassadorParameter(federate.id, configurationFile.toFile());
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

    private boolean reachedSpeed(double speed) {
        return Math.abs(getOs().getVehicleData().getSpeed() - speed) < 0.1d;
    }

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
Method invocation `getNode` may produce `NullPointerException`
in `lib/mosaic-routing/src/main/java/org/eclipse/mosaic/lib/routing/database/LazyLoadingConnection.java`
#### Snippet
```java

    private Connection getConnectionBetweenNodes(INode from, INode to) {
        final Node fromNode = database.getNode(from.getId());
        final Collection<Connection> fromNodeConnections = fromNode.getOutgoingConnections().isEmpty() ? fromNode.getPartOfConnections() : fromNode.getOutgoingConnections();

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
Argument `methodName` might be null
in `fed/mosaic-output/src/main/java/org/eclipse/mosaic/fed/output/generator/file/format/MethodManager.java`
#### Snippet
```java
            int objLevel = objLevels.get(iterationMethodIndex);

            MethodElement me = new MethodElement(objLevel, declare, methodName);

            this.iterationMethods.add(me);
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
`toString()` call can be replaced with 'contentEquals()'
in `lib/mosaic-database/src/main/java/org/eclipse/mosaic/lib/database/persistence/SQLiteTypeDetector.java`
#### Snippet
```java

            // check if that chars equal forComparison
            if (forComparison.equals(toCheck.toString())) {
                return MIME_TYPE;
            }
```

## RuleId[id=DeprecatedIsStillUsed]
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

## RuleId[id=JavaReflectionMemberAccess]
### JavaReflectionMemberAccess
Cannot resolve field 'sys_paths'
in `lib/mosaic-utils/src/main/java/org/eclipse/mosaic/lib/util/ClassUtils.java`
#### Snippet
```java
    private static void setSysPathsToNull() throws NoSuchFieldException, SecurityException,
            IllegalArgumentException, IllegalAccessException {
        final Field sysPathsField = ClassLoader.class.getDeclaredField("sys_paths");
        sysPathsField.setAccessible(true);
        sysPathsField.set(null, null);
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/UnitSimulator.java`
#### Snippet
```java
        roadSideUnit.setGroup(rsuRegistration.getMapping().getGroup());

        addSimulationUnit(roadSideUnit);

        doSensorRegistration(rsuRegistration.getTime(), roadSideUnit.getId());

        final Event event = new Event(
                rsuRegistration.getTime(),
                this,
                new StartApplications(roadSideUnit.getId(), rsuRegistration.getMapping()),
                Event.NICE_MAX_PRIORITY
        );
        SimulationKernel.SimulationKernel.getEventManager().addEvent(event);
```

### DuplicatedCode
Duplicated code
in `lib/mosaic-database/src/main/java/org/eclipse/mosaic/lib/database/persistence/SQLiteWriter.java`
#### Snippet
```java
                sequenceNumber = 0;
                for (Node node : way.getNodes()) {
                    prep.setString(1, way.getId());
                    prep.setString(2, node.getId());
                    prep.setInt(3, sequenceNumber);
                    prep.executeUpdate();
                    sequenceNumber++;
                }
```

### DuplicatedCode
Duplicated code
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/gson/AbstractTypeAdapterFactory.java`
#### Snippet
```java
        if (delegate == null) {
            throw new JsonParseException("cannot serialize subtype; No such type adapter?");
        }
        JsonObject jsonObject = delegate.toJsonTree(value).getAsJsonObject();
        if (jsonObject.has(TYPE_FIELD)) {
            throw new JsonParseException("cannot serialize " + srcType.getName()
                    + " because it already defines a field named " + TYPE_FIELD);
        }
        JsonObject clone = new JsonObject();
```

### DuplicatedCode
Duplicated code
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/math/Matrix3d.java`
#### Snippet
```java
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                m[c * 3 + r] = inputOrder == MatrixElementOrder.COLUMN_MAJOR
                        ? values[c * 3 + r]
                        : values[r * 3 + c];
            }
        }
```

### DuplicatedCode
Duplicated code
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/math/Matrix3d.java`
#### Snippet
```java
        double r00 = (m11 * m22 - m21 * m12) * invdet;
        double r01 = (m02 * m21 - m01 * m22) * invdet;
        double r02 = (m01 * m12 - m02 * m11) * invdet;
        double r10 = (m12 * m20 - m10 * m22) * invdet;
```

### DuplicatedCode
Duplicated code
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/math/Matrix4d.java`
#### Snippet
```java
        for (int r = 0; r < 4; r++) {
            for (int c = 0; c < 4; c++) {
                m[c * 4 + r] = inputOrder == MatrixElementOrder.COLUMN_MAJOR
                        ? values[c * 4 + r]
                        : values[r * 4 + c];
            }
        }
```

### DuplicatedCode
Duplicated code
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/math/Matrix4d.java`
#### Snippet
```java
        final double atmp0 = src10 * src15;
        final double atmp1 = src11 * src14;
        final double atmp2 = src9 * src15;
        final double atmp3 = src11 * src13;
        final double atmp4 = src9 * src14;
        final double atmp5 = src10 * src13;
        final double atmp6 = src8 * src15;
        final double atmp7 = src11 * src12;
        final double atmp8 = src8 * src14;
        final double atmp9 = src10 * src12;
        final double atmp10 = src8 * src13;
        final double atmp11 = src9 * src12;

        // calculate first 8 elements (cofactors)
        final double dst0 = (atmp0 * src5 + atmp3 * src6 + atmp4 * src7)
                - (atmp1 * src5 + atmp2 * src6 + atmp5 * src7);
        final double dst1 = (atmp1 * src4 + atmp6 * src6 + atmp9 * src7)
                - (atmp0 * src4 + atmp7 * src6 + atmp8 * src7);
        final double dst2 = (atmp2 * src4 + atmp7 * src5 + atmp10 * src7)
                - (atmp3 * src4 + atmp6 * src5 + atmp11 * src7);
        final double dst3 = (atmp5 * src4 + atmp8 * src5 + atmp11 * src6)
                - (atmp4 * src4 + atmp9 * src5 + atmp10 * src6);
        final double dst4 = (atmp1 * src1 + atmp2 * src2 + atmp5 * src3)
                - (atmp0 * src1 + atmp3 * src2 + atmp4 * src3);
        final double dst5 = (atmp0 * src0 + atmp7 * src2 + atmp8 * src3)
                - (atmp1 * src0 + atmp6 * src2 + atmp9 * src3);
        final double dst6 = (atmp3 * src0 + atmp6 * src1 + atmp11 * src3)
                - (atmp2 * src0 + atmp7 * src1 + atmp10 * src3);
        final double dst7 = (atmp4 * src0 + atmp9 * src1 + atmp10 * src2)
                - (atmp5 * src0 + atmp8 * src1 + atmp11 * src2);
```

### DuplicatedCode
Duplicated code
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/spatial/BoundingBox.java`
#### Snippet
```java
            if (point.x < min.x) {
                min.x = point.x;
            }
            if (point.y < min.y) {
                min.y = point.y;
            }
            if (point.z < min.z) {
                min.z = point.z;
            }
```

### DuplicatedCode
Duplicated code
in `lib/mosaic-network/src/main/java/org/eclipse/mosaic/lib/coupling/ClientServerChannel.java`
#### Snippet
```java
        for (NodeDataContainer cont : nodes) {                           //Fill the given nodes into the builder
            NodeData.Builder tmpBuilder = NodeData.newBuilder();        //Every node data is another protobuf object, thus new builder
            tmpBuilder.setId(cont.id).setX(cont.pos.getX()).setY(cont.pos.getY());  //Set coordinates
            updateNode.addProperties(tmpBuilder.build());               //Add node data to message
        }
        updateNode.build().writeDelimitedTo(out);                       //Build message and write to stream
        return readCommand();                                           //Read command (hopefully a success)
```

### DuplicatedCode
Duplicated code
in `lib/mosaic-objects/src/main/java/org/eclipse/mosaic/lib/objects/v2x/etsi/ivim/Advice.java`
#### Snippet
```java
        if (eq(speedAdvice, -1.0)) {
            speedState.setLeft(ReactionState.NO_ADVICE_AVAILABLE);
            speedState.setRight(-1.0);
        } else if (!eq(speedState.getValue(), speedAdvice)) {
            speedState.setLeft(ReactionState.NOT_REACTED);
            speedState.setRight(speedAdvice);
        }
        return this;
```

### DuplicatedCode
Duplicated code
in `lib/mosaic-routing/src/main/java/org/eclipse/mosaic/lib/routing/graphhopper/algorithm/AStarCamvitChoiceRouting.java`
#### Snippet
```java
            if (!accept(iter, curr)) {
                continue;
            }

            int traversalId = traversalMode.createTraversalId(iter, reverse);
            double alreadyVisitedWeight = weighting.calcWeight(iter, reverse, curr.edge) + curr.weight;

            if (Double.isInfinite(alreadyVisitedWeight)) {
                continue;
            }
```

### DuplicatedCode
Duplicated code
in `lib/mosaic-routing/src/main/java/org/eclipse/mosaic/lib/routing/graphhopper/algorithm/AStarCamvitChoiceRouting.java`
#### Snippet
```java
        if (currFrom != null) {
            if (finished(currFrom, to)) {
                return true;
            }

            fillEdges(currFrom, heap, weights, outEdgeExplorer, false);
            visitedFromCount++;
            if (heap.isEmpty()) {
                return true;
            }
            currFrom = heap.poll();

        } else if (currTo == null) {
            //creating the source tree is finished when target tree has been finished as well
            return true;
        }
        return false;
```

### DuplicatedCode
Duplicated code
in `lib/mosaic-routing/src/main/java/org/eclipse/mosaic/lib/routing/graphhopper/algorithm/AStarCamvitChoiceRouting.java`
#### Snippet
```java
        if (currTo != null) {
            if (finished(currTo, from)) {
                return true;
            }
            fillEdges(currTo, heap, weights, inEdgeExplorer, true);
            visitedToCount++;
            if (heap.isEmpty()) {
                return true;
            }
            currTo = heap.poll();
        } else if (currFrom == null) {
            //creating the target tree is finished when source tree has been finished as well
            return true;
        }
        return false;
```

## RuleId[id=MismatchedJavadocCode]
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

## RuleId[id=IOStreamConstructor]
### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `lib/mosaic-utils/src/main/java/org/eclipse/mosaic/lib/util/objects/ObjectInstantiation.java`
#### Snippet
```java
            warn("The file {} could not be read.", fileHandle.getPath());
        } else {
            try (InputStream inputStream = new FileInputStream(fileHandle)) {
                return read(inputStream, gsonBuilder);
            } catch (IOException e) {
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `rti/mosaic-rti-core/src/main/java/org/eclipse/mosaic/rti/federation/DistributedFederationManagement.java`
#### Snippet
```java
                    dstChannel.cd(PARENT);
                } else {
                    dstChannel.put(new FileInputStream(file), file.getName());
                }
            }
```

### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `fed/mosaic-cell/src/main/java/org/eclipse/mosaic/fed/cell/viz/BandwidthMeasurementManager.java`
#### Snippet
```java

        try (ZipOutputStream zipOut =
                     new ZipOutputStream(new FileOutputStream(new File(bandwidthMeasurementsDirectory, "bandwidthMeasurements.zip")))
        ) {
            zipOut.setLevel(ZipOutputStream.STORED);
```

### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `fed/mosaic-cell/src/main/java/org/eclipse/mosaic/fed/cell/viz/PerRegionBandwidthMeasurement.java`
#### Snippet
```java
            final OutputStream out;
            if (ConfigurationData.INSTANCE.getCellConfig().bandwidthMeasurementCompression) {
                out = new GZIPOutputStream(new FileOutputStream(new File(parentDir, csvName + ".csv.gz")));
            } else {
                out = new FileOutputStream(new File(parentDir, csvName + ".csv"));
```

### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `fed/mosaic-cell/src/main/java/org/eclipse/mosaic/fed/cell/viz/PerRegionBandwidthMeasurement.java`
#### Snippet
```java
                out = new GZIPOutputStream(new FileOutputStream(new File(parentDir, csvName + ".csv.gz")));
            } else {
                out = new FileOutputStream(new File(parentDir, csvName + ".csv"));
            }
            csvWriter = new OutputStreamWriter(out, Charsets.UTF_8);
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `lib/mosaic-database/src/main/java/org/eclipse/mosaic/lib/database/persistence/SQLiteTypeDetector.java`
#### Snippet
```java

        // prepare access
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8))) {
            // read in the first identLength chars
            int counter = 0;
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `rti/mosaic-starter/src/main/java/org/eclipse/mosaic/starter/MosaicStarter.java`
#### Snippet
```java
            }
        }
        return new FileInputStream(path.toFile());
    }

```

## RuleId[id=UnnecessaryToStringCall]
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
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/util/SumoVehicleTypesWriter.java`
#### Snippet
```java
            StreamResult result = new StreamResult(file);
            transformer.transform(source, result);
            log.info("{} file successfully written.", file.toString());
        } catch (TransformerException e) {
            log.debug("Couldn't write additional-file.");
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
in `rti/mosaic-starter/src/main/java/org/eclipse/mosaic/starter/MosaicStarter.java`
#### Snippet
```java

    protected void printVersionAndCopyrightInfo() {
        System.out.println("Eclipse MOSAIC [Version " + MosaicVersion.get().toString() + "]");
        System.out.println("Copyright (c) 2023 Fraunhofer FOKUS and others. All rights reserved.");
        System.out.println("License EPL-2.0: Eclipse Public License Version 2 [https://eclipse.org/legal/epl-v20.html].");
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

## RuleId[id=SuspiciousMethodCalls]
### SuspiciousMethodCalls
'List' may not contain objects of type 'SpatialObject'
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/simulation/perception/errormodels/SimpleOcclusionModifier.java`
#### Snippet
```java
            }
        }
        spatialObjects.retainAll(notOccludedObjects); // apply changes on initial list
        return spatialObjects;
    }
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

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `lib/mosaic-routing/src/main/java/org/eclipse/mosaic/lib/routing/graphhopper/algorithm/DijkstraCamvitChoiceRouting.java`
#### Snippet
```java
            }
            currTo = heap.poll();
        } else if (currFrom == null) {
            //creating the target tree is finished when source tree has been finished as well
            return true;
```

### TrivialIf
`if` statement can be simplified
in `lib/mosaic-routing/src/main/java/org/eclipse/mosaic/lib/routing/graphhopper/algorithm/DijkstraCamvitChoiceRouting.java`
#### Snippet
```java
            currFrom = heap.poll();

        } else if (currTo == null) {
            //creating the source tree is finished when target tree has been finished as well
            return true;
```

### TrivialIf
`if` statement can be simplified
in `lib/mosaic-routing/src/main/java/org/eclipse/mosaic/lib/routing/graphhopper/algorithm/AStarCamvitChoiceRouting.java`
#### Snippet
```java
            }
            currTo = heap.poll();
        } else if (currFrom == null) {
            //creating the target tree is finished when source tree has been finished as well
            return true;
```

### TrivialIf
`if` statement can be simplified
in `lib/mosaic-routing/src/main/java/org/eclipse/mosaic/lib/routing/graphhopper/algorithm/AStarCamvitChoiceRouting.java`
#### Snippet
```java
            currFrom = heap.poll();

        } else if (currTo == null) {
            //creating the source tree is finished when target tree has been finished as well
            return true;
```

### TrivialIf
`if` statement can be simplified
in `lib/mosaic-routing/src/main/java/org/eclipse/mosaic/lib/routing/graphhopper/algorithm/AbstractCamvitChoiceRouting.java`
#### Snippet
```java
        }

        if (containsLoop(newPath)) {
            return true;
        }
```

### TrivialIf
`if` statement can be simplified
in `fed/mosaic-cell/src/main/java/org/eclipse/mosaic/fed/cell/module/GeocasterModule.java`
#### Snippet
```java

        boolean isFullMessage = true;
        if (message.getEmittingModule().equals(CellModuleNames.UPSTREAM_MODULE)) {
            isFullMessage = false;
        }
```

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'Stream' used without 'try'-with-resources statement
in `rti/mosaic-starter/src/main/java/org/eclipse/mosaic/starter/MosaicClassLoader.java`
#### Snippet
```java
    private static URL[] collectJarFiles(Path basePath) {
        try {
            return Files.walk(basePath)
                    .filter(Files::isRegularFile)
                    .filter(f -> f.getFileName().toString().endsWith(".jar"))
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

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@throws` tag description is missing
in `lib/mosaic-network/src/main/java/org/eclipse/mosaic/lib/coupling/ClientServerChannel.java`
#### Snippet
```java
     *
     * @return the read command
     * @throws java.io.IOException
     */
    public int readCommand() throws IOException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `lib/mosaic-network/src/main/java/org/eclipse/mosaic/lib/coupling/ClientServerChannel.java`
#### Snippet
```java
     *
     * @return The read message.
     * @throws java.io.IOException
     */ //TODO: ChannelID (and length) not yet treated
    public ReceiveMessageContainer readMessage(IdTransformer<Integer, String> idTransformer) throws IOException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `lib/mosaic-network/src/main/java/org/eclipse/mosaic/lib/coupling/ClientServerChannel.java`
#### Snippet
```java
     *
     * @return the read time as long
     * @throws java.io.IOException
     */
    public long readTimeBody() throws IOException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `lib/mosaic-network/src/main/java/org/eclipse/mosaic/lib/coupling/ClientServerChannel.java`
#### Snippet
```java
     * Closes the channel.
     *
     * @throws java.io.IOException
     */
    public void close() throws IOException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `lib/mosaic-network/src/main/java/org/eclipse/mosaic/lib/coupling/ClientServerChannel.java`
#### Snippet
```java
     *
     * @return the read port as int
     * @throws java.io.IOException
     */
    public int readPortBody() throws IOException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `lib/mosaic-network/src/main/java/org/eclipse/mosaic/lib/coupling/ClientServerChannel.java`
#### Snippet
```java
     * @param configuration the actual configuration
     * @return command returned by the federate
     * @throws IOException
     */
    public int writeConfigMessage(long time, int msgID, int externalId, AdHocConfiguration configuration) throws IOException {
```

### JavadocDeclaration
`@return` tag description is missing
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/math/SpeedUtils.java`
#### Snippet
```java
     * @param velocity     velocity in [m/s]
     * @param acceleration acceleration for braking[m/s^2]
     * @return
     */
    public static double computeBrakeDistance(double velocity, double acceleration) {
```

### JavadocDeclaration
`@param v` tag description is missing
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/math/Vector3d.java`
#### Snippet
```java
     * Calculates and returns the angle between the current and the given vector in radians.
     *
     * @param v
     * @return angle in radians
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `rti/mosaic-rti-api/src/main/java/org/eclipse/mosaic/rti/api/RtiAmbassador.java`
#### Snippet
```java

    /**
     * @return
     * @throws IllegalValueException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `rti/mosaic-rti-api/src/main/java/org/eclipse/mosaic/rti/api/RtiAmbassador.java`
#### Snippet
```java
    /**
     * @return
     * @throws IllegalValueException
     */
    long getNextEventTimestamp() throws IllegalValueException;
```

### JavadocDeclaration
CommandException is not declared to be thrown by method execute
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/libsumo/TrafficLightSubscribe.java`
#### Snippet
```java
     * @param startTime           The time to subscribe the traffic light group.
     * @param endTime             The end time of the subscription of the traffic light group in the application.
     * @throws CommandException     if the status code of the response is ERROR. The TraCI connection is still available.
     * @throws InternalFederateException if some serious error occurs during writing or reading. The TraCI connection is shut down.
     */
```

### JavadocDeclaration
InternalFederateException is not declared to be thrown by method execute
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/libsumo/TrafficLightSubscribe.java`
#### Snippet
```java
     * @param endTime             The end time of the subscription of the traffic light group in the application.
     * @throws CommandException     if the status code of the response is ERROR. The TraCI connection is still available.
     * @throws InternalFederateException if some serious error occurs during writing or reading. The TraCI connection is shut down.
     */
    public void execute(Bridge bridge, String trafficLightGroupId, long startTime, long endTime) {
```

### JavadocDeclaration
Javadoc pointing to itself
in `lib/mosaic-objects/src/main/java/org/eclipse/mosaic/lib/objects/v2x/V2xMessage.java`
#### Snippet
```java
    /**
     * Returns the simple class name of the implementation. Please prefer this method instead 
     * to get the name from {@link #getSimpleClassName()}.
     *
     * @return the simple class name of the implementation.
```

### JavadocDeclaration
`@return` tag description is missing
in `lib/mosaic-objects/src/main/java/org/eclipse/mosaic/lib/objects/v2x/etsi/Denm.java`
#### Snippet
```java
     * TODO: Add the Unit. Unit: [???].
     *
     * @return
     */
    public float getSenderDeceleration() {
```

### JavadocDeclaration
Exception is not declared to be thrown by method readLogFolderFromLogback
in `rti/mosaic-starter/src/main/java/org/eclipse/mosaic/starter/MosaicSimulation.java`
#### Snippet
```java
     * @param logbackConfigPath logback configuration from which the logDirectory property is read from
     * @return path to the log directory as String
     * @throws Exception in case the log directory could not be read
     */
    private String readLogFolderFromLogback(Path logbackConfigPath) {
```

## RuleId[id=RedundantCast]
### RedundantCast
Casting `new TrafficLightObject(...).setIncomingLane(...).setOutgoingLane(...).setTrafficLightState(...).setT ...` to `TrafficLightObject` is redundant
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/simulation/perception/index/objects/TrafficLightObject.java`
#### Snippet
```java
    @Override
    public TrafficLightObject copy() {
        return (TrafficLightObject) new TrafficLightObject(getId())
                .setIncomingLane(getIncomingLane())
                .setOutgoingLane(getOutgoingLane())
```

### RedundantCast
Casting `new VehicleObject(...).setHeading(...).setSpeed(...).setEdgeAndLane(...).setDimensions(...).setPosit ...` to `VehicleObject` is redundant
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/simulation/perception/index/objects/VehicleObject.java`
#### Snippet
```java
    @Override
    public VehicleObject copy() {
        return (VehicleObject) new VehicleObject(getId())
                .setHeading(getHeading())
                .setSpeed(getSpeed())
```

### RedundantCast
Casting `oan.object` to `T` is redundant
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/spatial/QuadTreeTraversal.java`
#### Snippet
```java
                QuadTree<T>.ObjectAndNode oan = (QuadTree<T>.ObjectAndNode) node.objects.get(i);
                double d = center.distanceSqrTo(oan.objectPos);
                if (d < dSqr && (filter == null || filter.test((T) oan.object))) {
                    o = oan;
                    dSqr = d;
```

### RedundantCast
Casting `messageContent` to `Object` is redundant
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/SimulationTraciRequest.java`
#### Snippet
```java
            throws CommandException, InternalFederateException {
        this.msgId = messageId;
        return super.executeAndReturn(bridge, (Object) messageContent).orElse(
                new SumoTraciResult(
                        messageId,
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `conditionalClass` may be 'final'
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/util/ClassSubsetIterator.java`
#### Snippet
```java
    private Iterator<?> baseIterator;
    private T next;
    private Class<T> conditionalClass;

    public ClassSubsetIterator(Iterator<?> base, Class<T> conditionalClass) {
```

### FieldMayBeFinal
Field `baseIterator` may be 'final'
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/util/ClassSubsetIterator.java`
#### Snippet
```java
public class ClassSubsetIterator<T> implements Iterator<T> {

    private Iterator<?> baseIterator;
    private T next;
    private Class<T> conditionalClass;
```

### FieldMayBeFinal
Field `volumeBindings` may be 'final'
in `lib/mosaic-docker/src/main/java/org/eclipse/mosaic/lib/docker/DockerRun.java`
#### Snippet
```java
    private List<Pair<Integer, Integer>> portBindings = new Vector<>();
    private String user;
    private List<Pair<File, String>> volumeBindings = new Vector<>();
    private boolean removeAfterRun = false;
    private boolean removeBeforeRun;
```

### FieldMayBeFinal
Field `portBindings` may be 'final'
in `lib/mosaic-docker/src/main/java/org/eclipse/mosaic/lib/docker/DockerRun.java`
#### Snippet
```java
    private String name;
    private List<Pair<String, Object>> parameters = new Vector<>();
    private List<Pair<Integer, Integer>> portBindings = new Vector<>();
    private String user;
    private List<Pair<File, String>> volumeBindings = new Vector<>();
```

### FieldMayBeFinal
Field `parameters` may be 'final'
in `lib/mosaic-docker/src/main/java/org/eclipse/mosaic/lib/docker/DockerRun.java`
#### Snippet
```java
    private final String image;
    private String name;
    private List<Pair<String, Object>> parameters = new Vector<>();
    private List<Pair<Integer, Integer>> portBindings = new Vector<>();
    private String user;
```

### FieldMayBeFinal
Field `configuration` may be 'final'
in `fed/mosaic-application/src/main/java/org/eclipse/mosaic/fed/application/ambassador/navigation/CentralNavigationComponent.java`
#### Snippet
```java
     * The configuration for routingAPI.
     */
    private CApplicationAmbassador.CRoutingByType configuration;

    /**
```

### FieldMayBeFinal
Field `nextId` may be 'final'
in `lib/mosaic-network/src/main/java/org/eclipse/mosaic/lib/coupling/NetworkEntityIdTransformer.java`
#### Snippet
```java
    private final static Logger log = LoggerFactory.getLogger(NetworkEntityIdTransformer.class);
    private BiMap<String, Integer> idMap = HashBiMap.create();
    private AtomicInteger nextId = new AtomicInteger();

    boolean containsInternalId(String internalId) {
```

### FieldMayBeFinal
Field `idMap` may be 'final'
in `lib/mosaic-network/src/main/java/org/eclipse/mosaic/lib/coupling/NetworkEntityIdTransformer.java`
#### Snippet
```java

    private final static Logger log = LoggerFactory.getLogger(NetworkEntityIdTransformer.class);
    private BiMap<String, Integer> idMap = HashBiMap.create();
    private AtomicInteger nextId = new AtomicInteger();

```

### FieldMayBeFinal
Field `ipv4AnycastAddress` may be 'final'
in `lib/mosaic-network/src/main/java/org/eclipse/mosaic/lib/coupling/CAbstractNetworkAmbassador.java`
#### Snippet
```java
        private boolean ipv4UnicastAddress = false;
        private boolean ipv4BroadcastAddress = true;
        private boolean ipv4AnycastAddress = false;
    }
}
```

### FieldMayBeFinal
Field `ipv4UnicastAddress` may be 'final'
in `lib/mosaic-network/src/main/java/org/eclipse/mosaic/lib/coupling/CAbstractNetworkAmbassador.java`
#### Snippet
```java
    @SuppressWarnings("FieldCanBeLocal")
    static class CDestinationAdress {
        private boolean ipv4UnicastAddress = false;
        private boolean ipv4BroadcastAddress = true;
        private boolean ipv4AnycastAddress = false;
```

### FieldMayBeFinal
Field `protocolType` may be 'final'
in `lib/mosaic-network/src/main/java/org/eclipse/mosaic/lib/coupling/CAbstractNetworkAmbassador.java`
#### Snippet
```java
        private CDestinationAdress destinationAddress = new CDestinationAdress();
        private Map<DestinationType, Boolean> routingType = new HashMap<>();
        private Map<ProtocolType, Boolean> protocolType = new HashMap<>();

        CMessages() {
```

### FieldMayBeFinal
Field `ipv4BroadcastAddress` may be 'final'
in `lib/mosaic-network/src/main/java/org/eclipse/mosaic/lib/coupling/CAbstractNetworkAmbassador.java`
#### Snippet
```java
    static class CDestinationAdress {
        private boolean ipv4UnicastAddress = false;
        private boolean ipv4BroadcastAddress = true;
        private boolean ipv4AnycastAddress = false;
    }
```

### FieldMayBeFinal
Field `routingType` may be 'final'
in `lib/mosaic-network/src/main/java/org/eclipse/mosaic/lib/coupling/CAbstractNetworkAmbassador.java`
#### Snippet
```java

        private CDestinationAdress destinationAddress = new CDestinationAdress();
        private Map<DestinationType, Boolean> routingType = new HashMap<>();
        private Map<ProtocolType, Boolean> protocolType = new HashMap<>();

```

### FieldMayBeFinal
Field `destinationAddress` may be 'final'
in `lib/mosaic-network/src/main/java/org/eclipse/mosaic/lib/coupling/CAbstractNetworkAmbassador.java`
#### Snippet
```java
    static class CMessages {

        private CDestinationAdress destinationAddress = new CDestinationAdress();
        private Map<DestinationType, Boolean> routingType = new HashMap<>();
        private Map<ProtocolType, Boolean> protocolType = new HashMap<>();
```

### FieldMayBeFinal
Field `messages` may be 'final'
in `lib/mosaic-network/src/main/java/org/eclipse/mosaic/lib/coupling/CAbstractNetworkAmbassador.java`
#### Snippet
```java
    public String federateConfigurationFile;

    private CMessages messages = new CMessages();

    /**
```

### FieldMayBeFinal
Field `tlName` may be 'final'
in `fed/mosaic-mapping/src/main/java/org/eclipse/mosaic/fed/mapping/ambassador/spawning/TrafficLightSpawner.java`
#### Snippet
```java
     * The traffic light name.
     */
    private String tlName;
    /**
     * The weight of the traffic light (used for spawning selection).
```

### FieldMayBeFinal
Field `weight` may be 'final'
in `fed/mosaic-mapping/src/main/java/org/eclipse/mosaic/fed/mapping/ambassador/spawning/TrafficLightSpawner.java`
#### Snippet
```java
     * The weight of the traffic light (used for spawning selection).
     */
    private double weight;

    /**
```

### FieldMayBeFinal
Field `position` may be 'final'
in `fed/mosaic-mapping/src/main/java/org/eclipse/mosaic/fed/mapping/ambassador/spawning/RoadSideUnitSpawner.java`
#### Snippet
```java
     * The position of the ChargingStation defined by a {@link GeoPoint}.
     */
    private GeoPoint position;

    /**
```

### FieldMayBeFinal
Field `mappingAmbassadorConfiguration` may be 'final'
in `fed/mosaic-mapping/src/main/java/org/eclipse/mosaic/fed/mapping/ambassador/MappingAmbassador.java`
#### Snippet
```java
     * Read the <code>CMappingAmbassador</code> from the configuration.
     */
    private CMappingAmbassador mappingAmbassadorConfiguration;

    /**
```

### FieldMayBeFinal
Field `lastStatusMessage` may be 'final'
in `lib/mosaic-network/src/main/java/org/eclipse/mosaic/lib/coupling/ClientServerChannel.java`
#### Snippet
```java
     * Last message from the federate.
     */  //TODO: implement usage
    private String lastStatusMessage = "";

    /**
```

### FieldMayBeFinal
Field `departSpeed` may be 'final'
in `fed/mosaic-mapping/src/main/java/org/eclipse/mosaic/fed/mapping/ambassador/VehicleFlowGenerator.java`
#### Snippet
```java
     * The speed at which the vehicle will depart. Only used by SUMO so far.
     */
    private double departSpeed;
    /**
     * The depart speed mode, where depending on the value, the depart speed behaves as follows.
```

### FieldMayBeFinal
Field `laneSelectionMode` may be 'final'
in `fed/mosaic-mapping/src/main/java/org/eclipse/mosaic/fed/mapping/ambassador/VehicleFlowGenerator.java`
#### Snippet
```java
     */
    private VehicleDeparture.DepartureSpeedMode departureSpeedMode;
    private VehicleDeparture.LaneSelectionMode laneSelectionMode;
    private long start = 0;
    private long end = Long.MAX_VALUE;
```

### FieldMayBeFinal
Field `departureSpeedMode` may be 'final'
in `fed/mosaic-mapping/src/main/java/org/eclipse/mosaic/fed/mapping/ambassador/VehicleFlowGenerator.java`
#### Snippet
```java
     * MAXIMUM = The {@link CVehicle#departSpeed} will be overridden by the max value
     */
    private VehicleDeparture.DepartureSpeedMode departureSpeedMode;
    private VehicleDeparture.LaneSelectionMode laneSelectionMode;
    private long start = 0;
```

### FieldMayBeFinal
Field `rti` may be 'final'
in `fed/mosaic-mapping/src/main/java/org/eclipse/mosaic/fed/mapping/ambassador/SpawningFramework.java`
#### Snippet
```java
     * The ambassador of the runtime infrastructure.
     */
    private RtiAmbassador rti;
    /**
     * Whether mapping already was initialized. We use it in timeAdvance method
```

### FieldMayBeFinal
Field `supportedInteractions` may be 'final'
in `lib/mosaic-utils/src/main/java/org/eclipse/mosaic/lib/util/InteractionUtils.java`
#### Snippet
```java
    private final static Logger log = LoggerFactory.getLogger(InteractionUtils.class);

    private static Map<String, Class<?>> supportedInteractions = new HashMap<>();

    /**
```

### FieldMayBeFinal
Field `aq` may be 'final'
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/spatial/QuickHull2d.java`
#### Snippet
```java
    private ArrayList<Vector3d> hullPoints;

    private Line aq = new Line(new Vector3d(), new Vector3d());

    private static class Line {
```

### FieldMayBeFinal
Field `points` may be 'final'
in `lib/mosaic-geomath/src/main/java/org/eclipse/mosaic/lib/spatial/QuickHull2d.java`
#### Snippet
```java
public class QuickHull2d {
    private ArrayList<Line> hullEdges;
    private ArrayList<Vector3d> points;
    private ArrayList<Vector3d> hullPoints;

```

### FieldMayBeFinal
Field `idCounter` may be 'final'
in `rti/mosaic-rti-api/src/main/java/org/eclipse/mosaic/rti/api/Interaction.java`
#### Snippet
```java

    private static final long serialVersionUID = 1L;
    private static AtomicInteger idCounter = new AtomicInteger();

    /**
```

### FieldMayBeFinal
Field `id` may be 'final'
in `rti/mosaic-rti-api/src/main/java/org/eclipse/mosaic/rti/api/Interaction.java`
#### Snippet
```java
     * The unique interaction id.
     */
    private int id;

    /**
```

### FieldMayBeFinal
Field `typeId` may be 'final'
in `rti/mosaic-rti-api/src/main/java/org/eclipse/mosaic/rti/api/Interaction.java`
#### Snippet
```java
     * The type identifier.
     */
    private String typeId;

    /**
```

### FieldMayBeFinal
Field `minor` may be 'final'
in `rti/mosaic-rti-api/src/main/java/org/eclipse/mosaic/rti/api/MosaicVersion.java`
#### Snippet
```java

    private int major;
    private int minor;
    private boolean isSnapshot;

```

### FieldMayBeFinal
Field `major` may be 'final'
in `rti/mosaic-rti-api/src/main/java/org/eclipse/mosaic/rti/api/MosaicVersion.java`
#### Snippet
```java
    private static String mosaicVersion;

    private int major;
    private int minor;
    private boolean isSnapshot;
```

### FieldMayBeFinal
Field `isSnapshot` may be 'final'
in `rti/mosaic-rti-api/src/main/java/org/eclipse/mosaic/rti/api/MosaicVersion.java`
#### Snippet
```java
    private int major;
    private int minor;
    private boolean isSnapshot;

    private MosaicVersion(@Nonnull String version) {
```

### FieldMayBeFinal
Field `log` may be 'final'
in `rti/mosaic-rti-api/src/main/java/org/eclipse/mosaic/rti/api/federatestarter/ExecutableFederateExecutor.java`
#### Snippet
```java
public class ExecutableFederateExecutor implements FederateExecutor {

    private static Logger log = LoggerFactory.getLogger(ExecutableFederateExecutor.class);

    private final FederateDescriptor descriptor;
```

### FieldMayBeFinal
Field `database` may be 'final'
in `lib/mosaic-routing/src/main/java/org/eclipse/mosaic/lib/routing/database/RouteManager.java`
#### Snippet
```java
public class RouteManager {

    private Database database;

    /**
```

### FieldMayBeFinal
Field `database` may be 'final'
in `lib/mosaic-routing/src/main/java/org/eclipse/mosaic/lib/routing/graphhopper/DatabaseGraphLoader.java`
#### Snippet
```java
    private GraphhopperToDatabaseMapper graphMapper;
    private TurnCostExtension turnCostStorage;
    private Database database;

    public DatabaseGraphLoader(Database database) {
```

### FieldMayBeFinal
Field `minCurveRadius` may be 'final'
in `lib/mosaic-routing/src/main/java/org/eclipse/mosaic/lib/routing/graphhopper/util/TurnCostAnalyzer.java`
#### Snippet
```java
     * TODO make depend on road type
     */
    private double minCurveRadius;

    /**
```

### FieldMayBeFinal
Field `variableTrafficSigns` may be 'final'
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/util/TrafficSignManager.java`
#### Snippet
```java
    private final double laneWidth;

    private Set<String> variableTrafficSigns = new HashSet<>();

    private Bridge bridge;
```

### FieldMayBeFinal
Field `log` may be 'final'
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/reader/Position2dTraciReader.java`
#### Snippet
```java
public class Position2dTraciReader extends AbstractTraciResultReader<Position> {

    private static Logger log = LoggerFactory.getLogger(Position2dTraciReader.class);

    public Position2dTraciReader() {
```

### FieldMayBeFinal
Field `log` may be 'final'
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/reader/Position3dTraciReader.java`
#### Snippet
```java
public class Position3dTraciReader extends AbstractTraciResultReader<Position> {

    private static Logger log = LoggerFactory.getLogger(Position3dTraciReader.class);

    protected Position3dTraciReader() {
```

### FieldMayBeFinal
Field `value` may be 'final'
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/SumoVar.java`
#### Snippet
```java
    public static class WithIntParam extends SumoVar {

        private Integer value;

        private WithIntParam(int var, Integer value, TraciVersion since, TraciVersion deprecatedSince) {
```

### FieldMayBeFinal
Field `value` may be 'final'
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/traci/constants/SumoVar.java`
#### Snippet
```java
    public static class WithParam extends SumoVar {

        private Double value;

        private WithParam(int var, Double value, TraciVersion since, TraciVersion deprecatedSince) {
```

### FieldMayBeFinal
Field `noRearSensorConfigured` may be 'final'
in `fed/mosaic-sumo/src/main/java/org/eclipse/mosaic/fed/sumo/bridge/facades/SimulationFacade.java`
#### Snippet
```java
     */
    private boolean updateBestLanesBeforeNextSimulationStep = false;
    private boolean noRearSensorConfigured = true;

    /**
```

### FieldMayBeFinal
Field `performance` may be 'final'
in `rti/mosaic-rti-core/src/main/java/org/eclipse/mosaic/rti/time/AbstractTimeManagement.java`
#### Snippet
```java
        private long lastRealTimeNs = 0;

        private PerformanceInformation performance = new PerformanceInformation();

        protected PerformanceInformation update(long simulationTime, long simulationEndTime, long realtimeNanoseconds) {
```

### FieldMayBeFinal
Field `SSH_PROPS` may be 'final'
in `rti/mosaic-rti-core/src/main/java/org/eclipse/mosaic/rti/federation/DistributedFederationManagement.java`
#### Snippet
```java
    }

    private static Properties SSH_PROPS = new Properties();

    static {
```

### FieldMayBeFinal
Field `inductionLoopId` may be 'final'
in `lib/mosaic-interactions/src/main/java/org/eclipse/mosaic/interactions/traffic/InductionLoopDetectorSubscription.java`
#### Snippet
```java
     * The identifier of the induction loop.
     */
    private String inductionLoopId;

    /**
```

### FieldMayBeFinal
Field `laneAreaId` may be 'final'
in `lib/mosaic-interactions/src/main/java/org/eclipse/mosaic/interactions/traffic/LaneAreaDetectorSubscription.java`
#### Snippet
```java
     * The identifier of the lane area detector.
     */
    private String laneAreaId;

    /**
```

### FieldMayBeFinal
Field `trafficLightGroupId` may be 'final'
in `lib/mosaic-interactions/src/main/java/org/eclipse/mosaic/interactions/traffic/TrafficLightSubscription.java`
#### Snippet
```java
     * The identifier of the traffic light group.
     */
    private String trafficLightGroupId;

    /**
```

### FieldMayBeFinal
Field `sightDistance` may be 'final'
in `lib/mosaic-interactions/src/main/java/org/eclipse/mosaic/interactions/vehicle/VehicleSightDistanceConfiguration.java`
#### Snippet
```java
     * The sender vehicles current sight distance.
     */
    private double sightDistance;

    /**
```

### FieldMayBeFinal
Field `openingAngle` may be 'final'
in `lib/mosaic-interactions/src/main/java/org/eclipse/mosaic/interactions/vehicle/VehicleSightDistanceConfiguration.java`
#### Snippet
```java
     * The opening angle of the sight area of the vehicle.
     */
    private double openingAngle;

    /**
```

### FieldMayBeFinal
Field `vehicleId` may be 'final'
in `lib/mosaic-interactions/src/main/java/org/eclipse/mosaic/interactions/vehicle/VehicleSightDistanceConfiguration.java`
#### Snippet
```java
     * The vehicles name that has sent the interaction.
     */
    private String vehicleId;

    /**
```

### FieldMayBeFinal
Field `idMapping` may be 'final'
in `lib/mosaic-objects/src/main/java/org/eclipse/mosaic/lib/enums/VehicleClass.java`
#### Snippet
```java

    private static class VehicleClassIdMapping {
        private static Map<Integer, VehicleClass> idMapping = new HashMap<>();
    }

```

### FieldMayBeFinal
Field `spatmContent` may be 'final'
in `lib/mosaic-objects/src/main/java/org/eclipse/mosaic/lib/objects/v2x/etsi/Spatm.java`
#### Snippet
```java
    }

    private SpatmContent spatmContent;

    public Spatm(final MessageRouting routing, final SpatmContent spatmContent, long minimalPayloadLength) {
```

### FieldMayBeFinal
Field `name` may be 'final'
in `lib/mosaic-objects/src/main/java/org/eclipse/mosaic/lib/objects/traffic/InductionLoopInfo.java`
#### Snippet
```java
    public static class Builder {
        private long time;
        private String name;
        private int vehicleCount;
        private double meanSpeed;
```

### FieldMayBeFinal
Field `time` may be 'final'
in `lib/mosaic-objects/src/main/java/org/eclipse/mosaic/lib/objects/traffic/InductionLoopInfo.java`
#### Snippet
```java
     */
    public static class Builder {
        private long time;
        private String name;
        private int vehicleCount;
```

### FieldMayBeFinal
Field `time` may be 'final'
in `lib/mosaic-objects/src/main/java/org/eclipse/mosaic/lib/objects/traffic/LaneAreaDetectorInfo.java`
#### Snippet
```java
    public static class Builder {

        private long time;
        private String name;
        private double length;
```

### FieldMayBeFinal
Field `name` may be 'final'
in `lib/mosaic-objects/src/main/java/org/eclipse/mosaic/lib/objects/traffic/LaneAreaDetectorInfo.java`
#### Snippet
```java

        private long time;
        private String name;
        private double length;
        private int vehicleCount;
```

### FieldMayBeFinal
Field `parameterType` may be 'final'
in `lib/mosaic-objects/src/main/java/org/eclipse/mosaic/lib/objects/vehicle/VehicleParameter.java`
#### Snippet
```java
        COLOR(Color.class);

        private Class<? extends Serializable> parameterType;

        VehicleParameterType(Class<? extends Serializable> parameterType) {
```

### FieldMayBeFinal
Field `lane` may be 'final'
in `lib/mosaic-objects/src/main/java/org/eclipse/mosaic/lib/objects/trafficsign/LaneAssignment.java`
#### Snippet
```java
     * The lane the lane assignment is valid for.
     */
    private int lane;

    /**
```

### FieldMayBeFinal
Field `lane` may be 'final'
in `lib/mosaic-objects/src/main/java/org/eclipse/mosaic/lib/objects/trafficsign/SpeedLimit.java`
#### Snippet
```java
     * The lane the speed limit is valid for.
     */
    private int lane;

    /**
```

### FieldMayBeFinal
Field `interfaceConfigurations` may be 'final'
in `lib/mosaic-objects/src/main/java/org/eclipse/mosaic/lib/objects/communication/AdHocConfiguration.java`
#### Snippet
```java
    public static class Builder {
        private String nodeId;
        private List<InterfaceConfiguration> interfaceConfigurations = new ArrayList<>();

        public Builder(String nodeId) {
```

### FieldMayBeFinal
Field `nodeId` may be 'final'
in `lib/mosaic-objects/src/main/java/org/eclipse/mosaic/lib/objects/communication/AdHocConfiguration.java`
#### Snippet
```java

    public static class Builder {
        private String nodeId;
        private List<InterfaceConfiguration> interfaceConfigurations = new ArrayList<>();

```

### FieldMayBeFinal
Field `channel0` may be 'final'
in `lib/mosaic-objects/src/main/java/org/eclipse/mosaic/lib/objects/communication/InterfaceConfiguration.java`
#### Snippet
```java
        private Double newPower;
        private Double newRadius;
        private AdHocChannel channel0;
        private AdHocChannel channel1;

```

## RuleId[id=UnnecessaryUnicodeEscape]
### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00b5` can be replaced with 'µ'
in `lib/mosaic-utils/src/main/java/org/eclipse/mosaic/lib/util/gson/UnitFieldAdapter.java`
#### Snippet
```java
    private final static Map<String, Double> UNIT_MULTIPLIERS = ImmutableMap.<String, Double>builder()
            .put("n", 1 / 1_000_000_000d).put("nano", 1 / 1_000_000_000d)
            .put("\u00b5", 1 / 1_000_000d).put("micro", 1 / 1_000_000d)
            .put("m", 1 / 1000d).put("milli", 1 / 1000d)
            .put("c", 1 / 100d).put("centi", 1 / 100d)
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00b5` can be replaced with 'µ'
in `lib/mosaic-utils/src/main/java/org/eclipse/mosaic/lib/util/gson/TimeFieldAdapter.java`
#### Snippet
```java
            .put("", TIME.SECOND)
            .put("n", TIME.NANO_SECOND)
            .put("\u00b5", TIME.MICRO_SECOND)
            .put("m", TIME.MILLI_SECOND)
            .put("nano", TIME.NANO_SECOND)
```

## RuleId[id=RegExpUnnecessaryNonCapturingGroup]
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

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:(|k|d|c|m|\\u00b5|n|kilo|deci|centi|milli|micro|nano)(meter|metre|m)(?:p|per|\\/)(h|hr|s|sec|second|hour))`
in `lib/mosaic-utils/src/main/java/org/eclipse/mosaic/lib/util/gson/UnitFieldAdapter.java`
#### Snippet
```java

    private final static Pattern DISTANCE_PATTERN = Pattern.compile("^(-?[0-9]+\\.?[0-9]*) ?((|k|d|c|m|\\u00b5|n|kilo|deci|centi|milli|micro|nano)(miles|mile|meter|metre|m))$");
    private final static Pattern SPEED_PATTERN = Pattern.compile("^([0-9]+\\.?[0-9]*) ?(mph|kmh|(?:(|k|d|c|m|\\u00b5|n|kilo|deci|centi|milli|micro|nano)(meter|metre|m)(?:p|per|\\/)(h|hr|s|sec|second|hour)))$");

    private final static Pattern WEIGHT_PATTERN = Pattern.compile("^(-?[0-9]+\\.?[0-9]*) ?((|k|d|c|m|\\u00b5|n|kilo|deci|centi|milli|micro|nano)(g|gram|grams))$");
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

