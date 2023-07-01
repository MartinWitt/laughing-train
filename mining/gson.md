# gson 
 
# Bad smells
I found 86 bad smells with 19 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryModifier | 16 | true |
| DuplicatedCode | 15 | false |
| DataFlowIssue | 10 | false |
| NullableProblems | 10 | false |
| MarkedForRemoval | 4 | false |
| FieldMayBeFinal | 3 | false |
| CommentedOutCode | 3 | false |
| JavaReflectionMemberAccess | 3 | false |
| UnnecessaryToStringCall | 3 | true |
| UnusedAssignment | 3 | false |
| MagicConstant | 2 | false |
| DeprecatedIsStillUsed | 2 | false |
| MismatchedCollectionQueryUpdate | 2 | false |
| Deprecation | 2 | false |
| SimplifyOptionalCallChains | 1 | false |
| UnnecessarySemicolon | 1 | false |
| UNUSED_IMPORT | 1 | false |
| SwitchStatementWithTooFewBranches | 1 | false |
| ArraysAsListWithZeroOrOneArgument | 1 | false |
| EqualsWhichDoesntCheckParameterClass | 1 | false |
| JavadocLinkAsPlainText | 1 | false |
| ConstantValue | 1 | false |
## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `gson/src/main/java/com/google/gson/ToNumberStrategy.java`
#### Snippet
```java
   * @return number read from the JSON reader.
   */
  public Number readNumber(JsonReader in) throws IOException;
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `gson/src/main/java/com/google/gson/JsonSerializationContext.java`
#### Snippet
```java
   * @return a tree of {@link JsonElement}s corresponding to the serialized form of {@code src}.
   */
  public JsonElement serialize(Object src, Type typeOfSrc);
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `gson/src/main/java/com/google/gson/JsonSerializationContext.java`
#### Snippet
```java
   * @return a tree of {@link JsonElement}s corresponding to the serialized form of {@code src}.
   */
  public JsonElement serialize(Object src);

  /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `gson/src/main/java/com/google/gson/annotations/Expose.java`
#### Snippet
```java
   * @since 1.4
   */
  public boolean serialize() default true;

  /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `gson/src/main/java/com/google/gson/annotations/Expose.java`
#### Snippet
```java
   * @since 1.4
   */
  public boolean deserialize() default true;
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `gson/src/main/java/com/google/gson/JsonSerializer.java`
#### Snippet
```java
   * @return a JsonElement corresponding to the specified object.
   */
  public JsonElement serialize(T src, Type typeOfSrc, JsonSerializationContext context);
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `gson/src/main/java/com/google/gson/InstanceCreator.java`
#### Snippet
```java
   * @return a default object instance of type T.
   */
  public T createInstance(Type type);
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `gson/src/main/java/com/google/gson/JsonDeserializer.java`
#### Snippet
```java
   * @throws JsonParseException if json is not in the expected format of {@code typeOfT}
   */
  public T deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
      throws JsonParseException;
}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `gson/src/main/java/com/google/gson/internal/ObjectConstructor.java`
#### Snippet
```java
   * Returns a new instance.
   */
  public T construct();
}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `extras/src/main/java/com/google/gson/interceptors/JsonPostDeserializer.java`
#### Snippet
```java
   * This method is called by Gson after the object has been deserialized from Json.
   */
  public void postDeserialize(T object);
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `extras/src/main/java/com/google/gson/interceptors/Intercept.java`
#### Snippet
```java
   */
  @SuppressWarnings("rawtypes")
  public Class<? extends JsonPostDeserializer> postDeserialize();
}

```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `metrics/src/main/java/com/google/gson/metrics/ParseBenchmark.java`
#### Snippet
```java
    private final TypeReference<?> jacksonType;

    private Document(TypeToken<?> typeToken, TypeReference<?> typeReference) {
      this.gsonType = typeToken;
      this.jacksonType = typeReference;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `gson/src/main/java/com/google/gson/JsonDeserializationContext.java`
#### Snippet
```java
   */
  @SuppressWarnings("TypeParameterUnusedInFormals")
  public <T> T deserialize(JsonElement json, Type typeOfT) throws JsonParseException;
}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `gson/src/main/java/com/google/gson/ExclusionStrategy.java`
#### Snippet
```java
   * @return true if the field should be ignored; otherwise false
   */
  public boolean shouldSkipField(FieldAttributes f);

  /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `gson/src/main/java/com/google/gson/ExclusionStrategy.java`
#### Snippet
```java
   * @return true if the class should be ignored; otherwise false
   */
  public boolean shouldSkipClass(Class<?> clazz);
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `gson/src/main/java/com/google/gson/FieldNamingStrategy.java`
#### Snippet
```java
   * @since 1.3
   */
  public String translateName(Field f);
}

```

## RuleId[id=MagicConstant]
### MagicConstant
Should be one of: Calendar.JANUARY, Calendar.FEBRUARY, Calendar.MARCH, Calendar.APRIL, Calendar.MAY, ...
in `gson/src/main/java/com/google/gson/internal/bind/util/ISO8601Utils.java`
#### Snippet
```java

            if (!hasT && (date.length() <= offset)) {
                Calendar calendar = new GregorianCalendar(year, month - 1, day);
                calendar.setLenient(false);

```

### MagicConstant
Should be one of: Calendar.JANUARY, Calendar.FEBRUARY, Calendar.MARCH, Calendar.APRIL, Calendar.MAY, ...
in `gson/src/main/java/com/google/gson/internal/bind/TypeAdapters.java`
#### Snippet
```java
      }
      in.endObject();
      return new GregorianCalendar(year, month, dayOfMonth, hourOfDay, minute, second);
    }

```

## RuleId[id=MarkedForRemoval]
### MarkedForRemoval
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

### MarkedForRemoval
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

### MarkedForRemoval
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

### MarkedForRemoval
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

## RuleId[id=SimplifyOptionalCallChains]
### SimplifyOptionalCallChains
'map()' can be replaced with 'flatMap()'
in `shrinker-test/src/main/java/com/example/TestExecutor.java`
#### Snippet
```java
    // prevent the code shrinkers from simplifying this
    return Optional.of(t)
        .map(v -> Optional.of(v).get())
        .orElseThrow(() -> new AssertionError("unreachable"));
  }
```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `proto/src/main/java/com/google/gson/protobuf/ProtoTypeAdapter.java`
#### Snippet
```java
    NUMBER,
    /** Serializes and deserializes enum values using their <b>name</b>. */
    NAME;
  }

```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
Argument `nearest.key` might be null
in `gson/src/main/java/com/google/gson/internal/LinkedTreeMap.java`
#### Snippet
```java
      while (true) {
        comparison = (comparableKey != null)
            ? comparableKey.compareTo(nearest.key)
            : comparator.compare(key, nearest.key);

```

### DataFlowIssue
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

### DataFlowIssue
Dereference of `left` may produce `NullPointerException`
in `gson/src/main/java/com/google/gson/internal/LinkedTreeMap.java`
#### Snippet
```java

      } else if (delta == 2) {
        Node<K, V> leftLeft = left.left;
        Node<K, V> leftRight = left.right;
        int leftRightHeight = leftRight != null ? leftRight.height : 0;
```

### DataFlowIssue
Variable is already assigned to this value
in `gson/src/main/java/com/google/gson/internal/$Gson$Types.java`
#### Snippet
```java
          }
        }
        toResolve = original;
        break;

```

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
Casting `current` to `JsonObject` may produce `ClassCastException`
in `gson/src/main/java/com/google/gson/internal/bind/TypeAdapters.java`
#### Snippet
```java
            ((JsonArray) current).add(value);
          } else {
            ((JsonObject) current).add(name, value);
          }

```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import com.google.gson.stream.JsonToken;`
in `extras/src/main/java/com/google/gson/typeadapters/UtcDateTypeAdapter.java`
#### Snippet
```java
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `source` may be 'final'
in `extras/src/main/java/com/google/gson/extras/examples/rawcollections/RawCollectionsExample.java`
#### Snippet
```java
  static class Event {
    private String name;
    private String source;
    private Event(String name, String source) {
      this.name = name;
```

### FieldMayBeFinal
Field `name` may be 'final'
in `extras/src/main/java/com/google/gson/extras/examples/rawcollections/RawCollectionsExample.java`
#### Snippet
```java
public class RawCollectionsExample {
  static class Event {
    private String name;
    private String source;
    private Event(String name, String source) {
```

### FieldMayBeFinal
Field `gson` may be 'final'
in `metrics/src/main/java/com/google/gson/metrics/ParseBenchmark.java`
#### Snippet
```java

  private static class GsonBindParser implements Parser {
    private static Gson gson = new GsonBuilder()
        .setDateFormat("EEE MMM dd HH:mm:ss Z yyyy")
        .create();
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
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

### CommentedOutCode
Commented out code (4 lines)
in `gson/src/main/java/com/google/gson/internal/UnsafeAllocator.java`
#### Snippet
```java

    // try dalvikvm, post-gingerbread
    // public class ObjectStreamClass {
    //   private static native int getConstructorId(Class<?> c);
    //   private static native Object newInstance(Class<?> instantiationClass, int methodId);
```

### CommentedOutCode
Commented out code (4 lines)
in `gson/src/main/java/com/google/gson/internal/UnsafeAllocator.java`
#### Snippet
```java

    // try dalvikvm, pre-gingerbread
    // public class ObjectInputStream {
    //   private static native Object newInstance(
    //     Class<?> instantiationClass, Class<?> constructorClass);
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
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

### DeprecatedIsStillUsed
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

## RuleId[id=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
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

### MismatchedCollectionQueryUpdate
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

## RuleId[id=JavaReflectionMemberAccess]
### JavaReflectionMemberAccess
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

### JavaReflectionMemberAccess
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

### JavaReflectionMemberAccess
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

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `extras/src/main/java/com/google/gson/typeadapters/UtcDateTypeAdapter.java`
#### Snippet
```java
      Calendar calendar = new GregorianCalendar(tz, Locale.US);
      calendar.setTime(date);

      // estimate capacity of buffer as close as we can (yeah, that's pedantic ;)
      int capacity = "yyyy-MM-ddThh:mm:ss".length();
      capacity += millis ? ".sss".length() : 0;
      capacity += tz.getRawOffset() == 0 ? "Z".length() : "+hh:mm".length();
      StringBuilder formatted = new StringBuilder(capacity);

      padInt(formatted, calendar.get(Calendar.YEAR), "yyyy".length());
      formatted.append('-');
      padInt(formatted, calendar.get(Calendar.MONTH) + 1, "MM".length());
      formatted.append('-');
      padInt(formatted, calendar.get(Calendar.DAY_OF_MONTH), "dd".length());
      formatted.append('T');
      padInt(formatted, calendar.get(Calendar.HOUR_OF_DAY), "hh".length());
      formatted.append(':');
      padInt(formatted, calendar.get(Calendar.MINUTE), "mm".length());
      formatted.append(':');
      padInt(formatted, calendar.get(Calendar.SECOND), "ss".length());
      if (millis) {
          formatted.append('.');
          padInt(formatted, calendar.get(Calendar.MILLISECOND), "sss".length());
      }

      int offset = tz.getOffset(calendar.getTimeInMillis());
      if (offset != 0) {
          int hours = Math.abs((offset / (60 * 1000)) / 60);
          int minutes = Math.abs((offset / (60 * 1000)) % 60);
          formatted.append(offset < 0 ? '-' : '+');
          padInt(formatted, hours, "hh".length());
          formatted.append(':');
          padInt(formatted, minutes, "mm".length());
      } else {
          formatted.append('Z');
      }

      return formatted.toString();
```

### DuplicatedCode
Duplicated code
in `extras/src/main/java/com/google/gson/typeadapters/UtcDateTypeAdapter.java`
#### Snippet
```java
      int offset = pos.getIndex();

      // extract year
      int year = parseInt(date, offset, offset += 4);
      if (checkOffset(date, offset, '-')) {
        offset += 1;
      }

      // extract month
      int month = parseInt(date, offset, offset += 2);
      if (checkOffset(date, offset, '-')) {
        offset += 1;
      }

      // extract day
      int day = parseInt(date, offset, offset += 2);
      // default time value
      int hour = 0;
      int minutes = 0;
      int seconds = 0;
      int milliseconds = 0; // always use 0 otherwise returned date will include millis of current time
```

### DuplicatedCode
Duplicated code
in `extras/src/main/java/com/google/gson/typeadapters/UtcDateTypeAdapter.java`
#### Snippet
```java
        hour = parseInt(date, offset += 1, offset += 2);
        if (checkOffset(date, offset, ':')) {
          offset += 1;
        }

        minutes = parseInt(date, offset, offset += 2);
        if (checkOffset(date, offset, ':')) {
          offset += 1;
        }
```

### DuplicatedCode
Duplicated code
in `extras/src/main/java/com/google/gson/typeadapters/UtcDateTypeAdapter.java`
#### Snippet
```java
      Calendar calendar = new GregorianCalendar(timezone);
      calendar.setLenient(false);
      calendar.set(Calendar.YEAR, year);
      calendar.set(Calendar.MONTH, month - 1);
      calendar.set(Calendar.DAY_OF_MONTH, day);
      calendar.set(Calendar.HOUR_OF_DAY, hour);
      calendar.set(Calendar.MINUTE, minutes);
      calendar.set(Calendar.SECOND, seconds);
      calendar.set(Calendar.MILLISECOND, milliseconds);

      pos.setIndex(offset);
      return calendar.getTime();
```

### DuplicatedCode
Duplicated code
in `gson/src/main/java/com/google/gson/internal/ConstructorConstructor.java`
#### Snippet
```java
    @SuppressWarnings("unchecked") // types must agree
    final InstanceCreator<T> typeCreator = (InstanceCreator<T>) instanceCreators.get(type);
    if (typeCreator != null) {
      return new ObjectConstructor<T>() {
        @Override public T construct() {
          return typeCreator.createInstance(type);
        }
      };
    }
```

### DuplicatedCode
Duplicated code
in `gson/src/main/java/com/google/gson/internal/LinkedTreeMap.java`
#### Snippet
```java
      Node<K, V> left = node.left;
      Node<K, V> right = node.right;
      int leftHeight = left != null ? left.height : 0;
      int rightHeight = right != null ? right.height : 0;

      int delta = leftHeight - rightHeight;
```

### DuplicatedCode
Duplicated code
in `gson/src/main/java/com/google/gson/internal/LinkedTreeMap.java`
#### Snippet
```java
    root.parent = pivot;

    // fix heights
    root.height = Math.max(left != null ? left.height : 0,
        pivotLeft != null ? pivotLeft.height : 0) + 1;
    pivot.height = Math.max(root.height,
        pivotRight != null ? pivotRight.height : 0) + 1;
```

### DuplicatedCode
Duplicated code
in `gson/src/main/java/com/google/gson/internal/bind/DateTypeAdapter.java`
#### Snippet
```java
    String s = in.nextString();
    synchronized (dateFormats) {
      for (DateFormat dateFormat : dateFormats) {
        try {
          return dateFormat.parse(s);
        } catch (ParseException ignored) {
          // OK: try the next format
        }
      }
    }
    try {
      return ISO8601Utils.parse(s, new ParsePosition(0));
    } catch (ParseException e) {
      throw new JsonSyntaxException("Failed parsing '" + s + "' as Date; at path " + in.getPreviousPath(), e);
    }
```

### DuplicatedCode
Duplicated code
in `gson/src/main/java/com/google/gson/internal/bind/DateTypeAdapter.java`
#### Snippet
```java
    if (value == null) {
      out.nullValue();
      return;
    }

    DateFormat dateFormat = dateFormats.get(0);
    String dateFormatAsString;
    synchronized (dateFormats) {
      dateFormatAsString = dateFormat.format(value);
    }
    out.value(dateFormatAsString);
```

### DuplicatedCode
Duplicated code
in `gson/src/main/java/com/google/gson/internal/bind/JsonTreeReader.java`
#### Snippet
```java
    if (stackSize == stack.length) {
      int newLength = stackSize * 2;
      stack = Arrays.copyOf(stack, newLength);
      pathIndices = Arrays.copyOf(pathIndices, newLength);
      pathNames = Arrays.copyOf(pathNames, newLength);
    }
    stack[stackSize++] = newTop;
```

### DuplicatedCode
Duplicated code
in `gson/src/main/java/com/google/gson/internal/bind/TypeAdapters.java`
#### Snippet
```java
    return new TypeAdapterFactory() {
      @SuppressWarnings("unchecked") // we use a runtime check to make sure the 'T's equal
      @Override public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        Class<? super T> rawType = typeToken.getRawType();
        return (rawType == unboxed || rawType == boxed) ? (TypeAdapter<T>) typeAdapter : null;
      }
      @Override public String toString() {
        return "Factory[type=" + boxed.getName()
            + "+" + unboxed.getName() + ",adapter=" + typeAdapter + "]";
      }
    };
```

### DuplicatedCode
Duplicated code
in `metrics/src/main/java/com/google/gson/metrics/CollectionsDeserializationBenchmark.java`
#### Snippet
```java
        jr.beginObject();
        long longValue = 0;
        int intValue = 0;
        boolean booleanValue = false;
        String stringValue = null;
        while(jr.hasNext()) {
          String name = jr.nextName();
          if (name.equals("longValue")) {
            longValue = jr.nextLong();
          } else if (name.equals("intValue")) {
            intValue = jr.nextInt();
          } else if (name.equals("booleanValue")) {
            booleanValue = jr.nextBoolean();
          } else if (name.equals("stringValue")) {
            stringValue = jr.nextString();
          } else {
            throw new IOException("Unexpected name: " + name);
          }
        }
        jr.endObject();
```

### DuplicatedCode
Duplicated code
in `metrics/src/main/java/com/google/gson/metrics/BagOfPrimitivesDeserializationBenchmark.java`
#### Snippet
```java
      long longValue = 0;
      int intValue = 0;
      boolean booleanValue = false;
      String stringValue = null;
      while(jr.hasNext()) {
        String name = jr.nextName();
        if (name.equals("longValue")) {
          longValue = jr.nextLong();
        } else if (name.equals("intValue")) {
          intValue = jr.nextInt();
        } else if (name.equals("booleanValue")) {
          booleanValue = jr.nextBoolean();
        } else if (name.equals("stringValue")) {
          stringValue = jr.nextString();
        } else {
          throw new IOException("Unexpected name: " + name);
        }
      }
      jr.endObject();
```

### DuplicatedCode
Duplicated code
in `metrics/src/main/java/com/google/gson/metrics/CollectionsDeserializationBenchmark.java`
#### Snippet
```java
        jr.beginObject();
        BagOfPrimitives bag = new BagOfPrimitives();
        while(jr.hasNext()) {
          String name = jr.nextName();
          for (Field field : BagOfPrimitives.class.getDeclaredFields()) {
            if (field.getName().equals(name)) {
              Class<?> fieldType = field.getType();
              if (fieldType.equals(long.class)) {
                field.setLong(bag, jr.nextLong());
              } else if (fieldType.equals(int.class)) {
                field.setInt(bag, jr.nextInt());
              } else if (fieldType.equals(boolean.class)) {
                field.setBoolean(bag, jr.nextBoolean());
              } else if (fieldType.equals(String.class)) {
                field.set(bag, jr.nextString());
              } else {
                throw new RuntimeException("Unexpected: type: " + fieldType + ", name: " + name);
              }
            }
          }
        }
        jr.endObject();
```

### DuplicatedCode
Duplicated code
in `metrics/src/main/java/com/google/gson/metrics/BagOfPrimitivesDeserializationBenchmark.java`
#### Snippet
```java
      BagOfPrimitives bag = new BagOfPrimitives();
      while(jr.hasNext()) {
        String name = jr.nextName();
        for (Field field : BagOfPrimitives.class.getDeclaredFields()) {
          if (field.getName().equals(name)) {
            Class<?> fieldType = field.getType();
            if (fieldType.equals(long.class)) {
              field.setLong(bag, jr.nextLong());
            } else if (fieldType.equals(int.class)) {
              field.setInt(bag, jr.nextInt());
            } else if (fieldType.equals(boolean.class)) {
              field.setBoolean(bag, jr.nextBoolean());
            } else if (fieldType.equals(String.class)) {
              field.set(bag, jr.nextString());
            } else {
              throw new RuntimeException("Unexpected: type: " + fieldType + ", name: " + name);
            }
          }
        }
      }
      jr.endObject();
```

## RuleId[id=SwitchStatementWithTooFewBranches]
### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `extras/src/main/java/com/google/gson/typeadapters/UtcDateTypeAdapter.java`
#### Snippet
```java
  public Date read(JsonReader in) throws IOException {
    try {
      switch (in.peek()) {
        case NULL:
          in.nextNull();
```

## RuleId[id=Deprecation]
### Deprecation
Overrides deprecated method in 'com.google.gson.JsonElement'
in `gson/src/main/java/com/google/gson/JsonArray.java`
#### Snippet
```java
  @Deprecated
  @Override
  public char getAsCharacter() {
    return getAsSingleElement().getAsCharacter();
  }
```

### Deprecation
Overrides deprecated method in 'com.google.gson.JsonElement'
in `gson/src/main/java/com/google/gson/JsonPrimitive.java`
#### Snippet
```java
  @Deprecated
  @Override
  public char getAsCharacter() {
    String s = getAsString();
    if (s.isEmpty()) {
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `gson/src/main/java/com/google/gson/reflect/TypeToken.java`
#### Snippet
```java
    }
    exceptionMessage.append("but got: ").append(token.getClass().getName())
        .append(", for type token: ").append(token.toString()).append('.');

    return new AssertionError(exceptionMessage.toString());
```

### UnnecessaryToStringCall
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

### UnnecessaryToStringCall
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

## RuleId[id=ArraysAsListWithZeroOrOneArgument]
### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `shrinker-test/src/main/java/com/example/Main.java`
#### Snippet
```java

    TestExecutor.run(outputConsumer, "Write: TypeToken " + description,
        () -> gson.toJson(Arrays.asList(new ClassWithAdapter(1)), typeTokenSupplier.get().getType()));
    TestExecutor.run(outputConsumer, "Read: TypeToken " + description, () -> {
      Object deserialized = gson.fromJson("[{\"custom\": 3}]", typeTokenSupplier.get());
```

## RuleId[id=EqualsWhichDoesntCheckParameterClass]
### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `gson/src/main/java/com/google/gson/internal/NonNullElementWrapperList.java`
#### Snippet
```java
  }

  @Override public boolean equals(Object o) {
    return delegate.equals(o);
  }
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
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

### UnusedAssignment
Variable `timezone` initializer `null` is redundant
in `gson/src/main/java/com/google/gson/internal/bind/util/ISO8601Utils.java`
#### Snippet
```java
            }

            TimeZone timezone = null;
            char timezoneIndicator = date.charAt(offset);

```

### UnusedAssignment
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

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `gson/src/main/java/com/google/gson/JsonArray.java`
#### Snippet
```java
   */
  @Override
  public Iterator<JsonElement> iterator() {
    return elements.iterator();
  }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `gson/src/main/java/com/google/gson/internal/bind/JsonTreeReader.java`
#### Snippet
```java
public final class JsonTreeReader extends JsonReader {
  private static final Reader UNREADABLE_READER = new Reader() {
    @Override public int read(char[] buffer, int offset, int count) {
      throw new AssertionError();
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `gson/src/main/java/com/google/gson/internal/NonNullElementWrapperList.java`
#### Snippet
```java
  }

  @Override public <T> T[] toArray(T[] a) {
    return delegate.toArray(a);
  }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `gson/src/main/java/com/google/gson/internal/NonNullElementWrapperList.java`
#### Snippet
```java
  }

  @Override public boolean retainAll(Collection<?> c) {
    return delegate.retainAll(c);
  }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `gson/src/main/java/com/google/gson/internal/NonNullElementWrapperList.java`
#### Snippet
```java
  }

  @Override public boolean removeAll(Collection<?> c) {
    return delegate.removeAll(c);
  }
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `gson/src/main/java/com/google/gson/internal/LinkedTreeMap.java`
#### Snippet
```java
    }

    @Override public Iterator<K> iterator() {
      return new LinkedTreeMapIterator<K>() {
        @Override public K next() {
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `gson/src/main/java/com/google/gson/internal/Streams.java`
#### Snippet
```java
        return chars[i];
      }
      @Override public CharSequence subSequence(int start, int end) {
        return new String(chars, start, end - start);
      }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `gson/src/main/java/com/google/gson/internal/Streams.java`
#### Snippet
```java
    }

    @Override public void write(String str, int off, int len) throws IOException {
      // Appendable.append turns null -> "null", which is not desired here
      Objects.requireNonNull(str);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `gson/src/main/java/com/google/gson/internal/Streams.java`
#### Snippet
```java
    }

    @Override public void write(char[] chars, int offset, int length) throws IOException {
      currentWrite.setChars(chars);
      appendable.append(currentWrite, offset, offset + length);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `gson/src/main/java/com/google/gson/internal/bind/JsonTreeWriter.java`
#### Snippet
```java
public final class JsonTreeWriter extends JsonWriter {
  private static final Writer UNWRITABLE_WRITER = new Writer() {
    @Override public void write(char[] buffer, int offset, int counter) {
      throw new AssertionError();
    }
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `gson/src/main/java/com/google/gson/internal/$Gson$Types.java`
#### Snippet
```java
   * The WildcardType interface supports multiple upper bounds and multiple
   * lower bounds. We only support what the target Java version supports - at most one
   * bound, see also https://bugs.openjdk.java.net/browse/JDK-8250660. If a lower bound
   * is set, the upper bound must be Object.class.
   */
```

## RuleId[id=ConstantValue]
### ConstantValue
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

