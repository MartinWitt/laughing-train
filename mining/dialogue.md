# dialogue 
 
# Bad smells
I found 8 bad smells with 8 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryToStringCall | 8 | true |
## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-dialogue-383273569198737441412179811390218235083/dialogue-target/src/test/java/com/palantir/dialogue/RequestTest.java`
#### Snippet
```java
AuthHeader.of(token).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-dialogue-383273569198737441412179811390218235083/dialogue-annotations/src/test/java/com/palantir/dialogue/annotations/MultipartRequestBodyTest.java`
#### Snippet
```java
MediaType.PLAIN_TEXT_UTF_8.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-dialogue-383273569198737441412179811390218235083/dialogue-annotations/src/test/java/com/palantir/dialogue/annotations/MultipartRequestBodyTest.java`
#### Snippet
```java
MediaType.JSON_UTF_8.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-dialogue-383273569198737441412179811390218235083/dialogue-annotations-processor/src/main/java/com/palantir/dialogue/annotations/processor/DialogueRequestAnnotationsProcessor.java`
#### Snippet
```java
MoreElements.getPackage(annotatedInterface).getQualifiedName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-dialogue-383273569198737441412179811390218235083/dialogue-annotations-processor/src/main/java/com/palantir/dialogue/annotations/processor/DialogueRequestAnnotationsProcessor.java`
#### Snippet
```java
type.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-dialogue-383273569198737441412179811390218235083/dialogue-annotations-processor/src/main/java/com/palantir/dialogue/annotations/processor/data/AnnotationReflector.java`
#### Snippet
```java
element.getSimpleName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-dialogue-383273569198737441412179811390218235083/dialogue-annotations-processor/src/main/java/com/palantir/dialogue/annotations/processor/data/AnnotationReflector.java`
#### Snippet
```java
key.getSimpleName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-dialogue-383273569198737441412179811390218235083/dialogue-annotations-processor/src/main/java/com/palantir/dialogue/annotations/processor/data/ParamTypesResolver.java`
#### Snippet
```java
variableElement.getSimpleName().toString()
```

