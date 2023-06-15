# private-compute-services 
 
# Bad smells
I found 9 bad smells with 9 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryToStringCall | 9 | true |
## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-private-compute-services-719688127919494927613288738804597751549/src/com/google/android/as/oss/fl/localcompute/PathConversionUtils.java`
#### Snippet
```java
context.getFilesDir().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-private-compute-services-719688127919494927613288738804597751549/src/com/google/android/as/oss/fl/localcompute/PathConversionUtils.java`
#### Snippet
```java
context.getFilesDir().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-private-compute-services-719688127919494927613288738804597751549/src/com/google/android/as/oss/fl/localcompute/PathConversionUtils.java`
#### Snippet
```java
context.getCacheDir().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-private-compute-services-719688127919494927613288738804597751549/src/com/google/android/as/oss/fl/localcompute/PathConversionUtils.java`
#### Snippet
```java
context.getCacheDir().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-private-compute-services-719688127919494927613288738804597751549/src/com/google/android/as/oss/fl/localcompute/client/FileCopyGrpcClient.java`
#### Snippet
```java
srcDirUri.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-private-compute-services-719688127919494927613288738804597751549/src/com/google/android/as/oss/fl/localcompute/client/FileCopyGrpcClient.java`
#### Snippet
```java
srcDir.toPath().relativize(srcFile.toPath()).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-private-compute-services-719688127919494927613288738804597751549/src/com/google/android/as/oss/fl/localcompute/client/FileCopyGrpcClient.java`
#### Snippet
```java
srcDir.toPath().relativize(srcFile.toPath()).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-private-compute-services-719688127919494927613288738804597751549/src/com/google/android/as/oss/fl/localcompute/impl/LocalComputeResourceManagerImpl.java`
#### Snippet
```java
convertedInputDirUri.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-private-compute-services-719688127919494927613288738804597751549/src/com/google/android/as/oss/networkusage/ui/user/NetworkUsageItemUtils.java`
#### Snippet
```java
pm.getApplicationLabel(ai).toString()
```

