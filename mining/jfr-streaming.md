# jfr-streaming 
 
# Bad smells
I found 22 bad smells with 2 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| MissortedModifiers | 4 | false |
| ZeroLengthArrayInitialization | 3 | false |
| RedundantFieldInitialization | 2 | false |
| CallToStringConcatCanBeReplacedByOperator | 2 | false |
| NestedAssignment | 2 | false |
| StaticInitializerReferencesSubClass | 2 | false |
| AssignmentToMethodParameter | 1 | false |
| SizeReplaceableByIsEmpty | 1 | true |
| UnnecessaryLocalVariable | 1 | true |
| UnnecessarySemicolon | 1 | false |
| UnusedAssignment | 1 | false |
| MethodOverridesStaticMethod | 1 | false |
| UnnecessaryCallToStringValueOf | 1 | false |
## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `false` is redundant
in `core/src/main/java/com/microsoft/jfr/JfrStream.java`
#### Snippet
```java
    private byte[] buffer;
    private int index = 0;
    private boolean EOF = false;
    // There is a recording id and an id you get from the recording for the stream.
    // streamId is the id for the stream.
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `core/src/main/java/com/microsoft/jfr/JfrStream.java`
#### Snippet
```java

    private byte[] buffer;
    private int index = 0;
    private boolean EOF = false;
    // There is a recording id and an id you get from the recording for the stream.
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `arg`
in `core/src/main/java/com/microsoft/jfr/RecordingOptions.java`
#### Snippet
```java
    /* If the arg is null or an empty String, return the Option's default. */
    private static String normalize(String arg, Option option) {
        return arg == null || (arg = arg.trim()).isEmpty() ? option.defaultValue : arg;
    }

```

## RuleId[id=CallToStringConcatCanBeReplacedByOperator]
### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `core/src/main/java/com/microsoft/jfr/Recording.java`
#### Snippet
```java
        String[] args = new String[]{actual.name(), expected.name()};
        if (others != null) {
            for (State state : others) args[1] = args[1].concat(", ").concat(state.name());
        }
        String  msg = illegalStateFormat.format(args);
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `core/src/main/java/com/microsoft/jfr/Recording.java`
#### Snippet
```java
        String[] args = new String[]{actual.name(), expected.name()};
        if (others != null) {
            for (State state : others) args[1] = args[1].concat(", ").concat(state.name());
        }
        String  msg = illegalStateFormat.format(args);
```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`configurationName.trim().length() > 0` can be replaced with '!configurationName.trim().isEmpty()'
in `core/src/main/java/com/microsoft/jfr/RecordingConfiguration.java`
#### Snippet
```java

    static void invokeSetConfiguration(String configurationName, String getMbeanSetterFunction, long id, MBeanServerConnection mBeanServerConnection, ObjectName objectName) throws InstanceNotFoundException, MBeanException, ReflectionException, IOException {
        if (configurationName.trim().length() > 0) {
            Object[] args = new Object[]{id, configurationName};
            String[] argTypes = new String[]{long.class.getName(), String.class.getName()};
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `msg` is redundant
in `core/src/main/java/com/microsoft/jfr/Recording.java`
#### Snippet
```java
            for (State state : others) args[1] = args[1].concat(", ").concat(state.name());
        }
        String  msg = illegalStateFormat.format(args);
        return msg;
    }
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `core/src/main/java/com/microsoft/jfr/FlightRecorderConnection.java`
#### Snippet
```java

        try {
            Object[] args = new Object[]{};
            String[] argTypes = new String[]{};
            final long id = (long) mBeanServerConnection.invoke(objectName, "newRecording", args, argTypes);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `core/src/main/java/com/microsoft/jfr/FlightRecorderConnection.java`
#### Snippet
```java
        try {
            Object[] args = new Object[]{};
            String[] argTypes = new String[]{};
            final long id = (long) mBeanServerConnection.invoke(objectName, "newRecording", args, argTypes);

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `core/src/main/java/com/microsoft/jfr/dcmd/FlightRecorderDiagnosticCommandConnection.java`
#### Snippet
```java

    private static Object[] mkParamsArray(List<String> args) {
        return new Object[]{args.toArray(new String[0])};
    }

```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `core/src/main/java/com/microsoft/jfr/Recording.java`
#### Snippet
```java
         * recording has been closed, it is no longer usable.
         */
        CLOSED;
    }

```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `core/src/main/java/com/microsoft/jfr/JfrStream.java`
#### Snippet
```java
        }

        if (EOF || (EOF = (buffer == null))) return -1;

        int b = buffer[index] & 0xFF;
```

### NestedAssignment
Result of assignment expression used
in `core/src/main/java/com/microsoft/jfr/RecordingOptions.java`
#### Snippet
```java
    /* If the arg is null or an empty String, return the Option's default. */
    private static String normalize(String arg, Option option) {
        return arg == null || (arg = arg.trim()).isEmpty() ? option.defaultValue : arg;
    }

```

## RuleId[id=StaticInitializerReferencesSubClass]
### StaticInitializerReferencesSubClass
Referencing subclass PredefinedConfiguration from superclass RecordingConfiguration initializer might lead to class loading deadlock
in `core/src/main/java/com/microsoft/jfr/RecordingConfiguration.java`
#### Snippet
```java
     * The default configuration is suitable for continuous recordings.
     */
    public static final RecordingConfiguration DEFAULT_CONFIGURATION = new PredefinedConfiguration("default");

    /**
```

### StaticInitializerReferencesSubClass
Referencing subclass PredefinedConfiguration from superclass RecordingConfiguration initializer might lead to class loading deadlock
in `core/src/main/java/com/microsoft/jfr/RecordingConfiguration.java`
#### Snippet
```java
     * The profile configuration collects more events and is suitable for profiling an application.
     */
    public static final RecordingConfiguration PROFILE_CONFIGURATION = new PredefinedConfiguration("profile");


```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `value` initializer `0L` is redundant
in `core/src/main/java/com/microsoft/jfr/RecordingOptions.java`
#### Snippet
```java
         */
        public Builder maxSize(String maxSize) throws IllegalArgumentException {
            long value = 0L;
            try {
                String numVal = normalize(maxSize, Option.MAX_SIZE);
```

## RuleId[id=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `final private`
in `core/src/main/java/com/microsoft/jfr/Recording.java`
#### Snippet
```java

    final private FlightRecorderConnection connection;
    final private RecordingOptions recordingOptions;
    final private RecordingConfiguration recordingConfiguration;

```

### MissortedModifiers
Missorted modifiers `final static`
in `core/src/main/java/com/microsoft/jfr/Recording.java`
#### Snippet
```java
    // {0} is the state the code is trying to transition to.
    // {1} are the states that the instance could be in for a valid transition.
    private final static MessageFormat illegalStateFormat = new MessageFormat("Recording state {0} not in [{1}]");

    /**
```

### MissortedModifiers
Missorted modifiers `final private`
in `core/src/main/java/com/microsoft/jfr/Recording.java`
#### Snippet
```java
    }

    final private FlightRecorderConnection connection;
    final private RecordingOptions recordingOptions;
    final private RecordingConfiguration recordingConfiguration;
```

### MissortedModifiers
Missorted modifiers `final private`
in `core/src/main/java/com/microsoft/jfr/Recording.java`
#### Snippet
```java
    final private FlightRecorderConnection connection;
    final private RecordingOptions recordingOptions;
    final private RecordingConfiguration recordingConfiguration;

    private volatile long id = -1;
```

## RuleId[id=MethodOverridesStaticMethod]
### MethodOverridesStaticMethod
Method `connect()` tries to override a static method of a superclass
in `core/src/main/java/com/microsoft/jfr/dcmd/FlightRecorderDiagnosticCommandConnection.java`
#### Snippet
```java
     * @throws NullPointerException      The {@code mBeanServerConnection} parameter is {@code null}.
     */
    public static FlightRecorderConnection connect(MBeanServerConnection mBeanServerConnection)
            throws IOException, InstanceNotFoundException, JfrStreamingException {
        Objects.requireNonNull(mBeanServerConnection);
```

## RuleId[id=UnnecessaryCallToStringValueOf]
### UnnecessaryCallToStringValueOf
Unnecessary `Long.toString()` call
in `core/src/main/java/com/microsoft/jfr/RecordingOptions.java`
#### Snippet
```java
                    case "h":
                    case "d":
                        return Long.toString(value) + " " + units;
                }
            }
```

