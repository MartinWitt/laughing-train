# lemminx-maven 
 
# Bad smells
I found 192 bad smells with 17 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| SimplifyStreamApiCallChains | 26 | false |
| DataFlowIssue | 23 | false |
| JavadocDeclaration | 17 | false |
| Deprecation | 15 | false |
| ConstantValue | 14 | false |
| UnnecessaryModifier | 12 | true |
| FieldMayBeFinal | 11 | false |
| DuplicatedCode | 9 | false |
| UnusedAssignment | 6 | false |
| SimplifyOptionalCallChains | 4 | false |
| JavadocReference | 3 | false |
| StringOperationCanBeSimplified | 3 | false |
| DuplicateBranchesInSwitch | 3 | false |
| OptionalUsedAsFieldOrParameterType | 3 | false |
| CharsetObjectCanBeUsed | 3 | false |
| OptionalGetWithoutIsPresent | 3 | false |
| UnnecessarySemicolon | 2 | false |
| FinalPrivateMethod | 2 | false |
| DuplicateExpressions | 2 | false |
| UnnecessaryReturn | 2 | true |
| FinalStaticMethod | 2 | false |
| RedundantTypeArguments | 2 | false |
| SynchronizeOnNonFinalField | 2 | false |
| RedundantStreamOptionalCall | 2 | false |
| UnnecessaryLocalVariable | 2 | true |
| BusyWait | 2 | false |
| EmptyStatementBody | 1 | false |
| CommentedOutCode | 1 | false |
| RedundantCollectionOperation | 1 | false |
| CatchMayIgnoreException | 1 | false |
| CollectionAddAllCanBeReplacedWithConstructor | 1 | false |
| ManualMinMaxCalculation | 1 | false |
| TrivialStringConcatenation | 1 | false |
| UnnecessaryDefault | 1 | false |
| UnnecessaryToStringCall | 1 | true |
| FieldCanBeLocal | 1 | false |
| TrivialIf | 1 | false |
| OptionalAssignedToNull | 1 | false |
| AutoCloseableResource | 1 | false |
| UNUSED_IMPORT | 1 | false |
| MismatchedCollectionQueryUpdate | 1 | false |
| DuplicateThrows | 1 | false |
| ArraysAsListWithZeroOrOneArgument | 1 | false |
## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/MavenSyntaxErrorCode.java`
#### Snippet
```java
	}

	private MavenSyntaxErrorCode(String code) {
		this.code = code;
	}
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/MavenSyntaxErrorCode.java`
#### Snippet
```java
	private final String code;

	private MavenSyntaxErrorCode() {
		this(null);
	}
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/DependencyScope.java`
#### Snippet
```java
	private final String description;

	private DependencyScope(String name, String description) {
		this.name = name != null ? name : name();
		this.description = description;
```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/completion/MavenCompletionParticipant.java`
#### Snippet
```java
	private static final String COMPONENTS_TYPE_ELT = "type";

	static interface GAVInsertionStrategy {
		/**
		 * set current element value and add siblings as addition textEdits
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/completion/MavenCompletionParticipant.java`
#### Snippet
```java
		 * set current element value and add siblings as addition textEdits
		 */
		public static final GAVInsertionStrategy ELEMENT_VALUE_AND_SIBLING = new GAVInsertionStrategy() {
		};

```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/completion/MavenCompletionParticipant.java`
#### Snippet
```java
		 * set current element value and add siblings as addition textEdits
		 */
		public static final GAVInsertionStrategy ELEMENT_VALUE_AND_SIBLING = new GAVInsertionStrategy() {
		};

```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/completion/MavenCompletionParticipant.java`
#### Snippet
```java
		 * set current element value and add siblings as addition textEdits
		 */
		public static final GAVInsertionStrategy ELEMENT_VALUE_AND_SIBLING = new GAVInsertionStrategy() {
		};

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/completion/MavenCompletionParticipant.java`
#### Snippet
```java
		 * insert elements as children of the parent element
		 */
		public static final GAVInsertionStrategy CHILDREN_ELEMENTS = new GAVInsertionStrategy() {
		};

```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/completion/MavenCompletionParticipant.java`
#### Snippet
```java
		 * insert elements as children of the parent element
		 */
		public static final GAVInsertionStrategy CHILDREN_ELEMENTS = new GAVInsertionStrategy() {
		};

```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/completion/MavenCompletionParticipant.java`
#### Snippet
```java
		 * insert elements as children of the parent element
		 */
		public static final GAVInsertionStrategy CHILDREN_ELEMENTS = new GAVInsertionStrategy() {
		};

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/completion/MavenCompletionParticipant.java`
#### Snippet
```java
		};

		public static final class NodeWithChildrenInsertionStrategy implements GAVInsertionStrategy {
			public final String elementName;

```

### UnnecessaryModifier
Modifier `static` is redundant for inner classes of interfaces
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/completion/MavenCompletionParticipant.java`
#### Snippet
```java
		};

		public static final class NodeWithChildrenInsertionStrategy implements GAVInsertionStrategy {
			public final String elementName;

```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `uri`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/MavenLemminxWorkspaceReader.java`
#### Snippet
```java
	 * Any sorting is to be done before the method is invoked.
	 * 
	 * @param uri An URI of a document to add
	 * @param documents documents to add
	 */
```

### JavadocReference
Cannot resolve symbol `documents`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/MavenLemminxWorkspaceReader.java`
#### Snippet
```java
	 * 
	 * @param uri An URI of a document to add
	 * @param documents documents to add
	 */
	public void addToWorkspace(Collection<URI> uris) {
```

### JavadocReference
Cannot resolve symbol `https`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/DependencyScope.java`
#### Snippet
```java
 *
 * @author azerr
 * @see https://maven.apache.org/guides/introduction/introduction-to-dependency-mechanism.html#Dependency_Scope
 */
public enum DependencyScope {
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `charStream` may produce `NullPointerException`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/searcher/RemoteCentralRepositorySearcher.java`
#### Snippet
```java
			Response response = client.newCall(request).execute();
			if (response.isSuccessful()) {
				JsonObject bodyObject = JsonParser.parseReader(response.body().charStream()).getAsJsonObject();
				if (bodyObject.has("response")) {
					JsonObject responseObject = bodyObject.get("response").getAsJsonObject();
```

### DataFlowIssue
Argument `paramClass` might be null
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/utils/PlexusConfigHelper.java`
#### Snippet
```java
			return paramClass.getComponentType();
		}
		if (!Collection.class.isAssignableFrom(paramClass)) {
			return null;
		}
```

### DataFlowIssue
Argument `version` might be null
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/diagnostics/ProjectValidator.java`
#### Snippet
```java
			DOMElement version = DOMUtils.findChildElement(dep, VERSION_ELT).orElse(null);
			String versionString = DOMUtils.findChildElementText(dep, VERSION_ELT).orElse(null);
			if (artString != null && versionString != null && !lookForIgnoreMarker(version, MARKER_IGNORE_MANAGED)) {
				String id = Plugin.constructKey(grpString, artString);
				if (managed.containsKey(id)) {
```

### DataFlowIssue
Method invocation `toURI` may produce `NullPointerException`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/hover/MavenHoverParticipant.java`
#### Snippet
```java
		File locacion = project.getFile();
		return createVersionMessage(supportsMarkdown, project.getVersion(), 
				(locacion != null && locacion.exists() ? sourceModelId : null), locacion.toURI().toString());
	}
	
```

### DataFlowIssue
Argument `plugin.getProjectCache().getSnapshotProject(artifact.getFile()).orElse(null)` might be null
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/hover/MavenHoverParticipant.java`
#### Snippet
```java
						if (artifact != null && artifact.getFile() != null) {
							yield hoverForProject(request,
									plugin.getProjectCache().getSnapshotProject(artifact.getFile()).orElse(null),
									ParticipantUtils.isWellDefinedDependency(artifactToSearch),
									cancelChecker);
```

### DataFlowIssue
Method invocation `equals` may produce `NullPointerException`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/hover/MavenHoverParticipant.java`
#### Snippet
```java
					URI thisProjectUri = ParticipantUtils.normalizedUri(doc.getDocumentURI());
					cancelChecker.checkCanceled();
					if (childProjectUri.equals(thisProjectUri)) {
						// Property is defined in the same file as the request
						propertyDeclaration = DOMUtils.findNodesByLocalName(doc, property.getValue()).stream()
```

### DataFlowIssue
Method invocation `equals` may produce `NullPointerException`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/definition/MavenDefinitionParticipant.java`
#### Snippet
```java
		URI thisProjectUri = ParticipantUtils.normalizedUri(xmlDocument.getDocumentURI());
		cancelChecker.checkCanceled();
		if (childProjectUri.equals(thisProjectUri)) {
			// Property is defined in the same file as the request
			propertyDeclaration = DOMUtils.findNodesByLocalName(xmlDocument, mavenProperty.getValue()).stream()
```

### DataFlowIssue
Argument `str` might be null
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/utils/ParticipantUtils.java`
#### Snippet
```java
        if ( ( c < '0' || c > '9' ) && ( c < 'a' || c > 'z' ) )
        {
            Validate.notBlank( str, "Argument can neither be null, empty nor blank" );
        }
    }
```

### DataFlowIssue
Argument `prefixFile.getParentFile() .listFiles(file -> file.getName().startsWith(thePrefixFile.getName(...` might be null
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/completion/MavenCompletionParticipant.java`
#### Snippet
```java
			if (!prefix.endsWith("/")) {
				final File thePrefixFile = prefixFile;
				files.addAll(Arrays.asList(prefixFile.getParentFile()
						.listFiles(file -> file.getName().startsWith(thePrefixFile.getName()))));
			}
		}
```

### DataFlowIssue
Argument `prefixFile.listFiles()` might be null
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/completion/MavenCompletionParticipant.java`
#### Snippet
```java
		}
		if (prefixFile.isDirectory()) {
			files.addAll(Arrays.asList(prefixFile.listFiles()));
		}
		return files.stream().filter(file -> file.isFile() || file.isDirectory())
```

### DataFlowIssue
Argument `parent.listFiles()` might be null
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/completion/MavenCompletionParticipant.java`
#### Snippet
```java
	private List<File> collectRelativePropertiesFiles(File parent) {
		List<File> result = new ArrayList<>();
		List<File> parentFiles = Arrays.asList(parent.listFiles());
		
		parentFiles.stream().filter(file -> (file.isFile() && file.getName().endsWith(".properties")))
```

### DataFlowIssue
Argument `docFolder.getParentFile().listFiles()` might be null
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/completion/MavenCompletionParticipant.java`
#### Snippet
```java
		List<File> files = new ArrayList<>();
		if (prefix.isEmpty()) {
			Arrays.stream(docFolder.getParentFile().listFiles()).filter(file -> file.getName().contains(PARENT_ELT))
					.map(file -> new File(file, Maven.POMv4)).filter(File::isFile).forEach(files::add);
			files.add(docFolder.getParentFile());
```

### DataFlowIssue
Argument `prefixFile.getParentFile() .listFiles(file -> file.getName().startsWith(thePrefixFile.getName(...` might be null
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/completion/MavenCompletionParticipant.java`
#### Snippet
```java
			if (!prefix.endsWith("/")) {
				final File thePrefixFile = prefixFile;
				files.addAll(Arrays.asList(prefixFile.getParentFile()
						.listFiles(file -> file.getName().startsWith(thePrefixFile.getName()))));
			}
		}
```

### DataFlowIssue
Argument `prefixFile.listFiles()` might be null
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/completion/MavenCompletionParticipant.java`
#### Snippet
```java
		}
		if (prefixFile.isDirectory()) {
			files.addAll(Arrays.asList(prefixFile.listFiles()));
		}
		return files.stream().filter(file -> file.getName().equals(Maven.POMv4) || file.isDirectory())
```

### DataFlowIssue
Argument `prefixFile.getParentFile().listFiles((dir, name) -> name.startsWith(prefixFile.getName()))` might be null
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/completion/MavenCompletionParticipant.java`
#### Snippet
```java
		if (!prefix.isEmpty() && !prefix.endsWith("/")) {
			files.addAll(Arrays.asList(
					prefixFile.getParentFile().listFiles((dir, name) -> name.startsWith(prefixFile.getName()))));
		}
		if (prefixFile.isDirectory()) {
```

### DataFlowIssue
Argument `prefixFile.listFiles(File::isDirectory)` might be null
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/completion/MavenCompletionParticipant.java`
#### Snippet
```java
		}
		if (prefixFile.isDirectory()) {
			files.addAll(Arrays.asList(prefixFile.listFiles(File::isDirectory)));
		}
		// make folder that have a pom show higher
```

### DataFlowIssue
Argument `prefixFile.getParentFile() .listFiles(file -> (file.getName().startsWith(thePrefixFile.getName...` might be null
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/completion/MavenCompletionParticipant.java`
#### Snippet
```java
			if (!prefix.endsWith("/")) {
				final File thePrefixFile = prefixFile;
				files.addAll(Arrays.asList(prefixFile.getParentFile()
						.listFiles(file -> (file.getName().startsWith(thePrefixFile.getName())
								&& file.getName().endsWith(".properties")))));
			}
		}
```

### DataFlowIssue
Argument `prefixFile.getParentFile() .listFiles(file -> file.getName().startsWith(thePrefixFile.getName(...` might be null
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/completion/MavenCompletionParticipant.java`
#### Snippet
```java
			if (!prefix.endsWith("/")) {
				final File thePrefixFile = prefixFile;
				files.addAll(Arrays.asList(prefixFile.getParentFile()
						.listFiles(file -> file.getName().startsWith(thePrefixFile.getName()))));
			}
		}
```

### DataFlowIssue
Argument `prefixFile.listFiles()` might be null
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/completion/MavenCompletionParticipant.java`
#### Snippet
```java
		}
		if (prefixFile.isDirectory()) {
			files.addAll(Arrays.asList(prefixFile.listFiles()));
		}
		return files.stream().filter(file -> file.isDirectory())
```

### DataFlowIssue
Method invocation `getMojos` may produce `NullPointerException`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/completion/MavenCompletionParticipant.java`
#### Snippet
```java
		try {
			pluginDescriptor = MavenPluginUtils.getContainingPluginDescriptor(request.getNode(), plugin);
			return collectSimpleCompletionItems(pluginDescriptor.getMojos(), MojoDescriptor::getGoal,
					MojoDescriptor::getDescription, request);
		} catch (PluginResolutionException | PluginDescriptorParsingException | InvalidPluginDescriptorException e) {
```

### DataFlowIssue
Method invocation `getLocalName` may produce `NullPointerException`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/completion/MavenCompletionParticipant.java`
#### Snippet
```java
			break;
		case FILTER_ELT:
			if (FILTERS_ELT.equals(grandParent.getLocalName())) {
				collectRelativeFilterPathCompletion(request).forEach(response::addCompletionItem);
			}
```

### DataFlowIssue
Method invocation `getLocalName` may produce `NullPointerException`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/completion/MavenCompletionParticipant.java`
#### Snippet
```java
		case EXISTS_ELT:
		case MISSING_ELT:
			if (FILE_ELT.equals(grandParent.getLocalName())) {
				collectRelativeAnyPathCompletion(request).forEach(response::addCompletionItem);
			}
```

### DataFlowIssue
Method invocation `getLabel` may produce `NullPointerException`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/completion/MavenCompletionParticipant.java`
#### Snippet
```java
					.map(artifacts -> Collections.max(artifacts, highestVersionWithDescriptionComparator))
					.map(artifactInfo -> toGAVCompletionItem(artifactInfo, request, gavInsertionStrategy))
					.filter(completionItem -> !response.hasAttribute(completionItem.getLabel()))
					.forEach(response::addCompletionItem);
		}
```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/diagnostics/MavenDiagnosticParticipant.java`
#### Snippet
```java
						diagnostics.addAll(diagnosticList.stream()
								.filter(diagnostic -> !diagnostics.contains(diagnostic)).collect(Collectors.toList()));
					});;
			}
			if (node.hasChildNodes()) {
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/diagnostics/PluginValidator.java`
#### Snippet
```java
				pluginDescriptor = MavenPluginUtils.getContainingPluginDescriptor(diagnosticRequest.getNode(), plugin);
				if (pluginDescriptor != null) {
					internalValidateGoal(diagnosticRequest, pluginDescriptor).ifPresent(diagnostics::add);;
				}
			} catch (PluginResolutionException | PluginDescriptorParsingException
```

## RuleId[id=EmptyStatementBody]
### EmptyStatementBody
`else` statement has empty body
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/completion/MavenCompletionParticipant.java`
#### Snippet
```java
			if (filesystem.isPresent()) {
				filesystem.map(ArtifactWithDescription::new).ifPresent(allArtifactInfos::add);
			} else {
				// TODO localRepo
				// TODO remoteRepos
```

## RuleId[id=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/diagnostics/MavenDiagnosticParticipant.java`
#### Snippet
```java
				.ifPresent(diagnosticList ->{
						diagnostics.addAll(diagnosticList.stream()
							.filter(diagnostic -> !diagnostics.contains(diagnostic)).collect(Collectors.toList()));
					});
		}
```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/diagnostics/MavenDiagnosticParticipant.java`
#### Snippet
```java
					.filter(Optional::isPresent).map(dl -> dl.get()).forEach(diagnosticList -> {
						diagnostics.addAll(diagnosticList.stream()
								.filter(diagnostic -> !diagnostics.contains(diagnostic)).collect(Collectors.toList()));
					});;
			}
```

### SimplifyStreamApiCallChains
Can be replaced with 'java.util.ArrayList' constructor
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/utils/MavenPluginUtils.java`
#### Snippet
```java
			
			pluginDescriptor = lemminxMavenPlugin.getMavenPluginManager().getPluginDescriptor(plugin,
				project.getRemotePluginRepositories().stream().collect(Collectors.toList()),
				lemminxMavenPlugin.getMavenSession().getRepositorySession());
		} catch (PluginResolutionException ex) {
```

### SimplifyStreamApiCallChains
'collect(maxBy())' can be replaced with 'max()' (may change semantics)
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/utils/MavenPluginUtils.java`
#### Snippet
```java
					.map(Artifact::getVersion) //
					.map(DefaultArtifactVersion::new) //
					.collect(Collectors.maxBy(Comparator.naturalOrder()));
				if (version.isPresent()) {
					plugin.setVersion(version.get().toString());
```

### SimplifyStreamApiCallChains
Can be replaced with 'java.util.ArrayList' constructor
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/utils/MavenPluginUtils.java`
#### Snippet
```java
					plugin.setVersion(version.get().toString());
					pluginDescriptor = lemminxMavenPlugin.getMavenPluginManager().getPluginDescriptor(plugin,
							project.getRemotePluginRepositories().stream().collect(Collectors.toList()),
							lemminxMavenPlugin.getMavenSession().getRepositorySession());
				}
```

### SimplifyStreamApiCallChains
Can be replaced with 'java.util.HashSet' constructor
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/MavenLemminxWorkspaceReader.java`
#### Snippet
```java
			.filter(file -> !workspaceArtifacts.values().contains(file)) // ignore already processed
			.forEach(toProcess::add);
		for (File file : toProcess.stream().collect(Collectors.toSet())) {
			executor.execute(new ResolveArtifactsAndPopulateWorkspaceRunnable(file));
		}
```

### SimplifyStreamApiCallChains
Can be replaced with '.keySet().stream()'
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/MavenLemminxWorkspaceReader.java`
#### Snippet
```java
		workspaceArtifacts.entrySet().stream() //
				.filter(entry -> Objects.equals(key, ArtifactUtils.versionlessKey(entry.getKey().getGroupId(), entry.getKey().getArtifactId())))
				.map(Entry::getKey)
				.map(Artifact::getVersion)
				.forEach(res::add);
```

### SimplifyStreamApiCallChains
'Arrays.asList().stream()' can be replaced with 'Arrays.stream()'
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/MavenLemminxExtension.java`
#### Snippet
```java
	private List<URI> computeAddedWorkspaceProjects(URI[] added) {
		List<URI> projectsToAdd = new ArrayList<>();
		Arrays.asList(added).stream().forEach(uri -> {
			Path addedPath = new File(uri).toPath();
			try {
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/MavenLemminxExtension.java`
#### Snippet
```java
	private List<URI> computeAddedWorkspaceProjects(URI[] added) {
		List<URI> projectsToAdd = new ArrayList<>();
		Arrays.asList(added).stream().forEach(uri -> {
			Path addedPath = new File(uri).toPath();
			try {
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/MavenLemminxExtension.java`
#### Snippet
```java
	private void unregisterCodeActionParticipants(XMLExtensionsRegistry registry) {
		synchronized (codeActionParticipants) {
			codeActionParticipants.stream().forEach(registry::unregisterCodeActionParticipant);
			codeActionParticipants.clear();
		}
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/MavenLemminxExtension.java`
#### Snippet
```java

			reader.addToWorkspace(sortProjects(projectsToAdd));
			projectsToRemove.stream().forEach(reader::remove);
		}
	}
```

### SimplifyStreamApiCallChains
'collect(toUnmodifiableList())' can be replaced with 'toList()'
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/MavenLemminxExtension.java`
#### Snippet
```java
				return p.getFile().toPath().startsWith(removedPath);
			});
		}).map(p -> p.getFile().toURI()).collect(Collectors.toUnmodifiableList());
	}

```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/MavenLemminxExtension.java`
#### Snippet
```java
				codeActionParticipants.add(new MavenManagedVersionRemovalCodeAction());

				codeActionParticipants.stream().forEach(registry::registerCodeActionParticipant);
			}
		}
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/diagnostics/ProjectValidator.java`
#### Snippet
```java
		Optional<DOMElement> profiles = DOMUtils.findChildElement(node, PROFILES_ELT);
		profiles.ifPresent(profilesElement -> {
			DOMUtils.findChildElements(profilesElement, PROFILE_ELT).stream().forEach(profile -> {
				Optional<String> idString = DOMUtils.findChildElementText(profile, ID_ELT);
				if (idString.isPresent() && activeprofiles.contains(idString.get())) {
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/diagnostics/ProjectValidator.java`
#### Snippet
```java
		// now we have all the candidates, match them against the effective managed set
		List<Diagnostic> diagnostics = new ArrayList<>();
		candidates.stream().forEach(dep -> {
			Optional<DOMElement> version = DOMUtils.findChildElement(dep, VERSION_ELT);
			version.ifPresent(v -> {
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/diagnostics/ProjectValidator.java`
#### Snippet
```java
		Optional<DOMElement> profiles = DOMUtils.findChildElement(node, PROFILES_ELT);
		profiles.ifPresent(profilesElement -> {
			DOMUtils.findChildElements(profilesElement, PROFILE_ELT).stream().forEach(profile -> {
				Optional<String> idString = DOMUtils.findChildElementText(profile, ID_ELT);
				if (idString.isPresent() && activeprofiles.contains(idString.get())) {
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/diagnostics/ProjectValidator.java`
#### Snippet
```java
		// now we have all the candidates, match them against the effective managed set
		List<Diagnostic> diagnostics = new ArrayList<>();
		candidates.stream().forEach(dep -> {
			String grpString = DOMUtils.findChildElementText(dep, GROUP_ID_ELT).orElse(null);
			if (grpString == null) {
```

### SimplifyStreamApiCallChains
'Arrays.asList().stream()' can be replaced with 'Stream.of()'
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/utils/MarkdownUtils.java`
#### Snippet
```java
				// #L34,1-L35,3
				StringBuilder selection = new StringBuilder();
				Arrays.asList(range.getStart(), range.getEnd()).stream().filter(Objects::nonNull)				
					.forEach(r -> {
						if (!selection.isEmpty()) {
```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/hover/MavenHoverParticipant.java`
#### Snippet
```java
			List<MojoParameter> parentParameters = parameters.stream()
					.filter(mojoParameter -> mojoParameter.name.equals(parentParameterNode.getLocalName()))
					.collect(Collectors.toList());
			if (!parentParameters.isEmpty()) {
				MojoParameter parentParameter = parentParameters.get(0);
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/utils/ParticipantUtils.java`
#### Snippet
```java
        remoteRepositories.add(RemoteCentralRepositorySearcher.CENTRAL_REPO);
		if (isPlugin(element)) {
			pproject.getRemotePluginRepositories().stream().forEach(r -> {
				if (!remoteRepositories.contains(r)) {
					remoteRepositories.add(r);
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/utils/ParticipantUtils.java`
#### Snippet
```java
			
		} else if (isDependency(element)) {
			pproject.getRemoteArtifactRepositories().stream().forEach(ar -> {
				RemoteRepository r = new RemoteRepository.Builder(ar.getId(), "default", ar.getUrl()).build();
				if (!remoteRepositories.contains(r)) {
```

### SimplifyStreamApiCallChains
'filter()' and 'map()' can be swapped
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/completion/MavenCompletionParticipant.java`
#### Snippet
```java
		String prefix = request.getNode().getNodeValue() != null ? request.getNode().getNodeValue() : "";
		List<String> defaultValues = parameters.stream().filter(p -> (p.getDefaultValue() != null))
				.map(p -> p.getDefaultValue())
				.collect(Collectors.toList());

```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/completion/MavenCompletionParticipant.java`
#### Snippet
```java
				List<MojoParameter> parentParameters = parameters.stream()
						.filter(mojoParameter -> mojoParameter.name.equals(parentParameterNode.getLocalName()))
						.collect(Collectors.toList());
				if (!parentParameters.isEmpty()) {
					MojoParameter parentParameter = parentParameters.get(0);
```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/completion/MavenCompletionParticipant.java`
#### Snippet
```java
								.filter(gav -> !groupId.isPresent() || gav.getGroupId().equals(groupId.get()))
								// TODO pass description as documentation
								.map(ArtifactWithDescription::new).collect(Collectors.toList()));
				internalCollectRemoteGAVCompletion(request, isPlugin, allArtifactInfos, response, cancelChecker);
			}
```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/completion/MavenCompletionParticipant.java`
#### Snippet
```java
			// TODO completion/resolve to get description for local artifacts
			allArtifactInfos.addAll(plugin.getLocalRepositorySearcher().getLocalArtifactsLastVersion().stream()
					.map(ArtifactWithDescription::new).collect(Collectors.toList()));
			internalCollectRemoteGAVCompletion(request, false, allArtifactInfos, response, cancelChecker);
			break;
```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/completion/MavenCompletionParticipant.java`
#### Snippet
```java
			// TODO completion/resolve to get description for local artifacts
			allArtifactInfos.addAll(plugin.getLocalRepositorySearcher().getLocalPluginArtifacts().stream()
					.map(ArtifactWithDescription::new).collect(Collectors.toList()));
			internalCollectRemoteGAVCompletion(request, true, allArtifactInfos, response, cancelChecker);
			break;
```

## RuleId[id=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
Call to `substring()` is redundant
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/utils/ParticipantUtils.java`
#### Snippet
```java
		while((index = value.indexOf("${", start)) != -1 && 
				(closeIndex = value.indexOf("}", start)) != -1) {
			sb.append(value.substring(start, index));
			String propertyName = value.substring(index + 2, closeIndex);
			String propertyValue = properties.get(propertyName);
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/completion/MavenCompletionParticipant.java`
#### Snippet
```java
		return	defaultValues.stream()
			 	.sorted(String.CASE_INSENSITIVE_ORDER)
				.map(defaultValue -> toCompletionItem(defaultValue.toString(), null, request.getReplaceRange()))
				.collect(Collectors.toList());
	}
```

### StringOperationCanBeSimplified
Inefficient conversion from ByteArrayOutputStream
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/completion/MavenCompletionParticipant.java`
#### Snippet
```java
					new Range(new Position(0, 0),
							request.getXMLDocument().positionAt(request.getXMLDocument().getText().length())),
					new String(stream.toByteArray()));
			item.setTextEdit(Either.forLeft(textEdit));
		}
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (13 lines)
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/MavenLemminxExtension.java`
#### Snippet
```java
				.setName("mavenCore"); //$NON-NLS-1$

		// final Module logginModule = new AbstractModule() {
		// protected void configure() {
		// bind(ILoggerFactory.class).toInstance(LoggerFactory.getILoggerFactory());
```

## RuleId[id=DuplicateBranchesInSwitch]
### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/completion/MavenCompletionParticipant.java`
#### Snippet
```java
			case DEPENDENCY_ELT -> GAVInsertionStrategy.CHILDREN_ELEMENTS;
			case PLUGINS_ELT -> new GAVInsertionStrategy.NodeWithChildrenInsertionStrategy(PLUGIN_ELT);
			case PLUGIN_ELT ->  GAVInsertionStrategy.CHILDREN_ELEMENTS;
			case ARTIFACT_ID_ELT -> GAVInsertionStrategy.ELEMENT_VALUE_AND_SIBLING;
			case PARENT_ELT -> GAVInsertionStrategy.CHILDREN_ELEMENTS;
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/completion/MavenCompletionParticipant.java`
#### Snippet
```java
			case PLUGINS_ELT -> new GAVInsertionStrategy.NodeWithChildrenInsertionStrategy(PLUGIN_ELT);
			case PLUGIN_ELT ->  GAVInsertionStrategy.CHILDREN_ELEMENTS;
			case ARTIFACT_ID_ELT -> GAVInsertionStrategy.ELEMENT_VALUE_AND_SIBLING;
			case PARENT_ELT -> GAVInsertionStrategy.CHILDREN_ELEMENTS;
			default -> GAVInsertionStrategy.ELEMENT_VALUE_AND_SIBLING;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/completion/MavenCompletionParticipant.java`
#### Snippet
```java
			case PLUGIN_ELT ->  GAVInsertionStrategy.CHILDREN_ELEMENTS;
			case ARTIFACT_ID_ELT -> GAVInsertionStrategy.ELEMENT_VALUE_AND_SIBLING;
			case PARENT_ELT -> GAVInsertionStrategy.CHILDREN_ELEMENTS;
			default -> GAVInsertionStrategy.ELEMENT_VALUE_AND_SIBLING;
		};
```

## RuleId[id=FinalPrivateMethod]
### FinalPrivateMethod
'private' method declared `final`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/searcher/RemoteCentralRepositorySearcher.java`
#### Snippet
```java
	}
	
	private static final boolean isEmpty(String s) {
		return s == null || s.trim().isEmpty();
	}
```

### FinalPrivateMethod
'private' method declared `final`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/searcher/RemoteCentralRepositorySearcher.java`
#### Snippet
```java
	}

	private static final Artifact toArtifactInfo(JsonObject object) {
		String g = object.has(GROUP_ID) ? object.get(GROUP_ID).getAsString() : null;
		String a = object.has(ARTIFACT_ID) ? object.get(ARTIFACT_ID).getAsString() : null;
```

## RuleId[id=RedundantCollectionOperation]
### RedundantCollectionOperation
`contains` can be replaced with 'Map.containsValue()'
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/MavenLemminxWorkspaceReader.java`
#### Snippet
```java
			.map(File::new)
			.filter(File::isFile)
			.filter(file -> !workspaceArtifacts.values().contains(file)) // ignore already processed
			.forEach(toProcess::add);
		for (File file : toProcess.stream().collect(Collectors.toSet())) {
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/completion/MavenCompletionParticipant.java`
#### Snippet
```java
		DOMDocument doc = request.getXMLDocument();
		File docFile = new File(URI.create(doc.getTextDocument().getUri()));
		File docFolder = docFile.getParentFile();
		String prefix = request.getNode().getNodeValue() != null ? request.getNode().getNodeValue() : "";
		File prefixFile = new File(docFolder, prefix);
		List<File> files = new ArrayList<>();
```

### DuplicatedCode
Duplicated code
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/completion/MavenCompletionParticipant.java`
#### Snippet
```java
			try {
				prefixFile = prefixFile.getCanonicalFile();
			} catch (IOException e) {
				LOGGER.log(Level.SEVERE, e.getMessage(), e);
			}
			if (!prefix.endsWith("/")) {
				final File thePrefixFile = prefixFile;
				files.addAll(Arrays.asList(prefixFile.getParentFile()
						.listFiles(file -> file.getName().startsWith(thePrefixFile.getName()))));
			}
```

### DuplicatedCode
Duplicated code
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/completion/MavenCompletionParticipant.java`
#### Snippet
```java
				}).sorted(Comparator.comparing(File::isFile) // pom files before folders
						.thenComparing(
								file -> (file.isFile() && docFile.toPath().startsWith(file.getParentFile().toPath()))
										|| (file.isDirectory() && file.equals(docFolder.getParentFile()))) // `../pom.xml`
																											// before
																											// ...
						.thenComparing(file -> file.getParentFile().getName().contains(PARENT_ELT)) // folders
																									// containing
																									// "parent"
																									// before...
						.thenComparing(file -> file.getParentFile().getParentFile().equals(docFolder.getParentFile())) // siblings
																														// before...
						.reversed().thenComparing(Function.identity())// other folders and files
```

### DuplicatedCode
Duplicated code
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/definition/MavenDefinitionParticipant.java`
#### Snippet
```java
		while (project != null && project.getProperties().containsKey(mavenProperty.getValue())) {
			cancelChecker.checkCanceled();
			childProj = project;
			project = project.getParent();
		}

		DOMNode propertyDeclaration = null;
		Predicate<DOMNode> isMavenProperty = (node) -> PROPERTIES_ELT.equals(node.getParentNode().getLocalName());
		URI childProjectUri = ParticipantUtils.normalizedUri(childProj.getFile().toURI().toString());
		URI thisProjectUri = ParticipantUtils.normalizedUri(xmlDocument.getDocumentURI());
		cancelChecker.checkCanceled();
		if (childProjectUri.equals(thisProjectUri)) {
			// Property is defined in the same file as the request
			propertyDeclaration = DOMUtils.findNodesByLocalName(xmlDocument, mavenProperty.getValue()).stream()
					.filter(isMavenProperty).findFirst().orElse(null);
		} else {
			DOMDocument propertyDeclaringDocument = org.eclipse.lemminx.utils.DOMUtils.loadDocument(
					childProj.getFile().toURI().toString(),
					request.getNode().getOwnerDocument().getResolverExtensionManager());
			cancelChecker.checkCanceled();
			propertyDeclaration = DOMUtils.findNodesByLocalName(propertyDeclaringDocument, mavenProperty.getValue())
					.stream().filter(isMavenProperty).findFirst().orElse(null);
		}
```

### DuplicatedCode
Duplicated code
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/diagnostics/ProjectValidator.java`
#### Snippet
```java
		String currentProjectKey = mavenProject.getGroupId() + ":" + mavenProject.getArtifactId() + ":" //$NON-NLS-1$//$NON-NLS-2$
				+ mavenProject.getVersion();
		List<String> activeprofiles = mavenProject.getInjectedProfileIds().get(currentProjectKey);
		// remember what profile we found the dependency in.
		Map<DOMElement, String> candidateProfile = new HashMap<>();
		Optional<DOMElement> profiles = DOMUtils.findChildElement(node, PROFILES_ELT);
```

### DuplicatedCode
Duplicated code
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/diagnostics/ProjectValidator.java`
#### Snippet
```java
					Optional<DOMElement> profileDependencies = DOMUtils.findChildElement(profile, DEPENDENCIES_ELT);
					profileDependencies.ifPresent(dependenciesElement -> {
						DOMUtils.findChildElements(dependenciesElement, DEPENDENCY_ELT).stream()
								.filter(dependency -> DOMUtils.findChildElement(dependency, VERSION_ELT).isPresent())
								.forEach(dependency -> {
									candidates.add(dependency);
									candidateProfile.put(dependency, idString.get());
								});
					});
```

### DuplicatedCode
Duplicated code
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/diagnostics/ProjectValidator.java`
#### Snippet
```java
						addDiagnocticData(diagnostic, GROUP_ID_ELT, grpString);
						addDiagnocticData(diagnostic, ARTIFACT_ID_ELT, artString);
						setManagedVersionAttributes(diagnostic, mavenProject, managedDep);
						String profile = candidateProfile.get(dep);
						if (profile != null) {
							addDiagnocticData(diagnostic, PROFILE_ELT, profile);
						}
						diagnostics.add(diagnostic);
```

### DuplicatedCode
Duplicated code
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/hover/MavenHoverParticipant.java`
#### Snippet
```java
					UnaryOperator<String> toBold = supportsMarkdown ? MarkdownUtils::toBold
							: UnaryOperator.identity();
					String lineBreak = MarkdownUtils.getLineBreak(supportsMarkdown);
					String message = "";

					if (model.getName() != null) {
						message += toBold.apply(model.getName());
					}

					if (model.getDescription() != null) {
						message += lineBreak + model.getDescription();
					}
```

### DuplicatedCode
Duplicated code
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/utils/MavenPluginUtils.java`
#### Snippet
```java
		if (executionElementDomNode != null) {
			Set<String> interestingMojos = executionElementDomNode.getChildren().stream()
					.filter(node -> GOALS_ELT.equals(node.getLocalName())).flatMap(node -> node.getChildren().stream())
					.filter(node -> GOAL_ELT.equals(node.getLocalName())).flatMap(node -> node.getChildren().stream())
					.filter(DOMNode::isText).map(DOMNode::getTextContent).collect(Collectors.toSet());
			mojosToConsiderList = mojosToConsiderList.stream().filter(mojo -> interestingMojos.contains(mojo.getGoal()))
					.collect(Collectors.toList());
		}
```

## RuleId[id=CatchMayIgnoreException]
### CatchMayIgnoreException
Empty `catch` block
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/diagnostics/ProjectValidator.java`
#### Snippet
```java
			try {
				dataMap = (Map<String, String>) rawMap;
			} catch (ClassCastException e) {
			}
		}
```

## RuleId[id=DuplicateExpressions]
### DuplicateExpressions
Multiple occurrences of `name.substring(0, name.length() - 2)`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/utils/PlexusConfigHelper.java`
#### Snippet
```java
			return name.substring(0, name.length() - 3) + "y";
		} else if (name.endsWith("ches")) {
			return name.substring(0, name.length() - 2);
		} else if (name.endsWith("xes")) {
			return name.substring(0, name.length() - 2);
```

### DuplicateExpressions
Multiple occurrences of `name.substring(0, name.length() - 2)`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/utils/PlexusConfigHelper.java`
#### Snippet
```java
			return name.substring(0, name.length() - 2);
		} else if (name.endsWith("xes")) {
			return name.substring(0, name.length() - 2);
		} else if (name.endsWith("s") && (name.length() != 1)) {
			return name.substring(0, name.length() - 1);
```

## RuleId[id=CollectionAddAllCanBeReplacedWithConstructor]
### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/diagnostics/ProjectValidator.java`
#### Snippet
```java
				.getLastSuccessfulMavenProject(diagnosticRequest.getXMLDocument());
		List<Diagnostic> diagnostics = new ArrayList<>();
		diagnostics.addAll(validateParentMatchingGroupIdVersion(diagnosticRequest).get());
		if (project != null) {
			diagnostics.addAll(validateManagedDependencies(diagnosticRequest, project).get());
```

## RuleId[id=Deprecation]
### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/MavenLemminxExtension.java`
#### Snippet
```java
	}

	private List<ArtifactRepository> joinRemoteRepositories(List<ArtifactRepository> a, List<ArtifactRepository> b) {
		if (a.isEmpty()) {
			return b;
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/MavenLemminxExtension.java`
#### Snippet
```java
	}

	private List<ArtifactRepository> joinRemoteRepositories(List<ArtifactRepository> a, List<ArtifactRepository> b) {
		if (a.isEmpty()) {
			return b;
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/MavenLemminxExtension.java`
#### Snippet
```java
	}

	private List<ArtifactRepository> joinRemoteRepositories(List<ArtifactRepository> a, List<ArtifactRepository> b) {
		if (a.isEmpty()) {
			return b;
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/MavenLemminxExtension.java`
#### Snippet
```java
			return b;
		}
		List<ArtifactRepository> remotes = new ArrayList<>(a);
		remotes.addAll(b);
		return remotes;
```

### Deprecation
'MavenSession(org.codehaus.plexus.PlexusContainer, org.eclipse.aether.RepositorySystemSession, org.apache.maven.execution.MavenExecutionRequest, org.apache.maven.execution.MavenExecutionResult)' is deprecated
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/MavenLemminxExtension.java`
#### Snippet
```java
			MavenExecutionResult mavenResult = new DefaultMavenExecutionResult();
			// TODO: MavenSession is deprecated. Investigate for alternative
			mavenSession = new MavenSession(container, repositorySystemSession, mavenRequest, mavenResult);
			cache = new MavenProjectCache(this);
			localRepositorySearcher = new LocalRepositorySearcher(mavenSession.getRepositorySession().getLocalRepository().getBasedir());
```

### Deprecation
'POMv4' is deprecated
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/MavenLemminxExtension.java`
#### Snippet
```java
		String fileName = file != null ? file.getFileName().toString() : null;
		return fileName != null && ((fileName.startsWith("pom") && fileName.endsWith(".xml"))
				|| fileName.endsWith(Maven.POMv4) || fileName.endsWith(".pom"));
	}

```

### Deprecation
'populateFromSettings(org.apache.maven.execution.MavenExecutionRequest, org.apache.maven.settings.Settings)' is deprecated
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/MavenLemminxExtension.java`
#### Snippet
```java
				}
				MavenExecutionRequestPopulator requestPopulator = container.lookup(MavenExecutionRequestPopulator.class);
				requestPopulator.populateFromSettings(mavenRequest, settngs);
		    }
		}
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/MavenLemminxExtension.java`
#### Snippet
```java

		RepositorySystem repositorySystem = container.lookup(RepositorySystem.class);
		ArtifactRepository localRepo = repositorySystem.createLocalRepository(mavenRequest.getLocalRepositoryPath());
		mavenRequest.setLocalRepository(localRepo);
		List<ArtifactRepository> defaultRemoteRepositories = Collections.singletonList(repositorySystem.createDefaultRemoteRepository());
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/MavenLemminxExtension.java`
#### Snippet
```java
		ArtifactRepository localRepo = repositorySystem.createLocalRepository(mavenRequest.getLocalRepositoryPath());
		mavenRequest.setLocalRepository(localRepo);
		List<ArtifactRepository> defaultRemoteRepositories = Collections.singletonList(repositorySystem.createDefaultRemoteRepository());
		mavenRequest.setRemoteRepositories(joinRemoteRepositories(mavenRequest.getRemoteRepositories(), defaultRemoteRepositories));
		mavenRequest.setPluginArtifactRepositories(joinRemoteRepositories(mavenRequest.getPluginArtifactRepositories(), defaultRemoteRepositories));
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/MavenProjectCache.java`
#### Snippet
```java
								.map(repo -> new MavenArtifactRepository(repo.getId(), repo.getUrl(),
										new DefaultRepositoryLayout(),
										new ArtifactRepositoryPolicy(true,
												ArtifactRepositoryPolicy.UPDATE_POLICY_INTERVAL,
												ArtifactRepositoryPolicy.CHECKSUM_POLICY_WARN),
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/MavenProjectCache.java`
#### Snippet
```java
										new DefaultRepositoryLayout(),
										new ArtifactRepositoryPolicy(true,
												ArtifactRepositoryPolicy.UPDATE_POLICY_INTERVAL,
												ArtifactRepositoryPolicy.CHECKSUM_POLICY_WARN),
										new ArtifactRepositoryPolicy(true,
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/MavenProjectCache.java`
#### Snippet
```java
										new ArtifactRepositoryPolicy(true,
												ArtifactRepositoryPolicy.UPDATE_POLICY_INTERVAL,
												ArtifactRepositoryPolicy.CHECKSUM_POLICY_WARN),
										new ArtifactRepositoryPolicy(true,
												ArtifactRepositoryPolicy.UPDATE_POLICY_INTERVAL,
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/MavenProjectCache.java`
#### Snippet
```java
												ArtifactRepositoryPolicy.UPDATE_POLICY_INTERVAL,
												ArtifactRepositoryPolicy.CHECKSUM_POLICY_WARN),
										new ArtifactRepositoryPolicy(true,
												ArtifactRepositoryPolicy.UPDATE_POLICY_INTERVAL,
												ArtifactRepositoryPolicy.CHECKSUM_POLICY_WARN)))
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/MavenProjectCache.java`
#### Snippet
```java
												ArtifactRepositoryPolicy.CHECKSUM_POLICY_WARN),
										new ArtifactRepositoryPolicy(true,
												ArtifactRepositoryPolicy.UPDATE_POLICY_INTERVAL,
												ArtifactRepositoryPolicy.CHECKSUM_POLICY_WARN)))
								.distinct().collect(Collectors.toList()));
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/MavenProjectCache.java`
#### Snippet
```java
										new ArtifactRepositoryPolicy(true,
												ArtifactRepositoryPolicy.UPDATE_POLICY_INTERVAL,
												ArtifactRepositoryPolicy.CHECKSUM_POLICY_WARN)))
								.distinct().collect(Collectors.toList()));
						project.setFile(file);
```

## RuleId[id=UnnecessaryReturn]
### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/definition/MavenDefinitionParticipant.java`
#### Snippet
```java
					cancelChecker.checkCanceled();
					locations.add(toLocationNoRange(localArtifactLocation, element));
					return;
				}
			}
```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/completion/MavenCompletionParticipant.java`
#### Snippet
```java
							centralSearcher.getPluginArtifacts(artifactToSearch).stream().map(ArtifactWithDescription::new).forEach(artifactInfosCollector::add);
							cancelChecker.checkCanceled();
							return;
						}
					}).whenComplete((ok, error) -> updateItems.remove(updatingItem)).get(2, TimeUnit.SECONDS);
```

## RuleId[id=ManualMinMaxCalculation]
### ManualMinMaxCalculation
Can be replaced with 'Math.max()' call
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/completion/MavenCompletionParticipant.java`
#### Snippet
```java
		}
		DOMDocument doc = request.getXMLDocument();
		int startTagCloseOffset = node.getStartTagCloseOffset() >= 0 ? node.getStartTagCloseOffset() : 0;
		int endTagOpenOffset = node.getEndTagOpenOffset() >= 0 ? node.getEndTagOpenOffset() : request.getOffset();
		Range range = XMLPositionUtility.createRange(startTagCloseOffset + 1, endTagOpenOffset, doc);
```

## RuleId[id=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/utils/MarkdownUtils.java`
#### Snippet
```java
			xmlContent = xmlContent.replaceAll("&lt;", "<");
			xmlContent = xmlContent.replaceAll("&gt;", ">");
			xmlContent = "```XML" + "" + NL + xmlContent + NL + "```";
			description = description + LINE_BREAK + xmlContent;
		}
```

## RuleId[id=FinalStaticMethod]
### FinalStaticMethod
'static' method declared `final`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/searcher/RemoteCentralRepositorySearcher.java`
#### Snippet
```java
	}
	
	private static final boolean isEmpty(String s) {
		return s == null || s.trim().isEmpty();
	}
```

### FinalStaticMethod
'static' method declared `final`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/searcher/RemoteCentralRepositorySearcher.java`
#### Snippet
```java
	}

	private static final Artifact toArtifactInfo(JsonObject object) {
		String g = object.has(GROUP_ID) ? object.get(GROUP_ID).getAsString() : null;
		String a = object.has(ARTIFACT_ID) ? object.get(ARTIFACT_ID).getAsString() : null;
```

## RuleId[id=UnnecessaryDefault]
### UnnecessaryDefault
`default` branch is unnecessary
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/diagnostics/MavenDiagnosticParticipant.java`
#### Snippet
```java
			case ERROR, FATAL -> DiagnosticSeverity.Error;
			case WARNING -> DiagnosticSeverity.Warning;
			default -> DiagnosticSeverity.Information;
		};
	}
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/searcher/LocalRepositorySearcher.java`
#### Snippet
```java
				String artifactId = artifactFolderPath.getParent().getFileName().toString();
				String groupId = artifactFolderPath.getParent().getParent().toString().replace(artifactFolderPath.getFileSystem().getSeparator(), ".");
				if (!new File(file.toFile(), artifactId + '-' + version.toString() + ".pom").isFile()) {
					return FileVisitResult.SKIP_SUBTREE;
				}
```

## RuleId[id=RedundantTypeArguments]
### RedundantTypeArguments
Explicit type arguments can be inferred
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/MojoParameter.java`
#### Snippet
```java

	public MojoParameter(String name, String alias, String type) {
		this(name, alias, type, Collections.<MojoParameter>emptyList());
	}

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/MojoParameter.java`
#### Snippet
```java

	public List<MojoParameter> getNestedParameters() {
		return nested == null ? Collections.<MojoParameter>emptyList() : Collections.unmodifiableList(nested);
	}
	
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/MavenLemminxExtension.java`
#### Snippet
```java
	private IHoverParticipant hoverParticipant;
	private MavenDefinitionParticipant definitionParticipant;
	private MavenWorkspaceService workspaceServiceParticipant;
	private List<ICodeActionParticipant> codeActionParticipants = new ArrayList<>();

```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/MojoParameter.java`
#### Snippet
```java
		}

		if (param == null) {
			return null;
		}
```

## RuleId[id=SynchronizeOnNonFinalField]
### SynchronizeOnNonFinalField
Synchronization on a non-final field `codeActionParticipants`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/MavenLemminxExtension.java`
#### Snippet
```java
	
	private void unregisterCodeActionParticipants(XMLExtensionsRegistry registry) {
		synchronized (codeActionParticipants) {
			codeActionParticipants.stream().forEach(registry::unregisterCodeActionParticipant);
			codeActionParticipants.clear();
```

### SynchronizeOnNonFinalField
Synchronization on a non-final field `codeActionParticipants`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/MavenLemminxExtension.java`
#### Snippet
```java
	private void registerCodeActionParticipants(XMLExtensionsRegistry registry) {
		if (codeActionParticipants.isEmpty()) {
			synchronized (codeActionParticipants) {
				if (!codeActionParticipants.isEmpty()) {
					return;
```

## RuleId[id=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'artifactId'
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/utils/MavenPluginUtils.java`
#### Snippet
```java
	}

	private static Plugin findPluginInProject(MavenProject project, String pluginKey, Optional<String> artifactId) {
		Optional<Plugin> plugin = Optional.ofNullable(project.getPlugin(pluginKey))
				.or(() -> Optional.ofNullable(project.getPluginManagement().getPluginsAsMap().get(pluginKey)));
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'groupId'
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/completion/MavenCompletionParticipant.java`
#### Snippet
```java
	
	private void internalCollectWorkspaceArtifacts(ICompletionRequest request, Collection<ArtifactWithDescription> artifactInfosCollector,
			Optional<String> groupId, Optional<String> artifactId) {
		DOMElement parent = request.getParentElement();
		if (parent == null || parent.getLocalName() == null) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'artifactId'
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/completion/MavenCompletionParticipant.java`
#### Snippet
```java
	
	private void internalCollectWorkspaceArtifacts(ICompletionRequest request, Collection<ArtifactWithDescription> artifactInfosCollector,
			Optional<String> groupId, Optional<String> artifactId) {
		DOMElement parent = request.getParentElement();
		if (parent == null || parent.getLocalName() == null) {
```

## RuleId[id=CharsetObjectCanBeUsed]
### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/searcher/RemoteCentralRepositorySearcher.java`
#### Snippet
```java
		try {
			url.append(SEARCH_URI).append("rows=100&core=gav&")
				.append(SEARCH_PARAMS).append(URLEncoder.encode(query.toString(), "UTF-8"));
		} catch(UnsupportedEncodingException ex) {
			LOGGER.log(Level.SEVERE, "Maven Central Repo search failed for " + String.join(":", artifactToSearch.getGroupId(),
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/searcher/RemoteCentralRepositorySearcher.java`
#### Snippet
```java
		try {
			url.append(SEARCH_URI).append("rows=100&")
				.append(SEARCH_PARAMS).append(URLEncoder.encode(query.toString(), "UTF-8"));
		} catch(UnsupportedEncodingException ex) {
			LOGGER.log(Level.SEVERE, "Maven Central Repo search failed for " + String.join(":", artifactToSearch.getGroupId(),
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/searcher/RemoteCentralRepositorySearcher.java`
#### Snippet
```java
		try {
			url.append(SEARCH_URI).append("rows=200&")
				.append(SEARCH_PARAMS).append(URLEncoder.encode(query.toString(), "UTF-8"));
		} catch(UnsupportedEncodingException ex) {
			LOGGER.log(Level.SEVERE, "Maven Central Repo search failed for " + String.join(":", artifactToSearch.getGroupId(),
```

## RuleId[id=RedundantStreamOptionalCall]
### RedundantStreamOptionalCall
Redundant 'distinct()' call: elements will be distinct anyway when collected to a Set
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/searcher/LocalRepositorySearcher.java`
#### Snippet
```java

	public Set<String> searchPluginGroupIds() throws IOException {
		return getLocalPluginArtifacts().stream().map(Artifact::getGroupId).distinct().collect(Collectors.toSet());
	}

```

### RedundantStreamOptionalCall
Redundant 'distinct()' call: elements will be distinct anyway when collected to a Set
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/searcher/LocalRepositorySearcher.java`
#### Snippet
```java

	public Set<String> searchGroupIds() throws IOException {
		return getLocalArtifactsLastVersion().stream().map(Artifact::getGroupId).distinct().collect(Collectors.toSet());
	}

```

## RuleId[id=OptionalAssignedToNull]
### OptionalAssignedToNull
Null is used for 'Optional' type in declaration
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/completion/MavenCompletionParticipant.java`
#### Snippet
```java
	@SuppressWarnings("deprecation")
	private Optional<MavenProject> computeFilesystemParent(ICompletionRequest request) {
		Optional<String> relativePath = null;
		if (request.getParentElement().getLocalName().equals(PARENT_ELT)) {
			relativePath = DOMUtils.findChildElementText(request.getNode(), RELATIVE_PATH_ELT);
```

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/searcher/RemoteCentralRepositorySearcher.java`
#### Snippet
```java
	private JsonObject getResponseBody(Request request, Dependency artifactToSearch) {
		try {
			Response response = client.newCall(request).execute();
			if (response.isSuccessful()) {
				JsonObject bodyObject = JsonParser.parseReader(response.body().charStream()).getAsJsonObject();
```

## RuleId[id=SimplifyOptionalCallChains]
### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/completion/MavenCompletionParticipant.java`
#### Snippet
```java
		boolean isExclusion = DOMUtils.findClosestParentNode(request.getNode(), DOMConstants.EXCLUSIONS_ELT) != null;
		boolean insertVersion = !isExclusion && (strategy instanceof GAVInsertionStrategy.NodeWithChildrenInsertionStrategy || !DOMUtils
				.findChildElementText(request.getParentElement().getParentElement(), VERSION_ELT).isPresent());
		CompletionItem item = new CompletionItem();
		if (artifactInfo.description != null) {
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/completion/MavenCompletionParticipant.java`
#### Snippet
```java
					RELATIVE_PATH_ELT);
		}
		if (!relativePath.isPresent()) {
			relativePath = Optional.of("..");
		}
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/completion/MavenCompletionParticipant.java`
#### Snippet
```java
				allArtifactInfos.addAll((isPlugin ? plugin.getLocalRepositorySearcher().getLocalPluginArtifacts()
						: plugin.getLocalRepositorySearcher().getLocalArtifactsLastVersion()).stream()
								.filter(gav -> !groupId.isPresent() || gav.getGroupId().equals(groupId.get()))
								// TODO pass description as documentation
								.map(ArtifactWithDescription::new).collect(Collectors.toList()));
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/completion/MavenCompletionParticipant.java`
#### Snippet
```java
					plugin.getLocalRepositorySearcher().getLocalArtifactsLastVersion().stream()
							.filter(gav -> gav.getArtifactId().equals(artifactId.get()))
							.filter(gav -> !groupId.isPresent() || gav.getGroupId().equals(groupId.get())).findAny()
							.map(Artifact::getVersion).map(DefaultArtifactVersion::new)
							.map(version -> toCompletionItem(version.toString(), null, request.getReplaceRange()))
```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import org.eclipse.lemminx.dom.DOMElement;`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/MavenLemminxExtension.java`
#### Snippet
```java
import org.eclipse.lemminx.commons.TextDocument;
import org.eclipse.lemminx.dom.DOMDocument;
import org.eclipse.lemminx.dom.DOMElement;
import org.eclipse.lemminx.dom.DOMParser;
import org.eclipse.lemminx.extensions.maven.participants.codeaction.MavenIdPartRemovalCodeAction;
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@param diagnosticRequest` tag description is missing
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/diagnostics/ProjectValidator.java`
#### Snippet
```java
	 * Validates if parent groupId and/or version match the project's ones
	 * 
	 * @param diagnosticRequest
	 * @return
	 */
```

### JavadocDeclaration
`@return` tag description is missing
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/diagnostics/ProjectValidator.java`
#### Snippet
```java
	 * 
	 * @param diagnosticRequest
	 * @return
	 */
	private Optional<List<Diagnostic>> validateParentMatchingGroupIdVersion(DiagnosticRequest diagnosticRequest) {
```

### JavadocDeclaration
`@param diagnosticRequest` tag description is missing
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/diagnostics/ProjectValidator.java`
#### Snippet
```java
	 * Validates if parent groupId and/or version match the project's ones
	 * 
	 * @param diagnosticRequest
	 * @return
	 */
```

### JavadocDeclaration
`@return` tag description is missing
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/diagnostics/ProjectValidator.java`
#### Snippet
```java
	 * 
	 * @param diagnosticRequest
	 * @return
	 */
	public Optional<List<Diagnostic>> validateProject(DiagnosticRequest diagnosticRequest) {
```

### JavadocDeclaration
`@param version` tag description is missing
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/diagnostics/ProjectValidator.java`
#### Snippet
```java
	 * line ending until any element or EOF found
	 * 
	 * @param version
	 * @param ignoreString
	 * @return
```

### JavadocDeclaration
`@param ignoreString` tag description is missing
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/diagnostics/ProjectValidator.java`
#### Snippet
```java
	 * 
	 * @param version
	 * @param ignoreString
	 * @return
	 */
```

### JavadocDeclaration
`@return` tag description is missing
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/diagnostics/ProjectValidator.java`
#### Snippet
```java
	 * @param version
	 * @param ignoreString
	 * @return
	 */
	private static boolean lookForIgnoreMarker(@Nonnull DOMElement version, String ignoreString) {
```

### JavadocDeclaration
`@param diagnosticRequest` tag description is missing
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/diagnostics/ProjectValidator.java`
#### Snippet
```java
	 * Validates if a dependency version duplicates or overrides a managed dependency version
	 * 
	 * @param diagnosticRequest
	 * @param mavenProject
	 * @return
```

### JavadocDeclaration
`@param mavenProject` tag description is missing
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/diagnostics/ProjectValidator.java`
#### Snippet
```java
	 * 
	 * @param diagnosticRequest
	 * @param mavenProject
	 * @return
	 */
```

### JavadocDeclaration
`@return` tag description is missing
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/diagnostics/ProjectValidator.java`
#### Snippet
```java
	 * @param diagnosticRequest
	 * @param mavenProject
	 * @return
	 */
	private Optional<List<Diagnostic>> validateManagedDependencies(DiagnosticRequest diagnosticRequest,
```

### JavadocDeclaration
`@param diagnosticRequest` tag description is missing
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/diagnostics/ProjectValidator.java`
#### Snippet
```java
	 * Validates if a dependency version duplicates or overrides a managed plugin version
	 * 
	 * @param diagnosticRequest
	 * @param mavenProject
	 * @return
```

### JavadocDeclaration
`@param mavenProject` tag description is missing
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/diagnostics/ProjectValidator.java`
#### Snippet
```java
	 * 
	 * @param diagnosticRequest
	 * @param mavenProject
	 * @return
	 */
```

### JavadocDeclaration
`@return` tag description is missing
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/diagnostics/ProjectValidator.java`
#### Snippet
```java
	 * @param diagnosticRequest
	 * @param mavenProject
	 * @return
	 */
	private Optional<List<Diagnostic>> validateManagedPlugins(DiagnosticRequest diagnosticRequest,
```

### JavadocDeclaration
`@param document` tag description is missing
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/MavenProjectCache.java`
#### Snippet
```java
	/**
	 *
	 * @param document
	 * @return the problems for the latest version of the document (either in cache,
	 *         or the one passed in arguments)
```

### JavadocDeclaration
`@param document` tag description is missing
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/MavenProjectCache.java`
#### Snippet
```java
	/**
	 *
	 * @param document
	 * @return the last MavenDocument that could be build for the more recent
	 *         version of the provided document. If document fails to build a
```

### JavadocDeclaration
`@param diagnostic` tag description is missing
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/utils/ParticipantUtils.java`
#### Snippet
```java
	 * Matches the provided Diagnostic with the specified code.
	 * 
	 * @param diagnostic 
	 * @param code
	 * @return Returns true in case the code matches the Diagnostics code (even if both 
```

### JavadocDeclaration
`@param code` tag description is missing
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/utils/ParticipantUtils.java`
#### Snippet
```java
	 * 
	 * @param diagnostic 
	 * @param code
	 * @return Returns true in case the code matches the Diagnostics code (even if both 
	 * 			values are null),, otherwise returns false
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `nested` may be 'final'
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/MojoParameter.java`
#### Snippet
```java
	private String expression;
	private String defaultValue;
	private List<MojoParameter> nested;
	private boolean multiple;
	private boolean map;
```

### FieldMayBeFinal
Field `cache` may be 'final'
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/searcher/LocalRepositorySearcher.java`
#### Snippet
```java
	}

	private Map<File, Collection<Artifact>> cache = new HashMap<>();
	private WatchKey watchKey;
	private WatchService watchService;
```

### FieldMayBeFinal
Field `plugin` may be 'final'
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/diagnostics/PluginValidator.java`
#### Snippet
```java
	private static final Logger LOGGER = Logger.getLogger(PluginValidator.class.getName());

	private MavenLemminxExtension plugin;

	public PluginValidator(MavenLemminxExtension plugin) {
```

### FieldMayBeFinal
Field `toProcess` may be 'final'
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/MavenLemminxWorkspaceReader.java`
#### Snippet
```java
	// Any sorting is to be done before adding to this set
	//
	private Set<File> toProcess = Collections.synchronizedSet(new LinkedHashSet<File>());
	
	private ThreadLocal<Boolean> skipFlushBeforeResult = new ThreadLocal<>();
```

### FieldMayBeFinal
Field `skipFlushBeforeResult` may be 'final'
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/MavenLemminxWorkspaceReader.java`
#### Snippet
```java
	private Set<File> toProcess = Collections.synchronizedSet(new LinkedHashSet<File>());
	
	private ThreadLocal<Boolean> skipFlushBeforeResult = new ThreadLocal<>();
	private final PriorityBlockingQueue</*ResolveArtifactsAndPopulateWorkspaceRunnable*/Runnable> runnables = new PriorityBlockingQueue<>(1, DEEPEST_FIRST);
	private final ExecutorService executor = new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, runnables);
```

### FieldMayBeFinal
Field `workspaceArtifacts` may be 'final'
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/MavenLemminxWorkspaceReader.java`
#### Snippet
```java
	private final ExecutorService executor = new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, runnables);

	private Map<Artifact, File> workspaceArtifacts = new ConcurrentHashMap<>();
	
	public MavenLemminxWorkspaceReader(MavenLemminxExtension plugin) {
```

### FieldMayBeFinal
Field `client` may be 'final'
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/searcher/RemoteCentralRepositorySearcher.java`
#### Snippet
```java
			.parseBoolean(System.getProperty(RemoteCentralRepositorySearcher.class.getName() + ".disableCentralSearch"));

	private OkHttpClient client = new OkHttpClient();

	public RemoteCentralRepositorySearcher(MavenLemminxExtension lemminxMavenPlugin) {
```

### FieldMayBeFinal
Field `codeActionParticipants` may be 'final'
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/MavenLemminxExtension.java`
#### Snippet
```java
	private MavenDefinitionParticipant definitionParticipant;
	private MavenWorkspaceService workspaceServiceParticipant;
	private List<ICodeActionParticipant> codeActionParticipants = new ArrayList<>();

	private MavenProjectCache cache;
```

### FieldMayBeFinal
Field `processedClasses` may be 'final'
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/utils/PlexusConfigHelper.java`
#### Snippet
```java
	// TODO: Maybe using a static variable is bug prone? Although this variable is
	// the only "state" held by this class
	private static Map<Class<?>, List<MojoParameter>> processedClasses = new HashMap<>();

	public static Map<String, Type> getClassProperties(Class<?> clazz) {
```

### FieldMayBeFinal
Field `plugin` may be 'final'
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/diagnostics/ProjectValidator.java`
#### Snippet
```java
	public static String MARKER_IGNORE_MANAGED = "$NO-MVN-MAN-VER$";//$NON-NLS-1$

	private MavenLemminxExtension plugin;

	public ProjectValidator(MavenLemminxExtension plugin) {
```

### FieldMayBeFinal
Field `mavenLemminxExtension` may be 'final'
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/MavenWorkspaceService.java`
#### Snippet
```java
public class MavenWorkspaceService implements IWorkspaceServiceParticipant {

	private MavenLemminxExtension mavenLemminxExtension;

	public MavenWorkspaceService(MavenLemminxExtension mavenLemminxExtension) {
```

## RuleId[id=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `projectParsedListeners` are queried, but never updated
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/MavenProjectCache.java`
#### Snippet
```java
	private ProjectBuilder projectBuilder;

	private final List<Consumer<MavenProject>> projectParsedListeners = new ArrayList<>();

	public MavenProjectCache(MavenLemminxExtension lemminxMavenPlugin) {
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `artifactInfo` is redundant
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/searcher/RemoteCentralRepositorySearcher.java`
#### Snippet
```java
		String a = object.has(ARTIFACT_ID) ? object.get(ARTIFACT_ID).getAsString() : null;
		String v = object.has(LATEST_VERSION) ? object.get(LATEST_VERSION).getAsString() : null;
		Artifact artifactInfo = new DefaultArtifact(g, a, null, v);
		return artifactInfo;
	}
```

### UnnecessaryLocalVariable
Local variable `insertText` is redundant
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/completion/MavenCompletionParticipant.java`
#### Snippet
```java
		item.setSortText(label);
		item.setKind(CompletionItemKind.Property);
		String insertText = label;
		if (description != null) {
			item.setDocumentation(Either.forLeft(description));
```

## RuleId[id=DuplicateThrows]
### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/diagnostics/SubModuleValidator.java`
#### Snippet
```java
	// TODO: This class shouldn't be instantiating the maven model, but be receiving
	// it from a context class instead
	public void setPomFile(File pomFile) throws FileNotFoundException, IOException, XmlPullParserException {
		model = mavenreader.read(new FileReader(pomFile));
	}
```

## RuleId[id=BusyWait]
### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/MavenLemminxWorkspaceReader.java`
#### Snippet
```java
			while (!toProcess.isEmpty()) {
				try {
					Thread.sleep(POLLING_INTERVAL);
				} catch (InterruptedException e) {
					LOGGER.severe(e.getMessage());
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/MavenLemminxWorkspaceReader.java`
#### Snippet
```java
						while (!toProcess.isEmpty() && getCurrentWorkspaceArtifact(projectKey).isEmpty()) {
							try {
								Thread.sleep(POLLING_INTERVAL);
							} catch (InterruptedException e) {
								LOGGER.severe(e.getMessage());
```

## RuleId[id=ArraysAsListWithZeroOrOneArgument]
### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/codeaction/MavenManagedVersionRemovalCodeAction.java`
#### Snippet
```java
						CodeAction openLocation = CodeActionFactory.createCommand("Open declaration of managed version", 
								canSupportOpenUri ? OPEN_URI : "",
								canSupportOpenUri ? Arrays.asList(uri) : null,
								diagnostic);
						codeActions.add(openLocation);
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `artifact` initializer `null` is redundant
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/diagnostics/VersionValidator.java`
#### Snippet
```java
		DOMNode node = diagnosticRequest.getNode();
		Dependency model = MavenParseUtils.parseArtifact(node);
		Artifact artifact = null;
		try {
			artifact = new DefaultArtifact(model.getGroupId(), model.getArtifactId(), model.getVersion(), model.getScope(), model.getType(), model.getClassifier(), new DefaultArtifactHandler(model.getType()));
```

### UnusedAssignment
Variable `propertyDeclaration` initializer `null` is redundant
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/hover/MavenHoverParticipant.java`
#### Snippet
```java
					}

					DOMNode propertyDeclaration = null;
					Predicate<DOMNode> isMavenProperty = (node) -> PROPERTIES_ELT.equals(node.getParentNode().getLocalName());

```

### UnusedAssignment
Variable `propertyDeclaration` initializer `null` is redundant
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/definition/MavenDefinitionParticipant.java`
#### Snippet
```java
		}

		DOMNode propertyDeclaration = null;
		Predicate<DOMNode> isMavenProperty = (node) -> PROPERTIES_ELT.equals(node.getParentNode().getLocalName());
		URI childProjectUri = ParticipantUtils.normalizedUri(childProj.getFile().toURI().toString());
```

### UnusedAssignment
Variable `index` initializer `-1` is redundant
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/utils/ParticipantUtils.java`
#### Snippet
```java
		
		StringBuilder sb = new StringBuilder();
		int index = -1;
		int closeIndex = -1;
		int start = 0;
```

### UnusedAssignment
Variable `closeIndex` initializer `-1` is redundant
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/utils/ParticipantUtils.java`
#### Snippet
```java
		StringBuilder sb = new StringBuilder();
		int index = -1;
		int closeIndex = -1;
		int start = 0;
		while((index = value.indexOf("${", start)) != -1 && 
```

### UnusedAssignment
Variable `relativePath` initializer `null` is redundant
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/completion/MavenCompletionParticipant.java`
#### Snippet
```java
	@SuppressWarnings("deprecation")
	private Optional<MavenProject> computeFilesystemParent(ICompletionRequest request) {
		Optional<String> relativePath = null;
		if (request.getParentElement().getLocalName().equals(PARENT_ELT)) {
			relativePath = DOMUtils.findChildElementText(request.getNode(), RELATIVE_PATH_ELT);
```

## RuleId[id=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/diagnostics/ProjectValidator.java`
#### Snippet
```java
				.getLastSuccessfulMavenProject(diagnosticRequest.getXMLDocument());
		List<Diagnostic> diagnostics = new ArrayList<>();
		diagnostics.addAll(validateParentMatchingGroupIdVersion(diagnosticRequest).get());
		if (project != null) {
			diagnostics.addAll(validateManagedDependencies(diagnosticRequest, project).get());
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/diagnostics/ProjectValidator.java`
#### Snippet
```java
		diagnostics.addAll(validateParentMatchingGroupIdVersion(diagnosticRequest).get());
		if (project != null) {
			diagnostics.addAll(validateManagedDependencies(diagnosticRequest, project).get());
			diagnostics.addAll(validateManagedPlugins(diagnosticRequest, project).get());
		}
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/diagnostics/ProjectValidator.java`
#### Snippet
```java
		if (project != null) {
			diagnostics.addAll(validateManagedDependencies(diagnosticRequest, project).get());
			diagnostics.addAll(validateManagedPlugins(diagnosticRequest, project).get());
		}
		return Optional.of(diagnostics);
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `replace` at the left side of assignment expression is always `false`. Can be simplified
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/searcher/LocalRepositorySearcher.java`
#### Snippet
```java
				if (existingGav != null) {
					ArtifactVersion existingVersion = new DefaultArtifactVersion(existingGav.getVersion());
					replace |= existingVersion.compareTo(version) < 0;
					replace |= (existingVersion.toString().endsWith("-SNAPSHOT") && !version.toString().endsWith("-SNAPSHOT"));
				}
```

### ConstantValue
Condition `canSupportOpenUri` is always `true`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/codeaction/MavenManagedVersionRemovalCodeAction.java`
#### Snippet
```java
						}
						CodeAction openLocation = CodeActionFactory.createCommand("Open declaration of managed version", 
								canSupportOpenUri ? OPEN_URI : "",
								canSupportOpenUri ? Arrays.asList(uri) : null,
								diagnostic);
```

### ConstantValue
Condition `canSupportOpenUri` is always `true`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/codeaction/MavenManagedVersionRemovalCodeAction.java`
#### Snippet
```java
						CodeAction openLocation = CodeActionFactory.createCommand("Open declaration of managed version", 
								canSupportOpenUri ? OPEN_URI : "",
								canSupportOpenUri ? Arrays.asList(uri) : null,
								diagnostic);
						codeActions.add(openLocation);
```

### ConstantValue
Method reference result is always 'true'
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/codeaction/MavenIdPartRemovalCodeAction.java`
#### Snippet
```java
		Optional<DOMElement> project = DOMUtils.findChildElement(document, PROJECT_ELT);
		project.flatMap(p ->DOMUtils.findChildElement(project.get(), isVersion ? VERSION_ELT : GROUP_ID_ELT))
			.filter(DOMElement.class::isInstance).map(DOMElement.class::cast).ifPresent(v -> {
				TextDocument textDocument = document.getTextDocument();
				try {
```

### ConstantValue
Condition `location != null` is always `true`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/diagnostics/ProjectValidator.java`
#### Snippet
```java
				if (loc != null) {
					File file = new File(loc);
					int lineNumber = location != null ? location.getLineNumber() : -1;
					int columnNumber = location != null ? location.getColumnNumber() : -1;
					if (file != null) {
```

### ConstantValue
Condition `location != null` is always `true`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/diagnostics/ProjectValidator.java`
#### Snippet
```java
					File file = new File(loc);
					int lineNumber = location != null ? location.getLineNumber() : -1;
					int columnNumber = location != null ? location.getColumnNumber() : -1;
					if (file != null) {
						addDiagnocticData(diagnostic, ATTR_MANAGED_VERSION_LOCATION, file.toURI().toString());
```

### ConstantValue
Condition `file != null` is always `true`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/diagnostics/ProjectValidator.java`
#### Snippet
```java
					int lineNumber = location != null ? location.getLineNumber() : -1;
					int columnNumber = location != null ? location.getColumnNumber() : -1;
					if (file != null) {
						addDiagnocticData(diagnostic, ATTR_MANAGED_VERSION_LOCATION, file.toURI().toString());
						if (lineNumber > -1) {
```

### ConstantValue
Condition `project == null` is always `false`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/utils/ParticipantUtils.java`
#### Snippet
```java
			}
		}
		allProps.put("basedir", project == null ? "unknown" : project.getBasedir().toString());
		allProps.put("project.basedir", project == null ? "unknown" : project.getBasedir().toString());
		allProps.put("project.version", project == null ? "unknown" : project.getVersion());
```

### ConstantValue
Condition `project == null` is always `false`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/utils/ParticipantUtils.java`
#### Snippet
```java
		}
		allProps.put("basedir", project == null ? "unknown" : project.getBasedir().toString());
		allProps.put("project.basedir", project == null ? "unknown" : project.getBasedir().toString());
		allProps.put("project.version", project == null ? "unknown" : project.getVersion());
		allProps.put("project.groupId", project == null ? "unknown" : project.getGroupId());
```

### ConstantValue
Condition `project == null` is always `false`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/utils/ParticipantUtils.java`
#### Snippet
```java
		allProps.put("basedir", project == null ? "unknown" : project.getBasedir().toString());
		allProps.put("project.basedir", project == null ? "unknown" : project.getBasedir().toString());
		allProps.put("project.version", project == null ? "unknown" : project.getVersion());
		allProps.put("project.groupId", project == null ? "unknown" : project.getGroupId());
		allProps.put("project.artifactId", project == null ? "unknown" : project.getArtifactId());
```

### ConstantValue
Condition `project == null` is always `false`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/utils/ParticipantUtils.java`
#### Snippet
```java
		allProps.put("project.basedir", project == null ? "unknown" : project.getBasedir().toString());
		allProps.put("project.version", project == null ? "unknown" : project.getVersion());
		allProps.put("project.groupId", project == null ? "unknown" : project.getGroupId());
		allProps.put("project.artifactId", project == null ? "unknown" : project.getArtifactId());
		allProps.put("project.name", project == null ? "unknown" : project.getName());
```

### ConstantValue
Condition `project == null` is always `false`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/utils/ParticipantUtils.java`
#### Snippet
```java
		allProps.put("project.version", project == null ? "unknown" : project.getVersion());
		allProps.put("project.groupId", project == null ? "unknown" : project.getGroupId());
		allProps.put("project.artifactId", project == null ? "unknown" : project.getArtifactId());
		allProps.put("project.name", project == null ? "unknown" : project.getName());
		allProps.put("project.build.directory",
```

### ConstantValue
Condition `project == null` is always `false`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/utils/ParticipantUtils.java`
#### Snippet
```java
		allProps.put("project.groupId", project == null ? "unknown" : project.getGroupId());
		allProps.put("project.artifactId", project == null ? "unknown" : project.getArtifactId());
		allProps.put("project.name", project == null ? "unknown" : project.getName());
		allProps.put("project.build.directory",
				project.getBuild() == null ? "unknown" : project.getBuild().getDirectory());
```

### ConstantValue
Condition `parameters != null` is always `true`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/completion/MavenCompletionParticipant.java`
#### Snippet
```java
							(p.type.startsWith(STRING_TYPE) && p.name.toLowerCase().endsWith(DIRECTORY_STRING_LC)))
					.collect(Collectors.toSet());
			if (parameters != null && parameters.size() > 0) {
				collectMojoParametersDefaultCompletion(request, parameters)
				.forEach(response::addCompletionItem);
```

