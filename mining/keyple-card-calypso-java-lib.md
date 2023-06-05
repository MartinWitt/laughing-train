# keyple-card-calypso-java-lib 
 
# Bad smells
I found 167 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| IgnoreResultOfCall | 72 | false |
| Deprecation | 42 | false |
| DeprecatedIsStillUsed | 30 | false |
| DuplicatedCode | 11 | false |
| FinalMethodInFinalClass | 4 | false |
| UNCHECKED_WARNING | 3 | false |
| UnstableApiUsage | 2 | false |
| UNUSED_IMPORT | 1 | false |
| JavadocDeclaration | 1 | false |
| ReplaceCallWithBinaryOperator | 1 | false |
## RuleId[id=FinalMethodInFinalClass]
### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/org/eclipse/keyple/card/calypso/SamTransactionManagerAdapter.java`
#### Snippet
```java
   */
  @Override
  public final SamTransactionManager prepareComputeSignature(CommonSignatureComputationData data) {

    if (data instanceof BasicSignatureComputationDataAdapter) {
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/org/eclipse/keyple/card/calypso/SamTransactionManagerAdapter.java`
#### Snippet
```java
   */
  @Override
  public final CalypsoSamAdapter getCalypsoSam() {
    return sam;
  }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/org/eclipse/keyple/card/calypso/SamTransactionManagerAdapter.java`
#### Snippet
```java
   */
  @Override
  public final CardReader getSamReader() {
    return (CardReader) samReader;
  }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/org/eclipse/keyple/card/calypso/SamTransactionManagerAdapter.java`
#### Snippet
```java
   */
  @Override
  public final SamTransactionManager prepareVerifySignature(CommonSignatureVerificationData data) {

    if (data instanceof BasicSignatureVerificationDataAdapter) {
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `src/main/java/org/eclipse/keyple/card/calypso/CardSecuritySettingAdapter.java`
#### Snippet
```java
    Assert.getInstance().notNull(writeAccessLevel, WRITE_ACCESS_LEVEL);
    Map<Byte, Byte> map = kifMap.get(writeAccessLevel);
    if (map == null) {
      map = new HashMap<Byte, Byte>();
      kifMap.put(writeAccessLevel, map);
    }
    map.put(kvc, kif);
    return this;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/eclipse/keyple/card/calypso/CmdCardGetDataFci.java`
#### Snippet
```java
super.setApduResponseAndCheckStatus(apduResponse);

    Map<Integer, byte[]> tags;

    /* check the command status to determine if the DF has been invalidated */
    // CL-INV-STATUS.1
    if (getApduResponse().getStatusWord() == 0x6283) {
      logger.debug(
          "The response to the select application command status word indicates that the DF has been invalidated.");
      isDfInvalidated = true;
    }

    /* parse the raw data with the help of the TLV class */
    try {
      /* init TLV object with the raw data and extract the FCI Template */
      byte[] responseData = getApduResponse().getDataOut();
      // CL-SEL-TLVDATA.1
      // CL-TLV-VAR.1
      // CL-TLV-ORDER.1
      tags = BerTlvUtil.parseSimple(responseData, true);

      dfName = tags.get(TAG_DF_NAME);
      if (dfName == null) {
        logger.error("DF name tag (84h) not found.");
        return;
      }
      if (dfName.length < 5 || dfName.length > 16) {
        logger.error("Invalid DF name length: {}. Should be between 5 and 16.", dfName.length);
        return;
      }
      if (logger.isDebugEnabled()) {
        logger.debug("DF name = {}", HexUtil.toHex(dfName));
      }

      applicationSN = tags.get(TAG_APPLICATION_SERIAL_NUMBER);
      if (applicationSN == null) {
        logger.error("Serial Number tag (C7h) not found.");
        return;
      }
      // CL-SEL-CSN.1
      if (applicationSN.length != 8) {
        logger.error(
            "Invalid application serial number length: {}. Should be 8.", applicationSN.length);
        return;
      }
      if (logger.isDebugEnabled()) {
        logger.debug("Application Serial Number = {}", HexUtil.toHex(applicationSN));
      }

      discretionaryData = tags.get(TAG_DISCRETIONARY_DATA);
      if (discretionaryData == null) {
        logger.error("Discretionary data tag (53h) not found.");
        return;
      }
      if (discretionaryData.length < 7) {
        logger.error("Invalid startup info length: {}. Should be >= 7.", discretionaryData.length);
        return;
      }
      if (logger.isDebugEnabled()) {
        logger.debug("Discretionary Data = {}", HexUtil.toHex(discretionaryData));
      }

      /* all 3 main fields were retrieved */
      isValidCalypsoFCI = true;

    } catch (Exception e) {
      /* Silently ignore problems decoding TLV structure. Just log. */
      logger.debug("Error while parsing the FCI BER-TLV data structure ({})", e.getMessage());
    }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/eclipse/keyple/card/calypso/CmdCardOpenSecureSession.java`
#### Snippet
```java
    switch (card.getProductType()) {
      case PRIME_REVISION_1:
        parseRev10(dataOut);
        break;
      case PRIME_REVISION_2:
        parseRev24(dataOut);
        break;
      default:
        parseRev3(dataOut);
    }
    // CL-CSS-INFORAT.1
    card.setDfRatified(isPreviousSessionRatified);
    // CL-CSS-INFOTCNT.1
    card.setTransactionCounter(ByteArrayUtil.extractInt(challengeTransactionCounter, 0, 3, false));
    if (recordData.length > 0) {
      card.setContent((byte) sfi, recordNumber, recordData);
    }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/eclipse/keyple/card/calypso/CmdCardSvDebitOrUndebit.java`
#### Snippet
```java
    CalypsoCardAdapter calypsoCard = getTransactionContext().getCard();
    calypsoCard.setSvOperationSignature(apduResponse.getDataOut());
    updateCalypsoCardSvHistory(calypsoCard);
    updateTerminalSessionMacIfNeeded();
    if (!getCommandContext().isSecureSessionOpen()) {
      try {
        if (!getTransactionContext()
            .getSymmetricCryptoTransactionManagerSpi()
            .isCardSvMacValid(getTransactionContext().getCard().getSvOperationSignature())) {
          throw new InvalidCardSignatureException(MSG_INVALID_CARD_SESSION_MAC);
        }
      } catch (SymmetricCryptoIOException e) {
        throw new CardSignatureNotVerifiableException(MSG_CARD_SV_MAC_NOT_VERIFIABLE, e);
      } catch (SymmetricCryptoException e) {
        throw (RuntimeException) e.getCause();
      }
    }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/eclipse/keyple/card/calypso/CmdCardSvGet.java`
#### Snippet
```java
    super.setApduResponseAndCheckStatus(apduResponse);
    byte[] cardResponse = apduResponse.getDataOut();
    byte currentKvc;
    int transactionNumber;
    int balance;
    byte[] loadLog;
    byte[] debitLog;
    switch (cardResponse.length) {
      case 0x21: /* Compatibility mode, Reload */
      case 0x1E: /* Compatibility mode, Debit or Undebit */
        currentKvc = cardResponse[0];
        transactionNumber = ByteArrayUtil.extractInt(cardResponse, 1, 2, false);
        balance = ByteArrayUtil.extractInt(cardResponse, 8, 3, true);
        if (cardResponse.length == 0x21) {
          /* Reload */
          loadLog = Arrays.copyOfRange(cardResponse, 11, cardResponse.length);
          debitLog = null;
        } else {
          /* Debit */
          loadLog = null;
          debitLog = Arrays.copyOfRange(cardResponse, 11, cardResponse.length);
        }
        break;
      case 0x3D: /* Revision 3.2 mode */
        currentKvc = cardResponse[8];
        transactionNumber = ByteArrayUtil.extractInt(cardResponse, 9, 2, false);
        balance = ByteArrayUtil.extractInt(cardResponse, 17, 3, true);
        loadLog = Arrays.copyOfRange(cardResponse, 20, 42);
        debitLog = Arrays.copyOfRange(cardResponse, 42, cardResponse.length);
        break;
      default:
        throw new IllegalStateException("Incorrect data length in response to SVGet");
    }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/eclipse/keyple/card/calypso/CommonTransactionManagerAdapter.java`
#### Snippet
```java
    if (cardResponse != null) {
      List<ApduRequestSpi> requests = cardRequest.getApduRequests();
      List<ApduResponseApi> responses = cardResponse.getApduResponses();
      for (int i = 0; i < responses.size(); i++) {
        transactionAuditData.add(requests.get(i).getApdu());
        transactionAuditData.add(responses.get(i).getApdu());
      }
    }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/eclipse/keyple/card/calypso/SamTransactionManagerAdapter.java`
#### Snippet
```java
      BasicSignatureComputationDataAdapter dataAdapter =
          (BasicSignatureComputationDataAdapter) data;

      Assert.getInstance()
          .notNull(dataAdapter, MSG_INPUT_OUTPUT_DATA)
          .notNull(dataAdapter.getData(), "data to sign")
          .isInRange(dataAdapter.getData().length, 1, 208, "length of data to sign")
          .isTrue(
              dataAdapter.getData().length % 8 == 0, "length of data to sign is a multiple of 8")
          .isInRange(dataAdapter.getSignatureSize(), 1, 8, MSG_SIGNATURE_SIZE)
          .isTrue(
              dataAdapter.getKeyDiversifier() == null
                  || (dataAdapter.getKeyDiversifier().length >= 1
                      && dataAdapter.getKeyDiversifier().length <= 8),
              MSG_KEY_DIVERSIFIER_SIZE_IS_IN_RANGE_1_8);

      prepareSelectDiversifierIfNeeded(dataAdapter.getKeyDiversifier());
      samCommands.add(new CmdSamDataCipher(sam, dataAdapter, null));
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/eclipse/keyple/card/calypso/SamTransactionManagerAdapter.java`
#### Snippet
```java
      TraceableSignatureComputationDataAdapter dataAdapter =
          (TraceableSignatureComputationDataAdapter) data;

      Assert.getInstance()
          .notNull(dataAdapter, MSG_INPUT_OUTPUT_DATA)
          .notNull(dataAdapter.getData(), "data to sign")
          .isInRange(
              dataAdapter.getData().length,
              1,
              dataAdapter.isSamTraceabilityMode() ? 206 : 208,
              "length of data to sign")
          .isInRange(dataAdapter.getSignatureSize(), 1, 8, MSG_SIGNATURE_SIZE)
          .isTrue(
              !dataAdapter.isSamTraceabilityMode()
                  || (dataAdapter.getTraceabilityOffset() >= 0
                      && dataAdapter.getTraceabilityOffset()
                          <= ((dataAdapter.getData().length * 8)
                              - (dataAdapter.isPartialSamSerialNumber() ? 7 * 8 : 8 * 8))),
              "traceability offset is in range [0.."
                  + ((dataAdapter.getData().length * 8)
                      - (dataAdapter.isPartialSamSerialNumber() ? 7 * 8 : 8 * 8))
                  + "]")
          .isTrue(
              dataAdapter.getKeyDiversifier() == null
                  || (dataAdapter.getKeyDiversifier().length >= 1
                      && dataAdapter.getKeyDiversifier().length <= 8),
              MSG_KEY_DIVERSIFIER_SIZE_IS_IN_RANGE_1_8);

      prepareSelectDiversifierIfNeeded(dataAdapter.getKeyDiversifier());
      samCommands.add(new CmdSamPsoComputeSignature(sam, dataAdapter));
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/eclipse/keyple/card/calypso/SamTransactionManagerAdapter.java`
#### Snippet
```java
      BasicSignatureVerificationDataAdapter dataAdapter =
          (BasicSignatureVerificationDataAdapter) data;

      Assert.getInstance()
          .notNull(dataAdapter, MSG_INPUT_OUTPUT_DATA)
          .notNull(dataAdapter.getData(), "signed data to verify")
          .isInRange(dataAdapter.getData().length, 1, 208, "length of signed data to verify")
          .isTrue(
              dataAdapter.getData().length % 8 == 0, "length of data to verify is a multiple of 8")
          .notNull(dataAdapter.getSignature(), "signature")
          .isInRange(dataAdapter.getSignature().length, 1, 8, MSG_SIGNATURE_SIZE)
          .isTrue(
              dataAdapter.getKeyDiversifier() == null
                  || (dataAdapter.getKeyDiversifier().length >= 1
                      && dataAdapter.getKeyDiversifier().length <= 8),
              MSG_KEY_DIVERSIFIER_SIZE_IS_IN_RANGE_1_8);

      prepareSelectDiversifierIfNeeded(dataAdapter.getKeyDiversifier());
      samCommands.add(new CmdSamDataCipher(sam, null, dataAdapter));
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/eclipse/keyple/card/calypso/SamTransactionManagerAdapter.java`
#### Snippet
```java
      TraceableSignatureVerificationDataAdapter dataAdapter =
          (TraceableSignatureVerificationDataAdapter) data;

      Assert.getInstance()
          .notNull(dataAdapter, MSG_INPUT_OUTPUT_DATA)
          .notNull(dataAdapter.getData(), "signed data to verify")
          .isInRange(
              dataAdapter.getData().length,
              1,
              dataAdapter.isSamTraceabilityMode() ? 206 : 208,
              "length of signed data to verify")
          .notNull(dataAdapter.getSignature(), "signature")
          .isInRange(dataAdapter.getSignature().length, 1, 8, MSG_SIGNATURE_SIZE)
          .isTrue(
              !dataAdapter.isSamTraceabilityMode()
                  || (dataAdapter.getTraceabilityOffset() >= 0
                      && dataAdapter.getTraceabilityOffset()
                          <= ((dataAdapter.getData().length * 8)
                              - (dataAdapter.isPartialSamSerialNumber() ? 7 * 8 : 8 * 8))),
              "traceability offset is in range [0.."
                  + ((dataAdapter.getData().length * 8)
                      - (dataAdapter.isPartialSamSerialNumber() ? 7 * 8 : 8 * 8))
                  + "]")
          .isTrue(
              dataAdapter.getKeyDiversifier() == null
                  || (dataAdapter.getKeyDiversifier().length >= 1
                      && dataAdapter.getKeyDiversifier().length <= 8),
              MSG_KEY_DIVERSIFIER_SIZE_IS_IN_RANGE_1_8);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/eclipse/keyple/card/calypso/SamTransactionManagerAdapter.java`
#### Snippet
```java
        byte[] samSerialNumber =
            ByteArrayUtil.extractBytes(
                dataAdapter.getData(),
                dataAdapter.getTraceabilityOffset(),
                dataAdapter.isPartialSamSerialNumber() ? 3 : 4);

        int samCounterValue =
            ByteArrayUtil.extractInt(
                ByteArrayUtil.extractBytes(
                    dataAdapter.getData(),
                    dataAdapter.getTraceabilityOffset()
                        + (dataAdapter.isPartialSamSerialNumber() ? 3 * 8 : 4 * 8),
                    3),
                0,
                3,
                false);

        // Is SAM revoked ?
        if (securitySetting
            .getSamRevocationServiceSpi()
            .isSamRevoked(samSerialNumber, samCounterValue)) {
          throw new SamRevokedException(
              String.format(
                  "SAM with serial number '%s' and counter value '%d' is revoked.",
                  HexUtil.toHex(samSerialNumber), samCounterValue));
        }
```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked cast: 'org.eclipse.keyple.card.calypso.CommonSecuritySettingAdapter' to 'S'
in `src/main/java/org/eclipse/keyple/card/calypso/CommonSecuritySettingAdapter.java`
#### Snippet
```java
    implements CommonSecuritySetting<S> {

  private final S currentInstance = (S) this;
  private ProxyReaderApi controlSamReader;
  private CalypsoSamAdapter controlSam;
```

### UNCHECKED_WARNING
Unchecked cast: 'org.eclipse.keyple.card.calypso.DtoAdapters.CommonSignatureVerificationDataAdapter' to 'T'
in `src/main/java/org/eclipse/keyple/card/calypso/DtoAdapters.java`
#### Snippet
```java
      implements CommonSignatureVerificationData<T> {

    private final T currentInstance = (T) this;
    private byte[] data;
    private byte[] signature;
```

### UNCHECKED_WARNING
Unchecked cast: 'org.eclipse.keyple.card.calypso.DtoAdapters.CommonSignatureComputationDataAdapter' to 'T'
in `src/main/java/org/eclipse/keyple/card/calypso/DtoAdapters.java`
#### Snippet
```java
      implements CommonSignatureComputationData<T> {

    private final T currentInstance = (T) this;
    private byte[] data;
    private byte kif;
```

## RuleId[id=Deprecation]
### Deprecation
'CSAM_F' is deprecated
in `src/main/java/org/eclipse/keyple/card/calypso/CalypsoSamAdapter.java`
#### Snippet
```java
      case SAM_S1E1:
        return 240;
      case CSAM_F:
        return 247;
      default:
```

### Deprecation
Overrides deprecated method in 'org.calypsonet.terminal.calypso.transaction.SamTransactionManager'
in `src/main/java/org/eclipse/keyple/card/calypso/SamTransactionManagerAdapter.java`
#### Snippet
```java
   */
  @Override
  public final CalypsoSamAdapter getCalypsoSam() {
    return sam;
  }
```

### Deprecation
Overrides deprecated method in 'org.calypsonet.terminal.calypso.transaction.SamTransactionManager'
in `src/main/java/org/eclipse/keyple/card/calypso/SamTransactionManagerAdapter.java`
#### Snippet
```java
   */
  @Override
  public final CardReader getSamReader() {
    return (CardReader) samReader;
  }
```

### Deprecation
'CSAM_F' is deprecated
in `src/main/java/org/eclipse/keyple/card/calypso/CalypsoSamSelectionAdapter.java`
#### Snippet
```java
          applicationTypeMask = "E1";
          break;
        case CSAM_F:
          // TODO Check what is the expected mask here
          applicationTypeMask = "??";
```

### Deprecation
'org.calypsonet.terminal.calypso.transaction.SamTransactionManager' is deprecated
in `src/main/java/org/eclipse/keyple/card/calypso/CalypsoExtensionService.java`
#### Snippet
```java
   * parameters of the {@link
   * CardTransactionManager#prepareVerifySignature(CommonSignatureVerificationData)} and {@link
   * SamTransactionManager#prepareVerifySignature(CommonSignatureVerificationData)} methods.
   *
   * @return A not null reference.
```

### Deprecation
'org.calypsonet.terminal.calypso.transaction.SamTransactionManager' is deprecated
in `src/main/java/org/eclipse/keyple/card/calypso/CalypsoExtensionService.java`
#### Snippet
```java
   * Returns a new instance of {@link BasicSignatureComputationData} to use to define the parameters
   * of the {@link CardTransactionManager#prepareComputeSignature(CommonSignatureComputationData)}
   * and {@link SamTransactionManager#prepareComputeSignature(CommonSignatureComputationData)}
   * methods.
   *
```

### Deprecation
'org.calypsonet.terminal.calypso.transaction.SamTransactionManager' is deprecated
in `src/main/java/org/eclipse/keyple/card/calypso/CalypsoExtensionService.java`
#### Snippet
```java
   * parameters of the {@link
   * CardTransactionManager#prepareVerifySignature(CommonSignatureVerificationData)} and {@link
   * SamTransactionManager#prepareVerifySignature(CommonSignatureVerificationData)} methods.
   *
   * @return A not null reference.
```

### Deprecation
'org.calypsonet.terminal.calypso.transaction.SamTransactionManager' is deprecated
in `src/main/java/org/eclipse/keyple/card/calypso/CalypsoExtensionService.java`
#### Snippet
```java
   * parameters of the {@link
   * CardTransactionManager#prepareComputeSignature(CommonSignatureComputationData)} and {@link
   * SamTransactionManager#prepareComputeSignature(CommonSignatureComputationData)} methods.
   *
   * @return A not null reference.
```

### Deprecation
'CmdCardInvalidate(org.eclipse.keyple.card.calypso.CalypsoCardAdapter)' is deprecated
in `src/main/java/org/eclipse/keyple/card/calypso/CardTransactionManagerAdapter.java`
#### Snippet
```java
      _cardCommands.add(command);
      // TODO legacy
      cardCommands.add(new CmdCardInvalidate(card));
    } catch (RuntimeException e) {
      resetTransaction();
```

### Deprecation
'CmdCardManageSession(org.eclipse.keyple.card.calypso.CalypsoCardAdapter, boolean, byte\[\])' is deprecated
in `src/main/java/org/eclipse/keyple/card/calypso/CardTransactionManagerAdapter.java`
#### Snippet
```java
      cardCommands.add(
          index,
          new CmdCardManageSession(
              card,
              entry.getValue().isEncryptionRequested,
```

### Deprecation
'CmdCardSearchRecordMultiple(org.eclipse.keyple.card.calypso.CalypsoCardAdapter, org.eclipse.keyple.card.calypso.DtoAdapters.SearchCommandDataAdapter)' is deprecated
in `src/main/java/org/eclipse/keyple/card/calypso/CardTransactionManagerAdapter.java`
#### Snippet
```java
          new CmdCardSearchRecordMultiple(_transactionContext, getCommandContext(), dataAdapter));
      // TODO legacy
      cardCommands.add(new CmdCardSearchRecordMultiple(card, dataAdapter));

    } catch (RuntimeException e) {
```

### Deprecation
'CmdCardReadRecords(org.eclipse.keyple.card.calypso.CalypsoCardAdapter, int, int, org.eclipse.keyple.card.calypso.CmdCardReadRecords.ReadMode, int, int)' is deprecated
in `src/main/java/org/eclipse/keyple/card/calypso/CardTransactionManagerAdapter.java`
#### Snippet
```java
      // TODO legacy
      cardCommands.add(
          new CmdCardReadRecords(
              card,
              sfi,
```

### Deprecation
'CmdCardReadBinary(org.eclipse.keyple.card.calypso.CalypsoCardAdapter, byte, int, int)' is deprecated
in `src/main/java/org/eclipse/keyple/card/calypso/CardTransactionManagerAdapter.java`
#### Snippet
```java
            new CmdCardReadBinary(_transactionContext, getCommandContext(), sfi, 0, 1));
        // TODO legacy
        cardCommands.add(new CmdCardReadBinary(card, sfi, 0, 1));
      }

```

### Deprecation
'CmdCardUpdateOrWriteBinary(boolean, org.eclipse.keyple.card.calypso.CalypsoCardAdapter, byte, int, byte\[\])' is deprecated
in `src/main/java/org/eclipse/keyple/card/calypso/CardTransactionManagerAdapter.java`
#### Snippet
```java
        // TODO legacy
        cardCommands.add(
            new CmdCardUpdateOrWriteBinary(
                isUpdateCommand,
                card,
```

### Deprecation
'CmdCardSvReload(org.eclipse.keyple.card.calypso.CalypsoCardAdapter, int, byte\[\], byte\[\], byte\[\], boolean)' is deprecated
in `src/main/java/org/eclipse/keyple/card/calypso/CardTransactionManagerAdapter.java`
#### Snippet
```java
      // create the initial command with the application data
      addStoredValueCommand(
          new CmdCardSvReload(card, amount, date, time, free, isExtendedMode), SvOperation.RELOAD);

    } catch (RuntimeException e) {
```

### Deprecation
'CmdCardIncreaseOrDecrease(boolean, org.eclipse.keyple.card.calypso.CalypsoCardAdapter, byte, int, int)' is deprecated
in `src/main/java/org/eclipse/keyple/card/calypso/CardTransactionManagerAdapter.java`
#### Snippet
```java
      // TODO legacy
      cardCommands.add(
          new CmdCardIncreaseOrDecrease(isDecreaseCommand, card, sfi, counterNumber, incDecValue));
    } catch (RuntimeException e) {
      resetTransaction();
```

### Deprecation
'CmdCardSvGet(org.eclipse.keyple.card.calypso.CalypsoCardAdapter, org.calypsonet.terminal.calypso.transaction.SvOperation, boolean)' is deprecated
in `src/main/java/org/eclipse/keyple/card/calypso/CardTransactionManagerAdapter.java`
#### Snippet
```java
            new CmdCardSvGet(_transactionContext, getCommandContext(), operation1, false));
        // TODO legacy
        addStoredValueCommand(new CmdCardSvGet(card, operation1, false), operation1);
      }
      _cardCommands.add(
```

### Deprecation
'CmdCardSvGet(org.eclipse.keyple.card.calypso.CalypsoCardAdapter, org.calypsonet.terminal.calypso.transaction.SvOperation, boolean)' is deprecated
in `src/main/java/org/eclipse/keyple/card/calypso/CardTransactionManagerAdapter.java`
#### Snippet
```java
      _svOperation = svOperation;
      // TODO legacy
      addStoredValueCommand(new CmdCardSvGet(card, svOperation, isExtendedMode), svOperation);
      this.svAction = svAction;
    } catch (RuntimeException e) {
```

### Deprecation
'CmdCardVerifyPin(org.eclipse.keyple.card.calypso.CalypsoCardAdapter)' is deprecated
in `src/main/java/org/eclipse/keyple/card/calypso/CardTransactionManagerAdapter.java`
#### Snippet
```java
      _cardCommands.add(new CmdCardVerifyPin(_transactionContext, getCommandContext()));
      // TODO legacy
      cardCommands.add(new CmdCardVerifyPin(card));
    } catch (RuntimeException e) {
      resetTransaction();
```

### Deprecation
'CmdCardWriteRecord(org.eclipse.keyple.card.calypso.CalypsoCardAdapter, byte, int, byte\[\])' is deprecated
in `src/main/java/org/eclipse/keyple/card/calypso/CardTransactionManagerAdapter.java`
#### Snippet
```java
      _cardCommands.add(command);
      // TODO legacy
      cardCommands.add(new CmdCardWriteRecord(card, sfi, recordNumber, recordData));
    } catch (RuntimeException e) {
      resetTransaction();
```

### Deprecation
'CmdCardUpdateRecord(org.eclipse.keyple.card.calypso.CalypsoCardAdapter, byte, int, byte\[\])' is deprecated
in `src/main/java/org/eclipse/keyple/card/calypso/CardTransactionManagerAdapter.java`
#### Snippet
```java
      _cardCommands.add(command);
      // TODO legacy
      cardCommands.add(new CmdCardUpdateRecord(card, sfi, recordNumber, recordData));
    } catch (RuntimeException e) {
      resetTransaction();
```

### Deprecation
'CmdCardIncreaseOrDecreaseMultiple(boolean, org.eclipse.keyple.card.calypso.CalypsoCardAdapter, byte, java.util.SortedMap)' is deprecated
in `src/main/java/org/eclipse/keyple/card/calypso/CardTransactionManagerAdapter.java`
#### Snippet
```java
          // TODO legacy
          cardCommands.add(
              new CmdCardIncreaseOrDecreaseMultiple(
                  isDecreaseCommand,
                  card,
```

### Deprecation
'CmdCardIncreaseOrDecreaseMultiple(boolean, org.eclipse.keyple.card.calypso.CalypsoCardAdapter, byte, java.util.SortedMap)' is deprecated
in `src/main/java/org/eclipse/keyple/card/calypso/CardTransactionManagerAdapter.java`
#### Snippet
```java
              // TODO legacy
              cardCommands.add(
                  new CmdCardIncreaseOrDecreaseMultiple(
                      isDecreaseCommand, card, sfi, new TreeMap<Integer, Integer>(map)));
              i = 0;
```

### Deprecation
'CmdCardIncreaseOrDecreaseMultiple(boolean, org.eclipse.keyple.card.calypso.CalypsoCardAdapter, byte, java.util.SortedMap)' is deprecated
in `src/main/java/org/eclipse/keyple/card/calypso/CardTransactionManagerAdapter.java`
#### Snippet
```java
            // TODO legacy
            cardCommands.add(
                new CmdCardIncreaseOrDecreaseMultiple(isDecreaseCommand, card, sfi, map));
          }
        }
```

### Deprecation
'CmdCardReadRecordMultiple(org.eclipse.keyple.card.calypso.CalypsoCardAdapter, byte, byte, byte, byte)' is deprecated
in `src/main/java/org/eclipse/keyple/card/calypso/CardTransactionManagerAdapter.java`
#### Snippet
```java
        // TODO legacy
        cardCommands.add(
            new CmdCardReadRecordMultiple(
                card, sfi, (byte) currentRecordNumber, (byte) offset, (byte) nbBytesToRead));
        currentRecordNumber += nbRecordsPerApdu;
```

### Deprecation
'CmdCardAppendRecord(org.eclipse.keyple.card.calypso.CalypsoCardAdapter, byte, byte\[\])' is deprecated
in `src/main/java/org/eclipse/keyple/card/calypso/CardTransactionManagerAdapter.java`
#### Snippet
```java
      _cardCommands.add(command);
      // TODO legacy
      cardCommands.add(new CmdCardAppendRecord(card, sfi, recordData));
    } catch (RuntimeException e) {
      resetTransaction();
```

### Deprecation
'CmdCardReadRecords(org.eclipse.keyple.card.calypso.CalypsoCardAdapter, int, int, org.eclipse.keyple.card.calypso.CmdCardReadRecords.ReadMode, int, int)' is deprecated
in `src/main/java/org/eclipse/keyple/card/calypso/CardTransactionManagerAdapter.java`
#### Snippet
```java
          // TODO legacy
          cardCommands.add(
              new CmdCardReadRecords(
                  card,
                  sfi,
```

### Deprecation
'CmdCardReadRecords(org.eclipse.keyple.card.calypso.CalypsoCardAdapter, int, int, org.eclipse.keyple.card.calypso.CmdCardReadRecords.ReadMode, int, int)' is deprecated
in `src/main/java/org/eclipse/keyple/card/calypso/CardTransactionManagerAdapter.java`
#### Snippet
```java
          // TODO legacy
          cardCommands.add(
              new CmdCardReadRecords(
                  card, sfi, i, CmdCardReadRecords.ReadMode.ONE_RECORD, recordSize, recordSize));
        }
```

### Deprecation
'CmdCardReadRecords(org.eclipse.keyple.card.calypso.CalypsoCardAdapter, int, int, org.eclipse.keyple.card.calypso.CmdCardReadRecords.ReadMode, int, int)' is deprecated
in `src/main/java/org/eclipse/keyple/card/calypso/CardTransactionManagerAdapter.java`
#### Snippet
```java
          // TODO legacy
          cardCommands.add(
              new CmdCardReadRecords(
                  card,
                  sfi,
```

### Deprecation
'CmdCardReadRecords(org.eclipse.keyple.card.calypso.CalypsoCardAdapter, int, int, org.eclipse.keyple.card.calypso.CmdCardReadRecords.ReadMode, int, int)' is deprecated
in `src/main/java/org/eclipse/keyple/card/calypso/CardTransactionManagerAdapter.java`
#### Snippet
```java
          // TODO legacy
          cardCommands.add(
              new CmdCardReadRecords(
                  card,
                  sfi,
```

### Deprecation
'CmdCardReadBinary(org.eclipse.keyple.card.calypso.CalypsoCardAdapter, byte, int, int)' is deprecated
in `src/main/java/org/eclipse/keyple/card/calypso/CardTransactionManagerAdapter.java`
#### Snippet
```java
            new CmdCardReadBinary(_transactionContext, getCommandContext(), sfi, 0, 1));
        // TODO legacy
        cardCommands.add(new CmdCardReadBinary(card, sfi, 0, 1));
      }

```

### Deprecation
'CmdCardReadBinary(org.eclipse.keyple.card.calypso.CalypsoCardAdapter, byte, int, int)' is deprecated
in `src/main/java/org/eclipse/keyple/card/calypso/CardTransactionManagerAdapter.java`
#### Snippet
```java
                _transactionContext, getCommandContext(), sfi, currentOffset, currentLength));
        // TODO legacy
        cardCommands.add(new CmdCardReadBinary(card, sfi, currentOffset, currentLength));

        currentOffset += currentLength;
```

### Deprecation
'CmdCardManageSession(org.eclipse.keyple.card.calypso.CalypsoCardAdapter, boolean, byte\[\])' is deprecated
in `src/main/java/org/eclipse/keyple/card/calypso/CardTransactionManagerAdapter.java`
#### Snippet
```java
      // We add an MSS command first in order to activate the encryption.
      // We use the key 0 because we are sure that there is no entry in the map for this case.
      cardCommands.add(0, new CmdCardManageSession(card, true, null));
      ManageSecureSessionDto dto = new ManageSecureSessionDto();
      dto.index = -1; // Index is set to -1 in order to be correctly incremented by the offset.
```

### Deprecation
'CmdCardCloseSecureSession(org.eclipse.keyple.card.calypso.CalypsoCardAdapter, boolean, byte\[\])' is deprecated
in `src/main/java/org/eclipse/keyple/card/calypso/CardTransactionManagerAdapter.java`
#### Snippet
```java
    // Build the last "Close Secure Session" card command.
    CmdCardCloseSecureSession cmdCardCloseSecureSession =
        new CmdCardCloseSecureSession(card, !isRatificationMechanismEnabled, terminalSessionMac);

    apduRequests.add(cmdCardCloseSecureSession.getApduRequest());
```

### Deprecation
'CmdCardSvDebitOrUndebit(boolean, org.eclipse.keyple.card.calypso.CalypsoCardAdapter, int, byte\[\], byte\[\], boolean)' is deprecated
in `src/main/java/org/eclipse/keyple/card/calypso/CardTransactionManagerAdapter.java`
#### Snippet
```java
      // create the initial command with the application data
      addStoredValueCommand(
          new CmdCardSvDebitOrUndebit(
              svAction == SvAction.DO, card, amount, date, time, isExtendedMode),
          SvOperation.DEBIT);
```

### Deprecation
'CmdCardSelectFile(org.eclipse.keyple.card.calypso.CalypsoCardAdapter, short)' is deprecated
in `src/main/java/org/eclipse/keyple/card/calypso/CardTransactionManagerAdapter.java`
#### Snippet
```java
      _cardCommands.add(new CmdCardSelectFile(_transactionContext, getCommandContext(), lid));
      // TODO legacy
      cardCommands.add(new CmdCardSelectFile(card, lid));
    } catch (RuntimeException e) {
      resetTransaction();
```

### Deprecation
'CmdCardGetDataFci(org.eclipse.keyple.card.calypso.CalypsoCardAdapter)' is deprecated
in `src/main/java/org/eclipse/keyple/card/calypso/CardTransactionManagerAdapter.java`
#### Snippet
```java
          _cardCommands.add(new CmdCardGetDataFci(_transactionContext, getCommandContext()));
          // TODO legacy
          cardCommands.add(new CmdCardGetDataFci(card));
          break;
        case FCP_FOR_CURRENT_FILE:
```

### Deprecation
'CmdCardGetDataFcp(org.eclipse.keyple.card.calypso.CalypsoCardAdapter)' is deprecated
in `src/main/java/org/eclipse/keyple/card/calypso/CardTransactionManagerAdapter.java`
#### Snippet
```java
          _cardCommands.add(new CmdCardGetDataFcp(_transactionContext, getCommandContext()));
          // TODO legacy
          cardCommands.add(new CmdCardGetDataFcp(card));
          break;
        case EF_LIST:
```

### Deprecation
'CmdCardGetDataEfList(org.eclipse.keyple.card.calypso.CalypsoCardAdapter)' is deprecated
in `src/main/java/org/eclipse/keyple/card/calypso/CardTransactionManagerAdapter.java`
#### Snippet
```java
          _cardCommands.add(new CmdCardGetDataEfList(_transactionContext, getCommandContext()));
          // TODO legacy
          cardCommands.add(new CmdCardGetDataEfList(card));
          break;
        case TRACEABILITY_INFORMATION:
```

### Deprecation
'CmdCardGetDataTraceabilityInformation(org.eclipse.keyple.card.calypso.CalypsoCardAdapter)' is deprecated
in `src/main/java/org/eclipse/keyple/card/calypso/CardTransactionManagerAdapter.java`
#### Snippet
```java
              new CmdCardGetDataTraceabilityInformation(_transactionContext, getCommandContext()));
          // TODO legacy
          cardCommands.add(new CmdCardGetDataTraceabilityInformation(card));
          break;
        default:
```

### Deprecation
'CmdCardRehabilitate(org.eclipse.keyple.card.calypso.CalypsoCardAdapter)' is deprecated
in `src/main/java/org/eclipse/keyple/card/calypso/CardTransactionManagerAdapter.java`
#### Snippet
```java
      _cardCommands.add(command);
      // TODO legacy
      cardCommands.add(new CmdCardRehabilitate(card));
    } catch (RuntimeException e) {
      resetTransaction();
```

### Deprecation
'CmdCardSelectFile(org.eclipse.keyple.card.calypso.CalypsoCardAdapter, org.calypsonet.terminal.calypso.SelectFileControl)' is deprecated
in `src/main/java/org/eclipse/keyple/card/calypso/CardTransactionManagerAdapter.java`
#### Snippet
```java
          new CmdCardSelectFile(_transactionContext, getCommandContext(), selectFileControl));
      // TODO legacy
      cardCommands.add(new CmdCardSelectFile(card, selectFileControl));
    } catch (RuntimeException e) {
      resetTransaction();
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

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
Tag `return` is not allowed here
in `src/main/java/org/eclipse/keyple/card/calypso/SamTransactionManagerAdapter.java`
#### Snippet
```java
   * Prepares a "SelectDiversifier" command using the current key diversifier.
   *
   * @return The current instance.
   */
  private void prepareSelectDiversifier() {
```

## RuleId[id=DeprecatedIsStillUsed]
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
Deprecated member 'CmdCardSelectFile' is still used
in `src/main/java/org/eclipse/keyple/card/calypso/CmdCardSelectFile.java`
#### Snippet
```java
   */
  @Deprecated
  CmdCardSelectFile(CalypsoCardAdapter calypsoCard, short lid) {
    super(commandRef, 0, calypsoCard, null, null);
    buildCommand(
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
Result of `Assert.notNull()` is ignored
in `src/main/java/org/eclipse/keyple/card/calypso/CalypsoSamSelectionAdapter.java`
#### Snippet
```java
  public CalypsoSamSelection filterBySerialNumber(String serialNumberRegex) {

    Assert.getInstance().notNull(serialNumberRegex, "serialNumberRegex");

    try {
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
in `src/main/java/org/eclipse/keyple/card/calypso/CalypsoSamSelectionAdapter.java`
#### Snippet
```java
  public CalypsoSamSelection filterByProductType(CalypsoSam.ProductType productType) {

    Assert.getInstance().notNull(productType, "productType");

    this.productType = productType;
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
Result of `Assert.greaterOrEqual()` is ignored
in `src/main/java/org/eclipse/keyple/card/calypso/FileDataAdapter.java`
#### Snippet
```java
  public Integer getContentAsCounterValue(int numCounter) {

    Assert.getInstance().greaterOrEqual(numCounter, 1, "numCounter");

    byte[] rec1 = records.get(1);
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
  @Deprecated
  public CalypsoCardSelection addSuccessfulStatusWord(int statusWord) {
    Assert.getInstance().isInRange(statusWord, 0, 0xFFFF, "statusWord");
    cardSelector.addSuccessfulStatusWord(statusWord);
    return null;
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
  @Override
  public CalypsoCardSelection setFileOccurrence(FileOccurrence fileOccurrence) {
    Assert.getInstance().notNull(fileOccurrence, "fileOccurrence");
    switch (fileOccurrence) {
      case FIRST:
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
in `src/main/java/org/eclipse/keyple/card/calypso/CalypsoExtensionService.java`
#### Snippet
```java
        .isTrue(
            calypsoSam.getProductType() != CalypsoSam.ProductType.UNKNOWN, "product type is known")
        .isTrue(!isSecureMode || samSecuritySetting != null, "security setting is not null");

    if (!(samReader instanceof ProxyReaderApi)) {
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
              recordNumber,
              CalypsoCardConstant.NB_REC_MIN,
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
          .isEqual(date.length, 2, "date")
          .isEqual(time.length, 2, "time")
          .isEqual(free.length, 2, "free");

      checkSvModifyingCommandPreconditions(SvOperation.RELOAD);
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
    }

    Assert.getInstance().isInRange(keyIndex, 1, 3, "keyIndex");

    finalizeSvCommandIfNeeded();
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
          .isInRange((int) sfi, CalypsoCardConstant.SFI_MIN, CalypsoCardConstant.SFI_MAX, "sfi")
          .notNull(recordData, MSG_RECORD_DATA)
          .isInRange(recordData.length, 0, cardPayloadCapacity, MSG_RECORD_DATA_LENGTH);
      CmdCardAppendRecord command =
          new CmdCardAppendRecord(_transactionContext, getCommandContext(), sfi, recordData);
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

