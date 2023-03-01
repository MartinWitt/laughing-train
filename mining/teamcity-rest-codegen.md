# teamcity-rest-codegen 
 
# Bad smells
I found 85 bad smells with 4 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| AssignmentToMethodParameter | 28 | false |
| DynamicRegexReplaceableByCompiledPattern | 26 | false |
| UNUSED_IMPORT | 14 | false |
| RegExpRedundantEscape | 4 | false |
| SizeReplaceableByIsEmpty | 3 | true |
| NestedAssignment | 3 | false |
| RedundantImplements | 2 | false |
| ReturnNull | 2 | false |
| KeySetIterationMayUseEntrySet | 1 | false |
| CodeBlock2Expr | 1 | true |
| MethodOverridesStaticMethod | 1 | false |
## RuleId[ruleID=KeySetIterationMayUseEntrySet]
### KeySetIterationMayUseEntrySet
Iteration over `allProcessedModels.keySet()` may be replaced with 'entrySet()' iteration
in `src/main/java/com/jetbrains/codegen/TeamCityGenerator.java`
#### Snippet
```java

        // generate files based on processed models
        for (String modelName : allProcessedModels.keySet()) {
            Map<String, Object> models = (Map<String, Object>) allProcessedModels.get(modelName);
            models.put("modelPackage", config.modelPackage());
```

## RuleId[ruleID=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `name`
in `src/main/java/com/jetbrains/codegen/kotlin/TeamCityKotlinCodegen.java`
#### Snippet
```java
    @Override
    public String toModelName(String name) {
        name = sanitizeName(name); // FIXME: a parameter should not be assigned. Also declare the methods parameters as 'final'.
        // remove dollar sign
        name = name.replaceAll("\\$", "");
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `src/main/java/com/jetbrains/codegen/kotlin/TeamCityKotlinCodegen.java`
#### Snippet
```java
        name = sanitizeName(name); // FIXME: a parameter should not be assigned. Also declare the methods parameters as 'final'.
        // remove dollar sign
        name = name.replaceAll("\\$", "");

        // model name cannot use reserved keyword, e.g. return
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `src/main/java/com/jetbrains/codegen/kotlin/TeamCityKotlinCodegen.java`
#### Snippet
```java
        // model name cannot use reserved keyword, e.g. return
        if (isReservedWord(name)) {
            name = "model_" + name; // e.g. return => ModelReturn (after camelize)
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `src/main/java/com/jetbrains/codegen/kotlin/TeamCityKotlinCodegen.java`
#### Snippet
```java
        // model name starts with number
        if (name.matches("^\\d.*")) {
            name = "model_" + name; // e.g. 200Response => Model200Response (after camelize)
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `src/main/java/com/jetbrains/codegen/kotlin/TeamCityKotlinCodegen.java`
#### Snippet
```java

        if (!StringUtils.isEmpty(modelNamePrefix)) {
            name = modelNamePrefix + "_" + name;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `src/main/java/com/jetbrains/codegen/kotlin/TeamCityKotlinCodegen.java`
#### Snippet
```java

        if (!StringUtils.isEmpty(modelNameSuffix)) {
            name = name + "_" + modelNameSuffix;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `src/main/java/com/jetbrains/codegen/kotlin/TeamCityKotlinCodegen.java`
#### Snippet
```java

        // input[] => input
        name = name.replaceAll("\\[\\]", ""); // FIXME: a parameter should not be assigned. Also declare the methods parameters as 'final'.

        // input[a][b] => input_a_b
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `src/main/java/com/jetbrains/codegen/kotlin/TeamCityKotlinCodegen.java`
#### Snippet
```java

        // input[a][b] => input_a_b
        name = name.replaceAll("\\[", "_");
        name = name.replaceAll("\\]", "");

```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `src/main/java/com/jetbrains/codegen/kotlin/TeamCityKotlinCodegen.java`
#### Snippet
```java
        // input[a][b] => input_a_b
        name = name.replaceAll("\\[", "_");
        name = name.replaceAll("\\]", "");

        // input(a)(b) => input_a_b
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `src/main/java/com/jetbrains/codegen/kotlin/TeamCityKotlinCodegen.java`
#### Snippet
```java

        // input(a)(b) => input_a_b
        name = name.replaceAll("\\(", "_");
        name = name.replaceAll("\\)", "");

```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `src/main/java/com/jetbrains/codegen/kotlin/TeamCityKotlinCodegen.java`
#### Snippet
```java
        // input(a)(b) => input_a_b
        name = name.replaceAll("\\(", "_");
        name = name.replaceAll("\\)", "");

        // input-name => input_name
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `src/main/java/com/jetbrains/codegen/kotlin/TeamCityKotlinCodegen.java`
#### Snippet
```java

        // input-name => input_name
        name = name.replaceAll("-", "_");

        // input name and age => input_name_and_age
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `src/main/java/com/jetbrains/codegen/kotlin/TeamCityKotlinCodegen.java`
#### Snippet
```java

        // input name and age => input_name_and_age
        name = name.replaceAll(" ", "_");

        return name;
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `src/main/java/com/jetbrains/codegen/docs/TeamCityDocsCodegen.java`
#### Snippet
```java
    @Override
    public String toModelName(String name) {
        name = sanitizeName(name); // FIXME: a parameter should not be assigned. Also declare the methods parameters as 'final'.
        // remove dollar sign
        name = name.replaceAll("\\$", "");
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `src/main/java/com/jetbrains/codegen/docs/TeamCityDocsCodegen.java`
#### Snippet
```java
        name = sanitizeName(name); // FIXME: a parameter should not be assigned. Also declare the methods parameters as 'final'.
        // remove dollar sign
        name = name.replaceAll("\\$", "");

        // model name cannot use reserved keyword, e.g. return
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `src/main/java/com/jetbrains/codegen/docs/TeamCityDocsCodegen.java`
#### Snippet
```java
        // model name cannot use reserved keyword, e.g. return
        if (isReservedWord(name)) {
            name = "model_" + name; // e.g. return => ModelReturn (after camelize)
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `src/main/java/com/jetbrains/codegen/docs/TeamCityDocsCodegen.java`
#### Snippet
```java
        // model name starts with number
        if (name.matches("^\\d.*")) {
            name = "model_" + name; // e.g. 200Response => Model200Response (after camelize)
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `src/main/java/com/jetbrains/codegen/docs/TeamCityDocsCodegen.java`
#### Snippet
```java

        if (!StringUtils.isEmpty(modelNamePrefix)) {
            name = modelNamePrefix + "_" + name;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `src/main/java/com/jetbrains/codegen/docs/TeamCityDocsCodegen.java`
#### Snippet
```java

        if (!StringUtils.isEmpty(modelNameSuffix)) {
            name = name + "_" + modelNameSuffix;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `src/main/java/com/jetbrains/codegen/docs/TeamCityDocsCodegen.java`
#### Snippet
```java

        // input[] => input
        name = name.replaceAll("\\[\\]", ""); // FIXME: a parameter should not be assigned. Also declare the methods parameters as 'final'.

        // input[a][b] => input_a_b
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `src/main/java/com/jetbrains/codegen/docs/TeamCityDocsCodegen.java`
#### Snippet
```java

        // input[a][b] => input_a_b
        name = name.replaceAll("\\[", "_");
        name = name.replaceAll("\\]", "");

```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `src/main/java/com/jetbrains/codegen/docs/TeamCityDocsCodegen.java`
#### Snippet
```java
        // input[a][b] => input_a_b
        name = name.replaceAll("\\[", "_");
        name = name.replaceAll("\\]", "");

        // input(a)(b) => input_a_b
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `src/main/java/com/jetbrains/codegen/docs/TeamCityDocsCodegen.java`
#### Snippet
```java

        // input(a)(b) => input_a_b
        name = name.replaceAll("\\(", "_");
        name = name.replaceAll("\\)", "");

```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `src/main/java/com/jetbrains/codegen/docs/TeamCityDocsCodegen.java`
#### Snippet
```java
        // input(a)(b) => input_a_b
        name = name.replaceAll("\\(", "_");
        name = name.replaceAll("\\)", "");

        // input-name => input_name
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `src/main/java/com/jetbrains/codegen/docs/TeamCityDocsCodegen.java`
#### Snippet
```java

        // input-name => input_name
        name = name.replaceAll("-", "_");

        // input name and age => input_name_and_age
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `src/main/java/com/jetbrains/codegen/docs/TeamCityDocsCodegen.java`
#### Snippet
```java

        // input name and age => input_name_and_age
        name = name.replaceAll(" ", "_");

        return name;
```

### AssignmentToMethodParameter
Assignment to method parameter `mediaTypes`
in `src/main/java/com/jetbrains/codegen/docs/TeamCityExampleGenerator.java`
#### Snippet
```java
            if (mediaTypes == null) {
                // assume application/json for this
                mediaTypes = Collections.singletonList(MIME_TYPE_JSON); // FIXME: a parameter should not be assigned. Also declare the methods parameters as 'final'.
            }
            for (String mediaType : mediaTypes) {
```

### AssignmentToMethodParameter
Assignment to method parameter `mediaTypes`
in `src/main/java/com/jetbrains/codegen/docs/TeamCityExampleGenerator.java`
#### Snippet
```java
            if (mediaTypes == null) {
                // assume application/json for this
                mediaTypes = Collections.singletonList(MIME_TYPE_JSON); // FIXME: a parameter should not be assigned. Also declare the methods parameters as 'final'.
            }
            for (String mediaType : mediaTypes) {
```

## RuleId[ruleID=RedundantImplements]
### RedundantImplements
Redundant interface declaration `CodegenConfig`
in `src/main/java/com/jetbrains/codegen/python/TeamCityPythonCodegen.java`
#### Snippet
```java
import java.io.File;

public class TeamCityPythonCodegen extends PythonClientCodegen implements CodegenConfig {
    protected String basePackage;

```

### RedundantImplements
Redundant interface declaration `CodegenConfig`
in `src/main/java/com/jetbrains/codegen/kotlin/TeamCityKotlinCodegen.java`
#### Snippet
```java
import java.util.stream.Stream;

public class TeamCityKotlinCodegen extends KotlinClientCodegen implements CodegenConfig {
    String X_SUBPACKAGE = "x-subpackage";

```

## RuleId[ruleID=ReturnNull]
### ReturnNull
Return of `null`
in `src/main/java/com/jetbrains/codegen/TeamCityGenerator.java`
#### Snippet
```java
                }

                return null;
            }
        });
```

### ReturnNull
Return of `null`
in `src/main/java/com/jetbrains/codegen/docs/TeamCityDocsCodegen.java`
#### Snippet
```java
    @Override
    public String getHelp() {
        return null;
    }

```

## RuleId[ruleID=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`interfaces.size() > 0` can be replaced with '!interfaces.isEmpty()'
in `src/main/java/com/jetbrains/codegen/TeamCityGenerator.java`
#### Snippet
```java
                        // check for interfaces
                        List<RefModel> interfaces = ((ComposedModel) model).getInterfaces();
                        if (interfaces.size() > 0) {
                            RefModel interf = interfaces.get(0);
                            return definitions.get(interf.getSimpleRef());
```

### SizeReplaceableByIsEmpty
`output.size() == 0` can be replaced with 'output.isEmpty()'
in `src/main/java/com/jetbrains/codegen/docs/TeamCityExampleGenerator.java`
#### Snippet
```java
            });
        }
        if (output.size() == 0) {
            Map<String, String> kv = new HashMap<>();
            kv.put(OUTPUT, NONE);
```

### SizeReplaceableByIsEmpty
`output.size() == 0` can be replaced with 'output.isEmpty()'
in `src/main/java/com/jetbrains/codegen/docs/TeamCityExampleGenerator.java`
#### Snippet
```java
            });
        }
        if (output.size() == 0) {
            Map<String, String> kv = new HashMap<>();
            kv.put(OUTPUT, NONE);
```

## RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/com/jetbrains/codegen/python/TeamCityPythonCodegen.java`
#### Snippet
```java
            this.setProjectName((String)this.additionalProperties.get("projectName"));
        } else {
            this.setProjectName(this.packageName.replaceAll("_", "-"));
        }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/com/jetbrains/codegen/kotlin/TeamCityKotlinCodegen.java`
#### Snippet
```java
    public CodegenProperty fromProperty(String name, Property p) {
        CodegenProperty property = super.fromProperty(name, p);
        property.name = property.name.replace(".", "|");
        property.nameInCamelCase = camelize(property.name.replace("$", ""), true);
        property.name = property.name.replace("|", ".");
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/com/jetbrains/codegen/kotlin/TeamCityKotlinCodegen.java`
#### Snippet
```java
        CodegenProperty property = super.fromProperty(name, p);
        property.name = property.name.replace(".", "|");
        property.nameInCamelCase = camelize(property.name.replace("$", ""), true);
        property.name = property.name.replace("|", ".");
        property.baseName = property.baseName.replace("$", "\\$");
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/com/jetbrains/codegen/kotlin/TeamCityKotlinCodegen.java`
#### Snippet
```java
        property.name = property.name.replace(".", "|");
        property.nameInCamelCase = camelize(property.name.replace("$", ""), true);
        property.name = property.name.replace("|", ".");
        property.baseName = property.baseName.replace("$", "\\$");

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/com/jetbrains/codegen/kotlin/TeamCityKotlinCodegen.java`
#### Snippet
```java
        property.nameInCamelCase = camelize(property.name.replace("$", ""), true);
        property.name = property.name.replace("|", ".");
        property.baseName = property.baseName.replace("$", "\\$");

        return property;
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/com/jetbrains/codegen/kotlin/TeamCityKotlinCodegen.java`
#### Snippet
```java
        name = sanitizeName(name); // FIXME: a parameter should not be assigned. Also declare the methods parameters as 'final'.
        // remove dollar sign
        name = name.replaceAll("\\$", "");

        // model name cannot use reserved keyword, e.g. return
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/com/jetbrains/codegen/kotlin/TeamCityKotlinCodegen.java`
#### Snippet
```java

        // model name starts with number
        if (name.matches("^\\d.*")) {
            name = "model_" + name; // e.g. 200Response => Model200Response (after camelize)
        }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/com/jetbrains/codegen/kotlin/TeamCityKotlinCodegen.java`
#### Snippet
```java

        // input[] => input
        name = name.replaceAll("\\[\\]", ""); // FIXME: a parameter should not be assigned. Also declare the methods parameters as 'final'.

        // input[a][b] => input_a_b
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/com/jetbrains/codegen/kotlin/TeamCityKotlinCodegen.java`
#### Snippet
```java

        // input[a][b] => input_a_b
        name = name.replaceAll("\\[", "_");
        name = name.replaceAll("\\]", "");

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/com/jetbrains/codegen/kotlin/TeamCityKotlinCodegen.java`
#### Snippet
```java
        // input[a][b] => input_a_b
        name = name.replaceAll("\\[", "_");
        name = name.replaceAll("\\]", "");

        // input(a)(b) => input_a_b
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/com/jetbrains/codegen/kotlin/TeamCityKotlinCodegen.java`
#### Snippet
```java

        // input(a)(b) => input_a_b
        name = name.replaceAll("\\(", "_");
        name = name.replaceAll("\\)", "");

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/com/jetbrains/codegen/kotlin/TeamCityKotlinCodegen.java`
#### Snippet
```java
        // input(a)(b) => input_a_b
        name = name.replaceAll("\\(", "_");
        name = name.replaceAll("\\)", "");

        // input-name => input_name
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/com/jetbrains/codegen/kotlin/TeamCityKotlinCodegen.java`
#### Snippet
```java

        // input-name => input_name
        name = name.replaceAll("-", "_");

        // input name and age => input_name_and_age
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/com/jetbrains/codegen/kotlin/TeamCityKotlinCodegen.java`
#### Snippet
```java

        // input name and age => input_name_and_age
        name = name.replaceAll(" ", "_");

        return name;
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/com/jetbrains/codegen/kotlin/TeamCityKotlinCodegen.java`
#### Snippet
```java
        supportingFiles.add(new SupportingFile("settings.gradle.mustache", "", "settings.gradle"));

        final String infrastructureFolder = (sourceFolder + File.separator + packageName + File.separator + "infrastructure").replace(".", "/");
        final String baseFolder = (sourceFolder + File.separator + packageName + File.separator + "base").replace(".", "/");

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/com/jetbrains/codegen/kotlin/TeamCityKotlinCodegen.java`
#### Snippet
```java

        final String infrastructureFolder = (sourceFolder + File.separator + packageName + File.separator + "infrastructure").replace(".", "/");
        final String baseFolder = (sourceFolder + File.separator + packageName + File.separator + "base").replace(".", "/");

        supportingFiles.add(new SupportingFile("infrastructure/ApiClient.kt.mustache", infrastructureFolder, "ApiClient.kt"));
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/com/jetbrains/codegen/docs/TeamCityDocsCodegen.java`
#### Snippet
```java
        name = sanitizeName(name); // FIXME: a parameter should not be assigned. Also declare the methods parameters as 'final'.
        // remove dollar sign
        name = name.replaceAll("\\$", "");

        // model name cannot use reserved keyword, e.g. return
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/com/jetbrains/codegen/docs/TeamCityDocsCodegen.java`
#### Snippet
```java

        // model name starts with number
        if (name.matches("^\\d.*")) {
            name = "model_" + name; // e.g. 200Response => Model200Response (after camelize)
        }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/com/jetbrains/codegen/docs/TeamCityDocsCodegen.java`
#### Snippet
```java

        // input[] => input
        name = name.replaceAll("\\[\\]", ""); // FIXME: a parameter should not be assigned. Also declare the methods parameters as 'final'.

        // input[a][b] => input_a_b
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/com/jetbrains/codegen/docs/TeamCityDocsCodegen.java`
#### Snippet
```java

        // input[a][b] => input_a_b
        name = name.replaceAll("\\[", "_");
        name = name.replaceAll("\\]", "");

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/com/jetbrains/codegen/docs/TeamCityDocsCodegen.java`
#### Snippet
```java
        // input[a][b] => input_a_b
        name = name.replaceAll("\\[", "_");
        name = name.replaceAll("\\]", "");

        // input(a)(b) => input_a_b
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/com/jetbrains/codegen/docs/TeamCityDocsCodegen.java`
#### Snippet
```java

        // input(a)(b) => input_a_b
        name = name.replaceAll("\\(", "_");
        name = name.replaceAll("\\)", "");

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/com/jetbrains/codegen/docs/TeamCityDocsCodegen.java`
#### Snippet
```java
        // input(a)(b) => input_a_b
        name = name.replaceAll("\\(", "_");
        name = name.replaceAll("\\)", "");

        // input-name => input_name
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/com/jetbrains/codegen/docs/TeamCityDocsCodegen.java`
#### Snippet
```java

        // input-name => input_name
        name = name.replaceAll("-", "_");

        // input name and age => input_name_and_age
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/com/jetbrains/codegen/docs/TeamCityDocsCodegen.java`
#### Snippet
```java

        // input name and age => input_name_and_age
        name = name.replaceAll(" ", "_");

        return name;
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/com/jetbrains/codegen/docs/TeamCityDocsCodegen.java`
#### Snippet
```java
                //patch LocatorEntity description with a link to <model>.md
                if (m.vendorExtensions.get("x-is-locator") != null) {
                    newDescription = newDescription.replace(
                            "Represents a locator string",
                            "Represents a [locator string](teamcity-rest-api-documentation.md#Locator)"
```

## RuleId[ruleID=UNUSED_IMPORT]
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

## RuleId[ruleID=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `src/main/java/com/jetbrains/codegen/python/TeamCityPythonCodegen.java`
#### Snippet
```java
        super();

        embeddedTemplateDir = templateDir = "teamcity_python";
    }

```

### NestedAssignment
Result of assignment expression used
in `src/main/java/com/jetbrains/codegen/kotlin/TeamCityKotlinCodegen.java`
#### Snippet
```java
        String sourceFolder = "src/main/kotlin";

        embeddedTemplateDir = templateDir = "teamcity_kotlin";
        artifactId = "teamcity-kotlin-rest-client";
        packageName = "org.jetbrains.teamcity.rest";
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/com/jetbrains/codegen/docs/TeamCityDocsCodegen.java`
#### Snippet
```java
        modelTemplateFiles.put("model.mustache", ".md");
        apiTemplateFiles.put("api.mustache", ".md");
        embeddedTemplateDir = templateDir = "teamcity_docs";

        cliOptions.add(new CliOption(CodegenConstants.INVOKER_PACKAGE, CodegenConstants.INVOKER_PACKAGE_DESC));
```

## RuleId[ruleID=CodeBlock2Expr]
### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/main/java/com/jetbrains/codegen/docs/TeamCityXMLExampleGenerator.java`
#### Snippet
```java
            else {
                if (model.getProperties() != null) {
                    model.getProperties().forEach((propertyName, property) -> {
                        serializePropertyToXml(doc, propertyName, property, depth + 1, targetElement);
                    });
```

## RuleId[ruleID=RegExpRedundantEscape]
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

## RuleId[ruleID=MethodOverridesStaticMethod]
### MethodOverridesStaticMethod
Method `main()` tries to override a static method of a superclass
in `src/main/java/com/jetbrains/codegen/TeamCityCodegen.java`
#### Snippet
```java

public class TeamCityCodegen extends SwaggerCodegen {
    public static void main(String[] args) {
        String version = Version.readVersionFromResources();
        @SuppressWarnings("unchecked")
```

