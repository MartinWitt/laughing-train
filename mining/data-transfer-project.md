# data-transfer-project 
 
# Bad smells
I found 694 bad smells with 36 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| RuleId[ruleID=BoundedWildcard] | 117 | false |
| RuleId[ruleID=OptionalUsedAsFieldOrParameterType] | 72 | false |
| RuleId[ruleID=ReturnNull] | 67 | false |
| RuleId[ruleID=UNUSED_IMPORT] | 43 | false |
| RuleId[ruleID=RedundantFieldInitialization] | 27 | false |
| RuleId[ruleID=DataFlowIssue] | 26 | false |
| RuleId[ruleID=UnstableApiUsage] | 24 | false |
| RuleId[ruleID=OptionalIsPresent] | 22 | false |
| RuleId[ruleID=OptionalContainsCollection] | 21 | false |
| RuleId[ruleID=SizeReplaceableByIsEmpty] | 17 | true |
| RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized] | 14 | false |
| RuleId[ruleID=UnusedAssignment] | 13 | false |
| RuleId[ruleID=SystemOutErr] | 13 | false |
| RuleId[ruleID=AbstractClassNeverImplemented] | 12 | false |
| RuleId[ruleID=ThrowablePrintStackTrace] | 11 | false |
| RuleId[ruleID=ZeroLengthArrayInitialization] | 10 | false |
| RuleId[ruleID=UtilityClassWithoutPrivateConstructor] | 10 | false |
| RuleId[ruleID=UnnecessaryFullyQualifiedName] | 9 | false |
| RuleId[ruleID=AssignmentToMethodParameter] | 8 | false |
| RuleId[ruleID=UnnecessaryLocalVariable] | 8 | true |
| RuleId[ruleID=SimplifyOptionalCallChains] | 7 | false |
| RuleId[ruleID=SimplifyStreamApiCallChains] | 7 | false |
| RuleId[ruleID=NonSerializableFieldInSerializableClass] | 6 | false |
| RuleId[ruleID=RedundantSuppression] | 6 | false |
| RuleId[ruleID=ObsoleteCollection] | 5 | false |
| RuleId[ruleID=FinalStaticMethod] | 5 | false |
| RuleId[ruleID=NullableProblems] | 5 | false |
| RuleId[ruleID=NestedAssignment] | 5 | false |
| RuleId[ruleID=FuseStreamOperations] | 5 | false |
| RuleId[ruleID=ConstantValue] | 5 | false |
| RuleId[ruleID=IOResource] | 5 | false |
| RuleId[ruleID=Convert2MethodRef] | 5 | false |
| RuleId[ruleID=DefaultAnnotationParam] | 4 | false |
| RuleId[ruleID=RedundantStringFormatCall] | 4 | false |
| RuleId[ruleID=RedundantLengthCheck] | 4 | false |
| RuleId[ruleID=UnnecessarySemicolon] | 4 | false |
| RuleId[ruleID=UnnecessaryToStringCall] | 4 | true |
| RuleId[ruleID=EnumSwitchStatementWhichMissesCases] | 2 | false |
| RuleId[ruleID=CommentedOutCode] | 2 | false |
| RuleId[ruleID=KeySetIterationMayUseEntrySet] | 2 | false |
| RuleId[ruleID=FinalPrivateMethod] | 2 | false |
| RuleId[ruleID=UnnecessaryReturn] | 2 | true |
| RuleId[ruleID=TrivialStringConcatenation] | 2 | false |
| RuleId[ruleID=MissortedModifiers] | 2 | false |
| RuleId[ruleID=DuplicateCondition] | 2 | false |
| RuleId[ruleID=IfStatementWithIdenticalBranches] | 2 | false |
| RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment] | 2 | false |
| RuleId[ruleID=EmptyMethod] | 2 | false |
| RuleId[ruleID=RedundantImplements] | 2 | false |
| RuleId[ruleID=DuplicateThrows] | 2 | false |
| RuleId[ruleID=StringConcatenationInsideStringBufferAppend] | 2 | false |
| RuleId[ruleID=StringOperationCanBeSimplified] | 2 | false |
| RuleId[ruleID=DeprecatedIsStillUsed] | 2 | false |
| RuleId[ruleID=RedundantCollectionOperation] | 2 | false |
| RuleId[ruleID=InnerClassMayBeStatic] | 2 | true |
| RuleId[ruleID=ImplicitArrayToString] | 2 | false |
| RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern] | 2 | false |
| RuleId[ruleID=SamePackageImport] | 2 | false |
| RuleId[ruleID=NonProtectedConstructorInAbstractClass] | 2 | true |
| RuleId[ruleID=ToArrayCallWithZeroLengthArrayArgument] | 1 | true |
| RuleId[ruleID=WrapperTypeMayBePrimitive] | 1 | false |
| RuleId[ruleID=IgnoreResultOfCall] | 1 | false |
| RuleId[ruleID=RedundantMethodOverride] | 1 | false |
| RuleId[ruleID=MalformedFormatString] | 1 | false |
| RuleId[ruleID=JavaLangImport] | 1 | false |
| RuleId[ruleID=ExceptionNameDoesntEndWithException] | 1 | false |
| RuleId[ruleID=InstanceofCatchParameter] | 1 | false |
| RuleId[ruleID=NonFinalFieldOfException] | 1 | false |
| RuleId[ruleID=UnstableTypeUsedInSignature] | 1 | false |
| RuleId[ruleID=OptionalGetWithoutIsPresent] | 1 | false |
| RuleId[ruleID=Java8MapForEach] | 1 | false |
| RuleId[ruleID=NonSynchronizedMethodOverridesSynchronizedMethod] | 1 | false |
| RuleId[ruleID=WrongPackageStatement] | 1 | false |
| RuleId[ruleID=StringEqualsEmptyString] | 1 | false |
| RuleId[ruleID=CharsetObjectCanBeUsed] | 1 | false |
| RuleId[ruleID=CaughtExceptionImmediatelyRethrown] | 1 | false |
| RuleId[ruleID=UnnecessaryContinue] | 1 | false |
| RuleId[ruleID=BusyWait] | 1 | false |
| RuleId[ruleID=CastCanBeRemovedNarrowingVariableType] | 1 | false |
## RuleId[ruleID=ToArrayCallWithZeroLengthArrayArgument]
### RuleId[ruleID=ToArrayCallWithZeroLengthArrayArgument]
Call to `toArray()` with pre-sized array argument 'new Entity\[entities.size()\]'
in `extensions/cloud/portability-cloud-google/src/main/java/org/datatransferproject/cloud/google/GoogleJobStore.java`
#### Snippet
```java
              .build());
    }
    datastore.add(entities.toArray(new Entity[entities.size()]));
  }

```

## RuleId[ruleID=EnumSwitchStatementWhichMissesCases]
### RuleId[ruleID=EnumSwitchStatementWhichMissesCases]
`switch (jobType) { case MEDIA: importer = getMediaImporter(extension); break; ...` statement on enum type 'org.datatransferproject.types.common.models.DataVertical' misses cases: 'BLOBS', 'CALENDAR', 'CONTACTS', 'MAIL', ...
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/provider/TransferCompatibilityProvider.java`
#### Snippet
```java
    }

    switch (jobType) {
      case MEDIA:
        importer = getMediaImporter(extension);
        break;
      case PHOTOS:
        importer = getPhotosImporter(extension);
        break;
      case VIDEOS:
        importer = getVideosImporter(extension);
        break;
    }
    if (importer == null) {
      return extension.getImporter(jobType);
```

### RuleId[ruleID=EnumSwitchStatementWhichMissesCases]
`switch (jobType) { case MEDIA: exporter = getMediaExporter(extension); break; ...` statement on enum type 'org.datatransferproject.types.common.models.DataVertical' misses cases: 'BLOBS', 'CALENDAR', 'CONTACTS', 'MAIL', ...
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/provider/TransferCompatibilityProvider.java`
#### Snippet
```java
    }

    switch (jobType) {
      case MEDIA:
        exporter = getMediaExporter(extension);
        break;
      case PHOTOS:
        exporter = getPhotosExporter(extension);
        break;
      case VIDEOS:
        exporter = getVideosExporter(extension);
        break;
    }
    if (exporter == null) {
      return extension.getExporter(jobType); // preserve original exception
```

## RuleId[ruleID=WrapperTypeMayBePrimitive]
### RuleId[ruleID=WrapperTypeMayBePrimitive]
Type may be primitive
in `extensions/cloud/portability-cloud-google/src/main/java/org/datatransferproject/cloud/google/GoogleJobStore.java`
#### Snippet
```java
      Key key = getCountsKey(jobId, dataType);
      Entity current = datastore.get(key);
      Integer oldCount = 0;

      if (current != null && current.getNames().contains(COUNTS_FIELD)) {
```

## RuleId[ruleID=CommentedOutCode]
### RuleId[ruleID=CommentedOutCode]
Commented out code (7 lines)
in `extensions/data-transfer/portability-data-transfer-solid/src/main/java/org/datatransferproject/transfer/solid/SolidUtilities.java`
#### Snippet
```java
    self.listProperties(model.createProperty("http://www.w3.org/ns/ldp#contains"))
        .forEachRemaining(s-> results.add(s.getResource()));
    /*List<Statement> containedStatements = getProperties(
        self,
        "http://www.w3.org/ns/ldp#contains");
```

### RuleId[ruleID=CommentedOutCode]
Commented out code (4 lines)
in `extensions/data-transfer/portability-data-transfer-solid/src/main/java/org/datatransferproject/transfer/solid/contacts/SolidContactsImport.java`
#### Snippet
```java
    }

    // people.stream()
    //     .collect(Collectors.toMap(
    //         p -> importPerson(idempotentExecutor, p, baseUrl, personDirectory, utilities),
```

## RuleId[ruleID=ObsoleteCollection]
### RuleId[ruleID=ObsoleteCollection]
Obsolete collection type `Stack` used
in `extensions/copier/portability-stack-copier/src/main/java/org/datatransferproject/copier/stack/PortabilityStackInMemoryDataCopier.java`
#### Snippet
```java
  private static final AtomicInteger COPY_ITERATION_COUNTER = new AtomicInteger();

  private Stack<ExportInformation> exportInfoStack = new Stack<>();

  @Inject
```

### RuleId[ruleID=ObsoleteCollection]
Obsolete collection type `Stack<>` used
in `extensions/copier/portability-stack-copier/src/main/java/org/datatransferproject/copier/stack/PortabilityStackInMemoryDataCopier.java`
#### Snippet
```java
  private static final AtomicInteger COPY_ITERATION_COUNTER = new AtomicInteger();

  private Stack<ExportInformation> exportInfoStack = new Stack<>();

  @Inject
```

### RuleId[ruleID=ObsoleteCollection]
Obsolete collection type `Stack` used
in `portability-spi-cloud/src/main/java/org/datatransferproject/spi/cloud/storage/JobStore.java`
#### Snippet
```java
   * transfer.
   */
  default void storeJobStack(UUID jobId, Stack<ExportInformation> stack) {}

  /**
```

### RuleId[ruleID=ObsoleteCollection]
Obsolete collection type `Hashtable` used
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/i18n/AbstractMultilingualDictionary.java`
#### Snippet
```java

public class AbstractMultilingualDictionary {
  private Hashtable<MultilingualString, String> dict = new Hashtable<>();
  private String bundle;

```

### RuleId[ruleID=ObsoleteCollection]
Obsolete collection type `Hashtable<>` used
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/i18n/AbstractMultilingualDictionary.java`
#### Snippet
```java

public class AbstractMultilingualDictionary {
  private Hashtable<MultilingualString, String> dict = new Hashtable<>();
  private String bundle;

```

## RuleId[ruleID=KeySetIterationMayUseEntrySet]
### RuleId[ruleID=KeySetIterationMayUseEntrySet]
Iteration over `newCounts.keySet()` may be replaced with 'entrySet()' iteration
in `extensions/cloud/portability-cloud-google/src/main/java/org/datatransferproject/cloud/google/GoogleJobStore.java`
#### Snippet
```java
    Transaction transaction = datastore.newTransaction();

    for (String dataType : newCounts.keySet()) {
      Key key = getCountsKey(jobId, dataType);
      Entity current = datastore.get(key);
```

### RuleId[ruleID=KeySetIterationMayUseEntrySet]
Iteration over `importedPeople.keySet()` may be replaced with 'entrySet()' iteration
in `extensions/data-transfer/portability-data-transfer-solid/src/main/java/org/datatransferproject/transfer/solid/contacts/SolidContactsImport.java`
#### Snippet
```java
    Resource indexResource = peopleModel.createResource("index.ttl#this");

    for (String insertedId : importedPeople.keySet()) {

      VCard insertedPerson = importedPeople.get(insertedId);
```

## RuleId[ruleID=FinalPrivateMethod]
### RuleId[ruleID=FinalPrivateMethod]
'private' method declared `final`
in `libraries/security/src/main/java/org/datatransferproject/security/EncrypterImpl.java`
#### Snippet
```java
  }

  private static final IvParameterSpec generateIv(Cipher cipher) throws NoSuchAlgorithmException {
    SecureRandom randomSecureRandom = SecureRandom.getInstance("SHA1PRNG");
    byte[] iv = new byte[cipher.getBlockSize()];
```

### RuleId[ruleID=FinalPrivateMethod]
'private' method declared `final`
in `libraries/security/src/main/java/org/datatransferproject/security/DecrypterImpl.java`
#### Snippet
```java
  }

  private static final IvParameterSpec generateIv(Cipher cipher) throws NoSuchAlgorithmException {
    SecureRandom randomSecureRandom = SecureRandom.getInstance("SHA1PRNG");
    byte[] iv = new byte[cipher.getBlockSize()];
```

## RuleId[ruleID=SizeReplaceableByIsEmpty]
### RuleId[ruleID=SizeReplaceableByIsEmpty]
`items.size() != 0` can be replaced with '!items.isEmpty()'
in `extensions/data-transfer/portability-data-transfer-imgur/src/main/java/org/datatransferproject/datatransfer/imgur/photos/ImgurPhotosExporter.java`
#### Snippet
```java
    List<Map<String, Object>> items = requestData(authData, url);

    boolean hasMore = (items != null && items.size() != 0);

    for (Map<String, Object> item : items) {
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`photos.size() > 0` can be replaced with '!photos.isEmpty()'
in `extensions/data-transfer/portability-data-transfer-imgur/src/main/java/org/datatransferproject/datatransfer/imgur/photos/ImgurPhotosExporter.java`
#### Snippet
```java
    }

    if (!containsNonAlbumPhotos && photos.size() > 0) {
      // Add album for non-album photos
      albums.add(new PhotoAlbum(DEFAULT_ALBUM_ID, "Non-album photos", "Contains non-album photos"));
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`items.size() != 0` can be replaced with '!items.isEmpty()'
in `extensions/data-transfer/portability-data-transfer-imgur/src/main/java/org/datatransferproject/datatransfer/imgur/photos/ImgurPhotosExporter.java`
#### Snippet
```java

    // Request result doesn't indicate if it's the last page
    boolean hasMore = (items != null && items.size() != 0);

    for (Map<String, Object> item : items) {
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`photos.size() > 0` can be replaced with '!photos.isEmpty()'
in `extensions/data-transfer/portability-data-transfer-imgur/src/main/java/org/datatransferproject/datatransfer/imgur/photos/ImgurPhotosExporter.java`
#### Snippet
```java
    ExportResult.ResultType resultType = ExportResult.ResultType.END;

    if (photos.size() > 0) {
      monitor.info(() -> format("added albumPhotos, size: %s", photos.size()));
    }
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`description.length() > 0` can be replaced with '!description.isEmpty()'
in `extensions/data-transfer/portability-data-transfer-koofr/src/main/java/org/datatransferproject/transfer/koofr/videos/KoofrVideosImporter.java`
#### Snippet
```java
    String description = KoofrClient.trimDescription(album.getDescription());

    if (description != null && description.length() > 0) {
      koofrClient.addDescription(fullPath, description);
    }
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`description.length() > 0` can be replaced with '!description.isEmpty()'
in `extensions/data-transfer/portability-data-transfer-koofr/src/main/java/org/datatransferproject/transfer/koofr/common/KoofrClient.java`
#### Snippet
```java
              .setParameter("autorename", "true")
              .setParameter("info", "true");
      if (description != null && description.length() > 0) {
        builder.setParameter("tags", "description=" + description);
      }
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`description.length() > 0` can be replaced with '!description.isEmpty()'
in `extensions/data-transfer/portability-data-transfer-koofr/src/main/java/org/datatransferproject/transfer/koofr/photos/KoofrPhotosImporter.java`
#### Snippet
```java
    String description = KoofrClient.trimDescription(album.getDescription());

    if (description != null && description.length() > 0) {
      koofrClient.addDescription(fullPath, description);
    }
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`photos.size() > 0` can be replaced with '!photos.isEmpty()'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/photos/GooglePhotosImporter.java`
#### Snippet
```java
    long bytes = 0L;
    // Uploads photos
    if (photos != null && photos.size() > 0) {
      Map<String, List<PhotoModel>> photosByAlbum =
          photos.stream()
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`primaryNames.size() > 0` can be replaced with '!primaryNames.isEmpty()'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/contacts/GoogleContactsImporter.java`
#### Snippet
```java
    List<StructuredName> primaryNames =
        vCardNameList.stream().filter(a -> a.getAltId() == null).collect(Collectors.toList());
    if (primaryNames.size() > 0) {
      primaryVCardName = primaryNames.get(0);
    } else {
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`videos.size() > 0` can be replaced with '!videos.isEmpty()'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/videos/GoogleVideosImporter.java`
#### Snippet
```java
    //     Uploads videos
    final Collection<VideoModel> videos = data.getVideos();
    if (videos != null && videos.size() > 0) {
      Stream<VideoModel> stream =
          videos.stream()
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`data.getVideos().size() > 0` can be replaced with '!data.getVideos().isEmpty()'
in `extensions/data-transfer/portability-data-transfer-backblaze/src/main/java/org/datatransferproject/datatransfer/backblaze/videos/BackblazeVideosImporter.java`
#### Snippet
```java
    BackblazeDataTransferClient b2Client = b2ClientFactory.getOrCreateB2Client(jobId, authData);

    if (data.getVideos() != null && data.getVideos().size() > 0) {
      for (VideoModel video : data.getVideos()) {
        idempotentExecutor.importAndSwallowIOExceptions(
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`data.getAlbums().size() > 0` can be replaced with '!data.getAlbums().isEmpty()'
in `extensions/data-transfer/portability-data-transfer-backblaze/src/main/java/org/datatransferproject/datatransfer/backblaze/photos/BackblazePhotosImporter.java`
#### Snippet
```java
    BackblazeDataTransferClient b2Client = b2ClientFactory.getOrCreateB2Client(jobId, authData);

    if (data.getAlbums() != null && data.getAlbums().size() > 0) {
      for (PhotoAlbum album : data.getAlbums()) {
        idempotentExecutor.executeAndSwallowIOExceptions(
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`data.getPhotos().size() > 0` can be replaced with '!data.getPhotos().isEmpty()'
in `extensions/data-transfer/portability-data-transfer-backblaze/src/main/java/org/datatransferproject/datatransfer/backblaze/photos/BackblazePhotosImporter.java`
#### Snippet
```java
    }

    if (data.getPhotos() != null && data.getPhotos().size() > 0) {
      for (PhotoModel photo : data.getPhotos()) {
        idempotentExecutor.importAndSwallowIOExceptions(
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`parameters.get().size() > 0` can be replaced with '!parameters.get().isEmpty()'
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/media/MicrosoftMediaInterface.java`
#### Snippet
```java
      String url, Optional<Map<String, String>> parameters, Class<T> tClass) throws IOException {
    HttpRequestFactory requestFactory = httpTransport.createRequestFactory();
    if (parameters.isPresent() && parameters.get().size() > 0) {
      url = url + generateODataParams(parameters.get());
    }
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`chunksToSend.size() != 0` can be replaced with '!chunksToSend.isEmpty()'
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/media/MicrosoftMediaImporter.java`
#### Snippet
```java
    final int totalFileSize = chunksToSend.stream().map(DataChunk::getSize).reduce(0, Integer::sum);
    Preconditions.checkState(
        chunksToSend.size() != 0, "Data was split into zero chunks %s.", item.getName());

    Response chunkResponse = null;
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`chunksToSend.size() != 0` can be replaced with '!chunksToSend.isEmpty()'
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/photos/MicrosoftPhotosImporter.java`
#### Snippet
```java
    final int totalFileSize = chunksToSend.stream().map(DataChunk::getSize).reduce(0, Integer::sum);
    Preconditions.checkState(
        chunksToSend.size() != 0, "Data was split into zero chunks %s.", photo.getTitle());

    Response chunkResponse = null;
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`parameters.get().size() > 0` can be replaced with '!parameters.get().isEmpty()'
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/photos/MicrosoftPhotosInterface.java`
#### Snippet
```java
      String url, Optional<Map<String, String>> parameters, Class<T> tClass) throws IOException {
    HttpRequestFactory requestFactory = httpTransport.createRequestFactory();
    if (parameters.isPresent() && parameters.get().size() > 0) {
      url = url + generateODataParams(parameters.get());
    }
```

## RuleId[ruleID=UnnecessaryReturn]
### RuleId[ruleID=UnnecessaryReturn]
`return` is unnecessary as the last statement in a 'void' method
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/music/GoogleMusicImporter.java`
#### Snippet
```java
    }

    return;
  }

```

### RuleId[ruleID=UnnecessaryReturn]
`return` is unnecessary as the last statement in a 'void' method
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/music/GoogleMusicImporter.java`
#### Snippet
```java
    }

    return;
  }

```

## RuleId[ruleID=TrivialStringConcatenation]
### RuleId[ruleID=TrivialStringConcatenation]
Empty string used in concatenation
in `extensions/data-transfer/portability-data-transfer-twitter/src/main/java/org/datatransferproject/transfer/twitter/TwitterPhotosExporter.java`
#### Snippet
```java
    Paging paging = new Paging(pageNumber, PAGE_SIZE);
    try {
      String page = "" + pageNumber;
      long id = twitterApi.getId();
      monitor.debug(() -> format("Getting tweets for %s (page %s)", id, page));
```

### RuleId[ruleID=TrivialStringConcatenation]
Empty string used in concatenation
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/common/RequestHelper.java`
#### Snippet
```java
    headers.put("Content-Type", "application/json");
    request.put("headers", headers);
    request.put("id", id + "");
    request.put("method", "POST");
    request.put("url", url);
```

## RuleId[ruleID=FinalStaticMethod]
### RuleId[ruleID=FinalStaticMethod]
'static' method declared `final`
in `libraries/security/src/main/java/org/datatransferproject/security/EncrypterImpl.java`
#### Snippet
```java
  }

  private static final IvParameterSpec generateIv(Cipher cipher) throws NoSuchAlgorithmException {
    SecureRandom randomSecureRandom = SecureRandom.getInstance("SHA1PRNG");
    byte[] iv = new byte[cipher.getBlockSize()];
```

### RuleId[ruleID=FinalStaticMethod]
'static' method declared `final`
in `libraries/security/src/main/java/org/datatransferproject/security/DecrypterImpl.java`
#### Snippet
```java
  }

  private static final IvParameterSpec generateIv(Cipher cipher) throws NoSuchAlgorithmException {
    SecureRandom randomSecureRandom = SecureRandom.getInstance("SHA1PRNG");
    byte[] iv = new byte[cipher.getBlockSize()];
```

### RuleId[ruleID=FinalStaticMethod]
'static' method declared `final`
in `extensions/data-transfer/portability-data-transfer-solid/src/main/java/org/datatransferproject/transfer/solid/contacts/SolidContactsImport.java`
#### Snippet
```java

  @VisibleForTesting
  final static Model getPersonModel(VCard vcard) {
    Model personModel = ModelFactory.createDefaultModel();
    Resource r = personModel.createResource("#this");
```

### RuleId[ruleID=FinalStaticMethod]
'static' method declared `final`
in `extensions/data-transfer/portability-data-transfer-solid/src/main/java/org/datatransferproject/transfer/solid/contacts/SolidContactsExport.java`
#### Snippet
```java
  }

  final static VCard parsePerson(Resource r) {
    VCard vcard = new VCard();

```

### RuleId[ruleID=FinalStaticMethod]
'static' method declared `final`
in `portability-api/src/main/java/org/datatransferproject/api/ApiMain.java`
#### Snippet
```java

  @SuppressWarnings("unchecked")
  public static final <T> TypeLiteral<Set<T>> setOf(Class<T> type) {
    return (TypeLiteral<Set<T>>) TypeLiteral.get(Types.setOf(type));
  }
```

## RuleId[ruleID=AbstractClassNeverImplemented]
### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `Builder` has no concrete subclass
in `portability-spi-cloud/src/main/java/org/datatransferproject/spi/cloud/types/JobAuthorization.java`
#### Snippet
```java

  @AutoValue.Builder
  public abstract static class Builder {
    @JsonCreator
    private static Builder create() {
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `JobAuthorization` has no concrete subclass
in `portability-spi-cloud/src/main/java/org/datatransferproject/spi/cloud/types/JobAuthorization.java`
#### Snippet
```java
@AutoValue
@JsonDeserialize(builder = JobAuthorization.Builder.class)
public abstract class JobAuthorization {
  public static Builder builder() {
    // TODO: Fix so we don't need fully qualified name here. This is to get IntelliJ to recognize
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `PortabilityJob` has no concrete subclass
in `portability-spi-cloud/src/main/java/org/datatransferproject/spi/cloud/types/PortabilityJob.java`
#### Snippet
```java
@AutoValue
@JsonDeserialize(builder = PortabilityJob.Builder.class)
public abstract class PortabilityJob {
  public static final String AUTHORIZATION_STATE = "AUTHORIZATION_STATE";
  // Keys for specific values in the key value store
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `Builder` has no concrete subclass
in `portability-spi-cloud/src/main/java/org/datatransferproject/spi/cloud/types/PortabilityJob.java`
#### Snippet
```java

  @AutoValue.Builder
  public abstract static class Builder {
    @JsonCreator
    private static PortabilityJob.Builder create() {
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `Builder` has no concrete subclass
in `portability-types-transfer/src/main/java/org/datatransferproject/types/transfer/errors/ErrorDetail.java`
#### Snippet
```java

  @AutoValue.Builder
  public abstract static class Builder {
    @JsonCreator
    private static ErrorDetail.Builder create() {
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `ErrorDetail` has no concrete subclass
in `portability-types-transfer/src/main/java/org/datatransferproject/types/transfer/errors/ErrorDetail.java`
#### Snippet
```java
@AutoValue
@JsonDeserialize(builder = ErrorDetail.Builder.class)
public abstract class ErrorDetail {
  private static final String DATA_KEY = "Data";

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `ExDate` has no concrete subclass
in `portability-types-common/src/main/java/org/datatransferproject/types/common/models/calendar/RecurrenceRule.java`
#### Snippet
```java

  @AutoValue
  public abstract static class ExDate {

    public static ExDate create(TimeType value, String tzidparam, List<String> exdtval) {
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `Builder` has no concrete subclass
in `portability-types-common/src/main/java/org/datatransferproject/types/common/models/calendar/RecurrenceRule.java`
#### Snippet
```java

    @AutoValue.Builder
    abstract static class Builder {

      abstract Builder value(TimeType value);
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `Builder` has no concrete subclass
in `portability-types-common/src/main/java/org/datatransferproject/types/common/models/calendar/RecurrenceRule.java`
#### Snippet
```java

    @AutoValue.Builder
    abstract static class Builder {

      public abstract Builder freq(Freq freq);
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `RDate` has no concrete subclass
in `portability-types-common/src/main/java/org/datatransferproject/types/common/models/calendar/RecurrenceRule.java`
#### Snippet
```java

  @AutoValue
  public abstract static class RDate {

    static RDate create(@Nullable TimeType value, @Nullable String tzidparam, List<String> rdtval) {
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `RRule` has no concrete subclass
in `portability-types-common/src/main/java/org/datatransferproject/types/common/models/calendar/RecurrenceRule.java`
#### Snippet
```java

  @AutoValue
  public abstract static class RRule {

    static RRule create(Freq freq, String until, int count, int interval,
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `Builder` has no concrete subclass
in `portability-types-common/src/main/java/org/datatransferproject/types/common/models/calendar/RecurrenceRule.java`
#### Snippet
```java

    @AutoValue.Builder
    public abstract static class Builder {

      public abstract Builder value(TimeType value);
```

## RuleId[ruleID=BoundedWildcard]
### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ErrorDetail`
in `extensions/cloud/portability-cloud-local/src/main/java/org/datatransferproject/cloud/local/LocalJobStore.java`
#### Snippet
```java

  @Override
  public void addErrorsToJob(UUID jobId, Collection<ErrorDetail> errors) throws IOException {
    // This is a no-op currently as nothing in DTP reads the errors currently.
    if (errors != null && !errors.isEmpty()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super GetTransferServices`
in `extensions/transport/portability-transport-jettyrest/src/main/java/org/datatransferproject/transport/jettyrest/rest/TransferServicesController.java`
#### Snippet
```java
  private Action<GetTransferServices, TransferServices> action;

  public TransferServicesController(Action<GetTransferServices, TransferServices> action) {
    this.action = action;
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends TransferServices`
in `extensions/transport/portability-transport-jettyrest/src/main/java/org/datatransferproject/transport/jettyrest/rest/TransferServicesController.java`
#### Snippet
```java
  private Action<GetTransferServices, TransferServices> action;

  public TransferServicesController(Action<GetTransferServices, TransferServices> action) {
    this.action = action;
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super GetDataTypes`
in `extensions/transport/portability-transport-jettyrest/src/main/java/org/datatransferproject/transport/jettyrest/rest/DataTypesController.java`
#### Snippet
```java
  private Action<GetDataTypes, DataTypes> action;

  public DataTypesController(Action<GetDataTypes, DataTypes> action) {
    this.action = action;
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends DataTypes`
in `extensions/transport/portability-transport-jettyrest/src/main/java/org/datatransferproject/transport/jettyrest/rest/DataTypesController.java`
#### Snippet
```java
  private Action<GetDataTypes, DataTypes> action;

  public DataTypesController(Action<GetDataTypes, DataTypes> action) {
    this.action = action;
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super CreateTransferJob`
in `extensions/transport/portability-transport-jettyrest/src/main/java/org/datatransferproject/transport/jettyrest/rest/TransferController.java`
#### Snippet
```java

    public TransferController(
            Action<CreateTransferJob, TransferJob> createJobAction,
            Action<GenerateServiceAuthData, ServiceAuthData> generateAuthDataAction,
            Action<ReserveWorker, ReservedWorker> reserveWorkerAction,
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends TransferJob`
in `extensions/transport/portability-transport-jettyrest/src/main/java/org/datatransferproject/transport/jettyrest/rest/TransferController.java`
#### Snippet
```java

    public TransferController(
            Action<CreateTransferJob, TransferJob> createJobAction,
            Action<GenerateServiceAuthData, ServiceAuthData> generateAuthDataAction,
            Action<ReserveWorker, ReservedWorker> reserveWorkerAction,
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super GenerateServiceAuthData`
in `extensions/transport/portability-transport-jettyrest/src/main/java/org/datatransferproject/transport/jettyrest/rest/TransferController.java`
#### Snippet
```java
    public TransferController(
            Action<CreateTransferJob, TransferJob> createJobAction,
            Action<GenerateServiceAuthData, ServiceAuthData> generateAuthDataAction,
            Action<ReserveWorker, ReservedWorker> reserveWorkerAction,
            Action<GetReservedWorker, ReservedWorker> getReservedWorkerAction,
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ServiceAuthData`
in `extensions/transport/portability-transport-jettyrest/src/main/java/org/datatransferproject/transport/jettyrest/rest/TransferController.java`
#### Snippet
```java
    public TransferController(
            Action<CreateTransferJob, TransferJob> createJobAction,
            Action<GenerateServiceAuthData, ServiceAuthData> generateAuthDataAction,
            Action<ReserveWorker, ReservedWorker> reserveWorkerAction,
            Action<GetReservedWorker, ReservedWorker> getReservedWorkerAction,
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super ReserveWorker`
in `extensions/transport/portability-transport-jettyrest/src/main/java/org/datatransferproject/transport/jettyrest/rest/TransferController.java`
#### Snippet
```java
            Action<CreateTransferJob, TransferJob> createJobAction,
            Action<GenerateServiceAuthData, ServiceAuthData> generateAuthDataAction,
            Action<ReserveWorker, ReservedWorker> reserveWorkerAction,
            Action<GetReservedWorker, ReservedWorker> getReservedWorkerAction,
            Action<StartTransferJob, TransferJob> startJobAction,
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ReservedWorker`
in `extensions/transport/portability-transport-jettyrest/src/main/java/org/datatransferproject/transport/jettyrest/rest/TransferController.java`
#### Snippet
```java
            Action<CreateTransferJob, TransferJob> createJobAction,
            Action<GenerateServiceAuthData, ServiceAuthData> generateAuthDataAction,
            Action<ReserveWorker, ReservedWorker> reserveWorkerAction,
            Action<GetReservedWorker, ReservedWorker> getReservedWorkerAction,
            Action<StartTransferJob, TransferJob> startJobAction,
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super GetReservedWorker`
in `extensions/transport/portability-transport-jettyrest/src/main/java/org/datatransferproject/transport/jettyrest/rest/TransferController.java`
#### Snippet
```java
            Action<GenerateServiceAuthData, ServiceAuthData> generateAuthDataAction,
            Action<ReserveWorker, ReservedWorker> reserveWorkerAction,
            Action<GetReservedWorker, ReservedWorker> getReservedWorkerAction,
            Action<StartTransferJob, TransferJob> startJobAction,
            Action<GetTransferJob, TransferJob> getJobAction) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ReservedWorker`
in `extensions/transport/portability-transport-jettyrest/src/main/java/org/datatransferproject/transport/jettyrest/rest/TransferController.java`
#### Snippet
```java
            Action<GenerateServiceAuthData, ServiceAuthData> generateAuthDataAction,
            Action<ReserveWorker, ReservedWorker> reserveWorkerAction,
            Action<GetReservedWorker, ReservedWorker> getReservedWorkerAction,
            Action<StartTransferJob, TransferJob> startJobAction,
            Action<GetTransferJob, TransferJob> getJobAction) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super StartTransferJob`
in `extensions/transport/portability-transport-jettyrest/src/main/java/org/datatransferproject/transport/jettyrest/rest/TransferController.java`
#### Snippet
```java
            Action<ReserveWorker, ReservedWorker> reserveWorkerAction,
            Action<GetReservedWorker, ReservedWorker> getReservedWorkerAction,
            Action<StartTransferJob, TransferJob> startJobAction,
            Action<GetTransferJob, TransferJob> getJobAction) {
        this.createJobAction = createJobAction;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends TransferJob`
in `extensions/transport/portability-transport-jettyrest/src/main/java/org/datatransferproject/transport/jettyrest/rest/TransferController.java`
#### Snippet
```java
            Action<ReserveWorker, ReservedWorker> reserveWorkerAction,
            Action<GetReservedWorker, ReservedWorker> getReservedWorkerAction,
            Action<StartTransferJob, TransferJob> startJobAction,
            Action<GetTransferJob, TransferJob> getJobAction) {
        this.createJobAction = createJobAction;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super GetTransferJob`
in `extensions/transport/portability-transport-jettyrest/src/main/java/org/datatransferproject/transport/jettyrest/rest/TransferController.java`
#### Snippet
```java
            Action<GetReservedWorker, ReservedWorker> getReservedWorkerAction,
            Action<StartTransferJob, TransferJob> startJobAction,
            Action<GetTransferJob, TransferJob> getJobAction) {
        this.createJobAction = createJobAction;
        this.generateAuthDataAction = generateAuthDataAction;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends TransferJob`
in `extensions/transport/portability-transport-jettyrest/src/main/java/org/datatransferproject/transport/jettyrest/rest/TransferController.java`
#### Snippet
```java
            Action<GetReservedWorker, ReservedWorker> getReservedWorkerAction,
            Action<StartTransferJob, TransferJob> startJobAction,
            Action<GetTransferJob, TransferJob> getJobAction) {
        this.createJobAction = createJobAction;
        this.generateAuthDataAction = generateAuthDataAction;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ExportInformation`
in `extensions/data-transfer/portability-data-transfer-imgur/src/main/java/org/datatransferproject/datatransfer/imgur/photos/ImgurPhotosExporter.java`
#### Snippet
```java
  @Override
  public ExportResult<PhotosContainerResource> export(
      UUID jobId, TokensAndUrlAuthData authData, Optional<ExportInformation> exportInformation)
      throws Exception {

```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ErrorDetail`
in `extensions/cloud/portability-cloud-google/src/main/java/org/datatransferproject/cloud/google/GoogleJobStore.java`
#### Snippet
```java

  @Override
  public void addErrorsToJob(UUID jobId, Collection<ErrorDetail> errors) throws IOException {
    if (errors == null || errors.isEmpty()) {
      return;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends PhotoAlbum`
in `extensions/data-transfer/portability-data-transfer-flickr/src/main/java/org/datatransferproject/datatransfer/flickr/photos/FlickrPhotosImporter.java`
#### Snippet
```java
  // Store any album data in the cache because Flickr only allows you to create an album with a
  // photo in it, so we have to wait for the first photo to create the album
  private void storeAlbums(UUID jobId, Collection<PhotoAlbum> albums) throws IOException {
    for (PhotoAlbum album : albums) {
      jobStore.create(
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Resource`
in `extensions/data-transfer/portability-data-transfer-solid/src/main/java/org/datatransferproject/transfer/solid/SolidUtilities.java`
#### Snippet
```java
   * provided {@link Consumer}
   */
  public void explore(String url, Consumer<Resource> resourceConsumer) throws IOException {
    logger.debug("Exploring: %s", url);
    Model model = getModel(url);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Resource`
in `extensions/data-transfer/portability-data-transfer-solid/src/main/java/org/datatransferproject/transfer/solid/contacts/SolidContactsImport.java`
#### Snippet
```java
  private static ImmutableList<Resource> getPhoneOrMailTypes(
      String type,
      Map<String, Resource> map) {
    return ImmutableList.copyOf(
        Arrays.stream(type.split(",")).map(t -> {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends VCard`
in `extensions/data-transfer/portability-data-transfer-solid/src/main/java/org/datatransferproject/transfer/solid/contacts/SolidContactsImport.java`
#### Snippet
```java
      IdempotentImportExecutor idempotentExecutor,
      String baseUrl,
      List<VCard> people,
      SolidUtilities utilities)
      throws Exception {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends VCard`
in `extensions/data-transfer/portability-data-transfer-solid/src/main/java/org/datatransferproject/transfer/solid/contacts/SolidContactsImport.java`
#### Snippet
```java
      String baseUrl,
      String containerUrl,
      Map<String, VCard> importedPeople,
      SolidUtilities utilities) throws Exception {
    Model peopleModel = ModelFactory.createDefaultModel();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ExportInformation`
in `extensions/data-transfer/portability-data-transfer-flickr/src/main/java/org/datatransferproject/datatransfer/flickr/photos/FlickrPhotosExporter.java`
#### Snippet
```java
  @Override
  public ExportResult<PhotosContainerResource> export(
      UUID jobId, AuthData authData, Optional<ExportInformation> exportInformation) {
    Auth auth;
    try {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ExportInformation`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/mail/GoogleMailExporter.java`
#### Snippet
```java
  @Override
  public ExportResult<MailContainerResource> export(UUID id,
      TokensAndUrlAuthData authData, Optional<ExportInformation> exportInformation) {
    // Create a new gmail service for the authorized user
    Gmail gmail = getOrCreateGmail(authData);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Map`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/mail/GoogleMailImporter.java`
#### Snippet
```java
      TokensAndUrlAuthData authData,
      IdempotentImportExecutor idempotentExecutor,
      Supplier<Map<String, String>> allDestinationLabels) throws Exception {
    idempotentExecutor.executeAndSwallowIOExceptions(
        LABEL,
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Map`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/mail/GoogleMailImporter.java`
#### Snippet
```java
      TokensAndUrlAuthData authData,
      IdempotentImportExecutor idempotentExecutor,
      Supplier<Map<String, String>> allDestinationLabels,
      Collection<MailMessageModel> messages) throws Exception {
    for (MailMessageModel mailMessageModel : messages) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Map`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/mail/GoogleMailImporter.java`
#### Snippet
```java
      TokensAndUrlAuthData authData,
      IdempotentImportExecutor idempotentExecutor,
      Supplier<Map<String, String>> allDestinationLabels,
      Collection<MailContainerModel> folders) throws Exception {
    for (MailContainerModel mailContainerModel : folders) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ExportInformation`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/gplus/GooglePlusExporter.java`
#### Snippet
```java
  @Override
  public ExportResult<SocialActivityContainerResource> export(
      UUID jobId, TokensAndUrlAuthData authData, Optional<ExportInformation> exportInformation) throws IOException {
    Plus plus = getOrCreatePeopleService(authData);

```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ExportInformation`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/drive/DriveExporter.java`
#### Snippet
```java
      UUID jobId,
      TokensAndUrlAuthData authData,
      Optional<ExportInformation> optionalExportInformation)
      throws Exception {
    Drive driveInterface = getDriveInterface((authData));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ExportInformation`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/tasks/GoogleTasksExporter.java`
#### Snippet
```java
  @Override
  public ExportResult<TaskContainerResource> export(
          UUID jobId, TokensAndUrlAuthData authData, Optional<ExportInformation> exportInformation) {
    // Create a new tasks service for the authorized user
    Tasks tasksService = getOrCreateTasksService(authData);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends MusicPlaylistItem`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/music/GoogleMusicImporter.java`
#### Snippet
```java

  void importPlaylistItems(
      List<MusicPlaylistItem> playlistItems,
      IdempotentImportExecutor executor,
      UUID jobId,
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super UUID`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/music/GoogleMusicImporter.java`
#### Snippet
```java
      JsonFactory jsonFactory,
      GoogleMusicHttpApi musicHttpApi,
      Map<UUID, GoogleMusicHttpApi> musicHttpApisMap,
      TemporaryPerJobDataStore dataStore,
      Monitor monitor,
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends MusicGroup`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/music/GoogleMusicImporter.java`
#### Snippet
```java
  }

  private String[] getArtistTitles(List<MusicGroup> artists) {
    if (artists == null || artists.isEmpty()) {
      return null;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends MusicPlaylistItem`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/music/GoogleMusicImporter.java`
#### Snippet
```java
      UUID jobId,
      TokensAndUrlAuthData authData,
      List<MusicPlaylistItem> playlistItems,
      IdempotentImportExecutor executor,
      String playlistId)
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ExportInformation`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/videos/GoogleVideosExporter.java`
#### Snippet
```java
  @Override
  public ExportResult<VideosContainerResource> export(
          UUID jobId, TokensAndUrlAuthData authData, Optional<ExportInformation> exportInformation)
          throws IOException {

```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends StringPaginationToken`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/videos/GoogleVideosExporter.java`
#### Snippet
```java
  @VisibleForTesting
  ExportResult<VideosContainerResource> exportVideos(
          TokensAndUrlAuthData authData, Optional<StringPaginationToken> paginationData)
          throws IOException {

```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends PaginationData`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/music/GoogleMusicExporter.java`
#### Snippet
```java
      TokensAndUrlAuthData authData,
      IdOnlyContainerResource playlistData,
      Optional<PaginationData> paginationData)
      throws IOException, InvalidTokenException, PermissionDeniedException {
    String playlistId = playlistData.getId();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ExportInformation`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/music/GoogleMusicExporter.java`
#### Snippet
```java
  @Override
  public ExportResult<MusicContainerResource> export(
      UUID jobId, TokensAndUrlAuthData authData, Optional<ExportInformation> exportInformation)
      throws IOException, InvalidTokenException, PermissionDeniedException {

```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Map`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/videos/GoogleVideosInterface.java`
#### Snippet
```java
  }

  private String generateParamsString(Optional<Map<String, String>> params) throws IOException {
    Map<String, String> updatedParams = new ArrayMap<>();
    if (params.isPresent()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Map`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/music/GoogleMusicHttpApi.java`
#### Snippet
```java
  }

  private String generateParamsString(Optional<Map<String, String>> params) {
    Map<String, String> updatedParams = new ArrayMap<>();
    if (params.isPresent()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ExportInformation`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/photos/GooglePhotosExporter.java`
#### Snippet
```java
  @Override
  public ExportResult<PhotosContainerResource> export(
      UUID jobId, TokensAndUrlAuthData authData, Optional<ExportInformation> exportInformation)
      throws IOException, InvalidTokenException, PermissionDeniedException, UploadErrorException {
    if (!exportInformation.isPresent()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends IdOnlyContainerResource`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/photos/GooglePhotosExporter.java`
#### Snippet
```java
  ExportResult<PhotosContainerResource> exportPhotos(
      TokensAndUrlAuthData authData,
      Optional<IdOnlyContainerResource> albumData,
      Optional<PaginationData> paginationData,
      UUID jobId)
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Map`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/photos/GooglePhotosInterface.java`
#### Snippet
```java

  <T> T makePostRequest(String url, Optional<Map<String, String>> parameters,
      Optional<Map<String, String>> extraHeaders, HttpContent httpContent, Class<T> clazz)
      throws IOException, InvalidTokenException, PermissionDeniedException, UploadErrorException {
    // Wait for write permit before making request
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Map`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/photos/GooglePhotosInterface.java`
#### Snippet
```java
  }

  private String generateParamsString(Optional<Map<String, String>> params) {
    Map<String, String> updatedParams = new ArrayMap<>();
    if (params.isPresent()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super UUID`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/photos/GooglePhotosImporter.java`
#### Snippet
```java
      JobStore jobStore,
      JsonFactory jsonFactory,
      Map<UUID, GooglePhotosInterface> photosInterfacesMap,
      GooglePhotosInterface photosInterface,
      ConnectionProvider connectionProvider,
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends PhotoModel`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/photos/GooglePhotosImporter.java`
#### Snippet
```java
      UUID jobId,
      TokensAndUrlAuthData authData,
      List<PhotoModel> photos,
      IdempotentImportExecutor executor,
      String albumId)
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends PhotoModel`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/photos/GooglePhotosImporter.java`
#### Snippet
```java

  long importPhotos(
      Collection<PhotoModel> photos,
      IdempotentImportExecutor executor,
      UUID jobId,
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends StructuredName`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/contacts/GoogleContactsImporter.java`
#### Snippet
```java
  }

  private static Name getPrimaryGoogleName(List<StructuredName> vCardNameList) {
    StructuredName primaryVCardName;

```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ExportInformation`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/calendar/GoogleCalendarExporter.java`
#### Snippet
```java
  @Override
  public ExportResult<CalendarContainerResource> export(
      UUID jobId, TokensAndUrlAuthData authData, Optional<ExportInformation> exportInformation) {
    if (!exportInformation.isPresent()) {
      return exportCalendars(authData, Optional.empty());
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends VCard`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/contacts/GoogleContactsExporter.java`
#### Snippet
```java

  @VisibleForTesting
  static String makeVCardString(List<VCard> vCardList) throws IOException {
    StringWriter stringWriter = new StringWriter();
    JCardWriter jCardWriter = new JCardWriter(stringWriter);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ExportInformation`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/contacts/GoogleContactsExporter.java`
#### Snippet
```java
  @Override
  public ExportResult<ContactsModelWrapper> export(
      UUID jobId, TokensAndUrlAuthData authData, Optional<ExportInformation> exportInformation) {
    if (exportInformation.isPresent()) {
      StringPaginationToken stringPaginationToken = (StringPaginationToken)
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ExportInformation`
in `extensions/data-transfer/portability-data-transfer-smugmug/src/main/java/org/datatransferproject/transfer/smugmug/photos/SmugMugPhotosExporter.java`
#### Snippet
```java
  @Override
  public ExportResult<PhotosContainerResource> export(
      UUID jobId, TokenSecretAuthData authData, Optional<ExportInformation> exportInformation)
      throws IOException {

```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ExportInformation`
in `extensions/data-transfer/portability-data-transfer-twitter/src/main/java/org/datatransferproject/transfer/twitter/TwitterPhotosExporter.java`
#### Snippet
```java
  @Override
  public ExportResult<PhotosContainerResource> export(
      UUID jobId, TokenSecretAuthData authData, Optional<ExportInformation> exportInformation) {
    Twitter twitterApi = TwitterApiWrapper.getInstance(appCredentials, authData);
    int pageNumber = 1;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends SmugMugResponse`
in `extensions/data-transfer/portability-data-transfer-smugmug/src/main/java/org/datatransferproject/transfer/smugmug/photos/SmugMugInterface.java`
#### Snippet
```java

  private <T> SmugMugResponse<T> makeRequest(
      String url, TypeReference<SmugMugResponse<T>> typeReference) throws IOException {
    // Note: there are no request params that need to go here, because smugmug fully specifies
    // which resource to get in the URL of a request, without using query params.
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ExportInformation`
in `extensions/data-transfer/portability-data-transfer-facebook/src/main/java/org/datatransferproject/transfer/facebook/videos/FacebookVideosExporter.java`
#### Snippet
```java
  @Override
  public ExportResult<VideosContainerResource> export(
      UUID jobId, TokensAndUrlAuthData authData, Optional<ExportInformation> exportInformation)
      throws CopyExceptionWithFailureReason {
    Preconditions.checkNotNull(authData);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends StringPaginationToken`
in `extensions/data-transfer/portability-data-transfer-facebook/src/main/java/org/datatransferproject/transfer/facebook/videos/FacebookVideosExporter.java`
#### Snippet
```java

  private ExportResult<VideosContainerResource> exportVideos(
      TokensAndUrlAuthData authData, Optional<StringPaginationToken> paginationData)
      throws CopyExceptionWithFailureReason {

```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends VideoModel`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/videos/GoogleVideosImporter.java`
#### Snippet
```java
  }

  long importVideoBatch(UUID jobId, List<VideoModel> batchedVideos, PhotosLibraryClient client,
      IdempotentImportExecutor executor) throws Exception {
    final ArrayListMultimap<String, NewMediaItem> mediaItemsByAlbum = ArrayListMultimap.create();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super UUID`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/videos/GoogleVideosImporter.java`
#### Snippet
```java
      Monitor monitor,
      ConnectionProvider connectionProvider,
      Map<UUID, PhotosLibraryClient> clientsMap) {
    this.connectionProvider = connectionProvider;
    this.monitor = monitor;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ExportInformation`
in `extensions/data-transfer/portability-data-transfer-mastodon/src/main/java/org/datatransferproject/transfer/mastodon/social/MastodonActivityExport.java`
#### Snippet
```java
  @Override
  public ExportResult<SocialActivityContainerResource> export(UUID jobId,
                                                              CookiesAndUrlAuthData authData, Optional<ExportInformation> exportInformation)
          throws Exception {
    checkState(authData.getCookies().size() == 1,
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ExportInformation`
in `extensions/data-transfer/portability-data-transfer-instagram/src/main/java/org/datatransferproject/transfer/instagram/photos/InstagramPhotoExporter.java`
#### Snippet
```java
  @Override
  public ExportResult<PhotosContainerResource> export(UUID jobId, TokensAndUrlAuthData authData,
      Optional<ExportInformation> exportInformation) {
    if (exportInformation.isPresent()) {
      return exportPhotos(authData, Optional.ofNullable(exportInformation.get().getPaginationData()));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Map`
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/media/MicrosoftMediaInterface.java`
#### Snippet
```java

  private <T> T makeGetRequest(
      String url, Optional<Map<String, String>> parameters, Class<T> tClass) throws IOException {
    HttpRequestFactory requestFactory = httpTransport.createRequestFactory();
    if (parameters.isPresent() && parameters.get().size() > 0) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ExportInformation`
in `extensions/data-transfer/portability-data-transfer-facebook/src/main/java/org/datatransferproject/transfer/facebook/photos/FacebookPhotosExporter.java`
#### Snippet
```java
  @Override
  public ExportResult<PhotosContainerResource> export(
      UUID jobId, TokensAndUrlAuthData authData, Optional<ExportInformation> exportInformation)
      throws CopyExceptionWithFailureReason {
    Preconditions.checkNotNull(authData);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends StringPaginationToken`
in `extensions/data-transfer/portability-data-transfer-facebook/src/main/java/org/datatransferproject/transfer/facebook/photos/FacebookPhotosExporter.java`
#### Snippet
```java

  private Optional<String> stripTokenPrefix(
      Optional<StringPaginationToken> paginationData, String prefix) {
    Optional<String> paginationToken = Optional.empty();
    if (paginationData.isPresent()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ExportInformation`
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/photos/MicrosoftPhotosExporter.java`
#### Snippet
```java
  @Override
  public ExportResult<PhotosContainerResource> export(
      UUID jobId, TokensAndUrlAuthData authData, Optional<ExportInformation> exportInformation)
      throws IOException {
    if (!exportInformation.isPresent()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends IdOnlyContainerResource`
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/photos/MicrosoftPhotosExporter.java`
#### Snippet
```java
  ExportResult<PhotosContainerResource> exportOneDrivePhotos(
      TokensAndUrlAuthData authData,
      Optional<IdOnlyContainerResource> albumData,
      Optional<PaginationData> paginationData,
      UUID jobId)
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Map`
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/photos/MicrosoftPhotosInterface.java`
#### Snippet
```java

  private <T> T makeGetRequest(
      String url, Optional<Map<String, String>> parameters, Class<T> tClass) throws IOException {
    HttpRequestFactory requestFactory = httpTransport.createRequestFactory();
    if (parameters.isPresent() && parameters.get().size() > 0) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ExportInformation`
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/contacts/MicrosoftContactsExporter.java`
#### Snippet
```java
  @Override
  public ExportResult<ContactsModelWrapper> export(
      UUID jobId, TokensAndUrlAuthData authData, Optional<ExportInformation> exportInformation) {
    GraphPagination graphPagination =
        exportInformation.isPresent() ? (GraphPagination) exportInformation.get()
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Map`
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/contacts/MicrosoftContactsExporter.java`
#### Snippet
```java
  }

  private ContactsModelWrapper transform(List<Map<String, Object>> rawContacts) {
    StringWriter stringWriter = new StringWriter();
    try (JCardWriter writer = new JCardWriter(stringWriter)) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ExportInformation`
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/media/MicrosoftMediaExporter.java`
#### Snippet
```java
  @Override
  public ExportResult<MediaContainerResource> export(UUID jobId, TokensAndUrlAuthData authData,
      Optional<ExportInformation> exportInformation) throws IOException {
    if (!exportInformation.isPresent()) {
      return exportOneDrivePhotos(authData, Optional.empty(), Optional.empty(), jobId);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends IdOnlyContainerResource`
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/media/MicrosoftMediaExporter.java`
#### Snippet
```java
  @VisibleForTesting
  ExportResult<MediaContainerResource> exportOneDrivePhotos(TokensAndUrlAuthData authData,
      Optional<IdOnlyContainerResource> albumData, Optional<PaginationData> paginationData,
      UUID jobId) throws IOException {
    Optional<String> albumId = Optional.empty();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ExportInformation`
in `extensions/data-transfer/portability-data-transfer-rememberthemilk/src/main/java/org/datatransferproject/transfer/rememberthemilk/tasks/RememberTheMilkTasksExporter.java`
#### Snippet
```java
  @Override
  public ExportResult<TaskContainerResource> export(
          UUID jobId, AuthData authData, Optional<ExportInformation> exportInformation) {
    // Create new service for the authorized user
    RememberTheMilkService service = getOrCreateService(authData);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/transformer/calendar/ToGraphEventTransformer.java`
#### Snippet
```java
  }

  private void copyBody(CalendarEventModel eventModel, Map<String, Object> graphCalendar) {
    String notes = eventModel.getNotes();
    if (notes == null) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/transformer/calendar/ToGraphEventTransformer.java`
#### Snippet
```java
      String key,
      CalendarEventModel.CalendarEventTime dateTime,
      Map<String, Object> graphCalendar) {
    Map<String, String> graphDateTime = new HashMap<>();
    graphDateTime.put(
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/transformer/calendar/ToGraphEventTransformer.java`
#### Snippet
```java
  }

  private void copyLocation(CalendarEventModel eventModel, Map<String, Object> graphCalendar) {
    if (eventModel.getLocation() == null) {
      return;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/transformer/calendar/ToGraphEventTransformer.java`
#### Snippet
```java
  }

  private void copyAttendees(CalendarEventModel eventModel, Map<String, Object> graphCalendar) {
    List<CalendarAttendeeModel> attendees = eventModel.getAttendees();
    if (attendees == null) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends AuthServiceExtension`
in `portability-api/src/main/java/org/datatransferproject/api/ApiServicesModule.java`
#### Snippet
```java
      TrustManagerFactory trustManagerFactory,
      KeyManagerFactory keyManagerFactory,
      List<AuthServiceExtension> authServiceExtensions,
      TokenManager tokenManager,
      ExtensionContext context) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/transformer/contacts/ToGraphContactTransformer.java`
#### Snippet
```java
  }

  private void copyBusinessData(VCard card, Map<String, Object> contact) {
    for (Title title : card.getTitles()) {
      if (title.getValue() == null) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/transformer/contacts/ToGraphContactTransformer.java`
#### Snippet
```java

  @SuppressWarnings("unchecked")
  private void addPhone(String key, Telephone telephone, Map<String, Object> map) {
    List<String> collection = (List<String>) map.computeIfAbsent(key, k -> new ArrayList<>());
    collection.add(telephone.getText());
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/transformer/contacts/ToGraphContactTransformer.java`
#### Snippet
```java
  }

  private void copyNames(VCard card, Map<String, Object> contact) {
    StructuredName structuredName = card.getStructuredName();
    if (structuredName != null) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/transformer/contacts/ToGraphContactTransformer.java`
#### Snippet
```java

  @SuppressWarnings("unchecked")
  private void addEmail(Email email, Map<String, Object> map) {
    List<Map<String, String>> collection =
        (List<Map<String, String>>) map.computeIfAbsent("emailAddresses", k -> new ArrayList<>());
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/transformer/contacts/ToGraphContactTransformer.java`
#### Snippet
```java
  }

  private void copyExtendedData(VCard card, Map<String, Object> contact) {
    safeSet("manager", card.getExtendedProperty("X-Manager"), contact);
    safeSet("spouseName", card.getExtendedProperty("X-Spouse"), contact);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Importer`
in `portability-transfer/src/main/java/org/datatransferproject/transfer/CallableImporter.java`
#### Snippet
```java

  public CallableImporter(
      Provider<Importer> importerProvider,
      UUID jobId,
      IdempotentImportExecutor idempotentImportExecutor,
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/transformer/TransformerServiceImpl.java`
#### Snippet
```java
    private final Map<String, String> properties;

    public TransformerContextImpl(Map<String, String> properties) {
      this.properties = properties;
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/transformer/TransformerServiceImpl.java`
#### Snippet
```java
  @Override
  public <T> TransformResult<T> transform(
      Class<T> resultType, Object input, Map<String, String> properties) {
    TransformerContext context = new TransformerContextImpl(properties);
    T dataType = transform(resultType, input, context);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends TransferExtension`
in `portability-transfer/src/main/java/org/datatransferproject/transfer/WorkerModule.java`
#### Snippet
```java
  @VisibleForTesting
  static TransferExtension findTransferExtension(
      ImmutableList<TransferExtension> transferExtensions, String service) {
    try {
      return transferExtensions
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends TransferExtension`
in `portability-transfer/src/main/java/org/datatransferproject/transfer/WorkerModule.java`
#### Snippet
```java
      ExtensionContext context,
      CloudExtension cloudExtension,
      List<TransferExtension> transferExtensions,
      SecurityExtension securityExtension,
      IdempotentImportExecutor idempotentImportExecutor,
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ContainerResource`
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/types/ContinuationData.java`
#### Snippet
```java

  /** Adds a list of container resources. */
  public void addContainerResources(List<ContainerResource> resources) {
    containerResources.addAll(resources);
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super AD`
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/provider/converter/AnyToAnyImporter.java`
#### Snippet
```java
   * @param converter function converting between the existing and desired containers.
   */
  public AnyToAnyImporter(Importer<AD, From> importer, Function<To, From> converter) {
    this.importer = importer;
    this.converter = converter;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super From`
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/provider/converter/AnyToAnyImporter.java`
#### Snippet
```java
   * @param converter function converting between the existing and desired containers.
   */
  public AnyToAnyImporter(Importer<AD, From> importer, Function<To, From> converter) {
    this.importer = importer;
    this.converter = converter;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super To`
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/provider/converter/AnyToAnyImporter.java`
#### Snippet
```java
   * @param converter function converting between the existing and desired containers.
   */
  public AnyToAnyImporter(Importer<AD, From> importer, Function<To, From> converter) {
    this.importer = importer;
    this.converter = converter;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends From`
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/provider/converter/AnyToAnyImporter.java`
#### Snippet
```java
   * @param converter function converting between the existing and desired containers.
   */
  public AnyToAnyImporter(Importer<AD, From> importer, Function<To, From> converter) {
    this.importer = importer;
    this.converter = converter;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/types/TempPhotosData.java`
#### Snippet
```java
  public TempPhotosData(
      @JsonProperty("jobId") UUID jobId,
      @JsonProperty("tempPhotoAlbums") Map<String, PhotoAlbum> tempPhotoAlbums,
      @JsonProperty("newAlbumIds") Map<String, String> newAlbumIds,
      @JsonProperty("containedPhotoIds") Collection<String> containedPhotoIds) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/types/TempPhotosData.java`
#### Snippet
```java
      @JsonProperty("jobId") UUID jobId,
      @JsonProperty("tempPhotoAlbums") Map<String, PhotoAlbum> tempPhotoAlbums,
      @JsonProperty("newAlbumIds") Map<String, String> newAlbumIds,
      @JsonProperty("containedPhotoIds") Collection<String> containedPhotoIds) {
    this.jobId = jobId;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/types/TempPhotosData.java`
#### Snippet
```java
      @JsonProperty("tempPhotoAlbums") Map<String, PhotoAlbum> tempPhotoAlbums,
      @JsonProperty("newAlbumIds") Map<String, String> newAlbumIds,
      @JsonProperty("containedPhotoIds") Collection<String> containedPhotoIds) {
    this.jobId = jobId;
    this.tempPhotoAlbums = tempPhotoAlbums;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super AD`
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/provider/converter/MediaImporterDecorator.java`
#### Snippet
```java
  private final Importer<AD, VideosContainerResource> videosImporter;

  public MediaImporterDecorator(Importer<AD, PhotosContainerResource> photosImporter,
      Importer<AD, VideosContainerResource> videosImporter) {
    this.photosImporter = photosImporter;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super PhotosContainerResource`
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/provider/converter/MediaImporterDecorator.java`
#### Snippet
```java
  private final Importer<AD, VideosContainerResource> videosImporter;

  public MediaImporterDecorator(Importer<AD, PhotosContainerResource> photosImporter,
      Importer<AD, VideosContainerResource> videosImporter) {
    this.photosImporter = photosImporter;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super AD`
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/provider/converter/MediaImporterDecorator.java`
#### Snippet
```java

  public MediaImporterDecorator(Importer<AD, PhotosContainerResource> photosImporter,
      Importer<AD, VideosContainerResource> videosImporter) {
    this.photosImporter = photosImporter;
    this.videosImporter = videosImporter;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super VideosContainerResource`
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/provider/converter/MediaImporterDecorator.java`
#### Snippet
```java

  public MediaImporterDecorator(Importer<AD, PhotosContainerResource> photosImporter,
      Importer<AD, VideosContainerResource> videosImporter) {
    this.photosImporter = photosImporter;
    this.videosImporter = videosImporter;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super AD`
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/provider/converter/MediaExporterDecorator.java`
#### Snippet
```java
  private final Exporter<AD, VideosContainerResource> videosExporter;

  public MediaExporterDecorator(Exporter<AD, PhotosContainerResource> photosExporter,
      Exporter<AD, VideosContainerResource> videosExporter) {
    this.photosExporter = photosExporter;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super AD`
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/provider/converter/MediaExporterDecorator.java`
#### Snippet
```java

  public MediaExporterDecorator(Exporter<AD, PhotosContainerResource> photosExporter,
      Exporter<AD, VideosContainerResource> videosExporter) {
    this.photosExporter = photosExporter;
    this.videosExporter = videosExporter;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ExportInformation`
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/provider/converter/MediaExporterDecorator.java`
#### Snippet
```java

  private ExportResult<VideosContainerResource> exportVideos(UUID jobId, AD authData,
      Optional<ExportInformation> exportInfo) throws Exception {
    return videosExporter.export(jobId, authData, exportInfo.map((ei) -> {
      ContainerResource cr = ei.getContainerResource();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends PhotosContainerResource`
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/provider/converter/MediaExporterDecorator.java`
#### Snippet
```java

  private ExportResult<MediaContainerResource> mergeResults(
      ExportResult<PhotosContainerResource> photoResult,
      ExportResult<VideosContainerResource> videoResult) {
    ResultType resultType = ResultType.merge(photoResult.getType(), videoResult.getType());
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends VideosContainerResource`
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/provider/converter/MediaExporterDecorator.java`
#### Snippet
```java
  private ExportResult<MediaContainerResource> mergeResults(
      ExportResult<PhotosContainerResource> photoResult,
      ExportResult<VideosContainerResource> videoResult) {
    ResultType resultType = ResultType.merge(photoResult.getType(), videoResult.getType());

```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends PhotoAlbum`
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/provider/converter/MediaExporterDecorator.java`
#### Snippet
```java
  }

  private Collection<MediaAlbum> mergeAlbums(Collection<PhotoAlbum> a1,
      Collection<VideoAlbum> a2) {
    return Stream.concat(
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends VideoAlbum`
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/provider/converter/MediaExporterDecorator.java`
#### Snippet
```java

  private Collection<MediaAlbum> mergeAlbums(Collection<PhotoAlbum> a1,
      Collection<VideoAlbum> a2) {
    return Stream.concat(
        a1.stream().map(MediaAlbum::photoToMediaAlbum),
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ExportInformation`
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/provider/converter/MediaExporterDecorator.java`
#### Snippet
```java

  private ExportResult<PhotosContainerResource> exportPhotos(UUID jobId, AD authData,
      Optional<ExportInformation> exportInfo)
      throws Exception {
    return photosExporter.export(jobId, authData, exportInfo.map((ei) -> {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ExportInformation`
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/provider/converter/AnyToAnyExporter.java`
#### Snippet
```java

  @Override
  public ExportResult<To> export(UUID jobId, AD authData, Optional<ExportInformation> exportInfo)
      throws Exception {
    Optional<ExportInformation> infoWithConvertedResource =
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super AD`
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/provider/converter/AnyToAnyExporter.java`
#### Snippet
```java
   *                                   support MediaContainerResource.
   */
  public AnyToAnyExporter(Exporter<AD, From> exporter,
      Function<From, To> containerResourceConverter,
      Function<ContainerResource, ContainerResource> exportInformationConverter) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super From`
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/provider/converter/AnyToAnyExporter.java`
#### Snippet
```java
   */
  public AnyToAnyExporter(Exporter<AD, From> exporter,
      Function<From, To> containerResourceConverter,
      Function<ContainerResource, ContainerResource> exportInformationConverter) {
    this.exporter = exporter;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends To`
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/provider/converter/AnyToAnyExporter.java`
#### Snippet
```java
   */
  public AnyToAnyExporter(Exporter<AD, From> exporter,
      Function<From, To> containerResourceConverter,
      Function<ContainerResource, ContainerResource> exportInformationConverter) {
    this.exporter = exporter;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super ContainerResource`
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/provider/converter/AnyToAnyExporter.java`
#### Snippet
```java
  public AnyToAnyExporter(Exporter<AD, From> exporter,
      Function<From, To> containerResourceConverter,
      Function<ContainerResource, ContainerResource> exportInformationConverter) {
    this.exporter = exporter;
    this.containerResourceConverter = containerResourceConverter;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ContainerResource`
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/provider/converter/AnyToAnyExporter.java`
#### Snippet
```java
  public AnyToAnyExporter(Exporter<AD, From> exporter,
      Function<From, To> containerResourceConverter,
      Function<ContainerResource, ContainerResource> exportInformationConverter) {
    this.exporter = exporter;
    this.containerResourceConverter = containerResourceConverter;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends MusicRecording`
in `portability-types-common/src/main/java/org/datatransferproject/types/common/models/playlists/MusicPlaylist.java`
#### Snippet
```java
      String identifier,
      String headline,
      Iterable<MusicRecording> tracks) {
    super(identifier);
    setHeadline(headline);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends RetryMapping`
in `portability-types-transfer/src/main/java/org/datatransferproject/types/transfer/retry/RetryStrategyLibrary.java`
#### Snippet
```java
  private final RetryStrategy defaultRetryStrategy;

  public RetryStrategyLibrary(@JsonProperty("strategyMappings") List<RetryMapping> retryMappings,
      @JsonProperty("defaultRetryStrategy") RetryStrategy defaultRetryStrategy) {
    Preconditions.checkArgument(defaultRetryStrategy != null, "Default retry strategy cannot be null");
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `portability-types-transfer/src/main/java/org/datatransferproject/types/transfer/retry/RetryingCallable.java`
#### Snippet
```java

  public RetryingCallable(
      Callable<T> callable,
      RetryStrategyLibrary retryStrategyLibrary,
      Clock clock,
```

## RuleId[ruleID=NullableProblems]
### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `extensions/data-transfer/portability-data-transfer-mastodon/src/main/java/org/datatransferproject/transfer/mastodon/model/Status.java`
#### Snippet
```java
  private String id;
  private String uri;
  @Nullable private String url;
  private Account account;
  @Nullable private String inReplyToId;
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `extensions/data-transfer/portability-data-transfer-mastodon/src/main/java/org/datatransferproject/transfer/mastodon/model/Status.java`
#### Snippet
```java
  @Nullable private String url;
  private Account account;
  @Nullable private String inReplyToId;
  @Nullable private String inReplyToAccountId;
  private String content;
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `extensions/data-transfer/portability-data-transfer-mastodon/src/main/java/org/datatransferproject/transfer/mastodon/model/Status.java`
#### Snippet
```java
  private Account account;
  @Nullable private String inReplyToId;
  @Nullable private String inReplyToAccountId;
  private String content;
  private String createdAtTime;
```

### RuleId[ruleID=NullableProblems]
Overridden methods are not annotated
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/types/CopyExceptionWithFailureReason.java`
#### Snippet
```java
  }

  @Nonnull
  public abstract String getFailureReason();
}
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `portability-types-common/src/main/java/org/datatransferproject/types/common/models/photos/PhotoModel.java`
#### Snippet
```java
  private final boolean inTempStore;
  private String dataId;
  @Nullable private String sha1;  // SHA-1 hash in Hex (base16).
  private Date uploadedTime;

```

## RuleId[ruleID=MissortedModifiers]
### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `extensions/data-transfer/portability-data-transfer-solid/src/main/java/org/datatransferproject/transfer/solid/contacts/SolidContactsImport.java`
#### Snippet
```java

  @VisibleForTesting
  final static Model getPersonModel(VCard vcard) {
    Model personModel = ModelFactory.createDefaultModel();
    Resource r = personModel.createResource("#this");
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `extensions/data-transfer/portability-data-transfer-solid/src/main/java/org/datatransferproject/transfer/solid/contacts/SolidContactsExport.java`
#### Snippet
```java
  }

  final static VCard parsePerson(Resource r) {
    VCard vcard = new VCard();

```

## RuleId[ruleID=DuplicateCondition]
### RuleId[ruleID=DuplicateCondition]
Duplicate condition `createResponse.getError() != null`
in `extensions/data-transfer/portability-data-transfer-deezer/src/main/java/org/datatransferproject/transfer/deezer/playlists/DeezerPlaylistImporter.java`
#### Snippet
```java
    try {
      InsertResponse createResponse = api.createPlaylist("Imported - " + playlist.getHeadline());
      if (createResponse.getError() != null) {
        throw new IOException("problem creating playlist: " + playlist + " error: "
            + createResponse.getError());
```

### RuleId[ruleID=DuplicateCondition]
Duplicate condition `createResponse.getError() != null`
in `extensions/data-transfer/portability-data-transfer-deezer/src/main/java/org/datatransferproject/transfer/deezer/playlists/DeezerPlaylistImporter.java`
#### Snippet
```java
            + createResponse.getError());
      }
      if (createResponse.getError() != null) {
        throw new IOException("Problem creating playlist: "
            + playlist + ": " + createResponse.getError());
```

## RuleId[ruleID=IgnoreResultOfCall]
### RuleId[ruleID=IgnoreResultOfCall]
Result of `File.createNewFile()` is ignored
in `extensions/cloud/portability-cloud-local/src/main/java/org/datatransferproject/cloud/local/LocalTempFileStore.java`
#### Snippet
```java
  void writeInputStream(String filename, InputStream inputStream) throws IOException {
    File file = new File(TEMP_DIR + filename);
    file.createNewFile();
    try (OutputStream outputStream = new FileOutputStream(file)) {
      byte[] buffer = new byte[1024];
```

## RuleId[ruleID=RedundantMethodOverride]
### RuleId[ruleID=RedundantMethodOverride]
Method `getName()` only delegates to its super method
in `portability-types-common/src/main/java/org/datatransferproject/types/common/models/videos/VideoModel.java`
#### Snippet
```java
  @Override
  // required for org.datatransferproject.types.common.ImportableItem
  public String getName() {
    return super.getName();
  }
```

## RuleId[ruleID=DefaultAnnotationParam]
### RuleId[ruleID=DefaultAnnotationParam]
Redundant default parameter value assignment
in `portability-types-client/src/main/java/org/datatransferproject/types/client/transfer/ReservedWorker.java`
#### Snippet
```java

    @JsonCreator
    public ReservedWorker(@JsonProperty(value = "publicKey", required = false) String publicKey) {
        this.publicKey = publicKey;
    }
```

### RuleId[ruleID=DefaultAnnotationParam]
Redundant default parameter value assignment
in `portability-types-client/src/main/java/org/datatransferproject/types/client/transfer/CreateTransferJob.java`
#### Snippet
```java
      @JsonProperty(value = "importCallbackUrl", required = true) String importCallbackUrl,
      @JsonProperty(value = "dataType", required = true) DataVertical dataType,
      @JsonProperty(value = "exportInformation", required = false) ExportInformation exportInformation,
      @JsonProperty(value = "encryptionScheme", required = true) String encryptionScheme) {
    this.exportService = exportService;
```

### RuleId[ruleID=DefaultAnnotationParam]
Redundant default parameter value assignment
in `portability-types-common/src/main/java/org/datatransferproject/types/common/PortableType.java`
#### Snippet
```java
 * key for de/serialization.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "ptype")
public abstract class PortableType implements Serializable {}

```

### RuleId[ruleID=DefaultAnnotationParam]
Redundant default parameter value assignment
in `portability-types-transfer/src/main/java/org/datatransferproject/types/transfer/retry/RetryStrategy.java`
#### Snippet
```java
 */
@JsonTypeInfo(use = Id.NAME,
    include = As.PROPERTY,
    property = "type",
    visible = true)
```

## RuleId[ruleID=MalformedFormatString]
### RuleId[ruleID=MalformedFormatString]
Too few arguments for format string (found: 2, expected: 3)
in `extensions/data-transfer/portability-data-transfer-spotify/src/main/java/org/datatransferproject/transfer/spotify/playlists/SpotifyPlaylistExporter.java`
#### Snippet
```java
      monitor.debug(
          () ->
              format(
                  "Fetching playlist's %s tracks with offset %s, next: %s",
                  playlistId, finalOffset));
```

## RuleId[ruleID=JavaLangImport]
### RuleId[ruleID=JavaLangImport]
Unnecessary import from the 'java.lang' package
in `portability-api/src/main/java/org/datatransferproject/api/token/JWTTokenManager.java`
#### Snippet
```java
import org.datatransferproject.spi.api.token.TokenManager;

import java.lang.IllegalArgumentException;
import java.util.Date;
import java.util.UUID;
```

## RuleId[ruleID=IfStatementWithIdenticalBranches]
### RuleId[ruleID=IfStatementWithIdenticalBranches]
Common part can be extracted removing branch
in `extensions/data-transfer/portability-data-transfer-smugmug/src/main/java/org/datatransferproject/transfer/smugmug/photos/SmugMugPhotosImporter.java`
#### Snippet
```java
    int depth = 0;
    while (albumTempData.getPhotoCount() >= transmogrificationConfig.getAlbumMaxSize()) {
      if (albumTempData.getOverflowAlbumExportId() == null) {
        PhotoAlbum newAlbum =
            createOverflowAlbum(
```

### RuleId[ruleID=IfStatementWithIdenticalBranches]
'if' statement can be collapsed
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/calendar/MicrosoftCalendarImporter.java`
#### Snippet
```java
    RequestHelper.BatchResponse eventResponse =
        RequestHelper.batchRequest(authData, eventRequests, baseUrl, client, objectMapper);
    if (ImportResult.ResultType.OK != eventResponse.getResult().getType()) {
      // TODO log problems
      return eventResponse.getResult();
```

## RuleId[ruleID=SimplifyOptionalCallChains]
### RuleId[ruleID=SimplifyOptionalCallChains]
Can be replaced with 'isEmpty()'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/photos/GooglePhotosExporter.java`
#### Snippet
```java
      UUID jobId, TokensAndUrlAuthData authData, Optional<ExportInformation> exportInformation)
      throws IOException, InvalidTokenException, PermissionDeniedException, UploadErrorException {
    if (!exportInformation.isPresent()) {
      // Make list of photos contained in albums so they are not exported twice later on
      populateContainedPhotosList(jobId, authData);
```

### RuleId[ruleID=SimplifyOptionalCallChains]
Can be replaced with 'isEmpty()'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/calendar/GoogleCalendarExporter.java`
#### Snippet
```java
  public ExportResult<CalendarContainerResource> export(
      UUID jobId, TokensAndUrlAuthData authData, Optional<ExportInformation> exportInformation) {
    if (!exportInformation.isPresent()) {
      return exportCalendars(authData, Optional.empty());
    } else {
```

### RuleId[ruleID=SimplifyOptionalCallChains]
Can be replaced with 'isEmpty()'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/videos/GoogleVideosImporter.java`
#### Snippet
```java
      UploadMediaItemResponse uploadResponse = photosLibraryClient.uploadMediaItem(uploadRequest);
      String uploadToken;
      if (uploadResponse.getError().isPresent() || !uploadResponse.getUploadToken().isPresent()) {
        Error error = uploadResponse.getError().orElse(null);

```

### RuleId[ruleID=SimplifyOptionalCallChains]
Can be replaced with 'isEmpty()'
in `extensions/data-transfer/portability-data-transfer-instagram/src/main/java/org/datatransferproject/transfer/instagram/photos/InstagramPhotoExporter.java`
#### Snippet
```java
    List<PhotoAlbum> albums = new ArrayList<>();

    if (!photos.isEmpty() && !pageData.isPresent()) {
      albums.add(
          new PhotoAlbum(
```

### RuleId[ruleID=SimplifyOptionalCallChains]
Can be replaced with 'isEmpty()'
in `extensions/data-transfer/portability-data-transfer-facebook/src/main/java/org/datatransferproject/transfer/facebook/photos/FacebookPhotosExporter.java`
#### Snippet
```java
    Preconditions.checkNotNull(authData);

    if (!exportInformation.isPresent()) {
      // No export information if at the start of a bulk export
      // Start by getting the list of albums to export
```

### RuleId[ruleID=SimplifyOptionalCallChains]
Can be replaced with 'isEmpty()'
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/photos/MicrosoftPhotosExporter.java`
#### Snippet
```java
      UUID jobId, TokensAndUrlAuthData authData, Optional<ExportInformation> exportInformation)
      throws IOException {
    if (!exportInformation.isPresent()) {
      return exportOneDrivePhotos(authData, Optional.empty(), Optional.empty(), jobId);
    }
```

### RuleId[ruleID=SimplifyOptionalCallChains]
Can be replaced with 'isEmpty()'
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/media/MicrosoftMediaExporter.java`
#### Snippet
```java
  public ExportResult<MediaContainerResource> export(UUID jobId, TokensAndUrlAuthData authData,
      Optional<ExportInformation> exportInformation) throws IOException {
    if (!exportInformation.isPresent()) {
      return exportOneDrivePhotos(authData, Optional.empty(), Optional.empty(), jobId);
    }
```

## RuleId[ruleID=UNUSED_IMPORT]
### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import org.datatransferproject.spi.cloud.storage.CryptoKeyStore;`
in `extensions/cloud/portability-cloud-google/src/main/java/org/datatransferproject/cloud/google/GoogleAppSecretDecrypter.java`
#### Snippet
```java
import java.io.IOException;
import org.datatransferproject.cloud.google.GoogleCloudExtensionModule.ProjectId;
import org.datatransferproject.spi.cloud.storage.CryptoKeyStore;

/** Decrypts app secrets using Google Cloud KMS. */
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.io.InputStream;`
in `extensions/cloud/portability-cloud-local/src/main/java/org/datatransferproject/cloud/local/LocalAppCredentialStore.java`
#### Snippet
```java

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.util.HashMap;`
in `extensions/cloud/portability-cloud-local/src/main/java/org/datatransferproject/cloud/local/LocalAppCredentialStore.java`
#### Snippet
```java
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.util.Map;`
in `extensions/cloud/portability-cloud-local/src/main/java/org/datatransferproject/cloud/local/LocalAppCredentialStore.java`
#### Snippet
```java
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.util.Properties;`
in `extensions/cloud/portability-cloud-local/src/main/java/org/datatransferproject/cloud/local/LocalAppCredentialStore.java`
#### Snippet
```java
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.net.URI;`
in `extensions/data-transfer/portability-data-transfer-backblaze/src/main/java/org/datatransferproject/datatransfer/backblaze/common/BackblazeDataTransferClient.java`
#### Snippet
```java
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import org.datatransferproject.transfer.JobMetadata;`
in `extensions/data-transfer/portability-data-transfer-backblaze/src/main/java/org/datatransferproject/datatransfer/backblaze/common/BackblazeDataTransferClient.java`
#### Snippet
```java
import org.datatransferproject.api.launcher.Monitor;
import org.datatransferproject.datatransfer.backblaze.exception.BackblazeCredentialsException;
import org.datatransferproject.transfer.JobMetadata;
import software.amazon.awssdk.auth.credentials.AwsSessionCredentials;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import software.amazon.awssdk.auth.credentials.AwsSessionCredentials;`
in `extensions/data-transfer/portability-data-transfer-backblaze/src/main/java/org/datatransferproject/datatransfer/backblaze/common/BackblazeDataTransferClient.java`
#### Snippet
```java
import org.datatransferproject.datatransfer.backblaze.exception.BackblazeCredentialsException;
import org.datatransferproject.transfer.JobMetadata;
import software.amazon.awssdk.auth.credentials.AwsSessionCredentials;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.awscore.exception.AwsServiceException;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;`
in `extensions/data-transfer/portability-data-transfer-backblaze/src/main/java/org/datatransferproject/datatransfer/backblaze/common/BackblazeDataTransferClient.java`
#### Snippet
```java
import org.datatransferproject.transfer.JobMetadata;
import software.amazon.awssdk.auth.credentials.AwsSessionCredentials;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.awscore.exception.AwsServiceException;
import software.amazon.awssdk.core.client.config.ClientOverrideConfiguration;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import software.amazon.awssdk.core.client.config.ClientOverrideConfiguration;`
in `extensions/data-transfer/portability-data-transfer-backblaze/src/main/java/org/datatransferproject/datatransfer/backblaze/common/BackblazeDataTransferClient.java`
#### Snippet
```java
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.awscore.exception.AwsServiceException;
import software.amazon.awssdk.core.client.config.ClientOverrideConfiguration;
import software.amazon.awssdk.core.exception.SdkClientException;
import software.amazon.awssdk.core.sync.RequestBody;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import software.amazon.awssdk.regions.Region;`
in `extensions/data-transfer/portability-data-transfer-backblaze/src/main/java/org/datatransferproject/datatransfer/backblaze/common/BackblazeDataTransferClient.java`
#### Snippet
```java
import software.amazon.awssdk.core.exception.SdkClientException;
import software.amazon.awssdk.core.sync.RequestBody;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.Bucket;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/common/GoogleStaticObjects.java`
#### Snippet
```java
package org.datatransferproject.datatransfer.google.common;

import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import com.google.api.client.http.HttpTransport;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/common/GoogleStaticObjects.java`
#### Snippet
```java

import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.util.store.DataStoreFactory;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import com.google.api.client.json.JsonFactory;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/common/GoogleStaticObjects.java`
#### Snippet
```java
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.util.store.DataStoreFactory;
import com.google.api.client.util.store.FileDataStoreFactory;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import com.google.api.client.util.store.DataStoreFactory;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/common/GoogleStaticObjects.java`
#### Snippet
```java
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.util.store.DataStoreFactory;
import com.google.api.client.util.store.FileDataStoreFactory;

```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import com.google.api.client.util.store.FileDataStoreFactory;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/common/GoogleStaticObjects.java`
#### Snippet
```java
import com.google.api.client.json.JsonFactory;
import com.google.api.client.util.store.DataStoreFactory;
import com.google.api.client.util.store.FileDataStoreFactory;

/**
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.util.Arrays;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/mediaModels/BatchMediaItemResponse.java`
#### Snippet
```java
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Arrays;

public class BatchMediaItemResponse {
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.io.IOException;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/tasks/GoogleTasksImporter.java`
#### Snippet
```java
import org.datatransferproject.types.transfer.auth.TokensAndUrlAuthData;

import java.io.IOException;
import java.util.UUID;

```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.io.BufferedInputStream;`
in `extensions/data-transfer/portability-data-transfer-koofr/src/main/java/org/datatransferproject/transfer/koofr/photos/KoofrPhotosImporter.java`
#### Snippet
```java
package org.datatransferproject.transfer.koofr.photos;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.net.HttpURLConnection;`
in `extensions/data-transfer/portability-data-transfer-koofr/src/main/java/org/datatransferproject/transfer/koofr/photos/KoofrPhotosImporter.java`
#### Snippet
```java
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.text.SimpleDateFormat;
import java.util.Date;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import static com.google.common.base.Preconditions.checkArgument;`
in `extensions/data-transfer/portability-data-transfer-mastodon/src/main/java/org/datatransferproject/transfer/mastodon/social/MastodonHttpUtilities.java`
#### Snippet
```java
package org.datatransferproject.transfer.mastodon.social;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;

```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import com.fasterxml.jackson.annotation.JsonIgnoreProperties;`
in `extensions/data-transfer/portability-data-transfer-rememberthemilk/src/main/java/org/datatransferproject/transfer/rememberthemilk/model/tasks/GetListResponse.java`
#### Snippet
```java
package org.datatransferproject.transfer.rememberthemilk.model.tasks;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.xml.annotate.JacksonXmlProperty;
import com.google.common.base.MoreObjects;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.util.HashMap;`
in `extensions/data-transfer/portability-data-transfer-rememberthemilk/src/main/java/org/datatransferproject/transfer/rememberthemilk/tasks/RememberTheMilkService.java`
#### Snippet
```java
import java.net.URL;
import java.time.Instant;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import javax.print.DocFlavor.STRING;`
in `extensions/data-transfer/portability-data-transfer-rememberthemilk/src/main/java/org/datatransferproject/transfer/rememberthemilk/tasks/RememberTheMilkService.java`
#### Snippet
```java
import java.util.LinkedHashMap;
import java.util.Map;
import javax.print.DocFlavor.STRING;
import org.datatransferproject.transfer.rememberthemilk.model.tasks.GetListResponse;
import org.datatransferproject.transfer.rememberthemilk.model.tasks.GetListsResponse;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import com.fasterxml.jackson.annotation.JsonCreator;`
in `extensions/data-transfer/portability-data-transfer-smugmug/src/main/java/org/datatransferproject/transfer/smugmug/photos/model/SmugMugAlbum.java`
#### Snippet
```java
package org.datatransferproject.transfer.smugmug.photos.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.security.PrivateKey;`
in `extensions/security/portability-security-cleartext/src/main/java/org/datatransferproject/security/cleartext/ClearTextAuthDataDecryptService.java`
#### Snippet
```java

import java.io.IOException;
import java.security.PrivateKey;

/** */
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.security.PublicKey;`
in `extensions/security/portability-security-cleartext/src/main/java/org/datatransferproject/security/cleartext/ClearTextPublicKeySerializer.java`
#### Snippet
```java
import org.datatransferproject.spi.transfer.security.SecurityException;

import java.security.PublicKey;

/** */
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import com.fasterxml.jackson.annotation.JsonInclude;`
in `libraries/auth/src/main/java/org/datatransferproject/auth/OAuth2TokenResponse.java`
#### Snippet
```java

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import org.datatransferproject.config.extension.SettingsExtension;`
in `libraries/config/src/main/java/org/datatransferproject/config/FlagBindingModule.java`
#### Snippet
```java
import org.datatransferproject.api.launcher.ExtensionContext;
import org.datatransferproject.api.launcher.Flag;
import org.datatransferproject.config.extension.SettingsExtension;

/**
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import org.datatransferproject.api.launcher.Monitor;`
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/idempotentexecutor/IdempotentImportExecutorExtension.java`
#### Snippet
```java
import org.datatransferproject.api.launcher.BootExtension;
import org.datatransferproject.api.launcher.ExtensionContext;
import org.datatransferproject.api.launcher.Monitor;

public interface IdempotentImportExecutorExtension extends BootExtension {
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import org.datatransferproject.api.launcher.Monitor;`
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/idempotentexecutor/IdempotentImportExecutorLoader.java`
#### Snippet
```java
import java.util.ServiceLoader;
import org.datatransferproject.api.launcher.ExtensionContext;
import org.datatransferproject.api.launcher.Monitor;

public class IdempotentImportExecutorLoader {
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.security.PrivateKey;`
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/security/AuthDataDecryptService.java`
#### Snippet
```java
import org.datatransferproject.types.transfer.auth.AuthDataPair;

import java.security.PrivateKey;

/** Decrypts authentication data for a given scheme. */
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.security.PublicKey;`
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/security/PublicKeySerializer.java`
#### Snippet
```java
package org.datatransferproject.spi.transfer.security;

import java.security.PublicKey;

/** Serializes a public key for a given encryption scheme. */
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import org.datatransferproject.spi.cloud.types.PortabilityJob.State;`
in `portability-transfer/src/main/java/org/datatransferproject/transfer/JobPollingService.java`
#### Snippet
```java
import org.datatransferproject.spi.cloud.types.JobAuthorization;
import org.datatransferproject.spi.cloud.types.PortabilityJob;
import org.datatransferproject.spi.cloud.types.PortabilityJob.State;
import org.datatransferproject.spi.transfer.security.PublicKeySerializer;
import org.datatransferproject.spi.transfer.security.TransferKeyGenerator;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import static java.lang.String.format;`
in `portability-transfer/src/main/java/org/datatransferproject/transfer/copier/PortabilityInMemoryDataCopier.java`
#### Snippet
```java
package org.datatransferproject.transfer.copier;

import static java.lang.String.format;

import com.google.inject.Provider;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.util.ArrayList;`
in `portability-types-common/src/main/java/org/datatransferproject/types/common/models/media/MediaAlbum.java`
#### Snippet
```java
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.util.List;`
in `portability-types-common/src/main/java/org/datatransferproject/types/common/models/media/MediaAlbum.java`
#### Snippet
```java
import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import com.google.common.base.Strings;`
in `portability-types-common/src/main/java/org/datatransferproject/types/common/models/photos/PhotoAlbum.java`
#### Snippet
```java
import com.google.common.base.Preconditions;
import org.datatransferproject.types.common.ImportableItem;
import com.google.common.base.Strings;

import javax.annotation.Nonnull;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.util.ArrayList;`
in `portability-types-common/src/main/java/org/datatransferproject/types/common/models/photos/PhotoAlbum.java`
#### Snippet
```java
import java.util.Objects;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.util.List;`
in `portability-types-common/src/main/java/org/datatransferproject/types/common/models/tasks/TaskModel.java`
#### Snippet
```java
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Instant;
import java.util.List;
import java.util.Objects;

```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import com.google.common.base.Throwables;`
in `portability-types-transfer/src/main/java/org/datatransferproject/types/transfer/errors/ErrorDetail.java`
#### Snippet
```java
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.auto.value.AutoValue;
import com.google.common.base.Throwables;
import com.google.common.collect.ImmutableMap;

```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import com.google.common.collect.ImmutableMap;`
in `portability-types-transfer/src/main/java/org/datatransferproject/types/transfer/errors/ErrorDetail.java`
#### Snippet
```java
import com.google.auto.value.AutoValue;
import com.google.common.base.Throwables;
import com.google.common.collect.ImmutableMap;

import java.util.Map;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.util.Map;`
in `portability-types-transfer/src/main/java/org/datatransferproject/types/transfer/errors/ErrorDetail.java`
#### Snippet
```java
import com.google.common.collect.ImmutableMap;

import java.util.Map;

/**
```

## RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
### RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
`url = url + generateODataParams(parameters.get())` could be simplified to 'url += generateODataParams(parameters.get())'
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/media/MicrosoftMediaInterface.java`
#### Snippet
```java
    HttpRequestFactory requestFactory = httpTransport.createRequestFactory();
    if (parameters.isPresent() && parameters.get().size() > 0) {
      url = url + generateODataParams(parameters.get());
    }
    HttpRequest getRequest = requestFactory.buildGetRequest(new GenericUrl(url));
```

### RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
`url = url + generateODataParams(parameters.get())` could be simplified to 'url += generateODataParams(parameters.get())'
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/photos/MicrosoftPhotosInterface.java`
#### Snippet
```java
    HttpRequestFactory requestFactory = httpTransport.createRequestFactory();
    if (parameters.isPresent() && parameters.get().size() > 0) {
      url = url + generateODataParams(parameters.get());
    }
    HttpRequest getRequest = requestFactory.buildGetRequest(new GenericUrl(url));
```

## RuleId[ruleID=NestedAssignment]
### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `extensions/cloud/portability-cloud-local/src/main/java/org/datatransferproject/cloud/local/LocalTempFileStore.java`
#### Snippet
```java
      byte[] buffer = new byte[1024];
      int bytesRead;
      while ((bytesRead = inputStream.read(buffer)) != -1) {
        outputStream.write(buffer, 0, bytesRead);
      }
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `extensions/data-transfer/portability-data-transfer-koofr/src/main/java/org/datatransferproject/transfer/koofr/common/KoofrClient.java`
#### Snippet
```java
        String line;
        List<FilesListRecursiveItem> items = new ArrayList<FilesListRecursiveItem>();
        while ((line = bufferedBodyReader.readLine()) != null) {
          items.add(objectMapper.readValue(line, FilesListRecursiveItem.class));
        }
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/blogger/GoogleBloggerImporter.java`
#### Snippet
```java

  private synchronized Drive getOrCreateDriveService(TokensAndUrlAuthData authData) {
    return driveInterface == null ? (driveInterface = makeDriveService(authData)) : driveInterface;
  }

```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/DataChunk.java`
#### Snippet
```java

    // start timing
    while ((quantityToSend = inputStream.read(data, offset, roomLeft)) != -1) {
      offset += quantityToSend;
      roomLeft -= quantityToSend;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `portability-transfer/src/main/java/org/datatransferproject/transfer/CallableSizeCalculator.java`
#### Snippet
```java
      byte[] buffer = new byte[1024 * 1024]; // 1MB
      int chunkBytesRead;
      while ((chunkBytesRead = inStream.read(buffer)) != -1) {
        size += chunkBytesRead;
      }
```

## RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `httpTransport` is accessed in both synchronized and unsynchronized contexts
in `libraries/auth/src/main/java/org/datatransferproject/auth/OAuth2ServiceExtension.java`
#### Snippet
```java

  private AppCredentials appCredentials;
  private HttpTransport httpTransport;

  private boolean initialized = false;
```

### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `initialized` is accessed in both synchronized and unsynchronized contexts
in `libraries/auth/src/main/java/org/datatransferproject/auth/OAuth2ServiceExtension.java`
#### Snippet
```java
  private HttpTransport httpTransport;

  private boolean initialized = false;

  public OAuth2ServiceExtension(OAuth2Config oAuth2Config) {
```

### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `appCredentials` is accessed in both synchronized and unsynchronized contexts
in `libraries/auth/src/main/java/org/datatransferproject/auth/OAuth2ServiceExtension.java`
#### Snippet
```java
  private volatile Map<DataVertical, OAuth2DataGenerator> importAuthDataGenerators;

  private AppCredentials appCredentials;
  private HttpTransport httpTransport;

```

### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `httpTransport` is accessed in both synchronized and unsynchronized contexts
in `libraries/auth/src/main/java/org/datatransferproject/auth/OAuth1ServiceExtension.java`
#### Snippet
```java

  private AppCredentials appCredentials;
  private HttpTransport httpTransport;

  private boolean initialized = false;
```

### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `appCredentials` is accessed in both synchronized and unsynchronized contexts
in `libraries/auth/src/main/java/org/datatransferproject/auth/OAuth1ServiceExtension.java`
#### Snippet
```java
  private volatile Map<DataVertical, OAuth1DataGenerator> importAuthDataGenerators;

  private AppCredentials appCredentials;
  private HttpTransport httpTransport;

```

### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `initialized` is accessed in both synchronized and unsynchronized contexts
in `libraries/auth/src/main/java/org/datatransferproject/auth/OAuth1ServiceExtension.java`
#### Snippet
```java
  private HttpTransport httpTransport;

  private boolean initialized = false;
  private Monitor monitor;

```

### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `monitor` is accessed in both synchronized and unsynchronized contexts
in `libraries/auth/src/main/java/org/datatransferproject/auth/OAuth1ServiceExtension.java`
#### Snippet
```java

  private boolean initialized = false;
  private Monitor monitor;

  public OAuth1ServiceExtension(OAuth1Config oAuth1Config) {
```

### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `JOB_MAP` is accessed in both synchronized and unsynchronized contexts
in `extensions/cloud/portability-cloud-local/src/main/java/org/datatransferproject/cloud/local/LocalJobStore.java`
#### Snippet
```java
/** An in-memory {@link JobStore} implementation that uses a concurrent map as its store. */
public final class LocalJobStore extends JobStoreWithValidator {
  private static ConcurrentHashMap<UUID, Map<String, Object>> JOB_MAP = new ConcurrentHashMap<>();
  private static ConcurrentHashMap<String, Map<Class<? extends DataModel>, DataModel>> DATA_MAP =
      new ConcurrentHashMap<>();
```

### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `exportService` is accessed in both synchronized and unsynchronized contexts
in `portability-transfer/src/main/java/org/datatransferproject/transfer/JobMetadata.java`
#### Snippet
```java
  private static UUID jobId = null;
  private static DataVertical dataType = null;
  private static String exportService = null;
  private static String importService = null;
  private static Stopwatch stopWatch = null;
```

### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `importService` is accessed in both synchronized and unsynchronized contexts
in `portability-transfer/src/main/java/org/datatransferproject/transfer/JobMetadata.java`
#### Snippet
```java
  private static DataVertical dataType = null;
  private static String exportService = null;
  private static String importService = null;
  private static Stopwatch stopWatch = null;

```

### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `dataType` is accessed in both synchronized and unsynchronized contexts
in `portability-transfer/src/main/java/org/datatransferproject/transfer/JobMetadata.java`
#### Snippet
```java
  private static byte[] encodedPrivateKey = null;
  private static UUID jobId = null;
  private static DataVertical dataType = null;
  private static String exportService = null;
  private static String importService = null;
```

### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `encodedPrivateKey` is accessed in both synchronized and unsynchronized contexts
in `portability-transfer/src/main/java/org/datatransferproject/transfer/JobMetadata.java`
#### Snippet
```java
// We make the class and various methods public so they can be accessed from Monitors
public final class JobMetadata {
  private static byte[] encodedPrivateKey = null;
  private static UUID jobId = null;
  private static DataVertical dataType = null;
```

### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `jobId` is accessed in both synchronized and unsynchronized contexts
in `portability-transfer/src/main/java/org/datatransferproject/transfer/JobMetadata.java`
#### Snippet
```java
public final class JobMetadata {
  private static byte[] encodedPrivateKey = null;
  private static UUID jobId = null;
  private static DataVertical dataType = null;
  private static String exportService = null;
```

### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `stopWatch` is accessed in both synchronized and unsynchronized contexts
in `portability-transfer/src/main/java/org/datatransferproject/transfer/JobMetadata.java`
#### Snippet
```java
  private static String exportService = null;
  private static String importService = null;
  private static Stopwatch stopWatch = null;

  public static boolean isInitialized() {
```

## RuleId[ruleID=EmptyMethod]
### RuleId[ruleID=EmptyMethod]
Method only calls its super
in `portability-types-common/src/main/java/org/datatransferproject/types/common/models/blob/DigitalDocumentWrapper.java`
#### Snippet
```java
  @JsonIgnore
  @Override
  public Map<String, Integer> getCounts() {
    return super.getCounts();
  }
```

### RuleId[ruleID=EmptyMethod]
Method only calls its super
in `portability-types-common/src/main/java/org/datatransferproject/types/common/models/videos/VideoModel.java`
#### Snippet
```java
  @Override
  // required for org.datatransferproject.types.common.ImportableItem
  public String getName() {
    return super.getName();
  }
```

## RuleId[ruleID=RedundantFieldInitialization]
### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `libraries/auth/src/main/java/org/datatransferproject/auth/OAuth2ServiceExtension.java`
#### Snippet
```java
  private HttpTransport httpTransport;

  private boolean initialized = false;

  public OAuth2ServiceExtension(OAuth2Config oAuth2Config) {
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `libraries/auth/src/main/java/org/datatransferproject/auth/OAuth1ServiceExtension.java`
#### Snippet
```java
  private HttpTransport httpTransport;

  private boolean initialized = false;
  private Monitor monitor;

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `extensions/auth/portability-auth-rememberthemilk/src/main/java/org/datatransferproject/auth/rememberthemilk/RememberTheMilkAuthServiceExtension.java`
#### Snippet
```java
  private RememberTheMilkAuthDataGenerator importAuthDataGenerator;
  private RememberTheMilkAuthDataGenerator exportAuthDataGenerator;
  private boolean initialized = false;

  @Override
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `extensions/cloud/portability-cloud-google/src/main/java/org/datatransferproject/cloud/google/GoogleCloudExtension.java`
#### Snippet
```java
public class GoogleCloudExtension implements CloudExtension {
  private Injector injector;
  private boolean initialized = false;

  // TODO(seehamrun): Needed for ServiceLoader?
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `extensions/cloud/portability-cloud-google/src/main/java/org/datatransferproject/cloud/google/GoogleDtpInternalMetricRecorder.java`
#### Snippet
```java
 * **/
class GoogleDtpInternalMetricRecorder implements DtpInternalMetricRecorder {
  private static GoogleDtpInternalMetricRecorder INSTANCE = null;

  private static final int EXPORT_INTERVAL_SECONDS = 60;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `extensions/data-transfer/portability-data-transfer-imgur/src/main/java/org/datatransferproject/datatransfer/imgur/ImgurTransferExtension.java`
#### Snippet
```java
  private static final String BASE_URL = "https://api.imgur.com/3";

  private boolean initialized = false;

  private static final ImmutableList<DataVertical> SUPPORTED_DATA_TYPES = ImmutableList.of(PHOTOS);
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `extensions/data-transfer/portability-data-transfer-koofr/src/main/java/org/datatransferproject/transfer/koofr/KoofrTransferExtension.java`
#### Snippet
```java
  private ImmutableMap<DataVertical, Importer> importerMap;
  private ImmutableMap<DataVertical, Exporter> exporterMap;
  private boolean initialized = false;

  // Needed for ServiceLoader to load this class.
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `extensions/data-transfer/portability-data-transfer-imgur/src/main/java/org/datatransferproject/datatransfer/imgur/photos/ImgurPhotosExporter.java`
#### Snippet
```java

  public static final String DEFAULT_ALBUM_ID = "defaultAlbumId";
  private boolean containsNonAlbumPhotos = false;
  private Set<String> albumPhotos = new HashSet<>();

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `extensions/data-transfer/portability-data-transfer-deezer/src/main/java/org/datatransferproject/transfer/deezer/DeezerTransferExtension.java`
#### Snippet
```java
  private Importer<TokensAndUrlAuthData, PlaylistContainerResource> importer;

  private boolean initialized = false;

  @Override
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `extensions/data-transfer/portability-data-transfer-flickr/src/main/java/org/datatransferproject/datatransfer/flickr/FlickrTransferExtension.java`
#### Snippet
```java
  private Exporter exporter;
  private TemporaryPerJobDataStore jobStore;
  private boolean initialized = false;
  private AppCredentials appCredentials;

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/BloggerTransferExtension.java`
#### Snippet
```java
  private ImmutableMap<DataVertical, Importer> importerMap;
  private ImmutableMap<DataVertical, Exporter> exporterMap;
  private boolean initialized = false;

  @Override
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/GoogleTransferExtension.java`
#### Snippet
```java
  private ImmutableMap<DataVertical, Importer> importerMap;
  private ImmutableMap<DataVertical, Exporter> exporterMap;
  private boolean initialized = false;

  @Override
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `extensions/data-transfer/portability-data-transfer-daybook/src/main/java/org/datatransferproject/transfer/daybook/DaybookTransferExtension.java`
#### Snippet
```java
      ImmutableList.of(PHOTOS, SOCIAL_POSTS);

  private boolean initialized = false;
  private ImmutableMap<DataVertical, Importer<?, ?>> importerMap;

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `extensions/data-transfer/portability-data-transfer-smugmug/src/main/java/org/datatransferproject/transfer/smugmug/SmugMugTransferExtension.java`
#### Snippet
```java
  private SmugMugPhotosImporter importer;
  private SmugMugPhotosExporter exporter;
  private boolean initialized = false;

  @Override
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `extensions/data-transfer/portability-data-transfer-spotify/src/main/java/org/datatransferproject/transfer/spotify/SpotifyTransferExtension.java`
#### Snippet
```java
  private Importer<TokensAndUrlAuthData, PlaylistContainerResource> importer;

  private boolean initialized = false;

  @Override
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `extensions/data-transfer/portability-data-transfer-twitter/src/main/java/org/datatransferproject/transfer/twitter/TwitterTransferExtension.java`
#### Snippet
```java
  private TwitterPhotosImporter importer;
  private TwitterPhotosExporter exporter;
  private boolean initialized = false;

  @Override
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `extensions/data-transfer/portability-data-transfer-facebook/src/main/java/org/datatransferproject/transfer/facebook/FacebookTransferExtension.java`
#### Snippet
```java
public class FacebookTransferExtension implements TransferExtension {
  private static final String SERVICE_ID = "Facebook";
  private boolean initialized = false;

  private static final ImmutableList<DataVertical> SUPPORTED_SERVICES =
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `extensions/data-transfer/portability-data-transfer-backblaze/src/main/java/org/datatransferproject/datatransfer/backblaze/BackblazeTransferExtension.java`
#### Snippet
```java

  private ImmutableMap<DataVertical, Importer> importerMap;
  private boolean initialized = false;

  @Override
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `extensions/data-transfer/portability-data-transfer-instagram/src/main/java/org/datatransferproject/transfer/instagram/InstagramTransferExtension.java`
#### Snippet
```java
  private Exporter<TokensAndUrlAuthData, PhotosContainerResource> exporter;

  private boolean initialized = false;

  @Override
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/MicrosoftTransferExtension.java`
#### Snippet
```java
  private final boolean offlineData;

  private boolean initialized = false;

  // Needed for ServiceLoader to load this class.
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `extensions/data-transfer/portability-data-transfer-rememberthemilk/src/main/java/org/datatransferproject/transfer/rememberthemilk/RememberTheMilkTransferExtension.java`
#### Snippet
```java
  private RememberTheMilkTasksExporter exporter;
  private RememberTheMilkTasksImporter importer;
  private boolean initialized = false;

  @Override
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `portability-transfer/src/main/java/org/datatransferproject/transfer/JobMetadata.java`
#### Snippet
```java
  private static UUID jobId = null;
  private static DataVertical dataType = null;
  private static String exportService = null;
  private static String importService = null;
  private static Stopwatch stopWatch = null;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `portability-transfer/src/main/java/org/datatransferproject/transfer/JobMetadata.java`
#### Snippet
```java
  private static DataVertical dataType = null;
  private static String exportService = null;
  private static String importService = null;
  private static Stopwatch stopWatch = null;

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `portability-transfer/src/main/java/org/datatransferproject/transfer/JobMetadata.java`
#### Snippet
```java
  private static byte[] encodedPrivateKey = null;
  private static UUID jobId = null;
  private static DataVertical dataType = null;
  private static String exportService = null;
  private static String importService = null;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `portability-transfer/src/main/java/org/datatransferproject/transfer/JobMetadata.java`
#### Snippet
```java
// We make the class and various methods public so they can be accessed from Monitors
public final class JobMetadata {
  private static byte[] encodedPrivateKey = null;
  private static UUID jobId = null;
  private static DataVertical dataType = null;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `portability-transfer/src/main/java/org/datatransferproject/transfer/JobMetadata.java`
#### Snippet
```java
public final class JobMetadata {
  private static byte[] encodedPrivateKey = null;
  private static UUID jobId = null;
  private static DataVertical dataType = null;
  private static String exportService = null;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `portability-transfer/src/main/java/org/datatransferproject/transfer/JobMetadata.java`
#### Snippet
```java
  private static String exportService = null;
  private static String importService = null;
  private static Stopwatch stopWatch = null;

  public static boolean isInitialized() {
```

## RuleId[ruleID=RedundantImplements]
### RuleId[ruleID=RedundantImplements]
Redundant interface declaration `Serializable`
in `extensions/data-transfer/portability-data-transfer-smugmug/src/main/java/org/datatransferproject/transfer/smugmug/photos/SmugMugPhotoTempData.java`
#### Snippet
```java

@JsonTypeName("org.dataportability:SmugMugPhotoTempData")
public class SmugMugPhotoTempData extends DataModel implements Serializable {
  private final String albumExportId;
  private final String albumName;
```

### RuleId[ruleID=RedundantImplements]
Redundant interface declaration `InMemoryDataCopier`
in `portability-transfer/src/main/java/org/datatransferproject/transfer/copier/PortabilityInMemoryDataCopier.java`
#### Snippet
```java
/** Implementation of {@link InMemoryDataCopier}. */
public class PortabilityInMemoryDataCopier extends PortabilityAbstractInMemoryDataCopier
    implements InMemoryDataCopier {

  private static final AtomicInteger COPY_ITERATION_COUNTER = new AtomicInteger();
```

## RuleId[ruleID=ExceptionNameDoesntEndWithException]
### RuleId[ruleID=ExceptionNameDoesntEndWithException]
Exception class name `CopyExceptionWithFailureReason` does not end with 'Exception'
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/types/CopyExceptionWithFailureReason.java`
#### Snippet
```java
 * then add the failure reason to the job.
 */
public abstract class CopyExceptionWithFailureReason extends CopyException {

  public CopyExceptionWithFailureReason(String message, Throwable cause) {
```

## RuleId[ruleID=InstanceofCatchParameter]
### RuleId[ruleID=InstanceofCatchParameter]
'instanceof' on 'catch' parameter `e`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/videos/GoogleVideosImporter.java`
#### Snippet
```java
          }
        } catch (IOException e) {
          if (e instanceof FileNotFoundException) {
            // If the video file is no longer available then skip the video. We see this in a small
            // number of videos where the video has been deleted.
```

## RuleId[ruleID=NonFinalFieldOfException]
### RuleId[ruleID=NonFinalFieldOfException]
Non-final field `jobId` of exception class
in `portability-transfer/src/main/java/org/datatransferproject/transfer/CredsTimeoutException.java`
#### Snippet
```java

public class CredsTimeoutException extends RuntimeException {
  private UUID jobId;

  public CredsTimeoutException(String message, UUID jobId) {
```

## RuleId[ruleID=RedundantStringFormatCall]
### RuleId[ruleID=RedundantStringFormatCall]
Redundant call to `format()`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/photos/GooglePhotosImporter.java`
#### Snippet
```java
      UUID jobId, TokensAndUrlAuthData authData, String albumId, IOException e) {
    monitor.info(
        () -> format("Can't find album during createPhotos call, album is likely deleted"), e);
    try {
      GoogleAlbum album = getOrCreatePhotosInterface(jobId, authData).getAlbum(albumId);
```

### RuleId[ruleID=RedundantStringFormatCall]
Redundant call to `format()`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/photos/GooglePhotosImporter.java`
#### Snippet
```java
          e);
    } catch (Exception ex) {
      monitor.info(() -> format("Can't find album during getAlbum call"), ex);
    }
  }
```

### RuleId[ruleID=RedundantStringFormatCall]
Redundant call to `format()`
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/media/MicrosoftMediaImporter.java`
#### Snippet
```java
          credential.getAccessToken(), item));
    } else if (code != 200) {
      monitor.info(() -> String.format("Got an unexpected non-200, non-error response code"));
    }
    ResponseBody responseBody = response.body();
```

### RuleId[ruleID=RedundantStringFormatCall]
Redundant call to `format()`
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/photos/MicrosoftPhotosImporter.java`
#### Snippet
```java
              photo));
    } else if (code != 200) {
      monitor.info(() -> String.format("Got an unexpected non-200, non-error response code"));
    }
    // make sure we have a non-null response body
```

## RuleId[ruleID=DuplicateThrows]
### RuleId[ruleID=DuplicateThrows]
There is a more general exception, 'java.lang.Exception', in the throws list already.
in `extensions/data-transfer/portability-data-transfer-flickr/src/main/java/org/datatransferproject/datatransfer/flickr/photos/FlickrPhotosImporter.java`
#### Snippet
```java
      AuthData authData,
      PhotosContainerResource data)
      throws Exception, IOException {
    Auth auth;
    try {
```

### RuleId[ruleID=DuplicateThrows]
There is a more general exception, 'java.lang.Exception', in the throws list already.
in `extensions/data-transfer/portability-data-transfer-spotify/src/main/java/org/datatransferproject/transfer/spotify/playlists/SpotifyPlaylistImporter.java`
#### Snippet
```java
      MusicPlaylist playlist,
      String userId)
      throws Exception, SpotifyWebApiException {
    String playlistId = idempotentExecutor.executeAndSwallowIOExceptions(
        playlist.getIdentifier(),
```

## RuleId[ruleID=FuseStreamOperations]
### RuleId[ruleID=FuseStreamOperations]
Stream may be extended replacing 'sort'
in `extensions/auth/portability-auth-rememberthemilk/src/main/java/org/datatransferproject/auth/rememberthemilk/RememberTheMilkSignatureGenerator.java`
#### Snippet
```java
    modifiedParams.put("api_key", appCredentials.getKey());

    List<String> orderedKeys = modifiedParams.keySet().stream().collect(Collectors.toList());
    Collections.sort(orderedKeys);

```

### RuleId[ruleID=FuseStreamOperations]
Stream may be extended replacing 'sort'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/videos/GoogleVideosInterface.java`
#### Snippet
```java
    updatedParams.put(ACCESS_TOKEN_KEY, Preconditions.checkNotNull(credential.getAccessToken()));

    List<String> orderedKeys = updatedParams.keySet().stream().collect(Collectors.toList());
    Collections.sort(orderedKeys);

```

### RuleId[ruleID=FuseStreamOperations]
Stream may be extended replacing 'sort'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/music/GoogleMusicHttpApi.java`
#### Snippet
```java

    List<String> orderedKeys =
        updatedParams.keySet().stream().collect(toCollection(ArrayList::new));
    Collections.sort(orderedKeys);

```

### RuleId[ruleID=FuseStreamOperations]
Stream may be extended replacing 'sort'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/photos/GooglePhotosInterface.java`
#### Snippet
```java
    updatedParams.put(ACCESS_TOKEN_KEY, Preconditions.checkNotNull(credential.getAccessToken()));

    List<String> orderedKeys = updatedParams.keySet().stream().collect(Collectors.toList());
    Collections.sort(orderedKeys);

```

### RuleId[ruleID=FuseStreamOperations]
Stream may be extended replacing 'sort'
in `extensions/data-transfer/portability-data-transfer-rememberthemilk/src/main/java/org/datatransferproject/transfer/rememberthemilk/tasks/RememberTheMilkSignatureGenerator.java`
#### Snippet
```java
    modifiedParams.put("auth_token", authToken);

    List<String> orderedKeys = modifiedParams.keySet().stream().collect(Collectors.toList());
    Collections.sort(orderedKeys);

```

## RuleId[ruleID=ZeroLengthArrayInitialization]
### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `extensions/auth/portability-auth-harness-microsoft/src/main/java/org/datatransferproject/auth/microsoft/harness/TestHelper.java`
#### Snippet
```java
        new X509TrustManager() {
          public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
          }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `extensions/auth/portability-auth-harness-microsoft/src/main/java/org/datatransferproject/auth/microsoft/harness/TestHelper.java`
#### Snippet
```java
          new X509TrustManager() {
            public X509Certificate[] getAcceptedIssuers() {
              return new X509Certificate[0];
            }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `extensions/transport/portability-transport-jettyrest/src/main/java/org/datatransferproject/transport/jettyrest/http/JettyTransport.java`
#### Snippet
```java

    ContextHandlerCollection contexts = new ContextHandlerCollection();
    contexts.setHandlers(handlers.toArray(new Handler[0]));
    server.setHandler(contexts);

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `extensions/data-transfer/portability-data-transfer-facebook/src/main/java/org/datatransferproject/transfer/facebook/videos/FacebookVideosImporter.java`
#### Snippet
```java

    String endpoint = "me/videos";
    client.publish(endpoint, GraphResponse.class, params.toArray(new Parameter[0]));
  }
}
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `extensions/data-transfer/portability-data-transfer-facebook/src/main/java/org/datatransferproject/transfer/facebook/videos/RestFbFacebookVideos.java`
#### Snippet
```java
    try {
      return client.fetchConnection(
          "me/videos/uploaded", Video.class, parameters.toArray(new Parameter[0]));
    } catch (FacebookOAuthException e) {
      throw FacebookTransferUtils.handleFacebookOAuthException(e);
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `extensions/data-transfer/portability-data-transfer-facebook/src/main/java/org/datatransferproject/transfer/facebook/photos/RestFbFacebookPhotos.java`
#### Snippet
```java
    paginationToken.ifPresent(token -> parameters.add(Parameter.with("after", token)));
    return client.fetchConnection(
        String.format("%s/photos", albumId), Photo.class, parameters.toArray(new Parameter[0]));
  }
}
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `extensions/data-transfer/portability-data-transfer-facebook/src/main/java/org/datatransferproject/transfer/facebook/photos/RestFbFacebookPhotos.java`
#### Snippet
```java
    parameters.add(Parameter.with("fields", "description,name"));
    paginationToken.ifPresent(token -> parameters.add(Parameter.with("after", token)));
    return client.fetchConnection("me/albums", Album.class, parameters.toArray(new Parameter[0]));
  }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/hooks/MultiplexJobHooks.java`
#### Snippet
```java

  public MultiplexJobHooks(JobHooks... delegates) {
    this.delegates = delegates != null ? delegates : new JobHooks[0];
  }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/hooks/JobHooksLoader.java`
#### Snippet
```java
    return jobHooks.isEmpty()
        ? new DefaultJobHooks()
        : new MultiplexJobHooks(jobHooks.toArray(new JobHooks[0]));
  }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `portability-api-launcher/src/main/java/org/datatransferproject/launcher/monitor/MultiplexMonitor.java`
#### Snippet
```java

  public MultiplexMonitor(Monitor... delegates) {
    this.delegates = delegates != null ? delegates : new Monitor[0];
  }

```

## RuleId[ruleID=UnstableTypeUsedInSignature]
### RuleId[ruleID=UnstableTypeUsedInSignature]
Method must be marked with '@com.google.common.annotations.Beta' annotation because its signature references unstable type 'com.google.common.util.concurrent.RateLimiter'
in `portability-types-transfer/src/main/java/org/datatransferproject/types/transfer/serviceconfig/TransferServiceConfig.java`
#### Snippet
```java
   * the config/[service].yaml config file.
   **/
  public RateLimiter getPerUserRateLimiter() {
    return rateLimiter;
  }
```

## RuleId[ruleID=UnusedAssignment]
### RuleId[ruleID=UnusedAssignment]
Variable `kpg` initializer `null` is redundant
in `extensions/security/portability-security-jwe/src/main/java/org/datatransferproject/security/jwe/JWEKeyGenerator.java`
#### Snippet
```java
  public WorkerKeyPair generate() {
    monitor.debug(() -> "JWEKeyGenerator generate");
    KeyPairGenerator kpg = null;
    try {
      kpg = KeyPairGenerator.getInstance(ALGORITHM);
```

### RuleId[ruleID=UnusedAssignment]
Variable `kpg` initializer `null` is redundant
in `extensions/security/portability-security-cleartext/src/main/java/org/datatransferproject/security/cleartext/ClearTextKeyGenerator.java`
#### Snippet
```java
  @Override
  public WorkerKeyPair generate() {
    KeyPairGenerator kpg = null;
    try {
      kpg = KeyPairGenerator.getInstance(ALGORITHM);
```

### RuleId[ruleID=UnusedAssignment]
Variable `inputStream` initializer `null` is redundant
in `extensions/data-transfer/portability-data-transfer-imgur/src/main/java/org/datatransferproject/datatransfer/imgur/photos/ImgurPhotosImporter.java`
#### Snippet
```java
      PhotoModel photoModel, UUID jobId, TokensAndUrlAuthData authData, String newAlbumId)
      throws IOException {
    InputStream inputStream = null;
    String albumId = photoModel.getAlbumId();
    String imageDescription = photoModel.getDescription();
```

### RuleId[ruleID=UnusedAssignment]
Variable `obj` initializer `null` is redundant
in `extensions/cloud/portability-cloud-google/src/main/java/org/datatransferproject/cloud/google/GoogleJobStore.java`
#### Snippet
```java
      } else {
        Blob blob = entity.getBlob(property);
        Object obj = null;
        try (ObjectInputStream in = new ObjectInputStream(blob.asInputStream())) {
          obj = in.readObject();
```

### RuleId[ruleID=UnusedAssignment]
Variable `request` initializer `null` is redundant
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/mail/GoogleMailExporter.java`
#### Snippet
```java
    Gmail gmail = getOrCreateGmail(authData);

    Messages.List request = null;
    try {
      request = gmail.users().messages().list(USER).setMaxResults(PAGE_SIZE);
```

### RuleId[ruleID=UnusedAssignment]
Variable `response` initializer `null` is redundant
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/mail/GoogleMailExporter.java`
#### Snippet
```java
    }

    ListMessagesResponse response = null;
    try {
      response = request.execute();
```

### RuleId[ruleID=UnusedAssignment]
Variable `getResponse` initializer `null` is redundant
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/mail/GoogleMailExporter.java`
#### Snippet
```java
    // as we can't store all the mail messages in memory at once.
    for (Message listMessage : response.getMessages()) {
      Message getResponse = null;
      try {
        getResponse =
```

### RuleId[ruleID=UnusedAssignment]
The value `offset` assigned to `totalFileSize` is never used
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/DataChunk.java`
#### Snippet
```java
    if (offset != 0) {
      chunksToSend.add(new DataChunk(data, offset, chunksRead * CHUNK_SIZE));
      totalFileSize += offset;
      chunksRead++;
    }
```

### RuleId[ruleID=UnusedAssignment]
The value changed at `chunksRead++` is never used
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/DataChunk.java`
#### Snippet
```java
      chunksToSend.add(new DataChunk(data, offset, chunksRead * CHUNK_SIZE));
      totalFileSize += offset;
      chunksRead++;
    }
    return chunksToSend;
```

### RuleId[ruleID=UnusedAssignment]
Variable `inputStream` initializer `null` is redundant
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/media/MicrosoftMediaImporter.java`
#### Snippet
```java
      DownloadableFile item, UUID jobId,
      IdempotentImportExecutor idempotentImportExecutor) throws Exception {
    BufferedInputStream inputStream = null;
    if (item.isInTempStore()) {
      inputStream =
```

### RuleId[ruleID=UnusedAssignment]
Variable `inputStream` initializer `null` is redundant
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/photos/MicrosoftPhotosImporter.java`
#### Snippet
```java
    UUID jobId,
    IdempotentImportExecutor idempotentImportExecutor) throws Exception {
    BufferedInputStream inputStream = null;
    if (photo.isInTempStore()) {
      inputStream = new BufferedInputStream(jobStore.getStream(jobId, photo.getFetchableUrl()).getStream());
```

### RuleId[ruleID=UnusedAssignment]
Variable `oldList` initializer `null` is redundant
in `extensions/data-transfer/portability-data-transfer-rememberthemilk/src/main/java/org/datatransferproject/transfer/rememberthemilk/tasks/RememberTheMilkTasksExporter.java`
#### Snippet
```java
      RememberTheMilkService service, IdOnlyContainerResource resource) {
    String oldListId = resource.getId();
    GetListResponse oldList = null;
    try {
      oldList = service.getList(oldListId);
```

### RuleId[ruleID=UnusedAssignment]
Variable `injector` initializer `null` is redundant
in `portability-transfer/src/main/java/org/datatransferproject/transfer/WorkerMain.java`
#### Snippet
```java
    JobHooks jobHooks = loadJobHooks();

    Injector injector = null;
    try {
      injector =
```

## RuleId[ruleID=OptionalGetWithoutIsPresent]
### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/music/GoogleMusicExporter.java`
#### Snippet
```java
      throws IOException, InvalidTokenException, PermissionDeniedException {

    if (exportInformation.get().getContainerResource() instanceof IdOnlyContainerResource) {
      // if ExportInformation is an id only container, this is a request to export playlist items.
      return exportPlaylistItems(
```

## RuleId[ruleID=ConstantValue]
### RuleId[ruleID=ConstantValue]
Value `description` is always 'null'
in `extensions/data-transfer/portability-data-transfer-koofr/src/main/java/org/datatransferproject/transfer/koofr/common/KoofrClient.java`
#### Snippet
```java
  public static String trimDescription(String description) {
    if (description == null) {
      return description;
    }
    if (description.length() > 1000) {
```

### RuleId[ruleID=ConstantValue]
Value `size` is always 'null'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/photos/GooglePhotosImporter.java`
#### Snippet
```java
          }

          Long finalSize = size;
          executor.importAndSwallowIOExceptions(photo, p -> ItemImportResult.error(e, finalSize));
        }
```

### RuleId[ruleID=ConstantValue]
Value `finalSize` is always 'null'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/photos/GooglePhotosImporter.java`
#### Snippet
```java

          Long finalSize = size;
          executor.importAndSwallowIOExceptions(photo, p -> ItemImportResult.error(e, finalSize));
        }

```

### RuleId[ruleID=ConstantValue]
Condition `taskList.taskseries != null` is always `true`
in `extensions/data-transfer/portability-data-transfer-rememberthemilk/src/main/java/org/datatransferproject/transfer/rememberthemilk/tasks/RememberTheMilkTasksExporter.java`
#### Snippet
```java

    for (TaskList taskList : taskLists) {
      if (taskList.taskseries != null) {
        for (TaskSeries taskSeries : taskList.taskseries) {
          // TODO: figure out what to do with notes
```

### RuleId[ruleID=ConstantValue]
Value `transferDataType` is always 'null'
in `portability-api/src/main/java/org/datatransferproject/api/action/transfer/GetTransferServicesAction.java`
#### Snippet
```java
    // Validate incoming data type parameter
    if (!ActionUtils.isValidTransferDataType(transferDataType)) {
      throw new IllegalArgumentException("Invalid transferDataType: " + transferDataType);
    }

```

## RuleId[ruleID=StringConcatenationInsideStringBufferAppend]
### RuleId[ruleID=StringConcatenationInsideStringBufferAppend]
String concatenation as argument to `StringBuilder.append()` call
in `portability-types-common/src/main/java/org/datatransferproject/types/common/models/calendar/RecurrenceRule.java`
#### Snippet
```java
        rdtParamList.add(TZID + "=" + tzidparam());
      }
      builder.append(String.join(";", rdtParamList) + ":" +
          String.join(",", rdtval()));
      return builder.toString();
```

### RuleId[ruleID=StringConcatenationInsideStringBufferAppend]
String concatenation as argument to `StringBuilder.append()` call
in `portability-types-common/src/main/java/org/datatransferproject/types/common/models/calendar/RecurrenceRule.java`
#### Snippet
```java
        exdtParamList.add(TZID + "=" + tzidparam());
      }
      builder.append(String.join(";", exdtParamList) + ":" +
          String.join(",", exdtval()));
      return builder.toString();
```

## RuleId[ruleID=IOResource]
### RuleId[ruleID=IOResource]
'ServerConnector' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `extensions/transport/portability-transport-jettyrest/src/main/java/org/datatransferproject/transport/jettyrest/http/JettyTransport.java`
#### Snippet
```java
      HttpConfiguration https = new HttpConfiguration();
      ServerConnector sslConnector =
          new ServerConnector(
              server,
              new SslConnectionFactory(sslContextFactory, "http/1.1"),
```

### RuleId[ruleID=IOResource]
'ServerConnector' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `extensions/transport/portability-transport-jettyrest/src/main/java/org/datatransferproject/transport/jettyrest/http/JettyTransport.java`
#### Snippet
```java
      server = new Server(httpPort);
      ServerConnector connector =
          new ServerConnector(server, new HttpConnectionFactory(new HttpConfiguration()));
      connector.setPort(httpPort);
      server.setConnectors(new Connector[] {connector});
```

### RuleId[ruleID=IOResource]
'JCardReader' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/contacts/GoogleContactsImporter.java`
#### Snippet
```java
      IdempotentImportExecutor idempotentExecutor,
      TokensAndUrlAuthData authData, ContactsModelWrapper data) throws Exception{
    JCardReader reader = new JCardReader(data.getVCards());
    try {
      // TODO(olsona): address any other problems that might arise in conversion
```

### RuleId[ruleID=IOResource]
'JCardWriter' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/contacts/GoogleContactsExporter.java`
#### Snippet
```java
  static String makeVCardString(List<VCard> vCardList) throws IOException {
    StringWriter stringWriter = new StringWriter();
    JCardWriter jCardWriter = new JCardWriter(stringWriter);
    for (VCard vCardProperties : vCardList) { // needs to be loop so error can be thrown
      jCardWriter.write(vCardProperties);
```

### RuleId[ruleID=IOResource]
'JCardReader' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/contacts/MicrosoftContactsImporter.java`
#### Snippet
```java
      TokenAuthData authData,
      ContactsModelWrapper wrapper) {
    JCardReader reader = new JCardReader(wrapper.getVCards());
    try {
      List<VCard> cards = reader.readAll();
```

## RuleId[ruleID=OptionalIsPresent]
### RuleId[ruleID=OptionalIsPresent]
Can be replaced with single expression in functional style
in `extensions/data-transfer/portability-data-transfer-imgur/src/main/java/org/datatransferproject/datatransfer/imgur/photos/ImgurPhotosExporter.java`
#### Snippet
```java

    PaginationData paginationData =
        exportInformation.isPresent() ? exportInformation.get().getPaginationData() : null;
    IdOnlyContainerResource resource =
        exportInformation.isPresent()
```

### RuleId[ruleID=OptionalIsPresent]
Can be replaced with single expression in functional style
in `extensions/data-transfer/portability-data-transfer-imgur/src/main/java/org/datatransferproject/datatransfer/imgur/photos/ImgurPhotosExporter.java`
#### Snippet
```java
        exportInformation.isPresent() ? exportInformation.get().getPaginationData() : null;
    IdOnlyContainerResource resource =
        exportInformation.isPresent()
            ? (IdOnlyContainerResource) exportInformation.get().getContainerResource()
            : null;
```

### RuleId[ruleID=OptionalIsPresent]
Can be replaced with single expression in functional style
in `extensions/data-transfer/portability-data-transfer-flickr/src/main/java/org/datatransferproject/datatransfer/flickr/photos/FlickrPhotosExporter.java`
#### Snippet
```java

    PaginationData paginationData =
        exportInformation.isPresent() ? exportInformation.get().getPaginationData() : null;
    IdOnlyContainerResource resource =
        exportInformation.isPresent()
```

### RuleId[ruleID=OptionalIsPresent]
Can be replaced with single expression in functional style
in `extensions/data-transfer/portability-data-transfer-flickr/src/main/java/org/datatransferproject/datatransfer/flickr/photos/FlickrPhotosExporter.java`
#### Snippet
```java
        exportInformation.isPresent() ? exportInformation.get().getPaginationData() : null;
    IdOnlyContainerResource resource =
        exportInformation.isPresent()
            ? (IdOnlyContainerResource) exportInformation.get().getContainerResource()
            : null;
```

### RuleId[ruleID=OptionalIsPresent]
Can be replaced with single expression in functional style
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/tasks/GoogleTasksExporter.java`
#### Snippet
```java

    IdOnlyContainerResource resource =
        exportInformation.isPresent()
            ? (IdOnlyContainerResource) exportInformation.get().getContainerResource()
            : null;
```

### RuleId[ruleID=OptionalIsPresent]
Can be replaced with single expression in functional style
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/tasks/GoogleTasksExporter.java`
#### Snippet
```java

    PaginationData paginationData =
        exportInformation.isPresent() ? exportInformation.get().getPaginationData() : null;

    try {
```

### RuleId[ruleID=OptionalIsPresent]
Can be replaced with single expression in functional style
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/tasks/GoogleTasksExporter.java`
#### Snippet
```java
        tasksService.tasks().list(resource.getId()).setMaxResults(PAGE_SIZE);

    if (paginationData.isPresent()) {
      query.setPageToken(((StringPaginationToken) paginationData.get()).getToken());
    }
```

### RuleId[ruleID=OptionalIsPresent]
Can be replaced with single expression in functional style
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/tasks/GoogleTasksExporter.java`
#### Snippet
```java
      Tasks tasksService, Optional<PaginationData> paginationData) throws IOException {
    Tasks.Tasklists.List query = tasksService.tasklists().list().setMaxResults(PAGE_SIZE);
    if (paginationData.isPresent()) {
      query.setPageToken(((StringPaginationToken) paginationData.get()).getToken());
    }
```

### RuleId[ruleID=OptionalIsPresent]
Can be replaced with single expression in functional style
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/videos/GoogleVideosInterface.java`
#### Snippet
```java
  private String generateParamsString(Optional<Map<String, String>> params) throws IOException {
    Map<String, String> updatedParams = new ArrayMap<>();
    if (params.isPresent()) {
      updatedParams.putAll(params.get());
    }
```

### RuleId[ruleID=OptionalIsPresent]
Can be replaced with single expression in functional style
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/videos/GoogleVideosInterface.java`
#### Snippet
```java
            MEDIA_FILTER_KEY, ImmutableMap.of("mediaTypes", ImmutableList.of("VIDEO"))));

    if (pageToken.isPresent()) {
      params.put(TOKEN_KEY, pageToken.get());
    }
```

### RuleId[ruleID=OptionalIsPresent]
Can be replaced with single expression in functional style
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/music/GoogleMusicHttpApi.java`
#### Snippet
```java
    Map<String, String> params = new LinkedHashMap<>();
    params.put(PAGE_SIZE_KEY, String.valueOf(PLAYLIST_PAGE_SIZE));
    if (pageToken.isPresent()) {
      params.put(TOKEN_KEY, pageToken.get());
    }
```

### RuleId[ruleID=OptionalIsPresent]
Can be replaced with single expression in functional style
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/music/GoogleMusicHttpApi.java`
#### Snippet
```java
    params.put(PAGE_SIZE_KEY, String.valueOf(PLAYLIST_ITEM_PAGE_SIZE));
    params.put(PLAYLIST_ID_KEY, playlistId);
    if (pageToken.isPresent()) {
      params.put(TOKEN_KEY, pageToken.get());
    }
```

### RuleId[ruleID=OptionalIsPresent]
Can be replaced with single expression in functional style
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/music/GoogleMusicHttpApi.java`
#### Snippet
```java
  private String generateParamsString(Optional<Map<String, String>> params) {
    Map<String, String> updatedParams = new ArrayMap<>();
    if (params.isPresent()) {
      updatedParams.putAll(params.get());
    }
```

### RuleId[ruleID=OptionalIsPresent]
Can be replaced with single expression in functional style
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/photos/GooglePhotosInterface.java`
#### Snippet
```java
      params.put(FILTERS_KEY, ImmutableMap.of(INCLUDE_ARCHIVED_KEY, String.valueOf(true)));
    }
    if (pageToken.isPresent()) {
      params.put(TOKEN_KEY, pageToken.get());
    }
```

### RuleId[ruleID=OptionalIsPresent]
Can be replaced with single expression in functional style
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/photos/GooglePhotosInterface.java`
#### Snippet
```java
  private String generateParamsString(Optional<Map<String, String>> params) {
    Map<String, String> updatedParams = new ArrayMap<>();
    if (params.isPresent()) {
      updatedParams.putAll(params.get());
    }
```

### RuleId[ruleID=OptionalIsPresent]
Can be replaced with single expression in functional style
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/photos/GooglePhotosInterface.java`
#### Snippet
```java
    Map<String, String> params = new LinkedHashMap<>();
    params.put(PAGE_SIZE_KEY, String.valueOf(ALBUM_PAGE_SIZE));
    if (pageToken.isPresent()) {
      params.put(TOKEN_KEY, pageToken.get());
    }
```

### RuleId[ruleID=OptionalIsPresent]
Can be replaced with single expression in functional style
in `extensions/data-transfer/portability-data-transfer-smugmug/src/main/java/org/datatransferproject/transfer/smugmug/photos/SmugMugPhotosExporter.java`
#### Snippet
```java

    StringPaginationToken paginationToken =
        exportInformation.isPresent()
            ? (StringPaginationToken) exportInformation.get().getPaginationData()
            : null;
```

### RuleId[ruleID=OptionalIsPresent]
Can be replaced with single expression in functional style
in `extensions/data-transfer/portability-data-transfer-smugmug/src/main/java/org/datatransferproject/transfer/smugmug/photos/SmugMugPhotosExporter.java`
#### Snippet
```java
            : null;
    IdOnlyContainerResource resource =
        exportInformation.isPresent()
            ? (IdOnlyContainerResource) exportInformation.get().getContainerResource()
            : null;
```

### RuleId[ruleID=OptionalIsPresent]
Can be replaced with single expression in functional style
in `extensions/data-transfer/portability-data-transfer-instagram/src/main/java/org/datatransferproject/transfer/instagram/photos/InstagramPhotoExporter.java`
#### Snippet
```java
  public ExportResult<PhotosContainerResource> export(UUID jobId, TokensAndUrlAuthData authData,
      Optional<ExportInformation> exportInformation) {
    if (exportInformation.isPresent()) {
      return exportPhotos(authData, Optional.ofNullable(exportInformation.get().getPaginationData()));
    } else {
```

### RuleId[ruleID=OptionalIsPresent]
Can be replaced with single expression in functional style
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/contacts/MicrosoftContactsExporter.java`
#### Snippet
```java
      UUID jobId, TokensAndUrlAuthData authData, Optional<ExportInformation> exportInformation) {
    GraphPagination graphPagination =
        exportInformation.isPresent() ? (GraphPagination) exportInformation.get()
            .getPaginationData() : null;
    if (graphPagination != null && graphPagination.getNextLink() != null) {
```

### RuleId[ruleID=OptionalIsPresent]
Can be replaced with single expression in functional style
in `extensions/data-transfer/portability-data-transfer-rememberthemilk/src/main/java/org/datatransferproject/transfer/rememberthemilk/tasks/RememberTheMilkTasksExporter.java`
#### Snippet
```java

    IdOnlyContainerResource resource =
        exportInformation.isPresent()
            ? (IdOnlyContainerResource) exportInformation.get().getContainerResource()
            : null;
```

### RuleId[ruleID=OptionalIsPresent]
Can be replaced with single expression in functional style
in `portability-transfer/src/main/java/org/datatransferproject/transfer/copier/PortabilityInMemoryDataCopier.java`
#### Snippet
```java
                new ExportInformation(
                    continuationData.getPaginationData(),
                    exportInfo.isPresent() ? exportInfo.get().getContainerResource() : null)));
      }

```

## RuleId[ruleID=RedundantLengthCheck]
### RuleId[ruleID=RedundantLengthCheck]
Redundant array length check
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/music/GoogleMusicExporter.java`
#### Snippet
```java
    ContinuationData continuationData = new ContinuationData(nextPageData);

    if (googlePlaylists != null && googlePlaylists.length > 0) {
      for (GooglePlaylist googlePlaylist : googlePlaylists) {
        MusicPlaylist musicPlaylist =
```

### RuleId[ruleID=RedundantLengthCheck]
Redundant array length check
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/photos/GooglePhotosExporter.java`
#### Snippet
```java
    ContinuationData continuationData = new ContinuationData(nextPageData);

    if (googleAlbums != null && googleAlbums.length > 0) {
      for (GoogleAlbum googleAlbum : googleAlbums) {
        // Add album info to list so album can be recreated later
```

### RuleId[ruleID=RedundantLengthCheck]
Redundant array length check
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/photos/MicrosoftPhotosExporter.java`
#### Snippet
```java
    List<PhotoModel> photos = new ArrayList<>();

    if (driveItems != null && driveItems.length > 0) {
      for (MicrosoftDriveItem driveItem : driveItems) {
        PhotoAlbum album = tryConvertDriveItemToPhotoAlbum(driveItem, jobId);
```

### RuleId[ruleID=RedundantLengthCheck]
Redundant array length check
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/media/MicrosoftMediaExporter.java`
#### Snippet
```java
    List<VideoModel> videos = new ArrayList<>();

    if (driveItems != null && driveItems.length > 0) {
      for (MicrosoftDriveItem driveItem : driveItems) {
        MediaAlbum album = tryConvertDriveItemToMediaAlbum(driveItem, jobId);
```

## RuleId[ruleID=Java8MapForEach]
### RuleId[ruleID=Java8MapForEach]
Can be replaced with 'Map.forEach()'
in `extensions/data-transfer/portability-data-transfer-deezer/src/main/java/org/datatransferproject/transfer/deezer/DeezerApi.java`
#### Snippet
```java
    HttpRequestFactory requestFactory = httpTransport.createRequestFactory();
    StringBuilder extraArgs = new StringBuilder();
    params.entrySet().forEach(entry -> {
      try {
        extraArgs
```

## RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `ConfigUtils` has only 'static' members, and lacks a 'private' constructor
in `libraries/config/src/main/java/org/datatransferproject/config/ConfigUtils.java`
#### Snippet
```java
 * Common utilities for parsing configuration from files on the classpath.
 */
public class ConfigUtils {
  /**
   * Concatenates {@link InputStream}s to multiple configuration files on the classpath into a
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `OAuthUtils` has only 'static' members, and lacks a 'private' constructor
in `libraries/auth/src/main/java/org/datatransferproject/auth/OAuthUtils.java`
#### Snippet
```java
 * Util class for making OAuth requests and parsing the responses
 */
class OAuthUtils {

  static String makeRawPostRequest(HttpTransport httpTransport, String url, HttpContent httpContent)
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `FlickrUtils` has only 'static' members, and lacks a 'private' constructor
in `extensions/data-transfer/portability-data-transfer-flickr/src/main/java/org/datatransferproject/datatransfer/flickr/photos/FlickrUtils.java`
#### Snippet
```java
import org.scribe.model.Token;

public class FlickrUtils {
  public static Auth getAuth(AuthData authData, Flickr flickr) throws FlickrException {
    checkArgument(
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `GoogleStaticObjects` has only 'static' members, and lacks a 'private' constructor
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/common/GoogleStaticObjects.java`
#### Snippet
```java
 * Static objects shared with all Google services.
 */
public final class GoogleStaticObjects {

  public static final String APP_NAME = "Portability";
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `GooglePhotosImportUtils` has only 'static' members, and lacks a 'private' constructor
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/common/GooglePhotosImportUtils.java`
#### Snippet
```java

// TODO(#1144) consider porting this logic to a transmogrify config (and thus deleting this class).
public class GooglePhotosImportUtils {

  public static String cleanAlbumTitle(String originalTitle) {
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `TwitterApiWrapper` has only 'static' members, and lacks a 'private' constructor
in `extensions/data-transfer/portability-data-transfer-twitter/src/main/java/org/datatransferproject/transfer/twitter/TwitterApiWrapper.java`
#### Snippet
```java
import twitter4j.conf.ConfigurationBuilder;

final class TwitterApiWrapper {
  static  Twitter getInstance(
      AppCredentials appCredentials,
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `FacebookTransferUtils` has only 'static' members, and lacks a 'private' constructor
in `extensions/data-transfer/portability-data-transfer-facebook/src/main/java/org/datatransferproject/transfer/facebook/utils/FacebookTransferUtils.java`
#### Snippet
```java
import org.datatransferproject.spi.transfer.types.UserCheckpointedException;

public class FacebookTransferUtils {

  public static FacebookOAuthException handleFacebookOAuthException(FacebookOAuthException e)
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `ActionUtils` has only 'static' members, and lacks a 'private' constructor
in `portability-api/src/main/java/org/datatransferproject/api/action/ActionUtils.java`
#### Snippet
```java

/** Helper functions for validating action related data. */
public final class ActionUtils {

  public static String encodeJobId(UUID jobId) {
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `JobMetadata` has only 'static' members, and lacks a 'private' constructor
in `portability-transfer/src/main/java/org/datatransferproject/transfer/JobMetadata.java`
#### Snippet
```java
@SuppressWarnings("WeakerAccess")
// We make the class and various methods public so they can be accessed from Monitors
public final class JobMetadata {
  private static byte[] encodedPrivateKey = null;
  private static UUID jobId = null;
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `SecurityExtensionLoader` has only 'static' members, and lacks a 'private' constructor
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/security/SecurityExtensionLoader.java`
#### Snippet
```java

/** Helper for loading the security extensions in a runtime. */
public class SecurityExtensionLoader {

  public static SecurityExtension getSecurityExtension(ExtensionContext context) {
```

## RuleId[ruleID=DataFlowIssue]
### RuleId[ruleID=DataFlowIssue]
Argument `album.getName()` might be null
in `extensions/data-transfer/portability-data-transfer-imgur/src/main/java/org/datatransferproject/datatransfer/imgur/photos/ImgurPhotosImporter.java`
#### Snippet
```java
    requestBuilder.header("Authorization", "Bearer " + authData.getAccessToken());

    FormBody.Builder builder = new FormBody.Builder().add("title", album.getName());
    if (!Strings.isNullOrEmpty(description)) {
      builder.add("description", description);
```

### RuleId[ruleID=DataFlowIssue]
Dereference of `items` may produce `NullPointerException`
in `extensions/data-transfer/portability-data-transfer-imgur/src/main/java/org/datatransferproject/datatransfer/imgur/photos/ImgurPhotosExporter.java`
#### Snippet
```java
    boolean hasMore = (items != null && items.size() != 0);

    for (Map<String, Object> item : items) {
      String photoId = (String) item.get("id");

```

### RuleId[ruleID=DataFlowIssue]
Dereference of `items` may produce `NullPointerException`
in `extensions/data-transfer/portability-data-transfer-imgur/src/main/java/org/datatransferproject/datatransfer/imgur/photos/ImgurPhotosExporter.java`
#### Snippet
```java
    boolean hasMore = (items != null && items.size() != 0);

    for (Map<String, Object> item : items) {
      albumBuilder.add(
          new PhotoAlbum(
```

### RuleId[ruleID=DataFlowIssue]
Dereference of `items` may produce `NullPointerException`
in `extensions/data-transfer/portability-data-transfer-imgur/src/main/java/org/datatransferproject/datatransfer/imgur/photos/ImgurPhotosExporter.java`
#### Snippet
```java

    List<Map<String, Object>> items = requestData(authData, url);
    for (Map<String, Object> item : items) {
      PhotoModel photoModel =
          new PhotoModel(
```

### RuleId[ruleID=DataFlowIssue]
Argument `album.getName()` might be null
in `extensions/data-transfer/portability-data-transfer-koofr/src/main/java/org/datatransferproject/transfer/koofr/videos/KoofrVideosImporter.java`
#### Snippet
```java
  private String createAlbumFolder(VideoAlbum album, KoofrClient koofrClient)
      throws IOException, InvalidTokenException {
    String albumName = KoofrTransmogrificationConfig.getAlbumName(album.getName());

    monitor.debug(() -> String.format("Create Koofr folder %s", albumName));
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `byteStream` may produce `NullPointerException`
in `extensions/data-transfer/portability-data-transfer-koofr/src/main/java/org/datatransferproject/transfer/koofr/common/KoofrClient.java`
#### Snippet
```java

      try (final Reader bodyReader =
              new InputStreamReader(body.byteStream(), StandardCharsets.UTF_8);
          final BufferedReader bufferedBodyReader = new BufferedReader(bodyReader); ) {
        String line;
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `bytes` may produce `NullPointerException`
in `extensions/data-transfer/portability-data-transfer-koofr/src/main/java/org/datatransferproject/transfer/koofr/common/KoofrClient.java`
#### Snippet
```java
      }

      Map<String, Object> responseData = objectMapper.readValue(body.bytes(), Map.class);
      String newName = (String) responseData.get("name");
      Preconditions.checkState(
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `bytes` may produce `NullPointerException`
in `extensions/data-transfer/portability-data-transfer-koofr/src/main/java/org/datatransferproject/transfer/koofr/common/KoofrClient.java`
#### Snippet
```java
      }

      Map<String, Object> responseData = objectMapper.readValue(body.bytes(), Map.class);

      return (String) responseData.get("link");
```

### RuleId[ruleID=DataFlowIssue]
Argument `album.getName()` might be null
in `extensions/data-transfer/portability-data-transfer-koofr/src/main/java/org/datatransferproject/transfer/koofr/photos/KoofrPhotosImporter.java`
#### Snippet
```java
  private String createAlbumFolder(PhotoAlbum album, KoofrClient koofrClient)
      throws IOException, InvalidTokenException {
    String albumName = KoofrTransmogrificationConfig.getAlbumName(album.getName());

    monitor.debug(() -> String.format("Create Koofr folder %s", albumName));
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `createCredential` may produce `NullPointerException`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/gplus/GooglePlusExporter.java`
#### Snippet
```java

  private synchronized Plus makePlusService(TokensAndUrlAuthData authData) {
    Credential credential = credentialFactory.createCredential(authData);
    return new Plus.Builder(
            credentialFactory.getHttpTransport(), credentialFactory.getJsonFactory(), credential)
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `createCredential` may produce `NullPointerException`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/contacts/GoogleContactsImporter.java`
#### Snippet
```java

  private synchronized PeopleService makePeopleService(TokensAndUrlAuthData authData) {
    Credential credential = credentialFactory.createCredential(authData);
    return new PeopleService.Builder(
            credentialFactory.getHttpTransport(), credentialFactory.getJsonFactory(), credential)
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `createCredential` may produce `NullPointerException`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/contacts/GoogleContactsExporter.java`
#### Snippet
```java

  private synchronized PeopleService makePeopleService(TokensAndUrlAuthData authData) {
    Credential credential = credentialFactory.createCredential(authData);
    return new PeopleService.Builder(
        credentialFactory.getHttpTransport(), credentialFactory.getJsonFactory(), credential)
```

### RuleId[ruleID=DataFlowIssue]
Argument `inputVideo.getName()` might be null
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/videos/GoogleVideosImporter.java`
#### Snippet
```java
      UploadMediaItemRequest uploadRequest =
          UploadMediaItemRequest.newBuilder()
              .setFileName(inputVideo.getName())
              .setDataFile(new RandomAccessFile(tmp, "r"))
              .build();
```

### RuleId[ruleID=DataFlowIssue]
The call to 'checkArgument' always fails, according to its method contracts
in `extensions/data-transfer/portability-data-transfer-instagram/src/main/java/org/datatransferproject/transfer/instagram/InstagramTransferExtension.java`
#### Snippet
```java
    Preconditions.checkArgument(
        initialized, "InstagramTransferExtension not initialized. Unable to get Importer");
    Preconditions.checkArgument(false, "Instagram does not support import");
    return null;
  }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `string` may produce `NullPointerException`
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/media/MicrosoftMediaImporter.java`
#### Snippet
```java
              + "bearer token: %s\n"
              + " item: %s\n", // For debugging 404s on upload
          code, response.message(), response.body().string(), reqResp.getLeft().url(),
          credential.getAccessToken(), item));
    } else if (code != 200) {
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `string` may produce `NullPointerException`
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/media/MicrosoftMediaImporter.java`
#### Snippet
```java
    } else if (chunkCode < 200 || chunkCode > 299) {
      throw new IOException("Got error code: " + chunkCode + " message: " + chunkResponse.message()
          + " body: " + chunkResponse.body().string());
    } else if (chunkCode == 200 || chunkCode == 201 || chunkCode == 202) {
      monitor.info(()
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `string` may produce `NullPointerException`
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/media/MicrosoftMediaImporter.java`
#### Snippet
```java
      } else if (code < 200 || code > 299) {
        throw new IOException("Got error code: " + code + " message: " + response.message()
            + " body: " + response.body().string());
      } else if (body == null) {
        throw new IOException("Got null body");
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `code` may produce `NullPointerException`
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/media/MicrosoftMediaImporter.java`
#### Snippet
```java
      chunkResponse = uploadChunk(chunk, itemUploadUrl, totalFileSize, item.getMimeType());
    }
    if (chunkResponse.code() != 200 && chunkResponse.code() != 201) {
      // Once we upload the last chunk, we should have either 200 or 201.
      // This should change to a precondition check after we debug some more.
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `bytes` may produce `NullPointerException`
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/media/MicrosoftMediaImporter.java`
#### Snippet
```java
    ResponseBody chunkResponseBody = chunkResponse.body();
    Map<String, Object> chunkResponseData =
        objectMapper.readValue(chunkResponseBody.bytes(), Map.class);
    return (String) chunkResponseData.get("id");
  }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `string` may produce `NullPointerException`
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/photos/MicrosoftPhotosImporter.java`
#### Snippet
```java
                + response.message()
                + " body: "
                + response.body().string());
      } else if (body == null) {
        throw new IOException("Got null body");
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `string` may produce `NullPointerException`
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/photos/MicrosoftPhotosImporter.java`
#### Snippet
```java
              code,
              response.message(),
              response.body().string(),
              createSessionUrl,
              credential.getAccessToken(),
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `code` may produce `NullPointerException`
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/photos/MicrosoftPhotosImporter.java`
#### Snippet
```java
      chunkResponse = uploadChunk(chunk, photoUploadUrl, totalFileSize, photo.getMediaType());
    }
    if (chunkResponse.code() != 200 && chunkResponse.code() != 201) {
      // Once we upload the last chunk, we should have either 200 or 201.
      // This should change to a precondition check after we debug some more.
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `bytes` may produce `NullPointerException`
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/photos/MicrosoftPhotosImporter.java`
#### Snippet
```java
    // get complete file response
    ResponseBody chunkResponseBody = chunkResponse.body();
    Map<String, Object> chunkResponseData = objectMapper.readValue(chunkResponseBody.bytes(), Map.class);
    return (String) chunkResponseData.get("id");
  }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `string` may produce `NullPointerException`
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/photos/MicrosoftPhotosImporter.java`
#### Snippet
```java
              + chunkResponse.message()
              + " body: "
              + chunkResponse.body().string());
    } else if (chunkCode == 200 || chunkCode == 201 || chunkCode == 202) {
      monitor.info(
```

### RuleId[ruleID=DataFlowIssue]
Argument `encodedSessionKey` might be null
in `portability-api/src/main/java/org/datatransferproject/api/action/transfer/GenerateServiceAuthDataAction.java`
#### Snippet
```java
      String encodedSessionKey = job.jobAuthorization().sessionSecretKey();
      SecretKey key =
          symmetricKeyGenerator.parse(BaseEncoding.base64Url().decode(encodedSessionKey));

      // Retrieve initial auth data, if it existed
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `chars` may produce `NullPointerException`
in `portability-types-common/src/main/java/org/datatransferproject/types/common/models/videos/VideoModel.java`
#### Snippet
```java
  // remove all forbidden characters
  public void cleanName(String forbiddenCharacters, char replacementCharacter, int maxLength) {
    String name = getName().chars()
        .mapToObj(c -> (char) c)
        .map(c -> forbiddenCharacters.contains(Character.toString(c)) ? replacementCharacter : c)
```

## RuleId[ruleID=UnnecessarySemicolon]
### RuleId[ruleID=UnnecessarySemicolon]
Unnecessary semicolon `;`
in `libraries/auth/src/main/java/org/datatransferproject/auth/OAuth1Config.java`
#### Snippet
```java
    REQUEST_TOKEN,
    AUTHORIZATION,
    ACCESS_TOKEN;
  }
}
```

### RuleId[ruleID=UnnecessarySemicolon]
Unnecessary semicolon `;`
in `extensions/data-transfer/portability-data-transfer-koofr/src/main/java/org/datatransferproject/transfer/koofr/common/KoofrClient.java`
#### Snippet
```java
      try (final Reader bodyReader =
              new InputStreamReader(body.byteStream(), StandardCharsets.UTF_8);
          final BufferedReader bufferedBodyReader = new BufferedReader(bodyReader); ) {
        String line;
        List<FilesListRecursiveItem> items = new ArrayList<FilesListRecursiveItem>();
```

### RuleId[ruleID=UnnecessarySemicolon]
Unnecessary semicolon `;`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/mediaModels/Video.java`
#### Snippet
```java
    PROCESSING,
    READY,
    FAILED;
  }
}
```

### RuleId[ruleID=UnnecessarySemicolon]
Unnecessary semicolon `;`
in `portability-types-common/src/main/java/org/datatransferproject/types/common/models/calendar/RecurrenceRule.java`
#### Snippet
```java
    DATE,
    PERIOD,
    UNDEFINED;
  }

```

## RuleId[ruleID=SimplifyStreamApiCallChains]
### RuleId[ruleID=SimplifyStreamApiCallChains]
Can be replaced with 'java.util.ArrayList' constructor
in `extensions/auth/portability-auth-rememberthemilk/src/main/java/org/datatransferproject/auth/rememberthemilk/RememberTheMilkSignatureGenerator.java`
#### Snippet
```java
    modifiedParams.put("api_key", appCredentials.getKey());

    List<String> orderedKeys = modifiedParams.keySet().stream().collect(Collectors.toList());
    Collections.sort(orderedKeys);

```

### RuleId[ruleID=SimplifyStreamApiCallChains]
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `extensions/data-transfer/portability-data-transfer-solid/src/main/java/org/datatransferproject/transfer/solid/contacts/SolidContactsImport.java`
#### Snippet
```java

    for (Organization organization : vcard.getOrganizations()) {
      organization.getValues().stream().forEach(
          v -> r.addProperty(VCARD4.hasOrganizationName, v));
    }
```

### RuleId[ruleID=SimplifyStreamApiCallChains]
Can be replaced with 'java.util.ArrayList' constructor
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/videos/GoogleVideosInterface.java`
#### Snippet
```java
    updatedParams.put(ACCESS_TOKEN_KEY, Preconditions.checkNotNull(credential.getAccessToken()));

    List<String> orderedKeys = updatedParams.keySet().stream().collect(Collectors.toList());
    Collections.sort(orderedKeys);

```

### RuleId[ruleID=SimplifyStreamApiCallChains]
Can be replaced with 'java.util.ArrayList' constructor
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/music/GoogleMusicHttpApi.java`
#### Snippet
```java

    List<String> orderedKeys =
        updatedParams.keySet().stream().collect(toCollection(ArrayList::new));
    Collections.sort(orderedKeys);

```

### RuleId[ruleID=SimplifyStreamApiCallChains]
Can be replaced with 'java.util.ArrayList' constructor
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/photos/GooglePhotosInterface.java`
#### Snippet
```java
    updatedParams.put(ACCESS_TOKEN_KEY, Preconditions.checkNotNull(credential.getAccessToken()));

    List<String> orderedKeys = updatedParams.keySet().stream().collect(Collectors.toList());
    Collections.sort(orderedKeys);

```

### RuleId[ruleID=SimplifyStreamApiCallChains]
Can be replaced with 'java.util.ArrayList' constructor
in `extensions/data-transfer/portability-data-transfer-rememberthemilk/src/main/java/org/datatransferproject/transfer/rememberthemilk/tasks/RememberTheMilkSignatureGenerator.java`
#### Snippet
```java
    modifiedParams.put("auth_token", authToken);

    List<String> orderedKeys = modifiedParams.keySet().stream().collect(Collectors.toList());
    Collections.sort(orderedKeys);

```

### RuleId[ruleID=SimplifyStreamApiCallChains]
Can be replaced with 'java.util.ArrayList' constructor
in `portability-types-common/src/main/java/org/datatransferproject/types/common/models/media/MediaContainerResource.java`
#### Snippet
```java

    if (usedRootAlbum) {
      List<MediaAlbum> tempMutableAlbums = this.albums.stream().collect(Collectors.toList());
      tempMutableAlbums.add(rootAlbum);
      this.albums = ImmutableList.copyOf(tempMutableAlbums);
```

## RuleId[ruleID=StringOperationCanBeSimplified]
### RuleId[ruleID=StringOperationCanBeSimplified]
Call to `toString()` is redundant
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/blogger/GoogleBloggerImporter.java`
#### Snippet
```java
      throws IOException {
    String url;
    url = imageObject.getUrl().toString();

    String description =
```

### RuleId[ruleID=StringOperationCanBeSimplified]
`toLowerCase()` call can be replaced with 'equalsIgnoreCase()'
in `portability-transfer/src/main/java/org/datatransferproject/transfer/WorkerModule.java`
#### Snippet
```java
      return transferExtensions
          .stream()
          .filter(ext -> ext.getServiceId().toLowerCase().equals(service.toLowerCase()))
          .collect(onlyElement());
    } catch (IllegalArgumentException e) {
```

## RuleId[ruleID=DeprecatedIsStillUsed]
### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'setSessionSecretKey' is still used
in `portability-spi-cloud/src/main/java/org/datatransferproject/spi/cloud/types/JobAuthorization.java`
#### Snippet
```java
    @Deprecated
    @JsonProperty("sessionSecretKey")
    public abstract Builder setSessionSecretKey(String sessionSecretKey);

    /**
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'sessionSecretKey' is still used
in `portability-spi-cloud/src/main/java/org/datatransferproject/spi/cloud/types/JobAuthorization.java`
#### Snippet
```java
  @Nullable
  @JsonProperty("sessionSecretKey")
  public abstract String sessionSecretKey();

  /** The PublicKey of the 'transfer worker' instance assigned to this job, encoded for storage. */
```

## RuleId[ruleID=OptionalContainsCollection]
### RuleId[ruleID=OptionalContainsCollection]
'Optional' contains collection `Stack`
in `extensions/copier/portability-stack-copier/src/main/java/org/datatransferproject/copier/stack/PortabilityStackInMemoryDataCopier.java`
#### Snippet
```java
    String jobIdPrefix = "Job " + jobId + ": ";

    Optional<Stack<ExportInformation>> maybeLoadedStack = jobStore.loadJobStack(jobId);

    if (maybeLoadedStack.isPresent()) {
```

### RuleId[ruleID=OptionalContainsCollection]
'Optional' contains collection `Map`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/videos/GoogleVideosInterface.java`
#### Snippet
```java
  }

  private String generateParamsString(Optional<Map<String, String>> params) throws IOException {
    Map<String, String> updatedParams = new ArrayMap<>();
    if (params.isPresent()) {
```

### RuleId[ruleID=OptionalContainsCollection]
'Optional' contains collection `Map`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/videos/GoogleVideosInterface.java`
#### Snippet
```java

  <T> T makePostRequest(
      String url, Optional<Map<String, String>> parameters, HttpContent httpContent, Class<T> clazz)
      throws IOException {
    HttpRequestFactory requestFactory = httpTransport.createRequestFactory();
```

### RuleId[ruleID=OptionalContainsCollection]
'Optional' contains collection `Map`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/music/GoogleMusicHttpApi.java`
#### Snippet
```java

  private <T> T makeGetRequest(
      String baseUrl, Optional<Map<String, String>> parameters, Class<T> clazz)
      throws IOException, InvalidTokenException, PermissionDeniedException {
    HttpRequestFactory requestFactory = httpTransport.createRequestFactory();
```

### RuleId[ruleID=OptionalContainsCollection]
'Optional' contains collection `Map`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/music/GoogleMusicHttpApi.java`
#### Snippet
```java
  private <T> T makePostRequest(
      String baseUrl,
      Optional<Map<String, String>> parameters,
      HttpContent httpContent,
      Class<T> clazz)
```

### RuleId[ruleID=OptionalContainsCollection]
'Optional' contains collection `Map`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/music/GoogleMusicHttpApi.java`
#### Snippet
```java
  private <T> T makePutRequest(
      String baseUrl,
      Optional<Map<String, String>> parameters,
      HttpContent httpContent,
      Class<T> clazz)
```

### RuleId[ruleID=OptionalContainsCollection]
'Optional' contains collection `Map`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/music/GoogleMusicHttpApi.java`
#### Snippet
```java
  }

  private String generateParamsString(Optional<Map<String, String>> params) {
    Map<String, String> updatedParams = new ArrayMap<>();
    if (params.isPresent()) {
```

### RuleId[ruleID=OptionalContainsCollection]
'Optional' contains collection `Map`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/photos/GooglePhotosInterface.java`
#### Snippet
```java
  }

  <T> T makePostRequest(String url, Optional<Map<String, String>> parameters,
      Optional<Map<String, String>> extraHeaders, HttpContent httpContent, Class<T> clazz)
      throws IOException, InvalidTokenException, PermissionDeniedException, UploadErrorException {
```

### RuleId[ruleID=OptionalContainsCollection]
'Optional' contains collection `Map`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/photos/GooglePhotosInterface.java`
#### Snippet
```java

  <T> T makePostRequest(String url, Optional<Map<String, String>> parameters,
      Optional<Map<String, String>> extraHeaders, HttpContent httpContent, Class<T> clazz)
      throws IOException, InvalidTokenException, PermissionDeniedException, UploadErrorException {
    // Wait for write permit before making request
```

### RuleId[ruleID=OptionalContainsCollection]
'Optional' contains collection `Map`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/photos/GooglePhotosInterface.java`
#### Snippet
```java
  }

  private <T> T makeGetRequest(String url, Optional<Map<String, String>> parameters, Class<T> clazz)
      throws IOException, InvalidTokenException, PermissionDeniedException {
    HttpRequestFactory requestFactory = httpTransport.createRequestFactory();
```

### RuleId[ruleID=OptionalContainsCollection]
'Optional' contains collection `Map`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/photos/GooglePhotosInterface.java`
#### Snippet
```java
  }

  private String generateParamsString(Optional<Map<String, String>> params) {
    Map<String, String> updatedParams = new ArrayMap<>();
    if (params.isPresent()) {
```

### RuleId[ruleID=OptionalContainsCollection]
'Optional' contains collection `Map`
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/media/MicrosoftMediaInterface.java`
#### Snippet
```java

  private <T> T makeGetRequest(
      String url, Optional<Map<String, String>> parameters, Class<T> tClass) throws IOException {
    HttpRequestFactory requestFactory = httpTransport.createRequestFactory();
    if (parameters.isPresent() && parameters.get().size() > 0) {
```

### RuleId[ruleID=OptionalContainsCollection]
'Optional' contains collection `Map`
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/photos/MicrosoftPhotosInterface.java`
#### Snippet
```java

  private <T> T makeGetRequest(
      String url, Optional<Map<String, String>> parameters, Class<T> tClass) throws IOException {
    HttpRequestFactory requestFactory = httpTransport.createRequestFactory();
    if (parameters.isPresent() && parameters.get().size() > 0) {
```

### RuleId[ruleID=OptionalContainsCollection]
'Optional' contains collection `List`
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/transformer/common/TransformerHelper.java`
#### Snippet
```java

  @SuppressWarnings("unchecked")
  public static Optional<List<String>> getList(String key, Map<String, ?> map) {
    return Optional.ofNullable((List<String>) map.get(key));
  }
```

### RuleId[ruleID=OptionalContainsCollection]
'Optional' contains collection `Map`
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/transformer/common/TransformerHelper.java`
#### Snippet
```java

  @SuppressWarnings("unchecked")
  public static Optional<Map<String, String>> getMap(String key, Map<String, ?> map) {
    return Optional.ofNullable((Map<String, String>) map.get(key));
  }
```

### RuleId[ruleID=OptionalContainsCollection]
'Optional' contains collection `List`>
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/transformer/common/TransformerHelper.java`
#### Snippet
```java

  @SuppressWarnings("unchecked")
  public static Optional<List<Map<String, String>>> getListMap(String key, Map<String, ?> map) {
    return Optional.ofNullable((List<Map<String, String>>) map.get(key));
  }
```

### RuleId[ruleID=OptionalContainsCollection]
'Optional' contains collection `Stack`
in `portability-spi-cloud/src/main/java/org/datatransferproject/spi/cloud/storage/JobStore.java`
#### Snippet
```java
   * resume job transfer.
   */
  default Optional<Stack<ExportInformation>> loadJobStack(UUID jobId) {
    return Optional.empty();
  }
```

### RuleId[ruleID=OptionalContainsCollection]
'Optional' contains collection `Map`
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/provider/ImportResult.java`
#### Snippet
```java

  /** Returns the number of imported items or an empty optional if no mapping is present. */
  public Optional<Map<String, Integer>> getCounts() {
    return counts;
  }
```

### RuleId[ruleID=OptionalContainsCollection]
'Optional' contains collection `Map`
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/provider/ImportResult.java`
#### Snippet
```java
  }

  private static Optional<Map<String, Integer>> mergeCounts(ImportResult ir1, ImportResult ir2) {
    if (ir1.counts.isPresent() && ir2.counts.isPresent()) {
      Map<String, Integer> map = new HashMap<>(ir1.counts.get());
```

### RuleId[ruleID=OptionalContainsCollection]
'Optional' contains collection `Map`
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/provider/ImportResult.java`
#### Snippet
```java
  // Throwable should be absent unless an error was thrown during export
  private Optional<Throwable> throwable = Optional.empty();
  private Optional<Map<String, Integer>> counts = Optional.empty();
  private Optional<Long> bytes = Optional.empty();

```

### RuleId[ruleID=OptionalContainsCollection]
'Optional' contains collection `Map`
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/provider/ImportResult.java`
#### Snippet
```java
      ResultType type,
      Optional<Throwable> throwable,
      Optional<Map<String, Integer>> counts,
      Optional<Long> bytes) {
    this.type = type;
```

## RuleId[ruleID=Convert2MethodRef]
### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `libraries/config/src/main/java/org/datatransferproject/config/ConfigUtils.java`
#### Snippet
```java
    return settingsFiles.stream()
        .map(file -> ConfigUtils.class.getClassLoader().getResourceAsStream(file))
        .reduce(null, (in1, in2) -> combineStreams(in1, in2));
  }

```

### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `extensions/data-transfer/portability-data-transfer-flickr/src/main/java/org/datatransferproject/datatransfer/flickr/photos/FlickrPhotosExporter.java`
#### Snippet
```java
        new PhotosContainerResource(albumBuilder.build(), photosBuilder.build());
    ContinuationData continuationData = new ContinuationData(null);
    subResources.forEach(resource -> continuationData.addContainerResource(resource));
    return new ExportResult<>(ResultType.CONTINUE, photosContainerResource, continuationData);
  }
```

### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `extensions/data-transfer/portability-data-transfer-flickr/src/main/java/org/datatransferproject/datatransfer/flickr/photos/FlickrPhotosExporter.java`
#### Snippet
```java
        new PhotosContainerResource(albumBuilder.build(), null);
    ContinuationData continuationData = new ContinuationData(newPage);
    subResources.forEach(resource -> continuationData.addContainerResource(resource));

    // Get result type
```

### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/photos/GooglePhotosExporter.java`
#### Snippet
```java
        new PhotosContainerResource(albumBuilder.build(), photosBuilder.build());
    ContinuationData continuationData = new ContinuationData(null);
    subResources.forEach(resource -> continuationData.addContainerResource(resource));
    return new ExportResult<>(ResultType.CONTINUE, photosContainerResource, continuationData);
  }
```

### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `extensions/data-transfer/portability-data-transfer-backblaze/src/main/java/org/datatransferproject/datatransfer/backblaze/photos/BackblazePhotosImporter.java`
#### Snippet
```java
            album.getId(),
            String.format("Caching album name for album '%s'", album.getId()),
            () -> album.getName());
      }
    }
```

## RuleId[ruleID=NonSynchronizedMethodOverridesSynchronizedMethod]
### RuleId[ruleID=NonSynchronizedMethodOverridesSynchronizedMethod]
Unsynchronized method `getCause()` overrides synchronized method
in `portability-types-transfer/src/main/java/org/datatransferproject/types/transfer/retry/RetryException.java`
#### Snippet
```java

  @Override
  public Exception getCause() {
    return (Exception) super.getCause();
  }
```

## RuleId[ruleID=RedundantCollectionOperation]
### RuleId[ruleID=RedundantCollectionOperation]
Unnecessary 'containsKey()' check
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/types/TempPhotosData.java`
#### Snippet
```java
  // removes the temp photo album
  public void removeTempPhotoAlbum(String key) {
    if (tempPhotoAlbums.containsKey(key)) {
      tempPhotoAlbums.remove(key);
    }
```

### RuleId[ruleID=RedundantCollectionOperation]
Unnecessary 'Arrays.asList()' call
in `portability-types-common/src/main/java/org/datatransferproject/types/common/models/calendar/RecurrenceRule.java`
#### Snippet
```java
  public static RRule parseRRuleString(String rRuleString) {
    RRule.Builder builder = RRule.builder();
    List<String> components = Arrays.asList(rRuleString.split("[;:]"));
    Map<ByRule, String> byRuleMapInput = new HashMap<>();
    for (String property : components) {
```

## RuleId[ruleID=NonSerializableFieldInSerializableClass]
### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'error' in a Serializable class
in `extensions/data-transfer/portability-data-transfer-deezer/src/main/java/org/datatransferproject/transfer/deezer/model/InsertResponse.java`
#### Snippet
```java
public class InsertResponse implements Serializable {
  private long id;
  private Error error;

  public long getId() {
```

### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'mediaItem' in a Serializable class
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/mediaModels/NewMediaItemResult.java`
#### Snippet
```java

  @JsonProperty("mediaItem")
  private GoogleMediaItem mediaItem;

  public Status getStatus() {
```

### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'status' in a Serializable class
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/mediaModels/NewMediaItemResult.java`
#### Snippet
```java

  @JsonProperty("status")
  private Status status;

  @JsonProperty("mediaItem")
```

### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'notes' in a Serializable class
in `extensions/data-transfer/portability-data-transfer-rememberthemilk/src/main/java/org/datatransferproject/transfer/rememberthemilk/model/tasks/TaskSeries.java`
#### Snippet
```java

  @JacksonXmlProperty(localName = "notes")
  public Notes notes;

  @JacksonXmlProperty(localName = "rrule")
```

### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'dtpDigitalDocument' in a Serializable class
in `portability-types-common/src/main/java/org/datatransferproject/types/common/models/blob/DigitalDocumentWrapper.java`
#### Snippet
```java
public class DigitalDocumentWrapper extends DataModel {

  private final DtpDigitalDocument dtpDigitalDocument;
  private final String originalEncodingFormat;
  // This isn't in the schema.org spec and is only needed to store the bytes DTP will transfer
```

### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'actor' in a Serializable class
in `portability-types-common/src/main/java/org/datatransferproject/types/common/models/social/SocialActivityContainerResource.java`
#### Snippet
```java
  private final String id;
  private final Collection<SocialActivityModel> activities;
  private SocialActivityActor actor;

  @JsonCreator
```

## RuleId[ruleID=UnnecessaryToStringCall]
### RuleId[ruleID=UnnecessaryToStringCall]
Unnecessary `toString()` call
in `extensions/data-transfer/portability-data-transfer-solid/src/main/java/org/datatransferproject/transfer/solid/contacts/SolidContactsExport.java`
#### Snippet
```java
      Resource personResource = SolidUtilities.getResource(subject.getURI(), personModel);
      if (personResource == null) {
        throw new IllegalStateException(subject.getURI() + " not found in " + subject.toString());
      }
      vcards.add(parsePerson(personResource));
```

### RuleId[ruleID=UnnecessaryToStringCall]
Unnecessary `toString()` call
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/blogger/GoogleBloggerImporter.java`
#### Snippet
```java
    File fileMetadata = new File();
    LocalDate localDate = LocalDate.now();
    fileMetadata.setName("(Public)Imported Images on: " + localDate.toString());
    fileMetadata.setMimeType("application/vnd.google-apps.folder");
    File folder = driveInterface.files().create(fileMetadata).setFields("id").execute();
```

### RuleId[ruleID=UnnecessaryToStringCall]
Unnecessary `toString()` call
in `portability-api-launcher/src/main/java/org/datatransferproject/launcher/monitor/ConsoleMonitor.java`
#### Snippet
```java
          ((Throwable) datum).printStackTrace(System.out);
        } else if (datum instanceof UUID) {
          System.out.println("JobId: " + ((UUID)datum).toString());
        } else if (datum instanceof EventCode) {
          System.out.println("EventCode: " + datum.toString());
```

### RuleId[ruleID=UnnecessaryToStringCall]
Unnecessary `toString()` call
in `portability-api-launcher/src/main/java/org/datatransferproject/launcher/monitor/ConsoleMonitor.java`
#### Snippet
```java
          System.out.println("JobId: " + ((UUID)datum).toString());
        } else if (datum instanceof EventCode) {
          System.out.println("EventCode: " + datum.toString());
        } else if (datum != null) {
          System.out.println(datum);
```

## RuleId[ruleID=InnerClassMayBeStatic]
### RuleId[ruleID=InnerClassMayBeStatic]
Inner class `JettyErrorHandler` may be 'static'
in `extensions/transport/portability-transport-jettyrest/src/main/java/org/datatransferproject/transport/jettyrest/http/JettyTransport.java`
#### Snippet
```java
  }

  private class JettyErrorHandler extends ErrorHandler {

    protected void writeErrorPage(
```

### RuleId[ruleID=InnerClassMayBeStatic]
Inner class `TransformKey` may be 'static'
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/transformer/TransformerServiceImpl.java`
#### Snippet
```java
  }

  private class TransformKey {
    private Class<?> from;
    private Class<?> to;
```

## RuleId[ruleID=WrongPackageStatement]
### RuleId[ruleID=WrongPackageStatement]
Package name 'org.datatransferproject.types.transfer.models' does not correspond to the file path 'org.datatransferproject.types.common.models'
in `portability-types-common/src/main/java/org/datatransferproject/types/common/models/ItemResource.java`
#### Snippet
```java
package org.datatransferproject.types.transfer.models;

import org.datatransferproject.types.common.models.DataModel;
```

## RuleId[ruleID=StringEqualsEmptyString]
### RuleId[ruleID=StringEqualsEmptyString]
`equals("")` can be replaced with 'isEmpty()'
in `extensions/data-transfer/portability-data-transfer-koofr/src/main/java/org/datatransferproject/transfer/koofr/KoofrTransmogrificationConfig.java`
#### Snippet
```java
  public static String getAlbumName(String name) {
    // if all characters were forbidden, the name can be empty
    if (name.equals("")) {
      return ALBUM_NAME_DEFAULT;
    }
```

## RuleId[ruleID=RedundantSuppression]
### RuleId[ruleID=RedundantSuppression]
Redundant suppression
in `extensions/data-transfer/portability-data-transfer-koofr/src/main/java/org/datatransferproject/transfer/koofr/common/KoofrClient.java`
#### Snippet
```java

  @SuppressWarnings("unchecked")
  public List<FilesListRecursiveItem> listRecursive(String path)
      throws IOException, InvalidTokenException {
    String url;
```

### RuleId[ruleID=RedundantSuppression]
Redundant suppression
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/calendar/MicrosoftCalendarImporter.java`
#### Snippet
```java
  @SuppressWarnings("unchecked")
  @Override
  public ImportResult importItem(
      UUID jobId,
      IdempotentImportExecutor idempotentImportExecutor,
```

### RuleId[ruleID=RedundantSuppression]
Redundant suppression
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/offline/MicrosoftOfflineDataExporter.java`
#### Snippet
```java

  @SuppressWarnings("unchecked")
  private String getDataFile(UUID jobId, String url, TokenAuthData authData) throws IOException {
    Request.Builder requestBuilder = new Request.Builder().url(url);
    requestBuilder.header("Authorization", "Bearer " + authData.getToken());
```

### RuleId[ruleID=RedundantSuppression]
Redundant suppression
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/transformer/contacts/ToVCardTransformer.java`
#### Snippet
```java
  @Override
  @SuppressWarnings("unchecked")
  public VCard apply(Map<String, Object> map, TransformerContext context) {
    VCard card = new VCard();

```

### RuleId[ruleID=RedundantSuppression]
Redundant suppression
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/transformer/contacts/ToVCardTransformer.java`
#### Snippet
```java

  @SuppressWarnings("unchecked")
  private void copyEmail(Map<String, Object> map, VCard card) {
    getListMap("emailAddresses", map)
        .ifPresent(
```

### RuleId[ruleID=RedundantSuppression]
Redundant suppression
in `extensions/transport/portability-transport-jettyrest/src/main/java/org/datatransferproject/transport/jettyrest/rest/JerseyTransportBinder.java`
#### Snippet
```java
  @Override
  @SuppressWarnings("unchecked")
  public <T> void bind(Action<T, ?> action) {
    actions.put(action.getRequestType(), action);
  }
```

## RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'paginationData'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/tasks/GoogleTasksExporter.java`
#### Snippet
```java

  private ExportResult<TaskContainerResource> getTasks(
      Tasks tasksService, IdOnlyContainerResource resource, Optional<PaginationData> paginationData)
      throws IOException {
    Tasks.TasksOperations.List query =
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'paginationData'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/tasks/GoogleTasksExporter.java`
#### Snippet
```java

  private ExportResult<TaskContainerResource> getTasksList(
      Tasks tasksService, Optional<PaginationData> paginationData) throws IOException {
    Tasks.Tasklists.List query = tasksService.tasklists().list().setMaxResults(PAGE_SIZE);
    if (paginationData.isPresent()) {
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'paginationData'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/videos/GoogleVideosExporter.java`
#### Snippet
```java
  @VisibleForTesting
  ExportResult<VideosContainerResource> exportVideos(
          TokensAndUrlAuthData authData, Optional<StringPaginationToken> paginationData)
          throws IOException {

```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'paginationData'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/music/GoogleMusicExporter.java`
#### Snippet
```java
      TokensAndUrlAuthData authData,
      IdOnlyContainerResource playlistData,
      Optional<PaginationData> paginationData)
      throws IOException, InvalidTokenException, PermissionDeniedException {
    String playlistId = playlistData.getId();
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'paginationData'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/music/GoogleMusicExporter.java`
#### Snippet
```java
  @VisibleForTesting
  ExportResult<MusicContainerResource> exportPlaylists(
      TokensAndUrlAuthData authData, Optional<PaginationData> paginationData, UUID jobId)
      throws IOException, InvalidTokenException, PermissionDeniedException {
    Optional<String> paginationToken = Optional.empty();
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional`> used as type for parameter 'params'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/videos/GoogleVideosInterface.java`
#### Snippet
```java
  }

  private String generateParamsString(Optional<Map<String, String>> params) throws IOException {
    Map<String, String> updatedParams = new ArrayMap<>();
    if (params.isPresent()) {
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'pageToken'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/videos/GoogleVideosInterface.java`
#### Snippet
```java
  }

  MediaItemSearchResponse listVideoItems(Optional<String> pageToken) throws IOException {
    Map<String, Object> params = new LinkedHashMap<>();
    params.put(PAGE_SIZE_KEY, String.valueOf(MEDIA_PAGE_SIZE));
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional`> used as type for parameter 'parameters'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/videos/GoogleVideosInterface.java`
#### Snippet
```java

  <T> T makePostRequest(
      String url, Optional<Map<String, String>> parameters, HttpContent httpContent, Class<T> clazz)
      throws IOException {
    HttpRequestFactory requestFactory = httpTransport.createRequestFactory();
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional`> used as type for parameter 'parameters'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/music/GoogleMusicHttpApi.java`
#### Snippet
```java

  private <T> T makeGetRequest(
      String baseUrl, Optional<Map<String, String>> parameters, Class<T> clazz)
      throws IOException, InvalidTokenException, PermissionDeniedException {
    HttpRequestFactory requestFactory = httpTransport.createRequestFactory();
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional`> used as type for parameter 'parameters'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/music/GoogleMusicHttpApi.java`
#### Snippet
```java
  private <T> T makePostRequest(
      String baseUrl,
      Optional<Map<String, String>> parameters,
      HttpContent httpContent,
      Class<T> clazz)
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional`> used as type for parameter 'parameters'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/music/GoogleMusicHttpApi.java`
#### Snippet
```java
  private <T> T makePutRequest(
      String baseUrl,
      Optional<Map<String, String>> parameters,
      HttpContent httpContent,
      Class<T> clazz)
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'pageToken'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/music/GoogleMusicHttpApi.java`
#### Snippet
```java
  }

  PlaylistListResponse listPlaylists(Optional<String> pageToken)
      throws IOException, InvalidTokenException, PermissionDeniedException {
    Map<String, String> params = new LinkedHashMap<>();
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'pageToken'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/music/GoogleMusicHttpApi.java`
#### Snippet
```java
  }

  PlaylistItemListResponse listPlaylistItems(String playlistId, Optional<String> pageToken)
      throws IOException, InvalidTokenException, PermissionDeniedException {
    Map<String, String> params = new LinkedHashMap<>();
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional`> used as type for parameter 'params'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/music/GoogleMusicHttpApi.java`
#### Snippet
```java
  }

  private String generateParamsString(Optional<Map<String, String>> params) {
    Map<String, String> updatedParams = new ArrayMap<>();
    if (params.isPresent()) {
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'albumId'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/photos/GooglePhotosExporter.java`
#### Snippet
```java

  private List<PhotoModel> convertPhotosList(
      Optional<String> albumId, GoogleMediaItem[] mediaItems, UUID jobId) throws IOException {
    List<PhotoModel> photos = new ArrayList<>(mediaItems.length);

```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'paginationData'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/photos/GooglePhotosExporter.java`
#### Snippet
```java
  @VisibleForTesting
  ExportResult<PhotosContainerResource> exportAlbums(
      TokensAndUrlAuthData authData, Optional<PaginationData> paginationData, UUID jobId)
      throws IOException, InvalidTokenException, PermissionDeniedException {
    Optional<String> paginationToken = Optional.empty();
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'paginationData'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/photos/GooglePhotosExporter.java`
#### Snippet
```java
  }

  private Optional<String> getPhotosPaginationToken(Optional<PaginationData> paginationData) {
    Optional<String> paginationToken = Optional.empty();
    if (paginationData.isPresent()) {
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'albumId'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/photos/GooglePhotosExporter.java`
#### Snippet
```java
  }

  private PhotoModel convertToPhotoModel(Optional<String> albumId, GoogleMediaItem mediaItem) {
    Preconditions.checkArgument(mediaItem.getMediaMetadata().getPhoto() != null);

```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'albumData'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/photos/GooglePhotosExporter.java`
#### Snippet
```java
  ExportResult<PhotosContainerResource> exportPhotos(
      TokensAndUrlAuthData authData,
      Optional<IdOnlyContainerResource> albumData,
      Optional<PaginationData> paginationData,
      UUID jobId)
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'paginationData'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/photos/GooglePhotosExporter.java`
#### Snippet
```java
      TokensAndUrlAuthData authData,
      Optional<IdOnlyContainerResource> albumData,
      Optional<PaginationData> paginationData,
      UUID jobId)
      throws IOException, InvalidTokenException, PermissionDeniedException, UploadErrorException {
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional`> used as type for parameter 'parameters'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/photos/GooglePhotosInterface.java`
#### Snippet
```java
  }

  <T> T makePostRequest(String url, Optional<Map<String, String>> parameters,
      Optional<Map<String, String>> extraHeaders, HttpContent httpContent, Class<T> clazz)
      throws IOException, InvalidTokenException, PermissionDeniedException, UploadErrorException {
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional`> used as type for parameter 'extraHeaders'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/photos/GooglePhotosInterface.java`
#### Snippet
```java

  <T> T makePostRequest(String url, Optional<Map<String, String>> parameters,
      Optional<Map<String, String>> extraHeaders, HttpContent httpContent, Class<T> clazz)
      throws IOException, InvalidTokenException, PermissionDeniedException, UploadErrorException {
    // Wait for write permit before making request
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'albumId'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/photos/GooglePhotosInterface.java`
#### Snippet
```java
  }

  MediaItemSearchResponse listMediaItems(Optional<String> albumId, Optional<String> pageToken)
      throws IOException, InvalidTokenException, PermissionDeniedException, UploadErrorException {
    Map<String, Object> params = new LinkedHashMap<>();
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'pageToken'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/photos/GooglePhotosInterface.java`
#### Snippet
```java
  }

  MediaItemSearchResponse listMediaItems(Optional<String> albumId, Optional<String> pageToken)
      throws IOException, InvalidTokenException, PermissionDeniedException, UploadErrorException {
    Map<String, Object> params = new LinkedHashMap<>();
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional`> used as type for parameter 'parameters'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/photos/GooglePhotosInterface.java`
#### Snippet
```java
  }

  private <T> T makeGetRequest(String url, Optional<Map<String, String>> parameters, Class<T> clazz)
      throws IOException, InvalidTokenException, PermissionDeniedException {
    HttpRequestFactory requestFactory = httpTransport.createRequestFactory();
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional`> used as type for parameter 'params'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/photos/GooglePhotosInterface.java`
#### Snippet
```java
  }

  private String generateParamsString(Optional<Map<String, String>> params) {
    Map<String, String> updatedParams = new ArrayMap<>();
    if (params.isPresent()) {
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'pageToken'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/photos/GooglePhotosInterface.java`
#### Snippet
```java
  }

  AlbumListResponse listAlbums(Optional<String> pageToken)
      throws IOException, InvalidTokenException, PermissionDeniedException {
    Map<String, String> params = new LinkedHashMap<>();
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'pageData'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/calendar/GoogleCalendarExporter.java`
#### Snippet
```java

  private ExportResult<CalendarContainerResource> exportCalendars(
      TokensAndUrlAuthData authData, Optional<PaginationData> pageData) {
    Calendar.CalendarList.List listRequest;
    CalendarList listResult;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'pageData'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/calendar/GoogleCalendarExporter.java`
#### Snippet
```java

  private ExportResult<CalendarContainerResource> getCalendarEvents(
      TokensAndUrlAuthData authData, String id, Optional<PaginationData> pageData) {
    Calendar.Events.List listRequest;
    Events listResult;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'pageData'
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/contacts/GoogleContactsExporter.java`
#### Snippet
```java

  private ExportResult<ContactsModelWrapper> exportContacts(
      TokensAndUrlAuthData authData, Optional<PaginationData> pageData) {
    try {
      // Set up connection
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'paginationToken'
in `extensions/data-transfer/portability-data-transfer-facebook/src/main/java/org/datatransferproject/transfer/facebook/photos/FacebookPhotosInterface.java`
#### Snippet
```java
  Connection<Album> getAlbums(Optional<String> paginationToken);

  Connection<Photo> getPhotos(String albumId, Optional<String> paginationToken);
}

```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'paginationToken'
in `extensions/data-transfer/portability-data-transfer-facebook/src/main/java/org/datatransferproject/transfer/facebook/photos/FacebookPhotosInterface.java`
#### Snippet
```java

public interface FacebookPhotosInterface {
  Connection<Album> getAlbums(Optional<String> paginationToken);

  Connection<Photo> getPhotos(String albumId, Optional<String> paginationToken);
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'paginationToken'
in `extensions/data-transfer/portability-data-transfer-facebook/src/main/java/org/datatransferproject/transfer/facebook/videos/FacebookVideosInterface.java`
#### Snippet
```java
public interface FacebookVideosInterface {

  Connection<Video> getVideos(Optional<String> paginationToken)
      throws CopyExceptionWithFailureReason;
}
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'paginationData'
in `extensions/data-transfer/portability-data-transfer-facebook/src/main/java/org/datatransferproject/transfer/facebook/videos/FacebookVideosExporter.java`
#### Snippet
```java

  private ExportResult<VideosContainerResource> exportVideos(
      TokensAndUrlAuthData authData, Optional<StringPaginationToken> paginationData)
      throws CopyExceptionWithFailureReason {

```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'pageData'
in `extensions/data-transfer/portability-data-transfer-instagram/src/main/java/org/datatransferproject/transfer/instagram/photos/InstagramPhotoExporter.java`
#### Snippet
```java

  private ExportResult<PhotosContainerResource> exportPhotos(TokensAndUrlAuthData authData,
      Optional<PaginationData> pageData) {
    Preconditions.checkNotNull(authData);
    MediaResponse response;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional`> used as type for parameter 'parameters'
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/media/MicrosoftMediaInterface.java`
#### Snippet
```java

  private <T> T makeGetRequest(
      String url, Optional<Map<String, String>> parameters, Class<T> tClass) throws IOException {
    HttpRequestFactory requestFactory = httpTransport.createRequestFactory();
    if (parameters.isPresent() && parameters.get().size() > 0) {
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'folderId'
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/media/MicrosoftMediaInterface.java`
#### Snippet
```java

  MicrosoftDriveItemsResponse getDriveItems(
      Optional<String> folderId, Optional<String> paginationUrl) throws IOException {
    String requestUrl;
    Map<String, String> params = new LinkedHashMap<>();
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'paginationUrl'
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/media/MicrosoftMediaInterface.java`
#### Snippet
```java

  MicrosoftDriveItemsResponse getDriveItems(
      Optional<String> folderId, Optional<String> paginationUrl) throws IOException {
    String requestUrl;
    Map<String, String> params = new LinkedHashMap<>();
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'paginationData'
in `extensions/data-transfer/portability-data-transfer-facebook/src/main/java/org/datatransferproject/transfer/facebook/photos/FacebookPhotosExporter.java`
#### Snippet
```java
      TokensAndUrlAuthData authData,
      IdOnlyContainerResource containerResource,
      Optional<StringPaginationToken> paginationData)
      throws CopyExceptionWithFailureReason {
    Optional<String> paginationToken = stripTokenPrefix(paginationData, PHOTO_TOKEN_PREFIX);
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'paginationData'
in `extensions/data-transfer/portability-data-transfer-facebook/src/main/java/org/datatransferproject/transfer/facebook/photos/FacebookPhotosExporter.java`
#### Snippet
```java

  private Optional<String> stripTokenPrefix(
      Optional<StringPaginationToken> paginationData, String prefix) {
    Optional<String> paginationToken = Optional.empty();
    if (paginationData.isPresent()) {
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'paginationData'
in `extensions/data-transfer/portability-data-transfer-facebook/src/main/java/org/datatransferproject/transfer/facebook/photos/FacebookPhotosExporter.java`
#### Snippet
```java

  private ExportResult<PhotosContainerResource> exportAlbums(
      TokensAndUrlAuthData authData, Optional<StringPaginationToken> paginationData)
      throws CopyExceptionWithFailureReason {
    Optional<String> paginationToken = stripTokenPrefix(paginationData, ALBUM_TOKEN_PREFIX);
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'paginationData'
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/photos/MicrosoftPhotosExporter.java`
#### Snippet
```java

  private Optional<String> getPaginationToken(
      Optional<PaginationData> paginationData, String tokenPrefix) {
    Optional<String> paginationToken = Optional.empty();
    if (paginationData.isPresent()) {
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'albumData'
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/photos/MicrosoftPhotosExporter.java`
#### Snippet
```java
  ExportResult<PhotosContainerResource> exportOneDrivePhotos(
      TokensAndUrlAuthData authData,
      Optional<IdOnlyContainerResource> albumData,
      Optional<PaginationData> paginationData,
      UUID jobId)
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'paginationData'
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/photos/MicrosoftPhotosExporter.java`
#### Snippet
```java
      TokensAndUrlAuthData authData,
      Optional<IdOnlyContainerResource> albumData,
      Optional<PaginationData> paginationData,
      UUID jobId)
      throws IOException {
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'paginationData'
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/photos/MicrosoftPhotosExporter.java`
#### Snippet
```java
  }

  private Optional<String> getDrivePaginationToken(Optional<PaginationData> paginationData) {
    return getPaginationToken(paginationData, DRIVE_TOKEN_PREFIX);
  }
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'albumId'
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/photos/MicrosoftPhotosExporter.java`
#### Snippet
```java

  private PhotoModel tryConvertDriveItemToPhotoModel(
      Optional<String> albumId, MicrosoftDriveItem driveItem, UUID jobId) {

    if (driveItem.file != null
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'folderId'
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/photos/MicrosoftPhotosInterface.java`
#### Snippet
```java

  MicrosoftDriveItemsResponse getDriveItems(
      Optional<String> folderId, Optional<String> paginationUrl) throws IOException {
    String requestUrl;
    Map<String, String> params = new LinkedHashMap<>();
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'paginationUrl'
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/photos/MicrosoftPhotosInterface.java`
#### Snippet
```java

  MicrosoftDriveItemsResponse getDriveItems(
      Optional<String> folderId, Optional<String> paginationUrl) throws IOException {
    String requestUrl;
    Map<String, String> params = new LinkedHashMap<>();
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional`> used as type for parameter 'parameters'
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/photos/MicrosoftPhotosInterface.java`
#### Snippet
```java

  private <T> T makeGetRequest(
      String url, Optional<Map<String, String>> parameters, Class<T> tClass) throws IOException {
    HttpRequestFactory requestFactory = httpTransport.createRequestFactory();
    if (parameters.isPresent() && parameters.get().size() > 0) {
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'albumId'
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/media/MicrosoftMediaExporter.java`
#### Snippet
```java

  private VideoModel tryConvertDriveItemToVideoModel(
      Optional<String> albumId, MicrosoftDriveItem driveItem, UUID jobId) {
    if (!driveItem.isVideo()) {
      return null;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'paginationData'
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/media/MicrosoftMediaExporter.java`
#### Snippet
```java

  private Optional<String> getPaginationToken(
      Optional<PaginationData> paginationData, String tokenPrefix) {
    Optional<String> paginationToken = Optional.empty();
    if (paginationData.isPresent()) {
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'paginationData'
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/media/MicrosoftMediaExporter.java`
#### Snippet
```java
  }

  private Optional<String> getDrivePaginationToken(Optional<PaginationData> paginationData) {
    return getPaginationToken(paginationData, DRIVE_TOKEN_PREFIX);
  }
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'albumData'
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/media/MicrosoftMediaExporter.java`
#### Snippet
```java
  @VisibleForTesting
  ExportResult<MediaContainerResource> exportOneDrivePhotos(TokensAndUrlAuthData authData,
      Optional<IdOnlyContainerResource> albumData, Optional<PaginationData> paginationData,
      UUID jobId) throws IOException {
    Optional<String> albumId = Optional.empty();
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'paginationData'
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/media/MicrosoftMediaExporter.java`
#### Snippet
```java
  @VisibleForTesting
  ExportResult<MediaContainerResource> exportOneDrivePhotos(TokensAndUrlAuthData authData,
      Optional<IdOnlyContainerResource> albumData, Optional<PaginationData> paginationData,
      UUID jobId) throws IOException {
    Optional<String> albumId = Optional.empty();
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'albumId'
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/media/MicrosoftMediaExporter.java`
#### Snippet
```java

  private PhotoModel tryConvertDriveItemToPhotoModel(
      Optional<String> albumId, MicrosoftDriveItem driveItem, UUID jobId) {
    if (!driveItem.isImage()) {
      return null;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'exportInformation'
in `portability-api/src/main/java/org/datatransferproject/api/action/transfer/CreateTransferJobAction.java`
#### Snippet
```java
      String exportService,
      String importService,
      Optional<ExportInformation> exportInformation,
      String encryptionScheme) throws IOException {

```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'exportInformation'
in `portability-transfer/src/main/java/org/datatransferproject/transfer/CallableExporter.java`
#### Snippet
```java
  private UUID jobId;
  private AuthData authData;
  private Optional<ExportInformation> exportInformation;
  private final DtpInternalMetricRecorder metricRecorder;

```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'exportInformation'
in `portability-transfer/src/main/java/org/datatransferproject/transfer/CallableExporter.java`
#### Snippet
```java
      UUID jobId,
      AuthData authData,
      Optional<ExportInformation> exportInformation,
      DtpInternalMetricRecorder metricRecorder) {
    this.exporterProvider = checkNotNull(exporterProvider, "exportProvider can't be null");
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'exportInfo'
in `portability-transfer/src/main/java/org/datatransferproject/transfer/copier/InMemoryDataCopier.java`
#### Snippet
```java
          AuthData exportAuthData,
          AuthData importAuthData,
          UUID jobId, Optional<ExportInformation> exportInfo)
      throws IOException, CopyException;
}
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'exportInformation'
in `portability-transfer/src/main/java/org/datatransferproject/transfer/copier/PortabilityAbstractInMemoryDataCopier.java`
#### Snippet
```java
      UUID jobId,
      AuthData exportAuthData,
      Optional<ExportInformation> exportInformation,
      String jobIdPrefix,
      int copyIteration)
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'exportInformation'
in `portability-transfer/src/main/java/org/datatransferproject/transfer/copier/PortabilityAbstractInMemoryDataCopier.java`
#### Snippet
```java
      AuthData exportAuthData,
      AuthData importAuthData,
      Optional<ExportInformation> exportInformation,
      String jobIdPrefix,
      int copyIteration)
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'exportInfo'
in `portability-transfer/src/main/java/org/datatransferproject/transfer/copier/PortabilityInMemoryDataCopier.java`
#### Snippet
```java
      AuthData importAuthData,
      UUID jobId,
      Optional<ExportInformation> exportInfo)
      throws CopyException {

```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'exportInformation'
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/provider/Exporter.java`
#### Snippet
```java
   */
  // We need to be able throw exceptions that can be caught by RetryingCallable.
  ExportResult<T> export(UUID jobId, A authData, Optional<ExportInformation> exportInformation)
      throws Exception;
}
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'throwable'
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/provider/ExportResult.java`
#### Snippet
```java
  private ContinuationData continuationData;
  // Throwable should be absent unless an error was thrown during export
  private Optional<Throwable> throwable = Optional.empty();

  /**
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'exportInfo'
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/provider/converter/MediaExporterDecorator.java`
#### Snippet
```java

  private ExportResult<VideosContainerResource> exportVideos(UUID jobId, AD authData,
      Optional<ExportInformation> exportInfo) throws Exception {
    return videosExporter.export(jobId, authData, exportInfo.map((ei) -> {
      ContainerResource cr = ei.getContainerResource();
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'exportInfo'
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/provider/converter/MediaExporterDecorator.java`
#### Snippet
```java

  private ExportResult<PhotosContainerResource> exportPhotos(UUID jobId, AD authData,
      Optional<ExportInformation> exportInfo)
      throws Exception {
    return photosExporter.export(jobId, authData, exportInfo.map((ei) -> {
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'throwable'
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/provider/ImportResult.java`
#### Snippet
```java
  private ResultType type;
  // Throwable should be absent unless an error was thrown during export
  private Optional<Throwable> throwable = Optional.empty();
  private Optional<Map<String, Integer>> counts = Optional.empty();
  private Optional<Long> bytes = Optional.empty();
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'bytes'
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/provider/ImportResult.java`
#### Snippet
```java
  private Optional<Throwable> throwable = Optional.empty();
  private Optional<Map<String, Integer>> counts = Optional.empty();
  private Optional<Long> bytes = Optional.empty();

  /**
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional`> used as type for field 'counts'
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/provider/ImportResult.java`
#### Snippet
```java
  // Throwable should be absent unless an error was thrown during export
  private Optional<Throwable> throwable = Optional.empty();
  private Optional<Map<String, Integer>> counts = Optional.empty();
  private Optional<Long> bytes = Optional.empty();

```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'throwable'
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/provider/ImportResult.java`
#### Snippet
```java
  public ImportResult(
      ResultType type,
      Optional<Throwable> throwable,
      Optional<Map<String, Integer>> counts,
      Optional<Long> bytes) {
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional`> used as type for parameter 'counts'
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/provider/ImportResult.java`
#### Snippet
```java
      ResultType type,
      Optional<Throwable> throwable,
      Optional<Map<String, Integer>> counts,
      Optional<Long> bytes) {
    this.type = type;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'bytes'
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/provider/ImportResult.java`
#### Snippet
```java
      Optional<Throwable> throwable,
      Optional<Map<String, Integer>> counts,
      Optional<Long> bytes) {
    this.type = type;
    this.throwable = throwable;
```

## RuleId[ruleID=CharsetObjectCanBeUsed]
### RuleId[ruleID=CharsetObjectCanBeUsed]
StandardCharsets.UTF_8 can be used instead
in `extensions/data-transfer/portability-data-transfer-deezer/src/main/java/org/datatransferproject/transfer/deezer/DeezerApi.java`
#### Snippet
```java
            .append(entry.getKey())
            .append("=")
            .append(URLEncoder.encode(entry.getValue(), "UTF8"));
      } catch (UnsupportedEncodingException e) {
        throw new IllegalArgumentException(e);
```

## RuleId[ruleID=SystemOutErr]
### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `extensions/cloud/portability-cloud-google/src/main/java/org/datatransferproject/cloud/google/StackdriverMonitor.java`
#### Snippet
```java
      logging.write(Collections.singleton(entry));
    } catch (Throwable t) {
      System.out.println("Problem logging: " + t.getMessage());
      t.printStackTrace(System.out);
    }
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `extensions/cloud/portability-cloud-google/src/main/java/org/datatransferproject/cloud/google/StackdriverMonitor.java`
#### Snippet
```java
    } catch (Throwable t) {
      System.out.println("Problem logging: " + t.getMessage());
      t.printStackTrace(System.out);
    }
  }
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `extensions/data-transfer/portability-data-transfer-offline-demo/src/main/java/org/datatransferproject/transfer/offline/OfflineDemoImporter.java`
#### Snippet
```java
      MicrosoftOfflineData data) {
    // Print to the console to simulate an import
    System.out.println("Received offline data:\n" + data.getContents());
    return ImportResult.OK;
  }
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.err` should probably be replaced with more robust logging
in `portability-api-launcher/src/main/java/org/datatransferproject/api/launcher/Version.java`
#### Snippet
```java
    URL url = Version.class.getResource("/META-INF/launcher.properties");
    if (url == null) {
      System.err.println("Launcher version file (launcher.properties) not found");
    } else {
      try (final InputStream stream = url.openStream()) {
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `portability-api-launcher/src/main/java/org/datatransferproject/launcher/monitor/MonitorLoader.java`
#### Snippet
```java
                  monitors.add(extension.getMonitor());
                  } catch (Throwable e) {
                    System.out.println("Couldn't initialize: " + extension + ": " + e.getMessage());
                    e.printStackTrace(System.out);
                  }
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `portability-api-launcher/src/main/java/org/datatransferproject/launcher/monitor/MonitorLoader.java`
#### Snippet
```java
                  } catch (Throwable e) {
                    System.out.println("Couldn't initialize: " + extension + ": " + e.getMessage());
                    e.printStackTrace(System.out);
                  }
                });
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `portability-api-launcher/src/main/java/org/datatransferproject/launcher/monitor/ConsoleMonitor.java`
#### Snippet
```java

    String time = ZonedDateTime.now(ZoneId.systemDefault()).format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
    System.out.println(color + level + " " + time + " " + supplier.get() + reset);
    if (data != null) {
      for (Object datum : data) {
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `portability-api-launcher/src/main/java/org/datatransferproject/launcher/monitor/ConsoleMonitor.java`
#### Snippet
```java
      for (Object datum : data) {
        if (datum instanceof Throwable) {
          ((Throwable) datum).printStackTrace(System.out);
        } else if (datum instanceof UUID) {
          System.out.println("JobId: " + ((UUID)datum).toString());
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `portability-api-launcher/src/main/java/org/datatransferproject/launcher/monitor/ConsoleMonitor.java`
#### Snippet
```java
          ((Throwable) datum).printStackTrace(System.out);
        } else if (datum instanceof UUID) {
          System.out.println("JobId: " + ((UUID)datum).toString());
        } else if (datum instanceof EventCode) {
          System.out.println("EventCode: " + datum.toString());
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `portability-api-launcher/src/main/java/org/datatransferproject/launcher/monitor/ConsoleMonitor.java`
#### Snippet
```java
          System.out.println("JobId: " + ((UUID)datum).toString());
        } else if (datum instanceof EventCode) {
          System.out.println("EventCode: " + datum.toString());
        } else if (datum != null) {
          System.out.println(datum);
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `portability-api-launcher/src/main/java/org/datatransferproject/launcher/monitor/ConsoleMonitor.java`
#### Snippet
```java
          System.out.println("EventCode: " + datum.toString());
        } else if (datum != null) {
          System.out.println(datum);
        }
      }
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `portability-test-utilities/src/main/java/org/datatransferproject/test/types/FakeIdempotentImportExecutor.java`
#### Snippet
```java
      String idempotentId, String itemName, Callable<T> callable) throws Exception {
    if (knownValues.containsKey(idempotentId)) {
      System.out.println("Using cached key " + idempotentId + " from cache");
      return (T) knownValues.get(idempotentId);
    }
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `portability-test-utilities/src/main/java/org/datatransferproject/test/types/FakeIdempotentImportExecutor.java`
#### Snippet
```java
      T result = callable.call();
      knownValues.put(idempotentId, result);
      System.out.println("Storing key " + idempotentId + " in cache");
      return result;
    } catch (Exception e) {
```

## RuleId[ruleID=ImplicitArrayToString]
### RuleId[ruleID=ImplicitArrayToString]
Implicit call to 'toString()' on array `encoded`
in `extensions/security/portability-security-jwe/src/main/java/org/datatransferproject/security/jwe/JWEPublicKeySerializer.java`
#### Snippet
```java
    } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
      throw new RuntimeException(
          "InvalidKeySpecException generating PublicKey, encoded: " + encoded, e);    }
  }
}
```

### RuleId[ruleID=ImplicitArrayToString]
Implicit call to 'toString()' on array `encoded`
in `extensions/security/portability-security-jwe/src/main/java/org/datatransferproject/security/jwe/JWEAuthDataDecryptService.java`
#### Snippet
```java
    } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
      throw new RuntimeException(
          "InvalidKeySpecException generating PrivateKey, encoded: " + encoded, e);
    }
  }
```

## RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/calendar/GoogleCalendarExporter.java`
#### Snippet
```java
      Preconditions.checkArgument(st.contains(":"),
          "Recurrence entry " + st + " cannot be parsed");
      String[] split = st.split("[:;]", 2);
      String type = split[0];
      String value = split[1];
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `portability-types-common/src/main/java/org/datatransferproject/types/common/models/calendar/RecurrenceRule.java`
#### Snippet
```java
  public static RRule parseRRuleString(String rRuleString) {
    RRule.Builder builder = RRule.builder();
    List<String> components = Arrays.asList(rRuleString.split("[;:]"));
    Map<ByRule, String> byRuleMapInput = new HashMap<>();
    for (String property : components) {
```

## RuleId[ruleID=UnnecessaryFullyQualifiedName]
### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util.function` is unnecessary and can be removed
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/mail/GoogleMailImporter.java`
#### Snippet
```java

  /** Supplies a mapping of Label Name -> Label Id (in the import account). */
  private java.util.function.Supplier<Map<String, String>> allDestinationLabelsSupplier(
      TokensAndUrlAuthData authData) {
    return () -> {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.api.services.people.v1.model` is unnecessary, and can be replaced with an import
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/contacts/GoogleContactsImporter.java`
#### Snippet
```java
  }

  private static com.google.api.services.people.v1.model.Address convertToGoogleAddress(
      ezvcard.property.Address vCardAddress) {
    com.google.api.services.people.v1.model.Address personAddress =
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `ezvcard.property` is unnecessary, and can be replaced with an import
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/contacts/GoogleContactsImporter.java`
#### Snippet
```java

  private static com.google.api.services.people.v1.model.Address convertToGoogleAddress(
      ezvcard.property.Address vCardAddress) {
    com.google.api.services.people.v1.model.Address personAddress =
        new com.google.api.services.people.v1.model.Address();
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.api.services.people.v1.model` is unnecessary, and can be replaced with an import
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/contacts/GoogleContactsImporter.java`
#### Snippet
```java
  private static com.google.api.services.people.v1.model.Address convertToGoogleAddress(
      ezvcard.property.Address vCardAddress) {
    com.google.api.services.people.v1.model.Address personAddress =
        new com.google.api.services.people.v1.model.Address();

```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.api.services.people.v1.model` is unnecessary, and can be replaced with an import
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/contacts/GoogleContactsImporter.java`
#### Snippet
```java
      ezvcard.property.Address vCardAddress) {
    com.google.api.services.people.v1.model.Address personAddress =
        new com.google.api.services.people.v1.model.Address();

    personAddress.setCountry(vCardAddress.getCountry());
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `ezvcard.property` is unnecessary, and can be replaced with an import
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/contacts/GoogleContactsExporter.java`
#### Snippet
```java
  }

  private static ezvcard.property.Address convertToVCardAddress(
      com.google.api.services.people.v1.model.Address personAddress) {
    ezvcard.property.Address vCardAddress = new ezvcard.property.Address();
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.api.services.people.v1.model` is unnecessary, and can be replaced with an import
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/contacts/GoogleContactsExporter.java`
#### Snippet
```java

  private static ezvcard.property.Address convertToVCardAddress(
      com.google.api.services.people.v1.model.Address personAddress) {
    ezvcard.property.Address vCardAddress = new ezvcard.property.Address();

```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `ezvcard.property` is unnecessary, and can be replaced with an import
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/contacts/GoogleContactsExporter.java`
#### Snippet
```java
  private static ezvcard.property.Address convertToVCardAddress(
      com.google.api.services.people.v1.model.Address personAddress) {
    ezvcard.property.Address vCardAddress = new ezvcard.property.Address();

    vCardAddress.setCountry(personAddress.getCountry());
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `ezvcard.property` is unnecessary, and can be replaced with an import
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/contacts/GoogleContactsExporter.java`
#### Snippet
```java
  private static ezvcard.property.Address convertToVCardAddress(
      com.google.api.services.people.v1.model.Address personAddress) {
    ezvcard.property.Address vCardAddress = new ezvcard.property.Address();

    vCardAddress.setCountry(personAddress.getCountry());
```

## RuleId[ruleID=ThrowablePrintStackTrace]
### RuleId[ruleID=ThrowablePrintStackTrace]
Call to `printStackTrace()` should probably be replaced with more robust logging
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/offline/MicrosoftOfflineDataExporter.java`
#### Snippet
```java
      return new ExportResult<>(ExportResult.ResultType.END, offlineData);
    } catch (IOException e) {
      e.printStackTrace(); // FIXME log error
      return new ExportResult<>(e);
    }
```

### RuleId[ruleID=ThrowablePrintStackTrace]
Call to `printStackTrace()` should probably be replaced with more robust logging
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/offline/MicrosoftOfflineDataExporter.java`
#### Snippet
```java
      } catch (IOException e) {
        // skip the offline data
        e.printStackTrace(); // FIXME log error
        return "";
      }
```

### RuleId[ruleID=ThrowablePrintStackTrace]
Call to `printStackTrace()` should probably be replaced with more robust logging
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/contacts/MicrosoftContactsImporter.java`
#### Snippet
```java
    } catch (IOException e) {
      // TODO log
      e.printStackTrace();
      return new ImportResult(e);
    }
```

### RuleId[ruleID=ThrowablePrintStackTrace]
Call to `printStackTrace()` should probably be replaced with more robust logging
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/contacts/MicrosoftContactsExporter.java`
#### Snippet
```java
      return new ExportResult<>(ExportResult.ResultType.CONTINUE, wrapper, continuationData);
    } catch (IOException e) {
      e.printStackTrace(); // FIXME log error
      return new ExportResult<>(e);
    }
```

### RuleId[ruleID=ThrowablePrintStackTrace]
Call to `printStackTrace()` should probably be replaced with more robust logging
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/contacts/MicrosoftContactsExporter.java`
#### Snippet
```java
    } catch (IOException e) {
      // TODO log
      e.printStackTrace();
      return new ContactsModelWrapper("");
    }
```

### RuleId[ruleID=ThrowablePrintStackTrace]
Call to `printStackTrace()` should probably be replaced with more robust logging
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/common/RequestHelper.java`
#### Snippet
```java
    } catch (IOException e) {
      // TODO log
      e.printStackTrace();
      return new BatchResponse(new ImportResult(e));
    }
```

### RuleId[ruleID=ThrowablePrintStackTrace]
Call to `printStackTrace()` should probably be replaced with more robust logging
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/calendar/MicrosoftCalendarExporter.java`
#### Snippet
```java
      }
    } catch (IOException e) {
      e.printStackTrace(); // FIXME log error
      return new ExportResult<>(e);
    }
```

### RuleId[ruleID=ThrowablePrintStackTrace]
Call to `printStackTrace()` should probably be replaced with more robust logging
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/calendar/MicrosoftCalendarExporter.java`
#### Snippet
```java

      } catch (IOException e) {
        e.printStackTrace(); // FIXME log error
        return new ExportResult<>(e);
      }
```

### RuleId[ruleID=ThrowablePrintStackTrace]
Call to `printStackTrace()` should probably be replaced with more robust logging
in `portability-api-launcher/src/main/java/org/datatransferproject/api/launcher/Version.java`
#### Snippet
```java
        properties.load(stream);
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
```

### RuleId[ruleID=ThrowablePrintStackTrace]
Call to `printStackTrace()` should probably be replaced with more robust logging
in `portability-api-launcher/src/main/java/org/datatransferproject/launcher/monitor/MonitorLoader.java`
#### Snippet
```java
        }
      } catch (Throwable t) {
        t.printStackTrace();
        throw t;
      }
```

### RuleId[ruleID=ThrowablePrintStackTrace]
Call to `printStackTrace()` should probably be replaced with more robust logging
in `portability-types-common/src/main/java/org/datatransferproject/types/common/models/MediaObject.java`
#### Snippet
```java
      this.contentUrl = new URI(uri);
    } catch (URISyntaxException e) {
      e.printStackTrace();
    }
  }
```

## RuleId[ruleID=SamePackageImport]
### RuleId[ruleID=SamePackageImport]
Unnecessary import from the same package `import org.datatransferproject.types.common.PaginationData;`
in `portability-types-common/src/main/java/org/datatransferproject/types/common/StringPaginationToken.java`
#### Snippet
```java
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.datatransferproject.types.common.PaginationData;

/**
```

### RuleId[ruleID=SamePackageImport]
Unnecessary import from the same package `import org.datatransferproject.types.common.PaginationData;`
in `portability-types-common/src/main/java/org/datatransferproject/types/common/IntPaginationToken.java`
#### Snippet
```java
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.datatransferproject.types.common.PaginationData;

/** Numeric pagination data. */
```

## RuleId[ruleID=NonProtectedConstructorInAbstractClass]
### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `PortabilityAbstractInMemoryDataCopier()` of an abstract class should not be declared 'public'
in `portability-transfer/src/main/java/org/datatransferproject/transfer/copier/PortabilityAbstractInMemoryDataCopier.java`
#### Snippet
```java
  protected final JobStore jobStore;

  public PortabilityAbstractInMemoryDataCopier(
      Provider<Exporter> exporterProvider,
      Provider<Importer> importerProvider,
```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `CopyExceptionWithFailureReason()` of an abstract class should not be declared 'public'
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/types/CopyExceptionWithFailureReason.java`
#### Snippet
```java
public abstract class CopyExceptionWithFailureReason extends CopyException {

  public CopyExceptionWithFailureReason(String message, Throwable cause) {
    super(message, cause);
  }
```

## RuleId[ruleID=CaughtExceptionImmediatelyRethrown]
### RuleId[ruleID=CaughtExceptionImmediatelyRethrown]
Caught exception `e` is immediately rethrown
in `portability-test-utilities/src/main/java/org/datatransferproject/test/types/FakeIdempotentImportExecutor.java`
#### Snippet
```java
      System.out.println("Storing key " + idempotentId + " in cache");
      return result;
    } catch (Exception e) {
      throw e;
    }
```

## RuleId[ruleID=AssignmentToMethodParameter]
### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `url`
in `extensions/data-transfer/portability-data-transfer-smugmug/src/main/java/org/datatransferproject/transfer/smugmug/photos/SmugMugInterface.java`
#### Snippet
```java
  SmugMugAlbumsResponse getAlbums(String url) throws IOException {
    if (Strings.isNullOrEmpty(url)) {
      url = user.getUris().get(ALBUMS_KEY).getUri();
    }
    return makeRequest(url, new TypeReference<SmugMugResponse<SmugMugAlbumsResponse>>() {})
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `url`
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/media/MicrosoftMediaInterface.java`
#### Snippet
```java
    HttpRequestFactory requestFactory = httpTransport.createRequestFactory();
    if (parameters.isPresent() && parameters.get().size() > 0) {
      url = url + generateODataParams(parameters.get());
    }
    HttpRequest getRequest = requestFactory.buildGetRequest(new GenericUrl(url));
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `url`
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/photos/MicrosoftPhotosInterface.java`
#### Snippet
```java
    HttpRequestFactory requestFactory = httpTransport.createRequestFactory();
    if (parameters.isPresent() && parameters.get().size() > 0) {
      url = url + generateODataParams(parameters.get());
    }
    HttpRequest getRequest = requestFactory.buildGetRequest(new GenericUrl(url));
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `job`
in `portability-api/src/main/java/org/datatransferproject/api/action/transfer/StartTransferJobAction.java`
#### Snippet
```java
            .setState(CREDS_STORED)
            .build();
    job = job.toBuilder().setAndValidateJobAuthorization(updatedJobAuthorization).build();
    monitor.debug(
        () -> format("Updating job %s from CREDS_ENCRYPTION_KEY_GENERATED to CREDS_STORED", jobId),
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `job`
in `portability-api/src/main/java/org/datatransferproject/api/action/transfer/CreateTransferJobAction.java`
#### Snippet
```java

      // Persist the updated PortabilityJob with the updated JobAuthorization
      job = job.toBuilder().setAndValidateJobAuthorization(updatedJobAuthorization).build();
    }
    if (importConfiguration.getInitialAuthData() != null) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `job`
in `portability-api/src/main/java/org/datatransferproject/api/action/transfer/CreateTransferJobAction.java`
#### Snippet
```java

      // Persist the updated PortabilityJob with the updated JobAuthorization
      job = job.toBuilder().setAndValidateJobAuthorization(updatedJobAuthorization).build();
    }
    return job;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `success`
in `portability-transfer/src/main/java/org/datatransferproject/transfer/JobProcessor.java`
#### Snippet
```java
      store.addErrorsToJob(jobId, errors);
    } catch (IOException | RuntimeException e) {
      success = false;
      monitor.severe(() -> "Problem adding errors to JobStore", e);
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `color`
in `portability-api-launcher/src/main/java/org/datatransferproject/launcher/monitor/ConsoleMonitor.java`
#### Snippet
```java

  private void output(String level, Supplier<String> supplier, String color, Object... data) {
    color = ansi ? color : "";
    String reset = ansi ? ANSI_RESET : "";

```

## RuleId[ruleID=UnnecessaryContinue]
### RuleId[ruleID=UnnecessaryContinue]
`continue` is unnecessary as the last statement in a loop
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/media/MicrosoftMediaExporter.java`
#### Snippet
```java
        if (video != null) {
          videos.add(video);
          continue;
        }
      }
```

## RuleId[ruleID=ReturnNull]
### RuleId[ruleID=ReturnNull]
Return of `null`
in `libraries/auth/src/main/java/org/datatransferproject/auth/OAuth2Config.java`
#### Snippet
```java
   */
  default Map<String, String> getAdditionalAuthUrlParameters() {
    return null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `libraries/auth/src/main/java/org/datatransferproject/auth/OAuth1DataGenerator.java`
#### Snippet
```java
    } catch (IOException e) {
      monitor.severe(() -> "Error retrieving request token", e);
      return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `libraries/auth/src/main/java/org/datatransferproject/auth/OAuth1DataGenerator.java`
#### Snippet
```java
    } catch (IOException e) {
      monitor.severe(() -> "Error retrieving request token", e);
      return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `libraries/config/src/main/java/org/datatransferproject/config/ConfigUtils.java`
#### Snippet
```java
      return in2;
    }
    return null;
  }
}
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `extensions/auth/portability-auth-rememberthemilk/src/main/java/org/datatransferproject/auth/rememberthemilk/RememberTheMilkAuthDataGenerator.java`
#### Snippet
```java
    } catch (IOException e) {
      monitor.severe(() -> "Error getting RememberTheMilk AuthToken: ", e);
      return null;
    }
  }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `extensions/auth/portability-auth-rememberthemilk/src/main/java/org/datatransferproject/auth/rememberthemilk/RememberTheMilkAuthDataGenerator.java`
#### Snippet
```java
    } catch (Exception e) {
      monitor.severe(() -> "Error generating RememberTheMilk Authentication URL", e);
      return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `extensions/cloud/portability-cloud-local/src/main/java/org/datatransferproject/cloud/local/LocalJobStore.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `extensions/cloud/portability-cloud-local/src/main/java/org/datatransferproject/cloud/local/LocalJobStore.java`
#### Snippet
```java
  public <T extends DataModel> T findData(UUID jobId, String key, Class<T> type) {
    if (!DATA_MAP.containsKey(createFullKey(jobId, key))) {
      return null;
    }
    if (!DATA_MAP.get(createFullKey(jobId, key)).containsKey(type)) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `extensions/cloud/portability-cloud-local/src/main/java/org/datatransferproject/cloud/local/LocalJobStore.java`
#### Snippet
```java
    }
    if (!DATA_MAP.get(createFullKey(jobId, key)).containsKey(type)) {
      return null;
    }
    return (T) DATA_MAP.get(createFullKey(jobId, key)).get(type);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `extensions/cloud/portability-cloud-local/src/main/java/org/datatransferproject/cloud/local/LocalJobStore.java`
#### Snippet
```java
  public PortabilityJob findJob(UUID jobId) {
    if (!JOB_MAP.containsKey(jobId)) {
      return null;
    }
    return PortabilityJob.fromMap(JOB_MAP.get(jobId));
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `extensions/cloud/portability-cloud-microsoft/src/main/java/org/datatransferproject/cloud/microsoft/cosmos/AzureKeyVaultStore.java`
#### Snippet
```java
    String normalizedKey = normalize(key);
    SecretBundle secretBundle = vaultClient.getSecret(vaultUrl, normalizedKey);
    return secretBundle == null ? null : secretBundle.value();
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `extensions/cloud/portability-cloud-microsoft/src/main/java/org/datatransferproject/cloud/microsoft/cosmos/AzureTableStore.java`
#### Snippet
```java
      Iterator<DataWrapper> iter = table.execute(query).iterator();
      if (!iter.hasNext()) {
        return null;
      }
      return UUID.fromString(iter.next().getRowKey());
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `extensions/data-transfer/portability-data-transfer-koofr/src/main/java/org/datatransferproject/transfer/koofr/common/KoofrMediaExport.java`
#### Snippet
```java
    } catch (IOException e) {
      monitor.severe(() -> String.format("Koofr file link error: %s", fullPath), e);
      return null;
    }
  }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `extensions/cloud/portability-cloud-google/src/main/java/org/datatransferproject/cloud/google/GoogleJobStore.java`
#### Snippet
```java
    Entity entity = datastore.get(getJobKey(jobId));
    if (entity == null) {
      return null;
    }
    try {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `extensions/cloud/portability-cloud-google/src/main/java/org/datatransferproject/cloud/google/GoogleJobStore.java`
#### Snippet
```java
      throws IOException, ClassNotFoundException {
    if (entity == null) {
      return null;
    }
    ImmutableMap.Builder<String, Object> builder = new ImmutableMap.Builder<>();
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `extensions/cloud/portability-cloud-google/src/main/java/org/datatransferproject/cloud/google/GoogleJobStore.java`
#### Snippet
```java
    QueryResults<Key> results = datastore.run(query);
    if (!results.hasNext()) {
      return null;
    }
    Key key = results.next();
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `extensions/cloud/portability-cloud-google/src/main/java/org/datatransferproject/cloud/google/GoogleJobStore.java`
#### Snippet
```java
    Entity entity = datastore.get(entityKey);
    if (entity == null) {
      return null;
    }
    String serializedEntity = entity.getString(type.getName());
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `extensions/data-transfer/portability-data-transfer-imgur/src/main/java/org/datatransferproject/datatransfer/imgur/photos/ImgurPhotosExporter.java`
#### Snippet
```java
      ResponseBody body = response.body();
      if (body == null) {
        return null;
      }
      String contentBody = new String(body.bytes());
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `extensions/data-transfer/portability-data-transfer-koofr/src/main/java/org/datatransferproject/transfer/koofr/exceptions/KoofrClientIOException.java`
#### Snippet
```java
    try {
      ResponseBody body = response.body();
      return body != null ? body.string() : null;
    } catch (Exception e) {
      return "Failed to get response body";
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `extensions/data-transfer/portability-data-transfer-deezer/src/main/java/org/datatransferproject/transfer/deezer/playlists/DeezerPlaylistImporter.java`
#### Snippet
```java
                + insertResponse);
          }
          return null;
        }
    );
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `extensions/data-transfer/portability-data-transfer-koofr/src/main/java/org/datatransferproject/transfer/koofr/photos/KoofrPhotosImporter.java`
#### Snippet
```java

      if (metadata == null) {
        return null;
      }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `extensions/data-transfer/portability-data-transfer-koofr/src/main/java/org/datatransferproject/transfer/koofr/photos/KoofrPhotosImporter.java`
#### Snippet
```java

      if (exif == null) {
        return null;
      }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `extensions/data-transfer/portability-data-transfer-koofr/src/main/java/org/datatransferproject/transfer/koofr/photos/KoofrPhotosImporter.java`
#### Snippet
```java

      if (values == null || values.length == 0) {
        return null;
      }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `extensions/data-transfer/portability-data-transfer-koofr/src/main/java/org/datatransferproject/transfer/koofr/photos/KoofrPhotosImporter.java`
#### Snippet
```java
                  "There was an issue when reading the exif data of %s", photo.getDataId()),
          e);
      return null;
    }
  }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `extensions/data-transfer/portability-data-transfer-deezer/src/main/java/org/datatransferproject/transfer/deezer/DeezerApi.java`
#### Snippet
```java
      throws IOException {
    if (tracks.isEmpty()) {
      return null;
    }
    // Track inserts return true if successful and an Error json object on error....
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `extensions/data-transfer/portability-data-transfer-deezer/src/main/java/org/datatransferproject/transfer/deezer/DeezerApi.java`
#### Snippet
```java
        ImmutableMap.of("songs", Joiner.on(",").join(tracks)));
    if ("true".equalsIgnoreCase(result)) {
      return null;
    }
    return MAPPER.readValue(result, Error.class);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `extensions/data-transfer/portability-data-transfer-solid/src/main/java/org/datatransferproject/transfer/solid/SolidUtilities.java`
#### Snippet
```java
            || s.getURI().equalsIgnoreCase(url + "#this")).toList();
    if (matchingSubjects.isEmpty()) {
      return null;
    }
    checkState(matchingSubjects.size() == 1,
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `extensions/data-transfer/portability-data-transfer-solid/src/main/java/org/datatransferproject/transfer/solid/contacts/SolidContactsExport.java`
#### Snippet
```java
      return parseAddressBook(resource, utilities);
    }
    return null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/music/GoogleMusicImporter.java`
#### Snippet
```java
  private String[] getArtistTitles(List<MusicGroup> artists) {
    if (artists == null || artists.isEmpty()) {
      return null;
    }
    String[] artistsTitles = new String[artists.size()];
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/music/GoogleMusicExporter.java`
#### Snippet
```java
  private List<MusicGroup> createMusicGroups(String[] artistTitles) {
    if (artistTitles == null) {
      return null;
    }
    List<MusicGroup> musicGroups = new ArrayList<>();
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/calendar/GoogleCalendarImporter.java`
#### Snippet
```java
  private static EventDateTime getEventDateTime(CalendarEventModel.CalendarEventTime dateTime) {
    if (dateTime == null) {
      return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/calendar/GoogleCalendarExporter.java`
#### Snippet
```java
  private static CalendarEventModel.CalendarEventTime getEventTime(EventDateTime dateTime) {
    if (dateTime == null) {
      return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `extensions/data-transfer/portability-data-transfer-spotify/src/main/java/org/datatransferproject/transfer/spotify/playlists/SpotifyPlaylistImporter.java`
#### Snippet
```java
              .build()
              .execute();
          return null;
        }
    );
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `extensions/data-transfer/portability-data-transfer-instagram/src/main/java/org/datatransferproject/transfer/instagram/InstagramTransferExtension.java`
#### Snippet
```java
        initialized, "InstagramTransferExtension not initialized. Unable to get Importer");
    Preconditions.checkArgument(false, "Instagram does not support import");
    return null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/MicrosoftTransferExtension.java`
#### Snippet
```java
      // TODO we may want to provide a config option that allows deployers to disable transfer of
      // certain data types
      return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/offline/MicrosoftOfflineDataExporter.java`
#### Snippet
```java
      }
    }
    return null;
  }
}
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/photos/MicrosoftPhotosExporter.java`
#### Snippet
```java
    }

    return null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/photos/MicrosoftPhotosExporter.java`
#### Snippet
```java
    }

    return null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/photos/MicrosoftPhotosExporter.java`
#### Snippet
```java
    }

    return null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/transformer/calendar/ToCalendarAttendeeModelTransformer.java`
#### Snippet
```java
  public CalendarAttendeeModel apply(Map<String, Object> attendee, TransformerContext context) {
    if (attendee == null) {
      return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/transformer/calendar/ToCalendarModelTransformer.java`
#### Snippet
```java
    if (id == null) {
      context.problem("Calendar id not found");
      return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/transformer/calendar/ToCalendarModelTransformer.java`
#### Snippet
```java
    if (name == null) {
      context.problem("Calendar name not found");
      return null;
    }
    return new CalendarModel(
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/transformer/calendar/ToCalendarEventModelTransformer.java`
#### Snippet
```java
    if (!"singleInstance"
        .equals(event.get("type"))) { // support single instances for now;recurring events later
      return null;
    }
    String calendarId = context.getProperty(CALENDAR_ID);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/media/MicrosoftMediaExporter.java`
#### Snippet
```java
      Optional<String> albumId, MicrosoftDriveItem driveItem, UUID jobId) {
    if (!driveItem.isVideo()) {
      return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/media/MicrosoftMediaExporter.java`
#### Snippet
```java
    String url = driveItemsResponse.getNextPageLink();
    if (Strings.isNullOrEmpty(url)) {
      return null;
    }
    return new StringPaginationToken(DRIVE_TOKEN_PREFIX + url);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/media/MicrosoftMediaExporter.java`
#### Snippet
```java
      Optional<String> albumId, MicrosoftDriveItem driveItem, UUID jobId) {
    if (!driveItem.isImage()) {
      return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/media/MicrosoftMediaExporter.java`
#### Snippet
```java
  private MediaAlbum tryConvertDriveItemToMediaAlbum(MicrosoftDriveItem driveItem, UUID jobId) {
    if (!driveItem.isFolder()) {
      return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/transformer/calendar/ToCalendarEventModelTransformer.java`
#### Snippet
```java
    if (startTime == null) {
      context.problem("Could not parse start time. Skipping event.");
      return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/transformer/calendar/ToCalendarEventModelTransformer.java`
#### Snippet
```java
    if (endTime == null) {
      context.problem("Could not parse end time. Skipping event.");
      return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/transformer/calendar/ToCalendarEventTimeTransformer.java`
#### Snippet
```java
      Map<String, String> time, TransformerContext context) {
    if (time == null) {
      return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/transformer/calendar/ToCalendarEventTimeTransformer.java`
#### Snippet
```java
    String timeZone = time.get("timeZone");
    if (dateTimeValue == null || timeZone == null) {
      return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/transformer/calendar/ToCalendarEventTimeTransformer.java`
#### Snippet
```java
    } catch (DateTimeException e) {
      context.problem(e.getMessage());
      return null;
    }
  }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `extensions/data-transfer/portability-data-transfer-offline-demo/src/main/java/org/datatransferproject/transfer/offline/OfflineDemoTransferExtension.java`
#### Snippet
```java
  @Override
  public Exporter<?, ?> getExporter(DataVertical transferDataType) {
    return null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `portability-api/src/main/java/org/datatransferproject/api/token/JWTTokenManager.java`
#### Snippet
```java
      Claim claim = jwt.getClaim(JWTTokenManager.ID_CLAIM_KEY);
      if (claim.isNull()) {
        return null;
      }
      return claim.isNull() ? null : UUID.fromString(claim.asString());
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `portability-api/src/main/java/org/datatransferproject/api/token/JWTTokenManager.java`
#### Snippet
```java
        return null;
      }
      return claim.isNull() ? null : UUID.fromString(claim.asString());
    } catch (JWTVerificationException exception) {
      monitor.debug(() -> "Error verifying token", exception);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `extensions/data-transfer/portability-data-transfer-microsoft/src/main/java/org/datatransferproject/transfer/microsoft/transformer/TransformerServiceImpl.java`
#### Snippet
```java
    public <T> T transform(Class<T> resultType, Object input) {
      if (input == null) {
        return null; // support null
      }
      return TransformerServiceImpl.this.transform(resultType, input, this);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `portability-spi-cloud/src/main/java/org/datatransferproject/spi/cloud/storage/JobStore.java`
#### Snippet
```java
  /** Provides the total number of bytes transferred. */
  default Long getBytes(UUID jobId) {
    return null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `portability-spi-cloud/src/main/java/org/datatransferproject/spi/cloud/storage/JobStore.java`
#### Snippet
```java
   */
  default Map<String, Integer> getCounts(UUID jobId) {
    return null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/provider/TransferCompatibilityProvider.java`
#### Snippet
```java
    Exporter<?, ?> video = getExporterOrNull(extension, VIDEOS);
    if (photo == null || video == null) {
      return null;
    }
    return new MediaExporterDecorator(photo, video);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/provider/TransferCompatibilityProvider.java`
#### Snippet
```java
    Importer media = getImporterOrNull(extension, MEDIA);
    if (media == null) {
      return null;
    }
    return new AnyToAnyImporter<>(media, MediaContainerResource::videoToMedia);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/provider/TransferCompatibilityProvider.java`
#### Snippet
```java
      return extension.getImporter(jobType);
    } catch (Exception e) {
      return null;
    }
  }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/provider/TransferCompatibilityProvider.java`
#### Snippet
```java
      return extension.getExporter(jobType);
    } catch (Exception e) {
      return null;
    }
  }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/provider/TransferCompatibilityProvider.java`
#### Snippet
```java
    Exporter media = getExporterOrNull(extension, MEDIA);
    if (media == null) {
      return null;
    }
    Function<ContainerResource, ContainerResource> converter = (cr) ->
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/provider/TransferCompatibilityProvider.java`
#### Snippet
```java
    Importer<?, ?> video = getImporterOrNull(extension, VIDEOS);
    if (photo == null || video == null) {
      return null;
    }
    return new MediaImporterDecorator(photo, video);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/provider/TransferCompatibilityProvider.java`
#### Snippet
```java
    Exporter media = getExporterOrNull(extension, MEDIA);
    if (media == null) {
      return null;
    }
    Function<ContainerResource, ContainerResource> converter = (cr) ->
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `portability-spi-transfer/src/main/java/org/datatransferproject/spi/transfer/provider/TransferCompatibilityProvider.java`
#### Snippet
```java
    Importer media = getImporterOrNull(extension, MEDIA);
    if (media == null) {
      return null;
    }
    return new AnyToAnyImporter<>(media, MediaContainerResource::photoToMedia);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `portability-types-common/src/main/java/org/datatransferproject/types/common/models/DataModel.java`
#### Snippet
```java
public abstract class DataModel extends PortableType {
  public Map<String, Integer> getCounts() {
    return null;
  }
}
```

## RuleId[ruleID=UnnecessaryLocalVariable]
### RuleId[ruleID=UnnecessaryLocalVariable]
Local variable `tokenData` is redundant
in `extensions/auth/portability-auth-harness-microsoft/src/main/java/org/datatransferproject/auth/microsoft/harness/AuthTestDriver.java`
#### Snippet
```java

    // get the token
    TokenAuthData tokenData = (TokenAuthData)
        authDataGenerator.generateAuthData(
            callbackBase, authCode, "1", configuration.getInitialAuthData(), null);
```

### RuleId[ruleID=UnnecessaryLocalVariable]
Local variable `authCode` is redundant
in `extensions/auth/portability-auth-harness-microsoft/src/main/java/org/datatransferproject/auth/microsoft/harness/AuthTestDriver.java`
#### Snippet
```java
        throw new AssertionError("AUTH ERROR: " + authResponse.code() + ":" + "<empty body>");
      }
      String authCode = new String(authBody.bytes());

      // System.out.println("AUTH: " + authResponse.code() + ":" + authCode);
```

### RuleId[ruleID=UnnecessaryLocalVariable]
Local variable `photoId` is redundant
in `extensions/data-transfer/portability-data-transfer-koofr/src/main/java/org/datatransferproject/transfer/koofr/common/KoofrMediaExport.java`
#### Snippet
```java

  protected void processPhoto(FilesFile file, String path, String albumId) {
    String photoId = path;
    String name = getFileName(file);
    String description = getFileDescription(file);
```

### RuleId[ruleID=UnnecessaryLocalVariable]
Local variable `albumId` is redundant
in `extensions/data-transfer/portability-data-transfer-koofr/src/main/java/org/datatransferproject/transfer/koofr/common/KoofrMediaExport.java`
#### Snippet
```java

  protected void processAlbum(FilesFile file, String path) {
    String albumId = path;
    String albumName = getFileName(file);
    String description = getFileDescription(file);
```

### RuleId[ruleID=UnnecessaryLocalVariable]
Local variable `videoId` is redundant
in `extensions/data-transfer/portability-data-transfer-koofr/src/main/java/org/datatransferproject/transfer/koofr/common/KoofrMediaExport.java`
#### Snippet
```java

  protected void processVideo(FilesFile file, String path, String albumId) {
    String videoId = path;
    String name = getFileName(file);
    String description = getFileDescription(file);
```

### RuleId[ruleID=UnnecessaryLocalVariable]
Local variable `result` is redundant
in `extensions/data-transfer/portability-data-transfer-deezer/src/main/java/org/datatransferproject/transfer/deezer/DeezerApi.java`
#### Snippet
```java
          "Bad status code: " + statusCode + " error: " + response.getStatusMessage());
    }
    String result =
        CharStreams.toString(new InputStreamReader(response.getContent(), Charsets.UTF_8));
    return result;
```

### RuleId[ruleID=UnnecessaryLocalVariable]
Local variable `response` is redundant
in `extensions/data-transfer/portability-data-transfer-smugmug/src/main/java/org/datatransferproject/transfer/smugmug/photos/SmugMugInterface.java`
#### Snippet
```java
    Preconditions.checkArgument(
        !Strings.isNullOrEmpty(url), "Album URI is required to retrieve album information");
    SmugMugAlbumImageResponse response =
        makeRequest(url, new TypeReference<SmugMugResponse<SmugMugAlbumImageResponse>>() {})
            .getResponse();
```

### RuleId[ruleID=UnnecessaryLocalVariable]
Local variable `accountInfo` is redundant
in `extensions/data-transfer/portability-data-transfer-mastodon/src/main/java/org/datatransferproject/transfer/mastodon/social/MastodonHttpUtilities.java`
#### Snippet
```java
  /** Gets the account info via verify_credentials. **/
  private Account fetchAccount() throws IOException {
    Account accountInfo = request(ACCOUNT_VERIFICATION_URL, Account.class);
    return accountInfo;
  }
```

## RuleId[ruleID=BusyWait]
### RuleId[ruleID=BusyWait]
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `portability-types-transfer/src/main/java/org/datatransferproject/types/transfer/retry/RetryingCallable.java`
#### Snippet
```java
          if (nextAttemptIntervalMillis > 0L) {
            try {
              Thread.sleep(nextAttemptIntervalMillis);
              // wait is now complete, retry
            } catch (InterruptedException ie) {
```

## RuleId[ruleID=UnstableApiUsage]
### RuleId[ruleID=UnstableApiUsage]
'com.google.common.util.concurrent.RateLimiter' is marked unstable with @Beta
in `extensions/data-transfer/portability-data-transfer-deezer/src/main/java/org/datatransferproject/transfer/deezer/DeezerApi.java`
#### Snippet
```java
  private final String accessToken;
  private final HttpTransport httpTransport;
  private final RateLimiter perUserRateLimiter;

  public DeezerApi(
```

### RuleId[ruleID=UnstableApiUsage]
'acquire()' is declared in unstable class 'com.google.common.util.concurrent.RateLimiter' marked with @Beta
in `extensions/data-transfer/portability-data-transfer-deezer/src/main/java/org/datatransferproject/transfer/deezer/DeezerApi.java`
#### Snippet
```java
        requestFactory.buildGetRequest(
            new GenericUrl(url + "?output=json&access_token=" + accessToken));
    perUserRateLimiter.acquire();
    HttpResponse response = getRequest.execute();
    int statusCode = response.getStatusCode();
```

### RuleId[ruleID=UnstableApiUsage]
'acquire()' is declared in unstable class 'com.google.common.util.concurrent.RateLimiter' marked with @Beta
in `extensions/data-transfer/portability-data-transfer-deezer/src/main/java/org/datatransferproject/transfer/deezer/DeezerApi.java`
#### Snippet
```java
                + "?output=json&request_method=post&access_token=" + accessToken
                + extraArgs));
    perUserRateLimiter.acquire();
    HttpResponse response = getRequest.execute();
    int statusCode = response.getStatusCode();
```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.util.concurrent.RateLimiter' is marked unstable with @Beta
in `extensions/data-transfer/portability-data-transfer-flickr/src/main/java/org/datatransferproject/datatransfer/flickr/photos/FlickrPhotosImporter.java`
#### Snippet
```java
  private final PhotosetsInterface photosetsInterface;
  private final Monitor monitor;
  private final RateLimiter perUserRateLimiter;

  public FlickrPhotosImporter(
```

### RuleId[ruleID=UnstableApiUsage]
'acquire()' is declared in unstable class 'com.google.common.util.concurrent.RateLimiter' marked with @Beta
in `extensions/data-transfer/portability-data-transfer-flickr/src/main/java/org/datatransferproject/datatransfer/flickr/photos/FlickrPhotosImporter.java`
#### Snippet
```java
          String albumDescription = cleanString(album.getDescription());

          perUserRateLimiter.acquire();
          Photoset photoset = photosetsInterface.create(albumName, albumDescription, firstPhotoId);
          monitor.debug(() -> String.format("Flickr importer created album: %s", album));
```

### RuleId[ruleID=UnstableApiUsage]
'acquire()' is declared in unstable class 'com.google.common.util.concurrent.RateLimiter' marked with @Beta
in `extensions/data-transfer/portability-data-transfer-flickr/src/main/java/org/datatransferproject/datatransfer/flickr/photos/FlickrPhotosImporter.java`
#### Snippet
```java
            .setTitle(photoTitle)
            .setDescription(photoDescription);
    perUserRateLimiter.acquire();
    try (InputStream is = connectionProvider.getInputStreamForItem(jobId, photo).getStream()) {
      String uploadResult = uploader.upload(is, uploadMetaData);
```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.util.concurrent.RateLimiter' is marked unstable with @Beta
in `extensions/data-transfer/portability-data-transfer-flickr/src/main/java/org/datatransferproject/datatransfer/flickr/photos/FlickrPhotosExporter.java`
#### Snippet
```java
  private final PhotosInterface photosInterface;
  private final Flickr flickr;
  private final RateLimiter perUserRateLimiter;

  public FlickrPhotosExporter(AppCredentials appCredentials, TransferServiceConfig serviceConfig) {
```

### RuleId[ruleID=UnstableApiUsage]
'acquire()' is declared in unstable class 'com.google.common.util.concurrent.RateLimiter' marked with @Beta
in `extensions/data-transfer/portability-data-transfer-flickr/src/main/java/org/datatransferproject/datatransfer/flickr/photos/FlickrPhotosExporter.java`
#### Snippet
```java

    try {
      perUserRateLimiter.acquire();
      photoSetList =
          photosetsInterface.getList(
```

### RuleId[ruleID=UnstableApiUsage]
'acquire()' is declared in unstable class 'com.google.common.util.concurrent.RateLimiter' marked with @Beta
in `extensions/data-transfer/portability-data-transfer-flickr/src/main/java/org/datatransferproject/datatransfer/flickr/photos/FlickrPhotosExporter.java`
#### Snippet
```java
      if (Strings.isNullOrEmpty(photoSetId)) {
        RequestContext.getRequestContext().setExtras(EXTRAS);
        perUserRateLimiter.acquire();
        photoSetList = photosInterface.getNotInSet(PHOTO_PER_PAGE, page);
        RequestContext.getRequestContext().setExtras(ImmutableList.of());
```

### RuleId[ruleID=UnstableApiUsage]
'acquire()' is declared in unstable class 'com.google.common.util.concurrent.RateLimiter' marked with @Beta
in `extensions/data-transfer/portability-data-transfer-flickr/src/main/java/org/datatransferproject/datatransfer/flickr/photos/FlickrPhotosExporter.java`
#### Snippet
```java
        RequestContext.getRequestContext().setExtras(ImmutableList.of());
      } else {
        perUserRateLimiter.acquire();
        photoSetList =
            photosetsInterface.getPhotos(
```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.util.concurrent.RateLimiter' is marked unstable with @Beta
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/music/GoogleMusicHttpApi.java`
#### Snippet
```java
  private final Monitor monitor;
  private final GoogleCredentialFactory credentialFactory;
  private final RateLimiter writeRateLimiter;

  GoogleMusicHttpApi(
```

### RuleId[ruleID=UnstableApiUsage]
'acquire()' is declared in unstable class 'com.google.common.util.concurrent.RateLimiter' marked with @Beta
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/music/GoogleMusicHttpApi.java`
#### Snippet
```java
      throws IOException, InvalidTokenException, PermissionDeniedException {
    // Wait for write permit before making request
    writeRateLimiter.acquire();

    HttpRequestFactory requestFactory = httpTransport.createRequestFactory();
```

### RuleId[ruleID=UnstableApiUsage]
'acquire()' is declared in unstable class 'com.google.common.util.concurrent.RateLimiter' marked with @Beta
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/music/GoogleMusicHttpApi.java`
#### Snippet
```java
      throws IOException, InvalidTokenException, PermissionDeniedException {
    // Wait for write permit before making request
    writeRateLimiter.acquire();

    HttpRequestFactory requestFactory = httpTransport.createRequestFactory();
```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.util.concurrent.RateLimiter' is marked unstable with @Beta
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/music/GoogleMusicHttpApi.java`
#### Snippet
```java
    this.monitor = monitor;
    this.credentialFactory = credentialFactory;
    this.writeRateLimiter = RateLimiter.create(writesPerSecond);
  }

```

### RuleId[ruleID=UnstableApiUsage]
'create(double)' is declared in unstable class 'com.google.common.util.concurrent.RateLimiter' marked with @Beta
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/music/GoogleMusicHttpApi.java`
#### Snippet
```java
    this.monitor = monitor;
    this.credentialFactory = credentialFactory;
    this.writeRateLimiter = RateLimiter.create(writesPerSecond);
  }

```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.util.concurrent.RateLimiter' is marked unstable with @Beta
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/photos/GooglePhotosInterface.java`
#### Snippet
```java
  private final Monitor monitor;
  private final GoogleCredentialFactory credentialFactory;
  private final RateLimiter writeRateLimiter;

  GooglePhotosInterface(
```

### RuleId[ruleID=UnstableApiUsage]
'acquire()' is declared in unstable class 'com.google.common.util.concurrent.RateLimiter' marked with @Beta
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/photos/GooglePhotosInterface.java`
#### Snippet
```java
      throws IOException, InvalidTokenException, PermissionDeniedException, UploadErrorException {
    // Wait for write permit before making request
    writeRateLimiter.acquire();

    HttpRequestFactory requestFactory = httpTransport.createRequestFactory();
```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.util.concurrent.RateLimiter' is marked unstable with @Beta
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/photos/GooglePhotosInterface.java`
#### Snippet
```java
    this.monitor = monitor;
    this.credentialFactory = credentialFactory;
    writeRateLimiter = RateLimiter.create(writesPerSecond);
  }

```

### RuleId[ruleID=UnstableApiUsage]
'create(double)' is declared in unstable class 'com.google.common.util.concurrent.RateLimiter' marked with @Beta
in `extensions/data-transfer/portability-data-transfer-google/src/main/java/org/datatransferproject/datatransfer/google/photos/GooglePhotosInterface.java`
#### Snippet
```java
    this.monitor = monitor;
    this.credentialFactory = credentialFactory;
    writeRateLimiter = RateLimiter.create(writesPerSecond);
  }

```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.util.concurrent.RateLimiter' is marked unstable with @Beta
in `portability-types-transfer/src/main/java/org/datatransferproject/types/transfer/serviceconfig/TransferServiceConfig.java`
#### Snippet
```java
  private static final ObjectMapper YAML_OBJECT_MAPPER = new ObjectMapper(new YAMLFactory());

  private final RateLimiter rateLimiter;

  public static TransferServiceConfig create(InputStream s) throws IOException {
```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.util.concurrent.RateLimiter' is marked unstable with @Beta
in `portability-types-transfer/src/main/java/org/datatransferproject/types/transfer/serviceconfig/TransferServiceConfig.java`
#### Snippet
```java
  private TransferServiceConfig(TransferServiceConfigSpecification specification) {
    checkNotNull(specification, "specification can't be null");
    rateLimiter = RateLimiter.create(specification.getPerUserRateLimit());
  }

```

### RuleId[ruleID=UnstableApiUsage]
'create(double)' is declared in unstable class 'com.google.common.util.concurrent.RateLimiter' marked with @Beta
in `portability-types-transfer/src/main/java/org/datatransferproject/types/transfer/serviceconfig/TransferServiceConfig.java`
#### Snippet
```java
  private TransferServiceConfig(TransferServiceConfigSpecification specification) {
    checkNotNull(specification, "specification can't be null");
    rateLimiter = RateLimiter.create(specification.getPerUserRateLimit());
  }

```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.util.concurrent.RateLimiter' is marked unstable with @Beta
in `portability-types-transfer/src/main/java/org/datatransferproject/types/transfer/serviceconfig/TransferServiceConfig.java`
#### Snippet
```java

  /**
   * A {@link RateLimiter} that enforces the per-user rate limit that is specified in
   * the config/[service].yaml config file.
   **/
```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.util.concurrent.RateLimiter' is marked unstable with @Beta
in `portability-types-transfer/src/main/java/org/datatransferproject/types/transfer/serviceconfig/TransferServiceConfig.java`
#### Snippet
```java
   * the config/[service].yaml config file.
   **/
  public RateLimiter getPerUserRateLimiter() {
    return rateLimiter;
  }
```

## RuleId[ruleID=CastCanBeRemovedNarrowingVariableType]
### RuleId[ruleID=CastCanBeRemovedNarrowingVariableType]
Cast may be removed by changing the type of 'newPage' to 'IntPaginationToken'
in `extensions/data-transfer/portability-data-transfer-imgur/src/main/java/org/datatransferproject/datatransfer/imgur/photos/ImgurPhotosExporter.java`
#### Snippet
```java
    if (hasMore) {
      newPage = new IntPaginationToken(page + 1);
      int start = ((IntPaginationToken) newPage).getStart();
      monitor.info(() -> format("albums size: %s, newPage: %s", items.size(), start));
    }
```

