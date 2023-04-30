# jvm-native-trusted-roots 
 
# Bad smells
I found 17 bad smells with 7 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UtilityClassWithoutPrivateConstructor | 7 | true |
| MissortedModifiers | 5 | false |
| UnnecessarySuperQualifier | 2 | false |
| UnnecessaryFullyQualifiedName | 1 | false |
| NestedAssignment | 1 | false |
| BoundedWildcard | 1 | false |
## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `NativeTrustedRootsDebugMain` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/jetbrains/nativecerts/NativeTrustedRootsDebugMain.java`
#### Snippet
```java
import static org.jetbrains.nativecerts.NativeTrustedRootsInternalUtils.sha256hex;

public class NativeTrustedRootsDebugMain {
    private final static Logger rootLogger = Logger.getLogger("");
    private final static Logger LOG = Logger.getLogger(NativeTrustedRootsDebugMain.class.getName());
```

### UtilityClassWithoutPrivateConstructor
Class `Crypt32ExtUtil` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/jetbrains/nativecerts/win32/Crypt32ExtUtil.java`
#### Snippet
```java
import static org.jetbrains.nativecerts.NativeTrustedRootsInternalUtils.renderExceptionMessage;

public class Crypt32ExtUtil {
    private final static Logger LOGGER = Logger.getLogger(Crypt32ExtUtil.class.getName());

```

### UtilityClassWithoutPrivateConstructor
Class `SecurityFrameworkUtil` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/jetbrains/nativecerts/mac/SecurityFrameworkUtil.java`
#### Snippet
```java
 * the SSL framework of JVM.
 */
public class SecurityFrameworkUtil {
    private final static Logger LOGGER = Logger.getLogger(SecurityFrameworkUtil.class.getName());

```

### UtilityClassWithoutPrivateConstructor
Class `PemReaderUtil` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/jetbrains/nativecerts/linux/PemReaderUtil.java`
#### Snippet
```java
import java.util.List;

public class PemReaderUtil {
    private static final String BEGIN_CERT = "-----BEGIN CERTIFICATE-----";
    private static final String END_CERT = "-----END CERTIFICATE-----";
```

### UtilityClassWithoutPrivateConstructor
Class `NativeTrustedCertificates` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/jetbrains/nativecerts/NativeTrustedCertificates.java`
#### Snippet
```java
import static org.jetbrains.nativecerts.NativeTrustedRootsInternalUtils.*;

public class NativeTrustedCertificates {
    private static final Logger LOGGER = Logger.getLogger(NativeTrustedCertificates.class.getName());

```

### UtilityClassWithoutPrivateConstructor
Class `LinuxTrustedCertificatesUtil` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/jetbrains/nativecerts/linux/LinuxTrustedCertificatesUtil.java`
#### Snippet
```java
import static org.jetbrains.nativecerts.NativeTrustedRootsInternalUtils.renderExceptionMessage;

public class LinuxTrustedCertificatesUtil {
    private final static Logger LOGGER = Logger.getLogger(LinuxTrustedCertificatesUtil.class.getName());

```

### UtilityClassWithoutPrivateConstructor
Class `NativeTrustedRootsInternalUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/jetbrains/nativecerts/NativeTrustedRootsInternalUtils.java`
#### Snippet
```java

@ApiStatus.Internal
public class NativeTrustedRootsInternalUtils {
    private static final String _OS_NAME = System.getProperty("os.name").toLowerCase(Locale.ENGLISH);
    public static final boolean isWindows = _OS_NAME.startsWith("windows");
```

## RuleId[id=UnnecessarySuperQualifier]
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/jetbrains/nativecerts/mac/CFStringRefByReference.java`
#### Snippet
```java
    @Nullable
    public CoreFoundation.CFStringRef getStringRef() {
        Pointer value = super.getValue();
        if (value == null) {
            return null;
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/jetbrains/nativecerts/mac/CFArrayRefByReference.java`
#### Snippet
```java
    @Nullable
    public CoreFoundation.CFArrayRef getArray() {
        Pointer value = super.getValue();
        if (value == null) {
            return null;
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `com.sun.jna.platform.mac` is unnecessary and can be removed
in `src/main/java/org/jetbrains/nativecerts/mac/SecurityFramework.java`
#### Snippet
```java
     *          For possible values, see {@link SecTrustSettingsDomain}.
     * @param trustSettings
     *          On return, an array of {@link com.sun.jna.platform.mac.CoreFoundation.CFDictionaryRef} objects
     *          specifying the trust settings for the certificate. For the contents of the dictionaries,
     *          see the discussion below. Call the {@link CoreFoundation#CFRelease(CoreFoundation.CFTypeRef)} function
```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `src/main/java/org/jetbrains/nativecerts/linux/PemReaderUtil.java`
#### Snippet
```java
        try (LineNumberReader reader = new LineNumberReader(new InputStreamReader(inputStream, StandardCharsets.US_ASCII))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String outerTrimmed = line.trim();
                if (outerTrimmed.isEmpty()) {
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? super SecurityFramework.SecCertificateRef`
in `src/main/java/org/jetbrains/nativecerts/mac/SecurityFrameworkUtil.java`
#### Snippet
```java
    public static List<X509Certificate> SecTrustSettingsCopyCertificates(
            @NotNull SecurityFramework.SecTrustSettingsDomain domain,
            Predicate<SecurityFramework.SecCertificateRef> predicate) {
        CFArrayRefByReference returnedCertArray = new CFArrayRefByReference();
        SecurityFramework.OSStatus rc = SecurityFramework.INSTANCE.SecTrustSettingsCopyCertificates(domain, returnedCertArray);
```

## RuleId[id=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/org/jetbrains/nativecerts/NativeTrustedRootsDebugMain.java`
#### Snippet
```java

public class NativeTrustedRootsDebugMain {
    private final static Logger rootLogger = Logger.getLogger("");
    private final static Logger LOG = Logger.getLogger(NativeTrustedRootsDebugMain.class.getName());

```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/org/jetbrains/nativecerts/NativeTrustedRootsDebugMain.java`
#### Snippet
```java
public class NativeTrustedRootsDebugMain {
    private final static Logger rootLogger = Logger.getLogger("");
    private final static Logger LOG = Logger.getLogger(NativeTrustedRootsDebugMain.class.getName());

    public static void main(String[] args) throws Exception {
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/org/jetbrains/nativecerts/win32/Crypt32ExtUtil.java`
#### Snippet
```java

public class Crypt32ExtUtil {
    private final static Logger LOGGER = Logger.getLogger(Crypt32ExtUtil.class.getName());

    private static final Map<String, Integer> customTrustedCertificatesLocations = Map.of(
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/org/jetbrains/nativecerts/mac/SecurityFrameworkUtil.java`
#### Snippet
```java
 */
public class SecurityFrameworkUtil {
    private final static Logger LOGGER = Logger.getLogger(SecurityFrameworkUtil.class.getName());

    public static List<X509Certificate> getTrustedRoots(SecurityFramework.SecTrustSettingsDomain domain) {
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/org/jetbrains/nativecerts/linux/LinuxTrustedCertificatesUtil.java`
#### Snippet
```java

public class LinuxTrustedCertificatesUtil {
    private final static Logger LOGGER = Logger.getLogger(LinuxTrustedCertificatesUtil.class.getName());

    // The same discovery logic as in Go
```

