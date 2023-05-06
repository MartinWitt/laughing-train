# maven-gpg-plugin 
 
# Bad smells
I found 18 bad smells with 1 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| JavadocReference | 7 | false |
| CStyleArrayDeclaration | 2 | false |
| IgnoreResultOfCall | 2 | false |
| UNCHECKED_WARNING | 1 | false |
| UnnecessaryLocalVariable | 1 | true |
| StringConcatenationInLoops | 1 | false |
| JavadocDeclaration | 1 | false |
| FieldMayBeFinal | 1 | false |
| EqualsWhichDoesntCheckParameterClass | 1 | false |
| StringConcatenationInsideStringBufferAppend | 1 | false |
## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `src/main/java/org/apache/maven/plugins/gpg/AttachedSignedArtifact.java`
#### Snippet
```java
    @Override
    public Collection<ArtifactMetadata> getMetadataList() {
        List<ArtifactMetadata> result = new ArrayList<>(delegate.getMetadataList());

        for (ArtifactMetadata metadata : result) {
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `MojoFailureException`
in `src/main/java/org/apache/maven/plugins/gpg/AbstractGpgMojo.java`
#### Snippet
```java
     * Load and decrypt gpg passphrase from Maven settings if not given from plugin configuration
     *
     * @throws MojoFailureException
     */
    private void loadGpgPassphrase() throws MojoFailureException {
```

### JavadocReference
Cannot resolve symbol `MojoExecutionException`
in `src/main/java/org/apache/maven/plugins/gpg/AbstractGpgSigner.java`
#### Snippet
```java
     * @param file The file to sign
     * @param signature The file in which the generate signature will be put
     * @throws MojoExecutionException if signature generation fails
     */
    protected abstract void generateSignatureForFile(File file, File signature) throws MojoExecutionException;
```

### JavadocReference
Cannot resolve symbol `MojoExecutionException`
in `src/main/java/org/apache/maven/plugins/gpg/AbstractGpgSigner.java`
#### Snippet
```java
     * @param file The file to sign
     * @return A reference to the generated signature file
     * @throws MojoExecutionException if signature generation fails
     */
    public File generateSignatureForArtifact(File file) throws MojoExecutionException {
```

### JavadocReference
Cannot resolve symbol `MojoExecutionException`
in `src/main/java/org/apache/maven/plugins/gpg/SignAndDeployFileMojo.java`
#### Snippet
```java
     *
     * @return The path to the generated POM file, never <code>null</code>.
     * @throws MojoExecutionException If the generation failed.
     */
    private File generatePomFile() throws MojoExecutionException {
```

### JavadocReference
Cannot resolve symbol `MojoExecutionException`
in `src/main/java/org/apache/maven/plugins/gpg/SignAndDeployFileMojo.java`
#### Snippet
```java
     * @param pomFile The path of the POM file to parse, must not be <code>null</code>.
     * @return The model from the POM file, never <code>null</code>.
     * @throws MojoExecutionException If the file doesn't exist of cannot be read.
     */
    private Model readModel(File pomFile) throws MojoExecutionException {
```

### JavadocReference
Cannot resolve symbol `MojoFailureException`
in `src/main/java/org/apache/maven/plugins/gpg/SignAndDeployFileMojo.java`
#### Snippet
```java
     * Validates the user-supplied artifact information.
     *
     * @throws MojoFailureException If any artifact coordinate is invalid.
     */
    private void validateArtifactInformation() throws MojoFailureException {
```

### JavadocReference
Cannot resolve symbol `ArtifactDeployerException`
in `src/main/java/org/apache/maven/plugins/gpg/SignAndDeployFileMojo.java`
#### Snippet
```java
     * @param artifact the artifact definition
     * @param deploymentRepository the repository to deploy to
     * @throws ArtifactDeployerException if an error occurred deploying the artifact
     */
    protected void deploy(Artifact artifact, ArtifactRepository deploymentRepository) throws ArtifactDeployerException {
```

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

## RuleId[id=StringConcatenationInLoops]
### StringConcatenationInLoops
String concatenation `+` in loop
in `src/main/java/org/apache/maven/plugins/gpg/AbstractGpgSigner.java`
#### Snippet
```java
                    break;
                }
                fileDirectory = signatureDirectory.getName() + File.separatorChar + fileDirectory;
            }
            signatureDirectory = new File(outputDir, fileDirectory);
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/maven/plugins/gpg/AbstractGpgMojo.java`
#### Snippet
```java
     * Load and decrypt gpg passphrase from Maven settings if not given from plugin configuration
     *
     * @throws MojoFailureException
     */
    private void loadGpgPassphrase() throws MojoFailureException {
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `executable` may be 'final'
in `src/main/java/org/apache/maven/plugins/gpg/GpgSigner.java`
#### Snippet
```java
 */
public class GpgSigner extends AbstractGpgSigner {
    private String executable;

    public GpgSigner(String executable) {
```

## RuleId[id=CStyleArrayDeclaration]
### CStyleArrayDeclaration
C-style array declaration of field `DEFAULT_EXCLUDES`
in `src/main/java/org/apache/maven/plugins/gpg/FilesCollector.java`
#### Snippet
```java
    private final MavenProject project;

    private static final String DEFAULT_EXCLUDES[] =
            new String[] {"**/*.md5", "**/*.sha1", "**/*.sha256", "**/*.sha512", "**/*.asc", "**/*.sigstore"};

```

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

