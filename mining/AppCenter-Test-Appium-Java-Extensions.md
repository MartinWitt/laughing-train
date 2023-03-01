# AppCenter-Test-Appium-Java-Extensions 
 
# Bad smells
I found 65 bad smells with 2 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryFullyQualifiedName | 38 | false |
| SystemOutErr | 5 | false |
| RedundantFieldInitialization | 3 | false |
| RedundantStringFormatCall | 3 | false |
| FieldMayBeStatic | 2 | false |
| UtilityClassWithoutPrivateConstructor | 2 | true |
| UNUSED_IMPORT | 2 | false |
| GroovyUnusedAssignment | 2 | false |
| StringEquality | 1 | false |
| DynamicRegexReplaceableByCompiledPattern | 1 | false |
| StringOperationCanBeSimplified | 1 | false |
| MismatchedCollectionQueryUpdate | 1 | false |
| RegExpRedundantEscape | 1 | false |
| ReturnNull | 1 | false |
| NonShortCircuitBoolean | 1 | false |
| BoundedWildcard | 1 | false |
## RuleId[ruleID=StringEquality]
### StringEquality
String values are compared using `==`, not 'equals()'
in `src/main/java/com/microsoft/appcenter/appium/ShortIdentifier.java`
#### Snippet
```java

    public ShortIdentifier(String input) {
        if (input == null || input == "") {
            throw new IllegalArgumentException("input must be a string with contents");
        }
```

## RuleId[ruleID=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/com/microsoft/appcenter/appium/StdOutEventReporter.java`
#### Snippet
```java
        switch (event.getType()) {
            case started:
                System.out.println(String.format("%s: %s (%s)", event.getType().name(), event.getTestName(), event.getClassName()));
                break;
            case label:
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/com/microsoft/appcenter/appium/StdOutEventReporter.java`
#### Snippet
```java
                break;
            case label:
                System.out.println(String.format("%s - %s", event.getLabel(), event.getScreenshotPath()));
                break;
            case screenshot:
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/com/microsoft/appcenter/appium/StdOutEventReporter.java`
#### Snippet
```java
                break;
            case screenshot:
                System.out.println(String.format("Took screenshot - %s", event.getScreenshotPath()));
                break;
            default:
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/com/microsoft/appcenter/appium/StdOutEventReporter.java`
#### Snippet
```java
                break;
            default:
                System.out.println(event.getType().name());
                break;
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/com/microsoft/appcenter/appium/Factory.java`
#### Snippet
```java

    private static void WarnServiceAndBuilerNotSupportedInXTC() {
        System.out.println("Warning: Using AppiumDriverLocalService or AppiumServiceBuilder in Xamarin Test Cloud is not supported");
    }

```

## RuleId[ruleID=FieldMayBeStatic]
### FieldMayBeStatic
Field `partMaxLength` may be 'static'
in `src/main/java/com/microsoft/appcenter/appium/ShortIdentifier.java`
#### Snippet
```java

    private final Pattern sanitizer = Pattern.compile("[^a-zA-Z0-9.:_()\\[\\]]");
    private final int partMaxLength = 50;
    private final int idMaxLength = 1024; // other 1024 reserved for leading path
    private final String shortId;
```

### FieldMayBeStatic
Field `idMaxLength` may be 'static'
in `src/main/java/com/microsoft/appcenter/appium/ShortIdentifier.java`
#### Snippet
```java
    private final Pattern sanitizer = Pattern.compile("[^a-zA-Z0-9.:_()\\[\\]]");
    private final int partMaxLength = 50;
    private final int idMaxLength = 1024; // other 1024 reserved for leading path
    private final String shortId;

```

## RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `DriverHelper` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/microsoft/appcenter/appium/DriverHelper.java`
#### Snippet
```java
import java.util.Objects;

class DriverHelper {
    static <X> X getScreenshotToWorkspace(Object result, OutputType<X> outputType, java8.util.function.Consumer<Path> reporter) {
        if (result instanceof String) {
```

### UtilityClassWithoutPrivateConstructor
Class `GenericsRewrite` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/microsoft/appcenter/appium/javassist/GenericsRewrite.java`
#### Snippet
```java
import java.io.IOException;

public class GenericsRewrite {
    private static String GenericdDecl = "<TT;>";
    public static void main(String[] args) {
```

## RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/com/microsoft/appcenter/appium/DriverHelper.java`
#### Snippet
```java
            return null;
        }
        return input.replaceAll("[\n\r:=]", " ");
    }

```

## RuleId[ruleID=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.junit.internal` is unnecessary, and can be replaced with an import
in `src/main/java/com/microsoft/appcenter/appium/Watcher.java`
#### Snippet
```java

    @Override
    protected void skipped(org.junit.internal.AssumptionViolatedException e, Description description) {
        this.eventReporter.reportJunit(EventType.skipped, description, e);
        super.skipped(e, description);
```

### UnnecessaryFullyQualifiedName
Qualifier `java8.util.stream` is unnecessary, and can be replaced with an import
in `src/main/java/com/microsoft/appcenter/appium/MemoryEventReporter.java`
#### Snippet
```java

    public boolean hasId(String id) {
        return java8.util.stream.StreamSupport.stream(events).anyMatch(report -> report.getId().equals(id));
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `java8.util.stream` is unnecessary, and can be replaced with an import
in `src/main/java/com/microsoft/appcenter/appium/MemoryEventReporter.java`
#### Snippet
```java

    public String[] getIds() {
        return java8.util.stream.StreamSupport.stream(events).map(Event::getId).toArray(String[]::new);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `io.appium.java_client.ios` is unnecessary, and can be replaced with an import
in `src/main/java/com/microsoft/appcenter/appium/EnhancedIOSDriver.java`
#### Snippet
```java
import java.util.List;

public class EnhancedIOSDriver<T extends WebElement> extends io.appium.java_client.ios.IOSDriver<WebElement> implements LabellingDriver {

    protected final EventReporter eventReporter;
```

### UnnecessaryFullyQualifiedName
Qualifier `io.appium.java_client.android` is unnecessary, and can be replaced with an import
in `src/main/java/com/microsoft/appcenter/appium/EnhancedAndroidDriver.java`
#### Snippet
```java
import java.util.List;

public class EnhancedAndroidDriver<T extends WebElement> extends io.appium.java_client.android.AndroidDriver<WebElement> implements LabellingDriver {

    protected final EventReporter eventReporter;
```

### UnnecessaryFullyQualifiedName
Qualifier `java8.util.function` is unnecessary, and can be replaced with an import
in `src/main/java/com/microsoft/appcenter/appium/DriverHelper.java`
#### Snippet
```java

class DriverHelper {
    static <X> X getScreenshotToWorkspace(Object result, OutputType<X> outputType, java8.util.function.Consumer<Path> reporter) {
        if (result instanceof String) {
            String base64EncodedPng = (String) result;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.openqa.selenium` is unnecessary and can be removed
in `src/main/java/com/microsoft/appcenter/appium/Factory.java`
#### Snippet
```java
     * @param url url of the server
     * @param capabilities desired capabilities for the session
     * @param <T>                 the required type of class which implement {@link org.openqa.selenium.WebElement}.
     *                            Instances of the defined type will be returned via findElement* and findElements*.
     *                            Warning (!!!). Allowed types:
```

### UnnecessaryFullyQualifiedName
Qualifier `org.openqa.selenium` is unnecessary and can be removed
in `src/main/java/com/microsoft/appcenter/appium/Factory.java`
#### Snippet
```java
     *                            Instances of the defined type will be returned via findElement* and findElements*.
     *                            Warning (!!!). Allowed types:
     *                            {@link org.openqa.selenium.WebElement}
     *                            {@link org.openqa.selenium.remote.RemoteWebElement}
     *                            {@link io.appium.java_client.MobileElement}
```

### UnnecessaryFullyQualifiedName
Qualifier `org.openqa.selenium` is unnecessary and can be removed
in `src/main/java/com/microsoft/appcenter/appium/Factory.java`
#### Snippet
```java
     * @param url                 url of the server
     * @param desiredCapabilities desired capabilities for the session
     * @param <T>                 the required type of class which implement {@link org.openqa.selenium.WebElement}.
     *                            Instances of the defined type will be returned via findElement* and findElements*.
     *                            Warning (!!!). Allowed types:
```

### UnnecessaryFullyQualifiedName
Qualifier `org.openqa.selenium` is unnecessary and can be removed
in `src/main/java/com/microsoft/appcenter/appium/Factory.java`
#### Snippet
```java
     *                            Instances of the defined type will be returned via findElement* and findElements*.
     *                            Warning (!!!). Allowed types:
     *                            {@link org.openqa.selenium.WebElement}
     *                            {@link org.openqa.selenium.remote.RemoteWebElement}
     *                            {@link io.appium.java_client.MobileElement}
```

### UnnecessaryFullyQualifiedName
Qualifier `org.openqa.selenium` is unnecessary and can be removed
in `src/main/java/com/microsoft/appcenter/appium/Factory.java`
#### Snippet
```java
     * @param httpClientFactory http client factory
     * @param desiredCapabilities desired capabilities for the session
     * @param <T>                 the required type of class which implement {@link org.openqa.selenium.WebElement}.
     *                            Instances of the defined type will be returned via findElement* and findElements*.
     *                            Warning (!!!). Allowed types:
```

### UnnecessaryFullyQualifiedName
Qualifier `org.openqa.selenium` is unnecessary and can be removed
in `src/main/java/com/microsoft/appcenter/appium/Factory.java`
#### Snippet
```java
     *                            Instances of the defined type will be returned via findElement* and findElements*.
     *                            Warning (!!!). Allowed types:
     *                            {@link org.openqa.selenium.WebElement}
     *                            {@link org.openqa.selenium.remote.RemoteWebElement}
     *                            {@link io.appium.java_client.MobileElement}
```

### UnnecessaryFullyQualifiedName
Qualifier `org.openqa.selenium` is unnecessary and can be removed
in `src/main/java/com/microsoft/appcenter/appium/Factory.java`
#### Snippet
```java
     * @param httpClientFactory http client factory
     * @param desiredCapabilities desired capabilities for the session
     * @param <T>                 the required type of class which implement {@link org.openqa.selenium.WebElement}.
     *                            Instances of the defined type will be returned via findElement* and findElements*.
     *                            Warning (!!!). Allowed types:
```

### UnnecessaryFullyQualifiedName
Qualifier `org.openqa.selenium` is unnecessary and can be removed
in `src/main/java/com/microsoft/appcenter/appium/Factory.java`
#### Snippet
```java
     *                            Instances of the defined type will be returned via findElement* and findElements*.
     *                            Warning (!!!). Allowed types:
     *                            {@link org.openqa.selenium.WebElement}
     *                            {@link org.openqa.selenium.remote.RemoteWebElement}
     *                            {@link io.appium.java_client.MobileElement}
```

### UnnecessaryFullyQualifiedName
Qualifier `org.openqa.selenium` is unnecessary and can be removed
in `src/main/java/com/microsoft/appcenter/appium/Factory.java`
#### Snippet
```java
     * @param builder service builder.  Warning: not supported in Xamarin test cloud.
     * @param desiredCapabilities desired capabilities for the session
     * @param <T>                 the required type of class which implement {@link org.openqa.selenium.WebElement}.
     *                            Instances of the defined type will be returned via findElement* and findElements*.
     *                            Warning (!!!). Allowed types:
```

### UnnecessaryFullyQualifiedName
Qualifier `org.openqa.selenium` is unnecessary and can be removed
in `src/main/java/com/microsoft/appcenter/appium/Factory.java`
#### Snippet
```java
     *                            Instances of the defined type will be returned via findElement* and findElements*.
     *                            Warning (!!!). Allowed types:
     *                            {@link org.openqa.selenium.WebElement}
     *                            {@link org.openqa.selenium.remote.RemoteWebElement}
     *                            {@link io.appium.java_client.MobileElement}
```

### UnnecessaryFullyQualifiedName
Qualifier `org.openqa.selenium` is unnecessary and can be removed
in `src/main/java/com/microsoft/appcenter/appium/Factory.java`
#### Snippet
```java
     * Create enhanced iOS driver, use in place of {@link io.appium.java_client.ios.IOSDriver#IOSDriver(URL, Capabilities)}
     * @param desiredCapabilities desired capabilities for the session
     * @param <T>                 the required type of class which implement {@link org.openqa.selenium.WebElement}.
     *                            Instances of the defined type will be returned via findElement* and findElements*.
     *                            Warning (!!!). Allowed types:
```

### UnnecessaryFullyQualifiedName
Qualifier `org.openqa.selenium` is unnecessary and can be removed
in `src/main/java/com/microsoft/appcenter/appium/Factory.java`
#### Snippet
```java
     *                            Instances of the defined type will be returned via findElement* and findElements*.
     *                            Warning (!!!). Allowed types:
     *                            {@link org.openqa.selenium.WebElement}
     *                            {@link org.openqa.selenium.remote.RemoteWebElement}
     *                            {@link io.appium.java_client.MobileElement}
```

### UnnecessaryFullyQualifiedName
Qualifier `org.openqa.selenium` is unnecessary and can be removed
in `src/main/java/com/microsoft/appcenter/appium/Factory.java`
#### Snippet
```java
     * @param httpClientFactory http client factory
     * @param desiredCapabilities desired capabilities for the session
     * @param <T>                 the required type of class which implement {@link org.openqa.selenium.WebElement}.
     *                            Instances of the defined type will be returned via findElement* and findElements*.
     *                            Warning (!!!). Allowed types:
```

### UnnecessaryFullyQualifiedName
Qualifier `org.openqa.selenium` is unnecessary and can be removed
in `src/main/java/com/microsoft/appcenter/appium/Factory.java`
#### Snippet
```java
     *                            Instances of the defined type will be returned via findElement* and findElements*.
     *                            Warning (!!!). Allowed types:
     *                            {@link org.openqa.selenium.WebElement}
     *                            {@link org.openqa.selenium.remote.RemoteWebElement}
     *                            {@link io.appium.java_client.MobileElement}
```

### UnnecessaryFullyQualifiedName
Qualifier `org.openqa.selenium` is unnecessary and can be removed
in `src/main/java/com/microsoft/appcenter/appium/Factory.java`
#### Snippet
```java
     * @param desiredCapabilities desired capabilities for the session
     * @return enhanced Android driver
     * @param <T>                 the required type of class which implement {@link org.openqa.selenium.WebElement}.
     *                            Instances of the defined type will be returned via findElement* and findElements*.
     *                            Warning (!!!). Allowed types:
```

### UnnecessaryFullyQualifiedName
Qualifier `org.openqa.selenium` is unnecessary and can be removed
in `src/main/java/com/microsoft/appcenter/appium/Factory.java`
#### Snippet
```java
     *                            Instances of the defined type will be returned via findElement* and findElements*.
     *                            Warning (!!!). Allowed types:
     *                            {@link org.openqa.selenium.WebElement}
     *                            {@link org.openqa.selenium.remote.RemoteWebElement}
     *                            {@link io.appium.java_client.MobileElement}
```

### UnnecessaryFullyQualifiedName
Qualifier `org.openqa.selenium` is unnecessary and can be removed
in `src/main/java/com/microsoft/appcenter/appium/Factory.java`
#### Snippet
```java
     * @param builder service builder.  Warning: not supported in Xamarin test cloud.
     * @param desiredCapabilities desired capabilities for the session
     * @param <T>                 the required type of class which implement {@link org.openqa.selenium.WebElement}.
     *                            Instances of the defined type will be returned via findElement* and findElements*.
     *                            Warning (!!!). Allowed types:
```

### UnnecessaryFullyQualifiedName
Qualifier `org.openqa.selenium` is unnecessary and can be removed
in `src/main/java/com/microsoft/appcenter/appium/Factory.java`
#### Snippet
```java
     *                            Instances of the defined type will be returned via findElement* and findElements*.
     *                            Warning (!!!). Allowed types:
     *                            {@link org.openqa.selenium.WebElement}
     *                            {@link org.openqa.selenium.remote.RemoteWebElement}
     *                            {@link io.appium.java_client.MobileElement}
```

### UnnecessaryFullyQualifiedName
Qualifier `org.openqa.selenium` is unnecessary and can be removed
in `src/main/java/com/microsoft/appcenter/appium/Factory.java`
#### Snippet
```java
     * @param desiredCapabilities desired capabilities for the session
     * @return enhanced IOS driver
     * @param <T>                 the required type of class which implement {@link org.openqa.selenium.WebElement}.
     *                            Instances of the defined type will be returned via findElement* and findElements*.
     *                            Warning (!!!). Allowed types:
```

### UnnecessaryFullyQualifiedName
Qualifier `org.openqa.selenium` is unnecessary and can be removed
in `src/main/java/com/microsoft/appcenter/appium/Factory.java`
#### Snippet
```java
     *                            Instances of the defined type will be returned via findElement* and findElements*.
     *                            Warning (!!!). Allowed types:
     *                            {@link org.openqa.selenium.WebElement}
     *                            {@link org.openqa.selenium.remote.RemoteWebElement}
     *                            {@link io.appium.java_client.MobileElement}
```

### UnnecessaryFullyQualifiedName
Qualifier `org.openqa.selenium` is unnecessary and can be removed
in `src/main/java/com/microsoft/appcenter/appium/Factory.java`
#### Snippet
```java
     * @param httpClientFactory http client factory
     * @param desiredCapabilities desired capabilities for the session
     * @param <T>                 the required type of class which implement {@link org.openqa.selenium.WebElement}.
     *                            Instances of the defined type will be returned via findElement* and findElements*.
     *                            Warning (!!!). Allowed types:
```

### UnnecessaryFullyQualifiedName
Qualifier `org.openqa.selenium` is unnecessary and can be removed
in `src/main/java/com/microsoft/appcenter/appium/Factory.java`
#### Snippet
```java
     *                            Instances of the defined type will be returned via findElement* and findElements*.
     *                            Warning (!!!). Allowed types:
     *                            {@link org.openqa.selenium.WebElement}
     *                            {@link org.openqa.selenium.remote.RemoteWebElement}
     *                            {@link io.appium.java_client.MobileElement}
```

### UnnecessaryFullyQualifiedName
Qualifier `org.openqa.selenium` is unnecessary and can be removed
in `src/main/java/com/microsoft/appcenter/appium/Factory.java`
#### Snippet
```java
     * @param httpClientFactory http client factory
     * @param desiredCapabilities desired capabilities for the session
     * @param <T>                 the required type of class which implement {@link org.openqa.selenium.WebElement}.
     *                            Instances of the defined type will be returned via findElement* and findElements*.
     *                            Warning (!!!). Allowed types:
```

### UnnecessaryFullyQualifiedName
Qualifier `org.openqa.selenium` is unnecessary and can be removed
in `src/main/java/com/microsoft/appcenter/appium/Factory.java`
#### Snippet
```java
     *                            Instances of the defined type will be returned via findElement* and findElements*.
     *                            Warning (!!!). Allowed types:
     *                            {@link org.openqa.selenium.WebElement}
     *                            {@link org.openqa.selenium.remote.RemoteWebElement}
     *                            {@link io.appium.java_client.MobileElement}
```

### UnnecessaryFullyQualifiedName
Qualifier `org.openqa.selenium` is unnecessary and can be removed
in `src/main/java/com/microsoft/appcenter/appium/Factory.java`
#### Snippet
```java
     * Create enhanced android driver, use in place of {@link io.appium.java_client.android.AndroidDriver#AndroidDriver(URL, Capabilities)}
     * @param desiredCapabilities desired capabilities for the session
     * @param <T>                 the required type of class which implement {@link org.openqa.selenium.WebElement}.
     *                            Instances of the defined type will be returned via findElement* and findElements*.
     *                            Warning (!!!). Allowed types:
```

### UnnecessaryFullyQualifiedName
Qualifier `org.openqa.selenium` is unnecessary and can be removed
in `src/main/java/com/microsoft/appcenter/appium/Factory.java`
#### Snippet
```java
     *                            Instances of the defined type will be returned via findElement* and findElements*.
     *                            Warning (!!!). Allowed types:
     *                            {@link org.openqa.selenium.WebElement}
     *                            {@link org.openqa.selenium.remote.RemoteWebElement}
     *                            {@link io.appium.java_client.MobileElement}
```

### UnnecessaryFullyQualifiedName
Qualifier `org.openqa.selenium` is unnecessary and can be removed
in `src/main/java/com/microsoft/appcenter/appium/Factory.java`
#### Snippet
```java
     * @param httpClientFactory http client factory
     * @param desiredCapabilities desired capabilities for the session
     * @param <T>                 the required type of class which implement {@link org.openqa.selenium.WebElement}.
     *                            Instances of the defined type will be returned via findElement* and findElements*.
     *                            Warning (!!!). Allowed types:
```

### UnnecessaryFullyQualifiedName
Qualifier `org.openqa.selenium` is unnecessary and can be removed
in `src/main/java/com/microsoft/appcenter/appium/Factory.java`
#### Snippet
```java
     *                            Instances of the defined type will be returned via findElement* and findElements*.
     *                            Warning (!!!). Allowed types:
     *                            {@link org.openqa.selenium.WebElement}
     *                            {@link org.openqa.selenium.remote.RemoteWebElement}
     *                            {@link io.appium.java_client.MobileElement}
```

### UnnecessaryFullyQualifiedName
Qualifier `org.openqa.selenium` is unnecessary and can be removed
in `src/main/java/com/microsoft/appcenter/appium/Factory.java`
#### Snippet
```java
     * @param httpClientFactory http client factory
     * @param desiredCapabilities desired capabilities for the session
     * @param <T>                 the required type of class which implement {@link org.openqa.selenium.WebElement}.
     *                            Instances of the defined type will be returned via findElement* and findElements*.
     *                            Warning (!!!). Allowed types:
```

### UnnecessaryFullyQualifiedName
Qualifier `org.openqa.selenium` is unnecessary and can be removed
in `src/main/java/com/microsoft/appcenter/appium/Factory.java`
#### Snippet
```java
     *                            Instances of the defined type will be returned via findElement* and findElements*.
     *                            Warning (!!!). Allowed types:
     *                            {@link org.openqa.selenium.WebElement}
     *                            {@link org.openqa.selenium.remote.RemoteWebElement}
     *                            {@link io.appium.java_client.MobileElement}
```

### UnnecessaryFullyQualifiedName
Qualifier `org.openqa.selenium` is unnecessary and can be removed
in `src/main/java/com/microsoft/appcenter/appium/Factory.java`
#### Snippet
```java
     * @param desiredCapabilities desired capabilities for the session
     * @return enhanced Android driver
     * @param <T>                 the required type of class which implement {@link org.openqa.selenium.WebElement}.
     *                            Instances of the defined type will be returned via findElement* and findElements*.
     *                            Warning (!!!). Allowed types:
```

### UnnecessaryFullyQualifiedName
Qualifier `org.openqa.selenium` is unnecessary and can be removed
in `src/main/java/com/microsoft/appcenter/appium/Factory.java`
#### Snippet
```java
     *                            Instances of the defined type will be returned via findElement* and findElements*.
     *                            Warning (!!!). Allowed types:
     *                            {@link org.openqa.selenium.WebElement}
     *                            {@link org.openqa.selenium.remote.RemoteWebElement}
     *                            {@link io.appium.java_client.MobileElement}
```

## RuleId[ruleID=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import java.util.List;`
in `src/main/java/com/microsoft/appcenter/appium/EnhancedAndroidDriver.java`
#### Snippet
```java

import java.net.URL;
import java.util.List;

public class EnhancedAndroidDriver<T extends WebElement> extends io.appium.java_client.android.AndroidDriver<WebElement> implements LabellingDriver {
```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `src/main/java/com/microsoft/appcenter/appium/EnhancedIOSDriver.java`
#### Snippet
```java

import java.net.URL;
import java.util.List;

public class EnhancedIOSDriver<T extends WebElement> extends io.appium.java_client.ios.IOSDriver<WebElement> implements LabellingDriver {
```

## RuleId[ruleID=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
Unnecessary string length argument
in `src/main/java/com/microsoft/appcenter/appium/javassist/GenericsRewrite.java`
#### Snippet
```java
                    }
                    final String newSignature = genericSignature.substring(0, start) + GenericdDecl +
                            genericSignature.substring(stop + 1, genericSignature.length());
                    cc.setGenericSignature(newSignature);
                    cc.writeFile();
```

## RuleId[ruleID=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `usedIds` are updated, but never queried
in `src/main/java/com/microsoft/appcenter/appium/EventReporter.java`
#### Snippet
```java
abstract class EventReporter {

    private Set<String> usedIds = new HashSet<>();
    private Description lastDescription = null;
    private int labelCounter = 0;
```

## RuleId[ruleID=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\]` in RegExp
in `src/main/java/com/microsoft/appcenter/appium/EventReporter.java`
#### Snippet
```java
    private int labelCounter = 0;
    private int screenshotCounter = 0;
    private final Pattern paramsFinder = Pattern.compile("\\[(\\d+?)\\]");

    void reportJunit(EventType eventType, Description description, Throwable throwable) {
```

## RuleId[ruleID=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/com/microsoft/appcenter/appium/EventReporter.java`
#### Snippet
```java
    private Description lastDescription = null;
    private int labelCounter = 0;
    private int screenshotCounter = 0;
    private final Pattern paramsFinder = Pattern.compile("\\[(\\d+?)\\]");

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/com/microsoft/appcenter/appium/EventReporter.java`
#### Snippet
```java
    private Set<String> usedIds = new HashSet<>();
    private Description lastDescription = null;
    private int labelCounter = 0;
    private int screenshotCounter = 0;
    private final Pattern paramsFinder = Pattern.compile("\\[(\\d+?)\\]");
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/com/microsoft/appcenter/appium/EventReporter.java`
#### Snippet
```java

    private Set<String> usedIds = new HashSet<>();
    private Description lastDescription = null;
    private int labelCounter = 0;
    private int screenshotCounter = 0;
```

## RuleId[ruleID=GroovyUnusedAssignment]
### GroovyUnusedAssignment
Assignment is not used
in `build.gradle`
#### Snippet
```java

// Basic information about the project
group = ext.groupId
version = ext.packageVersion
archivesBaseName = ext.projectId
```

### GroovyUnusedAssignment
Assignment is not used
in `build.gradle`
#### Snippet
```java
group = ext.groupId
version = ext.packageVersion
archivesBaseName = ext.projectId
description = ext.projectDescription
java.sourceCompatibility = JavaVersion.VERSION_1_8
```

## RuleId[ruleID=ReturnNull]
### ReturnNull
Return of `null`
in `src/main/java/com/microsoft/appcenter/appium/DriverHelper.java`
#### Snippet
```java
    static String sanitize(String input) {
        if (null == input) {
            return null;
        }
        return input.replaceAll("[\n\r:=]", " ");
```

## RuleId[ruleID=NonShortCircuitBoolean]
### NonShortCircuitBoolean
Non-short-circuit boolean expression `start == -1 | stop == -1`
in `src/main/java/com/microsoft/appcenter/appium/javassist/GenericsRewrite.java`
#### Snippet
```java
                    final int start = genericSignature.lastIndexOf('<');
                    final int stop = genericSignature.lastIndexOf('>');
                    if (start == -1 | stop == -1 || stop < start) {
                        throw new RuntimeException(String.format("Unable to find existing generics in signature %s, %d, %d", genericSignature, start, stop));
                    }
```

## RuleId[ruleID=RedundantStringFormatCall]
### RedundantStringFormatCall
Redundant call to `format()`
in `src/main/java/com/microsoft/appcenter/appium/StdOutEventReporter.java`
#### Snippet
```java
        switch (event.getType()) {
            case started:
                System.out.println(String.format("%s: %s (%s)", event.getType().name(), event.getTestName(), event.getClassName()));
                break;
            case label:
```

### RedundantStringFormatCall
Redundant call to `format()`
in `src/main/java/com/microsoft/appcenter/appium/StdOutEventReporter.java`
#### Snippet
```java
                break;
            case label:
                System.out.println(String.format("%s - %s", event.getLabel(), event.getScreenshotPath()));
                break;
            case screenshot:
```

### RedundantStringFormatCall
Redundant call to `format()`
in `src/main/java/com/microsoft/appcenter/appium/StdOutEventReporter.java`
#### Snippet
```java
                break;
            case screenshot:
                System.out.println(String.format("Took screenshot - %s", event.getScreenshotPath()));
                break;
            default:
```

## RuleId[ruleID=BoundedWildcard]
### BoundedWildcard
Can generalize to `? super Path`
in `src/main/java/com/microsoft/appcenter/appium/DriverHelper.java`
#### Snippet
```java

class DriverHelper {
    static <X> X getScreenshotToWorkspace(Object result, OutputType<X> outputType, java8.util.function.Consumer<Path> reporter) {
        if (result instanceof String) {
            String base64EncodedPng = (String) result;
```

