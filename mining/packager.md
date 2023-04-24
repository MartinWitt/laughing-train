# packager 
 
# Bad smells
I found 389 bad smells with 139 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryModifier | 118 | true |
| BoundedWildcard | 66 | false |
| Convert2MethodRef | 21 | false |
| ReturnNull | 21 | false |
| OptionalUsedAsFieldOrParameterType | 15 | false |
| SystemOutErr | 15 | false |
| DynamicRegexReplaceableByCompiledPattern | 13 | false |
| TrivialStringConcatenation | 11 | false |
| NestedAssignment | 10 | false |
| OctalLiteral | 8 | false |
| MissortedModifiers | 8 | false |
| AssignmentToMethodParameter | 8 | false |
| Convert2Lambda | 7 | false |
| UnusedAssignment | 7 | false |
| UnstableApiUsage | 5 | false |
| SizeReplaceableByIsEmpty | 4 | true |
| CodeBlock2Expr | 4 | true |
| ConstantValue | 4 | false |
| ToArrayCallWithZeroLengthArrayArgument | 3 | true |
| UtilityClassWithoutPrivateConstructor | 3 | true |
| OptionalContainsCollection | 3 | false |
| UnnecessaryToStringCall | 3 | true |
| AssignmentToLambdaParameter | 3 | false |
| IOResource | 2 | false |
| UnnecessarySemicolon | 2 | false |
| StringBufferReplaceableByString | 2 | false |
| IgnoreResultOfCall | 2 | false |
| PointlessBitwiseExpression | 2 | false |
| ZeroLengthArrayInitialization | 2 | false |
| DuplicateThrows | 2 | false |
| StringOperationCanBeSimplified | 1 | false |
| CStyleArrayDeclaration | 1 | false |
| ComparatorCombinators | 1 | false |
| RedundantArrayCreation | 1 | true |
| DuplicateBranchesInSwitch | 1 | false |
| NonSynchronizedMethodOverridesSynchronizedMethod | 1 | false |
| InnerClassMayBeStatic | 1 | true |
| CharsetObjectCanBeUsed | 1 | false |
| UnnecessaryUnboxing | 1 | false |
| ConditionCoveredByFurtherCondition | 1 | false |
| UnnecessaryFullyQualifiedName | 1 | false |
| RedundantFieldInitialization | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
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

## RuleId[id=IOResource]
### IOResource
'RecordingDigestOutputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `core/src/main/java/org/eclipse/packager/io/OutputSpooler.java`
#### Snippet
```java
                    final String key = entry.getKey() + ":" + algo;
                    try {
                        stream = new RecordingDigestOutputStream(stream, MessageDigest.getInstance(algo), key);
                    } catch (final NoSuchAlgorithmException e) {
                        throw new IOException(e);
```

### IOResource
'CountingOutputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `core/src/main/java/org/eclipse/packager/io/OutputSpooler.java`
#### Snippet
```java
                // add counter

                stream = new CountingOutputStream(entry.getKey(), stream);

                // apply transformer
```

## RuleId[id=UnnecessaryModifier]
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
in `deb/src/main/java/org/eclipse/packager/deb/build/ContentProvider.java`
#### Snippet
```java
    public InputStream createInputStream() throws IOException;

    public boolean hasContent();
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

    public interface Context {
        public void addPackage(FileInformation fileInformation, RpmInformation rpmInformation, Map<HashAlgorithm, String> checksums, HashAlgorithm idType);
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
in `rpm/src/main/java/org/eclipse/packager/rpm/RpmBaseTag.java`
#### Snippet
```java
     * @return the key value
     */
    public Integer getValue();
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

    public void addFile(String targetName, Path source, FileInformationProvider<? super Path> provider) throws IOException;

    public default void addFile(final String targetName, final Path source, final SimpleFileInformationCustomizer customizer) throws IOException {
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

    public void addSymbolicLink(String targetName, String linkTo, final FileInformationProvider<? super SymbolicLink> provider) throws IOException;

    public default void addSymbolicLink(final String targetName, final String linkTo) throws IOException {
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
    }

    public void setDefaultInformationProvider(FileInformationProvider<Object> provider);

    public FileInformationProvider<Object> getDefaultInformationProvider();
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

    public static SimpleFileInformationCustomizer modeCustomizer(final short mode) {
        return new SimpleFileInformationCustomizer() {

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

    public default void addFile(final String targetName, final byte[] source, final SimpleFileInformationCustomizer customizer) throws IOException {
        addFile(targetName, source, getDefaultInformationProvider().customize(customizer));
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

    public void addFile(String targetName, ByteBuffer source, FileInformationProvider<Object> provider) throws IOException;

    public default void addFile(final String targetName, final ByteBuffer source, final SimpleFileInformationCustomizer customizer) throws IOException {
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

    public default void addFile(final String targetName, final ByteBuffer source) throws IOException {
        addFile(targetName, source, getDefaultInformationProvider());
    }
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
    public void setDefaultInformationProvider(FileInformationProvider<Object> provider);

    public FileInformationProvider<Object> getDefaultInformationProvider();

    public default void addFile(final String targetName, final Path source) throws IOException {
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

    public static SimpleFileInformationCustomizer nowTimestampCustomizer() {
        return Defaults.NOW_TIMESTAMP_CUSTOMIZER;
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
    public static final SymbolicLink SYMBOLIC_LINK = new SymbolicLink();

    public static FileInformationCustomizer<Path> pathCustomizer() {
        return new FileInformationCustomizer<Path>() {

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

    public static <T> FileInformationProvider<T> multiProvider(final FileInformationProvider<Object> defaultProvider, final ProviderRule<?>... rules) {
        Objects.requireNonNull(rules);

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

    public default void addFile(final String targetName, final InputStream source) throws IOException {
        addFile(targetName, source, getDefaultInformationProvider());
    }
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
    }

    public default FileInformationProvider<T> customize(final SimpleFileInformationCustomizer customizer) {
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
in `core/src/main/java/org/eclipse/packager/io/SpoolOutTarget.java`
#### Snippet
```java
@FunctionalInterface
public interface SpoolOutTarget {
    public void spoolOut(final String fileName, final String mimeType, final IOConsumer<OutputStream> stream) throws IOException;
}

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

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `DefaultPayloadCodingRegistry` has only 'static' members, and lacks a 'private' constructor
in `rpm/src/main/java/org/eclipse/packager/rpm/coding/DefaultPayloadCodingRegistry.java`
#### Snippet
```java
import java.util.TreeMap;

public class DefaultPayloadCodingRegistry {
    private static final String GZIP = "gzip";

```

### UtilityClassWithoutPrivateConstructor
Class `Dumper` has only 'static' members, and lacks a 'private' constructor
in `rpm/src/main/java/org/eclipse/packager/rpm/app/Dumper.java`
#### Snippet
```java
import org.eclipse.packager.rpm.parse.RpmInputStream;

public class Dumper {
    private static final Boolean SKIP_META = Boolean.getBoolean("skipMeta");

```

### UtilityClassWithoutPrivateConstructor
Class `Rpms` has only 'static' members, and lacks a 'private' constructor
in `rpm/src/main/java/org/eclipse/packager/rpm/Rpms.java`
#### Snippet
```java
import java.util.Arrays;

public class Rpms {
    private final static char[] HEX = "0123456789ABCDEF".toCharArray();

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

## RuleId[id=OptionalContainsCollection]
### OptionalContainsCollection
'Optional' contains array `Long[]`
in `rpm/src/main/java/org/eclipse/packager/rpm/RpmTagValue.java`
#### Snippet
```java
    }

    public Optional<Long[]> asLongArray() {
        if (this.value == null) {
            return Optional.empty();
```

### OptionalContainsCollection
'Optional' contains array `Integer[]`
in `rpm/src/main/java/org/eclipse/packager/rpm/RpmTagValue.java`
#### Snippet
```java
    }

    public Optional<Integer[]> asIntegerArray() {
        if (this.value == null) {
            return Optional.empty();
```

### OptionalContainsCollection
'Optional' contains array `String[]`
in `rpm/src/main/java/org/eclipse/packager/rpm/RpmTagValue.java`
#### Snippet
```java
    }

    public Optional<String[]> asStringArray() {
        if (this.value == null) {
            return Optional.empty();
```

## RuleId[id=Convert2MethodRef]
### Convert2MethodRef
Lambda can be replaced with method reference
in `rpm/src/main/java/org/eclipse/packager/rpm/yum/RepositoryCreator.java`
#### Snippet
```java
        final String fileFilter = System.getProperty("drone.rpm.yum.primaryFiles", dirFilter);

        this.primaryFiles = Arrays.stream(fileFilter.split(",")).map(re -> Pattern.compile(re)).collect(Collectors.toList());
        this.primaryDirs = Arrays.stream(dirFilter.split(",")).map(re -> Pattern.compile(re)).collect(Collectors.toList());

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `rpm/src/main/java/org/eclipse/packager/rpm/yum/RepositoryCreator.java`
#### Snippet
```java

        this.primaryFiles = Arrays.stream(fileFilter.split(",")).map(re -> Pattern.compile(re)).collect(Collectors.toList());
        this.primaryDirs = Arrays.stream(dirFilter.split(",")).map(re -> Pattern.compile(re)).collect(Collectors.toList());

        this.primaryUniqueName = UUID.randomUUID().toString().replace("-", "");
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `rpm/src/main/java/org/eclipse/packager/rpm/yum/RepositoryCreator.java`
#### Snippet
```java

        this.primaryStreamBuilder.addOutput(String.format("repodata/%s-primary.xml", this.primaryUniqueName), "application/xml");
        this.primaryStreamBuilder.addOutput(String.format("repodata/%s-primary.xml.gz", this.primaryUniqueName), "application/x-gzip", output -> new GZIPOutputStream(output));

        // filelists
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `rpm/src/main/java/org/eclipse/packager/rpm/yum/RepositoryCreator.java`
#### Snippet
```java

        this.filelistsStreamBuilder.addOutput(String.format("repodata/%s-filelists.xml", this.filelistsUniqueName), "application/xml");
        this.filelistsStreamBuilder.addOutput(String.format("repodata/%s-filelists.xml.gz", this.filelistsUniqueName), "application/x-gzip", output -> new GZIPOutputStream(output));

        // other
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `rpm/src/main/java/org/eclipse/packager/rpm/yum/RepositoryCreator.java`
#### Snippet
```java

        this.otherStreamBuilder.addOutput(String.format("repodata/%s-other.xml", this.otherUniqueName), "application/xml");
        this.otherStreamBuilder.addOutput(String.format("repodata/%s-other.xml.gz", this.otherUniqueName), "application/x-gzip", output -> new GZIPOutputStream(output));

        // md
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `rpm/src/main/java/org/eclipse/packager/rpm/header/Header.java`
#### Snippet
```java
        Objects.requireNonNull(value);

        this.entries.put(tag, Arrays.stream(value).map(v -> new I18nString(v)).toArray(I18nString[]::new));
    }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `rpm/src/main/java/org/eclipse/packager/rpm/header/Header.java`
#### Snippet
```java
        Objects.requireNonNull(value);

        this.entries.put(tag.getValue(), Arrays.stream(value).map(v -> new I18nString(v)).toArray(I18nString[]::new));
    }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `rpm/src/main/java/org/eclipse/packager/rpm/header/Header.java`
#### Snippet
```java
            throw new IllegalArgumentException("'charset' cannot be null");
        }
        return this.entries.entrySet().stream().map(this::makeEntry).toArray(num -> new HeaderEntry[num]);
    }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `rpm/src/main/java/org/eclipse/packager/rpm/parse/HeaderValue.java`
#### Snippet
```java
            break;
        case 1: // character
            this.value = getFromStore(storeData, true, buf -> (char) storeData.get(), size -> new Character[size]);
            break;
        case 2: // byte
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `rpm/src/main/java/org/eclipse/packager/rpm/parse/HeaderValue.java`
#### Snippet
```java
            break;
        case 2: // byte
            this.value = getFromStore(storeData, true, buf -> buf.get(), size -> new Byte[size]);
            break;
        case 3: // 16bit integer
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `rpm/src/main/java/org/eclipse/packager/rpm/parse/HeaderValue.java`
#### Snippet
```java
            break;
        case 2: // byte
            this.value = getFromStore(storeData, true, buf -> buf.get(), size -> new Byte[size]);
            break;
        case 3: // 16bit integer
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `rpm/src/main/java/org/eclipse/packager/rpm/parse/HeaderValue.java`
#### Snippet
```java
            break;
        case 3: // 16bit integer
            this.value = getFromStore(storeData, true, buf -> buf.getShort(), size -> new Short[size]);
            break;
        case 4: // 32bit integer
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `rpm/src/main/java/org/eclipse/packager/rpm/parse/HeaderValue.java`
#### Snippet
```java
            break;
        case 3: // 16bit integer
            this.value = getFromStore(storeData, true, buf -> buf.getShort(), size -> new Short[size]);
            break;
        case 4: // 32bit integer
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `rpm/src/main/java/org/eclipse/packager/rpm/parse/HeaderValue.java`
#### Snippet
```java
            break;
        case 4: // 32bit integer
            this.value = getFromStore(storeData, true, buf -> buf.getInt(), size -> new Integer[size]);
            break;
        case 5: // 64bit integer
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `rpm/src/main/java/org/eclipse/packager/rpm/parse/HeaderValue.java`
#### Snippet
```java
            break;
        case 4: // 32bit integer
            this.value = getFromStore(storeData, true, buf -> buf.getInt(), size -> new Integer[size]);
            break;
        case 5: // 64bit integer
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `rpm/src/main/java/org/eclipse/packager/rpm/parse/HeaderValue.java`
#### Snippet
```java
            break;
        case 5: // 64bit integer
            this.value = getFromStore(storeData, true, buf -> buf.getLong(), size -> new Long[size]);
            break;
        case 6: // one string
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `rpm/src/main/java/org/eclipse/packager/rpm/parse/HeaderValue.java`
#### Snippet
```java
            break;
        case 5: // 64bit integer
            this.value = getFromStore(storeData, true, buf -> buf.getLong(), size -> new Long[size]);
            break;
        case 6: // one string
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `rpm/src/main/java/org/eclipse/packager/rpm/parse/HeaderValue.java`
#### Snippet
```java
            break;
        case 8: // string array
            this.value = getFromStore(storeData, false, buf -> makeString(buf), size -> new String[size]);
            break;
        case 9: // i18n string array
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `rpm/src/main/java/org/eclipse/packager/rpm/parse/HeaderValue.java`
#### Snippet
```java
            break;
        case 8: // string array
            this.value = getFromStore(storeData, false, buf -> makeString(buf), size -> new String[size]);
            break;
        case 9: // i18n string array
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `rpm/src/main/java/org/eclipse/packager/rpm/parse/HeaderValue.java`
#### Snippet
```java
            break;
        case 9: // i18n string array
            this.value = getFromStore(storeData, false, buf -> makeString(buf), size -> new String[size]);
            break;
        default:
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `rpm/src/main/java/org/eclipse/packager/rpm/parse/HeaderValue.java`
#### Snippet
```java
            break;
        case 9: // i18n string array
            this.value = getFromStore(storeData, false, buf -> makeString(buf), size -> new String[size]);
            break;
        default:
```

## RuleId[id=ComparatorCombinators]
### ComparatorCombinators
Can be replaced with 'Comparator.comparingLong'
in `rpm/src/main/java/org/eclipse/packager/rpm/info/RpmInformations.java`
#### Snippet
```java
            }

            Collections.sort(changes, (o1, o2) -> Long.compare(o1.getTimestamp(), o2.getTimestamp()));

            result.setChangelog(changes);
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

## RuleId[id=NonSynchronizedMethodOverridesSynchronizedMethod]
### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `reset()` overrides synchronized method
in `rpm/src/main/java/org/eclipse/packager/rpm/parse/RpmInputStream.java`
#### Snippet
```java

    @Override
    public void reset() throws IOException {
        ensureInit();
        this.payloadStream.reset();
```

## RuleId[id=OctalLiteral]
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

### OctalLiteral
Octal integer `0644`
in `rpm/src/main/java/org/eclipse/packager/rpm/build/FileInformation.java`
#### Snippet
```java
    private Set<VerifyFlags> verifyFlags;

    private short mode = 0644;

    public void setTimestamp(final Instant timestamp) {
```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`(flags = optionalFlags.get()).length() > 0` can be replaced with '!(flags = optionalFlags.get()).isEmpty()'
in `rpm/src/main/java/org/eclipse/packager/rpm/coding/BZip2PayloadCoding.java`
#### Snippet
```java
        final int blockSize;

        if (optionalFlags.isPresent() && (flags = optionalFlags.get()).length() > 0) {
            blockSize = Integer.parseInt(flags.substring(0, 1));
        } else {
```

### SizeReplaceableByIsEmpty
`(flags = optionalFlags.get()).length() > 0` can be replaced with '!(flags = optionalFlags.get()).isEmpty()'
in `rpm/src/main/java/org/eclipse/packager/rpm/coding/GzipPayloadCoding.java`
#### Snippet
```java
        final int compressionLevel;

        if (optionalFlags.isPresent() && (flags = optionalFlags.get()).length() > 0) {
            compressionLevel = Integer.parseInt(flags.substring(0, 1));
        } else {
```

### SizeReplaceableByIsEmpty
`(flags = optionalFlags.get()).length() > 0` can be replaced with '!(flags = optionalFlags.get()).isEmpty()'
in `rpm/src/main/java/org/eclipse/packager/rpm/coding/XZPayloadCoding.java`
#### Snippet
```java
        final int preset;

        if (optionalFlags.isPresent() && (flags = optionalFlags.get()).length() > 0) {
            preset = Integer.parseInt(flags.substring(0, 1));
        } else {
```

### SizeReplaceableByIsEmpty
`(flags = optionalFlags.get()).length() > 0` can be replaced with '!(flags = optionalFlags.get()).isEmpty()'
in `rpm/src/main/java/org/eclipse/packager/rpm/coding/ZstdPayloadCoding.java`
#### Snippet
```java
        final int level;

        if (optionalFlags.isPresent() && (flags = optionalFlags.get()).length() > 0) {
            level = Integer.parseInt(flags.substring(0, 1));
        } else {
```

## RuleId[id=StringBufferReplaceableByString]
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

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `rpm/src/main/java/org/eclipse/packager/rpm/build/RpmBuilder.java`
#### Snippet
```java
        final short smode = (short) (mode | CpioConstants.C_ISDIR);

        final Result result = this.recorder.addDirectory("./" + pathName.toString(), cpioCustomizer(mtime, inode, smode));

        Consumer<FileEntry> c = this::initEntry;
```

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

## RuleId[id=TrivialStringConcatenation]
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
                    final Element cl = addElement(pkg, "changelog", log.getText());
                    cl.setAttribute("author", log.getAuthor());
                    cl.setAttribute("date", "" + log.getTimestamp());
                }
            }
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

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends PayloadProcessor`
in `rpm/src/main/java/org/eclipse/packager/rpm/build/BuilderOptions.java`
#### Snippet
```java
    }

    public void setPayloadProcessors(final List<PayloadProcessor> payloadProcessors) {
        // we create a copy of the list to prevent external changes to our state.
        this.payloadProcessors = new ArrayList<>(payloadProcessors);
```

### BoundedWildcard
Can generalize to `? super RpmTag`
in `rpm/src/main/java/org/eclipse/packager/rpm/build/PayloadProcessors.java`
#### Snippet
```java

            @Override
            public void finish(final Header<RpmTag> header) {
                final String raw = Hex.toHexString(digestRaw.digest());
                final String compressed = Hex.toHexString(digestCompressed.digest());
```

### BoundedWildcard
Can generalize to `? super Dependency`
in `rpm/src/main/java/org/eclipse/packager/rpm/coding/BZip2PayloadCoding.java`
#### Snippet
```java

    @Override
    public void fillRequirements(final Consumer<Dependency> requirementsConsumer) {
        requirementsConsumer.accept(new Dependency("PayloadIsBzip2", "3.0.5-1", RpmDependencyFlags.LESS, RpmDependencyFlags.EQUAL, RpmDependencyFlags.RPMLIB));
    }
```

### BoundedWildcard
Can generalize to `? super RpmSignatureTag`
in `rpm/src/main/java/org/eclipse/packager/rpm/signature/RsaHeaderSignatureProcessor.java`
#### Snippet
```java

    @Override
    public void finish(final Header<RpmSignatureTag> signature) {
        signature.putBlob(RpmSignatureTag.RSAHEADER, this.value);
    }
```

### BoundedWildcard
Can generalize to `? super RpmSignatureTag`
in `rpm/src/main/java/org/eclipse/packager/rpm/signature/SignatureProcessors.java`
#### Snippet
```java

            @Override
            public void finish(final Header<RpmSignatureTag> signature) {
                signature.putString(RpmSignatureTag.SHA256HEADER, this.value);
            }
```

### BoundedWildcard
Can generalize to `? super RpmSignatureTag`
in `rpm/src/main/java/org/eclipse/packager/rpm/signature/SignatureProcessors.java`
#### Snippet
```java

            @Override
            public void finish(final Header<RpmSignatureTag> signature) {
                signature.putBlob(RpmSignatureTag.MD5, this.digest.digest());
            }
```

### BoundedWildcard
Can generalize to `? super RpmSignatureTag`
in `rpm/src/main/java/org/eclipse/packager/rpm/signature/SignatureProcessors.java`
#### Snippet
```java

            @Override
            public void finish(final Header<RpmSignatureTag> signature) {
                signature.putSize(this.archiveSize, RpmSignatureTag.PAYLOAD_SIZE, RpmSignatureTag.LONGARCHIVESIZE);
            }
```

### BoundedWildcard
Can generalize to `? super RpmSignatureTag`
in `rpm/src/main/java/org/eclipse/packager/rpm/signature/SignatureProcessors.java`
#### Snippet
```java

            @Override
            public void finish(final Header<RpmSignatureTag> signature) {
                signature.putString(RpmSignatureTag.SHA1HEADER, this.value);
            }
```

### BoundedWildcard
Can generalize to `? super RpmSignatureTag`
in `rpm/src/main/java/org/eclipse/packager/rpm/signature/SignatureProcessors.java`
#### Snippet
```java

            @Override
            public void finish(final Header<RpmSignatureTag> signature) {
                signature.putSize(this.headerSize + this.payloadSize, RpmSignatureTag.SIZE, RpmSignatureTag.LONGSIZE);
            }
```

### BoundedWildcard
Can generalize to `? super Integer`
in `rpm/src/main/java/org/eclipse/packager/rpm/app/Dumper.java`
#### Snippet
```java
    }

    private static void dumpHeader(final String string, final InputHeader<? extends RpmBaseTag> header, final Function<Integer, Object> func, final boolean sorted) {
        System.out.println(string);
        System.out.println("=================================");
```

### BoundedWildcard
Can generalize to `? extends T`
in `rpm/src/main/java/org/eclipse/packager/rpm/build/ProviderRule.java`
#### Snippet
```java
    private final FileInformationProvider<T> provider;

    public ProviderRule(final Class<T> clazz, final FileInformationProvider<T> provider) {
        this.clazz = clazz;
        this.provider = provider;
```

### BoundedWildcard
Can generalize to `? super T`
in `rpm/src/main/java/org/eclipse/packager/rpm/build/ProviderRule.java`
#### Snippet
```java
    private final FileInformationProvider<T> provider;

    public ProviderRule(final Class<T> clazz, final FileInformationProvider<T> provider) {
        this.clazz = clazz;
        this.provider = provider;
```

### BoundedWildcard
Can generalize to `? extends Dependency`
in `rpm/src/main/java/org/eclipse/packager/rpm/yum/RepositoryCreator.java`
#### Snippet
```java
        }

        private void addDependencies(final Element fmt, final String elementName, final List<Dependency> deps) {
            final Element ele = addElement(fmt, elementName);

```

### BoundedWildcard
Can generalize to `? super Context`
in `rpm/src/main/java/org/eclipse/packager/rpm/yum/RepositoryCreator.java`
#### Snippet
```java
    }

    public void process(final IOConsumer<Context> consumer) throws IOException {
        final long now = System.currentTimeMillis();

```

### BoundedWildcard
Can generalize to `? super String`
in `rpm/src/main/java/org/eclipse/packager/rpm/yum/RepositoryCreator.java`
#### Snippet
```java
        }

        private void appendFiles(final RpmInformation info, final Element pkg, final Predicate<String> fileFilter, final Predicate<String> dirFilter) {
            for (final String file : new TreeSet<>(info.getFiles())) {
                if (fileFilter == null || fileFilter.test(file)) {
```

### BoundedWildcard
Can generalize to `? super String`
in `rpm/src/main/java/org/eclipse/packager/rpm/yum/RepositoryCreator.java`
#### Snippet
```java
        }

        private void appendFiles(final RpmInformation info, final Element pkg, final Predicate<String> fileFilter, final Predicate<String> dirFilter) {
            for (final String file : new TreeSet<>(info.getFiles())) {
                if (fileFilter == null || fileFilter.test(file)) {
```

### BoundedWildcard
Can generalize to `? super OutputStream`
in `core/src/main/java/org/eclipse/packager/io/FileSystemSpoolOutTarget.java`
#### Snippet
```java

    @Override
    public void spoolOut(final String fileName, final String mimeType, final IOConsumer<OutputStream> streamConsumer) throws IOException {
        final Path path = this.basePath.resolve(fileName);
        Files.createDirectories(path.getParent());
```

### BoundedWildcard
Can generalize to `? super PayloadProcessor`
in `rpm/src/main/java/org/eclipse/packager/rpm/build/PayloadRecorder.java`
#### Snippet
```java
     * @param consumer The code to run.
     */
    private void forEach(final Consumer<PayloadProcessor> consumer) {
        this.processors.forEach(consumer);
    }
```

### BoundedWildcard
Can generalize to `? super CpioArchiveEntry`
in `rpm/src/main/java/org/eclipse/packager/rpm/build/PayloadRecorder.java`
#### Snippet
```java
    }

    public Result addSymbolicLink(final String targetPath, final String linkTo, final Consumer<CpioArchiveEntry> customizer) throws IOException {
        checkFinished();

```

### BoundedWildcard
Can generalize to `? super CpioArchiveEntry`
in `rpm/src/main/java/org/eclipse/packager/rpm/build/PayloadRecorder.java`
#### Snippet
```java
    }

    public Result addFile(final String targetPath, final Path path, final Consumer<CpioArchiveEntry> customizer) throws IOException {
        checkFinished();

```

### BoundedWildcard
Can generalize to `? super ByteBuffer`
in `rpm/src/main/java/org/eclipse/packager/rpm/build/PayloadRecorder.java`
#### Snippet
```java
        private final Consumer<ByteBuffer> consumer;

        ProcessorStream(final OutputStream out, final Consumer<ByteBuffer> consumer) {
            super(out);
            this.consumer = consumer;
```

### BoundedWildcard
Can generalize to `? super CpioArchiveEntry`
in `rpm/src/main/java/org/eclipse/packager/rpm/build/PayloadRecorder.java`
#### Snippet
```java
    }

    public Result addDirectory(final String targetPath, final Consumer<CpioArchiveEntry> customizer) throws IOException {
        checkFinished();

```

### BoundedWildcard
Can generalize to `? super CpioArchiveEntry`
in `rpm/src/main/java/org/eclipse/packager/rpm/build/PayloadRecorder.java`
#### Snippet
```java
    }

    public Result addFile(final String targetPath, final ByteBuffer data, final Consumer<CpioArchiveEntry> customizer) throws IOException {
        checkFinished();

```

### BoundedWildcard
Can generalize to `? extends ProviderRule`
in `rpm/src/main/java/org/eclipse/packager/rpm/build/BuilderContext.java`
#### Snippet
```java
    }

    public static <T> FileInformationProvider<T> multiProvider(final FileInformationProvider<Object> defaultProvider, final List<ProviderRule<?>> rules) {
        Objects.requireNonNull(defaultProvider);
        Objects.requireNonNull(rules);
```

### BoundedWildcard
Can generalize to `? super Dependency`
in `rpm/src/main/java/org/eclipse/packager/rpm/coding/XZPayloadCoding.java`
#### Snippet
```java

    @Override
    public void fillRequirements(final Consumer<Dependency> requirementsConsumer) {
        requirementsConsumer.accept(new Dependency("PayloadIsXz", "5.2-1", RpmDependencyFlags.LESS, RpmDependencyFlags.EQUAL, RpmDependencyFlags.RPMLIB));
    }
```

### BoundedWildcard
Can generalize to `? extends PayloadCodingProvider`
in `rpm/src/main/java/org/eclipse/packager/rpm/coding/PayloadCoding.java`
#### Snippet
```java
    private final Supplier<PayloadCodingProvider> newInstanceSupplier;

    PayloadCoding(final String value, final Supplier<PayloadCodingProvider> newInstanceSupplier) {
        this.value = value;
        this.newInstanceSupplier = newInstanceSupplier;
```

### BoundedWildcard
Can generalize to `? super RpmTag`
in `rpm/src/main/java/org/eclipse/packager/rpm/info/RpmInformations.java`
#### Snippet
```java
    }

    public static List<Dependency> makeDependencies(final InputHeader<RpmTag> header, final RpmTag namesTag, final RpmTag versionsTag, final RpmTag flagsTag) {
        Object namesVal = header.getTag(namesTag);
        Object versionsVal = header.getTag(versionsTag);
```

### BoundedWildcard
Can generalize to `? extends E`
in `rpm/src/main/java/org/eclipse/packager/rpm/header/Header.java`
#### Snippet
```java
    }

    public static <E, T extends RpmBaseTag> void putLongFields(final Header<T> header, final Collection<E> entries, final T tag, final ToLongFunction<E> func) {
        if (entries.isEmpty()) {
            return;
```

### BoundedWildcard
Can generalize to `? super E`
in `rpm/src/main/java/org/eclipse/packager/rpm/header/Header.java`
#### Snippet
```java
    }

    public static <E, T extends RpmBaseTag> void putLongFields(final Header<T> header, final Collection<E> entries, final T tag, final ToLongFunction<E> func) {
        if (entries.isEmpty()) {
            return;
```

### BoundedWildcard
Can generalize to `? extends E`
in `rpm/src/main/java/org/eclipse/packager/rpm/header/Header.java`
#### Snippet
```java
    }

    public static <E, T extends RpmBaseTag> void putShortFields(final Header<T> header, final Collection<E> entries, final T tag, final ToShortFunction<E> func) {
        if (entries.isEmpty()) {
            return;
```

### BoundedWildcard
Can generalize to `? super E`
in `rpm/src/main/java/org/eclipse/packager/rpm/header/Header.java`
#### Snippet
```java
    }

    public static <E, T extends RpmBaseTag> void putShortFields(final Header<T> header, final Collection<E> entries, final T tag, final ToShortFunction<E> func) {
        if (entries.isEmpty()) {
            return;
```

### BoundedWildcard
Can generalize to `? extends E`
in `rpm/src/main/java/org/eclipse/packager/rpm/header/Header.java`
#### Snippet
```java
    }

    public static <E, V, T extends RpmBaseTag> void putFields(final Header<T> header, final Collection<E> entries, final T tag, final ArrayAllocator<V> arrayAllocator, final Function<E, V> func, final Putter<T, V> putter) {
        if (entries.isEmpty()) {
            return;
```

### BoundedWildcard
Can generalize to `? extends V`
in `rpm/src/main/java/org/eclipse/packager/rpm/header/Header.java`
#### Snippet
```java
    }

    public static <E, V, T extends RpmBaseTag> void putFields(final Header<T> header, final Collection<E> entries, final T tag, final ArrayAllocator<V> arrayAllocator, final Function<E, V> func, final Putter<T, V> putter) {
        if (entries.isEmpty()) {
            return;
```

### BoundedWildcard
Can generalize to `? super E`
in `rpm/src/main/java/org/eclipse/packager/rpm/header/Header.java`
#### Snippet
```java
    }

    public static <E, V, T extends RpmBaseTag> void putFields(final Header<T> header, final Collection<E> entries, final T tag, final ArrayAllocator<V> arrayAllocator, final Function<E, V> func, final Putter<T, V> putter) {
        if (entries.isEmpty()) {
            return;
```

### BoundedWildcard
Can generalize to `? extends V`
in `rpm/src/main/java/org/eclipse/packager/rpm/header/Header.java`
#### Snippet
```java
    }

    public static <E, V, T extends RpmBaseTag> void putFields(final Header<T> header, final Collection<E> entries, final T tag, final ArrayAllocator<V> arrayAllocator, final Function<E, V> func, final Putter<T, V> putter) {
        if (entries.isEmpty()) {
            return;
```

### BoundedWildcard
Can generalize to `? super V`
in `rpm/src/main/java/org/eclipse/packager/rpm/header/Header.java`
#### Snippet
```java
    }

    public static <E, V, T extends RpmBaseTag> void putFields(final Header<T> header, final Collection<E> entries, final T tag, final ArrayAllocator<V> arrayAllocator, final Function<E, V> func, final Putter<T, V> putter) {
        if (entries.isEmpty()) {
            return;
```

### BoundedWildcard
Can generalize to `? extends E`
in `rpm/src/main/java/org/eclipse/packager/rpm/header/Header.java`
#### Snippet
```java
    }

    public static <E, T extends RpmBaseTag> void putIntFields(final Header<T> header, final Collection<E> entries, final T tag, final ToIntFunction<E> func) {
        if (entries.isEmpty()) {
            return;
```

### BoundedWildcard
Can generalize to `? super E`
in `rpm/src/main/java/org/eclipse/packager/rpm/header/Header.java`
#### Snippet
```java
    }

    public static <E, T extends RpmBaseTag> void putIntFields(final Header<T> header, final Collection<E> entries, final T tag, final ToIntFunction<E> func) {
        if (entries.isEmpty()) {
            return;
```

### BoundedWildcard
Can generalize to `? super Dependency`
in `rpm/src/main/java/org/eclipse/packager/rpm/coding/LZMAPayloadCoding.java`
#### Snippet
```java

    @Override
    public void fillRequirements(final Consumer<Dependency> requirementsConsumer) {
        requirementsConsumer.accept(new Dependency("PayloadIsLzma", "4.4.6-1", RpmDependencyFlags.LESS, RpmDependencyFlags.EQUAL, RpmDependencyFlags.RPMLIB));
    }
```

### BoundedWildcard
Can generalize to `? extends SignatureProcessor`
in `rpm/src/main/java/org/eclipse/packager/rpm/build/RpmWriter.java`
#### Snippet
```java
    }

    public void addAllSignatureProcessors(final List<SignatureProcessor> signatureProcessors) {
        this.signatureProcessors.addAll(signatureProcessors);
    }
```

### BoundedWildcard
Can generalize to `? super T`
in `rpm/src/main/java/org/eclipse/packager/rpm/build/FileInformationProvider.java`
#### Snippet
```java
    public FileInformation provide(String targetName, T object, PayloadEntryType type) throws IOException;

    public default FileInformationProvider<T> customize(final FileInformationCustomizer<T> customizer) {
        if (customizer == null) {
            return this;
```

### BoundedWildcard
Can generalize to `? super OutputStream`
in `core/src/main/java/org/eclipse/packager/io/OutputSpooler.java`
#### Snippet
```java
        }

        protected void forEach(final IOConsumer<OutputStream> consumer) throws IOException {
            for (final OutputStream stream : this.streams) {
                consumer.accept(stream);
```

### BoundedWildcard
Can generalize to `? extends OutputStream`
in `core/src/main/java/org/eclipse/packager/io/OutputSpooler.java`
#### Snippet
```java
    }

    static void closeAll(final Stream<OutputStream> stream) throws IOException {
        final List<Exception> ex = new LinkedList<>();

```

### BoundedWildcard
Can generalize to `? super OutputStream`
in `core/src/main/java/org/eclipse/packager/io/OutputSpooler.java`
#### Snippet
```java
    }

    public void open(final IOConsumer<OutputStream> consumer) throws IOException {
        final List<OutputStream> streams = new LinkedList<>();

```

### BoundedWildcard
Can generalize to `? extends Entry`
in `core/src/main/java/org/eclipse/packager/io/OutputSpooler.java`
#### Snippet
```java
    }

    protected void openNext(final List<OutputStream> streams, final Iterator<Entry<String, OutputEntry>> entries, final IOConsumer<List<OutputStream>> streamsConsumer) throws IOException {
        if (!entries.hasNext()) {
            streamsConsumer.accept(streams);
```

### BoundedWildcard
Can generalize to `? super List`
in `core/src/main/java/org/eclipse/packager/io/OutputSpooler.java`
#### Snippet
```java
    }

    protected void openNext(final List<OutputStream> streams, final Iterator<Entry<String, OutputEntry>> entries, final IOConsumer<List<OutputStream>> streamsConsumer) throws IOException {
        if (!entries.hasNext()) {
            streamsConsumer.accept(streams);
```

### BoundedWildcard
Can generalize to `? super Dependency`
in `rpm/src/main/java/org/eclipse/packager/rpm/coding/ZstdPayloadCoding.java`
#### Snippet
```java

    @Override
    public void fillRequirements(final Consumer<Dependency> requirementsConsumer) {
        requirementsConsumer.accept(new Dependency("PayloadIsZstd", "5.4.18-1", RpmDependencyFlags.LESS, RpmDependencyFlags.EQUAL, RpmDependencyFlags.RPMLIB));
    }
```

### BoundedWildcard
Can generalize to `? super RpmSignatureTag`
in `rpm/src/main/java/org/eclipse/packager/rpm/signature/RsaSignatureProcessor.java`
#### Snippet
```java

    @Override
    public void finish(final Header<RpmSignatureTag> signature) {
        try {
            byte[] value = this.signatureGenerator.generate().getEncoded();
```

### BoundedWildcard
Can generalize to `? super ByteBuffer`
in `rpm/src/main/java/org/eclipse/packager/rpm/parse/HeaderValue.java`
#### Snippet
```java
    }

    private <R> Object getFromStore(final ByteBuffer data, final boolean collapse, final IOFunction<ByteBuffer, R> func, final Function<Integer, R[]> creator) throws IOException {
        data.position(this.index);
        if (this.count == 1 && collapse) {
```

### BoundedWildcard
Can generalize to `? extends R`
in `rpm/src/main/java/org/eclipse/packager/rpm/parse/HeaderValue.java`
#### Snippet
```java
    }

    private <R> Object getFromStore(final ByteBuffer data, final boolean collapse, final IOFunction<ByteBuffer, R> func, final Function<Integer, R[]> creator) throws IOException {
        data.position(this.index);
        if (this.count == 1 && collapse) {
```

### BoundedWildcard
Can generalize to `? super Integer`
in `rpm/src/main/java/org/eclipse/packager/rpm/parse/HeaderValue.java`
#### Snippet
```java
    }

    private <R> Object getFromStore(final ByteBuffer data, final boolean collapse, final IOFunction<ByteBuffer, R> func, final Function<Integer, R[]> creator) throws IOException {
        data.position(this.index);
        if (this.count == 1 && collapse) {
```

### BoundedWildcard
Can generalize to `? super RpmTag`
in `rpm/src/main/java/org/eclipse/packager/rpm/build/LeadBuilder.java`
#### Snippet
```java
    }

    public void fillFlagsFromHeader(final Header<RpmTag> header, final Function<String, Optional<Architecture>> architectureMapper, final Function<String, Optional<OperatingSystem>> operatingSystemMapper) {
        Objects.requireNonNull(header);
        Objects.requireNonNull(architectureMapper);
```

### BoundedWildcard
Can generalize to `? super String`
in `rpm/src/main/java/org/eclipse/packager/rpm/build/LeadBuilder.java`
#### Snippet
```java
    }

    public void fillFlagsFromHeader(final Header<RpmTag> header, final Function<String, Optional<Architecture>> architectureMapper, final Function<String, Optional<OperatingSystem>> operatingSystemMapper) {
        Objects.requireNonNull(header);
        Objects.requireNonNull(architectureMapper);
```

### BoundedWildcard
Can generalize to `? super String`
in `rpm/src/main/java/org/eclipse/packager/rpm/build/LeadBuilder.java`
#### Snippet
```java
    }

    public void fillFlagsFromHeader(final Header<RpmTag> header, final Function<String, Optional<Architecture>> architectureMapper, final Function<String, Optional<OperatingSystem>> operatingSystemMapper) {
        Objects.requireNonNull(header);
        Objects.requireNonNull(architectureMapper);
```

### BoundedWildcard
Can generalize to `? super RpmTag`
in `rpm/src/main/java/org/eclipse/packager/rpm/deps/Dependencies.java`
#### Snippet
```java
    }

    private static List<Dependency> getDependencies(final ReadableHeader<RpmTag> header, final RpmTag namesTag, final RpmTag versionsTag, final RpmTag flagsTag) {
        Objects.requireNonNull(header);

```

### BoundedWildcard
Can generalize to `? super RpmTag`
in `rpm/src/main/java/org/eclipse/packager/rpm/deps/Dependencies.java`
#### Snippet
```java
    }

    private static void putDependencies(final Header<RpmTag> header, final Collection<Dependency> dependencies, final RpmTag namesTag, final RpmTag versionsTag, final RpmTag flagsTag) {
        if (dependencies.isEmpty()) {
            return;
```

### BoundedWildcard
Can generalize to `? extends Dependency`
in `rpm/src/main/java/org/eclipse/packager/rpm/deps/Dependencies.java`
#### Snippet
```java
    }

    private static void putDependencies(final Header<RpmTag> header, final Collection<Dependency> dependencies, final RpmTag namesTag, final RpmTag versionsTag, final RpmTag flagsTag) {
        if (dependencies.isEmpty()) {
            return;
```

### BoundedWildcard
Can generalize to `? extends Supplier`
in `deb/src/main/java/org/eclipse/packager/deb/build/DebianPackageWriter.java`
#### Snippet
```java
    }

    private static void applyTimestamp(final TarArchiveEntry entry, final Optional<Supplier<Instant>> timestampSupplier) {
        timestampSupplier.map(Supplier::get).map(Instant::toEpochMilli).ifPresent(entry::setModTime);
    }
```

### BoundedWildcard
Can generalize to `? super FileEntry`
in `rpm/src/main/java/org/eclipse/packager/rpm/build/RpmBuilder.java`
#### Snippet
```java
    }

    private void addDirectory(final String targetName, final int mode, final Instant modInstant, final Consumer<FileEntry> customizer) throws IOException {
        final PathName pathName = PathName.parse(targetName);

```

### BoundedWildcard
Can generalize to `? super Header`
in `rpm/src/main/java/org/eclipse/packager/rpm/build/RpmBuilder.java`
#### Snippet
```java
    }

    public void setHeaderCustomizer(final Consumer<Header<RpmTag>> headerCustomizer) {
        this.headerCustomizer = headerCustomizer;
    }
```

### BoundedWildcard
Can generalize to `? super FileEntry`
in `rpm/src/main/java/org/eclipse/packager/rpm/build/RpmBuilder.java`
#### Snippet
```java
    }

    private void addResult(final PathName targetName, final Result result, final Consumer<FileEntry> customizer) {
        final FileEntry entry = new FileEntry();

```

### BoundedWildcard
Can generalize to `? extends FileEntry`
in `rpm/src/main/java/org/eclipse/packager/rpm/build/RpmBuilder.java`
#### Snippet
```java
    }

    private static boolean needLong(final Collection<FileEntry> files, final ToLongFunction<FileEntry> func) {
        return files.stream().anyMatch(file -> func.applyAsLong(file) > Integer.MAX_VALUE);
    }
```

### BoundedWildcard
Can generalize to `? super FileEntry`
in `rpm/src/main/java/org/eclipse/packager/rpm/build/RpmBuilder.java`
#### Snippet
```java
    }

    private static boolean needLong(final Collection<FileEntry> files, final ToLongFunction<FileEntry> func) {
        return files.stream().anyMatch(file -> func.applyAsLong(file) > Integer.MAX_VALUE);
    }
```

### BoundedWildcard
Can generalize to `? super FileEntry`
in `rpm/src/main/java/org/eclipse/packager/rpm/build/RpmBuilder.java`
#### Snippet
```java
    }

    private void addSymbolicLink(final String targetName, final String linkTo, final int mode, final Instant modInstant, final Consumer<FileEntry> customizer) throws IOException {
        final PathName pathName = PathName.parse(targetName);

```

### BoundedWildcard
Can generalize to `? super RpmTag`
in `rpm/src/main/java/org/eclipse/packager/rpm/build/RpmBuilder.java`
#### Snippet
```java
    }

    private static void putNumber(final LongMode longMode, final Header<RpmTag> header, final Collection<FileEntry> files, final RpmTag tag, final ToLongFunction<FileEntry> func) {
        boolean useLong;
        if (longMode == LongMode.FORCE_64BIT) {
```

### BoundedWildcard
Can generalize to `? super FileEntry`
in `rpm/src/main/java/org/eclipse/packager/rpm/build/RpmBuilder.java`
#### Snippet
```java
    }

    private <T> void addFile(final String targetName, final T sourcePath, final Consumer<FileEntry> customizer, final int mode, final Instant fileModificationInstant, final RecorderFunction<T> func) throws IOException {
        final PathName pathName = PathName.parse(targetName);

```

## RuleId[id=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `final static`
in `rpm/src/main/java/org/eclipse/packager/rpm/RpmSignatureTag.java`
#### Snippet
```java
    }

    private final static Map<Integer, RpmSignatureTag> all = new HashMap<>(RpmSignatureTag.values().length);

    static {
```

### MissortedModifiers
Missorted modifiers `final static`
in `rpm/src/main/java/org/eclipse/packager/rpm/signature/RsaHeaderSignatureProcessor.java`
#### Snippet
```java
 */
public class RsaHeaderSignatureProcessor implements SignatureProcessor {
    private final static Logger logger = LoggerFactory.getLogger(RsaHeaderSignatureProcessor.class);

    private final PGPPrivateKey privateKey;
```

### MissortedModifiers
Missorted modifiers `final static`
in `rpm/src/main/java/org/eclipse/packager/rpm/parse/RpmInputStream.java`
#### Snippet
```java

public class RpmInputStream extends InputStream {
    private final static Logger logger = LoggerFactory.getLogger(RpmInputStream.class);

    private static final byte[] DUMMY = new byte[128];
```

### MissortedModifiers
Missorted modifiers `final static`
in `rpm/src/main/java/org/eclipse/packager/rpm/build/RpmWriter.java`
#### Snippet
```java
    private static final OpenOption[] DEFAULT_OPEN_OPTIONS = new OpenOption[] { StandardOpenOption.CREATE, StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING };

    private final static Logger logger = LoggerFactory.getLogger(RpmWriter.class);

    private final FileChannel file;
```

### MissortedModifiers
Missorted modifiers `final static`
in `rpm/src/main/java/org/eclipse/packager/rpm/RpmTag.java`
#### Snippet
```java
    }

    private final static Map<Integer, RpmTag> all = new HashMap<>(RpmTag.values().length);

    static {
```

### MissortedModifiers
Missorted modifiers `final static`
in `rpm/src/main/java/org/eclipse/packager/rpm/Rpms.java`
#### Snippet
```java

public class Rpms {
    private final static char[] HEX = "0123456789ABCDEF".toCharArray();

    public static final byte[] LEAD_MAGIC = new byte[] { (byte) 0xED, (byte) 0xAB, (byte) 0xEE, (byte) 0xDB };
```

### MissortedModifiers
Missorted modifiers `final static`
in `rpm/src/main/java/org/eclipse/packager/rpm/signature/RsaSignatureProcessor.java`
#### Snippet
```java
 */
public class RsaSignatureProcessor implements SignatureProcessor {
    private final static Logger logger = LoggerFactory.getLogger(RsaSignatureProcessor.class);

    private final PGPSignatureGenerator signatureGenerator;
```

### MissortedModifiers
Missorted modifiers `static abstract`
in `rpm/src/main/java/org/eclipse/packager/rpm/build/RpmBuilder.java`
#### Snippet
```java
    }

    private static abstract class BuilderContextImpl implements BuilderContext {
        private FileInformationProvider<Object> defaultProvider = BuilderContext.defaultProvider();

```

## RuleId[id=IgnoreResultOfCall]
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
`Optional` used as type for field 'release'
in `rpm/src/main/java/org/eclipse/packager/rpm/RpmVersion.java`
#### Snippet
```java
    private final String version;

    private final Optional<String> release;

    public RpmVersion(final String version) {
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
`Optional` used as type for field 'payloadFlags'
in `rpm/src/main/java/org/eclipse/packager/rpm/build/PayloadRecorder.java`
#### Snippet
```java
        private final PayloadCoding payloadCoding;

        private final Optional<String> payloadFlags;

        private Header<RpmTag> additionalHeader = new Header<>();
```

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

    public void addFile(final File file, final String fileName, final EntryInformation entryInformation, final Optional<Supplier<Instant>> timestampSupplier) throws IOException {
        addFile(new FileContentProvider(file), fileName, entryInformation, timestampSupplier);
    }
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

    private void checkCreateParents(final String fileName, final Optional<Supplier<Instant>> timestampSupplier) throws IOException {
        final String toks[] = fileName.split("/+");

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

## RuleId[id=UnnecessaryUnboxing]
### UnnecessaryUnboxing
Unnecessary unboxing
in `rpm/src/main/java/org/eclipse/packager/rpm/RpmTagValue.java`
#### Snippet
```java

        if (this.value instanceof Long) {
            return Optional.of(((Long) this.value).longValue());
        }

```

## RuleId[id=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `rpm/src/main/java/org/eclipse/packager/rpm/app/Dumper.java`
#### Snippet
```java

        if (!SKIP_META) {
            System.out.format("Version: %s.%s%n", lead.getMajor(), lead.getMinor());
            System.out.format("Name: %s%n", lead.getName());
            System.out.format("Signature Version: %s%n", lead.getSignatureVersion());
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `rpm/src/main/java/org/eclipse/packager/rpm/app/Dumper.java`
#### Snippet
```java
        if (!SKIP_META) {
            System.out.format("Version: %s.%s%n", lead.getMajor(), lead.getMinor());
            System.out.format("Name: %s%n", lead.getName());
            System.out.format("Signature Version: %s%n", lead.getSignatureVersion());
            System.out.format("Type: %s, Arch: %s, OS: %s%n", dumpFlag(lead.getType(), Type::fromValue), dumpFlag(lead.getArchitecture(), Architecture::fromValue), dumpFlag(lead.getOperatingSystem(), OperatingSystem::fromValue));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `rpm/src/main/java/org/eclipse/packager/rpm/app/Dumper.java`
#### Snippet
```java
            System.out.format("Version: %s.%s%n", lead.getMajor(), lead.getMinor());
            System.out.format("Name: %s%n", lead.getName());
            System.out.format("Signature Version: %s%n", lead.getSignatureVersion());
            System.out.format("Type: %s, Arch: %s, OS: %s%n", dumpFlag(lead.getType(), Type::fromValue), dumpFlag(lead.getArchitecture(), Architecture::fromValue), dumpFlag(lead.getOperatingSystem(), OperatingSystem::fromValue));
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `rpm/src/main/java/org/eclipse/packager/rpm/app/Dumper.java`
#### Snippet
```java
            System.out.format("Name: %s%n", lead.getName());
            System.out.format("Signature Version: %s%n", lead.getSignatureVersion());
            System.out.format("Type: %s, Arch: %s, OS: %s%n", dumpFlag(lead.getType(), Type::fromValue), dumpFlag(lead.getArchitecture(), Architecture::fromValue), dumpFlag(lead.getOperatingSystem(), OperatingSystem::fromValue));
        }

```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `rpm/src/main/java/org/eclipse/packager/rpm/app/Dumper.java`
#### Snippet
```java
    private static void dump(final Path path) {
        if (!Files.exists(path)) {
            System.err.format("%s: does not exist%n", path);
            return;
        }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `rpm/src/main/java/org/eclipse/packager/rpm/app/Dumper.java`
#### Snippet
```java
            Dumper.dumpAll(in);
        } catch (final Exception e) {
            System.err.format("%s: failed to read file%n", path);
            e.printStackTrace(System.err);
        }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `rpm/src/main/java/org/eclipse/packager/rpm/app/Dumper.java`
#### Snippet
```java
        } catch (final Exception e) {
            System.err.format("%s: failed to read file%n", path);
            e.printStackTrace(System.err);
        }
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `rpm/src/main/java/org/eclipse/packager/rpm/app/Dumper.java`
#### Snippet
```java

        for (int i = 0; i < names.length; i++) {
            System.out.format("%s: %s - %s - %s %s%n", string, names[i], versions[i], flags[i], RpmDependencyFlags.parse(flags[i]));
        }
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `rpm/src/main/java/org/eclipse/packager/rpm/app/Dumper.java`
#### Snippet
```java

    private static void dumpEntry(final CpioArchiveEntry entry) {
        System.out.format("-----------------------------------%n");
        System.out.format(" %s%n", entry.getName());
        System.out.format(" Size: %s, Chksum: %016x, Align: %s, Inode: %016x, Mode: %08o, NoL: %s, Device: %s.%s%n", entry.getSize(), entry.getChksum(), entry.getAlignmentBoundary(), entry.getInode(), entry.getMode(), entry.getNumberOfLinks(), entry.getDeviceMaj(), entry.getDeviceMin());
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `rpm/src/main/java/org/eclipse/packager/rpm/app/Dumper.java`
#### Snippet
```java
    private static void dumpEntry(final CpioArchiveEntry entry) {
        System.out.format("-----------------------------------%n");
        System.out.format(" %s%n", entry.getName());
        System.out.format(" Size: %s, Chksum: %016x, Align: %s, Inode: %016x, Mode: %08o, NoL: %s, Device: %s.%s%n", entry.getSize(), entry.getChksum(), entry.getAlignmentBoundary(), entry.getInode(), entry.getMode(), entry.getNumberOfLinks(), entry.getDeviceMaj(), entry.getDeviceMin());
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `rpm/src/main/java/org/eclipse/packager/rpm/app/Dumper.java`
#### Snippet
```java
        System.out.format("-----------------------------------%n");
        System.out.format(" %s%n", entry.getName());
        System.out.format(" Size: %s, Chksum: %016x, Align: %s, Inode: %016x, Mode: %08o, NoL: %s, Device: %s.%s%n", entry.getSize(), entry.getChksum(), entry.getAlignmentBoundary(), entry.getInode(), entry.getMode(), entry.getNumberOfLinks(), entry.getDeviceMaj(), entry.getDeviceMin());
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `rpm/src/main/java/org/eclipse/packager/rpm/app/Dumper.java`
#### Snippet
```java

    private static void dumpHeader(final String string, final InputHeader<? extends RpmBaseTag> header, final Function<Integer, Object> func, final boolean sorted) {
        System.out.println(string);
        System.out.println("=================================");

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `rpm/src/main/java/org/eclipse/packager/rpm/app/Dumper.java`
#### Snippet
```java
    private static void dumpHeader(final String string, final InputHeader<? extends RpmBaseTag> header, final Function<Integer, Object> func, final boolean sorted) {
        System.out.println(string);
        System.out.println("=================================");

        Set<Entry<Integer, HeaderValue>> data;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `rpm/src/main/java/org/eclipse/packager/rpm/app/Dumper.java`
#### Snippet
```java
            }

            System.out.format("%20s - %s%n", tag, Rpms.dumpValue(entry.getValue()));

            if (entry.getKey() == 62 || entry.getKey() == 63) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `rpm/src/main/java/org/eclipse/packager/rpm/app/Dumper.java`
#### Snippet
```java
            if (entry.getKey() == 62 || entry.getKey() == 63) {
                final ByteBuffer buf = ByteBuffer.wrap((byte[]) entry.getValue().getValue());
                System.out.format("Immutable - tag: %s, type: %s, position: %s, count: %s%n", buf.getInt(), buf.getInt(), buf.getInt(), buf.getInt());
            }
        }
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

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `deb/src/main/java/org/eclipse/packager/deb/build/TextFileContentProvider.java`
#### Snippet
```java

    private static String fix(final String data) {
        return data.replace("\r\n", "\n");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `rpm/src/main/java/org/eclipse/packager/rpm/Architecture.java`
#### Snippet
```java
            MAP.put((int) arch.value, arch);
            ALTMAP.put(arch.name().toLowerCase(), arch);
            for (final String alias : getAliases(arch).split(",\\s")) {
                ALTMAP.put(alias.toLowerCase(), arch);
            }
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `rpm/src/main/java/org/eclipse/packager/rpm/PathName.java`
#### Snippet
```java

    public static PathName parse(final String name) {
        final String[] parsed = name.split("/+");

        final List<String> segs = new ArrayList<>(parsed.length);
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `rpm/src/main/java/org/eclipse/packager/rpm/yum/RepositoryCreator.java`
#### Snippet
```java
        this.primaryDirs = Arrays.stream(dirFilter.split(",")).map(re -> Pattern.compile(re)).collect(Collectors.toList());

        this.primaryUniqueName = UUID.randomUUID().toString().replace("-", "");
        this.filelistsUniqueName = UUID.randomUUID().toString().replace("-", "");
        this.otherUniqueName = UUID.randomUUID().toString().replace("-", "");
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `rpm/src/main/java/org/eclipse/packager/rpm/yum/RepositoryCreator.java`
#### Snippet
```java

        this.primaryUniqueName = UUID.randomUUID().toString().replace("-", "");
        this.filelistsUniqueName = UUID.randomUUID().toString().replace("-", "");
        this.otherUniqueName = UUID.randomUUID().toString().replace("-", "");

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `rpm/src/main/java/org/eclipse/packager/rpm/yum/RepositoryCreator.java`
#### Snippet
```java
        this.primaryUniqueName = UUID.randomUUID().toString().replace("-", "");
        this.filelistsUniqueName = UUID.randomUUID().toString().replace("-", "");
        this.otherUniqueName = UUID.randomUUID().toString().replace("-", "");

        // primary
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `rpm/src/main/java/org/eclipse/packager/rpm/OperatingSystem.java`
#### Snippet
```java
            MAP.put((int) os.value, os);
            ALTMAP.put(os.name().toLowerCase(), os);
            for (final String alias : getAliases(os).split(",\\s")) {
                ALTMAP.put(alias.toLowerCase(), os);
            }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `deb/src/main/java/org/eclipse/packager/deb/FieldFormatter.java`
#### Snippet
```java
            }

            value = value.replaceAll("[\\n\\r]", "");
            appendable.append(value);
        }
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `deb/src/main/java/org/eclipse/packager/deb/FieldFormatter.java`
#### Snippet
```java
            }

            final String[] lines = value.split("\\n");
            appendLines(appendable, lines);
        }
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `deb/src/main/java/org/eclipse/packager/deb/FieldFormatter.java`
#### Snippet
```java
            appendable.append(key).append(':');

            final String[] lines = value.split("\\n");
            if (lines.length > 0 && !lines[0].isEmpty()) {
                appendable.append(' ');
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `deb/src/main/java/org/eclipse/packager/deb/build/DebianPackageWriter.java`
#### Snippet
```java

    private void checkCreateParents(final String fileName, final Optional<Supplier<Instant>> timestampSupplier) throws IOException {
        final String toks[] = fileName.split("/+");

        String current = "";
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `deb/src/main/java/org/eclipse/packager/deb/build/DebianPackageWriter.java`
#### Snippet
```java
        }

        fileName = fileName.replace("\\", "/"); // just in case we get windows paths
        fileName = fileName.replace("/+", "/");

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `deb/src/main/java/org/eclipse/packager/deb/build/DebianPackageWriter.java`
#### Snippet
```java

        fileName = fileName.replace("\\", "/"); // just in case we get windows paths
        fileName = fileName.replace("/+", "/");

        if (fileName.startsWith("./")) {
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `java.util.stream` is unnecessary and can be removed
in `core/src/main/java/org/eclipse/packager/io/OutputSpooler.java`
#### Snippet
```java
        @Override
        public void close() throws IOException {
            final java.util.stream.Stream<OutputStream> s = Arrays.stream(this.streams);
            OutputSpooler.closeAll(s);
        }
```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `rpm/src/main/java/org/eclipse/packager/rpm/coding/BZip2PayloadCoding.java`
#### Snippet
```java
        final int blockSize;

        if (optionalFlags.isPresent() && (flags = optionalFlags.get()).length() > 0) {
            blockSize = Integer.parseInt(flags.substring(0, 1));
        } else {
```

### NestedAssignment
Result of assignment expression used
in `rpm/src/main/java/org/eclipse/packager/rpm/app/Dumper.java`
#### Snippet
```java
            final CpioArchiveInputStream cpio = in.getCpioStream();
            CpioArchiveEntry entry;
            while ((entry = cpio.getNextCPIOEntry()) != null) {
                dumpEntry(entry);
            }
```

### NestedAssignment
Result of assignment expression used
in `rpm/src/main/java/org/eclipse/packager/rpm/coding/GzipPayloadCoding.java`
#### Snippet
```java
        final int compressionLevel;

        if (optionalFlags.isPresent() && (flags = optionalFlags.get()).length() > 0) {
            compressionLevel = Integer.parseInt(flags.substring(0, 1));
        } else {
```

### NestedAssignment
Result of assignment expression used
in `rpm/src/main/java/org/eclipse/packager/rpm/coding/XZPayloadCoding.java`
#### Snippet
```java
        final int preset;

        if (optionalFlags.isPresent() && (flags = optionalFlags.get()).length() > 0) {
            preset = Integer.parseInt(flags.substring(0, 1));
        } else {
```

### NestedAssignment
Result of assignment expression used
in `rpm/src/main/java/org/eclipse/packager/rpm/info/RpmInformations.java`
#### Snippet
```java
        final CpioArchiveInputStream cpio = in.getCpioStream();
        CpioArchiveEntry cpioEntry;
        while ((cpioEntry = cpio.getNextCPIOEntry()) != null) {
            final String name = normalize(cpioEntry.getName());

```

### NestedAssignment
Result of assignment expression used
in `deb/src/main/java/org/eclipse/packager/deb/ControlFileParser.java`
#### Snippet
```java
        StringBuilder currentValue = new StringBuilder();

        while ((line = reader.readLine()) != null) {
            if (line.isEmpty()) {
                break; // break - could a multi file
```

### NestedAssignment
Result of assignment expression used
in `deb/src/main/java/org/eclipse/packager/deb/ControlFileParser.java`
#### Snippet
```java
        final BufferedReader reader = new BufferedReader(inputReader);

        while ((entry = ControlFileParser.parseInternal(reader)) != null) {
            result.add(entry);
        }
```

### NestedAssignment
Result of assignment expression used
in `rpm/src/main/java/org/eclipse/packager/rpm/coding/ZstdPayloadCoding.java`
#### Snippet
```java
        final int level;

        if (optionalFlags.isPresent() && (flags = optionalFlags.get()).length() > 0) {
            level = Integer.parseInt(flags.substring(0, 1));
        } else {
```

### NestedAssignment
Result of assignment expression used
in `deb/src/main/java/org/eclipse/packager/deb/Packages.java`
#### Snippet
```java
        try (final ArArchiveInputStream in = new ArArchiveInputStream(new FileInputStream(packageFile))) {
            ArchiveEntry ar;
            while ((ar = in.getNextEntry()) != null) {
                if (!ar.getName().equals("control.tar.gz")) {
                    continue;
```

### NestedAssignment
Result of assignment expression used
in `deb/src/main/java/org/eclipse/packager/deb/Packages.java`
#### Snippet
```java
                try (final TarArchiveInputStream inputStream = new TarArchiveInputStream(new GZIPInputStream(in))) {
                    TarArchiveEntry te;
                    while ((te = inputStream.getNextTarEntry()) != null) {
                        String name = te.getName();
                        if (name.startsWith("./")) {
```

## RuleId[id=CodeBlock2Expr]
### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `rpm/src/main/java/org/eclipse/packager/rpm/yum/RepositoryCreator.java`
#### Snippet
```java
        final long now = System.currentTimeMillis();

        this.primaryStreamBuilder.open(primaryStream -> {
            this.filelistsStreamBuilder.open(filelistsStream -> {
                this.otherStreamBuilder.open(otherStream -> {
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `rpm/src/main/java/org/eclipse/packager/rpm/yum/RepositoryCreator.java`
#### Snippet
```java

        this.primaryStreamBuilder.open(primaryStream -> {
            this.filelistsStreamBuilder.open(filelistsStream -> {
                this.otherStreamBuilder.open(otherStream -> {
                    final ContextImpl ctx = makeContext(primaryStream, filelistsStream, otherStream);
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `rpm/src/main/java/org/eclipse/packager/rpm/yum/RepositoryCreator.java`
#### Snippet
```java
        });

        this.mdStreamBuilder.open(stream -> {
            writeRepoMd(stream, now);
        });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `deb/src/main/java/org/eclipse/packager/deb/build/DebianPackageWriter.java`
#### Snippet
```java
    public void addFile(final File file, final String fileName, final EntryInformation entryInformation) throws IOException {
        addFile(new FileContentProvider(file), fileName, entryInformation, Optional.of((Supplier<Instant>) () -> {
            return file == null || !file.canRead() ? null : Instant.ofEpochMilli(file.lastModified());
        }));
    }
```

## RuleId[id=Convert2Lambda]
### Convert2Lambda
Anonymous new SimpleFileInformationCustomizer() can be replaced with lambda
in `rpm/src/main/java/org/eclipse/packager/rpm/build/Defaults.java`
#### Snippet
```java
    }.customize(BuilderContext.pathCustomizer());

    static final SimpleFileInformationCustomizer NOW_TIMESTAMP_CUSTOMIZER = new SimpleFileInformationCustomizer() {

        @Override
```

### Convert2Lambda
Anonymous new FileInformationProvider() can be replaced with lambda
in `rpm/src/main/java/org/eclipse/packager/rpm/build/Defaults.java`
#### Snippet
```java
    });

    static final FileInformationProvider<Path> PATH_PROVIDER = new FileInformationProvider<Path>() {

        @Override
```

### Convert2Lambda
Anonymous new Predicate() can be replaced with lambda
in `core/src/main/java/org/eclipse/packager/security/pgp/PgpHelper.java`
#### Snippet
```java
        final long keyIdNum = Long.parseUnsignedLong(keyId, 16);

        return new Predicate<PGPSecretKey>() {

            @Override
```

### Convert2Lambda
Anonymous new FileInformationProvider() can be replaced with lambda
in `rpm/src/main/java/org/eclipse/packager/rpm/build/BuilderContext.java`
#### Snippet
```java
        Objects.requireNonNull(rules);

        return new FileInformationProvider<T>() {

            @Override
```

### Convert2Lambda
Anonymous new SimpleFileInformationCustomizer() can be replaced with lambda
in `rpm/src/main/java/org/eclipse/packager/rpm/build/BuilderContext.java`
#### Snippet
```java

    public static SimpleFileInformationCustomizer modeCustomizer(final short mode) {
        return new SimpleFileInformationCustomizer() {

            @Override
```

### Convert2Lambda
Anonymous new FileInformationCustomizer() can be replaced with lambda
in `rpm/src/main/java/org/eclipse/packager/rpm/build/BuilderContext.java`
#### Snippet
```java

    public static FileInformationCustomizer<Path> pathCustomizer() {
        return new FileInformationCustomizer<Path>() {

            @Override
```

### Convert2Lambda
Anonymous new FileInformationProvider() can be replaced with lambda
in `rpm/src/main/java/org/eclipse/packager/rpm/build/BuilderContext.java`
#### Snippet
```java

    public static <T> FileInformationProvider<T> simpleProvider(final int mode) {
        return new FileInformationProvider<T>() {

            @Override
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `0` is redundant
in `deb/src/main/java/org/eclipse/packager/deb/build/DebianPackageWriter.java`
#### Snippet
```java
    private final BinaryPackageControlFile packageControlFile;

    private long installedSize = 0;

    private final Map<String, String> checkSums = new TreeMap<>();
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `value`
in `rpm/src/main/java/org/eclipse/packager/rpm/header/Header.java`
#### Snippet
```java

        if (value <= 0) {
            value = 0;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `deb/src/main/java/org/eclipse/packager/deb/FieldFormatter.java`
#### Snippet
```java
            }

            value = value.replaceAll("[\\n\\r]", "");
            appendable.append(value);
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `entryInformation`
in `deb/src/main/java/org/eclipse/packager/deb/build/DebianPackageWriter.java`
#### Snippet
```java

        if (entryInformation == null) {
            entryInformation = EntryInformation.DEFAULT_FILE;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `fileName`
in `deb/src/main/java/org/eclipse/packager/deb/build/DebianPackageWriter.java`
#### Snippet
```java

        try {
            fileName = cleanupPath(fileName);

            if (entryInformation.isConfigurationFile()) {
```

### AssignmentToMethodParameter
Assignment to method parameter `directory`
in `deb/src/main/java/org/eclipse/packager/deb/build/DebianPackageWriter.java`
#### Snippet
```java
    @Override
    public void addDirectory(String directory, final EntryInformation entryInformation, final Optional<Supplier<Instant>> timestampSupplier) throws IOException {
        directory = cleanupPath(directory);
        if (!directory.endsWith("/")) {
            directory += Character.toString('/');
```

### AssignmentToMethodParameter
Assignment to method parameter `directory`
in `deb/src/main/java/org/eclipse/packager/deb/build/DebianPackageWriter.java`
#### Snippet
```java
        directory = cleanupPath(directory);
        if (!directory.endsWith("/")) {
            directory += Character.toString('/');
        }
        checkCreateParents(directory, timestampSupplier);
```

### AssignmentToMethodParameter
Assignment to method parameter `fileName`
in `deb/src/main/java/org/eclipse/packager/deb/build/DebianPackageWriter.java`
#### Snippet
```java
        }

        fileName = fileName.replace("\\", "/"); // just in case we get windows paths
        fileName = fileName.replace("/+", "/");

```

### AssignmentToMethodParameter
Assignment to method parameter `fileName`
in `deb/src/main/java/org/eclipse/packager/deb/build/DebianPackageWriter.java`
#### Snippet
```java

        fileName = fileName.replace("\\", "/"); // just in case we get windows paths
        fileName = fileName.replace("/+", "/");

        if (fileName.startsWith("./")) {
```

## RuleId[id=PointlessBitwiseExpression]
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

## RuleId[id=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-04-24-17-21-35.794.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `deb/src/main/java/org/eclipse/packager/deb/build/TextFileContentProvider.java`
#### Snippet
```java
            return new ByteArrayInputStream(this.data);
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `deb/src/main/java/org/eclipse/packager/deb/build/StaticContentProvider.java`
#### Snippet
```java
    public InputStream createInputStream() throws IOException {
        if (this.data == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `rpm/src/main/java/org/eclipse/packager/rpm/RpmVersion.java`
#### Snippet
```java
    public static RpmVersion valueOf(final String version) {
        if (version == null || version.isEmpty()) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `rpm/src/main/java/org/eclipse/packager/rpm/build/ProviderRule.java`
#### Snippet
```java
            return this.provider.provide(targetName, this.clazz.cast(object), type);
        }
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `deb/src/main/java/org/eclipse/packager/deb/build/ContentProvider.java`
#### Snippet
```java
        @Override
        public InputStream createInputStream() throws IOException {
            return null;
        }

```

### ReturnNull
Return of `null`
in `rpm/src/main/java/org/eclipse/packager/rpm/yum/RepositoryCreator.java`
#### Snippet
```java
        private Element addVersion(final Element pkg, final RpmInformation.Version version) {
            if (version == null) {
                return null;
            }

```

### ReturnNull
Return of `null`
in `rpm/src/main/java/org/eclipse/packager/rpm/coding/NullPayloadCoding.java`
#### Snippet
```java
    @Override
    public String getCoding() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `core/src/main/java/org/eclipse/packager/security/pgp/PgpHelper.java`
#### Snippet
```java
        }

        return null;
    }
}
```

### ReturnNull
Return of `null`
in `core/src/main/java/org/eclipse/packager/security/pgp/PgpHelper.java`
#### Snippet
```java
        final PGPSecretKey secretKey = loadSecretKey(input, keyId);
        if (secretKey == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `rpm/src/main/java/org/eclipse/packager/rpm/deps/RpmDependencyFlags.java`
#### Snippet
```java
    public static EnumSet<RpmDependencyFlags> parse(final Long flags) {
        if (flags == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `rpm/src/main/java/org/eclipse/packager/rpm/info/RpmInformations.java`
#### Snippet
```java
    public static String asString(final Object value) {
        if (value == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `rpm/src/main/java/org/eclipse/packager/rpm/info/RpmInformations.java`
#### Snippet
```java
                return values[0];
            }
            return null;
        }

```

### ReturnNull
Return of `null`
in `rpm/src/main/java/org/eclipse/packager/rpm/info/RpmInformations.java`
#### Snippet
```java
    public static Long asLong(final Object value) {
        if (value == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `rpm/src/main/java/org/eclipse/packager/rpm/info/RpmInformations.java`
#### Snippet
```java
            return Long.parseLong(value.toString());
        } catch (final NumberFormatException e) {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `deb/src/main/java/org/eclipse/packager/deb/ControlFileParser.java`
#### Snippet
```java
        if (line == null && result.isEmpty()) {
            // empty file or part
            return null;
        }

```

### ReturnNull
Return of `null`
in `deb/src/main/java/org/eclipse/packager/deb/build/FileContentProvider.java`
#### Snippet
```java
    public InputStream createInputStream() throws IOException {
        if (this.file == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `core/src/main/java/org/eclipse/packager/io/OutputSpooler.java`
#### Snippet
```java
    public String getChecksum(final String fileName, final String algorithm) {
        if (!this.digests.contains(algorithm)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `deb/src/main/java/org/eclipse/packager/deb/Packages.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `deb/src/main/java/org/eclipse/packager/deb/Packages.java`
#### Snippet
```java
    public static String makeDescriptionMd5(final String string) {
        if (string == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `deb/src/main/java/org/eclipse/packager/deb/build/DebianPackageWriter.java`
#### Snippet
```java
    public void addFile(final File file, final String fileName, final EntryInformation entryInformation) throws IOException {
        addFile(new FileContentProvider(file), fileName, entryInformation, Optional.of((Supplier<Instant>) () -> {
            return file == null || !file.canRead() ? null : Instant.ofEpochMilli(file.lastModified());
        }));
    }
```

### ReturnNull
Return of `null`
in `deb/src/main/java/org/eclipse/packager/deb/build/DebianPackageWriter.java`
#### Snippet
```java
    private String cleanupPath(String fileName) {
        if (fileName == null) {
            return null;
        }

```

## RuleId[id=AssignmentToLambdaParameter]
### AssignmentToLambdaParameter
Assignment to lambda parameter `stream`
in `core/src/main/java/org/eclipse/packager/io/OutputSpooler.java`
#### Snippet
```java
                    final String key = entry.getKey() + ":" + algo;
                    try {
                        stream = new RecordingDigestOutputStream(stream, MessageDigest.getInstance(algo), key);
                    } catch (final NoSuchAlgorithmException e) {
                        throw new IOException(e);
```

### AssignmentToLambdaParameter
Assignment to lambda parameter `stream`
in `core/src/main/java/org/eclipse/packager/io/OutputSpooler.java`
#### Snippet
```java
                // add counter

                stream = new CountingOutputStream(entry.getKey(), stream);

                // apply transformer
```

### AssignmentToLambdaParameter
Assignment to lambda parameter `stream`
in `core/src/main/java/org/eclipse/packager/io/OutputSpooler.java`
#### Snippet
```java
                // apply transformer

                stream = entry.getValue().getTransformer().apply(stream);

                // add stream
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

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `rpm/src/main/java/org/eclipse/packager/rpm/build/RpmBuilder.java`
#### Snippet
```java

        if (prefixes != null && !prefixes.isEmpty()) {
            this.header.putStringArray(RpmTag.PREFIXES, prefixes.toArray(new String[0]));
        }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `rpm/src/main/java/org/eclipse/packager/rpm/build/RpmBuilder.java`
#### Snippet
```java
                }
                this.header.putInt(RpmTag.DIR_INDEXES, dirIndexes);
                this.header.putStringArray(RpmTag.DIRNAMES, dirnames.toArray(new String[0]));
            }
        } else {
```

## RuleId[id=DuplicateThrows]
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

### ConstantValue
Condition `payloadCodingValue instanceof String` is always `true` when reached
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

