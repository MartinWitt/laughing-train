# keyple-plugin-pcsc-java-lib 
 
# Bad smells
I found 9 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| IgnoreResultOfCall | 6 | false |
| UnstableApiUsage | 2 | false |
| ReplaceCallWithBinaryOperator | 1 | false |
## RuleId[id=ReplaceCallWithBinaryOperator]
### ReplaceCallWithBinaryOperator
Call can be replaced with binary operator
in `build.gradle.kts`
#### Snippet
```java
            property("sonar.login", System.getenv("SONAR_LOGIN"))
            System.getenv("BRANCH_NAME")?.let {
                if (!"main".equals(it)) {
                    property("sonar.branch.name", it)
                }
```

## RuleId[id=UnstableApiUsage]
### UnstableApiUsage
'withJavadocJar()' is marked unstable with @Incubating
in `build.gradle.kts`
#### Snippet
```java
    targetCompatibility = JavaVersion.toVersion(javaTargetLevel)
    println("Compiling Java $sourceCompatibility to Java $targetCompatibility.")
    withJavadocJar()
    withSourcesJar()
}
```

### UnstableApiUsage
'withSourcesJar()' is marked unstable with @Incubating
in `build.gradle.kts`
#### Snippet
```java
    println("Compiling Java $sourceCompatibility to Java $targetCompatibility.")
    withJavadocJar()
    withSourcesJar()
}

```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `Assert.notEmpty()` is ignored
in `src/main/java/org/eclipse/keyple/plugin/pcsc/PcscPluginFactoryBuilder.java`
#### Snippet
```java
        String contactlessReaderIdentificationFilter) {
      Assert.getInstance()
          .notEmpty(contactlessReaderIdentificationFilter, "contactlessReaderIdentificationFilter");
      try {
        this.contactlessReaderIdentificationFilterPattern =
```

### IgnoreResultOfCall
Result of `Assert.notEmpty()` is ignored
in `src/main/java/org/eclipse/keyple/plugin/pcsc/PcscPluginFactoryBuilder.java`
#### Snippet
```java
    public Builder updateProtocolIdentificationRule(
        String readerProtocolName, String protocolRule) {
      Assert.getInstance().notEmpty(readerProtocolName, "readerProtocolName");
      if (protocolRule == null) {
        // disable the protocol by defining a regex that always fails.
```

### IgnoreResultOfCall
Result of `Assert.notNull()` is ignored
in `src/main/java/org/eclipse/keyple/plugin/pcsc/AbstractPcscReaderAdapter.java`
#### Snippet
```java
  @Override
  public byte[] transmitControlCommand(int commandId, byte[] command) {
    Assert.getInstance().notNull(command, "command");
    byte[] response;
    int controlCode = isWindows ? 0x00310000 | (commandId << 2) : 0x42000000 | commandId;
```

### IgnoreResultOfCall
Result of `Assert.notNull()` is ignored
in `src/main/java/org/eclipse/keyple/plugin/pcsc/AbstractPcscReaderAdapter.java`
#### Snippet
```java
  @Override
  public final PcscReader setSharingMode(SharingMode sharingMode) {
    Assert.getInstance().notNull(sharingMode, "sharingMode");
    if (logger.isTraceEnabled()) {
      logger.trace("{}: set sharing mode to {}", getName(), sharingMode.name());
```

### IgnoreResultOfCall
Result of `Assert.notNull()` is ignored
in `src/main/java/org/eclipse/keyple/plugin/pcsc/AbstractPcscReaderAdapter.java`
#### Snippet
```java
  @Override
  public final PcscReader setIsoProtocol(IsoProtocol isoProtocol) {
    Assert.getInstance().notNull(isoProtocol, "isoProtocol");
    if (logger.isTraceEnabled()) {
      logger.trace(
```

### IgnoreResultOfCall
Result of `Assert.notNull()` is ignored
in `src/main/java/org/eclipse/keyple/plugin/pcsc/AbstractPcscReaderAdapter.java`
#### Snippet
```java
  @Override
  public final PcscReader setDisconnectionMode(DisconnectionMode disconnectionMode) {
    Assert.getInstance().notNull(disconnectionMode, "disconnectionMode");
    if (logger.isTraceEnabled()) {
      logger.trace("{}: set disconnection to {}", getName(), disconnectionMode.name());
```

