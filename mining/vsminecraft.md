# vsminecraft 
 
# Bad smells
I found 14 bad smells with 14 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryToStringCall | 14 | true |
## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-vsminecraft7465865666642358796582855882218619386/dependencies/protobuf-2.6.1/java/src/test/java/com/google/protobuf/TextFormatTest.java`
#### Snippet
```java
builder.build().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-vsminecraft7465865666642358796582855882218619386/dependencies/protobuf-2.6.1/java/src/test/java/com/google/protobuf/TextFormatTest.java`
#### Snippet
```java
builder.build().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-vsminecraft7465865666642358796582855882218619386/dependencies/protobuf-2.6.1/java/src/test/java/com/google/protobuf/TextFormatTest.java`
#### Snippet
```java
builder.build().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-vsminecraft7465865666642358796582855882218619386/eclipseplugin/com.microsoft.javapkgsrv/src/com/microsoft/javapkgbuild/Tasks.java`
#### Snippet
```java
proj.getLocationURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-vsminecraft7465865666642358796582855882218619386/eclipseplugin/com.microsoft.javapkgsrv/src/com/microsoft/javapkgsrv/ClientProxy.java`
#### Snippet
```java
Parser.WorkspaceRoot.getLocation().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-vsminecraft7465865666642358796582855882218619386/eclipseplugin/com.microsoft.javapkgsrv/src/com/microsoft/javapkgsrv/ClientProxy.java`
#### Snippet
```java
Parser.WorkspaceRoot.getLocation().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-vsminecraft7465865666642358796582855882218619386/eclipseplugin/com.microsoft.javapkgsrv/src/com/microsoft/javapkgsrv/JavaElementLabelComposer.java`
#### Snippet
```java
root.getPath().makeRelative().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-vsminecraft7465865666642358796582855882218619386/eclipseplugin/com.microsoft.javapkgsrv/src/com/microsoft/javapkgsrv/JavaElementLabelComposer.java`
#### Snippet
```java
root.getPath().makeRelative().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-vsminecraft7465865666642358796582855882218619386/eclipseplugin/com.microsoft.javapkgsrv/src/com/microsoft/javapkgsrv/JavaElementLabelComposer.java`
#### Snippet
```java
resource.getParent().getFullPath().makeRelative().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-vsminecraft7465865666642358796582855882218619386/eclipseplugin/com.microsoft.javapkgsrv/src/com/microsoft/javapkgsrv/JavaElementLabelComposer.java`
#### Snippet
```java
root.getParent().getPath().makeRelative().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-vsminecraft7465865666642358796582855882218619386/eclipseplugin/com.microsoft.javapkgsrv/src/com/microsoft/javapkgsrv/JavaElementLabelComposer.java`
#### Snippet
```java
root.getPath().makeRelative().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-vsminecraft7465865666642358796582855882218619386/eclipseplugin/com.microsoft.javapkgsrv/src/com/microsoft/javapkgsrv/JavaParser.java`
#### Snippet
```java
type.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-vsminecraft7465865666642358796582855882218619386/eclipseplugin/com.microsoft.javapkgsrv/src/com/microsoft/javapkgsrv/JavaParser.java`
#### Snippet
```java
method.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-vsminecraft7465865666642358796582855882218619386/eclipseplugin/com.microsoft.javapkgsrv/src/com/microsoft/javapkgsrv/JavaParser.java`
#### Snippet
```java
element.getPath().toString()
```

