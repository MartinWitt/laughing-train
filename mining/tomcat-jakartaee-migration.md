# tomcat-jakartaee-migration 
 
# Bad smells
I found 28 bad smells with 2 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| ReplaceAssignmentWithOperatorAssignment | 3 | false |
| FinalStaticMethod | 3 | false |
| StringEquality | 2 | false |
| UtilityClassWithoutPrivateConstructor | 2 | true |
| DataFlowIssue | 2 | false |
| NestedAssignment | 2 | false |
| NonShortCircuitBoolean | 2 | false |
| UtilityClassWithPublicConstructor | 2 | false |
| SystemOutErr | 1 | false |
| DynamicRegexReplaceableByCompiledPattern | 1 | false |
| UnnecessaryFullyQualifiedName | 1 | false |
| RegExpSingleCharAlternation | 1 | false |
| ObsoleteCollection | 1 | false |
| RedundantFieldInitialization | 1 | false |
| AssignmentToMethodParameter | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| UnusedAssignment | 1 | false |
| UnnecessaryBoxing | 1 | false |
## RuleId[id=StringEquality]
### StringEquality
String values are compared using `!=`, not 'equals()'
in `src/main/java/org/apache/tomcat/jakartaee/TextConverter.java`
#### Snippet
```java
        String destString = profile.convert(srcString);
        // Object comparison is deliberate here
        boolean converted = srcString != destString;

        if (converted) {
```

### StringEquality
String values are compared using `!=`, not 'equals()'
in `src/main/java/org/apache/tomcat/jakartaee/ClassConverter.java`
#### Snippet
```java
                String newString = profile.convert(str);
                // Object comparison is deliberate
                if (newString != str) {
                    if (loader != null) {
                        // Since this is a runtime conversion, the idea is to only convert to
```

## RuleId[id=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/tomcat/jakartaee/MigrationCLI.java`
#### Snippet
```java

    private static void invalidArguments() {
        System.out.println(sm.getString("migration.usage"));
        System.exit(1);
    }
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `MigrationCLI` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/tomcat/jakartaee/MigrationCLI.java`
#### Snippet
```java
 * Command line interface wrapper for the migration tool.
 */
public class MigrationCLI {

    private static final StringManager sm = StringManager.getManager(MigrationCLI.class);
```

### UtilityClassWithoutPrivateConstructor
Class `GlobMatcher` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/tomcat/jakartaee/GlobMatcher.java`
#### Snippet
```java
 * <p>All methods are static.</p>
 */
public final class GlobMatcher {


```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/tomcat/jakartaee/ClassConverter.java`
#### Snippet
```java
                        // Since this is a runtime conversion, the idea is to only convert to
                        // Jakarta EE specification classes that exist in the container
                        String[] split = newString.split(";|<");
                        for (String current : split) {
                            int pos = current.indexOf(profile.getTarget() + "/");
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/org/apache/tomcat/jakartaee/StringManager.java`
#### Snippet
```java
            //      simply return null.  Calling code can then do
            //      a null check.
            str = null;
        }

```

### DataFlowIssue
Dereference of `files` may produce `NullPointerException`
in `src/main/java/org/apache/tomcat/jakartaee/Migration.java`
#### Snippet
```java
        // Won't return null because src is known to be a directory
        String[] files = src.list();
        for (String file : files) {
            File srcFile = new File(src, file);
            File destFile = new File(dest, profile.convert(file));
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `src/main/java/org/apache/tomcat/jakartaee/StringManager.java`
#### Snippet
```java
 * @author James Todd [gonzo@eng.sun.com]
 * @author Mel Martinez [mmartinez@g1440.com]
 * @see java.util.ResourceBundle
 */
public class StringManager {
```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/tomcat/jakartaee/Util.java`
#### Snippet
```java
        byte[] buf = new byte[8192];
        int numRead;
        while ( (numRead = is.read(buf) ) >= 0) {
            os.write(buf, 0, numRead);
        }
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/tomcat/jakartaee/Migration.java`
#### Snippet
```java
            ZipArchiveEntry srcZipEntry;
            CRC32 crc32 = new CRC32();
            while ((srcZipEntry = srcZipStream.getNextZipEntry()) != null) {
                String srcName = srcZipEntry.getName();
                if (isSignatureFile(srcName)) {
```

## RuleId[id=ReplaceAssignmentWithOperatorAssignment]
### ReplaceAssignmentWithOperatorAssignment
`resourceName = resourceName + ".class"` could be simplified to 'resourceName += ".class"'
in `src/main/java/org/apache/tomcat/jakartaee/ClassConverter.java`
#### Snippet
```java
                                    resourceName = resourceName.replace('.', '/');
                                }
                                resourceName = resourceName + ".class";
                                if (loader.getResource(resourceName) == null) {
                                    if (logger.isLoggable(Level.FINE)) {
```

### ReplaceAssignmentWithOperatorAssignment
`converted = converted | updateValues(attributes, profile)` could be simplified to 'converted \|= updateValues(attributes, profile)'
in `src/main/java/org/apache/tomcat/jakartaee/ManifestConverter.java`
#### Snippet
```java
        boolean converted = updateValues(manifest.getMainAttributes(), profile);
        for (Attributes attributes : manifest.getEntries().values()) {
            converted = converted | updateValues(attributes, profile);
        }
        return converted;
```

### ReplaceAssignmentWithOperatorAssignment
`converted = converted | converter.convert(name, src, dest, profile)` could be simplified to 'converted \|= converter.convert(name, src, dest, profile)'
in `src/main/java/org/apache/tomcat/jakartaee/Migration.java`
#### Snippet
```java
            for (Converter converter : converters) {
                if (converter.accepts(name)) {
                    converted = converted | converter.convert(name, src, dest, profile);
                    break;
                }
```

## RuleId[id=RegExpSingleCharAlternation]
### RegExpSingleCharAlternation
Single character alternation in RegExp
in `src/main/java/org/apache/tomcat/jakartaee/ClassConverter.java`
#### Snippet
```java
                        // Since this is a runtime conversion, the idea is to only convert to
                        // Jakarta EE specification classes that exist in the container
                        String[] split = newString.split(";|<");
                        for (String current : split) {
                            int pos = current.indexOf(profile.getTarget() + "/");
```

## RuleId[id=ObsoleteCollection]
### ObsoleteCollection
Obsolete collection type `Hashtable<>` used
in `src/main/java/org/apache/tomcat/jakartaee/StringManager.java`
#### Snippet
```java

    private static final Map<String, Map<Locale,StringManager>> managers =
            new Hashtable<>();


```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/tomcat/jakartaee/MigrationTask.java`
#### Snippet
```java
    private File dest;
    private String profile = EESpecProfiles.TOMCAT.toString();
    private boolean zipInMemory = false;
    private String excludes;
    private boolean matchExcludesAgainstPathName;
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `locale`
in `src/main/java/org/apache/tomcat/jakartaee/StringManager.java`
#### Snippet
```java
            // available for the system default locale.
            if (locale.getLanguage().equals(Locale.ENGLISH.getLanguage())) {
                locale = Locale.ROOT;
            }
            bnd = ResourceBundle.getBundle(bundleName, locale);
```

## RuleId[id=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-04-26-15-52-50.693.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[id=NonShortCircuitBoolean]
### NonShortCircuitBoolean
Non-short-circuit boolean expression `converted | updateValues(attributes, profile)`
in `src/main/java/org/apache/tomcat/jakartaee/ManifestConverter.java`
#### Snippet
```java
        boolean converted = updateValues(manifest.getMainAttributes(), profile);
        for (Attributes attributes : manifest.getEntries().values()) {
            converted = converted | updateValues(attributes, profile);
        }
        return converted;
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `converted | converter.convert(name, src, dest, profile)`
in `src/main/java/org/apache/tomcat/jakartaee/Migration.java`
#### Snippet
```java
            for (Converter converter : converters) {
                if (converter.accepts(name)) {
                    converted = converted | converter.convert(name, src, dest, profile);
                    break;
                }
```

## RuleId[id=FinalStaticMethod]
### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/tomcat/jakartaee/StringManager.java`
#### Snippet
```java
     *         Locale
     */
    public static final StringManager getManager(String packageName) {
        return getManager(packageName, Locale.getDefault());
    }
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/tomcat/jakartaee/StringManager.java`
#### Snippet
```java
     * @return The instance associated with the package of the provide class
     */
    public static final StringManager getManager(Class<?> clazz) {
        return getManager(clazz.getPackage().getName());
    }
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/tomcat/jakartaee/StringManager.java`
#### Snippet
```java
     * @return The instance associated with the given package and Locale
     */
    public static final synchronized StringManager getManager(
            String packageName, Locale locale) {

```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `profile` initializer `null` is redundant
in `src/main/java/org/apache/tomcat/jakartaee/MigrationTask.java`
#### Snippet
```java

        // check the parameters
        EESpecProfile profile = null;
        try {
            profile = EESpecProfiles.valueOf(this.profile.toUpperCase());
```

## RuleId[id=UtilityClassWithPublicConstructor]
### UtilityClassWithPublicConstructor
Class `MigrationCLI` has only 'static' members, and a 'public' constructor
in `src/main/java/org/apache/tomcat/jakartaee/MigrationCLI.java`
#### Snippet
```java
 * Command line interface wrapper for the migration tool.
 */
public class MigrationCLI {

    private static final StringManager sm = StringManager.getManager(MigrationCLI.class);
```

### UtilityClassWithPublicConstructor
Class `GlobMatcher` has only 'static' members, and a 'public' constructor
in `src/main/java/org/apache/tomcat/jakartaee/GlobMatcher.java`
#### Snippet
```java
 * <p>All methods are static.</p>
 */
public final class GlobMatcher {


```

## RuleId[id=UnnecessaryBoxing]
### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/tomcat/jakartaee/Migration.java`
#### Snippet
```java
        state = State.COMPLETE;
        logger.log(Level.INFO, sm.getString("migration.done",
                Long.valueOf(TimeUnit.MILLISECONDS.convert(System.nanoTime() - t1, TimeUnit.NANOSECONDS))));
    }

```

