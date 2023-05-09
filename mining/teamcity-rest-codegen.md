# teamcity-rest-codegen 
 
# Bad smells
I found 35 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UNCHECKED_WARNING | 14 | false |
| UNUSED_IMPORT | 14 | false |
| RegExpRedundantEscape | 4 | false |
| DuplicatedCode | 2 | false |
| UnpredictableBigDecimalConstructorCall | 1 | false |
## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `src/main/java/com/jetbrains/codegen/docs/TeamCityDocsCodegen.java`
#### Snippet
```java
        if (name == null) {
            return "ERROR_UNKNOWN";
        }

        // if the name is just '$', map it to 'value' for the time being.
        if ("$".equals(name)) {
            return "value";
        }

        // input[] => input
        name = name.replaceAll("\\[\\]", ""); // FIXME: a parameter should not be assigned. Also declare the methods parameters as 'final'.

        // input[a][b] => input_a_b
        name = name.replaceAll("\\[", "_");
        name = name.replaceAll("\\]", "");

        // input(a)(b) => input_a_b
        name = name.replaceAll("\\(", "_");
        name = name.replaceAll("\\)", "");

        // input-name => input_name
        name = name.replaceAll("-", "_");

        // input name and age => input_name_and_age
        name = name.replaceAll(" ", "_");

        return name;
```

### DuplicatedCode
Duplicated code
in `src/main/java/com/jetbrains/codegen/docs/TeamCityDocsCodegen.java`
#### Snippet
```java
        name = sanitizeName(name); // FIXME: a parameter should not be assigned. Also declare the methods parameters as 'final'.
        // remove dollar sign
        name = name.replaceAll("\\$", "");

        // model name cannot use reserved keyword, e.g. return
        if (isReservedWord(name)) {
            name = "model_" + name; // e.g. return => ModelReturn (after camelize)
        }

        // model name starts with number
        if (name.matches("^\\d.*")) {
            name = "model_" + name; // e.g. 200Response => Model200Response (after camelize)
        }

        if (!StringUtils.isEmpty(modelNamePrefix)) {
            name = modelNamePrefix + "_" + name;
        }

        if (!StringUtils.isEmpty(modelNameSuffix)) {
            name = name + "_" + modelNameSuffix;
        }

        // camelize the model name
        // phone_number => PhoneNumber
        return camelize(name);
```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `src/main/java/com/jetbrains/codegen/TeamCityGenerateRunnable.java`
#### Snippet
```java
            description = "specifies how a reserved name should be escaped to. Otherwise, the default _<name> is used. For example id=identifier. You can also have multiple occurrences of this option."
    )
    protected List<String> reservedWordsMappings = new ArrayList();
    @Option(
            name = {"--ignore-file-override"},
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `src/main/java/com/jetbrains/codegen/TeamCityGenerateRunnable.java`
#### Snippet
```java
            description = "sets additional properties that can be referenced by the mustache templates in the format of name=value,name=value. You can also have multiple occurrences of this option."
    )
    protected List<String> additionalProperties = new ArrayList();
    @Option(
            name = {"--language-specific-primitives"},
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `src/main/java/com/jetbrains/codegen/TeamCityGenerateRunnable.java`
#### Snippet
```java
            description = "specifies mappings between a given class and the import that should be used for that class in the format of type=import,type=import. You can also have multiple occurrences of this option."
    )
    protected List<String> importMappings = new ArrayList();
    @Option(
            name = {"--invoker-package"},
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `src/main/java/com/jetbrains/codegen/TeamCityGenerateRunnable.java`
#### Snippet
```java
            description = "sets mappings between swagger spec types and generated code types in the format of swaggerType=generatedType,swaggerType=generatedType. For example: array=List,map=Map,string=String. You can also have multiple occurrences of this option."
    )
    protected List<String> typeMappings = new ArrayList();
    @Option(
            name = {"--additional-properties"},
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `src/main/java/com/jetbrains/codegen/TeamCityGenerateRunnable.java`
#### Snippet
```java
            description = "sets instantiation type mappings in the format of type=instantiatedType,type=instantiatedType.For example (in Java): array=ArrayList,map=HashMap. In other words array types will get instantiated as ArrayList in generated code. You can also have multiple occurrences of this option."
    )
    protected List<String> instantiationTypes = new ArrayList();
    @Option(
            name = {"--type-mappings"},
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `src/main/java/com/jetbrains/codegen/TeamCityGenerateRunnable.java`
#### Snippet
```java
            description = "specifies additional language specific primitive types in the format of type1,type2,type3,type3. For example: String,boolean,Boolean,Double. You can also have multiple occurrences of this option."
    )
    protected List<String> languageSpecificPrimitives = new ArrayList();
    @Option(
            name = {"--import-mappings"},
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `src/main/java/com/jetbrains/codegen/TeamCityGenerateRunnable.java`
#### Snippet
```java
            description = "sets specified system properties in the format of name=value,name=value (or multiple options, each with name=value)"
    )
    protected List<String> systemProperties = new ArrayList();
    @Option(
            name = {"-c", "--config"},
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.HashMap'
in `src/main/java/com/jetbrains/codegen/docs/TeamCityDocsCodegen.java`
#### Snippet
```java
        Map<String, Object> objsMap = super.postProcessOperations(objs);

        HashMap<String, Object> operationsMap = (HashMap<String, Object>) objsMap.get("operations");
        ArrayList<CodegenOperation> operations = (ArrayList<CodegenOperation>) operationsMap.get("operation");
        operations.sort((o1, o2) -> {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.ArrayList'
in `src/main/java/com/jetbrains/codegen/docs/TeamCityDocsCodegen.java`
#### Snippet
```java

        HashMap<String, Object> operationsMap = (HashMap<String, Object>) objsMap.get("operations");
        ArrayList<CodegenOperation> operations = (ArrayList<CodegenOperation>) operationsMap.get("operation");
        operations.sort((o1, o2) -> {
            if (o1.path.equals(o2.path)) {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `src/main/java/com/jetbrains/codegen/docs/TeamCityDocsCodegen.java`
#### Snippet
```java
    @Override
    public Map<String, Object> postProcessSupportingFileData(Map<String, Object> objs) {
        List<Object> models = (List<Object>) objs.get("models");

        HashMap<String, Object> resultModels = new HashMap<>();
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.HashMap'
in `src/main/java/com/jetbrains/codegen/docs/TeamCityDocsCodegen.java`
#### Snippet
```java

        for (Object model : models) {
            CodegenModel cModel = (CodegenModel) ((HashMap<String, Object>) model).get("model");
            HashMap<String, Object> modelMap = new HashMap<>();
            modelMap.put("model", cModel);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `src/main/java/com/jetbrains/codegen/TeamCityGenerator.java`
#### Snippet
```java
        // generate files based on processed models
        for (String modelName : allProcessedModels.keySet()) {
            Map<String, Object> models = (Map<String, Object>) allProcessedModels.get(modelName);
            models.put("modelPackage", config.modelPackage());
            try {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `src/main/java/com/jetbrains/codegen/TeamCityGenerator.java`
#### Snippet
```java
                    continue;
                }
                Map<String, Object> modelTemplate = (Map<String, Object>) ((List<Object>) models.get("models")).get(0);
                if (config instanceof AbstractJavaCodegen) {
                    // Special handling of aliases only applies to Java
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `src/main/java/com/jetbrains/codegen/TeamCityGenerator.java`
#### Snippet
```java
                    continue;
                }
                Map<String, Object> modelTemplate = (Map<String, Object>) ((List<Object>) models.get("models")).get(0);
                if (config instanceof AbstractJavaCodegen) {
                    // Special handling of aliases only applies to Java
```

## RuleId[id=UnpredictableBigDecimalConstructorCall]
### UnpredictableBigDecimalConstructorCall
Unpredictable `new BigDecimal()` call
in `src/main/java/com/jetbrains/codegen/docs/TeamCityExampleGenerator.java`
#### Snippet
```java
            Double min = ((DecimalProperty) property).getMinimum() == null ? null : ((DecimalProperty) property).getMinimum().doubleValue();
            Double max = ((DecimalProperty) property).getMaximum() == null ? null : ((DecimalProperty) property).getMaximum().doubleValue();
            return new BigDecimal(randomNumber(min, max));
        } else if (property instanceof FileProperty) {
            return "";  // TODO
```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import io.swagger.codegen.CodegenConfig;`
in `src/main/java/com/jetbrains/codegen/TeamCityGenerator.java`
#### Snippet
```java
package com.jetbrains.codegen;

import io.swagger.codegen.CodegenConfig;
import io.swagger.codegen.CodegenModel;
import io.swagger.codegen.CodegenOperation;
```

### UNUSED_IMPORT
Unused import `import io.swagger.codegen.CodegenOperation;`
in `src/main/java/com/jetbrains/codegen/TeamCityGenerator.java`
#### Snippet
```java
import io.swagger.codegen.CodegenConfig;
import io.swagger.codegen.CodegenModel;
import io.swagger.codegen.CodegenOperation;
import io.swagger.codegen.DefaultGenerator;
import io.swagger.codegen.languages.AbstractJavaCodegen;
```

### UNUSED_IMPORT
Unused import `import io.swagger.models.ModelImpl;`
in `src/main/java/com/jetbrains/codegen/TeamCityGenerator.java`
#### Snippet
```java
import io.swagger.models.ComposedModel;
import io.swagger.models.Model;
import io.swagger.models.ModelImpl;
import io.swagger.models.RefModel;
import io.swagger.util.Json;
```

### UNUSED_IMPORT
Unused import `import org.apache.commons.lang3.StringUtils;`
in `src/main/java/com/jetbrains/codegen/TeamCityGenerator.java`
#### Snippet
```java
import io.swagger.util.Json;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
```

### UNUSED_IMPORT
Unused import `import java.io.Console;`
in `src/main/java/com/jetbrains/codegen/docs/TeamCityDocsCodegen.java`
#### Snippet
```java
import org.apache.commons.lang3.StringUtils;

import java.io.Console;
import java.io.File;
import java.util.*;
```

### UNUSED_IMPORT
Unused import `import io.swagger.models.RefModel;`
in `src/main/java/com/jetbrains/codegen/docs/TeamCityXMLExampleGenerator.java`
#### Snippet
```java
import io.swagger.models.Model;
import io.swagger.models.ModelImpl;
import io.swagger.models.RefModel;
import io.swagger.models.properties.*;
import org.apache.commons.lang3.StringUtils;
```

### UNUSED_IMPORT
Unused import `import org.apache.commons.lang3.StringUtils;`
in `src/main/java/com/jetbrains/codegen/docs/TeamCityXMLExampleGenerator.java`
#### Snippet
```java
import io.swagger.models.RefModel;
import io.swagger.models.properties.*;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
```

### UNUSED_IMPORT
Unused import `import io.swagger.models.Model;`
in `src/main/java/com/jetbrains/codegen/kotlin/TeamCityKotlinCodegen.java`
#### Snippet
```java
import io.swagger.codegen.*;
import io.swagger.codegen.languages.KotlinClientCodegen;
import io.swagger.models.Model;
import io.swagger.models.properties.Property;
import io.swagger.models.properties.StringProperty;
```

### UNUSED_IMPORT
Unused import `import io.swagger.models.properties.StringProperty;`
in `src/main/java/com/jetbrains/codegen/kotlin/TeamCityKotlinCodegen.java`
#### Snippet
```java
import io.swagger.models.Model;
import io.swagger.models.properties.Property;
import io.swagger.models.properties.StringProperty;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
```

### UNUSED_IMPORT
Unused import `import org.apache.commons.lang3.ObjectUtils;`
in `src/main/java/com/jetbrains/codegen/kotlin/TeamCityKotlinCodegen.java`
#### Snippet
```java
import io.swagger.models.properties.Property;
import io.swagger.models.properties.StringProperty;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import sun.reflect.generics.tree.Tree;
```

### UNUSED_IMPORT
Unused import `import sun.reflect.generics.tree.Tree;`
in `src/main/java/com/jetbrains/codegen/kotlin/TeamCityKotlinCodegen.java`
#### Snippet
```java
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import sun.reflect.generics.tree.Tree;

import java.io.File;
```

### UNUSED_IMPORT
Unused import `import java.util.stream.Collectors;`
in `src/main/java/com/jetbrains/codegen/kotlin/TeamCityKotlinCodegen.java`
#### Snippet
```java
import java.io.File;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

```

### UNUSED_IMPORT
Unused import `import java.util.stream.Stream;`
in `src/main/java/com/jetbrains/codegen/kotlin/TeamCityKotlinCodegen.java`
#### Snippet
```java
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TeamCityKotlinCodegen extends KotlinClientCodegen implements CodegenConfig {
```

### UNUSED_IMPORT
Unused import `import io.swagger.codegen.CliOption;`
in `src/main/java/com/jetbrains/codegen/python/TeamCityPythonCodegen.java`
#### Snippet
```java
package com.jetbrains.codegen.python;

import io.swagger.codegen.CliOption;
import io.swagger.codegen.CodegenConfig;
import io.swagger.codegen.CodegenConstants;
```

## RuleId[id=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\]` in RegExp
in `src/main/java/com/jetbrains/codegen/kotlin/TeamCityKotlinCodegen.java`
#### Snippet
```java

        // input[] => input
        name = name.replaceAll("\\[\\]", ""); // FIXME: a parameter should not be assigned. Also declare the methods parameters as 'final'.

        // input[a][b] => input_a_b
```

### RegExpRedundantEscape
Redundant character escape `\\]` in RegExp
in `src/main/java/com/jetbrains/codegen/kotlin/TeamCityKotlinCodegen.java`
#### Snippet
```java
        // input[a][b] => input_a_b
        name = name.replaceAll("\\[", "_");
        name = name.replaceAll("\\]", "");

        // input(a)(b) => input_a_b
```

### RegExpRedundantEscape
Redundant character escape `\\]` in RegExp
in `src/main/java/com/jetbrains/codegen/docs/TeamCityDocsCodegen.java`
#### Snippet
```java

        // input[] => input
        name = name.replaceAll("\\[\\]", ""); // FIXME: a parameter should not be assigned. Also declare the methods parameters as 'final'.

        // input[a][b] => input_a_b
```

### RegExpRedundantEscape
Redundant character escape `\\]` in RegExp
in `src/main/java/com/jetbrains/codegen/docs/TeamCityDocsCodegen.java`
#### Snippet
```java
        // input[a][b] => input_a_b
        name = name.replaceAll("\\[", "_");
        name = name.replaceAll("\\]", "");

        // input(a)(b) => input_a_b
```

