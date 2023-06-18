# npefix 
 
# Bad smells
I found 29 bad smells with 29 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryToStringCall | 29 | true |
## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-npefix79597670522408472767896106360582290796/src/main/java/fr/inria/spirals/npefix/patch/generator/PatchGenerator.java`
#### Snippet
```java
decision.getInstance().toCtExpression(factory).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-npefix79597670522408472767896106360582290796/src/main/java/fr/inria/spirals/npefix/patch/generator/PatchGenerator.java`
#### Snippet
```java
decision.getInstance().toCtExpression(factory).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-npefix79597670522408472767896106360582290796/src/main/java/fr/inria/spirals/npefix/patch/generator/PatchGenerator.java`
#### Snippet
```java
decision.getInstance().toCtExpression(factory).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-npefix79597670522408472767896106360582290796/src/test/java/fr/inria/spirals/npefix/patchTemplate/ReplaceGlobalTest.java`
#### Snippet
```java
foo.getMethod("foo2").getBody().getStatement(1).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-npefix79597670522408472767896106360582290796/src/test/java/fr/inria/spirals/npefix/patchTemplate/ReplaceGlobalTest.java`
#### Snippet
```java
foo.getMethod("foo2").getBody().getStatement(1).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-npefix79597670522408472767896106360582290796/src/test/java/fr/inria/spirals/npefix/patchTemplate/ReplaceLocalTest.java`
#### Snippet
```java
foo.getMethod("foo2").getBody().getStatement(1).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-npefix79597670522408472767896106360582290796/src/test/java/fr/inria/spirals/npefix/patchTemplate/ReplaceLocalTest.java`
#### Snippet
```java
foo.getMethod("foo2").getBody().getStatement(1).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-npefix79597670522408472767896106360582290796/src/test/java/fr/inria/spirals/npefix/patchTemplate/SkipLineTest.java`
#### Snippet
```java
foo.getMethod("foo2").getBody().getStatement(1).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-npefix79597670522408472767896106360582290796/src/test/java/fr/inria/spirals/npefix/patchTemplate/SkipMethodReturnTest.java`
#### Snippet
```java
foo.getConstructor().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-npefix79597670522408472767896106360582290796/src/test/java/fr/inria/spirals/npefix/patchTemplate/SkipMethodReturnTest.java`
#### Snippet
```java
foo.getConstructor().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-npefix79597670522408472767896106360582290796/src/test/java/fr/inria/spirals/npefix/patchTemplate/SkipMethodReturnTest.java`
#### Snippet
```java
foo.getMethod("foo2").getBody().getStatement(1).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-npefix79597670522408472767896106360582290796/src/main/java/fr/inria/spirals/npefix/transformer/processors/BlockCoverage.java`
#### Snippet
```java
aSwitch.getSelector().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-npefix79597670522408472767896106360582290796/src/main/java/fr/inria/spirals/npefix/transformer/processors/CheckNotNull.java`
#### Snippet
```java
((CtBinaryOperator) (element)).getLeftHandOperand().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-npefix79597670522408472767896106360582290796/src/main/java/fr/inria/spirals/npefix/transformer/processors/CheckNotNull.java`
#### Snippet
```java
((CtBinaryOperator) (element)).getRightHandOperand().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-npefix79597670522408472767896106360582290796/src/main/java/fr/inria/spirals/npefix/transformer/processors/CheckNotNull.java`
#### Snippet
```java
element.getLeftHandOperand().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-npefix79597670522408472767896106360582290796/src/main/java/fr/inria/spirals/npefix/transformer/processors/CheckNotNull.java`
#### Snippet
```java
((CtIf) (parent)).getCondition().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-npefix79597670522408472767896106360582290796/src/main/java/fr/inria/spirals/npefix/transformer/processors/CheckNotNull.java`
#### Snippet
```java
((CtConditional) (parent)).getCondition().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-npefix79597670522408472767896106360582290796/src/main/java/fr/inria/spirals/npefix/transformer/processors/MethodEncapsulation.java`
#### Snippet
```java
variableRead.getVariable().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-npefix79597670522408472767896106360582290796/src/main/java/fr/inria/spirals/npefix/transformer/processors/MethodEncapsulation.java`
#### Snippet
```java
variableRead.getVariable().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-npefix79597670522408472767896106360582290796/src/main/java/fr/inria/spirals/npefix/transformer/processors/NotNullTracer.java`
#### Snippet
```java
((CtBinaryOperator) (element)).getLeftHandOperand().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-npefix79597670522408472767896106360582290796/src/main/java/fr/inria/spirals/npefix/transformer/processors/NotNullTracer.java`
#### Snippet
```java
((CtBinaryOperator) (element)).getRightHandOperand().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-npefix79597670522408472767896106360582290796/src/main/java/fr/inria/spirals/npefix/transformer/processors/NotNullTracer.java`
#### Snippet
```java
aSwitch.getSelector().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-npefix79597670522408472767896106360582290796/src/main/java/fr/inria/spirals/npefix/transformer/processors/RemoveNullCheckProcessor.java`
#### Snippet
```java
operator.getLeftHandOperand().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-npefix79597670522408472767896106360582290796/src/main/java/fr/inria/spirals/npefix/transformer/processors/RemoveNullCheckProcessor.java`
#### Snippet
```java
operator.getRightHandOperand().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-npefix79597670522408472767896106360582290796/src/main/java/fr/inria/spirals/npefix/transformer/processors/VarRetrieveAssign.java`
#### Snippet
```java
element.getAssignment().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-npefix79597670522408472767896106360582290796/src/main/java/fr/inria/spirals/npefix/transformer/processors/VarRetrieveInit.java`
#### Snippet
```java
element.getType().getPackage().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-npefix79597670522408472767896106360582290796/src/test/java/fr/inria/spirals/npefix/transformer/processors/BeforeDerefAdderTest.java`
#### Snippet
```java
NPEFixVariable.getType().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-npefix79597670522408472767896106360582290796/src/test/java/fr/inria/spirals/npefix/transformer/processors/BeforeDerefAdderTest.java`
#### Snippet
```java
NPEFixVariable.getType().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-npefix79597670522408472767896106360582290796/src/test/java/fr/inria/spirals/npefix/transformer/processors/TargetModifierTest.java`
#### Snippet
```java
ctCatch.getBody().getStatement(0).toString()
```

