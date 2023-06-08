# assertj-assertions-generator 
 
# Bad smells
I found 190 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnstableApiUsage | 164 | false |
| FieldMayBeFinal | 8 | false |
| DataFlowIssue | 6 | false |
| DuplicatedCode | 2 | false |
| StringOperationCanBeSimplified | 2 | false |
| NullableProblems | 2 | false |
| NonFinalFieldInEnum | 1 | false |
| RegExpSimplifiable | 1 | false |
| MismatchedJavadocCode | 1 | false |
| SimplifiableConditionalExpression | 1 | false |
| FieldCanBeLocal | 1 | false |
| IgnoreResultOfCall | 1 | false |
## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `src/main/java/org/assertj/assertions/generator/BaseAssertionGenerator.java`
#### Snippet
```java
    assertionContent = replace(assertionContent, PROPERTY_SIMPLE_TYPE, getTypeName(field));
    assertionContent = replace(assertionContent, PROPERTY_ASSERT_TYPE,
                               field.getAssertTypeName(determinePackageName(classDescription)));
    assertionContent = replace(assertionContent, PROPERTY_TYPE, getTypeName(field));
    assertionContent = replace(assertionContent, PROPERTY_WITH_LOWERCASE_FIRST_CHAR, fieldName);
    // It should not be possible to have a field that is a keyword - compiler won't allow it.
    assertionContent = replace(assertionContent, PROPERTY_WITH_SAFE, unclashName(fieldName));
    return assertionContent;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/assertj/assertions/generator/BaseAssertionGenerator.java`
#### Snippet
```java
    assertionContent = assertionContent.replace(PREDICATE_FOR_JAVADOC,
                                                field.getPredicateForJavadoc());
    assertionContent = assertionContent.replace(NEGATIVE_PREDICATE_FOR_JAVADOC,
                                                field.getNegativePredicateForJavadoc());
    assertionContent = assertionContent.replace(PREDICATE_FOR_FOR_ERROR_MESSAGE_PART1,
                                                field.getPredicateForErrorMessagePart1());
    assertionContent = assertionContent.replace(PREDICATE_FOR_FOR_ERROR_MESSAGE_PART2,
                                                field.getPredicateForErrorMessagePart2());
    assertionContent = assertionContent.replace(NEGATIVE_PREDICATE_FOR_FOR_ERROR_MESSAGE_PART1,
                                                field.getNegativePredicateForErrorMessagePart1());
    assertionContent = assertionContent.replace(NEGATIVE_PREDICATE_FOR_FOR_ERROR_MESSAGE_PART2,
                                                field.getNegativePredicateForErrorMessagePart2());
```

## RuleId[id=NonFinalFieldInEnum]
### NonFinalFieldInEnum
Non-final field `fileName` in enum 'AssertionsEntryPointType'
in `src/main/java/org/assertj/assertions/generator/AssertionsEntryPointType.java`
#### Snippet
```java
  AUTO_CLOSEABLE_BDD_SOFT("AutoCloseableBDDSoftAssertions.java");

  private String fileName;

  AssertionsEntryPointType(String fileName) {
```

## RuleId[id=RegExpSimplifiable]
### RegExpSimplifiable
`[\\s]` can be simplified to '\\s'
in `src/main/java/org/assertj/assertions/generator/BaseAssertionGenerator.java`
#### Snippet
```java
   */
  private static final Pattern CLASS_NAME_PATTERN = Pattern
                                                           .compile("(?m)^public class[\\s]+(?<CLASSNAME>\\p{javaJavaIdentifierStart}\\p{javaJavaIdentifierPart}*)\\b");

  private static final Set<TypeToken<?>> EMPTY_HIERARCHY = new HashSet<>();
```

## RuleId[id=MismatchedJavadocCode]
### MismatchedJavadocCode
Method is specified to return list but the return type is set
in `src/main/java/org/assertj/assertions/generator/util/ClassUtil.java`
#### Snippet
```java
   * @param packageName package name we want to load classes from
   * @param classLoader the class loader used to load the classes in the given package
   * @return the list of Class found
   * @throws RuntimeException if any error occurs
   */
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Argument `valueType.getComponentType()` might be null
in `src/main/java/org/assertj/assertions/generator/description/DataDescription.java`
#### Snippet
```java
    String elementTypeName = null;
    if (valueType.isArray()) {
      elementTypeName = getTypeDeclaration(valueType.getComponentType());
    } else if (valueType.isSubtypeOf(Iterable.class)) {
      TypeToken<?> componentType = valueType.resolveType(Iterable.class.getTypeParameters()[0]);
```

### DataFlowIssue
Method invocation `length` may produce `NullPointerException`
in `src/main/java/org/assertj/assertions/generator/description/DataDescription.java`
#### Snippet
```java
    @Override
    public int compare(String left, String right) {
      return -Ints.compare(left.length(), right.length());
    }
  };
```

### DataFlowIssue
Method invocation `length` may produce `NullPointerException`
in `src/main/java/org/assertj/assertions/generator/description/DataDescription.java`
#### Snippet
```java
    @Override
    public int compare(String left, String right) {
      return -Ints.compare(left.length(), right.length());
    }
  };
```

### DataFlowIssue
Argument `files` might be null
in `src/main/java/org/assertj/assertions/generator/util/ClassUtil.java`
#### Snippet
```java
    // Get the list of the files contained in the package
    File[] files = directory.listFiles();
    checkNotNull(files, "No files were present in directory: %s", directory);
    for (File currentFile : files) {
      String currentFileName = currentFile.getName();
```

### DataFlowIssue
Argument `resource` might be null
in `src/main/java/org/assertj/assertions/generator/util/ClassUtil.java`
#### Snippet
```java
        String path = subPackageName.replace('.', File.separatorChar);
        URL resource = classLoader.getResource(path);
        checkNotNull(resource, "resource URL from package is null, package %s", path);
        File subDirectory = new File(URLDecoder.decode(resource.getPath(), "UTF-8"));
        Set<TypeToken<?>> classesForSubPackage = getClassesInDirectory(subDirectory, subPackageName, classLoader);
```

### DataFlowIssue
Argument `type.getComponentType()` might be null
in `src/main/java/org/assertj/assertions/generator/util/ClassUtil.java`
#### Snippet
```java
  public static String getTypeDeclaration(TypeToken<?> type) {

    if (type.isArray()) return getTypeDeclaration(type.getComponentType()) + "[]";
    if (type.isPrimitive()) return type.getRawType().toString();

```

## RuleId[id=SimplifiableConditionalExpression]
### SimplifiableConditionalExpression
`type != template.type ? false : true` can be simplified to 'type==template.type'
in `src/main/java/org/assertj/assertions/generator/Template.java`
#### Snippet
```java
    if (o == null || getClass() != o.getClass()) return false;
    Template template = (Template) o;
    return type != template.type ? false : true;
  }

```

## RuleId[id=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
Unnecessary string length argument
in `src/main/java/org/assertj/assertions/generator/util/ClassUtil.java`
#### Snippet
```java
  private static String resolveTypeNameInPackage(String type, String currentPackage) {
    if (!Strings.isNullOrEmpty(currentPackage) && type.startsWith(currentPackage)) {
      return type.substring(currentPackage.length() + 1, type.length());
    }
    return type;
```

### StringOperationCanBeSimplified
Unnecessary empty string argument
in `src/main/java/org/assertj/assertions/generator/util/ClassUtil.java`
#### Snippet
```java

    Class<?> rawClass = type.getRawType();
    StringBuilder typeDeclaration = new StringBuilder("");
    // Now we have some types that could be generic, so we have to do more to serialize it to the declaration
    if (rawClass.isMemberClass()) {
```

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/assertj/assertions/generator/description/GetterDescription.java`
#### Snippet
```java

  @Override
  public int compareTo(GetterDescription other) {
    return super.compareTo(other);
  }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/assertj/assertions/generator/description/FieldDescription.java`
#### Snippet
```java

  @Override
  public int compareTo(FieldDescription other) {
    return super.compareTo(other);
  }
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `fileName` may be 'final'
in `src/main/java/org/assertj/assertions/generator/AssertionsEntryPointType.java`
#### Snippet
```java
  AUTO_CLOSEABLE_BDD_SOFT("AutoCloseableBDDSoftAssertions.java");

  private String fileName;

  AssertionsEntryPointType(String fileName) {
```

### FieldMayBeFinal
Field `classDescriptionConverter` may be 'final'
in `src/main/java/org/assertj/assertions/generator/cli/AssertionGeneratorLauncher.java`
#### Snippet
```java

  private static final Logger logger = LoggerFactory.getLogger(AssertionGeneratorLauncher.class);
  private static ClassToClassDescriptionConverter classDescriptionConverter = new ClassToClassDescriptionConverter();

  public static void main(String[] args) throws IOException {
```

### FieldMayBeFinal
Field `declaredGettersDescriptions` may be 'final'
in `src/main/java/org/assertj/assertions/generator/description/ClassDescription.java`
#### Snippet
```java
  private Set<GetterDescription> gettersDescriptions;
  private Set<FieldDescription> fieldsDescriptions;
  private Set<GetterDescription> declaredGettersDescriptions;
  private Set<FieldDescription> declaredFieldsDescriptions;
  private TypeToken<?> type;
```

### FieldMayBeFinal
Field `gettersDescriptions` may be 'final'
in `src/main/java/org/assertj/assertions/generator/description/ClassDescription.java`
#### Snippet
```java
  private static final String ASSERT_CLASS_SUFFIX = "Assert";

  private Set<GetterDescription> gettersDescriptions;
  private Set<FieldDescription> fieldsDescriptions;
  private Set<GetterDescription> declaredGettersDescriptions;
```

### FieldMayBeFinal
Field `fieldsDescriptions` may be 'final'
in `src/main/java/org/assertj/assertions/generator/description/ClassDescription.java`
#### Snippet
```java

  private Set<GetterDescription> gettersDescriptions;
  private Set<FieldDescription> fieldsDescriptions;
  private Set<GetterDescription> declaredGettersDescriptions;
  private Set<FieldDescription> declaredFieldsDescriptions;
```

### FieldMayBeFinal
Field `declaredFieldsDescriptions` may be 'final'
in `src/main/java/org/assertj/assertions/generator/description/ClassDescription.java`
#### Snippet
```java
  private Set<FieldDescription> fieldsDescriptions;
  private Set<GetterDescription> declaredGettersDescriptions;
  private Set<FieldDescription> declaredFieldsDescriptions;
  private TypeToken<?> type;
  private TypeToken<?> superType;
```

### FieldMayBeFinal
Field `type` may be 'final'
in `src/main/java/org/assertj/assertions/generator/description/ClassDescription.java`
#### Snippet
```java
  private Set<GetterDescription> declaredGettersDescriptions;
  private Set<FieldDescription> declaredFieldsDescriptions;
  private TypeToken<?> type;
  private TypeToken<?> superType;

```

### FieldMayBeFinal
Field `templateRegistry` may be 'final'
in `src/main/java/org/assertj/assertions/generator/BaseAssertionGenerator.java`
#### Snippet
```java
  // ex : com.nba.Player -> targetBaseDirectory/com/nba/PlayerAssert.java
  private File targetBaseDirectory = Paths.get(".").toFile();
  private TemplateRegistry templateRegistry;// the pattern to search for
  private boolean generateAssertionsForAllFields = false;
  private String generatedAssertionsPackage = null;
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/org/assertj/assertions/generator/description/GetterDescription.java`
#### Snippet
```java
public class GetterDescription extends DataDescription implements Comparable<GetterDescription> {

  private final Invokable<?, ?> invokable;
  private final ImmutableList<TypeToken<? extends Throwable>> exceptions;

```

## RuleId[id=UnstableApiUsage]
### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/assertions/generator/description/GetterDescription.java`
#### Snippet
```java

  private final Invokable<?, ?> invokable;
  private final ImmutableList<TypeToken<? extends Throwable>> exceptions;

  public GetterDescription(String propertyName, TypeToken<?> owningType, Method method) {
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/assertions/generator/description/GetterDescription.java`
#### Snippet
```java
  private final ImmutableList<TypeToken<? extends Throwable>> exceptions;

  public GetterDescription(String propertyName, TypeToken<?> owningType, Method method) {
    super(propertyName, method, Visibility.PUBLIC, owningType.method(method).getReturnType(), owningType);
    this.invokable = owningType.method(method);
```

### UnstableApiUsage
'method(java.lang.reflect.Method)' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `src/main/java/org/assertj/assertions/generator/description/GetterDescription.java`
#### Snippet
```java

  public GetterDescription(String propertyName, TypeToken<?> owningType, Method method) {
    super(propertyName, method, Visibility.PUBLIC, owningType.method(method).getReturnType(), owningType);
    this.invokable = owningType.method(method);
    this.exceptions = invokable.getExceptionTypes();
```

### UnstableApiUsage
'getReturnType()' is declared in unstable class 'com.google.common.reflect.Invokable' marked with @Beta
in `src/main/java/org/assertj/assertions/generator/description/GetterDescription.java`
#### Snippet
```java

  public GetterDescription(String propertyName, TypeToken<?> owningType, Method method) {
    super(propertyName, method, Visibility.PUBLIC, owningType.method(method).getReturnType(), owningType);
    this.invokable = owningType.method(method);
    this.exceptions = invokable.getExceptionTypes();
```

### UnstableApiUsage
'method(java.lang.reflect.Method)' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `src/main/java/org/assertj/assertions/generator/description/GetterDescription.java`
#### Snippet
```java
  public GetterDescription(String propertyName, TypeToken<?> owningType, Method method) {
    super(propertyName, method, Visibility.PUBLIC, owningType.method(method).getReturnType(), owningType);
    this.invokable = owningType.method(method);
    this.exceptions = invokable.getExceptionTypes();
  }
```

### UnstableApiUsage
'getExceptionTypes()' is declared in unstable class 'com.google.common.reflect.Invokable' marked with @Beta
in `src/main/java/org/assertj/assertions/generator/description/GetterDescription.java`
#### Snippet
```java
    super(propertyName, method, Visibility.PUBLIC, owningType.method(method).getReturnType(), owningType);
    this.invokable = owningType.method(method);
    this.exceptions = invokable.getExceptionTypes();
  }

```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/assertions/generator/description/GetterDescription.java`
#### Snippet
```java
  }

  public ImmutableList<TypeToken<? extends Throwable>> getExceptions() {
    return exceptions;
  }
```

### UnstableApiUsage
'com.google.common.reflect.Invokable' is marked unstable with @Beta
in `src/main/java/org/assertj/assertions/generator/description/GetterDescription.java`
#### Snippet
```java
public class GetterDescription extends DataDescription implements Comparable<GetterDescription> {

  private final Invokable<?, ?> invokable;
  private final ImmutableList<TypeToken<? extends Throwable>> exceptions;

```

### UnstableApiUsage
'closeQuietly(java.io.@org.checkerframework.checker.nullness.qual.Nullable InputStream)' is declared in unstable class 'com.google.common.io.Closeables' marked with @Beta
in `src/main/java/org/assertj/assertions/generator/Template.java`
#### Snippet
```java
      return CharStreams.toString(reader);
    } finally {
      closeQuietly(input);
      closeQuietly(reader);
    }
```

### UnstableApiUsage
'closeQuietly(java.io.@org.checkerframework.checker.nullness.qual.Nullable Reader)' is declared in unstable class 'com.google.common.io.Closeables' marked with @Beta
in `src/main/java/org/assertj/assertions/generator/Template.java`
#### Snippet
```java
    } finally {
      closeQuietly(input);
      closeQuietly(reader);
    }
  }
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/assertions/generator/AssertionGenerator.java`
#### Snippet
```java
   *             if something went wrong when creating the assertion content.
   */
  String[] generateHierarchicalCustomAssertionContentFor(ClassDescription classDescription, Set<TypeToken<?>> allClasses);

    /**
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/assertions/generator/AssertionGenerator.java`
#### Snippet
```java
   * @throws IOException if something went wrong when creating the assertion files.
   */
  File[] generateHierarchicalCustomAssertionFor(ClassDescription classDescription, Set<TypeToken<?>> allClasses) throws IOException;

  /**
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/assertions/generator/cli/AssertionGeneratorLauncher.java`
#### Snippet
```java
      }

      Set<TypeToken<?>> classes = collectClasses(line.getArgs());

      if (line.hasOption('H')) {
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/assertions/generator/cli/AssertionGeneratorLauncher.java`
#### Snippet
```java
  }

  private static ClassDescription toClassDescription(TypeToken<?> type) {
    return classDescriptionConverter.convertToClassDescription(type);
  }
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/assertions/generator/cli/AssertionGeneratorLauncher.java`
#### Snippet
```java
  }
  
  private static void generateFlatAssertions(Set<TypeToken<?>> types) throws IOException {
    logger.info("Generating assertions for types {}", types);
    BaseAssertionGenerator customAssertionGenerator = new BaseAssertionGenerator();
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/assertions/generator/cli/AssertionGeneratorLauncher.java`
#### Snippet
```java
    BaseAssertionGenerator customAssertionGenerator = new BaseAssertionGenerator();
    
    for (TypeToken<?> type : types) {
      logger.info("Generating assertions for class : {}", type);
      File customAssertionFile = customAssertionGenerator.generateCustomAssertionFor(toClassDescription(type));
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/assertions/generator/cli/AssertionGeneratorLauncher.java`
#### Snippet
```java
  }
  
  private static void generateHierarchicalAssertions(Set<TypeToken<?>> types) throws IOException {
    // Create a hashset of the classes for efficient lookup.
    Set<TypeToken<?>> typeSet = newLinkedHashSet(types);
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/assertions/generator/cli/AssertionGeneratorLauncher.java`
#### Snippet
```java
  private static void generateHierarchicalAssertions(Set<TypeToken<?>> types) throws IOException {
    // Create a hashset of the classes for efficient lookup.
    Set<TypeToken<?>> typeSet = newLinkedHashSet(types);
    logger.info("Generating hierarchical assertions for classes {}", types);
    BaseAssertionGenerator customAssertionGenerator = new BaseAssertionGenerator();
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/assertions/generator/cli/AssertionGeneratorLauncher.java`
#### Snippet
```java
    BaseAssertionGenerator customAssertionGenerator = new BaseAssertionGenerator();
    
    for (TypeToken<?> type : types) {
      logger.info("Generating hierarchical assertions for class : {}", type);
      File[] customAssertionFiles = customAssertionGenerator.generateHierarchicalCustomAssertionFor(toClassDescription(type), typeSet);
```

### UnstableApiUsage
'getRawType()' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `src/main/java/org/assertj/assertions/generator/description/ClassDescription.java`
#### Snippet
```java

  public String getPackageName() {
    return type.getRawType().getPackage().getName();
  }

```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/assertions/generator/description/ClassDescription.java`
#### Snippet
```java
  }

  private static String abstractAssertClassNameOf(TypeToken<?> type) {
    return ABSTRACT_ASSERT_CLASS_PREFIX + assertClassNameOf(type);
  }
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/assertions/generator/description/ClassDescription.java`
#### Snippet
```java
  private Set<FieldDescription> declaredFieldsDescriptions;
  private TypeToken<?> type;
  private TypeToken<?> superType;

  public ClassDescription(TypeToken<?> type) {
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/assertions/generator/description/ClassDescription.java`
#### Snippet
```java
  }

  private static String assertClassNameOf(TypeToken<?> type) {
    String typeDeclaration = getTypeDeclaration(type);
    String typeNameWithoutDots = getTypeNameWithoutDots(typeDeclaration);
```

### UnstableApiUsage
'getSupertype(java.lang.Class)' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `src/main/java/org/assertj/assertions/generator/description/ClassDescription.java`
#### Snippet
```java
    // TypeToken#getSupertype(..) checks to make sure it is a super type
    if (superType != null) {
      this.superType = type.getSupertype((Class) superType);
    }
  }
```

### UnstableApiUsage
'getRawType()' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `src/main/java/org/assertj/assertions/generator/description/ClassDescription.java`
#### Snippet
```java

  public String getFullyQualifiedParentAssertClassName() {
    if (superType.getRawType().equals(Object.class)) return "org.assertj.core.api.AbstractObjectAssert";
    return superType.getRawType().getPackage().getName() + "." + abstractAssertClassNameOf(superType);
  }
```

### UnstableApiUsage
'getRawType()' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `src/main/java/org/assertj/assertions/generator/description/ClassDescription.java`
#### Snippet
```java
  public String getFullyQualifiedParentAssertClassName() {
    if (superType.getRawType().equals(Object.class)) return "org.assertj.core.api.AbstractObjectAssert";
    return superType.getRawType().getPackage().getName() + "." + abstractAssertClassNameOf(superType);
  }

```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/assertions/generator/description/ClassDescription.java`
#### Snippet
```java
  }

  public TypeToken<?> getSuperType() {
    return superType;
  }
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/assertions/generator/description/ClassDescription.java`
#### Snippet
```java
  private TypeToken<?> superType;

  public ClassDescription(TypeToken<?> type) {
    this.type = type;
    this.superType = null;
```

### UnstableApiUsage
'isSubtypeOf(java.lang.reflect.Type)' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `src/main/java/org/assertj/assertions/generator/description/ClassDescription.java`
#### Snippet
```java

  public boolean implementsComparable() {
    return type.isSubtypeOf(Comparable.class);
  }
}
```

### UnstableApiUsage
'getRawType()' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `src/main/java/org/assertj/assertions/generator/description/ClassDescription.java`
#### Snippet
```java
  @Override
  public int compareTo(ClassDescription o) {
    return type.getRawType().getName().compareTo(o.type.getRawType().getName());
  }

```

### UnstableApiUsage
'getRawType()' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `src/main/java/org/assertj/assertions/generator/description/ClassDescription.java`
#### Snippet
```java
  @Override
  public int compareTo(ClassDescription o) {
    return type.getRawType().getName().compareTo(o.type.getRawType().getName());
  }

```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/assertions/generator/description/ClassDescription.java`
#### Snippet
```java
  private Set<GetterDescription> declaredGettersDescriptions;
  private Set<FieldDescription> declaredFieldsDescriptions;
  private TypeToken<?> type;
  private TypeToken<?> superType;

```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/assertions/generator/description/FieldDescription.java`
#### Snippet
```java
  }

  public FieldDescription(Field field, Visibility visibility, TypeToken<?> owningType) {
    super(propertyNameOf(field), field, visibility, owningType.resolveType(field.getGenericType()), owningType);
  }
```

### UnstableApiUsage
'resolveType(java.lang.reflect.Type)' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `src/main/java/org/assertj/assertions/generator/description/FieldDescription.java`
#### Snippet
```java

  public FieldDescription(Field field, Visibility visibility, TypeToken<?> owningType) {
    super(propertyNameOf(field), field, visibility, owningType.resolveType(field.getGenericType()), owningType);
  }

```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/assertions/generator/description/FieldDescription.java`
#### Snippet
```java
public class FieldDescription extends DataDescription implements Comparable<FieldDescription> {

  public FieldDescription(Field field, TypeToken<?> owningType) {
    this(field, Visibility.PUBLIC, owningType);
  }
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/assertions/generator/description/converter/ClassToClassDescriptionConverter.java`
#### Snippet
```java
  public ClassDescription convertToClassDescription(Class<?> clazz) {
    checkArgument(!clazz.isLocalClass(), "Can not support Local class %s", clazz);
    return convertToClassDescription(TypeToken.of(clazz));
  }

```

### UnstableApiUsage
'of(java.lang.Class)' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `src/main/java/org/assertj/assertions/generator/description/converter/ClassToClassDescriptionConverter.java`
#### Snippet
```java
  public ClassDescription convertToClassDescription(Class<?> clazz) {
    checkArgument(!clazz.isLocalClass(), "Can not support Local class %s", clazz);
    return convertToClassDescription(TypeToken.of(clazz));
  }

```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/assertions/generator/description/converter/ClassToClassDescriptionConverter.java`
#### Snippet
```java
  }

  private Set<GetterDescription> declaredGetterDescriptionsOf(TypeToken<?> type) {
    return doGetterDescriptionsOf(declaredGetterMethodsOf(type, annotationConfiguration.includedAnnotations()), type);
  }
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/assertions/generator/description/converter/ClassToClassDescriptionConverter.java`
#### Snippet
```java
  }

  private Set<FieldDescription> declaredFieldDescriptionsOf(TypeToken<?> type) {
    return doFieldDescriptionsOf(type, declaredFieldsOf(type));
  }
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/assertions/generator/description/converter/ClassToClassDescriptionConverter.java`
#### Snippet
```java
  }

  private Set<GetterDescription> getterDescriptionsOf(TypeToken<?> type) {
    return doGetterDescriptionsOf(getterMethodsOf(type, annotationConfiguration.includedAnnotations()), type);
  }
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/assertions/generator/description/converter/ClassToClassDescriptionConverter.java`
#### Snippet
```java
import static org.assertj.assertions.generator.util.ClassUtil.*;

public class ClassToClassDescriptionConverter implements ClassDescriptionConverter<TypeToken<?>> {

  private final AnnotationConfiguration annotationConfiguration;
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/assertions/generator/description/converter/ClassToClassDescriptionConverter.java`
#### Snippet
```java
  }

  private Set<FieldDescription> doFieldDescriptionsOf(TypeToken<?> type, List<Field> fields) {
    Set<FieldDescription> fieldDescriptions = new TreeSet<>();
    for (Field field : fields) {
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/assertions/generator/description/converter/ClassToClassDescriptionConverter.java`
#### Snippet
```java
  }

  private Set<GetterDescription> doGetterDescriptionsOf(Set<Method> getters, TypeToken<?> type) {
    Set<GetterDescription> getterDescriptions = new TreeSet<>();
    for (Method getter : getters) {
```

### UnstableApiUsage
'getRawType()' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `src/main/java/org/assertj/assertions/generator/description/converter/ClassToClassDescriptionConverter.java`
#### Snippet
```java
    for (Method getter : getters) {
      // ignore getDeclaringClass if Enum
      if (isGetDeclaringClassEnumGetter(getter, type.getRawType())) continue;

      String propertyName = propertyNameOf(getter);
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/assertions/generator/description/converter/ClassToClassDescriptionConverter.java`
#### Snippet
```java
  }

  private Set<FieldDescription> fieldDescriptionsOf(TypeToken<?> type) {
    return doFieldDescriptionsOf(type, nonStaticFieldsOf(type));
  }
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/assertions/generator/description/converter/ClassToClassDescriptionConverter.java`
#### Snippet
```java

  @Override
  public ClassDescription convertToClassDescription(TypeToken<?> type) {
    checkArgument(!type.getRawType().isLocalClass(), "Can not support Local class %s", type);
    ClassDescription classDescription = new ClassDescription(type);
```

### UnstableApiUsage
'getRawType()' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `src/main/java/org/assertj/assertions/generator/description/converter/ClassToClassDescriptionConverter.java`
#### Snippet
```java
  @Override
  public ClassDescription convertToClassDescription(TypeToken<?> type) {
    checkArgument(!type.getRawType().isLocalClass(), "Can not support Local class %s", type);
    ClassDescription classDescription = new ClassDescription(type);
    classDescription.addGetterDescriptions(getterDescriptionsOf(type));
```

### UnstableApiUsage
'getRawType()' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `src/main/java/org/assertj/assertions/generator/description/converter/ClassToClassDescriptionConverter.java`
#### Snippet
```java
    classDescription.addDeclaredGetterDescriptions(declaredGetterDescriptionsOf(type));
    classDescription.addDeclaredFieldDescriptions(declaredFieldDescriptionsOf(type));
    classDescription.setSuperType(type.getRawType().getSuperclass());
    return classDescription;
  }
```

### UnstableApiUsage
'getRawType()' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `src/main/java/org/assertj/assertions/generator/description/DataDescription.java`
#### Snippet
```java

  public boolean isPrimitiveWrapperType() {
    return Primitives.isWrapperType(valueType.getRawType());
  }

```

### UnstableApiUsage
'isSubtypeOf(java.lang.reflect.Type)' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `src/main/java/org/assertj/assertions/generator/description/DataDescription.java`
#### Snippet
```java

  public boolean isIterableType() {
    return valueType.isSubtypeOf(Iterable.class);
  }

```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/assertions/generator/description/DataDescription.java`
#### Snippet
```java
  protected final Visibility visibility;

  DataDescription(String name, Member originalMember, Visibility visibility, TypeToken<?> type, TypeToken<?> owningType) {
    this.name = name;
    this.originalMember = originalMember;
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/assertions/generator/description/DataDescription.java`
#### Snippet
```java
  protected final Visibility visibility;

  DataDescription(String name, Member originalMember, Visibility visibility, TypeToken<?> type, TypeToken<?> owningType) {
    this.name = name;
    this.originalMember = originalMember;
```

### UnstableApiUsage
'isPrimitive()' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `src/main/java/org/assertj/assertions/generator/description/DataDescription.java`
#### Snippet
```java

  public boolean isPrimitiveType() {
    return valueType.isPrimitive();
  }

```

### UnstableApiUsage
'isArray()' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `src/main/java/org/assertj/assertions/generator/description/DataDescription.java`
#### Snippet
```java
  public String getElementTypeName() {
    String elementTypeName = null;
    if (valueType.isArray()) {
      elementTypeName = getTypeDeclaration(valueType.getComponentType());
    } else if (valueType.isSubtypeOf(Iterable.class)) {
```

### UnstableApiUsage
'getComponentType()' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `src/main/java/org/assertj/assertions/generator/description/DataDescription.java`
#### Snippet
```java
    String elementTypeName = null;
    if (valueType.isArray()) {
      elementTypeName = getTypeDeclaration(valueType.getComponentType());
    } else if (valueType.isSubtypeOf(Iterable.class)) {
      TypeToken<?> componentType = valueType.resolveType(Iterable.class.getTypeParameters()[0]);
```

### UnstableApiUsage
'isSubtypeOf(java.lang.reflect.Type)' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `src/main/java/org/assertj/assertions/generator/description/DataDescription.java`
#### Snippet
```java
    if (valueType.isArray()) {
      elementTypeName = getTypeDeclaration(valueType.getComponentType());
    } else if (valueType.isSubtypeOf(Iterable.class)) {
      TypeToken<?> componentType = valueType.resolveType(Iterable.class.getTypeParameters()[0]);
      elementTypeName = getTypeDeclaration(componentType);
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/assertions/generator/description/DataDescription.java`
#### Snippet
```java
      elementTypeName = getTypeDeclaration(valueType.getComponentType());
    } else if (valueType.isSubtypeOf(Iterable.class)) {
      TypeToken<?> componentType = valueType.resolveType(Iterable.class.getTypeParameters()[0]);
      elementTypeName = getTypeDeclaration(componentType);
      // remove any generic type boundaries
```

### UnstableApiUsage
'resolveType(java.lang.reflect.Type)' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `src/main/java/org/assertj/assertions/generator/description/DataDescription.java`
#### Snippet
```java
      elementTypeName = getTypeDeclaration(valueType.getComponentType());
    } else if (valueType.isSubtypeOf(Iterable.class)) {
      TypeToken<?> componentType = valueType.resolveType(Iterable.class.getTypeParameters()[0]);
      elementTypeName = getTypeDeclaration(componentType);
      // remove any generic type boundaries
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/assertions/generator/description/DataDescription.java`
#### Snippet
```java
  final Member originalMember;
  final TypeToken<?> valueType;
  private final TypeToken<?> owningType;
  protected final Visibility visibility;

```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/assertions/generator/description/DataDescription.java`
#### Snippet
```java
  }

  TypeToken<?> getValueType() {
    return valueType;
  }
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/assertions/generator/description/DataDescription.java`
#### Snippet
```java

  public boolean isCharType() {
    TypeToken<?> unwrapped = valueType.unwrap();
    return unwrapped.isSubtypeOf(char.class);
  }
```

### UnstableApiUsage
'unwrap()' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `src/main/java/org/assertj/assertions/generator/description/DataDescription.java`
#### Snippet
```java

  public boolean isCharType() {
    TypeToken<?> unwrapped = valueType.unwrap();
    return unwrapped.isSubtypeOf(char.class);
  }
```

### UnstableApiUsage
'isSubtypeOf(java.lang.reflect.Type)' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `src/main/java/org/assertj/assertions/generator/description/DataDescription.java`
#### Snippet
```java
  public boolean isCharType() {
    TypeToken<?> unwrapped = valueType.unwrap();
    return unwrapped.isSubtypeOf(char.class);
  }

```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/assertions/generator/description/DataDescription.java`
#### Snippet
```java

  public boolean isRealNumberType() {
    TypeToken<?> unwrapped = valueType.unwrap();
    return unwrapped.isSubtypeOf(double.class) || unwrapped.isSubtypeOf(float.class);
  }
```

### UnstableApiUsage
'unwrap()' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `src/main/java/org/assertj/assertions/generator/description/DataDescription.java`
#### Snippet
```java

  public boolean isRealNumberType() {
    TypeToken<?> unwrapped = valueType.unwrap();
    return unwrapped.isSubtypeOf(double.class) || unwrapped.isSubtypeOf(float.class);
  }
```

### UnstableApiUsage
'isSubtypeOf(java.lang.reflect.Type)' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `src/main/java/org/assertj/assertions/generator/description/DataDescription.java`
#### Snippet
```java
  public boolean isRealNumberType() {
    TypeToken<?> unwrapped = valueType.unwrap();
    return unwrapped.isSubtypeOf(double.class) || unwrapped.isSubtypeOf(float.class);
  }

```

### UnstableApiUsage
'isSubtypeOf(java.lang.reflect.Type)' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `src/main/java/org/assertj/assertions/generator/description/DataDescription.java`
#### Snippet
```java
  public boolean isRealNumberType() {
    TypeToken<?> unwrapped = valueType.unwrap();
    return unwrapped.isSubtypeOf(double.class) || unwrapped.isSubtypeOf(float.class);
  }

```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/assertions/generator/description/DataDescription.java`
#### Snippet
```java
  private final String name;
  final Member originalMember;
  final TypeToken<?> valueType;
  private final TypeToken<?> owningType;
  protected final Visibility visibility;
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/assertions/generator/description/DataDescription.java`
#### Snippet
```java

  public boolean isWholeNumberType() {
    TypeToken<?> unwrapped = valueType.unwrap();
    return unwrapped.isSubtypeOf(int.class) || unwrapped.isSubtypeOf(long.class)
           || unwrapped.isSubtypeOf(byte.class) || unwrapped.isSubtypeOf(short.class);
```

### UnstableApiUsage
'unwrap()' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `src/main/java/org/assertj/assertions/generator/description/DataDescription.java`
#### Snippet
```java

  public boolean isWholeNumberType() {
    TypeToken<?> unwrapped = valueType.unwrap();
    return unwrapped.isSubtypeOf(int.class) || unwrapped.isSubtypeOf(long.class)
           || unwrapped.isSubtypeOf(byte.class) || unwrapped.isSubtypeOf(short.class);
```

### UnstableApiUsage
'isSubtypeOf(java.lang.reflect.Type)' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `src/main/java/org/assertj/assertions/generator/description/DataDescription.java`
#### Snippet
```java
  public boolean isWholeNumberType() {
    TypeToken<?> unwrapped = valueType.unwrap();
    return unwrapped.isSubtypeOf(int.class) || unwrapped.isSubtypeOf(long.class)
           || unwrapped.isSubtypeOf(byte.class) || unwrapped.isSubtypeOf(short.class);
  }
```

### UnstableApiUsage
'isSubtypeOf(java.lang.reflect.Type)' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `src/main/java/org/assertj/assertions/generator/description/DataDescription.java`
#### Snippet
```java
  public boolean isWholeNumberType() {
    TypeToken<?> unwrapped = valueType.unwrap();
    return unwrapped.isSubtypeOf(int.class) || unwrapped.isSubtypeOf(long.class)
           || unwrapped.isSubtypeOf(byte.class) || unwrapped.isSubtypeOf(short.class);
  }
```

### UnstableApiUsage
'isSubtypeOf(java.lang.reflect.Type)' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `src/main/java/org/assertj/assertions/generator/description/DataDescription.java`
#### Snippet
```java
    TypeToken<?> unwrapped = valueType.unwrap();
    return unwrapped.isSubtypeOf(int.class) || unwrapped.isSubtypeOf(long.class)
           || unwrapped.isSubtypeOf(byte.class) || unwrapped.isSubtypeOf(short.class);
  }

```

### UnstableApiUsage
'isSubtypeOf(java.lang.reflect.Type)' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `src/main/java/org/assertj/assertions/generator/description/DataDescription.java`
#### Snippet
```java
    TypeToken<?> unwrapped = valueType.unwrap();
    return unwrapped.isSubtypeOf(int.class) || unwrapped.isSubtypeOf(long.class)
           || unwrapped.isSubtypeOf(byte.class) || unwrapped.isSubtypeOf(short.class);
  }

```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/assertions/generator/description/DataDescription.java`
#### Snippet
```java
  public String getElementAssertTypeName() {
    String packageName = owningTypePackageName();
    TypeToken<?> elementType = valueType.getComponentType();
    return elementType == null ? null : getAssertType(elementType, packageName);
  }
```

### UnstableApiUsage
'getComponentType()' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `src/main/java/org/assertj/assertions/generator/description/DataDescription.java`
#### Snippet
```java
  public String getElementAssertTypeName() {
    String packageName = owningTypePackageName();
    TypeToken<?> elementType = valueType.getComponentType();
    return elementType == null ? null : getAssertType(elementType, packageName);
  }
```

### UnstableApiUsage
'isArray()' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `src/main/java/org/assertj/assertions/generator/description/DataDescription.java`
#### Snippet
```java

  public boolean isArrayType() {
    return valueType.isArray();
  }

```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/assertions/generator/util/ClassUtil.java`
#### Snippet
```java
  }

  private static Set<TypeToken<?>> getPackageClassesFromClasspathJars(String packageName, ClassLoader classLoader)
                                                                                                                   throws IOException {
    ImmutableSet<ClassInfo> classesInfo = ClassPath.from(classLoader).getTopLevelClassesRecursive(packageName);
```

### UnstableApiUsage
'com.google.common.reflect.ClassPath.ClassInfo' is marked unstable with @Beta
in `src/main/java/org/assertj/assertions/generator/util/ClassUtil.java`
#### Snippet
```java
  private static Set<TypeToken<?>> getPackageClassesFromClasspathJars(String packageName, ClassLoader classLoader)
                                                                                                                   throws IOException {
    ImmutableSet<ClassInfo> classesInfo = ClassPath.from(classLoader).getTopLevelClassesRecursive(packageName);
    Set<TypeToken<?>> classesInPackage = new HashSet<>();
    for (ClassInfo classInfo : classesInfo) {
```

### UnstableApiUsage
'com.google.common.reflect.ClassPath' is marked unstable with @Beta
in `src/main/java/org/assertj/assertions/generator/util/ClassUtil.java`
#### Snippet
```java
  private static Set<TypeToken<?>> getPackageClassesFromClasspathJars(String packageName, ClassLoader classLoader)
                                                                                                                   throws IOException {
    ImmutableSet<ClassInfo> classesInfo = ClassPath.from(classLoader).getTopLevelClassesRecursive(packageName);
    Set<TypeToken<?>> classesInPackage = new HashSet<>();
    for (ClassInfo classInfo : classesInfo) {
```

### UnstableApiUsage
'from(java.lang.ClassLoader)' is declared in unstable class 'com.google.common.reflect.ClassPath' marked with @Beta
in `src/main/java/org/assertj/assertions/generator/util/ClassUtil.java`
#### Snippet
```java
  private static Set<TypeToken<?>> getPackageClassesFromClasspathJars(String packageName, ClassLoader classLoader)
                                                                                                                   throws IOException {
    ImmutableSet<ClassInfo> classesInfo = ClassPath.from(classLoader).getTopLevelClassesRecursive(packageName);
    Set<TypeToken<?>> classesInPackage = new HashSet<>();
    for (ClassInfo classInfo : classesInfo) {
```

### UnstableApiUsage
'getTopLevelClassesRecursive(java.lang.String)' is declared in unstable class 'com.google.common.reflect.ClassPath' marked with @Beta
in `src/main/java/org/assertj/assertions/generator/util/ClassUtil.java`
#### Snippet
```java
  private static Set<TypeToken<?>> getPackageClassesFromClasspathJars(String packageName, ClassLoader classLoader)
                                                                                                                   throws IOException {
    ImmutableSet<ClassInfo> classesInfo = ClassPath.from(classLoader).getTopLevelClassesRecursive(packageName);
    Set<TypeToken<?>> classesInPackage = new HashSet<>();
    for (ClassInfo classInfo : classesInfo) {
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/assertions/generator/util/ClassUtil.java`
#### Snippet
```java
                                                                                                                   throws IOException {
    ImmutableSet<ClassInfo> classesInfo = ClassPath.from(classLoader).getTopLevelClassesRecursive(packageName);
    Set<TypeToken<?>> classesInPackage = new HashSet<>();
    for (ClassInfo classInfo : classesInfo) {
      classesInPackage.add(TypeToken.of(classInfo.load()));
```

### UnstableApiUsage
'com.google.common.reflect.ClassPath.ClassInfo' is marked unstable with @Beta
in `src/main/java/org/assertj/assertions/generator/util/ClassUtil.java`
#### Snippet
```java
    ImmutableSet<ClassInfo> classesInfo = ClassPath.from(classLoader).getTopLevelClassesRecursive(packageName);
    Set<TypeToken<?>> classesInPackage = new HashSet<>();
    for (ClassInfo classInfo : classesInfo) {
      classesInPackage.add(TypeToken.of(classInfo.load()));
    }
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/assertions/generator/util/ClassUtil.java`
#### Snippet
```java
    Set<TypeToken<?>> classesInPackage = new HashSet<>();
    for (ClassInfo classInfo : classesInfo) {
      classesInPackage.add(TypeToken.of(classInfo.load()));
    }

```

### UnstableApiUsage
'of(java.lang.Class)' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `src/main/java/org/assertj/assertions/generator/util/ClassUtil.java`
#### Snippet
```java
    Set<TypeToken<?>> classesInPackage = new HashSet<>();
    for (ClassInfo classInfo : classesInfo) {
      classesInPackage.add(TypeToken.of(classInfo.load()));
    }

```

### UnstableApiUsage
'load()' is declared in unstable class 'com.google.common.reflect.ClassPath.ClassInfo' marked with @Beta
in `src/main/java/org/assertj/assertions/generator/util/ClassUtil.java`
#### Snippet
```java
    Set<TypeToken<?>> classesInPackage = new HashSet<>();
    for (ClassInfo classInfo : classesInfo) {
      classesInPackage.add(TypeToken.of(classInfo.load()));
    }

```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/assertions/generator/util/ClassUtil.java`
#### Snippet
```java
    }

    Set<TypeToken<?>> filteredClassesInPackage = new HashSet<>();
    for (TypeToken<?> classFromJar : classesInPackage) {
      if (isClassCandidateToAssertionsGeneration(classFromJar, false)) {
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/assertions/generator/util/ClassUtil.java`
#### Snippet
```java

    Set<TypeToken<?>> filteredClassesInPackage = new HashSet<>();
    for (TypeToken<?> classFromJar : classesInPackage) {
      if (isClassCandidateToAssertionsGeneration(classFromJar, false)) {
        filteredClassesInPackage.add(classFromJar);
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/assertions/generator/util/ClassUtil.java`
#### Snippet
```java
  }

  public static String safePackageName(TypeToken<?> typeToken) {
    return typeToken.getRawType().getPackage() == null ? "" : typeToken.getRawType().getPackage().getName();
  }
```

### UnstableApiUsage
'getRawType()' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `src/main/java/org/assertj/assertions/generator/util/ClassUtil.java`
#### Snippet
```java

  public static String safePackageName(TypeToken<?> typeToken) {
    return typeToken.getRawType().getPackage() == null ? "" : typeToken.getRawType().getPackage().getName();
  }

```

### UnstableApiUsage
'getRawType()' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `src/main/java/org/assertj/assertions/generator/util/ClassUtil.java`
#### Snippet
```java

  public static String safePackageName(TypeToken<?> typeToken) {
    return typeToken.getRawType().getPackage() == null ? "" : typeToken.getRawType().getPackage().getName();
  }

```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/assertions/generator/util/ClassUtil.java`
#### Snippet
```java
   * </code>
   * @param classOrPackageNames classes or packages to collect.
   * @return the set of {@link TypeToken}s found
   */
  public static Set<TypeToken<?>> collectClasses(String... classOrPackageNames) {
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/assertions/generator/util/ClassUtil.java`
#### Snippet
```java
   * @return the set of {@link TypeToken}s found
   */
  public static Set<TypeToken<?>> collectClasses(String... classOrPackageNames) {
    return collectClasses(Thread.currentThread().getContextClassLoader(), classOrPackageNames);
  }
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/assertions/generator/util/ClassUtil.java`
#### Snippet
```java
   * @return true if part of java language
   */
  public static boolean isJavaLangType(TypeToken<?> type) {
    return type.isPrimitive() || type.isArray() || Objects.equals(JAVA_LANG_PACKAGE, type.getRawType().getPackage());
  }
```

### UnstableApiUsage
'isPrimitive()' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `src/main/java/org/assertj/assertions/generator/util/ClassUtil.java`
#### Snippet
```java
   */
  public static boolean isJavaLangType(TypeToken<?> type) {
    return type.isPrimitive() || type.isArray() || Objects.equals(JAVA_LANG_PACKAGE, type.getRawType().getPackage());
  }

```

### UnstableApiUsage
'isArray()' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `src/main/java/org/assertj/assertions/generator/util/ClassUtil.java`
#### Snippet
```java
   */
  public static boolean isJavaLangType(TypeToken<?> type) {
    return type.isPrimitive() || type.isArray() || Objects.equals(JAVA_LANG_PACKAGE, type.getRawType().getPackage());
  }

```

### UnstableApiUsage
'getRawType()' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `src/main/java/org/assertj/assertions/generator/util/ClassUtil.java`
#### Snippet
```java
   */
  public static boolean isJavaLangType(TypeToken<?> type) {
    return type.isPrimitive() || type.isArray() || Objects.equals(JAVA_LANG_PACKAGE, type.getRawType().getPackage());
  }

```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/assertions/generator/util/ClassUtil.java`
#### Snippet
```java
  }

  private static boolean isClassCandidateToAssertionsGeneration(TypeToken<?> typeToken, boolean includePrivate) {
    if (typeToken == null) return false;
    if (isPackageInfo(typeToken)) return false;
```

### UnstableApiUsage
'getRawType()' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `src/main/java/org/assertj/assertions/generator/util/ClassUtil.java`
#### Snippet
```java
    if (typeToken == null) return false;
    if (isPackageInfo(typeToken)) return false;
    Class<?> raw = typeToken.getRawType();
    return (includePrivate || isPublic(raw.getModifiers()))
           && !raw.isAnonymousClass()
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/assertions/generator/util/ClassUtil.java`
#### Snippet
```java
   * @throws RuntimeException if any error occurs
   */
  private static Set<TypeToken<?>> getClassesInPackage(String packageName, ClassLoader classLoader) {
    if (classLoader == null) {
      throw new IllegalArgumentException("Null class loader.");
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/assertions/generator/util/ClassUtil.java`
#### Snippet
```java
    }
    // load classes from classpath file system, this won't load classes in jars
    Set<TypeToken<?>> packageClasses = getPackageClassesFromClasspathFiles(packageName, classLoader);
    // load classes from classpath jars
    try {
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/assertions/generator/util/ClassUtil.java`
#### Snippet
```java
   * @throws RuntimeException if any error occurs
   */
  public static Set<TypeToken<?>> collectClasses(ClassLoader classLoader, boolean includePrivateClasses,
                                                 String... classOrPackageNames) {
    Set<TypeToken<?>> classes = newLinkedHashSet();
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/assertions/generator/util/ClassUtil.java`
#### Snippet
```java
  public static Set<TypeToken<?>> collectClasses(ClassLoader classLoader, boolean includePrivateClasses,
                                                 String... classOrPackageNames) {
    Set<TypeToken<?>> classes = newLinkedHashSet();
    for (String classOrPackageName : classOrPackageNames) {
      TypeToken<?> clazz = tryToLoadClass(classOrPackageName, classLoader);
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/assertions/generator/util/ClassUtil.java`
#### Snippet
```java
    Set<TypeToken<?>> classes = newLinkedHashSet();
    for (String classOrPackageName : classOrPackageNames) {
      TypeToken<?> clazz = tryToLoadClass(classOrPackageName, classLoader);
      if (isClassCandidateToAssertionsGeneration(clazz, includePrivateClasses)) {
        classes.add(clazz);
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/assertions/generator/util/ClassUtil.java`
#### Snippet
```java
  }

  private static TypeToken<?> loadClass(String className, ClassLoader classLoader) throws ClassNotFoundException {
    return TypeToken.of(Class.forName(className, false, classLoader));
  }
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/assertions/generator/util/ClassUtil.java`
#### Snippet
```java

  private static TypeToken<?> loadClass(String className, ClassLoader classLoader) throws ClassNotFoundException {
    return TypeToken.of(Class.forName(className, false, classLoader));
  }

```

### UnstableApiUsage
'of(java.lang.Class)' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `src/main/java/org/assertj/assertions/generator/util/ClassUtil.java`
#### Snippet
```java

  private static TypeToken<?> loadClass(String className, ClassLoader classLoader) throws ClassNotFoundException {
    return TypeToken.of(Class.forName(className, false, classLoader));
  }

```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/assertions/generator/util/ClassUtil.java`
#### Snippet
```java
  }

  private static Set<TypeToken<?>> getPackageClassesFromClasspathFiles(String packageName, ClassLoader classLoader) {
    try {
      String packagePath = packageName.replace('.', File.separatorChar);
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/assertions/generator/util/ClassUtil.java`
#### Snippet
```java
      // Ask for all resources for the path
      Enumeration<URL> resources = classLoader.getResources(packagePath);
      Set<TypeToken<?>> classes = newLinkedHashSet();
      while (resources.hasMoreElements()) {
        File directory = new File(URLDecoder.decode(resources.nextElement().getPath(), "UTF-8"));
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/assertions/generator/util/ClassUtil.java`
#### Snippet
```java
   * @return true iff the type is a boolean.
   */
  public static boolean isBoolean(TypeToken<?> type) {
    TypeToken<?> unwrapped = type.unwrap();
    return unwrapped.isSubtypeOf(boolean.class);
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/assertions/generator/util/ClassUtil.java`
#### Snippet
```java
   */
  public static boolean isBoolean(TypeToken<?> type) {
    TypeToken<?> unwrapped = type.unwrap();
    return unwrapped.isSubtypeOf(boolean.class);
  }
```

### UnstableApiUsage
'unwrap()' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `src/main/java/org/assertj/assertions/generator/util/ClassUtil.java`
#### Snippet
```java
   */
  public static boolean isBoolean(TypeToken<?> type) {
    TypeToken<?> unwrapped = type.unwrap();
    return unwrapped.isSubtypeOf(boolean.class);
  }
```

### UnstableApiUsage
'isSubtypeOf(java.lang.reflect.Type)' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `src/main/java/org/assertj/assertions/generator/util/ClassUtil.java`
#### Snippet
```java
  public static boolean isBoolean(TypeToken<?> type) {
    TypeToken<?> unwrapped = type.unwrap();
    return unwrapped.isSubtypeOf(boolean.class);
  }

```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/assertions/generator/util/ClassUtil.java`
#### Snippet
```java
  }

  public static List<Field> nonStaticFieldsOf(TypeToken<?> clazz) {
    List<Field> fields = getAllFieldsInHierarchy(clazz);
    return filterNonStaticFields(fields);
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/assertions/generator/util/ClassUtil.java`
#### Snippet
```java
  }

  public static Set<Method> getterMethodsOf(TypeToken<?> type, Set<Class<?>> includeAnnotations) {
    Class<?> clazz = type.getRawType();
    boolean isClassAnnotated = containsAny(clazz.getDeclaredAnnotations(), includeAnnotations);
```

### UnstableApiUsage
'getRawType()' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `src/main/java/org/assertj/assertions/generator/util/ClassUtil.java`
#### Snippet
```java

  public static Set<Method> getterMethodsOf(TypeToken<?> type, Set<Class<?>> includeAnnotations) {
    Class<?> clazz = type.getRawType();
    boolean isClassAnnotated = containsAny(clazz.getDeclaredAnnotations(), includeAnnotations);
    return filterGetterMethods(clazz.getMethods(), includeAnnotations, isClassAnnotated);
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/assertions/generator/util/ClassUtil.java`
#### Snippet
```java
   * @throws UnsupportedEncodingException thrown by {@link URLDecoder#decode(String, String)}
   */
  private static Set<TypeToken<?>> getClassesInDirectory(File directory, String packageName, ClassLoader classLoader)
                                                                                                                      throws UnsupportedEncodingException {
    Set<TypeToken<?>> classes = new LinkedHashSet<>();
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/assertions/generator/util/ClassUtil.java`
#### Snippet
```java
  private static Set<TypeToken<?>> getClassesInDirectory(File directory, String packageName, ClassLoader classLoader)
                                                                                                                      throws UnsupportedEncodingException {
    Set<TypeToken<?>> classes = new LinkedHashSet<>();

    // Capture all the .class files in this directory
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/assertions/generator/util/ClassUtil.java`
#### Snippet
```java
          // removes the .class extension
          String className = packageName + '.' + StringUtils.remove(currentFileName, CLASS_SUFFIX);
          TypeToken<?> loadedClass = loadClass(className, classLoader);
          // we are only interested in public classes that are neither anonymous nor local
          if (isClassCandidateToAssertionsGeneration(loadedClass, false)) {
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/assertions/generator/util/ClassUtil.java`
#### Snippet
```java
        checkNotNull(resource, "resource URL from package is null, package %s", path);
        File subDirectory = new File(URLDecoder.decode(resource.getPath(), "UTF-8"));
        Set<TypeToken<?>> classesForSubPackage = getClassesInDirectory(subDirectory, subPackageName, classLoader);
        classes.addAll(classesForSubPackage);
      }
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/assertions/generator/util/ClassUtil.java`
#### Snippet
```java
  }

  public static Set<Method> declaredGetterMethodsOf(TypeToken<?> type, Set<Class<?>> includeAnnotations) {
    Class<?> clazz = type.getRawType();
    boolean isClassAnnotated = containsAny(clazz.getDeclaredAnnotations(), includeAnnotations);
```

### UnstableApiUsage
'getRawType()' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `src/main/java/org/assertj/assertions/generator/util/ClassUtil.java`
#### Snippet
```java

  public static Set<Method> declaredGetterMethodsOf(TypeToken<?> type, Set<Class<?>> includeAnnotations) {
    Class<?> clazz = type.getRawType();
    boolean isClassAnnotated = containsAny(clazz.getDeclaredAnnotations(), includeAnnotations);
    return filterGetterMethods(clazz.getDeclaredMethods(), includeAnnotations, isClassAnnotated);
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/assertions/generator/util/ClassUtil.java`
#### Snippet
```java
  }

  private static boolean isPackageInfo(TypeToken<?> typeToken) {
    return typeToken.getRawType().getName().contains("package-info");
  }
```

### UnstableApiUsage
'getRawType()' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `src/main/java/org/assertj/assertions/generator/util/ClassUtil.java`
#### Snippet
```java

  private static boolean isPackageInfo(TypeToken<?> typeToken) {
    return typeToken.getRawType().getName().contains("package-info");
  }

```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/assertions/generator/util/ClassUtil.java`
#### Snippet
```java
   * @return all fields (whatever access levels) in the hierarchy of a class up to Object.class excluded.
   */
  public static List<Field> getAllFieldsInHierarchy(TypeToken<?> clazz) {
    List<Field> fields = newArrayList(clazz.getRawType().getDeclaredFields());
    Class<?> parentClass = clazz.getRawType().getSuperclass();
```

### UnstableApiUsage
'getRawType()' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `src/main/java/org/assertj/assertions/generator/util/ClassUtil.java`
#### Snippet
```java
   */
  public static List<Field> getAllFieldsInHierarchy(TypeToken<?> clazz) {
    List<Field> fields = newArrayList(clazz.getRawType().getDeclaredFields());
    Class<?> parentClass = clazz.getRawType().getSuperclass();
    if (parentClass != null && !Object.class.equals(parentClass)) {
```

### UnstableApiUsage
'getRawType()' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `src/main/java/org/assertj/assertions/generator/util/ClassUtil.java`
#### Snippet
```java
  public static List<Field> getAllFieldsInHierarchy(TypeToken<?> clazz) {
    List<Field> fields = newArrayList(clazz.getRawType().getDeclaredFields());
    Class<?> parentClass = clazz.getRawType().getSuperclass();
    if (parentClass != null && !Object.class.equals(parentClass)) {
      fields.addAll(getAllFieldsInHierarchy(TypeToken.of(parentClass)));
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/assertions/generator/util/ClassUtil.java`
#### Snippet
```java
    Class<?> parentClass = clazz.getRawType().getSuperclass();
    if (parentClass != null && !Object.class.equals(parentClass)) {
      fields.addAll(getAllFieldsInHierarchy(TypeToken.of(parentClass)));
    }
    return fields;
```

### UnstableApiUsage
'of(java.lang.Class)' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `src/main/java/org/assertj/assertions/generator/util/ClassUtil.java`
#### Snippet
```java
    Class<?> parentClass = clazz.getRawType().getSuperclass();
    if (parentClass != null && !Object.class.equals(parentClass)) {
      fields.addAll(getAllFieldsInHierarchy(TypeToken.of(parentClass)));
    }
    return fields;
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/assertions/generator/util/ClassUtil.java`
#### Snippet
```java
  }

  private static TypeToken<?> tryToLoadClass(String className, ClassLoader classLoader) {
    try {
      return loadClass(className, classLoader);
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/assertions/generator/util/ClassUtil.java`
#### Snippet
```java
  // used to support navigation assertion
  // https://github.com/joel-costigliola/assertj-assertions-generator/issues/67
  public static String getAssertType(TypeToken<?> type, String packageName) {

    TypeToken<?> wrapped = type.wrap();
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/assertions/generator/util/ClassUtil.java`
#### Snippet
```java
  public static String getAssertType(TypeToken<?> type, String packageName) {

    TypeToken<?> wrapped = type.wrap();
    Class<?> raw = wrapped.getRawType();

```

### UnstableApiUsage
'wrap()' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `src/main/java/org/assertj/assertions/generator/util/ClassUtil.java`
#### Snippet
```java
  public static String getAssertType(TypeToken<?> type, String packageName) {

    TypeToken<?> wrapped = type.wrap();
    Class<?> raw = wrapped.getRawType();

```

### UnstableApiUsage
'getRawType()' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `src/main/java/org/assertj/assertions/generator/util/ClassUtil.java`
#### Snippet
```java

    TypeToken<?> wrapped = type.wrap();
    Class<?> raw = wrapped.getRawType();

    String typeName = null;
```

### UnstableApiUsage
'getRawType()' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `src/main/java/org/assertj/assertions/generator/util/ClassUtil.java`
#### Snippet
```java

    if (typeName == null) {
      typeName = type.getRawType().getName();
    }

```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/assertions/generator/util/ClassUtil.java`
#### Snippet
```java
  }

  public static List<Field> declaredFieldsOf(TypeToken<?> type) {
    Field[] fields = type.getRawType().getDeclaredFields();
    return filterNonStaticFields(asList(fields));
```

### UnstableApiUsage
'getRawType()' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `src/main/java/org/assertj/assertions/generator/util/ClassUtil.java`
#### Snippet
```java

  public static List<Field> declaredFieldsOf(TypeToken<?> type) {
    Field[] fields = type.getRawType().getDeclaredFields();
    return filterNonStaticFields(asList(fields));
  }
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/assertions/generator/util/ClassUtil.java`
#### Snippet
```java
   */
  public static String resolveTypeNameInPackage(Type type, String currentPackage) {
    return resolveTypeNameInPackage(TypeToken.of(type), currentPackage);
  }

```

### UnstableApiUsage
'of(java.lang.reflect.Type)' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `src/main/java/org/assertj/assertions/generator/util/ClassUtil.java`
#### Snippet
```java
   */
  public static String resolveTypeNameInPackage(Type type, String currentPackage) {
    return resolveTypeNameInPackage(TypeToken.of(type), currentPackage);
  }

```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/assertions/generator/util/ClassUtil.java`
#### Snippet
```java
   * @return String Name resolved within the package
   */
  public static String resolveTypeNameInPackage(TypeToken<?> type, String currentPackage) {
    // we special case java.lang types because they never need a FQN.
    if (isJavaLangType(type)) {
```

### UnstableApiUsage
'getRawType()' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `src/main/java/org/assertj/assertions/generator/util/ClassUtil.java`
#### Snippet
```java
    // we special case java.lang types because they never need a FQN.
    if (isJavaLangType(type)) {
      return type.getRawType().getSimpleName();
    }

```

### UnstableApiUsage
'getRawType()' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `src/main/java/org/assertj/assertions/generator/util/ClassUtil.java`
#### Snippet
```java
    }

    return resolveTypeNameInPackage(type.getRawType().getName(), currentPackage);
  }

```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/assertions/generator/util/ClassUtil.java`
#### Snippet
```java
   * @return String representation of the type
   */
  public static String getTypeDeclaration(TypeToken<?> type) {

    if (type.isArray()) return getTypeDeclaration(type.getComponentType()) + "[]";
```

### UnstableApiUsage
'isArray()' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `src/main/java/org/assertj/assertions/generator/util/ClassUtil.java`
#### Snippet
```java
  public static String getTypeDeclaration(TypeToken<?> type) {

    if (type.isArray()) return getTypeDeclaration(type.getComponentType()) + "[]";
    if (type.isPrimitive()) return type.getRawType().toString();

```

### UnstableApiUsage
'getComponentType()' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `src/main/java/org/assertj/assertions/generator/util/ClassUtil.java`
#### Snippet
```java
  public static String getTypeDeclaration(TypeToken<?> type) {

    if (type.isArray()) return getTypeDeclaration(type.getComponentType()) + "[]";
    if (type.isPrimitive()) return type.getRawType().toString();

```

### UnstableApiUsage
'isPrimitive()' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `src/main/java/org/assertj/assertions/generator/util/ClassUtil.java`
#### Snippet
```java

    if (type.isArray()) return getTypeDeclaration(type.getComponentType()) + "[]";
    if (type.isPrimitive()) return type.getRawType().toString();

    Class<?> rawClass = type.getRawType();
```

### UnstableApiUsage
'getRawType()' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `src/main/java/org/assertj/assertions/generator/util/ClassUtil.java`
#### Snippet
```java

    if (type.isArray()) return getTypeDeclaration(type.getComponentType()) + "[]";
    if (type.isPrimitive()) return type.getRawType().toString();

    Class<?> rawClass = type.getRawType();
```

### UnstableApiUsage
'getRawType()' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `src/main/java/org/assertj/assertions/generator/util/ClassUtil.java`
#### Snippet
```java
    if (type.isPrimitive()) return type.getRawType().toString();

    Class<?> rawClass = type.getRawType();
    StringBuilder typeDeclaration = new StringBuilder("");
    // Now we have some types that could be generic, so we have to do more to serialize it to the declaration
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/assertions/generator/util/ClassUtil.java`
#### Snippet
```java
    if (rawClass.isMemberClass()) {
      // inner class
      TypeToken<?> outerType = type.resolveType(rawClass.getEnclosingClass());
      typeDeclaration.append(getTypeDeclaration(outerType))
                     .append(".")
```

### UnstableApiUsage
'resolveType(java.lang.reflect.Type)' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `src/main/java/org/assertj/assertions/generator/util/ClassUtil.java`
#### Snippet
```java
    if (rawClass.isMemberClass()) {
      // inner class
      TypeToken<?> outerType = type.resolveType(rawClass.getEnclosingClass());
      typeDeclaration.append(getTypeDeclaration(outerType))
                     .append(".")
```

### UnstableApiUsage
'getType()' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `src/main/java/org/assertj/assertions/generator/util/ClassUtil.java`
#### Snippet
```java
                     .append(".")
                     .append(rawClass.getSimpleName());
    } else if (type.getType() instanceof TypeVariable) {
      // used to get generic type parameter real name (ex T instead of having Object)
      // TODO: should we do a recursive type inference ?
```

### UnstableApiUsage
'getType()' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `src/main/java/org/assertj/assertions/generator/util/ClassUtil.java`
#### Snippet
```java
      // TODO: should we do a recursive type inference ?
      @SuppressWarnings("unchecked")
      TypeVariable<GenericDeclaration> typeVariable = (TypeVariable<GenericDeclaration>) type.getType();
      String name = typeVariable.getName();
      name = removeAll(name, "capture#\\d+-of\\s+");
```

### UnstableApiUsage
'getRawType()' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `src/main/java/org/assertj/assertions/generator/util/ClassUtil.java`
#### Snippet
```java
    } else if (!isJavaLangType(type)) {
      // it's a normal class but not in java.lang => add the package name
      typeDeclaration.append(type.getRawType().getPackage().getName())
                     .append(".")
                     .append(rawClass.getSimpleName());
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/assertions/generator/util/ClassUtil.java`
#### Snippet
```java
   * @throws RuntimeException if any error occurs
   */
  public static Set<TypeToken<?>> collectClasses(ClassLoader classLoader, String... classOrPackageNames) {
    return collectClasses(classLoader, false, classOrPackageNames);
  }
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/assertions/generator/util/ClassUtil.java`
#### Snippet
```java
   *
   * @param type type
   * @see #isJavaLangType(TypeToken)
   */
  public static boolean isJavaLangType(Type type) {
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/assertions/generator/util/ClassUtil.java`
#### Snippet
```java
   */
  public static boolean isJavaLangType(Type type) {
    return isJavaLangType(TypeToken.of(type));
  }

```

### UnstableApiUsage
'of(java.lang.reflect.Type)' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `src/main/java/org/assertj/assertions/generator/util/ClassUtil.java`
#### Snippet
```java
   */
  public static boolean isJavaLangType(Type type) {
    return isJavaLangType(TypeToken.of(type));
  }

```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/assertions/generator/BaseAssertionGenerator.java`
#### Snippet
```java
  @Override
  public File[] generateHierarchicalCustomAssertionFor(ClassDescription classDescription,
                                                       Set<TypeToken<?>> allClasses) throws IOException {
    // Assertion content
    String[] assertionFileContent = generateHierarchicalCustomAssertionContentFor(classDescription, allClasses);
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/assertions/generator/BaseAssertionGenerator.java`
#### Snippet
```java
                                                           .compile("(?m)^public class[\\s]+(?<CLASSNAME>\\p{javaJavaIdentifierStart}\\p{javaJavaIdentifierPart}*)\\b");

  private static final Set<TypeToken<?>> EMPTY_HIERARCHY = new HashSet<>();

  private static final String NON_PUBLIC_FIELD_VALUE_EXTRACTION = "org.assertj.core.util.introspection.FieldSupport.EXTRACTION.fieldValue(\"%s\", %s.class, actual)";
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/assertions/generator/BaseAssertionGenerator.java`
#### Snippet
```java

  private String fillAbstractAssertClassTemplate(String abstractAssertClassTemplate, ClassDescription classDescription,
                                                 Set<TypeToken<?>> classes) {
    return fillAssertClassTemplate(abstractAssertClassTemplate, classDescription, classes, false);
  }
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/assertions/generator/BaseAssertionGenerator.java`
#### Snippet
```java
    StringBuilder throwsJavaDoc = new StringBuilder();
    boolean first = true;
    for (TypeToken<?> exception : getter.getExceptions()) {
      if (first) throwsClause.append("throws ");
      else throwsClause.append(", ");
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/assertions/generator/BaseAssertionGenerator.java`
#### Snippet
```java

  private String fillAssertClassTemplate(String template, ClassDescription classDescription,
                                         Set<TypeToken<?>> classesHierarchy, boolean concrete) {
    // Add any AssertJ needed imports only, other types are used with their fully qualified names to avoid a compilation
    // error when two types have the same name.
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `src/main/java/org/assertj/assertions/generator/BaseAssertionGenerator.java`
#### Snippet
```java
  @Override
  public String[] generateHierarchicalCustomAssertionContentFor(ClassDescription classDescription,
                                                                Set<TypeToken<?>> classes) {
    // use abstract class template first
    String abstractAssertClassContent = templateRegistry.getTemplate(ABSTRACT_ASSERT_CLASS).getContent();
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `src/main/java/org/assertj/assertions/generator/BaseAssertionGenerator.java`
#### Snippet
```java
    // Ignore the result as it only returns true iff the dir was created, false is not bad.
    File directory = new File(directoryName);
    if (!directory.exists()) directory.mkdirs();
  }

```

