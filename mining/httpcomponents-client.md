# httpcomponents-client 
 
# Bad smells
I found 3 bad smells with 3 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryToStringCall | 3 | true |
## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-httpcomponents-client-52997646569015106049641544603706097670/httpclient5-cache/src/test/java/org/apache/hc/client5/http/impl/cache/HttpTestUtils.java`
#### Snippet
```java
Method.GET.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-httpcomponents-client-52997646569015106049641544603706097670/httpclient5-cache/src/test/java/org/apache/hc/client5/http/impl/cache/HttpTestUtils.java`
#### Snippet
```java
Method.HEAD.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-httpcomponents-client-52997646569015106049641544603706097670/httpclient5-testing/src/test/java/org/apache/hc/client5/testing/async/AbstractHttpAsyncRedirectsTest.java`
#### Snippet
```java
location.toString()
```

