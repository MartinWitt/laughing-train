# leshan 
 
# Bad smells
I found 25 bad smells with 25 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryToStringCall | 25 | true |
## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-leshan150528021821605297110112449225760595026/leshan-server-demo/src/main/java/org/eclipse/leshan/server/demo/servlet/log/CoapMessage.java`
#### Snippet
```java
request.getCode().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-leshan150528021821605297110112449225760595026/leshan-server-demo/src/main/java/org/eclipse/leshan/server/demo/servlet/log/CoapMessage.java`
#### Snippet
```java
request.getCode().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-leshan150528021821605297110112449225760595026/leshan-core-demo/src/main/java/org/eclipse/leshan/core/demo/cli/interactive/JLineInteractiveCommands.java`
#### Snippet
```java
commandLine.getColorScheme().errorText(string).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-leshan150528021821605297110112449225760595026/leshan-core-demo/src/main/java/org/eclipse/leshan/core/demo/cli/interactive/TerminalAppender.java`
#### Snippet
```java
console.getCursorBuffer().copy().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-leshan150528021821605297110112449225760595026/leshan-core/src/test/java/org/eclipse/leshan/core/node/codec/LwM2mNodeDecoderTest.java`
#### Snippet
```java
b.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-leshan150528021821605297110112449225760595026/leshan-core/src/test/java/org/eclipse/leshan/core/node/codec/LwM2mNodeDecoderTest.java`
#### Snippet
```java
b.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-leshan150528021821605297110112449225760595026/leshan-core/src/test/java/org/eclipse/leshan/core/node/codec/LwM2mNodeDecoderTest.java`
#### Snippet
```java
b.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-leshan150528021821605297110112449225760595026/leshan-core/src/test/java/org/eclipse/leshan/core/node/codec/LwM2mNodeDecoderTest.java`
#### Snippet
```java
b.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-leshan150528021821605297110112449225760595026/leshan-core/src/test/java/org/eclipse/leshan/core/node/codec/LwM2mNodeDecoderTest.java`
#### Snippet
```java
b.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-leshan150528021821605297110112449225760595026/leshan-core/src/main/java/org/eclipse/leshan/senml/cbor/upokecenter/SenMLCborPackSerDes.java`
#### Snippet
```java
bt.AsNumber().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-leshan150528021821605297110112449225760595026/leshan-core/src/main/java/org/eclipse/leshan/senml/cbor/upokecenter/SenMLCborPackSerDes.java`
#### Snippet
```java
t.AsNumber().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-leshan150528021821605297110112449225760595026/leshan-integration-tests/src/test/java/org/eclipse/leshan/integration/tests/util/LeshanTestClient.java`
#### Snippet
```java
ep.getURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-leshan150528021821605297110112449225760595026/leshan-integration-tests/src/test/java/org/eclipse/leshan/integration/tests/util/LeshanTestClient.java`
#### Snippet
```java
ep.getURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-leshan150528021821605297110112449225760595026/leshan-integration-tests/src/test/java/org/eclipse/leshan/integration/tests/util/LeshanTestClient.java`
#### Snippet
```java
ep.getURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-leshan150528021821605297110112449225760595026/leshan-integration-tests/src/test/java/org/eclipse/leshan/integration/tests/util/LeshanTestClient.java`
#### Snippet
```java
ep.getURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-leshan150528021821605297110112449225760595026/leshan-integration-tests/src/test/java/org/eclipse/leshan/integration/tests/util/LeshanTestClient.java`
#### Snippet
```java
ep.getURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-leshan150528021821605297110112449225760595026/leshan-integration-tests/src/test/java/org/eclipse/leshan/integration/tests/util/LeshanTestClient.java`
#### Snippet
```java
ep.getURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-leshan150528021821605297110112449225760595026/leshan-integration-tests/src/test/java/org/eclipse/leshan/integration/tests/util/LeshanTestClient.java`
#### Snippet
```java
ep.getURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-leshan150528021821605297110112449225760595026/leshan-integration-tests/src/test/java/org/eclipse/leshan/integration/tests/util/LeshanTestClient.java`
#### Snippet
```java
ep.getURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-leshan150528021821605297110112449225760595026/leshan-integration-tests/src/test/java/org/eclipse/leshan/integration/tests/util/LeshanTestClient.java`
#### Snippet
```java
ep.getURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-leshan150528021821605297110112449225760595026/leshan-integration-tests/src/test/java/org/eclipse/leshan/integration/tests/util/LeshanTestClient.java`
#### Snippet
```java
ep.getURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-leshan150528021821605297110112449225760595026/leshan-integration-tests/src/test/java/org/eclipse/leshan/integration/tests/util/LeshanTestClient.java`
#### Snippet
```java
ep.getURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-leshan150528021821605297110112449225760595026/leshan-integration-tests/src/test/java/org/eclipse/leshan/integration/tests/util/LeshanTestClient.java`
#### Snippet
```java
ep.getURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-leshan150528021821605297110112449225760595026/leshan-integration-tests/src/test/java/org/eclipse/leshan/integration/tests/util/LeshanTestClient.java`
#### Snippet
```java
ep.getURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-leshan150528021821605297110112449225760595026/leshan-integration-tests/src/test/java/org/eclipse/leshan/integration/tests/util/LeshanTestClient.java`
#### Snippet
```java
ep.getURI().toString()
```

