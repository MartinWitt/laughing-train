# tsunami-security-scanner-plugins 
 
# Bad smells
I found 71 bad smells with 71 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryToStringCall | 71 | true |
## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner-plugins582141554870738772811743019455871050990/community/detectors/adselfservice_plus_cve_2021_40539/src/main/java/com/google/tsunami/plugins/detectors/cves/cve202140539/Cve202140539VulnDetector.java`
#### Snippet
```java
buildTarget(networkService).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner-plugins582141554870738772811743019455871050990/community/detectors/adselfservice_plus_cve_2021_40539/src/main/java/com/google/tsunami/plugins/detectors/cves/cve202140539/Cve202140539VulnDetector.java`
#### Snippet
```java
MediaType.FORM_DATA.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner-plugins582141554870738772811743019455871050990/community/detectors/bigip_cve_2022_1388/src/main/java/com/google/tsunami/plugins/detectors/cves/cve20221388/Cve20221388VulnDetector.java`
#### Snippet
```java
buildTarget(networkService).append(VUL_PATH).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner-plugins582141554870738772811743019455871050990/community/detectors/bigip_cve_2022_1388/src/main/java/com/google/tsunami/plugins/detectors/cves/cve20221388/Cve20221388VulnDetector.java`
#### Snippet
```java
MediaType.JSON_UTF_8.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner-plugins582141554870738772811743019455871050990/community/detectors/gitlab_cve_2021_22205/src/main/java/com/google/tsunami/plugins/detectors/cves/cve202122205/Cve202122205VulnDetector.java`
#### Snippet
```java
buildTarget(networkService).append(USER_SIGN_PATH).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner-plugins582141554870738772811743019455871050990/community/detectors/gitlab_cve_2021_22205/src/main/java/com/google/tsunami/plugins/detectors/cves/cve202122205/Cve202122205VulnDetector.java`
#### Snippet
```java
buildTarget(networkService).append(VUL_PATH).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner-plugins582141554870738772811743019455871050990/community/detectors/influxdb_cve_2019_20933/src/main/java/com/google/tsunami/plugins/detectors/cves/cve201920933/Cve201920933VulnDetector.java`
#### Snippet
```java
buildTarget(networkService).append(VULNERABLE_PATH).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner-plugins582141554870738772811743019455871050990/community/detectors/spring_cloud_gateway_cve_2022_22947/src/main/java/com/google/tsunami/plugins/detectors/cves/cve202222947/Cve202222947VulnDetector.java`
#### Snippet
```java
buildTarget(networkService).append(ROUTES).append(router).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner-plugins582141554870738772811743019455871050990/community/detectors/spring_cloud_gateway_cve_2022_22947/src/main/java/com/google/tsunami/plugins/detectors/cves/cve202222947/Cve202222947VulnDetector.java`
#### Snippet
```java
MediaType.JSON_UTF_8.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner-plugins582141554870738772811743019455871050990/community/detectors/spring_cloud_gateway_cve_2022_22947/src/main/java/com/google/tsunami/plugins/detectors/cves/cve202222947/Cve202222947VulnDetector.java`
#### Snippet
```java
MediaType.JSON_UTF_8.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner-plugins582141554870738772811743019455871050990/community/detectors/spring_cloud_gateway_cve_2022_22947/src/main/java/com/google/tsunami/plugins/detectors/cves/cve202222947/Cve202222947VulnDetector.java`
#### Snippet
```java
MediaType.FORM_DATA.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner-plugins582141554870738772811743019455871050990/community/detectors/spring_cloud_gateway_cve_2022_22947/src/main/java/com/google/tsunami/plugins/detectors/cves/cve202222947/Cve202222947VulnDetector.java`
#### Snippet
```java
buildTarget(networkService).append(REFRESH).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner-plugins582141554870738772811743019455871050990/community/detectors/spring_cloud_gateway_cve_2022_22947/src/main/java/com/google/tsunami/plugins/detectors/cves/cve202222947/Cve202222947VulnDetector.java`
#### Snippet
```java
buildTarget(networkService).append(ROUTES).append(tmpRouter).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner-plugins582141554870738772811743019455871050990/community/detectors/spring_cloud_gateway_cve_2022_22947/src/main/java/com/google/tsunami/plugins/detectors/cves/cve202222947/Cve202222947VulnDetector.java`
#### Snippet
```java
buildTarget(networkService).append(ROUTES).append(tmpRouter).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner-plugins582141554870738772811743019455871050990/community/detectors/spring_cloud_gateway_cve_2022_22947/src/main/java/com/google/tsunami/plugins/detectors/cves/cve202222947/Cve202222947VulnDetector.java`
#### Snippet
```java
buildTarget(networkService).append(REFRESH).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner-plugins582141554870738772811743019455871050990/community/detectors/apache_druid_preauth_rce_cve_2021_25646/src/main/java/com/google/tsunami/plugins/detectors/rce/cve202125646/ApacheDruidPreAuthRCECVE202125646VulnDetector.java`
#### Snippet
```java
MediaType.JSON_UTF_8.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner-plugins582141554870738772811743019455871050990/community/detectors/laravel_cve_2021_3129/src/main/java/com/google/tsunami/plugins/detectors/rce/cve20213129/Cve20213129VulnDetector.java`
#### Snippet
```java
MediaType.JSON_UTF_8.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner-plugins582141554870738772811743019455871050990/community/detectors/laravel_cve_2021_3129/src/main/java/com/google/tsunami/plugins/detectors/rce/cve20213129/Cve20213129VulnDetector.java`
#### Snippet
```java
MediaType.JSON_UTF_8.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner-plugins582141554870738772811743019455871050990/community/detectors/wso2_arbitrary_file_upload_cve_2022_29464/src/main/java/com/google/tsunami/plugins/detectors/rce/cve202229464/Cve202229464VulnDetector.java`
#### Snippet
```java
mBody.contentType().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner-plugins582141554870738772811743019455871050990/google/detectors/rce/cve20196340/src/test/java/com/google/tsunami/plugins/detectors/rce/cve20196340/Cve20196340DetectorTest.java`
#### Snippet
```java
MediaType.PLAIN_TEXT_UTF_8.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner-plugins582141554870738772811743019455871050990/google/detectors/rce/cve20196340/src/test/java/com/google/tsunami/plugins/detectors/rce/cve20196340/Cve20196340DetectorTest.java`
#### Snippet
```java
MediaType.PLAIN_TEXT_UTF_8.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner-plugins582141554870738772811743019455871050990/community/detectors/apache_solr_arbitrary_file_reading/src/test/java/com/google/tsunami/plugins/detectors/solr/CheckTracesTest.java`
#### Snippet
```java
PLAIN_TEXT_UTF_8.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner-plugins582141554870738772811743019455871050990/google/detectors/directorytraversal/generic_path_traversal_detector/src/test/java/com/google/tsunami/plugins/detectors/directorytraversal/genericpathtraversaldetector/PotentialExploitTest.java`
#### Snippet
```java
PotentialExploit.create(MINIMAL_NETWORK_SERVICE, BASIC_GET_REQUEST, "test", PotentialExploit.Priority.LOW).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner-plugins582141554870738772811743019455871050990/google/detectors/directorytraversal/generic_path_traversal_detector/src/test/java/com/google/tsunami/plugins/detectors/directorytraversal/genericpathtraversaldetector/PotentialExploitTest.java`
#### Snippet
```java
PotentialExploit.create(MINIMAL_NETWORK_SERVICE, BASIC_GET_REQUEST, "test", PotentialExploit.Priority.LOW).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner-plugins582141554870738772811743019455871050990/google/detectors/exposedui/apache_nifi_api/src/main/java/com/google/tsunami/plugins/detectors/exposedui/apachenifi/apivuln/ApacheNiFiApiExposedUiDetector.java`
#### Snippet
```java
response.bodyBytes().get().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner-plugins582141554870738772811743019455871050990/google/fingerprinters/web/src/test/java/com/google/tsunami/plugins/fingerprinters/web/CommonTestData.java`
#### Snippet
```java
new HttpUrl.Builder().scheme("https").host("localhost").encodedPath(path).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner-plugins582141554870738772811743019455871050990/google/fingerprinters/web/src/main/java/com/google/tsunami/plugins/fingerprinters/web/common/FingerprintUtils.java`
#### Snippet
```java
hasher.putInt(crawlResult.getResponseCode()).putBytes(crawlResult.getContentTypeBytes().toByteArray()).putBytes(crawlResult.getContent().toByteArray()).hash().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner-plugins582141554870738772811743019455871050990/google/fingerprinters/web/src/main/java/com/google/tsunami/plugins/fingerprinters/web/common/FingerprintUtils.java`
#### Snippet
```java
Hashing.murmur3_128().hashBytes(content).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner-plugins582141554870738772811743019455871050990/google/fingerprinters/web/src/test/java/com/google/tsunami/plugins/fingerprinters/web/common/CrawlUtilsTest.java`
#### Snippet
```java
HTML_UTF_8.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner-plugins582141554870738772811743019455871050990/google/fingerprinters/web/src/test/java/com/google/tsunami/plugins/fingerprinters/web/common/CrawlUtilsTest.java`
#### Snippet
```java
HTML_UTF_8.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner-plugins582141554870738772811743019455871050990/google/fingerprinters/web/src/test/java/com/google/tsunami/plugins/fingerprinters/web/common/CrawlUtilsTest.java`
#### Snippet
```java
HTML_UTF_8.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner-plugins582141554870738772811743019455871050990/google/fingerprinters/web/src/test/java/com/google/tsunami/plugins/fingerprinters/web/common/CrawlUtilsTest.java`
#### Snippet
```java
HTML_UTF_8.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner-plugins582141554870738772811743019455871050990/google/fingerprinters/web/src/test/java/com/google/tsunami/plugins/fingerprinters/web/common/CrawlUtilsTest.java`
#### Snippet
```java
HTML_UTF_8.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner-plugins582141554870738772811743019455871050990/google/fingerprinters/web/src/test/java/com/google/tsunami/plugins/fingerprinters/web/common/CrawlUtilsTest.java`
#### Snippet
```java
HTML_UTF_8.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner-plugins582141554870738772811743019455871050990/google/fingerprinters/web/src/test/java/com/google/tsunami/plugins/fingerprinters/web/common/CrawlUtilsTest.java`
#### Snippet
```java
HTML_UTF_8.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner-plugins582141554870738772811743019455871050990/google/fingerprinters/web/src/test/java/com/google/tsunami/plugins/fingerprinters/web/common/CrawlUtilsTest.java`
#### Snippet
```java
HTML_UTF_8.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner-plugins582141554870738772811743019455871050990/google/fingerprinters/web/src/test/java/com/google/tsunami/plugins/fingerprinters/web/common/FingerprintUtilsTest.java`
#### Snippet
```java
PLAIN_TEXT_UTF_8.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner-plugins582141554870738772811743019455871050990/google/fingerprinters/web/src/test/java/com/google/tsunami/plugins/fingerprinters/web/common/FingerprintUtilsTest.java`
#### Snippet
```java
HTML_UTF_8.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner-plugins582141554870738772811743019455871050990/google/fingerprinters/web/src/main/java/com/google/tsunami/plugins/fingerprinters/web/crawl/CrawlTargetUtils.java`
#### Snippet
```java
url.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner-plugins582141554870738772811743019455871050990/google/fingerprinters/web/src/main/java/com/google/tsunami/plugins/fingerprinters/web/crawl/CrawlTargetUtils.java`
#### Snippet
```java
HttpMethod.GET.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner-plugins582141554870738772811743019455871050990/google/fingerprinters/web/src/main/java/com/google/tsunami/plugins/fingerprinters/web/crawl/CrawlTargetUtils.java`
#### Snippet
```java
method.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner-plugins582141554870738772811743019455871050990/google/fingerprinters/web/src/main/java/com/google/tsunami/plugins/fingerprinters/web/crawl/CrawlTargetUtils.java`
#### Snippet
```java
httpUrl.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner-plugins582141554870738772811743019455871050990/google/fingerprinters/web/src/main/java/com/google/tsunami/plugins/fingerprinters/web/crawl/CrawlTargetUtils.java`
#### Snippet
```java
method.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner-plugins582141554870738772811743019455871050990/google/fingerprinters/web/src/main/java/com/google/tsunami/plugins/fingerprinters/web/crawl/CrawlTargetUtils.java`
#### Snippet
```java
newUrlBuilder.build().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner-plugins582141554870738772811743019455871050990/google/fingerprinters/web/src/main/java/com/google/tsunami/plugins/fingerprinters/web/crawl/CrawlTargetUtils.java`
#### Snippet
```java
method.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner-plugins582141554870738772811743019455871050990/google/fingerprinters/web/src/main/java/com/google/tsunami/plugins/fingerprinters/web/crawl/CrawlTargetUtils.java`
#### Snippet
```java
httpUrl.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner-plugins582141554870738772811743019455871050990/google/fingerprinters/web/src/main/java/com/google/tsunami/plugins/fingerprinters/web/crawl/CrawlTargetUtils.java`
#### Snippet
```java
HttpMethod.POST.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner-plugins582141554870738772811743019455871050990/google/fingerprinters/web/src/main/java/com/google/tsunami/plugins/fingerprinters/web/crawl/ScopeUtils.java`
#### Snippet
```java
scopeDomainBuilder.append(":").append(url.port()).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner-plugins582141554870738772811743019455871050990/google/fingerprinters/web/src/main/java/com/google/tsunami/plugins/fingerprinters/web/crawl/SimpleCrawler.java`
#### Snippet
```java
HttpMethod.GET.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner-plugins582141554870738772811743019455871050990/google/fingerprinters/web/src/test/java/com/google/tsunami/plugins/fingerprinters/web/crawl/CrawlTargetUtilsTest.java`
#### Snippet
```java
HttpMethod.GET.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner-plugins582141554870738772811743019455871050990/google/fingerprinters/web/src/test/java/com/google/tsunami/plugins/fingerprinters/web/crawl/CrawlTargetUtilsTest.java`
#### Snippet
```java
HttpMethod.GET.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner-plugins582141554870738772811743019455871050990/google/fingerprinters/web/src/test/java/com/google/tsunami/plugins/fingerprinters/web/crawl/CrawlTargetUtilsTest.java`
#### Snippet
```java
HttpMethod.GET.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner-plugins582141554870738772811743019455871050990/google/fingerprinters/web/src/test/java/com/google/tsunami/plugins/fingerprinters/web/crawl/CrawlTargetUtilsTest.java`
#### Snippet
```java
HttpMethod.GET.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner-plugins582141554870738772811743019455871050990/google/fingerprinters/web/src/test/java/com/google/tsunami/plugins/fingerprinters/web/crawl/CrawlTargetUtilsTest.java`
#### Snippet
```java
HttpMethod.GET.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner-plugins582141554870738772811743019455871050990/google/fingerprinters/web/src/test/java/com/google/tsunami/plugins/fingerprinters/web/crawl/CrawlTargetUtilsTest.java`
#### Snippet
```java
HttpMethod.GET.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner-plugins582141554870738772811743019455871050990/google/fingerprinters/web/src/test/java/com/google/tsunami/plugins/fingerprinters/web/crawl/CrawlTargetUtilsTest.java`
#### Snippet
```java
HttpMethod.GET.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner-plugins582141554870738772811743019455871050990/google/fingerprinters/web/src/test/java/com/google/tsunami/plugins/fingerprinters/web/crawl/CrawlTargetUtilsTest.java`
#### Snippet
```java
HttpMethod.GET.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner-plugins582141554870738772811743019455871050990/google/fingerprinters/web/src/test/java/com/google/tsunami/plugins/fingerprinters/web/crawl/CrawlTargetUtilsTest.java`
#### Snippet
```java
HttpMethod.GET.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner-plugins582141554870738772811743019455871050990/google/fingerprinters/web/src/test/java/com/google/tsunami/plugins/fingerprinters/web/crawl/SimpleCrawlActionTest.java`
#### Snippet
```java
mockWebServer.url("/path").toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner-plugins582141554870738772811743019455871050990/google/fingerprinters/web/src/test/java/com/google/tsunami/plugins/fingerprinters/web/crawl/SimpleCrawlerTest.java`
#### Snippet
```java
mockWebServer.url(path).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner-plugins582141554870738772811743019455871050990/google/fingerprinters/web/src/test/java/com/google/tsunami/plugins/fingerprinters/web/crawl/TestDataBuilder.java`
#### Snippet
```java
mockWebServer.url("").toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner-plugins582141554870738772811743019455871050990/google/fingerprinters/web/src/test/java/com/google/tsunami/plugins/fingerprinters/web/crawl/TestDataBuilder.java`
#### Snippet
```java
HttpMethod.GET.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner-plugins582141554870738772811743019455871050990/google/fingerprinters/web/src/test/java/com/google/tsunami/plugins/fingerprinters/web/crawl/TestDataBuilder.java`
#### Snippet
```java
mockWebServer.url(seedUrl).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner-plugins582141554870738772811743019455871050990/google/fingerprinters/web/src/test/java/com/google/tsunami/plugins/fingerprinters/web/crawl/TestDataBuilder.java`
#### Snippet
```java
mockWebServer.url(url).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner-plugins582141554870738772811743019455871050990/google/fingerprinters/web/src/test/java/com/google/tsunami/plugins/fingerprinters/web/crawl/TestDataBuilder.java`
#### Snippet
```java
HttpMethod.GET.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner-plugins582141554870738772811743019455871050990/google/fingerprinters/web/src/test/java/com/google/tsunami/plugins/fingerprinters/web/crawl/TestDataBuilder.java`
#### Snippet
```java
mockWebServer.url(url).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner-plugins582141554870738772811743019455871050990/google/fingerprinters/web/src/test/java/com/google/tsunami/plugins/fingerprinters/web/crawl/TestDataBuilder.java`
#### Snippet
```java
HttpMethod.GET.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner-plugins582141554870738772811743019455871050990/google/fingerprinters/web/src/main/java/com/google/tsunami/plugins/fingerprinters/web/detection/VersionDetector.java`
#### Snippet
```java
GET.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner-plugins582141554870738772811743019455871050990/google/fingerprinters/web/src/test/java/com/google/tsunami/plugins/fingerprinters/web/detection/VersionDetectorTest.java`
#### Snippet
```java
mockWebServer.url(oldPath).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner-plugins582141554870738772811743019455871050990/google/fingerprinters/web/src/main/java/com/google/tsunami/plugins/fingerprinters/web/tools/FingerprintUpdater.java`
#### Snippet
```java
urlBuilder.build().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tsunami-security-scanner-plugins582141554870738772811743019455871050990/google/fingerprinters/web/src/main/java/com/google/tsunami/plugins/fingerprinters/web/tools/FingerprintUpdater.java`
#### Snippet
```java
GET.toString()
```

