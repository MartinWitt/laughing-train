# nopol 
 
# Bad smells
I found 28 bad smells with 28 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryToStringCall | 28 | true |
## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-nopol729827692354085939613546536761203671107/nopol/src/main/java/fr/inria/lille/commons/synthesis/smt/SMTLibScriptSolution.java`
#### Snippet
```java
nestedSeq.sexprs().get(1).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-nopol729827692354085939613546536761203671107/nopol/src/test/java/fr/inria/lille/commons/smt/SMTLibTest.java`
#### Snippet
```java
parsedDeclaration.sort().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-nopol729827692354085939613546536761203671107/nopol/src/test/java/fr/inria/lille/commons/smt/SMTLibTest.java`
#### Snippet
```java
declaration.sort().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-nopol729827692354085939613546536761203671107/nopol/src/test/java/fr/inria/lille/commons/smt/SMTLibTest.java`
#### Snippet
```java
parsedExists.parameters().get(0).sort().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-nopol729827692354085939613546536761203671107/nopol/src/test/java/fr/inria/lille/commons/smt/SMTLibTest.java`
#### Snippet
```java
exists.parameters().get(0).sort().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-nopol729827692354085939613546536761203671107/nopol/src/test/java/fr/inria/lille/commons/smt/SMTLibTest.java`
#### Snippet
```java
parsedExists.parameters().get(1).sort().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-nopol729827692354085939613546536761203671107/nopol/src/test/java/fr/inria/lille/commons/smt/SMTLibTest.java`
#### Snippet
```java
exists.parameters().get(1).sort().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-nopol729827692354085939613546536761203671107/nopol/src/test/java/fr/inria/lille/commons/smt/SMTLibTest.java`
#### Snippet
```java
parsedExists.expr().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-nopol729827692354085939613546536761203671107/nopol/src/test/java/fr/inria/lille/commons/smt/SMTLibTest.java`
#### Snippet
```java
exists.expr().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-nopol729827692354085939613546536761203671107/nopol/src/test/java/fr/inria/lille/commons/smt/SMTLibTest.java`
#### Snippet
```java
forall.parameters().get(0).sort().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-nopol729827692354085939613546536761203671107/nopol/src/test/java/fr/inria/lille/commons/smt/SMTLibTest.java`
#### Snippet
```java
forall.parameters().get(1).sort().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-nopol729827692354085939613546536761203671107/nopol/src/test/java/fr/inria/lille/commons/smt/SMTLibTest.java`
#### Snippet
```java
forall.expr().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-nopol729827692354085939613546536761203671107/nopol/src/test/java/fr/inria/lille/commons/smt/SMTLibTest.java`
#### Snippet
```java
constant.resultSort().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-nopol729827692354085939613546536761203671107/nopol/src/test/java/fr/inria/lille/commons/smt/SMTLibTest.java`
#### Snippet
```java
functionDeclaration.argSorts().get(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-nopol729827692354085939613546536761203671107/nopol/src/test/java/fr/inria/lille/commons/smt/SMTLibTest.java`
#### Snippet
```java
functionDeclaration.argSorts().get(1).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-nopol729827692354085939613546536761203671107/nopol/src/test/java/fr/inria/lille/commons/smt/SMTLibTest.java`
#### Snippet
```java
functionDeclaration.argSorts().get(2).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-nopol729827692354085939613546536761203671107/nopol/src/test/java/fr/inria/lille/commons/smt/SMTLibTest.java`
#### Snippet
```java
functionDeclaration.resultSort().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-nopol729827692354085939613546536761203671107/nopol/src/test/java/fr/inria/lille/commons/smt/SMTLibTest.java`
#### Snippet
```java
functionDefinition.parameters().get(0).sort().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-nopol729827692354085939613546536761203671107/nopol/src/test/java/fr/inria/lille/commons/smt/SMTLibTest.java`
#### Snippet
```java
functionDefinition.parameters().get(1).sort().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-nopol729827692354085939613546536761203671107/nopol/src/test/java/fr/inria/lille/commons/smt/SMTLibTest.java`
#### Snippet
```java
assertion.expr().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-nopol729827692354085939613546536761203671107/nopol/src/main/java/fr/inria/lille/evo/Main.java`
#### Snippet
```java
clazz.getPackage().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-nopol729827692354085939613546536761203671107/nopol/src/main/java/fr/inria/lille/repair/infinitel/InfiniteLoopFixer.java`
#### Snippet
```java
loop.astLoop().getParent().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-nopol729827692354085939613546536761203671107/nopol/src/main/java/fr/inria/lille/repair/infinitel/loop/While.java`
#### Snippet
```java
astLoop().getLoopingExpression().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-nopol729827692354085939613546536761203671107/nopol/src/main/java/fr/inria/lille/repair/nopol/spoon/smt/ConditionalReplacer.java`
#### Snippet
```java
((CtIf) (target)).getCondition().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-nopol729827692354085939613546536761203671107/nopol/src/main/java/fr/inria/lille/repair/nopol/spoon/symbolic/LiteralReplacer.java`
#### Snippet
```java
((CtAssignment<?, ?>) (statement)).getAssignment().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-nopol729827692354085939613546536761203671107/nopol/src/main/java/fr/inria/lille/repair/nopol/spoon/symbolic/LiteralReplacer.java`
#### Snippet
```java
((CtLocalVariable<?>) (statement)).getDefaultExpression().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-nopol729827692354085939613546536761203671107/nopol/src/main/java/fr/inria/lille/repair/nopol/spoon/symbolic/SymbolicConditionalReplacer.java`
#### Snippet
```java
((CtIf) (target)).getCondition().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-nopol729827692354085939613546536761203671107/nopol/src/test/java/fr/inria/lille/repair/spoon/ConditionnalInstrumenterTest.java`
#### Snippet
```java
spoonCl.getSimpleType().getMethodsByName("throwingExceptionDueToTheName").get(0).toString()
```

