# intellij-deps-trove4j 
 
# Bad smells
I found 128 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UNCHECKED_WARNING | 66 | false |
| DuplicatedCode | 33 | false |
| Deprecation | 12 | false |
| EmptyStatementBody | 8 | false |
| DeprecatedIsStillUsed | 5 | false |
| JavadocReference | 1 | false |
| CommentedOutCode | 1 | false |
| FieldMayBeFinal | 1 | false |
| ConstantValue | 1 | false |
## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `core/src/main/java/gnu/trove/TByteArrayList.java`
#### Snippet
```java
    if (offset == _pos) {
      add(value);
      return;
    }
    ensureCapacity(_pos + 1);
    // shift right
    System.arraycopy(_data, offset, _data, offset + 1, _pos - offset);
    // insert
    _data[offset] = value;
    _pos++;
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/gnu/trove/TByteArrayList.java`
#### Snippet
```java
    if (offset == _pos) {
      add(values, valOffset, len);
      return;
    }

    ensureCapacity(_pos + len);
    // shift right
    System.arraycopy(_data, offset, _data, offset + len, _pos - offset);
    // insert
    System.arraycopy(values, valOffset, _data, offset, len);
    _pos += len;
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/gnu/trove/TByteArrayList.java`
#### Snippet
```java
    if (offset < 0 || offset >= _pos) {
      throw new ArrayIndexOutOfBoundsException(offset);
    }

    if (offset == 0) {
      // data at the front
      System.arraycopy(_data, length, _data, 0, _pos - length);
    }
    else if (_pos - length == offset) {
      // no copy to make, decrementing pos "deletes" values at
      // the end
    }
    else {
      // data in the middle
      System.arraycopy(_data, offset + length,
                       _data, offset, _pos - (offset + length));
    }
    _pos -= length;
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/gnu/trove/TByteArrayList.java`
#### Snippet
```java
    if (from == to) {
      return;             // nothing to do
    }
    if (from > to) {
      throw new IllegalArgumentException("from cannot be greater than to");
    }
    for (int i = from, j = to - 1; i < j; i++, j--) {
      swap(i, j);
    }
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/gnu/trove/THashIterator.java`
#### Snippet
```java
    if (_expectedSize != _hash.size()) {
      throw new ConcurrentModificationException();
    }

    Object[] set = _hash._set;
    int i = _index;
    while (i-- > 0 && (set[i] == null || set[i] == TObjectHash.REMOVED)) ;
    return i;
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/gnu/trove/TIntHash.java`
#### Snippet
```java
    byte[] states = _states;
    int[] set = _set;
    if (states != null) {
      for (int i = states.length; i-- > 0; ) {
        if (states[i] == FULL && !procedure.execute(set[i])) {
          return false;
        }
      }
    }
    return true;
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/gnu/trove/TIntHash.java`
#### Snippet
```java
    if (states[index] != FREE &&
        (states[index] == REMOVED || set[index] != val)) {
      // see Knuth, p. 529
      int probe = 1 + (hash % (length - 2));

      do {
        index -= probe;
        if (index < 0) {
          index += length;
        }
      }
      while (states[index] != FREE &&
             (states[index] == REMOVED || set[index] != val));
    }

    return states[index] == FREE ? -1 : index;
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/gnu/trove/TIntHash.java`
#### Snippet
```java
    if (states[index] == FREE) {
      return index;       // empty, all done
    }
    else if (states[index] == FULL && set[index] == val) {
      return -index - 1;   // already stored
    }
    else {                // already FULL or REMOVED, must probe
      // compute the double hash
      int probe = 1 + (hash % (length - 2));
      // starting at the natural offset, probe until we find an
      // offset that isn't full.
      do {
        index -= probe;
        if (index < 0) {
          index += length;
        }
      }
      while (states[index] == FULL && set[index] != val);

      // if the index we found was removed: continue probing until we
      // locate a free location or an element which equal()s the
      // one we have.
      if (states[index] == REMOVED) {
        int firstRemoved = index;
        while (states[index] != FREE &&
               (states[index] == REMOVED || set[index] != val)) {
          index -= probe;
          if (index < 0) {
            index += length;
          }
        }
        return states[index] == FULL ? -index - 1 : firstRemoved;
      }
      // if it's full, the key is already stored
      return states[index] == FULL ? -index - 1 : index;
    }
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/gnu/trove/TIntHashSet.java`
#### Snippet
```java
    int index = insertionIndex(val);

    if (index < 0) {
      return false;       // already present in set, nothing to add
    }

    byte previousState = _states[index];
    _set[index] = val;
    _states[index] = FULL;
    postInsertHook(previousState == FREE);

    return true;            // yes, we added something
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/gnu/trove/TIntHashSet.java`
#### Snippet
```java
    int[] result = new int[size()];
    int[] set = _set;
    byte[] states = _states;
    if (states != null) {
      for (int i = states.length, j = 0; i-- > 0; ) {
        if (states[i] == FULL) {
          result[j++] = set[i];
        }
      }
    }
    return result;
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/gnu/trove/TIntHashSet.java`
#### Snippet
```java
    byte[] states = _states;

    boolean changed = false;
    if (set != null) {
      for (int i = set.length; i-- > 0; ) {
        if (states[i] == FULL && Arrays.binarySearch(array, set[i]) < 0) {
          remove(set[i]);
          changed = true;
        }
      }
    }
    return changed;
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/gnu/trove/TIntIntHashMap.java`
#### Snippet
```java
    int previous = 0;
    int index = insertionIndex(key);
    boolean isNewMapping = true;
    if (index < 0) {
      index = -index - 1;
      previous = _values[index];
      isNewMapping = false;
    }
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/gnu/trove/TIntIntHashMap.java`
#### Snippet
```java
    _states = new byte[newCapacity];

    for (int i = oldCapacity; i-- > 0; ) {
      if (oldStates[i] == FULL) {
        int o = oldKeys[i];
        int index = insertionIndex(o);
        _set[index] = o;
        _values[index] = oldVals[i];
        _states[index] = FULL;
      }
    }
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/gnu/trove/TIntIntHashMap.java`
#### Snippet
```java
    int[] vals = _values;
    if (vals == null) return;
    byte[] states = _states;

    for (int i = keys.length; i-- > 0; ) {
      keys[i] = 0;
      vals[i] = 0;
      states[i] = FREE;
    }
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/gnu/trove/TIntIntHashMap.java`
#### Snippet
```java
    byte[] states = _states;
    int[] vals = _values;
    if (states != null) {
      for (int i = states.length; i-- > 0; ) {
        if (states[i] == FULL && val == vals[i]) {
          return true;
        }
      }
    }
    return false;
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/gnu/trove/TIntIntHashMap.java`
#### Snippet
```java
    if (states != null) {
      for (int i = states.length; i-- > 0; ) {
        if (states[i] == FULL && !procedure.execute(keys[i], values[i])) {
          return false;
        }
      }
    }
    return true;
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/gnu/trove/TIntIntHashMap.java`
#### Snippet
```java
    int[] values = _values;
    if (states != null) {
      for (int i = states.length; i-- > 0; ) {
        if (states[i] == FULL && !procedure.execute(keys[i], values[i])) {
          removeAt(i);
          modified = true;
        }
      }
    }
    return modified;
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/gnu/trove/TIntLongHashMap.java`
#### Snippet
```java
    if (states != null) {
      for (int i = states.length; i-- > 0; ) {
        if (states[i] == FULL && !procedure.execute(keys[i], values[i])) {
          removeAt(i);
          modified = true;
        }
      }
    }
    return modified;
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/gnu/trove/TIntIntHashMap.java`
#### Snippet
```java
    byte[] states = _states;
    int[] values = _values;
    if (states != null) {
      for (int i = states.length; i-- > 0; ) {
        if (states[i] == FULL) {
          values[i] = function.execute(values[i]);
        }
      }
    }
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/gnu/trove/TIntLongHashMap.java`
#### Snippet
```java
    long previous = 0;
    int index = insertionIndex(key);
    boolean isNewMapping = true;
    if (index < 0) {
      index = -index - 1;
      previous = _values[index];
      isNewMapping = false;
    }
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/gnu/trove/TIntLongHashMap.java`
#### Snippet
```java
    long[] vals = new long[size()];
    long[] v = _values;
    byte[] states = _states;

    if (states != null) {
      for (int i = states.length, j = 0; i-- > 0; ) {
        if (states[i] == FULL) {
          vals[j++] = v[i];
        }
      }
    }
    return vals;
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/gnu/trove/TIntLongHashMap.java`
#### Snippet
```java
    byte[] states = _states;
    long[] values = _values;
    if (states != null) {
      for (int i = states.length; i-- > 0; ) {
        if (states[i] == FULL && !procedure.execute(values[i])) {
          return false;
        }
      }
    }
    return true;
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/gnu/trove/TIntObjectHashMap.java`
#### Snippet
```java
    boolean wasFree = false;
    V previous = null;
    int index = insertionIndex(key);
    boolean isNewMapping = true;
    if (index < 0) {
      index = -index - 1;
      previous = unwrapNull(_values[index]);
      isNewMapping = false;
    }
    else {
      wasFree = isFree(_values, index);
    }
    _set[index] = key;
    _values[index] = wrapNull(value);
    if (isNewMapping) {
      postInsertHook(wasFree);
    }

    return previous;
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/gnu/trove/TIntObjectHashMap.java`
#### Snippet
```java
    Object[] values = _values;
    if (values == EMPTY_OBJECT_ARRAY) return -1;
    int length = set.length;
    int hash = _hashingStrategy.computeHashCode(val) & 0x7fffffff;
    int index = hash % length;

    if (!isFree(values, index) &&
        (isRemoved(values, index) || set[index] != val)) {
      // see Knuth, p. 529
      int probe = 1 + (hash % (length - 2));

      do {
        index -= probe;
        if (index < 0) {
          index += length;
        }
      }
      while (!isFree(values, index) &&
             (isRemoved(values, index) || set[index] != val));
    }

    return isFree(values, index) ? -1 : index;
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/gnu/trove/TIntObjectHashMap.java`
#### Snippet
```java
    if (isFree(values, index)) {
      return index;       // empty, all done
    }
    if (isFull(values, index) && set[index] == val) {
      return -index - 1;   // already stored
    }

    // already FULL or REMOVED, must probe
    // compute the double hash
    int probe = 1 + (hash % (length - 2));
    // starting at the natural offset, probe until we find an
    // offset that isn't full.

    // keep track of the first removed cell. it's the natural candidate for re-insertion
    int firstRemoved = isRemoved(values, index) ? index : -1;

    do {
      index -= probe;
      if (index < 0) {
        index += length;
      }
      if (firstRemoved == -1 && isRemoved(values, index)) {
        firstRemoved = index;
      }
    }
    while (isFull(values, index) && set[index] != val);

    // if the index we found was removed: continue probing until we
    // locate a free location or an element which equal()s the
    // one we have.
    if (isRemoved(values, index)) {
      while (!isFree(values, index) &&
             (isRemoved(values, index) || set[index] != val)) {
        index -= probe;
        if (index < 0) {
          index += length;
        }
      }
    }
    // if it's full, the key is already stored
    if (isFull(values, index)) {
      return -index - 1;
    }

    return firstRemoved == -1 ? index : firstRemoved;
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/gnu/trove/TIntObjectHashMap.java`
#### Snippet
```java
    Object[] vals = new Object[size()];
    V[] values = _values;

    for (int i = values.length, j = 0; i-- > 0; ) {
      if (isFull(values, i)) {
        vals[j++] = unwrapNull(values[i]);
      }
    }
    return vals;
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/gnu/trove/TIntObjectHashMap.java`
#### Snippet
```java
    V[] values = _values;

    // special case null values so that we don't have to
    // perform null checks before every call to equals()
    if (null == val) {
      for (int i = values.length; i-- > 0; ) {
        if (TObjectHash.NULL == values[i]) {
          return true;
        }
      }
    }
    else {
      for (int i = values.length; i-- > 0; ) {
        V value = unwrapNull(values[i]);
        if (isFull(values, i) && (val == value || val.equals(value))) {
          return true;
        }
      }
    }
    return false;
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/gnu/trove/TIntObjectHashMap.java`
#### Snippet
```java
    V[] values = _values;
    stopCompactingOnRemove();
    try {
      for (int i = values.length; i-- > 0; ) {
        if (isFull(values, i) && !procedure.execute(keys[i], unwrapNull(values[i]))) {
          removeAt(i);
          modified = true;
        }
      }
    }
    finally {
      startCompactingOnRemove(modified);
    }
    return modified;
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/gnu/trove/TIntObjectHashMap.java`
#### Snippet
```java
        if (sb.length() != 0) {
          sb.append(',').append(' ');
        }
        sb.append(key);
        sb.append('=');
        sb.append(value == this ? "(this Map)" : value);
        return true;
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/gnu/trove/TObjectIntHashMap.java`
#### Snippet
```java
    for (int i = oldCapacity; i-- > 0; ) {
      if (oldKeys[i] != null && oldKeys[i] != REMOVED) {
        K o = oldKeys[i];
        int index = insertionIndex(o);
        if (index < 0) {
          throwObjectContractViolation(_set[-index - 1], o);
        }
        _set[index] = o;
        _values[index] = oldVals[i];
      }
    }
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/gnu/trove/TObjectIntHashMap.java`
#### Snippet
```java
    Object[] keys = new Object[size()];
    K[] k = (K[])_set;
    for (int i = k.length, j = 0; i-- > 0; ) {
      if (k[i] != null && k[i] != REMOVED) {
        keys[j++] = k[i];
      }
    }
    return keys;
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/gnu/trove/TObjectIntHashMap.java`
#### Snippet
```java
    stopCompactingOnRemove();
    try {
      for (int i = keys.length; i-- > 0; ) {
        if (keys[i] != null
            && keys[i] != REMOVED
            && !procedure.execute(keys[i], values[i])) {
          removeAt(i);
          modified = true;
        }
      }
    }
    finally {
      startCompactingOnRemove(modified);
    }
    return modified;
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/gnu/trove/TObjectIntHashMap.java`
#### Snippet
```java
        if (sb.length() != 0) {
          sb.append(',').append(' ');
        }
        sb.append(key == this ? "(this Map)" : key);
        sb.append('=');
        sb.append(value);
        return true;
```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'E'
in `core/src/main/java/gnu/trove/TObjectHashIterator.java`
#### Snippet
```java
  @Override
  protected E objectAtIndex(int index) {
    return (E)_objectHash._set[index];
  }
} // TObjectHashIterator
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object\[\]' to 'K\[\]'
in `core/src/main/java/gnu/trove/TObjectLongHashMap.java`
#### Snippet
```java
  public Object[] keys() {
    Object[] keys = new Object[size()];
    K[] k = (K[])_set;
    for (int i = k.length, j = 0; i-- > 0; ) {
      if (k[i] != null && k[i] != REMOVED) {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object\[\]' to 'K\[\]'
in `core/src/main/java/gnu/trove/TObjectLongHashMap.java`
#### Snippet
```java
  protected void rehash(int newCapacity) {
    int oldCapacity = capacity();
    K[] oldKeys = (K[])_set;
    long[] oldVals = _values;

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'K'
in `core/src/main/java/gnu/trove/TObjectLongHashMap.java`
#### Snippet
```java
    setUp(size);
    while (size-- > 0) {
      K key = (K)stream.readObject();
      long val = stream.readLong();
      put(key, val);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'K'
in `core/src/main/java/gnu/trove/TObjectLongHashMap.java`
#### Snippet
```java
      isNewMapping = false;
    }
    K oldKey = (K)_set[index];
    _set[index] = key;
    _values[index] = value;
```

### UNCHECKED_WARNING
Unchecked assignment: 'gnu.trove.SerializationProcedure' to 'gnu.trove.TObjectLongProcedure'
in `core/src/main/java/gnu/trove/TObjectLongHashMap.java`
#### Snippet
```java

    SerializationProcedure writeProcedure = new SerializationProcedure(stream);
    if (!forEachEntry(writeProcedure)) {
      throw writeProcedure.exception;
    }
```

### UNCHECKED_WARNING
Unchecked assignment: 'gnu.trove.TObjectLongHashMap' to 'gnu.trove.TObjectLongHashMap'
in `core/src/main/java/gnu/trove/TObjectLongHashMap.java`
#### Snippet
```java
      return false;
    }
    return forEachEntry(new EqProcedure<K>(that));
  }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object\[\]' to 'K\[\]'
in `core/src/main/java/gnu/trove/TObjectLongHashMap.java`
#### Snippet
```java
  public boolean retainEntries(TObjectLongProcedure<K> procedure) {
    boolean modified = false;
    K[] keys = (K[])_set;
    long[] values = _values;
    stopCompactingOnRemove();
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object\[\]' to 'K\[\]'
in `core/src/main/java/gnu/trove/TObjectLongHashMap.java`
#### Snippet
```java
   */
  public boolean forEachEntry(TObjectLongProcedure<K> procedure) {
    K[] keys = (K[])_set;
    long[] values = _values;
    for (int i = keys.length; i-- > 0; ) {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object\[\]' to 'V\[\]'
in `core/src/main/java/gnu/trove/TIntObjectHashMap.java`
#### Snippet
```java
  protected int setUp(int initialCapacity) {
    int capacity = super.setUp(initialCapacity);
    _values = (V[])(initialCapacity == JUST_CREATED_CAPACITY ? EMPTY_OBJECT_ARRAY : new Object[capacity]);
    _set = initialCapacity == JUST_CREATED_CAPACITY ? null : new int[capacity];

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'V'
in `core/src/main/java/gnu/trove/TIntObjectHashMap.java`
#### Snippet
```java
    while (size-- > 0) {
      int key = stream.readInt();
      V val = (V)stream.readObject();
      put(key, val);
    }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'gnu.trove.TIntObjectHashMap'
in `core/src/main/java/gnu/trove/TIntObjectHashMap.java`
#### Snippet
```java
  @Override
  public TIntObjectHashMap<V> clone() {
    TIntObjectHashMap<V> m = (TIntObjectHashMap<V>)super.clone();
    m._values = _values == EMPTY_OBJECT_ARRAY ? (V[])EMPTY_OBJECT_ARRAY : _values.clone();
    m._set = _values == EMPTY_OBJECT_ARRAY ? null : _set.clone();
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object\[\]' to 'V\[\]'
in `core/src/main/java/gnu/trove/TIntObjectHashMap.java`
#### Snippet
```java
  public TIntObjectHashMap<V> clone() {
    TIntObjectHashMap<V> m = (TIntObjectHashMap<V>)super.clone();
    m._values = _values == EMPTY_OBJECT_ARRAY ? (V[])EMPTY_OBJECT_ARRAY : _values.clone();
    m._set = _values == EMPTY_OBJECT_ARRAY ? null : _set.clone();
    return m;
```

### UNCHECKED_WARNING
Unchecked cast: 'gnu.trove.TObjectHash.NULL' to 'V'
in `core/src/main/java/gnu/trove/TIntObjectHashMap.java`
#### Snippet
```java

  private static <V> V wrapNull(V value) {
    return value == null ? (V)TObjectHash.NULL : value;
  }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'V'
in `core/src/main/java/gnu/trove/TIntObjectHashMap.java`
#### Snippet
```java
  @Override
  protected void removeAt(int index) {
    _values[index] = (V)TObjectHash.REMOVED;
    super.removeAt(index);  // clear key, set; adjust size
  }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object\[\]' to 'V\[\]'
in `core/src/main/java/gnu/trove/TIntObjectHashMap.java`
#### Snippet
```java

    _set = new int[newCapacity];
    _values = (V[])new Object[newCapacity];

    for (int i = oldCapacity; i-- > 0; ) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'gnu.trove.TIntObjectHashMap' to 'gnu.trove.TIntObjectHashMap'
in `core/src/main/java/gnu/trove/TIntObjectHashMap.java`
#### Snippet
```java
      return false;
    }
    return forEachEntry(new EqProcedure<V>(that));
  }

```

### UNCHECKED_WARNING
Unchecked assignment: 'gnu.trove.SerializationProcedure' to 'gnu.trove.TIntObjectProcedure'
in `core/src/main/java/gnu/trove/TIntObjectHashMap.java`
#### Snippet
```java

    SerializationProcedure writeProcedure = new SerializationProcedure(stream);
    if (!forEachEntry(writeProcedure)) {
      throw writeProcedure.exception;
    }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object\[\]' to 'V\[\]'
in `core/src/main/java/gnu/trove/TLongObjectHashMap.java`
#### Snippet
```java
  protected int setUp(int initialCapacity) {
    int capacity = super.setUp(initialCapacity);
    _values = (V[])(initialCapacity == JUST_CREATED_CAPACITY ? EMPTY_OBJECT_ARRAY : new Object[capacity]);
    _set = initialCapacity == JUST_CREATED_CAPACITY ? null : new long[capacity];

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'V'
in `core/src/main/java/gnu/trove/TLongObjectHashMap.java`
#### Snippet
```java
  @Override
  protected void removeAt(int index) {
    _values[index] = (V)TObjectHash.REMOVED;
    super.removeAt(index);  // clear key, set; adjust size
  }
```

### UNCHECKED_WARNING
Unchecked assignment: 'gnu.trove.TLongObjectHashMap' to 'gnu.trove.TLongObjectHashMap'
in `core/src/main/java/gnu/trove/TLongObjectHashMap.java`
#### Snippet
```java
      return false;
    }
    return forEachEntry(new EqProcedure<V>(that));
  }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object\[\]' to 'V\[\]'
in `core/src/main/java/gnu/trove/TLongObjectHashMap.java`
#### Snippet
```java

    _set = new long[newCapacity];
    _values = (V[])new Object[newCapacity];

    for (int i = oldCapacity; i-- > 0; ) {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'V'
in `core/src/main/java/gnu/trove/TLongObjectHashMap.java`
#### Snippet
```java
    while (size-- > 0) {
      long key = stream.readLong();
      V val = (V)stream.readObject();
      put(key, val);
    }
```

### UNCHECKED_WARNING
Unchecked cast: 'gnu.trove.TObjectHash.NULL' to 'V'
in `core/src/main/java/gnu/trove/TLongObjectHashMap.java`
#### Snippet
```java

  private static <V> V wrapNull(V value) {
    return value == null ? (V)TObjectHash.NULL : value;
  }

```

### UNCHECKED_WARNING
Unchecked assignment: 'gnu.trove.SerializationProcedure' to 'gnu.trove.TLongObjectProcedure'
in `core/src/main/java/gnu/trove/TLongObjectHashMap.java`
#### Snippet
```java

    SerializationProcedure writeProcedure = new SerializationProcedure(stream);
    if (!forEachEntry(writeProcedure)) {
      throw writeProcedure.exception;
    }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'gnu.trove.TLongObjectHashMap'
in `core/src/main/java/gnu/trove/TLongObjectHashMap.java`
#### Snippet
```java
  @Override
  public TLongObjectHashMap<V> clone() {
    TLongObjectHashMap<V> m = (TLongObjectHashMap<V>)super.clone();
    m._values = _values == EMPTY_OBJECT_ARRAY ? (V[])EMPTY_OBJECT_ARRAY : _values.clone();
    m._set = _values == EMPTY_OBJECT_ARRAY ? null : _set.clone();
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object\[\]' to 'V\[\]'
in `core/src/main/java/gnu/trove/TLongObjectHashMap.java`
#### Snippet
```java
  public TLongObjectHashMap<V> clone() {
    TLongObjectHashMap<V> m = (TLongObjectHashMap<V>)super.clone();
    m._values = _values == EMPTY_OBJECT_ARRAY ? (V[])EMPTY_OBJECT_ARRAY : _values.clone();
    m._set = _values == EMPTY_OBJECT_ARRAY ? null : _set.clone();
    return m;
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `core/src/main/java/gnu/trove/TObjectHash.java`
#### Snippet
```java
                                       + "in that method's documentation. "
                                       + "object #1 =" + o1 + (o1 == null ? "" : " (" + o1.getClass() + ")")
                                       + ", hashCode=" + _hashingStrategy.computeHashCode((T)o1)
                                       + "; object #2 =" + o2 + (o2 == null ? "" : " (" + o2.getClass() + ")")
                                       + ", hashCode=" + _hashingStrategy.computeHashCode((T)o2)
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `core/src/main/java/gnu/trove/TObjectHash.java`
#### Snippet
```java
                                       + ", hashCode=" + _hashingStrategy.computeHashCode((T)o1)
                                       + "; object #2 =" + o2 + (o2 == null ? "" : " (" + o2.getClass() + ")")
                                       + ", hashCode=" + _hashingStrategy.computeHashCode((T)o2)
    );
  }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `core/src/main/java/gnu/trove/TObjectHash.java`
#### Snippet
```java

    if (cur != null
        && (cur == REMOVED || !_hashingStrategy.equals((T)cur, obj))) {
      // see Knuth, p. 529
      int probe = 1 + hash % (length - 2);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `core/src/main/java/gnu/trove/TObjectHash.java`
#### Snippet
```java
      }
      while (cur != null
             && (cur == REMOVED || !_hashingStrategy.equals((T)cur, obj)));
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `core/src/main/java/gnu/trove/TObjectHash.java`
#### Snippet
```java
      if (set[i] != null
          && set[i] != REMOVED
          && !procedure.execute((T)set[i])) {
        return false;
      }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'gnu.trove.TObjectHash'
in `core/src/main/java/gnu/trove/TObjectHash.java`
#### Snippet
```java
  @Override
  public TObjectHash<T> clone() {
    TObjectHash<T> h = (TObjectHash<T>)super.clone();
    h._set = _set == EMPTY_OBJECT_ARRAY ? EMPTY_OBJECT_ARRAY : _set.clone();
    return h;
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `core/src/main/java/gnu/trove/TObjectHash.java`
#### Snippet
```java
      return index;       // empty, all done
    }
    if (cur != REMOVED && _hashingStrategy.equals((T)cur, obj)) {
      return -index - 1;   // already stored
    }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `core/src/main/java/gnu/trove/TObjectHash.java`
#### Snippet
```java
    while (cur != null
           && cur != REMOVED
           && !_hashingStrategy.equals((T)cur, obj));

    // if the index we found was removed: continue probing until we
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `core/src/main/java/gnu/trove/TObjectHash.java`
#### Snippet
```java
    if (cur == REMOVED) {
      while (cur != null
             && (cur == REMOVED || !_hashingStrategy.equals((T)cur, obj))) {
        index -= probe;
        if (index < 0) {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `core/src/main/java/gnu/trove/TObjectHash.java`
#### Snippet
```java
   */
  public boolean contains(Object obj) {
    return index((T)obj) >= 0;
  }

```

### UNCHECKED_WARNING
Unchecked assignment: 'gnu.trove.TObjectProcedure' to 'gnu.trove.TObjectProcedure'
in `core/src/main/java/gnu/trove/THashSet.java`
#### Snippet
```java
  public Object[] toArray() {
    final Object[] result = new Object[size()];
    forEach(new TObjectProcedure() {
      private int pos;

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'E'
in `core/src/main/java/gnu/trove/THashSet.java`
#### Snippet
```java
    for (int i = oldCapacity; i-- > 0; ) {
      if (oldSet[i] != null && oldSet[i] != REMOVED) {
        E o = (E)oldSet[i];
        int index = insertionIndex(o);
        if (index < 0) { // everyone pays for this because some people can't RTFM
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T\[\]'
in `core/src/main/java/gnu/trove/THashSet.java`
#### Snippet
```java
    int size = size();
    if (a.length < size) {
      a = (T[])Array.newInstance(a.getClass().getComponentType(), size);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'gnu.trove.SerializationProcedure' to 'gnu.trove.TObjectProcedure'
in `core/src/main/java/gnu/trove/THashSet.java`
#### Snippet
```java

    SerializationProcedure writeProcedure = new SerializationProcedure(stream);
    if (!forEach(writeProcedure)) {
      throw writeProcedure.exception;
    }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'E'
in `core/src/main/java/gnu/trove/THashSet.java`
#### Snippet
```java
    setUp(size);
    while (size-- > 0) {
      E val = (E)stream.readObject();
      add(val);
    }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'E'
in `core/src/main/java/gnu/trove/THashSet.java`
#### Snippet
```java
  @Override
  public boolean remove(Object obj) {
    int index = index((E)obj);
    if (index >= 0) {
      removeAt(index);
```

### UNCHECKED_WARNING
Unchecked assignment: 'gnu.trove.SerializationProcedure' to 'gnu.trove.TObjectIntProcedure'
in `core/src/main/java/gnu/trove/TObjectIntHashMap.java`
#### Snippet
```java

    SerializationProcedure writeProcedure = new SerializationProcedure(stream);
    if (!forEachEntry(writeProcedure)) {
      throw writeProcedure.exception;
    }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object\[\]' to 'K\[\]'
in `core/src/main/java/gnu/trove/TObjectIntHashMap.java`
#### Snippet
```java
  protected void rehash(int newCapacity) {
    int oldCapacity = capacity();
    K[] oldKeys = (K[])_set;
    int[] oldVals = _values;

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object\[\]' to 'K\[\]'
in `core/src/main/java/gnu/trove/TObjectIntHashMap.java`
#### Snippet
```java
  public Object[] keys() {
    Object[] keys = new Object[size()];
    K[] k = (K[])_set;
    for (int i = k.length, j = 0; i-- > 0; ) {
      if (k[i] != null && k[i] != REMOVED) {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'K'
in `core/src/main/java/gnu/trove/TObjectIntHashMap.java`
#### Snippet
```java
    setUp(size);
    while (size-- > 0) {
      K key = (K)stream.readObject();
      int val = stream.readInt();
      put(key, val);
```

### UNCHECKED_WARNING
Unchecked assignment: 'gnu.trove.TObjectIntHashMap' to 'gnu.trove.TObjectIntHashMap'
in `core/src/main/java/gnu/trove/TObjectIntHashMap.java`
#### Snippet
```java
      return false;
    }
    return forEachEntry(new EqProcedure<K>(that));
  }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'K'
in `core/src/main/java/gnu/trove/TObjectIntHashMap.java`
#### Snippet
```java
      isNewMapping = false;
    }
    K oldKey = (K)_set[index];
    _set[index] = key;
    _values[index] = value;
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object\[\]' to 'K\[\]'
in `core/src/main/java/gnu/trove/TObjectIntHashMap.java`
#### Snippet
```java
  public boolean retainEntries(TObjectIntProcedure<K> procedure) {
    boolean modified = false;
    K[] keys = (K[])_set;
    int[] values = _values;
    stopCompactingOnRemove();
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object\[\]' to 'K\[\]'
in `core/src/main/java/gnu/trove/TObjectIntHashMap.java`
#### Snippet
```java
   */
  public boolean forEachEntry(TObjectIntProcedure<K> procedure) {
    K[] keys = (K[])_set;
    int[] values = _values;
    for (int i = keys.length; i-- > 0; ) {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'K'
in `core/src/main/java/gnu/trove/THashMap.java`
#### Snippet
```java
  @Override
  public V get(Object key) {
    int index = index((K)key);
    return index < 0 ? null : _values[index];
  }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object\[\]' to 'V\[\]'
in `core/src/main/java/gnu/trove/THashMap.java`
#### Snippet
```java
  protected int setUp(int initialCapacity) {
    int capacity = super.setUp(initialCapacity);
    _values = (V[])(initialCapacity == JUST_CREATED_CAPACITY ? EMPTY_OBJECT_ARRAY : new Object[capacity]);
    return capacity;
  }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'E'
in `core/src/main/java/gnu/trove/THashMap.java`
#### Snippet
```java
    @Override
    public boolean remove(Object o) {
      return removeElement((E)o);
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'K'
in `core/src/main/java/gnu/trove/THashMap.java`
#### Snippet
```java
        if (keys[i] != null
            && keys[i] != REMOVED
            && !procedure.execute((K)keys[i], values[i])) {
          removeAt(i);
          modified = true;
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'K'
in `core/src/main/java/gnu/trove/THashMap.java`
#### Snippet
```java
  public V remove(Object key) {
    V prev = null;
    int index = index((K)key);
    if (index >= 0) {
      prev = _values[index];
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object\[\]' to 'V\[\]'
in `core/src/main/java/gnu/trove/THashMap.java`
#### Snippet
```java

    _set = new Object[newCapacity];
    _values = (V[])new Object[newCapacity];

    for (int i = oldCapacity; i-- > 0; ) {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'K'
in `core/src/main/java/gnu/trove/THashMap.java`
#### Snippet
```java
      if (oldKeys[i] != null && oldKeys[i] != REMOVED) {
        Object o = oldKeys[i];
        int index = insertionIndex((K)o);
        if (index < 0) {
          throwObjectContractViolation(_set[-index - 1], o);
```

### UNCHECKED_WARNING
Unchecked assignment: 'gnu.trove.SerializationProcedure' to 'gnu.trove.TObjectObjectProcedure'
in `core/src/main/java/gnu/trove/THashMap.java`
#### Snippet
```java

    SerializationProcedure writeProcedure = new SerializationProcedure(stream);
    if (!forEachEntry(writeProcedure)) {
      throw writeProcedure.exception;
    }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T\[\]'
in `core/src/main/java/gnu/trove/THashMap.java`
#### Snippet
```java
      int size = size();
      if (a.length < size) {
        a = (T[])Array.newInstance(a.getClass().getComponentType(), size);
      }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'K'
in `core/src/main/java/gnu/trove/THashMap.java`
#### Snippet
```java
      @Override
      public Entry objectAtIndex(final int index) {
        return new Entry((K)_set[index], _values[index], index);
      }
    }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'E'
in `core/src/main/java/gnu/trove/THashMap.java`
#### Snippet
```java
    @Override
    public boolean contains(Object key) {
      return containsElement((E)key);
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `core/src/main/java/gnu/trove/THashMap.java`
#### Snippet
```java
      return false;
    }
    Map<K, V> that = (Map<K, V>)other;
    if (that.size() != size()) {
      return false;
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'K'
in `core/src/main/java/gnu/trove/THashMap.java`
#### Snippet
```java
      if (keys[i] != null
          && keys[i] != REMOVED
          && !procedure.execute((K)keys[i], values[i])) {
        return false;
      }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'K'
in `core/src/main/java/gnu/trove/THashMap.java`
#### Snippet
```java
    setUp(size);
    while (size-- > 0) {
      K key = (K)stream.readObject();
      V val = (V)stream.readObject();
      put(key, val);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'V'
in `core/src/main/java/gnu/trove/THashMap.java`
#### Snippet
```java
    while (size-- > 0) {
      K key = (K)stream.readObject();
      V val = (V)stream.readObject();
      put(key, val);
    }
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `it.unimi.dsi.fastutil.ints.IntArrayList`
in `core/src/main/java/gnu/trove/TIntStack.java`
#### Snippet
```java

/**
 * @deprecated Use {@link it.unimi.dsi.fastutil.ints.IntArrayList}
 */
@Deprecated
```

## RuleId[id=Deprecation]
### Deprecation
'gnu.trove.TPrimitiveHash' is deprecated
in `core/src/main/java/gnu/trove/TIntHash.java`
#### Snippet
```java
 */

public abstract class TIntHash extends TPrimitiveHash
  implements TIntHashingStrategy {

```

### Deprecation
'gnu.trove.TPrimitiveHash' is deprecated
in `core/src/main/java/gnu/trove/TLongHash.java`
#### Snippet
```java
 */

public abstract class TLongHash extends TPrimitiveHash
  implements TLongHashingStrategy {

```

### Deprecation
'gnu.trove.TPrimitiveHash' is deprecated
in `core/src/main/java/gnu/trove/TPrimitiveIterator.java`
#### Snippet
```java
   * Creates a TPrimitiveIterator for the specified collection.
   */
  TPrimitiveIterator(TPrimitiveHash hash) {
    super(hash);
    _hash = hash;
```

### Deprecation
'gnu.trove.TPrimitiveHash' is deprecated
in `core/src/main/java/gnu/trove/TPrimitiveIterator.java`
#### Snippet
```java
    byte[] states = _hash._states;
    int i = _index;
    while (i-- > 0 && (states[i] != TPrimitiveHash.FULL)) ;
    return i;
  }
```

### Deprecation
'gnu.trove.TPrimitiveHash' is deprecated
in `core/src/main/java/gnu/trove/TPrimitiveIterator.java`
#### Snippet
```java
   * the collection on which this iterator operates.
   */
  protected final TPrimitiveHash _hash;

  /**
```

### Deprecation
'gnu.trove.TIntObjectHashMap' is deprecated
in `core/src/main/java/gnu/trove/TIntObjectIterator.java`
#### Snippet
```java
    Object[] values = _map._values;
    int i = _index;
    while (i-- > 0 && !TIntObjectHashMap.isFull(values, i)) ;
    return i;
  }
```

### Deprecation
'gnu.trove.TIntObjectHashMap' is deprecated
in `core/src/main/java/gnu/trove/TIntObjectIterator.java`
#### Snippet
```java
   * Creates an iterator over the specified map
   */
  public TIntObjectIterator(TIntObjectHashMap<V> map) {
    super(map);
    _map = map;
```

### Deprecation
'gnu.trove.TIntObjectHashMap' is deprecated
in `core/src/main/java/gnu/trove/TIntObjectIterator.java`
#### Snippet
```java
   * the collection being iterated over
   */
  private final TIntObjectHashMap<V> _map;

  /**
```

### Deprecation
'gnu.trove.TObjectLongHashMap' is deprecated
in `core/src/main/java/gnu/trove/TObjectLongIterator.java`
#### Snippet
```java
  private final TObjectLongHashMap<K> _map;

  public TObjectLongIterator(TObjectLongHashMap<K> map) {
    super(map);
    _map = map;
```

### Deprecation
'gnu.trove.TObjectLongHashMap' is deprecated
in `core/src/main/java/gnu/trove/TObjectLongIterator.java`
#### Snippet
```java

public final class TObjectLongIterator<K> extends TIterator {
  private final TObjectLongHashMap<K> _map;

  public TObjectLongIterator(TObjectLongHashMap<K> map) {
```

### Deprecation
'gnu.trove.TObjectIntHashMap' is deprecated
in `core/src/main/java/gnu/trove/TObjectIntIterator.java`
#### Snippet
```java

public final class TObjectIntIterator<K> extends TIterator {
  private final TObjectIntHashMap<K> _map;

  public TObjectIntIterator(TObjectIntHashMap<K> map) {
```

### Deprecation
'gnu.trove.TObjectIntHashMap' is deprecated
in `core/src/main/java/gnu/trove/TObjectIntIterator.java`
#### Snippet
```java
  private final TObjectIntHashMap<K> _map;

  public TObjectIntIterator(TObjectIntHashMap<K> map) {
    super(map);
    _map = map;
```

## RuleId[id=EmptyStatementBody]
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
`if` statement has empty body
in `core/src/main/java/gnu/trove/TIntArrayList.java`
#### Snippet
```java
      System.arraycopy(_data, length, _data, 0, _pos - length);
    }
    else if (_pos - length == offset) {
      // no copy to make, decrementing pos "deletes" values at
      // the end
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
`if` statement has empty body
in `core/src/main/java/gnu/trove/TByteArrayList.java`
#### Snippet
```java
      System.arraycopy(_data, length, _data, 0, _pos - length);
    }
    else if (_pos - length == offset) {
      // no copy to make, decrementing pos "deletes" values at
      // the end
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
`if` statement has empty body
in `core/src/main/java/gnu/trove/TLongArrayList.java`
#### Snippet
```java
      System.arraycopy(_data, length, _data, 0, _pos - length);
    }
    else if (_pos - length == offset) {
      // no copy to make, decrementing pos "deletes" values at
      // the end
```

## RuleId[id=DeprecatedIsStillUsed]
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

## RuleId[id=CommentedOutCode]
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

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `_list` may be 'final'
in `core/src/main/java/gnu/trove/TIntStack.java`
#### Snippet
```java
   * the list used to hold the stack values.
   */
  private TIntArrayList _list;

  public static final int DEFAULT_CAPACITY = TIntArrayList.DEFAULT_CAPACITY;
```

## RuleId[id=ConstantValue]
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

