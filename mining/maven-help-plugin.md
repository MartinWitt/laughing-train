# maven-help-plugin 
 
# Bad smells
I found 6 bad smells with 6 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryToStringCall | 6 | true |
## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-maven-help-plugin-73053533324167307516004620143552324920/src/main/java/org/apache/maven/plugins/help/DescribeMojo.java`
#### Snippet
```java
MessageUtils.buffer().strong(name).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-maven-help-plugin-73053533324167307516004620143552324920/src/main/java/org/apache/maven/plugins/help/DescribeMojo.java`
#### Snippet
```java
MessageUtils.buffer().strong(pd.getGoalPrefix()).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-maven-help-plugin-73053533324167307516004620143552324920/src/main/java/org/apache/maven/plugins/help/DescribeMojo.java`
#### Snippet
```java
MessageUtils.buffer().strong(md.getFullGoalName()).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-maven-help-plugin-73053533324167307516004620143552324920/src/main/java/org/apache/maven/plugins/help/DescribeMojo.java`
#### Snippet
```java
MessageUtils.buffer().warning("Deprecated. " + deprecation).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-maven-help-plugin-73053533324167307516004620143552324920/src/main/java/org/apache/maven/plugins/help/DescribeMojo.java`
#### Snippet
```java
MessageUtils.buffer().warning("Deprecated. " + deprecation).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-maven-help-plugin-73053533324167307516004620143552324920/src/main/java/org/apache/maven/plugins/help/EffectivePomMojo.java`
#### Snippet
```java
MessageUtils.buffer().project("<!--.-->").toString()
```

