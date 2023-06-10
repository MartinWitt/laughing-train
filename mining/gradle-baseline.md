# gradle-baseline 
 
# Bad smells
I found 14 bad smells with 14 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryToStringCall | 14 | true |
## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-gradle-baseline-53714452057987515212937652287617766765/baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/ConsistentOverrides.java`
#### Snippet
```java
parameter.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-gradle-baseline-53714452057987515212937652287617766765/baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/ImmutablesBuilderMissingInitialization.java`
#### Snippet
```java
symbol.getSimpleName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-gradle-baseline-53714452057987515212937652287617766765/baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/ImmutablesBuilderMissingInitialization.java`
#### Snippet
```java
symbol.getSimpleName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-gradle-baseline-53714452057987515212937652287617766765/baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/MoreMatchers.java`
#### Snippet
```java
symbol.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-gradle-baseline-53714452057987515212937652287617766765/baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/StrictUnusedVariable.java`
#### Snippet
```java
name.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-gradle-baseline-53714452057987515212937652287617766765/baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/ValidateConstantMessage.java`
#### Snippet
```java
ASTHelpers.getSymbol(tree).name.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-gradle-baseline-53714452057987515212937652287617766765/gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineCheckstyle.java`
#### Snippet
```java
Paths.get(getConfigDir(), "checkstyle").toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-gradle-baseline-53714452057987515212937652287617766765/gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineFormat.java`
#### Snippet
```java
file.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-gradle-baseline-53714452057987515212937652287617766765/gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineFormat.java`
#### Snippet
```java
eclipseXml.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-gradle-baseline-53714452057987515212937652287617766765/gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/javaversions/BaselineJavaVersion.java`
#### Snippet
```java
target.get().javaLanguageVersion().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-gradle-baseline-53714452057987515212937652287617766765/gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/javaversions/BaselineJavaVersion.java`
#### Snippet
```java
target.get().javaLanguageVersion().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-gradle-baseline-53714452057987515212937652287617766765/gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/javaversions/BaselineJavaVersion.java`
#### Snippet
```java
target.get().javaLanguageVersion().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-gradle-baseline-53714452057987515212937652287617766765/gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/javaversions/BaselineJavaVersion.java`
#### Snippet
```java
target.get().javaLanguageVersion().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-gradle-baseline-53714452057987515212937652287617766765/gradle-junit-reports/src/main/java/com/palantir/gradle/junit/JunitReportsRootPlugin.java`
#### Snippet
```java
targetFile.toAbsolutePath().toString()
```

