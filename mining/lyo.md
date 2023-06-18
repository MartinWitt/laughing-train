# lyo 
 
# Bad smells
I found 35 bad smells with 35 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryToStringCall | 35 | true |
## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lyo165350994572985825411390070273127528784/client/oslc-client/src/main/java/org/eclipse/lyo/client/RootServicesHelper.java`
#### Snippet
```java
UriBuilder.fromUri(this.baseUrl).path("rootservices").build().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lyo165350994572985825411390070273127528784/client/oslc-client/src/main/java/org/eclipse/lyo/client/RootServicesHelper.java`
#### Snippet
```java
stmt.getObject().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lyo165350994572985825411390070273127528784/client/oslc-client/src/main/java/org/eclipse/lyo/client/RootServicesHelper.java`
#### Snippet
```java
UriBuilder.fromUri(consumerApprovalUrl).queryParam("key", consumerKey).build().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lyo165350994572985825411390070273127528784/client/oslc-client/src/main/java/org/eclipse/lyo/client/query/OslcQuery.java`
#### Snippet
```java
queryResource.getUriBuilder().build(new Object[0]).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lyo165350994572985825411390070273127528784/core/lyo-core-settings/src/main/java/org/eclipse/lyo/oslc4j/core/OSLC4JUtils.java`
#### Snippet
```java
UriBuilder.fromPath(contextPath).scheme(scheme).host(hostName).port(serverPort).build().normalize().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lyo165350994572985825411390070273127528784/core/oslc4j-json4j-provider/src/test/java/org/eclipse/lyo/oslc4j/provider/json4j/ProviderCollectionResource.java`
#### Snippet
```java
uriBuilder.build().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lyo165350994572985825411390070273127528784/core/oslc4j-json4j-provider/src/test/java/org/eclipse/lyo/oslc4j/provider/json4j/ProviderCollectionResource.java`
#### Snippet
```java
uriBuilder.build().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lyo165350994572985825411390070273127528784/core/oslc4j-json4j-provider/src/test/java/org/eclipse/lyo/oslc4j/provider/json4j/ProviderCollectionResource.java`
#### Snippet
```java
uriBuilder.build().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lyo165350994572985825411390070273127528784/core/oslc4j-json4j-provider/src/test/java/org/eclipse/lyo/oslc4j/provider/json4j/ProviderCollectionResource.java`
#### Snippet
```java
uriBuilder.build().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lyo165350994572985825411390070273127528784/core/oslc4j-json4j-provider/src/test/java/org/eclipse/lyo/oslc4j/provider/json4j/ProviderCollectionResource.java`
#### Snippet
```java
uriBuilder.build().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lyo165350994572985825411390070273127528784/core/oslc4j-json4j-provider/src/test/java/org/eclipse/lyo/oslc4j/provider/json4j/ProviderCollectionResource.java`
#### Snippet
```java
uriBuilder.build().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lyo165350994572985825411390070273127528784/core/oslc4j-json4j-provider/src/test/java/org/eclipse/lyo/oslc4j/provider/json4j/ProviderCollectionResource.java`
#### Snippet
```java
uriBuilder.build().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lyo165350994572985825411390070273127528784/core/oslc4j-json4j-provider/src/test/java/org/eclipse/lyo/oslc4j/provider/json4j/ProviderCollectionResource.java`
#### Snippet
```java
uriBuilder.build().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lyo165350994572985825411390070273127528784/core/oslc4j-json4j-provider/src/test/java/org/eclipse/lyo/oslc4j/provider/json4j/ProviderCollectionResource.java`
#### Snippet
```java
uriBuilder.build().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lyo165350994572985825411390070273127528784/core/oslc4j-json4j-provider/src/test/java/org/eclipse/lyo/oslc4j/provider/json4j/ProviderCollectionResource.java`
#### Snippet
```java
uriBuilder.build().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lyo165350994572985825411390070273127528784/core/oslc4j-json4j-provider/src/test/java/org/eclipse/lyo/oslc4j/provider/json4j/test/JsonOslcNameTest.java`
#### Snippet
```java
obj.values().iterator().next().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lyo165350994572985825411390070273127528784/core/oslc4j-core/src/main/java/org/eclipse/lyo/oslc4j/provider/jena/JenaModelHelper.java`
#### Snippet
```java
resource.getId().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lyo165350994572985825411390070273127528784/core/oslc4j-jena-provider/src/main/java/org/eclipse/lyo/oslc4j/provider/jena/RdfXmlAbbreviatedWriter.java`
#### Snippet
```java
stmt.getSubject().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lyo165350994572985825411390070273127528784/core/oslc4j-jena-provider/src/main/java/org/eclipse/lyo/oslc4j/provider/jena/RdfXmlAbbreviatedWriter.java`
#### Snippet
```java
stmt.getPredicate().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lyo165350994572985825411390070273127528784/core/oslc4j-jena-provider/src/main/java/org/eclipse/lyo/oslc4j/provider/jena/RdfXmlAbbreviatedWriter.java`
#### Snippet
```java
stmt.getObject().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lyo165350994572985825411390070273127528784/core/oslc4j-jena-provider/src/test/java/org/eclipse/lyo/oslc4j/provider/jena/ProviderCollectionResource.java`
#### Snippet
```java
uriBuilder.build().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lyo165350994572985825411390070273127528784/core/oslc4j-jena-provider/src/test/java/org/eclipse/lyo/oslc4j/provider/jena/ProviderCollectionResource.java`
#### Snippet
```java
uriBuilder.build().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lyo165350994572985825411390070273127528784/core/oslc4j-jena-provider/src/test/java/org/eclipse/lyo/oslc4j/provider/jena/ProviderCollectionResource.java`
#### Snippet
```java
uriBuilder.build().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lyo165350994572985825411390070273127528784/core/oslc4j-jena-provider/src/test/java/org/eclipse/lyo/oslc4j/provider/jena/ProviderCollectionResource.java`
#### Snippet
```java
uriBuilder.build().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lyo165350994572985825411390070273127528784/core/oslc4j-jena-provider/src/test/java/org/eclipse/lyo/oslc4j/provider/jena/ProviderCollectionResource.java`
#### Snippet
```java
uriBuilder.build().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lyo165350994572985825411390070273127528784/core/oslc4j-jena-provider/src/test/java/org/eclipse/lyo/oslc4j/provider/jena/ProviderCollectionResource.java`
#### Snippet
```java
uriBuilder.build().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lyo165350994572985825411390070273127528784/core/oslc4j-jena-provider/src/test/java/org/eclipse/lyo/oslc4j/provider/jena/ProviderCollectionResource.java`
#### Snippet
```java
uriBuilder.build().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lyo165350994572985825411390070273127528784/core/oslc4j-jena-provider/src/test/java/org/eclipse/lyo/oslc4j/provider/jena/ProviderCollectionResource.java`
#### Snippet
```java
uriBuilder.build().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lyo165350994572985825411390070273127528784/core/oslc4j-jena-provider/src/test/java/org/eclipse/lyo/oslc4j/provider/jena/ProviderCollectionResource.java`
#### Snippet
```java
uriBuilder.build().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lyo165350994572985825411390070273127528784/core/oslc4j-jena-provider/src/test/java/org/eclipse/lyo/oslc4j/provider/jena/ProviderCollectionResource.java`
#### Snippet
```java
uriBuilder.build().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lyo165350994572985825411390070273127528784/trs/server/src/test/java/org/eclipse/lyo/oslc4j/trs/server/service/TRSServiceDITest.java`
#### Snippet
```java
getBaseUri().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lyo165350994572985825411390070273127528784/trs/server/src/test/java/org/eclipse/lyo/oslc4j/trs/server/service/TRSServiceTest.java`
#### Snippet
```java
getBaseUri().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lyo165350994572985825411390070273127528784/core/oslc-query/src/main/java/org/eclipse/lyo/core/query/impl/SimpleTermInvocationHandler.java`
#### Snippet
```java
tree.getChild(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lyo165350994572985825411390070273127528784/server/oauth-core/src/main/java/org/eclipse/lyo/server/oauth/core/OAuthRequest.java`
#### Snippet
```java
UriBuilder.fromUri(OAuthConfiguration.getInstance().getServletUri()).path(request.getPathInfo()).build().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-lyo165350994572985825411390070273127528784/server/oauth-webapp/src/main/java/org/eclipse/lyo/server/oauth/webapp/services/OAuthService.java`
#### Snippet
```java
uriBuilder.build().toString()
```

