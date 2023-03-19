# assertj-assertions-generator-maven-plugin 
 
# Bad smells
I found 51 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnstableApiUsage | 27 | false |
| UNUSED_IMPORT | 6 | false |
| ZeroLengthArrayInitialization | 4 | false |
| BoundedWildcard | 4 | false |
| RedundantFieldInitialization | 3 | false |
| UnstableTypeUsedInSignature | 3 | false |
| DefaultAnnotationParam | 2 | false |
| KeySetIterationMayUseEntrySet | 1 | false |
| DataFlowIssue | 1 | false |
## RuleId[id=KeySetIterationMayUseEntrySet]
### KeySetIterationMayUseEntrySet
Iteration over `assertionsEntryPointFilesByType.keySet()` may be replaced with 'entrySet()' iteration
in `src/main/java/org/assertj/maven/generator/AssertionsGeneratorReport.java`
#### Snippet
```java

  private void reportEntryPointClassesGeneration(StringBuilder reportBuilder) {
	for (AssertionsEntryPointType type : assertionsEntryPointFilesByType.keySet()) {
	  if (assertionsEntryPointFilesByType.get(type) != null) {
		String entryPointClassName = remove(type.getFileName(), ".java");
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/assertj/maven/AssertJAssertionsGeneratorMojo.java`
#### Snippet
```java
   */
  @Parameter(property = "assertj.quiet")
  public boolean quiet = false;

  /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/assertj/maven/AssertJAssertionsGeneratorMojo.java`
#### Snippet
```java
   */
  @Parameter(property = "assertj.includePackagePrivateClasses")
  public boolean includePackagePrivateClasses = false;

  @Override
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/assertj/maven/AssertJAssertionsGeneratorMojo.java`
#### Snippet
```java
   */
  @Parameter(property = "assertj.skip")
  public boolean skip = false;

  /**
```

## RuleId[id=DefaultAnnotationParam]
### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/main/java/org/assertj/maven/AssertJAssertionsGeneratorMojo.java`
#### Snippet
```java
   * Note that the Assertions entry point classes package is controlled by the entryPointClassPackage property.
   */
  @Parameter(defaultValue = "", property = "assertj.generateAssertionsInPackage")
  public String generateAssertionsInPackage;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/main/java/org/assertj/maven/AssertJAssertionsGeneratorMojo.java`
#### Snippet
```java
 * Generates custom AssertJ assertions (*Assert) for all given classes and classes of given packages.
 */
@Mojo(name = "generate-assertions", defaultPhase = GENERATE_TEST_SOURCES, requiresDependencyResolution = TEST, requiresProject = true)
public class AssertJAssertionsGeneratorMojo extends AbstractMojo {

```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Dereference of `targetDirPath.toFile().list()` may produce `NullPointerException`
in `src/main/java/org/assertj/maven/AssertJAssertionsGeneratorMojo.java`
#### Snippet
```java
    try {
      Path targetDirPath = Paths.get(targetDir);
      if (Files.exists(targetDirPath) && targetDirPath.toFile().list().length > 0) {
        getLog().info("Removing previously generated sources in " + targetDir);
        FileUtils.cleanDirectory(targetDirPath.toFile());
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/assertj/maven/AssertJAssertionsGeneratorMojo.java`
#### Snippet
```java
      classpathElementUrls.add(new File(classpathElement).toURI().toURL());
    }
    return new URLClassLoader(classpathElementUrls.toArray(new URL[0]), Thread.currentThread().getContextClassLoader());
  }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/assertj/maven/AssertJAssertionsGeneratorMojo.java`
#### Snippet
```java
   */
  @Parameter(property = "assertj.excludes")
  public String[] excludes = new String[0];

  /**
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/assertj/maven/AssertJAssertionsGeneratorMojo.java`
#### Snippet
```java
  @VisibleForTesting
  AssertionsGeneratorReport executeWithAssertionGenerator(AssertionsGenerator assertionGenerator) {
    if (classes == null) classes = new String[0];
    AssertionsGeneratorReport generatorReport = assertionGenerator.generateAssertionsFor(packages, classes, targetDir,
                                                                                         entryPointClassPackage, hierarchical,
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/assertj/maven/generator/AssertionsGenerator.java`
#### Snippet
```java
    this.classLoader = classLoader;
    this.includePatterns = new Pattern[] { INCLUDE_EVERYTHING };
    this.excludePatterns = new Pattern[0];
    this.assertionsEntryPointToGenerate = newHashSet();
  }
```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import static com.google.common.io.Closeables.closeQuietly;`
in `src/main/java/org/assertj/maven/Templates.java`
#### Snippet
```java
package org.assertj.maven;

import static com.google.common.io.Closeables.closeQuietly;
import static org.assertj.assertions.generator.Template.Type.ABSTRACT_ASSERT_CLASS;
import static org.assertj.assertions.generator.Template.Type.ASSERTIONS_ENTRY_POINT_CLASS;
```

### UNUSED_IMPORT
Unused import `import java.io.FileInputStream;`
in `src/main/java/org/assertj/maven/Templates.java`
#### Snippet
```java

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
```

### UNUSED_IMPORT
Unused import `import java.io.IOException;`
in `src/main/java/org/assertj/maven/Templates.java`
#### Snippet
```java
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
```

### UNUSED_IMPORT
Unused import `import java.io.InputStream;`
in `src/main/java/org/assertj/maven/Templates.java`
#### Snippet
```java
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
```

### UNUSED_IMPORT
Unused import `import java.io.InputStreamReader;`
in `src/main/java/org/assertj/maven/Templates.java`
#### Snippet
```java
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
```

### UNUSED_IMPORT
Unused import `import com.google.common.io.CharStreams;`
in `src/main/java/org/assertj/maven/Templates.java`
#### Snippet
```java
import org.assertj.maven.generator.AssertionsGeneratorReport;

import com.google.common.io.CharStreams;

public class Templates {
```

## RuleId[id=UnstableTypeUsedInSignature]
### UnstableTypeUsedInSignature
Method must be marked with '@com.google.common.annotations.Beta' annotation because its signature references unstable type 'com.google.common.reflect.TypeToken'
in `src/main/java/org/assertj/maven/generator/AssertionsGeneratorReport.java`
#### Snippet
```java
  }

  public void reportInputClassesNotFound(Set<TypeToken<?>> classes, String[] inputClassNames) {
	Set<String> classesFound = newTreeSet();
	for (TypeToken<?> clazz : classes) {
```

### UnstableTypeUsedInSignature
Field must be marked with '@com.google.common.annotations.Beta' annotation because its type references unstable type 'com.google.common.reflect.TypeToken'
in `src/main/java/org/assertj/maven/generator/AssertionsGeneratorReport.java`
#### Snippet
```java
  private String[] inputClasses;
  private Exception exception;
  private Collection<TypeToken<?>> excludedClassesFromAssertionGeneration;
  private Set<String> inputClassesNotFound;
  private List<String> userTemplates;
```

### UnstableTypeUsedInSignature
Method must be marked with '@com.google.common.annotations.Beta' annotation because its signature references unstable type 'com.google.common.reflect.TypeToken'
in `src/main/java/org/assertj/maven/generator/AssertionsGeneratorReport.java`
#### Snippet
```java
  }

  public void setExcludedClassesFromAssertionGeneration(Collection<TypeToken<?>> excludedClassSet) {
	this.excludedClassesFromAssertionGeneration = excludedClassSet;
  }
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? super Template`
in `src/main/java/org/assertj/maven/Templates.java`
#### Snippet
```java
  @VisibleForTesting
  void loadUserTemplate(String userTemplate, Template.Type type, String templateDescription,
                        List<Template> userTemplates, AssertionsGeneratorReport report) {
    if (userTemplate != null) {
      try {
```

### BoundedWildcard
Can generalize to `? extends TypeToken`
in `src/main/java/org/assertj/maven/generator/AssertionsGenerator.java`
#### Snippet
```java
  }

  private Set<TypeToken<?>> removeAssertClasses(Set<TypeToken<?>> classList) {
    Set<TypeToken<?>> filteredClassList = newLinkedHashSet();
    for (TypeToken<?> clazz : classList) {
```

### BoundedWildcard
Can generalize to `? extends TypeToken`
in `src/main/java/org/assertj/maven/generator/AssertionsGeneratorReport.java`
#### Snippet
```java
  }

  public void reportInputClassesNotFound(Set<TypeToken<?>> classes, String[] inputClassNames) {
	Set<String> classesFound = newTreeSet();
	for (TypeToken<?> clazz : classes) {
```

### BoundedWildcard
Can generalize to `? extends TypeToken`
in `src/main/java/org/assertj/maven/generator/AssertionsGeneratorReport.java`
#### Snippet
```java
  }

  public void setExcludedClassesFromAssertionGeneration(Collection<TypeToken<?>> excludedClassSet) {
	this.excludedClassesFromAssertionGeneration = excludedClassSet;
  }
```

## RuleId[id=UnstableApiUsage]
### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/maven/generator/AssertionsGenerator.java`
#### Snippet
```java
  }

  private void removeClassesAccordingToIncludeAndExcludePatterns(Set<TypeToken<?>> filteredClasses) {
    for (Iterator<TypeToken<?>> it = filteredClasses.iterator(); it.hasNext();) {
      TypeToken<?> element = it.next();
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/maven/generator/AssertionsGenerator.java`
#### Snippet
```java

  private void removeClassesAccordingToIncludeAndExcludePatterns(Set<TypeToken<?>> filteredClasses) {
    for (Iterator<TypeToken<?>> it = filteredClasses.iterator(); it.hasNext();) {
      TypeToken<?> element = it.next();
      if (!isIncluded(element) || isExcluded(element)) it.remove();
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/maven/generator/AssertionsGenerator.java`
#### Snippet
```java
  private void removeClassesAccordingToIncludeAndExcludePatterns(Set<TypeToken<?>> filteredClasses) {
    for (Iterator<TypeToken<?>> it = filteredClasses.iterator(); it.hasNext();) {
      TypeToken<?> element = it.next();
      if (!isIncluded(element) || isExcluded(element)) it.remove();
    }
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/maven/generator/AssertionsGenerator.java`
#### Snippet
```java
    report.setInputClasses(inputClassNames);
    try {
      Set<TypeToken<?>> classes = collectClasses(classLoader, includePackagePrivateClasses, addAll(inputPackages, inputClassNames));
      report.reportInputClassesNotFound(classes, inputClassNames);
      Set<TypeToken<?>> filteredClasses = removeAssertClasses(classes);
```

### UnstableApiUsage
'collectClasses(java.lang.ClassLoader, boolean, java.lang.String...)' is unstable because its signature references unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `src/main/java/org/assertj/maven/generator/AssertionsGenerator.java`
#### Snippet
```java
    report.setInputClasses(inputClassNames);
    try {
      Set<TypeToken<?>> classes = collectClasses(classLoader, includePackagePrivateClasses, addAll(inputPackages, inputClassNames));
      report.reportInputClassesNotFound(classes, inputClassNames);
      Set<TypeToken<?>> filteredClasses = removeAssertClasses(classes);
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/maven/generator/AssertionsGenerator.java`
#### Snippet
```java
      Set<TypeToken<?>> classes = collectClasses(classLoader, includePackagePrivateClasses, addAll(inputPackages, inputClassNames));
      report.reportInputClassesNotFound(classes, inputClassNames);
      Set<TypeToken<?>> filteredClasses = removeAssertClasses(classes);
      removeClassesAccordingToIncludeAndExcludePatterns(filteredClasses);
      report.setExcludedClassesFromAssertionGeneration(subtract(classes, filteredClasses));
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/maven/generator/AssertionsGenerator.java`
#### Snippet
```java
      report.setExcludedClassesFromAssertionGeneration(subtract(classes, filteredClasses));
      if (hierarchical) {
        for (TypeToken<?> clazz : filteredClasses) {
          ClassDescription classDescription = converter.convertToClassDescription(clazz);
          File[] generatedCustomAssertionFiles = generator.generateHierarchicalCustomAssertionFor(classDescription,
```

### UnstableApiUsage
'convertToClassDescription(com.google.common.reflect.TypeToken)' is unstable because its signature references unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `src/main/java/org/assertj/maven/generator/AssertionsGenerator.java`
#### Snippet
```java
      if (hierarchical) {
        for (TypeToken<?> clazz : filteredClasses) {
          ClassDescription classDescription = converter.convertToClassDescription(clazz);
          File[] generatedCustomAssertionFiles = generator.generateHierarchicalCustomAssertionFor(classDescription,
                                                                                                  filteredClasses);
```

### UnstableApiUsage
'generateHierarchicalCustomAssertionFor(org.assertj.assertions.generator.description.ClassDescription, java.util.Set\>)' is unstable because its signature references unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `src/main/java/org/assertj/maven/generator/AssertionsGenerator.java`
#### Snippet
```java
        for (TypeToken<?> clazz : filteredClasses) {
          ClassDescription classDescription = converter.convertToClassDescription(clazz);
          File[] generatedCustomAssertionFiles = generator.generateHierarchicalCustomAssertionFor(classDescription,
                                                                                                  filteredClasses);
          report.addGeneratedAssertionFile(generatedCustomAssertionFiles[0]);
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/maven/generator/AssertionsGenerator.java`
#### Snippet
```java
        }
      } else {
        for (TypeToken<?> clazz : filteredClasses) {
          ClassDescription classDescription = converter.convertToClassDescription(clazz);
          File generatedCustomAssertionFile = generator.generateCustomAssertionFor(classDescription);
```

### UnstableApiUsage
'convertToClassDescription(com.google.common.reflect.TypeToken)' is unstable because its signature references unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `src/main/java/org/assertj/maven/generator/AssertionsGenerator.java`
#### Snippet
```java
      } else {
        for (TypeToken<?> clazz : filteredClasses) {
          ClassDescription classDescription = converter.convertToClassDescription(clazz);
          File generatedCustomAssertionFile = generator.generateCustomAssertionFor(classDescription);
          report.addGeneratedAssertionFile(generatedCustomAssertionFile);
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/maven/generator/AssertionsGenerator.java`
#### Snippet
```java
  }

  private Set<TypeToken<?>> removeAssertClasses(Set<TypeToken<?>> classList) {
    Set<TypeToken<?>> filteredClassList = newLinkedHashSet();
    for (TypeToken<?> clazz : classList) {
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/maven/generator/AssertionsGenerator.java`
#### Snippet
```java
  }

  private Set<TypeToken<?>> removeAssertClasses(Set<TypeToken<?>> classList) {
    Set<TypeToken<?>> filteredClassList = newLinkedHashSet();
    for (TypeToken<?> clazz : classList) {
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/maven/generator/AssertionsGenerator.java`
#### Snippet
```java

  private Set<TypeToken<?>> removeAssertClasses(Set<TypeToken<?>> classList) {
    Set<TypeToken<?>> filteredClassList = newLinkedHashSet();
    for (TypeToken<?> clazz : classList) {
      String classSimpleName = clazz.getRawType().getSimpleName();
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/maven/generator/AssertionsGenerator.java`
#### Snippet
```java
  private Set<TypeToken<?>> removeAssertClasses(Set<TypeToken<?>> classList) {
    Set<TypeToken<?>> filteredClassList = newLinkedHashSet();
    for (TypeToken<?> clazz : classList) {
      String classSimpleName = clazz.getRawType().getSimpleName();
      if (!classSimpleName.endsWith("Assert") && !classSimpleName.endsWith("Assertions")) {
```

### UnstableApiUsage
'getRawType()' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `src/main/java/org/assertj/maven/generator/AssertionsGenerator.java`
#### Snippet
```java
    Set<TypeToken<?>> filteredClassList = newLinkedHashSet();
    for (TypeToken<?> clazz : classList) {
      String classSimpleName = clazz.getRawType().getSimpleName();
      if (!classSimpleName.endsWith("Assert") && !classSimpleName.endsWith("Assertions")) {
        filteredClassList.add(clazz);
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/maven/generator/AssertionsGenerator.java`
#### Snippet
```java
  }

  private boolean isExcluded(TypeToken<?> element) {
    String className = element.getRawType().getName();
    for (Pattern excludePattern : excludePatterns) {
```

### UnstableApiUsage
'getRawType()' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `src/main/java/org/assertj/maven/generator/AssertionsGenerator.java`
#### Snippet
```java

  private boolean isExcluded(TypeToken<?> element) {
    String className = element.getRawType().getName();
    for (Pattern excludePattern : excludePatterns) {
      if (excludePattern.matcher(className).matches()) {
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/maven/generator/AssertionsGenerator.java`
#### Snippet
```java
  }

  private boolean isIncluded(TypeToken<?> element) {
    String className = element.getRawType().getName();
    for (Pattern includePattern : includePatterns) {
```

### UnstableApiUsage
'getRawType()' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `src/main/java/org/assertj/maven/generator/AssertionsGenerator.java`
#### Snippet
```java

  private boolean isIncluded(TypeToken<?> element) {
    String className = element.getRawType().getName();
    for (Pattern includePattern : includePatterns) {
      if (includePattern.matcher(className).matches()) return true;
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/maven/generator/AssertionsGeneratorReport.java`
#### Snippet
```java
  }

  public void reportInputClassesNotFound(Set<TypeToken<?>> classes, String[] inputClassNames) {
	Set<String> classesFound = newTreeSet();
	for (TypeToken<?> clazz : classes) {
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/maven/generator/AssertionsGeneratorReport.java`
#### Snippet
```java
  public void reportInputClassesNotFound(Set<TypeToken<?>> classes, String[] inputClassNames) {
	Set<String> classesFound = newTreeSet();
	for (TypeToken<?> clazz : classes) {
	  classesFound.add(clazz.getRawType().getName());
	}
```

### UnstableApiUsage
'getRawType()' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `src/main/java/org/assertj/maven/generator/AssertionsGeneratorReport.java`
#### Snippet
```java
	Set<String> classesFound = newTreeSet();
	for (TypeToken<?> clazz : classes) {
	  classesFound.add(clazz.getRawType().getName());
	}
	for (String inputClass : inputClassNames) {
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/maven/generator/AssertionsGeneratorReport.java`
#### Snippet
```java
  private String[] inputClasses;
  private Exception exception;
  private Collection<TypeToken<?>> excludedClassesFromAssertionGeneration;
  private Set<String> inputClassesNotFound;
  private List<String> userTemplates;
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/maven/generator/AssertionsGeneratorReport.java`
#### Snippet
```java
      reportBuilder.append(System.lineSeparator());
	  reportBuilder.append("Input classes excluded from assertions generation:\n");
	  for (TypeToken<?> excludedClass : excludedClassesFromAssertionGeneration) {
        reportBuilder.append(INDENT).append(excludedClass.getRawType().getName()).append(System.lineSeparator());
	  }
```

### UnstableApiUsage
'getRawType()' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `src/main/java/org/assertj/maven/generator/AssertionsGeneratorReport.java`
#### Snippet
```java
	  reportBuilder.append("Input classes excluded from assertions generation:\n");
	  for (TypeToken<?> excludedClass : excludedClassesFromAssertionGeneration) {
        reportBuilder.append(INDENT).append(excludedClass.getRawType().getName()).append(System.lineSeparator());
	  }
	}
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/maven/generator/AssertionsGeneratorReport.java`
#### Snippet
```java
  }

  public void setExcludedClassesFromAssertionGeneration(Collection<TypeToken<?>> excludedClassSet) {
	this.excludedClassesFromAssertionGeneration = excludedClassSet;
  }
```

