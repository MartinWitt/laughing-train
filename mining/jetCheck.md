# jetCheck 
 
# Bad smells
I found 11 bad smells with 1 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| ConstantValue | 6 | false |
| DeprecatedIsStillUsed | 3 | false |
| Deprecation | 1 | false |
| UnnecessaryToStringCall | 1 | true |
## RuleId[id=Deprecation]
### Deprecation
'rechecking(java.lang.String)' is deprecated
in `src/main/java/org/jetbrains/jetCheck/PropertyFailure.java`
#### Snippet
```java
    /**
     * @return the data used for generator to produce this counterexample, serialized into Base64.
     * To be used with {@link PropertyChecker.Parameters#rechecking}.
     */
    @NotNull
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/jetbrains/jetCheck/StructureNode.java`
#### Snippet
```java
      @Override
      public String toString() {
        return "-" + step.toString();
      }
    };
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'rechecking' is still used
in `src/main/java/org/jetbrains/jetCheck/PropertyChecker.java`
#### Snippet
```java
     */
    @Deprecated
    public Parameters rechecking(@NotNull String serializedData) {
      return DataSerializer.deserializeInto(serializedData, this);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'withSeed' is still used
in `src/main/java/org/jetbrains/jetCheck/PropertyChecker.java`
#### Snippet
```java
     */
    @Deprecated
    public Parameters withSeed(long seed) {
      if (serializedData != null) {
        System.err.println("withSeed ignored, because 'rechecking' is used");
```

### DeprecatedIsStillUsed
Deprecated member 'recheckingIteration' is still used
in `src/main/java/org/jetbrains/jetCheck/PropertyChecker.java`
#### Snippet
```java
     */
    @Deprecated
    public Parameters recheckingIteration(long seed, int sizeHint) {
      return withForcedIterationCount(1).withSeed(seed).withSizeHint(whatever -> sizeHint);
    }
```

## RuleId[id=ConstantValue]
### ConstantValue
Value `serializedData` is always 'null'
in `src/main/java/org/jetbrains/jetCheck/PropertyChecker.java`
#### Snippet
```java
      }

      return new Parameters(globalSeed, serializedData, sizeHintFun, iterationCount, silent, printValues, printData);
    }

```

### ConstantValue
Value `serializedData` is always 'null'
in `src/main/java/org/jetbrains/jetCheck/PropertyChecker.java`
#### Snippet
```java
      }

      return new Parameters(seed, serializedData, sizeHintFun, iterationCount, silent, printValues, printData);
    }

```

### ConstantValue
Value `silent` is always 'false'
in `src/main/java/org/jetbrains/jetCheck/PropertyChecker.java`
#### Snippet
```java
    public Parameters printRawData() {
      if (silent) throw new IllegalStateException("'printRawData' is incompatible with 'silent'");
      return new Parameters(globalSeed, serializedData, sizeHintFun, iterationCount, silent, printValues, true);
    }

```

### ConstantValue
Value `printValues` is always 'false'
in `src/main/java/org/jetbrains/jetCheck/PropertyChecker.java`
#### Snippet
```java
      if (printValues) throw new IllegalStateException("'silent' is incompatible with 'printGeneratedValues'");
      if (printData) throw new IllegalStateException("'silent' is incompatible with 'printRawData'");
      return new Parameters(globalSeed, serializedData, sizeHintFun, iterationCount, true, printValues, printData);
    }

```

### ConstantValue
Value `printData` is always 'false'
in `src/main/java/org/jetbrains/jetCheck/PropertyChecker.java`
#### Snippet
```java
      if (printValues) throw new IllegalStateException("'silent' is incompatible with 'printGeneratedValues'");
      if (printData) throw new IllegalStateException("'silent' is incompatible with 'printRawData'");
      return new Parameters(globalSeed, serializedData, sizeHintFun, iterationCount, true, printValues, printData);
    }

```

### ConstantValue
Value `silent` is always 'false'
in `src/main/java/org/jetbrains/jetCheck/PropertyChecker.java`
#### Snippet
```java
    public Parameters printGeneratedValues() {
      if (silent) throw new IllegalStateException("'printGeneratedValues' is incompatible with 'silent'");
      return new Parameters(globalSeed, serializedData, sizeHintFun, iterationCount, silent, true, printData);
    }

```

