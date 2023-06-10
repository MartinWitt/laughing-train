# coming 
 
# Bad smells
I found 205 bad smells with 205 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryToStringCall | 205 | true |
## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/changeminer/analyzer/instancedetector/DetectorChangePatternInstanceEngine.java`
#### Snippet
```java
currentNodeFromAction.getRoleInParent().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/CodeElementInfo.java`
#### Snippet
```java
element.getPosition().getFile().getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/CodeFeatureDetector.java`
#### Snippet
```java
exper.getType().unbox().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/FeatureAnalyzer.java`
#### Snippet
```java
analyze.toJson().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/RepairnatorFeatures.java`
#### Snippet
```java
analyze.toJson().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java
assignment.getAssigned().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java
ctLocalVariable.getDefaultExpression().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java
ctBinaryOperator.getRightHandOperand().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java
ctBinaryOperator.getLeftHandOperand().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java
ctBinaryOperator.getRightHandOperand().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java
ctBinaryOperator.getLeftHandOperand().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java
assignment.getAssigned().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java
assignment.getAssigned().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java
specificField.getDefaultExpression().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java
assignment.getAssigned().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java
inputLiteral.getValue().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java
inputLiteral.getValue().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java
inputLiteral.getValue().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java
inputLiteral.getValue().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java
inputLiteral.getValue().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/AbstractCodeAnalyzer.java`
#### Snippet
```java
inputLiteral.getValue().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/BinaryOperatorAnalyzer.java`
#### Snippet
```java
operator.getKind().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/BinaryOperatorAnalyzer.java`
#### Snippet
```java
UnaryOperatorKind.NOT.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstantAnalyzer.java`
#### Snippet
```java
var.getType().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstantAnalyzer.java`
#### Snippet
```java
var.getType().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstantAnalyzer.java`
#### Snippet
```java
var.getType().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
certainexpression.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
certainexpression.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
certainexpression.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
certainexpression.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
certainexpression.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
certainexpression.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
certainexpression.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
certainexpression.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
certainexpression.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
certainexpression.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
certainexpression.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
certainexpression.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
certainexpression.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
certainexpression.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
certainexpression.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
certainexpression.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
certainexpression.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
certainexpression.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
certainexpression.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
certainexpression.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
certainexpression.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
certainexpression.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
certainexpression.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
certainexpression.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
certainexpression.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
conAffected.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
conAffected.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
conAffected.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
conAffected.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
conAffected.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
conAffected.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
conAffected.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
conAffected.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
conAffected.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
conAffected.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
conAffected.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
conAffected.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
conAffected.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
conAffected.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
conAffected.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
conAffected.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
conAffected.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
conAffected.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
conAffected.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
conAffected.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
conAffected.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
conAffected.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
conAffected.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
conAffected.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/ConstructorAnalyzer.java`
#### Snippet
```java
conAffected.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
exper.getType().unbox().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
anotherMethodInBuggyClass.getType().unbox().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
inferredtype.unbox().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
potentionaltypes.get(i).unbox().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
aVarInScope.getType().unbox().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
invocationToStudy.getTarget().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
operator.getKind().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
operator.getKind().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
BinaryOperatorKind.AND.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
BinaryOperatorKind.OR.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
UnaryOperatorKind.NOT.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
operator.getKind().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
BinaryOperatorKind.AND.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
BinaryOperatorKind.OR.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
invocation.getTarget().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
specificbinOps.get(binopindex).getKind().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
BinaryOperatorKind.EQ.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
specificbinOps.get(binopindex).getKind().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
BinaryOperatorKind.NE.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/LogicalExpressionAnalyzer.java`
#### Snippet
```java
invocationToStudy.getTarget().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
certainexpression.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
certainexpression.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
certainexpression.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
certainexpression.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
certainexpression.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
certainexpression.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
certainexpression.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
certainexpression.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
certainexpression.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
certainexpression.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
certainexpression.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
certainexpression.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
certainexpression.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
certainexpression.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
certainexpression.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
certainexpression.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
certainexpression.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
certainexpression.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
certainexpression.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
certainexpression.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
certainexpression.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
certainexpression.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
certainexpression.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
certainexpression.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
certainexpression.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
invocation.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
invocation.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
invocation.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
invocation.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
invocation.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
invocation.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
invocation.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
invocation.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
invocation.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
invocation.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
invocation.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
invocation.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
invocation.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
invocation.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
invocation.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
invocation.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
invocation.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
invocation.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
invocation.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
invocation.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
invocation.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
invocation.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
invocation.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
invocation.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/MethodAnalyzer.java`
#### Snippet
```java
invocation.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
varAffected.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
varAffected.getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
ctVariable.getReference().getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
ctVariable.getReference().getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
ctVariable.getReference().getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
ctVariable.getReference().getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
ctVariable.getReference().getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
ctVariable.getReference().getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
ctVariable.getReference().getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
ctVariable.getReference().getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
ctVariable.getReference().getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
ctVariable.getReference().getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
ctVariable.getReference().getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
ctVariable.getReference().getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
ctVariable.getReference().getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
ctVariable.getReference().getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
ctVariable.getReference().getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
ctVariable.getReference().getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
ctVariable.getReference().getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
ctVariable.getReference().getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
ctVariable.getReference().getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
ctVariable.getReference().getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
ctVariable.getReference().getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
ctVariable.getReference().getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
ctVariable.getReference().getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
ctVariable.getReference().getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
ctVariable.getReference().getType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
varaccess.getType().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
varaccess.getType().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
varaccess.getType().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
varAffected.getType().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
varAffected.getType().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/codeanalyze/VariableAnalyzer.java`
#### Snippet
```java
varAffected.getType().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/sec/SecAnalysis.java`
#### Snippet
```java
operation.getSrcNode().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/codefeatures/sec/SecAnalysis.java`
#### Snippet
```java
op.getSrcNode().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/core/entities/output/JSonPatternInstanceOutput.java`
#### Snippet
```java
operation.getSrcNode().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/core/entities/output/JSonPatternInstanceOutput.java`
#### Snippet
```java
operation.getDstNode().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/core/entities/output/JSonPatternInstanceOutput.java`
#### Snippet
```java
operation.getSrcNode().getParent().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/core/entities/output/JSonPatternInstanceOutput.java`
#### Snippet
```java
operation.getDstNode().getParent().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/repairability/models/ASTData.java`
#### Snippet
```java
((CtVariable) (element)).getReference().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/repairability/models/ASTData.java`
#### Snippet
```java
((CtVariable) (element)).getReference().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/repairability/models/ASTData.java`
#### Snippet
```java
invocation.getExecutable().getDeclaringType().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/repairability/models/ASTData.java`
#### Snippet
```java
method.getDeclaringType().getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/repairability/models/ASTData.java`
#### Snippet
```java
((CtVariable) (element)).getReference().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/repairability/repairtools/Arja.java`
#### Snippet
```java
((CtAbstractInvocation) (dstElement)).getExecutable().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/java/fr/inria/coming/repairability/repairtools/Arja.java`
#### Snippet
```java
((CtAbstractInvocation) (srcElement)).getExecutable().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/test/java/fr/inria/coming/spoon/features/CodeFeatureDetectorTest.java`
#### Snippet
```java
e.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/test/java/fr/inria/coming/spoon/features/CodeFeatureDetectorTest.java`
#### Snippet
```java
e.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/test/java/fr/inria/coming/spoon/features/CodeFeatureDetectorTest.java`
#### Snippet
```java
e.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/test/java/fr/inria/prophet4j/GumtreeDiffTest.java`
#### Snippet
```java
operation.getSrcNode().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/test/java/fr/inria/prophet4j/GumtreeDiffTest.java`
#### Snippet
```java
operation.getDstNode().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/test/java/fr/inria/prophet4j/GumtreeDiffTest.java`
#### Snippet
```java
operations.get(0).getSrcNode().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/test/java/fr/inria/prophet4j/GumtreeDiffTest.java`
#### Snippet
```java
operations.get(0).getDstNode().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/resources/repairability_test_files/ground_truth/Arja/patch2-Chart-12-Arja-plausible/Arja/0063/Arja_0063_s.java`
#### Snippet
```java
this.dataset.getRowKey(pieIndex).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/resources/repairability_test_files/ground_truth/Arja/patch2-Chart-12-Arja-plausible/Arja/0063/Arja_0063_s.java`
#### Snippet
```java
this.dataset.getColumnKey(pieIndex).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/resources/repairability_test_files/ground_truth/Cardumen/patch4-Chart-9-Cardumen/Cardumen/00199/Cardumen_00199_s.java`
#### Snippet
```java
item.getPeriod().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/resources/repairability_test_files/ground_truth/Arja/patch1-Lang-35-Arja/Arja/0013/Arja_0013_s.java`
#### Snippet
```java
new ToStringBuilder(array, ToStringStyle.SIMPLE_STYLE).append(array).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/resources/repairability_test_files/arjafalseneg1/arja3/three/arja3_three_t.java`
#### Snippet
```java
this.dataset.getRowKey(pieIndex).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-coming69087016789096968437896601217982670449/src/main/resources/repairability_test_files/arjafalseneg1/arja3/three/arja3_three_t.java`
#### Snippet
```java
this.dataset.getColumnKey(pieIndex).toString()
```

