# gradle-jdks 
 
# Bad smells
I found 31 bad smells with 7 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnstableApiUsage | 12 | false |
| AbstractClassNeverImplemented | 5 | false |
| CodeBlock2Expr | 5 | true |
| AbstractMethodCallInConstructor | 3 | false |
| BoundedWildcard | 2 | false |
| OptionalContainsCollection | 2 | false |
| NonProtectedConstructorInAbstractClass | 2 | true |
## RuleId[id=AbstractMethodCallInConstructor]
### AbstractMethodCallInConstructor
Call to 'abstract' method `getLogLevel()` during object construction
in `gradle-jdks/src/main/java/com/palantir/gradle/jdks/PalantirCaExtension.java`
#### Snippet
```java

    public PalantirCaExtension() {
        getLogLevel().set(LogLevel.INFO);
    }
}
```

### AbstractMethodCallInConstructor
Call to 'abstract' method `getObjectFactory()` during object construction
in `gradle-jdks/src/main/java/com/palantir/gradle/jdks/JdksExtension.java`
#### Snippet
```java
        // do since it's known that Property access is racy)
        this.caCerts = SynchronizedInterface.synchronizeAllInterfaceMethods(
                MapProperty.class, getObjectFactory().mapProperty(String.class, String.class));
        this.jdkStorageLocation = SynchronizedInterface.synchronizeAllInterfaceMethods(
                DirectoryProperty.class, getObjectFactory().directoryProperty());
```

### AbstractMethodCallInConstructor
Call to 'abstract' method `getObjectFactory()` during object construction
in `gradle-jdks/src/main/java/com/palantir/gradle/jdks/JdksExtension.java`
#### Snippet
```java
                MapProperty.class, getObjectFactory().mapProperty(String.class, String.class));
        this.jdkStorageLocation = SynchronizedInterface.synchronizeAllInterfaceMethods(
                DirectoryProperty.class, getObjectFactory().directoryProperty());
        this.getCaCerts().finalizeValueOnRead();
        this.getJdkStorageLocation().finalizeValueOnRead();
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends T`
in `gradle-jdks/src/main/java/com/palantir/gradle/jdks/SynchronizedInterface.java`
#### Snippet
```java

final class SynchronizedInterface {
    public static <T> T synchronizeAllInterfaceMethods(Class<T> returnInterface, T original) {
        Object sync = new Object();
        return returnInterface.cast(Proxy.newProxyInstance(
```

### BoundedWildcard
Can generalize to `? extends Directory`
in `gradle-jdks/src/main/java/com/palantir/gradle/jdks/JdkManager.java`
#### Snippet
```java
    private final JdkDownloaders jdkDownloaders;

    JdkManager(Provider<Directory> storageLocation, JdkDistributions jdkDistributions, JdkDownloaders jdkDownloaders) {
        this.storageLocation = storageLocation;
        this.jdkDistributions = jdkDistributions;
```

## RuleId[id=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `JdkExtension` has no concrete subclass
in `gradle-jdks/src/main/java/com/palantir/gradle/jdks/JdkExtension.java`
#### Snippet
```java
import org.gradle.api.provider.Property;

public abstract class JdkExtension {
    // Not called `version` to avoid being interfered with by `Project#setVersion`!
    public abstract Property<String> getJdkVersion();
```

### AbstractClassNeverImplemented
Abstract class `PalantirCaExtension` has no concrete subclass
in `gradle-jdks/src/main/java/com/palantir/gradle/jdks/PalantirCaExtension.java`
#### Snippet
```java
import org.gradle.api.provider.Property;

public abstract class PalantirCaExtension {
    public abstract Property<LogLevel> getLogLevel();

```

### AbstractClassNeverImplemented
Abstract class `JdkDistributionExtension` has no concrete subclass
in `gradle-jdks/src/main/java/com/palantir/gradle/jdks/JdkDistributionExtension.java`
#### Snippet
```java
import org.gradle.api.provider.Property;

public abstract class JdkDistributionExtension {
    public abstract Property<String> getBaseUrl();
}
```

### AbstractClassNeverImplemented
Abstract class `GradleJdksJavaInstallationMetadata` has no concrete subclass
in `gradle-jdks/src/main/java/com/palantir/gradle/jdks/GradleJdksJavaInstallationMetadata.java`
#### Snippet
```java

@Value.Immutable
abstract class GradleJdksJavaInstallationMetadata implements JavaInstallationMetadata {
    protected abstract Provider<Directory> installationPathProvider();

```

### AbstractClassNeverImplemented
Abstract class `JdksExtension` has no concrete subclass
in `gradle-jdks/src/main/java/com/palantir/gradle/jdks/JdksExtension.java`
#### Snippet
```java
import org.gradle.jvm.toolchain.JavaLanguageVersion;

public abstract class JdksExtension {
    private final LazilyConfiguredMapping<JdkDistributionName, JdkDistributionExtension, Void> jdkDistributions;
    private final LazilyConfiguredMapping<JavaLanguageVersion, JdkExtension, Project> jdks;
```

## RuleId[id=OptionalContainsCollection]
### OptionalContainsCollection
'Optional' contains array `byte[]`
in `gradle-jdks/src/main/java/com/palantir/gradle/jdks/PalantirCaPlugin.java`
#### Snippet
```java
    }

    private Optional<byte[]> systemCertificates() {
        Os currentOs = Os.current();

```

### OptionalContainsCollection
'Optional' contains array `byte[]`
in `gradle-jdks/src/main/java/com/palantir/gradle/jdks/PalantirCaPlugin.java`
#### Snippet
```java
    }

    private Optional<byte[]> linuxSystemCertificates() {
        List<Path> possibleCaCertificatePaths = List.of(
                // Ubuntu/debian
```

## RuleId[id=CodeBlock2Expr]
### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `gradle-jdks/src/main/java/com/palantir/gradle/jdks/JdksPlugin.java`
#### Snippet
```java
                                () -> new File(System.getProperty("user.home"), ".gradle/gradle-jdks"))));

        Arrays.stream(JdkDistributionName.values()).forEach(jdkDistributionName -> {
            jdksExtension.jdkDistribution(jdkDistributionName, jdkDistributionExtension -> {
                jdkDistributionExtension
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `gradle-jdks/src/main/java/com/palantir/gradle/jdks/JdksPlugin.java`
#### Snippet
```java

        Arrays.stream(JdkDistributionName.values()).forEach(jdkDistributionName -> {
            jdksExtension.jdkDistribution(jdkDistributionName, jdkDistributionExtension -> {
                jdkDistributionExtension
                        .getBaseUrl()
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `gradle-jdks/src/main/java/com/palantir/gradle/jdks/CaCerts.java`
#### Snippet
```java
        StringBuilder stringBuilder = new StringBuilder();

        caCerts().forEach((alias, caCert) -> {
            stringBuilder.append(alias).append(": ").append(caCert).append('\n');
        });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `gradle-jdks/src/main/java/com/palantir/gradle/jdks/JdkDownloader.java`
#### Snippet
```java
            ivy.patternLayout(patternLayout -> patternLayout.artifact("[module].[ext]"));
            ivy.metadataSources(MetadataSources::artifact);
            ivy.content(repositoryContentDescriptor -> {
                repositoryContentDescriptor.includeGroup(jdkGroup);
            });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `gradle-jdks/src/main/java/com/palantir/gradle/jdks/JdkManager.java`
#### Snippet
```java
            throw new RuntimeException("Locking failed", e);
        } finally {
            project.delete(delete -> {
                delete.delete(temporaryJdkPath.toFile());
            });
```

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `PalantirCaExtension()` of an abstract class should not be declared 'public'
in `gradle-jdks/src/main/java/com/palantir/gradle/jdks/PalantirCaExtension.java`
#### Snippet
```java
    public abstract Property<LogLevel> getLogLevel();

    public PalantirCaExtension() {
        getLogLevel().set(LogLevel.INFO);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `JdksExtension()` of an abstract class should not be declared 'public'
in `gradle-jdks/src/main/java/com/palantir/gradle/jdks/JdksExtension.java`
#### Snippet
```java
    protected abstract ObjectFactory getObjectFactory();

    public JdksExtension() {
        this.jdkDistributions =
                new LazilyConfiguredMapping<>(() -> getObjectFactory().newInstance(JdkDistributionExtension.class));
```

## RuleId[id=UnstableApiUsage]
### UnstableApiUsage
'com.google.common.io.Closer' is marked unstable with @Beta
in `gradle-jdks/src/main/java/com/palantir/gradle/jdks/JdkManager.java`
#### Snippet
```java
    private static final class PathLock implements Closeable {
        private static final Striped<Lock> JVM_LOCKS = Striped.lock(16);
        private final Closer closer;

        PathLock(Path path) throws IOException {
```

### UnstableApiUsage
'com.google.common.io.Closer' is marked unstable with @Beta
in `gradle-jdks/src/main/java/com/palantir/gradle/jdks/JdkManager.java`
#### Snippet
```java

        PathLock(Path path) throws IOException {
            this.closer = Closer.create();
            try {
                Lock jvmLock = JVM_LOCKS.get(path);
```

### UnstableApiUsage
'create()' is declared in unstable class 'com.google.common.io.Closer' marked with @Beta
in `gradle-jdks/src/main/java/com/palantir/gradle/jdks/JdkManager.java`
#### Snippet
```java

        PathLock(Path path) throws IOException {
            this.closer = Closer.create();
            try {
                Lock jvmLock = JVM_LOCKS.get(path);
```

### UnstableApiUsage
'get(java.lang.Object)' is declared in unstable class 'com.google.common.util.concurrent.Striped' marked with @Beta
in `gradle-jdks/src/main/java/com/palantir/gradle/jdks/JdkManager.java`
#### Snippet
```java
            this.closer = Closer.create();
            try {
                Lock jvmLock = JVM_LOCKS.get(path);
                jvmLock.lock();
                closer.register(jvmLock::unlock);
```

### UnstableApiUsage
'register(C)' is declared in unstable class 'com.google.common.io.Closer' marked with @Beta
in `gradle-jdks/src/main/java/com/palantir/gradle/jdks/JdkManager.java`
#### Snippet
```java
                Lock jvmLock = JVM_LOCKS.get(path);
                jvmLock.lock();
                closer.register(jvmLock::unlock);
                Files.createDirectories(path.getParent());
                FileChannel channel = closer.register(FileChannel.open(
```

### UnstableApiUsage
'register(C)' is declared in unstable class 'com.google.common.io.Closer' marked with @Beta
in `gradle-jdks/src/main/java/com/palantir/gradle/jdks/JdkManager.java`
#### Snippet
```java
                closer.register(jvmLock::unlock);
                Files.createDirectories(path.getParent());
                FileChannel channel = closer.register(FileChannel.open(
                        path.getParent().resolve(path.getFileName() + ".lock"),
                        StandardOpenOption.CREATE,
```

### UnstableApiUsage
'register(C)' is declared in unstable class 'com.google.common.io.Closer' marked with @Beta
in `gradle-jdks/src/main/java/com/palantir/gradle/jdks/JdkManager.java`
#### Snippet
```java
                        StandardOpenOption.WRITE));
                FileLock fileLock = channel.lock();
                closer.register(fileLock::close);
            } catch (Throwable t) {
                closer.close();
```

### UnstableApiUsage
'close()' is declared in unstable class 'com.google.common.io.Closer' marked with @Beta
in `gradle-jdks/src/main/java/com/palantir/gradle/jdks/JdkManager.java`
#### Snippet
```java
                closer.register(fileLock::close);
            } catch (Throwable t) {
                closer.close();
                throw t;
            }
```

### UnstableApiUsage
'com.google.common.util.concurrent.Striped' is marked unstable with @Beta
in `gradle-jdks/src/main/java/com/palantir/gradle/jdks/JdkManager.java`
#### Snippet
```java
     */
    private static final class PathLock implements Closeable {
        private static final Striped<Lock> JVM_LOCKS = Striped.lock(16);
        private final Closer closer;

```

### UnstableApiUsage
'com.google.common.util.concurrent.Striped' is marked unstable with @Beta
in `gradle-jdks/src/main/java/com/palantir/gradle/jdks/JdkManager.java`
#### Snippet
```java
     */
    private static final class PathLock implements Closeable {
        private static final Striped<Lock> JVM_LOCKS = Striped.lock(16);
        private final Closer closer;

```

### UnstableApiUsage
'lock(int)' is declared in unstable class 'com.google.common.util.concurrent.Striped' marked with @Beta
in `gradle-jdks/src/main/java/com/palantir/gradle/jdks/JdkManager.java`
#### Snippet
```java
     */
    private static final class PathLock implements Closeable {
        private static final Striped<Lock> JVM_LOCKS = Striped.lock(16);
        private final Closer closer;

```

### UnstableApiUsage
'close()' is declared in unstable class 'com.google.common.io.Closer' marked with @Beta
in `gradle-jdks/src/main/java/com/palantir/gradle/jdks/JdkManager.java`
#### Snippet
```java
        @Override
        public void close() throws IOException {
            closer.close();
        }
    }
```

