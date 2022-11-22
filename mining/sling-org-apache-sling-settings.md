# sling-org-apache-sling-settings 
 
# Bad smells
I found 35 bad smells with 5 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| RuleId[ruleID=UnnecessaryFullyQualifiedName] | 19 | false |
| RuleId[ruleID=SizeReplaceableByIsEmpty] | 3 | true |
| RuleId[ruleID=CharsetObjectCanBeUsed] | 2 | false |
| RuleId[ruleID=IgnoreResultOfCall] | 2 | false |
| RuleId[ruleID=UseOfPropertiesAsHashtable] | 2 | false |
| RuleId[ruleID=UnnecessaryModifier] | 1 | true |
| RuleId[ruleID=ReturnNull] | 1 | false |
| RuleId[ruleID=UtilityClassWithoutPrivateConstructor] | 1 | false |
| RuleId[ruleID=UnnecessaryToStringCall] | 1 | true |
| RuleId[ruleID=BoundedWildcard] | 1 | false |
| RuleId[ruleID=UnusedAssignment] | 1 | false |
| RuleId[ruleID=ObsoleteCollection] | 1 | false |
## RuleId[ruleID=CharsetObjectCanBeUsed]
### RuleId[ruleID=CharsetObjectCanBeUsed]
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

### RuleId[ruleID=CharsetObjectCanBeUsed]
StandardCharsets.ISO_8859_1 can be used instead
in `src/main/java/org/apache/sling/settings/impl/SlingIdUtil.java`
#### Snippet
```java
                dis = new DataInputStream(new FileInputStream(idFile));
                dis.readFully(rawBytes);
                final String rawString = new String(rawBytes, "ISO-8859-1");

                // roundtrip to ensure correct format of UUID value
```

## RuleId[ruleID=UnnecessaryModifier]
### RuleId[ruleID=UnnecessaryModifier]
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

## RuleId[ruleID=ReturnNull]
### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/sling/settings/impl/SlingIdUtil.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

## RuleId[ruleID=SizeReplaceableByIsEmpty]
### RuleId[ruleID=SizeReplaceableByIsEmpty]
`propOptions.trim().length() > 0` can be replaced with '!propOptions.trim().isEmpty()'
in `src/main/java/org/apache/sling/settings/impl/SlingSettingsServiceImpl.java`
#### Snippet
```java
    private List<Options> handleOptions(final Set<String> modesSet, final String propOptions) {
        final List<Options> optionsList = new ArrayList<Options>();
        if (propOptions != null && propOptions.trim().length() > 0) {

            final String[] options = propOptions.trim().split("\\|");
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`prop.trim().length() > 0` can be replaced with '!prop.trim().isEmpty()'
in `src/main/java/org/apache/sling/settings/impl/SlingSettingsServiceImpl.java`
#### Snippet
```java
        // check configuration property first
        final String prop = context.getProperty(RUN_MODES_PROPERTY);
        if (prop != null && prop.trim().length() > 0) {
            modesSet = parseRunModes(prop);
        } else {
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`this.runModes.size() > 0` can be replaced with '!this.runModes.isEmpty()'
in `src/main/java/org/apache/sling/settings/impl/SlingSettingsServiceImpl.java`
#### Snippet
```java
        // we probably don't need a synced set as it is read only
        this.runModes = Collections.synchronizedSet(Collections.unmodifiableSet(modesSet));
        if (this.runModes.size() > 0) {
            logger.info("Active run modes: {}", this.runModes);
        } else {
```

## RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `SlingIdUtil` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/sling/settings/impl/SlingIdUtil.java`
#### Snippet
```java
import java.util.UUID;

public class SlingIdUtil {

    /**
```

## RuleId[ruleID=UnnecessaryFullyQualifiedName]
### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.osgi.annotation.versioning` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/sling/settings/package-info.java`
#### Snippet
```java
 * under the License.
 */
@org.osgi.annotation.versioning.Version("1.4.0")
package org.apache.sling.settings;

```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/sling/settings/impl/SlingSettingsPrinter.java`
#### Snippet
```java
    /**
     * Print out the servlet filter chains.
     * @see org.apache.felix.webconsole.ConfigurationPrinter#printConfiguration(java.io.PrintWriter)
     */
    public void printConfiguration(PrintWriter pw) {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.apache.felix.shell` is unnecessary and can be removed
in `src/main/java/org/apache/sling/settings/impl/RunModeCommand.java`
#### Snippet
```java

    /**
     * @see org.apache.felix.shell.Command#getName()
     */
    @Override
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.apache.felix.shell` is unnecessary and can be removed
in `src/main/java/org/apache/sling/settings/impl/RunModeCommand.java`
#### Snippet
```java

    /**
     * @see org.apache.felix.shell.Command#getUsage()
     */
    @Override
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.apache.felix.shell` is unnecessary and can be removed
in `src/main/java/org/apache/sling/settings/impl/RunModeCommand.java`
#### Snippet
```java

    /**
     * @see org.apache.felix.shell.Command#getShortDescription()
     */
    @Override
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.apache.felix.shell` is unnecessary and can be removed
in `src/main/java/org/apache/sling/settings/impl/RunModeCommand.java`
#### Snippet
```java

    /**
     * @see org.apache.felix.shell.Command#execute(java.lang.String, java.io.PrintStream, java.io.PrintStream)
     */
    @Override
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/sling/settings/impl/RunModeCommand.java`
#### Snippet
```java

    /**
     * @see org.apache.felix.shell.Command#execute(java.lang.String, java.io.PrintStream, java.io.PrintStream)
     */
    @Override
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/sling/settings/impl/RunModeCommand.java`
#### Snippet
```java

    /**
     * @see org.apache.felix.shell.Command#execute(java.lang.String, java.io.PrintStream, java.io.PrintStream)
     */
    @Override
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/sling/settings/impl/RunModeCommand.java`
#### Snippet
```java

    /**
     * @see org.apache.felix.shell.Command#execute(java.lang.String, java.io.PrintStream, java.io.PrintStream)
     */
    @Override
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.apache.sling.settings` is unnecessary and can be removed
in `src/main/java/org/apache/sling/settings/impl/SlingSettingsServiceImpl.java`
#### Snippet
```java
    }

    /** @see org.apache.sling.settings.SlingSettingsService#getRunModes() */
    @Override
    public Set<String> getRunModes() {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.apache.sling.settings` is unnecessary and can be removed
in `src/main/java/org/apache/sling/settings/impl/SlingSettingsServiceImpl.java`
#### Snippet
```java
    }

    /** @see org.apache.sling.settings.SlingSettingsService#getSlingHome() */
    @Override
    public URL getSlingHome() {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.apache.sling.settings` is unnecessary and can be removed
in `src/main/java/org/apache/sling/settings/impl/SlingSettingsServiceImpl.java`
#### Snippet
```java
    }

    /** @see org.apache.sling.settings.SlingSettingsService#getSlingHomePath() */
    @Override
    public String getSlingHomePath() {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.apache.sling.settings` is unnecessary and can be removed
in `src/main/java/org/apache/sling/settings/impl/SlingSettingsServiceImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.settings.SlingSettingsService#getSlingName()
     */
    @Override
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.apache.sling.settings` is unnecessary and can be removed
in `src/main/java/org/apache/sling/settings/impl/SlingSettingsServiceImpl.java`
#### Snippet
```java
    }

    /** @see org.apache.sling.settings.SlingSettingsService#getAbsolutePathWithinSlingHome(String) */
    @Override
    public String getAbsolutePathWithinSlingHome(final String relativePath) {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.apache.sling.settings` is unnecessary and can be removed
in `src/main/java/org/apache/sling/settings/impl/SlingSettingsServiceImpl.java`
#### Snippet
```java
    }

    /** @see org.apache.sling.settings.SlingSettingsService#getSlingDescription() */
    @Override
    public String getSlingDescription() {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.apache.sling.settings` is unnecessary and can be removed
in `src/main/java/org/apache/sling/settings/impl/SlingSettingsServiceImpl.java`
#### Snippet
```java
    }

    /** @see org.apache.sling.settings.SlingSettingsService#getSlingId() */
    @Override
    public String getSlingId() {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/sling/settings/impl/SlingPropertiesPrinter.java`
#### Snippet
```java

    /**
     * @see org.apache.felix.webconsole.ModeAwareConfigurationPrinter#printConfiguration(java.io.PrintWriter, java.lang.String)
     */
    public void printConfiguration(PrintWriter printWriter, String mode) {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/sling/settings/impl/SlingPropertiesPrinter.java`
#### Snippet
```java

    /**
     * @see org.apache.felix.webconsole.ModeAwareConfigurationPrinter#printConfiguration(java.io.PrintWriter, java.lang.String)
     */
    public void printConfiguration(PrintWriter printWriter, String mode) {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/sling/settings/impl/SlingPropertiesPrinter.java`
#### Snippet
```java
    /**
     * Print out the servlet filter chains.
     * @see org.apache.felix.webconsole.ConfigurationPrinter#printConfiguration(java.io.PrintWriter)
     */
    public void printConfiguration(PrintWriter pw) {
```

## RuleId[ruleID=UnnecessaryToStringCall]
### RuleId[ruleID=UnnecessaryToStringCall]
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

## RuleId[ruleID=BoundedWildcard]
### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `src/main/java/org/apache/sling/settings/impl/SlingSettingsServiceImpl.java`
#### Snippet
```java
    }

    private List<Options> handleOptions(final Set<String> modesSet, final String propOptions) {
        final List<Options> optionsList = new ArrayList<Options>();
        if (propOptions != null && propOptions.trim().length() > 0) {
```

## RuleId[ruleID=UnusedAssignment]
### RuleId[ruleID=UnusedAssignment]
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

## RuleId[ruleID=ObsoleteCollection]
### RuleId[ruleID=ObsoleteCollection]
Obsolete collection type `Hashtable<>` used
in `src/main/java/org/apache/sling/settings/impl/SlingPropertiesPrinter.java`
#### Snippet
```java
        }
        final SlingPropertiesPrinter propertiesPrinter = new SlingPropertiesPrinter(props);
        final Dictionary<String, String> serviceProps = new Hashtable<>();
        serviceProps.put("felix.webconsole.label", "slingprops");
        serviceProps.put("felix.webconsole.title", "Sling Properties");
```

## RuleId[ruleID=IgnoreResultOfCall]
### RuleId[ruleID=IgnoreResultOfCall]
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

### RuleId[ruleID=IgnoreResultOfCall]
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

## RuleId[ruleID=UseOfPropertiesAsHashtable]
### RuleId[ruleID=UseOfPropertiesAsHashtable]
Call to `Hashtable.get()` on properties object
in `src/main/java/org/apache/sling/settings/impl/SlingPropertiesPrinter.java`
#### Snippet
```java
            pw.print( key );
            pw.print(" = ");
            final Object value = props.get(key);
            if ( value != null ) {
                pw.print(value.toString());
```

### RuleId[ruleID=UseOfPropertiesAsHashtable]
Call to `Hashtable.put()` on properties object
in `src/main/java/org/apache/sling/settings/impl/SlingPropertiesPrinter.java`
#### Snippet
```java
                    final Object value = bundleContext.getProperty(key.toString());
                    if ( value != null ) {
                        tmp.put(key, value);
                    }
                }
```

