# teamcity-rest-codegen 
 
# Bad smells
I found 6 bad smells with 6 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryToStringCall | 6 | true |
## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-teamcity-rest-codegen-827971601756384096113520680995092605230/src/main/java/com/jetbrains/codegen/docs/TeamCityExampleGenerator.java`
#### Snippet
```java
property.getExample().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-teamcity-rest-codegen-827971601756384096113520680995092605230/src/main/java/com/jetbrains/codegen/docs/TeamCityXMLExampleGenerator.java`
#### Snippet
```java
property.getExample().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-teamcity-rest-codegen-827971601756384096113520680995092605230/src/main/java/com/jetbrains/codegen/python/TeamCityPythonCodegen.java`
#### Snippet
```java
additionalProperties.get(CodegenConstants.SORT_PARAMS_BY_REQUIRED_FLAG).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-teamcity-rest-codegen-827971601756384096113520680995092605230/src/main/java/com/jetbrains/codegen/python/TeamCityPythonCodegen.java`
#### Snippet
```java
additionalProperties.get(CodegenConstants.ENSURE_UNIQUE_PARAMS).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-teamcity-rest-codegen-827971601756384096113520680995092605230/src/main/java/com/jetbrains/codegen/python/TeamCityPythonCodegen.java`
#### Snippet
```java
additionalProperties.get(CodegenConstants.ALLOW_UNICODE_IDENTIFIERS).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-teamcity-rest-codegen-827971601756384096113520680995092605230/src/main/java/com/jetbrains/codegen/python/TeamCityPythonCodegen.java`
#### Snippet
```java
additionalProperties.get(CodegenConstants.REMOVE_OPERATION_ID_PREFIX).toString()
```

