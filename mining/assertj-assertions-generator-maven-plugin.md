# assertj-assertions-generator-maven-plugin 
 
# Bad smells
I found 38 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnstableApiUsage | 23 | false |
| FieldMayBeFinal | 7 | false |
| UNUSED_IMPORT | 6 | false |
| DataFlowIssue | 1 | false |
| JavadocDeclaration | 1 | false |
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

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
IOException is not declared to be thrown by method generateAssertionsFor
in `src/main/java/org/assertj/maven/generator/AssertionsGenerator.java`
#### Snippet
```java
   * @param entryPointFilePackage the package of the assertions entry point class, may be <code>null</code>.
   * @param includePackagePrivateClasses collect package private classes if true.
   * @throws IOException if the files can't be generated
   */
  @SuppressWarnings("unchecked")
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `userTemplates` may be 'final'
in `src/main/java/org/assertj/maven/generator/AssertionsGeneratorReport.java`
#### Snippet
```java
  private Collection<TypeToken<?>> excludedClassesFromAssertionGeneration;
  private Set<String> inputClassesNotFound;
  private List<String> userTemplates;

  public AssertionsGeneratorReport() {
```

### FieldMayBeFinal
Field `inputClassesNotFound` may be 'final'
in `src/main/java/org/assertj/maven/generator/AssertionsGeneratorReport.java`
#### Snippet
```java
  private Exception exception;
  private Collection<TypeToken<?>> excludedClassesFromAssertionGeneration;
  private Set<String> inputClassesNotFound;
  private List<String> userTemplates;

```

### FieldMayBeFinal
Field `assertionsEntryPointFilesByType` may be 'final'
in `src/main/java/org/assertj/maven/generator/AssertionsGeneratorReport.java`
#### Snippet
```java
  private String directoryPathWhereAssertionFilesAreGenerated;
  private Set<String> generatedCustomAssertionFileNames;
  private Map<AssertionsEntryPointType, File> assertionsEntryPointFilesByType;
  private String[] inputPackages;
  private String[] inputClasses;
```

### FieldMayBeFinal
Field `generatedCustomAssertionFileNames` may be 'final'
in `src/main/java/org/assertj/maven/generator/AssertionsGeneratorReport.java`
#### Snippet
```java
  private static final String SECTION_END = " ---\n";
  private String directoryPathWhereAssertionFilesAreGenerated;
  private Set<String> generatedCustomAssertionFileNames;
  private Map<AssertionsEntryPointType, File> assertionsEntryPointFilesByType;
  private String[] inputPackages;
```

### FieldMayBeFinal
Field `assertionsEntryPointToGenerate` may be 'final'
in `src/main/java/org/assertj/maven/generator/AssertionsGenerator.java`
#### Snippet
```java
  private Pattern[] excludePatterns;
  private Log log;
  private Set<AssertionsEntryPointType> assertionsEntryPointToGenerate;

  public AssertionsGenerator(ClassLoader classLoader) throws IOException {
```

### FieldMayBeFinal
Field `classLoader` may be 'final'
in `src/main/java/org/assertj/maven/generator/AssertionsGenerator.java`
#### Snippet
```java
  private static final Pattern INCLUDE_EVERYTHING = Pattern.compile(".*");
  private ClassToClassDescriptionConverter converter;
  private ClassLoader classLoader;
  private BaseAssertionGenerator generator;
  private Pattern[] includePatterns;
```

### FieldMayBeFinal
Field `converter` may be 'final'
in `src/main/java/org/assertj/maven/generator/AssertionsGenerator.java`
#### Snippet
```java

  private static final Pattern INCLUDE_EVERYTHING = Pattern.compile(".*");
  private ClassToClassDescriptionConverter converter;
  private ClassLoader classLoader;
  private BaseAssertionGenerator generator;
```

## RuleId[id=UnstableApiUsage]
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

