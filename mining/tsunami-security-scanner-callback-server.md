# tsunami-security-scanner-callback-server 
 
# Bad smells
I found 32 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnstableApiUsage | 13 | false |
| AbstractClassNeverImplemented | 9 | false |
| AssignmentToMethodParameter | 4 | false |
| InstanceofCatchParameter | 2 | false |
| ReplaceAssignmentWithOperatorAssignment | 2 | false |
| UnstableTypeUsedInSignature | 2 | false |
## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `questionDomain`
in `server/src/main/java/com/google/tsunami/callbackserver/server/recording/DnsRecordingHandler.java`
#### Snippet
```java
    // Best-effort normalization of domain names.
    try {
      questionDomain = InternetDomainName.from(questionDomain).toString();
    } catch (IllegalArgumentException e) {
      // pass
```

### AssignmentToMethodParameter
Assignment to method parameter `authoritativeDnsDomain`
in `server/src/main/java/com/google/tsunami/callbackserver/server/recording/DnsRecordingHandler.java`
#### Snippet
```java
    }
    try {
      authoritativeDnsDomain = InternetDomainName.from(authoritativeDnsDomain).toString();
    } catch (IllegalArgumentException e) {
      // pass
```

### AssignmentToMethodParameter
Assignment to method parameter `questionDomain`
in `server/src/main/java/com/google/tsunami/callbackserver/server/recording/DnsRecordingHandler.java`
#### Snippet
```java
    // Normalize to FQDN since configuration may specify without trailing dot.
    if (!questionDomain.endsWith(".")) {
      questionDomain = questionDomain + ".";
    }
    if (!authoritativeDnsDomain.endsWith(".")) {
```

### AssignmentToMethodParameter
Assignment to method parameter `authoritativeDnsDomain`
in `server/src/main/java/com/google/tsunami/callbackserver/server/recording/DnsRecordingHandler.java`
#### Snippet
```java
    }
    if (!authoritativeDnsDomain.endsWith(".")) {
      authoritativeDnsDomain = authoritativeDnsDomain + ".";
    }

```

## RuleId[id=InstanceofCatchParameter]
### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `server/src/main/java/com/google/tsunami/callbackserver/server/common/HttpHandler.java`
#### Snippet
```java
    } catch (Exception e) {
      logger.atSevere().withCause(e).log("Unable to handle request %s.", request);
      if (e instanceof IllegalArgumentException) {
        replyBadRequest(ctx);
      } else if (e instanceof NotFoundException) {
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `server/src/main/java/com/google/tsunami/callbackserver/server/common/HttpHandler.java`
#### Snippet
```java
      if (e instanceof IllegalArgumentException) {
        replyBadRequest(ctx);
      } else if (e instanceof NotFoundException) {
        replyNotFound(ctx);
      } else {
```

## RuleId[id=ReplaceAssignmentWithOperatorAssignment]
### ReplaceAssignmentWithOperatorAssignment
`questionDomain = questionDomain + "."` could be simplified to 'questionDomain += "."'
in `server/src/main/java/com/google/tsunami/callbackserver/server/recording/DnsRecordingHandler.java`
#### Snippet
```java
    // Normalize to FQDN since configuration may specify without trailing dot.
    if (!questionDomain.endsWith(".")) {
      questionDomain = questionDomain + ".";
    }
    if (!authoritativeDnsDomain.endsWith(".")) {
```

### ReplaceAssignmentWithOperatorAssignment
`authoritativeDnsDomain = authoritativeDnsDomain + "."` could be simplified to 'authoritativeDnsDomain += "."'
in `server/src/main/java/com/google/tsunami/callbackserver/server/recording/DnsRecordingHandler.java`
#### Snippet
```java
    }
    if (!authoritativeDnsDomain.endsWith(".")) {
      authoritativeDnsDomain = authoritativeDnsDomain + ".";
    }

```

## RuleId[id=UnstableTypeUsedInSignature]
### UnstableTypeUsedInSignature
Method must be marked with '@com.google.common.annotations.Beta' annotation because its signature references unstable type 'com.google.common.net.HostAndPort'
in `common/src/main/java/com/google/tsunami/callbackserver/common/CbidProcessor.java`
#### Snippet
```java
   * @return an interaction hostname with the given CBID.
   */
  public static String addCbidToSubdomain(String cbid, HostAndPort hostAndPort) {
    return String.format("%s.%s", cbid, hostAndPort);
  }
```

### UnstableTypeUsedInSignature
Method must be marked with '@com.google.common.annotations.Beta' annotation because its signature references unstable type 'com.google.common.net.HostAndPort'
in `common/src/main/java/com/google/tsunami/callbackserver/common/CbidProcessor.java`
#### Snippet
```java
   * @return an HTTP interaction URL with the given CBID.
   */
  public static String addCbidToUrl(String cbid, HostAndPort hostAndPort) {
    return String.format("http://%s/%s", hostAndPort, cbid);
  }
```

## RuleId[id=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `InMemoryStorageConfig` has no concrete subclass
in `common/src/main/java/com/google/tsunami/callbackserver/common/config/InMemoryStorageConfig.java`
#### Snippet
```java
/** Data model for the in-memory storage configuration. */
@AutoValue
public abstract class InMemoryStorageConfig {
  public abstract Duration interactionTtl();
  public abstract Duration interactionCleanupInterval();
```

### AbstractClassNeverImplemented
Abstract class `PollingServerConfig` has no concrete subclass
in `common/src/main/java/com/google/tsunami/callbackserver/common/config/PollingServerConfig.java`
#### Snippet
```java
/** Data model for the polling server configuration. */
@AutoValue
public abstract class PollingServerConfig {
  public abstract int port();
  public abstract Optional<Integer> workerPoolSize();
```

### AbstractClassNeverImplemented
Abstract class `TcsConfig` has no concrete subclass
in `common/src/main/java/com/google/tsunami/callbackserver/common/config/TcsConfig.java`
#### Snippet
```java
/** Data models for TCS server configs. */
@AutoValue
public abstract class TcsConfig {
  public abstract CommonConfig commonConfig();
  public abstract StorageConfig storageConfig();
```

### AbstractClassNeverImplemented
Abstract class `RedisStorageConfig` has no concrete subclass
in `common/src/main/java/com/google/tsunami/callbackserver/common/config/RedisStorageConfig.java`
#### Snippet
```java
/** Data model for the Redis storage configuration. */
@AutoValue
public abstract class RedisStorageConfig {
  public abstract Duration interactionTtl();
  public abstract String readEndpointHost();
```

### AbstractClassNeverImplemented
Abstract class `DnsRecordingServerConfig` has no concrete subclass
in `common/src/main/java/com/google/tsunami/callbackserver/common/config/DnsRecordingServerConfig.java`
#### Snippet
```java
/** Data model for the DNS recording server configuration. */
@AutoValue
public abstract class DnsRecordingServerConfig {
  public abstract int port();
  public abstract Optional<Integer> workerPoolSize();
```

### AbstractClassNeverImplemented
Abstract class `RecordingServerConfig` has no concrete subclass
in `common/src/main/java/com/google/tsunami/callbackserver/common/config/RecordingServerConfig.java`
#### Snippet
```java
/** Data model for the recording server configuration. */
@AutoValue
public abstract class RecordingServerConfig {
  public abstract Optional<HttpRecordingServerConfig> httpRecordingServerConfig();
  public abstract Optional<DnsRecordingServerConfig> dnsRecordingServerConfig();
```

### AbstractClassNeverImplemented
Abstract class `StorageConfig` has no concrete subclass
in `common/src/main/java/com/google/tsunami/callbackserver/common/config/StorageConfig.java`
#### Snippet
```java
/** Data model for the interaction storage configuration. */
@AutoValue
public abstract class StorageConfig {
  public abstract Optional<InMemoryStorageConfig> inMemoryStorageConfig();
  public abstract Optional<RedisStorageConfig> redisStorageConfig();
```

### AbstractClassNeverImplemented
Abstract class `HttpRecordingServerConfig` has no concrete subclass
in `common/src/main/java/com/google/tsunami/callbackserver/common/config/HttpRecordingServerConfig.java`
#### Snippet
```java
/** Data model for the HTTP recording server configuration. */
@AutoValue
public abstract class HttpRecordingServerConfig {
  public abstract int port();
  public abstract Optional<Integer> workerPoolSize();
```

### AbstractClassNeverImplemented
Abstract class `CommonConfig` has no concrete subclass
in `common/src/main/java/com/google/tsunami/callbackserver/common/config/CommonConfig.java`
#### Snippet
```java
/** Data model for TCS server's shared configuration. */
@AutoValue
public abstract class CommonConfig {
  public abstract String domain();
  public abstract String externalIp();
```

## RuleId[id=UnstableApiUsage]
### UnstableApiUsage
'newReader(java.io.File, java.nio.charset.Charset)' is marked unstable with @Beta
in `common/src/main/java/com/google/tsunami/callbackserver/common/config/TcsConfig.java`
#### Snippet
```java
  public static TcsConfig fromYamlFile(String configFile) throws FileNotFoundException {
    Yaml yaml = new Yaml(new SafeConstructor());
    Map<String, Object> rawYamlData = yaml.load(Files.newReader(new File(configFile), UTF_8));
    return fromRawData(rawYamlData);
  }
```

### UnstableApiUsage
'com.google.common.net.InetAddresses' is marked unstable with @Beta
in `server/src/main/java/com/google/tsunami/callbackserver/server/recording/DnsRecordingHandler.java`
#### Snippet
```java

  private static DefaultDnsRawRecord buildAnswer(String domainName, String answerIp) {
    InetAddress answerIpAddr = InetAddresses.forString(answerIp);
    if (answerIpAddr instanceof Inet4Address) {
      return new DefaultDnsRawRecord(
```

### UnstableApiUsage
'forString(java.lang.String)' is declared in unstable class 'com.google.common.net.InetAddresses' marked with @Beta
in `server/src/main/java/com/google/tsunami/callbackserver/server/recording/DnsRecordingHandler.java`
#### Snippet
```java

  private static DefaultDnsRawRecord buildAnswer(String domainName, String answerIp) {
    InetAddress answerIpAddr = InetAddresses.forString(answerIp);
    if (answerIpAddr instanceof Inet4Address) {
      return new DefaultDnsRawRecord(
```

### UnstableApiUsage
'com.google.common.net.InternetDomainName' is marked unstable with @Beta
in `server/src/main/java/com/google/tsunami/callbackserver/server/recording/DnsRecordingHandler.java`
#### Snippet
```java
    // Best-effort normalization of domain names.
    try {
      questionDomain = InternetDomainName.from(questionDomain).toString();
    } catch (IllegalArgumentException e) {
      // pass
```

### UnstableApiUsage
'from(java.lang.String)' is declared in unstable class 'com.google.common.net.InternetDomainName' marked with @Beta
in `server/src/main/java/com/google/tsunami/callbackserver/server/recording/DnsRecordingHandler.java`
#### Snippet
```java
    // Best-effort normalization of domain names.
    try {
      questionDomain = InternetDomainName.from(questionDomain).toString();
    } catch (IllegalArgumentException e) {
      // pass
```

### UnstableApiUsage
'toString()' is declared in unstable class 'com.google.common.net.InternetDomainName' marked with @Beta
in `server/src/main/java/com/google/tsunami/callbackserver/server/recording/DnsRecordingHandler.java`
#### Snippet
```java
    // Best-effort normalization of domain names.
    try {
      questionDomain = InternetDomainName.from(questionDomain).toString();
    } catch (IllegalArgumentException e) {
      // pass
```

### UnstableApiUsage
'com.google.common.net.InternetDomainName' is marked unstable with @Beta
in `server/src/main/java/com/google/tsunami/callbackserver/server/recording/DnsRecordingHandler.java`
#### Snippet
```java
    }
    try {
      authoritativeDnsDomain = InternetDomainName.from(authoritativeDnsDomain).toString();
    } catch (IllegalArgumentException e) {
      // pass
```

### UnstableApiUsage
'from(java.lang.String)' is declared in unstable class 'com.google.common.net.InternetDomainName' marked with @Beta
in `server/src/main/java/com/google/tsunami/callbackserver/server/recording/DnsRecordingHandler.java`
#### Snippet
```java
    }
    try {
      authoritativeDnsDomain = InternetDomainName.from(authoritativeDnsDomain).toString();
    } catch (IllegalArgumentException e) {
      // pass
```

### UnstableApiUsage
'toString()' is declared in unstable class 'com.google.common.net.InternetDomainName' marked with @Beta
in `server/src/main/java/com/google/tsunami/callbackserver/server/recording/DnsRecordingHandler.java`
#### Snippet
```java
    }
    try {
      authoritativeDnsDomain = InternetDomainName.from(authoritativeDnsDomain).toString();
    } catch (IllegalArgumentException e) {
      // pass
```

### UnstableApiUsage
'com.google.common.net.HostAndPort' is marked unstable with @Beta
in `common/src/main/java/com/google/tsunami/callbackserver/common/CbidProcessor.java`
#### Snippet
```java
   * @return an interaction hostname with the given CBID.
   */
  public static String addCbidToSubdomain(String cbid, HostAndPort hostAndPort) {
    return String.format("%s.%s", cbid, hostAndPort);
  }
```

### UnstableApiUsage
'com.google.common.net.HostAndPort' is marked unstable with @Beta
in `common/src/main/java/com/google/tsunami/callbackserver/common/CbidProcessor.java`
#### Snippet
```java
   * @return an HTTP interaction URL with the given CBID.
   */
  public static String addCbidToUrl(String cbid, HostAndPort hostAndPort) {
    return String.format("http://%s/%s", hostAndPort, cbid);
  }
```

### UnstableApiUsage
'com.google.common.net.InetAddresses' is marked unstable with @Beta
in `common/src/main/java/com/google/tsunami/callbackserver/common/config/CommonConfig.java`
#### Snippet
```java
    String domain = (String) commonConfig.get("domain");
    String externalIp = (String) commonConfig.get("external_ip");
    if (!InetAddresses.isInetAddress(externalIp)) {
      throw new IllegalArgumentException(
          String.format("Config common.external_ip is not valid: %s.", externalIp));
```

### UnstableApiUsage
'isInetAddress(java.lang.String)' is declared in unstable class 'com.google.common.net.InetAddresses' marked with @Beta
in `common/src/main/java/com/google/tsunami/callbackserver/common/config/CommonConfig.java`
#### Snippet
```java
    String domain = (String) commonConfig.get("domain");
    String externalIp = (String) commonConfig.get("external_ip");
    if (!InetAddresses.isInetAddress(externalIp)) {
      throw new IllegalArgumentException(
          String.format("Config common.external_ip is not valid: %s.", externalIp));
```

