# bundletool 
 
# Bad smells
I found 529 bad smells with 8 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnstableApiUsage | 130 | false |
| OptionalUsedAsFieldOrParameterType | 100 | false |
| JavadocReference | 73 | false |
| DataFlowIssue | 57 | false |
| OptionalGetWithoutIsPresent | 56 | false |
| OptionalIsPresent | 11 | false |
| DuplicatedCode | 9 | false |
| ConstantValue | 9 | false |
| Deprecation | 8 | false |
| JavadocLinkAsPlainText | 7 | false |
| SimplifyStreamApiCallChains | 6 | false |
| SuspiciousMethodCalls | 6 | false |
| NullableProblems | 6 | false |
| UnnecessarySemicolon | 5 | false |
| UnnecessaryModifier | 4 | true |
| SwitchStatementWithTooFewBranches | 4 | false |
| RedundantStringFormatCall | 4 | false |
| ReplaceInefficientStreamCount | 3 | false |
| DeprecatedIsStillUsed | 3 | false |
| TrivialIf | 3 | false |
| UnnecessaryLocalVariable | 3 | true |
| EmptyStatementBody | 2 | false |
| IgnoreResultOfCall | 2 | false |
| UNCHECKED_WARNING | 1 | false |
| MagicConstant | 1 | false |
| BoxingBoxedValue | 1 | false |
| UnnecessaryCallToStringValueOf | 1 | false |
| FinalMethodInFinalClass | 1 | false |
| FinalPrivateMethod | 1 | false |
| CollectionAddAllCanBeReplacedWithConstructor | 1 | false |
| UnnecessaryToStringCall | 1 | true |
| FieldCanBeLocal | 1 | false |
| AutoCloseableResource | 1 | false |
| SimplifyOptionalCallChains | 1 | false |
| UNUSED_IMPORT | 1 | false |
| JavadocDeclaration | 1 | false |
| FieldMayBeFinal | 1 | false |
| SlowAbstractSetRemoveAll | 1 | false |
| ConfusingMainMethod | 1 | false |
| BusyWait | 1 | false |
| BigDecimalMethodWithoutRoundingCalled | 1 | false |
## RuleId[id=OptionalIsPresent]
### OptionalIsPresent
Can be replaced with single expression in functional style
in `src/main/java/com/android/tools/build/bundletool/model/ManifestEditor.java`
#### Snippet
```java
            .getOptionalChildElement(APPLICATION_ELEMENT_NAME)
            .flatMap(applicationElement -> applicationElement.getAndroidAttribute(attrResourceId));
    if (attribute.isPresent()) {
      manifestElement
          .getOrCreateChildElement(APPLICATION_ELEMENT_NAME)
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `src/main/java/com/android/tools/build/bundletool/model/ManifestEditor.java`
#### Snippet
```java
    Optional<XmlProtoAttribute> attribute =
        from.getManifestElement().getAndroidAttribute(attrResourceId);
    if (attribute.isPresent()) {
      manifestElement.addAttribute(attribute.get().toBuilder());
    }
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `src/main/java/com/android/tools/build/bundletool/model/utils/SdkToolsLocator.java`
#### Snippet
```java

    Optional<Path> adbOnPath = locateBinaryOnSystemPath(ADB_PATH_GLOB, systemEnvironmentProvider);
    if (adbOnPath.isPresent()) {
      return adbOnPath;
    }
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `src/main/java/com/android/tools/build/bundletool/commands/BuildApksManager.java`
#### Snippet
```java

  private boolean matchModuleToDevice(BundleModule module) {
    if (!this.deviceSpec.isPresent()) {
      return false;
    }
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `src/main/java/com/android/tools/build/bundletool/androidtools/AdbCommand.java`
#### Snippet
```java
        commandBuilder.add("--enable-rollback");
      }
      if (timeout.isPresent()) {
        commandBuilder
            .add("--staged-ready-timeout")
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `src/main/java/com/android/tools/build/bundletool/validation/CountrySetParityValidator.java`
#### Snippet
```java
            .collect(toOptional());

    if (countrySetDefaultSuffix.isPresent()) {
      validateDefaultCountrySetSupportedByAllModules(bundle, countrySetDefaultSuffix.get());
    }
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `src/main/java/com/android/tools/build/bundletool/model/targeting/ScreenDensitySelector.java`
#### Snippet
```java
      return Range.atMost(highMidPoint.get());
    }
    if (!highMidPoint.isPresent()) {
      return Range.atLeast(lowMidPoint.get());
    }
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `src/main/java/com/android/tools/build/bundletool/archive/ArchivedResourcesHelper.java`
#### Snippet
```java
                    String.format("%s.xml", CLOUD_SYMBOL_DRAWABLE_NAME)),
                resourceReader.getResourceByteSource(CLOUD_SYMBOL_PATH));
    if (iconAttribute.isPresent()) {
      additionalResourcesByDestinationPathBuilder.put(
          BundleModule.DRAWABLE_RESOURCE_DIRECTORY.resolve(
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `src/main/java/com/android/tools/build/bundletool/archive/ArchivedResourcesHelper.java`
#### Snippet
```java
                  .toByteArray()));
    }
    if (roundIconAttribute.isPresent()) {
      additionalResourcesByDestinationPathBuilder.put(
          BundleModule.DRAWABLE_RESOURCE_DIRECTORY.resolve(
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `src/main/java/com/android/tools/build/bundletool/archive/ArchivedResourcesHelper.java`
#### Snippet
```java
    if (roundIconAttribute.isPresent() || iconAttribute.isPresent()) {
      int iconResId =
          iconAttribute.isPresent()
              ? iconAttribute.get().getValueAsRefId()
              : roundIconAttribute.get().getValueAsRefId();
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `src/main/java/com/android/tools/build/bundletool/model/AndroidManifest.java`
#### Snippet
```java
  public Range<Integer> getSdkRange() {
    Optional<Integer> maxSdkVersion = getMaxSdkVersion();
    if (maxSdkVersion.isPresent()) {
      return Range.closed(getEffectiveMinSdkVersion(), maxSdkVersion.get());
    } else {
```

## RuleId[id=ReplaceInefficientStreamCount]
### ReplaceInefficientStreamCount
Can be replaced with 'stream.findAny().isPresent()'
in `src/main/java/com/android/tools/build/bundletool/splitters/LanguageResourcesSplitter.java`
#### Snippet
```java
              /* removeEntryPredicate= */ pinResourceToMaster.negate(),
              /* configValuesFilterFn= */ ResourceTableEntry::getEntry);
      if (hasNonResourceEntries || entries(pinnedResources).count() > 0) {
        resourceTableByLanguage.put("", pinnedResources);
      }
```

### ReplaceInefficientStreamCount
Can be replaced with '!stream.findAny().isPresent()'
in `src/main/java/com/android/tools/build/bundletool/validation/BundleValidationUtils.java`
#### Snippet
```java
  /** Checks whether directory inside the specified module contains any files. */
  public static boolean directoryContainsNoFiles(BundleModule module, ZipPath dir) {
    return module.findEntriesUnderPath(dir).count() == 0;
  }

```

### ReplaceInefficientStreamCount
Can be replaced with '!stream.findAny().isPresent()'
in `src/main/java/com/android/tools/build/bundletool/validation/ApexBundleValidator.java`
#### Snippet
```java
  @Override
  public void validateModule(BundleModule module) {
    if (module.findEntriesUnderPath(APEX_DIRECTORY).count() == 0) {
      return;
    }
```

## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/com/android/tools/build/bundletool/model/SigningConfigurationProvider.java`
#### Snippet
```java
  /** Description of an APK generated by bundletool. */
  @AutoValue
  public abstract class ApkDescription {

    /** Minimum SDK version from Android manifest. */
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `src/main/java/com/android/tools/build/bundletool/model/BundleModule.java`
#### Snippet
```java
    private final ZipPath entryPath;

    private SpecialModuleEntry(String entryPath) {
      this.entryPath = ZipPath.create(entryPath);
    }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/com/android/tools/build/bundletool/preprocessors/AppBundlePreprocessor.java`
#### Snippet
```java
/** An {@link AppBundle} preprocessor that is executed before the splitting pipelines. */
public interface AppBundlePreprocessor {
  public AppBundle preprocess(AppBundle appBundle);
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/com/android/tools/build/bundletool/androidtools/P7ZipCommand.java`
#### Snippet
```java
   * threads that should be used for compression.
   */
  public static P7ZipCommand defaultP7ZipCommand(Path p7zipExecutable, int numThreads) {
    return (outputPath, inputDirectoryPath) -> {
      ImmutableList<String> command =
```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `src/main/java/com/android/tools/build/bundletool/model/targeting/AlternativeVariantTargetingPopulator.java`
#### Snippet
```java
                        partitionedRuntimeEnabledAndRegularSplits.get(true)))
            .addAll(
                new SdkVersionAlternativesPopulator(maxSdkVersion)
                    .addAlternativeVariantTargeting(
                        partitionedRuntimeEnabledAndRegularSplits.get(false), standaloneApks))
            .addAll(generatedApks.getInstantApks())
```

## RuleId[id=MagicConstant]
### MagicConstant
Should be one of: Calendar.JANUARY, Calendar.FEBRUARY, Calendar.MARCH, Calendar.APRIL, Calendar.MAY, ...
in `src/main/java/com/android/tools/build/bundletool/io/ZipBuilder.java`
#### Snippet
```java
  /** Normalize timestamps. */
  private static final long DEFAULT_TIMESTAMP =
      new GregorianCalendar(2010, 0, 1, 0, 0, 0).getTimeInMillis();

  /** Entries to be output. */
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `RuntimeEnabledSdkConfig`
in `src/main/java/com/android/tools/build/bundletool/validation/RuntimeEnabledSdkConfigValidator.java`
#### Snippet
```java
  /**
   * Validates that there is exactly 1 dependency on each runtime-enabled SDK, and that all required
   * fields are set inside each {@link RuntimeEnabledSdkConfig}.
   */
  @Override
```

### JavadocReference
Cannot resolve symbol `DeviceSpec`
in `src/main/java/com/android/tools/build/bundletool/device/DeviceGroupModuleMatcher.java`
#### Snippet
```java
 *
 * <p>Device groups are an artificial concept and they are explicitly defined in the {@link
 * DeviceSpec}.
 */
public class DeviceGroupModuleMatcher
```

### JavadocReference
Cannot resolve symbol `ApkDescription`
in `src/main/java/com/android/tools/build/bundletool/device/ApkMatcher.java`
#### Snippet
```java
   *
   * @param buildApksResult describes APKs produced by the BundleTool
   * @return paths of the matching APKs as represented by {@link ApkDescription#getPath()}
   */
  public ImmutableList<GeneratedApk> getMatchingApks(BuildApksResult buildApksResult) {
```

### JavadocReference
Cannot resolve symbol `getPath()`
in `src/main/java/com/android/tools/build/bundletool/device/ApkMatcher.java`
#### Snippet
```java
   *
   * @param buildApksResult describes APKs produced by the BundleTool
   * @return paths of the matching APKs as represented by {@link ApkDescription#getPath()}
   */
  public ImmutableList<GeneratedApk> getMatchingApks(BuildApksResult buildApksResult) {
```

### JavadocReference
Cannot resolve symbol `RuntimeEnabledSdk`
in `src/main/java/com/android/tools/build/bundletool/model/ModuleSplit.java`
#### Snippet
```java

  /**
   * Adds uses-sdk-library elements that correspond to the given {@link RuntimeEnabledSdk}s to the
   * manifest.
   */
```

### JavadocReference
Cannot resolve symbol `DeviceSpec`
in `src/main/java/com/android/tools/build/bundletool/device/CountrySetApkMatcher.java`
#### Snippet
```java
 * A {@link TargetingDimensionMatcher} that provides APK matching on country set.
 *
 * <p>Country Set is a user attribute and it is explicitly defined in the {@link DeviceSpec}.
 */
public class CountrySetApkMatcher extends TargetingDimensionMatcher<CountrySetTargeting> {
```

### JavadocReference
Cannot resolve symbol `DeviceSpec`
in `src/main/java/com/android/tools/build/bundletool/device/DeviceSpecUtils.java`
#### Snippet
```java
import java.util.Optional;

/** Utils for {@link DeviceSpec}. */
public final class DeviceSpecUtils {
  private static final String GL_ES_VERSION_FEATURE_PREFIX = "reqGlEsVersion=";
```

### JavadocReference
Cannot resolve symbol `DeviceSpec`
in `src/main/java/com/android/tools/build/bundletool/device/DeviceSpecUtils.java`
#### Snippet
```java
  }

  /** Utils for building {@link DeviceSpec} from targetings. */
  public static class DeviceSpecFromTargetingBuilder {
    private final DeviceSpec.Builder deviceSpec;
```

### JavadocReference
Cannot resolve symbol `DeviceSelector`
in `src/main/java/com/android/tools/build/bundletool/device/DeviceTargetingConfigEvaluator.java`
#### Snippet
```java

  /**
   * Returns the union of all {@link DeviceSelector}s specified by the {@link DeviceGroup}s in the
   * provided {@link DeviceTier}.
   */
```

### JavadocReference
Cannot resolve symbol `DeviceGroup`
in `src/main/java/com/android/tools/build/bundletool/device/DeviceTargetingConfigEvaluator.java`
#### Snippet
```java

  /**
   * Returns the union of all {@link DeviceSelector}s specified by the {@link DeviceGroup}s in the
   * provided {@link DeviceTier}.
   */
```

### JavadocReference
Cannot resolve symbol `DeviceTier`
in `src/main/java/com/android/tools/build/bundletool/device/DeviceTargetingConfigEvaluator.java`
#### Snippet
```java
  /**
   * Returns the union of all {@link DeviceSelector}s specified by the {@link DeviceGroup}s in the
   * provided {@link DeviceTier}.
   */
  public static ImmutableSet<DeviceSelector> getDeviceSelectorsInTier(
```

### JavadocReference
Cannot resolve symbol `DeviceTier`
in `src/main/java/com/android/tools/build/bundletool/device/DeviceTargetingConfigEvaluator.java`
#### Snippet
```java
  }

  /** Sorts a list of {@link DeviceTier}s by level from highest to lowest. */
  public static ImmutableList<DeviceTier> getSortedDeviceTiers(DeviceTierConfig config) {
    return ImmutableList.sortedCopyOf(
```

### JavadocReference
Cannot resolve symbol `DeviceGroup`
in `src/main/java/com/android/tools/build/bundletool/device/DeviceTargetingConfigEvaluator.java`
#### Snippet
```java
  }

  /** Gets the set of {@link DeviceGroup}s that match the provided {@link DeviceProperties}. */
  public static ImmutableSet<DeviceGroup> getMatchingDeviceGroups(
      DeviceTierConfig config, DeviceProperties deviceProperties) {
```

### JavadocReference
Cannot resolve symbol `DeviceProperties`
in `src/main/java/com/android/tools/build/bundletool/device/DeviceTargetingConfigEvaluator.java`
#### Snippet
```java
  }

  /** Gets the set of {@link DeviceGroup}s that match the provided {@link DeviceProperties}. */
  public static ImmutableSet<DeviceGroup> getMatchingDeviceGroups(
      DeviceTierConfig config, DeviceProperties deviceProperties) {
```

### JavadocReference
Cannot resolve symbol `UserCountrySet`
in `src/main/java/com/android/tools/build/bundletool/device/DeviceTargetingConfigEvaluator.java`
#### Snippet
```java
  }

  /** Get the {@link UserCountrySet} that matches the provided user country. */
  public static String getMatchingCountrySet(DeviceTierConfig config, String countryCode) {
    return config.getUserCountrySetsList().stream()
```

### JavadocReference
Cannot resolve symbol `DeviceGroup`
in `src/main/java/com/android/tools/build/bundletool/device/DeviceTargetingConfigEvaluator.java`
#### Snippet
```java
  }

  /** Creates a map from {@link DeviceGroup} name to {@link DeviceGroup}. */
  public static ImmutableMap<String, DeviceGroup> getDeviceGroupNameToDeviceGroupMap(
      DeviceTierConfig config) {
```

### JavadocReference
Cannot resolve symbol `DeviceGroup`
in `src/main/java/com/android/tools/build/bundletool/device/DeviceTargetingConfigEvaluator.java`
#### Snippet
```java
  }

  /** Creates a map from {@link DeviceGroup} name to {@link DeviceGroup}. */
  public static ImmutableMap<String, DeviceGroup> getDeviceGroupNameToDeviceGroupMap(
      DeviceTierConfig config) {
```

### JavadocReference
Cannot resolve symbol `DeviceTierConfig`
in `src/main/java/com/android/tools/build/bundletool/device/DeviceTargetingConfigEvaluator.java`
#### Snippet
```java
import java.util.Optional;

/** Utility class to evaluate {@link DeviceTierConfig} and {@link DeviceProperties}. */
public class DeviceTargetingConfigEvaluator {

```

### JavadocReference
Cannot resolve symbol `DeviceProperties`
in `src/main/java/com/android/tools/build/bundletool/device/DeviceTargetingConfigEvaluator.java`
#### Snippet
```java
import java.util.Optional;

/** Utility class to evaluate {@link DeviceTierConfig} and {@link DeviceProperties}. */
public class DeviceTargetingConfigEvaluator {

```

### JavadocReference
Cannot resolve symbol `DeviceTier`
in `src/main/java/com/android/tools/build/bundletool/device/DeviceTargetingConfigEvaluator.java`
#### Snippet
```java

  /**
   * Gets the highest {@link DeviceTier} that matches the provided {@link DeviceProperties}. If none
   * of the defined tiers match, an empty optional will be returned, indicating that the device
   * belongs in the default tier.
```

### JavadocReference
Cannot resolve symbol `DeviceProperties`
in `src/main/java/com/android/tools/build/bundletool/device/DeviceTargetingConfigEvaluator.java`
#### Snippet
```java

  /**
   * Gets the highest {@link DeviceTier} that matches the provided {@link DeviceProperties}. If none
   * of the defined tiers match, an empty optional will be returned, indicating that the device
   * belongs in the default tier.
```

### JavadocReference
Cannot resolve symbol `DeviceSpec`
in `src/main/java/com/android/tools/build/bundletool/device/TargetingDimensionMatcher.java`
#### Snippet
```java
  }

  /** Returns if the {@link DeviceSpec} has the dimension that this instance uses for matching. */
  protected abstract boolean isDeviceDimensionPresent();

```

### JavadocReference
Cannot resolve symbol `ModuleTargeting`
in `src/main/java/com/android/tools/build/bundletool/device/TargetingDimensionMatcher.java`
#### Snippet
```java

  /**
   * Returns a convenient predicate on {@link ModuleTargeting}.
   *
   * <p>As this is used to determine if a conditional module should be installed, the device
```

### JavadocReference
Cannot resolve symbol `VariantTargeting`
in `src/main/java/com/android/tools/build/bundletool/device/TargetingDimensionMatcher.java`
#### Snippet
```java

  /**
   * Returns a convenient predicate on {@link VariantTargeting} message.
   *
   * @return a predicate that extracts the targeting value from the {@link VariantTargeting} message
```

### JavadocReference
Cannot resolve symbol `VariantTargeting`
in `src/main/java/com/android/tools/build/bundletool/device/TargetingDimensionMatcher.java`
#### Snippet
```java
   * Returns a convenient predicate on {@link VariantTargeting} message.
   *
   * @return a predicate that extracts the targeting value from the {@link VariantTargeting} message
   *     and calls the {@link TargetingDimensionMatcher#matchesTargeting}. If the device spec
   *     doesn't target this dimension, we match the spec with any targeting of the dimension.
```

### JavadocReference
Cannot resolve symbol `CommandExecutionException`
in `src/main/java/com/android/tools/build/bundletool/device/TargetingDimensionMatcher.java`
#### Snippet
```java
   * Checks if a device is compatible with a given targeting considering alternatives.
   *
   * @throws CommandExecutionException if a device can't support given targeting value
   */
  public void checkDeviceCompatible(T targetingValue) {
```

### JavadocReference
Cannot resolve symbol `DeviceSpec`
in `src/main/java/com/android/tools/build/bundletool/device/TargetingDimensionMatcher.java`
#### Snippet
```java

/**
 * Matches the targeting value T against a {@link DeviceSpec} in the APK and Variant targeting
 * context.
 *
```

### JavadocReference
Cannot resolve symbol `ApkTargeting`
in `src/main/java/com/android/tools/build/bundletool/device/TargetingDimensionMatcher.java`
#### Snippet
```java

  /**
   * Returns a convenient predicate on {@link ApkTargeting} message.
   */
  public Predicate<ApkTargeting> getApkTargetingPredicate() {
```

### JavadocReference
Cannot resolve symbol `SDK_METADATA_FILE_NAME`
in `src/main/java/com/android/tools/build/bundletool/model/SdkAsar.java`
#### Snippet
```java
  }

  /** Loads {@link SDK_METADATA_FILE_NAME} from zip file into {@link SdkMetadata}. */
  @SuppressWarnings("ProtoParseWithRegistry")
  private static SdkMetadata readSdkMetadata(ZipFile asarFile) {
```

### JavadocReference
Cannot resolve symbol `SdkMetadata`
in `src/main/java/com/android/tools/build/bundletool/model/SdkAsar.java`
#### Snippet
```java
  }

  /** Loads {@link SDK_METADATA_FILE_NAME} from zip file into {@link SdkMetadata}. */
  @SuppressWarnings("ProtoParseWithRegistry")
  private static SdkMetadata readSdkMetadata(ZipFile asarFile) {
```

### JavadocReference
Cannot resolve symbol `Sizes`
in `src/main/java/com/android/tools/build/bundletool/size/SizeUtils.java`
#### Snippet
```java
import com.android.bundle.SizesOuterClass.Sizes;

/** Utilities for computations using {@link Sizes} proto. */
public class SizeUtils {

```

### JavadocReference
Cannot resolve symbol `ValidationException`
in `src/main/java/com/android/tools/build/bundletool/validation/AppBundleValidator.java`
#### Snippet
```java
   * <p>Note that this method performs different checks than {@link #validateFile(ZipFile)}.
   *
   * @throws ValidationException If the bundle is invalid.
   */
  public void validate(AppBundle bundle) {
```

### JavadocReference
Cannot resolve symbol `getSigningCertificateLineage`
in `src/main/java/com/android/tools/build/bundletool/model/SigningConfiguration.java`
#### Snippet
```java
   * Config of the signer to sign the generated APKs.
   *
   * <p>If {@link getSigningCertificateLineage} is empty, then this is used for signing with all
   * supported signature schemes.
   *
```

### JavadocReference
Cannot resolve symbol `getSigningCertificateLineage`
in `src/main/java/com/android/tools/build/bundletool/model/SigningConfiguration.java`
#### Snippet
```java
   * supported signature schemes.
   *
   * <p>If {@link getSigningCertificateLineage} is present, then this corresponds to the newest
   * certificate in the lineage, and is used for v3 signing on qualifying APKs (see {@link
   * getMinimumV3RotationApiVersion}).
```

### JavadocReference
Cannot resolve symbol `getMinimumV3RotationApiVersion`
in `src/main/java/com/android/tools/build/bundletool/model/SigningConfiguration.java`
#### Snippet
```java
   * <p>If {@link getSigningCertificateLineage} is present, then this corresponds to the newest
   * certificate in the lineage, and is used for v3 signing on qualifying APKs (see {@link
   * getMinimumV3RotationApiVersion}).
   */
  public abstract SignerConfig getSignerConfig();
```

### JavadocReference
Cannot resolve symbol `getMinimumV3RotationApiVersion`
in `src/main/java/com/android/tools/build/bundletool/model/SigningConfiguration.java`
#### Snippet
```java
  /**
   * Signing certificate lineage used for v3 signing on qualifying APKs (see {@link
   * getMinimumV3RotationApiVersion}).
   */
  public abstract Optional<SigningCertificateLineage> getSigningCertificateLineage();
```

### JavadocReference
Cannot resolve symbol `getSigningCertificateLineage`
in `src/main/java/com/android/tools/build/bundletool/model/SigningConfiguration.java`
#### Snippet
```java
  /**
   * Config of the signer corresponsing to the oldest certificate in the {@link
   * getSigningCertificateLineage} (this can only be set if a lineage is present).
   *
   * <p>This is used for v1 and v2 signing on qualifying APKs that are signed with v3 key rotation
```

### JavadocReference
Cannot resolve symbol `getMinimumV3RotationApiVersion`
in `src/main/java/com/android/tools/build/bundletool/model/SigningConfiguration.java`
#### Snippet
```java
   *
   * <p>This is used for v1 and v2 signing on qualifying APKs that are signed with v3 key rotation
   * (see {@link getMinimumV3RotationApiVersion}). This is never used for v3 signing.
   */
  public abstract Optional<SignerConfig> getOldestSigner();
```

### JavadocReference
Cannot resolve symbol `VariantTargeting`
in `src/main/java/com/android/tools/build/bundletool/device/AssetModuleSizeAggregator.java`
#### Snippet
```java
 * passed to {@link com.android.tools.build.bundletool.commands.GetSizeCommand}.
 *
 * <p>Asset module slices are filtered based on the given {@link VariantTargeting} and {@link
 * com.android.bundle.Devices.DeviceSpec}.
 */
```

### JavadocReference
Cannot resolve symbol `com.android.bundle.Devices.DeviceSpec`
in `src/main/java/com/android/tools/build/bundletool/device/AssetModuleSizeAggregator.java`
#### Snippet
```java
 *
 * <p>Asset module slices are filtered based on the given {@link VariantTargeting} and {@link
 * com.android.bundle.Devices.DeviceSpec}.
 */
public class AssetModuleSizeAggregator extends AbstractSizeAggregator {
```

### JavadocReference
Cannot resolve symbol `NativeLibraries`
in `src/main/java/com/android/tools/build/bundletool/model/ModuleAbiSanitizer.java`
#### Snippet
```java
 * Makes sure that each "lib/<ABI>" directory contains the same number of files. If there is a
 * discrepancy, then ony directory(ies) with the most files is/are preserved, and the {@link
 * NativeLibraries} targeting is adjusted appropriately.
 *
 * <p>Reason for existence of this code is that if dependencies of a project contain some native
```

### JavadocReference
Cannot resolve symbol `DeviceSpec`
in `src/main/java/com/android/tools/build/bundletool/device/DeviceTierApkMatcher.java`
#### Snippet
```java
 * A {@link TargetingDimensionMatcher} that provides APK matching on device tier.
 *
 * <p>Device tier is an artificial concept and it is explicitly defined in the {@link DeviceSpec}.
 */
public class DeviceTierApkMatcher extends TargetingDimensionMatcher<DeviceTierTargeting> {
```

### JavadocReference
Cannot resolve symbol `SdkBundleConfig`
in `src/main/java/com/android/tools/build/bundletool/model/utils/BundleParser.java`
#### Snippet
```java
  }

  /** Loads {@value #SDK_BUNDLE_CONFIG_FILE_NAME} from zip file into {@link SdkBundleConfig}. */
  @SuppressWarnings("ProtoParseWithRegistry")
  public static SdkBundleConfig readSdkBundleConfig(ZipFile bundleFile) {
```

### JavadocReference
Cannot resolve symbol `SdkModulesConfig`
in `src/main/java/com/android/tools/build/bundletool/model/utils/BundleParser.java`
#### Snippet
```java
  }

  /** Loads {@value #SDK_MODULES_CONFIG_FILE_NAME} from zip file into {@link SdkModulesConfig}. */
  @SuppressWarnings("ProtoParseWithRegistry")
  public static SdkModulesConfig readSdkModulesConfig(ZipFile modulesFile) {
```

### JavadocReference
Cannot resolve symbol `BundleConfig`
in `src/main/java/com/android/tools/build/bundletool/model/utils/BundleParser.java`
#### Snippet
```java
  }

  /** Loads BundleConfig.pb from zip file into {@link BundleConfig} */
  @SuppressWarnings("ProtoParseWithRegistry")
  public static BundleConfig readBundleConfig(ZipFile bundleFile) {
```

### JavadocReference
Cannot resolve symbol `SAME_AS_SOURCE`
in `src/main/java/com/android/tools/build/bundletool/model/CompressionLevel.java`
#### Snippet
```java
   * Returns whether the compression level indicates a compression.
   *
   * <p>Note that in the case of {@link SAME_AS_SOURCE}, this method returns {@code false}.
   */
  public boolean isCompressed() {
```

### JavadocReference
Cannot resolve symbol `ApkTargeting`
in `src/main/java/com/android/tools/build/bundletool/splitters/ModuleSplitter.java`
#### Snippet
```java

  /**
   * Adds R+ targeting to the {@link ApkTargeting} of a module split if (a) the configuration is set
   * to restrict v3 signing to R+, and (b) the variant is targeted at R+. If SDK targeting already
   * exists and is greater than R+, then it is not overridden.
```

### JavadocReference
Cannot resolve symbol `BuildApksResult`
in `src/main/java/com/android/tools/build/bundletool/commands/InstallApksCommand.java`
#### Snippet
```java
  }

  /** Adds all supported languages in the given {@link BuildApksResult} to a {@link DeviceSpec}. */
  private static DeviceSpec addAllSupportedLanguages(DeviceSpec deviceSpec, BuildApksResult toc) {
    ImmutableSet<String> targetedLanguages = ResultUtils.getAllTargetedLanguages(toc);
```

### JavadocReference
Cannot resolve symbol `DeviceSpec`
in `src/main/java/com/android/tools/build/bundletool/commands/InstallApksCommand.java`
#### Snippet
```java
  }

  /** Adds all supported languages in the given {@link BuildApksResult} to a {@link DeviceSpec}. */
  private static DeviceSpec addAllSupportedLanguages(DeviceSpec deviceSpec, BuildApksResult toc) {
    ImmutableSet<String> targetedLanguages = ResultUtils.getAllTargetedLanguages(toc);
```

### JavadocReference
Cannot resolve symbol `BuildApksResult`
in `src/main/java/com/android/tools/build/bundletool/model/utils/ResultUtils.java`
#### Snippet
```java
  }

  /** Return the paths for all the base master splits in the given {@link BuildApksResult}. */
  public static ImmutableSet<String> getAllBaseMasterSplitPaths(BuildApksResult toc) {
    return splitApkVariants(toc).stream()
```

### JavadocReference
Cannot resolve symbol `DeviceSelector`
in `src/main/java/com/android/tools/build/bundletool/commands/PrintDeviceTargetingConfigCommand.java`
#### Snippet
```java
   * Prints a rule that is defined by a list.
   *
   * @return whether any selector rules have been printed for the given {@link DeviceSelector} once
   *     this method has executed.
   */
```

### JavadocReference
Cannot resolve symbol `DeviceSelector`
in `src/main/java/com/android/tools/build/bundletool/commands/PrintDeviceTargetingConfigCommand.java`
#### Snippet
```java
   * Prints the conditions on the device's RAM, if specified.
   *
   * @return whether any selector rules have been printed for the given {@link DeviceSelector} once
   *     this method has executed.
   */
```

### JavadocReference
Cannot resolve symbol `SdkVersionTargeting`
in `src/main/java/com/android/tools/build/bundletool/model/targeting/TargetingUtils.java`
#### Snippet
```java
   * variant targetings and SDK version range we want to support.
   *
   * <p>It is assumed that the variantTargetings contain only {@link SdkVersionTargeting}.
   *
   * <p>Each given and returned variant doesn't have the alternatives populated.
```

### JavadocReference
Cannot resolve symbol `DeviceSpec`
in `src/main/java/com/android/tools/build/bundletool/commands/BuildApksCommand.java`
#### Snippet
```java
    public abstract Builder setDeviceSpec(DeviceSpec deviceSpec);

    /** Sets the {@link DeviceSpec} for which the only the matching APKs will be generated. */
    public Builder setDeviceSpec(Path deviceSpecFile) {
      // Parse as partial and fully validate later.
```

### JavadocReference
Cannot resolve symbol `DeviceSpec`
in `src/main/java/com/android/tools/build/bundletool/commands/BuildApksCommand.java`
#### Snippet
```java
    public abstract Builder setModules(ImmutableSet<String> modules);

    /** Sets the {@link DeviceSpec} for which the only the matching APKs will be generated. */
    public abstract Builder setDeviceSpec(DeviceSpec deviceSpec);

```

### JavadocReference
Cannot resolve symbol `SdkVersionTargeting`
in `src/main/java/com/android/tools/build/bundletool/splitters/SdkRuntimeVariantGenerator.java`
#### Snippet
```java
   *
   * <p>It is assumed that the {@code sdkVersionVariantTargetings} contain only {@link
   * SdkVersionTargeting}.
   *
   * <p>This method generates a new {@link VariantTargeting} for each element of {@code
```

### JavadocReference
Cannot resolve symbol `VariantTargeting`
in `src/main/java/com/android/tools/build/bundletool/splitters/SdkRuntimeVariantGenerator.java`
#### Snippet
```java
   * SdkVersionTargeting}.
   *
   * <p>This method generates a new {@link VariantTargeting} for each element of {@code
   * sdkVersionVariantTargetings} that targets SDK version higher than {@link
   * Versions#ANDROID_T_API_VERSION}, as well as one variant targeting {@link
```

### JavadocReference
Cannot resolve symbol `ApkTargeting`
in `src/main/java/com/android/tools/build/bundletool/shards/SuffixStripper.java`
#### Snippet
```java
    AssetsDirectoryTargeting clearTargetingDimension(AssetsDirectoryTargeting directoryTargeting);

    /** Sets a targeting value for the handled dimension in the given {@link ApkTargeting}. */
    ApkTargeting setTargetingDimension(ApkTargeting apkTargeting, String value);

```

### JavadocReference
Cannot resolve symbol `SuffixStripping`
in `src/main/java/com/android/tools/build/bundletool/shards/SuffixStripper.java`
#### Snippet
```java

  /**
   * Applies the given {@link SuffixStripping} to a {@link ModuleSplit}.
   *
   * <p>This will remove all assets that target a suffix other than the default and strip the suffix
```

### JavadocReference
Cannot resolve symbol `AssetsDirectoryTargeting`
in `src/main/java/com/android/tools/build/bundletool/shards/SuffixStripper.java`
#### Snippet
```java
    /**
     * Removes the targeting for the handled dimension in the given {@link
     * AssetsDirectoryTargeting}.
     */
    AssetsDirectoryTargeting clearTargetingDimension(AssetsDirectoryTargeting directoryTargeting);
```

### JavadocReference
Cannot resolve symbol `VariantTargeting`
in `src/main/java/com/android/tools/build/bundletool/shards/SuffixStripper.java`
#### Snippet
```java
    ApkTargeting setTargetingDimension(ApkTargeting apkTargeting, String value);

    /** Sets a targeting value for the handled dimension in the given {@link VariantTargeting}. */
    VariantTargeting setTargetingDimension(VariantTargeting variantTargeting, String value);

```

### JavadocReference
Cannot resolve symbol `AssetsDirectoryTargeting`
in `src/main/java/com/android/tools/build/bundletool/shards/SuffixStripper.java`
#### Snippet
```java
  private interface TargetingDimensionHandler {

    /** Checks if the given {@link AssetsDirectoryTargeting} targets the handled dimension. */
    boolean hasTargetingDimension(AssetsDirectoryTargeting directoryTargeting);

```

### JavadocReference
Cannot resolve symbol `enabledSinceVersion`
in `src/main/java/com/android/tools/build/bundletool/model/version/VersionGuardedFeature.java`
#### Snippet
```java
   * Version from which the given feature should be disabled by default.
   *
   * <p>This provides an exclusive upper bound for {@link enabledSinceVersion}. If missing, feature
   * is enabled indefinitely.
   */
```

### JavadocReference
Cannot resolve symbol `DeviceSpec`
in `src/main/java/com/android/tools/build/bundletool/io/ApkSerializerManager.java`
#### Snippet
```java

  /**
   * Adds a default country set to the given {@link DeviceSpec} if it has none.
   *
   * <p>The default country set is taken from the optimization settings in the {@link
```

### JavadocReference
Cannot resolve symbol `com.android.bundle.Config.BundleConfig`
in `src/main/java/com/android/tools/build/bundletool/io/ApkSerializerManager.java`
#### Snippet
```java
   *
   * <p>The default country set is taken from the optimization settings in the {@link
   * com.android.bundle.Config.BundleConfig}.
   */
  private DeviceSpec addDefaultCountrySetIfNecessary(DeviceSpec deviceSpec) {
```

### JavadocReference
Cannot resolve symbol `DeviceSpec`
in `src/main/java/com/android/tools/build/bundletool/io/ApkSerializerManager.java`
#### Snippet
```java

  /**
   * Adds a default device tier to the given {@link DeviceSpec} if it has none.
   *
   * <p>The default tier is taken from the optimization settings in the {@link
```

### JavadocReference
Cannot resolve symbol `com.android.bundle.Config.BundleConfig`
in `src/main/java/com/android/tools/build/bundletool/io/ApkSerializerManager.java`
#### Snippet
```java
   *
   * <p>The default tier is taken from the optimization settings in the {@link
   * com.android.bundle.Config.BundleConfig}. If suffix stripping is enabled but the default tier is
   * unspecified, it defaults to 0.
   */
```

### JavadocReference
Cannot resolve symbol `ApkDescription`
in `src/main/java/com/android/tools/build/bundletool/io/ModuleSplitSerializer.java`
#### Snippet
```java
   * Serializes module splits on disk under {@code outputDirectory}.
   *
   * <p>Returns {@link ApkDescription} for each serialized split keyed by relative path of module
   * split.
   */
```

### JavadocReference
Cannot resolve symbol `CodeTransparency`
in `src/main/java/com/android/tools/build/bundletool/transparency/CodeTransparencyFactory.java`
#### Snippet
```java
public final class CodeTransparencyFactory {

  /** Returns {@link CodeTransparency} for the given {@link AppBundle}. */
  public static CodeTransparency createCodeTransparencyMetadata(AppBundle bundle) {
    ImmutableList<CodeRelatedFile> codeRelatedFiles =
```

### JavadocReference
Cannot resolve symbol `CodeTransparency`
in `src/main/java/com/android/tools/build/bundletool/transparency/CodeTransparencyFactory.java`
#### Snippet
```java
import java.util.stream.Stream;

/** Shared static utilities for adding and verifying {@link CodeTransparency}. */
public final class CodeTransparencyFactory {

```

### JavadocReference
Cannot resolve symbol `CodeRelatedFile`
in `src/main/java/com/android/tools/build/bundletool/transparency/CodeTransparencyFactory.java`
#### Snippet
```java
  }

  /** Returns {@link CodeRelatedFile} for the given {@link AppBundle} for archived DEX file */
  private static CodeRelatedFile createArchivedCodeRelatedFile(AppBundle bundle) {
    CodeRelatedFile.Builder codeRelatedFile =
```

### JavadocReference
Cannot resolve symbol `CodeTransparency`
in `src/main/java/com/android/tools/build/bundletool/transparency/CodeTransparencyFactory.java`
#### Snippet
```java
  }

  /** Returns {@link CodeTransparency} parsed from transparency file JSON payload. */
  public static CodeTransparency parseFrom(String codeTransparency) {
    CodeTransparency.Builder codeTransparencyProto = CodeTransparency.newBuilder();
```

### JavadocReference
Cannot resolve symbol `ValidationException`
in `src/main/java/com/android/tools/build/bundletool/model/AndroidManifest.java`
#### Snippet
```java
   * Returns the <meta-data> XML element with the given "android:name" value if present.
   *
   * <p>Throws an {@link ValidationException} if there is more than one meta-data element with this
   * name.
   */
```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `src/main/java/com/android/tools/build/bundletool/device/DdmlibAdbServer.java`
#### Snippet
```java
    INITIALIZED,
    CLOSED
  };

  private DdmlibAdbServer() {}
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `src/main/java/com/android/tools/build/bundletool/model/ModuleDeliveryType.java`
#### Snippet
```java
  CONDITIONAL_INITIAL_INSTALL,
  // Covers both on-demand and fast-follow modes.
  NO_INITIAL_INSTALL;
}

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `src/main/java/com/android/tools/build/bundletool/shards/StandaloneApksGenerator.java`
#### Snippet
```java
    this.runtimeEnabledSdkTableInjector = new RuntimeEnabledSdkTableInjector(appBundle);
  }
  ;

  /**
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `src/main/java/com/android/tools/build/bundletool/model/targeting/TargetingDimension.java`
#### Snippet
```java
  TEXTURE_COMPRESSION_FORMAT,
  DEVICE_TIER,
  COUNTRY_SET;
}

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `src/main/java/com/android/tools/build/bundletool/commands/BuildApksCommand.java`
#### Snippet
```java
  public enum SystemApkOption {
    UNCOMPRESSED_NATIVE_LIBRARIES,
    UNCOMPRESSED_DEX_FILES;
  }

```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method reference argument might be null
in `src/main/java/com/android/tools/build/bundletool/device/ScreenDensityMatcher.java`
#### Snippet
```java
        new ScreenDensitySelector()
            .selectBestDensity(
                Iterables.transform(allDensities, ResourcesUtils::convertToDpi),
                getDeviceSpec().getScreenDensity());

```

### DataFlowIssue
Method invocation `hasInitialDeviceList` may produce `NullPointerException`
in `src/main/java/com/android/tools/build/bundletool/device/DdmlibAdbServer.java`
#### Snippet
```java
  public synchronized boolean hasInitialDeviceList() {
    checkState(state.equals(State.INITIALIZED), "Android Debug Bridge is not initialized.");
    return adb.hasInitialDeviceList();
  }

```

### DataFlowIssue
Method invocation `getDevices` may produce `NullPointerException`
in `src/main/java/com/android/tools/build/bundletool/device/DdmlibAdbServer.java`
#### Snippet
```java
  public synchronized ImmutableList<Device> getDevicesInternal() {
    checkState(state.equals(State.INITIALIZED), "Android Debug Bridge is not initialized.");
    return Arrays.stream(adb.getDevices()).map(DdmlibDevice::new).collect(toImmutableList());
  }

```

### DataFlowIssue
Method invocation `replace` may produce `NullPointerException`
in `src/main/java/com/android/tools/build/bundletool/model/ModuleSplit.java`
#### Snippet
```java
                        .inverse()
                        .get(value.getDensityAlias())
                        .replace('-', '_')));

    TextureCompressionFormatTargeting textureFormatTargeting =
```

### DataFlowIssue
Unboxing of `sizeByApkPaths.get( Iterables.getOnlyElement( Iterables.getOnlyEleme...` may produce `NullPointerException`
in `src/main/java/com/android/tools/build/bundletool/device/VariantTotalSizeAggregator.java`
#### Snippet
```java
    // Variants of standalone APKs have only one APK each.
    long compressedSize =
        sizeByApkPaths.get(
            Iterables.getOnlyElement(
                    Iterables.getOnlyElement(variant.getApkSetList()).getApkDescriptionList())
                .getPath());

    ImmutableMap<SizeConfiguration, Long> sizeConfigurationMap =
```

### DataFlowIssue
Method invocation `getDeviceSelectorsList` may produce `NullPointerException`
in `src/main/java/com/android/tools/build/bundletool/device/DeviceTargetingConfigEvaluator.java`
#### Snippet
```java
      DeviceTier deviceTier, ImmutableMap<String, DeviceGroup> deviceGroupNameToDeviceGroup) {
    return deviceTier.getDeviceGroupNamesList().stream()
        .map(name -> deviceGroupNameToDeviceGroup.get(name).getDeviceSelectorsList())
        .flatMap(List::stream)
        .collect(toImmutableSet());
```

### DataFlowIssue
Unboxing of `extraResourceNameToIdMap.get(ArchivedResourcesHelper.CLOUD_SYMBOL_DRAWABLE_NAME)` may produce `NullPointerException`
in `src/main/java/com/android/tools/build/bundletool/archive/ArchivedApksGenerator.java`
#### Snippet
```java
    ImmutableMap<ZipPath, ByteSource> additionalResourcesByByteSource =
        archivedResourcesHelper.buildAdditionalResourcesByByteSourceMap(
            extraResourceNameToIdMap.get(ArchivedResourcesHelper.CLOUD_SYMBOL_DRAWABLE_NAME),
            extraResourceNameToIdMap.get(ArchivedResourcesHelper.OPACITY_LAYER_DRAWABLE_NAME),
            iconAttribute,
```

### DataFlowIssue
Unboxing of `extraResourceNameToIdMap.get(ArchivedResourcesHelper.OPACITY_LAYER_DRAWABLE_NAME)` may produce `NullPointerException`
in `src/main/java/com/android/tools/build/bundletool/archive/ArchivedApksGenerator.java`
#### Snippet
```java
        archivedResourcesHelper.buildAdditionalResourcesByByteSourceMap(
            extraResourceNameToIdMap.get(ArchivedResourcesHelper.CLOUD_SYMBOL_DRAWABLE_NAME),
            extraResourceNameToIdMap.get(ArchivedResourcesHelper.OPACITY_LAYER_DRAWABLE_NAME),
            iconAttribute,
            roundIconAttribute,
```

### DataFlowIssue
Method reference argument might be null
in `src/main/java/com/android/tools/build/bundletool/splitters/AssetsDimensionSplitterFactory.java`
#### Snippet
```java
                    assets.getDirectoryList(),
                    targetedDirectory -> dimensionGetter.apply(targetedDirectory.getTargeting())),
                not(this::isDefaultTargeting));
        ImmutableList.Builder<ModuleSplit> splitsBuilder = new ImmutableList.Builder<>();
        // Generate config splits.
```

### DataFlowIssue
Method invocation `getEnabled` may produce `NullPointerException`
in `src/main/java/com/android/tools/build/bundletool/splitters/ApkGenerationConfiguration.java`
#### Snippet
```java
  public boolean shouldStripTargetingSuffix(OptimizationDimension dimension) {
    return getSuffixStrippings().containsKey(dimension)
        && getSuffixStrippings().get(dimension).getEnabled();
  }

```

### DataFlowIssue
Dereference of `KEY_TO_DIMENSION.get(key)` may produce `NullPointerException`
in `src/main/java/com/android/tools/build/bundletool/model/targeting/TargetedDirectorySegment.java`
#### Snippet
```java
    }

    switch (KEY_TO_DIMENSION.get(key)) {
      case COUNTRY_SET:
        return parseCountrySet(name, value);
```

### DataFlowIssue
Unboxing of `configurationSizes.getMinSizeConfigurationMap().get(sizeConfiguration)` may produce `NullPointerException`
in `src/main/java/com/android/tools/build/bundletool/model/utils/GetSizeCsvUtils.java`
#### Snippet
```java
              dimensions,
              sizeConfiguration,
              configurationSizes.getMinSizeConfigurationMap().get(sizeConfiguration),
              configurationSizes.getMaxSizeConfigurationMap().get(sizeConfiguration)));
    }
```

### DataFlowIssue
Unboxing of `configurationSizes.getMaxSizeConfigurationMap().get(sizeConfiguration)` may produce `NullPointerException`
in `src/main/java/com/android/tools/build/bundletool/model/utils/GetSizeCsvUtils.java`
#### Snippet
```java
              sizeConfiguration,
              configurationSizes.getMinSizeConfigurationMap().get(sizeConfiguration),
              configurationSizes.getMaxSizeConfigurationMap().get(sizeConfiguration)));
    }

```

### DataFlowIssue
Method invocation `get` may produce `NullPointerException`
in `src/main/java/com/android/tools/build/bundletool/model/utils/GetSizeCsvUtils.java`
#### Snippet
```java
            dimensions.stream()
                .sorted(DIMENSIONS_COMPARATOR)
                .map(dimension -> dimensionToTextMap.get(dimension).get().orElse("")),
            Stream.of(sizeFormatter.format(minSize), sizeFormatter.format(maxSize)))
        .collect(toImmutableList());
```

### DataFlowIssue
Method reference invocation `ModuleSplit::getApkTargeting` may produce `NullPointerException`
in `src/main/java/com/android/tools/build/bundletool/shards/StandaloneApksGenerator.java`
#### Snippet
```java
    ImmutableMap<ApkTargeting, ModuleSplit> featureSplitByTargeting =
        featureModuleSplit.stream()
            .collect(toImmutableMap(ModuleSplit::getApkTargeting, Function.identity()));
    // Next we enrich empty module splits (without content) with targeting that is not used by this
    // feature.
```

### DataFlowIssue
Method invocation `getDeliveryType` may produce `NullPointerException`
in `src/main/java/com/android/tools/build/bundletool/validation/ModuleDependencyValidator.java`
#### Snippet
```java
      String moduleName = dependencyEntry.getKey();
      String moduleDep = dependencyEntry.getValue();
      ModuleDeliveryType moduleDeliveryType = modulesByName.get(moduleName).getDeliveryType();
      ModuleDeliveryType depDeliveryType = modulesByName.get(moduleDep).getDeliveryType();

```

### DataFlowIssue
Method invocation `getDeliveryType` may produce `NullPointerException`
in `src/main/java/com/android/tools/build/bundletool/validation/ModuleDependencyValidator.java`
#### Snippet
```java
      String moduleDep = dependencyEntry.getValue();
      ModuleDeliveryType moduleDeliveryType = modulesByName.get(moduleName).getDeliveryType();
      ModuleDeliveryType depDeliveryType = modulesByName.get(moduleDep).getDeliveryType();

      // Conditional modules can only depend on always installed modules.
```

### DataFlowIssue
Method invocation `isInstantModule` may produce `NullPointerException`
in `src/main/java/com/android/tools/build/bundletool/validation/ModuleDependencyValidator.java`
#### Snippet
```java
      String moduleName = dependencyEntry.getKey();
      String moduleDepName = dependencyEntry.getValue();
      boolean isInstantModule = modulesByName.get(moduleName).isInstantModule();
      boolean isDepInstantModule = modulesByName.get(moduleDepName).isInstantModule();

```

### DataFlowIssue
Method invocation `isInstantModule` may produce `NullPointerException`
in `src/main/java/com/android/tools/build/bundletool/validation/ModuleDependencyValidator.java`
#### Snippet
```java
      String moduleDepName = dependencyEntry.getValue();
      boolean isInstantModule = modulesByName.get(moduleName).isInstantModule();
      boolean isDepInstantModule = modulesByName.get(moduleDepName).isInstantModule();

      if (isInstantModule && !isDepInstantModule) {
```

### DataFlowIssue
Method invocation `getModuleType` may produce `NullPointerException`
in `src/main/java/com/android/tools/build/bundletool/validation/ModuleDependencyValidator.java`
#### Snippet
```java
      String moduleDepName = dependencyEntry.getValue();
      BundleModule module = modulesByName.get(moduleName);
      if (module.getModuleType().equals(ModuleType.ASSET_MODULE)) {
        continue; // Asset modules don't have SDK constraints.
      }
```

### DataFlowIssue
Method invocation `getAndroidManifest` may produce `NullPointerException`
in `src/main/java/com/android/tools/build/bundletool/validation/ModuleDependencyValidator.java`
#### Snippet
```java
      BundleModule moduleDep = modulesByName.get(moduleDepName);
      int minSdk = module.getAndroidManifest().getEffectiveMinSdkVersion();
      int minSdkDep = moduleDep.getAndroidManifest().getEffectiveMinSdkVersion();
      if (module.getDeliveryType().equals(ModuleDeliveryType.ALWAYS_INITIAL_INSTALL)
          && minSdk != minSdkDep) {
```

### DataFlowIssue
Method invocation `getModuleType` may produce `NullPointerException`
in `src/main/java/com/android/tools/build/bundletool/validation/ModuleDependencyValidator.java`
#### Snippet
```java
      ImmutableMap<String, BundleModule> modulesByName, String moduleName) {
    return modulesByName.containsKey(moduleName)
        && modulesByName.get(moduleName).getModuleType().equals(ModuleType.ASSET_MODULE);
  }
}
```

### DataFlowIssue
Argument `entry` might be null
in `src/main/java/com/android/tools/build/bundletool/splitters/AbiApexImagesSplitter.java`
#### Snippet
```java
              .setEntries(
                  targetedApexImage.getBuildInfoPath().isEmpty()
                      ? ImmutableList.of(entry)
                      : ImmutableList.of(
                          entry, apexPathToEntryMap.get(targetedApexImage.getBuildInfoPath())));
```

### DataFlowIssue
Argument `entry` might be null
in `src/main/java/com/android/tools/build/bundletool/splitters/AbiApexImagesSplitter.java`
#### Snippet
```java
                      ? ImmutableList.of(entry)
                      : ImmutableList.of(
                          entry, apexPathToEntryMap.get(targetedApexImage.getBuildInfoPath())));
      splits.add(splitBuilder.build());
    }
```

### DataFlowIssue
Argument `apexPathToEntryMap.get(targetedApexImage.getBuildInfoPath())` might be null
in `src/main/java/com/android/tools/build/bundletool/splitters/AbiApexImagesSplitter.java`
#### Snippet
```java
                      ? ImmutableList.of(entry)
                      : ImmutableList.of(
                          entry, apexPathToEntryMap.get(targetedApexImage.getBuildInfoPath())));
      splits.add(splitBuilder.build());
    }
```

### DataFlowIssue
Argument `TextureCompressionUtils.TARGETING_TO_TEXTURE.get( Iterables.getOnlyElement(textureCompre...` might be null
in `src/main/java/com/android/tools/build/bundletool/model/SizeConfiguration.java`
#### Snippet
```java
    }
    return Optional.of(
        TextureCompressionUtils.TARGETING_TO_TEXTURE.get(
            Iterables.getOnlyElement(textureCompressionFormatTargeting.getValueList()).getAlias()));
  }

```

### DataFlowIssue
Unboxing of `sparseEncoding` may produce `NullPointerException`
in `src/main/java/com/android/tools/build/bundletool/mergers/SameTargetingMerger.java`
#### Snippet
```java
                          "Encountered different sparse encoding values while merging."));
    }
    builder.setSparseEncoding(Boolean.valueOf(sparseEncoding));

    if (mergedManifest != null) {
```

### DataFlowIssue
Argument `resourceNameMapping.get(fileReferencePath)` might be null
in `src/main/java/com/android/tools/build/bundletool/preprocessors/AppBundleObfuscationPreprocessor.java`
#### Snippet
```java
              continue;
            }
            fileReference.setPath(resourceNameMapping.get(fileReferencePath));
          }
        }
```

### DataFlowIssue
Argument `bundle.getRuntimeEnabledSdkDependencies().get(entry.getKey())` might be null
in `src/main/java/com/android/tools/build/bundletool/preprocessors/RuntimeEnabledSdkDependencyPreprocessor.java`
#### Snippet
```java
                        new SdkModuleToAppBundleModuleConverter(
                                entry.getValue(),
                                bundle.getRuntimeEnabledSdkDependencies().get(entry.getKey()),
                                bundle.getBaseModule().getAndroidManifest())
                            .convert())
```

### DataFlowIssue
Argument `USER_HOME.value()` might be null
in `src/main/java/com/android/tools/build/bundletool/model/utils/files/FileUtils.java`
#### Snippet
```java
          HOME_DIRECTORY_ALIAS
              .matcher(path)
              .replaceFirst(Matcher.quoteReplacement(USER_HOME.value()));
    }
    return Paths.get(path);
```

### DataFlowIssue
Dereference of `path.toFile().list()` may produce `NullPointerException`
in `src/main/java/com/android/tools/build/bundletool/model/utils/files/FilePreconditions.java`
#### Snippet
```java
  public static void checkDirectoryExistsAndEmpty(Path path) {
    checkDirectoryExists(path);
    checkArgument(path.toFile().list().length == 0, "Directory '%s' is not empty.", path);
  }

```

### DataFlowIssue
Function may return null, but it's not allowed here
in `src/main/java/com/android/tools/build/bundletool/model/utils/ResourcesUtils.java`
#### Snippet
```java
  /** Returns the smallest screen density from the ones given. */
  public static DensityAlias getLowestDensity(ImmutableCollection<DensityAlias> densities) {
    return densities.stream().min(comparing(DENSITY_ALIAS_TO_DPI_MAP::get)).get();
  }

```

### DataFlowIssue
Argument `mergedFiles` might be null
in `src/main/java/com/android/tools/build/bundletool/mergers/D8DexMerger.java`
#### Snippet
```java
      File[] mergedFiles = outputDir.toFile().listFiles();

      return Arrays.stream(mergedFiles).map(File::toPath).collect(toImmutableList());

    } catch (CompilationFailedException e) {
```

### DataFlowIssue
Argument `enum1ValuesByName.get(enumName)` might be null
in `src/main/java/com/android/tools/build/bundletool/model/utils/EnumMapper.java`
#### Snippet
```java

    for (String enumName : enum1ValuesByName.keySet()) {
      map.put(enum1ValuesByName.get(enumName), enum2ValuesByName.get(enumName));
    }
    return map.build();
```

### DataFlowIssue
Argument `enum2ValuesByName.get(enumName)` might be null
in `src/main/java/com/android/tools/build/bundletool/model/utils/EnumMapper.java`
#### Snippet
```java

    for (String enumName : enum1ValuesByName.keySet()) {
      map.put(enum1ValuesByName.get(enumName), enum2ValuesByName.get(enumName));
    }
    return map.build();
```

### DataFlowIssue
Method invocation `getProtocol` may produce `NullPointerException`
in `src/main/java/com/android/tools/build/bundletool/io/ResourceReader.java`
#### Snippet
```java
      throws URISyntaxException, IOException {
    URL pathUrl = ResourceReader.class.getResource(path);
    return pathUrl.getProtocol().equals("jar")
        ? readFromJar(
            Paths.get(
```

### DataFlowIssue
Argument `fileContentStream` might be null
in `src/main/java/com/android/tools/build/bundletool/io/ResourceReader.java`
#### Snippet
```java
  public ByteSource getResourceByteSource(String resourcePath) throws IOException {
    try (InputStream fileContentStream = ResourceReader.class.getResourceAsStream(resourcePath)) {
      return ByteSource.wrap(ByteStreams.toByteArray(fileContentStream));
    }
  }
```

### DataFlowIssue
Method reference argument might be null
in `src/main/java/com/android/tools/build/bundletool/model/targeting/TargetingUtils.java`
#### Snippet
```java
        .filter(path -> path.getNameCount() > 1)
        .map(ZipPath::getParent)
        .map(TargetedDirectory::parse)
        .collect(toImmutableSet());
  }
```

### DataFlowIssue
Unboxing of `resourceNameToIdMap.get(ARCHIVED_ICON_DRAWABLE_NAME)` may produce `NullPointerException`
in `src/main/java/com/android/tools/build/bundletool/archive/ArchivedAndroidManifestUtils.java`
#### Snippet
```java
    if (manifest.getIconAttribute().isPresent()
        && resourceNameToIdMap.containsKey(ARCHIVED_ICON_DRAWABLE_NAME)) {
      archivedManifestEditor.setIcon(resourceNameToIdMap.get(ARCHIVED_ICON_DRAWABLE_NAME));
    }

```

### DataFlowIssue
Unboxing of `resourceNameToIdMap.get(ARCHIVED_ROUND_ICON_DRAWABLE_NAME)` may produce `NullPointerException`
in `src/main/java/com/android/tools/build/bundletool/archive/ArchivedAndroidManifestUtils.java`
#### Snippet
```java
        && resourceNameToIdMap.containsKey(ARCHIVED_ROUND_ICON_DRAWABLE_NAME)) {
      archivedManifestEditor.setRoundIcon(
          resourceNameToIdMap.get(ARCHIVED_ROUND_ICON_DRAWABLE_NAME));
    }

```

### DataFlowIssue
Unboxing of `resourceNameToIdMap.getOrDefault(ArchivedResourcesHelper.ARCHIVED_TV_THEME_NAME, 0)` may produce `NullPointerException`
in `src/main/java/com/android/tools/build/bundletool/archive/ArchivedAndroidManifestUtils.java`
#### Snippet
```java
      archivedManifestEditor.setActivityTheme(
          REACTIVATE_ACTIVITY_NAME,
          resourceNameToIdMap.getOrDefault(ArchivedResourcesHelper.ARCHIVED_TV_THEME_NAME, 0));
    }

```

### DataFlowIssue
Method invocation `getVersionMajor` may produce `NullPointerException`
in `src/main/java/com/android/tools/build/bundletool/commands/BuildApksCommand.java`
#### Snippet
```java
                  appBundle.getRuntimeEnabledSdkDependencies().get(sdkPackageName);
              SdkAsar sdkArchive = sdkArchives.get(sdkPackageName);
              if (sdkDependencyFromAppBundle.getVersionMajor() != sdkArchive.getMajorVersion()) {
                throw InvalidCommandException.builder()
                    .withInternalMessage(
```

### DataFlowIssue
Method invocation `getMajorVersion` may produce `NullPointerException`
in `src/main/java/com/android/tools/build/bundletool/commands/BuildApksCommand.java`
#### Snippet
```java
                  appBundle.getRuntimeEnabledSdkDependencies().get(sdkPackageName);
              SdkAsar sdkArchive = sdkArchives.get(sdkPackageName);
              if (sdkDependencyFromAppBundle.getVersionMajor() != sdkArchive.getMajorVersion()) {
                throw InvalidCommandException.builder()
                    .withInternalMessage(
```

### DataFlowIssue
Method invocation `getVersionMajor` may produce `NullPointerException`
in `src/main/java/com/android/tools/build/bundletool/commands/BuildApksCommand.java`
#### Snippet
```java
                  appBundle.getRuntimeEnabledSdkDependencies().get(sdkPackageName);
              SdkBundle sdkBundle = sdkBundles.get(sdkPackageName);
              if (sdkDependencyFromAppBundle.getVersionMajor() != sdkBundle.getMajorVersion()) {
                throw InvalidCommandException.builder()
                    .withInternalMessage(
```

### DataFlowIssue
Method invocation `getMajorVersion` may produce `NullPointerException`
in `src/main/java/com/android/tools/build/bundletool/commands/BuildApksCommand.java`
#### Snippet
```java
                  appBundle.getRuntimeEnabledSdkDependencies().get(sdkPackageName);
              SdkBundle sdkBundle = sdkBundles.get(sdkPackageName);
              if (sdkDependencyFromAppBundle.getVersionMajor() != sdkBundle.getMajorVersion()) {
                throw InvalidCommandException.builder()
                    .withInternalMessage(
```

### DataFlowIssue
Method invocation `getEntry` may produce `NullPointerException`
in `src/main/java/com/android/tools/build/bundletool/splitters/ResourceAnalyzer.java`
#### Snippet
```java

      ResourceTableEntry resourceEntry = baseModuleResourcesById.get(resourceId);
      for (ConfigValue configValue : resourceEntry.getEntry().getConfigValueList()) {
        switch (configValue.getValue().getValueCase()) {
          case ITEM:
```

### DataFlowIssue
Method invocation `getModuleName` may produce `NullPointerException`
in `src/main/java/com/android/tools/build/bundletool/io/ApkSerializerManager.java`
#### Snippet
```java
            .collect(
                groupingByDeterministic(
                    relativePath -> assetSplitsByRelativePath.get(relativePath).getModuleName(),
                    mapping(apkDescriptionsByRelativePath::get, toImmutableList())));

```

### DataFlowIssue
Unboxing of `variantNumberByVariantKey.get(entry.getKey())` may produce `NullPointerException`
in `src/main/java/com/android/tools/build/bundletool/io/ApkSerializerManager.java`
#### Snippet
```java
                        clearVariantTargeting(
                            modifyApk(
                                entry.getValue(), variantNumberByVariantKey.get(entry.getKey())))));

    // After variant targeting of APKs are cleared, there might be duplicate APKs
```

### DataFlowIssue
Unboxing of `DENSITY_ALIAS_TO_DPI_MAP.get(desiredDensityAlias)` may produce `NullPointerException`
in `src/main/java/com/android/tools/build/bundletool/model/targeting/ScreenDensitySelector.java`
#### Snippet
```java
    checkArgument(DENSITY_ALIAS_TO_DPI_MAP.containsKey(desiredDensityAlias));
    return selectBestConfigValue(
        values, DENSITY_ALIAS_TO_DPI_MAP.get(desiredDensityAlias), bundleVersion);
  }

```

### DataFlowIssue
Unboxing of `targetDpi` may produce `NullPointerException`
in `src/main/java/com/android/tools/build/bundletool/model/targeting/ScreenDensitySelector.java`
#### Snippet
```java
        alternatives.stream().map(DENSITY_ALIAS_TO_DPI_MAP::get).collect(toImmutableSet());

    return getReachableConfigValues(getDpiRange(targetDpi, alternativeDpis), values, bundleVersion);
  }

```

### DataFlowIssue
Method reference argument might be null
in `src/main/java/com/android/tools/build/bundletool/transparency/BundleTransparencyCheckUtils.java`
#### Snippet
```java
        .collect(
            toImmutableMap(
                BundleTransparencyCheckUtils::getSource, codeRelatedFile -> codeRelatedFile));
  }

```

### DataFlowIssue
Method reference argument might be null
in `src/main/java/com/android/tools/build/bundletool/transparency/BundleTransparencyCheckUtils.java`
#### Snippet
```java
        .collect(
            toImmutableMap(
                BundleTransparencyCheckUtils::getSource, codeRelatedFile -> codeRelatedFile));
  }

```

### DataFlowIssue
Method invocation `getPath` may produce `NullPointerException`
in `src/main/java/com/android/tools/build/bundletool/io/ModuleSplitSerializer.java`
#### Snippet
```java

      return ConcurrencyUtils.waitForAll(apkDescriptions).stream()
          .collect(toImmutableMap(apk -> ZipPath.create(apk.getPath()), identity()));
    } catch (IOException e) {
      throw new UncheckedIOException(e);
```

### DataFlowIssue
Method invocation `resolve` may produce `NullPointerException`
in `src/main/java/com/android/tools/build/bundletool/model/ZipPath.java`
#### Snippet
```java
    checkNotNull(path, "Path cannot be null.");
    checkState(!getNames().isEmpty(), "Root has not sibling.");
    return getParent().resolve(path);
  }

```

### DataFlowIssue
Unboxing of `conditionCounts.getOrDefault(conditionName, 0L)` may produce `NullPointerException`
in `src/main/java/com/android/tools/build/bundletool/model/ManifestDeliveryElement.java`
#### Snippet
```java
            .collect(groupingByDeterministic(XmlProtoElement::getName, counting()));
    for (String conditionName : CONDITIONS_ALLOWED_ONLY_ONCE) {
      if (conditionCounts.getOrDefault(conditionName, 0L) > 1) {
        throw InvalidBundleException.builder()
            .withUserMessage("Multiple '<dist:%s>' conditions are not supported.", conditionName)
```

### DataFlowIssue
Unboxing of `oldToNewIndex.get(entry.getOverlayableItem().getOverlayableIdx())` may produce `NullPointerException`
in `src/main/java/com/android/tools/build/bundletool/mergers/ResourceTableMerger.java`
#### Snippet
```java
        for (Entry.Builder entry : type.getEntryBuilderList()) {
          if (entry.hasOverlayableItem()) {
            int newIdx = oldToNewIndex.get(entry.getOverlayableItem().getOverlayableIdx());
            entry.getOverlayableItemBuilder().setOverlayableIdx(newIdx);
          }
```

### DataFlowIssue
Argument `value2` might be null
in `src/main/java/com/android/tools/build/bundletool/mergers/ResourceTableMerger.java`
#### Snippet
```java
        result.add(value1);
      } else {
        result.add(value2);
      }
    }
```

## RuleId[id=EmptyStatementBody]
### EmptyStatementBody
`if` statement has empty body
in `src/main/java/com/android/tools/build/bundletool/validation/BundleFilesValidator.java`
#### Snippet
```java
    String fileName = file.getFileName().toString();

    if (file.startsWith(ASSETS_DIRECTORY)) {
      // No restrictions.

```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/com/android/tools/build/bundletool/validation/BundleFilesValidator.java`
#### Snippet
```java
      }

    } else if (file.startsWith(RESOURCES_DIRECTORY)) {
      // No restrictions.

```

## RuleId[id=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `src/main/java/com/android/tools/build/bundletool/device/VariantMatcher.java`
#### Snippet
```java
  public void checkCompatibleWithVariantTargeting(VariantTargeting targeting) {
    variantMatchers.stream()
        .forEach(matcher -> checkCompatibleWithVariantTargetingHelper(matcher, targeting));
  }

```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `src/main/java/com/android/tools/build/bundletool/validation/NestedTargetingValidator.java`
#### Snippet
```java
            directoryAllTargeting ->
                directoryAllTargeting.getValue().stream()
                    .forEach(
                        directoryTargeting ->
                            directoryAllNestedTargetingByPathBaseName.put(
```

### SimplifyStreamApiCallChains
The 'filter().findAny().isPresent()' chain can be replaced with 'anyMatch()'
in `src/main/java/com/android/tools/build/bundletool/model/ManifestEditor.java`
#### Snippet
```java
    return element
        .getChildrenElements(INTENT_FILTER_ELEMENT_NAME)
        .filter(
            intentFilter ->
                intentFilter
                    .getChildrenElements(CATEGORY_ELEMENT_NAME)
                    .filter(categoryElement -> hasName(categoryElement, categoryName))
                    .findAny()
                    .isPresent())
        .findAny()
        .isPresent();
  }

```

### SimplifyStreamApiCallChains
The 'filter().findAny().isPresent()' chain can be replaced with 'anyMatch()'
in `src/main/java/com/android/tools/build/bundletool/model/ManifestEditor.java`
#### Snippet
```java
                intentFilter
                    .getChildrenElements(CATEGORY_ELEMENT_NAME)
                    .filter(categoryElement -> hasName(categoryElement, categoryName))
                    .findAny()
                    .isPresent())
        .findAny()
        .isPresent();
```

### SimplifyStreamApiCallChains
Can be replaced with 'String.join'
in `src/main/java/com/android/tools/build/bundletool/validation/BundleConfigValidator.java`
#### Snippet
```java
                          + "is not valid. Supported formats are: %s.",
                      dimension.getSuffixStripping().getDefaultSuffix(),
                      supportedTextures.stream().collect(joining(", ")))
                  .build();
            });
```

### SimplifyStreamApiCallChains
Can be replaced with 'String.join'
in `src/main/java/com/android/tools/build/bundletool/validation/ModuleDependencyValidator.java`
#### Snippet
```java
                "Isolated module '%s' cannot depend on more than one other module, "
                    + "but it depends on [%s].",
                moduleName, nonBaseDependencies.stream().collect(joining(", ")))
            .build();
      }
```

## RuleId[id=BoxingBoxedValue]
### BoxingBoxedValue
Boxing of already boxed `sparseEncoding`
in `src/main/java/com/android/tools/build/bundletool/mergers/SameTargetingMerger.java`
#### Snippet
```java
                          "Encountered different sparse encoding values while merging."));
    }
    builder.setSparseEncoding(Boolean.valueOf(sparseEncoding));

    if (mergedManifest != null) {
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'setOptimizationDimensions' is still used
in `src/main/java/com/android/tools/build/bundletool/commands/BuildApksCommand.java`
#### Snippet
```java
    /** List of config dimensions to split the APKs by. */
    @Deprecated // Use setBundleConfig() instead.
    public abstract Builder setOptimizationDimensions(
        ImmutableSet<OptimizationDimension> optimizationDimensions);

```

### DeprecatedIsStillUsed
Deprecated member 'getAttributeIgnoringNamespace' is still used
in `src/main/java/com/android/tools/build/bundletool/model/utils/xmlproto/XmlProtoElementOrBuilder.java`
#### Snippet
```java

  @Deprecated // Don't ignore the namespace!
  public final Optional<AttributeWrapperT> getAttributeIgnoringNamespace(String name) {
    return getAttributes().filter(attr -> attr.getName().equals(name)).findFirst();
  }
```

### DeprecatedIsStillUsed
Deprecated member 'mergeWithDefaults' is still used
in `src/main/java/com/android/tools/build/bundletool/optimizations/OptimizationsMerger.java`
#### Snippet
```java
   */
  @Deprecated // Optimization flags will go away soon!
  public ApkOptimizations mergeWithDefaults(
      BundleConfig bundleConfig, ImmutableSet<OptimizationDimension> optimizationsOverride) {
    // Default optimizations performed on APKs if the developer doesn't specify any preferences.
```

## RuleId[id=UnnecessaryCallToStringValueOf]
### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `src/main/java/com/android/tools/build/bundletool/io/ModuleEntriesPacker.java`
#### Snippet
```java

    String nextName() {
      return prefix + String.valueOf(counter++);
    }
  }
```

## RuleId[id=FinalMethodInFinalClass]
### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/com/android/tools/build/bundletool/model/Password.java`
#### Snippet
```java

  /** Special note: It's the responsibility of the caller to destroy the password once used. */
  public final PasswordProtection getValue() {
    return passwordSupplier.get();
  }
```

## RuleId[id=SwitchStatementWithTooFewBranches]
### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `src/main/java/com/android/tools/build/bundletool/xml/XPathResolver.java`
#### Snippet
```java
      for (int i = 0; i < nodeList.getLength(); i++) {
        Node node = nodeList.item(i);
        switch (node.getNodeType()) {
          case Node.ATTRIBUTE_NODE:
            output.add(((Attr) node).getValue());
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `src/main/java/com/android/tools/build/bundletool/shards/StandaloneApksGenerator.java`
#### Snippet
```java
            .collect(toImmutableList());

    switch (appBundle
        .getBundleConfig()
        .getOptimizations()
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `src/main/java/com/android/tools/build/bundletool/commands/GetSizeCommand.java`
#### Snippet
```java

  public void execute() {
    switch (getGetSizeSubCommand()) {
      case TOTAL:
        getSizeTotal(System.out);
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `src/main/java/com/android/tools/build/bundletool/model/utils/xmlproto/XmlProtoPrintUtils.java`
#### Snippet
```java
      case ITEM:
        Item item = value.getItem();
        switch (item.getValueCase()) {
          case PRIM:
            return item.getPrim().getOneofValueCase().toString().replace("_VALUE", "");
```

## RuleId[id=FinalPrivateMethod]
### FinalPrivateMethod
'private' method declared `final`
in `src/main/java/com/android/tools/build/bundletool/device/AdbServer.java`
#### Snippet
```java
  public abstract boolean hasInitialDeviceList();

  private final void waitTillInitialDeviceListPopulated(long timeoutMs) throws TimeoutException {
    if (hasInitialDeviceList()) {
      return;
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `src/main/java/com/android/tools/build/bundletool/commands/BuildApksCommand.java`
#### Snippet
```java
    } else if (keystorePath.isPresent() && !keyAlias.isPresent()) {
      throw InvalidCommandException.builder()
          .withInternalMessage("Flag --ks-key-alias is required when --ks is set.")
          .build();
    } else if (!keystorePath.isPresent() && keyAlias.isPresent()) {
      throw InvalidCommandException.builder()
          .withInternalMessage("Flag --ks is required when --ks-key-alias is set.")
          .build();
    } else {
      // Try to use debug keystore if present.
      Optional<SigningConfiguration> debugConfig =
          DebugKeystoreUtils.getDebugSigningConfiguration(systemEnvironmentProvider);
      if (debugConfig.isPresent()) {
        out.printf(
            "INFO: The APKs will be signed with the debug keystore found at '%s'.%n",
            DebugKeystoreUtils.DEBUG_KEYSTORE_CACHE.getUnchecked(systemEnvironmentProvider).get());
        buildApksCommand.setSigningConfiguration(debugConfig.get());
      } else {
        out.println(
            "WARNING: The APKs won't be signed and thus not installable unless you also pass a "
                + "keystore via the flag --ks. See the command help for more information.");
      }
    }
```

### DuplicatedCode
Duplicated code
in `src/main/java/com/android/tools/build/bundletool/commands/BuildBundleCommand.java`
#### Snippet
```java
      ImmutableList.Builder<ZipFile> moduleZipFilesBuilder = ImmutableList.builder();
      for (Path modulePath : getModulesPaths()) {
        try {
          moduleZipFilesBuilder.add(closer.register(new ZipFile(modulePath.toFile())));
        } catch (ZipException e) {
          throw CommandExecutionException.builder()
              .withCause(e)
              .withInternalMessage("File '%s' does not seem to be a valid ZIP file.", modulePath)
              .build();
        } catch (IOException e) {
          throw CommandExecutionException.builder()
              .withCause(e)
              .withInternalMessage("Unable to read file '%s'.", modulePath)
              .build();
        }
      }
      ImmutableList<ZipFile> moduleZipFiles = moduleZipFilesBuilder.build();
```

### DuplicatedCode
Duplicated code
in `src/main/java/com/android/tools/build/bundletool/commands/BuildSdkApksCommand.java`
#### Snippet
```java
Optional<Path> keystorePath = KEYSTORE_FLAG.getValue(flags);
    Optional<String> keyAlias = KEY_ALIAS_FLAG.getValue(flags);
    Optional<Password> keystorePassword = KEYSTORE_PASSWORD_FLAG.getValue(flags);
    Optional<Password> keyPassword = KEY_PASSWORD_FLAG.getValue(flags);

    if (keystorePath.isPresent() && keyAlias.isPresent()) {
      SignerConfig signerConfig =
          SignerConfig.extractFromKeystore(
              keystorePath.get(), keyAlias.get(), keystorePassword, keyPassword);
      SigningConfiguration.Builder builder =
          SigningConfiguration.builder().setSignerConfig(signerConfig);
      buildSdkApksCommand.setSigningConfiguration(builder.build());
    } else if (keystorePath.isPresent() && !keyAlias.isPresent()) {
      throw InvalidCommandException.builder()
          .withInternalMessage("Flag --ks-key-alias is required when --ks is set.")
          .build();
    } else if (!keystorePath.isPresent() && keyAlias.isPresent()) {
      throw InvalidCommandException.builder()
          .withInternalMessage("Flag --ks is required when --ks-key-alias is set.")
          .build();
    } else {
      // Try to use debug keystore if present.
      Optional<SigningConfiguration> debugConfig =
          DebugKeystoreUtils.getDebugSigningConfiguration(provider);
      if (debugConfig.isPresent()) {
        out.printf(
            "INFO: The APKs will be signed with the debug keystore found at '%s'.%n",
            DebugKeystoreUtils.DEBUG_KEYSTORE_CACHE.getUnchecked(provider).get());
        buildSdkApksCommand.setSigningConfiguration(debugConfig.get());
      } else {
        out.println(
            "WARNING: The APKs won't be signed and thus not installable unless you also pass a "
                + "keystore via the flag --ks. See the command help for more information.");
      }
    }
```

### DuplicatedCode
Duplicated code
in `src/main/java/com/android/tools/build/bundletool/commands/GetDeviceSpecCommand.java`
#### Snippet
```java
    DeviceSpec deviceSpec = new DeviceAnalyzer(adb).getDeviceSpec(getDeviceId());
    if (getDeviceTier().isPresent()) {
      deviceSpec =
          deviceSpec.toBuilder().setDeviceTier(Int32Value.of(getDeviceTier().get())).build();
    }
    if (getDeviceGroups().isPresent()) {
      deviceSpec = deviceSpec.toBuilder().addAllDeviceGroups(getDeviceGroups().get()).build();
    }
    if (getCountrySet().isPresent()) {
      deviceSpec =
          deviceSpec.toBuilder().setCountrySet(StringValue.of(getCountrySet().get())).build();
    }
```

### DuplicatedCode
Duplicated code
in `src/main/java/com/android/tools/build/bundletool/commands/InstallMultiApksCommand.java`
#### Snippet
```java
      for (ZipEntry apksToExtract : apksToExtractList) {
        Path extractedApksPath =
            zipExtractedSubDirectory.resolve(ZipPath.create(apksToExtract.getName()).toString());
        Files.createDirectories(extractedApksPath.getParent());
        try (InputStream inputStream = apksArchiveContainer.getInputStream(apksToExtract);
            OutputStream outputApks = Files.newOutputStream(extractedApksPath)) {
          ByteStreams.copy(inputStream, outputApks);
          extractedApks.add(extractedApksPath);
        }
      }
```

### DuplicatedCode
Duplicated code
in `src/main/java/com/android/tools/build/bundletool/io/ZipFlingerBundleSerializer.java`
#### Snippet
```java
        zipArchive.add(
            protoToSource(
                moduleDir.resolve(SpecialModuleEntry.ANDROID_MANIFEST.getPath()),
                module.getAndroidManifest().getManifestRoot().getProto(),
                DEFAULT_COMPRESSION_LEVEL));
        if (module.getAssetsConfig().isPresent()) {
          zipArchive.add(
              protoToSource(
                  moduleDir.resolve(SpecialModuleEntry.ASSETS_TABLE.getPath()),
                  module.getAssetsConfig().get(),
                  DEFAULT_COMPRESSION_LEVEL));
        }
        if (module.getNativeConfig().isPresent()) {
          zipArchive.add(
              protoToSource(
                  moduleDir.resolve(SpecialModuleEntry.NATIVE_LIBS_TABLE.getPath()),
                  module.getNativeConfig().get(),
                  DEFAULT_COMPRESSION_LEVEL));
        }
        if (module.getResourceTable().isPresent()) {
          zipArchive.add(
              protoToSource(
                  moduleDir.resolve(SpecialModuleEntry.RESOURCE_TABLE.getPath()),
                  module.getResourceTable().get(),
                  DEFAULT_COMPRESSION_LEVEL));
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/com/android/tools/build/bundletool/splitters/AssetModuleSplitter.java`
#### Snippet
```java
    if (apkGenerationConfiguration
        .getOptimizationDimensions()
        .contains(OptimizationDimension.TEXTURE_COMPRESSION_FORMAT)) {
      assetsSplitters.add(
          TextureCompressionFormatAssetsSplitter.create(
              apkGenerationConfiguration.shouldStripTargetingSuffix(
                  OptimizationDimension.TEXTURE_COMPRESSION_FORMAT)));
    }
    if (apkGenerationConfiguration
        .getOptimizationDimensions()
        .contains(OptimizationDimension.DEVICE_TIER)) {
      assetsSplitters.add(
          DeviceTierAssetsSplitter.create(
              apkGenerationConfiguration.shouldStripTargetingSuffix(
                  OptimizationDimension.DEVICE_TIER)));
    }
    if (apkGenerationConfiguration
        .getOptimizationDimensions()
        .contains(OptimizationDimension.COUNTRY_SET)) {
      assetsSplitters.add(
          CountrySetAssetsSplitter.create(
              apkGenerationConfiguration.shouldStripTargetingSuffix(
                  OptimizationDimension.COUNTRY_SET)));
    }
    return new SplittingPipeline(assetsSplitters.build());
```

### DuplicatedCode
Duplicated code
in `src/main/java/com/android/tools/build/bundletool/splitters/AssetModuleSplitter.java`
#### Snippet
```java
    if (split.getApkTargeting().hasSdkVersionTargeting()) {
      checkState(
          split.getApkTargeting().getSdkVersionTargeting().getValue(0).getMin().getValue()
              >= ANDROID_L_API_VERSION,
          "Module Split should target SDK versions above L.");
      return split;
    }

    int defaultSdkVersion = max(masterSplitMinSdk, baseModuleMinSdk, ANDROID_L_API_VERSION);
    return split.toBuilder()
        .setApkTargeting(
            split.getApkTargeting().toBuilder()
                .setSdkVersionTargeting(
                    SdkVersionTargeting.newBuilder()
                        .addValue(
                            SdkVersion.newBuilder()
                                .setMin(Int32Value.newBuilder().setValue(defaultSdkVersion))))
                .build())
        .build();
```

### DuplicatedCode
Duplicated code
in `src/main/java/com/android/tools/build/bundletool/splitters/DexCompressionSplitter.java`
#### Snippet
```java
    ImmutableSet<ModuleEntry> nonDexEntries =
        moduleSplit.getEntries().stream()
            .filter(entry -> !dexEntries.contains(entry))
            .collect(toImmutableSet());

    return ImmutableList.<ModuleEntry>builder()
        .addAll(
            dexEntries.stream()
                .map(
                    moduleEntry ->
                        moduleEntry.toBuilder().setForceUncompressed(forceUncompressed).build())
                .collect(toImmutableList()))
        .addAll(nonDexEntries)
        .build();
```

## RuleId[id=CollectionAddAllCanBeReplacedWithConstructor]
### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `src/main/java/com/android/tools/build/bundletool/splitters/ResourceAnalyzer.java`
#### Snippet
```java

    Queue<ResourceId> resourcesToInspect = new ArrayDeque<>();
    resourcesToInspect.addAll(anchorResources);

    while (!resourcesToInspect.isEmpty()) {
```

## RuleId[id=Deprecation]
### Deprecation
'createBridge(java.lang.String, boolean)' is deprecated
in `src/main/java/com/android/tools/build/bundletool/device/DdmlibAdbServer.java`
#### Snippet
```java
    Log.addLogger(new FilteredLogOutput());
    AndroidDebugBridge.init(builder.build());
    this.adb = AndroidDebugBridge.createBridge(pathToAdb.toString(), /* forceNewBridge= */ false);

    if (adb == null) {
```

### Deprecation
'mergeWithDefaults(BundleConfig, com.google.common.collect.ImmutableSet)' is deprecated
in `src/main/java/com/android/tools/build/bundletool/commands/BuildApksModule.java`
#### Snippet
```java
      BuildApksCommand command,
      OptimizationsMerger optimizationsMerger) {
    return optimizationsMerger.mergeWithDefaults(bundleConfig, command.getOptimizationDimensions());
  }

```

### Deprecation
'FRACTION_VALUE_DEPRECATED' is deprecated
in `src/main/java/com/android/tools/build/bundletool/model/utils/xmlproto/XmlProtoPrintUtils.java`
#### Snippet
```java
        // We clear the transparency bits since they're not displayed for an RGB value.
        return String.format("#%06x", primitive.getColorRgb4Value() & 0x00FFFFFF);
      case FRACTION_VALUE_DEPRECATED:
      case DIMENSION_VALUE_DEPRECATED:
      case ONEOFVALUE_NOT_SET:
```

### Deprecation
'DIMENSION_VALUE_DEPRECATED' is deprecated
in `src/main/java/com/android/tools/build/bundletool/model/utils/xmlproto/XmlProtoPrintUtils.java`
#### Snippet
```java
        return String.format("#%06x", primitive.getColorRgb4Value() & 0x00FFFFFF);
      case FRACTION_VALUE_DEPRECATED:
      case DIMENSION_VALUE_DEPRECATED:
      case ONEOFVALUE_NOT_SET:
    }
```

### Deprecation
'JsonParser()' is deprecated
in `src/main/java/com/android/tools/build/bundletool/validation/ApexBundleValidator.java`
#### Snippet
```java
  private static void validateApexManifestJson(ModuleEntry entry) {
    try (BufferedReader reader = entry.getContent().asCharSource(UTF_8).openBufferedStream()) {
      JsonObject json = new JsonParser().parse(reader).getAsJsonObject();
      JsonElement element = json.get("name");
      if (element == null || element.getAsString().isEmpty()) {
```

### Deprecation
'parse(java.io.Reader)' is deprecated
in `src/main/java/com/android/tools/build/bundletool/validation/ApexBundleValidator.java`
#### Snippet
```java
  private static void validateApexManifestJson(ModuleEntry entry) {
    try (BufferedReader reader = entry.getContent().asCharSource(UTF_8).openBufferedStream()) {
      JsonObject json = new JsonParser().parse(reader).getAsJsonObject();
      JsonElement element = json.get("name");
      if (element == null || element.getAsString().isEmpty()) {
```

### Deprecation
'getAttributeIgnoringNamespace(java.lang.String)' is deprecated
in `src/main/java/com/android/tools/build/bundletool/model/AndroidManifest.java`
#### Snippet
```java
              } else {
                return fusing
                    .getAttributeIgnoringNamespace("include")
                    .orElseThrow(this::createFusingMissingIncludeAttributeException);
              }
```

### Deprecation
'getAttributeIgnoringNamespace(java.lang.String)' is deprecated
in `src/main/java/com/android/tools/build/bundletool/model/AndroidManifest.java`
#### Snippet
```java
                return module.getAttribute(DISTRIBUTION_NAMESPACE_URI, "onDemand");
              } else {
                return module.getAttributeIgnoringNamespace("onDemand");
              }
            });
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/android/tools/build/bundletool/model/utils/xmlproto/XmlProtoPrintUtils.java`
#### Snippet
```java
        // So we can edit the string in place, we need to start from the end.
        .sorted(reverseOrder())
        .forEach(tag -> string.insert(tag.position, tag.toString()));
    return string.toString();
  }
```

## RuleId[id=SuspiciousMethodCalls]
### SuspiciousMethodCalls
'ImmutableMap' may not contain keys of type ''
in `src/main/java/com/android/tools/build/bundletool/device/DeviceTargetingConfigEvaluator.java`
#### Snippet
```java
      DeviceTier deviceTier, ImmutableMap<String, DeviceGroup> deviceGroupNameToDeviceGroup) {
    return deviceTier.getDeviceGroupNamesList().stream()
        .map(name -> deviceGroupNameToDeviceGroup.get(name).getDeviceSelectorsList())
        .flatMap(List::stream)
        .collect(toImmutableSet());
```

### SuspiciousMethodCalls
'ImmutableList' may not contain objects of type 'AssetsDirectoryTargeting'
in `src/main/java/com/android/tools/build/bundletool/validation/NestedTargetingValidator.java`
#### Snippet
```java
        .map(DirectoryNestedTargeting::getTargeting)
        .collect(toImmutableList())
        .containsAll(nestedTargetingUniverse)) {
      throw InvalidBundleException.builder()
          .withUserMessage(
```

### SuspiciousMethodCalls
Suspicious call to 'ImmutableMap.get()'
in `src/main/java/com/android/tools/build/bundletool/splitters/AbiApexImagesSplitter.java`
#### Snippet
```java
                .map(TargetedApexImage::getBuildInfoPath)
                .filter(p -> !p.isEmpty()))
        .collect(toImmutableMap(identity(), pathToEntry::get));
  }
}
```

### SuspiciousMethodCalls
'ImmutableSet' may not contain objects of type 'T'
in `src/main/java/com/android/tools/build/bundletool/shards/BundleModule64BitNativeLibrariesRemover.java`
#### Snippet
```java
        .addAllDirectory(
            nativeConfig.getDirectoryList().stream()
                .filter(not(dirsToRemove::contains))
                .collect(toImmutableList()))
        .build();
```

### SuspiciousMethodCalls
Suspicious call to 'ImmutableMap.get()'
in `src/main/java/com/android/tools/build/bundletool/io/ApkSerializerManager.java`
#### Snippet
```java
            .collect(
                groupingByDeterministic(
                    relativePath -> assetSplitsByRelativePath.get(relativePath).getModuleName(),
                    mapping(apkDescriptionsByRelativePath::get, toImmutableList())));

```

### SuspiciousMethodCalls
Suspicious call to 'ImmutableMap.get()'
in `src/main/java/com/android/tools/build/bundletool/io/ApkSerializerManager.java`
#### Snippet
```java
                groupingByDeterministic(
                    relativePath -> assetSplitsByRelativePath.get(relativePath).getModuleName(),
                    mapping(apkDescriptionsByRelativePath::get, toImmutableList())));

    return serializedApksByModuleName.entrySet().stream()
```

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/com/android/tools/build/bundletool/model/BundleModuleName.java`
#### Snippet
```java

  @Override
  public final int compareTo(BundleModuleName o) {
    return Comparator.comparing(BundleModuleName::getName).compare(this, o);
  }
```

### NullableProblems
Not annotated method overrides method annotated with @ElementTypesAreNonnullByDefault
in `src/main/java/com/android/tools/build/bundletool/model/utils/ZipUtils.java`
#### Snippet
```java

    @Override
    public Optional<Long> sizeIfKnown() {
      return entry.getSize() == -1 ? Optional.absent() : Optional.of(entry.getSize());
    }
```

### NullableProblems
Not annotated method overrides method annotated with @ElementTypesAreNonnullByDefault
in `src/main/java/com/android/tools/build/bundletool/model/utils/ZipUtils.java`
#### Snippet
```java

    @Override
    public InputStream openStream() throws IOException {
      return file.getInputStream(entry);
    }
```

### NullableProblems
Not annotated method overrides method annotated with @ElementTypesAreNonnullByDefault
in `src/main/java/com/android/tools/build/bundletool/model/utils/ResourcesUtils.java`
#### Snippet
```java
              new CacheLoader<String, String>() {
                @Override
                public String load(String locale) {
                  return Locale.forLanguageTag(locale).getLanguage();
                }
```

### NullableProblems
Not annotated parameter overrides @ElementTypesAreNonnullByDefault parameter
in `src/main/java/com/android/tools/build/bundletool/model/utils/ResourcesUtils.java`
#### Snippet
```java
              new CacheLoader<String, String>() {
                @Override
                public String load(String locale) {
                  return Locale.forLanguageTag(locale).getLanguage();
                }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/com/android/tools/build/bundletool/model/VariantKey.java`
#### Snippet
```java

  @Override
  public int compareTo(VariantKey o) {
    // Instant APKs get the lowest variant numbers followed by standalone and then split APKs.
    // System APKs never occur with other apk types, its ordering position doesn't matter.
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/com/android/tools/build/bundletool/model/WearApkLocator.java`
#### Snippet
```java
   *
   * <p>Follows the instructions from
   * https://developer.android.com/training/wearables/apps/packaging#PackageManually
   */
  public static ImmutableCollection<ZipPath> findEmbeddedWearApkPaths(ModuleSplit split) {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/com/android/tools/build/bundletool/model/WearApkLocator.java`
#### Snippet
```java
   *
   * <p>According to
   * https://developer.android.com/training/wearables/apps/packaging#PackageManually, it is the
   * value inside the tag <rawPathResId>.
   */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/com/android/tools/build/bundletool/model/WearApkLocator.java`
#### Snippet
```java
 * Helper class to locate an embedded Wear 1.x APK.
 *
 * <p>See https://developer.android.com/training/wearables/apps/packaging#PackageManually
 */
public final class WearApkLocator {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/com/android/tools/build/bundletool/model/SourceStamp.java`
#### Snippet
```java
   * <p>For stores, it is their package names.
   *
   * <p>For local stamps, it is "http://localhost".
   */
  public abstract String getSource();
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/com/android/tools/build/bundletool/model/utils/SdkToolsLocator.java`
#### Snippet
```java
  }

  /** Hack to work around https://bugs.openjdk.java.net/browse/JDK-8144977 */
  private static InputStream sanitize(InputStream is) throws IOException {
    try {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/com/android/tools/build/bundletool/model/version/VersionGuardedFeature.java`
#### Snippet
```java
   * <p>When a style is available in master split it can be overridden by config splits for specific
   * density that's why having only the lowest density value in master split and every other value
   * in config splits is enough (https://github.com/google/bundletool/issues/128).
   */
  PIN_LOWEST_DENSITY_OF_EACH_STYLE_TO_MASTER("0.14.0"),
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/com/android/tools/build/bundletool/model/version/VersionGuardedFeature.java`
#### Snippet
```java
   * Fuse activities from feature module AndroinManifest instead of relying on activities that are
   * merged from features to base module by Gradle plugin
   * (https://github.com/google/bundletool/issues/68).
   */
  FUSE_ACTIVITIES_FROM_FEATURE_MANIFESTS("0.13.4"),
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/com/android/tools/build/bundletool/archive/ArchivedApksGenerator.java`
#### Snippet
```java
 */
public final class ArchivedApksGenerator {
  private final ResourceReader resourceReader;
  private final ArchivedResourcesHelper archivedResourcesHelper;
  private final boolean createDifferentThemesForTvAndPhone;
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `InputStream.available()` is ignored
in `src/main/java/com/android/tools/build/bundletool/model/utils/SdkToolsLocator.java`
#### Snippet
```java
  private static InputStream sanitize(InputStream is) throws IOException {
    try {
      is.available();
      return is;
    } catch (NullPointerException e) {
```

### IgnoreResultOfCall
Result of `File.setExecutable()` is ignored
in `src/main/java/com/android/tools/build/bundletool/model/utils/SdkToolsLocator.java`
#### Snippet
```java
    // Ensure aapt2 is executable.
    try {
      aapt2.toFile().setExecutable(true);
    } catch (SecurityException e) {
      throw CommandExecutionException.builder()
```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `src/main/java/com/android/tools/build/bundletool/device/DeviceTierApkMatcher.java`
#### Snippet
```java
          .build();
    }
    if (values.contains(getDeviceSpec().getDeviceTier().getValue())) {
      return true;
    }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/com/android/tools/build/bundletool/io/ModuleSplitSerializer.java`
#### Snippet
```java
    // Common extensions that should remain uncompressed because compression doesn't provide any
    // gains.
    if (!NO_DEFAULT_UNCOMPRESS_EXTENSIONS.enabledForVersion(bundletoolVersion)
        && ApkSerializerHelper.NO_COMPRESSION_EXTENSIONS.contains(
            FileUtils.getFileExtension(ZipPath.create(path)))) {
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/com/android/tools/build/bundletool/device/TextureCompressionFormatMatcher.java`
#### Snippet
```java
    // fallback for other TCFs. None of the alternatives were matched, which means that
    // this targeting is the best that exists.
    if (values.isEmpty() && !alternatives.isEmpty()) {
      return true;
    }
```

## RuleId[id=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'version'
in `src/main/java/com/android/tools/build/bundletool/model/DeviceFeatureCondition.java`
#### Snippet
```java
  }

  public static DeviceFeatureCondition create(String featureName, Optional<Integer> version) {
    return new AutoValue_DeviceFeatureCondition(featureName, version);
  }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'packageName'
in `src/main/java/com/android/tools/build/bundletool/device/LocalTestingPathResolver.java`
#### Snippet
```java
  private LocalTestingPathResolver() {}

  public static String resolveLocalTestingPath(String localTestPath, Optional<String> packageName) {
    // There are two different flows, depending on if the path is absolute or not...
    if (localTestPath.startsWith("/")) {
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for parameter 'requestedModuleNames'
in `src/main/java/com/android/tools/build/bundletool/device/ApkMatcher.java`
#### Snippet
```java
  public ApkMatcher(
      DeviceSpec deviceSpec,
      Optional<ImmutableSet<String>> requestedModuleNames,
      boolean includeInstallTimeAssetModules,
      boolean matchInstant,
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'requestedModuleNames'
in `src/main/java/com/android/tools/build/bundletool/device/ApkMatcher.java`
#### Snippet
```java
  private final ImmutableList<? extends TargetingDimensionMatcher<?>> apkMatchers;

  private final Optional<ImmutableSet<String>> requestedModuleNames;
  private final boolean matchInstant;
  private final boolean includeInstallTimeAssetModules;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'pinSpec'
in `src/main/java/com/android/tools/build/bundletool/splitters/PinSpecInjector.java`
#### Snippet
```java
  public static final ZipPath PIN_SPEC_NAME = ZipPath.create("assets/com.android.hints.pins.txt");

  private final Optional<ModuleEntry> pinSpec;

  public PinSpecInjector(BundleModule module) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'versionCode'
in `src/main/java/com/android/tools/build/bundletool/splitters/AssetSlicesGenerator.java`
#### Snippet
```java

  private static ModuleSplit addVersionCode(
      ModuleSplit moduleSplit, Optional<Integer> versionCode) {
    if (!versionCode.isPresent()) {
      return moduleSplit;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'assetModulesVersionOverride'
in `src/main/java/com/android/tools/build/bundletool/splitters/AssetSlicesGenerator.java`
#### Snippet
```java
  private final AppBundle appBundle;
  private final ApkGenerationConfiguration apkGenerationConfiguration;
  private final Optional<Long> assetModulesVersionOverride;

  public AssetSlicesGenerator(
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'assetModulesVersionOverride'
in `src/main/java/com/android/tools/build/bundletool/splitters/AssetSlicesGenerator.java`
#### Snippet
```java
      AppBundle appBundle,
      ApkGenerationConfiguration apkGenerationConfiguration,
      Optional<Long> assetModulesVersionOverride) {
    this.appBundle = checkNotNull(appBundle);
    this.apkGenerationConfiguration = checkNotNull(apkGenerationConfiguration);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'versionName'
in `src/main/java/com/android/tools/build/bundletool/splitters/AssetSlicesGenerator.java`
#### Snippet
```java
  }

  private static ModuleSplit addVersionName(ModuleSplit moduleSplit, Optional<String> versionName) {
    if (!versionName.isPresent()) {
      return moduleSplit;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'defaultTextureCompressionFormat'
in `src/main/java/com/android/tools/build/bundletool/validation/TextureCompressionFormatParityValidator.java`
#### Snippet
```java
  private static void validateFormatSupportedByAllModules(
      AppBundle bundle,
      Optional<TextureCompressionFormatTargeting> defaultTextureCompressionFormat) {
    bundle
        .getModules()
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'stampSource'
in `src/main/java/com/android/tools/build/bundletool/splitters/SplitApksGenerator.java`
#### Snippet
```java

  private final Version bundletoolVersion;
  private final Optional<SourceStamp> stampSource;
  private final VariantTargetingGenerator variantTargetingGenerator;
  private final AppBundle appBundle;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'stampSource'
in `src/main/java/com/android/tools/build/bundletool/splitters/SplitApksGenerator.java`
#### Snippet
```java
  public SplitApksGenerator(
      Version bundletoolVersion,
      Optional<SourceStamp> stampSource,
      VariantTargetingGenerator variantTargetingGenerator,
      AppBundle appBundle) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'optionalKeystorePassword'
in `src/main/java/com/android/tools/build/bundletool/model/SignerConfig.java`
#### Snippet
```java
      Path keystorePath,
      String keyAlias,
      Optional<Password> optionalKeystorePassword,
      Optional<Password> optionalKeyPassword) {
    checkFileExistsAndReadable(keystorePath);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'optionalKeyPassword'
in `src/main/java/com/android/tools/build/bundletool/model/SignerConfig.java`
#### Snippet
```java
      String keyAlias,
      Optional<Password> optionalKeystorePassword,
      Optional<Password> optionalKeyPassword) {
    checkFileExistsAndReadable(keystorePath);

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'deviceSpec'
in `src/main/java/com/android/tools/build/bundletool/shards/ModuleSplitterForShards.java`
#### Snippet
```java
  private final Version bundleVersion;
  private final BundleConfig bundleConfig;
  private final Optional<DeviceSpec> deviceSpec;

  @Inject
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'deviceSpec'
in `src/main/java/com/android/tools/build/bundletool/shards/ModuleSplitterForShards.java`
#### Snippet
```java
  @Inject
  public ModuleSplitterForShards(
      Version bundleVersion, BundleConfig bundleConfig, Optional<DeviceSpec> deviceSpec) {
    this.bundleVersion = bundleVersion;
    this.bundleConfig = bundleConfig;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'customAppStorePackageName'
in `src/main/java/com/android/tools/build/bundletool/archive/ArchivedApksGenerator.java`
#### Snippet
```java

  public ModuleSplit generateArchivedApk(
      AppBundle appBundle, Optional<String> customAppStorePackageName) throws IOException {
    validateRequest(appBundle);

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'deviceSpec'
in `src/main/java/com/android/tools/build/bundletool/shards/Sharder.java`
#### Snippet
```java
public class Sharder {

  private final Optional<DeviceSpec> deviceSpec;

  @Inject
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'deviceSpec'
in `src/main/java/com/android/tools/build/bundletool/shards/Sharder.java`
#### Snippet
```java

  @Inject
  public Sharder(Optional<DeviceSpec> deviceSpec) {
    this.deviceSpec = deviceSpec;
  }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'targetingDimensionToRemove'
in `src/main/java/com/android/tools/build/bundletool/splitters/AssetsDimensionSplitterFactory.java`
#### Snippet
```java
      Function<T, ApkTargeting> targetingSetter,
      Predicate<ApkTargeting> hasTargeting,
      Optional<TargetingDimension> targetingDimensionToRemove) {
    return new ModuleSplitSplitter() {

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'minimumV3RotationApiVersion'
in `src/main/java/com/android/tools/build/bundletool/model/SigningConfiguration.java`
#### Snippet
```java

    public abstract Builder setMinimumV3RotationApiVersion(
        Optional<Integer> minimumV3RotationApiVersion);

    public abstract Builder setRotationMinSdkVersion(Optional<Integer> rotationMinSdkVersion);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'rotationMinSdkVersion'
in `src/main/java/com/android/tools/build/bundletool/model/SigningConfiguration.java`
#### Snippet
```java
        Optional<Integer> minimumV3RotationApiVersion);

    public abstract Builder setRotationMinSdkVersion(Optional<Integer> rotationMinSdkVersion);

    public abstract Builder setSigningCertificateLineage(
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'optionalKeystorePassword'
in `src/main/java/com/android/tools/build/bundletool/model/SigningConfiguration.java`
#### Snippet
```java
      Path keystorePath,
      String keyAlias,
      Optional<Password> optionalKeystorePassword,
      Optional<Password> optionalKeyPassword) {
    SignerConfig signerConfig =
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'optionalKeyPassword'
in `src/main/java/com/android/tools/build/bundletool/model/SigningConfiguration.java`
#### Snippet
```java
      String keyAlias,
      Optional<Password> optionalKeystorePassword,
      Optional<Password> optionalKeyPassword) {
    SignerConfig signerConfig =
        SignerConfig.extractFromKeystore(
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'deviceSpec'
in `src/main/java/com/android/tools/build/bundletool/shards/SystemApksGenerator.java`
#### Snippet
```java
  private final Sharder sharder;
  private final ModuleSplitsToShardMerger shardsMerger;
  private final Optional<DeviceSpec> deviceSpec;
  private final CodeTransparencyInjector codeTransparencyInjector;
  private final BinaryArtProfilesInjector binaryArtProfilesInjector;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'deviceSpec'
in `src/main/java/com/android/tools/build/bundletool/shards/SystemApksGenerator.java`
#### Snippet
```java
      Sharder sharder,
      ModuleSplitsToShardMerger shardsMerger,
      Optional<DeviceSpec> deviceSpec,
      AppBundle appBundle) {
    this.moduleSplitter = moduleSplitter;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'stampSource'
in `src/main/java/com/android/tools/build/bundletool/shards/StandaloneApksGenerator.java`
#### Snippet
```java
public class StandaloneApksGenerator {

  private final Optional<SourceStamp> stampSource;
  private final ModuleSplitterForShards moduleSplitter;
  private final Sharder sharder;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'stampSource'
in `src/main/java/com/android/tools/build/bundletool/shards/StandaloneApksGenerator.java`
#### Snippet
```java
  @Inject
  public StandaloneApksGenerator(
      Optional<SourceStamp> stampSource,
      ModuleSplitterForShards moduleSplitter,
      Sharder sharder,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'deviceId'
in `src/main/java/com/android/tools/build/bundletool/transparency/ConnectedDeviceModeTransparencyChecker.java`
#### Snippet
```java
  }

  private static Device getDevice(AdbServer adbServer, Optional<String> deviceId) {
    DeviceAnalyzer deviceAnalyzer = new DeviceAnalyzer(adbServer);
    Device device;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'location'
in `src/main/java/com/android/tools/build/bundletool/model/ModuleEntry.java`
#### Snippet
```java
    public abstract Builder setPath(ZipPath path);

    public abstract Builder setFileLocation(Optional<ModuleEntryLocationInZipSource> location);

    public abstract Builder setFileLocation(ModuleEntryLocationInZipSource location);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'apexConfig'
in `src/main/java/com/android/tools/build/bundletool/model/utils/BundleParser.java`
#### Snippet
```java
      BundleType bundleType,
      Version bundletoolVersion,
      Optional<ApexConfig> apexConfig,
      Optional<SdkModulesConfig> sdkModulesConfig,
      ImmutableSet<ZipPath> nonModuleDirectories) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'sdkModulesConfig'
in `src/main/java/com/android/tools/build/bundletool/model/utils/BundleParser.java`
#### Snippet
```java
      Version bundletoolVersion,
      Optional<ApexConfig> apexConfig,
      Optional<SdkModulesConfig> sdkModulesConfig,
      ImmutableSet<ZipPath> nonModuleDirectories) {
    Map<BundleModuleName, BundleModule.Builder> moduleBuilders = new HashMap<>();
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'stampSource'
in `src/main/java/com/android/tools/build/bundletool/splitters/ModuleSplitter.java`
#### Snippet
```java
      VariantTargeting variantTargeting,
      ImmutableSet<String> allModuleNames,
      Optional<String> stampSource,
      StampType stampType) {
    this.module = checkNotNull(module);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'stampSource'
in `src/main/java/com/android/tools/build/bundletool/splitters/ModuleSplitter.java`
#### Snippet
```java
  private final ApkGenerationConfiguration apkGenerationConfiguration;
  private final VariantTargeting variantTargeting;
  private final Optional<String> stampSource;
  private final StampType stampType;
  private final AppBundle appBundle;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'stampSource'
in `src/main/java/com/android/tools/build/bundletool/splitters/ModuleSplitter.java`
#### Snippet
```java
      VariantTargeting variantTargeting,
      ImmutableSet<String> allModuleNames,
      Optional<String> stampSource,
      StampType stampType) {
    return new ModuleSplitter(
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'deviceId'
in `src/main/java/com/android/tools/build/bundletool/device/DeviceAnalyzer.java`
#### Snippet
```java

  /** Gets and validates the connected device. */
  public Device getAndValidateDevice(Optional<String> deviceId) throws TimeoutException {
    Device device =
        getTargetDevice(deviceId)
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'deviceId'
in `src/main/java/com/android/tools/build/bundletool/device/DeviceAnalyzer.java`
#### Snippet
```java
  }

  private Optional<Device> getTargetDevice(Optional<String> deviceId) throws TimeoutException {
    ImmutableList<Device> devices = adb.getDevices();
    if (devices.isEmpty()) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'deviceId'
in `src/main/java/com/android/tools/build/bundletool/device/DeviceAnalyzer.java`
#### Snippet
```java
  }

  public DeviceSpec getDeviceSpec(Optional<String> deviceId) {
    try {
      Device device = getAndValidateDevice(deviceId);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'localRuntimeEnabledSdkConfig'
in `src/main/java/com/android/tools/build/bundletool/preprocessors/LocalRuntimeEnabledSdkConfigPreprocessor.java`
#### Snippet
```java
  @Inject
  LocalRuntimeEnabledSdkConfigPreprocessor(
      Optional<LocalDeploymentRuntimeEnabledSdkConfig> localRuntimeEnabledSdkConfig) {
    this.defaultCertificateOverride =
        localRuntimeEnabledSdkConfig
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'id'
in `src/main/java/com/android/tools/build/bundletool/commands/EvaluateDeviceTargetingConfigCommand.java`
#### Snippet
```java
    abstract Builder setAdbServer(AdbServer adbServer);

    abstract Builder setDeviceId(Optional<String> id);

    abstract Builder setCountryCode(String countryCode);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'selectedTier'
in `src/main/java/com/android/tools/build/bundletool/commands/EvaluateDeviceTargetingConfigCommand.java`
#### Snippet
```java
  }

  private void printTier(Optional<DeviceTier> selectedTier, PrintStream out) {
    if (selectedTier.isPresent()) {
      out.println("Tier: " + selectedTier.get().getLevel());
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'deviceSpec'
in `src/main/java/com/android/tools/build/bundletool/commands/BuildApksManager.java`
#### Snippet
```java
    private final ApkBuildMode apkBuildMode;
    private final boolean enableUniversalAsFallbackForSplits;
    private final Optional<DeviceSpec> deviceSpec;

    private ApksToGenerate(
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'deviceSpec'
in `src/main/java/com/android/tools/build/bundletool/commands/BuildApksManager.java`
#### Snippet
```java
        ApkBuildMode apkBuildMode,
        boolean enableUniversalAsFallbackForSplits,
        Optional<DeviceSpec> deviceSpec) {
      this.appBundle = appBundle;
      this.apkBuildMode = apkBuildMode;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'deviceSpec'
in `src/main/java/com/android/tools/build/bundletool/commands/BuildApksManager.java`
#### Snippet
```java
  private final BuildApksCommand command;
  private final Version bundletoolVersion;
  private final Optional<DeviceSpec> deviceSpec;
  private final TempDirectory tempDir;

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'deviceSpec'
in `src/main/java/com/android/tools/build/bundletool/commands/BuildApksManager.java`
#### Snippet
```java
      BuildApksCommand command,
      Version bundletoolVersion,
      Optional<DeviceSpec> deviceSpec,
      TempDirectory tempDir,
      ApkSerializerManager apkSerializerManager,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'logPrintStream'
in `src/main/java/com/android/tools/build/bundletool/preprocessors/AppBundle64BitNativeLibrariesPreprocessor.java`
#### Snippet
```java
  AppBundle64BitNativeLibrariesPreprocessor(
      BundleModule64BitNativeLibrariesRemover bundleModule64BitNativeLibrariesRemover,
      Optional<PrintStream> logPrintStream) {
    this.bundleModule64BitNativeLibrariesRemover = bundleModule64BitNativeLibrariesRemover;
    this.logPrintStream = logPrintStream;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'logPrintStream'
in `src/main/java/com/android/tools/build/bundletool/preprocessors/AppBundle64BitNativeLibrariesPreprocessor.java`
#### Snippet
```java

  private final BundleModule64BitNativeLibrariesRemover bundleModule64BitNativeLibrariesRemover;
  private final Optional<PrintStream> logPrintStream;

  @Inject
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'timeout'
in `src/main/java/com/android/tools/build/bundletool/androidtools/AdbCommand.java`
#### Snippet
```java
        boolean staged,
        boolean enableRollback,
        Optional<Duration> timeout,
        Optional<String> deviceId,
        CommandExecutor commandExecutor) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'deviceId'
in `src/main/java/com/android/tools/build/bundletool/androidtools/AdbCommand.java`
#### Snippet
```java
        boolean enableRollback,
        Optional<Duration> timeout,
        Optional<String> deviceId,
        CommandExecutor commandExecutor) {
      ImmutableList.Builder<String> commandBuilder =
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'timeout'
in `src/main/java/com/android/tools/build/bundletool/androidtools/AdbCommand.java`
#### Snippet
```java
      boolean staged,
      boolean enableRollback,
      Optional<Duration> timeout,
      Optional<String> deviceId);

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'deviceId'
in `src/main/java/com/android/tools/build/bundletool/androidtools/AdbCommand.java`
#### Snippet
```java
      boolean enableRollback,
      Optional<Duration> timeout,
      Optional<String> deviceId);

  static AdbCommand create(Path adbPath) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'signingDescription'
in `src/main/java/com/android/tools/build/bundletool/io/ApkDescriptionHelper.java`
#### Snippet
```java

  static ApkDescription createApkDescription(
      ZipPath relativePath, ModuleSplit split, Optional<SigningDescription> signingDescription) {
    ApkDescription.Builder resultBuilder =
        ApkDescription.newBuilder()
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'mainDexListFile'
in `src/main/java/com/android/tools/build/bundletool/mergers/D8DexMerger.java`
#### Snippet
```java
      ImmutableList<Path> dexFiles,
      Path outputDir,
      Optional<Path> mainDexListFile,
      Optional<Path> proguardMap,
      boolean isDebuggable,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'proguardMap'
in `src/main/java/com/android/tools/build/bundletool/mergers/D8DexMerger.java`
#### Snippet
```java
      Path outputDir,
      Optional<Path> mainDexListFile,
      Optional<Path> proguardMap,
      boolean isDebuggable,
      int minSdkVersion) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'merged'
in `src/main/java/com/android/tools/build/bundletool/mergers/ModuleSplitsToShardMerger.java`
#### Snippet
```java

  private Optional<ResourceTable> mergeResourceTables(
      Optional<ResourceTable> merged, ModuleSplit split) {
    if (!merged.isPresent()) {
      return split.getResourceTable();
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'mergedResourceTable'
in `src/main/java/com/android/tools/build/bundletool/mergers/ModuleSplitsToShardMerger.java`
#### Snippet
```java
      ApkTargeting splitTargeting,
      AndroidManifest androidManifest,
      Optional<ResourceTable> mergedResourceTable,
      Map<String, TargetedAssetsDirectory> mergedAssetsConfig,
      SplitType mergedSplitType) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'value1'
in `src/main/java/com/android/tools/build/bundletool/model/utils/ConfigurationSizesMerger.java`
#### Snippet
```java
   * <p>This happens if they have the same value or any of them is absent.
   */
  private static <T> boolean areCompatible(Optional<T> value1, Optional<T> value2) {
    return value1.equals(value2) || !value1.isPresent() || !value2.isPresent();
  }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'value2'
in `src/main/java/com/android/tools/build/bundletool/model/utils/ConfigurationSizesMerger.java`
#### Snippet
```java
   * <p>This happens if they have the same value or any of them is absent.
   */
  private static <T> boolean areCompatible(Optional<T> value1, Optional<T> value2) {
    return value1.equals(value2) || !value1.isPresent() || !value2.isPresent();
  }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'mainDexListFile'
in `src/main/java/com/android/tools/build/bundletool/mergers/DexMerger.java`
#### Snippet
```java
      ImmutableList<Path> dexFiles,
      Path outputDir,
      Optional<Path> mainDexListFile,
      Optional<Path> proguardMap,
      boolean isDebuggable,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'proguardMap'
in `src/main/java/com/android/tools/build/bundletool/mergers/DexMerger.java`
#### Snippet
```java
      Path outputDir,
      Optional<Path> mainDexListFile,
      Optional<Path> proguardMap,
      boolean isDebuggable,
      int minSdkVersion);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'resourceConfigPath'
in `src/main/java/com/android/tools/build/bundletool/androidtools/Aapt2Command.java`
#### Snippet
```java
      public abstract Builder setCollapseResourceNames(boolean value);

      public abstract Builder setResourceConfigPath(Optional<Path> resourceConfigPath);

      public abstract Builder setDeduplicateResourceEntries(boolean value);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'xPathExpression'
in `src/main/java/com/android/tools/build/bundletool/commands/DumpManager.java`
#### Snippet
```java
  }

  void printManifest(BundleModuleName moduleName, Optional<String> xPathExpression) {
    // Extract the manifest from the bundle.
    ZipPath manifestPath =
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'binaryArtProfileMetadata'
in `src/main/java/com/android/tools/build/bundletool/splitters/BinaryArtProfilesInjector.java`
#### Snippet
```java

  private final Optional<ByteSource> binaryArtProfile;
  private final Optional<ByteSource> binaryArtProfileMetadata;

  public BinaryArtProfilesInjector(AppBundle appBundle) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'binaryArtProfile'
in `src/main/java/com/android/tools/build/bundletool/splitters/BinaryArtProfilesInjector.java`
#### Snippet
```java
  static final String BINARY_ART_PROFILE_METADATA_NAME = "baseline.profm";

  private final Optional<ByteSource> binaryArtProfile;
  private final Optional<ByteSource> binaryArtProfileMetadata;

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'disabledSinceVersion'
in `src/main/java/com/android/tools/build/bundletool/model/version/VersionGuardedFeature.java`
#### Snippet
```java
   * is enabled indefinitely.
   */
  private final Optional<Version> disabledSinceVersion;

  VersionGuardedFeature(String enabledSinceVersion) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'apkListener'
in `src/main/java/com/android/tools/build/bundletool/io/ApkSerializer.java`
#### Snippet
```java
  private final boolean verbose;

  ApkSerializer(Optional<ApkListener> apkListener, boolean verbose) {
    this.apkListener = apkListener.orElse(ApkListener.NO_OP);
    this.verbose = verbose;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'apkModifier'
in `src/main/java/com/android/tools/build/bundletool/io/ApkSerializerManager.java`
#### Snippet
```java
  public ApkSerializerManager(
      Bundle bundle,
      Optional<ApkModifier> apkModifier,
      @FirstVariantNumber Optional<Integer> firstVariantNumber,
      ApkBuildMode apkBuildMode,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'firstVariantNumber'
in `src/main/java/com/android/tools/build/bundletool/io/ApkSerializerManager.java`
#### Snippet
```java
      Bundle bundle,
      Optional<ApkModifier> apkModifier,
      @FirstVariantNumber Optional<Integer> firstVariantNumber,
      ApkBuildMode apkBuildMode,
      ApkPathManager apkPathManager,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'signingConfigProvider'
in `src/main/java/com/android/tools/build/bundletool/io/ApkSerializerManager.java`
#### Snippet
```java
      ApkOptimizations apkOptimizations,
      ApkSerializer apkSerializer,
      @ApkSigningConfigProvider Optional<SigningConfigurationProvider> signingConfigProvider) {
    this.bundle = bundle;
    this.apkModifier = apkModifier.orElse(ApkModifier.NO_OP);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'deviceSpec'
in `src/main/java/com/android/tools/build/bundletool/io/ApkSerializerManager.java`
#### Snippet
```java
      Path outputDirectory,
      GeneratedAssetSlices generatedAssetSlices,
      Optional<DeviceSpec> deviceSpec) {

    Predicate<ModuleSplit> deviceFilter =
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'deviceSpec'
in `src/main/java/com/android/tools/build/bundletool/io/ApkSerializerManager.java`
#### Snippet
```java
      GeneratedApks generatedApks,
      GeneratedAssetSlices generatedAssetSlices,
      Optional<DeviceSpec> deviceSpec,
      LocalTestingInfo localTestingInfo,
      ImmutableSet<BundleModuleName> permanentlyFusedModules) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'deviceSpec'
in `src/main/java/com/android/tools/build/bundletool/io/ApkSerializerManager.java`
#### Snippet
```java
      GeneratedApks generatedApks,
      GeneratedAssetSlices generatedAssetSlices,
      Optional<DeviceSpec> deviceSpec,
      LocalTestingInfo localTestingInfo,
      ImmutableSet<BundleModuleName> permanentlyFusedModules) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'signingConfigProvider'
in `src/main/java/com/android/tools/build/bundletool/io/ApkSerializerManager.java`
#### Snippet
```java
  private final ApkOptimizations apkOptimizations;
  private final ApkSerializer apkSerializer;
  private final Optional<SigningConfigurationProvider> signingConfigProvider;

  @Inject
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'deviceSpec'
in `src/main/java/com/android/tools/build/bundletool/io/ApkSerializerManager.java`
#### Snippet
```java
  @VisibleForTesting
  ImmutableList<Variant> serializeApks(
      Path outputDirectory, GeneratedApks generatedApks, Optional<DeviceSpec> deviceSpec) {
    validateInput(generatedApks, apkBuildMode);

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'deviceSpec'
in `src/main/java/com/android/tools/build/bundletool/io/ApkSerializerManager.java`
#### Snippet
```java
      GeneratedApks generatedApks,
      GeneratedAssetSlices generatedAssetSlices,
      Optional<DeviceSpec> deviceSpec,
      LocalTestingInfo localTestingInfo,
      ImmutableSet<BundleModuleName> permanentlyFusedModules) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'nativeConfig'
in `src/main/java/com/android/tools/build/bundletool/splitters/NativeLibrariesHelper.java`
#### Snippet
```java
  private static boolean mayHaveNativeActivities(
      AndroidManifest manifest,
      Optional<NativeLibraries> nativeConfig,
      ImmutableCollection<ModuleEntry> entries) {
    return manifest.hasExplicitlyDefinedNativeActivities() || hasMainLibrary(nativeConfig, entries);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'nativeConfig'
in `src/main/java/com/android/tools/build/bundletool/splitters/NativeLibrariesHelper.java`
#### Snippet
```java

  private static boolean hasMainLibrary(
      Optional<NativeLibraries> nativeConfig, ImmutableCollection<ModuleEntry> entries) {
    List<ZipPath> nativeLibPaths =
        stream(nativeConfig)
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'customAppStorePackageName'
in `src/main/java/com/android/tools/build/bundletool/archive/ArchivedResourcesHelper.java`
#### Snippet
```java
  public static ImmutableMap<String, Integer> injectExtraResources(
      ResourceInjector resourceInjector,
      Optional<String> customAppStorePackageName,
      Optional<XmlProtoAttribute> iconAttribute,
      Optional<XmlProtoAttribute> roundIconAttribute) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'iconAttribute'
in `src/main/java/com/android/tools/build/bundletool/archive/ArchivedResourcesHelper.java`
#### Snippet
```java
      ResourceInjector resourceInjector,
      Optional<String> customAppStorePackageName,
      Optional<XmlProtoAttribute> iconAttribute,
      Optional<XmlProtoAttribute> roundIconAttribute) {
    ImmutableMap.Builder<String, Integer> resourceNameToIdMapBuilder =
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'roundIconAttribute'
in `src/main/java/com/android/tools/build/bundletool/archive/ArchivedResourcesHelper.java`
#### Snippet
```java
      Optional<String> customAppStorePackageName,
      Optional<XmlProtoAttribute> iconAttribute,
      Optional<XmlProtoAttribute> roundIconAttribute) {
    ImmutableMap.Builder<String, Integer> resourceNameToIdMapBuilder =
        ImmutableMap.<String, Integer>builder()
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'iconAttribute'
in `src/main/java/com/android/tools/build/bundletool/archive/ArchivedResourcesHelper.java`
#### Snippet
```java
      int cloudResourceId,
      int opacityLayerResourceId,
      Optional<XmlProtoAttribute> iconAttribute,
      Optional<XmlProtoAttribute> roundIconAttribute,
      String archivedClassesDexPath)
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'roundIconAttribute'
in `src/main/java/com/android/tools/build/bundletool/archive/ArchivedResourcesHelper.java`
#### Snippet
```java
      int opacityLayerResourceId,
      Optional<XmlProtoAttribute> iconAttribute,
      Optional<XmlProtoAttribute> roundIconAttribute,
      String archivedClassesDexPath)
      throws IOException {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'customAppStorePackageName'
in `src/main/java/com/android/tools/build/bundletool/archive/ArchivedResourcesHelper.java`
#### Snippet
```java
  }

  public static String getAppStorePackageName(Optional<String> customAppStorePackageName) {
    return customAppStorePackageName.orElse(PLAY_STORE_PACKAGE_NAME);
  }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'apkListener'
in `src/main/java/com/android/tools/build/bundletool/io/ModuleSplitSerializer.java`
#### Snippet
```java
  @Inject
  ModuleSplitSerializer(
      Optional<ApkListener> apkListener,
      @VerboseLogs boolean verbose,
      Aapt2ResourceConverter aapt2ResourceConverterFactory,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'p7ZipCommand'
in `src/main/java/com/android/tools/build/bundletool/io/ModuleSplitSerializer.java`
#### Snippet
```java
      Version bundletoolVersion,
      ListeningExecutorService executorService,
      Optional<P7ZipCommand> p7ZipCommand) {
    super(apkListener, verbose);
    this.aapt2ResourceConverter = aapt2ResourceConverterFactory;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'p7ZipCommand'
in `src/main/java/com/android/tools/build/bundletool/io/ModuleSplitSerializer.java`
#### Snippet
```java
  private final ListeningExecutorService executorService;
  private final boolean use7ZipCompression;
  private final Optional<P7ZipCommand> p7ZipCommand;

  @Inject
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'signingConfigProvider'
in `src/main/java/com/android/tools/build/bundletool/io/ApkSigner.java`
#### Snippet
```java
  private static final String SIGNER_CONFIG_NAME = "BNDLTOOL";

  private final Optional<SigningConfigurationProvider> signingConfigProvider;
  private final Optional<SourceStamp> sourceStampSigningConfig;
  private final TempDirectory tempDirectory;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'signingConfigProvider'
in `src/main/java/com/android/tools/build/bundletool/io/ApkSigner.java`
#### Snippet
```java
  @Inject
  ApkSigner(
      @ApkSigningConfigProvider Optional<SigningConfigurationProvider> signingConfigProvider,
      Optional<SourceStamp> sourceStampSigningConfig,
      TempDirectory tempDirectory) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'sourceStampSigningConfig'
in `src/main/java/com/android/tools/build/bundletool/io/ApkSigner.java`
#### Snippet
```java
  ApkSigner(
      @ApkSigningConfigProvider Optional<SigningConfigurationProvider> signingConfigProvider,
      Optional<SourceStamp> sourceStampSigningConfig,
      TempDirectory tempDirectory) {
    this.signingConfigProvider = signingConfigProvider;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'sourceStampSigningConfig'
in `src/main/java/com/android/tools/build/bundletool/io/ApkSigner.java`
#### Snippet
```java

  private final Optional<SigningConfigurationProvider> signingConfigProvider;
  private final Optional<SourceStamp> sourceStampSigningConfig;
  private final TempDirectory tempDirectory;

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'onDemandElement'
in `src/main/java/com/android/tools/build/bundletool/model/ManifestDeliveryElement.java`
#### Snippet
```java
  }

  private static void validateOnDemandElement(Optional<XmlProtoElement> onDemandElement) {
    Optional<XmlProtoElement> offendingChild =
        onDemandElement.flatMap(element -> element.getChildrenElements().findAny());
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'fastFollowElement'
in `src/main/java/com/android/tools/build/bundletool/model/ManifestDeliveryElement.java`
#### Snippet
```java
  }

  private static void validateFastFollowElement(Optional<XmlProtoElement> fastFollowElement) {
    Optional<XmlProtoElement> offendingChild =
        fastFollowElement.flatMap(element -> element.getChildrenElements().findAny());
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'installTimeElement'
in `src/main/java/com/android/tools/build/bundletool/model/ManifestDeliveryElement.java`
#### Snippet
```java
  }

  private static void validateInstallTimeElement(Optional<XmlProtoElement> installTimeElement) {
    Optional<XmlProtoElement> offendingElement =
        installTimeElement.flatMap(
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'installedPackage'
in `src/main/java/com/android/tools/build/bundletool/commands/InstallMultiApksCommand.java`
#### Snippet
```java
      DeviceSpec deviceSpec,
      PackagePathVersion apksArchive,
      Optional<InstalledPackageInfo> installedPackage,
      TempDirectory tempDirectory) {
    logger.info(String.format("Extracting package '%s'", apksArchive.getPackageName()));
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'runAsPackageName'
in `src/main/java/com/android/tools/build/bundletool/device/Device.java`
#### Snippet
```java

  public abstract void removeRemotePath(
      String remoteFilePath, Optional<String> runAsPackageName, Duration timeout)
      throws IOException;

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'maxSdkVersion'
in `src/main/java/com/android/tools/build/bundletool/model/targeting/AlternativeVariantTargetingPopulator.java`
#### Snippet
```java
      extends AlternativeVariantTargetingPopulator<SdkVersion> {

    private final Optional<Integer> maxSdkVersion;

    public SdkVersionAlternativesPopulator() {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'maxSdkVersion'
in `src/main/java/com/android/tools/build/bundletool/model/targeting/AlternativeVariantTargetingPopulator.java`
#### Snippet
```java

  public static GeneratedApks populateAlternativeVariantTargeting(
      GeneratedApks generatedApks, Optional<Integer> maxSdkVersion) {
    ImmutableList<ModuleSplit> standaloneApks =
        new AbiAlternativesPopulator()
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'maxSdkVersion'
in `src/main/java/com/android/tools/build/bundletool/model/targeting/AlternativeVariantTargetingPopulator.java`
#### Snippet
```java
    }

    public SdkVersionAlternativesPopulator(Optional<Integer> maxSdkVersion) {
      this.maxSdkVersion = maxSdkVersion;
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'versionCode'
in `src/main/java/com/android/tools/build/bundletool/model/AndroidManifest.java`
#### Snippet
```java
  public static AndroidManifest createForConfigSplit(
      String packageName,
      Optional<Integer> versionCode,
      String splitId,
      String featureSplitId,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'extractNativeLibs'
in `src/main/java/com/android/tools/build/bundletool/model/AndroidManifest.java`
#### Snippet
```java
      String splitId,
      String featureSplitId,
      Optional<Boolean> extractNativeLibs) {
    checkNotNull(splitId);
    checkArgument(!splitId.isEmpty(), "Split Id cannot be empty for config split.");
```

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'TempDirectory' used without 'try'-with-resources statement
in `src/main/java/com/android/tools/build/bundletool/commands/BuildSdkAsarCommand.java`
#### Snippet
```java

    try (ZipFile bundleZip = new ZipFile(getSdkBundlePath().toFile())) {
      TempDirectory tempDir = new TempDirectory(getClass().getSimpleName());
      SdkBundleValidator bundleValidator = SdkBundleValidator.create();
      bundleValidator.validateFile(bundleZip);
```

## RuleId[id=SimplifyOptionalCallChains]
### SimplifyOptionalCallChains
Optional chain can be simplified
in `src/main/java/com/android/tools/build/bundletool/io/ApkSerializerManager.java`
#### Snippet
```java
                                ? 0
                                : Integer.parseInt(suffix.getDefaultSuffix()))
                    .orElse(0)))
        .build();
  }
```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import com.android.tools.build.bundletool.model.version.VersionGuardedFeature;`
in `src/main/java/com/android/tools/build/bundletool/commands/BuildApksManager.java`
#### Snippet
```java
import com.android.tools.build.bundletool.model.utils.Versions;
import com.android.tools.build.bundletool.model.version.Version;
import com.android.tools.build.bundletool.model.version.VersionGuardedFeature;
import com.android.tools.build.bundletool.optimizations.ApkOptimizations;
import com.android.tools.build.bundletool.preprocessors.LocalTestingPreprocessor;
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/android/tools/build/bundletool/device/ApkMatcher.java`
#### Snippet
```java
   * alternatives.
   *
   * @throws IncompatibleDeviceException
   */
  public void checkCompatibleWithApkTargeting(ModuleSplit moduleSplit) {
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `activityManagerCommandResult` may be 'final'
in `src/main/java/com/android/tools/build/bundletool/device/activitymanager/ActivityManagerRunner.java`
#### Snippet
```java
  private final Device device;

  private Supplier<ImmutableList<String>> activityManagerCommandResult =
      Suppliers.memoize(
          () -> {
```

## RuleId[id=SlowAbstractSetRemoveAll]
### SlowAbstractSetRemoveAll
Call to 'set.removeAll(list)' may work slowly
in `src/main/java/com/android/tools/build/bundletool/splitters/AbiNativeLibrariesSplitter.java`
#### Snippet
```java
                .setEntries(entriesList);
        splits.add(splitBuilder.build());
      leftOverEntries.removeAll(entriesList);
    }
    if (!leftOverEntries.isEmpty()) {
```

## RuleId[id=ConfusingMainMethod]
### ConfusingMainMethod
Method `main()` does not have signature 'public static void main(String\[\])'
in `src/main/java/com/android/tools/build/bundletool/BundleToolMain.java`
#### Snippet
```java

  /** Parses the flags and routes to the appropriate command handler. */
  static void main(String[] args, Runtime runtime) {
    final ParsedFlags flags;
    try {
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `validator` is redundant
in `src/main/java/com/android/tools/build/bundletool/validation/AppBundleValidator.java`
#### Snippet
```java

  public static AppBundleValidator create(ImmutableList<SubValidator> extraSubValidators) {
    AppBundleValidator validator =
        new AppBundleValidator(
            ImmutableList.<SubValidator>builder()
```

### UnnecessaryLocalVariable
Local variable `mergedDexFiles` is redundant
in `src/main/java/com/android/tools/build/bundletool/mergers/ModuleSplitsToShardMerger.java`
#### Snippet
```java
          writeModuleEntriesToIndexedFiles(dexEntries, dexOriginalDir, /* fileSuffix= */ ".dex");

      ImmutableList<Path> mergedDexFiles =
          dexMerger.merge(
              dexFiles,
```

### UnnecessaryLocalVariable
Local variable `alternativeMinSdk` is redundant
in `src/main/java/com/android/tools/build/bundletool/model/targeting/TargetingUtils.java`
#### Snippet
```java
  public static int getMaxSdk(SdkVersionTargeting sdkVersionTargeting) {
    int minSdk = getMinSdk(sdkVersionTargeting);
    int alternativeMinSdk =
        sdkVersionTargeting.getAlternativesList().stream()
            .mapToInt(alternativeSdk -> alternativeSdk.getMin().getValue())
```

## RuleId[id=RedundantStringFormatCall]
### RedundantStringFormatCall
Redundant call to `printf()`
in `src/main/java/com/android/tools/build/bundletool/commands/ValidateBundleCommand.java`
#### Snippet
```java

  private void printBundleSummary(AppBundle appBundle) {
    System.out.printf("App Bundle information\n");
    System.out.printf("------------\n");
    System.out.printf("Feature modules:\n");
```

### RedundantStringFormatCall
Redundant call to `printf()`
in `src/main/java/com/android/tools/build/bundletool/commands/ValidateBundleCommand.java`
#### Snippet
```java
  private void printBundleSummary(AppBundle appBundle) {
    System.out.printf("App Bundle information\n");
    System.out.printf("------------\n");
    System.out.printf("Feature modules:\n");
    for (Entry<BundleModuleName, BundleModule> moduleEntry :
```

### RedundantStringFormatCall
Redundant call to `printf()`
in `src/main/java/com/android/tools/build/bundletool/commands/ValidateBundleCommand.java`
#### Snippet
```java
    System.out.printf("App Bundle information\n");
    System.out.printf("------------\n");
    System.out.printf("Feature modules:\n");
    for (Entry<BundleModuleName, BundleModule> moduleEntry :
        appBundle.getFeatureModules().entrySet()) {
```

### RedundantStringFormatCall
Redundant call to `printf()`
in `src/main/java/com/android/tools/build/bundletool/commands/ValidateBundleCommand.java`
#### Snippet
```java
    }
    if (!appBundle.getAssetModules().isEmpty()) {
      System.out.printf("Asset packs:\n");
      for (Entry<BundleModuleName, BundleModule> moduleEntry :
          appBundle.getAssetModules().entrySet()) {
```

## RuleId[id=BusyWait]
### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `src/main/java/com/android/tools/build/bundletool/device/AdbServer.java`
#### Snippet
```java
              String.format("Timed out (%d ms) while waiting for ADB.", timeoutMs));
        }
        sleep(1000);
      }
    } catch (InterruptedException e) {
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `!keyAlias.isPresent()` is always `true` when reached
in `src/main/java/com/android/tools/build/bundletool/commands/BuildSdkApksCommand.java`
#### Snippet
```java
          SigningConfiguration.builder().setSignerConfig(signerConfig);
      buildSdkApksCommand.setSigningConfiguration(builder.build());
    } else if (keystorePath.isPresent() && !keyAlias.isPresent()) {
      throw InvalidCommandException.builder()
          .withInternalMessage("Flag --ks-key-alias is required when --ks is set.")
```

### ConstantValue
Condition `!keystorePath.isPresent()` is always `true`
in `src/main/java/com/android/tools/build/bundletool/commands/BuildSdkApksCommand.java`
#### Snippet
```java
          .withInternalMessage("Flag --ks-key-alias is required when --ks is set.")
          .build();
    } else if (!keystorePath.isPresent() && keyAlias.isPresent()) {
      throw InvalidCommandException.builder()
          .withInternalMessage("Flag --ks is required when --ks-key-alias is set.")
```

### ConstantValue
Condition `!keyAlias.isPresent()` is always `true` when reached
in `src/main/java/com/android/tools/build/bundletool/commands/BuildSdkApksForAppCommand.java`
#### Snippet
```java
          SigningConfiguration.builder().setSignerConfig(signerConfig);
      buildSdkApksForAppCommand.setSigningConfiguration(builder.build());
    } else if (keystorePath.isPresent() && !keyAlias.isPresent()) {
      throw InvalidCommandException.builder()
          .withInternalMessage("Flag --ks-key-alias is required when --ks is set.")
```

### ConstantValue
Condition `!keystorePath.isPresent()` is always `true`
in `src/main/java/com/android/tools/build/bundletool/commands/BuildSdkApksForAppCommand.java`
#### Snippet
```java
          .withInternalMessage("Flag --ks-key-alias is required when --ks is set.")
          .build();
    } else if (!keystorePath.isPresent() && keyAlias.isPresent()) {
      throw InvalidCommandException.builder()
          .withInternalMessage("Flag --ks is required when --ks-key-alias is set.")
```

### ConstantValue
Value `isFirstSelectorRule` is always 'true'
in `src/main/java/com/android/tools/build/bundletool/commands/PrintDeviceTargetingConfigCommand.java`
#### Snippet
```java
  private void printDeviceSelector(DeviceSelector deviceSelector, String indent) {
    boolean isFirstSelectorRule = true;
    isFirstSelectorRule = printRamRule(deviceSelector, isFirstSelectorRule, indent);
    isFirstSelectorRule =
        printListRule(
```

### ConstantValue
Condition `!oldestSignerPropertiesPath.isPresent()` is always `true` when reached
in `src/main/java/com/android/tools/build/bundletool/commands/BuildApksCommand.java`
#### Snippet
```java
              oldestSignerProperties.getKeystorePassword(),
              oldestSignerProperties.getKeyPassword()));
    } else if (lineagePath.isPresent() && !oldestSignerPropertiesPath.isPresent()) {
      throw InvalidCommandException.builder()
          .withInternalMessage(
```

### ConstantValue
Condition `!lineagePath.isPresent()` is always `true`
in `src/main/java/com/android/tools/build/bundletool/commands/BuildApksCommand.java`
#### Snippet
```java
              "Flag '%s' is required when '%s' is set.", OLDEST_SIGNER_FLAG, LINEAGE_FLAG)
          .build();
    } else if (!lineagePath.isPresent() && oldestSignerPropertiesPath.isPresent()) {
      throw InvalidCommandException.builder()
          .withInternalMessage(
```

### ConstantValue
Condition `!keyAlias.isPresent()` is always `true` when reached
in `src/main/java/com/android/tools/build/bundletool/commands/BuildApksCommand.java`
#### Snippet
```java
      populateLineageFromFlags(builder, flags);
      buildApksCommand.setSigningConfiguration(builder.build());
    } else if (keystorePath.isPresent() && !keyAlias.isPresent()) {
      throw InvalidCommandException.builder()
          .withInternalMessage("Flag --ks-key-alias is required when --ks is set.")
```

### ConstantValue
Condition `!keystorePath.isPresent()` is always `true`
in `src/main/java/com/android/tools/build/bundletool/commands/BuildApksCommand.java`
#### Snippet
```java
          .withInternalMessage("Flag --ks-key-alias is required when --ks is set.")
          .build();
    } else if (!keystorePath.isPresent() && keyAlias.isPresent()) {
      throw InvalidCommandException.builder()
          .withInternalMessage("Flag --ks is required when --ks-key-alias is set.")
```

## RuleId[id=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/com/android/tools/build/bundletool/model/WearApkLocator.java`
#### Snippet
```java
    }

    return Optional.of(rawPathResId.get().getChildText().get().getText());
  }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/com/android/tools/build/bundletool/validation/EntryClashValidator.java`
#### Snippet
```java

  private static void checkEqualEntries(ZipPath path, BundleModule module1, BundleModule module2) {
    ModuleEntry entry1 = module1.getEntry(path).get();
    ModuleEntry entry2 = module2.getEntry(path).get();
    if (!entry1.equals(entry2)) {
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/com/android/tools/build/bundletool/validation/EntryClashValidator.java`
#### Snippet
```java
  private static void checkEqualEntries(ZipPath path, BundleModule module1, BundleModule module2) {
    ModuleEntry entry1 = module1.getEntry(path).get();
    ModuleEntry entry2 = module2.getEntry(path).get();
    if (!entry1.equals(entry2)) {
      throw InvalidBundleException.builder()
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/com/android/tools/build/bundletool/validation/NestedTargetingValidator.java`
#### Snippet
```java
    ImmutableSet<DirectoryNestedTargeting> supportedNestedTargeting =
        ImmutableSet.copyOf(
            directoryAllNestedTargetingByPathBaseName.asMap().values().stream().findAny().get());
    validateNestingDimensionOrder(module, supportedNestedTargeting);
    validateNestedTargetingCoversAllCartesianProductPoints(module, supportedNestedTargeting);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/com/android/tools/build/bundletool/validation/NestedTargetingValidator.java`
#### Snippet
```java
            .map(DirectoryNestedTargeting::getTargetingDimensionOrder)
            .max(Comparator.comparing(List::size))
            .get();
    ImmutableSet<TargetingDimension> targetingDimensionOrderRefSet =
        ImmutableSet.copyOf(targetingDimensionOrderRef);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/com/android/tools/build/bundletool/validation/AbiParityValidator.java`
#### Snippet
```java
        .map(TargetedDirectorySegment::parse)
        .map(TargetedDirectorySegment::getName)
        .map(subDir -> AbiName.fromLibSubDirName(subDir).get().toProto())
        .collect(toImmutableSet());
  }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/com/android/tools/build/bundletool/model/ManifestEditor.java`
#### Snippet
```java
            .getElement()
            .getAttribute(TOOLS_NAMESPACE_URI, REQUIRED_BY_PRIVACY_SANDBOX_SDK_ATTRIBUTE_NAME)
            .get()
            .getValueAsBoolean();
  }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/com/android/tools/build/bundletool/model/targeting/TargetedDirectorySegment.java`
#### Snippet
```java
                String.format(
                    "#%s_%s",
                    getTargetingKey(dimension).get(),
                    getTargetingValue(targeting, dimension).get()))
        .collect(joining(""));
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/com/android/tools/build/bundletool/model/targeting/TargetedDirectorySegment.java`
#### Snippet
```java
                    "#%s_%s",
                    getTargetingKey(dimension).get(),
                    getTargetingValue(targeting, dimension).get()))
        .collect(joining(""));
  }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/com/android/tools/build/bundletool/shards/SystemApksGenerator.java`
#### Snippet
```java
  private ImmutableSet<ModuleSplit> filterOutUnusedLanguageSplits(
      ImmutableSet<ModuleSplit> splits) {
    ApkMatcher apkMatcher = new ApkMatcher(deviceSpec.get());
    return splits.stream()
        .filter(
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/com/android/tools/build/bundletool/transparency/ConnectedDeviceModeTransparencyChecker.java`
#### Snippet
```java

  public static TransparencyCheckResult checkTransparency(CheckTransparencyCommand command) {
    command.getAdbServer().get().init(command.getAdbPath().get());
    AdbRunner adbRunner = new AdbRunner(command.getAdbServer().get());
    Device adbDevice = getDevice(command.getAdbServer().get(), command.getDeviceId());
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/com/android/tools/build/bundletool/transparency/ConnectedDeviceModeTransparencyChecker.java`
#### Snippet
```java

  public static TransparencyCheckResult checkTransparency(CheckTransparencyCommand command) {
    command.getAdbServer().get().init(command.getAdbPath().get());
    AdbRunner adbRunner = new AdbRunner(command.getAdbServer().get());
    Device adbDevice = getDevice(command.getAdbServer().get(), command.getDeviceId());
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/com/android/tools/build/bundletool/transparency/ConnectedDeviceModeTransparencyChecker.java`
#### Snippet
```java
    // Execute a shell command to retrieve paths to all APKs for the given package name.
    AdbShellCommandTask adbShellCommandTask =
        new AdbShellCommandTask(adbDevice, "pm path " + command.getPackageName().get());
    ImmutableList<String> pathsToApksOnDevice =
        adbShellCommandTask.execute().stream()
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/com/android/tools/build/bundletool/splitters/AbiApexImagesSplitter.java`
#### Snippet
```java
    }

    List<TargetedApexImage> allTargetedImages = moduleSplit.getApexConfig().get().getImageList();

    // A set of all MultiAbis (flattened for repeated values) for easy generation of alternatives.
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/com/android/tools/build/bundletool/commands/BuildApksModule.java`
#### Snippet
```java
    Optional<DeviceSpec> deviceSpec = command.getDeviceSpec();
    if (command.getGenerateOnlyForConnectedDevice()) {
      AdbServer adbServer = command.getAdbServer().get();
      adbServer.init(command.getAdbPath().get());

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/com/android/tools/build/bundletool/commands/BuildApksModule.java`
#### Snippet
```java
    if (command.getGenerateOnlyForConnectedDevice()) {
      AdbServer adbServer = command.getAdbServer().get();
      adbServer.init(command.getAdbPath().get());

      deviceSpec = Optional.of(new DeviceAnalyzer(adbServer).getDeviceSpec(command.getDeviceId()));
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/com/android/tools/build/bundletool/validation/AndroidManifestValidator.java`
#### Snippet
```java
          .build();
    }
    ModuleDeliveryType instantDelivery = module.getInstantDeliveryType().get();
    if (instantDelivery.equals(ALWAYS_INITIAL_INSTALL)
        || instantDelivery.equals(CONDITIONAL_INITIAL_INSTALL)) {
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/com/android/tools/build/bundletool/model/utils/SdkToolsLocator.java`
#### Snippet
```java

    // Any sane Java runtime should define this property.
    String pathSeparator = systemEnvironmentProvider.getProperty("path.separator").get();

    PathMatcher binPathMatcher = fileSystem.getPathMatcher(binaryGlob);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/com/android/tools/build/bundletool/commands/EvaluateDeviceTargetingConfigCommand.java`
#### Snippet
```java
  private DeviceProperties.Builder getDevicePropertiesFromConnectedDevice()
      throws TimeoutException {
    Path pathToAdb = getAdbPath().get();
    FilePreconditions.checkFileExistsAndExecutable(pathToAdb);

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/com/android/tools/build/bundletool/commands/EvaluateDeviceTargetingConfigCommand.java`
#### Snippet
```java
    FilePreconditions.checkFileExistsAndExecutable(pathToAdb);

    AdbServer adb = getAdbServer().get();
    adb.init(pathToAdb);
    Device device = new DeviceAnalyzer(adb).getAndValidateDevice(getDeviceId());
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/com/android/tools/build/bundletool/commands/BuildSdkApksCommand.java`
#### Snippet
```java
        out.printf(
            "INFO: The APKs will be signed with the debug keystore found at '%s'.%n",
            DebugKeystoreUtils.DEBUG_KEYSTORE_CACHE.getUnchecked(provider).get());
        buildSdkApksCommand.setSigningConfiguration(debugConfig.get());
      } else {
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/com/android/tools/build/bundletool/commands/BuildSdkApksForAppCommand.java`
#### Snippet
```java
  private void executeForSdkBundle() {
    try (TempDirectory tempDir = new TempDirectory(getClass().getSimpleName());
        ZipFile sdkBundleZip = new ZipFile(getSdkBundlePath().get().toFile())) {
      Path modulesPath = tempDir.getPath().resolve(EXTRACTED_SDK_MODULES_FILE_NAME);
      try (ZipFile modulesZip = getModulesZip(sdkBundleZip, modulesPath)) {
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/com/android/tools/build/bundletool/commands/BuildSdkApksForAppCommand.java`
#### Snippet
```java
        out.printf(
            "INFO: The APKs will be signed with the debug keystore found at '%s'.%n",
            DebugKeystoreUtils.DEBUG_KEYSTORE_CACHE.getUnchecked(provider).get());
        buildSdkApksForAppCommand.setSigningConfiguration(debugConfig.get());
      } else {
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/com/android/tools/build/bundletool/commands/BuildSdkApksForAppCommand.java`
#### Snippet
```java
  private void executeForSdkArchive() {
    try (TempDirectory tempDir = new TempDirectory(getClass().getSimpleName());
        ZipFile asarZip = new ZipFile(getSdkArchivePath().get().toFile())) {
      Path modulesPath = tempDir.getPath().resolve(EXTRACTED_SDK_MODULES_FILE_NAME);
      try (ZipFile modulesZip = getModulesZip(asarZip, modulesPath)) {
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/com/android/tools/build/bundletool/transparency/BundleModeTransparencyChecker.java`
#### Snippet
```java

  public static TransparencyCheckResult checkTransparency(CheckTransparencyCommand command) {
    try (ZipFile bundleZip = new ZipFile(command.getBundlePath().get().toFile())) {
      AppBundle inputBundle = AppBundle.buildFromZip(bundleZip);
      return BundleTransparencyCheckUtils.checkTransparency(inputBundle);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/com/android/tools/build/bundletool/model/utils/ResourcesUtils.java`
#### Snippet
```java
  /** Returns the smallest screen density from the ones given. */
  public static DensityAlias getLowestDensity(ImmutableCollection<DensityAlias> densities) {
    return densities.stream().min(comparing(DENSITY_ALIAS_TO_DPI_MAP::get)).get();
  }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/com/android/tools/build/bundletool/transparency/ApkModeTransparencyChecker.java`
#### Snippet
```java
    try (TempDirectory tempDir = new TempDirectory("apk-transparency-checker")) {
      return ApkTransparencyCheckUtils.checkTransparency(
          extractAllApksFromZip(command.getApkZipPath().get(), tempDir));
    } catch (IOException e) {
      throw new UncheckedIOException("An error occurred when processing the file.", e);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/com/android/tools/build/bundletool/mergers/ModuleSplitsToShardMerger.java`
#### Snippet
```java
    // Add the APEX config as it's used to identify APEX APKs.
    return shard.toBuilder()
        .setApexConfig(splitsOfShard.get(0).getApexConfig().get())
        .setApexEmbeddedApkConfigs(splitsOfShard.get(0).getApexEmbeddedApkConfigs())
        .build();
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/com/android/tools/build/bundletool/io/ModuleEntriesPacker.java`
#### Snippet
```java
  private String assignedByBundleLocation(ModuleEntry entry) {
    return assignedEntryNameByBundleLocation.computeIfAbsent(
        entry.getFileLocation().get(), (location) -> nameAssigner.nextName());
  }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/com/android/tools/build/bundletool/mergers/FusingAndroidManifestMerger.java`
#### Snippet
```java
                    meta ->
                        meta.getAndroidAttribute(AndroidManifest.NAME_RESOURCE_ID)
                            .get()
                            .getValueAsString(),
                    Function.identity(),
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/com/android/tools/build/bundletool/mergers/FusingAndroidManifestMerger.java`
#### Snippet
```java

  private static String getNameAttribute(XmlProtoElement element) {
    return element.getAndroidAttribute(AndroidManifest.NAME_RESOURCE_ID).get().getValueAsString();
  }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/com/android/tools/build/bundletool/sdkmodule/SdkModuleToAppBundleModuleConverter.java`
#### Snippet
```java
    // characters are not allowed in module names.
    String sdkModuleName =
        sdkModule.getSdkModulesConfig().get().getSdkPackageName().replace(".", "");
    return module.toBuilder()
        .setName(BundleModuleName.create(sdkModuleName))
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/com/android/tools/build/bundletool/sdkmodule/SdkModuleToAppBundleModuleConverter.java`
#### Snippet
```java
        new XmlPackageIdRemapper(inheritedAppProperties.getResourcesPackageId());
    this.dexAndResourceRepackager =
        new DexAndResourceRepackager(sdkModule.getSdkModulesConfig().get(), inheritedAppProperties);
    this.androidResourceRenamer = new AndroidResourceRenamer(sdkModule.getSdkModulesConfig().get());
    this.inheritedAppProperties = inheritedAppProperties;
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/com/android/tools/build/bundletool/sdkmodule/SdkModuleToAppBundleModuleConverter.java`
#### Snippet
```java
        SdkSplitPropertiesInheritedFromApp.newBuilder()
            .setPackageName(appBaseModuleManifest.getPackageName())
            .setVersionCode(appBaseModuleManifest.getVersionCode().get())
            .setMinSdkVersion(appBaseModuleManifest.getMinSdkVersion().get())
            .setResourcesPackageId(sdkDependencyConfig.getResourcesPackageId())
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/com/android/tools/build/bundletool/sdkmodule/SdkModuleToAppBundleModuleConverter.java`
#### Snippet
```java
            .setPackageName(appBaseModuleManifest.getPackageName())
            .setVersionCode(appBaseModuleManifest.getVersionCode().get())
            .setMinSdkVersion(appBaseModuleManifest.getMinSdkVersion().get())
            .setResourcesPackageId(sdkDependencyConfig.getResourcesPackageId())
            .build());
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/com/android/tools/build/bundletool/model/targeting/TargetingUtils.java`
#### Snippet
```java
        .collect(
            toImmutableMap(
                identity(), dimension -> extractDimensionTargeting(targeting, dimension).get()));
  }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/com/android/tools/build/bundletool/shards/StandaloneApexApksGenerator.java`
#### Snippet
```java
            ImmutableList.of(masterSplit, multiAbiSplit), Maps.newHashMap());
    return mergedShard.toBuilder()
        .setApexConfig(masterSplit.getApexConfig().get())
        .setApexEmbeddedApkConfigs(masterSplit.getApexEmbeddedApkConfigs())
        .setVariantTargeting(standaloneApkVariantTargeting(mergedShard))
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/com/android/tools/build/bundletool/commands/BuildApksCommand.java`
#### Snippet
```java
        out.printf(
            "INFO: The stamp will be signed with the debug keystore found at '%s'.%n",
            DebugKeystoreUtils.DEBUG_KEYSTORE_CACHE.getUnchecked(systemEnvironmentProvider).get());
        return debugConfig.get();
      } else {
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/com/android/tools/build/bundletool/commands/BuildApksCommand.java`
#### Snippet
```java
        out.printf(
            "INFO: The APKs will be signed with the debug keystore found at '%s'.%n",
            DebugKeystoreUtils.DEBUG_KEYSTORE_CACHE.getUnchecked(systemEnvironmentProvider).get());
        buildApksCommand.setSigningConfiguration(debugConfig.get());
      } else {
```

### OptionalGetWithoutIsPresent
`Optional::get` without 'isPresent()' check
in `src/main/java/com/android/tools/build/bundletool/validation/BundleFilesValidator.java`
#### Snippet
```java
    }

    ImmutableSet<AbiName> uniqueAbis = abis.stream().map(Optional::get).collect(toImmutableSet());
    if (uniqueAbis.size() != nAbis) {
      throw InvalidBundleException.builder()
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/com/android/tools/build/bundletool/splitters/ResourceAnalyzer.java`
#### Snippet
```java
        ZipPath xmlResourcePath = ZipPath.create(fileRef.getPath());
        try (InputStream is =
            appBundle.getBaseModule().getEntry(xmlResourcePath).get().getContent().openStream()) {
          XmlNode xmlRoot = XmlNode.parseFrom(is);
          return findAllReferencedAppResources(xmlRoot);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/com/android/tools/build/bundletool/model/targeting/ScreenDensitySelector.java`
#### Snippet
```java

    if (!lowMidPoint.isPresent()) {
      return Range.atMost(highMidPoint.get());
    }
    if (!highMidPoint.isPresent()) {
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/com/android/tools/build/bundletool/model/targeting/ScreenDensitySelector.java`
#### Snippet
```java
      effectiveDpiRange = Range.all();
    } else if (!lowestResourceDpi.isPresent()) {
      effectiveDpiRange = Range.atMost(highestResourceDpi.get());
    } else if (!highestResourceDpi.isPresent()) {
      effectiveDpiRange = Range.atLeast(lowestResourceDpi.get());
```

### OptionalGetWithoutIsPresent
`Optional::get` without 'isPresent()' check
in `src/main/java/com/android/tools/build/bundletool/validation/ApexBundleValidator.java`
#### Snippet
```java
        .limit(tokens.size() - 1)
        .map(AbiName::fromPlatformName)
        .map(Optional::get)
        .collect(toImmutableSet());
  }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/com/android/tools/build/bundletool/io/ZipBuilder.java`
#### Snippet
```java
              // ZipFile API requires us to set the following properties manually for uncompressed
              // ZipEntries, just setting the compression method is not enough.
              ByteSource originalData = entry.getContent().get();
              // If entry is small enough it would be better to preload it into memory to not
              // read it twice. Two reads are required because we need to know crc32 before we put
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/com/android/tools/build/bundletool/io/ZipBuilder.java`
#### Snippet
```java
            } else {
              outZip.putNextEntry(zipEntry);
              entry.getContent().get().copyTo(outZip);
            }
          }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/com/android/tools/build/bundletool/commands/AddTransparencyCommand.java`
#### Snippet
```java
    FilePreconditions.checkFileDoesNotExist(getOutputPath());
    Preconditions.checkArgument(
        getSignerConfig().get().getPrivateKey().getAlgorithm().equals(RsaKeyUtil.RSA),
        "Transparency signing key must be an RSA key, but %s key was provided.",
        getSignerConfig().get().getPrivateKey().getAlgorithm());
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/com/android/tools/build/bundletool/commands/AddTransparencyCommand.java`
#### Snippet
```java
    validateInjectSignatureModeInputs();
    String signature =
        BaseEncoding.base64Url().encode(Files.readAllBytes(getTransparencySignaturePath().get()));
    String codeTransparencyMetadata =
        toJsonText(CodeTransparencyFactory.createCodeTransparencyMetadata(inputBundle));
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/com/android/tools/build/bundletool/commands/AddTransparencyCommand.java`
#### Snippet
```java
      throws JoseException {
    JsonWebSignature jws = createJwsCommon(payload, certificates);
    jws.setKey(getSignerConfig().get().getPrivateKey());
    return jws.getCompactSerialization();
  }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/com/android/tools/build/bundletool/commands/AddTransparencyCommand.java`
#### Snippet
```java
    FilePreconditions.checkFileHasExtension("AAB file", getOutputPath(), ".aab");
    FilePreconditions.checkFileDoesNotExist(getOutputPath());
    FilePreconditions.checkFileExistsAndReadable(getTransparencySignaturePath().get());
    validateTransparencyKeyCertificate();
  }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/com/android/tools/build/bundletool/commands/AddTransparencyCommand.java`
#### Snippet
```java
                BundleMetadata.BUNDLETOOL_NAMESPACE,
                BundleMetadata.TRANSPARENCY_SIGNED_FILE_NAME,
                toBytes(createSignedJwt(jsonText, getSignerConfig().get().getCertificates())))
            .build());
    new AppBundleSerializer().writeToDisk(bundleBuilder.build(), getOutputPath());
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/com/android/tools/build/bundletool/validation/DeviceTierParityValidator.java`
#### Snippet
```java
  /** Validates that tiers used by a module are contiguous and start from 0. */
  private void validateContiguousTiers(BundleModule module, ImmutableSet<Integer> moduleTiers) {
    int minTier = moduleTiers.stream().min(naturalOrder()).get();
    int maxTier = moduleTiers.stream().max(naturalOrder()).get();

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/com/android/tools/build/bundletool/validation/DeviceTierParityValidator.java`
#### Snippet
```java
                toImmutableSetMultimap(
                    directory -> directory.getSubPathBaseName(TargetingDimension.DEVICE_TIER),
                    directory -> extractDeviceTier(directory).get()));

    for (String subpath : tiersPerDirectory.keySet()) {
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/com/android/tools/build/bundletool/model/utils/SplitsXmlInjector.java`
#### Snippet
```java
        .filter(path -> !split.findEntry(path).isPresent())
        .findFirst()
        .get();
  }
}
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/com/android/tools/build/bundletool/model/AndroidManifest.java`
#### Snippet
```java
        .collect(
            toImmutableListMultimap(
                activity -> activity.getAndroidAttribute(NAME_RESOURCE_ID).get().getValueAsString(),
                identity()));
  }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/com/android/tools/build/bundletool/model/AndroidManifest.java`
#### Snippet
```java
                element
                    .getAndroidAttribute(NAME_RESOURCE_ID)
                    .get()
                    .getValueAsString()
                    .equals(attributeName))
```

## RuleId[id=BigDecimalMethodWithoutRoundingCalled]
### BigDecimalMethodWithoutRoundingCalled
'BigDecimal.divide()' called without a rounding mode argument
in `src/main/java/com/android/tools/build/bundletool/model/utils/SizeFormatter.java`
#### Snippet
```java
      String formattedSize =
          new DecimalFormat("#.##")
              .format(BigDecimal.valueOf(sizeInBytes).divide(BigDecimal.valueOf(unitScale)));
      return String.format("%s %s", formattedSize, unitAbbreviation);
    }
```

## RuleId[id=UnstableApiUsage]
### UnstableApiUsage
'tryParse(java.lang.String)' is marked unstable with @Beta
in `src/main/java/com/android/tools/build/bundletool/device/SessionIdParser.java`
#### Snippet
```java
          .build();
    }
    Integer sessionId = Ints.tryParse(output.substring(startIndex + 1, endIndex));
    if (sessionId == null) {
      throw AdbOutputParseException.builder()
```

### UnstableApiUsage
'com.google.common.io.MoreFiles' is marked unstable with @Beta
in `src/main/java/com/android/tools/build/bundletool/device/DeviceSpecParser.java`
#### Snippet
```java

  private static DeviceSpec parseDeviceSpecInternal(Path deviceSpecFile, boolean canSkipFields) {
    if (!JSON_EXTENSION.equals(MoreFiles.getFileExtension(deviceSpecFile))) {
      throw InvalidDeviceSpecException.builder()
          .withUserMessage("Expected .json extension for the device spec file.")
```

### UnstableApiUsage
'getFileExtension(java.nio.file.Path)' is declared in unstable class 'com.google.common.io.MoreFiles' marked with @Beta
in `src/main/java/com/android/tools/build/bundletool/device/DeviceSpecParser.java`
#### Snippet
```java

  private static DeviceSpec parseDeviceSpecInternal(Path deviceSpecFile, boolean canSkipFields) {
    if (!JSON_EXTENSION.equals(MoreFiles.getFileExtension(deviceSpecFile))) {
      throw InvalidDeviceSpecException.builder()
          .withUserMessage("Expected .json extension for the device spec file.")
```

### UnstableApiUsage
'tryParse(java.lang.String)' is marked unstable with @Beta
in `src/main/java/com/android/tools/build/bundletool/device/DdmlibDevice.java`
#### Snippet
```java
                  .filter(string -> string.startsWith(DENSITY_OUTPUT_PREFIX))
                  .map(string -> string.substring(DENSITY_OUTPUT_PREFIX.length()).trim())
                  .map(Ints::tryParse)
                  .forEach(density -> parsedDensityFromShell[0] = density != null ? density : -1);
            }
```

### UnstableApiUsage
'com.google.common.io.MoreFiles' is marked unstable with @Beta
in `src/main/java/com/android/tools/build/bundletool/model/Password.java`
#### Snippet
```java
  private static String readPasswordFromFile(Path passwordFile) {
    try {
      return MoreFiles.asCharSource(passwordFile, UTF_8).readFirstLine();
    } catch (IOException e) {
      throw new UncheckedIOException(
```

### UnstableApiUsage
'asCharSource(java.nio.file.Path, java.nio.charset.Charset, java.nio.file.OpenOption...)' is declared in unstable class 'com.google.common.io.MoreFiles' marked with @Beta
in `src/main/java/com/android/tools/build/bundletool/model/Password.java`
#### Snippet
```java
  private static String readPasswordFromFile(Path passwordFile) {
    try {
      return MoreFiles.asCharSource(passwordFile, UTF_8).readFirstLine();
    } catch (IOException e) {
      throw new UncheckedIOException(
```

### UnstableApiUsage
'isInOrder(java.lang.Iterable, java.util.Comparator)' is marked unstable with @Beta
in `src/main/java/com/android/tools/build/bundletool/validation/NestedTargetingValidator.java`
#### Snippet
```java
                    .build();
              }
              if (!Comparators.isInOrder(
                  dimensionOrder.stream()
                      .map(targetingDimensionOrderRef::indexOf)
```

### UnstableApiUsage
'com.google.common.io.MoreFiles' is marked unstable with @Beta
in `src/main/java/com/android/tools/build/bundletool/io/TempDirectory.java`
#### Snippet
```java
  private void closeWithRetry(int numAttempt) {
    try {
      MoreFiles.deleteRecursively(dirPath, RecursiveDeleteOption.ALLOW_INSECURE);
    } catch (FileSystemException e) {
      // See https://github.com/google/bundletool/issues/61
```

### UnstableApiUsage
'deleteRecursively(java.nio.file.Path, com.google.common.io.RecursiveDeleteOption...)' is declared in unstable class 'com.google.common.io.MoreFiles' marked with @Beta
in `src/main/java/com/android/tools/build/bundletool/io/TempDirectory.java`
#### Snippet
```java
  private void closeWithRetry(int numAttempt) {
    try {
      MoreFiles.deleteRecursively(dirPath, RecursiveDeleteOption.ALLOW_INSECURE);
    } catch (FileSystemException e) {
      // See https://github.com/google/bundletool/issues/61
```

### UnstableApiUsage
'com.google.common.io.RecursiveDeleteOption' is marked unstable with @Beta
in `src/main/java/com/android/tools/build/bundletool/io/TempDirectory.java`
#### Snippet
```java
  private void closeWithRetry(int numAttempt) {
    try {
      MoreFiles.deleteRecursively(dirPath, RecursiveDeleteOption.ALLOW_INSECURE);
    } catch (FileSystemException e) {
      // See https://github.com/google/bundletool/issues/61
```

### UnstableApiUsage
'ALLOW_INSECURE' is declared in unstable enum 'com.google.common.io.RecursiveDeleteOption' marked with @Beta
in `src/main/java/com/android/tools/build/bundletool/io/TempDirectory.java`
#### Snippet
```java
  private void closeWithRetry(int numAttempt) {
    try {
      MoreFiles.deleteRecursively(dirPath, RecursiveDeleteOption.ALLOW_INSECURE);
    } catch (FileSystemException e) {
      // See https://github.com/google/bundletool/issues/61
```

### UnstableApiUsage
'getNameWithoutExtension(java.lang.String)' is marked unstable with @Beta
in `src/main/java/com/android/tools/build/bundletool/validation/MandatoryFilesPresenceValidator.java`
#### Snippet
```java
        moduleFile,
        /* moduleBaseDir= */ ZipPath.create(""),
        /* moduleName= */ Files.getNameWithoutExtension(moduleFile.getName()));
  }

```

### UnstableApiUsage
'stream(java.util.Iterator)' is marked unstable with @Beta
in `src/main/java/com/android/tools/build/bundletool/xml/XmlProtoToXmlConverter.java`
#### Snippet
```java
  private boolean isNamespacePrefixInScope(String prefix) {
    return namespaceUriToPrefix.values().stream()
        .flatMap(queue -> Streams.stream(queue.iterator()))
        .anyMatch(Predicate.isEqual(prefix));
  }
```

### UnstableApiUsage
'CharEscaperBuilder()' is declared in unstable class 'com.google.common.escape.CharEscaperBuilder' marked with @Beta
in `src/main/java/com/android/tools/build/bundletool/model/utils/CsvFormatter.java`
#### Snippet
```java
  /** A char escaper that will escape quote characters. */
  private static final Escaper DOUBLE_QUOTER =
      new CharEscaperBuilder().addEscape('"', "\"\"").toEscaper();

  /** Char matcher to see if quotes are needed on a value. */
```

### UnstableApiUsage
'com.google.common.escape.CharEscaperBuilder' is marked unstable with @Beta
in `src/main/java/com/android/tools/build/bundletool/model/utils/CsvFormatter.java`
#### Snippet
```java
  /** A char escaper that will escape quote characters. */
  private static final Escaper DOUBLE_QUOTER =
      new CharEscaperBuilder().addEscape('"', "\"\"").toEscaper();

  /** Char matcher to see if quotes are needed on a value. */
```

### UnstableApiUsage
'addEscape(char, java.lang.String)' is declared in unstable class 'com.google.common.escape.CharEscaperBuilder' marked with @Beta
in `src/main/java/com/android/tools/build/bundletool/model/utils/CsvFormatter.java`
#### Snippet
```java
  /** A char escaper that will escape quote characters. */
  private static final Escaper DOUBLE_QUOTER =
      new CharEscaperBuilder().addEscape('"', "\"\"").toEscaper();

  /** Char matcher to see if quotes are needed on a value. */
```

### UnstableApiUsage
'toEscaper()' is declared in unstable class 'com.google.common.escape.CharEscaperBuilder' marked with @Beta
in `src/main/java/com/android/tools/build/bundletool/model/utils/CsvFormatter.java`
#### Snippet
```java
  /** A char escaper that will escape quote characters. */
  private static final Escaper DOUBLE_QUOTER =
      new CharEscaperBuilder().addEscape('"', "\"\"").toEscaper();

  /** Char matcher to see if quotes are needed on a value. */
```

### UnstableApiUsage
'getNameWithoutExtension(java.lang.String)' is marked unstable with @Beta
in `src/main/java/com/android/tools/build/bundletool/validation/SdkBundleMandatoryFilesPresenceValidator.java`
#### Snippet
```java
  private static void checkModuleHasAndroidManifest(ZipFile zipFile) {
    ZipPath moduleManifestPath = SpecialModuleEntry.ANDROID_MANIFEST.getPath();
    String moduleName = Files.getNameWithoutExtension(zipFile.getName());

    if (zipFile.getEntry(moduleManifestPath.toString()) == null) {
```

### UnstableApiUsage
'readLines(java.lang.Readable)' is marked unstable with @Beta
in `src/main/java/com/android/tools/build/bundletool/androidtools/DefaultCommandExecutor.java`
#### Snippet
```java
  private static ImmutableList<String> captureOutput(Process process) {
    try (BufferedReader outputReader = BufferedIo.reader(process.getInputStream())) {
      return ImmutableList.copyOf(CharStreams.readLines(outputReader));
    } catch (IOException e) {
      throw new UncheckedIOException(e);
```

### UnstableApiUsage
'com.google.common.io.MoreFiles' is marked unstable with @Beta
in `src/main/java/com/android/tools/build/bundletool/model/ModuleEntry.java`
#### Snippet
```java
    public Builder setContent(Path path) {
      setFileLocation(Optional.empty());
      return setContent(MoreFiles.asByteSource(path));
    }

```

### UnstableApiUsage
'asByteSource(java.nio.file.Path, java.nio.file.OpenOption...)' is declared in unstable class 'com.google.common.io.MoreFiles' marked with @Beta
in `src/main/java/com/android/tools/build/bundletool/model/ModuleEntry.java`
#### Snippet
```java
    public Builder setContent(Path path) {
      setFileLocation(Optional.empty());
      return setContent(MoreFiles.asByteSource(path));
    }

```

### UnstableApiUsage
'com.google.common.hash.Hashing' is marked unstable with @Beta
in `src/main/java/com/android/tools/build/bundletool/model/ModuleEntry.java`
#### Snippet
```java
  public HashCode getContentSha256Hash() {
    try {
      return getContent().hash(Hashing.sha256());
    } catch (IOException e) {
      throw new UncheckedIOException(
```

### UnstableApiUsage
'sha256()' is declared in unstable class 'com.google.common.hash.Hashing' marked with @Beta
in `src/main/java/com/android/tools/build/bundletool/model/ModuleEntry.java`
#### Snippet
```java
  public HashCode getContentSha256Hash() {
    try {
      return getContent().hash(Hashing.sha256());
    } catch (IOException e) {
      throw new UncheckedIOException(
```

### UnstableApiUsage
'zip(java.util.stream.Stream, java.util.stream.Stream**, java.util.function.BiFunction)' is marked unstable with @Beta**
in `src/main/java/com/android/tools/build/bundletool/size/ApkBreakdownGenerator.java`
#### Snippet
```java
        compressedSizeCalculator.calculateGZipSizeForEntries(streams);

    return Streams.zip(zipFile.stream(), downloadSizes.stream(), AbstractMap.SimpleEntry::new)
        .collect(
            toImmutableMap(entry -> entry.getKey().getName(), AbstractMap.SimpleEntry::getValue));
```

### UnstableApiUsage
'lexicographical(java.util.Comparator)' is marked unstable with @Beta
in `src/main/java/com/android/tools/build/bundletool/model/utils/TargetingNormalizer.java`
#### Snippet
```java

  private static final Comparator<MultiAbi> MULTI_ABI_COMPARATOR =
      comparing(MultiAbi::getAbiList, lexicographical(comparing(Abi::getAlias)));

  private static final Comparator<Sanitizer> SANITIZER_COMPARATOR = comparing(Sanitizer::getAlias);
```

### UnstableApiUsage
'com.google.common.hash.Hashing' is marked unstable with @Beta
in `src/main/java/com/android/tools/build/bundletool/transparency/ApkTransparencyCheckUtils.java`
#### Snippet
```java
  private static String getFileHash(ZipFile apkFile, ZipEntry zipEntry) {
    try {
      return ZipUtils.asByteSource(apkFile, zipEntry).hash(Hashing.sha256()).toString();
    } catch (IOException e) {
      throw new UncheckedIOException(e);
```

### UnstableApiUsage
'sha256()' is declared in unstable class 'com.google.common.hash.Hashing' marked with @Beta
in `src/main/java/com/android/tools/build/bundletool/transparency/ApkTransparencyCheckUtils.java`
#### Snippet
```java
  private static String getFileHash(ZipFile apkFile, ZipEntry zipEntry) {
    try {
      return ZipUtils.asByteSource(apkFile, zipEntry).hash(Hashing.sha256()).toString();
    } catch (IOException e) {
      throw new UncheckedIOException(e);
```

### UnstableApiUsage
'com.google.common.io.MoreFiles' is marked unstable with @Beta
in `src/main/java/com/android/tools/build/bundletool/model/KeystoreProperties.java`
#### Snippet
```java

    Properties properties = new Properties();
    try (InputStream inputStream = MoreFiles.asByteSource(path).openBufferedStream()) {
      properties.load(inputStream);
    } catch (IOException e) {
```

### UnstableApiUsage
'asByteSource(java.nio.file.Path, java.nio.file.OpenOption...)' is declared in unstable class 'com.google.common.io.MoreFiles' marked with @Beta
in `src/main/java/com/android/tools/build/bundletool/model/KeystoreProperties.java`
#### Snippet
```java

    Properties properties = new Properties();
    try (InputStream inputStream = MoreFiles.asByteSource(path).openBufferedStream()) {
      properties.load(inputStream);
    } catch (IOException e) {
```

### UnstableApiUsage
'getCausalChain(java.lang.Throwable)' is marked unstable with @Beta
in `src/main/java/com/android/tools/build/bundletool/model/utils/ThrowableUtils.java`
#### Snippet
```java
  public static boolean anyInCausalChainOrSuppressedMatches(
      Throwable baseThrowable, Predicate<Throwable> predicate) {
    for (Throwable throwable : Throwables.getCausalChain(baseThrowable)) {
      if (predicate.test(throwable)
          || Arrays.stream(throwable.getSuppressed()).anyMatch(predicate)) {
```

### UnstableApiUsage
'allAsList(java.lang.Iterable\>)' is marked unstable with @Beta
in `src/main/java/com/android/tools/build/bundletool/io/ConcurrencyUtils.java`
#### Snippet
```java
    // temporary file which gets deleted then it will produce NoFileFound exception).
    try {
      return ImmutableList.copyOf(waitFor(Futures.allAsList(futures)));
    } catch (RuntimeException e) {
      try {
```

### UnstableApiUsage
'whenAllComplete(java.lang.Iterable\>)' is marked unstable with @Beta
in `src/main/java/com/android/tools/build/bundletool/io/ConcurrencyUtils.java`
#### Snippet
```java
    } catch (RuntimeException e) {
      try {
        waitFor(Futures.whenAllComplete(futures).call(() -> null, directExecutor()));
      } catch (RuntimeException ignoredException) {
        // Silently ignored - only report the very first Exception encountered.
```

### UnstableApiUsage
'call(java.util.concurrent.Callable, java.util.concurrent.Executor)' is declared in unstable class 'com.google.common.util.concurrent.Futures.FutureCombiner' marked with @Beta
in `src/main/java/com/android/tools/build/bundletool/io/ConcurrencyUtils.java`
#### Snippet
```java
    } catch (RuntimeException e) {
      try {
        waitFor(Futures.whenAllComplete(futures).call(() -> null, directExecutor()));
      } catch (RuntimeException ignoredException) {
        // Silently ignored - only report the very first Exception encountered.
```

### UnstableApiUsage
'com.google.common.hash.Hashing' is marked unstable with @Beta
in `src/main/java/com/android/tools/build/bundletool/preprocessors/AppBundleObfuscationPreprocessor.java`
#### Snippet
```java
  @VisibleForTesting
  String hashFilePath(String stringPath) {
    HashCode hashCode = Hashing.sha256().hashString(stringPath, StandardCharsets.UTF_8);
    return Base64.getUrlEncoder()
        .encodeToString(Arrays.copyOf(hashCode.asBytes(), RESOURCE_NAME_LENGTH));
```

### UnstableApiUsage
'sha256()' is declared in unstable class 'com.google.common.hash.Hashing' marked with @Beta
in `src/main/java/com/android/tools/build/bundletool/preprocessors/AppBundleObfuscationPreprocessor.java`
#### Snippet
```java
  @VisibleForTesting
  String hashFilePath(String stringPath) {
    HashCode hashCode = Hashing.sha256().hashString(stringPath, StandardCharsets.UTF_8);
    return Base64.getUrlEncoder()
        .encodeToString(Arrays.copyOf(hashCode.asBytes(), RESOURCE_NAME_LENGTH));
```

### UnstableApiUsage
'com.google.common.hash.Hashing' is marked unstable with @Beta
in `src/main/java/com/android/tools/build/bundletool/preprocessors/AppBundleObfuscationPreprocessor.java`
#### Snippet
```java
  private static ZipPath obfuscateZipPath(
      ZipPath oldZipPath, ImmutableMap<String, String> resourceNameMapping) {
    HashCode hashCode = Hashing.sha256().hashString(oldZipPath.toString(), StandardCharsets.UTF_8);
    String encodedString =
        Base64.getUrlEncoder()
```

### UnstableApiUsage
'sha256()' is declared in unstable class 'com.google.common.hash.Hashing' marked with @Beta
in `src/main/java/com/android/tools/build/bundletool/preprocessors/AppBundleObfuscationPreprocessor.java`
#### Snippet
```java
  private static ZipPath obfuscateZipPath(
      ZipPath oldZipPath, ImmutableMap<String, String> resourceNameMapping) {
    HashCode hashCode = Hashing.sha256().hashString(oldZipPath.toString(), StandardCharsets.UTF_8);
    String encodedString =
        Base64.getUrlEncoder()
```

### UnstableApiUsage
'nullOutputStream()' is marked unstable with @Beta
in `src/main/java/com/android/tools/build/bundletool/model/utils/GZipUtils.java`
#### Snippet
```java
      throws IOException {
    CountingOutputStream countingOutputStream =
        new CountingOutputStream(ByteStreams.nullOutputStream());
    try (GZIPOutputStream compressedStream = new GZIPOutputStream(countingOutputStream)) {
      ByteStreams.copy(stream, compressedStream);
```

### UnstableApiUsage
'com.google.common.io.MoreFiles' is marked unstable with @Beta
in `src/main/java/com/android/tools/build/bundletool/model/utils/GZipUtils.java`
#### Snippet
```java
  /** Calculates the GZip compressed size in bytes of the target {@code file}. */
  public static long calculateGzipCompressedSize(Path file) throws IOException {
    return calculateGzipCompressedSize(MoreFiles.asByteSource(file));
  }

```

### UnstableApiUsage
'asByteSource(java.nio.file.Path, java.nio.file.OpenOption...)' is declared in unstable class 'com.google.common.io.MoreFiles' marked with @Beta
in `src/main/java/com/android/tools/build/bundletool/model/utils/GZipUtils.java`
#### Snippet
```java
  /** Calculates the GZip compressed size in bytes of the target {@code file}. */
  public static long calculateGzipCompressedSize(Path file) throws IOException {
    return calculateGzipCompressedSize(MoreFiles.asByteSource(file));
  }

```

### UnstableApiUsage
Overridden method 'sizeIfKnown()' is marked unstable with @Beta
in `src/main/java/com/android/tools/build/bundletool/model/utils/ZipUtils.java`
#### Snippet
```java

    @Override
    public Optional<Long> sizeIfKnown() {
      return entry.getSize() == -1 ? Optional.absent() : Optional.of(entry.getSize());
    }
```

### UnstableApiUsage
'com.google.common.io.MoreFiles' is marked unstable with @Beta
in `src/main/java/com/android/tools/build/bundletool/commands/GetDeviceSpecCommand.java`
#### Snippet
```java
      GetDeviceSpecCommand command = autoBuild();

      if (!JSON_EXTENSION.equals(MoreFiles.getFileExtension(command.getOutputPath()))) {
        throw InvalidCommandException.builder()
            .withInternalMessage(
```

### UnstableApiUsage
'getFileExtension(java.nio.file.Path)' is declared in unstable class 'com.google.common.io.MoreFiles' marked with @Beta
in `src/main/java/com/android/tools/build/bundletool/commands/GetDeviceSpecCommand.java`
#### Snippet
```java
      GetDeviceSpecCommand command = autoBuild();

      if (!JSON_EXTENSION.equals(MoreFiles.getFileExtension(command.getOutputPath()))) {
        throw InvalidCommandException.builder()
            .withInternalMessage(
```

### UnstableApiUsage
'com.google.common.io.MoreFiles' is marked unstable with @Beta
in `src/main/java/com/android/tools/build/bundletool/commands/BuildApksManager.java`
#### Snippet
```java

    if (command.getOverwriteOutput() && Files.exists(command.getOutputFile())) {
      MoreFiles.deleteRecursively(command.getOutputFile(), RecursiveDeleteOption.ALLOW_INSECURE);
    }

```

### UnstableApiUsage
'deleteRecursively(java.nio.file.Path, com.google.common.io.RecursiveDeleteOption...)' is declared in unstable class 'com.google.common.io.MoreFiles' marked with @Beta
in `src/main/java/com/android/tools/build/bundletool/commands/BuildApksManager.java`
#### Snippet
```java

    if (command.getOverwriteOutput() && Files.exists(command.getOutputFile())) {
      MoreFiles.deleteRecursively(command.getOutputFile(), RecursiveDeleteOption.ALLOW_INSECURE);
    }

```

### UnstableApiUsage
'com.google.common.io.RecursiveDeleteOption' is marked unstable with @Beta
in `src/main/java/com/android/tools/build/bundletool/commands/BuildApksManager.java`
#### Snippet
```java

    if (command.getOverwriteOutput() && Files.exists(command.getOutputFile())) {
      MoreFiles.deleteRecursively(command.getOutputFile(), RecursiveDeleteOption.ALLOW_INSECURE);
    }

```

### UnstableApiUsage
'ALLOW_INSECURE' is declared in unstable enum 'com.google.common.io.RecursiveDeleteOption' marked with @Beta
in `src/main/java/com/android/tools/build/bundletool/commands/BuildApksManager.java`
#### Snippet
```java

    if (command.getOverwriteOutput() && Files.exists(command.getOutputFile())) {
      MoreFiles.deleteRecursively(command.getOutputFile(), RecursiveDeleteOption.ALLOW_INSECURE);
    }

```

### UnstableApiUsage
'tryParse(java.lang.String)' is marked unstable with @Beta
in `src/main/java/com/android/tools/build/bundletool/model/utils/DeviceTargetingUtils.java`
#### Snippet
```java

  public static void validateDeviceTierForAssetsDirectory(String directory, String tierName) {
    @Nullable Integer tier = Ints.tryParse(tierName);

    if (tier == null || tier < 0) {
```

### UnstableApiUsage
'split(java.lang.CharSequence)' is declared in unstable class 'com.google.common.base.Splitter.MapSplitter' marked with @Beta
in `src/main/java/com/android/tools/build/bundletool/model/utils/xmlproto/XmlProtoPrintUtils.java`
#### Snippet
```java
            StringJoiner attributes = new StringJoiner(" ");
            ATTRIBUTES_SPLITTER
                .split(tag.substring(separatorIdx + 1))
                .forEach((key, value) -> attributes.add(String.format("%s=\"%s\"", key, value)));
            return String.format("<%s %s>", actualTag, attributes);
```

### UnstableApiUsage
'com.google.common.base.Splitter.MapSplitter' is marked unstable with @Beta
in `src/main/java/com/android/tools/build/bundletool/model/utils/xmlproto/XmlProtoPrintUtils.java`
#### Snippet
```java

  private static class Tag implements Comparable<Tag> {
    private static final MapSplitter ATTRIBUTES_SPLITTER =
        Splitter.on(';').withKeyValueSeparator(Splitter.on('=').limit(2));

```

### UnstableApiUsage
'withKeyValueSeparator(com.google.common.base.Splitter)' is marked unstable with @Beta
in `src/main/java/com/android/tools/build/bundletool/model/utils/xmlproto/XmlProtoPrintUtils.java`
#### Snippet
```java
  private static class Tag implements Comparable<Tag> {
    private static final MapSplitter ATTRIBUTES_SPLITTER =
        Splitter.on(';').withKeyValueSeparator(Splitter.on('=').limit(2));

    private final String tag;
```

### UnstableApiUsage
'com.google.common.io.MoreFiles' is marked unstable with @Beta
in `src/main/java/com/android/tools/build/bundletool/io/Zipper.java`
#### Snippet
```java
        FileUtils.createDirectories(tempDirectory);
        for (Entry<String, ByteSource> content : entries.entrySet()) {
          content.getValue().copyTo(MoreFiles.asByteSink(tempDirectory.resolve(content.getKey())));
        }
        p7ZipCommand.compress(outputZip, tempDirectory);
```

### UnstableApiUsage
'asByteSink(java.nio.file.Path, java.nio.file.OpenOption...)' is declared in unstable class 'com.google.common.io.MoreFiles' marked with @Beta
in `src/main/java/com/android/tools/build/bundletool/io/Zipper.java`
#### Snippet
```java
        FileUtils.createDirectories(tempDirectory);
        for (Entry<String, ByteSource> content : entries.entrySet()) {
          content.getValue().copyTo(MoreFiles.asByteSink(tempDirectory.resolve(content.getKey())));
        }
        p7ZipCommand.compress(outputZip, tempDirectory);
```

### UnstableApiUsage
'sizeIfKnown()' is marked unstable with @Beta
in `src/main/java/com/android/tools/build/bundletool/io/Zipper.java`
#### Snippet
```java
          boolean smallEntry =
              content
                  .sizeIfKnown()
                  .transform(size -> size < LARGE_ENTRY_SIZE_THRESHOLD_BYTES)
                  .or(false);
```

### UnstableApiUsage
'inCompletionOrder(java.lang.Iterable\>)' is marked unstable with @Beta
in `src/main/java/com/android/tools/build/bundletool/io/Zipper.java`
#### Snippet
```java
          }
        }
        for (Future<Source> source : Futures.inCompletionOrder(largeSources.build())) {
          archive.add(Futures.getUnchecked(source));
        }
```

### UnstableApiUsage
'stream(java.util.Optional)' is marked unstable with @Beta
in `src/main/java/com/android/tools/build/bundletool/io/Aapt2ResourceConverter.java`
#### Snippet
```java
          Streams.concat(
                  Stream.of(manifestEntry),
                  stream(resourceTableEntry),
                  resourceEntriesStream,
                  otherEntriesStream)
```

### UnstableApiUsage
'mapWithIndex(java.util.stream.Stream, com.google.common.collect.Streams.FunctionWithIndex)' is marked unstable with @Beta
in `src/main/java/com/android/tools/build/bundletool/mergers/D8DexMerger.java`
#### Snippet
```java
        merge(appDexFiles, outputDir, mainDexListFile, proguardMap, isDebuggable, minSdkVersion);
    ImmutableList<Path> mergedDesugaringDexFiles =
        Streams.mapWithIndex(
                desugaringDexFiles.stream(),
                (dex, index) ->
```

### UnstableApiUsage
'com.google.common.collect.Streams.FunctionWithIndex' is marked unstable with @Beta
in `src/main/java/com/android/tools/build/bundletool/mergers/D8DexMerger.java`
#### Snippet
```java
        Streams.mapWithIndex(
                desugaringDexFiles.stream(),
                (dex, index) ->
                    copyDexToOutput(dex, outputDir, (int) index + 1 + mergedAppDexFiles.size()))
            .collect(toImmutableList());

```

### UnstableApiUsage
'com.google.common.io.MoreFiles' is marked unstable with @Beta
in `src/main/java/com/android/tools/build/bundletool/mergers/D8DexMerger.java`
#### Snippet
```java
  private static void cleanupOutputDir(Path outputDir) {
    try {
      MoreFiles.deleteDirectoryContents(outputDir, RecursiveDeleteOption.ALLOW_INSECURE);
    } catch (IOException e1) {
      throw new UncheckedIOException(e1);
```

### UnstableApiUsage
'deleteDirectoryContents(java.nio.file.Path, com.google.common.io.RecursiveDeleteOption...)' is declared in unstable class 'com.google.common.io.MoreFiles' marked with @Beta
in `src/main/java/com/android/tools/build/bundletool/mergers/D8DexMerger.java`
#### Snippet
```java
  private static void cleanupOutputDir(Path outputDir) {
    try {
      MoreFiles.deleteDirectoryContents(outputDir, RecursiveDeleteOption.ALLOW_INSECURE);
    } catch (IOException e1) {
      throw new UncheckedIOException(e1);
```

### UnstableApiUsage
'com.google.common.io.RecursiveDeleteOption' is marked unstable with @Beta
in `src/main/java/com/android/tools/build/bundletool/mergers/D8DexMerger.java`
#### Snippet
```java
  private static void cleanupOutputDir(Path outputDir) {
    try {
      MoreFiles.deleteDirectoryContents(outputDir, RecursiveDeleteOption.ALLOW_INSECURE);
    } catch (IOException e1) {
      throw new UncheckedIOException(e1);
```

### UnstableApiUsage
'ALLOW_INSECURE' is declared in unstable enum 'com.google.common.io.RecursiveDeleteOption' marked with @Beta
in `src/main/java/com/android/tools/build/bundletool/mergers/D8DexMerger.java`
#### Snippet
```java
  private static void cleanupOutputDir(Path outputDir) {
    try {
      MoreFiles.deleteDirectoryContents(outputDir, RecursiveDeleteOption.ALLOW_INSECURE);
    } catch (IOException e1) {
      throw new UncheckedIOException(e1);
```

### UnstableApiUsage
'com.google.common.hash.Hashing' is marked unstable with @Beta
in `src/main/java/com/android/tools/build/bundletool/sdkmodule/AndroidResourceRenamer.java`
#### Snippet
```java
      result =
          ByteSource.wrap(packageName.getBytes(UTF_8))
              .hash(Hashing.farmHashFingerprint64())
              .toString();
    } catch (IOException e) {
```

### UnstableApiUsage
'farmHashFingerprint64()' is declared in unstable class 'com.google.common.hash.Hashing' marked with @Beta
in `src/main/java/com/android/tools/build/bundletool/sdkmodule/AndroidResourceRenamer.java`
#### Snippet
```java
      result =
          ByteSource.wrap(packageName.getBytes(UTF_8))
              .hash(Hashing.farmHashFingerprint64())
              .toString();
    } catch (IOException e) {
```

### UnstableApiUsage
'mapWithIndex(java.util.stream.Stream, com.google.common.collect.Streams.FunctionWithIndex)' is marked unstable with @Beta
in `src/main/java/com/android/tools/build/bundletool/mergers/ModuleSplitsToShardMerger.java`
#### Snippet
```java

    Stream<ModuleEntry> renamedDexFiles =
        Streams.mapWithIndex(
            dexFilesFromNotBase,
            (entry, index) ->
```

### UnstableApiUsage
'com.google.common.collect.Streams.FunctionWithIndex' is marked unstable with @Beta
in `src/main/java/com/android/tools/build/bundletool/mergers/ModuleSplitsToShardMerger.java`
#### Snippet
```java
        Streams.mapWithIndex(
            dexFilesFromNotBase,
            (entry, index) ->
                entry.toBuilder()
                    .setPath(
                        DEX_DIRECTORY.resolve(
                            dexFilesCountInBase + index == 0
                                ? "classes.dex"
                                : String.format("classes%d.dex", dexFilesCountInBase + index + 1)))
                    .build());

    return Stream.concat(dexFilesFromBase, renamedDexFiles).collect(toImmutableList());
```

### UnstableApiUsage
'com.google.common.io.MoreFiles' is marked unstable with @Beta
in `src/main/java/com/android/tools/build/bundletool/commands/BuildSdkAsarManager.java`
#### Snippet
```java
  void execute(Path extractedModulesFilePath) throws IOException {
    if (command.getOverwriteOutput() && Files.exists(command.getOutputFile())) {
      MoreFiles.deleteRecursively(command.getOutputFile(), RecursiveDeleteOption.ALLOW_INSECURE);
    }

```

### UnstableApiUsage
'deleteRecursively(java.nio.file.Path, com.google.common.io.RecursiveDeleteOption...)' is declared in unstable class 'com.google.common.io.MoreFiles' marked with @Beta
in `src/main/java/com/android/tools/build/bundletool/commands/BuildSdkAsarManager.java`
#### Snippet
```java
  void execute(Path extractedModulesFilePath) throws IOException {
    if (command.getOverwriteOutput() && Files.exists(command.getOutputFile())) {
      MoreFiles.deleteRecursively(command.getOutputFile(), RecursiveDeleteOption.ALLOW_INSECURE);
    }

```

### UnstableApiUsage
'com.google.common.io.RecursiveDeleteOption' is marked unstable with @Beta
in `src/main/java/com/android/tools/build/bundletool/commands/BuildSdkAsarManager.java`
#### Snippet
```java
  void execute(Path extractedModulesFilePath) throws IOException {
    if (command.getOverwriteOutput() && Files.exists(command.getOutputFile())) {
      MoreFiles.deleteRecursively(command.getOutputFile(), RecursiveDeleteOption.ALLOW_INSECURE);
    }

```

### UnstableApiUsage
'ALLOW_INSECURE' is declared in unstable enum 'com.google.common.io.RecursiveDeleteOption' marked with @Beta
in `src/main/java/com/android/tools/build/bundletool/commands/BuildSdkAsarManager.java`
#### Snippet
```java
  void execute(Path extractedModulesFilePath) throws IOException {
    if (command.getOverwriteOutput() && Files.exists(command.getOutputFile())) {
      MoreFiles.deleteRecursively(command.getOutputFile(), RecursiveDeleteOption.ALLOW_INSECURE);
    }

```

### UnstableApiUsage
'com.google.common.hash.Hashing' is marked unstable with @Beta
in `src/main/java/com/android/tools/build/bundletool/transparency/CodeTransparencyCryptoUtils.java`
#### Snippet
```java
    byte[] certificateBytes;
    try {
      certificateBytes = ByteSource.wrap(certificate.getEncoded()).hash(Hashing.sha256()).asBytes();
    } catch (CertificateEncodingException | IOException e) {
      throw CommandExecutionException.builder()
```

### UnstableApiUsage
'sha256()' is declared in unstable class 'com.google.common.hash.Hashing' marked with @Beta
in `src/main/java/com/android/tools/build/bundletool/transparency/CodeTransparencyCryptoUtils.java`
#### Snippet
```java
    byte[] certificateBytes;
    try {
      certificateBytes = ByteSource.wrap(certificate.getEncoded()).hash(Hashing.sha256()).asBytes();
    } catch (CertificateEncodingException | IOException e) {
      throw CommandExecutionException.builder()
```

### UnstableApiUsage
'stream(java.util.Optional)' is marked unstable with @Beta
in `src/main/java/com/android/tools/build/bundletool/mergers/FusingAndroidManifestMerger.java`
#### Snippet
```java
            .getElement()
            .getOptionalChildElement(AndroidManifest.APPLICATION_ELEMENT_NAME);
    stream(manifestElement)
        .flatMap(application -> application.getChildrenElements())
        .filter(child -> elementsToMerge.contains(child.getName()))
```

### UnstableApiUsage
'stream(java.util.Optional)' is marked unstable with @Beta
in `src/main/java/com/android/tools/build/bundletool/mergers/FusingAndroidManifestMerger.java`
#### Snippet
```java
    applicationElement.modifyChildElements(
        child ->
            stream(getCorrespondingElementFromMergedElements(child, mergedElements))
                .peek(replacedElements::add)
                .map(element -> XmlProtoNodeBuilder.createElementNode(element.toBuilder()))
```

### UnstableApiUsage
'stream(java.util.Optional)' is marked unstable with @Beta
in `src/main/java/com/android/tools/build/bundletool/model/targeting/TargetingUtils.java`
#### Snippet
```java
    return targetedDirectories.stream()
        .map(TargetingUtils::extractCountrySet)
        .flatMap(Streams::stream)
        .collect(toImmutableSet());
  }
```

### UnstableApiUsage
'stream(java.util.Optional)' is marked unstable with @Beta
in `src/main/java/com/android/tools/build/bundletool/model/targeting/TargetingUtils.java`
#### Snippet
```java
    return targetedDirectories.stream()
        .map(TargetingUtils::extractDeviceTier)
        .flatMap(Streams::stream)
        .collect(toImmutableSet());
  }
```

### UnstableApiUsage
'falseFirst()' is marked unstable with @Beta
in `src/main/java/com/android/tools/build/bundletool/model/targeting/TargetingComparators.java`
#### Snippet
```java
      comparing(
          variantTargeting -> variantTargeting.getSdkRuntimeTargeting().getRequiresSdkRuntime(),
          falseFirst());

  /**
```

### UnstableApiUsage
'emptiesFirst(java.util.Comparator)' is marked unstable with @Beta
in `src/main/java/com/android/tools/build/bundletool/model/targeting/TargetingComparators.java`
#### Snippet
```java
      comparing(
          TargetingComparators::getTextureCompressionFormat,
          emptiesFirst(TEXTURE_COMPRESSION_FORMAT_ORDERING));

  private static final Comparator<VariantTargeting> SDK_RUNTIME_COMPARATOR =
```

### UnstableApiUsage
'emptiesFirst(java.util.Comparator)' is marked unstable with @Beta
in `src/main/java/com/android/tools/build/bundletool/model/targeting/TargetingComparators.java`
#### Snippet
```java

  private static final Comparator<VariantTargeting> SCREEN_DENSITY_COMPARATOR =
      comparing(TargetingComparators::getScreenDensity, emptiesFirst(Ordering.natural()));

  private static final Comparator<VariantTargeting> TEXTURE_COMPRESSION_FORMAT_COMPARATOR =
```

### UnstableApiUsage
'emptiesFirst(java.util.Comparator)' is marked unstable with @Beta
in `src/main/java/com/android/tools/build/bundletool/model/targeting/TargetingComparators.java`
#### Snippet
```java

  private static final Comparator<VariantTargeting> SDK_COMPARATOR =
      comparing(TargetingComparators::getMinSdk, emptiesFirst(Ordering.natural()));

  private static final Comparator<VariantTargeting> SCREEN_DENSITY_COMPARATOR =
```

### UnstableApiUsage
'lexicographical(java.util.Comparator)' is marked unstable with @Beta
in `src/main/java/com/android/tools/build/bundletool/model/targeting/TargetingComparators.java`
#### Snippet
```java
  public static final Comparator<ImmutableSet<AbiAlias>> MULTI_ABI_ALIAS_COMPARATOR =
      comparing(
          TargetingComparators::sortMultiAbi, Comparators.lexicographical(ARCHITECTURE_ORDERING));

  @VisibleForTesting
```

### UnstableApiUsage
'emptiesFirst(java.util.Comparator)' is marked unstable with @Beta
in `src/main/java/com/android/tools/build/bundletool/model/targeting/TargetingComparators.java`
#### Snippet
```java

  private static final Comparator<VariantTargeting> ABI_COMPARATOR =
      comparing(TargetingComparators::getAbi, emptiesFirst(ARCHITECTURE_ORDERING));

  private static final Comparator<VariantTargeting> SDK_COMPARATOR =
```

### UnstableApiUsage
'com.google.common.io.Closer' is marked unstable with @Beta
in `src/main/java/com/android/tools/build/bundletool/commands/BuildApksCommand.java`
#### Snippet
```java

  private ImmutableMap<String, BundleModule> getValidatedSdkModules(
      Closer closer, TempDirectory tempDir, AppBundle appBundle) throws IOException {
    if (!shouldGenerateSdkRuntimeVariant(getApkBuildMode())) {
      return ImmutableMap.of();
```

### UnstableApiUsage
'com.google.common.io.MoreFiles' is marked unstable with @Beta
in `src/main/java/com/android/tools/build/bundletool/commands/BuildApksCommand.java`
#### Snippet
```java
      if (command.getOutputFormat().equals(APK_SET)) {
        if (!APK_SET_ARCHIVE_EXTENSION.equals(
            MoreFiles.getFileExtension(command.getOutputFile()))) {
          throw InvalidCommandException.builder()
              .withInternalMessage(
```

### UnstableApiUsage
'getFileExtension(java.nio.file.Path)' is declared in unstable class 'com.google.common.io.MoreFiles' marked with @Beta
in `src/main/java/com/android/tools/build/bundletool/commands/BuildApksCommand.java`
#### Snippet
```java
      if (command.getOutputFormat().equals(APK_SET)) {
        if (!APK_SET_ARCHIVE_EXTENSION.equals(
            MoreFiles.getFileExtension(command.getOutputFile()))) {
          throw InvalidCommandException.builder()
              .withInternalMessage(
```

### UnstableApiUsage
'com.google.common.io.Closer' is marked unstable with @Beta
in `src/main/java/com/android/tools/build/bundletool/commands/BuildApksCommand.java`
#### Snippet
```java
    try (TempDirectory tempDir = new TempDirectory(getClass().getSimpleName());
        ZipFile bundleZip = new ZipFile(getBundlePath().toFile());
        Closer closer = Closer.create()) {
      AppBundleValidator bundleValidator = AppBundleValidator.create(getExtraValidators());
      bundleValidator.validateFile(bundleZip);
```

### UnstableApiUsage
'com.google.common.io.Closer' is marked unstable with @Beta
in `src/main/java/com/android/tools/build/bundletool/commands/BuildApksCommand.java`
#### Snippet
```java
    try (TempDirectory tempDir = new TempDirectory(getClass().getSimpleName());
        ZipFile bundleZip = new ZipFile(getBundlePath().toFile());
        Closer closer = Closer.create()) {
      AppBundleValidator bundleValidator = AppBundleValidator.create(getExtraValidators());
      bundleValidator.validateFile(bundleZip);
```

### UnstableApiUsage
'create()' is declared in unstable class 'com.google.common.io.Closer' marked with @Beta
in `src/main/java/com/android/tools/build/bundletool/commands/BuildApksCommand.java`
#### Snippet
```java
    try (TempDirectory tempDir = new TempDirectory(getClass().getSimpleName());
        ZipFile bundleZip = new ZipFile(getBundlePath().toFile());
        Closer closer = Closer.create()) {
      AppBundleValidator bundleValidator = AppBundleValidator.create(getExtraValidators());
      bundleValidator.validateFile(bundleZip);
```

### UnstableApiUsage
'com.google.common.io.Closer' is marked unstable with @Beta
in `src/main/java/com/android/tools/build/bundletool/commands/BuildApksCommand.java`
#### Snippet
```java

  private ImmutableMap<String, SdkAsar> getValidatedSdkAsarsByPackageName(
      Closer closer, TempDirectory tempDir) throws IOException {
    ImmutableListMultimap.Builder<String, SdkAsar> sdkArchivesPerPackageNameBuilder =
        ImmutableListMultimap.builder();
```

### UnstableApiUsage
'register(C)' is declared in unstable class 'com.google.common.io.Closer' marked with @Beta
in `src/main/java/com/android/tools/build/bundletool/commands/BuildApksCommand.java`
#### Snippet
```java
    ImmutableList<Path> sdkArchivePaths = getRuntimeEnabledSdkArchivePaths().asList();
    for (int index = 0; index < sdkArchivePaths.size(); index++) {
      ZipFile sdkArchiveZip = closer.register(new ZipFile(sdkArchivePaths.get(index).toFile()));

      Path sdkModulesZipPath = tempDir.getPath().resolve("tmp" + index);
```

### UnstableApiUsage
'register(C)' is declared in unstable class 'com.google.common.io.Closer' marked with @Beta
in `src/main/java/com/android/tools/build/bundletool/commands/BuildApksCommand.java`
#### Snippet
```java

      Path sdkModulesZipPath = tempDir.getPath().resolve("tmp" + index);
      ZipFile sdkModulesZip = closer.register(getModulesZip(sdkArchiveZip, sdkModulesZipPath));
      SdkAsarValidator.validateModulesFile(sdkModulesZip);

```

### UnstableApiUsage
'com.google.common.io.Closer' is marked unstable with @Beta
in `src/main/java/com/android/tools/build/bundletool/commands/BuildApksCommand.java`
#### Snippet
```java

  private ImmutableMap<String, SdkBundle> getValidatedSdkBundlesByPackageName(
      Closer closer, TempDirectory tempDir) throws IOException {
    SdkBundleValidator sdkBundleValidator = SdkBundleValidator.create();
    ImmutableListMultimap.Builder<String, SdkBundle> sdkBundlesPerPackageNameBuilder =
```

### UnstableApiUsage
'register(C)' is declared in unstable class 'com.google.common.io.Closer' marked with @Beta
in `src/main/java/com/android/tools/build/bundletool/commands/BuildApksCommand.java`
#### Snippet
```java
    for (int index = 0; index < sdkBundlePaths.size(); index++) {
      Path sdkBundlePath = sdkBundlePaths.get(index);
      ZipFile sdkBundleZip = closer.register(new ZipFile(sdkBundlePath.toFile()));
      sdkBundleValidator.validateFile(sdkBundleZip);

```

### UnstableApiUsage
'register(C)' is declared in unstable class 'com.google.common.io.Closer' marked with @Beta
in `src/main/java/com/android/tools/build/bundletool/commands/BuildApksCommand.java`
#### Snippet
```java

      ZipFile sdkModulesZip =
          closer.register(getModulesZip(sdkBundleZip, tempDir.getPath().resolve("tmp" + index)));
      sdkBundleValidator.validateModulesFile(sdkModulesZip);

```

### UnstableApiUsage
'com.google.common.io.Closeables' is marked unstable with @Beta
in `src/main/java/com/android/tools/build/bundletool/io/SerializationFilesManager.java`
#### Snippet
```java
  public void close() throws IOException {
    for (ZipFile zipFile : openedBinaryApks.values()) {
      Closeables.close(zipFile, /* swallowIOException= */ true);
    }
    tempDirectory.close();
```

### UnstableApiUsage
'close(java.io.Closeable, boolean)' is declared in unstable class 'com.google.common.io.Closeables' marked with @Beta
in `src/main/java/com/android/tools/build/bundletool/io/SerializationFilesManager.java`
#### Snippet
```java
  public void close() throws IOException {
    for (ZipFile zipFile : openedBinaryApks.values()) {
      Closeables.close(zipFile, /* swallowIOException= */ true);
    }
    tempDirectory.close();
```

### UnstableApiUsage
'com.google.common.io.Closeables' is marked unstable with @Beta
in `src/main/java/com/android/tools/build/bundletool/io/SerializationFilesManager.java`
#### Snippet
```java
  void closeAndRemoveBinaryApks() throws IOException {
    for (Entry<Path, ZipFile> opened : openedBinaryApks.entrySet()) {
      Closeables.close(opened.getValue(), /* swallowIOException= */ true);
      Files.delete(opened.getKey());
    }
```

### UnstableApiUsage
'close(java.io.Closeable, boolean)' is declared in unstable class 'com.google.common.io.Closeables' marked with @Beta
in `src/main/java/com/android/tools/build/bundletool/io/SerializationFilesManager.java`
#### Snippet
```java
  void closeAndRemoveBinaryApks() throws IOException {
    for (Entry<Path, ZipFile> opened : openedBinaryApks.entrySet()) {
      Closeables.close(opened.getValue(), /* swallowIOException= */ true);
      Files.delete(opened.getKey());
    }
```

### UnstableApiUsage
'falseFirst()' is marked unstable with @Beta
in `src/main/java/com/android/tools/build/bundletool/model/targeting/ScreenDensitySelector.java`
#### Snippet
```java
    if (PREFER_EXPLICIT_DPI_OVER_DEFAULT_CONFIG.enabledForVersion(bundleVersion)) {
      compositeComparator =
          compositeComparator.thenComparing(ScreenDensitySelector::isExplicitDpi, falseFirst());
    }
    return compositeComparator;
```

### UnstableApiUsage
'com.google.common.hash.Hashing' is marked unstable with @Beta
in `src/main/java/com/android/tools/build/bundletool/io/ZipBuilder.java`
#### Snippet
```java
              zipEntry.setSize(entryData.size());
              zipEntry.setCompressedSize(entryData.size());
              zipEntry.setCrc(entryData.hash(Hashing.crc32()).padToLong());
              outZip.putNextEntry(zipEntry);
              entry.getContent().get().copyTo(outZip);
```

### UnstableApiUsage
'crc32()' is declared in unstable class 'com.google.common.hash.Hashing' marked with @Beta
in `src/main/java/com/android/tools/build/bundletool/io/ZipBuilder.java`
#### Snippet
```java
              zipEntry.setSize(entryData.size());
              zipEntry.setCompressedSize(entryData.size());
              zipEntry.setCrc(entryData.hash(Hashing.crc32()).padToLong());
              outZip.putNextEntry(zipEntry);
              entry.getContent().get().copyTo(outZip);
```

### UnstableApiUsage
'zip(java.util.stream.Stream, java.util.stream.Stream**, java.util.function.BiFunction)' is marked unstable with @Beta**
in `src/main/java/com/android/tools/build/bundletool/io/ModuleSplitSerializer.java`
#### Snippet
```java
      // Serialize and sign final APKs.
      ImmutableList<ListenableFuture<ApkDescription>> apkDescriptions =
          Streams.zip(
                  splitsByRelativePath.keySet().stream(),
                  binarySplits.stream(),
```

### UnstableApiUsage
'lexicographical(java.util.Comparator)' is marked unstable with @Beta
in `src/main/java/com/android/tools/build/bundletool/model/ZipPath.java`
#### Snippet
```java
  @Override
  public final int compareTo(ZipPath other) {
    return Comparators.lexicographical(Comparator.<String>naturalOrder())
        .compare(getNames(), other.getNames());
  }
```

### UnstableApiUsage
'com.google.common.io.Closer' is marked unstable with @Beta
in `src/main/java/com/android/tools/build/bundletool/commands/BuildBundleCommand.java`
#### Snippet
```java
    validateInput();

    try (Closer closer = Closer.create()) {
      ImmutableList.Builder<ZipFile> moduleZipFilesBuilder = ImmutableList.builder();
      for (Path modulePath : getModulesPaths()) {
```

### UnstableApiUsage
'com.google.common.io.Closer' is marked unstable with @Beta
in `src/main/java/com/android/tools/build/bundletool/commands/BuildBundleCommand.java`
#### Snippet
```java
    validateInput();

    try (Closer closer = Closer.create()) {
      ImmutableList.Builder<ZipFile> moduleZipFilesBuilder = ImmutableList.builder();
      for (Path modulePath : getModulesPaths()) {
```

### UnstableApiUsage
'create()' is declared in unstable class 'com.google.common.io.Closer' marked with @Beta
in `src/main/java/com/android/tools/build/bundletool/commands/BuildBundleCommand.java`
#### Snippet
```java
    validateInput();

    try (Closer closer = Closer.create()) {
      ImmutableList.Builder<ZipFile> moduleZipFilesBuilder = ImmutableList.builder();
      for (Path modulePath : getModulesPaths()) {
```

### UnstableApiUsage
'register(C)' is declared in unstable class 'com.google.common.io.Closer' marked with @Beta
in `src/main/java/com/android/tools/build/bundletool/commands/BuildBundleCommand.java`
#### Snippet
```java
      for (Path modulePath : getModulesPaths()) {
        try {
          moduleZipFilesBuilder.add(closer.register(new ZipFile(modulePath.toFile())));
        } catch (ZipException e) {
          throw CommandExecutionException.builder()
```

### UnstableApiUsage
'asByteSource(java.nio.charset.Charset)' is marked unstable with @Beta
in `src/main/java/com/android/tools/build/bundletool/commands/AddTransparencyCommand.java`
#### Snippet
```java

  private static ByteSource toBytes(String content) {
    return CharSource.wrap(content).asByteSource(Charset.defaultCharset());
  }

```

### UnstableApiUsage
'getNameWithoutExtension(java.lang.String)' is marked unstable with @Beta
in `src/main/java/com/android/tools/build/bundletool/commands/InstallMultiApksCommand.java`
#### Snippet
```java
      Path withApexExtension =
          path.resolveSibling(
              com.google.common.io.Files.getNameWithoutExtension(path.toString()) + ".apex");
      Files.move(path, withApexExtension);
      newPaths.add(withApexExtension);
```

### UnstableApiUsage
'stream(java.util.Optional)' is marked unstable with @Beta
in `src/main/java/com/android/tools/build/bundletool/commands/InstallMultiApksCommand.java`
#### Snippet
```java
        .values()
        .stream()
        .flatMap(Streams::stream)
        .collect(toImmutableList());
  }
```

### UnstableApiUsage
'stream(java.util.Optional)' is marked unstable with @Beta
in `src/main/java/com/android/tools/build/bundletool/commands/InstallMultiApksCommand.java`
#### Snippet
```java
              .flatMap(
                  apksArchivePath ->
                      stream(
                          apksWithPackageName(apksArchivePath, deviceSpec, aapt2CommandSupplier)))
              .filter(apks -> shouldInstall(apks, existingPackages))
```

### UnstableApiUsage
'com.google.common.io.MoreFiles' is marked unstable with @Beta
in `src/main/java/com/android/tools/build/bundletool/commands/BuildSdkApksManager.java`
#### Snippet
```java

    if (command.getOverwriteOutput() && Files.exists(command.getOutputFile())) {
      MoreFiles.deleteRecursively(command.getOutputFile(), RecursiveDeleteOption.ALLOW_INSECURE);
    }

```

### UnstableApiUsage
'deleteRecursively(java.nio.file.Path, com.google.common.io.RecursiveDeleteOption...)' is declared in unstable class 'com.google.common.io.MoreFiles' marked with @Beta
in `src/main/java/com/android/tools/build/bundletool/commands/BuildSdkApksManager.java`
#### Snippet
```java

    if (command.getOverwriteOutput() && Files.exists(command.getOutputFile())) {
      MoreFiles.deleteRecursively(command.getOutputFile(), RecursiveDeleteOption.ALLOW_INSECURE);
    }

```

### UnstableApiUsage
'com.google.common.io.RecursiveDeleteOption' is marked unstable with @Beta
in `src/main/java/com/android/tools/build/bundletool/commands/BuildSdkApksManager.java`
#### Snippet
```java

    if (command.getOverwriteOutput() && Files.exists(command.getOutputFile())) {
      MoreFiles.deleteRecursively(command.getOutputFile(), RecursiveDeleteOption.ALLOW_INSECURE);
    }

```

### UnstableApiUsage
'ALLOW_INSECURE' is declared in unstable enum 'com.google.common.io.RecursiveDeleteOption' marked with @Beta
in `src/main/java/com/android/tools/build/bundletool/commands/BuildSdkApksManager.java`
#### Snippet
```java

    if (command.getOverwriteOutput() && Files.exists(command.getOutputFile())) {
      MoreFiles.deleteRecursively(command.getOutputFile(), RecursiveDeleteOption.ALLOW_INSECURE);
    }

```

### UnstableApiUsage
'com.google.common.io.Closer' is marked unstable with @Beta
in `src/main/java/com/android/tools/build/bundletool/commands/BuildSdkBundleCommand.java`
#### Snippet
```java
    validateInput();

    try (Closer closer = Closer.create()) {
      ImmutableList.Builder<ZipFile> moduleZipFilesBuilder = ImmutableList.builder();
      for (Path modulePath : getModulesPaths()) {
```

### UnstableApiUsage
'com.google.common.io.Closer' is marked unstable with @Beta
in `src/main/java/com/android/tools/build/bundletool/commands/BuildSdkBundleCommand.java`
#### Snippet
```java
    validateInput();

    try (Closer closer = Closer.create()) {
      ImmutableList.Builder<ZipFile> moduleZipFilesBuilder = ImmutableList.builder();
      for (Path modulePath : getModulesPaths()) {
```

### UnstableApiUsage
'create()' is declared in unstable class 'com.google.common.io.Closer' marked with @Beta
in `src/main/java/com/android/tools/build/bundletool/commands/BuildSdkBundleCommand.java`
#### Snippet
```java
    validateInput();

    try (Closer closer = Closer.create()) {
      ImmutableList.Builder<ZipFile> moduleZipFilesBuilder = ImmutableList.builder();
      for (Path modulePath : getModulesPaths()) {
```

### UnstableApiUsage
'register(C)' is declared in unstable class 'com.google.common.io.Closer' marked with @Beta
in `src/main/java/com/android/tools/build/bundletool/commands/BuildSdkBundleCommand.java`
#### Snippet
```java
      for (Path modulePath : getModulesPaths()) {
        try {
          moduleZipFilesBuilder.add(closer.register(new ZipFile(modulePath.toFile())));
        } catch (ZipException e) {
          throw CommandExecutionException.builder()
```

### UnstableApiUsage
'com.google.common.hash.Hashing' is marked unstable with @Beta
in `src/main/java/com/android/tools/build/bundletool/transparency/CodeTransparencyFactory.java`
#### Snippet
```java
      codeRelatedFile.setBundletoolRepoPath(resourcePath);
      ByteSource byteSource = resourceReader.getResourceByteSource(resourcePath);
      codeRelatedFile.setSha256(byteSource.hash(Hashing.sha256()).toString());
    } catch (IOException e) {
      throw InvalidBundleException.builder()
```

### UnstableApiUsage
'sha256()' is declared in unstable class 'com.google.common.hash.Hashing' marked with @Beta
in `src/main/java/com/android/tools/build/bundletool/transparency/CodeTransparencyFactory.java`
#### Snippet
```java
      codeRelatedFile.setBundletoolRepoPath(resourcePath);
      ByteSource byteSource = resourceReader.getResourceByteSource(resourcePath);
      codeRelatedFile.setSha256(byteSource.hash(Hashing.sha256()).toString());
    } catch (IOException e) {
      throw InvalidBundleException.builder()
```

### UnstableApiUsage
'com.google.common.hash.Hashing' is marked unstable with @Beta
in `src/main/java/com/android/tools/build/bundletool/transparency/CodeTransparencyFactory.java`
#### Snippet
```java
    }
    try {
      codeRelatedFile.setSha256(moduleEntry.getContent().hash(Hashing.sha256()).toString());
    } catch (IOException e) {
      throw new UncheckedIOException("An error occurred when calculating file hash.", e);
```

### UnstableApiUsage
'sha256()' is declared in unstable class 'com.google.common.hash.Hashing' marked with @Beta
in `src/main/java/com/android/tools/build/bundletool/transparency/CodeTransparencyFactory.java`
#### Snippet
```java
    }
    try {
      codeRelatedFile.setSha256(moduleEntry.getContent().hash(Hashing.sha256()).toString());
    } catch (IOException e) {
      throw new UncheckedIOException("An error occurred when calculating file hash.", e);
```

### UnstableApiUsage
'mapWithIndex(java.util.stream.Stream, com.google.common.collect.Streams.FunctionWithIndex)' is marked unstable with @Beta
in `src/main/java/com/android/tools/build/bundletool/mergers/ResourceTableMerger.java`
#### Snippet
```java
      ImmutableList<T> list, Function<T, R> valueFn) {
    Map<Integer, T> map =
        Streams.mapWithIndex(
                list.stream(),
                (value, i) -> new AbstractMap.SimpleEntry<>(Ints.checkedCast(i), value))
```

### UnstableApiUsage
'com.google.common.collect.Streams.FunctionWithIndex' is marked unstable with @Beta
in `src/main/java/com/android/tools/build/bundletool/mergers/ResourceTableMerger.java`
#### Snippet
```java
        Streams.mapWithIndex(
                list.stream(),
                (value, i) -> new AbstractMap.SimpleEntry<>(Ints.checkedCast(i), value))
            .collect(toImmutableMap(Map.Entry::getKey, Map.Entry::getValue));
    return ImmutableMap.copyOf(Maps.transformValues(map, valueFn::apply));
```

### UnstableApiUsage
'stream(java.util.Optional)' is marked unstable with @Beta
in `src/main/java/com/android/tools/build/bundletool/model/AndroidManifest.java`
#### Snippet
```java
            PROVIDER_ELEMENT_NAME,
            RECEIVER_ELEMENT_NAME);
    return stream(getManifestElement().getOptionalChildElement(APPLICATION_ELEMENT_NAME))
        .flatMap(app -> app.getChildrenElements())
        .anyMatch(component -> componentNames.contains(component.getName()));
```

### UnstableApiUsage
'tryParse(java.lang.String)' is marked unstable with @Beta
in `src/main/java/com/android/tools/build/bundletool/model/AndroidManifest.java`
#### Snippet
```java
    int dotIndex = sdkVersion.indexOf('.');
    String codename = dotIndex != -1 ? sdkVersion.substring(0, dotIndex) : sdkVersion;
    return Ints.tryParse(codename) == null;
  }

```

### UnstableApiUsage
'stream(java.util.Optional)' is marked unstable with @Beta
in `src/main/java/com/android/tools/build/bundletool/model/AndroidManifest.java`
#### Snippet
```java

  public ImmutableListMultimap<String, XmlProtoElement> getActivitiesByName() {
    return stream(getManifestElement().getOptionalChildElement(APPLICATION_ELEMENT_NAME))
        .flatMap(app -> app.getChildrenElements(ACTIVITY_ELEMENT_NAME))
        .filter(activity -> activity.getAndroidAttribute(NAME_RESOURCE_ID).isPresent())
```

### UnstableApiUsage
'stream(java.util.Optional)' is marked unstable with @Beta
in `src/main/java/com/android/tools/build/bundletool/model/AndroidManifest.java`
#### Snippet
```java
   */
  public boolean hasExplicitlyDefinedNativeActivities() {
    return stream(getManifestElement().getOptionalChildElement(APPLICATION_ELEMENT_NAME))
        .flatMap(app -> app.getChildrenElements(ACTIVITY_ELEMENT_NAME))
        .flatMap(activity -> activity.getChildrenElements(META_DATA_ELEMENT_NAME))
```

### UnstableApiUsage
'stream(java.util.Optional)' is marked unstable with @Beta
in `src/main/java/com/android/tools/build/bundletool/model/AndroidManifest.java`
#### Snippet
```java

  private ImmutableList<XmlProtoElement> getActivities() {
    return stream(getManifestElement().getOptionalChildElement(APPLICATION_ELEMENT_NAME))
        .flatMap(app -> app.getChildrenElements(ACTIVITY_ELEMENT_NAME))
        .collect(toImmutableList());
```

