# directory-scimple 
 
# Bad smells
I found 266 bad smells with 25 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| BoundedWildcard | 43 | false |
| ReturnNull | 33 | false |
| DynamicRegexReplaceableByCompiledPattern | 20 | false |
| Lombok | 18 | false |
| FieldMayBeStatic | 11 | false |
| RegExpRedundantEscape | 10 | false |
| UnnecessarySemicolon | 9 | false |
| NonSerializableFieldInSerializableClass | 9 | false |
| RedundantFieldInitialization | 9 | false |
| AssignmentToMethodParameter | 9 | false |
| UNUSED_IMPORT | 8 | false |
| UnnecessaryFullyQualifiedName | 7 | false |
| UnnecessaryLocalVariable | 7 | true |
| ConditionCoveredByFurtherCondition | 6 | false |
| NonProtectedConstructorInAbstractClass | 6 | true |
| TypeParameterHidesVisibleType | 5 | false |
| CommentedOutCode | 5 | false |
| SizeReplaceableByIsEmpty | 5 | true |
| UnnecessaryModifier | 4 | true |
| DefaultAnnotationParam | 4 | false |
| ConstantValue | 4 | false |
| MissortedModifiers | 3 | false |
| RedundantImplements | 3 | false |
| UnusedAssignment | 3 | false |
| IOResource | 2 | false |
| RedundantCollectionOperation | 2 | false |
| DuplicateExpressions | 2 | false |
| InnerClassMayBeStatic | 2 | true |
| DuplicateThrows | 2 | false |
| WrapperTypeMayBePrimitive | 1 | false |
| UtilityClassWithoutPrivateConstructor | 1 | true |
| DataFlowIssue | 1 | false |
| Convert2MethodRef | 1 | false |
| IgnoreResultOfCall | 1 | false |
| UnnecessaryBoxing | 1 | false |
| SystemOutErr | 1 | false |
| MalformedFormatString | 1 | false |
| UnnecessarySuperQualifier | 1 | false |
| SamePackageImport | 1 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 1 | false |
| StringRepeatCanBeUsed | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| AssignmentToLambdaParameter | 1 | false |
| NonFinalFieldOfException | 1 | false |
## RuleId[id=IOResource]
### IOResource
'ObjectOutputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `scim-server/src/main/java/org/apache/directory/scim/server/rest/AttributeUtil.java`
#### Snippet
```java
    try {
    ByteArrayOutputStream boas = new ByteArrayOutputStream();
    ObjectOutputStream oos = new ObjectOutputStream(boas);
    oos.writeObject(original);

```

### IOResource
'ObjectInputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `scim-server/src/main/java/org/apache/directory/scim/server/rest/AttributeUtil.java`
#### Snippet
```java

    ByteArrayInputStream bais = new ByteArrayInputStream(boas.toByteArray());
    ObjectInputStream ois = new ObjectInputStream(bais);
    return (T) ois.readObject();
    } catch (ClassNotFoundException e) {
```

## RuleId[id=WrapperTypeMayBePrimitive]
### WrapperTypeMayBePrimitive
Type may be primitive
in `scim-client/src/main/java/org/apache/directory/scim/client/rest/RestClientUtil.java`
#### Snippet
```java
    
    String[] uriParts = location.split("/");
    Integer nbrParts = uriParts.length;
    return Optional.of(uriParts[nbrParts - 1]);
  }
```

## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `scim-spec/scim-spec-protocol/src/main/java/org/apache/directory/scim/protocol/SelfResource.java`
#### Snippet
```java
public interface SelfResource {

  public static final String PATH = "Me";

  /**
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `scim-spec/scim-spec-protocol/src/main/java/org/apache/directory/scim/protocol/SelfResource.java`
#### Snippet
```java
public interface SelfResource {

  public static final String PATH = "Me";

  /**
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `scim-spec/scim-spec-protocol/src/main/java/org/apache/directory/scim/protocol/SelfResource.java`
#### Snippet
```java
public interface SelfResource {

  public static final String PATH = "Me";

  /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/filter/ValueFilterExpression.java`
#### Snippet
```java
public interface ValueFilterExpression {

  public String toFilter();

}
```

## RuleId[id=FieldMayBeStatic]
### FieldMayBeStatic
Field `ISUB_PREFIX` may be 'static'
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/resources/PhoneNumber.java`
#### Snippet
```java
    final String PREFIX = "tel:%s";
    final String EXTENSTION_PREFIX = ";ext=%s";
    final String ISUB_PREFIX = ";isub=%s";
    final String CONTEXT_PREFIX = ";phone-context=%s";
    final String PARAMS_STRING = ";%s=%s";
```

### FieldMayBeStatic
Field `GLOBAL_NUMBER_REGEX` may be 'static'
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/resources/PhoneNumber.java`
#### Snippet
```java
    final String LOCAL_SUBSCRIBER_NUMBER_REGEX = "^[\\d\\.\\-\\(\\)]+$";
    final String DOMAIN_NAME_REGEX = "^[a-zA-Z0-9\\.\\-]+$";
    final String GLOBAL_NUMBER_REGEX = "^(\\+)?[\\d\\.\\-\\(\\)]+$";
    final String COUNTRY_CODE_REGEX = "^(\\+)?[1-9][0-9]{0,2}$";

```

### FieldMayBeStatic
Field `HYPHEN` may be 'static'
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/resources/PhoneNumber.java`
#### Snippet
```java
    static final Logger LOGGER = LoggerFactory.getLogger(PhoneNumberBuilder.class);

    final String HYPHEN = "-";
    final String INTERNATIONAL_PREFIX = "+";
    final String PREFIX = "tel:%s";
```

### FieldMayBeStatic
Field `INTERNATIONAL_PREFIX` may be 'static'
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/resources/PhoneNumber.java`
#### Snippet
```java

    final String HYPHEN = "-";
    final String INTERNATIONAL_PREFIX = "+";
    final String PREFIX = "tel:%s";
    final String EXTENSTION_PREFIX = ";ext=%s";
```

### FieldMayBeStatic
Field `COUNTRY_CODE_REGEX` may be 'static'
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/resources/PhoneNumber.java`
#### Snippet
```java
    final String DOMAIN_NAME_REGEX = "^[a-zA-Z0-9\\.\\-]+$";
    final String GLOBAL_NUMBER_REGEX = "^(\\+)?[\\d\\.\\-\\(\\)]+$";
    final String COUNTRY_CODE_REGEX = "^(\\+)?[1-9][0-9]{0,2}$";

    String number;
```

### FieldMayBeStatic
Field `EXTENSTION_PREFIX` may be 'static'
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/resources/PhoneNumber.java`
#### Snippet
```java
    final String INTERNATIONAL_PREFIX = "+";
    final String PREFIX = "tel:%s";
    final String EXTENSTION_PREFIX = ";ext=%s";
    final String ISUB_PREFIX = ";isub=%s";
    final String CONTEXT_PREFIX = ";phone-context=%s";
```

### FieldMayBeStatic
Field `DOMAIN_NAME_REGEX` may be 'static'
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/resources/PhoneNumber.java`
#### Snippet
```java
    final String PARAMS_STRING = ";%s=%s";
    final String LOCAL_SUBSCRIBER_NUMBER_REGEX = "^[\\d\\.\\-\\(\\)]+$";
    final String DOMAIN_NAME_REGEX = "^[a-zA-Z0-9\\.\\-]+$";
    final String GLOBAL_NUMBER_REGEX = "^(\\+)?[\\d\\.\\-\\(\\)]+$";
    final String COUNTRY_CODE_REGEX = "^(\\+)?[1-9][0-9]{0,2}$";
```

### FieldMayBeStatic
Field `PARAMS_STRING` may be 'static'
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/resources/PhoneNumber.java`
#### Snippet
```java
    final String ISUB_PREFIX = ";isub=%s";
    final String CONTEXT_PREFIX = ";phone-context=%s";
    final String PARAMS_STRING = ";%s=%s";
    final String LOCAL_SUBSCRIBER_NUMBER_REGEX = "^[\\d\\.\\-\\(\\)]+$";
    final String DOMAIN_NAME_REGEX = "^[a-zA-Z0-9\\.\\-]+$";
```

### FieldMayBeStatic
Field `PREFIX` may be 'static'
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/resources/PhoneNumber.java`
#### Snippet
```java
    final String HYPHEN = "-";
    final String INTERNATIONAL_PREFIX = "+";
    final String PREFIX = "tel:%s";
    final String EXTENSTION_PREFIX = ";ext=%s";
    final String ISUB_PREFIX = ";isub=%s";
```

### FieldMayBeStatic
Field `CONTEXT_PREFIX` may be 'static'
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/resources/PhoneNumber.java`
#### Snippet
```java
    final String EXTENSTION_PREFIX = ";ext=%s";
    final String ISUB_PREFIX = ";isub=%s";
    final String CONTEXT_PREFIX = ";phone-context=%s";
    final String PARAMS_STRING = ";%s=%s";
    final String LOCAL_SUBSCRIBER_NUMBER_REGEX = "^[\\d\\.\\-\\(\\)]+$";
```

### FieldMayBeStatic
Field `LOCAL_SUBSCRIBER_NUMBER_REGEX` may be 'static'
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/resources/PhoneNumber.java`
#### Snippet
```java
    final String CONTEXT_PREFIX = ";phone-context=%s";
    final String PARAMS_STRING = ";%s=%s";
    final String LOCAL_SUBSCRIBER_NUMBER_REGEX = "^[\\d\\.\\-\\(\\)]+$";
    final String DOMAIN_NAME_REGEX = "^[a-zA-Z0-9\\.\\-]+$";
    final String GLOBAL_NUMBER_REGEX = "^(\\+)?[\\d\\.\\-\\(\\)]+$";
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `ObjectMapperFactory` has only 'static' members, and lacks a 'private' constructor
in `scim-core/src/main/java/org/apache/directory/scim/core/json/ObjectMapperFactory.java`
#### Snippet
```java
 * Creates and configures an {@link ObjectMapper} used for {@code application/scim+json} parsing.
 */
public class ObjectMapperFactory {

  private final static ObjectMapper objectMapper = createObjectMapper();
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `schema` may produce `NullPointerException`
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/schema/Schemas.java`
#### Snippet
```java

    log.debug("calling set attributes with " + fieldList.size() + " fields");
    String urn = set != null ? set.id() : srt.schema();
    Set<String> invalidAttributes = new HashSet<>();
    List<Schema.Attribute> createAttributes = createAttributes(urn, fieldList, invalidAttributes, clazz.getSimpleName());
```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `scim-spec/scim-spec-protocol/src/main/java/org/apache/directory/scim/protocol/data/BulkOperation.java`
#### Snippet
```java
    @XmlEnumValue("PUT") PUT,
    @XmlEnumValue("PATCH") PATCH,
    @XmlEnumValue("DELETE") DELETE;
  }
  
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/filter/LogicalOperator.java`
#### Snippet
```java
  
  AND,
  OR;
}

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/schema/ResourceReference.java`
#### Snippet
```java
    @XmlEnumValue("indirect") INDIRECT,
    @XmlEnumValue("User") USER,
    @XmlEnumValue("Group") GROUP;
  }
  
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/filter/CompareOperator.java`
#### Snippet
```java
  GE, // greater than or equal
  LT, // greater than
  LE; // greater than or equal
}

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/patch/PatchOperation.java`
#### Snippet
```java
    @XmlEnumValue("add") ADD,
    @XmlEnumValue("remove") REMOVE,
    @XmlEnumValue("replace") REPLACE;
  }
  
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/schema/Schema.java`
#### Snippet
```java
      @XmlEnumValue("default") DEFAULT,
      @XmlEnumValue("never") NEVER,
      @XmlEnumValue("request") REQUEST;
    }

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/schema/Schema.java`
#### Snippet
```java
      @XmlEnumValue("global") GLOBAL,
      @XmlEnumValue("none") NONE,
      @XmlEnumValue("server") SERVER;
    }
    
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/schema/Schema.java`
#### Snippet
```java
      @XmlEnumValue("integer") INTEGER,
      @XmlEnumValue("reference") REFERENCE,
      @XmlEnumValue("string") STRING;
    }

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/schema/Schema.java`
#### Snippet
```java
      @XmlEnumValue("readOnly") READ_ONLY,
      @XmlEnumValue("readWrite") READ_WRITE,
      @XmlEnumValue("writeOnly") WRITE_ONLY;

    }
```

## RuleId[id=TypeParameterHidesVisibleType]
### TypeParameterHidesVisibleType
Type parameter `R` hides type parameter 'R'
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/filter/InMemoryScimFilterMatcher.java`
#### Snippet
```java
  }

  private class AttributeComparisonPredicate<R> extends AbstractAttributePredicate<AttributeComparisonExpression, R> {

    private AttributeComparisonPredicate(AttributeComparisonExpression expression, AttributeContainer attributeContainer) {
```

### TypeParameterHidesVisibleType
Type parameter `R` hides type parameter 'R'
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/filter/InMemoryScimFilterMatcher.java`
#### Snippet
```java
  }

  private abstract class AbstractAttributePredicate<T extends FilterExpression, R> implements Predicate<R> {

    final T expression;
```

### TypeParameterHidesVisibleType
Type parameter `R` hides type parameter 'R'
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/filter/InMemoryScimFilterMatcher.java`
#### Snippet
```java
  }

  private class AttributePresentPredicate<R> extends AbstractAttributePredicate<AttributePresentExpression, R> {
    private AttributePresentPredicate(AttributePresentExpression expression, AttributeContainer attributeContainer) {
      super(expression, attributeContainer, expression.getAttributePath());
```

### TypeParameterHidesVisibleType
Type parameter `R` hides type parameter 'R'
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/filter/InMemoryScimFilterMatcher.java`
#### Snippet
```java
  }

  private class ValuePathPredicate<R> extends AbstractAttributePredicate<ValuePathExpression, R> {

    final private Predicate<Object> nestedPredicate;
```

### TypeParameterHidesVisibleType
Type parameter `T` hides type parameter 'T'
in `scim-server/src/main/java/org/apache/directory/scim/server/rest/BaseResourceTypeResourceImpl.java`
#### Snippet
```java
  }

  private <T extends ScimResource> T attributesForDisplay(T resource, Set<AttributeReference> includedAttributes, Set<AttributeReference> excludedAttributes) throws AttributeException {
    if (!excludedAttributes.isEmpty()) {
      resource = attributeUtil.setExcludedAttributesForDisplay(resource, excludedAttributes);
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (7 lines)
in `scim-server/src/main/java/org/apache/directory/scim/server/rest/SelfResourceImpl.java`
#### Snippet
```java
  }

  // @Override
  // public Response create(ScimUser resource, AttributeReferenceListWrapper
  // attributes, AttributeReferenceListWrapper excludedAttributes) {
```

### CommentedOutCode
Commented out code (5 lines)
in `scim-core/src/main/java/org/apache/directory/scim/core/repository/UpdateRequest.java`
#### Snippet
```java
    }*/

    /*try {
      log.debug("Differences: " + objMapper.writerWithDefaultPrettyPrinter().writeValueAsString(differences));
    } catch (JsonProcessingException e) {
```

### CommentedOutCode
Commented out code (5 lines)
in `scim-core/src/main/java/org/apache/directory/scim/core/repository/UpdateRequest.java`
#### Snippet
```java
    List<PatchOperation> patchOps = convertToPatchOperations(differences);

    /*try {
      log.debug("Patch Ops: " + objMapper.writerWithDefaultPrettyPrinter().writeValueAsString(patchOps));
    } catch (JsonProcessingException e) {
```

### CommentedOutCode
Commented out code (11 lines)
in `scim-server/src/main/java/org/apache/directory/scim/server/rest/BulkResourceImpl.java`
#### Snippet
```java
  private static final Pattern PATH_PATTERN = Pattern.compile("^/[^/]+/[^/]+$");

//  static {
//    METHOD_NOT_ALLOWED_STATUS.setCode(METHOD_NOT_ALLOWED);
//    OKAY_STATUS.setCode(OKAY);
```

### CommentedOutCode
Commented out code (18 lines)
in `scim-server/src/main/java/org/apache/directory/scim/server/rest/BulkResourceImpl.java`
#### Snippet
```java
@ApplicationScoped
public class BulkResourceImpl implements BulkResource {
//  private static final StatusWrapper OKAY_STATUS = new StatusWrapper();
//  private static final StatusWrapper CREATED_STATUS = new StatusWrapper();
//  private static final StatusWrapper NO_CONTENT_STATUS = new StatusWrapper();
```

## RuleId[id=Convert2MethodRef]
### Convert2MethodRef
Lambda can be replaced with method reference
in `scim-server/src/main/java/org/apache/directory/scim/server/rest/AttributeUtil.java`
#### Snippet
```java

  private void removeAttributes(Object object, AttributeContainer attributeContainer, Set<Attribute> attributesToRemove) throws AttributeException {
    Function<Attribute, Boolean> function = (attribute) -> attributesToRemove.contains(attribute);
    processAttributes(object, attributeContainer, function);
  }
```

## RuleId[id=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/resources/PhoneNumber.java`
#### Snippet
```java
    final String LOCAL_SUBSCRIBER_NUMBER_REGEX = "^[\\d\\.\\-\\(\\)]+$";
    final String DOMAIN_NAME_REGEX = "^[a-zA-Z0-9\\.\\-]+$";
    final String GLOBAL_NUMBER_REGEX = "^(\\+)?[\\d\\.\\-\\(\\)]+$";
    final String COUNTRY_CODE_REGEX = "^(\\+)?[1-9][0-9]{0,2}$";

```

### RegExpRedundantEscape
Redundant character escape `\\(` in RegExp
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/resources/PhoneNumber.java`
#### Snippet
```java
    final String LOCAL_SUBSCRIBER_NUMBER_REGEX = "^[\\d\\.\\-\\(\\)]+$";
    final String DOMAIN_NAME_REGEX = "^[a-zA-Z0-9\\.\\-]+$";
    final String GLOBAL_NUMBER_REGEX = "^(\\+)?[\\d\\.\\-\\(\\)]+$";
    final String COUNTRY_CODE_REGEX = "^(\\+)?[1-9][0-9]{0,2}$";

```

### RegExpRedundantEscape
Redundant character escape `\\)` in RegExp
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/resources/PhoneNumber.java`
#### Snippet
```java
    final String LOCAL_SUBSCRIBER_NUMBER_REGEX = "^[\\d\\.\\-\\(\\)]+$";
    final String DOMAIN_NAME_REGEX = "^[a-zA-Z0-9\\.\\-]+$";
    final String GLOBAL_NUMBER_REGEX = "^(\\+)?[\\d\\.\\-\\(\\)]+$";
    final String COUNTRY_CODE_REGEX = "^(\\+)?[1-9][0-9]{0,2}$";

```

### RegExpRedundantEscape
Redundant character escape `\\(` in RegExp
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/resources/PhoneNumber.java`
#### Snippet
```java
  private static final long serialVersionUID = 607319505715224096L;

  private static final String VISUAL_SEPARATORS = "[\\(\\)\\-\\.]";

  private static final Logger log = LoggerFactory.getLogger(PhoneNumber.class);
```

### RegExpRedundantEscape
Redundant character escape `\\)` in RegExp
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/resources/PhoneNumber.java`
#### Snippet
```java
  private static final long serialVersionUID = 607319505715224096L;

  private static final String VISUAL_SEPARATORS = "[\\(\\)\\-\\.]";

  private static final Logger log = LoggerFactory.getLogger(PhoneNumber.class);
```

### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/resources/PhoneNumber.java`
#### Snippet
```java
  private static final long serialVersionUID = 607319505715224096L;

  private static final String VISUAL_SEPARATORS = "[\\(\\)\\-\\.]";

  private static final Logger log = LoggerFactory.getLogger(PhoneNumber.class);
```

### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/resources/PhoneNumber.java`
#### Snippet
```java
    final String PARAMS_STRING = ";%s=%s";
    final String LOCAL_SUBSCRIBER_NUMBER_REGEX = "^[\\d\\.\\-\\(\\)]+$";
    final String DOMAIN_NAME_REGEX = "^[a-zA-Z0-9\\.\\-]+$";
    final String GLOBAL_NUMBER_REGEX = "^(\\+)?[\\d\\.\\-\\(\\)]+$";
    final String COUNTRY_CODE_REGEX = "^(\\+)?[1-9][0-9]{0,2}$";
```

### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/resources/PhoneNumber.java`
#### Snippet
```java
    final String CONTEXT_PREFIX = ";phone-context=%s";
    final String PARAMS_STRING = ";%s=%s";
    final String LOCAL_SUBSCRIBER_NUMBER_REGEX = "^[\\d\\.\\-\\(\\)]+$";
    final String DOMAIN_NAME_REGEX = "^[a-zA-Z0-9\\.\\-]+$";
    final String GLOBAL_NUMBER_REGEX = "^(\\+)?[\\d\\.\\-\\(\\)]+$";
```

### RegExpRedundantEscape
Redundant character escape `\\(` in RegExp
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/resources/PhoneNumber.java`
#### Snippet
```java
    final String CONTEXT_PREFIX = ";phone-context=%s";
    final String PARAMS_STRING = ";%s=%s";
    final String LOCAL_SUBSCRIBER_NUMBER_REGEX = "^[\\d\\.\\-\\(\\)]+$";
    final String DOMAIN_NAME_REGEX = "^[a-zA-Z0-9\\.\\-]+$";
    final String GLOBAL_NUMBER_REGEX = "^(\\+)?[\\d\\.\\-\\(\\)]+$";
```

### RegExpRedundantEscape
Redundant character escape `\\)` in RegExp
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/resources/PhoneNumber.java`
#### Snippet
```java
    final String CONTEXT_PREFIX = ";phone-context=%s";
    final String PARAMS_STRING = ";%s=%s";
    final String LOCAL_SUBSCRIBER_NUMBER_REGEX = "^[\\d\\.\\-\\(\\)]+$";
    final String DOMAIN_NAME_REGEX = "^[a-zA-Z0-9\\.\\-]+$";
    final String GLOBAL_NUMBER_REGEX = "^(\\+)?[\\d\\.\\-\\(\\)]+$";
```

## RuleId[id=RedundantCollectionOperation]
### RedundantCollectionOperation
`contains` can be replaced with 'Map.containsValue()'
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/resources/PhoneNumber.java`
#### Snippet
```java

      if (params != null && !params.isEmpty()) {
        if (params.get("") != null || params.get(null) != null || params.values().contains(null) || params.values().contains("")) {
          throw new IllegalArgumentException("PhoneNumberBuilder params names and values cannot be null or empty.");
        }
```

### RedundantCollectionOperation
`contains` can be replaced with 'Map.containsValue()'
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/resources/PhoneNumber.java`
#### Snippet
```java

      if (params != null && !params.isEmpty()) {
        if (params.get("") != null || params.get(null) != null || params.values().contains(null) || params.values().contains("")) {
          throw new IllegalArgumentException("PhoneNumberBuilder params names and values cannot be null or empty.");
        }
```

## RuleId[id=NonSerializableFieldInSerializableClass]
### NonSerializableFieldInSerializableClass
Non-serializable field 'filter' in a Serializable class
in `scim-spec/scim-spec-protocol/src/main/java/org/apache/directory/scim/protocol/data/SearchRequest.java`
#### Snippet
```java
  @XmlElement
  @XmlJavaTypeAdapter(FilterAdapter.class)
  Filter filter;

  @XmlElement
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'patch' in a Serializable class
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/schema/ServiceProviderConfiguration.java`
#### Snippet
```java

  @XmlElement
  SupportedConfiguration patch;

  @XmlElement
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'sort' in a Serializable class
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/schema/ServiceProviderConfiguration.java`
#### Snippet
```java

  @XmlElement
  SupportedConfiguration sort;

  @XmlElement
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'changePassword' in a Serializable class
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/schema/ServiceProviderConfiguration.java`
#### Snippet
```java

  @XmlElement
  SupportedConfiguration changePassword;

  @XmlElement
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'bulk' in a Serializable class
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/schema/ServiceProviderConfiguration.java`
#### Snippet
```java

  @XmlElement
  BulkConfiguration bulk;

  @XmlElement
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'etag' in a Serializable class
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/schema/ServiceProviderConfiguration.java`
#### Snippet
```java

  @XmlElement
  SupportedConfiguration etag;

  @XmlElement
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'filter' in a Serializable class
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/schema/ServiceProviderConfiguration.java`
#### Snippet
```java

  @XmlElement
  FilterConfiguration filter;

  @XmlElement
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'schemaRegistry' in a Serializable class
in `scim-core/src/main/java/org/apache/directory/scim/core/json/ObjectMapperFactory.java`
#### Snippet
```java
  static class ScimResourceModule extends SimpleModule {

    private final SchemaRegistry schemaRegistry;

    public ScimResourceModule(SchemaRegistry schemaRegistry) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'schemaRegistry' in a Serializable class
in `scim-core/src/main/java/org/apache/directory/scim/core/json/ScimResourceDeserializer.java`
#### Snippet
```java

public class ScimResourceDeserializer extends StdDeserializer<ScimResource> {
  private final SchemaRegistry schemaRegistry;

  public ScimResourceDeserializer(SchemaRegistry schemaRegistry) {
```

## RuleId[id=DuplicateExpressions]
### DuplicateExpressions
Multiple occurrences of `actualValue.toString().equalsIgnoreCase(compareValue.toString())`
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/filter/InMemoryScimFilterMatcher.java`
#### Snippet
```java

        if (isStringExpression(attribute, compareValue) && !attribute.isCaseExact()) {
          return actualValue.toString().equalsIgnoreCase(compareValue.toString());
        }
        return compareValue.equals(actualValue);
```

### DuplicateExpressions
Multiple occurrences of `actualValue.toString().equalsIgnoreCase(compareValue.toString())`
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/filter/InMemoryScimFilterMatcher.java`
#### Snippet
```java
      if (op == CompareOperator.NE) {
        if (isStringExpression(attribute, compareValue) && !attribute.isCaseExact()) {
          return !actualValue.toString().equalsIgnoreCase(compareValue.toString());
        }
        return !compareValue.equals(actualValue);
```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`expressionStack.size() == 0` can be replaced with 'expressionStack.isEmpty()'
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/filter/ExpressionBuildingListener.java`
#### Snippet
```java
    String parentAttributeName = attributeReference.getAttributeName();

    if (expressionStack.size() == 0) {
      throw new IllegalStateException("Invalid Expression " + ctx.attributePath);
    }
```

### SizeReplaceableByIsEmpty
`localCode.length() > 0` can be replaced with '!localCode.isEmpty()'
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/resources/PhoneNumber.java`
#### Snippet
```java
      if (localCode != null && !localCode.isEmpty()) {
        localCode = localCode.trim();
        if (localCode.length() > 0 && localCode.charAt(0) != '+') {
          localCode = '+' + localCode;
        }
```

### SizeReplaceableByIsEmpty
`ar.size() == 0` can be replaced with 'ar.isEmpty()'
in `scim-core/src/main/java/org/apache/directory/scim/core/repository/UpdateRequest.java`
#### Snippet
```java
        if (childNode instanceof ArrayNode) {
          ArrayNode ar = (ArrayNode)childNode;
          if (ar.size() == 0) {
            objectsToDelete.add(name);
          }
```

### SizeReplaceableByIsEmpty
`subUnresolveds.size() > 0` can be replaced with '!subUnresolveds.isEmpty()'
in `scim-server/src/main/java/org/apache/directory/scim/server/rest/BulkResourceImpl.java`
#### Snippet
```java
          }

          if (subUnresolveds.size() > 0) {
            UnresolvedTopLevel unresolved = new UnresolvedTopLevelComplex(accessor, attributeFieldValue, subUnresolveds);

```

### SizeReplaceableByIsEmpty
`unresolvedTopLevels.size() > 0` can be replaced with '!unresolvedTopLevels.isEmpty()'
in `scim-server/src/main/java/org/apache/directory/scim/server/rest/BulkResourceImpl.java`
#### Snippet
```java
      }
    }
    if (unresolvedTopLevels.size() > 0) {
      String bulkIdKey = "bulkId:" + bulkOperationResult.getBulkId();

```

## RuleId[id=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `RemoveOperationHandler` may be 'static'
in `scim-core/src/main/java/org/apache/directory/scim/core/repository/PatchHandlerImpl.java`
#### Snippet
```java
  }

  private class RemoveOperationHandler implements PatchOperationHandler {

    @Override
```

### InnerClassMayBeStatic
Inner class `ReplaceOperationHandler` may be 'static'
in `scim-core/src/main/java/org/apache/directory/scim/core/repository/PatchHandlerImpl.java`
#### Snippet
```java
  }

  private class ReplaceOperationHandler implements PatchOperationHandler {

    @Override
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends ScimGroup`
in `scim-server-examples/scim-server-jersey/src/main/java/org/apache/directory/scim/example/jersey/service/InMemoryGroupService.java`
#### Snippet
```java

  @Override
  public ScimGroup update(UpdateRequest<ScimGroup> updateRequest) throws UnableToUpdateResourceException {
    String id = updateRequest.getId();
    ScimGroup resource = updateRequest.getResource();
```

### BoundedWildcard
Can generalize to `? extends ScimUser`
in `scim-server-examples/scim-server-jersey/src/main/java/org/apache/directory/scim/example/jersey/service/InMemoryUserService.java`
#### Snippet
```java
   */
  @Override
  public ScimUser update(UpdateRequest<ScimUser> updateRequest) throws UnableToUpdateResourceException {
    String id = updateRequest.getId();
    ScimUser resource = updateRequest.getResource();
```

### BoundedWildcard
Can generalize to `? extends ScimGroup`
in `scim-server-examples/scim-server-spring-boot/src/main/java/org/apache/directory/scim/example/spring/service/InMemoryGroupService.java`
#### Snippet
```java

  @Override
  public ScimGroup update(UpdateRequest<ScimGroup> updateRequest) throws UnableToUpdateResourceException {
    String id = updateRequest.getId();
    ScimGroup resource = updateRequest.getResource();
```

### BoundedWildcard
Can generalize to `? extends SelfIdResolver`
in `scim-server/src/main/java/org/apache/directory/scim/server/rest/SelfResourceImpl.java`
#### Snippet
```java

  @Inject
  public SelfResourceImpl(UserResource userResource, Instance<SelfIdResolver> selfIdResolver, RequestContext requestContext) {
    this.userResource = userResource;
    this.selfIdResolver = selfIdResolver;
```

### BoundedWildcard
Can generalize to `? extends ScimUser`
in `scim-server-examples/scim-server-spring-boot/src/main/java/org/apache/directory/scim/example/spring/service/InMemoryUserService.java`
#### Snippet
```java
   */
  @Override
  public ScimUser update(UpdateRequest<ScimUser> updateRequest) throws UnableToUpdateResourceException {
    String id = updateRequest.getId();
    ScimUser resource = updateRequest.getResource();
```

### BoundedWildcard
Can generalize to `? extends T`
in `scim-client/src/main/java/org/apache/directory/scim/client/rest/RestClientUtil.java`
#### Snippet
```java
   * @throws RestException
   */
  public static <T> Optional<T> readEntity(Response response, GenericType<T> entityType) throws RestException, ProcessingException, IllegalStateException{
    return readEntity(response, entityType, response::readEntity, Optional::of);
  }
```

### BoundedWildcard
Can generalize to `? extends T`
in `scim-client/src/main/java/org/apache/directory/scim/client/rest/RestClientUtil.java`
#### Snippet
```java
   * @throws RestException
   */
  public <T> Optional<T> tryReadEntity(Response response, Class<T> entityType) throws RestException, ProcessingException, IllegalStateException{
    return readEntity(response, entityType, response::readEntity, Optional::ofNullable);
  }
```

### BoundedWildcard
Can generalize to `? extends T`
in `scim-client/src/main/java/org/apache/directory/scim/client/rest/RestClientUtil.java`
#### Snippet
```java
   * @throws RestException
   */
  public <T> Optional<T> tryReadEntity(Response response, GenericType<T> entityType) throws RestException, ProcessingException, IllegalStateException {
    return readEntity(response, entityType, response::readEntity, Optional::ofNullable);
  }
```

### BoundedWildcard
Can generalize to `? extends T`
in `scim-client/src/main/java/org/apache/directory/scim/client/rest/RestClientUtil.java`
#### Snippet
```java
   * @throws RestException
   */
  public static <T> Optional<T> readEntity(Response response, Class<T> entityType) throws RestException, ProcessingException, IllegalStateException{
    return readEntity(response, entityType, response::readEntity, Optional::of);
  }
```

### BoundedWildcard
Can generalize to `? extends E`
in `scim-client/src/main/java/org/apache/directory/scim/client/rest/RestClientUtil.java`
#### Snippet
```java
  }

  private static <T, E> Optional<E> readEntity(Response response, T entityType, Function<T, E> readEntity, Function<E, Optional<E>> optionalOf) throws RestException, ProcessingException, IllegalStateException{
    Optional<E> result;

```

### BoundedWildcard
Can generalize to `? super E`
in `scim-client/src/main/java/org/apache/directory/scim/client/rest/RestClientUtil.java`
#### Snippet
```java
  }

  private static <T, E> Optional<E> readEntity(Response response, T entityType, Function<T, E> readEntity, Function<E, Optional<E>> optionalOf) throws RestException, ProcessingException, IllegalStateException{
    Optional<E> result;

```

### BoundedWildcard
Can generalize to `? super Throwable`
in `scim-client/src/main/java/org/apache/directory/scim/client/rest/RestClientUtil.java`
#### Snippet
```java
   * @param consumer
   */
  public static void close(Response response, Consumer<Throwable> consumer) {
    try {
      response.close();
```

### BoundedWildcard
Can generalize to `? extends ScimGroup`
in `scim-server-examples/scim-server-memory/src/main/java/org/apache/directory/scim/example/memory/service/InMemoryGroupService.java`
#### Snippet
```java

  @Override
  public ScimGroup update(UpdateRequest<ScimGroup> updateRequest) throws UnableToUpdateResourceException {
    String id = updateRequest.getId();
    ScimGroup resource = updateRequest.getResource();
```

### BoundedWildcard
Can generalize to `? extends ScimUser`
in `scim-server-examples/scim-server-memory/src/main/java/org/apache/directory/scim/example/memory/service/InMemoryUserService.java`
#### Snippet
```java
   */
  @Override
  public ScimUser update(UpdateRequest<ScimUser> updateRequest) throws UnableToUpdateResourceException {
    String id = updateRequest.getId();
    ScimUser resource = updateRequest.getResource();
```

### BoundedWildcard
Can generalize to `? super String`
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/schema/Schemas.java`
#### Snippet
```java


  private static List<Schema.Attribute> createAttributes(String urn, List<Field> fieldList, Set<String> invalidAttributes, String nameBase) throws ScimResourceInvalidException {
    List<Schema.Attribute> attributeList = new ArrayList<>();

```

### BoundedWildcard
Can generalize to `? super T`
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/filter/InMemoryScimFilterMatcher.java`
#### Snippet
```java


    private CompareOperatorPredicate(CompareOperator op, T comparedValue, Comparator<T> comparator) {
      this.op = op;
      this.comparator = comparator;
```

### BoundedWildcard
Can generalize to `? extends T`
in `scim-core/src/main/java/org/apache/directory/scim/core/repository/RepositoryRegistry.java`
#### Snippet
```java
  }

  public synchronized <T extends ScimResource> void registerRepository(Class<T> clazz, Repository<T> repository) throws InvalidRepositoryException {
    List<Class<? extends ScimExtension>> extensionList = repository.getExtensionList();

```

### BoundedWildcard
Can generalize to `? extends Repository`
in `scim-core/src/main/java/org/apache/directory/scim/core/spi/ScimpleComponents.java`
#### Snippet
```java
  @Produces
  @ApplicationScoped
  public RepositoryRegistry repositoryRegistry(SchemaRegistry schemaRegistry, Instance<Repository<? extends ScimResource>> repositoryInstances) {
    return new RepositoryRegistry(schemaRegistry, repositoryInstances.stream().collect(Collectors.toList()));
  }
```

### BoundedWildcard
Can generalize to `? super Attribute`
in `scim-server/src/main/java/org/apache/directory/scim/server/rest/AttributeUtil.java`
#### Snippet
```java
  }

  private void processAttributes(Object object, AttributeContainer attributeContainer, Function<Attribute, Boolean> function) throws AttributeException {
    try {
      if (attributeContainer != null && object != null) {
```

### BoundedWildcard
Can generalize to `? extends AttributeReference`
in `scim-server/src/main/java/org/apache/directory/scim/server/rest/AttributeUtil.java`
#### Snippet
```java
  }

  private Set<Attribute> resolveAttributeReferences(Set<AttributeReference> attributeReferences, boolean includeAttributeChain) throws AttributeDoesNotExistException {
    Set<Attribute> attributes = new HashSet<>();

```

### BoundedWildcard
Can generalize to `? extends T`
in `scim-client/src/main/java/org/apache/directory/scim/client/rest/BaseScimClient.java`
#### Snippet
```java
  private RestCall invoke = Invocation::invoke;

  public BaseScimClient(Client client, String baseUrl, Class<T> scimResourceClass, GenericType<ListResponse<T>> scimResourceListGenericType) {
    ScimResourceType scimResourceType = scimResourceClass.getAnnotation(ScimResourceType.class);
    String endpoint = scimResourceType != null ? scimResourceType.endpoint() : null;
```

### BoundedWildcard
Can generalize to `? extends ListResponse`
in `scim-client/src/main/java/org/apache/directory/scim/client/rest/BaseScimClient.java`
#### Snippet
```java
  private RestCall invoke = Invocation::invoke;

  public BaseScimClient(Client client, String baseUrl, Class<T> scimResourceClass, GenericType<ListResponse<T>> scimResourceListGenericType) {
    ScimResourceType scimResourceType = scimResourceClass.getAnnotation(ScimResourceType.class);
    String endpoint = scimResourceType != null ? scimResourceType.endpoint() : null;
```

### BoundedWildcard
Can generalize to `? extends Attribute`
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/schema/Schema.java`
#### Snippet
```java
  }
  
  public void setAttributes(List<Attribute> attributes) {
    attributeNamesMap.clear();
    
```

### BoundedWildcard
Can generalize to `? super T`
in `scim-server/src/main/java/org/apache/directory/scim/server/rest/BaseResourceTypeResourceImpl.java`
#### Snippet
```java
  }

  private Response update(String id, AttributeReferenceListWrapper attributes, AttributeReferenceListWrapper excludedAttributes, Function<T, UpdateRequest<T>> updateRequestFunction) throws ScimException, ResourceException {

    Repository<T> repository = getRepositoryInternal();
```

### BoundedWildcard
Can generalize to `? extends UpdateRequest`
in `scim-server/src/main/java/org/apache/directory/scim/server/rest/BaseResourceTypeResourceImpl.java`
#### Snippet
```java
  }

  private Response update(String id, AttributeReferenceListWrapper attributes, AttributeReferenceListWrapper excludedAttributes, Function<T, UpdateRequest<T>> updateRequestFunction) throws ScimException, ResourceException {

    Repository<T> repository = getRepositoryInternal();
```

### BoundedWildcard
Can generalize to `? super String`
in `scim-core/src/main/java/org/apache/directory/scim/core/repository/PatchHandlerImpl.java`
#### Snippet
```java

    @Override
    public void applySingleValue(Map<String, Object> sourceAsMap, Attribute attribute, AttributeReference attributeReference, Object value) {
      if (attributeReference.hasSubAttribute()) {
        Map<String, Object> parentValue = (Map<String, Object>) sourceAsMap.get(attributeReference.getAttributeName());
```

### BoundedWildcard
Can generalize to `? super String`
in `scim-core/src/main/java/org/apache/directory/scim/core/repository/PatchHandlerImpl.java`
#### Snippet
```java

    @Override
    public <T extends ScimResource> void applyExtensionValue(T source, Map<String, Object> sourceAsMap, Schema schema, Attribute attribute, ValuePathExpression valuePathExpression, String urn, Object value) {

      // add the extension URN
```

### BoundedWildcard
Can generalize to `? super String`
in `scim-core/src/main/java/org/apache/directory/scim/core/repository/PatchHandlerImpl.java`
#### Snippet
```java

    @Override
    public <T extends ScimResource> void applyMultiValue(T source, Map<String, Object> sourceAsMap, Schema schema, Attribute attribute, AttributeReference attributeReference, Object value) {

      Collection<Object> items = (Collection<Object>) sourceAsMap.get(attributeReference.getAttributeName());
```

### BoundedWildcard
Can generalize to `? extends PatchOperation`
in `scim-core/src/main/java/org/apache/directory/scim/core/repository/PatchHandlerImpl.java`
#### Snippet
```java

  @Override
  public <T extends ScimResource> T apply(final T original, final List<PatchOperation> patchOperations) {
    if (original == null) {
      throw new UnsupportedFilterException("Original resource is null. Cannot apply patch.");
```

### BoundedWildcard
Can generalize to `? extends Map`
in `scim-core/src/main/java/org/apache/directory/scim/core/repository/PatchHandlerImpl.java`
#### Snippet
```java
  }

  private static void checkPrimary(String subAttributeName, Collection<Map<String, Object>> items, Object value)
  {
    if (subAttributeName.equals(PRIMARY) && value.equals(true)) {
```

### BoundedWildcard
Can generalize to `? super String`
in `scim-core/src/main/java/org/apache/directory/scim/core/repository/PatchHandlerImpl.java`
#### Snippet
```java

    @Override
    public void applySingleValue(Map<String, Object> sourceAsMap, Attribute attribute, AttributeReference attributeReference, Object value) {
      String attributeName = attribute.getName();
      checkMutability(attribute, sourceAsMap.get(attributeName));
```

### BoundedWildcard
Can generalize to `? super String`
in `scim-core/src/main/java/org/apache/directory/scim/core/repository/PatchHandlerImpl.java`
#### Snippet
```java

    @Override
    public <T extends ScimResource> void applyMultiValue(T source, Map<String, Object> sourceAsMap, Schema schema, Attribute attribute, AttributeReference attributeReference, Object value) {
      checkMutability(attribute, sourceAsMap.get(attribute.getName()));
      // replace the collection
```

### BoundedWildcard
Can generalize to `? super String`
in `scim-core/src/main/java/org/apache/directory/scim/core/repository/PatchHandlerImpl.java`
#### Snippet
```java

    @Override
    public <T extends ScimResource> void applyMultiValue(T source, Map<String, Object> sourceAsMap, Schema schema, Attribute attribute, ValuePathExpression valuePathExpression, Object value) {

      String attributeName = valuePathExpression.getAttributePath().getAttributeName();
```

### BoundedWildcard
Can generalize to `? super String`
in `scim-core/src/main/java/org/apache/directory/scim/core/repository/PatchHandlerImpl.java`
#### Snippet
```java

    @Override
    public <T extends ScimResource> void applyMultiValue(T source, Map<String, Object> sourceAsMap, Schema schema, Attribute attribute, ValuePathExpression valuePathExpression, Object value) {

      String attributeName = attribute.getName();
```

### BoundedWildcard
Can generalize to `? super IWishJavaHadTuples`
in `scim-server/src/main/java/org/apache/directory/scim/server/rest/BulkResourceImpl.java`
#### Snippet
```java
   * @throws UnresolvableOperationException
   */
  private void resolveTopLevel(List<IWishJavaHadTuples> unresolveds, BulkOperation bulkOperationResult, Map<String, BulkOperation> bulkIdKeyToOperationResult) throws UnresolvableOperationException {
    ScimResource scimResource = bulkOperationResult.getData();
    String schemaUrn = scimResource.getBaseUrn();
```

### BoundedWildcard
Can generalize to `? extends BulkOperation`
in `scim-server/src/main/java/org/apache/directory/scim/server/rest/BulkResourceImpl.java`
#### Snippet
```java
    private final String bulkIdKey;

    public void resolve(Map<String, BulkOperation> bulkIdKeyToOperationResult) throws UnresolvableOperationException {
      BulkOperation resolvedOperation = bulkIdKeyToOperationResult.get(this.bulkIdKey);
      BaseResource response = resolvedOperation.getResponse();
```

### BoundedWildcard
Can generalize to `? super String`
in `scim-server/src/main/java/org/apache/directory/scim/server/rest/BulkResourceImpl.java`
#### Snippet
```java
  }

  private static void generateReverseDependenciesGraph(Map<String, Set<String>> reverseDependenciesGraph, String dependentBulkId, Object scimObject, List<Schema.Attribute> scimObjectAttributes) {
    for (Schema.Attribute scimObjectAttribute : scimObjectAttributes)
      if (scimObjectAttribute.isScimResourceIdReference()) {
```

### BoundedWildcard
Can generalize to `? extends Schema.Attribute`
in `scim-server/src/main/java/org/apache/directory/scim/server/rest/BulkResourceImpl.java`
#### Snippet
```java
  }

  private static void generateReverseDependenciesGraph(Map<String, Set<String>> reverseDependenciesGraph, String dependentBulkId, Object scimObject, List<Schema.Attribute> scimObjectAttributes) {
    for (Schema.Attribute scimObjectAttribute : scimObjectAttributes)
      if (scimObjectAttribute.isScimResourceIdReference()) {
```

### BoundedWildcard
Can generalize to `? extends BulkOperation`
in `scim-server/src/main/java/org/apache/directory/scim/server/rest/BulkResourceImpl.java`
#### Snippet
```java

    @Override
    public void resolve(ScimResource scimResource, Map<String, BulkOperation> bulkIdKeyToOperationResult) throws UnresolvableOperationException {
      BulkOperation resolvedOperationResult = bulkIdKeyToOperationResult.get(this.unresolvedBulkIdKey);
      BaseResource response = resolvedOperationResult.getResponse();
```

### BoundedWildcard
Can generalize to `? extends BulkOperation`
in `scim-server/src/main/java/org/apache/directory/scim/server/rest/BulkResourceImpl.java`
#### Snippet
```java
   * @return
   */
  private Map<String, Set<String>> generateReverseDependenciesGraph(List<BulkOperation> bulkOperations) {
    Map<String, Set<String>> reverseDependenciesGraph = new HashMap<>();

```

### BoundedWildcard
Can generalize to `? extends BulkOperation`
in `scim-server/src/main/java/org/apache/directory/scim/server/rest/BulkResourceImpl.java`
#### Snippet
```java
   * @param bulkIdKeyToOperationResult
   */
  private void cleanup(String bulkIdKeyToCleanup, Map<String, Set<String>> transitiveReverseDependencies, Map<String, BulkOperation> bulkIdKeyToOperationResult) {
    Set<String> reverseDependencies = transitiveReverseDependencies.getOrDefault(bulkIdKeyToCleanup, Collections.emptySet());
    BulkOperation operationResult = bulkIdKeyToOperationResult.get(bulkIdKeyToCleanup);
```

### BoundedWildcard
Can generalize to `? super String`
in `scim-server/src/main/java/org/apache/directory/scim/server/rest/BulkResourceImpl.java`
#### Snippet
```java
   * @param current
   */
  private static void generateVisited(Set<String> visited, Map<String, Set<String>> dependencyGraph, String root, String current) {
    if (!root.equals(current) && !visited.contains(current)) {
      visited.add(current);
```

### BoundedWildcard
Can generalize to `? extends BulkOperation`
in `scim-server/src/main/java/org/apache/directory/scim/server/rest/BulkResourceImpl.java`
#### Snippet
```java
   * @throws UnresolvableOperationException
   */
  private static List<UnresolvedComplex> resolveAttribute(List<UnresolvedComplex> unresolveds, Object attributeValue, Schema.Attribute attribute, Map<String, BulkOperation> bulkIdKeyToOperationResult) throws UnresolvableOperationException {
    if (attributeValue == null) {
      return unresolveds;
```

## RuleId[id=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `final private`
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/filter/InMemoryScimFilterMatcher.java`
#### Snippet
```java
  private class ValuePathPredicate<R> extends AbstractAttributePredicate<ValuePathExpression, R> {

    final private Predicate<Object> nestedPredicate;

    ValuePathPredicate(ValuePathExpression expression, AttributeContainer attributeContainer, Predicate<Object> nestedPredicate) {
```

### MissortedModifiers
Missorted modifiers `final static`
in `scim-core/src/main/java/org/apache/directory/scim/core/json/ObjectMapperFactory.java`
#### Snippet
```java
public class ObjectMapperFactory {

  private final static ObjectMapper objectMapper = createObjectMapper();

  /**
```

### MissortedModifiers
Missorted modifiers `static abstract`
in `scim-server/src/main/java/org/apache/directory/scim/server/rest/BulkResourceImpl.java`
#### Snippet
```java

  @AllArgsConstructor
  private static abstract class UnresolvedTopLevel {
    protected final Schema.AttributeAccessor accessor;

```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `RepositoryRegistry.toString()` is ignored
in `scim-core/src/main/java/org/apache/directory/scim/core/spi/ScimpleComponents.java`
#### Snippet
```java
   */
  public void startup(@Observes Startup startup, RepositoryRegistry repositoryRegistry) {
    repositoryRegistry.toString(); // call toString() to resolve real object from proxy
  }
}
```

## RuleId[id=UnnecessaryBoxing]
### UnnecessaryBoxing
Redundant boxing, `Integer.parseInt()` call can be used instead
in `scim-spec/scim-spec-protocol/src/main/java/org/apache/directory/scim/protocol/data/StatusAdapter.java`
#### Snippet
```java

    for (Status status : Status.values()) {
      if (status.getStatusCode() == Integer.valueOf(v)) {
        return status;
      }
```

## RuleId[id=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `scim-server-examples/scim-server-jersey/src/main/java/org/apache/directory/scim/example/jersey/JerseyApplication.java`
#### Snippet
```java
      URI uri = UriBuilder.fromUri("http://localhost/").port(8080).build();

      System.out.printf("Application started: %s\nStop the application using CTRL+C%n", uri.toString());

      // block and wait shut down signal, like CTRL+C
```

## RuleId[id=MalformedFormatString]
### MalformedFormatString
Too many arguments for format string (found: 2, expected: 1)
in `scim-server/src/main/java/org/apache/directory/scim/server/rest/BulkResourceImpl.java`
#### Snippet
```java
          dependentOperationResult.setData(null);
          dependentOperationResult.setLocation(null);
          createAndSetErrorResponse(dependentOperationResult, Status.CONFLICT, String.format(OPERATION_DEPENDS_ON_FAILED_OPERATION, bulkId, dependentBulkIdKey));
          dependentResourceRepository.delete(dependentResourceId);
        } catch (ResourceException unableToDeleteResourceException) {
```

## RuleId[id=DefaultAnnotationParam]
### DefaultAnnotationParam
Redundant default parameter value assignment
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/extension/EnterpriseExtension.java`
#### Snippet
```java
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
@ScimExtensionType(required = false, name = "EnterpriseUser", id = EnterpriseExtension.URN, description = "Attributes commonly used in representing users that belong to, or act on behalf of, a business or enterprise.")
@Data
public class EnterpriseExtension implements ScimExtension {
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `scim-spec/scim-spec-protocol/src/main/java/org/apache/directory/scim/protocol/ErrorMessageType.java`
#### Snippet
```java
import lombok.Getter;

@XmlEnum(String.class)
@Getter(AccessLevel.PUBLIC)
public enum ErrorMessageType {
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/patch/PatchOperation.java`
#### Snippet
```java
public class PatchOperation {
  
  @XmlEnum(String.class)
  public enum Type {
    @XmlEnumValue("add") ADD,
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/schema/Schema.java`
#### Snippet
```java
    }

    @XmlEnum(String.class)
    public enum Type {
      @XmlEnumValue("binary") BINARY,
```

## RuleId[id=ConditionCoveredByFurtherCondition]
### ConditionCoveredByFurtherCondition
Condition 'parseData.resourceObject != null' covered by subsequent condition 'parseData.resourceObject instanceof Collection'
in `scim-core/src/main/java/org/apache/directory/scim/core/repository/UpdateRequest.java`
#### Snippet
```java
  
          if (patchOpType == Type.REPLACE && 
              (parseData.resourceObject != null && parseData.resourceObject instanceof Collection && !((Collection<?>)parseData.resourceObject).isEmpty()) &&
              (parseData.originalObject == null || 
              (parseData.originalObject instanceof Collection && ((Collection<?>)parseData.originalObject).isEmpty()))) {
```

### ConditionCoveredByFurtherCondition
Condition 'value != null' covered by subsequent condition 'value instanceof ArrayList'
in `scim-core/src/main/java/org/apache/directory/scim/core/repository/UpdateRequest.java`
#### Snippet
```java
      Object value = determineValue(patchOpType, valueNode, parseData);
      
      if (value != null && value instanceof ArrayList) {
        List<Object> objList = (List<Object>)value;
        
```

### ConditionCoveredByFurtherCondition
Condition 'response == null' covered by subsequent condition '!(response instanceof ErrorResponse)'
in `scim-server/src/main/java/org/apache/directory/scim/server/rest/BulkResourceImpl.java`
#### Snippet
```java
            ScimResource resolvedResource = resolvedOperationResult.getData();

            if ((response == null || !(response instanceof ErrorResponse)) && resolvedResource != null) {
              String resolvedId = resolvedResource.getId();

```

### ConditionCoveredByFurtherCondition
Condition 'response == null' covered by subsequent condition '!(response instanceof ErrorResponse)'
in `scim-server/src/main/java/org/apache/directory/scim/server/rest/BulkResourceImpl.java`
#### Snippet
```java
      ScimResource resolvedResource = resolvedOperation.getData();

      if ((response == null || !(response instanceof ErrorResponse)) && resolvedResource != null) {
        String resolvedId = resolvedResource.getId();
        this.accessor.set(this.object, resolvedId);
```

### ConditionCoveredByFurtherCondition
Condition 'response == null' covered by subsequent condition '!(response instanceof ErrorResponse)'
in `scim-server/src/main/java/org/apache/directory/scim/server/rest/BulkResourceImpl.java`
#### Snippet
```java
      ScimResource resolvedResource = resolvedOperationResult.getData();

      if ((response == null || !(response instanceof ErrorResponse)) && resolvedResource != null) {
        String resolvedId = resolvedResource.getId();

```

### ConditionCoveredByFurtherCondition
Condition 'response == null' covered by subsequent condition '!(response instanceof ErrorResponse)'
in `scim-server/src/main/java/org/apache/directory/scim/server/rest/BulkResourceImpl.java`
#### Snippet
```java
            ScimResource resolvedResource = resolvedOperationResult.getData();

            if ((response == null || !(response instanceof ErrorResponse)) && resolvedResource != null && resolvedResource.getId() != null) {
              String resolvedId = resolvedResource.getId();

```

## RuleId[id=UnnecessarySuperQualifier]
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `scim-server/src/main/java/org/apache/directory/scim/server/rest/BulkResourceImpl.java`
#### Snippet
```java
        String resolvedId = resolvedResource.getId();

        super.accessor.set(scimResource, resolvedId);
      } else {
        throw new UnresolvableOperationException("Bulk ID cannot be resolved because the resource it refers to had failed to be created: " + this.unresolvedBulkIdKey);
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `scim-compliance-tests/src/main/java/org/apache/directory/scim/compliance/tests/UsersIT.java`
#### Snippet
```java
      .extract().jsonPath().get("id");

    String updatedBody = body.replaceFirst("}$",
      ",\"phoneNumbers\": [{\"value\": \"555-555-5555\",\"type\": \"work\"}]}");

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/filter/ExpressionBuildingListener.java`
#### Snippet
```java
      String doubleEscaped = jsonValue.substring(1, jsonValue.length() - 1)
          // StringEscapeUtils follows the outdated JSON spec requiring "/" to be escaped, this could subtly break things
          .replaceAll("\\\\/", "\\\\\\\\/")
          // Just in case someone needs a single-quote with a backslash in front of it, this will be unnecessary with escapeJson()
          .replaceAll("\\\\'", "\\\\\\\\'");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/filter/ExpressionBuildingListener.java`
#### Snippet
```java
          .replaceAll("\\\\/", "\\\\\\\\/")
          // Just in case someone needs a single-quote with a backslash in front of it, this will be unnecessary with escapeJson()
          .replaceAll("\\\\'", "\\\\\\\\'");

      // TODO change this to escapeJson() when dependencies get upgraded
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/resources/PhoneNumber.java`
#### Snippet
```java
    @Override
    public PhoneNumber build() throws PhoneNumberParseException {
      if (StringUtils.isBlank(globalNumber) || !globalNumber.matches(GLOBAL_NUMBER_REGEX)) {
        throw new IllegalArgumentException("GlobalPhoneNumberBuilder globalNumber must contain only numeric characters, optional ., -, (, ) visual separators, and an optional plus (+) prefix.");
      }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/resources/PhoneNumber.java`
#### Snippet
```java
    int result = 1;
    result = prime * result + (isGlobalNumber ? 1231 : 1237);
    result = prime * result + ((number == null) ? 0 : number.replaceAll(VISUAL_SEPARATORS, "").hashCode());
    result = prime * result + ((extension == null) ? 0 : extension.replaceAll(VISUAL_SEPARATORS, "").hashCode());
    result = prime * result + ((subAddress == null) ? 0 : subAddress.toLowerCase().hashCode());
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/resources/PhoneNumber.java`
#### Snippet
```java
    result = prime * result + (isGlobalNumber ? 1231 : 1237);
    result = prime * result + ((number == null) ? 0 : number.replaceAll(VISUAL_SEPARATORS, "").hashCode());
    result = prime * result + ((extension == null) ? 0 : extension.replaceAll(VISUAL_SEPARATORS, "").hashCode());
    result = prime * result + ((subAddress == null) ? 0 : subAddress.toLowerCase().hashCode());
    result = prime * result + ((phoneContext == null) ? 0 : (isDomainPhoneContext ? phoneContext.toLowerCase().hashCode() : phoneContext.replaceAll(VISUAL_SEPARATORS, "").hashCode()));
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/resources/PhoneNumber.java`
#### Snippet
```java
    result = prime * result + ((extension == null) ? 0 : extension.replaceAll(VISUAL_SEPARATORS, "").hashCode());
    result = prime * result + ((subAddress == null) ? 0 : subAddress.toLowerCase().hashCode());
    result = prime * result + ((phoneContext == null) ? 0 : (isDomainPhoneContext ? phoneContext.toLowerCase().hashCode() : phoneContext.replaceAll(VISUAL_SEPARATORS, "").hashCode()));
    result = prime * result + ((params == null) ? 0 : paramsToLowerCase().hashCode());
    result = prime * result + ((primary == null) ? 0 : primary.hashCode());
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/resources/PhoneNumber.java`
#### Snippet
```java
    @Override
    public PhoneNumber build() throws PhoneNumberParseException {
      if (StringUtils.isBlank(subscriberNumber) || !subscriberNumber.matches(LOCAL_SUBSCRIBER_NUMBER_REGEX)) {
        throw new IllegalArgumentException("LocalPhoneNumberBuilder subscriberNumber must contain only numeric characters and optional ., -, (, ) visual separator characters.");
      }
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/resources/PhoneNumber.java`
#### Snippet
```java

      if (StringUtils.isBlank(domainName)) {
        if (StringUtils.isBlank(countryCode) || !countryCode.matches(COUNTRY_CODE_REGEX)) {
          throw new IllegalArgumentException("LocalPhoneNumberBuilder countryCode must contain only numeric characters and an optional plus (+) prefix.");
        }
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/resources/PhoneNumber.java`
#### Snippet
```java

      } else {
        if (!domainName.matches(DOMAIN_NAME_REGEX)) {
          throw new IllegalArgumentException("LocalPhoneNumberBuilder domainName must contain only alphanumeric, . and - characters.");
        }
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/resources/PhoneNumber.java`
#### Snippet
```java
      }

      if (extension != null && !extension.matches(LOCAL_SUBSCRIBER_NUMBER_REGEX)) {
        throw new IllegalArgumentException("PhoneNumberBuilder extension must contain only numeric characters and optional ., -, (, ) visual separator characters.");
      }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/resources/PhoneNumber.java`
#### Snippet
```java
      return false;

    String numberWithoutVisualSeparators = number != null ? number.replaceAll(VISUAL_SEPARATORS, "") : null;
    String otherNumberWithoutVisualSeparators = other.number != null ? other.number.replaceAll(VISUAL_SEPARATORS, "") : null;
    if (numberWithoutVisualSeparators == null) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/resources/PhoneNumber.java`
#### Snippet
```java

    String numberWithoutVisualSeparators = number != null ? number.replaceAll(VISUAL_SEPARATORS, "") : null;
    String otherNumberWithoutVisualSeparators = other.number != null ? other.number.replaceAll(VISUAL_SEPARATORS, "") : null;
    if (numberWithoutVisualSeparators == null) {
      if (otherNumberWithoutVisualSeparators != null)
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/resources/PhoneNumber.java`
#### Snippet
```java
      return false;

    String extensionWithoutVisualSeparators = extension != null ? extension.replaceAll(VISUAL_SEPARATORS, "") : null;
    String otherExtensionWithoutVisualSeparators = other.extension != null ? other.extension.replaceAll(VISUAL_SEPARATORS, "") : null;
    if (extensionWithoutVisualSeparators == null) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/resources/PhoneNumber.java`
#### Snippet
```java

    String extensionWithoutVisualSeparators = extension != null ? extension.replaceAll(VISUAL_SEPARATORS, "") : null;
    String otherExtensionWithoutVisualSeparators = other.extension != null ? other.extension.replaceAll(VISUAL_SEPARATORS, "") : null;
    if (extensionWithoutVisualSeparators == null) {
      if (otherExtensionWithoutVisualSeparators != null)
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/resources/PhoneNumber.java`
#### Snippet
```java
    String phoneContextTemp = phoneContext;
    if (!StringUtils.isBlank(phoneContext) && !isDomainPhoneContext) {
      phoneContextTemp = phoneContext.replaceAll(VISUAL_SEPARATORS, "");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/resources/PhoneNumber.java`
#### Snippet
```java
    String otherPhoneContextTemp = other.phoneContext;
    if (!StringUtils.isBlank(other.phoneContext) && !other.isDomainPhoneContext) {
      otherPhoneContextTemp = other.phoneContext.replaceAll(VISUAL_SEPARATORS, "");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/filter/AttributeComparisonExpression.java`
#### Snippet
```java
      String escaped = StringEscapeUtils.escapeEcmaScript((String) this.compareValue)
          // StringEscapeUtils follows the outdated JSON spec requiring "/" to be escaped, this could subtly break things
          .replaceAll("\\\\/", "/")
          // We don't want single-quotes escaped, this will be unnecessary with escapeJson()
          .replaceAll("\\\\'", "'");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/filter/AttributeComparisonExpression.java`
#### Snippet
```java
          .replaceAll("\\\\/", "/")
          // We don't want single-quotes escaped, this will be unnecessary with escapeJson()
          .replaceAll("\\\\'", "'");

      compareValueString = QUOTE + escaped + QUOTE;
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/validator/UrnValidator.java`
#### Snippet
```java
    }

    return urn.matches(URN_RFC2141_REGEX);
  }
}
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `scim-server-examples/scim-server-jersey/src/main/java/org/apache/directory/scim/example/jersey/service/InMemoryUserService.java`
#### Snippet
```java

  /**
   * @see Repository#delete(java.lang.String)
   */
  @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `scim-server-examples/scim-server-jersey/src/main/java/org/apache/directory/scim/example/jersey/service/InMemoryUserService.java`
#### Snippet
```java

  /**
   * @see Repository#get(java.lang.String)
   */
  @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `scim-server-examples/scim-server-jersey/src/main/java/org/apache/directory/scim/example/jersey/JerseyApplication.java`
#### Snippet
```java
public class JerseyApplication extends Application {

  private static final org.slf4j.Logger LOG = LoggerFactory.getLogger(JerseyApplication.class);
  
  @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `scim-server-examples/scim-server-spring-boot/src/main/java/org/apache/directory/scim/example/spring/service/InMemoryUserService.java`
#### Snippet
```java

  /**
   * @see Repository#delete(java.lang.String)
   */
  @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `scim-server-examples/scim-server-spring-boot/src/main/java/org/apache/directory/scim/example/spring/service/InMemoryUserService.java`
#### Snippet
```java

  /**
   * @see Repository#get(java.lang.String)
   */
  @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `scim-server-examples/scim-server-memory/src/main/java/org/apache/directory/scim/example/memory/service/InMemoryUserService.java`
#### Snippet
```java

  /**
   * @see Repository#delete(java.lang.String)
   */
  @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `scim-server-examples/scim-server-memory/src/main/java/org/apache/directory/scim/example/memory/service/InMemoryUserService.java`
#### Snippet
```java

  /**
   * @see Repository#get(java.lang.String)
   */
  @Override
```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import static org.hamcrest.Matchers.emptyString;`
in `scim-compliance-tests/src/main/java/org/apache/directory/scim/compliance/tests/GroupsIT.java`
#### Snippet
```java

import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.emptyString;

@ExtendWith(EmbeddedServerExtension.class)
```

### UNUSED_IMPORT
Unused import `import io.restassured.config.Config;`
in `scim-compliance-tests/src/main/java/org/apache/directory/scim/compliance/tests/ScimpleITSupport.java`
#### Snippet
```java

import io.restassured.RestAssured;
import io.restassured.config.Config;
import io.restassured.config.RestAssuredConfig;
import io.restassured.filter.Filter;
```

### UNUSED_IMPORT
Unused import `import jakarta.ws.rs.core.Response.Status;`
in `scim-server/src/main/java/org/apache/directory/scim/server/exception/UnsupportedFilterExceptionMapper.java`
#### Snippet
```java

import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.Status;
import jakarta.ws.rs.ext.ExceptionMapper;
import org.apache.directory.scim.protocol.ErrorMessageType;
```

### UNUSED_IMPORT
Unused import `import jakarta.ws.rs.ext.ExceptionMapper;`
in `scim-server/src/main/java/org/apache/directory/scim/server/exception/UnsupportedFilterExceptionMapper.java`
#### Snippet
```java
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.Status;
import jakarta.ws.rs.ext.ExceptionMapper;
import org.apache.directory.scim.protocol.ErrorMessageType;
import org.apache.directory.scim.protocol.data.ErrorResponse;
```

### UNUSED_IMPORT
Unused import `import org.apache.directory.scim.protocol.data.ErrorResponse;`
in `scim-server/src/main/java/org/apache/directory/scim/server/rest/SelfResourceImpl.java`
#### Snippet
```java
import org.apache.directory.scim.protocol.UserResource;
import org.apache.directory.scim.spec.filter.attribute.AttributeReferenceListWrapper;
import org.apache.directory.scim.protocol.data.ErrorResponse;
import org.apache.directory.scim.protocol.data.PatchRequest;
import org.apache.directory.scim.protocol.exception.ScimException;
```

### UNUSED_IMPORT
Unused import `import java.util.HashSet;`
in `scim-spec/scim-spec-protocol/src/main/java/org/apache/directory/scim/protocol/data/PatchRequest.java`
#### Snippet
```java

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

```

### UNUSED_IMPORT
Unused import `import org.apache.directory.scim.spec.resources.ScimResource;`
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/schema/ResourceType.java`
#### Snippet
```java
import org.apache.directory.scim.spec.annotation.ScimResourceType;
import org.apache.directory.scim.spec.resources.ScimExtension;
import org.apache.directory.scim.spec.resources.ScimResource;
import org.apache.directory.scim.spec.resources.ScimResourceWithOptionalId;
import org.apache.directory.scim.spec.validator.Urn;
```

### UNUSED_IMPORT
Unused import `import org.apache.directory.scim.spec.resources.ScimResource;`
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/schema/ServiceProviderConfiguration.java`
#### Snippet
```java

import org.apache.directory.scim.spec.resources.ScimExtension;
import org.apache.directory.scim.spec.resources.ScimResource;
import org.apache.directory.scim.spec.resources.ScimResourceWithOptionalId;
import lombok.Data;
```

## RuleId[id=SamePackageImport]
### SamePackageImport
Unnecessary import from the same package `import org.apache.directory.scim.spec.filter.attribute.AttributeReference;`
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/filter/attribute/ScimRequestContext.java`
#### Snippet
```java
import java.util.Set;

import org.apache.directory.scim.spec.filter.attribute.AttributeReference;
import lombok.AllArgsConstructor;
import lombok.Data;
```

## RuleId[id=Lombok]
### Lombok
Lombok needs a default constructor in the base class
in `scim-server/src/main/java/org/apache/directory/scim/server/exception/UnableToRetrieveResourceException.java`
#### Snippet
```java
import org.apache.directory.scim.spec.exception.ResourceException;

@Data
@EqualsAndHashCode(callSuper=true)
public class UnableToRetrieveResourceException extends ResourceException {
```

### Lombok
Lombok needs a default constructor in the base class
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/resources/ScimResourceWithOptionalId.java`
#### Snippet
```java
 * @author crh5255
 */
@Data
@EqualsAndHashCode(callSuper = true)
@XmlAccessorType(XmlAccessType.NONE)
```

### Lombok
Lombok needs a default constructor in the base class
in `scim-server/src/main/java/org/apache/directory/scim/server/exception/UnableToRetrieveExtensionsResourceException.java`
#### Snippet
```java
import org.apache.directory.scim.spec.exception.ResourceException;

@Data
@EqualsAndHashCode(callSuper=true)
public class UnableToRetrieveExtensionsResourceException extends ResourceException {
```

### Lombok
Lombok needs a default constructor in the base class
in `scim-server/src/main/java/org/apache/directory/scim/server/exception/UnableToResolveIdResourceException.java`
#### Snippet
```java
import org.apache.directory.scim.spec.exception.ResourceException;

@Data
@EqualsAndHashCode(callSuper=true)
public class UnableToResolveIdResourceException extends ResourceException {
```

### Lombok
Lombok needs a default constructor in the base class
in `scim-server/src/main/java/org/apache/directory/scim/server/exception/UnableToUpdateResourceException.java`
#### Snippet
```java
import org.apache.directory.scim.spec.exception.ResourceException;

@Data
@EqualsAndHashCode(callSuper=true)
public class UnableToUpdateResourceException extends ResourceException {
```

### Lombok
Lombok needs a default constructor in the base class
in `scim-spec/scim-spec-protocol/src/main/java/org/apache/directory/scim/protocol/data/ListResponse.java`
#### Snippet
```java
import org.apache.directory.scim.spec.resources.BaseResource;

@Data
@EqualsAndHashCode(callSuper = true)
@XmlRootElement
```

### Lombok
Lombok needs a default constructor in the base class
in `scim-spec/scim-spec-protocol/src/main/java/org/apache/directory/scim/protocol/data/SearchRequest.java`
#### Snippet
```java
 *
 */
@Data
@EqualsAndHashCode(callSuper = true)
@XmlType
```

### Lombok
Lombok needs a default constructor in the base class
in `scim-spec/scim-spec-protocol/src/main/java/org/apache/directory/scim/protocol/data/ErrorResponse.java`
#### Snippet
```java
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@XmlRootElement
```

### Lombok
Lombok needs a default constructor in the base class
in `scim-server/src/main/java/org/apache/directory/scim/server/exception/UnableToCreateResourceException.java`
#### Snippet
```java
import org.apache.directory.scim.spec.exception.ResourceException;

@Data
@EqualsAndHashCode(callSuper=true)
public class UnableToCreateResourceException extends ResourceException {
```

### Lombok
Lombok needs a default constructor in the base class
in `scim-server/src/main/java/org/apache/directory/scim/server/exception/UnableToDeleteResourceException.java`
#### Snippet
```java
import org.apache.directory.scim.spec.exception.ResourceException;

@Data
@EqualsAndHashCode(callSuper=true)
public class UnableToDeleteResourceException extends ResourceException {
```

### Lombok
Lombok needs a default constructor in the base class
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/resources/ScimGroup.java`
#### Snippet
```java
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@ScimResourceType(id = ScimGroup.RESOURCE_NAME, name = ScimGroup.RESOURCE_NAME, schema = ScimGroup.SCHEMA_URI, description = "Top level ScimGroup", endpoint = "/Groups")
```

### Lombok
Lombok needs a default constructor in the base class
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/schema/ServiceProviderConfiguration.java`
#### Snippet
```java
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@XmlRootElement
```

### Lombok
Lombok needs a default constructor in the base class
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/schema/ResourceType.java`
#### Snippet
```java
 * @author Steve Moyer &lt;smoyer@psu.edu&gt;
 */
@Data
@EqualsAndHashCode(callSuper = true)
@XmlAccessorType(XmlAccessType.NONE)
```

### Lombok
Lombok needs a default constructor in the base class
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/resources/ScimResource.java`
#### Snippet
```java
 * @author smoyer1
 */
@Data
@EqualsAndHashCode(callSuper = true)
@XmlAccessorType(XmlAccessType.NONE)
```

### Lombok
Lombok needs a default constructor in the base class
in `scim-spec/scim-spec-protocol/src/main/java/org/apache/directory/scim/protocol/data/BulkRequest.java`
#### Snippet
```java
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@XmlType
```

### Lombok
Lombok needs a default constructor in the base class
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/resources/ScimUser.java`
#### Snippet
```java
import lombok.ToString;

@Data
@ToString(callSuper = true, exclude = {"password"})
@EqualsAndHashCode(callSuper = true, exclude = {"password"})
```

### Lombok
Lombok needs a default constructor in the base class
in `scim-spec/scim-spec-protocol/src/main/java/org/apache/directory/scim/protocol/data/BulkResponse.java`
#### Snippet
```java
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@XmlType
```

### Lombok
Lombok needs a default constructor in the base class
in `scim-spec/scim-spec-protocol/src/main/java/org/apache/directory/scim/protocol/data/PatchRequest.java`
#### Snippet
```java
import org.apache.directory.scim.spec.resources.BaseResource;

@Data
@EqualsAndHashCode(callSuper = true)
@XmlRootElement
```

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `ScimResourceWithOptionalId()` of an abstract class should not be declared 'public'
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/resources/ScimResourceWithOptionalId.java`
#### Snippet
```java
  String id;
  
  public ScimResourceWithOptionalId(String urn, String resourceType) {
    super(urn, resourceType);
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `BaseResource()` of an abstract class should not be declared 'public'
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/resources/BaseResource.java`
#### Snippet
```java
  Set<String> schemas;

  public BaseResource(@Urn String urn) {
    addSchema(urn);
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `ScimResource()` of an abstract class should not be declared 'public'
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/resources/ScimResource.java`
#### Snippet
```java
  private final String resourceType;

  public ScimResource(String urn, String resourceType) {
    super(urn);
    this.baseUrn = urn;
```

### NonProtectedConstructorInAbstractClass
Constructor `BaseScimClient()` of an abstract class should not be declared 'public'
in `scim-client/src/main/java/org/apache/directory/scim/client/rest/BaseScimClient.java`
#### Snippet
```java
  }

  public BaseScimClient(Client client, String baseUrl, Class<T> scimResourceClass, GenericType<ListResponse<T>> scimResourceListGenericType, RestCall invoke) {
    this(client, baseUrl, scimResourceClass, scimResourceListGenericType);

```

### NonProtectedConstructorInAbstractClass
Constructor `BaseScimClient()` of an abstract class should not be declared 'public'
in `scim-client/src/main/java/org/apache/directory/scim/client/rest/BaseScimClient.java`
#### Snippet
```java
  private RestCall invoke = Invocation::invoke;

  public BaseScimClient(Client client, String baseUrl, Class<T> scimResourceClass, GenericType<ListResponse<T>> scimResourceListGenericType) {
    ScimResourceType scimResourceType = scimResourceClass.getAnnotation(ScimResourceType.class);
    String endpoint = scimResourceType != null ? scimResourceType.endpoint() : null;
```

### NonProtectedConstructorInAbstractClass
Constructor `BaseResourceTypeResourceImpl()` of an abstract class should not be declared 'public'
in `scim-server/src/main/java/org/apache/directory/scim/server/rest/BaseResourceTypeResourceImpl.java`
#### Snippet
```java
  private final Class<T> resourceClass;

  public BaseResourceTypeResourceImpl(SchemaRegistry schemaRegistry, RepositoryRegistry repositoryRegistry, RequestContext requestContext, EtagGenerator etagGenerator, Class<T> resourceClass) {
    this.schemaRegistry = schemaRegistry;
    this.repositoryRegistry = repositoryRegistry;
```

## RuleId[id=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `repositoryMap` is accessed in both synchronized and unsynchronized contexts
in `scim-core/src/main/java/org/apache/directory/scim/core/repository/RepositoryRegistry.java`
#### Snippet
```java
  private SchemaRegistry schemaRegistry;

  private Map<Class<? extends ScimResource>, Repository<? extends ScimResource>> repositoryMap = new HashMap<>();

  public RepositoryRegistry() {
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `false` is redundant
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/resources/PhoneNumber.java`
#### Snippet
```java

    boolean isGlobalNumber = false;
    boolean isDomainPhoneContext = false;

    public PhoneNumberBuilder display(String display) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/resources/PhoneNumber.java`
#### Snippet
```java
  @Setter(AccessLevel.NONE)
  @Getter
  boolean isGlobalNumber = false;

  @Getter
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/resources/PhoneNumber.java`
#### Snippet
```java
  @Setter(AccessLevel.NONE)
  @Getter
  boolean isDomainPhoneContext = false;

  @Getter
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/resources/PhoneNumber.java`
#### Snippet
```java
    LinkedHashMap<String, String> params;

    boolean isGlobalNumber = false;
    boolean isDomainPhoneContext = false;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `scim-server/src/main/java/org/apache/directory/scim/server/configuration/ServerConfiguration.java`
#### Snippet
```java
  boolean supportsETag = true;
  
  boolean supportsFilter = false;
  int filterMaxResults = FILTER_MAXIMUM_RESULTS;
  
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `scim-server/src/main/java/org/apache/directory/scim/server/configuration/ServerConfiguration.java`
#### Snippet
```java
  boolean supportsPatch = true;
  
  boolean supportsSort = false;
  
  String documentationUri;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `scim-server/src/main/java/org/apache/directory/scim/server/configuration/ServerConfiguration.java`
#### Snippet
```java
  String id = "spc";
  
  boolean supportsChangePassword = false;
  
  @Setter(AccessLevel.NONE)
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `scim-server/src/main/java/org/apache/directory/scim/server/spi/ScimServerBuildCompatibleExtension.java`
#### Snippet
```java
public class ScimServerBuildCompatibleExtension implements BuildCompatibleExtension {

  private boolean serverConfigFound = false;

  @Registration(types = ServerConfiguration.class)
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `scim-core/src/main/java/org/apache/directory/scim/core/repository/UpdateRequest.java`
#### Snippet
```java
  private T original;
  private List<PatchOperation> patchOperations;
  private boolean initialized = false;

  private Schema schema;
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `actual`
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/filter/InMemoryScimFilterMatcher.java`
#### Snippet
```java
          // check if the filter is nested such as: `emails[type eq "work"].value`
          if (!(attributeReference.hasSubAttribute() && schemaAttribute.isMultiValued())) {
            actual = get(schemaAttribute, actual);
          }
          // if the attribute has a sub-level, continue on
```

### AssignmentToMethodParameter
Assignment to method parameter `actual`
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/filter/InMemoryScimFilterMatcher.java`
#### Snippet
```java
          if (subAttribute != null) {
            schemaAttribute = schemaAttribute.getAttribute(subAttribute);
            actual = get(schemaAttribute, actual);
          }
          return test(schemaAttribute, actual);
```

### AssignmentToMethodParameter
Assignment to method parameter `patchOpType`
in `scim-core/src/main/java/org/apache/directory/scim/core/repository/UpdateRequest.java`
#### Snippet
```java
              (parseData.originalObject == null || 
              (parseData.originalObject instanceof Collection && ((Collection<?>)parseData.originalObject).isEmpty()))) {
            patchOpType = Type.ADD;
          }
          
```

### AssignmentToMethodParameter
Assignment to method parameter `patchOpType`
in `scim-core/src/main/java/org/apache/directory/scim/core/repository/UpdateRequest.java`
#### Snippet
```java
    if (patchOpType == Type.REPLACE && (parseData.resourceObject == null || 
        (parseData.resourceObject instanceof Collection && ((Collection<?>)parseData.resourceObject).isEmpty()))) {
      patchOpType = Type.REMOVE;
      valueNode = null;
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `valueNode`
in `scim-core/src/main/java/org/apache/directory/scim/core/repository/UpdateRequest.java`
#### Snippet
```java
        (parseData.resourceObject instanceof Collection && ((Collection<?>)parseData.resourceObject).isEmpty()))) {
      patchOpType = Type.REMOVE;
      valueNode = null;
    }
    
```

### AssignmentToMethodParameter
Assignment to method parameter `patchOpType`
in `scim-core/src/main/java/org/apache/directory/scim/core/repository/UpdateRequest.java`
#### Snippet
```java
    
    if (patchOpType == Type.REPLACE && parseData.originalObject == null) {
      patchOpType = Type.ADD;
    }
        
```

### AssignmentToMethodParameter
Assignment to method parameter `resource`
in `scim-server/src/main/java/org/apache/directory/scim/server/rest/BaseResourceTypeResourceImpl.java`
#### Snippet
```java

          try {
            resource = (T) attributeFilterExtension.filterAttributes(resource, scimRequestContext);
            log.debug("Resource now - " + resource.toString());
          } catch (ClientFilterException e) {
```

### AssignmentToMethodParameter
Assignment to method parameter `resource`
in `scim-server/src/main/java/org/apache/directory/scim/server/rest/BaseResourceTypeResourceImpl.java`
#### Snippet
```java
  private <T extends ScimResource> T attributesForDisplay(T resource, Set<AttributeReference> includedAttributes, Set<AttributeReference> excludedAttributes) throws AttributeException {
    if (!excludedAttributes.isEmpty()) {
      resource = attributeUtil.setExcludedAttributesForDisplay(resource, excludedAttributes);
    } else {
      resource = attributeUtil.setAttributesForDisplay(resource, includedAttributes);
```

### AssignmentToMethodParameter
Assignment to method parameter `resource`
in `scim-server/src/main/java/org/apache/directory/scim/server/rest/BaseResourceTypeResourceImpl.java`
#### Snippet
```java
      resource = attributeUtil.setExcludedAttributesForDisplay(resource, excludedAttributes);
    } else {
      resource = attributeUtil.setAttributesForDisplay(resource, includedAttributes);
    }
    return resource;
```

## RuleId[id=RedundantImplements]
### RedundantImplements
Redundant interface declaration `Serializable`
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/resources/ScimGroup.java`
#### Snippet
```java
@XmlRootElement(name = ScimGroup.RESOURCE_NAME)
@XmlAccessorType(XmlAccessType.NONE)
public class ScimGroup extends ScimResource implements Serializable {

  private static final long serialVersionUID = 4424638498347469070L;
```

### RedundantImplements
Redundant interface declaration `Serializable`
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/resources/ScimResource.java`
#### Snippet
```java
@EqualsAndHashCode(callSuper = true)
@XmlAccessorType(XmlAccessType.NONE)
public abstract class ScimResource extends BaseResource<ScimResource> implements Serializable {

  private static final long serialVersionUID = 3673404125396687366L;
```

### RedundantImplements
Redundant interface declaration `Serializable`
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/resources/ScimUser.java`
#### Snippet
```java
@XmlRootElement(name = ScimUser.RESOURCE_NAME)
@XmlAccessorType(XmlAccessType.NONE)
public class ScimUser extends ScimResource implements Serializable {

  private static final long serialVersionUID = -2306547717245071997L;
```

## RuleId[id=StringRepeatCanBeUsed]
### StringRepeatCanBeUsed
Can be replaced with 'String.repeat()'
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/phonenumber/PhoneNumberParseTreeListener.java`
#### Snippet
```java
  private String indent(String s) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < indent; i++) {
      sb.append("    ");
    }
```

## RuleId[id=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-03-12-08-34-08.786.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/adapter/PatchOperationPathAdapter.java`
#### Snippet
```java
  public PatchOperationPath unmarshal(String v) throws Exception {
    if (v == null) {
      return null;
    }
    return new PatchOperationPath(v);
```

### ReturnNull
Return of `null`
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/adapter/PatchOperationPathAdapter.java`
#### Snippet
```java
  public String marshal(PatchOperationPath v) throws Exception {
    if (v == null) {
      return null;
    }
    return v.toString();  
```

### ReturnNull
Return of `null`
in `scim-spec/scim-spec-protocol/src/main/java/org/apache/directory/scim/protocol/data/StatusAdapter.java`
#### Snippet
```java
  public Status unmarshal(String v) throws Exception {
    if (v == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `scim-spec/scim-spec-protocol/src/main/java/org/apache/directory/scim/protocol/data/StatusAdapter.java`
#### Snippet
```java
  public String marshal(Status v) throws Exception {
    if (v == null) {
      return null;
    }
    return Integer.toString(v.getStatusCode());
```

### ReturnNull
Return of `null`
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/adapter/LocalDateTimeAdapter.java`
#### Snippet
```java
	public LocalDateTime unmarshal(String v) throws Exception {
		if (v == null) {
			return null;
		}
		return LocalDateTime.parse(v, FORMATTER);
```

### ReturnNull
Return of `null`
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/adapter/LocalDateTimeAdapter.java`
#### Snippet
```java
	public String marshal(LocalDateTime v) throws Exception {
		if (v == null) {
		  return null;
		}
		return FORMATTER.format(v);
```

### ReturnNull
Return of `null`
in `scim-spec/scim-spec-protocol/src/main/java/org/apache/directory/scim/protocol/adapter/AttributeReferenceAdapter.java`
#### Snippet
```java
  public AttributeReference unmarshal(String string) throws Exception {
    if (string == null) {
      return null;
    }
    return new AttributeReference(string);
```

### ReturnNull
Return of `null`
in `scim-spec/scim-spec-protocol/src/main/java/org/apache/directory/scim/protocol/adapter/AttributeReferenceAdapter.java`
#### Snippet
```java
  public String marshal(AttributeReference attributeReference) throws Exception {
    if (attributeReference == null) {
      return null;
    }
    return attributeReference.getFullyQualifiedAttributeName();
```

### ReturnNull
Return of `null`
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/adapter/Iso8601DateTimeAdapter.java`
#### Snippet
```java
    if (date == null || date.isEmpty())
    {
      return null;
    }

```

### ReturnNull
Return of `null`
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/adapter/Iso8601DateTimeAdapter.java`
#### Snippet
```java
    if (date == null)
    {
      return null;
    }

```

### ReturnNull
Return of `null`
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/filter/ExpressionBuildingListener.java`
#### Snippet
```java
      return StringEscapeUtils.unescapeEcmaScript(doubleEscaped);
    } else if ("null".equals(jsonValue)) {
      return null;
    } else if ("true".equals(jsonValue)) {
      return true;
```

### ReturnNull
Return of `null`
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/resources/PhoneNumber.java`
#### Snippet
```java
      }

      return null;
    }

```

### ReturnNull
Return of `null`
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/resources/PhoneNumber.java`
#### Snippet
```java
      }

      return !paramsFormatted.isEmpty() ? paramsFormatted : null;
    }

```

### ReturnNull
Return of `null`
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/resources/PhoneNumber.java`
#### Snippet
```java
      }

      return null;
    }

```

### ReturnNull
Return of `null`
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/resources/PhoneNumber.java`
#### Snippet
```java
      }

      return !valueString.isEmpty() ? valueString : null;
    }

```

### ReturnNull
Return of `null`
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/resources/PhoneNumber.java`
#### Snippet
```java
      }

      return null;
    }

```

### ReturnNull
Return of `null`
in `scim-core/src/main/java/org/apache/directory/scim/core/schema/SchemaRegistry.java`
#### Snippet
```java
    ResourceType rt = resourceTypeMap.get(resourceType);
    if (rt == null) {
      return null;
    }
    
```

### ReturnNull
Return of `null`
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/filter/BaseFilterExpressionMapper.java`
#### Snippet
```java
    if (schemaAttribute == null) {
      log.warn("Invalid filter: attribute '" + baseAttributeName + "' is NOT a valid SCIM attribute.");
      return null;
    }

```

### ReturnNull
Return of `null`
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/filter/BaseFilterExpressionMapper.java`
#### Snippet
```java
      if (schemaAttribute == null) {
        log.warn("Invalid filter: attribute '" + attributeReference.getFullyQualifiedAttributeName() + "' is NOT a valid SCIM attribute.");
        return null;
      }
    }
```

### ReturnNull
Return of `null`
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/filter/BaseFilterExpressionMapper.java`
#### Snippet
```java
    if (schemaAttribute.getReturned() == Schema.Attribute.Returned.NEVER) {
      log.warn("Invalid filter: attribute '" + attributeReference.getAttributeName() + "' is not filterable.");
      return null;
    }

```

### ReturnNull
Return of `null`
in `scim-spec/scim-spec-protocol/src/main/java/org/apache/directory/scim/protocol/adapter/FilterAdapter.java`
#### Snippet
```java
  public Filter unmarshal(String string) throws Exception {
    if (string == null) {
      return null;
    }
    return new Filter(string);
```

### ReturnNull
Return of `null`
in `scim-spec/scim-spec-protocol/src/main/java/org/apache/directory/scim/protocol/adapter/FilterAdapter.java`
#### Snippet
```java
  public String marshal(Filter filter) throws Exception {
    if (filter == null) {
      return null;
    }
    return filter.getExpression().toFilter();
```

### ReturnNull
Return of `null`
in `scim-client/src/main/java/org/apache/directory/scim/client/rest/BaseScimClient.java`
#### Snippet
```java
    private AttributeReferenceListWrapper nullOutQueryParamIfListIsNullOrEmpty(AttributeReferenceListWrapper wrapper) {
      if (wrapper == null) {
        return null;
      }
      Set<AttributeReference> attributeReferences = wrapper.getAttributeReferences();
```

### ReturnNull
Return of `null`
in `scim-client/src/main/java/org/apache/directory/scim/client/rest/BaseScimClient.java`
#### Snippet
```java
      Set<AttributeReference> attributeReferences = wrapper.getAttributeReferences();
      if (attributeReferences == null || attributeReferences.isEmpty()) {
        return null;
      }
      
```

### ReturnNull
Return of `null`
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/schema/Schema.java`
#### Snippet
```java
  public Attribute getAttributeFromPath(String path) {
    if (path == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/schema/Schema.java`
#### Snippet
```java
  public Attribute getAttribute(String name) {
    if (name == null) {
      return null;
    }
    return attributeNamesMap.get(name.toLowerCase());
```

### ReturnNull
Return of `null`
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/schema/Schema.java`
#### Snippet
```java
    public Attribute getAttribute(String name) {
      if (name == null) {
        return null;
      }
      return subAttributeNamesMap.get(name.toLowerCase());
```

### ReturnNull
Return of `null`
in `scim-core/src/main/java/org/apache/directory/scim/core/repository/UpdateRequest.java`
#### Snippet
```java
    private Object lookupAttribute(Object object, AttributeContainer ac, String attributeName) throws IllegalArgumentException, IllegalAccessException {
      if (object == null) {
        return null;
      }

```

### ReturnNull
Return of `null`
in `scim-core/src/main/java/org/apache/directory/scim/core/repository/UpdateRequest.java`
#### Snippet
```java
  private Object determineValue(PatchOperation.Type patchOpType, JsonNode valueNode, ParseData parseData) throws JsonProcessingException {
    if (patchOpType == PatchOperation.Type.REMOVE) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `scim-core/src/main/java/org/apache/directory/scim/core/repository/UpdateRequest.java`
#### Snippet
```java
        return valueNode.asInt();
      } else if (valueNode instanceof NullNode) {
        return null;
      } else if (valueNode instanceof ObjectNode) {
        return parseData.resourceObject;
```

### ReturnNull
Return of `null`
in `scim-core/src/main/java/org/apache/directory/scim/core/repository/UpdateRequest.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `scim-core/src/main/java/org/apache/directory/scim/core/repository/UpdateRequest.java`
#### Snippet
```java
      List list = (List) object;
      if (index >= list.size()) {
        return null;
      }

```

### ReturnNull
Return of `null`
in `scim-server/src/main/java/org/apache/directory/scim/server/rest/BaseResourceTypeResourceImpl.java`
#### Snippet
```java
    } catch (EtagGenerationException e) {
      log.warn("Failed to generate etag for resource", e);
      return null;
    }
  }
```

## RuleId[id=AssignmentToLambdaParameter]
### AssignmentToLambdaParameter
Assignment to lambda parameter `item`
in `scim-core/src/main/java/org/apache/directory/scim/core/repository/PatchHandlerImpl.java`
#### Snippet
```java
              item.put(subAttributeName, value);
            } else {
              item = (Map<String, Object>) value;
            }
          }
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `self` is redundant
in `scim-client/src/main/java/org/apache/directory/scim/client/rest/ScimSelfClient.java`
#### Snippet
```java

  public ScimUser getSelf() throws ScimException {
    ScimUser self = this.getSelf(null, null);

    return self;
```

### UnnecessaryLocalVariable
Local variable `vpe` is redundant
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/filter/ValuePathExpression.java`
#### Snippet
```java

  public static ValuePathExpression fromFilterExpression(AttributeReference attrRef, FilterExpression attributeExpression) {
    ValuePathExpression vpe = new ValuePathExpression(attrRef, attributeExpression);

    return vpe;
```

### UnnecessaryLocalVariable
Local variable `filter` is redundant
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/filter/AttributeComparisonExpression.java`
#### Snippet
```java
  @Override
  public String toFilter() {
    String filter = this.attributePath.getFullyQualifiedAttributeName() + " " + this.operation + " " + this.createCompareValueString();

    return filter;
```

### UnnecessaryLocalVariable
Local variable `response` is redundant
in `scim-client/src/main/java/org/apache/directory/scim/client/rest/ResourceTypesClient.java`
#### Snippet
```java
    @Override
    public Response getAllResourceTypes(String filter) throws RestException {
      Response response = ResourceTypesClient.this.target
          .queryParam("filter", filter)
          .request("application/scim+json")
```

### UnnecessaryLocalVariable
Local variable `response` is redundant
in `scim-client/src/main/java/org/apache/directory/scim/client/rest/ResourceTypesClient.java`
#### Snippet
```java
    @Override
    public Response getResourceType(String name) throws RestException {
      Response response = ResourceTypesClient.this.target
          .path(name)
          .request("application/scim+json")
```

### UnnecessaryLocalVariable
Local variable `patchOps` is redundant
in `scim-core/src/main/java/org/apache/directory/scim/core/repository/UpdateRequest.java`
#### Snippet
```java
    }*/

    List<PatchOperation> patchOps = convertToPatchOperations(differences);

    /*try {
```

### UnnecessaryLocalVariable
Local variable `clazz` is redundant
in `scim-server/src/main/java/org/apache/directory/scim/server/rest/BulkResourceImpl.java`
#### Snippet
```java
      String path = operationResult.getPath();
      String endPoint = path.substring(0, path.lastIndexOf('/'));
      Class<ScimResource> clazz = (Class<ScimResource>) schemaRegistry.getScimResourceClassFromEndpoint(endPoint);
      scimResourceClass = clazz;
    } else {
```

## RuleId[id=DuplicateThrows]
### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `scim-tools/src/main/java/org/apache/directory/scim/tools/lint/Lint.java`
#### Snippet
```java
public class Lint {

  JsonNode convert(InputStream inputStream) throws JsonProcessingException, IOException {
    ObjectMapper objectMapper = new ObjectMapper();
    return objectMapper.readTree(inputStream);
```

### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `scim-tools/src/main/java/org/apache/directory/scim/tools/lint/Lint.java`
#### Snippet
```java
  }
  
  public boolean lint(InputStream inputStream) throws JsonProcessingException, IOException {
    return lint(convert(inputStream));
  }
```

## RuleId[id=NonFinalFieldOfException]
### NonFinalFieldOfException
Non-final field `errorResponse` of exception class
in `scim-client/src/main/java/org/apache/directory/scim/client/rest/RestException.java`
#### Snippet
```java
  private final int statusCode;
  private final Response.Status status;
  private ErrorResponse errorResponse;

  public RestException(Response response) {
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `canonicalTypes` initializer `null` is redundant
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/schema/Schemas.java`
#### Snippet
```java
      attribute.setUrn(urn);

      List<String> canonicalTypes = null;
      Field [] enumFields = sa.canonicalValueEnum().getFields();
      log.debug("Gathered fields of off the enum, there are " + enumFields.length + " " + sa.canonicalValueEnum().getName());
```

### UnusedAssignment
Variable `typeName` initializer `null` is redundant
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/schema/Schemas.java`
#### Snippet
```java
      attribute.setDescription(sa.description());

      String typeName = null;
      if (Collection.class.isAssignableFrom(f.getType())) {
        log.debug("We have a collection");
```

### UnusedAssignment
Variable `schema` initializer `null` is redundant
in `scim-server/src/main/java/org/apache/directory/scim/server/rest/AttributeUtil.java`
#### Snippet
```java
  private Set<Attribute> findAttribute(AttributeReference attributeReference, boolean includeAttributeChain) throws AttributeDoesNotExistException {
    String schemaUrn = attributeReference.getUrn();
    Schema schema = null;
    Set<Attribute> attributes;
    
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `otherParams != null` is always `true` when reached
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/resources/PhoneNumber.java`
#### Snippet
```java
    }

    if ((params == null && otherParams != null) || (params != null && otherParams == null) || (params.size() != otherParams.size())) {
      return false;
    }
```

### ConstantValue
Condition `params != null` is always `true`
in `scim-spec/scim-spec-schema/src/main/java/org/apache/directory/scim/spec/resources/PhoneNumber.java`
#### Snippet
```java
    }

    if ((params == null && otherParams != null) || (params != null && otherParams == null) || (params.size() != otherParams.size())) {
      return false;
    }
```

### ConstantValue
Condition `operation != null` is always `true`
in `scim-core/src/main/java/org/apache/directory/scim/core/repository/UpdateRequest.java`
#### Snippet
```java
          for (Object obj : objList) {
            PatchOperation operation = buildPatchOperation(patchOpType, parseData, attributeReferenceList, valueFilterExpression, subAttributes, obj);
            if (operation != null) {
              operations.add(operation);
            }
```

### ConstantValue
Condition `operation != null` is always `true`
in `scim-core/src/main/java/org/apache/directory/scim/core/repository/UpdateRequest.java`
#### Snippet
```java
      } else {
        PatchOperation operation = buildPatchOperation(patchOpType, parseData, attributeReferenceList, valueFilterExpression, subAttributes, value);
        if (operation != null) {
          operations.add(operation);
        }
```

