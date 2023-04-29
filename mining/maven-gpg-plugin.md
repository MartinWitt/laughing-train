# maven-gpg-plugin 
 
# Bad smells
I found 10 bad smells with 1 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| CStyleArrayDeclaration | 2 | false |
| IgnoreResultOfCall | 2 | false |
| UnnecessaryLocalVariable | 1 | true |
| NestedAssignment | 1 | false |
| BoundedWildcard | 1 | false |
| EqualsWhichDoesntCheckParameterClass | 1 | false |
| CastCanBeRemovedNarrowingVariableType | 1 | false |
| StringConcatenationInsideStringBufferAppend | 1 | false |
## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `model` is redundant
in `src/main/java/org/apache/maven/plugins/gpg/SignAndDeployFileMojo.java`
#### Snippet
```java
    private Model readModel(File pomFile) throws MojoExecutionException {
        try (Reader reader = ReaderFactory.newXmlReader(pomFile)) {
            final Model model = new MavenXpp3Reader().read(reader);
            return model;
        } catch (FileNotFoundException e) {
```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/maven/plugins/gpg/AbstractGpgSigner.java`
#### Snippet
```java
            File signatureDirectory = signature;

            while ((signatureDirectory = signatureDirectory.getParentFile()) != null) {
                if (isPossibleRootOfArtifact(signatureDirectory)) {
                    break;
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/org/apache/maven/plugins/gpg/SignAndDeployFileMojo.java`
#### Snippet
```java
        private final List<String> result;

        SimpleModelProblemCollector(List<String> result) {
            this.result = result;
        }
```

## RuleId[id=CStyleArrayDeclaration]
### CStyleArrayDeclaration
C-style array declaration of local variable `newExcludes`
in `src/main/java/org/apache/maven/plugins/gpg/FilesCollector.java`
#### Snippet
```java
            return;
        }
        String newExcludes[] = new String[excludes.length];
        for (int i = 0; i < excludes.length; i++) {
            String pattern;
```

### CStyleArrayDeclaration
C-style array declaration of field `DEFAULT_EXCLUDES`
in `src/main/java/org/apache/maven/plugins/gpg/FilesCollector.java`
#### Snippet
```java
    private final MavenProject project;

    private static final String DEFAULT_EXCLUDES[] =
            new String[] {"**/*.md5", "**/*.sha1", "**/*.sha256", "**/*.sha512", "**/*.asc", "**/*.sigstore"};

```

## RuleId[id=EqualsWhichDoesntCheckParameterClass]
### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `src/main/java/org/apache/maven/plugins/gpg/AttachedSignedArtifact.java`
#### Snippet
```java

    @Override
    public boolean equals(Object o) {
        return delegate.equals(o);
    }
```

## RuleId[id=CastCanBeRemovedNarrowingVariableType]
### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'o' to 'ArtifactMetadata'
in `src/main/java/org/apache/maven/plugins/gpg/SignAndDeployFileMojo.java`
#### Snippet
```java

                for (Object o : artifact.getMetadataList()) {
                    ArtifactMetadata metadata = (ArtifactMetadata) o;
                    getLog().info("Metadata[" + metadata.getKey() + "].filename = " + metadata.getRemoteFilename());
                }
```

## RuleId[id=StringConcatenationInsideStringBufferAppend]
### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/org/apache/maven/plugins/gpg/SignAndDeployFileMojo.java`
#### Snippet
```java
            StringBuilder msg = new StringBuilder("The artifact information is incomplete or not valid:\n");
            for (String e : result) {
                msg.append(" - " + e + '\n');
            }
            throw new MojoFailureException(msg.toString());
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `src/main/java/org/apache/maven/plugins/gpg/AbstractGpgSigner.java`
#### Snippet
```java
            signatureDirectory = new File(outputDir, fileDirectory);
            if (!signatureDirectory.exists()) {
                signatureDirectory.mkdirs();
            }
            signature = new File(signatureDirectory, file.getName() + SIGNATURE_EXTENSION);
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `src/main/java/org/apache/maven/plugins/gpg/AbstractGpgSigner.java`
#### Snippet
```java

        if (signature.exists()) {
            signature.delete();
        }

```

