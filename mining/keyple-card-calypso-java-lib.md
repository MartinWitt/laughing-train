# keyple-card-calypso-java-lib 
 
# Bad smells
I found 186 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| IgnoreResultOfCall | 72 | false |
| DeprecatedIsStillUsed | 31 | false |
| ReturnNull | 21 | false |
| AssignmentToMethodParameter | 12 | false |
| ZeroLengthArrayInitialization | 12 | false |
| BoundedWildcard | 11 | false |
| InstanceofCatchParameter | 8 | false |
| UnnecessarySuperQualifier | 5 | false |
| UnnecessaryFullyQualifiedName | 5 | false |
| ReplaceAssignmentWithOperatorAssignment | 5 | false |
| UnstableApiUsage | 2 | false |
| UNUSED_IMPORT | 1 | false |
| ReplaceCallWithBinaryOperator | 1 | false |
## RuleId[id=UnnecessarySuperQualifier]
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/eclipse/keyple/card/calypso/CmdCardInvalidate.java`
#### Snippet
```java
  void parseResponse(ApduResponseApi apduResponse) throws CardCommandException {
    decryptResponseAndUpdateTerminalSessionMacIfNeeded(apduResponse);
    super.setApduResponseAndCheckStatus(apduResponse);
    updateTerminalSessionMacIfNeeded();
  }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/eclipse/keyple/card/calypso/CmdCardChangeKey.java`
#### Snippet
```java
  @Override
  void parseResponse(ApduResponseApi apduResponse) throws CardCommandException {
    super.setApduResponseAndCheckStatus(apduResponse);
  }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/eclipse/keyple/card/calypso/CmdCardRatification.java`
#### Snippet
```java
  void parseResponse(ApduResponseApi apduResponse) throws CardCommandException {
    try {
      super.setApduResponseAndCheckStatus(apduResponse);
    } catch (CardCommandException e) {
      // NOP: ratification nominal case
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/eclipse/keyple/card/calypso/CmdCardRehabilitate.java`
#### Snippet
```java
  void parseResponse(ApduResponseApi apduResponse) throws CardCommandException {
    decryptResponseAndUpdateTerminalSessionMacIfNeeded(apduResponse);
    super.setApduResponseAndCheckStatus(apduResponse);
    updateTerminalSessionMacIfNeeded();
  }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/eclipse/keyple/card/calypso/CmdCardChangePin.java`
#### Snippet
```java
  @Override
  void parseResponse(ApduResponseApi apduResponse) throws CardCommandException {
    super.setApduResponseAndCheckStatus(apduResponse);
  }

```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.calypsonet.terminal.calypso.sam` is unnecessary and can be removed
in `src/main/java/org/eclipse/keyple/card/calypso/CalypsoSamSelectionAdapter.java`
#### Snippet
```java
 *
 * <p>If not specified, the SAM product type used for unlocking is {@link
 * org.calypsonet.terminal.calypso.sam.CalypsoSam.ProductType#SAM_C1}.
 *
 * @since 2.0.0
```

### UnnecessaryFullyQualifiedName
Qualifier `org.calypsonet.terminal.card` is unnecessary and can be removed
in `src/main/java/org/eclipse/keyple/card/calypso/SamCommand.java`
#### Snippet
```java
 *   <li>the name of the command,
 *   <li>the built {@link org.calypsonet.terminal.card.spi.ApduRequestSpi},
 *   <li>the parsed {@link org.calypsonet.terminal.card.ApduResponseApi}.
 * </ul>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.calypsonet.terminal.card` is unnecessary and can be removed
in `src/main/java/org/eclipse/keyple/card/calypso/CardCommand.java`
#### Snippet
```java
 *   <li>the name of the command,
 *   <li>the built {@link org.calypsonet.terminal.card.spi.ApduRequestSpi},
 *   <li>the parsed {@link org.calypsonet.terminal.card.ApduResponseApi}.
 * </ul>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.calypsonet.terminal.calypso.sam` is unnecessary and can be removed
in `src/main/java/org/eclipse/keyple/card/calypso/CalypsoExtensionService.java`
#### Snippet
```java
   *
   * @param calypsoSamSelection A not null {@link
   *     org.calypsonet.terminal.calypso.sam.CalypsoSamSelection}.
   * @return A not null reference.
   * @throws IllegalArgumentException If "calypsoSamSelection" is null.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.calypsonet.terminal.calypso.transaction` is unnecessary and can be removed
in `src/main/java/org/eclipse/keyple/card/calypso/CardTransactionManagerAdapter.java`
#### Snippet
```java

/**
 * Implementation of {@link org.calypsonet.terminal.calypso.transaction.CardTransactionManager}.
 *
 * <ul>
```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import org.calypsonet.terminal.calypso.transaction.InconsistentDataException;`
in `src/main/java/org/eclipse/keyple/card/calypso/CardTransactionManagerAdapter.java`
#### Snippet
```java
import org.calypsonet.terminal.calypso.card.ElementaryFile;
import org.calypsonet.terminal.calypso.transaction.*;
import org.calypsonet.terminal.calypso.transaction.InconsistentDataException;
import org.calypsonet.terminal.card.*;
import org.calypsonet.terminal.card.spi.ApduRequestSpi;
```

## RuleId[id=ReplaceAssignmentWithOperatorAssignment]
### ReplaceAssignmentWithOperatorAssignment
`p1 = (byte) (p1 + 1)` could be simplified to 'p1 += 1'
in `src/main/java/org/eclipse/keyple/card/calypso/CmdSamDigestInit.java`
#### Snippet
```java
    byte p1 = 0x00;
    if (verificationMode) {
      p1 = (byte) (p1 + 1);
    }
    if (confidentialSessionMode) {
```

### ReplaceAssignmentWithOperatorAssignment
`p1 = (byte) (p1 + 2)` could be simplified to 'p1 += 2'
in `src/main/java/org/eclipse/keyple/card/calypso/CmdSamDigestInit.java`
#### Snippet
```java
    }
    if (confidentialSessionMode) {
      p1 = (byte) (p1 + 2);
    }

```

### ReplaceAssignmentWithOperatorAssignment
`index = index + len` could be simplified to 'index += len'
in `src/main/java/org/eclipse/keyple/card/calypso/CmdCardReadRecords.java`
#### Snippet
```java
        getCalypsoCard()
            .setContent((byte) sfi, recordNb, Arrays.copyOfRange(apdu, index, index + len));
        index = index + len;
        apduLen = apduLen - 2 - len;
      }
```

### ReplaceAssignmentWithOperatorAssignment
`index = index + len` could be simplified to 'index += len'
in `src/main/java/org/eclipse/keyple/card/calypso/CmdCardReadRecords.java`
#### Snippet
```java
            .getCard()
            .setContent((byte) sfi, recordNb, Arrays.copyOfRange(dataOut, index, index + len));
        index = index + len;
        apduLen = apduLen - 2 - len;
      }
```

### ReplaceAssignmentWithOperatorAssignment
`p2 = (byte) (p2 - (byte) 0x01)` could be simplified to 'p2 -= (byte) 0x01'
in `src/main/java/org/eclipse/keyple/card/calypso/CmdCardReadRecords.java`
#### Snippet
```java
    byte p2 = (sfi == (byte) 0x00) ? (byte) 0x05 : (byte) ((byte) (sfi * 8) + 5);
    if (readMode == ReadMode.ONE_RECORD) {
      p2 = (byte) (p2 - (byte) 0x01);
    }
    byte le = (byte) expectedLength;
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'CmdCardGetDataFcp' is still used
in `src/main/java/org/eclipse/keyple/card/calypso/CmdCardGetDataFcp.java`
#### Snippet
```java
   */
  @Deprecated
  CmdCardGetDataFcp(CalypsoCardAdapter calypsoCard) {
    super(CardCommandRef.GET_DATA, 0, calypsoCard, null, null);
    buildCommand(calypsoCard.getCardClass());
```

### DeprecatedIsStillUsed
Deprecated member 'CmdCardReadBinary' is still used
in `src/main/java/org/eclipse/keyple/card/calypso/CmdCardReadBinary.java`
#### Snippet
```java
   */
  @Deprecated
  CmdCardReadBinary(CalypsoCardAdapter calypsoCard, byte sfi, int offset, int length) {

    super(CardCommandRef.READ_BINARY, length, calypsoCard, null, null);
```

### DeprecatedIsStillUsed
Deprecated member 'CmdCardAppendRecord' is still used
in `src/main/java/org/eclipse/keyple/card/calypso/CmdCardAppendRecord.java`
#### Snippet
```java
   */
  @Deprecated
  CmdCardAppendRecord(CalypsoCardAdapter calypsoCard, byte sfi, byte[] newRecordData) {

    super(CardCommandRef.APPEND_RECORD, 0, calypsoCard, null, null);
```

### DeprecatedIsStillUsed
Deprecated member 'CmdCardSvDebitOrUndebit' is still used
in `src/main/java/org/eclipse/keyple/card/calypso/CmdCardSvDebitOrUndebit.java`
#### Snippet
```java
   */
  @Deprecated
  CmdCardSvDebitOrUndebit(
      boolean isDebitCommand,
      CalypsoCardAdapter calypsoCard,
```

### DeprecatedIsStillUsed
Deprecated member 'CmdCardUpdateOrWriteBinary' is still used
in `src/main/java/org/eclipse/keyple/card/calypso/CmdCardUpdateOrWriteBinary.java`
#### Snippet
```java
   */
  @Deprecated
  CmdCardUpdateOrWriteBinary(
      boolean isUpdateCommand, CalypsoCardAdapter calypsoCard, byte sfi, int offset, byte[] data) {

```

### DeprecatedIsStillUsed
Deprecated member 'CmdCardInvalidate' is still used
in `src/main/java/org/eclipse/keyple/card/calypso/CmdCardInvalidate.java`
#### Snippet
```java
   */
  @Deprecated
  CmdCardInvalidate(CalypsoCardAdapter calypsoCard) {

    super(CardCommandRef.INVALIDATE, 0, calypsoCard, null, null);
```

### DeprecatedIsStillUsed
Deprecated member 'addSuccessfulStatusWord' is still used
in `src/main/java/org/eclipse/keyple/card/calypso/CalypsoCardSelectionAdapter.java`
#### Snippet
```java
  @Override
  @Deprecated
  public CalypsoCardSelection addSuccessfulStatusWord(int statusWord) {
    Assert.getInstance().isInRange(statusWord, 0, 0xFFFF, "statusWord");
    cardSelector.addSuccessfulStatusWord(statusWord);
```

### DeprecatedIsStillUsed
Deprecated member 'prepareSelectFile' is still used
in `src/main/java/org/eclipse/keyple/card/calypso/CalypsoCardSelectionAdapter.java`
#### Snippet
```java
  @Override
  @Deprecated
  public CalypsoCardSelection prepareSelectFile(byte[] lid) {
    Assert.getInstance().notNull(lid, "lid").isEqual(lid.length, 2, "lid length");
    return prepareSelectFile((short) ByteArrayUtil.extractInt(lid, 0, 2, false));
```

### DeprecatedIsStillUsed
Deprecated member 'CmdCardSearchRecordMultiple' is still used
in `src/main/java/org/eclipse/keyple/card/calypso/CmdCardSearchRecordMultiple.java`
#### Snippet
```java
   */
  @Deprecated
  CmdCardSearchRecordMultiple(CalypsoCardAdapter calypsoCard, SearchCommandDataAdapter data) {

    super(CardCommandRef.SEARCH_RECORD_MULTIPLE, 0, calypsoCard, null, null);
```

### DeprecatedIsStillUsed
Deprecated member 'CmdCardCloseSecureSession' is still used
in `src/main/java/org/eclipse/keyple/card/calypso/CmdCardCloseSecureSession.java`
#### Snippet
```java
   */
  @Deprecated
  CmdCardCloseSecureSession(
      CalypsoCardAdapter calypsoCard,
      boolean isAutoRatificationAsked,
```

### DeprecatedIsStillUsed
Deprecated member 'CmdCardVerifyPin' is still used
in `src/main/java/org/eclipse/keyple/card/calypso/CmdCardVerifyPin.java`
#### Snippet
```java
   */
  @Deprecated
  CmdCardVerifyPin(CalypsoCardAdapter calypsoCard) {
    super(commandRef, 0, calypsoCard, null, null);
    this.isReadCounterMode = true;
```

### DeprecatedIsStillUsed
Deprecated member 'CmdCardReadRecords' is still used
in `src/main/java/org/eclipse/keyple/card/calypso/CmdCardReadRecords.java`
#### Snippet
```java
   */
  @Deprecated
  CmdCardReadRecords(
      CalypsoCardAdapter calypsoCard,
      int sfi,
```

### DeprecatedIsStillUsed
Deprecated member 'SamSecuritySettingAdapter' is still used
in `src/main/java/org/eclipse/keyple/card/calypso/SamSecuritySettingAdapter.java`
#### Snippet
```java
 */
@Deprecated
final class SamSecuritySettingAdapter extends CommonSecuritySettingAdapter<SamSecuritySetting>
    implements SamSecuritySetting {}

```

### DeprecatedIsStillUsed
Deprecated member 'CmdCardReadRecordMultiple' is still used
in `src/main/java/org/eclipse/keyple/card/calypso/CmdCardReadRecordMultiple.java`
#### Snippet
```java
   */
  @Deprecated
  CmdCardReadRecordMultiple(
      CalypsoCardAdapter calypsoCard, byte sfi, byte recordNumber, byte offset, byte length) {

```

### DeprecatedIsStillUsed
Deprecated member 'CmdCardWriteRecord' is still used
in `src/main/java/org/eclipse/keyple/card/calypso/CmdCardWriteRecord.java`
#### Snippet
```java
   */
  @Deprecated
  CmdCardWriteRecord(
      CalypsoCardAdapter calypsoCard, byte sfi, int recordNumber, byte[] newRecordData) {

```

### DeprecatedIsStillUsed
Deprecated member 'CmdCardGetDataTraceabilityInformation' is still used
in `src/main/java/org/eclipse/keyple/card/calypso/CmdCardGetDataTraceabilityInformation.java`
#### Snippet
```java
   */
  @Deprecated
  CmdCardGetDataTraceabilityInformation(CalypsoCardAdapter calypsoCard) {
    super(CardCommandRef.GET_DATA, 0, calypsoCard, null, null);
    buildCommand(calypsoCard.getCardClass());
```

### DeprecatedIsStillUsed
Deprecated member 'CmdCardIncreaseOrDecrease' is still used
in `src/main/java/org/eclipse/keyple/card/calypso/CmdCardIncreaseOrDecrease.java`
#### Snippet
```java
   */
  @Deprecated
  CmdCardIncreaseOrDecrease(
      boolean isDecreaseCommand,
      CalypsoCardAdapter calypsoCard,
```

### DeprecatedIsStillUsed
Deprecated member 'CmdCardSvGet' is still used
in `src/main/java/org/eclipse/keyple/card/calypso/CmdCardSvGet.java`
#### Snippet
```java
   */
  @Deprecated
  CmdCardSvGet(CalypsoCardAdapter calypsoCard, SvOperation svOperation, boolean useExtendedMode) {

    super(CardCommandRef.SV_GET, 0, calypsoCard, null, null);
```

### DeprecatedIsStillUsed
Deprecated member 'CmdCardRehabilitate' is still used
in `src/main/java/org/eclipse/keyple/card/calypso/CmdCardRehabilitate.java`
#### Snippet
```java
   */
  @Deprecated
  CmdCardRehabilitate(CalypsoCardAdapter calypsoCard) {

    super(CardCommandRef.REHABILITATE, 0, calypsoCard, null, null);
```

### DeprecatedIsStillUsed
Deprecated member 'CmdCardIncreaseOrDecreaseMultiple' is still used
in `src/main/java/org/eclipse/keyple/card/calypso/CmdCardIncreaseOrDecreaseMultiple.java`
#### Snippet
```java
   */
  @Deprecated
  CmdCardIncreaseOrDecreaseMultiple(
      boolean isDecreaseCommand,
      CalypsoCardAdapter calypsoCard,
```

### DeprecatedIsStillUsed
Deprecated member 'CmdCardSvReload' is still used
in `src/main/java/org/eclipse/keyple/card/calypso/CmdCardSvReload.java`
#### Snippet
```java
   */
  @Deprecated
  CmdCardSvReload(
      CalypsoCardAdapter calypsoCard,
      int amount,
```

### DeprecatedIsStillUsed
Deprecated member 'CmdCardManageSession' is still used
in `src/main/java/org/eclipse/keyple/card/calypso/CmdCardManageSession.java`
#### Snippet
```java
   */
  @Deprecated
  CmdCardManageSession(
      CalypsoCardAdapter calypsoCard, boolean activateEncryption, byte[] terminalSessionMac) {

```

### DeprecatedIsStillUsed
Deprecated member 'CmdCardGetDataEfList' is still used
in `src/main/java/org/eclipse/keyple/card/calypso/CmdCardGetDataEfList.java`
#### Snippet
```java
   */
  @Deprecated
  CmdCardGetDataEfList(CalypsoCardAdapter calypsoCard) {
    super(CardCommandRef.GET_DATA, 0, calypsoCard, null, null);
    buildCommand(calypsoCard.getCardClass());
```

### DeprecatedIsStillUsed
Deprecated member 'createSamSecuritySetting' is still used
in `src/main/java/org/eclipse/keyple/card/calypso/CalypsoExtensionService.java`
#### Snippet
```java
   */
  @Deprecated
  public SamSecuritySetting createSamSecuritySetting() {
    return new SamSecuritySettingAdapter();
  }
```

### DeprecatedIsStillUsed
Deprecated member 'createSamTransaction' is still used
in `src/main/java/org/eclipse/keyple/card/calypso/CalypsoExtensionService.java`
#### Snippet
```java
   */
  @Deprecated
  public SamTransactionManager createSamTransaction(
      CardReader samReader, CalypsoSam calypsoSam, SamSecuritySetting samSecuritySetting) {
    return createSamTransactionManagerAdapter(samReader, calypsoSam, samSecuritySetting, true);
```

### DeprecatedIsStillUsed
Deprecated member 'createSamTransactionWithoutSecurity' is still used
in `src/main/java/org/eclipse/keyple/card/calypso/CalypsoExtensionService.java`
#### Snippet
```java
   */
  @Deprecated
  public SamTransactionManager createSamTransactionWithoutSecurity(
      CardReader samReader, CalypsoSam calypsoSam) {
    return createSamTransactionManagerAdapter(samReader, calypsoSam, null, false);
```

### DeprecatedIsStillUsed
Deprecated member 'CmdCardUpdateRecord' is still used
in `src/main/java/org/eclipse/keyple/card/calypso/CmdCardUpdateRecord.java`
#### Snippet
```java
   */
  @Deprecated
  CmdCardUpdateRecord(
      CalypsoCardAdapter calypsoCard, byte sfi, int recordNumber, byte[] newRecordData) {

```

### DeprecatedIsStillUsed
Deprecated member 'CmdCardGetDataFci' is still used
in `src/main/java/org/eclipse/keyple/card/calypso/CmdCardGetDataFci.java`
#### Snippet
```java
   */
  @Deprecated
  CmdCardGetDataFci(CalypsoCardAdapter calypsoCard) {
    super(CardCommandRef.GET_DATA, 0, calypsoCard, null, null);
    buildCommand(calypsoCard.getCardClass());
```

### DeprecatedIsStillUsed
Deprecated member 'CmdCardSelectFile' is still used
in `src/main/java/org/eclipse/keyple/card/calypso/CmdCardSelectFile.java`
#### Snippet
```java
   */
  @Deprecated
  CmdCardSelectFile(CalypsoCardAdapter calypsoCard, short lid) {
    super(commandRef, 0, calypsoCard, null, null);
    buildCommand(calypsoCard.getCardClass(), calypsoCard.getProductType(), lid);
```

### DeprecatedIsStillUsed
Deprecated member 'CmdCardSelectFile' is still used
in `src/main/java/org/eclipse/keyple/card/calypso/CmdCardSelectFile.java`
#### Snippet
```java
   */
  @Deprecated
  CmdCardSelectFile(CalypsoCardAdapter calypsoCard, SelectFileControl selectFileControl) {
    super(commandRef, 0, calypsoCard, null, null);
    buildCommand(calypsoCard.getCardClass(), selectFileControl);
```

### DeprecatedIsStillUsed
Deprecated member 'processCancel' is still used
in `src/main/java/org/eclipse/keyple/card/calypso/CardTransactionManagerAdapter.java`
#### Snippet
```java
  @Deprecated
  @Override
  public CardTransactionManager processCancel() {
    checkApiLevelCompliance(false);
    if (isSecureSessionOpen) {
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `diversifier`
in `src/main/java/org/eclipse/keyple/card/calypso/CmdSamSelectDiversifier.java`
#### Snippet
```java
      byte[] tmp = new byte[newLength];
      System.arraycopy(diversifier, 0, tmp, newLength - diversifier.length, diversifier.length);
      diversifier = tmp;
    }

```

### AssignmentToMethodParameter
Assignment to method parameter `fromIndex`
in `src/main/java/org/eclipse/keyple/card/calypso/CardTransactionManagerAdapter.java`
#### Snippet
```java
    if (isEncryptionActive) {
      executeCardCommands(cardCommands, apduRequests, fromIndex, toIndex, ChannelControl.KEEP_OPEN);
      fromIndex = cardCommands.size();
      toIndex = cardCommands.size();
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `toIndex`
in `src/main/java/org/eclipse/keyple/card/calypso/CardTransactionManagerAdapter.java`
#### Snippet
```java
      executeCardCommands(cardCommands, apduRequests, fromIndex, toIndex, ChannelControl.KEEP_OPEN);
      fromIndex = cardCommands.size();
      toIndex = cardCommands.size();
    }

```

### AssignmentToMethodParameter
Assignment to method parameter `cardCommands`
in `src/main/java/org/eclipse/keyple/card/calypso/CardTransactionManagerAdapter.java`
#### Snippet
```java
    }

    cardCommands = cardCommands.subList(fromIndex, toIndex);
    apduRequests = apduRequests.subList(fromIndex, toIndex);

```

### AssignmentToMethodParameter
Assignment to method parameter `apduRequests`
in `src/main/java/org/eclipse/keyple/card/calypso/CardTransactionManagerAdapter.java`
#### Snippet
```java

    cardCommands = cardCommands.subList(fromIndex, toIndex);
    apduRequests = apduRequests.subList(fromIndex, toIndex);

    // Build the expected APDU responses of the card commands
```

### AssignmentToMethodParameter
Assignment to method parameter `cardCommands`
in `src/main/java/org/eclipse/keyple/card/calypso/CardTransactionManagerAdapter.java`
#### Snippet
```java
      CmdCardOpenSecureSession cmdCardOpenSecureSession) {

    cardCommands = cardCommands.subList(0, toIndex);
    apduRequests = apduRequests.subList(0, toIndex);

```

### AssignmentToMethodParameter
Assignment to method parameter `apduRequests`
in `src/main/java/org/eclipse/keyple/card/calypso/CardTransactionManagerAdapter.java`
#### Snippet
```java

    cardCommands = cardCommands.subList(0, toIndex);
    apduRequests = apduRequests.subList(0, toIndex);

    // Wrap the list of C-APDUs into a card request
```

### AssignmentToMethodParameter
Assignment to method parameter `cardCommands`
in `src/main/java/org/eclipse/keyple/card/calypso/CardTransactionManagerAdapter.java`
#### Snippet
```java

    if (cardCommands == null) {
      cardCommands = new ArrayList<CardCommand>();
    }

```

### AssignmentToMethodParameter
Assignment to method parameter `fromRecordNumber`
in `src/main/java/org/eclipse/keyple/card/calypso/CardTransactionManagerAdapter.java`
#### Snippet
```java
                  recordSize,
                  recordSize));
          fromRecordNumber++;
        }
        for (int i = fromRecordNumber; i <= toRecordNumber; i++) {
```

### AssignmentToMethodParameter
Assignment to method parameter `cardCommands`
in `src/main/java/org/eclipse/keyple/card/calypso/CardTransactionManagerAdapter.java`
#### Snippet
```java
      }
    } else {
      cardCommands = cardCommands.subList(fromIndex, toIndex);
      apduRequests = apduRequests.subList(fromIndex, toIndex);

```

### AssignmentToMethodParameter
Assignment to method parameter `apduRequests`
in `src/main/java/org/eclipse/keyple/card/calypso/CardTransactionManagerAdapter.java`
#### Snippet
```java
    } else {
      cardCommands = cardCommands.subList(fromIndex, toIndex);
      apduRequests = apduRequests.subList(fromIndex, toIndex);

      if (apduRequests.isEmpty()) {
```

### AssignmentToMethodParameter
Assignment to method parameter `cardCommands`
in `src/main/java/org/eclipse/keyple/card/calypso/CardTransactionManagerAdapter.java`
#### Snippet
```java

    if (cardCommands == null) {
      cardCommands = new ArrayList<CardCommand>(0);
    }

```

## RuleId[id=InstanceofCatchParameter]
### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `src/main/java/org/eclipse/keyple/card/calypso/CalypsoCardSelectionAdapter.java`
#### Snippet
```java
          continue;
        }
        if (e instanceof CardDataAccessException && commandRef == CardCommandRef.SELECT_FILE) {
          throw new SelectFileException("File not found", e);
        } else {
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `src/main/java/org/eclipse/keyple/card/calypso/SymmetricCryptoTransactionManagerAdapter.java`
#### Snippet
```java
          SamCommandRef commandRef = samCommands.get(i).getCommandRef();
          if (commandRef == SamCommandRef.DIGEST_AUTHENTICATE
              && e instanceof SamSecurityDataException) {
            throw new InvalidCardMacException("Invalid card signature.");
          } else if ((commandRef == SamCommandRef.PSO_VERIFY_SIGNATURE
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `src/main/java/org/eclipse/keyple/card/calypso/SymmetricCryptoTransactionManagerAdapter.java`
#### Snippet
```java
          } else if ((commandRef == SamCommandRef.PSO_VERIFY_SIGNATURE
                  || commandRef == SamCommandRef.DATA_CIPHER)
              && e instanceof SamSecurityDataException) {
            throw new InvalidSignatureException("Invalid signature.", e);
          } else if (commandRef == SamCommandRef.SV_CHECK
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `src/main/java/org/eclipse/keyple/card/calypso/SymmetricCryptoTransactionManagerAdapter.java`
#### Snippet
```java
            throw new InvalidSignatureException("Invalid signature.", e);
          } else if (commandRef == SamCommandRef.SV_CHECK
              && e instanceof SamSecurityDataException) {
            throw new InvalidCardMacException("Invalid SV card signature.");
          }
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `src/main/java/org/eclipse/keyple/card/calypso/SamTransactionManagerAdapter.java`
#### Snippet
```java
          SamCommandRef commandRef = samCommands.get(i).getCommandRef();
          if (commandRef == SamCommandRef.DIGEST_AUTHENTICATE
              && e instanceof SamSecurityDataException) {
            throw new InvalidCardSignatureException("Invalid card signature.", e);
          } else if ((commandRef == SamCommandRef.PSO_VERIFY_SIGNATURE
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `src/main/java/org/eclipse/keyple/card/calypso/SamTransactionManagerAdapter.java`
#### Snippet
```java
          } else if ((commandRef == SamCommandRef.PSO_VERIFY_SIGNATURE
                  || commandRef == SamCommandRef.DATA_CIPHER)
              && e instanceof SamSecurityDataException) {
            throw new InvalidSignatureException("Invalid signature.", e);
          } else if (commandRef == SamCommandRef.SV_CHECK
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `src/main/java/org/eclipse/keyple/card/calypso/SamTransactionManagerAdapter.java`
#### Snippet
```java
            throw new InvalidSignatureException("Invalid signature.", e);
          } else if (commandRef == SamCommandRef.SV_CHECK
              && e instanceof SamSecurityDataException) {
            throw new InvalidCardSignatureException("Invalid SV card signature.", e);
          }
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `src/main/java/org/eclipse/keyple/card/calypso/CardTransactionManagerAdapter.java`
#### Snippet
```java
      } catch (CardCommandException e) {
        CardCommandRef commandRef = commands.get(i).getCommandRef();
        if (e instanceof CardDataAccessException) {
          if (commandRef == CardCommandRef.READ_RECORDS
              || commandRef == CardCommandRef.READ_RECORD_MULTIPLE
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `src/main/java/org/eclipse/keyple/card/calypso/CmdCardReadBinary.java`
#### Snippet
```java
    ElementaryFile ef = getTransactionContext().getCard().getFileBySfi(sfi);
    if (ef == null) {
      return null; // NOSONAR
    }
    try {
```

### ReturnNull
Return of `null`
in `src/main/java/org/eclipse/keyple/card/calypso/CmdCardReadBinary.java`
#### Snippet
```java
      // NOP
    }
    return null; // NOSONAR
  }

```

### ReturnNull
Return of `null`
in `src/main/java/org/eclipse/keyple/card/calypso/CmdSamDigestClose.java`
#### Snippet
```java
   */
  byte[] getSignature() {
    return isSuccessful() ? getApduResponse().getDataOut() : null;
  }

```

### ReturnNull
Return of `null`
in `src/main/java/org/eclipse/keyple/card/calypso/CalypsoCardSelectionAdapter.java`
#### Snippet
```java
    Assert.getInstance().isInRange(statusWord, 0, 0xFFFF, "statusWord");
    cardSelector.addSuccessfulStatusWord(statusWord);
    return null;
  }

```

### ReturnNull
Return of `null`
in `src/main/java/org/eclipse/keyple/card/calypso/SamCommand.java`
#### Snippet
```java
  final String getStatusInformation() {
    StatusProperties props = getStatusWordProperties();
    return props != null ? props.getInformation() : null;
  }

```

### ReturnNull
Return of `null`
in `src/main/java/org/eclipse/keyple/card/calypso/FileDataAdapter.java`
#### Snippet
```java
    if (rec1 == null) {
      logger.warn("Record #1 is not set.");
      return null;
    }
    int counterIndex = (numCounter - 1) * 3;
```

### ReturnNull
Return of `null`
in `src/main/java/org/eclipse/keyple/card/calypso/FileDataAdapter.java`
#### Snippet
```java
      logger.warn(
          "Counter #{} is not set (nb of actual counters = {}).", numCounter, rec1.length / 3);
      return null;
    }
    if (counterIndex + 3 > rec1.length) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/eclipse/keyple/card/calypso/SymmetricCryptoSecuritySettingAdapter.java`
#### Snippet
```java
      return map.get(kvc);
    } else {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `src/main/java/org/eclipse/keyple/card/calypso/CmdCardReadRecords.java`
#### Snippet
```java
        index += recordSize;
      } else {
        return null; // NOSONAR
      }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/eclipse/keyple/card/calypso/CmdCardReadRecords.java`
#### Snippet
```java
      return apdu;
    }
    return null; // NOSONAR
  }

```

### ReturnNull
Return of `null`
in `src/main/java/org/eclipse/keyple/card/calypso/CmdCardReadRecords.java`
#### Snippet
```java
    ElementaryFile ef = getTransactionContext().getCard().getFileBySfi((byte) sfi);
    if (ef == null) {
      return null; // NOSONAR
    }
    return readMode == CmdCardReadRecords.ReadMode.ONE_RECORD
```

### ReturnNull
Return of `null`
in `src/main/java/org/eclipse/keyple/card/calypso/SymmetricCryptoTransactionManagerAdapter.java`
#### Snippet
```java
      // Plain mode.
      digestManager.updateSession(cardApdu);
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `src/main/java/org/eclipse/keyple/card/calypso/CardSecuritySettingAdapter.java`
#### Snippet
```java
      return map.get(kvc);
    } else {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `src/main/java/org/eclipse/keyple/card/calypso/CalypsoSamResourceProfileExtensionAdapter.java`
#### Snippet
```java

    if (!reader.isCardPresent()) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/eclipse/keyple/card/calypso/CalypsoSamResourceProfileExtensionAdapter.java`
#### Snippet
```java
    }

    return null;
  }
}
```

### ReturnNull
Return of `null`
in `src/main/java/org/eclipse/keyple/card/calypso/CmdSamCardGenerateKey.java`
#### Snippet
```java
   */
  byte[] getCipheredData() {
    return isSuccessful() ? getApduResponse().getDataOut() : null;
  }

```

### ReturnNull
Return of `null`
in `src/main/java/org/eclipse/keyple/card/calypso/CalypsoCardAdapter.java`
#### Snippet
```java
  public ElementaryFile getFileBySfi(byte sfi) {
    if (sfi == 0) {
      return null;
    }
    for (ElementaryFile ef : files) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/eclipse/keyple/card/calypso/CalypsoCardAdapter.java`
#### Snippet
```java
    String sfiHex = String.format(PATTERN_1_BYTE_HEX, sfi);
    logger.warn("EF with SFI {} is not found.", sfiHex);
    return null;
  }

```

### ReturnNull
Return of `null`
in `src/main/java/org/eclipse/keyple/card/calypso/CalypsoCardAdapter.java`
#### Snippet
```java
      return svDebitLogRecords.get(0);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `src/main/java/org/eclipse/keyple/card/calypso/CalypsoCardAdapter.java`
#### Snippet
```java
    String lidHex = String.format(PATTERN_2_BYTES_HEX, lid);
    logger.warn("EF with LID {} is not found.", lidHex);
    return null;
  }

```

### ReturnNull
Return of `null`
in `src/main/java/org/eclipse/keyple/card/calypso/CalypsoCardAdapter.java`
#### Snippet
```java
      return new SvLoadLogRecordAdapter(logRecord, 0);
    }
    return null;
  }

```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/eclipse/keyple/card/calypso/FileDataAdapter.java`
#### Snippet
```java
    if (content == null) {
      logger.warn("Record #{} is not set.", numRecord);
      return new byte[0];
    }
    if (dataOffset >= content.length) {
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/eclipse/keyple/card/calypso/FileDataAdapter.java`
#### Snippet
```java
    if (content == null) {
      logger.warn("Record #{} is not set.", numRecord);
      content = new byte[0];
    }
    return content;
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/eclipse/keyple/card/calypso/CmdCardCloseSecureSession.java`
#### Snippet
```java
    } else {
      // session abort case
      signatureLo = new byte[0];
    }
  }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/eclipse/keyple/card/calypso/CmdCardOpenSecureSession.java`
#### Snippet
```java
      case 5:
        isPreviousSessionRatified = true;
        recordData = new byte[0];
        break;
      case 34:
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/eclipse/keyple/card/calypso/CmdCardOpenSecureSession.java`
#### Snippet
```java
      case 7:
        isPreviousSessionRatified = false;
        recordData = new byte[0];
        break;
      case 36:
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/eclipse/keyple/card/calypso/CmdCardOpenSecureSession.java`
#### Snippet
```java
      case 4:
        isPreviousSessionRatified = true;
        recordData = new byte[0];
        break;
      case 33:
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/eclipse/keyple/card/calypso/CmdCardOpenSecureSession.java`
#### Snippet
```java
      case 6:
        isPreviousSessionRatified = false;
        recordData = new byte[0];
        break;
      case 35:
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/eclipse/keyple/card/calypso/CmdCardOpenSecureSession.java`
#### Snippet
```java
    isExtendedModeAllowed = true;
    this.writeAccessLevel = writeAccessLevel;
    createRev3((byte) (writeAccessLevel.ordinal() + 1), new byte[0]); // with no SAM challenge
    if (logger.isDebugEnabled()) {
      addSubName(", PREOPEN");
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/eclipse/keyple/card/calypso/CalypsoSamAdapter.java`
#### Snippet
```java
  @Override
  public byte[] getSelectApplicationResponse() {
    return new byte[0];
  }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/eclipse/keyple/card/calypso/CmdSamSvCheck.java`
#### Snippet
```java
                  p1,
                  p2,
                  new byte[0],
                  null))); // Case 3 without input data.
    }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/eclipse/keyple/card/calypso/CalypsoCardAdapter.java`
#### Snippet
```java
  @Override
  public byte[] getTraceabilityInformation() {
    return traceabilityInformation != null ? traceabilityInformation : new byte[0];
  }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/eclipse/keyple/card/calypso/CalypsoCardAdapter.java`
#### Snippet
```java
  public byte[] getSelectApplicationResponse() {
    if (selectApplicationResponse == null) {
      return new byte[0];
    }
    return selectApplicationResponse.getApdu();
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends SamCommand`
in `src/main/java/org/eclipse/keyple/card/calypso/SymmetricCryptoTransactionManagerAdapter.java`
#### Snippet
```java
   * @return An empty list if there is no command.
   */
  private static List<ApduRequestSpi> getApduRequests(List<SamCommand> commands) {
    List<ApduRequestSpi> apduRequests = new ArrayList<ApduRequestSpi>();
    if (commands != null) {
```

### BoundedWildcard
Can generalize to `? extends SamCommand`
in `src/main/java/org/eclipse/keyple/card/calypso/SamTransactionManagerAdapter.java`
#### Snippet
```java
   * @since 2.2.0
   */
  private List<ApduRequestSpi> getApduRequests(List<SamCommand> commands) {
    List<ApduRequestSpi> apduRequests = new ArrayList<ApduRequestSpi>();
    if (commands != null) {
```

### BoundedWildcard
Can generalize to `? extends ElementaryFile`
in `src/main/java/org/eclipse/keyple/card/calypso/CalypsoCardAdapter.java`
#### Snippet
```java
   * @param dest the destination (should be not null).
   */
  private static void copyFiles(Set<ElementaryFile> src, Set<ElementaryFile> dest) {
    dest.clear();
    for (ElementaryFile file : src) {
```

### BoundedWildcard
Can generalize to `? super ElementaryFile`
in `src/main/java/org/eclipse/keyple/card/calypso/CalypsoCardAdapter.java`
#### Snippet
```java
   * @param dest the destination (should be not null).
   */
  private static void copyFiles(Set<ElementaryFile> src, Set<ElementaryFile> dest) {
    dest.clear();
    for (ElementaryFile file : src) {
```

### BoundedWildcard
Can generalize to `? extends CardCommand`
in `src/main/java/org/eclipse/keyple/card/calypso/CardTransactionManagerAdapter.java`
#### Snippet
```java
   * @throws IllegalStateException if the anticipation process failed
   */
  private List<ApduResponseApi> buildAnticipatedResponses(List<CardCommand> cardCommands) {
    List<ApduResponseApi> apduResponses = new ArrayList<ApduResponseApi>();
    if (cardCommands != null) {
```

### BoundedWildcard
Can generalize to `? extends CardCommand`
in `src/main/java/org/eclipse/keyple/card/calypso/CardTransactionManagerAdapter.java`
#### Snippet
```java
   * @throws InconsistentDataException If the number of commands/responses does not match.
   */
  private void parseApduResponses(List<CardCommand> commands, List<ApduResponseApi> apduResponses)
      throws CardCommandException {

```

### BoundedWildcard
Can generalize to `? extends ApduResponseApi`
in `src/main/java/org/eclipse/keyple/card/calypso/CardTransactionManagerAdapter.java`
#### Snippet
```java
   * @throws InconsistentDataException If the number of commands/responses does not match.
   */
  private void parseApduResponses(List<CardCommand> commands, List<ApduResponseApi> apduResponses)
      throws CardCommandException {

```

### BoundedWildcard
Can generalize to `? extends CardCommand`
in `src/main/java/org/eclipse/keyple/card/calypso/CardTransactionManagerAdapter.java`
#### Snippet
```java
   *     commands to the card.
   */
  private boolean synchronizeCryptoServiceBeforeCardProcessing(List<CardCommand> commands) {
    for (CardCommand command : commands) {
      if (!command.synchronizeCryptoServiceBeforeCardProcessing()) {
```

### BoundedWildcard
Can generalize to `? extends ApduRequestSpi`
in `src/main/java/org/eclipse/keyple/card/calypso/CardTransactionManagerAdapter.java`
#### Snippet
```java
   */
  private void updateTerminalSessionMac(
      List<ApduRequestSpi> apduRequests,
      List<ApduResponseApi> apduResponses,
      int fromIndex,
```

### BoundedWildcard
Can generalize to `? extends ApduResponseApi`
in `src/main/java/org/eclipse/keyple/card/calypso/CardTransactionManagerAdapter.java`
#### Snippet
```java
  private void updateTerminalSessionMac(
      List<ApduRequestSpi> apduRequests,
      List<ApduResponseApi> apduResponses,
      int fromIndex,
      int toIndex) {
```

### BoundedWildcard
Can generalize to `? extends CardCommand`
in `src/main/java/org/eclipse/keyple/card/calypso/CardTransactionManagerAdapter.java`
#### Snippet
```java
   * @since 2.2.0
   */
  private static List<ApduRequestSpi> getApduRequests(List<CardCommand> commands) {
    List<ApduRequestSpi> apduRequests = new ArrayList<ApduRequestSpi>();
    if (commands != null) {
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
in `src/main/java/org/eclipse/keyple/card/calypso/CalypsoSamSelectionAdapter.java`
#### Snippet
```java
  public CalypsoSamSelection filterByProductType(CalypsoSam.ProductType productType) {

    Assert.getInstance().notNull(productType, "productType");

    this.productType = productType;
```

### IgnoreResultOfCall
Result of `Assert.notNull()` is ignored
in `src/main/java/org/eclipse/keyple/card/calypso/CalypsoSamSelectionAdapter.java`
#### Snippet
```java
  public CalypsoSamSelection filterBySerialNumber(String serialNumberRegex) {

    Assert.getInstance().notNull(serialNumberRegex, "serialNumberRegex");

    try {
```

### IgnoreResultOfCall
Result of `Assert.isHexString()` is ignored
in `src/main/java/org/eclipse/keyple/card/calypso/CalypsoSamSelectionAdapter.java`
#### Snippet
```java
            unlockData.length() == 16 || unlockData.length() == 32,
            "unlock data length == 16 or 32")
        .isHexString(unlockData, "unlockData");
    this.unlockCommand = new CmdSamUnlock(productType, HexUtil.toByteArray(unlockData));
    return this;
```

### IgnoreResultOfCall
Result of `Assert.isInRange()` is ignored
in `src/main/java/org/eclipse/keyple/card/calypso/ContextSettingAdapter.java`
#### Snippet
```java
  @Override
  public ContextSetting setContactReaderPayloadCapacity(int payloadCapacity) {
    Assert.getInstance().isInRange(payloadCapacity, 0, 255, "payloadCapacity");
    this.contactReaderPayloadCapacity = payloadCapacity;
    return this;
```

### IgnoreResultOfCall
Result of `Assert.isInRange()` is ignored
in `src/main/java/org/eclipse/keyple/card/calypso/CalypsoCardSelectionAdapter.java`
#### Snippet
```java
    Assert.getInstance()
        .isInRange((int) sfi, CalypsoCardConstant.SFI_MIN, CalypsoCardConstant.SFI_MAX, "sfi")
        .isInRange(
            recordNumber,
            CalypsoCardConstant.NB_REC_MIN,
```

### IgnoreResultOfCall
Result of `Assert.notNull()` is ignored
in `src/main/java/org/eclipse/keyple/card/calypso/CalypsoCardSelectionAdapter.java`
#### Snippet
```java
  public CalypsoCardSelection setFileControlInformation(
      FileControlInformation fileControlInformation) {
    Assert.getInstance().notNull(fileControlInformation, "fileControlInformation");
    if (fileControlInformation == FileControlInformation.FCI) {
      cardSelector.setFileControlInformation(CardSelectorSpi.FileControlInformation.FCI);
```

### IgnoreResultOfCall
Result of `Assert.isInRange()` is ignored
in `src/main/java/org/eclipse/keyple/card/calypso/CalypsoCardSelectionAdapter.java`
#### Snippet
```java
    Assert.getInstance()
        .isInRange((int) sfi, CalypsoCardConstant.SFI_MIN, CalypsoCardConstant.SFI_MAX, "sfi")
        .isInRange(
            nbCountersToRead,
            0,
```

### IgnoreResultOfCall
Result of `Assert.notNull()` is ignored
in `src/main/java/org/eclipse/keyple/card/calypso/CalypsoCardSelectionAdapter.java`
#### Snippet
```java
  @Override
  public CalypsoCardSelection setFileOccurrence(FileOccurrence fileOccurrence) {
    Assert.getInstance().notNull(fileOccurrence, "fileOccurrence");
    switch (fileOccurrence) {
      case FIRST:
```

### IgnoreResultOfCall
Result of `Assert.notNull()` is ignored
in `src/main/java/org/eclipse/keyple/card/calypso/CalypsoCardSelectionAdapter.java`
#### Snippet
```java
      throw new IllegalStateException("'Pre-Open Secure Session' command already prepared");
    }
    Assert.getInstance().notNull(writeAccessLevel, "writeAccessLevel");
    commands.add(new CmdCardOpenSecureSession(writeAccessLevel));
    isPreOpenPrepared = true;
```

### IgnoreResultOfCall
Result of `Assert.isHexString()` is ignored
in `src/main/java/org/eclipse/keyple/card/calypso/CalypsoCardSelectionAdapter.java`
#### Snippet
```java
  @Override
  public CalypsoCardSelection filterByDfName(String aid) {
    Assert.getInstance().isHexString(aid, "aid format");
    filterByDfName(HexUtil.toByteArray(aid));
    return this;
```

### IgnoreResultOfCall
Result of `Assert.greaterOrEqual()` is ignored
in `src/main/java/org/eclipse/keyple/card/calypso/CalypsoCardSelectionAdapter.java`
#### Snippet
```java
        .isInRange(
            offset, CalypsoCardConstant.OFFSET_MIN, CalypsoCardConstant.OFFSET_BINARY_MAX, "offset")
        .greaterOrEqual(nbBytesToRead, 1, "nbBytesToRead");
    if (sfi > 0 && offset > 255) { // FFh
      // Tips to select the file: add a "Read Binary" command (read one byte at offset 0).
```

### IgnoreResultOfCall
Result of `Assert.notEmpty()` is ignored
in `src/main/java/org/eclipse/keyple/card/calypso/CalypsoCardSelectionAdapter.java`
#### Snippet
```java
  @Override
  public CalypsoCardSelection filterByPowerOnData(String powerOnDataRegex) {
    Assert.getInstance().notEmpty(powerOnDataRegex, "powerOnDataRegex");
    try {
      Pattern.compile(powerOnDataRegex);
```

### IgnoreResultOfCall
Result of `Assert.isInRange()` is ignored
in `src/main/java/org/eclipse/keyple/card/calypso/CalypsoCardSelectionAdapter.java`
#### Snippet
```java
  @Deprecated
  public CalypsoCardSelection addSuccessfulStatusWord(int statusWord) {
    Assert.getInstance().isInRange(statusWord, 0, 0xFFFF, "statusWord");
    cardSelector.addSuccessfulStatusWord(statusWord);
    return null;
```

### IgnoreResultOfCall
Result of `Assert.notNull()` is ignored
in `src/main/java/org/eclipse/keyple/card/calypso/CalypsoCardSelectionAdapter.java`
#### Snippet
```java
  @Override
  public CalypsoCardSelection prepareGetData(GetDataTag tag) {
    Assert.getInstance().notNull(tag, "tag");
    switch (tag) {
      case FCI_FOR_CURRENT_DF:
```

### IgnoreResultOfCall
Result of `Assert.isInRange()` is ignored
in `src/main/java/org/eclipse/keyple/card/calypso/CalypsoCardSelectionAdapter.java`
#### Snippet
```java
    Assert.getInstance()
        .notNull(aid, "aid")
        .isInRange(aid.length, AID_MIN_LENGTH, AID_MAX_LENGTH, "aid");
    cardSelector.filterByDfName(aid);
    return this;
```

### IgnoreResultOfCall
Result of `Assert.notNull()` is ignored
in `src/main/java/org/eclipse/keyple/card/calypso/CalypsoCardSelectionAdapter.java`
#### Snippet
```java
  @Override
  public CalypsoCardSelection prepareSelectFile(SelectFileControl selectControl) {
    Assert.getInstance().notNull(selectControl, "selectControl");
    commands.add(new CmdCardSelectFile(CalypsoCardClass.ISO, selectControl));
    return this;
```

### IgnoreResultOfCall
Result of `Assert.notEmpty()` is ignored
in `src/main/java/org/eclipse/keyple/card/calypso/CalypsoCardSelectionAdapter.java`
#### Snippet
```java
  @Override
  public CalypsoCardSelection filterByCardProtocol(String cardProtocol) {
    Assert.getInstance().notEmpty(cardProtocol, "cardProtocol");
    cardSelector.filterByCardProtocol(cardProtocol);
    return this;
```

### IgnoreResultOfCall
Result of `Assert.isEqual()` is ignored
in `src/main/java/org/eclipse/keyple/card/calypso/CalypsoCardSelectionAdapter.java`
#### Snippet
```java
  @Deprecated
  public CalypsoCardSelection prepareSelectFile(byte[] lid) {
    Assert.getInstance().notNull(lid, "lid").isEqual(lid.length, 2, "lid length");
    return prepareSelectFile((short) ByteArrayUtil.extractInt(lid, 0, 2, false));
  }
```

### IgnoreResultOfCall
Result of `Assert.greaterOrEqual()` is ignored
in `src/main/java/org/eclipse/keyple/card/calypso/FileDataAdapter.java`
#### Snippet
```java
  public Integer getContentAsCounterValue(int numCounter) {

    Assert.getInstance().greaterOrEqual(numCounter, 1, "numCounter");

    byte[] rec1 = records.get(1);
```

### IgnoreResultOfCall
Result of `Assert.greaterOrEqual()` is ignored
in `src/main/java/org/eclipse/keyple/card/calypso/FileDataAdapter.java`
#### Snippet
```java
    Assert.getInstance()
        .greaterOrEqual(dataOffset, 0, "dataOffset")
        .greaterOrEqual(dataLength, 1, "dataLength");

    byte[] content = records.get(numRecord);
```

### IgnoreResultOfCall
Result of `Assert.notNull()` is ignored
in `src/main/java/org/eclipse/keyple/card/calypso/DirectoryHeaderAdapter.java`
#### Snippet
```java
  public byte getKvc(WriteAccessLevel writeAccessLevel) {

    Assert.getInstance().notNull(writeAccessLevel, LEVEL_STR);

    return kvc.get(writeAccessLevel);
```

### IgnoreResultOfCall
Result of `Assert.notNull()` is ignored
in `src/main/java/org/eclipse/keyple/card/calypso/DirectoryHeaderAdapter.java`
#### Snippet
```java
  public byte getKif(WriteAccessLevel writeAccessLevel) {

    Assert.getInstance().notNull(writeAccessLevel, LEVEL_STR);

    return kif.get(writeAccessLevel);
```

### IgnoreResultOfCall
Result of `Assert.notNull()` is ignored
in `src/main/java/org/eclipse/keyple/card/calypso/SymmetricCryptoSecuritySettingAdapter.java`
#### Snippet
```java
  public SymmetricCryptoSecuritySetting assignKif(
      WriteAccessLevel writeAccessLevel, byte kvc, byte kif) {
    Assert.getInstance().notNull(writeAccessLevel, WRITE_ACCESS_LEVEL);
    Map<Byte, Byte> map = kifMap.get(writeAccessLevel);
    if (map == null) {
```

### IgnoreResultOfCall
Result of `Assert.notNull()` is ignored
in `src/main/java/org/eclipse/keyple/card/calypso/SymmetricCryptoSecuritySettingAdapter.java`
#### Snippet
```java
   */
  Byte getKif(WriteAccessLevel writeAccessLevel, byte kvc) {
    Assert.getInstance().notNull(writeAccessLevel, WRITE_ACCESS_LEVEL);
    Map<Byte, Byte> map = kifMap.get(writeAccessLevel);
    if (map != null) {
```

### IgnoreResultOfCall
Result of `Assert.notNull()` is ignored
in `src/main/java/org/eclipse/keyple/card/calypso/SymmetricCryptoSecuritySettingAdapter.java`
#### Snippet
```java
  public SymmetricCryptoSecuritySetting assignDefaultKvc(
      WriteAccessLevel writeAccessLevel, byte kvc) {
    Assert.getInstance().notNull(writeAccessLevel, WRITE_ACCESS_LEVEL);
    defaultKvcMap.put(writeAccessLevel, kvc);
    return this;
```

### IgnoreResultOfCall
Result of `Assert.notNull()` is ignored
in `src/main/java/org/eclipse/keyple/card/calypso/SymmetricCryptoSecuritySettingAdapter.java`
#### Snippet
```java
  public SymmetricCryptoSecuritySetting assignDefaultKif(
      WriteAccessLevel writeAccessLevel, byte kif) {
    Assert.getInstance().notNull(writeAccessLevel, WRITE_ACCESS_LEVEL);
    defaultKifMap.put(writeAccessLevel, kif);
    return this;
```

### IgnoreResultOfCall
Result of `Assert.isTrue()` is ignored
in `src/main/java/org/eclipse/keyple/card/calypso/SymmetricCryptoTransactionManagerAdapter.java`
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
in `src/main/java/org/eclipse/keyple/card/calypso/SymmetricCryptoTransactionManagerAdapter.java`
#### Snippet
```java
                      - (dataAdapter.isPartialSamSerialNumber() ? 7 * 8 : 8 * 8))
                  + "]")
          .isTrue(
              dataAdapter.getKeyDiversifier() == null
                  || (dataAdapter.getKeyDiversifier().length >= 1
```

### IgnoreResultOfCall
Result of `Assert.isTrue()` is ignored
in `src/main/java/org/eclipse/keyple/card/calypso/SymmetricCryptoTransactionManagerAdapter.java`
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
in `src/main/java/org/eclipse/keyple/card/calypso/SymmetricCryptoTransactionManagerAdapter.java`
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
in `src/main/java/org/eclipse/keyple/card/calypso/SymmetricCryptoTransactionManagerAdapter.java`
#### Snippet
```java
        Assert.getInstance()
            // .notNull(securitySetting, "security settings")
            .notNull(tmpCardSecuritySetting.getSamRevocationServiceSpi(), "SAM revocation service");

        // Extract the SAM serial number and the counter value from the data.
```

### IgnoreResultOfCall
Result of `Assert.notNull()` is ignored
in `src/main/java/org/eclipse/keyple/card/calypso/CardSecuritySettingAdapter.java`
#### Snippet
```java
  public CardSecuritySettingAdapter assignKif(
      WriteAccessLevel writeAccessLevel, byte kvc, byte kif) {
    Assert.getInstance().notNull(writeAccessLevel, WRITE_ACCESS_LEVEL);
    Map<Byte, Byte> map = kifMap.get(writeAccessLevel);
    if (map == null) {
```

### IgnoreResultOfCall
Result of `Assert.notNull()` is ignored
in `src/main/java/org/eclipse/keyple/card/calypso/CardSecuritySettingAdapter.java`
#### Snippet
```java
  @Override
  public CardSecuritySettingAdapter assignDefaultKvc(WriteAccessLevel writeAccessLevel, byte kvc) {
    Assert.getInstance().notNull(writeAccessLevel, WRITE_ACCESS_LEVEL);
    defaultKvcMap.put(writeAccessLevel, kvc);
    return this;
```

### IgnoreResultOfCall
Result of `Assert.notNull()` is ignored
in `src/main/java/org/eclipse/keyple/card/calypso/CardSecuritySettingAdapter.java`
#### Snippet
```java
   */
  Byte getKif(WriteAccessLevel writeAccessLevel, byte kvc) {
    Assert.getInstance().notNull(writeAccessLevel, WRITE_ACCESS_LEVEL);
    Map<Byte, Byte> map = kifMap.get(writeAccessLevel);
    if (map != null) {
```

### IgnoreResultOfCall
Result of `Assert.notNull()` is ignored
in `src/main/java/org/eclipse/keyple/card/calypso/CardSecuritySettingAdapter.java`
#### Snippet
```java
  @Override
  public CardSecuritySettingAdapter assignDefaultKif(WriteAccessLevel writeAccessLevel, byte kif) {
    Assert.getInstance().notNull(writeAccessLevel, WRITE_ACCESS_LEVEL);
    defaultKifMap.put(writeAccessLevel, kif);
    return this;
```

### IgnoreResultOfCall
Result of `Assert.notNull()` is ignored
in `src/main/java/org/eclipse/keyple/card/calypso/CommonSecuritySettingAdapter.java`
#### Snippet
```java
  @Override
  public final S setSamRevocationService(SamRevocationServiceSpi service) {
    Assert.getInstance().notNull(service, "service");
    this.samRevocationServiceSpi = service;
    return currentInstance;
```

### IgnoreResultOfCall
Result of `Assert.isTrue()` is ignored
in `src/main/java/org/eclipse/keyple/card/calypso/CommonSecuritySettingAdapter.java`
#### Snippet
```java
        .notNull(calypsoSam, "calypsoSam")
        .notNull(calypsoSam.getProductType(), "productType")
        .isTrue(calypsoSam.getProductType() != CalypsoSam.ProductType.UNKNOWN, "productType");

    if (!(samReader instanceof ProxyReaderApi)) {
```

### IgnoreResultOfCall
Result of `Assert.isTrue()` is ignored
in `src/main/java/org/eclipse/keyple/card/calypso/CalypsoExtensionService.java`
#### Snippet
```java
        .isTrue(
            calypsoSam.getProductType() != CalypsoSam.ProductType.UNKNOWN, "product type is known")
        .isTrue(!isSecureMode || samSecuritySetting != null, "security setting is not null");

    if (!(samReader instanceof ProxyReaderApi)) {
```

### IgnoreResultOfCall
Result of `Assert.isTrue()` is ignored
in `src/main/java/org/eclipse/keyple/card/calypso/CalypsoExtensionService.java`
#### Snippet
```java
            calypsoCard.getProductType() != CalypsoCard.ProductType.UNKNOWN,
            "product type is known")
        .isTrue(!isSecureMode || cardSecuritySetting != null, "security setting is not null");

    if (!(cardReader instanceof ProxyReaderApi)) {
```

### IgnoreResultOfCall
Result of `Assert.notNull()` is ignored
in `src/main/java/org/eclipse/keyple/card/calypso/CalypsoExtensionService.java`
#### Snippet
```java
  public CardResourceProfileExtension createSamResourceProfileExtension(
      CalypsoSamSelection calypsoSamSelection) {
    Assert.getInstance().notNull(calypsoSamSelection, "calypsoSamSelection");
    return new CalypsoSamResourceProfileExtensionAdapter(calypsoSamSelection);
  }
```

### IgnoreResultOfCall
Result of `Assert.isTrue()` is ignored
in `src/main/java/org/eclipse/keyple/card/calypso/SamTransactionManagerAdapter.java`
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
in `src/main/java/org/eclipse/keyple/card/calypso/SamTransactionManagerAdapter.java`
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
in `src/main/java/org/eclipse/keyple/card/calypso/SamTransactionManagerAdapter.java`
#### Snippet
```java
        Assert.getInstance()
            .notNull(securitySetting, "security settings")
            .notNull(securitySetting.getSamRevocationServiceSpi(), "SAM revocation service");

        // Extract the SAM serial number and the counter value from the data.
```

### IgnoreResultOfCall
Result of `Assert.isTrue()` is ignored
in `src/main/java/org/eclipse/keyple/card/calypso/SamTransactionManagerAdapter.java`
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
in `src/main/java/org/eclipse/keyple/card/calypso/SamTransactionManagerAdapter.java`
#### Snippet
```java
                      - (dataAdapter.isPartialSamSerialNumber() ? 7 * 8 : 8 * 8))
                  + "]")
          .isTrue(
              dataAdapter.getKeyDiversifier() == null
                  || (dataAdapter.getKeyDiversifier().length >= 1
```

### IgnoreResultOfCall
Result of `Assert.isEqual()` is ignored
in `src/main/java/org/eclipse/keyple/card/calypso/CmdCardSelectFile.java`
#### Snippet
```java
      throw new IllegalStateException("Proprietary information: tag not found.");
    }
    Assert.getInstance().isEqual(proprietaryInformation.length, 23, "proprietaryInformation");
    return proprietaryInformation;
  }
```

### IgnoreResultOfCall
Result of `Assert.isInRange()` is ignored
in `src/main/java/org/eclipse/keyple/card/calypso/CardTransactionManagerAdapter.java`
#### Snippet
```java
              OFFSET)
          .notNull(dataAdapter.getSearchData(), "searchData")
          .isInRange(
              dataAdapter.getSearchData().length,
              CalypsoCardConstant.DATA_LENGTH_MIN,
```

### IgnoreResultOfCall
Result of `Assert.isInRange()` is ignored
in `src/main/java/org/eclipse/keyple/card/calypso/CardTransactionManagerAdapter.java`
#### Snippet
```java
      if (dataAdapter.getMask() != null) {
        Assert.getInstance()
            .isInRange(
                dataAdapter.getMask().length,
                CalypsoCardConstant.DATA_LENGTH_MIN,
```

### IgnoreResultOfCall
Result of `Assert.isInRange()` is ignored
in `src/main/java/org/eclipse/keyple/card/calypso/CardTransactionManagerAdapter.java`
#### Snippet
```java
      Assert.getInstance()
          .isInRange((int) sfi, CalypsoCardConstant.SFI_MIN, CalypsoCardConstant.SFI_MAX, "sfi")
          .isInRange(
              counterNumberToIncDecValueMap.size(),
              CalypsoCardConstant.NB_CNT_MIN,
```

### IgnoreResultOfCall
Result of `Assert.isInRange()` is ignored
in `src/main/java/org/eclipse/keyple/card/calypso/CardTransactionManagerAdapter.java`
#### Snippet
```java
                cardPayloadCapacity / 3,
                "counterNumberToIncDecValueMapKey")
            .isInRange(
                entry.getValue(),
                CalypsoCardConstant.CNT_VALUE_MIN,
```

### IgnoreResultOfCall
Result of `Assert.isInRange()` is ignored
in `src/main/java/org/eclipse/keyple/card/calypso/CardTransactionManagerAdapter.java`
#### Snippet
```java
      Assert.getInstance()
          .isInRange((int) sfi, CalypsoCardConstant.SFI_MIN, CalypsoCardConstant.SFI_MAX, "sfi")
          .isInRange(
              recordNumber,
              CalypsoCardConstant.NB_REC_MIN,
```

### IgnoreResultOfCall
Result of `Assert.isInRange()` is ignored
in `src/main/java/org/eclipse/keyple/card/calypso/CardTransactionManagerAdapter.java`
#### Snippet
```java
              RECORD_NUMBER)
          .notNull(recordData, MSG_RECORD_DATA)
          .isInRange(recordData.length, 0, cardPayloadCapacity, MSG_RECORD_DATA_LENGTH);
      CmdCardWriteRecord command =
          new CmdCardWriteRecord(
```

### IgnoreResultOfCall
Result of `Assert.notNull()` is ignored
in `src/main/java/org/eclipse/keyple/card/calypso/CardTransactionManagerAdapter.java`
#### Snippet
```java
  public CardTransactionManager prepareSelectFile(SelectFileControl selectFileControl) {
    try {
      Assert.getInstance().notNull(selectFileControl, "selectFileControl");
      _cardCommands.add(
          new CmdCardSelectFile(_transactionContext, getCommandContext(), selectFileControl));
```

### IgnoreResultOfCall
Result of `Assert.isInRange()` is ignored
in `src/main/java/org/eclipse/keyple/card/calypso/CardTransactionManagerAdapter.java`
#### Snippet
```java
              RECORD_NUMBER)
          .notNull(recordData, MSG_RECORD_DATA)
          .isInRange(recordData.length, 0, cardPayloadCapacity, MSG_RECORD_DATA_LENGTH);
      CmdCardUpdateRecord command =
          new CmdCardUpdateRecord(
```

### IgnoreResultOfCall
Result of `Assert.isInRange()` is ignored
in `src/main/java/org/eclipse/keyple/card/calypso/CardTransactionManagerAdapter.java`
#### Snippet
```java
    }

    Assert.getInstance().isInRange(keyIndex, 1, 3, "keyIndex");

    finalizeSvCommandIfNeeded();
```

### IgnoreResultOfCall
Result of `Assert.isEqual()` is ignored
in `src/main/java/org/eclipse/keyple/card/calypso/CardTransactionManagerAdapter.java`
#### Snippet
```java
      Assert.getInstance()
          .notNull(pin, "pin")
          .isEqual(pin.length, CalypsoCardConstant.PIN_LENGTH, "PIN length");

      if (!card.isPinFeatureAvailable()) {
```

### IgnoreResultOfCall
Result of `Assert.isInRange()` is ignored
in `src/main/java/org/eclipse/keyple/card/calypso/CardTransactionManagerAdapter.java`
#### Snippet
```java
          .isInRange((int) sfi, CalypsoCardConstant.SFI_MIN, CalypsoCardConstant.SFI_MAX, "sfi")
          .notNull(recordData, MSG_RECORD_DATA)
          .isInRange(recordData.length, 0, cardPayloadCapacity, MSG_RECORD_DATA_LENGTH);
      CmdCardAppendRecord command =
          new CmdCardAppendRecord(_transactionContext, getCommandContext(), sfi, recordData);
```

### IgnoreResultOfCall
Result of `Assert.isInRange()` is ignored
in `src/main/java/org/eclipse/keyple/card/calypso/CardTransactionManagerAdapter.java`
#### Snippet
```java
              toRecordNumber, fromRecordNumber, CalypsoCardConstant.NB_REC_MAX, "toRecordNumber")
          .isInRange(offset, CalypsoCardConstant.OFFSET_MIN, CalypsoCardConstant.OFFSET_MAX, OFFSET)
          .isInRange(
              nbBytesToRead,
              CalypsoCardConstant.DATA_LENGTH_MIN,
```

### IgnoreResultOfCall
Result of `Assert.isInRange()` is ignored
in `src/main/java/org/eclipse/keyple/card/calypso/CardTransactionManagerAdapter.java`
#### Snippet
```java
              cardPayloadCapacity / 3,
              "counterNumber")
          .isInRange(
              incDecValue,
              CalypsoCardConstant.CNT_VALUE_MIN,
```

### IgnoreResultOfCall
Result of `Assert.notNull()` is ignored
in `src/main/java/org/eclipse/keyple/card/calypso/CardTransactionManagerAdapter.java`
#### Snippet
```java
  public CardTransactionManager prepareGetData(GetDataTag tag) {
    try {
      Assert.getInstance().notNull(tag, "tag");
      switch (tag) {
        case FCI_FOR_CURRENT_DF:
```

### IgnoreResultOfCall
Result of `Assert.isEqual()` is ignored
in `src/main/java/org/eclipse/keyple/card/calypso/CardTransactionManagerAdapter.java`
#### Snippet
```java
      Assert.getInstance()
          .notNull(newPin, "newPin")
          .isEqual(newPin.length, CalypsoCardConstant.PIN_LENGTH, "PIN length");

      if (!card.isPinFeatureAvailable()) {
```

### IgnoreResultOfCall
Result of `Assert.greaterOrEqual()` is ignored
in `src/main/java/org/eclipse/keyple/card/calypso/CardTransactionManagerAdapter.java`
#### Snippet
```java
          .isInRange(
              offset, CalypsoCardConstant.OFFSET_MIN, CalypsoCardConstant.OFFSET_BINARY_MAX, OFFSET)
          .greaterOrEqual(nbBytesToRead, 1, "nbBytesToRead");

      if (sfi > 0 && offset > 255) { // FFh
```

### IgnoreResultOfCall
Result of `Assert.isEqual()` is ignored
in `src/main/java/org/eclipse/keyple/card/calypso/CardTransactionManagerAdapter.java`
#### Snippet
```java
      Assert.getInstance()
          .notNull(newPin, "newPin")
          .isEqual(newPin.length, CalypsoCardConstant.PIN_LENGTH, "PIN length");
      if (!card.isPinFeatureAvailable()) {
        throw new UnsupportedOperationException(MSG_PIN_NOT_AVAILABLE);
```

### IgnoreResultOfCall
Result of `Assert.notNull()` is ignored
in `src/main/java/org/eclipse/keyple/card/calypso/CardTransactionManagerAdapter.java`
#### Snippet
```java
    try {
      checkApiLevelCompliance(true);
      Assert.getInstance().notNull(writeAccessLevel, "writeAccessLevel");
      checkSymmetricCryptoTransactionManager();
      checkNoSecureSession();
```

### IgnoreResultOfCall
Result of `Assert.notNull()` is ignored
in `src/main/java/org/eclipse/keyple/card/calypso/CardTransactionManagerAdapter.java`
#### Snippet
```java
  public CardTransactionManager prepareSvGet(SvOperation svOperation, SvAction svAction) {
    try {
      Assert.getInstance().notNull(svOperation, "svOperation").notNull(svAction, "svAction");

      if (!card.isSvFeatureAvailable()) {
```

### IgnoreResultOfCall
Result of `Assert.isEqual()` is ignored
in `src/main/java/org/eclipse/keyple/card/calypso/CardTransactionManagerAdapter.java`
#### Snippet
```java
          .isEqual(date.length, 2, "date")
          .isEqual(time.length, 2, "time")
          .isEqual(free.length, 2, "free");

      checkSvModifyingCommandPreconditions(SvOperation.RELOAD);
```

### IgnoreResultOfCall
Result of `Assert.notEmpty()` is ignored
in `src/main/java/org/eclipse/keyple/card/calypso/CardTransactionManagerAdapter.java`
#### Snippet
```java
          .isInRange(
              offset, CalypsoCardConstant.OFFSET_MIN, CalypsoCardConstant.OFFSET_BINARY_MAX, OFFSET)
          .notEmpty(data, "data");

      if (sfi > 0 && offset > 255) { // FFh
```

### IgnoreResultOfCall
Result of `Assert.isEqual()` is ignored
in `src/main/java/org/eclipse/keyple/card/calypso/CardTransactionManagerAdapter.java`
#### Snippet
```java
      Assert.getInstance()
          .notNull(pin, "pin")
          .isEqual(pin.length, CalypsoCardConstant.PIN_LENGTH, "PIN length");
      if (!card.isPinFeatureAvailable()) {
        throw new UnsupportedOperationException(MSG_PIN_NOT_AVAILABLE);
```

### IgnoreResultOfCall
Result of `Assert.isEqual()` is ignored
in `src/main/java/org/eclipse/keyple/card/calypso/CardTransactionManagerAdapter.java`
#### Snippet
```java
          .notNull(time, "time")
          .isEqual(date.length, 2, "date")
          .isEqual(time.length, 2, "time");

      checkSvModifyingCommandPreconditions(SvOperation.DEBIT);
```

### IgnoreResultOfCall
Result of `Assert.isInRange()` is ignored
in `src/main/java/org/eclipse/keyple/card/calypso/CardTransactionManagerAdapter.java`
#### Snippet
```java
      }
      checkNoSecureSession();
      Assert.getInstance().isInRange(keyIndex, 1, 3, "keyIndex");
      // CL-KEY-CHANGE.1
      _cardCommands.add(new CmdCardGetChallenge(_transactionContext, getCommandContext()));
```

### IgnoreResultOfCall
Result of `Assert.isInRange()` is ignored
in `src/main/java/org/eclipse/keyple/card/calypso/CardTransactionManagerAdapter.java`
#### Snippet
```java
          .isInRange(
              toRecordNumber, fromRecordNumber, CalypsoCardConstant.NB_REC_MAX, "toRecordNumber")
          .isInRange(recordSize, 0, cardPayloadCapacity, "recordSize");

      if (toRecordNumber == fromRecordNumber
```

### IgnoreResultOfCall
Result of `Assert.isEqual()` is ignored
in `src/main/java/org/eclipse/keyple/card/calypso/CardTransactionManagerAdapter.java`
#### Snippet
```java
  @Deprecated
  public CardTransactionManager prepareSelectFile(byte[] lid) {
    Assert.getInstance().notNull(lid, "lid").isEqual(lid.length, 2, "lid length");
    return prepareSelectFile((short) ByteArrayUtil.extractInt(lid, 0, 2, false));
  }
```

