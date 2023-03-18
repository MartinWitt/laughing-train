# logging-log4j-samples 
 
# Bad smells
I found 73 bad smells with 7 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| SystemOutErr | 12 | false |
| RegExpSimplifiable | 10 | false |
| RegExpRedundantNestedCharacterClass | 10 | false |
| RegExpRedundantEscape | 6 | false |
| ReturnNull | 6 | false |
| UtilityClassWithoutPrivateConstructor | 5 | true |
| DynamicRegexReplaceableByCompiledPattern | 4 | false |
| AssignmentToMethodParameter | 3 | false |
| RegExpSingleCharAlternation | 2 | false |
| SizeReplaceableByIsEmpty | 2 | true |
| BusyWait | 2 | false |
| WhileLoopSpinsOnField | 1 | false |
| IntegerMultiplicationImplicitCastToLong | 1 | false |
| UnnecessaryFullyQualifiedName | 1 | false |
| InfiniteLoopStatement | 1 | false |
| MismatchedCollectionQueryUpdate | 1 | false |
| Convert2MethodRef | 1 | false |
| RedundantFieldInitialization | 1 | false |
| SuspiciousInvocationHandlerImplementation | 1 | false |
| UnusedAssignment | 1 | false |
| NonExceptionNameEndsWithException | 1 | false |
| AnonymousHasLambdaAlternative | 1 | false |
## RuleId[id=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `log4j-samples-asynclogger/src/main/java/org/apache/logging/log4j/samples/async/Log4J2AsyncLoggerException.java`
#### Snippet
```java

        try {
            System.out.println(getException());
        } catch (IllegalArgumentException e) {
            logger.error("An error occurred.", e);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `log4j-samples-flume-common/src/main/java/org/apache/logging/log4j/samples/util/NamingUtils.java`
#### Snippet
```java
    public static void main(final String[] args) {
        final String blah = "com.test.generator.Classname";
        System.out.println(getSimpleName(blah));
        System.out.println(lowerFirst(getSimpleName(blah)));

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `log4j-samples-flume-common/src/main/java/org/apache/logging/log4j/samples/util/NamingUtils.java`
#### Snippet
```java
        final String blah = "com.test.generator.Classname";
        System.out.println(getSimpleName(blah));
        System.out.println(lowerFirst(getSimpleName(blah)));

        System.out.println(getPackageName(blah));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `log4j-samples-flume-common/src/main/java/org/apache/logging/log4j/samples/util/NamingUtils.java`
#### Snippet
```java
        System.out.println(lowerFirst(getSimpleName(blah)));

        System.out.println(getPackageName(blah));

        System.out.println(getMethodShortName("getName"));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `log4j-samples-flume-common/src/main/java/org/apache/logging/log4j/samples/util/NamingUtils.java`
#### Snippet
```java
        System.out.println(getPackageName(blah));

        System.out.println(getMethodShortName("getName"));
        System.out.println(getMethodShortName("setName"));
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `log4j-samples-flume-common/src/main/java/org/apache/logging/log4j/samples/util/NamingUtils.java`
#### Snippet
```java

        System.out.println(getMethodShortName("getName"));
        System.out.println(getMethodShortName("setName"));
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `log4j-samples-flume-common/src/main/java/org/apache/logging/log4j/samples/app/LoggingController.java`
#### Snippet
```java
                numThreads = Integers.parseInt(threadCount);
            } catch (final Exception ex) {
                System.out.println("Invalid threadCount specified: " + threadCount);
            }
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `log4j-samples-flume-common/src/main/java/org/apache/logging/log4j/samples/app/LoggingController.java`
#### Snippet
```java
                timeBase = Integer.parseInt(interval);
            } catch (final Exception ex) {
                System.out.println("Invalid interval specified: " + interval);
            }
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `log4j-samples-flume-common/src/main/java/org/apache/logging/log4j/samples/app/LoggingController.java`
#### Snippet
```java
            }
        }
        System.out.println("STARTING - Using " + numThreads + " threads at interval: " + timeBase);

        if (events == null) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `log4j-samples-flume-common/src/main/java/org/apache/logging/log4j/samples/app/LoggingApp.java`
#### Snippet
```java
                //
            }
            System.out.println("SHUTDOWN.......................");
        }
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `log4j-samples-flume-common/src/main/java/org/apache/logging/log4j/samples/app/LoggingApp.java`
#### Snippet
```java
        @Override
        public void run() {
            System.out.println("STARTING..................");

            while (!shutdown) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `log4j-samples-flume-common/src/main/java/org/apache/logging/log4j/samples/app/LoggingApp.java`
#### Snippet
```java
        final LoggingApp app = new LoggingApp(member);
        app.runApp(member);
        System.out.println("Job ended");
    }

```

## RuleId[id=WhileLoopSpinsOnField]
### WhileLoopSpinsOnField
`while` loop spins on field
in `log4j-samples-flume-common/src/main/java/org/apache/logging/log4j/samples/app/LoggingApp.java`
#### Snippet
```java
            System.out.println("STARTING..................");

            while (!shutdown) {
                // Generate rand number between 1 to 10
                final int rand = ran.nextInt(9) + 1;
```

## RuleId[id=IntegerMultiplicationImplicitCastToLong]
### IntegerMultiplicationImplicitCastToLong
rand \* timeBase: integer multiplication implicitly cast to long
in `log4j-samples-flume-common/src/main/java/org/apache/logging/log4j/samples/app/LoggingController.java`
#### Snippet
```java
                        // Sleep for rand seconds
                        try {
                            Thread.sleep(rand * timeBase);
                        } catch (final InterruptedException e) {
                            logger.warn("WARN", e);
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `Log4J2AsyncLoggerException` has only 'static' members, and lacks a 'private' constructor
in `log4j-samples-asynclogger/src/main/java/org/apache/logging/log4j/samples/async/Log4J2AsyncLoggerException.java`
#### Snippet
```java
import org.apache.logging.log4j.Logger;

public class Log4J2AsyncLoggerException {

    private static final Logger logger = LogManager.getLogger(Log4J2AsyncLoggerException.class);
```

### UtilityClassWithoutPrivateConstructor
Class `NamingUtils` has only 'static' members, and lacks a 'private' constructor
in `log4j-samples-flume-common/src/main/java/org/apache/logging/log4j/samples/util/NamingUtils.java`
#### Snippet
```java
import org.apache.logging.log4j.util.Strings;

public class NamingUtils {

    public static String getPackageName(final String className) {
```

### UtilityClassWithoutPrivateConstructor
Class `MockEventsSupplier` has only 'static' members, and lacks a 'private' constructor
in `log4j-samples-flume-common/src/main/java/org/apache/logging/log4j/samples/app/MockEventsSupplier.java`
#### Snippet
```java
import org.apache.logging.log4j.samples.events.Transfer;

public class MockEventsSupplier {

    /* This provides random generation */
```

### UtilityClassWithoutPrivateConstructor
Class `ConfigServiceApplication` has only 'static' members, and lacks a 'private' constructor
in `log4j-spring-cloud-config-sample-server/src/main/java/org/apache/logging/log4j/spring/cloud/config/service/ConfigServiceApplication.java`
#### Snippet
```java
@EnableConfigServer
@SpringBootApplication
public class ConfigServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServiceApplication.class, args);
```

### UtilityClassWithoutPrivateConstructor
Class `LogEventFactory` has only 'static' members, and lacks a 'private' constructor
in `log4j-samples-flume-common/src/main/java/org/apache/logging/log4j/samples/app/LogEventFactory.java`
#### Snippet
```java
 *
 */
public class LogEventFactory {

    @SuppressWarnings("unchecked")
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `log4j-samples-flume-common/src/main/java/org/apache/logging/log4j/samples/util/NamingUtils.java`
#### Snippet
```java

    public static String getMethodShortName(final String name) {
        return name.replaceFirst("(get|set|is|has)", Strings.EMPTY);
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `log4j-samples-flume-common/src/main/java/org/apache/logging/log4j/samples/util/NamingUtils.java`
#### Snippet
```java

    public static String getClassName(final String className) {
        return upperFirst(className.replaceAll("[^a-zA-Z0-9_]+", Strings.EMPTY));
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `log4j-samples-flume-common/src/main/java/org/apache/logging/log4j/samples/util/NamingUtils.java`
#### Snippet
```java

    public static String getFieldName(final String fieldName) {
        return fieldName.replaceAll("[^a-zA-Z0-9_]+", Strings.EMPTY);
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `log4j-spring-cloud-config-sample-application/src/main/java/org/apache/logging/log4j/spring/cloud/config/sample/controller/SampleController.java`
#### Snippet
```java
        t.printStackTrace(ps);
        String stackTrace = os.toString();
        stackTrace = stackTrace.replaceAll("\n", "<br>");

        //LOGGER.info("Hello, World");
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.springframework.web.client` is unnecessary, and can be replaced with an import
in `log4j-spring-cloud-config-sample-application/src/main/java/org/apache/logging/log4j/spring/cloud/config/sample/utils/spring/SampleResponseErrorHandler.java`
#### Snippet
```java
 * Custom http client error handler which doesn't throw exception in case http code is not 2xx.
 */
public class SampleResponseErrorHandler implements org.springframework.web.client.ResponseErrorHandler {
    @Override
    public boolean hasError(ClientHttpResponse clientHttpResponse) throws IOException {
```

## RuleId[id=RegExpSingleCharAlternation]
### RegExpSingleCharAlternation
Single character alternation in RegExp
in `log4j-samples-flume-embedded/src/main/xml/web-common_4_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:string">
      <xsd:pattern value="[a-z]{2}(_|-)?([\p{L}\-\p{Nd}]{2})?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSingleCharAlternation
Single character alternation in RegExp
in `log4j-samples-flume-remote/src/main/xml/web-common_4_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:string">
      <xsd:pattern value="[a-z]{2}(_|-)?([\p{L}\-\p{Nd}]{2})?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

## RuleId[id=InfiniteLoopStatement]
### InfiniteLoopStatement
`while` statement cannot complete without throwing an exception
in `log4j-samples-asynclogger/src/main/java/org/apache/logging/log4j/samples/async/Log4J2AsyncLogger.java`
#### Snippet
```java

        // In Java 8, No need to check the log level, we can do this
        while (true) //for test rolling file
            logger.debug("Hello print {}", () -> getValue());
    }
```

## RuleId[id=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `loggerProperties` are updated, but never queried
in `log4j-samples-loggerProperties/src/main/java/org/apache/logging/log4j/lookup/MapMessageLookup.java`
#### Snippet
```java
    private static final Marker LOOKUP = MarkerManager.getMarker("LOOKUP");

    private static ConcurrentMap<String, Map<String, String>> loggerProperties = new ConcurrentHashMap<>();

    /**
```

## RuleId[id=Convert2MethodRef]
### Convert2MethodRef
Lambda can be replaced with method reference
in `log4j-samples-asynclogger/src/main/java/org/apache/logging/log4j/samples/async/Log4J2AsyncLogger.java`
#### Snippet
```java
        // In Java 8, No need to check the log level, we can do this
        while (true) //for test rolling file
            logger.debug("Hello print {}", () -> getValue());
    }

```

## RuleId[id=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\(` in RegExp
in `log4j-samples-flume-embedded/src/main/xml/web-common_4_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantEscape
Redundant character escape `\)` in RegExp
in `log4j-samples-flume-embedded/src/main/xml/web-common_4_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantEscape
Redundant character escape `\{` in RegExp
in `log4j-samples-flume-embedded/src/main/xml/web-common_4_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantEscape
Redundant character escape `\(` in RegExp
in `log4j-samples-flume-remote/src/main/xml/web-common_4_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantEscape
Redundant character escape `\)` in RegExp
in `log4j-samples-flume-remote/src/main/xml/web-common_4_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantEscape
Redundant character escape `\{` in RegExp
in `log4j-samples-flume-remote/src/main/xml/web-common_4_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `false` is redundant
in `log4j-samples-flume-common/src/main/java/org/apache/logging/log4j/samples/app/LoggingApp.java`
#### Snippet
```java
        private final String member;

        private boolean shutdown = false;

        public Worker(final String member) {
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `threads`
in `log4j-spring-cloud-config-sample-application/src/main/java/org/apache/logging/log4j/spring/cloud/config/sample/controller/SampleController.java`
#### Snippet
```java
        @RequestParam(name="messages", defaultValue="100000") int count) {
        if (threads < 1) {
            threads = 1;
        }
        if (count < threads) {
```

### AssignmentToMethodParameter
Assignment to method parameter `count`
in `log4j-spring-cloud-config-sample-application/src/main/java/org/apache/logging/log4j/spring/cloud/config/sample/controller/SampleController.java`
#### Snippet
```java
        }
        if (count < threads) {
            count = threads * 10000;
        }
        if ((count * threads) > MAX_MESSAGES) {
```

### AssignmentToMethodParameter
Assignment to method parameter `count`
in `log4j-spring-cloud-config-sample-application/src/main/java/org/apache/logging/log4j/spring/cloud/config/sample/controller/SampleController.java`
#### Snippet
```java
        }
        if ((count * threads) > MAX_MESSAGES) {
            count = MAX_MESSAGES / threads;
        }
        String msg = "";
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `log4j-samples-loggerProperties/src/main/java/org/apache/logging/log4j/lookup/CustomLookup.java`
#### Snippet
```java
    public String lookup(final LogEvent event, final String key) {
        if (event == null) {
            return null;
        }
        try {
```

### ReturnNull
Return of `null`
in `log4j-samples-loggerProperties/src/main/java/org/apache/logging/log4j/lookup/CustomLookup.java`
#### Snippet
```java
        } catch (final Exception ex) {
            LOGGER.warn(LOOKUP, "Error while getting property [{}].", key, ex);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `log4j-spring-cloud-config-sample-application/src/main/java/org/apache/logging/log4j/spring/cloud/config/sample/controller/K8SController.java`
#### Snippet
```java
            LOGGER.debug("Unable to locate pod with name {}.", hostName);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `log4j-samples-flume-common/src/main/java/org/apache/logging/log4j/samples/app/LogEventFactory.java`
#### Snippet
```java
            }

            return null;
        }

```

### ReturnNull
Return of `null`
in `log4j-samples-loggerProperties/src/main/java/org/apache/logging/log4j/lookup/MapMessageLookup.java`
#### Snippet
```java
    public String lookup(final LogEvent event, final String key) {
        if (event == null) {
            return null;
        }
        final Message msg = event.getMessage();
```

### ReturnNull
Return of `null`
in `log4j-samples-loggerProperties/src/main/java/org/apache/logging/log4j/lookup/MapMessageLookup.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

## RuleId[id=RegExpSimplifiable]
### RegExpSimplifiable
`[:]` can be simplified to ':'
in `log4j-samples-flume-remote/src/main/xml/javaee_web_services_client_1_4.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `log4j-samples-flume-remote/src/main/xml/javaee_web_services_client_1_4.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `log4j-samples-flume-remote/src/main/xml/javaee_web_services_client_1_4.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `log4j-samples-flume-remote/src/main/xml/javaee_web_services_client_1_4.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSimplifiable
`[^\s]` can be simplified to '\\S'
in `log4j-samples-flume-embedded/src/main/xml/web-common_4_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:string">
      <xsd:pattern value="[^\s]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `log4j-samples-flume-embedded/src/main/xml/javaee_web_services_client_1_4.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `log4j-samples-flume-embedded/src/main/xml/javaee_web_services_client_1_4.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `log4j-samples-flume-embedded/src/main/xml/javaee_web_services_client_1_4.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `log4j-samples-flume-embedded/src/main/xml/javaee_web_services_client_1_4.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSimplifiable
`[^\s]` can be simplified to '\\S'
in `log4j-samples-flume-remote/src/main/xml/web-common_4_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:string">
      <xsd:pattern value="[^\s]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`key.length() == 0` can be replaced with 'key.isEmpty()'
in `log4j-samples-loggerProperties/src/main/java/org/apache/logging/log4j/lookup/CustomLookup.java`
#### Snippet
```java
                return "";
            }
            if (key == null || key.length() == 0 || key.equals("*")) {
                final StringBuilder sb = new StringBuilder("{");
                boolean first = true;
```

### SizeReplaceableByIsEmpty
`key.length() == 0` can be replaced with 'key.isEmpty()'
in `log4j-samples-loggerProperties/src/main/java/org/apache/logging/log4j/lookup/MapMessageLookup.java`
#### Snippet
```java
            try {
                MapMessage<?, ?> mapMessage = (MapMessage) msg;
                if (key == null || key.length() == 0 || key.equals("*")) {
                    return mapMessage.asString(MapMessage.MapFormat.JAVA_UNQUOTED.name());
                }
```

## RuleId[id=BusyWait]
### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `log4j-samples-flume-common/src/main/java/org/apache/logging/log4j/samples/app/LoggingController.java`
#### Snippet
```java
                        // Sleep for rand seconds
                        try {
                            Thread.sleep(rand * timeBase);
                        } catch (final InterruptedException e) {
                            logger.warn("WARN", e);
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `log4j-samples-flume-common/src/main/java/org/apache/logging/log4j/samples/app/LoggingApp.java`
#### Snippet
```java
                // Sleep for rand seconds
                try {
                    Thread.sleep(rand * 1000);
                } catch (final InterruptedException e) {
                    logger.warn("WARN", e);
```

## RuleId[id=RegExpRedundantNestedCharacterClass]
### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `log4j-samples-flume-remote/src/main/xml/javaee_web_services_client_1_4.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `log4j-samples-flume-remote/src/main/xml/javaee_web_services_client_1_4.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `log4j-samples-flume-remote/src/main/xml/javaee_web_services_client_1_4.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `log4j-samples-flume-remote/src/main/xml/javaee_web_services_client_1_4.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `log4j-samples-flume-embedded/src/main/xml/web-common_4_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `log4j-samples-flume-embedded/src/main/xml/javaee_web_services_client_1_4.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `log4j-samples-flume-embedded/src/main/xml/javaee_web_services_client_1_4.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `log4j-samples-flume-embedded/src/main/xml/javaee_web_services_client_1_4.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `log4j-samples-flume-embedded/src/main/xml/javaee_web_services_client_1_4.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `log4j-samples-flume-remote/src/main/xml/web-common_4_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

## RuleId[id=SuspiciousInvocationHandlerImplementation]
### SuspiciousInvocationHandlerImplementation
Null might be returned when proxying method 'equals()': this may cause NullPointerException
in `log4j-samples-flume-common/src/main/java/org/apache/logging/log4j/samples/app/LogEventFactory.java`
#### Snippet
```java
            }

            return null;
        }

```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `msg` initializer `""` is redundant
in `log4j-spring-cloud-config-sample-application/src/main/java/org/apache/logging/log4j/spring/cloud/config/sample/controller/SampleController.java`
#### Snippet
```java
            count = MAX_MESSAGES / threads;
        }
        String msg = "";
        if (threads == 1) {
            Timer timer = new Timer("sample");
```

## RuleId[id=NonExceptionNameEndsWithException]
### NonExceptionNameEndsWithException
Non-exception class name `Log4J2AsyncLoggerException` ends with 'Exception'
in `log4j-samples-asynclogger/src/main/java/org/apache/logging/log4j/samples/async/Log4J2AsyncLoggerException.java`
#### Snippet
```java
import org.apache.logging.log4j.Logger;

public class Log4J2AsyncLoggerException {

    private static final Logger logger = LogManager.getLogger(Log4J2AsyncLoggerException.class);
```

## RuleId[id=AnonymousHasLambdaAlternative]
### AnonymousHasLambdaAlternative
Anonymous new Thread() can be replaced with new Thread(() -\> {...})
in `log4j-samples-flume-common/src/main/java/org/apache/logging/log4j/samples/app/LoggingController.java`
#### Snippet
```java

        for (int i = 0; i < numThreads; ++i) {
            (new Thread() {

                @Override
```

