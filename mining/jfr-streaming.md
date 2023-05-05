# jfr-streaming 
 
# Bad smells
I found 7 bad smells with 1 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| StaticInitializerReferencesSubClass | 2 | false |
| UnnecessaryLocalVariable | 1 | true |
| UnnecessarySemicolon | 1 | false |
| JavadocDeclaration | 1 | false |
| UnusedAssignment | 1 | false |
| UnnecessaryCallToStringValueOf | 1 | false |
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

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@return` tag description is missing
in `core/src/main/java/com/microsoft/jfr/Recording.java`
#### Snippet
```java
     * @param expected This is the state that the Recording should be in for a valid transition to occur
     * @param others Additional <em>expected</em> states
     * @return
     */
    private static String createIllegalStateExceptionMessage(State actual, State expected, State... others) {
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

