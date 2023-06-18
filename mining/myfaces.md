# myfaces 
 
# Bad smells
I found 12 bad smells with 12 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryToStringCall | 12 | true |
## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-myfaces86779896184694413695978761067310289086/impl/src/test/java/jakarta/faces/component/UIInputTest.java`
#### Snippet
```java
expression.getValue(facesContext.getELContext()).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-myfaces86779896184694413695978761067310289086/extensions/quarkus/deployment/src/main/java/org/apache/myfaces/core/extensions/quarkus/deployment/MyFacesProcessor.java`
#### Snippet
```java
annotation.name().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-myfaces86779896184694413695978761067310289086/extensions/quarkus/deployment/src/main/java/org/apache/myfaces/core/extensions/quarkus/deployment/MyFacesProcessor.java`
#### Snippet
```java
annotation.target().asClass().name().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-myfaces86779896184694413695978761067310289086/extensions/quarkus/deployment/src/main/java/org/apache/myfaces/core/extensions/quarkus/deployment/MyFacesProcessor.java`
#### Snippet
```java
ai.target().asClass().name().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-myfaces86779896184694413695978761067310289086/extensions/quarkus/deployment/src/main/java/org/apache/myfaces/core/extensions/quarkus/deployment/MyFacesProcessor.java`
#### Snippet
```java
forClass.asClass().name().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-myfaces86779896184694413695978761067310289086/extensions/quarkus/deployment/src/main/java/org/apache/myfaces/core/extensions/quarkus/deployment/MyFacesProcessor.java`
#### Snippet
```java
ai.target().asClass().name().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-myfaces86779896184694413695978761067310289086/extensions/quarkus/deployment/src/main/java/org/apache/myfaces/core/extensions/quarkus/deployment/MyFacesProcessor.java`
#### Snippet
```java
ai.target().asField().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-myfaces86779896184694413695978761067310289086/extensions/quarkus/deployment/src/main/java/org/apache/myfaces/core/extensions/quarkus/deployment/MyFacesProcessor.java`
#### Snippet
```java
ai.target().asMethod().returnType().asClassType().name().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-myfaces86779896184694413695978761067310289086/extensions/quarkus/deployment/src/main/java/org/apache/myfaces/core/extensions/quarkus/deployment/MyFacesProcessor.java`
#### Snippet
```java
ai.target().asMethod().returnType().asParameterizedType().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-myfaces86779896184694413695978761067310289086/extensions/quarkus/deployment/src/main/java/org/apache/myfaces/core/extensions/quarkus/deployment/MyFacesProcessor.java`
#### Snippet
```java
type.name().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-myfaces86779896184694413695978761067310289086/extensions/quarkus/runtime/src/main/java/org/apache/myfaces/core/extensions/quarkus/runtime/spi/QuarkusCdiELResolver.java`
#### Snippet
```java
bean.getBeanClass().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-myfaces86779896184694413695978761067310289086/impl/src/main/java/org/apache/myfaces/push/WebsocketConfigurator.java`
#### Snippet
```java
request.getRequestURI().toString()
```

