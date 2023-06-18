# NullAway 
 
# Bad smells
I found 14 bad smells with 14 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryToStringCall | 14 | true |
## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-NullAway-713083982244275656013653363990379230734/nullaway/src/main/java/com/uber/nullaway/ErrorBuilder.java`
#### Snippet
```java
annot.getAnnotationType().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-NullAway-713083982244275656013653363990379230734/jar-infer/jar-infer-lib/src/main/java/com/uber/nullaway/jarinfer/DefinitelyDerefedParamsDriver.java`
#### Snippet
```java
cldr.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-NullAway-713083982244275656013653363990379230734/jar-infer/jar-infer-lib/src/main/java/com/uber/nullaway/jarinfer/DefinitelyDerefedParamsDriver.java`
#### Snippet
```java
cls.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-NullAway-713083982244275656013653363990379230734/jar-infer/jar-infer-lib/src/main/java/com/uber/nullaway/jarinfer/DefinitelyDerefedParamsDriver.java`
#### Snippet
```java
cls.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-NullAway-713083982244275656013653363990379230734/jar-infer/jar-infer-lib/src/main/java/com/uber/nullaway/jarinfer/DefinitelyDerefedParamsDriver.java`
#### Snippet
```java
mtd.getDeclaringClass().getClassLoader().getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-NullAway-713083982244275656013653363990379230734/jar-infer/jar-infer-lib/src/main/java/com/uber/nullaway/jarinfer/DefinitelyDerefedParamsDriver.java`
#### Snippet
```java
mtd.getDeclaringClass().getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-NullAway-713083982244275656013653363990379230734/jar-infer/jar-infer-lib/src/main/java/com/uber/nullaway/jarinfer/DefinitelyDerefedParamsDriver.java`
#### Snippet
```java
mtd.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-NullAway-713083982244275656013653363990379230734/jar-infer/jar-infer-lib/src/main/java/com/uber/nullaway/jarinfer/DefinitelyDerefedParamsDriver.java`
#### Snippet
```java
typ.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-NullAway-713083982244275656013653363990379230734/nullaway/src/test/resources/com/uber/nullaway/testdata/NullAwayNativeModels.java`
#### Snippet
```java
m.get(x).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-NullAway-713083982244275656013653363990379230734/nullaway/src/main/java/com/uber/nullaway/dataflow/AccessPath.java`
#### Snippet
```java
target.getMethod().getSimpleName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-NullAway-713083982244275656013653363990379230734/nullaway/src/main/java/com/uber/nullaway/handlers/FieldInitializationSerializationHandler.java`
#### Snippet
```java
element.getSimpleName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-NullAway-713083982244275656013653363990379230734/nullaway/src/main/java/com/uber/nullaway/handlers/contract/fieldcontract/EnsuresNonNullHandler.java`
#### Snippet
```java
e.getSimpleName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-NullAway-713083982244275656013653363990379230734/test-java-lib-lombok/src/main/java/com/uber/lombok/UsesDTO.java`
#### Snippet
```java
ldto.getField().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-NullAway-713083982244275656013653363990379230734/test-java-lib-lombok/src/main/java/com/uber/lombok/UsesDTO.java`
#### Snippet
```java
ldto.getNullableField().toString()
```

