# fhir-gateway 
 
# Bad smells
I found 4 bad smells with 4 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryToStringCall | 4 | true |
## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-fhir-gateway45943776927088691204222308448772961178/server/src/main/java/com/google/fhir/gateway/BearerAuthorizationInterceptor.java`
#### Snippet
```java
response.getStatusLine().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-fhir-gateway45943776927088691204222308448772961178/server/src/main/java/com/google/fhir/gateway/HttpFhirClient.java`
#### Snippet
```java
response.getStatusLine().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-fhir-gateway45943776927088691204222308448772961178/server/src/main/java/com/google/fhir/gateway/HttpUtil.java`
#### Snippet
```java
response.getStatusLine().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-fhir-gateway45943776927088691204222308448772961178/server/src/main/java/com/google/fhir/gateway/HttpUtil.java`
#### Snippet
```java
response.getStatusLine().toString()
```

