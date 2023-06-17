# keyple-card-calypso-crypto-legacysam-java-lib 
 
# Bad smells
I found 22 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| IgnoreResultOfCall | 16 | false |
| UNCHECKED_WARNING | 2 | false |
| UnstableApiUsage | 2 | false |
| UNUSED_IMPORT | 1 | false |
| ReplaceCallWithBinaryOperator | 1 | false |
## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked cast: 'org.eclipse.keyple.card.calypso.crypto.legacysam.DtoAdapters.CommonSignatureComputationDataAdapter' to 'T'
in `src/main/java/org/eclipse/keyple/card/calypso/crypto/legacysam/DtoAdapters.java`
#### Snippet
```java
      implements CommonSignatureComputationData<T> {

    private final T currentInstance = (T) this;
    private byte[] data;
    private byte kif;
```

### UNCHECKED_WARNING
Unchecked cast: 'org.eclipse.keyple.card.calypso.crypto.legacysam.DtoAdapters.CommonSignatureVerificationDataAdapter' to 'T'
in `src/main/java/org/eclipse/keyple/card/calypso/crypto/legacysam/DtoAdapters.java`
#### Snippet
```java
      implements CommonSignatureVerificationData<T> {

    private final T currentInstance = (T) this;
    private byte[] data;
    private byte[] signature;
```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import static org.eclipse.keyple.card.calypso.crypto.legacysam.DtoAdapters.CommandContextDto;`
in `src/main/java/org/eclipse/keyple/card/calypso/crypto/legacysam/CommandWriteCeilings.java`
#### Snippet
```java

import static org.eclipse.keyple.card.calypso.crypto.legacysam.DtoAdapters.*;
import static org.eclipse.keyple.card.calypso.crypto.legacysam.DtoAdapters.CommandContextDto;

import java.util.HashMap;
```

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
Result of `Assert.notNull()` is ignored
in `src/main/java/org/eclipse/keyple/card/calypso/crypto/legacysam/LegacySamCardExtensionService.java`
#### Snippet
```java
  public CardResourceProfileExtension createLegacySamResourceProfileExtension(
      LegacySamSelection legacySamSelection) {
    Assert.getInstance().notNull(legacySamSelection, "Legacy SAM selection");
    return new LegacySamResourceProfileExtensionAdapter(legacySamSelection);
  }
```

### IgnoreResultOfCall
Result of `Assert.notNull()` is ignored
in `src/main/java/org/eclipse/keyple/card/calypso/crypto/legacysam/LSTransactionManagerFactoryAdapter.java`
#### Snippet
```java
          "The provided 'sam' must be an instance of 'LegacySamAdapter'");
    }
    Assert.getInstance().notNull(samCommands, "samCommands");
    return new LSAsyncTransactionExecutorManagerAdapter(
        (ProxyReaderApi) samReader, (LegacySamAdapter) sam, samCommands);
```

### IgnoreResultOfCall
Result of `Assert.notNull()` is ignored
in `src/main/java/org/eclipse/keyple/card/calypso/crypto/legacysam/LSTransactionManagerFactoryAdapter.java`
#### Snippet
```java
    Assert.getInstance()
        .notNull(targetSamContext, "targetSamContext")
        .notNull(securitySetting, "securitySetting");
    return new LSAsyncTransactionCreatorManagerAdapter(targetSamContext, securitySetting);
  }
```

### IgnoreResultOfCall
Result of `Assert.isInRange()` is ignored
in `src/main/java/org/eclipse/keyple/card/calypso/crypto/legacysam/KeyParameterAdapter.java`
#### Snippet
```java
  @Override
  public byte getParameterValue(int parameterNumber) {
    Assert.getInstance().isInRange(parameterNumber, 1, 10, "parameterNumber");
    return keyParameters[2 + parameterNumber];
  }
```

### IgnoreResultOfCall
Result of `Assert.notNull()` is ignored
in `src/main/java/org/eclipse/keyple/card/calypso/crypto/legacysam/LegacySamSelectionAdapter.java`
#### Snippet
```java
  public LegacySamSelection filterByProductType(LegacySam.ProductType productType) {

    Assert.getInstance().notNull(productType, "productType");

    this.productType = productType;
```

### IgnoreResultOfCall
Result of `Assert.isHexString()` is ignored
in `src/main/java/org/eclipse/keyple/card/calypso/crypto/legacysam/LegacySamSelectionAdapter.java`
#### Snippet
```java
            unlockData.length() == 16 || unlockData.length() == 32,
            "unlock data length == 16 or 32")
        .isHexString(unlockData, "unlockData");
    unlockCommand = new CommandUnlock(productType, HexUtil.toByteArray(unlockData));
    return this;
```

### IgnoreResultOfCall
Result of `Assert.notNull()` is ignored
in `src/main/java/org/eclipse/keyple/card/calypso/crypto/legacysam/LegacySamSelectionAdapter.java`
#### Snippet
```java
  public LegacySamSelection filterBySerialNumber(String serialNumberRegex) {

    Assert.getInstance().notNull(serialNumberRegex, "serialNumberRegex");

    try {
```

### IgnoreResultOfCall
Result of `Assert.isInRange()` is ignored
in `src/main/java/org/eclipse/keyple/card/calypso/crypto/legacysam/LSAsyncTransactionCreatorManagerAdapter.java`
#### Snippet
```java
        .isInRange(
            counterNumber, MIN_COUNTER_CEILING_NUMBER, MAX_COUNTER_CEILING_NUMBER, "counterNumber")
        .isInRange(
            ceilingValue, MIN_COUNTER_CEILING_VALUE, MAX_COUNTER_CEILING_VALUE, "ceilingValue");

```

### IgnoreResultOfCall
Result of `Assert.isInRange()` is ignored
in `src/main/java/org/eclipse/keyple/card/calypso/crypto/legacysam/LSAsyncTransactionCreatorManagerAdapter.java`
#### Snippet
```java
        .isInRange(
            counterNumber, MIN_COUNTER_CEILING_NUMBER, MAX_COUNTER_CEILING_NUMBER, "counterNumber")
        .isInRange(
            ceilingValue, MIN_COUNTER_CEILING_VALUE, MAX_COUNTER_CEILING_VALUE, "ceilingValue");

```

### IgnoreResultOfCall
Result of `Assert.isTrue()` is ignored
in `src/main/java/org/eclipse/keyple/card/calypso/crypto/legacysam/LSSecuritySettingAdapter.java`
#### Snippet
```java
        .notNull(controlSam, "controlSam")
        .notNull(controlSam.getProductType(), "productType")
        .isTrue(controlSam.getProductType() != LegacySam.ProductType.UNKNOWN, "productType");
    if (!(samReader instanceof ProxyReaderApi)) {
      throw new IllegalArgumentException(
```

### IgnoreResultOfCall
Result of `Assert.isTrue()` is ignored
in `src/main/java/org/eclipse/keyple/card/calypso/crypto/legacysam/LSFreeTransactionManagerAdapter.java`
#### Snippet
```java
              dataAdapter.getData().length % 8 == 0, "length of data to sign is a multiple of 8")
          .isInRange(dataAdapter.getSignatureSize(), 1, 8, MSG_SIGNATURE_SIZE)
          .isTrue(
              dataAdapter.getKeyDiversifier() == null
                  || (dataAdapter.getKeyDiversifier().length >= 1
```

### IgnoreResultOfCall
Result of `Assert.isTrue()` is ignored
in `src/main/java/org/eclipse/keyple/card/calypso/crypto/legacysam/LSFreeTransactionManagerAdapter.java`
#### Snippet
```java
                      - (dataAdapter.isPartialSamSerialNumber() ? 7 * 8 : 8 * 8))
                  + "]")
          .isTrue(
              dataAdapter.getKeyDiversifier() == null
                  || (dataAdapter.getKeyDiversifier().length >= 1
```

### IgnoreResultOfCall
Result of `Assert.isInRange()` is ignored
in `src/main/java/org/eclipse/keyple/card/calypso/crypto/legacysam/LSFreeTransactionManagerAdapter.java`
#### Snippet
```java
  public LSFreeTransactionManager prepareReadCounterStatus(int counterNumber) {
    Assert.getInstance()
        .isInRange(counterNumber, MIN_COUNTER_NUMBER, MAX_COUNTER_NUMBER, "counterNumber");
    for (Command command : getTargetSamCommands()) {
      if (command instanceof CommandReadCounter
```

### IgnoreResultOfCall
Result of `Assert.isTrue()` is ignored
in `src/main/java/org/eclipse/keyple/card/calypso/crypto/legacysam/LSFreeTransactionManagerAdapter.java`
#### Snippet
```java
          .notNull(dataAdapter.getSignature(), "signature")
          .isInRange(dataAdapter.getSignature().length, 1, 8, MSG_SIGNATURE_SIZE)
          .isTrue(
              dataAdapter.getKeyDiversifier() == null
                  || (dataAdapter.getKeyDiversifier().length >= 1
```

### IgnoreResultOfCall
Result of `Assert.isTrue()` is ignored
in `src/main/java/org/eclipse/keyple/card/calypso/crypto/legacysam/LSFreeTransactionManagerAdapter.java`
#### Snippet
```java
                      - (dataAdapter.isPartialSamSerialNumber() ? 7 * 8 : 8 * 8))
                  + "]")
          .isTrue(
              dataAdapter.getKeyDiversifier() == null
                  || (dataAdapter.getKeyDiversifier().length >= 1
```

### IgnoreResultOfCall
Result of `Assert.notNull()` is ignored
in `src/main/java/org/eclipse/keyple/card/calypso/crypto/legacysam/LSFreeTransactionManagerAdapter.java`
#### Snippet
```java
  @Override
  public LSFreeTransactionManager prepareReadSystemKeyParameters(SystemKeyType systemKeyType) {
    Assert.getInstance().notNull(systemKeyType, "systemKeyType");
    addTargetSamCommand(new CommandReadKeyParameters(getContext(), systemKeyType));
    return this;
```

