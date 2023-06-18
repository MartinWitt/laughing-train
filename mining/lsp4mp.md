# lsp4mp 
 
# Bad smells
I found 75 bad smells with 75 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryToStringCall | 75 | true |
## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lsp4mp69308448352718853192595569226138426997/microprofile.jdt/org.eclipse.lsp4mp.jdt.test/src/main/java/org/eclipse/lsp4mp/jdt/core/PropertiesManagerForJavaTest.java`
#### Snippet
```java
javaFile.getLocation().toFile().toURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lsp4mp69308448352718853192595569226138426997/microprofile.jdt/org.eclipse.lsp4mp.jdt.test/src/main/java/org/eclipse/lsp4mp/jdt/core/PropertiesManagerForJavaTest.java`
#### Snippet
```java
javaFile.getLocation().toFile().toURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lsp4mp69308448352718853192595569226138426997/microprofile.jdt/org.eclipse.lsp4mp.jdt.test/src/main/java/org/eclipse/lsp4mp/jdt/core/PropertiesManagerForJavaTest.java`
#### Snippet
```java
javaFile.getLocation().toFile().toURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lsp4mp69308448352718853192595569226138426997/microprofile.jdt/org.eclipse.lsp4mp.jdt.test/src/main/java/org/eclipse/lsp4mp/jdt/core/jaxrs/TestJaxRsInfoProvider.java`
#### Snippet
```java
resource.getLocationURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lsp4mp69308448352718853192595569226138426997/microprofile.jdt/org.eclipse.lsp4mp.jdt.test/src/main/java/org/eclipse/lsp4mp/jdt/core/jaxrs/java/JaxRsApplicationPathCodeLensTest.java`
#### Snippet
```java
javaFile.getLocation().toFile().toURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lsp4mp69308448352718853192595569226138426997/microprofile.jdt/org.eclipse.lsp4mp.jdt.test/src/main/java/org/eclipse/lsp4mp/jdt/core/jaxrs/java/JaxRsApplicationPathCodeLensTest.java`
#### Snippet
```java
javaFile.getLocation().toFile().toURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lsp4mp69308448352718853192595569226138426997/microprofile.jdt/org.eclipse.lsp4mp.jdt.test/src/main/java/org/eclipse/lsp4mp/jdt/core/jaxrs/java/JaxRsApplicationPathCodeLensTest.java`
#### Snippet
```java
javaFile.getLocation().toFile().toURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lsp4mp69308448352718853192595569226138426997/microprofile.jdt/org.eclipse.lsp4mp.jdt.test/src/main/java/org/eclipse/lsp4mp/jdt/core/jaxrs/java/JaxRsApplicationPathCodeLensTest.java`
#### Snippet
```java
javaFile.getLocation().toFile().toURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lsp4mp69308448352718853192595569226138426997/microprofile.jdt/org.eclipse.lsp4mp.jdt.test/src/main/java/org/eclipse/lsp4mp/jdt/core/jaxrs/java/JaxRsCodeLensTest.java`
#### Snippet
```java
javaFile.getLocation().toFile().toURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lsp4mp69308448352718853192595569226138426997/microprofile.jdt/org.eclipse.lsp4mp.jdt.test/src/main/java/org/eclipse/lsp4mp/jdt/core/jaxrs/java/JaxRsCodeLensTest.java`
#### Snippet
```java
javaFile.getLocation().toFile().toURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lsp4mp69308448352718853192595569226138426997/microprofile.jdt/org.eclipse.lsp4mp.jdt.test/src/main/java/org/eclipse/lsp4mp/jdt/core/jaxrs/java/JaxRsCodeLensTest.java`
#### Snippet
```java
javaFile.getLocation().toFile().toURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lsp4mp69308448352718853192595569226138426997/microprofile.jdt/org.eclipse.lsp4mp.jdt.core/src/main/java/org/eclipse/lsp4mp/jdt/core/utils/AnnotationUtils.java`
#### Snippet
```java
pair.getValue().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lsp4mp69308448352718853192595569226138426997/microprofile.jdt/org.eclipse.lsp4mp.jdt.core/src/main/java/org/eclipse/lsp4mp/jdt/core/utils/AnnotationUtils.java`
#### Snippet
```java
castPair.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lsp4mp69308448352718853192595569226138426997/microprofile.jdt/org.eclipse.lsp4mp.jdt.core/src/main/java/org/eclipse/lsp4mp/jdt/core/utils/JDTTypeUtils.java`
#### Snippet
```java
defaultValue.getValue().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lsp4mp69308448352718853192595569226138426997/microprofile.jdt/org.eclipse.lsp4mp.jdt.core/src/main/java/org/eclipse/lsp4mp/jdt/core/utils/JDTTypeUtils.java`
#### Snippet
```java
defaultValue.getValue().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lsp4mp69308448352718853192595569226138426997/microprofile.jdt/org.eclipse.lsp4mp.jdt.test/src/main/java/org/eclipse/lsp4mp/jdt/core/config/java/MicroProfileConfigJavaDiagnosticsTest.java`
#### Snippet
```java
javaFile.getLocation().toFile().toURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lsp4mp69308448352718853192595569226138426997/microprofile.jdt/org.eclipse.lsp4mp.jdt.test/src/main/java/org/eclipse/lsp4mp/jdt/core/config/java/MicroProfileConfigJavaDiagnosticsTest.java`
#### Snippet
```java
javaFile.getLocation().toFile().toURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lsp4mp69308448352718853192595569226138426997/microprofile.jdt/org.eclipse.lsp4mp.jdt.test/src/main/java/org/eclipse/lsp4mp/jdt/core/config/java/MicroProfileConfigJavaDiagnosticsTest.java`
#### Snippet
```java
javaFile.getLocation().toFile().toURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lsp4mp69308448352718853192595569226138426997/microprofile.jdt/org.eclipse.lsp4mp.jdt.test/src/main/java/org/eclipse/lsp4mp/jdt/core/config/java/MicroProfileConfigJavaDiagnosticsTest.java`
#### Snippet
```java
javaFile.getLocation().toFile().toURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lsp4mp69308448352718853192595569226138426997/microprofile.jdt/org.eclipse.lsp4mp.jdt.test/src/main/java/org/eclipse/lsp4mp/jdt/core/config/java/MicroProfileConfigJavaDiagnosticsTest.java`
#### Snippet
```java
javaFile.getLocation().toFile().toURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lsp4mp69308448352718853192595569226138426997/microprofile.jdt/org.eclipse.lsp4mp.jdt.test/src/main/java/org/eclipse/lsp4mp/jdt/core/config/java/MicroProfileConfigJavaDiagnosticsTest.java`
#### Snippet
```java
javaFile.getLocation().toFile().toURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lsp4mp69308448352718853192595569226138426997/microprofile.jdt/org.eclipse.lsp4mp.jdt.test/src/main/java/org/eclipse/lsp4mp/jdt/core/config/java/MicroProfileConfigJavaDiagnosticsTest.java`
#### Snippet
```java
propertiesFile.getLocation().toFile().toURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lsp4mp69308448352718853192595569226138426997/microprofile.jdt/org.eclipse.lsp4mp.jdt.test/src/main/java/org/eclipse/lsp4mp/jdt/core/config/java/MicroProfileConfigJavaDiagnosticsTest.java`
#### Snippet
```java
javaFile.getLocation().toFile().toURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lsp4mp69308448352718853192595569226138426997/microprofile.jdt/org.eclipse.lsp4mp.jdt.test/src/main/java/org/eclipse/lsp4mp/jdt/core/faulttolerance/java/MicroProfileFaultToleranceJavaDiagnosticsTest.java`
#### Snippet
```java
javaFile.getLocation().toFile().toURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lsp4mp69308448352718853192595569226138426997/microprofile.jdt/org.eclipse.lsp4mp.jdt.test/src/main/java/org/eclipse/lsp4mp/jdt/core/faulttolerance/java/MicroProfileFaultToleranceJavaDiagnosticsTest.java`
#### Snippet
```java
javaFile.getLocation().toFile().toURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lsp4mp69308448352718853192595569226138426997/microprofile.jdt/org.eclipse.lsp4mp.jdt.test/src/main/java/org/eclipse/lsp4mp/jdt/core/faulttolerance/java/MicroProfileFaultToleranceJavaDiagnosticsTest.java`
#### Snippet
```java
javaFile.getLocation().toFile().toURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lsp4mp69308448352718853192595569226138426997/microprofile.jdt/org.eclipse.lsp4mp.jdt.test/src/main/java/org/eclipse/lsp4mp/jdt/core/faulttolerance/java/MicroProfileFaultToleranceJavaDiagnosticsTest.java`
#### Snippet
```java
javaFile.getLocation().toFile().toURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lsp4mp69308448352718853192595569226138426997/microprofile.jdt/org.eclipse.lsp4mp.jdt.test/src/main/java/org/eclipse/lsp4mp/jdt/core/faulttolerance/java/MicroProfileFaultToleranceJavaDiagnosticsTest.java`
#### Snippet
```java
javaFile.getLocation().toFile().toURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lsp4mp69308448352718853192595569226138426997/microprofile.jdt/org.eclipse.lsp4mp.jdt.test/src/main/java/org/eclipse/lsp4mp/jdt/core/faulttolerance/java/MicroProfileFaultToleranceJavaDiagnosticsTest.java`
#### Snippet
```java
javaFile.getLocation().toFile().toURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lsp4mp69308448352718853192595569226138426997/microprofile.jdt/org.eclipse.lsp4mp.jdt.test/src/main/java/org/eclipse/lsp4mp/jdt/core/faulttolerance/java/MicroProfileFaultToleranceJavaDiagnosticsTest.java`
#### Snippet
```java
javaFile.getLocation().toFile().toURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lsp4mp69308448352718853192595569226138426997/microprofile.jdt/org.eclipse.lsp4mp.jdt.test/src/main/java/org/eclipse/lsp4mp/jdt/core/faulttolerance/java/MicroProfileFaultToleranceJavaDiagnosticsTest.java`
#### Snippet
```java
javaFile.getLocation().toFile().toURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lsp4mp69308448352718853192595569226138426997/microprofile.jdt/org.eclipse.lsp4mp.jdt.test/src/main/java/org/eclipse/lsp4mp/jdt/core/faulttolerance/java/MicroProfileFaultToleranceJavaDiagnosticsTest.java`
#### Snippet
```java
javaFile.getLocation().toFile().toURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lsp4mp69308448352718853192595569226138426997/microprofile.jdt/org.eclipse.lsp4mp.jdt.test/src/main/java/org/eclipse/lsp4mp/jdt/core/faulttolerance/java/MicroProfileFaultToleranceJavaDiagnosticsTest.java`
#### Snippet
```java
javaFile.getLocation().toFile().toURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lsp4mp69308448352718853192595569226138426997/microprofile.jdt/org.eclipse.lsp4mp.jdt.test/src/main/java/org/eclipse/lsp4mp/jdt/core/graphql/java/MicroProfileGraphQLValidationTest.java`
#### Snippet
```java
javaFile.getLocation().toFile().toURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lsp4mp69308448352718853192595569226138426997/microprofile.jdt/org.eclipse.lsp4mp.jdt.test/src/main/java/org/eclipse/lsp4mp/jdt/core/health/java/MicroProfileHealthJavaDiagnosticsTest.java`
#### Snippet
```java
javaFile.getLocation().toFile().toURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lsp4mp69308448352718853192595569226138426997/microprofile.jdt/org.eclipse.lsp4mp.jdt.test/src/main/java/org/eclipse/lsp4mp/jdt/core/health/java/MicroProfileHealthJavaDiagnosticsTest.java`
#### Snippet
```java
javaFile.getLocation().toFile().toURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lsp4mp69308448352718853192595569226138426997/microprofile.jdt/org.eclipse.lsp4mp.jdt.test/src/main/java/org/eclipse/lsp4mp/jdt/core/health/java/MicroProfileHealthJavaDiagnosticsTest.java`
#### Snippet
```java
javaFile.getLocation().toFile().toURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lsp4mp69308448352718853192595569226138426997/microprofile.jdt/org.eclipse.lsp4mp.jdt.test/src/main/java/org/eclipse/lsp4mp/jdt/core/health/java/MicroProfileHealthJavaDiagnosticsTest.java`
#### Snippet
```java
javaFile.getLocation().toFile().toURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lsp4mp69308448352718853192595569226138426997/microprofile.jdt/org.eclipse.lsp4mp.jdt.test/src/main/java/org/eclipse/lsp4mp/jdt/core/health/java/MicroProfileHealthJavaDiagnosticsTest.java`
#### Snippet
```java
javaFile.getLocation().toFile().toURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lsp4mp69308448352718853192595569226138426997/microprofile.jdt/org.eclipse.lsp4mp.jdt.test/src/main/java/org/eclipse/lsp4mp/jdt/core/health/java/MicroProfileHealthJavaDiagnosticsTest.java`
#### Snippet
```java
javaFile.getLocation().toFile().toURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lsp4mp69308448352718853192595569226138426997/microprofile.jdt/org.eclipse.lsp4mp.jdt.test/src/main/java/org/eclipse/lsp4mp/jdt/core/metrics/java/MicroProfileMetricsJavaDiagnosticsTest.java`
#### Snippet
```java
javaFile.getLocation().toFile().toURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lsp4mp69308448352718853192595569226138426997/microprofile.jdt/org.eclipse.lsp4mp.jdt.test/src/main/java/org/eclipse/lsp4mp/jdt/core/metrics/java/MicroProfileMetricsJavaDiagnosticsTest.java`
#### Snippet
```java
javaFile.getLocation().toFile().toURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lsp4mp69308448352718853192595569226138426997/microprofile.jdt/org.eclipse.lsp4mp.jdt.test/src/main/java/org/eclipse/lsp4mp/jdt/core/metrics/java/MicroProfileMetricsJavaDiagnosticsTest.java`
#### Snippet
```java
javaFile.getLocation().toFile().toURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lsp4mp69308448352718853192595569226138426997/microprofile.jdt/org.eclipse.lsp4mp.jdt.test/src/main/java/org/eclipse/lsp4mp/jdt/core/metrics/java/MicroProfileMetricsJavaDiagnosticsTest.java`
#### Snippet
```java
javaFile.getLocation().toFile().toURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lsp4mp69308448352718853192595569226138426997/microprofile.jdt/org.eclipse.lsp4mp.jdt.test/src/main/java/org/eclipse/lsp4mp/jdt/core/openapi/java/GenerateOpenAPIAnnotationsTest.java`
#### Snippet
```java
javaFile.getLocation().toFile().toURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lsp4mp69308448352718853192595569226138426997/microprofile.jdt/org.eclipse.lsp4mp.jdt.test/src/main/java/org/eclipse/lsp4mp/jdt/core/reactivemessaging/properties/MicroProfileReactiveMessagingTest.java`
#### Snippet
```java
javaFile.getLocation().toFile().toURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lsp4mp69308448352718853192595569226138426997/microprofile.jdt/org.eclipse.lsp4mp.jdt.test/src/main/java/org/eclipse/lsp4mp/jdt/core/restclient/java/MicroProfileRestClientJavaCodeLensTest.java`
#### Snippet
```java
javaFile.getLocation().toFile().toURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lsp4mp69308448352718853192595569226138426997/microprofile.jdt/org.eclipse.lsp4mp.jdt.test/src/main/java/org/eclipse/lsp4mp/jdt/core/restclient/java/MicroProfileRestClientJavaCodeLensTest.java`
#### Snippet
```java
javaFile.getLocation().toFile().toURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lsp4mp69308448352718853192595569226138426997/microprofile.jdt/org.eclipse.lsp4mp.jdt.test/src/main/java/org/eclipse/lsp4mp/jdt/core/restclient/java/MicroProfileRestClientJavaCodeLensTest.java`
#### Snippet
```java
javaFile.getLocation().toFile().toURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lsp4mp69308448352718853192595569226138426997/microprofile.jdt/org.eclipse.lsp4mp.jdt.test/src/main/java/org/eclipse/lsp4mp/jdt/core/restclient/java/MicroProfileRestClientJavaDiagnosticsTest.java`
#### Snippet
```java
javaFile.getLocation().toFile().toURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lsp4mp69308448352718853192595569226138426997/microprofile.jdt/org.eclipse.lsp4mp.jdt.test/src/main/java/org/eclipse/lsp4mp/jdt/core/restclient/java/MicroProfileRestClientJavaDiagnosticsTest.java`
#### Snippet
```java
javaFile.getLocation().toFile().toURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lsp4mp69308448352718853192595569226138426997/microprofile.jdt/org.eclipse.lsp4mp.jdt.test/src/main/java/org/eclipse/lsp4mp/jdt/core/restclient/java/MicroProfileRestClientJavaDiagnosticsTest.java`
#### Snippet
```java
javaFile.getLocation().toFile().toURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lsp4mp69308448352718853192595569226138426997/microprofile.jdt/org.eclipse.lsp4mp.jdt.test/src/main/java/org/eclipse/lsp4mp/jdt/core/restclient/java/MicroProfileRestClientJavaDiagnosticsTest.java`
#### Snippet
```java
javaFile.getLocation().toFile().toURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lsp4mp69308448352718853192595569226138426997/microprofile.jdt/org.eclipse.lsp4mp.jdt.test/src/main/java/org/eclipse/lsp4mp/jdt/core/restclient/java/MicroProfileRestClientJavaDiagnosticsTest.java`
#### Snippet
```java
javaFile.getLocation().toFile().toURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lsp4mp69308448352718853192595569226138426997/microprofile.jdt/org.eclipse.lsp4mp.jdt.test/src/main/java/org/eclipse/lsp4mp/jdt/core/restclient/java/MicroProfileRestClientJavaDiagnosticsTest.java`
#### Snippet
```java
javaFile.getLocation().toFile().toURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lsp4mp69308448352718853192595569226138426997/microprofile.jdt/org.eclipse.lsp4mp.jdt.test/src/main/java/org/eclipse/lsp4mp/jdt/core/restclient/java/MicroProfileRestClientJavaDiagnosticsTest.java`
#### Snippet
```java
javaFile.getLocation().toFile().toURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lsp4mp69308448352718853192595569226138426997/microprofile.jdt/org.eclipse.lsp4mp.jdt.test/src/main/java/org/eclipse/lsp4mp/jdt/core/restclient/java/MicroProfileRestClientJavaDiagnosticsTest.java`
#### Snippet
```java
javaFile.getLocation().toFile().toURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lsp4mp69308448352718853192595569226138426997/microprofile.jdt/org.eclipse.lsp4mp.jdt.test/src/main/java/org/eclipse/lsp4mp/jdt/core/snippets/JavaFileCursorContextTest.java`
#### Snippet
```java
javaFile.getLocation().toFile().toURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lsp4mp69308448352718853192595569226138426997/microprofile.jdt/org.eclipse.lsp4mp.jdt.test/src/main/java/org/eclipse/lsp4mp/jdt/core/snippets/JavaFileCursorContextTest.java`
#### Snippet
```java
javaFile.getLocation().toFile().toURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lsp4mp69308448352718853192595569226138426997/microprofile.jdt/org.eclipse.lsp4mp.jdt.test/src/main/java/org/eclipse/lsp4mp/jdt/core/snippets/JavaFileCursorContextTest.java`
#### Snippet
```java
javaFile.getLocation().toFile().toURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lsp4mp69308448352718853192595569226138426997/microprofile.jdt/org.eclipse.lsp4mp.jdt.test/src/main/java/org/eclipse/lsp4mp/jdt/core/snippets/JavaFileCursorContextTest.java`
#### Snippet
```java
javaFile.getLocation().toFile().toURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lsp4mp69308448352718853192595569226138426997/microprofile.jdt/org.eclipse.lsp4mp.jdt.test/src/main/java/org/eclipse/lsp4mp/jdt/core/snippets/JavaFileCursorContextTest.java`
#### Snippet
```java
javaFile.getLocation().toFile().toURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lsp4mp69308448352718853192595569226138426997/microprofile.jdt/org.eclipse.lsp4mp.jdt.test/src/main/java/org/eclipse/lsp4mp/jdt/core/snippets/JavaFileCursorContextTest.java`
#### Snippet
```java
javaFile.getLocation().toFile().toURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lsp4mp69308448352718853192595569226138426997/microprofile.jdt/org.eclipse.lsp4mp.jdt.test/src/main/java/org/eclipse/lsp4mp/jdt/core/snippets/JavaFileCursorContextTest.java`
#### Snippet
```java
javaFile.getLocation().toFile().toURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lsp4mp69308448352718853192595569226138426997/microprofile.jdt/org.eclipse.lsp4mp.jdt.test/src/main/java/org/eclipse/lsp4mp/jdt/core/snippets/JavaFileCursorContextTest.java`
#### Snippet
```java
javaFile.getLocation().toFile().toURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lsp4mp69308448352718853192595569226138426997/microprofile.jdt/org.eclipse.lsp4mp.jdt.test/src/main/java/org/eclipse/lsp4mp/jdt/core/snippets/JavaFileCursorContextTest.java`
#### Snippet
```java
javaFile.getLocation().toFile().toURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lsp4mp69308448352718853192595569226138426997/microprofile.jdt/org.eclipse.lsp4mp.jdt.test/src/main/java/org/eclipse/lsp4mp/jdt/core/snippets/JavaFileCursorContextTest.java`
#### Snippet
```java
javaFile.getLocation().toFile().toURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lsp4mp69308448352718853192595569226138426997/microprofile.jdt/org.eclipse.lsp4mp.jdt.test/src/main/java/org/eclipse/lsp4mp/jdt/core/snippets/JavaFileCursorContextTest.java`
#### Snippet
```java
javaFile.getLocation().toFile().toURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lsp4mp69308448352718853192595569226138426997/microprofile.jdt/org.eclipse.lsp4mp.jdt.test/src/main/java/org/eclipse/lsp4mp/jdt/core/snippets/JavaFileCursorContextTest.java`
#### Snippet
```java
javaFile.getLocation().toFile().toURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lsp4mp69308448352718853192595569226138426997/microprofile.jdt/org.eclipse.lsp4mp.jdt.test/src/main/java/org/eclipse/lsp4mp/jdt/core/snippets/JavaFileCursorContextTest.java`
#### Snippet
```java
javaFile.getLocation().toFile().toURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lsp4mp69308448352718853192595569226138426997/microprofile.jdt/org.eclipse.lsp4mp.jdt.test/src/main/java/org/eclipse/lsp4mp/jdt/core/snippets/JavaFileCursorContextTest.java`
#### Snippet
```java
javaFile.getLocation().toFile().toURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lsp4mp69308448352718853192595569226138426997/microprofile.jdt/org.eclipse.lsp4mp.jdt.test/src/main/java/org/eclipse/lsp4mp/jdt/core/snippets/JavaFileCursorContextTest.java`
#### Snippet
```java
javaFile.getLocation().toFile().toURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lsp4mp69308448352718853192595569226138426997/microprofile.jdt/org.eclipse.lsp4mp.jdt.core/src/main/java/org/eclipse/lsp4mp/jdt/internal/core/java/validators/annotations/AnnotationRulesJavaASTValidator.java`
#### Snippet
```java
attributeValueExpr.resolveConstantExpressionValue().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lsp4mp69308448352718853192595569226138426997/microprofile.jdt/org.eclipse.lsp4mp.jdt.core/src/main/java/org/eclipse/lsp4mp/jdt/internal/jaxrs/java/DefaultJaxRsInfoProvider.java`
#### Snippet
```java
javaProject.getResource().getLocationURI().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lsp4mp69308448352718853192595569226138426997/microprofile.jdt/org.eclipse.lsp4mp.jdt.core/src/main/java/org/eclipse/lsp4mp/jdt/internal/jaxrs/java/DefaultJaxRsInfoProvider.java`
#### Snippet
```java
resource.getLocationURI().toString()
```

