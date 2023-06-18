# sling-org-apache-sling-servlets-get 
 
# Bad smells
I found 3 bad smells with 3 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryToStringCall | 3 | true |
## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-sling-org-apache-sling-servlets-get-17462799318952911908191648777269697608/src/main/java/org/apache/sling/servlets/get/impl/RedirectServlet.java`
#### Snippet
```java
appendSelectorsExtensionSuffixQuery(request, new StringBuilder(targetPath)).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-sling-org-apache-sling-servlets-get-17462799318952911908191648777269697608/src/test/java/org/apache/sling/servlets/get/impl/JsonRendererServletTest.java`
#### Snippet
```java
response.getOutput().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-sling-org-apache-sling-servlets-get-17462799318952911908191648777269697608/src/main/java/org/apache/sling/servlets/get/impl/helpers/StreamRenderer.java`
#### Snippet
```java
((ExternalizableInputStream) (stream)).getURI().toString()
```

