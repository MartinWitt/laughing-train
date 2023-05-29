# sling-org-apache-sling-settings 
 
# Bad smells
I found 27 bad smells with 2 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| JavadocReference | 14 | false |
| CharsetObjectCanBeUsed | 2 | false |
| IOStreamConstructor | 2 | false |
| FieldMayBeFinal | 2 | false |
| IgnoreResultOfCall | 2 | false |
| UnnecessaryModifier | 1 | true |
| UnnecessaryToStringCall | 1 | true |
| JavadocDeclaration | 1 | false |
| UnusedAssignment | 1 | false |
| FieldCanBeLocal | 1 | false |
## RuleId[id=CharsetObjectCanBeUsed]
### CharsetObjectCanBeUsed
StandardCharsets.ISO_8859_1 can be used instead
in `src/main/java/org/apache/sling/settings/impl/SlingIdUtil.java`
#### Snippet
```java
        DataOutputStream dos = null;
        try {
            final byte[] rawBytes = id.getBytes("ISO-8859-1");
            dos = new DataOutputStream(new FileOutputStream(idFile));
            dos.write(rawBytes, 0, rawBytes.length);
```

### CharsetObjectCanBeUsed
StandardCharsets.ISO_8859_1 can be used instead
in `src/main/java/org/apache/sling/settings/impl/SlingIdUtil.java`
#### Snippet
```java
                dis = new DataInputStream(new FileInputStream(idFile));
                dis.readFully(rawBytes);
                final String rawString = new String(rawBytes, "ISO-8859-1");

                // roundtrip to ensure correct format of UUID value
```

## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `src/main/java/org/apache/sling/settings/impl/SlingSettingsServiceImpl.java`
#### Snippet
```java
    @ObjectClassDefinition(id = "org.apache.sling.settings.impl.SlingSettingsServiceImpl", name = "Apache Sling Settings Service", 
            description = "The settings service manages some basic settings of Sling like run modes or information about the current instance.")
    static @interface Configuration {
        @AttributeDefinition(name = "Instance Name", description = "A human readable name for the current instance.")
        String sling_name();
```

## RuleId[id=IOStreamConstructor]
### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `src/main/java/org/apache/sling/settings/impl/SlingIdUtil.java`
#### Snippet
```java
        try {
            final byte[] rawBytes = id.getBytes("ISO-8859-1");
            dos = new DataOutputStream(new FileOutputStream(idFile));
            dos.write(rawBytes, 0, rawBytes.length);
            dos.flush();
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `src/main/java/org/apache/sling/settings/impl/SlingIdUtil.java`
#### Snippet
```java
            try {
                final byte[] rawBytes = new byte[SLING_ID_LENGTH];
                dis = new DataInputStream(new FileInputStream(idFile));
                dis.readFully(rawBytes);
                final String rawString = new String(rawBytes, "ISO-8859-1");
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `org.apache.felix.webconsole.ConfigurationPrinter`
in `src/main/java/org/apache/sling/settings/impl/SlingSettingsPrinter.java`
#### Snippet
```java
    /**
     * Print out the servlet filter chains.
     * @see org.apache.felix.webconsole.ConfigurationPrinter#printConfiguration(java.io.PrintWriter)
     */
    public void printConfiguration(PrintWriter pw) {
```

### JavadocReference
Cannot resolve symbol `org.apache.felix.shell.Command`
in `src/main/java/org/apache/sling/settings/impl/RunModeCommand.java`
#### Snippet
```java

    /**
     * @see org.apache.felix.shell.Command#execute(java.lang.String, java.io.PrintStream, java.io.PrintStream)
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `printConfiguration(java.io.PrintWriter)`
in `src/main/java/org/apache/sling/settings/impl/SlingSettingsPrinter.java`
#### Snippet
```java
    /**
     * Print out the servlet filter chains.
     * @see org.apache.felix.webconsole.ConfigurationPrinter#printConfiguration(java.io.PrintWriter)
     */
    public void printConfiguration(PrintWriter pw) {
```

### JavadocReference
Cannot resolve symbol `execute(java.lang.String, java.io.PrintStream, java.io.PrintStream)`
in `src/main/java/org/apache/sling/settings/impl/RunModeCommand.java`
#### Snippet
```java

    /**
     * @see org.apache.felix.shell.Command#execute(java.lang.String, java.io.PrintStream, java.io.PrintStream)
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.apache.felix.shell.Command`
in `src/main/java/org/apache/sling/settings/impl/RunModeCommand.java`
#### Snippet
```java

    /**
     * @see org.apache.felix.shell.Command#getShortDescription()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `getShortDescription()`
in `src/main/java/org/apache/sling/settings/impl/RunModeCommand.java`
#### Snippet
```java

    /**
     * @see org.apache.felix.shell.Command#getShortDescription()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.apache.felix.shell.Command`
in `src/main/java/org/apache/sling/settings/impl/RunModeCommand.java`
#### Snippet
```java

    /**
     * @see org.apache.felix.shell.Command#getUsage()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `getUsage()`
in `src/main/java/org/apache/sling/settings/impl/RunModeCommand.java`
#### Snippet
```java

    /**
     * @see org.apache.felix.shell.Command#getUsage()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.apache.felix.shell.Command`
in `src/main/java/org/apache/sling/settings/impl/RunModeCommand.java`
#### Snippet
```java

    /**
     * @see org.apache.felix.shell.Command#getName()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `getName()`
in `src/main/java/org/apache/sling/settings/impl/RunModeCommand.java`
#### Snippet
```java

    /**
     * @see org.apache.felix.shell.Command#getName()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.apache.felix.webconsole.ModeAwareConfigurationPrinter`
in `src/main/java/org/apache/sling/settings/impl/SlingPropertiesPrinter.java`
#### Snippet
```java

    /**
     * @see org.apache.felix.webconsole.ModeAwareConfigurationPrinter#printConfiguration(java.io.PrintWriter, java.lang.String)
     */
    public void printConfiguration(PrintWriter printWriter, String mode) {
```

### JavadocReference
Cannot resolve symbol `printConfiguration(java.io.PrintWriter, java.lang.String)`
in `src/main/java/org/apache/sling/settings/impl/SlingPropertiesPrinter.java`
#### Snippet
```java

    /**
     * @see org.apache.felix.webconsole.ModeAwareConfigurationPrinter#printConfiguration(java.io.PrintWriter, java.lang.String)
     */
    public void printConfiguration(PrintWriter printWriter, String mode) {
```

### JavadocReference
Cannot resolve symbol `org.apache.felix.webconsole.ConfigurationPrinter`
in `src/main/java/org/apache/sling/settings/impl/SlingPropertiesPrinter.java`
#### Snippet
```java
    /**
     * Print out the servlet filter chains.
     * @see org.apache.felix.webconsole.ConfigurationPrinter#printConfiguration(java.io.PrintWriter)
     */
    public void printConfiguration(PrintWriter pw) {
```

### JavadocReference
Cannot resolve symbol `printConfiguration(java.io.PrintWriter)`
in `src/main/java/org/apache/sling/settings/impl/SlingPropertiesPrinter.java`
#### Snippet
```java
    /**
     * Print out the servlet filter chains.
     * @see org.apache.felix.webconsole.ConfigurationPrinter#printConfiguration(java.io.PrintWriter)
     */
    public void printConfiguration(PrintWriter pw) {
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/sling/settings/impl/SlingPropertiesPrinter.java`
#### Snippet
```java
            final Object value = props.get(key);
            if ( value != null ) {
                pw.print(value.toString());
            }
            pw.println();
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@param runModes` tag description is missing
in `src/main/java/org/apache/sling/settings/impl/SlingSettingsServiceImpl.java`
#### Snippet
```java
    /**
     * Constructor only to be used from tests
     * @param runModes
     */
    public SlingSettingsServiceImpl(String runModes) {
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `contents` initializer `null` is redundant
in `src/main/java/org/apache/sling/settings/impl/SlingPropertiesPrinter.java`
#### Snippet
```java
        } else {
            // write into byte array first
            String contents = null;
            try {
                final ByteArrayOutputStream baos = new ByteArrayOutputStream();
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `HEADLINE` may be 'final'
in `src/main/java/org/apache/sling/settings/impl/SlingSettingsPrinter.java`
#### Snippet
```java
public class SlingSettingsPrinter {

    private static String HEADLINE = "Apache Sling Settings";

    private final SlingSettingsService settings;
```

### FieldMayBeFinal
Field `HEADLINE` may be 'final'
in `src/main/java/org/apache/sling/settings/impl/SlingPropertiesPrinter.java`
#### Snippet
```java


    private static String HEADLINE = "Apache Sling Launchpad Properties";

    private final Properties props;
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/org/apache/sling/settings/impl/SlingSettingsPrinter.java`
#### Snippet
```java
public class SlingSettingsPrinter {

    private static String HEADLINE = "Apache Sling Settings";

    private final SlingSettingsService settings;
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `src/main/java/org/apache/sling/settings/impl/SlingIdUtil.java`
#### Snippet
```java
     */
    public static void writeSlingId(final File idFile, final String id) throws IOException {
        idFile.delete();
        idFile.getParentFile().mkdirs();
        DataOutputStream dos = null;
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `src/main/java/org/apache/sling/settings/impl/SlingIdUtil.java`
#### Snippet
```java
    public static void writeSlingId(final File idFile, final String id) throws IOException {
        idFile.delete();
        idFile.getParentFile().mkdirs();
        DataOutputStream dos = null;
        try {
```

