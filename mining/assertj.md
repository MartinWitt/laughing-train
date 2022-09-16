# assertj/assertj
# Bad smells
I found 1378 bad smells with 38 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryFullyQualifiedName | 681 | false |
| BoundedWildcard | 123 | false |
| MethodOverridesStaticMethod | 86 | false |
| ReturnNull | 80 | false |
| MethodOverloadsParentMethod | 60 | false |
| OptionalUsedAsFieldOrParameterType | 60 | false |
| RedundantMethodOverride | 30 | false |
| UnnecessarySuperQualifier | 21 | false |
| ArrayEquality | 18 | false |
| SizeReplaceableByIsEmpty | 17 | true |
| IgnoreResultOfCall | 17 | false |
| DeprecatedIsStillUsed | 17 | false |
| ConstantConditions | 16 | false |
| OptionalGetWithoutIsPresent | 15 | false |
| NonProtectedConstructorInAbstractClass | 13 | true |
| TypeParameterExtendsObject | 12 | false |
| AssignmentToMethodParameter | 12 | false |
| RedundantFieldInitialization | 10 | false |
| EmptyMethod | 9 | false |
| SystemOutErr | 9 | false |
| WrapperTypeMayBePrimitive | 8 | false |
| CastToIncompatibleInterface | 6 | false |
| NestedAssignment | 5 | false |
| RedundantStringFormatCall | 4 | false |
| Convert2MethodRef | 4 | false |
| RedundantSuppression | 4 | false |
| DynamicRegexReplaceableByCompiledPattern | 4 | false |
| UnnecessaryLocalVariable | 4 | true |
| KeySetIterationMayUseEntrySet | 3 | false |
| EqualsWithItself | 2 | false |
| RegExpRedundantEscape | 2 | false |
| NonExceptionNameEndsWithException | 2 | false |
| UnnecessaryToStringCall | 2 | true |
| StringEqualsEmptyString | 2 | false |
| RegExpUnnecessaryNonCapturingGroup | 2 | false |
| EmptyStatementBody | 1 | false |
| DuplicateBranchesInSwitch | 1 | false |
| StringBufferReplaceableByString | 1 | false |
| AbstractClassNeverImplemented | 1 | false |
| MissortedModifiers | 1 | false |
| IfStatementMissingBreakInLoop | 1 | false |
| SimplifyOptionalCallChains | 1 | false |
| CodeBlock2Expr | 1 | false |
| ExceptionNameDoesntEndWithException | 1 | false |
| StringConcatenationInsideStringBufferAppend | 1 | false |
| IOResource | 1 | false |
| UnnecessarySemicolon | 1 | false |
| SimplifyStreamApiCallChains | 1 | false |
| ProtectedMemberInFinalClass | 1 | true |
| ThrowablePrintStackTrace | 1 | false |
| ArrayHashCode | 1 | false |
| PointlessBooleanExpression | 1 | true |
| UseBulkOperation | 1 | false |
## EqualsWithItself
### EqualsWithItself
`compare()` called on itself
in `assertj-core/src/main/java/org/assertj/core/internal/Lists.java`
#### Snippet
```java
        // Compare unique element with itself to verify that it is compatible with comparator (a ClassCastException is
        // thrown if not). We have to use a raw comparator to compare the unique element of actual ... :(
        rawComparator.compare(actual.get(0), actual.get(0));
        return;
      }
```

### EqualsWithItself
`compare()` called on itself
in `assertj-core/src/main/java/org/assertj/core/internal/Arrays.java`
#### Snippet
```java
      if (arrayAsList.size() == 1) {
        // call compare to see if unique element is compatible with comparator.
        comparator.compare(arrayAsList.get(0), arrayAsList.get(0));
        return;
      }
```

## WrapperTypeMayBePrimitive
### WrapperTypeMayBePrimitive
Type may be primitive
in `assertj-core/src/main/java/org/assertj/core/util/introspection/FieldSupport.java`
#### Snippet
```java
        switch (clazz.getSimpleName()) {
        case BYTE:
          Byte byteValue = (byte) fieldValue;
          return (T) byteValue;
        case SHORT:
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `assertj-core/src/main/java/org/assertj/core/util/introspection/FieldSupport.java`
#### Snippet
```java
          return (T) byteValue;
        case SHORT:
          Short shortValue = (short) fieldValue;
          return (T) shortValue;
        case INT:
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `assertj-core/src/main/java/org/assertj/core/util/introspection/FieldSupport.java`
#### Snippet
```java
          return (T) shortValue;
        case INT:
          Integer intValue = (int) fieldValue;
          return (T) intValue;
        case LONG:
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `assertj-core/src/main/java/org/assertj/core/util/introspection/FieldSupport.java`
#### Snippet
```java
          return (T) intValue;
        case LONG:
          Long longValue = (long) fieldValue;
          return (T) longValue;
        case FLOAT:
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `assertj-core/src/main/java/org/assertj/core/util/introspection/FieldSupport.java`
#### Snippet
```java
          return (T) longValue;
        case FLOAT:
          Float floatValue = (float) fieldValue;
          return (T) floatValue;
        case DOUBLE:
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `assertj-core/src/main/java/org/assertj/core/util/introspection/FieldSupport.java`
#### Snippet
```java
          return (T) floatValue;
        case DOUBLE:
          Double doubleValue = (double) fieldValue;
          return (T) doubleValue;
        case BOOLEAN:
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `assertj-core/src/main/java/org/assertj/core/util/introspection/FieldSupport.java`
#### Snippet
```java
          return (T) doubleValue;
        case BOOLEAN:
          Boolean booleanValue = (boolean) fieldValue;
          return (T) booleanValue;
        case CHAR:
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `assertj-core/src/main/java/org/assertj/core/util/introspection/FieldSupport.java`
#### Snippet
```java
          return (T) booleanValue;
        case CHAR:
          Character charValue = (char) fieldValue;
          return (T) charValue;
        }
```

## EmptyStatementBody
### EmptyStatementBody
`while` statement has empty body
in `assertj-core/src/main/java/org/assertj/core/internal/Strings.java`
#### Snippet
```java
    LineNumberReader reader = new LineNumberReader(new StringReader(actual.toString()));
    try {
      while (reader.readLine() != null);
    } catch (IOException e) {
      throw new InputStreamsException(format("Unable to count lines in `%s`", actual), e);
```

## RegExpRedundantEscape
### RegExpRedundantEscape
Redundant character escape `\\]` in RegExp
in `assertj-core/src/main/java/org/assertj/core/api/recursive/comparison/ComparisonDifference.java`
#### Snippet
```java
    String index = path.substring(1);
    // index = 12
    return index.replaceFirst("\\]", "");
  }

```

### RegExpRedundantEscape
Redundant character escape `\\]` in RegExp
in `assertj-core/src/main/java/org/assertj/core/api/recursive/comparison/ComparisonDifference.java`
#### Snippet
```java
  // - \] represents ] in a regex
  // - $ represents the end of the string in a regex
  private static final String TOP_LEVEL_ELEMENT_PATTERN = "^\\[\\d+\\]$";
  private static final String FIELD = "field/property '%s'";
  private static final String TOP_LEVEL_OBJECTS = "Top level actual and expected objects";
```

## CastToIncompatibleInterface
### CastToIncompatibleInterface
Cast to incompatible interface `AssertJProxySetup`
in `assertj-core/src/main/java/org/assertj/core/api/SoftProxies.java`
#### Snippet
```java
      RecursiveComparisonAssert<?> proxiedAssert = (RecursiveComparisonAssert<?>) constructor.newInstance(recursiveComparisonAssert.actual,
                                                                                                          recursiveComparisonAssert.getRecursiveComparisonConfiguration());
      ((AssertJProxySetup) proxiedAssert).assertj$setup(new ProxifyMethodChangingTheObjectUnderTest(this), collector);
      return proxiedAssert;
    } catch (Exception e) {
```

### CastToIncompatibleInterface
Cast to incompatible interface `AssertJProxySetup`
in `assertj-core/src/main/java/org/assertj/core/api/SoftProxies.java`
#### Snippet
```java
      Constructor<?> constructor = proxyClass.getConstructor(AbstractFileAssert.class);
      FileSizeAssert<?> proxiedAssert = (FileSizeAssert<?>) constructor.newInstance(fileSizeAssert.returnToFile());
      ((AssertJProxySetup) proxiedAssert).assertj$setup(new ProxifyMethodChangingTheObjectUnderTest(this), collector);
      return proxiedAssert;
    } catch (Exception e) {
```

### CastToIncompatibleInterface
Cast to incompatible interface `AssertJProxySetup`
in `assertj-core/src/main/java/org/assertj/core/api/SoftProxies.java`
#### Snippet
```java
      SELF proxiedAssert = constructor.newInstance(actual);
      // instance is a AssertJProxySetup since it is a generated proxy implementing it (see createProxy)
      ((AssertJProxySetup) proxiedAssert).assertj$setup(new ProxifyMethodChangingTheObjectUnderTest(this), collector);
      return proxiedAssert;
    } catch (NoSuchMethodException | IllegalAccessException | InstantiationException | InvocationTargetException e) {
```

### CastToIncompatibleInterface
Cast to incompatible interface `AssertJProxySetup`
in `assertj-core/src/main/java/org/assertj/core/api/SoftProxies.java`
#### Snippet
```java
      Constructor<?> constructor = proxyClass.getConstructor(AbstractBigDecimalAssert.class);
      BigDecimalScaleAssert<?> proxiedAssert = (BigDecimalScaleAssert<?>) constructor.newInstance(bigDecimalScaleAssert.returnToBigDecimal());
      ((AssertJProxySetup) proxiedAssert).assertj$setup(new ProxifyMethodChangingTheObjectUnderTest(this), collector);
      return proxiedAssert;
    } catch (Exception e) {
```

### CastToIncompatibleInterface
Cast to incompatible interface `AssertJProxySetup`
in `assertj-core/src/main/java/org/assertj/core/api/SoftProxies.java`
#### Snippet
```java
      MapSizeAssert<?, ?> proxiedAssert = (MapSizeAssert<?, ?>) constructor.newInstance(mapSizeAssert.returnToMap(),
                                                                                        mapSizeAssert.actual);
      ((AssertJProxySetup) proxiedAssert).assertj$setup(new ProxifyMethodChangingTheObjectUnderTest(this), collector);
      return proxiedAssert;
    } catch (Exception e) {
```

### CastToIncompatibleInterface
Cast to incompatible interface `AssertJProxySetup`
in `assertj-core/src/main/java/org/assertj/core/api/SoftProxies.java`
#### Snippet
```java
      IterableSizeAssert<?> proxiedAssert = (IterableSizeAssert<?>) constructor.newInstance(iterableSizeAssert.returnToIterable(),
                                                                                            iterableSizeAssert.actual);
      ((AssertJProxySetup) proxiedAssert).assertj$setup(new ProxifyMethodChangingTheObjectUnderTest(this), collector);
      return proxiedAssert;
    } catch (Exception e) {
```

## KeySetIterationMayUseEntrySet
### KeySetIterationMayUseEntrySet
Iteration over `expectedMap.keySet()` may be replaced with 'entrySet()' iteration
in `assertj-core/src/main/java/org/assertj/core/api/recursive/comparison/RecursiveComparisonDifferenceCalculator.java`
#### Snippet
```java
    }
    // actual and expected maps have the same keys, we need now to compare their values
    for (Object key : expectedMap.keySet()) {
      FieldLocation keyFieldLocation = keyFieldLocation(dualValue.fieldLocation, key);
      comparisonState.registerForComparison(new DualValue(keyFieldLocation, actualMap.get(key), expectedMap.get(key)));
```

### KeySetIterationMayUseEntrySet
Iteration over `methodsModifier.keySet()` may be replaced with 'entrySet()' iteration
in `assertj-core/src/main/java/org/assertj/core/internal/Classes.java`
#### Snippet
```java
  private static boolean noNonMatchingModifier(Set<String> expectedMethodNames, Map<String, Integer> methodsModifier,
                                               Map<String, String> nonMatchingModifiers, int modifier) {
    for (String method : methodsModifier.keySet()) {
      if (expectedMethodNames.contains(method) && (methodsModifier.get(method) & modifier) == 0) {
        nonMatchingModifiers.put(method, Modifier.toString(methodsModifier.get(method)));
```

### KeySetIterationMayUseEntrySet
Iteration over `actual.keySet()` may be replaced with 'entrySet()' iteration
in `assertj-core/src/main/java/org/assertj/core/internal/Maps.java`
#### Snippet
```java
      // check entries order
      int index = 0;
      for (K keyFromActual : actual.keySet()) {
        if (!deepEquals(keyFromActual, entries[index].getKey())) {
          Entry<K, V> actualEntry = entry(keyFromActual, actual.get(keyFromActual));
```

## DuplicateBranchesInSwitch
### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `assertj-core/src/main/java/org/assertj/core/internal/Dates.java`
#### Snippet
```java
      calendarOther.set(Calendar.MILLISECOND, 0);
    case MICROSECONDS:
      break;
    default:
      break;
```

## SizeReplaceableByIsEmpty
### SizeReplaceableByIsEmpty
`s.length() == 0` can be replaced with 's.isEmpty()'
in `assertj-core/src/main/java/org/assertj/core/util/Strings.java`
#### Snippet
```java
   */
  public static boolean isNullOrEmpty(String s) {
    return s == null || s.length() == 0;
  }

```

### SizeReplaceableByIsEmpty
`rawChunk.size() != 0` can be replaced with '!rawChunk.isEmpty()'
in `assertj-core/src/main/java/org/assertj/core/util/diff/DiffUtils.java`
#### Snippet
```java
      if (m.find()) {
        // Process the lines in the previous chunk
        if (rawChunk.size() != 0) {
          List<String> oldChunkLines = new ArrayList<>();
          List<String> newChunkLines = new ArrayList<>();
```

### SizeReplaceableByIsEmpty
`line.length() > 0` can be replaced with '!line.isEmpty()'
in `assertj-core/src/main/java/org/assertj/core/util/diff/DiffUtils.java`
#### Snippet
```java
        }
      } else {
        if (line.length() > 0) {
          tag = line.substring(0, 1);
          rest = line.substring(1);
```

### SizeReplaceableByIsEmpty
`rawChunk.size() != 0` can be replaced with '!rawChunk.isEmpty()'
in `assertj-core/src/main/java/org/assertj/core/util/diff/DiffUtils.java`
#### Snippet
```java

    // Process the lines in the last chunk
    if (rawChunk.size() != 0) {
      List<String> oldChunkLines = new ArrayList<>();
      List<String> newChunkLines = new ArrayList<>();
```

### SizeReplaceableByIsEmpty
`str.trim().length() == 0` can be replaced with 'str.trim().isEmpty()'
in `assertj-core/src/main/java/org/assertj/core/error/AssertJMultipleFailuresError.java`
#### Snippet
```java

  private static boolean isBlank(String str) {
    return str == null || str.trim().length() == 0;
  }

```

### SizeReplaceableByIsEmpty
`modifier.length() > 0` can be replaced with '!modifier.isEmpty()'
in `assertj-core/src/main/java/org/assertj/core/error/ShouldHaveMethods.java`
#### Snippet
```java
          "  %s%n" +
          "not to have any " + (declared ? "declared " : "")
          + (modifier != null && modifier.length() > 0 ? modifier + " " : "") + "methods but it has the following:%n" +
          "  %s", actual, actualMethodsHavingModifier);
  }
```

### SizeReplaceableByIsEmpty
`propertyName.length() > 0` can be replaced with '!propertyName.isEmpty()'
in `assertj-core/src/main/java/org/assertj/core/groups/Properties.java`
#### Snippet
```java
  private static void checkIsNotNullOrEmpty(String propertyName) {
    requireNonNull(propertyName, "The name of the property to read should not be null");
    checkArgument(propertyName.length() > 0, "The name of the property to read should not be empty");
  }

```

### SizeReplaceableByIsEmpty
`actual.size() == 0` can be replaced with 'actual.isEmpty()'
in `assertj-core/src/main/java/org/assertj/core/internal/Lists.java`
#### Snippet
```java
      // Empty collections are considered sorted even if comparator can't be applied to their element type
      // We can't verify that point because of erasure type at runtime.
      if (actual.size() == 0) return;
      Comparator rawComparator = comparator;
      if (actual.size() == 1) {
```

### SizeReplaceableByIsEmpty
`extra.size() > 0` can be replaced with '!extra.isEmpty()'
in `assertj-core/src/main/java/org/assertj/core/internal/Iterables.java`
#### Snippet
```java
    List<Object> extra = stream(actual).filter(actualElement -> !iterableContains(values, actualElement))
                                       .collect(toList());
    if (extra.size() > 0) throw failures.failure(info, shouldBeSubsetOf(actual, values, extra, comparisonStrategy));
  }

```

### SizeReplaceableByIsEmpty
`nonNullElements.size() > 0` can be replaced with '!nonNullElements.isEmpty()'
in `assertj-core/src/main/java/org/assertj/core/internal/Iterables.java`
#### Snippet
```java
    // look for any non null elements
    List<Object> nonNullElements = stream(actual).filter(java.util.Objects::nonNull).collect(toList());
    if (nonNullElements.size() > 0) throw failures.failure(info, shouldContainOnlyNulls(actual, nonNullElements));
  }

```

### SizeReplaceableByIsEmpty
`erroneousElements.size() > 0` can be replaced with '!erroneousElements.isEmpty()'
in `assertj-core/src/main/java/org/assertj/core/internal/Iterables.java`
#### Snippet
```java
                                              .map(Optional::get)
                                              .collect(toList());
    if (erroneousElements.size() > 0) throw failures.failure(info, noElementsShouldSatisfy(actual, erroneousElements));
  }

```

### SizeReplaceableByIsEmpty
`matchingPaths.size() > 0` can be replaced with '!matchingPaths.isEmpty()'
in `assertj-core/src/main/java/org/assertj/core/internal/Paths.java`
#### Snippet
```java
  private void assertIsDirectoryNotContaining(AssertionInfo info, Path actual, Filter<Path> filter, String filterPresentation) {
    List<Path> matchingPaths = filterDirectory(info, actual, filter);
    if (matchingPaths.size() > 0) {
      throw failures.failure(info, directoryShouldNotContain(actual, matchingPaths, filterPresentation));
    }
```

### SizeReplaceableByIsEmpty
`arrayAsList.size() == 0` can be replaced with 'arrayAsList.isEmpty()'
in `assertj-core/src/main/java/org/assertj/core/internal/Arrays.java`
#### Snippet
```java
      List<T> arrayAsList = asList(array);
      // empty arrays are considered sorted even if comparator can't be applied to <T>.
      if (arrayAsList.size() == 0) return;
      if (arrayAsList.size() == 1) {
        // call compare to see if unique element is compatible with comparator.
```

### SizeReplaceableByIsEmpty
`extra.size() > 0` can be replaced with '!extra.isEmpty()'
in `assertj-core/src/main/java/org/assertj/core/internal/Arrays.java`
#### Snippet
```java
      }
    }
    if (extra.size() > 0) {
      throw failures.failure(info, shouldBeSubsetOf(actual, values, extra, comparisonStrategy));
    }
```

### SizeReplaceableByIsEmpty
`nonNullElements.size() > 0` can be replaced with '!nonNullElements.isEmpty()'
in `assertj-core/src/main/java/org/assertj/core/internal/Arrays.java`
#### Snippet
```java
      if (element != null) nonNullElements.add(element);
    }
    if (nonNullElements.size() > 0) throw failures.failure(info, shouldContainOnlyNulls(actual, nonNullElements));
  }

```

### SizeReplaceableByIsEmpty
`comparatorSimpleClassName.length() == 0` can be replaced with 'comparatorSimpleClassName.isEmpty()'
in `assertj-core/src/main/java/org/assertj/core/presentation/StandardRepresentation.java`
#### Snippet
```java
    if (!comparator.toString().contains("@")) return comparator.toString();
    String comparatorSimpleClassName = comparator.getClass().getSimpleName();
    if (comparatorSimpleClassName.length() == 0) return quote("anonymous comparator class");
    // if toString has not been redefined, let's use comparator simple class name.
    if (comparator.toString().contains(comparatorSimpleClassName + "@")) return comparatorSimpleClassName;
```

### SizeReplaceableByIsEmpty
`erroneousEntries.size() > 0` can be replaced with '!erroneousEntries.isEmpty()'
in `assertj-core/src/main/java/org/assertj/core/internal/Maps.java`
#### Snippet
```java
                                               .collect(toList());

    if (erroneousEntries.size() > 0) throw failures.failure(info, noElementsShouldSatisfy(actual, erroneousEntries));
  }

```

## StringBufferReplaceableByString
### StringBufferReplaceableByString
`StringBuilder builder` can be replaced with 'String'
in `assertj-core/src/main/java/org/assertj/core/error/ShouldNotSatisfyPredicateRecursively.java`
#### Snippet
```java
                                                                List<FieldLocation> failedFields) {
    List<String> fieldsDescription = failedFields.stream().map(FieldLocation::getPathToUseInErrorReport).collect(toList());
    StringBuilder builder = new StringBuilder(NEW_LINE);
    builder.append("The following fields did not satisfy the predicate:").append(NEW_LINE);
    builder.append(INDENT + fieldsDescription.toString() + NEW_LINE);
```

## ConstantConditions
### ConstantConditions
Method invocation `spliterator` may produce `NullPointerException`
in `assertj-core/src/main/java/org/assertj/core/api/AbstractIterableAssert.java`
#### Snippet
```java
                                                                                          .map(extractor -> extractor.apply(objectToExtractValueFrom))
                                                                                          .toArray());
    List<Tuple> tuples = stream(actual.spliterator(), false).map(tupleExtractor).collect(toList());
    return newListAssertInstanceForMethodsChangingElementType(tuples);
  }
```

### ConstantConditions
Method invocation `spliterator` may produce `NullPointerException`
in `assertj-core/src/main/java/org/assertj/core/api/AbstractIterableAssert.java`
#### Snippet
```java
  protected AbstractListAssert<?, List<? extends Object>, Object, ObjectAssert<Object>> flatExtractingForProxy(Function<? super ELEMENT, ?>[] extractors) {
    if (actual == null) throwAssertionError(shouldNotBeNull());
    Stream<? extends ELEMENT> actualStream = stream(actual.spliterator(), false);
    List<Object> result = actualStream.flatMap(element -> Stream.of(extractors).map(extractor -> extractor.apply(element)))
                                      .collect(toList());
```

### ConstantConditions
Value `actual` is always 'false'
in `assertj-core/src/main/java/org/assertj/core/api/AbstractBooleanAssert.java`
#### Snippet
```java
    objects.assertNotNull(info, actual);
    if (actual) return myself;
    throw Failures.instance().failure(info, shouldBeTrue(actual), actual, true);
  }

```

### ConstantConditions
Value `actual` is always 'false'
in `assertj-core/src/main/java/org/assertj/core/api/AbstractBooleanAssert.java`
#### Snippet
```java
    objects.assertNotNull(info, actual);
    if (actual) return myself;
    throw Failures.instance().failure(info, shouldBeTrue(actual), actual, true);
  }

```

### ConstantConditions
Value `actual` is always 'true'
in `assertj-core/src/main/java/org/assertj/core/api/AbstractBooleanAssert.java`
#### Snippet
```java
    objects.assertNotNull(info, actual);
    if (actual == false) return myself;
    throw Failures.instance().failure(info, shouldBeFalse(actual), actual, false);
  }

```

### ConstantConditions
Value `actual` is always 'true'
in `assertj-core/src/main/java/org/assertj/core/api/AbstractBooleanAssert.java`
#### Snippet
```java
    objects.assertNotNull(info, actual);
    if (actual == false) return myself;
    throw Failures.instance().failure(info, shouldBeFalse(actual), actual, false);
  }

```

### ConstantConditions
Immutable object is modified
in `assertj-core/src/main/java/org/assertj/core/api/recursive/comparison/DualValueDeque.java`
#### Snippet
```java
  public void add(int index, DualValue dualKey) {
    if (shouldIgnore(dualKey)) return;
    super.add(index, dualKey);
  }

```

### ConstantConditions
Immutable object is modified
in `assertj-core/src/main/java/org/assertj/core/api/recursive/comparison/DualValueDeque.java`
#### Snippet
```java
  public boolean add(DualValue dualKey) {
    if (shouldIgnore(dualKey)) return false;
    return super.add(dualKey);
  }

```

### ConstantConditions
Immutable object is modified
in `assertj-core/src/main/java/org/assertj/core/api/recursive/comparison/DualValueDeque.java`
#### Snippet
```java
  @Override
  public boolean addAll(int index, Collection<? extends DualValue> collection) {
    return super.addAll(index, collection.stream().filter(this::shouldAddDualKey).collect(toList()));
  }

```

### ConstantConditions
Value `recurse` is always 'true'
in `assertj-core/src/main/java/org/assertj/core/util/Files.java`
#### Snippet
```java
      if (existingFile.isDirectory()) {
        if (recurse) {
          scriptNames.addAll(fileNamesIn(existingFile, recurse));
        }
        continue;
```

### ConstantConditions
Condition `stackTrace != null` is always `true`
in `assertj-core/src/main/java/org/assertj/core/internal/Throwables.java`
#### Snippet
```java
    assertNotNull(info, actual);
    String stackTrace = org.assertj.core.util.Throwables.getStackTrace(actual);
    if (stackTrace != null && stackTrace.contains(description)) return;
    throw failures.failure(info, shouldContain(stackTrace, description));
  }
```

### ConstantConditions
Value `actualCause` is always 'null'
in `assertj-core/src/main/java/org/assertj/core/internal/Throwables.java`
#### Snippet
```java
      return;
    }
    if (actualCause == null) throw failures.failure(info, shouldHaveCause(actualCause, expectedCause));
    if (!compareThrowable(actualCause, expectedCause))
      throw failures.failure(info, shouldHaveCause(actualCause, expectedCause));
```

### ConstantConditions
Value `rootCause` is always 'null'
in `assertj-core/src/main/java/org/assertj/core/internal/Throwables.java`
#### Snippet
```java
    assertNotNull(info, actual);
    Throwable rootCause = getRootCause(actual);
    if (null == rootCause) throw failures.failure(info, shouldHaveRootCauseWithMessage(actual, rootCause, expectedMessage));
    if (java.util.Objects.equals(rootCause.getMessage(), expectedMessage)) return;
    throw failures.failure(info, shouldHaveRootCauseWithMessage(actual, rootCause, expectedMessage), rootCause.getMessage(),
```

### ConstantConditions
Argument `actual` might be null
in `assertj-core/src/main/java/org/assertj/core/internal/Strings.java`
#### Snippet
```java
  public void assertEqualsToNormalizingUnicode(AssertionInfo info, CharSequence actual, CharSequence expected) {
    if (actual != null) checkCharSequenceIsNotNull(expected);
    String normalizedActual = Normalizer.normalize(actual, Normalizer.Form.NFC);
    String normalizedExpected = Normalizer.normalize(expected, Normalizer.Form.NFC);
    if (!java.util.Objects.equals(normalizedActual, normalizedExpected))
```

### ConstantConditions
Value `from` is always 'null'
in `assertj-core/src/main/java/org/assertj/core/condition/MappedCondition.java`
#### Snippet
```java
    if (!mappingDescription.isEmpty()) sb.append(format("%n   using: %s", mappingDescription));

    if (from == null) sb.append(format("%n   from: %s%n", from));
    else sb.append(format("%n   from: <%s> %s%n", className(from), from));

```

### ConstantConditions
Value `to` is always 'null'
in `assertj-core/src/main/java/org/assertj/core/condition/MappedCondition.java`
#### Snippet
```java
    else sb.append(format("%n   from: <%s> %s%n", className(from), from));

    if (to == null) sb.append(format("   to:   %s%n", to));
    else sb.append(format("   to:   <%s> %s%n", className(to), to));

```

## AbstractClassNeverImplemented
### AbstractClassNeverImplemented
Abstract class `MemberUtils` has no concrete subclass
in `assertj-core/src/main/java/org/assertj/core/util/introspection/MemberUtils.java`
#### Snippet
```java
 * BeanUtils.
 */
abstract class MemberUtils {

    private static final int ACCESS_TEST = Modifier.PUBLIC | Modifier.PROTECTED | Modifier.PRIVATE;
```

## BoundedWildcard
### BoundedWildcard
Can generalize to `? extends AbstractAssert`
in `assertj-core/src/main/java/org/assertj/core/api/ProxifyMethodChangingTheObjectUnderTest.java`
#### Snippet
```java
  @RuntimeType
  public static AbstractAssert<?, ?> intercept(@FieldValue(FIELD_NAME) ProxifyMethodChangingTheObjectUnderTest dispatcher,
                                               @SuperCall Callable<AbstractAssert<?, ?>> assertionMethod,
                                               @This AbstractAssert<?, ?> currentAssertInstance) throws Exception {
    AbstractAssert<?, ?> result = assertionMethod.call();
```

### BoundedWildcard
Can generalize to `? extends V`
in `assertj-core/src/main/java/org/assertj/core/api/SoftProxies.java`
#### Snippet
```java
  }

  static <V> Class<? extends V> generateProxyClass(Class<V> assertClass) {
    ClassLoadingStrategyPair strategy = classLoadingStrategy(assertClass);
    return BYTE_BUDDY.subclass(assertClass)
```

### BoundedWildcard
Can generalize to `? extends T`
in `assertj-core/src/main/java/org/assertj/core/api/IterableAssert.java`
#### Snippet
```java


  static <T> Iterable<T> toIterable(Iterator<T> iterator) {
    return Streams.stream(iterator).collect(toList());
  }
```

### BoundedWildcard
Can generalize to `? extends T`
in `assertj-core/src/main/java/org/assertj/core/api/Java6StandardSoftAssertionsProvider.java`
#### Snippet
```java
   * @since 3.23.0.
   */
  default <T extends Throwable> ThrowableTypeAssert<T> assertThatExceptionOfType(final Class<T> throwableType) {
    return new SoftThrowableTypeAssert<>(throwableType, this);
  }
```

### BoundedWildcard
Can generalize to `? extends T`
in `assertj-core/src/main/java/org/assertj/core/api/AbstractObjectAssert.java`
#### Snippet
```java
   */
  @CheckReturnValue
  public <T> AbstractObjectAssert<?, T> extracting(Function<? super ACTUAL, T> extractor) {
    return super.extracting(extractor, this::newObjectAssert);
  }
```

### BoundedWildcard
Can generalize to `? super ACTUAL`
in `assertj-core/src/main/java/org/assertj/core/api/AbstractObjectAssert.java`
#### Snippet
```java
   * @see #usingComparatorForType(Comparator, Class)
   */
  public <T> SELF returns(T expected, Function<ACTUAL, T> from) {
    requireNonNull(from, "The given getter method/Function must not be null");
    Objects objects = getComparatorBasedObjectAssertions(expected.getClass());
```

### BoundedWildcard
Can generalize to `? super ACTUAL`
in `assertj-core/src/main/java/org/assertj/core/api/AbstractObjectAssert.java`
#### Snippet
```java
   * @see #usingComparatorForType(Comparator, Class)
   */
  public <T> SELF doesNotReturn(T expected, Function<ACTUAL, T> from) {
    requireNonNull(from, "The given getter method/Function must not be null");
    Objects objects = getComparatorBasedObjectAssertions(expected.getClass());
```

### BoundedWildcard
Can generalize to `? extends S`
in `assertj-core/src/main/java/org/assertj/core/api/SoftAssertionsProvider.java`
#### Snippet
```java
  * @since 3.16.0
  */
  static <S extends SoftAssertionsProvider> void assertSoftly(Class<S> type, Consumer<S> softly) {
    S assertions;
    try {
```

### BoundedWildcard
Can generalize to `? super S`
in `assertj-core/src/main/java/org/assertj/core/api/SoftAssertionsProvider.java`
#### Snippet
```java
  * @since 3.16.0
  */
  static <S extends SoftAssertionsProvider> void assertSoftly(Class<S> type, Consumer<S> softly) {
    S assertions;
    try {
```

### BoundedWildcard
Can generalize to `? extends ASSERTION`
in `assertj-core/src/main/java/org/assertj/core/api/Assumptions.java`
#### Snippet
```java
  }

  protected static <ASSERTION> Class<? extends ASSERTION> generateAssumptionClass(Class<ASSERTION> assertionType) {
    ClassLoadingStrategyPair strategy = classLoadingStrategy(assertionType);
    return BYTE_BUDDY.subclass(assertionType)
```

### BoundedWildcard
Can generalize to `? super VALUE`
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOptionalAssert.java`
#### Snippet
```java
   * @return this assertion object.
   */
  public SELF hasValueSatisfying(Consumer<VALUE> requirement) {
    assertValueIsPresent();
    requirement.accept(actual.get());
```

### BoundedWildcard
Can generalize to `? super C`
in `assertj-core/src/main/java/org/assertj/core/api/AtomicReferenceArrayAssert.java`
#### Snippet
```java
  @Deprecated
  @CheckReturnValue
  public <C> AtomicReferenceArrayAssert<T> usingComparatorForElementFieldsWithType(Comparator<C> comparator,
                                                                                   Class<C> type) {
    getComparatorsForElementPropertyOrFieldTypes().registerComparator(type, comparator);
```

### BoundedWildcard
Can generalize to `? extends C`
in `assertj-core/src/main/java/org/assertj/core/api/AtomicReferenceArrayAssert.java`
#### Snippet
```java
  @CheckReturnValue
  public <C> AtomicReferenceArrayAssert<T> usingComparatorForElementFieldsWithType(Comparator<C> comparator,
                                                                                   Class<C> type) {
    getComparatorsForElementPropertyOrFieldTypes().registerComparator(type, comparator);
    return myself;
```

### BoundedWildcard
Can generalize to `? super C`
in `assertj-core/src/main/java/org/assertj/core/api/AtomicReferenceArrayAssert.java`
#### Snippet
```java
   */
  @CheckReturnValue
  public <C> AtomicReferenceArrayAssert<T> usingComparatorForType(Comparator<C> comparator, Class<C> type) {
    if (arrays.getComparator() == null) {
      usingElementComparator(new ExtendedByTypesComparator(getComparatorsByType()));
```

### BoundedWildcard
Can generalize to `? extends C`
in `assertj-core/src/main/java/org/assertj/core/api/AtomicReferenceArrayAssert.java`
#### Snippet
```java
   */
  @CheckReturnValue
  public <C> AtomicReferenceArrayAssert<T> usingComparatorForType(Comparator<C> comparator, Class<C> type) {
    if (arrays.getComparator() == null) {
      usingElementComparator(new ExtendedByTypesComparator(getComparatorsByType()));
```

### BoundedWildcard
Can generalize to `? extends U`
in `assertj-core/src/main/java/org/assertj/core/api/AtomicReferenceArrayAssert.java`
#### Snippet
```java
   */
  @CheckReturnValue
  public <U> ObjectArrayAssert<U> extracting(Function<? super T, U> extractor) {
    U[] extracted = FieldsOrPropertiesExtractor.extract(array, extractor);

```

### BoundedWildcard
Can generalize to `? extends U`
in `assertj-core/src/main/java/org/assertj/core/api/AtomicReferenceArrayAssert.java`
#### Snippet
```java
   */
  @CheckReturnValue
  public <U, EXCEPTION extends Exception> ObjectArrayAssert<U> extracting(ThrowingExtractor<? super T, U, EXCEPTION> extractor) {
    U[] extracted = FieldsOrPropertiesExtractor.extract(array, extractor);

```

### BoundedWildcard
Can generalize to `? super T`
in `assertj-core/src/main/java/org/assertj/core/api/AbstractIterableAssert.java`
#### Snippet
```java
  @Deprecated
  @CheckReturnValue
  public <T> SELF usingComparatorForElementFieldsWithType(Comparator<T> comparator, Class<T> type) {
    getComparatorsForElementPropertyOrFieldTypes().registerComparator(type, comparator);
    return myself;
```

### BoundedWildcard
Can generalize to `? extends T`
in `assertj-core/src/main/java/org/assertj/core/api/AbstractIterableAssert.java`
#### Snippet
```java
  @Deprecated
  @CheckReturnValue
  public <T> SELF usingComparatorForElementFieldsWithType(Comparator<T> comparator, Class<T> type) {
    getComparatorsForElementPropertyOrFieldTypes().registerComparator(type, comparator);
    return myself;
```

### BoundedWildcard
Can generalize to `? super T`
in `assertj-core/src/main/java/org/assertj/core/api/AbstractIterableAssert.java`
#### Snippet
```java
   */
  @CheckReturnValue
  public <T> SELF usingComparatorForType(Comparator<T> comparator, Class<T> type) {
    if (iterables.getComparator() == null) {
      usingElementComparator(new ExtendedByTypesComparator(getComparatorsByType()));
```

### BoundedWildcard
Can generalize to `? extends T`
in `assertj-core/src/main/java/org/assertj/core/api/AbstractIterableAssert.java`
#### Snippet
```java
   */
  @CheckReturnValue
  public <T> SELF usingComparatorForType(Comparator<T> comparator, Class<T> type) {
    if (iterables.getComparator() == null) {
      usingElementComparator(new ExtendedByTypesComparator(getComparatorsByType()));
```

### BoundedWildcard
Can generalize to `? extends ELEMENT`
in `assertj-core/src/main/java/org/assertj/core/api/AbstractIterableAssert.java`
#### Snippet
```java

  // This method is protected in order to be proxied for SoftAssertions / Assumptions.
  protected SELF newAbstractIterableAssertForProxy(List<ELEMENT> filteredIterable) {
    return newAbstractIterableAssert(filteredIterable).withAssertionState(myself);
  }
```

### BoundedWildcard
Can generalize to `? super C`
in `assertj-core/src/main/java/org/assertj/core/api/AbstractObjectArrayAssert.java`
#### Snippet
```java
   */
  @CheckReturnValue
  public <C> SELF usingComparatorForType(Comparator<C> comparator, Class<C> type) {
    if (arrays.getComparator() == null) {
      usingElementComparator(new ExtendedByTypesComparator(getComparatorsByType()));
```

### BoundedWildcard
Can generalize to `? extends C`
in `assertj-core/src/main/java/org/assertj/core/api/AbstractObjectArrayAssert.java`
#### Snippet
```java
   */
  @CheckReturnValue
  public <C> SELF usingComparatorForType(Comparator<C> comparator, Class<C> type) {
    if (arrays.getComparator() == null) {
      usingElementComparator(new ExtendedByTypesComparator(getComparatorsByType()));
```

### BoundedWildcard
Can generalize to `? super OTHER_ELEMENT`
in `assertj-core/src/main/java/org/assertj/core/api/AbstractObjectArrayAssert.java`
#### Snippet
```java
   */
  public <OTHER_ELEMENT> SELF zipSatisfy(OTHER_ELEMENT[] other,
                                         BiConsumer<? super ELEMENT, OTHER_ELEMENT> zipRequirements) {
    iterables.assertZipSatisfy(info, newArrayList(actual), newArrayList(other), zipRequirements);
    return myself;
```

### BoundedWildcard
Can generalize to `? super C`
in `assertj-core/src/main/java/org/assertj/core/api/AbstractObjectArrayAssert.java`
#### Snippet
```java
  @Deprecated
  @CheckReturnValue
  public <C> SELF usingComparatorForElementFieldsWithType(Comparator<C> comparator, Class<C> type) {
    getComparatorsForElementPropertyOrFieldTypes().registerComparator(type, comparator);
    return myself;
```

### BoundedWildcard
Can generalize to `? extends C`
in `assertj-core/src/main/java/org/assertj/core/api/AbstractObjectArrayAssert.java`
#### Snippet
```java
  @Deprecated
  @CheckReturnValue
  public <C> SELF usingComparatorForElementFieldsWithType(Comparator<C> comparator, Class<C> type) {
    getComparatorsForElementPropertyOrFieldTypes().registerComparator(type, comparator);
    return myself;
```

### BoundedWildcard
Can generalize to `? extends ELEMENT`
in `assertj-core/src/main/java/org/assertj/core/api/ObjectArrayAssert.java`
#### Snippet
```java
  }

  public ObjectArrayAssert(AtomicReferenceArray<ELEMENT> actual) {
    this(array(actual));
  }
```

### BoundedWildcard
Can generalize to `? extends ELEMENT`
in `assertj-core/src/main/java/org/assertj/core/api/ListAssert.java`
#### Snippet
```java
    private List<ELEMENT> list;

    public ListFromStream(BaseStream<ELEMENT, STREAM> stream) {
      this.stream = stream;
    }
```

### BoundedWildcard
Can generalize to `? extends ACTUAL`
in `assertj-core/src/main/java/org/assertj/core/api/ObjectAssert.java`
#### Snippet
```java
  }
  
  public ObjectAssert(AtomicReference<ACTUAL> actual) {
    this(actual == null ? null: actual.get());
  }
```

### BoundedWildcard
Can generalize to `? super PRIMITIVE`
in `assertj-core/src/main/java/org/assertj/core/api/AbstractPredicateLikeAssert.java`
#### Snippet
```java
  Predicate<PRIMITIVE> primitivePredicate;

  protected AbstractPredicateLikeAssert(PRIMITIVE_PREDICATE actual, Predicate<PRIMITIVE> wrappedPredicate,
                                        Class<?> selfType) {
    super(actual, selfType);
```

### BoundedWildcard
Can generalize to `? super T`
in `assertj-core/src/main/java/org/assertj/core/api/AbstractAssert.java`
#### Snippet
```java
  @SuppressWarnings("unchecked")
  @Override
  public <T> SELF isInstanceOfSatisfying(Class<T> type, Consumer<T> requirements) {
    objects.assertIsInstanceOf(info, actual, type);
    requireNonNull(requirements, "The Consumer<T> expressing the assertions requirements must not be null");
```

### BoundedWildcard
Can generalize to `? extends AssertionError`
in `assertj-core/src/main/java/org/assertj/core/api/AbstractAssert.java`
#### Snippet
```java
  }

  private AssertionError multipleAssertionsError(List<AssertionError> assertionErrors) {
    // we don't allow overriding the error message to avoid loosing all the failed assertions error message.
    return assertionErrorCreator.multipleAssertionsError(info.description(), assertionErrors);
```

### BoundedWildcard
Can generalize to `? super Matcher`
in `assertj-core/src/main/java/org/assertj/core/api/AbstractCharSequenceAssert.java`
#### Snippet
```java
  }

  private SELF internalContainsPatternSatisfying(Pattern pattern, Consumer<Matcher> matchSatisfies) {
    Matcher matcher = pattern.matcher(actual);
    strings.assertContainsPattern(info, actual, matcher);
```

### BoundedWildcard
Can generalize to `? super Matcher`
in `assertj-core/src/main/java/org/assertj/core/api/AbstractCharSequenceAssert.java`
#### Snippet
```java

  // internal method to avoid double proxying if one assertion calls another one
  private SELF internalMatchesSatisfying(Pattern pattern, Consumer<Matcher> matchSatisfies) {
    Matcher matcher = pattern.matcher(actual);
    strings.assertMatches(info, actual, matcher);
```

### BoundedWildcard
Can generalize to `? extends T`
in `assertj-core/src/main/java/org/assertj/core/api/Java6BDDSoftAssertionsProvider.java`
#### Snippet
```java
   * @since 3.23.0.
   */
  default <T extends Throwable> ThrowableTypeAssert<T> thenExceptionOfType(final Class<T> throwableType) {
    return new SoftThrowableTypeAssert<>(throwableType, this);
  }
```

### BoundedWildcard
Can generalize to `? extends ExtensionContext`
in `assertj-core/src/main/java/org/assertj/core/api/junit/jupiter/SoftlyExtension.java`
#### Snippet
```java
  }

  private static Optional<ExtensionContext> getParent(Optional<ExtensionContext> currentContext) {
    return currentContext.flatMap(ExtensionContext::getParent);
  }
```

### BoundedWildcard
Can generalize to `? extends DateFormat`
in `assertj-core/src/main/java/org/assertj/core/api/AbstractDateAssert.java`
#### Snippet
```java
  }

  private Date parseDateWith(final String dateAsString, final Collection<DateFormat> dateFormats) {
    for (DateFormat defaultDateFormat : dateFormats) {
      try {
```

### BoundedWildcard
Can generalize to `? super T`
in `assertj-core/src/main/java/org/assertj/core/api/AbstractDateAssert.java`
#### Snippet
```java
  }

  private static <T> Date[] toDateArray(T[] values, Function<T, Date> converter) {
    Date[] dates = new Date[values.length];
    for (int i = 0; i < values.length; i++) {
```

### BoundedWildcard
Can generalize to `? extends Date`
in `assertj-core/src/main/java/org/assertj/core/api/AbstractDateAssert.java`
#### Snippet
```java
  }

  private static <T> Date[] toDateArray(T[] values, Function<T, Date> converter) {
    Date[] dates = new Date[values.length];
    for (int i = 0; i < values.length; i++) {
```

### BoundedWildcard
Can generalize to `? extends T`
in `assertj-core/src/main/java/org/assertj/core/util/Streams.java`
#### Snippet
```java
  }

  public static <T> Stream<T> stream(Iterator<T> iterator) {
    return StreamSupport.stream(Spliterators.spliteratorUnknownSize(iterator, 0), false);
  }
```

### BoundedWildcard
Can generalize to `? extends T`
in `assertj-core/src/main/java/org/assertj/core/util/Arrays.java`
#### Snippet
```java
   */
  @SuppressWarnings("unchecked")
  public static <T> T[] array(AtomicReferenceArray<T> atomicReferenceArray) {
    if (atomicReferenceArray == null) return null;
    int length = atomicReferenceArray.length();
```

### BoundedWildcard
Can generalize to `? extends T`
in `assertj-core/src/main/java/org/assertj/core/util/IterableUtil.java`
#### Snippet
```java
  }

  public static <T> Collection<T> toCollection(Iterable<T> iterable) {
    return iterable instanceof Collection ? (Collection<T>) iterable : newArrayList(iterable);
  }
```

### BoundedWildcard
Can generalize to `? extends T`
in `assertj-core/src/main/java/org/assertj/core/util/IterableUtil.java`
#### Snippet
```java
   *         null.
   */
  public static <T> T[] toArray(Iterable<? extends T> iterable, Class<T> type) {
    if (iterable == null) return null;
    Collection<? extends T> collection = toCollection(iterable);
```

### BoundedWildcard
Can generalize to `? extends T`
in `assertj-core/src/main/java/org/assertj/core/util/diff/Patch.java`
#### Snippet
```java
   * @throws IllegalStateException if can't apply patch
   */
  public List<T> applyTo(List<T> target) throws IllegalStateException {
    List<T> result = new LinkedList<>(target);
    ListIterator<Delta<T>> it = getDeltas().listIterator(deltas.size());
```

### BoundedWildcard
Can generalize to `? super DualValue`
in `assertj-core/src/main/java/org/assertj/core/api/recursive/comparison/RecursiveComparisonDifferenceCalculator.java`
#### Snippet
```java
    RecursiveComparisonConfiguration recursiveComparisonConfiguration;

    public ComparisonState(List<DualValue> visited, RecursiveComparisonConfiguration recursiveComparisonConfiguration) {
      this.visitedDualValues = visited;
      this.dualValuesToCompare = new DualValueDeque(recursiveComparisonConfiguration);
```

### BoundedWildcard
Can generalize to `? super Class`
in `assertj-core/src/main/java/org/assertj/core/util/introspection/ClassUtils.java`
#### Snippet
```java
   * @param interfacesFound the {@code Set} of interfaces for the class
   */
  static void getAllInterfaces(Class<?> cls, HashSet<Class<?>> interfacesFound) {
    while (cls != null) {
      Class<?>[] interfaces = cls.getInterfaces();
```

### BoundedWildcard
Can generalize to `? extends T`
in `assertj-core/src/main/java/org/assertj/core/util/introspection/PropertySupport.java`
#### Snippet
```java
  }

  private <T> List<T> simplePropertyValues(String propertyName, Class<T> clazz, Iterable<?> target) {
    return stream(target).map(e -> e == null ? null : propertyValue(propertyName, clazz, e))
                         .collect(collectingAndThen(toList(), Collections::unmodifiableList));
```

### BoundedWildcard
Can generalize to `? extends T`
in `assertj-core/src/main/java/org/assertj/core/util/introspection/FieldSupport.java`
#### Snippet
```java
  }

  private <T> List<T> simpleFieldValues(String fieldName, Class<T> clazz, Iterable<?> target) {
    return stream(target).map(e -> e == null ? null : fieldValue(fieldName, clazz, e))
                         .collect(collectingAndThen(toList(), Collections::unmodifiableList));
```

### BoundedWildcard
Can generalize to `? extends Delta`
in `assertj-core/src/main/java/org/assertj/core/util/diff/DiffUtils.java`
#### Snippet
```java
   */
  private static List<String> processDeltas(List<String> origLines,
                                            List<Delta<String>> deltas, int contextSize) {
    List<String> buffer = new ArrayList<>();
    int origTotal = 0; // counter for total lines output from Original
```

### BoundedWildcard
Can generalize to `? extends T`
in `assertj-core/src/main/java/org/assertj/core/util/diff/myers/MyersDiff.java`
#### Snippet
```java
  
   */
  private List<T> copyOfRange(final List<T> original, final int fromIndex, final int to) {
    return new ArrayList<>(original.subList(fromIndex, to));
  }
```

### BoundedWildcard
Can generalize to `? extends T`
in `assertj-core/src/main/java/org/assertj/core/util/diff/myers/MyersDiff.java`
#### Snippet
```java
   * @throws IllegalStateException if a diff path could not be found.
   */
  public PathNode buildPath(final List<T> orig, final List<T> rev) {
    checkArgument(orig != null, "original sequence is null");
    checkArgument(rev != null, "revised sequence is null");
```

### BoundedWildcard
Can generalize to `? extends T`
in `assertj-core/src/main/java/org/assertj/core/util/diff/myers/MyersDiff.java`
#### Snippet
```java
   * @throws IllegalStateException if a diff path could not be found.
   */
  public PathNode buildPath(final List<T> orig, final List<T> rev) {
    checkArgument(orig != null, "original sequence is null");
    checkArgument(rev != null, "revised sequence is null");
```

### BoundedWildcard
Can generalize to `? extends CharSequence`
in `assertj-core/src/main/java/org/assertj/core/error/ShouldNotContainCharSequence.java`
#### Snippet
```java

  public static ErrorMessageFactory shouldNotContainIgnoringCase(CharSequence actual, CharSequence[] sequences,
                                                                 Set<CharSequence> foundSequences) {
    return new ShouldNotContainCharSequence("%n" +
                                            "Expecting actual:%n" +
```

### BoundedWildcard
Can generalize to `? extends File`
in `assertj-core/src/main/java/org/assertj/core/error/ShouldNotContain.java`
#### Snippet
```java
  }

  private static List<String> toFileNames(List<File> files) {
    return files.stream()
                .map(File::getName)
```

### BoundedWildcard
Can generalize to `? extends Path`
in `assertj-core/src/main/java/org/assertj/core/error/ShouldNotContain.java`
#### Snippet
```java
  }

  private static List<String> toPathNames(List<Path> files) {
    return files.stream()
                .map(Path::toString)
```

### BoundedWildcard
Can generalize to `? extends Path`
in `assertj-core/src/main/java/org/assertj/core/error/ShouldContain.java`
#### Snippet
```java
  }

  private static List<String> toPathNames(List<Path> files) {
    return files.stream()
                .map(Path::toString)
```

### BoundedWildcard
Can generalize to `? extends File`
in `assertj-core/src/main/java/org/assertj/core/error/ShouldContain.java`
#### Snippet
```java
  }

  private static List<String> toFileNames(List<File> files) {
    return files.stream()
                .map(File::getName)
```

### BoundedWildcard
Can generalize to `? extends ZipSatisfyError`
in `assertj-core/src/main/java/org/assertj/core/error/ZippedElementsShouldSatisfy.java`
#### Snippet
```java
  }

  private static String describe(AssertionInfo info, List<ZipSatisfyError> zipSatisfyErrors) {
    List<String> errorsToStrings = zipSatisfyErrors.stream()
                                                   .map(error -> ZipSatisfyError.describe(info, error))
```

### BoundedWildcard
Can generalize to `? extends ComparisonDifference`
in `assertj-core/src/main/java/org/assertj/core/error/ShouldBeEqualByComparingFieldByFieldRecursively.java`
#### Snippet
```java

  public static ErrorMessageFactory shouldBeEqualByComparingFieldByFieldRecursively(Object actual, Object other,
                                                                                    List<ComparisonDifference> differences,
                                                                                    RecursiveComparisonConfiguration recursiveComparisonConfiguration,
                                                                                    Representation representation) {
```

### BoundedWildcard
Can generalize to `? extends Difference`
in `assertj-core/src/main/java/org/assertj/core/error/ShouldBeEqualByComparingFieldByFieldRecursively.java`
#### Snippet
```java

  public static ErrorMessageFactory shouldBeEqualByComparingFieldByFieldRecursive(Object actual, Object other,
                                                                                  List<Difference> differences,
                                                                                  Representation representation) {
    List<String> descriptionOfDifferences = differences.stream()
```

### BoundedWildcard
Can generalize to `? extends IndexedDiff`
in `assertj-core/src/main/java/org/assertj/core/error/ShouldContainExactly.java`
#### Snippet
```java
  }

  private static String formatIndexDifferences(List<IndexedDiff> indexedDiffs) {
    StringBuilder sb = new StringBuilder();
    sb.append("but there were differences at these indexes");
```

### BoundedWildcard
Can generalize to `? extends Delta`
in `assertj-core/src/main/java/org/assertj/core/error/AbstractShouldHaveTextContent.java`
#### Snippet
```java
  }

  protected static String diffsAsString(List<Delta<String>> diffsList) {
    return diffsList.stream().map(Delta::toString).collect(joining(System.lineSeparator()));
  }
```

### BoundedWildcard
Can generalize to `? extends Entry`
in `assertj-core/src/main/java/org/assertj/core/error/ShouldContainEntries.java`
#### Snippet
```java

  private static <K, V> List<String> buildValueDifferences(Map<? extends K, ? extends V> actual,
                                                           Set<Entry<? extends K, ? extends V>> entriesWithWrongValues,
                                                           Representation representation) {
    return entriesWithWrongValues.stream()
```

### BoundedWildcard
Can generalize to `? extends T`
in `assertj-core/src/main/java/org/assertj/core/groups/FieldsOrPropertiesExtractor.java`
#### Snippet
```java
   * @return the extracted values
   */
  public static <F, T> List<T> extract(Iterable<? extends F> objects, Function<? super F, T> extractor) {
    checkObjectToExtractFromIsNotNull(objects);
    return stream(objects).map(extractor).collect(toList());
```

### BoundedWildcard
Can generalize to `? extends T`
in `assertj-core/src/main/java/org/assertj/core/internal/AtomicReferenceArrayElementComparisonStrategy.java`
#### Snippet
```java
  }

  private boolean compareElementsOf(AtomicReferenceArray<T> actual, T[] other) {
    if (actual.length() != other.length) return false;
    // compare their elements with elementComparator
```

### BoundedWildcard
Can generalize to `? extends UnsatisfiedRequirement`
in `assertj-core/src/main/java/org/assertj/core/error/ElementsShouldSatisfy.java`
#### Snippet
```java
  }

  private static String describe(Entry<Integer, UnsatisfiedRequirement> requirementsAtIndex, AssertionInfo info) {
    int index = requirementsAtIndex.getKey();
    UnsatisfiedRequirement unsatisfiedRequirement = requirementsAtIndex.getValue();
```

### BoundedWildcard
Can generalize to `? extends UnsatisfiedRequirement`
in `assertj-core/src/main/java/org/assertj/core/error/ElementsShouldSatisfy.java`
#### Snippet
```java
  }

  private static String describeErrors(List<UnsatisfiedRequirement> elementsNotSatisfyingRequirements, AssertionInfo info) {
    return escapePercent(elementsNotSatisfyingRequirements.stream()
                                                          .map(unsatisfiedRequirement -> unsatisfiedRequirement.describe(info))
```

### BoundedWildcard
Can generalize to `? super Class`
in `assertj-core/src/main/java/org/assertj/core/internal/TypeHolder.java`
#### Snippet
```java
  }

  public TypeHolder(Comparator<Class<?>> comparator) {
    typeHolder = new TreeMap<>(requireNonNull(comparator, "Comparator must not be null"));
  }
```

### BoundedWildcard
Can generalize to `? super OTHER_ELEMENT`
in `assertj-core/src/main/java/org/assertj/core/internal/Iterables.java`
#### Snippet
```java
                                                               Iterable<? extends ACTUAL_ELEMENT> actual,
                                                               Iterable<OTHER_ELEMENT> other,
                                                               BiConsumer<? super ACTUAL_ELEMENT, OTHER_ELEMENT> zipRequirements) {
    assertNotNull(info, actual);
    requireNonNull(zipRequirements, "The BiConsumer expressing the assertions requirements must not be null");
```

### BoundedWildcard
Can generalize to `? extends ElementsSatisfyingConsumer`
in `assertj-core/src/main/java/org/assertj/core/internal/Iterables.java`
#### Snippet
```java
  }

  private static <E> Queue<ElementsSatisfyingConsumer<E>> removeElement(Queue<ElementsSatisfyingConsumer<E>> satisfiedElementsPerConsumer,
                                                                        E element) {
    // new Queue of ElementsSatisfyingConsumer without the given element, original ElementsSatisfyingConsumer are not modified.
```

### BoundedWildcard
Can generalize to `? super File`
in `assertj-core/src/main/java/org/assertj/core/internal/Files.java`
#### Snippet
```java
  }

  private boolean isDirectoryRecursivelyContaining(AssertionInfo info, File actual, Predicate<File> filter) {
    assertIsDirectory(info, actual);
    try (Stream<File> actualContent = recursiveContentOf(actual)) {
```

### BoundedWildcard
Can generalize to `? super File`
in `assertj-core/src/main/java/org/assertj/core/internal/Files.java`
#### Snippet
```java
  }

  public void assertIsDirectoryContaining(AssertionInfo info, File actual, Predicate<File> filter) {
    requireNonNull(filter, "The files filter should not be null");
    assertIsDirectoryContaining(info, actual, filter::test, "the given filter");
```

### BoundedWildcard
Can generalize to `? super File`
in `assertj-core/src/main/java/org/assertj/core/internal/Files.java`
#### Snippet
```java
  }

  public void assertIsDirectoryNotContaining(AssertionInfo info, File actual, Predicate<File> filter) {
    requireNonNull(filter, "The files filter should not be null");
    assertIsDirectoryNotContaining(info, actual, filter::test, "the given filter");
```

### BoundedWildcard
Can generalize to `? super Path`
in `assertj-core/src/main/java/org/assertj/core/internal/Paths.java`
#### Snippet
```java
  }

  public void assertIsDirectoryContaining(AssertionInfo info, Path actual, Predicate<Path> filter) {
    requireNonNull(filter, "The paths filter should not be null");
    assertIsDirectoryContaining(info, actual, filter::test, "the given filter");
```

### BoundedWildcard
Can generalize to `? super Path`
in `assertj-core/src/main/java/org/assertj/core/internal/Paths.java`
#### Snippet
```java
  }

  public void assertIsDirectoryNotContaining(AssertionInfo info, Path actual, Predicate<Path> filter) {
    requireNonNull(filter, "The paths filter should not be null");
    assertIsDirectoryNotContaining(info, actual, filter::test, "the given filter");
```

### BoundedWildcard
Can generalize to `? super Path`
in `assertj-core/src/main/java/org/assertj/core/internal/Paths.java`
#### Snippet
```java
  // non-public section

  private List<Path> filterDirectory(AssertionInfo info, Path actual, Filter<Path> filter) {
    assertIsDirectory(info, actual);
    try (DirectoryStream<Path> stream = nioFilesWrapper.newDirectoryStream(actual, filter)) {
```

### BoundedWildcard
Can generalize to `? super Path`
in `assertj-core/src/main/java/org/assertj/core/internal/Paths.java`
#### Snippet
```java
  }

  private boolean isDirectoryRecursivelyContaining(AssertionInfo info, Path actual, Predicate<Path> filter) {
    assertIsDirectory(info, actual);
    try (Stream<Path> actualContent = recursiveContentOf(actual)) {
```

### BoundedWildcard
Can generalize to `? extends T`
in `assertj-core/src/main/java/org/assertj/core/internal/IterableElementComparisonStrategy.java`
#### Snippet
```java
  }

  private boolean compareElementsOf(Iterable<T> actual, Iterable<T> other) {
    if (sizeOf(actual) != sizeOf(other)) return false;
    // compare their elements with elementComparator
```

### BoundedWildcard
Can generalize to `? extends T`
in `assertj-core/src/main/java/org/assertj/core/internal/IterableDiff.java`
#### Snippet
```java
  }

  private List<T> missingActualElements(Iterable<T> actual, Iterable<T> expected) {
    List<T> missingInExpected = new ArrayList<>();
    // use a copy to deal correctly with potential duplicates
```

### BoundedWildcard
Can generalize to `? extends T`
in `assertj-core/src/main/java/org/assertj/core/internal/IterableDiff.java`
#### Snippet
```java
  }

  private List<T> missingActualElements(Iterable<T> actual, Iterable<T> expected) {
    List<T> missingInExpected = new ArrayList<>();
    // use a copy to deal correctly with potential duplicates
```

### BoundedWildcard
Can generalize to `? extends T`
in `assertj-core/src/main/java/org/assertj/core/internal/IterableDiff.java`
#### Snippet
```java
   * @return the list of elements in the first iterable that are not in the second, i.e. first - second
   */
  private List<T> unexpectedActualElements(Iterable<T> actual, Iterable<T> expected) {
    List<T> missingInFirst = new ArrayList<>();
    // use a copy to deal correctly with potential duplicates
```

### BoundedWildcard
Can generalize to `? extends T`
in `assertj-core/src/main/java/org/assertj/core/internal/IterableDiff.java`
#### Snippet
```java
   * @return the list of elements in the first iterable that are not in the second, i.e. first - second
   */
  private List<T> unexpectedActualElements(Iterable<T> actual, Iterable<T> expected) {
    List<T> missingInFirst = new ArrayList<>();
    // use a copy to deal correctly with potential duplicates
```

### BoundedWildcard
Can generalize to `? super String`
in `assertj-core/src/main/java/org/assertj/core/internal/Classes.java`
#### Snippet
```java

  private static boolean noNonMatchingModifier(Set<String> expectedMethodNames, Map<String, Integer> methodsModifier,
                                               Map<String, String> nonMatchingModifiers, int modifier) {
    for (String method : methodsModifier.keySet()) {
      if (expectedMethodNames.contains(method) && (methodsModifier.get(method) & modifier) == 0) {
```

### BoundedWildcard
Can generalize to `? super String`
in `assertj-core/src/main/java/org/assertj/core/internal/Classes.java`
#### Snippet
```java

  private static boolean noNonMatchingModifier(Set<String> expectedMethodNames, Map<String, Integer> methodsModifier,
                                               Map<String, String> nonMatchingModifiers, int modifier) {
    for (String method : methodsModifier.keySet()) {
      if (expectedMethodNames.contains(method) && (methodsModifier.get(method) & modifier) == 0) {
```

### BoundedWildcard
Can generalize to `? super String`
in `assertj-core/src/main/java/org/assertj/core/internal/Classes.java`
#### Snippet
```java
   */
  private static boolean noMissingElement(Set<String> actualNames, Set<String> expectedNames,
                                          Set<String> missingNames) {
    for (String field : expectedNames) {
      if (!actualNames.contains(field)) missingNames.add(field);
```

### BoundedWildcard
Can generalize to `? super Comparable`
in `assertj-core/src/main/java/org/assertj/core/internal/Comparables.java`
#### Snippet
```java
   */
  private <T> void assertLessThan(AssertionInfo info, Comparable<? super T> actual, T other,
                                  TriFunction<Comparable<? super T>, T, ComparisonStrategy, ErrorMessageFactory> errorMessageFactory) {
    assertNotNull(info, actual);
    if (isLessThan(actual, other)) return;
```

### BoundedWildcard
Can generalize to `? super ComparisonStrategy`
in `assertj-core/src/main/java/org/assertj/core/internal/Comparables.java`
#### Snippet
```java
   */
  private <T> void assertLessThan(AssertionInfo info, Comparable<? super T> actual, T other,
                                  TriFunction<Comparable<? super T>, T, ComparisonStrategy, ErrorMessageFactory> errorMessageFactory) {
    assertNotNull(info, actual);
    if (isLessThan(actual, other)) return;
```

### BoundedWildcard
Can generalize to `? extends ErrorMessageFactory`
in `assertj-core/src/main/java/org/assertj/core/internal/Comparables.java`
#### Snippet
```java
   */
  private <T> void assertLessThan(AssertionInfo info, Comparable<? super T> actual, T other,
                                  TriFunction<Comparable<? super T>, T, ComparisonStrategy, ErrorMessageFactory> errorMessageFactory) {
    assertNotNull(info, actual);
    if (isLessThan(actual, other)) return;
```

### BoundedWildcard
Can generalize to `? super Comparable`
in `assertj-core/src/main/java/org/assertj/core/internal/Comparables.java`
#### Snippet
```java
   */
  private <T> void assertGreaterThan(AssertionInfo info, Comparable<? super T> actual, T other,
                                     TriFunction<Comparable<? super T>, T, ComparisonStrategy, ErrorMessageFactory> errorMessageFactory) {
    assertNotNull(info, actual);
    if (isGreaterThan(actual, other))
```

### BoundedWildcard
Can generalize to `? super ComparisonStrategy`
in `assertj-core/src/main/java/org/assertj/core/internal/Comparables.java`
#### Snippet
```java
   */
  private <T> void assertGreaterThan(AssertionInfo info, Comparable<? super T> actual, T other,
                                     TriFunction<Comparable<? super T>, T, ComparisonStrategy, ErrorMessageFactory> errorMessageFactory) {
    assertNotNull(info, actual);
    if (isGreaterThan(actual, other))
```

### BoundedWildcard
Can generalize to `? extends ErrorMessageFactory`
in `assertj-core/src/main/java/org/assertj/core/internal/Comparables.java`
#### Snippet
```java
   */
  private <T> void assertGreaterThan(AssertionInfo info, Comparable<? super T> actual, T other,
                                     TriFunction<Comparable<? super T>, T, ComparisonStrategy, ErrorMessageFactory> errorMessageFactory) {
    assertNotNull(info, actual);
    if (isGreaterThan(actual, other))
```

### BoundedWildcard
Can generalize to `? super Comparable`
in `assertj-core/src/main/java/org/assertj/core/internal/Comparables.java`
#### Snippet
```java
   */
  private <T> void assertLessThanOrEqualTo(AssertionInfo info, Comparable<? super T> actual, T other,
                                           TriFunction<Comparable<? super T>, T, ComparisonStrategy, ErrorMessageFactory> errorMessageFactory) {
    assertNotNull(info, actual);
    if (!isGreaterThan(actual, other))
```

### BoundedWildcard
Can generalize to `? super ComparisonStrategy`
in `assertj-core/src/main/java/org/assertj/core/internal/Comparables.java`
#### Snippet
```java
   */
  private <T> void assertLessThanOrEqualTo(AssertionInfo info, Comparable<? super T> actual, T other,
                                           TriFunction<Comparable<? super T>, T, ComparisonStrategy, ErrorMessageFactory> errorMessageFactory) {
    assertNotNull(info, actual);
    if (!isGreaterThan(actual, other))
```

### BoundedWildcard
Can generalize to `? extends ErrorMessageFactory`
in `assertj-core/src/main/java/org/assertj/core/internal/Comparables.java`
#### Snippet
```java
   */
  private <T> void assertLessThanOrEqualTo(AssertionInfo info, Comparable<? super T> actual, T other,
                                           TriFunction<Comparable<? super T>, T, ComparisonStrategy, ErrorMessageFactory> errorMessageFactory) {
    assertNotNull(info, actual);
    if (!isGreaterThan(actual, other))
```

### BoundedWildcard
Can generalize to `? super Comparable`
in `assertj-core/src/main/java/org/assertj/core/internal/Comparables.java`
#### Snippet
```java
   */
  private <T> void assertGreaterThanOrEqualTo(AssertionInfo info, Comparable<? super T> actual, T other,
                                              TriFunction<Comparable<? super T>, T, ComparisonStrategy, ErrorMessageFactory> errorMessageFactory) {
    assertNotNull(info, actual);
    if (!isLessThan(actual, other))
```

### BoundedWildcard
Can generalize to `? super ComparisonStrategy`
in `assertj-core/src/main/java/org/assertj/core/internal/Comparables.java`
#### Snippet
```java
   */
  private <T> void assertGreaterThanOrEqualTo(AssertionInfo info, Comparable<? super T> actual, T other,
                                              TriFunction<Comparable<? super T>, T, ComparisonStrategy, ErrorMessageFactory> errorMessageFactory) {
    assertNotNull(info, actual);
    if (!isLessThan(actual, other))
```

### BoundedWildcard
Can generalize to `? extends ErrorMessageFactory`
in `assertj-core/src/main/java/org/assertj/core/internal/Comparables.java`
#### Snippet
```java
   */
  private <T> void assertGreaterThanOrEqualTo(AssertionInfo info, Comparable<? super T> actual, T other,
                                              TriFunction<Comparable<? super T>, T, ComparisonStrategy, ErrorMessageFactory> errorMessageFactory) {
    assertNotNull(info, actual);
    if (!isLessThan(actual, other))
```

### BoundedWildcard
Can generalize to `? super E`
in `assertj-core/src/main/java/org/assertj/core/internal/Arrays.java`
#### Snippet
```java
  @SuppressWarnings("unchecked")
  private <E> List<E> filterElements(AssertionInfo info, Failures failures, Conditions conditions, Object array,
                                     Condition<E> condition, boolean negateCondition) throws AssertionError {
    assertNotNull(info, array);
    conditions.assertIsNotNull(condition);
```

### BoundedWildcard
Can generalize to `? super FROM`
in `assertj-core/src/main/java/org/assertj/core/condition/MappedCondition.java`
#### Snippet
```java
  }

  private MappedCondition(Function<FROM, TO> mapping, Condition<TO> condition, String mappingDescription) {
    requireNonNull(condition, "The given condition should not be null");
    requireNonNull(mapping, "The given mapping function should not be null");
```

### BoundedWildcard
Can generalize to `? extends TO`
in `assertj-core/src/main/java/org/assertj/core/condition/MappedCondition.java`
#### Snippet
```java
  }

  private MappedCondition(Function<FROM, TO> mapping, Condition<TO> condition, String mappingDescription) {
    requireNonNull(condition, "The given condition should not be null");
    requireNonNull(mapping, "The given mapping function should not be null");
```

### BoundedWildcard
Can generalize to `? super TO`
in `assertj-core/src/main/java/org/assertj/core/condition/MappedCondition.java`
#### Snippet
```java
  }

  private MappedCondition(Function<FROM, TO> mapping, Condition<TO> condition, String mappingDescription) {
    requireNonNull(condition, "The given condition should not be null");
    requireNonNull(mapping, "The given mapping function should not be null");
```

### BoundedWildcard
Can generalize to `? extends Function`
in `assertj-core/src/main/java/org/assertj/core/extractor/ByNameMultipleExtractor.java`
#### Snippet
```java
  }

  private List<Object> extractValues(Object input, List<Function<Object, Object>> singleExtractors) {
    return singleExtractors.stream().map(extractor -> extractor.apply(input)).collect(toList());
  }
```

### BoundedWildcard
Can generalize to `? super NESTED`
in `assertj-core/src/main/java/org/assertj/core/condition/NestableCondition.java`
#### Snippet
```java
  }

  private static <ACTUAL, NESTED> Condition<ACTUAL> compose(Condition<NESTED> condition, Function<ACTUAL, NESTED> extractor) {
    return new Condition<ACTUAL>() {
      @Override
```

### BoundedWildcard
Can generalize to `? super ACTUAL`
in `assertj-core/src/main/java/org/assertj/core/condition/NestableCondition.java`
#### Snippet
```java
  }

  private static <ACTUAL, NESTED> Condition<ACTUAL> compose(Condition<NESTED> condition, Function<ACTUAL, NESTED> extractor) {
    return new Condition<ACTUAL>() {
      @Override
```

### BoundedWildcard
Can generalize to `? extends NESTED`
in `assertj-core/src/main/java/org/assertj/core/condition/NestableCondition.java`
#### Snippet
```java
  }

  private static <ACTUAL, NESTED> Condition<ACTUAL> compose(Condition<NESTED> condition, Function<ACTUAL, NESTED> extractor) {
    return new Condition<ACTUAL>() {
      @Override
```

### BoundedWildcard
Can generalize to `? extends Condition`
in `assertj-core/src/main/java/org/assertj/core/condition/NestableCondition.java`
#### Snippet
```java
  }

  private static <ACTUAL, NESTED> List<Condition<ACTUAL>> compose(Stream<Condition<NESTED>> conditions,
                                                                  Function<ACTUAL, NESTED> extractor) {
    return conditions.map(condition -> compose(condition, extractor)).collect(toList());
```

### BoundedWildcard
Can generalize to `? extends Comparator`
in `assertj-core/src/main/java/org/assertj/core/internal/Objects.java`
#### Snippet
```java
  @SuppressWarnings({ "unchecked", "rawtypes" })
  static boolean propertyOrFieldValuesAreEqual(Object actualFieldValue, Object otherFieldValue, String fieldName,
                                               Map<String, Comparator<?>> comparatorByPropertyOrField,
                                               TypeComparators comparatorByType) {
    // no need to look into comparators if objects are the same
```

### BoundedWildcard
Can generalize to `? super K`
in `assertj-core/src/main/java/org/assertj/core/internal/Maps.java`
#### Snippet
```java
  }

  private static <K, V> Set<Entry<? extends K, ? extends V>> getNotFoundEntries(Map<K, V> actual,
                                                                                Entry<? extends K, ? extends V>[] entries) {
    // Stream API avoided for performance reasons
```

### BoundedWildcard
Can generalize to `? super V`
in `assertj-core/src/main/java/org/assertj/core/internal/Maps.java`
#### Snippet
```java
  }

  private static <K, V> Set<Entry<? extends K, ? extends V>> getNotFoundEntries(Map<K, V> actual,
                                                                                Entry<? extends K, ? extends V>[] entries) {
    // Stream API avoided for performance reasons
```

### BoundedWildcard
Can generalize to `? super K`
in `assertj-core/src/main/java/org/assertj/core/internal/Maps.java`
#### Snippet
```java
  }

  private static <K> Set<K> getNotFoundKeys(Map<K, ?> actual, K[] expectedKeys) {
    // Stream API avoided for performance reasons
    Set<K> notFound = new LinkedHashSet<>();
```

### BoundedWildcard
Can generalize to `? extends K`
in `assertj-core/src/main/java/org/assertj/core/internal/Maps.java`
#### Snippet
```java

  @SuppressWarnings("unchecked")
  private static <K, V> Map<K, V> clone(Map<K, V> map) throws NoSuchMethodException {
    if (isMultiValueMapAdapterInstance(map)) throw new IllegalArgumentException("Cannot clone MultiValueMapAdapter");

```

### BoundedWildcard
Can generalize to `? extends V`
in `assertj-core/src/main/java/org/assertj/core/internal/Maps.java`
#### Snippet
```java

  @SuppressWarnings("unchecked")
  private static <K, V> Map<K, V> clone(Map<K, V> map) throws NoSuchMethodException {
    if (isMultiValueMapAdapterInstance(map)) throw new IllegalArgumentException("Cannot clone MultiValueMapAdapter");

```

### BoundedWildcard
Can generalize to `? super K`
in `assertj-core/src/main/java/org/assertj/core/internal/Maps.java`
#### Snippet
```java
  }

  private static <K> Set<K> getFoundKeys(Map<K, ?> actual, K[] expectedKeys) {
    // Stream API avoided for performance reasons
    Set<K> found = new LinkedHashSet<>();
```

### BoundedWildcard
Can generalize to `? super V`
in `assertj-core/src/main/java/org/assertj/core/internal/Maps.java`
#### Snippet
```java
  }

  private static <V> Set<V> getNotFoundValues(Map<?, V> actual, V[] expectedValues) {
    // Stream API avoided for performance reasons
    Set<V> notFound = new LinkedHashSet<>();
```

### BoundedWildcard
Can generalize to `? super Entry`
in `assertj-core/src/main/java/org/assertj/core/internal/Maps.java`
#### Snippet
```java

  private <K, V> void compareActualMapAndExpectedEntries(Map<K, V> actual, Entry<? extends K, ? extends V>[] entries,
                                                         Set<Entry<? extends K, ? extends V>> notExpected,
                                                         Set<Entry<? extends K, ? extends V>> notFound) {
    Map<K, V> expectedEntries = entriesToMap(entries);
```

### BoundedWildcard
Can generalize to `? super Entry`
in `assertj-core/src/main/java/org/assertj/core/internal/Maps.java`
#### Snippet
```java
  private <K, V> void compareActualMapAndExpectedEntries(Map<K, V> actual, Entry<? extends K, ? extends V>[] entries,
                                                         Set<Entry<? extends K, ? extends V>> notExpected,
                                                         Set<Entry<? extends K, ? extends V>> notFound) {
    Map<K, V> expectedEntries = entriesToMap(entries);
    Map<K, V> actualEntries = new LinkedHashMap<>(actual);
```

### BoundedWildcard
Can generalize to `? super K`
in `assertj-core/src/main/java/org/assertj/core/internal/Maps.java`
#### Snippet
```java
  }

  public <K, V> void assertContainsOnlyKeys(AssertionInfo info, Map<K, V> actual, K[] keys) {
    assertContainsOnlyKeys(info, actual, "array of keys", keys);
  }
```

### BoundedWildcard
Can generalize to `? super DualKey`
in `assertj-core/src/main/java/org/assertj/core/internal/DeepDifference.java`
#### Snippet
```java
   *         equivalent items.
   */
  private static boolean compareArrays(Object array1, Object array2, List<String> path, Deque<DualKey> toCompare,
                                       Set<DualKey> visited) {
    int len = Array.getLength(array1);
```

### BoundedWildcard
Can generalize to `? super DualKey`
in `assertj-core/src/main/java/org/assertj/core/internal/DeepDifference.java`
#### Snippet
```java
   */
  private static <K, V> boolean compareUnorderedCollectionByHashCodes(Collection<K> col1, Collection<V> col2,
                                                                      List<String> path, Deque<DualKey> toCompare,
                                                                      Set<DualKey> visited) {
    Map<Integer, Object> fastLookup = new HashMap<>();
```

### BoundedWildcard
Can generalize to `? super DualKey`
in `assertj-core/src/main/java/org/assertj/core/internal/DeepDifference.java`
#### Snippet
```java
   */
  private static <K1, V1, K2, V2> boolean compareSortedMap(SortedMap<K1, V1> map1, SortedMap<K2, V2> map2,
                                                           List<String> path, Deque<DualKey> toCompare,
                                                           Set<DualKey> visited) {
    if (map1.size() != map2.size()) {
```

### BoundedWildcard
Can generalize to `? super DualKey`
in `assertj-core/src/main/java/org/assertj/core/internal/DeepDifference.java`
#### Snippet
```java
   */
  private static <K1, V1, K2, V2> boolean compareUnorderedMap(Map<K1, V1> map1, Map<K2, V2> map2,
                                                              List<String> path, Deque<DualKey> toCompare,
                                                              Set<DualKey> visited) {
    if (map1.size() != map2.size()) {
```

### BoundedWildcard
Can generalize to `? super DualKey`
in `assertj-core/src/main/java/org/assertj/core/internal/DeepDifference.java`
#### Snippet
```java
   */
  private static <K, V> boolean compareOrderedCollection(Collection<K> col1, Collection<V> col2,
                                                         List<String> path, Deque<DualKey> toCompare,
                                                         Set<DualKey> visited) {
    if (col1.size() != col2.size()) return false;
```

## MissortedModifiers
### MissortedModifiers
Missorted modifiers `final static`
in `assertj-core/src/main/java/org/assertj/core/internal/DeepDifference.java`
#### Snippet
```java
  private static final Map<Class<?>, Boolean> customHash = new ConcurrentHashMap<>();

  private final static class DualKey {

    private final List<String> path;
```

## IfStatementMissingBreakInLoop
### IfStatementMissingBreakInLoop
Loop can be terminated after condition is met
in `assertj-core/src/main/java/org/assertj/core/internal/Arrays.java`
#### Snippet
```java
      boolean matching = false;
      for (Class<?> expectedType : expectedTypes) {
        if (expectedType.isInstance(value)) matching = true;
      }
      if (!matching) nonMatchingElements.add(value);
```

## IgnoreResultOfCall
### IgnoreResultOfCall
Result of `ThrowableAssertAlternative.as()` is ignored
in `assertj-core/src/main/java/org/assertj/core/api/SoftThrowableAssertAlternative.java`
#### Snippet
```java
  @Override
  public SoftThrowableAssertAlternative<ACTUAL> as(Description description) {
    super.as(description);
    return this;
  }
```

### IgnoreResultOfCall
Result of `AtomicReferenceArrayAssert.usingElementComparator()` is ignored
in `assertj-core/src/main/java/org/assertj/core/api/AtomicReferenceArrayAssert.java`
#### Snippet
```java
  public <C> AtomicReferenceArrayAssert<T> usingComparatorForType(Comparator<C> comparator, Class<C> type) {
    if (arrays.getComparator() == null) {
      usingElementComparator(new ExtendedByTypesComparator(getComparatorsByType()));
    }

```

### IgnoreResultOfCall
Result of `FilterOperator.applyOn()` is ignored
in `assertj-core/src/main/java/org/assertj/core/api/AtomicReferenceArrayAssert.java`
#### Snippet
```java
    checkNotNull(filterOperator);
    Filters<? extends T> filter = filter(array).with(propertyOrFieldName);
    filterOperator.applyOn(filter);
    return new AtomicReferenceArrayAssert<>(new AtomicReferenceArray<>(toArray(filter.get())));
  }
```

### IgnoreResultOfCall
Result of `FilterOperator.applyOn()` is ignored
in `assertj-core/src/main/java/org/assertj/core/api/AbstractObjectArrayAssert.java`
#### Snippet
```java
    checkNotNull(filterOperator);
    Filters<ELEMENT> filter = filter(actual).with(propertyOrFieldName);
    filterOperator.applyOn(filter);
    return newObjectArrayAssert(filter.get());
  }
```

### IgnoreResultOfCall
Result of `AbstractObjectArrayAssert.usingElementComparator()` is ignored
in `assertj-core/src/main/java/org/assertj/core/api/AbstractObjectArrayAssert.java`
#### Snippet
```java
  public <C> SELF usingComparatorForType(Comparator<C> comparator, Class<C> type) {
    if (arrays.getComparator() == null) {
      usingElementComparator(new ExtendedByTypesComparator(getComparatorsByType()));
    }
    getComparatorsForElementPropertyOrFieldTypes().registerComparator(type, comparator);
```

### IgnoreResultOfCall
Result of `FilterOperator.applyOn()` is ignored
in `assertj-core/src/main/java/org/assertj/core/api/AbstractIterableAssert.java`
#### Snippet
```java
    checkNotNull(filterOperator);
    Filters<? extends ELEMENT> filter = filter((Iterable<? extends ELEMENT>) actual).with(propertyOrFieldName);
    filterOperator.applyOn(filter);
    return newAbstractIterableAssert(filter.get()).withAssertionState(myself);
  }
```

### IgnoreResultOfCall
Result of `AbstractIterableAssert.usingElementComparator()` is ignored
in `assertj-core/src/main/java/org/assertj/core/api/AbstractIterableAssert.java`
#### Snippet
```java
      SortedSet<ELEMENT> sortedSet = (SortedSet<ELEMENT>) actual;
      Comparator<? super ELEMENT> comparator = sortedSet.comparator();
      if (comparator != null) usingElementComparator(sortedSet.comparator());
    }
  }
```

### IgnoreResultOfCall
Result of `AbstractIterableAssert.usingElementComparator()` is ignored
in `assertj-core/src/main/java/org/assertj/core/api/AbstractIterableAssert.java`
#### Snippet
```java
  public <T> SELF usingComparatorForType(Comparator<T> comparator, Class<T> type) {
    if (iterables.getComparator() == null) {
      usingElementComparator(new ExtendedByTypesComparator(getComparatorsByType()));
    }

```

### IgnoreResultOfCall
Result of `AbstractIterableAssert.usingDefaultElementComparator()` is ignored
in `assertj-core/src/main/java/org/assertj/core/api/AbstractIterableAssert.java`
#### Snippet
```java
      // compatible with extracted values type, example with a SortedSet<Person> using a comparator on the Person's age, after
      // extracting names we get a List<String> which is mot suitable for the age comparator
      usingDefaultElementComparator();
    }
    return newListAssertInstance(values).withAssertionState(myself);
```

### IgnoreResultOfCall
Result of `ListFromStream.initList()` is ignored
in `assertj-core/src/main/java/org/assertj/core/api/ListAssert.java`
#### Snippet
```java
    @Override
    public ELEMENT get(int index) {
      initList();
      return list.get(index);
    }
```

### IgnoreResultOfCall
Result of `ListFromStream.initList()` is ignored
in `assertj-core/src/main/java/org/assertj/core/api/ListAssert.java`
#### Snippet
```java
    @Override
    public int size() {
      initList();
      return list.size();
    }
```

### IgnoreResultOfCall
Result of `ListFromStream.initList()` is ignored
in `assertj-core/src/main/java/org/assertj/core/api/ListAssert.java`
#### Snippet
```java
    @Override
    public Stream<ELEMENT> stream() {
      initList();
      return list.stream();
    }
```

### IgnoreResultOfCall
Result of `AbstractAssert.describedAs()` is ignored
in `assertj-core/src/main/java/org/assertj/core/api/ThrowableAssertAlternative.java`
#### Snippet
```java
  @CheckReturnValue
  public ThrowableAssertAlternative<ACTUAL> describedAs(Description description) {
    getDelegate().describedAs(description);
    return super.describedAs(description);
  }
```

### IgnoreResultOfCall
Result of `RecursiveComparisonAssert.withComparatorForType()` is ignored
in `assertj-core/src/main/java/org/assertj/core/api/RecursiveComparisonAssert.java`
#### Snippet
```java
  @SuppressWarnings({ "unchecked", "rawtypes" })
  private void registerComparatorForType(Entry<Class<?>, Comparator<?>> entry) {
    withComparatorForType((Comparator) entry.getValue(), entry.getKey());
  }

```

### IgnoreResultOfCall
Result of `Object.hashCode()` is ignored
in `assertj-core/src/main/java/org/assertj/core/api/Assertions.java`
#### Snippet
```java
  static {
    // just call a method to trigger loading the ConfigurationProvider and thus look for any registered Configuration
    ConfigurationProvider.class.hashCode();
  }

```

### IgnoreResultOfCall
Result of `Comparator.compare()` is ignored
in `assertj-core/src/main/java/org/assertj/core/internal/Lists.java`
#### Snippet
```java
        // Compare unique element with itself to verify that it is compatible with comparator (a ClassCastException is
        // thrown if not). We have to use a raw comparator to compare the unique element of actual ... :(
        rawComparator.compare(actual.get(0), actual.get(0));
        return;
      }
```

### IgnoreResultOfCall
Result of `Comparator.compare()` is ignored
in `assertj-core/src/main/java/org/assertj/core/internal/Arrays.java`
#### Snippet
```java
      if (arrayAsList.size() == 1) {
        // call compare to see if unique element is compatible with comparator.
        comparator.compare(arrayAsList.get(0), arrayAsList.get(0));
        return;
      }
```

## RedundantMethodOverride
### RedundantMethodOverride
Method `isEqualTo()` only delegates to its super method
in `assertj-core/src/main/java/org/assertj/core/api/Float2DArrayAssert.java`
#### Snippet
```java
   */
  @Override
  public Float2DArrayAssert isEqualTo(Object expected) {
    return super.isEqualTo(expected);
  }
```

### RedundantMethodOverride
Method `isEqualTo()` only delegates to its super method
in `assertj-core/src/main/java/org/assertj/core/api/Object2DArrayAssert.java`
#### Snippet
```java
   */
  @Override
  public Object2DArrayAssert<ELEMENT> isEqualTo(Object expected) {
    return super.isEqualTo(expected);
  }
```

### RedundantMethodOverride
Method `isEqualTo()` only delegates to its super method
in `assertj-core/src/main/java/org/assertj/core/api/Double2DArrayAssert.java`
#### Snippet
```java
   */
  @Override
  public Double2DArrayAssert isEqualTo(Object expected) {
    return super.isEqualTo(expected);
  }
```

### RedundantMethodOverride
Method `hasValue()` only delegates to its super method
in `assertj-core/src/main/java/org/assertj/core/api/AtomicLongFieldUpdaterAssert.java`
#### Snippet
```java
   */
  @Override
  public AtomicLongFieldUpdaterAssert<OBJECT> hasValue(Long expectedValue, OBJECT obj) {
    return super.hasValue(expectedValue, obj);
  }
```

### RedundantMethodOverride
Method `hasReference()` only delegates to its super method
in `assertj-core/src/main/java/org/assertj/core/api/AtomicMarkableReferenceAssert.java`
#### Snippet
```java
   */
  @Override
  public AtomicMarkableReferenceAssert<VALUE> hasReference(VALUE expectedValue) {
    return super.hasReference(expectedValue);
  }
```

### RedundantMethodOverride
Method `isEqualTo()` only delegates to its super method
in `assertj-core/src/main/java/org/assertj/core/api/Boolean2DArrayAssert.java`
#### Snippet
```java
   */
  @Override
  public Boolean2DArrayAssert isEqualTo(Object expected) {
    return super.isEqualTo(expected);
  }
```

### RedundantMethodOverride
Method `isEqualTo()` only delegates to its super method
in `assertj-core/src/main/java/org/assertj/core/api/Byte2DArrayAssert.java`
#### Snippet
```java
   */
  @Override
  public Byte2DArrayAssert isEqualTo(Object expected) {
    return super.isEqualTo(expected);
  }
```

### RedundantMethodOverride
Method `usingRecursiveAssertion()` only delegates to its super method
in `assertj-core/src/main/java/org/assertj/core/api/AbstractMapAssert.java`
#### Snippet
```java
   */
  @Override
  public RecursiveAssertionAssert usingRecursiveAssertion() {
    return super.usingRecursiveAssertion();
  }
```

### RedundantMethodOverride
Method `usingRecursiveAssertion()` only delegates to its super method
in `assertj-core/src/main/java/org/assertj/core/api/AbstractMapAssert.java`
#### Snippet
```java
   */
  @Override
  public RecursiveAssertionAssert usingRecursiveAssertion(RecursiveAssertionConfiguration recursiveAssertionConfiguration) {
    return super.usingRecursiveAssertion(recursiveAssertionConfiguration);
  }
```

### RedundantMethodOverride
Method `usingRecursiveComparison()` only delegates to its super method
in `assertj-core/src/main/java/org/assertj/core/api/AbstractMapAssert.java`
#### Snippet
```java
   */
  @Override
  public RecursiveComparisonAssert<?> usingRecursiveComparison(RecursiveComparisonConfiguration recursiveComparisonConfiguration) {
    // overridden for javadoc and to make this method public
    return super.usingRecursiveComparison(recursiveComparisonConfiguration);
```

### RedundantMethodOverride
Method `isEqualTo()` only delegates to its super method
in `assertj-core/src/main/java/org/assertj/core/api/Short2DArrayAssert.java`
#### Snippet
```java
   */
  @Override
  public Short2DArrayAssert isEqualTo(Object expected) {
    return super.isEqualTo(expected);
  }
```

### RedundantMethodOverride
Method `apply()` is identical to its super method
in `assertj-core/src/main/java/org/assertj/core/api/Java6JUnitSoftAssertions.java`
#### Snippet
```java

  @Override
  public Statement apply(final Statement base, Description description) {
    return softAssertionsStatement(this, base);
  }
```

### RedundantMethodOverride
Method `isEqualTo()` only delegates to its super method
in `assertj-core/src/main/java/org/assertj/core/api/Char2DArrayAssert.java`
#### Snippet
```java
   */
  @Override
  public Char2DArrayAssert isEqualTo(Object expected) {
    return super.isEqualTo(expected);
  }
```

### RedundantMethodOverride
Method `isEqualTo()` only delegates to its super method
in `assertj-core/src/main/java/org/assertj/core/api/Long2DArrayAssert.java`
#### Snippet
```java
   */
  @Override
  public Long2DArrayAssert isEqualTo(Object expected) {
    return super.isEqualTo(expected);
  }
```

### RedundantMethodOverride
Method `hasValue()` only delegates to its super method
in `assertj-core/src/main/java/org/assertj/core/api/AtomicIntegerFieldUpdaterAssert.java`
#### Snippet
```java
   */
  @Override
  public AtomicIntegerFieldUpdaterAssert<OBJECT> hasValue(Integer expectedValue, OBJECT obj) {
    return super.hasValue(expectedValue, obj);
  }
```

### RedundantMethodOverride
Method `hasValue()` only delegates to its super method
in `assertj-core/src/main/java/org/assertj/core/api/AtomicReferenceFieldUpdaterAssert.java`
#### Snippet
```java
   */
  @Override
  public AtomicReferenceFieldUpdaterAssert<FIELD, OBJECT> hasValue(FIELD expectedValue, OBJECT obj) {
    return super.hasValue(expectedValue, obj);
  }
```

### RedundantMethodOverride
Method `hasReference()` only delegates to its super method
in `assertj-core/src/main/java/org/assertj/core/api/AtomicStampedReferenceAssert.java`
#### Snippet
```java
   */
  @Override
  public AtomicStampedReferenceAssert<VALUE> hasReference(VALUE expectedValue) {
    return super.hasReference(expectedValue);
  }
```

### RedundantMethodOverride
Method `isEqualTo()` only delegates to its super method
in `assertj-core/src/main/java/org/assertj/core/api/Int2DArrayAssert.java`
#### Snippet
```java
   */
  @Override
  public Int2DArrayAssert isEqualTo(Object expected) {
    return super.isEqualTo(expected);
  }
```

### RedundantMethodOverride
Method `ignoreFieldsOfTypes()` only delegates to its super method
in `assertj-core/src/main/java/org/assertj/core/api/recursive/assertion/RecursiveAssertionConfiguration.java`
#### Snippet
```java
   */
  @Override
  public void ignoreFieldsOfTypes(Class<?>... types) {
    super.ignoreFieldsOfTypes(types);
  }
```

### RedundantMethodOverride
Method `withIgnoredFieldsMatchingRegexes()` only delegates to its super method
in `assertj-core/src/main/java/org/assertj/core/api/recursive/assertion/RecursiveAssertionConfiguration.java`
#### Snippet
```java
     */
    @Override
    public Builder withIgnoredFieldsMatchingRegexes(String... regexes) {
      return super.withIgnoredFieldsMatchingRegexes(regexes);
    }
```

### RedundantMethodOverride
Method `withIgnoredFields()` only delegates to its super method
in `assertj-core/src/main/java/org/assertj/core/api/recursive/assertion/RecursiveAssertionConfiguration.java`
#### Snippet
```java
     */
    @Override
    public Builder withIgnoredFields(String... fieldsToIgnore) {
      return super.withIgnoredFields(fieldsToIgnore);
    }
```

### RedundantMethodOverride
Method `ignoreFieldsMatchingRegexes()` only delegates to its super method
in `assertj-core/src/main/java/org/assertj/core/api/recursive/assertion/RecursiveAssertionConfiguration.java`
#### Snippet
```java
   */
  @Override
  public void ignoreFieldsMatchingRegexes(String... regexes) {
    super.ignoreFieldsMatchingRegexes(regexes);
  }
```

### RedundantMethodOverride
Method `withIgnoredFieldsOfTypes()` only delegates to its super method
in `assertj-core/src/main/java/org/assertj/core/api/recursive/assertion/RecursiveAssertionConfiguration.java`
#### Snippet
```java
     */
    @Override
    public Builder withIgnoredFieldsOfTypes(Class<?>... types) {
      return super.withIgnoredFieldsOfTypes(types);
    }
```

### RedundantMethodOverride
Method `ignoreFields()` only delegates to its super method
in `assertj-core/src/main/java/org/assertj/core/api/recursive/assertion/RecursiveAssertionConfiguration.java`
#### Snippet
```java
   */
  @Override
  public void ignoreFields(String... fieldsToIgnore) {
    super.ignoreFields(fieldsToIgnore);
  }
```

### RedundantMethodOverride
Method `withIgnoredFieldsOfTypes()` only delegates to its super method
in `assertj-core/src/main/java/org/assertj/core/api/recursive/comparison/RecursiveComparisonConfiguration.java`
#### Snippet
```java

    @Override
    public Builder withIgnoredFieldsOfTypes(Class<?>... types) {
      return super.withIgnoredFieldsOfTypes(types);
    }
```

### RedundantMethodOverride
Method `withIgnoredFieldsMatchingRegexes()` only delegates to its super method
in `assertj-core/src/main/java/org/assertj/core/api/recursive/comparison/RecursiveComparisonConfiguration.java`
#### Snippet
```java

    @Override
    public Builder withIgnoredFieldsMatchingRegexes(String... regexes) {
      return super.withIgnoredFieldsMatchingRegexes(regexes);
    }
```

### RedundantMethodOverride
Method `withIgnoredFields()` only delegates to its super method
in `assertj-core/src/main/java/org/assertj/core/api/recursive/comparison/RecursiveComparisonConfiguration.java`
#### Snippet
```java

    @Override
    public Builder withIgnoredFields(String... fieldsToIgnore) {
      return super.withIgnoredFields(fieldsToIgnore);
    }
```

### RedundantMethodOverride
Method `duplicatesFrom()` only delegates to its super method
in `assertj-core/src/main/java/org/assertj/core/internal/ComparatorBasedComparisonStrategy.java`
#### Snippet
```java
  // overridden to write javadoc.
  @Override
  public Iterable<?> duplicatesFrom(Iterable<?> iterable) {
    return super.duplicatesFrom(iterable);
  }
```

### RedundantMethodOverride
Method `isStandard()` is identical to its super method
in `assertj-core/src/main/java/org/assertj/core/internal/ComparatorBasedComparisonStrategy.java`
#### Snippet
```java

  @Override
  public boolean isStandard() {
    return false;
  }
```

### RedundantMethodOverride
Method `duplicatesFrom()` only delegates to its super method
in `assertj-core/src/main/java/org/assertj/core/internal/StandardComparisonStrategy.java`
#### Snippet
```java
  // overridden to write javadoc.
  @Override
  public Iterable<?> duplicatesFrom(Iterable<?> iterable) {
    return super.duplicatesFrom(iterable);
  }
```

## SimplifyOptionalCallChains
### SimplifyOptionalCallChains
Optional chain can be simplified
in `assertj-core/src/main/java/org/assertj/core/configuration/PreferredAssumptionException.java`
#### Snippet
```java
      return Stream.of(TEST_NG, JUNIT4, JUNIT5)
                   .map(PreferredAssumptionException::loadAssumptionExceptionClass)
                   .flatMap(optional -> optional.map(Stream::of).orElse(Stream.empty()))
                   .findFirst()
                   .orElseThrow(() -> new IllegalStateException("Assumptions require TestNG, JUnit 4 or opentest4j on the classpath"));
```

## UnnecessarySuperQualifier
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `assertj-core/src/main/java/org/assertj/core/api/AbstractObjectAssert.java`
#### Snippet
```java
  public <T, ASSERT extends AbstractAssert<?, ?>> ASSERT extracting(Function<? super ACTUAL, T> extractor,
                                                                    InstanceOfAssertFactory<?, ASSERT> assertFactory) {
    return super.extracting(extractor, this::newObjectAssert).asInstanceOf(assertFactory);
  }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `assertj-core/src/main/java/org/assertj/core/api/AbstractObjectAssert.java`
#### Snippet
```java
  @CheckReturnValue
  public <T> AbstractObjectAssert<?, T> extracting(Function<? super ACTUAL, T> extractor) {
    return super.extracting(extractor, this::newObjectAssert);
  }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `assertj-core/src/main/java/org/assertj/core/api/AbstractObjectAssert.java`
#### Snippet
```java
  @CheckReturnValue
  public AbstractObjectAssert<?, ?> extracting(String propertyOrField) {
    return super.extracting(propertyOrField, this::newObjectAssert);
  }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `assertj-core/src/main/java/org/assertj/core/api/AbstractObjectAssert.java`
#### Snippet
```java
  public <ASSERT extends AbstractAssert<?, ?>> ASSERT extracting(String propertyOrField,
                                                                 InstanceOfAssertFactory<?, ASSERT> assertFactory) {
    return super.extracting(propertyOrField, this::newObjectAssert).asInstanceOf(assertFactory);
  }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `assertj-core/src/main/java/org/assertj/core/api/AbstractSoftAssertions.java`
#### Snippet
```java
   */
  public List<Throwable> errorsCollected() {
    return decorateErrorsCollected(super.assertionErrorsCollected());
  }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `assertj-core/src/main/java/org/assertj/core/api/recursive/comparison/FieldMessages.java`
#### Snippet
```java
   */
  public boolean hasMessageForField(String fieldLocation) {
    return super.hasEntity(fieldLocation);
  }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `assertj-core/src/main/java/org/assertj/core/api/recursive/comparison/FieldMessages.java`
#### Snippet
```java
   */
  public Stream<Entry<String, String>> messageByFields() {
    return super.entryByField();
  }
}
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `assertj-core/src/main/java/org/assertj/core/api/recursive/comparison/FieldMessages.java`
#### Snippet
```java
   */
  public String getMessageForField(String fieldLocation) {
    return super.get(fieldLocation);
  }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `assertj-core/src/main/java/org/assertj/core/api/recursive/comparison/FieldMessages.java`
#### Snippet
```java
   */
  public void registerMessage(String fieldLocation, String message) {
    super.put(fieldLocation, message);
  }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `assertj-core/src/main/java/org/assertj/core/api/recursive/comparison/FieldComparators.java`
#### Snippet
```java
   */
  public Stream<Entry<String, Comparator<?>>> comparatorByFields() {
    return super.entryByField();
  }
}
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `assertj-core/src/main/java/org/assertj/core/api/recursive/comparison/FieldComparators.java`
#### Snippet
```java
  public boolean hasComparatorForField(String fieldLocation) {
    // TODO sanitize here?
    return super.hasEntity(fieldLocation);
  }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `assertj-core/src/main/java/org/assertj/core/api/recursive/comparison/FieldComparators.java`
#### Snippet
```java
   */
  public void registerComparator(String fieldLocation, Comparator<?> comparator) {
    super.put(fieldLocation, comparator);
  }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `assertj-core/src/main/java/org/assertj/core/api/recursive/comparison/FieldComparators.java`
#### Snippet
```java
   */
  public Comparator<?> getComparatorForField(String fieldLocation) {
    return super.get(fieldLocation);
  }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `assertj-core/src/main/java/org/assertj/core/internal/TypeComparators.java`
#### Snippet
```java
   */
  public boolean hasComparatorForType(Class<?> type) {
    return super.hasEntity(type);
  }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `assertj-core/src/main/java/org/assertj/core/internal/TypeComparators.java`
#### Snippet
```java
   */
  public Comparator<?> getComparatorForType(Class<?> clazz) {
    return super.get(clazz);
  }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `assertj-core/src/main/java/org/assertj/core/internal/TypeComparators.java`
#### Snippet
```java
   */
  public <T> void registerComparator(Class<T> clazz, Comparator<? super T> comparator) {
    super.put(clazz, comparator);
  }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `assertj-core/src/main/java/org/assertj/core/internal/TypeComparators.java`
#### Snippet
```java
   */
  public Stream<Entry<Class<?>, Comparator<?>>> comparatorByTypes() {
    return super.entityByTypes();
  }
}
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `assertj-core/src/main/java/org/assertj/core/internal/TypeMessages.java`
#### Snippet
```java
   */
  public <T> void registerMessage(Class<T> clazz, String message) {
    super.put(clazz, message);
  }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `assertj-core/src/main/java/org/assertj/core/internal/TypeMessages.java`
#### Snippet
```java
   */
  public Stream<Map.Entry<Class<?>, String>> messageByTypes() {
    return super.entityByTypes();
  }
}
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `assertj-core/src/main/java/org/assertj/core/internal/TypeMessages.java`
#### Snippet
```java
   */
  public String getMessageForType(Class<?> clazz) {
    return super.get(clazz);
  }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `assertj-core/src/main/java/org/assertj/core/internal/TypeMessages.java`
#### Snippet
```java
   */
  public boolean hasMessageForType(Class<?> type) {
    return super.hasEntity(type);
  }

```

## NestedAssignment
### NestedAssignment
Result of assignment expression used
in `assertj-core/src/main/java/org/assertj/core/api/AbstractInputStreamAssert.java`
#### Snippet
```java
      int read;
      byte[] data = new byte[1024];
      while ((read = actual.read(data, 0, data.length)) != -1) {
        buffer.write(data, 0, read);
      }
```

### NestedAssignment
Result of assignment expression used
in `assertj-core/src/main/java/org/assertj/core/util/Throwables.java`
#### Snippet
```java
    if (throwable.getCause() == null) return null;
    Throwable cause;
    while ((cause = throwable.getCause()) != null)
      throwable = cause;
    return throwable;
```

### NestedAssignment
Result of assignment expression used
in `assertj-core/src/main/java/org/assertj/core/util/URLs.java`
#### Snippet
```java
        BufferedReader reader = new BufferedReader(new InputStreamReader(stream, charset))) {
      int c;
      while ((c = reader.read()) != -1) {
        writer.write(c);
      }
```

### NestedAssignment
Result of assignment expression used
in `assertj-core/src/main/java/org/assertj/core/internal/Diff.java`
#### Snippet
```java
    String line;
    List<String> lines = new ArrayList<>();
    while ((line = reader.readLine()) != null) {
      lines.add(line);
    }
```

### NestedAssignment
Result of assignment expression used
in `assertj-core/src/main/java/org/assertj/core/internal/Digests.java`
#### Snippet
```java
    byte[] buffer = new byte[BUFFER_SIZE];
    int len;
    while ((len = stream.read(buffer)) > 0) {
      messageDigest.update(buffer, 0, len);
    }
```

## CodeBlock2Expr
### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `assertj-core/src/main/java/org/assertj/core/api/recursive/assertion/RecursiveAssertionDriver.java`
#### Snippet
```java

  private void evaluateFieldsOfCurrentNodeRecursively(Predicate<Object> predicate, Object node, FieldLocation fieldLocation) {
    configuration.getIntrospectionStrategy().getChildNodesOf(node).forEach(field -> {
      assertRecursively(predicate, field.value, field.type, fieldLocation.field(field.name));
    });
```

## EmptyMethod
### EmptyMethod
Method only calls its super
in `assertj-core/src/main/java/org/assertj/core/api/AbstractIterableAssert.java`
#### Snippet
```java

  @Override
  public SELF isNotNull() {
    return super.isNotNull();
  }
```

### EmptyMethod
Method only calls its super
in `assertj-core/src/main/java/org/assertj/core/api/AbstractIterableAssert.java`
#### Snippet
```java
  @Override
  @CheckReturnValue
  public SELF usingDefaultComparator() {
    return super.usingDefaultComparator();
  }
```

### EmptyMethod
Method only calls its super
in `assertj-core/src/main/java/org/assertj/core/api/AbstractIterableAssert.java`
#### Snippet
```java
  @Override
  @CheckReturnValue
  public SELF withThreadDumpOnError() {
    return super.withThreadDumpOnError();
  }
```

### EmptyMethod
Method only calls its super
in `assertj-core/src/main/java/org/assertj/core/api/AbstractMapAssert.java`
#### Snippet
```java

  @Override
  public SELF isNotNull() {
    return super.isNotNull();
  }
```

### EmptyMethod
Method only calls its super
in `assertj-core/src/main/java/org/assertj/core/api/AbstractMapAssert.java`
#### Snippet
```java
  @Override
  @CheckReturnValue
  public SELF usingDefaultComparator() {
    return super.usingDefaultComparator();
  }
```

### EmptyMethod
Method only calls its super
in `assertj-core/src/main/java/org/assertj/core/api/AbstractMapAssert.java`
#### Snippet
```java
  @Override
  @CheckReturnValue
  public SELF withThreadDumpOnError() {
    return super.withThreadDumpOnError();
  }
```

### EmptyMethod
Method only calls its super
in `assertj-core/src/main/java/org/assertj/core/api/AbstractMapAssert.java`
#### Snippet
```java
  @Override
  @Beta
  public RecursiveComparisonAssert<?> usingRecursiveComparison() {
    // overridden for javadoc and to make this method public
    return super.usingRecursiveComparison();
```

### EmptyMethod
Method only calls its super
in `assertj-core/src/main/java/org/assertj/core/api/AbstractMapAssert.java`
#### Snippet
```java
   */
  @Override
  public RecursiveAssertionAssert usingRecursiveAssertion() {
    return super.usingRecursiveAssertion();
  }
```

### EmptyMethod
The method is empty
in `assertj-core/src/main/java/org/assertj/core/configuration/ConfigurationProvider.java`
#### Snippet
```java
   * This method should be called before any user configuration changes to make sure these are not overridden by a registered {@link Configuration} later on.
   */
  public static void loadRegisteredConfiguration() {
    // does nothing but results in loading any registered Configuration as CONFIGURATION_PROVIDER is initialized
  }
```

## RedundantFieldInitialization
### RedundantFieldInitialization
Field initialization to `null` is redundant
in `assertj-core/src/main/java/org/assertj/core/api/DefaultAssertionErrorCollector.java`
#### Snippet
```java
  private AfterAssertionErrorCollected callback = this;

  private AssertionErrorCollector delegate = null;

  public DefaultAssertionErrorCollector() {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `assertj-core/src/main/java/org/assertj/core/api/AbstractAssert.java`
#### Snippet
```java
  @VisibleForTesting
  // = ConfigurationProvider.CONFIGURATION_PROVIDER.representation(); ?
  static Representation customRepresentation = null;

  @VisibleForTesting
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `assertj-core/src/main/java/org/assertj/core/api/recursive/assertion/RecursiveAssertionConfiguration.java`
#### Snippet
```java
   */
  public static class Builder extends AbstractBuilder<Builder> {
    private boolean ignorePrimitiveFields = false;
    private boolean skipJavaLibraryTypeObjects = true;
    private CollectionAssertionPolicy collectionAssertionPolicy = ELEMENTS_ONLY;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `assertj-core/src/main/java/org/assertj/core/api/recursive/comparison/RecursiveComparisonConfiguration.java`
#### Snippet
```java
  private boolean ignoreAllActualNullFields = false;
  private boolean ignoreAllActualEmptyOptionalFields = false;
  private boolean ignoreAllExpectedNullFields = false;

  // fields to compare (no other field will be)
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `assertj-core/src/main/java/org/assertj/core/api/recursive/comparison/RecursiveComparisonConfiguration.java`
#### Snippet
```java

  // fields to ignore section
  private boolean ignoreAllActualNullFields = false;
  private boolean ignoreAllActualEmptyOptionalFields = false;
  private boolean ignoreAllExpectedNullFields = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `assertj-core/src/main/java/org/assertj/core/api/recursive/comparison/RecursiveComparisonConfiguration.java`
#### Snippet
```java
  // fields to ignore section
  private boolean ignoreAllActualNullFields = false;
  private boolean ignoreAllActualEmptyOptionalFields = false;
  private boolean ignoreAllExpectedNullFields = false;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `assertj-core/src/main/java/org/assertj/core/api/recursive/comparison/RecursiveComparisonConfiguration.java`
#### Snippet
```java
  private static final boolean DEFAULT_IGNORE_ALL_OVERRIDDEN_EQUALS = true;
  public static final String INDENT_LEVEL_2 = "  -";
  private boolean strictTypeChecking = false;

  // fields to ignore section
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `assertj-core/src/main/java/org/assertj/core/api/recursive/comparison/RecursiveComparisonConfiguration.java`
#### Snippet
```java

  // ignore order in collections section
  private boolean ignoreCollectionOrder = false;
  private Set<String> ignoredCollectionOrderInFields = new LinkedHashSet<>();
  private final List<Pattern> ignoredCollectionOrderInFieldsMatchingRegexes = new ArrayList<>();
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `assertj-core/src/main/java/org/assertj/core/util/introspection/Introspection.java`
#### Snippet
```java

  // set false by default to follow the principle of least surprise as usual property getter are getX() isX(), not x().
  private static boolean bareNamePropertyMethods = false;

  /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `assertj-core/src/main/java/org/assertj/core/internal/Failures.java`
#### Snippet
```java
   * flag indicating that in case of a failure a threaddump is printed out.
   */
  private boolean printThreadDump = false;

  /**
```

## ExceptionNameDoesntEndWithException
### ExceptionNameDoesntEndWithException
Exception class name `IntrospectionError` does not end with 'Exception'
in `assertj-core/src/main/java/org/assertj/core/util/introspection/IntrospectionError.java`
#### Snippet
```java
 * @author Alex Ruiz
 */
public class IntrospectionError extends RuntimeException {

  private static final long serialVersionUID = 1L;
```

## ArrayEquality
### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `assertj-core/src/main/java/org/assertj/core/api/Float2DArrayAssert.java`
#### Snippet
```java
  @Override
  public Float2DArrayAssert isDeepEqualTo(float[][] expected) {
    if (actual == expected) return myself;
    isNotNull();
    if (expected.length != actual.length) {
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `assertj-core/src/main/java/org/assertj/core/api/Float2DArrayAssert.java`
#### Snippet
```java
      float[] expectedSubArray = expected[i];

      if (actualSubArray == expectedSubArray) continue;
      if (actualSubArray == null) throw failures.failure(info, shouldNotBeNull("actual[" + i + "]"));
      if (expectedSubArray.length != actualSubArray.length) {
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `assertj-core/src/main/java/org/assertj/core/api/Object2DArrayAssert.java`
#### Snippet
```java
  @Override
  public Object2DArrayAssert<ELEMENT> isDeepEqualTo(ELEMENT[][] expected) {
    if (actual == expected) return myself;
    isNotNull();
    if (expected.length != actual.length) {
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `assertj-core/src/main/java/org/assertj/core/api/Object2DArrayAssert.java`
#### Snippet
```java
      ELEMENT[] expectedSubArray = expected[i];

      if (actualSubArray == expectedSubArray) continue;
      if (actualSubArray == null) throw failures.failure(info, shouldNotBeNull("actual[" + i + "]"));
      if (expectedSubArray.length != actualSubArray.length) {
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `assertj-core/src/main/java/org/assertj/core/api/Double2DArrayAssert.java`
#### Snippet
```java
  @Override
  public Double2DArrayAssert isDeepEqualTo(double[][] expected) {
    if (actual == expected) return myself;
    isNotNull();
    if (expected.length != actual.length) {
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `assertj-core/src/main/java/org/assertj/core/api/Double2DArrayAssert.java`
#### Snippet
```java
      double[] expectedSubArray = expected[i];

      if (actualSubArray == expectedSubArray) continue;
      if (actualSubArray == null) throw failures.failure(info, shouldNotBeNull("actual[" + i + "]"));
      if (expectedSubArray.length != actualSubArray.length) {
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `assertj-core/src/main/java/org/assertj/core/api/Boolean2DArrayAssert.java`
#### Snippet
```java
  public Boolean2DArrayAssert isDeepEqualTo(boolean[][] expected) {
    // boolean[][] actual = new boolean[][] { { true, false }, { false, true } };
    if (actual == expected) return myself;
    isNotNull();
    if (expected.length != actual.length) {
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `assertj-core/src/main/java/org/assertj/core/api/Boolean2DArrayAssert.java`
#### Snippet
```java
      boolean[] expectedSubArray = expected[i];

      if (actualSubArray == expectedSubArray) continue;
      if (actualSubArray == null) throw failures.failure(info, shouldNotBeNull("actual[" + i + "]"));
      if (expectedSubArray.length != actualSubArray.length) {
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `assertj-core/src/main/java/org/assertj/core/api/Byte2DArrayAssert.java`
#### Snippet
```java
  @Override
  public Byte2DArrayAssert isDeepEqualTo(byte[][] expected) {
    if (actual == expected) return myself;
    isNotNull();
    if (expected.length != actual.length) {
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `assertj-core/src/main/java/org/assertj/core/api/Byte2DArrayAssert.java`
#### Snippet
```java
      byte[] expectedSubArray = expected[i];

      if (actualSubArray == expectedSubArray) continue;
      if (actualSubArray == null) throw failures.failure(info, shouldNotBeNull("actual[" + i + "]"));
      if (expectedSubArray.length != actualSubArray.length) {
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `assertj-core/src/main/java/org/assertj/core/api/Short2DArrayAssert.java`
#### Snippet
```java
  @Override
  public Short2DArrayAssert isDeepEqualTo(short[][] expected) {
    if (actual == expected) return myself;
    isNotNull();
    if (expected.length != actual.length) {
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `assertj-core/src/main/java/org/assertj/core/api/Short2DArrayAssert.java`
#### Snippet
```java
      short[] expectedSubArray = expected[i];

      if (actualSubArray == expectedSubArray) continue;
      if (actualSubArray == null) throw failures.failure(info, shouldNotBeNull("actual[" + i + "]"));
      if (expectedSubArray.length != actualSubArray.length) {
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `assertj-core/src/main/java/org/assertj/core/api/Char2DArrayAssert.java`
#### Snippet
```java
  @Override
  public Char2DArrayAssert isDeepEqualTo(char[][] expected) {
    if (actual == expected) return myself;
    isNotNull();
    if (expected.length != actual.length) {
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `assertj-core/src/main/java/org/assertj/core/api/Char2DArrayAssert.java`
#### Snippet
```java
      char[] expectedSubArray = expected[i];

      if (actualSubArray == expectedSubArray) continue;
      if (actualSubArray == null) throw failures.failure(info, shouldNotBeNull("actual[" + i + "]"));
      if (expectedSubArray.length != actualSubArray.length) {
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `assertj-core/src/main/java/org/assertj/core/api/Long2DArrayAssert.java`
#### Snippet
```java
  @Override
  public Long2DArrayAssert isDeepEqualTo(long[][] expected) {
    if (actual == expected) return myself;
    isNotNull();
    if (expected.length != actual.length) {
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `assertj-core/src/main/java/org/assertj/core/api/Long2DArrayAssert.java`
#### Snippet
```java
      long[] expectedSubArray = expected[i];

      if (actualSubArray == expectedSubArray) continue;
      if (actualSubArray == null) throw failures.failure(info, shouldNotBeNull("actual[" + i + "]"));
      if (expectedSubArray.length != actualSubArray.length) {
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `assertj-core/src/main/java/org/assertj/core/api/Int2DArrayAssert.java`
#### Snippet
```java
  @Override
  public Int2DArrayAssert isDeepEqualTo(int[][] expected) {
    if (actual == expected) return myself;
    isNotNull();
    if (expected.length != actual.length) {
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `assertj-core/src/main/java/org/assertj/core/api/Int2DArrayAssert.java`
#### Snippet
```java
      int[] expectedSubArray = expected[i];

      if (actualSubArray == expectedSubArray) continue;
      if (actualSubArray == null) throw failures.failure(info, shouldNotBeNull("actual[" + i + "]"));
      if (expectedSubArray.length != actualSubArray.length) {
```

## RedundantStringFormatCall
### RedundantStringFormatCall
Redundant call to `format()`
in `assertj-core/src/main/java/org/assertj/core/configuration/Services.java`
#### Snippet
```java
    if (services.hasNext()) {
      result = defaultValue;
      System.err.println(format("Found multiple implementations for the service provider %s. Using the default: %s",
                                serviceType, result.getClass()));
    }
```

### RedundantStringFormatCall
Redundant call to `format()`
in `assertj-core/src/main/java/org/assertj/core/configuration/ConfigurationProvider.java`
#### Snippet
```java
      // registered representations are only used if the configuration representation
      if (representations.size() == 1) {
        System.out.println(format("AssertJ has found one registered representation: %s, AssertJ will use it first and then fall back to standard representation if it returned a null representation of the value to display.",
                                  representations.get(0)));
      } else if (representations.size() > 1) {
```

### RedundantStringFormatCall
Redundant call to `format()`
in `assertj-core/src/main/java/org/assertj/core/configuration/ConfigurationProvider.java`
#### Snippet
```java
                                  representations.get(0)));
      } else if (representations.size() > 1) {
        System.out.println(format("AssertJ has found %s registered representations, AssertJ will use them first and then fall back to standard representation if they returned a null representation of the value to display, the order (by highest priority first) of use will be: %s",
                                  representations.size(), compositeRepresentation.getAllRepresentationsOrderedByPriority()));
      }
```

### RedundantStringFormatCall
Redundant call to `format()`
in `assertj-core/src/main/java/org/assertj/core/configuration/ConfigurationProvider.java`
#### Snippet
```java
      }
    } else if (!representations.isEmpty()) {
      System.out.println(format("AssertJ has found these representations %s in the classpath but they won't be used as the loaded configuration has specified a custom representation which takes precedence over representations loaded with the java ServiceLoader: %s",
                                representations, representation()));
    }
```

## NonExceptionNameEndsWithException
### NonExceptionNameEndsWithException
Non-exception class name `ShouldHaveSuppressedException` ends with 'Exception'
in `assertj-core/src/main/java/org/assertj/core/error/ShouldHaveSuppressedException.java`
#### Snippet
```java
 * Creates an error message indicating that an assertion that verifies that a {@link Throwable} has a given suppressed exception failed.
 */
public class ShouldHaveSuppressedException extends BasicErrorMessageFactory {

  /**
```

### NonExceptionNameEndsWithException
Non-exception class name `PreferredAssumptionException` ends with 'Exception'
in `assertj-core/src/main/java/org/assertj/core/configuration/PreferredAssumptionException.java`
#### Snippet
```java
import java.util.stream.Stream;

public enum PreferredAssumptionException {

  /**
```

## TypeParameterExtendsObject
### TypeParameterExtendsObject
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `assertj-core/src/main/java/org/assertj/core/api/AbstractObjectArrayAssert.java`
#### Snippet
```java
   */
  @CheckReturnValue
  public AbstractListAssert<?, List<? extends Object>, Object, ObjectAssert<Object>> extractingResultOf(String method) {
    Object[] values = FieldsOrPropertiesExtractor.extract(actual, resultOf(method));
    String extractedDescription = extractedDescriptionOfMethod(method);
```

### TypeParameterExtendsObject
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `assertj-core/src/main/java/org/assertj/core/api/AbstractObjectArrayAssert.java`
#### Snippet
```java
   */
  @CheckReturnValue
  public AbstractListAssert<?, List<? extends Object>, Object, ObjectAssert<Object>> flatExtracting(String propertyName) {
    List<Object> extractedValues = newArrayList();
    List<?> extractedGroups = FieldsOrPropertiesExtractor.extract(Arrays.asList(actual), byName(propertyName));
```

### TypeParameterExtendsObject
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `assertj-core/src/main/java/org/assertj/core/api/AbstractObjectArrayAssert.java`
#### Snippet
```java
   */
  @CheckReturnValue
  public AbstractListAssert<?, List<? extends Object>, Object, ObjectAssert<Object>> extracting(String fieldOrProperty) {
    Object[] values = FieldsOrPropertiesExtractor.extract(actual, byName(fieldOrProperty));
    String extractedDescription = extractedDescriptionOf(fieldOrProperty);
```

### TypeParameterExtendsObject
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `assertj-core/src/main/java/org/assertj/core/api/AbstractIterableAssert.java`
#### Snippet
```java
  @CheckReturnValue
  @SafeVarargs
  public final <EXCEPTION extends Exception> AbstractListAssert<?, List<? extends Object>, Object, ObjectAssert<Object>> flatMap(ThrowingExtractor<? super ELEMENT, ?, EXCEPTION>... mappers) {
    return flatExtractingForProxy(mappers);
  }
```

### TypeParameterExtendsObject
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `assertj-core/src/main/java/org/assertj/core/api/AbstractIterableAssert.java`
#### Snippet
```java
   */
  @CheckReturnValue
  public AbstractListAssert<?, List<? extends Object>, Object, ObjectAssert<Object>> extracting(String propertyOrField) {
    List<Object> values = FieldsOrPropertiesExtractor.extract(actual, byName(propertyOrField));
    String extractedDescription = extractedDescriptionOf(propertyOrField);
```

### TypeParameterExtendsObject
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `assertj-core/src/main/java/org/assertj/core/api/AbstractIterableAssert.java`
#### Snippet
```java
   */
  @CheckReturnValue
  public AbstractListAssert<?, List<? extends Object>, Object, ObjectAssert<Object>> flatExtracting(String fieldOrPropertyName) {
    List<Object> extractedValues = newArrayList();
    List<?> extractedGroups = FieldsOrPropertiesExtractor.extract(actual, byName(fieldOrPropertyName));
```

### TypeParameterExtendsObject
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `assertj-core/src/main/java/org/assertj/core/api/AbstractIterableAssert.java`
#### Snippet
```java
  @CheckReturnValue
  @SafeVarargs
  public final <EXCEPTION extends Exception> AbstractListAssert<?, List<? extends Object>, Object, ObjectAssert<Object>> flatExtracting(ThrowingExtractor<? super ELEMENT, ?, EXCEPTION>... extractors) {
    return flatExtractingForProxy(extractors);
  }
```

### TypeParameterExtendsObject
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `assertj-core/src/main/java/org/assertj/core/api/AbstractIterableAssert.java`
#### Snippet
```java
  // The public method for it (the one not ending with "ForProxy") is marked as final and annotated with @SafeVarargs
  // in order to avoid compiler warning in user code
  protected AbstractListAssert<?, List<? extends Object>, Object, ObjectAssert<Object>> flatExtractingForProxy(Function<? super ELEMENT, ?>[] extractors) {
    if (actual == null) throwAssertionError(shouldNotBeNull());
    Stream<? extends ELEMENT> actualStream = stream(actual.spliterator(), false);
```

### TypeParameterExtendsObject
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `assertj-core/src/main/java/org/assertj/core/api/AbstractIterableAssert.java`
#### Snippet
```java
   */
  @CheckReturnValue
  public AbstractListAssert<?, List<? extends Object>, Object, ObjectAssert<Object>> flatExtracting(String... fieldOrPropertyNames) {
    List<Object> extractedValues = FieldsOrPropertiesExtractor.extract(actual, byName(fieldOrPropertyNames)).stream()
                                                              .flatMap(tuple -> tuple.toList().stream())
```

### TypeParameterExtendsObject
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `assertj-core/src/main/java/org/assertj/core/api/AbstractIterableAssert.java`
#### Snippet
```java
   */
  @CheckReturnValue
  public AbstractListAssert<?, List<? extends Object>, Object, ObjectAssert<Object>> extractingResultOf(String method) {
    // can't refactor by calling extractingResultOf(method, Object.class) as SoftAssertion would fail
    List<Object> values = FieldsOrPropertiesExtractor.extract(actual, resultOf(method));
```

### TypeParameterExtendsObject
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `assertj-core/src/main/java/org/assertj/core/api/AbstractIterableAssert.java`
#### Snippet
```java
  @CheckReturnValue
  @SafeVarargs
  public final AbstractListAssert<?, List<? extends Object>, Object, ObjectAssert<Object>> flatExtracting(Function<? super ELEMENT, ?>... extractors) {
    return flatExtractingForProxy(extractors);
  }
```

### TypeParameterExtendsObject
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `assertj-core/src/main/java/org/assertj/core/api/AbstractIterableAssert.java`
#### Snippet
```java
  @CheckReturnValue
  @SafeVarargs
  public final AbstractListAssert<?, List<? extends Object>, Object, ObjectAssert<Object>> flatMap(Function<? super ELEMENT, ?>... mappers) {
    return flatExtractingForProxy(mappers);
  }
```

## OptionalGetWithoutIsPresent
### OptionalGetWithoutIsPresent
`OptionalInt.getAsInt()` without 'isPresent()' check
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOptionalIntAssert.java`
#### Snippet
```java
    isNotNull();
    if (!actual.isPresent()) throwAssertionError(shouldContain(expectedValue));
    if (expectedValue != actual.getAsInt())
      throw Failures.instance().failure(info, shouldContain(actual, expectedValue), actual.getAsInt(), expectedValue);
    return myself;
```

### OptionalGetWithoutIsPresent
`OptionalLong.getAsLong()` without 'isPresent()' check
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOptionalLongAssert.java`
#### Snippet
```java
    isNotNull();
    if (!actual.isPresent()) throwAssertionError(shouldContain(expectedValue));
    if (expectedValue != actual.getAsLong())
      throw Failures.instance().failure(info, shouldContain(actual, expectedValue), actual.getAsLong(), expectedValue);
    return myself;
```

### OptionalGetWithoutIsPresent
`OptionalDouble.getAsDouble()` without 'isPresent()' check
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOptionalDoubleAssert.java`
#### Snippet
```java
    // Reuses doubles functionality, catches potential assertion error and throw correct one
    try {
      doubles.assertIsCloseTo(info, actual.getAsDouble(), expectedValue, offset);
    } catch (AssertionError assertionError) {
      throwAssertionError(shouldHaveValueCloseToOffset(actual, expectedValue, offset, abs(expectedValue - actual.getAsDouble())));
```

### OptionalGetWithoutIsPresent
`OptionalDouble.getAsDouble()` without 'isPresent()' check
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOptionalDoubleAssert.java`
#### Snippet
```java
    isNotNull();
    if (!actual.isPresent()) throwAssertionError(shouldContain(expectedValue));
    if (expectedValue != actual.getAsDouble())
      throw Failures.instance().failure(info, shouldContain(actual, expectedValue), actual.getAsDouble(), expectedValue);
    return myself;
```

### OptionalGetWithoutIsPresent
`OptionalDouble.getAsDouble()` without 'isPresent()' check
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOptionalDoubleAssert.java`
#### Snippet
```java
    if (!actual.isPresent()) throwAssertionError(shouldHaveValueCloseToPercentage(expectedValue));
    try {
      doubles.assertIsCloseToPercentage(info, actual.getAsDouble(), expectedValue, percentage);
    } catch (AssertionError assertionError) {
      throwAssertionError(shouldHaveValueCloseToPercentage(actual, expectedValue, percentage, abs(expectedValue - actual.getAsDouble())));
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOptionalAssert.java`
#### Snippet
```java
  public SELF hasValueSatisfying(Condition<? super VALUE> condition) {
    assertValueIsPresent();
    conditions.assertIs(info, actual.get(), condition);
    return myself;
  }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOptionalAssert.java`
#### Snippet
```java
  private AbstractObjectAssert<?, VALUE> internalGet() {
    isPresent();
    return assertThat(actual.get()).withAssertionState(myself);
  }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOptionalAssert.java`
#### Snippet
```java
  public SELF containsInstanceOf(Class<?> clazz) {
    assertValueIsPresent();
    if (!clazz.isInstance(actual.get())) throwAssertionError(shouldContainInstanceOf(actual, clazz));
    return myself;
  }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOptionalAssert.java`
#### Snippet
```java
    checkNotNull(expectedValue);
    if (!actual.isPresent()) throwAssertionError(shouldContain(expectedValue));
    if (!optionalValueComparisonStrategy.areEqual(actual.get(), expectedValue))
      throw Failures.instance().failure(info, shouldContain(actual, expectedValue), actual.get(), expectedValue);
    return myself;
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOptionalAssert.java`
#### Snippet
```java
    checkNotNull(expectedValue);
    if (!actual.isPresent()) throwAssertionError(shouldContain(expectedValue));
    if (actual.get() != expectedValue) throwAssertionError(shouldContainSame(actual, expectedValue));
    return myself;
  }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOptionalAssert.java`
#### Snippet
```java
  public SELF hasValueSatisfying(Consumer<VALUE> requirement) {
    assertValueIsPresent();
    requirement.accept(actual.get());
    return myself;
  }
```

### OptionalGetWithoutIsPresent
`OptionalLong.getAsLong()` without 'isPresent()' check
in `assertj-core/src/main/java/org/assertj/core/error/OptionalShouldBeEmpty.java`
#### Snippet
```java
   */
  public static OptionalShouldBeEmpty shouldBeEmpty(OptionalLong optional) {
    return new OptionalShouldBeEmpty(optional.getClass(), optional.getAsLong());
  }
}
```

### OptionalGetWithoutIsPresent
`OptionalInt.getAsInt()` without 'isPresent()' check
in `assertj-core/src/main/java/org/assertj/core/error/OptionalShouldBeEmpty.java`
#### Snippet
```java
   */
  public static OptionalShouldBeEmpty shouldBeEmpty(OptionalInt optional) {
    return new OptionalShouldBeEmpty(optional.getClass(), optional.getAsInt());
  }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `assertj-core/src/main/java/org/assertj/core/error/OptionalShouldBeEmpty.java`
#### Snippet
```java
   */
  public static <VALUE> OptionalShouldBeEmpty shouldBeEmpty(Optional<VALUE> optional) {
    return new OptionalShouldBeEmpty(optional.getClass(), optional.get());
  }

```

### OptionalGetWithoutIsPresent
`OptionalDouble.getAsDouble()` without 'isPresent()' check
in `assertj-core/src/main/java/org/assertj/core/error/OptionalShouldBeEmpty.java`
#### Snippet
```java
   */
  public static OptionalShouldBeEmpty shouldBeEmpty(OptionalDouble optional) {
    return new OptionalShouldBeEmpty(optional.getClass(), optional.getAsDouble());
  }

```

## MethodOverridesStaticMethod
### MethodOverridesStaticMethod
Method `setPreferredAssumptionException()` tries to override a static method of a superclass
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssumptions.java`
#### Snippet
```java
   * @since 3.21.0
   */
  public static void setPreferredAssumptionException(PreferredAssumptionException preferredAssumptionException) {
    Assumptions.setPreferredAssumptionException(preferredAssumptionException);
  }
```

### MethodOverridesStaticMethod
Method `within()` tries to override a static method of a superclass
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * @since 3.20.0
   */
  public static Offset<Double> within(Double value) {
    return Assertions.offset(value);
  }
```

### MethodOverridesStaticMethod
Method `setAllowComparingPrivateFields()` tries to override a static method of a superclass
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * @since 3.20.0
   */
  public static void setAllowComparingPrivateFields(boolean allowComparingPrivateFields) {
    Assertions.setAllowComparingPrivateFields(allowComparingPrivateFields);
  }
```

### MethodOverridesStaticMethod
Method `registerCustomDateFormat()` tries to override a static method of a superclass
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * @since 3.20.0
   */
  public static void registerCustomDateFormat(DateFormat userCustomDateFormat) {
    Assertions.registerCustomDateFormat(userCustomDateFormat);
  }
```

### MethodOverridesStaticMethod
Method `byLessThan()` tries to override a static method of a superclass
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * @since 3.20.0
   */
  public static Offset<Long> byLessThan(Long value) {
    return Assertions.byLessThan(value);
  }
```

### MethodOverridesStaticMethod
Method `shouldHaveThrown()` tries to override a static method of a superclass
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   */
  @CanIgnoreReturnValue
  public static <T> T shouldHaveThrown(Class<? extends Throwable> throwableClass) {
    return Assertions.shouldHaveThrown(throwableClass);
  }
```

### MethodOverridesStaticMethod
Method `byLessThan()` tries to override a static method of a superclass
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * @since 3.20.0
   */
  public static Offset<BigDecimal> byLessThan(BigDecimal value) {
    return Assertions.byLessThan(value);
  }
```

### MethodOverridesStaticMethod
Method `linesOf()` tries to override a static method of a superclass
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * @since 3.20.0
   */
  public static List<String> linesOf(File file) {
    return Assertions.linesOf(file, Charset.defaultCharset());
  }
```

### MethodOverridesStaticMethod
Method `setMaxLengthForSingleLineDescription()` tries to override a static method of a superclass
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * @since 3.20.0
   */
  public static void setMaxLengthForSingleLineDescription(int maxLengthForSingleLineDescription) {
    Assertions.setMaxLengthForSingleLineDescription(maxLengthForSingleLineDescription);
  }
```

### MethodOverridesStaticMethod
Method `contentOf()` tries to override a static method of a superclass
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * @since 3.20.0
   */
  public static String contentOf(URL url, String charsetName) {
    return Assertions.contentOf(url, charsetName);
  }
```

### MethodOverridesStaticMethod
Method `extractProperty()` tries to override a static method of a superclass
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * @since 3.20.0
   */
  public static Properties<Object> extractProperty(String propertyName) {
    return Assertions.extractProperty(propertyName);
  }
```

### MethodOverridesStaticMethod
Method `extractProperty()` tries to override a static method of a superclass
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * @since 3.20.0
   */
  public static <T> Properties<T> extractProperty(String propertyName, Class<T> propertyType) {
    return Assertions.extractProperty(propertyName, propertyType);
  }
```

### MethodOverridesStaticMethod
Method `notIn()` tries to override a static method of a superclass
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * @since 3.20.0
   */
  public static NotInFilter notIn(Object... valuesNotToMatch) {
    return Assertions.notIn(valuesNotToMatch);
  }
```

### MethodOverridesStaticMethod
Method `linesOf()` tries to override a static method of a superclass
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * @since 3.20.0
   */
  public static List<String> linesOf(File file, String charsetName) {
    return Assertions.linesOf(file, charsetName);
  }
```

### MethodOverridesStaticMethod
Method `useDefaultRepresentation()` tries to override a static method of a superclass
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * @since 3.20.0
   */
  public static void useDefaultRepresentation() {
    Assertions.useDefaultRepresentation();
  }
```

### MethodOverridesStaticMethod
Method `contentOf()` tries to override a static method of a superclass
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * @since 3.20.0
   */
  public static String contentOf(File file, String charsetName) {
    return Assertions.contentOf(file, charsetName);
  }
```

### MethodOverridesStaticMethod
Method `setMaxElementsForPrinting()` tries to override a static method of a superclass
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * @since 3.20.0
   */
  public static void setMaxElementsForPrinting(int maxElementsForPrinting) {
    Assertions.setMaxElementsForPrinting(maxElementsForPrinting);
  }
```

### MethodOverridesStaticMethod
Method `atIndex()` tries to override a static method of a superclass
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * @since 3.20.0
   */
  public static Index atIndex(int index) {
    return Assertions.atIndex(index);
  }
```

### MethodOverridesStaticMethod
Method `catchNullPointerException()` tries to override a static method of a superclass
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * @since 3.22.0
   */
  public static NullPointerException catchNullPointerException(ThrowingCallable shouldRaiseNullPointerException) {
    return AssertionsForClassTypes.catchThrowableOfType(shouldRaiseNullPointerException, NullPointerException.class);
  }
```

### MethodOverridesStaticMethod
Method `registerFormatterForType()` tries to override a static method of a superclass
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * @since 3.5.0
   */
  public static <T> void registerFormatterForType(Class<T> type, Function<T, String> formatter) {
    Assertions.registerFormatterForType(type, formatter);
  }
```

### MethodOverridesStaticMethod
Method `byLessThan()` tries to override a static method of a superclass
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * @since 3.20.0
   */
  public static TemporalUnitOffset byLessThan(long value, TemporalUnit unit) {
    return Assertions.byLessThan(value, unit);
  }
```

### MethodOverridesStaticMethod
Method `catchRuntimeException()` tries to override a static method of a superclass
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * @since 3.22.0
   */
  public static RuntimeException catchRuntimeException(ThrowingCallable shouldRaiseRuntimeException) {
    return AssertionsForClassTypes.catchThrowableOfType(shouldRaiseRuntimeException, RuntimeException.class);
  }
```

### MethodOverridesStaticMethod
Method `not()` tries to override a static method of a superclass
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * @since 3.20.0
   */
  public static NotFilter not(Object valueNotToMatch) {
    return Assertions.not(valueNotToMatch);
  }
```

### MethodOverridesStaticMethod
Method `linesOf()` tries to override a static method of a superclass
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * @since 3.20.0
   */
  public static List<String> linesOf(File file, Charset charset) {
    return Assertions.linesOf(file, charset);
  }
```

### MethodOverridesStaticMethod
Method `withinPercentage()` tries to override a static method of a superclass
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * @since 3.20.0
   */
  public static Percentage withinPercentage(Integer value) {
    return Assertions.withinPercentage(value);
  }
```

### MethodOverridesStaticMethod
Method `catchIllegalArgumentException()` tries to override a static method of a superclass
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * @since 3.22.0
   */
  public static IllegalArgumentException catchIllegalArgumentException(ThrowingCallable shouldRaiseIllegalArgumentException) {
    return AssertionsForClassTypes.catchThrowableOfType(shouldRaiseIllegalArgumentException, IllegalArgumentException.class);
  }
```

### MethodOverridesStaticMethod
Method `byLessThan()` tries to override a static method of a superclass
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * @since 3.20.0
   */
  public static Offset<Float> byLessThan(Float value) {
    return Assertions.byLessThan(value);
  }
```

### MethodOverridesStaticMethod
Method `catchException()` tries to override a static method of a superclass
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * @since 3.22.0
   */
  public static Exception catchException(ThrowingCallable shouldRaiseException) {
    return AssertionsForClassTypes.catchThrowableOfType(shouldRaiseException, Exception.class);
  }
```

### MethodOverridesStaticMethod
Method `withMarginOf()` tries to override a static method of a superclass
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * @since 3.20.0
   */
  public static Duration withMarginOf(Duration allowedDifference) {
    return Assertions.withMarginOf(allowedDifference);
  }
```

### MethodOverridesStaticMethod
Method `within()` tries to override a static method of a superclass
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * @since 3.20.0
   */
  public static Offset<Long> within(Long value) {
    return Assertions.within(value);
  }
```

### MethodOverridesStaticMethod
Method `linesOf()` tries to override a static method of a superclass
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * @since 3.20.0
   */
  public static List<String> linesOf(URL url) {
    return Assertions.linesOf(url, Charset.defaultCharset());
  }
```

### MethodOverridesStaticMethod
Method `doesNotHave()` tries to override a static method of a superclass
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * @since 3.20.0
   */
  public static <T> DoesNotHave<T> doesNotHave(Condition<? super T> condition) {
    return Assertions.doesNotHave(condition);
  }
```

### MethodOverridesStaticMethod
Method `byLessThan()` tries to override a static method of a superclass
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * @since 3.20.0
   */
  public static Offset<Byte> byLessThan(Byte value) {
    return Assertions.byLessThan(value);
  }
```

### MethodOverridesStaticMethod
Method `linesOf()` tries to override a static method of a superclass
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * @since 3.20.0
   */
  public static List<String> linesOf(URL url, String charsetName) {
    return Assertions.linesOf(url, charsetName);
  }
```

### MethodOverridesStaticMethod
Method `linesOf()` tries to override a static method of a superclass
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
	 * @since 3.23.0
	 */
	public static List<String> linesOf(Path path) {
		return Assertions.linesOf(path, Charset.defaultCharset());
	}
```

### MethodOverridesStaticMethod
Method `within()` tries to override a static method of a superclass
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * @since 3.20.0
   */
  public static Offset<Float> within(Float value) {
    return Assertions.offset(value);
  }
```

### MethodOverridesStaticMethod
Method `byLessThan()` tries to override a static method of a superclass
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * @since 3.20.0
   */
  public static Offset<Integer> byLessThan(Integer value) {
    return Assertions.byLessThan(value);
  }
```

### MethodOverridesStaticMethod
Method `tuple()` tries to override a static method of a superclass
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * @since 3.20.0
   */
  public static Tuple tuple(Object... values) {
    return Assertions.tuple(values);
  }
```

### MethodOverridesStaticMethod
Method `contentOf()` tries to override a static method of a superclass
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * @since 3.20.0
   */
  public static String contentOf(File file, Charset charset) {
    return Assertions.contentOf(file, charset);
  }
```

### MethodOverridesStaticMethod
Method `catchIllegalStateException()` tries to override a static method of a superclass
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * @since 3.22.0
   */
  public static IllegalStateException catchIllegalStateException(ThrowingCallable shouldRaiseIllegalStateException) {
    return AssertionsForClassTypes.catchThrowableOfType(shouldRaiseIllegalStateException, IllegalStateException.class);
  }
```

### MethodOverridesStaticMethod
Method `byLessThan()` tries to override a static method of a superclass
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * @since 3.20.0
   */
  public static Offset<BigInteger> byLessThan(BigInteger value) {
    return Assertions.byLessThan(value);
  }
```

### MethodOverridesStaticMethod
Method `catchThrowableOfType()` tries to override a static method of a superclass
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * @since 3.20.0
   */
  public static <THROWABLE extends Throwable> THROWABLE catchThrowableOfType(ThrowingCallable shouldRaiseThrowable,
                                                                             Class<THROWABLE> type) {
    return AssertionsForClassTypes.catchThrowableOfType(shouldRaiseThrowable, type);
```

### MethodOverridesStaticMethod
Method `useDefaultDateFormatsOnly()` tries to override a static method of a superclass
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * @since 3.20.0
   */
  public static void useDefaultDateFormatsOnly() {
    Assertions.useDefaultDateFormatsOnly();
  }
```

### MethodOverridesStaticMethod
Method `byLessThan()` tries to override a static method of a superclass
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * @since 3.20.0
   */
  public static Offset<Double> byLessThan(Double value) {
    return Assertions.byLessThan(value);
  }
```

### MethodOverridesStaticMethod
Method `linesOf()` tries to override a static method of a superclass
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
	 * @since 3.23.0
	 */
	public static List<String> linesOf(Path path, Charset charset) {
		return Assertions.linesOf(path, charset);
	}
```

### MethodOverridesStaticMethod
Method `allOf()` tries to override a static method of a superclass
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * @since 3.20.0
   */
  public static <T> Condition<T> allOf(Iterable<? extends Condition<? super T>> conditions) {
    return Assertions.allOf(conditions);
  }
```

### MethodOverridesStaticMethod
Method `setAllowExtractingPrivateFields()` tries to override a static method of a superclass
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * @since 3.20.0
   */
  public static void setAllowExtractingPrivateFields(boolean allowExtractingPrivateFields) {
    Assertions.setAllowExtractingPrivateFields(allowExtractingPrivateFields);
  }
```

### MethodOverridesStaticMethod
Method `allOf()` tries to override a static method of a superclass
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   */
  @SafeVarargs
  public static <T> Condition<T> allOf(Condition<? super T>... conditions) {
    return Assertions.allOf(conditions);
  }
```

### MethodOverridesStaticMethod
Method `setExtractBareNamePropertyMethods()` tries to override a static method of a superclass
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * @since 3.20.0
   */
  public static void setExtractBareNamePropertyMethods(boolean barenamePropertyMethods) {
    Assertions.setExtractBareNamePropertyMethods(barenamePropertyMethods);
  }
```

### MethodOverridesStaticMethod
Method `within()` tries to override a static method of a superclass
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * @since 3.20.0
   */
  public static Offset<BigDecimal> within(BigDecimal value) {
    return Assertions.within(value);
  }
```

### MethodOverridesStaticMethod
Method `catchIndexOutOfBoundsException()` tries to override a static method of a superclass
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * @since 3.22.0
   */
  public static IndexOutOfBoundsException catchIndexOutOfBoundsException(ThrowingCallable shouldRaiseIndexOutOfBoundException) {
    return AssertionsForClassTypes.catchThrowableOfType(shouldRaiseIndexOutOfBoundException, IndexOutOfBoundsException.class);
  }
```

### MethodOverridesStaticMethod
Method `byLessThan()` tries to override a static method of a superclass
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * @since 3.20.0
   */
  public static Offset<Short> byLessThan(Short value) {
    return Assertions.byLessThan(value);
  }
```

### MethodOverridesStaticMethod
Method `registerCustomDateFormat()` tries to override a static method of a superclass
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * @since 3.20.0
   */
  public static void registerCustomDateFormat(String userCustomDateFormatPattern) {
    Assertions.registerCustomDateFormat(userCustomDateFormatPattern);
  }
```

### MethodOverridesStaticMethod
Method `linesOf()` tries to override a static method of a superclass
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
	 * @since 3.23.0
	 */
	public static List<String> linesOf(Path path, String charsetName) {
		return Assertions.linesOf(path, charsetName);
	}
```

### MethodOverridesStaticMethod
Method `anyOf()` tries to override a static method of a superclass
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * @since 3.20.0
   */
  public static <T> Condition<T> anyOf(Iterable<? extends Condition<? super T>> conditions) {
    return Assertions.anyOf(conditions);
  }
```

### MethodOverridesStaticMethod
Method `setPrintAssertionsDescription()` tries to override a static method of a superclass
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * @since 3.20.0
   */
  public static void setPrintAssertionsDescription(boolean printAssertionsDescription) {
    Assertions.setPrintAssertionsDescription(printAssertionsDescription);
  }
```

### MethodOverridesStaticMethod
Method `within()` tries to override a static method of a superclass
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * @since 3.20.0
   */
  public static Offset<BigInteger> within(BigInteger value) {
    return Assertions.within(value);
  }
```

### MethodOverridesStaticMethod
Method `in()` tries to override a static method of a superclass
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * @since 3.20.0
   */
  public static InFilter in(Object... values) {
    return Assertions.in(values);
  }
```

### MethodOverridesStaticMethod
Method `setMaxStackTraceElementsDisplayed()` tries to override a static method of a superclass
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * @since 3.20.0
   */
  public static void setMaxStackTraceElementsDisplayed(int maxStackTraceElementsDisplayed) {
    Assertions.setMaxStackTraceElementsDisplayed(maxStackTraceElementsDisplayed);
  }
```

### MethodOverridesStaticMethod
Method `not()` tries to override a static method of a superclass
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * @since 3.20.0
   */
  public static <T> Not<T> not(Condition<? super T> condition) {
    return Assertions.not(condition);
  }
```

### MethodOverridesStaticMethod
Method `contentOf()` tries to override a static method of a superclass
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * @since 3.20.0
   */
  public static String contentOf(URL url, Charset charset) {
    return Assertions.contentOf(url, charset);
  }
```

### MethodOverridesStaticMethod
Method `contentOf()` tries to override a static method of a superclass
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * @since 3.20.0
   */
  public static String contentOf(URL url) {
    return Assertions.contentOf(url, Charset.defaultCharset());
  }
```

### MethodOverridesStaticMethod
Method `within()` tries to override a static method of a superclass
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * @since 3.20.0
   */
  public static Offset<Byte> within(Byte value) {
    return Assertions.within(value);
  }
```

### MethodOverridesStaticMethod
Method `fail()` tries to override a static method of a superclass
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   */
  @CanIgnoreReturnValue
  public static <T> T fail(String failureMessage, Throwable realCause) {
    return Assertions.fail(failureMessage, realCause);
  }
```

### MethodOverridesStaticMethod
Method `fail()` tries to override a static method of a superclass
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   */
  @CanIgnoreReturnValue
  public static <T> T fail(String failureMessage, Object... args) {
    return Assertions.fail(failureMessage, args);
  }
```

### MethodOverridesStaticMethod
Method `withPrecision()` tries to override a static method of a superclass
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * @since 3.20.0
   */
  public static Offset<Double> withPrecision(Double value) {
    return Assertions.offset(value);
  }
```

### MethodOverridesStaticMethod
Method `setDescriptionConsumer()` tries to override a static method of a superclass
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * @since 3.20.0
   */
  public static void setDescriptionConsumer(Consumer<Description> descriptionConsumer) {
    Assertions.setDescriptionConsumer(descriptionConsumer);
  }
```

### MethodOverridesStaticMethod
Method `contentOf()` tries to override a static method of a superclass
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * @since 3.20.0
   */
  public static String contentOf(File file) {
    return Assertions.contentOf(file, Charset.defaultCharset());
  }
```

### MethodOverridesStaticMethod
Method `catchThrowable()` tries to override a static method of a superclass
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * @since 3.20.0
   */
  public static Throwable catchThrowable(ThrowingCallable shouldRaiseThrowable) {
    return AssertionsForClassTypes.catchThrowable(shouldRaiseThrowable);
  }
```

### MethodOverridesStaticMethod
Method `useRepresentation()` tries to override a static method of a superclass
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * @since 3.20.0
   */
  public static void useRepresentation(Representation customRepresentation) {
    Assertions.useRepresentation(customRepresentation);
  }
```

### MethodOverridesStaticMethod
Method `withinPercentage()` tries to override a static method of a superclass
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * @since 3.20.0
   */
  public static Percentage withinPercentage(Long value) {
    return Assertions.withinPercentage(value);
  }
```

### MethodOverridesStaticMethod
Method `catchReflectiveOperationException()` tries to override a static method of a superclass
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * @since 3.22.0
   */
  public static ReflectiveOperationException catchReflectiveOperationException(ThrowingCallable shouldRaiseReflectiveOperationException) {
    return AssertionsForClassTypes.catchThrowableOfType(shouldRaiseReflectiveOperationException, ReflectiveOperationException.class);
  }
```

### MethodOverridesStaticMethod
Method `anyOf()` tries to override a static method of a superclass
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   */
  @SafeVarargs
  public static <T> Condition<T> anyOf(Condition<? super T>... conditions) {
    return Assertions.anyOf(conditions);
  }
```

### MethodOverridesStaticMethod
Method `within()` tries to override a static method of a superclass
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * @since 3.20.0
   */
  public static Offset<Integer> within(Integer value) {
    return Assertions.within(value);
  }
```

### MethodOverridesStaticMethod
Method `as()` tries to override a static method of a superclass
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * @since 3.20.0
   */
  public static <T, ASSERT extends AbstractAssert<?, ?>> InstanceOfAssertFactory<T, ASSERT> as(InstanceOfAssertFactory<T, ASSERT> assertFactory) {
    return Assertions.as(assertFactory);
  }
```

### MethodOverridesStaticMethod
Method `from()` tries to override a static method of a superclass
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * @since 3.20.0
   */
  public static <F, T> Function<F, T> from(Function<F, T> extractor) {
    return Assertions.from(extractor);
  }
```

### MethodOverridesStaticMethod
Method `within()` tries to override a static method of a superclass
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * @since 3.20.0
   */
  public static TemporalUnitOffset within(long value, TemporalUnit unit) {
    return Assertions.within(value, unit);
  }
```

### MethodOverridesStaticMethod
Method `withinPercentage()` tries to override a static method of a superclass
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * @since 3.20.0
   */
  public static Percentage withinPercentage(Double value) {
    return Assertions.withinPercentage(value);
  }
```

### MethodOverridesStaticMethod
Method `withPrecision()` tries to override a static method of a superclass
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * @since 3.20.0
   */
  public static Offset<Float> withPrecision(Float value) {
    return Assertions.offset(value);
  }
```

### MethodOverridesStaticMethod
Method `entry()` tries to override a static method of a superclass
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * @since 3.20.0
   */
  public static <K, V> MapEntry<K, V> entry(K key, V value) {
    return Assertions.entry(key, value);
  }
```

### MethodOverridesStaticMethod
Method `setRemoveAssertJRelatedElementsFromStackTrace()` tries to override a static method of a superclass
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * @since 3.20.0
   */
  public static void setRemoveAssertJRelatedElementsFromStackTrace(boolean removeAssertJRelatedElementsFromStackTrace) {
    Assertions.setRemoveAssertJRelatedElementsFromStackTrace(removeAssertJRelatedElementsFromStackTrace);
  }
```

### MethodOverridesStaticMethod
Method `setLenientDateParsing()` tries to override a static method of a superclass
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * @since 3.20.0
   */
  public static void setLenientDateParsing(boolean value) {
    Assertions.setLenientDateParsing(value);
  }
```

### MethodOverridesStaticMethod
Method `within()` tries to override a static method of a superclass
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * @since 3.20.0
   */
  public static Offset<Short> within(Short value) {
    return Assertions.within(value);
  }
```

### MethodOverridesStaticMethod
Method `linesOf()` tries to override a static method of a superclass
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * @since 3.20.0
   */
  public static List<String> linesOf(URL url, Charset charset) {
    return Assertions.linesOf(url, charset);
  }
```

### MethodOverridesStaticMethod
Method `fail()` tries to override a static method of a superclass
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   */
  @CanIgnoreReturnValue
  public static <T> T fail(String failureMessage) {
    return Assertions.fail(failureMessage);
  }
```

### MethodOverridesStaticMethod
Method `catchIOException()` tries to override a static method of a superclass
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * @since 3.22.0
   */
  public static IOException catchIOException(ThrowingCallable shouldRaiseIOException) {
    return AssertionsForClassTypes.catchThrowableOfType(shouldRaiseIOException, IOException.class);
  }
```

## StringConcatenationInsideStringBufferAppend
### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `assertj-core/src/main/java/org/assertj/core/error/ShouldNotSatisfyPredicateRecursively.java`
#### Snippet
```java
    StringBuilder builder = new StringBuilder(NEW_LINE);
    builder.append("The following fields did not satisfy the predicate:").append(NEW_LINE);
    builder.append(INDENT + fieldsDescription.toString() + NEW_LINE);
    builder.append("The recursive assertion was performed with this configuration:").append(NEW_LINE);
    builder.append(recursiveAssertionConfiguration);
```

## IOResource
### IOResource
'LineNumberReader' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `assertj-core/src/main/java/org/assertj/core/internal/Strings.java`
#### Snippet
```java
  public void assertHasLineCount(AssertionInfo info, CharSequence actual, int expectedLineCount) {
    assertNotNull(info, actual);
    LineNumberReader reader = new LineNumberReader(new StringReader(actual.toString()));
    try {
      while (reader.readLine() != null);
```

## UnnecessarySemicolon
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `assertj-core/src/main/java/org/assertj/core/internal/ComparisonStrategy.java`
#### Snippet
```java
  default String asText() {
    return "";
  };

}
```

## SimplifyStreamApiCallChains
### SimplifyStreamApiCallChains
'filter()' and 'map()' can be swapped
in `assertj-core/src/main/java/org/assertj/core/internal/Objects.java`
#### Snippet
```java
                                                   .filter(field -> canReadFieldValue(field, actual))
                                                   .filter(field -> getPropertyOrFieldValue(actual, field.getName()) != null)
                                                   .map(Field::getName)
                                                   .collect(toList());
    if (!nonNullFieldNames.isEmpty()) {
```

## DeprecatedIsStillUsed
### DeprecatedIsStillUsed
Deprecated member 'isEqualToIgnoringGivenFields' is still used
in `assertj-core/src/main/java/org/assertj/core/api/AbstractObjectAssert.java`
#### Snippet
```java
   */
  @Deprecated
  public SELF isEqualToIgnoringGivenFields(Object other, String... propertiesOrFieldsToIgnore) {
    objects.assertIsEqualToIgnoringGivenFields(info, actual, other, comparatorsByPropertyOrField, getComparatorsByType(),
                                               propertiesOrFieldsToIgnore);
```

### DeprecatedIsStillUsed
Deprecated member 'isEqualToComparingOnlyGivenFields' is still used
in `assertj-core/src/main/java/org/assertj/core/api/AbstractObjectAssert.java`
#### Snippet
```java
   */
  @Deprecated
  public SELF isEqualToComparingOnlyGivenFields(Object other, String... propertiesOrFieldsUsedInComparison) {
    objects.assertIsEqualToComparingOnlyGivenFields(info, actual, other, comparatorsByPropertyOrField, getComparatorsByType(),
                                                    propertiesOrFieldsUsedInComparison);
```

### DeprecatedIsStillUsed
Deprecated member 'isEqualToComparingFieldByFieldRecursively' is still used
in `assertj-core/src/main/java/org/assertj/core/api/AbstractObjectAssert.java`
#### Snippet
```java
   */
  @Deprecated
  public SELF isEqualToComparingFieldByFieldRecursively(Object other) {
    objects.assertIsEqualToComparingFieldByFieldRecursively(info, actual, other, comparatorsByPropertyOrField,
                                                            getComparatorsByType());
```

### DeprecatedIsStillUsed
Deprecated member 'isEqualToIgnoringNullFields' is still used
in `assertj-core/src/main/java/org/assertj/core/api/AbstractObjectAssert.java`
#### Snippet
```java
   */
  @Deprecated
  public SELF isEqualToIgnoringNullFields(Object other) {
    objects.assertIsEqualToIgnoringNullFields(info, actual, other, comparatorsByPropertyOrField, getComparatorsByType());
    return myself;
```

### DeprecatedIsStillUsed
Deprecated member 'hasFailed' is still used
in `assertj-core/src/main/java/org/assertj/core/api/AbstractCompletableFutureAssert.java`
#### Snippet
```java
   */
  @Deprecated
  public SELF hasFailed() {
    isNotNull();
    if (!(actual.isCompletedExceptionally() && !actual.isCancelled())) throwAssertionError(shouldHaveFailed(actual));
```

### DeprecatedIsStillUsed
Deprecated member 'hasNotFailed' is still used
in `assertj-core/src/main/java/org/assertj/core/api/AbstractCompletableFutureAssert.java`
#### Snippet
```java
   */
  @Deprecated
  public SELF hasNotFailed() {
    isNotNull();
    if (actual.isCompletedExceptionally() && !actual.isCancelled()) throwAssertionError(shouldNotHaveFailed(actual));
```

### DeprecatedIsStillUsed
Deprecated member 'hasFailedWithThrowableThat' is still used
in `assertj-core/src/main/java/org/assertj/core/api/AbstractCompletableFutureAssert.java`
#### Snippet
```java
   */
  @Deprecated
  public AbstractThrowableAssert<?, ? extends Throwable> hasFailedWithThrowableThat() {
    hasFailed();
    try {
```

### DeprecatedIsStillUsed
Deprecated member 'Java6JUnitSoftAssertions' is still used
in `assertj-core/src/main/java/org/assertj/core/api/Java6JUnitSoftAssertions.java`
#### Snippet
```java
 */
@Deprecated
public class Java6JUnitSoftAssertions extends AbstractSoftAssertions
    implements Java6StandardSoftAssertionsProvider, SoftAssertionsRule {

```

### DeprecatedIsStillUsed
Deprecated member 'Java6JUnitBDDSoftAssertions' is still used
in `assertj-core/src/main/java/org/assertj/core/api/Java6JUnitBDDSoftAssertions.java`
#### Snippet
```java
 */
@Deprecated
public class Java6JUnitBDDSoftAssertions extends AbstractSoftAssertions
    implements Java6BDDSoftAssertionsProvider, SoftAssertionsRule {
}
```

### DeprecatedIsStillUsed
Deprecated member 'Java6Assertions' is still used
in `assertj-core/src/main/java/org/assertj/core/api/Java6Assertions.java`
#### Snippet
```java
@CheckReturnValue
@Deprecated
public class Java6Assertions {

  /**
```

### DeprecatedIsStillUsed
Deprecated member 'isNotJavaBlank' is still used
in `assertj-core/src/main/java/org/assertj/core/api/AbstractCharSequenceAssert.java`
#### Snippet
```java
   */
  @Deprecated
  public SELF isNotJavaBlank() {
    strings.assertNotJavaBlank(info, actual);
    return myself;
```

### DeprecatedIsStillUsed
Deprecated member 'isJavaBlank' is still used
in `assertj-core/src/main/java/org/assertj/core/api/AbstractCharSequenceAssert.java`
#### Snippet
```java
   */
  @Deprecated
  public SELF isJavaBlank() {
    strings.assertJavaBlank(info, actual);
    return myself;
```

### DeprecatedIsStillUsed
Deprecated member 'isXmlEqualToContentOf' is still used
in `assertj-core/src/main/java/org/assertj/core/api/AbstractCharSequenceAssert.java`
#### Snippet
```java
   */
  @Deprecated
  public SELF isXmlEqualToContentOf(File xmlFile) {
    isXmlEqualTo(contentOf(xmlFile));
    return myself;
```

### DeprecatedIsStillUsed
Deprecated member 'containsOnlyDigits' is still used
in `assertj-core/src/main/java/org/assertj/core/api/AbstractCharSequenceAssert.java`
#### Snippet
```java
   */
  @Deprecated
  public SELF containsOnlyDigits() {
    strings.assertContainsOnlyDigits(info, actual);
    return myself;
```

### DeprecatedIsStillUsed
Deprecated member 'isXmlEqualTo' is still used
in `assertj-core/src/main/java/org/assertj/core/api/AbstractCharSequenceAssert.java`
#### Snippet
```java
   */
  @Deprecated
  public SELF isXmlEqualTo(CharSequence expectedXml) {
    strings.assertXmlEqualsTo(info, actual, expectedXml);
    return myself;
```

### DeprecatedIsStillUsed
Deprecated member 'SoftlyExtension' is still used
in `assertj-core/src/main/java/org/assertj/core/api/junit/jupiter/SoftlyExtension.java`
#### Snippet
```java
 **/
@Deprecated
public class SoftlyExtension implements AfterTestExecutionCallback, TestInstancePostProcessor {

  private static final Namespace SOFTLY_EXTENSION_NAMESPACE = Namespace.create(SoftlyExtension.class);
```

### DeprecatedIsStillUsed
Deprecated member 'temporaryFolder' is still used
in `assertj-core/src/main/java/org/assertj/core/util/Files.java`
#### Snippet
```java
   */
  @Deprecated
  public static File temporaryFolder() {
    File temp = new File(temporaryFolderPath());
    if (!temp.isDirectory()) {
```

## MethodOverloadsParentMethod
### MethodOverloadsParentMethod
Method `isNotEqualTo()` overloads a compatible method of a superclass, when overriding might have been intended
in `assertj-core/src/main/java/org/assertj/core/api/AbstractShortAssert.java`
#### Snippet
```java
   * @throws AssertionError if the actual value is equal to the given one.
   */
  public SELF isNotEqualTo(short other) {
    shorts.assertNotEqual(info, actual, other);
    return myself;
```

### MethodOverloadsParentMethod
Method `isEqualTo()` overloads a compatible method of a superclass, when overriding might have been intended
in `assertj-core/src/main/java/org/assertj/core/api/AbstractShortAssert.java`
#### Snippet
```java
   * @throws AssertionError if the actual value is not equal to the given one.
   */
  public SELF isEqualTo(short expected) {
    shorts.assertEqual(info, actual, expected);
    return myself;
```

### MethodOverloadsParentMethod
Method `isEqualTo()` overloads a compatible method of a superclass, when overriding might have been intended
in `assertj-core/src/main/java/org/assertj/core/api/AbstractBigIntegerAssert.java`
#### Snippet
```java
   * @since 2.7.0 / 3.7.0
   */
  public SELF isEqualTo(String expected) {
    return isEqualTo(new BigInteger(expected));
  }
```

### MethodOverloadsParentMethod
Method `isEqualTo()` overloads a compatible method of a superclass, when overriding might have been intended
in `assertj-core/src/main/java/org/assertj/core/api/AbstractBigIntegerAssert.java`
#### Snippet
```java
   * @since 2.7.0 / 3.7.0
   */
  public SELF isEqualTo(long expected) {
    return isEqualTo(new BigInteger(Long.toString(expected)));
  }
```

### MethodOverloadsParentMethod
Method `isEqualTo()` overloads a compatible method of a superclass, when overriding might have been intended
in `assertj-core/src/main/java/org/assertj/core/api/AbstractBigIntegerAssert.java`
#### Snippet
```java
   * @since 2.7.0 / 3.7.0
   */
  public SELF isEqualTo(int expected) {
    return isEqualTo(new BigInteger(Integer.toString(expected)));
  }
```

### MethodOverloadsParentMethod
Method `isNotIn()` overloads a compatible method of a superclass, when overriding might have been intended
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetDateTimeAssert.java`
#### Snippet
```java
   *           given Strings.
   */
  public SELF isNotIn(String... dateTimesAsString) {
    checkIsNotNullAndNotEmpty(dateTimesAsString);
    return isNotIn(convertToOffsetDateTimeArray(dateTimesAsString));
```

### MethodOverloadsParentMethod
Method `isIn()` overloads a compatible method of a superclass, when overriding might have been intended
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetDateTimeAssert.java`
#### Snippet
```java
   *           from given Strings.
   */
  public SELF isIn(String... dateTimesAsString) {
    checkIsNotNullAndNotEmpty(dateTimesAsString);
    return isIn(convertToOffsetDateTimeArray(dateTimesAsString));
```

### MethodOverloadsParentMethod
Method `isNotIn()` overloads a compatible method of a superclass, when overriding might have been intended
in `assertj-core/src/main/java/org/assertj/core/api/AbstractInstantAssert.java`
#### Snippet
```java
   * @since 3.7.0
   */
  public SELF isNotIn(String... instantsAsString) {
    checkIsNotNullAndNotEmpty(instantsAsString);
    return isNotIn(convertToInstantArray(instantsAsString));
```

### MethodOverloadsParentMethod
Method `isNotEqualTo()` overloads a compatible method of a superclass, when overriding might have been intended
in `assertj-core/src/main/java/org/assertj/core/api/AbstractInstantAssert.java`
#### Snippet
```java
   * @since 3.7.0
   */
  public SELF isNotEqualTo(String instantAsString) {
    assertInstantAsStringParameterIsNotNull(instantAsString);
    return isNotEqualTo(parse(instantAsString));
```

### MethodOverloadsParentMethod
Method `isEqualTo()` overloads a compatible method of a superclass, when overriding might have been intended
in `assertj-core/src/main/java/org/assertj/core/api/AbstractInstantAssert.java`
#### Snippet
```java
   * @since 3.7.0
   */
  public SELF isEqualTo(String instantAsString) {
    assertInstantAsStringParameterIsNotNull(instantAsString);
    return isEqualTo(parse(instantAsString));
```

### MethodOverloadsParentMethod
Method `isIn()` overloads a compatible method of a superclass, when overriding might have been intended
in `assertj-core/src/main/java/org/assertj/core/api/AbstractInstantAssert.java`
#### Snippet
```java
   * @since 3.7.0
   */
  public SELF isIn(String... instantsAsString) {
    checkIsNotNullAndNotEmpty(instantsAsString);
    return isIn(convertToInstantArray(instantsAsString));
```

### MethodOverloadsParentMethod
Method `isIn()` overloads a compatible method of a superclass, when overriding might have been intended
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetTimeAssert.java`
#### Snippet
```java
   *           given Strings.
   */
  public SELF isIn(String... offsetTimesAsString) {
    checkIsNotNullAndNotEmpty(offsetTimesAsString);
    return isIn(convertToOffsetTimeArray(offsetTimesAsString));
```

### MethodOverloadsParentMethod
Method `isNotEqualTo()` overloads a compatible method of a superclass, when overriding might have been intended
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetTimeAssert.java`
#### Snippet
```java
   *           given String.
   */
  public SELF isNotEqualTo(String offsetTimeAsString) {
    assertOffsetTimeAsStringParameterIsNotNull(offsetTimeAsString);
    return isNotEqualTo(parse(offsetTimeAsString));
```

### MethodOverloadsParentMethod
Method `isNotIn()` overloads a compatible method of a superclass, when overriding might have been intended
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetTimeAssert.java`
#### Snippet
```java
   *           Strings.
   */
  public SELF isNotIn(String... offsetTimesAsString) {
    checkIsNotNullAndNotEmpty(offsetTimesAsString);
    return isNotIn(convertToOffsetTimeArray(offsetTimesAsString));
```

### MethodOverloadsParentMethod
Method `isEqualTo()` overloads a compatible method of a superclass, when overriding might have been intended
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetTimeAssert.java`
#### Snippet
```java
   *           given String.
   */
  public SELF isEqualTo(String offsetTimeAsString) {
    assertOffsetTimeAsStringParameterIsNotNull(offsetTimeAsString);
    return isEqualTo(parse(offsetTimeAsString));
```

### MethodOverloadsParentMethod
Method `isEqualTo()` overloads a compatible method of a superclass, when overriding might have been intended
in `assertj-core/src/main/java/org/assertj/core/api/AbstractCharacterAssert.java`
#### Snippet
```java
   * @throws AssertionError if the actual value is not equal to the given one.
   */
  public SELF isEqualTo(char expected) {
    characters.assertEqual(info, actual, expected);
    return myself;
```

### MethodOverloadsParentMethod
Method `isNotEqualTo()` overloads a compatible method of a superclass, when overriding might have been intended
in `assertj-core/src/main/java/org/assertj/core/api/AbstractCharacterAssert.java`
#### Snippet
```java
   * @throws AssertionError if the actual value is equal to the given one.
   */
  public SELF isNotEqualTo(char other) {
    characters.assertNotEqual(info, actual, other);
    return myself;
```

### MethodOverloadsParentMethod
Method `isNotIn()` overloads a compatible method of a superclass, when overriding might have been intended
in `assertj-core/src/main/java/org/assertj/core/api/AbstractLocalDateTimeAssert.java`
#### Snippet
```java
   *           Strings.
   */
  public SELF isNotIn(String... dateTimesAsString) {
    checkIsNotNullAndNotEmpty(dateTimesAsString);
    return isNotIn(convertToLocalDateTimeArray(dateTimesAsString));
```

### MethodOverloadsParentMethod
Method `isIn()` overloads a compatible method of a superclass, when overriding might have been intended
in `assertj-core/src/main/java/org/assertj/core/api/AbstractLocalDateTimeAssert.java`
#### Snippet
```java
   *           Strings.
   */
  public SELF isIn(String... dateTimesAsString) {
    checkIsNotNullAndNotEmpty(dateTimesAsString);
    return isIn(convertToLocalDateTimeArray(dateTimesAsString));
```

### MethodOverloadsParentMethod
Method `isNotEqualTo()` overloads a compatible method of a superclass, when overriding might have been intended
in `assertj-core/src/main/java/org/assertj/core/api/AbstractFloatAssert.java`
#### Snippet
```java
   * @throws AssertionError if the actual value is equal to the given one.
   */
  public SELF isNotEqualTo(Float other) {
    // overloaded for javadoc
    return super.isNotEqualTo(other);
```

### MethodOverloadsParentMethod
Method `isNotEqualTo()` overloads a compatible method of a superclass, when overriding might have been intended
in `assertj-core/src/main/java/org/assertj/core/api/AbstractFloatAssert.java`
#### Snippet
```java
   * @throws AssertionError if the actual value is equal to the given one.
   */
  public SELF isNotEqualTo(float other) {
    if (noCustomComparatorSet()) {
      // use primitive comparison since the parameter is a primitive.
```

### MethodOverloadsParentMethod
Method `isEqualTo()` overloads a compatible method of a superclass, when overriding might have been intended
in `assertj-core/src/main/java/org/assertj/core/api/AbstractFloatAssert.java`
#### Snippet
```java
   * @throws AssertionError if the actual value is not equal to the given one.
   */
  public SELF isEqualTo(Float expected) {
    // overloaded for javadoc
    return super.isEqualTo(expected);
```

### MethodOverloadsParentMethod
Method `isEqualTo()` overloads a compatible method of a superclass, when overriding might have been intended
in `assertj-core/src/main/java/org/assertj/core/api/AbstractFloatAssert.java`
#### Snippet
```java
   * @throws AssertionError if the actual value is not equal to the given one.
   */
  public SELF isEqualTo(float expected) {
    if (noCustomComparatorSet()) {
      // use primitive comparison since the parameter is a primitive.
```

### MethodOverloadsParentMethod
Method `extracting()` overloads a compatible method of a superclass, when overriding might have been intended
in `assertj-core/src/main/java/org/assertj/core/api/AbstractMapAssert.java`
#### Snippet
```java
  @Deprecated
  @CheckReturnValue
  public AbstractObjectAssert<?, ?> extracting(Object key) {
    isNotNull();
    Object extractedValue = actual.get(key);
```

### MethodOverloadsParentMethod
Method `extracting()` overloads a compatible method of a superclass, when overriding might have been intended
in `assertj-core/src/main/java/org/assertj/core/api/AbstractMapAssert.java`
#### Snippet
```java
  @Deprecated
  @CheckReturnValue
  public AbstractListAssert<?, List<?>, Object, ObjectAssert<Object>> extracting(Object... keys) {
    isNotNull();
    List<Object> extractedValues = Stream.of(keys).map(actual::get).collect(toList());
```

### MethodOverloadsParentMethod
Method `isNotIn()` overloads a compatible method of a superclass, when overriding might have been intended
in `assertj-core/src/main/java/org/assertj/core/api/AbstractLocalTimeAssert.java`
#### Snippet
```java
   *           Strings.
   */
  public SELF isNotIn(String... localTimesAsString) {
    checkIsNotNullAndNotEmpty(localTimesAsString);
    return isNotIn(convertToLocalTimeArray(localTimesAsString));
```

### MethodOverloadsParentMethod
Method `isIn()` overloads a compatible method of a superclass, when overriding might have been intended
in `assertj-core/src/main/java/org/assertj/core/api/AbstractLocalTimeAssert.java`
#### Snippet
```java
   *           Strings.
   */
  public SELF isIn(String... localTimesAsString) {
    checkIsNotNullAndNotEmpty(localTimesAsString);
    return isIn(convertToLocalTimeArray(localTimesAsString));
```

### MethodOverloadsParentMethod
Method `isEqualTo()` overloads a compatible method of a superclass, when overriding might have been intended
in `assertj-core/src/main/java/org/assertj/core/api/AbstractLocalTimeAssert.java`
#### Snippet
```java
   *           given String.
   */
  public SELF isEqualTo(String localTimeAsString) {
    assertLocalTimeAsStringParameterIsNotNull(localTimeAsString);
    return isEqualTo(parse(localTimeAsString));
```

### MethodOverloadsParentMethod
Method `isNotEqualTo()` overloads a compatible method of a superclass, when overriding might have been intended
in `assertj-core/src/main/java/org/assertj/core/api/AbstractLocalTimeAssert.java`
#### Snippet
```java
   *           String.
   */
  public SELF isNotEqualTo(String localTimeAsString) {
    assertLocalTimeAsStringParameterIsNotNull(localTimeAsString);
    return isNotEqualTo(parse(localTimeAsString));
```

### MethodOverloadsParentMethod
Method `isEqualTo()` overloads a compatible method of a superclass, when overriding might have been intended
in `assertj-core/src/main/java/org/assertj/core/api/AbstractStringAssert.java`
#### Snippet
```java
   * @since 3.13.0
   */
  public SELF isEqualTo(String expected) {
    return super.isEqualTo(expected);
  }
```

### MethodOverloadsParentMethod
Method `isNotEqualTo()` overloads a compatible method of a superclass, when overriding might have been intended
in `assertj-core/src/main/java/org/assertj/core/api/AbstractLocalDateAssert.java`
#### Snippet
```java
   *           String.
   */
  public SELF isNotEqualTo(String localDateAsString) {
    assertLocalDateAsStringParameterIsNotNull(localDateAsString);
    return isNotEqualTo(parse(localDateAsString));
```

### MethodOverloadsParentMethod
Method `isIn()` overloads a compatible method of a superclass, when overriding might have been intended
in `assertj-core/src/main/java/org/assertj/core/api/AbstractLocalDateAssert.java`
#### Snippet
```java
   *           Strings.
   */
  public SELF isIn(String... localDatesAsString) {
    checkIsNotNullAndNotEmpty(localDatesAsString);
    return isIn(convertToLocalDateArray(localDatesAsString));
```

### MethodOverloadsParentMethod
Method `isNotIn()` overloads a compatible method of a superclass, when overriding might have been intended
in `assertj-core/src/main/java/org/assertj/core/api/AbstractLocalDateAssert.java`
#### Snippet
```java
   *           Strings.
   */
  public SELF isNotIn(String... localDatesAsString) {
    checkIsNotNullAndNotEmpty(localDatesAsString);
    return isNotIn(convertToLocalDateArray(localDatesAsString));
```

### MethodOverloadsParentMethod
Method `isEqualTo()` overloads a compatible method of a superclass, when overriding might have been intended
in `assertj-core/src/main/java/org/assertj/core/api/AbstractLocalDateAssert.java`
#### Snippet
```java
   *           given String.
   */
  public SELF isEqualTo(String localDateAsString) {
    assertLocalDateAsStringParameterIsNotNull(localDateAsString);
    return isEqualTo(parse(localDateAsString));
```

### MethodOverloadsParentMethod
Method `isEqualTo()` overloads a compatible method of a superclass, when overriding might have been intended
in `assertj-core/src/main/java/org/assertj/core/api/AbstractDoubleAssert.java`
#### Snippet
```java
   * @throws AssertionError if the actual value is not equal to the given one.
   */
  public SELF isEqualTo(Double expected) {
    // overloaded for javadoc
    return super.isEqualTo(expected);
```

### MethodOverloadsParentMethod
Method `isEqualTo()` overloads a compatible method of a superclass, when overriding might have been intended
in `assertj-core/src/main/java/org/assertj/core/api/AbstractDoubleAssert.java`
#### Snippet
```java
   * @throws AssertionError if the actual value is not equal to the given one.
   */
  public SELF isEqualTo(double expected) {
    if (noCustomComparatorSet()) {
      // check for null first to avoid casting a null to primitive
```

### MethodOverloadsParentMethod
Method `isNotEqualTo()` overloads a compatible method of a superclass, when overriding might have been intended
in `assertj-core/src/main/java/org/assertj/core/api/AbstractDoubleAssert.java`
#### Snippet
```java
   * @throws AssertionError if the actual value is equal to the given one.
   */
  public SELF isNotEqualTo(Double other) {
    // overloaded for javadoc
    return super.isNotEqualTo(other);
```

### MethodOverloadsParentMethod
Method `isNotEqualTo()` overloads a compatible method of a superclass, when overriding might have been intended
in `assertj-core/src/main/java/org/assertj/core/api/AbstractDoubleAssert.java`
#### Snippet
```java
   * @throws AssertionError if the actual value is == to the given one.
   */
  public SELF isNotEqualTo(double other) {
    if (noCustomComparatorSet()) {
      // check for null first to avoid casting a null to primitive
```

### MethodOverloadsParentMethod
Method `isNotEqualTo()` overloads a compatible method of a superclass, when overriding might have been intended
in `assertj-core/src/main/java/org/assertj/core/api/AbstractByteAssert.java`
#### Snippet
```java
   * @throws AssertionError if the actual value is equal to the given one.
   */
  public SELF isNotEqualTo(byte other) {
    bytes.assertNotEqual(info, actual, other);
    return myself;
```

### MethodOverloadsParentMethod
Method `isEqualTo()` overloads a compatible method of a superclass, when overriding might have been intended
in `assertj-core/src/main/java/org/assertj/core/api/AbstractByteAssert.java`
#### Snippet
```java
   * @throws AssertionError if the actual value is not equal to the given one.
   */
  public SELF isEqualTo(byte expected) {
    bytes.assertEqual(info, actual, expected);
    return myself;
```

### MethodOverloadsParentMethod
Method `isNotIn()` overloads a compatible method of a superclass, when overriding might have been intended
in `assertj-core/src/main/java/org/assertj/core/api/AbstractZonedDateTimeAssert.java`
#### Snippet
```java
   * @throws AssertionError if the actual {@code ZonedDateTime} is not in the given {@link ZonedDateTime}s.
   */
  public SELF isNotIn(ZonedDateTime... expected) {
    return isNotIn((Object[]) changeToActualTimeZone(expected));
  }
```

### MethodOverloadsParentMethod
Method `isIn()` overloads a compatible method of a superclass, when overriding might have been intended
in `assertj-core/src/main/java/org/assertj/core/api/AbstractZonedDateTimeAssert.java`
#### Snippet
```java
   * @throws AssertionError if the actual {@code ZonedDateTime} is not in the given {@link ZonedDateTime}s.
   */
  public SELF isIn(ZonedDateTime... expected) {
    return isIn((Object[]) changeToActualTimeZone(expected));
  }
```

### MethodOverloadsParentMethod
Method `isNotIn()` overloads a compatible method of a superclass, when overriding might have been intended
in `assertj-core/src/main/java/org/assertj/core/api/AbstractZonedDateTimeAssert.java`
#### Snippet
```java
   *           given String.
   */
  public SELF isNotIn(String... dateTimesAsString) {
    checkIsNotNullAndNotEmpty(dateTimesAsString);
    return isNotIn(convertToDateTimeArray(dateTimesAsString));
```

### MethodOverloadsParentMethod
Method `isIn()` overloads a compatible method of a superclass, when overriding might have been intended
in `assertj-core/src/main/java/org/assertj/core/api/AbstractZonedDateTimeAssert.java`
#### Snippet
```java
   *           Strings.
   */
  public SELF isIn(String... dateTimesAsString) {
    checkIsNotNullAndNotEmpty(dateTimesAsString);
    return isIn(convertToDateTimeArray(dateTimesAsString));
```

### MethodOverloadsParentMethod
Method `isEqualTo()` overloads a compatible method of a superclass, when overriding might have been intended
in `assertj-core/src/main/java/org/assertj/core/api/AbstractLongAssert.java`
#### Snippet
```java
   * @throws AssertionError if the actual value is not equal to the given one.
   */
  public SELF isEqualTo(long expected) {
    longs.assertEqual(info, actual, expected);
    return myself;
```

### MethodOverloadsParentMethod
Method `isNotEqualTo()` overloads a compatible method of a superclass, when overriding might have been intended
in `assertj-core/src/main/java/org/assertj/core/api/AbstractLongAssert.java`
#### Snippet
```java
   * @throws AssertionError if the actual value is equal to the given one.
   */
  public SELF isNotEqualTo(long other) {
    longs.assertNotEqual(info, actual, other);
    return myself;
```

### MethodOverloadsParentMethod
Method `isEqualTo()` overloads a compatible method of a superclass, when overriding might have been intended
in `assertj-core/src/main/java/org/assertj/core/api/AbstractBigDecimalAssert.java`
#### Snippet
```java
   * @return {@code this} assertion object.
   */
  public SELF isEqualTo(String expected) {
    return isEqualTo(new BigDecimal(expected));
  }
```

### MethodOverloadsParentMethod
Method `isNotEqualTo()` overloads a compatible method of a superclass, when overriding might have been intended
in `assertj-core/src/main/java/org/assertj/core/api/AbstractIntegerAssert.java`
#### Snippet
```java
   * @throws AssertionError if the actual value is equal to the given one.
   */
  public SELF isNotEqualTo(int other) {
    integers.assertNotEqual(info, actual, other);
    return myself;
```

### MethodOverloadsParentMethod
Method `isEqualTo()` overloads a compatible method of a superclass, when overriding might have been intended
in `assertj-core/src/main/java/org/assertj/core/api/AbstractIntegerAssert.java`
#### Snippet
```java
   * @since 3.10.0
   */
  public SELF isEqualTo(long expected) {
    if (canBeCastToInt(expected)) {
      integers.assertEqual(info, actual, (int) expected);
```

### MethodOverloadsParentMethod
Method `isEqualTo()` overloads a compatible method of a superclass, when overriding might have been intended
in `assertj-core/src/main/java/org/assertj/core/api/AbstractIntegerAssert.java`
#### Snippet
```java
   * @throws AssertionError if the actual value is not equal to the given one.
   */
  public SELF isEqualTo(int expected) {
    integers.assertEqual(info, actual, expected);
    return myself;
```

### MethodOverloadsParentMethod
Method `isNotEqualTo()` overloads a compatible method of a superclass, when overriding might have been intended
in `assertj-core/src/main/java/org/assertj/core/api/AbstractBooleanAssert.java`
#### Snippet
```java
   * @throws AssertionError if the actual value is equal to the given one.
   */
  public SELF isNotEqualTo(boolean other) {
    booleans.assertNotEqual(info, actual, other);
    return myself;
```

### MethodOverloadsParentMethod
Method `isEqualTo()` overloads a compatible method of a superclass, when overriding might have been intended
in `assertj-core/src/main/java/org/assertj/core/api/AbstractBooleanAssert.java`
#### Snippet
```java
   * @throws AssertionError if the actual value is not equal to the given one.
   */
  public SELF isEqualTo(boolean expected) {
    booleans.assertEqual(info, actual, expected);
    return myself;
```

### MethodOverloadsParentMethod
Method `isNotIn()` overloads a compatible method of a superclass, when overriding might have been intended
in `assertj-core/src/main/java/org/assertj/core/api/AbstractDateAssert.java`
#### Snippet
```java
   * @since 3.19.0
   */
  public SELF isNotIn(Instant... instants) {
    Date[] dates = toDateArray(instants, Date::from);
    return isNotIn((Object[]) dates);
```

### MethodOverloadsParentMethod
Method `isIn()` overloads a compatible method of a superclass, when overriding might have been intended
in `assertj-core/src/main/java/org/assertj/core/api/AbstractDateAssert.java`
#### Snippet
```java
   * @throws AssertionError if one of the given date as String could not be converted to a Date.
   */
  public SELF isIn(String... datesAsString) {
    Date[] dates = toDateArray(datesAsString, this::parse);
    return isIn((Object[]) dates);
```

### MethodOverloadsParentMethod
Method `isNotEqualTo()` overloads a compatible method of a superclass, when overriding might have been intended
in `assertj-core/src/main/java/org/assertj/core/api/AbstractDateAssert.java`
#### Snippet
```java
   * @since 3.19.0
   */
  public SELF isNotEqualTo(Instant instant) {
    return isNotEqualTo(Date.from(instant));
  }
```

### MethodOverloadsParentMethod
Method `isEqualTo()` overloads a compatible method of a superclass, when overriding might have been intended
in `assertj-core/src/main/java/org/assertj/core/api/AbstractDateAssert.java`
#### Snippet
```java
   * @throws AssertionError if the given date as String could not be converted to a Date.
   */
  public SELF isEqualTo(String dateAsString) {
    return isEqualTo(parse(dateAsString));
  }
```

### MethodOverloadsParentMethod
Method `isNotEqualTo()` overloads a compatible method of a superclass, when overriding might have been intended
in `assertj-core/src/main/java/org/assertj/core/api/AbstractDateAssert.java`
#### Snippet
```java
   * @throws AssertionError if the given date as String could not be converted to a Date.
   */
  public SELF isNotEqualTo(String dateAsString) {
    return isNotEqualTo(parse(dateAsString));
  }
```

### MethodOverloadsParentMethod
Method `isIn()` overloads a compatible method of a superclass, when overriding might have been intended
in `assertj-core/src/main/java/org/assertj/core/api/AbstractDateAssert.java`
#### Snippet
```java
   * @throws AssertionError if actual is not in given dates represented as {@code Instant}.
   */
  public SELF isIn(Instant... instants) {
    Date[] dates = toDateArray(instants, Date::from);
    return isIn((Object[]) dates);
```

### MethodOverloadsParentMethod
Method `isEqualTo()` overloads a compatible method of a superclass, when overriding might have been intended
in `assertj-core/src/main/java/org/assertj/core/api/AbstractDateAssert.java`
#### Snippet
```java
   * @throws AssertionError if actual {@code Date} and given {@link Instant} are not equal (after converting instant to a Date).
   */
  public SELF isEqualTo(Instant instant) {
    return isEqualTo(Date.from(instant));
  }
```

### MethodOverloadsParentMethod
Method `isNotIn()` overloads a compatible method of a superclass, when overriding might have been intended
in `assertj-core/src/main/java/org/assertj/core/api/AbstractDateAssert.java`
#### Snippet
```java
   * @throws AssertionError if one of the given date as String could not be converted to a Date.
   */
  public SELF isNotIn(String... datesAsString) {
    Date[] dates = toDateArray(datesAsString, this::parse);
    return isNotIn((Object[]) dates);
```

## Convert2MethodRef
### Convert2MethodRef
Lambda can be replaced with method reference
in `assertj-core/src/main/java/org/assertj/core/api/AbstractCollectionAssert.java`
#### Snippet
```java
    expectUnsupportedOperationException(() -> actual.add(null), "Collection.add(null)");
    expectUnsupportedOperationException(() -> actual.addAll(emptyCollection()), "Collection.addAll(emptyCollection())");
    expectUnsupportedOperationException(() -> actual.clear(), "Collection.clear()");
    expectUnsupportedOperationException(() -> actual.iterator().remove(), "Collection.iterator().remove()");
    expectUnsupportedOperationException(() -> actual.remove(null), "Collection.remove(null)");
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `assertj-core/src/main/java/org/assertj/core/api/AbstractCollectionAssert.java`
#### Snippet
```java
      NavigableSet<ELEMENT> set = (NavigableSet<ELEMENT>) actual;
      expectUnsupportedOperationException(() -> set.descendingIterator().remove(), "NavigableSet.descendingIterator().remove()");
      expectUnsupportedOperationException(() -> set.pollFirst(), "NavigableSet.pollFirst()");
      expectUnsupportedOperationException(() -> set.pollLast(), "NavigableSet.pollLast()");
    }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `assertj-core/src/main/java/org/assertj/core/api/AbstractCollectionAssert.java`
#### Snippet
```java
      expectUnsupportedOperationException(() -> set.descendingIterator().remove(), "NavigableSet.descendingIterator().remove()");
      expectUnsupportedOperationException(() -> set.pollFirst(), "NavigableSet.pollFirst()");
      expectUnsupportedOperationException(() -> set.pollLast(), "NavigableSet.pollLast()");
    }
  }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `assertj-core/src/main/java/org/assertj/core/internal/Comparables.java`
#### Snippet
```java
  public <T> void assertIsBefore(AssertionInfo info, Comparable<? super T> actual, T other) {
    assertLessThan(info, actual, other,
                   (actual1, other1, comparisonStrategy1) -> ShouldBeBefore.shouldBeBefore(actual1, other1, comparisonStrategy1));
  }

```

## ProtectedMemberInFinalClass
### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `assertj-core/src/main/java/org/assertj/core/condition/VerboseCondition.java`
#### Snippet
```java
   * @return the verbose condition description.
   */
  protected String buildVerboseDescription(T objectUnderTest, boolean matches) {
    StringBuilder sb = new StringBuilder(format("%s", description));
    if (!matches) sb.append(objectUnderTestDescriptor.apply(objectUnderTest));
```

## UnnecessaryToStringCall
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `assertj-core/src/main/java/org/assertj/core/error/ShouldNotSatisfyPredicateRecursively.java`
#### Snippet
```java
    StringBuilder builder = new StringBuilder(NEW_LINE);
    builder.append("The following fields did not satisfy the predicate:").append(NEW_LINE);
    builder.append(INDENT + fieldsDescription.toString() + NEW_LINE);
    builder.append("The recursive assertion was performed with this configuration:").append(NEW_LINE);
    builder.append(recursiveAssertionConfiguration);
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `assertj-core/src/main/java/org/assertj/core/internal/ComparatorBasedComparisonStrategy.java`
#### Snippet
```java
  @Override
  public String asText() {
    return "when comparing values using " + toString();
  }

```

## StringEqualsEmptyString
### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `assertj-core/src/main/java/org/assertj/core/util/Files.java`
#### Snippet
```java
    if (dotAt == -1) return Optional.empty();
    String extension = fileName.substring(dotAt + 1);
    return extension.equals("") ? Optional.empty() : Optional.of(extension);
  }

```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `assertj-core/src/main/java/org/assertj/core/presentation/StandardRepresentation.java`
#### Snippet
```java
    String canonicalName = c.getCanonicalName();
    if (canonicalName != null) return canonicalName;
    if (c.getSimpleName().equals("")) return "anonymous class";
    if (c.getSimpleName().equals("[]")) return "anonymous class array";
    return String.format("local class %s", c.getSimpleName());
```

## RedundantSuppression
### RedundantSuppression
Redundant suppression
in `assertj-core/src/main/java/org/assertj/core/api/AbstractIterableAssert.java`
#### Snippet
```java
// suppression of deprecation works in Eclipse to hide warning for the deprecated classes in the imports
@SuppressWarnings("deprecation")
public abstract class AbstractIterableAssert<SELF extends AbstractIterableAssert<SELF, ACTUAL, ELEMENT, ELEMENT_ASSERT>,
                                             ACTUAL extends Iterable<? extends ELEMENT>,
                                             ELEMENT,
```

### RedundantSuppression
Redundant suppression
in `assertj-core/src/main/java/org/assertj/core/api/AbstractObjectAssert.java`
#### Snippet
```java
// suppression of deprecation works in Eclipse to hide warning for the deprecated classes in the imports
@SuppressWarnings("deprecation")
public abstract class AbstractObjectAssert<SELF extends AbstractObjectAssert<SELF, ACTUAL>, ACTUAL>
    extends AbstractAssert<SELF, ACTUAL> {

```

### RedundantSuppression
Redundant suppression
in `assertj-core/src/main/java/org/assertj/core/api/ObjectEnumerableAssert.java`
#### Snippet
```java
   */
  @SuppressWarnings("unchecked")
  SELF satisfiesOnlyOnce(Consumer<? super ELEMENT> requirements);

  /**
```

### RedundantSuppression
Redundant suppression
in `assertj-core/src/main/java/org/assertj/core/api/ObjectEnumerableAssert.java`
#### Snippet
```java
   */
  @SuppressWarnings("unchecked")
  SELF satisfiesOnlyOnce(ThrowingConsumer<? super ELEMENT> requirements);

  /**
```

## OptionalUsedAsFieldOrParameterType
### OptionalUsedAsFieldOrParameterType
`OptionalInt` used as type for parameter 'actual'
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOptionalIntAssert.java`
#### Snippet
```java
  Integers integers = Integers.instance();

  protected AbstractOptionalIntAssert(OptionalInt actual, Class<?> selfType) {
    super(actual, selfType);
  }
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for parameter 'actual'
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOptionalLongAssert.java`
#### Snippet
```java
    AbstractAssert<SELF, OptionalLong> {

  protected AbstractOptionalLongAssert(OptionalLong actual, Class<?> selfType) {
    super(actual, selfType);
  }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'actual'
in `assertj-core/src/main/java/org/assertj/core/api/OptionalAssert.java`
#### Snippet
```java
public class OptionalAssert<VALUE> extends AbstractOptionalAssert<OptionalAssert<VALUE>, VALUE> {

  protected OptionalAssert(Optional<VALUE> actual) {
	super(actual, OptionalAssert.class);
  }
```

### OptionalUsedAsFieldOrParameterType
`OptionalInt` used as type for parameter 'actual'
in `assertj-core/src/main/java/org/assertj/core/api/OptionalIntAssert.java`
#### Snippet
```java
public class OptionalIntAssert extends AbstractOptionalIntAssert<OptionalIntAssert> {

  protected OptionalIntAssert(OptionalInt actual) {
    super(actual, OptionalIntAssert.class);
  }
```

### OptionalUsedAsFieldOrParameterType
`OptionalDouble` used as type for parameter 'actual'
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOptionalDoubleAssert.java`
#### Snippet
```java
  Doubles doubles = Doubles.instance();

  protected AbstractOptionalDoubleAssert(OptionalDouble actual, Class<?> selfType) {
    super(actual, selfType);
  }
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for parameter 'actual'
in `assertj-core/src/main/java/org/assertj/core/api/Assumptions.java`
#### Snippet
```java
   * @since 3.9.0
   */
  public static OptionalLongAssert assumeThat(OptionalLong actual) {
    return asAssumption(OptionalLongAssert.class, OptionalLong.class, actual);
  }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'actual'
in `assertj-core/src/main/java/org/assertj/core/api/Assumptions.java`
#### Snippet
```java
   */
  @SuppressWarnings("unchecked")
  public static <VALUE> OptionalAssert<VALUE> assumeThat(Optional<VALUE> actual) {
    return asAssumption(OptionalAssert.class, Optional.class, actual);
  }
```

### OptionalUsedAsFieldOrParameterType
`OptionalInt` used as type for parameter 'actual'
in `assertj-core/src/main/java/org/assertj/core/api/Assumptions.java`
#### Snippet
```java
   * @since 3.9.0
   */
  public static OptionalIntAssert assumeThat(OptionalInt actual) {
    return asAssumption(OptionalIntAssert.class, OptionalInt.class, actual);
  }
```

### OptionalUsedAsFieldOrParameterType
`OptionalDouble` used as type for parameter 'actual'
in `assertj-core/src/main/java/org/assertj/core/api/Assumptions.java`
#### Snippet
```java
   * @since 3.9.0
   */
  public static OptionalDoubleAssert assumeThat(OptionalDouble actual) {
    return asAssumption(OptionalDoubleAssert.class, OptionalDouble.class, actual);
  }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'actual'
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOptionalAssert.java`
#### Snippet
```java
  private ComparisonStrategy optionalValueComparisonStrategy;

  protected AbstractOptionalAssert(Optional<VALUE> actual, Class<?> selfType) {
    super(actual, selfType);
    this.optionalValueComparisonStrategy = StandardComparisonStrategy.instance();
```

### OptionalUsedAsFieldOrParameterType
`OptionalDouble` used as type for parameter 'actual'
in `assertj-core/src/main/java/org/assertj/core/api/OptionalDoubleAssert.java`
#### Snippet
```java
public class OptionalDoubleAssert extends AbstractOptionalDoubleAssert<OptionalDoubleAssert> {

  protected OptionalDoubleAssert(OptionalDouble actual) {
    super(actual, OptionalDoubleAssert.class);
  }
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for parameter 'actual'
in `assertj-core/src/main/java/org/assertj/core/api/StandardSoftAssertionsProvider.java`
#### Snippet
```java
   * @return the created assertion object.
   */
  default OptionalLongAssert assertThat(OptionalLong actual) {
    return proxy(OptionalLongAssert.class, OptionalLong.class, actual);
  }
```

### OptionalUsedAsFieldOrParameterType
`OptionalInt` used as type for parameter 'actual'
in `assertj-core/src/main/java/org/assertj/core/api/StandardSoftAssertionsProvider.java`
#### Snippet
```java
   * @return the created assertion object.
   */
  default OptionalIntAssert assertThat(OptionalInt actual) {
    return proxy(OptionalIntAssert.class, OptionalInt.class, actual);
  }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'actual'
in `assertj-core/src/main/java/org/assertj/core/api/StandardSoftAssertionsProvider.java`
#### Snippet
```java
   */
  @SuppressWarnings("unchecked")
  default <VALUE> OptionalAssert<VALUE> assertThat(Optional<VALUE> actual) {
    return proxy(OptionalAssert.class, Optional.class, actual);
  }
```

### OptionalUsedAsFieldOrParameterType
`OptionalDouble` used as type for parameter 'actual'
in `assertj-core/src/main/java/org/assertj/core/api/StandardSoftAssertionsProvider.java`
#### Snippet
```java
   * @return the created assertion object.
   */
  default OptionalDoubleAssert assertThat(OptionalDouble actual) {
    return proxy(OptionalDoubleAssert.class, OptionalDouble.class, actual);
  }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'actual'
in `assertj-core/src/main/java/org/assertj/core/api/BDDSoftAssertionsProvider.java`
#### Snippet
```java
   */
  @SuppressWarnings("unchecked")
  default <VALUE> OptionalAssert<VALUE> then(Optional<VALUE> actual) {
    return proxy(OptionalAssert.class, Optional.class, actual);
  }
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for parameter 'actual'
in `assertj-core/src/main/java/org/assertj/core/api/BDDSoftAssertionsProvider.java`
#### Snippet
```java
   * @return the created assertion object.
   */
  default OptionalLongAssert then(OptionalLong actual) {
    return proxy(OptionalLongAssert.class, OptionalLong.class, actual);
  }
```

### OptionalUsedAsFieldOrParameterType
`OptionalInt` used as type for parameter 'actual'
in `assertj-core/src/main/java/org/assertj/core/api/BDDSoftAssertionsProvider.java`
#### Snippet
```java
   * @return the created assertion object.
   */
  default OptionalIntAssert then(OptionalInt actual) {
    return proxy(OptionalIntAssert.class, OptionalInt.class, actual);
  }
```

### OptionalUsedAsFieldOrParameterType
`OptionalDouble` used as type for parameter 'actual'
in `assertj-core/src/main/java/org/assertj/core/api/BDDSoftAssertionsProvider.java`
#### Snippet
```java
   * @return the created assertion object.
   */
  default OptionalDoubleAssert then(OptionalDouble actual) {
    return proxy(OptionalDoubleAssert.class, OptionalDouble.class, actual);
  }
```

### OptionalUsedAsFieldOrParameterType
`OptionalDouble` used as type for parameter 'actual'
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssumptions.java`
#### Snippet
```java
   * @since 3.14.0
   */
  public static OptionalDoubleAssert given(OptionalDouble actual) {
    return assumeThat(actual);
  }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'actual'
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssumptions.java`
#### Snippet
```java
   * @since 3.14.0
   */
  public static <VALUE> OptionalAssert<VALUE> given(Optional<VALUE> actual) {
    return assumeThat(actual);
  }
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for parameter 'actual'
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssumptions.java`
#### Snippet
```java
   * @since 3.14.0
   */
  public static OptionalLongAssert given(OptionalLong actual) {
    return assumeThat(actual);
  }
```

### OptionalUsedAsFieldOrParameterType
`OptionalInt` used as type for parameter 'actual'
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssumptions.java`
#### Snippet
```java
   * @since 3.14.0
   */
  public static OptionalIntAssert given(OptionalInt actual) {
    return assumeThat(actual);
  }
```

### OptionalUsedAsFieldOrParameterType
`OptionalDouble` used as type for parameter 'optionalDouble'
in `assertj-core/src/main/java/org/assertj/core/api/WithAssumptions.java`
#### Snippet
```java
   * @since 2.9.0 / 3.9.0
   */
  default OptionalDoubleAssert assumeThat(final OptionalDouble optionalDouble) {
    return Assumptions.assumeThat(optionalDouble);
  }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'optional'
in `assertj-core/src/main/java/org/assertj/core/api/WithAssumptions.java`
#### Snippet
```java
   * @since 3.9.0
   */
  default <VALUE> OptionalAssert<VALUE> assumeThat(final Optional<VALUE> optional) {
    return Assumptions.assumeThat(optional);
  }
```

### OptionalUsedAsFieldOrParameterType
`OptionalInt` used as type for parameter 'optionalInt'
in `assertj-core/src/main/java/org/assertj/core/api/WithAssumptions.java`
#### Snippet
```java
   * @since 2.9.0 / 3.9.0
   */
  default OptionalIntAssert assumeThat(final OptionalInt optionalInt) {
    return Assumptions.assumeThat(optionalInt);
  }
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for parameter 'optionalLong'
in `assertj-core/src/main/java/org/assertj/core/api/WithAssumptions.java`
#### Snippet
```java
   * @since 2.9.0 / 3.9.0
   */
  default OptionalLongAssert assumeThat(final OptionalLong optionalLong) {
    return Assumptions.assumeThat(optionalLong);
  }
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for parameter 'actual'
in `assertj-core/src/main/java/org/assertj/core/api/AssertionsForClassTypes.java`
#### Snippet
```java
   * @return the created assertion object.
   */
  public static OptionalLongAssert assertThat(OptionalLong actual) {
    return new OptionalLongAssert(actual);
  }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'actual'
in `assertj-core/src/main/java/org/assertj/core/api/AssertionsForClassTypes.java`
#### Snippet
```java
   * @return the created assertion object.
   */
  public static <VALUE> OptionalAssert<VALUE> assertThat(Optional<VALUE> actual) {
    return new OptionalAssert<>(actual);
  }
```

### OptionalUsedAsFieldOrParameterType
`OptionalInt` used as type for parameter 'actual'
in `assertj-core/src/main/java/org/assertj/core/api/AssertionsForClassTypes.java`
#### Snippet
```java
   * @return the created assertion object.
   */
  public static OptionalIntAssert assertThat(OptionalInt actual) {
    return new OptionalIntAssert(actual);
  }
```

### OptionalUsedAsFieldOrParameterType
`OptionalDouble` used as type for parameter 'actual'
in `assertj-core/src/main/java/org/assertj/core/api/AssertionsForClassTypes.java`
#### Snippet
```java
   * @return the created assertion object.
   */
  public static OptionalDoubleAssert assertThat(OptionalDouble actual) {
    return new OptionalDoubleAssert(actual);
  }
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for parameter 'actual'
in `assertj-core/src/main/java/org/assertj/core/api/OptionalLongAssert.java`
#### Snippet
```java
public class OptionalLongAssert extends AbstractOptionalLongAssert<OptionalLongAssert> {

  protected OptionalLongAssert(OptionalLong actual) {
    super(actual, OptionalLongAssert.class);
  }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'currentContext'
in `assertj-core/src/main/java/org/assertj/core/api/junit/jupiter/SoftlyExtension.java`
#### Snippet
```java
  }

  private static Optional<ExtensionContext> getParent(Optional<ExtensionContext> currentContext) {
    return currentContext.flatMap(ExtensionContext::getParent);
  }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'additionalInformation'
in `assertj-core/src/main/java/org/assertj/core/api/recursive/comparison/ComparisonDifference.java`
#### Snippet
```java
  final Object actual;
  final Object expected;
  final Optional<String> additionalInformation;
  final String template;

```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for parameter 'actual'
in `assertj-core/src/main/java/org/assertj/core/api/Assertions.java`
#### Snippet
```java
   * @return the created assertion object.
   */
  public static OptionalLongAssert assertThat(OptionalLong actual) {
    return AssertionsForClassTypes.assertThat(actual);
  }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'actual'
in `assertj-core/src/main/java/org/assertj/core/api/Assertions.java`
#### Snippet
```java
   * @return the created assertion object.
   */
  public static <VALUE> OptionalAssert<VALUE> assertThat(Optional<VALUE> actual) {
    return AssertionsForClassTypes.assertThat(actual);
  }
```

### OptionalUsedAsFieldOrParameterType
`OptionalDouble` used as type for parameter 'actual'
in `assertj-core/src/main/java/org/assertj/core/api/Assertions.java`
#### Snippet
```java
   * @return the created assertion object.
   */
  public static OptionalDoubleAssert assertThat(OptionalDouble actual) {
    return AssertionsForClassTypes.assertThat(actual);
  }
```

### OptionalUsedAsFieldOrParameterType
`OptionalInt` used as type for parameter 'actual'
in `assertj-core/src/main/java/org/assertj/core/api/Assertions.java`
#### Snippet
```java
   * @return the created assertion object.
   */
  public static OptionalIntAssert assertThat(OptionalInt actual) {
    return AssertionsForClassTypes.assertThat(actual);
  }
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for parameter 'optional'
in `assertj-core/src/main/java/org/assertj/core/error/OptionalShouldBeEmpty.java`
#### Snippet
```java
   * @return a error message factory.
   */
  public static OptionalShouldBeEmpty shouldBeEmpty(OptionalLong optional) {
    return new OptionalShouldBeEmpty(optional.getClass(), optional.getAsLong());
  }
```

### OptionalUsedAsFieldOrParameterType
`OptionalInt` used as type for parameter 'optional'
in `assertj-core/src/main/java/org/assertj/core/error/OptionalShouldBeEmpty.java`
#### Snippet
```java
   * @return a error message factory.
   */
  public static OptionalShouldBeEmpty shouldBeEmpty(OptionalInt optional) {
    return new OptionalShouldBeEmpty(optional.getClass(), optional.getAsInt());
  }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'optional'
in `assertj-core/src/main/java/org/assertj/core/error/OptionalShouldBeEmpty.java`
#### Snippet
```java
   * @return a error message factory.
   */
  public static <VALUE> OptionalShouldBeEmpty shouldBeEmpty(Optional<VALUE> optional) {
    return new OptionalShouldBeEmpty(optional.getClass(), optional.get());
  }
```

### OptionalUsedAsFieldOrParameterType
`OptionalDouble` used as type for parameter 'optional'
in `assertj-core/src/main/java/org/assertj/core/error/OptionalShouldBeEmpty.java`
#### Snippet
```java
   * @return a error message factory.
   */
  public static OptionalShouldBeEmpty shouldBeEmpty(OptionalDouble optional) {
    return new OptionalShouldBeEmpty(optional.getClass(), optional.getAsDouble());
  }
```

### OptionalUsedAsFieldOrParameterType
`OptionalDouble` used as type for parameter 'actual'
in `assertj-core/src/main/java/org/assertj/core/error/OptionalDoubleShouldHaveValueCloseToPercentage.java`
#### Snippet
```java
  }

  private OptionalDoubleShouldHaveValueCloseToPercentage(OptionalDouble actual, double expected, Percentage percentage,
                                                         double expectedPercentage) {
    super("%nExpecting actual:%n" +
```

### OptionalUsedAsFieldOrParameterType
`OptionalDouble` used as type for parameter 'optional'
in `assertj-core/src/main/java/org/assertj/core/error/OptionalDoubleShouldHaveValueCloseToPercentage.java`
#### Snippet
```java
   * @return an error message factory
   */
  public static OptionalDoubleShouldHaveValueCloseToPercentage shouldHaveValueCloseToPercentage(OptionalDouble optional,
                                                                                                double expectedValue,
                                                                                                Percentage percentage,
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for parameter 'optional'
in `assertj-core/src/main/java/org/assertj/core/error/OptionalShouldContain.java`
#### Snippet
```java
   * @return a error message factory
   */
  public static OptionalShouldContain shouldContain(OptionalLong optional, long expectedValue) {
    return optional.isPresent()
        ? new OptionalShouldContain(EXPECTING_TO_CONTAIN, optional, expectedValue)
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'optional'
in `assertj-core/src/main/java/org/assertj/core/error/OptionalShouldContain.java`
#### Snippet
```java
   * @return a error message factory
   */
  public static <VALUE> OptionalShouldContain shouldContainSame(Optional<VALUE> optional, VALUE expectedValue) {
    return optional.isPresent()
        ? new OptionalShouldContain(EXPECTING_TO_CONTAIN_SAME, optional, expectedValue)
```

### OptionalUsedAsFieldOrParameterType
`OptionalInt` used as type for parameter 'optional'
in `assertj-core/src/main/java/org/assertj/core/error/OptionalShouldContain.java`
#### Snippet
```java
   * @return a error message factory
   */
  public static OptionalShouldContain shouldContain(OptionalInt optional, int expectedValue) {
    return optional.isPresent()
        ? new OptionalShouldContain(EXPECTING_TO_CONTAIN, optional, expectedValue)
```

### OptionalUsedAsFieldOrParameterType
`OptionalDouble` used as type for parameter 'optional'
in `assertj-core/src/main/java/org/assertj/core/error/OptionalShouldContain.java`
#### Snippet
```java
   * @return a error message factory
   */
  public static OptionalShouldContain shouldContain(OptionalDouble optional, double expectedValue) {
    return optional.isPresent()
        ? new OptionalShouldContain(EXPECTING_TO_CONTAIN, optional, expectedValue)
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'optional'
in `assertj-core/src/main/java/org/assertj/core/error/OptionalShouldContain.java`
#### Snippet
```java
   * @return a error message factory
   */
  public static <VALUE> OptionalShouldContain shouldContain(Optional<VALUE> optional, VALUE expectedValue) {
    return optional.isPresent()
        ? new OptionalShouldContain(EXPECTING_TO_CONTAIN, optional, expectedValue)
```

### OptionalUsedAsFieldOrParameterType
`OptionalInt` used as type for parameter 'optional'
in `assertj-core/src/main/java/org/assertj/core/api/WithAssertions.java`
#### Snippet
```java
   * @return the created assertion object.
   */
  default OptionalIntAssert assertThat(final OptionalInt optional) {
    return Assertions.assertThat(optional);
  }
```

### OptionalUsedAsFieldOrParameterType
`OptionalDouble` used as type for parameter 'optional'
in `assertj-core/src/main/java/org/assertj/core/api/WithAssertions.java`
#### Snippet
```java
   * @return the created assertion object.
   */
  default OptionalDoubleAssert assertThat(final OptionalDouble optional) {
    return Assertions.assertThat(optional);
  }
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for parameter 'optional'
in `assertj-core/src/main/java/org/assertj/core/api/WithAssertions.java`
#### Snippet
```java
   * @return the created assertion object.
   */
  default OptionalLongAssert assertThat(final OptionalLong optional) {
    return Assertions.assertThat(optional);
  }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'optional'
in `assertj-core/src/main/java/org/assertj/core/api/WithAssertions.java`
#### Snippet
```java
   * @return the created assertion object.
   */
  default <VALUE> OptionalAssert<VALUE> assertThat(final Optional<VALUE> optional) {
    return Assertions.assertThat(optional);
  }
```

### OptionalUsedAsFieldOrParameterType
`OptionalDouble` used as type for parameter 'actual'
in `assertj-core/src/main/java/org/assertj/core/error/OptionalDoubleShouldHaveValueCloseToOffset.java`
#### Snippet
```java
public class OptionalDoubleShouldHaveValueCloseToOffset extends BasicErrorMessageFactory {

  private OptionalDoubleShouldHaveValueCloseToOffset(OptionalDouble actual, double expected, Offset<Double> offset,
                                                     double difference) {
    super("%nExpecting actual:%n  %s%nto be close to:%n  %s%n" +
```

### OptionalUsedAsFieldOrParameterType
`OptionalDouble` used as type for parameter 'optional'
in `assertj-core/src/main/java/org/assertj/core/error/OptionalDoubleShouldHaveValueCloseToOffset.java`
#### Snippet
```java
   * @return a error message factory
   */
  public static OptionalDoubleShouldHaveValueCloseToOffset shouldHaveValueCloseToOffset(OptionalDouble optional,
                                                                                        double expectedValue,
                                                                                        Offset<Double> offset,
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for parameter 'optional'
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * @return the created assertion object.
   */
  public static OptionalLongAssert then(OptionalLong optional) {
    return assertThat(optional);
  }
```

### OptionalUsedAsFieldOrParameterType
`OptionalDouble` used as type for parameter 'optional'
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * @return the created assertion object.
   */
  public static OptionalDoubleAssert then(OptionalDouble optional) {
    return assertThat(optional);
  }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'optional'
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * @return the created assertion object.
   */
  public static <VALUE> OptionalAssert<VALUE> then(Optional<VALUE> optional) {
    return assertThat(optional);
  }
```

### OptionalUsedAsFieldOrParameterType
`OptionalInt` used as type for parameter 'optional'
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * @return the created assertion object.
   */
  public static OptionalIntAssert then(OptionalInt optional) {
    return assertThat(optional);
  }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'description'
in `assertj-core/src/main/java/org/assertj/core/internal/DeepDifference.java`
#### Snippet
```java
    Object actual;
    Object other;
    Optional<String> description;

    public Difference(List<String> path, Object actual, Object other) {
```

## SystemOutErr
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `assertj-core/src/main/java/org/assertj/core/api/AbstractAssert.java`
#### Snippet
```java
  private void printDescriptionText() {
    String descriptionText = info.descriptionText();
    if (!descriptionText.isEmpty()) System.out.println(descriptionText);
  }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `assertj-core/src/main/java/org/assertj/core/util/Files.java`
#### Snippet
```java
    if (file.isFile()) {
      if (!file.delete()) {
        System.out.println("Fail to delete " + file);
      }
      return;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `assertj-core/src/main/java/org/assertj/core/util/Files.java`
#### Snippet
```java
    }
    if (!file.delete()) {
      System.out.println("Fail to delete " + file);
    }
  }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `assertj-core/src/main/java/org/assertj/core/internal/Failures.java`
#### Snippet
```java

  public void printThreadDumpIfNeeded() {
    if (printThreadDump) System.err.println(threadDumpDescription());
  }

```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `assertj-core/src/main/java/org/assertj/core/configuration/Services.java`
#### Snippet
```java
    if (services.hasNext()) {
      result = defaultValue;
      System.err.println(format("Found multiple implementations for the service provider %s. Using the default: %s",
                                serviceType, result.getClass()));
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `assertj-core/src/main/java/org/assertj/core/configuration/ConfigurationProvider.java`
#### Snippet
```java
      // registered representations are only used if the configuration representation
      if (representations.size() == 1) {
        System.out.println(format("AssertJ has found one registered representation: %s, AssertJ will use it first and then fall back to standard representation if it returned a null representation of the value to display.",
                                  representations.get(0)));
      } else if (representations.size() > 1) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `assertj-core/src/main/java/org/assertj/core/configuration/ConfigurationProvider.java`
#### Snippet
```java
                                  representations.get(0)));
      } else if (representations.size() > 1) {
        System.out.println(format("AssertJ has found %s registered representations, AssertJ will use them first and then fall back to standard representation if they returned a null representation of the value to display, the order (by highest priority first) of use will be: %s",
                                  representations.size(), compositeRepresentation.getAllRepresentationsOrderedByPriority()));
      }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `assertj-core/src/main/java/org/assertj/core/configuration/ConfigurationProvider.java`
#### Snippet
```java
      }
    } else if (!representations.isEmpty()) {
      System.out.println(format("AssertJ has found these representations %s in the classpath but they won't be used as the loaded configuration has specified a custom representation which takes precedence over representations loaded with the java ServiceLoader: %s",
                                representations, representation()));
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `assertj-core/src/main/java/org/assertj/core/configuration/Configuration.java`
#### Snippet
```java
  public void applyAndDisplay() {
    apply();
    System.out.println(describe());
  }

```

## DynamicRegexReplaceableByCompiledPattern
### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `assertj-core/src/main/java/org/assertj/core/api/recursive/comparison/ComparisonDifference.java`
#### Snippet
```java
  protected String fieldPathDescription() {
    if (concatenatedPath.isEmpty()) return TOP_LEVEL_OBJECTS;
    if (concatenatedPath.matches(TOP_LEVEL_ELEMENT_PATTERN)) return format(TOP_LEVEL_ELEMENTS, extractIndex(concatenatedPath));
    return format(FIELD, concatenatedPath);
  }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `assertj-core/src/main/java/org/assertj/core/api/recursive/comparison/ComparisonDifference.java`
#### Snippet
```java
    String index = path.substring(1);
    // index = 12
    return index.replaceFirst("\\]", "");
  }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `assertj-core/src/main/java/org/assertj/core/api/recursive/comparison/ComparisonDifference.java`
#### Snippet
```java
    String concatenatedPath = join(".", decomposedPath);
    // remove the . from array/list index, so person.children.[2].name -> person.children[2].name
    return concatenatedPath.replaceAll("\\.\\[", "[");
  }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `assertj-core/src/main/java/org/assertj/core/internal/Strings.java`
#### Snippet
```java
      return null;
    }
    return normalizeWhitespace(toNormalize.toString().replaceAll(PUNCTUATION_REGEX, EMPTY_STRING));
  }

```

## UnnecessaryFullyQualifiedName
### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/ClassAssert.java`
#### Snippet
```java
 * Assertion methods for {@code Class}es.
 * <p>
 * To create a new instance of this class, invoke <code>{@link org.assertj.core.api.Assertions#assertThat(Class)}</code>
 * </p>
 * 
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOptionalIntAssert.java`
#### Snippet
```java

  /**
   * Verifies that the actual {@link java.util.OptionalInt} has the value in argument.
   * <p>
   * Assertion will pass :
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOptionalIntAssert.java`
#### Snippet
```java
   * assertThat(OptionalInt.of(7)).hasValue(8);</code></pre>
   *
   * @param expectedValue the expected value inside the {@link java.util.OptionalInt}.
   * @return this assertion object.
   * @throws AssertionError if actual value is empty.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOptionalIntAssert.java`
#### Snippet
```java

  /**
   * Verifies that there is a value present in the actual {@link java.util.OptionalInt}, it's an alias of {@link #isPresent()}.
   * <p>
   * Assertion will pass :
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOptionalIntAssert.java`
#### Snippet
```java

  /**
   * Verifies that the actual {@link java.util.OptionalInt} is empty (alias of {@link #isEmpty()}).
   * <p>
   * Assertion will pass :
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOptionalIntAssert.java`
#### Snippet
```java

/**
 * Assertions for {@link java.util.OptionalInt}.
 *
 * @author Jean-Christophe Gay
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOptionalIntAssert.java`
#### Snippet
```java
  
  /**
   * Verifies that the actual {@link java.util.OptionalInt} is empty.
   * <p>
   * Assertion will pass :
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOptionalIntAssert.java`
#### Snippet
```java

  /**
   * Verifies that there is a value present in the actual {@link java.util.OptionalInt}.
   * <p>
   * Assertion will pass :
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOptionalLongAssert.java`
#### Snippet
```java

/**
 * Assertions for {@link java.util.OptionalLong}.
 *
 * @author Jean-Christophe Gay
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOptionalLongAssert.java`
#### Snippet
```java

  /**
   * Verifies that the actual {@link java.util.OptionalLong} has the value in argument.
   * <p>
   * Assertion will pass :
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOptionalLongAssert.java`
#### Snippet
```java
   * assertThat(OptionalLong.of(7)).hasValue(8);</code></pre>
   *
   * @param expectedValue the expected value inside the {@link java.util.OptionalLong}.
   * @return this assertion object.
   * @throws AssertionError if actual value is empty.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOptionalLongAssert.java`
#### Snippet
```java

  /**
   * Verifies that there is a value present in the actual {@link java.util.OptionalLong}, it's an alias of {@link #isPresent()}.
   * <p>
   * Assertion will pass :
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOptionalLongAssert.java`
#### Snippet
```java

  /**
   * Verifies that the actual {@link java.util.OptionalLong} is empty.
   * <p>
   * Assertion will pass :
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOptionalLongAssert.java`
#### Snippet
```java

  /**
   * Verifies that there is a value present in the actual {@link java.util.OptionalLong}.
   * <p>
   * Assertion will pass :
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOptionalLongAssert.java`
#### Snippet
```java

  /**
   * Verifies that the actual {@link java.util.OptionalLong} is empty (alias of {@link #isEmpty()}).
   * <p>
   * Assertion will pass :
```

### UnnecessaryFullyQualifiedName
Qualifier `java.net` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/UrlAssert.java`
#### Snippet
```java

/**
 * Assertion class for {@link java.net.URL}s
 */
public class UrlAssert extends AbstractUrlAssert<UrlAssert> {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetDateTimeAssert.java`
#### Snippet
```java

  /**
   * Same assertion as {@link #isEqualTo(Object)} (where Object is expected to be {@link java.time.OffsetDateTime}) but
   * here you
   * pass {@link java.time.OffsetDateTime} String representation that must follow <a href=
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetDateTimeAssert.java`
#### Snippet
```java
   * Same assertion as {@link #isEqualTo(Object)} (where Object is expected to be {@link java.time.OffsetDateTime}) but
   * here you
   * pass {@link java.time.OffsetDateTime} String representation that must follow <a href=
   * "http://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html#ISO_OFFSET_DATE_TIME"
   * >ISO OffsetDateTime format</a> to allow calling {@link java.time.OffsetDateTime#parse(CharSequence)} method.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetDateTimeAssert.java`
#### Snippet
```java
   * pass {@link java.time.OffsetDateTime} String representation that must follow <a href=
   * "http://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html#ISO_OFFSET_DATE_TIME"
   * >ISO OffsetDateTime format</a> to allow calling {@link java.time.OffsetDateTime#parse(CharSequence)} method.
   * <p>
   * <b>Breaking change</b> since 3.15.0 The default comparator uses {@link OffsetDateTime#timeLineOrder()}
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetDateTimeAssert.java`
#### Snippet
```java
   *                                    .isEqualTo("2000-01-01T01:00:00+01:00");</code></pre>
   *
   * @param dateTimeAsString String representing a {@link java.time.OffsetDateTime}.
   * @return this assertion object.
   * @throws AssertionError if the actual {@code OffsetDateTime} is {@code null}.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetDateTimeAssert.java`
#### Snippet
```java
   * @throws AssertionError if the actual {@code OffsetDateTime} is {@code null}.
   * @throws IllegalArgumentException if given String is null or can't be converted to a
   *           {@link java.time.OffsetDateTime}.
   * @throws AssertionError if the actual {@code OffsetDateTime} is not equal to the {@link java.time.OffsetDateTime}
   *           built from given String.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetDateTimeAssert.java`
#### Snippet
```java
   * @throws IllegalArgumentException if given String is null or can't be converted to a
   *           {@link java.time.OffsetDateTime}.
   * @throws AssertionError if the actual {@code OffsetDateTime} is not equal to the {@link java.time.OffsetDateTime}
   *           built from given String.
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetDateTimeAssert.java`
#### Snippet
```java

  /**
   * Same assertion as {@link #isNotIn(Object...)} (where Objects are expected to be {@link java.time.OffsetDateTime})
   * but here you
   * pass {@link java.time.OffsetDateTime} String representations that must follow <a href=
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetDateTimeAssert.java`
#### Snippet
```java
   * Same assertion as {@link #isNotIn(Object...)} (where Objects are expected to be {@link java.time.OffsetDateTime})
   * but here you
   * pass {@link java.time.OffsetDateTime} String representations that must follow <a href=
   * "http://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html#ISO_OFFSET_DATE_TIME"
   * >ISO OffsetDateTime format</a> to allow calling {@link java.time.OffsetDateTime#parse(CharSequence)} method.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetDateTimeAssert.java`
#### Snippet
```java
   * pass {@link java.time.OffsetDateTime} String representations that must follow <a href=
   * "http://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html#ISO_OFFSET_DATE_TIME"
   * >ISO OffsetDateTime format</a> to allow calling {@link java.time.OffsetDateTime#parse(CharSequence)} method.
   * <p>
   * Example :
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetDateTimeAssert.java`
#### Snippet
```java
   *                                                   "2000-01-02T00:00:00Z");</code></pre>
   *
   * @param dateTimesAsString Array of String representing a {@link java.time.OffsetDateTime}.
   * @return this assertion object.
   * @throws AssertionError if the actual {@code OffsetDateTime} is {@code null}.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetDateTimeAssert.java`
#### Snippet
```java
   * @throws AssertionError if the actual {@code OffsetDateTime} is {@code null}.
   * @throws IllegalArgumentException if given String is null or can't be converted to a
   *           {@link java.time.OffsetDateTime}.
   * @throws AssertionError if the actual {@code OffsetDateTime} is in the {@link java.time.OffsetDateTime}s built from
   *           given Strings.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetDateTimeAssert.java`
#### Snippet
```java
   * @throws IllegalArgumentException if given String is null or can't be converted to a
   *           {@link java.time.OffsetDateTime}.
   * @throws AssertionError if the actual {@code OffsetDateTime} is in the {@link java.time.OffsetDateTime}s built from
   *           given Strings.
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetDateTimeAssert.java`
#### Snippet
```java

  /**
   * Same assertion as {@link #isBeforeOrEqualTo(java.time.OffsetDateTime)} but the {@link java.time.OffsetDateTime} is
   * built from given
   * String, which must follow <a href=
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetDateTimeAssert.java`
#### Snippet
```java

  /**
   * Same assertion as {@link #isBeforeOrEqualTo(java.time.OffsetDateTime)} but the {@link java.time.OffsetDateTime} is
   * built from given
   * String, which must follow <a href=
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetDateTimeAssert.java`
#### Snippet
```java
   * String, which must follow <a href=
   * "http://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html#ISO_OFFSET_DATE_TIME"
   * >ISO OffsetDateTime format</a> to allow calling {@link java.time.OffsetDateTime#parse(CharSequence)} method.
   * <p>
   * <b>Breaking change</b> since 3.15.0 The default comparator uses {@link OffsetDateTime#timeLineOrder()}
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetDateTimeAssert.java`
#### Snippet
```java
   *                                          .isBeforeOrEqualTo("2000-01-01T00:00:00-01:00"); </code></pre>
   *
   * @param offsetDateTimeAsString String representing a {@link java.time.OffsetDateTime}.
   * @return this assertion object.
   * @throws AssertionError if the actual {@code OffsetDateTime} is {@code null}.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetDateTimeAssert.java`
#### Snippet
```java
   * @throws AssertionError if the actual {@code OffsetDateTime} is {@code null}.
   * @throws IllegalArgumentException if given String is null or can't be converted to a
   *           {@link java.time.OffsetDateTime}.
   * @throws AssertionError if the actual {@code OffsetDateTime} is not before or equals to the
   *           {@link java.time.OffsetDateTime} built from given String.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetDateTimeAssert.java`
#### Snippet
```java
   *           {@link java.time.OffsetDateTime}.
   * @throws AssertionError if the actual {@code OffsetDateTime} is not before or equals to the
   *           {@link java.time.OffsetDateTime} built from given String.
   */
  public SELF isBeforeOrEqualTo(String offsetDateTimeAsString) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetDateTimeAssert.java`
#### Snippet
```java

/**
 * Assertions for {@link java.time.OffsetDateTime} type from new Date &amp; Time API introduced in Java 8.
 *
 * @param <SELF> the "self" type of this assertion class.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetDateTimeAssert.java`
#### Snippet
```java

  /**
   * Verifies that actual and given {@link java.time.OffsetDateTime} have same year, month, day, hour and minute fields
   * (second and
   * nanosecond fields are ignored in comparison).
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetDateTimeAssert.java`
#### Snippet
```java
   * assertThat(OffsetDateTimeA).isEqualToIgnoringSeconds(OffsetDateTimeB);</code></pre>
   *
   * @param other the given {@link java.time.OffsetDateTime}.
   * @return this assertion object.
   * @throws AssertionError if the actual {@code OffsetDateTime} is {@code null}.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetDateTimeAssert.java`
#### Snippet
```java

  /**
   * Same assertion as {@link #isAfter(java.time.OffsetDateTime)} but the {@link java.time.OffsetDateTime} is built from
   * given a String that
   * must follow <a href=
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetDateTimeAssert.java`
#### Snippet
```java

  /**
   * Same assertion as {@link #isAfter(java.time.OffsetDateTime)} but the {@link java.time.OffsetDateTime} is built from
   * given a String that
   * must follow <a href=
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetDateTimeAssert.java`
#### Snippet
```java
   * must follow <a href=
   * "http://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html#ISO_OFFSET_DATE_TIME"
   * >ISO OffsetDateTime format</a> to allow calling {@link java.time.OffsetDateTime#parse(CharSequence)} method.
   * <p>
   * <b>Breaking change</b> since 3.15.0 The default comparator uses {@link OffsetDateTime#timeLineOrder()}
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetDateTimeAssert.java`
#### Snippet
```java
   *                                          .isAfter("2000-01-01T00:00:00-01:00");</code></pre>
   *
   * @param offsetDateTimeAsString String representing a {@link java.time.OffsetDateTime}.
   * @return this assertion object.
   * @throws AssertionError if the actual {@code OffsetDateTime} is {@code null}.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetDateTimeAssert.java`
#### Snippet
```java
   * @throws AssertionError if the actual {@code OffsetDateTime} is {@code null}.
   * @throws IllegalArgumentException if given String is null or can't be converted to a
   *           {@link java.time.OffsetDateTime}.
   * @throws AssertionError if the actual {@code OffsetDateTime} is not strictly after the
   *           {@link java.time.OffsetDateTime} built from given String.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetDateTimeAssert.java`
#### Snippet
```java
   *           {@link java.time.OffsetDateTime}.
   * @throws AssertionError if the actual {@code OffsetDateTime} is not strictly after the
   *           {@link java.time.OffsetDateTime} built from given String.
   */
  public SELF isAfter(String offsetDateTimeAsString) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetDateTimeAssert.java`
#### Snippet
```java
   * assertThat(OffsetDateTimeA).isEqualToIgnoringNanos(OffsetDateTimeB);</code></pre>
   *
   * @param other the given {@link java.time.OffsetDateTime}.
   * @return this assertion object.
   * @throws AssertionError if the actual {@code OffsetDateTime} is {@code null}.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetDateTimeAssert.java`
#### Snippet
```java
   *                                          .isAfterOrEqualTo(parse("2000-01-01T01:00:00+01:00"));</code></pre>
   *
   * @param other the given {@link java.time.OffsetDateTime}.
   * @return this assertion object.
   * @throws AssertionError if the actual {@code OffsetDateTime} is {@code null}.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetDateTimeAssert.java`
#### Snippet
```java

  /**
   * Check that the {@link java.time.OffsetDateTime} to compare actual {@link java.time.OffsetDateTime} to is not null,
   * in that case throws a {@link IllegalArgumentException} with an explicit message
   *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetDateTimeAssert.java`
#### Snippet
```java

  /**
   * Check that the {@link java.time.OffsetDateTime} to compare actual {@link java.time.OffsetDateTime} to is not null,
   * in that case throws a {@link IllegalArgumentException} with an explicit message
   *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetDateTimeAssert.java`
#### Snippet
```java
   * in that case throws a {@link IllegalArgumentException} with an explicit message
   *
   * @param other the {@link java.time.OffsetDateTime} to check
   * @throws IllegalArgumentException with an explicit message if the given {@link java.time.OffsetDateTime} is null
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetDateTimeAssert.java`
#### Snippet
```java
   *
   * @param other the {@link java.time.OffsetDateTime} to check
   * @throws IllegalArgumentException with an explicit message if the given {@link java.time.OffsetDateTime} is null
   */
  private static void assertOffsetDateTimeParameterIsNotNull(OffsetDateTime other) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetDateTimeAssert.java`
#### Snippet
```java

  /**
   * Creates a new <code>{@link org.assertj.core.api.AbstractOffsetDateTimeAssert}</code>.
   *
   * @param selfType the "self type"
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetDateTimeAssert.java`
#### Snippet
```java
   * assertThat(OffsetDateTimeA).isEqualToIgnoringHours(OffsetDateTimeB);</code></pre>
   *
   * @param other the given {@link java.time.OffsetDateTime}.
   * @return this assertion object.
   * @throws AssertionError if the actual {@code OffsetDateTime} is {@code null}.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetDateTimeAssert.java`
#### Snippet
```java

  /**
   * Same assertion as {@link #isBefore(java.time.OffsetDateTime)} but the {@link java.time.OffsetDateTime} is built
   * from given String, which
   * must follow <a href=
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetDateTimeAssert.java`
#### Snippet
```java

  /**
   * Same assertion as {@link #isBefore(java.time.OffsetDateTime)} but the {@link java.time.OffsetDateTime} is built
   * from given String, which
   * must follow <a href=
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetDateTimeAssert.java`
#### Snippet
```java
   * must follow <a href=
   * "http://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html#ISO_OFFSET_DATE_TIME"
   * >ISO OffsetDateTime format</a> to allow calling {@link java.time.OffsetDateTime#parse(CharSequence)} method.
   * <p>
   * <b>Breaking change</b> since 3.15.0 The default comparator uses {@link OffsetDateTime#timeLineOrder()}
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/OptionalAssert.java`
#### Snippet
```java

/**
 * Assertions for {@link java.util.Optional}.
 *
 * @param <VALUE> type of the value contained in the {@link java.util.Optional}.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetDateTimeAssert.java`
#### Snippet
```java
   *                                          .isBefore("2000-01-02T01:00:00+01:00"); </code></pre>
   *
   * @param offsetDateTimeAsString String representing a {@link java.time.OffsetDateTime}.
   * @return this assertion object.
   * @throws AssertionError if the actual {@code OffsetDateTime} is {@code null}.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/OptionalAssert.java`
#### Snippet
```java
 * Assertions for {@link java.util.Optional}.
 *
 * @param <VALUE> type of the value contained in the {@link java.util.Optional}.
 * @author Jean-Christophe Gay
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetDateTimeAssert.java`
#### Snippet
```java
   * @throws AssertionError if the actual {@code OffsetDateTime} is {@code null}.
   * @throws IllegalArgumentException if given String is null or can't be converted to a
   *           {@link java.time.OffsetDateTime}.
   * @throws AssertionError if the actual {@code OffsetDateTime} is not strictly before the
   *           {@link java.time.OffsetDateTime} built
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetDateTimeAssert.java`
#### Snippet
```java
   *           {@link java.time.OffsetDateTime}.
   * @throws AssertionError if the actual {@code OffsetDateTime} is not strictly before the
   *           {@link java.time.OffsetDateTime} built
   *           from given String.
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetDateTimeAssert.java`
#### Snippet
```java
   * assertThat(OffsetDateTimeA).isEqualToIgnoringMinutes(OffsetDateTimeB);</code></pre>
   *
   * @param other the given {@link java.time.OffsetDateTime}.
   * @return this assertion object.
   * @throws AssertionError if the actual {@code OffsetDateTime} is {@code null}.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetDateTimeAssert.java`
#### Snippet
```java

  /**
   * Same assertion as {@link #isNotEqualTo(Object)} (where Object is expected to be {@link java.time.OffsetDateTime})
   * but here you
   * pass {@link java.time.OffsetDateTime} String representation that must follow <a href=
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetDateTimeAssert.java`
#### Snippet
```java
   * Same assertion as {@link #isNotEqualTo(Object)} (where Object is expected to be {@link java.time.OffsetDateTime})
   * but here you
   * pass {@link java.time.OffsetDateTime} String representation that must follow <a href=
   * "http://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html#ISO_OFFSET_DATE_TIME"
   * >ISO OffsetDateTime format</a> to allow calling {@link java.time.OffsetDateTime#parse(CharSequence)} method.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetDateTimeAssert.java`
#### Snippet
```java
   * pass {@link java.time.OffsetDateTime} String representation that must follow <a href=
   * "http://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html#ISO_OFFSET_DATE_TIME"
   * >ISO OffsetDateTime format</a> to allow calling {@link java.time.OffsetDateTime#parse(CharSequence)} method.
   * <p>
   * <b>Breaking change</b> since 3.15.0 The default comparator uses {@link OffsetDateTime#timeLineOrder()}
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetDateTimeAssert.java`
#### Snippet
```java
   * assertThat(parse("2000-01-01T00:00:00Z")).isNotEqualTo("2000-01-01T02:00:00+02:00");</code></pre>
   *
   * @param dateTimeAsString String representing a {@link java.time.OffsetDateTime}.
   * @return this assertion object.
   * @throws AssertionError if the actual {@code OffsetDateTime} is {@code null}.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetDateTimeAssert.java`
#### Snippet
```java
   * @throws AssertionError if the actual {@code OffsetDateTime} is {@code null}.
   * @throws IllegalArgumentException if given String is null or can't be converted to a
   *           {@link java.time.OffsetDateTime}.
   * @throws AssertionError if the actual {@code OffsetDateTime} is equal to the {@link java.time.OffsetDateTime} built
   *           from given String.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetDateTimeAssert.java`
#### Snippet
```java
   * @throws IllegalArgumentException if given String is null or can't be converted to a
   *           {@link java.time.OffsetDateTime}.
   * @throws AssertionError if the actual {@code OffsetDateTime} is equal to the {@link java.time.OffsetDateTime} built
   *           from given String.
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetDateTimeAssert.java`
#### Snippet
```java
   * assertThat(OffsetDateTimeA).isEqualToIgnoringTimezone(OffsetDateTimeB);</code></pre>
   *
   * @param other the given {@link java.time.OffsetDateTime}.
   * @return this assertion object.
   * @throws AssertionError if the actual {@code OffsetDateTime} is {@code null}.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetDateTimeAssert.java`
#### Snippet
```java
   *                                          .isBefore(parse("2000-01-02T01:00:00+01:00")); </code></pre>
   *
   * @param other the given {@link java.time.OffsetDateTime}.
   * @return this assertion object.
   * @throws AssertionError if the actual {@code OffsetDateTime} is {@code null}.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetDateTimeAssert.java`
#### Snippet
```java
   *                                          .isBeforeOrEqualTo(parse("2000-01-01T00:00:00-01:00")); </code></pre>
   *
   * @param other the given {@link java.time.OffsetDateTime}.
   * @return this assertion object.
   * @throws AssertionError if the actual {@code OffsetDateTime} is {@code null}.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetDateTimeAssert.java`
#### Snippet
```java

  /**
   * Same assertion as {@link #isIn(Object...)} (where Objects are expected to be {@link java.time.OffsetDateTime}) but
   * here you
   * pass {@link java.time.OffsetDateTime} String representations that must follow <a href=
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetDateTimeAssert.java`
#### Snippet
```java
   * Same assertion as {@link #isIn(Object...)} (where Objects are expected to be {@link java.time.OffsetDateTime}) but
   * here you
   * pass {@link java.time.OffsetDateTime} String representations that must follow <a href=
   * "http://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html#ISO_OFFSET_DATE_TIME"
   * >ISO OffsetDateTime format</a> to allow calling {@link java.time.OffsetDateTime#parse(CharSequence)} method.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetDateTimeAssert.java`
#### Snippet
```java
   * pass {@link java.time.OffsetDateTime} String representations that must follow <a href=
   * "http://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html#ISO_OFFSET_DATE_TIME"
   * >ISO OffsetDateTime format</a> to allow calling {@link java.time.OffsetDateTime#parse(CharSequence)} method.
   * <p>
   * Example :
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetDateTimeAssert.java`
#### Snippet
```java
   *                                                "2000-01-01T00:00:00Z");</code></pre>
   *
   * @param dateTimesAsString String array representing {@link java.time.OffsetDateTime}s.
   * @return this assertion object.
   * @throws AssertionError if the actual {@code OffsetDateTime} is {@code null}.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetDateTimeAssert.java`
#### Snippet
```java
   * @throws AssertionError if the actual {@code OffsetDateTime} is {@code null}.
   * @throws IllegalArgumentException if given String is null or can't be converted to a
   *           {@link java.time.OffsetDateTime}.
   * @throws AssertionError if the actual {@code OffsetDateTime} is not in the {@link java.time.OffsetDateTime}s built
   *           from given Strings.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetDateTimeAssert.java`
#### Snippet
```java
   * @throws IllegalArgumentException if given String is null or can't be converted to a
   *           {@link java.time.OffsetDateTime}.
   * @throws AssertionError if the actual {@code OffsetDateTime} is not in the {@link java.time.OffsetDateTime}s built
   *           from given Strings.
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetDateTimeAssert.java`
#### Snippet
```java

  /**
   * Check that the {@link java.time.OffsetDateTime} string representation to compare actual
   * {@link java.time.OffsetDateTime} to is not null,
   * otherwise throws a {@link IllegalArgumentException} with an explicit message
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetDateTimeAssert.java`
#### Snippet
```java
  /**
   * Check that the {@link java.time.OffsetDateTime} string representation to compare actual
   * {@link java.time.OffsetDateTime} to is not null,
   * otherwise throws a {@link IllegalArgumentException} with an explicit message
   *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetDateTimeAssert.java`
#### Snippet
```java
   * otherwise throws a {@link IllegalArgumentException} with an explicit message
   *
   * @param offsetDateTimeAsString String representing the {@link java.time.OffsetDateTime} to compare actual with
   * @throws IllegalArgumentException with an explicit message if the given {@link String} is null
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetDateTimeAssert.java`
#### Snippet
```java

  /**
   * Same assertion as {@link #isAfterOrEqualTo(java.time.OffsetDateTime)} but the {@link java.time.OffsetDateTime} is
   * built from given
   * String, which must follow <a href=
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetDateTimeAssert.java`
#### Snippet
```java

  /**
   * Same assertion as {@link #isAfterOrEqualTo(java.time.OffsetDateTime)} but the {@link java.time.OffsetDateTime} is
   * built from given
   * String, which must follow <a href=
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetDateTimeAssert.java`
#### Snippet
```java
   * String, which must follow <a href=
   * "http://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html#ISO_OFFSET_DATE_TIME"
   * >ISO OffsetDateTime format</a> to allow calling {@link java.time.OffsetDateTime#parse(CharSequence)} method.
   * <p>
   * <b>Breaking change</b> since 3.15.0 The default comparator uses {@link OffsetDateTime#timeLineOrder()}
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetDateTimeAssert.java`
#### Snippet
```java
   *                                          .isAfterOrEqualTo("2000-01-01T01:00:00+01:00");</code></pre>
   *
   * @param offsetDateTimeAsString String representing a {@link java.time.OffsetDateTime}.
   * @return this assertion object.
   * @throws AssertionError if the actual {@code OffsetDateTime} is {@code null}.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetDateTimeAssert.java`
#### Snippet
```java
   * @throws AssertionError if the actual {@code OffsetDateTime} is {@code null}.
   * @throws IllegalArgumentException if given String is null or can't be converted to a
   *           {@link java.time.OffsetDateTime}.
   * @throws AssertionError if the actual {@code OffsetDateTime} is not after or equals to the
   *           {@link java.time.OffsetDateTime} built from given String.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetDateTimeAssert.java`
#### Snippet
```java
   *           {@link java.time.OffsetDateTime}.
   * @throws AssertionError if the actual {@code OffsetDateTime} is not after or equals to the
   *           {@link java.time.OffsetDateTime} built from given String.
   */
  public SELF isAfterOrEqualTo(String offsetDateTimeAsString) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetDateTimeAssert.java`
#### Snippet
```java
   *                                          .isAfter(parse("2000-01-01T00:00:00-01:00"));</code></pre>
   *
   * @param other the given {@link java.time.OffsetDateTime}.
   * @return this assertion object.
   * @throws AssertionError if the actual {@code OffsetDateTime} is {@code null}.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractDurationAssert.java`
#### Snippet
```java

  /**
   * Creates a new <code>{@link org.assertj.core.api.AbstractDurationAssert}</code>
   * @param duration the actual value to verify
   * @param selfType the "self type"
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractInstantAssert.java`
#### Snippet
```java

  /**
   * Creates a new <code>{@link org.assertj.core.api.AbstractInstantAssert}</code>.
   *
   * @param selfType the "self type"
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/OffsetTimeAssert.java`
#### Snippet
```java

  /**
   * Creates a new <code>{@link org.assertj.core.api.OffsetTimeAssert}</code>.
   *
   * @param actual the actual value to verify
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractObjectAssert.java`
#### Snippet
```java
   *   <li>The recursion does not enter into Java Class Library types (java.*, javax.*)</li>
   *   <li>The {@link java.util.function.Predicate} is applied to {@link java.util.Collection} and array elements (but the collection/array itself)</li>
   *   <li>The {@link java.util.function.Predicate} is applied to {@link java.util.Map} values but not the map itself or its keys</li>
   *   <li>The {@link java.util.function.Predicate} is applied to {@link java.util.Optional} and primitive optional values</li>
   * </ul>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractObjectAssert.java`
#### Snippet
```java
   *   <li>Inclusion of Java Class Library types in the recursive execution</li>
   *   <li>Treatment of {@link java.util.Collection} and array objects</li>
   *   <li>Treatment of {@link java.util.Map} objects</li>
   *   <li>Treatment of Optional and primitive Optional objects</li>
   * </ul>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractObjectAssert.java`
#### Snippet
```java
   * @throws AssertionError if the actual object has the given field/property but not with the expected value
   *
   * @see AbstractObjectAssert#hasFieldOrProperty(java.lang.String)
   */
  public SELF hasFieldOrPropertyWithValue(String name, Object value) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetTimeAssert.java`
#### Snippet
```java
   * assertThat(OffsetTimeA).isEqualToIgnoringNanos(OffsetTimeB);</code></pre>
   *
   * @param other the given {@link java.time.OffsetTime}.
   * @return this assertion object.
   * @throws AssertionError if the actual {@code OffsetTime} is {@code null}.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetTimeAssert.java`
#### Snippet
```java
   *                               .isBeforeOrEqualTo(parse("12:00:01Z"));</code></pre>
   *
   * @param other the given {@link java.time.OffsetTime}.
   * @return this assertion object.
   * @throws AssertionError if the actual {@code OffsetTime} is {@code null}.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetTimeAssert.java`
#### Snippet
```java

  /**
   * Check that the {@link java.time.OffsetTime} string representation to compare actual {@link java.time.OffsetTime} to
   * is not null,
   * otherwise throws a {@link IllegalArgumentException} with an explicit message
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetTimeAssert.java`
#### Snippet
```java

  /**
   * Check that the {@link java.time.OffsetTime} string representation to compare actual {@link java.time.OffsetTime} to
   * is not null,
   * otherwise throws a {@link IllegalArgumentException} with an explicit message
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetTimeAssert.java`
#### Snippet
```java
   * otherwise throws a {@link IllegalArgumentException} with an explicit message
   *
   * @param OffsetTimeAsString String representing the {@link java.time.OffsetTime} to compare actual with
   * @throws IllegalArgumentException with an explicit message if the given {@link String} is null
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetTimeAssert.java`
#### Snippet
```java

  /**
   * Creates a new <code>{@link org.assertj.core.api.AbstractOffsetTimeAssert}</code>.
   *
   * @param selfType the "self type"
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetTimeAssert.java`
#### Snippet
```java

  /**
   * Same assertion as {@link #isAfter(java.time.OffsetTime)} but the {@link java.time.OffsetTime} is built from given a
   * String that
   * must follow <a href=
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetTimeAssert.java`
#### Snippet
```java

  /**
   * Same assertion as {@link #isAfter(java.time.OffsetTime)} but the {@link java.time.OffsetTime} is built from given a
   * String that
   * must follow <a href=
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetTimeAssert.java`
#### Snippet
```java
   * must follow <a href=
   * "http://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html#ISO_OFFSET_TIME"
   * >ISO OffsetTime format</a> to allow calling {@link java.time.OffsetTime#parse(CharSequence)} method.
   * <p>
   * Example :
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetTimeAssert.java`
#### Snippet
```java
   * assertThat(parse("13:00:00Z")).isAfter("12:00:00Z");</code></pre>
   *
   * @param offsetTimeAsString String representing a {@link java.time.OffsetTime}.
   * @return this assertion object.
   * @throws AssertionError if the actual {@code OffsetTime} is {@code null}.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetTimeAssert.java`
#### Snippet
```java
   * @return this assertion object.
   * @throws AssertionError if the actual {@code OffsetTime} is {@code null}.
   * @throws IllegalArgumentException if given String is null or can't be converted to a {@link java.time.OffsetTime}.
   * @throws AssertionError if the actual {@code OffsetTime} is not strictly after the {@link java.time.OffsetTime}
   *           built from given String.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetTimeAssert.java`
#### Snippet
```java
   * @throws AssertionError if the actual {@code OffsetTime} is {@code null}.
   * @throws IllegalArgumentException if given String is null or can't be converted to a {@link java.time.OffsetTime}.
   * @throws AssertionError if the actual {@code OffsetTime} is not strictly after the {@link java.time.OffsetTime}
   *           built from given String.
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetTimeAssert.java`
#### Snippet
```java
   * assertThat(OffsetTimeA).hasSameHourAs(OffsetTimeB); </code></pre>
   *
   * @param other the given {@link java.time.OffsetTime}.
   * @return this assertion object.
   * @throws AssertionError if the actual {@code OffsetTime} is {@code null}.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetTimeAssert.java`
#### Snippet
```java

  /**
   * Same assertion as {@link #isNotEqualTo(Object)} (where Object is expected to be {@link java.time.OffsetTime}) but
   * here you
   * pass {@link java.time.OffsetTime} String representation that must follow <a href=
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetTimeAssert.java`
#### Snippet
```java
   * Same assertion as {@link #isNotEqualTo(Object)} (where Object is expected to be {@link java.time.OffsetTime}) but
   * here you
   * pass {@link java.time.OffsetTime} String representation that must follow <a href=
   * "http://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html#ISO_OFFSET_TIME"
   * >ISO OffsetTime format</a> to allow calling {@link java.time.OffsetTime#parse(CharSequence)} method.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetTimeAssert.java`
#### Snippet
```java
   * pass {@link java.time.OffsetTime} String representation that must follow <a href=
   * "http://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html#ISO_OFFSET_TIME"
   * >ISO OffsetTime format</a> to allow calling {@link java.time.OffsetTime#parse(CharSequence)} method.
   * <p>
   * Example :
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetTimeAssert.java`
#### Snippet
```java
   * assertThat(parse("13:00:00Z")).isNotEqualTo("12:00:00Z");</code></pre>
   *
   * @param offsetTimeAsString String representing a {@link java.time.OffsetTime}.
   * @return this assertion object.
   * @throws AssertionError if the actual {@code OffsetTime} is {@code null}.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetTimeAssert.java`
#### Snippet
```java
   * @return this assertion object.
   * @throws AssertionError if the actual {@code OffsetTime} is {@code null}.
   * @throws IllegalArgumentException if given String is null or can't be converted to a {@link java.time.OffsetTime}.
   * @throws AssertionError if the actual {@code OffsetTime} is equal to the {@link java.time.OffsetTime} built from
   *           given String.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetTimeAssert.java`
#### Snippet
```java
   * @throws AssertionError if the actual {@code OffsetTime} is {@code null}.
   * @throws IllegalArgumentException if given String is null or can't be converted to a {@link java.time.OffsetTime}.
   * @throws AssertionError if the actual {@code OffsetTime} is equal to the {@link java.time.OffsetTime} built from
   *           given String.
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetTimeAssert.java`
#### Snippet
```java

  /**
   * Same assertion as {@link #isNotIn(Object...)} (where Objects are expected to be {@link java.time.OffsetTime}) but
   * here you
   * pass {@link java.time.OffsetTime} String representations that must follow <a href=
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetTimeAssert.java`
#### Snippet
```java
   * Same assertion as {@link #isNotIn(Object...)} (where Objects are expected to be {@link java.time.OffsetTime}) but
   * here you
   * pass {@link java.time.OffsetTime} String representations that must follow <a href=
   * "http://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html#ISO_OFFSET_TIME"
   * >ISO OffsetTime format</a> to allow calling {@link java.time.OffsetTime#parse(CharSequence)} method.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetTimeAssert.java`
#### Snippet
```java
   * pass {@link java.time.OffsetTime} String representations that must follow <a href=
   * "http://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html#ISO_OFFSET_TIME"
   * >ISO OffsetTime format</a> to allow calling {@link java.time.OffsetTime#parse(CharSequence)} method.
   * <p>
   * Example :
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetTimeAssert.java`
#### Snippet
```java
   * assertThat(parse("13:00:00Z")).isNotIn("12:00:00Z", "14:00:00Z");</code></pre>
   *
   * @param offsetTimesAsString Array of String representing a {@link java.time.OffsetTime}.
   * @return this assertion object.
   * @throws AssertionError if the actual {@code OffsetTime} is {@code null}.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetTimeAssert.java`
#### Snippet
```java
   * @return this assertion object.
   * @throws AssertionError if the actual {@code OffsetTime} is {@code null}.
   * @throws IllegalArgumentException if given String is null or can't be converted to a {@link java.time.OffsetTime}.
   * @throws AssertionError if the actual {@code OffsetTime} is in the {@link java.time.OffsetTime}s built from given
   *           Strings.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetTimeAssert.java`
#### Snippet
```java
   * @throws AssertionError if the actual {@code OffsetTime} is {@code null}.
   * @throws IllegalArgumentException if given String is null or can't be converted to a {@link java.time.OffsetTime}.
   * @throws AssertionError if the actual {@code OffsetTime} is in the {@link java.time.OffsetTime}s built from given
   *           Strings.
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetTimeAssert.java`
#### Snippet
```java

  /**
   * Verifies that actual and given {@link java.time.OffsetTime} have same hour, minute, second and nanosecond fields).
   * <p>
   * Code examples :
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetTimeAssert.java`
#### Snippet
```java
   * assertThat(offsetTime).isEqualToIgnoringTimezone(offsetTime2); </code></pre>
   *
   * @param other the given {@link java.time.OffsetTime}.
   * @return this assertion object.
   * @throws AssertionError if the actual {@code OffsetTime} is {@code null}.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetTimeAssert.java`
#### Snippet
```java

/**
 * Assertions for {@link java.time.OffsetTime} type from new Date &amp; Time API introduced in Java 8.
 *
 * @author Alexander Bischof
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetTimeAssert.java`
#### Snippet
```java

  /**
   * Verifies that actual and given {@link java.time.OffsetTime} have same hour and minute fields (second and nanosecond
   * fields are
   * ignored in comparison).
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetTimeAssert.java`
#### Snippet
```java
   * assertThat(OffsetTimeA).isEqualToIgnoringSeconds(OffsetTimeB);</code></pre>
   *
   * @param other the given {@link java.time.OffsetTime}.
   * @return this assertion object.
   * @throws AssertionError if the actual {@code OffsetTime} is {@code null}.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetTimeAssert.java`
#### Snippet
```java

  /**
   * Same assertion as {@link #isBeforeOrEqualTo(java.time.OffsetTime)} but the {@link java.time.OffsetTime} is built
   * from given
   * String, which must follow <a href=
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetTimeAssert.java`
#### Snippet
```java

  /**
   * Same assertion as {@link #isBeforeOrEqualTo(java.time.OffsetTime)} but the {@link java.time.OffsetTime} is built
   * from given
   * String, which must follow <a href=
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetTimeAssert.java`
#### Snippet
```java
   * String, which must follow <a href=
   * "http://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html#ISO_OFFSET_TIME"
   * >ISO OffsetTime format</a> to allow calling {@link java.time.OffsetTime#parse(CharSequence)} method.
   * <p>
   * Example :
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetTimeAssert.java`
#### Snippet
```java
   *                               .isBeforeOrEqualTo("13:00:00Z");</code></pre>
   *
   * @param offsetTimeAsString String representing a {@link java.time.OffsetTime}.
   * @return this assertion object.
   * @throws AssertionError if the actual {@code OffsetTime} is {@code null}.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetTimeAssert.java`
#### Snippet
```java
   * @return this assertion object.
   * @throws AssertionError if the actual {@code OffsetTime} is {@code null}.
   * @throws IllegalArgumentException if given String is null or can't be converted to a {@link java.time.OffsetTime}.
   * @throws AssertionError if the actual {@code OffsetTime} is not before or equals to the {@link java.time.OffsetTime}
   *           built from given String.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetTimeAssert.java`
#### Snippet
```java
   * @throws AssertionError if the actual {@code OffsetTime} is {@code null}.
   * @throws IllegalArgumentException if given String is null or can't be converted to a {@link java.time.OffsetTime}.
   * @throws AssertionError if the actual {@code OffsetTime} is not before or equals to the {@link java.time.OffsetTime}
   *           built from given String.
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetTimeAssert.java`
#### Snippet
```java
   * <pre><code class='java'> assertThat(parse("12:00:00Z")).isBefore(parse("13:00:00Z"));</code></pre>
   *
   * @param other the given {@link java.time.OffsetTime}.
   * @return this assertion object.
   * @throws AssertionError if the actual {@code OffsetTime} is {@code null}.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetTimeAssert.java`
#### Snippet
```java

  /**
   * Check that the {@link java.time.OffsetTime} to compare actual {@link java.time.OffsetTime} to is not null, in that
   * case throws a {@link IllegalArgumentException} with an explicit message
   *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetTimeAssert.java`
#### Snippet
```java

  /**
   * Check that the {@link java.time.OffsetTime} to compare actual {@link java.time.OffsetTime} to is not null, in that
   * case throws a {@link IllegalArgumentException} with an explicit message
   *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetTimeAssert.java`
#### Snippet
```java
   * case throws a {@link IllegalArgumentException} with an explicit message
   *
   * @param other the {@link java.time.OffsetTime} to check
   * @throws IllegalArgumentException with an explicit message if the given {@link java.time.OffsetTime} is null
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetTimeAssert.java`
#### Snippet
```java
   *
   * @param other the {@link java.time.OffsetTime} to check
   * @throws IllegalArgumentException with an explicit message if the given {@link java.time.OffsetTime} is null
   */
  private static void assertOffsetTimeParameterIsNotNull(OffsetTime other) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetTimeAssert.java`
#### Snippet
```java

  /**
   * Same assertion as {@link #isIn(Object...)} (where Objects are expected to be {@link java.time.OffsetTime}) but here
   * you
   * pass {@link java.time.OffsetTime} String representations that must follow <a href=
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetTimeAssert.java`
#### Snippet
```java
   * Same assertion as {@link #isIn(Object...)} (where Objects are expected to be {@link java.time.OffsetTime}) but here
   * you
   * pass {@link java.time.OffsetTime} String representations that must follow <a href=
   * "http://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html#ISO_OFFSET_TIME"
   * >ISO OffsetTime format</a> to allow calling {@link java.time.OffsetTime#parse(CharSequence)} method.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetTimeAssert.java`
#### Snippet
```java
   * pass {@link java.time.OffsetTime} String representations that must follow <a href=
   * "http://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html#ISO_OFFSET_TIME"
   * >ISO OffsetTime format</a> to allow calling {@link java.time.OffsetTime#parse(CharSequence)} method.
   * <p>
   * Example :
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetTimeAssert.java`
#### Snippet
```java
   * assertThat(parse("13:00:00Z")).isIn("12:00:00Z", "13:00:00Z");</code></pre>
   *
   * @param offsetTimesAsString String array representing {@link java.time.OffsetTime}s.
   * @return this assertion object.
   * @throws AssertionError if the actual {@code OffsetTime} is {@code null}.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetTimeAssert.java`
#### Snippet
```java
   * @return this assertion object.
   * @throws AssertionError if the actual {@code OffsetTime} is {@code null}.
   * @throws IllegalArgumentException if given String is null or can't be converted to a {@link java.time.OffsetTime}.
   * @throws AssertionError if the actual {@code OffsetTime} is not in the {@link java.time.OffsetTime}s built from
   *           given Strings.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetTimeAssert.java`
#### Snippet
```java
   * @throws AssertionError if the actual {@code OffsetTime} is {@code null}.
   * @throws IllegalArgumentException if given String is null or can't be converted to a {@link java.time.OffsetTime}.
   * @throws AssertionError if the actual {@code OffsetTime} is not in the {@link java.time.OffsetTime}s built from
   *           given Strings.
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetTimeAssert.java`
#### Snippet
```java

  /**
   * Same assertion as {@link #isAfterOrEqualTo(java.time.OffsetTime)} but the {@link java.time.OffsetTime} is built
   * from given
   * String, which must follow <a href=
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetTimeAssert.java`
#### Snippet
```java

  /**
   * Same assertion as {@link #isAfterOrEqualTo(java.time.OffsetTime)} but the {@link java.time.OffsetTime} is built
   * from given
   * String, which must follow <a href=
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetTimeAssert.java`
#### Snippet
```java
   * String, which must follow <a href=
   * "http://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html#ISO_OFFSET_TIME"
   * >ISO OffsetTime format</a> to allow calling {@link java.time.OffsetTime#parse(CharSequence)} method.
   * <p>
   * Example :
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetTimeAssert.java`
#### Snippet
```java
   *                               .isAfterOrEqualTo("12:00:00Z");</code></pre>
   *
   * @param offsetTimeAsString String representing a {@link java.time.OffsetTime}.
   * @return this assertion object.
   * @throws AssertionError if the actual {@code OffsetTime} is {@code null}.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetTimeAssert.java`
#### Snippet
```java
   * @return this assertion object.
   * @throws AssertionError if the actual {@code OffsetTime} is {@code null}.
   * @throws IllegalArgumentException if given String is null or can't be converted to a {@link java.time.OffsetTime}.
   * @throws AssertionError if the actual {@code OffsetTime} is not after or equals to the {@link java.time.OffsetTime}
   *           built from
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetTimeAssert.java`
#### Snippet
```java
   * @throws AssertionError if the actual {@code OffsetTime} is {@code null}.
   * @throws IllegalArgumentException if given String is null or can't be converted to a {@link java.time.OffsetTime}.
   * @throws AssertionError if the actual {@code OffsetTime} is not after or equals to the {@link java.time.OffsetTime}
   *           built from
   *           given String.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetTimeAssert.java`
#### Snippet
```java
   *                               .isAfterOrEqualTo(parse("12:00:00Z"));</code></pre>
   *
   * @param other the given {@link java.time.OffsetTime}.
   * @return this assertion object.
   * @throws AssertionError if the actual {@code OffsetTime} is {@code null}.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetTimeAssert.java`
#### Snippet
```java
   * <pre><code class='java'> assertThat(parse("13:00:00Z")).isAfter(parse("12:00:00Z"));</code></pre>
   *
   * @param other the given {@link java.time.OffsetTime}.
   * @return this assertion object.
   * @throws AssertionError if the actual {@code OffsetTime} is {@code null}.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetTimeAssert.java`
#### Snippet
```java

  /**
   * Same assertion as {@link #isBefore(java.time.OffsetTime)} but the {@link java.time.OffsetTime} is built from given
   * String, which
   * must follow <a href=
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetTimeAssert.java`
#### Snippet
```java

  /**
   * Same assertion as {@link #isBefore(java.time.OffsetTime)} but the {@link java.time.OffsetTime} is built from given
   * String, which
   * must follow <a href=
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetTimeAssert.java`
#### Snippet
```java
   * must follow <a href=
   * "http://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html#ISO_OFFSET_TIME"
   * >ISO OffsetTime format</a> to allow calling {@link java.time.OffsetTime#parse(CharSequence)} method.
   * <p>
   * Example :
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetTimeAssert.java`
#### Snippet
```java
   * assertThat(parse("12:59Z")).isBefore("13:00Z");</code></pre>
   *
   * @param offsetTimeAsString String representing a {@link java.time.OffsetTime}.
   * @return this assertion object.
   * @throws AssertionError if the actual {@code OffsetTime} is {@code null}.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetTimeAssert.java`
#### Snippet
```java
   * @return this assertion object.
   * @throws AssertionError if the actual {@code OffsetTime} is {@code null}.
   * @throws IllegalArgumentException if given String is null or can't be converted to a {@link java.time.OffsetTime}.
   * @throws AssertionError if the actual {@code OffsetTime} is not strictly before the {@link java.time.OffsetTime}
   *           built
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetTimeAssert.java`
#### Snippet
```java
   * @throws AssertionError if the actual {@code OffsetTime} is {@code null}.
   * @throws IllegalArgumentException if given String is null or can't be converted to a {@link java.time.OffsetTime}.
   * @throws AssertionError if the actual {@code OffsetTime} is not strictly before the {@link java.time.OffsetTime}
   *           built
   *           from given String.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetTimeAssert.java`
#### Snippet
```java

  /**
   * Same assertion as {@link #isEqualTo(Object)} (where Object is expected to be {@link java.time.OffsetTime}) but here
   * you
   * pass {@link java.time.OffsetTime} String representation that must follow <a href=
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetTimeAssert.java`
#### Snippet
```java
   * Same assertion as {@link #isEqualTo(Object)} (where Object is expected to be {@link java.time.OffsetTime}) but here
   * you
   * pass {@link java.time.OffsetTime} String representation that must follow <a href=
   * "http://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html#ISO_OFFSET_TIME"
   * >ISO OffsetTime format</a> to allow calling {@link java.time.OffsetTime#parse(CharSequence)} method.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetTimeAssert.java`
#### Snippet
```java
   * pass {@link java.time.OffsetTime} String representation that must follow <a href=
   * "http://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html#ISO_OFFSET_TIME"
   * >ISO OffsetTime format</a> to allow calling {@link java.time.OffsetTime#parse(CharSequence)} method.
   * <p>
   * Example :
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetTimeAssert.java`
#### Snippet
```java
   * assertThat(parse("13:00:00Z")).isEqualTo("13:00:00Z");</code></pre>
   *
   * @param offsetTimeAsString String representing a {@link java.time.OffsetTime}.
   * @return this assertion object.
   * @throws AssertionError if the actual {@code OffsetTime} is {@code null}.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetTimeAssert.java`
#### Snippet
```java
   * @return this assertion object.
   * @throws AssertionError if the actual {@code OffsetTime} is {@code null}.
   * @throws IllegalArgumentException if given String is null or can't be converted to a {@link java.time.OffsetTime}.
   * @throws AssertionError if the actual {@code OffsetTime} is not equal to the {@link java.time.OffsetTime} built from
   *           given String.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetTimeAssert.java`
#### Snippet
```java
   * @throws AssertionError if the actual {@code OffsetTime} is {@code null}.
   * @throws IllegalArgumentException if given String is null or can't be converted to a {@link java.time.OffsetTime}.
   * @throws AssertionError if the actual {@code OffsetTime} is not equal to the {@link java.time.OffsetTime} built from
   *           given String.
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/OptionalIntAssert.java`
#### Snippet
```java

/**
 * Assertions for {@link java.util.OptionalInt}.
 *
 * @author Jean-Christophe Gay
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractPeriodAssert.java`
#### Snippet
```java

  /**
   * Creates a new <code>{@link org.assertj.core.api.AbstractPeriodAssert}</code>
   * @param period the actual value to verify
   * @param selfType the "self type"
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/SoftThrowableAssertAlternative.java`
#### Snippet
```java
 * {@link ThrowableAssertAlternative} subclass used in soft assertions.
 * <p> 
 * Assertion methods for {@link java.lang.Throwable} similar to {@link ThrowableAssert} but with assertions methods named
 * differently to make testing code fluent (ex : <code>withMessage</code> instead of <code>hasMessage</code>.
 * <pre><code class='java'> SoftAssertions softly = new SoftAssertions();
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractLocalDateTimeAssert.java`
#### Snippet
```java

  /**
   * Creates a new <code>{@link org.assertj.core.api.AbstractLocalDateTimeAssert}</code>.
   *
   * @param selfType the "self type"
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.regex` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/MatcherAssert.java`
#### Snippet
```java

/**
 * Assertions for {@link java.util.regex.Matcher}.
 *
 * @author Jiashu Zhang
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractFloatAssert.java`
#### Snippet
```java
   * @see #isInfinite()
   * @see #isNaN()
   * @see java.lang.Float#isFinite(float)
   * @since 3.19.0
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractFloatAssert.java`
#### Snippet
```java
   * @see #isFinite()
   * @see #isNaN()
   * @see java.lang.Float#isInfinite(float)
   * @since 3.20.0
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractFloatAssert.java`
#### Snippet
```java
   * @see #isInfinite()
   * @see #isNaN()
   * @see java.lang.Float#isFinite(float)
   * @since 3.20.0
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractFloatAssert.java`
#### Snippet
```java
   * @see #isFinite()
   * @see #isNaN()
   * @see java.lang.Float#isInfinite(float)
   * @since 3.19.0
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractThrowableAssert.java`
#### Snippet
```java

  /**
   * Verifies that the {@link org.assertj.core.api.ThrowableAssert.ThrowingCallable} didn't raise a throwable.
   * <p>
   * Example :
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOptionalDoubleAssert.java`
#### Snippet
```java

  /**
   * Verifies that the actual {@link java.util.OptionalDouble} has the value close to the argument.
   * <p>
   * Assertion will pass :
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOptionalDoubleAssert.java`
#### Snippet
```java
   * assertThat(OptionalDouble.of(7)).hasValueCloseTo(1.0, within(-1d));</code></pre>
   *
   * @param expectedValue the expected value inside the {@link java.util.OptionalDouble}.
   * @param offset the given positive offset.
   * @return this assertion object.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOptionalDoubleAssert.java`
#### Snippet
```java
   * @param offset the given positive offset.
   * @return this assertion object.
   * @throws java.lang.AssertionError if actual value is empty.
   * @throws java.lang.AssertionError if actual is null.
   * @throws java.lang.AssertionError if actual has not the value as expected.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOptionalDoubleAssert.java`
#### Snippet
```java
   * @return this assertion object.
   * @throws java.lang.AssertionError if actual value is empty.
   * @throws java.lang.AssertionError if actual is null.
   * @throws java.lang.AssertionError if actual has not the value as expected.
   * @throws java.lang.NullPointerException if offset is null
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOptionalDoubleAssert.java`
#### Snippet
```java
   * @throws java.lang.AssertionError if actual value is empty.
   * @throws java.lang.AssertionError if actual is null.
   * @throws java.lang.AssertionError if actual has not the value as expected.
   * @throws java.lang.NullPointerException if offset is null
   * @throws java.lang.IllegalArgumentException if offset is not positive.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOptionalDoubleAssert.java`
#### Snippet
```java
   * @throws java.lang.AssertionError if actual is null.
   * @throws java.lang.AssertionError if actual has not the value as expected.
   * @throws java.lang.NullPointerException if offset is null
   * @throws java.lang.IllegalArgumentException if offset is not positive.
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOptionalDoubleAssert.java`
#### Snippet
```java
   * @throws java.lang.AssertionError if actual has not the value as expected.
   * @throws java.lang.NullPointerException if offset is null
   * @throws java.lang.IllegalArgumentException if offset is not positive.
   */
  public SELF hasValueCloseTo(Double expectedValue, Offset<Double> offset) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOptionalDoubleAssert.java`
#### Snippet
```java

  /**
   * Verifies that there is a value present in the actual {@link java.util.OptionalDouble}.
   * <p>
   * Assertion will pass :
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOptionalDoubleAssert.java`
#### Snippet
```java
   *
   * @return this assertion object.
   * @throws java.lang.AssertionError if actual value is empty.
   * @throws java.lang.AssertionError if actual is null.
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOptionalDoubleAssert.java`
#### Snippet
```java
   * @return this assertion object.
   * @throws java.lang.AssertionError if actual value is empty.
   * @throws java.lang.AssertionError if actual is null.
   */
  public SELF isPresent() {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOptionalDoubleAssert.java`
#### Snippet
```java

  /**
   * Verifies that the actual {@link java.util.OptionalDouble} has the value in argument.
   * <p>
   * Assertion will pass :
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOptionalDoubleAssert.java`
#### Snippet
```java
   * assertThat(OptionalDouble.of(7)).hasValue(8.0);</code></pre>
   *
   * @param expectedValue the expected value inside the {@link java.util.OptionalDouble}.
   * @return this assertion object.
   * @throws java.lang.AssertionError if actual value is empty.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOptionalDoubleAssert.java`
#### Snippet
```java
   * @param expectedValue the expected value inside the {@link java.util.OptionalDouble}.
   * @return this assertion object.
   * @throws java.lang.AssertionError if actual value is empty.
   * @throws java.lang.AssertionError if actual is null.
   * @throws java.lang.AssertionError if actual has not the value as expected.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOptionalDoubleAssert.java`
#### Snippet
```java
   * @return this assertion object.
   * @throws java.lang.AssertionError if actual value is empty.
   * @throws java.lang.AssertionError if actual is null.
   * @throws java.lang.AssertionError if actual has not the value as expected.
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOptionalDoubleAssert.java`
#### Snippet
```java
   * @throws java.lang.AssertionError if actual value is empty.
   * @throws java.lang.AssertionError if actual is null.
   * @throws java.lang.AssertionError if actual has not the value as expected.
   */
  public SELF hasValue(double expectedValue) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOptionalDoubleAssert.java`
#### Snippet
```java

/**
 * Assertions for {@link java.util.OptionalDouble}.
 *
 * @author Jean-Christophe Gay
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOptionalDoubleAssert.java`
#### Snippet
```java

  /**
   * Verifies that the actual {@link java.util.OptionalDouble} has a value close to the expected value, within the given
   * percentage.<br>
   * If the difference is equal to the percentage value, the assertion is considered valid.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOptionalDoubleAssert.java`
#### Snippet
```java
   * assertThat(OptionalDouble.empty()).hasValueCloseTo(10.0, withinPercentage(5));</code></pre>
   *
   * @param expectedValue the expected value inside the {@link java.util.OptionalDouble}
   * @param percentage    the given positive percentage
   * @return the assertion object
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOptionalDoubleAssert.java`
#### Snippet
```java
   * @param percentage    the given positive percentage
   * @return the assertion object
   * @throws java.lang.AssertionError if actual value is empty
   * @throws java.lang.AssertionError if actual is null
   * @throws java.lang.AssertionError if the actual value is not close to the given one
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOptionalDoubleAssert.java`
#### Snippet
```java
   * @return the assertion object
   * @throws java.lang.AssertionError if actual value is empty
   * @throws java.lang.AssertionError if actual is null
   * @throws java.lang.AssertionError if the actual value is not close to the given one
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOptionalDoubleAssert.java`
#### Snippet
```java
   * @throws java.lang.AssertionError if actual value is empty
   * @throws java.lang.AssertionError if actual is null
   * @throws java.lang.AssertionError if the actual value is not close to the given one
   */
  public SELF hasValueCloseTo(Double expectedValue, Percentage percentage) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOptionalDoubleAssert.java`
#### Snippet
```java
  
  /**
   * Verifies that the actual {@link java.util.OptionalDouble} is empty.
   * <p>
   * Assertion will pass :
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOptionalDoubleAssert.java`
#### Snippet
```java
   *
   * @return this assertion object.
   * @throws java.lang.AssertionError if actual value is present.
   * @throws java.lang.AssertionError if actual is null.
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOptionalDoubleAssert.java`
#### Snippet
```java
   * @return this assertion object.
   * @throws java.lang.AssertionError if actual value is present.
   * @throws java.lang.AssertionError if actual is null.
   */
  public SELF isEmpty() {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOptionalDoubleAssert.java`
#### Snippet
```java

  /**
   * Verifies that there is a value present in the actual {@link java.util.OptionalDouble}, it's an alias of {@link #isPresent()}.
   * <p>
   * Assertion will pass :
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOptionalDoubleAssert.java`
#### Snippet
```java
   *
   * @return this assertion object.
   * @throws java.lang.AssertionError if actual value is empty.
   * @throws java.lang.AssertionError if actual is null.
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOptionalDoubleAssert.java`
#### Snippet
```java
   * @return this assertion object.
   * @throws java.lang.AssertionError if actual value is empty.
   * @throws java.lang.AssertionError if actual is null.
   */
  public SELF isNotEmpty() {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.net` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractUriAssert.java`
#### Snippet
```java
 *
 * @param <SELF> the "self" type of this assertion class.
 * @see java.net.URI
 */
public abstract class AbstractUriAssert<SELF extends AbstractUriAssert<SELF>> extends AbstractComparableAssert<SELF, URI> {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractMapAssert.java`
#### Snippet
```java
   *   <li>The recursion does not enter into Java Class Library types (java.*, javax.*)</li>
   *   <li>The {@link java.util.function.Predicate} is applied to {@link java.util.Collection} and array elements (but the collection/array itself)</li>
   *   <li>The {@link java.util.function.Predicate} is applied to {@link java.util.Map} values but not the map itself or its keys</li>
   *   <li>The {@link java.util.function.Predicate} is applied to {@link java.util.Optional} and primitive optional values</li>
   * </ul>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.util` is unnecessary, and can be replaced with an import
in `assertj-core/src/main/java/org/assertj/core/api/AbstractMapAssert.java`
#### Snippet
```java
    for (Object item : collectionToFlatten) {
      if (item instanceof Iterable<?>) result.addAll(toCollection((Iterable<?>) item));
      else if (isArray(item)) result.addAll(org.assertj.core.util.Arrays.asList(item));
      else result.add(item);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractMapAssert.java`
#### Snippet
```java
   *   <li>Inclusion of Java Class Library types in the recursive execution</li>
   *   <li>Treatment of {@link java.util.Collection} and array objects</li>
   *   <li>Treatment of {@link java.util.Map} objects</li>
   *   <li>Treatment of Optional and primitive Optional objects</li>
   * </ul>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.function` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractMapAssert.java`
#### Snippet
```java
   * this new list becoming the object under test.
   * <p>
   * This method works as {@link AbstractMapAssert#extractingFromEntries(java.util.function.Function)} except
   * that it is designed to extract multiple values from the {@link Map} entries.
   * That's why here the new object under test is a List of {@link Tuple}s.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractMapAssert.java`
#### Snippet
```java
   * Verifies that the actual map contains only the given entries and nothing else, <b>in order</b>.<br>
   * This assertion should only be used with maps that have a consistent iteration order (i.e. don't use it with
   * {@link java.util.HashMap}, prefer {@link #containsOnly(java.util.Map.Entry...)} in that case).
   * <p>
   * Examples:
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractMapAssert.java`
#### Snippet
```java
   * Verifies that the actual map contains only the entries of the given map and nothing else, <b>in order</b>.<br>
   * This assertion should only be used with maps that have a consistent iteration order (i.e. don't use it with
   * {@link java.util.HashMap}, prefer {@link #containsExactlyInAnyOrderEntriesOf(java.util.Map)} in that case).
   * <p>
   * Examples:
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.concurrent` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Assumptions.java`
#### Snippet
```java

  /**
   * Creates a new instance of {@link CompletableFutureAssert} assumption for a {@link java.util.concurrent.CompletionStage}
   * by converting it to a {@link CompletableFuture} and returning a {@link CompletableFutureAssert}.
   * <p>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.concurrent` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Assumptions.java`
#### Snippet
```java
   * by converting it to a {@link CompletableFuture} and returning a {@link CompletableFutureAssert}.
   * <p>
   * If the given {@link java.util.concurrent.CompletionStage} is null, the {@link CompletableFuture} in the returned {@link CompletableFutureAssert} will also be null.
   *
   * @param <RESULT> the CompletableFuture wrapped type.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.concurrent` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Assumptions.java`
#### Snippet
```java
   *
   * @param future the actual value.
   * @param <RESULT> the type of the value contained in the {@link java.util.concurrent.Future}.
   *
   * @return the created assumption for assertion object.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOptionalAssert.java`
#### Snippet
```java

  /**
   * Verifies that the actual {@link java.util.Optional} is empty (alias of {@link #isEmpty()}).
   * <p>
   * Assertion will pass :
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOptionalAssert.java`
#### Snippet
```java
   *   <li>The {@link java.util.function.Predicate} is applied to {@link java.util.Collection} and array elements (but the collection/array itself)</li>
   *   <li>The {@link java.util.function.Predicate} is applied to {@link java.util.Map} values but not the map itself or its keys</li>
   *   <li>The {@link java.util.function.Predicate} is applied to {@link java.util.Optional} and primitive optional values</li>
   * </ul>
   *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOptionalAssert.java`
#### Snippet
```java

  /**
   * Verifies that the actual {@link java.util.Optional} is empty.
   * <p>
   * Assertion will pass :
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOptionalAssert.java`
#### Snippet
```java

  /**
   * Verifies that the actual {@link java.util.Optional} contains the given value (alias of {@link #contains(Object)}).
   * <p>
   * Assertion will pass :
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOptionalAssert.java`
#### Snippet
```java
   * assertThat(Optional.of(20)).contains(10);</code></pre>
   *
   * @param expectedValue the expected value inside the {@link java.util.Optional}.
   * @return this assertion object.
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOptionalAssert.java`
#### Snippet
```java

  /**
   * Verifies that the actual {@link java.util.Optional} contains the given value (alias of {@link #hasValue(Object)}).
   * <p>
   * Assertion will pass :
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOptionalAssert.java`
#### Snippet
```java
   * assertThat(Optional.of(20)).contains(10);</code></pre>
   *
   * @param expectedValue the expected value inside the {@link java.util.Optional}.
   * @return this assertion object.
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOptionalAssert.java`
#### Snippet
```java

/**
 * Assertions for {@link java.util.Optional}.
 *
 * @param <SELF> the "self" type of this assertion class.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOptionalAssert.java`
#### Snippet
```java
 *
 * @param <SELF> the "self" type of this assertion class.
 * @param <VALUE> type of the value contained in the {@link java.util.Optional}.
 *
 * @author Jean-Christophe Gay
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOptionalAssert.java`
#### Snippet
```java

  /**
   * Verifies that the actual {@link java.util.Optional} contains the instance given as an argument (i.e. it must be the
   * same instance).
   * <p>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOptionalAssert.java`
#### Snippet
```java
   * assertThat(Optional.of(new Integer(10))).containsSame(new Integer(10));</code></pre>
   *
   * @param expectedValue the expected value inside the {@link java.util.Optional}.
   * @return this assertion object.
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOptionalAssert.java`
#### Snippet
```java

  /**
   * Verifies that there is a value present in the actual {@link java.util.Optional}, it's an alias of {@link #isPresent()}.
   * <p>
   * Assertion will pass :
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOptionalAssert.java`
#### Snippet
```java

  /**
   * Verifies that the actual {@link java.util.Optional} contains a value and gives this value to the given
   * {@link java.util.function.Consumer} for further assertions. Should be used as a way of deeper asserting on the
   * containing object, as further requirement(s) for the value.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.function` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOptionalAssert.java`
#### Snippet
```java
  /**
   * Verifies that the actual {@link java.util.Optional} contains a value and gives this value to the given
   * {@link java.util.function.Consumer} for further assertions. Should be used as a way of deeper asserting on the
   * containing object, as further requirement(s) for the value.
   * <p>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOptionalAssert.java`
#### Snippet
```java
   * assertThat(Optional.empty()).hasValueSatisfying(o -&gt; {});</code></pre>
   *
   * @param requirement to further assert on the object contained inside the {@link java.util.Optional}.
   * @return this assertion object.
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOptionalAssert.java`
#### Snippet
```java

  /**
   * Verifies that there is a value present in the actual {@link java.util.Optional}.
   * <p>
   * Assertion will pass :
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.regex` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractMatcherAssert.java`
#### Snippet
```java

/**
 * Assertions for {@link java.util.regex.Matcher}
 *
 * @author Jiashu Zhang
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AtomicReferenceArrayAssert.java`
#### Snippet
```java
   *
   * @param <C> the type to compare.
   * @param comparator the {@link java.util.Comparator} to use
   * @param type the {@link java.lang.Class} of the type of the element fields the comparator should be used for
   * @return {@code this} assertions object
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AtomicReferenceArrayAssert.java`
#### Snippet
```java
   * @param <C> the type to compare.
   * @param comparator the {@link java.util.Comparator} to use
   * @param type the {@link java.lang.Class} of the type of the element fields the comparator should be used for
   * @return {@code this} assertions object
   * @since 2.7.0 / 3.7.0
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AtomicReferenceArrayAssert.java`
#### Snippet
```java
   *
   * @param <C> the type to compare.
   * @param comparator the {@link java.util.Comparator} to use
   * @param type the {@link java.lang.Class} of the type of the element or element fields the comparator should be used for
   * @return {@code this} assertions object
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AtomicReferenceArrayAssert.java`
#### Snippet
```java
   * @param <C> the type to compare.
   * @param comparator the {@link java.util.Comparator} to use
   * @param type the {@link java.lang.Class} of the type of the element or element fields the comparator should be used for
   * @return {@code this} assertions object
   * @since 2.9.0 / 3.9.0
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AtomicReferenceArrayAssert.java`
#### Snippet
```java
   *
   * @param <C> the type to compare.
   * @param comparator the {@link java.util.Comparator} to use
   * @param elementPropertyOrFieldNames the names of the properties and/or fields of the elements the comparator should be used for
   * @return {@code this} assertions object
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/OptionalDoubleAssert.java`
#### Snippet
```java

/**
 * Assertions for {@link java.util.OptionalDouble}.
 *
 * @author Jean-Christophe Gay
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractLocalTimeAssert.java`
#### Snippet
```java

  /**
   * Creates a new <code>{@link org.assertj.core.api.AbstractLocalTimeAssert}</code>.
   *
   * @param selfType the "self type"
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractStringAssert.java`
#### Snippet
```java
   * assertThat(&quot;C6PO&quot;).isEqualTo(&quot;%d%s%d%s&quot;, &quot;R&quot;, 2, &quot;D&quot;, 2);
   *
   * // assertion fails with {@link java.lang.NullPointerException}
   * assertThat(&quot;1,A,2&quot;).isEqualTo(null, 1, &quot;A&quot;, 2);
   *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractStringAssert.java`
#### Snippet
```java
   * @param expected the given {@link String} to compare the actual to.
   * @return this assertion object.
   * @see Assert#isEqualTo(java.lang.Object)
   * @since 3.13.0
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractLocalDateAssert.java`
#### Snippet
```java

  /**
   * Creates a new <code>{@link org.assertj.core.api.AbstractLocalDateAssert}</code>.
   *
   * @param selfType the "self type"
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractDoubleAssert.java`
#### Snippet
```java
   * @see #isFinite()
   * @see #isNaN()
   * @see java.lang.Double#isInfinite(double)
   * @since 3.20.0
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractDoubleAssert.java`
#### Snippet
```java
   * @see #isInfinite()
   * @see #isNaN()
   * @see java.lang.Double#isFinite(double)
   * @since 3.20.0
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractDoubleAssert.java`
#### Snippet
```java
   * @see #isFinite()
   * @see #isNaN()
   * @see java.lang.Double#isInfinite(double)
   * @since 3.19.0
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractDoubleAssert.java`
#### Snippet
```java
   * @see #isInfinite()
   * @see #isNaN()
   * @see java.lang.Double#isFinite(double)
   * @since 3.19.0
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.concurrent` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/StandardSoftAssertionsProvider.java`
#### Snippet
```java

  /**
   * Create assertion for {@link java.util.concurrent.CompletionStage} by converting it to a {@link CompletableFuture} and returning a {@link CompletableFutureAssert}.
   * <p>
   * If the given {@link java.util.concurrent.CompletionStage} is null, the {@link CompletableFuture} in the returned {@link CompletableFutureAssert} will also be null.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.concurrent` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/StandardSoftAssertionsProvider.java`
#### Snippet
```java
   * Create assertion for {@link java.util.concurrent.CompletionStage} by converting it to a {@link CompletableFuture} and returning a {@link CompletableFutureAssert}.
   * <p>
   * If the given {@link java.util.concurrent.CompletionStage} is null, the {@link CompletableFuture} in the returned {@link CompletableFutureAssert} will also be null.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.concurrent` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/StandardSoftAssertionsProvider.java`
#### Snippet
```java
   *
   * @param actual the actual value.
   * @param <RESULT> the type of the value contained in the {@link java.util.concurrent.CompletionStage}.
   *
   * @return the created assertion object.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.regex` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/StandardSoftAssertionsProvider.java`
#### Snippet
```java

  /**
   * Create assertion for {@link java.util.regex.Matcher}
   *
   * @param actual the actual matcher
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/StandardSoftAssertionsProvider.java`
#### Snippet
```java

  /**
   * Create assertion for {@link java.util.OptionalLong}.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.concurrent` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/StandardSoftAssertionsProvider.java`
#### Snippet
```java

  /**
   * Create assertion for {@link java.util.concurrent.CompletableFuture}.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.concurrent` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/StandardSoftAssertionsProvider.java`
#### Snippet
```java
   *
   * @param actual the actual value.
   * @param <RESULT> the type of the value contained in the {@link java.util.concurrent.CompletableFuture}.
   *
   * @return the created assertion object.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/StandardSoftAssertionsProvider.java`
#### Snippet
```java

  /**
   * Create assertion for {@link java.util.OptionalInt}.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/StandardSoftAssertionsProvider.java`
#### Snippet
```java

  /**
   * Create assertion for {@link java.util.Optional}.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/StandardSoftAssertionsProvider.java`
#### Snippet
```java
   *
   * @param actual the actual value.
   * @param <VALUE> the type of the value contained in the {@link java.util.Optional}.
   *
   * @return the created assertion object.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/StandardSoftAssertionsProvider.java`
#### Snippet
```java

  /**
   * Create assertion for {@link java.util.OptionalDouble}.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.concurrent` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Java6Assertions.java`
#### Snippet
```java

  /**
   * Create assertion for {@link java.util.concurrent.Future}.
   *
   * @param <RESULT> the type of the value contained in the {@link java.util.concurrent.Future}.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.concurrent` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Java6Assertions.java`
#### Snippet
```java
   * Create assertion for {@link java.util.concurrent.Future}.
   *
   * @param <RESULT> the type of the value contained in the {@link java.util.concurrent.Future}.
   * @param actual the actual value.
   *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Java6Assertions.java`
#### Snippet
```java
  /**
   * Add the given date format to the ones used to parse date String in String based Date assertions like
   * {@link org.assertj.core.api.AbstractDateAssert#isEqualTo(String)}.
   * <p>
   * User date formats are used before default ones in the order they have been registered (first registered, first
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Java6Assertions.java`
#### Snippet
```java
   * AssertJ is gonna use any date formats registered with one of these methods :
   * <ul>
   * <li>{@link org.assertj.core.api.AbstractDateAssert#withDateFormat(String)}</li>
   * <li>{@link org.assertj.core.api.AbstractDateAssert#withDateFormat(java.text.DateFormat)}</li>
   * <li>{@link #registerCustomDateFormat(java.text.DateFormat)}</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Java6Assertions.java`
#### Snippet
```java
   * <ul>
   * <li>{@link org.assertj.core.api.AbstractDateAssert#withDateFormat(String)}</li>
   * <li>{@link org.assertj.core.api.AbstractDateAssert#withDateFormat(java.text.DateFormat)}</li>
   * <li>{@link #registerCustomDateFormat(java.text.DateFormat)}</li>
   * <li>{@link #registerCustomDateFormat(String)}</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.text` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Java6Assertions.java`
#### Snippet
```java
   * <ul>
   * <li>{@link org.assertj.core.api.AbstractDateAssert#withDateFormat(String)}</li>
   * <li>{@link org.assertj.core.api.AbstractDateAssert#withDateFormat(java.text.DateFormat)}</li>
   * <li>{@link #registerCustomDateFormat(java.text.DateFormat)}</li>
   * <li>{@link #registerCustomDateFormat(String)}</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.text` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Java6Assertions.java`
#### Snippet
```java
   * <li>{@link org.assertj.core.api.AbstractDateAssert#withDateFormat(String)}</li>
   * <li>{@link org.assertj.core.api.AbstractDateAssert#withDateFormat(java.text.DateFormat)}</li>
   * <li>{@link #registerCustomDateFormat(java.text.DateFormat)}</li>
   * <li>{@link #registerCustomDateFormat(String)}</li>
   * </ul>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Java6Assertions.java`
#### Snippet
```java
   * <p>
   * To revert to default formats only, call {@link #useDefaultDateFormatsOnly()} or
   * {@link org.assertj.core.api.AbstractDateAssert#withDefaultDateFormatsOnly()}.
   * <p>
   * Code examples:
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Java6Assertions.java`
#### Snippet
```java
  /**
   * Add the given date format to the ones used to parse date String in String based Date assertions like
   * {@link org.assertj.core.api.AbstractDateAssert#isEqualTo(String)}.
   * <p>
   * User date formats are used before default ones in the order they have been registered (first registered, first
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Java6Assertions.java`
#### Snippet
```java
   * AssertJ is gonna use any date formats registered with one of these methods :
   * <ul>
   * <li>{@link org.assertj.core.api.AbstractDateAssert#withDateFormat(String)}</li>
   * <li>{@link org.assertj.core.api.AbstractDateAssert#withDateFormat(java.text.DateFormat)}</li>
   * <li>{@link #registerCustomDateFormat(java.text.DateFormat)}</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Java6Assertions.java`
#### Snippet
```java
   * <ul>
   * <li>{@link org.assertj.core.api.AbstractDateAssert#withDateFormat(String)}</li>
   * <li>{@link org.assertj.core.api.AbstractDateAssert#withDateFormat(java.text.DateFormat)}</li>
   * <li>{@link #registerCustomDateFormat(java.text.DateFormat)}</li>
   * <li>{@link #registerCustomDateFormat(String)}</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.text` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Java6Assertions.java`
#### Snippet
```java
   * <ul>
   * <li>{@link org.assertj.core.api.AbstractDateAssert#withDateFormat(String)}</li>
   * <li>{@link org.assertj.core.api.AbstractDateAssert#withDateFormat(java.text.DateFormat)}</li>
   * <li>{@link #registerCustomDateFormat(java.text.DateFormat)}</li>
   * <li>{@link #registerCustomDateFormat(String)}</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.text` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Java6Assertions.java`
#### Snippet
```java
   * <li>{@link org.assertj.core.api.AbstractDateAssert#withDateFormat(String)}</li>
   * <li>{@link org.assertj.core.api.AbstractDateAssert#withDateFormat(java.text.DateFormat)}</li>
   * <li>{@link #registerCustomDateFormat(java.text.DateFormat)}</li>
   * <li>{@link #registerCustomDateFormat(String)}</li>
   * </ul>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Java6Assertions.java`
#### Snippet
```java
   * <p>
   * To revert to default formats only, call {@link #useDefaultDateFormatsOnly()} or
   * {@link org.assertj.core.api.AbstractDateAssert#withDefaultDateFormatsOnly()}.
   * <p>
   * Code examples:
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.data` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Java6Assertions.java`
#### Snippet
```java

  /**
   * Assertions entry point for Integer {@link org.assertj.core.data.Percentage} to use with isCloseTo assertions for
   * percentages.
   * <p>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Java6Assertions.java`
#### Snippet
```java
  /**
   * Globally sets whether
   * <code>{@link org.assertj.core.api.AbstractIterableAssert#extracting(String) IterableAssert#extracting(String)}</code>
   * and
   * <code>{@link org.assertj.core.api.AbstractObjectArrayAssert#extracting(String) ObjectArrayAssert#extracting(String)}</code>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Java6Assertions.java`
#### Snippet
```java
   * <code>{@link org.assertj.core.api.AbstractIterableAssert#extracting(String) IterableAssert#extracting(String)}</code>
   * and
   * <code>{@link org.assertj.core.api.AbstractObjectArrayAssert#extracting(String) ObjectArrayAssert#extracting(String)}</code>
   * should be allowed to extract private fields, if not and they try it fails with exception.
   *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.data` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Java6Assertions.java`
#### Snippet
```java

  /**
   * Assertions entry point for Double {@link org.assertj.core.data.Percentage} to use with isCloseTo assertions for
   * percentages.
   * <p>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Java6Assertions.java`
#### Snippet
```java
   * <ul>
   * <li>
   * <code>{@link org.assertj.core.api.AbstractIterableAssert#usingElementComparatorOnFields(java.lang.String...)}</code>
   * </li>
   * <li><code>{@link org.assertj.core.api.AbstractObjectAssert#isEqualToComparingFieldByField(Object)}</code></li>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Java6Assertions.java`
#### Snippet
```java
   * <ul>
   * <li>
   * <code>{@link org.assertj.core.api.AbstractIterableAssert#usingElementComparatorOnFields(java.lang.String...)}</code>
   * </li>
   * <li><code>{@link org.assertj.core.api.AbstractObjectAssert#isEqualToComparingFieldByField(Object)}</code></li>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Java6Assertions.java`
#### Snippet
```java
   * <code>{@link org.assertj.core.api.AbstractIterableAssert#usingElementComparatorOnFields(java.lang.String...)}</code>
   * </li>
   * <li><code>{@link org.assertj.core.api.AbstractObjectAssert#isEqualToComparingFieldByField(Object)}</code></li>
   * </ul>
   *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.data` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Java6Assertions.java`
#### Snippet
```java

  /**
   * Assertions entry point for Long {@link org.assertj.core.data.Percentage} to use with isCloseTo assertions for
   * percentages.
   * <p>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractIterableAssert.java`
#### Snippet
```java
   *
   * @param <T> the type of elements to compare.
   * @param comparator the {@link java.util.Comparator} to use
   * @param type the {@link java.lang.Class} of the type of the element fields the comparator should be used for
   * @return {@code this} assertions object
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractIterableAssert.java`
#### Snippet
```java
   * @param <T> the type of elements to compare.
   * @param comparator the {@link java.util.Comparator} to use
   * @param type the {@link java.lang.Class} of the type of the element fields the comparator should be used for
   * @return {@code this} assertions object
   * @since 2.5.0 / 3.5.0
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractIterableAssert.java`
#### Snippet
```java
   *   <li>Exclusion of primitive fields</li>
   *   <li>Inclusion of Java Class Library types in the recursive execution</li>
   *   <li>Treatment of {@link java.util.Collection} and array objects</li>
   *   <li>Treatment of {@link java.util.Map} objects</li>
   *   <li>Treatment of Optional and primitive Optional objects</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractIterableAssert.java`
#### Snippet
```java
   *   <li>Inclusion of Java Class Library types in the recursive execution</li>
   *   <li>Treatment of {@link java.util.Collection} and array objects</li>
   *   <li>Treatment of {@link java.util.Map} objects</li>
   *   <li>Treatment of Optional and primitive Optional objects</li>
   * </ul>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractIterableAssert.java`
#### Snippet
```java
   *
   * @param <T> the type of elements to compare.
   * @param comparator the {@link java.util.Comparator} to use
   * @param type the {@link java.lang.Class} of the type of the element or element fields the comparator should be used for
   * @return {@code this} assertions object
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractIterableAssert.java`
#### Snippet
```java
   * @param <T> the type of elements to compare.
   * @param comparator the {@link java.util.Comparator} to use
   * @param type the {@link java.lang.Class} of the type of the element or element fields the comparator should be used for
   * @return {@code this} assertions object
   * @since 2.9.0 / 3.9.0
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractIterableAssert.java`
#### Snippet
```java
   *
   * @param <T> the type of elements to compare.
   * @param comparator the {@link java.util.Comparator} to use
   * @param elementPropertyOrFieldNames the names of the properties and/or fields of the elements the comparator should be used for
   * @return {@code this} assertions object
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.function` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractIterableAssert.java`
#### Snippet
```java
   *
   * <p>This method enables recursive asserting using default configuration, which means all fields of all objects have the   
   * {@link java.util.function.Predicate} applied to them (including primitive fields), no fields are excluded, but:
   * <ul>
   *   <li>The recursion does not enter into Java Class Library types (java.*, javax.*)</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.function` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractIterableAssert.java`
#### Snippet
```java
   * <ul>
   *   <li>The recursion does not enter into Java Class Library types (java.*, javax.*)</li>
   *   <li>The {@link java.util.function.Predicate} is applied to {@link java.util.Collection} and array elements (but the collection/array itself)</li>
   *   <li>The {@link java.util.function.Predicate} is applied to {@link java.util.Map} values but not the map itself or its keys</li>
   *   <li>The {@link java.util.function.Predicate} is applied to {@link java.util.Optional} and primitive optional values</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractIterableAssert.java`
#### Snippet
```java
   * <ul>
   *   <li>The recursion does not enter into Java Class Library types (java.*, javax.*)</li>
   *   <li>The {@link java.util.function.Predicate} is applied to {@link java.util.Collection} and array elements (but the collection/array itself)</li>
   *   <li>The {@link java.util.function.Predicate} is applied to {@link java.util.Map} values but not the map itself or its keys</li>
   *   <li>The {@link java.util.function.Predicate} is applied to {@link java.util.Optional} and primitive optional values</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.function` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractIterableAssert.java`
#### Snippet
```java
   *   <li>The recursion does not enter into Java Class Library types (java.*, javax.*)</li>
   *   <li>The {@link java.util.function.Predicate} is applied to {@link java.util.Collection} and array elements (but the collection/array itself)</li>
   *   <li>The {@link java.util.function.Predicate} is applied to {@link java.util.Map} values but not the map itself or its keys</li>
   *   <li>The {@link java.util.function.Predicate} is applied to {@link java.util.Optional} and primitive optional values</li>
   * </ul>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractObjectArrayAssert.java`
#### Snippet
```java
   *
   * @param <C> the type of elements to compare.
   * @param comparator the {@link java.util.Comparator} to use
   * @param elementPropertyOrFieldNames the names of the properties and/or fields of the elements the comparator should be used for
   * @return {@code this} assertions object
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractObjectArrayAssert.java`
#### Snippet
```java
   *
   * @param <C> the type of elements to compare.
   * @param comparator the {@link java.util.Comparator} to use
   * @param type the {@link java.lang.Class} of the type of the element or element fields the comparator should be used for
   * @return {@code this} assertions object
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractObjectArrayAssert.java`
#### Snippet
```java
   * @param <C> the type of elements to compare.
   * @param comparator the {@link java.util.Comparator} to use
   * @param type the {@link java.lang.Class} of the type of the element or element fields the comparator should be used for
   * @return {@code this} assertions object
   * @since 2.9.0 / 3.9.0
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractObjectArrayAssert.java`
#### Snippet
```java
   *   <li>Exclusion of primitive fields</li>
   *   <li>Inclusion of Java Class Library types in the recursive execution</li>
   *   <li>Treatment of {@link java.util.Collection} and array objects</li>
   *   <li>Treatment of {@link java.util.Map} objects</li>
   *   <li>Treatment of Optional and primitive Optional objects</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractObjectArrayAssert.java`
#### Snippet
```java
   *   <li>Inclusion of Java Class Library types in the recursive execution</li>
   *   <li>Treatment of {@link java.util.Collection} and array objects</li>
   *   <li>Treatment of {@link java.util.Map} objects</li>
   *   <li>Treatment of Optional and primitive Optional objects</li>
   * </ul>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.function` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractObjectArrayAssert.java`
#### Snippet
```java
   *
   * <p>This method enables recursive asserting using default configuration, which means all fields of all objects have the  
   * {@link java.util.function.Predicate} applied to them (including primitive fields), no fields are excluded, but:
   * <ul>
   *   <li>The recursion does not enter into Java Class Library types (java.*, javax.*)</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.function` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractObjectArrayAssert.java`
#### Snippet
```java
   * <ul>
   *   <li>The recursion does not enter into Java Class Library types (java.*, javax.*)</li>
   *   <li>The {@link java.util.function.Predicate} is applied to {@link java.util.Collection} and array elements (but the collection/array itself)</li>
   *   <li>The {@link java.util.function.Predicate} is applied to {@link java.util.Map} values but not the map itself or its keys</li>
   *   <li>The {@link java.util.function.Predicate} is applied to {@link java.util.Optional} and primitive optional values</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractObjectArrayAssert.java`
#### Snippet
```java
   * <ul>
   *   <li>The recursion does not enter into Java Class Library types (java.*, javax.*)</li>
   *   <li>The {@link java.util.function.Predicate} is applied to {@link java.util.Collection} and array elements (but the collection/array itself)</li>
   *   <li>The {@link java.util.function.Predicate} is applied to {@link java.util.Map} values but not the map itself or its keys</li>
   *   <li>The {@link java.util.function.Predicate} is applied to {@link java.util.Optional} and primitive optional values</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractIterableAssert.java`
#### Snippet
```java
   *   <li>The recursion does not enter into Java Class Library types (java.*, javax.*)</li>
   *   <li>The {@link java.util.function.Predicate} is applied to {@link java.util.Collection} and array elements (but the collection/array itself)</li>
   *   <li>The {@link java.util.function.Predicate} is applied to {@link java.util.Map} values but not the map itself or its keys</li>
   *   <li>The {@link java.util.function.Predicate} is applied to {@link java.util.Optional} and primitive optional values</li>
   * </ul>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.function` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractObjectArrayAssert.java`
#### Snippet
```java
   *   <li>The recursion does not enter into Java Class Library types (java.*, javax.*)</li>
   *   <li>The {@link java.util.function.Predicate} is applied to {@link java.util.Collection} and array elements (but the collection/array itself)</li>
   *   <li>The {@link java.util.function.Predicate} is applied to {@link java.util.Map} values but not the map itself or its keys</li>
   *   <li>The {@link java.util.function.Predicate} is applied to {@link java.util.Optional} and primitive optional values</li>
   * </ul>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractObjectArrayAssert.java`
#### Snippet
```java
   *   <li>The recursion does not enter into Java Class Library types (java.*, javax.*)</li>
   *   <li>The {@link java.util.function.Predicate} is applied to {@link java.util.Collection} and array elements (but the collection/array itself)</li>
   *   <li>The {@link java.util.function.Predicate} is applied to {@link java.util.Map} values but not the map itself or its keys</li>
   *   <li>The {@link java.util.function.Predicate} is applied to {@link java.util.Optional} and primitive optional values</li>
   * </ul>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.function` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractObjectArrayAssert.java`
#### Snippet
```java
   *   <li>The {@link java.util.function.Predicate} is applied to {@link java.util.Collection} and array elements (but the collection/array itself)</li>
   *   <li>The {@link java.util.function.Predicate} is applied to {@link java.util.Map} values but not the map itself or its keys</li>
   *   <li>The {@link java.util.function.Predicate} is applied to {@link java.util.Optional} and primitive optional values</li>
   * </ul>
   *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractObjectArrayAssert.java`
#### Snippet
```java
   *
   * @param <C> the type of elements to compare.
   * @param comparator the {@link java.util.Comparator} to use
   * @param type the {@link java.lang.Class} of the type of the element fields the comparator should be used for
   * @return {@code this} assertions object
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractObjectArrayAssert.java`
#### Snippet
```java
   * @param <C> the type of elements to compare.
   * @param comparator the {@link java.util.Comparator} to use
   * @param type the {@link java.lang.Class} of the type of the element fields the comparator should be used for
   * @return {@code this} assertions object
   * @since 2.5.0 / 3.5.0
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.function` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractIterableAssert.java`
#### Snippet
```java
   *   <li>The {@link java.util.function.Predicate} is applied to {@link java.util.Collection} and array elements (but the collection/array itself)</li>
   *   <li>The {@link java.util.function.Predicate} is applied to {@link java.util.Map} values but not the map itself or its keys</li>
   *   <li>The {@link java.util.function.Predicate} is applied to {@link java.util.Optional} and primitive optional values</li>
   * </ul>
   *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.function` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/RecursiveAssertionAssert.java`
#### Snippet
```java
   *
   * <p>This method enables recursive asserting using default configuration, which means all fields of all objects have the  
   * {@link java.util.function.Predicate} applied to them (including primitive fields), no fields are excluded, but:
   * <ul>
   *   <li>The recursion does not enter into Java Class Library types (java.*, javax.*)</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.function` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/RecursiveAssertionAssert.java`
#### Snippet
```java
   * <ul>
   *   <li>The recursion does not enter into Java Class Library types (java.*, javax.*)</li>
   *   <li>The {@link java.util.function.Predicate} is applied to {@link java.util.Collection} and array elements (but the collection/array itself)</li>
   *   <li>The {@link java.util.function.Predicate} is applied to {@link java.util.Map} values but not the map itself or its keys</li>
   *   <li>The {@link java.util.function.Predicate} is applied to {@link java.util.Optional} and primitive optional values</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.function` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/RecursiveAssertionAssert.java`
#### Snippet
```java
   *   <li>The recursion does not enter into Java Class Library types (java.*, javax.*)</li>
   *   <li>The {@link java.util.function.Predicate} is applied to {@link java.util.Collection} and array elements (but the collection/array itself)</li>
   *   <li>The {@link java.util.function.Predicate} is applied to {@link java.util.Map} values but not the map itself or its keys</li>
   *   <li>The {@link java.util.function.Predicate} is applied to {@link java.util.Optional} and primitive optional values</li>
   * </ul>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.function` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/RecursiveAssertionAssert.java`
#### Snippet
```java
   *   <li>The {@link java.util.function.Predicate} is applied to {@link java.util.Collection} and array elements (but the collection/array itself)</li>
   *   <li>The {@link java.util.function.Predicate} is applied to {@link java.util.Map} values but not the map itself or its keys</li>
   *   <li>The {@link java.util.function.Predicate} is applied to {@link java.util.Optional} and primitive optional values</li>
   * </ul>
   *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.regex` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDSoftAssertionsProvider.java`
#### Snippet
```java

  /**
   * Create assertion for {@link java.util.regex.Matcher}.
   *
   * @param actual the actual matcher
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.concurrent` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDSoftAssertionsProvider.java`
#### Snippet
```java

  /**
   * Create assertion for {@link java.util.concurrent.CompletionStage} by converting it to a {@link CompletableFuture} and returning a {@link CompletableFutureAssert}.
   * <p>
   * If the given {@link java.util.concurrent.CompletionStage} is null, the {@link CompletableFuture} in the returned {@link CompletableFutureAssert} will also be null.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.concurrent` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDSoftAssertionsProvider.java`
#### Snippet
```java
   * Create assertion for {@link java.util.concurrent.CompletionStage} by converting it to a {@link CompletableFuture} and returning a {@link CompletableFutureAssert}.
   * <p>
   * If the given {@link java.util.concurrent.CompletionStage} is null, the {@link CompletableFuture} in the returned {@link CompletableFutureAssert} will also be null.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.concurrent` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDSoftAssertionsProvider.java`
#### Snippet
```java
   *
   * @param actual the actual value.
   * @param <RESULT> the type of the value contained in the {@link java.util.concurrent.CompletionStage}.
   *
   * @return the created assertion object.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDSoftAssertionsProvider.java`
#### Snippet
```java

  /**
   * Create assertion for {@link java.util.OptionalLong}.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDSoftAssertionsProvider.java`
#### Snippet
```java

  /**
   * Create assertion for {@link java.util.OptionalInt}.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.concurrent` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDSoftAssertionsProvider.java`
#### Snippet
```java

  /**
   * Create assertion for {@link java.util.concurrent.CompletableFuture}.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.concurrent` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDSoftAssertionsProvider.java`
#### Snippet
```java
   *
   * @param actual the actual value.
   * @param <RESULT> the type of the value contained in the {@link java.util.concurrent.CompletableFuture}.
   *
   * @return the created assertion object.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDSoftAssertionsProvider.java`
#### Snippet
```java

  /**
   * Create assertion for {@link java.util.OptionalDouble}.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/GenericComparableAssert.java`
#### Snippet
```java

/**
 * Concrete generic <code>{@link ComparableAssert}</code> to be used through {@link Assertions#assertThat(java.lang.Comparable)}.
 * @param <ACTUAL> the type of the "actual" value.
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/PeriodAssert.java`
#### Snippet
```java

/**
 * Assertion methods for {@link java.time.Period}
 *
 * @author Hayden Meloche
```

### UnnecessaryFullyQualifiedName
Qualifier `java.net` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/UriAssert.java`
#### Snippet
```java

/**
 * Assertion class for {@link java.net.URI}s
 */
public class UriAssert extends AbstractUriAssert<UriAssert> {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractIteratorAssert.java`
#### Snippet
```java

  /**
   * Creates a new <code>{@link org.assertj.core.api.AbstractIteratorAssert}</code>.
   *
   * @param actual the actual value to verify
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.concurrent` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/WithAssumptions.java`
#### Snippet
```java

  /**
   * Creates a new instance of {@link CompletableFutureAssert} assumption for a {@link java.util.concurrent.CompletionStage}
   * by converting it to a {@link CompletableFuture} and returning a {@link CompletableFutureAssert}.
   * <p>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.concurrent` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/WithAssumptions.java`
#### Snippet
```java
   * by converting it to a {@link CompletableFuture} and returning a {@link CompletableFutureAssert}.
   * <p>
   * If the given {@link java.util.concurrent.CompletionStage} is null, the {@link CompletableFuture} in the returned {@link CompletableFutureAssert} will also be null.
   *
   * @param <RESULT> the CompletableFuture wrapped type.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssumptions.java`
#### Snippet
```java

  /**
   * Creates a new assumption's instance for a {@link java.time.Period} value.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.concurrent` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/WithAssumptions.java`
#### Snippet
```java
   *
   * @param actual the actual value.
   * @param <RESULT> the type of the value contained in the {@link java.util.concurrent.Future}.
   *
   * @return the created assumption for assertion object.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/OffsetDateTimeAssert.java`
#### Snippet
```java

  /**
   * Creates a new <code>{@link org.assertj.core.api.OffsetDateTimeAssert}</code>.
   *
   * @param actual the actual value to verify
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractCharSequenceAssert.java`
#### Snippet
```java
   * <p>
   * If you want to accept a {@code null} value as well as a 0 length, use
   * {@link org.assertj.core.api.AbstractCharSequenceAssert#isNullOrEmpty()} instead.
   * <p>
   * This assertion will succeed:
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractCharSequenceAssert.java`
#### Snippet
```java
   * <p>
   * If you do not want to accept a {@code null} value, use
   * {@link org.assertj.core.api.AbstractCharSequenceAssert#isEmpty()} instead.
   * <p>
   * Both of these assertions will succeed:
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Java6BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.BooleanAssert}</code>.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Java6BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.CharSequenceAssert}</code> from a {@link StringBuffer}.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Java6BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.ShortAssert}</code>.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Java6BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.CharacterAssert}</code>.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Java6BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.IterableAssert}</code>.
   *
   * @param <T> the actual elements type
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Java6BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.BigDecimalAssert}</code>.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Java6BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.FloatAssert}</code>.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Java6BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.FileAssert}</code>.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Java6BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.IntegerAssert}</code>.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Java6BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.BooleanAssert}</code>.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Java6BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.Boolean2DArrayAssert}</code>.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Java6BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.Byte2DArrayAssert}</code>.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Java6BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.ByteAssert}</code>.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Java6BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.Float2DArrayAssert}</code>.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Java6BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.ClassAssert}</code>
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Java6BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.FloatArrayAssert}</code>.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Java6BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.ObjectArrayAssert}</code>.
   *
   * @param <T> the actual elements type
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Java6BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.LongAssert}</code>.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Java6BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.BigIntegerAssert}</code>.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Java6BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.Int2DArrayAssert}</code>.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Java6BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.IntArrayAssert}</code>.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Java6BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.CharacterAssert}</code>.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Java6BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.InputStreamAssert}</code>.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Java6BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.CharArrayAssert}</code>.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Java6BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.DoubleAssert}</code>.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Java6BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.FloatAssert}</code>.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Java6BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.ByteArrayAssert}</code>.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Java6BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.Object2DArrayAssert}</code>.
   *
   * @param <T> the actual elements type
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Java6BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.LongAssert}</code>.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Java6BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.CharSequenceAssert}</code>.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Java6BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.FutureAssert}</code>.
   *
   * @param <RESULT> the type of the value contained in the {@link java.util.concurrent.Future}.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.concurrent` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Java6BDDAssertions.java`
#### Snippet
```java
   * Creates a new instance of <code>{@link org.assertj.core.api.FutureAssert}</code>.
   *
   * @param <RESULT> the type of the value contained in the {@link java.util.concurrent.Future}.
   * @param actual the future to test
   * @return the created assertion object
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Java6BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.BooleanArrayAssert}</code>.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Java6BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.ByteAssert}</code>.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Java6BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new <code>{@link org.assertj.core.api.BDDAssertions}</code>.
   */
  protected Java6BDDAssertions() {}
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Java6BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.GenericComparableAssert}</code> with
   * standard comparison semantics.
   *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Java6BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.Long2DArrayAssert}</code>.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Java6BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.ListAssert}</code>.
   *
   * @param <T> the actual elements type
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Java6BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.DateAssert}</code>.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Java6BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.ObjectAssert}</code>.
   *
   * @param <T> the actual type
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Java6BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.ShortArrayAssert}</code>.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Java6BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.LongArrayAssert}</code>.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Java6BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.DoubleAssert}</code>.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Java6BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.CharSequenceAssert}</code> from a {@link StringBuilder}.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Java6BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.DoubleArrayAssert}</code>.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Java6BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.IntegerAssert}</code>.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Java6BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.Short2DArrayAssert}</code>.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Java6BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.ShortAssert}</code>.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Java6BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.Char2DArrayAssert}</code>.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Java6BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.Double2DArrayAssert}</code>.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Java6BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.ClassLoaderAssert}</code>
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Java6BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.ObjectAssert}</code> for any object.
   * <p>
   * This overload is useful, when an overloaded method of then(...) takes precedence over the generic {@link #then(Object)}.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Java6BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.MapAssert}</code>.
   *
   * @param <K> the type of keys in the map.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Java6BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.StringAssert}</code>.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.concurrent` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Java6BDDSoftAssertionsProvider.java`
#### Snippet
```java
   * Creates a new instance of <code>{@link FutureAssert}</code>.
   *
   * @param <RESULT> the type of the value contained in the {@link java.util.concurrent.Future}.
   * @param actual the actual value.
   * @return the created assertion object.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Java6BDDSoftAssertionsProvider.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.ObjectAssert}</code> for any object.
   *
   * <p>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AssertionsForClassTypes.java`
#### Snippet
```java
   * The following (incomplete) list of methods will be impacted by this change :
   * <ul>
   * <li><code>{@link org.assertj.core.api.AbstractIterableAssert#usingElementComparatorOnFields(java.lang.String...)}</code></li>
   * <li><code>{@link org.assertj.core.api.AbstractObjectAssert#isEqualToComparingFieldByField(Object)}</code></li>
   * </ul>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AssertionsForClassTypes.java`
#### Snippet
```java
   * The following (incomplete) list of methods will be impacted by this change :
   * <ul>
   * <li><code>{@link org.assertj.core.api.AbstractIterableAssert#usingElementComparatorOnFields(java.lang.String...)}</code></li>
   * <li><code>{@link org.assertj.core.api.AbstractObjectAssert#isEqualToComparingFieldByField(Object)}</code></li>
   * </ul>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AssertionsForClassTypes.java`
#### Snippet
```java
   * <ul>
   * <li><code>{@link org.assertj.core.api.AbstractIterableAssert#usingElementComparatorOnFields(java.lang.String...)}</code></li>
   * <li><code>{@link org.assertj.core.api.AbstractObjectAssert#isEqualToComparingFieldByField(Object)}</code></li>
   * </ul>
   *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.data` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AssertionsForClassTypes.java`
#### Snippet
```java

  /**
   * Assertions entry point for Long {@link org.assertj.core.data.Percentage} to use with isCloseTo assertions for
   * percentages.
   * <p>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.concurrent` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AssertionsForClassTypes.java`
#### Snippet
```java

  /**
   * Create assertion for {@link java.util.concurrent.CompletableFuture}.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.concurrent` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AssertionsForClassTypes.java`
#### Snippet
```java
   *
   * @param actual the actual value.
   * @param <RESULT> the type of the value contained in the {@link java.util.concurrent.CompletableFuture}.
   *
   * @return the created assertion object.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AssertionsForClassTypes.java`
#### Snippet
```java
  /**
   * Add the given date format to the ones used to parse date String in String based Date assertions like
   * {@link org.assertj.core.api.AbstractDateAssert#isEqualTo(String)}.
   * <p>
   * User date formats are used before default ones in the order they have been registered (first registered, first
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AssertionsForClassTypes.java`
#### Snippet
```java
   * AssertJ is gonna use any date formats registered with one of these methods :
   * <ul>
   * <li>{@link org.assertj.core.api.AbstractDateAssert#withDateFormat(String)}</li>
   * <li>{@link org.assertj.core.api.AbstractDateAssert#withDateFormat(java.text.DateFormat)}</li>
   * <li>{@link #registerCustomDateFormat(java.text.DateFormat)}</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AssertionsForClassTypes.java`
#### Snippet
```java
   * <ul>
   * <li>{@link org.assertj.core.api.AbstractDateAssert#withDateFormat(String)}</li>
   * <li>{@link org.assertj.core.api.AbstractDateAssert#withDateFormat(java.text.DateFormat)}</li>
   * <li>{@link #registerCustomDateFormat(java.text.DateFormat)}</li>
   * <li>{@link #registerCustomDateFormat(String)}</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.text` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AssertionsForClassTypes.java`
#### Snippet
```java
   * <ul>
   * <li>{@link org.assertj.core.api.AbstractDateAssert#withDateFormat(String)}</li>
   * <li>{@link org.assertj.core.api.AbstractDateAssert#withDateFormat(java.text.DateFormat)}</li>
   * <li>{@link #registerCustomDateFormat(java.text.DateFormat)}</li>
   * <li>{@link #registerCustomDateFormat(String)}</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.text` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AssertionsForClassTypes.java`
#### Snippet
```java
   * <li>{@link org.assertj.core.api.AbstractDateAssert#withDateFormat(String)}</li>
   * <li>{@link org.assertj.core.api.AbstractDateAssert#withDateFormat(java.text.DateFormat)}</li>
   * <li>{@link #registerCustomDateFormat(java.text.DateFormat)}</li>
   * <li>{@link #registerCustomDateFormat(String)}</li>
   * </ul>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AssertionsForClassTypes.java`
#### Snippet
```java
   * <p>
   * To revert to default formats only, call {@link #useDefaultDateFormatsOnly()} or
   * {@link org.assertj.core.api.AbstractDateAssert#withDefaultDateFormatsOnly()}.
   * <p>
   * Code examples:
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AssertionsForClassTypes.java`
#### Snippet
```java

  /**
   * Create assertion for {@link java.util.OptionalInt}.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AssertionsForClassTypes.java`
#### Snippet
```java

  /**
   * Create assertion for {@link java.util.OptionalDouble}.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.regex` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AssertionsForClassTypes.java`
#### Snippet
```java

  /**
   * Create assertion for {@link java.util.regex.Matcher}
   *
   * @param actual the actual value
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AssertionsForClassTypes.java`
#### Snippet
```java
  /**
   * Add the given date format to the ones used to parse date String in String based Date assertions like
   * {@link org.assertj.core.api.AbstractDateAssert#isEqualTo(String)}.
   * <p>
   * User date formats are used before default ones in the order they have been registered (first registered, first
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AssertionsForClassTypes.java`
#### Snippet
```java
   * AssertJ is gonna use any date formats registered with one of these methods :
   * <ul>
   * <li>{@link org.assertj.core.api.AbstractDateAssert#withDateFormat(String)}</li>
   * <li>{@link org.assertj.core.api.AbstractDateAssert#withDateFormat(java.text.DateFormat)}</li>
   * <li>{@link #registerCustomDateFormat(java.text.DateFormat)}</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AssertionsForClassTypes.java`
#### Snippet
```java
   * <ul>
   * <li>{@link org.assertj.core.api.AbstractDateAssert#withDateFormat(String)}</li>
   * <li>{@link org.assertj.core.api.AbstractDateAssert#withDateFormat(java.text.DateFormat)}</li>
   * <li>{@link #registerCustomDateFormat(java.text.DateFormat)}</li>
   * <li>{@link #registerCustomDateFormat(String)}</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.text` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AssertionsForClassTypes.java`
#### Snippet
```java
   * <ul>
   * <li>{@link org.assertj.core.api.AbstractDateAssert#withDateFormat(String)}</li>
   * <li>{@link org.assertj.core.api.AbstractDateAssert#withDateFormat(java.text.DateFormat)}</li>
   * <li>{@link #registerCustomDateFormat(java.text.DateFormat)}</li>
   * <li>{@link #registerCustomDateFormat(String)}</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.text` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AssertionsForClassTypes.java`
#### Snippet
```java
   * <li>{@link org.assertj.core.api.AbstractDateAssert#withDateFormat(String)}</li>
   * <li>{@link org.assertj.core.api.AbstractDateAssert#withDateFormat(java.text.DateFormat)}</li>
   * <li>{@link #registerCustomDateFormat(java.text.DateFormat)}</li>
   * <li>{@link #registerCustomDateFormat(String)}</li>
   * </ul>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AssertionsForClassTypes.java`
#### Snippet
```java
   * <p>
   * To revert to default formats only, call {@link #useDefaultDateFormatsOnly()} or
   * {@link org.assertj.core.api.AbstractDateAssert#withDefaultDateFormatsOnly()}.
   * <p>
   * Code examples:
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.data` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AssertionsForClassTypes.java`
#### Snippet
```java

  /**
   * Assertions entry point for Integer {@link org.assertj.core.data.Percentage} to use with isCloseTo assertions for
   * percentages.
   * <p>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AssertionsForClassTypes.java`
#### Snippet
```java

  /**
   * Create assertion for {@link java.util.OptionalInt}.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AssertionsForClassTypes.java`
#### Snippet
```java

  /**
   * Create assertion for {@link java.util.Optional}.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AssertionsForClassTypes.java`
#### Snippet
```java
   *
   * @param actual the actual value.
   * @param <VALUE> the type of the value contained in the {@link java.util.Optional}.
   *
   * @return the created assertion object.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AssertionsForClassTypes.java`
#### Snippet
```java
  /**
   * Globally sets whether
   * <code>{@link org.assertj.core.api.AbstractIterableAssert#extracting(String) IterableAssert#extracting(String)}</code>
   * and
   * <code>{@link org.assertj.core.api.AbstractObjectArrayAssert#extracting(String) ObjectArrayAssert#extracting(String)}</code>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AssertionsForClassTypes.java`
#### Snippet
```java
   * <code>{@link org.assertj.core.api.AbstractIterableAssert#extracting(String) IterableAssert#extracting(String)}</code>
   * and
   * <code>{@link org.assertj.core.api.AbstractObjectArrayAssert#extracting(String) ObjectArrayAssert#extracting(String)}</code>
   * should be allowed to extract private fields, if not and they try it fails with exception.
   *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AssertionsForClassTypes.java`
#### Snippet
```java

  /**
   * Create assertion for {@link java.time.OffsetTime}.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AssertionsForClassTypes.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link java.time.OffsetDateTime}</code>.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.data` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AssertionsForClassTypes.java`
#### Snippet
```java

  /**
   * Assertions entry point for Double {@link org.assertj.core.data.Percentage} to use with isCloseTo assertions for
   * percentages.
   * <p>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/OptionalLongAssert.java`
#### Snippet
```java

/**
 * Assertions for {@link java.util.OptionalLong}.
 *
 * @author Jean-Christophe Gay
```

### UnnecessaryFullyQualifiedName
Qualifier `java.net` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractUrlAssert.java`
#### Snippet
```java
 *
 * @param <SELF> the "self" type of this assertion class.
 * @see java.net.URL
 */
public abstract class AbstractUrlAssert<SELF extends AbstractUrlAssert<SELF>> extends AbstractAssert<SELF, URL> {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/ThrowableAssertAlternative.java`
#### Snippet
```java

/**
 * Assertion methods for {@link java.lang.Throwable} similar to {@link ThrowableAssert} but with assertions methods named
 * differently to make testing code fluent (ex : <code>withMessage</code> instead of <code>hasMessage</code>.
 * <pre><code class='java'> assertThatExceptionOfType(IOException.class)
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractTemporalAssert.java`
#### Snippet
```java

  /**
   * Creates a new <code>{@link org.assertj.core.api.AbstractTemporalAssert}</code>.
   * @param selfType the "self type"
   * @param actual the actual value to verify
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.concurrent` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AssertionsForInterfaceTypes.java`
#### Snippet
```java

  /**
   * Create assertion for {@link java.util.concurrent.CompletionStage} by converting it to a {@link CompletableFuture} and returning a {@link CompletableFutureAssert}.
   * <p>
   * If the given {@link java.util.concurrent.CompletionStage} is null, the {@link CompletableFuture} in the returned {@link CompletableFutureAssert} will also be null.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.concurrent` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AssertionsForInterfaceTypes.java`
#### Snippet
```java
   * Create assertion for {@link java.util.concurrent.CompletionStage} by converting it to a {@link CompletableFuture} and returning a {@link CompletableFutureAssert}.
   * <p>
   * If the given {@link java.util.concurrent.CompletionStage} is null, the {@link CompletableFuture} in the returned {@link CompletableFutureAssert} will also be null.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.concurrent` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AssertionsForInterfaceTypes.java`
#### Snippet
```java
   *
   * @param actual the actual value.
   * @param <RESULT> the type of the value contained in the {@link java.util.concurrent.CompletionStage}.
   *
   * @return the created assertion object.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/RecursiveComparisonAssert.java`
#### Snippet
```java
   *
   * @param <T> the class type to register a comparator for
   * @param comparator the {@link java.util.Comparator Comparator} to use to compare the given fields
   * @param type the type to be compared with the given comparator.
   *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/RecursiveComparisonAssert.java`
#### Snippet
```java
   *                  .isEqualTo(reallyTallFrodo);</code></pre>
   *
   * @param comparator the {@link java.util.Comparator Comparator} to use to compare the given fields
   * @param fieldLocations the location from the root object of the fields the comparator should be used for
   * @return this {@link RecursiveComparisonAssert} to chain other methods.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractFileAssert.java`
#### Snippet
```java
   * @throws AssertionError if the actual {@code File} does not have the expected name.
   *
   * @see java.io.File#getName() name definition.
   * @see #hasFileName(String)
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractFileAssert.java`
#### Snippet
```java
   * @throws AssertionError if the actual {@code File} parent is not equal to the expected one.
   *
   * @see java.io.File#getParentFile() parent definition.
   */
  public SELF hasParent(File expected) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractFileAssert.java`
#### Snippet
```java
   * @throws AssertionError if the actual {@code File} does not have the expected name.
   *
   * @see java.io.File#getName() name definition.
   * @see #hasName(String)
   * @since 3.21.0
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractFileAssert.java`
#### Snippet
```java

  /**
   * Same as {@link #hasParent(java.io.File)} but takes care of converting given {@code String} as {@code File} for you
   *
   * <p>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/recursive/assertion/RecursiveAssertionConfiguration.java`
#### Snippet
```java
    RecursiveAssertionConfiguration that = (RecursiveAssertionConfiguration) o;
    return shouldIgnoreAllNullFields() == that.shouldIgnoreAllNullFields()
           && java.util.Objects.equals(getIgnoredFields(), that.getIgnoredFields())
           && java.util.Objects.equals(getIgnoredFieldsRegexes(), that.getIgnoredFieldsRegexes())
           && shouldIgnorePrimitiveFields() == that.shouldIgnorePrimitiveFields()
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/recursive/assertion/RecursiveAssertionConfiguration.java`
#### Snippet
```java
    return shouldIgnoreAllNullFields() == that.shouldIgnoreAllNullFields()
           && java.util.Objects.equals(getIgnoredFields(), that.getIgnoredFields())
           && java.util.Objects.equals(getIgnoredFieldsRegexes(), that.getIgnoredFieldsRegexes())
           && shouldIgnorePrimitiveFields() == that.shouldIgnorePrimitiveFields()
           && shouldSkipJavaLibraryTypeObjects() == that.shouldSkipJavaLibraryTypeObjects()
```

### UnnecessaryFullyQualifiedName
Qualifier `java.text` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractDateAssert.java`
#### Snippet
```java
   * <li>{@link #withDateFormat(String)}</li>
   * <li>this method</li>
   * <li>{@link #registerCustomDateFormat(java.text.DateFormat)}</li>
   * <li>{@link #registerCustomDateFormat(String)}</li>
   * </ul>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractDateAssert.java`
#### Snippet
```java

  /**
   * Same assertion as {@link #isBetween(Date, Date)} but given period is represented with {@link java.time.Instant}.
   * <p>
   * Example:
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractDateAssert.java`
#### Snippet
```java
   *
   * If you want to assert that two dates are in the same second time window use
   * {@link #isInSameSecondWindowAs(java.util.Date) isInSameSecondWindowAs} assertion.
   * <p>
   * If you want to compare second fields only (without minute, hour, day, month and year), you could write :
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractDateAssert.java`
#### Snippet
```java

  /**
   * Same assertion as {@link #isBetween(Date, Date, boolean, boolean)} but given period is represented with {@link java.time.Instant}.
   * <p>
   * Example:
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractDateAssert.java`
#### Snippet
```java
   *
   * If you want to assert that two dates are chronologically in the same hour time window use
   * {@link #isInSameHourWindowAs(java.util.Date) isInSameHourWindowAs} assertion (note that if
   * <code>isInSameHourAs</code> succeeds then <code>isInSameHourWindowAs</code> will succeed too).
   * <p>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.text` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractDateAssert.java`
#### Snippet
```java
   * <ul>
   * <li>this method</li>
   * <li>{@link #withDateFormat(java.text.DateFormat)}</li>
   * <li>{@link #registerCustomDateFormat(java.text.DateFormat)}</li>
   * <li>{@link #registerCustomDateFormat(String)}</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.text` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractDateAssert.java`
#### Snippet
```java
   * <li>this method</li>
   * <li>{@link #withDateFormat(java.text.DateFormat)}</li>
   * <li>{@link #registerCustomDateFormat(java.text.DateFormat)}</li>
   * <li>{@link #registerCustomDateFormat(String)}</li>
   * </ul>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.text` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractDateAssert.java`
#### Snippet
```java
   * <ul>
   * <li>{@link #withDateFormat(String)}</li>
   * <li>{@link #withDateFormat(java.text.DateFormat)}</li>
   * <li>{@link #registerCustomDateFormat(java.text.DateFormat)}</li>
   * <li>this method</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.text` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractDateAssert.java`
#### Snippet
```java
   * <li>{@link #withDateFormat(String)}</li>
   * <li>{@link #withDateFormat(java.text.DateFormat)}</li>
   * <li>{@link #registerCustomDateFormat(java.text.DateFormat)}</li>
   * <li>this method</li>
   * </ul>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractDateAssert.java`
#### Snippet
```java

  /**
   * Same assertion as {@link #isInSameHourWindowAs(java.util.Date)} but given date is represented as String either
   * with one of the supported defaults date format or a user custom date format (set with method
   * {@link #withDateFormat(DateFormat)}).
```

### UnnecessaryFullyQualifiedName
Qualifier `java.text` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractDateAssert.java`
#### Snippet
```java
   * <ul>
   * <li>{@link #withDateFormat(String)}</li>
   * <li>{@link #withDateFormat(java.text.DateFormat)}</li>
   * <li>this method</li>
   * <li>{@link #registerCustomDateFormat(String)}</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/AbstractDateAssert.java`
#### Snippet
```java
   *
   * If you want to assert that two dates are in the same minute time window use
   * {@link #isInSameMinuteWindowAs(java.util.Date) isInSameMinuteWindowAs} assertion (note that if
   * <code>isInSameMinuteAs</code> succeeds then <code>isInSameMinuteWindowAs</code> will succeed too).
   * <p>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.data` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/data/Percentage.java`
#### Snippet
```java

  /**
   * Creates a new {@link org.assertj.core.data.Percentage}.
   *
   * @param value the value of the percentage.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.data` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Assertions.java`
#### Snippet
```java

  /**
   * Assertions entry point for Integer {@link org.assertj.core.data.Percentage} to use with isCloseTo assertions for
   * percentages.
   * <p>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Assertions.java`
#### Snippet
```java

  /**
   * Create assertion for {@link java.time.OffsetTime}.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Assertions.java`
#### Snippet
```java

  /**
   * Create assertion for {@link java.util.Optional}.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Assertions.java`
#### Snippet
```java
   *
   * @param actual the actual value.
   * @param <VALUE> the type of the value contained in the {@link java.util.Optional}.
   *
   * @return the created assertion object.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.regex` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Assertions.java`
#### Snippet
```java

  /**
  * Create assertion for {@link java.util.regex.Matcher}.
  *
  * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.data` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Assertions.java`
#### Snippet
```java

  /**
   * Assertions entry point for Long {@link org.assertj.core.data.Percentage} to use with isCloseTo assertions for
   * percentages.
   * <p>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.concurrent` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Assertions.java`
#### Snippet
```java

  /**
   * Create assertion for {@link java.util.concurrent.Future}.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.concurrent` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Assertions.java`
#### Snippet
```java
   *
   * @param actual the actual value.
   * @param <RESULT> the type of the value contained in the {@link java.util.concurrent.Future}.
   *
   * @return the created assertion object.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Assertions.java`
#### Snippet
```java

  /**
   * Create assertion for {@link java.util.OptionalInt}.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.concurrent` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Assertions.java`
#### Snippet
```java

  /**
   * Create assertion for {@link java.util.concurrent.CompletableFuture}.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.concurrent` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Assertions.java`
#### Snippet
```java
   *
   * @param actual the actual value.
   * @param <RESULT> the type of the value contained in the {@link java.util.concurrent.CompletableFuture}.
   *
   * @return the created assertion object.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Assertions.java`
#### Snippet
```java
  /**
   * Add the given date format to the ones used to parse date String in String based Date assertions like
   * {@link org.assertj.core.api.AbstractDateAssert#isEqualTo(String)}.
   * <p>
   * User date formats are used before default ones in the order they have been registered (first registered, first
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Assertions.java`
#### Snippet
```java
   * AssertJ is gonna use any date formats registered with one of these methods :
   * <ul>
   * <li>{@link org.assertj.core.api.AbstractDateAssert#withDateFormat(String)}</li>
   * <li>{@link org.assertj.core.api.AbstractDateAssert#withDateFormat(java.text.DateFormat)}</li>
   * <li>{@link #registerCustomDateFormat(java.text.DateFormat)}</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Assertions.java`
#### Snippet
```java
   * <ul>
   * <li>{@link org.assertj.core.api.AbstractDateAssert#withDateFormat(String)}</li>
   * <li>{@link org.assertj.core.api.AbstractDateAssert#withDateFormat(java.text.DateFormat)}</li>
   * <li>{@link #registerCustomDateFormat(java.text.DateFormat)}</li>
   * <li>{@link #registerCustomDateFormat(String)}</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.text` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Assertions.java`
#### Snippet
```java
   * <ul>
   * <li>{@link org.assertj.core.api.AbstractDateAssert#withDateFormat(String)}</li>
   * <li>{@link org.assertj.core.api.AbstractDateAssert#withDateFormat(java.text.DateFormat)}</li>
   * <li>{@link #registerCustomDateFormat(java.text.DateFormat)}</li>
   * <li>{@link #registerCustomDateFormat(String)}</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.text` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Assertions.java`
#### Snippet
```java
   * <li>{@link org.assertj.core.api.AbstractDateAssert#withDateFormat(String)}</li>
   * <li>{@link org.assertj.core.api.AbstractDateAssert#withDateFormat(java.text.DateFormat)}</li>
   * <li>{@link #registerCustomDateFormat(java.text.DateFormat)}</li>
   * <li>{@link #registerCustomDateFormat(String)}</li>
   * </ul>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Assertions.java`
#### Snippet
```java
   * <p>
   * To revert to default formats only, call {@link #useDefaultDateFormatsOnly()} or
   * {@link org.assertj.core.api.AbstractDateAssert#withDefaultDateFormatsOnly()}.
   * <p>
   * Code examples:
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Assertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link java.time.OffsetDateTime}</code>.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.concurrent` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Assertions.java`
#### Snippet
```java

  /**
   * Create assertion for {@link java.util.concurrent.CompletionStage} by converting it to a {@link CompletableFuture} and returning a {@link CompletableFutureAssert}.
   * <p>
   * If the given {@link java.util.concurrent.CompletionStage} is null, the {@link CompletableFuture} in the returned {@link CompletableFutureAssert} will also be null.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.concurrent` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Assertions.java`
#### Snippet
```java
   * Create assertion for {@link java.util.concurrent.CompletionStage} by converting it to a {@link CompletableFuture} and returning a {@link CompletableFutureAssert}.
   * <p>
   * If the given {@link java.util.concurrent.CompletionStage} is null, the {@link CompletableFuture} in the returned {@link CompletableFutureAssert} will also be null.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.concurrent` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Assertions.java`
#### Snippet
```java
   *
   * @param actual the actual value.
   * @param <RESULT> the type of the value contained in the {@link java.util.concurrent.CompletionStage}.
   *
   * @return the created assertion object.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Assertions.java`
#### Snippet
```java
   * <ul>
   * <li>
   * <code>{@link org.assertj.core.api.AbstractIterableAssert#usingElementComparatorOnFields(java.lang.String...)}</code>
   * </li>
   * <li><code>{@link org.assertj.core.api.AbstractObjectAssert#isEqualToComparingFieldByField(Object)}</code></li>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Assertions.java`
#### Snippet
```java
   * <ul>
   * <li>
   * <code>{@link org.assertj.core.api.AbstractIterableAssert#usingElementComparatorOnFields(java.lang.String...)}</code>
   * </li>
   * <li><code>{@link org.assertj.core.api.AbstractObjectAssert#isEqualToComparingFieldByField(Object)}</code></li>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Assertions.java`
#### Snippet
```java
   * <code>{@link org.assertj.core.api.AbstractIterableAssert#usingElementComparatorOnFields(java.lang.String...)}</code>
   * </li>
   * <li><code>{@link org.assertj.core.api.AbstractObjectAssert#isEqualToComparingFieldByField(Object)}</code></li>
   * </ul>
   *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.configuration` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Assertions.java`
#### Snippet
```java
   * If the value is <code>false</code> and these methods try to compare private fields, it will fail with an exception.
   *
   * @param allowComparingPrivateFields allow private fields comparison. Default is {@value org.assertj.core.configuration.Configuration#ALLOW_COMPARING_PRIVATE_FIELDS}.
   */
  public static void setAllowComparingPrivateFields(boolean allowComparingPrivateFields) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Assertions.java`
#### Snippet
```java
  /**
   * Add the given date format to the ones used to parse date String in String based Date assertions like
   * {@link org.assertj.core.api.AbstractDateAssert#isEqualTo(String)}.
   * <p>
   * User date formats are used before default ones in the order they have been registered (first registered, first
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Assertions.java`
#### Snippet
```java
   * AssertJ is gonna use any date formats registered with one of these methods :
   * <ul>
   * <li>{@link org.assertj.core.api.AbstractDateAssert#withDateFormat(String)}</li>
   * <li>{@link org.assertj.core.api.AbstractDateAssert#withDateFormat(java.text.DateFormat)}</li>
   * <li>{@link #registerCustomDateFormat(java.text.DateFormat)}</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Assertions.java`
#### Snippet
```java
   * <ul>
   * <li>{@link org.assertj.core.api.AbstractDateAssert#withDateFormat(String)}</li>
   * <li>{@link org.assertj.core.api.AbstractDateAssert#withDateFormat(java.text.DateFormat)}</li>
   * <li>{@link #registerCustomDateFormat(java.text.DateFormat)}</li>
   * <li>{@link #registerCustomDateFormat(String)}</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.text` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Assertions.java`
#### Snippet
```java
   * <ul>
   * <li>{@link org.assertj.core.api.AbstractDateAssert#withDateFormat(String)}</li>
   * <li>{@link org.assertj.core.api.AbstractDateAssert#withDateFormat(java.text.DateFormat)}</li>
   * <li>{@link #registerCustomDateFormat(java.text.DateFormat)}</li>
   * <li>{@link #registerCustomDateFormat(String)}</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.text` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Assertions.java`
#### Snippet
```java
   * <li>{@link org.assertj.core.api.AbstractDateAssert#withDateFormat(String)}</li>
   * <li>{@link org.assertj.core.api.AbstractDateAssert#withDateFormat(java.text.DateFormat)}</li>
   * <li>{@link #registerCustomDateFormat(java.text.DateFormat)}</li>
   * <li>{@link #registerCustomDateFormat(String)}</li>
   * </ul>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Assertions.java`
#### Snippet
```java
   * <p>
   * To revert to default formats only, call {@link #useDefaultDateFormatsOnly()} or
   * {@link org.assertj.core.api.AbstractDateAssert#withDefaultDateFormatsOnly()}.
   * <p>
   * Code examples:
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.configuration` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Assertions.java`
#### Snippet
```java
   * Sets whether we remove elements related to AssertJ from assertion error stack trace.
   * <p>
   * Default is {@value org.assertj.core.configuration.Configuration#REMOVE_ASSERTJ_RELATED_ELEMENTS_FROM_STACK_TRACE}.
   *
   * @param removeAssertJRelatedElementsFromStackTrace flag.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Assertions.java`
#### Snippet
```java

  /**
   * Create assertion for {@link java.util.OptionalDouble}.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.data` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Assertions.java`
#### Snippet
```java

  /**
   * Assertions entry point for Double {@link org.assertj.core.data.Percentage} to use with isCloseTo assertions for
   * percentages.
   * <p>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Assertions.java`
#### Snippet
```java
  /**
   * Globally sets whether
   * <code>{@link org.assertj.core.api.AbstractIterableAssert#extracting(String) IterableAssert#extracting(String)}</code>
   * and
   * <code>{@link org.assertj.core.api.AbstractObjectArrayAssert#extracting(String) ObjectArrayAssert#extracting(String)}</code>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Assertions.java`
#### Snippet
```java
   * <code>{@link org.assertj.core.api.AbstractIterableAssert#extracting(String) IterableAssert#extracting(String)}</code>
   * and
   * <code>{@link org.assertj.core.api.AbstractObjectArrayAssert#extracting(String) ObjectArrayAssert#extracting(String)}</code>
   * should be allowed to extract private fields, if not and they try it fails with exception.
   *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.configuration` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Assertions.java`
#### Snippet
```java
   * should be allowed to extract private fields, if not and they try it fails with exception.
   *
   * @param allowExtractingPrivateFields allow private fields extraction. Default is {@value org.assertj.core.configuration.Configuration#ALLOW_EXTRACTING_PRIVATE_FIELDS}.
   */
  public static void setAllowExtractingPrivateFields(boolean allowExtractingPrivateFields) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/Assertions.java`
#### Snippet
```java

  /**
   * Create assertion for {@link java.util.OptionalInt}.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/util/Throwables.java`
#### Snippet
```java
   * <p>
   * The result of this method vary by JDK version as this method uses
   * {@link Throwable#printStackTrace(java.io.PrintWriter)}. On JDK1.3 and earlier, the cause exception will not be
   * shown unless the specified throwable alters printStackTrace.
   * </p>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.presentation` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/util/Maps.java`
#### Snippet
```java

  /**
   * Returns the {@code String} {@link org.assertj.core.presentation.StandardRepresentation standard representation} of
   * the given map, or {@code null} if the given map is {@code null}.
   * 
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/recursive/comparison/RecursiveComparisonConfiguration.java`
#### Snippet
```java
     *
     * @param <T> the class type to register a comparator for
     * @param comparator the {@link java.util.Comparator Comparator} to use to compare the given field
     * @param type the type to be compared with the given comparator.
     * @return this builder.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/recursive/comparison/RecursiveComparisonConfiguration.java`
#### Snippet
```java
     * See {@link RecursiveComparisonAssert#withComparatorForFields(Comparator, String...) RecursiveComparisonAssert#withComparatorForFields(Comparator comparator, String...fields)} for examples.
     *
     * @param comparator the {@link java.util.Comparator Comparator} to use to compare the given field
     * @param fields the fields the comparator should be used for
     * @return this builder.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/recursive/comparison/RecursiveComparisonConfiguration.java`
#### Snippet
```java
   *
   * @param <T> the class type to register a comparator for
   * @param comparator the {@link java.util.Comparator Comparator} to use to compare the given type
   * @param type the type to be compared with the given comparator.
   * @throws NullPointerException if the given comparator is null.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/recursive/comparison/RecursiveComparisonConfiguration.java`
#### Snippet
```java
   * See {@link RecursiveComparisonAssert#withComparatorForFields(Comparator, String...) RecursiveComparisonAssert#withComparatorForFields(Comparator, String...)} for examples.
   *
   * @param comparator the {@link java.util.Comparator Comparator} to use to compare the given field
   * @param fieldLocations the locations from the root object of the fields the comparator should be used for
   * @throws NullPointerException if the given comparator is null.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `assertj-core/src/main/java/org/assertj/core/util/Sets.java`
#### Snippet
```java
    }
    TreeSet<T> set = newTreeSet();
    java.util.Collections.addAll(set, elements);
    return set;
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `assertj-core/src/main/java/org/assertj/core/util/Sets.java`
#### Snippet
```java
    }
    LinkedHashSet<T> set = newLinkedHashSet();
    java.util.Collections.addAll(set, elements);
    return set;
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `assertj-core/src/main/java/org/assertj/core/util/IterableUtil.java`
#### Snippet
```java
    if (elements == null) return null;
    ArrayList<T> list = newArrayList();
    java.util.Collections.addAll(list, elements);
    return list;
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `assertj-core/src/main/java/org/assertj/core/api/recursive/comparison/RecursiveComparisonDifferenceCalculator.java`
#### Snippet
```java
      Map.Entry<?, ?> expectedEntry = expectedMapEntries.next();
      // check keys are matched before comparing values as keys represents a field
      if (!java.util.Objects.equals(actualEntry.getKey(), expectedEntry.getKey())) {
        // report a missing key/field.
        comparisonState.addKeyDifference(dualValue, actualEntry.getKey(), expectedEntry.getKey());
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/error/OptionalShouldBeEmpty.java`
#### Snippet
```java

  /**
   * Indicates that the provided {@link java.util.OptionalLong} should be empty.
   *
   * @param optional the actual {@link OptionalLong} to test.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/error/OptionalShouldBeEmpty.java`
#### Snippet
```java

  /**
   * Indicates that the provided {@link java.util.OptionalInt} should be empty.
   *
   * @param optional the actual {@link OptionalInt} to test.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/error/OptionalShouldBeEmpty.java`
#### Snippet
```java

/**
 * Build error message when an {@link java.util.Optional} should be empty.
 *
 * @author Jean-Christophe Gay
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/error/OptionalShouldBeEmpty.java`
#### Snippet
```java

  /**
   * Indicates that the provided {@link java.util.Optional} should be empty.
   *
   * @param optional the actual {@link Optional} to test.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/error/OptionalShouldBeEmpty.java`
#### Snippet
```java
   *
   * @param optional the actual {@link Optional} to test.
   * @param <VALUE> the type of the value contained in the {@link java.util.Optional}.
   * @return a error message factory.
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/error/OptionalShouldBeEmpty.java`
#### Snippet
```java

  /**
   * Indicates that the provided {@link java.util.OptionalDouble} should be empty.
   *
   * @param optional the actual {@link OptionalDouble} to test.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/error/OptionalDoubleShouldHaveValueCloseToPercentage.java`
#### Snippet
```java

  /**
   * Indicates that the provided {@link java.util.OptionalDouble} has a value, but it is not within the given positive
   * percentage.
   *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/error/OptionalDoubleShouldHaveValueCloseToPercentage.java`
#### Snippet
```java
   * percentage.
   *
   * @param optional the {@link java.util.OptionalDouble} which has a value
   * @param expectedValue the value we expect to be in the provided {@link java.util.OptionalDouble}
   * @param percentage the given positive percentage
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/error/OptionalDoubleShouldHaveValueCloseToPercentage.java`
#### Snippet
```java
   *
   * @param optional the {@link java.util.OptionalDouble} which has a value
   * @param expectedValue the value we expect to be in the provided {@link java.util.OptionalDouble}
   * @param percentage the given positive percentage
   * @param difference the effective distance between actual and expected
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/error/OptionalDoubleShouldHaveValueCloseToPercentage.java`
#### Snippet
```java

  /**
   * Indicates that the provided {@link java.util.OptionalDouble} is empty so it doesn't have the expected value.
   *
   * @param expectedValue the value we expect to be in an {@link java.util.OptionalDouble}.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/error/OptionalDoubleShouldHaveValueCloseToPercentage.java`
#### Snippet
```java
   * Indicates that the provided {@link java.util.OptionalDouble} is empty so it doesn't have the expected value.
   *
   * @param expectedValue the value we expect to be in an {@link java.util.OptionalDouble}.
   * @return a error message factory.
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/error/OptionalDoubleShouldHaveValueCloseToPercentage.java`
#### Snippet
```java

/**
 * Build error message when an {@link java.util.OptionalDouble} should be close to an expected value within a positive
 * percentage.
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.error` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/error/ShouldHaveCauseInstance.java`
#### Snippet
```java

  /**
   * Creates a new <code>{@link org.assertj.core.error.BasicErrorMessageFactory}</code>.
   * 
   * @param actual the actual value in the failed assertion.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.error` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/error/ShouldBeSubstring.java`
#### Snippet
```java

  /**
   * Creates a new <code>{@link org.assertj.core.error.ShouldBeSubstring}</code>.
   * @param actual the actual value in the failed assertion.
   * @param expected the expected value in the failed assertion.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.error` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/error/ShouldHaveFields.java`
#### Snippet
```java

  /**
   * Creates a new <code>{@link org.assertj.core.error.ShouldHaveFields}</code>.
   * 
   * @param actual the actual value in the failed assertion.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.error` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/error/ShouldHaveFields.java`
#### Snippet
```java

  /**
   * Creates a new <code>{@link org.assertj.core.error.ShouldHaveFields}</code>.
   * 
   * @param actual the actual value in the failed assertion.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/error/OptionalShouldBePresent.java`
#### Snippet
```java
   * @return a error message factory.
   * @param optional the optional instance
   * @throws java.lang.NullPointerException if optional is null.
   */
  public static OptionalShouldBePresent shouldBePresent(Object optional) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.error` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/error/ShouldBeEqualWithinPercentage.java`
#### Snippet
```java

  /**
   * Creates a new <code>{@link org.assertj.core.error.ShouldBeEqualWithinPercentage}</code>.
   *
   * @param <T> the type of values to compare.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.error` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/error/ShouldBeEqualWithTimePrecision.java`
#### Snippet
```java

  /**
   * Creates a new <code>{@link org.assertj.core.error.ShouldBeEqualWithTimePrecision}</code>.
   *
   * @param actual    the actual value in the failed assertion.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.error` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/error/ShouldBeEqualNormalizingUnicode.java`
#### Snippet
```java

  /**
   * Creates a new <code>{@link org.assertj.core.error.ShouldBeEqualNormalizingUnicode}</code>.
   * @param actual the actual value in the failed assertion.
   * @param expected the expected value in the failed assertion.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.error` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/error/ShouldBeAnnotation.java`
#### Snippet
```java

  /**
   * Creates a new <code>{@link org.assertj.core.error.ShouldBeAnnotation}</code>.
   *
   * @param actual the actual value in the failed assertion.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.error` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/error/ShouldBeAnnotation.java`
#### Snippet
```java

  /**
   * Creates a new <code>{@link org.assertj.core.error.ShouldBeAnnotation}</code>.
   *
   * @param actual the actual value in the failed assertion.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.presentation` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/error/ShouldBeEqual.java`
#### Snippet
```java
   *
   * @param description the {@link Description} used to build the returned error message
   * @param representation the {@link org.assertj.core.presentation.Representation} used to build String representation
   *          of object
   * @return the error message from description using {@link #detailedExpected()} and {@link #detailedActual()}
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.presentation` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/error/ShouldBeEqual.java`
#### Snippet
```java
   *
   * @param description the {@link Description} used to build the returned error message
   * @param representation the {@link org.assertj.core.presentation.Representation} used to build String representation
   *          of object
   * @return the error message from description using {@link #expected} and {@link #actual} "smart" representation.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.error` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/error/ShouldNotBeEqualIgnoringWhitespace.java`
#### Snippet
```java

  /**
   * Creates a new <code>{@link org.assertj.core.error.ShouldNotBeEqualIgnoringWhitespace}</code>.
   * @param actual the actual value in the failed assertion.
   * @param expected the expected value in the failed assertion.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.error` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/error/ShouldBeAnArray.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.error.ShouldBeAnArray}</code>.
   * @param object the object value in the failed assertion.
   * @return the created of {@code ErrorMessageFactory}.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/error/OptionalShouldContain.java`
#### Snippet
```java

  /**
   * Indicates that the provided {@link java.util.OptionalLong} does not contain the provided argument.
   *
   * @param optional the {@link java.util.OptionalLong} which contains a value.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/error/OptionalShouldContain.java`
#### Snippet
```java
   * Indicates that the provided {@link java.util.OptionalLong} does not contain the provided argument.
   *
   * @param optional the {@link java.util.OptionalLong} which contains a value.
   * @param expectedValue the value we expect to be in the provided {@link java.util.OptionalLong}.
   * @return a error message factory
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/error/OptionalShouldContain.java`
#### Snippet
```java
   *
   * @param optional the {@link java.util.OptionalLong} which contains a value.
   * @param expectedValue the value we expect to be in the provided {@link java.util.OptionalLong}.
   * @return a error message factory
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/error/OptionalShouldContain.java`
#### Snippet
```java

  /**
   * Indicates that an {@link java.util.Optional} is empty so it doesn't contain the expected value.
   *
   * @param expectedValue the value we expect to be in an {@link java.util.Optional}.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/error/OptionalShouldContain.java`
#### Snippet
```java
   * Indicates that an {@link java.util.Optional} is empty so it doesn't contain the expected value.
   *
   * @param expectedValue the value we expect to be in an {@link java.util.Optional}.
   * @return a error message factory.
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/error/OptionalShouldContain.java`
#### Snippet
```java

  /**
   * Indicates that the provided {@link java.util.Optional} does not contain the provided argument (judging by reference
   * equality).
   *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/error/OptionalShouldContain.java`
#### Snippet
```java
   * equality).
   *
   * @param optional the {@link java.util.Optional} which contains a value.
   * @param expectedValue the value we expect to be in the provided {@link java.util.Optional}.
   * @param <VALUE> the type of the value contained in the {@link java.util.Optional}.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/error/OptionalShouldContain.java`
#### Snippet
```java
   *
   * @param optional the {@link java.util.Optional} which contains a value.
   * @param expectedValue the value we expect to be in the provided {@link java.util.Optional}.
   * @param <VALUE> the type of the value contained in the {@link java.util.Optional}.
   * @return a error message factory
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/error/OptionalShouldContain.java`
#### Snippet
```java
   * @param optional the {@link java.util.Optional} which contains a value.
   * @param expectedValue the value we expect to be in the provided {@link java.util.Optional}.
   * @param <VALUE> the type of the value contained in the {@link java.util.Optional}.
   * @return a error message factory
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/error/OptionalShouldContain.java`
#### Snippet
```java

  /**
   * Indicates that the provided {@link java.util.OptionalInt} does not contain the provided argument.
   *
   * @param optional the {@link java.util.OptionalInt} which contains a value.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/error/OptionalShouldContain.java`
#### Snippet
```java
   * Indicates that the provided {@link java.util.OptionalInt} does not contain the provided argument.
   *
   * @param optional the {@link java.util.OptionalInt} which contains a value.
   * @param expectedValue the value we expect to be in the provided {@link java.util.OptionalInt}.
   * @return a error message factory
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/error/OptionalShouldContain.java`
#### Snippet
```java
   *
   * @param optional the {@link java.util.OptionalInt} which contains a value.
   * @param expectedValue the value we expect to be in the provided {@link java.util.OptionalInt}.
   * @return a error message factory
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/error/OptionalShouldContain.java`
#### Snippet
```java

  /**
   * Indicates that the provided {@link java.util.OptionalDouble} does not contain the provided argument.
   *
   * @param optional the {@link java.util.OptionalDouble} which contains a value.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/error/OptionalShouldContain.java`
#### Snippet
```java
   * Indicates that the provided {@link java.util.OptionalDouble} does not contain the provided argument.
   *
   * @param optional the {@link java.util.OptionalDouble} which contains a value.
   * @param expectedValue the value we expect to be in the provided {@link java.util.OptionalDouble}.
   * @return a error message factory
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/error/OptionalShouldContain.java`
#### Snippet
```java
   *
   * @param optional the {@link java.util.OptionalDouble} which contains a value.
   * @param expectedValue the value we expect to be in the provided {@link java.util.OptionalDouble}.
   * @return a error message factory
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/error/OptionalShouldContain.java`
#### Snippet
```java

  /**
   * Indicates that the provided {@link java.util.Optional} does not contain the provided argument.
   *
   * @param optional the {@link java.util.Optional} which contains a value.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/error/OptionalShouldContain.java`
#### Snippet
```java
   * Indicates that the provided {@link java.util.Optional} does not contain the provided argument.
   *
   * @param optional the {@link java.util.Optional} which contains a value.
   * @param expectedValue the value we expect to be in the provided {@link java.util.Optional}.
   * @param <VALUE> the type of the value contained in the {@link java.util.Optional}.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/error/OptionalShouldContain.java`
#### Snippet
```java
   *
   * @param optional the {@link java.util.Optional} which contains a value.
   * @param expectedValue the value we expect to be in the provided {@link java.util.Optional}.
   * @param <VALUE> the type of the value contained in the {@link java.util.Optional}.
   * @return a error message factory
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/error/OptionalShouldContain.java`
#### Snippet
```java
   * @param optional the {@link java.util.Optional} which contains a value.
   * @param expectedValue the value we expect to be in the provided {@link java.util.Optional}.
   * @param <VALUE> the type of the value contained in the {@link java.util.Optional}.
   * @return a error message factory
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/error/ShouldBeEqualIgnoringSeconds.java`
#### Snippet
```java
 * <li>two {@link ZonedDateTime}, {@link java.time.LocalDateTime} have same year, month, day, hour and minute failed.</li>
 * <li>two {@link LocalTime} have same hour and minute failed.</li>
 * <li>two {@link java.time.OffsetTime} have same hour and minute failed.</li>
 * </ul>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.data` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/WithAssertions.java`
#### Snippet
```java

  /**
   * Assertions entry point for Double {@link org.assertj.core.data.Percentage} to use with isCloseTo assertions for
   * percentages.
   * <p>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/WithAssertions.java`
#### Snippet
```java

  /**
   * Create assertion for {@link java.util.OptionalInt}.
   *
   * @param optional the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/WithAssertions.java`
#### Snippet
```java

  /**
   * Create assertion for {@link java.util.OptionalDouble}.
   *
   * @param optional the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.data` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/WithAssertions.java`
#### Snippet
```java

  /**
   * Assertions entry point for Long {@link org.assertj.core.data.Percentage} to use with isCloseTo assertions for
   * percentages.
   * <p>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/WithAssertions.java`
#### Snippet
```java
  /**
   * Add the given date format to the ones used to parse date String in String based Date assertions like
   * {@link org.assertj.core.api.AbstractDateAssert#isEqualTo(String)}.
   * <p>
   * User date formats are used before default ones in the order they have been registered (first registered, first
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/WithAssertions.java`
#### Snippet
```java
   * AssertJ is gonna use any date formats registered with one of these methods :
   * <ul>
   * <li>{@link org.assertj.core.api.AbstractDateAssert#withDateFormat(String)}</li>
   * <li>{@link org.assertj.core.api.AbstractDateAssert#withDateFormat(java.text.DateFormat)}</li>
   * <li>{@link #registerCustomDateFormat(java.text.DateFormat)}</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/WithAssertions.java`
#### Snippet
```java
   * <ul>
   * <li>{@link org.assertj.core.api.AbstractDateAssert#withDateFormat(String)}</li>
   * <li>{@link org.assertj.core.api.AbstractDateAssert#withDateFormat(java.text.DateFormat)}</li>
   * <li>{@link #registerCustomDateFormat(java.text.DateFormat)}</li>
   * <li>{@link #registerCustomDateFormat(String)}</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.text` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/WithAssertions.java`
#### Snippet
```java
   * <ul>
   * <li>{@link org.assertj.core.api.AbstractDateAssert#withDateFormat(String)}</li>
   * <li>{@link org.assertj.core.api.AbstractDateAssert#withDateFormat(java.text.DateFormat)}</li>
   * <li>{@link #registerCustomDateFormat(java.text.DateFormat)}</li>
   * <li>{@link #registerCustomDateFormat(String)}</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.text` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/WithAssertions.java`
#### Snippet
```java
   * <li>{@link org.assertj.core.api.AbstractDateAssert#withDateFormat(String)}</li>
   * <li>{@link org.assertj.core.api.AbstractDateAssert#withDateFormat(java.text.DateFormat)}</li>
   * <li>{@link #registerCustomDateFormat(java.text.DateFormat)}</li>
   * <li>{@link #registerCustomDateFormat(String)}</li>
   * </ul>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/WithAssertions.java`
#### Snippet
```java
   * <p>
   * To revert to default formats only, call {@link #useDefaultDateFormatsOnly()} or
   * {@link org.assertj.core.api.AbstractDateAssert#withDefaultDateFormatsOnly()}.
   * <p>
   * Code examples:
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/WithAssertions.java`
#### Snippet
```java

  /**
   * Create assertion for {@link java.util.OptionalLong}.
   *
   * @param optional the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/WithAssertions.java`
#### Snippet
```java
  /**
   * Globally sets whether
   * <code>{@link org.assertj.core.api.AbstractIterableAssert#extracting(String) IterableAssert#extracting(String)}</code>
   * and
   * <code>{@link org.assertj.core.api.AbstractObjectArrayAssert#extracting(String) ObjectArrayAssert#extracting(String)}</code>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/WithAssertions.java`
#### Snippet
```java
   * <code>{@link org.assertj.core.api.AbstractIterableAssert#extracting(String) IterableAssert#extracting(String)}</code>
   * and
   * <code>{@link org.assertj.core.api.AbstractObjectArrayAssert#extracting(String) ObjectArrayAssert#extracting(String)}</code>
   * should be allowed to extract private fields, if not and they try it fails with exception.
   *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/WithAssertions.java`
#### Snippet
```java
  /**
   * Add the given date format to the ones used to parse date String in String based Date assertions like
   * {@link org.assertj.core.api.AbstractDateAssert#isEqualTo(String)}.
   * <p>
   * User date formats are used before default ones in the order they have been registered (first registered, first
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/WithAssertions.java`
#### Snippet
```java
   * AssertJ is gonna use any date formats registered with one of these methods :
   * <ul>
   * <li>{@link org.assertj.core.api.AbstractDateAssert#withDateFormat(String)}</li>
   * <li>{@link org.assertj.core.api.AbstractDateAssert#withDateFormat(java.text.DateFormat)}</li>
   * <li>{@link #registerCustomDateFormat(java.text.DateFormat)}</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/WithAssertions.java`
#### Snippet
```java
   * <ul>
   * <li>{@link org.assertj.core.api.AbstractDateAssert#withDateFormat(String)}</li>
   * <li>{@link org.assertj.core.api.AbstractDateAssert#withDateFormat(java.text.DateFormat)}</li>
   * <li>{@link #registerCustomDateFormat(java.text.DateFormat)}</li>
   * <li>{@link #registerCustomDateFormat(String)}</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.text` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/WithAssertions.java`
#### Snippet
```java
   * <ul>
   * <li>{@link org.assertj.core.api.AbstractDateAssert#withDateFormat(String)}</li>
   * <li>{@link org.assertj.core.api.AbstractDateAssert#withDateFormat(java.text.DateFormat)}</li>
   * <li>{@link #registerCustomDateFormat(java.text.DateFormat)}</li>
   * <li>{@link #registerCustomDateFormat(String)}</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.text` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/WithAssertions.java`
#### Snippet
```java
   * <li>{@link org.assertj.core.api.AbstractDateAssert#withDateFormat(String)}</li>
   * <li>{@link org.assertj.core.api.AbstractDateAssert#withDateFormat(java.text.DateFormat)}</li>
   * <li>{@link #registerCustomDateFormat(java.text.DateFormat)}</li>
   * <li>{@link #registerCustomDateFormat(String)}</li>
   * </ul>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/WithAssertions.java`
#### Snippet
```java
   * <p>
   * To revert to default formats only, call {@link #useDefaultDateFormatsOnly()} or
   * {@link org.assertj.core.api.AbstractDateAssert#withDefaultDateFormatsOnly()}.
   * <p>
   * Code examples:
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.regex` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/WithAssertions.java`
#### Snippet
```java

  /**
   * Create assertion for {@link java.util.regex.Matcher}
   *
   *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/WithAssertions.java`
#### Snippet
```java
   * <ul>
   * <li>
   * <code>{@link org.assertj.core.api.AbstractIterableAssert#usingElementComparatorOnFields(java.lang.String...)}</code>
   * </li>
   * <li><code>{@link org.assertj.core.api.AbstractObjectAssert#isEqualToComparingFieldByField(Object)}</code></li>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/WithAssertions.java`
#### Snippet
```java
   * <ul>
   * <li>
   * <code>{@link org.assertj.core.api.AbstractIterableAssert#usingElementComparatorOnFields(java.lang.String...)}</code>
   * </li>
   * <li><code>{@link org.assertj.core.api.AbstractObjectAssert#isEqualToComparingFieldByField(Object)}</code></li>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/WithAssertions.java`
#### Snippet
```java
   * <code>{@link org.assertj.core.api.AbstractIterableAssert#usingElementComparatorOnFields(java.lang.String...)}</code>
   * </li>
   * <li><code>{@link org.assertj.core.api.AbstractObjectAssert#isEqualToComparingFieldByField(Object)}</code></li>
   * </ul>
   *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.concurrent` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/WithAssertions.java`
#### Snippet
```java

  /**
   * Create assertion for {@link java.util.concurrent.CompletableFuture}.
   *
   * @param future the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.concurrent` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/WithAssertions.java`
#### Snippet
```java
   *
   * @param future the actual value.
   * @param <RESULT> the type of the value contained in the {@link java.util.concurrent.CompletableFuture}.
   *
   * @return the created assertion object.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.concurrent` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/WithAssertions.java`
#### Snippet
```java

  /**
   * Create assertion for {@link java.util.concurrent.CompletionStage} by converting it to a {@link CompletableFuture} and returning a {@link CompletableFutureAssert}.
   * <p>
   * If the given {@link java.util.concurrent.CompletionStage} is null, the {@link CompletableFuture} in the returned {@link CompletableFutureAssert} will also be null.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.concurrent` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/WithAssertions.java`
#### Snippet
```java
   * Create assertion for {@link java.util.concurrent.CompletionStage} by converting it to a {@link CompletableFuture} and returning a {@link CompletableFutureAssert}.
   * <p>
   * If the given {@link java.util.concurrent.CompletionStage} is null, the {@link CompletableFuture} in the returned {@link CompletableFutureAssert} will also be null.
   *
   * @param completionStage the actual {@link CompletionStage}.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.concurrent` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/WithAssertions.java`
#### Snippet
```java
   *
   * @param completionStage the actual {@link CompletionStage}.
   * @param <RESULT> the type of the value contained in the {@link java.util.concurrent.CompletionStage}.
   *
   * @return the created assertion object.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.concurrent` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/WithAssertions.java`
#### Snippet
```java

  /**
   * Create assertion for {@link java.util.concurrent.Future}.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.concurrent` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/WithAssertions.java`
#### Snippet
```java
   *
   * @param actual the actual value.
   * @param <RESULT> the type of the value contained in the {@link java.util.concurrent.Future}.
   *
   * @return the created assertion object.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.data` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/WithAssertions.java`
#### Snippet
```java

  /**
   * Assertions entry point for Integer {@link org.assertj.core.data.Percentage} to use with isCloseTo assertions for
   * percentages.
   * <p>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/WithAssertions.java`
#### Snippet
```java

  /**
   * Create assertion for {@link java.util.Optional}.
   *
   * @param optional the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/WithAssertions.java`
#### Snippet
```java
   *
   * @param optional the actual value.
   * @param <VALUE> the type of the value contained in the {@link java.util.Optional}.
   *
   * @return the created assertion object.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.error` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/error/ShouldHaveRootCauseExactlyInstance.java`
#### Snippet
```java

  /**
   * Creates a new <code>{@link org.assertj.core.error.BasicErrorMessageFactory}</code>.
   * 
   * @param actual the actual value in the failed assertion.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.regex` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/error/MatcherShouldMatch.java`
#### Snippet
```java

  /**
   * Indicates that the provided {@link java.util.regex.Matcher} should match.
   *
   * @param matcher the actual {@link Matcher} to test.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.regex` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/error/MatcherShouldMatch.java`
#### Snippet
```java

/**
 * Build error message when an {@link java.util.regex.Matcher} should match.
 *
 * @author Jiashu Zhang
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.presentation` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/error/MessageFormatter.java`
#### Snippet
```java
   * string</li>
   * <li>each of the arguments in the given array is converted to a {@code String} by invoking
   * <code>{@link org.assertj.core.presentation.Representation#toStringOf(Object)}</code>.
   * </ol>
   * 
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/error/OptionalDoubleShouldHaveValueCloseToOffset.java`
#### Snippet
```java

  /**
   * Indicates that an {@link java.util.OptionalDouble} is empty so it doesn't have the expected value.
   *
   * @param expectedValue the value we expect to be in an {@link java.util.OptionalDouble}.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/error/OptionalDoubleShouldHaveValueCloseToOffset.java`
#### Snippet
```java
   * Indicates that an {@link java.util.OptionalDouble} is empty so it doesn't have the expected value.
   *
   * @param expectedValue the value we expect to be in an {@link java.util.OptionalDouble}.
   * @return a error message factory.
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/error/OptionalDoubleShouldHaveValueCloseToOffset.java`
#### Snippet
```java

  /**
   * Indicates that the provided {@link java.util.OptionalDouble} does not have the provided argument.
   *
   * @param optional      the {@link java.util.OptionalDouble} which has a value.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/error/OptionalDoubleShouldHaveValueCloseToOffset.java`
#### Snippet
```java
   * Indicates that the provided {@link java.util.OptionalDouble} does not have the provided argument.
   *
   * @param optional      the {@link java.util.OptionalDouble} which has a value.
   * @param expectedValue the value we expect to be in the provided {@link java.util.OptionalDouble}.
   * @param offset        the given positive offset.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/error/OptionalDoubleShouldHaveValueCloseToOffset.java`
#### Snippet
```java
   *
   * @param optional      the {@link java.util.OptionalDouble} which has a value.
   * @param expectedValue the value we expect to be in the provided {@link java.util.OptionalDouble}.
   * @param offset        the given positive offset.
   * @param difference    the effective difference between actual and expected.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/error/OptionalDoubleShouldHaveValueCloseToOffset.java`
#### Snippet
```java

/**
 * Build error message when an {@link java.util.OptionalDouble} should have a specific value close to an offset.
 *
 * @author Jean-Christophe Gay
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/error/ShouldBeEqualIgnoringMinutes.java`
#### Snippet
```java
 * <li>two {@link ZonedDateTime}, {@link java.time.LocalDateTime} have same year, month, day, hour fields failed.</li>
 * <li>two {@link LocalTime} have same hour failed.</li>
 * <li>two {@link java.time.OffsetTime} have same hour failed.</li>
 * </ul>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/error/ShouldBeEqualIgnoringNanos.java`
#### Snippet
```java
 * <li>two {@link ZonedDateTime}, {@link LocalDateTime} have same year, month, day, hour, minute and second failed.</li>
 * <li>two {@link LocalTime} have same hour, minute and second failed.</li>
 * <li>two {@link java.time.OffsetTime} have same hour, minute and second failed.</li>
 * </ul>
 * 
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.error` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/error/ShouldNotBeEqualIgnoringCase.java`
#### Snippet
```java

  /**
   * Creates a new <code>{@link org.assertj.core.error.ShouldNotBeEqualIgnoringCase}</code>.
   *
   * @param actual the actual value in the failed assertion.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/InstanceOfAssertFactories.java`
#### Snippet
```java

  /**
   * {@link InstanceOfAssertFactory} for a {@link java.time.Period}.
   *
   * @since 3.17.0
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.error` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/error/ShouldBeEqualNormalizingPunctuationAndWhitespace.java`
#### Snippet
```java

  /**
   * Creates a new <code>{@link org.assertj.core.error.ShouldBeEqualNormalizingPunctuationAndWhitespace}</code>.
   * @param actual the actual value in the failed assertion.
   * @param expected the expected value in the failed assertion.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.error` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/error/ShouldBeEqualNormalizingWhitespace.java`
#### Snippet
```java

  /**
   * Creates a new <code>{@link org.assertj.core.error.ShouldBeEqualNormalizingWhitespace}</code>.
   * @param actual the actual value in the failed assertion.
   * @param expected the expected value in the failed assertion.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.error` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/error/ShouldBeEqualIgnoringWhitespace.java`
#### Snippet
```java

  /**
   * Creates a new <code>{@link org.assertj.core.error.ShouldBeEqualIgnoringWhitespace}</code>.
   * @param actual the actual value in the failed assertion.
   * @param expected the expected value in the failed assertion.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/error/ShouldBeEqualIgnoringTimezone.java`
#### Snippet
```java

/**
 * Creates an error message indicating that an assertion that verifies that two {@link java.time.OffsetTime} have same
 * time fields except the timezone.
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/error/OptionalShouldContainInstanceOf.java`
#### Snippet
```java

  /**
   * Indicates that a value should be present in an empty {@link java.util.Optional}.
   *
   * @param value Optional to be checked.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/error/OptionalShouldContainInstanceOf.java`
#### Snippet
```java
   * @param clazz the class to check the optional value against
   * @return an error message factory.
   * @throws java.lang.NullPointerException if optional is null.
   */
  public static OptionalShouldContainInstanceOf shouldContainInstanceOf(Object value, Class<?> clazz) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.error` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/error/ShouldNotBeEqualNormalizingWhitespace.java`
#### Snippet
```java

  /**
   * Creates a new <code>{@link org.assertj.core.error.ShouldNotBeEqualNormalizingWhitespace}</code>.
   * @param actual the actual value in the failed assertion.
   * @param expected the expected value in the failed assertion.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.error` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/error/ShouldHaveMethods.java`
#### Snippet
```java

  /**
   * Creates a new <code>{@link org.assertj.core.error.ShouldHaveMethods}</code>.
   *
   * @param actual the actual value in the failed assertion.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.FloatAssert}</code>.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.regex` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java

  /**
   * Create assertion for {@link java.util.regex.Matcher}
   *
   * @param actual the actual matcher
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * <ul>
   * <li>
   * <code>{@link org.assertj.core.api.AbstractIterableAssert#usingElementComparatorOnFields(java.lang.String...)}</code>
   * </li>
   * <li><code>{@link org.assertj.core.api.AbstractObjectAssert#isEqualToComparingFieldByField(Object)}</code></li>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * <ul>
   * <li>
   * <code>{@link org.assertj.core.api.AbstractIterableAssert#usingElementComparatorOnFields(java.lang.String...)}</code>
   * </li>
   * <li><code>{@link org.assertj.core.api.AbstractObjectAssert#isEqualToComparingFieldByField(Object)}</code></li>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * <code>{@link org.assertj.core.api.AbstractIterableAssert#usingElementComparatorOnFields(java.lang.String...)}</code>
   * </li>
   * <li><code>{@link org.assertj.core.api.AbstractObjectAssert#isEqualToComparingFieldByField(Object)}</code></li>
   * </ul>
   *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.configuration` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * If the value is <code>false</code> and these methods try to compare private fields, it will fail with an exception.
   *
   * @param allowComparingPrivateFields allow private fields comparison. Default is {@value org.assertj.core.configuration.Configuration#ALLOW_COMPARING_PRIVATE_FIELDS}.
   *
   * @since 3.20.0
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.DateAssert}</code>.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
  /**
   * Add the given date format to the ones used to parse date String in String based Date assertions like
   * {@link org.assertj.core.api.AbstractDateAssert#isEqualTo(String)}.
   * <p>
   * User date formats are used before default ones in the order they have been registered (first registered, first
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * AssertJ is gonna use any date formats registered with one of these methods :
   * <ul>
   * <li>{@link org.assertj.core.api.AbstractDateAssert#withDateFormat(String)}</li>
   * <li>{@link org.assertj.core.api.AbstractDateAssert#withDateFormat(java.text.DateFormat)}</li>
   * <li>{@link #registerCustomDateFormat(java.text.DateFormat)}</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * <ul>
   * <li>{@link org.assertj.core.api.AbstractDateAssert#withDateFormat(String)}</li>
   * <li>{@link org.assertj.core.api.AbstractDateAssert#withDateFormat(java.text.DateFormat)}</li>
   * <li>{@link #registerCustomDateFormat(java.text.DateFormat)}</li>
   * <li>{@link #registerCustomDateFormat(String)}</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.text` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * <ul>
   * <li>{@link org.assertj.core.api.AbstractDateAssert#withDateFormat(String)}</li>
   * <li>{@link org.assertj.core.api.AbstractDateAssert#withDateFormat(java.text.DateFormat)}</li>
   * <li>{@link #registerCustomDateFormat(java.text.DateFormat)}</li>
   * <li>{@link #registerCustomDateFormat(String)}</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.text` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * <li>{@link org.assertj.core.api.AbstractDateAssert#withDateFormat(String)}</li>
   * <li>{@link org.assertj.core.api.AbstractDateAssert#withDateFormat(java.text.DateFormat)}</li>
   * <li>{@link #registerCustomDateFormat(java.text.DateFormat)}</li>
   * <li>{@link #registerCustomDateFormat(String)}</li>
   * </ul>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * <p>
   * To revert to default formats only, call {@link #useDefaultDateFormatsOnly()} or
   * {@link org.assertj.core.api.AbstractDateAssert#withDefaultDateFormatsOnly()}.
   * <p>
   * Code examples:
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.concurrent` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java

  /**
   * Create assertion for {@link java.util.concurrent.CompletableFuture}.
   *
   * @param future the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.concurrent` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   *
   * @param future the actual value.
   * @param <RESULT> the type of the value contained in the {@link java.util.concurrent.CompletableFuture}.
   *
   * @return the created assertion object.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.Boolean2DArrayAssert}</code>.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java

  /**
   * Create assertion for {@link java.util.OptionalLong}.
   *
   * @param optional the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.GenericComparableAssert}</code> with
   * standard comparison semantics.
   *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.BigIntegerAssert}</code>.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new <code>{@link org.assertj.core.api.BDDAssertions}</code>.
   */
  protected BDDAssertions() {}
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.LongAssert}</code>.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java

  /**
   * Create assertion for {@link java.util.Optional}.
   *
   * @param <VALUE> the type of the value contained in the {@link java.util.Optional}.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * Create assertion for {@link java.util.Optional}.
   *
   * @param <VALUE> the type of the value contained in the {@link java.util.Optional}.
   * @param optional the actual value.
   *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.CharSequenceAssert}</code> from a {@link StringBuffer}.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.DoubleArrayAssert}</code>.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.Object2DArrayAssert}</code>.
   *
   * @param <T> the actual's elements type.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.CharSequenceAssert}</code>.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.MapAssert}</code>.
   *
   * @param <K> the type of keys in the map.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.ObjectArrayAssert}</code>.
   *
   * @param <T> the actual's elements type.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java

  /**
   * Create assertion for {@link java.util.OptionalDouble}.
   *
   * @param optional the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.FloatArrayAssert}</code>.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.Int2DArrayAssert}</code>.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.IntegerAssert}</code>.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.ClassLoaderAssert}</code>.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.data` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java

  /**
   * Assertions entry point for Integer {@link org.assertj.core.data.Percentage} to use with isCloseTo assertions for
   * percentages.
   * <p>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.ShortAssert}</code>.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.ByteArrayAssert}</code>.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.DoubleAssert}</code>.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.Long2DArrayAssert}</code>.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.FloatAssert}</code>.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.ShortAssert}</code>.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.FileAssert}</code>.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.CharacterAssert}</code>.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.BooleanAssert}</code>.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.ByteAssert}</code>.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.InputStreamAssert}</code>.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.ZonedDateTimeAssert}</code>.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.CharArrayAssert}</code>.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
  /**
   * Globally sets whether
   * <code>{@link org.assertj.core.api.AbstractIterableAssert#extracting(String) IterableAssert#extracting(String)}</code>
   * and
   * <code>{@link org.assertj.core.api.AbstractObjectArrayAssert#extracting(String) ObjectArrayAssert#extracting(String)}</code>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * <code>{@link org.assertj.core.api.AbstractIterableAssert#extracting(String) IterableAssert#extracting(String)}</code>
   * and
   * <code>{@link org.assertj.core.api.AbstractObjectArrayAssert#extracting(String) ObjectArrayAssert#extracting(String)}</code>
   * should be allowed to extract private fields, if not and they try it fails with exception.
   *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.configuration` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * should be allowed to extract private fields, if not and they try it fails with exception.
   *
   * @param allowExtractingPrivateFields allow private fields extraction. Default is {@value org.assertj.core.configuration.Configuration#ALLOW_EXTRACTING_PRIVATE_FIELDS}.
   *
   * @since 3.20.0
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.ListAssert}</code>.
   *
   * @param <T> the type of elements.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java

  /**
   * Create assertion for {@link java.util.OptionalInt}.
   *
   * @param optional the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.LocalDateTimeAssert}</code>.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.LongArrayAssert}</code>.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.BigDecimalAssert}</code>.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.Short2DArrayAssert}</code>.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.Float2DArrayAssert}</code>.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.ThrowableAssert}</code>.
   *
   * @param <T> the type of the actual throwable.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.BooleanArrayAssert}</code>.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.BooleanAssert}</code>.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
  /**
   * Add the given date format to the ones used to parse date String in String based Date assertions like
   * {@link org.assertj.core.api.AbstractDateAssert#isEqualTo(String)}.
   * <p>
   * User date formats are used before default ones in the order they have been registered (first registered, first
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * AssertJ is gonna use any date formats registered with one of these methods :
   * <ul>
   * <li>{@link org.assertj.core.api.AbstractDateAssert#withDateFormat(String)}</li>
   * <li>{@link org.assertj.core.api.AbstractDateAssert#withDateFormat(java.text.DateFormat)}</li>
   * <li>{@link #registerCustomDateFormat(java.text.DateFormat)}</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * <ul>
   * <li>{@link org.assertj.core.api.AbstractDateAssert#withDateFormat(String)}</li>
   * <li>{@link org.assertj.core.api.AbstractDateAssert#withDateFormat(java.text.DateFormat)}</li>
   * <li>{@link #registerCustomDateFormat(java.text.DateFormat)}</li>
   * <li>{@link #registerCustomDateFormat(String)}</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.text` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * <ul>
   * <li>{@link org.assertj.core.api.AbstractDateAssert#withDateFormat(String)}</li>
   * <li>{@link org.assertj.core.api.AbstractDateAssert#withDateFormat(java.text.DateFormat)}</li>
   * <li>{@link #registerCustomDateFormat(java.text.DateFormat)}</li>
   * <li>{@link #registerCustomDateFormat(String)}</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.text` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * <li>{@link org.assertj.core.api.AbstractDateAssert#withDateFormat(String)}</li>
   * <li>{@link org.assertj.core.api.AbstractDateAssert#withDateFormat(java.text.DateFormat)}</li>
   * <li>{@link #registerCustomDateFormat(java.text.DateFormat)}</li>
   * <li>{@link #registerCustomDateFormat(String)}</li>
   * </ul>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * <p>
   * To revert to default formats only, call {@link #useDefaultDateFormatsOnly()} or
   * {@link org.assertj.core.api.AbstractDateAssert#withDefaultDateFormatsOnly()}.
   * <p>
   * Code examples:
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.concurrent` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java

  /**
   * Create assertion for {@link java.util.concurrent.CompletionStage} by converting it to a {@link CompletableFuture} and returning a {@link CompletableFutureAssert}.
   * <p>
   * If the given {@link java.util.concurrent.CompletionStage} is null, the {@link CompletableFuture} in the returned {@link CompletableFutureAssert} will also be null.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.concurrent` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * Create assertion for {@link java.util.concurrent.CompletionStage} by converting it to a {@link CompletableFuture} and returning a {@link CompletableFutureAssert}.
   * <p>
   * If the given {@link java.util.concurrent.CompletionStage} is null, the {@link CompletableFuture} in the returned {@link CompletableFutureAssert} will also be null.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.concurrent` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   *
   * @param actual the actual value.
   * @param <RESULT> the type of the value contained in the {@link java.util.concurrent.CompletionStage}.
   *
   * @return the created assertion object.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.concurrent` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * Creates a new instance of {@link FutureAssert}
   *
   * @param <RESULT> the type of the value contained in the {@link java.util.concurrent.Future}.
   * @param actual the future to test
   * @return the created assertion object
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.ShortArrayAssert}</code>.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.IntegerAssert}</code>.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.Char2DArrayAssert}</code>.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.CharacterAssert}</code>.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.DoubleAssert}</code>.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.ObjectAssert}</code>.
   *
   * @param <T> the type of the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.LocalDateAssert}</code>.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.StringAssert}</code>.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.CharSequenceAssert}</code> from a {@link StringBuilder}.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.LongAssert}</code>.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.IntArrayAssert}</code>.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.ClassAssert}</code>.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.data` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java

  /**
   * Assertions entry point for Long {@link org.assertj.core.data.Percentage} to use with isCloseTo assertions for
   * percentages.
   * <p>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.data` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java

  /**
   * Assertions entry point for Double {@link org.assertj.core.data.Percentage} to use with isCloseTo assertions for
   * percentages.
   * <p>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.IterableAssert}</code>.
   *
   * @param <T> the actual elements type
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.configuration` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * Sets whether we remove elements related to AssertJ from assertion error stack trace.
   * <p>
   * Default is {@value org.assertj.core.configuration.Configuration#REMOVE_ASSERTJ_RELATED_ELEMENTS_FROM_STACK_TRACE}.
   *
   * @param removeAssertJRelatedElementsFromStackTrace flag.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.ObjectAssert}</code> for any object.
   * <p>
   * This overload is useful, when an overloaded method of then(...) takes precedence over the generic {@link #then(Object)}.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.Byte2DArrayAssert}</code>.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.Double2DArrayAssert}</code>.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java

  /**
   * Creates a new instance of <code>{@link org.assertj.core.api.ByteAssert}</code>.
   *
   * @param actual the actual value.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.text` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/internal/Strings.java`
#### Snippet
```java

  /**
   * Verifies that two {@code CharSequence}s are equal, on their canonical form relying on {@link java.text.Normalizer}.
   * Using {@link java.text.Normalizer.Form#NFC} for canonical decomposition, followed by canonical composition.
   * <p>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.text` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/internal/Strings.java`
#### Snippet
```java
  /**
   * Verifies that two {@code CharSequence}s are equal, on their canonical form relying on {@link java.text.Normalizer}.
   * Using {@link java.text.Normalizer.Form#NFC} for canonical decomposition, followed by canonical composition.
   * <p>
   * Examples:
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/extractor/Extractors.java`
#### Snippet
```java
public class Extractors {
  /**
   * Provides extractor for extracting {@link java.lang.Object#toString} from any object
   * @return the built {@link Function}
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.text` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/configuration/Configuration.java`
#### Snippet
```java
   * Returns the additional date formats AssertJ will use in date assertions.
   * <p>
   * See {@link Assertions#registerCustomDateFormat(java.text.DateFormat)} for a detailed description.
   * <p>
   * Note that this change will only be effective once {@link #apply()} or {@link #applyAndDisplay()} is called.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.text` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/configuration/Configuration.java`
#### Snippet
```java
   * Add the given date formats AssertJ will use in date assertions.
   * <p>
   * See {@link Assertions#registerCustomDateFormat(java.text.DateFormat)} for a detailed description.
   * <p>
   * Note that this change will only be effective once {@link #apply()} or {@link #applyAndDisplay()} is called.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.text` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/configuration/Configuration.java`
#### Snippet
```java
   * AssertJ uses defaults date formats in date assertions, this property let's you register additional ones (default there are no additional date formats).
   * <p>
   * See {@link Assertions#registerCustomDateFormat(java.text.DateFormat)} for a detailed description.
   *
   * @return the date formats AssertJ will use in date assertions in addition the default ones.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.configuration` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/presentation/StandardRepresentation.java`
#### Snippet
```java
   * The following defaults will be reapplied:
   * <ul>
   *   <li>{@code maxLengthForSingleLineDescription} = {@value org.assertj.core.configuration.Configuration#MAX_LENGTH_FOR_SINGLE_LINE_DESCRIPTION} </li>
   *   <li>{@code maxElementsForPrinting} = {@value org.assertj.core.configuration.Configuration#MAX_ELEMENTS_FOR_PRINTING} </li>
   * </ul>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.configuration` is unnecessary and can be removed
in `assertj-core/src/main/java/org/assertj/core/presentation/StandardRepresentation.java`
#### Snippet
```java
   * <ul>
   *   <li>{@code maxLengthForSingleLineDescription} = {@value org.assertj.core.configuration.Configuration#MAX_LENGTH_FOR_SINGLE_LINE_DESCRIPTION} </li>
   *   <li>{@code maxElementsForPrinting} = {@value org.assertj.core.configuration.Configuration#MAX_ELEMENTS_FOR_PRINTING} </li>
   * </ul>
   */
```

## ThrowablePrintStackTrace
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `assertj-core/src/main/java/org/assertj/core/util/diff/myers/MyersDiff.java`
#### Snippet
```java
      return buildRevision(path, original, revised);
    } catch (IllegalStateException e) {
      e.printStackTrace();
      return new Patch<>();
    }
```

## NonProtectedConstructorInAbstractClass
### NonProtectedConstructorInAbstractClass
Constructor `AbstractObjectAssert()` of an abstract class should not be declared 'public'
in `assertj-core/src/main/java/org/assertj/core/api/AbstractObjectAssert.java`
#### Snippet
```java
  private TypeComparators comparatorsByType;

  public AbstractObjectAssert(ACTUAL actual, Class<?> selfType) {
    super(actual, selfType);
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractFloatAssert()` of an abstract class should not be declared 'public'
in `assertj-core/src/main/java/org/assertj/core/api/AbstractFloatAssert.java`
#### Snippet
```java
  }

  public AbstractFloatAssert(float actual, Class<?> selfType) {
    super(actual, selfType);
    this.isPrimitive = true;
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractDoubleAssert()` of an abstract class should not be declared 'public'
in `assertj-core/src/main/java/org/assertj/core/api/AbstractDoubleAssert.java`
#### Snippet
```java
  }

  public AbstractDoubleAssert(double actual, Class<?> selfType) {
    super(actual, selfType);
    this.isPrimitive = true;
```

### NonProtectedConstructorInAbstractClass
Constructor `FieldHolder()` of an abstract class should not be declared 'public'
in `assertj-core/src/main/java/org/assertj/core/api/recursive/comparison/FieldHolder.java`
#### Snippet
```java
  protected final Map<String, T> fieldHolder;

  public FieldHolder() {
    fieldHolder = new TreeMap<>();
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `TemporalUnitOffset()` of an abstract class should not be declared 'public'
in `assertj-core/src/main/java/org/assertj/core/data/TemporalUnitOffset.java`
#### Snippet
```java
   * @throws IllegalArgumentException if the given value is negative.
   */
  public TemporalUnitOffset(long value, TemporalUnit unit) {
    requireNonNull(unit);
    checkThatValueIsPositive(value);
```

### NonProtectedConstructorInAbstractClass
Constructor `Delta()` of an abstract class should not be declared 'public'
in `assertj-core/src/main/java/org/assertj/core/util/diff/Delta.java`
#### Snippet
```java
   * @param revised Chunk describing the revised text. Must not be {@code null}.
   */
  public Delta(Chunk<T> original, Chunk<T> revised) {
    checkArgument(original != null, "original must not be null");
    checkArgument(revised != null, "revised must not be null");
```

### NonProtectedConstructorInAbstractClass
Constructor `PathNode()` of an abstract class should not be declared 'public'
in `assertj-core/src/main/java/org/assertj/core/util/diff/myers/PathNode.java`
#### Snippet
```java
   * @param prev The previous node in the path.
   */
  public PathNode(int i, int j, PathNode prev) {
    this.i = i;
    this.j = j;
```

### NonProtectedConstructorInAbstractClass
Constructor `RealNumbers()` of an abstract class should not be declared 'public'
in `assertj-core/src/main/java/org/assertj/core/internal/RealNumbers.java`
#### Snippet
```java
  }

  public RealNumbers(ComparisonStrategy comparisonStrategy) {
    super(comparisonStrategy);
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `RealNumbers()` of an abstract class should not be declared 'public'
in `assertj-core/src/main/java/org/assertj/core/internal/RealNumbers.java`
#### Snippet
```java
public abstract class RealNumbers<NUMBER extends Number & Comparable<NUMBER>> extends Numbers<NUMBER> {

  public RealNumbers() {
    super();
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `Numbers()` of an abstract class should not be declared 'public'
in `assertj-core/src/main/java/org/assertj/core/internal/Numbers.java`
#### Snippet
```java
public abstract class Numbers<NUMBER extends Number & Comparable<NUMBER>> extends Comparables {

  public Numbers() {
    super();
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `Numbers()` of an abstract class should not be declared 'public'
in `assertj-core/src/main/java/org/assertj/core/internal/Numbers.java`
#### Snippet
```java
  }

  public Numbers(ComparisonStrategy comparisonStrategy) {
    super(comparisonStrategy);
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `TypeHolder()` of an abstract class should not be declared 'public'
in `assertj-core/src/main/java/org/assertj/core/internal/TypeHolder.java`
#### Snippet
```java
  protected final Map<Class<?>, T> typeHolder;

  public TypeHolder() {
    this(DEFAULT_CLASS_COMPARATOR);
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `TypeHolder()` of an abstract class should not be declared 'public'
in `assertj-core/src/main/java/org/assertj/core/internal/TypeHolder.java`
#### Snippet
```java
  }

  public TypeHolder(Comparator<Class<?>> comparator) {
    typeHolder = new TreeMap<>(requireNonNull(comparator, "Comparator must not be null"));
  }
```

## AssignmentToMethodParameter
### AssignmentToMethodParameter
Assignment to method parameter `context`
in `assertj-core/src/main/java/org/assertj/core/api/junit/jupiter/SoftAssertionsExtension.java`
#### Snippet
```java
      // collector for the current context. Also check enclosing contexts (in the case of nested tests).
      while (initialiseDelegate(context, collector) && context.getParent().isPresent()) {
        context = context.getParent().get();
      }
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `throwable`
in `assertj-core/src/main/java/org/assertj/core/util/Throwables.java`
#### Snippet
```java
    Throwable cause;
    while ((cause = throwable.getCause()) != null)
      throwable = cause;
    return throwable;
  }
```

### AssignmentToMethodParameter
Assignment to method parameter `c`
in `assertj-core/src/main/java/org/assertj/core/api/recursive/comparison/RecursiveComparisonDifferenceCalculator.java`
#### Snippet
```java
        return true;
      } catch (Exception ignored) {}
      c = c.getSuperclass();
    }
    customEquals.put(origClass, false);
```

### AssignmentToMethodParameter
Assignment to method parameter `cls`
in `assertj-core/src/main/java/org/assertj/core/util/introspection/ClassUtils.java`
#### Snippet
```java
      }

      cls = cls.getSuperclass();
    }
  }
```

### AssignmentToMethodParameter
Assignment to method parameter `path`
in `assertj-core/src/main/java/org/assertj/core/util/diff/myers/MyersDiff.java`
#### Snippet
```java
    Patch<T> patch = new Patch<>();
    if (path.isSnake())
      path = path.prev;
    while (path != null && path.prev != null && path.prev.j >= 0) {
      checkState(!path.isSnake(), "bad diffpath: found snake when looking for diff");
```

### AssignmentToMethodParameter
Assignment to method parameter `path`
in `assertj-core/src/main/java/org/assertj/core/util/diff/myers/MyersDiff.java`
#### Snippet
```java
      int j = path.j;

      path = path.prev;
      int ianchor = path.i;
      int janchor = path.j;
```

### AssignmentToMethodParameter
Assignment to method parameter `path`
in `assertj-core/src/main/java/org/assertj/core/util/diff/myers/MyersDiff.java`
#### Snippet
```java

      patch.addDelta(delta);
      if (path.isSnake()) path = path.prev;
    }
    return patch;
```

### AssignmentToMethodParameter
Assignment to method parameter `c`
in `assertj-core/src/main/java/org/assertj/core/internal/DeepDifference.java`
#### Snippet
```java
        return true;
      } catch (Exception ignored) {}
      c = c.getSuperclass();
    }
    customHash.put(origClass, false);
```

### AssignmentToMethodParameter
Assignment to method parameter `c`
in `assertj-core/src/main/java/org/assertj/core/internal/DeepDifference.java`
#### Snippet
```java
        return true;
      } catch (Exception ignored) {}
      c = c.getSuperclass();
    }
    customEquals.put(origClass, false);
```

### AssignmentToMethodParameter
Assignment to method parameter `obj`
in `assertj-core/src/main/java/org/assertj/core/internal/DeepDifference.java`
#### Snippet
```java

    while (!stack.isEmpty()) {
      obj = stack.removeFirst();
      if (obj == null || visited.contains(obj)) {
        continue;
```

### AssignmentToMethodParameter
Assignment to method parameter `comparatorByPropertyOrField`
in `assertj-core/src/main/java/org/assertj/core/internal/DeepDifference.java`
#### Snippet
```java
                                                      TypeComparators comparatorByType) {
    // replace null comparators groups by empty one to simplify code afterwards
    comparatorByPropertyOrField = comparatorByPropertyOrField == null
        ? new TreeMap<>()
        : comparatorByPropertyOrField;
```

### AssignmentToMethodParameter
Assignment to method parameter `comparatorByType`
in `assertj-core/src/main/java/org/assertj/core/internal/DeepDifference.java`
#### Snippet
```java
        ? new TreeMap<>()
        : comparatorByPropertyOrField;
    comparatorByType = comparatorByType == null ? defaultTypeComparators() : comparatorByType;
    return determineDifferences(a, b, null, comparatorByPropertyOrField, comparatorByType);
  }
```

## ReturnNull
### ReturnNull
Return of `null`
in `assertj-core/src/main/java/org/assertj/core/api/LongPredicateAssert.java`
#### Snippet
```java

  private static Predicate<Long> toPredicate(LongPredicate actual) {
    return actual != null ? actual::test : null;
  }

```

### ReturnNull
Return of `null`
in `assertj-core/src/main/java/org/assertj/core/api/AbstractShortArrayAssert.java`
#### Snippet
```java

  private static short[] toShortArray(int[] ints) {
    if (ints == null) return null;
    short[] shorts = new short[ints.length];
    for (int i = 0; i < shorts.length; i++) {
```

### ReturnNull
Return of `null`
in `assertj-core/src/main/java/org/assertj/core/api/IntPredicateAssert.java`
#### Snippet
```java

  private static Predicate<Integer> toPredicate(IntPredicate actual) {
    return actual != null ? actual::test : null;
  }

```

### ReturnNull
Return of `null`
in `assertj-core/src/main/java/org/assertj/core/api/ThrowableAssert.java`
#### Snippet
```java
      return throwable;
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `assertj-core/src/main/java/org/assertj/core/api/ThrowableAssert.java`
#### Snippet
```java
      Fail.fail("Expecting code to throw an exception.");
      // this will *never* happen...
      return null;
    } catch (AssertionError e) {
      // do not handle AssertionErrors in the next catch block!
```

### ReturnNull
Return of `null`
in `assertj-core/src/main/java/org/assertj/core/api/ThrowableAssert.java`
#### Snippet
```java
                                                                             Class<THROWABLE> type) {
    Throwable throwable = catchThrowable(shouldRaiseThrowable);
    if (throwable == null) return null;
    // check exception type
    new ThrowableAssert(throwable).overridingErrorMessage(shouldBeInstance(throwable, type).create())
```

### ReturnNull
Return of `null`
in `assertj-core/src/main/java/org/assertj/core/api/AbstractZonedDateTimeAssert.java`
#### Snippet
```java

  private ZonedDateTime sameInstantInActualTimeZone(ZonedDateTime zonedDateTime) {
    if (zonedDateTime == null) return null; // nothing to convert in actual's TZ
    if (actual == null) return zonedDateTime; // no actual => let's keep zonedDateTime as it is.
    return zonedDateTime.withZoneSameInstant(actual.getZone());
```

### ReturnNull
Return of `null`
in `assertj-core/src/main/java/org/assertj/core/api/AbstractSoftAssertions.java`
#### Snippet
```java
    error.initCause(realCause);
    collectAssertionError(error);
    return null;
  }

```

### ReturnNull
Return of `null`
in `assertj-core/src/main/java/org/assertj/core/api/AbstractSoftAssertions.java`
#### Snippet
```java
    AssertionError error = Failures.instance().failure(failureMessage);
    collectAssertionError(error);
    return null;
  }

```

### ReturnNull
Return of `null`
in `assertj-core/src/main/java/org/assertj/core/api/DoublePredicateAssert.java`
#### Snippet
```java

  private static Predicate<Double> toPredicate(DoublePredicate actual) {
    return actual != null ? actual::test : null;
  }

```

### ReturnNull
Return of `null`
in `assertj-core/src/main/java/org/assertj/core/api/AbstractDateAssert.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `assertj-core/src/main/java/org/assertj/core/api/AbstractDateAssert.java`
#### Snippet
```java
  @VisibleForTesting
  Date parse(String dateAsString) {
    if (dateAsString == null) return null;
    // parse with date format specified by user if any, otherwise use default formats
    // no synchronization needed as userCustomDateFormat is thread local
```

### ReturnNull
Return of `null`
in `assertj-core/src/main/java/org/assertj/core/api/recursive/assertion/RecursiveAssertionDriver.java`
#### Snippet
```java
  private static String identityToString(final Object object) {
    if (object == null) {
      return null;
    }
    final String name = object.getClass().getName();
```

### ReturnNull
Return of `null`
in `assertj-core/src/main/java/org/assertj/core/util/ArrayWrapperList.java`
#### Snippet
```java
  public static ArrayWrapperList wrap(Object array) {
    if (array == null) {
      return null;
    }
    checkArgument(array.getClass().isArray(), "The object to wrap should be an array");
```

### ReturnNull
Return of `null`
in `assertj-core/src/main/java/org/assertj/core/util/Throwables.java`
#### Snippet
```java
   */
  public static Throwable getRootCause(Throwable throwable) {
    if (throwable.getCause() == null) return null;
    Throwable cause;
    while ((cause = throwable.getCause()) != null)
```

### ReturnNull
Return of `null`
in `assertj-core/src/main/java/org/assertj/core/util/Throwables.java`
#### Snippet
```java
      return element;
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `assertj-core/src/main/java/org/assertj/core/util/Lists.java`
#### Snippet
```java
  public static <T> ArrayList<T> newArrayList(Iterator<? extends T> elements) {
    if (elements == null) {
      return null;
    }
    return Streams.stream(elements).collect(toCollection(ArrayList::new));
```

### ReturnNull
Return of `null`
in `assertj-core/src/main/java/org/assertj/core/util/Lists.java`
#### Snippet
```java
  public static <T> ArrayList<T> newArrayList(Iterable<? extends T> elements) {
    if (elements == null) {
      return null;
    }
    return Streams.stream(elements).collect(toCollection(ArrayList::new));
```

### ReturnNull
Return of `null`
in `assertj-core/src/main/java/org/assertj/core/util/Lists.java`
#### Snippet
```java
  public static <T> ArrayList<T> newArrayList(T... elements) {
    if (elements == null) {
      return null;
    }
    ArrayList<T> list = newArrayList();
```

### ReturnNull
Return of `null`
in `assertj-core/src/main/java/org/assertj/core/util/DateUtil.java`
#### Snippet
```java
  public static synchronized Date parse(String dateAsString) {
    try {
      return dateAsString == null ? null : ISO_DATE_FORMAT.parse(dateAsString);
    } catch (ParseException e) {
      throw new RuntimeException(e);
```

### ReturnNull
Return of `null`
in `assertj-core/src/main/java/org/assertj/core/util/DateUtil.java`
#### Snippet
```java
  public static synchronized Date parseDatetime(String dateAsString) {
    try {
      return dateAsString == null ? null : ISO_DATE_TIME_FORMAT.parse(dateAsString);
    } catch (ParseException e) {
      throw new RuntimeException(e);
```

### ReturnNull
Return of `null`
in `assertj-core/src/main/java/org/assertj/core/util/DateUtil.java`
#### Snippet
```java
  public static synchronized Date parseDatetimeWithMs(String dateAsString) {
    try {
      return dateAsString == null ? null : ISO_DATE_TIME_FORMAT_WITH_MS.parse(dateAsString);
    } catch (ParseException e) {
      throw new RuntimeException(e);
```

### ReturnNull
Return of `null`
in `assertj-core/src/main/java/org/assertj/core/util/DateUtil.java`
#### Snippet
```java
   */
  public static String formatAsDatetime(Calendar calendar) {
    return calendar == null ? null : formatAsDatetime(calendar.getTime());
  }

```

### ReturnNull
Return of `null`
in `assertj-core/src/main/java/org/assertj/core/util/DateUtil.java`
#### Snippet
```java
   */
  public static Date truncateTime(Date date) {
    if (date == null) return null;
    Calendar cal = toCalendar(date);
    cal.set(Calendar.HOUR_OF_DAY, 0);
```

### ReturnNull
Return of `null`
in `assertj-core/src/main/java/org/assertj/core/util/DateUtil.java`
#### Snippet
```java
  public static Calendar toCalendar(Date date) {
    if (date == null) {
      return null;
    }
    Calendar calendar = Calendar.getInstance();
```

### ReturnNull
Return of `null`
in `assertj-core/src/main/java/org/assertj/core/util/DateUtil.java`
#### Snippet
```java
   */
  public static synchronized String formatAsDatetimeWithMs(Date date) {
    return date == null ? null : ISO_DATE_TIME_FORMAT_WITH_MS.format(date);
  }

```

### ReturnNull
Return of `null`
in `assertj-core/src/main/java/org/assertj/core/util/DateUtil.java`
#### Snippet
```java
   */
  public static synchronized String formatAsDatetime(Date date) {
    return date == null ? null : ISO_DATE_TIME_FORMAT.format(date);
  }

```

### ReturnNull
Return of `null`
in `assertj-core/src/main/java/org/assertj/core/util/Sets.java`
#### Snippet
```java
  public static <T> TreeSet<T> newTreeSet(T... elements) {
    if (elements == null) {
      return null;
    }
    TreeSet<T> set = newTreeSet();
```

### ReturnNull
Return of `null`
in `assertj-core/src/main/java/org/assertj/core/util/Sets.java`
#### Snippet
```java
  public static <T> LinkedHashSet<T> newLinkedHashSet(T... elements) {
    if (elements == null) {
      return null;
    }
    LinkedHashSet<T> set = newLinkedHashSet();
```

### ReturnNull
Return of `null`
in `assertj-core/src/main/java/org/assertj/core/util/Sets.java`
#### Snippet
```java
  public static <T> HashSet<T> newHashSet(Iterable<? extends T> elements) {
    if (elements == null) {
      return null;
    }
    return Streams.stream(elements).collect(toCollection(HashSet::new));
```

### ReturnNull
Return of `null`
in `assertj-core/src/main/java/org/assertj/core/util/Arrays.java`
#### Snippet
```java
   */
  public static long[] array(AtomicLongArray atomicLongArray) {
    if (atomicLongArray == null) return null;
    long[] array = new long[atomicLongArray.length()];
    for (int i = 0; i < array.length; i++) {
```

### ReturnNull
Return of `null`
in `assertj-core/src/main/java/org/assertj/core/util/Arrays.java`
#### Snippet
```java
  @SuppressWarnings("unchecked")
  public static <T> T[] array(AtomicReferenceArray<T> atomicReferenceArray) {
    if (atomicReferenceArray == null) return null;
    int length = atomicReferenceArray.length();
    if (length == 0) return array();
```

### ReturnNull
Return of `null`
in `assertj-core/src/main/java/org/assertj/core/util/Arrays.java`
#### Snippet
```java
   */
  public static int[] array(AtomicIntegerArray atomicIntegerArray) {
    if (atomicIntegerArray == null) return null;
    int[] array = new int[atomicIntegerArray.length()];
    for (int i = 0; i < array.length; i++) {
```

### ReturnNull
Return of `null`
in `assertj-core/src/main/java/org/assertj/core/util/IterableUtil.java`
#### Snippet
```java
  @SafeVarargs
  public static <T> Iterable<T> iterable(T... elements) {
    if (elements == null) return null;
    ArrayList<T> list = newArrayList();
    java.util.Collections.addAll(list, elements);
```

### ReturnNull
Return of `null`
in `assertj-core/src/main/java/org/assertj/core/util/IterableUtil.java`
#### Snippet
```java
  @SuppressWarnings("unchecked")
  public static <T> T[] toArray(Iterable<? extends T> iterable) {
    if (iterable == null) return null;
    return (T[]) newArrayList(iterable).toArray();
  }
```

### ReturnNull
Return of `null`
in `assertj-core/src/main/java/org/assertj/core/util/IterableUtil.java`
#### Snippet
```java
  @SafeVarargs
  public static <T> Iterator<T> iterator(T... elements) {
    if (elements == null) return null;
    return iterable(elements).iterator();
  }
```

### ReturnNull
Return of `null`
in `assertj-core/src/main/java/org/assertj/core/util/IterableUtil.java`
#### Snippet
```java
   */
  public static <T> T[] toArray(Iterable<? extends T> iterable, Class<T> type) {
    if (iterable == null) return null;
    Collection<? extends T> collection = toCollection(iterable);
    T[] array = newArray(type, collection.size());
```

### ReturnNull
Return of `null`
in `assertj-core/src/main/java/org/assertj/core/util/Objects.java`
#### Snippet
```java
      return type.cast(o);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `assertj-core/src/main/java/org/assertj/core/util/Strings.java`
#### Snippet
```java
   */
  public static String escapePercent(String value) {
    return value == null ? null : value.replace("%", "%%");
  }

```

### ReturnNull
Return of `null`
in `assertj-core/src/main/java/org/assertj/core/util/Strings.java`
#### Snippet
```java
   */
  public static String quote(String s) {
    return s != null ? concat("'", s, "'") : null;
  }

```

### ReturnNull
Return of `null`
in `assertj-core/src/main/java/org/assertj/core/util/Strings.java`
#### Snippet
```java

  private static String revertEscapingPercent_n(String value) {
    return value == null ? null : value.replace("%%n", "%n");
  }

```

### ReturnNull
Return of `null`
in `assertj-core/src/main/java/org/assertj/core/util/Strings.java`
#### Snippet
```java
  public static String concat(Object... objects) {
    if (Arrays.isNullOrEmpty(objects)) {
      return null;
    }
    return stream(objects).map(String::valueOf).collect(joining());
```

### ReturnNull
Return of `null`
in `assertj-core/src/main/java/org/assertj/core/api/recursive/comparison/RecursiveComparisonDifferenceCalculator.java`
#### Snippet
```java
        return recursiveComparisonConfiguration.getMessageForType(fieldType);
      }
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `assertj-core/src/main/java/org/assertj/core/util/diff/myers/PathNode.java`
#### Snippet
```java
  public final PathNode previousSnake() {
    if (isBootstrap())
      return null;
    if (!isSnake() && prev != null)
      return prev.previousSnake();
```

### ReturnNull
Return of `null`
in `assertj-core/src/main/java/org/assertj/core/util/introspection/ClassUtils.java`
#### Snippet
```java
   */
  public static List<Class<?>> getAllInterfaces(Class<?> cls) {
    if (cls == null) return null;

    LinkedHashSet<Class<?>> interfacesFound = new LinkedHashSet<>();
```

### ReturnNull
Return of `null`
in `assertj-core/src/main/java/org/assertj/core/util/introspection/ClassUtils.java`
#### Snippet
```java
  public static List<Class<?>> getAllSuperclasses(final Class<?> cls) {
    if (cls == null) {
      return null;
    }
    final List<Class<?>> classes = new ArrayList<>();
```

### ReturnNull
Return of `null`
in `assertj-core/src/main/java/org/assertj/core/util/introspection/Introspection.java`
#### Snippet
```java
    // try to find isProperty for boolean properties
    Method isAccessor = findMethod("is" + capitalized, target);
    return isValidGetter(isAccessor) ? isAccessor : null;
  }

```

### ReturnNull
Return of `null`
in `assertj-core/src/main/java/org/assertj/core/util/introspection/PropertyOrFieldSupport.java`
#### Snippet
```java
      Object propertyOrFieldValue = getSimpleValue(firstPropertyName, input);
      // when one of the intermediate nested property/field value is null, return null
      if (propertyOrFieldValue == null) return null;
      // extract next sub-property/field value until reaching the last sub-property/field
      return getValueOf(nextNameFrom(propertyOrFieldName), propertyOrFieldValue);
```

### ReturnNull
Return of `null`
in `assertj-core/src/main/java/org/assertj/core/util/introspection/PropertySupport.java`
#### Snippet
```java

  private <T> List<T> simplePropertyValues(String propertyName, Class<T> clazz, Iterable<?> target) {
    return stream(target).map(e -> e == null ? null : propertyValue(propertyName, clazz, e))
                         .collect(collectingAndThen(toList(), Collections::unmodifiableList));
  }
```

### ReturnNull
Return of `null`
in `assertj-core/src/main/java/org/assertj/core/util/introspection/PropertySupport.java`
#### Snippet
```java
    // returns null if target is null as we can't extract a property from a null object
    // but don't want to raise an exception if we were looking at a nested property
    if (target == null) return null;

    if (isNestedProperty(propertyName)) {
```

### ReturnNull
Return of `null`
in `assertj-core/src/main/java/org/assertj/core/util/introspection/FieldSupport.java`
#### Snippet
```java
   */
  public <T> T fieldValue(String fieldName, Class<T> fieldClass, Object target) {
    if (target == null) return null;

    if (isNestedField(fieldName)) {
```

### ReturnNull
Return of `null`
in `assertj-core/src/main/java/org/assertj/core/util/introspection/FieldSupport.java`
#### Snippet
```java

  private <T> List<T> simpleFieldValues(String fieldName, Class<T> clazz, Iterable<?> target) {
    return stream(target).map(e -> e == null ? null : fieldValue(fieldName, clazz, e))
                         .collect(collectingAndThen(toList(), Collections::unmodifiableList));
  }
```

### ReturnNull
Return of `null`
in `assertj-core/src/main/java/org/assertj/core/error/ShouldBeEqual.java`
#### Snippet
```java
        return assertionError;
      }
      return null;
    } catch (Throwable e) {
      return null;
```

### ReturnNull
Return of `null`
in `assertj-core/src/main/java/org/assertj/core/error/ShouldBeEqual.java`
#### Snippet
```java
      return null;
    } catch (Throwable e) {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `assertj-core/src/main/java/org/assertj/core/error/ShouldBeEqual.java`
#### Snippet
```java
      return comparisonFailure;
    } catch (Throwable e) {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `assertj-core/src/main/java/org/assertj/core/error/ShouldBeEqual.java`
#### Snippet
```java
                                              representation.toStringOf(expected),
                                              representation.toStringOf(actual));
    return o instanceof AssertionError ? (AssertionError) o : null;
  }

```

### ReturnNull
Return of `null`
in `assertj-core/src/main/java/org/assertj/core/error/AssertionErrorCreator.java`
#### Snippet
```java

  private static String headingFrom(Description description) {
    return description == null ? null : DescriptionFormatter.instance().format(description);
  }

```

### ReturnNull
Return of `null`
in `assertj-core/src/main/java/org/assertj/core/internal/Lists.java`
#### Snippet
```java
    if (comparisonStrategy instanceof ComparatorBasedComparisonStrategy) { return ((ComparatorBasedComparisonStrategy) comparisonStrategy)
        .getComparator(); }
    return null;
  }

```

### ReturnNull
Return of `null`
in `assertj-core/src/main/java/org/assertj/core/internal/TypeHolder.java`
#### Snippet
```java
      if (keys.contains(interfaceClass)) return interfaceClass;
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `assertj-core/src/main/java/org/assertj/core/internal/TypeHolder.java`
#### Snippet
```java
  public T get(Class<?> clazz) {
    Class<?> relevantType = getRelevantClass(clazz);
    return relevantType == null ? null : typeHolder.get(relevantType);
  }

```

### ReturnNull
Return of `null`
in `assertj-core/src/main/java/org/assertj/core/internal/ByteArrays.java`
#### Snippet
```java
  public byte[] toByteArray(int[] ints) {
    if (ints == null) {
      return null;
    }
    byte[] bytes = new byte[ints.length];
```

### ReturnNull
Return of `null`
in `assertj-core/src/main/java/org/assertj/core/internal/Iterables.java`
#### Snippet
```java
      return ((ComparatorBasedComparisonStrategy) comparisonStrategy).getComparator();
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `assertj-core/src/main/java/org/assertj/core/internal/Dates.java`
#### Snippet
```java
                                                                     .getComparator();
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `assertj-core/src/main/java/org/assertj/core/internal/Failures.java`
#### Snippet
```java
  public AssertionError failureIfErrorMessageIsOverridden(AssertionInfo info) {
    String overridingErrorMessage = info.overridingErrorMessage();
    return isNullOrEmpty(overridingErrorMessage) ? null
        : failure(MessageFormatter.instance().format(info.description(), info.representation(),
                                                     overridingErrorMessage));
```

### ReturnNull
Return of `null`
in `assertj-core/src/main/java/org/assertj/core/internal/Comparables.java`
#### Snippet
```java
      return ((ComparatorBasedComparisonStrategy) comparisonStrategy).getComparator();
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `assertj-core/src/main/java/org/assertj/core/internal/Arrays.java`
#### Snippet
```java
  @VisibleForTesting
  public Comparator<?> getComparator() {
    if (!(comparisonStrategy instanceof ComparatorBasedComparisonStrategy)) return null;
    return ((ComparatorBasedComparisonStrategy) comparisonStrategy).getComparator();
  }
```

### ReturnNull
Return of `null`
in `assertj-core/src/main/java/org/assertj/core/internal/Arrays.java`
#### Snippet
```java
  @SuppressWarnings("unchecked")
  private static <T> List<T> asList(Object array) {
    if (array == null) return null;
    checkArgument(isArray(array), "The object should be an array");
    int length = getLength(array);
```

### ReturnNull
Return of `null`
in `assertj-core/src/main/java/org/assertj/core/internal/Strings.java`
#### Snippet
```java
      return ((ComparatorBasedComparisonStrategy) comparisonStrategy).getComparator();
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `assertj-core/src/main/java/org/assertj/core/internal/Strings.java`
#### Snippet
```java
  private static String normalizeWhitespaceAndPunctuation(CharSequence toNormalize) {
    if (toNormalize == null) {
      return null;
    }
    return normalizeWhitespace(toNormalize.toString().replaceAll(PUNCTUATION_REGEX, EMPTY_STRING));
```

### ReturnNull
Return of `null`
in `assertj-core/src/main/java/org/assertj/core/internal/Strings.java`
#### Snippet
```java

  private static String normalizeWhitespace(CharSequence toNormalize) {
    if (toNormalize == null) return null;
    final StringBuilder result = new StringBuilder(toNormalize.length());
    boolean lastWasSpace = true;
```

### ReturnNull
Return of `null`
in `assertj-core/src/main/java/org/assertj/core/presentation/BinaryRepresentation.java`
#### Snippet
```java
    if (number instanceof Float) return toStringOf((Float) number);
    if (number instanceof Double) return toStringOf((Double) number);
    return number == null ? null : number.toString();
  }

```

### ReturnNull
Return of `null`
in `assertj-core/src/main/java/org/assertj/core/presentation/StandardRepresentation.java`
#### Snippet
```java
   */
  protected String formatArray(Object o) {
    if (!isArray(o)) return null;
    return isObjectArray(o) ? smartFormat((Object[]) o) : formatPrimitiveArray(o);
  }
```

### ReturnNull
Return of `null`
in `assertj-core/src/main/java/org/assertj/core/presentation/StandardRepresentation.java`
#### Snippet
```java

  protected String toStringOf(Map<?, ?> map) {
    if (map == null) return null;
    Map<?, ?> sortedMap = toSortedMapIfPossible(map);
    Iterator<?> entriesIterator = sortedMap.entrySet().iterator();
```

### ReturnNull
Return of `null`
in `assertj-core/src/main/java/org/assertj/core/presentation/StandardRepresentation.java`
#### Snippet
```java
  @SuppressWarnings("unchecked")
  protected <T> String customFormat(T object) {
    if (object == null) return null;
    CharSequence formatted = ((Function<T, ? extends CharSequence>) customFormatterByType.get(object.getClass())).apply(object);
    return formatted != null ? formatted.toString() : null;
```

### ReturnNull
Return of `null`
in `assertj-core/src/main/java/org/assertj/core/presentation/StandardRepresentation.java`
#### Snippet
```java
    if (object == null) return null;
    CharSequence formatted = ((Function<T, ? extends CharSequence>) customFormatterByType.get(object.getClass())).apply(object);
    return formatted != null ? formatted.toString() : null;
  }

```

### ReturnNull
Return of `null`
in `assertj-core/src/main/java/org/assertj/core/presentation/StandardRepresentation.java`
#### Snippet
```java
  @Override
  public String toStringOf(Object object) {
    if (object == null) return null;
    if (hasCustomFormatterFor(object)) return customFormat(object);
    if (object instanceof ComparatorBasedComparisonStrategy) return toStringOf((ComparatorBasedComparisonStrategy) object);
```

### ReturnNull
Return of `null`
in `assertj-core/src/main/java/org/assertj/core/presentation/StandardRepresentation.java`
#### Snippet
```java

  protected String format(Object[] array, String start, String end, String elementSeparator, String indentation, Object root) {
    if (array == null) return null;
    // root is used to avoid infinite recursion in case one element refers to it.
    List<String> representedElements = representElements(Stream.of(array), start, end, elementSeparator, indentation, root);
```

### ReturnNull
Return of `null`
in `assertj-core/src/main/java/org/assertj/core/presentation/StandardRepresentation.java`
#### Snippet
```java
    // some types have already an unambiguous toString, no need to double down
    if (hasAlreadyAnUnambiguousToStringOf(obj)) return toStringOf(obj);
    return obj == null ? null : String.format("%s (%s@%s)", toStringOf(obj), classNameOf(obj), identityHexCodeOf(obj));
  }

```

### ReturnNull
Return of `null`
in `assertj-core/src/main/java/org/assertj/core/presentation/StandardRepresentation.java`
#### Snippet
```java
  protected String format(Iterable<?> iterable, String start, String end, String elementSeparator, String indentation,
                          Object root) {
    if (iterable == null) return null;
    Iterator<?> iterator = iterable.iterator();
    if (!iterator.hasNext()) return start + end;
```

### ReturnNull
Return of `null`
in `assertj-core/src/main/java/org/assertj/core/internal/Objects.java`
#### Snippet
```java
    return comparisonStrategy instanceof ComparatorBasedComparisonStrategy
        ? ((ComparatorBasedComparisonStrategy) comparisonStrategy).getComparator()
        : null;
  }

```

## UnnecessaryLocalVariable
### UnnecessaryLocalVariable
Local variable `rawComparator` is redundant
in `assertj-core/src/main/java/org/assertj/core/internal/Lists.java`
#### Snippet
```java
      // We can't verify that point because of erasure type at runtime.
      if (actual.size() == 0) return;
      Comparator rawComparator = comparator;
      if (actual.size() == 1) {
        // Compare unique element with itself to verify that it is compatible with comparator (a ClassCastException is
```

### UnnecessaryLocalVariable
Local variable `message` is redundant
in `assertj-core/src/main/java/org/assertj/core/internal/Failures.java`
#### Snippet
```java
  protected String assertionErrorMessage(AssertionInfo info, ErrorMessageFactory messageFactory) {
    String overridingErrorMessage = info.overridingErrorMessage();
    String message = isNullOrEmpty(overridingErrorMessage)
        ? messageFactory.create(info.description(), info.representation())
        : MessageFormatter.instance().format(info.description(), info.representation(), overridingErrorMessage);
```

### UnnecessaryLocalVariable
Local variable `suffix` is redundant
in `assertj-core/src/main/java/org/assertj/core/condition/Join.java`
#### Snippet
```java
                                                         .collect(toList());
    String prefix = status(actual).label + " " + descriptionPrefix() + PREFIX_DELIMITER;
    String suffix = SUFFIX_DELIMITER;
    return new JoinDescription(prefix, suffix, descriptionsWithStatus);
  }
```

### UnnecessaryLocalVariable
Local variable `suffix` is redundant
in `assertj-core/src/main/java/org/assertj/core/condition/Join.java`
#### Snippet
```java
                                                         .collect(toList());
    String prefix = descriptionPrefix() + PREFIX_DELIMITER;
    String suffix = SUFFIX_DELIMITER;
    describedAs(new JoinDescription(prefix, suffix, conditionsDescriptions));
  }
```

## ArrayHashCode
### ArrayHashCode
Array passed to 'Objects.hash()' should be wrapped in 'Arrays.hashcode()'
in `assertj-core/src/main/java/org/assertj/core/description/TextDescription.java`
#### Snippet
```java
  @Override
  public int hashCode() {
    return Objects.hash(value, args);
  }

```

## RegExpUnnecessaryNonCapturingGroup
### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:(\\d+)(?:,(\\d+))?)`
in `assertj-core/src/main/java/org/assertj/core/util/diff/DiffUtils.java`
#### Snippet
```java
public class DiffUtils {

  private static Pattern unifiedDiffChunkRe = Pattern.compile("^@@\\s+-(?:(\\d+)(?:,(\\d+))?)\\s+\\+(?:(\\d+)(?:,(\\d+))?)\\s+@@$");

  /**
```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:(\\d+)(?:,(\\d+))?)`
in `assertj-core/src/main/java/org/assertj/core/util/diff/DiffUtils.java`
#### Snippet
```java
public class DiffUtils {

  private static Pattern unifiedDiffChunkRe = Pattern.compile("^@@\\s+-(?:(\\d+)(?:,(\\d+))?)\\s+\\+(?:(\\d+)(?:,(\\d+))?)\\s+@@$");

  /**
```

## PointlessBooleanExpression
### PointlessBooleanExpression
`actual == false` can be simplified to '!actual'
in `assertj-core/src/main/java/org/assertj/core/api/AbstractBooleanAssert.java`
#### Snippet
```java
  public SELF isFalse() {
    objects.assertNotNull(info, actual);
    if (actual == false) return myself;
    throw Failures.instance().failure(info, shouldBeFalse(actual), actual, false);
  }
```

## UseBulkOperation
### UseBulkOperation
Iteration can be replaced with bulk 'Collection.addAll()' call
in `assertj-core/src/main/java/org/assertj/core/configuration/Configuration.java`
#### Snippet
```java
   */
  public void addAdditionalDateFormats(DateFormat... additionalDateFormats) {
    Stream.of(additionalDateFormats).forEach(this.additionalDateFormats::add);
  }

```

