# intellij-deps-trove4j 
 
# Bad smells
I found 101 bad smells with 37 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| BoundedWildcard | 31 | false |
| NonProtectedConstructorInAbstractClass | 24 | true |
| ArrayEquality | 11 | false |
| SizeReplaceableByIsEmpty | 11 | true |
| ReturnNull | 6 | false |
| EmptyStatementBody | 5 | false |
| DeprecatedIsStillUsed | 5 | false |
| AssignmentToMethodParameter | 2 | false |
| UtilityClassWithoutPrivateConstructor | 2 | true |
| ClassNameSameAsAncestorName | 1 | false |
| NestedAssignment | 1 | false |
| CommentedOutCode | 1 | false |
| ConstantValue | 1 | false |
## RuleId[ruleID=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `a`
in `core/src/main/java/gnu/trove/THashSet.java`
#### Snippet
```java
    int size = size();
    if (a.length < size) {
      a = (T[])Array.newInstance(a.getClass().getComponentType(), size);
    }

```

### AssignmentToMethodParameter
Assignment to method parameter `a`
in `core/src/main/java/gnu/trove/THashMap.java`
#### Snippet
```java
      int size = size();
      if (a.length < size) {
        a = (T[])Array.newInstance(a.getClass().getComponentType(), size);
      }

```

## RuleId[ruleID=ClassNameSameAsAncestorName]
### ClassNameSameAsAncestorName
Class name `Entry` is the same as one of its superclass' names
in `core/src/main/java/gnu/trove/THashMap.java`
#### Snippet
```java
  }

  final class Entry implements Map.Entry<K, V> {
    private final K key;
    private V val;
```

## RuleId[ruleID=ReturnNull]
### ReturnNull
Return of `null`
in `core/src/main/java/gnu/trove/THash.java`
#### Snippet
```java
    }
    catch (CloneNotSupportedException cnse) {
      return null; // it's supported
    }
  }
```

### ReturnNull
Return of `null`
in `core/src/main/java/gnu/trove/TIntObjectHashMap.java`
#### Snippet
```java

  private static <V> V unwrapNull(V value) {
    return value == TObjectHash.NULL ? null : value;
  }

```

### ReturnNull
Return of `null`
in `core/src/main/java/gnu/trove/TIntObjectHashMap.java`
#### Snippet
```java
  public V get(int key) {
    int index = index(key);
    return index < 0 ? null : unwrapNull(_values[index]);
  }

```

### ReturnNull
Return of `null`
in `core/src/main/java/gnu/trove/TLongObjectHashMap.java`
#### Snippet
```java
  public V get(long key) {
    int index = index(key);
    return index < 0 ? null : unwrapNull(_values[index]);
  }

```

### ReturnNull
Return of `null`
in `core/src/main/java/gnu/trove/TLongObjectHashMap.java`
#### Snippet
```java

  private static <V> V unwrapNull(V value) {
    return value == TObjectHash.NULL ? null : value;
  }

```

### ReturnNull
Return of `null`
in `core/src/main/java/gnu/trove/THashMap.java`
#### Snippet
```java
  public V get(Object key) {
    int index = index((K)key);
    return index < 0 ? null : _values[index];
  }

```

## RuleId[ruleID=ArrayEquality]
### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `core/src/main/java/gnu/trove/TIntObjectHashMap.java`
#### Snippet
```java
  public TIntObjectHashMap<V> clone() {
    TIntObjectHashMap<V> m = (TIntObjectHashMap<V>)super.clone();
    m._values = _values == EMPTY_OBJECT_ARRAY ? (V[])EMPTY_OBJECT_ARRAY : _values.clone();
    m._set = _values == EMPTY_OBJECT_ARRAY ? null : _set.clone();
    return m;
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `core/src/main/java/gnu/trove/TIntObjectHashMap.java`
#### Snippet
```java
    TIntObjectHashMap<V> m = (TIntObjectHashMap<V>)super.clone();
    m._values = _values == EMPTY_OBJECT_ARRAY ? (V[])EMPTY_OBJECT_ARRAY : _values.clone();
    m._set = _values == EMPTY_OBJECT_ARRAY ? null : _set.clone();
    return m;
  }
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `core/src/main/java/gnu/trove/TIntObjectHashMap.java`
#### Snippet
```java
   */
  private int insertionIndex(int val) {
    if (_values == EMPTY_OBJECT_ARRAY) {
      setUp((int)(DEFAULT_INITIAL_CAPACITY / DEFAULT_LOAD_FACTOR + 1));
    }
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `core/src/main/java/gnu/trove/TIntObjectHashMap.java`
#### Snippet
```java
    int[] set = _set;
    Object[] values = _values;
    if (values == EMPTY_OBJECT_ARRAY) return -1;
    int length = set.length;
    int hash = _hashingStrategy.computeHashCode(val) & 0x7fffffff;
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `core/src/main/java/gnu/trove/TObjectHash.java`
#### Snippet
```java
   */
  protected int insertionIndex(T obj) {
    if (_set == EMPTY_OBJECT_ARRAY) {
      setUp((int)(DEFAULT_INITIAL_CAPACITY / DEFAULT_LOAD_FACTOR + 1));
    }
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `core/src/main/java/gnu/trove/TObjectHash.java`
#### Snippet
```java
  public TObjectHash<T> clone() {
    TObjectHash<T> h = (TObjectHash<T>)super.clone();
    h._set = _set == EMPTY_OBJECT_ARRAY ? EMPTY_OBJECT_ARRAY : _set.clone();
    return h;
  }
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `core/src/main/java/gnu/trove/TObjectHash.java`
#### Snippet
```java
  protected int index(T obj) {
    Object[] set = _set;
    if (set == EMPTY_OBJECT_ARRAY) return -1;
    int length = set.length;
    int hash = _hashingStrategy.computeHashCode(obj) & 0x7fffffff;
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `core/src/main/java/gnu/trove/TLongObjectHashMap.java`
#### Snippet
```java
   */
  private int insertionIndex(long val) {
    if (_values == EMPTY_OBJECT_ARRAY) {
      setUp((int)(DEFAULT_INITIAL_CAPACITY / DEFAULT_LOAD_FACTOR + 1));
    }
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `core/src/main/java/gnu/trove/TLongObjectHashMap.java`
#### Snippet
```java
  public TLongObjectHashMap<V> clone() {
    TLongObjectHashMap<V> m = (TLongObjectHashMap<V>)super.clone();
    m._values = _values == EMPTY_OBJECT_ARRAY ? (V[])EMPTY_OBJECT_ARRAY : _values.clone();
    m._set = _values == EMPTY_OBJECT_ARRAY ? null : _set.clone();
    return m;
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `core/src/main/java/gnu/trove/TLongObjectHashMap.java`
#### Snippet
```java
    TLongObjectHashMap<V> m = (TLongObjectHashMap<V>)super.clone();
    m._values = _values == EMPTY_OBJECT_ARRAY ? (V[])EMPTY_OBJECT_ARRAY : _values.clone();
    m._set = _values == EMPTY_OBJECT_ARRAY ? null : _set.clone();
    return m;
  }
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `core/src/main/java/gnu/trove/TLongObjectHashMap.java`
#### Snippet
```java
    long[] set = _set;
    Object[] values = _values;
    if (values == EMPTY_OBJECT_ARRAY) return -1;
    int length = set.length;
    int hash = _hashingStrategy.computeHashCode(val) & 0x7fffffff;
```

## RuleId[ruleID=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`sb.length() != 0` can be replaced with '!sb.isEmpty()'
in `core/src/main/java/gnu/trove/TLongIntHashMap.java`
#### Snippet
```java
      @Override
      public boolean execute(long key, int value) {
        if (sb.length() != 0) {
          sb.append(',').append(' ');
        }
```

### SizeReplaceableByIsEmpty
`sb.length() != 0` can be replaced with '!sb.isEmpty()'
in `core/src/main/java/gnu/trove/TIntIntHashMap.java`
#### Snippet
```java
      @Override
      public boolean execute(int key, int value) {
        if (sb.length() != 0) {
          sb.append(',').append(' ');
        }
```

### SizeReplaceableByIsEmpty
`sb.length() != 0` can be replaced with '!sb.isEmpty()'
in `core/src/main/java/gnu/trove/TLongHashSet.java`
#### Snippet
```java
      @Override
      public boolean execute(long value) {
        if (sb.length() != 0) {
          sb.append(',').append(' ');
        }
```

### SizeReplaceableByIsEmpty
`sb.length() != 0` can be replaced with '!sb.isEmpty()'
in `core/src/main/java/gnu/trove/TIntHashSet.java`
#### Snippet
```java
      @Override
      public boolean execute(int value) {
        if (sb.length() != 0) {
          sb.append(',').append(' ');
        }
```

### SizeReplaceableByIsEmpty
`sb.length() != 0` can be replaced with '!sb.isEmpty()'
in `core/src/main/java/gnu/trove/TIntObjectHashMap.java`
#### Snippet
```java
      @Override
      public boolean execute(int key, V value) {
        if (sb.length() != 0) {
          sb.append(',').append(' ');
        }
```

### SizeReplaceableByIsEmpty
`sb.length() != 0` can be replaced with '!sb.isEmpty()'
in `core/src/main/java/gnu/trove/TLongObjectHashMap.java`
#### Snippet
```java
      @Override
      public boolean execute(long key, V value) {
        if (sb.length() != 0) {
          sb.append(',').append(' ');
        }
```

### SizeReplaceableByIsEmpty
`sb.length() != 0` can be replaced with '!sb.isEmpty()'
in `core/src/main/java/gnu/trove/TIntLongHashMap.java`
#### Snippet
```java
      @Override
      public boolean execute(int key, long value) {
        if (sb.length() != 0) {
          sb.append(',').append(' ');
        }
```

### SizeReplaceableByIsEmpty
`sb.length() != 0` can be replaced with '!sb.isEmpty()'
in `core/src/main/java/gnu/trove/TObjectLongHashMap.java`
#### Snippet
```java
      @Override
      public boolean execute(K key, long value) {
        if (sb.length() != 0) {
          sb.append(',').append(' ');
        }
```

### SizeReplaceableByIsEmpty
`sb.length() != 0` can be replaced with '!sb.isEmpty()'
in `core/src/main/java/gnu/trove/TObjectIntHashMap.java`
#### Snippet
```java
      @Override
      public boolean execute(K key, int value) {
        if (sb.length() != 0) {
          sb.append(',').append(' ');
        }
```

### SizeReplaceableByIsEmpty
`sb.length() != 0` can be replaced with '!sb.isEmpty()'
in `core/src/main/java/gnu/trove/THashSet.java`
#### Snippet
```java
      @Override
      public boolean execute(E value) {
        if (sb.length() != 0) {
          sb.append(',').append(' ');
        }
```

### SizeReplaceableByIsEmpty
`sb.length() != 0` can be replaced with '!sb.isEmpty()'
in `core/src/main/java/gnu/trove/THashMap.java`
#### Snippet
```java
      @Override
      public boolean execute(K key, V value) {
        if (sb.length() != 0) {
          sb.append(',').append(' ');
        }
```

## RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `PrimeFinder` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/gnu/trove/PrimeFinder.java`
#### Snippet
```java
 * @version 1.0, 09/24/99
 */
public final class PrimeFinder {
  /**
   * The prime number list.
```

### UtilityClassWithoutPrivateConstructor
Class `HashFunctions` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/gnu/trove/HashFunctions.java`
#### Snippet
```java
 * @version 1.0, 09/24/99
 */
final class HashFunctions {
  /**
   * Returns a hashcode for the specified value.
```

## RuleId[ruleID=EmptyStatementBody]
### EmptyStatementBody
`while` statement has empty body
in `core/src/main/java/gnu/trove/TPrimitiveIterator.java`
#### Snippet
```java
    byte[] states = _hash._states;
    int i = _index;
    while (i-- > 0 && (states[i] != TPrimitiveHash.FULL)) ;
    return i;
  }
```

### EmptyStatementBody
`while` statement has empty body
in `core/src/main/java/gnu/trove/TObjectLongIterator.java`
#### Snippet
```java
    Object[] set = _map._set;
    int i = _index;
    while (i-- > 0 && (set[i] == null || set[i] == TObjectHash.REMOVED)) ;
    return i;
  }
```

### EmptyStatementBody
`while` statement has empty body
in `core/src/main/java/gnu/trove/TObjectIntIterator.java`
#### Snippet
```java
    Object[] set = _map._set;
    int i = _index;
    while (i-- > 0 && (set[i] == null || set[i] == TObjectHash.REMOVED)) ;
    return i;
  }
```

### EmptyStatementBody
`while` statement has empty body
in `core/src/main/java/gnu/trove/TIntObjectIterator.java`
#### Snippet
```java
    Object[] values = _map._values;
    int i = _index;
    while (i-- > 0 && !TIntObjectHashMap.isFull(values, i)) ;
    return i;
  }
```

### EmptyStatementBody
`while` statement has empty body
in `core/src/main/java/gnu/trove/THashIterator.java`
#### Snippet
```java
    Object[] set = _hash._set;
    int i = _index;
    while (i-- > 0 && (set[i] == null || set[i] == TObjectHash.REMOVED)) ;
    return i;
  }
```

## RuleId[ruleID=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `core/src/main/java/gnu/trove/TIterator.java`
#### Snippet
```java
    // doing the assignment && < 0 in one line shaves
    // 3 opcodes...
    if ((_index = nextIndex()) < 0) {
      throw new NoSuchElementException();
    }
```

## RuleId[ruleID=BoundedWildcard]
### BoundedWildcard
Can generalize to `? super V`
in `core/src/main/java/gnu/trove/TIntObjectHashMap.java`
#### Snippet
```java
   * the procedure returned false for some entry.
   */
  public boolean forEachEntry(TIntObjectProcedure<V> procedure) {
    int[] keys = _set;
    V[] values = _values;
```

### BoundedWildcard
Can generalize to `? super V`
in `core/src/main/java/gnu/trove/TIntObjectHashMap.java`
#### Snippet
```java
   * @param function a <code>TObjectFunction</code> value
   */
  public void transformValues(TObjectFunction<V, V> function) {
    V[] values = _values;
    for (int i = values.length; i-- > 0; ) {
```

### BoundedWildcard
Can generalize to `? extends V`
in `core/src/main/java/gnu/trove/TIntObjectHashMap.java`
#### Snippet
```java
   * @param function a <code>TObjectFunction</code> value
   */
  public void transformValues(TObjectFunction<V, V> function) {
    V[] values = _values;
    for (int i = values.length; i-- > 0; ) {
```

### BoundedWildcard
Can generalize to `? super V`
in `core/src/main/java/gnu/trove/TIntObjectHashMap.java`
#### Snippet
```java
   * @return true if the map was modified.
   */
  public boolean retainEntries(TIntObjectProcedure<V> procedure) {
    boolean modified = false;
    int[] keys = _set;
```

### BoundedWildcard
Can generalize to `? super V`
in `core/src/main/java/gnu/trove/TIntObjectHashMap.java`
#### Snippet
```java
   * the procedure returned false for some value.
   */
  public boolean forEachValue(TObjectProcedure<V> procedure) {
    V[] values = _values;
    for (int i = values.length; i-- > 0; ) {
```

### BoundedWildcard
Can generalize to `? super T`
in `core/src/main/java/gnu/trove/TObjectHash.java`
#### Snippet
```java
   * the procedure returned false for some value.
   */
  public boolean forEach(TObjectProcedure<T> procedure) {
    Object[] set = _set;
    for (int i = set.length; i-- > 0; ) {
```

### BoundedWildcard
Can generalize to `? super V`
in `core/src/main/java/gnu/trove/TLongObjectHashMap.java`
#### Snippet
```java
   * the procedure returned false for some entry.
   */
  public boolean forEachEntry(TLongObjectProcedure<V> procedure) {
    long[] keys = _set;
    V[] values = _values;
```

### BoundedWildcard
Can generalize to `? super V`
in `core/src/main/java/gnu/trove/TLongObjectHashMap.java`
#### Snippet
```java
   * @param function a <code>TObjectFunction</code> value
   */
  public void transformValues(TObjectFunction<V, V> function) {
    V[] values = _values;
    for (int i = values.length; i-- > 0; ) {
```

### BoundedWildcard
Can generalize to `? extends V`
in `core/src/main/java/gnu/trove/TLongObjectHashMap.java`
#### Snippet
```java
   * @param function a <code>TObjectFunction</code> value
   */
  public void transformValues(TObjectFunction<V, V> function) {
    V[] values = _values;
    for (int i = values.length; i-- > 0; ) {
```

### BoundedWildcard
Can generalize to `? super V`
in `core/src/main/java/gnu/trove/TLongObjectHashMap.java`
#### Snippet
```java
   * @return true if the map was modified.
   */
  public boolean retainEntries(TLongObjectProcedure<V> procedure) {
    boolean modified = false;
    long[] keys = _set;
```

### BoundedWildcard
Can generalize to `? super V`
in `core/src/main/java/gnu/trove/TLongObjectHashMap.java`
#### Snippet
```java
   * the procedure returned false for some value.
   */
  public boolean forEachValue(TObjectProcedure<V> procedure) {
    V[] values = _values;
    for (int i = values.length; i-- > 0; ) {
```

### BoundedWildcard
Can generalize to `? super K`
in `core/src/main/java/gnu/trove/TObjectLongHashMap.java`
#### Snippet
```java
   * @return true if the map was modified.
   */
  public boolean retainEntries(TObjectLongProcedure<K> procedure) {
    boolean modified = false;
    K[] keys = (K[])_set;
```

### BoundedWildcard
Can generalize to `? super K`
in `core/src/main/java/gnu/trove/TObjectLongHashMap.java`
#### Snippet
```java
   * the procedure returned false for some entry.
   */
  public boolean forEachEntry(TObjectLongProcedure<K> procedure) {
    K[] keys = (K[])_set;
    long[] values = _values;
```

### BoundedWildcard
Can generalize to `? super K`
in `core/src/main/java/gnu/trove/TObjectLongHashMap.java`
#### Snippet
```java
    private final TObjectLongHashMap<K> _otherMap;

    EqProcedure(TObjectLongHashMap<K> otherMap) {
      _otherMap = otherMap;
    }
```

### BoundedWildcard
Can generalize to `? super K`
in `core/src/main/java/gnu/trove/TObjectIntHashMap.java`
#### Snippet
```java
   * @return true if the map was modified.
   */
  public boolean retainEntries(TObjectIntProcedure<K> procedure) {
    boolean modified = false;
    K[] keys = (K[])_set;
```

### BoundedWildcard
Can generalize to `? super K`
in `core/src/main/java/gnu/trove/TObjectIntHashMap.java`
#### Snippet
```java
   * the procedure returned false for some entry.
   */
  public boolean forEachEntry(TObjectIntProcedure<K> procedure) {
    K[] keys = (K[])_set;
    int[] values = _values;
```

### BoundedWildcard
Can generalize to `? super K`
in `core/src/main/java/gnu/trove/TObjectIntHashMap.java`
#### Snippet
```java
    private final TObjectIntHashMap<K> _otherMap;

    EqProcedure(TObjectIntHashMap<K> otherMap) {
      _otherMap = otherMap;
    }
```

### BoundedWildcard
Can generalize to `? extends V`
in `core/src/main/java/gnu/trove/THashMap.java`
#### Snippet
```java
    }

    protected V valueForEntry(Map.Entry<K, V> entry) {
      return entry.getValue();
    }
```

### BoundedWildcard
Can generalize to `? super K`
in `core/src/main/java/gnu/trove/THashMap.java`
#### Snippet
```java
   * the procedure returned false for some entry.
   */
  public boolean forEachEntry(TObjectObjectProcedure<K, V> procedure) {
    Object[] keys = _set;
    V[] values = _values;
```

### BoundedWildcard
Can generalize to `? super V`
in `core/src/main/java/gnu/trove/THashMap.java`
#### Snippet
```java
   * the procedure returned false for some entry.
   */
  public boolean forEachEntry(TObjectObjectProcedure<K, V> procedure) {
    Object[] keys = _set;
    V[] values = _values;
```

### BoundedWildcard
Can generalize to `? extends K`
in `core/src/main/java/gnu/trove/THashMap.java`
#### Snippet
```java
    }

    protected K keyForEntry(Map.Entry<K, V> entry) {
      return entry.getKey();
    }
```

### BoundedWildcard
Can generalize to `? super V`
in `core/src/main/java/gnu/trove/THashMap.java`
#### Snippet
```java
   * the procedure returned false for some value.
   */
  public boolean forEachValue(TObjectProcedure<V> procedure) {
    V[] values = _values;
    Object[] set = _set;
```

### BoundedWildcard
Can generalize to `? super K`
in `core/src/main/java/gnu/trove/THashMap.java`
#### Snippet
```java
   * @return true if the map was modified.
   */
  public boolean retainEntries(TObjectObjectProcedure<K, V> procedure) {
    Object[] keys = _set;
    V[] values = _values;
```

### BoundedWildcard
Can generalize to `? super V`
in `core/src/main/java/gnu/trove/THashMap.java`
#### Snippet
```java
   * @return true if the map was modified.
   */
  public boolean retainEntries(TObjectObjectProcedure<K, V> procedure) {
    Object[] keys = _set;
    V[] values = _values;
```

### BoundedWildcard
Can generalize to `? extends V`
in `core/src/main/java/gnu/trove/THashMap.java`
#### Snippet
```java
    private final Map<K, V> _otherMap;

    EqProcedure(Map<K, V> otherMap) {
      _otherMap = otherMap;
    }
```

### BoundedWildcard
Can generalize to `? extends K`
in `core/src/main/java/gnu/trove/THashMap.java`
#### Snippet
```java
   * @param map a <code>Map</code> value
   */
  public THashMap(Map<K, V> map) {
    this(map.size());
    putAll(map);
```

### BoundedWildcard
Can generalize to `? extends V`
in `core/src/main/java/gnu/trove/THashMap.java`
#### Snippet
```java
   * @param map a <code>Map</code> value
   */
  public THashMap(Map<K, V> map) {
    this(map.size());
    putAll(map);
```

### BoundedWildcard
Can generalize to `? extends K`
in `core/src/main/java/gnu/trove/THashMap.java`
#### Snippet
```java
   * @param strategy used to compute hash codes and to compare objects.
   */
  public THashMap(Map<K, V> map, TObjectHashingStrategy<K> strategy) {
    this(map.size(), strategy);
    putAll(map);
```

### BoundedWildcard
Can generalize to `? extends V`
in `core/src/main/java/gnu/trove/THashMap.java`
#### Snippet
```java
   * @param strategy used to compute hash codes and to compare objects.
   */
  public THashMap(Map<K, V> map, TObjectHashingStrategy<K> strategy) {
    this(map.size(), strategy);
    putAll(map);
```

### BoundedWildcard
Can generalize to `? super V`
in `core/src/main/java/gnu/trove/THashMap.java`
#### Snippet
```java
   * @param function a <code>TObjectFunction</code> value
   */
  public void transformValues(TObjectFunction<V, V> function) {
    V[] values = _values;
    Object[] set = _set;
```

### BoundedWildcard
Can generalize to `? extends V`
in `core/src/main/java/gnu/trove/THashMap.java`
#### Snippet
```java
   * @param function a <code>TObjectFunction</code> value
   */
  public void transformValues(TObjectFunction<V, V> function) {
    V[] values = _values;
    Object[] set = _set;
```

## RuleId[ruleID=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'TPrimitiveHash' is still used
in `core/src/main/java/gnu/trove/TPrimitiveHash.java`
#### Snippet
```java
 */
@Deprecated
public abstract class TPrimitiveHash extends THash {
  /**
   * flags indicating whether each position in the hash is
```

### DeprecatedIsStillUsed
Deprecated member 'TIntObjectHashMap' is still used
in `core/src/main/java/gnu/trove/TIntObjectHashMap.java`
#### Snippet
```java
 */
@Deprecated
public class TIntObjectHashMap<V> extends THash implements TIntHashingStrategy {
  /**
   * the values of the map
```

### DeprecatedIsStillUsed
Deprecated member 'TObjectLongHashMap' is still used
in `core/src/main/java/gnu/trove/TObjectLongHashMap.java`
#### Snippet
```java
 */
@Deprecated
public class TObjectLongHashMap<K> extends TObjectHash<K> {

  /**
```

### DeprecatedIsStillUsed
Deprecated member 'TObjectIntHashMap' is still used
in `core/src/main/java/gnu/trove/TObjectIntHashMap.java`
#### Snippet
```java
 */
@Deprecated
public class TObjectIntHashMap<K> extends TObjectHash<K> {

  /**
```

### DeprecatedIsStillUsed
Deprecated member 'THashMap' is still used
in `core/src/main/java/gnu/trove/THashMap.java`
#### Snippet
```java
 */
@Deprecated
public class THashMap<K, V> extends TObjectHash<K> implements Map<K, V> {

  /**
```

## RuleId[ruleID=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `TPrimitiveHash()` of an abstract class should not be declared 'public'
in `core/src/main/java/gnu/trove/TPrimitiveHash.java`
#### Snippet
```java
   * @param loadFactor      a <code>float</code> value
   */
  public TPrimitiveHash(int initialCapacity, float loadFactor) {
    super(initialCapacity, loadFactor);
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `TPrimitiveHash()` of an abstract class should not be declared 'public'
in `core/src/main/java/gnu/trove/TPrimitiveHash.java`
#### Snippet
```java
   * @param initialCapacity an <code>int</code> value
   */
  public TPrimitiveHash(int initialCapacity) {
    this(initialCapacity, DEFAULT_LOAD_FACTOR);
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `TPrimitiveHash()` of an abstract class should not be declared 'public'
in `core/src/main/java/gnu/trove/TPrimitiveHash.java`
#### Snippet
```java
   * capacity and load factor.
   */
  public TPrimitiveHash() {
    super();
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `THash()` of an abstract class should not be declared 'public'
in `core/src/main/java/gnu/trove/THash.java`
#### Snippet
```java
   * @param loadFactor      a <code>float</code> value
   */
  public THash(int initialCapacity, float loadFactor) {
    super();
    _loadFactor = loadFactor;
```

### NonProtectedConstructorInAbstractClass
Constructor `THash()` of an abstract class should not be declared 'public'
in `core/src/main/java/gnu/trove/THash.java`
#### Snippet
```java
   * capacity and load factor.
   */
  public THash() {
    this(JUST_CREATED_CAPACITY, DEFAULT_LOAD_FACTOR);
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `THash()` of an abstract class should not be declared 'public'
in `core/src/main/java/gnu/trove/THash.java`
#### Snippet
```java
   * @param initialCapacity an <code>int</code> value
   */
  public THash(int initialCapacity) {
    this(initialCapacity, DEFAULT_LOAD_FACTOR);
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `TObjectHash()` of an abstract class should not be declared 'public'
in `core/src/main/java/gnu/trove/TObjectHash.java`
#### Snippet
```java
   *                        rehashing takes place.
   */
  public TObjectHash(int initialCapacity, float loadFactor) {
    super(initialCapacity, loadFactor);
    _hashingStrategy = this;
```

### NonProtectedConstructorInAbstractClass
Constructor `TObjectHash()` of an abstract class should not be declared 'public'
in `core/src/main/java/gnu/trove/TObjectHash.java`
#### Snippet
```java
   * @param initialCapacity an <code>int</code> value
   */
  public TObjectHash(int initialCapacity) {
    super(initialCapacity);
    _hashingStrategy = this;
```

### NonProtectedConstructorInAbstractClass
Constructor `TObjectHash()` of an abstract class should not be declared 'public'
in `core/src/main/java/gnu/trove/TObjectHash.java`
#### Snippet
```java
   * @param strategy used to compute hash codes and to compare objects.
   */
  public TObjectHash(TObjectHashingStrategy<T> strategy) {
    _hashingStrategy = strategy;
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `TObjectHash()` of an abstract class should not be declared 'public'
in `core/src/main/java/gnu/trove/TObjectHash.java`
#### Snippet
```java
   * default capacity and load factor.
   */
  public TObjectHash() {
    _hashingStrategy = this;
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `TObjectHash()` of an abstract class should not be declared 'public'
in `core/src/main/java/gnu/trove/TObjectHash.java`
#### Snippet
```java
   * @param strategy        used to compute hash codes and to compare objects.
   */
  public TObjectHash(int initialCapacity, TObjectHashingStrategy<T> strategy) {
    super(initialCapacity);
    _hashingStrategy = strategy;
```

### NonProtectedConstructorInAbstractClass
Constructor `TObjectHash()` of an abstract class should not be declared 'public'
in `core/src/main/java/gnu/trove/TObjectHash.java`
#### Snippet
```java
   * @param strategy        used to compute hash codes and to compare objects.
   */
  public TObjectHash(int initialCapacity, float loadFactor, TObjectHashingStrategy<T> strategy) {
    super(initialCapacity, loadFactor);
    _hashingStrategy = strategy;
```

### NonProtectedConstructorInAbstractClass
Constructor `TLongHash()` of an abstract class should not be declared 'public'
in `core/src/main/java/gnu/trove/TLongHash.java`
#### Snippet
```java
   * @param strategy        used to compute hash codes and to compare keys.
   */
  public TLongHash(int initialCapacity, float loadFactor, TLongHashingStrategy strategy) {
    super(initialCapacity, loadFactor);
    _hashingStrategy = strategy;
```

### NonProtectedConstructorInAbstractClass
Constructor `TLongHash()` of an abstract class should not be declared 'public'
in `core/src/main/java/gnu/trove/TLongHash.java`
#### Snippet
```java
   * @param strategy        used to compute hash codes and to compare keys.
   */
  public TLongHash(int initialCapacity, TLongHashingStrategy strategy) {
    super(initialCapacity);
    _hashingStrategy = strategy;
```

### NonProtectedConstructorInAbstractClass
Constructor `TLongHash()` of an abstract class should not be declared 'public'
in `core/src/main/java/gnu/trove/TLongHash.java`
#### Snippet
```java
   * capacity and load factor.
   */
  public TLongHash() {
    _hashingStrategy = this;
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `TLongHash()` of an abstract class should not be declared 'public'
in `core/src/main/java/gnu/trove/TLongHash.java`
#### Snippet
```java
   * @param initialCapacity an <code>int</code> value
   */
  public TLongHash(int initialCapacity) {
    super(initialCapacity);
    _hashingStrategy = this;
```

### NonProtectedConstructorInAbstractClass
Constructor `TLongHash()` of an abstract class should not be declared 'public'
in `core/src/main/java/gnu/trove/TLongHash.java`
#### Snippet
```java
   * @param strategy used to compute hash codes and to compare keys.
   */
  public TLongHash(TLongHashingStrategy strategy) {
    _hashingStrategy = strategy;
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `TLongHash()` of an abstract class should not be declared 'public'
in `core/src/main/java/gnu/trove/TLongHash.java`
#### Snippet
```java
   *                        rehashing takes place.
   */
  public TLongHash(int initialCapacity, float loadFactor) {
    super(initialCapacity, loadFactor);
    _hashingStrategy = this;
```

### NonProtectedConstructorInAbstractClass
Constructor `TIntHash()` of an abstract class should not be declared 'public'
in `core/src/main/java/gnu/trove/TIntHash.java`
#### Snippet
```java
   * @param strategy        used to compute hash codes and to compare keys.
   */
  public TIntHash(int initialCapacity, float loadFactor, TIntHashingStrategy strategy) {
    super(initialCapacity, loadFactor);
    _hashingStrategy = strategy;
```

### NonProtectedConstructorInAbstractClass
Constructor `TIntHash()` of an abstract class should not be declared 'public'
in `core/src/main/java/gnu/trove/TIntHash.java`
#### Snippet
```java
   * @param strategy        used to compute hash codes and to compare keys.
   */
  public TIntHash(int initialCapacity, TIntHashingStrategy strategy) {
    super(initialCapacity);
    _hashingStrategy = strategy;
```

### NonProtectedConstructorInAbstractClass
Constructor `TIntHash()` of an abstract class should not be declared 'public'
in `core/src/main/java/gnu/trove/TIntHash.java`
#### Snippet
```java
   *                        rehashing takes place.
   */
  public TIntHash(int initialCapacity, float loadFactor) {
    super(initialCapacity, loadFactor);
    _hashingStrategy = this;
```

### NonProtectedConstructorInAbstractClass
Constructor `TIntHash()` of an abstract class should not be declared 'public'
in `core/src/main/java/gnu/trove/TIntHash.java`
#### Snippet
```java
   * @param strategy used to compute hash codes and to compare keys.
   */
  public TIntHash(TIntHashingStrategy strategy) {
    _hashingStrategy = strategy;
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `TIntHash()` of an abstract class should not be declared 'public'
in `core/src/main/java/gnu/trove/TIntHash.java`
#### Snippet
```java
   * @param initialCapacity an <code>int</code> value
   */
  public TIntHash(int initialCapacity) {
    super(initialCapacity);
    _hashingStrategy = this;
```

### NonProtectedConstructorInAbstractClass
Constructor `TIntHash()` of an abstract class should not be declared 'public'
in `core/src/main/java/gnu/trove/TIntHash.java`
#### Snippet
```java
   * capacity and load factor.
   */
  public TIntHash() {
    _hashingStrategy = this;
  }
```

## RuleId[ruleID=CommentedOutCode]
### CommentedOutCode
Commented out code (6 lines)
in `core/src/main/java/gnu/trove/HashFunctions.java`
#### Snippet
```java
    return value;
	
        /*
          value &= 0x7FFFFFFF; // make it >=0
          int hashCode = 0;
```

## RuleId[ruleID=ConstantValue]
### ConstantValue
Value `val` is always 'null'
in `core/src/main/java/gnu/trove/THashMap.java`
#### Snippet
```java
      for (int i = vals.length; i-- > 0; ) {
        if (set[i] != null && set[i] != REMOVED &&
            val == vals[i]) {
          return true;
        }
```

