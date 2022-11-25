# nomulus 
 
# Bad smells
I found 1853 bad smells with 155 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| BoundedWildcard | 254 | false |
| AbstractClassNeverImplemented | 202 | false |
| OptionalUsedAsFieldOrParameterType | 194 | false |
| SystemOutErr | 122 | false |
| UnnecessaryFullyQualifiedName | 114 | false |
| UnstableApiUsage | 107 | false |
| UtilityClassWithoutPrivateConstructor | 104 | true |
| DataFlowIssue | 100 | false |
| ClassNameSameAsAncestorName | 82 | false |
| ReturnNull | 74 | false |
| OptionalGetWithoutIsPresent | 59 | false |
| RedundantFieldInitialization | 53 | false |
| DynamicRegexReplaceableByCompiledPattern | 44 | false |
| EmptyMethod | 40 | false |
| ConstantValue | 34 | false |
| AssignmentToMethodParameter | 27 | false |
| MismatchedCollectionQueryUpdate | 25 | false |
| NonProtectedConstructorInAbstractClass | 24 | true |
| NullableProblems | 16 | false |
| SizeReplaceableByIsEmpty | 15 | true |
| ZeroLengthArrayInitialization | 15 | false |
| OptionalAssignedToNull | 10 | false |
| PublicFieldAccessedInSynchronizedContext | 10 | false |
| InstanceofCatchParameter | 8 | false |
| UnnecessaryToStringCall | 7 | true |
| NestedAssignment | 6 | false |
| Convert2MethodRef | 6 | false |
| NonSerializableFieldInSerializableClass | 6 | false |
| OctalLiteral | 5 | false |
| UnstableTypeUsedInSignature | 5 | false |
| OptionalContainsCollection | 5 | false |
| RedundantSuppression | 5 | false |
| KeySetIterationMayUseEntrySet | 4 | false |
| NonShortCircuitBoolean | 4 | false |
| RedundantImplements | 4 | false |
| UnnecessaryReturn | 3 | true |
| MissortedModifiers | 3 | false |
| NonFinalFieldOfException | 3 | false |
| IOResource | 3 | false |
| SimplifyStreamApiCallChains | 3 | false |
| SetReplaceableByEnumSet | 3 | false |
| ThrowablePrintStackTrace | 3 | false |
| UnnecessaryStringEscape | 2 | false |
| ReadWriteStringCanBeUsed | 2 | false |
| TextBlockMigration | 2 | false |
| RedundantMethodOverride | 2 | false |
| ReplaceAssignmentWithOperatorAssignment | 2 | false |
| CodeBlock2Expr | 2 | true |
| FieldAccessedSynchronizedAndUnsynchronized | 2 | false |
| UnusedAssignment | 2 | false |
| OptionalIsPresent | 2 | false |
| MissingSerialAnnotation | 2 | false |
| DeprecatedIsStillUsed | 2 | false |
| StringEqualsEmptyString | 2 | false |
| StaticCallOnSubclass | 1 | false |
| StaticInitializerReferencesSubClass | 1 | false |
| AssignmentToStaticFieldFromInstanceMethod | 1 | false |
| StaticPseudoFunctionalStyleMethod | 1 | false |
| MisspelledEquals | 1 | false |
| StringBufferReplaceableByString | 1 | false |
| IntegerMultiplicationImplicitCastToLong | 1 | false |
| GroovyUnusedAssignment | 1 | false |
| ExceptionNameDoesntEndWithException | 1 | false |
| NonStaticFinalLogger | 1 | false |
| SynchronizeOnThis | 1 | false |
| MethodOverridesStaticMethod | 1 | false |
| UnnecessarySemicolon | 1 | false |
| RedundantEscapeInRegexReplacement | 1 | false |
| Convert2Lambda | 1 | false |
| AssignmentToLambdaParameter | 1 | false |
| BusyWait | 1 | false |
| ClassCanBeRecord | 1 | false |
## RuleId[ruleID=StaticCallOnSubclass]
### StaticCallOnSubclass
Static method `extendRegistrationWithCap()` declared in class 'google.registry.model.domain.DomainBase' but referenced via subclass 'google.registry.model.domain.Domain'
in `core/src/main/java/google/registry/flows/ResourceFlowUtils.java`
#### Snippet
```java
      inAutoRenew = false;
    }
    return Domain.extendRegistrationWithCap(
        approvalTime,
        domain.getRegistrationExpirationTime(),
```

## RuleId[ruleID=UnnecessaryStringEscape]
### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `core/src/main/java/google/registry/tools/VerifyOteCommand.java`
#### Snippet
```java
      System.err.printf(
          "WARNING: Running against %s environment. Are "
              + "you sure you didn\'t mean to run this against sandbox (e.g. \"-e SANDBOX\")?%n",
          RegistryEnvironment.get());
    }
```

### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `core/src/main/java/google/registry/tools/SetupOteCommand.java`
#### Snippet
```java
          String.format(
              "\n\nWARNING: Running against %s environment. Are "
                  + "you sure you didn\'t mean to run this against sandbox (e.g. \"-e SANDBOX\")?",
              RegistryEnvironment.get()));
    }
```

## RuleId[ruleID=StaticInitializerReferencesSubClass]
### StaticInitializerReferencesSubClass
Referencing subclass JapaneseLanguageValidator from superclass LanguageValidator initializer might lead to class loading deadlock
in `core/src/main/java/google/registry/tldconfig/idn/LanguageValidator.java`
#### Snippet
```java
  /** A registry of all known language validators keyed by their language code. */
  private static final ImmutableMap<String, LanguageValidator> LANGUAGE_VALIDATORS =
      ImmutableMap.of("ja", new JapaneseLanguageValidator());

  /** Return the language validator for the given language code (if one exists). */
```

## RuleId[ruleID=AssignmentToStaticFieldFromInstanceMethod]
### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `instance` from instance context
in `core/src/main/java/google/registry/tools/RegistryToolEnvironment.java`
#### Snippet
```java
  @VisibleForTesting
  void setup(SystemPropertySetter systemPropertySetter) {
    instance = this;
    actualEnvironment.setup(systemPropertySetter);
    for (ImmutableMap.Entry<String, String> entry : extraProperties.entrySet()) {
```

## RuleId[ruleID=KeySetIterationMayUseEntrySet]
### KeySetIterationMayUseEntrySet
Iteration over `expectedFeeMap.keySet()` may be replaced with 'entrySet()' iteration
in `core/src/main/java/google/registry/flows/domain/DomainFlowUtils.java`
#### Snippet
```java
      ImmutableMap<FeeType, Money> providedFeeMap =
          buildFeeMap(feeCommand.get().getFees(), feeCommand.get().getCurrency());
      for (FeeType type : expectedFeeMap.keySet()) {
        if (!providedFeeMap.containsKey(type)) {
          throw new FeesMismatchException(type);
```

### KeySetIterationMayUseEntrySet
Iteration over `currentMatchesByEmail.keySet()` may be replaced with 'entrySet()' iteration
in `core/src/main/java/google/registry/reporting/spec11/PublishSpec11ReportAction.java`
#### Snippet
```java
        groupByKeyAndFlatMap(currentMatchesSet);
    ImmutableSet.Builder<RegistrarThreatMatches> resultsBuilder = ImmutableSet.builder();
    for (String email : currentMatchesByEmail.keySet()) {
      // Only include matches in the result if they're non-empty
      Set<ThreatMatch> difference =
```

### KeySetIterationMayUseEntrySet
Iteration over `defaultMap.keySet()` may be replaced with 'entrySet()' iteration
in `util/src/main/java/google/registry/util/YamlUtils.java`
#### Snippet
```java
  private static Map<String, Object> mergeMaps(
      Map<String, Object> defaultMap, Map<String, Object> customMap) {
    for (String key : defaultMap.keySet()) {
      if (!customMap.containsKey(key)) {
        continue;
```

### KeySetIterationMayUseEntrySet
Iteration over `replacements.keySet()` may be replaced with 'entrySet()' iteration
in `prober/src/main/java/google/registry/monitoring/blackbox/message/EppMessage.java`
#### Snippet
```java
      DocumentBuilder builder = docBuilderFactory.newDocumentBuilder();
      xmlDoc = builder.parse(is);
      for (String key : replacements.keySet()) {
        NodeList nodes = (NodeList) xpath.evaluate(key, xmlDoc, XPathConstants.NODESET);
        for (int i = 0; i < nodes.getLength(); i++) {
```

## RuleId[ruleID=StaticPseudoFunctionalStyleMethod]
### StaticPseudoFunctionalStyleMethod
Pseudo functional style code
in `core/src/main/java/google/registry/flows/domain/DomainFlowUtils.java`
#### Snippet
```java
      throw new BadDomainNamePartsCountException();
    }
    if (any(parts, equalTo(""))) {
      throw new EmptyDomainNamePartException();
    }
```

## RuleId[ruleID=MisspelledEquals]
### MisspelledEquals
`equal()` method should probably be 'equals()'
in `core/src/main/java/google/registry/persistence/transaction/QueryComposer.java`
#### Snippet
```java
  // of the overloads to use since there is no "value" object for context.

  public static <U extends Comparable<? super U>> WhereOperator<U> equal(
      CriteriaBuilder criteriaBuilder) {
    return criteriaBuilder::equal;
```

## RuleId[ruleID=OctalLiteral]
### OctalLiteral
Octal integer `07777777`
in `util/src/main/java/google/registry/util/PosixTarHeader.java`
#### Snippet
```java
     */
    public Builder setGid(int gid) {
      checkArgument(0 <= gid && gid <= 07777777,
          "Tar gid out of range: %s", gid);
      setField("gid", 116, 8, String.format("%07o", gid));
```

### OctalLiteral
Octal integer `07777777`
in `util/src/main/java/google/registry/util/PosixTarHeader.java`
#### Snippet
```java
     */
    public Builder setMode(int mode) {
      checkArgument(0 <= mode && mode <= 07777777,
          "Tar mode out of range: %s", mode);
      setField("mode", 100, 8, String.format("%07o", mode));
```

### OctalLiteral
Octal integer `0640`
in `util/src/main/java/google/registry/util/PosixTarHeader.java`
#### Snippet
```java
  public static class Builder {

    private static final int DEFAULT_MODE = 0640;
    private static final int DEFAULT_UID = 0;
    private static final int DEFAULT_GID = 0;
```

### OctalLiteral
Octal integer `077777777777L`
in `util/src/main/java/google/registry/util/PosixTarHeader.java`
#### Snippet
```java
     */
    public Builder setSize(long size) {
      checkArgument(0 <= size && size <= 077777777777L,
          "Tar size out of range: %s", size);
      setField("size", 124, 12, String.format("%011o", size));
```

### OctalLiteral
Octal integer `07777777`
in `util/src/main/java/google/registry/util/PosixTarHeader.java`
#### Snippet
```java
     */
    public Builder setUid(int uid) {
      checkArgument(0 <= uid && uid <= 07777777,
          "Tar uid out of range: %s", uid);
      setField("uid", 108, 8, String.format("%07o", uid));
```

## RuleId[ruleID=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`((CharSequence) input).length() == 0` can be replaced with '((CharSequence) input).isEmpty()'
in `core/src/main/java/google/registry/ui/forms/FormField.java`
#### Snippet
```java
      return transform(
          input ->
              ((input instanceof CharSequence) && (((CharSequence) input).length() == 0))
                      || ((input instanceof Collection) && ((Collection<?>) input).isEmpty())
                  ? null
```

### SizeReplaceableByIsEmpty
`responseBody.length() == 0` can be replaced with 'responseBody.isEmpty()'
in `core/src/main/java/google/registry/beam/spec11/SafeBrowsingTransforms.java`
#### Snippet
```java
                    new InputStreamReader(response.getEntity().getContent(), UTF_8)));
        logger.atInfo().log("Got response: %s", responseBody.toString());
        if (responseBody.length() == 0) {
          logger.atInfo().log("Response was empty, no threats detected.");
        } else {
```

### SizeReplaceableByIsEmpty
`pathSearchString.length() > 0` can be replaced with '!pathSearchString.isEmpty()'
in `core/src/main/java/google/registry/rdap/RdapSearchActionBase.java`
#### Snippet
```java
      String pathSearchString, boolean isHeadRequest) {
    // The pathSearchString is not used by search commands.
    if (pathSearchString.length() > 0) {
      throw new BadRequestException("Unexpected path");
    }
```

### SizeReplaceableByIsEmpty
`addedServerStatuses.size() > 0` can be replaced with '!addedServerStatuses.isEmpty()'
in `core/src/main/java/google/registry/flows/domain/DomainUpdateFlow.java`
#### Snippet
```java

    String msg;
    if (addedServerStatuses.size() > 0 && removedServerStatuses.size() > 0) {
      msg =
          String.format(
```

### SizeReplaceableByIsEmpty
`removedServerStatuses.size() > 0` can be replaced with '!removedServerStatuses.isEmpty()'
in `core/src/main/java/google/registry/flows/domain/DomainUpdateFlow.java`
#### Snippet
```java

    String msg;
    if (addedServerStatuses.size() > 0 && removedServerStatuses.size() > 0) {
      msg =
          String.format(
```

### SizeReplaceableByIsEmpty
`addedServerStatuses.size() > 0` can be replaced with '!addedServerStatuses.isEmpty()'
in `core/src/main/java/google/registry/flows/domain/DomainUpdateFlow.java`
#### Snippet
```java
                  + " %s.",
              addedServerStatuses, removedServerStatuses);
    } else if (addedServerStatuses.size() > 0) {
      msg =
          String.format(
```

### SizeReplaceableByIsEmpty
`removedServerStatuses.size() > 0` can be replaced with '!removedServerStatuses.isEmpty()'
in `core/src/main/java/google/registry/flows/domain/DomainUpdateFlow.java`
#### Snippet
```java
          String.format(
              "The registry administrator has added the status(es) %s.", addedServerStatuses);
    } else if (removedServerStatuses.size() > 0) {
      msg =
          String.format(
```

### SizeReplaceableByIsEmpty
`getLinkedDomainKeys(key, now, 1).size() > 0` can be replaced with '!getLinkedDomainKeys(key, now, 1).isEmpty()'
in `core/src/main/java/google/registry/model/EppResourceUtils.java`
#### Snippet
```java
   */
  public static boolean isLinked(VKey<? extends EppResource> key, DateTime now) {
    return getLinkedDomainKeys(key, now, 1).size() > 0;
  }

```

### SizeReplaceableByIsEmpty
`jpaTm() .query("SELECT 1 FROM ReservedList WHERE name = :name", Integer.clas...` can be replaced with '!jpaTm() .query("SELECT 1 FROM ReservedList WHERE name = :name", Integer.class) .setParameter("name", reservedListName) .setMaxResults(1) .getResultList().isEmpty()'
in `core/src/main/java/google/registry/model/tld/label/ReservedListDao.java`
#### Snippet
```java
        .transact(
            () ->
                jpaTm()
                        .query("SELECT 1 FROM ReservedList WHERE name = :name", Integer.class)
                        .setParameter("name", reservedListName)
                        .setMaxResults(1)
                        .getResultList()
                        .size()
                    > 0);
  }
}
```

### SizeReplaceableByIsEmpty
`types.size() == 0` can be replaced with 'types.isEmpty()'
in `core/src/main/java/google/registry/flows/domain/DomainFlowUtils.java`
#### Snippet
```java
    }
    ImmutableList<FeeType> types = fee.parseDescriptionForTypes();
    if (types.size() == 0) {
      throw new FeeDescriptionParseException(fee.getDescription());
    } else if (types.size() > 1) {
```

### SizeReplaceableByIsEmpty
`label.length() == 0` can be replaced with 'label.isEmpty()'
in `core/src/main/java/google/registry/model/tld/label/ReservedList.java`
#### Snippet
```java
  public static ImmutableSet<ReservationType> getReservationTypes(String label, String tld) {
    checkNotNull(label, "label");
    if (label.length() == 0) {
      return ImmutableSet.of(FULLY_BLOCKED);
    }
```

### SizeReplaceableByIsEmpty
`reportSummary.size() == 0` can be replaced with 'reportSummary.isEmpty()'
in `core/src/main/java/google/registry/reporting/icann/IcannReportingUploadAction.java`
#### Snippet
```java

  private void emailUploadResults(ImmutableMap<String, Boolean> reportSummary) {
    if (reportSummary.size() == 0) {
      logger.atInfo().log("No uploads were attempted today; skipping notification email.");
      return;
```

### SizeReplaceableByIsEmpty
`line.length() > 0` can be replaced with '!line.isEmpty()'
in `util/src/main/java/google/registry/util/HexDumper.java`
#### Snippet
```java
  @Override
  public void flush() throws IOException {
    if (line.length() > 0) {
      upstream.write(line.toString());
      line = new StringBuilder();
```

### SizeReplaceableByIsEmpty
`query.getResultList().size() > 0` can be replaced with '!query.getResultList().isEmpty()'
in `core/src/main/java/google/registry/persistence/transaction/JpaTransactionManagerImpl.java`
#### Snippet
```java
            .setMaxResults(1);
    entityIds.forEach(entityId -> query.setParameter(entityId.name, entityId.value));
    return query.getResultList().size() > 0;
  }

```

### SizeReplaceableByIsEmpty
`results.size() > 0` can be replaced with '!results.isEmpty()'
in `core/src/main/java/google/registry/persistence/transaction/JpaTransactionManagerImpl.java`
#### Snippet
```java
    public Optional<T> first() {
      List<T> results = buildQuery().setMaxResults(1).getResultList();
      return results.size() > 0 ? Optional.of(detach(results.get(0))) : Optional.empty();
    }

```

## RuleId[ruleID=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder svgPanZoomLib` can be replaced with 'String'
in `core/src/nonprod/java/google/registry/tools/GenerateSqlErDiagramCommand.java`
#### Snippet
```java

      // Add pan and zoom support for the embedded SVG in the HTML.
      StringBuilder svgPanZoomLib =
          new StringBuilder("<script>")
              .append(ResourceUtils.readResourceUtf8(Resources.getResource(SVG_PAN_ZOOM_LIB)))
```

## RuleId[ruleID=ReadWriteStringCanBeUsed]
### ReadWriteStringCanBeUsed
Can be replaced with 'Files.writeString()'
in `core/src/nonprod/java/google/registry/tools/GenerateSqlSchemaCommand.java`
#### Snippet
```java
              + "-- limitations under the License.\n";
      try {
        Files.write(outputFile.toPath(), copyright.getBytes(UTF_8));
      } catch (IOException e) {
        System.err.println("Error writing sql file: " + e);
```

### ReadWriteStringCanBeUsed
Can be replaced with 'Files.writeString()'
in `core/src/nonprod/java/google/registry/tools/GenerateSqlErDiagramCommand.java`
#### Snippet
```java
                  + "</script>");

      Files.write(
          diagram, doc.outerHtml().getBytes(StandardCharsets.UTF_8), StandardOpenOption.WRITE);
    } catch (IOException e) {
```

## RuleId[ruleID=NonShortCircuitBoolean]
### NonShortCircuitBoolean
Non-short-circuit boolean expression `good &= printUniqueElements(domains1, domains2, "domains", "deposit1")`
in `core/src/main/java/google/registry/tools/javascrap/CompareEscrowDepositsCommand.java`
#### Snippet
```java
    process(deposit2, domains2, registrars2);
    boolean good = true;
    good &= printUniqueElements(domains1, domains2, "domains", "deposit1");
    good &= printUniqueElements(domains2, domains1, "domains", "deposit2");
    good &= printUniqueElements(registrars1, registrars2, "registrars", "deposit1");
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `good &= printUniqueElements(domains2, domains1, "domains", "deposit2")`
in `core/src/main/java/google/registry/tools/javascrap/CompareEscrowDepositsCommand.java`
#### Snippet
```java
    boolean good = true;
    good &= printUniqueElements(domains1, domains2, "domains", "deposit1");
    good &= printUniqueElements(domains2, domains1, "domains", "deposit2");
    good &= printUniqueElements(registrars1, registrars2, "registrars", "deposit1");
    good &= printUniqueElements(registrars2, registrars1, "registrars", "deposit2");
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `good &= printUniqueElements(registrars1, registrars2, "registrars", "deposit1")`
in `core/src/main/java/google/registry/tools/javascrap/CompareEscrowDepositsCommand.java`
#### Snippet
```java
    good &= printUniqueElements(domains1, domains2, "domains", "deposit1");
    good &= printUniqueElements(domains2, domains1, "domains", "deposit2");
    good &= printUniqueElements(registrars1, registrars2, "registrars", "deposit1");
    good &= printUniqueElements(registrars2, registrars1, "registrars", "deposit2");
    if (good) {
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `good &= printUniqueElements(registrars2, registrars1, "registrars", "deposit2")`
in `core/src/main/java/google/registry/tools/javascrap/CompareEscrowDepositsCommand.java`
#### Snippet
```java
    good &= printUniqueElements(domains2, domains1, "domains", "deposit2");
    good &= printUniqueElements(registrars1, registrars2, "registrars", "deposit1");
    good &= printUniqueElements(registrars2, registrars1, "registrars", "deposit2");
    if (good) {
      System.out.println(
```

## RuleId[ruleID=UnnecessaryReturn]
### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `core/src/main/java/google/registry/ui/server/registrar/ConsoleOteSetupAction.java`
#### Snippet
```java
        return;
      default:
        return;
    }
  }
```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `core/src/main/java/google/registry/ui/server/registrar/ConsoleRegistrarCreatorAction.java`
#### Snippet
```java
        return;
      default:
        return;
    }
  }
```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `core/src/main/java/google/registry/tools/ConfirmingCommand.java`
#### Snippet
```java
        // This typically happens when all of the work is accomplished inside of prompt(), so do
        // nothing further.
        return;
      } else if (force || promptForYes("Perform this command?")) {
        System.out.println("Running ... ");
```

## RuleId[ruleID=TextBlockMigration]
### TextBlockMigration
Concatenation can be replaced with text block
in `core/src/nonprod/java/google/registry/tools/GenerateSqlSchemaCommand.java`
#### Snippet
```java
    } else if (databaseHost == null) {
      System.err.println(
          "You must specify either --start_postgresql to start a PostgreSQL database in a\n"
              + "docker instance, or specify --db_host (and, optionally, --db_port) to identify\n"
              + "the location of a running instance.  To start a long-lived instance (suitable\n"
```

### TextBlockMigration
Concatenation can be replaced with text block
in `core/src/nonprod/java/google/registry/tools/GenerateSqlSchemaCommand.java`
#### Snippet
```java
      // existing data in the file.
      String copyright =
          "-- Copyright 2019 The Nomulus Authors. All Rights Reserved.\n"
              + "--\n"
              + "-- Licensed under the Apache License, Version 2.0 (the \"License\");\n"
```

## RuleId[ruleID=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends RegistrarPoc`
in `core/src/main/java/google/registry/ui/server/RegistrarFormFields.java`
#### Snippet
```java

  public static ImmutableList<RegistrarPoc.Builder> getRegistrarContactBuilders(
      ImmutableSet<RegistrarPoc> existingContacts, @Nullable Map<String, ?> args) {
    if (args == null) {
      return ImmutableList.of();
```

### BoundedWildcard
Can generalize to `? extends List`
in `core/src/main/java/google/registry/ui/server/RegistrarFormFields.java`
#### Snippet
```java
  private static @Nullable RegistrarAddress toNewAddress(
      @Nullable Map<String, ?> args,
      final FormField<List<String>, List<String>> streetField,
      final FormField<String, String> cityField,
      final FormField<String, String> stateField,
```

### BoundedWildcard
Can generalize to `? extends Supplier`
in `core/src/main/java/google/registry/rde/RdeFragmenter.java`
#### Snippet
```java

  public RdeFragmenter(
      ImmutableMap<DateTime, Supplier<EppResource>> resourceAtTimes, RdeMarshaller marshaller) {
    this.resourceAtTimes = resourceAtTimes;
    this.marshaller = marshaller;
```

### BoundedWildcard
Can generalize to `? extends T`
in `core/src/main/java/google/registry/rde/PgpUtils.java`
#### Snippet
```java
   * ugly. Moving the casts to a dedicated function makes it all clearer.
   */
  static <T> Stream<T> stream(PGPEncryptedDataList ciphertexts, Class<T> expect) {
    return Streams.stream((Iterable<?>) ciphertexts)
        .map(ciphertext -> PgpUtils.pgpCast(ciphertext, expect));
```

### BoundedWildcard
Can generalize to `? super Type`
in `core/src/main/java/google/registry/ui/server/registrar/RegistrarSettingsAction.java`
#### Snippet
```java
   */
  private static void ensurePhoneNumberNotRemovedForContactTypes(
      Multimap<Type, RegistrarPoc> oldContactsByType,
      Multimap<Type, RegistrarPoc> newContactsByType,
      Type... types) {
```

### BoundedWildcard
Can generalize to `? extends RegistrarPoc`
in `core/src/main/java/google/registry/ui/server/registrar/RegistrarSettingsAction.java`
#### Snippet
```java
   */
  private static void ensurePhoneNumberNotRemovedForContactTypes(
      Multimap<Type, RegistrarPoc> oldContactsByType,
      Multimap<Type, RegistrarPoc> newContactsByType,
      Type... types) {
```

### BoundedWildcard
Can generalize to `? super Type`
in `core/src/main/java/google/registry/ui/server/registrar/RegistrarSettingsAction.java`
#### Snippet
```java
  private static void ensurePhoneNumberNotRemovedForContactTypes(
      Multimap<Type, RegistrarPoc> oldContactsByType,
      Multimap<Type, RegistrarPoc> newContactsByType,
      Type... types) {
    for (Type type : types) {
```

### BoundedWildcard
Can generalize to `? extends RegistrarPoc`
in `core/src/main/java/google/registry/ui/server/registrar/RegistrarSettingsAction.java`
#### Snippet
```java
  private static void ensurePhoneNumberNotRemovedForContactTypes(
      Multimap<Type, RegistrarPoc> oldContactsByType,
      Multimap<Type, RegistrarPoc> newContactsByType,
      Type... types) {
    for (Type type : types) {
```

### BoundedWildcard
Can generalize to `? extends RegistrarPoc`
in `core/src/main/java/google/registry/ui/server/registrar/RegistrarSettingsAction.java`
#### Snippet
```java

  private Map<String, Object> expandRegistrarWithContacts(
      Iterable<RegistrarPoc> contacts, Registrar registrar) {
    ImmutableSet<Map<String, Object>> expandedContacts =
        Streams.stream(contacts)
```

### BoundedWildcard
Can generalize to `? extends RegistrarPoc`
in `core/src/main/java/google/registry/ui/server/registrar/RegistrarSettingsAction.java`
#### Snippet
```java

  private static void checkContactRegistryLockRequirements(
      ImmutableSet<RegistrarPoc> existingContacts, ImmutableSet<RegistrarPoc> updatedContacts) {
    // Any contact(s) with new passwords must be allowed to set them
    for (RegistrarPoc updatedContact : updatedContacts) {
```

### BoundedWildcard
Can generalize to `? extends ImmutableSet`
in `core/src/main/java/google/registry/dns/writer/clouddns/CloudDnsWriter.java`
#### Snippet
```java
  /** Mutate the zone with the provided map of hostnames to desired DNS records. */
  @VisibleForTesting
  void mutateZone(ImmutableMap<String, ImmutableSet<ResourceRecordSet>> desiredRecords) {
    logger.atInfo().log("Updating DNS records for hostname(s) %s.", desiredRecords.keySet());
    // Fetch all existing records for names that this writer is trying to modify
```

### BoundedWildcard
Can generalize to `? extends InternetAddress`
in `core/src/main/java/google/registry/dns/PublishDnsUpdatesAction.java`
#### Snippet
```java
      @Config("dnsUpdateFailEmailBodyText") String dnsUpdateFailEmailBodyText,
      @Config("dnsUpdateFailRegistryName") String dnsUpdateFailRegistryName,
      @Config("registrySupportEmail") Lazy<InternetAddress> registrySupportEmail,
      @Config("registryCcEmail") Lazy<InternetAddress> registryCcEmail,
      @Config("gSuiteOutgoingEmailAddress") InternetAddress gSuiteOutgoingEmailAddress,
```

### BoundedWildcard
Can generalize to `? extends InternetAddress`
in `core/src/main/java/google/registry/dns/PublishDnsUpdatesAction.java`
#### Snippet
```java
      @Config("dnsUpdateFailRegistryName") String dnsUpdateFailRegistryName,
      @Config("registrySupportEmail") Lazy<InternetAddress> registrySupportEmail,
      @Config("registryCcEmail") Lazy<InternetAddress> registryCcEmail,
      @Config("gSuiteOutgoingEmailAddress") InternetAddress gSuiteOutgoingEmailAddress,
      @Header(APP_ENGINE_RETRY_HEADER) Optional<Integer> appEngineRetryCount,
```

### BoundedWildcard
Can generalize to `? extends PGPPublicKey`
in `core/src/main/java/google/registry/rde/RydeEncryption.java`
#### Snippet
```java
      @WillNotClose OutputStream os,
      boolean withIntegrityPacket,
      Collection<PGPPublicKey> receiverKeys) {
    try {
      PGPEncryptedDataGenerator encryptor =
```

### BoundedWildcard
Can generalize to `? super String`
in `core/src/main/java/google/registry/ui/forms/FormField.java`
#### Snippet
```java
      private final Splitter splitter;

      SplitToListFunction(FormField<String, O> itemField, Splitter splitter) {
        this.itemField = itemField;
        this.splitter = splitter;
```

### BoundedWildcard
Can generalize to `? extends O`
in `core/src/main/java/google/registry/ui/forms/FormField.java`
#### Snippet
```java
      private final Splitter splitter;

      SplitToListFunction(FormField<String, O> itemField, Splitter splitter) {
        this.itemField = itemField;
        this.splitter = splitter;
```

### BoundedWildcard
Can generalize to `? super Integer`
in `core/src/main/java/google/registry/ui/forms/FormField.java`
#### Snippet
```java
      }

      private void checkRangeContains(Range<Integer> range, int value, String message) {
        if (!range.contains(value)) {
          throw new FormFieldException(
```

### BoundedWildcard
Can generalize to `? extends I`
in `core/src/main/java/google/registry/ui/forms/FormField.java`
#### Snippet
```java
   */
  @Detainted
  public Optional<O> extract(@Tainted Map<String, I> valueMap) {
    return convert(valueMap.get(name));
  }
```

### BoundedWildcard
Can generalize to `? super String`
in `core/src/main/java/google/registry/ui/forms/FormField.java`
#### Snippet
```java
      private final Splitter splitter;

      SplitToSetFunction(FormField<String, O> itemField, Splitter splitter) {
        this.itemField = itemField;
        this.splitter = splitter;
```

### BoundedWildcard
Can generalize to `? extends O`
in `core/src/main/java/google/registry/ui/forms/FormField.java`
#### Snippet
```java
      private final Splitter splitter;

      SplitToSetFunction(FormField<String, O> itemField, Splitter splitter) {
        this.itemField = itemField;
        this.splitter = splitter;
```

### BoundedWildcard
Can generalize to `? extends O`
in `core/src/main/java/google/registry/ui/forms/FormField.java`
#### Snippet
```java
      private final FormField<I, O> itemField;

      ToListFunction(FormField<I, O> itemField) {
        this.itemField = itemField;
      }
```

### BoundedWildcard
Can generalize to `? extends Iterable`
in `core/src/main/java/google/registry/beam/resave/ResaveAllEppResourcesPipeline.java`
#### Snippet
```java
    @ProcessElement
    public void processElement(
        @Element KV<ShardedKey<Integer>, Iterable<String>> element,
        OutputReceiver<Void> outputReceiver) {
      jpaTm()
```

### BoundedWildcard
Can generalize to `? super KV`
in `core/src/main/java/google/registry/beam/spec11/SafeBrowsingTransforms.java`
#### Snippet
```java
    private void processResponse(
        CloseableHttpResponse response,
        ImmutableSet.Builder<KV<DomainNameInfo, ThreatMatch>> resultBuilder)
        throws JSONException, IOException {
      int statusCode = response.getStatusLine().getStatusCode();
```

### BoundedWildcard
Can generalize to `? extends PendingDeposit`
in `core/src/main/java/google/registry/beam/rde/RdeIO.java`
#### Snippet
```java
    @ProcessElement
    public void processElement(
        @Element KV<PendingDeposit, Integer> input, PipelineOptions options) {
      tm().transact(
              () -> {
```

### BoundedWildcard
Can generalize to `? extends KV`
in `core/src/main/java/google/registry/beam/spec11/Spec11Pipeline.java`
#### Snippet
```java

  static void saveToGcs(
      PCollection<KV<DomainNameInfo, ThreatMatch>> threatMatches, Spec11PipelineOptions options) {
    threatMatches
        .apply(
```

### BoundedWildcard
Can generalize to `? super DomainNameInfo`
in `core/src/main/java/google/registry/beam/spec11/Spec11Pipeline.java`
#### Snippet
```java
                  @ProcessElement
                  public void processElement(
                      @Element KV<String, String> input, OutputReceiver<DomainNameInfo> output) {
                    Domain domain =
                        jpaTm()
```

### BoundedWildcard
Can generalize to `? extends Domain`
in `core/src/main/java/google/registry/rdap/RdapDomainSearchAction.java`
#### Snippet
```java
   */
  private DomainSearchResponse makeSearchResults(
      List<Domain> domains,
      IncompletenessWarningType incompletenessWarningType,
      Optional<Long> numDomainsRetrieved) {
```

### BoundedWildcard
Can generalize to `? extends Host`
in `core/src/main/java/google/registry/rdap/RdapNameserverSearchAction.java`
#### Snippet
```java
  /** Output JSON for a list of hosts. */
  private NameserverSearchResponse makeSearchResults(
      List<Host> hosts,
      IncompletenessWarningType incompletenessWarningType,
      int numHostsRetrieved,
```

### BoundedWildcard
Can generalize to `? extends T`
in `core/src/main/java/google/registry/rdap/RdapSearchActionBase.java`
#### Snippet
```java

  protected <T extends EppResource> RdapResultSet<T> filterResourcesByVisibility(
      List<T> queryResult, int querySizeLimit) {
    // If we are including deleted resources, we need to check that we're authorized for each one.
    List<T> resources = new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? extends Contact`
in `core/src/main/java/google/registry/rdap/RdapEntitySearchAction.java`
#### Snippet
```java
   */
  private EntitySearchResponse makeSearchResults(
      List<Contact> contacts,
      IncompletenessWarningType incompletenessWarningType,
      int numContactsRetrieved,
```

### BoundedWildcard
Can generalize to `? extends Registrar`
in `core/src/main/java/google/registry/rdap/RdapEntitySearchAction.java`
#### Snippet
```java
      IncompletenessWarningType incompletenessWarningType,
      int numContactsRetrieved,
      List<Registrar> registrars,
      QueryType queryType) {

```

### BoundedWildcard
Can generalize to `? extends ContactHistory`
in `core/src/main/java/google/registry/batch/WipeOutContactHistoryPiiAction.java`
#### Snippet
```java
  /** Wipes out the PII of each of the {@link ContactHistory} entities in the stream. */
  @VisibleForTesting
  int wipeOutContactHistoryData(Stream<ContactHistory> contactHistoryEntities) {
    AtomicInteger numOfEntities = new AtomicInteger(0);
    contactHistoryEntities.forEach(
```

### BoundedWildcard
Can generalize to `? extends Connection`
in `core/src/main/java/google/registry/batch/WipeOutCloudSqlAction.java`
#### Snippet
```java
  @Inject
  WipeOutCloudSqlAction(
      @SchemaManagerConnection Supplier<Connection> connectionSupplier,
      Response response,
      Retrier retrier) {
```

### BoundedWildcard
Can generalize to `? extends CommandExtension`
in `core/src/main/java/google/registry/flows/ExtensionManager.java`
#### Snippet
```java

  private static void checkForUnimplementedExtensions(
      ImmutableList<CommandExtension> suppliedExtensionInstances,
      ImmutableSet<Class<? extends CommandExtension>> implementedExtensionClasses)
          throws UnimplementedExtensionException {
```

### BoundedWildcard
Can generalize to `? super String`
in `core/src/main/java/google/registry/batch/DeleteProberDataAction.java`
#### Snippet
```java
  private void processDomain(
      Domain domain,
      ImmutableList.Builder<String> domainRepoIdsToHardDelete,
      ImmutableList.Builder<String> hostNamesToHardDelete,
      AtomicInteger softDeletedDomains,
```

### BoundedWildcard
Can generalize to `? super String`
in `core/src/main/java/google/registry/batch/DeleteProberDataAction.java`
#### Snippet
```java
      Domain domain,
      ImmutableList.Builder<String> domainRepoIdsToHardDelete,
      ImmutableList.Builder<String> hostNamesToHardDelete,
      AtomicInteger softDeletedDomains,
      AtomicInteger hardDeletedDomains) {
```

### BoundedWildcard
Can generalize to `? extends BillingEvent.OneTime`
in `core/src/main/java/google/registry/batch/ExpandRecurringBillingEventsAction.java`
#### Snippet
```java
   */
  private static ImmutableSet<DateTime> getExistingBillingTimes(
      Iterable<BillingEvent.OneTime> oneTimesForDomain,
      final BillingEvent.Recurring recurringEvent) {
    return Streams.stream(oneTimesForDomain)
```

### BoundedWildcard
Can generalize to `? extends InetAddress`
in `core/src/main/java/google/registry/flows/TlsCredentials.java`
#### Snippet
```java
  /** Registrar IP address is not in stored allow list. */
  public static class BadRegistrarIpAddressException extends AuthenticationErrorException {
    BadRegistrarIpAddressException(Optional<InetAddress> clientInetAddr) {
      super(
          clientInetAddr.isPresent()
```

### BoundedWildcard
Can generalize to `? extends R`
in `core/src/main/java/google/registry/flows/ResourceFlowUtils.java`
#### Snippet
```java

  public static <R extends EppResource> R verifyExistence(
      Class<R> clazz, String targetId, Optional<R> resource) throws ResourceDoesNotExistException {
    return resource.orElseThrow(() -> new ResourceDoesNotExistException(clazz, targetId));
  }
```

### BoundedWildcard
Can generalize to `? extends AuthInfo`
in `core/src/main/java/google/registry/flows/ResourceFlowUtils.java`
#### Snippet
```java

  /** Check that the given AuthInfo is either missing or else is valid for the given resource. */
  public static void verifyOptionalAuthInfo(Optional<AuthInfo> authInfo, Contact contact)
      throws EppException {
    if (authInfo.isPresent()) {
```

### BoundedWildcard
Can generalize to `? extends AuthInfo`
in `core/src/main/java/google/registry/flows/ResourceFlowUtils.java`
#### Snippet
```java

  /** Check that the given AuthInfo is either missing or else is valid for the given resource. */
  public static void verifyOptionalAuthInfo(Optional<AuthInfo> authInfo, Domain domain)
      throws EppException {
    if (authInfo.isPresent()) {
```

### BoundedWildcard
Can generalize to `? extends EppInput`
in `core/src/main/java/google/registry/flows/custom/CustomLogicFactory.java`
#### Snippet
```java

  public DomainPricingCustomLogic forDomainPricing(
      Optional<EppInput> eppInput,
      Optional<SessionMetadata> sessionMetadata,
      Optional<FlowMetadata> flowMetadata) {
```

### BoundedWildcard
Can generalize to `? extends SessionMetadata`
in `core/src/main/java/google/registry/flows/custom/CustomLogicFactory.java`
#### Snippet
```java
  public DomainPricingCustomLogic forDomainPricing(
      Optional<EppInput> eppInput,
      Optional<SessionMetadata> sessionMetadata,
      Optional<FlowMetadata> flowMetadata) {
    return new DomainPricingCustomLogic(
```

### BoundedWildcard
Can generalize to `? extends FlowMetadata`
in `core/src/main/java/google/registry/flows/custom/CustomLogicFactory.java`
#### Snippet
```java
      Optional<EppInput> eppInput,
      Optional<SessionMetadata> sessionMetadata,
      Optional<FlowMetadata> flowMetadata) {
    return new DomainPricingCustomLogic(
        eppInput.orElse(null), sessionMetadata.orElse(null), flowMetadata.orElse(null));
```

### BoundedWildcard
Can generalize to `? super T`
in `core/src/main/java/google/registry/beam/common/RegistryJpaIO.java`
#### Snippet
```java

      @ProcessElement
      public void processElement(OutputReceiver<T> outputReceiver) {
        jpaTm()
            .transactNoRetry(
```

### BoundedWildcard
Can generalize to `? extends Iterable`
in `core/src/main/java/google/registry/beam/common/RegistryJpaIO.java`
#### Snippet
```java
    }

    private void actuallyProcessElement(@Element KV<ShardedKey<Integer>, Iterable<T>> kv) {
      ImmutableList<Object> entities =
          Streams.stream(kv.getValue())
```

### BoundedWildcard
Can generalize to `? super T`
in `core/src/main/java/google/registry/beam/common/RegistryJpaIO.java`
#### Snippet
```java
    private final SerializableFunction<T, Object> jpaConverter;

    SqlBatchWriter(String type, SerializableFunction<T, Object> jpaConverter) {
      counter = Metrics.counter("SQL_WRITE", type);
      this.jpaConverter = jpaConverter;
```

### BoundedWildcard
Can generalize to `? extends R`
in `core/src/main/java/google/registry/beam/common/RegistryJpaIO.java`
#### Snippet
```java

      QueryRunner(
          RegistryQuery<R> query,
          SerializableFunction<R, T> resultMapper,
          @Nullable String snapshotId) {
```

### BoundedWildcard
Can generalize to `? super R`
in `core/src/main/java/google/registry/beam/common/RegistryJpaIO.java`
#### Snippet
```java
      QueryRunner(
          RegistryQuery<R> query,
          SerializableFunction<R, T> resultMapper,
          @Nullable String snapshotId) {
        this.query = query;
```

### BoundedWildcard
Can generalize to `? extends T`
in `core/src/main/java/google/registry/beam/common/RegistryJpaIO.java`
#### Snippet
```java
      QueryRunner(
          RegistryQuery<R> query,
          SerializableFunction<R, T> resultMapper,
          @Nullable String snapshotId) {
        this.query = query;
```

### BoundedWildcard
Can generalize to `? super DateTime`
in `core/src/main/java/google/registry/flows/certs/CertificateChecker.java`
#### Snippet
```java
  public CertificateChecker(
      @Config("maxValidityDaysSchedule")
          ImmutableSortedMap<DateTime, Integer> maxValidityDaysSchedule,
      @Config("expirationWarningDays") int expirationWarningDays,
      @Config("expirationWarningIntervalDays") int expirationWarningIntervalDays,
```

### BoundedWildcard
Can generalize to `? extends FeeUpdateCommandExtension`
in `core/src/main/java/google/registry/flows/domain/DomainRestoreRequestFlow.java`
#### Snippet
```java
  private static ImmutableList<FeeTransformResponseExtension> createResponseExtensions(
      FeesAndCredits feesAndCredits,
      Optional<FeeUpdateCommandExtension> feeUpdate,
      boolean isExpired) {
    ImmutableList.Builder<Fee> fees = new ImmutableList.Builder<>();
```

### BoundedWildcard
Can generalize to `? extends FeeUpdateCommandExtension`
in `core/src/main/java/google/registry/flows/domain/DomainRestoreRequestFlow.java`
#### Snippet
```java
      Update command,
      Domain existingDomain,
      Optional<FeeUpdateCommandExtension> feeUpdate,
      FeesAndCredits feesAndCredits,
      DateTime now)
```

### BoundedWildcard
Can generalize to `? extends FeesAndCredits`
in `core/src/main/java/google/registry/flows/domain/DomainTransferRequestFlow.java`
#### Snippet
```java

  private static ImmutableList<FeeTransformResponseExtension> createResponseExtensions(
      Optional<FeesAndCredits> feesAndCredits, Optional<FeeTransferCommandExtension> feeTransfer) {
    return feeTransfer.isPresent() && feesAndCredits.isPresent()
        ? ImmutableList.of(
```

### BoundedWildcard
Can generalize to `? extends FeeTransferCommandExtension`
in `core/src/main/java/google/registry/flows/domain/DomainTransferRequestFlow.java`
#### Snippet
```java

  private static ImmutableList<FeeTransformResponseExtension> createResponseExtensions(
      Optional<FeesAndCredits> feesAndCredits, Optional<FeeTransferCommandExtension> feeTransfer) {
    return feeTransfer.isPresent() && feesAndCredits.isPresent()
        ? ImmutableList.of(
```

### BoundedWildcard
Can generalize to `? extends AllocationToken`
in `core/src/main/java/google/registry/flows/domain/DomainRenewFlow.java`
#### Snippet
```java
      int years,
      HistoryEntryId domainHistoryId,
      Optional<AllocationToken> allocationToken,
      DateTime now) {
    return new BillingEvent.OneTime.Builder()
```

### BoundedWildcard
Can generalize to `? extends FeeRenewCommandExtension`
in `core/src/main/java/google/registry/flows/domain/DomainRenewFlow.java`
#### Snippet
```java

  private ImmutableList<FeeTransformResponseExtension> createResponseExtensions(
      FeesAndCredits feesAndCredits, Optional<FeeRenewCommandExtension> feeRenew) {
    return feeRenew
        .map(
```

### BoundedWildcard
Can generalize to `? extends AllocationToken`
in `core/src/main/java/google/registry/flows/domain/DomainPricingLogic.java`
#### Snippet
```java
  /** Returns the domain create cost with allocation-token-related discounts applied. */
  private Money getDomainCreateCostWithDiscount(
      DomainPrices domainPrices, int years, Optional<AllocationToken> allocationToken)
      throws EppException {
    if (allocationToken.isPresent()
```

### BoundedWildcard
Can generalize to `? extends BaseFee`
in `core/src/main/java/google/registry/flows/domain/FeesAndCredits.java`
#### Snippet
```java
    }

    public Builder setFeesAndCredits(ImmutableList<BaseFee> feesAndCredits) {
      ImmutableList.Builder<Fee> feeBuilder = new ImmutableList.Builder<>();
      ImmutableList.Builder<Credit> creditBuilder = new ImmutableList.Builder<>();
```

### BoundedWildcard
Can generalize to `? extends TransferServerApproveEntity`
in `core/src/main/java/google/registry/flows/domain/DomainTransferUtils.java`
#### Snippet
```java
      Long historyId,
      DomainTransferData.Builder transferDataBuilder,
      ImmutableSet<TransferServerApproveEntity> serverApproveEntities,
      Period transferPeriod) {
    ImmutableSet.Builder<VKey<? extends TransferServerApproveEntity>> serverApproveEntityKeys =
```

### BoundedWildcard
Can generalize to `? extends AllocationToken`
in `core/src/main/java/google/registry/flows/domain/token/AllocationTokenFlowUtils.java`
#### Snippet
```java

  public static Domain maybeApplyPackageRemovalToken(
      Domain domain, Optional<AllocationToken> allocationToken) {
    if (!allocationToken.isPresent()
        || !TokenBehavior.REMOVE_PACKAGE.equals(allocationToken.get().getTokenBehavior())) {
```

### BoundedWildcard
Can generalize to `? extends AllocationTokenExtension`
in `core/src/main/java/google/registry/flows/domain/token/AllocationTokenFlowUtils.java`
#### Snippet
```java
      String registrarId,
      DateTime now,
      Optional<AllocationTokenExtension> extension)
      throws EppException {
    if (!extension.isPresent()) {
```

### BoundedWildcard
Can generalize to `? extends AllocationToken`
in `core/src/main/java/google/registry/flows/domain/token/AllocationTokenFlowUtils.java`
#### Snippet
```java

  public static void verifyTokenAllowedOnDomain(
      Domain domain, Optional<AllocationToken> allocationToken) throws EppException {

    boolean domainHasPackageToken = domain.getCurrentPackageToken().isPresent();
```

### BoundedWildcard
Can generalize to `? extends AllocationTokenExtension`
in `core/src/main/java/google/registry/flows/domain/token/AllocationTokenFlowUtils.java`
#### Snippet
```java
      String registrarId,
      DateTime now,
      Optional<AllocationTokenExtension> extension)
      throws EppException {
    if (!extension.isPresent()) {
```

### BoundedWildcard
Can generalize to `? extends FeeCreateCommandExtension`
in `core/src/main/java/google/registry/flows/domain/DomainCreateFlow.java`
#### Snippet
```java

  private static ImmutableList<FeeTransformResponseExtension> createResponseExtensions(
      Optional<FeeCreateCommandExtension> feeCreate, FeesAndCredits feesAndCredits) {
    return feeCreate
        .map(
```

### BoundedWildcard
Can generalize to `? extends AllocationToken`
in `core/src/main/java/google/registry/flows/domain/DomainCreateFlow.java`
#### Snippet
```java
      DateTime now,
      String domainLabel,
      Optional<AllocationToken> allocationToken,
      boolean isAnchorTenant,
      boolean isValidReservedCreate,
```

### BoundedWildcard
Can generalize to `? extends AllocationToken`
in `core/src/main/java/google/registry/flows/domain/DomainCreateFlow.java`
#### Snippet
```java
  static RenewalPriceInfo getRenewalPriceInfo(
      boolean isAnchorTenant,
      Optional<AllocationToken> allocationToken,
      FeesAndCredits feesAndCredits) {
    if (isAnchorTenant) {
```

### BoundedWildcard
Can generalize to `? extends AllocationToken`
in `core/src/main/java/google/registry/flows/domain/DomainCreateFlow.java`
#### Snippet
```java
      FeesAndCredits feesAndCredits,
      HistoryEntryId domainHistoryId,
      Optional<AllocationToken> allocationToken,
      DateTime now) {
    ImmutableSet.Builder<Flag> flagsBuilder = new ImmutableSet.Builder<>();
```

### BoundedWildcard
Can generalize to `? super Registrar.Builder`
in `core/src/main/java/google/registry/model/OteAccountBuilder.java`
#### Snippet
```java
   */
  private OteAccountBuilder transformRegistrars(
      Function<Registrar.Builder, Registrar.Builder> func) {
    registrars =
        registrars.stream()
```

### BoundedWildcard
Can generalize to `? extends Registrar.Builder`
in `core/src/main/java/google/registry/model/OteAccountBuilder.java`
#### Snippet
```java
   */
  private OteAccountBuilder transformRegistrars(
      Function<Registrar.Builder, Registrar.Builder> func) {
    registrars =
        registrars.stream()
```

### BoundedWildcard
Can generalize to `? extends R`
in `core/src/main/java/google/registry/model/ofy/CommitLoggedWork.java`
#### Snippet
```java
  private boolean runCalled;

  CommitLoggedWork(Supplier<R> work, Clock clock) {
    this.work = work;
    this.clock = clock;
```

### BoundedWildcard
Can generalize to `? super HistoryEntry.Type`
in `core/src/main/java/google/registry/model/OteStats.java`
#### Snippet
```java
    StatType(
        int requirement,
        Predicate<HistoryEntry.Type> typeFilter,
        Predicate<EppInput> eppInputFilter) {
      this.requirement = requirement;
```

### BoundedWildcard
Can generalize to `? extends EppInput`
in `core/src/main/java/google/registry/model/OteStats.java`
#### Snippet
```java
     * Check if the {@link HistoryEntry} type matches as well as the {@link EppInput} if supplied.
     */
    private boolean matches(HistoryEntry.Type historyType, Optional<EppInput> eppInput) {
      if (eppInputFilter.isPresent() && eppInput.isPresent()) {
        return typeFilter.test(historyType) && eppInputFilter.get().test(eppInput.get());
```

### BoundedWildcard
Can generalize to `? extends Key`
in `core/src/main/java/google/registry/model/ofy/TransactionInfo.java`
#### Snippet
```java
  }

  void putSaves(Map<Key<?>, ?> keysToEntities) {
    assertNotReadOnly();
    changesBuilder.putAll(keysToEntities);
```

### BoundedWildcard
Can generalize to `? extends Key`
in `core/src/main/java/google/registry/model/ofy/TransactionInfo.java`
#### Snippet
```java
  }

  void putDeletes(Iterable<Key<?>> keys) {
    assertNotReadOnly();
    changesBuilder.putAll(toMap(keys, k -> Delete.SENTINEL));
```

### BoundedWildcard
Can generalize to `? extends MetricsReservedListMatch`
in `core/src/main/java/google/registry/model/tld/label/DomainLabelMetrics.java`
#### Snippet
```java
  /** Update all three reserved list metrics. */
  static void recordReservedListCheckOutcome(
      String tld, ImmutableSet<MetricsReservedListMatch> matches, double elapsedMillis) {
    MetricsReservedListMatch mostSevereMatch = null;
    for (MetricsReservedListMatch match : matches) {
```

### BoundedWildcard
Can generalize to `? extends Domain`
in `core/src/main/java/google/registry/flows/domain/DomainCheckFlow.java`
#### Snippet
```java

  private ImmutableMap<String, BillingEvent.Recurring> loadRecurrencesForDomains(
      ImmutableMap<String, Domain> domainObjs) {
    return tm().transact(
            () -> {
```

### BoundedWildcard
Can generalize to `? extends VKey`
in `core/src/main/java/google/registry/flows/domain/DomainCheckFlow.java`
#### Snippet
```java
      FeeCheckCommandExtension<?, ?> feeCheck,
      ImmutableMap<String, InternetDomainName> domainNames,
      ImmutableMap<String, VKey<Domain>> existingDomains) {
    ImmutableList<String> restoreCheckDomains;
    if (feeCheck instanceof FeeCheckCommandExtensionV06) {
```

### BoundedWildcard
Can generalize to `? extends VKey`
in `core/src/main/java/google/registry/model/EppResource.java`
#### Snippet
```java
   */
  public static ImmutableMap<VKey<? extends EppResource>, EppResource> loadCached(
      Iterable<VKey<? extends EppResource>> keys) {
    if (!RegistryConfig.isEppResourceCachingEnabled()) {
      return tm().loadByKeys(keys);
```

### BoundedWildcard
Can generalize to `? extends DesignatedContact`
in `core/src/main/java/google/registry/flows/domain/DomainFlowUtils.java`
#### Snippet
```java

  static void validateRequiredContactsPresent(
      @Nullable VKey<Contact> registrant, Set<DesignatedContact> contacts)
      throws RequiredParameterMissingException {
    if (registrant == null) {
```

### BoundedWildcard
Can generalize to `? extends DesignatedContact`
in `core/src/main/java/google/registry/flows/domain/DomainFlowUtils.java`
#### Snippet
```java
  /** Verify that no linked resources have disallowed statuses. */
  static void verifyNotInPendingDelete(
      Set<DesignatedContact> contacts, VKey<Contact> registrant, Set<VKey<Host>> nameservers)
      throws EppException {
    ImmutableList.Builder<VKey<? extends EppResource>> keysToLoad = new ImmutableList.Builder<>();
```

### BoundedWildcard
Can generalize to `? extends Contact`
in `core/src/main/java/google/registry/flows/domain/DomainFlowUtils.java`
#### Snippet
```java
  /** Verify that no linked resources have disallowed statuses. */
  static void verifyNotInPendingDelete(
      Set<DesignatedContact> contacts, VKey<Contact> registrant, Set<VKey<Host>> nameservers)
      throws EppException {
    ImmutableList.Builder<VKey<? extends EppResource>> keysToLoad = new ImmutableList.Builder<>();
```

### BoundedWildcard
Can generalize to `? extends VKey`
in `core/src/main/java/google/registry/flows/domain/DomainFlowUtils.java`
#### Snippet
```java
  /** Verify that no linked resources have disallowed statuses. */
  static void verifyNotInPendingDelete(
      Set<DesignatedContact> contacts, VKey<Contact> registrant, Set<VKey<Host>> nameservers)
      throws EppException {
    ImmutableList.Builder<VKey<? extends EppResource>> keysToLoad = new ImmutableList.Builder<>();
```

### BoundedWildcard
Can generalize to `? super ResponseExtension`
in `core/src/main/java/google/registry/flows/domain/DomainFlowUtils.java`
#### Snippet
```java
   */
  static void addSecDnsExtensionIfPresent(
      ImmutableList.Builder<ResponseExtension> extensions, ImmutableSet<DomainDsData> dsData) {
    if (!dsData.isEmpty()) {
      extensions.add(SecDnsInfoExtension.create(dsData));
```

### BoundedWildcard
Can generalize to `? extends DesignatedContact`
in `core/src/main/java/google/registry/flows/domain/DomainFlowUtils.java`
#### Snippet
```java

  static ImmutableSet<ForeignKeyedDesignatedContact> loadForeignKeyedDesignatedContacts(
      ImmutableSet<DesignatedContact> contacts) {
    ImmutableSet.Builder<ForeignKeyedDesignatedContact> builder = new ImmutableSet.Builder<>();
    for (DesignatedContact contact : contacts) {
```

### BoundedWildcard
Can generalize to `? extends AllocationToken`
in `core/src/main/java/google/registry/flows/domain/DomainFlowUtils.java`
#### Snippet
```java
  /** Returns whether a given domain create request is for a valid reserved domain. */
  public static boolean isValidReservedCreate(
      InternetDomainName domainName, Optional<AllocationToken> token) {
    // If the domain is reserved for specific use, then check if the allocation token exists and
    // is for this domain.
```

### BoundedWildcard
Can generalize to `? extends DesignatedContact`
in `core/src/main/java/google/registry/flows/domain/DomainFlowUtils.java`
#### Snippet
```java
  }

  static void validateNoDuplicateContacts(Set<DesignatedContact> contacts)
      throws ParameterValuePolicyErrorException {
    ImmutableMultimap<Type, VKey<Contact>> contactsByType =
```

### BoundedWildcard
Can generalize to `? extends AllocationToken`
in `core/src/main/java/google/registry/flows/domain/DomainFlowUtils.java`
#### Snippet
```java
  public static boolean isAnchorTenant(
      InternetDomainName domainName,
      Optional<AllocationToken> token,
      Optional<MetadataExtension> metadataExtension) {
    // If the domain is reserved for anchor tenants, then check if the allocation token exists and
```

### BoundedWildcard
Can generalize to `? extends MetadataExtension`
in `core/src/main/java/google/registry/flows/domain/DomainFlowUtils.java`
#### Snippet
```java
      InternetDomainName domainName,
      Optional<AllocationToken> token,
      Optional<MetadataExtension> metadataExtension) {
    // If the domain is reserved for anchor tenants, then check if the allocation token exists and
    // is for this domain.
```

### BoundedWildcard
Can generalize to `? extends Fee`
in `core/src/main/java/google/registry/flows/domain/DomainFlowUtils.java`
#### Snippet
```java
  }

  private static ImmutableMap<FeeType, Money> buildFeeMap(List<Fee> fees, CurrencyUnit currency)
      throws ParameterValuePolicyErrorException {
    ImmutableMultimap.Builder<FeeType, Money> mapBuilder =
```

### BoundedWildcard
Can generalize to `? extends Domain`
in `core/src/main/java/google/registry/flows/domain/DomainFlowUtils.java`
#### Snippet
```java
      FeeQueryResponseExtensionItem.Builder<?, ?> builder,
      InternetDomainName domainName,
      Optional<Domain> domain,
      @Nullable CurrencyUnit topLevelCurrency,
      DateTime currentDate,
```

### BoundedWildcard
Can generalize to `? extends EppResource`
in `core/src/main/java/google/registry/flows/domain/DomainFlowUtils.java`
#### Snippet
```java
  }

  private static void verifyNotInPendingDelete(Iterable<EppResource> resources)
      throws EppException {
    for (EppResource resource : resources) {
```

### BoundedWildcard
Can generalize to `? extends DomainDsData`
in `core/src/main/java/google/registry/flows/domain/DomainFlowUtils.java`
#### Snippet
```java

  /** Check that the DS data that will be set on a domain is valid. */
  static void validateDsData(Set<DomainDsData> dsData) throws EppException {
    if (dsData != null) {
      if (dsData.size() > MAX_DS_RECORDS_PER_DOMAIN) {
```

### BoundedWildcard
Can generalize to `? extends DesignatedContact`
in `core/src/main/java/google/registry/flows/domain/DomainFlowUtils.java`
#### Snippet
```java
  }

  static void validateContactsHaveTypes(Set<DesignatedContact> contacts)
      throws ParameterValuePolicyErrorException {
    for (DesignatedContact contact : contacts) {
```

### BoundedWildcard
Can generalize to `? extends BigDecimal`
in `core/src/main/java/google/registry/model/tld/label/PremiumList.java`
#### Snippet
```java
    }

    public Builder setLabelsToPrices(Map<String, BigDecimal> labelsToPrices) {
      getInstance().labelsToPrices = ImmutableMap.copyOf(labelsToPrices);
      return this;
```

### BoundedWildcard
Can generalize to `? extends InetAddress`
in `core/src/main/java/google/registry/model/host/HostBase.java`
#### Snippet
```java
    }

    public B addInetAddresses(ImmutableSet<InetAddress> inetAddresses) {
      return setInetAddresses(
          ImmutableSet.copyOf(union(getInstance().getInetAddresses(), inetAddresses)));
```

### BoundedWildcard
Can generalize to `? extends Cursor`
in `core/src/main/java/google/registry/model/common/Cursor.java`
#### Snippet
```java
   * Returns the current time for a given cursor, or {@code START_OF_TIME} if the cursor is null.
   */
  public static DateTime getCursorTimeOrStartOfTime(Optional<Cursor> cursor) {
    return cursor.map(Cursor::getCursorTime).orElse(START_OF_TIME);
  }
```

### BoundedWildcard
Can generalize to `? extends ForeignKeyedDesignatedContact`
in `core/src/main/java/google/registry/model/domain/DomainCommand.java`
#### Snippet
```java

  private static Set<DesignatedContact> linkContacts(
      Set<ForeignKeyedDesignatedContact> contacts, DateTime now) throws InvalidReferencesException {
    if (contacts == null) {
      return null;
```

### BoundedWildcard
Can generalize to `? extends Fee`
in `core/src/main/java/google/registry/model/domain/fee12/FeeCheckResponseExtensionItemCommandV12.java`
#### Snippet
```java
    }

    public Builder setFee(List<Fee> fees) {
      getInstance().fee = forceEmptyToNull(ImmutableList.copyOf(fees));
      return this;
```

### BoundedWildcard
Can generalize to `? extends VKey`
in `core/src/main/java/google/registry/model/domain/packagetoken/PackageTokenResponseExtension.java`
#### Snippet
```java
  String token;

  public static PackageTokenResponseExtension create(Optional<VKey<AllocationToken>> tokenKey) {
    PackageTokenResponseExtension instance = new PackageTokenResponseExtension();
    instance.token = "";
```

### BoundedWildcard
Can generalize to `? extends Fee`
in `core/src/main/java/google/registry/model/domain/fee12/FeeCheckResponseExtensionItemV12.java`
#### Snippet
```java

    @Override
    public Builder setFees(ImmutableList<Fee> fees) {
      commandBuilder.setFee(forceEmptyToNull(ImmutableList.copyOf(fees)));
      return this;
```

### BoundedWildcard
Can generalize to `? extends DesignatedContact`
in `core/src/main/java/google/registry/model/domain/DomainBase.java`
#### Snippet
```java
    }

    public B addContacts(ImmutableSet<DesignatedContact> contacts) {
      return setContacts(ImmutableSet.copyOf(Sets.union(getInstance().getContacts(), contacts)));
    }
```

### BoundedWildcard
Can generalize to `? extends DesignatedContact`
in `core/src/main/java/google/registry/model/domain/DomainBase.java`
#### Snippet
```java
   * to be set in some circumstances but not in others.
   */
  void setContactFields(Set<DesignatedContact> contacts, boolean includeRegistrant) {
    // Set the individual contact fields.
    billingContact = techContact = adminContact = null;
```

### BoundedWildcard
Can generalize to `? extends VKey`
in `core/src/main/java/google/registry/model/domain/DomainBase.java`
#### Snippet
```java
    }

    public B addNameservers(ImmutableSet<VKey<Host>> nameservers) {
      return setNameservers(
          ImmutableSet.copyOf(Sets.union(getInstance().getNameservers(), nameservers)));
```

### BoundedWildcard
Can generalize to `? extends VKey`
in `core/src/main/java/google/registry/model/transfer/DomainTransferData.java`
#### Snippet
```java
  @SuppressWarnings("unchecked")
  static void mapBillingCancellationEntityToField(
      Set<VKey<? extends TransferServerApproveEntity>> serverApproveEntities,
      DomainTransferData domainTransferData) {
    if (isNullOrEmpty(serverApproveEntities)) {
```

### BoundedWildcard
Can generalize to `? extends Fee`
in `core/src/main/java/google/registry/model/domain/fee/FeeQueryResponseExtensionItem.java`
#### Snippet
```java
    }

    public B setFees(ImmutableList<Fee> fees) {
      // If there are no fees, set the field to null to suppress the 'fee' section in the xml.
      getInstance().fees = forceEmptyToNull(ImmutableList.copyOf(fees));
```

### BoundedWildcard
Can generalize to `? extends VKey`
in `core/src/main/java/google/registry/model/transfer/TransferData.java`
#### Snippet
```java
   */
  private static ImmutableList<Long> getSortedPollMessageIds(
      Set<VKey<? extends TransferServerApproveEntity>> serverApproveEntities) {
    return nullToEmpty(serverApproveEntities).stream()
        .filter(vKey -> PollMessage.class.isAssignableFrom(vKey.getKind()))
```

### BoundedWildcard
Can generalize to `? extends DomainCheck`
in `core/src/main/java/google/registry/model/eppoutput/CheckData.java`
#### Snippet
```java
  @XmlRootElement(name = "chkData", namespace = "urn:ietf:params:xml:ns:domain-1.0")
  public static class DomainCheckData extends CheckData {
    public static DomainCheckData create(ImmutableList<DomainCheck> checks) {
      return init(new DomainCheckData(), checks);
    }
```

### BoundedWildcard
Can generalize to `? extends ContactCheck`
in `core/src/main/java/google/registry/model/eppoutput/CheckData.java`
#### Snippet
```java
  @XmlRootElement(name = "chkData", namespace = "urn:ietf:params:xml:ns:contact-1.0")
  public static class ContactCheckData extends CheckData {
    public static ContactCheckData create(ImmutableList<ContactCheck> checks) {
      return init(new ContactCheckData(), checks);
    }
```

### BoundedWildcard
Can generalize to `? extends HostCheck`
in `core/src/main/java/google/registry/model/eppoutput/CheckData.java`
#### Snippet
```java
  @XmlRootElement(name = "chkData", namespace = "urn:ietf:params:xml:ns:host-1.0")
  public static class HostCheckData extends CheckData {
    public static HostCheckData create(ImmutableList<HostCheck> checks) {
      return init(new HostCheckData(), checks);
    }
```

### BoundedWildcard
Can generalize to `? extends T`
in `core/src/main/java/google/registry/model/reporting/HistoryEntryDao.java`
#### Snippet
```java
      DateTime afterTime,
      DateTime beforeTime,
      Class<T> subclazz) {
    Class<? extends HistoryEntry> expectedSubclazz =
        getHistoryClassFromParent(resourceKey.getKind());
```

### BoundedWildcard
Can generalize to `? extends RegistrarPoc`
in `core/src/main/java/google/registry/model/registrar/RegistrarPoc.java`
#### Snippet
```java
   */
  public static void updateContacts(
      final Registrar registrar, final ImmutableSet<RegistrarPoc> contacts) {
    tm().transact(
            () -> {
```

### BoundedWildcard
Can generalize to `? super Long`
in `core/src/main/java/google/registry/model/registrar/Registrar.java`
#### Snippet
```java
    private final Predicate<Long> ianaIdValidator;

    Type(Predicate<Long> ianaIdValidator) {
      this.ianaIdValidator = ianaIdValidator;
    }
```

### BoundedWildcard
Can generalize to `? extends CidrAddressBlock`
in `core/src/main/java/google/registry/model/registrar/Registrar.java`
#### Snippet
```java
    }

    public Builder setIpAddressAllowList(Iterable<CidrAddressBlock> ipAddressAllowList) {
      getInstance().ipAddressAllowList = ImmutableList.copyOf(ipAddressAllowList);
      return this;
```

### BoundedWildcard
Can generalize to `? extends VKey`
in `core/src/main/java/google/registry/tools/DeleteAllocationTokensCommand.java`
#### Snippet
```java

  /** Deletes a (filtered) batch of AllocationTokens and returns how many were deleted. */
  private long deleteBatch(List<VKey<AllocationToken>> batch) {
    // Load the tokens in the same transaction as they are deleted to verify they weren't redeemed
    // since the query ran. This also filters out per-domain tokens if they're not to be deleted.
```

### BoundedWildcard
Can generalize to `? super String`
in `core/src/main/java/google/registry/tools/UpdateDomainCommand.java`
#### Snippet
```java

  private void populateAddRemoveLists(
      Set<String> targetSet, Set<String> oldSet, Set<String> addSet, Set<String> removeSet) {
    addSet.addAll(Sets.difference(targetSet, oldSet));
    removeSet.addAll(Sets.difference(oldSet, targetSet));
```

### BoundedWildcard
Can generalize to `? super String`
in `core/src/main/java/google/registry/tools/UpdateDomainCommand.java`
#### Snippet
```java

  private void populateAddRemoveLists(
      Set<String> targetSet, Set<String> oldSet, Set<String> addSet, Set<String> removeSet) {
    addSet.addAll(Sets.difference(targetSet, oldSet));
    removeSet.addAll(Sets.difference(oldSet, targetSet));
```

### BoundedWildcard
Can generalize to `? extends RegistrarPoc`
in `core/src/main/java/google/registry/tools/RegistrarPocCommand.java`
#### Snippet
```java

  private void unsetOtherWhoisAbuseFlags(
      ImmutableSet<RegistrarPoc> contacts, @Nullable String emailAddressNotToChange) {
    for (RegistrarPoc contact : contacts) {
      if (!contact.getEmailAddress().equals(emailAddressNotToChange)
```

### BoundedWildcard
Can generalize to `? extends RegistrarPoc`
in `core/src/main/java/google/registry/tools/RegistrarPocCommand.java`
#### Snippet
```java
  }

  private void listContacts(Set<RegistrarPoc> contacts) throws IOException {
    List<String> result = new ArrayList<>();
    for (RegistrarPoc c : contacts) {
```

### BoundedWildcard
Can generalize to `? extends Credential`
in `core/src/main/java/google/registry/tools/AuthModule.java`
#### Snippet
```java
  public static String provideLocalCredentialJson(
      Lazy<GoogleClientSecrets> clientSecrets,
      @StoredCredential Lazy<Credential> credential,
      @Nullable @Config("credentialFilePath") String credentialFilePath) {
    try {
```

### BoundedWildcard
Can generalize to `? extends DsRecord`
in `core/src/main/java/google/registry/tools/DsRecord.java`
#### Snippet
```java
  }

  public static SoyListData convertToSoy(List<DsRecord> dsRecords) {
    return new SoyListData(dsRecords.stream().map(DsRecord::toSoyData).collect(toImmutableList()));
  }
```

### BoundedWildcard
Can generalize to `? super String`
in `core/src/main/java/google/registry/tools/ShellCommand.java`
#### Snippet
```java
     * @return the number of character back from the location that are part of the completions
     */
    int completeInternal(String buffer, int location, List<String> completions) {
      String truncatedBuffer = buffer.substring(0, location);
      String[] parsedBuffer = parseCommand(truncatedBuffer);
```

### BoundedWildcard
Can generalize to `? super String`
in `core/src/main/java/google/registry/tools/GenerateLordnCommand.java`
#### Snippet
```java

  private static void processDomain(
      ImmutableList.Builder<String> claimsCsv,
      ImmutableList.Builder<String> sunriseCsv,
      Domain domain) {
```

### BoundedWildcard
Can generalize to `? super String`
in `core/src/main/java/google/registry/tools/GenerateLordnCommand.java`
#### Snippet
```java
  private static void processDomain(
      ImmutableList.Builder<String> claimsCsv,
      ImmutableList.Builder<String> sunriseCsv,
      Domain domain) {
    String status = " ";
```

### BoundedWildcard
Can generalize to `? extends Cursor`
in `core/src/main/java/google/registry/tools/ListCursorsCommand.java`
#### Snippet
```java
  }

  private static String renderLine(String name, Optional<Cursor> cursor) {
    return String.format(
        OUTPUT_FMT,
```

### BoundedWildcard
Can generalize to `? extends AllocationToken`
in `core/src/main/java/google/registry/tools/GetAllocationTokenCommand.java`
#### Snippet
```java
  @SuppressWarnings("unchecked")
  private static ImmutableMap<VKey<Domain>, Domain> loadRedeemedDomains(
      Collection<AllocationToken> tokens) {
    ImmutableList<VKey<Domain>> domainKeys =
        tokens.stream()
```

### BoundedWildcard
Can generalize to `? extends V`
in `core/src/main/java/google/registry/tools/params/TransitionListParameter.java`
#### Snippet
```java

  @Override
  protected final ImmutableSortedMap<DateTime, V> processMap(ImmutableMap<DateTime, V> map) {
    checkArgument(Ordering.natural().isOrdered(map.keySet()), "Transition times out of order");
    return ImmutableSortedMap.copyOf(map);
```

### BoundedWildcard
Can generalize to `? super String`
in `core/src/main/java/google/registry/tools/server/GenerateZoneFilesAction.java`
#### Snippet
```java

  private void populateStanzasForSubordinateHosts(
      Domain domain, DateTime exportTime, ImmutableList.Builder<String> result) {
    ImmutableSet<String> subordinateHosts = domain.getSubordinateHosts();
    if (!subordinateHosts.isEmpty()) {
```

### BoundedWildcard
Can generalize to `? extends RegistrarPoc`
in `core/src/main/java/google/registry/whois/RegistrarWhoisResponse.java`
#### Snippet
```java
    /** Emits the registrar contact of the given type. */
    RegistrarEmitter emitRegistrarPocs(
        String contactLabel, Iterable<RegistrarPoc> contacts, AdminOrTech type) {
      for (RegistrarPoc contact : contacts) {
        if ((type == AdminOrTech.ADMIN && contact.getVisibleInWhoisAsAdmin())
```

### BoundedWildcard
Can generalize to `? extends VKey`
in `core/src/main/java/google/registry/whois/DomainWhoisResponse.java`
#### Snippet
```java
    /** Emit the contact entry of the given type. */
    DomainEmitter emitContact(
        String contactType, Optional<VKey<Contact>> contact, boolean preferUnicode) {
      if (!contact.isPresent()) {
        return this;
```

### BoundedWildcard
Can generalize to `? extends GracePeriod`
in `core/src/main/java/google/registry/whois/DomainWhoisResponse.java`
#### Snippet
```java
    /** Emits status values and grace periods as a set, in the AWIP format. */
    DomainEmitter emitStatusValues(
        Set<StatusValue> statusValues, Set<GracePeriod> gracePeriods) {
      ImmutableSet.Builder<EppEnum> combinedStatuses = new ImmutableSet.Builder<>();
      combinedStatuses.addAll(statusValues);
```

### BoundedWildcard
Can generalize to `? extends Throwable`
in `core/src/main/java/google/registry/export/SyncGroupMembersAction.java`
#### Snippet
```java
  @Inject SyncGroupMembersAction() {}

  private void sendResponse(Result result, @Nullable List<Throwable> causes) {
    nullToEmpty(causes).forEach(result::log);
    response.setStatus(result.statusCode);
```

### BoundedWildcard
Can generalize to `? extends ToolsRequestComponent.Builder`
in `core/src/main/java/google/registry/module/tools/ToolsRequestHandler.java`
#### Snippet
```java

  @Inject ToolsRequestHandler(
      Provider<ToolsRequestComponent.Builder> componentBuilderProvider,
      RequestAuthenticator requestAuthenticator) {
    super(componentBuilderProvider, requestAuthenticator);
```

### BoundedWildcard
Can generalize to `? extends ImmutableMap`
in `core/src/main/java/google/registry/export/sheet/SheetSynchronizer.java`
#### Snippet
```java
   * @see <a href="https://developers.google.com/sheets/">Google Sheets API v4</a>
   */
  void synchronize(String spreadsheetId, ImmutableList<ImmutableMap<String, String>> data)
      throws IOException {

```

### BoundedWildcard
Can generalize to `? extends MetricReporter`
in `core/src/main/java/google/registry/module/ServletBase.java`
#### Snippet
```java
  private static final SystemClock clock = new SystemClock();

  public ServletBase(RequestHandler<?> requestHandler, Lazy<MetricReporter> metricReporter) {
    this.requestHandler = requestHandler;
    this.metricReporter = metricReporter;
```

### BoundedWildcard
Can generalize to `? extends RegistrarPoc`
in `core/src/main/java/google/registry/export/sheet/SyncRegistrarsSheet.java`
#### Snippet
```java

  private static String convertContacts(
      Iterable<RegistrarPoc> contacts, Predicate<RegistrarPoc> filter) {
    StringBuilder result = new StringBuilder();
    boolean first = true;
```

### BoundedWildcard
Can generalize to `? super RegistrarPoc`
in `core/src/main/java/google/registry/export/sheet/SyncRegistrarsSheet.java`
#### Snippet
```java

  private static String convertContacts(
      Iterable<RegistrarPoc> contacts, Predicate<RegistrarPoc> filter) {
    StringBuilder result = new StringBuilder();
    boolean first = true;
```

### BoundedWildcard
Can generalize to `? extends PubApiRequestComponent.Builder`
in `core/src/main/java/google/registry/module/pubapi/PubApiRequestHandler.java`
#### Snippet
```java
  @Inject
  PubApiRequestHandler(
      Provider<PubApiRequestComponent.Builder> componentBuilderProvider,
      RequestAuthenticator requestAuthenticator) {
    super(componentBuilderProvider, requestAuthenticator);
```

### BoundedWildcard
Can generalize to `? extends BackendRequestComponent.Builder`
in `core/src/main/java/google/registry/module/backend/BackendRequestHandler.java`
#### Snippet
```java

  @Inject BackendRequestHandler(
      Provider<BackendRequestComponent.Builder> componentBuilderProvider,
      RequestAuthenticator requestAuthenticator) {
    super(componentBuilderProvider, requestAuthenticator);
```

### BoundedWildcard
Can generalize to `? extends T`
in `core/src/main/java/google/registry/whois/WhoisResponseImpl.java`
#### Snippet
```java
     * be to use {@link java.util.SortedSet} but that would require reworking the models.
     */
    <T> E emitSet(String title, Set<T> values, Function<T, String> transform) {
      return emitList(title, values.stream().map(transform).sorted().collect(toImmutableList()));
    }
```

### BoundedWildcard
Can generalize to `? super T`
in `core/src/main/java/google/registry/whois/WhoisResponseImpl.java`
#### Snippet
```java
     * be to use {@link java.util.SortedSet} but that would require reworking the models.
     */
    <T> E emitSet(String title, Set<T> values, Function<T, String> transform) {
      return emitList(title, values.stream().map(transform).sorted().collect(toImmutableList()));
    }
```

### BoundedWildcard
Can generalize to `? extends FrontendRequestComponent.Builder`
in `core/src/main/java/google/registry/module/frontend/FrontendRequestHandler.java`
#### Snippet
```java

  @Inject FrontendRequestHandler(
      Provider<FrontendRequestComponent.Builder> componentBuilderProvider,
      RequestAuthenticator requestAuthenticator) {
    super(componentBuilderProvider, requestAuthenticator);
```

### BoundedWildcard
Can generalize to `? extends Keyring`
in `core/src/main/java/google/registry/keyring/KeyringModule.java`
#### Snippet
```java
  @Singleton
  public static Keyring provideKeyring(
      Map<String, Keyring> keyrings, @Config("activeKeyring") String activeKeyring) {
    checkState(
        keyrings.containsKey(activeKeyring),
```

### BoundedWildcard
Can generalize to `? extends T`
in `core/src/main/java/google/registry/tools/server/ListObjectsAction.java`
#### Snippet
```java
   */
  private ImmutableTable<T, String, String>
      extractData(ImmutableSet<String> fields, ImmutableSet<T> objects) {
    ImmutableTable.Builder<T, String, String> builder = new ImmutableTable.Builder<>();
    for (T object : objects) {
```

### BoundedWildcard
Can generalize to `? extends T`
in `core/src/main/java/google/registry/tools/server/ListObjectsAction.java`
#### Snippet
```java
   * Don't include aliases, since then we'd wind up returning the same field twice.
   */
  private ImmutableList<String> getAllAvailableFields(ImmutableSet<T> objects) {
    ImmutableList.Builder<String> fields = new ImmutableList.Builder<>();
    for (T object : objects) {
```

### BoundedWildcard
Can generalize to `? extends Route`
in `core/src/main/java/google/registry/request/RouterDisplayHelper.java`
#### Snippet
```java
  }

  private static String formatRoutes(Iterable<Route> routes) {

    // Use the column header length as a minimum.
```

### BoundedWildcard
Can generalize to `? extends AuthenticationMechanism`
in `core/src/main/java/google/registry/request/auth/RequestAuthenticator.java`
#### Snippet
```java
  public RequestAuthenticator(
      AppEngineInternalAuthenticationMechanism appEngineInternalAuthenticationMechanism,
      ImmutableList<AuthenticationMechanism> apiAuthenticationMechanisms,
      LegacyAuthenticationMechanism legacyAuthenticationMechanism) {
    this.appEngineInternalAuthenticationMechanism = appEngineInternalAuthenticationMechanism;
```

### BoundedWildcard
Can generalize to `? extends GroupsConnection`
in `core/src/main/java/google/registry/request/auth/AuthenticatedRegistrarAccessor.java`
#### Snippet
```java

  private static boolean checkIsSupport(
      Lazy<GroupsConnection> lazyGroupsConnection,
      String userEmail,
      Optional<String> gSuiteSupportGroupEmailAddress) {
```

### BoundedWildcard
Can generalize to `? extends LanguageValidator`
in `core/src/main/java/google/registry/tldconfig/idn/IdnTable.java`
#### Snippet
```java
      URI policy,
      ImmutableRangeSet<Integer> validCodepoints,
      Optional<LanguageValidator> languageValidator) {
    this.name = name;
    this.url = checkNotNull(url, "%s missing '# URL: http://foo.example/page' line", name);
```

### BoundedWildcard
Can generalize to `? extends RegistrarThreatMatches`
in `core/src/main/java/google/registry/reporting/spec11/Spec11EmailUtils.java`
#### Snippet
```java
      SoyTemplateInfo soyTemplateInfo,
      String subject,
      ImmutableSet<RegistrarThreatMatches> registrarThreatMatchesSet) {
    ImmutableMap.Builder<RegistrarThreatMatches, Throwable> failedMatchesBuilder =
        ImmutableMap.builder();
```

### BoundedWildcard
Can generalize to `? extends RegistrarThreatMatches`
in `core/src/main/java/google/registry/reporting/spec11/PublishSpec11ReportAction.java`
#### Snippet
```java

  private ImmutableMap<String, ImmutableSet<ThreatMatch>> groupByKeyAndFlatMap(
      ImmutableSet<RegistrarThreatMatches> registrarThreatMatches) {
    // Group by email address then flat-map all of the ThreatMatch objects together
    return ImmutableMap.copyOf(
```

### BoundedWildcard
Can generalize to `? extends Map`
in `core/src/main/java/google/registry/reporting/icann/IcannReportingStager.java`
#### Snippet
```java
      String subdir,
      String headerRow,
      ImmutableCollection<Map<TableFieldSchema, Object>> rows)
      throws IOException {
    // Map from tld to rows
```

### BoundedWildcard
Can generalize to `? extends Map`
in `core/src/main/java/google/registry/reporting/icann/IcannReportingStager.java`
#### Snippet
```java
      String subdir,
      String headerRow,
      ImmutableCollection<Map<TableFieldSchema, Object>> rows)
      throws IOException {
    ImmutableList.Builder<String> manifestBuilder = new ImmutableList.Builder<>();
```

### BoundedWildcard
Can generalize to `? extends T`
in `core/src/main/java/google/registry/persistence/VKey.java`
#### Snippet
```java

  /** Creates a {@link VKey} with supplied the SQL primary key. */
  public static <T> VKey<T> create(Class<T> kind, Serializable key) {
    checkArgumentNotNull(kind, "kind must not be null");
    checkArgumentNotNull(key, "key must not be null");
```

### BoundedWildcard
Can generalize to `? extends Registry`
in `core/src/main/java/google/registry/reporting/icann/IcannReportingUploadAction.java`
#### Snippet
```java
   */
  private ImmutableMap<Cursor, String> defaultNullCursorsToNextMonthAndAddToMap(
      Map<VKey<? extends Cursor>, Registry> keyMap,
      CursorType type,
      Map<VKey<? extends Cursor>, Cursor> cursorMap) {
```

### BoundedWildcard
Can generalize to `? super String`
in `core/src/main/java/google/registry/reporting/icann/IcannReportingUploadAction.java`
#### Snippet
```java
  /** Uploads the report and rolls forward the cursor for that report. */
  private void uploadReport(
      Cursor cursor, String tldStr, ImmutableMap.Builder<String, Boolean> reportSummaryBuilder) {
    DateTime cursorTime = cursor.getCursorTime();
    CursorType cursorType = cursor.getType();
```

### BoundedWildcard
Can generalize to `? super Boolean`
in `core/src/main/java/google/registry/reporting/icann/IcannReportingUploadAction.java`
#### Snippet
```java
  /** Uploads the report and rolls forward the cursor for that report. */
  private void uploadReport(
      Cursor cursor, String tldStr, ImmutableMap.Builder<String, Boolean> reportSummaryBuilder) {
    DateTime cursorTime = cursor.getCursorTime();
    CursorType cursorType = cursor.getType();
```

### BoundedWildcard
Can generalize to `? extends K`
in `core/src/main/java/google/registry/persistence/converter/StringMapConverterBase.java`
#### Snippet
```java
  protected abstract M convertMapToDerivedType(Map<K, V> map);

  private Map.Entry<String, String> convertToDatabaseMapEntry(Map.Entry<K, V> entry) {
    return Maps.immutableEntry(
        convertKeyToString(entry.getKey()), convertValueToString(entry.getValue()));
```

### BoundedWildcard
Can generalize to `? extends V`
in `core/src/main/java/google/registry/persistence/converter/StringMapConverterBase.java`
#### Snippet
```java
  protected abstract M convertMapToDerivedType(Map<K, V> map);

  private Map.Entry<String, String> convertToDatabaseMapEntry(Map.Entry<K, V> entry) {
    return Maps.immutableEntry(
        convertKeyToString(entry.getKey()), convertValueToString(entry.getValue()));
```

### BoundedWildcard
Can generalize to `? extends V`
in `core/src/main/java/google/registry/persistence/converter/TimedTransitionPropertyConverterBase.java`
#### Snippet
```java

  @Override
  protected TimedTransitionProperty<V> convertMapToDerivedType(Map<DateTime, V> map) {
    return TimedTransitionProperty.fromValueMap(ImmutableSortedMap.copyOf(map));
  }
```

### BoundedWildcard
Can generalize to `? extends JpaTransactionManager`
in `core/src/main/java/google/registry/persistence/transaction/TransactionManagerFactory.java`
#### Snippet
```java

  /** Sets the return of {@link #jpaTm()} to the given instance of {@link JpaTransactionManager}. */
  public static void setJpaTm(Supplier<JpaTransactionManager> jpaTmSupplier) {
    checkArgumentNotNull(jpaTmSupplier, "jpaTmSupplier");
    checkState(
```

### BoundedWildcard
Can generalize to `? extends JpaTransactionManager`
in `core/src/main/java/google/registry/persistence/transaction/TransactionManagerFactory.java`
#### Snippet
```java
   * org.apache.beam.sdk.harness.JvmInitializer}.
   */
  public static void setJpaTmOnBeamWorker(Supplier<JpaTransactionManager> jpaTmSupplier) {
    checkArgumentNotNull(jpaTmSupplier, "jpaTmSupplier");
    jpaTm = Suppliers.memoize(jpaTmSupplier::get);
```

### BoundedWildcard
Can generalize to `? extends JpaTransactionManager`
in `core/src/main/java/google/registry/persistence/transaction/TransactionManagerFactory.java`
#### Snippet
```java

  /** Sets the value of {@link #replicaJpaTm()} to the given {@link JpaTransactionManager}. */
  public static void setReplicaJpaTm(Supplier<JpaTransactionManager> replicaJpaTmSupplier) {
    checkArgumentNotNull(replicaJpaTmSupplier, "replicaJpaTmSupplier");
    checkState(
```

### BoundedWildcard
Can generalize to `? super String`
in `core/src/main/java/google/registry/persistence/PersistenceModule.java`
#### Snippet
```java
  /** Configures JPA with the credential from the Secret Manager. */
  private static void setSqlCredential(
      SqlCredentialStore credentialStore, SqlUser sqlUser, Map<String, String> overrides) {
    try {
      SqlCredential credential = credentialStore.getCredential(sqlUser);
```

### BoundedWildcard
Can generalize to `? super String`
in `core/src/main/java/google/registry/persistence/PersistenceModule.java`
#### Snippet
```java
  /** Configures JPA with the credential from the Secret Manager. */
  private static void setSqlCredential(
      SqlCredentialStore credentialStore, SqlUser sqlUser, Map<String, String> overrides) {
    try {
      SqlCredential credential = credentialStore.getCredential(sqlUser);
```

### BoundedWildcard
Can generalize to `? extends Provider`
in `core/src/main/java/google/registry/persistence/PersistenceModule.java`
#### Snippet
```java
      SqlCredentialStore credentialStore,
      @Config("instanceConnectionNameOverride")
          Optional<Provider<String>> instanceConnectionNameOverride,
      @Config("beamIsolationOverride")
          Optional<Provider<TransactionIsolationLevel>> isolationOverride,
```

### BoundedWildcard
Can generalize to `? extends Provider`
in `core/src/main/java/google/registry/persistence/PersistenceModule.java`
#### Snippet
```java
          Optional<Provider<String>> instanceConnectionNameOverride,
      @Config("beamIsolationOverride")
          Optional<Provider<TransactionIsolationLevel>> isolationOverride,
      @PartialCloudSqlConfigs ImmutableMap<String, String> cloudSqlConfigs) {
    HashMap<String, String> overrides = Maps.newHashMap(cloudSqlConfigs);
```

### BoundedWildcard
Can generalize to `? extends T`
in `util/src/main/java/google/registry/util/ComparingInvocationHandler.java`
#### Snippet
```java
   */
  public ComparingInvocationHandler(
      Class<T> interfaceClass, T actualImplementation, T secondImplementation) {
    this.actualImplementation = actualImplementation;
    this.secondImplementation = secondImplementation;
```

### BoundedWildcard
Can generalize to `? extends FlowDocumentation`
in `docs/src/main/java/google/registry/documentation/MarkdownDocumentationFormatter.java`
#### Snippet
```java

  /** Returns a string of HTML representing the provided flow documentation objects. */
  public static String generateMarkdownOutput(Iterable<FlowDocumentation> flowDocs) {
    StringBuilder output = new StringBuilder();
    output.append(MARKDOWN_HEADER);
```

### BoundedWildcard
Can generalize to `? extends T`
in `core/src/main/java/google/registry/persistence/transaction/JpaTransactionManagerImpl.java`
#### Snippet
```java

  @Override
  public <T> Stream<T> loadAllOfStream(Class<T> clazz) {
    checkArgumentNotNull(clazz, "clazz must be specified");
    assertInTransaction();
```

### BoundedWildcard
Can generalize to `? extends T`
in `core/src/main/java/google/registry/persistence/transaction/JpaTransactionManagerImpl.java`
#### Snippet
```java

  @Override
  public <T> ImmutableList<T> loadByEntitiesIfPresent(Iterable<T> entities) {
    return Streams.stream(entities)
        .filter(this::exists)
```

### BoundedWildcard
Can generalize to `? extends T`
in `core/src/main/java/google/registry/persistence/transaction/JpaTransactionManagerImpl.java`
#### Snippet
```java

  @Override
  public <T> Optional<T> loadByKeyIfPresent(VKey<T> key) {
    checkArgumentNotNull(key, "key must be specified");
    assertInTransaction();
```

### BoundedWildcard
Can generalize to `? extends T`
in `core/src/main/java/google/registry/persistence/transaction/JpaTransactionManagerImpl.java`
#### Snippet
```java
    TypedQuery<T> delegate;

    public DetachingTypedQuery(TypedQuery<T> delegate) {
      this.delegate = delegate;
    }
```

### BoundedWildcard
Can generalize to `? extends T`
in `core/src/main/java/google/registry/persistence/transaction/JpaTransactionManagerImpl.java`
#### Snippet
```java

  @Override
  public <T> ImmutableList<T> loadByEntities(Iterable<T> entities) {
    return Streams.stream(entities).map(this::loadByEntity).collect(toImmutableList());
  }
```

### BoundedWildcard
Can generalize to `? extends T`
in `core/src/main/java/google/registry/persistence/transaction/JpaTransactionManagerImpl.java`
#### Snippet
```java

  @Override
  public <T> ImmutableList<T> loadAllOf(Class<T> clazz) {
    return loadAllOfStream(clazz).collect(toImmutableList());
  }
```

### BoundedWildcard
Can generalize to `? super Throwable`
in `util/src/main/java/google/registry/util/Retrier.java`
#### Snippet
```java

  private <V> V callWithRetry(
      Callable<V> callable, FailureReporter failureReporter, Predicate<Throwable> isRetryable) {
    int failures = 0;
    while (true) {
```

### BoundedWildcard
Can generalize to `? extends A`
in `util/src/main/java/google/registry/util/Concurrent.java`
#### Snippet
```java
   */
  public static <A, B> ImmutableList<B> transform(
      Collection<A> items,
      int maxThreadCount,
      final Function<A, B> funk) {
```

### BoundedWildcard
Can generalize to `? super A`
in `util/src/main/java/google/registry/util/Concurrent.java`
#### Snippet
```java
      Collection<A> items,
      int maxThreadCount,
      final Function<A, B> funk) {
    checkNotNull(funk);
    checkNotNull(items);
```

### BoundedWildcard
Can generalize to `? extends B`
in `util/src/main/java/google/registry/util/Concurrent.java`
#### Snippet
```java
      Collection<A> items,
      int maxThreadCount,
      final Function<A, B> funk) {
    checkNotNull(funk);
    checkNotNull(items);
```

### BoundedWildcard
Can generalize to `? extends FixedLengthFrameDecoder`
in `proxy/src/main/java/google/registry/proxy/HealthCheckProtocolModule.java`
#### Snippet
```java
  @HealthCheckProtocol
  static ImmutableList<Provider<? extends ChannelHandler>> provideHandlerProviders(
      Provider<FixedLengthFrameDecoder> fixedLengthFrameDecoderProvider,
      Provider<HealthCheckHandler> healthCheckHandlerProvider) {
    return ImmutableList.of(fixedLengthFrameDecoderProvider, healthCheckHandlerProvider);
```

### BoundedWildcard
Can generalize to `? extends HealthCheckHandler`
in `proxy/src/main/java/google/registry/proxy/HealthCheckProtocolModule.java`
#### Snippet
```java
  static ImmutableList<Provider<? extends ChannelHandler>> provideHandlerProviders(
      Provider<FixedLengthFrameDecoder> fixedLengthFrameDecoderProvider,
      Provider<HealthCheckHandler> healthCheckHandlerProvider) {
    return ImmutableList.of(fixedLengthFrameDecoderProvider, healthCheckHandlerProvider);
  }
```

### BoundedWildcard
Can generalize to `? extends V`
in `util/src/main/java/google/registry/util/CollectionUtils.java`
#### Snippet
```java

  /** Defensive copy helper for {@link Set}. */
  public static <V> ImmutableSet<V> nullToEmptyImmutableCopy(@Nullable Set<V> data) {
    return data == null ? ImmutableSet.of() : ImmutableSet.copyOf(data);
  }
```

### BoundedWildcard
Can generalize to `? extends V`
in `util/src/main/java/google/registry/util/CollectionUtils.java`
#### Snippet
```java

  /** Defensive copy helper for {@link Set}. */
  public static <V> ImmutableSet<V> nullSafeImmutableCopy(@Nullable Set<V> data) {
    return data == null ? null : ImmutableSet.copyOf(data);
  }
```

### BoundedWildcard
Can generalize to `? extends V`
in `util/src/main/java/google/registry/util/CollectionUtils.java`
#### Snippet
```java
  /** Defensive copy helper for {@link Set}. */
  public static <V extends Comparable<V>> ImmutableSortedSet<V> nullToEmptyImmutableSortedCopy(
      @Nullable Set<V> data) {
    return data == null ? ImmutableSortedSet.of() : ImmutableSortedSet.copyOf(data);
  }
```

### BoundedWildcard
Can generalize to `? extends V`
in `util/src/main/java/google/registry/util/CollectionUtils.java`
#### Snippet
```java
  /** Defensive copy helper for {@link SortedMap}. */
  public static <K, V> ImmutableSortedMap<K, V> nullToEmptyImmutableCopy(
      @Nullable SortedMap<K, V> data) {
    return data == null ? ImmutableSortedMap.of() : ImmutableSortedMap.copyOfSorted(data);
  }
```

### BoundedWildcard
Can generalize to `? extends K`
in `util/src/main/java/google/registry/util/CollectionUtils.java`
#### Snippet
```java

  /** Defensive copy helper for {@link Map}. */
  public static <K, V> ImmutableMap<K, V> nullToEmptyImmutableCopy(@Nullable Map<K, V> data) {
    return data == null ? ImmutableMap.of() : ImmutableMap.copyOf(data);
  }
```

### BoundedWildcard
Can generalize to `? extends V`
in `util/src/main/java/google/registry/util/CollectionUtils.java`
#### Snippet
```java

  /** Defensive copy helper for {@link Map}. */
  public static <K, V> ImmutableMap<K, V> nullToEmptyImmutableCopy(@Nullable Map<K, V> data) {
    return data == null ? ImmutableMap.of() : ImmutableMap.copyOf(data);
  }
```

### BoundedWildcard
Can generalize to `? extends T`
in `util/src/main/java/google/registry/util/CollectionUtils.java`
#### Snippet
```java
  /** Copy an {@link ImmutableSet} and add members. */
  @SafeVarargs
  public static <T> ImmutableSet<T> union(Set<T> set, T... newMembers) {
    return Sets.union(set, ImmutableSet.copyOf(newMembers)).immutableCopy();
  }
```

### BoundedWildcard
Can generalize to `? extends V`
in `util/src/main/java/google/registry/util/CollectionUtils.java`
#### Snippet
```java

  /** Defensive copy helper for {@link List}. */
  public static <V> ImmutableList<V> nullSafeImmutableCopy(@Nullable List<V> data) {
    return data == null ? null : ImmutableList.copyOf(data);
  }
```

### BoundedWildcard
Can generalize to `? extends V`
in `util/src/main/java/google/registry/util/CollectionUtils.java`
#### Snippet
```java

  /** Defensive copy helper for {@link List}. */
  public static <V> ImmutableList<V> nullToEmptyImmutableCopy(@Nullable List<V> data) {
    return data == null ? ImmutableList.of() : ImmutableList.copyOf(data);
  }
```

### BoundedWildcard
Can generalize to `? extends SslServerInitializer`
in `proxy/src/main/java/google/registry/proxy/WebWhoisProtocolsModule.java`
#### Snippet
```java
  static ImmutableList<Provider<? extends ChannelHandler>> providerHttpsWhoisHandlerProviders(
      @HttpsWhoisProtocol
          Provider<SslServerInitializer<NioSocketChannel>> sslServerInitializerProvider,
      Provider<HttpServerCodec> httpServerCodecProvider,
      Provider<HttpServerExpectContinueHandler> httpServerExpectContinueHandlerProvider,
```

### BoundedWildcard
Can generalize to `? extends Provider`
in `proxy/src/main/java/google/registry/proxy/ProxyServer.java`
#### Snippet
```java
    private static void addHandlers(
        ChannelPipeline channelPipeline,
        ImmutableList<Provider<? extends ChannelHandler>> handlerProviders) {
      for (Provider<? extends ChannelHandler> handlerProvider : handlerProviders) {
        channelPipeline.addLast(handlerProvider.get());
```

### BoundedWildcard
Can generalize to `? extends HttpServerExpectContinueHandler`
in `proxy/src/main/java/google/registry/proxy/WebWhoisProtocolsModule.java`
#### Snippet
```java
          Provider<SslServerInitializer<NioSocketChannel>> sslServerInitializerProvider,
      Provider<HttpServerCodec> httpServerCodecProvider,
      Provider<HttpServerExpectContinueHandler> httpServerExpectContinueHandlerProvider,
      @HttpsWhoisProtocol Provider<WebWhoisRedirectHandler> webWhoisRedirectHandlerProvides) {
    return ImmutableList.of(
```

### BoundedWildcard
Can generalize to `? extends WebWhoisRedirectHandler`
in `proxy/src/main/java/google/registry/proxy/WebWhoisProtocolsModule.java`
#### Snippet
```java
      Provider<HttpServerCodec> httpServerCodecProvider,
      Provider<HttpServerExpectContinueHandler> httpServerExpectContinueHandlerProvider,
      @HttpsWhoisProtocol Provider<WebWhoisRedirectHandler> webWhoisRedirectHandlerProvides) {
    return ImmutableList.of(
        sslServerInitializerProvider,
```

### BoundedWildcard
Can generalize to `? extends HttpServerExpectContinueHandler`
in `proxy/src/main/java/google/registry/proxy/WebWhoisProtocolsModule.java`
#### Snippet
```java
  static ImmutableList<Provider<? extends ChannelHandler>> providerHttpWhoisHandlerProviders(
      Provider<HttpServerCodec> httpServerCodecProvider,
      Provider<HttpServerExpectContinueHandler> httpServerExpectContinueHandlerProvider,
      @HttpWhoisProtocol Provider<WebWhoisRedirectHandler> webWhoisRedirectHandlerProvides) {
    return ImmutableList.of(
```

### BoundedWildcard
Can generalize to `? extends WebWhoisRedirectHandler`
in `proxy/src/main/java/google/registry/proxy/WebWhoisProtocolsModule.java`
#### Snippet
```java
      Provider<HttpServerCodec> httpServerCodecProvider,
      Provider<HttpServerExpectContinueHandler> httpServerExpectContinueHandlerProvider,
      @HttpWhoisProtocol Provider<WebWhoisRedirectHandler> webWhoisRedirectHandlerProvides) {
    return ImmutableList.of(
        httpServerCodecProvider,
```

### BoundedWildcard
Can generalize to `? extends ProxyProtocolHandler`
in `proxy/src/main/java/google/registry/proxy/WhoisProtocolModule.java`
#### Snippet
```java
  @WhoisProtocol
  static ImmutableList<Provider<? extends ChannelHandler>> provideHandlerProviders(
      Provider<ProxyProtocolHandler> proxyProtocolHandlerProvider,
      @WhoisProtocol Provider<ReadTimeoutHandler> readTimeoutHandlerProvider,
      Provider<LineBasedFrameDecoder> lineBasedFrameDecoderProvider,
```

### BoundedWildcard
Can generalize to `? extends ReadTimeoutHandler`
in `proxy/src/main/java/google/registry/proxy/WhoisProtocolModule.java`
#### Snippet
```java
  static ImmutableList<Provider<? extends ChannelHandler>> provideHandlerProviders(
      Provider<ProxyProtocolHandler> proxyProtocolHandlerProvider,
      @WhoisProtocol Provider<ReadTimeoutHandler> readTimeoutHandlerProvider,
      Provider<LineBasedFrameDecoder> lineBasedFrameDecoderProvider,
      Provider<WhoisServiceHandler> whoisServiceHandlerProvider,
```

### BoundedWildcard
Can generalize to `? extends LineBasedFrameDecoder`
in `proxy/src/main/java/google/registry/proxy/WhoisProtocolModule.java`
#### Snippet
```java
      Provider<ProxyProtocolHandler> proxyProtocolHandlerProvider,
      @WhoisProtocol Provider<ReadTimeoutHandler> readTimeoutHandlerProvider,
      Provider<LineBasedFrameDecoder> lineBasedFrameDecoderProvider,
      Provider<WhoisServiceHandler> whoisServiceHandlerProvider,
      Provider<FrontendMetricsHandler> frontendMetricsHandlerProvider,
```

### BoundedWildcard
Can generalize to `? extends FrontendMetricsHandler`
in `proxy/src/main/java/google/registry/proxy/WhoisProtocolModule.java`
#### Snippet
```java
      Provider<LineBasedFrameDecoder> lineBasedFrameDecoderProvider,
      Provider<WhoisServiceHandler> whoisServiceHandlerProvider,
      Provider<FrontendMetricsHandler> frontendMetricsHandlerProvider,
      Provider<WhoisQuotaHandler> whoisQuotaHandlerProvider,
      Provider<FullHttpRequestRelayHandler> relayHandlerProvider) {
```

### BoundedWildcard
Can generalize to `? extends WhoisQuotaHandler`
in `proxy/src/main/java/google/registry/proxy/WhoisProtocolModule.java`
#### Snippet
```java
      Provider<WhoisServiceHandler> whoisServiceHandlerProvider,
      Provider<FrontendMetricsHandler> frontendMetricsHandlerProvider,
      Provider<WhoisQuotaHandler> whoisQuotaHandlerProvider,
      Provider<FullHttpRequestRelayHandler> relayHandlerProvider) {
    return ImmutableList.of(
```

### BoundedWildcard
Can generalize to `? extends FullHttpRequestRelayHandler`
in `proxy/src/main/java/google/registry/proxy/WhoisProtocolModule.java`
#### Snippet
```java
      Provider<FrontendMetricsHandler> frontendMetricsHandlerProvider,
      Provider<WhoisQuotaHandler> whoisQuotaHandlerProvider,
      Provider<FullHttpRequestRelayHandler> relayHandlerProvider) {
    return ImmutableList.of(
        proxyProtocolHandlerProvider,
```

### BoundedWildcard
Can generalize to `? extends SslClientInitializer`
in `proxy/src/main/java/google/registry/proxy/HttpsRelayProtocolModule.java`
#### Snippet
```java
  static ImmutableList<Provider<? extends ChannelHandler>> provideHandlerProviders(
      @HttpsRelayProtocol
          Provider<SslClientInitializer<NioSocketChannel>> sslClientInitializerProvider,
      Provider<HttpClientCodec> httpClientCodecProvider,
      Provider<HttpObjectAggregator> httpObjectAggregatorProvider,
```

### BoundedWildcard
Can generalize to `? extends HttpObjectAggregator`
in `proxy/src/main/java/google/registry/proxy/HttpsRelayProtocolModule.java`
#### Snippet
```java
          Provider<SslClientInitializer<NioSocketChannel>> sslClientInitializerProvider,
      Provider<HttpClientCodec> httpClientCodecProvider,
      Provider<HttpObjectAggregator> httpObjectAggregatorProvider,
      Provider<BackendMetricsHandler> backendMetricsHandlerProvider,
      Provider<LoggingHandler> loggingHandlerProvider,
```

### BoundedWildcard
Can generalize to `? extends BackendMetricsHandler`
in `proxy/src/main/java/google/registry/proxy/HttpsRelayProtocolModule.java`
#### Snippet
```java
      Provider<HttpClientCodec> httpClientCodecProvider,
      Provider<HttpObjectAggregator> httpObjectAggregatorProvider,
      Provider<BackendMetricsHandler> backendMetricsHandlerProvider,
      Provider<LoggingHandler> loggingHandlerProvider,
      Provider<FullHttpResponseRelayHandler> relayHandlerProvider) {
```

### BoundedWildcard
Can generalize to `? extends LoggingHandler`
in `proxy/src/main/java/google/registry/proxy/HttpsRelayProtocolModule.java`
#### Snippet
```java
      Provider<HttpObjectAggregator> httpObjectAggregatorProvider,
      Provider<BackendMetricsHandler> backendMetricsHandlerProvider,
      Provider<LoggingHandler> loggingHandlerProvider,
      Provider<FullHttpResponseRelayHandler> relayHandlerProvider) {
    return ImmutableList.of(
```

### BoundedWildcard
Can generalize to `? extends FullHttpResponseRelayHandler`
in `proxy/src/main/java/google/registry/proxy/HttpsRelayProtocolModule.java`
#### Snippet
```java
      Provider<BackendMetricsHandler> backendMetricsHandlerProvider,
      Provider<LoggingHandler> loggingHandlerProvider,
      Provider<FullHttpResponseRelayHandler> relayHandlerProvider) {
    return ImmutableList.of(
        sslClientInitializerProvider,
```

### BoundedWildcard
Can generalize to `? extends ProxyProtocolHandler`
in `proxy/src/main/java/google/registry/proxy/EppProtocolModule.java`
#### Snippet
```java
  @EppProtocol
  static ImmutableList<Provider<? extends ChannelHandler>> provideHandlerProviders(
      Provider<ProxyProtocolHandler> proxyProtocolHandlerProvider,
      @EppProtocol Provider<SslServerInitializer<NioSocketChannel>> sslServerInitializerProvider,
      @EppProtocol Provider<ReadTimeoutHandler> readTimeoutHandlerProvider,
```

### BoundedWildcard
Can generalize to `? extends SslServerInitializer`
in `proxy/src/main/java/google/registry/proxy/EppProtocolModule.java`
#### Snippet
```java
  static ImmutableList<Provider<? extends ChannelHandler>> provideHandlerProviders(
      Provider<ProxyProtocolHandler> proxyProtocolHandlerProvider,
      @EppProtocol Provider<SslServerInitializer<NioSocketChannel>> sslServerInitializerProvider,
      @EppProtocol Provider<ReadTimeoutHandler> readTimeoutHandlerProvider,
      Provider<LengthFieldBasedFrameDecoder> lengthFieldBasedFrameDecoderProvider,
```

### BoundedWildcard
Can generalize to `? extends ReadTimeoutHandler`
in `proxy/src/main/java/google/registry/proxy/EppProtocolModule.java`
#### Snippet
```java
      Provider<ProxyProtocolHandler> proxyProtocolHandlerProvider,
      @EppProtocol Provider<SslServerInitializer<NioSocketChannel>> sslServerInitializerProvider,
      @EppProtocol Provider<ReadTimeoutHandler> readTimeoutHandlerProvider,
      Provider<LengthFieldBasedFrameDecoder> lengthFieldBasedFrameDecoderProvider,
      Provider<LengthFieldPrepender> lengthFieldPrependerProvider,
```

### BoundedWildcard
Can generalize to `? extends LengthFieldBasedFrameDecoder`
in `proxy/src/main/java/google/registry/proxy/EppProtocolModule.java`
#### Snippet
```java
      @EppProtocol Provider<SslServerInitializer<NioSocketChannel>> sslServerInitializerProvider,
      @EppProtocol Provider<ReadTimeoutHandler> readTimeoutHandlerProvider,
      Provider<LengthFieldBasedFrameDecoder> lengthFieldBasedFrameDecoderProvider,
      Provider<LengthFieldPrepender> lengthFieldPrependerProvider,
      Provider<EppServiceHandler> eppServiceHandlerProvider,
```

### BoundedWildcard
Can generalize to `? extends LengthFieldPrepender`
in `proxy/src/main/java/google/registry/proxy/EppProtocolModule.java`
#### Snippet
```java
      @EppProtocol Provider<ReadTimeoutHandler> readTimeoutHandlerProvider,
      Provider<LengthFieldBasedFrameDecoder> lengthFieldBasedFrameDecoderProvider,
      Provider<LengthFieldPrepender> lengthFieldPrependerProvider,
      Provider<EppServiceHandler> eppServiceHandlerProvider,
      Provider<FrontendMetricsHandler> frontendMetricsHandlerProvider,
```

### BoundedWildcard
Can generalize to `? extends EppServiceHandler`
in `proxy/src/main/java/google/registry/proxy/EppProtocolModule.java`
#### Snippet
```java
      Provider<LengthFieldBasedFrameDecoder> lengthFieldBasedFrameDecoderProvider,
      Provider<LengthFieldPrepender> lengthFieldPrependerProvider,
      Provider<EppServiceHandler> eppServiceHandlerProvider,
      Provider<FrontendMetricsHandler> frontendMetricsHandlerProvider,
      Provider<EppQuotaHandler> eppQuotaHandlerProvider,
```

### BoundedWildcard
Can generalize to `? extends FrontendMetricsHandler`
in `proxy/src/main/java/google/registry/proxy/EppProtocolModule.java`
#### Snippet
```java
      Provider<LengthFieldPrepender> lengthFieldPrependerProvider,
      Provider<EppServiceHandler> eppServiceHandlerProvider,
      Provider<FrontendMetricsHandler> frontendMetricsHandlerProvider,
      Provider<EppQuotaHandler> eppQuotaHandlerProvider,
      Provider<FullHttpRequestRelayHandler> relayHandlerProvider) {
```

### BoundedWildcard
Can generalize to `? extends EppQuotaHandler`
in `proxy/src/main/java/google/registry/proxy/EppProtocolModule.java`
#### Snippet
```java
      Provider<EppServiceHandler> eppServiceHandlerProvider,
      Provider<FrontendMetricsHandler> frontendMetricsHandlerProvider,
      Provider<EppQuotaHandler> eppQuotaHandlerProvider,
      Provider<FullHttpRequestRelayHandler> relayHandlerProvider) {
    return ImmutableList.of(
```

### BoundedWildcard
Can generalize to `? extends FullHttpRequestRelayHandler`
in `proxy/src/main/java/google/registry/proxy/EppProtocolModule.java`
#### Snippet
```java
      Provider<FrontendMetricsHandler> frontendMetricsHandlerProvider,
      Provider<EppQuotaHandler> eppQuotaHandlerProvider,
      Provider<FullHttpRequestRelayHandler> relayHandlerProvider) {
    return ImmutableList.of(
        proxyProtocolHandlerProvider,
```

### BoundedWildcard
Can generalize to `? super String`
in `proxy/src/main/java/google/registry/proxy/metric/MetricParameters.java`
#### Snippet
```java

  MetricParameters(
      Map<String, String> envVarMap, Function<String, HttpURLConnection> connectionFactory) {
    this.envVarMap = envVarMap;
    this.connectionFactory = connectionFactory;
```

### BoundedWildcard
Can generalize to `? extends HttpURLConnection`
in `proxy/src/main/java/google/registry/proxy/metric/MetricParameters.java`
#### Snippet
```java

  MetricParameters(
      Map<String, String> envVarMap, Function<String, HttpURLConnection> connectionFactory) {
    this.envVarMap = envVarMap;
    this.connectionFactory = connectionFactory;
```

### BoundedWildcard
Can generalize to `? extends CloudTasksClient`
in `util/src/main/java/google/registry/util/CloudTasksUtils.java`
#### Snippet
```java
    private final Supplier<CloudTasksClient> clientSupplier;

    public GcpCloudTasksClient(Supplier<CloudTasksClient> clientSupplier) {
      this.clientSupplier = clientSupplier;
    }
```

### BoundedWildcard
Can generalize to `? extends PrivateKey`
in `prober/src/main/java/google/registry/monitoring/blackbox/module/CertificateModule.java`
#### Snippet
```java
  @LocalSecrets
  static Supplier<PrivateKey> providePrivatekeySupplier(
      @LocalSecrets Provider<PrivateKey> privateKeyProvider, @LocalSecrets Duration duration) {
    return memoizeWithExpiration(
        privateKeyProvider::get, duration.getStandardSeconds(), TimeUnit.SECONDS);
```

### BoundedWildcard
Can generalize to `? extends ImmutableList`
in `prober/src/main/java/google/registry/monitoring/blackbox/module/CertificateModule.java`
#### Snippet
```java
  @LocalSecrets
  static Supplier<ImmutableList<X509Certificate>> provideCertificatesSupplier(
      @LocalSecrets Provider<ImmutableList<X509Certificate>> certificatesProvider,
      @LocalSecrets Duration duration) {
    return memoizeWithExpiration(
```

### BoundedWildcard
Can generalize to `? super String`
in `prober/src/main/java/google/registry/monitoring/blackbox/message/EppResponseMessage.java`
#### Snippet
```java
  }

  public EppResponseMessage(String name, BiFunction<String, String, List<String>> getCheckList) {
    this.name = name;
    this.getCheckList = getCheckList;
```

### BoundedWildcard
Can generalize to `? super String`
in `prober/src/main/java/google/registry/monitoring/blackbox/message/EppResponseMessage.java`
#### Snippet
```java
  }

  public EppResponseMessage(String name, BiFunction<String, String, List<String>> getCheckList) {
    this.name = name;
    this.getCheckList = getCheckList;
```

### BoundedWildcard
Can generalize to `? extends List`
in `prober/src/main/java/google/registry/monitoring/blackbox/message/EppResponseMessage.java`
#### Snippet
```java
  }

  public EppResponseMessage(String name, BiFunction<String, String, List<String>> getCheckList) {
    this.name = name;
    this.getCheckList = getCheckList;
```

### BoundedWildcard
Can generalize to `? extends HttpObjectAggregator`
in `prober/src/main/java/google/registry/monitoring/blackbox/module/WebWhoisModule.java`
#### Snippet
```java
  static ImmutableList<Provider<? extends ChannelHandler>> providerHttpWhoisHandlerProviders(
      Provider<HttpClientCodec> httpClientCodecProvider,
      Provider<HttpObjectAggregator> httpObjectAggregatorProvider,
      Provider<WebWhoisMessageHandler> messageHandlerProvider,
      Provider<WebWhoisActionHandler> webWhoisActionHandlerProvider) {
```

### BoundedWildcard
Can generalize to `? extends WebWhoisMessageHandler`
in `prober/src/main/java/google/registry/monitoring/blackbox/module/WebWhoisModule.java`
#### Snippet
```java
      Provider<HttpClientCodec> httpClientCodecProvider,
      Provider<HttpObjectAggregator> httpObjectAggregatorProvider,
      Provider<WebWhoisMessageHandler> messageHandlerProvider,
      Provider<WebWhoisActionHandler> webWhoisActionHandlerProvider) {
    return ImmutableList.of(
```

### BoundedWildcard
Can generalize to `? extends WebWhoisActionHandler`
in `prober/src/main/java/google/registry/monitoring/blackbox/module/WebWhoisModule.java`
#### Snippet
```java
      Provider<HttpObjectAggregator> httpObjectAggregatorProvider,
      Provider<WebWhoisMessageHandler> messageHandlerProvider,
      Provider<WebWhoisActionHandler> webWhoisActionHandlerProvider) {
    return ImmutableList.of(
        httpClientCodecProvider,
```

### BoundedWildcard
Can generalize to `? extends SslClientInitializer`
in `prober/src/main/java/google/registry/monitoring/blackbox/module/WebWhoisModule.java`
#### Snippet
```java
  static ImmutableList<Provider<? extends ChannelHandler>> providerHttpsWhoisHandlerProviders(
      @HttpsWhoisProtocol
          Provider<SslClientInitializer<NioSocketChannel>> sslClientInitializerProvider,
      Provider<HttpClientCodec> httpClientCodecProvider,
      Provider<HttpObjectAggregator> httpObjectAggregatorProvider,
```

### BoundedWildcard
Can generalize to `? extends HttpObjectAggregator`
in `prober/src/main/java/google/registry/monitoring/blackbox/module/WebWhoisModule.java`
#### Snippet
```java
          Provider<SslClientInitializer<NioSocketChannel>> sslClientInitializerProvider,
      Provider<HttpClientCodec> httpClientCodecProvider,
      Provider<HttpObjectAggregator> httpObjectAggregatorProvider,
      Provider<WebWhoisMessageHandler> messageHandlerProvider,
      Provider<WebWhoisActionHandler> webWhoisActionHandlerProvider) {
```

### BoundedWildcard
Can generalize to `? extends WebWhoisMessageHandler`
in `prober/src/main/java/google/registry/monitoring/blackbox/module/WebWhoisModule.java`
#### Snippet
```java
      Provider<HttpClientCodec> httpClientCodecProvider,
      Provider<HttpObjectAggregator> httpObjectAggregatorProvider,
      Provider<WebWhoisMessageHandler> messageHandlerProvider,
      Provider<WebWhoisActionHandler> webWhoisActionHandlerProvider) {
    return ImmutableList.of(
```

### BoundedWildcard
Can generalize to `? extends WebWhoisActionHandler`
in `prober/src/main/java/google/registry/monitoring/blackbox/module/WebWhoisModule.java`
#### Snippet
```java
      Provider<HttpObjectAggregator> httpObjectAggregatorProvider,
      Provider<WebWhoisMessageHandler> messageHandlerProvider,
      Provider<WebWhoisActionHandler> webWhoisActionHandlerProvider) {
    return ImmutableList.of(
        sslClientInitializerProvider,
```

### BoundedWildcard
Can generalize to `? extends SslClientInitializer`
in `prober/src/main/java/google/registry/monitoring/blackbox/module/EppModule.java`
#### Snippet
```java
  @EppProtocol
  static ImmutableList<Provider<? extends ChannelHandler>> provideEppHandlerProviders(
      @EppProtocol Provider<SslClientInitializer<NioSocketChannel>> sslClientInitializerProvider,
      Provider<LengthFieldBasedFrameDecoder> lengthFieldBasedFrameDecoderProvider,
      Provider<LengthFieldPrepender> lengthFieldPrependerProvider,
```

### BoundedWildcard
Can generalize to `? extends LengthFieldBasedFrameDecoder`
in `prober/src/main/java/google/registry/monitoring/blackbox/module/EppModule.java`
#### Snippet
```java
  static ImmutableList<Provider<? extends ChannelHandler>> provideEppHandlerProviders(
      @EppProtocol Provider<SslClientInitializer<NioSocketChannel>> sslClientInitializerProvider,
      Provider<LengthFieldBasedFrameDecoder> lengthFieldBasedFrameDecoderProvider,
      Provider<LengthFieldPrepender> lengthFieldPrependerProvider,
      Provider<EppMessageHandler> eppMessageHandlerProvider,
```

### BoundedWildcard
Can generalize to `? extends LengthFieldPrepender`
in `prober/src/main/java/google/registry/monitoring/blackbox/module/EppModule.java`
#### Snippet
```java
      @EppProtocol Provider<SslClientInitializer<NioSocketChannel>> sslClientInitializerProvider,
      Provider<LengthFieldBasedFrameDecoder> lengthFieldBasedFrameDecoderProvider,
      Provider<LengthFieldPrepender> lengthFieldPrependerProvider,
      Provider<EppMessageHandler> eppMessageHandlerProvider,
      Provider<EppActionHandler> eppActionHandlerProvider) {
```

### BoundedWildcard
Can generalize to `? extends EppMessageHandler`
in `prober/src/main/java/google/registry/monitoring/blackbox/module/EppModule.java`
#### Snippet
```java
      Provider<LengthFieldBasedFrameDecoder> lengthFieldBasedFrameDecoderProvider,
      Provider<LengthFieldPrepender> lengthFieldPrependerProvider,
      Provider<EppMessageHandler> eppMessageHandlerProvider,
      Provider<EppActionHandler> eppActionHandlerProvider) {
    return ImmutableList.of(
```

### BoundedWildcard
Can generalize to `? extends EppActionHandler`
in `prober/src/main/java/google/registry/monitoring/blackbox/module/EppModule.java`
#### Snippet
```java
      Provider<LengthFieldPrepender> lengthFieldPrependerProvider,
      Provider<EppMessageHandler> eppMessageHandlerProvider,
      Provider<EppActionHandler> eppActionHandlerProvider) {
    return ImmutableList.of(
        sslClientInitializerProvider,
```

### BoundedWildcard
Can generalize to `? extends Bootstrap`
in `prober/src/main/java/google/registry/monitoring/blackbox/module/EppModule.java`
#### Snippet
```java
  @Singleton
  @EppProtocol
  static Bootstrap provideEppBootstrap(Provider<Bootstrap> bootstrapProvider) {
    return bootstrapProvider.get();
  }
```

### BoundedWildcard
Can generalize to `? extends Supplier`>
in `networking/src/main/java/google/registry/networking/module/CertificateSupplierModule.java`
#### Snippet
```java
  static Supplier<ImmutableList<X509Certificate>> provideCertificatesSupplier(
      Mode mode,
      @PemFile Lazy<Supplier<ImmutableList<X509Certificate>>> pemCertificatesSupplier,
      @P12File Lazy<Supplier<ImmutableList<X509Certificate>>> p12CertificatesSupplier,
      @SelfSigned Lazy<Supplier<ImmutableList<X509Certificate>>> selfSignedCertificatesSupplier) {
```

### BoundedWildcard
Can generalize to `? extends Supplier`>
in `networking/src/main/java/google/registry/networking/module/CertificateSupplierModule.java`
#### Snippet
```java
      Mode mode,
      @PemFile Lazy<Supplier<ImmutableList<X509Certificate>>> pemCertificatesSupplier,
      @P12File Lazy<Supplier<ImmutableList<X509Certificate>>> p12CertificatesSupplier,
      @SelfSigned Lazy<Supplier<ImmutableList<X509Certificate>>> selfSignedCertificatesSupplier) {
    switch (mode) {
```

### BoundedWildcard
Can generalize to `? extends Supplier`>
in `networking/src/main/java/google/registry/networking/module/CertificateSupplierModule.java`
#### Snippet
```java
      @PemFile Lazy<Supplier<ImmutableList<X509Certificate>>> pemCertificatesSupplier,
      @P12File Lazy<Supplier<ImmutableList<X509Certificate>>> p12CertificatesSupplier,
      @SelfSigned Lazy<Supplier<ImmutableList<X509Certificate>>> selfSignedCertificatesSupplier) {
    switch (mode) {
      case PEM_FILE:
```

### BoundedWildcard
Can generalize to `? extends ImmutableList`
in `networking/src/main/java/google/registry/networking/module/CertificateSupplierModule.java`
#### Snippet
```java
  @PemFile
  static Supplier<ImmutableList<X509Certificate>> providePemCertificatesSupplier(
      @PemFile Provider<ImmutableList<X509Certificate>> certificatesProvider,
      @Named("remoteCertCachingDuration") Duration cachingDuration) {
    return memoizeWithExpiration(certificatesProvider::get, cachingDuration.getSeconds(), SECONDS);
```

### BoundedWildcard
Can generalize to `? extends PrivateKey`
in `networking/src/main/java/google/registry/networking/module/CertificateSupplierModule.java`
#### Snippet
```java
  @PemFile
  static Supplier<PrivateKey> providePemPrivateKeySupplier(
      @PemFile Provider<PrivateKey> privateKeyProvider,
      @Named("remoteCertCachingDuration") Duration cachingDuration) {
    return memoizeWithExpiration(privateKeyProvider::get, cachingDuration.getSeconds(), SECONDS);
```

### BoundedWildcard
Can generalize to `? extends T`
in `networking/src/main/java/google/registry/networking/module/CertificateSupplierModule.java`
#### Snippet
```java
   */
  private static <T, E> ImmutableList<E> filterAndConvert(
      ImmutableList<Object> objects, Class<T> clazz, Function<T, E> converter) {
    return objects.stream()
        .filter(clazz::isInstance)
```

### BoundedWildcard
Can generalize to `? super T`
in `networking/src/main/java/google/registry/networking/module/CertificateSupplierModule.java`
#### Snippet
```java
   */
  private static <T, E> ImmutableList<E> filterAndConvert(
      ImmutableList<Object> objects, Class<T> clazz, Function<T, E> converter) {
    return objects.stream()
        .filter(clazz::isInstance)
```

### BoundedWildcard
Can generalize to `? extends E`
in `networking/src/main/java/google/registry/networking/module/CertificateSupplierModule.java`
#### Snippet
```java
   */
  private static <T, E> ImmutableList<E> filterAndConvert(
      ImmutableList<Object> objects, Class<T> clazz, Function<T, E> converter) {
    return objects.stream()
        .filter(clazz::isInstance)
```

### BoundedWildcard
Can generalize to `? extends Supplier`
in `networking/src/main/java/google/registry/networking/module/CertificateSupplierModule.java`
#### Snippet
```java
  static Supplier<PrivateKey> providePrivateKeySupplier(
      Mode mode,
      @PemFile Lazy<Supplier<PrivateKey>> pemPrivateKeySupplier,
      @P12File Lazy<Supplier<PrivateKey>> p12PrivateKeySupplier,
      @SelfSigned Lazy<Supplier<PrivateKey>> selfSignedPrivateKeySupplier) {
```

### BoundedWildcard
Can generalize to `? extends Supplier`
in `networking/src/main/java/google/registry/networking/module/CertificateSupplierModule.java`
#### Snippet
```java
      Mode mode,
      @PemFile Lazy<Supplier<PrivateKey>> pemPrivateKeySupplier,
      @P12File Lazy<Supplier<PrivateKey>> p12PrivateKeySupplier,
      @SelfSigned Lazy<Supplier<PrivateKey>> selfSignedPrivateKeySupplier) {
    switch (mode) {
```

### BoundedWildcard
Can generalize to `? extends Supplier`
in `networking/src/main/java/google/registry/networking/module/CertificateSupplierModule.java`
#### Snippet
```java
      @PemFile Lazy<Supplier<PrivateKey>> pemPrivateKeySupplier,
      @P12File Lazy<Supplier<PrivateKey>> p12PrivateKeySupplier,
      @SelfSigned Lazy<Supplier<PrivateKey>> selfSignedPrivateKeySupplier) {
    switch (mode) {
      case PEM_FILE:
```

### BoundedWildcard
Can generalize to `? extends PrivateKey`
in `networking/src/main/java/google/registry/networking/handler/SslServerInitializer.java`
#### Snippet
```java
      boolean validateClientCert,
      SslProvider sslProvider,
      Supplier<PrivateKey> privateKeySupplier,
      Supplier<ImmutableList<X509Certificate>> certificatesSupplier) {
    logger.atInfo().log("Server SSL Provider: %s", sslProvider);
```

### BoundedWildcard
Can generalize to `? extends ImmutableList`
in `networking/src/main/java/google/registry/networking/handler/SslServerInitializer.java`
#### Snippet
```java
      SslProvider sslProvider,
      Supplier<PrivateKey> privateKeySupplier,
      Supplier<ImmutableList<X509Certificate>> certificatesSupplier) {
    logger.atInfo().log("Server SSL Provider: %s", sslProvider);
    checkArgument(
```

### BoundedWildcard
Can generalize to `? super Channel`
in `networking/src/main/java/google/registry/networking/handler/SslClientInitializer.java`
#### Snippet
```java
  SslClientInitializer(
      SslProvider sslProvider,
      Function<Channel, String> hostProvider,
      Function<Channel, Integer> portProvider,
      ImmutableList<X509Certificate> trustedCertificates,
```

### BoundedWildcard
Can generalize to `? super Channel`
in `networking/src/main/java/google/registry/networking/handler/SslClientInitializer.java`
#### Snippet
```java
      SslProvider sslProvider,
      Function<Channel, String> hostProvider,
      Function<Channel, Integer> portProvider,
      ImmutableList<X509Certificate> trustedCertificates,
      Supplier<PrivateKey> privateKeySupplier,
```

### BoundedWildcard
Can generalize to `? extends PrivateKey`
in `networking/src/main/java/google/registry/networking/handler/SslClientInitializer.java`
#### Snippet
```java
      Function<Channel, Integer> portProvider,
      ImmutableList<X509Certificate> trustedCertificates,
      Supplier<PrivateKey> privateKeySupplier,
      Supplier<ImmutableList<X509Certificate>> certificateChainSupplier) {
    logger.atInfo().log("Client SSL Provider: %s", sslProvider);
```

### BoundedWildcard
Can generalize to `? extends ImmutableList`
in `networking/src/main/java/google/registry/networking/handler/SslClientInitializer.java`
#### Snippet
```java
      ImmutableList<X509Certificate> trustedCertificates,
      Supplier<PrivateKey> privateKeySupplier,
      Supplier<ImmutableList<X509Certificate>> certificateChainSupplier) {
    logger.atInfo().log("Client SSL Provider: %s", sslProvider);
    this.sslProvider = sslProvider;
```

## RuleId[ruleID=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `DnsModule` has no concrete subclass
in `core/src/main/java/google/registry/dns/DnsModule.java`
#### Snippet
```java
/** Dagger module for the dns package. */
@Module
public abstract class DnsModule {

  public static final String PARAM_DNS_WRITER = "dnsWriter";
```

### AbstractClassNeverImplemented
Abstract class `CloudDnsWriterModule` has no concrete subclass
in `core/src/main/java/google/registry/dns/writer/clouddns/CloudDnsWriterModule.java`
#### Snippet
```java
/** Dagger module for Google Cloud DNS service connection objects. */
@Module
public abstract class CloudDnsWriterModule {

  @Provides
```

### AbstractClassNeverImplemented
Abstract class `DnsUpdateWriterModule` has no concrete subclass
in `core/src/main/java/google/registry/dns/writer/dnsupdate/DnsUpdateWriterModule.java`
#### Snippet
```java
/** Dagger module that provides a DnsUpdateWriter. */
@Module
public abstract class DnsUpdateWriterModule {

  @Provides
```

### AbstractClassNeverImplemented
Abstract class `PendingDeposit` has no concrete subclass
in `core/src/main/java/google/registry/rde/PendingDeposit.java`
#### Snippet
```java
 */
@AutoValue
public abstract class PendingDeposit implements Serializable {

  private static final long serialVersionUID = 3141095605225904433L;
```

### AbstractClassNeverImplemented
Abstract class `DepositFragment` has no concrete subclass
in `core/src/main/java/google/registry/rde/DepositFragment.java`
#### Snippet
```java
/** Container of RDE resource marshalled by {@link RdeMarshaller}. */
@AutoValue
public abstract class DepositFragment implements Serializable {

  private static final long serialVersionUID = -5241410684255467454L;
```

### AbstractClassNeverImplemented
Abstract class `WatermarkModePair` has no concrete subclass
in `core/src/main/java/google/registry/rde/RdeFragmenter.java`
#### Snippet
```java
  /** Map key for {@link RdeFragmenter} cache. */
  @AutoValue
  abstract static class WatermarkModePair {
    abstract DateTime watermark();

```

### AbstractClassNeverImplemented
Abstract class `RegistrarResult` has no concrete subclass
in `core/src/main/java/google/registry/ui/server/registrar/RegistrarSettingsAction.java`
#### Snippet
```java

  @AutoValue
  abstract static class RegistrarResult {
    abstract String message();

```

### AbstractClassNeverImplemented
Abstract class `EmailInfo` has no concrete subclass
in `core/src/main/java/google/registry/ui/server/registrar/RegistrarSettingsAction.java`
#### Snippet
```java

  @AutoValue
  abstract static class EmailInfo {
    abstract Registrar registrar();

```

### AbstractClassNeverImplemented
Abstract class `RdeModule` has no concrete subclass
in `core/src/main/java/google/registry/rde/RdeModule.java`
#### Snippet
```java
 */
@Module
public abstract class RdeModule {

  public static final String PARAM_WATERMARK = "watermark";
```

### AbstractClassNeverImplemented
Abstract class `RefreshItem` has no concrete subclass
in `core/src/main/java/google/registry/dns/ReadDnsQueueAction.java`
#### Snippet
```java
  /** Container for items we pull out of the DNS pull queue and process for fanout. */
  @AutoValue
  abstract static class RefreshItem implements Comparable<RefreshItem> {
    static RefreshItem create(TargetType type, String name, DateTime creationTime) {
      return new AutoValue_ReadDnsQueueAction_RefreshItem(type, name, creationTime);
```

### AbstractClassNeverImplemented
Abstract class `ClassifiedTasks` has no concrete subclass
in `core/src/main/java/google/registry/dns/ReadDnsQueueAction.java`
#### Snippet
```java
  /** A set of tasks grouped based on the action to take on them. */
  @AutoValue
  abstract static class ClassifiedTasks {

    /**
```

### AbstractClassNeverImplemented
Abstract class `Builder` has no concrete subclass
in `core/src/main/java/google/registry/dns/ReadDnsQueueAction.java`
#### Snippet
```java

    @AutoValue.Builder
    abstract static class Builder {
      abstract ImmutableSet.Builder<TaskHandle> tasksToKeepBuilder();
      abstract ImmutableSet.Builder<String> pausedTldsBuilder();
```

### AbstractClassNeverImplemented
Abstract class `XjcObject` has no concrete subclass
in `core/src/main/java/google/registry/xjc/XjcObject.java`
#### Snippet
```java
/** The superclass for XML classes generated by JAXB that provides marshalling and validation. */
@XmlTransient
public abstract class XjcObject {

  /**
```

### AbstractClassNeverImplemented
Abstract class `DomainNameInfo` has no concrete subclass
in `core/src/main/java/google/registry/beam/spec11/DomainNameInfo.java`
#### Snippet
```java
 */
@AutoValue
public abstract class DomainNameInfo implements Serializable {

  /** Returns the fully qualified domain name. */
```

### AbstractClassNeverImplemented
Abstract class `ThreatMatch` has no concrete subclass
in `core/src/main/java/google/registry/beam/spec11/ThreatMatch.java`
#### Snippet
```java
/** A POJO representing a threat match response from the {@code SafeBrowsing API}. */
@AutoValue
public abstract class ThreatMatch implements Serializable {

  private static final String THREAT_TYPE_FIELD = "threatType";
```

### AbstractClassNeverImplemented
Abstract class `BillingEvent` has no concrete subclass
in `core/src/main/java/google/registry/beam/invoicing/BillingEvent.java`
#### Snippet
```java
 */
@AutoValue
public abstract class BillingEvent implements Serializable {

  private static final long serialVersionUID = -3593088371541450077L;
```

### AbstractClassNeverImplemented
Abstract class `InvoiceGroupingKey` has no concrete subclass
in `core/src/main/java/google/registry/beam/invoicing/BillingEvent.java`
#### Snippet
```java
  /** Key for each {@code BillingEvent}, when aggregating for the overall invoice. */
  @AutoValue
  abstract static class InvoiceGroupingKey implements Serializable {

    private static final long serialVersionUID = -151561764235256205L;
```

### AbstractClassNeverImplemented
Abstract class `Builder` has no concrete subclass
in `core/src/main/java/google/registry/beam/rde/RdeIO.java`
#### Snippet
```java

    @AutoValue.Builder
    abstract static class Builder {
      abstract Builder setGcsUtils(GcsUtils value);

```

### AbstractClassNeverImplemented
Abstract class `Write` has no concrete subclass
in `core/src/main/java/google/registry/beam/rde/RdeIO.java`
#### Snippet
```java

  @AutoValue
  abstract static class Write
      extends PTransform<PCollection<KV<PendingDeposit, Iterable<DepositFragment>>>, PDone> {

```

### AbstractClassNeverImplemented
Abstract class `EmailAndThreatMatch` has no concrete subclass
in `core/src/main/java/google/registry/beam/spec11/Spec11Pipeline.java`
#### Snippet
```java

  @AutoValue
  abstract static class EmailAndThreatMatch implements Serializable {

    abstract String email();
```

### AbstractClassNeverImplemented
Abstract class `RdapResultSet` has no concrete subclass
in `core/src/main/java/google/registry/rdap/RdapResultSet.java`
#### Snippet
```java

@AutoValue
abstract class RdapResultSet<T extends EppResource> {

  static <S extends EppResource> RdapResultSet<S> create(List<S> resources) {
```

### AbstractClassNeverImplemented
Abstract class `RdapMetricInformation` has no concrete subclass
in `core/src/main/java/google/registry/rdap/RdapMetrics.java`
#### Snippet
```java

  @AutoValue
  abstract static class RdapMetricInformation {

    /** The type of RDAP endpoint (domain, domains, nameserver, etc.). */
```

### AbstractClassNeverImplemented
Abstract class `Builder` has no concrete subclass
in `core/src/main/java/google/registry/rdap/RdapMetrics.java`
#### Snippet
```java

    @AutoValue.Builder
    abstract static class Builder {
      abstract Builder setEndpointType(EndpointType endpointType);

```

### AbstractClassNeverImplemented
Abstract class `Builder` has no concrete subclass
in `core/src/main/java/google/registry/rdap/RdapDataStructures.java`
#### Snippet
```java

    @AutoValue.Builder
    abstract static class Builder extends EventBase.Builder<Builder> {
      abstract Builder setEventActor(String eventActor);
      abstract Event build();
```

### AbstractClassNeverImplemented
Abstract class `Port43WhoisServer` has no concrete subclass
in `core/src/main/java/google/registry/rdap/RdapDataStructures.java`
#### Snippet
```java
  @RestrictJsonNames("port43")
  @AutoValue
  abstract static class Port43WhoisServer implements Jsonable {
    abstract String port43();

```

### AbstractClassNeverImplemented
Abstract class `PublicId` has no concrete subclass
in `core/src/main/java/google/registry/rdap/RdapDataStructures.java`
#### Snippet
```java
  @RestrictJsonNames("publicIds[]")
  @AutoValue
  abstract static class PublicId extends AbstractJsonableObject {
    @RestrictJsonNames("type")
    enum Type implements Jsonable {
```

### AbstractClassNeverImplemented
Abstract class `Link` has no concrete subclass
in `core/src/main/java/google/registry/rdap/RdapDataStructures.java`
#### Snippet
```java
  @RestrictJsonNames("links[]")
  @AutoValue
  abstract static class Link extends AbstractJsonableObject {
    @JsonableElement abstract String href();

```

### AbstractClassNeverImplemented
Abstract class `Builder` has no concrete subclass
in `core/src/main/java/google/registry/rdap/RdapDataStructures.java`
#### Snippet
```java

    @AutoValue.Builder
    abstract static class Builder extends NoticeOrRemark.Builder<Builder> {
      abstract Builder setType(Remark.Type type);

```

### AbstractClassNeverImplemented
Abstract class `NoticeOrRemark` has no concrete subclass
in `core/src/main/java/google/registry/rdap/RdapDataStructures.java`
#### Snippet
```java
   * Remarks.
   */
  private abstract static class NoticeOrRemark extends AbstractJsonableObject {
    @JsonableElement abstract Optional<String> title();
    @JsonableElement abstract ImmutableList<String> description();
```

### AbstractClassNeverImplemented
Abstract class `Remark` has no concrete subclass
in `core/src/main/java/google/registry/rdap/RdapDataStructures.java`
#### Snippet
```java
  @AutoValue
  @RestrictJsonNames("remarks[]")
  abstract static class Remark extends NoticeOrRemark {

    /**
```

### AbstractClassNeverImplemented
Abstract class `Event` has no concrete subclass
in `core/src/main/java/google/registry/rdap/RdapDataStructures.java`
#### Snippet
```java
  @RestrictJsonNames("events[]")
  @AutoValue
  abstract static class Event extends EventBase {
    @JsonableElement abstract Optional<String> eventActor();

```

### AbstractClassNeverImplemented
Abstract class `Builder` has no concrete subclass
in `core/src/main/java/google/registry/rdap/RdapDataStructures.java`
#### Snippet
```java

    @AutoValue.Builder
    abstract static class Builder extends EventBase.Builder<Builder> {
      abstract EventWithoutActor build();
    }
```

### AbstractClassNeverImplemented
Abstract class `Notice` has no concrete subclass
in `core/src/main/java/google/registry/rdap/RdapDataStructures.java`
#### Snippet
```java
  @AutoValue
  @RestrictJsonNames("notices[]")
  abstract static class Notice extends NoticeOrRemark {

    /**
```

### AbstractClassNeverImplemented
Abstract class `EventBase` has no concrete subclass
in `core/src/main/java/google/registry/rdap/RdapDataStructures.java`
#### Snippet
```java
   * versions - one with and one without.
   */
  private abstract static class EventBase extends AbstractJsonableObject {
    @JsonableElement abstract EventAction eventAction();
    @JsonableElement abstract DateTime eventDate();
```

### AbstractClassNeverImplemented
Abstract class `Builder` has no concrete subclass
in `core/src/main/java/google/registry/rdap/RdapDataStructures.java`
#### Snippet
```java

    @AutoValue.Builder
    abstract static class Builder extends NoticeOrRemark.Builder<Builder> {
      abstract Builder setType(Notice.Type type);

```

### AbstractClassNeverImplemented
Abstract class `Builder` has no concrete subclass
in `core/src/main/java/google/registry/rdap/RdapDataStructures.java`
#### Snippet
```java

    @AutoValue.Builder
    abstract static class Builder {
      abstract Builder setHref(String href);
      abstract Builder setRel(String rel);
```

### AbstractClassNeverImplemented
Abstract class `Builder` has no concrete subclass
in `core/src/main/java/google/registry/rdap/RdapDataStructures.java`
#### Snippet
```java


    abstract static class Builder<B extends Builder<?>> {
      abstract B setEventAction(EventAction eventAction);
      abstract B setEventDate(DateTime eventDate);
```

### AbstractClassNeverImplemented
Abstract class `EventWithoutActor` has no concrete subclass
in `core/src/main/java/google/registry/rdap/RdapDataStructures.java`
#### Snippet
```java
  @RestrictJsonNames("asEventActor[]")
  @AutoValue
  abstract static class EventWithoutActor extends EventBase {

    static Builder builder() {
```

### AbstractClassNeverImplemented
Abstract class `Builder` has no concrete subclass
in `core/src/main/java/google/registry/rdap/RdapDataStructures.java`
#### Snippet
```java
    @JsonableElement abstract ImmutableList<Link> links();

    abstract static class Builder<B extends Builder<?>> {
      abstract B setTitle(String title);
      abstract B setDescription(ImmutableList<String> description);
```

### AbstractClassNeverImplemented
Abstract class `NameserverSearchResponse` has no concrete subclass
in `core/src/main/java/google/registry/rdap/RdapSearchResults.java`
#### Snippet
```java

  @AutoValue
  abstract static class NameserverSearchResponse extends BaseSearchResponse {

    @JsonableElement public abstract ImmutableList<RdapNameserver> nameserverSearchResults();
```

### AbstractClassNeverImplemented
Abstract class `Builder` has no concrete subclass
in `core/src/main/java/google/registry/rdap/RdapSearchResults.java`
#### Snippet
```java

    @AutoValue.Builder
    abstract static class Builder extends BaseSearchResponse.Builder<Builder> {
      abstract ImmutableList.Builder<RdapEntity> entitySearchResultsBuilder();

```

### AbstractClassNeverImplemented
Abstract class `Builder` has no concrete subclass
in `core/src/main/java/google/registry/rdap/RdapSearchResults.java`
#### Snippet
```java

    @AutoValue.Builder
    abstract static class Builder extends BaseSearchResponse.Builder<Builder> {
      abstract ImmutableList.Builder<RdapNameserver> nameserverSearchResultsBuilder();

```

### AbstractClassNeverImplemented
Abstract class `BaseSearchResponse` has no concrete subclass
in `core/src/main/java/google/registry/rdap/RdapSearchResults.java`
#### Snippet
```java

  /** Responding To Searches defined in 8 of RFC 9083. */
  abstract static class BaseSearchResponse extends ReplyPayloadBase {
    abstract IncompletenessWarningType incompletenessWarningType();
    abstract ImmutableMap<String, URI> navigationLinks();
```

### AbstractClassNeverImplemented
Abstract class `Builder` has no concrete subclass
in `core/src/main/java/google/registry/rdap/RdapSearchResults.java`
#### Snippet
```java
    }

    abstract static class Builder<B extends Builder<?>> {
      abstract ImmutableMap.Builder<String, URI> navigationLinksBuilder();
      abstract B setIncompletenessWarningType(IncompletenessWarningType type);
```

### AbstractClassNeverImplemented
Abstract class `RdapSearchResults` has no concrete subclass
in `core/src/main/java/google/registry/rdap/RdapSearchResults.java`
#### Snippet
```java
 */
@AutoValue
abstract class RdapSearchResults {

  /** Responding To Searches defined in 8 of RFC 9083. */
```

### AbstractClassNeverImplemented
Abstract class `Builder` has no concrete subclass
in `core/src/main/java/google/registry/rdap/RdapSearchResults.java`
#### Snippet
```java

    @AutoValue.Builder
    abstract static class Builder extends BaseSearchResponse.Builder<Builder> {
      abstract ImmutableList.Builder<RdapDomain> domainSearchResultsBuilder();

```

### AbstractClassNeverImplemented
Abstract class `DomainSearchResponse` has no concrete subclass
in `core/src/main/java/google/registry/rdap/RdapSearchResults.java`
#### Snippet
```java

  @AutoValue
  abstract static class DomainSearchResponse extends BaseSearchResponse {

    @JsonableElement abstract ImmutableList<RdapDomain> domainSearchResults();
```

### AbstractClassNeverImplemented
Abstract class `EntitySearchResponse` has no concrete subclass
in `core/src/main/java/google/registry/rdap/RdapSearchResults.java`
#### Snippet
```java

  @AutoValue
  abstract static class EntitySearchResponse extends BaseSearchResponse {

    @JsonableElement public abstract ImmutableList<RdapEntity> entitySearchResults();
```

### AbstractClassNeverImplemented
Abstract class `RdapAuthorization` has no concrete subclass
in `core/src/main/java/google/registry/rdap/RdapAuthorization.java`
#### Snippet
```java
/** Authorization information for RDAP data access. */
@AutoValue
public abstract class RdapAuthorization extends ImmutableObject {

  enum Role {
```

### AbstractClassNeverImplemented
Abstract class `HelpResponse` has no concrete subclass
in `core/src/main/java/google/registry/rdap/RdapObjectClasses.java`
#### Snippet
```java
  @RestrictJsonNames({})
  @AutoValue
  abstract static class HelpResponse extends ReplyPayloadBase {
    @JsonableElement("notices[]") abstract Optional<Notice> helpNotice();

```

### AbstractClassNeverImplemented
Abstract class `ErrorResponse` has no concrete subclass
in `core/src/main/java/google/registry/rdap/RdapObjectClasses.java`
#### Snippet
```java
  @RestrictJsonNames({})
  @AutoValue
  abstract static class ErrorResponse extends ReplyPayloadBase {

    @JsonableElement final LanguageIdentifier lang = LanguageIdentifier.EN;
```

### AbstractClassNeverImplemented
Abstract class `Vcard` has no concrete subclass
in `core/src/main/java/google/registry/rdap/RdapObjectClasses.java`
#### Snippet
```java
  @RestrictJsonNames({})
  @AutoValue
  abstract static class Vcard implements Jsonable {
    abstract String property();
    abstract ImmutableMap<String, ImmutableList<String>> parameters();
```

### AbstractClassNeverImplemented
Abstract class `Builder` has no concrete subclass
in `core/src/main/java/google/registry/rdap/RdapObjectClasses.java`
#### Snippet
```java

    @AutoValue.Builder
    abstract static class Builder extends RdapEntity.Builder<Builder> {
      abstract RdapRegistrarEntity build();
    }
```

### AbstractClassNeverImplemented
Abstract class `SecureDns` has no concrete subclass
in `core/src/main/java/google/registry/rdap/RdapObjectClasses.java`
#### Snippet
```java
  @RestrictJsonNames("secureDNS")
  @AutoValue
  abstract static class SecureDns extends AbstractJsonableObject {
    @RestrictJsonNames("dsData[]")
    @AutoValue
```

### AbstractClassNeverImplemented
Abstract class `Builder` has no concrete subclass
in `core/src/main/java/google/registry/rdap/RdapObjectClasses.java`
#### Snippet
```java


    abstract static class Builder<B extends Builder<?>> {
      abstract B setHandle(String handle);
      abstract ImmutableList.Builder<PublicId> publicIdsBuilder();
```

### AbstractClassNeverImplemented
Abstract class `Builder` has no concrete subclass
in `core/src/main/java/google/registry/rdap/RdapObjectClasses.java`
#### Snippet
```java
    }

    abstract static class Builder<B extends Builder<?>> extends RdapObjectBase.Builder<B> {
      abstract B setLdhName(String ldhName);
    }
```

### AbstractClassNeverImplemented
Abstract class `RdapObjectBase` has no concrete subclass
in `core/src/main/java/google/registry/rdap/RdapObjectClasses.java`
#### Snippet
```java
   * <p>Not part of the spec, but seems convenient.
   */
  private abstract static class RdapObjectBase extends ReplyPayloadBase {
    @JsonableElement final ObjectClassName objectClassName;

```

### AbstractClassNeverImplemented
Abstract class `RdapNamedObjectBase` has no concrete subclass
in `core/src/main/java/google/registry/rdap/RdapObjectClasses.java`
#### Snippet
```java
   * <p>Not part of the spec, but seems convenient.
   */
  private abstract static class RdapNamedObjectBase extends RdapObjectBase {

    @JsonableElement abstract String ldhName();
```

### AbstractClassNeverImplemented
Abstract class `Builder` has no concrete subclass
in `core/src/main/java/google/registry/rdap/RdapObjectClasses.java`
#### Snippet
```java
    @JsonableElement abstract ImmutableList<EventWithoutActor> asEventActor();

    private abstract static class Builder<B extends Builder<B>> extends RdapObjectBase.Builder<B> {
      abstract B setVcardArray(VcardArray vcardArray);

```

### AbstractClassNeverImplemented
Abstract class `RdapDomain` has no concrete subclass
in `core/src/main/java/google/registry/rdap/RdapObjectClasses.java`
#### Snippet
```java
  @RestrictJsonNames("domainSearchResults[]")
  @AutoValue
  abstract static class RdapDomain extends RdapNamedObjectBase {

    @JsonableElement abstract ImmutableList<RdapNameserver> nameservers();
```

### AbstractClassNeverImplemented
Abstract class `RdapContactEntity` has no concrete subclass
in `core/src/main/java/google/registry/rdap/RdapObjectClasses.java`
#### Snippet
```java
   */
  @AutoValue
  abstract static class RdapContactEntity extends RdapEntity {

    static Builder builder() {
```

### AbstractClassNeverImplemented
Abstract class `RdapRegistrarEntity` has no concrete subclass
in `core/src/main/java/google/registry/rdap/RdapObjectClasses.java`
#### Snippet
```java
   */
  @AutoValue
  abstract static class RdapRegistrarEntity extends RdapEntity {

    static Builder builder() {
```

### AbstractClassNeverImplemented
Abstract class `RdapNameserver` has no concrete subclass
in `core/src/main/java/google/registry/rdap/RdapObjectClasses.java`
#### Snippet
```java
  @RestrictJsonNames({"nameservers[]", "nameserverSearchResults[]"})
  @AutoValue
  abstract static class RdapNameserver extends RdapNamedObjectBase {

    @JsonableElement Optional<IpAddresses> ipAddresses() {
```

### AbstractClassNeverImplemented
Abstract class `VcardArray` has no concrete subclass
in `core/src/main/java/google/registry/rdap/RdapObjectClasses.java`
#### Snippet
```java
  @RestrictJsonNames("vcardArray")
  @AutoValue
  abstract static class VcardArray implements Jsonable {

    private static final String VCARD_VERSION_NUMBER = "4.0";
```

### AbstractClassNeverImplemented
Abstract class `Builder` has no concrete subclass
in `core/src/main/java/google/registry/rdap/RdapObjectClasses.java`
#### Snippet
```java

    @AutoValue.Builder
    abstract static class Builder extends RdapNamedObjectBase.Builder<Builder> {
      abstract ImmutableList.Builder<RdapNameserver> nameserversBuilder();

```

### AbstractClassNeverImplemented
Abstract class `DsData` has no concrete subclass
in `core/src/main/java/google/registry/rdap/RdapObjectClasses.java`
#### Snippet
```java
    @RestrictJsonNames("dsData[]")
    @AutoValue
    abstract static class DsData extends AbstractJsonableObject {
      @JsonableElement
      abstract int keyTag();
```

### AbstractClassNeverImplemented
Abstract class `RdapEntity` has no concrete subclass
in `core/src/main/java/google/registry/rdap/RdapObjectClasses.java`
#### Snippet
```java
   */
  @RestrictJsonNames({"entities[]", "entitySearchResults[]"})
  abstract static class RdapEntity extends RdapObjectBase {

    /** Role values specified in RFC 9083 § 10.2.4. */
```

### AbstractClassNeverImplemented
Abstract class `TopLevelReplyObject` has no concrete subclass
in `core/src/main/java/google/registry/rdap/RdapObjectClasses.java`
#### Snippet
```java
  @AutoValue
  @RestrictJsonNames({})
  abstract static class TopLevelReplyObject extends AbstractJsonableObject {
    @JsonableElement("rdapConformance")
    static final RdapConformance RDAP_CONFORMANCE = RdapConformance.INSTANCE;
```

### AbstractClassNeverImplemented
Abstract class `Builder` has no concrete subclass
in `core/src/main/java/google/registry/rdap/RdapObjectClasses.java`
#### Snippet
```java

    @AutoValue.Builder
    abstract static class Builder extends RdapEntity.Builder<Builder> {
      abstract RdapContactEntity build();
    }
```

### AbstractClassNeverImplemented
Abstract class `Builder` has no concrete subclass
in `core/src/main/java/google/registry/rdap/RdapObjectClasses.java`
#### Snippet
```java

    @AutoValue.Builder
    abstract static class Builder {
      abstract Builder setZoneSigned(boolean zoneSigned);

```

### AbstractClassNeverImplemented
Abstract class `Builder` has no concrete subclass
in `core/src/main/java/google/registry/rdap/RdapObjectClasses.java`
#### Snippet
```java

    @AutoValue.Builder
    abstract static class Builder {
      abstract ImmutableList.Builder<Vcard> vcardsBuilder();
      Builder add(Vcard vcard) {
```

### AbstractClassNeverImplemented
Abstract class `Builder` has no concrete subclass
in `core/src/main/java/google/registry/rdap/RdapObjectClasses.java`
#### Snippet
```java

    @AutoValue.Builder
    abstract static class Builder extends RdapNamedObjectBase.Builder<Builder> {
      abstract ImmutableList.Builder<String> ipv6Builder();
      abstract ImmutableList.Builder<String> ipv4Builder();
```

### AbstractClassNeverImplemented
Abstract class `RegistrarInfo` has no concrete subclass
in `core/src/main/java/google/registry/batch/SendExpiringCertificateNotificationEmailAction.java`
#### Snippet
```java

  @AutoValue
  public abstract static class RegistrarInfo {

    static RegistrarInfo create(
```

### AbstractClassNeverImplemented
Abstract class `SqlBatchResults` has no concrete subclass
in `core/src/main/java/google/registry/batch/ExpandRecurringBillingEventsAction.java`
#### Snippet
```java

  @AutoValue
  abstract static class SqlBatchResults {
    abstract int batchBillingEventsSaved();

```

### AbstractClassNeverImplemented
Abstract class `Builder` has no concrete subclass
in `core/src/main/java/google/registry/flows/FlowMetadata.java`
#### Snippet
```java
  /** Builder for {@link FlowMetadata} */
  @AutoValue.Builder
  public abstract static class Builder {

    public abstract Builder setSuperuser(boolean isSuperuser);
```

### AbstractClassNeverImplemented
Abstract class `FlowMetadata` has no concrete subclass
in `core/src/main/java/google/registry/flows/FlowMetadata.java`
#### Snippet
```java
/** Object to hold metadata specific to a particular execution of a flow. */
@AutoValue
public abstract class FlowMetadata extends ImmutableObject {

  public abstract boolean isSuperuser();
```

### AbstractClassNeverImplemented
Abstract class `CustomLogicModule` has no concrete subclass
in `core/src/main/java/google/registry/flows/custom/CustomLogicModule.java`
#### Snippet
```java
/** Dagger module to provide instances of custom logic classes for EPP flows. */
@Module
public abstract class CustomLogicModule {

  @Provides
```

### AbstractClassNeverImplemented
Abstract class `Builder` has no concrete subclass
in `core/src/main/java/google/registry/beam/common/RegistryJpaIO.java`
#### Snippet
```java

    @AutoValue.Builder
    abstract static class Builder<T> {

      abstract Builder<T> name(String name);
```

### AbstractClassNeverImplemented
Abstract class `Write` has no concrete subclass
in `core/src/main/java/google/registry/beam/common/RegistryJpaIO.java`
#### Snippet
```java
   */
  @AutoValue
  public abstract static class Write<T> extends PTransform<PCollection<T>, PCollection<Void>> {

    public static final String DEFAULT_NAME = "RegistryJpaIO.Write";
```

### AbstractClassNeverImplemented
Abstract class `Builder` has no concrete subclass
in `core/src/main/java/google/registry/beam/common/RegistryJpaIO.java`
#### Snippet
```java

    @AutoValue.Builder
    public abstract static class Builder<R, T> {

      abstract Builder<R, T> name(String name);
```

### AbstractClassNeverImplemented
Abstract class `Read` has no concrete subclass
in `core/src/main/java/google/registry/beam/common/RegistryJpaIO.java`
#### Snippet
```java
   */
  @AutoValue
  public abstract static class Read<R, T> extends PTransform<PBegin, PCollection<T>> {

    public static final String DEFAULT_NAME = "RegistryJpaIO.Read";
```

### AbstractClassNeverImplemented
Abstract class `EntityChanges` has no concrete subclass
in `core/src/main/java/google/registry/flows/custom/EntityChanges.java`
#### Snippet
```java
/** A wrapper class that encapsulates database entities to both save and delete. */
@AutoValue
public abstract class EntityChanges {

  public abstract ImmutableSet<ImmutableObject> getSaves();
```

### AbstractClassNeverImplemented
Abstract class `Builder` has no concrete subclass
in `core/src/main/java/google/registry/flows/custom/EntityChanges.java`
#### Snippet
```java
  /** Builder for {@link EntityChanges}. */
  @AutoValue.Builder
  public abstract static class Builder {

    public abstract Builder setSaves(ImmutableSet<ImmutableObject> entitiesToSave);
```

### AbstractClassNeverImplemented
Abstract class `BeforeSaveParameters` has no concrete subclass
in `core/src/main/java/google/registry/flows/custom/DomainUpdateFlowCustomLogic.java`
#### Snippet
```java
   */
  @AutoValue
  public abstract static class BeforeSaveParameters extends ImmutableObject {

    public abstract Domain existingDomain();
```

### AbstractClassNeverImplemented
Abstract class `AfterValidationParameters` has no concrete subclass
in `core/src/main/java/google/registry/flows/custom/DomainUpdateFlowCustomLogic.java`
#### Snippet
```java
  /** A class to encapsulate parameters for a call to {@link #afterValidation}. */
  @AutoValue
  public abstract static class AfterValidationParameters extends ImmutableObject {

    public abstract Domain existingDomain();
```

### AbstractClassNeverImplemented
Abstract class `Builder` has no concrete subclass
in `core/src/main/java/google/registry/flows/custom/DomainUpdateFlowCustomLogic.java`
#### Snippet
```java
    /** Builder for {@link BeforeSaveParameters}. */
    @AutoValue.Builder
    public abstract static class Builder {

      public abstract Builder setExistingDomain(Domain existingDomain);
```

### AbstractClassNeverImplemented
Abstract class `Builder` has no concrete subclass
in `core/src/main/java/google/registry/flows/custom/DomainUpdateFlowCustomLogic.java`
#### Snippet
```java
    /** Builder for {@link AfterValidationParameters}. */
    @AutoValue.Builder
    public abstract static class Builder {

      public abstract Builder setExistingDomain(Domain existingDomain);
```

### AbstractClassNeverImplemented
Abstract class `BeforeResponseParameters` has no concrete subclass
in `core/src/main/java/google/registry/flows/custom/DomainCreateFlowCustomLogic.java`
#### Snippet
```java
  /** A class to encapsulate parameters for a call to {@link #beforeResponse}. */
  @AutoValue
  public abstract static class BeforeResponseParameters extends ImmutableObject {

    public abstract ResponseData resData();
```

### AbstractClassNeverImplemented
Abstract class `Builder` has no concrete subclass
in `core/src/main/java/google/registry/flows/custom/DomainCreateFlowCustomLogic.java`
#### Snippet
```java
    /** Builder for {@link DomainCreateFlowCustomLogic.BeforeResponseReturnData}. */
    @AutoValue.Builder
    public abstract static class Builder {

      public abstract BeforeResponseReturnData.Builder setResData(ResponseData resData);
```

### AbstractClassNeverImplemented
Abstract class `Builder` has no concrete subclass
in `core/src/main/java/google/registry/flows/custom/DomainCreateFlowCustomLogic.java`
#### Snippet
```java
    /** Builder for {@link BeforeSaveParameters}. */
    @AutoValue.Builder
    public abstract static class Builder {

      public abstract Builder setNewDomain(Domain newDomain);
```

### AbstractClassNeverImplemented
Abstract class `Builder` has no concrete subclass
in `core/src/main/java/google/registry/flows/custom/DomainCreateFlowCustomLogic.java`
#### Snippet
```java
    /** Builder for {@link AfterValidationParameters}. */
    @AutoValue.Builder
    public abstract static class Builder {

      public abstract Builder setDomainName(InternetDomainName domainName);
```

### AbstractClassNeverImplemented
Abstract class `AfterValidationParameters` has no concrete subclass
in `core/src/main/java/google/registry/flows/custom/DomainCreateFlowCustomLogic.java`
#### Snippet
```java
  /** A class to encapsulate parameters for a call to {@link #afterValidation}. */
  @AutoValue
  public abstract static class AfterValidationParameters extends ImmutableObject {

    /** The parsed domain name of the domain that is requested to be created. */
```

### AbstractClassNeverImplemented
Abstract class `BeforeSaveParameters` has no concrete subclass
in `core/src/main/java/google/registry/flows/custom/DomainCreateFlowCustomLogic.java`
#### Snippet
```java
  /** A class to encapsulate parameters for a call to {@link #beforeSave}. */
  @AutoValue
  public abstract static class BeforeSaveParameters extends ImmutableObject {

    /**
```

### AbstractClassNeverImplemented
Abstract class `Builder` has no concrete subclass
in `core/src/main/java/google/registry/flows/custom/DomainCreateFlowCustomLogic.java`
#### Snippet
```java
    /** Builder for {@link DomainCreateFlowCustomLogic.BeforeResponseParameters}. */
    @AutoValue.Builder
    public abstract static class Builder {

      public abstract BeforeResponseParameters.Builder setResData(ResponseData resData);
```

### AbstractClassNeverImplemented
Abstract class `BeforeResponseReturnData` has no concrete subclass
in `core/src/main/java/google/registry/flows/custom/DomainCreateFlowCustomLogic.java`
#### Snippet
```java
   */
  @AutoValue
  public abstract static class BeforeResponseReturnData extends ImmutableObject {

    public abstract ResponseData resData();
```

### AbstractClassNeverImplemented
Abstract class `BeforeSaveParameters` has no concrete subclass
in `core/src/main/java/google/registry/flows/custom/DomainRenewFlowCustomLogic.java`
#### Snippet
```java
   */
  @AutoValue
  public abstract static class BeforeSaveParameters extends ImmutableObject {

    public abstract Domain existingDomain();
```

### AbstractClassNeverImplemented
Abstract class `Builder` has no concrete subclass
in `core/src/main/java/google/registry/flows/custom/DomainRenewFlowCustomLogic.java`
#### Snippet
```java
    /** Builder for {@link BeforeSaveParameters}. */
    @AutoValue.Builder
    public abstract static class Builder {

      public abstract Builder setExistingDomain(Domain existingDomain);
```

### AbstractClassNeverImplemented
Abstract class `BeforeResponseReturnData` has no concrete subclass
in `core/src/main/java/google/registry/flows/custom/DomainRenewFlowCustomLogic.java`
#### Snippet
```java
   */
  @AutoValue
  public abstract static class BeforeResponseReturnData extends ImmutableObject {

    public abstract ResponseData resData();
```

### AbstractClassNeverImplemented
Abstract class `AfterValidationParameters` has no concrete subclass
in `core/src/main/java/google/registry/flows/custom/DomainRenewFlowCustomLogic.java`
#### Snippet
```java
  /** A class to encapsulate parameters for a call to {@link #afterValidation}. */
  @AutoValue
  public abstract static class AfterValidationParameters extends ImmutableObject {

    public abstract Domain existingDomain();
```

### AbstractClassNeverImplemented
Abstract class `BeforeResponseParameters` has no concrete subclass
in `core/src/main/java/google/registry/flows/custom/DomainRenewFlowCustomLogic.java`
#### Snippet
```java
  /** A class to encapsulate parameters for a call to {@link #beforeResponse}. */
  @AutoValue
  public abstract static class BeforeResponseParameters extends ImmutableObject {

    public abstract Domain domain();
```

### AbstractClassNeverImplemented
Abstract class `Builder` has no concrete subclass
in `core/src/main/java/google/registry/flows/custom/DomainRenewFlowCustomLogic.java`
#### Snippet
```java
    /** Builder for {@link AfterValidationParameters}. */
    @AutoValue.Builder
    public abstract static class Builder {

      public abstract Builder setExistingDomain(Domain existingDomain);
```

### AbstractClassNeverImplemented
Abstract class `Builder` has no concrete subclass
in `core/src/main/java/google/registry/flows/custom/DomainRenewFlowCustomLogic.java`
#### Snippet
```java
    /** Builder for {@link BeforeResponseReturnData}. */
    @AutoValue.Builder
    public abstract static class Builder {

      public abstract Builder setResData(ResponseData resData);
```

### AbstractClassNeverImplemented
Abstract class `Builder` has no concrete subclass
in `core/src/main/java/google/registry/flows/custom/DomainRenewFlowCustomLogic.java`
#### Snippet
```java
    /** Builder for {@link BeforeResponseParameters}. */
    @AutoValue.Builder
    public abstract static class Builder {

      public abstract BeforeResponseParameters.Builder setDomain(Domain domain);
```

### AbstractClassNeverImplemented
Abstract class `Builder` has no concrete subclass
in `core/src/main/java/google/registry/flows/custom/DomainInfoFlowCustomLogic.java`
#### Snippet
```java
    /** Builder for {@link AfterValidationParameters}. */
    @AutoValue.Builder
    public abstract static class Builder {

      public abstract Builder setDomain(Domain domain);
```

### AbstractClassNeverImplemented
Abstract class `BeforeResponseParameters` has no concrete subclass
in `core/src/main/java/google/registry/flows/custom/DomainInfoFlowCustomLogic.java`
#### Snippet
```java
  /** A class to encapsulate parameters for a call to {@link #beforeResponse}. */
  @AutoValue
  public abstract static class BeforeResponseParameters extends ImmutableObject {

    public abstract Domain domain();
```

### AbstractClassNeverImplemented
Abstract class `AfterValidationParameters` has no concrete subclass
in `core/src/main/java/google/registry/flows/custom/DomainInfoFlowCustomLogic.java`
#### Snippet
```java
  /** A class to encapsulate parameters for a call to {@link #afterValidation}. */
  @AutoValue
  public abstract static class AfterValidationParameters extends ImmutableObject {

    public abstract Domain domain();
```

### AbstractClassNeverImplemented
Abstract class `BeforeResponseReturnData` has no concrete subclass
in `core/src/main/java/google/registry/flows/custom/DomainInfoFlowCustomLogic.java`
#### Snippet
```java
   */
  @AutoValue
  public abstract static class BeforeResponseReturnData extends ImmutableObject {

    public abstract DomainInfoData resData();
```

### AbstractClassNeverImplemented
Abstract class `Builder` has no concrete subclass
in `core/src/main/java/google/registry/flows/custom/DomainInfoFlowCustomLogic.java`
#### Snippet
```java
    /** Builder for {@link BeforeResponseReturnData}. */
    @AutoValue.Builder
    public abstract static class Builder {

      public abstract Builder setResData(DomainInfoData resData);
```

### AbstractClassNeverImplemented
Abstract class `Builder` has no concrete subclass
in `core/src/main/java/google/registry/flows/custom/DomainInfoFlowCustomLogic.java`
#### Snippet
```java
    /** Builder for {@link BeforeResponseParameters}. */
    @AutoValue.Builder
    public abstract static class Builder {

      public abstract Builder setDomain(Domain domain);
```

### AbstractClassNeverImplemented
Abstract class `BeforeResponseParameters` has no concrete subclass
in `core/src/main/java/google/registry/flows/custom/DomainDeleteFlowCustomLogic.java`
#### Snippet
```java
  /** A class to encapsulate parameters for a call to {@link #beforeResponse}. */
  @AutoValue
  public abstract static class BeforeResponseParameters extends ImmutableObject {

    public abstract Result.Code resultCode();
```

### AbstractClassNeverImplemented
Abstract class `AfterValidationParameters` has no concrete subclass
in `core/src/main/java/google/registry/flows/custom/DomainDeleteFlowCustomLogic.java`
#### Snippet
```java
  /** A class to encapsulate parameters for a call to {@link #afterValidation}. */
  @AutoValue
  public abstract static class AfterValidationParameters extends ImmutableObject {

    public abstract Domain existingDomain();
```

### AbstractClassNeverImplemented
Abstract class `BeforeResponseReturnData` has no concrete subclass
in `core/src/main/java/google/registry/flows/custom/DomainDeleteFlowCustomLogic.java`
#### Snippet
```java
   */
  @AutoValue
  public abstract static class BeforeResponseReturnData extends ImmutableObject {

    public abstract Result.Code resultCode();
```

### AbstractClassNeverImplemented
Abstract class `Builder` has no concrete subclass
in `core/src/main/java/google/registry/flows/custom/DomainDeleteFlowCustomLogic.java`
#### Snippet
```java
    /** Builder for {@link BeforeResponseParameters}. */
    @AutoValue.Builder
    public abstract static class Builder {

      public abstract Builder setResultCode(Result.Code resultCode);
```

### AbstractClassNeverImplemented
Abstract class `Builder` has no concrete subclass
in `core/src/main/java/google/registry/flows/custom/DomainDeleteFlowCustomLogic.java`
#### Snippet
```java
    /** Builder for {@link BeforeSaveParameters}. */
    @AutoValue.Builder
    public abstract static class Builder {

      public abstract Builder setExistingDomain(Domain existingDomain);
```

### AbstractClassNeverImplemented
Abstract class `Builder` has no concrete subclass
in `core/src/main/java/google/registry/flows/custom/DomainDeleteFlowCustomLogic.java`
#### Snippet
```java
    /** Builder for {@link AfterValidationParameters}. */
    @AutoValue.Builder
    public abstract static class Builder {

      public abstract Builder setExistingDomain(Domain existingDomain);
```

### AbstractClassNeverImplemented
Abstract class `BeforeSaveParameters` has no concrete subclass
in `core/src/main/java/google/registry/flows/custom/DomainDeleteFlowCustomLogic.java`
#### Snippet
```java
   */
  @AutoValue
  public abstract static class BeforeSaveParameters extends ImmutableObject {

    public abstract Domain existingDomain();
```

### AbstractClassNeverImplemented
Abstract class `Builder` has no concrete subclass
in `core/src/main/java/google/registry/flows/custom/DomainDeleteFlowCustomLogic.java`
#### Snippet
```java
    /** Builder for {@link BeforeResponseReturnData}. */
    @AutoValue.Builder
    public abstract static class Builder {

      public abstract Builder setResultCode(Result.Code resultCode);
```

### AbstractClassNeverImplemented
Abstract class `Builder` has no concrete subclass
in `core/src/main/java/google/registry/flows/custom/DomainCheckFlowCustomLogic.java`
#### Snippet
```java
    /** Builder for {@link BeforeResponseReturnData}. */
    @AutoValue.Builder
    public abstract static class Builder {

      public abstract Builder setDomainChecks(ImmutableList<DomainCheck> domainChecks);
```

### AbstractClassNeverImplemented
Abstract class `BeforeResponseParameters` has no concrete subclass
in `core/src/main/java/google/registry/flows/custom/DomainCheckFlowCustomLogic.java`
#### Snippet
```java
  /** A class to encapsulate parameters for a call to {@link #beforeResponse}. */
  @AutoValue
  public abstract static class BeforeResponseParameters extends ImmutableObject {

    public abstract ImmutableList<DomainCheck> domainChecks();
```

### AbstractClassNeverImplemented
Abstract class `AfterValidationParameters` has no concrete subclass
in `core/src/main/java/google/registry/flows/custom/DomainCheckFlowCustomLogic.java`
#### Snippet
```java
  /** A class to encapsulate parameters for a call to {@link #afterValidation}. */
  @AutoValue
  public abstract static class AfterValidationParameters extends ImmutableObject {

    public abstract ImmutableMap<String, InternetDomainName> domainNames();
```

### AbstractClassNeverImplemented
Abstract class `Builder` has no concrete subclass
in `core/src/main/java/google/registry/flows/custom/DomainCheckFlowCustomLogic.java`
#### Snippet
```java
    /** Builder for {@link AfterValidationParameters}. */
    @AutoValue.Builder
    public abstract static class Builder {

      public abstract Builder setDomainNames(ImmutableMap<String, InternetDomainName> domainNames);
```

### AbstractClassNeverImplemented
Abstract class `BeforeResponseReturnData` has no concrete subclass
in `core/src/main/java/google/registry/flows/custom/DomainCheckFlowCustomLogic.java`
#### Snippet
```java
   */
  @AutoValue
  public abstract static class BeforeResponseReturnData extends ImmutableObject {

    public abstract ImmutableList<DomainCheck> domainChecks();
```

### AbstractClassNeverImplemented
Abstract class `Builder` has no concrete subclass
in `core/src/main/java/google/registry/flows/custom/DomainCheckFlowCustomLogic.java`
#### Snippet
```java
    /** Builder for {@link BeforeResponseParameters}. */
    @AutoValue.Builder
    public abstract static class Builder {

      public abstract Builder setDomainChecks(ImmutableList<DomainCheck> domainChecks);
```

### AbstractClassNeverImplemented
Abstract class `Builder` has no concrete subclass
in `core/src/main/java/google/registry/flows/custom/DomainPricingCustomLogic.java`
#### Snippet
```java
    /** Builder for {@link TransferPriceParameters}. */
    @AutoValue.Builder
    public abstract static class Builder {

      public abstract Builder setFeesAndCredits(FeesAndCredits feesAndCredits);
```

### AbstractClassNeverImplemented
Abstract class `Builder` has no concrete subclass
in `core/src/main/java/google/registry/flows/custom/DomainPricingCustomLogic.java`
#### Snippet
```java
    /** Builder for {@link CreatePriceParameters}. */
    @AutoValue.Builder
    public abstract static class Builder {

      public abstract Builder setFeesAndCredits(FeesAndCredits feesAndCredits);
```

### AbstractClassNeverImplemented
Abstract class `UpdatePriceParameters` has no concrete subclass
in `core/src/main/java/google/registry/flows/custom/DomainPricingCustomLogic.java`
#### Snippet
```java
  /** A class to encapsulate parameters for a call to {@link #customizeUpdatePrice} . */
  @AutoValue
  public abstract static class UpdatePriceParameters extends ImmutableObject {

    public abstract FeesAndCredits feesAndCredits();
```

### AbstractClassNeverImplemented
Abstract class `CreatePriceParameters` has no concrete subclass
in `core/src/main/java/google/registry/flows/custom/DomainPricingCustomLogic.java`
#### Snippet
```java
  /** A class to encapsulate parameters for a call to {@link #customizeCreatePrice} . */
  @AutoValue
  public abstract static class CreatePriceParameters extends ImmutableObject {

    public abstract FeesAndCredits feesAndCredits();
```

### AbstractClassNeverImplemented
Abstract class `TransferPriceParameters` has no concrete subclass
in `core/src/main/java/google/registry/flows/custom/DomainPricingCustomLogic.java`
#### Snippet
```java
  /** A class to encapsulate parameters for a call to {@link #customizeTransferPrice} . */
  @AutoValue
  public abstract static class TransferPriceParameters extends ImmutableObject {

    public abstract FeesAndCredits feesAndCredits();
```

### AbstractClassNeverImplemented
Abstract class `Builder` has no concrete subclass
in `core/src/main/java/google/registry/flows/custom/DomainPricingCustomLogic.java`
#### Snippet
```java
    /** Builder for {@link UpdatePriceParameters}. */
    @AutoValue.Builder
    public abstract static class Builder {

      public abstract Builder setFeesAndCredits(FeesAndCredits feesAndCredits);
```

### AbstractClassNeverImplemented
Abstract class `RestorePriceParameters` has no concrete subclass
in `core/src/main/java/google/registry/flows/custom/DomainPricingCustomLogic.java`
#### Snippet
```java
  /** A class to encapsulate parameters for a call to {@link #customizeRestorePrice} . */
  @AutoValue
  public abstract static class RestorePriceParameters extends ImmutableObject {

    public abstract FeesAndCredits feesAndCredits();
```

### AbstractClassNeverImplemented
Abstract class `Builder` has no concrete subclass
in `core/src/main/java/google/registry/flows/custom/DomainPricingCustomLogic.java`
#### Snippet
```java
    /** Builder for {@link RestorePriceParameters}. */
    @AutoValue.Builder
    public abstract static class Builder {

      public abstract Builder setFeesAndCredits(FeesAndCredits feesAndCredits);
```

### AbstractClassNeverImplemented
Abstract class `RenewPriceParameters` has no concrete subclass
in `core/src/main/java/google/registry/flows/custom/DomainPricingCustomLogic.java`
#### Snippet
```java
  /** A class to encapsulate parameters for a call to {@link #customizeRenewPrice} . */
  @AutoValue
  public abstract static class RenewPriceParameters extends ImmutableObject {

    public abstract FeesAndCredits feesAndCredits();
```

### AbstractClassNeverImplemented
Abstract class `Builder` has no concrete subclass
in `core/src/main/java/google/registry/flows/custom/DomainPricingCustomLogic.java`
#### Snippet
```java
    /** Builder for {@link RenewPriceParameters}. */
    @AutoValue.Builder
    public abstract static class Builder {

      public abstract Builder setFeesAndCredits(FeesAndCredits feesAndCredits);
```

### AbstractClassNeverImplemented
Abstract class `AllocationTokenDomainCheckResults` has no concrete subclass
in `core/src/main/java/google/registry/flows/domain/token/AllocationTokenDomainCheckResults.java`
#### Snippet
```java
/** Value class to represent the result of loading a token and checking domains with it. */
@AutoValue
public abstract class AllocationTokenDomainCheckResults {

  public abstract Optional<AllocationToken> token();
```

### AbstractClassNeverImplemented
Abstract class `UnimplementedRestoreFlow` has no concrete subclass
in `core/src/main/java/google/registry/flows/picker/FlowPicker.java`
#### Snippet
```java

  /** Marker class for unimplemented restore flows. */
  private abstract static class UnimplementedRestoreFlow implements Flow {}

  /** A function type that takes an {@link EppInput} and returns a {@link Flow} class. */
```

### AbstractClassNeverImplemented
Abstract class `UnimplementedFlow` has no concrete subclass
in `core/src/main/java/google/registry/flows/picker/FlowPicker.java`
#### Snippet
```java

  /** Marker class for unimplemented flows. */
  private abstract static class UnimplementedFlow implements Flow {}

  /** Marker class for unimplemented restore flows. */
```

### AbstractClassNeverImplemented
Abstract class `RenewalPriceInfo` has no concrete subclass
in `core/src/main/java/google/registry/flows/domain/DomainCreateFlow.java`
#### Snippet
```java
  /** A class to store renewal info used in {@link Recurring} billing events. */
  @AutoValue
  public abstract static class RenewalPriceInfo {
    static DomainCreateFlow.RenewalPriceInfo create(
        RenewalPriceBehavior renewalPriceBehavior, @Nullable Money renewalPrice) {
```

### AbstractClassNeverImplemented
Abstract class `MetricsReservedListMatch` has no concrete subclass
in `core/src/main/java/google/registry/model/tld/label/DomainLabelMetrics.java`
#### Snippet
```java

  @AutoValue
  abstract static class MetricsReservedListMatch {
    static MetricsReservedListMatch create(
        String reservedListName, ReservationType reservationType) {
```

### AbstractClassNeverImplemented
Abstract class `MostRecentResource` has no concrete subclass
in `core/src/main/java/google/registry/model/ForeignKeyUtils.java`
#### Snippet
```java

  @AutoValue
  abstract static class MostRecentResource {

    abstract String repoId();
```

### AbstractClassNeverImplemented
Abstract class `RevisionIdAndLabel` has no concrete subclass
in `core/src/main/java/google/registry/model/tld/label/PremiumListDao.java`
#### Snippet
```java

  @AutoValue
  abstract static class RevisionIdAndLabel {
    abstract long revisionId();

```

### AbstractClassNeverImplemented
Abstract class `HostInfoData` has no concrete subclass
in `core/src/main/java/google/registry/model/host/HostInfoData.java`
#### Snippet
```java
@AutoValue
@CopyAnnotations
public abstract class HostInfoData implements ResponseData {

  @XmlElement(name = "name")
```

### AbstractClassNeverImplemented
Abstract class `Builder` has no concrete subclass
in `core/src/main/java/google/registry/model/host/HostInfoData.java`
#### Snippet
```java
  /** Builder for {@link HostInfoData}. */
  @AutoValue.Builder
  public abstract static class Builder {
    public abstract Builder setHostName(String hostName);

```

### AbstractClassNeverImplemented
Abstract class `DomainInfoData` has no concrete subclass
in `core/src/main/java/google/registry/model/domain/DomainInfoData.java`
#### Snippet
```java
@AutoValue
@CopyAnnotations
public abstract class DomainInfoData implements ResponseData {

  @XmlElement(name = "name")
```

### AbstractClassNeverImplemented
Abstract class `Builder` has no concrete subclass
in `core/src/main/java/google/registry/model/domain/DomainInfoData.java`
#### Snippet
```java
  /** Builder for {@link DomainInfoData}. */
  @AutoValue.Builder
  public abstract static class Builder {
    public abstract Builder setDomainName(String domainName);

```

### AbstractClassNeverImplemented
Abstract class `AcquireResult` has no concrete subclass
in `core/src/main/java/google/registry/model/server/Lock.java`
#### Snippet
```java

  @AutoValue
  abstract static class AcquireResult {
    public abstract DateTime transactionTime();

```

### AbstractClassNeverImplemented
Abstract class `ContactInfoData` has no concrete subclass
in `core/src/main/java/google/registry/model/contact/ContactInfoData.java`
#### Snippet
```java
@AutoValue
@CopyAnnotations
public abstract class ContactInfoData implements ResponseData {

  @XmlElement(name = "id")
```

### AbstractClassNeverImplemented
Abstract class `Builder` has no concrete subclass
in `core/src/main/java/google/registry/model/contact/ContactInfoData.java`
#### Snippet
```java
  /** Builder for {@link ContactInfoData}. */
  @AutoValue.Builder
  public abstract static class Builder {
    public abstract Builder setContactId(String contactId);
    public abstract Builder setRepoId(String repoId);
```

### AbstractClassNeverImplemented
Abstract class `BigqueryCommand` has no concrete subclass
in `core/src/main/java/google/registry/tools/BigqueryCommand.java`
#### Snippet
```java

/** A {@link Command} that uses the bigquery client API. */
abstract class BigqueryCommand implements Command {

  /** Parameter delegate for encapsulating flags needed to set up the {@link BigqueryConnection}. */
```

### AbstractClassNeverImplemented
Abstract class `Property` has no concrete subclass
in `core/src/main/java/google/registry/tools/EntityWrapper.java`
#### Snippet
```java

  @AutoValue
  abstract static class Property {

    static Property create(String name, Object value) {
```

### AbstractClassNeverImplemented
Abstract class `AppEngineAdminApiModule` has no concrete subclass
in `core/src/main/java/google/registry/tools/AppEngineAdminApiModule.java`
#### Snippet
```java
/** Module providing the instance of {@link Appengine} to access App Engine Admin Api. */
@Module
public abstract class AppEngineAdminApiModule {

  @Provides
```

### AbstractClassNeverImplemented
Abstract class `LocalCredentialModule` has no concrete subclass
in `core/src/main/java/google/registry/tools/AuthModule.java`
#### Snippet
```java

  @Module
  abstract static class LocalCredentialModule {
    @Binds
    @DefaultCredential
```

### AbstractClassNeverImplemented
Abstract class `DsRecord` has no concrete subclass
in `core/src/main/java/google/registry/tools/DsRecord.java`
#### Snippet
```java

@AutoValue
abstract class DsRecord {
  private static final Splitter SPLITTER = Splitter.on(CharMatcher.whitespace()).omitEmptyStrings();

```

### AbstractClassNeverImplemented
Abstract class `ParamDoc` has no concrete subclass
in `core/src/main/java/google/registry/tools/ShellCommand.java`
#### Snippet
```java
     */
    @AutoValue
    abstract static class ParamDoc {
      abstract String documentation();

```

### AbstractClassNeverImplemented
Abstract class `WhoisResponseResults` has no concrete subclass
in `core/src/main/java/google/registry/whois/WhoisResponse.java`
#### Snippet
```java
  /** A wrapper class for the plaintext response of a WHOIS command and its number of results. */
  @AutoValue
  abstract class WhoisResponseResults {
    public abstract String plainTextOutput();
    public abstract int numResults();
```

### AbstractClassNeverImplemented
Abstract class `WhoisMetric` has no concrete subclass
in `core/src/main/java/google/registry/whois/WhoisMetrics.java`
#### Snippet
```java
  /** A value class for recording attributes of a WHOIS metric. */
  @AutoValue
  public abstract static class WhoisMetric {

    public abstract Optional<String> commandName();
```

### AbstractClassNeverImplemented
Abstract class `Builder` has no concrete subclass
in `core/src/main/java/google/registry/whois/WhoisMetrics.java`
#### Snippet
```java
    /** A builder to create instances of {@link WhoisMetric}. */
    @AutoValue.Builder
    public abstract static class Builder {

      boolean wasBuilt = false;
```

### AbstractClassNeverImplemented
Abstract class `CloudTasksUtilsModule` has no concrete subclass
in `core/src/main/java/google/registry/config/CloudTasksUtilsModule.java`
#### Snippet
```java
 */
@Module
public abstract class CloudTasksUtilsModule {

  @Singleton
```

### AbstractClassNeverImplemented
Abstract class `GroupsModule` has no concrete subclass
in `core/src/main/java/google/registry/groups/GroupsModule.java`
#### Snippet
```java
/** Dagger module for groups package. */
@Module
public abstract class GroupsModule {

  @Binds
```

### AbstractClassNeverImplemented
Abstract class `CredentialModule` has no concrete subclass
in `core/src/main/java/google/registry/config/CredentialModule.java`
#### Snippet
```java
/** Dagger module that provides all {@link GoogleCredentials} used in the application. */
@Module
public abstract class CredentialModule {

  /**
```

### AbstractClassNeverImplemented
Abstract class `Builder` has no concrete subclass
in `core/src/main/java/google/registry/module/tools/ToolsRequestComponent.java`
#### Snippet
```java

  @Subcomponent.Builder
  abstract class Builder implements RequestComponentBuilder<ToolsRequestComponent> {
    @Override public abstract Builder requestModule(RequestModule requestModule);
    @Override public abstract ToolsRequestComponent build();
```

### AbstractClassNeverImplemented
Abstract class `Builder` has no concrete subclass
in `core/src/main/java/google/registry/module/pubapi/PubApiRequestComponent.java`
#### Snippet
```java

  @Subcomponent.Builder
  abstract class Builder implements RequestComponentBuilder<PubApiRequestComponent> {
    @Override public abstract Builder requestModule(RequestModule requestModule);
    @Override public abstract PubApiRequestComponent build();
```

### AbstractClassNeverImplemented
Abstract class `Builder` has no concrete subclass
in `core/src/main/java/google/registry/module/backend/BackendRequestComponent.java`
#### Snippet
```java

  @Subcomponent.Builder
  abstract class Builder implements RequestComponentBuilder<BackendRequestComponent> {

    @Override
```

### AbstractClassNeverImplemented
Abstract class `Builder` has no concrete subclass
in `core/src/main/java/google/registry/module/frontend/FrontendRequestComponent.java`
#### Snippet
```java

  @Subcomponent.Builder
  abstract class Builder implements RequestComponentBuilder<FrontendRequestComponent> {
    @Override public abstract Builder requestModule(RequestModule requestModule);
    @Override public abstract FrontendRequestComponent build();
```

### AbstractClassNeverImplemented
Abstract class `SecretManagerKeyringModule` has no concrete subclass
in `core/src/main/java/google/registry/keyring/secretmanager/SecretManagerKeyringModule.java`
#### Snippet
```java
/** Dagger module for {@link Keyring} backed by the Cloud SecretManager. */
@Module
public abstract class SecretManagerKeyringModule {

  public static final String NAME = "CSM";
```

### AbstractClassNeverImplemented
Abstract class `DummyKeyringModule` has no concrete subclass
in `core/src/main/java/google/registry/keyring/api/DummyKeyringModule.java`
#### Snippet
```java
@Module
@Immutable
public abstract class DummyKeyringModule {

  public static final String NAME = "Dummy";
```

### AbstractClassNeverImplemented
Abstract class `Route` has no concrete subclass
in `core/src/main/java/google/registry/request/Route.java`
#### Snippet
```java
 */
@AutoValue
abstract class Route {

  static Route create(
```

### AbstractClassNeverImplemented
Abstract class `OAuthTokenInfo` has no concrete subclass
in `core/src/main/java/google/registry/request/auth/OAuthTokenInfo.java`
#### Snippet
```java
/** Information provided by the OAuth authentication mechanism (only) about the session. */
@AutoValue
public abstract class OAuthTokenInfo {

  /** Authorized OAuth scopes granted by the access token provided with the request. */
```

### AbstractClassNeverImplemented
Abstract class `AuthResult` has no concrete subclass
in `core/src/main/java/google/registry/request/auth/AuthResult.java`
#### Snippet
```java
 */
@AutoValue
public abstract class AuthResult {

  public abstract AuthLevel authLevel();
```

### AbstractClassNeverImplemented
Abstract class `UserAuthInfo` has no concrete subclass
in `core/src/main/java/google/registry/request/auth/UserAuthInfo.java`
#### Snippet
```java
/** Extra information provided by the authentication mechanism about the user. */
@AutoValue
public abstract class UserAuthInfo {

  /** User object from the AppEngine Users API. */
```

### AbstractClassNeverImplemented
Abstract class `AuthSettings` has no concrete subclass
in `core/src/main/java/google/registry/request/auth/RequestAuthenticator.java`
#### Snippet
```java
  @Immutable
  @AutoValue
  public abstract static class AuthSettings {

    public abstract ImmutableList<AuthMethod> methods();
```

### AbstractClassNeverImplemented
Abstract class `BigqueryModule` has no concrete subclass
in `core/src/main/java/google/registry/bigquery/BigqueryModule.java`
#### Snippet
```java
/** Dagger module for Google {@link Bigquery} connection objects. */
@Module
public abstract class BigqueryModule {

  // No subclasses.
```

### AbstractClassNeverImplemented
Abstract class `RegistrarThreatMatches` has no concrete subclass
in `core/src/main/java/google/registry/reporting/spec11/RegistrarThreatMatches.java`
#### Snippet
```java
/** Value class representing the registrar and list-of-threat-matches pair stored in GCS. */
@AutoValue
public abstract class RegistrarThreatMatches {

  public abstract String clientId();
```

### AbstractClassNeverImplemented
Abstract class `SqlCredential` has no concrete subclass
in `core/src/main/java/google/registry/privileges/secretmanager/SqlCredential.java`
#### Snippet
```java
 */
@AutoValue
public abstract class SqlCredential {

  public static final Character SEPARATOR = ' ';
```

### AbstractClassNeverImplemented
Abstract class `SecretManagerModule` has no concrete subclass
in `core/src/main/java/google/registry/privileges/secretmanager/SecretManagerModule.java`
#### Snippet
```java
/** Provides bindings for {@link SecretManagerClient}. */
@Module
public abstract class SecretManagerModule {

  @Provides
```

### AbstractClassNeverImplemented
Abstract class `SecretVersionState` has no concrete subclass
in `core/src/main/java/google/registry/privileges/secretmanager/SecretManagerClient.java`
#### Snippet
```java
  /** Contains the {@link SecretVersion.State State} of an secret version. */
  @AutoValue
  abstract class SecretVersionState {

    public abstract String secretId();
```

### AbstractClassNeverImplemented
Abstract class `EppMetric` has no concrete subclass
in `core/src/main/java/google/registry/monitoring/whitebox/EppMetric.java`
#### Snippet
```java
/** A value class for recording attributes of an EPP metric. */
@AutoValue
public abstract class EppMetric {

  public abstract DateTime getStartTimestamp();
```

### AbstractClassNeverImplemented
Abstract class `Builder` has no concrete subclass
in `core/src/main/java/google/registry/monitoring/whitebox/EppMetric.java`
#### Snippet
```java
  /** A builder to create instances of {@link EppMetric}. */
  @AutoValue.Builder
  public abstract static class Builder {

    /** Builder-only clock to support automatic recording of endTimestamp on {@link #build()}. */
```

### AbstractClassNeverImplemented
Abstract class `VKeyConverter` has no concrete subclass
in `core/src/main/java/google/registry/persistence/converter/VKeyConverter.java`
#### Snippet
```java
 * <p>Typically the converted type is {@link String} or {@link Long}.
 */
public abstract class VKeyConverter<T, C extends Serializable>
    implements AttributeConverter<VKey<? extends T>, C> {

```

### AbstractClassNeverImplemented
Abstract class `CheckApiMetric` has no concrete subclass
in `core/src/main/java/google/registry/monitoring/whitebox/CheckApiMetric.java`
#### Snippet
```java
/** A value class for recording attributes of a domain check metric. */
@AutoValue
public abstract class CheckApiMetric {

  /** Price tier of a domain name. */
```

### AbstractClassNeverImplemented
Abstract class `Builder` has no concrete subclass
in `core/src/main/java/google/registry/monitoring/whitebox/CheckApiMetric.java`
#### Snippet
```java
  /** Builder for {@link CheckApiMetric}. */
  @AutoValue.Builder
  public abstract static class Builder {

    private Clock clock;
```

### AbstractClassNeverImplemented
Abstract class `PersistenceModule` has no concrete subclass
in `core/src/main/java/google/registry/persistence/PersistenceModule.java`
#### Snippet
```java
/** Dagger module class for the persistence layer. */
@Module
public abstract class PersistenceModule {
  private static final FluentLogger logger = FluentLogger.forEnclosingClass();

```

### AbstractClassNeverImplemented
Abstract class `UtilsModule` has no concrete subclass
in `util/src/main/java/google/registry/util/UtilsModule.java`
#### Snippet
```java
/** Dagger module to provide instances of various utils classes. */
@Module
public abstract class UtilsModule {

  @Binds
```

### AbstractClassNeverImplemented
Abstract class `Builder` has no concrete subclass
in `proxy/src/main/java/google/registry/proxy/Protocol.java`
#### Snippet
```java

    @AutoValue.Builder
    public abstract static class Builder extends Protocol.Builder<Builder, FrontendProtocol> {
      public abstract Builder relayProtocol(BackendProtocol value);

```

### AbstractClassNeverImplemented
Abstract class `Builder` has no concrete subclass
in `proxy/src/main/java/google/registry/proxy/Protocol.java`
#### Snippet
```java
    /** Builder of {@link BackendProtocol}. */
    @AutoValue.Builder
    public abstract static class Builder extends Protocol.Builder<Builder, BackendProtocol> {
      public abstract Builder host(String value);
    }
```

### AbstractClassNeverImplemented
Abstract class `Builder` has no concrete subclass
in `proxy/src/main/java/google/registry/proxy/Protocol.java`
#### Snippet
```java
   * @param <P> type of the concrete subtype of {@link Protocol}.
   */
  abstract class Builder<B extends Builder<B, P>, P extends Protocol> {

    public abstract B name(String value);
```

### AbstractClassNeverImplemented
Abstract class `BackendProtocol` has no concrete subclass
in `proxy/src/main/java/google/registry/proxy/Protocol.java`
#### Snippet
```java
   */
  @AutoValue
  abstract class BackendProtocol implements Protocol {
    /** The hostname that the proxy connects to. */
    public abstract String host();
```

### AbstractClassNeverImplemented
Abstract class `FrontendProtocol` has no concrete subclass
in `proxy/src/main/java/google/registry/proxy/Protocol.java`
#### Snippet
```java
   */
  @AutoValue
  abstract class FrontendProtocol implements Protocol {

    /**
```

### AbstractClassNeverImplemented
Abstract class `QuotaRequest` has no concrete subclass
in `proxy/src/main/java/google/registry/proxy/quota/QuotaManager.java`
#### Snippet
```java
  /** Value class representing a quota request. */
  @AutoValue
  public abstract static class QuotaRequest {

    public static QuotaRequest create(String userId) {
```

### AbstractClassNeverImplemented
Abstract class `QuotaResponse` has no concrete subclass
in `proxy/src/main/java/google/registry/proxy/quota/QuotaManager.java`
#### Snippet
```java
  /** Value class representing a quota response. */
  @AutoValue
  public abstract static class QuotaResponse {
    public static QuotaResponse create(
        boolean success, String userId, DateTime grantedTokenRefillTime) {
```

### AbstractClassNeverImplemented
Abstract class `QuotaRebate` has no concrete subclass
in `proxy/src/main/java/google/registry/proxy/quota/QuotaManager.java`
#### Snippet
```java
  /** Value class representing a quota rebate. */
  @AutoValue
  public abstract static class QuotaRebate {
    public static QuotaRebate create(QuotaResponse response) {
      return new AutoValue_QuotaManager_QuotaRebate(
```

### AbstractClassNeverImplemented
Abstract class `TimestampedInteger` has no concrete subclass
in `proxy/src/main/java/google/registry/proxy/quota/TokenStore.java`
#### Snippet
```java
  /** Value class representing a timestamped integer. */
  @AutoValue
  abstract static class TimestampedInteger {

    static TimestampedInteger create(int value, DateTime timestamp) {
```

### AbstractClassNeverImplemented
Abstract class `Attachment` has no concrete subclass
in `util/src/main/java/google/registry/util/EmailMessage.java`
#### Snippet
```java
  /** An attachment to the email, if one exists. */
  @AutoValue
  public abstract static class Attachment {
    public static Builder newBuilder() {
      return new AutoValue_EmailMessage_Attachment.Builder();
```

### AbstractClassNeverImplemented
Abstract class `Builder` has no concrete subclass
in `util/src/main/java/google/registry/util/EmailMessage.java`
#### Snippet
```java
  /** Builder for {@link EmailMessage}. */
  @AutoValue.Builder
  public abstract static class Builder {

    public abstract Builder setSubject(String subject);
```

### AbstractClassNeverImplemented
Abstract class `Builder` has no concrete subclass
in `util/src/main/java/google/registry/util/EmailMessage.java`
#### Snippet
```java
    /** Builder for {@link Attachment}. */
    @AutoValue.Builder
    public abstract static class Builder {
      public abstract Builder setContentType(MediaType contentType);

```

### AbstractClassNeverImplemented
Abstract class `EmailMessage` has no concrete subclass
in `util/src/main/java/google/registry/util/EmailMessage.java`
#### Snippet
```java
/** Value class representing the content and metadata of an email. */
@AutoValue
public abstract class EmailMessage {

  public static Builder newBuilder() {
```

### AbstractClassNeverImplemented
Abstract class `DateTimeUtils` has no concrete subclass
in `common/src/main/java/google/registry/util/DateTimeUtils.java`
#### Snippet
```java

/** Utilities methods and constants related to Joda {@link DateTime} objects. */
public abstract class DateTimeUtils {

  /** The start of the epoch, in a convenient constant. */
```

### AbstractClassNeverImplemented
Abstract class `ProbingStep` has no concrete subclass
in `prober/src/main/java/google/registry/monitoring/blackbox/ProbingStep.java`
#### Snippet
```java
 */
@AutoValue
public abstract class ProbingStep {

  public static Builder builder() {
```

### AbstractClassNeverImplemented
Abstract class `Builder` has no concrete subclass
in `prober/src/main/java/google/registry/monitoring/blackbox/ProbingStep.java`
#### Snippet
```java
  /** Standard {@link AutoValue.Builder} for {@link ProbingStep}. */
  @AutoValue.Builder
  public abstract static class Builder {

    public abstract Builder setDuration(Duration value);
```

### AbstractClassNeverImplemented
Abstract class `Builder` has no concrete subclass
in `prober/src/main/java/google/registry/monitoring/blackbox/connection/Protocol.java`
#### Snippet
```java
  /** Default {@link AutoValue.Builder} for {@link Protocol}. */
  @AutoValue.Builder
  public abstract static class Builder {

    public abstract Builder setName(String value);
```

### AbstractClassNeverImplemented
Abstract class `Protocol` has no concrete subclass
in `prober/src/main/java/google/registry/monitoring/blackbox/connection/Protocol.java`
#### Snippet
```java
/** {@link AutoValue} class that stores all unchanged variables necessary for type of connection. */
@AutoValue
public abstract class Protocol {

  /** {@link AttributeKey} that lets channel reference {@link Protocol} that created it. */
```

### AbstractClassNeverImplemented
Abstract class `ProbingAction` has no concrete subclass
in `prober/src/main/java/google/registry/monitoring/blackbox/connection/ProbingAction.java`
#### Snippet
```java
 */
@AutoValue
public abstract class ProbingAction implements Callable<ChannelFuture> {

  private static final FluentLogger logger = FluentLogger.forEnclosingClass();
```

### AbstractClassNeverImplemented
Abstract class `Builder` has no concrete subclass
in `prober/src/main/java/google/registry/monitoring/blackbox/connection/ProbingAction.java`
#### Snippet
```java
  /** {@link AutoValue.Builder} that does work of creating connection when not already present. */
  @AutoValue.Builder
  public abstract static class Builder {

    private Bootstrap bootstrap;
```

## RuleId[ruleID=NullableProblems]
### NullableProblems
Getter for @Nullable field might be annotated @Nullable itself
in `core/src/main/java/google/registry/model/host/HostHistory.java`
#### Snippet
```java

  @Override
  protected HostBase getResource() {
    return resource;
  }
```

### NullableProblems
Getter for @Nullable field might be annotated @Nullable itself
in `core/src/main/java/google/registry/model/domain/DomainHistory.java`
#### Snippet
```java

  @Override
  protected DomainBase getResource() {
    return resource;
  }
```

### NullableProblems
Getter for @Nullable field might be annotated @Nullable itself
in `core/src/main/java/google/registry/model/domain/DomainHistory.java`
#### Snippet
```java
  }

  public String getOtherRegistrarId() {
    return otherRegistrarId;
  }
```

### NullableProblems
Getter for @Nullable field might be annotated @Nullable itself
in `core/src/main/java/google/registry/model/contact/ContactHistory.java`
#### Snippet
```java

  @Override
  protected ContactBase getResource() {
    return resource;
  }
```

### NullableProblems
Overridden method parameters are not annotated
in `core/src/main/java/google/registry/tools/CommandWithConnection.java`
#### Snippet
```java
/** A command that can send HTTP requests to a backend module. */
public interface CommandWithConnection extends Command {
  void setConnection(AppEngineConnection connection);
}

```

### NullableProblems
Overridden method parameters are not annotated
in `core/src/main/java/google/registry/tools/CommandRunner.java`
#### Snippet
```java
 */
interface CommandRunner {
  void run(String[] args) throws Exception;
}

```

### NullableProblems
Parameter annotated @ParametersAreNonnullByDefault must not override @Nullable parameter
in `core/src/main/java/google/registry/export/sheet/SyncRegistrarsSheetAction.java`
#### Snippet
```java
    MISSINGNO(SC_BAD_REQUEST, "No sheet ID specified or configured; dropping task.") {
      @Override
      protected void log(Exception cause) {
        logger.atWarning().withCause(cause).log(message);
      }},
```

### NullableProblems
Parameter annotated @ParametersAreNonnullByDefault must not override @Nullable parameter
in `core/src/main/java/google/registry/export/sheet/SyncRegistrarsSheetAction.java`
#### Snippet
```java
    FAILED(SC_INTERNAL_SERVER_ERROR, "Spreadsheet synchronization failed") {
      @Override
      protected void log(Exception cause) {
        logger.atSevere().withCause(cause).log(message);
      }};
```

### NullableProblems
Parameter annotated @ParametersAreNonnullByDefault must not override @Nullable parameter
in `core/src/main/java/google/registry/export/SyncGroupMembersAction.java`
#### Snippet
```java
    FAILED(SC_INTERNAL_SERVER_ERROR, "Error occurred while updating registrar contacts.") {
      @Override
      protected void log(Throwable cause) {
        logger.atSevere().withCause(cause).log(message);
      }};
```

### NullableProblems
Overridden method parameters are not annotated
in `core/src/main/java/google/registry/request/RequestComponentBuilder.java`
#### Snippet
```java
 */
public interface RequestComponentBuilder<C> {
  RequestComponentBuilder<C> requestModule(RequestModule requestModule);
  C build();
}
```

### NullableProblems
Overridden method parameters are not annotated
in `core/src/main/java/google/registry/request/JsonActionRunner.java`
#### Snippet
```java
     * @throws HttpException to send a non-200 status code / message to client
     */
    Map<String, ?> handleJsonRequest(Map<String, ?> json);
  }

```

### NullableProblems
Constructor parameter for @Nullable field might be annotated @Nullable itself
in `core/src/main/java/google/registry/request/lock/LockHandlerImpl.java`
#### Snippet
```java
        Callable<Void> delegate,
        LockAcquirer lockAcquirer,
        String tld,
        Duration leaseLength,
        String... lockNames) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `util/src/main/java/google/registry/util/DiffUtils.java`
#### Snippet
```java
   */
  private static class DiffPair {
    @Nullable
    final Object a;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `util/src/main/java/google/registry/util/DiffUtils.java`
#### Snippet
```java
    final Object a;

    @Nullable
    final Object b;

```

### NullableProblems
Overridden method parameters are not annotated
in `util/src/main/java/google/registry/util/CircularList.java`
#### Snippet
```java

    /** Sets current {@code C} to element added and points previous {@code C} to this one. */
    public AbstractBuilder<T, C> add(T value) {
      C c = create(value);
      if (current == null) {
```

### NullableProblems
Overridden method parameters are not annotated
in `util/src/main/java/google/registry/util/CircularList.java`
#### Snippet
```java

    /** Necessary to instantiate each {@code C} object from {@code value}. */
    protected abstract C create(T value);

    /** Sets current {@code C} to element added and points previous {@code C} to this one. */
```

## RuleId[ruleID=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `private static @Nullable`
in `core/src/main/java/google/registry/ui/server/RegistrarFormFields.java`
#### Snippet
```java
  }

  private static @Nullable String parseHostname(@Nullable String input) {
    if (input == null) {
      return null;
```

### MissortedModifiers
Missorted modifiers `public static @Nullable`
in `core/src/main/java/google/registry/ui/server/RegistrarFormFields.java`
#### Snippet
```java
  }

  public static @Nullable DateTime parseDateTime(@Nullable String input) {
    if (input == null) {
      return null;
```

### MissortedModifiers
Missorted modifiers `private static @Nullable`
in `core/src/main/java/google/registry/ui/server/RegistrarFormFields.java`
#### Snippet
```java
          .build();

  private static @Nullable RegistrarAddress toNewAddress(
      @Nullable Map<String, ?> args,
      final FormField<List<String>, List<String>> streetField,
```

## RuleId[ruleID=RedundantMethodOverride]
### RedundantMethodOverride
Method `getAuthInfo()` is identical to its super method
in `core/src/main/java/google/registry/model/domain/DomainCommand.java`
#### Snippet
```java

    @Override
    public DomainAuthInfo getAuthInfo() {
      return authInfo;
    }
```

### RedundantMethodOverride
Method `getAuthInfo()` is identical to its super method
in `core/src/main/java/google/registry/model/contact/ContactCommand.java`
#### Snippet
```java

    @Override
    public ContactAuthInfo getAuthInfo() {
      return authInfo;
    }
```

## RuleId[ruleID=ClassNameSameAsAncestorName]
### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `core/src/main/java/google/registry/rdap/RdapDataStructures.java`
#### Snippet
```java

    @AutoValue.Builder
    abstract static class Builder extends EventBase.Builder<Builder> {
      abstract Builder setEventActor(String eventActor);
      abstract Event build();
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `core/src/main/java/google/registry/rdap/RdapDataStructures.java`
#### Snippet
```java

    @AutoValue.Builder
    abstract static class Builder extends NoticeOrRemark.Builder<Builder> {
      abstract Builder setType(Remark.Type type);

```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `core/src/main/java/google/registry/rdap/RdapDataStructures.java`
#### Snippet
```java

    @AutoValue.Builder
    abstract static class Builder extends NoticeOrRemark.Builder<Builder> {
      abstract Builder setType(Notice.Type type);

```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `core/src/main/java/google/registry/rdap/RdapDataStructures.java`
#### Snippet
```java

    @AutoValue.Builder
    abstract static class Builder extends EventBase.Builder<Builder> {
      abstract EventWithoutActor build();
    }
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `core/src/main/java/google/registry/rdap/RdapSearchResults.java`
#### Snippet
```java

    @AutoValue.Builder
    abstract static class Builder extends BaseSearchResponse.Builder<Builder> {
      abstract ImmutableList.Builder<RdapEntity> entitySearchResultsBuilder();

```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `core/src/main/java/google/registry/rdap/RdapSearchResults.java`
#### Snippet
```java

    @AutoValue.Builder
    abstract static class Builder extends BaseSearchResponse.Builder<Builder> {
      abstract ImmutableList.Builder<RdapNameserver> nameserverSearchResultsBuilder();

```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `core/src/main/java/google/registry/rdap/RdapSearchResults.java`
#### Snippet
```java

    @AutoValue.Builder
    abstract static class Builder extends BaseSearchResponse.Builder<Builder> {
      abstract ImmutableList.Builder<RdapDomain> domainSearchResultsBuilder();

```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `core/src/main/java/google/registry/rdap/RdapObjectClasses.java`
#### Snippet
```java

    @AutoValue.Builder
    abstract static class Builder extends RdapNamedObjectBase.Builder<Builder> {
      abstract ImmutableList.Builder<RdapNameserver> nameserversBuilder();

```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `core/src/main/java/google/registry/rdap/RdapObjectClasses.java`
#### Snippet
```java

    @AutoValue.Builder
    abstract static class Builder extends RdapEntity.Builder<Builder> {
      abstract RdapRegistrarEntity build();
    }
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `core/src/main/java/google/registry/rdap/RdapObjectClasses.java`
#### Snippet
```java
    }

    abstract static class Builder<B extends Builder<?>> extends RdapObjectBase.Builder<B> {
      abstract B setLdhName(String ldhName);
    }
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `core/src/main/java/google/registry/rdap/RdapObjectClasses.java`
#### Snippet
```java

    @AutoValue.Builder
    abstract static class Builder extends RdapEntity.Builder<Builder> {
      abstract RdapContactEntity build();
    }
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `core/src/main/java/google/registry/rdap/RdapObjectClasses.java`
#### Snippet
```java
    @JsonableElement abstract ImmutableList<EventWithoutActor> asEventActor();

    private abstract static class Builder<B extends Builder<B>> extends RdapObjectBase.Builder<B> {
      abstract B setVcardArray(VcardArray vcardArray);

```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `core/src/main/java/google/registry/rdap/RdapObjectClasses.java`
#### Snippet
```java

    @AutoValue.Builder
    abstract static class Builder extends RdapNamedObjectBase.Builder<Builder> {
      abstract ImmutableList.Builder<String> ipv6Builder();
      abstract ImmutableList.Builder<String> ipv4Builder();
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `core/src/main/java/google/registry/flows/domain/FeesAndCredits.java`
#### Snippet
```java

  /** A builder for constructing {@link FeesAndCredits} objects, since they are immutable. */
  public static class Builder extends Buildable.Builder<FeesAndCredits> {

    public Builder() {}
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `core/src/main/java/google/registry/model/EppResource.java`
#### Snippet
```java

  /** Abstract builder for {@link EppResource} types. */
  public abstract static class Builder<T extends EppResource, B extends Builder<T, B>>
      extends GenericBuilder<T, B> {

```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `core/src/main/java/google/registry/model/host/Host.java`
#### Snippet
```java

  /** A builder for constructing {@link Host}, since it is immutable. */
  public static class Builder extends HostBase.Builder<Host, Builder> {
    public Builder() {}

```

### ClassNameSameAsAncestorName
Class name `AddRemove` is the same as one of its superclass' names
in `core/src/main/java/google/registry/model/host/HostCommand.java`
#### Snippet
```java
    /** The add/remove type on a host update command. */
    @XmlType(propOrder = { "inetAddresses", "statusValues" })
    public static class AddRemove extends ResourceUpdate.AddRemove {
      /** IP Addresses for this host. Can be null if this is an external host. */
      @XmlElement(name = "addr")
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `core/src/main/java/google/registry/model/tld/label/DomainLabelEntry.java`
#### Snippet
```java

  /** A generic builder base. */
  public abstract static class Builder<T extends DomainLabelEntry<?, ?>, B extends Builder<T, ?>>
      extends GenericBuilder<T, B> {

```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `core/src/main/java/google/registry/model/mark/MarkPhoneNumber.java`
#### Snippet
```java

  /** Builder for {@link MarkPhoneNumber}. */
  public static class Builder extends PhoneNumber.Builder<MarkPhoneNumber> {}
}

```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `core/src/main/java/google/registry/model/host/HostHistory.java`
#### Snippet
```java


  public static class Builder extends HistoryEntry.Builder<HostHistory, Builder> {

    public Builder() {}
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `core/src/main/java/google/registry/model/tld/label/PremiumList.java`
#### Snippet
```java

    /** A builder for constructing {@link PremiumEntry} objects, since they are immutable. */
    public static class Builder extends DomainLabelEntry.Builder<PremiumEntry, Builder> {

      public Builder() {}
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `core/src/main/java/google/registry/model/tld/label/PremiumList.java`
#### Snippet
```java

  /** A builder for constructing {@link PremiumList} objects, since they are immutable. */
  public static class Builder extends BaseDomainLabelList.Builder<PremiumList, Builder> {

    public Builder() {}
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `core/src/main/java/google/registry/model/tld/label/ReservedList.java`
#### Snippet
```java

    /** A builder for constructing {@link ReservedListEntry} objects, since they are immutable. */
    private static class Builder
        extends DomainLabelEntry.Builder<ReservedListEntry, ReservedListEntry.Builder> {

```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `core/src/main/java/google/registry/model/tld/label/ReservedList.java`
#### Snippet
```java
   * A builder for constructing {@link ReservedList} objects, since they are immutable.
   */
  public static class Builder extends BaseDomainLabelList.Builder<ReservedList, Builder> {

    public Builder() {}
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `core/src/main/java/google/registry/model/mark/MarkAddress.java`
#### Snippet
```java

  /** Builder for {@link MarkAddress}. */
  public static class Builder extends Address.Builder<MarkAddress> {}
}

```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `core/src/main/java/google/registry/model/tld/label/BaseDomainLabelList.java`
#### Snippet
```java

  /** Base builder for derived classes of {@link BaseDomainLabelList}. */
  public abstract static class Builder<T extends BaseDomainLabelList<?, ?>, B extends Builder<T, ?>>
      extends GenericBuilder<T, B> {

```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `core/src/main/java/google/registry/model/host/HostBase.java`
#### Snippet
```java

  /** A builder for constructing {@link HostBase}, since it is immutable. */
  protected static class Builder<T extends HostBase, B extends Builder<T, B>>
      extends EppResource.Builder<T, B> {
    public Builder() {}
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `core/src/main/java/google/registry/model/poll/MessageQueueInfo.java`
#### Snippet
```java

  /** A builder for constructing a {@link MessageQueueInfo}, since it's immutable. */
  public static class Builder extends Buildable.Builder<MessageQueueInfo> {
    public Builder setQueueDate(DateTime queueDate) {
      getInstance().queueDate = queueDate;
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `core/src/main/java/google/registry/model/tld/Registry.java`
#### Snippet
```java

  /** A builder for constructing {@link Registry} objects, since they are immutable. */
  public static class Builder extends Buildable.Builder<Registry> {
    public Builder() {}

```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `core/src/main/java/google/registry/model/domain/Domain.java`
#### Snippet
```java

  /** A builder for constructing {@link Domain}, since it is immutable. */
  public static class Builder extends DomainBase.Builder<Domain, Builder> {

    public Builder() {}
```

### ClassNameSameAsAncestorName
Class name `AddRemove` is the same as one of its superclass' names
in `core/src/main/java/google/registry/model/domain/DomainCommand.java`
#### Snippet
```java
    /** The inner change type on a domain update command. */
    @XmlType(propOrder = {"nameserverHostNames", "foreignKeyedDesignatedContacts", "statusValues"})
    public static class AddRemove extends ResourceUpdate.AddRemove {
      /** Fully qualified host names of the hosts that are the nameservers for the domain. */
      @XmlElementWrapper(name = "ns")
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `core/src/main/java/google/registry/model/domain/fee/FeeTransformResponseExtension.java`
#### Snippet
```java

  /** Abstract builder for {@link FeeTransformResponseExtension}. */
  public static class Builder extends Buildable.Builder<FeeTransformResponseExtension> {

    public Builder(FeeTransformResponseExtension instance) {
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `core/src/main/java/google/registry/model/domain/RegistryLock.java`
#### Snippet
```java

  /** Builder for {@link RegistryLock}. */
  public static class Builder extends Buildable.Builder<RegistryLock> {
    public Builder() {}

```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `core/src/main/java/google/registry/model/domain/DomainHistory.java`
#### Snippet
```java
  }

  public static class Builder extends HistoryEntry.Builder<DomainHistory, DomainHistory.Builder> {

    public Builder() {}
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `core/src/main/java/google/registry/model/domain/fee06/FeeCheckResponseExtensionItemV06.java`
#### Snippet
```java

  /** Builder for {@link FeeCheckResponseExtensionItemV06}. */
  public static class Builder
      extends FeeCheckResponseExtensionItem.Builder<FeeCheckResponseExtensionItemV06> {

```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `core/src/main/java/google/registry/model/domain/fee06/FeeDeleteResponseExtensionV06.java`
#### Snippet
```java

  /** Builder for {@link FeeDeleteResponseExtensionV06}. */
  public static class Builder extends FeeTransformResponseExtension.Builder {
    public Builder() {
      super(new FeeDeleteResponseExtensionV06());
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `core/src/main/java/google/registry/model/domain/fee06/FeeInfoResponseExtensionV06.java`
#### Snippet
```java

  /** Builder for {@link FeeInfoResponseExtensionV06}. */
  public static class Builder
      extends FeeQueryResponseExtensionItem.Builder<FeeInfoResponseExtensionV06, Builder> {

```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `core/src/main/java/google/registry/model/domain/fee/FeeCheckResponseExtensionItem.java`
#### Snippet
```java

  /** Abstract builder for {@link FeeCheckResponseExtensionItem}. */
  public abstract static class Builder<T extends FeeCheckResponseExtensionItem>
      extends FeeQueryResponseExtensionItem.Builder<T, Builder<T>> {

```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `core/src/main/java/google/registry/model/domain/fee11/FeeDeleteResponseExtensionV11.java`
#### Snippet
```java

  /** Builder for {@link FeeDeleteResponseExtensionV11}. */
  public static class Builder extends FeeTransformResponseExtension.Builder {
    public Builder() {
      super(new FeeDeleteResponseExtensionV11());
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `core/src/main/java/google/registry/model/domain/fee11/FeeCheckResponseExtensionItemV11.java`
#### Snippet
```java

  /** Builder for {@link FeeCheckResponseExtensionItemV11}. */
  public static class Builder
    extends FeeCheckResponseExtensionItem.Builder<FeeCheckResponseExtensionItemV11> {

```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `core/src/main/java/google/registry/model/poll/PollMessage.java`
#### Snippet
```java

    /** A builder for {@link Autorenew} since it is immutable. */
    public static class Builder extends PollMessage.Builder<Autorenew, Builder> {

      public Builder() {}
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `core/src/main/java/google/registry/model/poll/PollMessage.java`
#### Snippet
```java

  /** Builder for {@link PollMessage} because it is immutable. */
  public abstract static class Builder<T extends PollMessage, B extends Builder<?, ?>>
      extends GenericBuilder<T, B> {

```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `core/src/main/java/google/registry/model/poll/PollMessage.java`
#### Snippet
```java

    /** A builder for {@link OneTime} since it is immutable. */
    public static class Builder extends PollMessage.Builder<OneTime, Builder> {

      public Builder() {}
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `core/src/main/java/google/registry/model/domain/fee12/FeeDeleteResponseExtensionV12.java`
#### Snippet
```java

  /** Builder for {@link FeeDeleteResponseExtensionV12}. */
  public static class Builder extends FeeTransformResponseExtension.Builder {
    public Builder() {
      super(new FeeDeleteResponseExtensionV12());
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `core/src/main/java/google/registry/model/domain/launch/LaunchExtension.java`
#### Snippet
```java

  /** A builder for constructing {@link LaunchExtension}. */
  public static class Builder<T extends LaunchExtension, B extends Builder<?, ?>>
      extends GenericBuilder<T, B> {

```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `core/src/main/java/google/registry/model/domain/fee12/FeeCheckResponseExtensionItemCommandV12.java`
#### Snippet
```java

  /** Builder for {@link FeeCheckResponseExtensionItemCommandV12}. */
  public static class Builder
      extends GenericBuilder<FeeCheckResponseExtensionItemCommandV12, Builder> {

```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `core/src/main/java/google/registry/model/domain/fee12/FeeCheckResponseExtensionItemV12.java`
#### Snippet
```java

  /** Builder for {@link FeeCheckResponseExtensionItemV12}. */
  public static class Builder
      extends FeeCheckResponseExtensionItem.Builder<FeeCheckResponseExtensionItemV12> {

```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `core/src/main/java/google/registry/model/domain/token/AllocationToken.java`
#### Snippet
```java

  /** A builder for constructing {@link AllocationToken} objects, since they are immutable. */
  public static class Builder extends Buildable.Builder<AllocationToken> {

    public Builder() {}
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `core/src/main/java/google/registry/model/contact/ContactPhoneNumber.java`
#### Snippet
```java

  /** Builder for {@link ContactPhoneNumber}. */
  public static class Builder extends PhoneNumber.Builder<ContactPhoneNumber> {}
}

```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `core/src/main/java/google/registry/model/domain/token/PackagePromotion.java`
#### Snippet
```java

  /** A builder for constructing {@link PackagePromotion} objects, since they are immutable. */
  public static class Builder extends Buildable.Builder<PackagePromotion> {
    public Builder() {}

```

### ClassNameSameAsAncestorName
Class name `AddRemove` is the same as one of its superclass' names
in `core/src/main/java/google/registry/model/contact/ContactCommand.java`
#### Snippet
```java

    /** The inner change type on a contact update command. */
    public static class AddRemove extends ResourceUpdate.AddRemove {}

    /** The inner change type on a contact update command. */
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `core/src/main/java/google/registry/model/contact/ContactAddress.java`
#### Snippet
```java

  /** Builder for {@link ContactAddress}. */
  public static class Builder extends Address.Builder<ContactAddress> {}
}

```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `core/src/main/java/google/registry/model/contact/Disclose.java`
#### Snippet
```java

  /** A builder for {@link Disclose} since it is immutable. */
  public static class Builder extends Buildable.Builder<Disclose> {
    public Builder setNames(ImmutableList<PostalInfoChoice> names) {
      getInstance().name = names;
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `core/src/main/java/google/registry/model/contact/PostalInfo.java`
#### Snippet
```java

  /** A builder for constructing {@link PostalInfo}, since its changes get overlayed. */
  public static class Builder extends Buildable.Builder<PostalInfo> {
    public Builder() {}

```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `core/src/main/java/google/registry/model/console/UserRoles.java`
#### Snippet
```java

  /** Builder for constructing immutable {@link UserRoles} objects. */
  public static class Builder extends Buildable.Builder<UserRoles> {

    public Builder() {}
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `core/src/main/java/google/registry/model/contact/Contact.java`
#### Snippet
```java

  /** A builder for constructing {@link Contact}, since it is immutable. */
  public static class Builder extends ContactBase.Builder<Contact, Builder> {

    public Builder() {}
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `core/src/main/java/google/registry/model/console/User.java`
#### Snippet
```java

  /** Builder for constructing immutable {@link User} objects. */
  public static class Builder extends Buildable.Builder<User> {

    public Builder() {}
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `core/src/main/java/google/registry/model/contact/ContactHistory.java`
#### Snippet
```java
  }

  public static class Builder extends HistoryEntry.Builder<ContactHistory, ContactHistory.Builder> {

    public Builder() {}
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `core/src/main/java/google/registry/model/contact/ContactBase.java`
#### Snippet
```java

  /** A builder for constructing {@link Contact}, since it is immutable. */
  public static class Builder<T extends ContactBase, B extends Builder<T, B>>
      extends EppResource.Builder<T, B> implements BuilderWithTransferData<ContactTransferData, B> {

```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `core/src/main/java/google/registry/model/transfer/BaseTransferObject.java`
#### Snippet
```java

  /** Base class for builders of {@link BaseTransferObject} subclasses. */
  public abstract static class Builder<T extends BaseTransferObject, B extends Builder<?, ?>>
      extends GenericBuilder<T, B> {

```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `core/src/main/java/google/registry/model/domain/DomainBase.java`
#### Snippet
```java

  /** A builder for constructing {@link Domain}, since it is immutable. */
  public static class Builder<T extends DomainBase, B extends Builder<T, B>>
      extends EppResource.Builder<T, B> implements BuilderWithTransferData<DomainTransferData, B> {

```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `core/src/main/java/google/registry/model/transfer/ContactTransferData.java`
#### Snippet
```java
  }

  public static class Builder extends TransferData.Builder<ContactTransferData, Builder> {
    /** Create a {@link Builder} wrapping a new instance. */
    public Builder() {}
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `core/src/main/java/google/registry/model/transfer/TransferResponse.java`
#### Snippet
```java

    /** Builder for {@link ContactTransferResponse}. */
    public static class Builder
        extends BaseTransferObject.Builder<ContactTransferResponse, Builder> {
      public Builder setContactId(String contactId) {
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `core/src/main/java/google/registry/model/transfer/TransferResponse.java`
#### Snippet
```java

    /** Builder for {@link DomainTransferResponse}. */
    public static class Builder
        extends BaseTransferObject.Builder<DomainTransferResponse, Builder> {
      public Builder setDomainName(String domainName) {
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `core/src/main/java/google/registry/model/transfer/DomainTransferData.java`
#### Snippet
```java
  }

  public static class Builder extends TransferData.Builder<DomainTransferData, Builder> {
    /** Create a {@link Builder} wrapping a new instance. */
    public Builder() {}
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `core/src/main/java/google/registry/model/eppcommon/Address.java`
#### Snippet
```java

  /** A builder for constructing {@link Address}. */
  public static class Builder<T extends Address> extends Buildable.Builder<T> {

    public Builder() {}
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `core/src/main/java/google/registry/model/domain/fee/FeeQueryResponseExtensionItem.java`
#### Snippet
```java
  /** Abstract builder for {@link FeeQueryResponseExtensionItem}. */
  public abstract static class
      Builder<T extends FeeQueryResponseExtensionItem, B extends Builder<?, ?>>
          extends GenericBuilder<T, B> {

```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `core/src/main/java/google/registry/model/transfer/TransferData.java`
#### Snippet
```java

  /** Builder for {@link TransferData} because it is immutable. */
  public abstract static class Builder<T extends TransferData, B extends Builder<T, B>>
      extends BaseTransferObject.Builder<T, B> {

```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `core/src/main/java/google/registry/model/eppoutput/EppResponse.java`
#### Snippet
```java

  /** Builder for {@link EppResponse} because it is immutable. */
  public static class Builder extends Buildable.Builder<EppResponse> {
    public Builder setTrid(Trid trid) {
      getInstance().trid = trid;
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `core/src/main/java/google/registry/model/reporting/Spec11ThreatMatch.java`
#### Snippet
```java

  /** A builder for constructing {@link Spec11ThreatMatch}, since it is immutable. */
  public static class Builder extends Buildable.Builder<Spec11ThreatMatch> {
    public Builder() {}

```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `core/src/main/java/google/registry/model/registrar/RegistrarAddress.java`
#### Snippet
```java

  /** Builder for {@link RegistrarAddress}. */
  public static class Builder extends Address.Builder<RegistrarAddress> {
    public Builder() {}

```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `core/src/main/java/google/registry/model/registrar/RegistrarPoc.java`
#### Snippet
```java

  /** A builder for constructing a {@link RegistrarPoc}, since it is immutable. */
  public static class Builder extends Buildable.Builder<RegistrarPoc> {
    public Builder() {}

```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `core/src/main/java/google/registry/model/eppcommon/PhoneNumber.java`
#### Snippet
```java

  /** A builder for constructing {@link PhoneNumber}. */
  public static class Builder<T extends PhoneNumber> extends Buildable.Builder<T> {
    @Override
    public T build() {
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `core/src/main/java/google/registry/model/billing/BillingEvent.java`
#### Snippet
```java

    /** A builder for {@link Cancellation} since it is immutable. */
    public static class Builder extends BillingEvent.Builder<Cancellation, Builder> {

      public Builder() {}
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `core/src/main/java/google/registry/model/billing/BillingEvent.java`
#### Snippet
```java

    /** A builder for {@link OneTime} since it is immutable. */
    public static class Builder extends BillingEvent.Builder<OneTime, Builder> {

      public Builder() {}
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `core/src/main/java/google/registry/model/billing/BillingEvent.java`
#### Snippet
```java

  /** An abstract builder for {@link BillingEvent}. */
  public abstract static class Builder<T extends BillingEvent, B extends Builder<?, ?>>
      extends GenericBuilder<T, B> {

```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `core/src/main/java/google/registry/model/billing/BillingEvent.java`
#### Snippet
```java

    /** A builder for {@link Recurring} since it is immutable. */
    public static class Builder extends BillingEvent.Builder<Recurring, Builder> {

      public Builder() {}
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `core/src/main/java/google/registry/model/reporting/DomainTransactionRecord.java`
#### Snippet
```java

  /** A builder for {@link DomainTransactionRecord} since it is immutable. */
  public static class Builder extends Buildable.Builder<DomainTransactionRecord> {

    public Builder() {}
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `core/src/main/java/google/registry/model/registrar/Registrar.java`
#### Snippet
```java

  /** A builder for constructing {@link Registrar}, since it is immutable. */
  public static class Builder extends Buildable.Builder<Registrar> {
    public Builder() {}

```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `core/src/main/java/google/registry/model/reporting/HistoryEntry.java`
#### Snippet
```java

  /** A builder for {@link HistoryEntry} since it is immutable */
  public abstract static class Builder<T extends HistoryEntry, B extends Builder<?, ?>>
      extends GenericBuilder<T, B> {
    protected Builder() {}
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `proxy/src/main/java/google/registry/proxy/Protocol.java`
#### Snippet
```java

    @AutoValue.Builder
    public abstract static class Builder extends Protocol.Builder<Builder, FrontendProtocol> {
      public abstract Builder relayProtocol(BackendProtocol value);

```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `proxy/src/main/java/google/registry/proxy/Protocol.java`
#### Snippet
```java
    /** Builder of {@link BackendProtocol}. */
    @AutoValue.Builder
    public abstract static class Builder extends Protocol.Builder<Builder, BackendProtocol> {
      public abstract Builder host(String value);
    }
```

## RuleId[ruleID=IntegerMultiplicationImplicitCastToLong]
### IntegerMultiplicationImplicitCastToLong
pow(2, failures) \* 100: integer multiplication implicitly cast to long
in `util/src/main/java/google/registry/util/Retrier.java`
#### Snippet
```java
        try {
          // Wait 100ms on the first attempt, doubling on each subsequent attempt.
          sleeper.sleep(Duration.millis(pow(2, failures) * 100));
        } catch (InterruptedException e2) {
          // Since we're not rethrowing InterruptedException, set the interrupt state on the thread
```

## RuleId[ruleID=OptionalAssignedToNull]
### OptionalAssignedToNull
Optional value is compared with null
in `core/src/main/java/google/registry/tools/CreateOrUpdateTldCommand.java`
#### Snippet
```java
      Optional.ofNullable(numDnsPublishShards).ifPresent(builder::setNumDnsPublishLocks);

      if (premiumListName != null) {
        if (premiumListName.isPresent()) {
          Optional<PremiumList> premiumList =
```

### OptionalAssignedToNull
Optional value is compared with null
in `core/src/main/java/google/registry/tools/RegistrarPocCommand.java`
#### Snippet
```java
      builder.setRegistryLockEmailAddress(registryLockEmail);
    }
    if (phone != null) {
      builder.setPhoneNumber(phone.orElse(null));
    }
```

### OptionalAssignedToNull
Optional value is compared with null
in `core/src/main/java/google/registry/tools/RegistrarPocCommand.java`
#### Snippet
```java
      builder.setPhoneNumber(phone.orElse(null));
    }
    if (fax != null) {
      builder.setFaxNumber(fax.orElse(null));
    }
```

### OptionalAssignedToNull
Optional value is compared with null
in `core/src/main/java/google/registry/tools/RegistrarPocCommand.java`
#### Snippet
```java
      builder.setRegistryLockEmailAddress(registryLockEmail);
    }
    if (phone != null) {
      builder.setPhoneNumber(phone.orElse(null));
    }
```

### OptionalAssignedToNull
Optional value is compared with null
in `core/src/main/java/google/registry/tools/RegistrarPocCommand.java`
#### Snippet
```java
      builder.setPhoneNumber(phone.orElse(null));
    }
    if (fax != null) {
      builder.setFaxNumber(fax.orElse(null));
    }
```

### OptionalAssignedToNull
Optional value is compared with null
in `core/src/main/java/google/registry/tools/CreateOrUpdateRegistrarCommand.java`
#### Snippet
```java
        builder.setEmailAddress(icannReferralEmail);
      }
      if (url != null) {
        builder.setUrl(url.orElse(null));
      }
```

### OptionalAssignedToNull
Optional value is compared with null
in `core/src/main/java/google/registry/tools/CreateOrUpdateRegistrarCommand.java`
#### Snippet
```java
        builder.setUrl(url.orElse(null));
      }
      if (phone != null) {
        builder.setPhoneNumber(phone.orElse(null));
      }
```

### OptionalAssignedToNull
Optional value is compared with null
in `core/src/main/java/google/registry/tools/CreateOrUpdateRegistrarCommand.java`
#### Snippet
```java
        builder.setPhoneNumber(phone.orElse(null));
      }
      if (fax != null) {
        builder.setFaxNumber(fax.orElse(null));
      }
```

### OptionalAssignedToNull
Optional value is compared with null
in `core/src/main/java/google/registry/tools/CreateOrUpdateRegistrarCommand.java`
#### Snippet
```java
        builder.setState(registrarState);
      }
      if (driveFolderId != null) {
        builder.setDriveFolderId(driveFolderId.orElse(null));
      }
```

### OptionalAssignedToNull
Optional value is compared with null
in `core/src/main/java/google/registry/tools/CreateOrUpdateRegistrarCommand.java`
#### Snippet
```java
        builder.setFailoverClientCertificate(asciiCert, now);
      }
      if (ianaId != null) {
        builder.setIanaIdentifier(ianaId.orElse(null));
      }
```

## RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
### ReplaceAssignmentWithOperatorAssignment
`bytes[cidrByte] = (byte) (bytes[cidrByte] | bitMask)` could be simplified to 'bytes\[cidrByte\] \|= bitMask'
in `util/src/main/java/google/registry/util/CidrAddressBlock.java`
#### Snippet
```java

    // Set all non-prefix bits where the CIDR boundary falls.
    bytes[cidrByte] = (byte) (bytes[cidrByte] | bitMask);

    // All bytes following the cidrByte get set to all ones.
```

### ReplaceAssignmentWithOperatorAssignment
`bytes[cidrByte] = (byte) (bytes[cidrByte] & bitMask)` could be simplified to 'bytes\[cidrByte\] \&= bitMask'
in `util/src/main/java/google/registry/util/CidrAddressBlock.java`
#### Snippet
```java

    // Truncate the byte in which the CIDR boundary falls.
    bytes[cidrByte] = (byte) (bytes[cidrByte] & bitMask);

    // All bytes following the cidrByte get zeroed.
```

## RuleId[ruleID=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `core/src/main/java/google/registry/ui/forms/FormFieldException.java`
#### Snippet
```java
    String fieldName = lazyFieldName;
    if (fieldName == null) {
      lazyFieldName = fieldName = getFieldNameImpl();
    }
    return fieldName;
```

### NestedAssignment
Result of assignment expression used
in `core/src/main/java/google/registry/rde/RdeMarshaller.java`
#### Snippet
```java
    return memoizedMarshaller != null
        ?  memoizedMarshaller
        : (memoizedMarshaller = XjcXmlTransformer.get().createFragmentMarshaller());
  }
}
```

### NestedAssignment
Result of assignment expression used
in `core/src/main/java/google/registry/model/domain/DomainBase.java`
#### Snippet
```java
  void setContactFields(Set<DesignatedContact> contacts, boolean includeRegistrant) {
    // Set the individual contact fields.
    billingContact = techContact = adminContact = null;
    if (includeRegistrant) {
      registrantContact = null;
```

### NestedAssignment
Result of assignment expression used
in `core/src/main/java/google/registry/model/domain/DomainBase.java`
#### Snippet
```java
  void setContactFields(Set<DesignatedContact> contacts, boolean includeRegistrant) {
    // Set the individual contact fields.
    billingContact = techContact = adminContact = null;
    if (includeRegistrant) {
      registrantContact = null;
```

### NestedAssignment
Result of assignment expression used
in `core/src/main/java/google/registry/tools/ShellCommand.java`
#### Snippet
```java
    String line;
    DateTime lastTime = clock.nowUtc();
    while ((line = getLine()) != null) {
      // Make sure we're not idle for too long. Only relevant when we're "extra careful"
      if (!dontExitOnIdle
```

### NestedAssignment
Result of assignment expression used
in `util/src/main/java/google/registry/util/UrlChecker.java`
#### Snippet
```java
                    return null;
                  }
                  Thread.sleep(exponentialBackoffMs *= 2);
                }
              },
```

## RuleId[ruleID=CodeBlock2Expr]
### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `core/src/main/java/google/registry/tools/SetupOteCommand.java`
#### Snippet
```java
    output.append("Copy these usernames/passwords back into the onboarding bug:\n\n");
    clientIdToTld.forEach(
        (clientId, tld) -> {
          output.append(
              String.format("Login: %s\nPassword: %s\nTLD: %s\n\n", clientId, password, tld));
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `core/src/main/java/google/registry/reporting/spec11/Spec11EmailUtils.java`
#### Snippet
```java
        tm().transact(
                () -> {
                  return registrarThreatMatches.threatMatches().stream()
                      .filter(
                          threatMatch ->
```

## RuleId[ruleID=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `files` are queried, but never updated
in `core/src/main/java/google/registry/tools/SendEscrowReportToIcannCommand.java`
#### Snippet
```java
      validateWith = PathParameter.InputFile.class,
      required = true)
  private List<Path> files;

  @Inject Lazy<RdeReporter> rdeReporter;
```

### MismatchedCollectionQueryUpdate
Contents of collection `mainParameters` are queried, but never updated
in `core/src/main/java/google/registry/tools/CanonicalizeLabelsCommand.java`
#### Snippet
```java
      description = "Filename of file containing domain labels, one per line",
      required = true)
  private List<String> mainParameters;

  @NonFinalForTesting
```

### MismatchedCollectionQueryUpdate
Contents of collection `newHosts` are queried, but never updated
in `core/src/main/java/google/registry/tools/UniformRapidSuspensionCommand.java`
#### Snippet
```java
      description = "Comma-delimited set of fully qualified host names to replace the current hosts"
          + " on the domain.")
  private List<String> newHosts = new ArrayList<>();

  @Parameter(
```

### MismatchedCollectionQueryUpdate
Contents of collection `mainParameters` are queried, but never updated
in `core/src/main/java/google/registry/tools/GetPremiumListCommand.java`
#### Snippet
```java

  @Parameter(description = "Name(s) of the premium list(s) to retrieve", required = true)
  private List<String> mainParameters;

  @Override
```

### MismatchedCollectionQueryUpdate
Contents of collection `watermarks` are queried, but never updated
in `core/src/main/java/google/registry/tools/GenerateEscrowDepositCommand.java`
#### Snippet
```java
      required = true,
      converter = DateTimeParameter.class)
  private List<DateTime> watermarks;

  @Parameter(
```

### MismatchedCollectionQueryUpdate
Contents of collection `mainParameters` are queried, but never updated
in `core/src/main/java/google/registry/tools/ExecuteEppCommand.java`
#### Snippet
```java
final class ExecuteEppCommand extends MutatingEppToolCommand {
  @Parameter(description = "Epp command filename")
  private List<String> mainParameters = new ArrayList<>();

  @Parameter(
```

### MismatchedCollectionQueryUpdate
Contents of collection `addTechs` are queried, but never updated
in `core/src/main/java/google/registry/tools/UpdateDomainCommand.java`
#### Snippet
```java

  @Parameter(names = "--add_techs", description = "Techs to add. Cannot be set if --techs is set.")
  private List<String> addTechs = new ArrayList<>();

  @Parameter(
```

### MismatchedCollectionQueryUpdate
Contents of collection `removeNameservers` are queried, but never updated
in `core/src/main/java/google/registry/tools/UpdateDomainCommand.java`
#### Snippet
```java
      converter = NameserversParameter.class,
      validateWith = NameserversParameter.class)
  private Set<String> removeNameservers = new HashSet<>();

  @Parameter(
```

### MismatchedCollectionQueryUpdate
Contents of collection `removeAdmins` are queried, but never updated
in `core/src/main/java/google/registry/tools/UpdateDomainCommand.java`
#### Snippet
```java
    description = "Admins to remove. Cannot be set if --admins is set."
  )
  private List<String> removeAdmins = new ArrayList<>();

  @Parameter(
```

### MismatchedCollectionQueryUpdate
Contents of collection `addNameservers` are queried, but never updated
in `core/src/main/java/google/registry/tools/UpdateDomainCommand.java`
#### Snippet
```java
      converter = NameserversParameter.class,
      validateWith = NameserversParameter.class)
  private Set<String> addNameservers = new HashSet<>();

  // TODO(b/184067241): enforce only one of each type of contact
```

### MismatchedCollectionQueryUpdate
Contents of collection `removeTechs` are queried, but never updated
in `core/src/main/java/google/registry/tools/UpdateDomainCommand.java`
#### Snippet
```java
    description = "Techs to remove. Cannot be set if --techs is set."
  )
  private List<String> removeTechs = new ArrayList<>();

  @Parameter(
```

### MismatchedCollectionQueryUpdate
Contents of collection `addAdmins` are queried, but never updated
in `core/src/main/java/google/registry/tools/UpdateDomainCommand.java`
#### Snippet
```java
      names = "--add_admins",
      description = "Admins to add. Cannot be set if --admins is set.")
  private List<String> addAdmins = new ArrayList<>();

  @Parameter(names = "--add_techs", description = "Techs to add. Cannot be set if --techs is set.")
```

### MismatchedCollectionQueryUpdate
Contents of collection `removeStatuses` are queried, but never updated
in `core/src/main/java/google/registry/tools/UpdateDomainCommand.java`
#### Snippet
```java
    description = "Statuses to remove. Cannot be set if --statuses is set."
  )
  private List<String> removeStatuses = new ArrayList<>();

  @Parameter(
```

### MismatchedCollectionQueryUpdate
Contents of collection `addStatuses` are queried, but never updated
in `core/src/main/java/google/registry/tools/UpdateDomainCommand.java`
#### Snippet
```java
    description = "Statuses to add. Cannot be set if --statuses is set."
  )
  private List<String> addStatuses = new ArrayList<>();

  @Parameter(
```

### MismatchedCollectionQueryUpdate
Contents of collection `contactTypeNames` are queried, but never updated
in `core/src/main/java/google/registry/tools/RegistrarPocCommand.java`
#### Snippet
```java
      description = "Type of communications for this contact; separate multiple with commas."
          + " Allowed values are ABUSE, ADMIN, BILLING, LEGAL, MARKETING, TECH, WHOIS.")
  private List<String> contactTypeNames;

  @Nullable
```

### MismatchedCollectionQueryUpdate
Contents of collection `mainParameters` are queried, but never updated
in `core/src/main/java/google/registry/tools/GetDomainCommand.java`
#### Snippet
```java
      description = "Fully qualified domain name(s)",
      required = true)
  private List<String> mainParameters;

  @Override
```

### MismatchedCollectionQueryUpdate
Contents of collection `billingAccountMap` are queried, but never updated
in `core/src/main/java/google/registry/tools/CreateOrUpdateRegistrarCommand.java`
#### Snippet
```java
      converter = CurrencyUnitToStringMap.class,
      validateWith = CurrencyUnitToStringMap.class)
  private Map<CurrencyUnit, String> billingAccountMap;

  @Nullable
```

### MismatchedCollectionQueryUpdate
Contents of collection `mainParameters` are queried, but never updated
in `core/src/main/java/google/registry/tools/GetHostCommand.java`
#### Snippet
```java
      description = "Fully qualified host name(s)",
      required = true)
  private List<String> mainParameters;

  @Override
```

### MismatchedCollectionQueryUpdate
Contents of collection `mainParameters` are queried, but never updated
in `core/src/main/java/google/registry/tools/GetContactCommand.java`
#### Snippet
```java
      description = "Contact id(s)",
      required = true)
  private List<String> mainParameters;

  @Override
```

### MismatchedCollectionQueryUpdate
Contents of collection `mainParameters` are queried, but never updated
in `core/src/main/java/google/registry/tools/ConvertIdnCommand.java`
#### Snippet
```java
      description = "Labels to convert",
      required = true)
  private List<String> mainParameters;

  @Override
```

### MismatchedCollectionQueryUpdate
Contents of collection `mainParameters` are queried, but never updated
in `core/src/main/java/google/registry/tools/HelpCommand.java`
#### Snippet
```java

  @Parameter(description = "<command>")
  private List<String> mainParameters = new ArrayList<>();

  @Override
```

### MismatchedCollectionQueryUpdate
Contents of collection `mainParameters` are queried, but never updated
in `core/src/main/java/google/registry/tools/GetRegistrarCommand.java`
#### Snippet
```java
      description = "Client identifier of the registrar account(s)",
      required = true)
  private List<String> mainParameters;

  @Override
```

### MismatchedCollectionQueryUpdate
Contents of collection `clientIds` are queried, but never updated
in `core/src/main/java/google/registry/tools/CreateRegistrarGroupsCommand.java`
#### Snippet
```java
      description = "Client identifier(s) of the registrar(s) to create groups for",
      required = true)
  private List<String> clientIds;

  private List<Registrar> registrars = new ArrayList<>();
```

### MismatchedCollectionQueryUpdate
Contents of collection `mainParameters` are queried, but never updated
in `core/src/main/java/google/registry/tools/GetPackagePromotionCommand.java`
#### Snippet
```java

  @Parameter(description = "Package token(s)", required = true)
  private List<String> mainParameters;

  @Override
```

### MismatchedCollectionQueryUpdate
Contents of collection `inputs` are queried, but never updated
in `core/src/main/java/google/registry/tools/javascrap/CompareEscrowDepositsCommand.java`
#### Snippet
```java
          "Two XML escrow deposit files. Each may be a plain XML or an XML GhostRyDE file.",
      validateWith = PathParameter.InputFile.class)
  private List<Path> inputs;

  @Inject Provider<Keyring> keyring;
```

## RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `reservedListMap` is accessed in both synchronized and unsynchronized contexts
in `core/src/main/java/google/registry/model/tld/label/ReservedList.java`
#### Snippet
```java
  @Insignificant
  @Transient
  Map<String, ReservedListEntry> reservedListMap;

  @Column(nullable = false)
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `count` is accessed in both synchronized and unsynchronized contexts
in `util/src/main/java/google/registry/util/ImprovedInputStream.java`
#### Snippet
```java
  private static final FluentLogger logger = FluentLogger.forEnclosingClass();

  private long count;
  private long mark = -1;
  private final boolean shouldClose;
```

## RuleId[ruleID=EmptyMethod]
### EmptyMethod
The method is empty
in `core/src/main/java/google/registry/flows/custom/DomainCheckFlowCustomLogic.java`
#### Snippet
```java
  /** A hook that runs before any validation. This is useful to e.g. add allowable extensions. */
  @SuppressWarnings("unused")
  public void beforeValidation() throws EppException {
    // Do nothing.
  }
```

### EmptyMethod
The method is empty
in `core/src/main/java/google/registry/flows/custom/DomainCheckFlowCustomLogic.java`
#### Snippet
```java
  /** A hook that runs at the end of the validation step to perform additional validation. */
  @SuppressWarnings("unused")
  public void afterValidation(AfterValidationParameters parameters) throws EppException {
    // Do nothing.
  }
```

### EmptyMethod
The method is empty
in `core/src/main/java/google/registry/flows/custom/DomainCreateFlowCustomLogic.java`
#### Snippet
```java
  /** A hook that runs before any validation. This is useful to e.g. add allowable extensions. */
  @SuppressWarnings("unused")
  public void beforeValidation() throws EppException {
    // Do nothing.
  }
```

### EmptyMethod
The method is empty
in `core/src/main/java/google/registry/flows/custom/DomainCreateFlowCustomLogic.java`
#### Snippet
```java
  /** A hook that runs at the end of the validation step to perform additional validation. */
  @SuppressWarnings("unused")
  public void afterValidation(AfterValidationParameters parameters) throws EppException {
    // Do nothing.
  }
```

### EmptyMethod
The method is empty
in `core/src/main/java/google/registry/flows/custom/DomainDeleteFlowCustomLogic.java`
#### Snippet
```java
  /** A hook that runs before any validation. This is useful to e.g. add allowable extensions. */
  @SuppressWarnings("unused")
  public void beforeValidation() throws EppException {
    // Do nothing.
  }
```

### EmptyMethod
The method is empty
in `core/src/main/java/google/registry/flows/custom/DomainDeleteFlowCustomLogic.java`
#### Snippet
```java
  /** A hook that runs at the end of the validation step to perform additional validation. */
  @SuppressWarnings("unused")
  public void afterValidation(AfterValidationParameters parameters) throws EppException {
    // Do nothing.
  }
```

### EmptyMethod
The method is empty
in `core/src/main/java/google/registry/flows/custom/DomainInfoFlowCustomLogic.java`
#### Snippet
```java
  /** A hook that runs before any validation. This is useful to e.g. add allowable extensions. */
  @SuppressWarnings("unused")
  public void beforeValidation() throws EppException {
    // Do nothing.
  }
```

### EmptyMethod
The method is empty
in `core/src/main/java/google/registry/flows/custom/DomainInfoFlowCustomLogic.java`
#### Snippet
```java
  /** A hook that runs at the end of the validation step to perform additional validation. */
  @SuppressWarnings("unused")
  public void afterValidation(AfterValidationParameters parameters) throws EppException {
    // Do nothing.
  }
```

### EmptyMethod
The method is empty
in `core/src/main/java/google/registry/flows/custom/DomainRenewFlowCustomLogic.java`
#### Snippet
```java
  /** A hook that runs before any validation. This is useful to e.g. add allowable extensions. */
  @SuppressWarnings("unused")
  public void beforeValidation() throws EppException {
    // Do nothing.
  }
```

### EmptyMethod
The method is empty
in `core/src/main/java/google/registry/flows/custom/DomainRenewFlowCustomLogic.java`
#### Snippet
```java
  /** A hook that runs at the end of the validation step to perform additional validation. */
  @SuppressWarnings("unused")
  public void afterValidation(AfterValidationParameters parameters) throws EppException {
    // Do nothing.
  }
```

### EmptyMethod
The method is empty
in `core/src/main/java/google/registry/flows/custom/DomainUpdateFlowCustomLogic.java`
#### Snippet
```java
  /** A hook that runs before any validation. This is useful to e.g. add allowable extensions. */
  @SuppressWarnings("unused")
  public void beforeValidation() throws EppException {
    // Do nothing.
  }
```

### EmptyMethod
The method is empty
in `core/src/main/java/google/registry/flows/custom/DomainUpdateFlowCustomLogic.java`
#### Snippet
```java
  /** A hook that runs at the end of the validation step to perform additional validation. */
  @SuppressWarnings("unused")
  public void afterValidation(AfterValidationParameters parameters) throws EppException {
    // Do nothing.
  }
```

### EmptyMethod
Method only calls its super
in `core/src/main/java/google/registry/model/contact/Contact.java`
#### Snippet
```java
  @Id
  @Access(AccessType.PROPERTY)
  public String getRepoId() {
    return super.getRepoId();
  }
```

### EmptyMethod
Method only calls its super
in `core/src/main/java/google/registry/model/domain/Domain.java`
#### Snippet
```java
  @Id
  @Access(AccessType.PROPERTY)
  public String getRepoId() {
    return super.getRepoId();
  }
```

### EmptyMethod
Method only calls its super
in `core/src/main/java/google/registry/model/domain/GracePeriod.java`
#### Snippet
```java
  @Access(AccessType.PROPERTY)
  @Override
  public long getGracePeriodId() {
    return super.getGracePeriodId();
  }
```

### EmptyMethod
Method only calls its super
in `core/src/main/java/google/registry/model/domain/GracePeriod.java`
#### Snippet
```java
    @Override
    @Access(AccessType.PROPERTY)
    public long getGracePeriodId() {
      return super.getGracePeriodId();
    }
```

### EmptyMethod
Method only calls its super
in `core/src/main/java/google/registry/model/domain/fee06/FeeRenewResponseExtensionV06.java`
#### Snippet
```java
  /** This version of the extension doesn't support the "credit" field. */
  @Override
  public ImmutableList<Credit> getCredits() {
    return super.getCredits();
  }
```

### EmptyMethod
Method only calls its super
in `core/src/main/java/google/registry/model/domain/fee06/FeeTransferResponseExtensionV06.java`
#### Snippet
```java
  /** This version of the extension doesn't support the "credit" field. */
  @Override
  public ImmutableList<Credit> getCredits() {
    return super.getCredits();
  }
```

### EmptyMethod
Method only calls its super
in `core/src/main/java/google/registry/model/domain/fee06/FeeUpdateResponseExtensionV06.java`
#### Snippet
```java
  /** This version of the extension doesn't support the "credit" field. */
  @Override
  public ImmutableList<Credit> getCredits() {
    return super.getCredits();
  }
```

### EmptyMethod
Method only calls its super
in `core/src/main/java/google/registry/model/domain/fee12/FeeCheckResponseExtensionItemV12.java`
#### Snippet
```java
   */
  @Override
  public Period getPeriod() {
    return super.getPeriod();
  }
```

### EmptyMethod
Method only calls its super
in `core/src/main/java/google/registry/model/domain/fee12/FeeCheckResponseExtensionItemV12.java`
#### Snippet
```java
   */
  @Override
  public ImmutableList<Fee> getFees() {
    return super.getFees();
  }
```

### EmptyMethod
Method only calls its super
in `core/src/main/java/google/registry/model/domain/secdns/DomainDsData.java`
#### Snippet
```java
  @Id
  @Access(AccessType.PROPERTY)
  public String getDomainRepoId() {
    return super.getDomainRepoId();
  }
```

### EmptyMethod
Method only calls its super
in `core/src/main/java/google/registry/model/domain/secdns/DomainDsData.java`
#### Snippet
```java
  @Id
  @Access(AccessType.PROPERTY)
  public int getKeyTag() {
    return super.getKeyTag();
  }
```

### EmptyMethod
Method only calls its super
in `core/src/main/java/google/registry/model/domain/secdns/DomainDsData.java`
#### Snippet
```java
  @Id
  @Access(AccessType.PROPERTY)
  public int getAlgorithm() {
    return super.getAlgorithm();
  }
```

### EmptyMethod
Method only calls its super
in `core/src/main/java/google/registry/model/domain/secdns/DomainDsData.java`
#### Snippet
```java
  @Id
  @Access(AccessType.PROPERTY)
  public int getDigestType() {
    return super.getDigestType();
  }
```

### EmptyMethod
Method only calls its super
in `core/src/main/java/google/registry/model/domain/secdns/DomainDsData.java`
#### Snippet
```java
  @Id
  @Access(AccessType.PROPERTY)
  public byte[] getDigest() {
    return super.getDigest();
  }
```

### EmptyMethod
Method only calls its super
in `core/src/main/java/google/registry/model/domain/secdns/DomainDsDataHistory.java`
#### Snippet
```java
  @Override
  @Access(AccessType.PROPERTY)
  public String getDomainRepoId() {
    return super.getDomainRepoId();
  }
```

### EmptyMethod
Method only calls its super
in `core/src/main/java/google/registry/model/domain/secdns/DomainDsDataHistory.java`
#### Snippet
```java
  @Override
  @Access(AccessType.PROPERTY)
  public int getKeyTag() {
    return super.getKeyTag();
  }
```

### EmptyMethod
Method only calls its super
in `core/src/main/java/google/registry/model/domain/secdns/DomainDsDataHistory.java`
#### Snippet
```java
  @Override
  @Access(AccessType.PROPERTY)
  public int getAlgorithm() {
    return super.getAlgorithm();
  }
```

### EmptyMethod
Method only calls its super
in `core/src/main/java/google/registry/model/domain/secdns/DomainDsDataHistory.java`
#### Snippet
```java
  @Override
  @Access(AccessType.PROPERTY)
  public int getDigestType() {
    return super.getDigestType();
  }
```

### EmptyMethod
Method only calls its super
in `core/src/main/java/google/registry/model/domain/secdns/DomainDsDataHistory.java`
#### Snippet
```java
  @Access(AccessType.PROPERTY)
  @Column(nullable = false)
  public byte[] getDigest() {
    return super.getDigest();
  }
```

### EmptyMethod
Method only calls its super
in `core/src/main/java/google/registry/model/host/Host.java`
#### Snippet
```java
  @Id
  @Access(AccessType.PROPERTY) // to tell it to use the non-default property-as-ID
  public String getRepoId() {
    return super.getRepoId();
  }
```

### EmptyMethod
Method only calls its super
in `core/src/main/java/google/registry/model/host/HostBase.java`
#### Snippet
```java

    @Override
    public T build() {
      return super.build();
    }
```

### EmptyMethod
The method is empty
in `core/src/main/java/google/registry/model/ofy/ObjectifyService.java`
#### Snippet
```java

  /** Ensures that Objectify has been fully initialized. */
  public static void initOfy() {
    // This method doesn't actually do anything; it's here so that callers have something to call
    // to ensure that the static initialization of ObjectifyService has been performed (which Java
```

### EmptyMethod
Method only calls its super
in `core/src/main/java/google/registry/model/transfer/BaseTransferObject.java`
#### Snippet
```java

    @Override
    public T build() {
      return super.build();
    }
```

### EmptyMethod
The method is empty
in `core/src/main/java/google/registry/privileges/secretmanager/SqlCredential.java`
#### Snippet
```java

  @Override
  public final String toString() {
    // Use Object.toString(), which does not show object data.
    return super.toString();
```

### EmptyMethod
All implementations of this method are empty
in `core/src/main/java/google/registry/reporting/icann/DnsCountQueryCoordinator.java`
#### Snippet
```java
   * to handle them correctly or propagate them as-is, no {@link RuntimeException} wrapping).
   */
  void prepareForQuery(YearMonth yearMonth) throws InterruptedException;
}

```

### EmptyMethod
The method is empty
in `core/src/main/java/google/registry/tools/CreateOrUpdateTldCommand.java`
#### Snippet
```java

  /** Subclasses can override this to assert that the command can be run in this environment. */
  void assertAllowedEnvironment() {}

  protected abstract void initTldCommand();
```

### EmptyMethod
The method is empty
in `core/src/main/java/google/registry/tools/MutatingCommand.java`
#### Snippet
```java

  /** Performs any execution step after each batch. */
  protected void postBatchExecute() {}

  private void executeChange(EntityChange change) {
```

### EmptyMethod
Method only calls its super
in `core/src/main/java/google/registry/ui/forms/FormException.java`
#### Snippet
```java
  @Override
  @Detainted
  public String getMessage() {
    return super.getMessage();
  }
```

## RuleId[ruleID=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `0` is redundant
in `core/src/main/java/google/registry/rde/RdeFragmenter.java`
#### Snippet
```java
  private final RdeMarshaller marshaller;

  long cacheHits = 0;
  long resourcesNotFound = 0;
  long resourcesFound = 0;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `core/src/main/java/google/registry/rde/RdeFragmenter.java`
#### Snippet
```java

  long cacheHits = 0;
  long resourcesNotFound = 0;
  long resourcesFound = 0;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `core/src/main/java/google/registry/rde/RdeFragmenter.java`
#### Snippet
```java
  long cacheHits = 0;
  long resourcesNotFound = 0;
  long resourcesFound = 0;

  public RdeFragmenter(
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `core/src/main/java/google/registry/rde/LoggingSftpProgressMonitor.java`
#### Snippet
```java
  private final Clock clock;
  private long bytesOfLastLog = 0;
  private int callsSinceLastLog = 0;
  private DateTime timeOfLastLog;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `core/src/main/java/google/registry/rde/LoggingSftpProgressMonitor.java`
#### Snippet
```java

  private final Clock clock;
  private long bytesOfLastLog = 0;
  private int callsSinceLastLog = 0;
  private DateTime timeOfLastLog;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `core/src/main/java/google/registry/rde/RydeEncoder.java`
#### Snippet
```java
  // We use a Closer to handle the stream .close, to make sure it's done correctly.
  private final Closer closer = Closer.create();
  private boolean isClosed = false;

  private RydeEncoder(
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `core/src/main/java/google/registry/rdap/RdapJsonFormatter.java`
#### Snippet
```java
  private static final FluentLogger logger = FluentLogger.forEnclosingClass();

  private DateTime requestTime = null;

  @Inject
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `core/src/main/java/google/registry/model/IdService.java`
#### Snippet
```java

  // TODO(ptkach): remove once the Cloud SQL sequence-based method is live in production
  private static boolean forceUseSelfAllocateId = false;

  public static void setForceUseSelfAllocatedId() {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `core/src/main/java/google/registry/model/OteAccountBuilder.java`
#### Snippet
```java

  private ImmutableList<Registrar> registrars;
  private boolean replaceExisting = false;

  private OteAccountBuilder(String baseRegistrarId) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `core/src/main/java/google/registry/model/domain/GracePeriodBase.java`
#### Snippet
```java
  @Access(AccessType.FIELD)
  @Column(name = "billing_event_id")
  VKey<BillingEvent.OneTime> billingEventOneTime = null;

  /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `core/src/main/java/google/registry/model/domain/GracePeriodBase.java`
#### Snippet
```java
  @Access(AccessType.FIELD)
  @Column(name = "billing_recurrence_id")
  VKey<BillingEvent.Recurring> billingEventRecurring = null;

  public long getGracePeriodId() {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `core/src/main/java/google/registry/model/console/UserRoles.java`
#### Snippet
```java
  /** Whether the user is a global admin, who has access to everything. */
  @Column(nullable = false)
  private boolean isAdmin = false;

  /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `core/src/main/java/google/registry/model/eppoutput/EppResponse.java`
#### Snippet
```java

  /** Indicates if this response is for a login request. */
  @XmlTransient boolean isLoginResponse = false;

  /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `core/src/main/java/google/registry/model/registrar/RegistrarPoc.java`
#### Snippet
```java
   * console. This will be set to false on contact creation and when the user sets a password.
   */
  boolean allowedToSetRegistryLockPassword = false;

  /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `core/src/main/java/google/registry/model/registrar/RegistrarPoc.java`
#### Snippet
```java
   * results as registrar abuse contact info.
   */
  boolean visibleInDomainWhoisAsAbuse = false;

  /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `core/src/main/java/google/registry/model/registrar/RegistrarPoc.java`
#### Snippet
```java
   * contact.
   */
  boolean visibleInWhoisAsTech = false;

  /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `core/src/main/java/google/registry/model/registrar/RegistrarPoc.java`
#### Snippet
```java
   * Whether this contact is publicly visible in WHOIS registrar query results as an Admin contact.
   */
  boolean visibleInWhoisAsAdmin = false;

  /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `core/src/main/java/google/registry/tools/DeleteDomainCommand.java`
#### Snippet
```java
      names = {"--registrar_request"},
      description = "Whether the change was requested by a registrar.")
  private boolean requestedByRegistrar = false;

  @Override
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `core/src/main/java/google/registry/tools/DeleteDomainCommand.java`
#### Snippet
```java
              + " used in exceptional circumstances as it violates the normal expected domain"
              + " lifecycle.")
  private boolean immediately = false;

  @Parameter(
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `core/src/main/java/google/registry/tools/LoginCommand.java`
#### Snippet
```java
              + " runs on a remote host. You will need to forward the local port specified here to"
              + " a remote port that nomulus randomly picks. Follow the instruction when prompted.")
  private int port = 0;

  @Override
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `core/src/main/java/google/registry/tools/RegistryCli.java`
#### Snippet
```java
          "Name of a file containing space-separated SQL access info used when deploying "
              + "Beam pipelines")
  private String sqlAccessInfoFile = null;

  // Do not make this final - compile-time constant inlining may interfere with JCommander.
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `core/src/main/java/google/registry/tools/RegistryCli.java`
#### Snippet
```java
          "Name of a JSON file containing credential information used by the tool. "
              + "If not set, credentials saved by running `nomulus login' will be used.")
  private String credentialJson = null;

  @Parameter(
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `core/src/main/java/google/registry/tools/GenerateEscrowDepositCommand.java`
#### Snippet
```java
          "Whether to run RDE in LENIENT mode, which omits validation of the generated "
              + "XML deposit files.")
  private boolean lenient = false;

  @Parameter(
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `core/src/main/java/google/registry/model/registrar/Registrar.java`
#### Snippet
```java

  /** Whether or not registry lock is allowed for this registrar. */
  boolean registryLockAllowed = false;

  public String getRegistrarId() {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `core/src/main/java/google/registry/tools/EncryptEscrowDepositCommand.java`
#### Snippet
```java
      names = {"-r", "--revision"},
      description = "Specify the revision.")
  private int revision = 0;

  @Inject EscrowDepositEncryptor encryptor;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `core/src/main/java/google/registry/tools/UpdateDomainCommand.java`
#### Snippet
```java
        "removes all DS records. Is implied true if --ds_records is set."
  )
  boolean clearDsRecords = false;

  @Nullable
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `core/src/main/java/google/registry/tools/GetSqlCredentialCommand.java`
#### Snippet
```java
      description = "Name of output file for key data.",
      validateWith = PathParameter.OutputFile.class)
  private Path outputPath = null;

  @Inject
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `core/src/main/java/google/registry/tools/UpdateKeyringSecretCommand.java`
#### Snippet
```java
    validateWith = PathParameter.InputFile.class
  )
  private Path inputPath = null;

  @Override
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `core/src/main/java/google/registry/tools/SaveSqlCredentialCommand.java`
#### Snippet
```java
              + "password in console.",
      validateWith = PathParameter.InputFile.class)
  private Path inputPath = null;

  @Inject
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `core/src/main/java/google/registry/tools/GetKeyringSecretCommand.java`
#### Snippet
```java
    validateWith = PathParameter.OutputFile.class
  )
  private Path outputPath = null;

  @Override
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `core/src/main/java/google/registry/tools/ListObjectsCommand.java`
#### Snippet
```java
      names = {"--full_field_names"},
      description = "Whether to print full field names in header row (as opposed to aliases)")
  private boolean fullFieldNames = false;

  private AppEngineConnection connection;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `core/src/main/java/google/registry/tools/DeleteHostCommand.java`
#### Snippet
```java
      description = "Whether the change was requested by a registrar.",
      arity = 1)
  private boolean requestedByRegistrar = false;

  @Override
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `core/src/main/java/google/registry/tools/ShellCommand.java`
#### Snippet
```java
              + "'FAILURE <exception-name> <error-message>' at the end of the output for a "
              + "command, allowing the output to be easily parsed by wrapper scripts.")
  boolean encapsulateOutput = false;

  public ShellCommand(CommandRunner runner) throws IOException {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `core/src/main/java/google/registry/tools/ShellCommand.java`
#### Snippet
```java
          "Prevents the shell from exiting on PROD after the 1 hour idle delay. "
              + "Will instead warn you and require re-running the command.")
  boolean dontExitOnIdle = false;

  @Parameter(
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `core/src/main/java/google/registry/tools/ListCursorsCommand.java`
#### Snippet
```java
      names = "--escrow_enabled",
      description = "Filter TLDs to only include those with RDE escrow enabled; defaults to false.")
  private boolean filterEscrowEnabled = false;

  private static final String OUTPUT_FMT = "%-20s   %-24s   %-24s";
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `core/src/main/java/google/registry/tools/SetupOteCommand.java`
#### Snippet
```java
      names = {"--overwrite"},
      description = "Whether to replace existing entities if we encounter any, instead of failing.")
  private boolean overwrite = false;

  @Inject
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `core/src/main/java/google/registry/tools/EppToolCommand.java`
#### Snippet
```java
      names = {"-u", "--superuser"},
      description = "Run in superuser mode")
  boolean superuser = false;

  private SoyFileInfo soyFileInfo;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `core/src/main/java/google/registry/whois/WhoisMetrics.java`
#### Snippet
```java
    public abstract static class Builder {

      boolean wasBuilt = false;

      /** Builder-only clock to support automatic recording of endTimestamp on {@link #build()}. */
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `core/src/main/java/google/registry/whois/WhoisMetrics.java`
#### Snippet
```java

      /** Builder-only clock to support automatic recording of endTimestamp on {@link #build()}. */
      private Clock clock = null;

      public Builder setCommand(WhoisCommand command) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `core/src/main/java/google/registry/request/auth/AuthenticatedRegistrarAccessor.java`
#### Snippet
```java
   * this flag that reduces permissions.
   */
  @VisibleForTesting public static boolean bypassAdminCheck = false;

  @Inject
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `core/src/main/java/google/registry/bigquery/BigqueryConnection.java`
#### Snippet
```java

  /** Whether to automatically overwrite existing tables and views. */
  private boolean overwrite = false;

  /** Duration to wait between polls for job status. */
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `core/src/main/java/google/registry/monitoring/whitebox/EppMetric.java`
#### Snippet
```java

    /** Builder-only clock to support automatic recording of endTimestamp on {@link #build()}. */
    private Clock clock = null;

    abstract Builder setStartTimestamp(DateTime startTimestamp);
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `core/src/nonprod/java/google/registry/tools/GenerateSqlSchemaCommand.java`
#### Snippet
```java
      names = {"-s", "--start_postgresql"},
      description = "If specified, start PostgreSQL in a Docker container.")
  boolean startPostgresql = false;

  @Parameter(
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `core/src/nonprod/java/google/registry/tools/GenerateSqlSchemaCommand.java`
#### Snippet
```java
  public static final int POSTGRESQL_PORT = 5432;

  private PostgreSQLContainer<?> postgresContainer = null;

  @Parameter(
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `docs/src/main/java/google/registry/documentation/FlowDocumentationTool.java`
#### Snippet
```java
      description = "print this help",
      help = true)
  private boolean displayHelp = false;

  /** Parses command line flags and then runs the documentation tool. */
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `core/src/nonprod/java/google/registry/tools/PostgresqlCommand.java`
#### Snippet
```java
      names = {"-s", "--start_postgresql"},
      description = "If specified, start PostgreSQL in a Docker container.")
  boolean startPostgresql = false;

  @Parameter(
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `core/src/nonprod/java/google/registry/tools/PostgresqlCommand.java`
#### Snippet
```java
  @VisibleForTesting public static final int POSTGRESQL_PORT = 5432;

  protected PostgreSQLContainer<?> postgresContainer = null;

  @Parameter(
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `core/src/main/java/google/registry/persistence/transaction/JpaTransactionManagerImpl.java`
#### Snippet
```java
  private static class TransactionInfo {
    EntityManager entityManager;
    boolean inTransaction = false;
    DateTime transactionTime;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `util/src/main/java/google/registry/util/PosixTarHeader.java`
#### Snippet
```java

    private final byte[] header = new byte[HEADER_LENGTH];
    private boolean hasName = false;
    private boolean hasSize = false;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `util/src/main/java/google/registry/util/PosixTarHeader.java`
#### Snippet
```java
    private final byte[] header = new byte[HEADER_LENGTH];
    private boolean hasName = false;
    private boolean hasSize = false;

    public Builder() {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `proxy/src/main/java/google/registry/proxy/handler/ProxyProtocolHandler.java`
#### Snippet
```java

  private boolean finished = false;
  private String proxyHeader = null;

  @Inject
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `proxy/src/main/java/google/registry/proxy/handler/ProxyProtocolHandler.java`
#### Snippet
```java
  private static final byte[] HEADER_PREFIX = "PROXY".getBytes(US_ASCII);

  private boolean finished = false;
  private String proxyHeader = null;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `prober/src/main/java/google/registry/monitoring/blackbox/ProbingSequence.java`
#### Snippet
```java
   * {@link Builder}.
   */
  private boolean lastStep = false;

  /** {@link ProbingSequence} object that represents first step in the sequence. */
```

## RuleId[ruleID=GroovyUnusedAssignment]
### GroovyUnusedAssignment
Assignment is not used
in `build.gradle`
#### Snippet
```java
// the root project.

def environments = ['production', 'sandbox', 'alpha', 'crash', 'qa']

def gcpProject = null
```

## RuleId[ruleID=RedundantImplements]
### RedundantImplements
Redundant interface declaration `ResourceCreateOrChange`
in `core/src/main/java/google/registry/model/host/HostCommand.java`
#### Snippet
```java
  @XmlRootElement
  public static class Create extends HostCreateOrChange
      implements ResourceCreateOrChange<Host.Builder> {
    /** IP Addresses for this host. Can be null if this is an external host. */
    @XmlElement(name = "addr")
```

### RedundantImplements
Redundant interface declaration `ResourceCreateOrChange`
in `core/src/main/java/google/registry/model/contact/ContactCommand.java`
#### Snippet
```java
  @XmlRootElement
  public static class Create extends ContactCreateOrChange
      implements SingleResourceCommand, ResourceCreateOrChange<Contact.Builder> {
    /**
     * Unique identifier for this contact.
```

### RedundantImplements
Redundant interface declaration `CommandWithRemoteApi`
in `core/src/main/java/google/registry/tools/CreateDomainCommand.java`
#### Snippet
```java
@Parameters(separators = " =", commandDescription = "Create a new domain via EPP.")
final class CreateDomainCommand extends CreateOrUpdateDomainCommand
    implements CommandWithRemoteApi {

  @Parameter(
```

### RedundantImplements
Redundant interface declaration `CommandWithRemoteApi`
in `core/src/main/java/google/registry/tools/CreateRegistrarCommand.java`
#### Snippet
```java
@Parameters(separators = " =", commandDescription = "Create new registrar account(s)")
final class CreateRegistrarCommand extends CreateOrUpdateRegistrarCommand
    implements CommandWithConnection, CommandWithRemoteApi {

  private static final ImmutableSet<RegistryToolEnvironment> ENVIRONMENTS_ALLOWING_GROUP_CREATION =
```

## RuleId[ruleID=ExceptionNameDoesntEndWithException]
### ExceptionNameDoesntEndWithException
Exception class name `DomainClaimsCheckNotAllowedWithAllocationTokens` does not end with 'Exception'
in `core/src/main/java/google/registry/flows/domain/DomainClaimsCheckFlow.java`
#### Snippet
```java

  /** Claims checks are not allowed with allocation tokens. */
  static class DomainClaimsCheckNotAllowedWithAllocationTokens extends CommandUseErrorException {
    public DomainClaimsCheckNotAllowedWithAllocationTokens() {
      super("Claims checks are not allowed with allocation tokens");
```

## RuleId[ruleID=InstanceofCatchParameter]
### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `core/src/main/java/google/registry/ui/server/registrar/RegistrarSettingsAction.java`
#### Snippet
```java
          "Failed to perform operation '%s' on registrar '%s' for args %s", op, registrarId, args);
      status = "ERROR: " + e.getClass().getSimpleName();
      if (e instanceof FormFieldException) {
        FormFieldException formFieldException = (FormFieldException) e;
        return JsonResponseHelper.createFormFieldError(
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `core/src/main/java/google/registry/tmch/TmchCertificateAuthority.java`
#### Snippet
```java
      return root;
    } catch (Exception e) {
      if (e instanceof GeneralSecurityException) {
        throw (GeneralSecurityException) e;
      } else if (e instanceof RuntimeException) {
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `core/src/main/java/google/registry/tmch/TmchCertificateAuthority.java`
#### Snippet
```java
      if (e instanceof GeneralSecurityException) {
        throw (GeneralSecurityException) e;
      } else if (e instanceof RuntimeException) {
        throw (RuntimeException) e;
      }
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `core/src/main/java/google/registry/tmch/TmchCertificateAuthority.java`
#### Snippet
```java
      if (e.getCause() instanceof GeneralSecurityException) {
        throw (GeneralSecurityException) e.getCause();
      } else if (e instanceof RuntimeException) {
        throw (RuntimeException) e;
      }
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `core/src/main/java/google/registry/flows/EppController.java`
#### Snippet
```java
      // these failures are innocuous or due to client error, so there's nothing we have to change.
      logger.atInfo().withCause(e).log("Flow returned failure response.");
      EppException eppEx = (EppException) (e instanceof EppException ? e : e.getCause());
      return getErrorResponse(eppEx.getResult(), flowComponent.trid());
    } catch (Throwable e) {
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `core/src/main/java/google/registry/model/ofy/Ofy.java`
#### Snippet
```java
        // TimestampInversionExceptions are thrown by our code and are always retryable as well.
        // However, Datastore exceptions might get thrown even if the transaction succeeded.
        if ((e instanceof DatastoreTimeoutException || e instanceof DatastoreFailureException)
            && work.hasRun()) {
          return work.getResult();
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `core/src/main/java/google/registry/model/ofy/Ofy.java`
#### Snippet
```java
        // TimestampInversionExceptions are thrown by our code and are always retryable as well.
        // However, Datastore exceptions might get thrown even if the transaction succeeded.
        if ((e instanceof DatastoreTimeoutException || e instanceof DatastoreFailureException)
            && work.hasRun()) {
          return work.getResult();
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `docs/src/main/java/google/registry/documentation/FlowDocumentation.java`
#### Snippet
```java
          String.format(
              "expected one @link tag in tag text but found %s: %s",
              (e instanceof NoSuchElementException ? "none" : "multiple"), tagTree.toString()),
          typeElement,
          tagTree,
```

## RuleId[ruleID=NonStaticFinalLogger]
### NonStaticFinalLogger
Non-constant logger field `logger`
in `util/src/main/java/google/registry/util/JdkLoggerConfig.java`
#### Snippet
```java

  /** Delegate logger. */
  private final Logger logger;

  /**
```

## RuleId[ruleID=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `core/src/main/java/google/registry/tools/LoadTestCommand.java`
#### Snippet
```java

    return connection.sendPostRequest(
        LoadTestAction.PATH, params, MediaType.PLAIN_TEXT_UTF_8, new byte[0]);
  }
}
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `core/src/main/java/google/registry/tools/ListObjectsCommand.java`
#### Snippet
```java
    String response =
        connection.sendPostRequest(
            getCommandPath(), params.build(), MediaType.PLAIN_TEXT_UTF_8, new byte[0]);
    // Parse the returned JSON and make sure it's a map.
    Object obj = JSONValue.parse(response.substring(JSON_SAFETY_PREFIX.length()));
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `core/src/main/java/google/registry/tools/ShellCommand.java`
#### Snippet
```java
    }

    return resultBuilder.build().toArray(new String[0]);
  }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `core/src/main/java/google/registry/tools/CreateRegistrarGroupsCommand.java`
#### Snippet
```java
          ImmutableMap.of(CreateGroupsAction.CLIENT_ID_PARAM, registrar.getRegistrarId()),
          MediaType.PLAIN_TEXT_UTF_8,
          new byte[0]);
    }
    // Note: If any of the calls fail, then a 5XX response code is returned inside of send(), which
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `core/src/main/java/google/registry/tools/CreateRegistrarGroupsCommand.java`
#### Snippet
```java
        ImmutableMap.of(CreateGroupsAction.CLIENT_ID_PARAM, clientId),
        MediaType.PLAIN_TEXT_UTF_8,
        new byte[0]);
  }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `core/src/main/java/google/registry/keyring/api/KeySerializer.java`
#### Snippet
```java
    // There shouldn't be a passphrase on the key
    return new BcPBESecretKeyDecryptorBuilder(new BcPGPDigestCalculatorProvider())
        .build(new char[0]);
  }
}
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `core/src/main/java/google/registry/keyring/api/PgpHelper.java`
#### Snippet
```java
      privateKey = secret.extractPrivateKey(
          new BcPBESecretKeyDecryptorBuilder(new BcPGPDigestCalculatorProvider())
              .build(new char[0]));
    } catch (PGPException e) {
      throw new VerifyException(String.format("Could not load PGP private key for: %s", query), e);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `core/src/main/java/google/registry/request/auth/OAuthAuthenticationMechanism.java`
#### Snippet
```java
    ImmutableSet<String> authorizedScopes;
    try {
      String[] availableOauthScopeArray = availableOauthScopes.toArray(new String[0]);
      currentUser = oauthService.getCurrentUser(availableOauthScopeArray);
      isUserAdmin = oauthService.isUserAdmin(availableOauthScopeArray);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `core/src/main/java/google/registry/persistence/converter/JodaMoneyType.java`
#### Snippet
```java
  @Override
  public String[] getPropertyNames() {
    return JPA_PROPERTY_NAMES.toArray(new String[0]);
  }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `core/src/main/java/google/registry/persistence/converter/JodaMoneyType.java`
#### Snippet
```java
  @Override
  public Type[] getPropertyTypes() {
    return PROPERTY_TYPES.toArray(new Type[0]);
  }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `core/src/main/java/google/registry/persistence/transaction/CriteriaQueryBuilder.java`
#### Snippet
```java
  /** Builds and returns the query, applying all WHERE and ORDER BY clauses at once. */
  public CriteriaQuery<T> build() {
    Predicate[] predicateArray = predicates.build().toArray(new Predicate[0]);
    return query.where(predicateArray).orderBy(orders.build());
  }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `util/src/main/java/google/registry/util/UrlConnectionException.java`
#### Snippet
```java
      responseCode = connection.getResponseCode();
    } catch (IOException e) {
      resultContent = new byte[] {};
      responseCode = 0;
    }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `networking/src/main/java/google/registry/networking/handler/SslServerInitializer.java`
#### Snippet
```java
        SslContextBuilder.forServer(
                privateKeySupplier.get(),
                certificatesSupplier.get().toArray(new X509Certificate[0]))
            .sslProvider(sslProvider)
            .trustManager(InsecureTrustManagerFactory.INSTANCE)
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `networking/src/main/java/google/registry/networking/handler/SslClientInitializer.java`
#### Snippet
```java
                trustedCertificates == null || trustedCertificates.isEmpty()
                    ? null
                    : trustedCertificates.toArray(new X509Certificate[0]));

    if (privateKeySupplier != null && certificateChainSupplier != null) {
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `networking/src/main/java/google/registry/networking/handler/SslClientInitializer.java`
#### Snippet
```java
    if (privateKeySupplier != null && certificateChainSupplier != null) {
      sslContextBuilder.keyManager(
          privateKeySupplier.get(), certificateChainSupplier.get().toArray(new X509Certificate[0]));
    }

```

## RuleId[ruleID=SynchronizeOnThis]
### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `core/src/main/java/google/registry/tmch/TmchCertificateAuthority.java`
#### Snippet
```java
   */
  public void verify(X509Certificate cert) throws GeneralSecurityException {
    synchronized (TmchCertificateAuthority.class) {
      X509Utils.verifyCertificate(getAndValidateRoot(), getCrl(), cert, clock.nowUtc().toDate());
    }
```

## RuleId[ruleID=NonFinalFieldOfException]
### NonFinalFieldOfException
Non-final field `lazyFieldName` of exception class
in `core/src/main/java/google/registry/ui/forms/FormFieldException.java`
#### Snippet
```java

  @Nullable
  private String lazyFieldName;

  /**
```

### NonFinalFieldOfException
Non-final field `exception` of exception class
in `core/src/main/java/google/registry/flows/TlsCredentials.java`
#### Snippet
```java
  public static class CertificateContainsSecurityViolationsException
      extends AuthenticationErrorException {
    InsecureCertificateException exception;

    CertificateContainsSecurityViolationsException(InsecureCertificateException exception) {
```

### NonFinalFieldOfException
Non-final field `violations` of exception class
in `core/src/main/java/google/registry/flows/certs/CertificateChecker.java`
#### Snippet
```java
  /** Exception to throw when a certificate has security violations. */
  public static class InsecureCertificateException extends Exception {
    ImmutableSet<CertificateViolation> violations;

    InsecureCertificateException(ImmutableSet<CertificateViolation> violations, String message) {
```

## RuleId[ruleID=UnstableTypeUsedInSignature]
### UnstableTypeUsedInSignature
Method must be marked with '@com.google.common.annotations.Beta' annotation because its signature references unstable type 'com.google.common.hash.BloomFilter'
in `core/src/main/java/google/registry/model/tld/label/PremiumList.java`
#### Snippet
```java
   * and no DB load is required.
   */
  public BloomFilter<String> getBloomFilter() {
    return bloomFilter;
  }
```

### UnstableTypeUsedInSignature
Field must be marked with '@com.google.common.annotations.Beta' annotation because its type references unstable type 'com.google.common.hash.BloomFilter'
in `core/src/main/java/google/registry/model/tld/label/PremiumList.java`
#### Snippet
```java

  @Column(nullable = false)
  BloomFilter<String> bloomFilter;

  /** Returns the {@link CurrencyUnit} used for this list. */
```

### UnstableTypeUsedInSignature
Method must be marked with '@com.google.common.annotations.Beta' annotation because its signature references unstable type 'com.google.common.hash.BloomFilter'
in `core/src/main/java/google/registry/persistence/converter/BloomFilterConverter.java`
#### Snippet
```java
  @Override
  @Nullable
  public BloomFilter<String> convertToEntityAttribute(@Nullable byte[] columnValue) {
    if (columnValue == null) {
      return null;
```

### UnstableTypeUsedInSignature
Method must be marked with '@com.google.common.annotations.Beta' annotation because its signature references unstable type 'com.google.common.hash.BloomFilter'
in `core/src/main/java/google/registry/persistence/converter/BloomFilterConverter.java`
#### Snippet
```java
  @Override
  @Nullable
  public byte[] convertToDatabaseColumn(@Nullable BloomFilter<String> entity) {
    if (entity == null) {
      return null;
```

### UnstableTypeUsedInSignature
Method must be marked with '@com.google.common.annotations.Beta' annotation because its signature references unstable type 'com.google.common.util.concurrent.TimeLimiter'
in `util/src/main/java/google/registry/util/AppEngineTimeLimiter.java`
#### Snippet
```java
  }

  public static TimeLimiter create() {
    return SimpleTimeLimiter.create(new NewRequestThreadExecutorService());
  }
```

## RuleId[ruleID=UnusedAssignment]
### UnusedAssignment
Variable `numOfWipedEntities` initializer `0` is redundant
in `core/src/main/java/google/registry/batch/WipeOutContactHistoryPiiAction.java`
#### Snippet
```java
          "About to wipe out all PII of contact history entities prior to %s.", wipeOutTime);

      int numOfWipedEntities = 0;
      do {
        numOfWipedEntities =
```

### UnusedAssignment
Variable `interval` initializer `null` is redundant
in `core/src/main/java/google/registry/persistence/converter/DurationConverter.java`
#### Snippet
```java
      return null;
    }
    PGInterval interval = null;
    try {
      interval = new PGInterval(dbData.toString());
```

## RuleId[ruleID=ConstantValue]
### ConstantValue
Condition `input != null` is always `true`
in `core/src/main/java/google/registry/ui/server/registrar/OteStatusAction.java`
#### Snippet
```java
  public Map<String, ?> handleJsonRequest(Map<String, ?> input) {
    try {
      checkArgument(input != null, "Malformed JSON");

      String oteClientId = (String) input.get(CLIENT_ID_PARAM);
```

### ConstantValue
Condition `input != null` is always `true`
in `core/src/main/java/google/registry/ui/server/RegistrarFormFields.java`
#### Snippet
```java
  private static CidrAddressBlock parseCidr(String input) {
    try {
      return input != null ? CidrAddressBlock.create(input) : null;
    } catch (IllegalArgumentException e) {
      throw new FormFieldException("Not a valid CIDR notation IP-address block.", e);
```

### ConstantValue
Condition `input == null` is always `false`
in `core/src/main/java/google/registry/ui/server/registrar/RegistrarSettingsAction.java`
#### Snippet
```java
  @Override
  public Map<String, Object> handleJsonRequest(Map<String, ?> input) {
    if (input == null) {
      throw new BadRequestException("Malformed JSON");
    }
```

### ConstantValue
Condition `!dsRrData.isEmpty()` is always `true`
in `core/src/main/java/google/registry/dns/writer/clouddns/CloudDnsWriter.java`
#### Snippet
```java
      }

      if (!dsRrData.isEmpty()) {
        domainRecords.add(
            new ResourceRecordSet()
```

### ConstantValue
Result of `dsRrData.isEmpty()` is always 'false'
in `core/src/main/java/google/registry/dns/writer/clouddns/CloudDnsWriter.java`
#### Snippet
```java
      }

      if (!dsRrData.isEmpty()) {
        domainRecords.add(
            new ResourceRecordSet()
```

### ConstantValue
Condition `!nsRrData.isEmpty()` is always `true`
in `core/src/main/java/google/registry/dns/writer/clouddns/CloudDnsWriter.java`
#### Snippet
```java
      }

      if (!nsRrData.isEmpty()) {
        domainRecords.add(
            new ResourceRecordSet()
```

### ConstantValue
Result of `nsRrData.isEmpty()` is always 'false'
in `core/src/main/java/google/registry/dns/writer/clouddns/CloudDnsWriter.java`
#### Snippet
```java
      }

      if (!nsRrData.isEmpty()) {
        domainRecords.add(
            new ResourceRecordSet()
```

### ConstantValue
Condition `e instanceof RuntimeException` is always `true`
in `core/src/main/java/google/registry/tmch/TmchCertificateAuthority.java`
#### Snippet
```java
      if (e instanceof GeneralSecurityException) {
        throw (GeneralSecurityException) e;
      } else if (e instanceof RuntimeException) {
        throw (RuntimeException) e;
      }
```

### ConstantValue
Condition `e instanceof RuntimeException` is always `true`
in `core/src/main/java/google/registry/tmch/TmchCertificateAuthority.java`
#### Snippet
```java
      if (e.getCause() instanceof GeneralSecurityException) {
        throw (GeneralSecurityException) e.getCause();
      } else if (e instanceof RuntimeException) {
        throw (RuntimeException) e;
      }
```

### ConstantValue
Condition `loadedResource == null` is always `false`
in `core/src/main/java/google/registry/model/EppResourceUtils.java`
#### Snippet
```java
            ? resource
            : loadMostRecentRevisionAtTime(resource, timestamp);
    return (loadedResource == null)
        ? null
        : (isActive(loadedResource, timestamp)
```

### ConstantValue
Value `currentPackageToken` is always 'null'
in `core/src/main/java/google/registry/model/domain/DomainBase.java`
#### Snippet
```java
    public B setCurrentPackageToken(@Nullable VKey<AllocationToken> currentPackageToken) {
      if (currentPackageToken == null) {
        getInstance().currentPackageToken = currentPackageToken;
        return thisCastToDerived();
      }
```

### ConstantValue
Condition `valueA == null` is always `false`
in `core/src/main/java/google/registry/tools/UpdateTldCommand.java`
#### Snippet
```java

  private static void checkNotBoth(String nameA, Object valueA, String nameB, Object valueB) {
    checkArgument(valueA == null || valueB == null, "Don't pass both --%s and --%s", nameA, nameB);
  }
}
```

### ConstantValue
Condition `valueA == null || valueB == null` is always `false`
in `core/src/main/java/google/registry/tools/UpdateTldCommand.java`
#### Snippet
```java

  private static void checkNotBoth(String nameA, Object valueA, String nameB, Object valueB) {
    checkArgument(valueA == null || valueB == null, "Don't pass both --%s and --%s", nameA, nameB);
  }
}
```

### ConstantValue
Condition `valueB == null` is always `false` when reached
in `core/src/main/java/google/registry/tools/UpdateTldCommand.java`
#### Snippet
```java

  private static void checkNotBoth(String nameA, Object valueA, String nameB, Object valueB) {
    checkArgument(valueA == null || valueB == null, "Don't pass both --%s and --%s", nameA, nameB);
  }
}
```

### ConstantValue
Condition `fullReplacement != null` is always `true`
in `core/src/main/java/google/registry/tools/UpdateTldCommand.java`
#### Snippet
```java
      List<String> itemsToAdd,
      List<String> itemsToRemove) {
    if (fullReplacement != null) {
      return ImmutableSet.copyOf(fullReplacement);
    }
```

### ConstantValue
Condition `oldEntity != null` is always `true`
in `core/src/main/java/google/registry/tools/MutatingCommand.java`
#### Snippet
```java

    private EntityChange(ImmutableObject oldEntity, ImmutableObject newEntity) {
      type = ChangeType.get(oldEntity != null, newEntity != null);
      checkArgument(
          type != ChangeType.UPDATE || oldEntity.createVKey().equals(newEntity.createVKey()),
```

### ConstantValue
Condition `newEntity != null` is always `true`
in `core/src/main/java/google/registry/tools/MutatingCommand.java`
#### Snippet
```java

    private EntityChange(ImmutableObject oldEntity, ImmutableObject newEntity) {
      type = ChangeType.get(oldEntity != null, newEntity != null);
      checkArgument(
          type != ChangeType.UPDATE || oldEntity.createVKey().equals(newEntity.createVKey()),
```

### ConstantValue
Condition `value == null` is always `false`
in `core/src/main/java/google/registry/tools/params/IntervalParameter.java`
#### Snippet
```java
    // Interval.parse(null) creates an interval with both start and end times set to now.
    // Do something a little more reasonable.
    if (value == null) {
      throw new NullPointerException();
    }
```

### ConstantValue
Condition `registrar == null` is always `false`
in `core/src/main/java/google/registry/tools/server/CreateGroupsAction.java`
#### Snippet
```java
  public void run() {
    final Registrar registrar = initAndLoadRegistrar();
    if (registrar == null) {
      return;
    }
```

### ConstantValue
Condition `good` at the left side of assignment expression is always `true`. Can be simplified
in `core/src/main/java/google/registry/tools/javascrap/CompareEscrowDepositsCommand.java`
#### Snippet
```java
    process(deposit2, domains2, registrars2);
    boolean good = true;
    good &= printUniqueElements(domains1, domains2, "domains", "deposit1");
    good &= printUniqueElements(domains2, domains1, "domains", "deposit2");
    good &= printUniqueElements(registrars1, registrars2, "registrars", "deposit1");
```

### ConstantValue
Condition `a == null` is always `false`
in `core/src/main/java/google/registry/keyring/api/ComparatorKeyring.java`
#### Snippet
```java
  @VisibleForTesting
  static String stringify(PGPKeyPair a) {
    if (a == null) {
      return "null";
    }
```

### ConstantValue
Condition `a == null` is always `false`
in `core/src/main/java/google/registry/keyring/api/ComparatorKeyring.java`
#### Snippet
```java
  @VisibleForTesting
  static boolean compare(PublicKeyPacket a, PublicKeyPacket b) {
    if (a == null || b == null) {
      return a == null && b == null;
    }
```

### ConstantValue
Condition `a == null || b == null` is always `false`
in `core/src/main/java/google/registry/keyring/api/ComparatorKeyring.java`
#### Snippet
```java
  @VisibleForTesting
  static boolean compare(PublicKeyPacket a, PublicKeyPacket b) {
    if (a == null || b == null) {
      return a == null && b == null;
    }
```

### ConstantValue
Condition `b == null` is always `false` when reached
in `core/src/main/java/google/registry/keyring/api/ComparatorKeyring.java`
#### Snippet
```java
  @VisibleForTesting
  static boolean compare(PublicKeyPacket a, PublicKeyPacket b) {
    if (a == null || b == null) {
      return a == null && b == null;
    }
```

### ConstantValue
Condition `a == null` is always `false`
in `core/src/main/java/google/registry/keyring/api/ComparatorKeyring.java`
#### Snippet
```java
  @VisibleForTesting
  static String stringify(PGPPublicKey a) {
    if (a == null) {
      return "null";
    }
```

### ConstantValue
Condition `a == null` is always `false`
in `core/src/main/java/google/registry/keyring/api/ComparatorKeyring.java`
#### Snippet
```java
  @VisibleForTesting
  static String stringify(PGPPrivateKey a) {
    if (a == null) {
      return "null";
    }
```

### ConstantValue
Condition `a == null` is always `false`
in `core/src/main/java/google/registry/keyring/api/ComparatorKeyring.java`
#### Snippet
```java
  @VisibleForTesting
  static boolean compare(BCPGKey a, BCPGKey b) {
    if (a == null || b == null) {
      return a == null && b == null;
    }
```

### ConstantValue
Condition `a == null || b == null` is always `false`
in `core/src/main/java/google/registry/keyring/api/ComparatorKeyring.java`
#### Snippet
```java
  @VisibleForTesting
  static boolean compare(BCPGKey a, BCPGKey b) {
    if (a == null || b == null) {
      return a == null && b == null;
    }
```

### ConstantValue
Condition `b == null` is always `false` when reached
in `core/src/main/java/google/registry/keyring/api/ComparatorKeyring.java`
#### Snippet
```java
  @VisibleForTesting
  static boolean compare(BCPGKey a, BCPGKey b) {
    if (a == null || b == null) {
      return a == null && b == null;
    }
```

### ConstantValue
Condition `authorizedScopes == null` is always `false`
in `core/src/main/java/google/registry/request/auth/OAuthAuthenticationMechanism.java`
#### Snippet
```java
      return AuthResult.create(NONE);
    }
    if ((currentUser == null) || (oauthClientId == null) || (authorizedScopes == null)) {
      return AuthResult.create(NONE);
    }
```

### ConstantValue
Condition `outputFileName == null` is always `false`
in `docs/src/main/java/google/registry/documentation/FlowDocumentationTool.java`
#### Snippet
```java
      System.out.println(output);
    } else {
      if (outputFileName == null) {
        outputFileName = "doclet.md";
      }
```

### ConstantValue
Condition `interfaces == null` is always `false`
in `util/src/main/java/google/registry/util/NetworkUtils.java`
#### Snippet
```java
      try {
        Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
        if (interfaces == null) {
          return localhost;
        }
```

### ConstantValue
Condition `0 <= perGroup` is always `true`
in `util/src/main/java/google/registry/util/HexDumper.java`
#### Snippet
```java
  public HexDumper(@WillNotClose Writer out, @Nonnegative int perLine, @Nonnegative int perGroup) {
    checkArgument(0 < perLine, "0 < perLine <= INT32_MAX");
    checkArgument(0 <= perGroup && perGroup < perLine, "0 <= perGroup < perLine");
    this.upstream = checkNotNull(out, "out");
    this.totalBytes = 0L;
```

### ConstantValue
Condition `path != null` is always `true`
in `util/src/main/java/google/registry/util/CloudTasksUtils.java`
#### Snippet
```java
      String path, HttpMethod method, String service, Multimap<String, String> params) {
    checkArgument(
        path != null && !path.isEmpty() && path.charAt(0) == '/',
        "The path must start with a '/'.");
    checkArgument(
```

## RuleId[ruleID=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `core/src/main/java/google/registry/ui/server/registrar/ConsoleOteSetupAction.java`
#### Snippet
```java
            builder.append(
                String.format("   Registrar %s with access to TLD %s\n", clientId, tld)));
    builder.append(String.format("Gave user %s web access to these Registrars\n", email.get()));
    sendEmailUtils.sendEmail(
        String.format("OT&E for registrar %s created in %s", clientId.get(), environment),
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `core/src/main/java/google/registry/ui/server/registrar/ConsoleOteSetupAction.java`
#### Snippet
```java
    builder.append(String.format("Gave user %s web access to these Registrars\n", email.get()));
    sendEmailUtils.sendEmail(
        String.format("OT&E for registrar %s created in %s", clientId.get(), environment),
        builder.toString());
  }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `core/src/main/java/google/registry/ui/server/registrar/ConsoleOteSetupAction.java`
#### Snippet
```java
    } catch (Throwable e) {
      logger.atWarning().withCause(e).log(
          "Failed to setup OT&E. clientId: %s, email: %s", clientId.get(), email.get());
      data.put("errorMessage", e.getMessage());
      response.setPayload(
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `core/src/main/java/google/registry/ui/server/registrar/ConsoleOteSetupAction.java`
#### Snippet
```java
    } catch (Throwable e) {
      logger.atWarning().withCause(e).log(
          "Failed to setup OT&E. clientId: %s, email: %s", clientId.get(), email.get());
      data.put("errorMessage", e.getMessage());
      response.setPayload(
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `core/src/main/java/google/registry/ui/server/registrar/RegistryLockVerifyAction.java`
#### Snippet
```java
  public void runAfterLogin(HashMap<String, Object> data) {
    try {
      boolean isAdmin = authResult.userAuthInfo().get().isUserAdmin();
      final RegistryLock resultLock;
      if (isLock) {
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `core/src/main/java/google/registry/ui/server/registrar/RegistryLockPostAction.java`
#### Snippet
```java
      return verifyPasswordAndGetEmailLegacyUser(userAuthInfo.appEngineUser().get(), postInput);
    } else {
      return verifyPasswordAndGetEmailConsoleUser(userAuthInfo.consoleUser().get(), postInput);
    }
  }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `core/src/main/java/google/registry/ui/server/registrar/RegistryLockGetAction.java`
#### Snippet
```java
              : contactOptional.flatMap(RegistrarPoc::getRegistryLockEmailAddress).orElse("");
    } else {
      google.registry.model.console.User user = userAuthInfo.consoleUser().get();
      isRegistryLockAllowed =
          user.getUserRoles().hasPermission(registrarId, ConsolePermission.REGISTRY_LOCK);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `core/src/main/java/google/registry/ui/server/RegistrarFormFields.java`
#### Snippet
```java
    }
    RegistrarAddress.Builder builder = new RegistrarAddress.Builder();
    String countryCode = COUNTRY_CODE_FIELD.extractUntyped(args).get();
    builder.setCountryCode(countryCode);
    streetField
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `core/src/main/java/google/registry/ui/server/registrar/ConsoleRegistrarCreatorAction.java`
#### Snippet
```java
            + toEmailLine(referralEmail, "referralEmail")
            + toEmailLine(driveId, "driveId")
            + String.format("Gave user %s web access to the registrar\n", consoleUserEmail.get());
    sendEmailUtils.sendEmail(
        String.format("Registrar %s created in %s", clientId.get(), environment), body);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `core/src/main/java/google/registry/ui/server/registrar/ConsoleRegistrarCreatorAction.java`
#### Snippet
```java
            + String.format("Gave user %s web access to the registrar\n", consoleUserEmail.get());
    sendEmailUtils.sendEmail(
        String.format("Registrar %s created in %s", clientId.get(), environment), body);
  }
}
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `core/src/main/java/google/registry/ui/server/registrar/ConsoleRegistrarCreatorAction.java`
#### Snippet
```java
      checkPresent(countryCode, "countryCode");

      data.put("clientId", clientId.get());
      data.put("name", name.get());
      data.put("ianaId", ianaId.get());
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `core/src/main/java/google/registry/ui/server/registrar/ConsoleRegistrarCreatorAction.java`
#### Snippet
```java

      data.put("clientId", clientId.get());
      data.put("name", name.get());
      data.put("ianaId", ianaId.get());
      data.put("referralEmail", referralEmail.get());
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `core/src/main/java/google/registry/ui/server/registrar/ConsoleRegistrarCreatorAction.java`
#### Snippet
```java
      data.put("clientId", clientId.get());
      data.put("name", name.get());
      data.put("ianaId", ianaId.get());
      data.put("referralEmail", referralEmail.get());
      data.put("billingAccount", billingAccount.get());
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `core/src/main/java/google/registry/ui/server/registrar/ConsoleRegistrarCreatorAction.java`
#### Snippet
```java
      data.put("name", name.get());
      data.put("ianaId", ianaId.get());
      data.put("referralEmail", referralEmail.get());
      data.put("billingAccount", billingAccount.get());
      data.put("driveId", driveId.get());
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `core/src/main/java/google/registry/ui/server/registrar/ConsoleRegistrarCreatorAction.java`
#### Snippet
```java
      data.put("ianaId", ianaId.get());
      data.put("referralEmail", referralEmail.get());
      data.put("billingAccount", billingAccount.get());
      data.put("driveId", driveId.get());
      data.put("consoleUserEmail", consoleUserEmail.get());
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `core/src/main/java/google/registry/ui/server/registrar/ConsoleRegistrarCreatorAction.java`
#### Snippet
```java
      data.put("referralEmail", referralEmail.get());
      data.put("billingAccount", billingAccount.get());
      data.put("driveId", driveId.get());
      data.put("consoleUserEmail", consoleUserEmail.get());

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `core/src/main/java/google/registry/ui/server/registrar/ConsoleRegistrarCreatorAction.java`
#### Snippet
```java
      data.put("billingAccount", billingAccount.get());
      data.put("driveId", driveId.get());
      data.put("consoleUserEmail", consoleUserEmail.get());

      data.put("street1", street1.get());
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `core/src/main/java/google/registry/ui/server/registrar/ConsoleRegistrarCreatorAction.java`
#### Snippet
```java
      data.put("consoleUserEmail", consoleUserEmail.get());

      data.put("street1", street1.get());
      optionalStreet2.ifPresent(street2 -> data.put("street2", street2));
      optionalStreet3.ifPresent(street3 -> data.put("street3", street3));
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `core/src/main/java/google/registry/ui/server/registrar/ConsoleRegistrarCreatorAction.java`
#### Snippet
```java
      optionalStreet2.ifPresent(street2 -> data.put("street2", street2));
      optionalStreet3.ifPresent(street3 -> data.put("street3", street3));
      data.put("city", city.get());
      optionalState.ifPresent(state -> data.put("state", state));
      optionalZip.ifPresent(zip -> data.put("zip", zip));
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `core/src/main/java/google/registry/ui/server/registrar/ConsoleRegistrarCreatorAction.java`
#### Snippet
```java
      optionalState.ifPresent(state -> data.put("state", state));
      optionalZip.ifPresent(zip -> data.put("zip", zip));
      data.put("countryCode", countryCode.get());

      String gaeUserId =
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `core/src/main/java/google/registry/ui/server/registrar/ConsoleRegistrarCreatorAction.java`
#### Snippet
```java
    } catch (Throwable e) {
      logger.atWarning().withCause(e).log(
          "Failed to create registrar. clientId: %s, data: %s", clientId.get(), data);
      data.put("errorMessage", e.getMessage());
      response.setPayload(
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `core/src/main/java/google/registry/ui/server/registrar/RegistrarSettingsAction.java`
#### Snippet
```java
    // had out of date data.
    DateTime latest = registrar.getLastUpdateTime();
    DateTime latestFromArgs = RegistrarFormFields.LAST_UPDATE_TIME.extractUntyped(args).get();
    if (!latestFromArgs.equals(latest)) {
      logger.atWarning().log(
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `core/src/main/java/google/registry/dns/ReadDnsQueueAction.java`
#### Snippet
```java
    for (List<RefreshItem> chunk : Iterables.partition(items, tldUpdateBatchSize)) {
      DateTime earliestCreateTime =
          chunk.stream().map(RefreshItem::creationTime).min(Comparator.naturalOrder()).get();
      for (String dnsWriter : Registry.get(tld).getDnsWriters()) {
        Task task =
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `core/src/main/java/google/registry/rdap/RdapDomainSearchAction.java`
#### Snippet
```java
            Domain.class, partialStringQuery.getInitialString(), getRequestTime());
    return makeSearchResults(
        shouldBeVisible(domain) ? ImmutableList.of(domain.get()) : ImmutableList.of());
  }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `core/src/main/java/google/registry/rdap/RdapDomainSearchAction.java`
#### Snippet
```java
      metricInformationBuilder.setSearchType(SearchType.BY_NAMESERVER_ADDRESS);
      metricInformationBuilder.setWildcardType(WildcardType.NO_WILDCARD);
      metricInformationBuilder.setPrefixLength(nsIpParam.get().length());
      // syntax: /rdap/domains?nsIp=1.2.3.4
      InetAddress inetAddress;
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `core/src/main/java/google/registry/rdap/RdapDomainSearchAction.java`
#### Snippet
```java
    }
    if (rdapResultSetMaxSize < domains.size()) {
      builder.setNextPageUri(createNavigationUri(newCursor.get()));
      builder.setIncompletenessWarningType(IncompletenessWarningType.TRUNCATED);
    }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `core/src/main/java/google/registry/rdap/RdapNameserverSearchAction.java`
#### Snippet
```java
      builder
          .nameserverSearchResultsBuilder()
          .add(rdapJsonFormatter.createRdapNameserver(host.get(), OutputDataType.FULL));
    }
    return builder.build();
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `core/src/main/java/google/registry/rdap/RdapNameserverSearchAction.java`
#### Snippet
```java
      InetAddress inetAddress;
      try {
        inetAddress = InetAddresses.forString(ipParam.get());
      } catch (IllegalArgumentException e) {
        throw new BadRequestException("Invalid value of ip parameter");
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `core/src/main/java/google/registry/rdap/RdapNameserverSearchAction.java`
#### Snippet
```java
    }
    if (rdapResultSetMaxSize < hosts.size()) {
      builder.setNextPageUri(createNavigationUri(newCursor.get()));
      builder.setIncompletenessWarningType(IncompletenessWarningType.TRUNCATED);
    }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `core/src/main/java/google/registry/rdap/RdapNameserverSearchAction.java`
#### Snippet
```java
        Optional<Host> host = loadByForeignKeyCached(Host.class, fqhn, getRequestTime());
        if (shouldBeVisible(host)) {
          hostList.add(host.get());
          if (hostList.size() > rdapResultSetMaxSize) {
            break;
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `core/src/main/java/google/registry/rdap/RdapEntitySearchAction.java`
#### Snippet
```java
    }
    if (rdapResultSetMaxSize < contacts.size() + registrars.size()) {
      builder.setNextPageUri(createNavigationUri(newCursor.get()));
      builder.setIncompletenessWarningType(IncompletenessWarningType.TRUNCATED);
      return builder.build();
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `core/src/main/java/google/registry/rdap/RdapEntitySearchAction.java`
#### Snippet
```java
                      partialStringQuery.matches(registrar.getRegistrarName())
                          && ((cursorType != CursorType.REGISTRAR)
                              || (registrar.getRegistrarName().compareTo(cursorQueryString.get())
                                  > 0))
                          && shouldBeVisible(registrar))
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `core/src/main/java/google/registry/rdap/RdapEntitySearchAction.java`
#### Snippet
```java
      results =
          searchByHandle(
              recordWildcardType(RdapSearchPattern.createFromUnicodeString(handleParam.get())),
              cursorType,
              cursorQueryString,
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `core/src/main/java/google/registry/rdap/RdapEntitySearchAction.java`
#### Snippet
```java
                    registrar ->
                        ((cursorType != CursorType.REGISTRAR)
                                || (registrar.getRegistrarName().compareTo(cursorQueryString.get())
                                    > 0))
                            && shouldBeVisible(registrar))
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `core/src/main/java/google/registry/flows/TlsCredentials.java`
#### Snippet
```java
      String passedCert =
          clientCertificateHash.equals(registrar.getClientCertificateHash())
              ? registrar.getClientCertificate().get()
              : registrar.getFailoverClientCertificate().get();
      try {
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `core/src/main/java/google/registry/flows/TlsCredentials.java`
#### Snippet
```java
          clientCertificateHash.equals(registrar.getClientCertificateHash())
              ? registrar.getClientCertificate().get()
              : registrar.getFailoverClientCertificate().get();
      try {
        certificateChecker.validateCertificate(passedCert);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `core/src/main/java/google/registry/flows/domain/DomainTransferRequestFlow.java`
#### Snippet
```java
    if (!isSuperuser) {
      verifyAuthInfoPresentForResourceTransfer(authInfo);
      verifyAuthInfo(authInfo.get(), existingDomain);
    }
    // Verify that the resource does not already have a pending transfer.
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `core/src/main/java/google/registry/flows/domain/DomainPricingLogic.java`
#### Snippet
```java
              "Unexpected behavior: renewal price cannot be null when renewal behavior is"
                  + " SPECIFIED");
          renewCost = recurringBillingEvent.getRenewalPrice().get().multipliedBy(years);
          isRenewCostPremiumPrice = false;
          break;
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `core/src/main/java/google/registry/flows/contact/ContactTransferRequestFlow.java`
#### Snippet
```java
    Contact existingContact = loadAndVerifyExistence(Contact.class, targetId, now);
    verifyAuthInfoPresentForResourceTransfer(authInfo);
    verifyAuthInfo(authInfo.get(), existingContact);
    // Verify that the resource does not already have a pending transfer.
    if (TransferStatus.PENDING.equals(existingContact.getTransferData().getTransferStatus())) {
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `core/src/main/java/google/registry/model/ForeignKeyUtils.java`
#### Snippet
```java
            toImmutableMap(
                e -> (String) e.getKey().getKey(),
                e -> VKey.create(clazz, e.getValue().get().repoId())));
  }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `core/src/main/java/google/registry/flows/domain/DomainFlowUtils.java`
#### Snippet
```java
  static void verifyRegistrarIsActive(String registrarId)
      throws RegistrarMustBeActiveForThisOperationException {
    Registrar registrar = Registrar.loadByRegistrarIdCached(registrarId).get();
    if (registrar.getState() != State.ACTIVE) {
      throw new RegistrarMustBeActiveForThisOperationException();
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `core/src/main/java/google/registry/flows/domain/DomainFlowUtils.java`
#### Snippet
```java
      String domainName, DateTime priceTime, String registrarId) throws EppException {
    if (isDomainPremium(domainName, priceTime)) {
      if (Registrar.loadByRegistrarIdCached(registrarId).get().getBlockPremiumNames()) {
        throw new PremiumNameBlockedException();
      }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `core/src/main/java/google/registry/flows/domain/DomainFlowUtils.java`
#### Snippet
```java
    }
    if (!Registrar.loadByRegistrarIdCached(registrarId)
        .get()
        .getBillingAccountMap()
        .containsKey(registry.getCurrency())) {
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `core/src/main/java/google/registry/flows/domain/DomainFlowUtils.java`
#### Snippet
```java
  /** Check if the registrar running the flow has access to the TLD in question. */
  public static void checkAllowedAccessToTld(String registrarId, String tld) throws EppException {
    if (!Registrar.loadByRegistrarIdCached(registrarId).get().getAllowedTlds().contains(tld)) {
      throw new DomainFlowUtils.NotAuthorizedForTldException(tld);
    }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `core/src/main/java/google/registry/tools/CreateOrUpdateTldCommand.java`
#### Snippet
```java
        }
        builder.setTldStateTransitions(
            newTldStateTransitions.put(getTldStateTransitionToAdd().get()).build());
      }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `core/src/main/java/google/registry/tools/RenewDomainCommand.java`
#### Snippet
```java
      checkArgumentPresent(domainOptional, "Domain '%s' does not exist or is deleted", domainName);
      setSoyTemplate(DomainRenewSoyInfo.getInstance(), DomainRenewSoyInfo.RENEWDOMAIN);
      Domain domain = domainOptional.get();

      SoyMapData soyMapData =
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `core/src/main/java/google/registry/tools/UniformRapidSuspensionCommand.java`
#### Snippet
```java
    Optional<Domain> domainOpt = loadByForeignKey(Domain.class, domainName, now);
    checkArgumentPresent(domainOpt, "Domain '%s' does not exist or is deleted", domainName);
    Domain domain = domainOpt.get();
    Set<String> missingHosts =
        difference(newHostsSet, checkResourcesExist(Host.class, newCanonicalHosts, now));
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `core/src/main/java/google/registry/tools/UpdateDomainCommand.java`
#### Snippet
```java
      Optional<Domain> domainOptional = loadByForeignKey(Domain.class, domainName, now);
      checkArgumentPresent(domainOptional, "Domain '%s' does not exist or is deleted", domainName);
      Domain domain = domainOptional.get();
      checkArgument(
          !domain.getStatusValues().contains(SERVER_UPDATE_PROHIBITED),
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `core/src/main/java/google/registry/tools/DsRecord.java`
#### Snippet
```java
        DigestType.fromWireValue(digestType),
        String.format("DS record uses an unrecognized digest type: %d", digestType));
    if (DigestType.fromWireValue(digestType).get().getBytes()
        != BaseEncoding.base16().decode(digest).length) {
      throw new IllegalArgumentException(
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `core/src/main/java/google/registry/tools/DeleteReservedListCommand.java`
#### Snippet
```java
  @Override
  protected String execute() {
    ReservedList existing = ReservedList.get(name).get();
    ReservedListDao.delete(existing);
    return String.format("Deleted reserved list: %s", name);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `core/src/main/java/google/registry/tools/UnrenewDomainCommand.java`
#### Snippet
```java
    DateTime now = clock.nowUtc();
    for (String domainName : mainParameters) {
      Domain domain = loadByForeignKey(Domain.class, domainName, now).get();
      DateTime previousTime = domain.getRegistrationExpirationTime();
      DateTime newTime = leapSafeSubtractYears(previousTime, period);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `core/src/main/java/google/registry/tools/server/CreateGroupsAction.java`
#### Snippet
```java
          "Error creating Google Groups; could not find registrar with id %s", clientId.get()));
    }
    return registrar.get();
  }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `core/src/main/java/google/registry/keyring/api/PgpHelper.java`
#### Snippet
```java
  public static PGPPublicKey loadPublicKeyBytes(byte[] data) {
    try {
      return lookupPublicSubkey(new BcPGPPublicKeyRing(data), KeyRequirement.ENCRYPT).get();
    } catch (IOException e) {
      throw new RuntimeException(e);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `core/src/main/java/google/registry/tools/server/ListObjectsAction.java`
#### Snippet
```java
                    .map(String::length)
                    .max(Ordering.natural())
                    .get()));
  }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `core/src/main/java/google/registry/request/auth/UserAuthInfo.java`
#### Snippet
```java
    return appEngineUser()
        .map(User::getEmail)
        .orElseGet(() -> consoleUser().get().getEmailAddress());
  }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `core/src/main/java/google/registry/request/auth/UserAuthInfo.java`
#### Snippet
```java
    return appEngineUser()
        .map(User::getNickname)
        .orElseGet(() -> consoleUser().get().getEmailAddress());
  }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `core/src/main/java/google/registry/request/auth/AuthenticatedRegistrarAccessor.java`
#### Snippet
```java
      userAuthInfo
          .consoleUser()
          .get()
          .getUserRoles()
          .getRegistrarRoles()
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `docs/src/main/java/google/registry/documentation/FlowDocumentation.java`
#### Snippet
```java
                .filter(anno -> anno.getAnnotationType().toString().equals(CODE_ANNOTATION_NAME))
                .findFirst()
                .get();
        // The annotation should have one element whose value converts to an EppResult.Code.
        AnnotationValue value =
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `util/src/main/java/google/registry/util/YamlUtils.java`
#### Snippet
```java
  static String mergeYaml(String defaultYaml, String customYaml) {
    Yaml yaml = new Yaml();
    Map<String, Object> yamlMap = loadAsMap(yaml, defaultYaml).get();
    Optional<Map<String, Object>> customMap = loadAsMap(yaml, customYaml);
    if (customMap.isPresent()) {
```

## RuleId[ruleID=MethodOverridesStaticMethod]
### MethodOverridesStaticMethod
Method `getFromServiceLoader()` tries to override a static method of a superclass
in `core/src/main/java/google/registry/config/DelegatedCredentials.java`
#### Snippet
```java
  }

  protected static <T> T getFromServiceLoader(Class<? extends T> clazz, T defaultInstance) {
    return Iterables.getFirst(ServiceLoader.load(clazz), defaultInstance);
  }
```

## RuleId[ruleID=IOResource]
### IOResource
'DataInputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `core/src/main/java/google/registry/dns/writer/dnsupdate/DnsMessageTransport.java`
#### Snippet
```java

  private Message readMessage(InputStream inputStream) throws IOException {
    DataInputStream stream = new DataInputStream(inputStream);
    int length = stream.readUnsignedShort();
    byte[] messageData = new byte[length];
```

### IOResource
'FileOutputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `core/src/main/java/google/registry/tools/GetKeyringSecretCommand.java`
#### Snippet
```java
  @Override
  public void run() throws Exception {
    OutputStream out = outputPath != null ? new FileOutputStream(outputPath.toFile()) : System.out;
    Security.addProvider(new BouncyCastleProvider());

```

### IOResource
'ObjectInputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `util/src/main/java/google/registry/util/SerializeUtils.java`
#### Snippet
```java
    }
    try {
      return type.cast(new ObjectInputStream(new ByteArrayInputStream(objectBytes)).readObject());
    } catch (ClassNotFoundException | IOException e) {
      throw new IllegalArgumentException(
```

## RuleId[ruleID=OptionalIsPresent]
### OptionalIsPresent
Can be replaced with single expression in functional style
in `core/src/main/java/google/registry/flows/picker/FlowPicker.java`
#### Snippet
```java
      Optional<RgpUpdateExtension> rgpUpdateExtension =
          eppInput.getSingleExtension(RgpUpdateExtension.class);
      if (!rgpUpdateExtension.isPresent()) {
        return null;
      }
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `core/src/main/java/google/registry/model/domain/packagetoken/PackageTokenResponseExtension.java`
#### Snippet
```java
    PackageTokenResponseExtension instance = new PackageTokenResponseExtension();
    instance.token = "";
    if (tokenKey.isPresent()) {
      instance.token = tokenKey.get().getKey().toString();
    }
```

## RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `NomulusPostgreSql` has only 'static' members, and lacks a 'private' constructor
in `db/src/main/java/google/registry/persistence/NomulusPostgreSql.java`
#### Snippet
```java

/** Information about Nomulus' Cloud SQL PostgreSql instance. */
public class NomulusPostgreSql {

  /** The current PostgreSql version in Cloud SQL. */
```

### UtilityClassWithoutPrivateConstructor
Class `ConsoleConfigModule` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/google/registry/ui/ConsoleDebug.java`
#### Snippet
```java
  /** Dagger module for ConsoleDebug. */
  @Module
  public static final class ConsoleConfigModule {

    @Provides
```

### UtilityClassWithoutPrivateConstructor
Class `RegistrarConsoleModule` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/google/registry/ui/server/registrar/RegistrarConsoleModule.java`
#### Snippet
```java
/** Dagger module for the Registrar Console parameters. */
@Module
public final class RegistrarConsoleModule {

  static final String PARAM_CLIENT_ID = "clientId";
```

### UtilityClassWithoutPrivateConstructor
Class `VoidDnsWriterModule` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/google/registry/dns/writer/VoidDnsWriterModule.java`
#### Snippet
```java
/** Dagger module that disables DNS updates. */
@Module
public final class VoidDnsWriterModule {

  @Provides
```

### UtilityClassWithoutPrivateConstructor
Class `RegistrarFormFields` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/google/registry/ui/server/RegistrarFormFields.java`
#### Snippet
```java

/** Form fields for validating input for the {@code Registrar} class. */
public final class RegistrarFormFields {

  public static final Pattern BASE64_PATTERN = Pattern.compile("[+/a-zA-Z0-9]*");
```

### UtilityClassWithoutPrivateConstructor
Class `DnsUpdateConfigModule` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/google/registry/dns/writer/dnsupdate/DnsUpdateConfigModule.java`
#### Snippet
```java
/** Dagger module that provides DNS configuration settings. */
@Module
public class DnsUpdateConfigModule {

  /**
```

### UtilityClassWithoutPrivateConstructor
Class `RydeTar` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/google/registry/rde/RydeTar.java`
#### Snippet
```java

/** Single-file POSIX tar archive creator that wraps an {@link OutputStream}. */
final class RydeTar {

  /**
```

### UtilityClassWithoutPrivateConstructor
Class `RydeCompression` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/google/registry/rde/RydeCompression.java`
#### Snippet
```java
 * <p>This uses the ZIP compression algorithm per the ICANN escrow specification.
 */
final class RydeCompression {

  private static final int BUFFER_SIZE = 64 * 1024;
```

### UtilityClassWithoutPrivateConstructor
Class `RdeAdapter` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/google/registry/rde/RdeAdapter.java`
#### Snippet
```java

/** Utility class that converts database objects to RDE XML objects. */
final class RdeAdapter {

  /** Create {@link XjcRdeRrType} with optional {@code client} attribute. */
```

### UtilityClassWithoutPrivateConstructor
Class `JSchModule` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/google/registry/rde/JSchModule.java`
#### Snippet
```java
/** Dagger module for {@link JSch} which provides SSH/SFTP connectivity. */
@Module
public final class JSchModule {

  @Provides
```

### UtilityClassWithoutPrivateConstructor
Class `XjcXmlTransformer` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/google/registry/xjc/XjcXmlTransformer.java`
#### Snippet
```java

/** Static methods for marshalling to and from the generated classes.  */
public class XjcXmlTransformer {

  private static final XmlTransformer INSTANCE = new XmlTransformer(
```

### UtilityClassWithoutPrivateConstructor
Class `BeamUtils` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/google/registry/beam/BeamUtils.java`
#### Snippet
```java

/** Static utilities for {@code Beam} pipelines. */
public class BeamUtils {

  /** Extracts a string representation of a field in a {@link GenericRecord}. */
```

### UtilityClassWithoutPrivateConstructor
Class `CronModule` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/google/registry/cron/CronModule.java`
#### Snippet
```java
/** Dagger module for the cron package. */
@Module
public final class CronModule {

  public static final String ENDPOINT_PARAM = "endpoint";
```

### UtilityClassWithoutPrivateConstructor
Class `RdapIcannStandardInformation` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/google/registry/rdap/RdapIcannStandardInformation.java`
#### Snippet
```java
 *     Operational Profile for gTLD Registries and Registrars</a>
 */
public class RdapIcannStandardInformation {

  /** Required by ICANN RDAP Profile section 1.4.10. */
```

### UtilityClassWithoutPrivateConstructor
Class `RdapModule` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/google/registry/rdap/RdapModule.java`
#### Snippet
```java
/** Dagger module for the RDAP package. */
@Module
public final class RdapModule {

  private static final FluentLogger logger = FluentLogger.forEnclosingClass();
```

### UtilityClassWithoutPrivateConstructor
Class `SmdrlCsvParser` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/google/registry/tmch/SmdrlCsvParser.java`
#### Snippet
```java
 *     TMCH functional specifications - SMD Revocation List</a>
 */
public final class SmdrlCsvParser {

  /** Converts the lines from the DNL CSV file into a data structure. */
```

### UtilityClassWithoutPrivateConstructor
Class `TmchData` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/google/registry/tmch/TmchData.java`
#### Snippet
```java

/** Helper class for common data loaded from the jar and SQL at runtime. */
public final class TmchData {

  private static final String BEGIN_ENCODED_SMD = "-----BEGIN ENCODED SMD-----";
```

### UtilityClassWithoutPrivateConstructor
Class `TmchModule` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/google/registry/tmch/TmchModule.java`
#### Snippet
```java
/** Dagger module for TMCH package. */
@Module
public final class TmchModule {

  private static final PGPPublicKey MARKSDB_PUBLIC_KEY = TmchData
```

### UtilityClassWithoutPrivateConstructor
Class `ClaimsListParser` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/google/registry/tmch/ClaimsListParser.java`
#### Snippet
```java
 *     TMCH functional specifications - DNL List file</a>
 */
public class ClaimsListParser {

  /**
```

### UtilityClassWithoutPrivateConstructor
Class `BatchModule` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/google/registry/batch/BatchModule.java`
#### Snippet
```java
/** Dagger module for injecting common settings for batch actions. */
@Module
public class BatchModule {

  public static final String PARAM_DRY_RUN = "dryRun";
```

### UtilityClassWithoutPrivateConstructor
Class `GroupsApiChecker` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/google/registry/batch/cannedscript/GroupsApiChecker.java`
#### Snippet
```java
 */
// TODO(b/234424397): remove class after credential changes are rolled out.
public class GroupsApiChecker {
  private static final FluentLogger logger = FluentLogger.forEnclosingClass();

```

### UtilityClassWithoutPrivateConstructor
Class `GroupsApiModule` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/google/registry/batch/cannedscript/GroupsApiChecker.java`
#### Snippet
```java

  @Module
  static class GroupsApiModule {
    @Provides
    static Directory provideDirectory(
```

### UtilityClassWithoutPrivateConstructor
Class `EppXmlSanitizer` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/google/registry/flows/EppXmlSanitizer.java`
#### Snippet
```java
 * <p>Invalid XML text is not sanitized, and returned as is.
 */
public class EppXmlSanitizer {

  private static final FluentLogger logger = FluentLogger.forEnclosingClass();
```

### UtilityClassWithoutPrivateConstructor
Class `ServerTridProviderModule` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/google/registry/flows/ServerTridProviderModule.java`
#### Snippet
```java
/** Dagger module for the server Trid provider. */
@Module
public class ServerTridProviderModule {

  @Provides
```

### UtilityClassWithoutPrivateConstructor
Class `EppToolModule` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/google/registry/flows/EppToolAction.java`
#### Snippet
```java
  /** Dagger module for the epp tool endpoint. */
  @Module
  public static final class EppToolModule {

    // TODO(b/29139545): Make parameters consistent across the graph. @Parameter("dryRun") is
```

### UtilityClassWithoutPrivateConstructor
Class `CheckApiModule` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/google/registry/flows/CheckApiAction.java`
#### Snippet
```java
  /** Dagger module for the check api endpoint. */
  @Module
  public static final class CheckApiModule {

    @Provides
```

### UtilityClassWithoutPrivateConstructor
Class `EppTlsModule` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/google/registry/flows/TlsCredentials.java`
#### Snippet
```java
  /** Dagger module for the EPP TLS endpoint. */
  @Module
  public static final class EppTlsModule {

    @Provides
```

### UtilityClassWithoutPrivateConstructor
Class `HostFlowUtils` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/google/registry/flows/host/HostFlowUtils.java`
#### Snippet
```java

/** Static utility functions for host flows. */
public class HostFlowUtils {

  /** Checks that a host name is valid. */
```

### UtilityClassWithoutPrivateConstructor
Class `CustomLogicFactoryModule` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/google/registry/flows/custom/CustomLogicFactoryModule.java`
#### Snippet
```java
/** Dagger module for custom logic factories. */
@Module
public class CustomLogicFactoryModule {

  @Provides
```

### UtilityClassWithoutPrivateConstructor
Class `AllocationTokenModule` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/google/registry/flows/domain/token/AllocationTokenModule.java`
#### Snippet
```java
/** Dagger module for allocation token classes. */
@Module
public class AllocationTokenModule {

  @Provides
```

### UtilityClassWithoutPrivateConstructor
Class `FlowPicker` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/google/registry/flows/picker/FlowPicker.java`
#### Snippet
```java

/** Class that picks a flow to handle a given EPP command. */
public class FlowPicker {

  /** Marker class for unimplemented flows. */
```

### UtilityClassWithoutPrivateConstructor
Class `ContactFlowUtils` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/google/registry/flows/contact/ContactFlowUtils.java`
#### Snippet
```java

/** Static utility functions for contact flows. */
public class ContactFlowUtils {
  /** Check that an internationalized postal info has only ascii characters. */
  static void validateAsciiPostalInfo(@Nullable PostalInfo internationalized) throws EppException {
```

### UtilityClassWithoutPrivateConstructor
Class `CacheUtils` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/google/registry/model/CacheUtils.java`
#### Snippet
```java

/** Utility methods related to caching Datastore entities. */
public class CacheUtils {

  /**
```

### UtilityClassWithoutPrivateConstructor
Class `ModelUtils` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/google/registry/model/ModelUtils.java`
#### Snippet
```java

/** A collection of static methods that deal with reflection on model classes. */
public class ModelUtils {

  /** Caches all instance fields on an object, including non-public and inherited fields. */
```

### UtilityClassWithoutPrivateConstructor
Class `ObjectifyService` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/google/registry/model/ofy/ObjectifyService.java`
#### Snippet
```java
 */
@DeleteAfterMigration
public class ObjectifyService {

  /** A singleton instance of our Ofy wrapper. */
```

### UtilityClassWithoutPrivateConstructor
Class `SignedMarkRevocationListDao` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/google/registry/model/smd/SignedMarkRevocationListDao.java`
#### Snippet
```java
import java.util.Optional;

public class SignedMarkRevocationListDao {

  private static final FluentLogger logger = FluentLogger.forEnclosingClass();
```

### UtilityClassWithoutPrivateConstructor
Class `RegistryLockDao` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/google/registry/model/tld/RegistryLockDao.java`
#### Snippet
```java

/** Data access object for {@link RegistryLock}. */
public final class RegistryLockDao {

  /** Returns the {@link RegistryLock} referred to by this revision ID, or empty if none exists. */
```

### UtilityClassWithoutPrivateConstructor
Class `DomainLabelMetrics` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/google/registry/model/tld/label/DomainLabelMetrics.java`
#### Snippet
```java

/** Instrumentation for reserved lists. */
class DomainLabelMetrics {

  /** Possible premium list check outcomes. */
```

### UtilityClassWithoutPrivateConstructor
Class `DomainFlowUtils` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/google/registry/flows/domain/DomainFlowUtils.java`
#### Snippet
```java

/** Static utility functions for domain flows. */
public class DomainFlowUtils {

  /** Map from launch phases to the allowed tld states. */
```

### UtilityClassWithoutPrivateConstructor
Class `DomainCommand` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/google/registry/model/domain/DomainCommand.java`
#### Snippet
```java

/** A collection of {@link Domain} commands. */
public class DomainCommand {

  /** The default validity period (if not specified) is 1 year for all operations. */
```

### UtilityClassWithoutPrivateConstructor
Class `UserDao` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/google/registry/model/console/UserDao.java`
#### Snippet
```java

/** Data access object for {@link User} objects to simplify saving and retrieval. */
public class UserDao {

  /** Retrieves the one user with this email address if it exists. */
```

### UtilityClassWithoutPrivateConstructor
Class `ProtocolDefinition` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/google/registry/model/eppcommon/ProtocolDefinition.java`
#### Snippet
```java

/** Constants that define the EPP protocol version we support. */
public class ProtocolDefinition {
  public static final String VERSION = "1.0";

```

### UtilityClassWithoutPrivateConstructor
Class `EppXmlTransformer` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/google/registry/model/eppcommon/EppXmlTransformer.java`
#### Snippet
```java

/** {@link XmlTransformer} for marshalling to and from the Epp model classes.  */
public class EppXmlTransformer  {

  // Hardcoded XML schemas, ordered with respect to dependency.
```

### UtilityClassWithoutPrivateConstructor
Class `Spec11ThreatMatchDao` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/google/registry/model/reporting/Spec11ThreatMatchDao.java`
#### Snippet
```java
 * BEAM pipeline or standard non-BEAM code.
 */
public class Spec11ThreatMatchDao {

  /** Delete all entries with the specified date from the database. */
```

### UtilityClassWithoutPrivateConstructor
Class `HistoryEntryDao` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/google/registry/model/reporting/HistoryEntryDao.java`
#### Snippet
```java

/** Retrieves {@link HistoryEntry} descendants (e.g. {@link DomainHistory}). */
public class HistoryEntryDao {

  public static ImmutableMap<Class<? extends EppResource>, Class<? extends HistoryEntry>>
```

### UtilityClassWithoutPrivateConstructor
Class `RemoteApiOptionsUtil` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/google/registry/tools/RemoteApiOptionsUtil.java`
#### Snippet
```java
 * {@link RemoteApiOptions} with a JSON representing a user credential.
 */
public class RemoteApiOptionsUtil {
  public static RemoteApiOptions useGoogleCredentialStream(
      RemoteApiOptions options, InputStream stream) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `AuthModule` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/google/registry/tools/AuthModule.java`
#### Snippet
```java
/** Module providing the dependency graph for authorization credentials. */
@Module
public class AuthModule {

  private static final File DATA_STORE_DIR =
```

### UtilityClassWithoutPrivateConstructor
Class `RegistryToolDataflowModule` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/google/registry/tools/RegistryToolDataflowModule.java`
#### Snippet
```java
/** Provides a {@link Dataflow} API client for use in {@link RegistryTool}. */
@Module
public class RegistryToolDataflowModule {

  @Provides
```

### UtilityClassWithoutPrivateConstructor
Class `RequestFactoryModule` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/google/registry/tools/RequestFactoryModule.java`
#### Snippet
```java
 */
@Module
class RequestFactoryModule {

  static final int REQUEST_TIMEOUT_MS = 10 * 60 * 1000;
```

### UtilityClassWithoutPrivateConstructor
Class `CommandUtilities` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/google/registry/tools/CommandUtilities.java`
#### Snippet
```java

/** Container class for static utility methods. */
class CommandUtilities {

  /** A useful parameter enum for commands that operate on {@link EppResource} objects. */
```

### UtilityClassWithoutPrivateConstructor
Class `FlowComponentModule` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/google/registry/flows/FlowComponent.java`
#### Snippet
```java
  /** Module to delegate injection of a desired {@link Flow}. */
  @Module
  class FlowComponentModule {
    // WARNING: @FlowScope is intentionally omitted here so that we get a fresh Flow instance on
    // each call to Provider<Flow>.get(), to avoid Flow instance re-use upon transaction retries.
```

### UtilityClassWithoutPrivateConstructor
Class `RegistryTool` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/google/registry/tools/RegistryTool.java`
#### Snippet
```java

/** Container class to create and run remote commands against a Datastore instance. */
public final class RegistryTool {

  /**
```

### UtilityClassWithoutPrivateConstructor
Class `DriveModule` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/google/registry/export/DriveModule.java`
#### Snippet
```java
/** Dagger module for Google {@link Drive} service connection objects. */
@Module
public final class DriveModule {

  @Provides
```

### UtilityClassWithoutPrivateConstructor
Class `SheetsServiceModule` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/google/registry/export/sheet/SheetsServiceModule.java`
#### Snippet
```java
/** Dagger module for {@link Sheets}. */
@Module
public final class SheetsServiceModule {

  @Provides
```

### UtilityClassWithoutPrivateConstructor
Class `SheetModule` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/google/registry/export/sheet/SheetModule.java`
#### Snippet
```java
/** Dagger module for the sheet package. */
@Module
public final class SheetModule {

  @Provides
```

### UtilityClassWithoutPrivateConstructor
Class `DirectoryModule` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/google/registry/groups/DirectoryModule.java`
#### Snippet
```java
/** Dagger module for the Google {@link Directory} service. */
@Module
public final class DirectoryModule {

  @Provides
```

### UtilityClassWithoutPrivateConstructor
Class `GroupssettingsModule` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/google/registry/groups/GroupssettingsModule.java`
#### Snippet
```java
/** Dagger module for the Google {@link Groupssettings} service. */
@Module
public final class GroupssettingsModule {

  @Provides
```

### UtilityClassWithoutPrivateConstructor
Class `ConfigModule` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/google/registry/config/RegistryConfig.java`
#### Snippet
```java
  /** Dagger module for providing configuration settings. */
  @Module
  public static final class ConfigModule {

    @Provides
```

### UtilityClassWithoutPrivateConstructor
Class `KeyringModule` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/google/registry/keyring/KeyringModule.java`
#### Snippet
```java
/** Dagger module for {@link Keyring} */
@Module
public final class KeyringModule {

  @Provides
```

### UtilityClassWithoutPrivateConstructor
Class `KeyModule` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/google/registry/keyring/api/KeyModule.java`
#### Snippet
```java
/** Dagger module for keys stored in {@link Keyring}. */
@Module
public final class KeyModule {

  /** Dagger qualifier for keys from {@link Keyring}. */
```

### UtilityClassWithoutPrivateConstructor
Class `PricingModule` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/google/registry/pricing/PricingModule.java`
#### Snippet
```java
 */
@Module
public class PricingModule {

  @Provides @IntoMap
```

### UtilityClassWithoutPrivateConstructor
Class `PgpHelper` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/google/registry/keyring/api/PgpHelper.java`
#### Snippet
```java

/** Helper functions for extracting PGP keys from their keyrings. */
public final class PgpHelper {

  /**
```

### UtilityClassWithoutPrivateConstructor
Class `UrlConnectionUtils` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/google/registry/request/UrlConnectionUtils.java`
#### Snippet
```java

/** Utilities for common functionality relating to {@link java.net.URLConnection}s. */
public class UrlConnectionUtils {

  /** Retrieves the response from the given connection as a byte array. */
```

### UtilityClassWithoutPrivateConstructor
Class `UrlFetchTransportModule` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/google/registry/request/Modules.java`
#### Snippet
```java
  /** Dagger module that causes the App Engine's URL fetcher to be used for Google APIs requests. */
  @Module
  public static final class UrlFetchTransportModule {
    private static final UrlFetchTransport HTTP_TRANSPORT = new UrlFetchTransport();

```

### UtilityClassWithoutPrivateConstructor
Class `NetHttpTransportModule` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/google/registry/request/Modules.java`
#### Snippet
```java
   */
  @Module
  public static final class NetHttpTransportModule {

    @Provides
```

### UtilityClassWithoutPrivateConstructor
Class `GsonModule` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/google/registry/request/Modules.java`
#### Snippet
```java
  /** Dagger module that causes the Google GSON parser to be used for Google APIs requests. */
  @Module
  public static final class GsonModule {
    @Provides
    static JsonFactory provideJsonFactory() {
```

### UtilityClassWithoutPrivateConstructor
Class `UserServiceModule` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/google/registry/request/Modules.java`
#### Snippet
```java
  /** Dagger module for {@link UserService}. */
  @Module
  public static final class UserServiceModule {
    private static final UserService userService = UserServiceFactory.getUserService();

```

### UtilityClassWithoutPrivateConstructor
Class `UrlFetchServiceModule` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/google/registry/request/Modules.java`
#### Snippet
```java
  /** Dagger module for {@link URLFetchService}. */
  @Module
  public static final class UrlFetchServiceModule {
    private static final URLFetchService fetchService = URLFetchServiceFactory.getURLFetchService();

```

### UtilityClassWithoutPrivateConstructor
Class `UrlConnectionServiceModule` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/google/registry/request/Modules.java`
#### Snippet
```java
  /** Dagger module for {@link UrlConnectionService}. */
  @Module
  public static final class UrlConnectionServiceModule {
    @Provides
    static UrlConnectionService provideUrlConnectionService() {
```

### UtilityClassWithoutPrivateConstructor
Class `RouterDisplayHelper` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/google/registry/request/RouterDisplayHelper.java`
#### Snippet
```java
 * <p>See the Auth class for more information about authentication settings.
 */
public class RouterDisplayHelper {

  private static final String PATH = "path";
```

### UtilityClassWithoutPrivateConstructor
Class `BigqueryUtils` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/google/registry/bigquery/BigqueryUtils.java`
#### Snippet
```java

/** Utilities related to Bigquery. */
public class BigqueryUtils {

  /** Bigquery modes for schema fields. */
```

### UtilityClassWithoutPrivateConstructor
Class `LoadTestModule` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/google/registry/loadtest/LoadTestModule.java`
#### Snippet
```java
 */
@Module
public final class LoadTestModule {

  // There's already an @Parameter("clientId") for CreateGroupsAction that's only optional, and we
```

### UtilityClassWithoutPrivateConstructor
Class `JsonHttp` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/google/registry/security/JsonHttp.java`
#### Snippet
```java
 * @see JsonResponseHelper
 */
public final class JsonHttp {

  private static final FluentLogger logger = FluentLogger.forEnclosingClass();
```

### UtilityClassWithoutPrivateConstructor
Class `ReportingModule` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/google/registry/reporting/ReportingModule.java`
#### Snippet
```java
/** Dagger module for injecting common settings for all reporting tasks. */
@Module
public class ReportingModule {

  public static final String BEAM_QUEUE = "beam-reporting";
```

### UtilityClassWithoutPrivateConstructor
Class `IcannReportingModule` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/google/registry/reporting/icann/IcannReportingModule.java`
#### Snippet
```java
/** Module for dependencies required by ICANN monthly transactions/activity reporting. */
@Module
public final class IcannReportingModule {

  /** Enum determining the type of report to generate or upload. */
```

### UtilityClassWithoutPrivateConstructor
Class `JsonResponseHelper` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/google/registry/security/JsonResponseHelper.java`
#### Snippet
```java
 * @see JsonHttp
 */
public final class JsonResponseHelper {

  /** Possible results of an RPC operation. */
```

### UtilityClassWithoutPrivateConstructor
Class `DnsCountQueryCoordinatorModule` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/google/registry/reporting/icann/DnsCountQueryCoordinatorModule.java`
#### Snippet
```java
/** Dagger module to provide the DnsCountQueryCoordinator. */
@Module
public class DnsCountQueryCoordinatorModule {

  @Provides
```

### UtilityClassWithoutPrivateConstructor
Class `Spec11Module` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/google/registry/reporting/spec11/Spec11Module.java`
#### Snippet
```java
/** Module for dependencies required by Spec11 reporting. */
@Module
public class Spec11Module {

  @Provides
```

### UtilityClassWithoutPrivateConstructor
Class `BillingModule` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/google/registry/reporting/billing/BillingModule.java`
#### Snippet
```java
/** Module for dependencies required by monthly billing actions. */
@Module
public final class BillingModule {

  public static final String DETAIL_REPORT_PREFIX = "invoice_details";
```

### UtilityClassWithoutPrivateConstructor
Class `WhiteboxModule` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/google/registry/monitoring/whitebox/WhiteboxModule.java`
#### Snippet
```java
 */
@Module
public class WhiteboxModule {

  /** Provides an EppMetric builder with the request ID and startTimestamp already initialized. */
```

### UtilityClassWithoutPrivateConstructor
Class `StackdriverModule` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/google/registry/monitoring/whitebox/StackdriverModule.java`
#### Snippet
```java
/** Dagger module for Google Stackdriver service connection objects. */
@Module
public final class StackdriverModule {

  // We need a fake GCE zone to appease Stackdriver's resource model.
```

### UtilityClassWithoutPrivateConstructor
Class `DummyJpaTransactionManager` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/google/registry/persistence/transaction/DummyJpaTransactionManager.java`
#### Snippet
```java
 * JpaTransactionManagerExtension} as a JUnit extension in the test class.
 */
public class DummyJpaTransactionManager {

  /** Constructs a dummy {@link JpaTransactionManager} instance. */
```

### UtilityClassWithoutPrivateConstructor
Class `DevTool` has only 'static' members, and lacks a 'private' constructor
in `core/src/nonprod/java/google/registry/tools/DevTool.java`
#### Snippet
```java

/** Entry point of Nomulus development commands. */
public class DevTool {

  /**
```

### UtilityClassWithoutPrivateConstructor
Class `PredicateUtils` has only 'static' members, and lacks a 'private' constructor
in `util/src/main/java/google/registry/util/PredicateUtils.java`
#### Snippet
```java

/** Utility class containing {@link Predicate} methods. */
public class PredicateUtils {

  /**
```

### UtilityClassWithoutPrivateConstructor
Class `Idn` has only 'static' members, and lacks a 'private' constructor
in `util/src/main/java/google/registry/util/Idn.java`
#### Snippet
```java
 * as defined by the differences between IDNA2003 and transitional UTS46.
 */
public final class Idn {

  /** Cached UTS46 with the flags we want. */
```

### UtilityClassWithoutPrivateConstructor
Class `ListNamingUtils` has only 'static' members, and lacks a 'private' constructor
in `util/src/main/java/google/registry/util/ListNamingUtils.java`
#### Snippet
```java
 * A utility class for conversion of input file paths into names for entities in Datastore.
 */
public final class ListNamingUtils {

  /** Turns a file path into a name suitable for use as the name of a premium or reserved list. */
```

### UtilityClassWithoutPrivateConstructor
Class `DatastoreServiceUtils` has only 'static' members, and lacks a 'private' constructor
in `util/src/main/java/google/registry/util/DatastoreServiceUtils.java`
#### Snippet
```java

/** Utility methods for working with the App Engine Datastore service. */
public class DatastoreServiceUtils {

  /** Returns the name or id of a key, which may be a string or a long. */
```

### UtilityClassWithoutPrivateConstructor
Class `Alphabets` has only 'static' members, and lacks a 'private' constructor
in `util/src/main/java/google/registry/util/StringGenerator.java`
#### Snippet
```java

  /** A class containing different alphabets used to generate strings. */
  public static class Alphabets {

    /** A URL-safe Base64 alphabet (alphanumeric, hyphen, underscore). */
```

### UtilityClassWithoutPrivateConstructor
Class `AppEngineTimeLimiter` has only 'static' members, and lacks a 'private' constructor
in `util/src/main/java/google/registry/util/AppEngineTimeLimiter.java`
#### Snippet
```java
 * a fresh instance each time.
 */
public class AppEngineTimeLimiter {

  /**
```

### UtilityClassWithoutPrivateConstructor
Class `RegistrarUtils` has only 'static' members, and lacks a 'private' constructor
in `util/src/main/java/google/registry/util/RegistrarUtils.java`
#### Snippet
```java

/** Utilities for working with {@code Registrar} objects. */
public class RegistrarUtils {

  private static final CharMatcher ASCII_LETTER_OR_DIGIT_MATCHER =
```

### UtilityClassWithoutPrivateConstructor
Class `PreconditionsUtils` has only 'static' members, and lacks a 'private' constructor
in `util/src/main/java/google/registry/util/PreconditionsUtils.java`
#### Snippet
```java

/** Utility methods related to preconditions checking. */
public class PreconditionsUtils {

  /**
```

### UtilityClassWithoutPrivateConstructor
Class `PasswordUtils` has only 'static' members, and lacks a 'private' constructor
in `util/src/main/java/google/registry/util/PasswordUtils.java`
#### Snippet
```java

/** Common utility class to handle password hashing and salting */
public final class PasswordUtils {

  public static final Supplier<byte[]> SALT_SUPPLIER =
```

### UtilityClassWithoutPrivateConstructor
Class `ResourceUtils` has only 'static' members, and lacks a 'private' constructor
in `util/src/main/java/google/registry/util/ResourceUtils.java`
#### Snippet
```java

/** Utility methods related to reading java resources. */
public final class ResourceUtils {

  /** Loads a resource from a file as a string, assuming UTF-8 encoding. */
```

### UtilityClassWithoutPrivateConstructor
Class `XmlEnumUtils` has only 'static' members, and lacks a 'private' constructor
in `util/src/main/java/google/registry/util/XmlEnumUtils.java`
#### Snippet
```java

/** Utility methods related to xml enums. */
public class XmlEnumUtils {
  /** Read the {@link XmlEnumValue} string off of an enum. */
  public static String enumToXml(Enum<?> input) {
```

### UtilityClassWithoutPrivateConstructor
Class `HealthCheckProtocolModule` has only 'static' members, and lacks a 'private' constructor
in `proxy/src/main/java/google/registry/proxy/HealthCheckProtocolModule.java`
#### Snippet
```java
 */
@Module
public class HealthCheckProtocolModule {

  /** Dagger qualifier to provide health check protocol related handlers and other bindings. */
```

### UtilityClassWithoutPrivateConstructor
Class `CollectionUtils` has only 'static' members, and lacks a 'private' constructor
in `util/src/main/java/google/registry/util/CollectionUtils.java`
#### Snippet
```java

/** Utility methods related to collections. */
public class CollectionUtils {

  /** Checks if an iterable is null or empty. */
```

### UtilityClassWithoutPrivateConstructor
Class `MetricsModule` has only 'static' members, and lacks a 'private' constructor
in `proxy/src/main/java/google/registry/proxy/MetricsModule.java`
#### Snippet
```java
/** Module that provides necessary bindings to instantiate a {@link MetricReporter} */
@Module
public class MetricsModule {

  private static final FluentLogger logger = FluentLogger.forEnclosingClass();
```

### UtilityClassWithoutPrivateConstructor
Class `WhoisProtocolModule` has only 'static' members, and lacks a 'private' constructor
in `proxy/src/main/java/google/registry/proxy/WhoisProtocolModule.java`
#### Snippet
```java
/** A module that provides the {@link FrontendProtocol} used for whois protocol. */
@Module
public class WhoisProtocolModule {

  /** Dagger qualifier to provide whois protocol related handlers and other bindings. */
```

### UtilityClassWithoutPrivateConstructor
Class `HttpsRelayProtocolModule` has only 'static' members, and lacks a 'private' constructor
in `proxy/src/main/java/google/registry/proxy/HttpsRelayProtocolModule.java`
#### Snippet
```java
 */
@Module
public class HttpsRelayProtocolModule {

  /** Dagger qualifier to provide https relay protocol related handlers and other bindings. */
```

### UtilityClassWithoutPrivateConstructor
Class `TruthUtils` has only 'static' members, and lacks a 'private' constructor
in `common/src/testing/java/google/registry/testing/truth/TruthUtils.java`
#### Snippet
```java

/** Utils class containing helper functions for {@link Truth}. */
public class TruthUtils {

  /** Asserts that both of the given objects are either null or nonnull. */
```

### UtilityClassWithoutPrivateConstructor
Class `SystemInfo` has only 'static' members, and lacks a 'private' constructor
in `common/src/testing/java/google/registry/testing/SystemInfo.java`
#### Snippet
```java
/** Utility class for getting system information in tests. */
@ThreadSafe
public final class SystemInfo {

  private static final FluentLogger logger = FluentLogger.forEnclosingClass();
```

### UtilityClassWithoutPrivateConstructor
Class `Prober` has only 'static' members, and lacks a 'private' constructor
in `prober/src/main/java/google/registry/monitoring/blackbox/Prober.java`
#### Snippet
```java
 * Dagger.
 */
public class Prober {

  /** Main Dagger Component */
```

### UtilityClassWithoutPrivateConstructor
Class `CertificateModule` has only 'static' members, and lacks a 'private' constructor
in `prober/src/main/java/google/registry/monitoring/blackbox/module/CertificateModule.java`
#### Snippet
```java
 */
@Module
public class CertificateModule {

  /** {@link Qualifier} to identify components provided from Local Secrets. */
```

### UtilityClassWithoutPrivateConstructor
Class `EppModule` has only 'static' members, and lacks a 'private' constructor
in `prober/src/main/java/google/registry/monitoring/blackbox/module/EppModule.java`
#### Snippet
```java
 */
@Module
public class EppModule {

  private static final int EPP_PORT = 700;
```

## RuleId[ruleID=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `core/src/main/java/google/registry/persistence/transaction/QueryComposer.java`
#### Snippet
```java
      return operatorFactory;
    }
  };

  protected static class WhereClause<U extends Comparable<? super U>> {
```

## RuleId[ruleID=DataFlowIssue]
### DataFlowIssue
Passing `null` argument to parameter annotated as @NotNull
in `core/src/main/java/google/registry/ui/forms/FormFieldException.java`
#### Snippet
```java
   */
  public FormFieldException(@Detainted String userMessage) {
    super(checkNotNull(userMessage, "userMessage"), null);
  }

```

### DataFlowIssue
Passing `null` argument to parameter annotated as @NotNull
in `core/src/main/java/google/registry/ui/forms/FormFieldException.java`
#### Snippet
```java
   */
  public FormFieldException(String field, @Detainted String userMessage) {
    super(checkNotNull(userMessage, "userMessage"), null);
    propagateImpl(field);
  }
```

### DataFlowIssue
Argument `rsp.getContent()` might be null
in `core/src/main/java/google/registry/rde/RdeReporter.java`
#### Snippet
```java

    // Ensure the XML response is valid.
    XjcIirdeaResult result = parseResult(rsp.getContent());
    if (result.getCode().getValue() != 1000) {
      logger.atWarning().log(
```

### DataFlowIssue
Method invocation `get` may produce `NullPointerException`
in `core/src/main/java/google/registry/rde/RdeFragmenter.java`
#### Snippet
```java
      return result;
    }
    EppResource resource = resourceAtTimes.get(watermark).get();
    if (resource == null) {
      result = Optional.empty();
```

### DataFlowIssue
@Nullable method 'apply' always returns a non-null value
in `core/src/main/java/google/registry/ui/forms/FormField.java`
#### Snippet
```java
      }

      @Nullable
      @Override
      public O apply(@Nullable O input) {
```

### DataFlowIssue
Method invocation `domainName` may produce `NullPointerException`
in `core/src/main/java/google/registry/beam/spec11/SafeBrowsingTransforms.java`
#### Snippet
```java
    public void processElement(ProcessContext context) {
      DomainNameInfo domainNameInfo = context.element();
      domainNameInfoBuffer.put(domainNameInfo.domainName(), domainNameInfo);
      if (domainNameInfoBuffer.size() >= BATCH_SIZE) {
        ImmutableSet<KV<DomainNameInfo, ThreatMatch>> results = evaluateAndFlush();
```

### DataFlowIssue
Method invocation `checkValidity` may produce `NullPointerException`
in `core/src/main/java/google/registry/tmch/TmchCertificateAuthority.java`
#### Snippet
```java
      // if you are looking at this code because the next line throws an exception, ask ICANN for a
      // new root certificate! (preferably before the current one expires...)
      root.checkValidity(clock.nowUtc().toDate());
      return root;
    } catch (Exception e) {
```

### DataFlowIssue
Method invocation `getPublicKey` may produce `NullPointerException`
in `core/src/main/java/google/registry/tmch/TmchCertificateAuthority.java`
#### Snippet
```java
                              });
                  X509CRL crl = X509Utils.loadCrl(crlContents);
                  crl.verify(ROOT_CERTS.get(tmchCaMode).getPublicKey());
                  return crl;
                }
```

### DataFlowIssue
Method invocation `run` may produce `NullPointerException`
in `core/src/main/java/google/registry/batch/CannedScriptExecutionAction.java`
#### Snippet
```java
    }
    try {
      SCRIPTS.get(scriptName).run();
      logger.atInfo().log("Finished running %s.", scriptName);
    } catch (Throwable t) {
```

### DataFlowIssue
Argument `loadedContacts.get(contactKey)` might be null
in `core/src/main/java/google/registry/rdap/RdapJsonFormatter.java`
#### Snippet
```java
          .add(
              createRdapContactEntity(
                  loadedContacts.get(contactKey), roles, OutputDataType.INTERNAL));
    }
    // Add the nameservers to the data; the load was kicked off above for efficiency.
```

### DataFlowIssue
Argument `getTypeOfHighestSeverity(reservationTypes).getMessageForCheck()` might be null
in `core/src/main/java/google/registry/flows/CheckApiAction.java`
#### Snippet
```java
        getReservationTypes(domainName.parts().get(0), domainName.parent().toString());
    if (!reservationTypes.isEmpty()) {
      return Optional.of(getTypeOfHighestSeverity(reservationTypes).getMessageForCheck());
    }
    return Optional.empty();
```

### DataFlowIssue
Method invocation `parts` may produce `NullPointerException`
in `core/src/main/java/google/registry/flows/host/HostFlowUtils.java`
#### Snippet
```java
      // the effective TLD (e.g. example.com) but we require by policy that it has to be at least
      // one part beyond that (e.g. ns1.example.com).
      if (hostName.parts().size() < effectiveTld.parts().size() + 2) {
        throw new HostNameTooShallowException();
      }
```

### DataFlowIssue
Method invocation `getValue` may produce `NullPointerException`
in `core/src/main/java/google/registry/flows/certs/CertificateChecker.java`
#### Snippet
```java
    // Check validity period length
    int maxValidityDays =
        maxValidityLengthSchedule.floorEntry(new DateTime(certificate.getNotBefore())).getValue();
    if (getValidityLengthInDays(certificate) > maxValidityDays) {
      violations.add(CertificateViolation.VALIDITY_LENGTH_TOO_LONG);
```

### DataFlowIssue
Method invocation `getValue` may produce `NullPointerException`
in `core/src/main/java/google/registry/flows/certs/CertificateChecker.java`
#### Snippet
```java
        return String.format(
            "Certificate validity period is too long; it must be less than or equal to %d days.",
            this.maxValidityLengthSchedule.lastEntry().getValue());
      case INVALID_ECDSA_CURVE:
        return String.format(
```

### DataFlowIssue
@Nullable method 'getResponseExtensions' always returns a non-null value
in `core/src/main/java/google/registry/flows/domain/DomainDeleteFlow.java`
#### Snippet
```java
  }

  @Nullable
  private ImmutableList<FeeTransformResponseExtension> getResponseExtensions(
      BillingEvent.Recurring recurringBillingEvent, Domain existingDomain, DateTime now) {
```

### DataFlowIssue
Argument `innerCommand` might be null
in `core/src/main/java/google/registry/flows/picker/FlowPicker.java`
#### Snippet
```java
    }
    // Nothing usable was found, so throw an exception.
    throw new UnimplementedCommandException(innerCommand);
  }

```

### DataFlowIssue
Argument `tld` might be null
in `core/src/main/java/google/registry/model/OteAccountBuilder.java`
#### Snippet
```java
    return registrar
        .asBuilder()
        .setAllowedTldsUncached(Sets.union(registrar.getAllowedTlds(), ImmutableSet.of(tld)))
        .build();
  }
```

### DataFlowIssue
Argument `highestSeverityType.getMessageForCheck()` might be null
in `core/src/main/java/google/registry/flows/domain/DomainCheckFlow.java`
#### Snippet
```java
        if (!reservationTypes.isEmpty()) {
          ReservationType highestSeverityType = getTypeOfHighestSeverity(reservationTypes);
          return Optional.of(highestSeverityType.getMessageForCheck());
        }
      }
```

### DataFlowIssue
Argument `parsedDomains.get(domainName)` might be null
in `core/src/main/java/google/registry/flows/domain/DomainCheckFlow.java`
#### Snippet
```java
      Optional<String> message =
          getMessageForCheck(
              parsedDomains.get(domainName),
              existingDomains,
              domainCheckResults,
```

### DataFlowIssue
Argument `fkProperty` might be null
in `core/src/main/java/google/registry/model/ForeignKeyUtils.java`
#### Snippet
```java
                            + " deletionTime) IN (SELECT %fkProperty%, MAX(deletionTime) FROM"
                            + " %entity% WHERE %fkProperty% IN (:fks) GROUP BY %fkProperty%)")
                        .replace("%fkProperty%", fkProperty)
                        .replace("%entity%", clazz.getSimpleName()),
                    Object[].class)
```

### DataFlowIssue
Method invocation `map` may produce `NullPointerException`
in `core/src/main/java/google/registry/model/tld/label/PremiumListDao.java`
#### Snippet
```java
    RevisionIdAndLabel revisionIdAndLabel =
        RevisionIdAndLabel.create(loadedList.getRevisionId(), label);
    return premiumEntryCache.get(revisionIdAndLabel).map(loadedList::convertAmountToMoney);
  }

```

### DataFlowIssue
Method invocation `isEqual` may produce `NullPointerException`
in `core/src/main/java/google/registry/flows/domain/DomainFlowUtils.java`
#### Snippet
```java
        }
        Money expectedCost = expectedFeeMap.get(type);
        if (!providedFeeMap.get(type).isEqual(expectedCost)) {
          throw new FeesMismatchException(type, expectedCost);
        }
```

### DataFlowIssue
Argument `expectedCost` might be null
in `core/src/main/java/google/registry/flows/domain/DomainFlowUtils.java`
#### Snippet
```java
        }
        Money expectedCost = expectedFeeMap.get(type);
        if (!providedFeeMap.get(type).isEqual(expectedCost)) {
          throw new FeesMismatchException(type, expectedCost);
        }
```

### DataFlowIssue
Method invocation `getContactId` may produce `NullPointerException`
in `core/src/main/java/google/registry/flows/domain/DomainFlowUtils.java`
#### Snippet
```java
      // Create an error message showing the type and contact IDs of the duplicates.
      throw new DuplicateContactForRoleException(
          Multimaps.transformValues(typesMap.build(), key -> dupeContacts.get(key).getContactId()));
    }
  }
```

### DataFlowIssue
Argument `entry` might be null
in `core/src/main/java/google/registry/model/tld/label/ReservedList.java`
#### Snippet
```java
      if (rl.getReservedListEntries().containsKey(label)) {
        ReservedListEntry entry = rl.getReservedListEntries().get(label);
        entriesBuilder.add(entry);
        metricMatchesBuilder.add(
            MetricsReservedListMatch.create(rl.getName(), entry.reservationType));
```

### DataFlowIssue
Argument `comment` might be null
in `core/src/main/java/google/registry/model/tld/label/ReservedList.java`
#### Snippet
```java
          .setLabel(label)
          .setReservationType(reservationType)
          .setComment(comment)
          .build();
    }
```

### DataFlowIssue
Method invocation `getValue` may produce `NullPointerException`
in `core/src/main/java/google/registry/model/common/TimedTransitionProperty.java`
#### Snippet
```java
    validateTimedTransitionMap(newTransitions, allowedTransitions, allowedTransitionMapName);
    checkArgument(
        newTransitions.firstEntry().getValue() == initialValue, badInitialValueErrorMessage);
    return fromValueMap(newTransitions);
  }
```

### DataFlowIssue
Method invocation `getValue` may produce `NullPointerException`
in `core/src/main/java/google/registry/model/common/TimedTransitionProperty.java`
#### Snippet
```java
    // Retrieve the current value by finding the latest transition before or at the given time,
    // where any given time earlier than START_OF_TIME is replaced by START_OF_TIME.
    return backingMap.floorEntry(latestOf(START_OF_TIME, time)).getValue();
  }

```

### DataFlowIssue
Method invocation `firstKey` may produce `NullPointerException`
in `core/src/main/java/google/registry/model/common/TimedTransitionProperty.java`
#### Snippet
```java
        !nullToEmpty(transitionMap).isEmpty(), "%s map cannot be null or empty.", mapName);
    checkArgument(
        transitionMap.firstKey().equals(START_OF_TIME),
        "%s map must start at START_OF_TIME.",
        mapName);
```

### DataFlowIssue
Dereference of `lock` may produce `NullPointerException`
in `core/src/main/java/google/registry/model/server/Lock.java`
#### Snippet
```java
          logger.atInfo().log(
              "Existing lock by request %s is still valid now %s (until %s) lock: %s",
              lock.requestLogId, now, lock.expirationTime, lock.lockId);
          break;
        case TIMED_OUT:
```

### DataFlowIssue
Dereference of `lock` may produce `NullPointerException`
in `core/src/main/java/google/registry/model/server/Lock.java`
#### Snippet
```java
          logger.atInfo().log(
              "Existing lock by request %s is timed out now %s (was valid until %s) lock: %s",
              lock.requestLogId, now, lock.expirationTime, lock.lockId);
          break;
        case OWNER_DIED:
```

### DataFlowIssue
Dereference of `lock` may produce `NullPointerException`
in `core/src/main/java/google/registry/model/server/Lock.java`
#### Snippet
```java
          logger.atInfo().log(
              "Existing lock is valid now %s (until %s), but owner (%s) isn't running lock: %s",
              now, lock.expirationTime, lock.requestLogId, lock.lockId);
          break;
        case FREE:
```

### DataFlowIssue
Dereference of `newLock` may produce `NullPointerException`
in `core/src/main/java/google/registry/model/server/Lock.java`
#### Snippet
```java
      Lock newLock = acquireResult.newLock();
      if (acquireResult.newLock() != null) {
        logger.atInfo().log("acquire succeeded %s lock: %s", newLock, newLock.lockId);
      }
    } catch (Throwable e) {
```

### DataFlowIssue
Method invocation `asBuilder` may produce `NullPointerException`
in `core/src/main/java/google/registry/model/contact/ContactHistory.java`
#### Snippet
```java

    public Builder wipeOutPii() {
      getInstance().resource = getInstance().resource.asBuilder().wipeOut().build();
      return this;
    }
```

### DataFlowIssue
Method invocation `getType` may produce `NullPointerException`
in `core/src/main/java/google/registry/tools/UpdateRegistrarCommand.java`
#### Snippet
```java
    boolean isRealRegistrar =
        Registrar.Type.REAL.equals(registrarType)
            || (Registrar.Type.REAL.equals(oldRegistrar.getType()) && registrarType == null);
    if (RegistryEnvironment.PRODUCTION.equals(RegistryEnvironment.get()) && isRealRegistrar) {
      checkArgumentPresent(
```

### DataFlowIssue
Method invocation `getWhoisAbuseContact` may produce `NullPointerException`
in `core/src/main/java/google/registry/tools/UpdateRegistrarCommand.java`
#### Snippet
```java
    if (RegistryEnvironment.PRODUCTION.equals(RegistryEnvironment.get()) && isRealRegistrar) {
      checkArgumentPresent(
          oldRegistrar.getWhoisAbuseContact(),
          "Cannot modify allowed TLDs if there is no WHOIS abuse contact set. Please use the"
              + " \"nomulus registrar_contact\" command on this registrar to set a WHOIS abuse"
```

### DataFlowIssue
Argument `oldRegistry` might be null
in `core/src/main/java/google/registry/tools/CreateOrUpdateTldCommand.java`
#### Snippet
```java
      }

      ImmutableSet<String> newReservedListNames = getReservedLists(oldRegistry);
      checkReservedListValidityForTld(tld, newReservedListNames);
      builder.setReservedListsByName(newReservedListNames);
```

### DataFlowIssue
Method invocation `toFile` may produce `NullPointerException`
in `core/src/main/java/google/registry/tools/GhostrydeCommand.java`
#### Snippet
```java

  private void runEncrypt() throws IOException {
    boolean isOutputToDir = output.toFile().isDirectory();
    Path outFile = isOutputToDir ? output.resolve(input.getFileName() + ".ghostryde") : output;
    Path lenOutFile = isOutputToDir ? output.resolve(input.getFileName() + ".length") : null;
```

### DataFlowIssue
Method invocation `getName` may produce `NullPointerException`
in `core/src/main/java/google/registry/tools/DeletePremiumListCommand.java`
#### Snippet
```java
  @Override
  protected String prompt() {
    return "You are about to delete the premium list: \n" + premiumList.getName();
  }

```

### DataFlowIssue
Argument `premiumList` might be null
in `core/src/main/java/google/registry/tools/DeletePremiumListCommand.java`
#### Snippet
```java
  @Override
  protected String execute() {
    PremiumListDao.delete(premiumList);
    return String.format("Deleted premium list '%s'.\n", premiumList.getName());
  }
```

### DataFlowIssue
The call to 'checkArgument' always fails, according to its method contracts
in `core/src/main/java/google/registry/tools/UpdateTldCommand.java`
#### Snippet
```java

  private static void checkNotBoth(String nameA, Object valueA, String nameB, Object valueB) {
    checkArgument(valueA == null || valueB == null, "Don't pass both --%s and --%s", nameA, nameB);
  }
}
```

### DataFlowIssue
Argument `reservedListNames` might be null
in `core/src/main/java/google/registry/tools/UpdateTldCommand.java`
#### Snippet
```java
            || setCurrentTldState == null,
        "--set_current_tld_state is not safe to use in production.");
    checkConflicts("reserved_lists", reservedListNames, reservedListsAdd, reservedListsRemove);
    checkConflicts(
        "allowed_registrants", allowedRegistrants, allowedRegistrantsAdd, allowedRegistrantsRemove);
```

### DataFlowIssue
Argument `reservedListsAdd` might be null
in `core/src/main/java/google/registry/tools/UpdateTldCommand.java`
#### Snippet
```java
            || setCurrentTldState == null,
        "--set_current_tld_state is not safe to use in production.");
    checkConflicts("reserved_lists", reservedListNames, reservedListsAdd, reservedListsRemove);
    checkConflicts(
        "allowed_registrants", allowedRegistrants, allowedRegistrantsAdd, allowedRegistrantsRemove);
```

### DataFlowIssue
Argument `reservedListsRemove` might be null
in `core/src/main/java/google/registry/tools/UpdateTldCommand.java`
#### Snippet
```java
            || setCurrentTldState == null,
        "--set_current_tld_state is not safe to use in production.");
    checkConflicts("reserved_lists", reservedListNames, reservedListsAdd, reservedListsRemove);
    checkConflicts(
        "allowed_registrants", allowedRegistrants, allowedRegistrantsAdd, allowedRegistrantsRemove);
```

### DataFlowIssue
Argument `allowedRegistrants` might be null
in `core/src/main/java/google/registry/tools/UpdateTldCommand.java`
#### Snippet
```java
    checkConflicts("reserved_lists", reservedListNames, reservedListsAdd, reservedListsRemove);
    checkConflicts(
        "allowed_registrants", allowedRegistrants, allowedRegistrantsAdd, allowedRegistrantsRemove);
    checkConflicts(
        "allowed_nameservers", allowedNameservers, allowedNameserversAdd, allowedNameserversRemove);
```

### DataFlowIssue
Argument `allowedRegistrantsAdd` might be null
in `core/src/main/java/google/registry/tools/UpdateTldCommand.java`
#### Snippet
```java
    checkConflicts("reserved_lists", reservedListNames, reservedListsAdd, reservedListsRemove);
    checkConflicts(
        "allowed_registrants", allowedRegistrants, allowedRegistrantsAdd, allowedRegistrantsRemove);
    checkConflicts(
        "allowed_nameservers", allowedNameservers, allowedNameserversAdd, allowedNameserversRemove);
```

### DataFlowIssue
Argument `allowedRegistrantsRemove` might be null
in `core/src/main/java/google/registry/tools/UpdateTldCommand.java`
#### Snippet
```java
    checkConflicts("reserved_lists", reservedListNames, reservedListsAdd, reservedListsRemove);
    checkConflicts(
        "allowed_registrants", allowedRegistrants, allowedRegistrantsAdd, allowedRegistrantsRemove);
    checkConflicts(
        "allowed_nameservers", allowedNameservers, allowedNameserversAdd, allowedNameserversRemove);
```

### DataFlowIssue
Argument `allowedNameservers` might be null
in `core/src/main/java/google/registry/tools/UpdateTldCommand.java`
#### Snippet
```java
        "allowed_registrants", allowedRegistrants, allowedRegistrantsAdd, allowedRegistrantsRemove);
    checkConflicts(
        "allowed_nameservers", allowedNameservers, allowedNameserversAdd, allowedNameserversRemove);
    checkArgument(setCurrentTldState == null || tldStateTransitions.isEmpty(),
        "Don't pass both --set_current_tld_state and --tld_state_transitions");
```

### DataFlowIssue
Argument `allowedNameserversAdd` might be null
in `core/src/main/java/google/registry/tools/UpdateTldCommand.java`
#### Snippet
```java
        "allowed_registrants", allowedRegistrants, allowedRegistrantsAdd, allowedRegistrantsRemove);
    checkConflicts(
        "allowed_nameservers", allowedNameservers, allowedNameserversAdd, allowedNameserversRemove);
    checkArgument(setCurrentTldState == null || tldStateTransitions.isEmpty(),
        "Don't pass both --set_current_tld_state and --tld_state_transitions");
```

### DataFlowIssue
Argument `allowedNameserversRemove` might be null
in `core/src/main/java/google/registry/tools/UpdateTldCommand.java`
#### Snippet
```java
        "allowed_registrants", allowedRegistrants, allowedRegistrantsAdd, allowedRegistrantsRemove);
    checkConflicts(
        "allowed_nameservers", allowedNameservers, allowedNameserversAdd, allowedNameserversRemove);
    checkArgument(setCurrentTldState == null || tldStateTransitions.isEmpty(),
        "Don't pass both --set_current_tld_state and --tld_state_transitions");
```

### DataFlowIssue
Argument `allowedRegistrants` might be null
in `core/src/main/java/google/registry/tools/UpdateTldCommand.java`
#### Snippet
```java
        "allowed registrants",
        oldRegistry.getAllowedRegistrantContactIds(),
        allowedRegistrants,
        allowedRegistrantsAdd,
        allowedRegistrantsRemove);
```

### DataFlowIssue
Argument `allowedRegistrantsAdd` might be null
in `core/src/main/java/google/registry/tools/UpdateTldCommand.java`
#### Snippet
```java
        oldRegistry.getAllowedRegistrantContactIds(),
        allowedRegistrants,
        allowedRegistrantsAdd,
        allowedRegistrantsRemove);
  }
```

### DataFlowIssue
Argument `allowedRegistrantsRemove` might be null
in `core/src/main/java/google/registry/tools/UpdateTldCommand.java`
#### Snippet
```java
        allowedRegistrants,
        allowedRegistrantsAdd,
        allowedRegistrantsRemove);
  }

```

### DataFlowIssue
Argument `allowedNameservers` might be null
in `core/src/main/java/google/registry/tools/UpdateTldCommand.java`
#### Snippet
```java
        "allowed nameservers",
        oldRegistry.getAllowedFullyQualifiedHostNames(),
        allowedNameservers,
        allowedNameserversAdd,
        allowedNameserversRemove);
```

### DataFlowIssue
Argument `allowedNameserversAdd` might be null
in `core/src/main/java/google/registry/tools/UpdateTldCommand.java`
#### Snippet
```java
        oldRegistry.getAllowedFullyQualifiedHostNames(),
        allowedNameservers,
        allowedNameserversAdd,
        allowedNameserversRemove);
  }
```

### DataFlowIssue
Argument `allowedNameserversRemove` might be null
in `core/src/main/java/google/registry/tools/UpdateTldCommand.java`
#### Snippet
```java
        allowedNameservers,
        allowedNameserversAdd,
        allowedNameserversRemove);
  }

```

### DataFlowIssue
Argument `reservedListNames` might be null
in `core/src/main/java/google/registry/tools/UpdateTldCommand.java`
#### Snippet
```java
        "reserved lists",
        oldRegistry.getReservedListNames(),
        reservedListNames,
        reservedListsAdd,
        reservedListsRemove);
```

### DataFlowIssue
Argument `reservedListsAdd` might be null
in `core/src/main/java/google/registry/tools/UpdateTldCommand.java`
#### Snippet
```java
        oldRegistry.getReservedListNames(),
        reservedListNames,
        reservedListsAdd,
        reservedListsRemove);
  }
```

### DataFlowIssue
Argument `reservedListsRemove` might be null
in `core/src/main/java/google/registry/tools/UpdateTldCommand.java`
#### Snippet
```java
        reservedListNames,
        reservedListsAdd,
        reservedListsRemove);
  }

```

### DataFlowIssue
Method invocation `toString` may produce `NullPointerException`
in `core/src/main/java/google/registry/tools/GetAllocationTokenCommand.java`
#### Snippet
```java
      if (loadedTokens.containsKey(token)) {
        AllocationToken loadedToken = loadedTokens.get(token);
        System.out.println(loadedToken.toString());
        if (!loadedToken.getRedemptionHistoryId().isPresent()) {
          System.out.printf("Token %s was not redeemed.\n", token);
```

### DataFlowIssue
Argument `oldEntity` might be null
in `core/src/main/java/google/registry/tools/MutatingCommand.java`
#### Snippet
```java
  protected void stageEntityChange(
      @Nullable ImmutableObject oldEntity, @Nullable ImmutableObject newEntity) {
    EntityChange change = new EntityChange(oldEntity, newEntity);
    checkArgument(
        !changedEntitiesMap.containsKey(change.vKey),
```

### DataFlowIssue
Argument `newEntity` might be null
in `core/src/main/java/google/registry/tools/MutatingCommand.java`
#### Snippet
```java
  protected void stageEntityChange(
      @Nullable ImmutableObject oldEntity, @Nullable ImmutableObject newEntity) {
    EntityChange change = new EntityChange(oldEntity, newEntity);
    checkArgument(
        !changedEntitiesMap.containsKey(change.vKey),
```

### DataFlowIssue
Argument `name` might be null
in `core/src/main/java/google/registry/tools/CreateOrUpdatePremiumListCommand.java`
#### Snippet
```java
    try {
      logger.atInfo().log("Saving premium list for TLD %s.", name);
      PremiumListDao.save(name, currency, inputData);
      logger.atInfo().log(message);
    } catch (Throwable e) {
```

### DataFlowIssue
Method invocation `getHostName` may produce `NullPointerException`
in `core/src/main/java/google/registry/tools/server/GenerateZoneFilesAction.java`
#### Snippet
```java
              dnsDefaultNsTtl.getStandardSeconds(),
              // Load the nameservers at the export time in case they've been renamed or deleted.
              loadAtPointInTime(nameserver, exportTime).getHostName()));
    }
    for (DomainDsData dsData : domain.getDsData()) {
```

### DataFlowIssue
Argument `a` might be null
in `core/src/main/java/google/registry/keyring/api/ComparatorKeyring.java`
#### Snippet
```java
    Class<?> clazz = method.getReturnType();
    if (PGPPublicKey.class.equals(clazz)) {
      return stringify((PGPPublicKey) a);
    }
    if (PGPPrivateKey.class.equals(clazz)) {
```

### DataFlowIssue
Argument `a` might be null
in `core/src/main/java/google/registry/keyring/api/ComparatorKeyring.java`
#### Snippet
```java
    }
    if (PGPPrivateKey.class.equals(clazz)) {
      return stringify((PGPPrivateKey) a);
    }
    if (PGPKeyPair.class.equals(clazz)) {
```

### DataFlowIssue
Argument `a` might be null
in `core/src/main/java/google/registry/keyring/api/ComparatorKeyring.java`
#### Snippet
```java
    }
    if (PGPKeyPair.class.equals(clazz)) {
      return stringify((PGPKeyPair) a);
    }
    return super.stringifyResult(method, a);
```

### DataFlowIssue
Passing `null` argument to parameter annotated as @NotNull
in `core/src/main/java/google/registry/request/HttpException.java`
#### Snippet
```java
  public static final class ServiceUnavailableException extends HttpException {
    public ServiceUnavailableException(String message) {
      super(HttpServletResponse.SC_SERVICE_UNAVAILABLE, message, null);
    }

```

### DataFlowIssue
Passing `null` argument to parameter annotated as @NotNull
in `core/src/main/java/google/registry/request/HttpException.java`
#### Snippet
```java
  public static final class ConflictException extends HttpException {
    public ConflictException(String message) {
      super(HttpServletResponse.SC_CONFLICT, message, null);
    }

```

### DataFlowIssue
Passing `null` argument to parameter annotated as @NotNull
in `core/src/main/java/google/registry/request/HttpException.java`
#### Snippet
```java
  public static final class ForbiddenException extends HttpException {
    public ForbiddenException(String message) {
      super(HttpServletResponse.SC_FORBIDDEN, message, null);
    }

```

### DataFlowIssue
Passing `null` argument to parameter annotated as @NotNull
in `core/src/main/java/google/registry/request/HttpException.java`
#### Snippet
```java
  public static final class InternalServerErrorException extends HttpException {
    public InternalServerErrorException(String message) {
      super(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, message, null, Level.SEVERE);
    }

```

### DataFlowIssue
Passing `null` argument to parameter annotated as @NotNull
in `core/src/main/java/google/registry/request/HttpException.java`
#### Snippet
```java
  public static final class UnprocessableEntityException extends HttpException {
    public UnprocessableEntityException(String message) {
      super(SC_UNPROCESSABLE_ENTITY, message, null);
    }

```

### DataFlowIssue
Passing `null` argument to parameter annotated as @NotNull
in `core/src/main/java/google/registry/request/HttpException.java`
#### Snippet
```java

    public NotFoundException(String message) {
      super(HttpServletResponse.SC_NOT_FOUND, message, null);
    }

```

### DataFlowIssue
Passing `null` argument to parameter annotated as @NotNull
in `core/src/main/java/google/registry/request/HttpException.java`
#### Snippet
```java
  public static final class UnsupportedMediaTypeException extends HttpException {
    public UnsupportedMediaTypeException(String message) {
      super(HttpServletResponse.SC_UNSUPPORTED_MEDIA_TYPE, message, null);
    }

```

### DataFlowIssue
Passing `null` argument to parameter annotated as @NotNull
in `core/src/main/java/google/registry/request/HttpException.java`
#### Snippet
```java
  public static final class NotImplementedException extends HttpException {
    public NotImplementedException(String message) {
      super(HttpServletResponse.SC_NOT_IMPLEMENTED, message, null);
    }

```

### DataFlowIssue
Passing `null` argument to parameter annotated as @NotNull
in `core/src/main/java/google/registry/request/HttpException.java`
#### Snippet
```java

    public NotModifiedException(String message) {
      super(HttpServletResponse.SC_NOT_MODIFIED, message, null);
    }

```

### DataFlowIssue
Passing `null` argument to parameter annotated as @NotNull
in `core/src/main/java/google/registry/request/HttpException.java`
#### Snippet
```java
  public static final class NoContentException extends HttpException {
    public NoContentException(String message) {
      super(HttpServletResponse.SC_NO_CONTENT, message, null);
    }

```

### DataFlowIssue
Passing `null` argument to parameter annotated as @NotNull
in `core/src/main/java/google/registry/request/HttpException.java`
#### Snippet
```java
  public static final class MethodNotAllowedException extends HttpException {
    public MethodNotAllowedException() {
      super(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "Method not allowed", null);
    }

```

### DataFlowIssue
Passing `null` argument to parameter annotated as @NotNull
in `core/src/main/java/google/registry/request/HttpException.java`
#### Snippet
```java
  public static final class BadRequestException extends HttpException {
    public BadRequestException(String message) {
      this(message, null);
    }

```

### DataFlowIssue
Method invocation `getEmail` may produce `NullPointerException`
in `core/src/main/java/google/registry/security/XsrfTokenManager.java`
#### Snippet
```java
    }
    String currentUserEmail =
        userService.isUserLoggedIn() ? userService.getCurrentUser().getEmail() : "";

    // Reconstruct the token to verify validity.
```

### DataFlowIssue
Unboxing of `AppEngineTimeLimiter.create() .callWithTimeout( new LockingCallable(callable...` may produce `NullPointerException`
in `core/src/main/java/google/registry/request/lock/LockHandlerImpl.java`
#### Snippet
```java
    String sanitizedTld = Strings.emptyToNull(tld);
    try {
      return AppEngineTimeLimiter.create()
          .callWithTimeout(
              new LockingCallable(callable, lockAcquirer, sanitizedTld, leaseLength, lockNames),
              leaseLength.minus(LOCK_TIMEOUT_FUDGE).getMillis(),
              TimeUnit.MILLISECONDS);
    } catch (ExecutionException | UncheckedExecutionException e) {
      // Unwrap the execution exception and throw its root cause.
```

### DataFlowIssue
Passing `null` argument to parameter annotated as @NotNull
in `core/src/main/java/google/registry/reporting/icann/IcannReportingStagingAction.java`
#### Snippet
```java
                    IcannReportingUploadAction.PATH,
                    Service.BACKEND.toString(),
                    null,
                    Duration.standardMinutes(2)));
            return null;
```

### DataFlowIssue
Argument `currentMatchesByEmail.get(email)` might be null
in `core/src/main/java/google/registry/reporting/spec11/PublishSpec11ReportAction.java`
#### Snippet
```java
      Set<ThreatMatch> difference =
          Sets.difference(
              currentMatchesByEmail.get(email),
              previousMatchesByEmail.getOrDefault(email, ImmutableSet.of()));
      if (!difference.isEmpty()) {
```

### DataFlowIssue
Argument `previousMatchesByEmail.getOrDefault(email, ImmutableSet.of())` might be null
in `core/src/main/java/google/registry/reporting/spec11/PublishSpec11ReportAction.java`
#### Snippet
```java
          Sets.difference(
              currentMatchesByEmail.get(email),
              previousMatchesByEmail.getOrDefault(email, ImmutableSet.of()));
      if (!difference.isEmpty()) {
        resultsBuilder.add(RegistrarThreatMatches.create(email, ImmutableList.copyOf(difference)));
```

### DataFlowIssue
Argument `kvs.get(LOOKUP_KEY)` might be null
in `core/src/main/java/google/registry/persistence/VKey.java`
#### Snippet
```java
          String.format("\"%s\" missing from the string: %s", LOOKUP_KEY, keyString));
    }
    return VKey.create(classType, SerializeUtils.parse(Serializable.class, kvs.get(LOOKUP_KEY)));
  }

```

### DataFlowIssue
Argument `cloudSqlConfigs.get(Environment.URL)` might be null
in `core/src/main/java/google/registry/persistence/PersistenceModule.java`
#### Snippet
```java
    properties.put("socketFactory", cloudSqlConfigs.get(HIKARI_DS_SOCKET_FACTORY));
    try {
      return DriverManager.getConnection(cloudSqlConfigs.get(Environment.URL), properties);
    } catch (SQLException e) {
      throw new RuntimeException(e);
```

### DataFlowIssue
Method invocation `append` may produce `NullPointerException`
in `core/src/nonprod/java/google/registry/tools/GenerateSqlErDiagramCommand.java`
#### Snippet
```java
      doc.select("body > table > tbody")
          .first()
          .append(
              "<tr>"
                  + "<td class=\"property_name\">last flyway file</td>"
```

### DataFlowIssue
Method invocation `append` may produce `NullPointerException`
in `core/src/nonprod/java/google/registry/tools/GenerateSqlErDiagramCommand.java`
#### Snippet
```java
              .append(ResourceUtils.readResourceUtf8(Resources.getResource(SVG_PAN_ZOOM_LIB)))
              .append("</script>");
      doc.select("head").first().append(svgPanZoomLib.toString());
      doc.select("svg")
          .first()
```

### DataFlowIssue
Method invocation `attributes` may produce `NullPointerException`
in `core/src/nonprod/java/google/registry/tools/GenerateSqlErDiagramCommand.java`
#### Snippet
```java
      doc.select("svg")
          .first()
          .attributes()
          .add("id", "erDiagram")
          .add("style", "overflow: hidden; width: 100%; height: 800px");
```

### DataFlowIssue
Method invocation `append` may produce `NullPointerException`
in `core/src/nonprod/java/google/registry/tools/GenerateSqlErDiagramCommand.java`
#### Snippet
```java
      doc.select("body")
          .first()
          .append(
              "<script>"
                  + "svgPanZoom('#erDiagram', {"
```

### DataFlowIssue
Argument `pair.a` might be null
in `util/src/main/java/google/registry/util/DiffUtils.java`
#### Snippet
```java
          && ((DiffPair) value).b instanceof Set) {
        DiffPair pair = ((DiffPair) value);
        String prettyLineDiff = prettyPrintSetDiff((Set<?>) pair.a, (Set<?>) pair.b) + "\n";
        output = newPath + (prettyLineDiff.startsWith("\n") ? ":" : ": ") + prettyLineDiff;
      } else {
```

### DataFlowIssue
Argument `pair.b` might be null
in `util/src/main/java/google/registry/util/DiffUtils.java`
#### Snippet
```java
          && ((DiffPair) value).b instanceof Set) {
        DiffPair pair = ((DiffPair) value);
        String prettyLineDiff = prettyPrintSetDiff((Set<?>) pair.a, (Set<?>) pair.b) + "\n";
        output = newPath + (prettyLineDiff.startsWith("\n") ? ":" : ": ") + prettyLineDiff;
      } else {
```

### DataFlowIssue
Argument `detach(results.get(0))` might be null
in `core/src/main/java/google/registry/persistence/transaction/JpaTransactionManagerImpl.java`
#### Snippet
```java
    public Optional<T> first() {
      List<T> results = buildQuery().setMaxResults(1).getResultList();
      return results.size() > 0 ? Optional.of(detach(results.get(0))) : Optional.empty();
    }

```

### DataFlowIssue
Method invocation `isPresent` may produce `NullPointerException`
in `util/src/main/java/google/registry/util/PreconditionsUtils.java`
#### Snippet
```java
  public static <T> T checkArgumentPresent(@Nullable Optional<T> reference) {
    checkArgumentNotNull(reference);
    checkArgument(reference.isPresent());
    return reference.get();
  }
```

### DataFlowIssue
Method invocation `isPresent` may produce `NullPointerException`
in `util/src/main/java/google/registry/util/PreconditionsUtils.java`
#### Snippet
```java
      @Nullable Optional<T> reference, @Nullable Object errorMessage) {
    checkArgumentNotNull(reference, errorMessage);
    checkArgument(reference.isPresent(), errorMessage);
    return reference.get();
  }
```

### DataFlowIssue
Method invocation `isPresent` may produce `NullPointerException`
in `util/src/main/java/google/registry/util/PreconditionsUtils.java`
#### Snippet
```java
      @Nullable Object... errorMessageArgs) {
    checkArgumentNotNull(reference, errorMessageTemplate, errorMessageArgs);
    checkArgument(reference.isPresent(), errorMessageTemplate, errorMessageArgs);
    return reference.get();
  }
```

### DataFlowIssue
Variable is already assigned to this value
in `util/src/main/java/google/registry/util/YamlUtils.java`
#### Snippet
```java
    Optional<Map<String, Object>> customMap = loadAsMap(yaml, customYaml);
    if (customMap.isPresent()) {
      yamlMap = mergeMaps(yamlMap, customMap.get());
      logger.atFine().log("Successfully loaded environment configuration YAML file.");
    } else {
```

### DataFlowIssue
Method invocation `handlerProviders` may produce `NullPointerException`
in `proxy/src/main/java/google/registry/proxy/ProxyServer.java`
#### Snippet
```java
                      protected void initChannel(NioSocketChannel outboundChannel) {
                        addHandlers(
                            outboundChannel.pipeline(), outboundProtocol.handlerProviders());
                      }
                    })
```

### DataFlowIssue
Argument `outboundProtocol` might be null
in `proxy/src/main/java/google/registry/proxy/ProxyServer.java`
#### Snippet
```java
                .attr(PROTOCOL_KEY, outboundProtocol);

        connectOutboundChannel(bootstrap, inboundProtocol, outboundProtocol, inboundChannel);
        // If the inbound connection is closed, close its outbound relay connection as well. There
        // is no way to recover from an inbound connection termination, as the connection can only
```

### DataFlowIssue
Unboxing of `hasCommandCache.get(cmd)` may produce `NullPointerException`
in `common/src/testing/java/google/registry/testing/SystemInfo.java`
#### Snippet
```java
   */
  public static boolean hasCommand(String cmd) throws ExecutionException {
    return hasCommandCache.get(cmd);
  }

```

## RuleId[ruleID=MissingSerialAnnotation]
### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `common/src/testing/java/google/registry/testing/FakeSleeper.java`
#### Snippet
```java
public final class FakeSleeper implements Sleeper, Serializable {

  private static final long serialVersionUID = -8975804222581077291L;

  private final FakeClock clock;
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `common/src/testing/java/google/registry/testing/FakeClock.java`
#### Snippet
```java
public final class FakeClock implements Clock {

  private static final long serialVersionUID = 675054721685304599L;

  // Clock isn't a thread synchronization primitive, but tests involving
```

## RuleId[ruleID=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
Can be replaced with 'String.join'
in `core/src/main/java/google/registry/tools/GenerateEscrowDepositCommand.java`
#### Snippet
```java
            .put(PARAM_DIRECTORY, outdir)
            .put(PARAM_LENIENT, Boolean.toString(lenient))
            .put(PARAM_TLDS, tlds.stream().collect(Collectors.joining(",")))
            .put(
                PARAM_WATERMARKS,
```

### SimplifyStreamApiCallChains
Can be replaced with 'String.join'
in `core/src/main/java/google/registry/tools/ShellCommand.java`
#### Snippet
```java
                  .map(Object::toString)
                  .collect(toImmutableList());
          type = options.stream().collect(Collectors.joining(", "));
        }
        if (type.startsWith("class ")) {
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `util/src/main/java/google/registry/util/TaskQueueUtils.java`
#### Snippet
```java
    Lists.partition(tasks, BATCH_SIZE)
        .stream()
        .forEach(
            batch ->
                retrier.callWithRetry(
```

## RuleId[ruleID=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'DefaultCredential' is still used
in `core/src/main/java/google/registry/config/CredentialModule.java`
#### Snippet
```java
  @Retention(RetentionPolicy.RUNTIME)
  @Deprecated // Switching to @ApplicationDefaultCredential
  public @interface DefaultCredential {}

  /** Dagger qualifier for the credential for Google Workspace APIs. */
```

### DeprecatedIsStillUsed
Deprecated member 'TaskQueueUtils' is still used
in `util/src/main/java/google/registry/util/TaskQueueUtils.java`
#### Snippet
```java
 */
@Deprecated
public class TaskQueueUtils implements Serializable {

  private static final long serialVersionUID = 7893211200220508362L;
```

## RuleId[ruleID=OptionalContainsCollection]
### OptionalContainsCollection
'Optional' contains collection `List`>
in `core/src/main/java/google/registry/ui/server/RegistrarFormFields.java`
#### Snippet
```java
      return ImmutableList.of();
    }
    Optional<List<Map<String, ?>>> contactsAsMaps = CONTACTS_AS_MAPS.extractUntyped(args);
    if (!contactsAsMaps.isPresent()) {
      return ImmutableList.of();
```

### OptionalContainsCollection
'Optional' contains collection `ImmutableSet`
in `core/src/main/java/google/registry/rdap/AbstractJsonableObject.java`
#### Snippet
```java
   */
  static void verifyAllowedJsonKeyName(String name, @Nullable Member member, Class<?> clazz) {
    Optional<ImmutableSet<String>> allowedFieldNames = getNameRestriction(clazz);
    if (!allowedFieldNames.isPresent()) {
      return;
```

### OptionalContainsCollection
'Optional' contains collection `ImmutableSet`
in `core/src/main/java/google/registry/rdap/AbstractJsonableObject.java`
#### Snippet
```java
   * the class is an element in a array with this name.
   */
  static Optional<ImmutableSet<String>> getNameRestriction(Class<?> clazz) {
    // Find the first superclass that has an RestrictJsonNames annotation.
    //
```

### OptionalContainsCollection
'Optional' contains collection `Map`
in `util/src/main/java/google/registry/util/YamlUtils.java`
#### Snippet
```java
   */
  @SuppressWarnings("unchecked")
  private static Optional<Map<String, Object>> loadAsMap(Yaml yaml, String yamlString) {
    return Optional.ofNullable((Map<String, Object>) yaml.load(yamlString));
  }
```

### OptionalContainsCollection
'Optional' contains collection `Map`
in `util/src/main/java/google/registry/util/YamlUtils.java`
#### Snippet
```java
    Yaml yaml = new Yaml();
    Map<String, Object> yamlMap = loadAsMap(yaml, defaultYaml).get();
    Optional<Map<String, Object>> customMap = loadAsMap(yaml, customYaml);
    if (customMap.isPresent()) {
      yamlMap = mergeMaps(yamlMap, customMap.get());
```

## RuleId[ruleID=Convert2MethodRef]
### Convert2MethodRef
Lambda can be replaced with method reference
in `core/src/main/java/google/registry/ui/server/registrar/ConsoleUiAction.java`
#### Snippet
```java
  public void runAfterLogin(HashMap<String, Object> data) {
    SoyMapData soyMapData = new SoyMapData();
    data.forEach((key, value) -> soyMapData.put(key, value));

    soyMapData.put("integrationEmail", integrationEmail);
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `core/src/main/java/google/registry/flows/certs/CertificateChecker.java`
#### Snippet
```java
      String displayMessages =
          violations.stream()
              .map(violation -> getViolationDisplayMessage(violation))
              .collect(Collectors.joining("\n"));
      throw new InsecureCertificateException(violations, displayMessages);
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `core/src/main/java/google/registry/tools/SetNumInstancesCommand.java`
#### Snippet
```java
                        .stream()
                        .filter(version -> version.getManualScaling() != null)
                        .map(version -> version.getId());
                  } catch (IOException e) {
                    throw new RuntimeException(e);
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `core/src/main/java/google/registry/tools/ListCursorsCommand.java`
#### Snippet
```java
                .filter(r -> !filterEscrowEnabled || r.getEscrowEnabled())
                .collect(
                    toImmutableMap(r -> r.getTldStr(), r -> Cursor.createScopedVKey(cursorType, r)))
            : ImmutableMap.of(cursorType.name(), Cursor.createGlobalVKey(cursorType));
    ImmutableMap<VKey<? extends Cursor>, Cursor> cursors =
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `core/src/main/java/google/registry/privileges/secretmanager/SecretManagerModule.java`
#### Snippet
```java
    try {
      return SecretManagerServiceSettings.newBuilder()
          .setCredentialsProvider(() -> credentialsBundle.getGoogleCredentials())
          .build();
    } catch (IOException e) {
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `util/src/main/java/google/registry/util/SendEmailService.java`
#### Snippet
```java
                  " , ",
                  emailMessage.recipients().stream()
                      .map(ia -> ia.toString())
                      .collect(toImmutableSet()))));
    } else {
```

## RuleId[ruleID=NonSerializableFieldInSerializableClass]
### NonSerializableFieldInSerializableClass
Non-serializable field 'output' in a Serializable class
in `core/src/main/java/google/registry/flows/FlowRunner.java`
#### Snippet
```java
  /** Exception for canceling a transaction while capturing what the output would have been. */
  private static class DryRunException extends RuntimeException {
    final EppOutput output;

    DryRunException(EppOutput output) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'result' in a Serializable class
in `core/src/main/java/google/registry/flows/EppException.java`
#### Snippet
```java
public abstract class EppException extends Exception {

  private final Result result;

  /** Create an EppException with a custom message. */
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'eppInputFilter' in a Serializable class
in `core/src/main/java/google/registry/model/OteStats.java`
#### Snippet
```java
    /** Optional filter on the EppInput. */
    @SuppressWarnings("ImmutableEnumChecker") // Predicates are immutable.
    private final Optional<Predicate<EppInput>> eppInputFilter;

    StatType(int requirement, Predicate<HistoryEntry.Type> typeFilter) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'userRoles' in a Serializable class
in `core/src/main/java/google/registry/model/console/User.java`
#### Snippet
```java
  /** Roles (which grant permissions) associated with this user. */
  @Column(nullable = false)
  private UserRoles userRoles;

  /**
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'requestHandler' in a Serializable class
in `core/src/main/java/google/registry/module/ServletBase.java`
#### Snippet
```java
public class ServletBase extends HttpServlet {

  private final RequestHandler<?> requestHandler;
  private final Lazy<MetricReporter> metricReporter;
  private static final FluentLogger logger = FluentLogger.forEnclosingClass();
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'table' in a Serializable class
in `core/src/main/java/google/registry/tldconfig/idn/IdnTableEnum.java`
#### Snippet
```java
  JA;

  private final IdnTable table;

  IdnTableEnum() {
```

## RuleId[ruleID=RedundantEscapeInRegexReplacement]
### RedundantEscapeInRegexReplacement
Redundant escape of '/'
in `docs/src/main/java/google/registry/documentation/FlowDocumentation.java`
#### Snippet
```java
          String.format(
              "%s/%s.java",
              JavadocWrapper.SOURCE_PATH, getQualifiedName().replaceAll("\\.", "\\/"));
      String unusedClassFileContent;
      try {
```

## RuleId[ruleID=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `core/src/main/java/google/registry/xjc/XjcObject.java`
#### Snippet
```java
      return out.toString();
    } catch (XmlException e) {
      return String.format("<!-- Invalid XML: %s -->", e.toString());
    }
  }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `core/src/main/java/google/registry/batch/SendExpiringCertificateNotificationEmailAction.java`
#### Snippet
```java
                            "Unsupported certificate type: %s being passed in when updating "
                                + "the last notification sent date to registrar %s.",
                            certificateType.toString(), registrar.getRegistrarName()));
                }
              });
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `core/src/main/java/google/registry/keyring/api/ComparatorKeyring.java`
#### Snippet
```java
    PrintWriter printWriter = new PrintWriter(stringWriter);
    throwable.printStackTrace(printWriter);
    return String.format("%s\nStack trace:\n%s", throwable.toString(), stringWriter.toString());
  }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `core/src/main/java/google/registry/keyring/api/ComparatorKeyring.java`
#### Snippet
```java
    PrintWriter printWriter = new PrintWriter(stringWriter);
    throwable.printStackTrace(printWriter);
    return String.format("%s\nStack trace:\n%s", throwable.toString(), stringWriter.toString());
  }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `core/src/main/java/google/registry/reporting/icann/IcannReportingStagingAction.java`
#### Snippet
```java
          String.format(
              "Staging failed due to %s",
              getRootCause(e).toString()));
      throw new RuntimeException("Staging action failed.", e);
    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `docs/src/main/java/google/registry/documentation/FlowDocumentation.java`
#### Snippet
```java
          String.format(
              "expected one @link tag in tag text but found %s: %s",
              (e instanceof NoSuchElementException ? "none" : "multiple"), tagTree.toString()),
          typeElement,
          tagTree,
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `docs/src/main/java/google/registry/documentation/FlowDocumentation.java`
#### Snippet
```java
    if (referencedTypeElement == null) {
      throw new BadErrorTagFormatException(
          "could not resolve class from @link tag text: " + linkedTag.toString(),
          typeElement,
          tagTree);
```

## RuleId[ruleID=SetReplaceableByEnumSet]
### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `core/src/main/java/google/registry/flows/domain/DomainFlowUtils.java`
#### Snippet
```java
    }

    Set<Type> roles = new HashSet<>();
    for (DesignatedContact contact : contacts) {
      roles.add(contact.getType());
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `core/src/main/java/google/registry/model/domain/DomainBase.java`
#### Snippet
```java
   */
  public ImmutableSet<GracePeriodStatus> getGracePeriodStatuses() {
    Set<GracePeriodStatus> gracePeriodStatuses = new HashSet<>();
    for (GracePeriod gracePeriod : getGracePeriods()) {
      gracePeriodStatuses.add(gracePeriod.getType());
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `core/src/main/java/google/registry/model/domain/DomainBase.java`
#### Snippet
```java
      registrantContact = null;
    }
    HashSet<DesignatedContact.Type> contactsDiscovered = new HashSet<>();
    for (DesignatedContact contact : contacts) {
      checkArgument(
```

## RuleId[ruleID=StringEqualsEmptyString]
### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `core/src/main/java/google/registry/tools/CreateOrUpdateRegistrarCommand.java`
#### Snippet
```java
        // existing certificate without providing a replacement. An uploaded empty certificate file
        // will prevent the registrar from being able to establish EPP connections.
        if (!asciiCert.equals("")) {
          certificateChecker.validateCertificate(asciiCert);
        }
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `core/src/main/java/google/registry/tools/CreateOrUpdateRegistrarCommand.java`
#### Snippet
```java
        String asciiCert =
            new String(Files.readAllBytes(failoverClientCertificateFilename), US_ASCII);
        if (!asciiCert.equals("")) {
          certificateChecker.validateCertificate(asciiCert);
        }
```

## RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
### PublicFieldAccessedInSynchronizedContext
Non-private field `labelsToPrices` accessed in synchronized context
in `core/src/main/java/google/registry/model/tld/label/PremiumList.java`
#### Snippet
```java
   */
  public synchronized ImmutableMap<String, BigDecimal> getLabelsToPrices() {
    if (labelsToPrices == null) {
      labelsToPrices =
          PremiumListDao.loadAllPremiumEntries(name).stream()
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `labelsToPrices` accessed in synchronized context
in `core/src/main/java/google/registry/model/tld/label/PremiumList.java`
#### Snippet
```java
  public synchronized ImmutableMap<String, BigDecimal> getLabelsToPrices() {
    if (labelsToPrices == null) {
      labelsToPrices =
          PremiumListDao.loadAllPremiumEntries(name).stream()
              .collect(
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `name` accessed in synchronized context
in `core/src/main/java/google/registry/model/tld/label/PremiumList.java`
#### Snippet
```java
    if (labelsToPrices == null) {
      labelsToPrices =
          PremiumListDao.loadAllPremiumEntries(name).stream()
              .collect(
                  toImmutableMap(
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `labelsToPrices` accessed in synchronized context
in `core/src/main/java/google/registry/model/tld/label/PremiumList.java`
#### Snippet
```java
                      premiumEntry -> convertAmountToMoney(premiumEntry.getValue()).getAmount()));
    }
    return labelsToPrices;
  }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `reservedListMap` accessed in synchronized context
in `core/src/main/java/google/registry/model/tld/label/ReservedList.java`
#### Snippet
```java
   */
  public synchronized ImmutableMap<String, ReservedListEntry> getReservedListEntries() {
    if (reservedListMap == null) {
      reservedListMap =
          jpaTm()
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `reservedListMap` accessed in synchronized context
in `core/src/main/java/google/registry/model/tld/label/ReservedList.java`
#### Snippet
```java
  public synchronized ImmutableMap<String, ReservedListEntry> getReservedListEntries() {
    if (reservedListMap == null) {
      reservedListMap =
          jpaTm()
              .transact(
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `reservedListMap` accessed in synchronized context
in `core/src/main/java/google/registry/model/tld/label/ReservedList.java`
#### Snippet
```java
                          .collect(toImmutableMap(ReservedListEntry::getDomainLabel, e -> e)));
    }
    return ImmutableMap.copyOf(nullToEmpty(reservedListMap));
  }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `in` accessed in synchronized context
in `util/src/main/java/google/registry/util/ImprovedInputStream.java`
#### Snippet
```java
  @Override
  public synchronized void mark(int readlimit) {
    in.mark(readlimit);
    mark = count;
    // it's okay to mark even if mark isn't supported, as reset won't work
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `in` accessed in synchronized context
in `util/src/main/java/google/registry/util/ImprovedInputStream.java`
#### Snippet
```java
  @Override
  public synchronized void reset() throws IOException {
    if (!in.markSupported()) {
      throw new IOException("Mark not supported");
    }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `in` accessed in synchronized context
in `util/src/main/java/google/registry/util/ImprovedInputStream.java`
#### Snippet
```java
    }

    in.reset();
    count = mark;
  }
```

## RuleId[ruleID=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `core/src/main/java/google/registry/model/eppcommon/Address.java`
#### Snippet
```java
          "Street address must have [1-3] lines: %s",
          street);
      //noinspection ConstantConditions
      checkArgument(
          street.stream().noneMatch(String::isEmpty),
```

### RedundantSuppression
Redundant suppression
in `core/src/main/java/google/registry/tmch/TmchXmlSignature.java`
#### Snippet
```java
      DOMValidateContext context, XMLSignature signature)
          throws XMLSignatureException {
    @SuppressWarnings("unchecked")  // Safe by specification.
    List<Reference> references = signature.getSignedInfo().getReferences();
    StringBuilder builder = new StringBuilder();
    builder.append("Signature failed core validation\n");
```

### RedundantSuppression
Redundant suppression
in `core/src/main/java/google/registry/tools/ShellCommand.java`
#### Snippet
```java
    @Override
    @SuppressWarnings({"unchecked", "rawtypes"})
    public int complete(String buffer, int location, List completions) {
      // We just defer to the other function because of the warnings (the use of a naked List by
      // jline)
```

### RedundantSuppression
Redundant suppression
in `util/src/main/java/google/registry/util/CidrAddressBlock.java`
#### Snippet
```java
  @SuppressWarnings("deprecation")
  @Override
  public int hashCode() {
    return InetAddresses.coerceToInteger(ip);
  }
```

### RedundantSuppression
Redundant suppression
in `util/src/main/java/google/registry/util/PlaceholderEnvironment.java`
#### Snippet
```java
  @SuppressWarnings("deprecation")
  @Override
  public String getRequestNamespace() {
    throw new UnsupportedOperationException();
  }
```

## RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'optionalPassword'
in `core/src/main/java/google/registry/ui/server/registrar/ConsoleOteSetupAction.java`
#### Snippet
```java
  @Inject
  @Parameter("password")
  Optional<String> optionalPassword;

  @Inject
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'email'
in `core/src/main/java/google/registry/ui/server/registrar/ConsoleOteSetupAction.java`
#### Snippet
```java
  @Inject
  @Parameter("email")
  Optional<String> email;

  @Inject
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'clientId'
in `core/src/main/java/google/registry/ui/server/registrar/ConsoleOteSetupAction.java`
#### Snippet
```java
  @Inject
  @Parameter("clientId")
  Optional<String> clientId;

  @Inject
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'paramClientId'
in `core/src/main/java/google/registry/ui/server/registrar/ConsoleUiAction.java`
#### Snippet
```java
  @Inject
  @Parameter(PARAM_CLIENT_ID)
  Optional<String> paramClientId;

  @Inject
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'bcc'
in `core/src/main/java/google/registry/ui/server/SendEmailUtils.java`
#### Snippet
```java
      final String subject,
      String body,
      Optional<String> bcc,
      ImmutableList<String> additionalAddresses) {
    try {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'paramClientId'
in `core/src/main/java/google/registry/ui/server/registrar/RegistryLockGetAction.java`
#### Snippet
```java
  @VisibleForTesting AuthenticatedRegistrarAccessor registrarAccessor;
  @VisibleForTesting AuthResult authResult;
  @VisibleForTesting Optional<String> paramClientId;

  @Inject
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'paramClientId'
in `core/src/main/java/google/registry/ui/server/registrar/RegistryLockGetAction.java`
#### Snippet
```java
      AuthenticatedRegistrarAccessor registrarAccessor,
      AuthResult authResult,
      @Parameter(PARAM_CLIENT_ID) Optional<String> paramClientId) {
    this.method = method;
    this.response = response;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'rootUrl'
in `core/src/main/java/google/registry/dns/writer/clouddns/CloudDnsWriterModule.java`
#### Snippet
```java
      @DefaultCredential GoogleCredentialsBundle credentialsBundle,
      @Config("projectId") String projectId,
      @Config("cloudDnsRootUrl") Optional<String> rootUrl,
      @Config("cloudDnsServicePath") Optional<String> servicePath) {
    Dns.Builder builder =
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'servicePath'
in `core/src/main/java/google/registry/dns/writer/clouddns/CloudDnsWriterModule.java`
#### Snippet
```java
      @Config("projectId") String projectId,
      @Config("cloudDnsRootUrl") Optional<String> rootUrl,
      @Config("cloudDnsServicePath") Optional<String> servicePath) {
    Dns.Builder builder =
        new Dns.Builder(
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'optionalPasscode'
in `core/src/main/java/google/registry/ui/server/registrar/ConsoleRegistrarCreatorAction.java`
#### Snippet
```java

  @Inject @Parameter("password") Optional<String> optionalPassword;
  @Inject @Parameter("passcode") Optional<String> optionalPasscode;

  @Inject ConsoleRegistrarCreatorAction() {}
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'name'
in `core/src/main/java/google/registry/ui/server/registrar/ConsoleRegistrarCreatorAction.java`
#### Snippet
```java
  @Inject @Named("digitOnlyStringGenerator") StringGenerator passcodeGenerator;
  @Inject @Parameter("clientId") Optional<String> clientId;
  @Inject @Parameter("name") Optional<String> name;
  @Inject @Parameter("billingAccount") Optional<String> billingAccount;
  @Inject @Parameter("ianaId") Optional<Integer> ianaId;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'optionalZip'
in `core/src/main/java/google/registry/ui/server/registrar/ConsoleRegistrarCreatorAction.java`
#### Snippet
```java
  @Inject @Parameter("city") Optional<String> city;
  @Inject @Parameter("state") Optional<String> optionalState;
  @Inject @Parameter("zip") Optional<String> optionalZip;
  @Inject @Parameter("countryCode") Optional<String> countryCode;

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'optionalStreet3'
in `core/src/main/java/google/registry/ui/server/registrar/ConsoleRegistrarCreatorAction.java`
#### Snippet
```java
  @Inject @Parameter("street1") Optional<String> street1;
  @Inject @Parameter("street2") Optional<String> optionalStreet2;
  @Inject @Parameter("street3") Optional<String> optionalStreet3;
  @Inject @Parameter("city") Optional<String> city;
  @Inject @Parameter("state") Optional<String> optionalState;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'ianaId'
in `core/src/main/java/google/registry/ui/server/registrar/ConsoleRegistrarCreatorAction.java`
#### Snippet
```java
  @Inject @Parameter("name") Optional<String> name;
  @Inject @Parameter("billingAccount") Optional<String> billingAccount;
  @Inject @Parameter("ianaId") Optional<Integer> ianaId;
  @Inject @Parameter("referralEmail") Optional<String> referralEmail;
  @Inject @Parameter("driveId") Optional<String> driveId;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'value'
in `core/src/main/java/google/registry/ui/server/registrar/ConsoleRegistrarCreatorAction.java`
#### Snippet
```java
  }

  private String toEmailLine(Optional<?> value, String name) {
    return String.format("    %s: %s\n", name, value.orElse(null));
  }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'billingAccount'
in `core/src/main/java/google/registry/ui/server/registrar/ConsoleRegistrarCreatorAction.java`
#### Snippet
```java
  @Inject @Parameter("clientId") Optional<String> clientId;
  @Inject @Parameter("name") Optional<String> name;
  @Inject @Parameter("billingAccount") Optional<String> billingAccount;
  @Inject @Parameter("ianaId") Optional<Integer> ianaId;
  @Inject @Parameter("referralEmail") Optional<String> referralEmail;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'optionalPassword'
in `core/src/main/java/google/registry/ui/server/registrar/ConsoleRegistrarCreatorAction.java`
#### Snippet
```java
  @Inject @Parameter("countryCode") Optional<String> countryCode;

  @Inject @Parameter("password") Optional<String> optionalPassword;
  @Inject @Parameter("passcode") Optional<String> optionalPasscode;

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'countryCode'
in `core/src/main/java/google/registry/ui/server/registrar/ConsoleRegistrarCreatorAction.java`
#### Snippet
```java
  @Inject @Parameter("state") Optional<String> optionalState;
  @Inject @Parameter("zip") Optional<String> optionalZip;
  @Inject @Parameter("countryCode") Optional<String> countryCode;

  @Inject @Parameter("password") Optional<String> optionalPassword;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'street1'
in `core/src/main/java/google/registry/ui/server/registrar/ConsoleRegistrarCreatorAction.java`
#### Snippet
```java

  // Address fields, some of which are required and others are optional.
  @Inject @Parameter("street1") Optional<String> street1;
  @Inject @Parameter("street2") Optional<String> optionalStreet2;
  @Inject @Parameter("street3") Optional<String> optionalStreet3;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'clientId'
in `core/src/main/java/google/registry/ui/server/registrar/ConsoleRegistrarCreatorAction.java`
#### Snippet
```java
  @Inject @Named("base58StringGenerator") StringGenerator passwordGenerator;
  @Inject @Named("digitOnlyStringGenerator") StringGenerator passcodeGenerator;
  @Inject @Parameter("clientId") Optional<String> clientId;
  @Inject @Parameter("name") Optional<String> name;
  @Inject @Parameter("billingAccount") Optional<String> billingAccount;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'city'
in `core/src/main/java/google/registry/ui/server/registrar/ConsoleRegistrarCreatorAction.java`
#### Snippet
```java
  @Inject @Parameter("street2") Optional<String> optionalStreet2;
  @Inject @Parameter("street3") Optional<String> optionalStreet3;
  @Inject @Parameter("city") Optional<String> city;
  @Inject @Parameter("state") Optional<String> optionalState;
  @Inject @Parameter("zip") Optional<String> optionalZip;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'consoleUserEmail'
in `core/src/main/java/google/registry/ui/server/registrar/ConsoleRegistrarCreatorAction.java`
#### Snippet
```java
  @Inject @Parameter("referralEmail") Optional<String> referralEmail;
  @Inject @Parameter("driveId") Optional<String> driveId;
  @Inject @Parameter("consoleUserEmail") Optional<String> consoleUserEmail;

  // Address fields, some of which are required and others are optional.
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'optionalState'
in `core/src/main/java/google/registry/ui/server/registrar/ConsoleRegistrarCreatorAction.java`
#### Snippet
```java
  @Inject @Parameter("street3") Optional<String> optionalStreet3;
  @Inject @Parameter("city") Optional<String> city;
  @Inject @Parameter("state") Optional<String> optionalState;
  @Inject @Parameter("zip") Optional<String> optionalZip;
  @Inject @Parameter("countryCode") Optional<String> countryCode;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'driveId'
in `core/src/main/java/google/registry/ui/server/registrar/ConsoleRegistrarCreatorAction.java`
#### Snippet
```java
  @Inject @Parameter("ianaId") Optional<Integer> ianaId;
  @Inject @Parameter("referralEmail") Optional<String> referralEmail;
  @Inject @Parameter("driveId") Optional<String> driveId;
  @Inject @Parameter("consoleUserEmail") Optional<String> consoleUserEmail;

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'value'
in `core/src/main/java/google/registry/ui/server/registrar/ConsoleRegistrarCreatorAction.java`
#### Snippet
```java
  }

  private void checkPresent(Optional<?> value, String name) {
    checkState(value.isPresent(), "Missing value for %s", name);
  }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'optionalStreet2'
in `core/src/main/java/google/registry/ui/server/registrar/ConsoleRegistrarCreatorAction.java`
#### Snippet
```java
  // Address fields, some of which are required and others are optional.
  @Inject @Parameter("street1") Optional<String> street1;
  @Inject @Parameter("street2") Optional<String> optionalStreet2;
  @Inject @Parameter("street3") Optional<String> optionalStreet3;
  @Inject @Parameter("city") Optional<String> city;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'referralEmail'
in `core/src/main/java/google/registry/ui/server/registrar/ConsoleRegistrarCreatorAction.java`
#### Snippet
```java
  @Inject @Parameter("billingAccount") Optional<String> billingAccount;
  @Inject @Parameter("ianaId") Optional<Integer> ianaId;
  @Inject @Parameter("referralEmail") Optional<String> referralEmail;
  @Inject @Parameter("driveId") Optional<String> driveId;
  @Inject @Parameter("consoleUserEmail") Optional<String> consoleUserEmail;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'prefix'
in `core/src/main/java/google/registry/rde/BrdaCopyAction.java`
#### Snippet
```java
  @Inject @Parameter(RequestParameters.PARAM_TLD) String tld;
  @Inject @Parameter(RdeModule.PARAM_WATERMARK) DateTime watermark;
  @Inject @Parameter(RdeModule.PARAM_PREFIX) Optional<String> prefix;
  @Inject @Key("brdaReceiverKey") PGPPublicKey receiverKey;
  @Inject @Key("brdaSigningKey") PGPKeyPair signingKey;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'existingCertificate'
in `core/src/main/java/google/registry/ui/server/registrar/RegistrarSettingsAction.java`
#### Snippet
```java
   */
  private boolean validateCertificate(
      Optional<String> existingCertificate, String certificateString) {
    if (!existingCertificate.isPresent() || !existingCertificate.get().equals(certificateString)) {
      try {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'revision'
in `core/src/main/java/google/registry/rde/RdeStagingAction.java`
#### Snippet
```java
  @Inject @Parameter(RequestParameters.PARAM_TLDS) ImmutableSet<String> tlds;
  @Inject @Parameter(RdeModule.PARAM_WATERMARKS) ImmutableSet<DateTime> watermarks;
  @Inject @Parameter(RdeModule.PARAM_REVISION) Optional<Integer> revision;
  @Inject @Parameter(RdeModule.PARAM_LENIENT) boolean lenient;
  @Inject @Key("rdeStagingEncryptionKey") byte[] stagingKeyBytes;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'directory'
in `core/src/main/java/google/registry/rde/RdeStagingAction.java`
#### Snippet
```java
  @Inject @Parameter(RdeModule.PARAM_MANUAL) boolean manual;

  @Inject @Parameter(RdeModule.PARAM_DIRECTORY) Optional<String> directory;
  @Inject @Parameter(RdeModule.PARAM_MODE) ImmutableSet<String> modeStrings;
  @Inject @Parameter(RequestParameters.PARAM_TLDS) ImmutableSet<String> tlds;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'appEngineRetryCount'
in `core/src/main/java/google/registry/dns/PublishDnsUpdatesAction.java`
#### Snippet
```java
      @Config("registryCcEmail") Lazy<InternetAddress> registryCcEmail,
      @Config("gSuiteOutgoingEmailAddress") InternetAddress gSuiteOutgoingEmailAddress,
      @Header(APP_ENGINE_RETRY_HEADER) Optional<Integer> appEngineRetryCount,
      @Header(CLOUD_TASKS_RETRY_HEADER) Optional<Integer> cloudTasksRetryCount,
      DnsQueue dnsQueue,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'cloudTasksRetryCount'
in `core/src/main/java/google/registry/dns/PublishDnsUpdatesAction.java`
#### Snippet
```java
      @Config("gSuiteOutgoingEmailAddress") InternetAddress gSuiteOutgoingEmailAddress,
      @Header(APP_ENGINE_RETRY_HEADER) Optional<Integer> appEngineRetryCount,
      @Header(CLOUD_TASKS_RETRY_HEADER) Optional<Integer> cloudTasksRetryCount,
      DnsQueue dnsQueue,
      DnsWriterProxy dnsWriterProxy,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'prefix'
in `core/src/main/java/google/registry/rde/RdeUploadAction.java`
#### Snippet
```java
  @Inject Retrier retrier;
  @Inject @Parameter(RequestParameters.PARAM_TLD) String tld;
  @Inject @Parameter(RdeModule.PARAM_PREFIX) Optional<String> prefix;
  @Inject @Config("rdeBucket") String bucket;
  @Inject @Config("rdeInterval") Duration interval;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'jitterSeconds'
in `core/src/main/java/google/registry/dns/ReadDnsQueueAction.java`
#### Snippet
```java
      @Config("dnsTldUpdateBatchSize") int tldUpdateBatchSize,
      @Config("readDnsQueueActionRuntime") Duration requestedMaximumDuration,
      @Parameter(PARAM_JITTER_SECONDS) Optional<Integer> jitterSeconds,
      Clock clock,
      DnsQueue dnsQueue,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'jitterSeconds'
in `core/src/main/java/google/registry/dns/ReadDnsQueueAction.java`
#### Snippet
```java
  private final int tldUpdateBatchSize;
  private final Duration requestedMaximumDuration;
  private final Optional<Integer> jitterSeconds;
  private final Clock clock;
  private final DnsQueue dnsQueue;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'prefix'
in `core/src/main/java/google/registry/rde/RdeReportAction.java`
#### Snippet
```java
  @Inject RdeReporter reporter;
  @Inject @Parameter(RequestParameters.PARAM_TLD) String tld;
  @Inject @Parameter(RdeModule.PARAM_PREFIX) Optional<String> prefix;
  @Inject @Config("rdeBucket") String bucket;
  @Inject @Config("rdeInterval") Duration interval;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'errorMessage'
in `core/src/main/java/google/registry/ui/forms/FormField.java`
#### Snippet
```java
      private final Optional<String> errorMessage;

      MatchesFunction(Pattern pattern, Optional<String> errorMessage) {
        this.pattern = pattern;
        this.errorMessage = errorMessage;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'errorMessage'
in `core/src/main/java/google/registry/ui/forms/FormField.java`
#### Snippet
```java
    private static final class MatchesFunction<O> implements Function<O, O> {
      private final Pattern pattern;
      private final Optional<String> errorMessage;

      MatchesFunction(Pattern pattern, Optional<String> errorMessage) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'jitterSeconds'
in `core/src/main/java/google/registry/cron/TldFanoutAction.java`
#### Snippet
```java
  @Inject @Parameter(RUN_IN_EMPTY_PARAM) boolean runInEmpty;
  @Inject @Parameter(EXCLUDE_PARAM) ImmutableSet<String> excludes;
  @Inject @Parameter(JITTER_SECONDS_PARAM) Optional<Integer> jitterSeconds;
  @Inject @ParameterMap ImmutableListMultimap<String, String> params;

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'includeDeletedParam'
in `core/src/main/java/google/registry/rdap/RdapActionBase.java`
#### Snippet
```java
  @Inject RdapAuthorization rdapAuthorization;
  @Inject RdapJsonFormatter rdapJsonFormatter;
  @Inject @Parameter("includeDeleted") Optional<Boolean> includeDeletedParam;
  @Inject @Parameter("formatOutput") Optional<Boolean> formatOutputParam;
  @Inject @Config("rdapResultSetMaxSize") int rdapResultSetMaxSize;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'formatOutputParam'
in `core/src/main/java/google/registry/rdap/RdapActionBase.java`
#### Snippet
```java
  @Inject RdapJsonFormatter rdapJsonFormatter;
  @Inject @Parameter("includeDeleted") Optional<Boolean> includeDeletedParam;
  @Inject @Parameter("formatOutput") Optional<Boolean> formatOutputParam;
  @Inject @Config("rdapResultSetMaxSize") int rdapResultSetMaxSize;
  @Inject RdapMetrics rdapMetrics;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'nsIpParam'
in `core/src/main/java/google/registry/rdap/RdapDomainSearchAction.java`
#### Snippet
```java
  @Inject @Parameter("name") Optional<String> nameParam;
  @Inject @Parameter("nsLdhName") Optional<String> nsLdhNameParam;
  @Inject @Parameter("nsIp") Optional<String> nsIpParam;

  @Inject
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'nsLdhNameParam'
in `core/src/main/java/google/registry/rdap/RdapDomainSearchAction.java`
#### Snippet
```java

  @Inject @Parameter("name") Optional<String> nameParam;
  @Inject @Parameter("nsLdhName") Optional<String> nsLdhNameParam;
  @Inject @Parameter("nsIp") Optional<String> nsIpParam;

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'numDomainsRetrieved'
in `core/src/main/java/google/registry/rdap/RdapDomainSearchAction.java`
#### Snippet
```java
      List<Domain> domains,
      IncompletenessWarningType incompletenessWarningType,
      Optional<Long> numDomainsRetrieved) {
    numDomainsRetrieved.ifPresent(metricInformationBuilder::setNumDomainsRetrieved);
    OutputDataType outputDataType =
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'nameParam'
in `core/src/main/java/google/registry/rdap/RdapDomainSearchAction.java`
#### Snippet
```java
  private static final FluentLogger logger = FluentLogger.forEnclosingClass();

  @Inject @Parameter("name") Optional<String> nameParam;
  @Inject @Parameter("nsLdhName") Optional<String> nsLdhNameParam;
  @Inject @Parameter("nsIp") Optional<String> nsIpParam;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'nameParam'
in `core/src/main/java/google/registry/rdap/RdapNameserverSearchAction.java`
#### Snippet
```java
  public static final String PATH = "/rdap/nameservers";

  @Inject @Parameter("name") Optional<String> nameParam;
  @Inject @Parameter("ip") Optional<String> ipParam;
  @Inject public RdapNameserverSearchAction() {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'ipParam'
in `core/src/main/java/google/registry/rdap/RdapNameserverSearchAction.java`
#### Snippet
```java

  @Inject @Parameter("name") Optional<String> nameParam;
  @Inject @Parameter("ip") Optional<String> ipParam;
  @Inject public RdapNameserverSearchAction() {
    super("nameserver search", EndpointType.NAMESERVERS);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'registrarParam'
in `core/src/main/java/google/registry/rdap/RdapSearchActionBase.java`
#### Snippet
```java
  @Inject @ParameterMap ImmutableListMultimap<String, String> parameterMap;
  @Inject @Parameter("cursor") Optional<String> cursorTokenParam;
  @Inject @Parameter("registrar") Optional<String> registrarParam;

  protected Optional<String> cursorString;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'eppResource'
in `core/src/main/java/google/registry/rdap/RdapSearchActionBase.java`
#### Snippet
```java
  }

  protected boolean shouldBeVisible(Optional<? extends EppResource> eppResource) {
    return eppResource.isPresent() && shouldBeVisible(eppResource.get());
  }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'cursorString'
in `core/src/main/java/google/registry/rdap/RdapSearchActionBase.java`
#### Snippet
```java
      Class<T> clazz,
      RdapSearchPattern partialStringQuery,
      Optional<String> cursorString,
      DeletedItemHandling deletedItemHandling) {
    replicaJpaTm().assertInTransaction();
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'cursorField'
in `core/src/main/java/google/registry/rdap/RdapSearchActionBase.java`
#### Snippet
```java
      String filterField,
      String queryString,
      Optional<String> cursorField,
      Optional<String> cursorString,
      DeletedItemHandling deletedItemHandling) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'cursorString'
in `core/src/main/java/google/registry/rdap/RdapSearchActionBase.java`
#### Snippet
```java
      String queryString,
      Optional<String> cursorField,
      Optional<String> cursorString,
      DeletedItemHandling deletedItemHandling) {
    if (queryString.length() < RdapSearchPattern.MIN_INITIAL_STRING_LENGTH) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'cursorTokenParam'
in `core/src/main/java/google/registry/rdap/RdapSearchActionBase.java`
#### Snippet
```java
  @Inject @RequestUrl String requestUrl;
  @Inject @ParameterMap ImmutableListMultimap<String, String> parameterMap;
  @Inject @Parameter("cursor") Optional<String> cursorTokenParam;
  @Inject @Parameter("registrar") Optional<String> registrarParam;

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'cursorString'
in `core/src/main/java/google/registry/rdap/RdapSearchActionBase.java`
#### Snippet
```java
      String filterField,
      RdapSearchPattern partialStringQuery,
      Optional<String> cursorString,
      DeletedItemHandling deletedItemHandling) {
    replicaJpaTm().assertInTransaction();
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'cursorString'
in `core/src/main/java/google/registry/rdap/RdapSearchActionBase.java`
#### Snippet
```java
  @Inject @Parameter("registrar") Optional<String> registrarParam;

  protected Optional<String> cursorString;

  RdapSearchActionBase(String humanReadableObjectTypeName, EndpointType endpointType) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'fnParam'
in `core/src/main/java/google/registry/rdap/RdapEntitySearchAction.java`
#### Snippet
```java
public class RdapEntitySearchAction extends RdapSearchActionBase {

  @Inject @Parameter("fn") Optional<String> fnParam;
  @Inject @Parameter("handle") Optional<String> handleParam;
  @Inject @Parameter("subtype") Optional<String> subtypeParam;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'cursorQueryString'
in `core/src/main/java/google/registry/rdap/RdapEntitySearchAction.java`
#### Snippet
```java
      final RdapSearchPattern partialStringQuery,
      CursorType cursorType,
      Optional<String> cursorQueryString,
      Subtype subtype) {
    // Don't allow wildcard suffixes when searching for entities.
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'subtypeParam'
in `core/src/main/java/google/registry/rdap/RdapEntitySearchAction.java`
#### Snippet
```java
  @Inject @Parameter("fn") Optional<String> fnParam;
  @Inject @Parameter("handle") Optional<String> handleParam;
  @Inject @Parameter("subtype") Optional<String> subtypeParam;
  @Inject public RdapEntitySearchAction() {
    super("entity search", EndpointType.ENTITIES);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'cursorQueryString'
in `core/src/main/java/google/registry/rdap/RdapEntitySearchAction.java`
#### Snippet
```java
      final RdapSearchPattern partialStringQuery,
      CursorType cursorType,
      Optional<String> cursorQueryString,
      Subtype subtype) {
    if (partialStringQuery.getSuffix() != null) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'handleParam'
in `core/src/main/java/google/registry/rdap/RdapEntitySearchAction.java`
#### Snippet
```java

  @Inject @Parameter("fn") Optional<String> fnParam;
  @Inject @Parameter("handle") Optional<String> handleParam;
  @Inject @Parameter("subtype") Optional<String> subtypeParam;
  @Inject public RdapEntitySearchAction() {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'marksdbDnlLoginAndPassword'
in `core/src/main/java/google/registry/tmch/TmchDnlAction.java`
#### Snippet
```java

  @Inject Marksdb marksdb;
  @Inject @Key("marksdbDnlLoginAndPassword") Optional<String> marksdbDnlLoginAndPassword;
  @Inject TmchDnlAction() {}

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'marksdbLordnPassword'
in `core/src/main/java/google/registry/tmch/LordnRequestInitializer.java`
#### Snippet
```java
  private static final FluentLogger logger = FluentLogger.forEnclosingClass();

  private final Optional<String> marksdbLordnPassword;

  @Inject
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'marksdbLordnPassword'
in `core/src/main/java/google/registry/tmch/LordnRequestInitializer.java`
#### Snippet
```java

  @Inject
  LordnRequestInitializer(@Key("marksdbLordnPassword") Optional<String> marksdbLordnPassword) {
    this.marksdbLordnPassword = marksdbLordnPassword;
  }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'marksdbSmdrlLoginAndPassword'
in `core/src/main/java/google/registry/tmch/TmchSmdrlAction.java`
#### Snippet
```java

  @Inject Marksdb marksdb;
  @Inject @Key("marksdbSmdrlLoginAndPassword") Optional<String> marksdbSmdrlLoginAndPassword;
  @Inject TmchSmdrlAction() {}

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'loginAndPassword'
in `core/src/main/java/google/registry/tmch/Marksdb.java`
#### Snippet
```java
  }

  byte[] fetch(URL url, Optional<String> loginAndPassword)
      throws IOException, GeneralSecurityException {
    HttpURLConnection connection = urlConnectionService.createConnection(url);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'loginAndPassword'
in `core/src/main/java/google/registry/tmch/Marksdb.java`
#### Snippet
```java

  ImmutableList<String> fetchSignedCsv(
      Optional<String> loginAndPassword, String csvPath, String sigPath)
      throws IOException, GeneralSecurityException, PGPException {
    checkArgument(
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'oldLock'
in `core/src/main/java/google/registry/batch/RelockDomainAction.java`
#### Snippet
```java
  }

  private void handleTransientFailure(Optional<RegistryLock> oldLock, Throwable t) {
    String message = String.format("Re-lock failed: %s", t.getMessage());
    logger.atSevere().withCause(t).log(message);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'helpNotice'
in `core/src/main/java/google/registry/rdap/RdapObjectClasses.java`
#### Snippet
```java
    }

    static HelpResponse create(Optional<Notice> helpNotice) {
      return new AutoValue_RdapObjectClasses_HelpResponse(helpNotice);
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'certificate'
in `core/src/main/java/google/registry/batch/SendExpiringCertificateNotificationEmailAction.java`
#### Snippet
```java
      DateTime lastExpiringCertNotificationSentDate,
      CertificateType certificateType,
      Optional<String> certificate) {
    if (!certificate.isPresent()
        || !certificateChecker.shouldReceiveExpiringNotification(
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'cursorTimeParam'
in `core/src/main/java/google/registry/batch/ExpandRecurringBillingEventsAction.java`
#### Snippet
```java

  @Inject @Parameter(PARAM_DRY_RUN) boolean isDryRun;
  @Inject @Parameter(PARAM_CURSOR_TIME) Optional<DateTime> cursorTimeParam;

  @Inject DomainPricingLogic domainPricingLogic;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'clientInetAddr'
in `core/src/main/java/google/registry/flows/TlsCredentials.java`
#### Snippet
```java
  /** Registrar IP address is not in stored allow list. */
  public static class BadRegistrarIpAddressException extends AuthenticationErrorException {
    BadRegistrarIpAddressException(Optional<InetAddress> clientInetAddr) {
      super(
          clientInetAddr.isPresent()
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'clientCertificateHash'
in `core/src/main/java/google/registry/flows/TlsCredentials.java`
#### Snippet
```java
  public TlsCredentials(
      @Config("requireSslCertificates") boolean requireSslCertificates,
      @Header(ProxyHttpHeaders.CERTIFICATE_HASH) Optional<String> clientCertificateHash,
      @Header(ProxyHttpHeaders.IP_ADDRESS) Optional<String> clientAddress,
      CertificateChecker certificateChecker) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'clientAddress'
in `core/src/main/java/google/registry/flows/TlsCredentials.java`
#### Snippet
```java
      @Config("requireSslCertificates") boolean requireSslCertificates,
      @Header(ProxyHttpHeaders.CERTIFICATE_HASH) Optional<String> clientCertificateHash,
      @Header(ProxyHttpHeaders.IP_ADDRESS) Optional<String> clientAddress,
      CertificateChecker certificateChecker) {
    this.requireSslCertificates = requireSslCertificates;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'clientCertificateHash'
in `core/src/main/java/google/registry/flows/TlsCredentials.java`
#### Snippet
```java

  private final boolean requireSslCertificates;
  private final Optional<String> clientCertificateHash;
  private final Optional<InetAddress> clientInetAddr;
  private final CertificateChecker certificateChecker;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'clientInetAddr'
in `core/src/main/java/google/registry/flows/TlsCredentials.java`
#### Snippet
```java
  private final boolean requireSslCertificates;
  private final Optional<String> clientCertificateHash;
  private final Optional<InetAddress> clientInetAddr;
  private final CertificateChecker certificateChecker;

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'authInfo'
in `core/src/main/java/google/registry/flows/ResourceFlowUtils.java`
#### Snippet
```java

  /** Check that the given AuthInfo is present for a resource being transferred. */
  public static void verifyAuthInfoPresentForResourceTransfer(Optional<AuthInfo> authInfo)
      throws EppException {
    if (!authInfo.isPresent()) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'resource'
in `core/src/main/java/google/registry/flows/ResourceFlowUtils.java`
#### Snippet
```java

  public static <R extends EppResource> R verifyExistence(
      Class<R> clazz, String targetId, Optional<R> resource) throws ResourceDoesNotExistException {
    return resource.orElseThrow(() -> new ResourceDoesNotExistException(clazz, targetId));
  }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'authInfo'
in `core/src/main/java/google/registry/flows/ResourceFlowUtils.java`
#### Snippet
```java

  /** Check that the given AuthInfo is either missing or else is valid for the given resource. */
  public static void verifyOptionalAuthInfo(Optional<AuthInfo> authInfo, Contact contact)
      throws EppException {
    if (authInfo.isPresent()) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'authInfo'
in `core/src/main/java/google/registry/flows/ResourceFlowUtils.java`
#### Snippet
```java

  /** Check that the given AuthInfo is either missing or else is valid for the given resource. */
  public static void verifyOptionalAuthInfo(Optional<AuthInfo> authInfo, Domain domain)
      throws EppException {
    if (authInfo.isPresent()) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'eppInput'
in `core/src/main/java/google/registry/flows/custom/CustomLogicFactory.java`
#### Snippet
```java

  public DomainPricingCustomLogic forDomainPricing(
      Optional<EppInput> eppInput,
      Optional<SessionMetadata> sessionMetadata,
      Optional<FlowMetadata> flowMetadata) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'sessionMetadata'
in `core/src/main/java/google/registry/flows/custom/CustomLogicFactory.java`
#### Snippet
```java
  public DomainPricingCustomLogic forDomainPricing(
      Optional<EppInput> eppInput,
      Optional<SessionMetadata> sessionMetadata,
      Optional<FlowMetadata> flowMetadata) {
    return new DomainPricingCustomLogic(
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'flowMetadata'
in `core/src/main/java/google/registry/flows/custom/CustomLogicFactory.java`
#### Snippet
```java
      Optional<EppInput> eppInput,
      Optional<SessionMetadata> sessionMetadata,
      Optional<FlowMetadata> flowMetadata) {
    return new DomainPricingCustomLogic(
        eppInput.orElse(null), sessionMetadata.orElse(null), flowMetadata.orElse(null));
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'eppInput'
in `core/src/main/java/google/registry/flows/custom/CustomLogicModule.java`
#### Snippet
```java
  static DomainPricingCustomLogic provideDomainPricingCustomLogic(
      CustomLogicFactory factory,
      Optional<EppInput> eppInput,
      Optional<SessionMetadata> sessionMetadata,
      Optional<FlowMetadata> flowMetadata) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'sessionMetadata'
in `core/src/main/java/google/registry/flows/custom/CustomLogicModule.java`
#### Snippet
```java
      CustomLogicFactory factory,
      Optional<EppInput> eppInput,
      Optional<SessionMetadata> sessionMetadata,
      Optional<FlowMetadata> flowMetadata) {
    // Note that, for DomainPricingCustomLogic, the EPP flow state won't be present outside the
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'flowMetadata'
in `core/src/main/java/google/registry/flows/custom/CustomLogicModule.java`
#### Snippet
```java
      Optional<EppInput> eppInput,
      Optional<SessionMetadata> sessionMetadata,
      Optional<FlowMetadata> flowMetadata) {
    // Note that, for DomainPricingCustomLogic, the EPP flow state won't be present outside the
    // context of an EPP flow.
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'authInfo'
in `core/src/main/java/google/registry/flows/domain/DomainRestoreRequestFlow.java`
#### Snippet
```java
  @Inject ExtensionManager extensionManager;
  @Inject EppInput eppInput;
  @Inject Optional<AuthInfo> authInfo;
  @Inject @RegistrarId String registrarId;
  @Inject @TargetId String targetId;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'feeUpdate'
in `core/src/main/java/google/registry/flows/domain/DomainRestoreRequestFlow.java`
#### Snippet
```java
  private static ImmutableList<FeeTransformResponseExtension> createResponseExtensions(
      FeesAndCredits feesAndCredits,
      Optional<FeeUpdateCommandExtension> feeUpdate,
      boolean isExpired) {
    ImmutableList.Builder<Fee> fees = new ImmutableList.Builder<>();
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'feeUpdate'
in `core/src/main/java/google/registry/flows/domain/DomainRestoreRequestFlow.java`
#### Snippet
```java
      Update command,
      Domain existingDomain,
      Optional<FeeUpdateCommandExtension> feeUpdate,
      FeesAndCredits feesAndCredits,
      DateTime now)
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'authInfo'
in `core/src/main/java/google/registry/flows/domain/DomainTransferRejectFlow.java`
#### Snippet
```java

  @Inject ExtensionManager extensionManager;
  @Inject Optional<AuthInfo> authInfo;
  @Inject @RegistrarId String registrarId;
  @Inject @TargetId String targetId;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'superuserExtension'
in `core/src/main/java/google/registry/flows/domain/DomainTransferRequestFlow.java`
#### Snippet
```java
   */
  private static void verifyTransferPeriod(
      Period period, Optional<DomainTransferRequestSuperuserExtension> superuserExtension)
      throws EppException {
    verifyUnitIsYears(period);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'feesAndCredits'
in `core/src/main/java/google/registry/flows/domain/DomainTransferRequestFlow.java`
#### Snippet
```java

  private static ImmutableList<FeeTransformResponseExtension> createResponseExtensions(
      Optional<FeesAndCredits> feesAndCredits, Optional<FeeTransferCommandExtension> feeTransfer) {
    return feeTransfer.isPresent() && feesAndCredits.isPresent()
        ? ImmutableList.of(
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'feeTransfer'
in `core/src/main/java/google/registry/flows/domain/DomainTransferRequestFlow.java`
#### Snippet
```java

  private static ImmutableList<FeeTransformResponseExtension> createResponseExtensions(
      Optional<FeesAndCredits> feesAndCredits, Optional<FeeTransferCommandExtension> feeTransfer) {
    return feeTransfer.isPresent() && feesAndCredits.isPresent()
        ? ImmutableList.of(
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'authInfo'
in `core/src/main/java/google/registry/flows/domain/DomainTransferRequestFlow.java`
#### Snippet
```java
  @Inject ExtensionManager extensionManager;
  @Inject EppInput eppInput;
  @Inject Optional<AuthInfo> authInfo;
  @Inject @RegistrarId String gainingClientId;
  @Inject @TargetId String targetId;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'superuserExtension'
in `core/src/main/java/google/registry/flows/domain/DomainTransferRequestFlow.java`
#### Snippet
```java
      Period period,
      DateTime now,
      Optional<DomainTransferRequestSuperuserExtension> superuserExtension)
      throws EppException {
    verifyNoDisallowedStatuses(existingDomain, DISALLOWED_STATUSES);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'signedMarkId'
in `core/src/main/java/google/registry/flows/custom/DomainCreateFlowCustomLogic.java`
#### Snippet
```java
      public abstract Builder setYears(int years);

      public abstract Builder setSignedMarkId(Optional<String> signedMarkId);

      public abstract AfterValidationParameters build();
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'authInfo'
in `core/src/main/java/google/registry/flows/domain/DomainTransferApproveFlow.java`
#### Snippet
```java

  @Inject ExtensionManager extensionManager;
  @Inject Optional<AuthInfo> authInfo;
  @Inject @RegistrarId String registrarId;
  @Inject @TargetId String targetId;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'authInfo'
in `core/src/main/java/google/registry/flows/domain/DomainTransferCancelFlow.java`
#### Snippet
```java

  @Inject ExtensionManager extensionManager;
  @Inject Optional<AuthInfo> authInfo;
  @Inject @RegistrarId String registrarId;
  @Inject @TargetId String targetId;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'authInfo'
in `core/src/main/java/google/registry/flows/domain/DomainRenewFlow.java`
#### Snippet
```java
  @Inject ExtensionManager extensionManager;
  @Inject EppInput eppInput;
  @Inject Optional<AuthInfo> authInfo;
  @Inject @RegistrarId String registrarId;
  @Inject @TargetId String targetId;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'authInfo'
in `core/src/main/java/google/registry/flows/domain/DomainRenewFlow.java`
#### Snippet
```java

  private void verifyRenewAllowed(
      Optional<AuthInfo> authInfo,
      Domain existingDomain,
      Renew command,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'allocationToken'
in `core/src/main/java/google/registry/flows/domain/DomainRenewFlow.java`
#### Snippet
```java
      Domain existingDomain,
      Renew command,
      Optional<AllocationToken> allocationToken)
      throws EppException {
    verifyOptionalAuthInfo(authInfo, existingDomain);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'allocationToken'
in `core/src/main/java/google/registry/flows/domain/DomainRenewFlow.java`
#### Snippet
```java
      int years,
      HistoryEntryId domainHistoryId,
      Optional<AllocationToken> allocationToken,
      DateTime now) {
    return new BillingEvent.OneTime.Builder()
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'feeRenew'
in `core/src/main/java/google/registry/flows/domain/DomainRenewFlow.java`
#### Snippet
```java

  private ImmutableList<FeeTransformResponseExtension> createResponseExtensions(
      FeesAndCredits feesAndCredits, Optional<FeeRenewCommandExtension> feeRenew) {
    return feeRenew
        .map(
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'authInfo'
in `core/src/main/java/google/registry/flows/domain/DomainTransferQueryFlow.java`
#### Snippet
```java

  @Inject ExtensionManager extensionManager;
  @Inject Optional<AuthInfo> authInfo;
  @Inject @RegistrarId String registrarId;
  @Inject @TargetId String targetId;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'allocationToken'
in `core/src/main/java/google/registry/flows/domain/DomainPricingLogic.java`
#### Snippet
```java
  /** Returns the domain create cost with allocation-token-related discounts applied. */
  private Money getDomainCreateCostWithDiscount(
      DomainPrices domainPrices, int years, Optional<AllocationToken> allocationToken)
      throws EppException {
    if (allocationToken.isPresent()
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'allocationToken'
in `core/src/main/java/google/registry/flows/domain/DomainPricingLogic.java`
#### Snippet
```java
      int years,
      boolean isAnchorTenant,
      Optional<AllocationToken> allocationToken)
      throws EppException {
    CurrencyUnit currency = registry.getCurrency();
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'authInfo'
in `core/src/main/java/google/registry/flows/domain/DomainInfoFlow.java`
#### Snippet
```java
  @Inject ResourceCommand resourceCommand;
  @Inject EppInput eppInput;
  @Inject Optional<AuthInfo> authInfo;
  @Inject @RegistrarId String registrarId;
  @Inject @TargetId String targetId;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'allocationToken'
in `core/src/main/java/google/registry/flows/domain/token/AllocationTokenDomainCheckResults.java`
#### Snippet
```java

  public static AllocationTokenDomainCheckResults create(
      Optional<AllocationToken> allocationToken,
      ImmutableMap<InternetDomainName, String> domainCheckResults) {
    return new AutoValue_AllocationTokenDomainCheckResults(allocationToken, domainCheckResults);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'authInfo'
in `core/src/main/java/google/registry/flows/domain/DomainUpdateFlow.java`
#### Snippet
```java
  @Inject ExtensionManager extensionManager;
  @Inject EppInput eppInput;
  @Inject Optional<AuthInfo> authInfo;
  @Inject @RegistrarId String registrarId;
  @Inject @TargetId String targetId;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'authInfo'
in `core/src/main/java/google/registry/flows/contact/ContactDeleteFlow.java`
#### Snippet
```java
  @Inject Trid trid;
  @Inject @Superuser boolean isSuperuser;
  @Inject Optional<AuthInfo> authInfo;
  @Inject ContactHistory.Builder historyBuilder;
  @Inject EppResponse.Builder responseBuilder;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'authInfo'
in `core/src/main/java/google/registry/flows/domain/DomainDeleteFlow.java`
#### Snippet
```java
  @Inject EppInput eppInput;
  @Inject SessionMetadata sessionMetadata;
  @Inject Optional<AuthInfo> authInfo;
  @Inject @RegistrarId String registrarId;
  @Inject @TargetId String targetId;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'authInfo'
in `core/src/main/java/google/registry/flows/contact/ContactTransferQueryFlow.java`
#### Snippet
```java

  @Inject ExtensionManager extensionManager;
  @Inject Optional<AuthInfo> authInfo;
  @Inject @RegistrarId String registrarId;
  @Inject @TargetId String targetId;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'authInfo'
in `core/src/main/java/google/registry/flows/contact/ContactTransferRejectFlow.java`
#### Snippet
```java

  @Inject ExtensionManager extensionManager;
  @Inject Optional<AuthInfo> authInfo;
  @Inject @RegistrarId String registrarId;
  @Inject @TargetId String targetId;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'transferCost'
in `core/src/main/java/google/registry/flows/domain/DomainTransferUtils.java`
#### Snippet
```java
      String targetId,
      Domain existingDomain,
      Optional<Money> transferCost) {
    Domain domainAtTransferTime = existingDomain.cloneProjectedAtTime(automaticTransferTime);
    GracePeriod autorenewGracePeriod =
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'transferCost'
in `core/src/main/java/google/registry/flows/domain/DomainTransferUtils.java`
#### Snippet
```java
      Trid trid,
      String gainingRegistrarId,
      Optional<Money> transferCost,
      DateTime now) {
    String targetId = existingDomain.getDomainName();
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'authInfo'
in `core/src/main/java/google/registry/flows/contact/ContactUpdateFlow.java`
#### Snippet
```java
  @Inject ResourceCommand resourceCommand;
  @Inject ExtensionManager extensionManager;
  @Inject Optional<AuthInfo> authInfo;
  @Inject @RegistrarId String registrarId;
  @Inject @TargetId String targetId;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'authInfo'
in `core/src/main/java/google/registry/flows/contact/ContactTransferApproveFlow.java`
#### Snippet
```java
  @Inject @RegistrarId String registrarId;
  @Inject @TargetId String targetId;
  @Inject Optional<AuthInfo> authInfo;
  @Inject ContactHistory.Builder historyBuilder;
  @Inject EppResponse.Builder responseBuilder;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'authInfo'
in `core/src/main/java/google/registry/flows/contact/ContactTransferCancelFlow.java`
#### Snippet
```java
  @Inject ResourceCommand resourceCommand;
  @Inject ExtensionManager extensionManager;
  @Inject Optional<AuthInfo> authInfo;
  @Inject @RegistrarId String registrarId;
  @Inject @TargetId String targetId;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'allocationToken'
in `core/src/main/java/google/registry/flows/domain/token/AllocationTokenFlowUtils.java`
#### Snippet
```java

  public static Domain maybeApplyPackageRemovalToken(
      Domain domain, Optional<AllocationToken> allocationToken) {
    if (!allocationToken.isPresent()
        || !TokenBehavior.REMOVE_PACKAGE.equals(allocationToken.get().getTokenBehavior())) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'extension'
in `core/src/main/java/google/registry/flows/domain/token/AllocationTokenFlowUtils.java`
#### Snippet
```java
      String registrarId,
      DateTime now,
      Optional<AllocationTokenExtension> extension)
      throws EppException {
    if (!extension.isPresent()) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'allocationToken'
in `core/src/main/java/google/registry/flows/domain/token/AllocationTokenFlowUtils.java`
#### Snippet
```java

  public static void verifyTokenAllowedOnDomain(
      Domain domain, Optional<AllocationToken> allocationToken) throws EppException {

    boolean domainHasPackageToken = domain.getCurrentPackageToken().isPresent();
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'extension'
in `core/src/main/java/google/registry/flows/domain/token/AllocationTokenFlowUtils.java`
#### Snippet
```java
      String registrarId,
      DateTime now,
      Optional<AllocationTokenExtension> extension)
      throws EppException {
    if (!extension.isPresent()) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'authInfo'
in `core/src/main/java/google/registry/flows/contact/ContactInfoFlow.java`
#### Snippet
```java
  @Inject @RegistrarId String registrarId;
  @Inject @TargetId String targetId;
  @Inject Optional<AuthInfo> authInfo;
  @Inject @Superuser boolean isSuperuser;
  @Inject EppResponse.Builder responseBuilder;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'authInfo'
in `core/src/main/java/google/registry/flows/contact/ContactTransferRequestFlow.java`
#### Snippet
```java

  @Inject ExtensionManager extensionManager;
  @Inject Optional<AuthInfo> authInfo;
  @Inject @RegistrarId String gainingClientId;
  @Inject @TargetId String targetId;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'feeCreate'
in `core/src/main/java/google/registry/flows/domain/DomainCreateFlow.java`
#### Snippet
```java

  private static ImmutableList<FeeTransformResponseExtension> createResponseExtensions(
      Optional<FeeCreateCommandExtension> feeCreate, FeesAndCredits feesAndCredits) {
    return feeCreate
        .map(
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'allocationToken'
in `core/src/main/java/google/registry/flows/domain/DomainCreateFlow.java`
#### Snippet
```java
      DateTime now,
      String domainLabel,
      Optional<AllocationToken> allocationToken,
      boolean isAnchorTenant,
      boolean isValidReservedCreate,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'allocationToken'
in `core/src/main/java/google/registry/flows/domain/DomainCreateFlow.java`
#### Snippet
```java
  static RenewalPriceInfo getRenewalPriceInfo(
      boolean isAnchorTenant,
      Optional<AllocationToken> allocationToken,
      FeesAndCredits feesAndCredits) {
    if (isAnchorTenant) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'allocationToken'
in `core/src/main/java/google/registry/flows/domain/DomainCreateFlow.java`
#### Snippet
```java
      FeesAndCredits feesAndCredits,
      HistoryEntryId domainHistoryId,
      Optional<AllocationToken> allocationToken,
      DateTime now) {
    ImmutableSet.Builder<Flag> flagsBuilder = new ImmutableSet.Builder<>();
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'eppInput'
in `core/src/main/java/google/registry/model/OteStats.java`
#### Snippet
```java
     * Check if the {@link HistoryEntry} type matches as well as the {@link EppInput} if supplied.
     */
    private boolean matches(HistoryEntry.Type historyType, Optional<EppInput> eppInput) {
      if (eppInputFilter.isPresent() && eppInput.isPresent()) {
        return typeFilter.test(historyType) && eppInputFilter.get().test(eppInput.get());
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'eppInputFilter'
in `core/src/main/java/google/registry/model/OteStats.java`
#### Snippet
```java
    /** Optional filter on the EppInput. */
    @SuppressWarnings("ImmutableEnumChecker") // Predicates are immutable.
    private final Optional<Predicate<EppInput>> eppInputFilter;

    StatType(int requirement, Predicate<HistoryEntry.Type> typeFilter) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'allocationToken'
in `core/src/main/java/google/registry/flows/domain/DomainCheckFlow.java`
#### Snippet
```java
      ImmutableSet<String> availableDomains,
      DateTime now,
      Optional<AllocationToken> allocationToken)
      throws EppException {
    Optional<FeeCheckCommandExtension> feeCheckOpt =
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'allocationToken'
in `core/src/main/java/google/registry/flows/domain/DomainCheckFlow.java`
#### Snippet
```java
      ImmutableMap<InternetDomainName, String> tokenCheckResults,
      ImmutableMap<String, TldState> tldStates,
      Optional<AllocationToken> allocationToken) {
    if (existingDomains.containsKey(domainName.toString())) {
      return Optional.of("In use");
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'expiry'
in `core/src/main/java/google/registry/model/ForeignKeyUtils.java`
#### Snippet
```java

  @VisibleForTesting
  public static void setCacheForTest(Optional<Duration> expiry) {
    Duration effectiveExpiry = expiry.orElse(getEppResourceCachingDuration());
    foreignKeyCache = createForeignKeyMapCache(effectiveExpiry);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'expiry'
in `core/src/main/java/google/registry/model/tld/label/PremiumListDao.java`
#### Snippet
```java

  @VisibleForTesting
  public static void setPremiumListCacheForTest(Optional<Duration> expiry) {
    Duration effectiveExpiry = expiry.orElse(getDomainLabelListCacheDuration());
    premiumListCache = createPremiumListCache(effectiveExpiry);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'expiry'
in `core/src/main/java/google/registry/model/EppResource.java`
#### Snippet
```java

  @VisibleForTesting
  public static void setCacheForTest(Optional<Duration> expiry) {
    Duration effectiveExpiry = expiry.orElse(getEppResourceCachingDuration());
    cacheEppResources = createEppResourcesCache(effectiveExpiry);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'feeCommand'
in `core/src/main/java/google/registry/flows/domain/DomainFlowUtils.java`
#### Snippet
```java
   */
  public static void validateFeeChallenge(
      final Optional<? extends FeeTransformCommandExtension> feeCommand,
      FeesAndCredits feesAndCredits)
      throws EppException {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'token'
in `core/src/main/java/google/registry/flows/domain/DomainFlowUtils.java`
#### Snippet
```java
  /** Returns whether a given domain create request is for a valid reserved domain. */
  public static boolean isValidReservedCreate(
      InternetDomainName domainName, Optional<AllocationToken> token) {
    // If the domain is reserved for specific use, then check if the allocation token exists and
    // is for this domain.
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'secDnsCreate'
in `core/src/main/java/google/registry/flows/domain/DomainFlowUtils.java`
#### Snippet
```java
  /** Validate the secDNS extension, if present. */
  static Optional<SecDnsCreateExtension> validateSecDnsExtension(
      Optional<SecDnsCreateExtension> secDnsCreate) throws EppException {
    if (!secDnsCreate.isPresent()) {
      return Optional.empty();
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'feeCommand'
in `core/src/main/java/google/registry/flows/domain/DomainFlowUtils.java`
#### Snippet
```java
   */
  public static void validateFeesAckedIfPresent(
      final Optional<? extends FeeTransformCommandExtension> feeCommand,
      FeesAndCredits feesAndCredits)
      throws EppException {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'token'
in `core/src/main/java/google/registry/flows/domain/DomainFlowUtils.java`
#### Snippet
```java
  public static boolean isAnchorTenant(
      InternetDomainName domainName,
      Optional<AllocationToken> token,
      Optional<MetadataExtension> metadataExtension) {
    // If the domain is reserved for anchor tenants, then check if the allocation token exists and
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'metadataExtension'
in `core/src/main/java/google/registry/flows/domain/DomainFlowUtils.java`
#### Snippet
```java
      InternetDomainName domainName,
      Optional<AllocationToken> token,
      Optional<MetadataExtension> metadataExtension) {
    // If the domain is reserved for anchor tenants, then check if the allocation token exists and
    // is for this domain.
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'domain'
in `core/src/main/java/google/registry/flows/domain/DomainFlowUtils.java`
#### Snippet
```java
      FeeQueryResponseExtensionItem.Builder<?, ?> builder,
      InternetDomainName domainName,
      Optional<Domain> domain,
      @Nullable CurrencyUnit topLevelCurrency,
      DateTime currentDate,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'allocationToken'
in `core/src/main/java/google/registry/flows/domain/DomainFlowUtils.java`
#### Snippet
```java
      DateTime currentDate,
      DomainPricingLogic pricingLogic,
      Optional<AllocationToken> allocationToken,
      boolean isAvailable,
      @Nullable Recurring recurringBillingEvent)
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'expiry'
in `core/src/main/java/google/registry/model/tmch/ClaimsListDao.java`
#### Snippet
```java

  @VisibleForTesting
  public static void setCacheForTest(Optional<Duration> expiry) {
    Duration effectiveExpiry = expiry.orElse(getClaimsListCacheDuration());
    CACHE = createCache(effectiveExpiry);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'cursor'
in `core/src/main/java/google/registry/model/common/Cursor.java`
#### Snippet
```java
   * Returns the current time for a given cursor, or {@code START_OF_TIME} if the cursor is null.
   */
  public static DateTime getCursorTimeOrStartOfTime(Optional<Cursor> cursor) {
    return cursor.map(Cursor::getCursorTime).orElse(START_OF_TIME);
  }
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for parameter 'tokenKey'
in `core/src/main/java/google/registry/model/domain/packagetoken/PackageTokenResponseExtension.java`
#### Snippet
```java
  String token;

  public static PackageTokenResponseExtension create(Optional<VKey<AllocationToken>> tokenKey) {
    PackageTokenResponseExtension instance = new PackageTokenResponseExtension();
    instance.token = "";
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'autorenewEndTime'
in `core/src/main/java/google/registry/model/domain/DomainBase.java`
#### Snippet
```java
     * purposes of more legible business logic.
     */
    public B setAutorenewEndTime(Optional<DateTime> autorenewEndTime) {
      getInstance().autorenewEndTime = autorenewEndTime.orElse(END_OF_TIME);
      return thisCastToDerived();
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'dnsRefreshRequestTime'
in `core/src/main/java/google/registry/model/domain/DomainBase.java`
#### Snippet
```java
    }

    public B setDnsRefreshRequestTime(Optional<DateTime> dnsRefreshRequestTime) {
      getInstance().dnsRefreshRequestTime = dnsRefreshRequestTime.orElse(null);
      return thisCastToDerived();
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'driveFolderId'
in `core/src/main/java/google/registry/tools/CreateOrUpdateTldCommand.java`
#### Snippet
```java
      converter = OptionalStringParameter.class,
      validateWith = OptionalStringParameter.class)
  Optional<String> driveFolderId;

  @Nullable
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'premiumListName'
in `core/src/main/java/google/registry/tools/CreateOrUpdateTldCommand.java`
#### Snippet
```java
      converter = OptionalStringParameter.class,
      validateWith = OptionalStringParameter.class)
  Optional<String> premiumListName;

  @Parameter(
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'lordnUsername'
in `core/src/main/java/google/registry/tools/CreateOrUpdateTldCommand.java`
#### Snippet
```java
      converter = OptionalStringParameter.class,
      validateWith = OptionalStringParameter.class)
  Optional<String> lordnUsername;

  @Nullable
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'poNumber'
in `core/src/main/java/google/registry/model/registrar/Registrar.java`
#### Snippet
```java
    }

    public Builder setPoNumber(Optional<String> poNumber) {
      getInstance().poNumber = poNumber.orElse(null);
      return this;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'resource'
in `core/src/main/java/google/registry/tools/GetEppResourceCommand.java`
#### Snippet
```java
   */
  void printResource(
      String resourceType, String uniqueId, Optional<? extends EppResource> resource) {
    System.out.println(
        resource.isPresent()
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'fax'
in `core/src/main/java/google/registry/tools/RegistrarPocCommand.java`
#### Snippet
```java
      converter = OptionalPhoneNumberParameter.class,
      validateWith = OptionalPhoneNumberParameter.class)
  private Optional<String> fax;

  @Nullable
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'phone'
in `core/src/main/java/google/registry/tools/RegistrarPocCommand.java`
#### Snippet
```java
      converter = OptionalPhoneNumberParameter.class,
      validateWith = OptionalPhoneNumberParameter.class)
  private Optional<String> phone;

  @Nullable
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'poNumber'
in `core/src/main/java/google/registry/tools/CreateOrUpdateRegistrarCommand.java`
#### Snippet
```java
      converter = OptionalStringParameter.class,
      validateWith = OptionalStringParameter.class)
  private Optional<String> poNumber;

  @Nullable
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'ianaId'
in `core/src/main/java/google/registry/tools/CreateOrUpdateRegistrarCommand.java`
#### Snippet
```java
      converter = OptionalLongParameter.class,
      validateWith = OptionalLongParameter.class)
  Optional<Long> ianaId;

  @Nullable
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'driveFolderId'
in `core/src/main/java/google/registry/tools/CreateOrUpdateRegistrarCommand.java`
#### Snippet
```java
      converter = OptionalStringParameter.class,
      validateWith = OptionalStringParameter.class)
  Optional<String> driveFolderId;

  @Nullable
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'phone'
in `core/src/main/java/google/registry/tools/CreateOrUpdateRegistrarCommand.java`
#### Snippet
```java
      converter = OptionalPhoneNumberParameter.class,
      validateWith = OptionalPhoneNumberParameter.class)
  Optional<String> phone;

  @Nullable
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'fax'
in `core/src/main/java/google/registry/tools/CreateOrUpdateRegistrarCommand.java`
#### Snippet
```java
      converter = OptionalPhoneNumberParameter.class,
      validateWith = OptionalPhoneNumberParameter.class)
  Optional<String> fax;

  @Nullable
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'url'
in `core/src/main/java/google/registry/tools/CreateOrUpdateRegistrarCommand.java`
#### Snippet
```java
      converter = OptionalStringParameter.class,
      validateWith = OptionalStringParameter.class)
  private Optional<String> url;

  @Nullable
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'cursor'
in `core/src/main/java/google/registry/tools/ListCursorsCommand.java`
#### Snippet
```java
  }

  private static String renderLine(String name, Optional<Cursor> cursor) {
    return String.format(
        OUTPUT_FMT,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'relockDuration'
in `core/src/main/java/google/registry/tools/DomainLockUtils.java`
#### Snippet
```java
   */
  public RegistryLock administrativelyApplyUnlock(
      String domainName, String registrarId, boolean isAdmin, Optional<Duration> relockDuration) {
    RegistryLock lock =
        jpaTm()
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'relockDuration'
in `core/src/main/java/google/registry/tools/DomainLockUtils.java`
#### Snippet
```java

  private RegistryLock.Builder createUnlockBuilder(
      String domainName, String registrarId, boolean isAdmin, Optional<Duration> relockDuration) {
    DateTime now = jpaTm().getTransactionTime();
    Domain domain = getDomain(domainName, registrarId, now);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'relockDuration'
in `core/src/main/java/google/registry/tools/DomainLockUtils.java`
#### Snippet
```java
   */
  public RegistryLock saveNewRegistryUnlockRequest(
      String domainName, String registrarId, boolean isAdmin, Optional<Duration> relockDuration) {
    return jpaTm()
        .transact(
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'clientId'
in `core/src/main/java/google/registry/tools/server/CreateGroupsAction.java`
#### Snippet
```java
  @Inject Response response;
  @Inject @Config("gSuiteDomainName") String gSuiteDomainName;
  @Inject @Parameter("clientId") Optional<String> clientId;
  @Inject CreateGroupsAction() {}

```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for parameter 'contact'
in `core/src/main/java/google/registry/whois/DomainWhoisResponse.java`
#### Snippet
```java
    /** Emit the contact entry of the given type. */
    DomainEmitter emitContact(
        String contactType, Optional<VKey<Contact>> contact, boolean preferUnicode) {
      if (!contact.isPresent()) {
        return this;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'idParam'
in `core/src/main/java/google/registry/export/sheet/SyncRegistrarsSheetAction.java`
#### Snippet
```java
  @Inject @Config("sheetLockTimeout") Duration timeout;
  @Inject @Config("sheetRegistrarId") Optional<String> idConfig;
  @Inject @Parameter("id") Optional<String> idParam;
  @Inject LockHandler lockHandler;
  @Inject SyncRegistrarsSheetAction() {}
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'idConfig'
in `core/src/main/java/google/registry/export/sheet/SyncRegistrarsSheetAction.java`
#### Snippet
```java
  @Inject SyncRegistrarsSheet syncRegistrarsSheet;
  @Inject @Config("sheetLockTimeout") Duration timeout;
  @Inject @Config("sheetRegistrarId") Optional<String> idConfig;
  @Inject @Parameter("id") Optional<String> idParam;
  @Inject LockHandler lockHandler;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'printHeaderRow'
in `core/src/main/java/google/registry/tools/server/ListObjectsAction.java`
#### Snippet
```java
  @Inject JsonResponse response;
  @Inject @Parameter("fields") Optional<String> fields;
  @Inject @Parameter("printHeaderRow") Optional<Boolean> printHeaderRow;
  @Inject @Parameter("fullFieldNames") Optional<Boolean> fullFieldNames;

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'fields'
in `core/src/main/java/google/registry/tools/server/ListObjectsAction.java`
#### Snippet
```java

  @Inject JsonResponse response;
  @Inject @Parameter("fields") Optional<String> fields;
  @Inject @Parameter("printHeaderRow") Optional<Boolean> printHeaderRow;
  @Inject @Parameter("fullFieldNames") Optional<Boolean> fullFieldNames;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'fullFieldNames'
in `core/src/main/java/google/registry/tools/server/ListObjectsAction.java`
#### Snippet
```java
  @Inject @Parameter("fields") Optional<String> fields;
  @Inject @Parameter("printHeaderRow") Optional<Boolean> printHeaderRow;
  @Inject @Parameter("fullFieldNames") Optional<Boolean> fullFieldNames;

  /** Returns the set of objects to list, in the desired listing order. */
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'yearMonthOptional'
in `core/src/main/java/google/registry/reporting/ReportingModule.java`
#### Snippet
```java
  @Provides
  static YearMonth provideYearMonth(
      @Parameter(PARAM_YEAR_MONTH) Optional<YearMonth> yearMonthOptional,
      @Parameter(PARAM_DATE) LocalDate date) {
    return yearMonthOptional.orElseGet(() -> new YearMonth(date.minusMonths(1)));
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'gSuiteSupportGroupEmailAddress'
in `core/src/main/java/google/registry/request/auth/AuthenticatedRegistrarAccessor.java`
#### Snippet
```java
  private static boolean userIsAdmin(
      AuthResult authResult,
      Optional<String> gSuiteSupportGroupEmailAddress,
      Lazy<GroupsConnection> lazyGroupsConnection) {
    if (!authResult.userAuthInfo().isPresent()) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'gSuiteSupportGroupEmailAddress'
in `core/src/main/java/google/registry/request/auth/AuthenticatedRegistrarAccessor.java`
#### Snippet
```java
      AuthResult authResult,
      @Config("registryAdminClientId") String registryAdminRegistrarId,
      @Config("gSuiteSupportGroupEmailAddress") Optional<String> gSuiteSupportGroupEmailAddress,
      Lazy<GroupsConnection> lazyGroupsConnection) {
    this.isAdmin = userIsAdmin(authResult, gSuiteSupportGroupEmailAddress, lazyGroupsConnection);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'gSuiteSupportGroupEmailAddress'
in `core/src/main/java/google/registry/request/auth/AuthenticatedRegistrarAccessor.java`
#### Snippet
```java
      Lazy<GroupsConnection> lazyGroupsConnection,
      String userEmail,
      Optional<String> gSuiteSupportGroupEmailAddress) {
    if (!gSuiteSupportGroupEmailAddress.isPresent()) {
      return false;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'overrideSubdir'
in `core/src/main/java/google/registry/reporting/icann/IcannReportingStagingAction.java`
#### Snippet
```java

  @Inject YearMonth yearMonth;
  @Inject @Parameter(PARAM_SUBDIR) Optional<String> overrideSubdir;
  @Inject @Parameter(PARAM_REPORT_TYPES) ImmutableSet<ReportType> reportTypes;
  @Inject IcannReportingStager stager;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'languageValidator'
in `core/src/main/java/google/registry/tldconfig/idn/IdnTable.java`
#### Snippet
```java

  /** Validates the language rules associated with this IDN table. */
  private final Optional<LanguageValidator> languageValidator;

  private IdnTable(
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'languageValidator'
in `core/src/main/java/google/registry/tldconfig/idn/IdnTable.java`
#### Snippet
```java
      URI policy,
      ImmutableRangeSet<Integer> validCodepoints,
      Optional<LanguageValidator> languageValidator) {
    this.name = name;
    this.url = checkNotNull(url, "%s missing '# URL: http://foo.example/page' line", name);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'languageValidator'
in `core/src/main/java/google/registry/tldconfig/idn/IdnTable.java`
#### Snippet
```java
  /** Creates an IDN table given the lines from text file. */
  static IdnTable createFrom(
      String language, Iterable<String> data, Optional<LanguageValidator> languageValidator) {
    ImmutableRangeSet.Builder<Integer> rangeSet = new ImmutableRangeSet.Builder<>();
    URI url = null;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'version'
in `core/src/main/java/google/registry/privileges/secretmanager/SecretManagerClient.java`
#### Snippet
```java
   *     will be returned
   */
  String getSecretData(String secretId, Optional<String> version);

  /**
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'registrarId'
in `core/src/main/java/google/registry/monitoring/whitebox/EppMetric.java`
#### Snippet
```java
    public abstract Builder setRegistrarId(String registrarId);

    public abstract Builder setRegistrarId(Optional<String> registrarId);

    public abstract Builder setTld(String tld);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'tld'
in `core/src/main/java/google/registry/monitoring/whitebox/EppMetric.java`
#### Snippet
```java
    public abstract Builder setTld(String tld);

    public abstract Builder setTld(Optional<String> tld);

    /**
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'tmForTest'
in `core/src/main/java/google/registry/persistence/transaction/TransactionManagerFactory.java`
#### Snippet
```java

  /** Optional override to manually set the transaction manager per-test. */
  private static Optional<TransactionManager> tmForTest = Optional.empty();

  /** Supplier for jpaTm so that it is initialized only once, upon first usage. */
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'replicaInstanceConnectionName'
in `core/src/main/java/google/registry/persistence/PersistenceModule.java`
#### Snippet
```java
      @PartialCloudSqlConfigs ImmutableMap<String, String> cloudSqlConfigs,
      @Config("cloudSqlReplicaInstanceConnectionName")
          Optional<String> replicaInstanceConnectionName,
      Clock clock) {
    HashMap<String, String> overrides = Maps.newHashMap(cloudSqlConfigs);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'replicaInstanceConnectionName'
in `core/src/main/java/google/registry/persistence/PersistenceModule.java`
#### Snippet
```java
      @BeamPipelineCloudSqlConfigs ImmutableMap<String, String> beamCloudSqlConfigs,
      @Config("cloudSqlReplicaInstanceConnectionName")
          Optional<String> replicaInstanceConnectionName,
      Clock clock) {
    HashMap<String, String> overrides = Maps.newHashMap(beamCloudSqlConfigs);
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for parameter 'instanceConnectionNameOverride'
in `core/src/main/java/google/registry/persistence/PersistenceModule.java`
#### Snippet
```java
      SqlCredentialStore credentialStore,
      @Config("instanceConnectionNameOverride")
          Optional<Provider<String>> instanceConnectionNameOverride,
      @Config("beamIsolationOverride")
          Optional<Provider<TransactionIsolationLevel>> isolationOverride,
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for parameter 'isolationOverride'
in `core/src/main/java/google/registry/persistence/PersistenceModule.java`
#### Snippet
```java
          Optional<Provider<String>> instanceConnectionNameOverride,
      @Config("beamIsolationOverride")
          Optional<Provider<TransactionIsolationLevel>> isolationOverride,
      @PartialCloudSqlConfigs ImmutableMap<String, String> cloudSqlConfigs) {
    HashMap<String, String> overrides = Maps.newHashMap(cloudSqlConfigs);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'reference'
in `util/src/main/java/google/registry/util/PreconditionsUtils.java`
#### Snippet
```java

  /** Checks if the provided Optional is present, returns its value if so, and throws IAE if not. */
  public static <T> T checkArgumentPresent(@Nullable Optional<T> reference) {
    checkArgumentNotNull(reference);
    checkArgument(reference.isPresent());
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'reference'
in `util/src/main/java/google/registry/util/PreconditionsUtils.java`
#### Snippet
```java
  /** Checks if the provided Optional is present, returns its value if so, and throws IAE if not. */
  public static <T> T checkArgumentPresent(
      @Nullable Optional<T> reference, @Nullable Object errorMessage) {
    checkArgumentNotNull(reference, errorMessage);
    checkArgument(reference.isPresent(), errorMessage);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'reference'
in `util/src/main/java/google/registry/util/PreconditionsUtils.java`
#### Snippet
```java
  /** Checks if the provided Optional is present, returns its value if so, and throws IAE if not. */
  public static <T> T checkArgumentPresent(
      @Nullable Optional<T> reference,
      @Nullable String errorMessageTemplate,
      @Nullable Object... errorMessageArgs) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'jitterSeconds'
in `util/src/main/java/google/registry/util/CloudTasksUtils.java`
#### Snippet
```java
      String service,
      Multimap<String, String> params,
      Optional<Integer> jitterSeconds) {
    if (!jitterSeconds.isPresent() || jitterSeconds.get() <= 0) {
      return createTask(path, method, service, params);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'jitterSeconds'
in `util/src/main/java/google/registry/util/CloudTasksUtils.java`
#### Snippet
```java
      String service,
      Multimap<String, String> params,
      Optional<Integer> jitterSeconds) {
    return createTaskWithJitter(path, HttpMethod.GET, service, params, jitterSeconds);
  }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'jitterSeconds'
in `util/src/main/java/google/registry/util/CloudTasksUtils.java`
#### Snippet
```java
      String service,
      Multimap<String, String> params,
      Optional<Integer> jitterSeconds) {
    return createTaskWithJitter(path, HttpMethod.POST, service, params, jitterSeconds);
  }
```

## RuleId[ruleID=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/SendEscrowReportToIcannCommand.java`
#### Snippet
```java
    for (Path file : files) {
      rdeReporter.get().send(Files.readAllBytes(file));
      System.out.printf("Uploaded: %s\n", file);
    }
  }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/CreateOrUpdateTldCommand.java`
#### Snippet
```java
        // TODO(b/20764952): need invoicing support for multiple renew billing costs.
        if (renewBillingCostTransitions.size() > 1) {
          System.err.println(
              "----------------------\n"
                  + "WARNING: Do not set multiple renew cost transitions "
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/CreateOrUpdateTldCommand.java`
#### Snippet
```java
          tld);
      if (overrideReservedListRules) {
        System.err.println("Error overridden: " + errMsg);
      } else {
        throw new IllegalArgumentException(errMsg);
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/LoadTestCommand.java`
#### Snippet
```java
  @Override
  protected String execute() throws Exception {
    System.err.println("Initiating load test...");

    ImmutableMap<String, Object> params = new ImmutableMap.Builder<String, Object>()
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/LoadTestCommand.java`
#### Snippet
```java
  protected boolean checkExecutionState() {
    if (RegistryToolEnvironment.get() == RegistryToolEnvironment.PRODUCTION) {
      System.err.println("You may not run a load test against production.");
      return false;
    }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/LoadTestCommand.java`
#### Snippet
```java
    // Check validity of TLD and Client Id.
    if (!Registries.getTlds().contains(tld)) {
      System.err.printf("No such TLD: %s\n", tld);
      return false;
    }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/LoadTestCommand.java`
#### Snippet
```java
    }
    if (!Registrar.loadByRegistrarId(clientId).isPresent()) {
      System.err.printf("No such client: %s\n", clientId);
      return false;
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/GetTldCommand.java`
#### Snippet
```java
  public void run() {
    for (String tld : assertTldsExist(mainParameters)) {
      System.out.println(Registry.get(tld));
    }
  }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/CanonicalizeLabelsCommand.java`
#### Snippet
```java
      return canonicalizeHostname(rawLabel.replaceAll(" ", ""));
    } catch (Exception e) {
      System.err.printf("Error canonicalizing %s: %s\n", rawLabel, e.getMessage());
      return "";
    }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/CanonicalizeLabelsCommand.java`
#### Snippet
```java
      if (canonical.startsWith(DomainNameUtils.ACE_PREFIX)
          && Idn.toUnicode(canonical).equals(canonical)) {
        System.err.println("Bad IDN: " + label);
        continue;  // Bad IDN code points.
      }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/CanonicalizeLabelsCommand.java`
#### Snippet
```java
    }
    labels.remove("");  // We used "" for invalid labels.
    System.out.println(Joiner.on('\n').join(labels));
  }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/LoginCommand.java`
#### Snippet
```java
              url -> {
                int remotePort = forwardingServerReceiver.getRemotePort();
                System.out.printf(
                    "Please first run the following command in a separate terminal on your local "
                        + "host:\n\n  ssh -L %s:localhost:%s %s\n\n",
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/LoginCommand.java`
#### Snippet
```java
                        + "host:\n\n  ssh -L %s:localhost:%s %s\n\n",
                    port, remotePort, remoteHost);
                System.out.printf(
                    "Please then open the following URL in your local browser and follow the"
                        + " instructions:\n\n  %s\n\n",
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/AckPollMessagesCommand.java`
#### Snippet
```java
      PollFlowUtils.ackPollMessage(pollMessage);
    }
    System.out.println(
        Joiner.on(',')
            .join(
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/GetPremiumListCommand.java`
#### Snippet
```java
      Optional<PremiumList> premiumList = PremiumListDao.getLatestRevision(premiumListName);
      if (premiumList.isPresent()) {
        System.out.printf(
            "%s:\n%s\n",
            premiumListName,
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/GetPremiumListCommand.java`
#### Snippet
```java
                .collect(Collectors.joining("\n")));
      } else {
        System.out.printf("No list found with name %s.%n", premiumListName);
      }
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/PendingEscrowCommand.java`
#### Snippet
```java
  @Override
  public void run() {
    System.out.println(
        SORTER
            .sortedCopy(checker.getTldsAndWatermarksPendingDepositForRdeAndBrda().values())
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/RegistryCli.java`
#### Snippet
```java
    if (showAllCommands || parsedCommand == null) {
      if (parsedCommand == null) {
        System.out.println("The list of available subcommands is:");
      }
      commands.keySet().forEach(System.out::println);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/RegistryCli.java`
#### Snippet
```java
        System.out.println("The list of available subcommands is:");
      }
      commands.keySet().forEach(System.out::println);
      return;
    }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/RegistryCli.java`
#### Snippet
```java
    } catch (RuntimeException e) {
      if (Throwables.getRootCause(e) instanceof LoginRequiredException) {
        System.err.println("===================================================================");
        System.err.println("You must login using 'nomulus login' prior to running this command.");
        System.err.println("===================================================================");
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/RegistryCli.java`
#### Snippet
```java
      if (Throwables.getRootCause(e) instanceof LoginRequiredException) {
        System.err.println("===================================================================");
        System.err.println("You must login using 'nomulus login' prior to running this command.");
        System.err.println("===================================================================");
        System.exit(1);
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/RegistryCli.java`
#### Snippet
```java
        System.err.println("===================================================================");
        System.err.println("You must login using 'nomulus login' prior to running this command.");
        System.err.println("===================================================================");
        System.exit(1);
      } else {
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/RegistryCli.java`
#### Snippet
```java
        if (psqlException.isPresent() && psqlException.get().getMessage().contains("google:5432")) {
          e.printStackTrace();
          System.err.println("===================================================================");
          System.err.println(
              "This error is likely the result of having another instance of\n"
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/RegistryCli.java`
#### Snippet
```java
          e.printStackTrace();
          System.err.println("===================================================================");
          System.err.println(
              "This error is likely the result of having another instance of\n"
                  + "nomulus running at the same time.  Check your system, shut down\n"
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/RegistryCli.java`
#### Snippet
```java
                  + "nomulus running at the same time.  Check your system, shut down\n"
                  + "the other instance, and try again.");
          System.err.println("===================================================================");
        } else {
          throw e;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/GenerateZoneFilesCommand.java`
#### Snippet
```java
        "exportTime", exportDate.toString());
    Map<String, Object> response = connection.sendJson(GenerateZoneFilesAction.PATH, params);
    System.out.println("Output files:");
    @SuppressWarnings("unchecked")
    List<String> filenames = (List<String>) response.get("filenames");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/GenerateZoneFilesCommand.java`
#### Snippet
```java
    List<String> filenames = (List<String>) response.get("filenames");
    for (String filename : filenames) {
      System.out.println(filename);
    }
  }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/ConfirmingCommand.java`
#### Snippet
```java
  private static void printLineIfNotEmpty(String text) {
    if (!Strings.isNullOrEmpty(text)) {
      System.out.println(text);
    }
  }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/ConfirmingCommand.java`
#### Snippet
```java
        return;
      } else if (force || promptForYes("Perform this command?")) {
        System.out.println("Running ... ");
        System.out.println(execute());
        printLineIfNotEmpty(postExecute());
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/ConfirmingCommand.java`
#### Snippet
```java
      } else if (force || promptForYes("Perform this command?")) {
        System.out.println("Running ... ");
        System.out.println(execute());
        printLineIfNotEmpty(postExecute());
      } else {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/ConfirmingCommand.java`
#### Snippet
```java
        printLineIfNotEmpty(postExecute());
      } else {
        System.out.println("Command aborted.");
      }
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/CountDomainsCommand.java`
#### Snippet
```java
    DateTime now = clock.nowUtc();
    assertTldsExist(tlds)
        .forEach(tld -> System.out.printf("%s,%d\n", tld, getCountForTld(tld, now)));
  }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/ValidateEscrowDepositCommand.java`
#### Snippet
```java
  private static void validateXmlStream(InputStream inputStream) throws XmlException {
    XjcRdeDeposit deposit = XjcXmlTransformer.unmarshal(XjcRdeDeposit.class, inputStream);
    System.out.printf("ID: %s\n", deposit.getId());
    System.out.printf("Previous ID: %s\n", deposit.getPrevId());
    System.out.printf("Type: %s\n", deposit.getType());
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/ValidateEscrowDepositCommand.java`
#### Snippet
```java
    XjcRdeDeposit deposit = XjcXmlTransformer.unmarshal(XjcRdeDeposit.class, inputStream);
    System.out.printf("ID: %s\n", deposit.getId());
    System.out.printf("Previous ID: %s\n", deposit.getPrevId());
    System.out.printf("Type: %s\n", deposit.getType());
    System.out.printf("Watermark: %s\n", deposit.getWatermark());
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/ValidateEscrowDepositCommand.java`
#### Snippet
```java
    System.out.printf("ID: %s\n", deposit.getId());
    System.out.printf("Previous ID: %s\n", deposit.getPrevId());
    System.out.printf("Type: %s\n", deposit.getType());
    System.out.printf("Watermark: %s\n", deposit.getWatermark());
    System.out.printf("RDE Version: %s\n", deposit.getRdeMenu().getVersion());
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/ValidateEscrowDepositCommand.java`
#### Snippet
```java
    System.out.printf("Previous ID: %s\n", deposit.getPrevId());
    System.out.printf("Type: %s\n", deposit.getType());
    System.out.printf("Watermark: %s\n", deposit.getWatermark());
    System.out.printf("RDE Version: %s\n", deposit.getRdeMenu().getVersion());
    System.out.println();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/ValidateEscrowDepositCommand.java`
#### Snippet
```java
    System.out.printf("Type: %s\n", deposit.getType());
    System.out.printf("Watermark: %s\n", deposit.getWatermark());
    System.out.printf("RDE Version: %s\n", deposit.getRdeMenu().getVersion());
    System.out.println();
    System.out.printf("RDE Object URIs:\n  - %s\n",
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/ValidateEscrowDepositCommand.java`
#### Snippet
```java
    System.out.printf("Watermark: %s\n", deposit.getWatermark());
    System.out.printf("RDE Version: %s\n", deposit.getRdeMenu().getVersion());
    System.out.println();
    System.out.printf("RDE Object URIs:\n  - %s\n",
        Joiner.on("\n  - ").join(Ordering.natural().sortedCopy(deposit.getRdeMenu().getObjURIs())));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/ValidateEscrowDepositCommand.java`
#### Snippet
```java
    System.out.printf("RDE Version: %s\n", deposit.getRdeMenu().getVersion());
    System.out.println();
    System.out.printf("RDE Object URIs:\n  - %s\n",
        Joiner.on("\n  - ").join(Ordering.natural().sortedCopy(deposit.getRdeMenu().getObjURIs())));
    Set<String> hostnames = new HashSet<>();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/ValidateEscrowDepositCommand.java`
#### Snippet
```java
      }
    }
    System.out.println();
    System.out.println("Contents:");
    for (Map.Entry<String, Long> count : counts.entrySet()) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/ValidateEscrowDepositCommand.java`
#### Snippet
```java
    }
    System.out.println();
    System.out.println("Contents:");
    for (Map.Entry<String, Long> count : counts.entrySet()) {
      System.out.printf("  - %s: %,d %s\n",
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/ValidateEscrowDepositCommand.java`
#### Snippet
```java
    System.out.println("Contents:");
    for (Map.Entry<String, Long> count : counts.entrySet()) {
      System.out.printf("  - %s: %,d %s\n",
          count.getKey(),
          count.getValue(),
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/ValidateEscrowDepositCommand.java`
#### Snippet
```java
          count.getValue() == 1L ? "entry" : "entries");
    }
    System.out.println();
    boolean good = true;
    ImmutableList<String> badHostnameRefs =
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/ValidateEscrowDepositCommand.java`
#### Snippet
```java
        ImmutableList.copyOf(difference(hostnameRefs, hostnames));
    if (!badHostnameRefs.isEmpty()) {
      System.out.printf("Bad host refs: %s\n", Joiner.on(", ").join(badHostnameRefs));
      good = false;
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/ValidateEscrowDepositCommand.java`
#### Snippet
```java
    ImmutableList<String> badContactRefs = ImmutableList.copyOf(difference(contactRefs, contacts));
    if (!badContactRefs.isEmpty()) {
      System.out.printf("Bad contact refs: %s\n", Joiner.on(", ").join(badContactRefs));
      good = false;
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/ValidateEscrowDepositCommand.java`
#### Snippet
```java
        ImmutableList.copyOf(difference(registrarRefs, registrars));
    if (!badRegistrarRefs.isEmpty()) {
      System.out.printf("Bad registrar refs: %s\n", Joiner.on(", ").join(badRegistrarRefs));
      good = false;
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/ValidateEscrowDepositCommand.java`
#### Snippet
```java
    }
    if (good) {
      System.out.println("RDE deposit is XML schema valid");
    } else {
      System.out.println("RDE deposit is XML schema valid but has bad references");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/ValidateEscrowDepositCommand.java`
#### Snippet
```java
      System.out.println("RDE deposit is XML schema valid");
    } else {
      System.out.println("RDE deposit is XML schema valid but has bad references");
    }
  }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/GhostrydeCommand.java`
#### Snippet
```java
        InputStream ghostDecoder = Ghostryde.decoder(in, rdeStagingDecryptionKey.get())) {
      if (output == null) {
        ByteStreams.copy(ghostDecoder, System.out);
      } else {
        Path outFile =
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/GetReservedListCommand.java`
#### Snippet
```java
  public void run() throws Exception {
    if (ReservedListDao.getLatestRevision(reservedListName).isPresent()) {
      System.out.printf(
          "%s\n",
          Streams.stream(
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/GetReservedListCommand.java`
#### Snippet
```java
              .collect(Collectors.joining("\n")));
    } else {
      System.err.printf("No list found with name %s.%n", reservedListName);
    }
  }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/CreateDomainCommand.java`
#### Snippet
```java
        currency = createCost.getCurrencyUnit().getCode();
        cost = createCost.multipliedBy(period).getAmount().toString();
        System.out.printf(
            "NOTE: %s is premium at %s per year; sending total cost for %d year(s) of %s %s.\n",
            domain, createCost, period, currency, cost);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/GetEppResourceCommand.java`
#### Snippet
```java
  void printResource(
      String resourceType, String uniqueId, Optional<? extends EppResource> resource) {
    System.out.println(
        resource.isPresent()
            ? String.format(
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/DeleteAllocationTokensCommand.java`
#### Snippet
```java
      tm().delete(tokensToDelete);
    }
    System.out.printf(
        "%s tokens: %s\n",
        dryRun ? "Would delete" : "Deleted",
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/GetSqlCredentialCommand.java`
#### Snippet
```java
      credential = store.getCredential(sqlUser);
    } catch (SecretManagerException e) {
      System.out.println(e.getMessage());
      return;
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/GetSqlCredentialCommand.java`
#### Snippet
```java

    if (outputPath == null) {
      System.out.print(outputText);
      return;
    }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/VerifyOteCommand.java`
#### Snippet
```java
  public void run() throws IOException {
    if (RegistryEnvironment.get() != RegistryEnvironment.SANDBOX) {
      System.err.printf(
          "WARNING: Running against %s environment. Are "
              + "you sure you didn\'t mean to run this against sandbox (e.g. \"-e SANDBOX\")?%n",
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/VerifyOteCommand.java`
#### Snippet
```java
            "summarize", Boolean.toString(summarize),
            "registrars", new ArrayList<>(registrars)));
    System.out.println(Strings.repeat("-", 80));
    for (Entry<String, Object> registrar : response.entrySet()) {
      System.out.printf(
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/VerifyOteCommand.java`
#### Snippet
```java
    System.out.println(Strings.repeat("-", 80));
    for (Entry<String, Object> registrar : response.entrySet()) {
      System.out.printf(
          summarize ? "%-20s - %s\n" : "\n=========== %s OT&E status ============\n%s\n",
          registrar.getKey(),
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/VerifyOteCommand.java`
#### Snippet
```java
          registrar.getValue());
    }
    System.out.println(Strings.repeat("-", 80));
  }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/CurlCommand.java`
#### Snippet
```java
                mimeType,
                Joiner.on("&").join(data).getBytes(UTF_8));
    System.out.println(response);
  }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/SaveSqlCredentialCommand.java`
#### Snippet
```java
    SqlUser sqlUser = new RobotUser(SqlUser.RobotId.valueOf(Ascii.toUpperCase(user)));
    store.createOrUpdateCredential(sqlUser, password);
    System.out.printf("\nDone:[%s]\n", password);
  }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/GetHistoryEntriesCommand.java`
#### Snippet
```java
    }
    for (HistoryEntry entry : historyEntries) {
      System.out.printf(
          "Client: %s\nTime: %s\nClient TRID: %s\nServer TRID: %s\n%s\n",
          entry.getRegistrarId(),
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/GetKeyringSecretCommand.java`
#### Snippet
```java
  @Override
  public void run() throws Exception {
    OutputStream out = outputPath != null ? new FileOutputStream(outputPath.toFile()) : System.out;
    Security.addProvider(new BouncyCastleProvider());

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/UpdateAllocationTokensCommand.java`
#### Snippet
```java
      tm().putAll(batch);
    }
    System.out.printf(
        "%s tokens: %s\n",
        dryRun ? "Would update" : "Updated",
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/GetDatabaseMigrationStateCommand.java`
#### Snippet
```java
    TimedTransitionProperty<MigrationState> migrationSchedule =
        DatabaseMigrationStateSchedule.get();
    System.out.printf("Current migration schedule: %s%n", migrationSchedule.toValueMap());
  }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/ListObjectsCommand.java`
#### Snippet
```java
      }
      for (Object lineObj : (List<?>) obj) {
        System.out.println(lineObj);
      }
    // Handle unexpected status values.
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/ConvertIdnCommand.java`
#### Snippet
```java
    for (String label : mainParameters) {
      if (label.startsWith(ACE_PREFIX)) {
        System.out.println(Idn.toUnicode(Ascii.toLowerCase(label)));
      } else {
        System.out.println(canonicalizeHostname(label));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/ConvertIdnCommand.java`
#### Snippet
```java
        System.out.println(Idn.toUnicode(Ascii.toLowerCase(label)));
      } else {
        System.out.println(canonicalizeHostname(label));
      }
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/GetRoutingMapCommand.java`
#### Snippet
```java
  @Override
  public void run() throws Exception {
    System.out.println(
        RouterDisplayHelper.extractHumanReadableRoutesFromComponent(
            Class.forName(serviceClassName)));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/ShellCommand.java`
#### Snippet
```java

    private void encapsulatedRun(String[] args) throws Exception {
      PrintStream orgOut = System.out;
      PrintStream orgErr = System.err;
      try (PrintStream newOut =
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/ShellCommand.java`
#### Snippet
```java
    private void encapsulatedRun(String[] args) throws Exception {
      PrintStream orgOut = System.out;
      PrintStream orgErr = System.err;
      try (PrintStream newOut =
              new PrintStream(new EncapsulatingOutputStream(System.out, "out: "));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/ShellCommand.java`
#### Snippet
```java
      PrintStream orgErr = System.err;
      try (PrintStream newOut =
              new PrintStream(new EncapsulatingOutputStream(System.out, "out: "));
          PrintStream newErr =
              new PrintStream(new EncapsulatingOutputStream(System.out, "err: "))) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/ShellCommand.java`
#### Snippet
```java
              new PrintStream(new EncapsulatingOutputStream(System.out, "out: "));
          PrintStream newErr =
              new PrintStream(new EncapsulatingOutputStream(System.out, "err: "))) {
        System.setOut(newOut);
        System.setErr(newErr);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/ShellCommand.java`
#### Snippet
```java
     */
    private static void emitSuccess() {
      System.out.println(SUCCESS);
      System.out.flush();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/ShellCommand.java`
#### Snippet
```java
    private static void emitSuccess() {
      System.out.println(SUCCESS);
      System.out.flush();
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/ShellCommand.java`
#### Snippet
```java

    private static void emitArguments(String[] args) {
      System.out.print(RUNNING);
      Arrays.stream(args).forEach(arg -> System.out.format(" \"%s\"", STRING_ESCAPER.escape(arg)));
      System.out.println();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/ShellCommand.java`
#### Snippet
```java
    private static void emitArguments(String[] args) {
      System.out.print(RUNNING);
      Arrays.stream(args).forEach(arg -> System.out.format(" \"%s\"", STRING_ESCAPER.escape(arg)));
      System.out.println();
      System.out.flush();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/ShellCommand.java`
#### Snippet
```java
      System.out.print(RUNNING);
      Arrays.stream(args).forEach(arg -> System.out.format(" \"%s\"", STRING_ESCAPER.escape(arg)));
      System.out.println();
      System.out.flush();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/ShellCommand.java`
#### Snippet
```java
      Arrays.stream(args).forEach(arg -> System.out.format(" \"%s\"", STRING_ESCAPER.escape(arg)));
      System.out.println();
      System.out.flush();
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/ShellCommand.java`
#### Snippet
```java
     */
    private static void emitFailure(Throwable e) {
      System.out.format(
          "%s %s %s\n", FAILURE, e.getClass().getName(), STRING_ESCAPER.escape(e.getMessage()));
      System.out.flush();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/ShellCommand.java`
#### Snippet
```java
      System.out.format(
          "%s %s %s\n", FAILURE, e.getClass().getName(), STRING_ESCAPER.escape(e.getMessage()));
      System.out.flush();
    }

```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/ShellCommand.java`
#### Snippet
```java
        runner.run(lineArgs);
      } catch (Exception e) {
        System.err.println("Got an exception:\n" + e);
        e.printStackTrace();
      }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/ShellCommand.java`
#### Snippet
```java
    }
    if (!encapsulateOutput) {
      System.err.println();
    }
  }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/HashCertificateCommand.java`
#### Snippet
```java
        Joiner.on(' ').join(mainParameters));
    if (mainParameters.isEmpty()) {
      System.out.println(getCertificateHash(loadCertificate(System.in)));
    } else {
      System.out.println(getCertificateHash(loadCertificate(Paths.get(mainParameters.get(0)))));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/HashCertificateCommand.java`
#### Snippet
```java
      System.out.println(getCertificateHash(loadCertificate(System.in)));
    } else {
      System.out.println(getCertificateHash(loadCertificate(Paths.get(mainParameters.get(0)))));
    }
  }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/UnrenewDomainCommand.java`
#### Snippet
```java
            && domainsExpiringTooSoon.isEmpty());
    if (foundInvalidDomains) {
      System.err.print("Found domains that cannot be unrenewed for the following reasons:\n\n");
    }
    if (!domainsNonexistent.isEmpty()) {
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/UnrenewDomainCommand.java`
#### Snippet
```java
    }
    if (!domainsNonexistent.isEmpty()) {
      System.err.printf("Domains that don't exist: %s\n\n", domainsNonexistent);
    }
    if (!domainsDeleting.isEmpty()) {
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/UnrenewDomainCommand.java`
#### Snippet
```java
    }
    if (!domainsDeleting.isEmpty()) {
      System.err.printf("Domains that are deleted or pending delete: %s\n\n", domainsDeleting);
    }
    if (!domainsWithDisallowedStatuses.isEmpty()) {
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/UnrenewDomainCommand.java`
#### Snippet
```java
    }
    if (!domainsWithDisallowedStatuses.isEmpty()) {
      System.err.printf("Domains with disallowed statuses: %s\n\n", domainsWithDisallowedStatuses);
    }
    if (!domainsExpiringTooSoon.isEmpty()) {
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/UnrenewDomainCommand.java`
#### Snippet
```java
    }
    if (!domainsExpiringTooSoon.isEmpty()) {
      System.err.printf("Domains expiring too soon: %s\n\n", domainsExpiringTooSoon);
    }
    checkArgument(!foundInvalidDomains, "Aborting because some domains cannot be unrenewed");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/UnrenewDomainCommand.java`
#### Snippet
```java
    for (String domainName : mainParameters) {
      tm().transact(() -> unrenewDomain(domainName));
      System.out.printf("Unrenewed %s\n", domainName);
    }
    return "Successfully unrenewed all domains.";
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/GetRegistrarCommand.java`
#### Snippet
```java
              "Registrar with id %s does not exist",
              clientId);
      System.out.println(registrar);
    }
  }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/GenerateLordnCommand.java`
#### Snippet
```java
      status = "C";
    }
    System.out.printf("%s[%s] ", domain.getDomainName(), status);
  }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/WhoisQueryCommand.java`
#### Snippet
```java
  @Override
  public void run() {
    System.out.println(whois.lookup(Joiner.on(' ').join(mainParameters), unicode, fullOutput));
  }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/ListCursorsCommand.java`
#### Snippet
```java
    if (!cursorKeys.isEmpty()) {
      String header = String.format(OUTPUT_FMT, "TLD", "Cursor Time", "Last Update Time");
      System.out.printf("%s\n%s\n", header, Strings.repeat("-", header.length()));
      cursorKeys.entrySet().stream()
          .map(e -> renderLine(e.getKey(), Optional.ofNullable(cursors.get(e.getValue()))))
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/ListCursorsCommand.java`
#### Snippet
```java
          .map(e -> renderLine(e.getKey(), Optional.ofNullable(cursors.get(e.getValue()))))
          .sorted()
          .forEach(System.out::println);
    }
  }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/GetPackagePromotionCommand.java`
#### Snippet
```java
                        "PackagePromotion with package token %s does not exist",
                        token);
                System.out.println(packagePromotion);
              });
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/ForwardingServerReceiver.java`
#### Snippet
```java
  public void stop() throws IOException {
    localServerReceiver.stop();
    System.out.println("You can now exit from the SSH session created for port forwarding.");
  }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/LockOrUnlockDomainCommand.java`
#### Snippet
```java
    String duplicates = Joiner.on(", ").join(findDuplicates(mainParameters));
    checkArgument(duplicates.isEmpty(), "Duplicate domain arguments found: '%s'", duplicates);
    System.out.println(
        "== ENSURE THAT YOU HAVE AUTHENTICATED THE REGISTRAR BEFORE RUNNING THIS COMMAND ==");
  }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/GetAllocationTokenCommand.java`
#### Snippet
```java
      if (loadedTokens.containsKey(token)) {
        AllocationToken loadedToken = loadedTokens.get(token);
        System.out.println(loadedToken.toString());
        if (!loadedToken.getRedemptionHistoryId().isPresent()) {
          System.out.printf("Token %s was not redeemed.\n", token);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/GetAllocationTokenCommand.java`
#### Snippet
```java
        System.out.println(loadedToken.toString());
        if (!loadedToken.getRedemptionHistoryId().isPresent()) {
          System.out.printf("Token %s was not redeemed.\n", token);
        } else {
          VKey<Domain> domainKey =
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/GetAllocationTokenCommand.java`
#### Snippet
```java
          Domain domain = domains.get(domainKey);
          if (domain == null) {
            System.out.printf("ERROR: Token %s was redeemed but domain can't be loaded.\n", token);
          } else {
            System.out.printf(
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/GetAllocationTokenCommand.java`
#### Snippet
```java
            System.out.printf("ERROR: Token %s was redeemed but domain can't be loaded.\n", token);
          } else {
            System.out.printf(
                "Token %s was redeemed to create domain %s at %s.\n",
                token, domain.getDomainName(), domain.getCreationTime());
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/GetAllocationTokenCommand.java`
#### Snippet
```java
        }
      } else {
        System.out.printf("ERROR: Token %s does not exist.\n", token);
      }
      System.out.println();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/GetAllocationTokenCommand.java`
#### Snippet
```java
        System.out.printf("ERROR: Token %s does not exist.\n", token);
      }
      System.out.println();
    }
  }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/javascrap/CreateCancellationsForOneTimesCommand.java`
#### Snippet
```java
                  () -> {
                    if (alreadyCancelled(oneTime)) {
                      System.out.printf(
                          "OneTime %d already cancelled, this is unexpected.\n", oneTime.getId());
                      return 0;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/javascrap/CreateCancellationsForOneTimesCommand.java`
#### Snippet
```java
                                .setTargetId(oneTime.getTargetId())
                                .build());
                    System.out.printf(
                        "Added Cancellation for OneTime with ID %d\n", oneTime.getId());
                    return 1;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/javascrap/CreateCancellationsForOneTimesCommand.java`
#### Snippet
```java
            });
    oneTimesToCancel = oneTimesBuilder.build();
    System.out.printf("Found %d OneTime(s) to cancel\n", oneTimesToCancel.size());
    ImmutableSet<Long> missingIds = missingIdsBuilder.build();
    if (!missingIds.isEmpty()) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/javascrap/CreateCancellationsForOneTimesCommand.java`
#### Snippet
```java
    ImmutableSet<Long> missingIds = missingIdsBuilder.build();
    if (!missingIds.isEmpty()) {
      System.out.printf("Missing OneTime(s) for IDs %s\n", missingIds);
    }
    ImmutableSet<Long> alreadyCancelledIds = alreadyCancelledIdsBuilder.build();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/javascrap/CreateCancellationsForOneTimesCommand.java`
#### Snippet
```java
    ImmutableSet<Long> alreadyCancelledIds = alreadyCancelledIdsBuilder.build();
    if (!alreadyCancelledIds.isEmpty()) {
      System.out.printf(
          "The following OneTime IDs were already cancelled: %s\n", alreadyCancelledIds);
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/GenerateAllocationTokensCommand.java`
#### Snippet
```java
    }
    savedTokens.forEach(
        t -> System.out.println(SKIP_NULLS.join(t.getDomainName().orElse(null), t.getToken())));
    return savedTokens.size();
  }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/javascrap/CompareEscrowDepositsCommand.java`
#### Snippet
```java
    ImmutableList<String> uniqueElements = ImmutableList.copyOf(difference(set1, set2));
    if (!uniqueElements.isEmpty()) {
      System.out.printf(
          "%s only in %s:\n%s\n", element, deposit, Joiner.on("\n").join(uniqueElements));
      return false;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/javascrap/CompareEscrowDepositsCommand.java`
#### Snippet
```java
    good &= printUniqueElements(registrars2, registrars1, "registrars", "deposit2");
    if (good) {
      System.out.println(
          "The two deposits contain the same domains and registrars. "
              + "You still need to run validate_escrow_deposit to check reference consistency.");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/javascrap/CompareEscrowDepositsCommand.java`
#### Snippet
```java
              + "You still need to run validate_escrow_deposit to check reference consistency.");
    } else {
      System.out.println("The two deposits differ.");
    }
  }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/javascrap/CreateSyntheticDomainHistoriesCommand.java`
#### Snippet
```java
                int numProcessed = numDomainsProcessed.incrementAndGet();
                if (numProcessed % 1000 == 0) {
                  System.out.printf("Saved histories for %d domains%n", numProcessed);
                }
                return null;
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `core/src/nonprod/java/google/registry/tools/GenerateSqlSchemaCommand.java`
#### Snippet
```java
      // Complain if the user has also specified either --db_host or --db_port.
      if (databaseHost != null || databasePort != null) {
        System.err.println(DB_OPTIONS_CLASH);
        // TODO: it would be nice to exit(1) here, but this breaks testability.
        return;
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `core/src/nonprod/java/google/registry/tools/GenerateSqlSchemaCommand.java`
#### Snippet
```java
      databasePort = postgresContainer.getMappedPort(POSTGRESQL_PORT);
    } else if (databaseHost == null) {
      System.err.println(
          "You must specify either --start_postgresql to start a PostgreSQL database in a\n"
              + "docker instance, or specify --db_host (and, optionally, --db_port) to identify\n"
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `core/src/nonprod/java/google/registry/tools/GenerateSqlSchemaCommand.java`
#### Snippet
```java
        Files.write(outputFile.toPath(), copyright.getBytes(UTF_8));
      } catch (IOException e) {
        System.err.println("Error writing sql file: " + e);
        e.printStackTrace();
        System.exit(1);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `docs/src/main/java/google/registry/documentation/FlowDocumentationTool.java`
#### Snippet
```java
    String output = docGenerator.generateMarkdown();
    if (outputFileName.equals("-")) {
      System.out.println(output);
    } else {
      if (outputFileName == null) {
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `core/src/nonprod/java/google/registry/tools/PostgresqlCommand.java`
#### Snippet
```java
      // Complain if the user has also specified either --db_host or --db_port.
      if (databaseHost != null || databasePort != null) {
        System.err.println(DB_OPTIONS_CLASH);
        // TODO: it would be nice to exit(1) here, but this breaks testability.
        return false;
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `core/src/nonprod/java/google/registry/tools/PostgresqlCommand.java`
#### Snippet
```java
      databasePort = postgresContainer.getMappedPort(POSTGRESQL_PORT);
    } else if (databaseHost == null) {
      System.err.println(
          "You must specify either --start_postgresql to start a PostgreSQL database in a\n"
              + "docker instance, or specify --db_host (and, optionally, --db_port) to identify\n"
```

## RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/src/main/java/google/registry/xml/XmlTransformer.java`
#### Snippet
```java
      // https://stackoverflow.com/questions/58478632/how-to-avoid-extra-blank-lines-in-xml-generation-with-java
      // Note that a simple regex replace is waaaaay more performant than using an XSLT.
      return prettyXml.toString().replaceAll("\\n\\s*\\n", "\n");
    } catch (TransformerException e) {
      return xmlString;  // We couldn't prettify it, but that's ok; fail gracefully.
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/src/main/java/google/registry/xml/XmlTransformer.java`
#### Snippet
```java
            sae.getLineNumber(),
            sae.getColumnNumber(),
            nullToEmpty(sae.getMessage()).replaceAll("&quot;", "")));
      }
      // These get thrown for attempted XXE attacks.
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/src/main/java/google/registry/xml/XmlTransformer.java`
#### Snippet
```java
            xse.getLocation().getColumnNumber(),
            nullToEmpty(xse.getMessage())
                .replaceAll("^.*\nMessage: ", "")  // Strip an ugly prefix from XMLStreamException.
                .replaceAll("&quot;", "")));
      }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/src/main/java/google/registry/xml/XmlTransformer.java`
#### Snippet
```java
            nullToEmpty(xse.getMessage())
                .replaceAll("^.*\nMessage: ", "")  // Strip an ugly prefix from XMLStreamException.
                .replaceAll("&quot;", "")));
      }
      throw new XmlException(e);
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/src/main/java/google/registry/batch/DeleteExpiredDomainsAction.java`
#### Snippet
```java
                          true,
                          deleteXmlTmpl
                              .replace("%DOMAIN%", transDomain.getDomainName())
                              .getBytes(UTF_8)));
                });
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/src/main/java/google/registry/flows/FlowRunner.java`
#### Snippet
```java
        registrarId,
        sessionMetadata,
        prettyXml.replace("\n", "\n\t"),
        credentials,
        eppRequestSource,
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/src/main/java/google/registry/rdap/RdapJsonFormatter.java`
#### Snippet
```java
    String jpql =
        GET_LAST_HISTORY_BY_TYPE_JPQL_TEMPLATE
            .replace("%entityName%", entityName)
            .replace("%repoIdValue%", resourceVkey.getKey().toString());
    Iterable<HistoryEntry> historyEntries =
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/src/main/java/google/registry/rdap/RdapJsonFormatter.java`
#### Snippet
```java
        GET_LAST_HISTORY_BY_TYPE_JPQL_TEMPLATE
            .replace("%entityName%", entityName)
            .replace("%repoIdValue%", resourceVkey.getKey().toString());
    Iterable<HistoryEntry> historyEntries =
        replicaJpaTm()
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/src/main/java/google/registry/model/OteAccountBuilder.java`
#### Snippet
```java
      boolean isEarlyAccess,
      int roidSuffix) {
    String tldNameAlphaNumerical = tldName.replaceAll("[^a-z0-9]", "");
    Optional<PremiumList> premiumList = PremiumListDao.getLatestRevision(DEFAULT_PREMIUM_LIST);
    checkState(premiumList.isPresent(), "Couldn't find premium list %s.", DEFAULT_PREMIUM_LIST);
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/src/main/java/google/registry/model/ImmutableObject.java`
#### Snippet
```java
    return String.format(
                "%s: {\n%s", getClass().getSimpleName(), Joiner.on('\n').join(fields.entrySet()))
            .replaceAll("\n", "\n    ")
        + "\n}";
  }
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/src/main/java/google/registry/model/ForeignKeyUtils.java`
#### Snippet
```java
                            + " deletionTime) IN (SELECT %fkProperty%, MAX(deletionTime) FROM"
                            + " %entity% WHERE %fkProperty% IN (:fks) GROUP BY %fkProperty%)")
                        .replace("%fkProperty%", fkProperty)
                        .replace("%entity%", clazz.getSimpleName()),
                    Object[].class)
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/src/main/java/google/registry/model/ForeignKeyUtils.java`
#### Snippet
```java
                            + " %entity% WHERE %fkProperty% IN (:fks) GROUP BY %fkProperty%)")
                        .replace("%fkProperty%", fkProperty)
                        .replace("%entity%", clazz.getSimpleName()),
                    Object[].class)
                .setParameter("fks", foreignKeys)
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/src/main/java/google/registry/tools/CanonicalizeLabelsCommand.java`
#### Snippet
```java
  private String canonicalize(String rawLabel) {
    try {
      return canonicalizeHostname(rawLabel.replaceAll(" ", ""));
    } catch (Exception e) {
      System.err.printf("Error canonicalizing %s: %s\n", rawLabel, e.getMessage());
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/src/main/java/google/registry/tools/CanonicalizeLabelsCommand.java`
#### Snippet
```java
      if (!canonical.startsWith("xn--")) {
        // Using both "" and "-" to canonicalize labels.
        labels.add(canonicalize(label.replaceAll(" ", "")));
        labels.add(canonicalize(label.replaceAll(" ", "-")));
        labels.add(canonicalize(label.replaceAll("_", "")));
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/src/main/java/google/registry/tools/CanonicalizeLabelsCommand.java`
#### Snippet
```java
        // Using both "" and "-" to canonicalize labels.
        labels.add(canonicalize(label.replaceAll(" ", "")));
        labels.add(canonicalize(label.replaceAll(" ", "-")));
        labels.add(canonicalize(label.replaceAll("_", "")));
        labels.add(canonicalize(label.replaceAll("_", "-")));
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/src/main/java/google/registry/tools/CanonicalizeLabelsCommand.java`
#### Snippet
```java
        labels.add(canonicalize(label.replaceAll(" ", "")));
        labels.add(canonicalize(label.replaceAll(" ", "-")));
        labels.add(canonicalize(label.replaceAll("_", "")));
        labels.add(canonicalize(label.replaceAll("_", "-")));
      }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/src/main/java/google/registry/tools/CanonicalizeLabelsCommand.java`
#### Snippet
```java
        labels.add(canonicalize(label.replaceAll(" ", "-")));
        labels.add(canonicalize(label.replaceAll("_", "")));
        labels.add(canonicalize(label.replaceAll("_", "-")));
      }
    }
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/src/main/java/google/registry/tools/CreateReservedListCommand.java`
#### Snippet
```java
          tld, "The name must be in the format {tld|common}_list-name, yet TLD %s does not exist");
    }
    checkArgument(nameParts.get(1).matches("[-a-zA-Z0-9]+"), INVALID_FORMAT_ERROR_MESSAGE);
  }
}
```

### DynamicRegexReplaceableByCompiledPattern
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/src/main/java/google/registry/tools/VerifyOteCommand.java`
#### Snippet
```java
              String name = registrar.getRegistrarId();
              // Look for names of the form "regname-1", "regname-2", etc. and strip the -# suffix.
              String replacedName = name.replaceFirst("^(.*)-[1234]$", "$1");
              // Check if any replacement happened, and thus whether the name matches the format.
              // If it matches, provide the shortened name, and otherwise return null.
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/src/main/java/google/registry/whois/WhoisReader.java`
#### Snippet
```java
      throws WhoisException {
    // Split the string into tokens based on whitespace.
    List<String> tokens = filterEmptyStrings(command.split("\\s"));
    if (tokens.isEmpty()) {
      throw new WhoisException(now, SC_BAD_REQUEST, "No WHOIS command specified.");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/src/main/java/google/registry/whois/WhoisMetrics.java`
#### Snippet
```java
        // All WHOIS command class names share the "Command" suffix, so strip it out in order to
        // have shorter labels.
        return setCommandName(command.getClass().getSimpleName().replaceFirst("Command$", ""));
      }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/src/main/java/google/registry/whois/WhoisResponseImpl.java`
#### Snippet
```java
    /** Returns raw text that should be appended to the end of ALL WHOIS responses. */
    E emitFooter(String disclaimer) {
      stringBuilder.append(disclaimer.replaceAll("\r?\n", "\r\n").trim()).append("\r\n");
      return thisCastToDerived();
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/src/main/java/google/registry/whois/WhoisResponseImpl.java`
#### Snippet
```java
    /** Remove ASCII control characters like {@code \n} which could be used to forge output. */
    private String cleanse(String value) {
      return value.replaceAll("[\\x00-\\x1f]", " ");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/src/main/java/google/registry/reporting/icann/IcannHttpReporter.java`
#### Snippet
```java
  private void validateReportFilename(String filename) {
    checkArgument(
        filename.matches("[a-z0-9.\\-]+-((activity)|(transactions))-[0-9]{6}\\.csv"),
        "Expected file format: tld-reportType-yyyyMM.csv, got %s instead",
        filename);
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/src/main/java/google/registry/loadtest/LoadTestAction.java`
#### Snippet
```java
      hostPrefixesBuilder.add(hostPrefix);
      preTaskXmls.add(
          xmlContactCreateTmpl.replace("%contact%", contactName),
          xmlHostCreateTmpl.replace("%host%", hostPrefix));
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/src/main/java/google/registry/loadtest/LoadTestAction.java`
#### Snippet
```java
      preTaskXmls.add(
          xmlContactCreateTmpl.replace("%contact%", contactName),
          xmlHostCreateTmpl.replace("%host%", hostPrefix));
    }
    enqueue(createTasks(preTaskXmls.build(), DateTime.now(UTC)));
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/src/main/java/google/registry/loadtest/LoadTestAction.java`
#### Snippet
```java
  LoadTestAction(@Parameter("tld") String tld, XsrfTokenManager xsrfTokenManager) {
    xmlContactCreateTmpl = loadXml("contact_create");
    xmlContactCreateFail = xmlContactCreateTmpl.replace("%contact%", EXISTING_CONTACT);
    xmlContactInfo = loadXml("contact_info").replace("%contact%", EXISTING_CONTACT);
    xmlDomainCheck =
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/src/main/java/google/registry/loadtest/LoadTestAction.java`
#### Snippet
```java
    xmlContactCreateTmpl = loadXml("contact_create");
    xmlContactCreateFail = xmlContactCreateTmpl.replace("%contact%", EXISTING_CONTACT);
    xmlContactInfo = loadXml("contact_info").replace("%contact%", EXISTING_CONTACT);
    xmlDomainCheck =
        loadXml("domain_check").replace("%tld%", tld).replace("%domain%", EXISTING_DOMAIN);
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/src/main/java/google/registry/loadtest/LoadTestAction.java`
#### Snippet
```java
    xmlContactInfo = loadXml("contact_info").replace("%contact%", EXISTING_CONTACT);
    xmlDomainCheck =
        loadXml("domain_check").replace("%tld%", tld).replace("%domain%", EXISTING_DOMAIN);
    xmlDomainCreateTmpl = loadXml("domain_create").replace("%tld%", tld);
    xmlDomainCreateFail =
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/src/main/java/google/registry/loadtest/LoadTestAction.java`
#### Snippet
```java
    xmlContactInfo = loadXml("contact_info").replace("%contact%", EXISTING_CONTACT);
    xmlDomainCheck =
        loadXml("domain_check").replace("%tld%", tld).replace("%domain%", EXISTING_DOMAIN);
    xmlDomainCreateTmpl = loadXml("domain_create").replace("%tld%", tld);
    xmlDomainCreateFail =
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/src/main/java/google/registry/loadtest/LoadTestAction.java`
#### Snippet
```java
    xmlDomainCheck =
        loadXml("domain_check").replace("%tld%", tld).replace("%domain%", EXISTING_DOMAIN);
    xmlDomainCreateTmpl = loadXml("domain_create").replace("%tld%", tld);
    xmlDomainCreateFail =
        xmlDomainCreateTmpl
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/src/main/java/google/registry/loadtest/LoadTestAction.java`
#### Snippet
```java
    xmlDomainCreateFail =
        xmlDomainCreateTmpl
            .replace("%domain%", EXISTING_DOMAIN)
            .replace("%contact%", EXISTING_CONTACT)
            .replace("%host%", EXISTING_HOST);
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/src/main/java/google/registry/loadtest/LoadTestAction.java`
#### Snippet
```java
        xmlDomainCreateTmpl
            .replace("%domain%", EXISTING_DOMAIN)
            .replace("%contact%", EXISTING_CONTACT)
            .replace("%host%", EXISTING_HOST);
    xmlDomainInfo =
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/src/main/java/google/registry/loadtest/LoadTestAction.java`
#### Snippet
```java
            .replace("%domain%", EXISTING_DOMAIN)
            .replace("%contact%", EXISTING_CONTACT)
            .replace("%host%", EXISTING_HOST);
    xmlDomainInfo =
        loadXml("domain_info").replace("%tld%", tld).replace("%domain%", EXISTING_DOMAIN);
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/src/main/java/google/registry/loadtest/LoadTestAction.java`
#### Snippet
```java
            .replace("%host%", EXISTING_HOST);
    xmlDomainInfo =
        loadXml("domain_info").replace("%tld%", tld).replace("%domain%", EXISTING_DOMAIN);
    xmlHostCreateTmpl = loadXml("host_create");
    xmlHostCreateFail = xmlHostCreateTmpl.replace("%host%", EXISTING_HOST);
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/src/main/java/google/registry/loadtest/LoadTestAction.java`
#### Snippet
```java
            .replace("%host%", EXISTING_HOST);
    xmlDomainInfo =
        loadXml("domain_info").replace("%tld%", tld).replace("%domain%", EXISTING_DOMAIN);
    xmlHostCreateTmpl = loadXml("host_create");
    xmlHostCreateFail = xmlHostCreateTmpl.replace("%host%", EXISTING_HOST);
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/src/main/java/google/registry/loadtest/LoadTestAction.java`
#### Snippet
```java
        loadXml("domain_info").replace("%tld%", tld).replace("%domain%", EXISTING_DOMAIN);
    xmlHostCreateTmpl = loadXml("host_create");
    xmlHostCreateFail = xmlHostCreateTmpl.replace("%host%", EXISTING_HOST);
    xmlHostInfo = loadXml("host_info").replace("%host%", EXISTING_HOST);
    xsrfToken = xsrfTokenManager.generateToken("");
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/src/main/java/google/registry/loadtest/LoadTestAction.java`
#### Snippet
```java
    xmlHostCreateTmpl = loadXml("host_create");
    xmlHostCreateFail = xmlHostCreateTmpl.replace("%host%", EXISTING_HOST);
    xmlHostInfo = loadXml("host_info").replace("%host%", EXISTING_HOST);
    xsrfToken = xsrfTokenManager.generateToken("");
  }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/src/main/java/google/registry/monitoring/whitebox/EppMetric.java`
#### Snippet
```java
          flowSimpleClassName.endsWith("Flow"),
          "Must pass in the simple class name of a flow class");
      return setCommandName(flowSimpleClassName.replaceFirst("Flow$", ""));
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `docs/src/main/java/google/registry/documentation/FlowDocumentation.java`
#### Snippet
```java
          String.format(
              "%s/%s.java",
              JavadocWrapper.SOURCE_PATH, getQualifiedName().replaceAll("\\.", "\\/"));
      String unusedClassFileContent;
      try {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `util/src/main/java/google/registry/util/RegistrarUtils.java`
#### Snippet
```java
   */
  public static String normalizeRegistrarId(String registrarId) {
    return Ascii.toLowerCase(registrarId).replaceAll("[^a-z0-9\\-]", "");
  }
}
```

### DynamicRegexReplaceableByCompiledPattern
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `util/src/main/java/google/registry/util/AppEngineServiceUtilsImpl.java`
#### Snippet
```java
    String hostnameWithVersion = modulesService.getVersionHostname(service, null);
    // Strip off the version and return just "service.projectid.appspot.com"
    return hostnameWithVersion.replaceFirst("^[^.]+\\.", "");
  }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `util/src/main/java/google/registry/util/AppEngineServiceUtilsImpl.java`
#### Snippet
```java
      return hostname;
    }
    return matcher.group(1).replace(".", "-dot-") + ".appspot.com";
  }
}
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `proxy/src/main/java/google/registry/proxy/ProxyConfig.java`
#### Snippet
```java
            ProxyConfig.class,
            String.format(
                CUSTOM_CONFIG_FORMATTER, Ascii.toLowerCase(env.name()).replace("_", "-")));
    return getConfigSettings(defaultYaml, customYaml, ProxyConfig.class);
  }
```

## RuleId[ruleID=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `javax.annotation` is unnecessary, and can be replaced with an import
in `core/src/main/java/google/registry/ui/package-info.java`
#### Snippet
```java
// limitations under the License.

@javax.annotation.ParametersAreNonnullByDefault
package google.registry.ui;

```

### UnnecessaryFullyQualifiedName
Qualifier `javax.annotation` is unnecessary, and can be replaced with an import
in `core/src/main/java/google/registry/ui/forms/package-info.java`
#### Snippet
```java

/** Web application backend form processing utilities. */
@javax.annotation.ParametersAreNonnullByDefault
package google.registry.ui.forms;

```

### UnnecessaryFullyQualifiedName
Qualifier `javax.annotation` is unnecessary, and can be replaced with an import
in `core/src/main/java/google/registry/ui/server/package-info.java`
#### Snippet
```java
// limitations under the License.

@javax.annotation.ParametersAreNonnullByDefault
package google.registry.ui.server;

```

### UnnecessaryFullyQualifiedName
Qualifier `javax.annotation` is unnecessary, and can be replaced with an import
in `core/src/main/java/google/registry/ui/server/registrar/package-info.java`
#### Snippet
```java
// limitations under the License.

@javax.annotation.ParametersAreNonnullByDefault
package google.registry.ui.server.registrar;

```

### UnnecessaryFullyQualifiedName
Qualifier `javax.annotation` is unnecessary, and can be replaced with an import
in `core/src/main/java/google/registry/rde/package-info.java`
#### Snippet
```java
 * learn more.
 */
@javax.annotation.ParametersAreNonnullByDefault
package google.registry.rde;

```

### UnnecessaryFullyQualifiedName
Qualifier `javax.annotation` is unnecessary, and can be replaced with an import
in `core/src/main/java/google/registry/xjc/package-info.java`
#### Snippet
```java
// limitations under the License.

@javax.annotation.ParametersAreNonnullByDefault
package google.registry.xjc;

```

### UnnecessaryFullyQualifiedName
Qualifier `javax.annotation` is unnecessary, and can be replaced with an import
in `core/src/main/java/google/registry/xml/package-info.java`
#### Snippet
```java
// limitations under the License.

@javax.annotation.ParametersAreNonnullByDefault
package google.registry.xml;

```

### UnnecessaryFullyQualifiedName
Qualifier `javax.xml.bind.annotation` is unnecessary and can be removed
in `core/src/main/java/google/registry/xjc/XjcObject.java`
#### Snippet
```java
   * Validates and streams {@code this} as formatted XML bytes with XML declaration.
   *
   * <p>This object must be annotated with {@link javax.xml.bind.annotation.XmlRootElement},
   * otherwise you should call {@link #toString()}. This method will verify that your object
   * strictly conforms to the schema defined in {@link XjcXmlTransformer}. Because the output is
```

### UnnecessaryFullyQualifiedName
Qualifier `java.net` is unnecessary and can be removed
in `core/src/main/java/google/registry/rde/RdeUploadUrl.java`
#### Snippet
```java
  }

  /** @see java.net.URI#hashCode() */
  @Override
  public int hashCode() {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.net` is unnecessary and can be removed
in `core/src/main/java/google/registry/rde/RdeUploadUrl.java`
#### Snippet
```java
 * preferable to using a plain {@link URI}.
 *
 * @see java.net.URI
 * @see RdeUploadAction
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.net` is unnecessary and can be removed
in `core/src/main/java/google/registry/rde/RdeUploadUrl.java`
#### Snippet
```java
  }

  /** @see java.net.URI#compareTo(java.net.URI) */
  @Override
  public int compareTo(RdeUploadUrl rhs) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.net` is unnecessary and can be removed
in `core/src/main/java/google/registry/rde/RdeUploadUrl.java`
#### Snippet
```java
  }

  /** @see java.net.URI#compareTo(java.net.URI) */
  @Override
  public int compareTo(RdeUploadUrl rhs) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.net` is unnecessary and can be removed
in `core/src/main/java/google/registry/rde/RdeUploadUrl.java`
#### Snippet
```java
  }

  /** @see java.net.URI#equals(Object) */
  @Override
  public boolean equals(@Nullable Object object) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.net` is unnecessary and can be removed
in `core/src/main/java/google/registry/rde/RdeUploadUrl.java`
#### Snippet
```java
   * Constructs and validates a new {@link RdeUploadUrl} instance.
   *
   * @see java.net.URI#create(String)
   */
  public static RdeUploadUrl create(URI uri) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.jcraft.jsch` is unnecessary and can be removed
in `core/src/main/java/google/registry/rde/JSchSshSession.java`
#### Snippet
```java
 * @see JSchSftpChannel
 * @see RdeUploadAction
 * @see com.jcraft.jsch.Session
 */
final class JSchSshSession implements Closeable {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.jcraft.jsch` is unnecessary and can be removed
in `core/src/main/java/google/registry/rde/JSchSshSession.java`
#### Snippet
```java
  }

  /** @see com.jcraft.jsch.Session#disconnect() */
  @Override
  public void close() {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.io` is unnecessary and can be removed
in `core/src/main/java/google/registry/xml/XmlTransformer.java`
#### Snippet
```java
   *         element doesn't match {@code expect}.
   * @see com.google.common.io.Files#asByteSource
   * @see com.google.common.io.Resources#asByteSource
   * @see <a href="https://errorprone.info/bugpattern/TypeParameterUnusedInFormals">TypeParameterUnusedInFormals</a>
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.annotation` is unnecessary, and can be replaced with an import
in `core/src/main/java/google/registry/cron/package-info.java`
#### Snippet
```java
// limitations under the License.

@javax.annotation.ParametersAreNonnullByDefault
package google.registry.cron;

```

### UnnecessaryFullyQualifiedName
Qualifier `javax.annotation` is unnecessary, and can be replaced with an import
in `core/src/main/java/google/registry/tmch/package-info.java`
#### Snippet
```java
// limitations under the License.

@javax.annotation.ParametersAreNonnullByDefault
package google.registry.tmch;

```

### UnnecessaryFullyQualifiedName
Qualifier `javax.persistence` is unnecessary, and can be replaced with an import
in `core/src/main/java/google/registry/rdap/RdapDomainSearchAction.java`
#### Snippet
```java
            .transact(
                () -> {
                  javax.persistence.Query query =
                      replicaJpaTm()
                          .getEntityManager()
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.persistence` is unnecessary, and can be replaced with an import
in `core/src/main/java/google/registry/rdap/RdapNameserverSearchAction.java`
#### Snippet
```java
              .transact(
                  () -> {
                    javax.persistence.Query query =
                        replicaJpaTm()
                            .getEntityManager()
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary, and can be replaced with an import
in `core/src/main/java/google/registry/tmch/TmchXmlSignature.java`
#### Snippet
```java

    @Override
    public java.security.Key getKey() {
      return publicKey;
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `google.registry.flows.exceptions` is unnecessary and can be removed
in `core/src/main/java/google/registry/flows/host/HostUpdateFlow.java`
#### Snippet
```java
 * @error {@link google.registry.flows.ResourceFlowUtils.ResourceNotOwnedException}
 * @error {@link google.registry.flows.ResourceFlowUtils.StatusNotClientSettableException}
 * @error {@link google.registry.flows.exceptions.ResourceHasClientUpdateProhibitedException}
 * @error {@link google.registry.flows.exceptions.ResourceStatusProhibitsOperationException}
 * @error {@link HostFlowUtils.HostDomainNotOwnedException}
```

### UnnecessaryFullyQualifiedName
Qualifier `google.registry.flows` is unnecessary and can be removed
in `core/src/main/java/google/registry/flows/domain/DomainRestoreRequestFlow.java`
#### Snippet
```java
 * original expiration time was.
 *
 * @error {@link google.registry.flows.EppException.UnimplementedExtensionException}
 * @error {@link google.registry.flows.FlowUtils.NotLoggedInException}
 * @error {@link google.registry.flows.FlowUtils.UnknownCurrencyEppException}
```

### UnnecessaryFullyQualifiedName
Qualifier `google.registry.flows.exceptions` is unnecessary and can be removed
in `core/src/main/java/google/registry/flows/domain/DomainTransferRequestFlow.java`
#### Snippet
```java
 * @error {@link google.registry.flows.ResourceFlowUtils.BadAuthInfoForResourceException}
 * @error {@link google.registry.flows.ResourceFlowUtils.ResourceDoesNotExistException}
 * @error {@link google.registry.flows.exceptions.AlreadyPendingTransferException}
 * @error {@link google.registry.flows.exceptions.MissingTransferRequestAuthInfoException}
 * @error {@link google.registry.flows.exceptions.ObjectAlreadySponsoredException}
```

### UnnecessaryFullyQualifiedName
Qualifier `google.registry.flows.exceptions` is unnecessary and can be removed
in `core/src/main/java/google/registry/flows/domain/DomainTransferRequestFlow.java`
#### Snippet
```java
 * @error {@link google.registry.flows.exceptions.AlreadyPendingTransferException}
 * @error {@link google.registry.flows.exceptions.MissingTransferRequestAuthInfoException}
 * @error {@link google.registry.flows.exceptions.ObjectAlreadySponsoredException}
 * @error {@link google.registry.flows.exceptions.ResourceStatusProhibitsOperationException}
 * @error {@link google.registry.flows.exceptions.TransferPeriodMustBeOneYearException}
```

### UnnecessaryFullyQualifiedName
Qualifier `google.registry.flows.exceptions` is unnecessary and can be removed
in `core/src/main/java/google/registry/flows/domain/DomainTransferRequestFlow.java`
#### Snippet
```java
 * @error {@link google.registry.flows.exceptions.ObjectAlreadySponsoredException}
 * @error {@link google.registry.flows.exceptions.ResourceStatusProhibitsOperationException}
 * @error {@link google.registry.flows.exceptions.TransferPeriodMustBeOneYearException}
 * @error {@link InvalidTransferPeriodValueException}
 * @error {@link
```

### UnnecessaryFullyQualifiedName
Qualifier `google.registry.flows.exceptions` is unnecessary and can be removed
in `core/src/main/java/google/registry/flows/domain/DomainTransferRequestFlow.java`
#### Snippet
```java
 * @error {@link InvalidTransferPeriodValueException}
 * @error {@link
 *     google.registry.flows.exceptions.TransferPeriodZeroAndFeeTransferExtensionException}
 * @error {@link DomainFlowUtils.BadPeriodUnitException}
 * @error {@link DomainFlowUtils.CurrencyUnitMismatchException}
```

### UnnecessaryFullyQualifiedName
Qualifier `google.registry.flows.domain.token` is unnecessary and can be removed
in `core/src/main/java/google/registry/flows/domain/DomainTransferRequestFlow.java`
#### Snippet
```java
 * @error {@link DomainFlowUtils.UnsupportedFeeAttributeException}
 * @error {@link
 *     google.registry.flows.domain.token.AllocationTokenFlowUtils.AllocationTokenNotValidForDomainException}
 * @error {@link
 *     google.registry.flows.domain.token.AllocationTokenFlowUtils.InvalidAllocationTokenException}
```

### UnnecessaryFullyQualifiedName
Qualifier `google.registry.flows.domain.token` is unnecessary and can be removed
in `core/src/main/java/google/registry/flows/domain/DomainTransferRequestFlow.java`
#### Snippet
```java
 *     google.registry.flows.domain.token.AllocationTokenFlowUtils.AllocationTokenNotValidForDomainException}
 * @error {@link
 *     google.registry.flows.domain.token.AllocationTokenFlowUtils.InvalidAllocationTokenException}
 * @error {@link
 *     google.registry.flows.domain.token.AllocationTokenFlowUtils.AllocationTokenNotInPromotionException}
```

### UnnecessaryFullyQualifiedName
Qualifier `google.registry.flows.domain.token` is unnecessary and can be removed
in `core/src/main/java/google/registry/flows/domain/DomainTransferRequestFlow.java`
#### Snippet
```java
 *     google.registry.flows.domain.token.AllocationTokenFlowUtils.InvalidAllocationTokenException}
 * @error {@link
 *     google.registry.flows.domain.token.AllocationTokenFlowUtils.AllocationTokenNotInPromotionException}
 * @error {@link
 *     google.registry.flows.domain.token.AllocationTokenFlowUtils.AllocationTokenNotValidForRegistrarException}
```

### UnnecessaryFullyQualifiedName
Qualifier `google.registry.flows.domain.token` is unnecessary and can be removed
in `core/src/main/java/google/registry/flows/domain/DomainTransferRequestFlow.java`
#### Snippet
```java
 *     google.registry.flows.domain.token.AllocationTokenFlowUtils.AllocationTokenNotInPromotionException}
 * @error {@link
 *     google.registry.flows.domain.token.AllocationTokenFlowUtils.AllocationTokenNotValidForRegistrarException}
 * @error {@link
 *     google.registry.flows.domain.token.AllocationTokenFlowUtils.AllocationTokenNotValidForTldException}
```

### UnnecessaryFullyQualifiedName
Qualifier `google.registry.flows.domain.token` is unnecessary and can be removed
in `core/src/main/java/google/registry/flows/domain/DomainTransferRequestFlow.java`
#### Snippet
```java
 *     google.registry.flows.domain.token.AllocationTokenFlowUtils.AllocationTokenNotValidForRegistrarException}
 * @error {@link
 *     google.registry.flows.domain.token.AllocationTokenFlowUtils.AllocationTokenNotValidForTldException}
 * @error {@link
 *     google.registry.flows.domain.token.AllocationTokenFlowUtils.AlreadyRedeemedAllocationTokenException}
```

### UnnecessaryFullyQualifiedName
Qualifier `google.registry.flows.domain.token` is unnecessary and can be removed
in `core/src/main/java/google/registry/flows/domain/DomainTransferRequestFlow.java`
#### Snippet
```java
 *     google.registry.flows.domain.token.AllocationTokenFlowUtils.AllocationTokenNotValidForTldException}
 * @error {@link
 *     google.registry.flows.domain.token.AllocationTokenFlowUtils.AlreadyRedeemedAllocationTokenException}
 */
@ReportingSpec(ActivityReportField.DOMAIN_TRANSFER_REQUEST)
```

### UnnecessaryFullyQualifiedName
Qualifier `google.registry.flows.domain.token` is unnecessary and can be removed
in `core/src/main/java/google/registry/flows/domain/DomainTransferApproveFlow.java`
#### Snippet
```java
 * @error {@link DomainFlowUtils.NotAuthorizedForTldException}
 * @error {@link
 *     google.registry.flows.domain.token.AllocationTokenFlowUtils.AllocationTokenNotValidForDomainException}
 * @error {@link
 *     google.registry.flows.domain.token.AllocationTokenFlowUtils.InvalidAllocationTokenException}
```

### UnnecessaryFullyQualifiedName
Qualifier `google.registry.flows.domain.token` is unnecessary and can be removed
in `core/src/main/java/google/registry/flows/domain/DomainTransferApproveFlow.java`
#### Snippet
```java
 *     google.registry.flows.domain.token.AllocationTokenFlowUtils.AllocationTokenNotValidForDomainException}
 * @error {@link
 *     google.registry.flows.domain.token.AllocationTokenFlowUtils.InvalidAllocationTokenException}
 * @error {@link
 *     google.registry.flows.domain.token.AllocationTokenFlowUtils.AllocationTokenNotInPromotionException}
```

### UnnecessaryFullyQualifiedName
Qualifier `google.registry.flows.domain.token` is unnecessary and can be removed
in `core/src/main/java/google/registry/flows/domain/DomainTransferApproveFlow.java`
#### Snippet
```java
 *     google.registry.flows.domain.token.AllocationTokenFlowUtils.InvalidAllocationTokenException}
 * @error {@link
 *     google.registry.flows.domain.token.AllocationTokenFlowUtils.AllocationTokenNotInPromotionException}
 * @error {@link
 *     google.registry.flows.domain.token.AllocationTokenFlowUtils.AllocationTokenNotValidForRegistrarException}
```

### UnnecessaryFullyQualifiedName
Qualifier `google.registry.flows.domain.token` is unnecessary and can be removed
in `core/src/main/java/google/registry/flows/domain/DomainTransferApproveFlow.java`
#### Snippet
```java
 *     google.registry.flows.domain.token.AllocationTokenFlowUtils.AllocationTokenNotInPromotionException}
 * @error {@link
 *     google.registry.flows.domain.token.AllocationTokenFlowUtils.AllocationTokenNotValidForRegistrarException}
 * @error {@link
 *     google.registry.flows.domain.token.AllocationTokenFlowUtils.AllocationTokenNotValidForTldException}
```

### UnnecessaryFullyQualifiedName
Qualifier `google.registry.flows.domain.token` is unnecessary and can be removed
in `core/src/main/java/google/registry/flows/domain/DomainTransferApproveFlow.java`
#### Snippet
```java
 *     google.registry.flows.domain.token.AllocationTokenFlowUtils.AllocationTokenNotValidForRegistrarException}
 * @error {@link
 *     google.registry.flows.domain.token.AllocationTokenFlowUtils.AllocationTokenNotValidForTldException}
 * @error {@link
 *     google.registry.flows.domain.token.AllocationTokenFlowUtils.AlreadyRedeemedAllocationTokenException}
```

### UnnecessaryFullyQualifiedName
Qualifier `google.registry.flows.domain.token` is unnecessary and can be removed
in `core/src/main/java/google/registry/flows/domain/DomainTransferApproveFlow.java`
#### Snippet
```java
 *     google.registry.flows.domain.token.AllocationTokenFlowUtils.AllocationTokenNotValidForTldException}
 * @error {@link
 *     google.registry.flows.domain.token.AllocationTokenFlowUtils.AlreadyRedeemedAllocationTokenException}
 */
@ReportingSpec(ActivityReportField.DOMAIN_TRANSFER_APPROVE)
```

### UnnecessaryFullyQualifiedName
Qualifier `google.registry.flows.domain.token` is unnecessary and can be removed
in `core/src/main/java/google/registry/flows/domain/DomainRenewFlow.java`
#### Snippet
```java
 * @error {@link DomainRenewFlow.IncorrectCurrentExpirationDateException}
 * @error {@link
 *     google.registry.flows.domain.token.AllocationTokenFlowUtils.MissingRemovePackageTokenOnPackageDomainException}
 * @error {@link
 *     google.registry.flows.domain.token.AllocationTokenFlowUtils.RemovePackageTokenOnNonPackageDomainException}
```

### UnnecessaryFullyQualifiedName
Qualifier `google.registry.flows.domain.token` is unnecessary and can be removed
in `core/src/main/java/google/registry/flows/domain/DomainRenewFlow.java`
#### Snippet
```java
 *     google.registry.flows.domain.token.AllocationTokenFlowUtils.MissingRemovePackageTokenOnPackageDomainException}
 * @error {@link
 *     google.registry.flows.domain.token.AllocationTokenFlowUtils.RemovePackageTokenOnNonPackageDomainException}
 * @error {@link
 *     google.registry.flows.domain.token.AllocationTokenFlowUtils.AllocationTokenNotValidForDomainException}
```

### UnnecessaryFullyQualifiedName
Qualifier `google.registry.flows.domain.token` is unnecessary and can be removed
in `core/src/main/java/google/registry/flows/domain/DomainRenewFlow.java`
#### Snippet
```java
 *     google.registry.flows.domain.token.AllocationTokenFlowUtils.RemovePackageTokenOnNonPackageDomainException}
 * @error {@link
 *     google.registry.flows.domain.token.AllocationTokenFlowUtils.AllocationTokenNotValidForDomainException}
 * @error {@link
 *     google.registry.flows.domain.token.AllocationTokenFlowUtils.InvalidAllocationTokenException}
```

### UnnecessaryFullyQualifiedName
Qualifier `google.registry.flows.domain.token` is unnecessary and can be removed
in `core/src/main/java/google/registry/flows/domain/DomainRenewFlow.java`
#### Snippet
```java
 *     google.registry.flows.domain.token.AllocationTokenFlowUtils.AllocationTokenNotValidForDomainException}
 * @error {@link
 *     google.registry.flows.domain.token.AllocationTokenFlowUtils.InvalidAllocationTokenException}
 * @error {@link
 *     google.registry.flows.domain.token.AllocationTokenFlowUtils.AllocationTokenNotInPromotionException}
```

### UnnecessaryFullyQualifiedName
Qualifier `google.registry.flows.domain.token` is unnecessary and can be removed
in `core/src/main/java/google/registry/flows/domain/DomainRenewFlow.java`
#### Snippet
```java
 *     google.registry.flows.domain.token.AllocationTokenFlowUtils.InvalidAllocationTokenException}
 * @error {@link
 *     google.registry.flows.domain.token.AllocationTokenFlowUtils.AllocationTokenNotInPromotionException}
 * @error {@link
 *     google.registry.flows.domain.token.AllocationTokenFlowUtils.AllocationTokenNotValidForRegistrarException}
```

### UnnecessaryFullyQualifiedName
Qualifier `google.registry.flows.domain.token` is unnecessary and can be removed
in `core/src/main/java/google/registry/flows/domain/DomainRenewFlow.java`
#### Snippet
```java
 *     google.registry.flows.domain.token.AllocationTokenFlowUtils.AllocationTokenNotInPromotionException}
 * @error {@link
 *     google.registry.flows.domain.token.AllocationTokenFlowUtils.AllocationTokenNotValidForRegistrarException}
 * @error {@link
 *     google.registry.flows.domain.token.AllocationTokenFlowUtils.AllocationTokenNotValidForTldException}
```

### UnnecessaryFullyQualifiedName
Qualifier `google.registry.flows.domain.token` is unnecessary and can be removed
in `core/src/main/java/google/registry/flows/domain/DomainRenewFlow.java`
#### Snippet
```java
 *     google.registry.flows.domain.token.AllocationTokenFlowUtils.AllocationTokenNotValidForRegistrarException}
 * @error {@link
 *     google.registry.flows.domain.token.AllocationTokenFlowUtils.AllocationTokenNotValidForTldException}
 * @error {@link
 *     google.registry.flows.domain.token.AllocationTokenFlowUtils.AlreadyRedeemedAllocationTokenException}
```

### UnnecessaryFullyQualifiedName
Qualifier `google.registry.flows.domain.token` is unnecessary and can be removed
in `core/src/main/java/google/registry/flows/domain/DomainRenewFlow.java`
#### Snippet
```java
 *     google.registry.flows.domain.token.AllocationTokenFlowUtils.AllocationTokenNotValidForTldException}
 * @error {@link
 *     google.registry.flows.domain.token.AllocationTokenFlowUtils.AlreadyRedeemedAllocationTokenException}
 */
@ReportingSpec(ActivityReportField.DOMAIN_RENEW)
```

### UnnecessaryFullyQualifiedName
Qualifier `google.registry.model.eppoutput` is unnecessary and can be removed
in `core/src/main/java/google/registry/flows/custom/DomainDeleteFlowCustomLogic.java`
#### Snippet
```java
   * A hook that runs before the response is returned.
   *
   * <p>This takes the {@link google.registry.model.eppoutput.Result.Code} and
   * {@link ResponseExtension}s as input and returns them, potentially with modifications.
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `google.registry.flows` is unnecessary and can be removed
in `core/src/main/java/google/registry/flows/domain/DomainTransferQueryFlow.java`
#### Snippet
```java
 *
 * @error {@link google.registry.flows.FlowUtils.NotLoggedInException}
 * @error {@link google.registry.flows.ResourceFlowUtils.BadAuthInfoForResourceException}
 * @error {@link google.registry.flows.ResourceFlowUtils.ResourceDoesNotExistException}
 * @error {@link google.registry.flows.exceptions.NoTransferHistoryToQueryException}
```

### UnnecessaryFullyQualifiedName
Qualifier `google.registry.flows` is unnecessary and can be removed
in `core/src/main/java/google/registry/flows/domain/DomainTransferQueryFlow.java`
#### Snippet
```java
 * @error {@link google.registry.flows.FlowUtils.NotLoggedInException}
 * @error {@link google.registry.flows.ResourceFlowUtils.BadAuthInfoForResourceException}
 * @error {@link google.registry.flows.ResourceFlowUtils.ResourceDoesNotExistException}
 * @error {@link google.registry.flows.exceptions.NoTransferHistoryToQueryException}
 * @error {@link google.registry.flows.exceptions.NotAuthorizedToViewTransferException}
```

### UnnecessaryFullyQualifiedName
Qualifier `google.registry.flows.exceptions` is unnecessary and can be removed
in `core/src/main/java/google/registry/flows/domain/DomainTransferQueryFlow.java`
#### Snippet
```java
 * @error {@link google.registry.flows.ResourceFlowUtils.BadAuthInfoForResourceException}
 * @error {@link google.registry.flows.ResourceFlowUtils.ResourceDoesNotExistException}
 * @error {@link google.registry.flows.exceptions.NoTransferHistoryToQueryException}
 * @error {@link google.registry.flows.exceptions.NotAuthorizedToViewTransferException}
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `google.registry.flows.exceptions` is unnecessary and can be removed
in `core/src/main/java/google/registry/flows/domain/DomainTransferQueryFlow.java`
#### Snippet
```java
 * @error {@link google.registry.flows.ResourceFlowUtils.ResourceDoesNotExistException}
 * @error {@link google.registry.flows.exceptions.NoTransferHistoryToQueryException}
 * @error {@link google.registry.flows.exceptions.NotAuthorizedToViewTransferException}
 */
@ReportingSpec(ActivityReportField.DOMAIN_TRANSFER_QUERY)
```

### UnnecessaryFullyQualifiedName
Qualifier `google.registry.flows` is unnecessary and can be removed
in `core/src/main/java/google/registry/flows/domain/DomainUpdateFlow.java`
#### Snippet
```java
 * one charge per update, even if several such statuses are updated at once.
 *
 * @error {@link google.registry.flows.EppException.UnimplementedExtensionException}
 * @error {@link google.registry.flows.FlowUtils.NotLoggedInException}
 * @error {@link google.registry.flows.ResourceFlowUtils.AddRemoveSameValueException}
```

### UnnecessaryFullyQualifiedName
Qualifier `google.registry.flows` is unnecessary and can be removed
in `core/src/main/java/google/registry/flows/domain/DomainDeleteFlow.java`
#### Snippet
```java
 * An EPP flow that deletes a domain.
 *
 * @error {@link google.registry.flows.EppException.UnimplementedExtensionException}
 * @error {@link google.registry.flows.FlowUtils.NotLoggedInException}
 * @error {@link google.registry.flows.ResourceFlowUtils.ResourceDoesNotExistException}
```

### UnnecessaryFullyQualifiedName
Qualifier `google.registry.flows.exceptions` is unnecessary and can be removed
in `core/src/main/java/google/registry/flows/contact/ContactTransferQueryFlow.java`
#### Snippet
```java
 * @error {@link google.registry.flows.ResourceFlowUtils.BadAuthInfoForResourceException}
 * @error {@link google.registry.flows.ResourceFlowUtils.ResourceDoesNotExistException}
 * @error {@link google.registry.flows.exceptions.NoTransferHistoryToQueryException}
 * @error {@link google.registry.flows.exceptions.NotAuthorizedToViewTransferException}
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `google.registry.flows.exceptions` is unnecessary and can be removed
in `core/src/main/java/google/registry/flows/contact/ContactTransferQueryFlow.java`
#### Snippet
```java
 * @error {@link google.registry.flows.ResourceFlowUtils.ResourceDoesNotExistException}
 * @error {@link google.registry.flows.exceptions.NoTransferHistoryToQueryException}
 * @error {@link google.registry.flows.exceptions.NotAuthorizedToViewTransferException}
 */
@ReportingSpec(ActivityReportField.CONTACT_TRANSFER_QUERY)
```

### UnnecessaryFullyQualifiedName
Qualifier `google.registry.flows.exceptions` is unnecessary and can be removed
in `core/src/main/java/google/registry/flows/contact/ContactUpdateFlow.java`
#### Snippet
```java
 * @error {@link google.registry.flows.ResourceFlowUtils.ResourceNotOwnedException}
 * @error {@link google.registry.flows.ResourceFlowUtils.StatusNotClientSettableException}
 * @error {@link google.registry.flows.exceptions.ResourceHasClientUpdateProhibitedException}
 * @error {@link google.registry.flows.exceptions.ResourceStatusProhibitsOperationException}
 * @error {@link ContactFlowUtils.BadInternationalizedPostalInfoException}
```

### UnnecessaryFullyQualifiedName
Qualifier `google.registry.flows.exceptions` is unnecessary and can be removed
in `core/src/main/java/google/registry/flows/contact/ContactTransferRequestFlow.java`
#### Snippet
```java
 * @error {@link google.registry.flows.ResourceFlowUtils.BadAuthInfoForResourceException}
 * @error {@link google.registry.flows.ResourceFlowUtils.ResourceDoesNotExistException}
 * @error {@link google.registry.flows.exceptions.AlreadyPendingTransferException}
 * @error {@link google.registry.flows.exceptions.MissingTransferRequestAuthInfoException}
 * @error {@link google.registry.flows.exceptions.ObjectAlreadySponsoredException}
```

### UnnecessaryFullyQualifiedName
Qualifier `google.registry.flows.exceptions` is unnecessary and can be removed
in `core/src/main/java/google/registry/flows/contact/ContactTransferRequestFlow.java`
#### Snippet
```java
 * @error {@link google.registry.flows.exceptions.AlreadyPendingTransferException}
 * @error {@link google.registry.flows.exceptions.MissingTransferRequestAuthInfoException}
 * @error {@link google.registry.flows.exceptions.ObjectAlreadySponsoredException}
 * @error {@link google.registry.flows.exceptions.ResourceStatusProhibitsOperationException}
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `google.registry.flows` is unnecessary and can be removed
in `core/src/main/java/google/registry/flows/session/LoginFlow.java`
#### Snippet
```java
 * An EPP flow for login.
 *
 * @error {@link google.registry.flows.EppException.UnimplementedExtensionException}
 * @error {@link google.registry.flows.EppException.UnimplementedObjectServiceException}
 * @error {@link google.registry.flows.EppException.UnimplementedProtocolVersionException}
```

### UnnecessaryFullyQualifiedName
Qualifier `google.registry.flows` is unnecessary and can be removed
in `core/src/main/java/google/registry/flows/session/LoginFlow.java`
#### Snippet
```java
 *
 * @error {@link google.registry.flows.EppException.UnimplementedExtensionException}
 * @error {@link google.registry.flows.EppException.UnimplementedObjectServiceException}
 * @error {@link google.registry.flows.EppException.UnimplementedProtocolVersionException}
 * @error {@link google.registry.flows.TlsCredentials.BadRegistrarCertificateException}
```

### UnnecessaryFullyQualifiedName
Qualifier `google.registry.flows` is unnecessary and can be removed
in `core/src/main/java/google/registry/flows/session/LoginFlow.java`
#### Snippet
```java
 * @error {@link google.registry.flows.EppException.UnimplementedExtensionException}
 * @error {@link google.registry.flows.EppException.UnimplementedObjectServiceException}
 * @error {@link google.registry.flows.EppException.UnimplementedProtocolVersionException}
 * @error {@link google.registry.flows.TlsCredentials.BadRegistrarCertificateException}
 * @error {@link google.registry.flows.TlsCredentials.BadRegistrarIpAddressException}
```

### UnnecessaryFullyQualifiedName
Qualifier `google.registry.flows` is unnecessary and can be removed
in `core/src/main/java/google/registry/flows/session/LoginFlow.java`
#### Snippet
```java
 * @error {@link google.registry.flows.TlsCredentials.BadRegistrarIpAddressException}
 * @error {@link google.registry.flows.TlsCredentials.MissingRegistrarCertificateException}
 * @error {@link google.registry.flows.TransportCredentials.BadRegistrarPasswordException}
 * @error {@link LoginFlow.AlreadyLoggedInException}
 * @error {@link BadRegistrarIdException}
```

### UnnecessaryFullyQualifiedName
Qualifier `google.registry.flows.domain.token` is unnecessary and can be removed
in `core/src/main/java/google/registry/flows/domain/DomainCreateFlow.java`
#### Snippet
```java
 *
 * @error {@link
 *     google.registry.flows.domain.token.AllocationTokenFlowUtils.AllocationTokenNotInPromotionException}
 * @error {@link
 *     google.registry.flows.domain.token.AllocationTokenFlowUtils.AllocationTokenNotValidForDomainException}
```

### UnnecessaryFullyQualifiedName
Qualifier `google.registry.flows.domain.token` is unnecessary and can be removed
in `core/src/main/java/google/registry/flows/domain/DomainCreateFlow.java`
#### Snippet
```java
 *     google.registry.flows.domain.token.AllocationTokenFlowUtils.AllocationTokenNotInPromotionException}
 * @error {@link
 *     google.registry.flows.domain.token.AllocationTokenFlowUtils.AllocationTokenNotValidForDomainException}
 * @error {@link
 *     google.registry.flows.domain.token.AllocationTokenFlowUtils.AllocationTokenNotValidForRegistrarException}
```

### UnnecessaryFullyQualifiedName
Qualifier `google.registry.flows.domain.token` is unnecessary and can be removed
in `core/src/main/java/google/registry/flows/domain/DomainCreateFlow.java`
#### Snippet
```java
 *     google.registry.flows.domain.token.AllocationTokenFlowUtils.AllocationTokenNotValidForDomainException}
 * @error {@link
 *     google.registry.flows.domain.token.AllocationTokenFlowUtils.AllocationTokenNotValidForRegistrarException}
 * @error {@link
 *     google.registry.flows.domain.token.AllocationTokenFlowUtils.AllocationTokenNotValidForTldException}
```

### UnnecessaryFullyQualifiedName
Qualifier `google.registry.flows.domain.token` is unnecessary and can be removed
in `core/src/main/java/google/registry/flows/domain/DomainCreateFlow.java`
#### Snippet
```java
 *     google.registry.flows.domain.token.AllocationTokenFlowUtils.AllocationTokenNotValidForRegistrarException}
 * @error {@link
 *     google.registry.flows.domain.token.AllocationTokenFlowUtils.AllocationTokenNotValidForTldException}
 * @error {@link
 *     google.registry.flows.domain.token.AllocationTokenFlowUtils.AlreadyRedeemedAllocationTokenException}
```

### UnnecessaryFullyQualifiedName
Qualifier `google.registry.flows.domain.token` is unnecessary and can be removed
in `core/src/main/java/google/registry/flows/domain/DomainCreateFlow.java`
#### Snippet
```java
 *     google.registry.flows.domain.token.AllocationTokenFlowUtils.AllocationTokenNotValidForTldException}
 * @error {@link
 *     google.registry.flows.domain.token.AllocationTokenFlowUtils.AlreadyRedeemedAllocationTokenException}
 * @error {@link
 *     google.registry.flows.domain.token.AllocationTokenFlowUtils.InvalidAllocationTokenException}
```

### UnnecessaryFullyQualifiedName
Qualifier `google.registry.flows.domain.token` is unnecessary and can be removed
in `core/src/main/java/google/registry/flows/domain/DomainCreateFlow.java`
#### Snippet
```java
 *     google.registry.flows.domain.token.AllocationTokenFlowUtils.AlreadyRedeemedAllocationTokenException}
 * @error {@link
 *     google.registry.flows.domain.token.AllocationTokenFlowUtils.InvalidAllocationTokenException}
 * @error {@link google.registry.flows.exceptions.OnlyToolCanPassMetadataException}
 * @error {@link ResourceAlreadyExistsForThisClientException}
```

### UnnecessaryFullyQualifiedName
Qualifier `google.registry.flows` is unnecessary and can be removed
in `core/src/main/java/google/registry/flows/domain/DomainCreateFlow.java`
#### Snippet
```java
 * @error {@link ResourceAlreadyExistsForThisClientException}
 * @error {@link ResourceCreateContentionException}
 * @error {@link google.registry.flows.EppException.UnimplementedExtensionException}
 * @error {@link google.registry.flows.ExtensionManager.UndeclaredServiceExtensionException}
 * @error {@link google.registry.flows.FlowUtils.NotLoggedInException}
```

### UnnecessaryFullyQualifiedName
Qualifier `google.registry.flows` is unnecessary and can be removed
in `core/src/main/java/google/registry/flows/domain/DomainCreateFlow.java`
#### Snippet
```java
 * @error {@link ResourceCreateContentionException}
 * @error {@link google.registry.flows.EppException.UnimplementedExtensionException}
 * @error {@link google.registry.flows.ExtensionManager.UndeclaredServiceExtensionException}
 * @error {@link google.registry.flows.FlowUtils.NotLoggedInException}
 * @error {@link google.registry.flows.FlowUtils.UnknownCurrencyEppException}
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.annotation` is unnecessary, and can be replaced with an import
in `core/src/main/java/google/registry/model/tld/label/package-info.java`
#### Snippet
```java
// limitations under the License.

@javax.annotation.ParametersAreNonnullByDefault
package google.registry.model.tld.label;

```

### UnnecessaryFullyQualifiedName
Qualifier `javax.persistence` is unnecessary and can be removed
in `core/src/main/java/google/registry/model/host/Host.java`
#### Snippet
```java
 * A persistable Host resource including mutable and non-mutable fields.
 *
 * <p>The {@link javax.persistence.Id} of the Host is the repoId.
 */
@Entity(name = "Host")
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.persistence` is unnecessary, and can be replaced with an import
in `core/src/main/java/google/registry/model/tld/label/PremiumList.java`
#### Snippet
```java
      implements Buildable, Serializable {

    @Insignificant @javax.persistence.Id Long revisionId;

    @Column(nullable = false)
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.persistence` is unnecessary, and can be replaced with an import
in `core/src/main/java/google/registry/model/tld/label/ReservedList.java`
#### Snippet
```java
 * revisionId. This is fine though, because we only use the list with the highest revisionId.
 */
@javax.persistence.Entity
@Table(indexes = {@Index(columnList = "name", name = "reservedlist_name_idx")})
public final class ReservedList
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.persistence` is unnecessary, and can be replaced with an import
in `core/src/main/java/google/registry/model/tld/label/ReservedList.java`
#### Snippet
```java
   * reservation type.
   */
  @javax.persistence.Entity(name = "ReservedEntry")
  public static class ReservedListEntry extends DomainLabelEntry<ReservationType, ReservedListEntry>
      implements Buildable, Serializable {
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.persistence` is unnecessary, and can be replaced with an import
in `core/src/main/java/google/registry/model/tmch/TmchCrl.java`
#### Snippet
```java

/** Singleton for ICANN's TMCH CA certificate revocation list (CRL). */
@javax.persistence.Entity
@Immutable
public final class TmchCrl extends CrossTldSingleton {
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.persistence` is unnecessary, and can be replaced with an import
in `core/src/main/java/google/registry/model/domain/token/PackagePromotion.java`
#### Snippet
```java
/** An entity representing a package promotion. */
@Entity
@javax.persistence.Table(indexes = {@javax.persistence.Index(columnList = "token")})
public class PackagePromotion extends ImmutableObject implements Buildable {

```

### UnnecessaryFullyQualifiedName
Qualifier `javax.persistence` is unnecessary, and can be replaced with an import
in `core/src/main/java/google/registry/model/domain/token/PackagePromotion.java`
#### Snippet
```java
/** An entity representing a package promotion. */
@Entity
@javax.persistence.Table(indexes = {@javax.persistence.Index(columnList = "token")})
public class PackagePromotion extends ImmutableObject implements Buildable {

```

### UnnecessaryFullyQualifiedName
Qualifier `google.registry.privileges.secretmanager` is unnecessary, and can be replaced with an import
in `core/src/main/java/google/registry/tools/RegistryToolComponent.java`
#### Snippet
```java
      RegistryToolDataflowModule.class,
      RequestFactoryModule.class,
      google.registry.privileges.secretmanager.SecretManagerModule.class,
      UrlConnectionServiceModule.class,
      UrlFetchServiceModule.class,
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.annotation` is unnecessary, and can be replaced with an import
in `core/src/main/java/google/registry/tools/package-info.java`
#### Snippet
```java
// limitations under the License.

@javax.annotation.ParametersAreNonnullByDefault
package google.registry.tools;

```

### UnnecessaryFullyQualifiedName
Qualifier `javax.annotation` is unnecessary, and can be replaced with an import
in `core/src/main/java/google/registry/tools/params/package-info.java`
#### Snippet
```java
// limitations under the License.

@javax.annotation.ParametersAreNonnullByDefault
package google.registry.tools.params;

```

### UnnecessaryFullyQualifiedName
Qualifier `javax.annotation` is unnecessary, and can be replaced with an import
in `core/src/main/java/google/registry/whois/package-info.java`
#### Snippet
```java
// limitations under the License.

@javax.annotation.ParametersAreNonnullByDefault
package google.registry.whois;

```

### UnnecessaryFullyQualifiedName
Qualifier `javax.annotation` is unnecessary, and can be replaced with an import
in `core/src/main/java/google/registry/config/package-info.java`
#### Snippet
```java
// limitations under the License.

@javax.annotation.ParametersAreNonnullByDefault
package google.registry.config;

```

### UnnecessaryFullyQualifiedName
Qualifier `javax.annotation` is unnecessary, and can be replaced with an import
in `core/src/main/java/google/registry/export/package-info.java`
#### Snippet
```java
// limitations under the License.

@javax.annotation.ParametersAreNonnullByDefault
package google.registry.export;

```

### UnnecessaryFullyQualifiedName
Qualifier `javax.annotation` is unnecessary, and can be replaced with an import
in `core/src/main/java/google/registry/export/sheet/package-info.java`
#### Snippet
```java
// limitations under the License.

@javax.annotation.ParametersAreNonnullByDefault
package google.registry.export.sheet;

```

### UnnecessaryFullyQualifiedName
Qualifier `javax.annotation` is unnecessary, and can be replaced with an import
in `core/src/main/java/google/registry/module/pubapi/package-info.java`
#### Snippet
```java
// limitations under the License.

@javax.annotation.ParametersAreNonnullByDefault
package google.registry.module.pubapi;

```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary, and can be replaced with an import
in `core/src/main/java/google/registry/module/ServletBase.java`
#### Snippet
```java
    // registered if metric reporter starts up correctly.
    try {
      metricReporter.get().startAsync().awaitRunning(java.time.Duration.ofSeconds(10));
      logger.atInfo().log("Started up MetricReporter.");
      LifecycleManager.getInstance()
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary, and can be replaced with an import
in `core/src/main/java/google/registry/module/ServletBase.java`
#### Snippet
```java
                      .get()
                      .stopAsync()
                      .awaitTerminated(java.time.Duration.ofSeconds(10));
                  logger.atInfo().log("Shut down MetricReporter.");
                } catch (TimeoutException e) {
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.annotation` is unnecessary, and can be replaced with an import
in `core/src/main/java/google/registry/module/backend/package-info.java`
#### Snippet
```java
// limitations under the License.

@javax.annotation.ParametersAreNonnullByDefault
package google.registry.module.backend;

```

### UnnecessaryFullyQualifiedName
Qualifier `javax.annotation` is unnecessary, and can be replaced with an import
in `core/src/main/java/google/registry/module/frontend/package-info.java`
#### Snippet
```java
// limitations under the License.

@javax.annotation.ParametersAreNonnullByDefault
package google.registry.module.frontend;

```

### UnnecessaryFullyQualifiedName
Qualifier `javax.annotation` is unnecessary, and can be replaced with an import
in `core/src/main/java/google/registry/keyring/api/package-info.java`
#### Snippet
```java
// limitations under the License.

@javax.annotation.ParametersAreNonnullByDefault
package google.registry.keyring.api;

```

### UnnecessaryFullyQualifiedName
Qualifier `javax.annotation` is unnecessary, and can be replaced with an import
in `core/src/main/java/google/registry/request/package-info.java`
#### Snippet
```java
// limitations under the License.

@javax.annotation.ParametersAreNonnullByDefault
package google.registry.request;

```

### UnnecessaryFullyQualifiedName
Qualifier `java.net` is unnecessary and can be removed
in `core/src/main/java/google/registry/request/UrlConnectionUtils.java`
#### Snippet
```java
import java.util.Random;

/** Utilities for common functionality relating to {@link java.net.URLConnection}s. */
public class UrlConnectionUtils {

```

### UnnecessaryFullyQualifiedName
Qualifier `javax.annotation` is unnecessary, and can be replaced with an import
in `core/src/main/java/google/registry/bigquery/package-info.java`
#### Snippet
```java
// limitations under the License.

@javax.annotation.ParametersAreNonnullByDefault
package google.registry.bigquery;

```

### UnnecessaryFullyQualifiedName
Qualifier `javax.annotation` is unnecessary, and can be replaced with an import
in `core/src/main/java/google/registry/security/package-info.java`
#### Snippet
```java
// limitations under the License.

@javax.annotation.ParametersAreNonnullByDefault
package google.registry.security;

```

### UnnecessaryFullyQualifiedName
Qualifier `google.registry.reporting.icann` is unnecessary and can be removed
in `core/src/main/java/google/registry/reporting/icann/DnsCountQueryCoordinator.java`
#### Snippet
```java
 *
 * <p>Derived classes must provide a constructor that accepts a
 * {@link google.registry.reporting.icann.DnsCountQueryCoordinator.Params}.  To override this,
 * define dnsCountQueryCoordinatorClass in your config file.
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.annotation` is unnecessary, and can be replaced with an import
in `core/src/main/java/google/registry/monitoring/whitebox/package-info.java`
#### Snippet
```java
// limitations under the License.

@javax.annotation.ParametersAreNonnullByDefault
package google.registry.monitoring.whitebox;

```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.base` is unnecessary, and can be replaced with an import
in `core/src/main/java/google/registry/privileges/secretmanager/SqlCredential.java`
#### Snippet
```java

  public static SqlCredential fromFormattedString(String sqlCredential) {
    List<String> items = com.google.common.base.Splitter.on(SEPARATOR).splitToList(sqlCredential);
    checkState(items.size() == 2, "Invalid SqlCredential string.");
    return of(items.get(0), items.get(1));
```

### UnnecessaryFullyQualifiedName
Qualifier `org.joda.time` is unnecessary and can be removed
in `core/src/main/java/google/registry/persistence/converter/DurationConverter.java`
#### Snippet
```java

/**
 * JPA converter to for storing/retrieving {@link org.joda.time.Duration} objects.
 *
 * <p>The Joda Time Duration is simply a number of milliseconds representing a length of time. This
```

### UnnecessaryFullyQualifiedName
Qualifier `org.joda.time` is unnecessary and can be removed
in `core/src/main/java/google/registry/persistence/converter/DateTimeConverter.java`
#### Snippet
```java
import org.joda.time.DateTime;

/** JPA converter to for storing/retrieving {@link org.joda.time.DateTime} objects. */
@Converter(autoApply = true)
public class DateTimeConverter implements AttributeConverter<DateTime, Timestamp> {
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.annotation` is unnecessary, and can be replaced with an import
in `util/src/main/java/google/registry/util/package-info.java`
#### Snippet
```java
// limitations under the License.

@javax.annotation.ParametersAreNonnullByDefault
package google.registry.util;

```

### UnnecessaryFullyQualifiedName
Qualifier `google.registry.util` is unnecessary and can be removed
in `util/src/main/java/google/registry/util/TransportEmailSender.java`
#### Snippet
```java
import javax.mail.Transport;

/** Wrapper for sending email so that we can test {@link google.registry.util.SendEmailService}. */
@Singleton
class TransportEmailSender {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `util/src/main/java/google/registry/util/ImprovedOutputStream.java`
#### Snippet
```java
  }

  /** @see java.io.FilterOutputStream#write(int) */
  @Override
  @OverridingMethodsMustInvokeSuper
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `util/src/main/java/google/registry/util/ImprovedOutputStream.java`
#### Snippet
```java
   * <p>This method may not be overridden, use {@link #onClose()} instead.
   *
   * @see java.io.OutputStream#close()
   */
  @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `util/src/main/java/google/registry/util/ImprovedOutputStream.java`
#### Snippet
```java
  }

  /** @see java.io.FilterOutputStream#write(byte[], int, int) */
  @Override
  @OverridingMethodsMustInvokeSuper
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `util/src/main/java/google/registry/util/TeeOutputStream.java`
#### Snippet
```java
  }

  /** @see java.io.OutputStream#write(int) */
  @Override
  public void write(int b) throws IOException {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `util/src/main/java/google/registry/util/TeeOutputStream.java`
#### Snippet
```java
  }

  /** @see java.io.OutputStream#write(byte[], int, int) */
  @Override
  public void write(byte[] b, int off, int len) throws IOException {
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.mail` is unnecessary and can be removed
in `util/src/main/java/google/registry/util/SendEmailService.java`
#### Snippet
```java

  /**
   * Converts the provided message content into a {@link javax.mail.Message} and sends it with retry
   * on transient failures.
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary, and can be replaced with an import
in `proxy/src/main/java/google/registry/proxy/ProxyServer.java`
#### Snippet
```java
      MetricReporter metricReporter = proxyComponent.metricReporter();
      try {
        metricReporter.startAsync().awaitRunning(java.time.Duration.ofSeconds(10));
        logger.atInfo().log("Started up MetricReporter.");
      } catch (TimeoutException timeoutException) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary, and can be replaced with an import
in `proxy/src/main/java/google/registry/proxy/ProxyServer.java`
#### Snippet
```java
                  () -> {
                    try {
                      metricReporter.stopAsync().awaitTerminated(java.time.Duration.ofSeconds(10));
                      logger.atInfo().log("Shut down MetricReporter.");
                    } catch (TimeoutException timeoutException) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary, and can be replaced with an import
in `common/src/main/java/google/registry/util/SystemSleeper.java`
#### Snippet
```java
  public void sleepUninterruptibly(ReadableDuration duration) {
    checkArgument(duration.getMillis() >= 0);
    Uninterruptibles.sleepUninterruptibly(java.time.Duration.ofMillis(duration.getMillis()));
  }
}
```

### UnnecessaryFullyQualifiedName
Qualifier `io.netty.bootstrap` is unnecessary and can be removed
in `prober/src/main/java/google/registry/monitoring/blackbox/ProberModule.java`
#### Snippet
```java
  /**
   * {@link Provides} one global {@link Channel} class that is used to construct a {@link
   * io.netty.bootstrap.Bootstrap}.
   */
  @Provides
```

## RuleId[ruleID=ThrowablePrintStackTrace]
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/RegistryCli.java`
#### Snippet
```java
                .findFirst();
        if (psqlException.isPresent() && psqlException.get().getMessage().contains("google:5432")) {
          e.printStackTrace();
          System.err.println("===================================================================");
          System.err.println(
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `core/src/main/java/google/registry/tools/ShellCommand.java`
#### Snippet
```java
      } catch (Exception e) {
        System.err.println("Got an exception:\n" + e);
        e.printStackTrace();
      }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `core/src/nonprod/java/google/registry/tools/GenerateSqlSchemaCommand.java`
#### Snippet
```java
      } catch (IOException e) {
        System.err.println("Error writing sql file: " + e);
        e.printStackTrace();
        System.exit(1);
      }
```

## RuleId[ruleID=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `CommandUseErrorException()` of an abstract class should not be declared 'public'
in `core/src/main/java/google/registry/flows/EppException.java`
#### Snippet
```java
  @EppResultCode(Code.COMMAND_USE_ERROR)
  public abstract static class CommandUseErrorException extends EppException {
    public CommandUseErrorException(String message) {
      super(message);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `StatusProhibitsOperationException()` of an abstract class should not be declared 'public'
in `core/src/main/java/google/registry/flows/EppException.java`
#### Snippet
```java
  @EppResultCode(Code.STATUS_PROHIBITS_OPERATION)
  public abstract static class StatusProhibitsOperationException extends EppException {
    public StatusProhibitsOperationException(String message) {
      super(message);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AssociationProhibitsOperationException()` of an abstract class should not be declared 'public'
in `core/src/main/java/google/registry/flows/EppException.java`
#### Snippet
```java
  @EppResultCode(Code.ASSOCIATION_PROHIBITS_OPERATION)
  public abstract static class AssociationProhibitsOperationException extends EppException {
    public AssociationProhibitsOperationException(String message) {
      super(message);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AuthenticationErrorClosingConnectionException()` of an abstract class should not be declared 'public'
in `core/src/main/java/google/registry/flows/EppException.java`
#### Snippet
```java
  @EppResultCode(Code.AUTHENTICATION_ERROR_CLOSING_CONNECTION)
  public abstract static class AuthenticationErrorClosingConnectionException extends EppException {
    public AuthenticationErrorClosingConnectionException(String message) {
      super(message);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `UnimplementedOptionException()` of an abstract class should not be declared 'public'
in `core/src/main/java/google/registry/flows/EppException.java`
#### Snippet
```java
  @EppResultCode(Code.UNIMPLEMENTED_OPTION)
  public abstract static class UnimplementedOptionException extends EppException {
    public UnimplementedOptionException(String message) {
      super(message);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `ObjectDoesNotExistException()` of an abstract class should not be declared 'public'
in `core/src/main/java/google/registry/flows/EppException.java`
#### Snippet
```java
    }

    public ObjectDoesNotExistException(Class<?> type, ImmutableSet<String> ids) {
      super(
          String.format(
```

### NonProtectedConstructorInAbstractClass
Constructor `SyntaxErrorException()` of an abstract class should not be declared 'public'
in `core/src/main/java/google/registry/flows/EppException.java`
#### Snippet
```java
  @EppResultCode(Code.SYNTAX_ERROR)
  public abstract static class SyntaxErrorException extends EppException {
    public SyntaxErrorException(String message) {
      super(message);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `ParameterValuePolicyErrorException()` of an abstract class should not be declared 'public'
in `core/src/main/java/google/registry/flows/EppException.java`
#### Snippet
```java
  @EppResultCode(Code.PARAMETER_VALUE_POLICY_ERROR)
  public abstract static class ParameterValuePolicyErrorException extends EppException {
    public ParameterValuePolicyErrorException(String message) {
      super(message);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `InvalidAuthorizationInformationErrorException()` of an abstract class should not be declared 'public'
in `core/src/main/java/google/registry/flows/EppException.java`
#### Snippet
```java
  @EppResultCode(Code.INVALID_AUTHORIZATION_INFORMATION_ERROR)
  public abstract static class InvalidAuthorizationInformationErrorException extends EppException {
    public InvalidAuthorizationInformationErrorException(String message) {
      super(message);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `RequiredParameterMissingException()` of an abstract class should not be declared 'public'
in `core/src/main/java/google/registry/flows/EppException.java`
#### Snippet
```java
  @EppResultCode(Code.REQUIRED_PARAMETER_MISSING)
  public abstract static class RequiredParameterMissingException extends EppException {
    public RequiredParameterMissingException(String message) {
      super(message);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `ObjectAlreadyExistsException()` of an abstract class should not be declared 'public'
in `core/src/main/java/google/registry/flows/EppException.java`
#### Snippet
```java
  @EppResultCode(Code.OBJECT_EXISTS)
  public abstract static class ObjectAlreadyExistsException extends EppException {
    public ObjectAlreadyExistsException(String message) {
      super(message);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `ObjectNotPendingTransferException()` of an abstract class should not be declared 'public'
in `core/src/main/java/google/registry/flows/EppException.java`
#### Snippet
```java
  @EppResultCode(Code.OBJECT_NOT_PENDING_TRANSFER)
  public abstract static class ObjectNotPendingTransferException extends EppException {
    public ObjectNotPendingTransferException(String id) {
      super(String.format("Object with given ID (%s) does not have a pending transfer.", id));
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `ObjectDoesNotExistException()` of an abstract class should not be declared 'public'
in `core/src/main/java/google/registry/flows/EppException.java`
#### Snippet
```java
  @EppResultCode(Code.OBJECT_DOES_NOT_EXIST)
  public abstract static class ObjectDoesNotExistException extends EppException {
    public ObjectDoesNotExistException(Class<?> type, String id) {
      super(
          String.format(
```

### NonProtectedConstructorInAbstractClass
Constructor `ParameterValueRangeErrorException()` of an abstract class should not be declared 'public'
in `core/src/main/java/google/registry/flows/EppException.java`
#### Snippet
```java
  @EppResultCode(Code.PARAMETER_VALUE_RANGE_ERROR)
  public abstract static class ParameterValueRangeErrorException extends EppException {
    public ParameterValueRangeErrorException(String message) {
      super(message);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `ParameterValueSyntaxErrorException()` of an abstract class should not be declared 'public'
in `core/src/main/java/google/registry/flows/EppException.java`
#### Snippet
```java
  @EppResultCode(Code.PARAMETER_VALUE_SYNTAX_ERROR)
  public abstract static class ParameterValueSyntaxErrorException extends EppException {
    public ParameterValueSyntaxErrorException(String message) {
      super(message);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AuthorizationErrorException()` of an abstract class should not be declared 'public'
in `core/src/main/java/google/registry/flows/EppException.java`
#### Snippet
```java
  @EppResultCode(Code.AUTHORIZATION_ERROR)
  public abstract static class AuthorizationErrorException extends EppException {
    public AuthorizationErrorException(String message) {
      super(message);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `ObjectPendingTransferException()` of an abstract class should not be declared 'public'
in `core/src/main/java/google/registry/flows/EppException.java`
#### Snippet
```java
  @EppResultCode(Code.OBJECT_PENDING_TRANSFER)
  public abstract static class ObjectPendingTransferException extends EppException {
    public ObjectPendingTransferException(String id) {
      super(String.format("Object with given ID (%s) already has a pending transfer.", id));
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AuthenticationErrorException()` of an abstract class should not be declared 'public'
in `core/src/main/java/google/registry/flows/EppException.java`
#### Snippet
```java
  @EppResultCode(Code.AUTHENTICATION_ERROR)
  public abstract static class AuthenticationErrorException extends EppException {
    public AuthenticationErrorException(String message) {
      super(message);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `Builder()` of an abstract class should not be declared 'public'
in `core/src/main/java/google/registry/model/tld/label/DomainLabelEntry.java`
#### Snippet
```java
      extends GenericBuilder<T, B> {

    public Builder() {}

    protected Builder(T instance) {
```

### NonProtectedConstructorInAbstractClass
Constructor `Builder()` of an abstract class should not be declared 'public'
in `core/src/main/java/google/registry/model/tld/label/BaseDomainLabelList.java`
#### Snippet
```java
      extends GenericBuilder<T, B> {

    public Builder() {}

    protected Builder(T instance) {
```

### NonProtectedConstructorInAbstractClass
Constructor `TransitionListParameter()` of an abstract class should not be declared 'public'
in `core/src/main/java/google/registry/tools/params/TransitionListParameter.java`
#### Snippet
```java
  private static final DateTimeParameter DATE_TIME_CONVERTER = new DateTimeParameter();

  public TransitionListParameter() {
    // This is not sentence-capitalized like most exception messages because it is appended to the
    // end of the toString() of the transition map in rendering a full exception message.
```

### NonProtectedConstructorInAbstractClass
Constructor `KeyValueMapParameter()` of an abstract class should not be declared 'public'
in `core/src/main/java/google/registry/tools/params/KeyValueMapParameter.java`
#### Snippet
```java
  }

  public KeyValueMapParameter() {
    super("Not formatted correctly.");
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `KeyValueMapParameter()` of an abstract class should not be declared 'public'
in `core/src/main/java/google/registry/tools/params/KeyValueMapParameter.java`
#### Snippet
```java
    extends ParameterConverterValidator<ImmutableMap<K, V>> {

  public KeyValueMapParameter(String messageForInvalid) {
    super(messageForInvalid);
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `ComparingInvocationHandler()` of an abstract class should not be declared 'public'
in `util/src/main/java/google/registry/util/ComparingInvocationHandler.java`
#### Snippet
```java
   *     Otherwise has no effect on the resulting proxy's behavior.
   */
  public ComparingInvocationHandler(
      Class<T> interfaceClass, T actualImplementation, T secondImplementation) {
    this.actualImplementation = actualImplementation;
```

## RuleId[ruleID=Convert2Lambda]
### Convert2Lambda
Anonymous new CacheLoader() can be replaced with lambda
in `common/src/testing/java/google/registry/testing/SystemInfo.java`
#### Snippet
```java
      Caffeine.newBuilder()
          .build(
              new CacheLoader<String, Boolean>() {
                @Override
                public Boolean load(String cmd) throws InterruptedException {
```

## RuleId[ruleID=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `date`
in `core/src/main/java/google/registry/rde/PendingDepositChecker.java`
#### Snippet
```java
  private static DateTime advanceToDayOfWeek(DateTime date, int dayOfWeek) {
    while (date.getDayOfWeek() != dayOfWeek) {
      date = date.plusDays(1);
    }
    return date;
```

### AssignmentToMethodParameter
Assignment to method parameter `params`
in `core/src/main/java/google/registry/cron/TldFanoutAction.java`
#### Snippet
```java
  private Task createTask(String tld, Multimap<String, String> params) {
    if (!tld.isEmpty()) {
      params = ArrayListMultimap.create(params);
      params.put(RequestParameters.PARAM_TLD, tld);
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `pathSearchString`
in `core/src/main/java/google/registry/rdap/RdapDomainAction.java`
#### Snippet
```java
    // RDAP Technical Implementation Guide 2.1.1 - we must support A-label (Punycode) and U-label
    // (Unicode) formats. canonicalizeName will transform Unicode to Punycode so we support both.
    pathSearchString = canonicalizeName(pathSearchString);
    try {
      validateDomainName(pathSearchString);
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `core/src/main/java/google/registry/rdap/RdapActionBase.java`
#### Snippet
```java

  String canonicalizeName(String name) {
    name = canonicalizeHostname(name);
    if (name.endsWith(".")) {
      name = name.substring(0, name.length() - 1);
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `core/src/main/java/google/registry/rdap/RdapActionBase.java`
#### Snippet
```java
    name = canonicalizeHostname(name);
    if (name.endsWith(".")) {
      name = name.substring(0, name.length() - 1);
    }
    return name;
```

### AssignmentToMethodParameter
Assignment to method parameter `pathSearchString`
in `core/src/main/java/google/registry/rdap/RdapNameserverAction.java`
#### Snippet
```java
    // RDAP Technical Implementation Guide 2.2.1 - we must support A-label (Punycode) and U-label
    // (Unicode) formats. canonicalizeName will transform Unicode to Punycode so we support both.
    pathSearchString = canonicalizeName(pathSearchString);
    // The RDAP syntax is /rdap/nameserver/ns1.mydomain.com.
    try {
```

### AssignmentToMethodParameter
Assignment to method parameter `object`
in `core/src/main/java/google/registry/rdap/AbstractJsonableObject.java`
#### Snippet
```java
          return;
        }
        object = optional.get();
      }

```

### AssignmentToMethodParameter
Assignment to method parameter `clazz`
in `core/src/main/java/google/registry/rdap/AbstractJsonableObject.java`
#### Snippet
```java
    // message - we want to tell the user exactly which class was annotated with the
    // RestrictJsonNames if there was an error!
    for (; clazz != null; clazz = clazz.getSuperclass()) {
      RestrictJsonNames restrictJsonFields = clazz.getAnnotation(RestrictJsonNames.class);
      if (restrictJsonFields == null) {
```

### AssignmentToMethodParameter
Assignment to method parameter `builder`
in `core/src/main/java/google/registry/rdap/RdapSearchActionBase.java`
#### Snippet
```java
      CriteriaQueryBuilder<T> builder, DeletedItemHandling deletedItemHandling) {
    if (!Objects.equals(deletedItemHandling, DeletedItemHandling.INCLUDE)) {
      builder =
          builder.where(
              "deletionTime",
```

### AssignmentToMethodParameter
Assignment to method parameter `builder`
in `core/src/main/java/google/registry/rdap/RdapSearchActionBase.java`
#### Snippet
```java
    Optional<String> desiredRegistrar = getDesiredRegistrar();
    if (desiredRegistrar.isPresent()) {
      builder =
          builder.where(
              "currentSponsorRegistrarId",
```

### AssignmentToMethodParameter
Assignment to method parameter `data`
in `core/src/main/java/google/registry/tmch/TmchData.java`
#### Snippet
```java
    int endTagIndex = data.indexOf(END_ENCODED_SMD);
    if (beginTagIndex >= 0 && endTagIndex >= 0) {
      data = data.substring(beginTagIndex + BEGIN_ENCODED_SMD.length(), endTagIndex);
    }
    return EncodedSignedMark.create("base64", whitespace().removeFrom(data));
```

### AssignmentToMethodParameter
Assignment to method parameter `contact`
in `core/src/main/java/google/registry/rdap/RdapJsonFormatter.java`
#### Snippet
```java
      // contact with a safe resource. Then we can add any information we need (e.g. the
      // Organization / state / country of the registrant), although we currently don't do that.
      contact =
          new Contact.Builder()
              .setRepoId(CONTACT_REDACTED_VALUE)
```

### AssignmentToMethodParameter
Assignment to method parameter `domainName`
in `core/src/main/java/google/registry/model/tld/Registries.java`
#### Snippet
```java
    ImmutableSet<String> tlds = getTlds();
    while (domainName.hasParent()) {
      domainName = domainName.parent();
      if (tlds.contains(domainName.toString())) {
        return Optional.of(domainName);
```

### AssignmentToMethodParameter
Assignment to method parameter `line`
in `core/src/main/java/google/registry/model/tld/label/BaseDomainLabelList.java`
#### Snippet
```java
    if (index != -1) {
      comment = line.substring(index + 1).trim();
      line = line.substring(0, index).trim();
    } else {
      line = line.trim();
```

### AssignmentToMethodParameter
Assignment to method parameter `line`
in `core/src/main/java/google/registry/model/tld/label/BaseDomainLabelList.java`
#### Snippet
```java
      line = line.substring(0, index).trim();
    } else {
      line = line.trim();
    }
    return line.isEmpty() ? ImmutableList.of() : ImmutableList.of(line, comment);
```

### AssignmentToMethodParameter
Assignment to method parameter `faxNumber`
in `core/src/main/java/google/registry/model/contact/ContactBase.java`
#### Snippet
```java
    public B setFaxNumber(ContactPhoneNumber faxNumber) {
      if (faxNumber != null && faxNumber.hasNullFields()) {
        faxNumber = null;
      }
      getInstance().fax = faxNumber;
```

### AssignmentToMethodParameter
Assignment to method parameter `voiceNumber`
in `core/src/main/java/google/registry/model/contact/ContactBase.java`
#### Snippet
```java
    public B setVoiceNumber(ContactPhoneNumber voiceNumber) {
      if (voiceNumber != null && voiceNumber.hasNullFields()) {
        voiceNumber = null;
      }
      getInstance().voice = voiceNumber;
```

### AssignmentToMethodParameter
Assignment to method parameter `clientCertificate`
in `core/src/main/java/google/registry/model/registrar/Registrar.java`
#### Snippet
```java

    public Builder setClientCertificate(String clientCertificate, DateTime now) {
      clientCertificate = emptyToNull(clientCertificate);
      String clientCertificateHash = calculateHash(clientCertificate);
      if (!Objects.equals(clientCertificate, getInstance().clientCertificate)
```

### AssignmentToMethodParameter
Assignment to method parameter `clientCertificate`
in `core/src/main/java/google/registry/model/registrar/Registrar.java`
#### Snippet
```java

    public Builder setFailoverClientCertificate(String clientCertificate, DateTime now) {
      clientCertificate = emptyToNull(clientCertificate);
      String clientCertificateHash = calculateHash(clientCertificate);
      if (!Objects.equals(clientCertificate, getInstance().failoverClientCertificate)
```

### AssignmentToMethodParameter
Assignment to method parameter `digest`
in `core/src/main/java/google/registry/tools/DsRecord.java`
#### Snippet
```java

  private static DsRecord create(int keyTag, int alg, int digestType, String digest) {
    digest = Ascii.toUpperCase(digest);
    checkArgument(
        BaseEncoding.base16().canDecode(digest),
```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `core/src/main/java/google/registry/tools/params/MoneyParameter.java`
#### Snippet
```java
    // Add space after currency code if it's missing, to make the CLI a bit friendlier.
    if (value.length() > 3 && value.charAt(3) != ' ') {
      value = String.format("%s %s", value.substring(0, 3), value.substring(3));
    }
    return Money.parse(Ascii.toUpperCase(value));
```

### AssignmentToMethodParameter
Assignment to method parameter `domain`
in `core/src/main/java/google/registry/tools/server/GenerateZoneFilesAction.java`
#### Snippet
```java
  private void populateStanzasForDomain(
      Domain domain, DateTime exportTime, ImmutableList.Builder<String> result) {
    domain = loadAtPointInTime(domain, exportTime);
    // A null means the domain was deleted (or not created) at this time.
    if (domain == null || !domain.shouldPublishToDns()) {
```

### AssignmentToMethodParameter
Assignment to method parameter `prefix`
in `core/src/main/java/google/registry/whois/WhoisResponseImpl.java`
#### Snippet
```java
    /** Emit a contact address. */
    E emitAddress(@Nullable String prefix, @Nullable Address address, boolean fullOutput) {
      prefix = isNullOrEmpty(prefix) ? "" : prefix + " ";
      if (address != null) {
        emitList(prefix + "Street", address.getStreet(), fullOutput);
```

### AssignmentToMethodParameter
Assignment to method parameter `job`
in `core/src/main/java/google/registry/bigquery/BigqueryConnection.java`
#### Snippet
```java
      JobReference ref = job.getJobReference();
      try {
        job = bigquery.jobs().get(ref.getProjectId(), ref.getJobId()).execute();
      } catch (IOException e) {
        throw BigqueryJobFailureException.create(e);
```

### AssignmentToMethodParameter
Assignment to method parameter `typeElement`
in `docs/src/main/java/google/registry/documentation/FlowDocumentation.java`
#### Snippet
```java
          return typeElement;
        }
        typeElement = superClassTypeElement;
      }
      // Failure; we reached the root without finding a subclass of EppException.
```

### AssignmentToMethodParameter
Assignment to method parameter `token`
in `prober/src/main/java/google/registry/monitoring/blackbox/ProbingSequence.java`
#### Snippet
```java
   */
  private void runNextStep(Token token) {
    token = lastStep ? token.next() : token;
    next().runStep(token);
  }
```

### AssignmentToMethodParameter
Assignment to method parameter `path`
in `util/src/main/java/google/registry/util/CloudTasksUtils.java`
#### Snippet
```java
                      .collect(toImmutableList()));
      if (method == HttpMethod.GET) {
        path = String.format("%s?%s", path, encodedParams);
      } else {
        requestBuilder
```

## RuleId[ruleID=ReturnNull]
### ReturnNull
Return of `null`
in `core/src/main/java/google/registry/ui/forms/FormFields.java`
#### Snippet
```java
          .emptyToNull()
          .trimmed()
          .transform(input -> input != null ? WHITESPACE.matcher(input).replaceAll(" ") : null)
          .build();

```

### ReturnNull
Return of `null`
in `core/src/main/java/google/registry/ui/server/SendEmailUtils.java`
#### Snippet
```java
                      // Returning null excludes this address from the list of recipients on the
                      // email.
                      return null;
                    }
                  })
```

### ReturnNull
Return of `null`
in `core/src/main/java/google/registry/dns/DnsWriterProxy.java`
#### Snippet
```java
      logger.atWarning().log(
          "Loaded potentially stale DNS writer %s which is not active on TLD %s.", className, tld);
      return null;
    }
    DnsWriter dnsWriter = dnsWriters.get(className);
```

### ReturnNull
Return of `null`
in `core/src/main/java/google/registry/ui/server/RegistrarFormFields.java`
#### Snippet
```java
  private static CidrAddressBlock parseCidr(String input) {
    try {
      return input != null ? CidrAddressBlock.create(input) : null;
    } catch (IllegalArgumentException e) {
      throw new FormFieldException("Not a valid CIDR notation IP-address block.", e);
```

### ReturnNull
Return of `null`
in `core/src/main/java/google/registry/ui/server/RegistrarFormFields.java`
#### Snippet
```java
              input -> {
                if (input == null) {
                  return null;
                }
                try {
```

### ReturnNull
Return of `null`
in `core/src/main/java/google/registry/dns/PublishDnsUpdatesAction.java`
#### Snippet
```java
          String.format(
              "Could not parse email contact %s to send DNS failure notification", email));
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `core/src/main/java/google/registry/ui/forms/FormField.java`
#### Snippet
```java
      Function<O, String> trimFunction =
          (Function<O, String>)
              ((Function<String, String>) input -> input != null ? input.trim() : null);
      return transform(String.class, trimFunction);
    }
```

### ReturnNull
Return of `null`
in `core/src/main/java/google/registry/ui/forms/FormField.java`
#### Snippet
```java
          (Function<O, String>)
              ((Function<String, String>)
                  input -> input != null ? input.toUpperCase(Locale.ENGLISH) : null);
      return transform(String.class, funk);
    }
```

### ReturnNull
Return of `null`
in `core/src/main/java/google/registry/ui/forms/FormField.java`
#### Snippet
```java
              (Function<O, O>)
                  ((Function<List<Object>, Set<Object>>)
                      input -> input != null ? ImmutableSet.copyOf(input) : null);
      return asList().transform(setOut, toSetFunction);
    }
```

### ReturnNull
Return of `null`
in `core/src/main/java/google/registry/ui/forms/FormField.java`
#### Snippet
```java
          (Function<O, String>)
              ((Function<String, String>)
                  input -> input != null ? input.toLowerCase(Locale.ENGLISH) : null);
      return transform(String.class, funk);
    }
```

### ReturnNull
Return of `null`
in `core/src/main/java/google/registry/ui/forms/FormField.java`
#### Snippet
```java
              ((input instanceof CharSequence) && (((CharSequence) input).length() == 0))
                      || ((input instanceof Collection) && ((Collection<?>) input).isEmpty())
                  ? null
                  : input);
    }
```

### ReturnNull
Return of `null`
in `core/src/main/java/google/registry/batch/WipeOutCloudSqlAction.java`
#### Snippet
```java
              dropAllSequences(conn, listSequences(conn));
            }
            return null;
          },
          e -> !(e instanceof SQLException));
```

### ReturnNull
Return of `null`
in `core/src/main/java/google/registry/flows/TlsCredentials.java`
#### Snippet
```java
      return InetAddresses.forString(HostAndPort.fromString(asciiAddr).getHost());
    } catch (IllegalArgumentException e) {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `core/src/main/java/google/registry/flows/ResourceFlowUtils.java`
#### Snippet
```java
                    return new ResourceDoesNotExistException(resourceClass, targetId);
                  }
                  return isLinked(key, now) ? new ResourceToDeleteIsReferencedException() : null;
                });
    if (failfastException != null) {
```

### ReturnNull
Return of `null`
in `core/src/main/java/google/registry/flows/picker/FlowPicker.java`
#### Snippet
```java
        EppInput eppInput, InnerCommand innerCommand, ResourceCommand resourceCommand) {
      if (!(innerCommand instanceof Poll)) {
        return null;
      }
      switch (((Poll) innerCommand).getPollOp()) {
```

### ReturnNull
Return of `null`
in `core/src/main/java/google/registry/flows/picker/FlowPicker.java`
#### Snippet
```java
      return resourceCommand != null && innerCommand instanceof Transfer
          ? transferFlows.get(resourceCommand.getClass(), ((Transfer) innerCommand).getTransferOp())
          : null;
    }};

```

### ReturnNull
Return of `null`
in `core/src/main/java/google/registry/flows/picker/FlowPicker.java`
#### Snippet
```java
        EppInput eppInput, InnerCommand innerCommand, ResourceCommand resourceCommand) {
      if (!(resourceCommand instanceof DomainCommand.Update)) {
        return null;
      }
      Optional<RgpUpdateExtension> rgpUpdateExtension =
```

### ReturnNull
Return of `null`
in `core/src/main/java/google/registry/flows/picker/FlowPicker.java`
#### Snippet
```java
          eppInput.getSingleExtension(RgpUpdateExtension.class);
      if (!rgpUpdateExtension.isPresent()) {
        return null;
      }
      // Restore command with an op of "report" is not currently supported.
```

### ReturnNull
Return of `null`
in `core/src/main/java/google/registry/flows/picker/FlowPicker.java`
#### Snippet
```java
    Class<? extends Flow> get(
        EppInput eppInput, InnerCommand innerCommand, ResourceCommand resourceCommand) {
      return innerCommand == null ? null : commandFlows.get(innerCommand.getClass());
    }};

```

### ReturnNull
Return of `null`
in `core/src/main/java/google/registry/flows/picker/FlowPicker.java`
#### Snippet
```java
    Class<? extends Flow> get(
        EppInput eppInput, InnerCommand innerCommand, ResourceCommand resourceCommand) {
      return resourceCommand == null ? null : resourceCrudFlows.get(resourceCommand.getClass());
    }};

```

### ReturnNull
Return of `null`
in `core/src/main/java/google/registry/flows/picker/FlowPicker.java`
#### Snippet
```java
            EppInput eppInput, InnerCommand innerCommand, ResourceCommand resourceCommand) {
          if (!(resourceCommand instanceof DomainCommand.Check)) {
            return null;
          }
          Optional<LaunchCheckExtension> launchCheck =
```

### ReturnNull
Return of `null`
in `core/src/main/java/google/registry/flows/picker/FlowPicker.java`
#### Snippet
```java
            return DomainClaimsCheckFlow.class;
          }
          return null;
        }
      };
```

### ReturnNull
Return of `null`
in `core/src/main/java/google/registry/flows/picker/FlowPicker.java`
#### Snippet
```java
    Class<? extends Flow> get(
        EppInput eppInput, InnerCommand innerCommand, ResourceCommand resourceCommand) {
      return eppInput.getCommandWrapper() instanceof Hello ? HelloFlow.class : null;
    }};

```

### ReturnNull
Return of `null`
in `core/src/main/java/google/registry/model/EppResourceUtils.java`
#### Snippet
```java
    // If we're before the resource creation time, don't try to find a "most recent revision".
    if (timestamp.isBefore(resource.getCreationTime())) {
      return null;
    }
    // If the resource was not modified after the requested time, then use it as-is, otherwise find
```

### ReturnNull
Return of `null`
in `core/src/main/java/google/registry/model/EppResourceUtils.java`
#### Snippet
```java
            : loadMostRecentRevisionAtTime(resource, timestamp);
    return (loadedResource == null)
        ? null
        : (isActive(loadedResource, timestamp)
            ? cloneProjectedAtTime(loadedResource, timestamp)
```

### ReturnNull
Return of `null`
in `core/src/main/java/google/registry/model/EppResourceUtils.java`
#### Snippet
```java
        : (isActive(loadedResource, timestamp)
            ? cloneProjectedAtTime(loadedResource, timestamp)
            : null);
  }

```

### ReturnNull
Return of `null`
in `core/src/main/java/google/registry/model/ModelUtils.java`
#### Snippet
```java
        || (obj instanceof Map && ((Map<?, ?>) obj).isEmpty())
        || (obj.getClass().isArray() && Array.getLength(obj) == 0)) {
      return null;
    }
    Predicate<Object> immutableObjectOrNull = or(isNull(), instanceOf(ImmutableObject.class));
```

### ReturnNull
Return of `null`
in `core/src/main/java/google/registry/model/ImmutableObject.java`
#### Snippet
```java
  private static Object toMapRecursive(Object o) {
    if (o == null) {
      return null;
    } else if (o instanceof ImmutableObject) {
      // LinkedHashMap to preserve field ordering and because ImmutableMap forbids null
```

### ReturnNull
Return of `null`
in `core/src/main/java/google/registry/model/smd/RemoveWhitespaceTextAdapter.java`
#### Snippet
```java
  @Override
  public String marshal(Text t) {
    return (t == null) ? null : t.getValue();
  }
}
```

### ReturnNull
Return of `null`
in `core/src/main/java/google/registry/model/smd/RemoveWhitespaceTextAdapter.java`
#### Snippet
```java
  @Override
  public Text unmarshal(String value) {
    return (value == null) ? null : new Text(WHITESPACE.removeFrom(value));
  }

```

### ReturnNull
Return of `null`
in `core/src/main/java/google/registry/model/ofy/Ofy.java`
#### Snippet
```java
      ofy().transactNew(() -> {
        readOnlyWork.run();
        return null;
      });
    } catch (TransientFailureException | DatastoreTimeoutException | DatastoreFailureException e) {
```

### ReturnNull
Return of `null`
in `core/src/main/java/google/registry/model/ofy/Ofy.java`
#### Snippet
```java
        ofy().transactNew(() -> {
          work.run();
          return null;
        });
        return work.getResult();
```

### ReturnNull
Return of `null`
in `core/src/main/java/google/registry/model/ofy/Ofy.java`
#### Snippet
```java
        () -> {
          work.run();
          return null;
        });
  }
```

### ReturnNull
Return of `null`
in `core/src/main/java/google/registry/model/ofy/Ofy.java`
#### Snippet
```java
        () -> {
          work.run();
          return null;
        });
  }
```

### ReturnNull
Return of `null`
in `core/src/main/java/google/registry/model/ofy/Ofy.java`
#### Snippet
```java
        () -> {
          work.run();
          return null;
        });
  }
```

### ReturnNull
Return of `null`
in `core/src/main/java/google/registry/model/common/GaeUserIdConverter.java`
#### Snippet
```java
              () -> {
                auditedOfy().saveWithoutBackup().entity(gaeUserIdConverter).now();
                return null;
              });
      // The read must be done in its own transaction to avoid reading from the session cache.
```

### ReturnNull
Return of `null`
in `core/src/main/java/google/registry/model/domain/DomainCommand.java`
#### Snippet
```java
      Set<ForeignKeyedDesignatedContact> contacts, DateTime now) throws InvalidReferencesException {
    if (contacts == null) {
      return null;
    }
    ImmutableSet.Builder<String> foreignKeys = new ImmutableSet.Builder<>();
```

### ReturnNull
Return of `null`
in `core/src/main/java/google/registry/model/domain/DomainCommand.java`
#### Snippet
```java
      throws InvalidReferencesException {
    if (hostNames == null) {
      return null;
    }
    return ImmutableSet.copyOf(loadByForeignKeysCached(hostNames, Host.class, now).values());
```

### ReturnNull
Return of `null`
in `core/src/main/java/google/registry/model/domain/fee06/FeeCheckCommandExtensionV06.java`
#### Snippet
```java
  @Override
  public CurrencyUnit getCurrency() {
    return null;  // This version of the fee extension doesn't specify a top-level currency.
  }

```

### ReturnNull
Return of `null`
in `core/src/main/java/google/registry/model/domain/fee11/FeeCheckCommandExtensionV11.java`
#### Snippet
```java
    // specified at the top level we've modeled it as a single fake item with the currency inside,
    // so there's no top level currency to return here.
    return null;
  }

```

### ReturnNull
Return of `null`
in `core/src/main/java/google/registry/model/domain/fee12/FeeCheckCommandExtensionItemV12.java`
#### Snippet
```java
  @Override
  public CurrencyUnit getCurrency() {
    return null;  // This version of the fee extension doesn't specify currency per-item.
  }

```

### ReturnNull
Return of `null`
in `core/src/main/java/google/registry/model/adapters/CurrencyUnitAdapter.java`
#### Snippet
```java
  @Override
  public String marshal(CurrencyUnit currency) {
    return currency == null ? null : currency.toString();
  }

```

### ReturnNull
Return of `null`
in `core/src/main/java/google/registry/model/eppinput/ResourceCommand.java`
#### Snippet
```java
    @Override
    public AuthInfo getAuthInfo() {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `core/src/main/java/google/registry/model/registrar/Registrar.java`
#### Snippet
```java
    private static String calculateHash(String clientCertificate) {
      if (clientCertificate == null) {
        return null;
      }
      try {
```

### ReturnNull
Return of `null`
in `core/src/main/java/google/registry/model/reporting/HistoryEntry.java`
#### Snippet
```java

  public byte[] getXmlBytes() {
    return xmlBytes == null ? null : xmlBytes.clone();
  }

```

### ReturnNull
Return of `null`
in `core/src/main/java/google/registry/tools/VerifyOteCommand.java`
#### Snippet
```java
            registrar -> {
              if (!registrar.isLive()) {
                return null;
              }
              String name = registrar.getRegistrarId();
```

### ReturnNull
Return of `null`
in `core/src/main/java/google/registry/tools/VerifyOteCommand.java`
#### Snippet
```java
              // Check if any replacement happened, and thus whether the name matches the format.
              // If it matches, provide the shortened name, and otherwise return null.
              return name.equals(replacedName) ? null : replacedName;
            })
        .filter(Objects::nonNull)
```

### ReturnNull
Return of `null`
in `core/src/main/java/google/registry/tools/ShellCommand.java`
#### Snippet
```java
      return lineReader.readLine();
    } catch (IOException e) {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `core/src/main/java/google/registry/flows/FlowComponent.java`
#### Snippet
```java
          : clazz.equals(LoginFlow.class) ? flows.loginFlow()
          : clazz.equals(LogoutFlow.class) ? flows.logoutFlow()
          : null;
    }
  }
```

### ReturnNull
Return of `null`
in `core/src/main/java/google/registry/tools/AppEngineConnection.java`
#### Snippet
```java
  private static String extractHtmlTitle(String html) {
    Matcher matcher = HTML_TITLE_TAG_PATTERN.matcher(html);
    return (matcher.find() ? matcher.group(1) : null);
  }

```

### ReturnNull
Return of `null`
in `core/src/main/java/google/registry/tools/javascrap/CreateSyntheticDomainHistoriesCommand.java`
#### Snippet
```java
                  System.out.printf("Saved histories for %d domains%n", numProcessed);
                }
                return null;
              }));
    }
```

### ReturnNull
Return of `null`
in `core/src/main/java/google/registry/reporting/icann/IcannReportingStagingAction.java`
#### Snippet
```java
                    null,
                    Duration.standardMinutes(2)));
            return null;
          },
          BigqueryJobFailureException.class);
```

### ReturnNull
Return of `null`
in `core/src/main/java/google/registry/persistence/converter/StringListConverterBase.java`
#### Snippet
```java
  public List<T> convertToEntityAttribute(StringCollection dbData) {
    return dbData == null || dbData.getCollection() == null
        ? null
        : dbData.getCollection().stream().map(this::fromString).collect(toImmutableList());
  }
```

### ReturnNull
Return of `null`
in `core/src/main/java/google/registry/persistence/converter/StringListConverterBase.java`
#### Snippet
```java
  public StringCollection convertToDatabaseColumn(List<T> attribute) {
    return attribute == null
        ? null
        : StringCollection.create(
            attribute.stream().map(this::toString).collect(toImmutableList()));
```

### ReturnNull
Return of `null`
in `core/src/main/java/google/registry/persistence/converter/LocalDateConverter.java`
#### Snippet
```java
  @Override
  public LocalDate convertToEntityAttribute(Date dbData) {
    return dbData == null ? null : DateTimeUtils.toLocalDate(dbData);
  }
}
```

### ReturnNull
Return of `null`
in `core/src/main/java/google/registry/persistence/converter/LocalDateConverter.java`
#### Snippet
```java
  @Override
  public Date convertToDatabaseColumn(LocalDate attribute) {
    return attribute == null ? null : DateTimeUtils.toSqlDate(attribute);
  }

```

### ReturnNull
Return of `null`
in `core/src/main/java/google/registry/persistence/converter/StringMapConverterBase.java`
#### Snippet
```java
  public M convertToEntityAttribute(StringMap dbData) {
    return dbData == null
        ? null
        : convertMapToDerivedType(
            dbData.getMap().entrySet().stream()
```

### ReturnNull
Return of `null`
in `core/src/main/java/google/registry/persistence/converter/StringMapConverterBase.java`
#### Snippet
```java
  public StringMap convertToDatabaseColumn(M attribute) {
    return attribute == null
        ? null
        : StringMap.create(
            attribute.entrySet().stream()
```

### ReturnNull
Return of `null`
in `core/src/main/java/google/registry/persistence/converter/StringSetConverterBase.java`
#### Snippet
```java
  public Set<T> convertToEntityAttribute(StringCollection dbData) {
    return dbData == null || dbData.getCollection() == null
        ? null
        : dbData.getCollection().stream().map(this::fromString).collect(toImmutableSet());
  }
```

### ReturnNull
Return of `null`
in `core/src/main/java/google/registry/persistence/converter/IntervalDescriptor.java`
#### Snippet
```java
  public <X> PGInterval wrap(X value, WrapperOptions options) {
    if (value == null) {
      return null;
    }
    if (value instanceof PGInterval) {
```

### ReturnNull
Return of `null`
in `core/src/main/java/google/registry/persistence/converter/IntervalDescriptor.java`
#### Snippet
```java
  public <X> X unwrap(PGInterval value, Class<X> type, WrapperOptions options) {
    if (value == null) {
      return null;
    }
    if (PGInterval.class.isAssignableFrom(type)) {
```

### ReturnNull
Return of `null`
in `core/src/main/java/google/registry/persistence/converter/StringSetConverterBase.java`
#### Snippet
```java
  public StringCollection convertToDatabaseColumn(Set<T> attribute) {
    return attribute == null
        ? null
        : StringCollection.create(attribute.stream().map(this::toString).collect(toImmutableSet()));
  }
```

### ReturnNull
Return of `null`
in `core/src/main/java/google/registry/persistence/converter/StringCollectionDescriptor.java`
#### Snippet
```java
  public <X> X unwrap(StringCollection value, Class<X> type, WrapperOptions options) {
    if (value == null) {
      return null;
    }
    if (Collection.class.isAssignableFrom(type)) {
```

### ReturnNull
Return of `null`
in `core/src/main/java/google/registry/persistence/converter/StringCollectionDescriptor.java`
#### Snippet
```java
  public <X> StringCollection wrap(X value, WrapperOptions options) {
    if (value == null) {
      return null;
    }
    if (value instanceof Array) {
```

### ReturnNull
Return of `null`
in `core/src/main/java/google/registry/privileges/secretmanager/SecretManagerClientImpl.java`
#### Snippet
```java
        () -> {
          csmClient.deleteSecret(SecretName.of(project, secretId));
          return null;
        });
  }
```

### ReturnNull
Return of `null`
in `core/src/main/java/google/registry/persistence/converter/StringMapDescriptor.java`
#### Snippet
```java
  public <X> X unwrap(StringMap value, Class<X> type, WrapperOptions options) {
    if (value == null) {
      return null;
    }
    if (Map.class.isAssignableFrom(type)) {
```

### ReturnNull
Return of `null`
in `core/src/main/java/google/registry/persistence/converter/StringMapDescriptor.java`
#### Snippet
```java
  public <X> StringMap wrap(X value, WrapperOptions options) {
    if (value == null) {
      return null;
    }
    if (value instanceof Map) {
```

### ReturnNull
Return of `null`
in `core/src/main/java/google/registry/persistence/converter/StringMapDescriptor.java`
#### Snippet
```java
      private Map<String, String> getStringMap(X value) {
        if (value == null) {
          return null;
        }
        if (value instanceof StringMap) {
```

### ReturnNull
Return of `null`
in `core/src/main/java/google/registry/persistence/transaction/JpaTransactionManagerImpl.java`
#### Snippet
```java
        () -> {
          work.run();
          return null;
        });
  }
```

### ReturnNull
Return of `null`
in `core/src/main/java/google/registry/persistence/transaction/JpaTransactionManagerImpl.java`
#### Snippet
```java
        () -> {
          work.run();
          return null;
        });
  }
```

### ReturnNull
Return of `null`
in `util/src/main/java/google/registry/util/CollectionUtils.java`
#### Snippet
```java
  /** Defensive copy helper for {@link Set}. */
  public static <V> ImmutableSet<V> nullSafeImmutableCopy(@Nullable Set<V> data) {
    return data == null ? null : ImmutableSet.copyOf(data);
  }

```

### ReturnNull
Return of `null`
in `util/src/main/java/google/registry/util/CollectionUtils.java`
#### Snippet
```java
  /** Defensive copy helper for {@link List}. */
  public static <V> ImmutableList<V> nullSafeImmutableCopy(@Nullable List<V> data) {
    return data == null ? null : ImmutableList.copyOf(data);
  }

```

### ReturnNull
Return of `null`
in `proxy/src/main/java/google/registry/proxy/handler/ProxyProtocolHandler.java`
#### Snippet
```java
    return (remoteAddress instanceof InetSocketAddress)
        ? ((InetSocketAddress) remoteAddress).getAddress().getHostAddress()
        : null;
  }

```

### ReturnNull
Return of `null`
in `prober/src/main/java/google/registry/monitoring/blackbox/message/EppMessage.java`
#### Snippet
```java
    } catch (XPathExpressionException e) {
      logger.atSevere().withCause(e).log("Bad expression: %s", expression);
      return null;
    }
  }
```

## RuleId[ruleID=AssignmentToLambdaParameter]
### AssignmentToLambdaParameter
Assignment to lambda parameter `clazz`
in `core/src/main/java/google/registry/model/ModelUtils.java`
#### Snippet
```java
                // Walk the hierarchy up to but not including ImmutableObject (to ignore
                // hashCode).
                for (; clazz != ImmutableObject.class; clazz = clazz.getSuperclass()) {
                  // Add to the front, so that shadowed fields show up later in the list.
                  // This will mean that getFieldValues will show the most derived value.
```

## RuleId[ruleID=BusyWait]
### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `util/src/main/java/google/registry/util/UrlChecker.java`
#### Snippet
```java
                    return null;
                  }
                  Thread.sleep(exponentialBackoffMs *= 2);
                }
              },
```

## RuleId[ruleID=ClassCanBeRecord]
### ClassCanBeRecord
Class can be a record
in `common/src/testing/java/google/registry/testing/truth/TextDiffSubject.java`
#### Snippet
```java
  }

  private static class SideBySideRowFormatter {
    private final int maxExpectedLineLength;
    private final int maxActualLineLength;
```

## RuleId[ruleID=UnstableApiUsage]
### UnstableApiUsage
'com.google.common.util.concurrent.RateLimiter' is marked unstable with @Beta
in `core/src/main/java/google/registry/dns/writer/clouddns/CloudDnsWriterModule.java`
#### Snippet
```java
  @Provides
  @Named("cloudDns")
  static RateLimiter provideRateLimiter() {
    // This is the default max QPS for Cloud DNS. It can be increased by contacting the team
    // via the Quotas page on the Cloud Console.
```

### UnstableApiUsage
'com.google.common.util.concurrent.RateLimiter' is marked unstable with @Beta
in `core/src/main/java/google/registry/dns/writer/clouddns/CloudDnsWriterModule.java`
#### Snippet
```java
    // via the Quotas page on the Cloud Console.
    int cloudDnsMaxQps = 50;
    return RateLimiter.create(cloudDnsMaxQps);
  }

```

### UnstableApiUsage
'create(double)' is declared in unstable class 'com.google.common.util.concurrent.RateLimiter' marked with @Beta
in `core/src/main/java/google/registry/dns/writer/clouddns/CloudDnsWriterModule.java`
#### Snippet
```java
    // via the Quotas page on the Cloud Console.
    int cloudDnsMaxQps = 50;
    return RateLimiter.create(cloudDnsMaxQps);
  }

```

### UnstableApiUsage
'acquire()' is declared in unstable class 'com.google.common.util.concurrent.RateLimiter' marked with @Beta
in `core/src/main/java/google/registry/dns/DnsQueue.java`
#### Snippet
```java
  public List<TaskHandle> leaseTasks(Duration leaseDuration) {
    try {
      rateLimiter.acquire();
      int numTasks = queue.fetchStatistics().getNumTasks();
      logger.at((numTasks >= leaseTasksBatchSize) ? Level.WARNING : Level.INFO).log(
```

### UnstableApiUsage
'com.google.common.util.concurrent.RateLimiter' is marked unstable with @Beta
in `core/src/main/java/google/registry/dns/DnsQueue.java`
#### Snippet
```java
  // "If you generate more than 10 LeaseTasks requests per second, only the first 10 requests will
  // return results. The others will return no results."
  private static final RateLimiter rateLimiter = RateLimiter.create(9);

  @Inject
```

### UnstableApiUsage
'com.google.common.util.concurrent.RateLimiter' is marked unstable with @Beta
in `core/src/main/java/google/registry/dns/DnsQueue.java`
#### Snippet
```java
  // "If you generate more than 10 LeaseTasks requests per second, only the first 10 requests will
  // return results. The others will return no results."
  private static final RateLimiter rateLimiter = RateLimiter.create(9);

  @Inject
```

### UnstableApiUsage
'create(double)' is declared in unstable class 'com.google.common.util.concurrent.RateLimiter' marked with @Beta
in `core/src/main/java/google/registry/dns/DnsQueue.java`
#### Snippet
```java
  // "If you generate more than 10 LeaseTasks requests per second, only the first 10 requests will
  // return results. The others will return no results."
  private static final RateLimiter rateLimiter = RateLimiter.create(9);

  @Inject
```

### UnstableApiUsage
'com.google.common.util.concurrent.RateLimiter' is marked unstable with @Beta
in `core/src/main/java/google/registry/dns/DnsQueue.java`
#### Snippet
```java
 * Methods for manipulating the queue used for DNS write tasks.
 *
 * <p>This includes a {@link RateLimiter} to limit the {@link Queue#leaseTasks} call rate to 9 QPS,
 * to stay under the 10 QPS limit for this function.
 *
```

### UnstableApiUsage
'readFully(java.io.InputStream, byte\[\], int, int)' is marked unstable with @Beta
in `core/src/main/java/google/registry/rde/RydeTar.java`
#### Snippet
```java
    try {
      byte[] header = new byte[PosixTarHeader.HEADER_LENGTH];
      ByteStreams.readFully(input, header, 0, header.length);
      PosixTarHeader tarHeader = PosixTarHeader.from(header);
      checkState(
```

### UnstableApiUsage
'limit(java.io.InputStream, long)' is marked unstable with @Beta
in `core/src/main/java/google/registry/rde/RydeTar.java`
#### Snippet
```java
          tarHeader.getType() == PosixTarHeader.Type.REGULAR,
          "Only support TAR archives with a single regular file");
      return new TarInputStream(tarHeader, ByteStreams.limit(input, tarHeader.getSize()));
    } catch (IOException e) {
      throw new RuntimeException(e);
```

### UnstableApiUsage
'com.google.common.io.Closer' is marked unstable with @Beta
in `core/src/main/java/google/registry/rde/Ghostryde.java`
#### Snippet
```java

    // We use a Closer to handle the stream .close, to make sure it's done correctly.
    Closer closer = Closer.create();
    OutputStream encryptionLayer =
        closer.register(
```

### UnstableApiUsage
'com.google.common.io.Closer' is marked unstable with @Beta
in `core/src/main/java/google/registry/rde/Ghostryde.java`
#### Snippet
```java

    // We use a Closer to handle the stream .close, to make sure it's done correctly.
    Closer closer = Closer.create();
    OutputStream encryptionLayer =
        closer.register(
```

### UnstableApiUsage
'create()' is declared in unstable class 'com.google.common.io.Closer' marked with @Beta
in `core/src/main/java/google/registry/rde/Ghostryde.java`
#### Snippet
```java

    // We use a Closer to handle the stream .close, to make sure it's done correctly.
    Closer closer = Closer.create();
    OutputStream encryptionLayer =
        closer.register(
```

### UnstableApiUsage
'register(C)' is declared in unstable class 'com.google.common.io.Closer' marked with @Beta
in `core/src/main/java/google/registry/rde/Ghostryde.java`
#### Snippet
```java
    Closer closer = Closer.create();
    OutputStream encryptionLayer =
        closer.register(
            openEncryptor(output, GHOSTRYDE_USE_INTEGRITY_PACKET, ImmutableList.of(encryptionKey)));
    OutputStream kompressor = closer.register(openCompressor(encryptionLayer));
```

### UnstableApiUsage
'register(C)' is declared in unstable class 'com.google.common.io.Closer' marked with @Beta
in `core/src/main/java/google/registry/rde/Ghostryde.java`
#### Snippet
```java
        closer.register(
            openEncryptor(output, GHOSTRYDE_USE_INTEGRITY_PACKET, ImmutableList.of(encryptionKey)));
    OutputStream kompressor = closer.register(openCompressor(encryptionLayer));
    OutputStream fileLayer =
        closer.register(openPgpFileWriter(kompressor, INNER_FILENAME, INNER_MODIFICATION_TIME));
```

### UnstableApiUsage
'register(C)' is declared in unstable class 'com.google.common.io.Closer' marked with @Beta
in `core/src/main/java/google/registry/rde/Ghostryde.java`
#### Snippet
```java
    OutputStream kompressor = closer.register(openCompressor(encryptionLayer));
    OutputStream fileLayer =
        closer.register(openPgpFileWriter(kompressor, INNER_FILENAME, INNER_MODIFICATION_TIME));

    return new ImprovedOutputStream("GhostrydeEncoder", fileLayer) {
```

### UnstableApiUsage
'close()' is declared in unstable class 'com.google.common.io.Closer' marked with @Beta
in `core/src/main/java/google/registry/rde/Ghostryde.java`
#### Snippet
```java
      public void onClose() throws IOException {
        // Close all the streams we opened
        closer.close();
        // Optionally also output the size of the encoded data - which is needed for the RyDE
        // encoding.
```

### UnstableApiUsage
'close()' is declared in unstable class 'com.google.common.io.Closer' marked with @Beta
in `core/src/main/java/google/registry/rde/Ghostryde.java`
#### Snippet
```java
      public void onClose() throws IOException {
        // Close all the streams we opened
        closer.close();
      }
    };
```

### UnstableApiUsage
'com.google.common.io.Closer' is marked unstable with @Beta
in `core/src/main/java/google/registry/rde/Ghostryde.java`
#### Snippet
```java

    // We use a Closer to handle the stream .close, to make sure it's done correctly.
    Closer closer = Closer.create();
    InputStream decryptionLayer =
        closer.register(openDecryptor(input, GHOSTRYDE_USE_INTEGRITY_PACKET, decryptionKey));
```

### UnstableApiUsage
'com.google.common.io.Closer' is marked unstable with @Beta
in `core/src/main/java/google/registry/rde/Ghostryde.java`
#### Snippet
```java

    // We use a Closer to handle the stream .close, to make sure it's done correctly.
    Closer closer = Closer.create();
    InputStream decryptionLayer =
        closer.register(openDecryptor(input, GHOSTRYDE_USE_INTEGRITY_PACKET, decryptionKey));
```

### UnstableApiUsage
'create()' is declared in unstable class 'com.google.common.io.Closer' marked with @Beta
in `core/src/main/java/google/registry/rde/Ghostryde.java`
#### Snippet
```java

    // We use a Closer to handle the stream .close, to make sure it's done correctly.
    Closer closer = Closer.create();
    InputStream decryptionLayer =
        closer.register(openDecryptor(input, GHOSTRYDE_USE_INTEGRITY_PACKET, decryptionKey));
```

### UnstableApiUsage
'register(C)' is declared in unstable class 'com.google.common.io.Closer' marked with @Beta
in `core/src/main/java/google/registry/rde/Ghostryde.java`
#### Snippet
```java
    Closer closer = Closer.create();
    InputStream decryptionLayer =
        closer.register(openDecryptor(input, GHOSTRYDE_USE_INTEGRITY_PACKET, decryptionKey));
    InputStream decompressor = closer.register(openDecompressor(decryptionLayer));
    InputStream fileLayer = closer.register(openPgpFileReader(decompressor));
```

### UnstableApiUsage
'register(C)' is declared in unstable class 'com.google.common.io.Closer' marked with @Beta
in `core/src/main/java/google/registry/rde/Ghostryde.java`
#### Snippet
```java
    InputStream decryptionLayer =
        closer.register(openDecryptor(input, GHOSTRYDE_USE_INTEGRITY_PACKET, decryptionKey));
    InputStream decompressor = closer.register(openDecompressor(decryptionLayer));
    InputStream fileLayer = closer.register(openPgpFileReader(decompressor));

```

### UnstableApiUsage
'register(C)' is declared in unstable class 'com.google.common.io.Closer' marked with @Beta
in `core/src/main/java/google/registry/rde/Ghostryde.java`
#### Snippet
```java
        closer.register(openDecryptor(input, GHOSTRYDE_USE_INTEGRITY_PACKET, decryptionKey));
    InputStream decompressor = closer.register(openDecompressor(decryptionLayer));
    InputStream fileLayer = closer.register(openPgpFileReader(decompressor));

    return new ImprovedInputStream("GhostryderDecoder", fileLayer) {
```

### UnstableApiUsage
'com.google.common.util.concurrent.RateLimiter' is marked unstable with @Beta
in `core/src/main/java/google/registry/dns/writer/clouddns/CloudDnsWriter.java`
#### Snippet
```java
      @Config("dnsDefaultNsTtl") Duration defaultNsTtl,
      @Config("dnsDefaultDsTtl") Duration defaultDsTtl,
      @Named("cloudDns") RateLimiter rateLimiter,
      @Named("cloudDnsNumThreads") int numThreads,
      Clock clock,
```

### UnstableApiUsage
'copyOf(java.lang.Iterable\>)' is marked unstable with @Beta
in `core/src/main/java/google/registry/dns/writer/clouddns/CloudDnsWriter.java`
#### Snippet
```java
    // As per Concurrent.transform() - if numThreads or domainNames.size() < 2, it will not use
    // threading.
    return ImmutableMap.copyOf(
        Concurrent.transform(
            domainNames,
```

### UnstableApiUsage
'acquire()' is declared in unstable class 'com.google.common.util.concurrent.RateLimiter' marked with @Beta
in `core/src/main/java/google/registry/dns/writer/clouddns/CloudDnsWriter.java`
#### Snippet
```java
            .setDeletions(ImmutableList.copyOf(Sets.difference(deletions, intersection)));

    rateLimiter.acquire();
    try {
      dnsConnection.changes().create(projectId, zoneName, change).execute();
```

### UnstableApiUsage
'acquire()' is declared in unstable class 'com.google.common.util.concurrent.RateLimiter' marked with @Beta
in `core/src/main/java/google/registry/dns/writer/clouddns/CloudDnsWriter.java`
#### Snippet
```java
          dnsConnection.resourceRecordSets().list(projectId, zoneName).setName(domainName);

      rateLimiter.acquire();
      return listRecordsRequest.execute().getRrsets();
    } catch (IOException e) {
```

### UnstableApiUsage
'com.google.common.util.concurrent.RateLimiter' is marked unstable with @Beta
in `core/src/main/java/google/registry/dns/writer/clouddns/CloudDnsWriter.java`
#### Snippet
```java

  private final Clock clock;
  private final RateLimiter rateLimiter;
  private final int numThreads;
  // TODO(shikhman): This uses @Named("transientFailureRetries") which may not be tuned for this
```

### UnstableApiUsage
'copyOf(java.lang.Iterable\>)' is marked unstable with @Beta
in `core/src/main/java/google/registry/dns/ReadDnsQueueAction.java`
#### Snippet
```java
    for (TaskHandle task : tasks) {
      try {
        Map<String, String> params = ImmutableMap.copyOf(task.extractParams());
        DateTime creationTime = DateTime.parse(params.get(DNS_TARGET_CREATE_TIME_PARAM));
        String tld = params.get(PARAM_TLD);
```

### UnstableApiUsage
'com.google.common.io.Closer' is marked unstable with @Beta
in `core/src/main/java/google/registry/rde/RydeEncoder.java`
#### Snippet
```java
  private final RydePgpSigningOutputStream signer;
  // We use a Closer to handle the stream .close, to make sure it's done correctly.
  private final Closer closer = Closer.create();
  private boolean isClosed = false;

```

### UnstableApiUsage
'com.google.common.io.Closer' is marked unstable with @Beta
in `core/src/main/java/google/registry/rde/RydeEncoder.java`
#### Snippet
```java
  private final RydePgpSigningOutputStream signer;
  // We use a Closer to handle the stream .close, to make sure it's done correctly.
  private final Closer closer = Closer.create();
  private boolean isClosed = false;

```

### UnstableApiUsage
'create()' is declared in unstable class 'com.google.common.io.Closer' marked with @Beta
in `core/src/main/java/google/registry/rde/RydeEncoder.java`
#### Snippet
```java
  private final RydePgpSigningOutputStream signer;
  // We use a Closer to handle the stream .close, to make sure it's done correctly.
  private final Closer closer = Closer.create();
  private boolean isClosed = false;

```

### UnstableApiUsage
'close()' is declared in unstable class 'com.google.common.io.Closer' marked with @Beta
in `core/src/main/java/google/registry/rde/RydeEncoder.java`
#### Snippet
```java
    }
    // Close all the streams we opened
    closer.close();
    isClosed = true;
    try {
```

### UnstableApiUsage
'register(C)' is declared in unstable class 'com.google.common.io.Closer' marked with @Beta
in `core/src/main/java/google/registry/rde/RydeEncoder.java`
#### Snippet
```java
    super(null);
    this.sigOutput = sigOutput;
    signer = closer.register(new RydePgpSigningOutputStream(checkNotNull(rydeOutput), signingKey));
    OutputStream encryptLayer =
        closer.register(openEncryptor(signer, RYDE_USE_INTEGRITY_PACKET, receiverKeys));
```

### UnstableApiUsage
'register(C)' is declared in unstable class 'com.google.common.io.Closer' marked with @Beta
in `core/src/main/java/google/registry/rde/RydeEncoder.java`
#### Snippet
```java
    signer = closer.register(new RydePgpSigningOutputStream(checkNotNull(rydeOutput), signingKey));
    OutputStream encryptLayer =
        closer.register(openEncryptor(signer, RYDE_USE_INTEGRITY_PACKET, receiverKeys));
    OutputStream kompressor = closer.register(openCompressor(encryptLayer));
    OutputStream fileLayer =
```

### UnstableApiUsage
'register(C)' is declared in unstable class 'com.google.common.io.Closer' marked with @Beta
in `core/src/main/java/google/registry/rde/RydeEncoder.java`
#### Snippet
```java
    OutputStream encryptLayer =
        closer.register(openEncryptor(signer, RYDE_USE_INTEGRITY_PACKET, receiverKeys));
    OutputStream kompressor = closer.register(openCompressor(encryptLayer));
    OutputStream fileLayer =
        closer.register(openPgpFileWriter(kompressor, filenamePrefix + ".tar", modified));
```

### UnstableApiUsage
'register(C)' is declared in unstable class 'com.google.common.io.Closer' marked with @Beta
in `core/src/main/java/google/registry/rde/RydeEncoder.java`
#### Snippet
```java
    OutputStream kompressor = closer.register(openCompressor(encryptLayer));
    OutputStream fileLayer =
        closer.register(openPgpFileWriter(kompressor, filenamePrefix + ".tar", modified));
    this.out =
        closer.register(openTarWriter(fileLayer, dataLength, filenamePrefix + ".xml", modified));
```

### UnstableApiUsage
'register(C)' is declared in unstable class 'com.google.common.io.Closer' marked with @Beta
in `core/src/main/java/google/registry/rde/RydeEncoder.java`
#### Snippet
```java
        closer.register(openPgpFileWriter(kompressor, filenamePrefix + ".tar", modified));
    this.out =
        closer.register(openTarWriter(fileLayer, dataLength, filenamePrefix + ".xml", modified));
  }

```

### UnstableApiUsage
'com.google.common.io.Closer' is marked unstable with @Beta
in `core/src/main/java/google/registry/xml/XmlTransformer.java`
#### Snippet
```java
  /** Creates a single {@link Schema} from multiple {@code .xsd} files. */
  public static Schema loadXmlSchemas(List<String> schemaFilenames) {
    try (Closer closer = Closer.create()) {
      StreamSource[] sources = new StreamSource[schemaFilenames.size()];
      for (int i = 0; i < schemaFilenames.size(); ++i) {
```

### UnstableApiUsage
'com.google.common.io.Closer' is marked unstable with @Beta
in `core/src/main/java/google/registry/xml/XmlTransformer.java`
#### Snippet
```java
  /** Creates a single {@link Schema} from multiple {@code .xsd} files. */
  public static Schema loadXmlSchemas(List<String> schemaFilenames) {
    try (Closer closer = Closer.create()) {
      StreamSource[] sources = new StreamSource[schemaFilenames.size()];
      for (int i = 0; i < schemaFilenames.size(); ++i) {
```

### UnstableApiUsage
'create()' is declared in unstable class 'com.google.common.io.Closer' marked with @Beta
in `core/src/main/java/google/registry/xml/XmlTransformer.java`
#### Snippet
```java
  /** Creates a single {@link Schema} from multiple {@code .xsd} files. */
  public static Schema loadXmlSchemas(List<String> schemaFilenames) {
    try (Closer closer = Closer.create()) {
      StreamSource[] sources = new StreamSource[schemaFilenames.size()];
      for (int i = 0; i < schemaFilenames.size(); ++i) {
```

### UnstableApiUsage
'register(C)' is declared in unstable class 'com.google.common.io.Closer' marked with @Beta
in `core/src/main/java/google/registry/xml/XmlTransformer.java`
#### Snippet
```java
      StreamSource[] sources = new StreamSource[schemaFilenames.size()];
      for (int i = 0; i < schemaFilenames.size(); ++i) {
        sources[i] = new StreamSource(closer.register(
            Resources.asByteSource(Resources.getResource(
                XmlTransformer.class, "xsd/" + schemaFilenames.get(i))).openStream()));
```

### UnstableApiUsage
'tryParse(java.lang.String)' is marked unstable with @Beta
in `core/src/main/java/google/registry/rdap/RdapEntityAction.java`
#### Snippet
```java
    // RDAP Technical Implementation Guide 2.4.1 - MUST support registrar entity lookup using the
    // IANA ID as handle
    Long ianaIdentifier = Longs.tryParse(pathSearchString);
    if (ianaIdentifier != null) {
      Optional<Registrar> registrar = getRegistrarByIanaIdentifier(ianaIdentifier);
```

### UnstableApiUsage
'countTrue(boolean...)' is marked unstable with @Beta
in `core/src/main/java/google/registry/rdap/RdapDomainSearchAction.java`
#### Snippet
```java
  public DomainSearchResponse getSearchResponse(boolean isHeadRequest) {
    // RDAP syntax example: /rdap/domains?name=exam*.com.
    if (Booleans.countTrue(nameParam.isPresent(), nsLdhNameParam.isPresent(), nsIpParam.isPresent())
        != 1) {
      throw new BadRequestException(
```

### UnstableApiUsage
'countTrue(boolean...)' is marked unstable with @Beta
in `core/src/main/java/google/registry/rdap/RdapNameserverSearchAction.java`
#### Snippet
```java
  public NameserverSearchResponse getSearchResponse(boolean isHeadRequest) {
    // RDAP syntax example: /rdap/nameservers?name=ns*.example.com.
    if (Booleans.countTrue(nameParam.isPresent(), ipParam.isPresent()) != 1) {
      throw new BadRequestException("You must specify either name=XXXX or ip=YYYY");
    }
```

### UnstableApiUsage
'countTrue(boolean...)' is marked unstable with @Beta
in `core/src/main/java/google/registry/rdap/RdapEntitySearchAction.java`
#### Snippet
```java
  public EntitySearchResponse getSearchResponse(boolean isHeadRequest) {
    // RDAP syntax example: /rdap/entities?fn=Bobby%20Joe*.
    if (Booleans.countTrue(fnParam.isPresent(), handleParam.isPresent()) != 1) {
      throw new BadRequestException("You must specify either fn=XXXX or handle=YYYY");
    }
```

### UnstableApiUsage
'tryParse(java.lang.String)' is marked unstable with @Beta
in `core/src/main/java/google/registry/rdap/RdapEntitySearchAction.java`
#### Snippet
```java
  /** Looks up registrars by handle (i.e. IANA identifier). */
  private ImmutableList<Registrar> getMatchingRegistrars(final String ianaIdentifierString) {
    Long ianaIdentifier = Longs.tryParse(ianaIdentifierString);
    if (ianaIdentifier == null) {
      return ImmutableList.of();
```

### UnstableApiUsage
'mightContain(T)' is declared in unstable class 'com.google.common.hash.BloomFilter' marked with @Beta
in `core/src/main/java/google/registry/model/tld/label/PremiumListDao.java`
#### Snippet
```java
    PremiumList loadedList = maybeLoadedList.get();
    // Consult the bloom filter and immediately return if the label definitely isn't premium.
    if (!loadedList.getBloomFilter().mightContain(label)) {
      return Optional.empty();
    }
```

### UnstableApiUsage
'com.google.common.hash.BloomFilter' is marked unstable with @Beta
in `core/src/main/java/google/registry/model/tld/label/PremiumList.java`
#### Snippet
```java
   * and no DB load is required.
   */
  public BloomFilter<String> getBloomFilter() {
    return bloomFilter;
  }
```

### UnstableApiUsage
'com.google.common.hash.BloomFilter' is marked unstable with @Beta
in `core/src/main/java/google/registry/model/tld/label/PremiumList.java`
#### Snippet
```java

  @Column(nullable = false)
  BloomFilter<String> bloomFilter;

  /** Returns the {@link CurrencyUnit} used for this list. */
```

### UnstableApiUsage
'com.google.common.hash.BloomFilter' is marked unstable with @Beta
in `core/src/main/java/google/registry/model/tld/label/PremiumList.java`
#### Snippet
```java
        // punycoded.
        getInstance().bloomFilter =
            BloomFilter.create(stringFunnel(US_ASCII), getInstance().labelsToPrices.size());
        getInstance()
            .labelsToPrices
```

### UnstableApiUsage
'create(com.google.common.hash.Funnel, int)' is declared in unstable class 'com.google.common.hash.BloomFilter' marked with @Beta
in `core/src/main/java/google/registry/model/tld/label/PremiumList.java`
#### Snippet
```java
        // punycoded.
        getInstance().bloomFilter =
            BloomFilter.create(stringFunnel(US_ASCII), getInstance().labelsToPrices.size());
        getInstance()
            .labelsToPrices
```

### UnstableApiUsage
'stringFunnel(java.nio.charset.Charset)' is declared in unstable class 'com.google.common.hash.Funnels' marked with @Beta
in `core/src/main/java/google/registry/model/tld/label/PremiumList.java`
#### Snippet
```java
        // punycoded.
        getInstance().bloomFilter =
            BloomFilter.create(stringFunnel(US_ASCII), getInstance().labelsToPrices.size());
        getInstance()
            .labelsToPrices
```

### UnstableApiUsage
'put(T)' is declared in unstable class 'com.google.common.hash.BloomFilter' marked with @Beta
in `core/src/main/java/google/registry/model/tld/label/PremiumList.java`
#### Snippet
```java
            .labelsToPrices
            .keySet()
            .forEach(label -> getInstance().bloomFilter.put(label));
      }
      return super.build();
```

### UnstableApiUsage
'readLines(java.lang.Readable)' is marked unstable with @Beta
in `core/src/main/java/google/registry/tools/CanonicalizeLabelsCommand.java`
#### Snippet
```java
    for (String label :
        mainParameters.isEmpty()
            ? CharStreams.readLines(new InputStreamReader(stdin, UTF_8))
            : Files.readLines(new File(mainParameters.get(0)), UTF_8)) {
      label = label.trim();
```

### UnstableApiUsage
'com.google.common.io.MoreFiles' is marked unstable with @Beta
in `core/src/main/java/google/registry/tools/SetupOteCommand.java`
#### Snippet
```java
            .setReplaceExisting(overwrite);

      String asciiCert = MoreFiles.asCharSource(certFile, US_ASCII).read();
      // Don't wait for create_registrar to fail if it's a bad certificate file.
      loadCertificate(asciiCert);
```

### UnstableApiUsage
'asCharSource(java.nio.file.Path, java.nio.charset.Charset, java.nio.file.OpenOption...)' is declared in unstable class 'com.google.common.io.MoreFiles' marked with @Beta
in `core/src/main/java/google/registry/tools/SetupOteCommand.java`
#### Snippet
```java
            .setReplaceExisting(overwrite);

      String asciiCert = MoreFiles.asCharSource(certFile, US_ASCII).read();
      // Don't wait for create_registrar to fail if it's a bad certificate file.
      loadCertificate(asciiCert);
```

### UnstableApiUsage
'tryParse(java.lang.String)' is marked unstable with @Beta
in `core/src/main/java/google/registry/tools/params/DateTimeParameter.java`
#### Snippet
```java
  @Override
  public DateTime convert(String value) {
    Long millis = Longs.tryParse(value);
    if (millis != null) {
      return new DateTime(millis.longValue(), UTC);
```

### UnstableApiUsage
'withKeyValueSeparator(char)' is marked unstable with @Beta
in `core/src/main/java/google/registry/tools/params/KeyValueMapParameter.java`
#### Snippet
```java
    if (!Strings.isNullOrEmpty(keyValueMapString)) {
      for (Map.Entry<String, String> entry :
          Splitter.on(',').withKeyValueSeparator('=').split(keyValueMapString).entrySet()) {
        builder.put(parseKey(entry.getKey()), parseValue(entry.getValue()));
      }
```

### UnstableApiUsage
'split(java.lang.CharSequence)' is declared in unstable class 'com.google.common.base.Splitter.MapSplitter' marked with @Beta
in `core/src/main/java/google/registry/tools/params/KeyValueMapParameter.java`
#### Snippet
```java
    if (!Strings.isNullOrEmpty(keyValueMapString)) {
      for (Map.Entry<String, String> entry :
          Splitter.on(',').withKeyValueSeparator('=').split(keyValueMapString).entrySet()) {
        builder.put(parseKey(entry.getKey()), parseValue(entry.getValue()));
      }
```

### UnstableApiUsage
'splitToStream(java.lang.CharSequence)' is marked unstable with @Beta
in `core/src/main/java/google/registry/tools/GenerateAllocationTokensCommand.java`
#### Snippet
```java
              .omitEmptyStrings()
              .trimResults()
              .splitToStream(Files.asCharSource(new File(domainNamesFile), UTF_8).read())
              .map(DomainNameUtils::canonicalizeHostname)
              .collect(Collectors.toCollection(ArrayDeque::new));
```

### UnstableApiUsage
'callWithTimeout(java.util.concurrent.Callable, long, java.util.concurrent.TimeUnit)' is declared in unstable interface 'com.google.common.util.concurrent.TimeLimiter' marked with @Beta
in `core/src/main/java/google/registry/request/lock/LockHandlerImpl.java`
#### Snippet
```java
    try {
      return AppEngineTimeLimiter.create()
          .callWithTimeout(
              new LockingCallable(callable, lockAcquirer, sanitizedTld, leaseLength, lockNames),
              leaseLength.minus(LOCK_TIMEOUT_FUDGE).getMillis(),
```

### UnstableApiUsage
'splitToStream(java.lang.CharSequence)' is marked unstable with @Beta
in `core/src/main/java/google/registry/reporting/spec11/Spec11RegistrarThreatMatchesParser.java`
#### Snippet
```java
      return Splitter.on("\n")
          .omitEmptyStrings()
          .splitToStream(CharStreams.toString(isr))
          .skip(1)
          .map(this::parseRegistrarThreatMatch)
```

### UnstableApiUsage
'transform(com.google.common.util.concurrent.ListenableFuture*, com.google.common.base.Function, java.util.concurrent.Executor)' is marked unstable with @Beta*
in `core/src/main/java/google/registry/bigquery/BigqueryConnection.java`
#### Snippet
```java
                .setQuery(querySql)
                .setDefaultDataset(getDataset())));
    return transform(runJobToCompletion(job), this::getQueryResults, directExecutor());
  }

```

### UnstableApiUsage
'transform(com.google.common.util.concurrent.ListenableFuture*, com.google.common.base.Function, java.util.concurrent.Executor)' is marked unstable with @Beta*
in `core/src/main/java/google/registry/bigquery/BigqueryConnection.java`
#### Snippet
```java
      // Use Futures.transform() rather than calling apply() directly so that any exceptions thrown
      // by calling updateTable will be propagated on the get() call, not from here.
      return transform(
          Futures.immediateFuture(dest.withQuery(querySql)), this::updateTable, directExecutor());
    } else {
```

### UnstableApiUsage
'transform(com.google.common.util.concurrent.ListenableFuture*, com.google.common.base.Function, java.util.concurrent.Executor)' is marked unstable with @Beta*
in `core/src/main/java/google/registry/bigquery/BigqueryConnection.java`
#### Snippet
```java
                  .setWriteDisposition(dest.getWriteDisposition().toString())
                  .setDestinationTable(dest.getTableReference())));
      return transform(runJobToCompletion(job, dest), this::updateTable, directExecutor());
    }
  }
```

### UnstableApiUsage
'transformAsync(com.google.common.util.concurrent.ListenableFuture*, com.google.common.util.concurrent.AsyncFunction, java.util.concurrent.Executor)' is marked unstable with @Beta*
in `core/src/main/java/google/registry/bigquery/BigqueryConnection.java`
#### Snippet
```java
    // Tracking bug for query-to-GCS support is b/13777340.
    DestinationTable tempTable = buildTemporaryTable().build();
    return transformAsync(
        startQuery(querySql, tempTable),
        tempTable1 -> extractTable(tempTable1, destinationUri, destinationFormat, printHeader),
```

### UnstableApiUsage
'transform(com.google.common.util.concurrent.ListenableFuture*, com.google.common.base.Function, java.util.concurrent.Executor)' is marked unstable with @Beta*
in `core/src/main/java/google/registry/bigquery/BigqueryConnection.java`
#### Snippet
```java
                .setSourceUris(ImmutableList.copyOf(sourceUris))
                .setDestinationTable(dest.getTableReference())));
    return transform(runJobToCompletion(job, dest), this::updateTable, directExecutor());
  }

```

### UnstableApiUsage
'com.google.common.collect.ImmutableRangeSet' is marked unstable with @Beta
in `core/src/main/java/google/registry/tldconfig/idn/JapaneseLanguageValidator.java`
#### Snippet
```java
   * IDEOGRAPHIC_CLOSING_MARK unless other Japanese non-exception codepoints are also present.
   */
  private static final ImmutableRangeSet<Integer> JAPANESE_EXCEPTION_CODEPOINTS =
      new ImmutableRangeSet.Builder<Integer>()
      .add(Range.singleton(IDEOGRAPHIC_CLOSING_MARK))
```

### UnstableApiUsage
'com.google.common.collect.ImmutableRangeSet' is marked unstable with @Beta
in `core/src/main/java/google/registry/tldconfig/idn/JapaneseLanguageValidator.java`
#### Snippet
```java
   */
  private static final ImmutableRangeSet<Integer> JAPANESE_EXCEPTION_CODEPOINTS =
      new ImmutableRangeSet.Builder<Integer>()
      .add(Range.singleton(IDEOGRAPHIC_CLOSING_MARK))
      .add(Range.singleton(KATAKANA_MIDDLE_DOT))
```

### UnstableApiUsage
'Builder()' is declared in unstable class 'com.google.common.collect.ImmutableRangeSet' marked with @Beta
in `core/src/main/java/google/registry/tldconfig/idn/JapaneseLanguageValidator.java`
#### Snippet
```java
   */
  private static final ImmutableRangeSet<Integer> JAPANESE_EXCEPTION_CODEPOINTS =
      new ImmutableRangeSet.Builder<Integer>()
      .add(Range.singleton(IDEOGRAPHIC_CLOSING_MARK))
      .add(Range.singleton(KATAKANA_MIDDLE_DOT))
```

### UnstableApiUsage
'com.google.common.collect.ImmutableRangeSet.Builder' is declared in unstable class 'com.google.common.collect.ImmutableRangeSet' marked with @Beta
in `core/src/main/java/google/registry/tldconfig/idn/JapaneseLanguageValidator.java`
#### Snippet
```java
   */
  private static final ImmutableRangeSet<Integer> JAPANESE_EXCEPTION_CODEPOINTS =
      new ImmutableRangeSet.Builder<Integer>()
      .add(Range.singleton(IDEOGRAPHIC_CLOSING_MARK))
      .add(Range.singleton(KATAKANA_MIDDLE_DOT))
```

### UnstableApiUsage
'add(com.google.common.collect.Range)' is declared in unstable class 'com.google.common.collect.ImmutableRangeSet' marked with @Beta
in `core/src/main/java/google/registry/tldconfig/idn/JapaneseLanguageValidator.java`
#### Snippet
```java
  private static final ImmutableRangeSet<Integer> JAPANESE_EXCEPTION_CODEPOINTS =
      new ImmutableRangeSet.Builder<Integer>()
      .add(Range.singleton(IDEOGRAPHIC_CLOSING_MARK))
      .add(Range.singleton(KATAKANA_MIDDLE_DOT))
      .add(Range.singleton(KATAKANA_HIRAGANA_PROLONGED_SOUND_MARK))
```

### UnstableApiUsage
'add(com.google.common.collect.Range)' is declared in unstable class 'com.google.common.collect.ImmutableRangeSet' marked with @Beta
in `core/src/main/java/google/registry/tldconfig/idn/JapaneseLanguageValidator.java`
#### Snippet
```java
      new ImmutableRangeSet.Builder<Integer>()
      .add(Range.singleton(IDEOGRAPHIC_CLOSING_MARK))
      .add(Range.singleton(KATAKANA_MIDDLE_DOT))
      .add(Range.singleton(KATAKANA_HIRAGANA_PROLONGED_SOUND_MARK))
      .build();
```

### UnstableApiUsage
'add(com.google.common.collect.Range)' is declared in unstable class 'com.google.common.collect.ImmutableRangeSet' marked with @Beta
in `core/src/main/java/google/registry/tldconfig/idn/JapaneseLanguageValidator.java`
#### Snippet
```java
      .add(Range.singleton(IDEOGRAPHIC_CLOSING_MARK))
      .add(Range.singleton(KATAKANA_MIDDLE_DOT))
      .add(Range.singleton(KATAKANA_HIRAGANA_PROLONGED_SOUND_MARK))
      .build();

```

### UnstableApiUsage
'build()' is declared in unstable class 'com.google.common.collect.ImmutableRangeSet' marked with @Beta
in `core/src/main/java/google/registry/tldconfig/idn/JapaneseLanguageValidator.java`
#### Snippet
```java
      .add(Range.singleton(KATAKANA_MIDDLE_DOT))
      .add(Range.singleton(KATAKANA_HIRAGANA_PROLONGED_SOUND_MARK))
      .build();

  @Override
```

### UnstableApiUsage
'com.google.common.collect.ImmutableRangeSet' is marked unstable with @Beta
in `core/src/main/java/google/registry/tldconfig/idn/IdnTable.java`
#### Snippet
```java
  private final URI policy;

  /** {@link ImmutableRangeSet} containing the valid codepoints in this table. */
  private final ImmutableRangeSet<Integer> validCodepoints;

```

### UnstableApiUsage
'com.google.common.collect.ImmutableRangeSet' is marked unstable with @Beta
in `core/src/main/java/google/registry/tldconfig/idn/IdnTable.java`
#### Snippet
```java

  /** {@link ImmutableRangeSet} containing the valid codepoints in this table. */
  private final ImmutableRangeSet<Integer> validCodepoints;

  /** Validates the language rules associated with this IDN table. */
```

### UnstableApiUsage
'com.google.common.collect.ImmutableRangeSet' is marked unstable with @Beta
in `core/src/main/java/google/registry/tldconfig/idn/IdnTable.java`
#### Snippet
```java
      URI url,
      URI policy,
      ImmutableRangeSet<Integer> validCodepoints,
      Optional<LanguageValidator> languageValidator) {
    this.name = name;
```

### UnstableApiUsage
'com.google.common.collect.ImmutableRangeSet' is marked unstable with @Beta
in `core/src/main/java/google/registry/tldconfig/idn/IdnTable.java`
#### Snippet
```java
  static IdnTable createFrom(
      String language, Iterable<String> data, Optional<LanguageValidator> languageValidator) {
    ImmutableRangeSet.Builder<Integer> rangeSet = new ImmutableRangeSet.Builder<>();
    URI url = null;
    URI policy = null;
```

### UnstableApiUsage
'com.google.common.collect.ImmutableRangeSet.Builder' is declared in unstable class 'com.google.common.collect.ImmutableRangeSet' marked with @Beta
in `core/src/main/java/google/registry/tldconfig/idn/IdnTable.java`
#### Snippet
```java
  static IdnTable createFrom(
      String language, Iterable<String> data, Optional<LanguageValidator> languageValidator) {
    ImmutableRangeSet.Builder<Integer> rangeSet = new ImmutableRangeSet.Builder<>();
    URI url = null;
    URI policy = null;
```

### UnstableApiUsage
'com.google.common.collect.ImmutableRangeSet' is marked unstable with @Beta
in `core/src/main/java/google/registry/tldconfig/idn/IdnTable.java`
#### Snippet
```java
  static IdnTable createFrom(
      String language, Iterable<String> data, Optional<LanguageValidator> languageValidator) {
    ImmutableRangeSet.Builder<Integer> rangeSet = new ImmutableRangeSet.Builder<>();
    URI url = null;
    URI policy = null;
```

### UnstableApiUsage
'Builder()' is declared in unstable class 'com.google.common.collect.ImmutableRangeSet' marked with @Beta
in `core/src/main/java/google/registry/tldconfig/idn/IdnTable.java`
#### Snippet
```java
  static IdnTable createFrom(
      String language, Iterable<String> data, Optional<LanguageValidator> languageValidator) {
    ImmutableRangeSet.Builder<Integer> rangeSet = new ImmutableRangeSet.Builder<>();
    URI url = null;
    URI policy = null;
```

### UnstableApiUsage
'com.google.common.collect.ImmutableRangeSet.Builder' is declared in unstable class 'com.google.common.collect.ImmutableRangeSet' marked with @Beta
in `core/src/main/java/google/registry/tldconfig/idn/IdnTable.java`
#### Snippet
```java
  static IdnTable createFrom(
      String language, Iterable<String> data, Optional<LanguageValidator> languageValidator) {
    ImmutableRangeSet.Builder<Integer> rangeSet = new ImmutableRangeSet.Builder<>();
    URI url = null;
    URI policy = null;
```

### UnstableApiUsage
'add(com.google.common.collect.Range)' is declared in unstable class 'com.google.common.collect.ImmutableRangeSet' marked with @Beta
in `core/src/main/java/google/registry/tldconfig/idn/IdnTable.java`
#### Snippet
```java

      int codepoint = readCodepoint(line);
      rangeSet.add(Range.singleton(codepoint));
    }
    return new IdnTable(language, url, policy, rangeSet.build(), languageValidator);
```

### UnstableApiUsage
'build()' is declared in unstable class 'com.google.common.collect.ImmutableRangeSet' marked with @Beta
in `core/src/main/java/google/registry/tldconfig/idn/IdnTable.java`
#### Snippet
```java
      rangeSet.add(Range.singleton(codepoint));
    }
    return new IdnTable(language, url, policy, rangeSet.build(), languageValidator);
  }

```

### UnstableApiUsage
'withKeyValueSeparator(java.lang.String)' is marked unstable with @Beta
in `core/src/main/java/google/registry/persistence/VKey.java`
#### Snippet
```java
    ImmutableMap<String, String> kvs =
        ImmutableMap.copyOf(
            Splitter.on(DELIMITER).withKeyValueSeparator(KV_SEPARATOR).split(keyString));
    String classString = kvs.get(CLASS_TYPE);
    if (classString == null) {
```

### UnstableApiUsage
'split(java.lang.CharSequence)' is declared in unstable class 'com.google.common.base.Splitter.MapSplitter' marked with @Beta
in `core/src/main/java/google/registry/persistence/VKey.java`
#### Snippet
```java
    ImmutableMap<String, String> kvs =
        ImmutableMap.copyOf(
            Splitter.on(DELIMITER).withKeyValueSeparator(KV_SEPARATOR).split(keyString));
    String classString = kvs.get(CLASS_TYPE);
    if (classString == null) {
```

### UnstableApiUsage
'com.google.common.hash.BloomFilter' is marked unstable with @Beta
in `core/src/main/java/google/registry/persistence/converter/BloomFilterConverter.java`
#### Snippet
```java
  @Override
  @Nullable
  public BloomFilter<String> convertToEntityAttribute(@Nullable byte[] columnValue) {
    if (columnValue == null) {
      return null;
```

### UnstableApiUsage
'com.google.common.hash.BloomFilter' is marked unstable with @Beta
in `core/src/main/java/google/registry/persistence/converter/BloomFilterConverter.java`
#### Snippet
```java
    }
    try {
      return BloomFilter.readFrom(new ByteArrayInputStream(columnValue), stringFunnel(US_ASCII));
    } catch (IOException e) {
      throw new UncheckedIOException("Error loading Bloom filter data", e);
```

### UnstableApiUsage
'readFrom(java.io.InputStream, com.google.common.hash.Funnel)' is declared in unstable class 'com.google.common.hash.BloomFilter' marked with @Beta
in `core/src/main/java/google/registry/persistence/converter/BloomFilterConverter.java`
#### Snippet
```java
    }
    try {
      return BloomFilter.readFrom(new ByteArrayInputStream(columnValue), stringFunnel(US_ASCII));
    } catch (IOException e) {
      throw new UncheckedIOException("Error loading Bloom filter data", e);
```

### UnstableApiUsage
'stringFunnel(java.nio.charset.Charset)' is declared in unstable class 'com.google.common.hash.Funnels' marked with @Beta
in `core/src/main/java/google/registry/persistence/converter/BloomFilterConverter.java`
#### Snippet
```java
    }
    try {
      return BloomFilter.readFrom(new ByteArrayInputStream(columnValue), stringFunnel(US_ASCII));
    } catch (IOException e) {
      throw new UncheckedIOException("Error loading Bloom filter data", e);
```

### UnstableApiUsage
'com.google.common.hash.BloomFilter' is marked unstable with @Beta
in `core/src/main/java/google/registry/persistence/converter/BloomFilterConverter.java`
#### Snippet
```java
  @Override
  @Nullable
  public byte[] convertToDatabaseColumn(@Nullable BloomFilter<String> entity) {
    if (entity == null) {
      return null;
```

### UnstableApiUsage
'writeTo(java.io.OutputStream)' is declared in unstable class 'com.google.common.hash.BloomFilter' marked with @Beta
in `core/src/main/java/google/registry/persistence/converter/BloomFilterConverter.java`
#### Snippet
```java
    ByteArrayOutputStream bos = new ByteArrayOutputStream();
    try {
      entity.writeTo(bos);
    } catch (IOException e) {
      throw new UncheckedIOException("Error saving Bloom filter data", e);
```

### UnstableApiUsage
'com.google.common.hash.BloomFilter' is marked unstable with @Beta
in `core/src/main/java/google/registry/persistence/converter/BloomFilterConverter.java`
#### Snippet
```java
import javax.persistence.Converter;

/** JPA converter for ASCII String {@link BloomFilter}s. */
@Converter(autoApply = true)
public class BloomFilterConverter implements AttributeConverter<BloomFilter<String>, byte[]> {
```

### UnstableApiUsage
'com.google.common.hash.BloomFilter' is marked unstable with @Beta
in `core/src/main/java/google/registry/persistence/converter/BloomFilterConverter.java`
#### Snippet
```java
/** JPA converter for ASCII String {@link BloomFilter}s. */
@Converter(autoApply = true)
public class BloomFilterConverter implements AttributeConverter<BloomFilter<String>, byte[]> {

  @Override
```

### UnstableApiUsage
'com.google.common.io.CountingInputStream' is marked unstable with @Beta
in `util/src/main/java/google/registry/util/ImprovedInputStream.java`
#### Snippet
```java
 *
 * @see ImprovedOutputStream
 * @see com.google.common.io.CountingInputStream
 */
@NotThreadSafe
```

### UnstableApiUsage
'com.google.common.util.concurrent.TimeLimiter' is marked unstable with @Beta
in `util/src/main/java/google/registry/util/AppEngineTimeLimiter.java`
#### Snippet
```java
  }

  public static TimeLimiter create() {
    return SimpleTimeLimiter.create(new NewRequestThreadExecutorService());
  }
```

### UnstableApiUsage
'com.google.common.util.concurrent.SimpleTimeLimiter' is marked unstable with @Beta
in `util/src/main/java/google/registry/util/AppEngineTimeLimiter.java`
#### Snippet
```java

  public static TimeLimiter create() {
    return SimpleTimeLimiter.create(new NewRequestThreadExecutorService());
  }
}
```

### UnstableApiUsage
'create(java.util.concurrent.ExecutorService)' is declared in unstable class 'com.google.common.util.concurrent.SimpleTimeLimiter' marked with @Beta
in `util/src/main/java/google/registry/util/AppEngineTimeLimiter.java`
#### Snippet
```java

  public static TimeLimiter create() {
    return SimpleTimeLimiter.create(new NewRequestThreadExecutorService());
  }
}
```

### UnstableApiUsage
'com.google.common.util.concurrent.TimeLimiter' is marked unstable with @Beta
in `util/src/main/java/google/registry/util/AppEngineTimeLimiter.java`
#### Snippet
```java

/**
 * A factory for {@link TimeLimiter} instances that use request threads, which carry the namespace
 * and live only as long as the request that spawned them.
 *
```

### UnstableApiUsage
'com.google.common.util.concurrent.SimpleTimeLimiter' is marked unstable with @Beta
in `util/src/main/java/google/registry/util/UrlChecker.java`
#### Snippet
```java
  public static void waitUntilAvailable(final URL url, int timeoutMs) {
    try {
      Void unusedReturnValue = SimpleTimeLimiter.create(newCachedThreadPool())
          .callWithTimeout(
              () -> {
```

### UnstableApiUsage
'create(java.util.concurrent.ExecutorService)' is declared in unstable class 'com.google.common.util.concurrent.SimpleTimeLimiter' marked with @Beta
in `util/src/main/java/google/registry/util/UrlChecker.java`
#### Snippet
```java
  public static void waitUntilAvailable(final URL url, int timeoutMs) {
    try {
      Void unusedReturnValue = SimpleTimeLimiter.create(newCachedThreadPool())
          .callWithTimeout(
              () -> {
```

### UnstableApiUsage
'callWithTimeout(java.util.concurrent.Callable, long, java.util.concurrent.TimeUnit)' is declared in unstable class 'com.google.common.util.concurrent.SimpleTimeLimiter' marked with @Beta
in `util/src/main/java/google/registry/util/UrlChecker.java`
#### Snippet
```java
    try {
      Void unusedReturnValue = SimpleTimeLimiter.create(newCachedThreadPool())
          .callWithTimeout(
              () -> {
                int exponentialBackoffMs = 1;
```

### UnstableApiUsage
'copyOf(java.lang.Iterable\>)' is marked unstable with @Beta
in `util/src/main/java/google/registry/util/CollectionUtils.java`
#### Snippet
```java
    ImmutableList.Builder<ImmutableMap<K, V>> shards = new ImmutableList.Builder<>();
    for (Iterable<Map.Entry<K, V>> entriesShard : partition(map.entrySet(), size)) {
      shards.add(ImmutableMap.copyOf(entriesShard));
    }
    return shards.build();
```

### UnstableApiUsage
'difference(com.google.common.collect.Multiset, com.google.common.collect.Multiset)' is marked unstable with @Beta
in `util/src/main/java/google/registry/util/CollectionUtils.java`
#### Snippet
```java
  /** Returns any duplicates in an iterable. */
  public static <T> Set<T> findDuplicates(Iterable<T> iterable) {
    return Multisets.difference(
        HashMultiset.create(iterable),
        HashMultiset.create(ImmutableSet.copyOf(iterable))).elementSet();
```

