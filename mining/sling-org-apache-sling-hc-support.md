# sling-org-apache-sling-hc-support 
 
# Bad smells
I found 8 bad smells with 1 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| RuleId[ruleID=DataFlowIssue] | 1 | false |
| RuleId[ruleID=UnnecessarySemicolon] | 1 | false |
| RuleId[ruleID=NestedAssignment] | 1 | false |
| RuleId[ruleID=SimplifyStreamApiCallChains] | 1 | false |
| RuleId[ruleID=InnerClassMayBeStatic] | 1 | true |
| RuleId[ruleID=WhileCanBeForeach] | 1 | false |
| RuleId[ruleID=BoundedWildcard] | 1 | false |
| RuleId[ruleID=UseBulkOperation] | 1 | false |
## RuleId[ruleID=DataFlowIssue]
### RuleId[ruleID=DataFlowIssue]
Method invocation `read` may produce `NullPointerException`
in `src/main/java/org/apache/sling/hc/support/impl/ScriptedHealthCheck.java`
#### Snippet
```java
                    byte[] buffer = new byte[1024];
                    int length;
                    while ((length = is.read(buffer)) != -1) {
                        result.write(buffer, 0, length);
                    }
```

## RuleId[ruleID=UnnecessarySemicolon]
### RuleId[ruleID=UnnecessarySemicolon]
Unnecessary semicolon `;`
in `src/main/java/org/apache/sling/hc/support/impl/ScriptedHealthCheck.java`
#### Snippet
```java
            } else {
                try (InputStream is = dataResource.adaptTo(InputStream.class);
                        ByteArrayOutputStream result = new ByteArrayOutputStream();) {
                    byte[] buffer = new byte[1024];
                    int length;
```

## RuleId[ruleID=NestedAssignment]
### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `src/main/java/org/apache/sling/hc/support/impl/ScriptedHealthCheck.java`
#### Snippet
```java
                    byte[] buffer = new byte[1024];
                    int length;
                    while ((length = is.read(buffer)) != -1) {
                        result.write(buffer, 0, length);
                    }
```

## RuleId[ruleID=SimplifyStreamApiCallChains]
### RuleId[ruleID=SimplifyStreamApiCallChains]
Can be replaced with 'String.join'
in `src/main/java/org/apache/sling/hc/support/impl/ScriptedHealthCheck.java`
#### Snippet
```java
            String content;
            try {
                content = Files.readAllLines(Paths.get(new URI(url))).stream().collect(Collectors.joining("\n"));
                return content;
            }catch(IOException | URISyntaxException e) {
```

## RuleId[ruleID=InnerClassMayBeStatic]
### RuleId[ruleID=InnerClassMayBeStatic]
Inner class `ScriptHelperBinding` may be 'static'
in `src/main/java/org/apache/sling/hc/support/impl/ScriptedHealthCheck.java`
#### Snippet
```java

        // Script Helper for OSGi available as binding 'scriptHelper'
        class ScriptHelperBinding {
            
            private final BundleContext bundleContext;
```

## RuleId[ruleID=WhileCanBeForeach]
### RuleId[ruleID=WhileCanBeForeach]
`while` loop can be replaced with enhanced 'for'
in `src/main/java/org/apache/sling/hc/support/impl/ScriptedHealthCheck.java`
#### Snippet
```java
                if (this.references != null) {
                    final Iterator<ServiceReference<?>> i = this.references.iterator();
                    while (i.hasNext()) {
                        final ServiceReference<?> ref = i.next();
                        this.bundleContext.ungetService(ref);
```

## RuleId[ruleID=BoundedWildcard]
### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ScriptEngineFactory`
in `src/main/java/org/apache/sling/hc/support/impl/ScriptedHealthCheck.java`
#### Snippet
```java
    }

    private String factoriesToString(List<ScriptEngineFactory> engineFactories) {
        List<String> factoryArr = new ArrayList<>();
        for (ScriptEngineFactory ef : engineFactories) {
```

## RuleId[ruleID=UseBulkOperation]
### RuleId[ruleID=UseBulkOperation]
Iteration can be replaced with bulk 'Map.putAll()' call
in `src/main/java/org/apache/sling/hc/support/impl/ScriptedHealthCheck.java`
#### Snippet
```java
            if (additionalBindings != null) {
                for (Map.Entry<String, Object> additionalBinding : additionalBindings.entrySet()) {
                    bindings.put(additionalBinding.getKey(), additionalBinding.getValue());
                }
            }
```

