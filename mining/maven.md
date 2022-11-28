# maven 
 
# Bad smells
I found 1351 bad smells with 133 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| ReturnNull | 224 | false |
| BoundedWildcard | 170 | false |
| UnnecessaryFullyQualifiedName | 104 | false |
| AssignmentToMethodParameter | 80 | false |
| NonSynchronizedMethodOverridesSynchronizedMethod | 76 | false |
| DeprecatedIsStillUsed | 62 | false |
| SizeReplaceableByIsEmpty | 57 | true |
| NonFinalFieldOfException | 43 | false |
| RedundantFieldInitialization | 42 | false |
| UseOfPropertiesAsHashtable | 35 | false |
| DynamicRegexReplaceableByCompiledPattern | 34 | false |
| EmptyMethod | 33 | false |
| ConstantValue | 29 | false |
| UtilityClassWithoutPrivateConstructor | 28 | true |
| NonSerializableFieldInSerializableClass | 26 | false |
| SystemOutErr | 25 | false |
| NonStrictComparisonCanBeEquality | 22 | true |
| UnusedAssignment | 16 | false |
| MissingDeprecatedAnnotation | 15 | false |
| StringBufferReplaceableByString | 13 | false |
| IgnoreResultOfCall | 13 | false |
| CommentedOutCode | 12 | false |
| ReplaceAssignmentWithOperatorAssignment | 12 | false |
| MissortedModifiers | 9 | false |
| ZeroLengthArrayInitialization | 9 | false |
| ClassNameSameAsAncestorName | 8 | false |
| UnnecessaryToStringCall | 8 | true |
| NonProtectedConstructorInAbstractClass | 8 | true |
| SynchronizeOnThis | 7 | false |
| DataFlowIssue | 7 | false |
| RegExpRedundantEscape | 6 | false |
| DuplicateBranchesInSwitch | 6 | false |
| NonShortCircuitBoolean | 6 | false |
| MismatchedCollectionQueryUpdate | 6 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 6 | false |
| PublicFieldAccessedInSynchronizedContext | 5 | false |
| CStyleArrayDeclaration | 4 | false |
| NestedAssignment | 4 | false |
| IOResource | 4 | false |
| ProtectedMemberInFinalClass | 4 | true |
| UnnecessaryLocalVariable | 4 | true |
| UseBulkOperation | 4 | false |
| KeySetIterationMayUseEntrySet | 3 | false |
| AbstractClassNeverImplemented | 3 | false |
| InstanceofCatchParameter | 3 | false |
| DuplicateThrows | 3 | false |
| Convert2MethodRef | 3 | false |
| CollectionContainsUrl | 3 | false |
| StringEqualsEmptyString | 3 | false |
| SynchronizationOnLocalVariableOrMethodParameter | 3 | false |
| StaticCallOnSubclass | 2 | false |
| RedundantMethodOverride | 2 | false |
| InfiniteRecursion | 2 | false |
| NonExceptionNameEndsWithException | 2 | false |
| RedundantCollectionOperation | 2 | false |
| InnerClassMayBeStatic | 2 | true |
| ThrowablePrintStackTrace | 2 | false |
| AssignmentToLambdaParameter | 2 | false |
| AssignmentToStaticFieldFromInstanceMethod | 1 | false |
| RefusedBequest | 1 | false |
| RedundantArrayCreation | 1 | false |
| FinalStaticMethod | 1 | false |
| ManualMinMaxCalculation | 1 | false |
| ReturnFromFinallyBlock | 1 | false |
| EqualsAndHashcode | 1 | false |
| RedundantImplements | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| FieldMayBeStatic | 1 | false |
| UnnecessarySemicolon | 1 | false |
| SimplifyStreamApiCallChains | 1 | false |
| StringOperationCanBeSimplified | 1 | false |
| UnnecessaryCallToStringValueOf | 1 | false |
| MismatchedJavadocCode | 1 | false |
| SetReplaceableByEnumSet | 1 | false |
| RedundantSuppression | 1 | false |
| SynchronizeOnNonFinalField | 1 | false |
| EqualsHashCodeCalledOnUrl | 1 | false |
| Java8MapApi | 1 | false |
| BusyWait | 1 | false |
| CopyConstructorMissesField | 1 | false |
| WaitNotInLoop | 1 | false |
| ThreadStartInConstruction | 1 | false |
| EqualsWhichDoesntCheckParameterClass | 1 | false |
## RuleId[ruleID=StaticCallOnSubclass]
### StaticCallOnSubclass
Static method `getKey()` declared in class 'org.apache.maven.repository.internal.MavenSnapshotMetadata' but referenced via subclass 'org.apache.maven.repository.internal.RemoteSnapshotMetadata'
in `maven-resolver-provider/src/main/java/org/apache/maven/repository/internal/RemoteSnapshotMetadataGenerator.java`
#### Snippet
```java
        for (Artifact artifact : artifacts) {
            if (artifact.isSnapshot()) {
                Object key = RemoteSnapshotMetadata.getKey(artifact);
                RemoteSnapshotMetadata snapshotMetadata = snapshots.get(key);
                if (snapshotMetadata == null) {
```

### StaticCallOnSubclass
Static method `getKey()` declared in class 'org.apache.maven.repository.internal.MavenSnapshotMetadata' but referenced via subclass 'org.apache.maven.repository.internal.RemoteSnapshotMetadata'
in `maven-resolver-provider/src/main/java/org/apache/maven/repository/internal/RemoteSnapshotMetadataGenerator.java`
#### Snippet
```java
    public Artifact transformArtifact(Artifact artifact) {
        if (artifact.isSnapshot() && artifact.getVersion().equals(artifact.getBaseVersion())) {
            Object key = RemoteSnapshotMetadata.getKey(artifact);
            RemoteSnapshotMetadata snapshotMetadata = snapshots.get(key);
            if (snapshotMetadata != null) {
```

## RuleId[ruleID=CStyleArrayDeclaration]
### CStyleArrayDeclaration
C-style array declaration of parameter `b`
in `maven-core/src/main/java/org/apache/maven/lifecycle/internal/builder/multithreaded/ThreadOutputMuxer.java`
#### Snippet
```java

        @Override
        public void write(byte b[], int off, int len) {
            final PrintStream currentStream = getOutputStreamForCurrentThread();
            synchronized (currentStream) {
```

### CStyleArrayDeclaration
C-style array declaration of parameter `s`
in `maven-core/src/main/java/org/apache/maven/lifecycle/internal/builder/multithreaded/ThreadOutputMuxer.java`
#### Snippet
```java

        @Override
        public void print(char s[]) {
            final PrintStream currentStream = getOutputStreamForCurrentThread();
            synchronized (currentStream) {
```

### CStyleArrayDeclaration
C-style array declaration of parameter `b`
in `maven-core/src/main/java/org/apache/maven/lifecycle/internal/builder/multithreaded/ThreadOutputMuxer.java`
#### Snippet
```java

        @Override
        public void write(byte b[]) throws IOException {
            final PrintStream currentStream = getOutputStreamForCurrentThread();
            synchronized (currentStream) {
```

### CStyleArrayDeclaration
C-style array declaration of parameter `x`
in `maven-core/src/main/java/org/apache/maven/lifecycle/internal/builder/multithreaded/ThreadOutputMuxer.java`
#### Snippet
```java

        @Override
        public void println(char x[]) {
            final PrintStream currentStream = getOutputStreamForCurrentThread();
            synchronized (currentStream) {
```

## RuleId[ruleID=AssignmentToStaticFieldFromInstanceMethod]
### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `map` from instance context
in `maven-compat/src/main/java/org/apache/maven/artifact/ArtifactStatus.java`
#### Snippet
```java

        if (map == null) {
            map = new HashMap<>();
        }
        map.put(key, this);
```

## RuleId[ruleID=CommentedOutCode]
### CommentedOutCode
Commented out code (8 lines)
in `maven-compat/src/main/java/org/apache/maven/project/validation/ModelValidationResult.java`
#### Snippet
```java
        StringBuilder message = new StringBuilder();

        //        if ( messages.size() == 1 )
        //        {
        //            message.append( "There was 1 validation error: " );
```

### CommentedOutCode
Commented out code (4 lines)
in `maven-compat/src/main/java/org/apache/maven/project/interpolation/StringSearchModelInterpolator.java`
#### Snippet
```java
            }

            //            if ( fieldType.isPrimitive() )
            //            {
            //                return false;
```

### CommentedOutCode
Commented out code (2 lines)
in `maven-compat/src/main/java/org/apache/maven/repository/metadata/MetadataGraphVertex.java`
#### Snippet
```java
        return hashString.toString().hashCode();

        // BASE64Encoder b64 = new BASE64Encoder();
        // return b64.encode( hashString.toString().getBytes() ).hashCode();
    }
```

### CommentedOutCode
Commented out code (20 lines)
in `maven-compat/src/main/java/org/apache/maven/repository/metadata/DefaultClasspathTransformation.java`
#### Snippet
```java

            cpc.add(md);
            //
            //            TreeSet<MetadataGraphEdge> deps = new TreeSet<MetadataGraphEdge>(
            //                        new Comparator<MetadataGraphEdge>()
```

### CommentedOutCode
Commented out code (4 lines)
in `maven-compat/src/main/java/org/apache/maven/repository/metadata/ArtifactMetadata.java`
#### Snippet
```java

    public ArtifactMetadata(Artifact af) {
        /*
        if ( af != null )
        {
```

### CommentedOutCode
Commented out code (12 lines)
in `maven-compat/src/main/java/org/apache/maven/repository/metadata/ArtifactMetadata.java`
#### Snippet
```java
    }
    // ------------------------------------------------------------------
    //    public void init( ArtifactMetadata af )
    //    {
    //        setGroupId( af.getGroupId() );
```

### CommentedOutCode
Commented out code (5 lines)
in `maven-compat/src/main/java/org/apache/maven/repository/metadata/DefaultGraphConflictResolver.java`
#### Snippet
```java
                        res.getEntry().getMd().setWhy("This is a graph entry point. No links.");
                    } else {
                        // System.out.println("--->"+v.getMd().toDomainString()
                        // +" has been terminated on this entry set\n-------------------\n"
                        // +ins
```

### CommentedOutCode
Commented out code (15 lines)
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
    }

    //    public void addProxy( String protocol, String host, int port, String username, String password,
    //                          String nonProxyHosts )
    //    {
```

### CommentedOutCode
Commented out code (2 lines)
in `maven-core/src/main/java/org/apache/maven/artifact/resolver/ResolutionListener.java`
#### Snippet
```java
    // TODO Remove ResolutionListenerDM interface

    // void manageArtifactVersion( Artifact artifact, Artifact replacement );

    // void manageArtifactScope( Artifact artifact, Artifact replacement );
```

### CommentedOutCode
Commented out code (6 lines)
in `maven-core/src/main/java/org/apache/maven/internal/impl/DefaultProjectBuilder.java`
#### Snippet
```java
                                }

                                //                                @Override
                                //                                public List<ArtifactResolverResult>
                                // getArtifactResults()
```

### CommentedOutCode
Commented out code (2 lines)
in `maven-core/src/main/java/org/apache/maven/settings/DefaultMavenSettingsBuilder.java`
#### Snippet
```java
            // network paths as user.home directory. Unfortunately it did. I removed it and
            // have not detected any problems yet.
            // ---------------------------------------------------------------------------------
            // path = path.replaceAll( "//", "/" );

```

### CommentedOutCode
Commented out code (33 lines)
in `maven-core/src/main/java/org/apache/maven/toolchain/java/JavaToolchain.java`
#### Snippet
```java
 */
public interface JavaToolchain extends Toolchain {
    //    /**
    //     * Returns a list of {@link java.io.File}s which represents the bootstrap libraries for the
    //     * runtime environment. The Bootstrap libraries include libraries in JRE's
```

## RuleId[ruleID=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `maven-model-builder/src/main/java/org/apache/maven/model/profile/activation/JdkVersionProfileActivator.java`
#### Snippet
```java
        }

        value = value.replaceAll("[^0-9\\.\\-\\_]", "");

        List<String> valueTokens = new ArrayList<>(Arrays.asList(value.split("[\\.\\-\\_]")));
```

### RegExpRedundantEscape
Redundant character escape `\\_` in RegExp
in `maven-model-builder/src/main/java/org/apache/maven/model/profile/activation/JdkVersionProfileActivator.java`
#### Snippet
```java
        }

        value = value.replaceAll("[^0-9\\.\\-\\_]", "");

        List<String> valueTokens = new ArrayList<>(Arrays.asList(value.split("[\\.\\-\\_]")));
```

### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `maven-model-builder/src/main/java/org/apache/maven/model/profile/activation/JdkVersionProfileActivator.java`
#### Snippet
```java
        value = value.replaceAll("[^0-9\\.\\-\\_]", "");

        List<String> valueTokens = new ArrayList<>(Arrays.asList(value.split("[\\.\\-\\_]")));
        List<String> rangeValueTokens = new ArrayList<>(Arrays.asList(rangeValue.value.split("\\.")));

```

### RegExpRedundantEscape
Redundant character escape `\\_` in RegExp
in `maven-model-builder/src/main/java/org/apache/maven/model/profile/activation/JdkVersionProfileActivator.java`
#### Snippet
```java
        value = value.replaceAll("[^0-9\\.\\-\\_]", "");

        List<String> valueTokens = new ArrayList<>(Arrays.asList(value.split("[\\.\\-\\_]")));
        List<String> rangeValueTokens = new ArrayList<>(Arrays.asList(rangeValue.value.split("\\.")));

```

### RegExpRedundantEscape
Redundant character escape `\\}` in RegExp
in `maven-model-builder/src/main/java/org/apache/maven/model/validation/DefaultModelValidator.java`
#### Snippet
```java
public class DefaultModelValidator implements ModelValidator {

    private static final Pattern EXPRESSION_NAME_PATTERN = Pattern.compile("\\$\\{(.+?)\\}");

    private static final String ILLEGAL_FS_CHARS = "\\/:\"<>|?*";
```

### RegExpRedundantEscape
Redundant character escape `\\}` in RegExp
in `maven-core/src/main/java/org/apache/maven/settings/DefaultMavenSettingsBuilder.java`
#### Snippet
```java
            basedir = basedir.replaceAll("\\$", "\\\\\\$");

            path = pathPattern.replaceAll("\\$\\{" + basedirSysProp + "\\}", basedir);
            path = path.replaceAll("\\\\", "/");
            // ---------------------------------------------------------------------------------
```

## RuleId[ruleID=RefusedBequest]
### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `maven-xml-impl/src/main/java/org/apache/maven/internal/xml/Xpp3Dom.java`
#### Snippet
```java
    }

    public Dom clone() {
        return this;
    }
```

## RuleId[ruleID=RedundantArrayCreation]
### RedundantArrayCreation
Redundant array creation for calling varargs method
in `maven-core/src/main/java/org/apache/maven/execution/MavenSession.java`
#### Snippet
```java
            MavenExecutionResult result,
            MavenProject project) {
        this(container, request, result, Arrays.asList(new MavenProject[] {project}));
    }

```

## RuleId[ruleID=KeySetIterationMayUseEntrySet]
### KeySetIterationMayUseEntrySet
Iteration over `previousMetadata.keySet()` may be replaced with 'entrySet()' iteration
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/metadata/DefaultRepositoryMetadataManager.java`
#### Snippet
```java
            Metadata prevMetadata = metadata.getMetadata();

            for (ArtifactRepository repository : previousMetadata.keySet()) {
                Metadata m = previousMetadata.get(repository);
                if (repository.equals(selected)) {
```

### KeySetIterationMayUseEntrySet
Iteration over `checksums.keySet()` may be replaced with 'entrySet()' iteration
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/DefaultWagonManager.java`
#### Snippet
```java

            // Pre-store the checksums as any future puts will overwrite them
            for (String extension : checksums.keySet()) {
                ChecksumObserver observer = checksums.get(extension);
                sums.put(extension, observer.getActualChecksum());
```

### KeySetIterationMayUseEntrySet
Iteration over `versions.keySet()` may be replaced with 'entrySet()' iteration
in `maven-model-builder/src/main/java/org/apache/maven/model/building/DefaultModelBuilder.java`
#### Snippet
```java
        }

        for (String key : versions.keySet()) {
            if (versions.get(key) == null && managedVersions.get(key) == null) {
                InputLocation location = plugins.get(key).getLocation("");
```

## RuleId[ruleID=DuplicateBranchesInSwitch]
### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `maven-model-transform/src/main/java/org/apache/maven/model/transform/pull/BufferingParser.java`
#### Snippet
```java
            case START_DOCUMENT:
            case END_DOCUMENT:
                break;
            case START_TAG:
                event.name = pp.getName();
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `maven-core/src/main/java/org/apache/maven/repository/ArtifactTransferEvent.java`
#### Snippet
```java
                break;
            case REQUEST_GET:
                break;
            default:
                throw new IllegalArgumentException("Illegal request type: " + requestType);
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `maven-core/src/main/java/org/apache/maven/repository/ArtifactTransferEvent.java`
#### Snippet
```java
                break;
            case TRANSFER_STARTED:
                break;
            case TRANSFER_COMPLETED:
                break;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `maven-core/src/main/java/org/apache/maven/repository/ArtifactTransferEvent.java`
#### Snippet
```java
                break;
            case TRANSFER_COMPLETED:
                break;
            case TRANSFER_PROGRESS:
                break;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `maven-core/src/main/java/org/apache/maven/repository/ArtifactTransferEvent.java`
#### Snippet
```java
                break;
            case TRANSFER_PROGRESS:
                break;
            case TRANSFER_ERROR:
                break;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `maven-core/src/main/java/org/apache/maven/repository/ArtifactTransferEvent.java`
#### Snippet
```java
                break;
            case TRANSFER_ERROR:
                break;
            default:
                throw new IllegalArgumentException("Illegal event type: " + eventType);
```

## RuleId[ruleID=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`messages.size() == 0` can be replaced with 'messages.isEmpty()'
in `maven-compat/src/main/java/org/apache/maven/project/validation/ModelValidationResult.java`
#### Snippet
```java

    public String render(String indentation) {
        if (messages.size() == 0) {
            return indentation + "There were no validation errors.";
        }
```

### SizeReplaceableByIsEmpty
`artifactHandler.getExtension().length() > 0` can be replaced with '!artifactHandler.getExtension().isEmpty()'
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/layout/FlatRepositoryLayout.java`
#### Snippet
```java

        if (artifactHandler.getExtension() != null
                && artifactHandler.getExtension().length() > 0) {
            path.append(GROUP_SEPARATOR).append(artifactHandler.getExtension());
        }
```

### SizeReplaceableByIsEmpty
`repositoryUrl.length() > 0` can be replaced with '!repositoryUrl.isEmpty()'
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/MavenArtifact.java`
#### Snippet
```java
        if (repositoryUrl == null) {
            this.repositoryUrl = "";
        } else if (!repositoryUrl.endsWith("/") && repositoryUrl.length() > 0) {
            this.repositoryUrl = repositoryUrl + '/';
        } else {
```

### SizeReplaceableByIsEmpty
`exits.size() > 0` can be replaced with '!exits.isEmpty()'
in `maven-compat/src/main/java/org/apache/maven/repository/metadata/DefaultClasspathTransformation.java`
#### Snippet
```java
            List<MetadataGraphEdge> exits = graph.getExcidentEdges(node);

            if (exits != null && exits.size() > 0) {
                MetadataGraphEdge[] sortedExits = exits.toArray(new MetadataGraphEdge[0]);
                Arrays.sort(sortedExits, (e1, e2) -> {
```

### SizeReplaceableByIsEmpty
`exitList.size() > 0` can be replaced with '!exitList.isEmpty()'
in `maven-compat/src/main/java/org/apache/maven/repository/metadata/DefaultGraphConflictResolver.java`
#### Snippet
```java
        List<MetadataGraphEdge> exitList = graph.getExcidentEdges(from);
        // String s = "|---> "+from.getMd().toString()+" - "+(exitList == null ? -1 : exitList.size()) + " exit links";
        if (exitList != null && exitList.size() > 0) {
            for (MetadataGraphEdge e : graph.getExcidentEdges(from)) {
                visit(e.getTarget(), visited, graph);
```

### SizeReplaceableByIsEmpty
`problem.getSource().length() > 0` can be replaced with '!problem.getSource().isEmpty()'
in `maven-model-builder/src/main/java/org/apache/maven/model/building/ModelProblemUtils.java`
#### Snippet
```java
            buffer.append(problem.getModelId());

            if (problem.getSource().length() > 0) {
                if (buffer.length() > 0) {
                    buffer.append(", ");
```

### SizeReplaceableByIsEmpty
`groupId.length() > 0` can be replaced with '!groupId.isEmpty()'
in `maven-model-builder/src/main/java/org/apache/maven/model/building/ModelProblemUtils.java`
#### Snippet
```java
        StringBuilder buffer = new StringBuilder(128);

        buffer.append((groupId != null && groupId.length() > 0) ? groupId : "[unknown-group-id]");
        buffer.append(':');
        buffer.append((artifactId != null && artifactId.length() > 0) ? artifactId : "[unknown-artifact-id]");
```

### SizeReplaceableByIsEmpty
`artifactId.length() > 0` can be replaced with '!artifactId.isEmpty()'
in `maven-model-builder/src/main/java/org/apache/maven/model/building/ModelProblemUtils.java`
#### Snippet
```java
        buffer.append((groupId != null && groupId.length() > 0) ? groupId : "[unknown-group-id]");
        buffer.append(':');
        buffer.append((artifactId != null && artifactId.length() > 0) ? artifactId : "[unknown-artifact-id]");
        buffer.append(':');
        buffer.append((version != null && version.length() > 0) ? version : "[unknown-version]");
```

### SizeReplaceableByIsEmpty
`version.length() > 0` can be replaced with '!version.isEmpty()'
in `maven-model-builder/src/main/java/org/apache/maven/model/building/ModelProblemUtils.java`
#### Snippet
```java
        buffer.append((artifactId != null && artifactId.length() > 0) ? artifactId : "[unknown-artifact-id]");
        buffer.append(':');
        buffer.append((version != null && version.length() > 0) ? version : "[unknown-version]");

        return buffer.toString();
```

### SizeReplaceableByIsEmpty
`message.length() > 0` can be replaced with '!message.isEmpty()'
in `maven-model-builder/src/main/java/org/apache/maven/model/building/DefaultModelProblem.java`
#### Snippet
```java
        String msg;

        if (message != null && message.length() > 0) {
            msg = message;
        } else {
```

### SizeReplaceableByIsEmpty
`modelId.length() > 0` can be replaced with '!modelId.isEmpty()'
in `maven-model-builder/src/main/java/org/apache/maven/model/building/ModelBuildingException.java`
#### Snippet
```java
        writer.print((problems.size() == 1) ? " problem was " : " problems were ");
        writer.print("encountered while building the effective model");
        if (modelId != null && modelId.length() > 0) {
            writer.print(" for ");
            writer.print(modelId);
```

### SizeReplaceableByIsEmpty
`string.length() > 0` can be replaced with '!string.isEmpty()'
in `maven-model-builder/src/main/java/org/apache/maven/model/validation/DefaultModelValidator.java`
#### Snippet
```java
        }

        if (string.length() > 0) {
            return true;
        }
```

### SizeReplaceableByIsEmpty
`pathAdjustment.length() == 0` can be replaced with 'pathAdjustment.isEmpty()'
in `maven-model-builder/src/main/java/org/apache/maven/model/inheritance/DefaultInheritanceAssembler.java`
#### Snippet
```java
                    + pathAdjustment.length()
                    + childPath.length()
                    + ((pathAdjustment.length() == 0) ? 1 : 2));

            url.append(parentUrl);
```

### SizeReplaceableByIsEmpty
`path.length() > 0` can be replaced with '!path.isEmpty()'
in `maven-model-builder/src/main/java/org/apache/maven/model/inheritance/DefaultInheritanceAssembler.java`
#### Snippet
```java

        private void concatPath(StringBuilder url, String path) {
            if (path.length() > 0) {
                boolean initialUrlEndsWithSlash = url.charAt(url.length() - 1) == '/';
                boolean pathStartsWithSlash = path.charAt(0) == '/';
```

### SizeReplaceableByIsEmpty
`localRepository.length() > 0` can be replaced with '!localRepository.isEmpty()'
in `maven-settings-builder/src/main/java/org/apache/maven/settings/building/DefaultSettingsBuilder.java`
#### Snippet
```java
        // for the special case of a drive-relative Windows path, make sure it's absolute to save plugins from trouble
        String localRepository = userSettings.getLocalRepository();
        if (localRepository != null && localRepository.length() > 0) {
            File file = new File(localRepository);
            if (!file.isAbsolute() && file.getPath().startsWith(File.separator)) {
```

### SizeReplaceableByIsEmpty
`getSource().length() > 0` can be replaced with '!getSource().isEmpty()'
in `maven-settings-builder/src/main/java/org/apache/maven/settings/building/DefaultSettingsProblem.java`
#### Snippet
```java
        StringBuilder buffer = new StringBuilder(256);

        if (getSource().length() > 0) {
            if (buffer.length() > 0) {
                buffer.append(", ");
```

### SizeReplaceableByIsEmpty
`message.length() > 0` can be replaced with '!message.isEmpty()'
in `maven-settings-builder/src/main/java/org/apache/maven/settings/building/DefaultSettingsProblem.java`
#### Snippet
```java
        String msg;

        if (message != null && message.length() > 0) {
            msg = message;
        } else {
```

### SizeReplaceableByIsEmpty
`string.length() > 0` can be replaced with '!string.isEmpty()'
in `maven-settings-builder/src/main/java/org/apache/maven/settings/validation/DefaultSettingsValidator.java`
#### Snippet
```java
        }

        if (string.length() > 0) {
            return true;
        }
```

### SizeReplaceableByIsEmpty
`getClassifier().length() > 0` can be replaced with '!getClassifier().isEmpty()'
in `api/maven-api-core/src/main/java/org/apache/maven/api/Artifact.java`
#### Snippet
```java
                + ':'
                + getExtension()
                + (getClassifier().length() > 0 ? ":" + getClassifier() : "")
                + ':'
                + getVersion();
```

### SizeReplaceableByIsEmpty
`text.length() == 0` can be replaced with 'text.isEmpty()'
in `maven-embedder/src/main/java/org/eclipse/sisu/plexus/PlexusXmlBeanConverter.java`
#### Snippet
```java

        // last chance => attempt to create an instance of the expected type: use the string if non-empty
        return text.length() == 0 ? newImplementation(rawType) : newImplementation(rawType, text);
    }
}
```

### SizeReplaceableByIsEmpty
`xmlWriter.getExceptions().size() > 0` can be replaced with '!xmlWriter.getExceptions().isEmpty()'
in `maven-xml-impl/src/main/java/org/apache/maven/internal/xml/Xpp3Dom.java`
#### Snippet
```java
        SerializerXMLWriter xmlWriter = new SerializerXMLWriter(namespace, serializer);
        Xpp3DomWriter.write(xmlWriter, this);
        if (xmlWriter.getExceptions().size() > 0) {
            throw (IOException) xmlWriter.getExceptions().get(0);
        }
```

### SizeReplaceableByIsEmpty
`recessive.getChildren().size() > 0` can be replaced with '!recessive.getChildren().isEmpty()'
in `maven-xml-impl/src/main/java/org/apache/maven/internal/xml/Xpp3Dom.java`
#### Snippet
```java
            }

            if (recessive.getChildren().size() > 0) {
                boolean mergeChildren = true;
                if (childMergeOverride != null) {
```

### SizeReplaceableByIsEmpty
`dominantChildren.size() > 0` can be replaced with '!dominantChildren.isEmpty()'
in `maven-xml-impl/src/main/java/org/apache/maven/internal/xml/Xpp3Dom.java`
#### Snippet
```java
                                .filter(n -> n.getName().equals(name))
                                .collect(Collectors.toList());
                        if (dominantChildren.size() > 0) {
                            commonChildren.put(name, dominantChildren.iterator());
                        }
```

### SizeReplaceableByIsEmpty
`str.trim().length() == 0` can be replaced with 'str.trim().isEmpty()'
in `maven-xml-impl/src/main/java/org/apache/maven/internal/xml/Xpp3Dom.java`
#### Snippet
```java

    public static boolean isEmpty(String str) {
        return ((str == null) || (str.trim().length() == 0));
    }
}
```

### SizeReplaceableByIsEmpty
`str.length() > 0` can be replaced with '!str.isEmpty()'
in `maven-xml-impl/src/main/java/org/apache/maven/internal/xml/Xpp3Dom.java`
#### Snippet
```java

    public static boolean isNotEmpty(String str) {
        return ((str != null) && (str.length() > 0));
    }

```

### SizeReplaceableByIsEmpty
`xmlWriter.getExceptions().size() > 0` can be replaced with '!xmlWriter.getExceptions().isEmpty()'
in `maven-xml-impl/src/main/java/org/codehaus/plexus/util/xml/Xpp3Dom.java`
#### Snippet
```java
        SerializerXMLWriter xmlWriter = new SerializerXMLWriter(namespace, serializer);
        Xpp3DomWriter.write(xmlWriter, this);
        if (xmlWriter.getExceptions().size() > 0) {
            throw (IOException) xmlWriter.getExceptions().get(0);
        }
```

### SizeReplaceableByIsEmpty
`str.length() > 0` can be replaced with '!str.isEmpty()'
in `maven-xml-impl/src/main/java/org/codehaus/plexus/util/xml/Xpp3Dom.java`
#### Snippet
```java

    public static boolean isNotEmpty(String str) {
        return ((str != null) && (str.length() > 0));
    }

```

### SizeReplaceableByIsEmpty
`str.trim().length() == 0` can be replaced with 'str.trim().isEmpty()'
in `maven-xml-impl/src/main/java/org/codehaus/plexus/util/xml/Xpp3Dom.java`
#### Snippet
```java

    public static boolean isEmpty(String str) {
        return ((str == null) || (str.trim().length() == 0));
    }

```

### SizeReplaceableByIsEmpty
`str.length() > 0` can be replaced with '!str.isEmpty()'
in `maven-artifact/src/main/java/org/apache/maven/artifact/ArtifactUtils.java`
#### Snippet
```java

    private static void notBlank(String str, String message) {
        int c = str != null && str.length() > 0 ? str.charAt(0) : 0;
        if ((c < '0' || c > '9') && (c < 'a' || c > 'z')) {
            Validate.notBlank(str, message);
```

### SizeReplaceableByIsEmpty
`process.length() > 0` can be replaced with '!process.isEmpty()'
in `maven-artifact/src/main/java/org/apache/maven/artifact/versioning/VersionRange.java`
#### Snippet
```java
        }

        if (process.length() > 0) {
            if (restrictions.size() > 0) {
                throw new InvalidVersionSpecificationException(
```

### SizeReplaceableByIsEmpty
`restrictions.size() > 0` can be replaced with '!restrictions.isEmpty()'
in `maven-artifact/src/main/java/org/apache/maven/artifact/versioning/VersionRange.java`
#### Snippet
```java

        if (process.length() > 0) {
            if (restrictions.size() > 0) {
                throw new InvalidVersionSpecificationException(
                        "Only fully-qualified sets allowed in multiple set scenario: " + spec);
```

### SizeReplaceableByIsEmpty
`restrictions.size() == 0` can be replaced with 'restrictions.isEmpty()'
in `maven-artifact/src/main/java/org/apache/maven/artifact/versioning/VersionRange.java`
#### Snippet
```java
            version = recommendedVersion;
        } else {
            if (restrictions.size() == 0) {
                throw new OverConstrainedVersionException("The artifact has no valid ranges", artifact);
            }
```

### SizeReplaceableByIsEmpty
`restrictions.size() == 0` can be replaced with 'restrictions.isEmpty()'
in `maven-artifact/src/main/java/org/apache/maven/artifact/versioning/VersionRange.java`
#### Snippet
```java
            value = true;
        } else {
            if (restrictions.size() == 0) {
                throw new OverConstrainedVersionException("The artifact has no valid ranges", artifact);
            }
```

### SizeReplaceableByIsEmpty
`restrictions.size() > 0` can be replaced with '!restrictions.isEmpty()'
in `maven-artifact/src/main/java/org/apache/maven/artifact/versioning/VersionRange.java`
#### Snippet
```java

        ArtifactVersion version = null;
        if (restrictions.size() > 0) {
            for (Restriction r : restrictions) {
                if (recommendedVersion != null && r.containsVersion(recommendedVersion)) {
```

### SizeReplaceableByIsEmpty
`lowerBound.length() > 0` can be replaced with '!lowerBound.isEmpty()'
in `maven-artifact/src/main/java/org/apache/maven/artifact/versioning/VersionRange.java`
#### Snippet
```java

            ArtifactVersion lowerVersion = null;
            if (lowerBound.length() > 0) {
                lowerVersion = new DefaultArtifactVersion(lowerBound);
            }
```

### SizeReplaceableByIsEmpty
`upperBound.length() > 0` can be replaced with '!upperBound.isEmpty()'
in `maven-artifact/src/main/java/org/apache/maven/artifact/versioning/VersionRange.java`
#### Snippet
```java
            }
            ArtifactVersion upperVersion = null;
            if (upperBound.length() > 0) {
                upperVersion = new DefaultArtifactVersion(upperBound);
            }
```

### SizeReplaceableByIsEmpty
`getExecuteGoal().length() > 0` can be replaced with '!getExecuteGoal().isEmpty()'
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/descriptor/MojoDescriptor.java`
#### Snippet
```java
     */
    public boolean isForking() {
        return (getExecuteGoal() != null && getExecuteGoal().length() > 0)
                || (getExecutePhase() != null && getExecutePhase().length() > 0);
    }
```

### SizeReplaceableByIsEmpty
`getExecutePhase().length() > 0` can be replaced with '!getExecutePhase().isEmpty()'
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/descriptor/MojoDescriptor.java`
#### Snippet
```java
    public boolean isForking() {
        return (getExecuteGoal() != null && getExecuteGoal().length() > 0)
                || (getExecutePhase() != null && getExecutePhase().length() > 0);
    }

```

### SizeReplaceableByIsEmpty
`downloadUrl.length() > 0` can be replaced with '!downloadUrl.isEmpty()'
in `maven-resolver-provider/src/main/java/org/apache/maven/repository/internal/ArtifactDescriptorReaderDelegate.java`
#### Snippet
```java
            downloadUrl = distMgmt.getDownloadUrl();
        }
        if (downloadUrl != null && downloadUrl.length() > 0) {
            Artifact artifact = result.getArtifact();
            Map<String, String> props = new HashMap<>(artifact.getProperties());
```

### SizeReplaceableByIsEmpty
`pomArtifact.getClassifier().length() > 0` can be replaced with '!pomArtifact.getClassifier().isEmpty()'
in `maven-resolver-provider/src/main/java/org/apache/maven/repository/internal/ArtifactDescriptorUtils.java`
#### Snippet
```java
        Artifact pomArtifact = artifact;

        if (pomArtifact.getClassifier().length() > 0 || !"pom".equals(pomArtifact.getExtension())) {
            pomArtifact =
                    new DefaultArtifact(artifact.getGroupId(), artifact.getArtifactId(), "pom", artifact.getVersion());
```

### SizeReplaceableByIsEmpty
`groupId.length() > 0` can be replaced with '!groupId.isEmpty()'
in `maven-resolver-provider/src/main/java/org/apache/maven/repository/internal/RelocatedArtifact.java`
#### Snippet
```java
        this.artifact = Objects.requireNonNull(artifact, "artifact cannot be null");
        // TODO Use StringUtils here
        this.groupId = (groupId != null && groupId.length() > 0) ? groupId : null;
        this.artifactId = (artifactId != null && artifactId.length() > 0) ? artifactId : null;
        this.version = (version != null && version.length() > 0) ? version : null;
```

### SizeReplaceableByIsEmpty
`artifactId.length() > 0` can be replaced with '!artifactId.isEmpty()'
in `maven-resolver-provider/src/main/java/org/apache/maven/repository/internal/RelocatedArtifact.java`
#### Snippet
```java
        // TODO Use StringUtils here
        this.groupId = (groupId != null && groupId.length() > 0) ? groupId : null;
        this.artifactId = (artifactId != null && artifactId.length() > 0) ? artifactId : null;
        this.version = (version != null && version.length() > 0) ? version : null;
        this.message = (message != null && message.length() > 0) ? message : null;
```

### SizeReplaceableByIsEmpty
`version.length() > 0` can be replaced with '!version.isEmpty()'
in `maven-resolver-provider/src/main/java/org/apache/maven/repository/internal/RelocatedArtifact.java`
#### Snippet
```java
        this.groupId = (groupId != null && groupId.length() > 0) ? groupId : null;
        this.artifactId = (artifactId != null && artifactId.length() > 0) ? artifactId : null;
        this.version = (version != null && version.length() > 0) ? version : null;
        this.message = (message != null && message.length() > 0) ? message : null;
    }
```

### SizeReplaceableByIsEmpty
`message.length() > 0` can be replaced with '!message.isEmpty()'
in `maven-resolver-provider/src/main/java/org/apache/maven/repository/internal/RelocatedArtifact.java`
#### Snippet
```java
        this.artifactId = (artifactId != null && artifactId.length() > 0) ? artifactId : null;
        this.version = (version != null && version.length() > 0) ? version : null;
        this.message = (message != null && message.length() > 0) ? message : null;
    }

```

### SizeReplaceableByIsEmpty
`getSource().length() > 0` can be replaced with '!getSource().isEmpty()'
in `maven-builder-support/src/main/java/org/apache/maven/building/DefaultProblem.java`
#### Snippet
```java
        StringBuilder buffer = new StringBuilder(256);

        if (getSource().length() > 0) {
            if (buffer.length() > 0) {
                buffer.append(", ");
```

### SizeReplaceableByIsEmpty
`message.length() > 0` can be replaced with '!message.isEmpty()'
in `maven-builder-support/src/main/java/org/apache/maven/building/DefaultProblem.java`
#### Snippet
```java
        String msg;

        if (message != null && message.length() > 0) {
            msg = message;
        } else {
```

### SizeReplaceableByIsEmpty
`layout.length() > 0` can be replaced with '!layout.isEmpty()'
in `maven-core/src/main/java/org/apache/maven/RepositoryUtils.java`
#### Snippet
```java
            if (className.endsWith("RepositoryLayout")) {
                String layout = className.substring(0, className.length() - "RepositoryLayout".length());
                if (layout.length() > 0) {
                    layout = Character.toLowerCase(layout.charAt(0)) + layout.substring(1);
                    return layout;
```

### SizeReplaceableByIsEmpty
`string.length() > 0` can be replaced with '!string.isEmpty()'
in `maven-core/src/main/java/org/apache/maven/project/ExtensionDescriptorBuilder.java`
#### Snippet
```java
                if (string != null) {
                    string = string.trim();
                    if (string.length() > 0) {
                        strings.add(string);
                    }
```

### SizeReplaceableByIsEmpty
`artifactHandler.getExtension().length() > 0` can be replaced with '!artifactHandler.getExtension().isEmpty()'
in `maven-core/src/main/java/org/apache/maven/artifact/repository/layout/DefaultRepositoryLayout.java`
#### Snippet
```java

        if (artifactHandler.getExtension() != null
                && artifactHandler.getExtension().length() > 0) {
            path.append(GROUP_SEPARATOR).append(artifactHandler.getExtension());
        }
```

### SizeReplaceableByIsEmpty
`metadata.getVersion().length() > 0` can be replaced with '!metadata.getVersion().isEmpty()'
in `maven-core/src/main/java/org/apache/maven/artifact/repository/LegacyLocalRepositoryManager.java`
#### Snippet
```java

        public boolean storedInArtifactVersionDirectory() {
            return metadata.getVersion().length() > 0;
        }

```

### SizeReplaceableByIsEmpty
`path.length() != 0` can be replaced with '!path.isEmpty()'
in `maven-core/src/main/java/org/apache/maven/project/MavenProject.java`
#### Snippet
```java
        if (path != null) {
            path = path.trim();
            if (path.length() != 0) {
                if (!getScriptSourceRoots().contains(path)) {
                    getScriptSourceRoots().add(path);
```

### SizeReplaceableByIsEmpty
`path.length() > 0` can be replaced with '!path.isEmpty()'
in `maven-core/src/main/java/org/apache/maven/project/MavenProject.java`
#### Snippet
```java
        if (path != null) {
            path = path.trim();
            if (path.length() > 0) {
                File file = new File(path);
                if (file.isAbsolute()) {
```

### SizeReplaceableByIsEmpty
`getClassifier().length() > 0` can be replaced with '!getClassifier().isEmpty()'
in `maven-core/src/main/java/org/apache/maven/internal/impl/DefaultArtifact.java`
#### Snippet
```java
                + ':'
                + getExtension()
                + (getClassifier().length() > 0 ? ":" + getClassifier() : "")
                + ':'
                + getVersion();
```

### SizeReplaceableByIsEmpty
`getSource().length() > 0` can be replaced with '!getSource().isEmpty()'
in `maven-core/src/main/java/org/apache/maven/internal/impl/DefaultProjectBuilder.java`
#### Snippet
```java
                            StringBuilder buffer = new StringBuilder(256);

                            if (getSource().length() > 0) {
                                if (buffer.length() > 0) {
                                    buffer.append(", ");
```

### SizeReplaceableByIsEmpty
`getClassifier().length() > 0` can be replaced with '!getClassifier().isEmpty()'
in `maven-core/src/main/java/org/apache/maven/internal/impl/DefaultDependency.java`
#### Snippet
```java
                + ':'
                + getExtension()
                + (getClassifier().length() > 0 ? ":" + getClassifier() : "")
                + ':'
                + getVersion();
```

### SizeReplaceableByIsEmpty
`value.length() > 0` can be replaced with '!value.isEmpty()'
in `maven-core/src/main/java/org/apache/maven/configuration/internal/EnhancedConfigurationConverter.java`
#### Snippet
```java
        try {
            Object result = null;
            if (null != value && value.length() > 0) {
                if (evaluator instanceof TypeAwareExpressionEvaluator) {
                    result = ((TypeAwareExpressionEvaluator) evaluator).evaluate(value, type);
```

### SizeReplaceableByIsEmpty
`value.length() > 0` can be replaced with '!value.isEmpty()'
in `maven-core/src/main/java/org/apache/maven/configuration/internal/EnhancedConfigurationConverter.java`
#### Snippet
```java
            if (null == result && configuration.getChildCount() == 0) {
                value = configuration.getAttribute("default-value");
                if (null != value && value.length() > 0) {
                    if (evaluator instanceof TypeAwareExpressionEvaluator) {
                        result = ((TypeAwareExpressionEvaluator) evaluator).evaluate(value, type);
```

## RuleId[ruleID=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder path` can be replaced with 'String'
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/layout/FlatRepositoryLayout.java`
#### Snippet
```java

    private String pathOfRepositoryMetadata(String filename) {
        StringBuilder path = new StringBuilder(128);

        path.append(filename);
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `maven-compat/src/main/java/org/apache/maven/repository/MetadataResolutionRequest.java`
#### Snippet
```java

    public String toString() {
        StringBuilder sb = new StringBuilder()
                .append("REQUEST: ")
                .append("\n")
```

### StringBufferReplaceableByString
`StringBuilder buffer` can be replaced with 'String'
in `maven-model-builder/src/main/java/org/apache/maven/model/building/ModelProblemUtils.java`
#### Snippet
```java
     */
    static String toId(String groupId, String artifactId, String version) {
        StringBuilder buffer = new StringBuilder(128);

        buffer.append((groupId != null && groupId.length() > 0) ? groupId : "[unknown-group-id]");
```

### StringBufferReplaceableByString
`StringBuilder version` can be replaced with 'String'
in `maven-embedder/src/main/java/org/apache/maven/cli/CLIReportingUtils.java`
#### Snippet
```java
        final String ls = System.lineSeparator();
        Properties properties = getBuildProperties();
        StringBuilder version = new StringBuilder(256);
        version.append(buffer().strong(createMavenVersionString(properties))).append(ls);
        version.append(reduce(properties.getProperty("distributionShortName") + " home: "
```

### StringBufferReplaceableByString
`StringBuilder message` can be replaced with 'String'
in `maven-embedder/src/main/java/org/apache/maven/cli/transfer/Slf4jMavenTransferListener.java`
#### Snippet
```java

        TransferResource resource = event.getResource();
        StringBuilder message = new StringBuilder();
        message.append(action).append(' ').append(direction).append(' ').append(resource.getRepositoryId());
        message.append(": ");
```

### StringBufferReplaceableByString
`StringBuilder message` can be replaced with 'String'
in `maven-embedder/src/main/java/org/apache/maven/cli/transfer/AbstractMavenTransferListener.java`
#### Snippet
```java

        TransferResource resource = event.getResource();
        StringBuilder message = new StringBuilder();
        message.append(action).append(' ').append(direction).append(' ').append(resource.getRepositoryId());
        message.append(": ");
```

### StringBufferReplaceableByString
`StringBuilder buffer` can be replaced with 'String'
in `maven-artifact/src/main/java/org/apache/maven/artifact/repository/ArtifactRepositoryPolicy.java`
#### Snippet
```java
    @Override
    public String toString() {
        StringBuilder buffer = new StringBuilder(64);
        buffer.append("{enabled=");
        buffer.append(enabled);
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `maven-core/src/main/java/org/apache/maven/plugin/MojoExecution.java`
#### Snippet
```java

    public String identify() {
        StringBuilder sb = new StringBuilder(256);

        sb.append(executionId);
```

### StringBufferReplaceableByString
`StringBuilder buffer` can be replaced with 'String'
in `maven-core/src/main/java/org/apache/maven/project/ReactorModelPool.java`
#### Snippet
```java
        @Override
        public String toString() {
            StringBuilder buffer = new StringBuilder(128);
            buffer.append(groupId).append(':').append(artifactId);
            return buffer.toString();
```

### StringBufferReplaceableByString
`StringBuilder buffer` can be replaced with 'String'
in `maven-core/src/main/java/org/apache/maven/project/MavenProject.java`
#### Snippet
```java

    private static String getProjectReferenceId(String groupId, String artifactId, String version) {
        StringBuilder buffer = new StringBuilder(128);
        buffer.append(groupId).append(':').append(artifactId).append(':').append(version);
        return buffer.toString();
```

### StringBufferReplaceableByString
`StringBuilder buffer` can be replaced with 'String'
in `maven-core/src/main/java/org/apache/maven/artifact/repository/metadata/AbstractRepositoryMetadata.java`
#### Snippet
```java

    public String extendedToString() {
        StringBuilder buffer = new StringBuilder(256);

        buffer.append(LS).append("Repository Metadata").append(LS).append("--------------------------");
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `maven-core/src/main/java/org/apache/maven/artifact/resolver/ArtifactResolutionRequest.java`
#### Snippet
```java

    public String toString() {
        StringBuilder sb = new StringBuilder()
                .append("REQUEST: ")
                .append(LS)
```

### StringBufferReplaceableByString
`StringBuilder buffer` can be replaced with 'String'
in `maven-core/src/main/java/org/apache/maven/repository/legacy/metadata/AbstractArtifactMetadata.java`
#### Snippet
```java

    public String extendedToString() {
        StringBuilder buffer = new StringBuilder(256);

        buffer.append(LS).append("Artifact Metadata").append(LS).append("--------------------------");
```

## RuleId[ruleID=NonShortCircuitBoolean]
### NonShortCircuitBoolean
Non-short-circuit boolean expression `isActive &= activator.isActive(profile, context, problems)`
in `maven-model-builder/src/main/java/org/apache/maven/model/profile/DefaultProfileSelector.java`
#### Snippet
```java
            try {
                if (activator.presentInConfig(profile, context, problems)) {
                    isActive &= activator.isActive(profile, context, problems);
                }
            } catch (RuntimeException e) {
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `hasVersion |= "version".equals(tagName)`
in `maven-model-transform/src/main/java/org/apache/maven/model/transform/ReactorDependencyXMLFilter.java`
#### Snippet
```java
            if (event.event == START_TAG) {
                tagName = event.name;
                hasVersion |= "version".equals(tagName);
            } else if (event.event == TEXT) {
                if (event.text.matches("\\s+")) {
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `hasVersion |= "version".equals(tagName)`
in `maven-model-transform/src/main/java/org/apache/maven/model/transform/ParentXMLFilter.java`
#### Snippet
```java
            if (event.event == START_TAG) {
                tagName = event.name;
                hasVersion |= "version".equals(tagName);
                hasRelativePath |= "relativePath".equals(tagName);
            } else if (event.event == TEXT) {
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `hasRelativePath |= "relativePath".equals(tagName)`
in `maven-model-transform/src/main/java/org/apache/maven/model/transform/ParentXMLFilter.java`
#### Snippet
```java
                tagName = event.name;
                hasVersion |= "version".equals(tagName);
                hasRelativePath |= "relativePath".equals(tagName);
            } else if (event.event == TEXT) {
                if (event.text.matches("\\s+")) {
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `r &= exclusionsEquals(aD.getExclusions(), bD.getExclusions())`
in `maven-core/src/main/java/org/apache/maven/plugin/CacheUtils.java`
#### Snippet
```java
                    && Objects.equals(aD.getScope(), bD.getScope());

            r &= exclusionsEquals(aD.getExclusions(), bD.getExclusions());

            if (!r) {
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `i.hasNext() & !matched`
in `maven-core/src/main/java/org/apache/maven/artifact/resolver/filter/IncludesArtifactFilter.java`
#### Snippet
```java

        boolean matched = false;
        for (Iterator<String> i = patterns.iterator(); i.hasNext() & !matched; ) {
            // TODO what about wildcards? Just specifying groups? versions?
            if (id.equals(i.next())) {
```

## RuleId[ruleID=FinalStaticMethod]
### FinalStaticMethod
'static' method declared `final`
in `maven-core/src/main/java/org/apache/maven/toolchain/DefaultToolchainManager.java`
#### Snippet
```java
    }

    public static final String getStorageKey(String type) {
        return "toolchain-" + type; // NOI18N
    }
```

## RuleId[ruleID=ManualMinMaxCalculation]
### ManualMinMaxCalculation
Can be replaced with 'Math.max()' call
in `maven-compat/src/main/java/org/apache/maven/repository/metadata/MetadataGraph.java`
#### Snippet
```java
    private void init(int nVertices, int nEdges) {
        int nV = nVertices;
        if (nVertices < 1) {
            nV = 1;
        }
```

## RuleId[ruleID=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `AbstractMojo` has no concrete subclass
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/AbstractMojo.java`
#### Snippet
```java
 * @author <a href="mailto:vincent.siveton@gmail.com">Vincent Siveton</a>
 */
public abstract class AbstractMojo implements Mojo, ContextEnabled {
    /** Instance logger */
    private Log log;
```

### AbstractClassNeverImplemented
Abstract class `AbstractEventSpy` has no concrete subclass
in `maven-core/src/main/java/org/apache/maven/eventspy/AbstractEventSpy.java`
#### Snippet
```java
 * @since 3.0.2
 */
public abstract class AbstractEventSpy implements EventSpy {

    public void init(Context context) throws Exception {}
```

### AbstractClassNeverImplemented
Abstract class `BaseObject` has no concrete subclass
in `maven-model/src/main/java/org/apache/maven/model/BaseObject.java`
#### Snippet
```java
import java.io.Serializable;

public abstract class BaseObject implements Serializable, Cloneable, InputLocationTracker {
    protected transient ChildrenTracking childrenTracking;

```

## RuleId[ruleID=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends ArtifactFilter`
in `maven-compat/src/main/java/org/apache/maven/artifact/resolver/filter/OrArtifactFilter.java`
#### Snippet
```java
    }

    public OrArtifactFilter(Collection<ArtifactFilter> filters) {
        this.filters = new LinkedHashSet<>(filters);
    }
```

### BoundedWildcard
Can generalize to `? extends ValueSource`
in `maven-compat/src/main/java/org/apache/maven/project/interpolation/AbstractStringBasedModelInterpolator.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    protected String interpolateInternal(
            String src, List<ValueSource> valueSources, List<InterpolationPostProcessor> postProcessors, boolean debug)
            throws ModelInterpolationException {
        if (!src.contains("${")) {
```

### BoundedWildcard
Can generalize to `? extends InterpolationPostProcessor`
in `maven-compat/src/main/java/org/apache/maven/project/interpolation/AbstractStringBasedModelInterpolator.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    protected String interpolateInternal(
            String src, List<ValueSource> valueSources, List<InterpolationPostProcessor> postProcessors, boolean debug)
            throws ModelInterpolationException {
        if (!src.contains("${")) {
```

### BoundedWildcard
Can generalize to `? extends ArtifactRepository`
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/DefaultArtifactRepository.java`
#### Snippet
```java
    }

    public void setMirroredRepositories(List<ArtifactRepository> mirroredRepositories) {
        if (mirroredRepositories != null) {
            this.mirroredRepositories = Collections.unmodifiableList(mirroredRepositories);
```

### BoundedWildcard
Can generalize to `? extends Artifact`
in `maven-compat/src/main/java/org/apache/maven/artifact/versioning/ManagedVersionMap.java`
#### Snippet
```java
@Deprecated
public class ManagedVersionMap extends HashMap<String, Artifact> {
    public ManagedVersionMap(Map<String, Artifact> map) {
        super();
        if (map != null) {
```

### BoundedWildcard
Can generalize to `? extends ArtifactRepository`
in `maven-compat/src/main/java/org/apache/maven/repository/MetadataResolutionResult.java`
#### Snippet
```java
    }

    public MetadataResolutionResult setRepositories(final List<ArtifactRepository> repositories) {
        this.repositories = repositories;

```

### BoundedWildcard
Can generalize to `? extends ArtifactRepository`
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/DefaultWagonManager.java`
#### Snippet
```java
    public void getArtifact(
            Artifact artifact,
            List<ArtifactRepository> remoteRepositories,
            TransferListener downloadMonitor,
            boolean force)
```

### BoundedWildcard
Can generalize to `? extends File`
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/DefaultWagonManager.java`
#### Snippet
```java
    }

    private void cleanupTemporaryFiles(List<File> files) {
        for (File file : files) {
            // really don't care if it failed here only log warning
```

### BoundedWildcard
Can generalize to `? extends MetadataGraphEdge`
in `maven-compat/src/main/java/org/apache/maven/repository/metadata/DefaultGraphConflictResolver.java`
#### Snippet
```java
    // -------------------------------------------------------------------------------------
    private MetadataGraphEdge cleanEdges(
            MetadataGraphVertex v, List<MetadataGraphEdge> edges, ArtifactScopeEnum scope) {
        if (edges == null || edges.isEmpty()) {
            return null;
```

### BoundedWildcard
Can generalize to `? super MetadataGraphVertex`
in `maven-compat/src/main/java/org/apache/maven/repository/metadata/DefaultGraphConflictResolver.java`
#### Snippet
```java

    // -------------------------------------------------------------------------------------
    private void visit(MetadataGraphVertex from, List<MetadataGraphVertex> visited, MetadataGraph graph) {
        if (visited.contains(from)) {
            return;
```

### BoundedWildcard
Can generalize to `? extends T`
in `maven-model-builder/src/main/java/org/apache/maven/model/path/DefaultModelPathTranslator.java`
#### Snippet
```java
    }

    private <T> List<T> map(List<T> resources, Function<T, T> mapper) {
        List<T> newResources = null;
        if (resources != null) {
```

### BoundedWildcard
Can generalize to `? super T`
in `maven-model-builder/src/main/java/org/apache/maven/model/path/DefaultModelPathTranslator.java`
#### Snippet
```java
    }

    private <T> List<T> map(List<T> resources, Function<T, T> mapper) {
        List<T> newResources = null;
        if (resources != null) {
```

### BoundedWildcard
Can generalize to `? extends T`
in `maven-model-builder/src/main/java/org/apache/maven/model/path/DefaultModelPathTranslator.java`
#### Snippet
```java
    }

    private <T> List<T> map(List<T> resources, Function<T, T> mapper) {
        List<T> newResources = null;
        if (resources != null) {
```

### BoundedWildcard
Can generalize to `? extends ArtifactRepository`
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
    }

    public void injectAuthentication(RepositorySystemSession session, List<ArtifactRepository> repositories) {
        if (repositories != null && session != null) {
            for (ArtifactRepository repository : repositories) {
```

### BoundedWildcard
Can generalize to `? extends ArtifactRepositoryPolicy`
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
    }

    private ArtifactRepositoryPolicy getEffectivePolicy(Collection<ArtifactRepositoryPolicy> policies) {
        ArtifactRepositoryPolicy effectivePolicy = null;

```

### BoundedWildcard
Can generalize to `? extends ArtifactRepository`
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
    }

    public void injectProxy(RepositorySystemSession session, List<ArtifactRepository> repositories) {
        if (repositories != null && session != null) {
            for (ArtifactRepository repository : repositories) {
```

### BoundedWildcard
Can generalize to `? extends ArtifactRepository`
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
    //    }

    public List<ArtifactRepository> getEffectiveRepositories(List<ArtifactRepository> repositories) {
        if (repositories == null) {
            return null;
```

### BoundedWildcard
Can generalize to `? super String`
in `maven-model-builder/src/main/java/org/apache/maven/model/profile/activation/JdkVersionProfileActivator.java`
#### Snippet
```java
    }

    private static void addZeroTokens(List<String> tokens, int max) {
        while (tokens.size() < max) {
            tokens.add("0");
```

### BoundedWildcard
Can generalize to `? extends RangeValue`
in `maven-model-builder/src/main/java/org/apache/maven/model/profile/activation/JdkVersionProfileActivator.java`
#### Snippet
```java
    }

    private static boolean isInRange(String value, List<RangeValue> range) {
        int leftRelation = getRelationOrder(value, range.get(0), true);

```

### BoundedWildcard
Can generalize to `? extends ModelProblem`
in `maven-model-builder/src/main/java/org/apache/maven/model/building/DefaultModelProblemCollector.java`
#### Snippet
```java
    }

    public void addAll(List<ModelProblem> problems) {
        this.problems.addAll(problems);

```

### BoundedWildcard
Can generalize to `? extends T`
in `maven-model-builder/src/main/java/org/apache/maven/model/building/Result.java`
#### Snippet
```java
     * @param problems
     */
    public static <T> Result<T> addProblems(Result<T> result, Iterable<? extends ModelProblem> problems) {
        Collection<ModelProblem> list = new ArrayList<>();
        for (ModelProblem item : problems) {
```

### BoundedWildcard
Can generalize to `? extends ModelProblem`
in `maven-model-builder/src/main/java/org/apache/maven/model/building/DefaultModelBuildingResult.java`
#### Snippet
```java
    }

    public DefaultModelBuildingResult setProblems(List<ModelProblem> problems) {
        if (problems != null) {
            this.problems = new ArrayList<>(problems);
```

### BoundedWildcard
Can generalize to `? extends ModelProblem`
in `maven-model-builder/src/main/java/org/apache/maven/model/building/ModelBuildingException.java`
#### Snippet
```java
    }

    private static String toMessage(String modelId, List<ModelProblem> problems) {
        StringWriter buffer = new StringWriter(1024);

```

### BoundedWildcard
Can generalize to `? super String`
in `maven-model-builder/src/main/java/org/apache/maven/model/inheritance/DefaultInheritanceAssembler.java`
#### Snippet
```java
        }

        private void putAll(Map<String, String> s, Map<String, String> t, Object excludeKey) {
            for (Map.Entry<String, String> e : t.entrySet()) {
                if (!e.getKey().equals(excludeKey)) {
```

### BoundedWildcard
Can generalize to `? super String`
in `maven-model-builder/src/main/java/org/apache/maven/model/inheritance/DefaultInheritanceAssembler.java`
#### Snippet
```java
        }

        private void putAll(Map<String, String> s, Map<String, String> t, Object excludeKey) {
            for (Map.Entry<String, String> e : t.entrySet()) {
                if (!e.getKey().equals(excludeKey)) {
```

### BoundedWildcard
Can generalize to `? extends T`
in `maven-model-builder/src/main/java/org/apache/maven/model/normalization/DefaultModelNormalizer.java`
#### Snippet
```java
     * Returns a list suited for the builders, i.e. null if not modified
     */
    private <T> List<T> injectList(List<T> list, Function<T, T> modifer) {
        List<T> newList = null;
        for (int i = 0; i < list.size(); i++) {
```

### BoundedWildcard
Can generalize to `? super T`
in `maven-model-builder/src/main/java/org/apache/maven/model/normalization/DefaultModelNormalizer.java`
#### Snippet
```java
     * Returns a list suited for the builders, i.e. null if not modified
     */
    private <T> List<T> injectList(List<T> list, Function<T, T> modifer) {
        List<T> newList = null;
        for (int i = 0; i < list.size(); i++) {
```

### BoundedWildcard
Can generalize to `? extends T`
in `maven-model-builder/src/main/java/org/apache/maven/model/normalization/DefaultModelNormalizer.java`
#### Snippet
```java
     * Returns a list suited for the builders, i.e. null if not modified
     */
    private <T> List<T> injectList(List<T> list, Function<T, T> modifer) {
        List<T> newList = null;
        for (int i = 0; i < list.size(); i++) {
```

### BoundedWildcard
Can generalize to `? extends Problem`
in `maven-toolchain-builder/src/main/java/org/apache/maven/toolchain/building/DefaultToolchainsBuilder.java`
#### Snippet
```java
    }

    private boolean hasErrors(List<Problem> problems) {
        if (problems != null) {
            for (Problem problem : problems) {
```

### BoundedWildcard
Can generalize to `? extends Problem`
in `maven-toolchain-builder/src/main/java/org/apache/maven/toolchain/building/ToolchainsBuildingException.java`
#### Snippet
```java
    }

    private static String toMessage(List<Problem> problems) {
        StringWriter buffer = new StringWriter(1024);

```

### BoundedWildcard
Can generalize to `? extends SettingsProblem`
in `maven-settings-builder/src/main/java/org/apache/maven/settings/building/DefaultSettingsBuilder.java`
#### Snippet
```java
    }

    private boolean hasErrors(List<SettingsProblem> problems) {
        if (problems != null) {
            for (SettingsProblem problem : problems) {
```

### BoundedWildcard
Can generalize to `? extends SettingsProblem`
in `maven-settings-builder/src/main/java/org/apache/maven/settings/building/SettingsBuildingException.java`
#### Snippet
```java
    }

    private static String toMessage(List<SettingsProblem> problems) {
        StringWriter buffer = new StringWriter(1024);

```

### BoundedWildcard
Can generalize to `? extends Exclusion`
in `api/maven-api-core/src/main/java/org/apache/maven/api/services/DependencyCoordinateFactoryRequest.java`
#### Snippet
```java
        }

        public DependencyCoordinateFactoryRequestBuilder exclusions(Collection<Exclusion> exclusions) {
            if (exclusions != null) {
                if (this.exclusions.isEmpty()) {
```

### BoundedWildcard
Can generalize to `? extends T`
in `api/maven-api-core/src/main/java/org/apache/maven/api/services/BaseRequest.java`
#### Snippet
```java
    }

    protected static <T> Collection<T> unmodifiable(Collection<T> obj) {
        return obj != null && !obj.isEmpty()
                ? Collections.unmodifiableCollection(new ArrayList<>(obj))
```

### BoundedWildcard
Can generalize to `? super Boolean`
in `maven-embedder/src/main/java/org/apache/maven/cli/MavenCli.java`
#### Snippet
```java

    private void enableOnPresentOption(
            final CommandLine commandLine, final String option, final Consumer<Boolean> setting) {
        if (commandLine.hasOption(option)) {
            setting.accept(true);
```

### BoundedWildcard
Can generalize to `? super String`
in `maven-embedder/src/main/java/org/apache/maven/cli/MavenCli.java`
#### Snippet
```java

    private void logSummary(
            ExceptionSummary summary, Map<String, String> references, String indent, boolean showErrors) {
        String referenceKey = "";

```

### BoundedWildcard
Can generalize to `? extends T`
in `maven-embedder/src/main/java/org/apache/maven/cli/MavenCli.java`
#### Snippet
```java
    }

    private static <T> List<T> reverse(List<T> list) {
        List<T> copy = new ArrayList<>(list);
        Collections.reverse(copy);
```

### BoundedWildcard
Can generalize to `? extends File`
in `maven-embedder/src/main/java/org/apache/maven/cli/MavenCli.java`
#### Snippet
```java

    private ClassRealm setupContainerRealm(
            ClassWorld classWorld, ClassRealm coreRealm, List<File> extClassPath, List<CoreExtensionEntry> extensions)
            throws Exception {
        if (!extClassPath.isEmpty() || !extensions.isEmpty()) {
```

### BoundedWildcard
Can generalize to `? extends CoreExtensionEntry`
in `maven-embedder/src/main/java/org/apache/maven/cli/MavenCli.java`
#### Snippet
```java

    private ClassRealm setupContainerRealm(
            ClassWorld classWorld, ClassRealm coreRealm, List<File> extClassPath, List<CoreExtensionEntry> extensions)
            throws Exception {
        if (!extClassPath.isEmpty() || !extensions.isEmpty()) {
```

### BoundedWildcard
Can generalize to `? super Boolean`
in `maven-embedder/src/main/java/org/apache/maven/cli/MavenCli.java`
#### Snippet
```java

    private void enableOnAbsentOption(
            final CommandLine commandLine, final char option, final Consumer<Boolean> setting) {
        if (!commandLine.hasOption(option)) {
            setting.accept(true);
```

### BoundedWildcard
Can generalize to `? extends MavenProject`
in `maven-embedder/src/main/java/org/apache/maven/cli/MavenCli.java`
#### Snippet
```java
     * and {@code groupId:artifactId} when there is a name clash).
     */
    String getResumeFromSelector(List<MavenProject> mavenProjects, MavenProject firstFailedProject) {
        boolean hasOverlappingArtifactId = mavenProjects.stream()
                        .filter(project -> firstFailedProject.getArtifactId().equals(project.getArtifactId()))
```

### BoundedWildcard
Can generalize to `? super Boolean`
in `maven-embedder/src/main/java/org/apache/maven/cli/MavenCli.java`
#### Snippet
```java

    private void disableOnPresentOption(
            final CommandLine commandLine, final String option, final Consumer<Boolean> setting) {
        if (commandLine.hasOption(option)) {
            setting.accept(false);
```

### BoundedWildcard
Can generalize to `? extends Event`
in `maven-model-transform/src/main/java/org/apache/maven/model/transform/CiFriendlyXMLFilter.java`
#### Snippet
```java

    @Override
    protected void process(List<Event> buffer) {
        for (Event event : buffer) {
            if (event.event == TEXT && replace && event.text.contains("${")) {
```

### BoundedWildcard
Can generalize to `? extends Event`
in `maven-model-transform/src/main/java/org/apache/maven/model/transform/RelativePathXMLFilter.java`
#### Snippet
```java
    }

    protected void process(List<Event> buffer) {
        boolean skip = false;
        Event prev = null;
```

### BoundedWildcard
Can generalize to `? extends Map`
in `maven-settings/src/main/java/org/apache/maven/settings/WrapperProperties.java`
#### Snippet
```java
    final Consumer<Properties> setter;

    WrapperProperties(Supplier<Map<String, String>> getter, Consumer<Properties> setter) {
        this.getter = getter;
        this.setter = setter;
```

### BoundedWildcard
Can generalize to `? super Properties`
in `maven-settings/src/main/java/org/apache/maven/settings/WrapperProperties.java`
#### Snippet
```java
    final Consumer<Properties> setter;

    WrapperProperties(Supplier<Map<String, String>> getter, Consumer<Properties> setter) {
        this.getter = getter;
        this.setter = setter;
```

### BoundedWildcard
Can generalize to `? super String`
in `maven-model-transform/src/main/java/org/apache/maven/model/transform/ReactorDependencyXMLFilter.java`
#### Snippet
```java

    public ReactorDependencyXMLFilter(
            XmlPullParser xmlPullParser, BiFunction<String, String, String> reactorVersionMapper) {
        super(xmlPullParser, "dependency");
        this.reactorVersionMapper = reactorVersionMapper;
```

### BoundedWildcard
Can generalize to `? super String`
in `maven-model-transform/src/main/java/org/apache/maven/model/transform/ReactorDependencyXMLFilter.java`
#### Snippet
```java

    public ReactorDependencyXMLFilter(
            XmlPullParser xmlPullParser, BiFunction<String, String, String> reactorVersionMapper) {
        super(xmlPullParser, "dependency");
        this.reactorVersionMapper = reactorVersionMapper;
```

### BoundedWildcard
Can generalize to `? super Path`
in `maven-model-transform/src/main/java/org/apache/maven/model/transform/ParentXMLFilter.java`
#### Snippet
```java
     */
    ParentXMLFilter(
            XmlPullParser parser, Function<Path, Optional<RelativeProject>> relativePathMapper, Path projectPath) {
        super(parser, "parent");
        this.relativePathMapper = relativePathMapper;
```

### BoundedWildcard
Can generalize to `? extends T`
in `maven-artifact/src/main/java/org/apache/maven/artifact/ArtifactUtils.java`
#### Snippet
```java
    }

    private static <T> List<T> copyList(List<T> original) {
        List<T> copy = null;

```

### BoundedWildcard
Can generalize to `? extends Artifact`
in `maven-artifact/src/main/java/org/apache/maven/artifact/ArtifactUtils.java`
#### Snippet
```java
     * @return <code>to</code> collection
     */
    public static <T extends Collection<Artifact>> T copyArtifacts(Collection<Artifact> from, T to) {
        for (Artifact artifact : from) {
            to.add(ArtifactUtils.copyArtifact(artifact));
```

### BoundedWildcard
Can generalize to `? extends Artifact`
in `maven-artifact/src/main/java/org/apache/maven/artifact/ArtifactUtils.java`
#### Snippet
```java
    }

    public static Map<String, Artifact> artifactMapByVersionlessId(Collection<Artifact> artifacts) {
        Map<String, Artifact> artifactMap = new LinkedHashMap<>();

```

### BoundedWildcard
Can generalize to `? extends List`
in `maven-settings/src/main/java/org/apache/maven/settings/WrapperList.java`
#### Snippet
```java
    }

    WrapperList(Supplier<List<U>> getter, Consumer<List<U>> setter, Function<U, T> mapper, Function<T, U> revMapper) {
        this.getter = getter;
        this.setter = setter;
```

### BoundedWildcard
Can generalize to `? super List`
in `maven-settings/src/main/java/org/apache/maven/settings/WrapperList.java`
#### Snippet
```java
    }

    WrapperList(Supplier<List<U>> getter, Consumer<List<U>> setter, Function<U, T> mapper, Function<T, U> revMapper) {
        this.getter = getter;
        this.setter = setter;
```

### BoundedWildcard
Can generalize to `? super U`
in `maven-settings/src/main/java/org/apache/maven/settings/WrapperList.java`
#### Snippet
```java
    }

    WrapperList(Supplier<List<U>> getter, Consumer<List<U>> setter, Function<U, T> mapper, Function<T, U> revMapper) {
        this.getter = getter;
        this.setter = setter;
```

### BoundedWildcard
Can generalize to `? extends T`
in `maven-settings/src/main/java/org/apache/maven/settings/WrapperList.java`
#### Snippet
```java
    }

    WrapperList(Supplier<List<U>> getter, Consumer<List<U>> setter, Function<U, T> mapper, Function<T, U> revMapper) {
        this.getter = getter;
        this.setter = setter;
```

### BoundedWildcard
Can generalize to `? super T`
in `maven-settings/src/main/java/org/apache/maven/settings/WrapperList.java`
#### Snippet
```java
    }

    WrapperList(Supplier<List<U>> getter, Consumer<List<U>> setter, Function<U, T> mapper, Function<T, U> revMapper) {
        this.getter = getter;
        this.setter = setter;
```

### BoundedWildcard
Can generalize to `? extends U`
in `maven-settings/src/main/java/org/apache/maven/settings/WrapperList.java`
#### Snippet
```java
    }

    WrapperList(Supplier<List<U>> getter, Consumer<List<U>> setter, Function<U, T> mapper, Function<T, U> revMapper) {
        this.getter = getter;
        this.setter = setter;
```

### BoundedWildcard
Can generalize to `? extends ArtifactVersion`
in `maven-artifact/src/main/java/org/apache/maven/artifact/versioning/VersionRange.java`
#### Snippet
```java
    }

    public ArtifactVersion matchVersion(List<ArtifactVersion> versions) {
        // TODO could be more efficient by sorting the list and then moving along the restrictions in order?

```

### BoundedWildcard
Can generalize to `? extends Artifact`
in `maven-artifact/src/main/java/org/apache/maven/artifact/resolver/MultipleArtifactsNotFoundException.java`
#### Snippet
```java
    }

    private static String constructMessage(List<Artifact> artifacts) {
        StringBuilder buffer = new StringBuilder(256);

```

### BoundedWildcard
Can generalize to `? extends MojoDescriptor`
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/descriptor/PluginDescriptor.java`
#### Snippet
```java
    }

    public void addMojos(List<MojoDescriptor> mojos) throws DuplicateMojoDescriptorException {
        for (MojoDescriptor mojoDescriptor : mojos) {
            addMojo(mojoDescriptor);
```

### BoundedWildcard
Can generalize to `? extends Parameter`
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/descriptor/MojoDescriptor.java`
#### Snippet
```java
     * @throws DuplicateParameterException if any
     */
    public void setParameters(List<Parameter> parameters) throws DuplicateParameterException {
        this.parameters.clear();
        for (Parameter parameter : parameters) {
```

### BoundedWildcard
Can generalize to `? super String`
in `maven-resolver-provider/src/main/java/org/apache/maven/repository/internal/DefaultVersionResolver.java`
#### Snippet
```java
    private void merge(
            String key,
            Map<String, VersionInfo> infos,
            String timestamp,
            String version,
```

### BoundedWildcard
Can generalize to `? extends VersionInfo`
in `maven-resolver-provider/src/main/java/org/apache/maven/repository/internal/DefaultVersionResolver.java`
#### Snippet
```java
    }

    private boolean resolve(VersionResult result, Map<String, VersionInfo> infos, String key) {
        VersionInfo info = infos.get(key);
        if (info != null) {
```

### BoundedWildcard
Can generalize to `? super String`
in `maven-resolver-provider/src/main/java/org/apache/maven/repository/internal/DefaultVersionResolver.java`
#### Snippet
```java
    }

    private void merge(Map<String, VersionInfo> infos, String srcKey, String dstKey) {
        VersionInfo srcInfo = infos.get(srcKey);
        VersionInfo dstInfo = infos.get(dstKey);
```

### BoundedWildcard
Can generalize to `? extends MojoExecutionListener`
in `maven-core/src/main/java/org/apache/maven/plugin/CompoundMojoExecutionListener.java`
#### Snippet
```java
    private final Collection<MojoExecutionListener> listeners;

    CompoundMojoExecutionListener(Collection<MojoExecutionListener> listeners) {
        this.listeners = listeners; // NB this is live injected collection
    }
```

### BoundedWildcard
Can generalize to `? super String`
in `maven-core/src/main/java/org/apache/maven/graph/DefaultProjectDependencyGraph.java`
#### Snippet
```java
    }

    private void getUpstreamProjects(String projectId, Collection<String> projectIds, boolean transitive) {
        for (String id : sorter.getDependencies(projectId)) {
            if (projectIds.add(id) && transitive) {
```

### BoundedWildcard
Can generalize to `? super String`
in `maven-core/src/main/java/org/apache/maven/graph/DefaultProjectDependencyGraph.java`
#### Snippet
```java
    }

    private void getDownstreamProjects(String projectId, Set<String> projectIds, boolean transitive) {
        for (String id : sorter.getDependents(projectId)) {
            if (projectIds.add(id) && transitive) {
```

### BoundedWildcard
Can generalize to `? extends ArtifactRepository`
in `maven-core/src/main/java/org/apache/maven/RepositoryUtils.java`
#### Snippet
```java
    }

    public static List<RemoteRepository> toRepos(List<ArtifactRepository> repos) {
        return Optional.ofNullable(repos).orElse(Collections.emptyList()).stream()
                .map(RepositoryUtils::toRepo)
```

### BoundedWildcard
Can generalize to `? super org.apache.maven.artifact.Artifact`
in `maven-core/src/main/java/org/apache/maven/RepositoryUtils.java`
#### Snippet
```java

    public static void toArtifacts(
            Collection<org.apache.maven.artifact.Artifact> artifacts,
            Collection<? extends DependencyNode> nodes,
            List<String> trail,
```

### BoundedWildcard
Can generalize to `? extends org.apache.maven.artifact.Artifact`
in `maven-core/src/main/java/org/apache/maven/RepositoryUtils.java`
#### Snippet
```java
    }

    public static Collection<Artifact> toArtifacts(Collection<org.apache.maven.artifact.Artifact> artifactsToConvert) {
        return artifactsToConvert.stream().map(RepositoryUtils::toArtifact).collect(Collectors.toList());
    }
```

### BoundedWildcard
Can generalize to `? extends MavenProject`
in `maven-core/src/main/java/org/apache/maven/DefaultMaven.java`
#### Snippet
```java
    }

    private Map<String, MavenProject> getProjectMap(Collection<MavenProject> projects)
            throws DuplicateProjectException {
        Map<String, MavenProject> index = new LinkedHashMap<>();
```

### BoundedWildcard
Can generalize to `? extends T`
in `maven-core/src/main/java/org/apache/maven/DefaultMaven.java`
#### Snippet
```java
    }

    private <T> Collection<T> getExtensionComponents(Collection<MavenProject> projects, Class<T> role) {
        Collection<T> foundComponents = new LinkedHashSet<>();

```

### BoundedWildcard
Can generalize to `? extends MavenProject`
in `maven-core/src/main/java/org/apache/maven/DefaultMaven.java`
#### Snippet
```java
    }

    protected <T> Collection<T> getProjectScopedExtensionComponents(Collection<MavenProject> projects, Class<T> role) {

        Collection<T> foundComponents = new LinkedHashSet<>();
```

### BoundedWildcard
Can generalize to `? extends T`
in `maven-core/src/main/java/org/apache/maven/DefaultMaven.java`
#### Snippet
```java
    }

    protected <T> Collection<T> getProjectScopedExtensionComponents(Collection<MavenProject> projects, Class<T> role) {

        Collection<T> foundComponents = new LinkedHashSet<>();
```

### BoundedWildcard
Can generalize to `? extends MavenProject`
in `maven-core/src/main/java/org/apache/maven/graph/DefaultGraphBuilder.java`
#### Snippet
```java
    }

    private void enrichRequestFromResumptionData(List<MavenProject> projects, MavenExecutionRequest request) {
        if (request.isResume()) {
            projects.stream()
```

### BoundedWildcard
Can generalize to `? extends ResolutionListener`
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/resolver/DefaultLegacyArtifactCollector.java`
#### Snippet
```java
    private void fireEvent(
            int event,
            List<ResolutionListener> listeners,
            ResolutionNode node,
            Artifact replacement,
```

### BoundedWildcard
Can generalize to `? extends MojoExecution`
in `maven-core/src/main/java/org/apache/maven/plugin/DefaultMojosExecutionStrategy.java`
#### Snippet
```java
public class DefaultMojosExecutionStrategy implements MojosExecutionStrategy {
    @Override
    public void execute(List<MojoExecution> mojos, MavenSession session, MojoExecutionRunner mojoRunner)
            throws LifecycleExecutionException {
        for (MojoExecution mojoExecution : mojos) {
```

### BoundedWildcard
Can generalize to `? extends MojoDescriptor`
in `maven-core/src/main/java/org/apache/maven/plugin/DefaultPluginDescriptorCache.java`
#### Snippet
```java
    }

    private static List<ComponentDescriptor<?>> clone(List<MojoDescriptor> mojos, PluginDescriptor pluginDescriptor) {
        List<ComponentDescriptor<?>> clones = null;

```

### BoundedWildcard
Can generalize to `? extends Artifact`
in `maven-core/src/main/java/org/apache/maven/plugin/DefaultPluginArtifactsCache.java`
#### Snippet
```java
    }

    public CacheRecord put(Key key, List<Artifact> pluginArtifacts) {
        Objects.requireNonNull(pluginArtifacts, "pluginArtifacts cannot be null");

```

### BoundedWildcard
Can generalize to `? extends ArtifactRepository`
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java
     * @since 3.6.1
     */
    public List<ArtifactRepository> getEffectiveRepositories(List<ArtifactRepository> repositories) {
        if (repositories == null) {
            return null;
```

### BoundedWildcard
Can generalize to `? extends ArtifactRepositoryLayout`
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java
    @Inject
    public MavenRepositorySystem(
            ArtifactHandlerManager artifactHandlerManager, Map<String, ArtifactRepositoryLayout> layouts) {
        this.artifactHandlerManager = artifactHandlerManager;
        this.layouts = layouts;
```

### BoundedWildcard
Can generalize to `? extends ArtifactRepository`
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java
    }

    public void injectProxy(RepositorySystemSession session, List<ArtifactRepository> repositories) {
        if (repositories != null && session != null) {
            for (ArtifactRepository repository : repositories) {
```

### BoundedWildcard
Can generalize to `? extends ArtifactRepository`
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java
    }

    public void injectAuthentication(RepositorySystemSession session, List<ArtifactRepository> repositories) {
        if (repositories != null && session != null) {
            for (ArtifactRepository repository : repositories) {
```

### BoundedWildcard
Can generalize to `? extends ArtifactRepositoryPolicy`
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java
    }

    private ArtifactRepositoryPolicy getEffectivePolicy(Collection<ArtifactRepositoryPolicy> policies) {
        ArtifactRepositoryPolicy effectivePolicy = null;

```

### BoundedWildcard
Can generalize to `? extends ArtifactRepository`
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java
    }

    public Set<String> getRepoIds(List<ArtifactRepository> repositories) {
        Set<String> repoIds = new HashSet<>();

```

### BoundedWildcard
Can generalize to `? extends Parameter`
in `maven-core/src/main/java/org/apache/maven/plugin/PluginParameterException.java`
#### Snippet
```java
    }

    private static String format(List<Parameter> parameters) {
        StringBuilder buffer = new StringBuilder(128);
        if (parameters != null) {
```

### BoundedWildcard
Can generalize to `? super MetadataRequest`
in `maven-core/src/main/java/org/apache/maven/plugin/prefix/internal/DefaultPluginPrefixResolver.java`
#### Snippet
```java
            RequestTrace trace,
            List<MetadataResult> results,
            List<MetadataRequest> requests) {
        for (MetadataResult res : results) {
            org.eclipse.aether.metadata.Metadata metadata = res.getMetadata();
```

### BoundedWildcard
Can generalize to `? super String`
in `maven-core/src/main/java/org/apache/maven/plugin/internal/DefaultMavenPluginValidator.java`
#### Snippet
```java

    @Override
    public void validate(Artifact pluginArtifact, PluginDescriptor pluginDescriptor, List<String> errors) {
        if (!pluginArtifact.getGroupId().equals(pluginDescriptor.getGroupId())) {
            errors.add("Plugin's descriptor contains the wrong group ID: " + pluginDescriptor.getGroupId());
```

### BoundedWildcard
Can generalize to `? extends ArtifactRepository`
in `maven-core/src/main/java/org/apache/maven/project/DefaultProjectBuildingRequest.java`
#### Snippet
```java
    }

    public ProjectBuildingRequest setPluginArtifactRepositories(List<ArtifactRepository> pluginArtifactRepositories) {
        if (pluginArtifactRepositories != null) {
            this.pluginArtifactRepositories = new ArrayList<>(pluginArtifactRepositories);
```

### BoundedWildcard
Can generalize to `? extends ArtifactRepository`
in `maven-core/src/main/java/org/apache/maven/project/DefaultProjectBuildingRequest.java`
#### Snippet
```java
    }

    public ProjectBuildingRequest setRemoteRepositories(List<ArtifactRepository> remoteRepositories) {
        if (remoteRepositories != null) {
            this.remoteRepositories = new ArrayList<>(remoteRepositories);
```

### BoundedWildcard
Can generalize to `? extends Map`
in `maven-core/src/main/java/org/apache/maven/project/ProjectSorter.java`
#### Snippet
```java
    private void addEdge(
            Map<String, MavenProject> projectMap,
            Map<String, Map<String, Vertex>> vertexMap,
            MavenProject project,
            Vertex projectVertex,
```

### BoundedWildcard
Can generalize to `? extends MavenProject`
in `maven-core/src/main/java/org/apache/maven/project/ProjectSorter.java`
#### Snippet
```java
            Vertex toVertex,
            MavenProject fromProject,
            Map<String, MavenProject> projectMap,
            boolean force,
            boolean safe)
```

### BoundedWildcard
Can generalize to `? extends MavenProject`
in `maven-core/src/main/java/org/apache/maven/project/collector/MultiModuleCollectionStrategy.java`
#### Snippet
```java
     * @return true if the collected projects contain the requested project (for example with -f)
     */
    private boolean isRequestedProjectCollected(MavenExecutionRequest request, List<MavenProject> projects) {
        return projects.stream().map(MavenProject::getFile).anyMatch(request.getPom()::equals);
    }
```

### BoundedWildcard
Can generalize to `? extends Artifact`
in `maven-core/src/main/java/org/apache/maven/project/artifact/DefaultProjectArtifactsCache.java`
#### Snippet
```java

    @Override
    public CacheRecord put(Key key, Set<Artifact> projectArtifacts) {
        Objects.requireNonNull(projectArtifacts, "projectArtifacts cannot be null");

```

### BoundedWildcard
Can generalize to `? extends MavenPluginConfigurationValidator`
in `maven-core/src/main/java/org/apache/maven/plugin/internal/DefaultMavenPluginManager.java`
#### Snippet
```java
            PluginArtifactsCache pluginArtifactsCache,
            MavenPluginValidator pluginValidator,
            List<MavenPluginConfigurationValidator> configurationValidators,
            List<MavenPluginPrerequisitesChecker> prerequisitesCheckers) {
        this.container = container;
```

### BoundedWildcard
Can generalize to `? extends MavenPluginPrerequisitesChecker`
in `maven-core/src/main/java/org/apache/maven/plugin/internal/DefaultMavenPluginManager.java`
#### Snippet
```java
            MavenPluginValidator pluginValidator,
            List<MavenPluginConfigurationValidator> configurationValidators,
            List<MavenPluginPrerequisitesChecker> prerequisitesCheckers) {
        this.container = container;
        this.classRealmManager = classRealmManager;
```

### BoundedWildcard
Can generalize to `? extends ArtifactHandler`
in `maven-core/src/main/java/org/apache/maven/artifact/handler/manager/DefaultArtifactHandlerManager.java`
#### Snippet
```java

    @Inject
    public DefaultArtifactHandlerManager(Map<String, ArtifactHandler> artifactHandlers) {
        this.artifactHandlers = artifactHandlers;
    }
```

### BoundedWildcard
Can generalize to `? extends ArtifactHandler`
in `maven-core/src/main/java/org/apache/maven/artifact/handler/manager/DefaultArtifactHandlerManager.java`
#### Snippet
```java
    }

    public void addHandlers(Map<String, ArtifactHandler> handlers) {
        // legacy support for maven-gpg-plugin:1.0
        allHandlers.putAll(handlers);
```

### BoundedWildcard
Can generalize to `? extends T`
in `maven-core/src/main/java/org/apache/maven/session/scope/internal/SessionScope.java`
#### Snippet
```java
    }

    public <T> void seed(Class<T> clazz, final T value) {
        seed(clazz, (Provider<T>) () -> value);
    }
```

### BoundedWildcard
Can generalize to `? extends T`
in `maven-core/src/main/java/org/apache/maven/session/scope/internal/SessionScope.java`
#### Snippet
```java
        private volatile T value;

        CachingProvider(Provider<T> provider) {
            this.provider = provider;
        }
```

### BoundedWildcard
Can generalize to `? extends T`
in `maven-core/src/main/java/org/apache/maven/artifact/resolver/DefaultResolutionErrorHandler.java`
#### Snippet
```java
    }

    private static <T> List<T> toList(Collection<T> items) {
        return (items != null) ? new ArrayList<>(items) : null;
    }
```

### BoundedWildcard
Can generalize to `? extends ArtifactRepository`
in `maven-core/src/main/java/org/apache/maven/project/artifact/DefaultMavenMetadataCache.java`
#### Snippet
```java
    }

    private static int repositoriesHashCode(List<ArtifactRepository> repositories) {
        int result = 17;
        for (ArtifactRepository repository : repositories) {
```

### BoundedWildcard
Can generalize to `? extends ArtifactRepository`
in `maven-core/src/main/java/org/apache/maven/project/artifact/DefaultMavenMetadataCache.java`
#### Snippet
```java
                Set<Artifact> artifacts,
                Map<String, Artifact> managedVersions,
                List<ArtifactRepository> remoteRepositories) {
            this.pomArtifact = ArtifactUtils.copyArtifact(pomArtifact);
            this.relocatedArtifact = ArtifactUtils.copyArtifactSafe(relocatedArtifact);
```

### BoundedWildcard
Can generalize to `? extends ArtifactRepository`
in `maven-core/src/main/java/org/apache/maven/project/artifact/MavenMetadataSource.java`
#### Snippet
```java

    private List<ArtifactRepository> aggregateRepositories(
            List<ArtifactRepository> requestRepositories, List<ArtifactRepository> pomRepositories) {
        List<ArtifactRepository> repositories = requestRepositories;

```

### BoundedWildcard
Can generalize to `? extends ArtifactRepository`
in `maven-core/src/main/java/org/apache/maven/artifact/resolver/ArtifactResolutionResult.java`
#### Snippet
```java
    }

    public ArtifactResolutionResult setRepositories(final List<ArtifactRepository> repositories) {
        this.repositories = repositories;

```

### BoundedWildcard
Can generalize to `? extends Artifact`
in `maven-core/src/main/java/org/apache/maven/artifact/resolver/ResolutionNode.java`
#### Snippet
```java

    public void addDependencies(
            Set<Artifact> artifacts, List<ArtifactRepository> remoteRepositories, ArtifactFilter filter)
            throws CyclicDependencyException, OverConstrainedVersionException {
        if (artifacts != null && !artifacts.isEmpty()) {
```

### BoundedWildcard
Can generalize to `? extends ArtifactFilter`
in `maven-core/src/main/java/org/apache/maven/artifact/resolver/filter/AndArtifactFilter.java`
#### Snippet
```java
    }

    public AndArtifactFilter(List<ArtifactFilter> filters) {
        this.filters = new LinkedHashSet<>(filters);
    }
```

### BoundedWildcard
Can generalize to `? super String`
in `maven-core/src/main/java/org/apache/maven/project/MavenProject.java`
#### Snippet
```java
    }

    private void addArtifactPath(Artifact artifact, List<String> classpath) {
        File file = artifact.getFile();
        if (file != null) {
```

### BoundedWildcard
Can generalize to `? super String`
in `maven-core/src/main/java/org/apache/maven/project/MavenProject.java`
#### Snippet
```java
    // ----------------------------------------------------------------------

    private void addPath(List<String> paths, String path) {
        if (path != null) {
            path = path.trim();
```

### BoundedWildcard
Can generalize to `? extends ArtifactRepository`
in `maven-core/src/main/java/org/apache/maven/artifact/repository/MavenArtifactRepository.java`
#### Snippet
```java
    }

    public void setMirroredRepositories(List<ArtifactRepository> mirroredRepositories) {
        if (mirroredRepositories != null) {
            this.mirroredRepositories = Collections.unmodifiableList(mirroredRepositories);
```

### BoundedWildcard
Can generalize to `? super Node`
in `maven-core/src/main/java/org/apache/maven/internal/impl/AbstractNode.java`
#### Snippet
```java

    @Override
    public Node filter(Predicate<Node> filter) {
        List<Node> children =
                getChildren().stream().filter(filter).map(n -> n.filter(filter)).collect(Collectors.toList());
```

### BoundedWildcard
Can generalize to `? extends Artifact`
in `maven-core/src/main/java/org/apache/maven/DefaultProjectDependenciesResolver.java`
#### Snippet
```java
    }

    private Set<String> getIgnorableArtifacts(Iterable<Artifact> artifactIterable) {
        Set<String> projectIds = new HashSet<>();

```

### BoundedWildcard
Can generalize to `? super V`
in `maven-core/src/main/java/org/apache/maven/internal/impl/MappedCollection.java`
#### Snippet
```java
    private final Function<V, U> mapper;

    public MappedCollection(Collection<V> list, Function<V, U> mapper) {
        this.list = list;
        this.mapper = mapper;
```

### BoundedWildcard
Can generalize to `? extends U`
in `maven-core/src/main/java/org/apache/maven/internal/impl/MappedCollection.java`
#### Snippet
```java
    private final Function<V, U> mapper;

    public MappedCollection(Collection<V> list, Function<V, U> mapper) {
        this.list = list;
        this.mapper = mapper;
```

### BoundedWildcard
Can generalize to `? extends V`
in `maven-core/src/main/java/org/apache/maven/internal/impl/MappedList.java`
#### Snippet
```java
    private final Function<V, U> mapper;

    public MappedList(List<V> list, Function<V, U> mapper) {
        this.list = list;
        this.mapper = mapper;
```

### BoundedWildcard
Can generalize to `? super V`
in `maven-core/src/main/java/org/apache/maven/internal/impl/MappedList.java`
#### Snippet
```java
    private final Function<V, U> mapper;

    public MappedList(List<V> list, Function<V, U> mapper) {
        this.list = list;
        this.mapper = mapper;
```

### BoundedWildcard
Can generalize to `? extends U`
in `maven-core/src/main/java/org/apache/maven/internal/impl/MappedList.java`
#### Snippet
```java
    private final Function<V, U> mapper;

    public MappedList(List<V> list, Function<V, U> mapper) {
        this.list = list;
        this.mapper = mapper;
```

### BoundedWildcard
Can generalize to `? extends ExceptionSummary`
in `maven-core/src/main/java/org/apache/maven/exception/ExceptionSummary.java`
#### Snippet
```java
    }

    public ExceptionSummary(Throwable exception, String message, String reference, List<ExceptionSummary> children) {
        this.exception = exception;
        this.message = (message != null) ? message : "";
```

### BoundedWildcard
Can generalize to `? extends RemoteRepository`
in `maven-core/src/main/java/org/apache/maven/internal/impl/AbstractSession.java`
#### Snippet
```java
    }

    public List<org.eclipse.aether.repository.RemoteRepository> toRepositories(List<RemoteRepository> repositories) {
        return repositories == null
                ? null
```

### BoundedWildcard
Can generalize to `? extends Artifact`
in `maven-core/src/main/java/org/apache/maven/internal/impl/AbstractSession.java`
#### Snippet
```java
    public abstract org.eclipse.aether.graph.Dependency toDependency(DependencyCoordinate dependency);

    public List<org.eclipse.aether.artifact.Artifact> toArtifacts(Collection<Artifact> artifacts) {
        return artifacts == null
                ? null
```

### BoundedWildcard
Can generalize to `? extends DependencyCoordinate`
in `maven-core/src/main/java/org/apache/maven/internal/impl/AbstractSession.java`
#### Snippet
```java
    public abstract ArtifactRepository toArtifactRepository(RemoteRepository repository);

    public List<org.eclipse.aether.graph.Dependency> toDependencies(Collection<DependencyCoordinate> dependencies) {
        return dependencies == null
                ? null
```

### BoundedWildcard
Can generalize to `? extends RemoteRepository`
in `maven-core/src/main/java/org/apache/maven/internal/impl/AbstractSession.java`
#### Snippet
```java
    }

    public List<ArtifactRepository> toArtifactRepositories(List<RemoteRepository> repositories) {
        return repositories == null
                ? null
```

### BoundedWildcard
Can generalize to `? extends MavenProject`
in `maven-core/src/main/java/org/apache/maven/internal/impl/AbstractSession.java`
#### Snippet
```java
    }

    public List<Project> getProjects(List<MavenProject> projects) {
        return projects == null ? null : projects.stream().map(this::getProject).collect(Collectors.toList());
    }
```

### BoundedWildcard
Can generalize to `? extends MavenProject`
in `maven-core/src/main/java/org/apache/maven/execution/DefaultMavenExecutionResult.java`
#### Snippet
```java
    }

    public MavenExecutionResult setTopologicallySortedProjects(List<MavenProject> topologicallySortedProjects) {
        this.topologicallySortedProjects = topologicallySortedProjects;

```

### BoundedWildcard
Can generalize to `? super ActivationSettings`
in `maven-core/src/main/java/org/apache/maven/execution/ProjectActivation.java`
#### Snippet
```java
    }

    private Stream<ProjectActivationSettings> getProjects(final Predicate<ActivationSettings> predicate) {
        return this.activations.stream().filter(activation -> predicate.test(activation.activationSettings));
    }
```

### BoundedWildcard
Can generalize to `? super ActivationSettings`
in `maven-core/src/main/java/org/apache/maven/execution/ProfileActivation.java`
#### Snippet
```java
    }

    private Set<String> getProfileIds(final Predicate<ActivationSettings> predicate) {
        return this.activations.entrySet().stream()
                .filter(e -> predicate.test(e.getValue()))
```

### BoundedWildcard
Can generalize to `? extends File`
in `maven-core/src/main/java/org/apache/maven/extension/internal/CoreExtensionEntry.java`
#### Snippet
```java
    }

    public static CoreExtensionEntry discoverFrom(ClassRealm loader, Collection<File> classpath) {
        Set<String> artifacts = new LinkedHashSet<>();
        Set<String> packages = new LinkedHashSet<>();
```

### BoundedWildcard
Can generalize to `? extends ExecutionPlanItem`
in `maven-core/src/main/java/org/apache/maven/lifecycle/MavenExecutionPlan.java`
#### Snippet
```java

    private static Iterable<String> getDistinctPhasesInOrderOfExecutionPlanAppearance(
            List<ExecutionPlanItem> planItems) {
        LinkedHashSet<String> result = new LinkedHashSet<>();
        for (ExecutionPlanItem executionPlanItem : planItems) {
```

### BoundedWildcard
Can generalize to `? extends ArtifactRepository`
in `maven-core/src/main/java/org/apache/maven/execution/DefaultMavenExecutionRequest.java`
#### Snippet
```java

    @Override
    public MavenExecutionRequest setRemoteRepositories(List<ArtifactRepository> remoteRepositories) {
        if (remoteRepositories != null) {
            this.remoteRepositories = new ArrayList<>(remoteRepositories);
```

### BoundedWildcard
Can generalize to `? extends ArtifactRepository`
in `maven-core/src/main/java/org/apache/maven/execution/DefaultMavenExecutionRequest.java`
#### Snippet
```java

    @Override
    public MavenExecutionRequest setPluginArtifactRepositories(List<ArtifactRepository> pluginArtifactRepositories) {
        if (pluginArtifactRepositories != null) {
            this.pluginArtifactRepositories = new ArrayList<>(pluginArtifactRepositories);
```

### BoundedWildcard
Can generalize to `? extends MojoExecution`
in `maven-core/src/main/java/org/apache/maven/lifecycle/internal/ExecutionPlanItem.java`
#### Snippet
```java

    public static List<ExecutionPlanItem> createExecutionPlanItems(
            MavenProject mavenProject, List<MojoExecution> executions) {
        BuilderCommon.attachToThread(mavenProject);

```

### BoundedWildcard
Can generalize to `? extends Lifecycle`
in `maven-core/src/main/java/org/apache/maven/lifecycle/mapping/DefaultLifecycleMapping.java`
#### Snippet
```java
     * Ctor to be used in Java code/providers.
     */
    public DefaultLifecycleMapping(final List<Lifecycle> lifecycles) {
        this.lifecycleMap =
                Collections.unmodifiableMap(lifecycles.stream().collect(toMap(Lifecycle::getId, identity())));
```

### BoundedWildcard
Can generalize to `? super Integer`
in `maven-core/src/main/java/org/apache/maven/lifecycle/internal/DefaultLifecycleMappingDelegate.java`
#### Snippet
```java

    private void addMojoExecution(
            Map<Integer, List<MojoExecution>> phaseBindings, MojoExecution mojoExecution, int priority) {
        List<MojoExecution> mojoExecutions = phaseBindings.computeIfAbsent(priority, k -> new ArrayList<>());

```

### BoundedWildcard
Can generalize to `? extends ProjectExecutionListener`
in `maven-core/src/main/java/org/apache/maven/lifecycle/internal/CompoundProjectExecutionListener.java`
#### Snippet
```java
    private final Collection<ProjectExecutionListener> listeners;

    CompoundProjectExecutionListener(Collection<ProjectExecutionListener> listeners) {
        this.listeners = listeners; // NB this is live injected collection
    }
```

### BoundedWildcard
Can generalize to `? extends Builder`
in `maven-core/src/main/java/org/apache/maven/lifecycle/internal/LifecycleStarter.java`
#### Snippet
```java
            LifecycleDebugLogger lifecycleDebugLogger,
            LifecycleTaskSegmentCalculator lifecycleTaskSegmentCalculator,
            Map<String, Builder> builders,
            SessionScope sessionScope) {
        this.eventCatapult = eventCatapult;
```

### BoundedWildcard
Can generalize to `? extends MojoExecution`
in `maven-core/src/main/java/org/apache/maven/lifecycle/internal/LifecycleDebugLogger.java`
#### Snippet
```java
    }

    private void debugDependencyRequirements(List<MojoExecution> mojoExecutions) {
        Set<String> scopesToCollect = new TreeSet<>();
        Set<String> scopesToResolve = new TreeSet<>();
```

### BoundedWildcard
Can generalize to `? extends MojosExecutionStrategy`
in `maven-core/src/main/java/org/apache/maven/lifecycle/internal/MojoExecutor.java`
#### Snippet
```java
            LifecycleDependencyResolver lifeCycleDependencyResolver,
            ExecutionEventCatapult eventCatapult,
            Provider<MojosExecutionStrategy> mojosExecutionStrategy) {
        this.pluginManager = pluginManager;
        this.mavenPluginManager = mavenPluginManager;
```

### BoundedWildcard
Can generalize to `? super String`
in `maven-core/src/main/java/org/apache/maven/lifecycle/internal/MojoExecutor.java`
#### Snippet
```java

    private void collectDependencyRequirements(
            Set<String> scopesToResolve, Set<String> scopesToCollect, Collection<MojoExecution> mojoExecutions) {
        for (MojoExecution mojoExecution : mojoExecutions) {
            MojoDescriptor mojoDescriptor = mojoExecution.getMojoDescriptor();
```

### BoundedWildcard
Can generalize to `? super String`
in `maven-core/src/main/java/org/apache/maven/lifecycle/internal/MojoExecutor.java`
#### Snippet
```java

    private void collectDependencyRequirements(
            Set<String> scopesToResolve, Set<String> scopesToCollect, Collection<MojoExecution> mojoExecutions) {
        for (MojoExecution mojoExecution : mojoExecutions) {
            MojoDescriptor mojoDescriptor = mojoExecution.getMojoDescriptor();
```

### BoundedWildcard
Can generalize to `? extends MojoExecution`
in `maven-core/src/main/java/org/apache/maven/lifecycle/internal/MojoExecutor.java`
#### Snippet
```java

    private void collectDependencyRequirements(
            Set<String> scopesToResolve, Set<String> scopesToCollect, Collection<MojoExecution> mojoExecutions) {
        for (MojoExecution mojoExecution : mojoExecutions) {
            MojoDescriptor mojoDescriptor = mojoExecution.getMojoDescriptor();
```

### BoundedWildcard
Can generalize to `? extends MavenProject`
in `maven-core/src/main/java/org/apache/maven/lifecycle/internal/builder/multithreaded/MultiThreadedBuilder.java`
#### Snippet
```java
            CompletionService<ProjectSegment> service,
            TaskSegment taskSegment,
            Map<MavenProject, ProjectSegment> projectBuildList,
            ThreadOutputMuxer muxer) {
        // gather artifactIds which are not unique so that the respective thread names can be extended with the groupId
```

### BoundedWildcard
Can generalize to `? extends Artifact`
in `maven-core/src/main/java/org/apache/maven/lifecycle/internal/LifecycleDependencyResolver.java`
#### Snippet
```java
        private Set<String> keys = new HashSet<>();

        ReactorDependencyFilter(Collection<Artifact> artifacts) {
            for (Artifact artifact : artifacts) {
                String key = ArtifactUtils.key(artifact);
```

### BoundedWildcard
Can generalize to `? extends MavenProject`
in `maven-core/src/main/java/org/apache/maven/lifecycle/internal/LifecycleDependencyResolver.java`
#### Snippet
```java
    }

    private Set<String> getReactorProjectKeys(Collection<MavenProject> projects) {
        Set<String> projectKeys = new HashSet<>(projects.size() * 2);
        for (MavenProject project : projects) {
```

### BoundedWildcard
Can generalize to `? extends LifecycleMappingDelegate`
in `maven-core/src/main/java/org/apache/maven/lifecycle/internal/DefaultLifecycleExecutionPlanCalculator.java`
#### Snippet
```java
            LifecyclePluginResolver lifecyclePluginResolver,
            @Named(DefaultLifecycleMappingDelegate.HINT) LifecycleMappingDelegate standardDelegate,
            Map<String, LifecycleMappingDelegate> delegates,
            Map<String, MojoExecutionConfigurator> mojoExecutionConfigurators) {
        this.pluginManager = pluginManager;
```

### BoundedWildcard
Can generalize to `? extends MojoExecutionConfigurator`
in `maven-core/src/main/java/org/apache/maven/lifecycle/internal/DefaultLifecycleExecutionPlanCalculator.java`
#### Snippet
```java
            @Named(DefaultLifecycleMappingDelegate.HINT) LifecycleMappingDelegate standardDelegate,
            Map<String, LifecycleMappingDelegate> delegates,
            Map<String, MojoExecutionConfigurator> mojoExecutionConfigurators) {
        this.pluginManager = pluginManager;
        this.defaultLifecycles = defaultLifecycles;
```

### BoundedWildcard
Can generalize to `? extends MojoExecution`
in `maven-core/src/main/java/org/apache/maven/lifecycle/internal/DefaultLifecycleExecutionPlanCalculator.java`
#### Snippet
```java

    private Set<MojoDescriptor> fillMojoDescriptors(
            MavenSession session, MavenProject project, List<MojoExecution> mojoExecutions)
            throws InvalidPluginDescriptorException, MojoNotFoundException, PluginResolutionException,
                    PluginDescriptorParsingException, PluginNotFoundException {
```

### BoundedWildcard
Can generalize to `? extends Map`
in `maven-model/src/main/java/org/apache/maven/model/WrapperProperties.java`
#### Snippet
```java
    final Consumer<Properties> setter;

    WrapperProperties(Supplier<Map<String, String>> getter, Consumer<Properties> setter) {
        this.getter = getter;
        this.setter = setter;
```

### BoundedWildcard
Can generalize to `? super Properties`
in `maven-model/src/main/java/org/apache/maven/model/WrapperProperties.java`
#### Snippet
```java
    final Consumer<Properties> setter;

    WrapperProperties(Supplier<Map<String, String>> getter, Consumer<Properties> setter) {
        this.getter = getter;
        this.setter = setter;
```

### BoundedWildcard
Can generalize to `? extends Map`
in `maven-toolchain-model/src/main/java/org/apache/maven/toolchain/model/WrapperProperties.java`
#### Snippet
```java
    final Consumer<Properties> setter;

    WrapperProperties(Supplier<Map<String, String>> getter, Consumer<Properties> setter) {
        this.getter = getter;
        this.setter = setter;
```

### BoundedWildcard
Can generalize to `? super Properties`
in `maven-toolchain-model/src/main/java/org/apache/maven/toolchain/model/WrapperProperties.java`
#### Snippet
```java
    final Consumer<Properties> setter;

    WrapperProperties(Supplier<Map<String, String>> getter, Consumer<Properties> setter) {
        this.getter = getter;
        this.setter = setter;
```

### BoundedWildcard
Can generalize to `? extends ClassRealmManagerDelegate`
in `maven-core/src/main/java/org/apache/maven/classrealm/DefaultClassRealmManager.java`
#### Snippet
```java
    @Inject
    public DefaultClassRealmManager(
            PlexusContainer container, List<ClassRealmManagerDelegate> delegates, CoreExports exports) {
        this.world = ((MutablePlexusContainer) container).getClassWorld();
        this.containerRealm = container.getContainerRealm();
```

### BoundedWildcard
Can generalize to `? extends Artifact`
in `maven-core/src/main/java/org/apache/maven/classrealm/DefaultClassRealmManager.java`
#### Snippet
```java
            List<String> parentImports,
            Map<String, ClassLoader> foreignImports,
            List<Artifact> artifacts) {
        Set<String> artifactIds = new LinkedHashSet<>();

```

### BoundedWildcard
Can generalize to `? extends ClassRealmConstituent`
in `maven-core/src/main/java/org/apache/maven/classrealm/DefaultClassRealmManager.java`
#### Snippet
```java
    }

    private Set<String> populateRealm(ClassRealm classRealm, List<ClassRealmConstituent> constituents) {
        Set<String> includedIds = new LinkedHashSet<>();

```

### BoundedWildcard
Can generalize to `? extends List`
in `maven-model/src/main/java/org/apache/maven/model/WrapperList.java`
#### Snippet
```java
    }

    WrapperList(Supplier<List<U>> getter, Consumer<List<U>> setter, Function<U, T> mapper, Function<T, U> revMapper) {
        this.getter = getter;
        this.setter = setter;
```

### BoundedWildcard
Can generalize to `? super List`
in `maven-model/src/main/java/org/apache/maven/model/WrapperList.java`
#### Snippet
```java
    }

    WrapperList(Supplier<List<U>> getter, Consumer<List<U>> setter, Function<U, T> mapper, Function<T, U> revMapper) {
        this.getter = getter;
        this.setter = setter;
```

### BoundedWildcard
Can generalize to `? super U`
in `maven-model/src/main/java/org/apache/maven/model/WrapperList.java`
#### Snippet
```java
    }

    WrapperList(Supplier<List<U>> getter, Consumer<List<U>> setter, Function<U, T> mapper, Function<T, U> revMapper) {
        this.getter = getter;
        this.setter = setter;
```

### BoundedWildcard
Can generalize to `? extends T`
in `maven-model/src/main/java/org/apache/maven/model/WrapperList.java`
#### Snippet
```java
    }

    WrapperList(Supplier<List<U>> getter, Consumer<List<U>> setter, Function<U, T> mapper, Function<T, U> revMapper) {
        this.getter = getter;
        this.setter = setter;
```

### BoundedWildcard
Can generalize to `? super T`
in `maven-model/src/main/java/org/apache/maven/model/WrapperList.java`
#### Snippet
```java
    }

    WrapperList(Supplier<List<U>> getter, Consumer<List<U>> setter, Function<U, T> mapper, Function<T, U> revMapper) {
        this.getter = getter;
        this.setter = setter;
```

### BoundedWildcard
Can generalize to `? extends U`
in `maven-model/src/main/java/org/apache/maven/model/WrapperList.java`
#### Snippet
```java
    }

    WrapperList(Supplier<List<U>> getter, Consumer<List<U>> setter, Function<U, T> mapper, Function<T, U> revMapper) {
        this.getter = getter;
        this.setter = setter;
```

### BoundedWildcard
Can generalize to `? extends List`
in `maven-toolchain-model/src/main/java/org/apache/maven/toolchain/model/WrapperList.java`
#### Snippet
```java
    }

    WrapperList(Supplier<List<U>> getter, Consumer<List<U>> setter, Function<U, T> mapper, Function<T, U> revMapper) {
        this.getter = getter;
        this.setter = setter;
```

### BoundedWildcard
Can generalize to `? super List`
in `maven-toolchain-model/src/main/java/org/apache/maven/toolchain/model/WrapperList.java`
#### Snippet
```java
    }

    WrapperList(Supplier<List<U>> getter, Consumer<List<U>> setter, Function<U, T> mapper, Function<T, U> revMapper) {
        this.getter = getter;
        this.setter = setter;
```

### BoundedWildcard
Can generalize to `? super U`
in `maven-toolchain-model/src/main/java/org/apache/maven/toolchain/model/WrapperList.java`
#### Snippet
```java
    }

    WrapperList(Supplier<List<U>> getter, Consumer<List<U>> setter, Function<U, T> mapper, Function<T, U> revMapper) {
        this.getter = getter;
        this.setter = setter;
```

### BoundedWildcard
Can generalize to `? extends T`
in `maven-toolchain-model/src/main/java/org/apache/maven/toolchain/model/WrapperList.java`
#### Snippet
```java
    }

    WrapperList(Supplier<List<U>> getter, Consumer<List<U>> setter, Function<U, T> mapper, Function<T, U> revMapper) {
        this.getter = getter;
        this.setter = setter;
```

### BoundedWildcard
Can generalize to `? super T`
in `maven-toolchain-model/src/main/java/org/apache/maven/toolchain/model/WrapperList.java`
#### Snippet
```java
    }

    WrapperList(Supplier<List<U>> getter, Consumer<List<U>> setter, Function<U, T> mapper, Function<T, U> revMapper) {
        this.getter = getter;
        this.setter = setter;
```

### BoundedWildcard
Can generalize to `? extends U`
in `maven-toolchain-model/src/main/java/org/apache/maven/toolchain/model/WrapperList.java`
#### Snippet
```java
    }

    WrapperList(Supplier<List<U>> getter, Consumer<List<U>> setter, Function<U, T> mapper, Function<T, U> revMapper) {
        this.getter = getter;
        this.setter = setter;
```

### BoundedWildcard
Can generalize to `? super ProjectBuildingResult`
in `maven-core/src/main/java/org/apache/maven/project/DefaultProjectBuilder.java`
#### Snippet
```java

    private boolean build(
            List<ProjectBuildingResult> results,
            List<MavenProject> projects,
            Map<File, MavenProject> projectIndex,
```

### BoundedWildcard
Can generalize to `? super MavenProject`
in `maven-core/src/main/java/org/apache/maven/project/DefaultProjectBuilder.java`
#### Snippet
```java
    private boolean build(
            List<ProjectBuildingResult> results,
            List<MavenProject> projects,
            Map<File, MavenProject> projectIndex,
            List<InterimResult> interimResults,
```

### BoundedWildcard
Can generalize to `? extends InterimResult`
in `maven-core/src/main/java/org/apache/maven/project/DefaultProjectBuilder.java`
#### Snippet
```java
            List<MavenProject> projects,
            Map<File, MavenProject> projectIndex,
            List<InterimResult> interimResults,
            ProjectBuildingRequest request,
            Map<File, Boolean> profilesXmls,
```

### BoundedWildcard
Can generalize to `? extends File`
in `maven-core/src/main/java/org/apache/maven/project/DefaultProjectBuilder.java`
#### Snippet
```java
            List<InterimResult> interimResults,
            Map<File, MavenProject> projectIndex,
            List<File> pomFiles,
            Set<File> aggregatorFiles,
            boolean root,
```

## RuleId[ruleID=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `private final @Nonnull`
in `maven-core/src/main/java/org/apache/maven/internal/impl/DefaultArtifact.java`
#### Snippet
```java
public class DefaultArtifact implements Artifact {
    private final @Nonnull AbstractSession session;
    private final @Nonnull org.eclipse.aether.artifact.Artifact artifact;
    private final String id;

```

### MissortedModifiers
Missorted modifiers `private final @Nonnull`
in `maven-core/src/main/java/org/apache/maven/internal/impl/DefaultArtifact.java`
#### Snippet
```java
 */
public class DefaultArtifact implements Artifact {
    private final @Nonnull AbstractSession session;
    private final @Nonnull org.eclipse.aether.artifact.Artifact artifact;
    private final String id;
```

### MissortedModifiers
Missorted modifiers `private final @Nonnull`
in `maven-core/src/main/java/org/apache/maven/internal/impl/DefaultLocalRepository.java`
#### Snippet
```java
public class DefaultLocalRepository implements LocalRepository {

    private final @Nonnull org.eclipse.aether.repository.LocalRepository repository;

    @Inject
```

### MissortedModifiers
Missorted modifiers `private final @Nonnull`
in `maven-core/src/main/java/org/apache/maven/internal/impl/DefaultMessageBuilder.java`
#### Snippet
```java
@Experimental
public class DefaultMessageBuilder implements MessageBuilder {
    private final @Nonnull org.apache.maven.shared.utils.logging.MessageBuilder delegate;

    public DefaultMessageBuilder(@Nonnull org.apache.maven.shared.utils.logging.MessageBuilder delegate) {
```

### MissortedModifiers
Missorted modifiers `private final @Nonnull`
in `maven-core/src/main/java/org/apache/maven/internal/impl/DefaultArtifactDeployer.java`
#### Snippet
```java
@Singleton
public class DefaultArtifactDeployer implements ArtifactDeployer {
    private final @Nonnull RepositorySystem repositorySystem;

    @Inject
```

### MissortedModifiers
Missorted modifiers `protected final @Nonnull`
in `maven-core/src/main/java/org/apache/maven/internal/impl/DefaultNode.java`
#### Snippet
```java
public class DefaultNode extends AbstractNode {

    protected final @Nonnull AbstractSession session;
    protected final @Nonnull org.eclipse.aether.graph.DependencyNode node;
    protected final boolean verbose;
```

### MissortedModifiers
Missorted modifiers `protected final @Nonnull`
in `maven-core/src/main/java/org/apache/maven/internal/impl/DefaultNode.java`
#### Snippet
```java

    protected final @Nonnull AbstractSession session;
    protected final @Nonnull org.eclipse.aether.graph.DependencyNode node;
    protected final boolean verbose;

```

### MissortedModifiers
Missorted modifiers `private final @Nonnull`
in `maven-core/src/main/java/org/apache/maven/internal/impl/DefaultArtifactCoordinate.java`
#### Snippet
```java
 */
public class DefaultArtifactCoordinate implements ArtifactCoordinate {
    private final @Nonnull AbstractSession session;
    private final @Nonnull org.eclipse.aether.artifact.Artifact coordinate;

```

### MissortedModifiers
Missorted modifiers `private final @Nonnull`
in `maven-core/src/main/java/org/apache/maven/internal/impl/DefaultArtifactCoordinate.java`
#### Snippet
```java
public class DefaultArtifactCoordinate implements ArtifactCoordinate {
    private final @Nonnull AbstractSession session;
    private final @Nonnull org.eclipse.aether.artifact.Artifact coordinate;

    public DefaultArtifactCoordinate(
```

## RuleId[ruleID=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/metadata/DefaultRepositoryMetadataManager.java`
#### Snippet
```java
                                    // ignore
                                }
                                file.delete(); // if this fails, forget about it
                            }
                        }
```

### IgnoreResultOfCall
Result of `File.setLastModified()` is ignored
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/metadata/DefaultRepositoryMetadataManager.java`
#### Snippet
```java
                // touch file so that this is not checked again until interval has passed
                if (file.exists()) {
                    file.setLastModified(System.currentTimeMillis());
                }
            }
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/metadata/DefaultRepositoryMetadataManager.java`
#### Snippet
```java
                        // ignore
                    }
                    file.delete(); // if this fails, forget about it
                }
            }
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/DefaultUpdateCheckManager.java`
#### Snippet
```java

        if (file.exists()) {
            touchfile.delete();
        } else {
            writeLastUpdated(touchfile, getRepositoryKey(repository), error);
```

### IgnoreResultOfCall
Result of `File.setLastModified()` is ignored
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/DefaultWagonManager.java`
#### Snippet
```java
                            if (!downloaded) {
                                // prevent additional checks of this artifact until it expires again
                                destination.setLastModified(System.currentTimeMillis());
                            }
                        } catch (UnsupportedOperationException e) {
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/DefaultWagonManager.java`
#### Snippet
```java
                File checksumFile = new File(destination + checksumFileExtension);
                if (checksumFile.exists()) {
                    checksumFile.delete(); // ignore if failed as we will overwrite
                }
                FileUtils.copyFile(tempChecksumFile, checksumFile);
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `maven-settings-builder/src/main/java/org/apache/maven/settings/io/DefaultSettingsWriter.java`
#### Snippet
```java
        Objects.requireNonNull(settings, "settings cannot be null");

        output.getParentFile().mkdirs();

        write(WriterFactory.newXmlWriter(output), options, settings);
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `maven-model-builder/src/main/java/org/apache/maven/model/io/DefaultModelWriter.java`
#### Snippet
```java
        Objects.requireNonNull(model, "model cannot be null");

        output.getParentFile().mkdirs();

        write(WriterFactory.newXmlWriter(output), options, model);
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `maven-resolver-provider/src/main/java/org/apache/maven/repository/internal/MavenMetadata.java`
#### Snippet
```java

    private void write(File metadataFile, Metadata metadata) throws RepositoryException {
        metadataFile.getParentFile().mkdirs();
        try (Writer writer = WriterFactory.newXmlWriter(metadataFile)) {
            new MetadataXpp3Writer().write(writer, metadata);
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `maven-core/src/main/java/org/apache/maven/DefaultMaven.java`
#### Snippet
```java
        logger.debug("Using local repository at " + localRepoDir);

        localRepoDir.mkdirs();

        if (!localRepoDir.isDirectory()) {
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `maven-core/src/main/java/org/apache/maven/artifact/repository/metadata/AbstractRepositoryMetadata.java`
#### Snippet
```java
                    // ignore
                }
                metadataFile.delete(); // if this fails, forget about it, we'll try to overwrite it anyway so no need
                // to delete on exit
            }
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `maven-core/src/main/java/org/apache/maven/artifact/repository/metadata/AbstractRepositoryMetadata.java`
#### Snippet
```java

        if (changed || !metadataFile.exists()) {
            metadataFile.getParentFile().mkdirs();
            try (Writer writer = WriterFactory.newXmlWriter(metadataFile)) {
                MetadataXpp3Writer mappingWriter = new MetadataXpp3Writer();
```

### IgnoreResultOfCall
Result of `File.setLastModified()` is ignored
in `maven-core/src/main/java/org/apache/maven/artifact/repository/metadata/AbstractRepositoryMetadata.java`
#### Snippet
```java
            }
        } else {
            metadataFile.setLastModified(System.currentTimeMillis());
        }
    }
```

## RuleId[ruleID=RedundantMethodOverride]
### RedundantMethodOverride
Method `setJavaHome()` only delegates to its super method
in `maven-core/src/main/java/org/apache/maven/toolchain/java/DefaultJavaToolChain.java`
#### Snippet
```java

    @Override
    public void setJavaHome(String javaHome) {
        super.setJavaHome(javaHome);
    }
```

### RedundantMethodOverride
Method `getJavaHome()` only delegates to its super method
in `maven-core/src/main/java/org/apache/maven/toolchain/java/DefaultJavaToolChain.java`
#### Snippet
```java

    @Override
    public String getJavaHome() {
        return super.getJavaHome();
    }
```

## RuleId[ruleID=ClassNameSameAsAncestorName]
### ClassNameSameAsAncestorName
Class name `WagonConfigurationException` is the same as one of its superclass' names
in `maven-compat/src/main/java/org/apache/maven/artifact/manager/WagonConfigurationException.java`
#### Snippet
```java
 */
@Deprecated
public class WagonConfigurationException extends org.apache.maven.repository.legacy.WagonConfigurationException {
    public WagonConfigurationException(String repositoryId, String message, Throwable cause) {
        super(repositoryId, message, cause);
```

### ClassNameSameAsAncestorName
Class name `WagonManager` is the same as one of its superclass' names
in `maven-compat/src/main/java/org/apache/maven/artifact/manager/WagonManager.java`
#### Snippet
```java
 */
@Deprecated
public interface WagonManager extends org.apache.maven.repository.legacy.WagonManager {
    /**
     * this method is only here for backward compat (project-info-reports:dependencies)
```

### ClassNameSameAsAncestorName
Class name `DefaultWagonManager` is the same as one of its superclass' names
in `maven-compat/src/main/java/org/apache/maven/artifact/manager/DefaultWagonManager.java`
#### Snippet
```java
 */
@Component(role = WagonManager.class)
public class DefaultWagonManager extends org.apache.maven.repository.legacy.DefaultWagonManager
        implements WagonManager {

```

### ClassNameSameAsAncestorName
Class name `ArtifactMetadata` is the same as one of its superclass' names
in `maven-artifact/src/main/java/org/apache/maven/artifact/metadata/ArtifactMetadata.java`
#### Snippet
```java
 */
@Deprecated
public interface ArtifactMetadata extends org.apache.maven.repository.legacy.metadata.ArtifactMetadata {
    void merge(ArtifactMetadata metadata);
}
```

### ClassNameSameAsAncestorName
Class name `ArtifactMetadataRetrievalException` is the same as one of its superclass' names
in `maven-core/src/main/java/org/apache/maven/artifact/metadata/ArtifactMetadataRetrievalException.java`
#### Snippet
```java
 */
@Deprecated
public class ArtifactMetadataRetrievalException
        extends org.apache.maven.repository.legacy.metadata.ArtifactMetadataRetrievalException {

```

### ClassNameSameAsAncestorName
Class name `AbstractArtifactMetadata` is the same as one of its superclass' names
in `maven-core/src/main/java/org/apache/maven/artifact/metadata/AbstractArtifactMetadata.java`
#### Snippet
```java
 */
@Deprecated
public abstract class AbstractArtifactMetadata
        extends org.apache.maven.repository.legacy.metadata.AbstractArtifactMetadata
        implements org.apache.maven.artifact.metadata.ArtifactMetadata {
```

### ClassNameSameAsAncestorName
Class name `ArtifactMetadataSource` is the same as one of its superclass' names
in `maven-core/src/main/java/org/apache/maven/artifact/metadata/ArtifactMetadataSource.java`
#### Snippet
```java
 */
@Deprecated
public interface ArtifactMetadataSource extends org.apache.maven.repository.legacy.metadata.ArtifactMetadataSource {

    ResolutionGroup retrieve(MetadataResolutionRequest request) throws ArtifactMetadataRetrievalException;
```

### ClassNameSameAsAncestorName
Class name `ResolutionGroup` is the same as one of its superclass' names
in `maven-core/src/main/java/org/apache/maven/artifact/metadata/ResolutionGroup.java`
#### Snippet
```java
 */
@Deprecated
public class ResolutionGroup extends org.apache.maven.repository.legacy.metadata.ResolutionGroup {

    public ResolutionGroup(
```

## RuleId[ruleID=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `maven-artifact/src/main/java/org/apache/maven/artifact/versioning/ComparableVersion.java`
#### Snippet
```java
                startIndex = i + 1;

                list.add(list = new ListItem());
                stack.push(list);
            } else if (Character.isDigit(c)) {
```

### NestedAssignment
Result of assignment expression used
in `maven-artifact/src/main/java/org/apache/maven/artifact/versioning/ComparableVersion.java`
#### Snippet
```java
                    startIndex = i;

                    list.add(list = new ListItem());
                    stack.push(list);
                }
```

### NestedAssignment
Result of assignment expression used
in `maven-artifact/src/main/java/org/apache/maven/artifact/versioning/ComparableVersion.java`
#### Snippet
```java
                    startIndex = i;

                    list.add(list = new ListItem());
                    stack.push(list);
                }
```

### NestedAssignment
Result of assignment expression used
in `maven-core/src/main/java/org/apache/maven/artifact/repository/MavenArtifactRepository.java`
#### Snippet
```java
        if (url != null) {
            int pos = -1;
            while ((pos = decoded.indexOf('%', pos + 1)) >= 0) {
                if (pos + 2 < decoded.length()) {
                    String hexStr = decoded.substring(pos + 1, pos + 3);
```

## RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
### ReplaceAssignmentWithOperatorAssignment
`transferred = transferred + length` could be simplified to 'transferred += length'
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/TransferListenerAdapter.java`
#### Snippet
```java
                transferred = (long) length;
            } else {
                transferred = transferred + length;
            }
            transfers.put(transferEvent.getResource(), transferred);
```

### ReplaceAssignmentWithOperatorAssignment
`value = value + expression.substring(pathSeparator)` could be simplified to 'value += expression.substring(pathSeparator)'
in `maven-core/src/main/java/org/apache/maven/plugin/PluginParameterExpressionEvaluatorV4.java`
#### Snippet
```java
                    String pathExpression = expression.substring(1, pathSeparator);
                    value = ReflectionValueExtractor.evaluate(pathExpression, session);
                    value = value + expression.substring(pathSeparator);
                } else {
                    value = ReflectionValueExtractor.evaluate(expression.substring(1), session);
```

### ReplaceAssignmentWithOperatorAssignment
`value = value + expression.substring(pathSeparator)` could be simplified to 'value += expression.substring(pathSeparator)'
in `maven-core/src/main/java/org/apache/maven/plugin/PluginParameterExpressionEvaluatorV4.java`
#### Snippet
```java
                    String pathExpression = expression.substring(0, pathSeparator);
                    value = ReflectionValueExtractor.evaluate(pathExpression, project);
                    value = value + expression.substring(pathSeparator);
                } else {
                    value = ReflectionValueExtractor.evaluate(expression.substring(1), project);
```

### ReplaceAssignmentWithOperatorAssignment
`value = value + expression.substring(pathSeparator)` could be simplified to 'value += expression.substring(pathSeparator)'
in `maven-core/src/main/java/org/apache/maven/plugin/PluginParameterExpressionEvaluatorV4.java`
#### Snippet
```java
                    String pathExpression = expression.substring(1, pathSeparator);
                    value = ReflectionValueExtractor.evaluate(pathExpression, mojoExecution);
                    value = value + expression.substring(pathSeparator);
                } else {
                    value = ReflectionValueExtractor.evaluate(expression.substring(1), mojoExecution);
```

### ReplaceAssignmentWithOperatorAssignment
`value = value + expression.substring(pathSeparator)` could be simplified to 'value += expression.substring(pathSeparator)'
in `maven-core/src/main/java/org/apache/maven/plugin/PluginParameterExpressionEvaluatorV4.java`
#### Snippet
```java
                    String pathExpression = expression.substring(1, pathSeparator);
                    value = ReflectionValueExtractor.evaluate(pathExpression, pluginDescriptor);
                    value = value + expression.substring(pathSeparator);
                } else {
                    value = ReflectionValueExtractor.evaluate(expression.substring(1), pluginDescriptor);
```

### ReplaceAssignmentWithOperatorAssignment
`value = value + expression.substring(pathSeparator)` could be simplified to 'value += expression.substring(pathSeparator)'
in `maven-core/src/main/java/org/apache/maven/plugin/PluginParameterExpressionEvaluatorV4.java`
#### Snippet
```java
                    String pathExpression = expression.substring(1, pathSeparator);
                    value = ReflectionValueExtractor.evaluate(pathExpression, session.getSettings());
                    value = value + expression.substring(pathSeparator);
                } else {
                    value = ReflectionValueExtractor.evaluate(expression.substring(1), session.getSettings());
```

### ReplaceAssignmentWithOperatorAssignment
`value = value + expression.substring(pathSeparator)` could be simplified to 'value += expression.substring(pathSeparator)'
in `maven-core/src/main/java/org/apache/maven/plugin/PluginParameterExpressionEvaluator.java`
#### Snippet
```java
                    String pathExpression = expression.substring(1, pathSeparator);
                    value = ReflectionValueExtractor.evaluate(pathExpression, session);
                    value = value + expression.substring(pathSeparator);
                } else {
                    value = ReflectionValueExtractor.evaluate(expression.substring(1), session);
```

### ReplaceAssignmentWithOperatorAssignment
`value = value + expression.substring(pathSeparator)` could be simplified to 'value += expression.substring(pathSeparator)'
in `maven-core/src/main/java/org/apache/maven/plugin/PluginParameterExpressionEvaluator.java`
#### Snippet
```java
                    String pathExpression = expression.substring(0, pathSeparator);
                    value = ReflectionValueExtractor.evaluate(pathExpression, project);
                    value = value + expression.substring(pathSeparator);
                } else {
                    value = ReflectionValueExtractor.evaluate(expression.substring(1), project);
```

### ReplaceAssignmentWithOperatorAssignment
`value = value + expression.substring(pathSeparator)` could be simplified to 'value += expression.substring(pathSeparator)'
in `maven-core/src/main/java/org/apache/maven/plugin/PluginParameterExpressionEvaluator.java`
#### Snippet
```java
                    String pathExpression = expression.substring(1, pathSeparator);
                    value = ReflectionValueExtractor.evaluate(pathExpression, mojoExecution);
                    value = value + expression.substring(pathSeparator);
                } else {
                    value = ReflectionValueExtractor.evaluate(expression.substring(1), mojoExecution);
```

### ReplaceAssignmentWithOperatorAssignment
`value = value + expression.substring(pathSeparator)` could be simplified to 'value += expression.substring(pathSeparator)'
in `maven-core/src/main/java/org/apache/maven/plugin/PluginParameterExpressionEvaluator.java`
#### Snippet
```java
                    String pathExpression = expression.substring(1, pathSeparator);
                    value = ReflectionValueExtractor.evaluate(pathExpression, pluginDescriptor);
                    value = value + expression.substring(pathSeparator);
                } else {
                    value = ReflectionValueExtractor.evaluate(expression.substring(1), pluginDescriptor);
```

### ReplaceAssignmentWithOperatorAssignment
`value = value + expression.substring(pathSeparator)` could be simplified to 'value += expression.substring(pathSeparator)'
in `maven-core/src/main/java/org/apache/maven/plugin/PluginParameterExpressionEvaluator.java`
#### Snippet
```java
                    String pathExpression = expression.substring(1, pathSeparator);
                    value = ReflectionValueExtractor.evaluate(pathExpression, session.getSettings());
                    value = value + expression.substring(pathSeparator);
                } else {
                    value = ReflectionValueExtractor.evaluate(expression.substring(1), session.getSettings());
```

### ReplaceAssignmentWithOperatorAssignment
`i = i + 2` could be simplified to 'i += 2'
in `maven-core/src/main/java/org/apache/maven/lifecycle/providers/packaging/AbstractLifecycleMappingProvider.java`
#### Snippet
```java

        HashMap<String, LifecyclePhase> lifecyclePhaseBindings = new HashMap<>(len / 2);
        for (int i = 0; i < len; i = i + 2) {
            lifecyclePhaseBindings.put(pluginBindings[i], new LifecyclePhase(pluginBindings[i + 1]));
        }
```

## RuleId[ruleID=ReturnFromFinallyBlock]
### ReturnFromFinallyBlock
'return' inside 'finally' block
in `maven-core/src/main/java/org/apache/maven/DefaultMaven.java`
#### Snippet
```java
                afterSessionEnd(session.getProjects(), session);
            } catch (MavenExecutionException e) {
                return addExceptionToResult(result, e);
            }
        }
```

## RuleId[ruleID=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `errorArtifactExceptions` are queried, but never updated
in `maven-compat/src/main/java/org/apache/maven/repository/MetadataResolutionResult.java`
#### Snippet
```java
    private List<CyclicDependencyException> circularDependencyExceptions;

    private List<ArtifactResolutionException> errorArtifactExceptions;

    // file system errors
```

### MismatchedCollectionQueryUpdate
Contents of collection `repositoryLayouts` are queried, but never updated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/repository/DefaultArtifactRepositoryFactory.java`
#### Snippet
```java

    @Requirement(role = ArtifactRepositoryLayout.class)
    private Map<String, ArtifactRepositoryLayout> repositoryLayouts;

    public ArtifactRepositoryLayout getLayout(String layoutId) throws UnknownRepositoryLayoutException {
```

### MismatchedCollectionQueryUpdate
Contents of collection `visited` are queried, but never updated
in `maven-compat/src/main/java/org/apache/maven/repository/metadata/DefaultClasspathTransformation.java`
#### Snippet
```java
        ClasspathContainer cpc;

        List<MetadataGraphVertex> visited;

        // -----------------------------------------------------------------------
```

### MismatchedCollectionQueryUpdate
Contents of collection `layouts` are queried, but never updated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java

    @Requirement(role = ArtifactRepositoryLayout.class)
    private Map<String, ArtifactRepositoryLayout> layouts;

    @Requirement
```

### MismatchedCollectionQueryUpdate
Contents of collection `lifecycles` are queried, but never updated
in `maven-core/src/main/java/org/apache/maven/lifecycle/mapping/DefaultLifecycleMapping.java`
#### Snippet
```java
public class DefaultLifecycleMapping implements LifecycleMapping {

    private List<Lifecycle> lifecycles;

    private Map<String, Lifecycle> lifecycleMap;
```

### MismatchedCollectionQueryUpdate
Contents of collection `params` are queried, but never updated
in `api/modello-plugin-velocity/src/main/java/org/codehaus/modello/plugin/velocity/ModelloVelocityMojo.java`
#### Snippet
```java

    @Parameter
    private List<String> params;

    protected String getGeneratorType() {
```

## RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `interpolator` is accessed in both synchronized and unsynchronized contexts
in `maven-compat/src/main/java/org/apache/maven/project/interpolation/AbstractStringBasedModelInterpolator.java`
#### Snippet
```java
    private PathTranslator pathTranslator;

    private Interpolator interpolator;

    private RecursionInterceptor recursionInterceptor;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `recursionInterceptor` is accessed in both synchronized and unsynchronized contexts
in `maven-compat/src/main/java/org/apache/maven/project/interpolation/AbstractStringBasedModelInterpolator.java`
#### Snippet
```java
    private Interpolator interpolator;

    private RecursionInterceptor recursionInterceptor;

    // for testing.
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `pomFile` is accessed in both synchronized and unsynchronized contexts
in `maven-model-builder/src/main/java/org/apache/maven/model/building/DefaultModelBuildingRequest.java`
#### Snippet
```java
    private Model fileModel;

    private File pomFile;

    private ModelSource modelSource;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `modelSource` is accessed in both synchronized and unsynchronized contexts
in `maven-model-builder/src/main/java/org/apache/maven/model/building/DefaultModelBuildingRequest.java`
#### Snippet
```java
    private File pomFile;

    private ModelSource modelSource;

    private int validationLevel = VALIDATION_LEVEL_STRICT;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `systemProperties` is accessed in both synchronized and unsynchronized contexts
in `maven-model-builder/src/main/java/org/apache/maven/model/building/DefaultModelBuildingRequest.java`
#### Snippet
```java
    private List<String> inactiveProfileIds;

    private Properties systemProperties;

    private Properties userProperties;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `systemProperties` is accessed in both synchronized and unsynchronized contexts
in `maven-settings-builder/src/main/java/org/apache/maven/settings/building/DefaultSettingsBuildingRequest.java`
#### Snippet
```java
    private SettingsSource userSettingsSource;

    private Properties systemProperties;

    private Properties userProperties;
```

## RuleId[ruleID=UseOfPropertiesAsHashtable]
### UseOfPropertiesAsHashtable
Call to `Hashtable.putAll()` on properties object
in `maven-compat/src/main/java/org/apache/maven/project/interpolation/AbstractStringBasedModelInterpolator.java`
#### Snippet
```java
    public Model interpolate(Model model, Map<String, ?> context, boolean strict) throws ModelInterpolationException {
        Properties props = new Properties();
        props.putAll(context);

        return interpolate(model, null, new DefaultProjectBuilderConfiguration().setExecutionProperties(props), true);
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/DefaultWagonManager.java`
#### Snippet
```java
                Properties headers = new Properties();

                headers.put(
                        "User-Agent",
                        ConfigUtils.getString(
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.putAll()` on properties object
in `maven-model-builder/src/main/java/org/apache/maven/model/building/DefaultModelBuilder.java`
#### Snippet
```java
            Properties profileProps = new Properties();
            for (Profile profile : activeExternalProfiles) {
                profileProps.putAll(profile.getProperties());
            }
            profileProps.putAll(profileActivationContext.getUserProperties());
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.putAll()` on properties object
in `maven-model-builder/src/main/java/org/apache/maven/model/building/DefaultModelBuilder.java`
#### Snippet
```java
            Properties profileProps = new Properties();
            for (Profile profile : activeExternalProfiles) {
                profileProps.putAll(profile.getProperties());
            }
            profileProps.putAll(profileActivationContext.getUserProperties());
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `maven-model-builder/src/main/java/org/apache/maven/model/building/DefaultModelBuilder.java`
#### Snippet
```java
        Properties userProperties = request.getUserProperties();
        if (!userProperties.containsKey(ProfileActivationContext.PROPERTY_NAME_PACKAGING)) {
            userProperties.put(
                    ProfileActivationContext.PROPERTY_NAME_PACKAGING,
                    request.getFileModel().getPackaging());
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `maven-model-builder/src/main/java/org/apache/maven/model/interpolation/DefaultModelVersionProcessor.java`
#### Snippet
```java
    public void overwriteModelProperties(Properties modelProperties, ModelBuildingRequest request) {
        if (request.getSystemProperties().containsKey(REVISION_PROPERTY)) {
            modelProperties.put(REVISION_PROPERTY, request.getSystemProperties().get(REVISION_PROPERTY));
        }
        if (request.getSystemProperties().containsKey(CHANGELIST_PROPERTY)) {
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.get()` on properties object
in `maven-model-builder/src/main/java/org/apache/maven/model/interpolation/DefaultModelVersionProcessor.java`
#### Snippet
```java
    public void overwriteModelProperties(Properties modelProperties, ModelBuildingRequest request) {
        if (request.getSystemProperties().containsKey(REVISION_PROPERTY)) {
            modelProperties.put(REVISION_PROPERTY, request.getSystemProperties().get(REVISION_PROPERTY));
        }
        if (request.getSystemProperties().containsKey(CHANGELIST_PROPERTY)) {
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `maven-model-builder/src/main/java/org/apache/maven/model/interpolation/DefaultModelVersionProcessor.java`
#### Snippet
```java
        }
        if (request.getSystemProperties().containsKey(CHANGELIST_PROPERTY)) {
            modelProperties.put(
                    CHANGELIST_PROPERTY, request.getSystemProperties().get(CHANGELIST_PROPERTY));
        }
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.get()` on properties object
in `maven-model-builder/src/main/java/org/apache/maven/model/interpolation/DefaultModelVersionProcessor.java`
#### Snippet
```java
        if (request.getSystemProperties().containsKey(CHANGELIST_PROPERTY)) {
            modelProperties.put(
                    CHANGELIST_PROPERTY, request.getSystemProperties().get(CHANGELIST_PROPERTY));
        }
        if (request.getSystemProperties().containsKey(SHA1_PROPERTY)) {
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `maven-model-builder/src/main/java/org/apache/maven/model/interpolation/DefaultModelVersionProcessor.java`
#### Snippet
```java
        }
        if (request.getSystemProperties().containsKey(SHA1_PROPERTY)) {
            modelProperties.put(SHA1_PROPERTY, request.getSystemProperties().get(SHA1_PROPERTY));
        }
    }
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.get()` on properties object
in `maven-model-builder/src/main/java/org/apache/maven/model/interpolation/DefaultModelVersionProcessor.java`
#### Snippet
```java
        }
        if (request.getSystemProperties().containsKey(SHA1_PROPERTY)) {
            modelProperties.put(SHA1_PROPERTY, request.getSystemProperties().get(SHA1_PROPERTY));
        }
    }
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `maven-embedder/src/main/java/org/eclipse/sisu/plexus/PlexusXmlBeanConverter.java`
#### Snippet
```java
                final String name = parser.nextText();
                parser.nextTag();
                properties.put(name, parser.nextText());
            } else {
                final String value = parser.nextText();
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `maven-embedder/src/main/java/org/eclipse/sisu/plexus/PlexusXmlBeanConverter.java`
#### Snippet
```java
                final String value = parser.nextText();
                parser.nextTag();
                properties.put(parser.nextText(), value);
            }
            parser.nextTag();
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.putIfAbsent()` on properties object
in `maven-settings/src/main/java/org/apache/maven/settings/WrapperProperties.java`
#### Snippet
```java
    @Override
    public synchronized Object putIfAbsent(Object key, Object value) {
        return writeOperation(p -> p.putIfAbsent(key, value));
    }

```

### UseOfPropertiesAsHashtable
Call to `Hashtable.putAll()` on properties object
in `maven-settings/src/main/java/org/apache/maven/settings/WrapperProperties.java`
#### Snippet
```java
    @Override
    public synchronized void putAll(Map<?, ?> t) {
        writeOperationVoid(p -> p.putAll(t));
    }

```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `maven-settings/src/main/java/org/apache/maven/settings/WrapperProperties.java`
#### Snippet
```java
    @Override
    public synchronized Object put(Object key, Object value) {
        return writeOperation(p -> p.put(key, value));
    }

```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `maven-artifact/src/main/java/org/apache/maven/artifact/versioning/ComparableVersion.java`
#### Snippet
```java

        static {
            ALIASES.put("ga", "");
            ALIASES.put("final", "");
            ALIASES.put("release", "");
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `maven-artifact/src/main/java/org/apache/maven/artifact/versioning/ComparableVersion.java`
#### Snippet
```java
        static {
            ALIASES.put("ga", "");
            ALIASES.put("final", "");
            ALIASES.put("release", "");
            ALIASES.put("cr", "rc");
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `maven-artifact/src/main/java/org/apache/maven/artifact/versioning/ComparableVersion.java`
#### Snippet
```java
            ALIASES.put("ga", "");
            ALIASES.put("final", "");
            ALIASES.put("release", "");
            ALIASES.put("cr", "rc");
        }
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `maven-artifact/src/main/java/org/apache/maven/artifact/versioning/ComparableVersion.java`
#### Snippet
```java
            ALIASES.put("final", "");
            ALIASES.put("release", "");
            ALIASES.put("cr", "rc");
        }

```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/lifecycle/ImmutableCollections.java`
#### Snippet
```java
                // Do not use super.putAll, as it may delegate to put which throws an UnsupportedOperationException
                for (Map.Entry<Object, Object> e : props.entrySet()) {
                    super.put(e.getKey(), e.getValue());
                }
            }
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `api/maven-api-settings/src/main/java/org/apache/maven/api/settings/ImmutableCollections.java`
#### Snippet
```java
                // Do not use super.putAll, as it may delegate to put which throws an UnsupportedOperationException
                for (Map.Entry<Object, Object> e : props.entrySet()) {
                    super.put(e.getKey(), e.getValue());
                }
            }
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `api/maven-api-model/src/main/java/org/apache/maven/api/model/ImmutableCollections.java`
#### Snippet
```java
                // Do not use super.putAll, as it may delegate to put which throws an UnsupportedOperationException
                for (Map.Entry<Object, Object> e : props.entrySet()) {
                    super.put(e.getKey(), e.getValue());
                }
            }
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.get()` on properties object
in `api/modello-plugin-velocity/src/main/java/org/codehaus/modello/plugin/velocity/VelocityGenerator.java`
#### Snippet
```java
    public void generate(Model model, Properties parameters) throws ModelloException {
        try {
            Map<String, String> params = (Map) Objects.requireNonNull(parameters.get(VELOCITY_PARAMETERS));
            String templates = getParameter(parameters, VELOCITY_TEMPLATES);
            String output = getParameter(parameters, ModelloParameterConstants.OUTPUT_DIRECTORY);
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `api/modello-plugin-velocity/src/main/java/org/codehaus/modello/plugin/velocity/VelocityGenerator.java`
#### Snippet
```java

            Properties props = new Properties();
            props.put("resource.loader.file.path", getParameter(parameters, "basedir"));
            RuntimeInstance velocity = new RuntimeInstance();
            velocity.init(props);
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `api/modello-plugin-velocity/src/main/java/org/codehaus/modello/plugin/velocity/ModelloVelocityMojo.java`
#### Snippet
```java
                                s -> s.substring(0, s.indexOf('=')), s -> s.substring(s.indexOf('=') + 1)))
                : Collections.emptyMap();
        parameters.put("basedir", Objects.requireNonNull(getBasedir(), "basedir is null"));
        parameters.put(VelocityGenerator.VELOCITY_TEMPLATES, String.join(",", templates));
        parameters.put(VelocityGenerator.VELOCITY_PARAMETERS, params);
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `api/modello-plugin-velocity/src/main/java/org/codehaus/modello/plugin/velocity/ModelloVelocityMojo.java`
#### Snippet
```java
                : Collections.emptyMap();
        parameters.put("basedir", Objects.requireNonNull(getBasedir(), "basedir is null"));
        parameters.put(VelocityGenerator.VELOCITY_TEMPLATES, String.join(",", templates));
        parameters.put(VelocityGenerator.VELOCITY_PARAMETERS, params);
    }
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `api/modello-plugin-velocity/src/main/java/org/codehaus/modello/plugin/velocity/ModelloVelocityMojo.java`
#### Snippet
```java
        parameters.put("basedir", Objects.requireNonNull(getBasedir(), "basedir is null"));
        parameters.put(VelocityGenerator.VELOCITY_TEMPLATES, String.join(",", templates));
        parameters.put(VelocityGenerator.VELOCITY_PARAMETERS, params);
    }

```

### UseOfPropertiesAsHashtable
Call to `Hashtable.putIfAbsent()` on properties object
in `maven-model/src/main/java/org/apache/maven/model/WrapperProperties.java`
#### Snippet
```java
    @Override
    public synchronized Object putIfAbsent(Object key, Object value) {
        return writeOperation(p -> p.putIfAbsent(key, value));
    }

```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `maven-model/src/main/java/org/apache/maven/model/WrapperProperties.java`
#### Snippet
```java
    @Override
    public synchronized Object put(Object key, Object value) {
        return writeOperation(p -> p.put(key, value));
    }

```

### UseOfPropertiesAsHashtable
Call to `Hashtable.putAll()` on properties object
in `maven-model/src/main/java/org/apache/maven/model/WrapperProperties.java`
#### Snippet
```java
    @Override
    public synchronized void putAll(Map<?, ?> t) {
        writeOperationVoid(p -> p.putAll(t));
    }

```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `api/maven-api-toolchain/src/main/java/org/apache/maven/api/toolchain/ImmutableCollections.java`
#### Snippet
```java
                // Do not use super.putAll, as it may delegate to put which throws an UnsupportedOperationException
                for (Map.Entry<Object, Object> e : props.entrySet()) {
                    super.put(e.getKey(), e.getValue());
                }
            }
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `maven-toolchain-model/src/main/java/org/apache/maven/toolchain/model/WrapperProperties.java`
#### Snippet
```java
    @Override
    public synchronized Object put(Object key, Object value) {
        return writeOperation(p -> p.put(key, value));
    }

```

### UseOfPropertiesAsHashtable
Call to `Hashtable.putAll()` on properties object
in `maven-toolchain-model/src/main/java/org/apache/maven/toolchain/model/WrapperProperties.java`
#### Snippet
```java
    @Override
    public synchronized void putAll(Map<?, ?> t) {
        writeOperationVoid(p -> p.putAll(t));
    }

```

### UseOfPropertiesAsHashtable
Call to `Hashtable.putIfAbsent()` on properties object
in `maven-toolchain-model/src/main/java/org/apache/maven/toolchain/model/WrapperProperties.java`
#### Snippet
```java
    @Override
    public synchronized Object putIfAbsent(Object key, Object value) {
        return writeOperation(p -> p.putIfAbsent(key, value));
    }

```

## RuleId[ruleID=EmptyMethod]
### EmptyMethod
The method is empty
in `maven-core/src/main/java/org/apache/maven/AbstractMavenLifecycleParticipant.java`
#### Snippet
```java
     * @since 3.2.1, MNG-5389
     */
    public void afterSessionEnd(MavenSession session) throws MavenExecutionException {
        // do nothing
    }
```

### EmptyMethod
All implementations of this method are empty
in `maven-core/src/main/java/org/apache/maven/artifact/resolver/ResolutionListener.java`
#### Snippet
```java
    int MANAGE_ARTIFACT_SYSTEM_PATH = 14;

    void testArtifact(Artifact node);

    void startProcessChildren(Artifact artifact);
```

### EmptyMethod
All implementations of this method are empty
in `maven-core/src/main/java/org/apache/maven/eventspy/EventSpy.java`
#### Snippet
```java
     * @param context The event spy context, never {@code null}.
     */
    void init(Context context) throws Exception;

    /**
```

### EmptyMethod
All implementations of this method are empty
in `maven-core/src/main/java/org/apache/maven/eventspy/EventSpy.java`
#### Snippet
```java
     * Notifies the spy of Maven's termination, allowing it to free any resources allocated by it.
     */
    void close() throws Exception;
}

```

### EmptyMethod
All implementations of this method are empty
in `maven-core/src/main/java/org/apache/maven/plugin/ExtensionRealmCache.java`
#### Snippet
```java
     * @param record The cache record being used for the project, must not be {@code null}.
     */
    void register(MavenProject project, Key key, CacheRecord record);
}

```

### EmptyMethod
All implementations of this method are empty
in `maven-core/src/main/java/org/apache/maven/plugin/PluginArtifactsCache.java`
#### Snippet
```java
     * @param record The cache record being used for the project, must not be {@code null}.
     */
    void register(MavenProject project, Key cacheKey, CacheRecord record);
}

```

### EmptyMethod
All implementations of this method are empty
in `maven-core/src/main/java/org/apache/maven/plugin/PluginRealmCache.java`
#### Snippet
```java
     * @param record The cache record being used for the project, must not be {@code null}.
     */
    void register(MavenProject project, Key key, CacheRecord record);
}

```

### EmptyMethod
The method is empty
in `maven-core/src/main/java/org/apache/maven/project/MavenProject.java`
#### Snippet
```java
     */
    @Deprecated
    public void attachArtifact(String type, String classifier, File file) {}

    /**
```

### EmptyMethod
All implementations of this method are empty
in `maven-core/src/main/java/org/apache/maven/project/ProjectRealmCache.java`
#### Snippet
```java
     * @param record The cache record being used for the project, must not be {@code null}.
     */
    void register(MavenProject project, Key key, CacheRecord record);
}

```

### EmptyMethod
All implementations of this method are empty
in `maven-core/src/main/java/org/apache/maven/project/artifact/ProjectArtifactsCache.java`
#### Snippet
```java
     * @param record The cache record being used for the project, must not be {@code null}.
     */
    void register(MavenProject project, Key cacheKey, CacheRecord record);
}

```

### EmptyMethod
Method only calls its super
in `maven-core/src/main/java/org/apache/maven/toolchain/java/DefaultJavaToolChain.java`
#### Snippet
```java

    @Override
    public String getJavaHome() {
        return super.getJavaHome();
    }
```

### EmptyMethod
The method is empty
in `maven-model-builder/src/main/java/org/apache/maven/model/building/FileToRawModelMerger.java`
#### Snippet
```java

    @Override
    protected void mergeBuild_Extensions(
            Build.Builder builder, Build target, Build source, boolean sourceDominant, Map<Object, Object> context) {
        // don't merge
```

### EmptyMethod
The method is empty
in `maven-model-builder/src/main/java/org/apache/maven/model/building/FileToRawModelMerger.java`
#### Snippet
```java

    @Override
    protected void mergeBuildBase_Resources(
            BuildBase.Builder builder,
            BuildBase target,
```

### EmptyMethod
The method is empty
in `maven-model-builder/src/main/java/org/apache/maven/model/building/FileToRawModelMerger.java`
#### Snippet
```java

    @Override
    protected void mergeBuildBase_TestResources(
            BuildBase.Builder builder,
            BuildBase target,
```

### EmptyMethod
The method is empty
in `maven-model-builder/src/main/java/org/apache/maven/model/building/FileToRawModelMerger.java`
#### Snippet
```java

    @Override
    protected void mergeCiManagement_Notifiers(
            CiManagement.Builder builder,
            CiManagement target,
```

### EmptyMethod
The method is empty
in `maven-model-builder/src/main/java/org/apache/maven/model/building/FileToRawModelMerger.java`
#### Snippet
```java

    @Override
    protected void mergeDependency_Exclusions(
            Dependency.Builder builder,
            Dependency target,
```

### EmptyMethod
The method is empty
in `maven-model-builder/src/main/java/org/apache/maven/model/building/FileToRawModelMerger.java`
#### Snippet
```java

    @Override
    protected void mergeModel_Contributors(
            Model.Builder builder, Model target, Model source, boolean sourceDominant, Map<Object, Object> context) {
        // don't merge
```

### EmptyMethod
The method is empty
in `maven-model-builder/src/main/java/org/apache/maven/model/building/FileToRawModelMerger.java`
#### Snippet
```java

    @Override
    protected void mergeModel_Developers(
            Model.Builder builder, Model target, Model source, boolean sourceDominant, Map<Object, Object> context) {
        // don't merge
```

### EmptyMethod
The method is empty
in `maven-model-builder/src/main/java/org/apache/maven/model/building/FileToRawModelMerger.java`
#### Snippet
```java

    @Override
    protected void mergeModel_Licenses(
            Model.Builder builder, Model target, Model source, boolean sourceDominant, Map<Object, Object> context) {
        // don't merge
```

### EmptyMethod
The method is empty
in `maven-model-builder/src/main/java/org/apache/maven/model/building/FileToRawModelMerger.java`
#### Snippet
```java

    @Override
    protected void mergeModel_MailingLists(
            Model.Builder builder, Model target, Model source, boolean sourceDominant, Map<Object, Object> context) {
        // don't merge
```

### EmptyMethod
The method is empty
in `maven-model-builder/src/main/java/org/apache/maven/model/building/FileToRawModelMerger.java`
#### Snippet
```java

    @Override
    protected void mergeModelBase_Repositories(
            ModelBase.Builder builder,
            ModelBase target,
```

### EmptyMethod
The method is empty
in `maven-model-builder/src/main/java/org/apache/maven/model/building/FileToRawModelMerger.java`
#### Snippet
```java

    @Override
    protected void mergePlugin_Executions(
            Plugin.Builder builder, Plugin target, Plugin source, boolean sourceDominant, Map<Object, Object> context) {
        // don't merge
```

### EmptyMethod
The method is empty
in `maven-model-builder/src/main/java/org/apache/maven/model/building/FileToRawModelMerger.java`
#### Snippet
```java

    @Override
    protected void mergeReporting_Plugins(
            Reporting.Builder builder,
            Reporting target,
```

### EmptyMethod
The method is empty
in `maven-model-builder/src/main/java/org/apache/maven/model/building/FileToRawModelMerger.java`
#### Snippet
```java

    @Override
    protected void mergeReportPlugin_ReportSets(
            ReportPlugin.Builder builder,
            ReportPlugin target,
```

### EmptyMethod
The method is empty
in `maven-model-builder/src/main/java/org/apache/maven/model/building/FileToRawModelMerger.java`
#### Snippet
```java

    @Override
    protected void mergePluginContainer_Plugins(
            PluginContainer.Builder builder,
            PluginContainer target,
```

### EmptyMethod
The method is empty
in `maven-model-builder/src/main/java/org/apache/maven/model/management/DefaultDependencyManagementInjector.java`
#### Snippet
```java

        @Override
        protected void mergeDependency_Optional(
                Dependency.Builder builder,
                Dependency target,
```

### EmptyMethod
The method is empty
in `maven-model-builder/src/main/java/org/apache/maven/model/merge/MavenModelMerger.java`
#### Snippet
```java

    @Override
    protected void mergeModel_ModelVersion(
            Model.Builder builder, Model target, Model source, boolean sourceDominant, Map<Object, Object> context) {
        // neither inherited nor injected
```

### EmptyMethod
The method is empty
in `maven-model-builder/src/main/java/org/apache/maven/model/merge/MavenModelMerger.java`
#### Snippet
```java

    @Override
    protected void mergeModel_ArtifactId(
            Model.Builder builder, Model target, Model source, boolean sourceDominant, Map<Object, Object> context) {
        // neither inherited nor injected
```

### EmptyMethod
The method is empty
in `maven-model-builder/src/main/java/org/apache/maven/model/merge/MavenModelMerger.java`
#### Snippet
```java

    @Override
    protected void mergeModel_Profiles(
            Model.Builder builder, Model target, Model source, boolean sourceDominant, Map<Object, Object> context) {
        // neither inherited nor injected
```

### EmptyMethod
The method is empty
in `maven-model-builder/src/main/java/org/apache/maven/model/merge/MavenModelMerger.java`
#### Snippet
```java

    @Override
    protected void mergeModel_Prerequisites(
            Model.Builder builder, Model target, Model source, boolean sourceDominant, Map<Object, Object> context) {
        // neither inherited nor injected
```

### EmptyMethod
The method is empty
in `maven-model-builder/src/main/java/org/apache/maven/model/merge/MavenModelMerger.java`
#### Snippet
```java

    @Override
    protected void mergeDistributionManagement_Relocation(
            DistributionManagement.Builder builder,
            DistributionManagement target,
```

### EmptyMethod
The method is empty
in `maven-model-builder/src/main/java/org/apache/maven/model/merge/MavenModelMerger.java`
#### Snippet
```java

    @Override
    protected void mergeSite_ChildSiteUrlInheritAppendPath(
            Site.Builder builder, Site target, Site source, boolean sourceDominant, Map<Object, Object> context) {}

```

### EmptyMethod
The method is empty
in `maven-xml-impl/src/main/java/org/codehaus/plexus/util/xml/Xpp3Dom.java`
#### Snippet
```java
    }

    public void setParent(Xpp3Dom parent) {}

    // ----------------------------------------------------------------------
```

## RuleId[ruleID=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `false` is redundant
in `maven-compat/src/main/java/org/apache/maven/repository/MetadataResolutionRequest.java`
#### Snippet
```java

    /** result type - graph */
    private boolean asGraph = false;

    public MetadataResolutionRequest() {}
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `maven-compat/src/main/java/org/apache/maven/repository/MetadataResolutionRequest.java`
#### Snippet
```java

    /** result type - dirty tree */
    private boolean asDirtyTree = false;

    /** result type - resolved tree */
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `maven-compat/src/main/java/org/apache/maven/repository/MetadataResolutionRequest.java`
#### Snippet
```java

    /** result type - resolved tree */
    private boolean asResolvedTree = false;

    /** result type - graph */
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `maven-compat/src/main/java/org/apache/maven/repository/metadata/MetadataGraphVertex.java`
#### Snippet
```java
    // indications to use these in comparison
    private boolean compareVersion = false;
    private boolean compareScope = false;

    public MetadataGraphVertex(ArtifactMetadata md) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `maven-compat/src/main/java/org/apache/maven/repository/metadata/MetadataGraphVertex.java`
#### Snippet
```java

    // indications to use these in comparison
    private boolean compareVersion = false;
    private boolean compareScope = false;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `maven-compat/src/main/java/org/apache/maven/repository/metadata/ArtifactMetadata.java`
#### Snippet
```java

    /** does the actual artifact for this metadata exists */
    protected boolean artifactExists = false;
    /** artifact URI */
    protected String artifactUri;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `maven-compat/src/main/java/org/apache/maven/repository/metadata/ArtifactMetadata.java`
#### Snippet
```java

    /** is metadata found anywhere */
    protected boolean resolved = false;

    /** does the actual artifact for this metadata exists */
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `maven-compat/src/main/java/org/apache/maven/repository/metadata/MetadataGraph.java`
#### Snippet
```java
    // flags to indicate the granularity of vertices
    private boolean versionedVertices = false;
    private boolean scopedVertices = false;
    /**
     * the entry point we started building the graph from
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `maven-compat/src/main/java/org/apache/maven/repository/metadata/MetadataGraph.java`
#### Snippet
```java

    // flags to indicate the granularity of vertices
    private boolean versionedVertices = false;
    private boolean scopedVertices = false;
    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `maven-slf4j-provider/src/main/java/org/slf4j/impl/MavenLoggerFactory.java`
#### Snippet
```java
 */
public class MavenLoggerFactory extends SimpleLoggerFactory implements MavenSlf4jWrapperFactory {
    private LogLevelRecorder logLevelRecorder = null;

    @Override
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `maven-settings/src/main/java/org/apache/maven/settings/io/xpp3/SettingsXpp3Writer.java`
#### Snippet
```java
     * Field fileComment.
     */
    private String fileComment = null;

    // -----------/
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `maven-model-transform/src/main/java/org/apache/maven/model/transform/FastForwardFilter.java`
#### Snippet
```java
    private final Deque<String> state = new ArrayDeque<>();

    private int domDepth = 0;

    FastForwardFilter(XmlPullParser xmlPullParser) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/descriptor/MojoDescriptor.java`
#### Snippet
```java

    /** Specify the required dependencies in a specified scope */
    private String dependencyResolutionRequired = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/descriptor/MojoDescriptor.java`
#### Snippet
```java

    /**  By default, the Mojo cannot be invoked directly */
    private boolean directInvocationOnly = false;

    /**  By default, the Mojo don't need reports to run */
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/descriptor/MojoDescriptor.java`
#### Snippet
```java
     * modules. By default, no need to aggregate the Maven project and its child modules
     */
    private boolean aggregator = false;

    // ----------------------------------------------------------------------
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/descriptor/MojoDescriptor.java`
#### Snippet
```java

    /**  By default, the Mojo don't need reports to run */
    private boolean requiresReports = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/descriptor/MojoDescriptor.java`
#### Snippet
```java
    private boolean threadSafe = false;

    private boolean v4Api = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/descriptor/MojoDescriptor.java`
#### Snippet
```java
     * @since 3.0-beta-2
     */
    private boolean threadSafe = false;

    private boolean v4Api = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/descriptor/MojoDescriptor.java`
#### Snippet
```java

    /**  By default, the Mojo is assumed to work offline as well */
    private boolean onlineRequired = false;

    /**  Plugin configuration */
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/lifecycle/ImmutableCollections.java`
#### Snippet
```java
                public Iterator<Entry<K, V>> iterator() {
                    return new Iterator<Entry<K, V>>() {
                        int index = 0;

                        @Override
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/lifecycle/ImmutableCollections.java`
#### Snippet
```java
                public Iterator<Entry<K, V>> iterator() {
                    return new Iterator<Entry<K, V>>() {
                        int index = 0;

                        @Override
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `api/maven-api-settings/src/main/java/org/apache/maven/api/settings/ImmutableCollections.java`
#### Snippet
```java
                public Iterator<Entry<K, V>> iterator() {
                    return new Iterator<Entry<K, V>>() {
                        int index = 0;

                        @Override
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `api/maven-api-settings/src/main/java/org/apache/maven/api/settings/ImmutableCollections.java`
#### Snippet
```java
                public Iterator<Entry<K, V>> iterator() {
                    return new Iterator<Entry<K, V>>() {
                        int index = 0;

                        @Override
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `api/maven-api-model/src/main/java/org/apache/maven/api/model/ImmutableCollections.java`
#### Snippet
```java
                public Iterator<Entry<K, V>> iterator() {
                    return new Iterator<Entry<K, V>>() {
                        int index = 0;

                        @Override
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `api/maven-api-model/src/main/java/org/apache/maven/api/model/ImmutableCollections.java`
#### Snippet
```java
                public Iterator<Entry<K, V>> iterator() {
                    return new Iterator<Entry<K, V>>() {
                        int index = 0;

                        @Override
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `maven-core/src/main/java/org/apache/maven/artifact/resolver/ArtifactResolutionRequest.java`
#### Snippet
```java
    private boolean resolveRoot = true;

    private boolean resolveTransitively = false;

    private boolean offline;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `maven-core/src/main/java/org/apache/maven/execution/DefaultMavenExecutionResult.java`
#### Snippet
```java
    private final Map<MavenProject, BuildSummary> buildSummaries = Collections.synchronizedMap(new IdentityHashMap<>());

    private boolean canResume = false;

    public MavenExecutionResult setProject(MavenProject project) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `maven-core/src/main/java/org/apache/maven/execution/DefaultMavenExecutionRequest.java`
#### Snippet
```java
     * @issue MNG-2681
     */
    private boolean noSnapshotUpdates = false;

    private boolean useLegacyLocalRepositoryManager = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `maven-core/src/main/java/org/apache/maven/execution/DefaultMavenExecutionRequest.java`
#### Snippet
```java
    private String globalChecksumPolicy;

    private boolean updateSnapshots = false;

    private List<ArtifactRepository> remoteRepositories;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `maven-core/src/main/java/org/apache/maven/execution/DefaultMavenExecutionRequest.java`
#### Snippet
```java
    private String reactorFailureBehavior = REACTOR_FAIL_FAST;

    private boolean resume = false;

    private String resumeFrom;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `maven-core/src/main/java/org/apache/maven/execution/DefaultMavenExecutionRequest.java`
#### Snippet
```java
    private File localRepositoryPath;

    private boolean offline = false;

    private boolean interactiveMode = true;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `maven-core/src/main/java/org/apache/maven/execution/DefaultMavenExecutionRequest.java`
#### Snippet
```java
    private boolean cacheTransferError = false;

    private boolean cacheNotFound = false;

    private List<Proxy> proxies;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `maven-core/src/main/java/org/apache/maven/execution/DefaultMavenExecutionRequest.java`
#### Snippet
```java
    private List<String> goals;

    private boolean useReactor = false;

    private boolean recursive = true;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `maven-core/src/main/java/org/apache/maven/execution/DefaultMavenExecutionRequest.java`
#### Snippet
```java
    private boolean noSnapshotUpdates = false;

    private boolean useLegacyLocalRepositoryManager = false;

    private Map<String, Object> data;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `maven-core/src/main/java/org/apache/maven/execution/DefaultMavenExecutionRequest.java`
#### Snippet
```java
    private Date startTime;

    private boolean showErrors = false;

    private TransferListener transferListener;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `maven-core/src/main/java/org/apache/maven/execution/DefaultMavenExecutionRequest.java`
#### Snippet
```java
    private boolean interactiveMode = true;

    private boolean cacheTransferError = false;

    private boolean cacheNotFound = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `maven-core/src/main/java/org/apache/maven/lifecycle/internal/ReactorBuildStatus.java`
#### Snippet
```java
    private final Collection<String> blackListedProjects = Collections.synchronizedSet(new HashSet<>());

    private volatile boolean halted = false;

    public ReactorBuildStatus(ProjectDependencyGraph projectDependencyGraph) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `maven-model/src/main/java/org/apache/maven/model/io/xpp3/MavenXpp3Writer.java`
#### Snippet
```java
     * Field fileComment.
     */
    private String fileComment = null;

    // -----------/
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `maven-slf4j-wrapper/src/main/java/org/apache/maven/logwrapper/LogLevelRecorder.java`
#### Snippet
```java

    private final Level logThreshold;
    private boolean metThreshold = false;

    public LogLevelRecorder(String threshold) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `maven-model/src/main/java/org/apache/maven/model/io/xpp3/MavenXpp3WriterEx.java`
#### Snippet
```java
     * Field fileComment.
     */
    private String fileComment = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `api/maven-api-toolchain/src/main/java/org/apache/maven/api/toolchain/ImmutableCollections.java`
#### Snippet
```java
                public Iterator<Entry<K, V>> iterator() {
                    return new Iterator<Entry<K, V>>() {
                        int index = 0;

                        @Override
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `api/maven-api-toolchain/src/main/java/org/apache/maven/api/toolchain/ImmutableCollections.java`
#### Snippet
```java
                public Iterator<Entry<K, V>> iterator() {
                    return new Iterator<Entry<K, V>>() {
                        int index = 0;

                        @Override
```

## RuleId[ruleID=EqualsAndHashcode]
### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `maven-compat/src/main/java/org/apache/maven/repository/metadata/MetadataGraphEdge.java`
#### Snippet
```java
 *
 */
public class MetadataGraphEdge {
    String version;
    ArtifactScopeEnum scope;
```

## RuleId[ruleID=RedundantImplements]
### RedundantImplements
Redundant interface declaration `Toolchain`
in `maven-core/src/main/java/org/apache/maven/toolchain/DefaultToolchain.java`
#### Snippet
```java
 */
public abstract class DefaultToolchain // should have been AbstractToolchain...
implements Toolchain, ToolchainPrivate {
    private final Logger logger;

```

## RuleId[ruleID=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2022-11-28-19-42-05.997.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[ruleID=InstanceofCatchParameter]
### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `maven-embedder/src/main/java/org/eclipse/sisu/plexus/PlexusXmlBeanConverter.java`
#### Snippet
```java
            return clazz.getConstructor(String.class).newInstance(value);
        } catch (final Exception e) {
            final Throwable cause = e instanceof InvocationTargetException ? e.getCause() : e;
            throw new IllegalArgumentException(String.format(CONVERSION_ERROR, value, clazz), cause);
        } catch (final LinkageError e) {
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `t`
in `maven-core/src/main/java/org/apache/maven/lifecycle/internal/LifecycleModuleBuilder.java`
#### Snippet
```java

            // rethrow original errors and runtime exceptions
            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            }
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `t`
in `maven-core/src/main/java/org/apache/maven/lifecycle/internal/LifecycleModuleBuilder.java`
#### Snippet
```java
                throw (RuntimeException) t;
            }
            if (t instanceof Error) {
                throw (Error) t;
            }
```

## RuleId[ruleID=DuplicateThrows]
### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `maven-settings/src/main/java/org/apache/maven/settings/WrapperProperties.java`
#### Snippet
```java

    @Override
    public synchronized void loadFromXML(InputStream in) throws IOException, InvalidPropertiesFormatException {
        throw new UnsupportedOperationException();
    }
```

### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `maven-model/src/main/java/org/apache/maven/model/WrapperProperties.java`
#### Snippet
```java

    @Override
    public synchronized void loadFromXML(InputStream in) throws IOException, InvalidPropertiesFormatException {
        throw new UnsupportedOperationException();
    }
```

### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `maven-toolchain-model/src/main/java/org/apache/maven/toolchain/model/WrapperProperties.java`
#### Snippet
```java

    @Override
    public synchronized void loadFromXML(InputStream in) throws IOException, InvalidPropertiesFormatException {
        throw new UnsupportedOperationException();
    }
```

## RuleId[ruleID=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `maven-compat/src/main/java/org/apache/maven/repository/metadata/DefaultClasspathTransformation.java`
#### Snippet
```java

            if (exits != null && exits.size() > 0) {
                MetadataGraphEdge[] sortedExits = exits.toArray(new MetadataGraphEdge[0]);
                Arrays.sort(sortedExits, (e1, e2) -> {
                    if (e1.getDepth() == e2.getDepth()) {
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `maven-embedder/src/main/java/org/apache/maven/cli/CleanArgument.java`
#### Snippet
```java
            cleanArgs = args;
        } else {
            cleanArgs = cleaned.toArray(new String[0]);
        }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `maven-embedder/src/main/java/org/apache/maven/cli/MavenCli.java`
#### Snippet
```java
                }

                mavenConfig = cliManager.parse(args.toArray(new String[0]));
                List<?> unrecognized = mavenConfig.getArgList();
                if (!unrecognized.isEmpty()) {
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/lifecycle/ImmutableCollections.java`
#### Snippet
```java

        private MapN(Map<K, V> map) {
            entries = map != null ? map.entrySet().toArray() : new Object[0];
        }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `api/maven-api-settings/src/main/java/org/apache/maven/api/settings/ImmutableCollections.java`
#### Snippet
```java

        private MapN(Map<K, V> map) {
            entries = map != null ? map.entrySet().toArray() : new Object[0];
        }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `api/maven-api-model/src/main/java/org/apache/maven/api/model/ImmutableCollections.java`
#### Snippet
```java

        private MapN(Map<K, V> map) {
            entries = map != null ? map.entrySet().toArray() : new Object[0];
        }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `maven-core/src/main/java/org/apache/maven/internal/aether/MavenChainedWorkspaceReader.java`
#### Snippet
```java
     */
    public static WorkspaceReader of(Collection<WorkspaceReader> workspaceReaderCollection) {
        WorkspaceReader[] readers = workspaceReaderCollection.toArray(new WorkspaceReader[0]);
        if (readers.length == 1) {
            return readers[0];
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `maven-core/src/main/java/org/apache/maven/toolchain/DefaultToolchainManagerPrivate.java`
#### Snippet
```java
        }

        return toRet.toArray(new ToolchainPrivate[0]);
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `api/maven-api-toolchain/src/main/java/org/apache/maven/api/toolchain/ImmutableCollections.java`
#### Snippet
```java

        private MapN(Map<K, V> map) {
            entries = map != null ? map.entrySet().toArray() : new Object[0];
        }

```

## RuleId[ruleID=SynchronizeOnThis]
### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `maven-compat/src/main/java/org/apache/maven/project/interpolation/AbstractStringBasedModelInterpolator.java`
#### Snippet
```java

        String result = src;
        synchronized (this) {
            for (ValueSource vs : valueSources) {
                interpolator.addValueSource(vs);
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `maven-model-builder/src/main/java/org/apache/maven/model/building/DefaultTransformerContext.java`
#### Snippet
```java
        public Model computeIfAbsent(Supplier<Model> supplier) {
            if (!set) {
                synchronized (this) {
                    if (!set) {
                        this.set = true;
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `maven-model-builder/src/main/java/org/apache/maven/model/building/DefaultTransformerContext.java`
#### Snippet
```java
                        this.set = true;
                        this.model = supplier.get();
                        this.notifyAll();
                    }
                }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `maven-model-builder/src/main/java/org/apache/maven/model/building/DefaultTransformerContext.java`
#### Snippet
```java
        public Model get() {
            if (!set) {
                synchronized (this) {
                    if (!set) {
                        try {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `maven-model-builder/src/main/java/org/apache/maven/model/building/DefaultTransformerContext.java`
#### Snippet
```java
                    if (!set) {
                        try {
                            this.wait();
                        } catch (InterruptedException e) {
                            // Ignore
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `maven-embedder/src/main/java/org/apache/maven/cli/event/ExecutionEventLogger.java`
#### Snippet
```java
                // display progress [i/n]
                int number;
                synchronized (this) {
                    number = ++currentVisitedProjectCount;
                }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `maven-core/src/main/java/org/apache/maven/session/scope/internal/SessionScope.java`
#### Snippet
```java
        public T get() {
            if (value == null) {
                synchronized (this) {
                    if (value == null) {
                        value = provider.get();
```

## RuleId[ruleID=NonFinalFieldOfException]
### NonFinalFieldOfException
Non-final field `validationResult` of exception class
in `maven-compat/src/main/java/org/apache/maven/project/InvalidProjectModelException.java`
#### Snippet
```java
@Deprecated
public class InvalidProjectModelException extends ProjectBuildingException {
    private ModelValidationResult validationResult;

    public InvalidProjectModelException(String projectId, String message, File pomLocation) {
```

### NonFinalFieldOfException
Non-final field `expression` of exception class
in `maven-compat/src/main/java/org/apache/maven/project/interpolation/ModelInterpolationException.java`
#### Snippet
```java
@Deprecated
public class ModelInterpolationException extends Exception {
    private String expression;

    private String originalMessage;
```

### NonFinalFieldOfException
Non-final field `originalMessage` of exception class
in `maven-compat/src/main/java/org/apache/maven/project/interpolation/ModelInterpolationException.java`
#### Snippet
```java
    private String expression;

    private String originalMessage;

    public ModelInterpolationException(String message) {
```

### NonFinalFieldOfException
Non-final field `cause` of exception class
in `maven-compat/src/main/java/org/apache/maven/repository/VersionNotFoundException.java`
#### Snippet
```java
    private String projectId;
    private File pomFile;
    private InvalidVersionSpecificationException cause;

    public VersionNotFoundException(
```

### NonFinalFieldOfException
Non-final field `pomFile` of exception class
in `maven-compat/src/main/java/org/apache/maven/repository/VersionNotFoundException.java`
#### Snippet
```java

    private String projectId;
    private File pomFile;
    private InvalidVersionSpecificationException cause;

```

### NonFinalFieldOfException
Non-final field `dependency` of exception class
in `maven-compat/src/main/java/org/apache/maven/repository/VersionNotFoundException.java`
#### Snippet
```java
 */
public class VersionNotFoundException extends Exception {
    private Dependency dependency;

    private String projectId;
```

### NonFinalFieldOfException
Non-final field `projectId` of exception class
in `maven-compat/src/main/java/org/apache/maven/repository/VersionNotFoundException.java`
#### Snippet
```java
    private Dependency dependency;

    private String projectId;
    private File pomFile;
    private InvalidVersionSpecificationException cause;
```

### NonFinalFieldOfException
Non-final field `artifact` of exception class
in `maven-compat/src/main/java/org/apache/maven/repository/metadata/MetadataRetrievalException.java`
#### Snippet
```java
public class MetadataRetrievalException extends Exception {

    private ArtifactMetadata artifact;

    public MetadataRetrievalException(String message) {
```

### NonFinalFieldOfException
Non-final field `repository` of exception class
in `maven-model-builder/src/main/java/org/apache/maven/model/resolution/InvalidRepositoryException.java`
#### Snippet
```java
     * The repository that raised this error, can be {@code null}.
     */
    private Repository repository;

    /**
```

### NonFinalFieldOfException
Non-final field `longMessage` of exception class
in `api/maven-api-core/src/main/java/org/apache/maven/api/plugin/MojoException.java`
#### Snippet
```java
    protected Object source;

    protected String longMessage;

    /**
```

### NonFinalFieldOfException
Non-final field `source` of exception class
in `api/maven-api-core/src/main/java/org/apache/maven/api/plugin/MojoException.java`
#### Snippet
```java
public class MojoException extends MavenException {

    protected Object source;

    protected String longMessage;
```

### NonFinalFieldOfException
Non-final field `exitCode` of exception class
in `maven-embedder/src/main/java/org/apache/maven/cli/MavenCli.java`
#### Snippet
```java

    static class ExitException extends Exception {
        int exitCode;

        ExitException(int exitCode) {
```

### NonFinalFieldOfException
Non-final field `artifact` of exception class
in `maven-artifact/src/main/java/org/apache/maven/artifact/resolver/CyclicDependencyException.java`
#### Snippet
```java
 */
public class CyclicDependencyException extends ArtifactResolutionException {
    private Artifact artifact;

    public CyclicDependencyException(String message, Artifact artifact) {
```

### NonFinalFieldOfException
Non-final field `goal` of exception class
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/MojoNotFoundException.java`
#### Snippet
```java
 */
public class MojoNotFoundException extends Exception {
    private String goal;

    private PluginDescriptor pluginDescriptor;
```

### NonFinalFieldOfException
Non-final field `pluginDescriptor` of exception class
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/MojoNotFoundException.java`
#### Snippet
```java
    private String goal;

    private PluginDescriptor pluginDescriptor;

    public MojoNotFoundException(String goal, PluginDescriptor pluginDescriptor) {
```

### NonFinalFieldOfException
Non-final field `longMessage` of exception class
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/AbstractMojoExecutionException.java`
#### Snippet
```java
    protected Object source;

    protected String longMessage;

    public AbstractMojoExecutionException(String message) {
```

### NonFinalFieldOfException
Non-final field `source` of exception class
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/AbstractMojoExecutionException.java`
#### Snippet
```java
 */
public abstract class AbstractMojoExecutionException extends Exception {
    protected Object source;

    protected String longMessage;
```

### NonFinalFieldOfException
Non-final field `downloadUrl` of exception class
in `maven-artifact/src/main/java/org/apache/maven/artifact/resolver/ArtifactNotFoundException.java`
#### Snippet
```java
 */
public class ArtifactNotFoundException extends AbstractArtifactResolutionException {
    private String downloadUrl;

    protected ArtifactNotFoundException(
```

### NonFinalFieldOfException
Non-final field `artifactId` of exception class
in `maven-artifact/src/main/java/org/apache/maven/artifact/resolver/AbstractArtifactResolutionException.java`
#### Snippet
```java
    private String groupId;

    private String artifactId;

    private String version;
```

### NonFinalFieldOfException
Non-final field `classifier` of exception class
in `maven-artifact/src/main/java/org/apache/maven/artifact/resolver/AbstractArtifactResolutionException.java`
#### Snippet
```java
    private String type;

    private String classifier;

    private Artifact artifact;
```

### NonFinalFieldOfException
Non-final field `remoteRepositories` of exception class
in `maven-artifact/src/main/java/org/apache/maven/artifact/resolver/AbstractArtifactResolutionException.java`
#### Snippet
```java
    private Artifact artifact;

    private List<ArtifactRepository> remoteRepositories;

    private final String originalMessage;
```

### NonFinalFieldOfException
Non-final field `type` of exception class
in `maven-artifact/src/main/java/org/apache/maven/artifact/resolver/AbstractArtifactResolutionException.java`
#### Snippet
```java
    private String version;

    private String type;

    private String classifier;
```

### NonFinalFieldOfException
Non-final field `groupId` of exception class
in `maven-artifact/src/main/java/org/apache/maven/artifact/resolver/AbstractArtifactResolutionException.java`
#### Snippet
```java
 */
public class AbstractArtifactResolutionException extends Exception {
    private String groupId;

    private String artifactId;
```

### NonFinalFieldOfException
Non-final field `artifact` of exception class
in `maven-artifact/src/main/java/org/apache/maven/artifact/resolver/AbstractArtifactResolutionException.java`
#### Snippet
```java
    private String classifier;

    private Artifact artifact;

    private List<ArtifactRepository> remoteRepositories;
```

### NonFinalFieldOfException
Non-final field `version` of exception class
in `maven-artifact/src/main/java/org/apache/maven/artifact/resolver/AbstractArtifactResolutionException.java`
#### Snippet
```java
    private String artifactId;

    private String version;

    private String type;
```

### NonFinalFieldOfException
Non-final field `pomFile` of exception class
in `maven-core/src/main/java/org/apache/maven/MavenExecutionException.java`
#### Snippet
```java
 */
public class MavenExecutionException extends Exception {
    private File pomFile;

    public MavenExecutionException(String message, File pomFile) {
```

### NonFinalFieldOfException
Non-final field `collisions` of exception class
in `maven-core/src/main/java/org/apache/maven/DuplicateProjectException.java`
#### Snippet
```java
public class DuplicateProjectException extends MavenExecutionException {

    private Map<String, List<File>> collisions;

    /**
```

### NonFinalFieldOfException
Non-final field `moduleFile` of exception class
in `maven-core/src/main/java/org/apache/maven/MissingModuleException.java`
#### Snippet
```java
public class MissingModuleException extends MavenExecutionException {

    private File moduleFile;
    private final String moduleName;

```

### NonFinalFieldOfException
Non-final field `plugin` of exception class
in `maven-core/src/main/java/org/apache/maven/plugin/PluginNotFoundException.java`
#### Snippet
```java
 */
public class PluginNotFoundException extends AbstractArtifactResolutionException {
    private Plugin plugin;

    public PluginNotFoundException(Plugin plugin, ArtifactNotFoundException e) {
```

### NonFinalFieldOfException
Non-final field `pluginRealm` of exception class
in `maven-core/src/main/java/org/apache/maven/plugin/PluginContainerException.java`
#### Snippet
```java
public class PluginContainerException extends PluginManagerException {

    private ClassRealm pluginRealm;

    public PluginContainerException(
```

### NonFinalFieldOfException
Non-final field `project` of exception class
in `maven-core/src/main/java/org/apache/maven/plugin/PluginManagerException.java`
#### Snippet
```java
    private String goal;

    private MavenProject project;

    protected PluginManagerException(Plugin plugin, String message, MavenProject project, Throwable cause) {
```

### NonFinalFieldOfException
Non-final field `goal` of exception class
in `maven-core/src/main/java/org/apache/maven/plugin/PluginManagerException.java`
#### Snippet
```java
    private final String pluginVersion;

    private String goal;

    private MavenProject project;
```

### NonFinalFieldOfException
Non-final field `originalMessage` of exception class
in `maven-core/src/main/java/org/apache/maven/plugin/PluginConfigurationException.java`
#### Snippet
```java
    private PluginDescriptor pluginDescriptor;

    private String originalMessage;

    public PluginConfigurationException(PluginDescriptor pluginDescriptor, String originalMessage) {
```

### NonFinalFieldOfException
Non-final field `pluginDescriptor` of exception class
in `maven-core/src/main/java/org/apache/maven/plugin/PluginConfigurationException.java`
#### Snippet
```java
 */
public class PluginConfigurationException extends Exception {
    private PluginDescriptor pluginDescriptor;

    private String originalMessage;
```

### NonFinalFieldOfException
Non-final field `pluginKey` of exception class
in `maven-core/src/main/java/org/apache/maven/plugin/PluginLoaderException.java`
#### Snippet
```java
public class PluginLoaderException extends Exception {

    private String pluginKey;

    public PluginLoaderException(Plugin plugin, String message, ArtifactResolutionException cause) {
```

### NonFinalFieldOfException
Non-final field `artifact` of exception class
in `maven-core/src/main/java/org/apache/maven/project/DuplicateArtifactAttachmentException.java`
#### Snippet
```java
    private static final String DEFAULT_MESSAGE = "Duplicate artifact attachment detected.";

    private Artifact artifact;

    private final MavenProject project;
```

### NonFinalFieldOfException
Non-final field `pomFile` of exception class
in `maven-core/src/main/java/org/apache/maven/project/ProjectBuildingException.java`
#### Snippet
```java
    private final String projectId;

    private File pomFile;

    private List<ProjectBuildingResult> results;
```

### NonFinalFieldOfException
Non-final field `results` of exception class
in `maven-core/src/main/java/org/apache/maven/project/ProjectBuildingException.java`
#### Snippet
```java
    private File pomFile;

    private List<ProjectBuildingResult> results;

    public ProjectBuildingException(String projectId, String message, Throwable cause) {
```

### NonFinalFieldOfException
Non-final field `dependency` of exception class
in `maven-core/src/main/java/org/apache/maven/project/artifact/InvalidDependencyVersionException.java`
#### Snippet
```java
 */
public class InvalidDependencyVersionException extends InvalidProjectVersionException {
    private Dependency dependency;

    public InvalidDependencyVersionException(
```

### NonFinalFieldOfException
Non-final field `columnNumber` of exception class
in `maven-core/src/main/java/org/apache/maven/settings/SettingsConfigurationException.java`
#### Snippet
```java
    private int lineNumber;

    private int columnNumber;

    public SettingsConfigurationException(String message) {
```

### NonFinalFieldOfException
Non-final field `lineNumber` of exception class
in `maven-core/src/main/java/org/apache/maven/settings/SettingsConfigurationException.java`
#### Snippet
```java
 */
public class SettingsConfigurationException extends Exception {
    private int lineNumber;

    private int columnNumber;
```

### NonFinalFieldOfException
Non-final field `project` of exception class
in `maven-core/src/main/java/org/apache/maven/lifecycle/LifecycleExecutionException.java`
#### Snippet
```java
 */
public class LifecycleExecutionException extends Exception {
    private MavenProject project;

    public LifecycleExecutionException(String message) {
```

### NonFinalFieldOfException
Non-final field `artifact` of exception class
in `maven-core/src/main/java/org/apache/maven/repository/legacy/metadata/ArtifactMetadataRetrievalException.java`
#### Snippet
```java
 */
public class ArtifactMetadataRetrievalException extends Exception {
    private Artifact artifact;

    /**
```

## RuleId[ruleID=InfiniteRecursion]
### InfiniteRecursion
Method `mergeModelBase()` recurses infinitely, and can only end by throwing an exception
in `maven-model-builder/src/main/java/org/apache/maven/model/profile/DefaultProfileInjector.java`
#### Snippet
```java
    protected static class ProfileModelMerger extends MavenModelMerger {

        public void mergeModelBase(ModelBase.Builder builder, ModelBase target, ModelBase source) {
            mergeModelBase(builder, target, source, true, Collections.emptyMap());
        }
```

### InfiniteRecursion
Method `mergeBuildBase()` recurses infinitely, and can only end by throwing an exception
in `maven-model-builder/src/main/java/org/apache/maven/model/profile/DefaultProfileInjector.java`
#### Snippet
```java
        }

        public void mergeBuildBase(BuildBase.Builder builder, BuildBase target, BuildBase source) {
            mergeBuildBase(builder, target, source, true, Collections.emptyMap());
        }
```

## RuleId[ruleID=NonExceptionNameEndsWithException]
### NonExceptionNameEndsWithException
Non-exception class name `RepositoryMetadataDeploymentException` ends with 'Exception'
in `maven-core/src/main/java/org/apache/maven/artifact/repository/metadata/RepositoryMetadataDeploymentException.java`
#### Snippet
```java
 * @author <a href="mailto:brett@apache.org">Brett Porter</a>
 */
public class RepositoryMetadataDeploymentException extends Throwable {
    public RepositoryMetadataDeploymentException(String message) {
        super(message);
```

### NonExceptionNameEndsWithException
Non-exception class name `RepositoryMetadataInstallationException` ends with 'Exception'
in `maven-core/src/main/java/org/apache/maven/artifact/repository/metadata/RepositoryMetadataInstallationException.java`
#### Snippet
```java
 * @author <a href="mailto:brett@apache.org">Brett Porter</a>
 */
public class RepositoryMetadataInstallationException extends Throwable {
    public RepositoryMetadataInstallationException(String message) {
        super(message);
```

## RuleId[ruleID=UnusedAssignment]
### UnusedAssignment
Variable `type` initializer `"jar"` is redundant
in `maven-compat/src/main/java/org/apache/maven/artifact/resolver/filter/TypeArtifactFilter.java`
#### Snippet
```java
/** Artifact Filter which filters on artifact type */
public class TypeArtifactFilter implements ArtifactFilter {
    private String type = "jar";

    public TypeArtifactFilter(String type) {
```

### UnusedAssignment
The value changed at `i++` is never used
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/DefaultWagonManager.java`
#### Snippet
```java

                    md5ChecksumObserver = addChecksumObserver(wagon, CHECKSUM_ALGORITHMS[i++]);
                    sha1ChecksumObserver = addChecksumObserver(wagon, CHECKSUM_ALGORITHMS[i++]);

                    // reset the retry flag.
```

### UnusedAssignment
Variable `depth` initializer `-1` is redundant
in `maven-compat/src/main/java/org/apache/maven/repository/metadata/MetadataGraphEdge.java`
#### Snippet
```java
    String version;
    ArtifactScopeEnum scope;
    int depth = -1;
    int pomOrder = -1;
    boolean resolved = true;
```

### UnusedAssignment
Variable `resolved` initializer `true` is redundant
in `maven-compat/src/main/java/org/apache/maven/repository/metadata/MetadataGraphEdge.java`
#### Snippet
```java
    int depth = -1;
    int pomOrder = -1;
    boolean resolved = true;
    String artifactUri;

```

### UnusedAssignment
Variable `pomOrder` initializer `-1` is redundant
in `maven-compat/src/main/java/org/apache/maven/repository/metadata/MetadataGraphEdge.java`
#### Snippet
```java
    ArtifactScopeEnum scope;
    int depth = -1;
    int pomOrder = -1;
    boolean resolved = true;
    String artifactUri;
```

### UnusedAssignment
The value `false` assigned to `addedToBuffer` is never used
in `maven-embedder/src/main/java/org/apache/maven/cli/CleanArgument.java`
#### Snippet
```java

                currentArg = null;
                addedToBuffer = false;
                continue;
            }
```

### UnusedAssignment
The value changed at `pos++` is never used
in `maven-model-transform/src/main/java/org/apache/maven/model/transform/ReactorDependencyXMLFilter.java`
#### Snippet
```java
                    e.namespace = buffer.get(0).namespace;
                    e.prefix = buffer.get(0).prefix;
                    buffer.add(pos++, e);
                }
                break;
```

### UnusedAssignment
The value changed at `pos++` is never used
in `maven-model-transform/src/main/java/org/apache/maven/model/transform/ParentXMLFilter.java`
#### Snippet
```java
                    e.namespace = buffer.get(0).namespace;
                    e.prefix = buffer.get(0).prefix;
                    buffer.add(pos++, e);
                }
                break;
```

### UnusedAssignment
Variable `isRequirementMet` initializer `false` is redundant
in `maven-core/src/main/java/org/apache/maven/plugin/internal/MavenPluginMavenPrerequisiteChecker.java`
#### Snippet
```java
        String requiredMavenVersion = pluginDescriptor.getRequiredMavenVersion();
        if (StringUtils.isNotBlank(requiredMavenVersion)) {
            boolean isRequirementMet = false;
            try {
                isRequirementMet = runtimeInformation.isMavenVersion(requiredMavenVersion);
```

### UnusedAssignment
The value `new InputSource(request.getModelId(), request.getLocation())` assigned to `source` is never used
in `maven-core/src/main/java/org/apache/maven/internal/impl/DefaultToolchainsXmlFactory.java`
#### Snippet
```java
            InputSource source = null;
            if (request.getModelId() != null || request.getLocation() != null) {
                source = new InputSource(request.getModelId(), request.getLocation());
            }
            MavenToolchainsXpp3Reader xml = new MavenToolchainsXpp3Reader();
```

### UnusedAssignment
The value `new InputSource(request.getModelId(), request.getLocation())` assigned to `source` is never used
in `maven-core/src/main/java/org/apache/maven/internal/impl/DefaultSettingsXmlFactory.java`
#### Snippet
```java
            InputSource source = null;
            if (request.getModelId() != null || request.getLocation() != null) {
                source = new InputSource(request.getModelId(), request.getLocation());
            }
            SettingsXpp3Reader xml = new SettingsXpp3Reader();
```

### UnusedAssignment
Variable `reactorContext` initializer `null` is redundant
in `maven-core/src/main/java/org/apache/maven/lifecycle/internal/LifecycleStarter.java`
#### Snippet
```java
        eventCatapult.fire(ExecutionEvent.Type.SessionStarted, session, null);

        ReactorContext reactorContext = null;
        ProjectBuildList projectBuilds = null;
        MavenExecutionResult result = session.getResult();
```

### UnusedAssignment
Variable `projectBuilds` initializer `null` is redundant
in `maven-core/src/main/java/org/apache/maven/lifecycle/internal/LifecycleStarter.java`
#### Snippet
```java

        ReactorContext reactorContext = null;
        ProjectBuildList projectBuilds = null;
        MavenExecutionResult result = session.getResult();

```

### UnusedAssignment
Variable `goal` initializer `null` is redundant
in `maven-core/src/main/java/org/apache/maven/lifecycle/internal/MojoDescriptorCreator.java`
#### Snippet
```java
                    MojoNotFoundException, NoPluginFoundForPrefixException, InvalidPluginDescriptorException,
                    PluginVersionResolutionException {
        String goal = null;

        Plugin plugin = null;
```

### UnusedAssignment
Variable `plugin` initializer `null` is redundant
in `maven-core/src/main/java/org/apache/maven/lifecycle/internal/MojoDescriptorCreator.java`
#### Snippet
```java
        String goal = null;

        Plugin plugin = null;

        StringTokenizer tok = new StringTokenizer(task, ":");
```

### UnusedAssignment
Variable `result` initializer `null` is redundant
in `maven-core/src/main/java/org/apache/maven/project/DefaultProjectBuilder.java`
#### Snippet
```java
                results.add(new DefaultProjectBuildingResult(project, result.getProblems(), resolutionResult));
            } catch (ModelBuildingException e) {
                DefaultProjectBuildingResult result = null;
                if (project == null || interimResult.result.getEffectiveModel() == null) {
                    result = new DefaultProjectBuildingResult(e.getModelId(), interimResult.pomFile, e.getProblems());
```

## RuleId[ruleID=ConstantValue]
### ConstantValue
Value `setRepository` is always 'false'
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/metadata/DefaultRepositoryMetadataManager.java`
#### Snippet
```java
                    getLogger().warn(e.getMessage());
                }
                return setRepository;
            }

```

### ConstantValue
Value `value` is always 'null'
in `maven-compat/src/main/java/org/apache/maven/project/interpolation/StringSearchModelInterpolator.java`
#### Snippet
```java
                                            } else {
                                                // add the null back in...not sure what else to do...
                                                c.add(value);
                                            }
                                        }
```

### ConstantValue
Condition `normalized` is always `false`
in `maven-compat/src/main/java/org/apache/maven/project/DefaultMavenProjectBuilder.java`
#### Snippet
```java
            }

            if (normalized) {
                return repos;
            }
```

### ConstantValue
Condition `problems != null` is always `true`
in `maven-toolchain-builder/src/main/java/org/apache/maven/toolchain/building/ToolchainsBuildingException.java`
#### Snippet
```java

        this.problems = new ArrayList<>();
        if (problems != null) {
            this.problems.addAll(problems);
        }
```

### ConstantValue
Condition `problems != null` is always `true`
in `maven-settings-builder/src/main/java/org/apache/maven/settings/building/SettingsBuildingException.java`
#### Snippet
```java

        this.problems = new ArrayList<>();
        if (problems != null) {
            this.problems.addAll(problems);
        }
```

### ConstantValue
Condition `currentArg != null` is always `true`
in `maven-embedder/src/main/java/org/apache/maven/cli/CleanArgument.java`
#### Snippet
```java

                // if we're building an argument, keep doing so.
                if (currentArg != null) {
                    // if this is the case of "-Dfoo=bar", then we need to adjust the buffer.
                    if (addedToBuffer) {
```

### ConstantValue
Condition `addedToBuffer` is always `true`
in `maven-embedder/src/main/java/org/apache/maven/cli/CleanArgument.java`
#### Snippet
```java
                if (currentArg != null) {
                    // if this is the case of "-Dfoo=bar", then we need to adjust the buffer.
                    if (addedToBuffer) {
                        currentArg.setLength(currentArg.length() - 1);
                    }
```

### ConstantValue
Value `artifactId` is always 'null'
in `maven-artifact/src/main/java/org/apache/maven/artifact/DefaultArtifact.java`
#### Snippet
```java
        if (artifactId == null) {
            throw new InvalidArtifactRTException(
                    groupId, artifactId, getVersion(), type, "The artifactId cannot be empty.");
        }

```

### ConstantValue
Value `type` is always 'null'
in `maven-artifact/src/main/java/org/apache/maven/artifact/DefaultArtifact.java`
#### Snippet
```java

        if (type == null) {
            throw new InvalidArtifactRTException(groupId, artifactId, getVersion(), type, "The type cannot be empty.");
        }

```

### ConstantValue
Value `ret` is always 'true'
in `maven-settings/src/main/java/org/apache/maven/settings/WrapperList.java`
#### Snippet
```java
            boolean ret = list.add(revMapper.apply(t));
            setter.accept(list);
            return ret;
        } else {
            return getter.get().add(revMapper.apply(t));
```

### ConstantValue
Value `lowerInclusive` is always 'true'
in `maven-artifact/src/main/java/org/apache/maven/artifact/versioning/VersionRange.java`
#### Snippet
```java
                        restrictions.add(new Restriction(lower, lowerInclusive, upper, upperInclusive));
                    } else if (lowerInclusive && upperInclusive) {
                        restrictions.add(new Restriction(lower, lowerInclusive, upper, upperInclusive));
                    }

```

### ConstantValue
Value `upperInclusive` is always 'true'
in `maven-artifact/src/main/java/org/apache/maven/artifact/versioning/VersionRange.java`
#### Snippet
```java
                        restrictions.add(new Restriction(lower, lowerInclusive, upper, upperInclusive));
                    } else if (lowerInclusive && upperInclusive) {
                        restrictions.add(new Restriction(lower, lowerInclusive, upper, upperInclusive));
                    }

```

### ConstantValue
Value `lowerBoundInclusive` is always 'true'
in `maven-artifact/src/main/java/org/apache/maven/artifact/versioning/VersionRange.java`
#### Snippet
```java
            ArtifactVersion version = new DefaultArtifactVersion(process);

            restriction = new Restriction(version, lowerBoundInclusive, version, upperBoundInclusive);
        } else {
            String lowerBound = process.substring(0, index).trim();
```

### ConstantValue
Value `upperBoundInclusive` is always 'true'
in `maven-artifact/src/main/java/org/apache/maven/artifact/versioning/VersionRange.java`
#### Snippet
```java
            ArtifactVersion version = new DefaultArtifactVersion(process);

            restriction = new Restriction(version, lowerBoundInclusive, version, upperBoundInclusive);
        } else {
            String lowerBound = process.substring(0, index).trim();
```

### ConstantValue
Value `l` is always 'null'
in `maven-artifact/src/main/java/org/apache/maven/artifact/versioning/ComparableVersion.java`
#### Snippet
```java

                        // if this is shorter, then invert the compare and mul with -1
                        int result = l == null ? (r == null ? 0 : -1 * r.compareTo(l)) : l.compareTo(r);

                        if (result != 0) {
```

### ConstantValue
Value `transitive` is always 'true'
in `maven-core/src/main/java/org/apache/maven/graph/DefaultProjectDependencyGraph.java`
#### Snippet
```java
        for (String id : sorter.getDependencies(projectId)) {
            if (projectIds.add(id) && transitive) {
                getUpstreamProjects(id, projectIds, transitive);
            }
        }
```

### ConstantValue
Value `transitive` is always 'true'
in `maven-core/src/main/java/org/apache/maven/graph/DefaultProjectDependencyGraph.java`
#### Snippet
```java
        for (String id : sorter.getDependents(projectId)) {
            if (projectIds.add(id) && transitive) {
                getDownstreamProjects(id, projectIds, transitive);
            }
        }
```

### ConstantValue
Value `mojo` is always 'null'
in `maven-core/src/main/java/org/apache/maven/plugin/DefaultBuildPluginManager.java`
#### Snippet
```java
        } catch (PluginContainerException e) {
            mojoExecutionListener.afterExecutionFailure(
                    new MojoExecutionEvent(session, project, mojoExecution, mojo, e));
            throw new PluginExecutionException(mojoExecution, project, e);
        } catch (NoClassDefFoundError e) {
```

### ConstantValue
Value `recordArtifacts` is always 'null'
in `maven-core/src/main/java/org/apache/maven/plugin/internal/DefaultMavenPluginManager.java`
#### Snippet
```java
            } catch (PluginResolutionException e) {
                pluginArtifactsCache.put(cacheKey, e);
                pluginArtifactsCache.register(project, cacheKey, recordArtifacts);
                throw new PluginManagerException(plugin, e.getMessage(), e);
            }
```

### ConstantValue
Condition `!details.isEmpty()` is always `true`
in `maven-core/src/main/java/org/apache/maven/internal/impl/DefaultNode.java`
#### Snippet
```java
            buffer.append("(");
            buffer.append(nodeString);
            if (!details.isEmpty()) {
                buffer.append(" - ");
                join(buffer, details, "; ");
```

### ConstantValue
Result of `details.isEmpty()` is always 'false'
in `maven-core/src/main/java/org/apache/maven/internal/impl/DefaultNode.java`
#### Snippet
```java
            buffer.append("(");
            buffer.append(nodeString);
            if (!details.isEmpty()) {
                buffer.append(" - ");
                join(buffer, details, "; ");
```

### ConstantValue
Value `outputStream` is always 'null'
in `maven-core/src/main/java/org/apache/maven/internal/impl/DefaultModelXmlFactory.java`
#### Snippet
```java
            } else {
                try (OutputStream os = Files.newOutputStream(path)) {
                    new MavenXpp3WriterEx().write(outputStream, content);
                }
            }
```

### ConstantValue
Value `aggregating` is always 'true'
in `maven-core/src/main/java/org/apache/maven/lifecycle/internal/MojoExecutor.java`
#### Snippet
```java
                                scopesToResolve,
                                session,
                                aggregating,
                                Collections.emptySet());
                    }
```

### ConstantValue
Value `muxer` is always 'null'
in `maven-core/src/main/java/org/apache/maven/lifecycle/internal/builder/multithreaded/MultiThreadedBuilder.java`
#### Snippet
```java
                        new ConcurrencyDependencyGraph(segmentProjectBuilds, session.getProjectDependencyGraph());
                multiThreadedProjectTaskSegmentBuild(
                        analyzer, reactorContext, session, service, taskSegment, projectBuildMap, muxer);
                if (reactorContext.getReactorBuildStatus().isHalted()) {
                    break;
```

### ConstantValue
Value `recordArtifacts` is always 'null'
in `maven-core/src/main/java/org/apache/maven/lifecycle/internal/LifecycleDependencyResolver.java`
#### Snippet
```java
            } catch (LifecycleExecutionException e) {
                projectArtifactsCache.put(cacheKey, e);
                projectArtifactsCache.register(project, cacheKey, recordArtifacts);
                throw e;
            }
```

### ConstantValue
Value `ret` is always 'true'
in `maven-model/src/main/java/org/apache/maven/model/WrapperList.java`
#### Snippet
```java
            boolean ret = list.add(revMapper.apply(t));
            setter.accept(list);
            return ret;
        } else {
            return getter.get().add(revMapper.apply(t));
```

### ConstantValue
Value `ret` is always 'true'
in `maven-toolchain-model/src/main/java/org/apache/maven/toolchain/model/WrapperList.java`
#### Snippet
```java
            boolean ret = list.add(revMapper.apply(t));
            setter.accept(list);
            return ret;
        } else {
            return getter.get().add(revMapper.apply(t));
```

### ConstantValue
Condition `repositorySystem != null` is always `true`
in `maven-core/src/main/java/org/apache/maven/project/DefaultProjectBuilder.java`
#### Snippet
```java
        // managedVersionMap
        Map<String, Artifact> map = null;
        if (repositorySystem != null) {
            final DependencyManagement dependencyManagement = project.getDependencyManagement();
            if ((dependencyManagement != null)
```

### ConstantValue
Value `recursive` is always 'true'
in `maven-core/src/main/java/org/apache/maven/project/DefaultProjectBuilder.java`
#### Snippet
```java
                    aggregatorFiles,
                    false,
                    recursive,
                    config,
                    poolBuilder)) {
```

## RuleId[ruleID=IOResource]
### IOResource
'RandomAccessFile' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/DefaultUpdateCheckManager.java`
#### Snippet
```java
                Properties props = new Properties();

                channel = new RandomAccessFile(touchfile, "rw").getChannel();
                lock = channel.lock();

```

### IOResource
'PrintWriter' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `maven-model-builder/src/main/java/org/apache/maven/model/building/ModelBuildingException.java`
#### Snippet
```java
        StringWriter buffer = new StringWriter(1024);

        PrintWriter writer = new PrintWriter(buffer);

        writer.print(problems.size());
```

### IOResource
'PrintWriter' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `maven-toolchain-builder/src/main/java/org/apache/maven/toolchain/building/ToolchainsBuildingException.java`
#### Snippet
```java
        StringWriter buffer = new StringWriter(1024);

        PrintWriter writer = new PrintWriter(buffer);

        writer.print(problems.size());
```

### IOResource
'PrintWriter' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `maven-settings-builder/src/main/java/org/apache/maven/settings/building/SettingsBuildingException.java`
#### Snippet
```java
        StringWriter buffer = new StringWriter(1024);

        PrintWriter writer = new PrintWriter(buffer);

        writer.print(problems.size());
```

## RuleId[ruleID=FieldMayBeStatic]
### FieldMayBeStatic
Field `context` may be 'static'
in `maven-core/src/main/java/org/apache/maven/project/ProjectModelResolver.java`
#### Snippet
```java
    private final RequestTrace trace;

    private final String context = "project";

    private List<RemoteRepository> repositories;
```

## RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `ModelUtils` has only 'static' members, and lacks a 'private' constructor
in `maven-compat/src/main/java/org/apache/maven/project/ModelUtils.java`
#### Snippet
```java
/** @deprecated */
@Deprecated
public final class ModelUtils {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `MetadataUtils` has only 'static' members, and lacks a 'private' constructor
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/metadata/MetadataUtils.java`
#### Snippet
```java
 * @author Benjamin Bentmann
 */
class MetadataUtils {

    public static Metadata cloneMetadata(Metadata src) {
```

### UtilityClassWithoutPrivateConstructor
Class `ExpressionDocumenter` has only 'static' members, and lacks a 'private' constructor
in `maven-compat/src/main/java/org/apache/maven/usability/plugin/ExpressionDocumenter.java`
#### Snippet
```java
 * ExpressionDocumenter
 */
public class ExpressionDocumenter {

    private static final String[] EXPRESSION_ROOTS = {"project", "settings", "session", "plugin", "rootless"};
```

### UtilityClassWithoutPrivateConstructor
Class `ModelProblemUtils` has only 'static' members, and lacks a 'private' constructor
in `maven-model-builder/src/main/java/org/apache/maven/model/building/ModelProblemUtils.java`
#### Snippet
```java
 * @author Benjamin Bentmann
 */
public class ModelProblemUtils {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `MavenSlf4jFriend` has only 'static' members, and lacks a 'private' constructor
in `maven-embedder/src/main/java/org/slf4j/MavenSlf4jFriend.java`
#### Snippet
```java
 * Use with precaution, since this is not normally intended for production use.
 */
public class MavenSlf4jFriend {
    /**
     * Reset Slf4j internal state.
```

### UtilityClassWithoutPrivateConstructor
Class `MavenSlf4jSimpleFriend` has only 'static' members, and lacks a 'private' constructor
in `maven-embedder/src/main/java/org/slf4j/impl/MavenSlf4jSimpleFriend.java`
#### Snippet
```java
 * Use with precaution, since this is not normally intended for production use.
 */
public class MavenSlf4jSimpleFriend {
    public static void init() {
        SimpleLogger.init();
```

### UtilityClassWithoutPrivateConstructor
Class `CleanArgument` has only 'static' members, and lacks a 'private' constructor
in `maven-embedder/src/main/java/org/apache/maven/cli/CleanArgument.java`
#### Snippet
```java
 * CleanArgument
 */
public class CleanArgument {
    public static String[] cleanArgs(String[] args) {
        List<String> cleaned = new ArrayList<>();
```

### UtilityClassWithoutPrivateConstructor
Class `ResolveFile` has only 'static' members, and lacks a 'private' constructor
in `maven-embedder/src/main/java/org/apache/maven/cli/ResolveFile.java`
#### Snippet
```java
 * Resolve relative file path against the given base directory
 */
public class ResolveFile {
    public static File resolveFile(File file, String baseDirectory) {
        if (file == null) {
```

### UtilityClassWithoutPrivateConstructor
Class `CLIReportingUtils` has only 'static' members, and lacks a 'private' constructor
in `maven-embedder/src/main/java/org/apache/maven/cli/CLIReportingUtils.java`
#### Snippet
```java
 * @author jdcasey
 */
public final class CLIReportingUtils {
    // CHECKSTYLE_OFF: MagicNumber
    public static final long MB = 1024 * 1024;
```

### UtilityClassWithoutPrivateConstructor
Class `Slf4jConfigurationFactory` has only 'static' members, and lacks a 'private' constructor
in `maven-embedder/src/main/java/org/apache/maven/cli/logging/Slf4jConfigurationFactory.java`
#### Snippet
```java
 * @since 3.1.0
 */
public class Slf4jConfigurationFactory {
    public static final String RESOURCE = "META-INF/maven/slf4j-configuration.properties";

```

### UtilityClassWithoutPrivateConstructor
Class `DomBuilder` has only 'static' members, and lacks a 'private' constructor
in `maven-xml-impl/src/main/java/org/apache/maven/internal/xml/DomBuilder.java`
#### Snippet
```java
import org.codehaus.plexus.util.xml.pull.XmlPullParserException;

public class DomBuilder {

    public static Xpp3Dom build(Reader reader) throws MavenXmlException {
```

### UtilityClassWithoutPrivateConstructor
Class `Xpp3DomWriter` has only 'static' members, and lacks a 'private' constructor
in `maven-xml-impl/src/main/java/org/apache/maven/internal/xml/Xpp3DomWriter.java`
#### Snippet
```java
 *
 */
public class Xpp3DomWriter {
    public static void write(Writer writer, Dom dom) {
        write(new PrettyPrintXMLWriter(writer), dom);
```

### UtilityClassWithoutPrivateConstructor
Class `Xpp3DomBuilder` has only 'static' members, and lacks a 'private' constructor
in `maven-xml-impl/src/main/java/org/codehaus/plexus/util/xml/Xpp3DomBuilder.java`
#### Snippet
```java
 * @version $Id$
 */
public class Xpp3DomBuilder {
    private static final boolean DEFAULT_TRIM = true;

```

### UtilityClassWithoutPrivateConstructor
Class `Xpp3DomBuilder` has only 'static' members, and lacks a 'private' constructor
in `maven-xml-impl/src/main/java/org/apache/maven/internal/xml/Xpp3DomBuilder.java`
#### Snippet
```java
 *
 */
public class Xpp3DomBuilder {
    private static final boolean DEFAULT_TRIM = true;

```

### UtilityClassWithoutPrivateConstructor
Class `XmlUtils` has only 'static' members, and lacks a 'private' constructor
in `maven-model-transform/src/main/java/org/apache/maven/model/transform/pull/XmlUtils.java`
#### Snippet
```java
import org.codehaus.plexus.util.xml.pull.XmlSerializer;

public class XmlUtils {

    public static ByteArrayInputStream writeDocument(XmlStreamReader reader, XmlPullParser parser)
```

### UtilityClassWithoutPrivateConstructor
Class `ArtifactUtils` has only 'static' members, and lacks a 'private' constructor
in `maven-artifact/src/main/java/org/apache/maven/artifact/ArtifactUtils.java`
#### Snippet
```java
 * ArtifactUtils
 */
public final class ArtifactUtils {

    public static boolean isSnapshot(String version) {
```

### UtilityClassWithoutPrivateConstructor
Class `ArtifactDescriptorUtils` has only 'static' members, and lacks a 'private' constructor
in `maven-resolver-provider/src/main/java/org/apache/maven/repository/internal/ArtifactDescriptorUtils.java`
#### Snippet
```java
 * @author Benjamin Bentmann
 */
public class ArtifactDescriptorUtils {

    public static Artifact toPomArtifact(Artifact artifact) {
```

### UtilityClassWithoutPrivateConstructor
Class `ImmutableCollections` has only 'static' members, and lacks a 'private' constructor
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/lifecycle/ImmutableCollections.java`
#### Snippet
```java
import java.util.function.UnaryOperator;

class ImmutableCollections {

    private static final List<?> EMPTY_LIST = new AbstractImmutableList<Object>() {
```

### UtilityClassWithoutPrivateConstructor
Class `ImmutableCollections` has only 'static' members, and lacks a 'private' constructor
in `api/maven-api-settings/src/main/java/org/apache/maven/api/settings/ImmutableCollections.java`
#### Snippet
```java
import java.util.function.UnaryOperator;

class ImmutableCollections {

    private static final List<?> EMPTY_LIST = new AbstractImmutableList<Object>() {
```

### UtilityClassWithoutPrivateConstructor
Class `ProblemCollectorFactory` has only 'static' members, and lacks a 'private' constructor
in `maven-builder-support/src/main/java/org/apache/maven/building/ProblemCollectorFactory.java`
#### Snippet
```java
 * @since 3.3.0
 */
public class ProblemCollectorFactory {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `ImmutableCollections` has only 'static' members, and lacks a 'private' constructor
in `api/maven-api-model/src/main/java/org/apache/maven/api/model/ImmutableCollections.java`
#### Snippet
```java
import java.util.function.UnaryOperator;

class ImmutableCollections {

    private static final List<?> EMPTY_LIST = new AbstractImmutableList<Object>() {
```

### UtilityClassWithoutPrivateConstructor
Class `RepositoryUtils` has only 'static' members, and lacks a 'private' constructor
in `maven-core/src/main/java/org/apache/maven/RepositoryUtils.java`
#### Snippet
```java
 * @author Benjamin Bentmann
 */
public class RepositoryUtils {

    private static String nullify(String string) {
```

### UtilityClassWithoutPrivateConstructor
Class `CacheUtils` has only 'static' members, and lacks a 'private' constructor
in `maven-core/src/main/java/org/apache/maven/plugin/CacheUtils.java`
#### Snippet
```java
 * @author Benjamin Bentmann
 */
class CacheUtils {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `MultilineMessageHelper` has only 'static' members, and lacks a 'private' constructor
in `maven-core/src/main/java/org/apache/maven/internal/MultilineMessageHelper.java`
#### Snippet
```java
 * Helper class to format multiline messages to the console
 */
public class MultilineMessageHelper {

    private static final int DEFAULT_MAX_SIZE = 65;
```

### UtilityClassWithoutPrivateConstructor
Class `Utils` has only 'static' members, and lacks a 'private' constructor
in `maven-core/src/main/java/org/apache/maven/internal/impl/Utils.java`
#### Snippet
```java
package org.apache.maven.internal.impl;

class Utils {
    static <T> T nonNull(T t) {
        if (t == null) {
```

### UtilityClassWithoutPrivateConstructor
Class `EnvironmentUtils` has only 'static' members, and lacks a 'private' constructor
in `maven-core/src/main/java/org/apache/maven/properties/internal/EnvironmentUtils.java`
#### Snippet
```java
 * @author Benjamin Bentmann
 */
public class EnvironmentUtils {

    private static Properties envVars;
```

### UtilityClassWithoutPrivateConstructor
Class `SystemProperties` has only 'static' members, and lacks a 'private' constructor
in `maven-core/src/main/java/org/apache/maven/properties/internal/SystemProperties.java`
#### Snippet
```java
 * @since 3.2.3
 */
public class SystemProperties {
    /**
     * Thread-safe System.properties copy implementation.
```

### UtilityClassWithoutPrivateConstructor
Class `ImmutableCollections` has only 'static' members, and lacks a 'private' constructor
in `api/maven-api-toolchain/src/main/java/org/apache/maven/api/toolchain/ImmutableCollections.java`
#### Snippet
```java
import java.util.function.UnaryOperator;

class ImmutableCollections {

    private static final List<?> EMPTY_LIST = new AbstractImmutableList<Object>() {
```

## RuleId[ruleID=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `maven-embedder/src/main/java/org/apache/maven/cli/transfer/AbstractMavenTransferListener.java`
#### Snippet
```java
                    return MEGABYTE.bytes() * KILOBYTE.bytes();
                }
                ;

                @Override
```

## RuleId[ruleID=DataFlowIssue]
### DataFlowIssue
Casting `repository` to `ArtifactRepository` will produce `ClassCastException` for any non-null value
in `maven-compat/src/main/java/org/apache/maven/project/DefaultMavenProjectBuilder.java`
#### Snippet
```java
                    normalized = true;
                } else {
                    repos.add((ArtifactRepository) repository);
                }
            }
```

### DataFlowIssue
`null` is returned by the method declared as @NotNull
in `maven-compat/src/main/java/org/apache/maven/repository/metadata/ClasspathContainer.java`
#### Snippet
```java
    // -------------------------------------------------------------------------------------------
    public Iterator<ArtifactMetadata> iterator() {
        return classpath == null ? null : classpath.iterator();
    }

```

### DataFlowIssue
Method invocation `toExternalForm` may produce `NullPointerException`
in `maven-model-builder/src/main/java/org/apache/maven/model/superpom/DefaultSuperPomProvider.java`
#### Snippet
```java
                        + this.getClass().getPackage().getImplementationVersion() + ":super-pom";
                InputSource inputSource = new InputSource(
                        modelId, getClass().getResource(resource).toExternalForm());
                options.put(ModelProcessor.INPUT_SOURCE, new org.apache.maven.model.InputSource(inputSource));

```

### DataFlowIssue
Argument `str` might be null
in `maven-artifact/src/main/java/org/apache/maven/artifact/ArtifactUtils.java`
#### Snippet
```java
        int c = str != null && str.length() > 0 ? str.charAt(0) : 0;
        if ((c < '0' || c > '9') && (c < 'a' || c > 'z')) {
            Validate.notBlank(str, message);
        }
    }
```

### DataFlowIssue
Method invocation `getArtifact` may produce `NullPointerException`
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/resolver/DefaultLegacyArtifactCollector.java`
#### Snippet
```java
                            // TODO add better exception
                            result.addVersionRangeViolation(new ArtifactResolutionException(
                                    "Conflict resolver returned unknown resolution node: ", resolved.getArtifact()));
                        }

```

### DataFlowIssue
Condition `cause instanceof LinkageError` is redundant and can be replaced with a null check
in `maven-core/src/main/java/org/apache/maven/plugin/internal/DefaultMavenPluginManager.java`
#### Snippet
```java

                    throw new PluginContainerException(mojoDescriptor, pluginRealm, os.toString(), cause);
                } else if (cause instanceof LinkageError) {
                    ByteArrayOutputStream os = new ByteArrayOutputStream(1024);
                    PrintStream ps = new PrintStream(os);
```

### DataFlowIssue
Argument `tasks` might be null
in `maven-core/src/main/java/org/apache/maven/lifecycle/internal/DefaultLifecycleTaskSegmentCalculator.java`
#### Snippet
```java
        }

        return calculateTaskSegments(session, tasks);
    }

```

## RuleId[ruleID=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
'!Stream.anyMatch(...)' can be replaced with 'noneMatch()'
in `maven-core/src/main/java/org/apache/maven/artifact/resolver/filter/ExclusionArtifactFilter.java`
#### Snippet
```java
    @Override
    public boolean include(Artifact artifact) {
        return !exclusions.stream().anyMatch(exclude(artifact));
    }
}
```

## RuleId[ruleID=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `maven-core/src/main/java/org/apache/maven/lifecycle/internal/MojoDescriptorCreator.java`
#### Snippet
```java

        return pluginManager.getMojoDescriptor(
                plugin, goal.toString(), project.getRemotePluginRepositories(), session.getRepositorySession());
    }

```

## RuleId[ruleID=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'ModelInheritanceAssembler' is still used
in `maven-compat/src/main/java/org/apache/maven/project/inheritance/ModelInheritanceAssembler.java`
#### Snippet
```java
 */
@Deprecated
public interface ModelInheritanceAssembler {
    String ROLE = ModelInheritanceAssembler.class.getName();

```

### DeprecatedIsStillUsed
Deprecated member 'DefaultPathTranslator' is still used
in `maven-compat/src/main/java/org/apache/maven/project/path/DefaultPathTranslator.java`
#### Snippet
```java
@Deprecated
@Component(role = PathTranslator.class)
public class DefaultPathTranslator implements PathTranslator {
    private static final String[] BASEDIR_EXPRESSIONS = {"${basedir}", "${pom.basedir}", "${project.basedir}"};

```

### DeprecatedIsStillUsed
Deprecated member 'WagonManager' is still used
in `maven-compat/src/main/java/org/apache/maven/artifact/manager/WagonManager.java`
#### Snippet
```java
 */
@Deprecated
public interface WagonManager extends org.apache.maven.repository.legacy.WagonManager {
    /**
     * this method is only here for backward compat (project-info-reports:dependencies)
```

### DeprecatedIsStillUsed
Deprecated member 'ResolutionListenerForDepMgmt' is still used
in `maven-compat/src/main/java/org/apache/maven/artifact/resolver/ResolutionListenerForDepMgmt.java`
#### Snippet
```java
 */
@Deprecated
public interface ResolutionListenerForDepMgmt {
    void manageArtifactVersion(Artifact artifact, Artifact replacement);

```

### DeprecatedIsStillUsed
Deprecated member 'DefaultArtifactRepository' is still used
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/DefaultArtifactRepository.java`
#### Snippet
```java
 */
@Deprecated
public class DefaultArtifactRepository extends Repository implements ArtifactRepository {
    private ArtifactRepositoryLayout layout;

```

### DeprecatedIsStillUsed
Deprecated member 'ArtifactCollector' is still used
in `maven-compat/src/main/java/org/apache/maven/artifact/resolver/ArtifactCollector.java`
#### Snippet
```java
 */
@Deprecated
public interface ArtifactCollector extends org.apache.maven.repository.legacy.resolver.LegacyArtifactCollector {

    @Deprecated
```

### DeprecatedIsStillUsed
Deprecated member 'ManagedVersionMap' is still used
in `maven-compat/src/main/java/org/apache/maven/artifact/versioning/ManagedVersionMap.java`
#### Snippet
```java
 */
@Deprecated
public class ManagedVersionMap extends HashMap<String, Artifact> {
    public ManagedVersionMap(Map<String, Artifact> map) {
        super();
```

### DeprecatedIsStillUsed
Deprecated member 'DefaultProfileManager' is still used
in `maven-compat/src/main/java/org/apache/maven/profiles/DefaultProfileManager.java`
#### Snippet
```java
 */
@Deprecated
public class DefaultProfileManager implements ProfileManager {

    @Requirement
```

### DeprecatedIsStillUsed
Deprecated member 'getWagon' is still used
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/WagonManager.java`
#### Snippet
```java
public interface WagonManager {
    @Deprecated
    Wagon getWagon(String protocol) throws UnsupportedProtocolException;

    @Deprecated
```

### DeprecatedIsStillUsed
Deprecated member 'LegacyArtifactCollector' is still used
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/resolver/LegacyArtifactCollector.java`
#### Snippet
```java
@Deprecated
@SuppressWarnings("checkstyle:parameternumber")
public interface LegacyArtifactCollector {

    ArtifactResolutionResult collect(
```

### DeprecatedIsStillUsed
Deprecated member 'ProfileManager' is still used
in `maven-compat/src/main/java/org/apache/maven/profiles/ProfileManager.java`
#### Snippet
```java
 */
@Deprecated
public interface ProfileManager {

    void addProfile(Profile profile);
```

### DeprecatedIsStillUsed
Deprecated member 'setRemoteRepostories' is still used
in `maven-compat/src/main/java/org/apache/maven/repository/MetadataResolutionRequest.java`
#### Snippet
```java
     */
    @Deprecated
    public MetadataResolutionRequest setRemoteRepostories(List<ArtifactRepository> remoteRepositories) {
        this.remoteRepositories = remoteRepositories;

```

### DeprecatedIsStillUsed
Deprecated member 'getRemoteRepostories' is still used
in `maven-compat/src/main/java/org/apache/maven/repository/MetadataResolutionRequest.java`
#### Snippet
```java
     */
    @Deprecated
    public List<ArtifactRepository> getRemoteRepostories() {
        return remoteRepositories;
    }
```

### DeprecatedIsStillUsed
Deprecated member 'getWagon' is still used
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/DefaultWagonManager.java`
#### Snippet
```java
    @Override
    @Deprecated
    public Wagon getWagon(String protocol) throws UnsupportedProtocolException {
        if (protocol == null) {
            throw new UnsupportedProtocolException("Unspecified protocol");
```

### DeprecatedIsStillUsed
Deprecated member 'resolveTransitively' is still used
in `maven-compat/src/main/java/org/apache/maven/artifact/resolver/ArtifactResolver.java`
#### Snippet
```java
    // USED BY INVOKER PLUGIN
    @Deprecated
    ArtifactResolutionResult resolveTransitively(
            Set<Artifact> artifacts,
            Artifact originatingArtifact,
```

### DeprecatedIsStillUsed
Deprecated member 'SettingsSource' is still used
in `maven-settings-builder/src/main/java/org/apache/maven/settings/building/SettingsSource.java`
#### Snippet
```java
 */
@Deprecated
public interface SettingsSource extends Source {}

```

### DeprecatedIsStillUsed
Deprecated member 'setRawModel' is still used
in `maven-model-builder/src/main/java/org/apache/maven/model/building/ModelBuildingRequest.java`
#### Snippet
```java
     */
    @Deprecated
    ModelBuildingRequest setRawModel(Model rawModel);

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'DEBUG' is still used
in `maven-embedder/src/main/java/org/apache/maven/cli/CLIManager.java`
#### Snippet
```java
     * Use {@code -X/--verbose} instead. */
    @Deprecated
    public static final String DEBUG = "debug";

    protected Options options;
```

### DeprecatedIsStillUsed
Deprecated member 'UrlModelSource' is still used
in `maven-model-builder/src/main/java/org/apache/maven/model/building/UrlModelSource.java`
#### Snippet
```java
 */
@Deprecated
public class UrlModelSource extends UrlSource implements ModelSource {
    /**
     * Creates a new model source backed by the specified URL.
```

### DeprecatedIsStillUsed
Deprecated member 'createDeploymentArtifactRepository' is still used
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/repository/ArtifactRepositoryFactory.java`
#### Snippet
```java

    @Deprecated
    ArtifactRepository createDeploymentArtifactRepository(String id, String url, String layoutId, boolean uniqueVersion)
            throws UnknownRepositoryLayoutException;

```

### DeprecatedIsStillUsed
Deprecated member 'StringModelSource' is still used
in `maven-model-builder/src/main/java/org/apache/maven/model/building/StringModelSource.java`
#### Snippet
```java
 */
@Deprecated
public class StringModelSource extends StringSource implements ModelSource {

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'setLog' is still used
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/Mojo.java`
#### Snippet
```java
     */
    @Deprecated
    void setLog(Log log);

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'ArtifactFilterManagerDelegate' is still used
in `maven-core/src/main/java/org/apache/maven/ArtifactFilterManagerDelegate.java`
#### Snippet
```java
 * @deprecated use {@code META-INF/maven/extension.xml} to define artifacts exported by Maven core extensions.
 */
public interface ArtifactFilterManagerDelegate {

    void addExcludes(Set<String> excludes);
```

### DeprecatedIsStillUsed
Deprecated member 'PluginManager' is still used
in `maven-core/src/main/java/org/apache/maven/plugin/PluginManager.java`
#### Snippet
```java
 */
@Deprecated
public interface PluginManager {
    String ROLE = PluginManager.class.getName();

```

### DeprecatedIsStillUsed
Deprecated member 'DebugConfigurationListener' is still used
in `maven-core/src/main/java/org/apache/maven/plugin/DebugConfigurationListener.java`
#### Snippet
```java
 */
@Deprecated
public class DebugConfigurationListener implements ConfigurationListener {
    private final Logger logger;

```

### DeprecatedIsStillUsed
Deprecated member 'isResolveVersionRanges' is still used
in `maven-core/src/main/java/org/apache/maven/project/ProjectBuildingRequest.java`
#### Snippet
```java
     */
    @Deprecated
    boolean isResolveVersionRanges();

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'AttachedArtifact' is still used
in `maven-core/src/main/java/org/apache/maven/project/artifact/AttachedArtifact.java`
#### Snippet
```java
 */
@Deprecated
public class AttachedArtifact extends DefaultArtifact {

    private final Artifact parent;
```

### DeprecatedIsStillUsed
Deprecated member 'setResolveVersionRanges' is still used
in `maven-core/src/main/java/org/apache/maven/project/DefaultProjectBuildingRequest.java`
#### Snippet
```java
     */
    @Deprecated
    public ProjectBuildingRequest setResolveVersionRanges(boolean value) {
        this.resolveVersionRanges = value;
        return this;
```

### DeprecatedIsStillUsed
Deprecated member 'AbstractArtifactMetadata' is still used
in `maven-core/src/main/java/org/apache/maven/artifact/metadata/AbstractArtifactMetadata.java`
#### Snippet
```java
 */
@Deprecated
public abstract class AbstractArtifactMetadata
        extends org.apache.maven.repository.legacy.metadata.AbstractArtifactMetadata
        implements org.apache.maven.artifact.metadata.ArtifactMetadata {
```

### DeprecatedIsStillUsed
Deprecated member 'manageArtifact' is still used
in `maven-core/src/main/java/org/apache/maven/artifact/resolver/ResolutionListener.java`
#### Snippet
```java

    @Deprecated
    void manageArtifact(Artifact artifact, Artifact replacement);

    // TODO Use the following two instead of manageArtifact
```

### DeprecatedIsStillUsed
Deprecated member 'createArtifacts' is still used
in `maven-core/src/main/java/org/apache/maven/project/artifact/MavenMetadataSource.java`
#### Snippet
```java
    // USED BY MAVEN ASSEMBLY PLUGIN
    @Deprecated
    public static Set<Artifact> createArtifacts(
            ArtifactFactory artifactFactory,
            List<Dependency> dependencies,
```

### DeprecatedIsStillUsed
Deprecated member 'RepositoryCache' is still used
in `maven-core/src/main/java/org/apache/maven/artifact/repository/RepositoryCache.java`
#### Snippet
```java
// this here, possibly indefinitely.
//
public interface RepositoryCache {

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'getModulePathAdjustment' is still used
in `maven-core/src/main/java/org/apache/maven/project/MavenProject.java`
#### Snippet
```java

    @Deprecated // This appears only to be used in test code
    public String getModulePathAdjustment(MavenProject moduleProject) throws IOException {
        // FIXME: This is hacky. What if module directory doesn't match artifactid, and parent
        // is coming from the repository??
```

### DeprecatedIsStillUsed
Deprecated member 'setDependencyArtifacts' is still used
in `maven-core/src/main/java/org/apache/maven/project/MavenProject.java`
#### Snippet
```java

    @Deprecated
    public void setDependencyArtifacts(Set<Artifact> dependencyArtifacts) {
        this.dependencyArtifacts = dependencyArtifacts;
    }
```

### DeprecatedIsStillUsed
Deprecated member 'setReportArtifacts' is still used
in `maven-core/src/main/java/org/apache/maven/project/MavenProject.java`
#### Snippet
```java

    @Deprecated
    public void setReportArtifacts(Set<Artifact> reportArtifacts) {
        this.reportArtifacts = reportArtifacts;

```

### DeprecatedIsStillUsed
Deprecated member 'getDependencyArtifacts' is still used
in `maven-core/src/main/java/org/apache/maven/project/MavenProject.java`
#### Snippet
```java
     */
    @Deprecated
    public Set<Artifact> getDependencyArtifacts() {
        return dependencyArtifacts;
    }
```

### DeprecatedIsStillUsed
Deprecated member 'setProjectBuildingRequest' is still used
in `maven-core/src/main/java/org/apache/maven/project/MavenProject.java`
#### Snippet
```java
    // used by maven-dependency-tree
    @Deprecated
    public void setProjectBuildingRequest(ProjectBuildingRequest projectBuildingRequest) {
        this.projectBuilderConfiguration = projectBuildingRequest;
    }
```

### DeprecatedIsStillUsed
Deprecated member 'getExtensionArtifacts' is still used
in `maven-core/src/main/java/org/apache/maven/project/MavenProject.java`
#### Snippet
```java

    @Deprecated
    public Set<Artifact> getExtensionArtifacts() {
        return extensionArtifacts;
    }
```

### DeprecatedIsStillUsed
Deprecated member 'addAttachedArtifact' is still used
in `maven-core/src/main/java/org/apache/maven/project/MavenProject.java`
#### Snippet
```java
     * @throws DuplicateArtifactAttachmentException will never happen but leave it for backward compatibility
     */
    public void addAttachedArtifact(Artifact artifact) throws DuplicateArtifactAttachmentException {
        // if already there we remove it and add again
        int index = attachedArtifacts.indexOf(artifact);
```

### DeprecatedIsStillUsed
Deprecated member 'getReportPlugins' is still used
in `maven-core/src/main/java/org/apache/maven/project/MavenProject.java`
#### Snippet
```java

    @Deprecated
    public List<ReportPlugin> getReportPlugins() {
        if (getModel().getReporting() == null) {
            return Collections.emptyList();
```

### DeprecatedIsStillUsed
Deprecated member 'getScriptSourceRoots' is still used
in `maven-core/src/main/java/org/apache/maven/project/MavenProject.java`
#### Snippet
```java

    @Deprecated
    public List<String> getScriptSourceRoots() {
        return scriptSourceRoots;
    }
```

### DeprecatedIsStillUsed
Deprecated member 'setScriptSourceRoots' is still used
in `maven-core/src/main/java/org/apache/maven/project/MavenProject.java`
#### Snippet
```java

    @Deprecated
    protected void setScriptSourceRoots(List<String> scriptSourceRoots) {
        this.scriptSourceRoots = scriptSourceRoots;
    }
```

### DeprecatedIsStillUsed
Deprecated member 'addScriptSourceRoot' is still used
in `maven-core/src/main/java/org/apache/maven/project/MavenProject.java`
#### Snippet
```java

    @Deprecated
    public void addScriptSourceRoot(String path) {
        if (path != null) {
            path = path.trim();
```

### DeprecatedIsStillUsed
Deprecated member 'getSystemClasspathElements' is still used
in `maven-core/src/main/java/org/apache/maven/project/MavenProject.java`
#### Snippet
```java

    @Deprecated
    public List<String> getSystemClasspathElements() throws DependencyResolutionRequiredException {
        List<String> list = new ArrayList<>(getArtifacts().size());

```

### DeprecatedIsStillUsed
Deprecated member 'setExtensionArtifacts' is still used
in `maven-core/src/main/java/org/apache/maven/project/MavenProject.java`
#### Snippet
```java

    @Deprecated
    public void setExtensionArtifacts(Set<Artifact> extensionArtifacts) {
        this.extensionArtifacts = extensionArtifacts;

```

### DeprecatedIsStillUsed
Deprecated member 'getReportArtifacts' is still used
in `maven-core/src/main/java/org/apache/maven/project/MavenProject.java`
#### Snippet
```java

    @Deprecated
    public Set<Artifact> getReportArtifacts() {
        return reportArtifacts;
    }
```

### DeprecatedIsStillUsed
Deprecated member 'getCompileArtifacts' is still used
in `maven-core/src/main/java/org/apache/maven/project/MavenProject.java`
#### Snippet
```java

    @Deprecated
    public List<Artifact> getCompileArtifacts() {
        List<Artifact> list = new ArrayList<>(getArtifacts().size());

```

### DeprecatedIsStillUsed
Deprecated member 'MavenSettingsBuilder' is still used
in `maven-core/src/main/java/org/apache/maven/settings/MavenSettingsBuilder.java`
#### Snippet
```java
 */
@Deprecated
public interface MavenSettingsBuilder {

    String ROLE = MavenSettingsBuilder.class.getName();
```

### DeprecatedIsStillUsed
Deprecated member 'populateFromSettings' is still used
in `maven-core/src/main/java/org/apache/maven/execution/MavenExecutionRequestPopulator.java`
#### Snippet
```java
     */
    @Deprecated
    MavenExecutionRequest populateFromSettings(MavenExecutionRequest request, Settings settings)
            throws MavenExecutionRequestPopulationException;

```

### DeprecatedIsStillUsed
Deprecated member 'getExcludedProjects' is still used
in `maven-core/src/main/java/org/apache/maven/execution/ProjectActivation.java`
#### Snippet
```java
     */
    @Deprecated
    public List<String> getExcludedProjects() {
        return Collections.unmodifiableList(new ArrayList<>(getProjectSelectors(pa -> !pa.active)));
    }
```

### DeprecatedIsStillUsed
Deprecated member 'overwriteInactiveProjects' is still used
in `maven-core/src/main/java/org/apache/maven/execution/ProjectActivation.java`
#### Snippet
```java
     */
    @Deprecated
    public void overwriteInactiveProjects(List<String> inactiveProjectSelectors) {
        List<ProjectActivationSettings> projects = getProjects(pa -> !pa.active).collect(Collectors.toList());
        this.activations.removeAll(projects);
```

### DeprecatedIsStillUsed
Deprecated member 'getSelectedProjects' is still used
in `maven-core/src/main/java/org/apache/maven/execution/ProjectActivation.java`
#### Snippet
```java
     */
    @Deprecated
    public List<String> getSelectedProjects() {
        return Collections.unmodifiableList(new ArrayList<>(getProjectSelectors(pa -> pa.active)));
    }
```

### DeprecatedIsStillUsed
Deprecated member 'overwriteActiveProjects' is still used
in `maven-core/src/main/java/org/apache/maven/execution/ProjectActivation.java`
#### Snippet
```java
     */
    @Deprecated
    public void overwriteActiveProjects(List<String> activeProjectSelectors) {
        List<ProjectActivationSettings> projects = getProjects(pa -> pa.active).collect(Collectors.toList());
        this.activations.removeAll(projects);
```

### DeprecatedIsStillUsed
Deprecated member 'overwriteActiveProfiles' is still used
in `maven-core/src/main/java/org/apache/maven/execution/ProfileActivation.java`
#### Snippet
```java
     */
    @Deprecated
    public void overwriteActiveProfiles(List<String> activeProfileIds) {
        getActiveProfiles().forEach(this.activations::remove);
        activeProfileIds.forEach(this::activateOptionalProfile);
```

### DeprecatedIsStillUsed
Deprecated member 'getInactiveProfiles' is still used
in `maven-core/src/main/java/org/apache/maven/execution/ProfileActivation.java`
#### Snippet
```java
     */
    @Deprecated
    public List<String> getInactiveProfiles() {
        return Collections.unmodifiableList(new ArrayList<>(getProfileIds(pa -> !pa.active)));
    }
```

### DeprecatedIsStillUsed
Deprecated member 'overwriteInactiveProfiles' is still used
in `maven-core/src/main/java/org/apache/maven/execution/ProfileActivation.java`
#### Snippet
```java
     */
    @Deprecated
    public void overwriteInactiveProfiles(List<String> inactiveProfileIds) {
        getInactiveProfiles().forEach(this.activations::remove);
        inactiveProfileIds.forEach(this::deactivateOptionalProfile);
```

### DeprecatedIsStillUsed
Deprecated member 'setSelectedProjects' is still used
in `maven-core/src/main/java/org/apache/maven/execution/MavenExecutionRequest.java`
#### Snippet
```java
     */
    @Deprecated
    MavenExecutionRequest setSelectedProjects(List<String> projects);

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'setActiveProfiles' is still used
in `maven-core/src/main/java/org/apache/maven/execution/MavenExecutionRequest.java`
#### Snippet
```java
     */
    @Deprecated
    MavenExecutionRequest setActiveProfiles(List<String> profiles);

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'getInactiveProfiles' is still used
in `maven-core/src/main/java/org/apache/maven/execution/MavenExecutionRequest.java`
#### Snippet
```java
     */
    @Deprecated
    List<String> getInactiveProfiles();

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'phases' is still used
in `maven-core/src/main/java/org/apache/maven/lifecycle/mapping/DefaultLifecycleMapping.java`
#### Snippet
```java

    /** @deprecated use lifecycles instead */
    private Map<String, LifecyclePhase> phases;

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'DefaultJavaToolChain' is still used
in `maven-core/src/main/java/org/apache/maven/toolchain/java/DefaultJavaToolChain.java`
#### Snippet
```java
 *             {@link JavaToolchainImpl} instead.
 */
public class DefaultJavaToolChain extends JavaToolchainImpl {
    public static final String KEY_JAVAHOME = JavaToolchainImpl.KEY_JAVAHOME;

```

### DeprecatedIsStillUsed
Deprecated member 'DelegatingLocalArtifactRepository' is still used
in `maven-core/src/main/java/org/apache/maven/repository/DelegatingLocalArtifactRepository.java`
#### Snippet
```java
 */
@Deprecated
public class DelegatingLocalArtifactRepository extends MavenArtifactRepository {
    private LocalArtifactRepository buildReactor;

```

## RuleId[ruleID=Convert2MethodRef]
### Convert2MethodRef
Lambda can be replaced with method reference
in `maven-model-builder/src/main/java/org/apache/maven/model/profile/DefaultProfileActivationContext.java`
#### Snippet
```java
            this.projectProperties = projectProperties.entrySet().stream()
                    .collect(collectingAndThen(
                            toMap(k -> String.valueOf(k.getKey()), v -> String.valueOf(v)),
                            Collections::unmodifiableMap));
        } else {
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `maven-core/src/main/java/org/apache/maven/execution/MavenSession.java`
#### Snippet
```java
            this.currentProject = ThreadLocal.withInitial(() -> first);
            this.topLevelProject = projects.stream()
                    .filter(project -> project.isExecutionRoot())
                    .findFirst()
                    .orElse(first);
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `maven-core/src/main/java/org/apache/maven/lifecycle/internal/DefaultMojoExecutionConfigurator.java`
#### Snippet
```java
    private Set<String> getUnknownParameters(MojoExecution mojoExecution, Set<String> parameters) {
        return stream(mojoExecution.getConfiguration().getChildren())
                .map(x -> x.getName())
                .filter(name -> !parameters.contains(name))
                .collect(Collectors.toSet());
```

## RuleId[ruleID=UnnecessaryCallToStringValueOf]
### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `maven-core/src/main/java/org/apache/maven/plugin/DebugConfigurationListener.java`
#### Snippet
```java
                    buf.append(", ");
                }
                buf.append(String.valueOf(Array.get(obj, i)));
            }
            buf.append(']');
```

## RuleId[ruleID=NonSynchronizedMethodOverridesSynchronizedMethod]
### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `elements()` overrides synchronized method
in `maven-settings/src/main/java/org/apache/maven/settings/WrapperProperties.java`
#### Snippet
```java

    @Override
    public Enumeration<Object> elements() {
        return Collections.enumeration((Collection) getter.get().values());
    }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `keys()` overrides synchronized method
in `maven-settings/src/main/java/org/apache/maven/settings/WrapperProperties.java`
#### Snippet
```java

    @Override
    public Enumeration<Object> keys() {
        return Collections.enumeration((Set) getter.get().keySet());
    }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `getOrDefault()` overrides synchronized method
in `maven-settings/src/main/java/org/apache/maven/settings/WrapperProperties.java`
#### Snippet
```java

    @Override
    public Object getOrDefault(Object key, Object defaultValue) {
        return getter.get().getOrDefault(key, defaultValue != null ? defaultValue.toString() : null);
    }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `size()` overrides synchronized method
in `maven-settings/src/main/java/org/apache/maven/settings/WrapperProperties.java`
#### Snippet
```java

    @Override
    public int size() {
        return getter.get().size();
    }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `get()` overrides synchronized method
in `maven-settings/src/main/java/org/apache/maven/settings/WrapperProperties.java`
#### Snippet
```java

    @Override
    public Object get(Object key) {
        return getter.get().get(key);
    }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `contains()` overrides synchronized method
in `maven-settings/src/main/java/org/apache/maven/settings/WrapperProperties.java`
#### Snippet
```java

    @Override
    public boolean contains(Object value) {
        return getter.get().containsKey(value != null ? value.toString() : null);
    }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `containsKey()` overrides synchronized method
in `maven-settings/src/main/java/org/apache/maven/settings/WrapperProperties.java`
#### Snippet
```java

    @Override
    public boolean containsKey(Object key) {
        return getter.get().containsKey(key);
    }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `isEmpty()` overrides synchronized method
in `maven-settings/src/main/java/org/apache/maven/settings/WrapperProperties.java`
#### Snippet
```java

    @Override
    public boolean isEmpty() {
        return getter.get().isEmpty();
    }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `clear()` overrides synchronized method
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/lifecycle/ImmutableCollections.java`
#### Snippet
```java

        @Override
        public void clear() {
            throw uoe();
        }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `remove()` overrides synchronized method
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/lifecycle/ImmutableCollections.java`
#### Snippet
```java

        @Override
        public boolean remove(Object key, Object value) {
            throw uoe();
        }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `remove()` overrides synchronized method
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/lifecycle/ImmutableCollections.java`
#### Snippet
```java

        @Override
        public Object remove(Object key) {
            throw uoe();
        }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `compute()` overrides synchronized method
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/lifecycle/ImmutableCollections.java`
#### Snippet
```java

        @Override
        public Object compute(Object key, BiFunction<? super Object, ? super Object, ?> remappingFunction) {
            throw uoe();
        }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `replace()` overrides synchronized method
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/lifecycle/ImmutableCollections.java`
#### Snippet
```java

        @Override
        public Object replace(Object key, Object value) {
            throw uoe();
        }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `merge()` overrides synchronized method
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/lifecycle/ImmutableCollections.java`
#### Snippet
```java

        @Override
        public Object merge(Object key, Object value, BiFunction<? super Object, ? super Object, ?> remappingFunction) {
            throw uoe();
        }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `putAll()` overrides synchronized method
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/lifecycle/ImmutableCollections.java`
#### Snippet
```java

        @Override
        public void putAll(Map<?, ?> t) {
            throw uoe();
        }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `put()` overrides synchronized method
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/lifecycle/ImmutableCollections.java`
#### Snippet
```java

        @Override
        public Object put(Object key, Object value) {
            throw uoe();
        }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `replaceAll()` overrides synchronized method
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/lifecycle/ImmutableCollections.java`
#### Snippet
```java

        @Override
        public void replaceAll(BiFunction<? super Object, ? super Object, ?> function) {
            throw uoe();
        }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `putIfAbsent()` overrides synchronized method
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/lifecycle/ImmutableCollections.java`
#### Snippet
```java

        @Override
        public Object putIfAbsent(Object key, Object value) {
            throw uoe();
        }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `computeIfAbsent()` overrides synchronized method
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/lifecycle/ImmutableCollections.java`
#### Snippet
```java

        @Override
        public Object computeIfAbsent(Object key, Function<? super Object, ?> mappingFunction) {
            throw uoe();
        }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `computeIfPresent()` overrides synchronized method
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/lifecycle/ImmutableCollections.java`
#### Snippet
```java

        @Override
        public Object computeIfPresent(Object key, BiFunction<? super Object, ? super Object, ?> remappingFunction) {
            throw uoe();
        }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `replace()` overrides synchronized method
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/lifecycle/ImmutableCollections.java`
#### Snippet
```java

        @Override
        public boolean replace(Object key, Object oldValue, Object newValue) {
            throw uoe();
        }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `put()` overrides synchronized method
in `api/maven-api-settings/src/main/java/org/apache/maven/api/settings/ImmutableCollections.java`
#### Snippet
```java

        @Override
        public Object put(Object key, Object value) {
            throw uoe();
        }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `merge()` overrides synchronized method
in `api/maven-api-settings/src/main/java/org/apache/maven/api/settings/ImmutableCollections.java`
#### Snippet
```java

        @Override
        public Object merge(Object key, Object value, BiFunction<? super Object, ? super Object, ?> remappingFunction) {
            throw uoe();
        }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `remove()` overrides synchronized method
in `api/maven-api-settings/src/main/java/org/apache/maven/api/settings/ImmutableCollections.java`
#### Snippet
```java

        @Override
        public boolean remove(Object key, Object value) {
            throw uoe();
        }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `replace()` overrides synchronized method
in `api/maven-api-settings/src/main/java/org/apache/maven/api/settings/ImmutableCollections.java`
#### Snippet
```java

        @Override
        public boolean replace(Object key, Object oldValue, Object newValue) {
            throw uoe();
        }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `computeIfPresent()` overrides synchronized method
in `api/maven-api-settings/src/main/java/org/apache/maven/api/settings/ImmutableCollections.java`
#### Snippet
```java

        @Override
        public Object computeIfPresent(Object key, BiFunction<? super Object, ? super Object, ?> remappingFunction) {
            throw uoe();
        }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `clear()` overrides synchronized method
in `api/maven-api-settings/src/main/java/org/apache/maven/api/settings/ImmutableCollections.java`
#### Snippet
```java

        @Override
        public void clear() {
            throw uoe();
        }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `replaceAll()` overrides synchronized method
in `api/maven-api-settings/src/main/java/org/apache/maven/api/settings/ImmutableCollections.java`
#### Snippet
```java

        @Override
        public void replaceAll(BiFunction<? super Object, ? super Object, ?> function) {
            throw uoe();
        }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `putIfAbsent()` overrides synchronized method
in `api/maven-api-settings/src/main/java/org/apache/maven/api/settings/ImmutableCollections.java`
#### Snippet
```java

        @Override
        public Object putIfAbsent(Object key, Object value) {
            throw uoe();
        }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `putAll()` overrides synchronized method
in `api/maven-api-settings/src/main/java/org/apache/maven/api/settings/ImmutableCollections.java`
#### Snippet
```java

        @Override
        public void putAll(Map<?, ?> t) {
            throw uoe();
        }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `compute()` overrides synchronized method
in `api/maven-api-settings/src/main/java/org/apache/maven/api/settings/ImmutableCollections.java`
#### Snippet
```java

        @Override
        public Object compute(Object key, BiFunction<? super Object, ? super Object, ?> remappingFunction) {
            throw uoe();
        }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `remove()` overrides synchronized method
in `api/maven-api-settings/src/main/java/org/apache/maven/api/settings/ImmutableCollections.java`
#### Snippet
```java

        @Override
        public Object remove(Object key) {
            throw uoe();
        }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `computeIfAbsent()` overrides synchronized method
in `api/maven-api-settings/src/main/java/org/apache/maven/api/settings/ImmutableCollections.java`
#### Snippet
```java

        @Override
        public Object computeIfAbsent(Object key, Function<? super Object, ?> mappingFunction) {
            throw uoe();
        }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `replace()` overrides synchronized method
in `api/maven-api-settings/src/main/java/org/apache/maven/api/settings/ImmutableCollections.java`
#### Snippet
```java

        @Override
        public Object replace(Object key, Object value) {
            throw uoe();
        }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `computeIfPresent()` overrides synchronized method
in `api/maven-api-model/src/main/java/org/apache/maven/api/model/ImmutableCollections.java`
#### Snippet
```java

        @Override
        public Object computeIfPresent(Object key, BiFunction<? super Object, ? super Object, ?> remappingFunction) {
            throw uoe();
        }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `remove()` overrides synchronized method
in `api/maven-api-model/src/main/java/org/apache/maven/api/model/ImmutableCollections.java`
#### Snippet
```java

        @Override
        public boolean remove(Object key, Object value) {
            throw uoe();
        }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `computeIfAbsent()` overrides synchronized method
in `api/maven-api-model/src/main/java/org/apache/maven/api/model/ImmutableCollections.java`
#### Snippet
```java

        @Override
        public Object computeIfAbsent(Object key, Function<? super Object, ?> mappingFunction) {
            throw uoe();
        }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `replace()` overrides synchronized method
in `api/maven-api-model/src/main/java/org/apache/maven/api/model/ImmutableCollections.java`
#### Snippet
```java

        @Override
        public Object replace(Object key, Object value) {
            throw uoe();
        }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `replaceAll()` overrides synchronized method
in `api/maven-api-model/src/main/java/org/apache/maven/api/model/ImmutableCollections.java`
#### Snippet
```java

        @Override
        public void replaceAll(BiFunction<? super Object, ? super Object, ?> function) {
            throw uoe();
        }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `put()` overrides synchronized method
in `api/maven-api-model/src/main/java/org/apache/maven/api/model/ImmutableCollections.java`
#### Snippet
```java

        @Override
        public Object put(Object key, Object value) {
            throw uoe();
        }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `compute()` overrides synchronized method
in `api/maven-api-model/src/main/java/org/apache/maven/api/model/ImmutableCollections.java`
#### Snippet
```java

        @Override
        public Object compute(Object key, BiFunction<? super Object, ? super Object, ?> remappingFunction) {
            throw uoe();
        }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `putIfAbsent()` overrides synchronized method
in `api/maven-api-model/src/main/java/org/apache/maven/api/model/ImmutableCollections.java`
#### Snippet
```java

        @Override
        public Object putIfAbsent(Object key, Object value) {
            throw uoe();
        }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `merge()` overrides synchronized method
in `api/maven-api-model/src/main/java/org/apache/maven/api/model/ImmutableCollections.java`
#### Snippet
```java

        @Override
        public Object merge(Object key, Object value, BiFunction<? super Object, ? super Object, ?> remappingFunction) {
            throw uoe();
        }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `remove()` overrides synchronized method
in `api/maven-api-model/src/main/java/org/apache/maven/api/model/ImmutableCollections.java`
#### Snippet
```java

        @Override
        public Object remove(Object key) {
            throw uoe();
        }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `replace()` overrides synchronized method
in `api/maven-api-model/src/main/java/org/apache/maven/api/model/ImmutableCollections.java`
#### Snippet
```java

        @Override
        public boolean replace(Object key, Object oldValue, Object newValue) {
            throw uoe();
        }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `clear()` overrides synchronized method
in `api/maven-api-model/src/main/java/org/apache/maven/api/model/ImmutableCollections.java`
#### Snippet
```java

        @Override
        public void clear() {
            throw uoe();
        }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `putAll()` overrides synchronized method
in `api/maven-api-model/src/main/java/org/apache/maven/api/model/ImmutableCollections.java`
#### Snippet
```java

        @Override
        public void putAll(Map<?, ?> t) {
            throw uoe();
        }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `keys()` overrides synchronized method
in `maven-model/src/main/java/org/apache/maven/model/WrapperProperties.java`
#### Snippet
```java

    @Override
    public Enumeration<Object> keys() {
        return Collections.enumeration((Set) getter.get().keySet());
    }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `isEmpty()` overrides synchronized method
in `maven-model/src/main/java/org/apache/maven/model/WrapperProperties.java`
#### Snippet
```java

    @Override
    public boolean isEmpty() {
        return getter.get().isEmpty();
    }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `elements()` overrides synchronized method
in `maven-model/src/main/java/org/apache/maven/model/WrapperProperties.java`
#### Snippet
```java

    @Override
    public Enumeration<Object> elements() {
        return Collections.enumeration((Collection) getter.get().values());
    }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `contains()` overrides synchronized method
in `maven-model/src/main/java/org/apache/maven/model/WrapperProperties.java`
#### Snippet
```java

    @Override
    public boolean contains(Object value) {
        return getter.get().containsKey(value != null ? value.toString() : null);
    }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `size()` overrides synchronized method
in `maven-model/src/main/java/org/apache/maven/model/WrapperProperties.java`
#### Snippet
```java

    @Override
    public int size() {
        return getter.get().size();
    }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `getOrDefault()` overrides synchronized method
in `maven-model/src/main/java/org/apache/maven/model/WrapperProperties.java`
#### Snippet
```java

    @Override
    public Object getOrDefault(Object key, Object defaultValue) {
        return getter.get().getOrDefault(key, defaultValue != null ? defaultValue.toString() : null);
    }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `get()` overrides synchronized method
in `maven-model/src/main/java/org/apache/maven/model/WrapperProperties.java`
#### Snippet
```java

    @Override
    public Object get(Object key) {
        return getter.get().get(key);
    }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `containsKey()` overrides synchronized method
in `maven-model/src/main/java/org/apache/maven/model/WrapperProperties.java`
#### Snippet
```java

    @Override
    public boolean containsKey(Object key) {
        return getter.get().containsKey(key);
    }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `merge()` overrides synchronized method
in `api/maven-api-toolchain/src/main/java/org/apache/maven/api/toolchain/ImmutableCollections.java`
#### Snippet
```java

        @Override
        public Object merge(Object key, Object value, BiFunction<? super Object, ? super Object, ?> remappingFunction) {
            throw uoe();
        }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `replace()` overrides synchronized method
in `api/maven-api-toolchain/src/main/java/org/apache/maven/api/toolchain/ImmutableCollections.java`
#### Snippet
```java

        @Override
        public Object replace(Object key, Object value) {
            throw uoe();
        }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `putIfAbsent()` overrides synchronized method
in `api/maven-api-toolchain/src/main/java/org/apache/maven/api/toolchain/ImmutableCollections.java`
#### Snippet
```java

        @Override
        public Object putIfAbsent(Object key, Object value) {
            throw uoe();
        }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `compute()` overrides synchronized method
in `api/maven-api-toolchain/src/main/java/org/apache/maven/api/toolchain/ImmutableCollections.java`
#### Snippet
```java

        @Override
        public Object compute(Object key, BiFunction<? super Object, ? super Object, ?> remappingFunction) {
            throw uoe();
        }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `replaceAll()` overrides synchronized method
in `api/maven-api-toolchain/src/main/java/org/apache/maven/api/toolchain/ImmutableCollections.java`
#### Snippet
```java

        @Override
        public void replaceAll(BiFunction<? super Object, ? super Object, ?> function) {
            throw uoe();
        }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `replace()` overrides synchronized method
in `api/maven-api-toolchain/src/main/java/org/apache/maven/api/toolchain/ImmutableCollections.java`
#### Snippet
```java

        @Override
        public boolean replace(Object key, Object oldValue, Object newValue) {
            throw uoe();
        }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `computeIfAbsent()` overrides synchronized method
in `api/maven-api-toolchain/src/main/java/org/apache/maven/api/toolchain/ImmutableCollections.java`
#### Snippet
```java

        @Override
        public Object computeIfAbsent(Object key, Function<? super Object, ?> mappingFunction) {
            throw uoe();
        }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `remove()` overrides synchronized method
in `api/maven-api-toolchain/src/main/java/org/apache/maven/api/toolchain/ImmutableCollections.java`
#### Snippet
```java

        @Override
        public boolean remove(Object key, Object value) {
            throw uoe();
        }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `remove()` overrides synchronized method
in `api/maven-api-toolchain/src/main/java/org/apache/maven/api/toolchain/ImmutableCollections.java`
#### Snippet
```java

        @Override
        public Object remove(Object key) {
            throw uoe();
        }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `computeIfPresent()` overrides synchronized method
in `api/maven-api-toolchain/src/main/java/org/apache/maven/api/toolchain/ImmutableCollections.java`
#### Snippet
```java

        @Override
        public Object computeIfPresent(Object key, BiFunction<? super Object, ? super Object, ?> remappingFunction) {
            throw uoe();
        }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `putAll()` overrides synchronized method
in `api/maven-api-toolchain/src/main/java/org/apache/maven/api/toolchain/ImmutableCollections.java`
#### Snippet
```java

        @Override
        public void putAll(Map<?, ?> t) {
            throw uoe();
        }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `put()` overrides synchronized method
in `api/maven-api-toolchain/src/main/java/org/apache/maven/api/toolchain/ImmutableCollections.java`
#### Snippet
```java

        @Override
        public Object put(Object key, Object value) {
            throw uoe();
        }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `clear()` overrides synchronized method
in `api/maven-api-toolchain/src/main/java/org/apache/maven/api/toolchain/ImmutableCollections.java`
#### Snippet
```java

        @Override
        public void clear() {
            throw uoe();
        }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `size()` overrides synchronized method
in `maven-toolchain-model/src/main/java/org/apache/maven/toolchain/model/WrapperProperties.java`
#### Snippet
```java

    @Override
    public int size() {
        return getter.get().size();
    }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `keys()` overrides synchronized method
in `maven-toolchain-model/src/main/java/org/apache/maven/toolchain/model/WrapperProperties.java`
#### Snippet
```java

    @Override
    public Enumeration<Object> keys() {
        return Collections.enumeration((Set) getter.get().keySet());
    }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `contains()` overrides synchronized method
in `maven-toolchain-model/src/main/java/org/apache/maven/toolchain/model/WrapperProperties.java`
#### Snippet
```java

    @Override
    public boolean contains(Object value) {
        return getter.get().containsKey(value != null ? value.toString() : null);
    }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `getOrDefault()` overrides synchronized method
in `maven-toolchain-model/src/main/java/org/apache/maven/toolchain/model/WrapperProperties.java`
#### Snippet
```java

    @Override
    public Object getOrDefault(Object key, Object defaultValue) {
        return getter.get().getOrDefault(key, defaultValue != null ? defaultValue.toString() : null);
    }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `containsKey()` overrides synchronized method
in `maven-toolchain-model/src/main/java/org/apache/maven/toolchain/model/WrapperProperties.java`
#### Snippet
```java

    @Override
    public boolean containsKey(Object key) {
        return getter.get().containsKey(key);
    }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `get()` overrides synchronized method
in `maven-toolchain-model/src/main/java/org/apache/maven/toolchain/model/WrapperProperties.java`
#### Snippet
```java

    @Override
    public Object get(Object key) {
        return getter.get().get(key);
    }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `elements()` overrides synchronized method
in `maven-toolchain-model/src/main/java/org/apache/maven/toolchain/model/WrapperProperties.java`
#### Snippet
```java

    @Override
    public Enumeration<Object> elements() {
        return Collections.enumeration((Collection) getter.get().values());
    }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `isEmpty()` overrides synchronized method
in `maven-toolchain-model/src/main/java/org/apache/maven/toolchain/model/WrapperProperties.java`
#### Snippet
```java

    @Override
    public boolean isEmpty() {
        return getter.get().isEmpty();
    }
```

## RuleId[ruleID=RedundantCollectionOperation]
### RedundantCollectionOperation
Unnecessary 'contains()' check
in `maven-compat/src/main/java/org/apache/maven/repository/metadata/MetadataGraph.java`
#### Snippet
```java

        MetadataGraphVertex vertex = new MetadataGraphVertex(node.md, versionedVertices, scopedVertices);
        if (!vertices.contains(vertex)) {
            vertices.add(vertex);
        }
```

### RedundantCollectionOperation
Unnecessary 'contains()' check
in `maven-core/src/main/java/org/apache/maven/lifecycle/MavenExecutionPlan.java`
#### Snippet
```java
        for (ExecutionPlanItem executionPlanItem : planItems) {
            final String phase = executionPlanItem.getLifecyclePhase();
            if (!result.contains(phase)) {
                result.add(phase);
            }
```

## RuleId[ruleID=NonSerializableFieldInSerializableClass]
### NonSerializableFieldInSerializableClass
Non-serializable field 'validationResult' in a Serializable class
in `maven-compat/src/main/java/org/apache/maven/project/InvalidProjectModelException.java`
#### Snippet
```java
@Deprecated
public class InvalidProjectModelException extends ProjectBuildingException {
    private ModelValidationResult validationResult;

    public InvalidProjectModelException(String projectId, String message, File pomLocation) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'snapshots' in a Serializable class
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/DefaultArtifactRepository.java`
#### Snippet
```java
    private ArtifactRepositoryLayout layout;

    private ArtifactRepositoryPolicy snapshots;

    private ArtifactRepositoryPolicy releases;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'proxy' in a Serializable class
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/DefaultArtifactRepository.java`
#### Snippet
```java
    private Authentication authentication;

    private Proxy proxy;

    private List<ArtifactRepository> mirroredRepositories = Collections.emptyList();
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'authentication' in a Serializable class
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/DefaultArtifactRepository.java`
#### Snippet
```java
    private boolean blacklisted;

    private Authentication authentication;

    private Proxy proxy;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'releases' in a Serializable class
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/DefaultArtifactRepository.java`
#### Snippet
```java
    private ArtifactRepositoryPolicy snapshots;

    private ArtifactRepositoryPolicy releases;

    private boolean blacklisted;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'artifact' in a Serializable class
in `maven-compat/src/main/java/org/apache/maven/repository/metadata/MetadataRetrievalException.java`
#### Snippet
```java
public class MetadataRetrievalException extends Exception {

    private ArtifactMetadata artifact;

    public MetadataRetrievalException(String message) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'source' in a Serializable class
in `api/maven-api-core/src/main/java/org/apache/maven/api/plugin/MojoException.java`
#### Snippet
```java
public class MojoException extends MavenException {

    protected Object source;

    protected String longMessage;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'location' in a Serializable class
in `maven-xml-impl/src/main/java/org/apache/maven/internal/xml/Xpp3Dom.java`
#### Snippet
```java
    protected final List<Dom> children;

    protected final Object location;

    public Xpp3Dom(String name) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'pluginDescriptor' in a Serializable class
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/MojoNotFoundException.java`
#### Snippet
```java
    private String goal;

    private PluginDescriptor pluginDescriptor;

    public MojoNotFoundException(String goal, PluginDescriptor pluginDescriptor) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'source' in a Serializable class
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/AbstractMojoExecutionException.java`
#### Snippet
```java
 */
public abstract class AbstractMojoExecutionException extends Exception {
    protected Object source;

    protected String longMessage;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'elements' in a Serializable class
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/lifecycle/ImmutableCollections.java`
#### Snippet
```java

    private static class ListN<E> extends AbstractImmutableList<E> {
        private final Object[] elements;

        private ListN(Collection<E> elements) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'entries' in a Serializable class
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/lifecycle/ImmutableCollections.java`
#### Snippet
```java

    private static class MapN<K, V> extends AbstractImmutableMap<K, V> {
        private final Object[] entries;

        private MapN(Map<K, V> map) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'elements' in a Serializable class
in `api/maven-api-settings/src/main/java/org/apache/maven/api/settings/ImmutableCollections.java`
#### Snippet
```java

    private static class ListN<E> extends AbstractImmutableList<E> {
        private final Object[] elements;

        private ListN(Collection<E> elements) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'entries' in a Serializable class
in `api/maven-api-settings/src/main/java/org/apache/maven/api/settings/ImmutableCollections.java`
#### Snippet
```java

    private static class MapN<K, V> extends AbstractImmutableMap<K, V> {
        private final Object[] entries;

        private MapN(Map<K, V> map) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'elements' in a Serializable class
in `api/maven-api-model/src/main/java/org/apache/maven/api/model/ImmutableCollections.java`
#### Snippet
```java

    private static class ListN<E> extends AbstractImmutableList<E> {
        private final Object[] elements;

        private ListN(Collection<E> elements) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'entries' in a Serializable class
in `api/maven-api-model/src/main/java/org/apache/maven/api/model/ImmutableCollections.java`
#### Snippet
```java

    private static class MapN<K, V> extends AbstractImmutableMap<K, V> {
        private final Object[] entries;

        private MapN(Map<K, V> map) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'pluginRealm' in a Serializable class
in `maven-core/src/main/java/org/apache/maven/plugin/PluginContainerException.java`
#### Snippet
```java
public class PluginContainerException extends PluginManagerException {

    private ClassRealm pluginRealm;

    public PluginContainerException(
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'project' in a Serializable class
in `maven-core/src/main/java/org/apache/maven/plugin/PluginManagerException.java`
#### Snippet
```java
    private String goal;

    private MavenProject project;

    protected PluginManagerException(Plugin plugin, String message, MavenProject project, Throwable cause) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'pluginDescriptor' in a Serializable class
in `maven-core/src/main/java/org/apache/maven/plugin/PluginConfigurationException.java`
#### Snippet
```java
 */
public class PluginConfigurationException extends Exception {
    private PluginDescriptor pluginDescriptor;

    private String originalMessage;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'mojoExecution' in a Serializable class
in `maven-core/src/main/java/org/apache/maven/plugin/PluginExecutionException.java`
#### Snippet
```java
public class PluginExecutionException extends PluginManagerException {

    private final MojoExecution mojoExecution;

    public PluginExecutionException(MojoExecution mojoExecution, MavenProject project, String message) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'mojo' in a Serializable class
in `maven-core/src/main/java/org/apache/maven/plugin/PluginParameterException.java`
#### Snippet
```java
    private final List<Parameter> parameters;

    private final MojoDescriptor mojo;

    public PluginParameterException(MojoDescriptor mojo, List<Parameter> parameters) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'project' in a Serializable class
in `maven-core/src/main/java/org/apache/maven/project/DuplicateArtifactAttachmentException.java`
#### Snippet
```java
    private Artifact artifact;

    private final MavenProject project;

    public DuplicateArtifactAttachmentException(MavenProject project, Artifact artifact) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'project' in a Serializable class
in `maven-core/src/main/java/org/apache/maven/lifecycle/LifecycleExecutionException.java`
#### Snippet
```java
 */
public class LifecycleExecutionException extends Exception {
    private MavenProject project;

    public LifecycleExecutionException(String message) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'delegate' in a Serializable class
in `maven-model/src/main/java/org/apache/maven/model/BaseObject.java`
#### Snippet
```java
    protected transient ChildrenTracking childrenTracking;

    protected Object delegate;

    public BaseObject() {}
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'entries' in a Serializable class
in `api/maven-api-toolchain/src/main/java/org/apache/maven/api/toolchain/ImmutableCollections.java`
#### Snippet
```java

    private static class MapN<K, V> extends AbstractImmutableMap<K, V> {
        private final Object[] entries;

        private MapN(Map<K, V> map) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'elements' in a Serializable class
in `api/maven-api-toolchain/src/main/java/org/apache/maven/api/toolchain/ImmutableCollections.java`
#### Snippet
```java

    private static class ListN<E> extends AbstractImmutableList<E> {
        private final Object[] elements;

        private ListN(Collection<E> elements) {
```

## RuleId[ruleID=MismatchedJavadocCode]
### MismatchedJavadocCode
Method is specified to return 'true' but its return type is not boolean
in `maven-core/src/main/java/org/apache/maven/ReactorReader.java`
#### Snippet
```java
     *
     * @param requestArtifact checked against the given artifact.
     * @return true if equals, false otherwise.
     */
    private Predicate<Artifact> isRequestedArtifact(Artifact requestArtifact) {
```

## RuleId[ruleID=CollectionContainsUrl]
### CollectionContainsUrl
Map `supported` may contain URL objects
in `maven-embedder/src/main/java/org/apache/maven/cli/logging/Slf4jConfigurationFactory.java`
#### Snippet
```java

    public static Slf4jConfiguration getConfiguration(ILoggerFactory loggerFactory) {
        Map<URL, Set<Object>> supported = new LinkedHashMap<>();

        String slf4jBinding = loggerFactory.getClass().getCanonicalName();
```

### CollectionContainsUrl
Map `supported` may contain URL objects
in `maven-embedder/src/main/java/org/apache/maven/cli/logging/impl/UnsupportedSlf4jBindingConfiguration.java`
#### Snippet
```java
    private String slf4jBinding;

    private Map<URL, Set<Object>> supported;

    public UnsupportedSlf4jBindingConfiguration(String slf4jBinding, Map<URL, Set<Object>> supported) {
```

### CollectionContainsUrl
Map `supported` may contain URL objects
in `maven-embedder/src/main/java/org/apache/maven/cli/logging/impl/UnsupportedSlf4jBindingConfiguration.java`
#### Snippet
```java
    private Map<URL, Set<Object>> supported;

    public UnsupportedSlf4jBindingConfiguration(String slf4jBinding, Map<URL, Set<Object>> supported) {
        this.slf4jBinding = slf4jBinding;
        this.supported = supported;
```

## RuleId[ruleID=ProtectedMemberInFinalClass]
### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `maven-core/src/main/java/org/apache/maven/lifecycle/providers/CleanLifecycleProvider.java`
#### Snippet
```java
@Singleton
public final class CleanLifecycleProvider extends AbstractLifecycleProvider {
    protected static final String LIFECYCLE_ID = "clean";

    // START SNIPPET: clean
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `maven-core/src/main/java/org/apache/maven/lifecycle/providers/SiteLifecycleProvider.java`
#### Snippet
```java
@Singleton
public final class SiteLifecycleProvider extends AbstractLifecycleProvider {
    protected static final String LIFECYCLE_ID = "site";

    // START SNIPPET: site
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `maven-core/src/main/java/org/apache/maven/lifecycle/providers/WrapperLifecycleProvider.java`
#### Snippet
```java
@Singleton
public final class WrapperLifecycleProvider extends AbstractLifecycleProvider {
    protected static final String LIFECYCLE_ID = "wrapper";

    // START SNIPPET: wrapper
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `maven-core/src/main/java/org/apache/maven/lifecycle/providers/DefaultLifecycleProvider.java`
#### Snippet
```java
@Singleton
public final class DefaultLifecycleProvider extends AbstractLifecycleProvider {
    protected static final String LIFECYCLE_ID = "default";

    // START SNIPPET: default
```

## RuleId[ruleID=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/DefaultUpdateCheckManager.java`
#### Snippet
```java
                        .debug(
                                "Failed to record lastUpdated information for resolution.\nFile: "
                                        + touchfile.toString() + "; key: " + key,
                                e);
            } finally {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `maven-embedder/src/main/java/org/apache/maven/cli/transfer/AbstractMavenTransferListener.java`
#### Snippet
```java

        message.append(')');
        out.println(message.toString());
    }
}
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `maven-embedder/src/main/java/org/apache/maven/cli/transfer/AbstractMavenTransferListener.java`
#### Snippet
```java
        message.append(resource.getRepositoryUrl()).append(resource.getResourceName());

        out.println(message.toString());
    }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `maven-artifact/src/main/java/org/apache/maven/artifact/versioning/ComparableVersion.java`
#### Snippet
```java
            if (prev != null) {
                int compare = prev.compareTo(c);
                System.out.println("   " + prev.toString() + ' ' + ((compare == 0) ? "==" : ((compare < 0) ? "<" : ">"))
                        + ' ' + version);
            }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/logging/SystemStreamLog.java`
#### Snippet
```java

        System.err.println(
                "[error] " + content.toString() + System.lineSeparator() + System.lineSeparator() + sWriter.toString());
    }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/logging/SystemStreamLog.java`
#### Snippet
```java
        error.printStackTrace(pWriter);

        System.out.println("[" + prefix + "] " + sWriter.toString());
    }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/logging/SystemStreamLog.java`
#### Snippet
```java

        System.out.println("[" + prefix + "] " + content.toString() + System.lineSeparator() + System.lineSeparator()
                + sWriter.toString());
    }
}
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/logging/SystemStreamLog.java`
#### Snippet
```java
        error.printStackTrace(pWriter);

        System.err.println("[error] " + sWriter.toString());
    }

```

## RuleId[ruleID=SetReplaceableByEnumSet]
### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `api/maven-api-core/src/main/java/org/apache/maven/api/ResolutionScope.java`
#### Snippet
```java
    ResolutionScope(String id, Scope... scopes) {
        this.id = id;
        this.scopes = Collections.unmodifiableSet(new HashSet<>(Arrays.asList(scopes)));
    }

```

## RuleId[ruleID=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `ClasspathGraphVisitor` may be 'static'
in `maven-compat/src/main/java/org/apache/maven/repository/metadata/DefaultClasspathTransformation.java`
#### Snippet
```java
     * and yet use class level data to lessen stack usage in recursion
     */
    private class ClasspathGraphVisitor {
        MetadataGraph graph;

```

### InnerClassMayBeStatic
Inner class `CacheRecord` may be 'static'
in `maven-core/src/main/java/org/apache/maven/project/artifact/DefaultMavenMetadataCache.java`
#### Snippet
```java
     * CacheRecord
     */
    public class CacheRecord {
        private Artifact pomArtifact;
        private Artifact relocatedArtifact;
```

## RuleId[ruleID=StringEqualsEmptyString]
### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `maven-embedder/src/main/java/org/apache/maven/cli/MavenCli.java`
#### Snippet
```java

            // effective line, with indent and reset if end is colored
            line = indent + line + ("".equals(nextColor) ? "" : ANSI_RESET);

            if ((i == lines.length - 1) && (showErrors || (summary.getException() instanceof InternalErrorException))) {
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `maven-artifact/src/main/java/org/apache/maven/artifact/resolver/AbstractArtifactResolutionException.java`
#### Snippet
```java

            // insert classifier only if it was used in the artifact
            if (classifier != null && !classifier.equals("")) {
                sb.append(" -Dclassifier=");
                sb.append(classifier);
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `maven-artifact/src/main/java/org/apache/maven/artifact/resolver/AbstractArtifactResolutionException.java`
#### Snippet
```java

            // insert classifier only if it was used in the artifact
            if (classifier != null && !classifier.equals("")) {
                sb.append(" -Dclassifier=");
                sb.append(classifier);
```

## RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
### PublicFieldAccessedInSynchronizedContext
Non-private field `out` accessed in synchronized context
in `maven-embedder/src/main/java/org/apache/maven/cli/transfer/ConsoleMavenTransferListener.java`
#### Snippet
```java
        pad(buffer, pad);
        buffer.append('\r');
        out.print(buffer);
        out.flush();
    }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `out` accessed in synchronized context
in `maven-embedder/src/main/java/org/apache/maven/cli/transfer/ConsoleMavenTransferListener.java`
#### Snippet
```java
        buffer.append('\r');
        out.print(buffer);
        out.flush();
    }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `excludedArtifacts` accessed in synchronized context
in `maven-core/src/main/java/org/apache/maven/DefaultArtifactFilterManager.java`
#### Snippet
```java

    private synchronized Set<String> getExcludedArtifacts() {
        if (excludedArtifacts == null) {
            excludedArtifacts = new LinkedHashSet<>(coreArtifacts);
        }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `excludedArtifacts` accessed in synchronized context
in `maven-core/src/main/java/org/apache/maven/DefaultArtifactFilterManager.java`
#### Snippet
```java
    private synchronized Set<String> getExcludedArtifacts() {
        if (excludedArtifacts == null) {
            excludedArtifacts = new LinkedHashSet<>(coreArtifacts);
        }
        return excludedArtifacts;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `excludedArtifacts` accessed in synchronized context
in `maven-core/src/main/java/org/apache/maven/DefaultArtifactFilterManager.java`
#### Snippet
```java
            excludedArtifacts = new LinkedHashSet<>(coreArtifacts);
        }
        return excludedArtifacts;
    }

```

## RuleId[ruleID=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `maven-embedder/src/main/java/org/eclipse/sisu/plexus/PlexusXmlBeanConverter.java`
#### Snippet
```java

    @SuppressWarnings({"unchecked", "rawtypes"})
    public Object convert(final TypeLiteral role, final String value) {
        if (value.trim().startsWith("<")) {
            try {
```

## RuleId[ruleID=SynchronizeOnNonFinalField]
### SynchronizeOnNonFinalField
Synchronization on a non-final field `transfers`
in `maven-embedder/src/main/java/org/apache/maven/cli/transfer/ConsoleMavenTransferListener.java`
#### Snippet
```java
        buffer.append("Progress (").append(transfers.size()).append("): ");

        synchronized (transfers) {
            Iterator<Map.Entry<TransferResource, Long>> entries =
                    transfers.entrySet().iterator();
```

## RuleId[ruleID=EqualsHashCodeCalledOnUrl]
### EqualsHashCodeCalledOnUrl
Call to `equals()` on URL object
in `maven-builder-support/src/main/java/org/apache/maven/building/UrlSource.java`
#### Snippet
```java

        UrlSource other = (UrlSource) obj;
        return this.url.equals(other.url);
    }
}
```

## RuleId[ruleID=NonStrictComparisonCanBeEquality]
### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `maven-compat/src/main/java/org/apache/maven/project/path/DefaultPathTranslator.java`
#### Snippet
```java
        }

        if (path.length() <= 0) {
            path = ".";
        }
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `maven-model-builder/src/main/java/org/apache/maven/model/profile/activation/JdkVersionProfileActivator.java`
#### Snippet
```java
            } else if (token.endsWith(")")) {
                ranges.add(new RangeValue(token.replace(")", ""), false));
            } else if (token.length() <= 0) {
                ranges.add(new RangeValue("", false));
            }
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `maven-model-builder/src/main/java/org/apache/maven/model/profile/activation/JdkVersionProfileActivator.java`
#### Snippet
```java

    private static int getRelationOrder(String value, RangeValue rangeValue, boolean isLeft) {
        if (rangeValue.value.length() <= 0) {
            return isLeft ? 1 : -1;
        }
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `maven-model-builder/src/main/java/org/apache/maven/model/profile/activation/JdkVersionProfileActivator.java`
#### Snippet
```java
        String version = context.getSystemProperties().get("java.version");

        if (version == null || version.length() <= 0) {
            problems.add(new ModelProblemCollectorRequest(Severity.ERROR, Version.BASE)
                    .setMessage("Failed to determine Java version for profile " + profile.getId())
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `maven-model-builder/src/main/java/org/apache/maven/model/profile/activation/PropertyProfileActivator.java`
#### Snippet
```java
        }

        if (name == null || name.length() <= 0) {
            problems.add(new ModelProblemCollectorRequest(Severity.ERROR, Version.BASE)
                    .setMessage("The property name is required to activate the profile " + profile.getId())
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `maven-model-builder/src/main/java/org/apache/maven/model/building/DefaultModelBuilder.java`
#### Snippet
```java
        String version = dependency.getVersion();

        if (groupId == null || groupId.length() <= 0) {
            problems.add(new ModelProblemCollectorRequest(Severity.ERROR, Version.BASE)
                    .setMessage("'dependencyManagement.dependencies.dependency.groupId' for "
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `maven-model-builder/src/main/java/org/apache/maven/model/building/DefaultModelBuilder.java`
#### Snippet
```java
            return null;
        }
        if (artifactId == null || artifactId.length() <= 0) {
            problems.add(new ModelProblemCollectorRequest(Severity.ERROR, Version.BASE)
                    .setMessage("'dependencyManagement.dependencies.dependency.artifactId' for "
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `maven-model-builder/src/main/java/org/apache/maven/model/building/DefaultModelBuilder.java`
#### Snippet
```java
            return null;
        }
        if (version == null || version.length() <= 0) {
            problems.add(new ModelProblemCollectorRequest(Severity.ERROR, Version.BASE)
                    .setMessage("'dependencyManagement.dependencies.dependency.version' for "
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `maven-model-builder/src/main/java/org/apache/maven/model/building/DefaultModelBuilder.java`
#### Snippet
```java
        String parentPath = childModel.getParent().getRelativePath();

        if (parentPath == null || parentPath.length() <= 0) {
            return null;
        }
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `maven-model-builder/src/main/java/org/apache/maven/model/building/DefaultModelBuilder.java`
#### Snippet
```java
        } catch (IOException e) {
            String msg = e.getMessage();
            if (msg == null || msg.length() <= 0) {
                // NOTE: There's java.nio.charset.MalformedInputException and sun.io.MalformedInputException
                if (e.getClass().getName().endsWith("MalformedInputException")) {
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `maven-model-builder/src/main/java/org/apache/maven/model/validation/DefaultModelValidator.java`
#### Snippet
```java
    private boolean validateModelVersion(
            ModelProblemCollector problems, String string, InputLocationTracker tracker, String... validVersions) {
        if (string == null || string.length() <= 0) {
            return true;
        }
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `maven-model-builder/src/main/java/org/apache/maven/model/validation/DefaultModelValidator.java`
#### Snippet
```java
            String sourceHint,
            InputLocationTracker tracker) {
        if (string == null || string.length() <= 0) {
            return true;
        }
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `maven-model-builder/src/main/java/org/apache/maven/model/validation/DefaultModelValidator.java`
#### Snippet
```java
            String sourceHint,
            InputLocationTracker tracker) {
        if (string == null || string.length() <= 0) {
            return true;
        }
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `maven-model-builder/src/main/java/org/apache/maven/model/validation/DefaultModelValidator.java`
#### Snippet
```java
        }

        if (string.length() <= 0 || "RELEASE".equals(string) || "LATEST".equals(string)) {
            addViolation(
                    problems,
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `maven-model-builder/src/main/java/org/apache/maven/model/validation/DefaultModelValidator.java`
#### Snippet
```java
            String sourceHint,
            InputLocationTracker tracker) {
        if (string == null || string.length() <= 0) {
            return true;
        }
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `maven-model-builder/src/main/java/org/apache/maven/model/validation/DefaultModelValidator.java`
#### Snippet
```java
            InputLocationTracker tracker,
            String... validValues) {
        if (string == null || string.length() <= 0) {
            return true;
        }
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `maven-settings-builder/src/main/java/org/apache/maven/settings/io/DefaultSettingsWriter.java`
#### Snippet
```java
        String encoding = settings.getModelEncoding();
        // TODO Use StringUtils here
        if (encoding == null || encoding.length() <= 0) {
            encoding = "UTF-8";
        }
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `maven-model-builder/src/main/java/org/apache/maven/model/io/DefaultModelWriter.java`
#### Snippet
```java
        String encoding = model.getModelEncoding();
        // TODO Use StringUtils here
        if (encoding == null || encoding.length() <= 0) {
            encoding = "UTF-8";
        }
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `maven-resolver-provider/src/main/java/org/apache/maven/repository/internal/RelocatedArtifact.java`
#### Snippet
```java
    public Artifact setVersion(String version) {
        String current = getVersion();
        if (current.equals(version) || (version == null && current.length() <= 0)) {
            return this;
        }
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `maven-core/src/main/java/org/apache/maven/RepositoryUtils.java`
#### Snippet
```java

    private static String nullify(String string) {
        return (string == null || string.length() <= 0) ? null : string;
    }

```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `maven-core/src/main/java/org/apache/maven/artifact/repository/LegacyLocalRepositoryManager.java`
#### Snippet
```java

        private String nullify(String str) {
            return (str == null || str.length() <= 0) ? null : str;
        }

```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `maven-core/src/main/java/org/apache/maven/artifact/repository/LegacyLocalRepositoryManager.java`
#### Snippet
```java

        public boolean storedInGroupDirectory() {
            return metadata.getArtifactId().length() <= 0;
        }

```

## RuleId[ruleID=SystemOutErr]
### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `maven-embedder/src/main/java/org/apache/maven/cli/CLIReportingUtils.java`
#### Snippet
```java
            }
        } catch (IOException e) {
            System.err.println("Unable determine version from JAR file: " + e.getMessage());
        }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `maven-embedder/src/main/java/org/apache/maven/cli/logging/Slf4jStdoutLogger.java`
#### Snippet
```java
    private static final String ERROR = "[ERROR] ";

    private PrintStream out = System.out;

    //
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `maven-embedder/src/main/java/org/apache/maven/cli/MavenCli.java`
#### Snippet
```java
    private void version(CliRequest cliRequest) {
        if (cliRequest.verbose || cliRequest.commandLine.hasOption(CLIManager.SHOW_VERSION)) {
            System.out.println(CLIReportingUtils.showVersion());
        }
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `maven-embedder/src/main/java/org/apache/maven/cli/MavenCli.java`
#### Snippet
```java
            DefaultPlexusCipher cipher = new DefaultPlexusCipher();

            System.out.println(cipher.encryptAndDecorate(passwd, DefaultSecDispatcher.SYSTEM_PROPERTY_SEC_LOCATION));

            throw new ExitException(0);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `maven-embedder/src/main/java/org/apache/maven/cli/MavenCli.java`
#### Snippet
```java
            DefaultPlexusCipher cipher = new DefaultPlexusCipher();
            String masterPasswd = cipher.decryptDecorated(master, DefaultSecDispatcher.SYSTEM_PROPERTY_SEC_LOCATION);
            System.out.println(cipher.encryptAndDecorate(passwd, masterPasswd));

            throw new ExitException(0);
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `maven-embedder/src/main/java/org/apache/maven/cli/MavenCli.java`
#### Snippet
```java
            String basedirProperty = System.getProperty(MULTIMODULE_PROJECT_DIRECTORY);
            if (basedirProperty == null) {
                System.err.format("-D%s system property is not set.", MULTIMODULE_PROJECT_DIRECTORY);
                throw new ExitException(1);
            }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `maven-embedder/src/main/java/org/apache/maven/cli/MavenCli.java`
#### Snippet
```java
    private void informativeCommands(CliRequest cliRequest) throws ExitException {
        if (cliRequest.commandLine.hasOption(CLIManager.HELP)) {
            cliManager.displayHelp(System.out);
            throw new ExitException(0);
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `maven-embedder/src/main/java/org/apache/maven/cli/MavenCli.java`
#### Snippet
```java
        if (cliRequest.commandLine.hasOption(CLIManager.VERSION)) {
            if (cliRequest.commandLine.hasOption(CLIManager.QUIET)) {
                System.out.println(CLIReportingUtils.showVersionMinimal());
            } else {
                System.out.println(CLIReportingUtils.showVersion());
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `maven-embedder/src/main/java/org/apache/maven/cli/MavenCli.java`
#### Snippet
```java
                System.out.println(CLIReportingUtils.showVersionMinimal());
            } else {
                System.out.println(CLIReportingUtils.showVersion());
            }
            throw new ExitException(0);
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `maven-embedder/src/main/java/org/apache/maven/cli/MavenCli.java`
#### Snippet
```java
            }
        } catch (ParseException e) {
            System.err.println("Unable to parse maven.config: " + e.getMessage());
            cliManager.displayHelp(System.out);
            throw e;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `maven-embedder/src/main/java/org/apache/maven/cli/MavenCli.java`
#### Snippet
```java
        } catch (ParseException e) {
            System.err.println("Unable to parse maven.config: " + e.getMessage());
            cliManager.displayHelp(System.out);
            throw e;
        }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `maven-embedder/src/main/java/org/apache/maven/cli/MavenCli.java`
#### Snippet
```java
            }
        } catch (ParseException e) {
            System.err.println("Unable to parse command line options: " + e.getMessage());
            cliManager.displayHelp(System.out);
            throw e;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `maven-embedder/src/main/java/org/apache/maven/cli/MavenCli.java`
#### Snippet
```java
        } catch (ParseException e) {
            System.err.println("Unable to parse command line options: " + e.getMessage());
            cliManager.displayHelp(System.out);
            throw e;
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `maven-embedder/src/main/java/org/apache/maven/cli/MavenCli.java`
#### Snippet
```java

    protected TransferListener getConsoleTransferListener(boolean printResourceNames) {
        return new ConsoleMavenTransferListener(System.out, printResourceNames);
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `maven-embedder/src/main/java/org/apache/maven/cli/MavenCli.java`
#### Snippet
```java
     */
    public int doMain(String[] args, String workingDirectory, PrintStream stdout, PrintStream stderr) {
        PrintStream oldout = System.out;
        PrintStream olderr = System.err;

```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `maven-embedder/src/main/java/org/apache/maven/cli/MavenCli.java`
#### Snippet
```java
    public int doMain(String[] args, String workingDirectory, PrintStream stdout, PrintStream stderr) {
        PrintStream oldout = System.out;
        PrintStream olderr = System.err;

        final Set<String> realms;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `maven-artifact/src/main/java/org/apache/maven/artifact/versioning/ComparableVersion.java`
#### Snippet
```java
    // CHECKSTYLE_ON: LineLength
    public static void main(String... args) {
        System.out.println("Display parameters as parsed by Maven (in canonical form and as a list of tokens) and"
                + " comparison result:");
        if (args.length == 0) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `maven-artifact/src/main/java/org/apache/maven/artifact/versioning/ComparableVersion.java`
#### Snippet
```java
            if (prev != null) {
                int compare = prev.compareTo(c);
                System.out.println("   " + prev.toString() + ' ' + ((compare == 0) ? "==" : ((compare < 0) ? "<" : ">"))
                        + ' ' + version);
            }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `maven-artifact/src/main/java/org/apache/maven/artifact/versioning/ComparableVersion.java`
#### Snippet
```java
            }

            System.out.println(
                    (i++) + ". " + version + " -> " + c.getCanonical() + "; tokens: " + c.items.toListString());

```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/logging/SystemStreamLog.java`
#### Snippet
```java
        error.printStackTrace(pWriter);

        System.err.println(
                "[error] " + content.toString() + System.lineSeparator() + System.lineSeparator() + sWriter.toString());
    }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/logging/SystemStreamLog.java`
#### Snippet
```java
     */
    public void error(CharSequence content) {
        System.err.println("[error] " + content.toString());
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/logging/SystemStreamLog.java`
#### Snippet
```java
        error.printStackTrace(pWriter);

        System.out.println("[" + prefix + "] " + sWriter.toString());
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/logging/SystemStreamLog.java`
#### Snippet
```java
        error.printStackTrace(pWriter);

        System.out.println("[" + prefix + "] " + content.toString() + System.lineSeparator() + System.lineSeparator()
                + sWriter.toString());
    }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/logging/SystemStreamLog.java`
#### Snippet
```java
        error.printStackTrace(pWriter);

        System.err.println("[error] " + sWriter.toString());
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/logging/SystemStreamLog.java`
#### Snippet
```java

    private void print(String prefix, CharSequence content) {
        System.out.println("[" + prefix + "] " + content.toString());
    }

```

## RuleId[ruleID=MissingDeprecatedAnnotation]
### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `maven-compat/src/main/java/org/apache/maven/project/InvalidProjectModelException.java`
#### Snippet
```java
     * @deprecated use {@link File} constructor for pomLocation
     */
    public InvalidProjectModelException(String projectId, String pomLocation, String message) {
        this(projectId, message, new File(pomLocation));
    }
```

### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `maven-compat/src/main/java/org/apache/maven/project/InvalidProjectModelException.java`
#### Snippet
```java
     * @deprecated use {@link File} constructor for pomLocation
     */
    public InvalidProjectModelException(
            String projectId, String pomLocation, String message, ModelValidationResult validationResult) {
        this(projectId, message, new File(pomLocation), validationResult);
```

### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `maven-compat/src/main/java/org/apache/maven/project/interpolation/ModelInterpolator.java`
#### Snippet
```java
     * @deprecated Use {@link ModelInterpolator#interpolate(Model, File, ProjectBuilderConfiguration, boolean)} instead.
     */
    Model interpolate(Model model, Map<String, ?> context, boolean strict) throws ModelInterpolationException;

    Model interpolate(Model model, File projectDir, ProjectBuilderConfiguration config, boolean debugEnabled)
```

### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `maven-compat/src/main/java/org/apache/maven/project/interpolation/ModelInterpolator.java`
#### Snippet
```java
     * @deprecated Use {@link ModelInterpolator#interpolate(Model, File, ProjectBuilderConfiguration, boolean)} instead.
     */
    Model interpolate(Model project, Map<String, ?> context) throws ModelInterpolationException;

    /**
```

### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `maven-compat/src/main/java/org/apache/maven/project/interpolation/AbstractStringBasedModelInterpolator.java`
#### Snippet
```java
     * @deprecated Use {@link ModelInterpolator#interpolate(Model, File, ProjectBuilderConfiguration, boolean)} instead.
     */
    public Model interpolate(Model model, Map<String, ?> context, boolean strict) throws ModelInterpolationException {
        Properties props = new Properties();
        props.putAll(context);
```

### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `maven-compat/src/main/java/org/apache/maven/profiles/DefaultProfileManager.java`
#### Snippet
```java
     *             correctly in embedded environments.
     */
    public DefaultProfileManager(PlexusContainer container) {
        this(container, null);
    }
```

### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `maven-core/src/main/java/org/apache/maven/ArtifactFilterManager.java`
#### Snippet
```java
     *             extensions.
     */
    void excludeArtifact(String artifactId);

    Set<String> getCoreArtifactExcludes();
```

### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `maven-core/src/main/java/org/apache/maven/ArtifactFilterManager.java`
#### Snippet
```java
     *             extensions.
     */
    ArtifactFilter getArtifactFilter();

    /**
```

### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `maven-core/src/main/java/org/apache/maven/ArtifactFilterManagerDelegate.java`
#### Snippet
```java
 * @deprecated use {@code META-INF/maven/extension.xml} to define artifacts exported by Maven core extensions.
 */
public interface ArtifactFilterManagerDelegate {

    void addExcludes(Set<String> excludes);
```

### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `maven-core/src/main/java/org/apache/maven/project/DuplicateProjectException.java`
#### Snippet
```java
     * @deprecated use {@link #DuplicateProjectException(String, File, File, String)}
     */
    public DuplicateProjectException(String message) {
        this(null, null, null, message);
    }
```

### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `maven-core/src/main/java/org/apache/maven/project/DuplicateProjectException.java`
#### Snippet
```java
     * @deprecated use {@link #DuplicateProjectException(String, File, File, String)}
     */
    public DuplicateProjectException(String message, Exception e) {
        super(message, e);
        this.projectId = null;
```

### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `maven-core/src/main/java/org/apache/maven/project/ProjectBuildingException.java`
#### Snippet
```java
     * @deprecated use {@link #getPomFile()}
     */
    public String getPomLocation() {
        if (getPomFile() != null) {
            return getPomFile().getAbsolutePath();
```

### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `maven-core/src/main/java/org/apache/maven/project/MavenProject.java`
#### Snippet
```java
     * @throws DuplicateArtifactAttachmentException will never happen but leave it for backward compatibility
     */
    public void addAttachedArtifact(Artifact artifact) throws DuplicateArtifactAttachmentException {
        // if already there we remove it and add again
        int index = attachedArtifacts.indexOf(artifact);
```

### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `maven-core/src/main/java/org/apache/maven/lifecycle/mapping/DefaultLifecycleMapping.java`
#### Snippet
```java

    /** @deprecated use lifecycles instead */
    private Map<String, LifecyclePhase> phases;

    /**
```

### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `maven-core/src/main/java/org/apache/maven/toolchain/java/DefaultJavaToolChain.java`
#### Snippet
```java
 *             {@link JavaToolchainImpl} instead.
 */
public class DefaultJavaToolChain extends JavaToolchainImpl {
    public static final String KEY_JAVAHOME = JavaToolchainImpl.KEY_JAVAHOME;

```

## RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `maven-compat/src/main/java/org/apache/maven/profiles/activation/JdkPrefixProfileActivator.java`
#### Snippet
```java

    private String convertJdkToMavenVersion(String jdk) {
        return jdk.replaceAll("_", "-");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `maven-model-builder/src/main/java/org/apache/maven/model/profile/activation/JdkVersionProfileActivator.java`
#### Snippet
```java
        for (String token : range.split(",")) {
            if (token.startsWith("[")) {
                ranges.add(new RangeValue(token.replace("[", ""), true));
            } else if (token.startsWith("(")) {
                ranges.add(new RangeValue(token.replace("(", ""), false));
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `maven-model-builder/src/main/java/org/apache/maven/model/profile/activation/JdkVersionProfileActivator.java`
#### Snippet
```java
                ranges.add(new RangeValue(token.replace("[", ""), true));
            } else if (token.startsWith("(")) {
                ranges.add(new RangeValue(token.replace("(", ""), false));
            } else if (token.endsWith("]")) {
                ranges.add(new RangeValue(token.replace("]", ""), true));
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `maven-model-builder/src/main/java/org/apache/maven/model/profile/activation/JdkVersionProfileActivator.java`
#### Snippet
```java
                ranges.add(new RangeValue(token.replace("(", ""), false));
            } else if (token.endsWith("]")) {
                ranges.add(new RangeValue(token.replace("]", ""), true));
            } else if (token.endsWith(")")) {
                ranges.add(new RangeValue(token.replace(")", ""), false));
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `maven-model-builder/src/main/java/org/apache/maven/model/profile/activation/JdkVersionProfileActivator.java`
#### Snippet
```java
                ranges.add(new RangeValue(token.replace("]", ""), true));
            } else if (token.endsWith(")")) {
                ranges.add(new RangeValue(token.replace(")", ""), false));
            } else if (token.length() <= 0) {
                ranges.add(new RangeValue("", false));
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `maven-model-builder/src/main/java/org/apache/maven/model/profile/activation/JdkVersionProfileActivator.java`
#### Snippet
```java
        }

        value = value.replaceAll("[^0-9\\.\\-\\_]", "");

        List<String> valueTokens = new ArrayList<>(Arrays.asList(value.split("[\\.\\-\\_]")));
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `maven-model-builder/src/main/java/org/apache/maven/model/profile/activation/JdkVersionProfileActivator.java`
#### Snippet
```java
        value = value.replaceAll("[^0-9\\.\\-\\_]", "");

        List<String> valueTokens = new ArrayList<>(Arrays.asList(value.split("[\\.\\-\\_]")));
        List<String> rangeValueTokens = new ArrayList<>(Arrays.asList(rangeValue.value.split("\\.")));

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `maven-toolchain-builder/src/main/java/org/apache/maven/toolchain/building/DefaultToolchainsBuilder.java`
#### Snippet
```java
                // we're going to parse this back in as XML so we need to escape XML markup
                value = value.toString()
                        .replace("&", "&amp;")
                        .replace("<", "&lt;")
                        .replace(">", "&gt;");
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `maven-toolchain-builder/src/main/java/org/apache/maven/toolchain/building/DefaultToolchainsBuilder.java`
#### Snippet
```java
                value = value.toString()
                        .replace("&", "&amp;")
                        .replace("<", "&lt;")
                        .replace(">", "&gt;");
                return value;
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `maven-toolchain-builder/src/main/java/org/apache/maven/toolchain/building/DefaultToolchainsBuilder.java`
#### Snippet
```java
                        .replace("&", "&amp;")
                        .replace("<", "&lt;")
                        .replace(">", "&gt;");
                return value;
            }
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `maven-settings-builder/src/main/java/org/apache/maven/settings/building/DefaultSettingsBuilder.java`
#### Snippet
```java
                // we're going to parse this back in as XML so we need to escape XML markup
                value = value.toString()
                        .replace("&", "&amp;")
                        .replace("<", "&lt;")
                        .replace(">", "&gt;");
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `maven-settings-builder/src/main/java/org/apache/maven/settings/building/DefaultSettingsBuilder.java`
#### Snippet
```java
                value = value.toString()
                        .replace("&", "&amp;")
                        .replace("<", "&lt;")
                        .replace(">", "&gt;");
                return value;
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `maven-settings-builder/src/main/java/org/apache/maven/settings/building/DefaultSettingsBuilder.java`
#### Snippet
```java
                        .replace("&", "&amp;")
                        .replace("<", "&lt;")
                        .replace(">", "&gt;");
                return value;
            }
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `maven-settings-builder/src/main/java/org/apache/maven/settings/validation/DefaultSettingsValidator.java`
#### Snippet
```java
                    addViolation(
                            problems, Severity.ERROR, "pluginGroups.pluginGroup[" + i + "]", null, "must not be empty");
                } else if (!pluginGroup.matches(ID_REGEX)) {
                    addViolation(
                            problems,
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `maven-embedder/src/main/java/org/apache/maven/cli/MavenCli.java`
#### Snippet
```java
        }

        String[] lines = msg.split("(\r\n)|(\r)|(\n)");
        String currentColor = "";

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `maven-model-transform/src/main/java/org/apache/maven/model/transform/CiFriendlyXMLFilter.java`
#### Snippet
```java

    public CiFriendlyXMLFilter setRevision(String revision) {
        replaceChain = replaceChain.andThen(t -> t.replace("${revision}", revision));
        return this;
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `maven-model-transform/src/main/java/org/apache/maven/model/transform/CiFriendlyXMLFilter.java`
#### Snippet
```java

    public CiFriendlyXMLFilter setChangelist(String changelist) {
        replaceChain = replaceChain.andThen(t -> t.replace("${changelist}", changelist));
        return this;
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `maven-model-transform/src/main/java/org/apache/maven/model/transform/CiFriendlyXMLFilter.java`
#### Snippet
```java

    public CiFriendlyXMLFilter setSha1(String sha1) {
        replaceChain = replaceChain.andThen(t -> t.replace("${sha1}", sha1));
        return this;
    }
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `maven-model-transform/src/main/java/org/apache/maven/model/transform/RelativePathXMLFilter.java`
#### Snippet
```java
            if (event.event == START_TAG && "relativePath".equals(event.name)) {
                skip = true;
                if (prev != null && prev.event == TEXT && prev.text.matches("\\s+")) {
                    prev = null;
                }
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `maven-model-transform/src/main/java/org/apache/maven/model/transform/ReactorDependencyXMLFilter.java`
#### Snippet
```java
                hasVersion |= "version".equals(tagName);
            } else if (event.event == TEXT) {
                if (event.text.matches("\\s+")) {
                    if (dependencyWhitespace.isEmpty()) {
                        dependencyWhitespace = event.text;
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `maven-model-transform/src/main/java/org/apache/maven/model/transform/pull/XmlUtils.java`
#### Snippet
```java
    private static String normalize(String input) {
        if (input.indexOf('\n') >= 0 && !"\n".equals(System.lineSeparator())) {
            return input.replace("\n", System.lineSeparator());
        }
        return input;
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `maven-model-transform/src/main/java/org/apache/maven/model/transform/ParentXMLFilter.java`
#### Snippet
```java
                hasRelativePath |= "relativePath".equals(tagName);
            } else if (event.event == TEXT) {
                if (event.text.matches("\\s+")) {
                    if (whitespaceAfterParentStart.isEmpty()) {
                        whitespaceAfterParentStart = event.text;
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/descriptor/PluginDescriptor.java`
#### Snippet
```java
            return "plugin";
        } else {
            return artifactId.replaceAll("-?maven-?", "").replaceAll("-?plugin-?", "");
        }
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/descriptor/PluginDescriptor.java`
#### Snippet
```java
            return "plugin";
        } else {
            return artifactId.replaceAll("-?maven-?", "").replaceAll("-?plugin-?", "");
        }
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `maven-core/src/main/java/org/apache/maven/plugin/PluginParameterExpressionEvaluatorV4.java`
#### Snippet
```java
            // Was not an expression
            if (expression.contains("$$")) {
                return expression.replaceAll("\\$\\$", "\\$");
            } else {
                return expression;
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `maven-core/src/main/java/org/apache/maven/plugin/PluginParameterExpressionEvaluator.java`
#### Snippet
```java
            // Was not an expression
            if (expression.contains("$$")) {
                return expression.replaceAll("\\$\\$", "\\$");
            } else {
                return expression;
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `maven-core/src/main/java/org/apache/maven/plugin/internal/AbstractMavenPluginParametersValidator.java`
#### Snippet
```java

        if (parameter.getExpression() != null) {
            String userProperty = parameter.getExpression().replace("${", "'").replace('}', '\'');
            messageBuilder.warning(" (user property ").warning(userProperty).warning(")");
        }
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `maven-core/src/main/java/org/apache/maven/plugin/internal/AbstractMavenPluginParametersValidator.java`
#### Snippet
```java
        }

        String propertyName = strValue.replace("${", "").replace("}", "");

        if (IGNORED_PROPERTY_VALUES.contains(propertyName)) {
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `maven-core/src/main/java/org/apache/maven/plugin/internal/AbstractMavenPluginParametersValidator.java`
#### Snippet
```java
        }

        String propertyName = strValue.replace("${", "").replace("}", "");

        if (IGNORED_PROPERTY_VALUES.contains(propertyName)) {
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `maven-core/src/main/java/org/apache/maven/internal/MultilineMessageHelper.java`
#### Snippet
```java
        for (String line : lines) {
            sb.setLength(0);
            String[] words = line.split("\\s+");
            for (String word : words) {
                if (sb.length() >= remainder - word.length() - (sb.length() > 0 ? 1 : 0)) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `maven-core/src/main/java/org/apache/maven/settings/DefaultMavenSettingsBuilder.java`
#### Snippet
```java
            }

            basedir = basedir.replaceAll("\\\\", "/");
            basedir = basedir.replaceAll("\\$", "\\\\\\$");

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `maven-core/src/main/java/org/apache/maven/settings/DefaultMavenSettingsBuilder.java`
#### Snippet
```java

            basedir = basedir.replaceAll("\\\\", "/");
            basedir = basedir.replaceAll("\\$", "\\\\\\$");

            path = pathPattern.replaceAll("\\$\\{" + basedirSysProp + "\\}", basedir);
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `maven-core/src/main/java/org/apache/maven/settings/DefaultMavenSettingsBuilder.java`
#### Snippet
```java

            path = pathPattern.replaceAll("\\$\\{" + basedirSysProp + "\\}", basedir);
            path = path.replaceAll("\\\\", "/");
            // ---------------------------------------------------------------------------------
            // I'm not sure if this last regexp was really intended to disallow the usage of
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `maven-core/src/main/java/org/apache/maven/execution/DefaultBuildResumptionDataRepository.java`
#### Snippet
```java
        if (properties.containsKey(REMAINING_PROJECTS) && StringUtils.isEmpty(request.getResumeFrom())) {
            String propertyValue = properties.getProperty(REMAINING_PROJECTS);
            Stream.of(propertyValue.split(PROPERTY_DELIMITER))
                    .filter(StringUtils::isNotEmpty)
                    .forEach(request.getProjectActivation()::activateOptionalProject);
```

## RuleId[ruleID=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.repository.legacy.resolver` is unnecessary, and can be replaced with an import
in `maven-compat/src/main/java/org/apache/maven/artifact/resolver/DefaultArtifactCollector.java`
#### Snippet
```java
@Deprecated
@Component(role = ArtifactCollector.class)
public class DefaultArtifactCollector extends org.apache.maven.repository.legacy.resolver.DefaultLegacyArtifactCollector
        implements ArtifactCollector {}

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.repository.legacy.resolver` is unnecessary, and can be replaced with an import
in `maven-compat/src/main/java/org/apache/maven/artifact/resolver/ArtifactCollector.java`
#### Snippet
```java
 */
@Deprecated
public interface ArtifactCollector extends org.apache.maven.repository.legacy.resolver.LegacyArtifactCollector {

    @Deprecated
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/DefaultWagonManager.java`
#### Snippet
```java
        }

        String hint = protocol.toLowerCase(java.util.Locale.ENGLISH);

        Wagon wagon;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.wagon` is unnecessary, and can be replaced with an import
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
            wagonManager.putRemoteFile(
                    repository, source, remotePath, TransferListenerAdapter.newAdapter(transferListener));
        } catch (org.apache.maven.wagon.TransferFailedException e) {
            throw new ArtifactTransferFailedException(getMessage(e, "Error transferring artifact."), e);
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.wagon` is unnecessary, and can be replaced with an import
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
                    ArtifactRepositoryPolicy.CHECKSUM_POLICY_WARN,
                    true);
        } catch (org.apache.maven.wagon.TransferFailedException e) {
            throw new ArtifactTransferFailedException(getMessage(e, "Error transferring artifact."), e);
        } catch (org.apache.maven.wagon.ResourceDoesNotExistException e) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.wagon` is unnecessary, and can be replaced with an import
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
        } catch (org.apache.maven.wagon.TransferFailedException e) {
            throw new ArtifactTransferFailedException(getMessage(e, "Error transferring artifact."), e);
        } catch (org.apache.maven.wagon.ResourceDoesNotExistException e) {
            throw new ArtifactDoesNotExistException(getMessage(e, "Requested artifact does not exist."), e);
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `maven-model-builder/src/main/java/org/apache/maven/model/resolution/ModelResolver.java`
#### Snippet
```java
     * Tries to resolve the POM for the specified dependency coordinates possibly updating {@code dependency}.
     * <p>
     * Unlike the {@link #resolveModel(java.lang.String, java.lang.String, java.lang.String)} method, this method
     * supports version ranges and updates the given {@code dependency} instance to match the returned
     * {@code ModelSource}. If {@code dependency} declares a version range, the version corresponding to the returned
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `maven-model-builder/src/main/java/org/apache/maven/model/resolution/ModelResolver.java`
#### Snippet
```java
     * Tries to resolve the POM for the specified dependency coordinates possibly updating {@code dependency}.
     * <p>
     * Unlike the {@link #resolveModel(java.lang.String, java.lang.String, java.lang.String)} method, this method
     * supports version ranges and updates the given {@code dependency} instance to match the returned
     * {@code ModelSource}. If {@code dependency} declares a version range, the version corresponding to the returned
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `maven-model-builder/src/main/java/org/apache/maven/model/resolution/ModelResolver.java`
#### Snippet
```java
     * Tries to resolve the POM for the specified dependency coordinates possibly updating {@code dependency}.
     * <p>
     * Unlike the {@link #resolveModel(java.lang.String, java.lang.String, java.lang.String)} method, this method
     * supports version ranges and updates the given {@code dependency} instance to match the returned
     * {@code ModelSource}. If {@code dependency} declares a version range, the version corresponding to the returned
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `maven-model-builder/src/main/java/org/apache/maven/model/resolution/ModelResolver.java`
#### Snippet
```java
     * Tries to resolve the POM for the specified parent coordinates possibly updating {@code parent}.
     * <p>
     * Unlike the {@link #resolveModel(java.lang.String, java.lang.String, java.lang.String)} method, this method
     * supports version ranges and updates the given {@code parent} instance to match the returned {@code ModelSource}.
     * If {@code parent} declares a version range, the version corresponding to the returned {@code ModelSource} will
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `maven-model-builder/src/main/java/org/apache/maven/model/resolution/ModelResolver.java`
#### Snippet
```java
     * Tries to resolve the POM for the specified parent coordinates possibly updating {@code parent}.
     * <p>
     * Unlike the {@link #resolveModel(java.lang.String, java.lang.String, java.lang.String)} method, this method
     * supports version ranges and updates the given {@code parent} instance to match the returned {@code ModelSource}.
     * If {@code parent} declares a version range, the version corresponding to the returned {@code ModelSource} will
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `maven-model-builder/src/main/java/org/apache/maven/model/resolution/ModelResolver.java`
#### Snippet
```java
     * Tries to resolve the POM for the specified parent coordinates possibly updating {@code parent}.
     * <p>
     * Unlike the {@link #resolveModel(java.lang.String, java.lang.String, java.lang.String)} method, this method
     * supports version ranges and updates the given {@code parent} instance to match the returned {@code ModelSource}.
     * If {@code parent} declares a version range, the version corresponding to the returned {@code ModelSource} will
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.api.model` is unnecessary and can be removed
in `maven-model-builder/src/main/java/org/apache/maven/model/building/DefaultModelBuilder.java`
#### Snippet
```java
            if (source != null) {
                try {
                    org.apache.maven.api.model.InputSource v4src =
                            model.getLocation("").getSource();
                    Field field = InputSource.class.getDeclaredField("modelId");
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary and can be removed
in `maven-embedder/src/main/java/org/apache/maven/cli/logging/Slf4jLoggerManager.java`
#### Snippet
```java

/**
 * Use an SLF4J {@link org.slf4j.ILoggerFactory} as a backing for a Plexus
 * {@link org.codehaus.plexus.logging.LoggerManager},
 * ignoring Plexus logger API parts that are not classical and probably not really used.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.codehaus.plexus.logging` is unnecessary and can be removed
in `maven-embedder/src/main/java/org/apache/maven/cli/logging/Slf4jLoggerManager.java`
#### Snippet
```java
/**
 * Use an SLF4J {@link org.slf4j.ILoggerFactory} as a backing for a Plexus
 * {@link org.codehaus.plexus.logging.LoggerManager},
 * ignoring Plexus logger API parts that are not classical and probably not really used.
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.api` is unnecessary and can be removed
in `api/maven-api-core/src/main/java/org/apache/maven/api/Version.java`
#### Snippet
```java
 * @since 4.0
 * @see org.apache.maven.api.services.VersionParser#parseVersion(String)
 * @see org.apache.maven.api.Session#parseVersion(String)
 */
@Experimental
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.api` is unnecessary and can be removed
in `api/maven-api-core/src/main/java/org/apache/maven/api/Artifact.java`
#### Snippet
```java
     *
     * @return {@code true} if the artifact is a snapshot, {@code false} otherwise
     * @see org.apache.maven.api.Session#isVersionSnapshot(String)
     */
    boolean isSnapshot();
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.api` is unnecessary and can be removed
in `api/maven-api-core/src/main/java/org/apache/maven/api/Artifact.java`
#### Snippet
```java
     *
     * @return an {@link ArtifactCoordinate}
     * @see org.apache.maven.api.Session#createArtifactCoordinate(Artifact)
     */
    @Nonnull
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `maven-embedder/src/main/java/org/apache/maven/cli/MavenCli.java`
#### Snippet
```java

                    // Sun/Oracle advises to empty the char array
                    java.util.Arrays.fill(password, ' ');
                }
            }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `maven-embedder/src/main/java/org/apache/maven/cli/MavenCli.java`
#### Snippet
```java

                    // Sun/Oracle advises to empty the char array
                    java.util.Arrays.fill(password, ' ');
                }
            }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.plugin` is unnecessary and can be removed
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/AbstractMojo.java`
#### Snippet
```java
     * method directly whenever you need the logger, it is fast enough and needs no caching.
     *
     * @see org.apache.maven.plugin.Mojo#getLog()
     * @deprecated Use SLF4J directly
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.plugin.logging` is unnecessary and can be removed
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/logging/SystemStreamLog.java`
#### Snippet
```java

    /**
     * @see org.apache.maven.plugin.logging.Log#isWarnEnabled()
     */
    public boolean isWarnEnabled() {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.plugin.logging` is unnecessary and can be removed
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/logging/SystemStreamLog.java`
#### Snippet
```java

    /**
     * @see org.apache.maven.plugin.logging.Log#warn(java.lang.Throwable)
     */
    public void warn(Throwable error) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/logging/SystemStreamLog.java`
#### Snippet
```java

    /**
     * @see org.apache.maven.plugin.logging.Log#warn(java.lang.Throwable)
     */
    public void warn(Throwable error) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.plugin.logging` is unnecessary and can be removed
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/logging/SystemStreamLog.java`
#### Snippet
```java

    /**
     * @see org.apache.maven.plugin.logging.Log#debug(java.lang.CharSequence, java.lang.Throwable)
     */
    public void debug(CharSequence content, Throwable error) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/logging/SystemStreamLog.java`
#### Snippet
```java

    /**
     * @see org.apache.maven.plugin.logging.Log#debug(java.lang.CharSequence, java.lang.Throwable)
     */
    public void debug(CharSequence content, Throwable error) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/logging/SystemStreamLog.java`
#### Snippet
```java

    /**
     * @see org.apache.maven.plugin.logging.Log#debug(java.lang.CharSequence, java.lang.Throwable)
     */
    public void debug(CharSequence content, Throwable error) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.plugin.logging` is unnecessary and can be removed
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/logging/SystemStreamLog.java`
#### Snippet
```java

    /**
     * @see org.apache.maven.plugin.logging.Log#isInfoEnabled()
     */
    public boolean isInfoEnabled() {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.plugin.logging` is unnecessary and can be removed
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/logging/SystemStreamLog.java`
#### Snippet
```java

    /**
     * @see org.apache.maven.plugin.logging.Log#warn(java.lang.CharSequence, java.lang.Throwable)
     */
    public void warn(CharSequence content, Throwable error) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/logging/SystemStreamLog.java`
#### Snippet
```java

    /**
     * @see org.apache.maven.plugin.logging.Log#warn(java.lang.CharSequence, java.lang.Throwable)
     */
    public void warn(CharSequence content, Throwable error) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/logging/SystemStreamLog.java`
#### Snippet
```java

    /**
     * @see org.apache.maven.plugin.logging.Log#warn(java.lang.CharSequence, java.lang.Throwable)
     */
    public void warn(CharSequence content, Throwable error) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.plugin.logging` is unnecessary and can be removed
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/logging/SystemStreamLog.java`
#### Snippet
```java

    /**
     * @see org.apache.maven.plugin.logging.Log#info(java.lang.CharSequence, java.lang.Throwable)
     */
    public void info(CharSequence content, Throwable error) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/logging/SystemStreamLog.java`
#### Snippet
```java

    /**
     * @see org.apache.maven.plugin.logging.Log#info(java.lang.CharSequence, java.lang.Throwable)
     */
    public void info(CharSequence content, Throwable error) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/logging/SystemStreamLog.java`
#### Snippet
```java

    /**
     * @see org.apache.maven.plugin.logging.Log#info(java.lang.CharSequence, java.lang.Throwable)
     */
    public void info(CharSequence content, Throwable error) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.plugin.logging` is unnecessary and can be removed
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/logging/SystemStreamLog.java`
#### Snippet
```java

    /**
     * @see org.apache.maven.plugin.logging.Log#error(java.lang.Throwable)
     */
    public void error(Throwable error) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/logging/SystemStreamLog.java`
#### Snippet
```java

    /**
     * @see org.apache.maven.plugin.logging.Log#error(java.lang.Throwable)
     */
    public void error(Throwable error) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.plugin.logging` is unnecessary and can be removed
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/logging/SystemStreamLog.java`
#### Snippet
```java
public class SystemStreamLog implements Log {
    /**
     * @see org.apache.maven.plugin.logging.Log#debug(java.lang.CharSequence)
     */
    public void debug(CharSequence content) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/logging/SystemStreamLog.java`
#### Snippet
```java
public class SystemStreamLog implements Log {
    /**
     * @see org.apache.maven.plugin.logging.Log#debug(java.lang.CharSequence)
     */
    public void debug(CharSequence content) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.plugin.logging` is unnecessary and can be removed
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/logging/SystemStreamLog.java`
#### Snippet
```java

    /**
     * @see org.apache.maven.plugin.logging.Log#isErrorEnabled()
     */
    public boolean isErrorEnabled() {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.plugin.logging` is unnecessary and can be removed
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/logging/SystemStreamLog.java`
#### Snippet
```java

    /**
     * @see org.apache.maven.plugin.logging.Log#error(java.lang.CharSequence, java.lang.Throwable)
     */
    public void error(CharSequence content, Throwable error) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/logging/SystemStreamLog.java`
#### Snippet
```java

    /**
     * @see org.apache.maven.plugin.logging.Log#error(java.lang.CharSequence, java.lang.Throwable)
     */
    public void error(CharSequence content, Throwable error) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/logging/SystemStreamLog.java`
#### Snippet
```java

    /**
     * @see org.apache.maven.plugin.logging.Log#error(java.lang.CharSequence, java.lang.Throwable)
     */
    public void error(CharSequence content, Throwable error) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.plugin.logging` is unnecessary and can be removed
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/logging/SystemStreamLog.java`
#### Snippet
```java

    /**
     * @see org.apache.maven.plugin.logging.Log#error(java.lang.CharSequence)
     */
    public void error(CharSequence content) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/logging/SystemStreamLog.java`
#### Snippet
```java

    /**
     * @see org.apache.maven.plugin.logging.Log#error(java.lang.CharSequence)
     */
    public void error(CharSequence content) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.plugin.logging` is unnecessary and can be removed
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/logging/SystemStreamLog.java`
#### Snippet
```java

    /**
     * @see org.apache.maven.plugin.logging.Log#isDebugEnabled()
     */
    public boolean isDebugEnabled() {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.plugin.logging` is unnecessary and can be removed
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/logging/SystemStreamLog.java`
#### Snippet
```java

    /**
     * @see org.apache.maven.plugin.logging.Log#debug(java.lang.Throwable)
     */
    public void debug(Throwable error) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/logging/SystemStreamLog.java`
#### Snippet
```java

    /**
     * @see org.apache.maven.plugin.logging.Log#debug(java.lang.Throwable)
     */
    public void debug(Throwable error) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.plugin.logging` is unnecessary and can be removed
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/logging/SystemStreamLog.java`
#### Snippet
```java

    /**
     * @see org.apache.maven.plugin.logging.Log#warn(java.lang.CharSequence)
     */
    public void warn(CharSequence content) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/logging/SystemStreamLog.java`
#### Snippet
```java

    /**
     * @see org.apache.maven.plugin.logging.Log#warn(java.lang.CharSequence)
     */
    public void warn(CharSequence content) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.plugin.logging` is unnecessary and can be removed
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/logging/SystemStreamLog.java`
#### Snippet
```java

    /**
     * @see org.apache.maven.plugin.logging.Log#info(java.lang.CharSequence)
     */
    public void info(CharSequence content) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/logging/SystemStreamLog.java`
#### Snippet
```java

    /**
     * @see org.apache.maven.plugin.logging.Log#info(java.lang.CharSequence)
     */
    public void info(CharSequence content) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.plugin.logging` is unnecessary and can be removed
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/logging/SystemStreamLog.java`
#### Snippet
```java

    /**
     * @see org.apache.maven.plugin.logging.Log#info(java.lang.Throwable)
     */
    public void info(Throwable error) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/logging/SystemStreamLog.java`
#### Snippet
```java

    /**
     * @see org.apache.maven.plugin.logging.Log#info(java.lang.Throwable)
     */
    public void info(Throwable error) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.building` is unnecessary and can be removed
in `maven-builder-support/src/main/java/org/apache/maven/building/DefaultProblem.java`
#### Snippet
```java
     * @param message The message describing the problem, may be {@code null}.
     * @param severity The severity level of the problem, may be {@code null} to default to
     *            {@link org.apache.maven.building.Problem.Severity#ERROR}.
     * @param source A hint about the source of the problem like a file path, may be {@code null}.
     * @param lineNumber The one-based index of the line containing the problem or {@code -1} if unknown.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven` is unnecessary and can be removed
in `maven-core/src/main/java/org/apache/maven/DefaultArtifactFilterManager.java`
#### Snippet
```java
     * Returns the artifact filter for the standard core artifacts.
     *
     * @see org.apache.maven.ArtifactFilterManager#getCoreArtifactFilter()
     */
    public ArtifactFilter getCoreArtifactFilter() {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven` is unnecessary and can be removed
in `maven-core/src/main/java/org/apache/maven/DefaultArtifactFilterManager.java`
#### Snippet
```java
     * Returns the artifact filter for the core + extension artifacts.
     *
     * @see org.apache.maven.ArtifactFilterManager#getArtifactFilter()
     */
    public ArtifactFilter getArtifactFilter() {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.codehaus.plexus.util.xml` is unnecessary, and can be replaced with an import
in `maven-core/src/main/java/org/apache/maven/plugin/MojoExecution.java`
#### Snippet
```java
    }

    public void setConfiguration(org.codehaus.plexus.util.xml.Xpp3Dom configuration) {
        this.configuration = configuration;
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.codehaus.plexus.util.xml` is unnecessary, and can be replaced with an import
in `maven-core/src/main/java/org/apache/maven/plugin/MojoExecution.java`
#### Snippet
```java
    }

    public org.codehaus.plexus.util.xml.Xpp3Dom getConfiguration() {
        return configuration;
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.codehaus.plexus.util.xml` is unnecessary, and can be replaced with an import
in `maven-core/src/main/java/org/apache/maven/plugin/MojoExecution.java`
#### Snippet
```java
    private MojoDescriptor mojoDescriptor;

    private org.codehaus.plexus.util.xml.Xpp3Dom configuration;

    /**
```

### UnnecessaryFullyQualifiedName
Qualifier `org.codehaus.plexus.util.xml` is unnecessary, and can be replaced with an import
in `maven-core/src/main/java/org/apache/maven/plugin/MojoExecution.java`
#### Snippet
```java
    }

    public MojoExecution(MojoDescriptor mojoDescriptor, org.codehaus.plexus.util.xml.Xpp3Dom configuration) {
        this.mojoDescriptor = mojoDescriptor;
        this.configuration = configuration;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.codehaus.plexus.util.xml` is unnecessary, and can be replaced with an import
in `maven-core/src/main/java/org/apache/maven/plugin/MojoExecution.java`
#### Snippet
```java

    public void setConfiguration(Dom configuration) {
        this.configuration = configuration != null ? new org.codehaus.plexus.util.xml.Xpp3Dom(configuration) : null;
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.codehaus.plexus.util.xml` is unnecessary, and can be replaced with an import
in `maven-core/src/main/java/org/apache/maven/plugin/MojoExecution.java`
#### Snippet
```java
    public MojoExecution(MojoDescriptor mojoDescriptor, Dom configuration) {
        this.mojoDescriptor = mojoDescriptor;
        this.configuration = new org.codehaus.plexus.util.xml.Xpp3Dom(configuration);
        this.executionId = null;
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.aether.repository` is unnecessary, and can be replaced with an import
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java
    private Mirror getMirror(RepositorySystemSession session, ArtifactRepository repository) {
        if (session != null) {
            org.eclipse.aether.repository.MirrorSelector selector = session.getMirrorSelector();
            if (selector != null) {
                RemoteRepository repo = selector.getMirror(RepositoryUtils.toRepo(repository));
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.repository.internal` is unnecessary, and can be replaced with an import
in `maven-core/src/main/java/org/apache/maven/plugin/internal/DefaultPluginDependenciesResolver.java`
#### Snippet
```java
            if (logger.isWarnEnabled()) {
                if (!result.getRelocations().isEmpty()) {
                    String message = pluginArtifact instanceof org.apache.maven.repository.internal.RelocatedArtifact
                            ? ((org.apache.maven.repository.internal.RelocatedArtifact) pluginArtifact).getMessage()
                            : null;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.repository.internal` is unnecessary, and can be replaced with an import
in `maven-core/src/main/java/org/apache/maven/plugin/internal/DefaultPluginDependenciesResolver.java`
#### Snippet
```java
                if (!result.getRelocations().isEmpty()) {
                    String message = pluginArtifact instanceof org.apache.maven.repository.internal.RelocatedArtifact
                            ? ((org.apache.maven.repository.internal.RelocatedArtifact) pluginArtifact).getMessage()
                            : null;
                    logger.warn("The artifact " + result.getRelocations().get(0) + " has been relocated to "
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.aether.artifact` is unnecessary and can be removed
in `maven-core/src/main/java/org/apache/maven/plugin/internal/DefaultPluginDependenciesResolver.java`
#### Snippet
```java
            org.eclipse.aether.graph.Dependency dep = node.getDependency();
            if (dep != null) {
                org.eclipse.aether.artifact.Artifact art = dep.getArtifact();

                buffer.append(art);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.aether.graph` is unnecessary, and can be replaced with an import
in `maven-core/src/main/java/org/apache/maven/plugin/internal/DefaultPluginDependenciesResolver.java`
#### Snippet
```java

                if ((node.getManagedBits() & DependencyNode.MANAGED_EXCLUSIONS) == DependencyNode.MANAGED_EXCLUSIONS) {
                    final Collection<org.eclipse.aether.graph.Exclusion> premanagedExclusions =
                            DependencyManagerUtils.getPremanagedExclusions(node);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.artifact` is unnecessary and can be removed
in `maven-core/src/main/java/org/apache/maven/project/DefaultMavenProjectHelper.java`
#### Snippet
```java
     * Add an attached artifact or replace the file for an existing artifact.
     *
     * @see MavenProject#addAttachedArtifact(org.apache.maven.artifact.Artifact)
     * @param project project reference.
     * @param artifact artifact to add or replace.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `maven-core/src/main/java/org/apache/maven/project/MavenProjectHelper.java`
#### Snippet
```java

    /**
     * * See {@link #attachArtifact(MavenProject, String, String, java.io.File)}, but with classifier set to null.
     * @param project project reference.
     * @param artifactType artifact type.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `maven-core/src/main/java/org/apache/maven/project/MavenProjectHelper.java`
#### Snippet
```java

    /**
     * See {@link #attachArtifact(MavenProject, String, String, java.io.File)}, but with type set to null.
     * @param project project reference.
     * @param artifactFile artifact file.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.repository.internal` is unnecessary, and can be replaced with an import
in `maven-core/src/main/java/org/apache/maven/project/DefaultProjectDependenciesResolver.java`
#### Snippet
```java
                    org.eclipse.aether.artifact.Artifact relocated =
                            child.getDependency().getArtifact();
                    String message = relocated instanceof org.apache.maven.repository.internal.RelocatedArtifact
                            ? ((org.apache.maven.repository.internal.RelocatedArtifact) relocated).getMessage()
                            : null;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.repository.internal` is unnecessary, and can be replaced with an import
in `maven-core/src/main/java/org/apache/maven/project/DefaultProjectDependenciesResolver.java`
#### Snippet
```java
                            child.getDependency().getArtifact();
                    String message = relocated instanceof org.apache.maven.repository.internal.RelocatedArtifact
                            ? ((org.apache.maven.repository.internal.RelocatedArtifact) relocated).getMessage()
                            : null;
                    logger.warn("The artifact " + child.getRelocations().get(0) + " has been relocated to " + relocated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.artifact.metadata` is unnecessary and can be removed
in `maven-core/src/main/java/org/apache/maven/artifact/metadata/AbstractArtifactMetadata.java`
#### Snippet
```java
public abstract class AbstractArtifactMetadata
        extends org.apache.maven.repository.legacy.metadata.AbstractArtifactMetadata
        implements org.apache.maven.artifact.metadata.ArtifactMetadata {
    protected AbstractArtifactMetadata(Artifact artifact) {
        super(artifact);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.artifact.metadata` is unnecessary, and can be replaced with an import
in `maven-core/src/main/java/org/apache/maven/artifact/repository/metadata/RepositoryMetadata.java`
#### Snippet
```java
 * TODO not happy about the store method - they use "this"
 */
public interface RepositoryMetadata extends org.apache.maven.artifact.metadata.ArtifactMetadata {

    int RELEASE = 1;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.aether.graph` is unnecessary and can be removed
in `maven-core/src/main/java/org/apache/maven/internal/impl/AbstractNode.java`
#### Snippet
```java
public abstract class AbstractNode implements Node {

    abstract org.eclipse.aether.graph.DependencyNode getDependencyNode();

    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.aether.graph` is unnecessary, and can be replaced with an import
in `maven-core/src/main/java/org/apache/maven/internal/impl/DefaultDependencyCoordinate.java`
#### Snippet
```java

    public DefaultDependencyCoordinate(
            @Nonnull AbstractSession session, @Nonnull org.eclipse.aether.graph.Dependency dependency) {
        this.session = nonNull(session, "session");
        this.dependency = nonNull(dependency, "dependency");
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.aether.graph` is unnecessary, and can be replaced with an import
in `maven-core/src/main/java/org/apache/maven/internal/impl/DefaultDependencyCoordinate.java`
#### Snippet
```java
public class DefaultDependencyCoordinate implements DependencyCoordinate {
    private final AbstractSession session;
    private final org.eclipse.aether.graph.Dependency dependency;

    public DefaultDependencyCoordinate(
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.aether.graph` is unnecessary, and can be replaced with an import
in `maven-core/src/main/java/org/apache/maven/internal/impl/DefaultDependencyCoordinate.java`
#### Snippet
```java

    @Nonnull
    public org.eclipse.aether.graph.Dependency getDependency() {
        return dependency;
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.aether.graph` is unnecessary, and can be replaced with an import
in `maven-core/src/main/java/org/apache/maven/internal/impl/DefaultDependencyCoordinateFactory.java`
#### Snippet
```java
        return new DefaultDependencyCoordinate(
                session,
                new org.eclipse.aether.graph.Dependency(
                        new org.eclipse.aether.artifact.DefaultArtifact(
                                request.getGroupId(),
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.building` is unnecessary, and can be replaced with an import
in `maven-core/src/main/java/org/apache/maven/internal/impl/DefaultToolchainsBuilder.java`
#### Snippet
```java
        private final org.apache.maven.building.Problem problem;

        MappedBuilderProblem(org.apache.maven.building.Problem problem) {
            this.problem = problem;
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.building` is unnecessary, and can be replaced with an import
in `maven-core/src/main/java/org/apache/maven/internal/impl/DefaultToolchainsBuilder.java`
#### Snippet
```java

    private static class MappedBuilderProblem implements BuilderProblem {
        private final org.apache.maven.building.Problem problem;

        MappedBuilderProblem(org.apache.maven.building.Problem problem) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.building` is unnecessary, and can be replaced with an import
in `maven-core/src/main/java/org/apache/maven/internal/impl/DefaultToolchainsBuilder.java`
#### Snippet
```java
                        request.getGlobalToolchainsSource().get()));
            } else if (request.getGlobalToolchainsPath().isPresent()) {
                req.setGlobalToolchainsSource(new org.apache.maven.building.FileSource(
                        request.getGlobalToolchainsPath().get().toFile()));
            }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.building` is unnecessary, and can be replaced with an import
in `maven-core/src/main/java/org/apache/maven/internal/impl/DefaultToolchainsBuilder.java`
#### Snippet
```java
                        request.getUserToolchainsSource().get()));
            } else if (request.getUserToolchainsPath().isPresent()) {
                req.setUserToolchainsSource(new org.apache.maven.building.FileSource(
                        request.getUserToolchainsPath().get().toFile()));
            }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.aether.graph` is unnecessary and can be removed
in `maven-core/src/main/java/org/apache/maven/internal/impl/DefaultNode.java`
#### Snippet
```java
        }

        org.eclipse.aether.graph.DependencyNode node = getDependencyNode();

        List<String> details = new ArrayList<>();
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.aether.graph` is unnecessary and can be removed
in `maven-core/src/main/java/org/apache/maven/internal/impl/DefaultNode.java`
#### Snippet
```java
        List<String> details = new ArrayList<>();

        org.eclipse.aether.graph.DependencyNode winner =
                (org.eclipse.aether.graph.DependencyNode) node.getData().get(ConflictResolver.NODE_DATA_WINNER);
        String winnerVersion = winner != null ? winner.getArtifact().getBaseVersion() : null;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.aether.graph` is unnecessary and can be removed
in `maven-core/src/main/java/org/apache/maven/internal/impl/DefaultNode.java`
#### Snippet
```java

        org.eclipse.aether.graph.DependencyNode winner =
                (org.eclipse.aether.graph.DependencyNode) node.getData().get(ConflictResolver.NODE_DATA_WINNER);
        String winnerVersion = winner != null ? winner.getArtifact().getBaseVersion() : null;
        boolean included = (winnerVersion == null);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.aether.graph` is unnecessary and can be removed
in `maven-core/src/main/java/org/apache/maven/internal/impl/DefaultNode.java`
#### Snippet
```java

    public DefaultNode(
            @Nonnull AbstractSession session, @Nonnull org.eclipse.aether.graph.DependencyNode node, boolean verbose) {
        this.session = session;
        this.node = node;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.aether.graph` is unnecessary and can be removed
in `maven-core/src/main/java/org/apache/maven/internal/impl/DefaultNode.java`
#### Snippet
```java

    protected final @Nonnull AbstractSession session;
    protected final @Nonnull org.eclipse.aether.graph.DependencyNode node;
    protected final boolean verbose;

```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.aether.artifact` is unnecessary, and can be replaced with an import
in `maven-core/src/main/java/org/apache/maven/internal/impl/DefaultArtifactCoordinate.java`
#### Snippet
```java

    public DefaultArtifactCoordinate(
            @Nonnull AbstractSession session, @Nonnull org.eclipse.aether.artifact.Artifact coordinate) {
        this.session = nonNull(session, "session can not be null");
        this.coordinate = nonNull(coordinate, "coordinate can not be null");
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.aether.artifact` is unnecessary, and can be replaced with an import
in `maven-core/src/main/java/org/apache/maven/internal/impl/DefaultArtifactCoordinate.java`
#### Snippet
```java
    }

    public org.eclipse.aether.artifact.Artifact getCoordinate() {
        return coordinate;
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.aether.artifact` is unnecessary, and can be replaced with an import
in `maven-core/src/main/java/org/apache/maven/internal/impl/DefaultArtifactCoordinate.java`
#### Snippet
```java
public class DefaultArtifactCoordinate implements ArtifactCoordinate {
    private final @Nonnull AbstractSession session;
    private final @Nonnull org.eclipse.aether.artifact.Artifact coordinate;

    public DefaultArtifactCoordinate(
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.aether.repository` is unnecessary, and can be replaced with an import
in `maven-core/src/main/java/org/apache/maven/internal/impl/DefaultSession.java`
#### Snippet
```java
        }
        org.eclipse.aether.repository.LocalRepository repository = toRepository(localRepository);
        org.eclipse.aether.repository.LocalRepositoryManager localRepositoryManager =
                repositorySystem.newLocalRepositoryManager(session, repository);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.aether.graph` is unnecessary, and can be replaced with an import
in `maven-core/src/main/java/org/apache/maven/internal/impl/DefaultSession.java`
#### Snippet
```java
    }

    public org.eclipse.aether.graph.Dependency toDependency(DependencyCoordinate dependency) {
        if (dependency instanceof DefaultDependencyCoordinate) {
            return ((DefaultDependencyCoordinate) dependency).getDependency();
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.aether.graph` is unnecessary, and can be replaced with an import
in `maven-core/src/main/java/org/apache/maven/internal/impl/DefaultSession.java`
#### Snippet
```java
            return ((DefaultDependencyCoordinate) dependency).getDependency();
        } else {
            return new org.eclipse.aether.graph.Dependency(
                    new org.eclipse.aether.artifact.DefaultArtifact(
                            dependency.getGroupId(),
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.toolchain` is unnecessary and can be removed
in `maven-core/src/main/java/org/apache/maven/internal/impl/DefaultToolchainManager.java`
#### Snippet
```java
    public void storeToolchainToBuildContext(Session session, Toolchain toolchain) throws ToolchainManagerException {
        MavenSession s = ((DefaultSession) session).getMavenSession();
        org.apache.maven.toolchain.ToolchainPrivate tc =
                (org.apache.maven.toolchain.ToolchainPrivate) ((ToolchainWrapper) toolchain).toolchain;
        toolchainManagerPrivate.storeToolchainToBuildContext(tc, s);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.toolchain` is unnecessary and can be removed
in `maven-core/src/main/java/org/apache/maven/internal/impl/DefaultToolchainManager.java`
#### Snippet
```java
        MavenSession s = ((DefaultSession) session).getMavenSession();
        org.apache.maven.toolchain.ToolchainPrivate tc =
                (org.apache.maven.toolchain.ToolchainPrivate) ((ToolchainWrapper) toolchain).toolchain;
        toolchainManagerPrivate.storeToolchainToBuildContext(tc, s);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.aether.repository` is unnecessary and can be removed
in `maven-core/src/main/java/org/apache/maven/internal/impl/DefaultRepositoryFactory.java`
#### Snippet
```java
    }

    public static org.eclipse.aether.repository.RepositoryPolicy buildRepositoryPolicy(
            org.apache.maven.api.model.RepositoryPolicy policy) {
        boolean enabled = true;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.aether.repository` is unnecessary and can be removed
in `maven-core/src/main/java/org/apache/maven/internal/impl/DefaultRepositoryFactory.java`
#### Snippet
```java
            }
        }
        return new org.eclipse.aether.repository.RepositoryPolicy(enabled, updatePolicy, checksumPolicy);
    }
}
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.aether.graph` is unnecessary, and can be replaced with an import
in `maven-core/src/main/java/org/apache/maven/internal/impl/AbstractSession.java`
#### Snippet
```java
    }

    public Node getNode(org.eclipse.aether.graph.DependencyNode node, boolean verbose) {
        return allNodes.computeIfAbsent(node, n -> new DefaultNode(this, n, verbose));
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.aether.graph` is unnecessary, and can be replaced with an import
in `maven-core/src/main/java/org/apache/maven/internal/impl/AbstractSession.java`
#### Snippet
```java
    }

    public Node getNode(org.eclipse.aether.graph.DependencyNode node) {
        return getNode(node, false);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.aether.graph` is unnecessary, and can be replaced with an import
in `maven-core/src/main/java/org/apache/maven/internal/impl/AbstractSession.java`
#### Snippet
```java

    private final List<Listener> listeners = new CopyOnWriteArrayList<>();
    private final Map<org.eclipse.aether.graph.DependencyNode, Node> allNodes =
            Collections.synchronizedMap(new WeakHashMap<>());
    private final Map<org.eclipse.aether.artifact.Artifact, Artifact> allArtifacts =
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.api` is unnecessary, and can be replaced with an import
in `maven-core/src/main/java/org/apache/maven/execution/scope/internal/MojoExecutionScopeModule.java`
#### Snippet
```java
                .in(scope);
        bind(Log.class).toProvider(MojoExecutionScope.seededKeyProvider()).in(scope);
        bind(org.apache.maven.api.Project.class)
                .toProvider(MojoExecutionScope.seededKeyProvider())
                .in(scope);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.aether` is unnecessary and can be removed
in `maven-core/src/main/java/org/apache/maven/project/DefaultProjectBuilder.java`
#### Snippet
```java
    private final ProjectBuildingHelper projectBuildingHelper;
    private final MavenRepositorySystem repositorySystem;
    private final org.eclipse.aether.RepositorySystem repoSystem;
    private final RemoteRepositoryManager repositoryManager;
    private final ProjectDependenciesResolver dependencyResolver;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.aether.resolution` is unnecessary, and can be replaced with an import
in `maven-core/src/main/java/org/apache/maven/project/DefaultProjectBuilder.java`
#### Snippet
```java
            pomArtifact = pomResult.getArtifact();
            localProject = pomResult.getRepository() instanceof WorkspaceRepository;
        } catch (org.eclipse.aether.resolution.ArtifactResolutionException e) {
            if (e.getResults().get(0).isMissing() && allowStubModel) {
                return build(null, createStubModelSource(artifact), config);
```

## RuleId[ruleID=ThrowablePrintStackTrace]
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `maven-embedder/src/main/java/org/apache/maven/cli/logging/Slf4jConfigurationFactory.java`
#### Snippet
```java
            }
        } catch (IOException | ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `maven-core/src/main/java/org/apache/maven/toolchain/RequirementMatcherFactory.java`
#### Snippet
```java
            } catch (InvalidVersionSpecificationException ex) {
                // TODO error reporting
                ex.printStackTrace();
                return false;
            }
```

## RuleId[ruleID=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `AbstractStringBasedModelInterpolator()` of an abstract class should not be declared 'public'
in `maven-model-builder/src/main/java/org/apache/maven/model/interpolation/AbstractStringBasedModelInterpolator.java`
#### Snippet
```java

    @Inject
    public AbstractStringBasedModelInterpolator(PathTranslator pathTranslator, UrlNormalizer urlNormalizer) {
        this.pathTranslator = pathTranslator;
        this.urlNormalizer = urlNormalizer;
```

### NonProtectedConstructorInAbstractClass
Constructor `NodeBufferingParser()` of an abstract class should not be declared 'public'
in `maven-model-transform/src/main/java/org/apache/maven/model/transform/pull/NodeBufferingParser.java`
#### Snippet
```java
    private boolean buffering;

    public NodeBufferingParser(XmlPullParser xmlPullParser, String nodeName) {
        super(xmlPullParser);
        this.nodeName = Objects.requireNonNull(nodeName);
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractMojoExecutionException()` of an abstract class should not be declared 'public'
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/AbstractMojoExecutionException.java`
#### Snippet
```java
    protected String longMessage;

    public AbstractMojoExecutionException(String message) {
        super(message);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractMojoExecutionException()` of an abstract class should not be declared 'public'
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/AbstractMojoExecutionException.java`
#### Snippet
```java
    }

    public AbstractMojoExecutionException(String message, Throwable cause) {
        super(message, cause);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractMojoExecutionException()` of an abstract class should not be declared 'public'
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/AbstractMojoExecutionException.java`
#### Snippet
```java
     * @since 3.8.3
     */
    public AbstractMojoExecutionException(Throwable cause) {
        super(cause);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `BaseObject()` of an abstract class should not be declared 'public'
in `maven-model/src/main/java/org/apache/maven/model/BaseObject.java`
#### Snippet
```java
    protected Object delegate;

    public BaseObject() {}

    public BaseObject(Object delegate, BaseObject parent) {
```

### NonProtectedConstructorInAbstractClass
Constructor `BaseObject()` of an abstract class should not be declared 'public'
in `maven-model/src/main/java/org/apache/maven/model/BaseObject.java`
#### Snippet
```java
    public BaseObject() {}

    public BaseObject(Object delegate, BaseObject parent) {
        this.delegate = delegate;
        this.childrenTracking = parent != null ? parent::replace : null;
```

### NonProtectedConstructorInAbstractClass
Constructor `BaseObject()` of an abstract class should not be declared 'public'
in `maven-model/src/main/java/org/apache/maven/model/BaseObject.java`
#### Snippet
```java
    }

    public BaseObject(Object delegate, ChildrenTracking parent) {
        this.delegate = delegate;
        this.childrenTracking = parent;
```

## RuleId[ruleID=Java8MapApi]
### Java8MapApi
Can be replaced with single 'Map.computeIfAbsent' method call
in `maven-embedder/src/main/java/org/apache/maven/cli/MavenCli.java`
#### Snippet
```java
        if (StringUtils.isNotEmpty(summary.getReference())) {
            referenceKey = references.get(summary.getReference());
            if (referenceKey == null) {
                referenceKey = "[Help " + (references.size() + 1) + "]";
                references.put(summary.getReference(), referenceKey);
```

## RuleId[ruleID=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `path`
in `maven-compat/src/main/java/org/apache/maven/project/path/DefaultPathTranslator.java`
#### Snippet
```java
        if (path != null) {
            if (path.startsWith("/") || path.startsWith("\\")) {
                path = path.substring(1);
            }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `s`
in `maven-compat/src/main/java/org/apache/maven/project/path/DefaultPathTranslator.java`
#### Snippet
```java
                if (s.length() > basedirExpr.length()) {
                    // Take out basedir expression and the leading slash
                    s = chopLeadingFileSeparator(s.substring(basedirExpr.length()));
                } else {
                    s = ".";
```

### AssignmentToMethodParameter
Assignment to method parameter `s`
in `maven-compat/src/main/java/org/apache/maven/project/path/DefaultPathTranslator.java`
#### Snippet
```java
                    s = chopLeadingFileSeparator(s.substring(basedirExpr.length()));
                } else {
                    s = ".";
                }
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `path`
in `maven-compat/src/main/java/org/apache/maven/project/path/DefaultPathTranslator.java`
#### Snippet
```java
        }

        path = path.trim();

        String base = basedir.getAbsolutePath();
```

### AssignmentToMethodParameter
Assignment to method parameter `path`
in `maven-compat/src/main/java/org/apache/maven/project/path/DefaultPathTranslator.java`
#### Snippet
```java
        String base = basedir.getAbsolutePath();
        if (path.startsWith(base)) {
            path = chopLeadingFileSeparator(path.substring(base.length()));
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `path`
in `maven-compat/src/main/java/org/apache/maven/project/path/DefaultPathTranslator.java`
#### Snippet
```java

        if (path.length() <= 0) {
            path = ".";
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `path`
in `maven-compat/src/main/java/org/apache/maven/project/path/DefaultPathTranslator.java`
#### Snippet
```java

        if (!new File(path).isAbsolute()) {
            path = path.replace('\\', '/');
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `expression`
in `maven-compat/src/main/java/org/apache/maven/project/interpolation/PathTranslatingPostProcessor.java`
#### Snippet
```java

    public Object execute(String expression, Object value) {
        expression = ValueSourceUtils.trimPrefix(expression, expressionPrefixes, true);

        if (projectDir != null && value != null && unprefixedPathKeys.contains(expression)) {
```

### AssignmentToMethodParameter
Assignment to method parameter `repository`
in `maven-compat/src/main/java/org/apache/maven/artifact/manager/DefaultWagonManager.java`
#### Snippet
```java
            log.debug("Using mirror: " + mirror.getUrl() + " (id: " + id + ")");

            repository = artifactRepositoryFactory.createArtifactRepository(
                    id, mirror.getUrl(), repository.getLayout(), repository.getSnapshots(), repository.getReleases());
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `model`
in `maven-compat/src/main/java/org/apache/maven/project/interpolation/AbstractStringBasedModelInterpolator.java`
#### Snippet
```java
        MavenXpp3Reader modelReader = new MavenXpp3Reader();
        try {
            model = modelReader.read(sReader);
        } catch (IOException | XmlPullParserException e) {
            throw new ModelInterpolationException(
```

### AssignmentToMethodParameter
Assignment to method parameter `snapshots`
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/DefaultArtifactRepository.java`
#### Snippet
```java

        if (snapshots == null) {
            snapshots = new ArtifactRepositoryPolicy(
                    true,
                    ArtifactRepositoryPolicy.UPDATE_POLICY_ALWAYS,
```

### AssignmentToMethodParameter
Assignment to method parameter `releases`
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/DefaultArtifactRepository.java`
#### Snippet
```java

        if (releases == null) {
            releases = new ArtifactRepositoryPolicy(
                    true,
                    ArtifactRepositoryPolicy.UPDATE_POLICY_ALWAYS,
```

### AssignmentToMethodParameter
Assignment to method parameter `snapshots`
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/repository/DefaultArtifactRepositoryFactory.java`
#### Snippet
```java
            ArtifactRepositoryPolicy releases) {
        if (snapshots == null) {
            snapshots = new ArtifactRepositoryPolicy();
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `releases`
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/repository/DefaultArtifactRepositoryFactory.java`
#### Snippet
```java

        if (releases == null) {
            releases = new ArtifactRepositoryPolicy();
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `path`
in `maven-model-builder/src/main/java/org/apache/maven/model/path/DefaultPathTranslator.java`
#### Snippet
```java

        if (path != null && basedir != null) {
            path = path.replace('\\', File.separatorChar).replace('/', File.separatorChar);

            File file = new File(path);
```

### AssignmentToMethodParameter
Assignment to method parameter `repositoryLayout`
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
            ArtifactRepositoryPolicy releases) {
        if (repositoryLayout == null) {
            repositoryLayout = layouts.get("default");
        }
        return artifactRepositoryFactory.createArtifactRepository(
```

### AssignmentToMethodParameter
Assignment to method parameter `url`
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
    private String canonicalFileUrl(String url) throws IOException {
        if (!url.startsWith("file:")) {
            url = "file://" + url;
        } else if (url.startsWith("file:") && !url.startsWith("file://")) {
            url = "file://" + url.substring("file:".length());
```

### AssignmentToMethodParameter
Assignment to method parameter `url`
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
            url = "file://" + url;
        } else if (url.startsWith("file:") && !url.startsWith("file://")) {
            url = "file://" + url.substring("file:".length());
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `url`
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java

        if (!localRepository.isAbsolute()) {
            url = "file://" + localRepository.getCanonicalPath();
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `maven-model-builder/src/main/java/org/apache/maven/model/profile/activation/JdkVersionProfileActivator.java`
#### Snippet
```java
        }

        value = value.replaceAll("[^0-9\\.\\-\\_]", "");

        List<String> valueTokens = new ArrayList<>(Arrays.asList(value.split("[\\.\\-\\_]")));
```

### AssignmentToMethodParameter
Assignment to method parameter `relPath`
in `maven-model-builder/src/main/java/org/apache/maven/model/building/FileModelSource.java`
#### Snippet
```java
    @Override
    public ModelSource2 getRelatedSource(String relPath) {
        relPath = relPath.replace('\\', File.separatorChar).replace('/', File.separatorChar);

        File relatedPom = new File(getFile().getParentFile(), relPath);
```

### AssignmentToMethodParameter
Assignment to method parameter `modelId`
in `maven-model-builder/src/main/java/org/apache/maven/model/building/ModelBuildingException.java`
#### Snippet
```java
            DefaultModelBuildingResult tmp = new DefaultModelBuildingResult();
            if (modelId == null) {
                modelId = "";
            }
            tmp.addModelId(modelId);
```

### AssignmentToMethodParameter
Assignment to method parameter `fieldName`
in `maven-model-builder/src/main/java/org/apache/maven/model/validation/DefaultModelValidator.java`
#### Snippet
```java
                int idx = fieldName.lastIndexOf('.');
                if (idx >= 0) {
                    fieldName = fieldName.substring(idx + 1);
                    key = fieldName;
                }
```

### AssignmentToMethodParameter
Assignment to method parameter `expression`
in `maven-model-builder/src/main/java/org/apache/maven/model/interpolation/PathTranslatingPostProcessor.java`
#### Snippet
```java
    public Object execute(String expression, Object value) {
        if (value != null) {
            expression = ValueSourceUtils.trimPrefix(expression, expressionPrefixes, true);

            if (unprefixedPathKeys.contains(expression)) {
```

### AssignmentToMethodParameter
Assignment to method parameter `timestampFormat`
in `maven-model-builder/src/main/java/org/apache/maven/model/interpolation/MavenBuildTimestamp.java`
#### Snippet
```java
    public MavenBuildTimestamp(Date time, String timestampFormat) {
        if (timestampFormat == null) {
            timestampFormat = DEFAULT_BUILD_TIMESTAMP_FORMAT;
        }
        if (time == null) {
```

### AssignmentToMethodParameter
Assignment to method parameter `time`
in `maven-model-builder/src/main/java/org/apache/maven/model/interpolation/MavenBuildTimestamp.java`
#### Snippet
```java
        }
        if (time == null) {
            time = new Date();
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat(timestampFormat);
```

### AssignmentToMethodParameter
Assignment to method parameter `line`
in `maven-settings-builder/src/main/java/org/apache/maven/settings/building/DefaultSettingsProblemCollector.java`
#### Snippet
```java
        if (line <= 0 && column <= 0 && (cause instanceof SettingsParseException)) {
            SettingsParseException e = (SettingsParseException) cause;
            line = e.getLineNumber();
            column = e.getColumnNumber();
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `column`
in `maven-settings-builder/src/main/java/org/apache/maven/settings/building/DefaultSettingsProblemCollector.java`
#### Snippet
```java
            SettingsParseException e = (SettingsParseException) cause;
            line = e.getLineNumber();
            column = e.getColumnNumber();
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `spaces`
in `maven-embedder/src/main/java/org/apache/maven/cli/transfer/ConsoleMavenTransferListener.java`
#### Snippet
```java
            int n = Math.min(spaces, block.length());
            buffer.append(block, 0, n);
            spaces -= n;
        }
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `unit`
in `maven-embedder/src/main/java/org/apache/maven/cli/transfer/AbstractMavenTransferListener.java`
#### Snippet
```java

            if (unit == null) {
                unit = ScaleUnit.getScaleUnit(size);
            }

```

### AssignmentToMethodParameter
Assignment to method parameter `indent`
in `maven-embedder/src/main/java/org/apache/maven/cli/MavenCli.java`
#### Snippet
```java
        }

        indent += "  ";

        for (ExceptionSummary child : summary.getChildren()) {
```

### AssignmentToMethodParameter
Assignment to method parameter `threadConfiguration`
in `maven-embedder/src/main/java/org/apache/maven/cli/MavenCli.java`
#### Snippet
```java
    int calculateDegreeOfConcurrency(String threadConfiguration) {
        if (threadConfiguration.endsWith("C")) {
            threadConfiguration = threadConfiguration.substring(0, threadConfiguration.length() - 1);

            if (!NumberUtils.isParsable(threadConfiguration)) {
```

### AssignmentToMethodParameter
Assignment to method parameter `t`
in `maven-slf4j-provider/src/main/java/org/slf4j/impl/MavenSimpleLogger.java`
#### Snippet
```java
            }

            t = t.getCause();
            if (t != null) {
                stream.print(buffer().strong("Caused by").a(": ").a(t.getClass().getName()));
```

### AssignmentToMethodParameter
Assignment to method parameter `reader`
in `maven-xml-impl/src/main/java/org/apache/maven/internal/xml/Xpp3DomBuilder.java`
#### Snippet
```java
            final Xpp3Dom xpp3Dom = build(parser, trim, locationBuilder);
            reader.close();
            reader = null;

            return xpp3Dom;
```

### AssignmentToMethodParameter
Assignment to method parameter `is`
in `maven-xml-impl/src/main/java/org/apache/maven/internal/xml/Xpp3DomBuilder.java`
#### Snippet
```java
            final Xpp3Dom xpp3Dom = build(parser, trim);
            is.close();
            is = null;

            return xpp3Dom;
```

### AssignmentToMethodParameter
Assignment to method parameter `o`
in `maven-settings/src/main/java/org/apache/maven/settings/WrapperProperties.java`
#### Snippet
```java
    public synchronized boolean equals(Object o) {
        if (o instanceof WrapperProperties) {
            o = ((WrapperProperties) o).getter.get();
        }
        return getter.get().equals(o);
```

### AssignmentToMethodParameter
Assignment to method parameter `classifier`
in `maven-artifact/src/main/java/org/apache/maven/artifact/DefaultArtifact.java`
#### Snippet
```java

        if (classifier == null) {
            classifier = artifactHandler.getClassifier();
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `updatePolicy`
in `maven-artifact/src/main/java/org/apache/maven/artifact/repository/ArtifactRepositoryPolicy.java`
#### Snippet
```java

        if (updatePolicy == null) {
            updatePolicy = UPDATE_POLICY_DAILY;
        }
        this.updatePolicy = updatePolicy;
```

### AssignmentToMethodParameter
Assignment to method parameter `checksumPolicy`
in `maven-artifact/src/main/java/org/apache/maven/artifact/repository/ArtifactRepositoryPolicy.java`
#### Snippet
```java

        if (checksumPolicy == null) {
            checksumPolicy = DEFAULT_CHECKSUM_POLICY;
        }
        this.checksumPolicy = checksumPolicy;
```

### AssignmentToMethodParameter
Assignment to method parameter `buf`
in `maven-artifact/src/main/java/org/apache/maven/artifact/versioning/ComparableVersion.java`
#### Snippet
```java
    private static Item parseItem(boolean isDigit, String buf) {
        if (isDigit) {
            buf = stripLeadingZeroes(buf);
            if (buf.length() <= MAX_INTITEM_LENGTH) {
                // lower than 2^31
```

### AssignmentToMethodParameter
Assignment to method parameter `version`
in `maven-artifact/src/main/java/org/apache/maven/artifact/versioning/ComparableVersion.java`
#### Snippet
```java
        items = new ListItem();

        version = version.toLowerCase(Locale.ENGLISH);

        ListItem list = items;
```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `maven-artifact/src/main/java/org/apache/maven/artifact/versioning/ComparableVersion.java`
#### Snippet
```java
                switch (value.charAt(0)) {
                    case 'a':
                        value = "alpha";
                        break;
                    case 'b':
```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `maven-artifact/src/main/java/org/apache/maven/artifact/versioning/ComparableVersion.java`
#### Snippet
```java
                        break;
                    case 'b':
                        value = "beta";
                        break;
                    case 'm':
```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `maven-artifact/src/main/java/org/apache/maven/artifact/versioning/ComparableVersion.java`
#### Snippet
```java
                        break;
                    case 'm':
                        value = "milestone";
                        break;
                    default:
```

### AssignmentToMethodParameter
Assignment to method parameter `artifact`
in `maven-resolver-provider/src/main/java/org/apache/maven/repository/internal/RemoteSnapshotMetadataGenerator.java`
#### Snippet
```java
            RemoteSnapshotMetadata snapshotMetadata = snapshots.get(key);
            if (snapshotMetadata != null) {
                artifact = artifact.setVersion(snapshotMetadata.getExpandedVersion(artifact));
            }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `conflictResolvers`
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/resolver/DefaultLegacyArtifactCollector.java`
#### Snippet
```java

        if (conflictResolvers == null) {
            conflictResolvers = Collections.singletonList(defaultConflictResolver);
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `snapshots`
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java
            ArtifactRepositoryPolicy releases) {
        if (snapshots == null) {
            snapshots = new ArtifactRepositoryPolicy();
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `releases`
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java

        if (releases == null) {
            releases = new ArtifactRepositoryPolicy();
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `file`
in `maven-core/src/main/java/org/apache/maven/plugin/PluginParameterExpressionEvaluatorV4.java`
#### Snippet
```java
            } else if (file.getPath().startsWith(File.separator)) {
                // drive-relative Windows path, don't align with project directory but with drive root
                file = file.getAbsoluteFile();
            } else {
                // an ordinary relative path, align with project directory
```

### AssignmentToMethodParameter
Assignment to method parameter `file`
in `maven-core/src/main/java/org/apache/maven/plugin/PluginParameterExpressionEvaluatorV4.java`
#### Snippet
```java
            } else {
                // an ordinary relative path, align with project directory
                file = basedir.resolve(file.getPath())
                        .normalize()
                        .toAbsolutePath()
```

### AssignmentToMethodParameter
Assignment to method parameter `expr`
in `maven-core/src/main/java/org/apache/maven/plugin/PluginParameterExpressionEvaluatorV4.java`
#### Snippet
```java
    private String stripTokens(String expr) {
        if (expr.startsWith("${") && (expr.indexOf('}') == expr.length() - 1)) {
            expr = expr.substring(2, expr.length() - 1);
        }
        return expr;
```

### AssignmentToMethodParameter
Assignment to method parameter `expr`
in `maven-core/src/main/java/org/apache/maven/plugin/PluginParameterExpressionEvaluator.java`
#### Snippet
```java
    private String stripTokens(String expr) {
        if (expr.startsWith("${") && (expr.indexOf('}') == expr.length() - 1)) {
            expr = expr.substring(2, expr.length() - 1);
        }
        return expr;
```

### AssignmentToMethodParameter
Assignment to method parameter `file`
in `maven-core/src/main/java/org/apache/maven/plugin/PluginParameterExpressionEvaluator.java`
#### Snippet
```java
            } else if (file.getPath().startsWith(File.separator)) {
                // drive-relative Windows path, don't align with project directory but with drive root
                file = file.getAbsoluteFile();
            } else {
                // an ordinary relative path, align with project directory
```

### AssignmentToMethodParameter
Assignment to method parameter `file`
in `maven-core/src/main/java/org/apache/maven/plugin/PluginParameterExpressionEvaluator.java`
#### Snippet
```java
            } else {
                // an ordinary relative path, align with project directory
                file = new File(new File(basedir, file.getPath()).toURI().normalize()).getAbsoluteFile();
            }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `pluginArtifact`
in `maven-core/src/main/java/org/apache/maven/plugin/internal/DefaultPluginDependenciesResolver.java`
#### Snippet
```java

        if (pluginArtifact == null) {
            pluginArtifact = toArtifact(plugin, session);
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `originalScope`
in `maven-core/src/main/java/org/apache/maven/project/artifact/MavenMetadataSource.java`
#### Snippet
```java

        if (originalScope == null) {
            originalScope = Artifact.SCOPE_COMPILE;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `session`
in `maven-core/src/main/java/org/apache/maven/artifact/repository/LegacyLocalRepositoryManager.java`
#### Snippet
```java
            }
        } else {
            session = new DefaultRepositorySystemSession();
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `path`
in `maven-core/src/main/java/org/apache/maven/project/MavenProject.java`
#### Snippet
```java
    public void addScriptSourceRoot(String path) {
        if (path != null) {
            path = path.trim();
            if (path.length() != 0) {
                if (!getScriptSourceRoots().contains(path)) {
```

### AssignmentToMethodParameter
Assignment to method parameter `path`
in `maven-core/src/main/java/org/apache/maven/project/MavenProject.java`
#### Snippet
```java
    private void addPath(List<String> paths, String path) {
        if (path != null) {
            path = path.trim();
            if (path.length() > 0) {
                File file = new File(path);
```

### AssignmentToMethodParameter
Assignment to method parameter `path`
in `maven-core/src/main/java/org/apache/maven/project/MavenProject.java`
#### Snippet
```java
                File file = new File(path);
                if (file.isAbsolute()) {
                    path = file.getAbsolutePath();
                } else if (".".equals(path)) {
                    path = getBasedir().getAbsolutePath();
```

### AssignmentToMethodParameter
Assignment to method parameter `path`
in `maven-core/src/main/java/org/apache/maven/project/MavenProject.java`
#### Snippet
```java
                    path = file.getAbsolutePath();
                } else if (".".equals(path)) {
                    path = getBasedir().getAbsolutePath();
                } else {
                    path = new File(getBasedir(), path).getAbsolutePath();
```

### AssignmentToMethodParameter
Assignment to method parameter `path`
in `maven-core/src/main/java/org/apache/maven/project/MavenProject.java`
#### Snippet
```java
                    path = getBasedir().getAbsolutePath();
                } else {
                    path = new File(getBasedir(), path).getAbsolutePath();
                }

```

### AssignmentToMethodParameter
Assignment to method parameter `message`
in `maven-core/src/main/java/org/apache/maven/exception/DefaultExceptionHandler.java`
#### Snippet
```java
            }

            message = "The build could not read " + children.size() + " project" + (children.size() == 1 ? "" : "s");
        } else {
            message = getMessage(message, exception);
```

### AssignmentToMethodParameter
Assignment to method parameter `message`
in `maven-core/src/main/java/org/apache/maven/exception/DefaultExceptionHandler.java`
#### Snippet
```java
            message = "The build could not read " + children.size() + " project" + (children.size() == 1 ? "" : "s");
        } else {
            message = getMessage(message, exception);
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `scopesToCollect`
in `maven-core/src/main/java/org/apache/maven/lifecycle/internal/LifecycleDependencyResolver.java`
#### Snippet
```java
            throws LifecycleExecutionException {
        if (scopesToCollect == null) {
            scopesToCollect = Collections.emptySet();
        }
        if (scopesToResolve == null) {
```

### AssignmentToMethodParameter
Assignment to method parameter `scopesToResolve`
in `maven-core/src/main/java/org/apache/maven/lifecycle/internal/LifecycleDependencyResolver.java`
#### Snippet
```java
        }
        if (scopesToResolve == null) {
            scopesToResolve = Collections.emptySet();
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `scopesToCollect`
in `maven-core/src/main/java/org/apache/maven/lifecycle/internal/LifecycleDependencyResolver.java`
#### Snippet
```java
        }

        scopesToCollect = new HashSet<>(scopesToCollect);
        scopesToCollect.addAll(scopesToResolve);

```

### AssignmentToMethodParameter
Assignment to method parameter `artifact`
in `maven-core/src/main/java/org/apache/maven/repository/DelegatingLocalArtifactRepository.java`
#### Snippet
```java
    public Artifact find(Artifact artifact) {
        if (!artifact.isRelease() && buildReactor != null) {
            artifact = buildReactor.find(artifact);
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `artifact`
in `maven-core/src/main/java/org/apache/maven/repository/DelegatingLocalArtifactRepository.java`
#### Snippet
```java

        if (!artifact.isResolved() && ideWorkspace != null) {
            artifact = ideWorkspace.find(artifact);
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `artifact`
in `maven-core/src/main/java/org/apache/maven/repository/DelegatingLocalArtifactRepository.java`
#### Snippet
```java

        if (!artifact.isResolved()) {
            artifact = userLocalArtifactRepository.find(artifact);
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `modelClass`
in `api/modello-plugin-velocity/src/main/java/org/codehaus/modello/plugin/velocity/Helper.java`
#### Snippet
```java
            if (superClass != null) {
                // superClass can be located outside (not generated by modello)
                modelClass = modelClass.getModel().getClass(superClass, version, true);
            } else {
                modelClass = null;
```

### AssignmentToMethodParameter
Assignment to method parameter `modelClass`
in `api/modello-plugin-velocity/src/main/java/org/codehaus/modello/plugin/velocity/Helper.java`
#### Snippet
```java
                modelClass = modelClass.getModel().getClass(superClass, version, true);
            } else {
                modelClass = null;
            }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `modelClass`
in `api/modello-plugin-velocity/src/main/java/org/codehaus/modello/plugin/velocity/Helper.java`
#### Snippet
```java
        List<ModelField> fields = new ArrayList<>();
        for (int i = classes.size() - 1; i >= 0; i--) {
            modelClass = classes.get(i);
            Iterator<ModelField> parentIter = fields.iterator();
            fields = new ArrayList<>();
```

### AssignmentToMethodParameter
Assignment to method parameter `o`
in `maven-model/src/main/java/org/apache/maven/model/WrapperProperties.java`
#### Snippet
```java
    public synchronized boolean equals(Object o) {
        if (o instanceof WrapperProperties) {
            o = ((WrapperProperties) o).getter.get();
        }
        return getter.get().equals(o);
```

### AssignmentToMethodParameter
Assignment to method parameter `o`
in `maven-toolchain-model/src/main/java/org/apache/maven/toolchain/model/WrapperProperties.java`
#### Snippet
```java
    public synchronized boolean equals(Object o) {
        if (o instanceof WrapperProperties) {
            o = ((WrapperProperties) o).getter.get();
        }
        return getter.get().equals(o);
```

### AssignmentToMethodParameter
Assignment to method parameter `parentImports`
in `maven-core/src/main/java/org/apache/maven/classrealm/DefaultClassRealmManager.java`
#### Snippet
```java

        if (parentImports != null) {
            parentImports = new ArrayList<>(parentImports);
        } else {
            parentImports = new ArrayList<>();
```

### AssignmentToMethodParameter
Assignment to method parameter `parentImports`
in `maven-core/src/main/java/org/apache/maven/classrealm/DefaultClassRealmManager.java`
#### Snippet
```java
            parentImports = new ArrayList<>(parentImports);
        } else {
            parentImports = new ArrayList<>();
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `foreignImports`
in `maven-core/src/main/java/org/apache/maven/classrealm/DefaultClassRealmManager.java`
#### Snippet
```java

        if (foreignImports != null) {
            foreignImports = new TreeMap<>(foreignImports);
        } else {
            foreignImports = new TreeMap<>();
```

### AssignmentToMethodParameter
Assignment to method parameter `foreignImports`
in `maven-core/src/main/java/org/apache/maven/classrealm/DefaultClassRealmManager.java`
#### Snippet
```java
            foreignImports = new TreeMap<>(foreignImports);
        } else {
            foreignImports = new TreeMap<>();
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `parent`
in `maven-core/src/main/java/org/apache/maven/classrealm/DefaultClassRealmManager.java`
#### Snippet
```java

        if (parent == null) {
            parent = PARENT_CLASSLOADER;
        }

```

## RuleId[ruleID=SynchronizationOnLocalVariableOrMethodParameter]
### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on method parameter `systemProperties`
in `maven-model-builder/src/main/java/org/apache/maven/model/building/DefaultModelBuildingRequest.java`
#### Snippet
```java
        if (systemProperties != null) {
            this.systemProperties = new Properties();
            synchronized (systemProperties) { // avoid concurrent modification if someone else sets/removes an unrelated
                // system property
                this.systemProperties.putAll(systemProperties);
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on method parameter `systemProperties`
in `maven-settings-builder/src/main/java/org/apache/maven/settings/building/DefaultSettingsBuildingRequest.java`
#### Snippet
```java
        if (systemProperties != null) {
            this.systemProperties = new Properties();
            synchronized (systemProperties) { // avoid concurrent modification if someone else sets/removes an unrelated
                // system property
                this.systemProperties.putAll(systemProperties);
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on method parameter `properties`
in `maven-core/src/main/java/org/apache/maven/properties/internal/SystemProperties.java`
#### Snippet
```java
        final Properties copyProperties = new Properties();
        // guard against modification/removal of keys in the given properties (MNG-5670, MNG-6053, MNG-6105)
        synchronized (properties) {
            copyProperties.putAll(properties);
        }
```

## RuleId[ruleID=ReturnNull]
### ReturnNull
Return of `null`
in `maven-compat/src/main/java/org/apache/maven/project/interpolation/BuildTimestampValueSource.java`
#### Snippet
```java
        }

        return null;
    }
}
```

### ReturnNull
Return of `null`
in `maven-compat/src/main/java/org/apache/maven/project/path/DefaultPathTranslator.java`
#### Snippet
```java

        if (path == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `maven-compat/src/main/java/org/apache/maven/project/path/DefaultPathTranslator.java`
#### Snippet
```java

        if (path == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `maven-compat/src/main/java/org/apache/maven/artifact/manager/DefaultWagonManager.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `maven-compat/src/main/java/org/apache/maven/project/interpolation/AbstractStringBasedModelInterpolator.java`
#### Snippet
```java
                            return projectDir.getAbsoluteFile().toPath().toUri().toASCIIString();
                        }
                        return null;
                    }
                },
```

### ReturnNull
Return of `null`
in `maven-compat/src/main/java/org/apache/maven/project/interpolation/AbstractStringBasedModelInterpolator.java`
#### Snippet
```java
                            return projectDir.getAbsolutePath();
                        }
                        return null;
                    }
                },
```

### ReturnNull
Return of `null`
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/metadata/MetadataUtils.java`
#### Snippet
```java
    public static Metadata cloneMetadata(Metadata src) {
        if (src == null) {
            return null;
        }
        return src.clone();
```

### ReturnNull
Return of `null`
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/metadata/GroupRepositoryMetadata.java`
#### Snippet
```java

    public String getArtifactId() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/metadata/GroupRepositoryMetadata.java`
#### Snippet
```java

    public String getBaseVersion() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/metadata/GroupRepositoryMetadata.java`
#### Snippet
```java

    public ArtifactRepository getRepository() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/metadata/MetadataBridge.java`
#### Snippet
```java

    public File getFile() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/metadata/DefaultRepositoryMetadataManager.java`
#### Snippet
```java
        String metadataPath = localRepository.pathOfLocalRepositoryMetadata(metadata, localRepository);
        File metadataFile = new File(localRepository.getBasedir(), metadataPath);
        return metadataFile.isFile() ? new Date(metadataFile.lastModified()) : null;
    }

```

### ReturnNull
Return of `null`
in `maven-compat/src/main/java/org/apache/maven/project/interpolation/StringSearchModelInterpolator.java`
#### Snippet
```java
            }

            return null;
        }

```

### ReturnNull
Return of `null`
in `maven-compat/src/main/java/org/apache/maven/repository/DefaultMirrorSelector.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/TransferListenerAdapter.java`
#### Snippet
```java
    public static TransferListener newAdapter(ArtifactTransferListener listener) {
        if (listener == null) {
            return null;
        } else {
            return new TransferListenerAdapter(listener);
```

### ReturnNull
Return of `null`
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/TransferListenerAdapter.java`
#### Snippet
```java
    private ArtifactTransferEvent wrap(TransferEvent event) {
        if (event == null) {
            return null;
        } else {
            String wagon = event.getWagon().getClass().getName();
```

### ReturnNull
Return of `null`
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/TransferListenerAdapter.java`
#### Snippet
```java
    private ArtifactTransferResource wrap(Repository repository, Resource resource) {
        if (resource == null) {
            return null;
        } else {
            synchronized (artifacts) {
```

### ReturnNull
Return of `null`
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/DefaultUpdateCheckManager.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/DefaultUpdateCheckManager.java`
#### Snippet
```java
            return props.getProperty(key + ERROR_KEY_SUFFIX);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/DefaultUpdateCheckManager.java`
#### Snippet
```java
        if (!touchfile.canRead()) {
            getLogger().debug("Skipped unreadable resolution tracking file: " + touchfile);
            return null;
        }

```

### ReturnNull
Return of `null`
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/DefaultUpdateCheckManager.java`
#### Snippet
```java
                getLogger().debug("Failed to read resolution tracking file: " + touchfile, e);

                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/resolver/conflict/NewestConflictResolver.java`
#### Snippet
```java
            // TODO log message or throw exception?

            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/resolver/conflict/OldestConflictResolver.java`
#### Snippet
```java
            // TODO log message or throw exception?

            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `maven-compat/src/main/java/org/apache/maven/repository/metadata/MetadataResolutionResult.java`
#### Snippet
```java
            throws MetadataResolutionException, GraphConflictResolutionException {
        if (requestType == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `maven-compat/src/main/java/org/apache/maven/repository/metadata/MetadataResolutionResult.java`
#### Snippet
```java

        if (treeRoot == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `maven-compat/src/main/java/org/apache/maven/repository/metadata/MetadataResolutionResult.java`
#### Snippet
```java

        if (conflictResolver == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `maven-compat/src/main/java/org/apache/maven/repository/metadata/MetadataResolutionResult.java`
#### Snippet
```java
            return new MetadataGraph(getTree(), true, true);
        }
        return null;
    }
    // ----------------------------------------------------------------------------
```

### ReturnNull
Return of `null`
in `maven-compat/src/main/java/org/apache/maven/repository/metadata/MetadataResolutionResult.java`
#### Snippet
```java
    // ----------------------------------------------------------------------------
    public MetadataGraph getGraph() throws MetadataResolutionException {
        return treeRoot == null ? null : new MetadataGraph(treeRoot);
    }
    // ----------------------------------------------------------------------------
```

### ReturnNull
Return of `null`
in `maven-compat/src/main/java/org/apache/maven/repository/metadata/MetadataResolutionResult.java`
#### Snippet
```java
            throws MetadataGraphTransformationException, MetadataResolutionException {
        if (classpathTransformation == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `maven-compat/src/main/java/org/apache/maven/repository/metadata/MetadataResolutionResult.java`
#### Snippet
```java
        MetadataGraph dirtyGraph = getGraph();
        if (dirtyGraph == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `maven-compat/src/main/java/org/apache/maven/repository/metadata/MetadataResolutionResult.java`
#### Snippet
```java
            throws MetadataResolutionException, GraphConflictResolutionException {
        if (treeRoot == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `maven-compat/src/main/java/org/apache/maven/repository/metadata/MetadataResolutionResult.java`
#### Snippet
```java

        if (conflictResolver == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `maven-compat/src/main/java/org/apache/maven/repository/metadata/MetadataResolutionResult.java`
#### Snippet
```java
        ClasspathContainer cpc = getClasspath(scope);
        if (cpc == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `maven-compat/src/main/java/org/apache/maven/repository/metadata/DefaultClasspathTransformation.java`
#### Snippet
```java
        try {
            if (dirtyGraph == null || dirtyGraph.isEmpty()) {
                return null;
            }

```

### ReturnNull
Return of `null`
in `maven-compat/src/main/java/org/apache/maven/repository/metadata/DefaultClasspathTransformation.java`
#### Snippet
```java

            if (cleanGraph == null || cleanGraph.isEmpty()) {
                return null;
            }

```

### ReturnNull
Return of `null`
in `maven-compat/src/main/java/org/apache/maven/repository/metadata/ClasspathContainer.java`
#### Snippet
```java
    // -------------------------------------------------------------------------------------------
    public Iterator<ArtifactMetadata> iterator() {
        return classpath == null ? null : classpath.iterator();
    }

```

### ReturnNull
Return of `null`
in `maven-compat/src/main/java/org/apache/maven/repository/metadata/ClasspathContainer.java`
#### Snippet
```java
    public MetadataTreeNode getClasspathAsTree() throws MetadataResolutionException {
        if (classpath == null || classpath.size() < 1) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `maven-compat/src/main/java/org/apache/maven/repository/metadata/DefaultGraphConflictResolver.java`
#### Snippet
```java
            MetadataGraphVertex v, List<MetadataGraphEdge> edges, ArtifactScopeEnum scope) {
        if (edges == null || edges.isEmpty()) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `maven-compat/src/main/java/org/apache/maven/repository/metadata/DefaultGraphConflictResolver.java`
#### Snippet
```java
            }

            return null;
        }

```

### ReturnNull
Return of `null`
in `maven-compat/src/main/java/org/apache/maven/repository/metadata/DefaultGraphConflictResolver.java`
#### Snippet
```java

        if (graph == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `maven-compat/src/main/java/org/apache/maven/repository/metadata/DefaultGraphConflictResolver.java`
#### Snippet
```java
        final MetadataGraphVertex entry = graph.getEntry();
        if (entry == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `maven-compat/src/main/java/org/apache/maven/repository/metadata/DefaultGraphConflictResolver.java`
#### Snippet
```java

        if (graph.isEmptyEdges()) {
            return null; // no edges - nothing to worry about
        }

```

### ReturnNull
Return of `null`
in `maven-compat/src/main/java/org/apache/maven/repository/metadata/MetadataGraph.java`
#### Snippet
```java
        List<MetadataGraphEdge> edges = getIncidentEdges(vTo);
        if (edges == null || edges.isEmpty()) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `maven-compat/src/main/java/org/apache/maven/repository/metadata/MetadataGraph.java`
#### Snippet
```java
    public MetadataGraphVertex findVertex(ArtifactMetadata md) {
        if (md == null || vertices == null || vertices.size() < 1) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `maven-compat/src/main/java/org/apache/maven/repository/metadata/MetadataGraph.java`
#### Snippet
```java
        }

        return null;
    }
    // ------------------------------------------------------------------------
```

### ReturnNull
Return of `null`
in `maven-compat/src/main/java/org/apache/maven/repository/metadata/MetadataGraph.java`
#### Snippet
```java
    public MetadataGraphVertex addVertex(ArtifactMetadata md) {
        if (md == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `maven-model-builder/src/main/java/org/apache/maven/model/path/ProfileActivationFilePathInterpolator.java`
#### Snippet
```java
                        return basedir.getAbsolutePath();
                    }
                    return null;
                }
            });
```

### ReturnNull
Return of `null`
in `maven-model-builder/src/main/java/org/apache/maven/model/path/ProfileActivationFilePathInterpolator.java`
#### Snippet
```java
    public String interpolate(String path, ProfileActivationContext context) throws InterpolationException {
        if (path == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `maven-model-builder/src/main/java/org/apache/maven/model/path/ProfileActivationFilePathInterpolator.java`
#### Snippet
```java
            });
        } else if (path.contains("${basedir}")) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `maven-model-builder/src/main/java/org/apache/maven/model/path/DefaultModelPathTranslator.java`
#### Snippet
```java
    private String alignToBaseDirectory(String path, File basedir) {
        String newPath = pathTranslator.alignToBaseDirectory(path, basedir);
        return Objects.equals(path, newPath) ? null : newPath;
    }
}
```

### ReturnNull
Return of `null`
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
            return createArtifactRepository(id, url, getLayout(repo.getLayout()), snapshots, releases);
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
                    e);

            return null;
        }

```

### ReturnNull
Return of `null`
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
                            "Invalid version specification '%s' creating dependency artifact '%s'.", d.getVersion(), d),
                    e);
            return null;
        }

```

### ReturnNull
Return of `null`
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
                    e);

            return null;
        }

```

### ReturnNull
Return of `null`
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
    public List<ArtifactRepository> getEffectiveRepositories(List<ArtifactRepository> repositories) {
        if (repositories == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `maven-model-builder/src/main/java/org/apache/maven/model/plugin/DefaultReportingConverter.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `maven-model-builder/src/main/java/org/apache/maven/model/building/DefaultTransformerContext.java`
#### Snippet
```java

        public static Model deref(Holder holder) {
            return holder != null ? holder.get() : null;
        }

```

### ReturnNull
Return of `null`
in `maven-model-builder/src/main/java/org/apache/maven/model/building/FileModelSource.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `maven-model-builder/src/main/java/org/apache/maven/model/building/ModelCache.java`
#### Snippet
```java
    default <T> T get(String groupId, String artifactId, String version, ModelCacheTag<T> tag) {
        Object obj = get(groupId, artifactId, version, tag.getName());
        return (obj != null) ? tag.fromCache(tag.getType().cast(obj)) : null;
    }
}
```

### ReturnNull
Return of `null`
in `maven-model-builder/src/main/java/org/apache/maven/model/building/ModelCache.java`
#### Snippet
```java
    default <T> T get(Source path, ModelCacheTag<T> tag) {
        Object obj = get(path, tag.getName());
        return (obj != null) ? tag.fromCache(tag.getType().cast(obj)) : null;
    }

```

### ReturnNull
Return of `null`
in `maven-model-builder/src/main/java/org/apache/maven/model/building/ModelCache.java`
#### Snippet
```java
    default Object get(Source path, String tag) {
        // only useful for ReactorModelCache
        return null;
    }

```

### ReturnNull
Return of `null`
in `maven-model-builder/src/main/java/org/apache/maven/model/building/ModelBuildingException.java`
#### Snippet
```java
    public Model getModel() {
        if (result == null) {
            return null;
        }
        if (result.getEffectiveModel() != null) {
```

### ReturnNull
Return of `null`
in `maven-model-builder/src/main/java/org/apache/maven/model/building/ModelBuildingException.java`
#### Snippet
```java
            return toMessage(result.getModelIds().get(0), result.getProblems());
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `maven-model-builder/src/main/java/org/apache/maven/model/building/DefaultModelBuildingRequest.java`
#### Snippet
```java
    @Override
    public Model getRawModel() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `maven-model-builder/src/main/java/org/apache/maven/model/building/DefaultModelBuilder.java`
#### Snippet
```java
                        // gathered with problem collector
                    }
                    return null;
                }
            };
```

### ReturnNull
Return of `null`
in `maven-model-builder/src/main/java/org/apache/maven/model/building/DefaultModelBuilder.java`
#### Snippet
```java
                        }
                    }
                    return null;
                }

```

### ReturnNull
Return of `null`
in `maven-model-builder/src/main/java/org/apache/maven/model/building/DefaultModelBuilder.java`
#### Snippet
```java
            return modelCache.get(groupId, artifactId, version, tag);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `maven-model-builder/src/main/java/org/apache/maven/model/building/DefaultModelBuilder.java`
#### Snippet
```java
                            + dependency.getManagementKey() + " is missing.")
                    .setLocation(dependency.getLocation("")));
            return null;
        }
        if (artifactId == null || artifactId.length() <= 0) {
```

### ReturnNull
Return of `null`
in `maven-model-builder/src/main/java/org/apache/maven/model/building/DefaultModelBuilder.java`
#### Snippet
```java
                            + dependency.getManagementKey() + " is missing.")
                    .setLocation(dependency.getLocation("")));
            return null;
        }
        if (version == null || version.length() <= 0) {
```

### ReturnNull
Return of `null`
in `maven-model-builder/src/main/java/org/apache/maven/model/building/DefaultModelBuilder.java`
#### Snippet
```java
                            + dependency.getManagementKey() + " is missing.")
                    .setLocation(dependency.getLocation("")));
            return null;
        }

```

### ReturnNull
Return of `null`
in `maven-model-builder/src/main/java/org/apache/maven/model/building/DefaultModelBuilder.java`
#### Snippet
```java
            problems.add(new ModelProblemCollectorRequest(Severity.ERROR, Version.BASE).setMessage(message.toString()));

            return null;
        }

```

### ReturnNull
Return of `null`
in `maven-model-builder/src/main/java/org/apache/maven/model/building/DefaultModelBuilder.java`
#### Snippet
```java
        }

        return importMgmt != null ? new DependencyManagement(importMgmt) : null;
    }

```

### ReturnNull
Return of `null`
in `maven-model-builder/src/main/java/org/apache/maven/model/building/DefaultModelBuilder.java`
#### Snippet
```java
                        .setMessage(e.getMessage())
                        .setException(e));
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `maven-model-builder/src/main/java/org/apache/maven/model/building/DefaultModelBuilder.java`
#### Snippet
```java
                        .setLocation(dependency.getLocation(""))
                        .setException(e));
                return null;
            }

```

### ReturnNull
Return of `null`
in `maven-model-builder/src/main/java/org/apache/maven/model/building/DefaultModelBuilder.java`
#### Snippet
```java
            } catch (ModelBuildingException e) {
                problems.addAll(e.getProblems());
                return null;
            }

```

### ReturnNull
Return of `null`
in `maven-model-builder/src/main/java/org/apache/maven/model/building/DefaultModelBuilder.java`
#### Snippet
```java
            return modelCache.get(source, tag);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `maven-model-builder/src/main/java/org/apache/maven/model/building/DefaultModelBuilder.java`
#### Snippet
```java

            if (candidateSource == null) {
                return null;
            }

```

### ReturnNull
Return of `null`
in `maven-model-builder/src/main/java/org/apache/maven/model/building/DefaultModelBuilder.java`
#### Snippet
```java
            }
            if (candidateModel == null) {
                return null;
            }
            candidateSource = new FileModelSource(candidateModel.getPomFile());
```

### ReturnNull
Return of `null`
in `maven-model-builder/src/main/java/org/apache/maven/model/building/DefaultModelBuilder.java`
#### Snippet
```java
                    .setMessage(buffer.toString())
                    .setLocation(parent.getLocation("")));
            return null;
        }

```

### ReturnNull
Return of `null`
in `maven-model-builder/src/main/java/org/apache/maven/model/building/DefaultModelBuilder.java`
#### Snippet
```java
                if (!parentRange.hasRestrictions()) {
                    // the parent version is not a range, we have version skew, drop back to resolution from repo
                    return null;
                }
                if (!parentRange.containsVersion(new DefaultArtifactVersion(version))) {
```

### ReturnNull
Return of `null`
in `maven-model-builder/src/main/java/org/apache/maven/model/building/DefaultModelBuilder.java`
#### Snippet
```java
                if (!parentRange.containsVersion(new DefaultArtifactVersion(version))) {
                    // version skew drop back to resolution from the repository
                    return null;
                }

```

### ReturnNull
Return of `null`
in `maven-model-builder/src/main/java/org/apache/maven/model/building/DefaultModelBuilder.java`
#### Snippet
```java
            } catch (InvalidVersionSpecificationException e) {
                // invalid version range, so drop back to resolution from the repository
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `maven-model-builder/src/main/java/org/apache/maven/model/building/DefaultModelBuilder.java`
#### Snippet
```java
            Set<Source> sources = mappedSources.get(new DefaultTransformerContext.GAKey(groupId, artifactId));
            if (sources == null) {
                return null;
            }
            return sources.stream()
```

### ReturnNull
Return of `null`
in `maven-model-builder/src/main/java/org/apache/maven/model/building/DefaultModelBuilder.java`
#### Snippet
```java
    private ModelSource getParentPomFile(Model childModel, Source source) {
        if (!(source instanceof ModelSource2)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `maven-model-builder/src/main/java/org/apache/maven/model/building/DefaultModelBuilder.java`
#### Snippet
```java

        if (parentPath == null || parentPath.length() <= 0) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `maven-model-builder/src/main/java/org/apache/maven/model/validation/DefaultModelValidator.java`
#### Snippet
```java
        }

        return location != null ? new org.apache.maven.model.InputLocation(location) : null;
    }

```

### ReturnNull
Return of `null`
in `maven-model-builder/src/main/java/org/apache/maven/model/interpolation/AbstractStringBasedModelInterpolator.java`
#### Snippet
```java
                                return projectDir.getAbsolutePath();
                            }
                            return null;
                        }
                    },
```

### ReturnNull
Return of `null`
in `maven-model-builder/src/main/java/org/apache/maven/model/interpolation/AbstractStringBasedModelInterpolator.java`
#### Snippet
```java
                                        .toASCIIString();
                            }
                            return null;
                        }
                    },
```

### ReturnNull
Return of `null`
in `maven-model-builder/src/main/java/org/apache/maven/model/interpolation/BuildTimestampValueSource.java`
#### Snippet
```java
            return mavenBuildTimestamp.formattedTimestamp();
        }
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `maven-model-builder/src/main/java/org/apache/maven/model/interpolation/PathTranslatingPostProcessor.java`
#### Snippet
```java
        }

        return null;
    }
}
```

### ReturnNull
Return of `null`
in `maven-model-builder/src/main/java/org/apache/maven/model/interpolation/UrlNormalizingPostProcessor.java`
#### Snippet
```java
        }

        return null;
    }
}
```

### ReturnNull
Return of `null`
in `maven-toolchain-builder/src/main/java/org/apache/maven/toolchain/building/DefaultToolchainsBuilder.java`
#### Snippet
```java
                return value;
            }
            return null;
        });

```

### ReturnNull
Return of `null`
in `maven-settings-builder/src/main/java/org/apache/maven/settings/crypto/DefaultSettingsDecrypter.java`
#### Snippet
```java

    private String decrypt(String str) throws SecDispatcherException {
        return (str == null) ? null : securityDispatcher.decrypt(str);
    }
}
```

### ReturnNull
Return of `null`
in `maven-settings-builder/src/main/java/org/apache/maven/settings/crypto/DefaultSettingsDecryptionResult.java`
#### Snippet
```java
    @Override
    public Proxy getProxy() {
        return proxies.isEmpty() ? null : proxies.get(0);
    }

```

### ReturnNull
Return of `null`
in `maven-settings-builder/src/main/java/org/apache/maven/settings/crypto/DefaultSettingsDecryptionResult.java`
#### Snippet
```java
    @Override
    public Server getServer() {
        return servers.isEmpty() ? null : servers.get(0);
    }

```

### ReturnNull
Return of `null`
in `maven-settings-builder/src/main/java/org/apache/maven/settings/building/DefaultSettingsBuilder.java`
#### Snippet
```java
            return new FileSource(settingsFile);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `maven-settings-builder/src/main/java/org/apache/maven/settings/building/DefaultSettingsBuilder.java`
#### Snippet
```java
                return value;
            }
            return null;
        });

```

### ReturnNull
Return of `null`
in `maven-embedder/src/main/java/org/apache/maven/cli/ResolveFile.java`
#### Snippet
```java
    public static File resolveFile(File file, String baseDirectory) {
        if (file == null) {
            return null;
        } else if (file.isAbsolute()) {
            return file;
```

### ReturnNull
Return of `null`
in `maven-embedder/src/main/java/org/apache/maven/cli/CLIReportingUtils.java`
#### Snippet
```java

    private static String reduce(String s) {
        return (s != null ? (s.startsWith("${") && s.endsWith("}") ? null : s) : null);
    }

```

### ReturnNull
Return of `null`
in `maven-embedder/src/main/java/org/apache/maven/cli/CLIReportingUtils.java`
#### Snippet
```java

    private static String reduce(String s) {
        return (s != null ? (s.startsWith("${") && s.endsWith("}") ? null : s) : null);
    }

```

### ReturnNull
Return of `null`
in `maven-embedder/src/main/java/org/apache/maven/cli/logging/Slf4jStdoutLogger.java`
#### Snippet
```java
    //
    public String getName() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `maven-embedder/src/main/java/org/apache/maven/cli/logging/Slf4jLogger.java`
#### Snippet
```java
     */
    public Logger getChildLogger(String name) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `maven-embedder/src/main/java/org/apache/maven/cli/MavenCli.java`
#### Snippet
```java
            return MavenExecutionRequest.CHECKSUM_POLICY_WARN;
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `maven-embedder/src/main/java/org/apache/maven/cli/MavenCli.java`
#### Snippet
```java
            return MavenExecutionRequest.REACTOR_MAKE_BOTH;
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `maven-embedder/src/main/java/org/apache/maven/cli/MavenCli.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `api/maven-api-core/src/main/java/org/apache/maven/api/services/xml/XmlReaderRequest.java`
#### Snippet
```java
            @Override
            public URL getURL() {
                return null;
            }

```

### ReturnNull
Return of `null`
in `maven-xml-impl/src/main/java/org/apache/maven/internal/xml/Xpp3Dom.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `maven-model-transform/src/main/java/org/apache/maven/model/transform/BuildToRawPomXMLFilterFactory.java`
#### Snippet
```java

    protected BiFunction<String, String, String> getDependencyKeyToVersionMapper() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `maven-model-transform/src/main/java/org/apache/maven/model/transform/BuildToRawPomXMLFilterFactory.java`
#### Snippet
```java
     */
    protected Function<Path, Optional<RelativeProject>> getRelativePathMapper() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `maven-xml-impl/src/main/java/org/codehaus/plexus/util/xml/Xpp3Dom.java`
#### Snippet
```java
    public Xpp3Dom getChild(String name) {
        Dom child = dom.getChild(name);
        return child != null ? new Xpp3Dom(child, this) : null;
    }

```

### ReturnNull
Return of `null`
in `maven-model-transform/src/main/java/org/apache/maven/model/transform/pull/BufferingParser.java`
#### Snippet
```java
                }
            }
            return null;
        } else {
            return xmlPullParser.getAttributeValue(namespace, name);
```

### ReturnNull
Return of `null`
in `maven-artifact/src/main/java/org/apache/maven/artifact/ArtifactUtils.java`
#### Snippet
```java

    public static Artifact copyArtifactSafe(Artifact artifact) {
        return (artifact != null) ? copyArtifact(artifact) : null;
    }

```

### ReturnNull
Return of `null`
in `maven-artifact/src/main/java/org/apache/maven/artifact/versioning/DefaultArtifactVersion.java`
#### Snippet
```java
        // for performance, check digits instead of relying later on catching NumberFormatException
        if (!isDigits(s)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `maven-artifact/src/main/java/org/apache/maven/artifact/versioning/DefaultArtifactVersion.java`
#### Snippet
```java
            long longValue = Long.parseLong(s);
            if (longValue > Integer.MAX_VALUE) {
                return null;
            }
            return (int) longValue;
```

### ReturnNull
Return of `null`
in `maven-artifact/src/main/java/org/apache/maven/artifact/versioning/DefaultArtifactVersion.java`
#### Snippet
```java
        } catch (NumberFormatException e) {
            // should never happen since checked isDigits(s) before
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `maven-artifact/src/main/java/org/apache/maven/artifact/versioning/DefaultArtifactVersion.java`
#### Snippet
```java
        String s = tok.nextToken();
        if ((s.length() > 1) && s.startsWith("0")) {
            return null;
        }
        return tryParseInt(s);
```

### ReturnNull
Return of `null`
in `maven-artifact/src/main/java/org/apache/maven/artifact/versioning/VersionRange.java`
#### Snippet
```java
    public static VersionRange createFromVersionSpec(String spec) throws InvalidVersionSpecificationException {
        if (spec == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/descriptor/PluginDescriptor.java`
#### Snippet
```java
    public MojoDescriptor getMojo(String goal) {
        if (getMojos() == null) {
            return null; // no mojo in this POM
        }

```

### ReturnNull
Return of `null`
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/descriptor/PluginDescriptor.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `maven-resolver-provider/src/main/java/org/apache/maven/repository/internal/PluginsMetadataGenerator.java`
#### Snippet
```java
            }
        }
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `api/maven-api-model/src/main/java/org/apache/maven/api/model/InputLocation.java`
#### Snippet
```java

    public InputLocation getLocation(Object key) {
        return locations != null ? locations.get(key) : null;
    }

```

### ReturnNull
Return of `null`
in `maven-resolver-provider/src/main/java/org/apache/maven/repository/internal/DefaultArtifactDescriptorReader.java`
#### Snippet
```java
                invalidDescriptor(session, trace, a, exception);
                if ((getPolicy(session, a, request) & ArtifactDescriptorPolicy.IGNORE_INVALID) != 0) {
                    return null;
                }
                result.addException(exception);
```

### ReturnNull
Return of `null`
in `maven-resolver-provider/src/main/java/org/apache/maven/repository/internal/DefaultArtifactDescriptorReader.java`
#### Snippet
```java
                    missingDescriptor(session, trace, a, (Exception) e.getCause());
                    if ((getPolicy(session, a, request) & ArtifactDescriptorPolicy.IGNORE_MISSING) != 0) {
                        return null;
                    }
                }
```

### ReturnNull
Return of `null`
in `maven-resolver-provider/src/main/java/org/apache/maven/repository/internal/DefaultArtifactDescriptorReader.java`
#### Snippet
```java
                invalidDescriptor(session, trace, a, e);
                if ((getPolicy(session, a, request) & ArtifactDescriptorPolicy.IGNORE_INVALID) != 0) {
                    return null;
                }
                result.addException(e);
```

### ReturnNull
Return of `null`
in `maven-resolver-provider/src/main/java/org/apache/maven/repository/internal/DefaultVersionResolver.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `maven-core/src/main/java/org/apache/maven/ReactorReader.java`
#### Snippet
```java
        // The fall-through indicates that the artifact cannot be found;
        // for instance if package produced nothing or classifier problems.
        return null;
    }

```

### ReturnNull
Return of `null`
in `maven-core/src/main/java/org/apache/maven/ReactorReader.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `maven-core/src/main/java/org/apache/maven/ReactorReader.java`
#### Snippet
```java
        String projectKey = ArtifactUtils.key(artifact.getGroupId(), artifact.getArtifactId(), artifact.getVersion());
        MavenProject project = projectsByGAV.get(projectKey);
        return project == null ? null : project.getModel();
    }

```

### ReturnNull
Return of `null`
in `maven-core/src/main/java/org/apache/maven/ReactorReader.java`
#### Snippet
```java
    private File determinePreviouslyPackagedArtifactFile(MavenProject project, Artifact artifact) {
        if (artifact == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `maven-core/src/main/java/org/apache/maven/ReactorReader.java`
#### Snippet
```java
        // The fall-through indicates that the artifact cannot be found;
        // for instance if package produced nothing or classifier problems.
        return null;
    }

```

### ReturnNull
Return of `null`
in `maven-core/src/main/java/org/apache/maven/graph/ProjectSelector.java`
#### Snippet
```java

    File getBaseDirectoryFromRequest(MavenExecutionRequest request) {
        return request.getBaseDirectory() != null ? new File(request.getBaseDirectory()) : null;
    }

```

### ReturnNull
Return of `null`
in `maven-core/src/main/java/org/apache/maven/RepositoryUtils.java`
#### Snippet
```java
            org.apache.maven.artifact.Artifact artifact, Collection<org.apache.maven.model.Exclusion> exclusions) {
        if (artifact == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `maven-core/src/main/java/org/apache/maven/RepositoryUtils.java`
#### Snippet
```java
    public static Artifact toArtifact(org.apache.maven.artifact.Artifact artifact) {
        if (artifact == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `maven-core/src/main/java/org/apache/maven/RepositoryUtils.java`
#### Snippet
```java
    private static org.apache.maven.artifact.Artifact toArtifact(Dependency dependency) {
        if (dependency == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `maven-core/src/main/java/org/apache/maven/RepositoryUtils.java`
#### Snippet
```java
    public static WorkspaceRepository getWorkspace(RepositorySystemSession session) {
        WorkspaceReader reader = session.getWorkspaceReader();
        return (reader != null) ? reader.getRepository() : null;
    }

```

### ReturnNull
Return of `null`
in `maven-core/src/main/java/org/apache/maven/RepositoryUtils.java`
#### Snippet
```java

    private static String nullify(String string) {
        return (string == null || string.length() <= 0) ? null : string;
    }

```

### ReturnNull
Return of `null`
in `maven-core/src/main/java/org/apache/maven/RepositoryUtils.java`
#### Snippet
```java
    public static org.apache.maven.artifact.Artifact toArtifact(Artifact artifact) {
        if (artifact == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java
            return createArtifactRepository(id, url, layout, snapshots, releases);
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java
    public List<ArtifactRepository> getEffectiveRepositories(List<ArtifactRepository> repositories) {
        if (repositories == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java
            desiredScope = scope;
        } else if (Artifact.SCOPE_TEST.equals(scope) || Artifact.SCOPE_PROVIDED.equals(scope)) {
            return null;
        } else if (Artifact.SCOPE_COMPILE.equals(scope) && Artifact.SCOPE_COMPILE.equals(inheritedScope)) {
            // added to retain compile artifactScope. Remove if you want compile inherited as runtime
```

### ReturnNull
Return of `null`
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java
    public Artifact createDependencyArtifact(Dependency d) {
        if (d.getVersion() == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java
            versionRange = VersionRange.createFromVersionSpec(d.getVersion());
        } catch (InvalidVersionSpecificationException e) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java
            versionRange = VersionRange.createFromVersionSpec(version);
        } catch (InvalidVersionSpecificationException e) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java
            versionRange = VersionRange.createFromVersionSpec(version);
        } catch (InvalidVersionSpecificationException e) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `maven-core/src/main/java/org/apache/maven/plugin/PluginParameterExpressionEvaluatorV4.java`
#### Snippet
```java

        if (expr == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `maven-core/src/main/java/org/apache/maven/plugin/PluginParameterExpressionEvaluator.java`
#### Snippet
```java

        if (expr == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `maven-core/src/main/java/org/apache/maven/plugin/DefaultBuildPluginManager.java`
#### Snippet
```java
        @Override
        public Log getLog() {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `maven-core/src/main/java/org/apache/maven/plugin/prefix/internal/DefaultPluginPrefixResolver.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `maven-core/src/main/java/org/apache/maven/plugin/prefix/internal/DefaultPluginPrefixResolver.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `maven-core/src/main/java/org/apache/maven/plugin/prefix/internal/DefaultPluginPrefixResolver.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `maven-core/src/main/java/org/apache/maven/plugin/prefix/internal/DefaultPluginPrefixResolver.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `maven-core/src/main/java/org/apache/maven/plugin/internal/DefaultLegacySupport.java`
#### Snippet
```java
    public RepositorySystemSession getRepositorySession() {
        MavenSession session = getSession();
        return (session != null) ? session.getRepositorySession() : null;
    }
}
```

### ReturnNull
Return of `null`
in `maven-core/src/main/java/org/apache/maven/plugin/internal/DefaultLegacySupport.java`
#### Snippet
```java
    public MavenSession getSession() {
        AtomicReference<MavenSession> currentSession = DefaultLegacySupport.SESSION.get();
        return currentSession != null ? currentSession.get() : null;
    }

```

### ReturnNull
Return of `null`
in `maven-core/src/main/java/org/apache/maven/plugin/internal/DefaultPluginManager.java`
#### Snippet
```java
            return plugin;
        } catch (NoPluginFoundForPrefixException e) {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `maven-core/src/main/java/org/apache/maven/plugin/internal/DefaultPluginManager.java`
#### Snippet
```java
            return loadPluginDescriptor(plugin, session.getCurrentProject(), session);
        } catch (Exception e) {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `maven-core/src/main/java/org/apache/maven/plugin/version/internal/DefaultPluginVersionResolver.java`
#### Snippet
```java
                    return new DefaultPluginVersionResult(plugin.getVersion());
                } else {
                    return null;
                }
            }
```

### ReturnNull
Return of `null`
in `maven-core/src/main/java/org/apache/maven/plugin/version/internal/DefaultPluginVersionResolver.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `maven-core/src/main/java/org/apache/maven/project/artifact/PluginArtifact.java`
#### Snippet
```java
    static class PluginArtifactHandler implements ArtifactHandler {
        public String getClassifier() {
            return null;
        }

```

### ReturnNull
Return of `null`
in `maven-core/src/main/java/org/apache/maven/project/artifact/PluginArtifact.java`
#### Snippet
```java

        public String getDirectory() {
            return null;
        }

```

### ReturnNull
Return of `null`
in `maven-core/src/main/java/org/apache/maven/project/artifact/ProjectArtifact.java`
#### Snippet
```java

        public String getDirectory() {
            return null;
        }

```

### ReturnNull
Return of `null`
in `maven-core/src/main/java/org/apache/maven/project/artifact/ProjectArtifact.java`
#### Snippet
```java
    static class PomArtifactHandler implements ArtifactHandler {
        public String getClassifier() {
            return null;
        }

```

### ReturnNull
Return of `null`
in `maven-core/src/main/java/org/apache/maven/artifact/factory/DefaultArtifactFactory.java`
#### Snippet
```java
            desiredScope = scope;
        } else if (Artifact.SCOPE_TEST.equals(scope) || Artifact.SCOPE_PROVIDED.equals(scope)) {
            return null;
        } else if (Artifact.SCOPE_COMPILE.equals(scope) && Artifact.SCOPE_COMPILE.equals(inheritedScope)) {
            // added to retain compile artifactScope. Remove if you want compile inherited as runtime
```

### ReturnNull
Return of `null`
in `maven-core/src/main/java/org/apache/maven/artifact/resolver/DefaultResolutionErrorHandler.java`
#### Snippet
```java

    private static <T> List<T> toList(Collection<T> items) {
        return (items != null) ? new ArrayList<>(items) : null;
    }
}
```

### ReturnNull
Return of `null`
in `maven-core/src/main/java/org/apache/maven/project/artifact/DefaultMavenMetadataCache.java`
#### Snippet
```java
        cache.remove(cacheKey);

        return null;
    }

```

### ReturnNull
Return of `null`
in `maven-core/src/main/java/org/apache/maven/project/artifact/MavenMetadataSource.java`
#### Snippet
```java

        if (effectiveScope == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `maven-core/src/main/java/org/apache/maven/project/artifact/MavenMetadataSource.java`
#### Snippet
```java

        if (inheritedFilter != null && !inheritedFilter.include(dependencyArtifact)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `maven-core/src/main/java/org/apache/maven/project/artifact/MavenMetadataSource.java`
#### Snippet
```java
                        if (artifact.getDependencyFilter() != null
                                && !artifact.getDependencyFilter().include(artifact)) {
                            return null;
                        }

```

### ReturnNull
Return of `null`
in `maven-core/src/main/java/org/apache/maven/project/artifact/MavenMetadataSource.java`
#### Snippet
```java

            if (rel == null) {
                return null;
            }

```

### ReturnNull
Return of `null`
in `maven-core/src/main/java/org/apache/maven/project/artifact/MavenMetadataSource.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `maven-core/src/main/java/org/apache/maven/artifact/repository/LegacyLocalRepositoryManager.java`
#### Snippet
```java

        public org.apache.maven.artifact.Artifact find(org.apache.maven.artifact.Artifact artifact) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `maven-core/src/main/java/org/apache/maven/artifact/repository/LegacyLocalRepositoryManager.java`
#### Snippet
```java

        public String pathOf(org.apache.maven.artifact.Artifact artifact) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `maven-core/src/main/java/org/apache/maven/artifact/repository/LegacyLocalRepositoryManager.java`
#### Snippet
```java

        public Proxy getProxy() {
            return null;
        }

```

### ReturnNull
Return of `null`
in `maven-core/src/main/java/org/apache/maven/artifact/repository/LegacyLocalRepositoryManager.java`
#### Snippet
```java

        public ArtifactRepositoryPolicy getReleases() {
            return null;
        }

```

### ReturnNull
Return of `null`
in `maven-core/src/main/java/org/apache/maven/artifact/repository/LegacyLocalRepositoryManager.java`
#### Snippet
```java

        private String nullify(String str) {
            return (str == null || str.length() <= 0) ? null : str;
        }

```

### ReturnNull
Return of `null`
in `maven-core/src/main/java/org/apache/maven/artifact/repository/LegacyLocalRepositoryManager.java`
#### Snippet
```java

        public String getBasedir() {
            return null;
        }

```

### ReturnNull
Return of `null`
in `maven-core/src/main/java/org/apache/maven/artifact/repository/LegacyLocalRepositoryManager.java`
#### Snippet
```java

        public String pathOfRemoteRepositoryMetadata(ArtifactMetadata artifactMetadata) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `maven-core/src/main/java/org/apache/maven/artifact/repository/LegacyLocalRepositoryManager.java`
#### Snippet
```java

        public ArtifactRepositoryPolicy getSnapshots() {
            return null;
        }

```

### ReturnNull
Return of `null`
in `maven-core/src/main/java/org/apache/maven/artifact/repository/LegacyLocalRepositoryManager.java`
#### Snippet
```java

        public ArtifactRepositoryLayout getLayout() {
            return null;
        }

```

### ReturnNull
Return of `null`
in `maven-core/src/main/java/org/apache/maven/artifact/repository/LegacyLocalRepositoryManager.java`
#### Snippet
```java

        public Authentication getAuthentication() {
            return null;
        }

```

### ReturnNull
Return of `null`
in `maven-core/src/main/java/org/apache/maven/artifact/repository/LegacyLocalRepositoryManager.java`
#### Snippet
```java

        public String pathOfLocalRepositoryMetadata(ArtifactMetadata metadata, ArtifactRepository repository) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `maven-core/src/main/java/org/apache/maven/project/MavenProject.java`
#### Snippet
```java
    public Object getContextValue(String key) {
        if (context == null) {
            return null;
        }
        return context.get(key);
```

### ReturnNull
Return of `null`
in `maven-core/src/main/java/org/apache/maven/project/MavenProject.java`
#### Snippet
```java

    public String getDefaultGoal() {
        return getBuild() != null ? getBuild().getDefaultGoal() : null;
    }

```

### ReturnNull
Return of `null`
in `maven-core/src/main/java/org/apache/maven/artifact/repository/metadata/ArtifactRepositoryMetadata.java`
#### Snippet
```java

    public ArtifactRepository getRepository() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `maven-core/src/main/java/org/apache/maven/artifact/repository/metadata/ArtifactRepositoryMetadata.java`
#### Snippet
```java
    public String getBaseVersion() {
        // Don't want the artifact's version in here, as this is stored in the directory above that
        return null;
    }

```

### ReturnNull
Return of `null`
in `maven-core/src/main/java/org/apache/maven/internal/impl/DefaultNode.java`
#### Snippet
```java
    @Override
    public Dependency getDependency() {
        return node.getDependency() != null ? session.getDependency(node.getDependency()) : null;
    }

```

### ReturnNull
Return of `null`
in `maven-core/src/main/java/org/apache/maven/internal/aether/MavenChainedWorkspaceReader.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `maven-core/src/main/java/org/apache/maven/settings/SettingsUtils.java`
#### Snippet
```java
    public static org.apache.maven.settings.Settings copySettings(org.apache.maven.settings.Settings settings) {
        if (settings == null) {
            return null;
        }
        return new org.apache.maven.settings.Settings(settings.getDelegate());
```

### ReturnNull
Return of `null`
in `maven-core/src/main/java/org/apache/maven/exception/DefaultExceptionHandler.java`
#### Snippet
```java
            return handle(message, problem.getException());
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `maven-core/src/main/java/org/apache/maven/exception/DefaultExceptionHandler.java`
#### Snippet
```java

        if (children.isEmpty()) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `maven-core/src/main/java/org/apache/maven/internal/impl/AbstractSession.java`
#### Snippet
```java
    public List<org.eclipse.aether.repository.RemoteRepository> toRepositories(List<RemoteRepository> repositories) {
        return repositories == null
                ? null
                : repositories.stream().map(this::toRepository).collect(Collectors.toList());
    }
```

### ReturnNull
Return of `null`
in `maven-core/src/main/java/org/apache/maven/internal/impl/AbstractSession.java`
#### Snippet
```java
    public List<org.eclipse.aether.artifact.Artifact> toArtifacts(Collection<Artifact> artifacts) {
        return artifacts == null
                ? null
                : artifacts.stream().map(this::toArtifact).collect(Collectors.toList());
    }
```

### ReturnNull
Return of `null`
in `maven-core/src/main/java/org/apache/maven/internal/impl/AbstractSession.java`
#### Snippet
```java
    public List<org.eclipse.aether.graph.Dependency> toDependencies(Collection<DependencyCoordinate> dependencies) {
        return dependencies == null
                ? null
                : dependencies.stream().map(this::toDependency).collect(Collectors.toList());
    }
```

### ReturnNull
Return of `null`
in `maven-core/src/main/java/org/apache/maven/internal/impl/AbstractSession.java`
#### Snippet
```java
    public List<ArtifactRepository> toArtifactRepositories(List<RemoteRepository> repositories) {
        return repositories == null
                ? null
                : repositories.stream().map(this::toArtifactRepository).collect(Collectors.toList());
    }
```

### ReturnNull
Return of `null`
in `maven-core/src/main/java/org/apache/maven/internal/impl/AbstractSession.java`
#### Snippet
```java

    public List<Project> getProjects(List<MavenProject> projects) {
        return projects == null ? null : projects.stream().map(this::getProject).collect(Collectors.toList());
    }

```

### ReturnNull
Return of `null`
in `maven-core/src/main/java/org/apache/maven/execution/MavenSession.java`
#### Snippet
```java
    @Deprecated
    public EventDispatcher getEventDispatcher() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `maven-core/src/main/java/org/apache/maven/execution/MavenSession.java`
#### Snippet
```java
    //
    public RepositoryCache getRepositoryCache() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `maven-core/src/main/java/org/apache/maven/execution/DefaultMavenExecutionRequest.java`
#### Snippet
```java
    public String getBaseDirectory() {
        if (basedir == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `maven-core/src/main/java/org/apache/maven/lifecycle/mapping/LifecyclePhase.java`
#### Snippet
```java
    public static Map<String, String> toLegacyMap(Map<String, LifecyclePhase> lifecyclePhases) {
        if (lifecyclePhases == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `maven-core/src/main/java/org/apache/maven/lifecycle/mapping/DefaultLifecycleMapping.java`
#### Snippet
```java
            return phases;
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `maven-core/src/main/java/org/apache/maven/lifecycle/mapping/DefaultLifecycleMapping.java`
#### Snippet
```java
    @Override
    public List<String> getOptionalMojos(String lifecycle) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `maven-core/src/main/java/org/apache/maven/lifecycle/mapping/Lifecycle.java`
#### Snippet
```java
        Map<String, LifecyclePhase> lphases = getLifecyclePhases();
        if (lphases == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `maven-core/src/main/java/org/apache/maven/lifecycle/internal/ProjectBuildList.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `maven-core/src/main/java/org/apache/maven/lifecycle/internal/DefaultMojoExecutionConfigurator.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `maven-core/src/main/java/org/apache/maven/lifecycle/internal/DefaultMojoExecutionConfigurator.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `maven-core/src/main/java/org/apache/maven/lifecycle/internal/DefaultLifecyclePluginAnalyzer.java`
#### Snippet
```java

        if (lifecycleMappingForPackaging == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `maven-core/src/main/java/org/apache/maven/lifecycle/internal/DefaultLifecyclePluginAnalyzer.java`
#### Snippet
```java
        } catch (ComponentLookupException e) {
            if (e.getCause() instanceof NoSuchElementException) {
                return null;
            }
            throw new RuntimeException(e);
```

### ReturnNull
Return of `null`
in `maven-core/src/main/java/org/apache/maven/lifecycle/internal/MojoDescriptorCreator.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `maven-core/src/main/java/org/apache/maven/toolchain/java/JavaToolchainImpl.java`
#### Snippet
```java
            return toRet.getAbsolutePath();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `maven-core/src/main/java/org/apache/maven/toolchain/java/JavaToolchainImpl.java`
#### Snippet
```java
            }
        }
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `maven-core/src/main/java/org/apache/maven/toolchain/java/JavaToolchainFactory.java`
#### Snippet
```java
    public ToolchainPrivate createToolchain(ToolchainModel model) throws MisconfiguredToolchainException {
        if (model == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `maven-core/src/main/java/org/apache/maven/toolchain/java/JavaToolchainFactory.java`
#### Snippet
```java
        // not sure it's necessary to provide a default toolchain here.
        // only version can be eventually supplied, and
        return null;
    }

```

### ReturnNull
Return of `null`
in `maven-core/src/main/java/org/apache/maven/lifecycle/internal/MojoExecutor.java`
#### Snippet
```java

        if (scopes.isEmpty()) {
            return null;
        } else {
            return new CumulativeScopeArtifactFilter(scopes);
```

### ReturnNull
Return of `null`
in `maven-core/src/main/java/org/apache/maven/toolchain/DefaultToolchainManager.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `maven-core/src/main/java/org/apache/maven/configuration/DefaultBeanConfigurationRequest.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `maven-core/src/main/java/org/apache/maven/configuration/internal/EnhancedConfigurationConverter.java`
#### Snippet
```java
            final Class<?> implType = getClassForImplementationHint(type, configuration, loader);
            if (null == value && implType.isInterface() && configuration.getChildCount() == 0) {
                return null; // nothing to process
            }
            final Object bean = instantiateObject(implType);
```

### ReturnNull
Return of `null`
in `maven-core/src/main/java/org/apache/maven/repository/DelegatingLocalArtifactRepository.java`
#### Snippet
```java
    @Override
    public String getBasedir() {
        return (userLocalArtifactRepository != null) ? userLocalArtifactRepository.getBasedir() : null;
    }

```

## RuleId[ruleID=AssignmentToLambdaParameter]
### AssignmentToLambdaParameter
Assignment to lambda parameter `value`
in `maven-toolchain-builder/src/main/java/org/apache/maven/toolchain/building/DefaultToolchainsBuilder.java`
#### Snippet
```java
            if (value != null) {
                // we're going to parse this back in as XML so we need to escape XML markup
                value = value.toString()
                        .replace("&", "&amp;")
                        .replace("<", "&lt;")
```

### AssignmentToLambdaParameter
Assignment to lambda parameter `value`
in `maven-settings-builder/src/main/java/org/apache/maven/settings/building/DefaultSettingsBuilder.java`
#### Snippet
```java
            if (value != null) {
                // we're going to parse this back in as XML so we need to escape XML markup
                value = value.toString()
                        .replace("&", "&amp;")
                        .replace("<", "&lt;")
```

## RuleId[ruleID=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `projectsSkipped` is redundant
in `maven-embedder/src/main/java/org/apache/maven/cli/event/ExecutionEventLogger.java`
#### Snippet
```java

            final List<MavenProject> allProjects = event.getSession().getAllProjects();
            final int projectsSkipped = allProjects.size() - projects.size();

            currentVisitedProjectCount = projectsSkipped;
```

### UnnecessaryLocalVariable
Local variable `repo` is redundant
in `maven-core/src/main/java/org/apache/maven/settings/SettingsUtils.java`
#### Snippet
```java
     */
    private static Repository convertToSettingsRepository(org.apache.maven.model.Repository modelRepo) {
        Repository repo = Repository.newBuilder()
                .id(modelRepo.getId())
                .layout(modelRepo.getLayout())
```

### UnnecessaryLocalVariable
Local variable `policy` is redundant
in `maven-core/src/main/java/org/apache/maven/settings/SettingsUtils.java`
#### Snippet
```java
     */
    private static RepositoryPolicy convertRepositoryPolicy(org.apache.maven.model.RepositoryPolicy modelPolicy) {
        RepositoryPolicy policy = RepositoryPolicy.newBuilder()
                .enabled(modelPolicy.isEnabled())
                .updatePolicy(modelPolicy.getUpdatePolicy())
```

### UnnecessaryLocalVariable
Local variable `policy` is redundant
in `maven-core/src/main/java/org/apache/maven/settings/SettingsUtils.java`
#### Snippet
```java
    private static org.apache.maven.api.model.RepositoryPolicy convertRepositoryPolicy(
            RepositoryPolicy settingsPolicy) {
        org.apache.maven.api.model.RepositoryPolicy policy = org.apache.maven.api.model.RepositoryPolicy.newBuilder()
                .enabled(Boolean.toString(settingsPolicy.isEnabled()))
                .updatePolicy(settingsPolicy.getUpdatePolicy())
```

## RuleId[ruleID=BusyWait]
### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `maven-core/src/main/java/org/apache/maven/lifecycle/internal/builder/multithreaded/ThreadOutputMuxer.java`
#### Snippet
```java
            while (!running == expect) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
```

## RuleId[ruleID=CopyConstructorMissesField]
### CopyConstructorMissesField
Copy constructor does not copy 26 fields
in `maven-core/src/main/java/org/apache/maven/project/MavenProject.java`
#### Snippet
```java
    }

    public MavenProject(MavenProject project) {
        deepCopy(project);
    }
```

## RuleId[ruleID=WaitNotInLoop]
### WaitNotInLoop
Call to `wait()` is not in loop
in `maven-model-builder/src/main/java/org/apache/maven/model/building/DefaultTransformerContext.java`
#### Snippet
```java
                    if (!set) {
                        try {
                            this.wait();
                        } catch (InterruptedException e) {
                            // Ignore
```

## RuleId[ruleID=ThreadStartInConstruction]
### ThreadStartInConstruction
Call to `start()` during object construction
in `maven-core/src/main/java/org/apache/maven/lifecycle/internal/builder/multithreaded/ThreadOutputMuxer.java`
#### Snippet
```java
        System.setOut(new ThreadBoundPrintStream(this.originalSystemOUtStream));
        printer = new ConsolePrinter(segmentChunks);
        new Thread(printer).start();
        printer.waitUntilRunning(true);
    }
```

## RuleId[ruleID=EqualsWhichDoesntCheckParameterClass]
### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `maven-core/src/main/java/org/apache/maven/project/ReactorModelPool.java`
#### Snippet
```java

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
```

## RuleId[ruleID=UseBulkOperation]
### UseBulkOperation
Iteration can be replaced with bulk 'Map.putAll()' call
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/lifecycle/ImmutableCollections.java`
#### Snippet
```java
                // Do not use super.putAll, as it may delegate to put which throws an UnsupportedOperationException
                for (Map.Entry<Object, Object> e : props.entrySet()) {
                    super.put(e.getKey(), e.getValue());
                }
            }
```

### UseBulkOperation
Iteration can be replaced with bulk 'Map.putAll()' call
in `api/maven-api-settings/src/main/java/org/apache/maven/api/settings/ImmutableCollections.java`
#### Snippet
```java
                // Do not use super.putAll, as it may delegate to put which throws an UnsupportedOperationException
                for (Map.Entry<Object, Object> e : props.entrySet()) {
                    super.put(e.getKey(), e.getValue());
                }
            }
```

### UseBulkOperation
Iteration can be replaced with bulk 'Map.putAll()' call
in `api/maven-api-model/src/main/java/org/apache/maven/api/model/ImmutableCollections.java`
#### Snippet
```java
                // Do not use super.putAll, as it may delegate to put which throws an UnsupportedOperationException
                for (Map.Entry<Object, Object> e : props.entrySet()) {
                    super.put(e.getKey(), e.getValue());
                }
            }
```

### UseBulkOperation
Iteration can be replaced with bulk 'Map.putAll()' call
in `api/maven-api-toolchain/src/main/java/org/apache/maven/api/toolchain/ImmutableCollections.java`
#### Snippet
```java
                // Do not use super.putAll, as it may delegate to put which throws an UnsupportedOperationException
                for (Map.Entry<Object, Object> e : props.entrySet()) {
                    super.put(e.getKey(), e.getValue());
                }
            }
```

