# tink 
 
# Bad smells
I found 26 bad smells with 26 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryToStringCall | 26 | true |
## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tink918549839234517660032873516703762535/java_src/src/main/java/com/google/crypto/tink/JsonKeysetWriter.java`
#### Snippet
```java
toJson(keyset).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tink918549839234517660032873516703762535/java_src/src/main/java/com/google/crypto/tink/JsonKeysetWriter.java`
#### Snippet
```java
toJson(keyset).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tink918549839234517660032873516703762535/java_src/src/test/java/com/google/crypto/tink/aead/AeadKeyTemplatesTest.java`
#### Snippet
```java
format.getDekTemplate().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tink918549839234517660032873516703762535/java_src/src/test/java/com/google/crypto/tink/hybrid/EciesAeadHkdfPrivateKeyManagerTest.java`
#### Snippet
```java
format.getParams().getDemParams().getAeadDem().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tink918549839234517660032873516703762535/java_src/src/test/java/com/google/crypto/tink/hybrid/EciesAeadHkdfPrivateKeyManagerTest.java`
#### Snippet
```java
format.getParams().getDemParams().getAeadDem().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tink918549839234517660032873516703762535/java_src/src/test/java/com/google/crypto/tink/hybrid/EciesAeadHkdfPrivateKeyManagerTest.java`
#### Snippet
```java
format.getParams().getDemParams().getAeadDem().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tink918549839234517660032873516703762535/java_src/src/test/java/com/google/crypto/tink/hybrid/EciesAeadHkdfPrivateKeyManagerTest.java`
#### Snippet
```java
format.getParams().getDemParams().getAeadDem().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tink918549839234517660032873516703762535/java_src/src/test/java/com/google/crypto/tink/hybrid/HybridKeyTemplatesTest.java`
#### Snippet
```java
format.getParams().getDemParams().getAeadDem().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tink918549839234517660032873516703762535/java_src/src/test/java/com/google/crypto/tink/hybrid/HybridKeyTemplatesTest.java`
#### Snippet
```java
format.getParams().getDemParams().getAeadDem().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tink918549839234517660032873516703762535/java_src/src/test/java/com/google/crypto/tink/hybrid/HybridKeyTemplatesTest.java`
#### Snippet
```java
format.getParams().getDemParams().getAeadDem().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tink918549839234517660032873516703762535/java_src/src/test/java/com/google/crypto/tink/hybrid/HybridKeyTemplatesTest.java`
#### Snippet
```java
format.getParams().getDemParams().getAeadDem().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tink918549839234517660032873516703762535/java_src/src/main/java/com/google/crypto/tink/internal/JsonParser.java`
#### Snippet
```java
element.getAsNumber().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tink918549839234517660032873516703762535/java_src/src/test/java/com/google/crypto/tink/internal/JsonParserTest.java`
#### Snippet
```java
sb.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tink918549839234517660032873516703762535/java_src/src/main/java/com/google/crypto/tink/jwt/RawJwt.java`
#### Snippet
```java
payload.get(name).getAsJsonObject().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tink918549839234517660032873516703762535/java_src/src/main/java/com/google/crypto/tink/jwt/RawJwt.java`
#### Snippet
```java
payload.get(name).getAsJsonArray().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tink918549839234517660032873516703762535/java_src/src/test/java/com/google/crypto/tink/jwt/JsonUtilTest.java`
#### Snippet
```java
sb.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tink918549839234517660032873516703762535/java_src/src/test/java/com/google/crypto/tink/keyderivation/KeyDerivationKeyTemplatesTest.java`
#### Snippet
```java
derivedHandle.getKeysetInfo().getKeyInfo(0).getOutputPrefixType().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tink918549839234517660032873516703762535/tools/tinkey/src/test/java/com/google/crypto/tink/tinkey/AddKeyCommandTest.java`
#### Snippet
```java
inputFile.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tink918549839234517660032873516703762535/tools/tinkey/src/test/java/com/google/crypto/tink/tinkey/AddKeyCommandTest.java`
#### Snippet
```java
outputFile.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tink918549839234517660032873516703762535/tools/tinkey/src/test/java/com/google/crypto/tink/tinkey/RotateKeysetCommandTest.java`
#### Snippet
```java
inputFile.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tink918549839234517660032873516703762535/tools/tinkey/src/test/java/com/google/crypto/tink/tinkey/RotateKeysetCommandTest.java`
#### Snippet
```java
outputFile.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tink918549839234517660032873516703762535/tools/tinkey/src/test/java/com/google/crypto/tink/tinkey/RotateKeysetCommandTest.java`
#### Snippet
```java
credentialFile.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tink918549839234517660032873516703762535/java_src/examples/android/helloworld/app/src/main/java/com/helloworld/MainActivity.java`
#### Snippet
```java
mPlaintextView.getText().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tink918549839234517660032873516703762535/java_src/examples/android/helloworld/app/src/main/java/com/helloworld/MainActivity.java`
#### Snippet
```java
mAssociatedDataView.getText().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tink918549839234517660032873516703762535/java_src/examples/android/helloworld/app/src/main/java/com/helloworld/MainActivity.java`
#### Snippet
```java
mCiphertextView.getText().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-tink918549839234517660032873516703762535/java_src/examples/android/helloworld/app/src/main/java/com/helloworld/MainActivity.java`
#### Snippet
```java
mAssociatedDataView.getText().toString()
```

