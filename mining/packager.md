# packager 
 
# Bad smells
I found 217 bad smells with 128 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryModifier | 118 | true |
| OptionalUsedAsFieldOrParameterType | 15 | false |
| TrivialStringConcatenation | 11 | false |
| OctalLiteral | 8 | false |
| UnusedAssignment | 7 | false |
| TrivialIf | 6 | false |
| IOStreamConstructor | 5 | false |
| JavadocDeclaration | 5 | false |
| UnstableApiUsage | 5 | false |
| JavadocLinkAsPlainText | 4 | false |
| ToArrayCallWithZeroLengthArrayArgument | 3 | true |
| UnnecessaryToStringCall | 3 | true |
| IgnoreResultOfCall | 3 | false |
| ConstantValue | 3 | false |
| UnnecessarySemicolon | 2 | false |
| StringBufferReplaceableByString | 2 | false |
| PointlessBitwiseExpression | 2 | false |
| DuplicateThrows | 2 | false |
| StringOperationCanBeSimplified | 1 | false |
| CStyleArrayDeclaration | 1 | false |
| RedundantArrayCreation | 1 | true |
| DuplicateBranchesInSwitch | 1 | false |
| NonFinalFieldInEnum | 1 | false |
| InnerClassMayBeStatic | 1 | true |
| FieldCanBeLocal | 1 | false |
| CharsetObjectCanBeUsed | 1 | false |
| ConditionCoveredByFurtherCondition | 1 | false |
| RedundantCast | 1 | false |
| FieldMayBeFinal | 1 | false |
| UnnecessaryLocalVariable | 1 | true |
| PointlessBooleanExpression | 1 | true |
## RuleId[id=ToArrayCallWithZeroLengthArrayArgument]
### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[segments.size()\]'
in `rpm/src/main/java/org/eclipse/packager/rpm/PathName.java`
#### Snippet
```java
        Objects.requireNonNull(segments);

        this.segments = segments.toArray(new String[segments.size()]);
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new OutputStream\[streams.size()\]'
in `core/src/main/java/org/eclipse/packager/io/OutputSpooler.java`
#### Snippet
```java

        public MultiplexStream(final List<OutputStream> streams) {
            this.streams = streams.toArray(new OutputStream[streams.size()]);
        }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new FileEntry\[this.files.size()\]'
in `rpm/src/main/java/org/eclipse/packager/rpm/build/RpmBuilder.java`
#### Snippet
```java
            }

            final FileEntry[] files = this.files.values().toArray(new FileEntry[this.files.size()]);
            Arrays.sort(files, comparing(FileEntry::getTargetName));

```

## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `rpm/src/main/java/org/eclipse/packager/rpm/build/SimpleFileInformationCustomizer.java`
#### Snippet
```java
@FunctionalInterface
public interface SimpleFileInformationCustomizer {
    public void perform(FileInformation information) throws IOException;
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `deb/src/main/java/org/eclipse/packager/deb/control/BinaryPackageControlFile.java`
#### Snippet
```java
        public static final String DESCRIPTION = "Description"; //$NON-NLS-1$

        public static final String MAINTAINER = "Maintainer"; //$NON-NLS-1$

        public static final String INSTALLED_SIZE = "Installed-Size"; //$NON-NLS-1$
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `deb/src/main/java/org/eclipse/packager/deb/control/BinaryPackageControlFile.java`
#### Snippet
```java
        public static final String DESCRIPTION = "Description"; //$NON-NLS-1$

        public static final String MAINTAINER = "Maintainer"; //$NON-NLS-1$

        public static final String INSTALLED_SIZE = "Installed-Size"; //$NON-NLS-1$
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `deb/src/main/java/org/eclipse/packager/deb/control/BinaryPackageControlFile.java`
#### Snippet
```java
        public static final String DESCRIPTION = "Description"; //$NON-NLS-1$

        public static final String MAINTAINER = "Maintainer"; //$NON-NLS-1$

        public static final String INSTALLED_SIZE = "Installed-Size"; //$NON-NLS-1$
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `deb/src/main/java/org/eclipse/packager/deb/control/BinaryPackageControlFile.java`
#### Snippet
```java
        public static final String ESSENTIAL = "Essential"; //$NON-NLS-1$

        public static final String DESCRIPTION = "Description"; //$NON-NLS-1$

        public static final String MAINTAINER = "Maintainer"; //$NON-NLS-1$
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `deb/src/main/java/org/eclipse/packager/deb/control/BinaryPackageControlFile.java`
#### Snippet
```java
        public static final String ESSENTIAL = "Essential"; //$NON-NLS-1$

        public static final String DESCRIPTION = "Description"; //$NON-NLS-1$

        public static final String MAINTAINER = "Maintainer"; //$NON-NLS-1$
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `deb/src/main/java/org/eclipse/packager/deb/control/BinaryPackageControlFile.java`
#### Snippet
```java
        public static final String ESSENTIAL = "Essential"; //$NON-NLS-1$

        public static final String DESCRIPTION = "Description"; //$NON-NLS-1$

        public static final String MAINTAINER = "Maintainer"; //$NON-NLS-1$
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `deb/src/main/java/org/eclipse/packager/deb/control/BinaryPackageControlFile.java`
#### Snippet
```java
        public static final String DEPENDS = "Depends"; //$NON-NLS-1$

        public static final String PRE_DEPENDS = "Pre-Depends"; //$NON-NLS-1$
    }

```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `deb/src/main/java/org/eclipse/packager/deb/control/BinaryPackageControlFile.java`
#### Snippet
```java
        public static final String DEPENDS = "Depends"; //$NON-NLS-1$

        public static final String PRE_DEPENDS = "Pre-Depends"; //$NON-NLS-1$
    }

```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `deb/src/main/java/org/eclipse/packager/deb/control/BinaryPackageControlFile.java`
#### Snippet
```java
        public static final String DEPENDS = "Depends"; //$NON-NLS-1$

        public static final String PRE_DEPENDS = "Pre-Depends"; //$NON-NLS-1$
    }

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `deb/src/main/java/org/eclipse/packager/deb/control/BinaryPackageControlFile.java`
#### Snippet
```java
        public static final String VERSION = "Version"; //$NON-NLS-1$

        public static final String ARCHITECTURE = "Architecture"; //$NON-NLS-1$

        public static final String SECTION = "Section"; //$NON-NLS-1$
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `deb/src/main/java/org/eclipse/packager/deb/control/BinaryPackageControlFile.java`
#### Snippet
```java
        public static final String VERSION = "Version"; //$NON-NLS-1$

        public static final String ARCHITECTURE = "Architecture"; //$NON-NLS-1$

        public static final String SECTION = "Section"; //$NON-NLS-1$
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `deb/src/main/java/org/eclipse/packager/deb/control/BinaryPackageControlFile.java`
#### Snippet
```java
        public static final String VERSION = "Version"; //$NON-NLS-1$

        public static final String ARCHITECTURE = "Architecture"; //$NON-NLS-1$

        public static final String SECTION = "Section"; //$NON-NLS-1$
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `deb/src/main/java/org/eclipse/packager/deb/control/BinaryPackageControlFile.java`
#### Snippet
```java
        public static final String INSTALLED_SIZE = "Installed-Size"; //$NON-NLS-1$

        public static final String CONFLICTS = "Conflicts"; //$NON-NLS-1$

        public static final String DEPENDS = "Depends"; //$NON-NLS-1$
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `deb/src/main/java/org/eclipse/packager/deb/control/BinaryPackageControlFile.java`
#### Snippet
```java
        public static final String INSTALLED_SIZE = "Installed-Size"; //$NON-NLS-1$

        public static final String CONFLICTS = "Conflicts"; //$NON-NLS-1$

        public static final String DEPENDS = "Depends"; //$NON-NLS-1$
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `deb/src/main/java/org/eclipse/packager/deb/control/BinaryPackageControlFile.java`
#### Snippet
```java
        public static final String INSTALLED_SIZE = "Installed-Size"; //$NON-NLS-1$

        public static final String CONFLICTS = "Conflicts"; //$NON-NLS-1$

        public static final String DEPENDS = "Depends"; //$NON-NLS-1$
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `deb/src/main/java/org/eclipse/packager/deb/control/BinaryPackageControlFile.java`
#### Snippet
```java
        public static final String SECTION = "Section"; //$NON-NLS-1$

        public static final String PRIORITY = "Priority"; //$NON-NLS-1$

        public static final String ESSENTIAL = "Essential"; //$NON-NLS-1$
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `deb/src/main/java/org/eclipse/packager/deb/control/BinaryPackageControlFile.java`
#### Snippet
```java
        public static final String SECTION = "Section"; //$NON-NLS-1$

        public static final String PRIORITY = "Priority"; //$NON-NLS-1$

        public static final String ESSENTIAL = "Essential"; //$NON-NLS-1$
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `deb/src/main/java/org/eclipse/packager/deb/control/BinaryPackageControlFile.java`
#### Snippet
```java
        public static final String SECTION = "Section"; //$NON-NLS-1$

        public static final String PRIORITY = "Priority"; //$NON-NLS-1$

        public static final String ESSENTIAL = "Essential"; //$NON-NLS-1$
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `deb/src/main/java/org/eclipse/packager/deb/control/BinaryPackageControlFile.java`
#### Snippet
```java
        public static final String CONFLICTS = "Conflicts"; //$NON-NLS-1$

        public static final String DEPENDS = "Depends"; //$NON-NLS-1$

        public static final String PRE_DEPENDS = "Pre-Depends"; //$NON-NLS-1$
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `deb/src/main/java/org/eclipse/packager/deb/control/BinaryPackageControlFile.java`
#### Snippet
```java
        public static final String CONFLICTS = "Conflicts"; //$NON-NLS-1$

        public static final String DEPENDS = "Depends"; //$NON-NLS-1$

        public static final String PRE_DEPENDS = "Pre-Depends"; //$NON-NLS-1$
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `deb/src/main/java/org/eclipse/packager/deb/control/BinaryPackageControlFile.java`
#### Snippet
```java
        public static final String CONFLICTS = "Conflicts"; //$NON-NLS-1$

        public static final String DEPENDS = "Depends"; //$NON-NLS-1$

        public static final String PRE_DEPENDS = "Pre-Depends"; //$NON-NLS-1$
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `deb/src/main/java/org/eclipse/packager/deb/control/BinaryPackageControlFile.java`
#### Snippet
```java
        public static final String MAINTAINER = "Maintainer"; //$NON-NLS-1$

        public static final String INSTALLED_SIZE = "Installed-Size"; //$NON-NLS-1$

        public static final String CONFLICTS = "Conflicts"; //$NON-NLS-1$
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `deb/src/main/java/org/eclipse/packager/deb/control/BinaryPackageControlFile.java`
#### Snippet
```java
        public static final String MAINTAINER = "Maintainer"; //$NON-NLS-1$

        public static final String INSTALLED_SIZE = "Installed-Size"; //$NON-NLS-1$

        public static final String CONFLICTS = "Conflicts"; //$NON-NLS-1$
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `deb/src/main/java/org/eclipse/packager/deb/control/BinaryPackageControlFile.java`
#### Snippet
```java
        public static final String MAINTAINER = "Maintainer"; //$NON-NLS-1$

        public static final String INSTALLED_SIZE = "Installed-Size"; //$NON-NLS-1$

        public static final String CONFLICTS = "Conflicts"; //$NON-NLS-1$
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `deb/src/main/java/org/eclipse/packager/deb/control/BinaryPackageControlFile.java`
#### Snippet
```java
        public static final String ARCHITECTURE = "Architecture"; //$NON-NLS-1$

        public static final String SECTION = "Section"; //$NON-NLS-1$

        public static final String PRIORITY = "Priority"; //$NON-NLS-1$
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `deb/src/main/java/org/eclipse/packager/deb/control/BinaryPackageControlFile.java`
#### Snippet
```java
        public static final String ARCHITECTURE = "Architecture"; //$NON-NLS-1$

        public static final String SECTION = "Section"; //$NON-NLS-1$

        public static final String PRIORITY = "Priority"; //$NON-NLS-1$
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `deb/src/main/java/org/eclipse/packager/deb/control/BinaryPackageControlFile.java`
#### Snippet
```java
        public static final String ARCHITECTURE = "Architecture"; //$NON-NLS-1$

        public static final String SECTION = "Section"; //$NON-NLS-1$

        public static final String PRIORITY = "Priority"; //$NON-NLS-1$
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `deb/src/main/java/org/eclipse/packager/deb/control/BinaryPackageControlFile.java`
#### Snippet
```java
        public static final String PACKAGE = "Package"; //$NON-NLS-1$

        public static final String VERSION = "Version"; //$NON-NLS-1$

        public static final String ARCHITECTURE = "Architecture"; //$NON-NLS-1$
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `deb/src/main/java/org/eclipse/packager/deb/control/BinaryPackageControlFile.java`
#### Snippet
```java
        public static final String PACKAGE = "Package"; //$NON-NLS-1$

        public static final String VERSION = "Version"; //$NON-NLS-1$

        public static final String ARCHITECTURE = "Architecture"; //$NON-NLS-1$
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `deb/src/main/java/org/eclipse/packager/deb/control/BinaryPackageControlFile.java`
#### Snippet
```java
        public static final String PACKAGE = "Package"; //$NON-NLS-1$

        public static final String VERSION = "Version"; //$NON-NLS-1$

        public static final String ARCHITECTURE = "Architecture"; //$NON-NLS-1$
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `deb/src/main/java/org/eclipse/packager/deb/control/BinaryPackageControlFile.java`
#### Snippet
```java

    public interface Fields {
        public static final String PACKAGE = "Package"; //$NON-NLS-1$

        public static final String VERSION = "Version"; //$NON-NLS-1$
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `deb/src/main/java/org/eclipse/packager/deb/control/BinaryPackageControlFile.java`
#### Snippet
```java

    public interface Fields {
        public static final String PACKAGE = "Package"; //$NON-NLS-1$

        public static final String VERSION = "Version"; //$NON-NLS-1$
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `deb/src/main/java/org/eclipse/packager/deb/control/BinaryPackageControlFile.java`
#### Snippet
```java

    public interface Fields {
        public static final String PACKAGE = "Package"; //$NON-NLS-1$

        public static final String VERSION = "Version"; //$NON-NLS-1$
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `deb/src/main/java/org/eclipse/packager/deb/control/BinaryPackageControlFile.java`
#### Snippet
```java
        public static final String PRIORITY = "Priority"; //$NON-NLS-1$

        public static final String ESSENTIAL = "Essential"; //$NON-NLS-1$

        public static final String DESCRIPTION = "Description"; //$NON-NLS-1$
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `deb/src/main/java/org/eclipse/packager/deb/control/BinaryPackageControlFile.java`
#### Snippet
```java
        public static final String PRIORITY = "Priority"; //$NON-NLS-1$

        public static final String ESSENTIAL = "Essential"; //$NON-NLS-1$

        public static final String DESCRIPTION = "Description"; //$NON-NLS-1$
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `deb/src/main/java/org/eclipse/packager/deb/control/BinaryPackageControlFile.java`
#### Snippet
```java
        public static final String PRIORITY = "Priority"; //$NON-NLS-1$

        public static final String ESSENTIAL = "Essential"; //$NON-NLS-1$

        public static final String DESCRIPTION = "Description"; //$NON-NLS-1$
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `rpm/src/main/java/org/eclipse/packager/rpm/ReadableHeader.java`
#### Snippet
```java
     * @return the optional value
     */
    public Optional<Object> getValue(T tag);
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `rpm/src/main/java/org/eclipse/packager/rpm/build/RpmFileNameProvider.java`
#### Snippet
```java
@FunctionalInterface
public interface RpmFileNameProvider {
    public String getRpmFileName(String name, RpmVersion version, String architecture);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `rpm/src/main/java/org/eclipse/packager/rpm/build/RpmFileNameProvider.java`
#### Snippet
```java
     * </p>
     */
    public static final RpmFileNameProvider LEGACY_FILENAME_PROVIDER = (name, version, architecture) -> {
        final StringBuilder sb = new StringBuilder(RpmLead.toLeadName(name, version));
        sb.append('-').append(architecture).append(".rpm");
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `rpm/src/main/java/org/eclipse/packager/rpm/build/RpmFileNameProvider.java`
#### Snippet
```java
     * </p>
     */
    public static final RpmFileNameProvider LEGACY_FILENAME_PROVIDER = (name, version, architecture) -> {
        final StringBuilder sb = new StringBuilder(RpmLead.toLeadName(name, version));
        sb.append('-').append(architecture).append(".rpm");
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `rpm/src/main/java/org/eclipse/packager/rpm/build/RpmFileNameProvider.java`
#### Snippet
```java
     * </p>
     */
    public static final RpmFileNameProvider LEGACY_FILENAME_PROVIDER = (name, version, architecture) -> {
        final StringBuilder sb = new StringBuilder(RpmLead.toLeadName(name, version));
        sb.append('-').append(architecture).append(".rpm");
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `rpm/src/main/java/org/eclipse/packager/rpm/build/RpmFileNameProvider.java`
#### Snippet
```java
     * </p>
     */
    public static final RpmFileNameProvider DEFAULT_FILENAME_PROVIDER = (name, version, architecture) -> {
        final StringBuilder sb = new StringBuilder(RpmLead.toLeadName(name, version));
        sb.append('.').append(architecture).append(".rpm");
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `rpm/src/main/java/org/eclipse/packager/rpm/build/RpmFileNameProvider.java`
#### Snippet
```java
     * </p>
     */
    public static final RpmFileNameProvider DEFAULT_FILENAME_PROVIDER = (name, version, architecture) -> {
        final StringBuilder sb = new StringBuilder(RpmLead.toLeadName(name, version));
        sb.append('.').append(architecture).append(".rpm");
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `rpm/src/main/java/org/eclipse/packager/rpm/build/RpmFileNameProvider.java`
#### Snippet
```java
     * </p>
     */
    public static final RpmFileNameProvider DEFAULT_FILENAME_PROVIDER = (name, version, architecture) -> {
        final StringBuilder sb = new StringBuilder(RpmLead.toLeadName(name, version));
        sb.append('.').append(architecture).append(".rpm");
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `rpm/src/main/java/org/eclipse/packager/rpm/build/FileInformationCustomizer.java`
#### Snippet
```java
@FunctionalInterface
public interface FileInformationCustomizer<T> {
    public void perform(T object, FileInformation information) throws IOException;
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `core/src/main/java/org/eclipse/packager/io/IOFunction.java`
#### Snippet
```java
@FunctionalInterface
public interface IOFunction<T, R> {
    public R apply(T data) throws IOException;
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `rpm/src/main/java/org/eclipse/packager/rpm/build/FileInformationProvider.java`
#### Snippet
```java
    public FileInformation provide(String targetName, T object, PayloadEntryType type) throws IOException;

    public default FileInformationProvider<T> customize(final FileInformationCustomizer<T> customizer) {
        if (customizer == null) {
            return this;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `rpm/src/main/java/org/eclipse/packager/rpm/build/FileInformationProvider.java`
#### Snippet
```java
@FunctionalInterface
public interface FileInformationProvider<T> {
    public FileInformation provide(String targetName, T object, PayloadEntryType type) throws IOException;

    public default FileInformationProvider<T> customize(final FileInformationCustomizer<T> customizer) {
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `rpm/src/main/java/org/eclipse/packager/rpm/build/FileInformationProvider.java`
#### Snippet
```java
    }

    public default FileInformationProvider<T> customize(final SimpleFileInformationCustomizer customizer) {
        if (customizer == null) {
            return this;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `deb/src/main/java/org/eclipse/packager/deb/build/BinaryPackageBuilder.java`
#### Snippet
```java
     * @throws IOException if the file cannot be written to the package
     */
    public default void addFile(final ContentProvider contentProvider, final String fileName, final EntryInformation entryInformation) throws IOException {
        addFile(contentProvider, fileName, entryInformation, Optional.empty());
    }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `deb/src/main/java/org/eclipse/packager/deb/build/BinaryPackageBuilder.java`
#### Snippet
```java
     *             package
     */
    public void addDirectory(String directory, EntryInformation entryInformation, Optional<Supplier<Instant>> timestampSupplier) throws IOException;
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `deb/src/main/java/org/eclipse/packager/deb/build/BinaryPackageBuilder.java`
#### Snippet
```java
     *             package
     */
    public default void addDirectory(final String directory, final EntryInformation entryInformation) throws IOException {
        addDirectory(directory, entryInformation, Optional.empty());
    }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `deb/src/main/java/org/eclipse/packager/deb/build/BinaryPackageBuilder.java`
#### Snippet
```java
     * @throws IOException if the file cannot be written to the package
     */
    public void addFile(ContentProvider contentProvider, String fileName, EntryInformation entryInformation, Optional<Supplier<Instant>> timestampSupplier) throws IOException;

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `core/src/main/java/org/eclipse/packager/io/IOConsumer.java`
#### Snippet
```java
@FunctionalInterface
public interface IOConsumer<T> {
    public void accept(T data) throws IOException;
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `rpm/src/main/java/org/eclipse/packager/rpm/RpmBaseTag.java`
#### Snippet
```java
     * @return the key value
     */
    public Integer getValue();
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `core/src/main/java/org/eclipse/packager/io/SpoolOutTarget.java`
#### Snippet
```java
@FunctionalInterface
public interface SpoolOutTarget {
    public void spoolOut(final String fileName, final String mimeType, final IOConsumer<OutputStream> stream) throws IOException;
}

```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `rpm/src/main/java/org/eclipse/packager/rpm/deps/RpmDependencyFlags.java`
#### Snippet
```java
    private int value;

    private RpmDependencyFlags(final int bit) {
        this.value = 1 << bit;
    }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `deb/src/main/java/org/eclipse/packager/deb/build/ContentProvider.java`
#### Snippet
```java
    public InputStream createInputStream() throws IOException;

    public boolean hasContent();
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `deb/src/main/java/org/eclipse/packager/deb/build/ContentProvider.java`
#### Snippet
```java

public interface ContentProvider {
    public static final ContentProvider NULL_CONTENT = new ContentProvider() {

        @Override
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `deb/src/main/java/org/eclipse/packager/deb/build/ContentProvider.java`
#### Snippet
```java

public interface ContentProvider {
    public static final ContentProvider NULL_CONTENT = new ContentProvider() {

        @Override
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `deb/src/main/java/org/eclipse/packager/deb/build/ContentProvider.java`
#### Snippet
```java

public interface ContentProvider {
    public static final ContentProvider NULL_CONTENT = new ContentProvider() {

        @Override
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `deb/src/main/java/org/eclipse/packager/deb/build/ContentProvider.java`
#### Snippet
```java
     * @throws IOException in case of a n I/O error.
     */
    public InputStream createInputStream() throws IOException;

    public boolean hasContent();
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `deb/src/main/java/org/eclipse/packager/deb/build/ContentProvider.java`
#### Snippet
```java
    };

    public long getSize();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `rpm/src/main/java/org/eclipse/packager/rpm/build/BuilderContext.java`
#### Snippet
```java
    public static final String DEFAULT_GROUP = "root";

    public static final class Directory {
        private Directory() {
        }
```

### UnnecessaryModifier
Modifier `static` is redundant for inner classes of interfaces
in `rpm/src/main/java/org/eclipse/packager/rpm/build/BuilderContext.java`
#### Snippet
```java
    public static final String DEFAULT_GROUP = "root";

    public static final class Directory {
        private Directory() {
        }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `rpm/src/main/java/org/eclipse/packager/rpm/build/BuilderContext.java`
#### Snippet
```java
    public void addSymbolicLink(String targetName, String linkTo, final FileInformationProvider<? super SymbolicLink> provider) throws IOException;

    public default void addSymbolicLink(final String targetName, final String linkTo) throws IOException {
        addSymbolicLink(targetName, linkTo, getDefaultInformationProvider());
    }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `rpm/src/main/java/org/eclipse/packager/rpm/build/BuilderContext.java`
#### Snippet
```java
    public void addDirectory(String targetName, final FileInformationProvider<? super Directory> provider) throws IOException;

    public default void addDirectory(final String targetName, final SimpleFileInformationCustomizer customizer) throws IOException {
        addDirectory(targetName, getDefaultInformationProvider().customize(customizer));
    }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `rpm/src/main/java/org/eclipse/packager/rpm/build/BuilderContext.java`
#### Snippet
```java
    }

    public static <T> FileInformationProvider<T> multiProvider(final FileInformationProvider<Object> defaultProvider, final List<ProviderRule<?>> rules) {
        Objects.requireNonNull(defaultProvider);
        Objects.requireNonNull(rules);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `rpm/src/main/java/org/eclipse/packager/rpm/build/BuilderContext.java`
#### Snippet
```java
    }

    public static FileInformationProvider<Path> pathProvider() {
        return Defaults.PATH_PROVIDER;
    }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `rpm/src/main/java/org/eclipse/packager/rpm/build/BuilderContext.java`
#### Snippet
```java
    }

    public default void addFile(final String targetName, final byte[] source, final FileInformationProvider<Object> provider) throws IOException {
        addFile(targetName, ByteBuffer.wrap(source), provider);
    }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `rpm/src/main/java/org/eclipse/packager/rpm/build/BuilderContext.java`
#### Snippet
```java
    public static final SymbolicLink SYMBOLIC_LINK = new SymbolicLink();

    public static FileInformationCustomizer<Path> pathCustomizer() {
        return new FileInformationCustomizer<Path>() {

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `rpm/src/main/java/org/eclipse/packager/rpm/build/BuilderContext.java`
#### Snippet
```java
     */
    @SuppressWarnings("unchecked")
    public static <T> FileInformationProvider<T> defaultProvider() {
        return (FileInformationProvider<T>) Defaults.DEFAULT_MULTI_PROVIDER;
    }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `rpm/src/main/java/org/eclipse/packager/rpm/build/BuilderContext.java`
#### Snippet
```java
    public void addFile(String targetName, InputStream source, FileInformationProvider<Object> provider) throws IOException;

    public default void addFile(final String targetName, final InputStream source, final SimpleFileInformationCustomizer customizer) throws IOException {
        addFile(targetName, source, getDefaultInformationProvider().customize(customizer));
    }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `rpm/src/main/java/org/eclipse/packager/rpm/build/BuilderContext.java`
#### Snippet
```java
    public static final String DEFAULT_USER = "root";

    public static final String DEFAULT_GROUP = "root";

    public static final class Directory {
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `rpm/src/main/java/org/eclipse/packager/rpm/build/BuilderContext.java`
#### Snippet
```java
    public static final String DEFAULT_USER = "root";

    public static final String DEFAULT_GROUP = "root";

    public static final class Directory {
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `rpm/src/main/java/org/eclipse/packager/rpm/build/BuilderContext.java`
#### Snippet
```java
    public static final String DEFAULT_USER = "root";

    public static final String DEFAULT_GROUP = "root";

    public static final class Directory {
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `rpm/src/main/java/org/eclipse/packager/rpm/build/BuilderContext.java`
#### Snippet
```java
    public FileInformationProvider<Object> getDefaultInformationProvider();

    public default void addFile(final String targetName, final Path source) throws IOException {
        addFile(targetName, source, getDefaultInformationProvider());
    }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `rpm/src/main/java/org/eclipse/packager/rpm/build/BuilderContext.java`
#### Snippet
```java
    public static final Directory DIRECTORY = new Directory();

    public static final SymbolicLink SYMBOLIC_LINK = new SymbolicLink();

    public static FileInformationCustomizer<Path> pathCustomizer() {
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `rpm/src/main/java/org/eclipse/packager/rpm/build/BuilderContext.java`
#### Snippet
```java
    public static final Directory DIRECTORY = new Directory();

    public static final SymbolicLink SYMBOLIC_LINK = new SymbolicLink();

    public static FileInformationCustomizer<Path> pathCustomizer() {
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `rpm/src/main/java/org/eclipse/packager/rpm/build/BuilderContext.java`
#### Snippet
```java
    public static final Directory DIRECTORY = new Directory();

    public static final SymbolicLink SYMBOLIC_LINK = new SymbolicLink();

    public static FileInformationCustomizer<Path> pathCustomizer() {
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `rpm/src/main/java/org/eclipse/packager/rpm/build/BuilderContext.java`
#### Snippet
```java
    }

    public default void addDirectory(final String targetName) throws IOException {
        addDirectory(targetName, getDefaultInformationProvider());
    }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `rpm/src/main/java/org/eclipse/packager/rpm/build/BuilderContext.java`
#### Snippet
```java
    public void addFile(String targetName, ByteBuffer source, FileInformationProvider<Object> provider) throws IOException;

    public default void addFile(final String targetName, final ByteBuffer source, final SimpleFileInformationCustomizer customizer) throws IOException {
        addFile(targetName, source, getDefaultInformationProvider().customize(customizer));
    }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `rpm/src/main/java/org/eclipse/packager/rpm/build/BuilderContext.java`
#### Snippet
```java
    }

    public void addSymbolicLink(String targetName, String linkTo, final FileInformationProvider<? super SymbolicLink> provider) throws IOException;

    public default void addSymbolicLink(final String targetName, final String linkTo) throws IOException {
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `rpm/src/main/java/org/eclipse/packager/rpm/build/BuilderContext.java`
#### Snippet
```java
    }

    public void addFile(String targetName, Path source, FileInformationProvider<? super Path> provider) throws IOException;

    public default void addFile(final String targetName, final Path source, final SimpleFileInformationCustomizer customizer) throws IOException {
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `rpm/src/main/java/org/eclipse/packager/rpm/build/BuilderContext.java`
#### Snippet
```java
    }

    public void setDefaultInformationProvider(FileInformationProvider<Object> provider);

    public FileInformationProvider<Object> getDefaultInformationProvider();
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `rpm/src/main/java/org/eclipse/packager/rpm/build/BuilderContext.java`
#### Snippet
```java
    public void addFile(String targetName, Path source, FileInformationProvider<? super Path> provider) throws IOException;

    public default void addFile(final String targetName, final Path source, final SimpleFileInformationCustomizer customizer) throws IOException {
        addFile(targetName, source, getDefaultInformationProvider().customize(customizer));
    }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `rpm/src/main/java/org/eclipse/packager/rpm/build/BuilderContext.java`
#### Snippet
```java
    }

    public static SimpleFileInformationCustomizer modeCustomizer(final short mode) {
        return new SimpleFileInformationCustomizer() {

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `rpm/src/main/java/org/eclipse/packager/rpm/build/BuilderContext.java`
#### Snippet
```java
    }

    public void addDirectory(String targetName, final FileInformationProvider<? super Directory> provider) throws IOException;

    public default void addDirectory(final String targetName, final SimpleFileInformationCustomizer customizer) throws IOException {
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `rpm/src/main/java/org/eclipse/packager/rpm/build/BuilderContext.java`
#### Snippet
```java

public interface BuilderContext {
    public static final String DEFAULT_USER = "root";

    public static final String DEFAULT_GROUP = "root";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `rpm/src/main/java/org/eclipse/packager/rpm/build/BuilderContext.java`
#### Snippet
```java

public interface BuilderContext {
    public static final String DEFAULT_USER = "root";

    public static final String DEFAULT_GROUP = "root";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `rpm/src/main/java/org/eclipse/packager/rpm/build/BuilderContext.java`
#### Snippet
```java

public interface BuilderContext {
    public static final String DEFAULT_USER = "root";

    public static final String DEFAULT_GROUP = "root";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `rpm/src/main/java/org/eclipse/packager/rpm/build/BuilderContext.java`
#### Snippet
```java
    }

    public static final Directory DIRECTORY = new Directory();

    public static final SymbolicLink SYMBOLIC_LINK = new SymbolicLink();
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `rpm/src/main/java/org/eclipse/packager/rpm/build/BuilderContext.java`
#### Snippet
```java
    }

    public static final Directory DIRECTORY = new Directory();

    public static final SymbolicLink SYMBOLIC_LINK = new SymbolicLink();
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `rpm/src/main/java/org/eclipse/packager/rpm/build/BuilderContext.java`
#### Snippet
```java
    }

    public static final Directory DIRECTORY = new Directory();

    public static final SymbolicLink SYMBOLIC_LINK = new SymbolicLink();
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `rpm/src/main/java/org/eclipse/packager/rpm/build/BuilderContext.java`
#### Snippet
```java
    }

    public default void addSymbolicLink(final String targetName, final String linkTo, final SimpleFileInformationCustomizer customizer) throws IOException {
        addSymbolicLink(targetName, linkTo, getDefaultInformationProvider().customize(customizer));
    }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `rpm/src/main/java/org/eclipse/packager/rpm/build/BuilderContext.java`
#### Snippet
```java
    }

    public void addFile(String targetName, InputStream source, FileInformationProvider<Object> provider) throws IOException;

    public default void addFile(final String targetName, final InputStream source, final SimpleFileInformationCustomizer customizer) throws IOException {
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `rpm/src/main/java/org/eclipse/packager/rpm/build/BuilderContext.java`
#### Snippet
```java
    }

    public static <T> FileInformationProvider<T> multiProvider(final FileInformationProvider<Object> defaultProvider, final ProviderRule<?>... rules) {
        Objects.requireNonNull(rules);

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `rpm/src/main/java/org/eclipse/packager/rpm/build/BuilderContext.java`
#### Snippet
```java

    @SuppressWarnings("unchecked")
    public static <T> FileInformationProvider<T> simpleFileProvider() {
        return (FileInformationProvider<T>) Defaults.SIMPLE_FILE_PROVIDER;
    }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `rpm/src/main/java/org/eclipse/packager/rpm/build/BuilderContext.java`
#### Snippet
```java
    }

    public default void addFile(final String targetName, final byte[] source) throws IOException {
        addFile(targetName, source, getDefaultInformationProvider());
    }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `rpm/src/main/java/org/eclipse/packager/rpm/build/BuilderContext.java`
#### Snippet
```java
    }

    public void addFile(String targetName, ByteBuffer source, FileInformationProvider<Object> provider) throws IOException;

    public default void addFile(final String targetName, final ByteBuffer source, final SimpleFileInformationCustomizer customizer) throws IOException {
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `rpm/src/main/java/org/eclipse/packager/rpm/build/BuilderContext.java`
#### Snippet
```java
    }

    public static <T> FileInformationProvider<T> simpleProvider(final int mode) {
        return new FileInformationProvider<T>() {

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `rpm/src/main/java/org/eclipse/packager/rpm/build/BuilderContext.java`
#### Snippet
```java
    }

    public default void addFile(final String targetName, final byte[] source, final SimpleFileInformationCustomizer customizer) throws IOException {
        addFile(targetName, source, getDefaultInformationProvider().customize(customizer));
    }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `rpm/src/main/java/org/eclipse/packager/rpm/build/BuilderContext.java`
#### Snippet
```java

    @SuppressWarnings("unchecked")
    public static <T> FileInformationProvider<T> simpleDirectoryProvider() {
        return (FileInformationProvider<T>) Defaults.SIMPLE_DIRECTORY_PROVIDER;
    }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `rpm/src/main/java/org/eclipse/packager/rpm/build/BuilderContext.java`
#### Snippet
```java
    }

    public static final class SymbolicLink {
        private SymbolicLink() {
        }
```

### UnnecessaryModifier
Modifier `static` is redundant for inner classes of interfaces
in `rpm/src/main/java/org/eclipse/packager/rpm/build/BuilderContext.java`
#### Snippet
```java
    }

    public static final class SymbolicLink {
        private SymbolicLink() {
        }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `rpm/src/main/java/org/eclipse/packager/rpm/build/BuilderContext.java`
#### Snippet
```java
    }

    public default void addFile(final String targetName, final ByteBuffer source) throws IOException {
        addFile(targetName, source, getDefaultInformationProvider());
    }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `rpm/src/main/java/org/eclipse/packager/rpm/build/BuilderContext.java`
#### Snippet
```java
    }

    public static SimpleFileInformationCustomizer nowTimestampCustomizer() {
        return Defaults.NOW_TIMESTAMP_CUSTOMIZER;
    }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `rpm/src/main/java/org/eclipse/packager/rpm/build/BuilderContext.java`
#### Snippet
```java
    }

    public default void addFile(final String targetName, final InputStream source) throws IOException {
        addFile(targetName, source, getDefaultInformationProvider());
    }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `rpm/src/main/java/org/eclipse/packager/rpm/build/BuilderContext.java`
#### Snippet
```java
    public void setDefaultInformationProvider(FileInformationProvider<Object> provider);

    public FileInformationProvider<Object> getDefaultInformationProvider();

    public default void addFile(final String targetName, final Path source) throws IOException {
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `rpm/src/main/java/org/eclipse/packager/rpm/parse/HeaderValue.java`
#### Snippet
```java
    @FunctionalInterface
    public static interface IOFunction<T, R> {
        public R apply(T t) throws IOException;
    }

```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `rpm/src/main/java/org/eclipse/packager/rpm/parse/HeaderValue.java`
#### Snippet
```java

    @FunctionalInterface
    public static interface IOFunction<T, R> {
        public R apply(T t) throws IOException;
    }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `rpm/src/main/java/org/eclipse/packager/rpm/yum/RepositoryCreator.java`
#### Snippet
```java
        public void write(Document primary, OutputStream primaryStream) throws IOException;

        public Document createDocument();
    }

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `rpm/src/main/java/org/eclipse/packager/rpm/yum/RepositoryCreator.java`
#### Snippet
```java

    public interface XmlContext {
        public void write(Document primary, OutputStream primaryStream) throws IOException;

        public Document createDocument();
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `rpm/src/main/java/org/eclipse/packager/rpm/yum/RepositoryCreator.java`
#### Snippet
```java

    public interface Context {
        public void addPackage(FileInformation fileInformation, RpmInformation rpmInformation, Map<HashAlgorithm, String> checksums, HashAlgorithm idType);
    }

```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `rpm/src/main/java/org/eclipse/packager/rpm/build/RpmBuilder.java`
#### Snippet
```java
     * which may not be correct either.
     */
    public static enum Version {
        V4_11("4.11"),
        V4_12("4.12"),
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `rpm/src/main/java/org/eclipse/packager/rpm/build/RpmBuilder.java`
#### Snippet
```java
        private final String versionString;

        private Version(final String versionString) {
            this.versionString = versionString;
        }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `rpm/src/main/java/org/eclipse/packager/rpm/build/RpmBuilder.java`
#### Snippet
```java
    @FunctionalInterface
    private interface RecorderFunction<T> {
        public Result record(PayloadRecorder recorder, String targetName, T data, Consumer<CpioArchiveEntry> customizer) throws IOException;
    }

```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `rpm/src/main/java/org/eclipse/packager/rpm/build/LongMode.java`
#### Snippet
```java
    DEFAULT,
    FORCE_32BIT,
    FORCE_64BIT;
}

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `rpm/src/main/java/org/eclipse/packager/rpm/build/PayloadEntryType.java`
#### Snippet
```java
    FILE,
    DIRECTORY,
    SYMBOLIC_LINK;
}

```

## RuleId[id=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
Unnecessary string length argument
in `deb/src/main/java/org/eclipse/packager/deb/ControlFileParser.java`
#### Snippet
```java

                    currentKey = line.substring(0, idx);
                    String val = line.substring(idx + 1, line.length());
                    if (val.startsWith(" ")) {
                        val = val.substring(1);
```

## RuleId[id=CStyleArrayDeclaration]
### CStyleArrayDeclaration
C-style array declaration of local variable `toks`
in `deb/src/main/java/org/eclipse/packager/deb/build/DebianPackageWriter.java`
#### Snippet
```java

    private void checkCreateParents(final String fileName, final Optional<Supplier<Instant>> timestampSupplier) throws IOException {
        final String toks[] = fileName.split("/+");

        String current = "";
```

## RuleId[id=RedundantArrayCreation]
### RedundantArrayCreation
Redundant array creation for calling varargs method
in `rpm/src/main/java/org/eclipse/packager/rpm/build/Defaults.java`
#### Snippet
```java
    static final FileInformationProvider<SymbolicLink> SIMPLE_SYMBOLIC_LINK = BuilderContext.simpleProvider(0644);

    static final FileInformationProvider<Object> DEFAULT_MULTI_PROVIDER = BuilderContext.multiProvider(SIMPLE_FILE_PROVIDER, new ProviderRule<?>[] { //
            new ProviderRule<>(Directory.class, SIMPLE_DIRECTORY_PROVIDER), //
            new ProviderRule<>(SymbolicLink.class, SIMPLE_SYMBOLIC_LINK) //
    });

    static final FileInformationProvider<Path> PATH_PROVIDER = new FileInformationProvider<Path>() {
```

## RuleId[id=DuplicateBranchesInSwitch]
### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `rpm/src/main/java/org/eclipse/packager/rpm/parse/HeaderValue.java`
#### Snippet
```java
            break;
        case 9: // i18n string array
            this.value = getFromStore(storeData, false, buf -> makeString(buf), size -> new String[size]);
            break;
        default:
```

## RuleId[id=NonFinalFieldInEnum]
### NonFinalFieldInEnum
Non-final field `value` in enum 'RpmDependencyFlags'
in `rpm/src/main/java/org/eclipse/packager/rpm/deps/RpmDependencyFlags.java`
#### Snippet
```java
    CONFIG(28);

    private int value;

    private RpmDependencyFlags(final int bit) {
```

## RuleId[id=OctalLiteral]
### OctalLiteral
Octal integer `0644`
in `rpm/src/main/java/org/eclipse/packager/rpm/build/FileInformation.java`
#### Snippet
```java
    private Set<VerifyFlags> verifyFlags;

    private short mode = 0644;

    public void setTimestamp(final Instant timestamp) {
```

### OctalLiteral
Octal integer `0755`
in `deb/src/main/java/org/eclipse/packager/deb/build/EntryInformation.java`
#### Snippet
```java
    public static final EntryInformation DEFAULT_FILE = new EntryInformation(0644);

    public static final EntryInformation DEFAULT_FILE_EXEC = new EntryInformation(0755);

    public static final EntryInformation DEFAULT_FILE_CONF = new EntryInformation("root", "root", 0644, true);
```

### OctalLiteral
Octal integer `0755`
in `deb/src/main/java/org/eclipse/packager/deb/build/EntryInformation.java`
#### Snippet
```java
 */
public class EntryInformation {
    public static final EntryInformation DEFAULT_DIRECTORY = new EntryInformation(0755);

    public static final EntryInformation DEFAULT_FILE = new EntryInformation(0644);
```

### OctalLiteral
Octal integer `0644`
in `deb/src/main/java/org/eclipse/packager/deb/build/EntryInformation.java`
#### Snippet
```java
    public static final EntryInformation DEFAULT_DIRECTORY = new EntryInformation(0755);

    public static final EntryInformation DEFAULT_FILE = new EntryInformation(0644);

    public static final EntryInformation DEFAULT_FILE_EXEC = new EntryInformation(0755);
```

### OctalLiteral
Octal integer `0644`
in `deb/src/main/java/org/eclipse/packager/deb/build/EntryInformation.java`
#### Snippet
```java
    public static final EntryInformation DEFAULT_FILE_EXEC = new EntryInformation(0755);

    public static final EntryInformation DEFAULT_FILE_CONF = new EntryInformation("root", "root", 0644, true);

    private final String user;
```

### OctalLiteral
Octal integer `0644`
in `rpm/src/main/java/org/eclipse/packager/rpm/build/Defaults.java`
#### Snippet
```java
    static final FileInformationProvider<Directory> SIMPLE_DIRECTORY_PROVIDER = BuilderContext.simpleProvider(0755);

    static final FileInformationProvider<SymbolicLink> SIMPLE_SYMBOLIC_LINK = BuilderContext.simpleProvider(0644);

    static final FileInformationProvider<Object> DEFAULT_MULTI_PROVIDER = BuilderContext.multiProvider(SIMPLE_FILE_PROVIDER, new ProviderRule<?>[] { //
```

### OctalLiteral
Octal integer `0755`
in `rpm/src/main/java/org/eclipse/packager/rpm/build/Defaults.java`
#### Snippet
```java
    static final FileInformationProvider<Object> SIMPLE_FILE_PROVIDER = BuilderContext.simpleProvider(0644);

    static final FileInformationProvider<Directory> SIMPLE_DIRECTORY_PROVIDER = BuilderContext.simpleProvider(0755);

    static final FileInformationProvider<SymbolicLink> SIMPLE_SYMBOLIC_LINK = BuilderContext.simpleProvider(0644);
```

### OctalLiteral
Octal integer `0644`
in `rpm/src/main/java/org/eclipse/packager/rpm/build/Defaults.java`
#### Snippet
```java
    }

    static final FileInformationProvider<Object> SIMPLE_FILE_PROVIDER = BuilderContext.simpleProvider(0644);

    static final FileInformationProvider<Directory> SIMPLE_DIRECTORY_PROVIDER = BuilderContext.simpleProvider(0755);
```

## RuleId[id=IOStreamConstructor]
### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `deb/src/main/java/org/eclipse/packager/deb/build/FileContentProvider.java`
#### Snippet
```java
        }

        return new FileInputStream(this.file);
    }

```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `deb/src/main/java/org/eclipse/packager/deb/Packages.java`
#### Snippet
```java

    public static Map<String, String> parseControlFile(final File packageFile) throws IOException, ParserException {
        try (final ArArchiveInputStream in = new ArArchiveInputStream(new FileInputStream(packageFile))) {
            ArchiveEntry ar;
            while ((ar = in.getNextEntry()) != null) {
```

### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `deb/src/main/java/org/eclipse/packager/deb/build/DebianPackageWriter.java`
#### Snippet
```java
        this.dataTemp = File.createTempFile("data", null);

        this.dataStream = new TarArchiveOutputStream(new GZIPOutputStream(new FileOutputStream(this.dataTemp)));
        this.dataStream.setLongFileMode(TarArchiveOutputStream.LONGFILE_GNU);
    }
```

### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `deb/src/main/java/org/eclipse/packager/deb/build/DebianPackageWriter.java`
#### Snippet
```java
        final File controlFile = File.createTempFile("control", null);
        try {
            try (GZIPOutputStream gout = new GZIPOutputStream(new FileOutputStream(controlFile));
                    TarArchiveOutputStream tout = new TarArchiveOutputStream(gout)) {
                tout.setLongFileMode(TarArchiveOutputStream.LONGFILE_GNU);
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `rpm/src/main/java/org/eclipse/packager/rpm/signature/RpmFileSignatureProcessor.java`
#### Snippet
```java

        // Get the information of the RPM
        try (RpmInputStream rpmIn = new RpmInputStream(new FileInputStream(rpm))) {
            signatureHeaderStart = rpmIn.getSignatureHeader().getStart();
            signatureHeaderLength = rpmIn.getSignatureHeader().getLength();
```

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `rpm/src/main/java/org/eclipse/packager/rpm/build/RpmFileNameProvider.java`
#### Snippet
```java
     */
    public static final RpmFileNameProvider LEGACY_FILENAME_PROVIDER = (name, version, architecture) -> {
        final StringBuilder sb = new StringBuilder(RpmLead.toLeadName(name, version));
        sb.append('-').append(architecture).append(".rpm");
        return sb.toString();
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `rpm/src/main/java/org/eclipse/packager/rpm/build/RpmFileNameProvider.java`
#### Snippet
```java
     */
    public static final RpmFileNameProvider DEFAULT_FILENAME_PROVIDER = (name, version, architecture) -> {
        final StringBuilder sb = new StringBuilder(RpmLead.toLeadName(name, version));
        sb.append('.').append(architecture).append(".rpm");
        return sb.toString();
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `rpm/src/main/java/org/eclipse/packager/rpm/build/RpmBuilder.java`
#### Snippet
```java
        final short smode = (short) (mode | CpioConstants.C_ISLNK);

        final Result result = this.recorder.addSymbolicLink("./" + pathName.toString(), linkTo, cpioCustomizer(mtime, inode, smode));

        Consumer<FileEntry> c = this::initEntry;
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `rpm/src/main/java/org/eclipse/packager/rpm/build/RpmBuilder.java`
#### Snippet
```java
        final short smode = (short) (mode | CpioConstants.C_ISREG);

        final Result result = func.record(this.recorder, "./" + pathName.toString(), sourcePath, cpioCustomizer(mtime, inode, smode));

        Consumer<FileEntry> c = this::initEntry;
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `rpm/src/main/java/org/eclipse/packager/rpm/build/RpmBuilder.java`
#### Snippet
```java
        final short smode = (short) (mode | CpioConstants.C_ISDIR);

        final Result result = this.recorder.addDirectory("./" + pathName.toString(), cpioCustomizer(mtime, inode, smode));

        Consumer<FileEntry> c = this::initEntry;
```

## RuleId[id=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `rpm/src/main/java/org/eclipse/packager/rpm/yum/RepositoryCreator.java`
#### Snippet
```java

            final Element time = addElement(pkg, "time");
            time.setAttribute("file", "" + fileInformation.getTimestamp().getEpochSecond());
            if (info.getBuildTimestamp() != null) {
                time.setAttribute("build", "" + info.getBuildTimestamp());
```

### TrivialStringConcatenation
Empty string used in concatenation
in `rpm/src/main/java/org/eclipse/packager/rpm/yum/RepositoryCreator.java`
#### Snippet
```java
            time.setAttribute("file", "" + fileInformation.getTimestamp().getEpochSecond());
            if (info.getBuildTimestamp() != null) {
                time.setAttribute("build", "" + info.getBuildTimestamp());
            }

```

### TrivialStringConcatenation
Empty string used in concatenation
in `rpm/src/main/java/org/eclipse/packager/rpm/yum/RepositoryCreator.java`
#### Snippet
```java

            final Element size = addElement(pkg, "size");
            size.setAttribute("package", "" + fileInformation.getSize());
            if (info.getInstalledSize() != null) {
                size.setAttribute("installed", "" + info.getInstalledSize());
```

### TrivialStringConcatenation
Empty string used in concatenation
in `rpm/src/main/java/org/eclipse/packager/rpm/yum/RepositoryCreator.java`
#### Snippet
```java
            size.setAttribute("package", "" + fileInformation.getSize());
            if (info.getInstalledSize() != null) {
                size.setAttribute("installed", "" + info.getInstalledSize());
            }
            if (info.getArchiveSize() != null) {
```

### TrivialStringConcatenation
Empty string used in concatenation
in `rpm/src/main/java/org/eclipse/packager/rpm/yum/RepositoryCreator.java`
#### Snippet
```java
            }
            if (info.getArchiveSize() != null) {
                size.setAttribute("archive", "" + info.getArchiveSize());
            }

```

### TrivialStringConcatenation
Empty string used in concatenation
in `rpm/src/main/java/org/eclipse/packager/rpm/yum/RepositoryCreator.java`
#### Snippet
```java

            final Element rng = addElement(fmt, "rpm:header-range");
            rng.setAttribute("start", "" + info.getHeaderStart());
            rng.setAttribute("end", "" + info.getHeaderEnd());

```

### TrivialStringConcatenation
Empty string used in concatenation
in `rpm/src/main/java/org/eclipse/packager/rpm/yum/RepositoryCreator.java`
#### Snippet
```java
            final Element rng = addElement(fmt, "rpm:header-range");
            rng.setAttribute("start", "" + info.getHeaderStart());
            rng.setAttribute("end", "" + info.getHeaderEnd());

            addDependencies(fmt, "rpm:provides", info.getProvides());
```

### TrivialStringConcatenation
Empty string used in concatenation
in `rpm/src/main/java/org/eclipse/packager/rpm/yum/RepositoryCreator.java`
#### Snippet
```java
                if (dep.getVersion() != null) {
                    final RpmVersion version = RpmVersion.valueOf(dep.getVersion());
                    entry.setAttribute("epoch", "" + version.getEpoch().orElse(0));
                    entry.setAttribute("ver", version.getVersion());
                    if (version.getRelease().isPresent()) {
```

### TrivialStringConcatenation
Empty string used in concatenation
in `rpm/src/main/java/org/eclipse/packager/rpm/yum/RepositoryCreator.java`
#### Snippet
```java
        addElement(data, "timestamp", now / 1000);

        addElement(data, "size", "" + spooler.getSize(filename + ".gz"));
        addElement(data, "open-size", "" + spooler.getSize(filename));
    }
```

### TrivialStringConcatenation
Empty string used in concatenation
in `rpm/src/main/java/org/eclipse/packager/rpm/yum/RepositoryCreator.java`
#### Snippet
```java

        addElement(data, "size", "" + spooler.getSize(filename + ".gz"));
        addElement(data, "open-size", "" + spooler.getSize(filename));
    }

```

### TrivialStringConcatenation
Empty string used in concatenation
in `rpm/src/main/java/org/eclipse/packager/rpm/yum/RepositoryCreator.java`
#### Snippet
```java
                    final Element cl = addElement(pkg, "changelog", log.getText());
                    cl.setAttribute("author", log.getAuthor());
                    cl.setAttribute("date", "" + log.getTimestamp());
                }
            }
```

## RuleId[id=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `MultiplexStream` may be 'static'
in `core/src/main/java/org/eclipse/packager/io/OutputSpooler.java`
#### Snippet
```java
    }

    private class MultiplexStream extends OutputStream {
        private final OutputStream[] streams;

```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `rpm/src/main/java/org/eclipse/packager/rpm/build/FileInformation.java`
#### Snippet
```java
    /**
     * verify flags control the verify behaviour, i.e. <code>rpm -V ...</code>.
     * See https://github.com/ctron/rpm-builder/issues/41
     * <br>
     * The value null restores the default.
```

### JavadocLinkAsPlainText
Link specified as plain text
in `rpm/src/main/java/org/eclipse/packager/rpm/VerifyFlags.java`
#### Snippet
```java
/**
 * Constants to identify the RPM verification flags.
 * See https://github.com/ctron/rpm-builder/issues/41
 * The name of this enum is questionable.
 * It should rather be "VerifyFlag" (singular), but I leave it this way, cf.
```

### JavadocLinkAsPlainText
Link specified as plain text
in `rpm/src/main/java/org/eclipse/packager/rpm/VerifyFlags.java`
#### Snippet
```java
 * {@link FileFlags}.
 * The constants and their value are from
 * http://ftp.rpm.org/api/4.14.0/group__rpmvf.html
 *
 * @since 0.15.2
```

### JavadocLinkAsPlainText
Link specified as plain text
in `rpm/src/main/java/org/eclipse/packager/rpm/build/RpmBuilder.java`
#### Snippet
```java

        /**
         * see https://github.com/ctron/rpm-builder/issues/41
         *
         * @since 0.15.2
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `deb/src/main/java/org/eclipse/packager/deb/build/DebianPackageWriter.java`
#### Snippet
```java
    private final ArArchiveOutputStream ar;

    private final byte[] binaryHeader = "2.0\n".getBytes();

    private final Supplier<Instant> timestampSupplier;
```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `core/src/main/java/org/eclipse/packager/security/pgp/PgpHelper.java`
#### Snippet
```java
                final long shortId = key.getKeyID() & 0xFFFFFFFFL;

                if (key.getKeyID() != keyIdNum && shortId != keyIdNum) {
                    return false;
                }
```

### TrivialIf
`if` statement can be simplified
in `rpm/src/main/java/org/eclipse/packager/rpm/deps/Dependency.java`
#### Snippet
```java
        }
        if (this.version == null) {
            if (other.version != null) {
                return false;
            }
```

### TrivialIf
`if` statement can be simplified
in `rpm/src/main/java/org/eclipse/packager/rpm/deps/Dependency.java`
#### Snippet
```java
                return false;
            }
        } else if (!this.version.equals(other.version)) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `rpm/src/main/java/org/eclipse/packager/rpm/PathName.java`
#### Snippet
```java
        }
        final PathName other = (PathName) obj;
        if (!Arrays.equals(this.segments, other.segments)) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `rpm/src/main/java/org/eclipse/packager/rpm/build/RpmBuilder.java`
#### Snippet
```java
            }
            if (getDescription() == null) {
                if (other.getDescription() != null) {
                    return false;
                }
```

### TrivialIf
`if` statement can be simplified
in `rpm/src/main/java/org/eclipse/packager/rpm/build/RpmBuilder.java`
#### Snippet
```java
                    return false;
                }
            } else if (!getDescription().equals(other.getDescription())) {
                return false;
            }
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `FileChannel.write()` is ignored
in `rpm/src/main/java/org/eclipse/packager/rpm/build/RpmWriter.java`
#### Snippet
```java
    private void safeWrite(final ByteBuffer data) throws IOException {
        while (data.hasRemaining()) {
            this.file.write(data);
        }
    }
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `deb/src/main/java/org/eclipse/packager/deb/build/DebianPackageWriter.java`
#### Snippet
```java
            addArFile(controlFile, "control.tar.gz", timestampSupplier);
        } finally {
            controlFile.delete();
        }
    }
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `deb/src/main/java/org/eclipse/packager/deb/build/DebianPackageWriter.java`
#### Snippet
```java
            }
        } finally {
            this.dataTemp.delete();
        }
    }
```

## RuleId[id=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for parameter 'timestampSupplier'
in `deb/src/main/java/org/eclipse/packager/deb/build/BinaryPackageBuilder.java`
#### Snippet
```java
     *             package
     */
    public void addDirectory(String directory, EntryInformation entryInformation, Optional<Supplier<Instant>> timestampSupplier) throws IOException;
}

```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for parameter 'timestampSupplier'
in `deb/src/main/java/org/eclipse/packager/deb/build/BinaryPackageBuilder.java`
#### Snippet
```java
     * @throws IOException if the file cannot be written to the package
     */
    public void addFile(ContentProvider contentProvider, String fileName, EntryInformation entryInformation, Optional<Supplier<Instant>> timestampSupplier) throws IOException;

    /**
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'payloadFlags'
in `rpm/src/main/java/org/eclipse/packager/rpm/build/PayloadRecorder.java`
#### Snippet
```java
        private final PayloadCoding payloadCoding;

        private final Optional<String> payloadFlags;

        private Header<RpmTag> additionalHeader = new Header<>();
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'overrideFormatter'
in `deb/src/main/java/org/eclipse/packager/deb/ControlFileWriter.java`
#### Snippet
```java
    }

    public void writeEntry(final String key, final String value, final Optional<FieldFormatter> overrideFormatter) throws IOException {
        final FieldFormatter formatter = overrideFormatter.orElseGet(() -> this.alternateFormatters.getOrDefault(key, FieldFormatter.SINGLE));
        formatter.append(key, value, this.writer);
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for parameter 'timestampSupplier'
in `deb/src/main/java/org/eclipse/packager/deb/build/DebianPackageWriter.java`
#### Snippet
```java
    }

    protected void internalAddDirectory(final String path, final EntryInformation entryInformation, final Optional<Supplier<Instant>> timestampSupplier) throws IOException {
        final TarArchiveEntry entry = new TarArchiveEntry(path);
        applyInfo(entry, entryInformation);
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for parameter 'timestampSupplier'
in `deb/src/main/java/org/eclipse/packager/deb/build/DebianPackageWriter.java`
#### Snippet
```java
    }

    private static void applyTimestamp(final TarArchiveEntry entry, final Optional<Supplier<Instant>> timestampSupplier) {
        timestampSupplier.map(Supplier::get).map(Instant::toEpochMilli).ifPresent(entry::setModTime);
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for parameter 'timestampSupplier'
in `deb/src/main/java/org/eclipse/packager/deb/build/DebianPackageWriter.java`
#### Snippet
```java
    }

    public void addFile(final String content, final String fileName, final EntryInformation entryInformation, final Optional<Supplier<Instant>> timestampSupplier) throws IOException {
        addFile(new StaticContentProvider(content), fileName, entryInformation, timestampSupplier);
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for parameter 'timestampSupplier'
in `deb/src/main/java/org/eclipse/packager/deb/build/DebianPackageWriter.java`
#### Snippet
```java
    }

    public void addFile(final byte[] content, final String fileName, final EntryInformation entryInformation, final Optional<Supplier<Instant>> timestampSupplier) throws IOException {
        addFile(new StaticContentProvider(content), fileName, entryInformation, timestampSupplier);
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for parameter 'timestampSupplier'
in `deb/src/main/java/org/eclipse/packager/deb/build/DebianPackageWriter.java`
#### Snippet
```java
    }

    private void checkCreateParents(final String fileName, final Optional<Supplier<Instant>> timestampSupplier) throws IOException {
        final String toks[] = fileName.split("/+");

```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for parameter 'timestampSupplier'
in `deb/src/main/java/org/eclipse/packager/deb/build/DebianPackageWriter.java`
#### Snippet
```java
    }

    public void addFile(final File file, final String fileName, final EntryInformation entryInformation, final Optional<Supplier<Instant>> timestampSupplier) throws IOException {
        addFile(new FileContentProvider(file), fileName, entryInformation, timestampSupplier);
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'optionalFlags'
in `rpm/src/main/java/org/eclipse/packager/rpm/coding/PayloadCodingProvider.java`
#### Snippet
```java
    InputStream createInputStream(final InputStream in) throws IOException;

    OutputStream createOutputStream(final OutputStream out, final Optional<String> optionalFlags) throws IOException;

}
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'epoch'
in `rpm/src/main/java/org/eclipse/packager/rpm/RpmVersion.java`
#### Snippet
```java
    }

    public RpmVersion(final Optional<Integer> epoch, final String version, final Optional<String> release) {
        this.epoch = Objects.requireNonNull(epoch);
        this.version = Objects.requireNonNull(version);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'release'
in `rpm/src/main/java/org/eclipse/packager/rpm/RpmVersion.java`
#### Snippet
```java
    }

    public RpmVersion(final Optional<Integer> epoch, final String version, final Optional<String> release) {
        this.epoch = Objects.requireNonNull(epoch);
        this.version = Objects.requireNonNull(version);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'epoch'
in `rpm/src/main/java/org/eclipse/packager/rpm/RpmVersion.java`
#### Snippet
```java

public class RpmVersion {
    private final Optional<Integer> epoch;

    private final String version;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'release'
in `rpm/src/main/java/org/eclipse/packager/rpm/RpmVersion.java`
#### Snippet
```java
    private final String version;

    private final Optional<String> release;

    public RpmVersion(final String version) {
```

## RuleId[id=CharsetObjectCanBeUsed]
### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `deb/src/main/java/org/eclipse/packager/deb/build/DebianPackageWriter.java`
#### Snippet
```java

public class DebianPackageWriter implements AutoCloseable, BinaryPackageBuilder {
    public static final Charset CHARSET = Charset.forName("UTF-8");

    private static final int AR_ARCHIVE_DEFAULT_MODE = 33188; // see ArArchive
```

## RuleId[id=ConditionCoveredByFurtherCondition]
### ConditionCoveredByFurtherCondition
Condition 'namesVal == null' covered by subsequent condition '!(namesVal instanceof String\[\])'
in `rpm/src/main/java/org/eclipse/packager/rpm/info/RpmInformations.java`
#### Snippet
```java
        Object flagsVal = header.getTag(flagsTag);

        if (namesVal == null || !(namesVal instanceof String[])) {
            if (namesVal instanceof String) {
                namesVal = new String[] { (String) namesVal };
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@throws` tag description is missing
in `rpm/src/main/java/org/eclipse/packager/rpm/signature/RpmFileSignatureProcessor.java`
#### Snippet
```java
     * @param passphrase : passphrase to decrypt the private key
     * @param out : {@link OutputStream} to write to
     * @throws IOException
     * @throws PGPException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `rpm/src/main/java/org/eclipse/packager/rpm/signature/RpmFileSignatureProcessor.java`
#### Snippet
```java
     * @param out : {@link OutputStream} to write to
     * @throws IOException
     * @throws PGPException
     */
    public static void perform(File rpm, InputStream privateKeyIn, String passphrase, OutputStream out, HashAlgorithm hashAlgorithm)
```

### JavadocDeclaration
`@throws` tag description is missing
in `rpm/src/main/java/org/eclipse/packager/rpm/signature/RpmFileSignatureProcessor.java`
#### Snippet
```java
     * @param buf : the {@link ByteBuffer} to read
     * @return a bytes array
     * @throws IOException
     */
    private static byte[] safeReadBuffer(ByteBuffer buf) throws IOException {
```

### JavadocDeclaration
`@param hashAlgorithm` tag description is missing
in `rpm/src/main/java/org/eclipse/packager/rpm/signature/RpmFileSignatureProcessor.java`
#### Snippet
```java
     * @param payload : Payload as {@link ByteBuffer}
     * @param archiveSize : archiveSize retrieved in {@link RpmInformation}
     * @param hashAlgorithm
     * @return the signature header as a bytes array
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `rpm/src/main/java/org/eclipse/packager/rpm/signature/RpmFileSignatureProcessor.java`
#### Snippet
```java
     * @param hashAlgorithm
     * @return the signature header as a bytes array
     * @throws IOException
     */
    private static byte[] getSignature(PGPPrivateKey privateKey, ByteBuffer payloadHeader, ByteBuffer payload,
```

## RuleId[id=RedundantCast]
### RedundantCast
Casting `() -> {...}` to `Supplier` is redundant
in `deb/src/main/java/org/eclipse/packager/deb/build/DebianPackageWriter.java`
#### Snippet
```java

    public void addFile(final File file, final String fileName, final EntryInformation entryInformation) throws IOException {
        addFile(new FileContentProvider(file), fileName, entryInformation, Optional.of((Supplier<Instant>) () -> {
            return file == null || !file.canRead() ? null : Instant.ofEpochMilli(file.lastModified());
        }));
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `value` may be 'final'
in `rpm/src/main/java/org/eclipse/packager/rpm/deps/RpmDependencyFlags.java`
#### Snippet
```java
    CONFIG(28);

    private int value;

    private RpmDependencyFlags(final int bit) {
```

## RuleId[id=PointlessBitwiseExpression]
### PointlessBitwiseExpression
`1 << 0` can be replaced with '1'
in `rpm/src/main/java/org/eclipse/packager/rpm/FileFlags.java`
#### Snippet
```java

public enum FileFlags {
    CONFIGURATION(1 << 0), /* !< from %%config */
    DOC(1 << 1), /* !< from %%doc */
    ICON(1 << 2), /* !< from %%donotuse. */
```

### PointlessBitwiseExpression
`1 << 0` can be replaced with '1'
in `rpm/src/main/java/org/eclipse/packager/rpm/VerifyFlags.java`
#### Snippet
```java
    // The following constants control the verify flags.
    // Each bit corresponds to an upper case character in the output of "rpm -V ..."
    MD5(1 << 0), // '5'
    SIZE(1 << 1), // 'S'
    LINKTO(1 << 2), // 'L'
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `key` is redundant
in `rpm/src/main/java/org/eclipse/packager/rpm/info/RpmInformations.java`
#### Snippet
```java
            final Long flag = flags != null ? flags[i] : null;

            final String key = name; // for now the key is the name

            if (known.add(key)) {
```

## RuleId[id=DuplicateThrows]
### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `deb/src/main/java/org/eclipse/packager/deb/build/DebianPackageWriter.java`
#### Snippet
```java
    }

    private void buildAndAddControlFile(final Supplier<Instant> timestampSupplier) throws IOException, FileNotFoundException {
        final File controlFile = File.createTempFile("control", null);
        try {
```

### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `deb/src/main/java/org/eclipse/packager/deb/build/TextFileContentProvider.java`
#### Snippet
```java
    private final byte[] data;

    public TextFileContentProvider(final File file) throws FileNotFoundException, IOException {
        if (file != null) {
            String data = Files.asCharSource(file, StandardCharsets.UTF_8).read();
```

## RuleId[id=PointlessBooleanExpression]
### PointlessBooleanExpression
`configuration == true` can be simplified to 'configuration'
in `rpm/src/main/java/org/eclipse/packager/rpm/build/FileInformation.java`
#### Snippet
```java
    @Deprecated
    public void setConfiguration(final boolean configuration) {
        if (configuration == true) {
            this.fileFlags.add(FileFlags.CONFIGURATION);
        } else {
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `signatureHeaderStart` initializer `0L` is redundant
in `rpm/src/main/java/org/eclipse/packager/rpm/signature/RpmFileSignatureProcessor.java`
#### Snippet
```java

        final long leadLength = 96;
        long signatureHeaderStart = 0L;
        long signatureHeaderLength = 0L;
        long payloadHeaderStart = 0L;
```

### UnusedAssignment
Variable `signatureHeaderLength` initializer `0L` is redundant
in `rpm/src/main/java/org/eclipse/packager/rpm/signature/RpmFileSignatureProcessor.java`
#### Snippet
```java
        final long leadLength = 96;
        long signatureHeaderStart = 0L;
        long signatureHeaderLength = 0L;
        long payloadHeaderStart = 0L;
        long payloadHeaderLength = 0L;
```

### UnusedAssignment
Variable `payloadHeaderStart` initializer `0L` is redundant
in `rpm/src/main/java/org/eclipse/packager/rpm/signature/RpmFileSignatureProcessor.java`
#### Snippet
```java
        long signatureHeaderStart = 0L;
        long signatureHeaderLength = 0L;
        long payloadHeaderStart = 0L;
        long payloadHeaderLength = 0L;
        long payloadStart = 0L;
```

### UnusedAssignment
Variable `payloadHeaderLength` initializer `0L` is redundant
in `rpm/src/main/java/org/eclipse/packager/rpm/signature/RpmFileSignatureProcessor.java`
#### Snippet
```java
        long signatureHeaderLength = 0L;
        long payloadHeaderStart = 0L;
        long payloadHeaderLength = 0L;
        long payloadStart = 0L;
        long archiveSize = 0L;
```

### UnusedAssignment
Variable `payloadStart` initializer `0L` is redundant
in `rpm/src/main/java/org/eclipse/packager/rpm/signature/RpmFileSignatureProcessor.java`
#### Snippet
```java
        long payloadHeaderStart = 0L;
        long payloadHeaderLength = 0L;
        long payloadStart = 0L;
        long archiveSize = 0L;
        long payloadSize = 0L;
```

### UnusedAssignment
Variable `archiveSize` initializer `0L` is redundant
in `rpm/src/main/java/org/eclipse/packager/rpm/signature/RpmFileSignatureProcessor.java`
#### Snippet
```java
        long payloadHeaderLength = 0L;
        long payloadStart = 0L;
        long archiveSize = 0L;
        long payloadSize = 0L;
        byte[] signatureHeader;
```

### UnusedAssignment
Variable `payloadSize` initializer `0L` is redundant
in `rpm/src/main/java/org/eclipse/packager/rpm/signature/RpmFileSignatureProcessor.java`
#### Snippet
```java
        long payloadStart = 0L;
        long archiveSize = 0L;
        long payloadSize = 0L;
        byte[] signatureHeader;

```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `payloadCodingValue != null && !(payloadCodingValue instanceof String)` is always `false`
in `rpm/src/main/java/org/eclipse/packager/rpm/parse/RpmInputStream.java`
#### Snippet
```java
        final String payloadCoding = (String) payloadCodingValue;

        if (payloadCodingValue != null && !(payloadCodingValue instanceof String)) {
            throw new IOException("Payload coding must be a single string");
        }
```

### ConstantValue
Condition `payloadCodingValue != null` is always `true`
in `rpm/src/main/java/org/eclipse/packager/rpm/parse/RpmInputStream.java`
#### Snippet
```java
        final String payloadCoding = (String) payloadCodingValue;

        if (payloadCodingValue != null && !(payloadCodingValue instanceof String)) {
            throw new IOException("Payload coding must be a single string");
        }
```

### ConstantValue
Condition `!(payloadCodingValue instanceof String)` is always `false` when reached
in `rpm/src/main/java/org/eclipse/packager/rpm/parse/RpmInputStream.java`
#### Snippet
```java
        final String payloadCoding = (String) payloadCodingValue;

        if (payloadCodingValue != null && !(payloadCodingValue instanceof String)) {
            throw new IOException("Payload coding must be a single string");
        }
```

## RuleId[id=UnstableApiUsage]
### UnstableApiUsage
'getCount()' is declared in unstable class 'com.google.common.io.CountingInputStream' marked with @Beta
in `rpm/src/main/java/org/eclipse/packager/rpm/parse/RpmInputStream.java`
#### Snippet
```java

    protected <T extends RpmBaseTag> InputHeader<T> readHeader(final boolean withPadding) throws IOException {
        final long start = this.count.getCount();

        final byte[] magic = readComplete(3);
```

### UnstableApiUsage
'getCount()' is declared in unstable class 'com.google.common.io.CountingInputStream' marked with @Beta
in `rpm/src/main/java/org/eclipse/packager/rpm/parse/RpmInputStream.java`
#### Snippet
```java
        }

        final long end = this.count.getCount();

        return new InputHeader<>(entries, start, end - start);
```

### UnstableApiUsage
'com.google.common.io.CountingInputStream' is marked unstable with @Beta
in `rpm/src/main/java/org/eclipse/packager/rpm/parse/RpmInputStream.java`
#### Snippet
```java
    private CpioArchiveInputStream cpioStream;

    private final CountingInputStream count;

    public RpmInputStream(final InputStream in) {
```

### UnstableApiUsage
'CountingInputStream(java.io.InputStream)' is declared in unstable class 'com.google.common.io.CountingInputStream' marked with @Beta
in `rpm/src/main/java/org/eclipse/packager/rpm/parse/RpmInputStream.java`
#### Snippet
```java

    public RpmInputStream(final InputStream in) {
        this.count = new CountingInputStream(in);
        this.in = new DataInputStream(this.count);
    }
```

### UnstableApiUsage
'com.google.common.io.CountingInputStream' is marked unstable with @Beta
in `rpm/src/main/java/org/eclipse/packager/rpm/parse/RpmInputStream.java`
#### Snippet
```java

    public RpmInputStream(final InputStream in) {
        this.count = new CountingInputStream(in);
        this.in = new DataInputStream(this.count);
    }
```

