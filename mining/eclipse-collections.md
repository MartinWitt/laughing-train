# eclipse-collections 
 
# Bad smells
I found 1410 bad smells with 1 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| BoundedWildcard | 370 | false |
| ReturnNull | 238 | false |
| AssignmentToMethodParameter | 150 | false |
| OptionalGetWithoutIsPresent | 55 | false |
| RedundantSuppression | 52 | false |
| ConstantValue | 51 | false |
| CastConflictsWithInstanceof | 45 | false |
| RefusedBequest | 39 | false |
| DataFlowIssue | 31 | false |
| EmptyMethod | 29 | false |
| EqualsWhichDoesntCheckParameterClass | 29 | false |
| NonShortCircuitBoolean | 28 | false |
| UnnecessaryUnboxing | 27 | false |
| SimplifyStreamApiCallChains | 26 | false |
| TypeParameterHidesVisibleType | 22 | false |
| DeprecatedIsStillUsed | 21 | false |
| NestedAssignment | 18 | false |
| ShiftOutOfRange | 12 | false |
| NonSerializableFieldInSerializableClass | 11 | false |
| MismatchedJavadocCode | 11 | false |
| UnnecessaryBoxing | 11 | false |
| CastCanBeRemovedNarrowingVariableType | 10 | false |
| SynchronizationOnLocalVariableOrMethodParameter | 9 | false |
| SuspiciousSystemArraycopy | 8 | false |
| SynchronizeOnThis | 8 | false |
| RedundantComparatorComparing | 8 | false |
| WhileCanBeForeach | 7 | false |
| ManualArrayToCollectionCopy | 7 | false |
| RedundantFieldInitialization | 6 | false |
| ClassNameSameAsAncestorName | 5 | false |
| AssignmentToForLoopParameter | 5 | false |
| IntegerMultiplicationImplicitCastToLong | 4 | false |
| UnusedAssignment | 4 | false |
| Convert2MethodRef | 4 | false |
| ComparatorCombinators | 4 | false |
| UnnecessaryFullyQualifiedName | 4 | false |
| SimplifiableBooleanExpression | 3 | false |
| DynamicRegexReplaceableByCompiledPattern | 3 | false |
| EqualsWithItself | 2 | false |
| AbstractClassNeverImplemented | 2 | false |
| AssertBetweenInconvertibleTypes | 2 | false |
| RedundantStreamOptionalCall | 2 | false |
| ThrowFromFinallyBlock | 2 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 2 | false |
| PointlessBitwiseExpression | 2 | false |
| ArrayEquality | 2 | false |
| IOResource | 2 | false |
| ParameterCanBeLocal | 2 | false |
| AbstractMethodCallInConstructor | 2 | false |
| StringEqualsEmptyString | 2 | false |
| ToArrayCallWithZeroLengthArrayArgument | 1 | true |
| MisspelledEquals | 1 | false |
| FunctionalExpressionCanBeFolded | 1 | false |
| MismatchedCollectionQueryUpdate | 1 | false |
| RedundantExplicitClose | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| ZeroLengthArrayInitialization | 1 | false |
| NullArgumentToVariableArgMethod | 1 | false |
| RedundantCollectionOperation | 1 | false |
| SystemOutErr | 1 | false |
| TestCaseWithNoTestMethods | 1 | false |
## RuleId[id=ToArrayCallWithZeroLengthArrayArgument]
### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new Map.Entry\[map.entrySet().size()\]'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/immutable/ImmutableMapFactoryImpl.java`
#### Snippet
```java
        }

        Map.Entry<K, V>[] entries = map.entrySet().toArray(new Map.Entry[map.entrySet().size()]);
        switch (entries.length)
        {
```

## RuleId[id=EqualsWithItself]
### EqualsWithItself
`equals()` called on itself
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/ListEqualTest.java`
#### Snippet
```java
    public void ec()
    {
        if (!this.integersEC1.equals(this.integersEC1))
        {
            throw new AssertionError();
```

### EqualsWithItself
`equals()` called on itself
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/ListEqualTest.java`
#### Snippet
```java
    public void jdk()
    {
        if (!this.integersJDK1.equals(this.integersJDK1))
        {
            throw new AssertionError();
```

## RuleId[id=SuspiciousSystemArraycopy]
### SuspiciousSystemArraycopy
Source parameter type 'T\[\]' is not assignable to destination parameter `array1` of type 'E\[\]'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/bag/sorted/immutable/ImmutableSortedBagImpl.java`
#### Snippet
```java
        }
        T[] items = (T[]) this.toArray();
        System.arraycopy(items, 0, array1, 0, this.size);
        if (array1.length > this.size)
        {
```

### SuspiciousSystemArraycopy
Source parameter type 'K\[\]' is not assignable to destination parameter `result` of type 'T\[\]'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/sorted/immutable/ImmutableTreeMap.java`
#### Snippet
```java
                    : a;

            System.arraycopy(ImmutableTreeMap.this.keys, 0, result, 0, ImmutableTreeMap.this.keys.length);

            if (result.length > this.size())
```

### SuspiciousSystemArraycopy
Source parameter type 'T\[\]' is not assignable to destination parameter `result` of type 'E\[\]'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/fixed/AbstractArrayAdapter.java`
#### Snippet
```java
                : array;

        System.arraycopy(this.items, 0, result, 0, size);
        if (result.length > size)
        {
```

### SuspiciousSystemArraycopy
`this.items` is not of an array type
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/mutable/primitive/BooleanArrayList.java`
#### Snippet
```java
            target = new boolean[this.size];
        }
        System.arraycopy(this.items, 0, target, 0, this.size);
        return target;
    }
```

### SuspiciousSystemArraycopy
Source parameter type 'T\[\]' is not assignable to destination parameter `a` of type 'E\[\]'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/immutable/ImmutableArrayList.java`
#### Snippet
```java
            a = (E[]) Array.newInstance(a.getClass().getComponentType(), size);
        }
        System.arraycopy(this.items, 0, a, 0, size);
        if (a.length > size)
        {
```

### SuspiciousSystemArraycopy
Source parameter type 'java.lang.Object\[\]' is not assignable to destination parameter `this.items` of type 'T\[\]'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/mutable/FastList.java`
#### Snippet
```java
        this.shiftElementsAtIndex(index, sourceSize);
        this.size = newSize;
        System.arraycopy(newItems, 0, this.items, index, sourceSize);
    }

```

### SuspiciousSystemArraycopy
Source parameter type 'T\[\]' is not assignable to destination parameter `array` of type 'E\[\]'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/mutable/FastList.java`
#### Snippet
```java
            array = (E[]) Array.newInstance(array.getClass().getComponentType(), this.size);
        }
        System.arraycopy(this.items, 0, array, 0, this.size);
        if (array.length > this.size)
        {
```

### SuspiciousSystemArraycopy
Source parameter type 'T\[\]' is not assignable to destination parameter `array` of type 'E\[\]'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/mutable/FastList.java`
#### Snippet
```java
    public <E> E[] toArray(E[] array, int sourceFromIndex, int sourceToIndex, int destinationIndex)
    {
        System.arraycopy(this.items, sourceFromIndex, array, destinationIndex, sourceToIndex - sourceFromIndex + 1);
        return array;
    }
```

## RuleId[id=WhileCanBeForeach]
### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/UnifiedMap.java`
#### Snippet
```java
        {
            Iterator<? extends Entry<? extends K, ? extends V>> iterator = this.getEntrySetFrom(map).iterator();
            while (iterator.hasNext())
            {
                Entry<? extends K, ? extends V> entry = iterator.next();
```

### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMap.java`
#### Snippet
```java

        Iterator<Map.Entry<K, V>> i = this.entrySet().iterator();
        while (i.hasNext())
        {
            Map.Entry<K, V> e = i.next();
```

### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMapUnsafe.java`
#### Snippet
```java

        Iterator<Map.Entry<K, V>> i = this.entrySet().iterator();
        while (i.hasNext())
        {
            Map.Entry<K, V> e = i.next();
```

### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/strategy/mutable/UnifiedMapWithHashingStrategy.java`
#### Snippet
```java
        {
            Iterator<? extends Entry<? extends K, ? extends V>> iterator = this.getEntrySetFrom(map).iterator();
            while (iterator.hasNext())
            {
                Entry<? extends K, ? extends V> entry = iterator.next();
```

### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/bimap/mutable/AbstractMutableBiMap.java`
#### Snippet
```java
            int oldSize = AbstractMutableBiMap.this.size();
            Iterator<K> iterator = this.iterator();
            while (iterator.hasNext())
            {
                K next = iterator.next();
```

### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/bimap/mutable/AbstractMutableBiMap.java`
#### Snippet
```java
            int oldSize = AbstractMutableBiMap.this.size();
            Iterator<V> iterator = this.iterator();
            while (iterator.hasNext())
            {
                V next = iterator.next();
```

### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/internal/IterableIterate.java`
#### Snippet
```java
        T last = null;
        Iterator<T> iterator = iterable.iterator();
        while (iterator.hasNext())
        {
            last = iterator.next();
```

## RuleId[id=RefusedBequest]
### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/bag/sorted/mutable/UnmodifiableSortedBag.java`
#### Snippet
```java

    @Override
    public UnmodifiableSortedBag<T> clone()
    {
        return this;
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/bag/sorted/mutable/SynchronizedSortedBag.java`
#### Snippet
```java

    @Override
    public MutableSortedBag<T> clone()
    {
        synchronized (this.getLock())
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/sorted/mutable/SynchronizedSortedMap.java`
#### Snippet
```java

    @Override
    public MutableSortedMap<K, V> clone()
    {
        synchronized (this.lock)
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/SynchronizedMutableMap.java`
#### Snippet
```java

    @Override
    public MutableMap<K, V> clone()
    {
        synchronized (this.lock)
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/UnmodifiableMutableMap.java`
#### Snippet
```java

    @Override
    public MutableMap<K, V> clone()
    {
        return this;
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/sorted/mutable/UnmodifiableTreeMap.java`
#### Snippet
```java

    @Override
    public MutableSortedMap<K, V> clone()
    {
        return this;
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/fixed/SingletonSet.java`
#### Snippet
```java
    // Weird implementation of clone() is ok on final classes
    @Override
    public SingletonSet<T> clone()
    {
        return new SingletonSet<>(this.element1);
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/fixed/QuadrupletonSet.java`
#### Snippet
```java
    // Weird implementation of clone() is ok on final classes
    @Override
    public QuadrupletonSet<T> clone()
    {
        return new QuadrupletonSet<>(this.element1, this.element2, this.element3, this.element4);
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/fixed/DoubletonSet.java`
#### Snippet
```java
    // Weird implementation of clone() is ok on final classes
    @Override
    public DoubletonSet<T> clone()
    {
        return new DoubletonSet<>(this.element1, this.element2);
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/fixed/TripletonSet.java`
#### Snippet
```java
    // Weird implementation of clone() is ok on final classes
    @Override
    public TripletonSet<T> clone()
    {
        return new TripletonSet<>(this.element1, this.element2, this.element3);
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/fixed/EmptySet.java`
#### Snippet
```java

    @Override
    public EmptySet<T> clone()
    {
        return this;
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/sorted/mutable/SynchronizedSortedSet.java`
#### Snippet
```java

    @Override
    public MutableSortedSet<T> clone()
    {
        synchronized (this.getLock())
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/sorted/mutable/UnmodifiableSortedSet.java`
#### Snippet
```java

    @Override
    public UnmodifiableSortedSet<T> clone()
    {
        return this;
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/sorted/mutable/SortedSetAdapter.java`
#### Snippet
```java

    @Override
    public MutableSortedSet<T> clone()
    {
        return SortedSets.mutable.withAll(this.delegate);
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/SynchronizedMutableSet.java`
#### Snippet
```java

    @Override
    public MutableSet<T> clone()
    {
        synchronized (this.getLock())
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/SetAdapter.java`
#### Snippet
```java

    @Override
    public MutableSet<T> clone()
    {
        return Sets.mutable.withAll(this.delegate);
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/UnmodifiableMutableSet.java`
#### Snippet
```java

    @Override
    public UnmodifiableMutableSet<T> clone()
    {
        return this;
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/MultiReaderUnifiedSet.java`
#### Snippet
```java

        @Override
        public MutableSet<T> clone()
        {
            return this.getDelegate().clone();
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/MultiReaderUnifiedSet.java`
#### Snippet
```java

    @Override
    public MultiReaderSet<T> clone()
    {
        try (LockWrapper wrapper = this.lockWrapper.acquireReadLock())
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/fixed/EmptyList.java`
#### Snippet
```java

    @Override
    public EmptyList<T> clone()
    {
        return this;
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/fixed/TripletonList.java`
#### Snippet
```java

    @Override
    public TripletonList<T> clone()
    {
        return new TripletonList<>(this.element1, this.element2, this.element3);
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/fixed/SingletonList.java`
#### Snippet
```java

    @Override
    public SingletonList<T> clone()
    {
        return new SingletonList<>(this.element1);
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/fixed/QuintupletonList.java`
#### Snippet
```java

    @Override
    public QuintupletonList<T> clone()
    {
        return new QuintupletonList<>(this.element1, this.element2, this.element3, this.element4, this.element5);
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/fixed/QuadrupletonList.java`
#### Snippet
```java

    @Override
    public QuadrupletonList<T> clone()
    {
        return new QuadrupletonList<>(this.element1, this.element2, this.element3, this.element4);
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/fixed/ArrayAdapter.java`
#### Snippet
```java

    @Override
    public ArrayAdapter<T> clone()
    {
        return new ArrayAdapter<>(this.items.clone());
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/fixed/DoubletonList.java`
#### Snippet
```java

    @Override
    public DoubletonList<T> clone()
    {
        return new DoubletonList<>(this.element1, this.element2);
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/fixed/SextupletonList.java`
#### Snippet
```java

    @Override
    public SextupletonList<T> clone()
    {
        return new SextupletonList<>(
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/mutable/ArrayListAdapter.java`
#### Snippet
```java

    @Override
    public ArrayListAdapter<T> clone()
    {
        return new ArrayListAdapter<>((ArrayList<T>) this.delegate.clone());
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/mutable/UnmodifiableMutableList.java`
#### Snippet
```java

    @Override
    public UnmodifiableMutableList<T> clone()
    {
        return this;
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/mutable/UnmodifiableMutableList.java`
#### Snippet
```java

        @Override
        public RandomAccessUnmodifiableMutableList<T> clone()
        {
            return this;
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/mutable/ListAdapter.java`
#### Snippet
```java

    @Override
    public MutableList<T> clone()
    {
        return Lists.mutable.withAll(this.delegate);
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/mutable/RandomAccessListAdapter.java`
#### Snippet
```java

    @Override
    public MutableList<T> clone()
    {
        return Lists.mutable.withAll(this.delegate);
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/mutable/SynchronizedMutableList.java`
#### Snippet
```java

    @Override
    public MutableList<T> clone()
    {
        synchronized (this.getLock())
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/mutable/AbstractMutableList.java`
#### Snippet
```java

        @Override
        public MutableList<T> clone()
        {
            return new FastList<>(this);
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/mutable/MultiReaderFastList.java`
#### Snippet
```java

    @Override
    public MultiReaderList<T> clone()
    {
        try (LockWrapper wrapper = this.lockWrapper.acquireReadLock())
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/mutable/MultiReaderFastList.java`
#### Snippet
```java

        @Override
        public MutableList<T> clone()
        {
            return this.getDelegate().clone();
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/bimap/mutable/SynchronizedBiMap.java`
#### Snippet
```java

    @Override
    public MutableBiMap<K, V> clone()
    {
        synchronized (this.lock)
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/bimap/mutable/UnmodifiableBiMap.java`
#### Snippet
```java

    @Override
    public MutableBiMap<K, V> clone()
    {
        return this;
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/bimap/mutable/AbstractMutableBiMap.java`
#### Snippet
```java

    @Override
    public MutableBiMap<K, V> clone()
    {
        return new HashBiMap<>(this);
```

## RuleId[id=MisspelledEquals]
### MisspelledEquals
`equal()` method should probably be 'equals()'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/Predicates.java`
#### Snippet
```java
     * Tests for equality.
     */
    public static Predicates<Object> equal(Object object)
    {
        if (object == null)
```

## RuleId[id=NonShortCircuitBoolean]
### NonShortCircuitBoolean
Non-short-circuit boolean expression `changed |= this.remove(each)`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/AbstractUnifiedSet.java`
#### Snippet
```java
        for (Object each : iterable)
        {
            changed |= this.remove(each);
        }
        return changed;
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `removed |= itr.removeByKeyValue()`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMap.java`
#### Snippet
```java
                if (filter.test(itr.next()))
                {
                    removed |= itr.removeByKeyValue();
                }
            }
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `removed |= itr.removeByKeyValue()`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMap.java`
#### Snippet
```java
                if (col.contains(itr.next()))
                {
                    removed |= itr.removeByKeyValue();
                }
            }
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `removed |= itr.removeByKeyValue()`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMap.java`
#### Snippet
```java
                if (filter.test(itr.next()))
                {
                    removed |= itr.removeByKeyValue();
                }
            }
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `removed |= this.remove(o)`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMap.java`
#### Snippet
```java
                for (Object o : col)
                {
                    removed |= this.remove(o);
                }
            }
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `removed |= itr.removeByKeyValue()`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMap.java`
#### Snippet
```java
                    if (col.contains(itr.next()))
                    {
                        removed |= itr.removeByKeyValue();
                    }
                }
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `removed |= itr.removeByKeyValue()`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMapUnsafe.java`
#### Snippet
```java
                if (col.contains(itr.next()))
                {
                    removed |= itr.removeByKeyValue();
                }
            }
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `removed |= itr.removeByKeyValue()`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMapUnsafe.java`
#### Snippet
```java
                if (filter.test(itr.next()))
                {
                    removed |= itr.removeByKeyValue();
                }
            }
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `removed |= this.remove(o)`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMapUnsafe.java`
#### Snippet
```java
                for (Object o : col)
                {
                    removed |= this.remove(o);
                }
            }
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `removed |= itr.removeByKeyValue()`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMapUnsafe.java`
#### Snippet
```java
                    if (col.contains(itr.next()))
                    {
                        removed |= itr.removeByKeyValue();
                    }
                }
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `removed |= itr.removeByKeyValue()`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMapUnsafe.java`
#### Snippet
```java
                if (filter.test(itr.next()))
                {
                    removed |= itr.removeByKeyValue();
                }
            }
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `changed |= this.copyChain((ChainedBucket) cur)`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/UnifiedSet.java`
#### Snippet
```java
            if (cur instanceof ChainedBucket)
            {
                changed |= this.copyChain((ChainedBucket) cur);
            }
            else if (cur != null)
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `changed |= this.add(this.nonSentinel(cur))`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/UnifiedSet.java`
#### Snippet
```java
            else if (cur != null)
            {
                changed |= this.add(this.nonSentinel(cur));
            }
        }
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `changed |= this.add(this.nonSentinel(bucket.zero))`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/UnifiedSet.java`
#### Snippet
```java
        do
        {
            changed |= this.add(this.nonSentinel(bucket.zero));
            if (bucket.one == null)
            {
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `changed |= this.add(this.nonSentinel(bucket.one))`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/UnifiedSet.java`
#### Snippet
```java
                return changed;
            }
            changed |= this.add(this.nonSentinel(bucket.one));
            if (bucket.two == null)
            {
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `changed |= this.add(this.nonSentinel(bucket.two))`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/UnifiedSet.java`
#### Snippet
```java
                return changed;
            }
            changed |= this.add(this.nonSentinel(bucket.two));
            if (bucket.three == null)
            {
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `changed |= this.add(this.nonSentinel(bucket.three))`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/UnifiedSet.java`
#### Snippet
```java
                continue;
            }
            changed |= this.add(this.nonSentinel(bucket.three));
            return changed;
        }
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `changed |= this.copyChain((ChainedBucket) cur)`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/strategy/mutable/UnifiedSetWithHashingStrategy.java`
#### Snippet
```java
            if (cur instanceof ChainedBucket)
            {
                changed |= this.copyChain((ChainedBucket) cur);
            }
            else if (cur != null)
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `changed |= this.add(this.nonSentinel(cur))`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/strategy/mutable/UnifiedSetWithHashingStrategy.java`
#### Snippet
```java
            else if (cur != null)
            {
                changed |= this.add(this.nonSentinel(cur));
            }
        }
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `changed |= this.add(this.nonSentinel(bucket.zero))`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/strategy/mutable/UnifiedSetWithHashingStrategy.java`
#### Snippet
```java
        do
        {
            changed |= this.add(this.nonSentinel(bucket.zero));
            if (bucket.one == null)
            {
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `changed |= this.add(this.nonSentinel(bucket.one))`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/strategy/mutable/UnifiedSetWithHashingStrategy.java`
#### Snippet
```java
                return changed;
            }
            changed |= this.add(this.nonSentinel(bucket.one));
            if (bucket.two == null)
            {
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `changed |= this.add(this.nonSentinel(bucket.two))`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/strategy/mutable/UnifiedSetWithHashingStrategy.java`
#### Snippet
```java
                return changed;
            }
            changed |= this.add(this.nonSentinel(bucket.two));
            if (bucket.three == null)
            {
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `changed |= this.add(this.nonSentinel(bucket.three))`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/strategy/mutable/UnifiedSetWithHashingStrategy.java`
#### Snippet
```java
                continue;
            }
            changed |= this.add(this.nonSentinel(bucket.three));
            return changed;
        }
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `this.changed |= AbstractMutableMultimap.this.putAll(each.getOne(), each.getTwo())`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/multimap/AbstractMutableMultimap.java`
#### Snippet
```java
            public void value(Pair<KK, RichIterable<VV>> each)
            {
                this.changed |= AbstractMutableMultimap.this.putAll(each.getOne(), each.getTwo());
            }
        }
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `this.changed |= AbstractMutableMultimap.this.putAll(key, value)`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/multimap/AbstractMutableMultimap.java`
#### Snippet
```java
            public void value(KK key, MutableCollection<VV> value)
            {
                this.changed |= AbstractMutableMultimap.this.putAll(key, value);
            }
        }
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `result |= this.add(each)`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/collection/mutable/AbstractCollectionAdapter.java`
#### Snippet
```java
        for (T each : collection)
        {
            result |= this.add(each);
        }
        return result;
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `changed |= this.put(pair.getOne(), pair.getTwo())`
in `eclipse-collections-api/src/main/java/org/eclipse/collections/api/multimap/MutableMultimap.java`
#### Snippet
```java
        for (Pair<? extends K, ? extends V> pair : pairs)
        {
            changed |= this.put(pair.getOne(), pair.getTwo());
        }
        return changed;
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `changed |= this.put(pair.getOne(), pair.getTwo())`
in `eclipse-collections-api/src/main/java/org/eclipse/collections/api/multimap/MutableMultimap.java`
#### Snippet
```java
        for (Pair<? extends K, ? extends V> pair : pairs)
        {
            changed |= this.put(pair.getOne(), pair.getTwo());
        }
        return changed;
```

## RuleId[id=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `AbstractBooleanValuesCollection` has no concrete subclass
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/primitive/AbstractMutableBooleanValuesMap.java`
#### Snippet
```java
    }

    protected abstract class AbstractBooleanValuesCollection implements MutableBooleanCollection
    {
        @Override
```

### AbstractClassNeverImplemented
Abstract class `AbstractMutableBooleanValuesMap` has no concrete subclass
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/primitive/AbstractMutableBooleanValuesMap.java`
#### Snippet
```java
import org.eclipse.collections.impl.set.mutable.primitive.BooleanHashSet;

public abstract class AbstractMutableBooleanValuesMap extends AbstractBooleanIterable implements MutableBooleanValuesMap
{
    protected abstract int getOccupiedWithData();
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? super URL`
in `eclipse-collections-code-generator/src/main/java/org/eclipse/collections/codegenerator/tools/FileUtils.java`
#### Snippet
```java
    private static void processJar(
            JarInputStream stream,
            List<URL> files,
            String templateDirectory) throws IOException
    {
```

### BoundedWildcard
Can generalize to `? extends V`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/AbstractMapIterable.java`
#### Snippet
```java
    }

    protected boolean keyAndValueEquals(K key, V value, Map<K, V> map)
    {
        if (value == null && !map.containsKey(key))
```

### BoundedWildcard
Can generalize to `? extends Pair`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/fixed/SingletonMap.java`
#### Snippet
```java

    @Override
    public <K2, V2> FixedSizeMap<K2, V2> collect(Function2<? super K, ? super V, Pair<K2, V2>> function)
    {
        Pair<K2, V2> pair1 = function.value(this.key1, this.value1);
```

### BoundedWildcard
Can generalize to `? extends Pair`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/fixed/DoubletonMap.java`
#### Snippet
```java

    @Override
    public <K2, V2> FixedSizeMap<K2, V2> collect(Function2<? super K, ? super V, Pair<K2, V2>> function)
    {
        Pair<K2, V2> pair1 = function.value(this.key1, this.value1);
```

### BoundedWildcard
Can generalize to `? extends Pair`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/fixed/TripletonMap.java`
#### Snippet
```java

    @Override
    public <K2, V2> FixedSizeMap<K2, V2> collect(Function2<? super K, ? super V, Pair<K2, V2>> function)
    {
        Pair<K2, V2> pair1 = function.value(this.key1, this.value1);
```

### BoundedWildcard
Can generalize to `? extends K`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/sorted/immutable/ImmutableSortedMapSerializationProxy.java`
#### Snippet
```java
    }

    ImmutableSortedMapSerializationProxy(ImmutableSortedMap<K, V> map)
    {
        this.map = map;
```

### BoundedWildcard
Can generalize to `? extends V`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/sorted/immutable/ImmutableSortedMapSerializationProxy.java`
#### Snippet
```java
    }

    ImmutableSortedMapSerializationProxy(ImmutableSortedMap<K, V> map)
    {
        this.map = map;
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/bag/mutable/MultiReaderHashBag.java`
#### Snippet
```java
        private Iterator<T> delegate;

        private UntouchableIterator(Iterator<T> newDelegate)
        {
            this.delegate = newDelegate;
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/bag/mutable/MultiReaderHashBag.java`
#### Snippet
```java
    }

    public static <T> MultiReaderHashBag<T> newBag(Iterable<T> iterable)
    {
        return new MultiReaderHashBag<>(HashBag.newBag(iterable));
```

### BoundedWildcard
Can generalize to `? extends K`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/strategy/immutable/ImmutableMapWithHashingStrategySerializationProxy.java`
#### Snippet
```java
    }

    ImmutableMapWithHashingStrategySerializationProxy(ImmutableMap<K, V> map, HashingStrategy<? super K> hashingStrategy)
    {
        this.map = map;
```

### BoundedWildcard
Can generalize to `? extends V`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/strategy/immutable/ImmutableMapWithHashingStrategySerializationProxy.java`
#### Snippet
```java
    }

    ImmutableMapWithHashingStrategySerializationProxy(ImmutableMap<K, V> map, HashingStrategy<? super K> hashingStrategy)
    {
        this.map = map;
```

### BoundedWildcard
Can generalize to `? super K`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/UnifiedMap.java`
#### Snippet
```java
        }

        private void putIfFoundFromChain(Object[] chain, K key, Map<K, V> other)
        {
            for (int i = 0; i < chain.length; i += 2)
```

### BoundedWildcard
Can generalize to `? super V`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/UnifiedMap.java`
#### Snippet
```java
        }

        private void putIfFoundFromChain(Object[] chain, K key, Map<K, V> other)
        {
            for (int i = 0; i < chain.length; i += 2)
```

### BoundedWildcard
Can generalize to `? extends Pair`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/UnifiedMap.java`
#### Snippet
```java
    }

    public static <K, V> UnifiedMap<K, V> newMapWith(Iterable<Pair<K, V>> inputIterable)
    {
        UnifiedMap<K, V> outputMap = UnifiedMap.newMap();
```

### BoundedWildcard
Can generalize to `? super V`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/UnifiedMap.java`
#### Snippet
```java
        }

        private void chainedAddToList(Object[] chain, FastList<V> replace)
        {
            for (int i = 0; i < chain.length; i += 2)
```

### BoundedWildcard
Can generalize to `? super K`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/UnifiedMap.java`
#### Snippet
```java
        }

        private void chainedAddToSet(Object[] chain, UnifiedSet<K> replace)
        {
            for (int i = 0; i < chain.length; i += 2)
```

### BoundedWildcard
Can generalize to `? extends K`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/immutable/ImmutableMapSerializationProxy.java`
#### Snippet
```java
    }

    ImmutableMapSerializationProxy(ImmutableMap<K, V> map)
    {
        this.map = map;
```

### BoundedWildcard
Can generalize to `? extends V`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/immutable/ImmutableMapSerializationProxy.java`
#### Snippet
```java
    }

    ImmutableMapSerializationProxy(ImmutableMap<K, V> map)
    {
        this.map = map;
```

### BoundedWildcard
Can generalize to `? extends Pair`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/immutable/ImmutableTripletonMap.java`
#### Snippet
```java

    @Override
    public <K2, V2> ImmutableMap<K2, V2> collect(Function2<? super K, ? super V, Pair<K2, V2>> function)
    {
        Pair<K2, V2> pair1 = function.value(this.key1, this.value1);
```

### BoundedWildcard
Can generalize to `? extends Pair`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/immutable/ImmutableSingletonMap.java`
#### Snippet
```java

    @Override
    public <K2, V2> ImmutableMap<K2, V2> collect(Function2<? super K, ? super V, Pair<K2, V2>> function)
    {
        Pair<K2, V2> pair = function.value(this.key1, this.value1);
```

### BoundedWildcard
Can generalize to `? extends Pair`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/immutable/ImmutableQuadrupletonMap.java`
#### Snippet
```java

    @Override
    public <K2, V2> ImmutableMap<K2, V2> collect(Function2<? super K, ? super V, Pair<K2, V2>> function)
    {
        Pair<K2, V2> pair1 = function.value(this.key1, this.value1);
```

### BoundedWildcard
Can generalize to `? extends Pair`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/immutable/ImmutableDoubletonMap.java`
#### Snippet
```java

    @Override
    public <K2, V2> ImmutableMap<K2, V2> collect(Function2<? super K, ? super V, Pair<K2, V2>> function)
    {
        Pair<K2, V2> pair1 = function.value(this.key1, this.value1);
```

### BoundedWildcard
Can generalize to `? extends NK`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentMutableHashMap.java`
#### Snippet
```java
    }

    public static <NK, NV> ConcurrentMutableHashMap<NK, NV> newMap(Map<NK, NV> map)
    {
        return new ConcurrentMutableHashMap<>(new ConcurrentHashMap<>(map));
```

### BoundedWildcard
Can generalize to `? extends NV`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentMutableHashMap.java`
#### Snippet
```java
    }

    public static <NK, NV> ConcurrentMutableHashMap<NK, NV> newMap(Map<NK, NV> map)
    {
        return new ConcurrentMutableHashMap<>(new ConcurrentHashMap<>(map));
```

### BoundedWildcard
Can generalize to `? extends NK`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMap.java`
#### Snippet
```java
    }

    public static <NK, NV> ConcurrentHashMap<NK, NV> newMap(Map<NK, NV> map)
    {
        ConcurrentHashMap<NK, NV> result = new ConcurrentHashMap<>(map.size());
```

### BoundedWildcard
Can generalize to `? extends NV`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMap.java`
#### Snippet
```java
    }

    public static <NK, NV> ConcurrentHashMap<NK, NV> newMap(Map<NK, NV> map)
    {
        ConcurrentHashMap<NK, NV> result = new ConcurrentHashMap<>(map.size());
```

### BoundedWildcard
Can generalize to `? super V`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMap.java`
#### Snippet
```java
    }

    private void sequentialForEachValue(Procedure<V> block, AtomicReferenceArray currentArray, int start, int end)
    {
        for (int i = start; i < end; i++)
```

### BoundedWildcard
Can generalize to `? extends Procedure2`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMap.java`
#### Snippet
```java
    }

    public void parallelForEachKeyValue(List<Procedure2<K, V>> blocks, Executor executor)
    {
        AtomicReferenceArray currentArray = this.table;
```

### BoundedWildcard
Can generalize to `? extends Procedure`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMap.java`
#### Snippet
```java
    }

    public void parallelForEachValue(List<Procedure<V>> blocks, Executor executor)
    {
        AtomicReferenceArray currentArray = this.table;
```

### BoundedWildcard
Can generalize to `? extends Procedure2`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMapUnsafe.java`
#### Snippet
```java
    }

    public void parallelForEachKeyValue(List<Procedure2<K, V>> blocks, Executor executor)
    {
        Object[] currentArray = this.table;
```

### BoundedWildcard
Can generalize to `? extends NK`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMapUnsafe.java`
#### Snippet
```java
    }

    public static <NK, NV> ConcurrentHashMapUnsafe<NK, NV> newMap(Map<NK, NV> map)
    {
        ConcurrentHashMapUnsafe<NK, NV> result = new ConcurrentHashMapUnsafe<>(map.size());
```

### BoundedWildcard
Can generalize to `? extends NV`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMapUnsafe.java`
#### Snippet
```java
    }

    public static <NK, NV> ConcurrentHashMapUnsafe<NK, NV> newMap(Map<NK, NV> map)
    {
        ConcurrentHashMapUnsafe<NK, NV> result = new ConcurrentHashMapUnsafe<>(map.size());
```

### BoundedWildcard
Can generalize to `? extends Procedure`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMapUnsafe.java`
#### Snippet
```java
    }

    public void parallelForEachValue(List<Procedure<V>> blocks, Executor executor)
    {
        Object[] currentArray = this.table;
```

### BoundedWildcard
Can generalize to `? super T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/sorted/immutable/ImmutableSortedSetFactoryImpl.java`
#### Snippet
```java

    @Override
    public <T> ImmutableSortedSet<T> withSortedSet(SortedSet<T> set)
    {
        if (set instanceof ImmutableSortedSet)
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/sorted/immutable/ImmutableSortedSetSerializationProxy.java`
#### Snippet
```java
    }

    ImmutableSortedSetSerializationProxy(ImmutableSortedSet<T> set)
    {
        this.set = set;
```

### BoundedWildcard
Can generalize to `? super K`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/strategy/mutable/UnifiedMapWithHashingStrategy.java`
#### Snippet
```java
        }

        private void putIfFoundFromChain(Object[] chain, K key, Map<K, V> other)
        {
            for (int i = 0; i < chain.length; i += 2)
```

### BoundedWildcard
Can generalize to `? super V`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/strategy/mutable/UnifiedMapWithHashingStrategy.java`
#### Snippet
```java
        }

        private void putIfFoundFromChain(Object[] chain, K key, Map<K, V> other)
        {
            for (int i = 0; i < chain.length; i += 2)
```

### BoundedWildcard
Can generalize to `? super K`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/strategy/mutable/UnifiedMapWithHashingStrategy.java`
#### Snippet
```java
        }

        private void chainedAddToSet(Object[] chain, UnifiedSetWithHashingStrategy<K> replace)
        {
            for (int i = 0; i < chain.length; i += 2)
```

### BoundedWildcard
Can generalize to `? extends Pair`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/strategy/mutable/UnifiedMapWithHashingStrategy.java`
#### Snippet
```java
    }

    public static <K, V> UnifiedMapWithHashingStrategy<K, V> newMapWith(HashingStrategy<? super K> hashingStrategy, Iterable<Pair<K, V>> inputIterable)
    {
        UnifiedMapWithHashingStrategy<K, V> outputMap = UnifiedMapWithHashingStrategy.newMap(hashingStrategy);
```

### BoundedWildcard
Can generalize to `? super V`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/strategy/mutable/UnifiedMapWithHashingStrategy.java`
#### Snippet
```java
        }

        private void chainedAddToList(Object[] chain, FastList<V> replace)
        {
            for (int i = 0; i < chain.length; i += 2)
```

### BoundedWildcard
Can generalize to `? extends V`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/strategy/mutable/UnifiedMapWithHashingStrategy.java`
#### Snippet
```java
    }

    public static <K, V> UnifiedMapWithHashingStrategy<K, V> newMap(UnifiedMapWithHashingStrategy<K, V> map)
    {
        return new UnifiedMapWithHashingStrategy<>(map.hashingStrategy, map);
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/strategy/immutable/ImmutableSetWithHashingStrategySerializationProxy.java`
#### Snippet
```java
    }

    ImmutableSetWithHashingStrategySerializationProxy(ImmutableSet<T> set, HashingStrategy<? super T> hashingStrategy)
    {
        this.set = set;
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/immutable/ImmutableSetSerializationProxy.java`
#### Snippet
```java
    }

    ImmutableSetSerializationProxy(ImmutableSet<T> set)
    {
        this.set = set;
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/lazy/ReverseIterable.java`
#### Snippet
```java
        private final ListIterator<T> listIterator;

        private ReverseIterator(ListIterator<T> listIterator)
        {
            this.listIterator = listIterator;
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/lazy/FlatCollectIterable.java`
#### Snippet
```java
    private final Function<? super T, ? extends Iterable<V>> function;

    public FlatCollectIterable(Iterable<T> newAdapted, Function<? super T, ? extends Iterable<V>> function)
    {
        this.adapted = newAdapted;
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/lazy/iterator/TapIterator.java`
#### Snippet
```java
    }

    public TapIterator(Iterator<T> iterator, Procedure<? super T> procedure)
    {
        this.iterator = iterator;
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/MultiReaderUnifiedSet.java`
#### Snippet
```java
    }

    public static <T> MultiReaderUnifiedSet<T> newSet(Iterable<T> iterable)
    {
        return new MultiReaderUnifiedSet<>(UnifiedSet.newSet(iterable));
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/lazy/iterator/TakeIterator.java`
#### Snippet
```java
    }

    public TakeIterator(Iterator<T> iterator, int count)
    {
        this.iterator = iterator;
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/MultiReaderUnifiedSet.java`
#### Snippet
```java
        private Iterator<T> delegate;

        private UntouchableIterator(Iterator<T> newDelegate)
        {
            this.delegate = newDelegate;
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/lazy/iterator/SelectIterator.java`
#### Snippet
```java
    }

    public SelectIterator(Iterator<T> iterator, Predicate<? super T> predicate)
    {
        this.iterator = iterator;
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/lazy/iterator/FlatCollectIterator.java`
#### Snippet
```java

    public FlatCollectIterator(
            Iterator<T> newIterator,
            Function<? super T, ? extends Iterable<V>> newFunction)
    {
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/lazy/iterator/DistinctIterator.java`
#### Snippet
```java
    }

    public DistinctIterator(Iterator<T> iterator)
    {
        this.iterator = iterator;
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/lazy/iterator/TakeWhileIterator.java`
#### Snippet
```java
    }

    public TakeWhileIterator(Iterator<T> iterator, Predicate<? super T> predicate)
    {
        this.iterator = iterator;
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/lazy/iterator/CollectIterator.java`
#### Snippet
```java
    }

    public CollectIterator(Iterator<T> newIterator, Function<? super T, ? extends V> function)
    {
        this.iterator = newIterator;
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/lazy/parallel/ParallelSelectIterable.java`
#### Snippet
```java
    private final Predicate<? super T> predicate;

    public ParallelSelectIterable(AbstractParallelIterable<T, ? extends Batch<T>> parallelIterable, Predicate<? super T> predicate)
    {
        this.parallelIterable = parallelIterable;
```

### BoundedWildcard
Can generalize to `? super T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/UnifiedSet.java`
#### Snippet
```java
    }

    private void addIfFoundFromChain(ChainedBucket bucket, T key, UnifiedSet<T> other)
    {
        do
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/lazy/parallel/bag/CollectUnsortedBagBatch.java`
#### Snippet
```java
    private final Function<? super T, ? extends V> function;

    public CollectUnsortedBagBatch(Batch<T> unsortedBagBatch, Function<? super T, ? extends V> function)
    {
        this.unsortedBagBatch = unsortedBagBatch;
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/lazy/parallel/bag/FlatCollectUnsortedBagBatch.java`
#### Snippet
```java
    private final Function<? super T, ? extends Iterable<V>> function;

    public FlatCollectUnsortedBagBatch(Batch<T> unsortedBagBatch, Function<? super T, ? extends Iterable<V>> function)
    {
        this.unsortedBagBatch = unsortedBagBatch;
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/lazy/parallel/set/ParallelSelectUnsortedSetIterable.java`
#### Snippet
```java
    private final Predicate<? super T> predicate;

    ParallelSelectUnsortedSetIterable(AbstractParallelUnsortedSetIterable<T, ? extends UnsortedSetBatch<T>> delegate, Predicate<? super T> predicate)
    {
        this.delegate = delegate;
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/lazy/parallel/set/ParallelCollectIterable.java`
#### Snippet
```java
    private final Function<? super T, ? extends V> function;

    public ParallelCollectIterable(AbstractParallelIterable<T, ? extends Batch<T>> delegate, Function<? super T, ? extends V> function)
    {
        this.delegate = delegate;
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/lazy/parallel/set/CollectUnsortedSetBatch.java`
#### Snippet
```java
    private final Function<? super T, ? extends V> function;

    public CollectUnsortedSetBatch(UnsortedSetBatch<T> unsortedSetBatch, Function<? super T, ? extends V> function)
    {
        this.unsortedSetBatch = unsortedSetBatch;
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/lazy/parallel/set/SelectUnsortedSetBatch.java`
#### Snippet
```java
    private final Predicate<? super T> predicate;

    public SelectUnsortedSetBatch(UnsortedSetBatch<T> unsortedSetBatch, Predicate<? super T> predicate)
    {
        this.unsortedSetBatch = unsortedSetBatch;
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/lazy/parallel/set/sorted/FlatCollectSortedSetBatch.java`
#### Snippet
```java
    private final Function<? super T, ? extends Iterable<V>> function;

    public FlatCollectSortedSetBatch(SortedSetBatch<T> sortedSetBatch, Function<? super T, ? extends Iterable<V>> function)
    {
        this.sortedSetBatch = sortedSetBatch;
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/lazy/parallel/set/ParallelFlatCollectIterable.java`
#### Snippet
```java
    private final Function<? super T, ? extends Iterable<V>> function;

    public ParallelFlatCollectIterable(AbstractParallelIterable<T, ? extends Batch<T>> delegate, Function<? super T, ? extends Iterable<V>> function)
    {
        this.delegate = delegate;
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/lazy/parallel/set/sorted/CollectSortedSetBatch.java`
#### Snippet
```java
    private final Function<? super T, ? extends V> function;

    public CollectSortedSetBatch(SortedSetBatch<T> sortedSetBatch, Function<? super T, ? extends V> function)
    {
        this.sortedSetBatch = sortedSetBatch;
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/lazy/parallel/set/sorted/SelectSortedSetBatch.java`
#### Snippet
```java
    private final Predicate<? super T> predicate;

    public SelectSortedSetBatch(SortedSetBatch<T> sortedSetBatch, Predicate<? super T> predicate)
    {
        this.sortedSetBatch = sortedSetBatch;
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/lazy/parallel/list/CollectListBatch.java`
#### Snippet
```java
    private final Function<? super T, ? extends V> function;

    public CollectListBatch(Batch<T> batch, Function<? super T, ? extends V> function)
    {
        this.batch = batch;
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/lazy/parallel/list/ParallelCollectListIterable.java`
#### Snippet
```java
    private final Function<? super T, ? extends V> function;

    public ParallelCollectListIterable(AbstractParallelIterable<T, ? extends OrderedBatch<T>> parallelIterable, Function<? super T, ? extends V> function)
    {
        this.parallelIterable = parallelIterable;
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/lazy/parallel/list/SelectListBatch.java`
#### Snippet
```java
    private final Predicate<? super T> predicate;

    public SelectListBatch(ListBatch<T> listBatch, Predicate<? super T> predicate)
    {
        this.listBatch = listBatch;
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/lazy/parallel/list/ParallelSelectListIterable.java`
#### Snippet
```java
    private final Predicate<? super T> predicate;

    ParallelSelectListIterable(AbstractParallelListIterable<T, ? extends ListBatch<T>> parallelIterable, Predicate<? super T> predicate)
    {
        this.parallelIterable = parallelIterable;
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/lazy/parallel/list/DistinctBatch.java`
#### Snippet
```java
    private final ConcurrentHashMap<T, Boolean> distinct;

    public DistinctBatch(Batch<T> batch, ConcurrentHashMap<T, Boolean> distinct)
    {
        this.batch = batch;
```

### BoundedWildcard
Can generalize to `? super T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/lazy/parallel/list/DistinctBatch.java`
#### Snippet
```java
    private final ConcurrentHashMap<T, Boolean> distinct;

    public DistinctBatch(Batch<T> batch, ConcurrentHashMap<T, Boolean> distinct)
    {
        this.batch = batch;
```

### BoundedWildcard
Can generalize to `? super Boolean`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/lazy/parallel/list/DistinctBatch.java`
#### Snippet
```java
    private final ConcurrentHashMap<T, Boolean> distinct;

    public DistinctBatch(Batch<T> batch, ConcurrentHashMap<T, Boolean> distinct)
    {
        this.batch = batch;
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/lazy/parallel/list/ListIterableBatch.java`
#### Snippet
```java
    private final int chunkEndIndex;

    public ListIterableBatch(ListIterable<T> list, int chunkStartIndex, int chunkEndIndex)
    {
        this.list = list;
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/lazy/parallel/list/FlatCollectListBatch.java`
#### Snippet
```java
    private final Function<? super T, ? extends Iterable<V>> function;

    public FlatCollectListBatch(Batch<T> batch, Function<? super T, ? extends Iterable<V>> function)
    {
        this.batch = batch;
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/lazy/parallel/list/ParallelFlatCollectListIterable.java`
#### Snippet
```java
    private final Function<? super T, ? extends Iterable<V>> function;

    public ParallelFlatCollectListIterable(AbstractParallelIterable<T, ? extends OrderedBatch<T>> parallelIterable, Function<? super T, ? extends Iterable<V>> function)
    {
        this.parallelIterable = parallelIterable;
```

### BoundedWildcard
Can generalize to `? super Integer`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/Interval.java`
#### Snippet
```java
    }

    public <R> R reverseInjectInto(R injectValue, Function2<? super R, Integer, ? extends R> function)
    {
        return this.reverseThis().injectInto(injectValue, function);
```

### BoundedWildcard
Can generalize to `? super T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/strategy/mutable/UnifiedSetWithHashingStrategy.java`
#### Snippet
```java
    }

    private void addIfFoundFromChain(ChainedBucket bucket, T key, UnifiedSetWithHashingStrategy<T> other)
    {
        do
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/mutable/UnmodifiableListIteratorAdapter.java`
#### Snippet
```java
    private final ListIterator<? extends T> iterator;

    public UnmodifiableListIteratorAdapter(ListIterator<T> iterator)
    {
        this.iterator = iterator;
```

### BoundedWildcard
Can generalize to `? super Batch`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/lazy/parallel/AbstractParallelIterable.java`
#### Snippet
```java
    }

    private double sumOfDoubleOrdered(Function<Batch<T>, DoubleSumResultHolder> map)
    {
        LazyIterable<? extends Batch<T>> chunks = this.split();
```

### BoundedWildcard
Can generalize to `? extends DoubleSumResultHolder`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/lazy/parallel/AbstractParallelIterable.java`
#### Snippet
```java
    }

    private double sumOfDoubleOrdered(Function<Batch<T>, DoubleSumResultHolder> map)
    {
        LazyIterable<? extends Batch<T>> chunks = this.split();
```

### BoundedWildcard
Can generalize to `? super Batch`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/lazy/parallel/AbstractParallelIterable.java`
#### Snippet
```java
    }

    private T collectReduceOrdered(Function<Batch<T>, T> map, Function2<T, T, T> function2)
    {
        LazyIterable<? extends Batch<T>> chunks = this.split();
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/lazy/parallel/AbstractParallelIterable.java`
#### Snippet
```java
    }

    private T collectReduceOrdered(Function<Batch<T>, T> map, Function2<T, T, T> function2)
    {
        LazyIterable<? extends Batch<T>> chunks = this.split();
```

### BoundedWildcard
Can generalize to `? super T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/lazy/parallel/AbstractParallelIterable.java`
#### Snippet
```java
    }

    private T collectReduceOrdered(Function<Batch<T>, T> map, Function2<T, T, T> function2)
    {
        LazyIterable<? extends Batch<T>> chunks = this.split();
```

### BoundedWildcard
Can generalize to `? super T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/lazy/parallel/AbstractParallelIterable.java`
#### Snippet
```java
    }

    private T collectReduceOrdered(Function<Batch<T>, T> map, Function2<T, T, T> function2)
    {
        LazyIterable<? extends Batch<T>> chunks = this.split();
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/lazy/parallel/AbstractParallelIterable.java`
#### Snippet
```java
    }

    private T collectReduceOrdered(Function<Batch<T>, T> map, Function2<T, T, T> function2)
    {
        LazyIterable<? extends Batch<T>> chunks = this.split();
```

### BoundedWildcard
Can generalize to `? super Batch`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/lazy/parallel/AbstractParallelIterable.java`
#### Snippet
```java
    }

    private T collectReduceUnordered(Function<Batch<T>, T> map, Function2<T, T, T> function2)
    {
        LazyIterable<? extends Batch<T>> chunks = this.split();
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/lazy/parallel/AbstractParallelIterable.java`
#### Snippet
```java
    }

    private T collectReduceUnordered(Function<Batch<T>, T> map, Function2<T, T, T> function2)
    {
        LazyIterable<? extends Batch<T>> chunks = this.split();
```

### BoundedWildcard
Can generalize to `? super T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/lazy/parallel/AbstractParallelIterable.java`
#### Snippet
```java
    }

    private T collectReduceUnordered(Function<Batch<T>, T> map, Function2<T, T, T> function2)
    {
        LazyIterable<? extends Batch<T>> chunks = this.split();
```

### BoundedWildcard
Can generalize to `? super T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/lazy/parallel/AbstractParallelIterable.java`
#### Snippet
```java
    }

    private T collectReduceUnordered(Function<Batch<T>, T> map, Function2<T, T, T> function2)
    {
        LazyIterable<? extends Batch<T>> chunks = this.split();
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/lazy/parallel/AbstractParallelIterable.java`
#### Snippet
```java
    }

    private T collectReduceUnordered(Function<Batch<T>, T> map, Function2<T, T, T> function2)
    {
        LazyIterable<? extends Batch<T>> chunks = this.split();
```

### BoundedWildcard
Can generalize to `? super Batch`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/lazy/parallel/AbstractParallelIterable.java`
#### Snippet
```java
    }

    private <S, V> void collectCombineUnordered(Function<Batch<T>, V> function, Procedure2<S, V> combineProcedure, S state)
    {
        LazyIterable<? extends Batch<T>> chunks = this.split();
```

### BoundedWildcard
Can generalize to `? extends V`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/lazy/parallel/AbstractParallelIterable.java`
#### Snippet
```java
    }

    private <S, V> void collectCombineUnordered(Function<Batch<T>, V> function, Procedure2<S, V> combineProcedure, S state)
    {
        LazyIterable<? extends Batch<T>> chunks = this.split();
```

### BoundedWildcard
Can generalize to `? super V`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/lazy/parallel/AbstractParallelIterable.java`
#### Snippet
```java
    }

    private <S, V> void collectCombineUnordered(Function<Batch<T>, V> function, Procedure2<S, V> combineProcedure, S state)
    {
        LazyIterable<? extends Batch<T>> chunks = this.split();
```

### BoundedWildcard
Can generalize to `? super Batch`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/lazy/parallel/AbstractParallelIterable.java`
#### Snippet
```java
    }

    private <S, V> void collectCombineOrdered(Function<Batch<T>, V> function, Procedure2<S, V> combineProcedure, S state)
    {
        LazyIterable<? extends Batch<T>> chunks = this.split();
```

### BoundedWildcard
Can generalize to `? extends V`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/lazy/parallel/AbstractParallelIterable.java`
#### Snippet
```java
    }

    private <S, V> void collectCombineOrdered(Function<Batch<T>, V> function, Procedure2<S, V> combineProcedure, S state)
    {
        LazyIterable<? extends Batch<T>> chunks = this.split();
```

### BoundedWildcard
Can generalize to `? super V`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/lazy/parallel/AbstractParallelIterable.java`
#### Snippet
```java
    }

    private <S, V> void collectCombineOrdered(Function<Batch<T>, V> function, Procedure2<S, V> combineProcedure, S state)
    {
        LazyIterable<? extends Batch<T>> chunks = this.split();
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/immutable/ImmutableListFactoryImpl.java`
#### Snippet
```java
    }

    private <T> ImmutableList<T> withList(List<T> items)
    {
        switch (items.size())
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/mutable/MultiReaderFastList.java`
#### Snippet
```java
        private Iterator<T> delegate;

        private UntouchableListIterator(Iterator<T> newDelegate)
        {
            this.delegate = newDelegate;
```

### BoundedWildcard
Can generalize to `? super T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/mutable/FastList.java`
#### Snippet
```java
    }

    private void addAllArrayListAtIndex(ArrayList<T> source, int index)
    {
        int sourceSize = source.size();
```

### BoundedWildcard
Can generalize to `? super T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/mutable/FastList.java`
#### Snippet
```java
    }

    private void addAllRandomAccessListAtIndex(List<T> source, int index)
    {
        int sourceSize = source.size();
```

### BoundedWildcard
Can generalize to `? extends K`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/bimap/immutable/ImmutableBiMapSerializationProxy.java`
#### Snippet
```java
    }

    ImmutableBiMapSerializationProxy(ImmutableBiMap<K, V> biMap)
    {
        this.biMap = biMap;
```

### BoundedWildcard
Can generalize to `? extends V`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/bimap/immutable/ImmutableBiMapSerializationProxy.java`
#### Snippet
```java
    }

    ImmutableBiMapSerializationProxy(ImmutableBiMap<K, V> biMap)
    {
        this.biMap = biMap;
```

### BoundedWildcard
Can generalize to `? super K`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/MultimapFunctions.java`
#### Snippet
```java
        private final Multimap<K, V> multimap;

        private MultimapGetFunction(Multimap<K, V> multimap)
        {
            this.multimap = multimap;
```

### BoundedWildcard
Can generalize to `? super T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/Procedures.java`
#### Snippet
```java
        private final ThrowingProcedure<T> throwingProcedure;

        private ThrowingProcedureAdapter(ThrowingProcedure<T> throwingProcedure)
        {
            this.throwingProcedure = throwingProcedure;
```

### BoundedWildcard
Can generalize to `? super T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/Procedures.java`
#### Snippet
```java
        private final Procedure<T> procedure;

        private SynchronizedProcedure(Procedure<T> procedure)
        {
            this.procedure = procedure;
```

### BoundedWildcard
Can generalize to `? super T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/Procedures.java`
#### Snippet
```java
     */
    public static <T> Procedure<T> throwing(
            ThrowingProcedure<T> throwingProcedure,
            Function2<T, ? super Throwable, ? extends RuntimeException> rethrow)
    {
```

### BoundedWildcard
Can generalize to `? super T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/Procedures.java`
#### Snippet
```java
    public static <T> Procedure<T> throwing(
            ThrowingProcedure<T> throwingProcedure,
            Function2<T, ? super Throwable, ? extends RuntimeException> rethrow)
    {
        return each ->
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/Functions0.java`
#### Snippet
```java
        private final ThrowingFunction0<T> throwingFunction0;

        private ThrowingFunction0Adapter(ThrowingFunction0<T> throwingFunction0)
        {
            this.throwingFunction0 = throwingFunction0;
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/Functions0.java`
#### Snippet
```java
     */
    public static <T> Function0<T> throwing(
            ThrowingFunction0<T> throwingFunction0,
            Function<? super Throwable, ? extends RuntimeException> rethrow)
    {
```

### BoundedWildcard
Can generalize to `? super T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/Procedures2.java`
#### Snippet
```java
        private final ThrowingProcedure2<T, P> throwingProcedure2;

        private ThrowingProcedure2Adapter(ThrowingProcedure2<T, P> throwingProcedure2)
        {
            this.throwingProcedure2 = throwingProcedure2;
```

### BoundedWildcard
Can generalize to `? super P`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/Procedures2.java`
#### Snippet
```java
        private final ThrowingProcedure2<T, P> throwingProcedure2;

        private ThrowingProcedure2Adapter(ThrowingProcedure2<T, P> throwingProcedure2)
        {
            this.throwingProcedure2 = throwingProcedure2;
```

### BoundedWildcard
Can generalize to `? super T1`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/Procedures2.java`
#### Snippet
```java
     */
    public static <T1, T2> Procedure2<T1, T2> throwing(
            ThrowingProcedure2<T1, T2> throwingProcedure,
            Function3<T1, T2, ? super Throwable, ? extends RuntimeException> rethrow)
    {
```

### BoundedWildcard
Can generalize to `? super T2`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/Procedures2.java`
#### Snippet
```java
     */
    public static <T1, T2> Procedure2<T1, T2> throwing(
            ThrowingProcedure2<T1, T2> throwingProcedure,
            Function3<T1, T2, ? super Throwable, ? extends RuntimeException> rethrow)
    {
```

### BoundedWildcard
Can generalize to `? super T1`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/Procedures2.java`
#### Snippet
```java
    public static <T1, T2> Procedure2<T1, T2> throwing(
            ThrowingProcedure2<T1, T2> throwingProcedure,
            Function3<T1, T2, ? super Throwable, ? extends RuntimeException> rethrow)
    {
        return (one, two) ->
```

### BoundedWildcard
Can generalize to `? super T2`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/Procedures2.java`
#### Snippet
```java
    public static <T1, T2> Procedure2<T1, T2> throwing(
            ThrowingProcedure2<T1, T2> throwingProcedure,
            Function3<T1, T2, ? super Throwable, ? extends RuntimeException> rethrow)
    {
        return (one, two) ->
```

### BoundedWildcard
Can generalize to `? super T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/HashingStrategies.java`
#### Snippet
```java
        private final HashingStrategy<T> nonNullSafeStrategy;

        private NullSafeHashingStrategy(HashingStrategy<T> nonNullSafeStrategy)
        {
            this.nonNullSafeStrategy = nonNullSafeStrategy;
```

### BoundedWildcard
Can generalize to `? super T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/Functions2.java`
#### Snippet
```java
        private final ThrowingFunction2<T, P, V> throwingFunction2;

        private ThrowingFunction2Adapter(ThrowingFunction2<T, P, V> throwingFunction2)
        {
            this.throwingFunction2 = throwingFunction2;
```

### BoundedWildcard
Can generalize to `? super P`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/Functions2.java`
#### Snippet
```java
        private final ThrowingFunction2<T, P, V> throwingFunction2;

        private ThrowingFunction2Adapter(ThrowingFunction2<T, P, V> throwingFunction2)
        {
            this.throwingFunction2 = throwingFunction2;
```

### BoundedWildcard
Can generalize to `? extends V`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/Functions2.java`
#### Snippet
```java
        private final ThrowingFunction2<T, P, V> throwingFunction2;

        private ThrowingFunction2Adapter(ThrowingFunction2<T, P, V> throwingFunction2)
        {
            this.throwingFunction2 = throwingFunction2;
```

### BoundedWildcard
Can generalize to `? super T1`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/Functions2.java`
#### Snippet
```java
     */
    public static <T1, T2, V> Function2<T1, T2, V> throwing(
            ThrowingFunction2<T1, T2, V> throwingFunction2,
            Function3<T1, T2, ? super Throwable, ? extends RuntimeException> rethrow)
    {
```

### BoundedWildcard
Can generalize to `? super T2`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/Functions2.java`
#### Snippet
```java
     */
    public static <T1, T2, V> Function2<T1, T2, V> throwing(
            ThrowingFunction2<T1, T2, V> throwingFunction2,
            Function3<T1, T2, ? super Throwable, ? extends RuntimeException> rethrow)
    {
```

### BoundedWildcard
Can generalize to `? extends V`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/Functions2.java`
#### Snippet
```java
     */
    public static <T1, T2, V> Function2<T1, T2, V> throwing(
            ThrowingFunction2<T1, T2, V> throwingFunction2,
            Function3<T1, T2, ? super Throwable, ? extends RuntimeException> rethrow)
    {
```

### BoundedWildcard
Can generalize to `? super T1`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/Functions2.java`
#### Snippet
```java
    public static <T1, T2, V> Function2<T1, T2, V> throwing(
            ThrowingFunction2<T1, T2, V> throwingFunction2,
            Function3<T1, T2, ? super Throwable, ? extends RuntimeException> rethrow)
    {
        return (one, two) ->
```

### BoundedWildcard
Can generalize to `? super T2`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/Functions2.java`
#### Snippet
```java
    public static <T1, T2, V> Function2<T1, T2, V> throwing(
            ThrowingFunction2<T1, T2, V> throwingFunction2,
            Function3<T1, T2, ? super Throwable, ? extends RuntimeException> rethrow)
    {
        return (one, two) ->
```

### BoundedWildcard
Can generalize to `? super T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/Predicates2.java`
#### Snippet
```java
        private final Predicate2<T, P> predicate;

        private Not(Predicate2<T, P> predicate)
        {
            this.predicate = predicate;
```

### BoundedWildcard
Can generalize to `? super P`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/Predicates2.java`
#### Snippet
```java
        private final Predicate2<T, P> predicate;

        private Not(Predicate2<T, P> predicate)
        {
            this.predicate = predicate;
```

### BoundedWildcard
Can generalize to `? super T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/Predicates2.java`
#### Snippet
```java
        private final ThrowingPredicate2<T, P> throwingPredicate2;

        private ThrowingPredicate2Adapter(ThrowingPredicate2<T, P> throwingPredicate2)
        {
            this.throwingPredicate2 = throwingPredicate2;
```

### BoundedWildcard
Can generalize to `? super P`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/Predicates2.java`
#### Snippet
```java
        private final ThrowingPredicate2<T, P> throwingPredicate2;

        private ThrowingPredicate2Adapter(ThrowingPredicate2<T, P> throwingPredicate2)
        {
            this.throwingPredicate2 = throwingPredicate2;
```

### BoundedWildcard
Can generalize to `? super T1`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/Predicates2.java`
#### Snippet
```java
     */
    public static <T1, T2> Predicate2<T1, T2> throwing(
            ThrowingPredicate2<T1, T2> throwingPredicate2,
            Function3<T1, T2, ? super Throwable, ? extends RuntimeException> rethrow)
    {
```

### BoundedWildcard
Can generalize to `? super T2`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/Predicates2.java`
#### Snippet
```java
     */
    public static <T1, T2> Predicate2<T1, T2> throwing(
            ThrowingPredicate2<T1, T2> throwingPredicate2,
            Function3<T1, T2, ? super Throwable, ? extends RuntimeException> rethrow)
    {
```

### BoundedWildcard
Can generalize to `? super T1`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/Predicates2.java`
#### Snippet
```java
    public static <T1, T2> Predicate2<T1, T2> throwing(
            ThrowingPredicate2<T1, T2> throwingPredicate2,
            Function3<T1, T2, ? super Throwable, ? extends RuntimeException> rethrow)
    {
        return (one, two) ->
```

### BoundedWildcard
Can generalize to `? super T2`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/Predicates2.java`
#### Snippet
```java
    public static <T1, T2> Predicate2<T1, T2> throwing(
            ThrowingPredicate2<T1, T2> throwingPredicate2,
            Function3<T1, T2, ? super Throwable, ? extends RuntimeException> rethrow)
    {
        return (one, two) ->
```

### BoundedWildcard
Can generalize to `? super T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/Comparators.java`
#### Snippet
```java
        private final Comparator<T> notNullSafeComparator;

        private SafeNullsLowComparator(Comparator<T> newNotNullSafeComparator)
        {
            this.notNullSafeComparator = newNotNullSafeComparator;
```

### BoundedWildcard
Can generalize to `? super T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/Comparators.java`
#### Snippet
```java
        private final Comparator<T> notNullSafeComparator;

        private SafeNullsHighComparator(Comparator<T> newNotNullSafeComparator)
        {
            this.notNullSafeComparator = newNotNullSafeComparator;
```

### BoundedWildcard
Can generalize to `? super T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/Comparators.java`
#### Snippet
```java
        private final Comparator<T> comparator;

        private ReverseComparator(Comparator<T> comparator)
        {
            this.comparator = comparator;
```

### BoundedWildcard
Can generalize to `? super K`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/procedure/GroupByUniqueKeyProcedure.java`
#### Snippet
```java
    private final Function<? super T, ? extends K> keyFunction;

    public GroupByUniqueKeyProcedure(Map<K, T> newMap, Function<? super T, ? extends K> newKeyFunction)
    {
        this.map = newMap;
```

### BoundedWildcard
Can generalize to `? super T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/procedure/GroupByUniqueKeyProcedure.java`
#### Snippet
```java
    private final Function<? super T, ? extends K> keyFunction;

    public GroupByUniqueKeyProcedure(Map<K, T> newMap, Function<? super T, ? extends K> newKeyFunction)
    {
        this.map = newMap;
```

### BoundedWildcard
Can generalize to `? super K`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/procedure/MultimapKeyValuePutAllProcedure.java`
#### Snippet
```java
    private final Function<? super T, ? extends Iterable<V>> valueFunction;

    public MultimapKeyValuePutAllProcedure(MutableMultimap<K, V> mutableMultimap, Function<? super T, ? extends K> keyFunction, Function<? super T, ? extends Iterable<V>> valueFunction)
    {
        this.mutableMultimap = mutableMultimap;
```

### BoundedWildcard
Can generalize to `? super V`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/procedure/MultimapKeyValuePutAllProcedure.java`
#### Snippet
```java
    private final Function<? super T, ? extends Iterable<V>> valueFunction;

    public MultimapKeyValuePutAllProcedure(MutableMultimap<K, V> mutableMultimap, Function<? super T, ? extends K> keyFunction, Function<? super T, ? extends Iterable<V>> valueFunction)
    {
        this.mutableMultimap = mutableMultimap;
```

### BoundedWildcard
Can generalize to `? super T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/procedure/CounterProcedure.java`
#### Snippet
```java
    private final Procedure<T> procedure;

    public CounterProcedure(Procedure<T> procedure)
    {
        this.procedure = procedure;
```

### BoundedWildcard
Can generalize to `? super K`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/procedure/MultimapPutProcedure.java`
#### Snippet
```java

    public MultimapPutProcedure(
            MutableMultimap<K, V> multimap,
            Function<? super V, ? extends K> keyFunction)
    {
```

### BoundedWildcard
Can generalize to `? super V`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/procedure/MultimapPutProcedure.java`
#### Snippet
```java

    public MultimapPutProcedure(
            MutableMultimap<K, V> multimap,
            Function<? super V, ? extends K> keyFunction)
    {
```

### BoundedWildcard
Can generalize to `? super K`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/procedure/MultimapEachPutProcedure.java`
#### Snippet
```java

    public MultimapEachPutProcedure(
            MutableMultimap<K, V> multimap,
            Function<? super V, ? extends Iterable<K>> keyFunction)
    {
```

### BoundedWildcard
Can generalize to `? super V`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/procedure/MultimapEachPutProcedure.java`
#### Snippet
```java

    public MultimapEachPutProcedure(
            MutableMultimap<K, V> multimap,
            Function<? super V, ? extends Iterable<K>> keyFunction)
    {
```

### BoundedWildcard
Can generalize to `? super K`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/procedure/BiMapCollectProcedure.java`
#### Snippet
```java
    private final Function<? super T, ? extends V> valueFunction;

    public BiMapCollectProcedure(MutableBiMap<K, V> newMap, Function<? super T, ? extends K> newKeyFunction, Function<? super T, ? extends V> newValueFunction)
    {
        this.biMap = newMap;
```

### BoundedWildcard
Can generalize to `? super V`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/procedure/BiMapCollectProcedure.java`
#### Snippet
```java
    private final Function<? super T, ? extends V> valueFunction;

    public BiMapCollectProcedure(MutableBiMap<K, V> newMap, Function<? super T, ? extends K> newKeyFunction, Function<? super T, ? extends V> newValueFunction)
    {
        this.biMap = newMap;
```

### BoundedWildcard
Can generalize to `? super K`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/procedure/MapPutProcedure.java`
#### Snippet
```java
    private final Map<K, V> newMap;

    public MapPutProcedure(Map<K, V> newMap)
    {
        this.newMap = newMap;
```

### BoundedWildcard
Can generalize to `? super V`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/procedure/MapPutProcedure.java`
#### Snippet
```java
    private final Map<K, V> newMap;

    public MapPutProcedure(Map<K, V> newMap)
    {
        this.newMap = newMap;
```

### BoundedWildcard
Can generalize to `? super K`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/procedure/MutatingAggregationProcedure.java`
#### Snippet
```java

    public MutatingAggregationProcedure(
            MutableMapIterable<K, V> map,
            Function<? super T, ? extends K> groupBy,
            Function0<? extends V> zeroValueFactory,
```

### BoundedWildcard
Can generalize to `? super K`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/procedure/NonMutatingAggregationProcedure.java`
#### Snippet
```java

    public NonMutatingAggregationProcedure(
            MutableMapIterable<K, V> map,
            Function<? super T, ? extends K> groupBy,
            Function0<? extends V> zeroValueFactory,
```

### BoundedWildcard
Can generalize to `? super K`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/procedure/MapCollectProcedure.java`
#### Snippet
```java
    }

    public MapCollectProcedure(Map<K, V> newMap, Function<? super T, ? extends K> newKeyFunction, Function<? super T, ? extends V> newValueFunction)
    {
        this.map = newMap;
```

### BoundedWildcard
Can generalize to `? super V`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/procedure/MapCollectProcedure.java`
#### Snippet
```java
    }

    public MapCollectProcedure(Map<K, V> newMap, Function<? super T, ? extends K> newKeyFunction, Function<? super T, ? extends V> newValueFunction)
    {
        this.map = newMap;
```

### BoundedWildcard
Can generalize to `? super K`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/procedure/MultimapKeyValuePutProcedure.java`
#### Snippet
```java
    private final Function<? super T, ? extends V> valueFunction;

    public MultimapKeyValuePutProcedure(MutableMultimap<K, V> mutableMultimap, Function<? super T, ? extends K> keyFunction, Function<? super T, ? extends V> valueFunction)
    {
        this.mutableMultimap = mutableMultimap;
```

### BoundedWildcard
Can generalize to `? super V`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/procedure/MultimapKeyValuePutProcedure.java`
#### Snippet
```java
    private final Function<? super T, ? extends V> valueFunction;

    public MultimapKeyValuePutProcedure(MutableMultimap<K, V> mutableMultimap, Function<? super T, ? extends K> keyFunction, Function<? super T, ? extends V> valueFunction)
    {
        this.mutableMultimap = mutableMultimap;
```

### BoundedWildcard
Can generalize to `? super V`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/comparator/FunctionComparator.java`
#### Snippet
```java
    private final Comparator<V> comparator;

    public FunctionComparator(Function<? super T, ? extends V> function, Comparator<V> comparator)
    {
        this.function = function;
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/stack/immutable/ImmutableStackIterator.java`
#### Snippet
```java
    private ImmutableStack<T> immutableStack;

    ImmutableStackIterator(ImmutableStack<T> immutableStack)
    {
        this.immutableStack = immutableStack;
```

### BoundedWildcard
Can generalize to `? super T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/Predicates.java`
#### Snippet
```java
     */
    public static <T> Predicate<T> throwing(
            ThrowingPredicate<T> throwingPredicate,
            Function2<T, ? super Throwable, ? extends RuntimeException> rethrow)
    {
```

### BoundedWildcard
Can generalize to `? super T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/Predicates.java`
#### Snippet
```java
    public static <T> Predicate<T> throwing(
            ThrowingPredicate<T> throwingPredicate,
            Function2<T, ? super Throwable, ? extends RuntimeException> rethrow)
    {
        return each ->
```

### BoundedWildcard
Can generalize to `? super T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/Predicates.java`
#### Snippet
```java
        private final Predicate<T> predicate;

        private SynchronizedPredicate(Predicate<T> predicate)
        {
            this.predicate = predicate;
```

### BoundedWildcard
Can generalize to `? super T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/Predicates.java`
#### Snippet
```java
        private final ThrowingPredicate<T> throwingPredicate;

        private ThrowingPredicateAdapter(ThrowingPredicate<T> throwingPredicate)
        {
            this.throwingPredicate = throwingPredicate;
```

### BoundedWildcard
Can generalize to `? super T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/Predicates.java`
#### Snippet
```java
        private final Predicate<T> predicate;

        private NotPredicate(Predicate<T> newPredicate)
        {
            this.predicate = newPredicate;
```

### BoundedWildcard
Can generalize to `? super T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/Predicates.java`
#### Snippet
```java
        private final Predicate<T> predicate;

        private PredicateAdapter(Predicate<T> newPredicate)
        {
            this.predicate = newPredicate;
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/stack/immutable/ImmutableStackSerializationProxy.java`
#### Snippet
```java
    }

    protected ImmutableStackSerializationProxy(StackIterable<T> stack)
    {
        this.stack = stack;
```

### BoundedWildcard
Can generalize to `? extends S`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/stack/immutable/ImmutableNotEmptyStack.java`
#### Snippet
```java

    @Override
    public <S> ImmutableStack<S> selectInstancesOf(Class<S> clazz)
    {
        return Stacks.immutable.withAllReversed(this.asLazy().selectInstancesOf(clazz).toList());
```

### BoundedWildcard
Can generalize to `? extends S`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/stack/mutable/ArrayStack.java`
#### Snippet
```java

    @Override
    public <S> ArrayStack<S> selectInstancesOf(Class<S> clazz)
    {
        return ArrayStack.newStackFromTopToBottom(this.delegate.asReversed().selectInstancesOf(clazz).toList());
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/tuple/Tuples.java`
#### Snippet
```java
     * @since 11.0
     */
    public static <T> FixedSizeList<T> pairToFixedSizeList(Pair<T, T> pair)
    {
        return Lists.fixedSize.with(pair.getOne(), pair.getTwo());
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/tuple/Tuples.java`
#### Snippet
```java
     * @since 11.0
     */
    public static <T> FixedSizeList<T> pairToFixedSizeList(Pair<T, T> pair)
    {
        return Lists.fixedSize.with(pair.getOne(), pair.getTwo());
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/tuple/Tuples.java`
#### Snippet
```java
     * @since 11.0
     */
    public static <T> ImmutableList<T> pairToImmutableList(Pair<T, T> pair)
    {
        return Lists.immutable.with(pair.getOne(), pair.getTwo());
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/tuple/Tuples.java`
#### Snippet
```java
     * @since 11.0
     */
    public static <T> ImmutableList<T> pairToImmutableList(Pair<T, T> pair)
    {
        return Lists.immutable.with(pair.getOne(), pair.getTwo());
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/tuple/Tuples.java`
#### Snippet
```java
     * @since 11.0
     */
    public static <T> MutableList<T> pairToList(Pair<T, T> pair)
    {
        return Lists.mutable.with(pair.getOne(), pair.getTwo());
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/tuple/Tuples.java`
#### Snippet
```java
     * @since 11.0
     */
    public static <T> MutableList<T> pairToList(Pair<T, T> pair)
    {
        return Lists.mutable.with(pair.getOne(), pair.getTwo());
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/tuple/Tuples.java`
#### Snippet
```java
     * @since 11.0
     */
    public static <T> FixedSizeList<T> tripleToFixedSizeList(Triple<T, T, T> triple)
    {
        return Lists.fixedSize.with(triple.getOne(), triple.getTwo(), triple.getThree());
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/tuple/Tuples.java`
#### Snippet
```java
     * @since 11.0
     */
    public static <T> FixedSizeList<T> tripleToFixedSizeList(Triple<T, T, T> triple)
    {
        return Lists.fixedSize.with(triple.getOne(), triple.getTwo(), triple.getThree());
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/tuple/Tuples.java`
#### Snippet
```java
     * @since 11.0
     */
    public static <T> FixedSizeList<T> tripleToFixedSizeList(Triple<T, T, T> triple)
    {
        return Lists.fixedSize.with(triple.getOne(), triple.getTwo(), triple.getThree());
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/tuple/Tuples.java`
#### Snippet
```java
     * @since 11.0
     */
    public static <T> MutableList<T> tripleToList(Triple<T, T, T> triple)
    {
        return Lists.mutable.with(triple.getOne(), triple.getTwo(), triple.getThree());
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/tuple/Tuples.java`
#### Snippet
```java
     * @since 11.0
     */
    public static <T> MutableList<T> tripleToList(Triple<T, T, T> triple)
    {
        return Lists.mutable.with(triple.getOne(), triple.getTwo(), triple.getThree());
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/tuple/Tuples.java`
#### Snippet
```java
     * @since 11.0
     */
    public static <T> MutableList<T> tripleToList(Triple<T, T, T> triple)
    {
        return Lists.mutable.with(triple.getOne(), triple.getTwo(), triple.getThree());
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/tuple/Tuples.java`
#### Snippet
```java
     * @since 11.0
     */
    public static <T> ImmutableList<T> tripleToImmutableList(Triple<T, T, T> triple)
    {
        return Lists.immutable.with(triple.getOne(), triple.getTwo(), triple.getThree());
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/tuple/Tuples.java`
#### Snippet
```java
     * @since 11.0
     */
    public static <T> ImmutableList<T> tripleToImmutableList(Triple<T, T, T> triple)
    {
        return Lists.immutable.with(triple.getOne(), triple.getTwo(), triple.getThree());
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/tuple/Tuples.java`
#### Snippet
```java
     * @since 11.0
     */
    public static <T> ImmutableList<T> tripleToImmutableList(Triple<T, T, T> triple)
    {
        return Lists.immutable.with(triple.getOne(), triple.getTwo(), triple.getThree());
```

### BoundedWildcard
Can generalize to `? extends K`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/tuple/Tuples.java`
#### Snippet
```java
    }

    public static <K, V> Pair<K, V> pairFrom(Map.Entry<K, V> entry)
    {
        return Tuples.pair(entry.getKey(), entry.getValue());
```

### BoundedWildcard
Can generalize to `? extends V`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/tuple/Tuples.java`
#### Snippet
```java
    }

    public static <K, V> Pair<K, V> pairFrom(Map.Entry<K, V> entry)
    {
        return Tuples.pair(entry.getKey(), entry.getValue());
```

### BoundedWildcard
Can generalize to `? extends S`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/stack/immutable/ImmutableArrayStack.java`
#### Snippet
```java

    @Override
    public <S> ImmutableStack<S> selectInstancesOf(Class<S> clazz)
    {
        return ImmutableArrayStack.newStackFromTopToBottom(this.delegate.asReversed().selectInstancesOf(clazz).toList());
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/stack/immutable/ImmutableArrayStack.java`
#### Snippet
```java
        }

        protected ImmutableStackSerializationProxy(StackIterable<T> stack)
        {
            this.stack = stack;
```

### BoundedWildcard
Can generalize to `? super T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/Functions.java`
#### Snippet
```java
        private final ThrowingFunction<T, V> throwingFunction;

        private ThrowingFunctionAdapter(ThrowingFunction<T, V> throwingFunction)
        {
            this.throwingFunction = throwingFunction;
```

### BoundedWildcard
Can generalize to `? extends V`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/Functions.java`
#### Snippet
```java
        private final ThrowingFunction<T, V> throwingFunction;

        private ThrowingFunctionAdapter(ThrowingFunction<T, V> throwingFunction)
        {
            this.throwingFunction = throwingFunction;
```

### BoundedWildcard
Can generalize to `? super T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/Functions.java`
#### Snippet
```java
     */
    public static <T, V> Function<T, V> throwing(
            ThrowingFunction<T, V> throwingFunction,
            Function2<T, ? super Throwable, ? extends RuntimeException> rethrow)
    {
```

### BoundedWildcard
Can generalize to `? extends V`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/Functions.java`
#### Snippet
```java
     */
    public static <T, V> Function<T, V> throwing(
            ThrowingFunction<T, V> throwingFunction,
            Function2<T, ? super Throwable, ? extends RuntimeException> rethrow)
    {
```

### BoundedWildcard
Can generalize to `? super T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/Functions.java`
#### Snippet
```java
    public static <T, V> Function<T, V> throwing(
            ThrowingFunction<T, V> throwingFunction,
            Function2<T, ? super Throwable, ? extends RuntimeException> rethrow)
    {
        return each ->
```

### BoundedWildcard
Can generalize to `? super T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/Functions.java`
#### Snippet
```java
        private final Function<T, V> function;

        private SynchronizedFunction(Function<T, V> function)
        {
            this.function = function;
```

### BoundedWildcard
Can generalize to `? extends V`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/Functions.java`
#### Snippet
```java
        private final Function<T, V> function;

        private SynchronizedFunction(Function<T, V> function)
        {
            this.function = function;
```

### BoundedWildcard
Can generalize to `? extends T2`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/Functions.java`
#### Snippet
```java
        private final Function<? super T1, T2> function;

        private BindProcedure(Procedure<? super T2> delegate, Function<? super T1, T2> function)
        {
            this.delegate = delegate;
```

### BoundedWildcard
Can generalize to `? super T3`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/Functions.java`
#### Snippet
```java
        private final Function<? super T1, T2> function;

        private BindProcedure2(Procedure2<? super T2, T3> delegate, Function<? super T1, T2> function)
        {
            this.delegate = delegate;
```

### BoundedWildcard
Can generalize to `? extends T2`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/Functions.java`
#### Snippet
```java
        private final Function<? super T1, T2> function;

        private BindProcedure2(Procedure2<? super T2, T3> delegate, Function<? super T1, T2> function)
        {
            this.delegate = delegate;
```

### BoundedWildcard
Can generalize to `? extends V1`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/Functions.java`
#### Snippet
```java

    public static <T, V1, V2> Function<T, Pair<V1, V2>> pair(
            Function<? super T, V1> function1,
            Function<? super T, V2> function2)
    {
```

### BoundedWildcard
Can generalize to `? extends V2`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/Functions.java`
#### Snippet
```java
    public static <T, V1, V2> Function<T, Pair<V1, V2>> pair(
            Function<? super T, V1> function1,
            Function<? super T, V2> function2)
    {
        return t -> Tuples.pair(function1.valueOf(t), function2.valueOf(t));
```

### BoundedWildcard
Can generalize to `? super T1`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/Functions.java`
#### Snippet
```java
        private final Function<? super T2, T3> function2;

        private FunctionChain(Function<T1, T2> function1, Function<? super T2, T3> function2)
        {
            this.function1 = function1;
```

### BoundedWildcard
Can generalize to `? extends T2`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/Functions.java`
#### Snippet
```java
        private final Function<? super T2, T3> function2;

        private FunctionChain(Function<T1, T2> function1, Function<? super T2, T3> function2)
        {
            this.function1 = function1;
```

### BoundedWildcard
Can generalize to `? extends T3`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/Functions.java`
#### Snippet
```java
        private final Function<? super T2, T3> function2;

        private FunctionChain(Function<T1, T2> function1, Function<? super T2, T3> function2)
        {
            this.function1 = function1;
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/factory/Sets.java`
#### Snippet
```java
    }

    public static <T> MutableSet<MutableSet<T>> powerSet(Set<T> set)
    {
        MutableSet<MutableSet<T>> seed = UnifiedSet.newSetWith(UnifiedSet.newSet());
```

### BoundedWildcard
Can generalize to `? extends A`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/factory/Sets.java`
#### Snippet
```java
    }

    public static <A, B> LazyIterable<Pair<A, B>> cartesianProduct(Set<A> set1, Set<B> set2)
    {
        return Sets.cartesianProduct(set1, set2, Tuples::pair);
```

### BoundedWildcard
Can generalize to `? extends B`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/factory/Sets.java`
#### Snippet
```java
    }

    public static <A, B> LazyIterable<Pair<A, B>> cartesianProduct(Set<A> set1, Set<B> set2)
    {
        return Sets.cartesianProduct(set1, set2, Tuples::pair);
```

### BoundedWildcard
Can generalize to `? super Set`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/factory/Sets.java`
#### Snippet
```java
    private static <E, R extends Set<E>> R fillSet(
            R targetSet,
            Procedure2<Set<? extends E>, R> procedure,
            Set<? extends E>... sets)
    {
```

### BoundedWildcard
Can generalize to `? super R`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/factory/Sets.java`
#### Snippet
```java
    private static <E, R extends Set<E>> R fillSet(
            R targetSet,
            Procedure2<Set<? extends E>, R> procedure,
            Set<? extends E>... sets)
    {
```

### BoundedWildcard
Can generalize to `? super V`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/factory/Multimaps.java`
#### Snippet
```java
            }

            public <K, V> MutableSortedSetMultimap<K, V> with(Comparator<V> comparator, K key1, V value1, K key2, V value2)
            {
                TreeSortedSetMultimap<K, V> treeSortedSetMultimap = TreeSortedSetMultimap.newMultimap(comparator);
```

### BoundedWildcard
Can generalize to `? super V`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/factory/Multimaps.java`
#### Snippet
```java
            }

            public <K, V> MutableSortedSetMultimap<K, V> with(Comparator<V> comparator, K key1, V value1, K key2, V value2, K key3, V value3)
            {
                TreeSortedSetMultimap<K, V> treeSortedSetMultimap = TreeSortedSetMultimap.newMultimap(comparator);
```

### BoundedWildcard
Can generalize to `? super V`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/factory/Multimaps.java`
#### Snippet
```java
            }

            public <K, V> MutableSortedSetMultimap<K, V> with(Comparator<V> comparator, K key, V value)
            {
                TreeSortedSetMultimap<K, V> treeSortedSetMultimap = TreeSortedSetMultimap.newMultimap(comparator);
```

### BoundedWildcard
Can generalize to `? super V`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/factory/Multimaps.java`
#### Snippet
```java
            }

            public <K, V> MutableSortedSetMultimap<K, V> with(Comparator<V> comparator)
            {
                return TreeSortedSetMultimap.newMultimap(comparator);
```

### BoundedWildcard
Can generalize to `? extends A`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/LazyIterate.java`
#### Snippet
```java
     * @since 10.0
     */
    public static <A, B> LazyIterable<Pair<A, B>> cartesianProduct(Iterable<A> iterable1, Iterable<B> iterable2)
    {
        return LazyIterate.cartesianProduct(iterable1, iterable2, Tuples::pair);
```

### BoundedWildcard
Can generalize to `? extends B`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/LazyIterate.java`
#### Snippet
```java
     * @since 10.0
     */
    public static <A, B> LazyIterable<Pair<A, B>> cartesianProduct(Iterable<A> iterable1, Iterable<B> iterable2)
    {
        return LazyIterate.cartesianProduct(iterable1, iterable2, Tuples::pair);
```

### BoundedWildcard
Can generalize to `? super String`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/StringIterate.java`
#### Snippet
```java
     * {@link Procedure}.
     */
    public static void forEachTrimmedToken(String string, String separator, Procedure<String> procedure)
    {
        for (StringTokenizer stringTokenizer = new StringTokenizer(string, separator); stringTokenizer.hasMoreTokens(); )
```

### BoundedWildcard
Can generalize to `? super Character`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/StringIterate.java`
#### Snippet
```java
        private final MutableCollection<Character> characters;

        private AddLowercaseCharacterToCollection(MutableCollection<Character> characters)
        {
            this.characters = characters;
```

### BoundedWildcard
Can generalize to `? super String`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/StringIterate.java`
#### Snippet
```java
     * by calling the valueOfString method.
     */
    public static void forEachToken(String string, String separator, Procedure<String> procedure)
    {
        for (StringTokenizer stringTokenizer = new StringTokenizer(string, separator); stringTokenizer.hasMoreTokens(); )
```

### BoundedWildcard
Can generalize to `? super Character`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/StringIterate.java`
#### Snippet
```java
        private final MutableCollection<Character> characters;

        private AddUppercaseCharacterToCollection(MutableCollection<Character> characters)
        {
            this.characters = characters;
```

### BoundedWildcard
Can generalize to `? super String`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/StringIterate.java`
#### Snippet
```java
            String separator,
            String keyValueSeparator,
            Function<String, K> keyFunction,
            Function<String, V> valueFunction)
    {
```

### BoundedWildcard
Can generalize to `? extends K`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/StringIterate.java`
#### Snippet
```java
            String separator,
            String keyValueSeparator,
            Function<String, K> keyFunction,
            Function<String, V> valueFunction)
    {
```

### BoundedWildcard
Can generalize to `? super String`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/StringIterate.java`
#### Snippet
```java
            String keyValueSeparator,
            Function<String, K> keyFunction,
            Function<String, V> valueFunction)
    {
        MutableMap<K, V> map = Maps.mutable.empty();
```

### BoundedWildcard
Can generalize to `? extends V`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/StringIterate.java`
#### Snippet
```java
            String keyValueSeparator,
            Function<String, K> keyFunction,
            Function<String, V> valueFunction)
    {
        MutableMap<K, V> map = Maps.mutable.empty();
```

### BoundedWildcard
Can generalize to `? super String`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/StringIterate.java`
#### Snippet
```java
            String separator,
            R injectedValue,
            Function2<? super R, String, ? extends R> function)
    {
        R result = injectedValue;
```

### BoundedWildcard
Can generalize to `? super Character`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/StringIterate.java`
#### Snippet
```java
        private final MutableCollection<Character> characters;

        private AddCharacterToCollection(MutableCollection<Character> characters)
        {
            this.characters = characters;
```

### BoundedWildcard
Can generalize to `? extends BigInteger`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/ArrayIterate.java`
#### Snippet
```java
     * @since 6.0
     */
    public static <V, T> MutableMap<V, BigInteger> sumByBigInteger(T[] array, Function<? super T, ? extends V> groupBy, Function<? super T, BigInteger> function)
    {
        MutableMap<V, BigInteger> result = Maps.mutable.empty();
```

### BoundedWildcard
Can generalize to `? extends BigDecimal`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/ArrayIterate.java`
#### Snippet
```java
     * @since 6.0
     */
    public static <T> BigDecimal sumOfBigDecimal(T[] array, Function<? super T, BigDecimal> function)
    {
        BigDecimal result = BigDecimal.ZERO;
```

### BoundedWildcard
Can generalize to `? extends BigDecimal`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/ArrayIterate.java`
#### Snippet
```java
     * @since 6.0
     */
    public static <V, T> MutableMap<V, BigDecimal> sumByBigDecimal(T[] array, Function<? super T, ? extends V> groupBy, Function<? super T, BigDecimal> function)
    {
        MutableMap<V, BigDecimal> result = Maps.mutable.empty();
```

### BoundedWildcard
Can generalize to `? extends BigInteger`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/ArrayIterate.java`
#### Snippet
```java
     * @since 6.0
     */
    public static <T> BigInteger sumOfBigInteger(T[] array, Function<? super T, BigInteger> function)
    {
        BigInteger result = BigInteger.ZERO;
```

### BoundedWildcard
Can generalize to `? super T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/internal/InternalArrayIterate.java`
#### Snippet
```java
     * Implemented to avoid megamorphic call on castProcedure.
     */
    private static <T> void batchFastListCollectIf(T[] array, int start, int end, FastListCollectIfProcedure<T, ?> castProcedure)
    {
        for (int i = start; i < end; i++)
```

### BoundedWildcard
Can generalize to `? super T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/internal/InternalArrayIterate.java`
#### Snippet
```java
     * Implemented to avoid megamorphic call on castProcedure.
     */
    private static <T> void batchCount(T[] array, int start, int end, CountProcedure<T> castProcedure)
    {
        for (int i = start; i < end; i++)
```

### BoundedWildcard
Can generalize to `? super T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/internal/InternalArrayIterate.java`
#### Snippet
```java
     * Implemented to avoid megamorphic call on castProcedure.
     */
    private static <T> void batchReject(T[] array, int start, int end, FastListRejectProcedure<T> castProcedure)
    {
        for (int i = start; i < end; i++)
```

### BoundedWildcard
Can generalize to `? super T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/internal/InternalArrayIterate.java`
#### Snippet
```java
     * Implemented to avoid megamorphic call on castProcedure.
     */
    private static <T> void batchGroupBy(T[] array, int start, int end, MultimapPutProcedure<?, T> castProcedure)
    {
        for (int i = start; i < end; i++)
```

### BoundedWildcard
Can generalize to `? super T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/internal/InternalArrayIterate.java`
#### Snippet
```java
     * Implemented to avoid megamorphic call on castProcedure.
     */
    private static <T> void batchFastListCollect(T[] array, int start, int end, FastListCollectProcedure<T, ?> castProcedure)
    {
        for (int i = start; i < end; i++)
```

### BoundedWildcard
Can generalize to `? super T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/internal/InternalArrayIterate.java`
#### Snippet
```java

    public static <T> void appendString(
            ListIterable<T> iterable,
            T[] array,
            int size,
```

### BoundedWildcard
Can generalize to `? super T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/internal/InternalArrayIterate.java`
#### Snippet
```java
     * Implemented to avoid megamorphic call on castProcedure.
     */
    private static <T> void batchFastListSelect(T[] array, int start, int end, FastListSelectProcedure<T> castProcedure)
    {
        for (int i = start; i < end; i++)
```

### BoundedWildcard
Can generalize to `? extends R`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/internal/InternalArrayIterate.java`
#### Snippet
```java
     * @since 8.0
     */
    public static <R, T> R reduceInPlace(T[] items, int size, Supplier<R> supplier, BiConsumer<R, ? super T> accumulator)
    {
        R mutableResult = supplier.get();
```

### BoundedWildcard
Can generalize to `? super R`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/internal/InternalArrayIterate.java`
#### Snippet
```java
     * @since 8.0
     */
    public static <R, T> R reduceInPlace(T[] items, int size, Supplier<R> supplier, BiConsumer<R, ? super T> accumulator)
    {
        R mutableResult = supplier.get();
```

### BoundedWildcard
Can generalize to `? extends A`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/internal/SetIterables.java`
#### Snippet
```java
    }

    public static <A, B, C> LazyIterable<C> cartesianProduct(SetIterable<A> set1, SetIterable<B> set2, Function2<A, B, C> function)
    {
        return LazyIterate.cartesianProduct(set1, set2, function);
```

### BoundedWildcard
Can generalize to `? extends B`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/internal/SetIterables.java`
#### Snippet
```java
    }

    public static <A, B, C> LazyIterable<C> cartesianProduct(SetIterable<A> set1, SetIterable<B> set2, Function2<A, B, C> function)
    {
        return LazyIterate.cartesianProduct(set1, set2, function);
```

### BoundedWildcard
Can generalize to `? super A`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/internal/SetIterables.java`
#### Snippet
```java
    }

    public static <A, B, C> LazyIterable<C> cartesianProduct(SetIterable<A> set1, SetIterable<B> set2, Function2<A, B, C> function)
    {
        return LazyIterate.cartesianProduct(set1, set2, function);
```

### BoundedWildcard
Can generalize to `? super B`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/internal/SetIterables.java`
#### Snippet
```java
    }

    public static <A, B, C> LazyIterable<C> cartesianProduct(SetIterable<A> set1, SetIterable<B> set2, Function2<A, B, C> function)
    {
        return LazyIterate.cartesianProduct(set1, set2, function);
```

### BoundedWildcard
Can generalize to `? extends C`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/internal/SetIterables.java`
#### Snippet
```java
    }

    public static <A, B, C> LazyIterable<C> cartesianProduct(SetIterable<A> set1, SetIterable<B> set2, Function2<A, B, C> function)
    {
        return LazyIterate.cartesianProduct(set1, set2, function);
```

### BoundedWildcard
Can generalize to `? extends A`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/internal/SetIterables.java`
#### Snippet
```java
    }

    public static <A, B> LazyIterable<Pair<A, B>> cartesianProduct(SetIterable<A> set1, SetIterable<B> set2)
    {
        return SetIterables.cartesianProduct(set1, set2, Tuples::pair);
```

### BoundedWildcard
Can generalize to `? extends B`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/internal/SetIterables.java`
#### Snippet
```java
    }

    public static <A, B> LazyIterable<Pair<A, B>> cartesianProduct(SetIterable<A> set1, SetIterable<B> set2)
    {
        return SetIterables.cartesianProduct(set1, set2, Tuples::pair);
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/internal/SetIterables.java`
#### Snippet
```java
    }

    private static <T> MutableSet<MutableSet<T>> powerSetWithSeed(Set<T> set, MutableSet<MutableSet<T>> seed)
    {
        return Iterate.injectInto(seed, set, (accumulator, element) -> SetIterables.union(accumulator, accumulator.collect(innerSet -> innerSet.clone().with(element))));
```

### BoundedWildcard
Can generalize to `? extends R`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/multimap/ImmutableMultimapSerializationProxy.java`
#### Snippet
```java
    }

    protected ImmutableMultimapSerializationProxy(ImmutableMap<K, R> immutableMap)
    {
        this.mapToWrite = immutableMap;
```

### BoundedWildcard
Can generalize to `? extends Pair`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/multimap/AbstractMultimap.java`
#### Snippet
```java

    @Override
    public <K2, V2, R extends MutableMultimap<K2, V2>> R collectKeysValues(Function2<? super K, ? super V, Pair<K2, V2>> function, R target)
    {
        this.getMap().forEachKeyValue((key, collection) -> collection.each(value -> target.add(function.value(key, value))));
```

### BoundedWildcard
Can generalize to `? extends Pair`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/multimap/AbstractMutableMultimap.java`
#### Snippet
```java
     * @param inputIterable the mappings to initialize the multimap.
     */
    protected AbstractMutableMultimap(Iterable<Pair<K, V>> inputIterable)
    {
        this();
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/internal/IteratorIterate.java`
#### Snippet
```java
     * @see Iterate#chunk(Iterable, int)
     */
    public static <T> RichIterable<RichIterable<T>> chunk(Iterator<T> iterator, int size)
    {
        if (size <= 0)
```

### BoundedWildcard
Can generalize to `? extends BigDecimal`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/internal/IteratorIterate.java`
#### Snippet
```java
    }

    public static <T> BigDecimal sumOfBigDecimal(Iterator<T> iterator, Function<? super T, BigDecimal> function)
    {
        BigDecimal result = BigDecimal.ZERO;
```

### BoundedWildcard
Can generalize to `? extends BigDecimal`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/internal/IteratorIterate.java`
#### Snippet
```java
            Iterator<T> iterator,
            Function<? super T, ? extends V> groupBy,
            Function<? super T, BigDecimal> function)
    {
        MutableMap<V, BigDecimal> result = Maps.mutable.empty();
```

### BoundedWildcard
Can generalize to `? extends BigInteger`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/internal/IteratorIterate.java`
#### Snippet
```java
    }

    public static <T> BigInteger sumOfBigInteger(Iterator<T> iterator, Function<? super T, BigInteger> function)
    {
        BigInteger result = BigInteger.ZERO;
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/internal/IteratorIterate.java`
#### Snippet
```java
     */
    public static <T, P> PartitionMutableList<T> partitionWith(
            Iterator<T> iterator,
            Predicate2<? super T, ? super P> predicate,
            P parameter)
```

### BoundedWildcard
Can generalize to `? extends BigInteger`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/internal/IteratorIterate.java`
#### Snippet
```java
            Iterator<T> iterator,
            Function<? super T, ? extends V> groupBy,
            Function<? super T, BigInteger> function)
    {
        MutableMap<V, BigInteger> result = Maps.mutable.empty();
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/internal/IteratorIterate.java`
#### Snippet
```java
     * @since 7.0.
     */
    public static <T> MutableList<T> distinct(Iterator<T> iterator, HashingStrategy<? super T> hashingStrategy)
    {
        Set<T> seenSoFar = UnifiedSetWithHashingStrategy.newSet(hashingStrategy);
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/internal/IteratorIterate.java`
#### Snippet
```java
     * @see Iterate#detectWithOptional(Iterable, Predicate2, Object)
     */
    public static <T, P> Optional<T> detectWithOptional(Iterator<T> iterator, Predicate2<? super T, ? super P> predicate, P parameter)
    {
        while (iterator.hasNext())
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/internal/IteratorIterate.java`
#### Snippet
```java
     * @see Iterate#detectOptional(Iterable, Predicate)
     */
    public static <T> Optional<T> detectOptional(Iterator<T> iterator, Predicate<? super T> predicate)
    {
        while (iterator.hasNext())
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/internal/IteratorIterate.java`
#### Snippet
```java
     * @see Iterate#partition(Iterable, Predicate)
     */
    public static <T> PartitionMutableList<T> partition(Iterator<T> iterator, Predicate<? super T> predicate)
    {
        PartitionMutableList<T> result = new PartitionFastList<>();
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/internal/IteratorIterate.java`
#### Snippet
```java
     */
    public static <T, P> Twin<MutableList<T>> selectAndRejectWith(
            Iterator<T> iterator,
            Predicate2<? super T, ? super P> predicate,
            P parameter)
```

### BoundedWildcard
Can generalize to `? extends V`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/multimap/bag/strategy/HashBagMultimapWithHashingStrategy.java`
#### Snippet
```java
    }

    public HashBagMultimapWithHashingStrategy(HashBagMultimapWithHashingStrategy<K, V> multimap)
    {
        this(multimap.hashingStrategy, multimap);
```

### BoundedWildcard
Can generalize to `? extends Pair`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/multimap/bag/strategy/HashBagMultimapWithHashingStrategy.java`
#### Snippet
```java
    }

    public HashBagMultimapWithHashingStrategy(HashingStrategy<? super K> hashingStrategy, Iterable<Pair<K, V>> inputIterable)
    {
        this(hashingStrategy);
```

### BoundedWildcard
Can generalize to `? extends Pair`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/multimap/set/strategy/UnifiedSetWithHashingStrategyMultimap.java`
#### Snippet
```java
    }

    public UnifiedSetWithHashingStrategyMultimap(HashingStrategy<? super V> hashingStrategy, Iterable<Pair<K, V>> inputIterable)
    {
        this.hashingStrategy = hashingStrategy;
```

### BoundedWildcard
Can generalize to `? extends K`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/multimap/set/strategy/UnifiedSetWithHashingStrategyMultimap.java`
#### Snippet
```java
    }

    public UnifiedSetWithHashingStrategyMultimap(UnifiedSetWithHashingStrategyMultimap<K, V> multimap)
    {
        this(multimap.hashingStrategy, multimap);
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/parallel/Combiner.java`
#### Snippet
```java
public interface Combiner<T> extends Serializable
{
    default void combineAll(Iterable<T> thingsToCombine)
    {
        Iterate.forEach(thingsToCombine, this::combineOne);
```

### BoundedWildcard
Can generalize to `? super BT`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/parallel/ArrayProcedureFJTaskRunner.java`
#### Snippet
```java
    private final int taskCount;

    public ArrayProcedureFJTaskRunner(Combiner<BT> newCombiner, int newTaskCount)
    {
        this.combiner = newCombiner;
```

### BoundedWildcard
Can generalize to `? extends BT`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/parallel/ArrayProcedureFJTaskRunner.java`
#### Snippet
```java
    }

    public void taskCompleted(ArrayProcedureFJTask<T, BT> task)
    {
        if (this.combiner.useCombineOne())
```

### BoundedWildcard
Can generalize to `? extends V`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/parallel/CollectIfProcedureFactory.java`
#### Snippet
```java

    public CollectIfProcedureFactory(
            Function<? super T, V> function,
            Predicate<? super T> predicate,
            int newTaskSize)
```

### BoundedWildcard
Can generalize to `? super BT`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/parallel/BatchIterableProcedureFJTaskRunner.java`
#### Snippet
```java
    private final CountDownLatch latch;

    public BatchIterableProcedureFJTaskRunner(Combiner<BT> newCombiner, int taskCount)
    {
        this.combiner = newCombiner;
```

### BoundedWildcard
Can generalize to `? extends BT`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/parallel/BatchIterableProcedureFJTaskRunner.java`
#### Snippet
```java
    }

    public void taskCompleted(BatchIterableProcedureFJTask<T, BT> task)
    {
        if (this.combiner.useCombineOne())
```

### BoundedWildcard
Can generalize to `? extends V`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/parallel/FastListCollectIfProcedureFactory.java`
#### Snippet
```java

    public FastListCollectIfProcedureFactory(
            Function<? super T, V> function,
            Predicate<? super T> predicate,
            int newTaskSize)
```

### BoundedWildcard
Can generalize to `? extends BT`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/parallel/ProcedureFJTaskRunner.java`
#### Snippet
```java
    }

    public void taskCompleted(ProcedureFJTask<T, BT> task)
    {
        if (this.combiner.useCombineOne())
```

### BoundedWildcard
Can generalize to `? super BT`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/parallel/ProcedureFJTaskRunner.java`
#### Snippet
```java
    private final CountDownLatch latch;

    public ProcedureFJTaskRunner(Combiner<BT> newCombiner, int taskCount)
    {
        this.combiner = newCombiner;
```

### BoundedWildcard
Can generalize to `? super T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/ArrayListIterate.java`
#### Snippet
```java
    }

    public static <T> void toArray(ArrayList<T> list, T[] target, int startIndex, int sourceSize)
    {
        if (ArrayListIterate.canAccessInternalArray(list))
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/ArrayListIterate.java`
#### Snippet
```java
     */
    public static <T, IV> T detectWithIfNone(
            ArrayList<T> list,
            Predicate2<? super T, ? super IV> predicate,
            IV injectedValue,
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/ArrayListIterate.java`
#### Snippet
```java
     * @see Iterate#detectIfNone(Iterable, Predicate, Object)
     */
    public static <T> T detectIfNone(ArrayList<T> list, Predicate<? super T> predicate, T ifNone)
    {
        T result = ArrayListIterate.detect(list, predicate);
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/ArrayListIterate.java`
#### Snippet
```java
     * @since 7.0.
     */
    public static <T> ArrayList<T> distinct(ArrayList<T> list, HashingStrategy<? super T> hashingStrategy)
    {
        int size = list.size();
```

### BoundedWildcard
Can generalize to `? extends V`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/parallel/CollectProcedureFactory.java`
#### Snippet
```java
    private final Function<? super T, V> function;

    public CollectProcedureFactory(Function<? super T, V> function, int newTaskSize)
    {
        this.collectionSize = newTaskSize;
```

### BoundedWildcard
Can generalize to `? extends V`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/parallel/FastListCollectProcedureFactory.java`
#### Snippet
```java
    private final Function<? super T, V> function;

    public FastListCollectProcedureFactory(Function<? super T, V> function, int newTaskSize)
    {
        this.collectionSize = newTaskSize;
```

### BoundedWildcard
Can generalize to `? super BT`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/parallel/ObjectIntProcedureFJTaskRunner.java`
#### Snippet
```java
    }

    ObjectIntProcedureFJTaskRunner(Combiner<BT> newCombiner, int taskCount, BlockingQueue<BT> queue, CountDownLatch latch)
    {
        this.combiner = newCombiner;
```

### BoundedWildcard
Can generalize to `? extends BT`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/parallel/ObjectIntProcedureFJTaskRunner.java`
#### Snippet
```java
    }

    public void taskCompleted(ObjectIntProcedureFJTask<T, BT> task)
    {
        if (this.combiner.useCombineOne())
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/internal/RandomAccessListIterate.java`
#### Snippet
```java
    }

    public static <T> MutableList<T> dropWhile(List<T> list, Predicate<? super T> predicate)
    {
        MutableList<T> result = FastList.newList();
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/internal/RandomAccessListIterate.java`
#### Snippet
```java
    }

    public static <T, P> Optional<T> detectWithOptional(List<T> list, Predicate2<? super T, ? super P> predicate, P parameter)
    {
        int size = list.size();
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/internal/RandomAccessListIterate.java`
#### Snippet
```java
    }

    public static <T> void toArray(List<T> list, T[] target, int startIndex, int sourceSize)
    {
        for (int i = 0; i < sourceSize; i++)
```

### BoundedWildcard
Can generalize to `? extends BigInteger`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/internal/RandomAccessListIterate.java`
#### Snippet
```java
            List<T> list,
            Function<? super T, ? extends V> groupBy,
            Function<? super T, BigInteger> function)
    {
        MutableMap<V, BigInteger> result = Maps.mutable.empty();
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/internal/RandomAccessListIterate.java`
#### Snippet
```java
    }

    public static <T> PartitionMutableList<T> partitionWhile(List<T> list, Predicate<? super T> predicate)
    {
        PartitionMutableList<T> result = new PartitionFastList<>();
```

### BoundedWildcard
Can generalize to `? extends BigDecimal`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/internal/RandomAccessListIterate.java`
#### Snippet
```java
    }

    public static <T> BigDecimal sumOfBigDecimal(List<T> list, Function<? super T, BigDecimal> function)
    {
        BigDecimal result = BigDecimal.ZERO;
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/internal/RandomAccessListIterate.java`
#### Snippet
```java
    }

    public static <T> Optional<T> detectOptional(List<T> list, Predicate<? super T> predicate)
    {
        int size = list.size();
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/internal/RandomAccessListIterate.java`
#### Snippet
```java
    }

    public static <T> MutableList<T> takeWhile(List<T> list, Predicate<? super T> predicate)
    {
        MutableList<T> result = FastList.newList();
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/internal/RandomAccessListIterate.java`
#### Snippet
```java
    }

    public static <T> PartitionMutableList<T> partition(List<T> list, Predicate<? super T> predicate)
    {
        PartitionMutableList<T> partitionMutableList = new PartitionFastList<>();
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/internal/RandomAccessListIterate.java`
#### Snippet
```java

    public static <T, IV> Twin<MutableList<T>> selectAndRejectWith(
            List<T> list,
            Predicate2<? super T, ? super IV> predicate,
            IV injectedValue)
```

### BoundedWildcard
Can generalize to `? extends BigDecimal`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/internal/RandomAccessListIterate.java`
#### Snippet
```java
            List<T> list,
            Function<? super T, ? extends V> groupBy,
            Function<? super T, BigDecimal> function)
    {
        MutableMap<V, BigDecimal> result = Maps.mutable.empty();
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/internal/RandomAccessListIterate.java`
#### Snippet
```java
     * @since 7.0.
     */
    public static <T> MutableList<T> distinct(List<T> list, HashingStrategy<? super T> hashingStrategy)
    {
        MutableSet<T> seenSoFar = UnifiedSetWithHashingStrategy.newSet(hashingStrategy);
```

### BoundedWildcard
Can generalize to `? extends BigInteger`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/internal/RandomAccessListIterate.java`
#### Snippet
```java
    }

    public static <T> BigInteger sumOfBigInteger(List<T> list, Function<? super T, BigInteger> function)
    {
        BigInteger result = BigInteger.ZERO;
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/internal/RandomAccessListIterate.java`
#### Snippet
```java
    }

    public static <T, P> PartitionMutableList<T> partitionWith(List<T> list, Predicate2<? super T, ? super P> predicate, P parameter)
    {
        PartitionMutableList<T> partitionMutableList = new PartitionFastList<>();
```

### BoundedWildcard
Can generalize to `? extends E`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/collection/mutable/CollectionAdapter.java`
#### Snippet
```java
    }

    public static <E> MutableList<E> wrapList(Iterable<E> iterable)
    {
        if (iterable instanceof MutableList)
```

### BoundedWildcard
Can generalize to `? extends E`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/collection/mutable/CollectionAdapter.java`
#### Snippet
```java
    }

    public static <E> MutableSet<E> wrapSet(Iterable<E> iterable)
    {
        if (iterable instanceof MutableSet)
```

### BoundedWildcard
Can generalize to `? extends V`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/MapIterate.java`
#### Snippet
```java
    }

    public static <K, V> MutableSortedSetMultimap<V, K> flip(SortedMapIterable<K, V> iMap)
    {
        MutableSortedSetMultimap<V, K> result = new TreeSortedSetMultimap<>(iMap.comparator());
```

### BoundedWildcard
Can generalize to `? extends K`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/MapIterate.java`
#### Snippet
```java
     * Adds all the <em>keys</em> from map to the specified targetCollection.
     */
    public static <K, V> Collection<K> addAllKeysTo(Map<K, V> map, Collection<K> targetCollection)
    {
        MapIterate.forEachKey(map, CollectionAddProcedure.on(targetCollection));
```

### BoundedWildcard
Can generalize to `? extends K`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/MapIterate.java`
#### Snippet
```java
     * and return the results as a List.
     */
    public static <K, V> MutableList<Pair<K, V>> toListOfPairs(Map<K, V> map)
    {
        MutableList<Pair<K, V>> pairs = Lists.mutable.withInitialCapacity(map.size());
```

### BoundedWildcard
Can generalize to `? extends V`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/MapIterate.java`
#### Snippet
```java
     * and return the results as a List.
     */
    public static <K, V> MutableList<Pair<K, V>> toListOfPairs(Map<K, V> map)
    {
        MutableList<Pair<K, V>> pairs = Lists.mutable.withInitialCapacity(map.size());
```

### BoundedWildcard
Can generalize to `? extends K`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/MapIterate.java`
#### Snippet
```java
     * The result map is returned containing all entries in the source map that evaluated to true.
     */
    public static <K, V> MutableMap<K, V> selectMapOnKey(Map<K, V> map, Predicate<? super K> predicate)
    {
        MutableMap<K, V> resultMap = Maps.mutable.empty();
```

### BoundedWildcard
Can generalize to `? extends V`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/MapIterate.java`
#### Snippet
```java
     * The result map is returned containing all entries in the source map that evaluated to true.
     */
    public static <K, V> MutableMap<K, V> selectMapOnKey(Map<K, V> map, Predicate<? super K> predicate)
    {
        MutableMap<K, V> resultMap = Maps.mutable.empty();
```

### BoundedWildcard
Can generalize to `? extends Pair`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/MapIterate.java`
#### Snippet
```java
    public static <K1, V1, K2, V2, R extends Map<K2, V2>> R collect(
            Map<K1, V1> map,
            Function2<? super K1, ? super V1, Pair<K2, V2>> function,
            R target)
    {
```

### BoundedWildcard
Can generalize to `? extends K`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/MapIterate.java`
#### Snippet
```java
     * The result map is returned containing all entries in the source map that evaluated to true.
     */
    public static <K, V> MutableMap<K, V> selectMapOnValue(Map<K, V> map, Predicate<? super V> predicate)
    {
        MutableMap<K, V> resultMap = Maps.mutable.empty();
```

### BoundedWildcard
Can generalize to `? extends V`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/MapIterate.java`
#### Snippet
```java
     * The result map is returned containing all entries in the source map that evaluated to true.
     */
    public static <K, V> MutableMap<K, V> selectMapOnValue(Map<K, V> map, Predicate<? super V> predicate)
    {
        MutableMap<K, V> resultMap = Maps.mutable.empty();
```

### BoundedWildcard
Can generalize to `? extends K`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/MapIterate.java`
#### Snippet
```java
     * in that the last entry applied wins (the order of application is undefined).
     */
    public static <K, V> MutableMap<V, K> reverseMapping(Map<K, V> map)
    {
        MutableMap<V, K> reverseMap = UnifiedMap.newMap(map.size());
```

### BoundedWildcard
Can generalize to `? extends V`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/MapIterate.java`
#### Snippet
```java
     * in that the last entry applied wins (the order of application is undefined).
     */
    public static <K, V> MutableMap<V, K> reverseMapping(Map<K, V> map)
    {
        MutableMap<V, K> reverseMap = UnifiedMap.newMap(map.size());
```

### BoundedWildcard
Can generalize to `? extends V`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/MapIterate.java`
#### Snippet
```java
     * Adds all the <em>values</em> from map to the specified targetCollection.
     */
    public static <K, V> Collection<V> addAllValuesTo(Map<K, V> map, Collection<V> targetCollection)
    {
        MapIterate.forEachValue(map, CollectionAddProcedure.on(targetCollection));
```

### BoundedWildcard
Can generalize to `? extends K`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/MapIterate.java`
#### Snippet
```java
     * @see MapIterable#flipUniqueValues()
     */
    public static <K, V> MutableMap<V, K> flipUniqueValues(MapIterable<K, V> mapIterable)
    {
        MutableMap<V, K> result = Maps.mutable.empty();
```

### BoundedWildcard
Can generalize to `? extends V`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/MapIterate.java`
#### Snippet
```java
     * @see MapIterable#flipUniqueValues()
     */
    public static <K, V> MutableMap<V, K> flipUniqueValues(MapIterable<K, V> mapIterable)
    {
        MutableMap<V, K> result = Maps.mutable.empty();
```

### BoundedWildcard
Can generalize to `? extends K`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/MapIterate.java`
#### Snippet
```java
    }

    public static <K, V> MutableSetMultimap<V, K> flip(MapIterable<K, V> iMap)
    {
        MutableSetMultimap<V, K> result = Multimaps.mutable.set.with();
```

### BoundedWildcard
Can generalize to `? extends V`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/MapIterate.java`
#### Snippet
```java
    }

    public static <K, V> MutableSetMultimap<V, K> flip(MapIterable<K, V> iMap)
    {
        MutableSetMultimap<V, K> result = Multimaps.mutable.set.with();
```

### BoundedWildcard
Can generalize to `? extends Pair`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/MapIterate.java`
#### Snippet
```java
    public static <K1, V1, K2, V2> MutableMap<K2, V2> collectIf(
            Map<K1, V1> map,
            Function2<? super K1, ? super V1, Pair<K2, V2>> function,
            Predicate2<? super K1, ? super V1> predicate,
            Map<K2, V2> target)
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/ListIterate.java`
#### Snippet
```java
    }

    public static <V, T> MutableMap<V, BigDecimal> sumByBigDecimal(List<T> list, Function<T, V> groupBy, Function<? super T, BigDecimal> function)
    {
        if (list instanceof RandomAccess)
```

### BoundedWildcard
Can generalize to `? super T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/ListIterate.java`
#### Snippet
```java
    }

    public static <V, T> MutableMap<V, BigDecimal> sumByBigDecimal(List<T> list, Function<T, V> groupBy, Function<? super T, BigDecimal> function)
    {
        if (list instanceof RandomAccess)
```

### BoundedWildcard
Can generalize to `? extends V`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/ListIterate.java`
#### Snippet
```java
    }

    public static <V, T> MutableMap<V, BigDecimal> sumByBigDecimal(List<T> list, Function<T, V> groupBy, Function<? super T, BigDecimal> function)
    {
        if (list instanceof RandomAccess)
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/ListIterate.java`
#### Snippet
```java
    }

    public static <V, T> ObjectDoubleMap<V> sumByFloat(List<T> list, Function<T, V> groupBy, FloatFunction<? super T> function)
    {
        if (list instanceof RandomAccess)
```

### BoundedWildcard
Can generalize to `? super T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/ListIterate.java`
#### Snippet
```java
    }

    public static <V, T> ObjectDoubleMap<V> sumByFloat(List<T> list, Function<T, V> groupBy, FloatFunction<? super T> function)
    {
        if (list instanceof RandomAccess)
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/ListIterate.java`
#### Snippet
```java
    }

    public static <V, T> ObjectDoubleMap<V> sumByDouble(List<T> list, Function<T, V> groupBy, DoubleFunction<? super T> function)
    {
        if (list instanceof RandomAccess)
```

### BoundedWildcard
Can generalize to `? super T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/ListIterate.java`
#### Snippet
```java
    }

    public static <V, T> ObjectDoubleMap<V> sumByDouble(List<T> list, Function<T, V> groupBy, DoubleFunction<? super T> function)
    {
        if (list instanceof RandomAccess)
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/ListIterate.java`
#### Snippet
```java
    }

    public static <V, T> ObjectLongMap<V> sumByInt(List<T> list, Function<T, V> groupBy, IntFunction<? super T> function)
    {
        if (list instanceof RandomAccess)
```

### BoundedWildcard
Can generalize to `? super T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/ListIterate.java`
#### Snippet
```java
    }

    public static <V, T> ObjectLongMap<V> sumByInt(List<T> list, Function<T, V> groupBy, IntFunction<? super T> function)
    {
        if (list instanceof RandomAccess)
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/ListIterate.java`
#### Snippet
```java
    }

    public static <V, T> MutableMap<V, BigInteger> sumByBigInteger(List<T> list, Function<T, V> groupBy, Function<? super T, BigInteger> function)
    {
        if (list instanceof RandomAccess)
```

### BoundedWildcard
Can generalize to `? super T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/ListIterate.java`
#### Snippet
```java
    }

    public static <V, T> MutableMap<V, BigInteger> sumByBigInteger(List<T> list, Function<T, V> groupBy, Function<? super T, BigInteger> function)
    {
        if (list instanceof RandomAccess)
```

### BoundedWildcard
Can generalize to `? extends V`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/ListIterate.java`
#### Snippet
```java
    }

    public static <V, T> MutableMap<V, BigInteger> sumByBigInteger(List<T> list, Function<T, V> groupBy, Function<? super T, BigInteger> function)
    {
        if (list instanceof RandomAccess)
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/ListIterate.java`
#### Snippet
```java
    }

    public static <V, T> ObjectLongMap<V> sumByLong(List<T> list, Function<T, V> groupBy, LongFunction<? super T> function)
    {
        if (list instanceof RandomAccess)
```

### BoundedWildcard
Can generalize to `? super T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/ListIterate.java`
#### Snippet
```java
    }

    public static <V, T> ObjectLongMap<V> sumByLong(List<T> list, Function<T, V> groupBy, LongFunction<? super T> function)
    {
        if (list instanceof RandomAccess)
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/ListIterate.java`
#### Snippet
```java
     * @see Iterate#detectWithIfNone(Iterable, Predicate2, Object, Object)
     */
    public static <T, IV> T detectWithIfNone(List<T> list, Predicate2<? super T, ? super IV> predicate, IV injectedValue, T ifNone)
    {
        T result = ListIterate.detectWith(list, predicate, injectedValue);
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/ListIterate.java`
#### Snippet
```java
     * @see Iterate#detectIfNone(Iterable, Predicate, Object)
     */
    public static <T> T detectIfNone(List<T> list, Predicate<? super T> predicate, T ifNone)
    {
        T result = ListIterate.detect(list, predicate);
```

### BoundedWildcard
Can generalize to `? super V`
in `eclipse-collections-api/src/main/java/org/eclipse/collections/api/block/comparator/FunctionComparator.java`
#### Snippet
```java
    private final SerializableComparator<V> comparator;

    public FunctionComparator(Function<? super T, ? extends V> function, SerializableComparator<V> comparator)
    {
        this.function = function;
```

### BoundedWildcard
Can generalize to `? super T`
in `eclipse-collections-api/src/main/java/org/eclipse/collections/api/block/factory/SerializableComparators.java`
#### Snippet
```java
        private final SerializableComparator<T> comparator;

        private ReverseComparator(SerializableComparator<T> comparator)
        {
            this.comparator = comparator;
```

### BoundedWildcard
Can generalize to `? extends BigDecimal`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/collector/Collectors2.java`
#### Snippet
```java
    public static <T, V> Collector<T, ?, MutableMap<V, BigDecimal>> sumByBigDecimal(
            Function<? super T, ? extends V> groupBy,
            Function<? super T, BigDecimal> function)
    {
        return Collector.of(
```

### BoundedWildcard
Can generalize to `? extends BigDecimal`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/collector/Collectors2.java`
#### Snippet
```java
     * @since 8.1
     */
    public static <T> Collector<T, ?, BigDecimal> summingBigDecimal(Function<? super T, BigDecimal> function)
    {
        return Collectors.reducing(BigDecimal.ZERO, function, BigDecimal::add);
```

### BoundedWildcard
Can generalize to `? extends BigInteger`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/collector/Collectors2.java`
#### Snippet
```java
    public static <T, V> Collector<T, ?, MutableMap<V, BigInteger>> sumByBigInteger(
            Function<? super T, ? extends V> groupBy,
            Function<? super T, BigInteger> function)
    {
        return Collector.of(
```

### BoundedWildcard
Can generalize to `? extends BigInteger`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/collector/Collectors2.java`
#### Snippet
```java
     * @since 8.1
     */
    public static <T> Collector<T, ?, BigInteger> summingBigInteger(Function<? super T, BigInteger> function)
    {
        return Collectors.reducing(BigInteger.ZERO, function, BigInteger::add);
```

### BoundedWildcard
Can generalize to `? extends BigDecimal`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/collector/Collectors2.java`
#### Snippet
```java
     * @since 8.1
     */
    public static <T> Collector<T, ?, BigDecimalSummaryStatistics> summarizingBigDecimal(Function<? super T, BigDecimal> function)
    {
        return Collector.of(
```

### BoundedWildcard
Can generalize to `? extends BigInteger`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/collector/Collectors2.java`
#### Snippet
```java
     * @since 8.1
     */
    public static <T> Collector<T, ?, BigIntegerSummaryStatistics> summarizingBigInteger(Function<? super T, BigInteger> function)
    {
        return Collector.of(
```

### BoundedWildcard
Can generalize to `? extends PT`
in `eclipse-collections-forkjoin/src/main/java/org/eclipse/collections/impl/forkjoin/FJBatchIterableProcedureTask.java`
#### Snippet
```java
    public FJBatchIterableProcedureTask(
            FJBatchIterableProcedureRunner<T, PT> newFJTaskRunner,
            ProcedureFactory<PT> newProcedureFactory, BatchIterable<T> iterable, int index, int count)
    {
        this.taskRunner = newFJTaskRunner;
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections-forkjoin/src/main/java/org/eclipse/collections/impl/forkjoin/FJBatchIterableProcedureTask.java`
#### Snippet
```java
    public FJBatchIterableProcedureTask(
            FJBatchIterableProcedureRunner<T, PT> newFJTaskRunner,
            ProcedureFactory<PT> newProcedureFactory, BatchIterable<T> iterable, int index, int count)
    {
        this.taskRunner = newFJTaskRunner;
```

### BoundedWildcard
Can generalize to `? extends PT`
in `eclipse-collections-forkjoin/src/main/java/org/eclipse/collections/impl/forkjoin/FJListProcedureTask.java`
#### Snippet
```java
     */
    public FJListProcedureTask(
            FJListProcedureRunner<T, PT> newFJTaskRunner, ProcedureFactory<PT> newProcedureFactory,
            List<T> list, int index, int sectionSize, boolean isLast)
    {
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections-forkjoin/src/main/java/org/eclipse/collections/impl/forkjoin/FJListProcedureTask.java`
#### Snippet
```java
    public FJListProcedureTask(
            FJListProcedureRunner<T, PT> newFJTaskRunner, ProcedureFactory<PT> newProcedureFactory,
            List<T> list, int index, int sectionSize, boolean isLast)
    {
        this.taskRunner = newFJTaskRunner;
```

### BoundedWildcard
Can generalize to `? super PT`
in `eclipse-collections-forkjoin/src/main/java/org/eclipse/collections/impl/forkjoin/FJBatchIterableProcedureRunner.java`
#### Snippet
```java
    private final BlockingQueue<PT> outputQueue;

    public FJBatchIterableProcedureRunner(Combiner<PT> newCombiner, int taskCount)
    {
        this.combiner = newCombiner;
```

### BoundedWildcard
Can generalize to `? extends PT`
in `eclipse-collections-forkjoin/src/main/java/org/eclipse/collections/impl/forkjoin/FJBatchIterableProcedureRunner.java`
#### Snippet
```java
    }

    public void taskCompleted(ForkJoinTask<PT> task)
    {
        if (this.combiner.useCombineOne())
```

### BoundedWildcard
Can generalize to `? extends PT`
in `eclipse-collections-forkjoin/src/main/java/org/eclipse/collections/impl/forkjoin/FJListProcedureRunner.java`
#### Snippet
```java
    }

    public void taskCompleted(ForkJoinTask<PT> task)
    {
        if (this.combiner.useCombineOne())
```

### BoundedWildcard
Can generalize to `? super PT`
in `eclipse-collections-forkjoin/src/main/java/org/eclipse/collections/impl/forkjoin/FJListProcedureRunner.java`
#### Snippet
```java
    private final BlockingQueue<PT> outputQueue;

    public FJListProcedureRunner(Combiner<PT> newCombiner, int taskCount)
    {
        this.combiner = newCombiner;
```

### BoundedWildcard
Can generalize to `? extends PT`
in `eclipse-collections-forkjoin/src/main/java/org/eclipse/collections/impl/forkjoin/FJListObjectIntProcedureRunner.java`
#### Snippet
```java
    }

    public void taskCompleted(ForkJoinTask<PT> task)
    {
        if (this.combiner.useCombineOne())
```

### BoundedWildcard
Can generalize to `? super PT`
in `eclipse-collections-forkjoin/src/main/java/org/eclipse/collections/impl/forkjoin/FJListObjectIntProcedureRunner.java`
#### Snippet
```java
    private final BlockingQueue<PT> outputQueue;

    public FJListObjectIntProcedureRunner(Combiner<PT> newCombiner, int taskCount)
    {
        this.combiner = newCombiner;
```

### BoundedWildcard
Can generalize to `? super T`
in `eclipse-collections-testutils/src/main/java/org/eclipse/collections/impl/test/Verify.java`
#### Snippet
```java
    }

    public static <T> void assertStartsWith(List<T> list, T... items)
    {
        try
```

### BoundedWildcard
Can generalize to `? super K`
in `eclipse-collections-testutils/src/main/java/org/eclipse/collections/impl/test/Verify.java`
#### Snippet
```java
    }

    public static <K, V> void assertSortedBagMultimapsEqual(String multimapName, SortedBagMultimap<K, V> expectedSortedBagMultimap, SortedBagMultimap<K, V> actualSortedBagMultimap)
    {
        try
```

### BoundedWildcard
Can generalize to `? super K`
in `eclipse-collections-testutils/src/main/java/org/eclipse/collections/impl/test/Verify.java`
#### Snippet
```java
    }

    public static <K, V> void assertBagMultimapsEqual(String multimapName, BagMultimap<K, V> expectedBagMultimap, BagMultimap<K, V> actualBagMultimap)
    {
        try
```

### BoundedWildcard
Can generalize to `? super K`
in `eclipse-collections-testutils/src/main/java/org/eclipse/collections/impl/test/Verify.java`
#### Snippet
```java
    }

    public static <K, V> void assertListMultimapsEqual(String multimapName, ListMultimap<K, V> expectedListMultimap, ListMultimap<K, V> actualListMultimap)
    {
        try
```

### BoundedWildcard
Can generalize to `? super K`
in `eclipse-collections-testutils/src/main/java/org/eclipse/collections/impl/test/Verify.java`
#### Snippet
```java
    }

    public static <K, V> void assertSortedSetMultimapsEqual(String multimapName, SortedSetMultimap<K, V> expectedSortedSetMultimap, SortedSetMultimap<K, V> actualSortedSetMultimap)
    {
        try
```

### BoundedWildcard
Can generalize to `? super K`
in `eclipse-collections-testutils/src/main/java/org/eclipse/collections/impl/test/Verify.java`
#### Snippet
```java
    }

    public static <K, V> void assertSetMultimapsEqual(String multimapName, SetMultimap<K, V> expectedSetMultimap, SetMultimap<K, V> actualSetMultimap)
    {
        try
```

### BoundedWildcard
Can generalize to `? extends V`
in `eclipse-collections-forkjoin/src/main/java/org/eclipse/collections/impl/forkjoin/FJIterate.java`
#### Snippet
```java
     */
    public static <K, V, R extends MutableMultimap<K, V>> MutableMultimap<K, V> groupBy(
            Iterable<V> iterable,
            Function<? super V, ? extends K> function,
            R concurrentMultimap,
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/Iterate.java`
#### Snippet
```java
     * @see RichIterable#sumByLong(Function, LongFunction)
     */
    public static <T, V> ObjectLongMap<V> sumByLong(Iterable<T> iterable, Function<T, V> groupBy, LongFunction<? super T> function)
    {
        if (iterable instanceof RichIterable)
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/Iterate.java`
#### Snippet
```java
     * result ifNone if no element evaluates to true.
     */
    public static <T> T detectIfNone(Iterable<T> iterable, Predicate<? super T> predicate, T ifNone)
    {
        T result = Iterate.detect(iterable, predicate);
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/Iterate.java`
#### Snippet
```java
     */
    public static <T, K> MutableMap<K, T> toMap(
            Iterable<T> iterable,
            Function<? super T, ? extends K> keyFunction)
    {
```

### BoundedWildcard
Can generalize to `? extends K`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/Iterate.java`
#### Snippet
```java
     * Flip the keys and values of the multimap.
     */
    public static <K, V> HashBagMultimap<V, K> flip(BagMultimap<K, V> bagMultimap)
    {
        HashBagMultimap<V, K> result = new HashBagMultimap<>();
```

### BoundedWildcard
Can generalize to `? extends V`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/Iterate.java`
#### Snippet
```java
     * Flip the keys and values of the multimap.
     */
    public static <K, V> HashBagMultimap<V, K> flip(BagMultimap<K, V> bagMultimap)
    {
        HashBagMultimap<V, K> result = new HashBagMultimap<>();
```

### BoundedWildcard
Can generalize to `? extends K`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/Iterate.java`
#### Snippet
```java
     * Flip the keys and values of the multimap.
     */
    public static <K, V> UnifiedSetMultimap<V, K> flip(SetMultimap<K, V> setMultimap)
    {
        UnifiedSetMultimap<V, K> result = new UnifiedSetMultimap<>();
```

### BoundedWildcard
Can generalize to `? extends V`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/Iterate.java`
#### Snippet
```java
     * Flip the keys and values of the multimap.
     */
    public static <K, V> UnifiedSetMultimap<V, K> flip(SetMultimap<K, V> setMultimap)
    {
        UnifiedSetMultimap<V, K> result = new UnifiedSetMultimap<>();
```

### BoundedWildcard
Can generalize to `? extends K`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/Iterate.java`
#### Snippet
```java
     * Flip the keys and values of the multimap.
     */
    public static <K, V> HashBagMultimap<V, K> flip(ListMultimap<K, V> listMultimap)
    {
        HashBagMultimap<V, K> result = new HashBagMultimap<>();
```

### BoundedWildcard
Can generalize to `? extends V`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/Iterate.java`
#### Snippet
```java
     * Flip the keys and values of the multimap.
     */
    public static <K, V> HashBagMultimap<V, K> flip(ListMultimap<K, V> listMultimap)
    {
        HashBagMultimap<V, K> result = new HashBagMultimap<>();
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/Iterate.java`
#### Snippet
```java
     * @see RichIterable#sumByInt(Function, IntFunction)
     */
    public static <T, V> ObjectLongMap<V> sumByInt(Iterable<T> iterable, Function<T, V> groupBy, IntFunction<? super T> function)
    {
        if (iterable instanceof RichIterable)
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/Iterate.java`
#### Snippet
```java
     * @since 6.0
     */
    public static <V, T> MutableMap<V, BigDecimal> sumByBigDecimal(Iterable<T> iterable, Function<T, V> groupBy, Function<? super T, BigDecimal> function)
    {
        if (iterable instanceof List)
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/Iterate.java`
#### Snippet
```java
     * @see RichIterable#sumOfDouble(DoubleFunction)
     */
    public static <T, V> ObjectDoubleMap<V> sumByDouble(Iterable<T> iterable, Function<T, V> groupBy, DoubleFunction<? super T> function)
    {
        if (iterable instanceof RichIterable)
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/Iterate.java`
#### Snippet
```java
     * @see RichIterable#sumOfFloat(FloatFunction)
     */
    public static <T, V> ObjectDoubleMap<V> sumByFloat(Iterable<T> iterable, Function<T, V> groupBy, FloatFunction<? super T> function)
    {
        if (iterable instanceof RichIterable)
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/Iterate.java`
#### Snippet
```java
     * @since 6.0
     */
    public static <V, T> MutableMap<V, BigInteger> sumByBigInteger(Iterable<T> iterable, Function<T, V> groupBy, Function<? super T, BigInteger> function)
    {
        if (iterable instanceof List)
```

### BoundedWildcard
Can generalize to `? extends T`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/Iterate.java`
#### Snippet
```java
     */
    public static <T, P> T detectWithIfNone(
            Iterable<T> iterable,
            Predicate2<? super T, ? super P> predicate,
            P parameter,
```

### BoundedWildcard
Can generalize to `? super V`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/parallel/ParallelIterate.java`
#### Snippet
```java
        private final MutableMap<V, BigInteger> result;

        private SumByBigIntegerCombiner(MutableMap<V, BigInteger> result)
        {
            super(true);
```

### BoundedWildcard
Can generalize to `? extends V`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/parallel/ParallelIterate.java`
#### Snippet
```java
     */
    public static <K, V, R extends MutableMultimap<K, V>> MutableMultimap<K, V> groupBy(
            Iterable<V> iterable,
            Function<? super V, ? extends K> function,
            R concurrentMultimap,
```

### BoundedWildcard
Can generalize to `? super V`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/parallel/ParallelIterate.java`
#### Snippet
```java
        private final MutableMap<V, BigDecimal> result;

        private SumByBigDecimalCombiner(MutableMap<V, BigDecimal> result)
        {
            super(true);
```

### BoundedWildcard
Can generalize to `? extends Collection`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/parallel/ParallelIterate.java`
#### Snippet
```java
    public static <T, V, R extends Collection<V>> R flatCollect(
            Iterable<T> iterable,
            Function<? super T, Collection<V>> function,
            R target,
            int batchSize,
```

## RuleId[id=FunctionalExpressionCanBeFolded]
### FunctionalExpressionCanBeFolded
Method reference can be replaced with qualifier
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/lazy/parallel/bag/FlatCollectUnsortedBagBatch.java`
#### Snippet
```java
    public void forEach(Procedure<? super V> procedure)
    {
        this.unsortedBagBatch.forEach(each -> Iterate.forEach(this.function.valueOf(each), procedure::value));
    }

```

## RuleId[id=UnnecessaryUnboxing]
### UnnecessaryUnboxing
Unnecessary unboxing
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/Interval.java`
#### Snippet
```java
    private boolean intObjectNotEqual(int i, Object object)
    {
        return !(object instanceof Integer) || ((Integer) object).intValue() != i;
    }

```

### UnnecessaryUnboxing
Unnecessary unboxing
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/IntegerPredicates.java`
#### Snippet
```java
        public boolean accept(Integer i)
        {
            return i.intValue() == 0;
        }
    }
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/IntegerPredicates.java`
#### Snippet
```java
        public boolean accept(Integer i)
        {
            return i.intValue() % 2 != 0;
        }
    }
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/IntegerPredicates.java`
#### Snippet
```java
        public boolean accept(Integer i)
        {
            return i.intValue() % 2 == 0;
        }
    }
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/IntegerPredicates.java`
#### Snippet
```java
        public boolean accept(Integer i)
        {
            return i.intValue() < 0;
        }
    }
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/IntegerPredicates.java`
#### Snippet
```java
        public boolean accept(Integer i)
        {
            return i.intValue() > 0;
        }
    }
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/PrimitiveFunctions.java`
#### Snippet
```java
        public boolean booleanValueOf(Integer integer)
        {
            return integer.intValue() > 0;
        }
    }
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/LongPredicates.java`
#### Snippet
```java
        public boolean accept(Long l)
        {
            return l.longValue() % 2 == 0;
        }
    }
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/LongPredicates.java`
#### Snippet
```java
        public boolean accept(Long l)
        {
            return l.longValue() % 2 != 0;
        }
    }
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/LongPredicates.java`
#### Snippet
```java
        public boolean accept(Long l)
        {
            return l.longValue() > 0;
        }
    }
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/LongPredicates.java`
#### Snippet
```java
        public boolean accept(Long l)
        {
            return l.longValue() == 0;
        }
    }
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/LongPredicates.java`
#### Snippet
```java
        public boolean accept(Long l)
        {
            return l.longValue() < 0;
        }
    }
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/function/MinFunction.java`
#### Snippet
```java
                return argument1;
            }
            return argument1.intValue() < argument2.intValue() ? argument1 : argument2;
        }
    }
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/function/MinFunction.java`
#### Snippet
```java
                return argument1;
            }
            return argument1.intValue() < argument2.intValue() ? argument1 : argument2;
        }
    }
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/function/MinFunction.java`
#### Snippet
```java
                return argument1;
            }
            return argument1.doubleValue() < argument2.doubleValue() ? argument1 : argument2;
        }
    }
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/function/MinFunction.java`
#### Snippet
```java
                return argument1;
            }
            return argument1.doubleValue() < argument2.doubleValue() ? argument1 : argument2;
        }
    }
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/function/MinFunction.java`
#### Snippet
```java
                return argument1;
            }
            return argument1.longValue() < argument2.longValue() ? argument1 : argument2;
        }
    }
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/function/MinFunction.java`
#### Snippet
```java
                return argument1;
            }
            return argument1.longValue() < argument2.longValue() ? argument1 : argument2;
        }
    }
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/function/MaxFunction.java`
#### Snippet
```java
                return argument1;
            }
            return argument1.intValue() > argument2.intValue() ? argument1 : argument2;
        }
    }
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/function/MaxFunction.java`
#### Snippet
```java
                return argument1;
            }
            return argument1.intValue() > argument2.intValue() ? argument1 : argument2;
        }
    }
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/function/MaxFunction.java`
#### Snippet
```java
                return argument1;
            }
            return argument1.longValue() > argument2.longValue() ? argument1 : argument2;
        }
    }
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/function/MaxFunction.java`
#### Snippet
```java
                return argument1;
            }
            return argument1.longValue() > argument2.longValue() ? argument1 : argument2;
        }
    }
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/function/MaxFunction.java`
#### Snippet
```java
                return argument1;
            }
            return argument1.doubleValue() > argument2.doubleValue() ? argument1 : argument2;
        }
    }
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/function/MaxFunction.java`
#### Snippet
```java
                return argument1;
            }
            return argument1.doubleValue() > argument2.doubleValue() ? argument1 : argument2;
        }
    }
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/Functions.java`
#### Snippet
```java
        public int intValueOf(Integer each)
        {
            return each.intValue();
        }

```

### UnnecessaryUnboxing
Unnecessary unboxing
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/Functions.java`
#### Snippet
```java
        public double doubleValueOf(Double each)
        {
            return each.doubleValue();
        }

```

### UnnecessaryUnboxing
Unnecessary unboxing
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/Functions.java`
#### Snippet
```java
        public long longValueOf(Long each)
        {
            return each.longValue();
        }

```

## RuleId[id=AssertBetweenInconvertibleTypes]
### AssertBetweenInconvertibleTypes
Possibly redundant assertion: incompatible types are compared 'String' and 'boolean'
in `eclipse-collections-testutils/src/main/java/org/eclipse/collections/impl/test/Verify.java`
#### Snippet
```java
            Assert.assertFalse("Neither item should equal null", objectA.equals(null));
            Assert.assertFalse("Neither item should equal null", objectB.equals(null));
            Assert.assertNotEquals("Neither item should equal new Object()", objectA.equals(new Object()));
            Assert.assertNotEquals("Neither item should equal new Object()", objectB.equals(new Object()));
            Assert.assertEquals("Expected " + itemNames + " to be equal.", objectA, objectA);
```

### AssertBetweenInconvertibleTypes
Possibly redundant assertion: incompatible types are compared 'String' and 'boolean'
in `eclipse-collections-testutils/src/main/java/org/eclipse/collections/impl/test/Verify.java`
#### Snippet
```java
            Assert.assertFalse("Neither item should equal null", objectB.equals(null));
            Assert.assertNotEquals("Neither item should equal new Object()", objectA.equals(new Object()));
            Assert.assertNotEquals("Neither item should equal new Object()", objectB.equals(new Object()));
            Assert.assertEquals("Expected " + itemNames + " to be equal.", objectA, objectA);
            Assert.assertEquals("Expected " + itemNames + " to be equal.", objectB, objectB);
```

## RuleId[id=ClassNameSameAsAncestorName]
### ClassNameSameAsAncestorName
Class name `Entry` is the same as one of its superclass' names
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMap.java`
#### Snippet
```java
    }

    private static final class Entry<K, V> implements Map.Entry<K, V>
    {
        private final K key;
```

### ClassNameSameAsAncestorName
Class name `Entry` is the same as one of its superclass' names
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMapUnsafe.java`
#### Snippet
```java
    }

    private static final class Entry<K, V> implements Map.Entry<K, V>
    {
        private final K key;
```

### ClassNameSameAsAncestorName
Class name `SubList` is the same as one of its superclass' names
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/fixed/AbstractMemoryEfficientMutableList.java`
#### Snippet
```java
    }

    private static class SubList<T>
            extends AbstractMutableList.SubList<T>
    {
```

### ClassNameSameAsAncestorName
Class name `Function` is the same as one of its superclass' names
in `eclipse-collections-api/src/main/java/org/eclipse/collections/api/block/function/Function.java`
#### Snippet
```java
 */
@FunctionalInterface
public interface Function<T, V>
        extends java.util.function.Function<T, V>, Serializable
{
```

### ClassNameSameAsAncestorName
Class name `Predicate` is the same as one of its superclass' names
in `eclipse-collections-api/src/main/java/org/eclipse/collections/api/block/predicate/Predicate.java`
#### Snippet
```java
 */
@FunctionalInterface
public interface Predicate<T>
        extends java.util.function.Predicate<T>, Serializable
{
```

## RuleId[id=RedundantStreamOptionalCall]
### RedundantStreamOptionalCall
Redundant 'parallel()' call: the stream was created via 'parallelStream()', so it's already parallel
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/AnagramSetTest.java`
#### Snippet
```java
                .filter(list -> list.size() >= SIZE_THRESHOLD)
                .sorted(Comparator.<Set<String>>comparingInt(Set::size).reversed())
                .parallel()
                .map(list -> list.size() + ": " + list)
                .forEach(e -> Assert.assertFalse(e.isEmpty()));
```

### RedundantStreamOptionalCall
Redundant 'parallel()' call: the stream was created via 'parallelStream()', so it's already parallel
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/AnagramSetTest.java`
#### Snippet
```java
                .filter(list -> list.size() >= SIZE_THRESHOLD)
                .sorted(Comparator.<Set<String>>comparingInt(Set::size).reversed())
                .parallel()
                .map(list -> list.size() + ": " + list)
                .forEach(e -> Assert.assertFalse(e.isEmpty()));
```

## RuleId[id=ThrowFromFinallyBlock]
### ThrowFromFinallyBlock
`throw` inside 'finally' block
in `eclipse-collections-code-generator/src/main/java/org/eclipse/collections/codegenerator/tools/FileUtils.java`
#### Snippet
```java
                catch (IOException e)
                {
                    throw new RuntimeException("Could not close filewriter: " + e);
                }
            }
```

### ThrowFromFinallyBlock
`throw` inside 'finally' block
in `eclipse-collections-code-generator/src/main/java/org/eclipse/collections/codegenerator/tools/FileUtils.java`
#### Snippet
```java
                catch (IOException e)
                {
                    throw new RuntimeException("Could not close bufferedwriter: " + e);
                }
            }
```

## RuleId[id=IntegerMultiplicationImplicitCastToLong]
### IntegerMultiplicationImplicitCastToLong
this.mapSizeDividedBy64 \* 64: integer multiplication implicitly cast to long
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/IntIntMapTest.java`
#### Snippet
```java
            }
        }
        this.randomIntsForValues = new Random(0x123456789ABCDL).ints().limit((long) (this.mapSizeDividedBy64 * 64)).toArray();

        this.intIntMap = new IntIntHashMap();
```

### IntegerMultiplicationImplicitCastToLong
this.mapSizeDividedBy16000 \* 64: integer multiplication implicitly cast to long
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/LongIntMapTest.java`
#### Snippet
```java
            }
        }
        this.randomIntegersForMap = new Random(0x123456789ABCDL).ints().limit((long) (this.mapSizeDividedBy16000 * 64)).toArray();

        this.longIntMap = new LongIntHashMap();
```

### IntegerMultiplicationImplicitCastToLong
i \* 2: integer multiplication implicitly cast to long
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/IntListJMHTest.java`
#### Snippet
```java
        return IntStream.of(this.ints)
                .filter(i -> i % 2 == 0)
                .mapToLong(i -> (long) (i * 2))
                .sum();
    }
```

### IntegerMultiplicationImplicitCastToLong
i \* 2: integer multiplication implicitly cast to long
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/IntListJMHTest.java`
#### Snippet
```java
                .parallel()
                .filter(i -> i % 2 == 0)
                .mapToLong(i -> (long) (i * 2))
                .sum();
    }
```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `eclipse-collections-code-generator/src/main/java/org/eclipse/collections/codegenerator/tools/FileUtils.java`
#### Snippet
```java
    {
        JarEntry entry;
        while ((entry = stream.getNextJarEntry()) != null)
        {
            String entryName = entry.getName();
```

### NestedAssignment
Result of assignment expression used
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/AbstractRichIterable.java`
#### Snippet
```java
                : array;

        this.forEachWithIndex((each, index) -> result[index] = (E) each);
        if (result.length > size)
        {
```

### NestedAssignment
Result of assignment expression used
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/AbstractRichIterable.java`
#### Snippet
```java
    {
        Object[] result = new Object[this.size()];
        this.forEachWithIndex((each, index) -> result[index] = each);
        return result;
    }
```

### NestedAssignment
Result of assignment expression used
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMap.java`
#### Snippet
```java
            }

            if ((this.next = e.getNext()) == null)
            {
                this.findNext();
```

### NestedAssignment
Result of assignment expression used
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMap.java`
#### Snippet
```java
        {
            Object k;
            if ((k = e.key) == key || key.equals(k))
            {
                return e.value;
```

### NestedAssignment
Result of assignment expression used
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMapUnsafe.java`
#### Snippet
```java
        {
            Object k;
            if ((k = e.key) == key || key.equals(k))
            {
                return e.value;
```

### NestedAssignment
Result of assignment expression used
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMapUnsafe.java`
#### Snippet
```java
            }

            if ((this.next = e.getNext()) == null)
            {
                this.findNext();
```

### NestedAssignment
Result of assignment expression used
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/lazy/TakeIterable.java`
#### Snippet
```java
    {
        Object[] result = new Object[this.count];
        this.forEachWithIndex((each, index) -> result[index] = each);
        return result;
    }
```

### NestedAssignment
Result of assignment expression used
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/lazy/primitive/CollectBooleanIterable.java`
#### Snippet
```java
    {
        boolean[] array = new boolean[this.size()];
        this.iterable.forEachWithIndex((each, index) -> array[index] = this.function.booleanValueOf(each));
        return array;
    }
```

### NestedAssignment
Result of assignment expression used
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/Interval.java`
#### Snippet
```java
    {
        int[] result = new int[this.size()];
        this.forEachWithIndex((IntIntProcedure) (each, index) -> result[index] = each);
        return result;
    }
```

### NestedAssignment
Result of assignment expression used
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/Interval.java`
#### Snippet
```java
    {
        Integer[] result = new Integer[this.size()];
        this.forEachWithIndex((ObjectIntProcedure<Integer>) (each, index) -> result[index] = each);
        return result;
    }
```

### NestedAssignment
Result of assignment expression used
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/mutable/CompositeFastList.java`
#### Snippet
```java
                : (Object[]) Array.newInstance(array.getClass().getComponentType(), size);

        this.forEachWithIndex((each, index) -> result[index] = each);

        if (result.length > size)
```

### NestedAssignment
Result of assignment expression used
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/mutable/CompositeFastList.java`
#### Snippet
```java
    {
        Object[] result = new Object[this.size()];
        this.forEachWithIndex((each, index) -> result[index] = each);
        return result;
    }
```

### NestedAssignment
Result of assignment expression used
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/immutable/AbstractImmutableList.java`
#### Snippet
```java
        T[] array = (T[]) new Object[oldSize + newSize];
        this.toArray(array);
        Iterate.forEachWithIndex(elements, (each, index) -> array[oldSize + index] = each);
        return Lists.immutable.with(array);
    }
```

### NestedAssignment
Result of assignment expression used
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/primitive/LongInterval.java`
#### Snippet
```java
    {
        long[] result = new long[this.size()];
        this.forEachWithIndex((each, index) -> result[index] = each);
        return result;
    }
```

### NestedAssignment
Result of assignment expression used
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/primitive/LongInterval.java`
#### Snippet
```java
        }
        long[] finalBypass = result;
        this.forEachWithIndex((each, index) -> finalBypass[index] = each);
        return result;
    }
```

### NestedAssignment
Result of assignment expression used
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/primitive/IntInterval.java`
#### Snippet
```java
        }
        int[] finalBypass = result;
        this.forEachWithIndex((each, index) -> finalBypass[index] = each);
        return result;
    }
```

### NestedAssignment
Result of assignment expression used
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/primitive/IntInterval.java`
#### Snippet
```java
    {
        int[] result = new int[this.size()];
        this.forEachWithIndex((each, index) -> result[index] = each);
        return result;
    }
```

## RuleId[id=SimplifiableBooleanExpression]
### SimplifiableBooleanExpression
`value == null && this.table[i - 1] != null || value != null` can be simplified to 'value != null\|\|this.table\[i - 1\] != null'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/UnifiedMap.java`
#### Snippet
```java
                this.chainedForEachValue((Object[]) value, procedure);
            }
            else if (value == null && this.table[i - 1] != null || value != null)
            {
                procedure.value((V) value);
```

### SimplifiableBooleanExpression
`value == null && this.table[i - 1] != null || value != null` can be simplified to 'value != null\|\|this.table\[i - 1\] != null'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/strategy/mutable/UnifiedMapWithHashingStrategy.java`
#### Snippet
```java
                this.chainedForEachValue((Object[]) value, procedure);
            }
            else if (value == null && this.table[i - 1] != null || value != null)
            {
                procedure.value((V) value);
```

### SimplifiableBooleanExpression
`distinct && this.predicate.accept(each) || !distinct` can be simplified to '!distinct\|\|this.predicate.accept(each)'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/lazy/parallel/list/ParallelDistinctListIterable.java`
#### Snippet
```java
        {
            boolean distinct = this.distinct.put(each, true) == null;
            return distinct && this.predicate.accept(each) || !distinct;
        }
    }
```

## RuleId[id=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `result` are updated, but never queried
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/SetAddAllTest.java`
#### Snippet
```java
    public void jdk()
    {
        Set<Integer> result = new HashSet<>();
        for (int i = 0; i < 1000; i++)
        {
```

## RuleId[id=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `partitionedSize` is accessed in both synchronized and unsynchronized contexts
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMap.java`
#### Snippet
```java
    private volatile AtomicReferenceArray table;

    private AtomicIntegerArray partitionedSize;

    @SuppressWarnings("UnusedDeclaration")
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `partitionedSize` is accessed in both synchronized and unsynchronized contexts
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMapUnsafe.java`
#### Snippet
```java
    private volatile Object[] table;

    private int[] partitionedSize;

    @SuppressWarnings("UnusedDeclaration")
```

## RuleId[id=EmptyMethod]
### EmptyMethod
The method is empty
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/immutable/primitive/ImmutableBooleanEmptySet.java`
#### Snippet
```java

    @Override
    public void forEach(BooleanProcedure procedure)
    {
    }
```

### EmptyMethod
The method is empty
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/immutable/primitive/ImmutableBooleanEmptySet.java`
#### Snippet
```java
     */
    @Override
    public void each(BooleanProcedure procedure)
    {
    }
```

### EmptyMethod
The method is empty
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/immutable/primitive/ImmutableBooleanEmptySet.java`
#### Snippet
```java

    @Override
    public void appendString(Appendable appendable)
    {
    }
```

### EmptyMethod
The method is empty
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/immutable/primitive/ImmutableBooleanEmptySet.java`
#### Snippet
```java

    @Override
    public void appendString(Appendable appendable, String separator)
    {
    }
```

### EmptyMethod
All implementations of this method are empty
in `eclipse-collections-api/src/main/java/org/eclipse/collections/api/map/primitive/PrimitiveObjectMap.java`
#### Snippet
```java

    @Override
    Bag<V> select(Predicate<? super V> predicate);

    @Override
```

### EmptyMethod
All implementations of this method are empty
in `eclipse-collections-api/src/main/java/org/eclipse/collections/api/map/primitive/PrimitiveObjectMap.java`
#### Snippet
```java

    @Override
    <P> Bag<V> selectWith(Predicate2<? super V, ? super P> predicate, P parameter);

    @Override
```

### EmptyMethod
All implementations of this method are empty
in `eclipse-collections-api/src/main/java/org/eclipse/collections/api/map/primitive/PrimitiveObjectMap.java`
#### Snippet
```java

    @Override
    Bag<V> reject(Predicate<? super V> predicate);

    @Override
```

### EmptyMethod
All implementations of this method are empty
in `eclipse-collections-api/src/main/java/org/eclipse/collections/api/map/primitive/PrimitiveObjectMap.java`
#### Snippet
```java

    @Override
    <P> Bag<V> rejectWith(Predicate2<? super V, ? super P> predicate, P parameter);

    @Override
```

### EmptyMethod
All implementations of this method are empty
in `eclipse-collections-api/src/main/java/org/eclipse/collections/api/map/primitive/PrimitiveObjectMap.java`
#### Snippet
```java

    @Override
    PartitionBag<V> partition(Predicate<? super V> predicate);

    @Override
```

### EmptyMethod
All implementations of this method are empty
in `eclipse-collections-api/src/main/java/org/eclipse/collections/api/map/primitive/PrimitiveObjectMap.java`
#### Snippet
```java

    @Override
    <P> PartitionBag<V> partitionWith(Predicate2<? super V, ? super P> predicate, P parameter);

    @Override
```

### EmptyMethod
All implementations of this method are empty
in `eclipse-collections-api/src/main/java/org/eclipse/collections/api/map/primitive/PrimitiveObjectMap.java`
#### Snippet
```java

    @Override
    <S> Bag<S> selectInstancesOf(Class<S> clazz);

    @Override
```

### EmptyMethod
All implementations of this method are empty
in `eclipse-collections-api/src/main/java/org/eclipse/collections/api/map/primitive/PrimitiveObjectMap.java`
#### Snippet
```java

    @Override
    <VV> Bag<VV> collect(Function<? super V, ? extends VV> function);

    @Override
```

### EmptyMethod
All implementations of this method are empty
in `eclipse-collections-api/src/main/java/org/eclipse/collections/api/map/primitive/PrimitiveObjectMap.java`
#### Snippet
```java

    @Override
    BooleanBag collectBoolean(BooleanFunction<? super V> booleanFunction);

    @Override
```

### EmptyMethod
All implementations of this method are empty
in `eclipse-collections-api/src/main/java/org/eclipse/collections/api/map/primitive/PrimitiveObjectMap.java`
#### Snippet
```java

    @Override
    ByteBag collectByte(ByteFunction<? super V> byteFunction);

    @Override
```

### EmptyMethod
All implementations of this method are empty
in `eclipse-collections-api/src/main/java/org/eclipse/collections/api/map/primitive/PrimitiveObjectMap.java`
#### Snippet
```java

    @Override
    CharBag collectChar(CharFunction<? super V> charFunction);

    @Override
```

### EmptyMethod
All implementations of this method are empty
in `eclipse-collections-api/src/main/java/org/eclipse/collections/api/map/primitive/PrimitiveObjectMap.java`
#### Snippet
```java

    @Override
    DoubleBag collectDouble(DoubleFunction<? super V> doubleFunction);

    @Override
```

### EmptyMethod
All implementations of this method are empty
in `eclipse-collections-api/src/main/java/org/eclipse/collections/api/map/primitive/PrimitiveObjectMap.java`
#### Snippet
```java

    @Override
    FloatBag collectFloat(FloatFunction<? super V> floatFunction);

    @Override
```

### EmptyMethod
All implementations of this method are empty
in `eclipse-collections-api/src/main/java/org/eclipse/collections/api/map/primitive/PrimitiveObjectMap.java`
#### Snippet
```java

    @Override
    IntBag collectInt(IntFunction<? super V> intFunction);

    @Override
```

### EmptyMethod
All implementations of this method are empty
in `eclipse-collections-api/src/main/java/org/eclipse/collections/api/map/primitive/PrimitiveObjectMap.java`
#### Snippet
```java

    @Override
    LongBag collectLong(LongFunction<? super V> longFunction);

    @Override
```

### EmptyMethod
All implementations of this method are empty
in `eclipse-collections-api/src/main/java/org/eclipse/collections/api/map/primitive/PrimitiveObjectMap.java`
#### Snippet
```java

    @Override
    ShortBag collectShort(ShortFunction<? super V> shortFunction);

    @Override
```

### EmptyMethod
All implementations of this method are empty
in `eclipse-collections-api/src/main/java/org/eclipse/collections/api/map/primitive/PrimitiveObjectMap.java`
#### Snippet
```java

    @Override
    <P, VV> Bag<VV> collectWith(Function2<? super V, ? super P, ? extends VV> function, P parameter);

    @Override
```

### EmptyMethod
All implementations of this method are empty
in `eclipse-collections-api/src/main/java/org/eclipse/collections/api/map/primitive/PrimitiveObjectMap.java`
#### Snippet
```java

    @Override
    <VV> Bag<VV> collectIf(Predicate<? super V> predicate, Function<? super V, ? extends VV> function);

    @Override
```

### EmptyMethod
All implementations of this method are empty
in `eclipse-collections-api/src/main/java/org/eclipse/collections/api/map/primitive/PrimitiveObjectMap.java`
#### Snippet
```java

    @Override
    <VV> Bag<VV> flatCollect(Function<? super V, ? extends Iterable<VV>> function);

    /**
```

### EmptyMethod
All implementations of this method are empty
in `eclipse-collections-api/src/main/java/org/eclipse/collections/api/map/primitive/PrimitiveObjectMap.java`
#### Snippet
```java

    @Override
    <VV> BagMultimap<VV, V> groupBy(Function<? super V, ? extends VV> function);

    @Override
```

### EmptyMethod
All implementations of this method are empty
in `eclipse-collections-api/src/main/java/org/eclipse/collections/api/map/primitive/PrimitiveObjectMap.java`
#### Snippet
```java

    @Override
    <VV> BagMultimap<VV, V> groupByEach(Function<? super V, ? extends Iterable<VV>> function);

    @Override
```

### EmptyMethod
All implementations of this method are empty
in `eclipse-collections-api/src/main/java/org/eclipse/collections/api/map/primitive/PrimitiveObjectMap.java`
#### Snippet
```java
    @Override
    @Deprecated
    <S> Bag<Pair<V, S>> zip(Iterable<S> that);

    /**
```

### EmptyMethod
All implementations of this method are empty
in `eclipse-collections-api/src/main/java/org/eclipse/collections/api/map/primitive/PrimitiveObjectMap.java`
#### Snippet
```java
    @Override
    @Deprecated
    UnsortedSetIterable<Pair<V, Integer>> zipWithIndex();

    /**
```

### EmptyMethod
All implementations of this method are empty
in `eclipse-collections-api/src/main/java/org/eclipse/collections/api/multimap/bag/ImmutableBagIterableMultimap.java`
#### Snippet
```java

    @Override
    ImmutableBagIterable<V> get(K key);

    @Override
```

### EmptyMethod
All implementations of this method are empty
in `eclipse-collections-api/src/main/java/org/eclipse/collections/api/multimap/set/ImmutableSetIterableMultimap.java`
#### Snippet
```java
{
    @Override
    ImmutableSetIterable<V> get(K key);

    @Override
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `0` is redundant
in `eclipse-collections-code-generator/src/main/java/org/eclipse/collections/codegenerator/EclipseCollectionsCodeGenerator.java`
#### Snippet
```java
    private final String fileExtension;

    private int numFileWritten = 0;

    public EclipseCollectionsCodeGenerator(
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/lazy/iterator/ZipWithIndexIterator.java`
#### Snippet
```java
{
    private final Iterator<T> iterator;
    private int index = 0;

    public ZipWithIndexIterator(Iterable<T> iterable)
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/procedure/CounterProcedure.java`
#### Snippet
```java
    private static final long serialVersionUID = 1L;

    private int count = 0;
    private final Procedure<T> procedure;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/procedure/ZipWithIndexProcedure.java`
#### Snippet
```java
    private static final long serialVersionUID = 1L;

    private int index = 0;
    private final R target;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/parallel/CountCombiner.java`
#### Snippet
```java
{
    private static final long serialVersionUID = 1L;
    private int count = 0;

    public CountCombiner()
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `eclipse-collections-testutils/src/main/java/org/eclipse/collections/impl/test/ClassComparer.java`
#### Snippet
```java
    private final boolean includeReturnTypes;
    private final boolean includePackageNames;
    private boolean includeObjectMethods = false;
    private final Appendable appendable;

```

## RuleId[id=PointlessBitwiseExpression]
### PointlessBitwiseExpression
`~(ResizeContainer.QUEUE_INCREMENT - 1)` can be replaced with '-ResizeContainer.QUEUE_INCREMENT'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMap.java`
#### Snippet
```java
            else if (o == RESIZED || o == RESIZING)
            {
                j = (j & ~(ResizeContainer.QUEUE_INCREMENT - 1)) + ResizeContainer.QUEUE_INCREMENT;
                if (resizeContainer.resizers.get() == 1)
                {
```

### PointlessBitwiseExpression
`~(ResizeContainer.QUEUE_INCREMENT - 1)` can be replaced with '-ResizeContainer.QUEUE_INCREMENT'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMapUnsafe.java`
#### Snippet
```java
            else if (o == RESIZED || o == RESIZING)
            {
                j = (j & ~(ResizeContainer.QUEUE_INCREMENT - 1)) + ResizeContainer.QUEUE_INCREMENT;
                if (resizeContainer.resizers.get() == 1)
                {
```

## RuleId[id=RedundantExplicitClose]
### RedundantExplicitClose
Redundant 'close()'
in `eclipse-collections-testutils/src/main/java/org/eclipse/collections/impl/test/SerializeTestHelper.java`
#### Snippet
```java
            objectOutputStream.writeObject(sourceObject);
            objectOutputStream.flush();
            objectOutputStream.close();
        }
    }
```

## RuleId[id=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-03-19-18-06-09.286.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[id=ArrayEquality]
### ArrayEquality
Array objects are compared using `!=`, not 'Arrays.equals()'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMapUnsafe.java`
#### Snippet
```java
            {
                // we're in a double resize situation; we'll have to go help until it's our turn to set the table
                if (src != oldTable)
                {
                    this.helpWithResize(src);
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/mutable/FastList.java`
#### Snippet
```java
    private void ensureCapacityForAdd()
    {
        if (this.items == DEFAULT_SIZED_EMPTY_ARRAY)
        {
            this.items = (T[]) new Object[10];
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/primitive/BooleanHashSet.java`
#### Snippet
```java
        {
            case 0:
                return new boolean[0];
            case 1:
                return new boolean[]{false};
```

## RuleId[id=SynchronizeOnThis]
### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMap.java`
#### Snippet
```java
            if (remaining == 0)
            {
                synchronized (this)
                {
                    this.notifyAll();
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMap.java`
#### Snippet
```java
                synchronized (this)
                {
                    this.notifyAll();
                }
            }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMap.java`
#### Snippet
```java
            if (this.resizers.get() > 0)
            {
                synchronized (this)
                {
                    while (this.resizers.get() > 0)
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMap.java`
#### Snippet
```java
                        try
                        {
                            this.wait();
                        }
                        catch (InterruptedException e)
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMapUnsafe.java`
#### Snippet
```java
            if (remaining == 0)
            {
                synchronized (this)
                {
                    this.notifyAll();
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMapUnsafe.java`
#### Snippet
```java
                synchronized (this)
                {
                    this.notifyAll();
                }
            }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMapUnsafe.java`
#### Snippet
```java
            if (this.resizers.get() > 0)
            {
                synchronized (this)
                {
                    while (this.resizers.get() > 0)
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMapUnsafe.java`
#### Snippet
```java
                        try
                        {
                            this.wait();
                        }
                        catch (InterruptedException e)
```

## RuleId[id=NullArgumentToVariableArgMethod]
### NullArgumentToVariableArgMethod
Confusing argument `this.items`, unclear if a varargs or non-varargs call is desired
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/immutable/ImmutableArrayList.java`
#### Snippet
```java
    public boolean containsAll(Collection<?> collection)
    {
        return Iterate.allSatisfy(collection, Predicates.in(this.items));
    }

```

## RuleId[id=CastConflictsWithInstanceof]
### CastConflictsWithInstanceof
Cast to 'Collection' type conflicts with preceding 'instanceof Bag' check
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/bag/sorted/immutable/ImmutableEmptySortedBag.java`
#### Snippet
```java
            return true;
        }
        return other instanceof Bag && ((Collection<?>) other).isEmpty();
    }

```

### CastConflictsWithInstanceof
Cast to 'List' type conflicts with preceding 'instanceof RandomAccess' check
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/bag/sorted/immutable/ImmutableSortedBagImpl.java`
#### Snippet
```java
        if (other instanceof RandomAccess)
        {
            List<S> otherList = (List<S>) other;
            int otherListIndex = 0;
            for (int i = 0; i < this.elements.length; i++)
```

### CastConflictsWithInstanceof
Cast to 'List' type conflicts with preceding 'instanceof RandomAccess' check
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/OrderedIterate.java`
#### Snippet
```java
        if (o1 instanceof RandomAccess)
        {
            return RandomAccessListIterate.corresponds((List<T>) o1, o2, predicate);
        }
        if (o2 instanceof RandomAccess)
```

### CastConflictsWithInstanceof
Cast to 'List' type conflicts with preceding 'instanceof RandomAccess' check
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/OrderedIterate.java`
#### Snippet
```java
        if (o2 instanceof RandomAccess)
        {
            List<S> otherList = (List<S>) o2;
            Iterator<T> iterator = o1.iterator();
            for (int index = 0; index < otherList.size(); index++)
```

### CastConflictsWithInstanceof
Cast to 'List

' type conflicts with preceding 'instanceof RandomAccess' check
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/internal/InternalArrayIterate.java`
#### Snippet
```java
        if (other instanceof RandomAccess)
        {
            List<P> otherList = (List<P>) other;
            for (int index = 0; index < size; index++)
            {
```

### CastConflictsWithInstanceof
Cast to 'List

' type conflicts with preceding 'instanceof RandomAccess' check
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/internal/RandomAccessListIterate.java`
#### Snippet
```java
        if (other instanceof RandomAccess)
        {
            List<P> otherList = (List<P>) other;
            for (int index = 0; index < size; index++)
            {
```

### CastConflictsWithInstanceof
Cast to 'List' type conflicts with preceding 'instanceof RandomAccess' check
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/collection/mutable/CollectionAdapter.java`
#### Snippet
```java
        if (iterable instanceof RandomAccess)
        {
            return RandomAccessListAdapter.adapt((List<E>) iterable);
        }
        if (iterable instanceof List)
```

### CastConflictsWithInstanceof
Cast to 'List' type conflicts with preceding 'instanceof RandomAccess' check
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/Iterate.java`
#### Snippet
```java
        if (iterable instanceof RandomAccess)
        {
            return RandomAccessListIterate.noneSatisfy((List<T>) iterable, predicate);
        }
        if (iterable != null)
```

### CastConflictsWithInstanceof
Cast to 'List' type conflicts with preceding 'instanceof RandomAccess' check
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/Iterate.java`
#### Snippet
```java
        if (iterable instanceof RandomAccess)
        {
            return RandomAccessListIterate.detectWith((List<T>) iterable, predicate, parameter);
        }
        if (iterable != null)
```

### CastConflictsWithInstanceof
Cast to 'List' type conflicts with preceding 'instanceof RandomAccess' check
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/Iterate.java`
#### Snippet
```java
        if (xs instanceof RandomAccess)
        {
            return RandomAccessListIterate.zip((List<X>) xs, ys, targetCollection);
        }
        if (xs != null)
```

### CastConflictsWithInstanceof
Cast to 'List' type conflicts with preceding 'instanceof RandomAccess' check
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/Iterate.java`
#### Snippet
```java
        if (iterable instanceof RandomAccess)
        {
            return RandomAccessListIterate.anySatisfyWith((List<T>) iterable, predicate, parameter);
        }
        if (iterable != null)
```

### CastConflictsWithInstanceof
Cast to 'List' type conflicts with preceding 'instanceof RandomAccess' check
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/Iterate.java`
#### Snippet
```java
        if (iterable instanceof RandomAccess)
        {
            return RandomAccessListIterate.drop((List<T>) iterable, count);
        }
        if (iterable instanceof Collection)
```

### CastConflictsWithInstanceof
Cast to 'List' type conflicts with preceding 'instanceof RandomAccess' check
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/Iterate.java`
#### Snippet
```java
        if (iterable instanceof RandomAccess)
        {
            return RandomAccessListIterate.collect((List<T>) iterable, function, targetCollection);
        }
        if (iterable != null)
```

### CastConflictsWithInstanceof
Cast to 'List' type conflicts with preceding 'instanceof RandomAccess' check
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/Iterate.java`
#### Snippet
```java
        if (iterable instanceof RandomAccess)
        {
            return RandomAccessListIterate.collect((List<T>) iterable, function);
        }
        if (iterable instanceof Collection)
```

### CastConflictsWithInstanceof
Cast to 'List' type conflicts with preceding 'instanceof RandomAccess' check
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/Iterate.java`
#### Snippet
```java
        if (iterable instanceof RandomAccess)
        {
            return RandomAccessListIterate.groupByEach((List<T>) iterable, function, targetCollection);
        }
        if (iterable != null)
```

### CastConflictsWithInstanceof
Cast to 'List' type conflicts with preceding 'instanceof RandomAccess' check
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/Iterate.java`
#### Snippet
```java
        if (iterable instanceof RandomAccess)
        {
            return RandomAccessListIterate.getLast((List<T>) iterable);
        }
        if (iterable instanceof SortedSet && !((SortedSet<T>) iterable).isEmpty())
```

### CastConflictsWithInstanceof
Cast to 'List' type conflicts with preceding 'instanceof RandomAccess' check
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/Iterate.java`
#### Snippet
```java
        if (iterable instanceof RandomAccess)
        {
            return RandomAccessListIterate.take((List<T>) iterable, count);
        }
        if (iterable instanceof Collection)
```

### CastConflictsWithInstanceof
Cast to 'List' type conflicts with preceding 'instanceof RandomAccess' check
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/Iterate.java`
#### Snippet
```java
        if (iterable instanceof RandomAccess)
        {
            return RandomAccessListIterate.aggregateBy((List<T>) iterable, groupBy, zeroValueFactory, nonMutatingAggregator);
        }
        if (iterable != null)
```

### CastConflictsWithInstanceof
Cast to 'List' type conflicts with preceding 'instanceof RandomAccess' check
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/Iterate.java`
#### Snippet
```java
        if (iterable instanceof RandomAccess)
        {
            return RandomAccessListIterate.injectIntoWith(injectValue, (List<T>) iterable, function, parameter);
        }
        if (iterable != null)
```

### CastConflictsWithInstanceof
Cast to 'List' type conflicts with preceding 'instanceof RandomAccess' check
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/Iterate.java`
#### Snippet
```java
        if (iterable instanceof RandomAccess)
        {
            return RandomAccessListIterate.flatCollect((List<T>) iterable, function, targetCollection);
        }
        if (iterable != null)
```

### CastConflictsWithInstanceof
Cast to 'List' type conflicts with preceding 'instanceof RandomAccess' check
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/Iterate.java`
#### Snippet
```java
        if (iterable instanceof RandomAccess)
        {
            return RandomAccessListIterate.detectOptional((List<T>) iterable, predicate);
        }
        if (iterable != null)
```

### CastConflictsWithInstanceof
Cast to 'List' type conflicts with preceding 'instanceof RandomAccess' check
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/Iterate.java`
#### Snippet
```java
        if (iterable instanceof RandomAccess)
        {
            return RandomAccessListIterate.injectInto(injectValue, (List<T>) iterable, function);
        }
        if (iterable != null)
```

### CastConflictsWithInstanceof
Cast to 'List' type conflicts with preceding 'instanceof RandomAccess' check
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/Iterate.java`
#### Snippet
```java
        if (iterable instanceof RandomAccess)
        {
            return RandomAccessListIterate.allSatisfy((List<T>) iterable, predicate);
        }
        if (iterable != null)
```

### CastConflictsWithInstanceof
Cast to 'List' type conflicts with preceding 'instanceof RandomAccess' check
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/Iterate.java`
#### Snippet
```java
        else if (iterable instanceof RandomAccess)
        {
            RandomAccessListIterate.appendString((List<T>) iterable, appendable, start, separator, end);
        }
        else if (iterable != null)
```

### CastConflictsWithInstanceof
Cast to 'List' type conflicts with preceding 'instanceof RandomAccess' check
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/Iterate.java`
#### Snippet
```java
        if (iterable instanceof RandomAccess)
        {
            return RandomAccessListIterate.aggregateInPlaceBy((List<T>) iterable, groupBy, zeroValueFactory, mutatingAggregator);
        }
        if (iterable != null)
```

### CastConflictsWithInstanceof
Cast to 'List' type conflicts with preceding 'instanceof RandomAccess' check
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/Iterate.java`
#### Snippet
```java
        if (iterable instanceof RandomAccess)
        {
            return RandomAccessListIterate.groupByEach((List<T>) iterable, function);
        }
        if (iterable instanceof Collection)
```

### CastConflictsWithInstanceof
Cast to 'List' type conflicts with preceding 'instanceof RandomAccess' check
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/Iterate.java`
#### Snippet
```java
        if (xs instanceof RandomAccess)
        {
            return RandomAccessListIterate.zip((List<X>) xs, ys);
        }
        if (xs != null)
```

### CastConflictsWithInstanceof
Cast to 'List' type conflicts with preceding 'instanceof RandomAccess' check
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/Iterate.java`
#### Snippet
```java
        if (iterable instanceof RandomAccess)
        {
            return RandomAccessListIterate.detect((List<T>) iterable, predicate);
        }
        if (iterable != null)
```

### CastConflictsWithInstanceof
Cast to 'List' type conflicts with preceding 'instanceof RandomAccess' check
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/Iterate.java`
#### Snippet
```java
        if (iterable instanceof RandomAccess)
        {
            return RandomAccessListIterate.groupBy((List<T>) iterable, function, targetMultimap);
        }
        if (iterable != null)
```

### CastConflictsWithInstanceof
Cast to 'List' type conflicts with preceding 'instanceof RandomAccess' check
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/Iterate.java`
#### Snippet
```java
        if (iterable instanceof RandomAccess)
        {
            return RandomAccessListIterate.anySatisfy((List<T>) iterable, predicate);
        }
        if (iterable != null)
```

### CastConflictsWithInstanceof
Cast to 'List' type conflicts with preceding 'instanceof RandomAccess' check
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/Iterate.java`
#### Snippet
```java
        if (iterable instanceof RandomAccess)
        {
            return RandomAccessListIterate.injectInto(injectValue, (List<T>) iterable, function);
        }
        if (iterable != null)
```

### CastConflictsWithInstanceof
Cast to 'List' type conflicts with preceding 'instanceof RandomAccess' check
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/Iterate.java`
#### Snippet
```java
        if (iterable instanceof RandomAccess)
        {
            return RandomAccessListIterate.zipWithIndex((List<T>) iterable, targetCollection);
        }
        if (iterable != null)
```

### CastConflictsWithInstanceof
Cast to 'List' type conflicts with preceding 'instanceof RandomAccess' check
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/Iterate.java`
#### Snippet
```java
        if (iterable instanceof RandomAccess)
        {
            return RandomAccessListIterate.rejectWith((List<T>) iterable, predicate, parameter, targetCollection);
        }
        if (iterable != null)
```

### CastConflictsWithInstanceof
Cast to 'List' type conflicts with preceding 'instanceof RandomAccess' check
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/Iterate.java`
#### Snippet
```java
        if (iterable instanceof RandomAccess)
        {
            return RandomAccessListIterate.injectInto(injectValue, (List<T>) iterable, function);
        }
        if (iterable != null)
```

### CastConflictsWithInstanceof
Cast to 'List' type conflicts with preceding 'instanceof RandomAccess' check
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/Iterate.java`
#### Snippet
```java
        if (iterable instanceof RandomAccess)
        {
            return RandomAccessListIterate.minBy((List<T>) iterable, function);
        }
        if (iterable != null)
```

### CastConflictsWithInstanceof
Cast to 'List' type conflicts with preceding 'instanceof RandomAccess' check
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/Iterate.java`
#### Snippet
```java
        if (iterable instanceof RandomAccess)
        {
            return RandomAccessListIterate.noneSatisfyWith((List<T>) iterable, predicate, parameter);
        }
        if (iterable != null)
```

### CastConflictsWithInstanceof
Cast to 'List' type conflicts with preceding 'instanceof RandomAccess' check
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/Iterate.java`
#### Snippet
```java
        if (iterable instanceof RandomAccess)
        {
            return RandomAccessListIterate.flatCollect((List<T>) iterable, function);
        }
        if (iterable instanceof Collection)
```

### CastConflictsWithInstanceof
Cast to 'List' type conflicts with preceding 'instanceof RandomAccess' check
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/Iterate.java`
#### Snippet
```java
        if (iterable instanceof RandomAccess)
        {
            return RandomAccessListIterate.injectInto(injectValue, (List<T>) iterable, function);
        }
        if (iterable != null)
```

### CastConflictsWithInstanceof
Cast to 'List' type conflicts with preceding 'instanceof RandomAccess' check
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/Iterate.java`
#### Snippet
```java
        if (iterable instanceof RandomAccess)
        {
            return RandomAccessListIterate.maxBy((List<T>) iterable, function);
        }
        if (iterable != null)
```

### CastConflictsWithInstanceof
Cast to 'List' type conflicts with preceding 'instanceof RandomAccess' check
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/Iterate.java`
#### Snippet
```java
        if (iterable instanceof RandomAccess)
        {
            return RandomAccessListIterate.groupBy((List<T>) iterable, function);
        }
        if (iterable instanceof Collection)
```

### CastConflictsWithInstanceof
Cast to 'List' type conflicts with preceding 'instanceof RandomAccess' check
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/Iterate.java`
#### Snippet
```java
        if (iterable instanceof RandomAccess)
        {
            return RandomAccessListIterate.injectInto(injectValue, (List<T>) iterable, function);
        }
        if (iterable != null)
```

### CastConflictsWithInstanceof
Cast to 'List' type conflicts with preceding 'instanceof RandomAccess' check
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/Iterate.java`
#### Snippet
```java
        if (iterable instanceof RandomAccess)
        {
            return RandomAccessListIterate.collectWith((List<T>) iterable, function, parameter, targetCollection);
        }
        if (iterable != null)
```

### CastConflictsWithInstanceof
Cast to 'List' type conflicts with preceding 'instanceof RandomAccess' check
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/Iterate.java`
#### Snippet
```java
        if (iterable instanceof RandomAccess)
        {
            return RandomAccessListIterate.zipWithIndex((List<T>) iterable);
        }
        if (iterable instanceof Collection)
```

### CastConflictsWithInstanceof
Cast to 'List' type conflicts with preceding 'instanceof RandomAccess' check
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/Iterate.java`
#### Snippet
```java
        if (iterable instanceof RandomAccess)
        {
            return RandomAccessListIterate.allSatisfyWith((List<T>) iterable, predicate, parameter);
        }
        if (iterable != null)
```

### CastConflictsWithInstanceof
Cast to 'List' type conflicts with preceding 'instanceof RandomAccess' check
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/Iterate.java`
#### Snippet
```java
        if (iterable instanceof RandomAccess)
        {
            return RandomAccessListIterate.detectWithOptional((List<T>) iterable, predicate, parameter);
        }
        if (iterable != null)
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `remainingOccurrences` initializer `-1` is redundant
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/bag/immutable/ImmutableArrayBag.java`
#### Snippet
```java
    {
        private int position;
        private int remainingOccurrences = -1;

        private ArrayBagIterator()
```

### UnusedAssignment
Variable `isDaemon` initializer `true` is redundant
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/parallel/CollectionsThreadFactory.java`
#### Snippet
```java
    private final AtomicInteger threadNumber = new AtomicInteger(1);
    private final String namePrefix;
    private boolean isDaemon = true;

    CollectionsThreadFactory(String poolPrefix, boolean useDaemonThreads)
```

### UnusedAssignment
Variable `data` initializer `null` is redundant
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/ArrayListIterate.java`
#### Snippet
```java
    static
    {
        Field data = null;
        Field size = null;
        try
```

### UnusedAssignment
Variable `size` initializer `null` is redundant
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/ArrayListIterate.java`
#### Snippet
```java
    {
        Field data = null;
        Field size = null;
        try
        {
```

## RuleId[id=ConstantValue]
### ConstantValue
Result of `e.isEmpty()` is always 'false'
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/AnagramSetTest.java`
#### Snippet
```java
                .parallel()
                .map(list -> list.size() + ": " + list)
                .forEach(e -> Assert.assertFalse(e.isEmpty()));
    }

```

### ConstantValue
Result of `e.isEmpty()` is always 'false'
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/AnagramSetTest.java`
#### Snippet
```java
                .sorted(Comparator.<Set<String>>comparingInt(Set::size).reversed())
                .map(list -> list.size() + ": " + list)
                .forEach(e -> Assert.assertFalse(e.isEmpty()));
    }

```

### ConstantValue
Result of `e.isEmpty()` is always 'false'
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/AnagramSetTest.java`
#### Snippet
```java
                .parallel()
                .map(list -> list.size() + ": " + list)
                .forEach(e -> Assert.assertFalse(e.isEmpty()));
    }

```

### ConstantValue
Result of `e.isEmpty()` is always 'false'
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/AnagramSetTest.java`
#### Snippet
```java
                .sorted(Comparator.<Set<String>>comparingInt(Set::size).reversed())
                .map(list -> list.size() + ": " + list)
                .forEach(e -> Assert.assertFalse(e.isEmpty()));
    }

```

### ConstantValue
Result of `e.isEmpty()` is always 'false'
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/AnagramListTest.java`
#### Snippet
```java
                .sorted(Comparator.<List<String>>comparingInt(List::size).reversed())
                .map(list -> list.size() + ": " + list)
                .forEach(e -> Assert.assertFalse(e.isEmpty()));
    }

```

### ConstantValue
Result of `e.isEmpty()` is always 'false'
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/AnagramListTest.java`
#### Snippet
```java
                .sorted(Comparator.<List<String>>comparingInt(List::size).reversed())
                .map(list -> list.size() + ": " + list)
                .forEach(e -> Assert.assertFalse(e.isEmpty()));
    }

```

### ConstantValue
Result of `e.isEmpty()` is always 'false'
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/AnagramListTest.java`
#### Snippet
```java
                .sorted(Comparator.<List<String>>comparingInt(List::size).reversed())
                .map(list -> list.size() + ": " + list)
                .forEach(e -> Assert.assertFalse(e.isEmpty()));
    }

```

### ConstantValue
Result of `e.isEmpty()` is always 'false'
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/AnagramListTest.java`
#### Snippet
```java
                .sorted(Comparator.<List<String>>comparingInt(List::size).reversed())
                .map(list -> list.size() + ": " + list)
                .forEach(e -> Assert.assertFalse(e.isEmpty()));
    }

```

### ConstantValue
Result of `e.isEmpty()` is always 'false'
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/AnagramBagTest.java`
#### Snippet
```java
                .sorted(Comparator.<List<String>>comparingInt(List::size).reversed())
                .map(list -> list.size() + ": " + list)
                .forEach(e -> Assert.assertFalse(e.isEmpty()));
    }

```

### ConstantValue
Result of `e.isEmpty()` is always 'false'
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/AnagramBagTest.java`
#### Snippet
```java
                .sorted(Comparator.<List<String>>comparingInt(List::size).reversed())
                .map(list -> list.size() + ": " + list)
                .forEach(e -> Assert.assertFalse(e.isEmpty()));
    }

```

### ConstantValue
Result of `e.isEmpty()` is always 'false'
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/AnagramBagTest.java`
#### Snippet
```java
                .sorted(Comparator.<List<String>>comparingInt(List::size).reversed())
                .map(list -> list.size() + ": " + list)
                .forEach(e -> Assert.assertFalse(e.isEmpty()));
    }

```

### ConstantValue
Result of `e.isEmpty()` is always 'false'
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/AnagramBagTest.java`
#### Snippet
```java
                .sorted(Comparator.<List<String>>comparingInt(List::size).reversed())
                .map(list -> list.size() + ": " + list)
                .forEach(e -> Assert.assertFalse(e.isEmpty()));
    }

```

### ConstantValue
Value `source` is always 'null'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/bag/mutable/primitive/BooleanHashBag.java`
#### Snippet
```java
        }

        return new BooleanHashBag(source);
    }

```

### ConstantValue
Value `this.next` is always 'false'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/bag/immutable/ImmutableSingletonBag.java`
#### Snippet
```java
                return ImmutableSingletonBag.this.value;
            }
            throw new NoSuchElementException("i=" + this.next);
        }

```

### ConstantValue
Condition `entries != null` is always `true`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/UnifiedMap.java`
#### Snippet
```java
    {
        Set<? extends Entry<? extends K, ? extends V>> entries = map.entrySet();
        if (entries != null)
        {
            return entries;
```

### ConstantValue
Condition `entries != null` is always `true`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/strategy/mutable/UnifiedMapWithHashingStrategy.java`
#### Snippet
```java
    {
        Set<? extends Entry<? extends K, ? extends V>> entries = map.entrySet();
        if (entries != null)
        {
            return entries;
```

### ConstantValue
Condition `this.minusOneTwentyEightToPlusOneTwentySeven <= 127` is always `true`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/primitive/ByteHashSet.java`
#### Snippet
```java
            this.count++;

            while (this.minusOneTwentyEightToPlusOneTwentySeven <= 127)
            {
                if (ByteHashSet.this.contains(this.minusOneTwentyEightToPlusOneTwentySeven))
```

### ConstantValue
Condition `this.minusOneTwentyEightToPlusOneTwentySeven <= 127` is always `true`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/primitive/ByteHashSet.java`
#### Snippet
```java
                this.count++;

                while (this.minusOneTwentyEightToPlusOneTwentySeven <= 127)
                {
                    if (ImmutableByteHashSet.this.contains(this.minusOneTwentyEightToPlusOneTwentySeven))
```

### ConstantValue
Result of `i - 3` is always '0'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/UnifiedSet.java`
#### Snippet
```java
                        if (this.three instanceof ChainedBucket)
                        {
                            this.removeLongChain(this, i - 3);
                            return;
                        }
```

### ConstantValue
Result of `i - 3` is always '0'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/strategy/mutable/UnifiedSetWithHashingStrategy.java`
#### Snippet
```java
                        if (this.three instanceof ChainedBucket)
                        {
                            this.removeLongChain(this, i - 3);
                            return;
                        }
```

### ConstantValue
Condition `otherList instanceof LongInterval` is always `true`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/primitive/LongInterval.java`
#### Snippet
```java
        }

        if (otherList instanceof LongInterval)
        {
            LongInterval otherInterval = (LongInterval) otherList;
```

### ConstantValue
Condition `function instanceof ByteFunction` is always `false`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/Comparators.java`
#### Snippet
```java
            return Functions.toBooleanComparator((BooleanFunction<T>) function);
        }
        if (function instanceof ByteFunction)
        {
            return Functions.toByteComparator((ByteFunction<T>) function);
```

### ConstantValue
Value `function` is always 'null'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/Comparators.java`
#### Snippet
```java
            return Functions.toBooleanComparator((BooleanFunction<T>) function);
        }
        if (function instanceof ByteFunction)
        {
            return Functions.toByteComparator((ByteFunction<T>) function);
```

### ConstantValue
Condition `function instanceof CharFunction` is always `false`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/Comparators.java`
#### Snippet
```java
            return Functions.toByteComparator((ByteFunction<T>) function);
        }
        if (function instanceof CharFunction)
        {
            return Functions.toCharComparator((CharFunction<T>) function);
```

### ConstantValue
Value `function` is always 'null'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/Comparators.java`
#### Snippet
```java
            return Functions.toByteComparator((ByteFunction<T>) function);
        }
        if (function instanceof CharFunction)
        {
            return Functions.toCharComparator((CharFunction<T>) function);
```

### ConstantValue
Condition `function instanceof DoubleFunction` is always `false`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/Comparators.java`
#### Snippet
```java
            return Functions.toCharComparator((CharFunction<T>) function);
        }
        if (function instanceof DoubleFunction)
        {
            return Functions.toDoubleComparator((DoubleFunction<T>) function);
```

### ConstantValue
Value `function` is always 'null'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/Comparators.java`
#### Snippet
```java
            return Functions.toCharComparator((CharFunction<T>) function);
        }
        if (function instanceof DoubleFunction)
        {
            return Functions.toDoubleComparator((DoubleFunction<T>) function);
```

### ConstantValue
Condition `function instanceof FloatFunction` is always `false`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/Comparators.java`
#### Snippet
```java
            return Functions.toDoubleComparator((DoubleFunction<T>) function);
        }
        if (function instanceof FloatFunction)
        {
            return Functions.toFloatComparator((FloatFunction<T>) function);
```

### ConstantValue
Value `function` is always 'null'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/Comparators.java`
#### Snippet
```java
            return Functions.toDoubleComparator((DoubleFunction<T>) function);
        }
        if (function instanceof FloatFunction)
        {
            return Functions.toFloatComparator((FloatFunction<T>) function);
```

### ConstantValue
Condition `function instanceof IntFunction` is always `false`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/Comparators.java`
#### Snippet
```java
            return Functions.toFloatComparator((FloatFunction<T>) function);
        }
        if (function instanceof IntFunction)
        {
            return Functions.toIntComparator((IntFunction<T>) function);
```

### ConstantValue
Value `function` is always 'null'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/Comparators.java`
#### Snippet
```java
            return Functions.toFloatComparator((FloatFunction<T>) function);
        }
        if (function instanceof IntFunction)
        {
            return Functions.toIntComparator((IntFunction<T>) function);
```

### ConstantValue
Condition `function instanceof LongFunction` is always `false`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/Comparators.java`
#### Snippet
```java
            return Functions.toIntComparator((IntFunction<T>) function);
        }
        if (function instanceof LongFunction)
        {
            return Functions.toLongComparator((LongFunction<T>) function);
```

### ConstantValue
Value `function` is always 'null'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/Comparators.java`
#### Snippet
```java
            return Functions.toIntComparator((IntFunction<T>) function);
        }
        if (function instanceof LongFunction)
        {
            return Functions.toLongComparator((LongFunction<T>) function);
```

### ConstantValue
Condition `function instanceof ShortFunction` is always `false`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/Comparators.java`
#### Snippet
```java
            return Functions.toLongComparator((LongFunction<T>) function);
        }
        if (function instanceof ShortFunction)
        {
            return Functions.toShortComparator((ShortFunction<T>) function);
```

### ConstantValue
Value `function` is always 'null'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/Comparators.java`
#### Snippet
```java
            return Functions.toLongComparator((LongFunction<T>) function);
        }
        if (function instanceof ShortFunction)
        {
            return Functions.toShortComparator((ShortFunction<T>) function);
```

### ConstantValue
Condition `otherList instanceof IntList` is always `false`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/string/immutable/CodePointAdapter.java`
#### Snippet
```java
            return this.equalsCodePointAdapter((CodePointAdapter) otherList);
        }
        if (otherList instanceof IntList)
        {
            return this.equalsIntList((IntList) otherList);
```

### ConstantValue
Condition `valuesSize != expectedSize` is always `false`
in `eclipse-collections-testutils/src/main/java/org/eclipse/collections/impl/test/Verify.java`
#### Snippet
```java
            }
            int valuesSize = mutableMapIterable.values().size();
            if (valuesSize != expectedSize)
            {
                Assert.fail("Incorrect size for " + mapName + ".values(); expected:<" + expectedSize + "> but was:<" + actualSize + '>');
```

### ConstantValue
Condition `entrySetSize != expectedSize` is always `false`
in `eclipse-collections-testutils/src/main/java/org/eclipse/collections/impl/test/Verify.java`
#### Snippet
```java
            }
            int entrySetSize = mutableMapIterable.entrySet().size();
            if (entrySetSize != expectedSize)
            {
                Assert.fail("Incorrect size for " + mapName + ".entrySet(); expected:<" + expectedSize + "> but was:<" + actualSize + '>');
```

### ConstantValue
Condition `!actualMutableMapIterable.values().isEmpty()` is always `false`
in `eclipse-collections-testutils/src/main/java/org/eclipse/collections/impl/test/Verify.java`
#### Snippet
```java
                Assert.fail(mutableMapIterableName + " should be empty; actual size:<" + actualMutableMapIterable.keySet().size() + '>');
            }
            if (!actualMutableMapIterable.values().isEmpty())
            {
                Assert.fail(mutableMapIterableName + " should be empty; actual size:<" + actualMutableMapIterable.values().size() + '>');
```

### ConstantValue
Result of `actualMutableMapIterable.values().isEmpty()` is always 'true'
in `eclipse-collections-testutils/src/main/java/org/eclipse/collections/impl/test/Verify.java`
#### Snippet
```java
                Assert.fail(mutableMapIterableName + " should be empty; actual size:<" + actualMutableMapIterable.keySet().size() + '>');
            }
            if (!actualMutableMapIterable.values().isEmpty())
            {
                Assert.fail(mutableMapIterableName + " should be empty; actual size:<" + actualMutableMapIterable.values().size() + '>');
```

### ConstantValue
Condition `!actualMutableMapIterable.entrySet().isEmpty()` is always `false`
in `eclipse-collections-testutils/src/main/java/org/eclipse/collections/impl/test/Verify.java`
#### Snippet
```java
                Assert.fail(mutableMapIterableName + " should be empty; actual size:<" + actualMutableMapIterable.values().size() + '>');
            }
            if (!actualMutableMapIterable.entrySet().isEmpty())
            {
                Assert.fail(mutableMapIterableName + " should be empty; actual size:<" + actualMutableMapIterable.entrySet().size() + '>');
```

### ConstantValue
Result of `actualMutableMapIterable.entrySet().isEmpty()` is always 'true'
in `eclipse-collections-testutils/src/main/java/org/eclipse/collections/impl/test/Verify.java`
#### Snippet
```java
                Assert.fail(mutableMapIterableName + " should be empty; actual size:<" + actualMutableMapIterable.values().size() + '>');
            }
            if (!actualMutableMapIterable.entrySet().isEmpty())
            {
                Assert.fail(mutableMapIterableName + " should be empty; actual size:<" + actualMutableMapIterable.entrySet().size() + '>');
```

### ConstantValue
Condition `actualMap.size() != 0` is always `false`
in `eclipse-collections-testutils/src/main/java/org/eclipse/collections/impl/test/Verify.java`
#### Snippet
```java
                Assert.fail(mapName + " should be empty; actual size:<" + actualMap.size() + '>');
            }
            if (actualMap.size() != 0)
            {
                Assert.fail(mapName + " should be empty; actual size:<" + actualMap.size() + '>');
```

### ConstantValue
Condition `!actualMap.keySet().isEmpty()` is always `false`
in `eclipse-collections-testutils/src/main/java/org/eclipse/collections/impl/test/Verify.java`
#### Snippet
```java
                Assert.fail(mapName + " should be empty; actual size:<" + actualMap.size() + '>');
            }
            if (!actualMap.keySet().isEmpty())
            {
                Assert.fail(mapName + " should be empty; actual size:<" + actualMap.keySet().size() + '>');
```

### ConstantValue
Result of `actualMap.keySet().isEmpty()` is always 'true'
in `eclipse-collections-testutils/src/main/java/org/eclipse/collections/impl/test/Verify.java`
#### Snippet
```java
                Assert.fail(mapName + " should be empty; actual size:<" + actualMap.size() + '>');
            }
            if (!actualMap.keySet().isEmpty())
            {
                Assert.fail(mapName + " should be empty; actual size:<" + actualMap.keySet().size() + '>');
```

### ConstantValue
Condition `!actualMap.values().isEmpty()` is always `false`
in `eclipse-collections-testutils/src/main/java/org/eclipse/collections/impl/test/Verify.java`
#### Snippet
```java
                Assert.fail(mapName + " should be empty; actual size:<" + actualMap.keySet().size() + '>');
            }
            if (!actualMap.values().isEmpty())
            {
                Assert.fail(mapName + " should be empty; actual size:<" + actualMap.values().size() + '>');
```

### ConstantValue
Result of `actualMap.values().isEmpty()` is always 'true'
in `eclipse-collections-testutils/src/main/java/org/eclipse/collections/impl/test/Verify.java`
#### Snippet
```java
                Assert.fail(mapName + " should be empty; actual size:<" + actualMap.keySet().size() + '>');
            }
            if (!actualMap.values().isEmpty())
            {
                Assert.fail(mapName + " should be empty; actual size:<" + actualMap.values().size() + '>');
```

### ConstantValue
Condition `!actualMap.entrySet().isEmpty()` is always `false`
in `eclipse-collections-testutils/src/main/java/org/eclipse/collections/impl/test/Verify.java`
#### Snippet
```java
                Assert.fail(mapName + " should be empty; actual size:<" + actualMap.values().size() + '>');
            }
            if (!actualMap.entrySet().isEmpty())
            {
                Assert.fail(mapName + " should be empty; actual size:<" + actualMap.entrySet().size() + '>');
```

### ConstantValue
Result of `actualMap.entrySet().isEmpty()` is always 'true'
in `eclipse-collections-testutils/src/main/java/org/eclipse/collections/impl/test/Verify.java`
#### Snippet
```java
                Assert.fail(mapName + " should be empty; actual size:<" + actualMap.values().size() + '>');
            }
            if (!actualMap.entrySet().isEmpty())
            {
                Assert.fail(mapName + " should be empty; actual size:<" + actualMap.entrySet().size() + '>');
```

### ConstantValue
Result of `objectA.equals(null)` is always 'false'
in `eclipse-collections-testutils/src/main/java/org/eclipse/collections/impl/test/Verify.java`
#### Snippet
```java
            }

            Assert.assertFalse("Neither item should equal null", objectA.equals(null));
            Assert.assertFalse("Neither item should equal null", objectB.equals(null));
            Assert.assertNotEquals("Neither item should equal new Object()", objectA.equals(new Object()));
```

### ConstantValue
Result of `objectB.equals(null)` is always 'false'
in `eclipse-collections-testutils/src/main/java/org/eclipse/collections/impl/test/Verify.java`
#### Snippet
```java

            Assert.assertFalse("Neither item should equal null", objectA.equals(null));
            Assert.assertFalse("Neither item should equal null", objectB.equals(null));
            Assert.assertNotEquals("Neither item should equal new Object()", objectA.equals(new Object()));
            Assert.assertNotEquals("Neither item should equal new Object()", objectB.equals(new Object()));
```

## RuleId[id=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`OptionalInt.getAsInt()` without 'isPresent()' check
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/MinTest.java`
#### Snippet
```java
    public int serial_lazy_intstream_streams_ec()
    {
        return this.integersEC.stream().mapToInt(Integer::intValue).min().getAsInt();
    }

```

### OptionalGetWithoutIsPresent
`OptionalInt.getAsInt()` without 'isPresent()' check
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/MinTest.java`
#### Snippet
```java
    public int parallel_lazy_intstream_streams_ec()
    {
        return this.integersEC.parallelStream().mapToInt(Integer::intValue).min().getAsInt();
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/MinTest.java`
#### Snippet
```java
    public int serial_lazy_reverse_jdk()
    {
        return this.integersJDK.stream().min(Comparator.reverseOrder()).get();
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/MinTest.java`
#### Snippet
```java
    public int parallel_lazy_reverse_streams_ec()
    {
        return this.integersEC.parallelStream().min(Comparator.reverseOrder()).get();
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/MinTest.java`
#### Snippet
```java
    public int serial_lazy_streams_ec()
    {
        return this.integersEC.stream().min(Comparator.naturalOrder()).get();
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/MinTest.java`
#### Snippet
```java
    public int serial_lazy_reverse_streams_ec()
    {
        return this.integersEC.stream().min(Comparator.reverseOrder()).get();
    }

```

### OptionalGetWithoutIsPresent
`OptionalInt.getAsInt()` without 'isPresent()' check
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/MinTest.java`
#### Snippet
```java
    public int serial_lazy_intstream_jdk()
    {
        return this.integersJDK.stream().mapToInt(Integer::intValue).min().getAsInt();
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/MinTest.java`
#### Snippet
```java
    public int parallel_lazy_streams_ec()
    {
        return this.integersEC.parallelStream().min(Comparator.naturalOrder()).get();
    }

```

### OptionalGetWithoutIsPresent
`OptionalInt.getAsInt()` without 'isPresent()' check
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/MinTest.java`
#### Snippet
```java
    public int parallel_lazy_intstream_jdk()
    {
        return this.integersJDK.parallelStream().mapToInt(Integer::intValue).min().getAsInt();
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/MinTest.java`
#### Snippet
```java
    public int parallel_lazy_jdk()
    {
        return this.integersJDK.parallelStream().min(Comparator.naturalOrder()).get();
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/MinTest.java`
#### Snippet
```java
    public int parallel_lazy_reverse_jdk()
    {
        return this.integersJDK.parallelStream().min(Comparator.reverseOrder()).get();
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/MinTest.java`
#### Snippet
```java
    public int serial_lazy_jdk()
    {
        return this.integersJDK.stream().min(Comparator.naturalOrder()).get();
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/MaxByIntTest.java`
#### Snippet
```java
    {
        return this.positions.getJdkPositions().parallelStream().max(
                QUANTITY_COMPARATOR_LAMBDA).get();
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/MaxByIntTest.java`
#### Snippet
```java
    {
        return this.positions.getJdkPositions().parallelStream().collect(
                Collectors.maxBy(QUANTITY_COMPARATOR_LAMBDA)).get();
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/MaxByIntTest.java`
#### Snippet
```java
    {
        return this.positions.getJdkPositions().parallelStream().max(
                QUANTITY_COMPARATOR_METHODREF).get();
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/MaxByIntTest.java`
#### Snippet
```java
    {
        return this.positions.getJdkPositions().stream().collect(
                Collectors.maxBy(QUANTITY_COMPARATOR_METHODREF)).get();
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/MaxByIntTest.java`
#### Snippet
```java
    {
        return this.positions.getJdkPositions().stream().collect(
                Collectors.maxBy(QUANTITY_COMPARATOR_LAMBDA)).get();
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/MaxByIntTest.java`
#### Snippet
```java
    public Position maxByQuantity_serial_lazy_direct_lambda_jdk()
    {
        return this.positions.getJdkPositions().stream().max(QUANTITY_COMPARATOR_LAMBDA).get();
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/MaxByIntTest.java`
#### Snippet
```java
    {
        return this.positions.getJdkPositions().parallelStream().collect(
                Collectors.maxBy(QUANTITY_COMPARATOR_METHODREF)).get();
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/MaxByIntTest.java`
#### Snippet
```java
    public Position maxByQuantity_serial_lazy_direct_methodref_jdk()
    {
        return this.positions.getJdkPositions().stream().max(QUANTITY_COMPARATOR_METHODREF).get();
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/MinByDoubleTest.java`
#### Snippet
```java
    {
        return this.positions.getJdkPositions().parallelStream().min(
                MARKET_VALUE_COMPARATOR_LAMBDA).get();
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/MinByDoubleTest.java`
#### Snippet
```java
    public Position minByMarketValue_serial_lazy_direct_methodref_jdk()
    {
        return this.positions.getJdkPositions().stream().min(MARKET_VALUE_COMPARATOR_METHODREF).get();
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/MinByDoubleTest.java`
#### Snippet
```java
    public Position minByMarketValue_serial_lazy_direct_lambda_jdk()
    {
        return this.positions.getJdkPositions().stream().min(MARKET_VALUE_COMPARATOR_LAMBDA).get();
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/MinByDoubleTest.java`
#### Snippet
```java
    {
        return this.positions.getJdkPositions().parallelStream().min(
                MARKET_VALUE_COMPARATOR_METHODREF).get();
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/MinByDoubleTest.java`
#### Snippet
```java
    {
        return this.positions.getJdkPositions().stream().collect(
                Collectors.minBy(MARKET_VALUE_COMPARATOR_METHODREF)).get();
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/MinByDoubleTest.java`
#### Snippet
```java
    {
        return this.positions.getJdkPositions().parallelStream().collect(
                Collectors.minBy(MARKET_VALUE_COMPARATOR_LAMBDA)).get();
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/MinByDoubleTest.java`
#### Snippet
```java
    {
        return this.positions.getJdkPositions().stream().collect(
                Collectors.minBy(MARKET_VALUE_COMPARATOR_LAMBDA)).get();
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/MinByDoubleTest.java`
#### Snippet
```java
    {
        return this.positions.getJdkPositions().parallelStream().collect(
                Collectors.minBy(MARKET_VALUE_COMPARATOR_METHODREF)).get();
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/MaxByDoubleTest.java`
#### Snippet
```java
    {
        return this.positions.getJdkPositions().parallelStream().collect(
                Collectors.maxBy(MARKET_VALUE_COMPARATOR_METHODREF)).get();
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/MaxByDoubleTest.java`
#### Snippet
```java
    public Position maxByMarketValue_serial_lazy_direct_lambda_jdk()
    {
        return this.positions.getJdkPositions().stream().max(MARKET_VALUE_COMPARATOR_LAMBDA).get();
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/MaxByDoubleTest.java`
#### Snippet
```java
    {
        return this.positions.getJdkPositions().parallelStream().collect(
                Collectors.maxBy(MARKET_VALUE_COMPARATOR_LAMBDA)).get();
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/MaxByDoubleTest.java`
#### Snippet
```java
    {
        return this.positions.getJdkPositions().stream().collect(
                Collectors.maxBy(MARKET_VALUE_COMPARATOR_LAMBDA)).get();
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/MaxByDoubleTest.java`
#### Snippet
```java
    public Position maxByMarketValue_serial_lazy_direct_methodref_jdk()
    {
        return this.positions.getJdkPositions().stream().max(MARKET_VALUE_COMPARATOR_METHODREF).get();
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/MaxByDoubleTest.java`
#### Snippet
```java
    {
        return this.positions.getJdkPositions().parallelStream().max(
                MARKET_VALUE_COMPARATOR_LAMBDA).get();
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/MaxByDoubleTest.java`
#### Snippet
```java
    {
        return this.positions.getJdkPositions().stream().collect(
                Collectors.maxBy(MARKET_VALUE_COMPARATOR_METHODREF)).get();
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/MaxByDoubleTest.java`
#### Snippet
```java
    {
        return this.positions.getJdkPositions().parallelStream().max(
                MARKET_VALUE_COMPARATOR_METHODREF).get();
    }

```

### OptionalGetWithoutIsPresent
`OptionalInt.getAsInt()` without 'isPresent()' check
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/MaxTest.java`
#### Snippet
```java
    public int parallel_lazy_intstream_jdk()
    {
        return this.integersJDK.parallelStream().mapToInt(Integer::intValue).max().getAsInt();
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/MaxTest.java`
#### Snippet
```java
    public int parallel_lazy_reverse_streams_ec()
    {
        return this.integersEC.parallelStream().max(Comparator.reverseOrder()).get();
    }

```

### OptionalGetWithoutIsPresent
`OptionalInt.getAsInt()` without 'isPresent()' check
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/MaxTest.java`
#### Snippet
```java
    public int serial_lazy_intstream_streams_ec()
    {
        return this.integersEC.stream().mapToInt(Integer::intValue).max().getAsInt();
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/MaxTest.java`
#### Snippet
```java
    public int serial_lazy_jdk()
    {
        return this.integersJDK.stream().max(Comparator.naturalOrder()).get();
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/MaxTest.java`
#### Snippet
```java
    public int serial_lazy_reverse_jdk()
    {
        return this.integersJDK.stream().max(Comparator.reverseOrder()).get();
    }

```

### OptionalGetWithoutIsPresent
`OptionalInt.getAsInt()` without 'isPresent()' check
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/MaxTest.java`
#### Snippet
```java
    public int parallel_lazy_intstream_streams_ec()
    {
        return this.integersEC.parallelStream().mapToInt(Integer::intValue).max().getAsInt();
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/MaxTest.java`
#### Snippet
```java
    public int parallel_lazy_reverse_jdk()
    {
        return this.integersJDK.parallelStream().max(Comparator.reverseOrder()).get();
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/MaxTest.java`
#### Snippet
```java
    public int parallel_lazy_streams_ec()
    {
        return this.integersEC.parallelStream().max(Comparator.naturalOrder()).get();
    }

```

### OptionalGetWithoutIsPresent
`OptionalInt.getAsInt()` without 'isPresent()' check
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/MaxTest.java`
#### Snippet
```java
    public int serial_lazy_intstream_jdk()
    {
        return this.integersJDK.stream().mapToInt(Integer::intValue).max().getAsInt();
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/MaxTest.java`
#### Snippet
```java
    public int parallel_lazy_jdk()
    {
        return this.integersJDK.parallelStream().max(Comparator.naturalOrder()).get();
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/MaxTest.java`
#### Snippet
```java
    public int serial_lazy_reverse_streams_ec()
    {
        return this.integersEC.stream().max(Comparator.reverseOrder()).get();
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/MinByIntTest.java`
#### Snippet
```java
    {
        return this.positions.getJdkPositions().parallelStream().collect(
                Collectors.minBy(QUANTITY_COMPARATOR_LAMBDA)).get();
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/MinByIntTest.java`
#### Snippet
```java
    {
        return this.positions.getJdkPositions().parallelStream().min(
                QUANTITY_COMPARATOR_METHODREF).get();
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/MinByIntTest.java`
#### Snippet
```java
    {
        return this.positions.getJdkPositions().stream().collect(
                Collectors.minBy(QUANTITY_COMPARATOR_LAMBDA)).get();
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/MinByIntTest.java`
#### Snippet
```java
    {
        return this.positions.getJdkPositions().stream().collect(
                Collectors.minBy(QUANTITY_COMPARATOR_METHODREF)).get();
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/MinByIntTest.java`
#### Snippet
```java
    {
        return this.positions.getJdkPositions().parallelStream().collect(
                Collectors.minBy(QUANTITY_COMPARATOR_METHODREF)).get();
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/MinByIntTest.java`
#### Snippet
```java
    {
        return this.positions.getJdkPositions().parallelStream().min(
                QUANTITY_COMPARATOR_LAMBDA).get();
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/MinByIntTest.java`
#### Snippet
```java
    public Position minByQuantity_serial_lazy_direct_lambda_jdk()
    {
        return this.positions.getJdkPositions().stream().min(QUANTITY_COMPARATOR_LAMBDA).get();
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/MinByIntTest.java`
#### Snippet
```java
    public Position minByQuantity_serial_lazy_direct_methodref_jdk()
    {
        return this.positions.getJdkPositions().stream().min(QUANTITY_COMPARATOR_METHODREF).get();
    }

```

## RuleId[id=IOResource]
### IOResource
'ObjectOutputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `eclipse-collections-testutils/src/main/java/org/eclipse/collections/impl/test/Verify.java`
#### Snippet
```java
            Verify.assertThrows(NotSerializableException.class, () ->
            {
                new ObjectOutputStream(new ByteArrayOutputStream()).writeObject(actualObject);
                return null;
            });
```

### IOResource
'ObjectInputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `eclipse-collections-testutils/src/main/java/org/eclipse/collections/impl/test/Verify.java`
#### Snippet
```java
        {
            byte[] bytes = DECODER.decode(expectedBase64Form);
            return new ObjectInputStream(new ByteArrayInputStream(bytes)).readObject();
        }
        catch (IOException | ClassNotFoundException e)
```

## RuleId[id=ManualArrayToCollectionCopy]
### ManualArrayToCollectionCopy
Manual array to collection copy
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/sorted/immutable/ImmutableTreeSet.java`
#### Snippet
```java
        MutableSortedSet<T> output = SortedSets.mutable.of(this.comparator());

        for (int i = 0; i < count; i++)
        {
            output.add(this.delegate[i]);
```

### ManualArrayToCollectionCopy
Manual array to collection copy
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/ArrayIterate.java`
#### Snippet
```java
            throw new IllegalArgumentException("Count must be greater than zero, but was: " + count);
        }
        for (int i = count; i < array.length; i++)
        {
            target.add(array[i]);
```

### ManualArrayToCollectionCopy
Manual array to collection copy
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/ArrayIterate.java`
#### Snippet
```java
        }
        int end = Math.min(array.length, count);
        for (int i = 0; i < end; i++)
        {
            target.add(array[i]);
```

### ManualArrayToCollectionCopy
Manual array to collection copy
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/ArrayListIterate.java`
#### Snippet
```java
            T[] elements = ArrayListIterate.getInternalArray(list);

            for (int i = count; i < size; i++)
            {
                targetList.add(elements[i]);
```

### ManualArrayToCollectionCopy
Manual array to collection copy
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/ArrayListIterate.java`
#### Snippet
```java
                    MutableList<T> rejected = result.getRejected();
                    rejected.add(each);
                    for (int j = i + 1; j < size; j++)
                    {
                        rejected.add(elements[j]);
```

### ManualArrayToCollectionCopy
Manual array to collection copy
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/ArrayListIterate.java`
#### Snippet
```java

            int end = Math.min(size, count);
            for (int i = 0; i < end; i++)
            {
                targetList.add(elements[i]);
```

### ManualArrayToCollectionCopy
Manual array to collection copy
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/ArrayListIterate.java`
#### Snippet
```java
                {
                    result.add(element);
                    for (int j = i + 1; j < size; j++)
                    {
                        T eachNotDropped = elements[j];
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Array index is out of bounds
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/AbstractRichIterable.java`
#### Snippet
```java
                : array;

        this.forEachWithIndex((each, index) -> result[index] = (E) each);
        if (result.length > size)
        {
```

### DataFlowIssue
Array index is out of bounds
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/AbstractRichIterable.java`
#### Snippet
```java
    {
        Object[] result = new Object[this.size()];
        this.forEachWithIndex((each, index) -> result[index] = each);
        return result;
    }
```

### DataFlowIssue
Method invocation `toSet` will produce `NullPointerException`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/bag/mutable/primitive/BooleanHashBag.java`
#### Snippet
```java
    {
        int oldSize = this.size();
        BooleanSet set = elements instanceof BooleanSet ? (BooleanSet) elements : elements.toSet();
        if (!set.contains(true) && this.containsTrue())
        {
```

### DataFlowIssue
Method invocation `toSet` will produce `NullPointerException`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/primitive/ObjectBooleanHashMap.java`
#### Snippet
```java
        {
            int oldSize = ObjectBooleanHashMap.this.size();
            BooleanSet sourceSet = source instanceof BooleanSet ? (BooleanSet) source : source.toSet();
            ObjectBooleanHashMap<K> retained = ObjectBooleanHashMap.this.select((object, value) -> sourceSet.contains(value));
            if (retained.size() != oldSize)
```

### DataFlowIssue
Method invocation `toSet` will produce `NullPointerException`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/primitive/ObjectBooleanHashMapWithHashingStrategy.java`
#### Snippet
```java
        {
            int oldSize = ObjectBooleanHashMapWithHashingStrategy.this.size();
            BooleanSet sourceSet = source instanceof BooleanSet ? (BooleanSet) source : source.toSet();
            ObjectBooleanHashMapWithHashingStrategy<K> retained = ObjectBooleanHashMapWithHashingStrategy.this.select((object, value) -> sourceSet.contains(value));
            if (retained.size() != oldSize)
```

### DataFlowIssue
Method invocation `toArray` will produce `NullPointerException`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/primitive/BooleanHashSet.java`
#### Snippet
```java
        }

        return BooleanHashSet.newSetWith(source.toArray());
    }

```

### DataFlowIssue
Method invocation `toArray` will produce `NullPointerException`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/primitive/ByteHashSet.java`
#### Snippet
```java
        }

        return ByteHashSet.newSetWith(source.toArray());
    }

```

### DataFlowIssue
Method invocation `toSet` will produce `NullPointerException`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/primitive/ByteHashSet.java`
#### Snippet
```java
    {
        int oldSize = this.size();
        ByteSet sourceSet = source instanceof ByteSet ? (ByteSet) source : source.toSet();

        ByteHashSet retained = this.select(sourceSet::contains);
```

### DataFlowIssue
Method invocation `toArray` will produce `NullPointerException`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/immutable/primitive/ImmutableBooleanSetFactoryImpl.java`
#### Snippet
```java
            return (ImmutableBooleanSet) items;
        }
        return this.with(items.toArray());
    }

```

### DataFlowIssue
Array index is out of bounds
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/lazy/TakeIterable.java`
#### Snippet
```java
    {
        Object[] result = new Object[this.count];
        this.forEachWithIndex((each, index) -> result[index] = each);
        return result;
    }
```

### DataFlowIssue
Argument `this.nonSentinel(chainedDetect)` might be null
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/UnifiedSet.java`
#### Snippet
```java
                if (chainedDetect != null)
                {
                    return Optional.of(this.nonSentinel(chainedDetect));
                }
            }
```

### DataFlowIssue
Argument `each` might be null
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/UnifiedSet.java`
#### Snippet
```java
                if (predicate.accept(each))
                {
                    return Optional.of(each);
                }
            }
```

### DataFlowIssue
Array index is out of bounds
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/lazy/primitive/CollectBooleanIterable.java`
#### Snippet
```java
    {
        boolean[] array = new boolean[this.size()];
        this.iterable.forEachWithIndex((each, index) -> array[index] = this.function.booleanValueOf(each));
        return array;
    }
```

### DataFlowIssue
Array index is out of bounds
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/Interval.java`
#### Snippet
```java
    {
        int[] result = new int[this.size()];
        this.forEachWithIndex((IntIntProcedure) (each, index) -> result[index] = each);
        return result;
    }
```

### DataFlowIssue
Array index is out of bounds
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/Interval.java`
#### Snippet
```java
    {
        Integer[] result = new Integer[this.size()];
        this.forEachWithIndex((ObjectIntProcedure<Integer>) (each, index) -> result[index] = each);
        return result;
    }
```

### DataFlowIssue
Argument `this.nonSentinel(chainedDetect)` might be null
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/strategy/mutable/UnifiedSetWithHashingStrategy.java`
#### Snippet
```java
                if (chainedDetect != null)
                {
                    return Optional.of(this.nonSentinel(chainedDetect));
                }
            }
```

### DataFlowIssue
Argument `each` might be null
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/strategy/mutable/UnifiedSetWithHashingStrategy.java`
#### Snippet
```java
                if (predicate.accept(each))
                {
                    return Optional.of(each);
                }
            }
```

### DataFlowIssue
Array index is out of bounds
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/mutable/CompositeFastList.java`
#### Snippet
```java
                : (Object[]) Array.newInstance(array.getClass().getComponentType(), size);

        this.forEachWithIndex((each, index) -> result[index] = each);

        if (result.length > size)
```

### DataFlowIssue
Array index is out of bounds
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/mutable/CompositeFastList.java`
#### Snippet
```java
    {
        Object[] result = new Object[this.size()];
        this.forEachWithIndex((each, index) -> result[index] = each);
        return result;
    }
```

### DataFlowIssue
Method invocation `toSet` will produce `NullPointerException`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/mutable/primitive/BooleanArrayList.java`
#### Snippet
```java
    {
        int oldSize = this.size();
        BooleanSet sourceSet = source instanceof BooleanSet ? (BooleanSet) source : source.toSet();
        BooleanArrayList retained = this.select(sourceSet::contains);

```

### DataFlowIssue
Array index is out of bounds
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/primitive/LongInterval.java`
#### Snippet
```java
    {
        long[] result = new long[this.size()];
        this.forEachWithIndex((each, index) -> result[index] = each);
        return result;
    }
```

### DataFlowIssue
Array index is out of bounds
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/primitive/LongInterval.java`
#### Snippet
```java
        }
        long[] finalBypass = result;
        this.forEachWithIndex((each, index) -> finalBypass[index] = each);
        return result;
    }
```

### DataFlowIssue
Array index is out of bounds
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/primitive/IntInterval.java`
#### Snippet
```java
        }
        int[] finalBypass = result;
        this.forEachWithIndex((each, index) -> finalBypass[index] = each);
        return result;
    }
```

### DataFlowIssue
Array index is out of bounds
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/primitive/IntInterval.java`
#### Snippet
```java
    {
        int[] result = new int[this.size()];
        this.forEachWithIndex((each, index) -> result[index] = each);
        return result;
    }
```

### DataFlowIssue
Condition `function instanceof BooleanFunction` is redundant and can be replaced with a null check
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/Comparators.java`
#### Snippet
```java
    private static <T, V extends Comparable<? super V>> SerializableComparator<T> getPrimitiveFunctionComparator(Function<? super T, ? extends V> function)
    {
        if (function instanceof BooleanFunction)
        {
            return Functions.toBooleanComparator((BooleanFunction<T>) function);
```

### DataFlowIssue
Method invocation `makeString` will produce `NullPointerException`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/string/immutable/CharAdapter.java`
#### Snippet
```java
            return new CharAdapter(iterable.toString());
        }
        return new CharAdapter(iterable.makeString(""));
    }

```

### DataFlowIssue
Method invocation `toArray` will produce `NullPointerException`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/string/immutable/CodePointList.java`
#### Snippet
```java
            return new CodePointList((ImmutableIntList) iterable);
        }
        return new CodePointList(iterable.toArray());
    }

```

### DataFlowIssue
Method invocation `injectInto` will produce `NullPointerException`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/string/immutable/CodePointAdapter.java`
#### Snippet
```java
            return new CodePointAdapter(iterable.toString());
        }
        StringBuilder builder = iterable.injectInto(new StringBuilder(), StringBuilder::appendCodePoint);
        return new CodePointAdapter(builder.toString());
    }
```

### DataFlowIssue
Result of 'min' is the same as the second argument making the call meaningless
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/internal/RandomAccessListIterate.java`
#### Snippet
```java
            return targetList;
        }
        int start = Math.min(list.size(), count);
        targetList.addAll(list.subList(start, list.size()));
        return targetList;
```

### DataFlowIssue
Unboxing of `this.map.get(1)` may produce `NullPointerException`
in `jcstress-tests/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMapValuesRemoveIfTest.java`
#### Snippet
```java
    public void after(Z_Result r)
    {
        r.r1 = this.map.containsKey(1) && this.map.get(1);
    }
}
```

### DataFlowIssue
Unboxing of `this.map.get(1)` may produce `NullPointerException`
in `jcstress-tests/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMapEntrySetRemoveIfTest.java`
#### Snippet
```java
    public void after(Z_Result r)
    {
        r.r1 = this.map.containsKey(1) && this.map.get(1);
    }
}
```

## RuleId[id=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
'collect(maxBy())' can be replaced with 'max()' (may change semantics)
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/MaxByIntTest.java`
#### Snippet
```java
    public Position maxByQuantity_parallel_lazy_collect_lambda_jdk()
    {
        return this.positions.getJdkPositions().parallelStream().collect(
                Collectors.maxBy(QUANTITY_COMPARATOR_LAMBDA)).get();
    }

```

### SimplifyStreamApiCallChains
'collect(maxBy())' can be replaced with 'max()' (may change semantics)
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/MaxByIntTest.java`
#### Snippet
```java
    public Position maxByQuantity_serial_lazy_collect_methodref_jdk()
    {
        return this.positions.getJdkPositions().stream().collect(
                Collectors.maxBy(QUANTITY_COMPARATOR_METHODREF)).get();
    }

```

### SimplifyStreamApiCallChains
'collect(maxBy())' can be replaced with 'max()' (may change semantics)
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/MaxByIntTest.java`
#### Snippet
```java
    public Position maxByQuantity_serial_lazy_collect_lambda_jdk()
    {
        return this.positions.getJdkPositions().stream().collect(
                Collectors.maxBy(QUANTITY_COMPARATOR_LAMBDA)).get();
    }

```

### SimplifyStreamApiCallChains
'collect(maxBy())' can be replaced with 'max()' (may change semantics)
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/MaxByIntTest.java`
#### Snippet
```java
    public Position maxByQuantity_parallel_lazy_collect_methodref_jdk()
    {
        return this.positions.getJdkPositions().parallelStream().collect(
                Collectors.maxBy(QUANTITY_COMPARATOR_METHODREF)).get();
    }

```

### SimplifyStreamApiCallChains
'collect(minBy())' can be replaced with 'min()' (may change semantics)
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/MinByDoubleTest.java`
#### Snippet
```java
    public Position minByMarketValue_serial_lazy_collect_methodref_jdk()
    {
        return this.positions.getJdkPositions().stream().collect(
                Collectors.minBy(MARKET_VALUE_COMPARATOR_METHODREF)).get();
    }

```

### SimplifyStreamApiCallChains
'collect(minBy())' can be replaced with 'min()' (may change semantics)
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/MinByDoubleTest.java`
#### Snippet
```java
    public Position minByMarketValue_parallel_lazy_collect_lambda_jdk()
    {
        return this.positions.getJdkPositions().parallelStream().collect(
                Collectors.minBy(MARKET_VALUE_COMPARATOR_LAMBDA)).get();
    }

```

### SimplifyStreamApiCallChains
'collect(minBy())' can be replaced with 'min()' (may change semantics)
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/MinByDoubleTest.java`
#### Snippet
```java
    public Position minByMarketValue_serial_lazy_collect_lambda_jdk()
    {
        return this.positions.getJdkPositions().stream().collect(
                Collectors.minBy(MARKET_VALUE_COMPARATOR_LAMBDA)).get();
    }

```

### SimplifyStreamApiCallChains
'collect(minBy())' can be replaced with 'min()' (may change semantics)
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/MinByDoubleTest.java`
#### Snippet
```java
    public Position minByMarketValue_parallel_lazy_collect_methodref_jdk()
    {
        return this.positions.getJdkPositions().parallelStream().collect(
                Collectors.minBy(MARKET_VALUE_COMPARATOR_METHODREF)).get();
    }

```

### SimplifyStreamApiCallChains
Can be replaced with '.values().stream()'
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/AnagramSetTest.java`
#### Snippet
```java
        groupBy.entrySet()
                .stream()
                .map(Map.Entry::getValue)
                .filter(list -> list.size() >= SIZE_THRESHOLD)
                .sorted(Comparator.<Set<String>>comparingInt(Set::size).reversed())
```

### SimplifyStreamApiCallChains
Can be replaced with '.values().stream()'
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/AnagramSetTest.java`
#### Snippet
```java
        groupBy.entrySet()
                .stream()
                .map(Map.Entry::getValue)
                .filter(list -> list.size() >= SIZE_THRESHOLD)
                .sorted(Comparator.<Set<String>>comparingInt(Set::size).reversed())
```

### SimplifyStreamApiCallChains
Can be replaced with '.values().stream()'
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/AnagramListTest.java`
#### Snippet
```java
        groupBy.entrySet()
                .stream()
                .map(Map.Entry::getValue)
                .filter(list -> list.size() >= SIZE_THRESHOLD)
                .sorted(Comparator.<List<String>>comparingInt(List::size).reversed())
```

### SimplifyStreamApiCallChains
Can be replaced with '.values().stream()'
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/AnagramListTest.java`
#### Snippet
```java
        groupBy.entrySet()
                .stream()
                .map(Map.Entry::getValue)
                .filter(list -> list.size() >= SIZE_THRESHOLD)
                .sorted(Comparator.<List<String>>comparingInt(List::size).reversed())
```

### SimplifyStreamApiCallChains
'collect(maxBy())' can be replaced with 'max()' (may change semantics)
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/MaxByDoubleTest.java`
#### Snippet
```java
    public Position maxByMarketValue_parallel_lazy_collect_methodref_jdk()
    {
        return this.positions.getJdkPositions().parallelStream().collect(
                Collectors.maxBy(MARKET_VALUE_COMPARATOR_METHODREF)).get();
    }

```

### SimplifyStreamApiCallChains
'collect(maxBy())' can be replaced with 'max()' (may change semantics)
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/MaxByDoubleTest.java`
#### Snippet
```java
    public Position maxByMarketValue_parallel_lazy_collect_lambda_jdk()
    {
        return this.positions.getJdkPositions().parallelStream().collect(
                Collectors.maxBy(MARKET_VALUE_COMPARATOR_LAMBDA)).get();
    }

```

### SimplifyStreamApiCallChains
'collect(maxBy())' can be replaced with 'max()' (may change semantics)
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/MaxByDoubleTest.java`
#### Snippet
```java
    public Position maxByMarketValue_serial_lazy_collect_lambda_jdk()
    {
        return this.positions.getJdkPositions().stream().collect(
                Collectors.maxBy(MARKET_VALUE_COMPARATOR_LAMBDA)).get();
    }

```

### SimplifyStreamApiCallChains
'collect(maxBy())' can be replaced with 'max()' (may change semantics)
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/MaxByDoubleTest.java`
#### Snippet
```java
    public Position maxByMarketValue_serial_lazy_collect_methodref_jdk()
    {
        return this.positions.getJdkPositions().stream().collect(
                Collectors.maxBy(MARKET_VALUE_COMPARATOR_METHODREF)).get();
    }

```

### SimplifyStreamApiCallChains
Can be replaced with '.values().stream()'
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/AnagramBagTest.java`
#### Snippet
```java
        groupBy.entrySet()
                .stream()
                .map(Map.Entry::getValue)
                .filter(list -> list.size() >= SIZE_THRESHOLD)
                .sorted(Comparator.<List<String>>comparingInt(List::size).reversed())
```

### SimplifyStreamApiCallChains
Can be replaced with '.values().stream()'
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/AnagramBagTest.java`
#### Snippet
```java
        groupBy.entrySet()
                .stream()
                .map(Map.Entry::getValue)
                .filter(list -> list.size() >= SIZE_THRESHOLD)
                .sorted(Comparator.<List<String>>comparingInt(List::size).reversed())
```

### SimplifyStreamApiCallChains
'collect(minBy())' can be replaced with 'min()' (may change semantics)
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/MinByIntTest.java`
#### Snippet
```java
    public Position minByQuantity_parallel_lazy_collect_lambda_jdk()
    {
        return this.positions.getJdkPositions().parallelStream().collect(
                Collectors.minBy(QUANTITY_COMPARATOR_LAMBDA)).get();
    }

```

### SimplifyStreamApiCallChains
'collect(minBy())' can be replaced with 'min()' (may change semantics)
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/MinByIntTest.java`
#### Snippet
```java
    public Position minByQuantity_serial_lazy_collect_lambda_jdk()
    {
        return this.positions.getJdkPositions().stream().collect(
                Collectors.minBy(QUANTITY_COMPARATOR_LAMBDA)).get();
    }

```

### SimplifyStreamApiCallChains
'collect(minBy())' can be replaced with 'min()' (may change semantics)
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/MinByIntTest.java`
#### Snippet
```java
    public Position minByQuantity_serial_lazy_collect_methodref_jdk()
    {
        return this.positions.getJdkPositions().stream().collect(
                Collectors.minBy(QUANTITY_COMPARATOR_METHODREF)).get();
    }

```

### SimplifyStreamApiCallChains
'collect(minBy())' can be replaced with 'min()' (may change semantics)
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/MinByIntTest.java`
#### Snippet
```java
    public Position minByQuantity_parallel_lazy_collect_methodref_jdk()
    {
        return this.positions.getJdkPositions().parallelStream().collect(
                Collectors.minBy(QUANTITY_COMPARATOR_METHODREF)).get();
    }

```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/CountTest.java`
#### Snippet
```java
            this.integersEC.asParallel(this.executorService, BATCH_SIZE).forEach(new CountProcedure<>());

            this.integersJDK.stream().forEach(Assert::assertNotNull);
            this.integersJDK.stream().forEach(each -> Assert.assertEquals(each, each));

```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/CountTest.java`
#### Snippet
```java

            this.integersJDK.stream().forEach(Assert::assertNotNull);
            this.integersJDK.stream().forEach(each -> Assert.assertEquals(each, each));

            this.integersJDK.parallelStream().forEach(Assert::assertNotNull);
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/CountSetTest.java`
#### Snippet
```java
            this.integersEC.asParallel(this.executorService, BATCH_SIZE).forEach(new CountProcedure<>());

            this.integersJDK.stream().forEach(Assert::assertNotNull);
            this.integersJDK.stream().forEach(each -> Assert.assertEquals(each, each));

```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/CountSetTest.java`
#### Snippet
```java

            this.integersJDK.stream().forEach(Assert::assertNotNull);
            this.integersJDK.stream().forEach(each -> Assert.assertEquals(each, each));

            this.integersJDK.parallelStream().forEach(Assert::assertNotNull);
```

## RuleId[id=ParameterCanBeLocal]
### ParameterCanBeLocal
Parameter can be converted to a local variable
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMap.java`
#### Snippet
```java
    }

    private V slowGet(Object key, int hash, int index, AtomicReferenceArray currentArray)
    {
        while (true)
```

### ParameterCanBeLocal
Parameter can be converted to a local variable
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMapUnsafe.java`
#### Snippet
```java
    }

    private V slowGet(Object key, int hash, int index, Object[] currentArray)
    {
        while (true)
```

## RuleId[id=TypeParameterHidesVisibleType]
### TypeParameterHidesVisibleType
Type parameter `T` hides type parameter 'T'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/UnmodifiableRichIterable.java`
#### Snippet
```java

    @Override
    public <T> T[] toArray(T[] a)
    {
        return this.iterable.toArray(a);
```

### TypeParameterHidesVisibleType
Type parameter `T` hides type parameter 'T'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/bag/immutable/ImmutableEmptyBag.java`
#### Snippet
```java

    @Override
    public <T> T[] toArray(T[] a)
    {
        if (a.length > 0)
```

### TypeParameterHidesVisibleType
Type parameter `T` hides type parameter 'T'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/bag/immutable/ImmutableHashBag.java`
#### Snippet
```java

    @Override
    public <T> T[] toArray(T[] a)
    {
        return this.delegate.toArray(a);
```

### TypeParameterHidesVisibleType
Type parameter `K` hides type parameter 'K'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/MapAdapter.java`
#### Snippet
```java

    @Override
    public <K, V> MutableMap<K, V> newEmpty(int capacity)
    {
        return UnifiedMap.newMap(capacity);
```

### TypeParameterHidesVisibleType
Type parameter `V` hides type parameter 'V'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/MapAdapter.java`
#### Snippet
```java

    @Override
    public <K, V> MutableMap<K, V> newEmpty(int capacity)
    {
        return UnifiedMap.newMap(capacity);
```

### TypeParameterHidesVisibleType
Type parameter `K` hides type parameter 'K'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/AbstractMutableMap.java`
#### Snippet
```java
     * Creates a new instance of the same type, using the given capacity and the default growth parameters.
     */
    public abstract <K, V> MutableMap<K, V> newEmpty(int capacity);

    @Override
```

### TypeParameterHidesVisibleType
Type parameter `V` hides type parameter 'V'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/AbstractMutableMap.java`
#### Snippet
```java
     * Creates a new instance of the same type, using the given capacity and the default growth parameters.
     */
    public abstract <K, V> MutableMap<K, V> newEmpty(int capacity);

    @Override
```

### TypeParameterHidesVisibleType
Type parameter `K` hides type parameter 'K'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/primitive/ObjectBooleanHashMap.java`
#### Snippet
```java
        }

        public class InternalKeysViewIterator<K> implements Iterator<K>
        {
            private int count;
```

### TypeParameterHidesVisibleType
Type parameter `K` hides type parameter 'K'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/primitive/ObjectBooleanHashMapWithHashingStrategy.java`
#### Snippet
```java
        }

        public class InternalKeysViewIterator<K> implements Iterator<K>
        {
            private int count;
```

### TypeParameterHidesVisibleType
Type parameter `K` hides type parameter 'K'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentMutableHashMap.java`
#### Snippet
```java

    @Override
    public <K, V> MutableMap<K, V> newEmpty(int capacity)
    {
        return ConcurrentMutableHashMap.newMap();
```

### TypeParameterHidesVisibleType
Type parameter `V` hides type parameter 'V'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentMutableHashMap.java`
#### Snippet
```java

    @Override
    public <K, V> MutableMap<K, V> newEmpty(int capacity)
    {
        return ConcurrentMutableHashMap.newMap();
```

### TypeParameterHidesVisibleType
Type parameter `K` hides type parameter 'K'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMap.java`
#### Snippet
```java

    @Override
    public <K, V> MutableMap<K, V> newEmpty(int capacity)
    {
        return ConcurrentHashMap.newMap();
```

### TypeParameterHidesVisibleType
Type parameter `V` hides type parameter 'V'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMap.java`
#### Snippet
```java

    @Override
    public <K, V> MutableMap<K, V> newEmpty(int capacity)
    {
        return ConcurrentHashMap.newMap();
```

### TypeParameterHidesVisibleType
Type parameter `K` hides type parameter 'K'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMapUnsafe.java`
#### Snippet
```java

    @Override
    public <K, V> MutableMap<K, V> newEmpty(int capacity)
    {
        return ConcurrentHashMapUnsafe.newMap();
```

### TypeParameterHidesVisibleType
Type parameter `V` hides type parameter 'V'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMapUnsafe.java`
#### Snippet
```java

    @Override
    public <K, V> MutableMap<K, V> newEmpty(int capacity)
    {
        return ConcurrentHashMapUnsafe.newMap();
```

### TypeParameterHidesVisibleType
Type parameter `T` hides type parameter 'T'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/UnifiedSet.java`
#### Snippet
```java

    @Override
    public <T> T[] toArray(T[] array)
    {
        int size = this.size();
```

### TypeParameterHidesVisibleType
Type parameter `T` hides type parameter 'T'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/strategy/mutable/UnifiedSetWithHashingStrategy.java`
#### Snippet
```java

    @Override
    public <T> T[] toArray(T[] array)
    {
        int size = this.size();
```

### TypeParameterHidesVisibleType
Type parameter `T` hides type parameter 'T'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/stack/mutable/ArrayStack.java`
#### Snippet
```java

    @Override
    public <T> T[] toArray(T[] a)
    {
        return this.delegate.asReversed().toArray(a);
```

### TypeParameterHidesVisibleType
Type parameter `T` hides type parameter 'T'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/stack/mutable/UnmodifiableStack.java`
#### Snippet
```java

    @Override
    public <T> T[] toArray(T[] a)
    {
        return this.mutableStack.toArray(a);
```

### TypeParameterHidesVisibleType
Type parameter `T` hides type parameter 'T'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/stack/immutable/ImmutableArrayStack.java`
#### Snippet
```java

    @Override
    public <T> T[] toArray(T[] a)
    {
        return this.delegate.asReversed().toArray(a);
```

### TypeParameterHidesVisibleType
Type parameter `T` hides type parameter 'T'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/stack/mutable/SynchronizedStack.java`
#### Snippet
```java

    @Override
    public <T> T[] toArray(T[] a)
    {
        synchronized (this.lock)
```

### TypeParameterHidesVisibleType
Type parameter `T` hides type parameter 'T'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/collection/AbstractSynchronizedRichIterable.java`
#### Snippet
```java

    @Override
    public <T> T[] toArray(T[] a)
    {
        synchronized (this.lock)
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'DEFAULT_LOAD_FACTOR' is still used
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/primitive/ObjectBooleanHashMap.java`
#### Snippet
```java
     */
    @Deprecated
    private static final float DEFAULT_LOAD_FACTOR = 0.5f;
    private static final int OCCUPIED_DATA_RATIO = 2;
    private static final int OCCUPIED_SENTINEL_RATIO = 4;
```

### DeprecatedIsStillUsed
Deprecated member 'ConcurrentMutableHashMap' is still used
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentMutableHashMap.java`
#### Snippet
```java
 */
@Deprecated
public final class ConcurrentMutableHashMap<K, V>
        extends AbstractMutableMap<K, V>
        implements ConcurrentMutableMap<K, V>, Serializable
```

### DeprecatedIsStillUsed
Deprecated member 'DropIterator' is still used
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/lazy/iterator/DropIterator.java`
#### Snippet
```java
 */
@Deprecated
public final class DropIterator<T> implements Iterator<T>
{
    private final Iterator<T> delegateIterator;
```

### DeprecatedIsStillUsed
Deprecated member 'originalReverseNaturalOrder' is still used
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/Comparators.java`
#### Snippet
```java
     */
    @Deprecated
    public static <T> SerializableComparator<T> originalReverseNaturalOrder()
    {
        return (SerializableComparator<T>) REVERSE_NATURAL_ORDER_COMPARATOR;
```

### DeprecatedIsStillUsed
Deprecated member 'originalByFunction' is still used
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/Comparators.java`
#### Snippet
```java
     */
    @Deprecated
    public static <T, V> SerializableComparator<T> originalByFunction(Function<? super T, ? extends V> function, Comparator<V> comparator)
    {
        return new FunctionComparator<>(function, comparator);
```

### DeprecatedIsStillUsed
Deprecated member 'originalByFunction' is still used
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/Comparators.java`
#### Snippet
```java
     */
    @Deprecated
    public static <T, V extends Comparable<? super V>> SerializableComparator<T> originalByFunction(Function<? super T, ? extends V> function)
    {
        SerializableComparator<T> comparator = Comparators.getPrimitiveFunctionComparator(function);
```

### DeprecatedIsStillUsed
Deprecated member 'originalNaturalOrder' is still used
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/Comparators.java`
#### Snippet
```java
     */
    @Deprecated
    public static <T> SerializableComparator<T> originalNaturalOrder()
    {
        return (SerializableComparator<T>) NATURAL_ORDER_COMPARATOR;
```

### DeprecatedIsStillUsed
Deprecated member 'CharPredicate' is still used
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/predicate/primitive/CharPredicate.java`
#### Snippet
```java
@FunctionalInterface
@Deprecated
public interface CharPredicate
        extends Serializable
{
```

### DeprecatedIsStillUsed
Deprecated member 'getValueFunction' is still used
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/tuple/AbstractImmutableEntry.java`
#### Snippet
```java
     */
    @Deprecated
    public static <V> Function<Map.Entry<?, V>, V> getValueFunction()
    {
        return Functions.getValueFunction();
```

### DeprecatedIsStillUsed
Deprecated member 'getKeyFunction' is still used
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/tuple/AbstractImmutableEntry.java`
#### Snippet
```java
     */
    @Deprecated
    public static <K> Function<Map.Entry<K, ?>, K> getKeyFunction()
    {
        return Functions.getKeyFunction();
```

### DeprecatedIsStillUsed
Deprecated member 'ImmutableArrayStack' is still used
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/stack/immutable/ImmutableArrayStack.java`
#### Snippet
```java
 */
@Deprecated
final class ImmutableArrayStack<T> implements ImmutableStack<T>, Serializable
{
    private static final long serialVersionUID = 1L;
```

### DeprecatedIsStillUsed
Deprecated member 'csvTokensToSortedList' is still used
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/StringIterate.java`
#### Snippet
```java
     */
    @Deprecated
    public static MutableList<String> csvTokensToSortedList(String string)
    {
        return StringIterate.tokensToSortedList(string, ",");
```

### DeprecatedIsStillUsed
Deprecated member 'csvTokensToReverseSortedList' is still used
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/StringIterate.java`
#### Snippet
```java
     */
    @Deprecated
    public static MutableList<String> csvTokensToReverseSortedList(String string)
    {
        return StringIterate.tokensToReverseSortedList(string, ",");
```

### DeprecatedIsStillUsed
Deprecated member 'csvTokensToList' is still used
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/StringIterate.java`
#### Snippet
```java
     */
    @Deprecated
    public static MutableList<String> csvTokensToList(String string)
    {
        return StringIterate.tokensToList(string, ",");
```

### DeprecatedIsStillUsed
Deprecated member 'asLowercaseSet' is still used
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/StringIterate.java`
#### Snippet
```java
     */
    @Deprecated
    public static MutableSet<Character> asLowercaseSet(String string)
    {
        return StringIterate.toLowercaseSet(string);
```

### DeprecatedIsStillUsed
Deprecated member 'csvTrimmedTokensToList' is still used
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/StringIterate.java`
#### Snippet
```java
     */
    @Deprecated
    public static MutableList<String> csvTrimmedTokensToList(String string)
    {
        return StringIterate.trimmedTokensToList(string, ",");
```

### DeprecatedIsStillUsed
Deprecated member 'csvTrimmedTokensToSortedList' is still used
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/StringIterate.java`
#### Snippet
```java
     */
    @Deprecated
    public static MutableList<String> csvTrimmedTokensToSortedList(String string)
    {
        return StringIterate.trimmedTokensToSortedList(string, ",");
```

### DeprecatedIsStillUsed
Deprecated member 'csvTokensToSet' is still used
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/StringIterate.java`
#### Snippet
```java
     */
    @Deprecated
    public static MutableSet<String> csvTokensToSet(String string)
    {
        return StringIterate.tokensToSet(string, ",");
```

### DeprecatedIsStillUsed
Deprecated member 'asUppercaseSet' is still used
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/StringIterate.java`
#### Snippet
```java
     */
    @Deprecated
    public static MutableSet<Character> asUppercaseSet(String string)
    {
        return StringIterate.toUppercaseSet(string);
```

### DeprecatedIsStillUsed
Deprecated member 'EMPTY_CLASS_ARRAY' is still used
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/internal/ReflectionHelper.java`
#### Snippet
```java
    @SuppressWarnings("rawtypes")
    @Deprecated
    public static final Class[] EMPTY_CLASS_ARRAY = {};

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'assertShallowClone' is still used
in `eclipse-collections-testutils/src/main/java/org/eclipse/collections/impl/test/Verify.java`
#### Snippet
```java
     */
    @Deprecated
    public static void assertShallowClone(Cloneable object)
    {
        try
```

## RuleId[id=Convert2MethodRef]
### Convert2MethodRef
Lambda can be replaced with method reference
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/CountTest.java`
#### Snippet
```java
            Assert.assertEquals(
                    500001500000L,
                    this.integersJDK.stream().mapToLong(each -> each + 1).reduce(0, (accum, each) -> accum + each));

            Assert.assertEquals(
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/CountTest.java`
#### Snippet
```java
            Assert.assertEquals(
                    500001500000L,
                    this.integersJDK.parallelStream().mapToLong(each -> each + 1).reduce(0, (accum, each) -> accum + each));

            Assert.assertEquals(
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/CountSetTest.java`
#### Snippet
```java
            Assert.assertEquals(
                    500001500000L,
                    this.integersJDK.stream().mapToLong(each -> each + 1).reduce(0, (accum, each) -> accum + each));

            Assert.assertEquals(
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/CountSetTest.java`
#### Snippet
```java
            Assert.assertEquals(
                    500001500000L,
                    this.integersJDK.parallelStream().mapToLong(each -> each + 1).reduce(0, (accum, each) -> accum + each));

            Assert.assertEquals(
```

## RuleId[id=ComparatorCombinators]
### ComparatorCombinators
Can be replaced with 'Comparator.comparingInt'
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/MaxByIntTest.java`
#### Snippet
```java

    private static final Comparator<Position> QUANTITY_COMPARATOR_LAMBDA =
            (Position p1, Position p2) -> Integer.compare(p1.getQuantity(), p2.getQuantity());

    private final Positions positions = new Positions(SIZE).shuffle();
```

### ComparatorCombinators
Can be replaced with 'Comparator.comparingDouble'
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/MinByDoubleTest.java`
#### Snippet
```java

    private static final Comparator<Position> MARKET_VALUE_COMPARATOR_LAMBDA =
            (Position p1, Position p2) -> Double.compare(p1.getMarketValue(), p2.getMarketValue());

    private final Positions positions = new Positions(SIZE).shuffle();
```

### ComparatorCombinators
Can be replaced with 'Comparator.comparingDouble'
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/MaxByDoubleTest.java`
#### Snippet
```java

    private static final Comparator<Position> MARKET_VALUE_COMPARATOR_LAMBDA =
            (Position p1, Position p2) -> Double.compare(p1.getMarketValue(), p2.getMarketValue());

    private final Positions positions = new Positions(SIZE).shuffle();
```

### ComparatorCombinators
Can be replaced with 'Comparator.comparingInt'
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/MinByIntTest.java`
#### Snippet
```java

    private static final Comparator<Position> QUANTITY_COMPARATOR_LAMBDA =
            (Position p1, Position p2) -> Integer.compare(p1.getQuantity(), p2.getQuantity());

    private final Positions positions = new Positions(SIZE).shuffle();
```

## RuleId[id=RedundantComparatorComparing]
### RedundantComparatorComparing
Comparator method can be simplified if 'min()' call is replaced with 'max()'
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/MinTest.java`
#### Snippet
```java
    public int serial_lazy_reverse_jdk()
    {
        return this.integersJDK.stream().min(Comparator.reverseOrder()).get();
    }

```

### RedundantComparatorComparing
Comparator method can be simplified if 'min()' call is replaced with 'max()'
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/MinTest.java`
#### Snippet
```java
    public int parallel_lazy_reverse_streams_ec()
    {
        return this.integersEC.parallelStream().min(Comparator.reverseOrder()).get();
    }

```

### RedundantComparatorComparing
Comparator method can be simplified if 'min()' call is replaced with 'max()'
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/MinTest.java`
#### Snippet
```java
    public int serial_lazy_reverse_streams_ec()
    {
        return this.integersEC.stream().min(Comparator.reverseOrder()).get();
    }

```

### RedundantComparatorComparing
Comparator method can be simplified if 'min()' call is replaced with 'max()'
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/MinTest.java`
#### Snippet
```java
    public int parallel_lazy_reverse_jdk()
    {
        return this.integersJDK.parallelStream().min(Comparator.reverseOrder()).get();
    }

```

### RedundantComparatorComparing
Comparator method can be simplified if 'max()' call is replaced with 'min()'
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/MaxTest.java`
#### Snippet
```java
    public int parallel_lazy_reverse_streams_ec()
    {
        return this.integersEC.parallelStream().max(Comparator.reverseOrder()).get();
    }

```

### RedundantComparatorComparing
Comparator method can be simplified if 'max()' call is replaced with 'min()'
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/MaxTest.java`
#### Snippet
```java
    public int serial_lazy_reverse_jdk()
    {
        return this.integersJDK.stream().max(Comparator.reverseOrder()).get();
    }

```

### RedundantComparatorComparing
Comparator method can be simplified if 'max()' call is replaced with 'min()'
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/MaxTest.java`
#### Snippet
```java
    public int parallel_lazy_reverse_jdk()
    {
        return this.integersJDK.parallelStream().max(Comparator.reverseOrder()).get();
    }

```

### RedundantComparatorComparing
Comparator method can be simplified if 'max()' call is replaced with 'min()'
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/MaxTest.java`
#### Snippet
```java
    public int serial_lazy_reverse_streams_ec()
    {
        return this.integersEC.stream().max(Comparator.reverseOrder()).get();
    }

```

## RuleId[id=ShiftOutOfRange]
### ShiftOutOfRange
Shift operation `>>>` by out-of-bounds value {64..127}
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/primitive/ByteHashSet.java`
#### Snippet
```java
        if (value <= MAX_BYTE_GROUP_1)
        {
            return ((this.bitGroup1 >>> (byte) ((value + 1) * -1)) & 1L) != 0;
        }
        if (value <= MAX_BYTE_GROUP_2)
```

### ShiftOutOfRange
Shift operation `>>>` by out-of-bounds value {64..127}
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/primitive/ByteHashSet.java`
#### Snippet
```java
        }

        return ((this.bitGroup4 >>> value) & 1L) != 0;
    }

```

### ShiftOutOfRange
Shift operation `<<` by out-of-bounds value {-128, 64..127}
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/primitive/ByteHashSet.java`
#### Snippet
```java
            byte value = (byte) Long.numberOfTrailingZeros(bitGroup1);
            procedure.value((byte) ((value + 65) * -1));
            bitGroup1 &= ~(1L << (byte) (value + 64));
        }

```

### ShiftOutOfRange
Shift operation `<<` by out-of-bounds value {-128, 64..127}
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/primitive/ByteHashSet.java`
#### Snippet
```java
            byte value = (byte) Long.numberOfTrailingZeros(bitGroup4);
            procedure.value((byte) (value + 64));
            bitGroup4 &= ~(1L << (byte) (value + 64));
        }
    }
```

### ShiftOutOfRange
Shift operation `<<` by out-of-bounds value {64..127}
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/primitive/ByteHashSet.java`
#### Snippet
```java
            long initial = this.bitGroup1;

            this.bitGroup1 |= 1L << (byte) ((element + 1) * -1);

            if (this.bitGroup1 != initial)
```

### ShiftOutOfRange
Shift operation `<<` by out-of-bounds value {64..127}
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/primitive/ByteHashSet.java`
#### Snippet
```java
            long initial = this.bitGroup4;

            this.bitGroup4 |= 1L << element;

            if (this.bitGroup4 != initial)
```

### ShiftOutOfRange
Shift operation `<<` by out-of-bounds value {-128, 64..127}
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/primitive/ByteHashSet.java`
#### Snippet
```java
                byte value = (byte) Long.numberOfTrailingZeros(bitGroup1);
                procedure.value((byte) ((value + 65) * -1));
                bitGroup1 &= ~(1L << (byte) (value + 64));
            }

```

### ShiftOutOfRange
Shift operation `<<` by out-of-bounds value {-128, 64..127}
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/primitive/ByteHashSet.java`
#### Snippet
```java
                byte value = (byte) Long.numberOfTrailingZeros(bitGroup4);
                procedure.value((byte) (value + 64));
                bitGroup4 &= ~(1L << (byte) (value + 64));
            }
        }
```

### ShiftOutOfRange
Shift operation `>>>` by out-of-bounds value {64..127}
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/primitive/ByteHashSet.java`
#### Snippet
```java
            if (value <= MAX_BYTE_GROUP_1)
            {
                return ((this.bitGroup1 >>> (byte) ((value + 1) * -1)) & 1L) != 0;
            }
            if (value <= MAX_BYTE_GROUP_2)
```

### ShiftOutOfRange
Shift operation `>>>` by out-of-bounds value {64..127}
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/primitive/ByteHashSet.java`
#### Snippet
```java
            }

            return ((this.bitGroup4 >>> value) & 1L) != 0;
        }

```

### ShiftOutOfRange
Shift operation `<<` by out-of-bounds value {64..127}
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/primitive/ByteHashSet.java`
#### Snippet
```java
        {
            long initial = this.bitGroup1;
            this.bitGroup1 &= ~(1L << (byte) ((value + 1) * -1));
            if (this.bitGroup1 == initial)
            {
```

### ShiftOutOfRange
Shift operation `<<` by out-of-bounds value {64..127}
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/primitive/ByteHashSet.java`
#### Snippet
```java

        long initial = this.bitGroup4;
        this.bitGroup4 &= ~(1L << value);
        if (this.bitGroup4 == initial)
        {
```

## RuleId[id=AbstractMethodCallInConstructor]
### AbstractMethodCallInConstructor
Call to 'abstract' method `createMap()` during object construction
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/multimap/AbstractMutableMultimap.java`
#### Snippet
```java
    protected AbstractMutableMultimap()
    {
        this.map = this.createMap();
    }

```

### AbstractMethodCallInConstructor
Call to 'abstract' method `createMapWithKeyCount()` during object construction
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/multimap/AbstractMutableMultimap.java`
#### Snippet
```java
    protected AbstractMutableMultimap(int size)
    {
        this.map = this.createMapWithKeyCount(size);
    }

```

## RuleId[id=RedundantCollectionOperation]
### RedundantCollectionOperation
`iterator` can be replaced with 'Collections.emptyIterator()'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/mutable/CompositeFastList.java`
#### Snippet
```java
        if (this.lists.isEmpty())
        {
            return Collections.<E>emptyList().iterator();
        }
        return new CompositeIterator(this.lists);
```

## RuleId[id=NonSerializableFieldInSerializableClass]
### NonSerializableFieldInSerializableClass
Non-serializable field 'keys' in a Serializable class
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/primitive/ObjectBooleanHashMap.java`
#### Snippet
```java
    };

    private Object[] keys;
    private BitSet values;

```

### NonSerializableFieldInSerializableClass
Non-serializable field 'keys' in a Serializable class
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/primitive/ObjectBooleanHashMapWithHashingStrategy.java`
#### Snippet
```java
    };

    private Object[] keys;
    private BitSet values;

```

### NonSerializableFieldInSerializableClass
Non-serializable field 'table' in a Serializable class
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMapUnsafe.java`
#### Snippet
```java
     * The table, resized as necessary. Length MUST Always be a power of two + 1.
     */
    private volatile Object[] table;

    private int[] partitionedSize;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'stream' in a Serializable class
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/Procedures.java`
#### Snippet
```java
        private static final long serialVersionUID = 1L;

        private final PrintStream stream;

        private PrintlnProcedure(PrintStream stream)
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'twin' in a Serializable class
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/Predicates.java`
#### Snippet
```java
    {
        private static final long serialVersionUID = 1L;
        private final Object twin;

        private NotIdentityPredicate(Object object)
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'twin' in a Serializable class
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/Predicates.java`
#### Snippet
```java
    {
        private static final long serialVersionUID = 1L;
        private final Object twin;

        private IdentityPredicate(Object object)
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'compareObject' in a Serializable class
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/Predicates.java`
#### Snippet
```java
    {
        private static final long serialVersionUID = 1L;
        private final Object compareObject;

        private EqualPredicate(Object newCompareObject)
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'compareObject' in a Serializable class
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/Predicates.java`
#### Snippet
```java
    {
        private static final long serialVersionUID = 1L;
        private final Object compareObject;

        private NotEqualPredicate(Object newCompareObject)
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'lock' in a Serializable class
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/stack/mutable/SynchronizedStack.java`
#### Snippet
```java
{
    private static final long serialVersionUID = 1L;
    private final Object lock;
    private final MutableStack<T> delegate;

```

### NonSerializableFieldInSerializableClass
Non-serializable field 'partitionMutableStack' in a Serializable class
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/partition/stack/PartitionArrayStack.java`
#### Snippet
```java

        private final Predicate<? super T> predicate;
        private final PartitionArrayStack<T> partitionMutableStack;

        public PartitionProcedure(Predicate<? super T> predicate, PartitionArrayStack<T> partitionMutableStack)
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'partitionMutableStack' in a Serializable class
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/partition/stack/PartitionArrayStack.java`
#### Snippet
```java
        private final Predicate2<? super T, ? super P> predicate;
        private final P parameter;
        private final PartitionArrayStack<T> partitionMutableStack;

        public PartitionPredicate2Procedure(Predicate2<? super T, ? super P> predicate, P parameter, PartitionArrayStack<T> partitionMutableStack)
```

## RuleId[id=MismatchedJavadocCode]
### MismatchedJavadocCode
Method is specified to return 'true' but its return type is not boolean
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/StringPredicates2.java`
#### Snippet
```java

    /**
     * Returns true if a String passed to the accept method starts with the string specified on the predicate.
     */
    public static Predicates2<String, String> startsWith()
```

### MismatchedJavadocCode
Method is specified to return 'false' but its return type is not boolean
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/StringPredicates2.java`
#### Snippet
```java

    /**
     * Returns false if a String passed to the accept method starts with the string specified on the predicate.
     *
     * @since 5.0
```

### MismatchedJavadocCode
Method is specified to return 'true' but its return type is not boolean
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/StringPredicates2.java`
#### Snippet
```java

    /**
     * Returns true if a String specified on the predicate is contained within a String passed to the accept
     * method.
     */
```

### MismatchedJavadocCode
Method is specified to return 'true' but its return type is not boolean
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/StringPredicates2.java`
#### Snippet
```java

    /**
     * Returns true if a String passed to the accept method ends with the string specified on the predicate.
     */
    public static Predicates2<String, String> endsWith()
```

### MismatchedJavadocCode
Method is specified to return 'true' but its return type is not boolean
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/StringPredicates2.java`
#### Snippet
```java

    /**
     * Returns true if a String specified on the predicate is contained within a String passed to the accept
     * method.
     *
```

### MismatchedJavadocCode
Method is specified to return 'false' but its return type is not boolean
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/StringPredicates2.java`
#### Snippet
```java

    /**
     * Returns false if a String passed to the accept method ends with the string specified on the predicate.
     *
     * @since 5.0
```

### MismatchedJavadocCode
Method is specified to return 'true' but its return type is not boolean
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/StringPredicates.java`
#### Snippet
```java

    /**
     * Returns true if a char specified on the predicate is contained within a String passed to the accept
     * method.
     */
```

### MismatchedJavadocCode
Method is specified to return 'true' but its return type is not boolean
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/StringPredicates.java`
#### Snippet
```java

    /**
     * Returns true if a String passed to the accept method starts with the string specified on the predicate.
     */
    public static Predicates<String> startsWith(String substring)
```

### MismatchedJavadocCode
Method is specified to return 'true' but its return type is not boolean
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/StringPredicates.java`
#### Snippet
```java

    /**
     * Returns true if a String passed to the accept method ends with the string specified on the predicate.
     */
    public static Predicates<String> endsWith(String substring)
```

### MismatchedJavadocCode
Method is specified to return 'true' but its return type is not boolean
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/StringPredicates.java`
#### Snippet
```java

    /**
     * Returns true if a String specified on the predicate is contained within a String passed to the accept
     * method.
     *
```

### MismatchedJavadocCode
Method is specified to return 'true' but its return type is not boolean
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/StringPredicates.java`
#### Snippet
```java

    /**
     * Returns true if a String specified on the predicate is contained within a String passed to the accept
     * method.
     */
```

## RuleId[id=AssignmentToForLoopParameter]
### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/mutable/primitive/BooleanArrayList.java`
#### Snippet
```java
            {
                this.removeAtIndex(i);
                i--;
                modified = true;
            }
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/internal/RandomAccessListIterate.java`
#### Snippet
```java
            {
                procedure.value(each);
                list.remove(i--);
                changed = true;
            }
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/internal/RandomAccessListIterate.java`
#### Snippet
```java
            if (predicate.accept(each, parameter))
            {
                list.remove(i--);
                changed = true;
            }
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/internal/RandomAccessListIterate.java`
#### Snippet
```java
            if (predicate.accept(each))
            {
                list.remove(i--);
                changed = true;
            }
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/internal/RandomAccessListIterate.java`
#### Snippet
```java
            {
                procedure.value(each);
                list.remove(i--);
                changed = true;
            }
```

## RuleId[id=StringEqualsEmptyString]
### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/lazy/parallel/AbstractParallelIterable.java`
#### Snippet
```java
                public void safeValue(Appendable accumulator, String each) throws IOException
                {
                    if ("".equals(each))
                    {
                        return;
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/StringIterate.java`
#### Snippet
```java
    private static boolean charactersSatisfy(String string, CodePointPredicate predicate)
    {
        return !"".equals(string) && StringIterate.allSatisfyCodePoint(string, predicate);
    }

```

## RuleId[id=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/bag/mutable/HashBag.java`
#### Snippet
```java
    public static <E> HashBag<E> newBag(Bag<? extends E> source)
    {
        //noinspection SSBasedInspection
        HashBag<E> result = HashBag.newBag(source.sizeDistinct());
        result.addAllBag(source);
```

### RedundantSuppression
Redundant suppression
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/bag/mutable/MutableBagFactoryImpl.java`
#### Snippet
```java
    public <T> MutableBag<T> withAll(Iterable<? extends T> items)
    {
        //noinspection SSBasedInspection
        return HashBag.newBag(items);
    }
```

### RedundantSuppression
Redundant suppression
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/bag/mutable/MutableBagFactoryImpl.java`
#### Snippet
```java
            throw new IllegalArgumentException("initial capacity cannot be less than 0");
        }
        //noinspection SSBasedInspection
        return HashBag.newBag(capacity);
    }
```

### RedundantSuppression
Redundant suppression
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/bag/sorted/mutable/MutableSortedBagFactoryImpl.java`
#### Snippet
```java
    public <T> MutableSortedBag<T> empty()
    {
        //noinspection SSBasedInspection
        return TreeBag.newBag();
    }
```

### RedundantSuppression
Redundant suppression
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/bag/sorted/mutable/MutableSortedBagFactoryImpl.java`
#### Snippet
```java
    public <T> MutableSortedBag<T> empty(Comparator<? super T> comparator)
    {
        //noinspection SSBasedInspection
        return TreeBag.newBag(comparator);
    }
```

### RedundantSuppression
Redundant suppression
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/bag/sorted/mutable/MutableSortedBagFactoryImpl.java`
#### Snippet
```java
    public <T> MutableSortedBag<T> with()
    {
        //noinspection SSBasedInspection
        return TreeBag.newBag();
    }
```

### RedundantSuppression
Redundant suppression
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/bag/sorted/mutable/MutableSortedBagFactoryImpl.java`
#### Snippet
```java
    public <T> MutableSortedBag<T> with(Comparator<? super T> comparator)
    {
        //noinspection SSBasedInspection
        return TreeBag.newBag(comparator);
    }
```

### RedundantSuppression
Redundant suppression
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/bag/sorted/mutable/MutableSortedBagFactoryImpl.java`
#### Snippet
```java
    public <T> MutableSortedBag<T> withAll(Iterable<? extends T> items)
    {
        //noinspection SSBasedInspection
        return TreeBag.newBag(items);
    }
```

### RedundantSuppression
Redundant suppression
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/bag/sorted/mutable/MutableSortedBagFactoryImpl.java`
#### Snippet
```java
    public <T> MutableSortedBag<T> withAll(Comparator<? super T> comparator, Iterable<? extends T> items)
    {
        //noinspection SSBasedInspection
        return TreeBag.newBag(comparator, items);
    }
```

### RedundantSuppression
Redundant suppression
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/bag/sorted/mutable/TreeBag.java`
#### Snippet
```java
    public static <E> TreeBag<E> newBagWith(E... elements)
    {
        //noinspection SSBasedInspection
        return TreeBag.newBag(Arrays.asList(elements));
    }
```

### RedundantSuppression
Redundant suppression
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/bag/sorted/mutable/TreeBag.java`
#### Snippet
```java
    public static <E> TreeBag<E> newBagWith(Comparator<? super E> comparator, E... elements)
    {
        //noinspection SSBasedInspection
        return TreeBag.newBag(comparator, Arrays.asList(elements));
    }
```

### RedundantSuppression
Redundant suppression
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/function/AddFunction.java`
#### Snippet
```java
    public static final Function2<Long, Long, Long> LONG = new AddLongFunction();
    public static final Function2<String, String, String> STRING = new AddStringFunction();
    //noinspection rawtypes
    @SuppressWarnings("unchecked")
    public static final Function2<Collection<?>, ?, Collection<?>> COLLECTION = new AddCollectionFunction();
```

### RedundantSuppression
Redundant suppression
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/factory/Bags.java`
#### Snippet
```java

@SuppressWarnings("ConstantNamingConvention")
public final class Bags
{
    public static final ImmutableBagFactory immutable = ImmutableBagFactoryImpl.INSTANCE;
```

### RedundantSuppression
Redundant suppression
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/factory/BiMaps.java`
#### Snippet
```java
 */
@SuppressWarnings("ConstantNamingConvention")
public final class BiMaps
{
    public static final ImmutableBiMapFactory immutable = ImmutableBiMapFactoryImpl.INSTANCE;
```

### RedundantSuppression
Redundant suppression
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/factory/HashingStrategyBags.java`
#### Snippet
```java

@SuppressWarnings("ConstantNamingConvention")
public final class HashingStrategyBags
{
    public static final MutableHashingStrategyBagFactory mutable = MutableHashingStrategyBagFactoryImpl.INSTANCE;
```

### RedundantSuppression
Redundant suppression
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/factory/HashingStrategyMaps.java`
#### Snippet
```java

@SuppressWarnings("ConstantNamingConvention")
public final class HashingStrategyMaps
{
    public static final ImmutableHashingStrategyMapFactory immutable = ImmutableHashingStrategyMapFactoryImpl.INSTANCE;
```

### RedundantSuppression
Redundant suppression
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/factory/HashingStrategySets.java`
#### Snippet
```java

@SuppressWarnings("ConstantNamingConvention")
public final class HashingStrategySets
{
    public static final ImmutableHashingStrategySetFactory immutable = ImmutableHashingStrategySetFactoryImpl.INSTANCE;
```

### RedundantSuppression
Redundant suppression
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/factory/Lists.java`
#### Snippet
```java
 */
@SuppressWarnings("ConstantNamingConvention")
public final class Lists
{
    public static final ImmutableListFactory immutable = ImmutableListFactoryImpl.INSTANCE;
```

### RedundantSuppression
Redundant suppression
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/factory/Maps.java`
#### Snippet
```java
 */
@SuppressWarnings("ConstantNamingConvention")
public final class Maps
{
    public static final ImmutableMapFactory immutable = ImmutableMapFactoryImpl.INSTANCE;
```

### RedundantSuppression
Redundant suppression
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/factory/Multimaps.java`
#### Snippet
```java

@SuppressWarnings("ConstantNamingConvention")
public final class Multimaps
{
    public static final ImmutableMultimaps immutable = new ImmutableMultimaps();
```

### RedundantSuppression
Redundant suppression
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/factory/Multimaps.java`
#### Snippet
```java

    @SuppressWarnings("PublicField")
    public static final class MutableMultimaps
    {
        public final MutableListMultimapFactory list = new MutableListMultimapFactory();
```

### RedundantSuppression
Redundant suppression
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/factory/OrderedMaps.java`
#### Snippet
```java

@SuppressWarnings("ConstantNamingConvention")
public final class OrderedMaps
{
    private OrderedMaps()
```

### RedundantSuppression
Redundant suppression
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/factory/Sets.java`
#### Snippet
```java
 */
@SuppressWarnings("ConstantNamingConvention")
public final class Sets
{
    public static final ImmutableSetFactory immutable = ImmutableSetFactoryImpl.INSTANCE;
```

### RedundantSuppression
Redundant suppression
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/factory/SortedBags.java`
#### Snippet
```java

@SuppressWarnings("ConstantNamingConvention")
public final class SortedBags
{
    public static final MutableSortedBagFactory mutable = MutableSortedBagFactoryImpl.INSTANCE;
```

### RedundantSuppression
Redundant suppression
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/factory/SortedMaps.java`
#### Snippet
```java

@SuppressWarnings("ConstantNamingConvention")
public final class SortedMaps
{
    public static final ImmutableSortedMapFactory immutable = ImmutableSortedMapFactoryImpl.INSTANCE;
```

### RedundantSuppression
Redundant suppression
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/factory/SortedSets.java`
#### Snippet
```java

@SuppressWarnings("ConstantNamingConvention")
public final class SortedSets
{
    public static final ImmutableSortedSetFactory immutable = ImmutableSortedSetFactoryImpl.INSTANCE;
```

### RedundantSuppression
Redundant suppression
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/factory/Stacks.java`
#### Snippet
```java

@SuppressWarnings("ConstantNamingConvention")
public final class Stacks
{
    public static final ImmutableStackFactory immutable = ImmutableStackFactoryImpl.INSTANCE;
```

### RedundantSuppression
Redundant suppression
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/Interval.java`
#### Snippet
```java
    @Override
    @SuppressWarnings("TypeParameterExtendsFinalClass")
    public boolean addAll(Collection<? extends Integer> collection)
    {
        throw new UnsupportedOperationException("Cannot call addAll() on " + this.getClass().getSimpleName());
```

### RedundantSuppression
Redundant suppression
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/Interval.java`
#### Snippet
```java
    @Override
    @SuppressWarnings("TypeParameterExtendsFinalClass")
    public boolean addAll(int index, Collection<? extends Integer> collection)
    {
        throw new UnsupportedOperationException("Cannot call addAll() on " + this.getClass().getSimpleName());
```

### RedundantSuppression
Redundant suppression
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/mutable/AbstractListAdapter.java`
#### Snippet
```java

@SuppressWarnings("AbstractMethodOverridesConcreteMethod")
public abstract class AbstractListAdapter<T>
        extends AbstractCollectionAdapter<T>
        implements MutableList<T>
```

### RedundantSuppression
Redundant suppression
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/mutable/MutableListFactoryImpl.java`
#### Snippet
```java
        }

        //noinspection SSBasedInspection
        return FastList.newList(capacity);
    }
```

### RedundantSuppression
Redundant suppression
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/mutable/MutableListFactoryImpl.java`
#### Snippet
```java
    public <T> MutableList<T> withAll(Iterable<? extends T> iterable)
    {
        //noinspection SSBasedInspection
        return FastList.newList(iterable);
    }
```

### RedundantSuppression
Redundant suppression
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/MutableMapFactoryImpl.java`
#### Snippet
```java
    public <K, V> MutableMap<K, V> empty()
    {
        //noinspection SSBasedInspection
        return UnifiedMap.newMap();
    }
```

### RedundantSuppression
Redundant suppression
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/sorted/mutable/MutableSortedMapFactoryImpl.java`
#### Snippet
```java
    public <K, V> MutableSortedMap<K, V> empty()
    {
        //noinspection SSBasedInspection
        return TreeSortedMap.newMap();
    }
```

### RedundantSuppression
Redundant suppression
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/parallel/ParallelIterate.java`
#### Snippet
```java
     */
    @SuppressWarnings("JavaDoc")
    public static <T, BT extends Procedure<? super T>> void forEach(
            Iterable<T> iterable,
            ProcedureFactory<BT> procedureFactory,
```

### RedundantSuppression
Redundant suppression
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/parallel/ParallelIterate.java`
#### Snippet
```java
     */
    @SuppressWarnings("JavaDoc")
    public static <T, BT extends Procedure<? super T>> void forEach(
            Iterable<T> iterable,
            ProcedureFactory<BT> procedureFactory,
```

### RedundantSuppression
Redundant suppression
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/MutableSetFactoryImpl.java`
#### Snippet
```java
    public <T> MutableSet<T> withInitialCapacity(int capacity)
    {
        //noinspection SSBasedInspection
        return UnifiedSet.newSet(capacity);
    }
```

### RedundantSuppression
Redundant suppression
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/MutableSetFactoryImpl.java`
#### Snippet
```java
    public <T> MutableSet<T> withAll(Iterable<? extends T> items)
    {
        //noinspection SSBasedInspection
        return UnifiedSet.newSet(items);
    }
```

### RedundantSuppression
Redundant suppression
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/sorted/mutable/MutableSortedSetFactoryImpl.java`
#### Snippet
```java
    public <T> MutableSortedSet<T> withAll(Iterable<? extends T> items)
    {
        //noinspection SSBasedInspection
        return TreeSortedSet.newSet(items);
    }
```

### RedundantSuppression
Redundant suppression
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/sorted/mutable/MutableSortedSetFactoryImpl.java`
#### Snippet
```java
    public <T> MutableSortedSet<T> withAll(Comparator<? super T> comparator, Iterable<? extends T> items)
    {
        //noinspection SSBasedInspection
        return TreeSortedSet.newSet(comparator, items);
    }
```

### RedundantSuppression
Redundant suppression
in `eclipse-collections-api/src/main/java/org/eclipse/collections/api/RichIterable.java`
#### Snippet
```java
     */
    @SuppressWarnings("UnnecessaryFullyQualifiedName")
    void each(Procedure<? super T> procedure);

    /**
```

### RedundantSuppression
Redundant suppression
in `eclipse-collections-api/src/main/java/org/eclipse/collections/api/factory/Bags.java`
#### Snippet
```java
 */
@SuppressWarnings("ConstantNamingConvention")
public final class Bags
{
    public static final ImmutableBagFactory immutable = ServiceLoaderUtils.loadServiceClass(ImmutableBagFactory.class);
```

### RedundantSuppression
Redundant suppression
in `eclipse-collections-api/src/main/java/org/eclipse/collections/api/factory/BiMaps.java`
#### Snippet
```java

@SuppressWarnings("ConstantNamingConvention")
public final class BiMaps
{
    public static final ImmutableBiMapFactory immutable = ServiceLoaderUtils.loadServiceClass(ImmutableBiMapFactory.class);
```

### RedundantSuppression
Redundant suppression
in `eclipse-collections-api/src/main/java/org/eclipse/collections/api/factory/Lists.java`
#### Snippet
```java
 */
@SuppressWarnings("ConstantNamingConvention")
public final class Lists
{
    public static final ImmutableListFactory immutable =
```

### RedundantSuppression
Redundant suppression
in `eclipse-collections-api/src/main/java/org/eclipse/collections/api/factory/Maps.java`
#### Snippet
```java
 */
@SuppressWarnings("ConstantNamingConvention")
public final class Maps
{
    public static final ImmutableMapFactory immutable = ServiceLoaderUtils.loadServiceClass(ImmutableMapFactory.class);
```

### RedundantSuppression
Redundant suppression
in `eclipse-collections-api/src/main/java/org/eclipse/collections/api/factory/Sets.java`
#### Snippet
```java
 */
@SuppressWarnings("ConstantNamingConvention")
public final class Sets
{
    public static final ImmutableSetFactory immutable =
```

### RedundantSuppression
Redundant suppression
in `eclipse-collections-api/src/main/java/org/eclipse/collections/api/factory/SortedBags.java`
#### Snippet
```java

@SuppressWarnings("ConstantNamingConvention")
public final class SortedBags
{
    public static final MutableSortedBagFactory mutable = ServiceLoaderUtils.loadServiceClass(MutableSortedBagFactory.class);
```

### RedundantSuppression
Redundant suppression
in `eclipse-collections-api/src/main/java/org/eclipse/collections/api/factory/SortedMaps.java`
#### Snippet
```java

@SuppressWarnings("ConstantNamingConvention")
public final class SortedMaps
{
    public static final ImmutableSortedMapFactory immutable = ServiceLoaderUtils.loadServiceClass(ImmutableSortedMapFactory.class);
```

### RedundantSuppression
Redundant suppression
in `eclipse-collections-api/src/main/java/org/eclipse/collections/api/factory/SortedSets.java`
#### Snippet
```java

@SuppressWarnings("ConstantNamingConvention")
public final class SortedSets
{
    public static final ImmutableSortedSetFactory immutable = ServiceLoaderUtils.loadServiceClass(ImmutableSortedSetFactory.class);
```

### RedundantSuppression
Redundant suppression
in `eclipse-collections-api/src/main/java/org/eclipse/collections/api/factory/Stacks.java`
#### Snippet
```java

@SuppressWarnings("ConstantNamingConvention")
public final class Stacks
{
    public static final ImmutableStackFactory immutable = ServiceLoaderUtils.loadServiceClass(ImmutableStackFactory.class);
```

### RedundantSuppression
Redundant suppression
in `eclipse-collections-api/src/main/java/org/eclipse/collections/api/multimap/Multimap.java`
#### Snippet
```java
 */
@SuppressWarnings("JavaDoc")
public interface Multimap<K, V>
{
    /**
```

### RedundantSuppression
Redundant suppression
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/FunctionalInterfaceSetTest.java`
#### Snippet
```java
@BenchmarkMode(Mode.Throughput)
@OutputTimeUnit(TimeUnit.SECONDS)
public class FunctionalInterfaceSetTest extends AbstractJMHTestRunner
{
    private static final int SIZE = 1_000_000;
```

## RuleId[id=UnnecessaryBoxing]
### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `eclipse-collections-code-generator/src/main/java/org/eclipse/collections/codegenerator/EclipseCollectionsCodeGenerator.java`
#### Snippet
```java
        ST template = templateFile.getInstanceOf(templateName);
        String render = template.render();
        return Boolean.valueOf(render);
    }

```

### UnnecessaryBoxing
Unnecessary boxing
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/IntListJMHTest.java`
#### Snippet
```java
        return ParallelIterate.sumByInt(
                this.ecList,
                i -> Integer.valueOf(0),
                Integer::intValue).get(0);
    }
```

### UnnecessaryBoxing
Redundant boxing, `Integer.parseInt()` call can be used instead
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/FunctionalInterfaceTest.java`
#### Snippet
```java
        {
            Integer integer = this.integersEC.get(i);
            if (integer % 10_000 != 0 && (Integer.valueOf(String.valueOf(integer)) + 1) % 10_000 != 0)
            {
                list.add(integer);
```

### UnnecessaryBoxing
Redundant boxing, `Integer.parseInt()` call can be used instead
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/FunctionalInterfaceTest.java`
#### Snippet
```java
        MutableList<Integer> list = this.integersEC
                .asParallel(this.executorService, BATCH_SIZE)
                .select(integer -> integer % 10_000 != 0 && (Integer.valueOf(String.valueOf(integer)) + 1) % 10_000 != 0).toList();
        Verify.assertSize(999_800, list);
        return list;
```

### UnnecessaryBoxing
Redundant boxing, `Integer.parseInt()` call can be used instead
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/FunctionalInterfaceTest.java`
#### Snippet
```java
        CompositeFastList<Integer> list = ParallelIterate.select(
                this.integersEC,
                integer -> integer % 10_000 != 0 && (Integer.valueOf(String.valueOf(integer)) + 1) % 10_000 != 0,
                new CompositeFastList<>(),
                BATCH_SIZE,
```

### UnnecessaryBoxing
Unnecessary boxing
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/Functions0.java`
#### Snippet
```java
        public Integer value()
        {
            return Integer.valueOf(0);
        }
    }
```

### UnnecessaryBoxing
Unnecessary boxing
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/procedure/ZipWithIndexProcedure.java`
#### Snippet
```java
    public void value(T each)
    {
        this.target.add(Tuples.pair(each, Integer.valueOf(this.index)));
        this.index += 1;
    }
```

### UnnecessaryBoxing
Unnecessary boxing
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/string/immutable/CharAdapter.java`
#### Snippet
```java
    public Character getCharacter(int index)
    {
        return Character.valueOf(this.get(index));
    }

```

### UnnecessaryBoxing
Unnecessary boxing
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/StringIterate.java`
#### Snippet
```java
        public void value(char character)
        {
            this.characters.add(Character.valueOf(character));
        }
    }
```

### UnnecessaryBoxing
Unnecessary boxing
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/StringIterate.java`
#### Snippet
```java
        public void value(char character)
        {
            this.characters.add(Character.valueOf(Character.toLowerCase(character)));
        }
    }
```

### UnnecessaryBoxing
Unnecessary boxing
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/StringIterate.java`
#### Snippet
```java
        public void value(char character)
        {
            this.characters.add(Character.valueOf(Character.toUpperCase(character)));
        }
    }
```

## RuleId[id=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `eclipse-collections-testutils/src/main/java/org/eclipse/collections/impl/test/ClassComparer.java`
#### Snippet
```java
    public ClassComparer(boolean includeParameterTypesInMethods, boolean includeReturnTypes, boolean includePackageNames)
    {
        this(System.out, includeParameterTypesInMethods, includeReturnTypes, includePackageNames);
    }

```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `eclipse-collections-code-generator/src/main/java/org/eclipse/collections/codegenerator/EclipseCollectionsCodeGenerator.java`
#### Snippet
```java
    {
        File newPath = new File(outputFile.getAbsolutePath()
                .replace("target", "src")
                .replace("generated-sources", "main")
                .replace("generated-test-sources", "test"));
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `eclipse-collections-code-generator/src/main/java/org/eclipse/collections/codegenerator/EclipseCollectionsCodeGenerator.java`
#### Snippet
```java
        File newPath = new File(outputFile.getAbsolutePath()
                .replace("target", "src")
                .replace("generated-sources", "main")
                .replace("generated-test-sources", "test"));
        return newPath.exists();
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `eclipse-collections-code-generator/src/main/java/org/eclipse/collections/codegenerator/EclipseCollectionsCodeGenerator.java`
#### Snippet
```java
                .replace("target", "src")
                .replace("generated-sources", "main")
                .replace("generated-test-sources", "test"));
        return newPath.exists();
    }
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `scala.collection.immutable` is unnecessary, and can be replaced with an import
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/map/MapGrowthTest.java`
#### Snippet
```java

    @Benchmark
    public scala.collection.immutable.Map<String, String> immutableScalaPut()
    {
        int localSize = this.size;
```

### UnnecessaryFullyQualifiedName
Qualifier `scala.collection.immutable` is unnecessary, and can be replaced with an import
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/map/MapGrowthTest.java`
#### Snippet
```java
        String[] localElements = this.elements;

        scala.collection.immutable.Map<String, String> map = HashMap$.MODULE$.empty();

        for (int i = 0; i < localSize; i++)
```

### UnnecessaryFullyQualifiedName
Qualifier `scala.collection.mutable` is unnecessary, and can be replaced with an import
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/map/MapGrowthTest.java`
#### Snippet
```java

    @Benchmark
    public scala.collection.mutable.HashMap<String, String> mutableScalaPut()
    {
        int localSize = this.size;
```

### UnnecessaryFullyQualifiedName
Qualifier `scala.collection.mutable` is unnecessary, and can be replaced with an import
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/map/MapGrowthTest.java`
#### Snippet
```java
        String[] localElements = this.elements;

        scala.collection.mutable.HashMap<String, String> map = new PresizableHashMap<>(localSize);

        for (int i = 0; i < localSize; i++)
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `array`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/bag/mutable/primitive/BooleanHashBag.java`
#### Snippet
```java
        if (array.length < this.size())
        {
            array = new boolean[this.size()];
        }
        int[] index = {0};
```

### AssignmentToMethodParameter
Assignment to method parameter `array`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/primitive/AbstractMutableBooleanValuesMap.java`
#### Snippet
```java
        if (array.length < this.size())
        {
            array = new boolean[this.size()];
        }
        int index = 0;
```

### AssignmentToMethodParameter
Assignment to method parameter `result`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/primitive/ObjectBooleanHashMap.java`
#### Snippet
```java
        if (result.length < this.size())
        {
            result = new boolean[this.size()];
        }
        int index = 0;
```

### AssignmentToMethodParameter
Assignment to method parameter `result`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/primitive/ObjectBooleanHashMap.java`
#### Snippet
```java
            if (result.length < size)
            {
                result = (T[]) Array.newInstance(result.getClass().getComponentType(), size);
            }
            this.copyKeys(result);
```

### AssignmentToMethodParameter
Assignment to method parameter `result`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/primitive/ObjectBooleanHashMapWithHashingStrategy.java`
#### Snippet
```java
        if (result.length < this.size())
        {
            result = new boolean[this.size()];
        }
        int index = 0;
```

### AssignmentToMethodParameter
Assignment to method parameter `result`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/UnifiedMap.java`
#### Snippet
```java
            if (result.length < size)
            {
                result = (T[]) Array.newInstance(result.getClass().getComponentType(), size);
            }
            this.copyKeys(result);
```

### AssignmentToMethodParameter
Assignment to method parameter `result`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/UnifiedMap.java`
#### Snippet
```java
            if (result.length < size)
            {
                result = (T[]) Array.newInstance(result.getClass().getComponentType(), size);
            }
            this.copyValues(result);
```

### AssignmentToMethodParameter
Assignment to method parameter `result`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/UnifiedMap.java`
#### Snippet
```java
            if (result.length < size)
            {
                result = (T[]) Array.newInstance(result.getClass().getComponentType(), size);
            }
            this.copyEntries(result);
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/UnifiedMap.java`
#### Snippet
```java
                return index;
            }
            objectIntProcedure.value((V) chain[i + 1], index++);
        }
        return index;
```

### AssignmentToMethodParameter
Assignment to method parameter `initialCapacity`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMap.java`
#### Snippet
```java
        if (initialCapacity > MAXIMUM_CAPACITY)
        {
            initialCapacity = MAXIMUM_CAPACITY;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `currentArray`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMap.java`
#### Snippet
```java
            if (o == RESIZED || o == RESIZING)
            {
                currentArray = this.helpWithResizeWhileCurrentIndex(currentArray, index);
            }
            else
```

### AssignmentToMethodParameter
Assignment to method parameter `key`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMap.java`
#### Snippet
```java
                        return null; // null value means no mapping is required
                    }
                    key = keyTransformer.value(key, newValue);
                }
                Entry<K, V> newEntry = new Entry<>(key, newValue, (Entry<K, V>) o);
```

### AssignmentToMethodParameter
Assignment to method parameter `currentArray`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMap.java`
#### Snippet
```java
            if (o == RESIZED || o == RESIZING)
            {
                currentArray = this.helpWithResizeWhileCurrentIndex(currentArray, index);
            }
            else
```

### AssignmentToMethodParameter
Assignment to method parameter `currentArray`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMap.java`
#### Snippet
```java
            if (o == RESIZED || o == RESIZING)
            {
                currentArray = this.helpWithResizeWhileCurrentIndex(currentArray, index);
            }
            else
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMap.java`
#### Snippet
```java
        {
            int length = currentArray.length();
            index = ConcurrentHashMap.indexFor(hash, length);
            Object o = currentArray.get(index);
            if (o == RESIZED || o == RESIZING)
```

### AssignmentToMethodParameter
Assignment to method parameter `currentArray`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMap.java`
#### Snippet
```java
            if (o == RESIZED || o == RESIZING)
            {
                currentArray = this.helpWithResizeWhileCurrentIndex(currentArray, index);
            }
            else
```

### AssignmentToMethodParameter
Assignment to method parameter `currentArray`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMap.java`
#### Snippet
```java
            if (o == RESIZED || o == RESIZING)
            {
                currentArray = this.helpWithResizeWhileCurrentIndex(currentArray, index);
            }
            else
```

### AssignmentToMethodParameter
Assignment to method parameter `currentArray`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMap.java`
#### Snippet
```java
            if (o == RESIZED || o == RESIZING)
            {
                currentArray = this.helpWithResizeWhileCurrentIndex(currentArray, index);
            }
            else
```

### AssignmentToMethodParameter
Assignment to method parameter `currentArray`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMap.java`
#### Snippet
```java
            if (o == RESIZED || o == RESIZING)
            {
                currentArray = this.helpWithResizeWhileCurrentIndex(currentArray, index);
            }
            else
```

### AssignmentToMethodParameter
Assignment to method parameter `currentArray`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMapUnsafe.java`
#### Snippet
```java
            if (o == RESIZED || o == RESIZING)
            {
                currentArray = this.helpWithResizeWhileCurrentIndex(currentArray, index);
            }
            else
```

### AssignmentToMethodParameter
Assignment to method parameter `initialCapacity`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMapUnsafe.java`
#### Snippet
```java
        if (initialCapacity > MAXIMUM_CAPACITY)
        {
            initialCapacity = MAXIMUM_CAPACITY;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMapUnsafe.java`
#### Snippet
```java
        {
            int length = currentArray.length;
            index = ConcurrentHashMapUnsafe.indexFor(hash, length);
            Object o = ConcurrentHashMapUnsafe.arrayAt(currentArray, index);
            if (o == RESIZED || o == RESIZING)
```

### AssignmentToMethodParameter
Assignment to method parameter `currentArray`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMapUnsafe.java`
#### Snippet
```java
            if (o == RESIZED || o == RESIZING)
            {
                currentArray = this.helpWithResizeWhileCurrentIndex(currentArray, index);
            }
            else
```

### AssignmentToMethodParameter
Assignment to method parameter `currentArray`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMapUnsafe.java`
#### Snippet
```java
            if (o == RESIZED || o == RESIZING)
            {
                currentArray = this.helpWithResizeWhileCurrentIndex(currentArray, index);
            }
            else
```

### AssignmentToMethodParameter
Assignment to method parameter `currentArray`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMapUnsafe.java`
#### Snippet
```java
            if (o == RESIZED || o == RESIZING)
            {
                currentArray = this.helpWithResizeWhileCurrentIndex(currentArray, index);
            }
            else
```

### AssignmentToMethodParameter
Assignment to method parameter `currentArray`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMapUnsafe.java`
#### Snippet
```java
            if (o == RESIZED || o == RESIZING)
            {
                currentArray = this.helpWithResizeWhileCurrentIndex(currentArray, index);
            }
            else
```

### AssignmentToMethodParameter
Assignment to method parameter `currentArray`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMapUnsafe.java`
#### Snippet
```java
            if (o == RESIZED || o == RESIZING)
            {
                currentArray = this.helpWithResizeWhileCurrentIndex(currentArray, index);
            }
            else
```

### AssignmentToMethodParameter
Assignment to method parameter `key`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMapUnsafe.java`
#### Snippet
```java
                        return null; // null value means no mapping is required
                    }
                    key = keyTransformer.value(key, newValue);
                }
                Entry<K, V> newEntry = new Entry<>(key, newValue, (Entry<K, V>) o);
```

### AssignmentToMethodParameter
Assignment to method parameter `currentArray`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMapUnsafe.java`
#### Snippet
```java
            if (o == RESIZED || o == RESIZING)
            {
                currentArray = this.helpWithResizeWhileCurrentIndex(currentArray, index);
            }
            else
```

### AssignmentToMethodParameter
Assignment to method parameter `input`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/sorted/immutable/ImmutableTreeSet.java`
#### Snippet
```java
                if (uniqueCount < input.length)
                {
                    input = Arrays.copyOf(unique, uniqueCount);
                }
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `result`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/strategy/mutable/UnifiedMapWithHashingStrategy.java`
#### Snippet
```java
            if (result.length < size)
            {
                result = (T[]) Array.newInstance(result.getClass().getComponentType(), size);
            }
            this.copyKeys(result);
```

### AssignmentToMethodParameter
Assignment to method parameter `result`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/strategy/mutable/UnifiedMapWithHashingStrategy.java`
#### Snippet
```java
            if (result.length < size)
            {
                result = (T[]) Array.newInstance(result.getClass().getComponentType(), size);
            }
            this.copyValues(result);
```

### AssignmentToMethodParameter
Assignment to method parameter `result`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/strategy/mutable/UnifiedMapWithHashingStrategy.java`
#### Snippet
```java
            if (result.length < size)
            {
                result = (T[]) Array.newInstance(result.getClass().getComponentType(), size);
            }
            this.copyEntries(result);
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/strategy/mutable/UnifiedMapWithHashingStrategy.java`
#### Snippet
```java
                return index;
            }
            objectIntProcedure.value((V) chain[i + 1], index++);
        }
        return index;
```

### AssignmentToMethodParameter
Assignment to method parameter `target`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/primitive/BooleanHashSet.java`
#### Snippet
```java
        if (target.length < requiredSize)
        {
            target = new boolean[requiredSize];
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `array`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/primitive/ByteHashSet.java`
#### Snippet
```java
            if (array.length < this.size())
            {
                array = new byte[this.size()];
            }
            int index = 0;
```

### AssignmentToMethodParameter
Assignment to method parameter `array`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/primitive/ByteHashSet.java`
#### Snippet
```java
        if (array.length < this.size())
        {
            array = new byte[this.size()];
        }
        int index = 0;
```

### AssignmentToMethodParameter
Assignment to method parameter `target`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/immutable/primitive/ImmutableTrueFalseSet.java`
#### Snippet
```java
        if (target.length < 2)
        {
            target = new boolean[]{false, true};
        }
        else
```

### AssignmentToMethodParameter
Assignment to method parameter `target`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/immutable/primitive/ImmutableFalseSet.java`
#### Snippet
```java
        if (target.length < 1)
        {
            target = new boolean[]{false};
        }
        else
```

### AssignmentToMethodParameter
Assignment to method parameter `target`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/immutable/primitive/ImmutableTrueSet.java`
#### Snippet
```java
        if (target.length < 1)
        {
            target = new boolean[]{true};
        }
        else
```

### AssignmentToMethodParameter
Assignment to method parameter `bucket`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/UnifiedSet.java`
#### Snippet
```java
            if (bucket.three instanceof ChainedBucket)
            {
                bucket = (ChainedBucket) bucket.three;
                continue;
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `oldBucket`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/UnifiedSet.java`
#### Snippet
```java
            if (bucket.three instanceof ChainedBucket)
            {
                oldBucket = bucket;
                continue;
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `bucket`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/UnifiedSet.java`
#### Snippet
```java
        while (bucket.three instanceof ChainedBucket)
        {
            bucket = (ChainedBucket) bucket.three;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `oldBucket`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/UnifiedSet.java`
#### Snippet
```java
                if (bucket.three instanceof ChainedBucket)
                {
                    oldBucket = bucket;
                    continue;
                }
```

### AssignmentToMethodParameter
Assignment to method parameter `oldBucket`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/UnifiedSet.java`
#### Snippet
```java
            if (bucket.three instanceof ChainedBucket)
            {
                oldBucket = bucket;
                continue;
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `bucket`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/UnifiedSet.java`
#### Snippet
```java
            if (bucket.three instanceof ChainedBucket)
            {
                bucket = (ChainedBucket) bucket.three;
                continue;
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `i`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/UnifiedSet.java`
#### Snippet
```java
            {
                bucket = (ChainedBucket) bucket.three;
                i -= 3;
            }
            do
```

### AssignmentToMethodParameter
Assignment to method parameter `i`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/UnifiedSet.java`
#### Snippet
```java
                        if (bucket.three instanceof ChainedBucket)
                        {
                            i -= 3;
                            bucket = (ChainedBucket) bucket.three;
                            continue;
```

### AssignmentToMethodParameter
Assignment to method parameter `count`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/UnifiedSet.java`
#### Snippet
```java
        do
        {
            procedure.value(this.nonSentinel(bucket.zero), count++);
            if (bucket.one == null)
            {
```

### AssignmentToMethodParameter
Assignment to method parameter `count`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/UnifiedSet.java`
#### Snippet
```java
                return count;
            }
            procedure.value(this.nonSentinel(bucket.one), count++);
            if (bucket.two == null)
            {
```

### AssignmentToMethodParameter
Assignment to method parameter `count`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/UnifiedSet.java`
#### Snippet
```java
                return count;
            }
            procedure.value(this.nonSentinel(bucket.two), count++);
            if (bucket.three == null)
            {
```

### AssignmentToMethodParameter
Assignment to method parameter `bucket`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/UnifiedSet.java`
#### Snippet
```java
            if (bucket.three instanceof ChainedBucket)
            {
                bucket = (ChainedBucket) bucket.three;
                continue;
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `count`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/UnifiedSet.java`
#### Snippet
```java
                continue;
            }
            procedure.value(this.nonSentinel(bucket.three), count++);
            return count;
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `i`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/UnifiedSet.java`
#### Snippet
```java
                        if (bucket.three instanceof ChainedBucket)
                        {
                            i -= 3;
                            oldBucket = bucket;
                            continue;
```

### AssignmentToMethodParameter
Assignment to method parameter `oldBucket`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/UnifiedSet.java`
#### Snippet
```java
                        {
                            i -= 3;
                            oldBucket = bucket;
                            continue;
                        }
```

### AssignmentToMethodParameter
Assignment to method parameter `i`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/UnifiedSet.java`
#### Snippet
```java
                        if (bucket.three instanceof ChainedBucket)
                        {
                            i -= 3;
                            oldBucket = bucket;
                            continue;
```

### AssignmentToMethodParameter
Assignment to method parameter `oldBucket`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/UnifiedSet.java`
#### Snippet
```java
                        {
                            i -= 3;
                            oldBucket = bucket;
                            continue;
                        }
```

### AssignmentToMethodParameter
Assignment to method parameter `bucket`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/UnifiedSet.java`
#### Snippet
```java
            if (bucket.three instanceof ChainedBucket)
            {
                bucket = (ChainedBucket) bucket.three;
                continue;
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `bucket`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/UnifiedSet.java`
#### Snippet
```java
            if (bucket.three instanceof ChainedBucket)
            {
                bucket = (ChainedBucket) bucket.three;
                continue;
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `bucket`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/UnifiedSet.java`
#### Snippet
```java
            if (bucket.three instanceof ChainedBucket)
            {
                bucket = (ChainedBucket) bucket.three;
                continue;
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `size`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/UnifiedSet.java`
#### Snippet
```java
        if (size > this.maxSize)
        {
            size = (int) (size / this.loadFactor) + 1;
            int capacity = Integer.highestOneBit(size);
            if (size != capacity)
```

### AssignmentToMethodParameter
Assignment to method parameter `bucket`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/UnifiedSet.java`
#### Snippet
```java
            if (bucket.three instanceof ChainedBucket)
            {
                bucket = (ChainedBucket) bucket.three;
                continue;
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `bucket`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/UnifiedSet.java`
#### Snippet
```java
            if (bucket.three instanceof ChainedBucket)
            {
                bucket = (ChainedBucket) bucket.three;
                continue;
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `bucket`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/UnifiedSet.java`
#### Snippet
```java
            if (bucket.three instanceof ChainedBucket)
            {
                bucket = (ChainedBucket) bucket.three;
                continue;
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `bucket`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/UnifiedSet.java`
#### Snippet
```java
            if (bucket.three instanceof ChainedBucket)
            {
                bucket = (ChainedBucket) bucket.three;
                continue;
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `bucket`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/UnifiedSet.java`
#### Snippet
```java
            if (bucket.three instanceof ChainedBucket)
            {
                bucket = (ChainedBucket) bucket.three;
                continue;
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `bucket`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/UnifiedSet.java`
#### Snippet
```java
            if (bucket.three instanceof ChainedBucket)
            {
                bucket = (ChainedBucket) bucket.three;
                continue;
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `count`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/UnifiedSet.java`
#### Snippet
```java
        do
        {
            result[count++] = this.nonSentinel(bucket.zero);
            if (bucket.one == null)
            {
```

### AssignmentToMethodParameter
Assignment to method parameter `count`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/UnifiedSet.java`
#### Snippet
```java
                break;
            }
            result[count++] = this.nonSentinel(bucket.one);
            if (bucket.two == null)
            {
```

### AssignmentToMethodParameter
Assignment to method parameter `count`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/UnifiedSet.java`
#### Snippet
```java
                break;
            }
            result[count++] = this.nonSentinel(bucket.two);
            if (bucket.three == null)
            {
```

### AssignmentToMethodParameter
Assignment to method parameter `bucket`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/UnifiedSet.java`
#### Snippet
```java
            if (bucket.three instanceof ChainedBucket)
            {
                bucket = (ChainedBucket) bucket.three;
                continue;
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `count`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/UnifiedSet.java`
#### Snippet
```java
                continue;
            }
            result[count++] = this.nonSentinel(bucket.three);
            break;
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `bucket`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/UnifiedSet.java`
#### Snippet
```java
            if (bucket.three instanceof ChainedBucket)
            {
                bucket = (ChainedBucket) bucket.three;
                continue;
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `from`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/Interval.java`
#### Snippet
```java
            if (from < to)
            {
                from++;
            }
            else
```

### AssignmentToMethodParameter
Assignment to method parameter `from`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/Interval.java`
#### Snippet
```java
            else
            {
                from--;
            }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `to`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/Interval.java`
#### Snippet
```java
            if (to > from)
            {
                to--;
            }
            else
```

### AssignmentToMethodParameter
Assignment to method parameter `to`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/Interval.java`
#### Snippet
```java
            else
            {
                to++;
            }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `from`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/Interval.java`
#### Snippet
```java
            if (from < to)
            {
                from++;
            }
            else
```

### AssignmentToMethodParameter
Assignment to method parameter `from`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/Interval.java`
#### Snippet
```java
            else
            {
                from--;
            }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `to`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/Interval.java`
#### Snippet
```java
            if (to > from)
            {
                to--;
            }
            else
```

### AssignmentToMethodParameter
Assignment to method parameter `to`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/Interval.java`
#### Snippet
```java
            else
            {
                to++;
            }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `oldBucket`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/strategy/mutable/UnifiedSetWithHashingStrategy.java`
#### Snippet
```java
            if (bucket.three instanceof ChainedBucket)
            {
                oldBucket = bucket;
                continue;
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `i`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/strategy/mutable/UnifiedSetWithHashingStrategy.java`
#### Snippet
```java
                        if (bucket.three instanceof ChainedBucket)
                        {
                            i -= 3;
                            oldBucket = bucket;
                            continue;
```

### AssignmentToMethodParameter
Assignment to method parameter `oldBucket`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/strategy/mutable/UnifiedSetWithHashingStrategy.java`
#### Snippet
```java
                        {
                            i -= 3;
                            oldBucket = bucket;
                            continue;
                        }
```

### AssignmentToMethodParameter
Assignment to method parameter `i`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/strategy/mutable/UnifiedSetWithHashingStrategy.java`
#### Snippet
```java
                        if (bucket.three instanceof ChainedBucket)
                        {
                            i -= 3;
                            oldBucket = bucket;
                            continue;
```

### AssignmentToMethodParameter
Assignment to method parameter `oldBucket`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/strategy/mutable/UnifiedSetWithHashingStrategy.java`
#### Snippet
```java
                        {
                            i -= 3;
                            oldBucket = bucket;
                            continue;
                        }
```

### AssignmentToMethodParameter
Assignment to method parameter `bucket`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/strategy/mutable/UnifiedSetWithHashingStrategy.java`
#### Snippet
```java
            if (bucket.three instanceof ChainedBucket)
            {
                bucket = (ChainedBucket) bucket.three;
                continue;
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `count`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/strategy/mutable/UnifiedSetWithHashingStrategy.java`
#### Snippet
```java
        do
        {
            result[count++] = this.nonSentinel(bucket.zero);
            if (bucket.one == null)
            {
```

### AssignmentToMethodParameter
Assignment to method parameter `count`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/strategy/mutable/UnifiedSetWithHashingStrategy.java`
#### Snippet
```java
                break;
            }
            result[count++] = this.nonSentinel(bucket.one);
            if (bucket.two == null)
            {
```

### AssignmentToMethodParameter
Assignment to method parameter `count`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/strategy/mutable/UnifiedSetWithHashingStrategy.java`
#### Snippet
```java
                break;
            }
            result[count++] = this.nonSentinel(bucket.two);
            if (bucket.three == null)
            {
```

### AssignmentToMethodParameter
Assignment to method parameter `bucket`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/strategy/mutable/UnifiedSetWithHashingStrategy.java`
#### Snippet
```java
            if (bucket.three instanceof ChainedBucket)
            {
                bucket = (ChainedBucket) bucket.three;
                continue;
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `count`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/strategy/mutable/UnifiedSetWithHashingStrategy.java`
#### Snippet
```java
                continue;
            }
            result[count++] = this.nonSentinel(bucket.three);
            break;
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `bucket`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/strategy/mutable/UnifiedSetWithHashingStrategy.java`
#### Snippet
```java
            if (bucket.three instanceof ChainedBucket)
            {
                bucket = (ChainedBucket) bucket.three;
                continue;
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `bucket`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/strategy/mutable/UnifiedSetWithHashingStrategy.java`
#### Snippet
```java
            if (bucket.three instanceof ChainedBucket)
            {
                bucket = (ChainedBucket) bucket.three;
                continue;
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `oldBucket`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/strategy/mutable/UnifiedSetWithHashingStrategy.java`
#### Snippet
```java
                if (bucket.three instanceof ChainedBucket)
                {
                    oldBucket = bucket;
                    continue;
                }
```

### AssignmentToMethodParameter
Assignment to method parameter `bucket`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/strategy/mutable/UnifiedSetWithHashingStrategy.java`
#### Snippet
```java
            if (bucket.three instanceof ChainedBucket)
            {
                bucket = (ChainedBucket) bucket.three;
                continue;
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `oldBucket`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/strategy/mutable/UnifiedSetWithHashingStrategy.java`
#### Snippet
```java
            if (bucket.three instanceof ChainedBucket)
            {
                oldBucket = bucket;
                continue;
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `bucket`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/strategy/mutable/UnifiedSetWithHashingStrategy.java`
#### Snippet
```java
            if (bucket.three instanceof ChainedBucket)
            {
                bucket = (ChainedBucket) bucket.three;
                continue;
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `i`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/strategy/mutable/UnifiedSetWithHashingStrategy.java`
#### Snippet
```java
            {
                bucket = (ChainedBucket) bucket.three;
                i -= 3;
            }
            do
```

### AssignmentToMethodParameter
Assignment to method parameter `i`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/strategy/mutable/UnifiedSetWithHashingStrategy.java`
#### Snippet
```java
                        if (bucket.three instanceof ChainedBucket)
                        {
                            i -= 3;
                            bucket = (ChainedBucket) bucket.three;
                            continue;
```

### AssignmentToMethodParameter
Assignment to method parameter `bucket`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/strategy/mutable/UnifiedSetWithHashingStrategy.java`
#### Snippet
```java
        while (bucket.three instanceof ChainedBucket)
        {
            bucket = (ChainedBucket) bucket.three;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `bucket`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/strategy/mutable/UnifiedSetWithHashingStrategy.java`
#### Snippet
```java
            if (bucket.three instanceof ChainedBucket)
            {
                bucket = (ChainedBucket) bucket.three;
                continue;
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `bucket`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/strategy/mutable/UnifiedSetWithHashingStrategy.java`
#### Snippet
```java
            if (bucket.three instanceof ChainedBucket)
            {
                bucket = (ChainedBucket) bucket.three;
                continue;
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `size`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/strategy/mutable/UnifiedSetWithHashingStrategy.java`
#### Snippet
```java
        if (size > this.maxSize)
        {
            size = (int) (size / this.loadFactor) + 1;
            int capacity = Integer.highestOneBit(size);
            if (size != capacity)
```

### AssignmentToMethodParameter
Assignment to method parameter `bucket`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/strategy/mutable/UnifiedSetWithHashingStrategy.java`
#### Snippet
```java
            if (bucket.three instanceof ChainedBucket)
            {
                bucket = (ChainedBucket) bucket.three;
                continue;
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `bucket`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/strategy/mutable/UnifiedSetWithHashingStrategy.java`
#### Snippet
```java
            if (bucket.three instanceof ChainedBucket)
            {
                bucket = (ChainedBucket) bucket.three;
                continue;
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `bucket`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/strategy/mutable/UnifiedSetWithHashingStrategy.java`
#### Snippet
```java
            if (bucket.three instanceof ChainedBucket)
            {
                bucket = (ChainedBucket) bucket.three;
                continue;
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `bucket`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/strategy/mutable/UnifiedSetWithHashingStrategy.java`
#### Snippet
```java
            if (bucket.three instanceof ChainedBucket)
            {
                bucket = (ChainedBucket) bucket.three;
                continue;
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `bucket`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/strategy/mutable/UnifiedSetWithHashingStrategy.java`
#### Snippet
```java
            if (bucket.three instanceof ChainedBucket)
            {
                bucket = (ChainedBucket) bucket.three;
                continue;
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `bucket`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/strategy/mutable/UnifiedSetWithHashingStrategy.java`
#### Snippet
```java
            if (bucket.three instanceof ChainedBucket)
            {
                bucket = (ChainedBucket) bucket.three;
                continue;
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `count`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/strategy/mutable/UnifiedSetWithHashingStrategy.java`
#### Snippet
```java
        do
        {
            procedure.value(this.nonSentinel(bucket.zero), count++);
            if (bucket.one == null)
            {
```

### AssignmentToMethodParameter
Assignment to method parameter `count`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/strategy/mutable/UnifiedSetWithHashingStrategy.java`
#### Snippet
```java
                return count;
            }
            procedure.value(this.nonSentinel(bucket.one), count++);
            if (bucket.two == null)
            {
```

### AssignmentToMethodParameter
Assignment to method parameter `count`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/strategy/mutable/UnifiedSetWithHashingStrategy.java`
#### Snippet
```java
                return count;
            }
            procedure.value(this.nonSentinel(bucket.two), count++);
            if (bucket.three == null)
            {
```

### AssignmentToMethodParameter
Assignment to method parameter `bucket`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/strategy/mutable/UnifiedSetWithHashingStrategy.java`
#### Snippet
```java
            if (bucket.three instanceof ChainedBucket)
            {
                bucket = (ChainedBucket) bucket.three;
                continue;
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `count`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/strategy/mutable/UnifiedSetWithHashingStrategy.java`
#### Snippet
```java
                continue;
            }
            procedure.value(this.nonSentinel(bucket.three), count++);
            return count;
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/mutable/CompositeFastList.java`
#### Snippet
```java
        while (index >= currentSize)
        {
            index -= currentSize;
            currentSize = this.lists.get(++p).size();
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/mutable/CompositeFastList.java`
#### Snippet
```java
        while (index >= currentSize)
        {
            index -= currentSize;
            currentSize = this.lists.get(++p).size();
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/mutable/CompositeFastList.java`
#### Snippet
```java
        while (index >= currentSize)
        {
            index -= currentSize;
            currentSize = this.lists.get(++p).size();
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `target`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/mutable/primitive/BooleanArrayList.java`
#### Snippet
```java
        if (target.length < this.size)
        {
            target = new boolean[this.size];
        }
        System.arraycopy(this.items, 0, target, 0, this.size);
```

### AssignmentToMethodParameter
Assignment to method parameter `from`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/primitive/LongInterval.java`
#### Snippet
```java
            if (from < to)
            {
                from++;
            }
            else
```

### AssignmentToMethodParameter
Assignment to method parameter `from`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/primitive/LongInterval.java`
#### Snippet
```java
            else
            {
                from--;
            }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `to`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/primitive/LongInterval.java`
#### Snippet
```java
            if (to > from)
            {
                to--;
            }
            else
```

### AssignmentToMethodParameter
Assignment to method parameter `to`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/primitive/LongInterval.java`
#### Snippet
```java
            else
            {
                to++;
            }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `from`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/primitive/LongInterval.java`
#### Snippet
```java
            if (from < to)
            {
                from++;
            }
            else
```

### AssignmentToMethodParameter
Assignment to method parameter `from`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/primitive/LongInterval.java`
#### Snippet
```java
            else
            {
                from--;
            }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `to`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/primitive/LongInterval.java`
#### Snippet
```java
            if (to > from)
            {
                to--;
            }
            else
```

### AssignmentToMethodParameter
Assignment to method parameter `to`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/primitive/LongInterval.java`
#### Snippet
```java
            else
            {
                to++;
            }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `result`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/primitive/LongInterval.java`
#### Snippet
```java
        if (result.length < this.size())
        {
            result = new long[this.size()];
        }
        long[] finalBypass = result;
```

### AssignmentToMethodParameter
Assignment to method parameter `target`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/immutable/primitive/ImmutableBooleanArrayList.java`
#### Snippet
```java
        if (target.length < this.size)
        {
            target = new boolean[this.size];
        }
        for (int i = 0; i < this.size; i++)
```

### AssignmentToMethodParameter
Assignment to method parameter `result`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/primitive/IntInterval.java`
#### Snippet
```java
        if (result.length < this.size())
        {
            result = new int[this.size()];
        }
        int[] finalBypass = result;
```

### AssignmentToMethodParameter
Assignment to method parameter `from`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/primitive/IntInterval.java`
#### Snippet
```java
            if (from < to)
            {
                from++;
            }
            else
```

### AssignmentToMethodParameter
Assignment to method parameter `from`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/primitive/IntInterval.java`
#### Snippet
```java
            else
            {
                from--;
            }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `to`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/primitive/IntInterval.java`
#### Snippet
```java
            if (to > from)
            {
                to--;
            }
            else
```

### AssignmentToMethodParameter
Assignment to method parameter `to`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/primitive/IntInterval.java`
#### Snippet
```java
            else
            {
                to++;
            }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `from`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/primitive/IntInterval.java`
#### Snippet
```java
            if (from < to)
            {
                from++;
            }
            else
```

### AssignmentToMethodParameter
Assignment to method parameter `from`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/primitive/IntInterval.java`
#### Snippet
```java
            else
            {
                from--;
            }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `to`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/primitive/IntInterval.java`
#### Snippet
```java
            if (to > from)
            {
                to--;
            }
            else
```

### AssignmentToMethodParameter
Assignment to method parameter `to`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/primitive/IntInterval.java`
#### Snippet
```java
            else
            {
                to++;
            }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `a`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/immutable/ImmutableArrayList.java`
#### Snippet
```java
        if (a.length < size)
        {
            a = (E[]) Array.newInstance(a.getClass().getComponentType(), size);
        }
        System.arraycopy(this.items, 0, a, 0, size);
```

### AssignmentToMethodParameter
Assignment to method parameter `array`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/mutable/FastList.java`
#### Snippet
```java
        if (array.length < this.size)
        {
            array = (E[]) Array.newInstance(array.getClass().getComponentType(), this.size);
        }
        System.arraycopy(this.items, 0, array, 0, this.size);
```

### AssignmentToMethodParameter
Assignment to method parameter `count`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/stack/mutable/ArrayStack.java`
#### Snippet
```java
        {
            targetCollection.add(this.pop());
            count--;
        }
        return targetCollection;
```

### AssignmentToMethodParameter
Assignment to method parameter `count`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/stack/mutable/ArrayStack.java`
#### Snippet
```java
        {
            result.add(this.pop());
            count--;
        }
        return result;
```

### AssignmentToMethodParameter
Assignment to method parameter `count`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/stack/mutable/ArrayStack.java`
#### Snippet
```java
        {
            targetStack.push(this.pop());
            count--;
        }
        return targetStack;
```

### AssignmentToMethodParameter
Assignment to method parameter `target`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/string/immutable/CharAdapter.java`
#### Snippet
```java
        if (target.length < size)
        {
            target = new char[size];
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `count`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/stack/immutable/ImmutableArrayStack.java`
#### Snippet
```java
        {
            newDelegate.remove(this.delegate.size() - 1);
            count--;
        }
        return new ImmutableArrayStack<>(newDelegate);
```

### AssignmentToMethodParameter
Assignment to method parameter `result`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/bimap/mutable/AbstractMutableBiMap.java`
#### Snippet
```java
            if (result.length < size)
            {
                result = (T[]) Array.newInstance(result.getClass().getComponentType(), size);
            }
            this.copyEntries(result);
```

### AssignmentToMethodParameter
Assignment to method parameter `setA`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/internal/SetIterables.java`
#### Snippet
```java
        {
            SetIterable<? extends E> tmp = setA;
            setA = setB;
            setB = tmp;
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `setB`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/internal/SetIterables.java`
#### Snippet
```java
            SetIterable<? extends E> tmp = setA;
            setA = setB;
            setB = tmp;
        }
        SetIterable<E> one = (SetIterable<E>) setA;
```

### AssignmentToMethodParameter
Assignment to method parameter `setA`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/internal/SetIterables.java`
#### Snippet
```java
        {
            SetIterable<? extends E> tmp = setA;
            setA = setB;
            setB = tmp;
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `setB`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/internal/SetIterables.java`
#### Snippet
```java
            SetIterable<? extends E> tmp = setA;
            setA = setB;
            setB = tmp;
        }
        return UnifiedSet.<E>newSet(setA).withAll(setB);
```

## RuleId[id=SynchronizationOnLocalVariableOrMethodParameter]
### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on method parameter `oldTable`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMap.java`
#### Snippet
```java
        if (last == null || last == RESIZE_SENTINEL)
        {
            synchronized (oldTable) // allocating a new array is too expensive to make this an atomic operation
            {
                if (oldTable.get(end) == null)
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on method parameter `oldTable`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMapUnsafe.java`
#### Snippet
```java
        if (last == null || last == RESIZE_SENTINEL)
        {
            synchronized (oldTable) // allocating a new array is too expensive to make this an atomic operation
            {
                if (ConcurrentHashMapUnsafe.arrayAt(oldTable, end) == null)
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on method parameter `each`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/Procedures.java`
#### Snippet
```java
            else
            {
                synchronized (each)
                {
                    this.procedure.value(each);
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on method parameter `each`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/Predicates.java`
#### Snippet
```java
        public boolean accept(T each)
        {
            synchronized (each)
            {
                return this.predicate.accept(each);
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on method parameter `each`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/Functions.java`
#### Snippet
```java
        public V valueOf(T each)
        {
            synchronized (each)
            {
                return this.function.valueOf(each);
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `collection`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/multimap/AbstractSynchronizedPutMultimap.java`
#### Snippet
```java
    {
        MutableCollection<V> collection = this.getIfAbsentPutCollection(key);
        synchronized (collection)
        {
            if (collection.add(value))
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `existingValues`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/multimap/AbstractSynchronizedPutMultimap.java`
#### Snippet
```java
        {
            C existingValues = this.getIfAbsentPutCollection(key);
            synchronized (existingValues)
            {
                this.addAll(existingValues, values);
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `existingValues`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/multimap/AbstractSynchronizedPutMultimap.java`
#### Snippet
```java

        C existingValues = this.getIfAbsentPutCollection(key);
        synchronized (existingValues)
        {
            if (existingValues.isEmpty())
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `bag`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/multimap/bag/SynchronizedPutHashBagMultimap.java`
#### Snippet
```java
            MutableBag<V> bag = this.map.getIfAbsentPutWith(key, this.createCollectionBlock(), this);

            synchronized (bag)
            {
                bag.addOccurrences(value, occurrences);
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/bag/sorted/immutable/ImmutableEmptySortedBag.java`
#### Snippet
```java
    public T getLast()
    {
        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/bag/sorted/immutable/ImmutableEmptySortedBag.java`
#### Snippet
```java
    public T getFirst()
    {
        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/bag/sorted/immutable/ImmutableEmptySortedBag.java`
#### Snippet
```java
    public T detectWithOccurrences(ObjectIntPredicate<? super T> predicate)
    {
        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/bag/sorted/immutable/ImmutableSortedBagImpl.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/bag/mutable/AbstractHashBag.java`
#### Snippet
```java
    {
        ObjectIntPair<T> pair = this.items.keyValuesView().detect(each -> predicate.accept(each.getOne(), each.getTwo()));
        return pair == null ? null : pair.getOne();
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/bag/sorted/mutable/TreeBag.java`
#### Snippet
```java
    {
        Pair<T, Counter> pair = this.items.keyValuesView().detect(each -> predicate.accept(each.getOne(), each.getTwo().getCount()));
        return pair == null ? null : pair.getOne();
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/AbstractMapIterable.java`
#### Snippet
```java
    {
        V result = this.get(key);
        return this.isAbsent(result, key) ? null : function.valueOf(result);
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/bag/immutable/ImmutableEmptyBag.java`
#### Snippet
```java
    public T getLast()
    {
        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/bag/immutable/ImmutableEmptyBag.java`
#### Snippet
```java
    public T getFirst()
    {
        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/bag/immutable/ImmutableEmptyBag.java`
#### Snippet
```java
    public <P> T detectWith(Predicate2<? super T, ? super P> predicate, P parameter)
    {
        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/bag/immutable/ImmutableEmptyBag.java`
#### Snippet
```java
    public T detect(Predicate<? super T> predicate)
    {
        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/bag/immutable/ImmutableEmptyBag.java`
#### Snippet
```java
    public T detectWithOccurrences(ObjectIntPredicate<? super T> predicate)
    {
        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/fixed/EmptyMap.java`
#### Snippet
```java
    public Pair<K, V> detect(Predicate2<? super K, ? super V> predicate)
    {
        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/fixed/EmptyMap.java`
#### Snippet
```java
    public V get(Object key)
    {
        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/fixed/SingletonMap.java`
#### Snippet
```java
            return Tuples.pair(this.key1, this.value1);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/fixed/SingletonMap.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/bag/immutable/ImmutableSingletonBag.java`
#### Snippet
```java
        return predicate.accept(this.value)
                ? this.value
                : null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/bag/immutable/ImmutableSingletonBag.java`
#### Snippet
```java
    public T detectWithOccurrences(ObjectIntPredicate<? super T> predicate)
    {
        return predicate.accept(this.value, 1) ? this.value : null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/bag/immutable/ImmutableArrayBag.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/fixed/DoubletonMap.java`
#### Snippet
```java
            return Tuples.pair(this.key2, this.value2);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/fixed/DoubletonMap.java`
#### Snippet
```java
            return this.value1;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/fixed/TripletonMap.java`
#### Snippet
```java
            return Tuples.pair(this.key3, this.value3);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/fixed/TripletonMap.java`
#### Snippet
```java
            return this.value1;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/sorted/immutable/ImmutableEmptySortedMap.java`
#### Snippet
```java
    public <A> A ifPresentApply(K key, Function<? super V, ? extends A> function)
    {
        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/sorted/immutable/ImmutableEmptySortedMap.java`
#### Snippet
```java
    public V get(Object key)
    {
        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/sorted/immutable/ImmutableEmptySortedMap.java`
#### Snippet
```java
    public Pair<K, V> detect(Predicate2<? super K, ? super V> predicate)
    {
        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/sorted/immutable/ImmutableTreeMap.java`
#### Snippet
```java
            return this.values[index];
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/primitive/ObjectBooleanHashMap.java`
#### Snippet
```java
    private K toNonSentinel(Object key)
    {
        return key == NULL_KEY ? null : (K) key;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/primitive/ObjectBooleanHashMapWithHashingStrategy.java`
#### Snippet
```java
    private K toNonSentinel(Object key)
    {
        return key == NULL_KEY ? null : (K) key;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/strategy/immutable/ImmutableEmptyMapWithHashingStrategy.java`
#### Snippet
```java
    public V get(Object key)
    {
        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/strategy/immutable/ImmutableEmptyMapWithHashingStrategy.java`
#### Snippet
```java
    public Pair<K, V> detect(Predicate2<? super K, ? super V> predicate)
    {
        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/strategy/immutable/ImmutableEmptyMapWithHashingStrategy.java`
#### Snippet
```java
    public <A> A ifPresentApply(K key, Function<? super V, ? extends A> function)
    {
        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/UnifiedMap.java`
#### Snippet
```java
                if (cur == null)
                {
                    return null;
                }
                if (UnifiedMap.this.nonNullTableObjectEquals(cur, key))
```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/UnifiedMap.java`
#### Snippet
```java
                }
            }
            return null;
        }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/UnifiedMap.java`
#### Snippet
```java
                        this.rehash(this.table.length);
                    }
                    return null;
                }
                if (this.nonNullTableObjectEquals(chain[i], key))
```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/UnifiedMap.java`
#### Snippet
```java
                this.rehash(this.table.length);
            }
            return null;
        }
        Object[] newChain = new Object[4];
```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/UnifiedMap.java`
#### Snippet
```java
            this.rehash(this.table.length);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/UnifiedMap.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/UnifiedMap.java`
#### Snippet
```java
            if (k == null)
            {
                return null;
            }
            if (this.nonNullTableObjectEquals(k, key))
```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/UnifiedMap.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/UnifiedMap.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/UnifiedMap.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/UnifiedMap.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/UnifiedMap.java`
#### Snippet
```java
                return map.put(this.key, value);
            }
            return null;
        }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/UnifiedMap.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/UnifiedMap.java`
#### Snippet
```java
            if (k == null)
            {
                return null;
            }
            if (this.nonNullTableObjectEquals(k, key))
```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/UnifiedMap.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/UnifiedMap.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/UnifiedMap.java`
#### Snippet
```java
    private K nonSentinel(Object key)
    {
        return key == NULL_KEY ? null : (K) key;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/UnifiedMap.java`
#### Snippet
```java
            if (cur == null)
            {
                return null;
            }
            if (UnifiedMap.this.nonNullTableObjectEquals(cur, key))
```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/UnifiedMap.java`
#### Snippet
```java
                }
            }
            return null;
        }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/immutable/ImmutableTripletonMap.java`
#### Snippet
```java
            return Tuples.pair(this.key3, this.value3);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/immutable/ImmutableTripletonMap.java`
#### Snippet
```java
            return this.value1;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/immutable/ImmutableEmptyMap.java`
#### Snippet
```java
    public Pair<K, V> detect(Predicate2<? super K, ? super V> predicate)
    {
        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/immutable/ImmutableEmptyMap.java`
#### Snippet
```java
    public <A> A ifPresentApply(K key, Function<? super V, ? extends A> function)
    {
        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/immutable/ImmutableEmptyMap.java`
#### Snippet
```java
    public V get(Object key)
    {
        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/immutable/ImmutableSingletonMap.java`
#### Snippet
```java
            return Tuples.pair(this.key1, this.value1);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/immutable/ImmutableSingletonMap.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/immutable/ImmutableQuadrupletonMap.java`
#### Snippet
```java
            return this.value1;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/immutable/ImmutableQuadrupletonMap.java`
#### Snippet
```java
            return Tuples.pair(this.key4, this.value4);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/immutable/ImmutableDoubletonMap.java`
#### Snippet
```java
            return Tuples.pair(this.key2, this.value2);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/immutable/ImmutableDoubletonMap.java`
#### Snippet
```java
            return this.value1;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentMutableHashMap.java`
#### Snippet
```java
    {
        V result = this.delegate.get(key);
        return result == null ? null : function.valueOf(result);
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMap.java`
#### Snippet
```java
    {
        V result = this.get(key);
        return result == null ? null : function.valueOf(result);
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMap.java`
#### Snippet
```java
        if (o == null)
        {
            return null;
        }
        return this.slowReplace(key, value, hash, currentArray);
```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMap.java`
#### Snippet
```java
                    if (newValue == null)
                    {
                        return null; // null value means no mapping is required
                    }
                    key = keyTransformer.value(key, newValue);
```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMap.java`
#### Snippet
```java
                {
                    this.incrementSizeAndPossiblyResize(currentArray, length, o);
                    return null;
                }
            }
```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMap.java`
#### Snippet
```java
                {
                    this.incrementSizeAndPossiblyResize(currentArray, length, o);
                    return null;
                }
            }
```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMap.java`
#### Snippet
```java
                    e = e.getNext();
                }
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMap.java`
#### Snippet
```java
                    e = e.getNext();
                }
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMap.java`
#### Snippet
```java
                    e = e.getNext();
                }
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMap.java`
#### Snippet
```java
                {
                    this.incrementSizeAndPossiblyResize(currentArray, length, o);
                    return null; // per the contract of putIfAbsent, we return null when the map didn't have this key before
                }
            }
```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMap.java`
#### Snippet
```java
            if (currentArray.compareAndSet(index, null, newEntry))
            {
                return null;
            }
            this.addToSize(-1);
```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMap.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMap.java`
#### Snippet
```java
            e = e.getNext();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMap.java`
#### Snippet
```java
                    e = e.getNext();
                }
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/fixed/EmptySet.java`
#### Snippet
```java
    public T getLast()
    {
        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/fixed/EmptySet.java`
#### Snippet
```java
    public T getFirst()
    {
        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMapUnsafe.java`
#### Snippet
```java
    {
        V result = this.get(key);
        return result == null ? null : function.valueOf(result);
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMapUnsafe.java`
#### Snippet
```java
                    e = e.getNext();
                }
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMapUnsafe.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMapUnsafe.java`
#### Snippet
```java
                    e = e.getNext();
                }
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMapUnsafe.java`
#### Snippet
```java
            e = e.getNext();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMapUnsafe.java`
#### Snippet
```java
                    e = e.getNext();
                }
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMapUnsafe.java`
#### Snippet
```java
                {
                    this.incrementSizeAndPossiblyResize(currentArray, length, o);
                    return null;
                }
            }
```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMapUnsafe.java`
#### Snippet
```java
                    e = e.getNext();
                }
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMapUnsafe.java`
#### Snippet
```java
                    if (newValue == null)
                    {
                        return null; // null value means no mapping is required
                    }
                    key = keyTransformer.value(key, newValue);
```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMapUnsafe.java`
#### Snippet
```java
                {
                    this.incrementSizeAndPossiblyResize(currentArray, length, o);
                    return null;
                }
            }
```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/sorted/immutable/ImmutableTreeSet.java`
#### Snippet
```java
                }
            }
            return null;
        }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/strategy/mutable/UnifiedMapWithHashingStrategy.java`
#### Snippet
```java
                if (cur == null)
                {
                    return null;
                }
                if (UnifiedMapWithHashingStrategy.this.nonNullTableObjectEquals(cur, key))
```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/strategy/mutable/UnifiedMapWithHashingStrategy.java`
#### Snippet
```java
                }
            }
            return null;
        }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/strategy/mutable/UnifiedMapWithHashingStrategy.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/strategy/mutable/UnifiedMapWithHashingStrategy.java`
#### Snippet
```java
            if (cur == null)
            {
                return null;
            }
            if (UnifiedMapWithHashingStrategy.this.nonNullTableObjectEquals(cur, key))
```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/strategy/mutable/UnifiedMapWithHashingStrategy.java`
#### Snippet
```java
                }
            }
            return null;
        }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/strategy/mutable/UnifiedMapWithHashingStrategy.java`
#### Snippet
```java
            if (k == null)
            {
                return null;
            }
            if (this.nonNullTableObjectEquals(k, key))
```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/strategy/mutable/UnifiedMapWithHashingStrategy.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/strategy/mutable/UnifiedMapWithHashingStrategy.java`
#### Snippet
```java
            if (k == null)
            {
                return null;
            }
            if (this.nonNullTableObjectEquals(k, key))
```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/strategy/mutable/UnifiedMapWithHashingStrategy.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/strategy/mutable/UnifiedMapWithHashingStrategy.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/strategy/mutable/UnifiedMapWithHashingStrategy.java`
#### Snippet
```java
                        this.rehash(this.table.length);
                    }
                    return null;
                }
                if (this.nonNullTableObjectEquals(chain[i], key))
```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/strategy/mutable/UnifiedMapWithHashingStrategy.java`
#### Snippet
```java
                this.rehash(this.table.length);
            }
            return null;
        }
        Object[] newChain = new Object[4];
```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/strategy/mutable/UnifiedMapWithHashingStrategy.java`
#### Snippet
```java
            this.rehash(this.table.length);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/strategy/mutable/UnifiedMapWithHashingStrategy.java`
#### Snippet
```java
                return map.put(this.key, value);
            }
            return null;
        }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/strategy/mutable/UnifiedMapWithHashingStrategy.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/strategy/mutable/UnifiedMapWithHashingStrategy.java`
#### Snippet
```java
    private K nonSentinel(Object key)
    {
        return key == NULL_KEY ? null : (K) key;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/strategy/immutable/ImmutableEmptySetWithHashingStrategy.java`
#### Snippet
```java
    public T getLast()
    {
        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/strategy/immutable/ImmutableEmptySetWithHashingStrategy.java`
#### Snippet
```java
    public T getFirst()
    {
        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/immutable/ImmutableEmptySet.java`
#### Snippet
```java
    public T getFirst()
    {
        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/immutable/ImmutableEmptySet.java`
#### Snippet
```java
    public T detect(Predicate<? super T> predicate)
    {
        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/immutable/ImmutableEmptySet.java`
#### Snippet
```java
    public T getLast()
    {
        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/lazy/CollectIterable.java`
#### Snippet
```java
        AttributePredicate<T, V> attributePredicate = new AttributePredicate<>(this.function, predicate);
        T resultItem = Iterate.detect(this.adapted, attributePredicate);
        return resultItem == null ? null : attributePredicate.functionResult();
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/lazy/CollectIterable.java`
#### Snippet
```java
        if (this.isEmpty())
        {
            return null;
        }
        return this.function.valueOf(Iterate.getLast(this.adapted));
```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/lazy/CollectIterable.java`
#### Snippet
```java
        if (this.isEmpty())
        {
            return null;
        }
        return this.function.valueOf(Iterate.getFirst(this.adapted));
```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/lazy/CompositeIterable.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/lazy/parallel/AbstractBatch.java`
#### Snippet
```java
        MinByProcedure<T, V> procedure = new MinByProcedure<>(function);
        this.forEach(procedure);
        return procedure.isVisitedAtLeastOnce() ? procedure.getResult() : null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/lazy/parallel/AbstractBatch.java`
#### Snippet
```java
        MaxByProcedure<T, V> procedure = new MaxByProcedure<>(function);
        this.forEach(procedure);
        return procedure.isVisitedAtLeastOnce() ? procedure.getResult() : null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/lazy/parallel/AbstractBatch.java`
#### Snippet
```java
        MaxComparatorProcedure<T> procedure = new MaxComparatorProcedure<>(comparator);
        this.forEach(procedure);
        return procedure.isVisitedAtLeastOnce() ? procedure.getResult() : null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/lazy/parallel/AbstractBatch.java`
#### Snippet
```java
        MinComparatorProcedure<T> procedure = new MinComparatorProcedure<>(comparator);
        this.forEach(procedure);
        return procedure.isVisitedAtLeastOnce() ? procedure.getResult() : null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/UnifiedSet.java`
#### Snippet
```java
            if (bucket.one == null)
            {
                return null;
            }
            if (predicate.accept(this.nonSentinel(bucket.one)))
```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/UnifiedSet.java`
#### Snippet
```java
            if (bucket.two == null)
            {
                return null;
            }
            if (predicate.accept(this.nonSentinel(bucket.two)))
```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/UnifiedSet.java`
#### Snippet
```java
            if (bucket.three == null)
            {
                return null;
            }
            if (bucket.three instanceof ChainedBucket)
```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/UnifiedSet.java`
#### Snippet
```java
                return bucket.three;
            }
            return null;
        }
        while (true);
```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/UnifiedSet.java`
#### Snippet
```java
        if (bucket.one == null)
        {
            return null;
        }
        if (this.nonNullTableObjectEquals(bucket.one, key))
```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/UnifiedSet.java`
#### Snippet
```java
        if (bucket.two == null)
        {
            return null;
        }
        if (this.nonNullTableObjectEquals(bucket.two, key))
```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/UnifiedSet.java`
#### Snippet
```java
        if (bucket.three == null)
        {
            return null;
        }
        if (bucket.three instanceof ChainedBucket)
```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/UnifiedSet.java`
#### Snippet
```java
            return this.nonSentinel(result);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/UnifiedSet.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/UnifiedSet.java`
#### Snippet
```java
    private T nonSentinel(Object key)
    {
        return key == NULL_KEY ? null : (T) key;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/UnifiedSet.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/UnifiedSet.java`
#### Snippet
```java
            if (bucket.one == null)
            {
                return null;
            }
            if (this.nonNullTableObjectEquals(bucket.one, key))
```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/UnifiedSet.java`
#### Snippet
```java
            if (bucket.two == null)
            {
                return null;
            }
            if (this.nonNullTableObjectEquals(bucket.two, key))
```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/UnifiedSet.java`
#### Snippet
```java
            if (bucket.three == null)
            {
                return null;
            }
            if (bucket.three instanceof ChainedBucket)
```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/UnifiedSet.java`
#### Snippet
```java
                return this.nonSentinel(result);
            }
            return null;
        }
        while (true);
```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/UnifiedSet.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/UnifiedSet.java`
#### Snippet
```java
        if (cur == null)
        {
            return null;
        }
        if (cur instanceof ChainedBucket)
```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/UnifiedSet.java`
#### Snippet
```java
            return this.nonSentinel(cur);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/UnifiedSet.java`
#### Snippet
```java
                        return bucket.three;
                    case 4:
                        return null; // this happens when a bucket is exactly full, and we're iterating
                    default:
                        throw new AssertionError();
```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/UnifiedSet.java`
#### Snippet
```java
        if (cur == null)
        {
            return null;
        }
        if (cur instanceof ChainedBucket)
```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/UnifiedSet.java`
#### Snippet
```java
            return (T) cur;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/UnifiedSet.java`
#### Snippet
```java
                Object result = this.three;
                this.three = null;
                return cur == 3 ? null : result;
            }
            if (this.two != null)
```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/UnifiedSet.java`
#### Snippet
```java
                Object result = this.two;
                this.two = null;
                return cur == 2 ? null : result;
            }
            if (this.one != null)
```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/UnifiedSet.java`
#### Snippet
```java
                Object result = this.one;
                this.one = null;
                return cur == 1 ? null : result;
            }
            this.zero = null;
```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/UnifiedSet.java`
#### Snippet
```java
            }
            this.zero = null;
            return null;
        }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/UnifiedSet.java`
#### Snippet
```java
            if (bucket.one == null)
            {
                return null;
            }
            if (this.nonNullTableObjectEquals(bucket.one, key))
```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/UnifiedSet.java`
#### Snippet
```java
            if (bucket.two == null)
            {
                return null;
            }
            if (this.nonNullTableObjectEquals(bucket.two, key))
```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/UnifiedSet.java`
#### Snippet
```java
            if (bucket.three == null)
            {
                return null;
            }
            if (this.nonNullTableObjectEquals(bucket.three, key))
```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/UnifiedSet.java`
#### Snippet
```java
                return this.nonSentinel(bucket.three);
            }
            return null;
        }
        while (true);
```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/lazy/parallel/bag/ParallelCollectUnsortedBag.java`
#### Snippet
```java
    {
        T resultItem = this.parallelIterable.detect(Predicates.attributePredicate(this.function, predicate));
        return resultItem == null ? null : this.function.valueOf(resultItem);
    }
}
```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/lazy/parallel/set/ParallelCollectIterable.java`
#### Snippet
```java
    {
        T resultItem = this.delegate.detect(Predicates.attributePredicate(this.function, predicate));
        return resultItem == null ? null : this.function.valueOf(resultItem);
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/lazy/parallel/list/ParallelCollectListIterable.java`
#### Snippet
```java
    {
        T resultItem = this.parallelIterable.detect(Predicates.attributePredicate(this.function, predicate));
        return resultItem == null ? null : this.function.valueOf(resultItem);
    }
}
```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/lazy/parallel/list/ListIterableBatch.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/fixed/EmptyList.java`
#### Snippet
```java
    public T getLast()
    {
        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/fixed/EmptyList.java`
#### Snippet
```java
    public T getFirst()
    {
        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/strategy/mutable/UnifiedSetWithHashingStrategy.java`
#### Snippet
```java
    private T nonSentinel(Object key)
    {
        return key == NULL_KEY ? null : (T) key;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/strategy/mutable/UnifiedSetWithHashingStrategy.java`
#### Snippet
```java
                        return bucket.three;
                    case 4:
                        return null; // this happens when a bucket is exactly full, and we're iterating
                    default:
                        throw new AssertionError();
```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/strategy/mutable/UnifiedSetWithHashingStrategy.java`
#### Snippet
```java
            if (bucket.one == null)
            {
                return null;
            }
            if (this.nonNullTableObjectEquals(bucket.one, key))
```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/strategy/mutable/UnifiedSetWithHashingStrategy.java`
#### Snippet
```java
            if (bucket.two == null)
            {
                return null;
            }
            if (this.nonNullTableObjectEquals(bucket.two, key))
```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/strategy/mutable/UnifiedSetWithHashingStrategy.java`
#### Snippet
```java
            if (bucket.three == null)
            {
                return null;
            }
            if (bucket.three instanceof ChainedBucket)
```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/strategy/mutable/UnifiedSetWithHashingStrategy.java`
#### Snippet
```java
                return this.nonSentinel(result);
            }
            return null;
        }
        while (true);
```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/strategy/mutable/UnifiedSetWithHashingStrategy.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/strategy/mutable/UnifiedSetWithHashingStrategy.java`
#### Snippet
```java
        if (bucket.one == null)
        {
            return null;
        }
        if (this.nonNullTableObjectEquals(bucket.one, key))
```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/strategy/mutable/UnifiedSetWithHashingStrategy.java`
#### Snippet
```java
        if (bucket.two == null)
        {
            return null;
        }
        if (this.nonNullTableObjectEquals(bucket.two, key))
```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/strategy/mutable/UnifiedSetWithHashingStrategy.java`
#### Snippet
```java
        if (bucket.three == null)
        {
            return null;
        }
        if (bucket.three instanceof ChainedBucket)
```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/strategy/mutable/UnifiedSetWithHashingStrategy.java`
#### Snippet
```java
            return this.nonSentinel(result);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/strategy/mutable/UnifiedSetWithHashingStrategy.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/strategy/mutable/UnifiedSetWithHashingStrategy.java`
#### Snippet
```java
        if (cur == null)
        {
            return null;
        }
        if (cur instanceof ChainedBucket)
```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/strategy/mutable/UnifiedSetWithHashingStrategy.java`
#### Snippet
```java
            return (T) cur;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/strategy/mutable/UnifiedSetWithHashingStrategy.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/strategy/mutable/UnifiedSetWithHashingStrategy.java`
#### Snippet
```java
            if (bucket.one == null)
            {
                return null;
            }
            if (this.nonNullTableObjectEquals(bucket.one, key))
```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/strategy/mutable/UnifiedSetWithHashingStrategy.java`
#### Snippet
```java
            if (bucket.two == null)
            {
                return null;
            }
            if (this.nonNullTableObjectEquals(bucket.two, key))
```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/strategy/mutable/UnifiedSetWithHashingStrategy.java`
#### Snippet
```java
            if (bucket.three == null)
            {
                return null;
            }
            if (this.nonNullTableObjectEquals(bucket.three, key))
```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/strategy/mutable/UnifiedSetWithHashingStrategy.java`
#### Snippet
```java
                return this.nonSentinel(bucket.three);
            }
            return null;
        }
        while (true);
```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/strategy/mutable/UnifiedSetWithHashingStrategy.java`
#### Snippet
```java
                Object result = this.three;
                this.three = null;
                return cur == 3 ? null : result;
            }
            if (this.two != null)
```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/strategy/mutable/UnifiedSetWithHashingStrategy.java`
#### Snippet
```java
                Object result = this.two;
                this.two = null;
                return cur == 2 ? null : result;
            }
            if (this.one != null)
```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/strategy/mutable/UnifiedSetWithHashingStrategy.java`
#### Snippet
```java
                Object result = this.one;
                this.one = null;
                return cur == 1 ? null : result;
            }
            this.zero = null;
```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/strategy/mutable/UnifiedSetWithHashingStrategy.java`
#### Snippet
```java
            }
            this.zero = null;
            return null;
        }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/strategy/mutable/UnifiedSetWithHashingStrategy.java`
#### Snippet
```java
            if (bucket.one == null)
            {
                return null;
            }
            if (predicate.accept(this.nonSentinel(bucket.one)))
```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/strategy/mutable/UnifiedSetWithHashingStrategy.java`
#### Snippet
```java
            if (bucket.two == null)
            {
                return null;
            }
            if (predicate.accept(this.nonSentinel(bucket.two)))
```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/strategy/mutable/UnifiedSetWithHashingStrategy.java`
#### Snippet
```java
            if (bucket.three == null)
            {
                return null;
            }
            if (bucket.three instanceof ChainedBucket)
```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/strategy/mutable/UnifiedSetWithHashingStrategy.java`
#### Snippet
```java
                return bucket.three;
            }
            return null;
        }
        while (true);
```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/strategy/mutable/UnifiedSetWithHashingStrategy.java`
#### Snippet
```java
        if (cur == null)
        {
            return null;
        }
        if (cur instanceof ChainedBucket)
```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/strategy/mutable/UnifiedSetWithHashingStrategy.java`
#### Snippet
```java
            return this.nonSentinel(cur);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/fixed/AbstractArrayAdapter.java`
#### Snippet
```java
    public T getLast()
    {
        return this.isEmpty() ? null : this.items[this.items.length - 1];
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/fixed/AbstractArrayAdapter.java`
#### Snippet
```java
    public T getFirst()
    {
        return this.isEmpty() ? null : this.items[0];
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/lazy/parallel/AbstractParallelIterable.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/immutable/ImmutableEmptyList.java`
#### Snippet
```java
    public T detect(Predicate<? super T> predicate)
    {
        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/immutable/ImmutableEmptyList.java`
#### Snippet
```java
    public T getFirst()
    {
        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/immutable/ImmutableEmptyList.java`
#### Snippet
```java
    public T getLast()
    {
        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/mutable/AbstractMutableList.java`
#### Snippet
```java
        public T getFirst()
        {
            return this.isEmpty() ? null : this.original.get(this.offset);
        }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/mutable/AbstractMutableList.java`
#### Snippet
```java
        public T getLast()
        {
            return this.isEmpty() ? null : this.original.get(this.offset + this.size - 1);
        }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/immutable/AbstractImmutableList.java`
#### Snippet
```java
        public T getLast()
        {
            return this.isEmpty() ? null : this.original.get(this.offset + this.size - 1);
        }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/immutable/AbstractImmutableList.java`
#### Snippet
```java
    public T getLast()
    {
        return this.isEmpty() ? null : this.get(this.size() - 1);
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/immutable/AbstractImmutableList.java`
#### Snippet
```java
        public T getFirst()
        {
            return this.isEmpty() ? null : this.original.get(this.offset);
        }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/immutable/AbstractImmutableList.java`
#### Snippet
```java
    public T getFirst()
    {
        return this.isEmpty() ? null : this.get(0);
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/immutable/ImmutableArrayList.java`
#### Snippet
```java
    public T getFirst()
    {
        return this.isEmpty() ? null : this.items[0];
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/immutable/ImmutableArrayList.java`
#### Snippet
```java
    public T getLast()
    {
        return this.isEmpty() ? null : this.items[this.items.length - 1];
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/mutable/FastList.java`
#### Snippet
```java
    public T getFirst()
    {
        return this.isEmpty() ? null : this.items[0];
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/mutable/FastList.java`
#### Snippet
```java
    public T getLast()
    {
        return this.isEmpty() ? null : this.items[this.size() - 1];
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/Functions0.java`
#### Snippet
```java
        public T value()
        {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/StringFunctions.java`
#### Snippet
```java
        public Character valueOf(String object)
        {
            return object == null || object.length() < 1 ? null : object.charAt(0);
        }
    }
```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/function/IfFunction.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/function/CaseFunction.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/Comparators.java`
#### Snippet
```java
            return Functions.toShortComparator((ShortFunction<T>) function);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/stack/immutable/ImmutableEmptyStack.java`
#### Snippet
```java
    public <P> T detectWith(Predicate2<? super T, ? super P> predicate, P parameter)
    {
        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/stack/immutable/ImmutableEmptyStack.java`
#### Snippet
```java
    public T detect(Predicate<? super T> predicate)
    {
        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/bimap/mutable/AbstractMutableBiMap.java`
#### Snippet
```java
        if (!this.delegate.containsKey(key))
        {
            return null;
        }
        V oldValue = this.delegate.remove(key);
```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/Functions.java`
#### Snippet
```java
                }
            }
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/Functions.java`
#### Snippet
```java
                }
            }
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/block/factory/Functions.java`
#### Snippet
```java
                }
            }
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/factory/Sets.java`
#### Snippet
```java
        if (sortedSetCollection.isEmpty())
        {
            return null;
        }
        SortedSet<E> sortedSetWithComparator = (SortedSet<E>) Iterate.detect(sortedSetCollection, HAS_NON_NULL_COMPARATOR);
```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/StringIterate.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/StringIterate.java`
#### Snippet
```java
            return value;
        }
        return value == null ? null : "";
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/StringIterate.java`
#### Snippet
```java
            return value;
        }
        return value == null ? null : "";
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/ArrayIterate.java`
#### Snippet
```java
            return objectArray[objectArray.length - 1];
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/ArrayIterate.java`
#### Snippet
```java
            return objectArray[0];
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/internal/ReflectionHelper.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/internal/InternalArrayIterate.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/internal/InternalArrayIterate.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/internal/IteratorIterate.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/internal/IteratorIterate.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/internal/IterableIterate.java`
#### Snippet
```java
            return iterator.next();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/ArrayListIterate.java`
#### Snippet
```java
                }
            }
            return null;
        }
        return RandomAccessListIterate.detect(list, predicate);
```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/ArrayListIterate.java`
#### Snippet
```java
                }
            }
            return null;
        }
        return RandomAccessListIterate.detectWith(list, predicate, parameter);
```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/parallel/ObjectIntProcedureFJTaskRunner.java`
#### Snippet
```java
    private static <BT> CountDownLatch buildCountDownLatch(Combiner<BT> newCombiner, int taskCount)
    {
        return newCombiner.useCombineOne() ? null : new CountDownLatch(taskCount);
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/parallel/ObjectIntProcedureFJTaskRunner.java`
#### Snippet
```java
    private static <BT> ArrayBlockingQueue<BT> buildQueue(Combiner<BT> newCombiner, int taskCount)
    {
        return newCombiner.useCombineOne() ? new ArrayBlockingQueue<>(taskCount) : null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/internal/RandomAccessListIterate.java`
#### Snippet
```java
    public static <T> T getLast(List<T> collection)
    {
        return Iterate.isEmpty(collection) ? null : collection.get(collection.size() - 1);
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/internal/RandomAccessListIterate.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/internal/RandomAccessListIterate.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/MapIterate.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/MapIterate.java`
#### Snippet
```java
        }
        V result = map.get(key);
        return MapIterate.isAbsent(result, map, key) ? null : function.valueOf(result);
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/ListIterate.java`
#### Snippet
```java
        if (list == null)
        {
            return null;
        }
        if (list instanceof RandomAccess)
```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/ListIterate.java`
#### Snippet
```java
            return iterator.previous();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/ListIterate.java`
#### Snippet
```java
    public static <T> T getFirst(List<T> collection)
    {
        return Iterate.isEmpty(collection) ? null : collection.get(0);
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections-api/src/main/java/org/eclipse/collections/api/factory/ServiceLoaderUtils.java`
#### Snippet
```java
        if (factories.isEmpty())
        {
            return null;
        }
        if (factories.size() > 1)
```

### ReturnNull
Return of `null`
in `eclipse-collections-api/src/main/java/org/eclipse/collections/api/factory/ServiceLoaderUtils.java`
#### Snippet
```java
            // ignore
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `eclipse-collections-testutils/src/main/java/org/eclipse/collections/impl/test/SerializeTestHelper.java`
#### Snippet
```java
        }

        return null;
    }
}
```

### ReturnNull
Return of `null`
in `eclipse-collections-testutils/src/main/java/org/eclipse/collections/impl/test/Verify.java`
#### Snippet
```java
            {
                new ObjectOutputStream(new ByteArrayOutputStream()).writeObject(actualObject);
                return null;
            });
        }
```

### ReturnNull
Return of `null`
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/utility/Iterate.java`
#### Snippet
```java
        if (iterable instanceof Collection)
        {
            return Iterate.isEmpty(iterable) ? null : iterable.iterator().next();
        }
        if (iterable != null)
```

## RuleId[id=EqualsWhichDoesntCheckParameterClass]
### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/UnmodifiableMap.java`
#### Snippet
```java

    @Override
    public boolean equals(Object o)
    {
        return o == this || this.delegate.equals(o);
```

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/bag/sorted/mutable/UnmodifiableSortedBag.java`
#### Snippet
```java

    @Override
    public boolean equals(Object obj)
    {
        return this.getSortedBag().equals(obj);
```

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/bag/mutable/UnmodifiableBag.java`
#### Snippet
```java

    @Override
    public boolean equals(Object obj)
    {
        return this.getMutableBag().equals(obj);
```

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/bag/immutable/ImmutableHashBag.java`
#### Snippet
```java

    @Override
    public boolean equals(Object obj)
    {
        return this.delegate.equals(obj);
```

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/sorted/mutable/TreeSortedMap.java`
#### Snippet
```java

    @Override
    public boolean equals(Object o)
    {
        return this.treeMap.equals(o);
```

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/sorted/mutable/SortedMapAdapter.java`
#### Snippet
```java

    @Override
    public boolean equals(Object o)
    {
        return this.delegate.equals(o);
```

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/MapAdapter.java`
#### Snippet
```java

    @Override
    public boolean equals(Object o)
    {
        return this.delegate.equals(o);
```

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/UnmodifiableMutableMap.java`
#### Snippet
```java

    @Override
    public boolean equals(Object obj)
    {
        return this.getMutableMap().equals(obj);
```

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/sorted/mutable/UnmodifiableTreeMap.java`
#### Snippet
```java

    @Override
    public boolean equals(Object obj)
    {
        return this.getMutableSortedMap().equals(obj);
```

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/ordered/mutable/OrderedMapAdapter.java`
#### Snippet
```java

    @Override
    public boolean equals(Object o)
    {
        return this.delegate.equals(o);
```

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/strategy/immutable/ImmutableUnifiedMapWithHashingStrategy.java`
#### Snippet
```java

    @Override
    public boolean equals(Object o)
    {
        return this.delegate.equals(o);
```

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/immutable/ImmutableUnifiedMap.java`
#### Snippet
```java

    @Override
    public boolean equals(Object o)
    {
        return this.delegate.equals(o);
```

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentMutableHashMap.java`
#### Snippet
```java

    @Override
    public boolean equals(Object o)
    {
        return this.delegate.equals(o);
```

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/ordered/mutable/UnmodifiableMutableOrderedMap.java`
#### Snippet
```java

    @Override
    public boolean equals(Object o)
    {
        return this.delegate.equals(o);
```

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/sorted/mutable/UnmodifiableSortedSet.java`
#### Snippet
```java

    @Override
    public boolean equals(Object obj)
    {
        if (obj == this)
```

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/sorted/mutable/TreeSortedSet.java`
#### Snippet
```java

    @Override
    public boolean equals(Object object)
    {
        if (this == object)
```

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/sorted/mutable/SortedSetAdapter.java`
#### Snippet
```java

    @Override
    public boolean equals(Object obj)
    {
        if (obj == this)
```

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/SetAdapter.java`
#### Snippet
```java

    @Override
    public boolean equals(Object obj)
    {
        if (obj == this)
```

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/strategy/immutable/ImmutableUnifiedSetWithHashingStrategy.java`
#### Snippet
```java

    @Override
    public boolean equals(Object other)
    {
        if (other == this)
```

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/mutable/UnmodifiableMutableSet.java`
#### Snippet
```java

    @Override
    public boolean equals(Object obj)
    {
        if (obj == this)
```

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/set/immutable/ImmutableUnifiedSet.java`
#### Snippet
```java

    @Override
    public boolean equals(Object other)
    {
        if (other == this)
```

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/mutable/AbstractListAdapter.java`
#### Snippet
```java

    @Override
    public boolean equals(Object o)
    {
        return this.getDelegate().equals(o);
```

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/list/mutable/UnmodifiableMutableList.java`
#### Snippet
```java

    @Override
    public boolean equals(Object obj)
    {
        return this.getMutableList().equals(obj);
```

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/bimap/mutable/UnmodifiableBiMap.java`
#### Snippet
```java

    @Override
    public boolean equals(Object o)
    {
        return this.delegate.equals(o);
```

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/string/immutable/CodePointList.java`
#### Snippet
```java

    @Override
    public boolean equals(Object otherList)
    {
        return this.codePoints.equals(otherList);
```

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/stack/mutable/UnmodifiableStack.java`
#### Snippet
```java

    @Override
    public boolean equals(Object obj)
    {
        return this.mutableStack.equals(obj);
```

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/bimap/mutable/AbstractMutableBiMap.java`
#### Snippet
```java
    {
        @Override
        public boolean equals(Object obj)
        {
            return AbstractMutableBiMap.this.delegate.keySet().equals(obj);
```

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/collection/AbstractSynchronizedRichIterable.java`
#### Snippet
```java

    @Override
    public boolean equals(Object obj)
    {
        if (obj == this || obj == this.delegate)
```

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/collection/mutable/AbstractMultiReaderMutableCollection.java`
#### Snippet
```java

        @Override
        public boolean equals(Object o)
        {
            return this.delegate.equals(o);
```

## RuleId[id=CastCanBeRemovedNarrowingVariableType]
### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'key' to 'K'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMap.java`
#### Snippet
```java
                Object key = e.getKey();
                Object value = e.getValue();
                block.value((K) key, (V) value);
                e = e.getNext();
            }
```

### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'value' to 'V'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMap.java`
#### Snippet
```java
                Object key = e.getKey();
                Object value = e.getValue();
                block.value((K) key, (V) value);
                e = e.getNext();
            }
```

### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'key' to 'K'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMap.java`
#### Snippet
```java
                Object key = e.getKey();
                Object value = e.getValue();
                this.put((K) key, (V) value);
                e = e.getNext();
            }
```

### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'value' to 'V'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMap.java`
#### Snippet
```java
                Object key = e.getKey();
                Object value = e.getValue();
                this.put((K) key, (V) value);
                e = e.getNext();
            }
```

### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'value' to 'V'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMap.java`
#### Snippet
```java
            {
                Object value = e.getValue();
                block.value((V) value);
                e = e.getNext();
            }
```

### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'key' to 'K'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMapUnsafe.java`
#### Snippet
```java
                Object key = e.getKey();
                Object value = e.getValue();
                this.put((K) key, (V) value);
                e = e.getNext();
            }
```

### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'value' to 'V'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMapUnsafe.java`
#### Snippet
```java
                Object key = e.getKey();
                Object value = e.getValue();
                this.put((K) key, (V) value);
                e = e.getNext();
            }
```

### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'value' to 'V'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMapUnsafe.java`
#### Snippet
```java
            {
                Object value = e.getValue();
                block.value((V) value);
                e = e.getNext();
            }
```

### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'key' to 'K'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMapUnsafe.java`
#### Snippet
```java
                Object key = e.getKey();
                Object value = e.getValue();
                block.value((K) key, (V) value);
                e = e.getNext();
            }
```

### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'value' to 'V'
in `eclipse-collections/src/main/java/org/eclipse/collections/impl/map/mutable/ConcurrentHashMapUnsafe.java`
#### Snippet
```java
                Object key = e.getKey();
                Object value = e.getValue();
                block.value((K) key, (V) value);
                e = e.getNext();
            }
```

## RuleId[id=TestCaseWithNoTestMethods]
### TestCaseWithNoTestMethods
Test class `SortedSetIterationTest` has no tests
in `jmh-tests/src/main/java/org/eclipse/collections/impl/jmh/set/sorted/SortedSetIterationTest.java`
#### Snippet
```java
@BenchmarkMode(Mode.Throughput)
@OutputTimeUnit(TimeUnit.SECONDS)
public class SortedSetIterationTest
{
    private static final int SIZE = 1_000_000;
```

