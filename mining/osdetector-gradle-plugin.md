# osdetector-gradle-plugin 
 
# Bad smells
I found 15 bad smells with 1 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UseOfPropertiesAsHashtable | 6 | false |
| UnstableApiUsage | 5 | false |
| ReturnNull | 2 | false |
| AbstractClassNeverImplemented | 1 | false |
| NonProtectedConstructorInAbstractClass | 1 | true |
## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `src/main/java/com/google/gradle/osdetector/OsDetector.java`
#### Snippet
```java
    public String setSystemProperty(String name, String value) {
      // no-op
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `src/main/java/com/google/gradle/osdetector/OsDetector.java`
#### Snippet
```java
    Object releaseId = impl.detectedProperties.get(Detector.DETECTED_RELEASE);
    if (releaseId == null) {
      return null;
    }
    return new Release(impl);
```

## RuleId[id=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `OsDetector` has no concrete subclass
in `src/main/java/com/google/gradle/osdetector/OsDetector.java`
#### Snippet
```java
import java.util.Properties;

public abstract class OsDetector {
  private static final Logger logger = LoggerFactory.getLogger(OsDetector.class.getName());

```

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `OsDetector()` of an abstract class should not be declared 'public'
in `src/main/java/com/google/gradle/osdetector/OsDetector.java`
#### Snippet
```java
  private Impl impl;

  public OsDetector(Project project) {
    this.project = project;
  }
```

## RuleId[id=UnstableApiUsage]
### UnstableApiUsage
'systemProperty(java.lang.String)' is marked unstable with @Incubating
in `src/main/java/com/google/gradle/osdetector/OsDetector.java`
#### Snippet
```java
    @Override
    public String getSystemProperty(String name) {
      return forUseAtConfigurationTime(getProviderFactory().systemProperty(name)).getOrNull();
    }

```

### UnstableApiUsage
'fileContents(org.gradle.api.file.RegularFile)' is marked unstable with @Incubating
in `src/main/java/com/google/gradle/osdetector/OsDetector.java`
#### Snippet
```java
    public InputStream readFile(String fileName) throws IOException {
      RegularFile file = getProjectLayout().getProjectDirectory().file(fileName);
      byte[] bytes = forUseAtConfigurationTime(getProviderFactory().fileContents(file).getAsBytes())
          .getOrNull();
      if (bytes == null) {
```

### UnstableApiUsage
'getAsBytes()' is declared in unstable interface 'org.gradle.api.file.FileContents' marked with @Incubating
in `src/main/java/com/google/gradle/osdetector/OsDetector.java`
#### Snippet
```java
    public InputStream readFile(String fileName) throws IOException {
      RegularFile file = getProjectLayout().getProjectDirectory().file(fileName);
      byte[] bytes = forUseAtConfigurationTime(getProviderFactory().fileContents(file).getAsBytes())
          .getOrNull();
      if (bytes == null) {
```

### UnstableApiUsage
'systemProperty(java.lang.String)' is marked unstable with @Incubating
in `src/main/java/com/google/gradle/osdetector/OsDetector.java`
#### Snippet
```java
    @Override
    public String getSystemProperty(String name, String def) {
      return forUseAtConfigurationTime(getProviderFactory().systemProperty(name)).getOrElse(def);
    }

```

### UnstableApiUsage
'forUseAtConfigurationTime()' is marked unstable with @Incubating
in `src/main/java/com/google/gradle/osdetector/OsDetector.java`
#### Snippet
```java
    // Deprecated and a noop starting in 7.4
    if (GradleVersion.current().compareTo(GradleVersion.version("7.4")) < 0) {
      return provider.forUseAtConfigurationTime();
    } else {
      return provider;
```

## RuleId[id=UseOfPropertiesAsHashtable]
### UseOfPropertiesAsHashtable
Call to `Hashtable.get()` on properties object
in `src/main/java/com/google/gradle/osdetector/OsDetector.java`
#### Snippet
```java

  public String getClassifier() {
    return (String) getImpl().detectedProperties.get(Detector.DETECTED_CLASSIFIER);
  }

```

### UseOfPropertiesAsHashtable
Call to `Hashtable.get()` on properties object
in `src/main/java/com/google/gradle/osdetector/OsDetector.java`
#### Snippet
```java

  public String getArch() {
    return (String) getImpl().detectedProperties.get(Detector.DETECTED_ARCH);
  }

```

### UseOfPropertiesAsHashtable
Call to `Hashtable.get()` on properties object
in `src/main/java/com/google/gradle/osdetector/OsDetector.java`
#### Snippet
```java
     */
    public String getVersion() {
      return (String) impl.detectedProperties.get(Detector.DETECTED_RELEASE_VERSION);
    }

```

### UseOfPropertiesAsHashtable
Call to `Hashtable.get()` on properties object
in `src/main/java/com/google/gradle/osdetector/OsDetector.java`
#### Snippet
```java

  public String getOs() {
    return (String) getImpl().detectedProperties.get(Detector.DETECTED_NAME);
  }

```

### UseOfPropertiesAsHashtable
Call to `Hashtable.get()` on properties object
in `src/main/java/com/google/gradle/osdetector/OsDetector.java`
#### Snippet
```java
  public Release getRelease() {
    Impl impl = getImpl();
    Object releaseId = impl.detectedProperties.get(Detector.DETECTED_RELEASE);
    if (releaseId == null) {
      return null;
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.get()` on properties object
in `src/main/java/com/google/gradle/osdetector/OsDetector.java`
#### Snippet
```java
     */
    public String getId() {
      return (String) impl.detectedProperties.get(Detector.DETECTED_RELEASE);
    }

```

