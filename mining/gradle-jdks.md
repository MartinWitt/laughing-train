# gradle-jdks 
 
# Bad smells
I found 14 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnstableApiUsage | 12 | false |
| UNCHECKED_WARNING | 1 | false |
| NullableProblems | 1 | false |
## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked assignment: 'org.gradle.api.provider.MapProperty' to 'org.gradle.api.provider.MapProperty'
in `gradle-jdks/src/main/java/com/palantir/gradle/jdks/JdksExtension.java`
#### Snippet
```java
        // these two properties have had their methods synchronized (which arguably gradle should probably
        // do since it's known that Property access is racy)
        this.caCerts = SynchronizedInterface.synchronizeAllInterfaceMethods(
                MapProperty.class, getObjectFactory().mapProperty(String.class, String.class));
        this.jdkStorageLocation = SynchronizedInterface.synchronizeAllInterfaceMethods(
```

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated method overrides method annotated with @NonNullApi
in `gradle-jdks/src/main/java/com/palantir/gradle/jdks/GradleJdksJavaInstallationMetadata.java`
#### Snippet
```java

    @Override
    public Directory getInstallationPath() {
        return installationPathProvider().get();
    }
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

