# gson 
 
# Bad smells
I found 291 bad smells with 26 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| RuleId[ruleID=ReturnNull] | 85 | false |
| RuleId[ruleID=NestedAssignment] | 43 | false |
| RuleId[ruleID=UnnecessaryFullyQualifiedName] | 23 | false |
| RuleId[ruleID=AssignmentToMethodParameter] | 17 | false |
| RuleId[ruleID=UnnecessaryModifier] | 16 | true |
| RuleId[ruleID=BoundedWildcard] | 16 | false |
| RuleId[ruleID=RedundantFieldInitialization] | 11 | false |
| RuleId[ruleID=DataFlowIssue] | 10 | false |
| RuleId[ruleID=UtilityClassWithoutPrivateConstructor] | 5 | false |
| RuleId[ruleID=MissortedModifiers] | 5 | false |
| RuleId[ruleID=IOResource] | 4 | false |
| RuleId[ruleID=MarkedForRemoval] | 4 | false |
| RuleId[ruleID=SynchronizeOnThis] | 4 | false |
| RuleId[ruleID=CommentedOutCode] | 3 | false |
| RuleId[ruleID=JavaReflectionMemberAccess] | 3 | false |
| RuleId[ruleID=SizeReplaceableByIsEmpty] | 3 | true |
| RuleId[ruleID=UnnecessaryToStringCall] | 3 | true |
| RuleId[ruleID=UnusedAssignment] | 3 | false |
| RuleId[ruleID=MagicConstant] | 2 | false |
| RuleId[ruleID=DeprecatedIsStillUsed] | 2 | false |
| RuleId[ruleID=StringBufferReplaceableByString] | 2 | false |
| RuleId[ruleID=NonShortCircuitBoolean] | 2 | false |
| RuleId[ruleID=AssignmentToForLoopParameter] | 2 | false |
| RuleId[ruleID=RedundantSuppression] | 2 | false |
| RuleId[ruleID=SystemOutErr] | 2 | false |
| RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern] | 2 | false |
| RuleId[ruleID=NonProtectedConstructorInAbstractClass] | 2 | true |
| RuleId[ruleID=MismatchedCollectionQueryUpdate] | 2 | false |
| RuleId[ruleID=StringEquality] | 1 | false |
| RuleId[ruleID=UnnecessarySemicolon] | 1 | false |
| RuleId[ruleID=FinalPrivateMethod] | 1 | false |
| RuleId[ruleID=NonSerializableFieldInSerializableClass] | 1 | false |
| RuleId[ruleID=UnnecessaryUnboxing] | 1 | false |
| RuleId[ruleID=ConditionCoveredByFurtherCondition] | 1 | false |
| RuleId[ruleID=UNUSED_IMPORT] | 1 | false |
| RuleId[ruleID=HtmlWrongAttributeValue] | 1 | false |
| RuleId[ruleID=UnnecessaryLocalVariable] | 1 | true |
| RuleId[ruleID=ZeroLengthArrayInitialization] | 1 | false |
| RuleId[ruleID=PointlessBooleanExpression] | 1 | true |
| RuleId[ruleID=EqualsWhichDoesntCheckParameterClass] | 1 | false |
| RuleId[ruleID=ConstantValue] | 1 | false |
## RuleId[ruleID=IOResource]
### RuleId[ruleID=IOResource]
'JsonReader' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `metrics/src/main/java/com/google/gson/metrics/BagOfPrimitivesDeserializationBenchmark.java`
#### Snippet
```java
    for (int i=0; i<reps; ++i) {
      StringReader reader = new StringReader(json);
      JsonReader jr = new JsonReader(reader);
      jr.beginObject();
      long longValue = 0;
```

### RuleId[ruleID=IOResource]
'JsonReader' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `metrics/src/main/java/com/google/gson/metrics/BagOfPrimitivesDeserializationBenchmark.java`
#### Snippet
```java
    for (int i=0; i<reps; ++i) {
      StringReader reader = new StringReader(json);
      JsonReader jr = new JsonReader(reader);
      jr.beginObject();
      BagOfPrimitives bag = new BagOfPrimitives();
```

### RuleId[ruleID=IOResource]
'JsonReader' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `metrics/src/main/java/com/google/gson/metrics/CollectionsDeserializationBenchmark.java`
#### Snippet
```java
    for (int i=0; i<reps; ++i) {
      StringReader reader = new StringReader(json);
      JsonReader jr = new JsonReader(reader);
      jr.beginArray();
      List<BagOfPrimitives> bags = new ArrayList<>();
```

### RuleId[ruleID=IOResource]
'JsonReader' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `metrics/src/main/java/com/google/gson/metrics/CollectionsDeserializationBenchmark.java`
#### Snippet
```java
    for (int i=0; i<reps; ++i) {
      StringReader reader = new StringReader(json);
      JsonReader jr = new JsonReader(reader);
      jr.beginArray();
      List<BagOfPrimitives> bags = new ArrayList<>();
```

## RuleId[ruleID=StringEquality]
### RuleId[ruleID=StringEquality]
String values are compared using `==`, not 'equals()'
in `gson/src/main/java/com/google/gson/internal/LazilyParsedNumber.java`
#### Snippet
```java
    if (obj instanceof LazilyParsedNumber) {
      LazilyParsedNumber other = (LazilyParsedNumber) obj;
      return value == other.value || value.equals(other.value);
    }
    return false;
```

## RuleId[ruleID=UnnecessaryModifier]
### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `extras/src/main/java/com/google/gson/interceptors/Intercept.java`
#### Snippet
```java
   */
  @SuppressWarnings("rawtypes")
  public Class<? extends JsonPostDeserializer> postDeserialize();
}

```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `gson/src/main/java/com/google/gson/JsonSerializationContext.java`
#### Snippet
```java
   * @return a tree of {@link JsonElement}s corresponding to the serialized form of {@code src}.
   */
  public JsonElement serialize(Object src, Type typeOfSrc);
}

```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `gson/src/main/java/com/google/gson/JsonSerializationContext.java`
#### Snippet
```java
   * @return a tree of {@link JsonElement}s corresponding to the serialized form of {@code src}.
   */
  public JsonElement serialize(Object src);

  /**
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `extras/src/main/java/com/google/gson/interceptors/JsonPostDeserializer.java`
#### Snippet
```java
   * This method is called by Gson after the object has been deserialized from Json.
   */
  public void postDeserialize(T object);
}

```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `gson/src/main/java/com/google/gson/internal/ObjectConstructor.java`
#### Snippet
```java
   * Returns a new instance.
   */
  public T construct();
}
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `gson/src/main/java/com/google/gson/annotations/Expose.java`
#### Snippet
```java
   * @since 1.4
   */
  public boolean serialize() default true;

  /**
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `gson/src/main/java/com/google/gson/annotations/Expose.java`
#### Snippet
```java
   * @since 1.4
   */
  public boolean deserialize() default true;
}

```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `gson/src/main/java/com/google/gson/JsonDeserializationContext.java`
#### Snippet
```java
   * @throws JsonParseException if the parse tree does not contain expected data.
   */
  public <T> T deserialize(JsonElement json, Type typeOfT) throws JsonParseException;
}
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `gson/src/main/java/com/google/gson/JsonSerializer.java`
#### Snippet
```java
   * @return a JsonElement corresponding to the specified object.
   */
  public JsonElement serialize(T src, Type typeOfSrc, JsonSerializationContext context);
}

```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `gson/src/main/java/com/google/gson/JsonDeserializer.java`
#### Snippet
```java
   * @throws JsonParseException if json is not in the expected format of {@code typeofT}
   */
  public T deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
      throws JsonParseException;
}
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `gson/src/main/java/com/google/gson/ExclusionStrategy.java`
#### Snippet
```java
   * @return true if the class should be ignored; otherwise false
   */
  public boolean shouldSkipClass(Class<?> clazz);
}

```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `gson/src/main/java/com/google/gson/ExclusionStrategy.java`
#### Snippet
```java
   * @return true if the field should be ignored; otherwise false
   */
  public boolean shouldSkipField(FieldAttributes f);

  /**
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `private` is redundant for enum constructors
in `metrics/src/main/java/com/google/gson/metrics/ParseBenchmark.java`
#### Snippet
```java
    private final TypeReference<?> jacksonType;

    private Document(TypeToken<?> typeToken, TypeReference<?> typeReference) {
      this.gsonType = typeToken;
      this.jacksonType = typeReference;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `gson/src/main/java/com/google/gson/InstanceCreator.java`
#### Snippet
```java
   * @return a default object instance of type T.
   */
  public T createInstance(Type type);
}

```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `gson/src/main/java/com/google/gson/ToNumberStrategy.java`
#### Snippet
```java
   * @return number read from the JSON reader.
   */
  public Number readNumber(JsonReader in) throws IOException;
}

```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `gson/src/main/java/com/google/gson/FieldNamingStrategy.java`
#### Snippet
```java
   * @since 1.3
   */
  public String translateName(Field f);
}

```

## RuleId[ruleID=MagicConstant]
### RuleId[ruleID=MagicConstant]
Should be one of: Calendar.JANUARY, Calendar.FEBRUARY, Calendar.MARCH, Calendar.APRIL, Calendar.MAY, ...
in `gson/src/main/java/com/google/gson/internal/bind/util/ISO8601Utils.java`
#### Snippet
```java

            if (!hasT && (date.length() <= offset)) {
                Calendar calendar = new GregorianCalendar(year, month - 1, day);
                calendar.setLenient(false);

```

### RuleId[ruleID=MagicConstant]
Should be one of: Calendar.JANUARY, Calendar.FEBRUARY, Calendar.MARCH, Calendar.APRIL, Calendar.MAY, ...
in `gson/src/main/java/com/google/gson/internal/bind/TypeAdapters.java`
#### Snippet
```java
      }
      in.endObject();
      return new GregorianCalendar(year, month, dayOfMonth, hourOfDay, minute, second);
    }

```

## RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `RawCollectionsExample` has only 'static' members, and lacks a 'private' constructor
in `extras/src/main/java/com/google/gson/extras/examples/rawcollections/RawCollectionsExample.java`
#### Snippet
```java
import com.google.gson.JsonParser;

public class RawCollectionsExample {
  static class Event {
    private String name;
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `PreJava9DateFormatProvider` has only 'static' members, and lacks a 'private' constructor
in `gson/src/main/java/com/google/gson/internal/PreJava9DateFormatProvider.java`
#### Snippet
```java
 * Provides DateFormats for US locale with patterns which were the default ones before Java 9.
 */
public class PreJava9DateFormatProvider {

  /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `ISO8601Utils` has only 'static' members, and lacks a 'private' constructor
in `gson/src/main/java/com/google/gson/internal/bind/util/ISO8601Utils.java`
#### Snippet
```java
//Date parsing code from Jackson databind ISO8601Utils.java
// https://github.com/FasterXML/jackson-databind/blob/master/src/main/java/com/fasterxml/jackson/databind/util/ISO8601Utils.java
public class ISO8601Utils
{
    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `NonUploadingCaliperRunner` has only 'static' members, and lacks a 'private' constructor
in `metrics/src/main/java/com/google/gson/metrics/NonUploadingCaliperRunner.java`
#### Snippet
```java
import com.google.caliper.runner.CaliperMain;

class NonUploadingCaliperRunner {
  private static String[] concat(String first, String... others) {
    if (others.length == 0) {
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `JsonScope` has only 'static' members, and lacks a 'private' constructor
in `gson/src/main/java/com/google/gson/stream/JsonScope.java`
#### Snippet
```java
 * @since 1.6
 */
final class JsonScope {

    /**
```

## RuleId[ruleID=MarkedForRemoval]
### RuleId[ruleID=MarkedForRemoval]
'java.lang.SecurityManager' is deprecated and marked for removal
in `gson/src/main/java/com/google/gson/ReflectionAccessFilter.java`
#### Snippet
```java
     * {@link #ALLOW}. Access checks are only performed as defined by the Java
     * Language Specification (<a href="https://docs.oracle.com/javase/specs/jls/se11/html/jls-6.html#jls-6.6">JLS 11 &sect;6.6</a>),
     * restrictions imposed by a {@link SecurityManager} are not considered.
     *
     * <p>This result type is mainly intended to help enforce the access checks of
```

### RuleId[ruleID=MarkedForRemoval]
'java.security.AccessController' is deprecated and marked for removal
in `gson/src/main/java/com/google/gson/internal/bind/TypeAdapters.java`
#### Snippet
```java
import java.net.URISyntaxException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayDeque;
```

### RuleId[ruleID=MarkedForRemoval]
'java.security.AccessController' is deprecated and marked for removal
in `gson/src/main/java/com/google/gson/internal/bind/TypeAdapters.java`
#### Snippet
```java
        // Reflection access might throw SecurityException, therefore run this in privileged context;
        // should be acceptable because this only retrieves enum constants, but does not expose anything else
        Field[] constantFields = AccessController.doPrivileged(new PrivilegedAction<Field[]>() {
          @Override public Field[] run() {
            Field[] fields = classOfT.getDeclaredFields();
```

### RuleId[ruleID=MarkedForRemoval]
'java.security.AccessController' is deprecated and marked for removal
in `gson/src/main/java/com/google/gson/internal/bind/TypeAdapters.java`
#### Snippet
```java
        // Reflection access might throw SecurityException, therefore run this in privileged context;
        // should be acceptable because this only retrieves enum constants, but does not expose anything else
        Field[] constantFields = AccessController.doPrivileged(new PrivilegedAction<Field[]>() {
          @Override public Field[] run() {
            Field[] fields = classOfT.getDeclaredFields();
```

## RuleId[ruleID=UnnecessarySemicolon]
### RuleId[ruleID=UnnecessarySemicolon]
Unnecessary semicolon `;`
in `proto/src/main/java/com/google/gson/protobuf/ProtoTypeAdapter.java`
#### Snippet
```java
    NUMBER,
    /** Serializes and deserializes enum values using their <b>name</b>. */
    NAME;
  }

```

## RuleId[ruleID=DataFlowIssue]
### RuleId[ruleID=DataFlowIssue]
Casting `current` to `Map` may produce `ClassCastException`
in `gson/src/main/java/com/google/gson/internal/bind/ObjectTypeAdapter.java`
#### Snippet
```java
        } else {
          @SuppressWarnings("unchecked")
          Map<String, Object> map = (Map<String, Object>) current;
          map.put(name, value);
        }
```

### RuleId[ruleID=DataFlowIssue]
Variable is already assigned to this value
in `gson/src/main/java/com/google/gson/internal/bind/TypeAdapterRuntimeTypeWrapper.java`
#### Snippet
```java
        // The user registered a type adapter for Base class, so we prefer it over the
        // reflective type adapter for the runtime type
        chosen = delegate;
      } else {
        // Use the type adapter for runtime type
```

### RuleId[ruleID=DataFlowIssue]
Dereference of `created` may produce `NullPointerException`
in `gson/src/main/java/com/google/gson/internal/LinkedTreeMap.java`
#### Snippet
```java
    }
    Node<K, V> created = find(key, true);
    V result = created.value;
    created.value = value;
    return result;
```

### RuleId[ruleID=DataFlowIssue]
Dereference of `right` may produce `NullPointerException`
in `gson/src/main/java/com/google/gson/internal/LinkedTreeMap.java`
#### Snippet
```java
      int delta = leftHeight - rightHeight;
      if (delta == -2) {
        Node<K, V> rightLeft = right.left;
        Node<K, V> rightRight = right.right;
        int rightRightHeight = rightRight != null ? rightRight.height : 0;
```

### RuleId[ruleID=DataFlowIssue]
Dereference of `left` may produce `NullPointerException`
in `gson/src/main/java/com/google/gson/internal/LinkedTreeMap.java`
#### Snippet
```java

      } else if (delta == 2) {
        Node<K, V> leftLeft = left.left;
        Node<K, V> leftRight = left.right;
        int leftRightHeight = leftRight != null ? leftRight.height : 0;
```

### RuleId[ruleID=DataFlowIssue]
Argument `nearest.key` might be null
in `gson/src/main/java/com/google/gson/internal/LinkedTreeMap.java`
#### Snippet
```java
      while (true) {
        comparison = (comparableKey != null)
            ? comparableKey.compareTo(nearest.key)
            : comparator.compare(key, nearest.key);

```

### RuleId[ruleID=DataFlowIssue]
Variable is already assigned to this value
in `gson/src/main/java/com/google/gson/internal/$Gson$Types.java`
#### Snippet
```java
          }
        }
        toResolve = original;
        break;

```

### RuleId[ruleID=DataFlowIssue]
Casting `current` to `JsonObject` may produce `ClassCastException`
in `gson/src/main/java/com/google/gson/internal/bind/TypeAdapters.java`
#### Snippet
```java
            ((JsonArray) current).add(value);
          } else {
            ((JsonObject) current).add(name, value);
          }

```

### RuleId[ruleID=DataFlowIssue]
Argument `language` might be null
in `gson/src/main/java/com/google/gson/internal/bind/TypeAdapters.java`
#### Snippet
```java
      }
      if (country == null && variant == null) {
        return new Locale(language);
      } else if (variant == null) {
        return new Locale(language, country);
```

### RuleId[ruleID=DataFlowIssue]
Argument `country` might be null
in `gson/src/main/java/com/google/gson/internal/bind/TypeAdapters.java`
#### Snippet
```java
        return new Locale(language, country);
      } else {
        return new Locale(language, country, variant);
      }
    }
```

## RuleId[ruleID=CommentedOutCode]
### RuleId[ruleID=CommentedOutCode]
Commented out code (3 lines)
in `gson/src/main/java/com/google/gson/internal/UnsafeAllocator.java`
#### Snippet
```java
  private static UnsafeAllocator create() {
    // try JVM
    // public class Unsafe {
    //   public Object allocateInstance(Class<?> type);
    // }
```

### RuleId[ruleID=CommentedOutCode]
Commented out code (4 lines)
in `gson/src/main/java/com/google/gson/internal/UnsafeAllocator.java`
#### Snippet
```java

    // try dalvikvm, post-gingerbread
    // public class ObjectStreamClass {
    //   private static native int getConstructorId(Class<?> c);
    //   private static native Object newInstance(Class<?> instantiationClass, int methodId);
```

### RuleId[ruleID=CommentedOutCode]
Commented out code (4 lines)
in `gson/src/main/java/com/google/gson/internal/UnsafeAllocator.java`
#### Snippet
```java

    // try dalvikvm, pre-gingerbread
    // public class ObjectInputStream {
    //   private static native Object newInstance(
    //     Class<?> instantiationClass, Class<?> constructorClass);
```

## RuleId[ruleID=DeprecatedIsStillUsed]
### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'getAsCharacter' is still used
in `gson/src/main/java/com/google/gson/JsonElement.java`
#### Snippet
```java
   */
  @Deprecated
  public char getAsCharacter() {
    throw new UnsupportedOperationException(getClass().getSimpleName());
  }
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'getAsCharacter' is still used
in `gson/src/main/java/com/google/gson/JsonPrimitive.java`
#### Snippet
```java
  @Deprecated
  @Override
  public char getAsCharacter() {
    String s = getAsString();
    if (s.isEmpty()) {
```

## RuleId[ruleID=JavaReflectionMemberAccess]
### RuleId[ruleID=JavaReflectionMemberAccess]
Cannot resolve method 'getConstructorId'
in `gson/src/main/java/com/google/gson/internal/UnsafeAllocator.java`
#### Snippet
```java
    try {
      Method getConstructorId = ObjectStreamClass.class
          .getDeclaredMethod("getConstructorId", Class.class);
      getConstructorId.setAccessible(true);
      final int constructorId = (Integer) getConstructorId.invoke(null, Object.class);
```

### RuleId[ruleID=JavaReflectionMemberAccess]
Cannot resolve method 'newInstance' with specified argument types
in `gson/src/main/java/com/google/gson/internal/UnsafeAllocator.java`
#### Snippet
```java
      final int constructorId = (Integer) getConstructorId.invoke(null, Object.class);
      final Method newInstance = ObjectStreamClass.class
          .getDeclaredMethod("newInstance", Class.class, int.class);
      newInstance.setAccessible(true);
      return new UnsafeAllocator() {
```

### RuleId[ruleID=JavaReflectionMemberAccess]
Cannot resolve method 'newInstance'
in `gson/src/main/java/com/google/gson/internal/UnsafeAllocator.java`
#### Snippet
```java
    try {
      final Method newInstance = ObjectInputStream.class
          .getDeclaredMethod("newInstance", Class.class, Class.class);
      newInstance.setAccessible(true);
      return new UnsafeAllocator() {
```

## RuleId[ruleID=FinalPrivateMethod]
### RuleId[ruleID=FinalPrivateMethod]
'private' method declared `final`
in `gson/src/main/java/com/google/gson/internal/bind/DefaultDateTypeAdapter.java`
#### Snippet
```java
    protected abstract T deserialize(Date date);

    private final TypeAdapterFactory createFactory(DefaultDateTypeAdapter<T> adapter) {
      return TypeAdapters.newFactory(dateClass, adapter);
    }
```

## RuleId[ruleID=NonSerializableFieldInSerializableClass]
### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'gsonType' in a Serializable class
in `metrics/src/main/java/com/google/gson/metrics/ParseBenchmark.java`
#### Snippet
```java
    READER_LONG(new TypeToken<Feed>() {}, new TypeReference<Feed>() {});

    private final TypeToken<?> gsonType;
    private final TypeReference<?> jacksonType;

```

## RuleId[ruleID=SizeReplaceableByIsEmpty]
### RuleId[ruleID=SizeReplaceableByIsEmpty]
`members.size() == 0` can be replaced with 'members.isEmpty()'
in `gson/src/main/java/com/google/gson/JsonObject.java`
#### Snippet
```java
   */
  public boolean isEmpty() {
    return members.size() == 0;
  }

```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`translation.length() != 0` can be replaced with '!translation.isEmpty()'
in `gson/src/main/java/com/google/gson/FieldNamingPolicy.java`
#### Snippet
```java
    for (int i = 0, length = name.length(); i < length; i++) {
      char character = name.charAt(i);
      if (Character.isUpperCase(character) && translation.length() != 0) {
        translation.append(separator);
      }
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`indent.length() == 0` can be replaced with 'indent.isEmpty()'
in `gson/src/main/java/com/google/gson/stream/JsonWriter.java`
#### Snippet
```java
   */
  public final void setIndent(String indent) {
    if (indent.length() == 0) {
      this.indent = null;
      this.separator = ":";
```

## RuleId[ruleID=StringBufferReplaceableByString]
### RuleId[ruleID=StringBufferReplaceableByString]
`StringBuilder sb` can be replaced with 'String'
in `metrics/src/main/java/com/google/gson/metrics/BagOfPrimitives.java`
#### Snippet
```java

  public String getExpectedJson() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    sb.append("\"longValue\":").append(longValue).append(",");
```

### RuleId[ruleID=StringBufferReplaceableByString]
`StringBuilder` can be replaced with 'String'
in `gson/src/main/java/com/google/gson/Gson.java`
#### Snippet
```java
  @Override
  public String toString() {
    return new StringBuilder("{serializeNulls:")
        .append(serializeNulls)
        .append(",factories:").append(factories)
```

## RuleId[ruleID=NonShortCircuitBoolean]
### RuleId[ruleID=NonShortCircuitBoolean]
Non-short-circuit boolean expression `hasComplexKeys |= keyElement.isJsonArray() || keyElement.isJsonObject()`
in `gson/src/main/java/com/google/gson/internal/bind/MapTypeAdapterFactory.java`
#### Snippet
```java
        keys.add(keyElement);
        values.add(entry.getValue());
        hasComplexKeys |= keyElement.isJsonArray() || keyElement.isJsonObject();
      }

```

### RuleId[ruleID=NonShortCircuitBoolean]
Non-short-circuit boolean expression `fitsInLong &= value > MIN_INCOMPLETE_INTEGER || (value == MIN_INCOMPLETE_INTEGER && ne...`
in `gson/src/main/java/com/google/gson/stream/JsonReader.java`
#### Snippet
```java
          }
          long newValue = value * 10 - (c - '0');
          fitsInLong &= value > MIN_INCOMPLETE_INTEGER
              || (value == MIN_INCOMPLETE_INTEGER && newValue < value);
          value = newValue;
        } else if (last == NUMBER_CHAR_DECIMAL) {
```

## RuleId[ruleID=UnnecessaryToStringCall]
### RuleId[ruleID=UnnecessaryToStringCall]
Unnecessary `toString()` call
in `gson/src/main/java/com/google/gson/reflect/TypeToken.java`
#### Snippet
```java
    }
    exceptionMessage.append("but got: ").append(token.getClass().getName())
        .append(", for type token: ").append(token.toString()).append('.');

    return new AssertionError(exceptionMessage.toString());
```

### RuleId[ruleID=UnnecessaryToStringCall]
Unnecessary `toString()` call
in `gson/src/main/java/com/google/gson/internal/ConstructorConstructor.java`
#### Snippet
```java
              return map;
            } else {
              throw new JsonIOException("Invalid EnumMap type: " + type.toString());
            }
          } else {
```

### RuleId[ruleID=UnnecessaryToStringCall]
Unnecessary `toString()` call
in `gson/src/main/java/com/google/gson/internal/ConstructorConstructor.java`
#### Snippet
```java
              return set;
            } else {
              throw new JsonIOException("Invalid EnumSet type: " + type.toString());
            }
          } else {
```

## RuleId[ruleID=AssignmentToForLoopParameter]
### RuleId[ruleID=AssignmentToForLoopParameter]
Assignment to for-loop parameter `i`
in `gson/src/main/java/com/google/gson/internal/bind/JsonTreeReader.java`
#### Snippet
```java
    for (int i = 0; i < stackSize; i++) {
      if (stack[i] instanceof JsonArray) {
        if (++i < stackSize && stack[i] instanceof Iterator) {
          int pathIndex = pathIndices[i];
          // If index is last path element it points to next array element; have to decrement
```

### RuleId[ruleID=AssignmentToForLoopParameter]
Assignment to for-loop parameter `i`
in `gson/src/main/java/com/google/gson/internal/bind/JsonTreeReader.java`
#### Snippet
```java
        }
      } else if (stack[i] instanceof JsonObject) {
        if (++i < stackSize && stack[i] instanceof Iterator) {
          result.append('.');
          if (pathNames[i] != null) {
```

## RuleId[ruleID=BoundedWildcard]
### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends InstanceCreator`
in `extras/src/main/java/com/google/gson/graph/GraphAdapterBuilder.java`
#### Snippet
```java
    private final ThreadLocal<Graph> graphThreadLocal = new ThreadLocal<>();

    Factory(Map<Type, InstanceCreator<?>> instanceCreators) {
      this.instanceCreators = instanceCreators;
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super T`
in `gson/src/main/java/com/google/gson/internal/bind/JsonAdapterAnnotationTypeAdapterFactory.java`
#### Snippet
```java
  @SuppressWarnings("unchecked") // this is not safe; requires that user has specified correct adapter class for @JsonAdapter
  @Override
  public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> targetType) {
    Class<? super T> rawType = targetType.getRawType();
    JsonAdapter annotation = rawType.getAnnotation(JsonAdapter.class);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ReflectionAccessFilter`
in `gson/src/main/java/com/google/gson/internal/ReflectionAccessFilterHelper.java`
#### Snippet
```java
   * the list of filters is empty or all returned {@code INDECISIVE}.
   */
  public static FilterResult getFilterResult(List<ReflectionAccessFilter> reflectionFilters, Class<?> c) {
    for (ReflectionAccessFilter filter : reflectionFilters) {
      FilterResult result = filter.check(c);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super T`
in `gson/src/main/java/com/google/gson/internal/bind/TreeTypeAdapter.java`
#### Snippet
```java
  private volatile TypeAdapter<T> delegate;

  public TreeTypeAdapter(JsonSerializer<T> serializer, JsonDeserializer<T> deserializer,
      Gson gson, TypeToken<T> typeToken, TypeAdapterFactory skipPast, boolean nullSafe) {
    this.serializer = serializer;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `gson/src/main/java/com/google/gson/internal/bind/TreeTypeAdapter.java`
#### Snippet
```java
  private volatile TypeAdapter<T> delegate;

  public TreeTypeAdapter(JsonSerializer<T> serializer, JsonDeserializer<T> deserializer,
      Gson gson, TypeToken<T> typeToken, TypeAdapterFactory skipPast, boolean nullSafe) {
    this.serializer = serializer;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super TypeAdapterFactory`
in `gson/src/main/java/com/google/gson/GsonBuilder.java`
#### Snippet
```java

  private void addTypeAdaptersForDate(String datePattern, int dateStyle, int timeStyle,
      List<TypeAdapterFactory> factories) {
    TypeAdapterFactory dateAdapterFactory;
    boolean sqlTypesSupported = SqlTypesSupport.SUPPORTS_SQL_TYPES;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Extension`
in `proto/src/main/java/com/google/gson/protobuf/ProtoTypeAdapter.java`
#### Snippet
```java
      CaseFormat protoFormat,
      CaseFormat jsonFormat,
      Set<Extension<FieldOptions, String>> serializedNameExtensions,
      Set<Extension<EnumValueOptions, String>> serializedEnumValueExtensions) {
    this.enumSerialization = enumSerialization;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Extension`
in `proto/src/main/java/com/google/gson/protobuf/ProtoTypeAdapter.java`
#### Snippet
```java
      CaseFormat jsonFormat,
      Set<Extension<FieldOptions, String>> serializedNameExtensions,
      Set<Extension<EnumValueOptions, String>> serializedEnumValueExtensions) {
    this.enumSerialization = enumSerialization;
    this.protoFormat = protoFormat;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super TypeVariable`
in `gson/src/main/java/com/google/gson/internal/$Gson$Types.java`
#### Snippet
```java

  private static Type resolve(Type context, Class<?> contextRawType, Type toResolve,
                              Map<TypeVariable<?>, Type> visitedTypeVariables) {
    // this implementation is made a little more complicated in an attempt to avoid object-creation
    TypeVariable<?> resolving = null;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super T`
in `gson/src/main/java/com/google/gson/internal/ConstructorConstructor.java`
#### Snippet
```java
  }

  public <T> ObjectConstructor<T> get(TypeToken<T> typeToken) {
    final Type type = typeToken.getType();
    final Class<? super T> rawType = typeToken.getRawType();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `gson/src/main/java/com/google/gson/internal/bind/ReflectiveTypeAdapterFactory.java`
#### Snippet
```java
    private final ObjectConstructor<T> constructor;

    FieldReflectionAdapter(ObjectConstructor<T> constructor, Map<String, BoundField> boundFields) {
      super(boundFields);
      this.constructor = constructor;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends BoundField`
in `gson/src/main/java/com/google/gson/internal/bind/ReflectiveTypeAdapterFactory.java`
#### Snippet
```java
    final Map<String, BoundField> boundFields;

    Adapter(Map<String, BoundField> boundFields) {
      this.boundFields = boundFields;
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super T2`
in `gson/src/main/java/com/google/gson/internal/bind/TypeAdapters.java`
#### Snippet
```java
    return new TypeAdapterFactory() {
      @SuppressWarnings("unchecked")
      @Override public <T2> TypeAdapter<T2> create(Gson gson, TypeToken<T2> typeToken) {
        final Class<? super T2> requestedType = typeToken.getRawType();
        if (!clazz.isAssignableFrom(requestedType)) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super T`
in `gson/src/main/java/com/google/gson/internal/bind/TypeAdapters.java`
#### Snippet
```java
    return new TypeAdapterFactory() {
      @SuppressWarnings("unchecked") // we use a runtime check to make sure the 'T's equal
      @Override public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        Class<? super T> rawType = typeToken.getRawType();
        return (rawType == base || rawType == sub) ? (TypeAdapter<T>) typeAdapter : null;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super T`
in `gson/src/main/java/com/google/gson/internal/bind/TypeAdapters.java`
#### Snippet
```java

  public static final TypeAdapterFactory ENUM_FACTORY = new TypeAdapterFactory() {
    @Override public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
      Class<? super T> rawType = typeToken.getRawType();
      if (!Enum.class.isAssignableFrom(rawType) || rawType == Enum.class) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super T`
in `gson/src/main/java/com/google/gson/internal/bind/TypeAdapters.java`
#### Snippet
```java
    return new TypeAdapterFactory() {
      @SuppressWarnings("unchecked") // we use a runtime check to make sure the 'T's equal
      @Override public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        Class<? super T> rawType = typeToken.getRawType();
        return (rawType == unboxed || rawType == boxed) ? (TypeAdapter<T>) typeAdapter : null;
```

## RuleId[ruleID=MissortedModifiers]
### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `static abstract`
in `gson/src/main/java/com/google/gson/internal/ReflectionAccessFilterHelper.java`
#### Snippet
```java
  }

  private static abstract class AccessChecker {
    public static final AccessChecker INSTANCE;
    static {
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `static abstract`
in `gson/src/main/java/com/google/gson/internal/bind/DefaultDateTypeAdapter.java`
#### Snippet
```java
  private static final String SIMPLE_NAME = "DefaultDateTypeAdapter";

  public static abstract class DateType<T extends Date> {
    public static final DateType<Date> DATE = new DateType<Date>(Date.class) {
      @Override protected Date deserialize(Date date) {
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `extras/src/main/java/com/google/gson/typeadapters/PostConstructAdapterFactory.java`
#### Snippet
```java
    }

    final static class PostConstructAdapter<T> extends TypeAdapter<T> {
        private final TypeAdapter<T> delegate;
        private final Method method;
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `static abstract`
in `gson/src/main/java/com/google/gson/internal/bind/ReflectiveTypeAdapterFactory.java`
#### Snippet
```java
  }

  static abstract class BoundField {
    final String name;
    /** Name of the underlying field */
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `static abstract`
in `gson/src/main/java/com/google/gson/internal/bind/ReflectiveTypeAdapterFactory.java`
#### Snippet
```java
   */
  // This class is public because external projects check for this class with `instanceof` (even though it is internal)
  public static abstract class Adapter<T, A> extends TypeAdapter<T> {
    final Map<String, BoundField> boundFields;

```

## RuleId[ruleID=RedundantSuppression]
### RuleId[ruleID=RedundantSuppression]
Redundant suppression
in `gson/src/main/java/com/google/gson/stream/JsonReader.java`
#### Snippet
```java
   */
  @SuppressWarnings("fallthrough")
  private char readEscapeCharacter() throws IOException {
    if (pos == limit && !fillBuffer(1)) {
      throw syntaxError("Unterminated escape sequence");
```

### RuleId[ruleID=RedundantSuppression]
Redundant suppression
in `gson/src/main/java/com/google/gson/stream/JsonWriter.java`
#### Snippet
```java
   */
  @SuppressWarnings("fallthrough")
  private void beforeValue() throws IOException {
    switch (peek()) {
    case NONEMPTY_DOCUMENT:
```

## RuleId[ruleID=UnnecessaryUnboxing]
### RuleId[ruleID=UnnecessaryUnboxing]
Unnecessary unboxing
in `gson/src/main/java/com/google/gson/JsonPrimitive.java`
#### Snippet
```java
  public boolean getAsBoolean() {
    if (isBoolean()) {
      return ((Boolean) value).booleanValue();
    }
	// Check to see if the value as a String is "true" in any case.
```

## RuleId[ruleID=SystemOutErr]
### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `extras/src/main/java/com/google/gson/extras/examples/rawcollections/RawCollectionsExample.java`
#### Snippet
```java
    collection.add(new Event("GREETINGS", "guest"));
    String json = gson.toJson(collection);
    System.out.println("Using Gson.toJson() on a raw collection: " + json);
    JsonArray array = JsonParser.parseString(json).getAsJsonArray();
    String message = gson.fromJson(array.get(0), String.class);
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `extras/src/main/java/com/google/gson/extras/examples/rawcollections/RawCollectionsExample.java`
#### Snippet
```java
    int number = gson.fromJson(array.get(1), int.class);
    Event event = gson.fromJson(array.get(2), Event.class);
    System.out.printf("Using Gson.fromJson() to get: %s, %d, %s", message, number, event);
  }
}
```

## RuleId[ruleID=ConditionCoveredByFurtherCondition]
### RuleId[ruleID=ConditionCoveredByFurtherCondition]
Condition 'this == other' covered by subsequent condition 'other instanceof JsonNull'
in `gson/src/main/java/com/google/gson/JsonNull.java`
#### Snippet
```java
  @Override
  public boolean equals(Object other) {
    return this == other || other instanceof JsonNull;
  }
}
```

## RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `gson/src/main/java/com/google/gson/internal/bind/util/ISO8601Utils.java`
#### Snippet
```java
                         *   If it becomes a perf problem, add 'loose' comparison instead.
                         */
                        String cleaned = act.replace(":", "");
                        if (!cleaned.equals(timezoneId)) {
                            throw new IndexOutOfBoundsException("Mismatching time zone indicator: "+timezoneId+" given, resolves to "
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `gson/src/main/java/com/google/gson/internal/JavaVersion.java`
#### Snippet
```java
  private static int parseDotted(String javaVersion) {
    try {
      String[] parts = javaVersion.split("[._]");
      int firstVer = Integer.parseInt(parts[0]);
      if (firstVer == 1 && parts.length > 1) {
```

## RuleId[ruleID=UnnecessaryFullyQualifiedName]
### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.gson` is unnecessary and can be removed
in `gson/src/main/java/com/google/gson/TypeAdapterFactory.java`
#### Snippet
```java
 *
 * <p>As with type adapters, factories must be <i>registered</i> with a {@link
 * com.google.gson.GsonBuilder} for them to take effect: <pre>   {@code
 *
 *  GsonBuilder builder = new GsonBuilder();
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.gson` is unnecessary and can be removed
in `gson/src/main/java/com/google/gson/JsonSerializer.java`
#### Snippet
```java
 * Interface representing a custom serializer for JSON. You should write a custom serializer, if
 * you are not happy with the default serialization done by Gson. You will also need to register
 * this serializer through {@link com.google.gson.GsonBuilder#registerTypeAdapter(Type, Object)}.
 *
 * <p>Let us look at example where defining a serializer will be useful. The {@code Id} class
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.text` is unnecessary and can be removed
in `gson/src/main/java/com/google/gson/GsonBuilder.java`
#### Snippet
```java
   *
   * <p>Note that this style value should be one of the predefined constants in the
   * {@code DateFormat} class. See the documentation in {@link java.text.DateFormat} for more
   * information on the valid style constants.</p>
   *
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.text` is unnecessary and can be removed
in `gson/src/main/java/com/google/gson/GsonBuilder.java`
#### Snippet
```java
   *
   * <p>Note that this style value should be one of the predefined constants in the
   * {@code DateFormat} class. See the documentation in {@link java.text.DateFormat} for more
   * information on the valid style constants.</p>
   *
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary and can be removed
in `gson/src/main/java/com/google/gson/GsonBuilder.java`
#### Snippet
```java
   * will be used to decide the serialization format.
   *
   * <p>The date format will be used to serialize and deserialize {@link java.util.Date} and in case
   * the {@code java.sql} module is present, also {@link java.sql.Timestamp} and {@link java.sql.Date}.
   *
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.gson` is unnecessary and can be removed
in `gson/src/main/java/com/google/gson/FieldNamingPolicy.java`
#### Snippet
```java
/**
 * An enumeration that defines a few standard naming conventions for JSON field names.
 * This enumeration should be used in conjunction with {@link com.google.gson.GsonBuilder}
 * to configure a {@link com.google.gson.Gson} instance to properly translate Java field
 * names into the desired JSON field names.
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.gson` is unnecessary and can be removed
in `gson/src/main/java/com/google/gson/FieldNamingPolicy.java`
#### Snippet
```java
 * An enumeration that defines a few standard naming conventions for JSON field names.
 * This enumeration should be used in conjunction with {@link com.google.gson.GsonBuilder}
 * to configure a {@link com.google.gson.Gson} instance to properly translate Java field
 * names into the desired JSON field names.
 *
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.gson.stream` is unnecessary, and can be replaced with an import
in `metrics/src/main/java/com/google/gson/metrics/ParseBenchmark.java`
#### Snippet
```java
    @Override
    public void parse(char[] data, Document document) throws Exception {
      com.google.gson.stream.JsonReader jsonReader
          = new com.google.gson.stream.JsonReader(new CharArrayReader(data));
      readToken(jsonReader);
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.gson.stream` is unnecessary, and can be replaced with an import
in `metrics/src/main/java/com/google/gson/metrics/ParseBenchmark.java`
#### Snippet
```java
    public void parse(char[] data, Document document) throws Exception {
      com.google.gson.stream.JsonReader jsonReader
          = new com.google.gson.stream.JsonReader(new CharArrayReader(data));
      readToken(jsonReader);
      jsonReader.close();
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.gson.stream` is unnecessary, and can be replaced with an import
in `metrics/src/main/java/com/google/gson/metrics/ParseBenchmark.java`
#### Snippet
```java
    @Override
    public void parse(char[] data, Document document) throws Exception {
      com.google.gson.stream.JsonReader jsonReader
          = new com.google.gson.stream.JsonReader(new CharArrayReader(data));
      jsonReader.skipValue();
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.gson.stream` is unnecessary, and can be replaced with an import
in `metrics/src/main/java/com/google/gson/metrics/ParseBenchmark.java`
#### Snippet
```java
    public void parse(char[] data, Document document) throws Exception {
      com.google.gson.stream.JsonReader jsonReader
          = new com.google.gson.stream.JsonReader(new CharArrayReader(data));
      jsonReader.skipValue();
      jsonReader.close();
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.gson.stream` is unnecessary, and can be replaced with an import
in `metrics/src/main/java/com/google/gson/metrics/ParseBenchmark.java`
#### Snippet
```java
    }

    private void readToken(com.google.gson.stream.JsonReader reader) throws IOException {
      while (true) {
        switch (reader.peek()) {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `proto/src/main/java/com/google/gson/protobuf/ProtoTypeAdapter.java`
#### Snippet
```java
  }

  private static final com.google.protobuf.Descriptors.FieldDescriptor.Type ENUM_TYPE =
      com.google.protobuf.Descriptors.FieldDescriptor.Type.ENUM;

```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `proto/src/main/java/com/google/gson/protobuf/ProtoTypeAdapter.java`
#### Snippet
```java

  private static final com.google.protobuf.Descriptors.FieldDescriptor.Type ENUM_TYPE =
      com.google.protobuf.Descriptors.FieldDescriptor.Type.ENUM;

  private static final ConcurrentMap<String, ConcurrentMap<Class<?>, Method>> mapOfMapOfMethods =
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.io` is unnecessary and can be removed
in `gson/src/main/java/com/google/gson/internal/$Gson$Types.java`
#### Snippet
```java
   * {@code componentType}.
   *
   * @return a {@link java.io.Serializable serializable} generic array type.
   */
  public static GenericArrayType arrayOf(Type componentType) {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.io` is unnecessary and can be removed
in `gson/src/main/java/com/google/gson/internal/$Gson$Types.java`
#### Snippet
```java
   * {@code rawType} and enclosed by {@code ownerType}.
   *
   * @return a {@link java.io.Serializable serializable} parameterized type.
   */
  public static ParameterizedType newParameterizedTypeWithOwner(
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.io` is unnecessary and can be removed
in `gson/src/main/java/com/google/gson/internal/$Gson$Types.java`
#### Snippet
```java
   * Returns a type that is functionally equal but not necessarily equal
   * according to {@link Object#equals(Object) Object.equals()}. The returned
   * type is {@link java.io.Serializable}.
   */
  public static Type canonicalize(Type type) {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.gson.reflect` is unnecessary and can be removed
in `gson/src/main/java/com/google/gson/Gson.java`
#### Snippet
```java
   * @param src the object for which JSON representation is to be created
   * @param typeOfSrc The specific genericized type of src. You can obtain
   * this type by using the {@link com.google.gson.reflect.TypeToken} class. For example,
   * to get the type for {@code Collection<Foo>}, you should use:
   * <pre>
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.gson.reflect` is unnecessary and can be removed
in `gson/src/main/java/com/google/gson/Gson.java`
#### Snippet
```java
   * @param src the object for which JSON representation is to be created
   * @param typeOfSrc The specific genericized type of src. You can obtain
   * this type by using the {@link com.google.gson.reflect.TypeToken} class. For example,
   * to get the type for {@code Collection<Foo>}, you should use:
   * <pre>
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.math` is unnecessary and can be removed
in `gson/src/main/java/com/google/gson/Gson.java`
#### Snippet
```java
   *   <li>Gson provides default serialization and deserialization for Enums, {@link Map},
   *   {@link java.net.URL}, {@link java.net.URI}, {@link java.util.Locale}, {@link java.util.Date},
   *   {@link java.math.BigDecimal}, and {@link java.math.BigInteger} classes. If you would prefer
   *   to change the default representation, you can do so by registering a type adapter through
   *   {@link GsonBuilder#registerTypeAdapter(Type, Object)}. </li>
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.math` is unnecessary and can be removed
in `gson/src/main/java/com/google/gson/Gson.java`
#### Snippet
```java
   *   <li>Gson provides default serialization and deserialization for Enums, {@link Map},
   *   {@link java.net.URL}, {@link java.net.URI}, {@link java.util.Locale}, {@link java.util.Date},
   *   {@link java.math.BigDecimal}, and {@link java.math.BigInteger} classes. If you would prefer
   *   to change the default representation, you can do so by registering a type adapter through
   *   {@link GsonBuilder#registerTypeAdapter(Type, Object)}. </li>
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.text` is unnecessary and can be removed
in `gson/src/main/java/com/google/gson/Gson.java`
#### Snippet
```java
   *   to change the default representation, you can do so by registering a type adapter through
   *   {@link GsonBuilder#registerTypeAdapter(Type, Object)}. </li>
   *   <li>The default Date format is same as {@link java.text.DateFormat#DEFAULT}. This format
   *   ignores the millisecond portion of the date during serialization. You can change
   *   this by invoking {@link GsonBuilder#setDateFormat(int)} or
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.gson.reflect` is unnecessary and can be removed
in `gson/src/main/java/com/google/gson/Gson.java`
#### Snippet
```java
   * @param src the object for which JSON representation is to be created
   * @param typeOfSrc The specific genericized type of src. You can obtain
   * this type by using the {@link com.google.gson.reflect.TypeToken} class. For example,
   * to get the type for {@code Collection<Foo>}, you should use:
   * <pre>
```

## RuleId[ruleID=UNUSED_IMPORT]
### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.lang.reflect.Type;`
in `metrics/src/main/java/com/google/gson/metrics/ParseBenchmark.java`
#### Snippet
```java
import java.io.Reader;
import java.io.StringWriter;
import java.lang.reflect.Type;
import java.net.URL;
import java.text.SimpleDateFormat;
```

## RuleId[ruleID=NestedAssignment]
### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `extras/src/main/java/com/google/gson/typeadapters/UtcDateTypeAdapter.java`
#### Snippet
```java

      // extract year
      int year = parseInt(date, offset, offset += 4);
      if (checkOffset(date, offset, '-')) {
        offset += 1;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `extras/src/main/java/com/google/gson/typeadapters/UtcDateTypeAdapter.java`
#### Snippet
```java

      // extract month
      int month = parseInt(date, offset, offset += 2);
      if (checkOffset(date, offset, '-')) {
        offset += 1;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `extras/src/main/java/com/google/gson/typeadapters/UtcDateTypeAdapter.java`
#### Snippet
```java

      // extract day
      int day = parseInt(date, offset, offset += 2);
      // default time value
      int hour = 0;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `extras/src/main/java/com/google/gson/typeadapters/UtcDateTypeAdapter.java`
#### Snippet
```java

        // extract hours, minutes, seconds and milliseconds
        hour = parseInt(date, offset += 1, offset += 2);
        if (checkOffset(date, offset, ':')) {
          offset += 1;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `extras/src/main/java/com/google/gson/typeadapters/UtcDateTypeAdapter.java`
#### Snippet
```java

        // extract hours, minutes, seconds and milliseconds
        hour = parseInt(date, offset += 1, offset += 2);
        if (checkOffset(date, offset, ':')) {
          offset += 1;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `extras/src/main/java/com/google/gson/typeadapters/UtcDateTypeAdapter.java`
#### Snippet
```java
        }

        minutes = parseInt(date, offset, offset += 2);
        if (checkOffset(date, offset, ':')) {
          offset += 1;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `extras/src/main/java/com/google/gson/typeadapters/UtcDateTypeAdapter.java`
#### Snippet
```java
          char c = date.charAt(offset);
          if (c != 'Z' && c != '+' && c != '-') {
            seconds = parseInt(date, offset, offset += 2);
            // milliseconds can be optional in the format
            if (checkOffset(date, offset, '.')) {
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `extras/src/main/java/com/google/gson/typeadapters/UtcDateTypeAdapter.java`
#### Snippet
```java
            // milliseconds can be optional in the format
            if (checkOffset(date, offset, '.')) {
              milliseconds = parseInt(date, offset += 1, offset += 3);
            }
          }
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `extras/src/main/java/com/google/gson/typeadapters/UtcDateTypeAdapter.java`
#### Snippet
```java
            // milliseconds can be optional in the format
            if (checkOffset(date, offset, '.')) {
              milliseconds = parseInt(date, offset += 1, offset += 3);
            }
          }
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `gson/src/main/java/com/google/gson/internal/bind/util/ISO8601Utils.java`
#### Snippet
```java

            // extract year
            int year = parseInt(date, offset, offset += 4);
            if (checkOffset(date, offset, '-')) {
                offset += 1;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `gson/src/main/java/com/google/gson/internal/bind/util/ISO8601Utils.java`
#### Snippet
```java

            // extract month
            int month = parseInt(date, offset, offset += 2);
            if (checkOffset(date, offset, '-')) {
                offset += 1;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `gson/src/main/java/com/google/gson/internal/bind/util/ISO8601Utils.java`
#### Snippet
```java

            // extract day
            int day = parseInt(date, offset, offset += 2);
            // default time value
            int hour = 0;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `gson/src/main/java/com/google/gson/internal/bind/util/ISO8601Utils.java`
#### Snippet
```java

                // extract hours, minutes, seconds and milliseconds
                hour = parseInt(date, offset += 1, offset += 2);
                if (checkOffset(date, offset, ':')) {
                    offset += 1;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `gson/src/main/java/com/google/gson/internal/bind/util/ISO8601Utils.java`
#### Snippet
```java

                // extract hours, minutes, seconds and milliseconds
                hour = parseInt(date, offset += 1, offset += 2);
                if (checkOffset(date, offset, ':')) {
                    offset += 1;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `gson/src/main/java/com/google/gson/internal/bind/util/ISO8601Utils.java`
#### Snippet
```java
                }

                minutes = parseInt(date, offset, offset += 2);
                if (checkOffset(date, offset, ':')) {
                    offset += 1;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `gson/src/main/java/com/google/gson/internal/bind/util/ISO8601Utils.java`
#### Snippet
```java
                    char c = date.charAt(offset);
                    if (c != 'Z' && c != '+' && c != '-') {
                        seconds = parseInt(date, offset, offset += 2);
                        if (seconds > 59 && seconds < 63) seconds = 59; // truncate up to 3 leap seconds
                        // milliseconds can be optional in the format
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `gson/src/main/java/com/google/gson/internal/Excluder.java`
#### Snippet
```java
        return d != null
            ? d
            : (delegate = gson.getDelegateAdapter(Excluder.this, type));
      }
    };
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `extras/src/main/java/com/google/gson/graph/GraphAdapterBuilder.java`
#### Snippet
```java
              out.beginObject();
              Element<?> current;
              while ((current = graph.queue.poll()) != null) {
                out.name(current.id);
                current.write(out);
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `gson/src/main/java/com/google/gson/internal/bind/TreeTypeAdapter.java`
#### Snippet
```java
    return d != null
        ? d
        : (delegate = gson.getDelegateAdapter(skipPast, typeToken));
  }

```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `gson/src/main/java/com/google/gson/stream/JsonReader.java`
#### Snippet
```java
      peekedLong = negative ? value : -value;
      pos += i;
      return peeked = PEEKED_LONG;
    } else if (last == NUMBER_CHAR_DIGIT || last == NUMBER_CHAR_FRACTION_DIGIT
        || last == NUMBER_CHAR_EXP_DIGIT) {
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `gson/src/main/java/com/google/gson/stream/JsonReader.java`
#### Snippet
```java
        || last == NUMBER_CHAR_EXP_DIGIT) {
      peekedNumberLength = i;
      return peeked = PEEKED_NUMBER;
    } else {
      return PEEKED_NONE;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `gson/src/main/java/com/google/gson/stream/JsonReader.java`
#### Snippet
```java
    pos = 0;
    int total;
    while ((total = in.read(buffer, limit, buffer.length - limit)) != -1) {
      limit += total;

```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `gson/src/main/java/com/google/gson/stream/JsonReader.java`
#### Snippet
```java
      switch (c) {
      case ']':
        return peeked = PEEKED_END_ARRAY;
      case ';':
        checkLenient(); // fall-through
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `gson/src/main/java/com/google/gson/stream/JsonReader.java`
#### Snippet
```java
        switch (c) {
        case '}':
          return peeked = PEEKED_END_OBJECT;
        case ';':
          checkLenient(); // fall-through
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `gson/src/main/java/com/google/gson/stream/JsonReader.java`
#### Snippet
```java
      switch (c) {
      case '"':
        return peeked = PEEKED_DOUBLE_QUOTED_NAME;
      case '\'':
        checkLenient();
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `gson/src/main/java/com/google/gson/stream/JsonReader.java`
#### Snippet
```java
      case '\'':
        checkLenient();
        return peeked = PEEKED_SINGLE_QUOTED_NAME;
      case '}':
        if (peekStack != JsonScope.NONEMPTY_OBJECT) {
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `gson/src/main/java/com/google/gson/stream/JsonReader.java`
#### Snippet
```java
      case '}':
        if (peekStack != JsonScope.NONEMPTY_OBJECT) {
          return peeked = PEEKED_END_OBJECT;
        } else {
          throw syntaxError("Expected name");
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `gson/src/main/java/com/google/gson/stream/JsonReader.java`
#### Snippet
```java
        pos--; // Don't consume the first character in an unquoted string.
        if (isLiteral((char) c)) {
          return peeked = PEEKED_UNQUOTED_NAME;
        } else {
          throw syntaxError("Expected name");
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `gson/src/main/java/com/google/gson/stream/JsonReader.java`
#### Snippet
```java
      int c = nextNonWhitespace(false);
      if (c == -1) {
        return peeked = PEEKED_EOF;
      } else {
        checkLenient();
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `gson/src/main/java/com/google/gson/stream/JsonReader.java`
#### Snippet
```java
    case ']':
      if (peekStack == JsonScope.EMPTY_ARRAY) {
        return peeked = PEEKED_END_ARRAY;
      }
      // fall-through to handle ",]"
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `gson/src/main/java/com/google/gson/stream/JsonReader.java`
#### Snippet
```java
        checkLenient();
        pos--;
        return peeked = PEEKED_NULL;
      } else {
        throw syntaxError("Unexpected value");
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `gson/src/main/java/com/google/gson/stream/JsonReader.java`
#### Snippet
```java
    case '\'':
      checkLenient();
      return peeked = PEEKED_SINGLE_QUOTED;
    case '"':
      return peeked = PEEKED_DOUBLE_QUOTED;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `gson/src/main/java/com/google/gson/stream/JsonReader.java`
#### Snippet
```java
      return peeked = PEEKED_SINGLE_QUOTED;
    case '"':
      return peeked = PEEKED_DOUBLE_QUOTED;
    case '[':
      return peeked = PEEKED_BEGIN_ARRAY;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `gson/src/main/java/com/google/gson/stream/JsonReader.java`
#### Snippet
```java
      return peeked = PEEKED_DOUBLE_QUOTED;
    case '[':
      return peeked = PEEKED_BEGIN_ARRAY;
    case '{':
      return peeked = PEEKED_BEGIN_OBJECT;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `gson/src/main/java/com/google/gson/stream/JsonReader.java`
#### Snippet
```java
      return peeked = PEEKED_BEGIN_ARRAY;
    case '{':
      return peeked = PEEKED_BEGIN_OBJECT;
    default:
      pos--; // Don't consume the first character in a literal value.
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `gson/src/main/java/com/google/gson/stream/JsonReader.java`
#### Snippet
```java

    checkLenient();
    return peeked = PEEKED_UNQUOTED;
  }

```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `gson/src/main/java/com/google/gson/stream/JsonReader.java`
#### Snippet
```java
    // We've found the keyword followed either by EOF or by a non-literal character.
    pos += length;
    return peeked = peeking;
  }

```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `metrics/src/main/java/com/google/gson/metrics/ParseBenchmark.java`
#### Snippet
```java
      StringWriter writer = new StringWriter();
      int count;
      while ((count = reader.read(buffer)) != -1) {
        writer.write(buffer, 0, count);
      }
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `gson/src/main/java/com/google/gson/internal/LinkedTreeMap.java`
#### Snippet
```java
      key = null;
      this.allowNullValue = allowNullValue;
      next = prev = this;
    }

```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `gson/src/main/java/com/google/gson/internal/LinkedTreeMap.java`
#### Snippet
```java
      }
      next = e.next;
      return lastReturned = e;
    }

```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `gson/src/main/java/com/google/gson/internal/LinkedTreeMap.java`
#### Snippet
```java
  @Override public Set<Entry<K, V>> entrySet() {
    EntrySet result = entrySet;
    return result != null ? result : (entrySet = new EntrySet());
  }

```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `gson/src/main/java/com/google/gson/internal/LinkedTreeMap.java`
#### Snippet
```java
  @Override public Set<K> keySet() {
    KeySet result = keySet;
    return result != null ? result : (keySet = new KeySet());
  }

```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `gson/src/main/java/com/google/gson/internal/LinkedTreeMap.java`
#### Snippet
```java
    // Clear iteration order
    Node<K, V> header = this.header;
    header.next = header.prev = header;
  }

```

## RuleId[ruleID=NonProtectedConstructorInAbstractClass]
### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `JsonElement()` of an abstract class should not be declared 'public'
in `gson/src/main/java/com/google/gson/JsonElement.java`
#### Snippet
```java
   */
  @Deprecated
  public JsonElement() {
  }

```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `TypeAdapter()` of an abstract class should not be declared 'public'
in `gson/src/main/java/com/google/gson/TypeAdapter.java`
#### Snippet
```java
public abstract class TypeAdapter<T> {

  public TypeAdapter() {
  }

```

## RuleId[ruleID=MismatchedCollectionQueryUpdate]
### RuleId[ruleID=MismatchedCollectionQueryUpdate]
Contents of collection `bags` are updated, but never queried
in `metrics/src/main/java/com/google/gson/metrics/CollectionsDeserializationBenchmark.java`
#### Snippet
```java
      JsonReader jr = new JsonReader(reader);
      jr.beginArray();
      List<BagOfPrimitives> bags = new ArrayList<>();
      while(jr.hasNext()) {
        jr.beginObject();
```

### RuleId[ruleID=MismatchedCollectionQueryUpdate]
Contents of collection `bags` are updated, but never queried
in `metrics/src/main/java/com/google/gson/metrics/CollectionsDeserializationBenchmark.java`
#### Snippet
```java
      JsonReader jr = new JsonReader(reader);
      jr.beginArray();
      List<BagOfPrimitives> bags = new ArrayList<>();
      while(jr.hasNext()) {
        jr.beginObject();
```

## RuleId[ruleID=RedundantFieldInitialization]
### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `gson/src/main/java/com/google/gson/internal/bind/JsonTreeReader.java`
#### Snippet
```java
   */
  private Object[] stack = new Object[32];
  private int stackSize = 0;

  /*
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `gson/src/main/java/com/google/gson/stream/JsonReader.java`
#### Snippet
```java
  private final char[] buffer = new char[BUFFER_SIZE];
  private int pos = 0;
  private int limit = 0;

  private int lineNumber = 0;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `gson/src/main/java/com/google/gson/stream/JsonReader.java`
#### Snippet
```java

  private int lineNumber = 0;
  private int lineStart = 0;

  int peeked = PEEKED_NONE;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `gson/src/main/java/com/google/gson/stream/JsonReader.java`
#### Snippet
```java
   */
  private int[] stack = new int[32];
  private int stackSize = 0;
  {
    stack[stackSize++] = JsonScope.EMPTY_DOCUMENT;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `gson/src/main/java/com/google/gson/stream/JsonReader.java`
#### Snippet
```java
   */
  private final char[] buffer = new char[BUFFER_SIZE];
  private int pos = 0;
  private int limit = 0;

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `gson/src/main/java/com/google/gson/stream/JsonReader.java`
#### Snippet
```java

  /** True to accept non-spec compliant JSON */
  private boolean lenient = false;

  static final int BUFFER_SIZE = 1024;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `gson/src/main/java/com/google/gson/stream/JsonReader.java`
#### Snippet
```java
  private int limit = 0;

  private int lineNumber = 0;
  private int lineStart = 0;

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `gson/src/main/java/com/google/gson/stream/JsonWriter.java`
#### Snippet
```java

  private int[] stack = new int[32];
  private int stackSize = 0;
  {
    push(EMPTY_DOCUMENT);
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `gson/src/main/java/com/google/gson/internal/LinkedTreeMap.java`
#### Snippet
```java
  private final boolean allowNullValues;
  Node<K, V> root;
  int size = 0;
  int modCount = 0;

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `gson/src/main/java/com/google/gson/internal/LinkedTreeMap.java`
#### Snippet
```java
  Node<K, V> root;
  int size = 0;
  int modCount = 0;

  // Used to preserve iteration order
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `gson/src/main/java/com/google/gson/internal/LinkedTreeMap.java`
#### Snippet
```java
  private abstract class LinkedTreeMapIterator<T> implements Iterator<T> {
    Node<K, V> next = header.next;
    Node<K, V> lastReturned = null;
    int expectedModCount = modCount;

```

## RuleId[ruleID=AssignmentToMethodParameter]
### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `element`
in `gson/src/main/java/com/google/gson/JsonArray.java`
#### Snippet
```java
  public void add(JsonElement element) {
    if (element == null) {
      element = JsonNull.INSTANCE;
    }
    elements.add(element);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `minimum`
in `gson/src/main/java/com/google/gson/stream/JsonReader.java`
#### Snippet
```java
        pos++;
        lineStart++;
        minimum++;
      }

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `type`
in `gson/src/main/java/com/google/gson/internal/bind/TypeAdapterRuntimeTypeWrapper.java`
#### Snippet
```java
  private static Type getRuntimeTypeIfMoreSpecific(Type type, Object value) {
    if (value != null && (type instanceof Class<?> || type instanceof TypeVariable<?>)) {
      type = value.getClass();
    }
    return type;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `typeAdapter`
in `gson/src/main/java/com/google/gson/internal/bind/TypeAdapterRuntimeTypeWrapper.java`
#### Snippet
```java
        break;
      }
      typeAdapter = delegate;
    }

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `toResolve`
in `gson/src/main/java/com/google/gson/internal/$Gson$Types.java`
#### Snippet
```java
        }

        toResolve = resolveTypeVariable(context, contextRawType, typeVariable);
        if (toResolve == typeVariable) {
          break;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `toResolve`
in `gson/src/main/java/com/google/gson/internal/$Gson$Types.java`
#### Snippet
```java
        Type componentType = original.getComponentType();
        Type newComponentType = resolve(context, contextRawType, componentType, visitedTypeVariables);
        toResolve = equal(componentType, newComponentType)
            ? original
            : arrayOf(newComponentType);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `toResolve`
in `gson/src/main/java/com/google/gson/internal/$Gson$Types.java`
#### Snippet
```java
        Type componentType = original.getGenericComponentType();
        Type newComponentType = resolve(context, contextRawType, componentType, visitedTypeVariables);
        toResolve = equal(componentType, newComponentType)
            ? original
            : arrayOf(newComponentType);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `toResolve`
in `gson/src/main/java/com/google/gson/internal/$Gson$Types.java`
#### Snippet
```java
        }

        toResolve = changed
            ? newParameterizedTypeWithOwner(newOwnerType, original.getRawType(), args)
            : original;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `toResolve`
in `gson/src/main/java/com/google/gson/internal/$Gson$Types.java`
#### Snippet
```java
          Type lowerBound = resolve(context, contextRawType, originalLowerBound[0], visitedTypeVariables);
          if (lowerBound != originalLowerBound[0]) {
            toResolve = supertypeOf(lowerBound);
            break;
          }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `toResolve`
in `gson/src/main/java/com/google/gson/internal/$Gson$Types.java`
#### Snippet
```java
          Type upperBound = resolve(context, contextRawType, originalUpperBound[0], visitedTypeVariables);
          if (upperBound != originalUpperBound[0]) {
            toResolve = subtypeOf(upperBound);
            break;
          }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `toResolve`
in `gson/src/main/java/com/google/gson/internal/$Gson$Types.java`
#### Snippet
```java
          }
        }
        toResolve = original;
        break;

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `context`
in `gson/src/main/java/com/google/gson/internal/$Gson$Types.java`
#### Snippet
```java
      // Currently the JLS only permits one bound for wildcards so using first bound is safe
      assert bounds.length == 1;
      context = bounds[0];
    }
    checkArgument(supertype.isAssignableFrom(contextRawType));
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `rawType`
in `gson/src/main/java/com/google/gson/internal/$Gson$Types.java`
#### Snippet
```java
          return getGenericSupertype(rawType.getGenericSuperclass(), rawSupertype, supertype);
        }
        rawType = rawSupertype;
      }
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `blockInaccessible`
in `gson/src/main/java/com/google/gson/internal/bind/ReflectiveTypeAdapterFactory.java`
#### Snippet
```java
              + " or adjust the access filter.");
        }
        blockInaccessible = filterResult == FilterResult.BLOCK_INACCESSIBLE;
      }

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `type`
in `gson/src/main/java/com/google/gson/internal/bind/ReflectiveTypeAdapterFactory.java`
#### Snippet
```java
        }
      }
      type = TypeToken.get($Gson$Types.resolve(type.getType(), raw, raw.getGenericSuperclass()));
      raw = type.getRawType();
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `raw`
in `gson/src/main/java/com/google/gson/internal/bind/ReflectiveTypeAdapterFactory.java`
#### Snippet
```java
      }
      type = TypeToken.get($Gson$Types.resolve(type.getType(), raw, raw.getGenericSuperclass()));
      raw = type.getRawType();
    }
    return result;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `skipPast`
in `gson/src/main/java/com/google/gson/Gson.java`
#### Snippet
```java
    // our @JsonAdapter annotation.
    if (!factories.contains(skipPast)) {
      skipPast = jsonAdapterFactory;
    }

```

## RuleId[ruleID=HtmlWrongAttributeValue]
### RuleId[ruleID=HtmlWrongAttributeValue]
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2022-11-22-20-17-21.134.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[ruleID=ReturnNull]
### RuleId[ruleID=ReturnNull]
Return of `null`
in `gson/src/main/java/com/google/gson/internal/bind/NumberTypeAdapter.java`
#### Snippet
```java
      @SuppressWarnings("unchecked")
      @Override public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
        return type.getRawType() == Number.class ? (TypeAdapter<T>) adapter : null;
      }
    };
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `gson/src/main/java/com/google/gson/internal/bind/NumberTypeAdapter.java`
#### Snippet
```java
    case NULL:
      in.nextNull();
      return null;
    case NUMBER:
    case STRING:
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `gson/src/main/java/com/google/gson/internal/reflect/ReflectionHelper.java`
#### Snippet
```java
    try {
      constructor.setAccessible(true);
      return null;
    } catch (Exception exception) {
      return "Failed making constructor '" + constructorToString(constructor) + "' accessible;"
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `extras/src/main/java/com/google/gson/typeadapters/UtcDateTypeAdapter.java`
#### Snippet
```java
      case NULL:
        in.nextNull();
        return null;
      default:
        String date = in.nextString();
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `gson/src/main/java/com/google/gson/internal/Excluder.java`
#### Snippet
```java

    if (!skipSerialize && !skipDeserialize) {
      return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `gson/src/main/java/com/google/gson/internal/Excluder.java`
#### Snippet
```java
        if (skipDeserialize) {
          in.skipValue();
          return null;
        }
        return delegate().read(in);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `extras/src/main/java/com/google/gson/graph/GraphAdapterBuilder.java`
#### Snippet
```java
          if (in.peek() == JsonToken.NULL) {
            in.nextNull();
            return null;
          }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `extras/src/main/java/com/google/gson/graph/GraphAdapterBuilder.java`
#### Snippet
```java
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!instanceCreators.containsKey(type.getType())) {
        return null;
      }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `gson/src/main/java/com/google/gson/internal/bind/MapTypeAdapterFactory.java`
#### Snippet
```java
      if (peek == JsonToken.NULL) {
        in.nextNull();
        return null;
      }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `gson/src/main/java/com/google/gson/internal/bind/JsonAdapterAnnotationTypeAdapterFactory.java`
#### Snippet
```java
    JsonAdapter annotation = rawType.getAnnotation(JsonAdapter.class);
    if (annotation == null) {
      return null;
    }
    return (TypeAdapter<T>) getTypeAdapter(constructorConstructor, gson, targetType, annotation);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `gson/src/main/java/com/google/gson/internal/bind/MapTypeAdapterFactory.java`
#### Snippet
```java
    Class<? super T> rawType = typeToken.getRawType();
    if (!Map.class.isAssignableFrom(rawType)) {
      return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `gson/src/main/java/com/google/gson/internal/sql/SqlTimestampTypeAdapter.java`
#### Snippet
```java
        return (TypeAdapter<T>) new SqlTimestampTypeAdapter(dateTypeAdapter);
      } else {
        return null;
      }
    }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `gson/src/main/java/com/google/gson/internal/sql/SqlTimestampTypeAdapter.java`
#### Snippet
```java
  public Timestamp read(JsonReader in) throws IOException {
    Date date = dateTypeAdapter.read(in);
    return date != null ? new Timestamp(date.getTime()) : null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `gson/src/main/java/com/google/gson/internal/bind/ObjectTypeAdapter.java`
#### Snippet
```java
          return (TypeAdapter<T>) new ObjectTypeAdapter(gson, toNumberStrategy);
        }
        return null;
      }
    };
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `gson/src/main/java/com/google/gson/internal/bind/ObjectTypeAdapter.java`
#### Snippet
```java
      case NULL:
        in.nextNull();
        return null;
      default:
        // When read(JsonReader) is called with JsonReader in invalid state
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `gson/src/main/java/com/google/gson/internal/bind/ObjectTypeAdapter.java`
#### Snippet
```java
        return new LinkedTreeMap<>();
      default:
        return null;
    }
  }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `extras/src/main/java/com/google/gson/typeadapters/RuntimeTypeAdapterFactory.java`
#### Snippet
```java
  public <R> TypeAdapter<R> create(Gson gson, TypeToken<R> type) {
    if (type == null) {
      return null;
    }
    Class<?> rawType = type.getRawType();
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `extras/src/main/java/com/google/gson/typeadapters/RuntimeTypeAdapterFactory.java`
#### Snippet
```java
        recognizeSubtypes ? baseType.isAssignableFrom(rawType) : baseType.equals(rawType);
    if (!handle) {
      return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `gson/src/main/java/com/google/gson/internal/bind/CollectionTypeAdapterFactory.java`
#### Snippet
```java
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
        return null;
      }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `gson/src/main/java/com/google/gson/internal/bind/CollectionTypeAdapterFactory.java`
#### Snippet
```java
    Class<? super T> rawType = typeToken.getRawType();
    if (!Collection.class.isAssignableFrom(rawType)) {
      return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `gson/src/main/java/com/google/gson/TypeAdapter.java`
#### Snippet
```java
        if (reader.peek() == JsonToken.NULL) {
          reader.nextNull();
          return null;
        }
        return TypeAdapter.this.read(reader);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `gson/src/main/java/com/google/gson/internal/bind/TreeTypeAdapter.java`
#### Snippet
```java
          ? new TreeTypeAdapter<>((JsonSerializer<T>) serializer,
              (JsonDeserializer<T>) deserializer, gson, type, this)
          : null;
    }
  }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `gson/src/main/java/com/google/gson/internal/bind/TreeTypeAdapter.java`
#### Snippet
```java
    JsonElement value = Streams.parse(in);
    if (nullSafe && value.isJsonNull()) {
      return null;
    }
    return deserializer.deserialize(value, typeToken.getType(), context);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `gson/src/main/java/com/google/gson/internal/sql/SqlTimeTypeAdapter.java`
#### Snippet
```java
    @SuppressWarnings("unchecked") // we use a runtime check to make sure the 'T's equal
    @Override public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
      return typeToken.getRawType() == Time.class ? (TypeAdapter<T>) new SqlTimeTypeAdapter() : null;
    }
  };
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `gson/src/main/java/com/google/gson/internal/sql/SqlTimeTypeAdapter.java`
#### Snippet
```java
    if (in.peek() == JsonToken.NULL) {
      in.nextNull();
      return null;
    }
    String s = in.nextString();
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `gson/src/main/java/com/google/gson/internal/sql/SqlDateTypeAdapter.java`
#### Snippet
```java
    @Override public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
      return typeToken.getRawType() == java.sql.Date.class
          ? (TypeAdapter<T>) new SqlDateTypeAdapter() : null;
    }
  };
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `gson/src/main/java/com/google/gson/internal/sql/SqlDateTypeAdapter.java`
#### Snippet
```java
    if (in.peek() == JsonToken.NULL) {
      in.nextNull();
      return null;
    }
    String s = in.nextString();
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `gson/src/main/java/com/google/gson/internal/bind/ArrayTypeAdapter.java`
#### Snippet
```java
    if (in.peek() == JsonToken.NULL) {
      in.nextNull();
      return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `gson/src/main/java/com/google/gson/internal/bind/ArrayTypeAdapter.java`
#### Snippet
```java
      Type type = typeToken.getType();
      if (!(type instanceof GenericArrayType || type instanceof Class && ((Class<?>) type).isArray())) {
        return null;
      }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `gson/src/main/java/com/google/gson/internal/bind/DefaultDateTypeAdapter.java`
#### Snippet
```java
    if (in.peek() == JsonToken.NULL) {
      in.nextNull();
      return null;
    }
    Date date = deserializeToDate(in);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `gson/src/main/java/com/google/gson/internal/bind/DateTypeAdapter.java`
#### Snippet
```java
    if (in.peek() == JsonToken.NULL) {
      in.nextNull();
      return null;
    }
    return deserializeToDate(in);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `gson/src/main/java/com/google/gson/internal/bind/DateTypeAdapter.java`
#### Snippet
```java
    @SuppressWarnings("unchecked") // we use a runtime check to make sure the 'T's equal
    @Override public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
      return typeToken.getRawType() == Date.class ? (TypeAdapter<T>) new DateTypeAdapter() : null;
    }
  };
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `extras/src/main/java/com/google/gson/interceptors/InterceptorFactory.java`
#### Snippet
```java
    Intercept intercept = type.getRawType().getAnnotation(Intercept.class);
    if (intercept == null) {
      return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `extras/src/main/java/com/google/gson/typeadapters/PostConstructAdapterFactory.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `gson/src/main/java/com/google/gson/internal/LinkedTreeMap.java`
#### Snippet
```java
    Node<K, V> mine = findByObject(entry.getKey());
    boolean valuesEqual = mine != null && equal(mine.value, entry.getValue());
    return valuesEqual ? mine : null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `gson/src/main/java/com/google/gson/internal/LinkedTreeMap.java`
#### Snippet
```java
  Node<K, V> findByObject(Object key) {
    try {
      return key != null ? find((K) key, false) : null;
    } catch (ClassCastException e) {
      return null;
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `gson/src/main/java/com/google/gson/internal/LinkedTreeMap.java`
#### Snippet
```java
      return key != null ? find((K) key, false) : null;
    } catch (ClassCastException e) {
      return null;
    }
  }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `gson/src/main/java/com/google/gson/internal/LinkedTreeMap.java`
#### Snippet
```java
  @Override public V remove(Object key) {
    Node<K, V> node = removeInternalByKey(key);
    return node != null ? node.value : null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `gson/src/main/java/com/google/gson/internal/LinkedTreeMap.java`
#### Snippet
```java
  @Override public V get(Object key) {
    Node<K, V> node = findByObject(key);
    return node != null ? node.value : null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `gson/src/main/java/com/google/gson/internal/LinkedTreeMap.java`
#### Snippet
```java
    // The key doesn't exist in this tree.
    if (!create) {
      return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `gson/src/main/java/com/google/gson/internal/$Gson$Types.java`
#### Snippet
```java
    return genericDeclaration instanceof Class
        ? (Class<?>) genericDeclaration
        : null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `gson/src/main/java/com/google/gson/internal/ConstructorConstructor.java`
#### Snippet
```java
    }

    return null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `gson/src/main/java/com/google/gson/internal/ConstructorConstructor.java`
#### Snippet
```java
    // Cannot invoke constructor of abstract class
    if (Modifier.isAbstract(rawType.getModifiers())) {
      return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `gson/src/main/java/com/google/gson/internal/ConstructorConstructor.java`
#### Snippet
```java
      constructor = rawType.getDeclaredConstructor();
    } catch (NoSuchMethodException e) {
      return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `gson/src/main/java/com/google/gson/internal/ConstructorConstructor.java`
#### Snippet
```java
          + "or a TypeAdapter for this type. Class name: " + c.getName();
    }
    return null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `gson/src/main/java/com/google/gson/internal/ConstructorConstructor.java`
#### Snippet
```java
    }

    return null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `gson/src/main/java/com/google/gson/internal/bind/ReflectiveTypeAdapterFactory.java`
#### Snippet
```java
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
        return null;
      }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `gson/src/main/java/com/google/gson/internal/bind/ReflectiveTypeAdapterFactory.java`
#### Snippet
```java

    if (!Object.class.isAssignableFrom(raw)) {
      return null; // it's a primitive!
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `gson/src/main/java/com/google/gson/internal/bind/TypeAdapters.java`
#### Snippet
```java
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
        return null;
      }
      return in.nextDouble();
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `gson/src/main/java/com/google/gson/internal/bind/TypeAdapters.java`
#### Snippet
```java
        final Class<? super T2> requestedType = typeToken.getRawType();
        if (!clazz.isAssignableFrom(requestedType)) {
          return null;
        }
        return (TypeAdapter<T2>) new TypeAdapter<T1>() {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `gson/src/main/java/com/google/gson/internal/bind/TypeAdapters.java`
#### Snippet
```java
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
        return null;
      }
      try {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `gson/src/main/java/com/google/gson/internal/bind/TypeAdapters.java`
#### Snippet
```java
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
        return null;
      }
      String key = in.nextString();
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `gson/src/main/java/com/google/gson/internal/bind/TypeAdapters.java`
#### Snippet
```java
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
        return  null;
      }
      in.beginObject();
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `gson/src/main/java/com/google/gson/internal/bind/TypeAdapters.java`
#### Snippet
```java
      if (peek == JsonToken.NULL) {
        in.nextNull();
        return null;
      } else if (peek == JsonToken.STRING) {
        // support strings for compatibility with GSON 1.7
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `gson/src/main/java/com/google/gson/internal/bind/TypeAdapters.java`
#### Snippet
```java
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
        return null;
      }
      String s = in.nextString();
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `gson/src/main/java/com/google/gson/internal/bind/TypeAdapters.java`
#### Snippet
```java
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
        return null;
      }
      // regrettably, this should have included both the host name and the host address
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `gson/src/main/java/com/google/gson/internal/bind/TypeAdapters.java`
#### Snippet
```java
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
        return null;
      }
      return new LazilyParsedNumber(in.nextString());
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `gson/src/main/java/com/google/gson/internal/bind/TypeAdapters.java`
#### Snippet
```java
      @Override public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        Class<? super T> rawType = typeToken.getRawType();
        return (rawType == unboxed || rawType == boxed) ? (TypeAdapter<T>) typeAdapter : null;
      }
      @Override public String toString() {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `gson/src/main/java/com/google/gson/internal/bind/TypeAdapters.java`
#### Snippet
```java
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
        return null;
      }
      String locale = in.nextString();
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `gson/src/main/java/com/google/gson/internal/bind/TypeAdapters.java`
#### Snippet
```java
      @SuppressWarnings("unchecked") // we use a runtime check to make sure the 'T's equal
      @Override public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        return typeToken.equals(type) ? (TypeAdapter<T>) typeAdapter : null;
      }
    };
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `gson/src/main/java/com/google/gson/internal/bind/TypeAdapters.java`
#### Snippet
```java
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
        return null;
      }
      String nextString = in.nextString();
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `gson/src/main/java/com/google/gson/internal/bind/TypeAdapters.java`
#### Snippet
```java
      }
      String nextString = in.nextString();
      return "null".equals(nextString) ? null : new URL(nextString);
    }
    @Override
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `gson/src/main/java/com/google/gson/internal/bind/TypeAdapters.java`
#### Snippet
```java
          return new JsonObject();
        default:
          return null;
      }
    }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `gson/src/main/java/com/google/gson/internal/bind/TypeAdapters.java`
#### Snippet
```java
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
        return null;
      }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `gson/src/main/java/com/google/gson/internal/bind/TypeAdapters.java`
#### Snippet
```java
      @Override public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        Class<? super T> rawType = typeToken.getRawType();
        return (rawType == base || rawType == sub) ? (TypeAdapter<T>) typeAdapter : null;
      }
      @Override public String toString() {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `gson/src/main/java/com/google/gson/internal/bind/TypeAdapters.java`
#### Snippet
```java
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
        return null;
      }
      return new StringBuilder(in.nextString());
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `gson/src/main/java/com/google/gson/internal/bind/TypeAdapters.java`
#### Snippet
```java
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
        return null;
      }
      String s = in.nextString();
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `gson/src/main/java/com/google/gson/internal/bind/TypeAdapters.java`
#### Snippet
```java
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
        return null;
      }
      return (float) in.nextDouble();
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `gson/src/main/java/com/google/gson/internal/bind/TypeAdapters.java`
#### Snippet
```java
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
        return null;
      }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `gson/src/main/java/com/google/gson/internal/bind/TypeAdapters.java`
#### Snippet
```java
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
        return null;
      }
      return Boolean.valueOf(in.nextString());
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `gson/src/main/java/com/google/gson/internal/bind/TypeAdapters.java`
#### Snippet
```java
      Class<? super T> rawType = typeToken.getRawType();
      if (!Enum.class.isAssignableFrom(rawType) || rawType == Enum.class) {
        return null;
      }
      if (!rawType.isEnum()) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `gson/src/main/java/com/google/gson/internal/bind/TypeAdapters.java`
#### Snippet
```java
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
        return null;
      }
      String s = in.nextString();
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `gson/src/main/java/com/google/gson/internal/bind/TypeAdapters.java`
#### Snippet
```java
      if (peek == JsonToken.NULL) {
        in.nextNull();
        return null;
      }
      /* coerce booleans to strings for backwards compatibility */
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `gson/src/main/java/com/google/gson/internal/bind/TypeAdapters.java`
#### Snippet
```java
      @SuppressWarnings("unchecked") // we use a runtime check to make sure the 'T's equal
      @Override public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        return typeToken.getRawType() == type ? (TypeAdapter<T>) typeAdapter : null;
      }
      @Override public String toString() {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `gson/src/main/java/com/google/gson/internal/bind/TypeAdapters.java`
#### Snippet
```java
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
        return null;
      }
      try {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `gson/src/main/java/com/google/gson/internal/bind/TypeAdapters.java`
#### Snippet
```java
      try {
        String nextString = in.nextString();
        return "null".equals(nextString) ? null : new URI(nextString);
      } catch (URISyntaxException e) {
        throw new JsonIOException(e);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `gson/src/main/java/com/google/gson/internal/bind/TypeAdapters.java`
#### Snippet
```java
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
        return null;
      }
      try {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `gson/src/main/java/com/google/gson/internal/bind/TypeAdapters.java`
#### Snippet
```java
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
        return null;
      }
      return new StringBuffer(in.nextString());
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `gson/src/main/java/com/google/gson/internal/bind/TypeAdapters.java`
#### Snippet
```java
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
        return null;
      }
      String str = in.nextString();
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `gson/src/main/java/com/google/gson/Gson.java`
#### Snippet
```java
        if (in.peek() == JsonToken.NULL) {
          in.nextNull();
          return null;
        }
        return in.nextLong();
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `gson/src/main/java/com/google/gson/Gson.java`
#### Snippet
```java
       */
      if (isEmpty) {
        return null;
      }
      throw new JsonSyntaxException(e);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `gson/src/main/java/com/google/gson/Gson.java`
#### Snippet
```java
        if (in.peek() == JsonToken.NULL) {
          in.nextNull();
          return null;
        }
        return (float) in.nextDouble();
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `gson/src/main/java/com/google/gson/Gson.java`
#### Snippet
```java
  public <T> T fromJson(String json, TypeToken<T> typeOfT) throws JsonSyntaxException {
    if (json == null) {
      return null;
    }
    StringReader reader = new StringReader(json);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `gson/src/main/java/com/google/gson/Gson.java`
#### Snippet
```java
  public <T> T fromJson(JsonElement json, TypeToken<T> typeOfT) throws JsonSyntaxException {
    if (json == null) {
      return null;
    }
    return fromJson(new JsonTreeReader(json), typeOfT);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `gson/src/main/java/com/google/gson/Gson.java`
#### Snippet
```java
        if (in.peek() == JsonToken.NULL) {
          in.nextNull();
          return null;
        }
        return in.nextDouble();
```

## RuleId[ruleID=UnnecessaryLocalVariable]
### RuleId[ruleID=UnnecessaryLocalVariable]
Local variable `object` is redundant
in `gson/src/main/java/com/google/gson/Gson.java`
#### Snippet
```java
      isEmpty = false;
      TypeAdapter<T> typeAdapter = getAdapter(typeOfT);
      T object = typeAdapter.read(reader);
      return object;
    } catch (EOFException e) {
```

## RuleId[ruleID=ZeroLengthArrayInitialization]
### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `gson/src/main/java/com/google/gson/internal/bind/TypeAdapters.java`
#### Snippet
```java
            }

            Field[] constantFields = constantFieldsList.toArray(new Field[0]);
            AccessibleObject.setAccessible(constantFields, true);
            return constantFields;
```

## RuleId[ruleID=SynchronizeOnThis]
### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `gson/src/main/java/com/google/gson/internal/sql/SqlTimeTypeAdapter.java`
#### Snippet
```java
    }
    String timeString;
    synchronized (this) {
      timeString = format.format(value);
    }
```

### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `gson/src/main/java/com/google/gson/internal/sql/SqlTimeTypeAdapter.java`
#### Snippet
```java
    String s = in.nextString();
    try {
      synchronized (this) {
        Date date = format.parse(s);
        return new Time(date.getTime());
```

### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `gson/src/main/java/com/google/gson/internal/sql/SqlDateTypeAdapter.java`
#### Snippet
```java
    }
    String dateString;
    synchronized (this) {
      dateString = format.format(value);
    }
```

### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `gson/src/main/java/com/google/gson/internal/sql/SqlDateTypeAdapter.java`
#### Snippet
```java
    try {
      Date utilDate;
      synchronized (this) {
        utilDate = format.parse(s);
      }
```

## RuleId[ruleID=PointlessBooleanExpression]
### RuleId[ruleID=PointlessBooleanExpression]
`false==negative` can be simplified to '!negative'
in `gson/src/main/java/com/google/gson/stream/JsonReader.java`
#### Snippet
```java

    // We've read a complete number. Decide if it's a PEEKED_LONG or a PEEKED_NUMBER.
    if (last == NUMBER_CHAR_DIGIT && fitsInLong && (value != Long.MIN_VALUE || negative) && (value!=0 || false==negative)) {
      peekedLong = negative ? value : -value;
      pos += i;
```

## RuleId[ruleID=EqualsWhichDoesntCheckParameterClass]
### RuleId[ruleID=EqualsWhichDoesntCheckParameterClass]
`equals()` should check the class of its parameter
in `gson/src/main/java/com/google/gson/internal/NonNullElementWrapperList.java`
#### Snippet
```java
  }

  @Override public boolean equals(Object o) {
    return delegate.equals(o);
  }
```

## RuleId[ruleID=UnusedAssignment]
### RuleId[ruleID=UnusedAssignment]
Variable `fail` initializer `null` is redundant
in `extras/src/main/java/com/google/gson/typeadapters/UtcDateTypeAdapter.java`
#### Snippet
```java
   */
  private static Date parse(String date, ParsePosition pos) throws ParseException {
    Exception fail = null;
    try {
      int offset = pos.getIndex();
```

### RuleId[ruleID=UnusedAssignment]
Variable `fail` initializer `null` is redundant
in `gson/src/main/java/com/google/gson/internal/bind/util/ISO8601Utils.java`
#### Snippet
```java
     */
    public static Date parse(String date, ParsePosition pos) throws ParseException {
        Exception fail = null;
        try {
            int offset = pos.getIndex();
```

### RuleId[ruleID=UnusedAssignment]
Variable `timezone` initializer `null` is redundant
in `gson/src/main/java/com/google/gson/internal/bind/util/ISO8601Utils.java`
#### Snippet
```java
            }

            TimeZone timezone = null;
            char timezoneIndicator = date.charAt(offset);

```

## RuleId[ruleID=ConstantValue]
### RuleId[ruleID=ConstantValue]
Value `nearest` is always 'null'
in `gson/src/main/java/com/google/gson/internal/LinkedTreeMap.java`
#### Snippet
```java
        throw new ClassCastException(key.getClass().getName() + " is not Comparable");
      }
      created = new Node<>(allowNullValues, nearest, key, header, header.prev);
      root = created;
    } else {
```

