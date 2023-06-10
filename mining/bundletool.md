# bundletool 
 
# Bad smells
I found 84 bad smells with 84 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryToStringCall | 84 | true |
## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-bundletool-41802734005597428911467528339285842909/src/main/java/com/android/tools/build/bundletool/archive/ArchivedResourcesHelper.java`
#### Snippet
```java
dir.getFileName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-bundletool-41802734005597428911467528339285842909/src/main/java/com/android/tools/build/bundletool/commands/DumpManager.java`
#### Snippet
```java
configValue.getConfig().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-bundletool-41802734005597428911467528339285842909/src/main/java/com/android/tools/build/bundletool/commands/ExtractApksCommand.java`
#### Snippet
```java
matchedApk.getPath().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-bundletool-41802734005597428911467528339285842909/src/main/java/com/android/tools/build/bundletool/commands/ExtractApksCommand.java`
#### Snippet
```java
apk.getPath().getFileName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-bundletool-41802734005597428911467528339285842909/src/main/java/com/android/tools/build/bundletool/commands/InstallApksCommand.java`
#### Snippet
```java
apk.getFileName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-bundletool-41802734005597428911467528339285842909/src/main/java/com/android/tools/build/bundletool/commands/InstallMultiApksCommand.java`
#### Snippet
```java
packagePathVersion.getPath().toAbsolutePath().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-bundletool-41802734005597428911467528339285842909/src/test/java/com/android/tools/build/bundletool/commands/AddTransparencyCommandTest.java`
#### Snippet
```java
ByteSource.wrap(FILE_CONTENT_DEX1).hash(Hashing.sha256()).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-bundletool-41802734005597428911467528339285842909/src/test/java/com/android/tools/build/bundletool/commands/AddTransparencyCommandTest.java`
#### Snippet
```java
ByteSource.wrap(FILE_CONTENT_DEX2).hash(Hashing.sha256()).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-bundletool-41802734005597428911467528339285842909/src/test/java/com/android/tools/build/bundletool/commands/AddTransparencyCommandTest.java`
#### Snippet
```java
ByteSource.wrap(FILE_CONTENT_NATIVE_LIB1).hash(Hashing.sha256()).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-bundletool-41802734005597428911467528339285842909/src/test/java/com/android/tools/build/bundletool/commands/AddTransparencyCommandTest.java`
#### Snippet
```java
ByteSource.wrap(FILE_CONTENT_NATIVE_LIB2).hash(Hashing.sha256()).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-bundletool-41802734005597428911467528339285842909/src/test/java/com/android/tools/build/bundletool/commands/AddTransparencyCommandTest.java`
#### Snippet
```java
ByteSource.wrap(FILE_CONTENT_NATIVE_LARGE).hash(Hashing.sha256()).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-bundletool-41802734005597428911467528339285842909/src/test/java/com/android/tools/build/bundletool/commands/AddTransparencyCommandTest.java`
#### Snippet
```java
new ResourceReader().getResourceByteSource(bundletoolRepoPath).hash(Hashing.sha256()).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-bundletool-41802734005597428911467528339285842909/src/test/java/com/android/tools/build/bundletool/commands/AddTransparencyCommandTest.java`
#### Snippet
```java
new ResourceReader().getResourceByteSource(bundletoolRepoPath).hash(Hashing.sha256()).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-bundletool-41802734005597428911467528339285842909/src/test/java/com/android/tools/build/bundletool/commands/AddTransparencyCommandTest.java`
#### Snippet
```java
new ResourceReader().getResourceByteSource(bundletoolRepoPath).hash(Hashing.sha256()).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-bundletool-41802734005597428911467528339285842909/src/test/java/com/android/tools/build/bundletool/commands/BuildApksManagerTest.java`
#### Snippet
```java
ZipPath.create(lowTierSplit.getPath()).getFileName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-bundletool-41802734005597428911467528339285842909/src/test/java/com/android/tools/build/bundletool/commands/BuildApksManagerTest.java`
#### Snippet
```java
ZipPath.create(mediumTierSplit.getPath()).getFileName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-bundletool-41802734005597428911467528339285842909/src/test/java/com/android/tools/build/bundletool/commands/BuildApksManagerTest.java`
#### Snippet
```java
ZipPath.create(lowTierSplit.getPath()).getFileName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-bundletool-41802734005597428911467528339285842909/src/test/java/com/android/tools/build/bundletool/commands/BuildApksManagerTest.java`
#### Snippet
```java
ZipPath.create(mediumTierSplit.getPath()).getFileName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-bundletool-41802734005597428911467528339285842909/src/test/java/com/android/tools/build/bundletool/commands/BuildApksManagerTest.java`
#### Snippet
```java
ByteSource.wrap(dexFileInBaseModuleContent).hash(Hashing.sha256()).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-bundletool-41802734005597428911467528339285842909/src/test/java/com/android/tools/build/bundletool/commands/BuildApksManagerTest.java`
#### Snippet
```java
ByteSource.wrap(libFileInBaseModuleContent).hash(Hashing.sha256()).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-bundletool-41802734005597428911467528339285842909/src/test/java/com/android/tools/build/bundletool/commands/BuildApksManagerTest.java`
#### Snippet
```java
ByteSource.wrap(dexFileInFeatureModuleContent).hash(Hashing.sha256()).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-bundletool-41802734005597428911467528339285842909/src/test/java/com/android/tools/build/bundletool/commands/CheckTransparencyCommandTest.java`
#### Snippet
```java
ByteSource.wrap(dexFileContents).hash(Hashing.sha256()).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-bundletool-41802734005597428911467528339285842909/src/test/java/com/android/tools/build/bundletool/commands/CheckTransparencyCommandTest.java`
#### Snippet
```java
ByteSource.wrap(dexFileContents).hash(Hashing.sha256()).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-bundletool-41802734005597428911467528339285842909/src/test/java/com/android/tools/build/bundletool/commands/CheckTransparencyCommandTest.java`
#### Snippet
```java
ByteSource.wrap(dexFileContents).hash(Hashing.sha256()).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-bundletool-41802734005597428911467528339285842909/src/test/java/com/android/tools/build/bundletool/commands/CheckTransparencyCommandTest.java`
#### Snippet
```java
ByteSource.wrap(dexFileContents).hash(Hashing.sha256()).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-bundletool-41802734005597428911467528339285842909/src/test/java/com/android/tools/build/bundletool/commands/CheckTransparencyCommandTest.java`
#### Snippet
```java
ByteSource.wrap(dexFileContents).hash(Hashing.sha256()).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-bundletool-41802734005597428911467528339285842909/src/test/java/com/android/tools/build/bundletool/commands/EvaluateDeviceTargetingConfigCommandTest.java`
#### Snippet
```java
TestData.copyToTempDir(tmp, testFilePath + configFileName).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-bundletool-41802734005597428911467528339285842909/src/test/java/com/android/tools/build/bundletool/commands/EvaluateDeviceTargetingConfigCommandTest.java`
#### Snippet
```java
TestData.copyToTempDir(tmp, testFilePath + devicePropertiesFileName).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-bundletool-41802734005597428911467528339285842909/src/test/java/com/android/tools/build/bundletool/commands/ExtractApksCommandTest.java`
#### Snippet
```java
apk.getFileName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-bundletool-41802734005597428911467528339285842909/src/test/java/com/android/tools/build/bundletool/commands/ExtractApksCommandTest.java`
#### Snippet
```java
Iterables.getOnlyElement(matchedApks).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-bundletool-41802734005597428911467528339285842909/src/test/java/com/android/tools/build/bundletool/commands/ExtractApksCommandTest.java`
#### Snippet
```java
apk.getFileName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-bundletool-41802734005597428911467528339285842909/src/test/java/com/android/tools/build/bundletool/commands/ExtractApksCommandTest.java`
#### Snippet
```java
apk.getFileName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-bundletool-41802734005597428911467528339285842909/src/test/java/com/android/tools/build/bundletool/commands/ExtractApksCommandTest.java`
#### Snippet
```java
apk.getFileName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-bundletool-41802734005597428911467528339285842909/src/test/java/com/android/tools/build/bundletool/commands/InstallMultiApksCommandTest.java`
#### Snippet
```java
Paths.get(packageName, fileName.toString()).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-bundletool-41802734005597428911467528339285842909/src/test/java/com/android/tools/build/bundletool/commands/InstallMultiApksCommandTest.java`
#### Snippet
```java
fileName.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-bundletool-41802734005597428911467528339285842909/src/test/java/com/android/tools/build/bundletool/commands/InstallMultiApksCommandTest.java`
#### Snippet
```java
apkPath.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-bundletool-41802734005597428911467528339285842909/src/main/java/com/android/tools/build/bundletool/device/AbstractSizeAggregator.java`
#### Snippet
```java
apk.getPath().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-bundletool-41802734005597428911467528339285842909/src/main/java/com/android/tools/build/bundletool/device/DdmlibDevice.java`
#### Snippet
```java
Iterables.getOnlyElement(apkFiles).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-bundletool-41802734005597428911467528339285842909/src/main/java/com/android/tools/build/bundletool/device/DdmlibDevice.java`
#### Snippet
```java
file.getDestinationPath().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-bundletool-41802734005597428911467528339285842909/src/main/java/com/android/tools/build/bundletool/device/DeviceTierApkMatcher.java`
#### Snippet
```java
i.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-bundletool-41802734005597428911467528339285842909/src/test/java/com/android/tools/build/bundletool/device/AdbRunnerTest.java`
#### Snippet
```java
tmp.getRoot().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-bundletool-41802734005597428911467528339285842909/src/main/java/com/android/tools/build/bundletool/model/targeting/TargetedDirectory.java`
#### Snippet
```java
originalPath().subpath(0, maxIndex + 1).resolveSibling(getPathSegments().get(maxIndex).getName()).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-bundletool-41802734005597428911467528339285842909/src/main/java/com/android/tools/build/bundletool/model/targeting/TargetingGenerator.java`
#### Snippet
```java
path.getFileName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-bundletool-41802734005597428911467528339285842909/src/main/java/com/android/tools/build/bundletool/model/targeting/TargetingGenerator.java`
#### Snippet
```java
imagePath.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-bundletool-41802734005597428911467528339285842909/src/main/java/com/android/tools/build/bundletool/model/targeting/TargetingGenerator.java`
#### Snippet
```java
imagePath.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-bundletool-41802734005597428911467528339285842909/src/main/java/com/android/tools/build/bundletool/model/utils/GetSizeCsvUtils.java`
#### Snippet
```java
i.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-bundletool-41802734005597428911467528339285842909/src/test/java/com/android/tools/build/bundletool/model/utils/SplitsXmlInjectorTest.java`
#### Snippet
```java
processedBaseMasterSplit.getEntries().get(1).getPath().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-bundletool-41802734005597428911467528339285842909/src/main/java/com/android/tools/build/bundletool/model/utils/xmlproto/XmlProtoPrintUtils.java`
#### Snippet
```java
item.getPrim().getOneofValueCase().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-bundletool-41802734005597428911467528339285842909/src/main/java/com/android/tools/build/bundletool/model/utils/xmlproto/XmlProtoPrintUtils.java`
#### Snippet
```java
item.getValueCase().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-bundletool-41802734005597428911467528339285842909/src/main/java/com/android/tools/build/bundletool/model/utils/xmlproto/XmlProtoPrintUtils.java`
#### Snippet
```java
value.getCompoundValue().getValueCase().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-bundletool-41802734005597428911467528339285842909/src/main/java/com/android/tools/build/bundletool/model/utils/xmlproto/XmlProtoPrintUtils.java`
#### Snippet
```java
tag.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-bundletool-41802734005597428911467528339285842909/src/main/java/com/android/tools/build/bundletool/io/Aapt2ResourceConverter.java`
#### Snippet
```java
ApkSerializerHelper.toApkEntryPath(entry.getPath()).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-bundletool-41802734005597428911467528339285842909/src/main/java/com/android/tools/build/bundletool/io/ModuleSplitSerializer.java`
#### Snippet
```java
/* binaryApk= */
toApkEntryPath(entry.getPath(), true).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-bundletool-41802734005597428911467528339285842909/src/main/java/com/android/tools/build/bundletool/io/ZipFlingerBundleSerializer.java`
#### Snippet
```java
METADATA_DIRECTORY.resolve(metadataEntry.getKey()).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-bundletool-41802734005597428911467528339285842909/src/main/java/com/android/tools/build/bundletool/io/ZipFlingerBundleSerializer.java`
#### Snippet
```java
METADATA_DIRECTORY.resolve(metadataEntry.getKey()).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-bundletool-41802734005597428911467528339285842909/src/main/java/com/android/tools/build/bundletool/mergers/ModuleSplitsToShardMerger.java`
#### Snippet
```java
filePath.getFileName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-bundletool-41802734005597428911467528339285842909/src/test/java/com/android/tools/build/bundletool/mergers/BundleModuleMergerTest.java`
#### Snippet
```java
moduleEntry.getPath().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-bundletool-41802734005597428911467528339285842909/src/test/java/com/android/tools/build/bundletool/mergers/BundleModuleMergerTest.java`
#### Snippet
```java
moduleEntry.getPath().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-bundletool-41802734005597428911467528339285842909/src/test/java/com/android/tools/build/bundletool/mergers/BundleModuleMergerTest.java`
#### Snippet
```java
moduleEntry.getPath().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-bundletool-41802734005597428911467528339285842909/src/test/java/com/android/tools/build/bundletool/mergers/BundleModuleMergerTest.java`
#### Snippet
```java
moduleEntry.getPath().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-bundletool-41802734005597428911467528339285842909/src/test/java/com/android/tools/build/bundletool/mergers/BundleModuleMergerTest.java`
#### Snippet
```java
moduleEntry.getPath().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-bundletool-41802734005597428911467528339285842909/src/test/java/com/android/tools/build/bundletool/mergers/BundleModuleMergerTest.java`
#### Snippet
```java
moduleEntry.getPath().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-bundletool-41802734005597428911467528339285842909/src/test/java/com/android/tools/build/bundletool/mergers/BundleModuleMergerTest.java`
#### Snippet
```java
moduleEntry.getPath().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-bundletool-41802734005597428911467528339285842909/src/test/java/com/android/tools/build/bundletool/mergers/D8DexMergerTest.java`
#### Snippet
```java
dex.getFileName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-bundletool-41802734005597428911467528339285842909/src/test/java/com/android/tools/build/bundletool/mergers/D8DexMergerTest.java`
#### Snippet
```java
dex.getFileName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-bundletool-41802734005597428911467528339285842909/src/main/java/com/android/tools/build/bundletool/sdkmodule/AndroidResourceRenamer.java`
#### Snippet
```java
renamedResourcePath(ZipPath.create(file.getPath())).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-bundletool-41802734005597428911467528339285842909/src/main/java/com/android/tools/build/bundletool/sdkmodule/AndroidResourceRenamer.java`
#### Snippet
```java
ByteSource.wrap(packageName.getBytes(UTF_8)).hash(Hashing.farmHashFingerprint64()).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-bundletool-41802734005597428911467528339285842909/src/main/java/com/android/tools/build/bundletool/sdkmodule/DexAndResourceRepackager.java`
#### Snippet
```java
entry.getPath().getFileName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-bundletool-41802734005597428911467528339285842909/src/test/java/com/android/tools/build/bundletool/shards/ShardedApksFacadeTest.java`
#### Snippet
```java
moduleEntry.getPath().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-bundletool-41802734005597428911467528339285842909/src/main/java/com/android/tools/build/bundletool/splitters/AbiApexImagesSplitter.java`
#### Snippet
```java
entry.getPath().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-bundletool-41802734005597428911467528339285842909/src/test/java/com/android/tools/build/bundletool/splitters/CodeTransparencyInjectorTest.java`
#### Snippet
```java
moduleEntry.getPath().getFileName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-bundletool-41802734005597428911467528339285842909/src/main/java/com/android/tools/build/bundletool/transparency/ApkTransparencyCheckUtils.java`
#### Snippet
```java
apkPaths.get(0).getFileName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-bundletool-41802734005597428911467528339285842909/src/main/java/com/android/tools/build/bundletool/transparency/ApkTransparencyCheckUtils.java`
#### Snippet
```java
apkPath.getFileName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-bundletool-41802734005597428911467528339285842909/src/main/java/com/android/tools/build/bundletool/transparency/ApkTransparencyCheckUtils.java`
#### Snippet
```java
ZipUtils.asByteSource(apkFile, zipEntry).hash(Hashing.sha256()).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-bundletool-41802734005597428911467528339285842909/src/main/java/com/android/tools/build/bundletool/transparency/CodeTransparencyFactory.java`
#### Snippet
```java
byteSource.hash(Hashing.sha256()).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-bundletool-41802734005597428911467528339285842909/src/main/java/com/android/tools/build/bundletool/transparency/CodeTransparencyFactory.java`
#### Snippet
```java
moduleEntry.getContent().hash(Hashing.sha256()).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-bundletool-41802734005597428911467528339285842909/src/main/java/com/android/tools/build/bundletool/validation/ArchiveEntriesValidator.java`
#### Snippet
```java
entry.getPath().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-bundletool-41802734005597428911467528339285842909/src/main/java/com/android/tools/build/bundletool/validation/NestedTargetingValidator.java`
#### Snippet
```java
directoryAllTargeting.stream().map(targeting -> constructTargetingSegmentPath(targeting.getTargeting(), targeting.getTargetingDimensionOrder())).collect(toImmutableList()).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-bundletool-41802734005597428911467528339285842909/src/main/java/com/android/tools/build/bundletool/validation/ResourceTableValidator.java`
#### Snippet
```java
resourceTableEntry.getResourceId().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-bundletool-41802734005597428911467528339285842909/src/test/java/com/android/tools/build/bundletool/validation/CodeTransparencyValidatorTest.java`
#### Snippet
```java
ByteSource.wrap(DEX_FILE_CONTENT).hash(Hashing.sha256()).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-bundletool-41802734005597428911467528339285842909/src/test/java/com/android/tools/build/bundletool/validation/CodeTransparencyValidatorTest.java`
#### Snippet
```java
ByteSource.wrap(NATIVE_LIB_FILE_CONTENT).hash(Hashing.sha256()).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-bundletool-41802734005597428911467528339285842909/src/test/java/com/android/tools/build/bundletool/testing/BundleModuleBuilder.java`
#### Snippet
```java
entry.getPath().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-bundletool-41802734005597428911467528339285842909/src/test/java/com/android/tools/build/bundletool/testing/CodeRelatedFileBuilderHelper.java`
#### Snippet
```java
archivedClassesDex.hash(Hashing.sha256()).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-bundletool-41802734005597428911467528339285842909/src/test/java/com/android/tools/build/bundletool/testing/SdkBundleBuilder.java`
#### Snippet
```java
Path.of(SdkBundleBuilder.DEFAULT_MODULE_NAME, asset.getAssetName()).toString()
```

