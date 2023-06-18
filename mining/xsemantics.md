# xsemantics 
 
# Bad smells
I found 12 bad smells with 12 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryToStringCall | 12 | true |
## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-xsemantics41685372860526922598930909430786895450/tests/org.eclipse.xsemantics.dsl.tests/src/org/eclipse/xsemantics/dsl/tests/XsemanticsValidatorTests.java`
#### Snippet
```java
testFiles.testRuleWithConclusionNotSubtype().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-xsemantics41685372860526922598930909430786895450/tests/org.eclipse.xsemantics.dsl.tests/src/org/eclipse/xsemantics/dsl/tests/XsemanticsValidatorTests.java`
#### Snippet
```java
testFiles.testRuleInvokingAnotherRuleNotValid().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-xsemantics41685372860526922598930909430786895450/tests/org.eclipse.xsemantics.dsl.tests/src/org/eclipse/xsemantics/dsl/tests/XsemanticsValidatorTests.java`
#### Snippet
```java
testFiles.testRuleInvocationWithWrongOutputArg().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-xsemantics41685372860526922598930909430786895450/tests/org.eclipse.xsemantics.dsl.tests/src/org/eclipse/xsemantics/dsl/tests/XsemanticsValidatorTests.java`
#### Snippet
```java
testFiles.testRuleInvocationWithWrongOutputArg2().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-xsemantics41685372860526922598930909430786895450/tests/org.eclipse.xsemantics.dsl.tests/src/org/eclipse/xsemantics/dsl/tests/XsemanticsValidatorTests.java`
#### Snippet
```java
testFiles.testWrongVariableDeclarationAsOutputArgument().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-xsemantics41685372860526922598930909430786895450/tests/org.eclipse.xsemantics.dsl.tests/src/org/eclipse/xsemantics/dsl/tests/XsemanticsValidatorTests.java`
#### Snippet
```java
testFiles.testRuleInvocationWithInputParamPassedAsOutput().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-xsemantics41685372860526922598930909430786895450/tests/org.eclipse.xsemantics.dsl.tests/src/org/eclipse/xsemantics/dsl/tests/XsemanticsValidatorTests.java`
#### Snippet
```java
listOfDiagnostics(validate).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-xsemantics41685372860526922598930909430786895450/tests/org.eclipse.xsemantics.dsl.tests/src/org/eclipse/xsemantics/dsl/tests/generator/fj/common/FjAbstractGeneratedTypeSystemTests.java`
#### Snippet
```java
expectedTraces.okSubtypesClasses().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-xsemantics41685372860526922598930909430786895450/tests/org.eclipse.xsemantics.dsl.tests/src/org/eclipse/xsemantics/dsl/tests/generator/fj/common/FjAbstractGeneratedTypeSystemTests.java`
#### Snippet
```java
expectedTraces.failThisDueToNullEnvironment().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-xsemantics41685372860526922598930909430786895450/tests/org.eclipse.xsemantics.dsl.tests/src/org/eclipse/xsemantics/dsl/tests/generator/fj/common/FjAbstractGeneratedTypeSystemTests.java`
#### Snippet
```java
expectedTraces.failThisDueToNotClassType().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-xsemantics41685372860526922598930909430786895450/tests/org.eclipse.xsemantics.tests.swtbot/src/org/eclipse/xsemantics/tests/swtbot/XsemanticsSwtbotTestBase.java`
#### Snippet
```java
iMarker.getAttribute(IMarker.SEVERITY).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-xsemantics41685372860526922598930909430786895450/tests/org.eclipse.xsemantics.dsl.ui.tests/src/org/eclipse/xtext/ui/tests/editor/outline/AbstractOutlineWorkbenchTest.java`
#### Snippet
```java
node.getText().toString()
```

