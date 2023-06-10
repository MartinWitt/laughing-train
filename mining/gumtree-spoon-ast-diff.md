# gumtree-spoon-ast-diff 
 
# Bad smells
I found 34 bad smells with 34 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryToStringCall | 34 | true |
## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-gumtree-spoon-ast-diff567124047036969280714764689408715594716/src/test/java/gumtree/spoon/AstComparatorTest.java`
#### Snippet
```java
((CtInvocation) (dst)).getExecutable().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-gumtree-spoon-ast-diff567124047036969280714764689408715594716/src/test/java/gumtree/spoon/AstComparatorTest.java`
#### Snippet
```java
((CtInvocation) (dst)).getExecutable().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-gumtree-spoon-ast-diff567124047036969280714764689408715594716/src/test/java/gumtree/spoon/TreeTest.java`
#### Snippet
```java
jsonOb.get(JSON_PROPERTIES.op.toString()).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-gumtree-spoon-ast-diff567124047036969280714764689408715594716/src/main/java/gumtree/spoon/builder/LabelFinder.java`
#### Snippet
```java
operator.getKind().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-gumtree-spoon-ast-diff567124047036969280714764689408715594716/src/main/java/gumtree/spoon/builder/LabelFinder.java`
#### Snippet
```java
operator.getKind().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-gumtree-spoon-ast-diff567124047036969280714764689408715594716/src/main/java/gumtree/spoon/builder/NodeCreator.java`
#### Snippet
```java
mod.getKind().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-gumtree-spoon-ast-diff567124047036969280714764689408715594716/src/main/java/gumtree/spoon/builder/TreeScanner.java`
#### Snippet
```java
element.getRoleInParent().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-gumtree-spoon-ast-diff567124047036969280714764689408715594716/src/test/java/gumtree/spoon/diff/support/SpoonSupportTest.java`
#### Snippet
```java
methodTgt.getBody().getStatements().get(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-gumtree-spoon-ast-diff567124047036969280714764689408715594716/src/test/java/gumtree/spoon/diff/support/SpoonSupportTest.java`
#### Snippet
```java
methodSrc.getBody().getStatements().get(1).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-gumtree-spoon-ast-diff567124047036969280714764689408715594716/src/test/java/gumtree/spoon/diff/support/SpoonSupportTest.java`
#### Snippet
```java
methodTgt.getBody().getStatements().get(1).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-gumtree-spoon-ast-diff567124047036969280714764689408715594716/src/test/java/gumtree/spoon/diff/support/SpoonSupportTest.java`
#### Snippet
```java
methodRight.getBody().getStatements().get(1).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-gumtree-spoon-ast-diff567124047036969280714764689408715594716/src/test/java/gumtree/spoon/diff/support/SpoonSupportTest.java`
#### Snippet
```java
methodRight.getBody().getStatements().get(1).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-gumtree-spoon-ast-diff567124047036969280714764689408715594716/src/test/resources/examples/t_227005/right_AttributeValue_1.57.java`
#### Snippet
```java
getOptionId().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-gumtree-spoon-ast-diff567124047036969280714764689408715594716/src/test/resources/examples/t_227005/right_AttributeValue_1.57.java`
#### Snippet
```java
key.getValue().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-gumtree-spoon-ast-diff567124047036969280714764689408715594716/src/test/resources/examples/t_225724/right_ScarabRequestTool_1.37.java`
#### Snippet
```java
getIntakeTool().get("Attribute", IntakeTool.DEFAULT_KEY).get("Id").toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-gumtree-spoon-ast-diff567124047036969280714764689408715594716/src/test/resources/examples/t_225724/right_ScarabRequestTool_1.37.java`
#### Snippet
```java
getIntakeTool().get("Query", IntakeTool.DEFAULT_KEY).get("Id").toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-gumtree-spoon-ast-diff567124047036969280714764689408715594716/src/test/resources/examples/t_225724/right_ScarabRequestTool_1.37.java`
#### Snippet
```java
getIntakeTool().get("Depend", IntakeTool.DEFAULT_KEY).get("Id").toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-gumtree-spoon-ast-diff567124047036969280714764689408715594716/src/test/resources/examples/t_225724/right_ScarabRequestTool_1.37.java`
#### Snippet
```java
att.get("Id").toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-gumtree-spoon-ast-diff567124047036969280714764689408715594716/src/test/resources/examples/t_225724/right_ScarabRequestTool_1.37.java`
#### Snippet
```java
getIntakeTool().get("Module", IntakeTool.DEFAULT_KEY).get("Id").toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-gumtree-spoon-ast-diff567124047036969280714764689408715594716/src/test/resources/examples/t_225724/right_ScarabRequestTool_1.37.java`
#### Snippet
```java
issueGroup.get("Id").toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-gumtree-spoon-ast-diff567124047036969280714764689408715594716/src/test/resources/examples/t_227985/left_IssueSearch_1.65.java`
#### Snippet
```java
aval.getAttributeId().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-gumtree-spoon-ast-diff567124047036969280714764689408715594716/src/test/resources/examples/t_227985/left_IssueSearch_1.65.java`
#### Snippet
```java
aval.getAttributeId().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-gumtree-spoon-ast-diff567124047036969280714764689408715594716/src/test/resources/examples/t_227985/left_IssueSearch_1.65.java`
#### Snippet
```java
rmua.getAttributeId().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-gumtree-spoon-ast-diff567124047036969280714764689408715594716/src/test/resources/examples/t_228325/left_ForgotPassword_1.10.java`
#### Snippet
```java
password.get("Username").toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-gumtree-spoon-ast-diff567124047036969280714764689408715594716/src/test/resources/examples/t_224512/left_Server_1.925.java`
#### Snippet
```java
entity.getInitiative().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-gumtree-spoon-ast-diff567124047036969280714764689408715594716/src/test/resources/examples/t_224512/left_Server_1.925.java`
#### Snippet
```java
team.getInitiative().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-gumtree-spoon-ast-diff567124047036969280714764689408715594716/src/test/resources/examples/t_224512/left_Server_1.925.java`
#### Snippet
```java
team.getInitiative().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-gumtree-spoon-ast-diff567124047036969280714764689408715594716/src/test/resources/examples/t_224512/left_Server_1.925.java`
#### Snippet
```java
player.getInitiative().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-gumtree-spoon-ast-diff567124047036969280714764689408715594716/src/test/resources/examples/t_224512/left_Server_1.925.java`
#### Snippet
```java
option.getValue().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-gumtree-spoon-ast-diff567124047036969280714764689408715594716/src/test/resources/examples/vs/06b994/TestUtilityService/TestUtilityService_t.java`
#### Snippet
```java
UriUtils.buildUri(this.host, UriUtils.buildUriPath(ExampleService.FACTORY_LINK, ServiceHost.SERVICE_URI_SUFFIX_UI)).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-gumtree-spoon-ast-diff567124047036969280714764689408715594716/src/test/resources/examples/vs/06b994/TestUtilityService/TestUtilityService_t.java`
#### Snippet
```java
UriUtils.buildUri(this.host, UriUtils.buildUriPath(ExampleService.FACTORY_LINK, s.name, ServiceHost.SERVICE_URI_SUFFIX_UI)).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-gumtree-spoon-ast-diff567124047036969280714764689408715594716/src/test/resources/examples/vs/06b994/VerificationHost/VerificationHost_s.java`
#### Snippet
```java
q.options.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-gumtree-spoon-ast-diff567124047036969280714764689408715594716/src/test/resources/examples/vs/06b994/VerificationHost/VerificationHost_s.java`
#### Snippet
```java
TestProperty.DISABLE_CONTEXT_ID_VALIDATION.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-gumtree-spoon-ast-diff567124047036969280714764689408715594716/src/test/resources/examples/vs/06b994/VerificationHost/VerificationHost_s.java`
#### Snippet
```java
TestProperty.SET_CONTEXT_ID.toString()
```

