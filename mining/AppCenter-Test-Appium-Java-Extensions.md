# AppCenter-Test-Appium-Java-Extensions 
 
# Bad smells
I found 34 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UNCHECKED_WARNING | 16 | false |
| RedundantStringFormatCall | 3 | false |
| FieldCanBeLocal | 3 | false |
| Deprecation | 2 | false |
| UNUSED_IMPORT | 2 | false |
| NullableProblems | 2 | false |
| FieldMayBeFinal | 2 | false |
| StringEquality | 1 | false |
| StringOperationCanBeSimplified | 1 | false |
| MismatchedCollectionQueryUpdate | 1 | false |
| RegExpRedundantEscape | 1 | false |
## RuleId[id=StringEquality]
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

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked assignment: 'com.microsoft.appcenter.appium.EnhancedIOSDriver' to 'com.microsoft.appcenter.appium.EnhancedIOSDriver'
in `src/main/java/com/microsoft/appcenter/appium/Factory.java`
#### Snippet
```java
    public static <T extends WebElement> EnhancedIOSDriver<T> createIOSDriver(AppiumDriverLocalService service, Capabilities desiredCapabilities) {
        WarnServiceAndBuilerNotSupportedInXTC();
        return provider.createIOSDriver(service, desiredCapabilities);

    }
```

### UNCHECKED_WARNING
Unchecked assignment: 'com.microsoft.appcenter.appium.EnhancedAndroidDriver' to 'com.microsoft.appcenter.appium.EnhancedAndroidDriver'
in `src/main/java/com/microsoft/appcenter/appium/Factory.java`
#### Snippet
```java
     */
    public static <T extends WebElement> EnhancedAndroidDriver<T> createAndroidDriver(HttpClient.Factory httpClientFactory, Capabilities desiredCapabilities) {
        return provider.createAndroidDriver(httpClientFactory, desiredCapabilities);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'com.microsoft.appcenter.appium.EnhancedIOSDriver' to 'com.microsoft.appcenter.appium.EnhancedIOSDriver'
in `src/main/java/com/microsoft/appcenter/appium/Factory.java`
#### Snippet
```java
    public static <T extends WebElement> EnhancedIOSDriver<T> createIOSDriver(AppiumServiceBuilder builder, Capabilities desiredCapabilities) {
        WarnServiceAndBuilerNotSupportedInXTC();
        return provider.createIOSDriver(builder, desiredCapabilities);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'com.microsoft.appcenter.appium.EnhancedIOSDriver' to 'com.microsoft.appcenter.appium.EnhancedIOSDriver'
in `src/main/java/com/microsoft/appcenter/appium/Factory.java`
#### Snippet
```java
    public static <T extends WebElement> EnhancedIOSDriver<T> createIOSDriver(AppiumServiceBuilder builder, HttpClient.Factory httpClientFactory, Capabilities desiredCapabilities) {
        WarnServiceAndBuilerNotSupportedInXTC();
        return provider.createIOSDriver(builder, httpClientFactory, desiredCapabilities);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'com.microsoft.appcenter.appium.EnhancedAndroidDriver' to 'com.microsoft.appcenter.appium.EnhancedAndroidDriver'
in `src/main/java/com/microsoft/appcenter/appium/Factory.java`
#### Snippet
```java
    public static <T extends WebElement> EnhancedAndroidDriver<T> createAndroidDriver(AppiumServiceBuilder builder, HttpClient.Factory httpClientFactory, Capabilities desiredCapabilities) {
        WarnServiceAndBuilerNotSupportedInXTC();
        return provider.createAndroidDriver(builder, httpClientFactory, desiredCapabilities);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'com.microsoft.appcenter.appium.EnhancedIOSDriver' to 'com.microsoft.appcenter.appium.EnhancedIOSDriver'
in `src/main/java/com/microsoft/appcenter/appium/Factory.java`
#### Snippet
```java
     */
    public static <T extends WebElement> EnhancedIOSDriver<T> createIOSDriver(HttpClient.Factory httpClientFactory, Capabilities desiredCapabilities) {
        return provider.createIOSDriver(httpClientFactory, desiredCapabilities);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'com.microsoft.appcenter.appium.EnhancedIOSDriver' to 'com.microsoft.appcenter.appium.EnhancedIOSDriver'
in `src/main/java/com/microsoft/appcenter/appium/Factory.java`
#### Snippet
```java
    public static <T extends WebElement> EnhancedIOSDriver<T> createIOSDriver(AppiumDriverLocalService service, HttpClient.Factory httpClientFactory, Capabilities desiredCapabilities) {
        WarnServiceAndBuilerNotSupportedInXTC();
        return provider.createIOSDriver(service, httpClientFactory, desiredCapabilities);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'com.microsoft.appcenter.appium.EnhancedIOSDriver' to 'com.microsoft.appcenter.appium.EnhancedIOSDriver'
in `src/main/java/com/microsoft/appcenter/appium/Factory.java`
#### Snippet
```java
     */
    public static <T extends WebElement> EnhancedIOSDriver<T> createIOSDriver(URL url, HttpClient.Factory httpClientFactory, Capabilities desiredCapabilities) {
        return provider.createIOSDriver(url, httpClientFactory, desiredCapabilities);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'com.microsoft.appcenter.appium.EnhancedAndroidDriver' to 'com.microsoft.appcenter.appium.EnhancedAndroidDriver'
in `src/main/java/com/microsoft/appcenter/appium/Factory.java`
#### Snippet
```java
     */
    public static <T extends WebElement> EnhancedAndroidDriver<T> createAndroidDriver(URL url, DesiredCapabilities desiredCapabilities) {
        return provider.createAndroidDriver(url, desiredCapabilities);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'com.microsoft.appcenter.appium.EnhancedAndroidDriver' to 'com.microsoft.appcenter.appium.EnhancedAndroidDriver'
in `src/main/java/com/microsoft/appcenter/appium/Factory.java`
#### Snippet
```java
     */
    public static <T extends WebElement> EnhancedAndroidDriver<T> createAndroidDriver(Capabilities desiredCapabilities) {
        return provider.createAndroidDriver(desiredCapabilities);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'com.microsoft.appcenter.appium.EnhancedAndroidDriver' to 'com.microsoft.appcenter.appium.EnhancedAndroidDriver'
in `src/main/java/com/microsoft/appcenter/appium/Factory.java`
#### Snippet
```java
    public static <T extends WebElement> EnhancedAndroidDriver<T> createAndroidDriver(AppiumServiceBuilder builder, Capabilities desiredCapabilities) {
        WarnServiceAndBuilerNotSupportedInXTC();
        return provider.createAndroidDriver(builder, desiredCapabilities);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'com.microsoft.appcenter.appium.EnhancedIOSDriver' to 'com.microsoft.appcenter.appium.EnhancedIOSDriver'
in `src/main/java/com/microsoft/appcenter/appium/Factory.java`
#### Snippet
```java
     */
    public static <T extends WebElement> EnhancedIOSDriver<T> createIOSDriver(URL url, DesiredCapabilities capabilities) {
        return provider.createIOSDriver(url, capabilities);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'com.microsoft.appcenter.appium.EnhancedIOSDriver' to 'com.microsoft.appcenter.appium.EnhancedIOSDriver'
in `src/main/java/com/microsoft/appcenter/appium/Factory.java`
#### Snippet
```java
     */
    public static <T extends WebElement> EnhancedIOSDriver<T> createIOSDriver(Capabilities desiredCapabilities) {
        return provider.createIOSDriver(desiredCapabilities);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'com.microsoft.appcenter.appium.EnhancedAndroidDriver' to 'com.microsoft.appcenter.appium.EnhancedAndroidDriver'
in `src/main/java/com/microsoft/appcenter/appium/Factory.java`
#### Snippet
```java
    public static <T extends WebElement> EnhancedAndroidDriver<T> createAndroidDriver(AppiumDriverLocalService service, Capabilities desiredCapabilities) {
        WarnServiceAndBuilerNotSupportedInXTC();
        return provider.createAndroidDriver(service, desiredCapabilities);

    }
```

### UNCHECKED_WARNING
Unchecked assignment: 'com.microsoft.appcenter.appium.EnhancedAndroidDriver' to 'com.microsoft.appcenter.appium.EnhancedAndroidDriver'
in `src/main/java/com/microsoft/appcenter/appium/Factory.java`
#### Snippet
```java
    public static <T extends WebElement> EnhancedAndroidDriver<T> createAndroidDriver(AppiumDriverLocalService service, HttpClient.Factory httpClientFactory, Capabilities desiredCapabilities) {
        WarnServiceAndBuilerNotSupportedInXTC();
        return provider.createAndroidDriver(service, httpClientFactory, desiredCapabilities);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'com.microsoft.appcenter.appium.EnhancedAndroidDriver' to 'com.microsoft.appcenter.appium.EnhancedAndroidDriver'
in `src/main/java/com/microsoft/appcenter/appium/Factory.java`
#### Snippet
```java
     */
    public static <T extends WebElement> EnhancedAndroidDriver<T> createAndroidDriver(URL url, HttpClient.Factory httpClientFactory, Capabilities desiredCapabilities) {
        return provider.createAndroidDriver(url, httpClientFactory, desiredCapabilities);
    }

```

## RuleId[id=Deprecation]
### Deprecation
Overrides deprecated method in 'org.junit.rules.TestWatcher'
in `src/main/java/com/microsoft/appcenter/appium/Watcher.java`
#### Snippet
```java

    @Override
    protected void skipped(org.junit.internal.AssumptionViolatedException e, Description description) {
        this.eventReporter.reportJunit(EventType.skipped, description, e);
        super.skipped(e, description);
```

### Deprecation
'skipped(org.junit.internal.AssumptionViolatedException, org.junit.runner.Description)' is deprecated
in `src/main/java/com/microsoft/appcenter/appium/Watcher.java`
#### Snippet
```java
    protected void skipped(org.junit.internal.AssumptionViolatedException e, Description description) {
        this.eventReporter.reportJunit(EventType.skipped, description, e);
        super.skipped(e, description);
    }

```

## RuleId[id=RedundantStringFormatCall]
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

## RuleId[id=UNUSED_IMPORT]
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

## RuleId[id=StringOperationCanBeSimplified]
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

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/com/microsoft/appcenter/appium/Watcher.java`
#### Snippet
```java

    @Override
    protected void finished(Description description) {
        super.finished(description);
        this.eventReporter.reportJunit(EventType.finished, description, null);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/com/microsoft/appcenter/appium/Watcher.java`
#### Snippet
```java

    @Override
    protected void starting(Description description) {
        super.starting(description);
        this.eventReporter.reportJunit(EventType.started, description, null);
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `GenericdDecl` may be 'final'
in `src/main/java/com/microsoft/appcenter/appium/javassist/GenericsRewrite.java`
#### Snippet
```java

public class GenericsRewrite {
    private static String GenericdDecl = "<TT;>";
    public static void main(String[] args) {
        ClassPool pool = ClassPool.getDefault();
```

### FieldMayBeFinal
Field `usedIds` may be 'final'
in `src/main/java/com/microsoft/appcenter/appium/EventReporter.java`
#### Snippet
```java
abstract class EventReporter {

    private Set<String> usedIds = new HashSet<>();
    private Description lastDescription = null;
    private int labelCounter = 0;
```

## RuleId[id=MismatchedCollectionQueryUpdate]
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

## RuleId[id=RegExpRedundantEscape]
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

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/com/microsoft/appcenter/appium/javassist/GenericsRewrite.java`
#### Snippet
```java

public class GenericsRewrite {
    private static String GenericdDecl = "<TT;>";
    public static void main(String[] args) {
        ClassPool pool = ClassPool.getDefault();
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/com/microsoft/appcenter/appium/ShortIdentifier.java`
#### Snippet
```java
    private final Pattern sanitizer = Pattern.compile("[^a-zA-Z0-9.:_()\\[\\]]");
    private final int partMaxLength = 50;
    private final int idMaxLength = 1024; // other 1024 reserved for leading path
    private final String shortId;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/com/microsoft/appcenter/appium/ShortIdentifier.java`
#### Snippet
```java

    private final Pattern sanitizer = Pattern.compile("[^a-zA-Z0-9.:_()\\[\\]]");
    private final int partMaxLength = 50;
    private final int idMaxLength = 1024; // other 1024 reserved for leading path
    private final String shortId;
```

