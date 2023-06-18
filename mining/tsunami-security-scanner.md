# tsunami-security-scanner 
 
# Bad smells
I found 47 bad smells with 47 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryToStringCall | 47 | true |
## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner149338073181820005213033287070439305837/common/src/main/java/com/google/tsunami/common/data/NetworkEndpointUtils.java`
#### Snippet
```java
toHostAndPort(networkEndpoint).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner149338073181820005213033287070439305837/common/src/main/java/com/google/tsunami/common/io/archiving/Archiver.java`
#### Snippet
```java
checkNotNull(data).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner149338073181820005213033287070439305837/common/src/test/java/com/google/tsunami/common/net/http/OkHttpHttpClientTest.java`
#### Snippet
```java
MediaType.PLAIN_TEXT_UTF_8.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner149338073181820005213033287070439305837/common/src/test/java/com/google/tsunami/common/net/http/OkHttpHttpClientTest.java`
#### Snippet
```java
MediaType.PLAIN_TEXT_UTF_8.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner149338073181820005213033287070439305837/common/src/test/java/com/google/tsunami/common/net/http/OkHttpHttpClientTest.java`
#### Snippet
```java
MediaType.PLAIN_TEXT_UTF_8.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner149338073181820005213033287070439305837/common/src/test/java/com/google/tsunami/common/net/http/OkHttpHttpClientTest.java`
#### Snippet
```java
MediaType.PLAIN_TEXT_UTF_8.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner149338073181820005213033287070439305837/common/src/test/java/com/google/tsunami/common/net/http/OkHttpHttpClientTest.java`
#### Snippet
```java
mockWebServer.url("/test/get").toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner149338073181820005213033287070439305837/common/src/test/java/com/google/tsunami/common/net/http/OkHttpHttpClientTest.java`
#### Snippet
```java
MediaType.PLAIN_TEXT_UTF_8.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner149338073181820005213033287070439305837/common/src/test/java/com/google/tsunami/common/net/http/OkHttpHttpClientTest.java`
#### Snippet
```java
MediaType.PLAIN_TEXT_UTF_8.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner149338073181820005213033287070439305837/common/src/test/java/com/google/tsunami/common/net/http/OkHttpHttpClientTest.java`
#### Snippet
```java
mockWebServer.url("/test/get").toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner149338073181820005213033287070439305837/common/src/test/java/com/google/tsunami/common/net/http/OkHttpHttpClientTest.java`
#### Snippet
```java
MediaType.PLAIN_TEXT_UTF_8.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner149338073181820005213033287070439305837/common/src/test/java/com/google/tsunami/common/net/http/OkHttpHttpClientTest.java`
#### Snippet
```java
MediaType.PLAIN_TEXT_UTF_8.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner149338073181820005213033287070439305837/common/src/test/java/com/google/tsunami/common/net/http/OkHttpHttpClientTest.java`
#### Snippet
```java
mockWebServer.url("/test/head").toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner149338073181820005213033287070439305837/common/src/test/java/com/google/tsunami/common/net/http/OkHttpHttpClientTest.java`
#### Snippet
```java
MediaType.PLAIN_TEXT_UTF_8.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner149338073181820005213033287070439305837/common/src/test/java/com/google/tsunami/common/net/http/OkHttpHttpClientTest.java`
#### Snippet
```java
MediaType.PLAIN_TEXT_UTF_8.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner149338073181820005213033287070439305837/common/src/test/java/com/google/tsunami/common/net/http/OkHttpHttpClientTest.java`
#### Snippet
```java
mockWebServer.url("/test/head").toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner149338073181820005213033287070439305837/common/src/test/java/com/google/tsunami/common/net/http/OkHttpHttpClientTest.java`
#### Snippet
```java
MediaType.PLAIN_TEXT_UTF_8.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner149338073181820005213033287070439305837/common/src/test/java/com/google/tsunami/common/net/http/OkHttpHttpClientTest.java`
#### Snippet
```java
MediaType.JSON_UTF_8.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner149338073181820005213033287070439305837/common/src/test/java/com/google/tsunami/common/net/http/OkHttpHttpClientTest.java`
#### Snippet
```java
mockWebServer.url("/test/post").toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner149338073181820005213033287070439305837/common/src/test/java/com/google/tsunami/common/net/http/OkHttpHttpClientTest.java`
#### Snippet
```java
MediaType.JSON_UTF_8.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner149338073181820005213033287070439305837/common/src/test/java/com/google/tsunami/common/net/http/OkHttpHttpClientTest.java`
#### Snippet
```java
MediaType.JSON_UTF_8.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner149338073181820005213033287070439305837/common/src/test/java/com/google/tsunami/common/net/http/OkHttpHttpClientTest.java`
#### Snippet
```java
MediaType.JSON_UTF_8.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner149338073181820005213033287070439305837/common/src/test/java/com/google/tsunami/common/net/http/OkHttpHttpClientTest.java`
#### Snippet
```java
mockWebServer.url("/test/post").toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner149338073181820005213033287070439305837/common/src/test/java/com/google/tsunami/common/net/http/OkHttpHttpClientTest.java`
#### Snippet
```java
MediaType.JSON_UTF_8.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner149338073181820005213033287070439305837/common/src/test/java/com/google/tsunami/common/net/http/OkHttpHttpClientTest.java`
#### Snippet
```java
MediaType.JSON_UTF_8.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner149338073181820005213033287070439305837/common/src/test/java/com/google/tsunami/common/net/http/OkHttpHttpClientTest.java`
#### Snippet
```java
MediaType.JSON_UTF_8.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner149338073181820005213033287070439305837/common/src/test/java/com/google/tsunami/common/net/http/OkHttpHttpClientTest.java`
#### Snippet
```java
mockWebServer.url("/test/post").toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner149338073181820005213033287070439305837/common/src/test/java/com/google/tsunami/common/net/http/OkHttpHttpClientTest.java`
#### Snippet
```java
MediaType.JSON_UTF_8.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner149338073181820005213033287070439305837/common/src/test/java/com/google/tsunami/common/net/http/OkHttpHttpClientTest.java`
#### Snippet
```java
MediaType.JSON_UTF_8.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner149338073181820005213033287070439305837/common/src/test/java/com/google/tsunami/common/net/http/OkHttpHttpClientTest.java`
#### Snippet
```java
mockWebServer.url("/test/post").toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner149338073181820005213033287070439305837/common/src/test/java/com/google/tsunami/common/net/http/OkHttpHttpClientTest.java`
#### Snippet
```java
MediaType.JSON_UTF_8.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner149338073181820005213033287070439305837/common/src/test/java/com/google/tsunami/common/net/http/OkHttpHttpClientTest.java`
#### Snippet
```java
mockWebServer.url(RedirectDispatcher.REDIRECT_PATH).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner149338073181820005213033287070439305837/common/src/test/java/com/google/tsunami/common/net/http/OkHttpHttpClientTest.java`
#### Snippet
```java
mockWebServer.url(RedirectDispatcher.REDIRECT_DESTINATION_PATH).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner149338073181820005213033287070439305837/common/src/test/java/com/google/tsunami/common/net/http/OkHttpHttpClientTest.java`
#### Snippet
```java
mockWebServer.url(RedirectDispatcher.REDIRECT_DESTINATION_PATH).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner149338073181820005213033287070439305837/common/src/test/java/com/google/tsunami/common/net/http/OkHttpHttpClientTest.java`
#### Snippet
```java
mockWebServer.url(RedirectDispatcher.REDIRECT_PATH).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner149338073181820005213033287070439305837/common/src/test/java/com/google/tsunami/common/net/http/OkHttpHttpClientTest.java`
#### Snippet
```java
mockWebServer.url(RedirectDispatcher.REDIRECT_PATH).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner149338073181820005213033287070439305837/common/src/test/java/com/google/tsunami/common/net/http/OkHttpHttpClientTest.java`
#### Snippet
```java
mockWebServer.url(RedirectDispatcher.REDIRECT_PATH).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner149338073181820005213033287070439305837/common/src/test/java/com/google/tsunami/common/net/http/OkHttpHttpClientTest.java`
#### Snippet
```java
mockWebServer.url(UserAgentTestDispatcher.USERAGENT_TEST_PATH).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner149338073181820005213033287070439305837/common/src/test/java/com/google/tsunami/common/net/http/OkHttpHttpClientTest.java`
#### Snippet
```java
mockWebServer.url(UserAgentTestDispatcher.USERAGENT_TEST_PATH).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner149338073181820005213033287070439305837/common/src/test/java/com/google/tsunami/common/net/http/OkHttpHttpClientTest.java`
#### Snippet
```java
MediaType.PLAIN_TEXT_UTF_8.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner149338073181820005213033287070439305837/main/src/test/java/com/google/tsunami/main/cli/ScanResultsArchiverTest.java`
#### Snippet
```java
fakeGoogleCloudStorageArchivers.getStoredCharSequence(mockStorage, "gs://test/object/result.json").toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner149338073181820005213033287070439305837/plugin/src/test/java/com/google/tsunami/plugin/TcsClientTest.java`
#### Snippet
```java
mockWebServer.url("/").toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner149338073181820005213033287070439305837/plugin/src/test/java/com/google/tsunami/plugin/TcsClientTest.java`
#### Snippet
```java
mockWebServer.url("/").toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner149338073181820005213033287070439305837/plugin/src/test/java/com/google/tsunami/plugin/TcsClientTest.java`
#### Snippet
```java
mockWebServer.url("/").toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner149338073181820005213033287070439305837/plugin/src/test/java/com/google/tsunami/plugin/TcsClientTest.java`
#### Snippet
```java
mockWebServer.url("/").toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner149338073181820005213033287070439305837/plugin/src/main/java/com/google/tsunami/plugin/payload/testing/FakePayloadGeneratorModule.java`
#### Snippet
```java
c.url("/").toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner149338073181820005213033287070439305837/workflow/src/main/java/com/google/tsunami/workflow/ExecutionTracer.java`
#### Snippet
```java
// Vuln detection phase.
// Service fingerprinting phase.
// Port scanning phase.
new StringBuilder("Tsunami scanning workflow traces:\n").append(String.format("  Port scanning phase (%s) with %d plugin(s):\n    ", portScanningTimer, selectedPortScanners.size())).append(PLUGIN_INFO_JOINER.join(selectedPortScanners.stream().map(ExecutionTracer::buildPluginInfoMessage).collect(toImmutableList()))).append(String.format("\n  Service fingerprinting phase (%s) with %d plugin(s):\n    ", serviceFingerprintingTimer, selectedServiceFingerprinters.size())).append(PLUGIN_INFO_JOINER.join(selectedServiceFingerprinters.stream().map(ExecutionTracer::buildPluginInfoMessage).collect(toImmutableList()))).append(String.format("\n  Vuln detection phase (%s) with %d plugin(s):\n    ", vulnerabilityDetectingTimer, selectedVulnDetectors.size())).append(PLUGIN_INFO_JOINER.join(selectedVulnDetectors.stream().map(ExecutionTracer::buildPluginInfoMessage).collect(toImmutableList()))).append(String.format("\n  # of detected vulnerability: %d.", scanResults.getScanFindingsCount())).toString()
```

