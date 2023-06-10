# lemminx-maven 
 
# Bad smells
I found 17 bad smells with 17 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryToStringCall | 17 | true |
## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lemminx-maven6400677865748201367590184555158369014/lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/MavenLemminxWorkspaceReader.java`
#### Snippet
```java
pomFile.toURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lemminx-maven6400677865748201367590184555158369014/lemminx-maven/src/test/java/org/eclipse/lemminx/extensions/maven/MavenProjectCacheTest.java`
#### Snippet
```java
project.getProperties().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lemminx-maven6400677865748201367590184555158369014/lemminx-maven/src/test/java/org/eclipse/lemminx/extensions/maven/MavenProjectCacheTest.java`
#### Snippet
```java
modifiedProject.getProperties().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lemminx-maven6400677865748201367590184555158369014/lemminx-maven/src/test/java/org/eclipse/lemminx/extensions/maven/participants/RemoteCentralRepoTest.java`
#### Snippet
```java
v.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lemminx-maven6400677865748201367590184555158369014/lemminx-maven/src/test/java/org/eclipse/lemminx/extensions/maven/participants/RemoteCentralRepoTest.java`
#### Snippet
```java
v.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lemminx-maven6400677865748201367590184555158369014/lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/completion/MavenCompletionParticipant.java`
#### Snippet
```java
version.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lemminx-maven6400677865748201367590184555158369014/lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/completion/MavenCompletionParticipant.java`
#### Snippet
```java
ex.getCause().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lemminx-maven6400677865748201367590184555158369014/lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/completion/MavenCompletionParticipant.java`
#### Snippet
```java
version.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lemminx-maven6400677865748201367590184555158369014/lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/definition/MavenDefinitionParticipant.java`
#### Snippet
```java
childProj.getFile().toURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lemminx-maven6400677865748201367590184555158369014/lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/definition/MavenDefinitionParticipant.java`
#### Snippet
```java
childProj.getFile().toURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lemminx-maven6400677865748201367590184555158369014/lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/hover/MavenHoverParticipant.java`
#### Snippet
```java
childProj.getFile().toURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lemminx-maven6400677865748201367590184555158369014/lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/hover/MavenHoverParticipant.java`
#### Snippet
```java
childProj.getFile().toURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lemminx-maven6400677865748201367590184555158369014/lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/hover/MavenHoverParticipant.java`
#### Snippet
```java
childProj.getFile().toURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lemminx-maven6400677865748201367590184555158369014/lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/utils/MavenPluginUtils.java`
#### Snippet
```java
version.get().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lemminx-maven6400677865748201367590184555158369014/lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/utils/ParticipantUtils.java`
#### Snippet
```java
project.getBasedir().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lemminx-maven6400677865748201367590184555158369014/lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/utils/ParticipantUtils.java`
#### Snippet
```java
project.getBasedir().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lemminx-maven6400677865748201367590184555158369014/lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/utils/PlexusConfigHelper.java`
#### Snippet
```java
ex.getCause().toString()
```

