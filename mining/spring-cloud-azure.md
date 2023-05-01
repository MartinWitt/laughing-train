# spring-cloud-azure 
 
# Bad smells
I found 2 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UNCHECKED_WARNING | 2 | false |
## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked assignment: 'java.util.HashMap' to 'java.util.Map'
in `spring-cloud-azure-markdown-appdendix-generator/src/main/java/com/azure/spring/cloud/internal/Main.java`
#### Snippet
```java
				for (Resource resource : resources) {
					byte[] bytes = StreamUtils.copyToByteArray(resource.getInputStream());
					Map<String, Object> rootMap = objectMapper.readValue(bytes, HashMap.class);
					List<Map<String, Object>> properties = (List<Map<String, Object>>) rootMap.get("properties");
					propertyCount += properties.size();
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List\>'
in `spring-cloud-azure-markdown-appdendix-generator/src/main/java/com/azure/spring/cloud/internal/Main.java`
#### Snippet
```java
					byte[] bytes = StreamUtils.copyToByteArray(resource.getInputStream());
					Map<String, Object> rootMap = objectMapper.readValue(bytes, HashMap.class);
					List<Map<String, Object>> properties = (List<Map<String, Object>>) rootMap.get("properties");
					propertyCount += properties.size();
					properties.forEach(propertyItem -> {
```

