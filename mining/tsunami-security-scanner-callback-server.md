# tsunami-security-scanner-callback-server 
 
# Bad smells
I found 22 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnstableApiUsage | 13 | false |
| OptionalUsedAsFieldOrParameterType | 6 | false |
| NullableProblems | 2 | false |
| UnnecessarySemicolon | 1 | false |
## RuleId[id=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'ex'
in `server/src/main/java/com/google/tsunami/callbackserver/server/common/monitoring/TcsEventsObserver.java`
#### Snippet
```java
      Duration responseTime,
      DnsResponseCode responseCode,
      Optional<Exception> ex);

  default void onFailedDnsRpc(
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'ex'
in `server/src/main/java/com/google/tsunami/callbackserver/server/common/monitoring/TcsEventsObserver.java`
#### Snippet
```java
      Duration responseTime,
      HttpResponseStatus responseCode,
      Optional<Exception> ex);

  default void onFailedHttpRpc(
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'clientAddr'
in `server/src/main/java/com/google/tsunami/callbackserver/server/common/DnsHandler.java`
#### Snippet
```java
   */
  protected abstract DatagramDnsResponse handleRequest(
      DatagramDnsQuery request, Optional<InetAddress> clientAddr) throws Exception;
}

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'clientAddr'
in `server/src/main/java/com/google/tsunami/callbackserver/server/common/RequestLogger.java`
#### Snippet
```java
  }

  public static String maybeGetClientAddrAsString(Optional<InetAddress> clientAddr) {
    checkNotNull(clientAddr);
    return clientAddr.map(InetAddress::getHostAddress).orElse("n/a");
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'clientAddr'
in `server/src/main/java/com/google/tsunami/callbackserver/server/common/RequestLogger.java`
#### Snippet
```java

  private Optional<InetAddress> logRequestAndGetClientAddr(
      String endpointName, Protocol protocol, Optional<InetAddress> clientAddr, Object request) {
    // Logging here will be quite a bit spammy (TCS deployments are usually internet exposed and
    // receive a lot of random traffic). Still we want these logs so that we can easily debug
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'clientAddr'
in `server/src/main/java/com/google/tsunami/callbackserver/server/common/HttpHandler.java`
#### Snippet
```java
   */
  protected abstract Message handleRequest(
      FullHttpRequest request, Optional<InetAddress> clientAddr) throws Exception;
}

```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `server/src/main/java/com/google/tsunami/callbackserver/server/common/HttpHandler.java`
#### Snippet
```java
  protected enum LogNotFoundEx {
    LOG,
    DONT_LOG;
  }

```

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `server/src/main/java/com/google/tsunami/callbackserver/server/common/DnsServer.java`
#### Snippet
```java
            new ChannelInitializer<NioDatagramChannel>() {
              @Override
              protected void initChannel(NioDatagramChannel ch) {
                ChannelPipeline p = ch.pipeline();
                p.addLast(name() + "DnsQueryDecoder", new DatagramDnsQueryDecoder());
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `server/src/main/java/com/google/tsunami/callbackserver/server/common/HttpServer.java`
#### Snippet
```java
            new ChannelInitializer<SocketChannel>() {
              @Override
              protected void initChannel(SocketChannel ch) {
                ChannelPipeline p = ch.pipeline();
                p.addLast(name() + "HttpServerCodec", new HttpServerCodec());
```

## RuleId[id=UnstableApiUsage]
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
'newReader(java.io.File, java.nio.charset.Charset)' is marked unstable with @Beta
in `common/src/main/java/com/google/tsunami/callbackserver/common/config/TcsConfig.java`
#### Snippet
```java
  public static TcsConfig fromYamlFile(String configFile) throws FileNotFoundException {
    Yaml yaml = new Yaml(new SafeConstructor(new LoaderOptions()));
    Map<String, Object> rawYamlData = yaml.load(Files.newReader(new File(configFile), UTF_8));
    return fromRawData(rawYamlData);
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

