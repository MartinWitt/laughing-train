# jvm-native-trusted-roots 
 
# Bad smells
I found 5 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| BlockingMethodInNonBlockingContext | 5 | false |
## RuleId[id=BlockingMethodInNonBlockingContext]
### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/org/jetbrains/nativecerts/linux/LinuxTrustedCertificatesUtil.java`
#### Snippet
```java

        LOGGER.fine("Reading certificates from " + dir + ": file does not exist");
        try (Stream<Path> filesStream = Files.list(dir)) {
            List<Path> paths = filesStream.collect(Collectors.toList());

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/org/jetbrains/nativecerts/linux/LinuxTrustedCertificatesUtil.java`
#### Snippet
```java
            }

            try (InputStream stream = Files.newInputStream(file)) {
                List<X509Certificate> list = PemReaderUtil.readPemBundle(stream, file.toString());

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/org/jetbrains/nativecerts/linux/PemReaderUtil.java`
#### Snippet
```java
        try (LineNumberReader reader = new LineNumberReader(new InputStreamReader(inputStream, StandardCharsets.US_ASCII))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String outerTrimmed = line.trim();
                if (outerTrimmed.isEmpty()) {
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/org/jetbrains/nativecerts/linux/PemReaderUtil.java`
#### Snippet
```java
                    StringBuilder base64encoded = new StringBuilder();
                    while (true) {
                        line = reader.readLine();
                        if (line == null) {
                            throw new IllegalStateException("Non-closed '" + BEGIN_CERT + "' block at line " +
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/org/jetbrains/nativecerts/NativeTrustedRootsDebugMain.java`
#### Snippet
```java

    public static void main(String[] args) throws Exception {
        File logFile = File.createTempFile("nativecerts-", ".log");
        setupLogging(logFile);

```

