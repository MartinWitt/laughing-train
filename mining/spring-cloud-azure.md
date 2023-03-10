# spring-cloud-azure 
 
# Bad smells
I found 13 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| SystemOutErr | 6 | false |
| DynamicRegexReplaceableByCompiledPattern | 2 | false |
| ThrowablePrintStackTrace | 2 | false |
| AssignmentToMethodParameter | 1 | false |
| CallToStringConcatCanBeReplacedByOperator | 1 | false |
| NonShortCircuitBoolean | 1 | false |
## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `outputFile`
in `spring-cloud-azure-markdown-appdendix-generator/src/main/java/com/azure/spring/cloud/internal/Main.java`
#### Snippet
```java
		 */
		private String generateTitleName(String outputFile) {
			outputFile = outputFile
					.substring(outputFile.lastIndexOf(File.separator) + "_configuration-properties-".length(),
							outputFile.lastIndexOf("."))
```

## RuleId[id=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `spring-cloud-azure-markdown-appdendix-generator/src/main/java/com/azure/spring/cloud/internal/Main.java`
#### Snippet
```java
				e.printStackTrace();
			}
			System.out.println("Successfully stored the output Markdown file!");
		}

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `spring-cloud-azure-markdown-appdendix-generator/src/main/java/com/azure/spring/cloud/internal/Main.java`
#### Snippet
```java
		void generate(String outputFile, String inclusionPattern, String date) {
			try {
				System.out.println("Parsing all configuration metadata");
				List<Resource> resources = getSpringConfigurationMetadataJsonFilesInClasspath();
				TreeMap<String, String> descriptions = new TreeMap<>();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `spring-cloud-azure-markdown-appdendix-generator/src/main/java/com/azure/spring/cloud/internal/Main.java`
#### Snippet
```java
					});
				}
				System.out.println("Found [" + resources.size() + "] Azure projects configuration metadata jsons. ["
						+ descriptions.size() + "/" + propertyCount + "] were matching the pattern [" + inclusionPattern
						+ "]");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `spring-cloud-azure-markdown-appdendix-generator/src/main/java/com/azure/spring/cloud/internal/Main.java`
#### Snippet
```java
						+ descriptions.size() + "/" + propertyCount + "] were matching the pattern [" + inclusionPattern
						+ "]");
				System.out.println("Successfully built the description table");
				if (descriptions.isEmpty()) {
					System.out.println("Will not update the table, since no configuration properties were found!");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `spring-cloud-azure-markdown-appdendix-generator/src/main/java/com/azure/spring/cloud/internal/Main.java`
#### Snippet
```java
				System.out.println("Successfully built the description table");
				if (descriptions.isEmpty()) {
					System.out.println("Will not update the table, since no configuration properties were found!");
					return;
				}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `spring-cloud-azure-markdown-appdendix-generator/src/main/java/com/azure/spring/cloud/internal/Main.java`
#### Snippet
```java
		File parent = new File(outputFile).getParentFile();
		if (!parent.exists()) {
			System.out.println(
					"No parent directory [" + parent + "] found. Will not generate the configuration properties file");
			return;
```

## RuleId[id=CallToStringConcatCanBeReplacedByOperator]
### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `spring-cloud-azure-markdown-appdendix-generator/src/main/java/com/azure/spring/cloud/internal/Main.java`
#### Snippet
```java
			}
			else {
				return letters.substring(0, 1).toUpperCase().concat(letters.substring(1));
			}
		}
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `spring-cloud-azure-markdown-appdendix-generator/src/main/java/com/azure/spring/cloud/internal/Main.java`
#### Snippet
```java
	 */
	public static void main(String... args) {
		String outputFile = args[0].replace("adoc", "md").replace("_", "");
		String inclusionPattern = args.length > 1 ? args[1] : ".*";
		File parent = new File(outputFile).getParentFile();
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `spring-cloud-azure-markdown-appdendix-generator/src/main/java/com/azure/spring/cloud/internal/Main.java`
#### Snippet
```java
	 */
	public static void main(String... args) {
		String outputFile = args[0].replace("adoc", "md").replace("_", "");
		String inclusionPattern = args.length > 1 ? args[1] : ".*";
		File parent = new File(outputFile).getParentFile();
```

## RuleId[id=NonShortCircuitBoolean]
### NonShortCircuitBoolean
Non-short-circuit boolean expression `"db".equals(letters) | "jms".equals(letters) | "b2c".equals(letters)`
in `spring-cloud-azure-markdown-appdendix-generator/src/main/java/com/azure/spring/cloud/internal/Main.java`
#### Snippet
```java
		 */
		private String uppercaseString(String letters) {
			if ("db".equals(letters) | "jms".equals(letters) | "b2c".equals(letters)) {
				return letters.toUpperCase();
			}
```

## RuleId[id=ThrowablePrintStackTrace]
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `spring-cloud-azure-markdown-appdendix-generator/src/main/java/com/azure/spring/cloud/internal/Main.java`
#### Snippet
```java
			}
			catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("Successfully stored the output Markdown file!");
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `spring-cloud-azure-markdown-appdendix-generator/src/main/java/com/azure/spring/cloud/internal/Main.java`
#### Snippet
```java
				}
				catch (IOException e) {
					e.printStackTrace();
				}
				return false;
```

