# lemminx-maven 
 
# Bad smells
I found 285 bad smells with 37 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| ReturnNull | 62 | false |
| SimplifyStreamApiCallChains | 25 | false |
| DataFlowIssue | 23 | false |
| OptionalContainsCollection | 17 | false |
| ConstantValue | 14 | false |
| UnnecessaryModifier | 12 | true |
| FieldAccessedSynchronizedAndUnsynchronized | 12 | false |
| CodeBlock2Expr | 11 | true |
| BoundedWildcard | 9 | false |
| UnusedAssignment | 7 | false |
| EnhancedSwitchMigration | 6 | false |
| UnnecessaryFullyQualifiedName | 6 | false |
| UtilityClassWithoutPrivateConstructor | 5 | true |
| SizeReplaceableByIsEmpty | 4 | true |
| SimplifyOptionalCallChains | 4 | false |
| NestedAssignment | 4 | false |
| Convert2MethodRef | 4 | false |
| DuplicateBranchesInSwitch | 3 | false |
| OptionalGetWithoutIsPresent | 3 | false |
| StringOperationCanBeSimplified | 3 | false |
| OptionalUsedAsFieldOrParameterType | 3 | false |
| CharsetObjectCanBeUsed | 3 | false |
| AssignmentToMethodParameter | 3 | false |
| FinalPrivateMethod | 2 | false |
| DuplicateExpressions | 2 | false |
| NonShortCircuitBoolean | 2 | false |
| UnnecessaryReturn | 2 | true |
| FinalStaticMethod | 2 | false |
| RedundantStreamOptionalCall | 2 | false |
| ZeroLengthArrayInitialization | 2 | false |
| PublicFieldAccessedInSynchronizedContext | 2 | false |
| UnnecessaryBoxing | 2 | false |
| SynchronizeOnNonFinalField | 2 | false |
| DynamicRegexReplaceableByCompiledPattern | 2 | false |
| UnnecessaryLocalVariable | 2 | true |
| BusyWait | 2 | false |
| CommentedOutCode | 1 | false |
| TrivialStringConcatenation | 1 | false |
| MissortedModifiers | 1 | false |
| UnnecessaryUnboxing | 1 | false |
| OptionalAssignedToNull | 1 | false |
| MismatchedCollectionQueryUpdate | 1 | false |
| EmptyMethod | 1 | false |
| RedundantFieldInitialization | 1 | false |
| DuplicateThrows | 1 | false |
| MethodOverridesStaticMethod | 1 | false |
| UnnecessarySemicolon | 1 | false |
| RedundantCollectionOperation | 1 | false |
| CatchMayIgnoreException | 1 | false |
| UnnecessaryToStringCall | 1 | true |
| AssignmentToLambdaParameter | 1 | false |
| ClassCanBeRecord | 1 | false |
## RuleId[id=UnnecessaryModifier]
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
	private static final String DIRECTORY_STRING_LC = "directory";
	
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

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`title.trim().length() > 0` can be replaced with '!title.trim().isEmpty()'
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/utils/MarkdownUtils.java`
#### Snippet
```java
				}
			}
			if (title != null && title.trim().length() > 0) {
				link.append(' ').append('"').append(title.trim()).append('"');
			}
```

### SizeReplaceableByIsEmpty
`sb.length() == 0` can be replaced with 'sb.isEmpty()'
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/utils/ParticipantUtils.java`
#### Snippet
```java
		sb.append(value.substring(start));
		
		return sb.length() == 0 ? null : sb.toString();
	}
	
```

### SizeReplaceableByIsEmpty
`str.length() > 0` can be replaced with '!str.isEmpty()'
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/utils/ParticipantUtils.java`
#### Snippet
```java
	
	private static void notNullNorBlank(String str) {
        int c = str != null && str.length() > 0 ? str.charAt( 0 ) : 0;
        if ( ( c < '0' || c > '9' ) && ( c < 'a' || c > 'z' ) )
        {
```

### SizeReplaceableByIsEmpty
`parameters.size() > 0` can be replaced with '!parameters.isEmpty()'
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/completion/MavenCompletionParticipant.java`
#### Snippet
```java
							(p.type.startsWith(STRING_TYPE) && p.name.toLowerCase().endsWith(DIRECTORY_STRING_LC)))
					.collect(Collectors.toSet());
			if (parameters != null && parameters.size() > 0) {
				collectMojoParametersDefaultCompletion(request, parameters)
				.forEach(response::addCompletionItem);
```

## RuleId[id=NonShortCircuitBoolean]
### NonShortCircuitBoolean
Non-short-circuit boolean expression `replace |= existingVersion.compareTo(version) < 0`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/searcher/LocalRepositorySearcher.java`
#### Snippet
```java
				if (existingGav != null) {
					ArtifactVersion existingVersion = new DefaultArtifactVersion(existingGav.getVersion());
					replace |= existingVersion.compareTo(version) < 0;
					replace |= (existingVersion.toString().endsWith("-SNAPSHOT") && !version.toString().endsWith("-SNAPSHOT"));
				}
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `replace |= (existingVersion.toString().endsWith("-SNAPSHOT") && !version.toString().endsWith("-SNAPS...`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/searcher/LocalRepositorySearcher.java`
#### Snippet
```java
					ArtifactVersion existingVersion = new DefaultArtifactVersion(existingGav.getVersion());
					replace |= existingVersion.compareTo(version) < 0;
					replace |= (existingVersion.toString().endsWith("-SNAPSHOT") && !version.toString().endsWith("-SNAPSHOT"));
				}
				if (replace) {
```

## RuleId[id=UnnecessaryReturn]
### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/definition/MavenDefinitionParticipant.java`
#### Snippet
```java
			if (localArtifactLocation != null && localArtifactLocation.isFile()) {
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

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends Parameter`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/diagnostics/PluginValidator.java`
#### Snippet
```java
	}

	private static Optional<Diagnostic> validateConfigurationElement(DiagnosticRequest diagnosticReq, Set<Parameter> parameters) {
		DOMNode node = diagnosticReq.getNode();
		if (node.getLocalName() == null) {
```

### BoundedWildcard
Can generalize to `? extends ArtifactRepository`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/MavenLemminxExtension.java`
#### Snippet
```java
	}

	private List<ArtifactRepository> joinRemoteRepositories(List<ArtifactRepository> a, List<ArtifactRepository> b) {
		if (a.isEmpty()) {
			return b;
```

### BoundedWildcard
Can generalize to `? extends Range`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/hover/MavenHoverParticipant.java`
#### Snippet
```java
	}

	private Hover collectProperty(IHoverRequest request, Map.Entry<Range, String> property) {
		boolean supportsMarkdown = request.canSupportMarkupKind(MarkupKind.MARKDOWN);
		UnaryOperator<String> toBold = supportsMarkdown ? MarkdownUtils::toBold : UnaryOperator.identity();
```

### BoundedWildcard
Can generalize to `? super ArtifactWithDescription`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/completion/MavenCompletionParticipant.java`
#### Snippet
```java
	}
	
	private void internalCollectWorkspaceArtifacts(ICompletionRequest request, Collection<ArtifactWithDescription> artifactInfosCollector,
			Optional<String> groupId, Optional<String> artifactId) {
		DOMElement parent = request.getParentElement();
```

### BoundedWildcard
Can generalize to `? extends MojoParameter`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/completion/MavenCompletionParticipant.java`
#### Snippet
```java
	}

	private Collection<CompletionItem> collectMojoParametersDefaultCompletion(ICompletionRequest request, Set<MojoParameter> parameters) {
		String prefix = request.getNode().getNodeValue() != null ? request.getNode().getNodeValue() : "";
		List<String> defaultValues = parameters.stream().filter(p -> (p.getDefaultValue() != null))
```

### BoundedWildcard
Can generalize to `? extends T`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/completion/MavenCompletionParticipant.java`
#### Snippet
```java
	}

	private <T> Collection<CompletionItem> collectSimpleCompletionItems(Collection<T> items,
			Function<T, String> insertionTextExtractor, Function<T, String> documentationExtractor,
			ICompletionRequest request) {
```

### BoundedWildcard
Can generalize to `? super T`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/completion/MavenCompletionParticipant.java`
#### Snippet
```java

	private <T> Collection<CompletionItem> collectSimpleCompletionItems(Collection<T> items,
			Function<T, String> insertionTextExtractor, Function<T, String> documentationExtractor,
			ICompletionRequest request) {
		DOMElement node = request.getParentElement();
```

### BoundedWildcard
Can generalize to `? super T`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/completion/MavenCompletionParticipant.java`
#### Snippet
```java

	private <T> Collection<CompletionItem> collectSimpleCompletionItems(Collection<T> items,
			Function<T, String> insertionTextExtractor, Function<T, String> documentationExtractor,
			ICompletionRequest request) {
		DOMElement node = request.getParentElement();
```

### BoundedWildcard
Can generalize to `? super ArtifactWithDescription`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/completion/MavenCompletionParticipant.java`
#### Snippet
```java

	private void internalCollectRemoteGAVCompletion(ICompletionRequest request, boolean onlyPlugins,
			Collection<ArtifactWithDescription> artifactInfosCollector, ICompletionResponse nonArtifactCollector, CancelChecker cancelChecker) {
		DOMElement node = request.getParentElement();
		Dependency artifactToSearch = MavenParseUtils.parseArtifact(node);
```

## RuleId[id=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `final static`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/MavenSyntaxErrorCode.java`
#### Snippet
```java
	}
	
	private final static Map<String, MavenSyntaxErrorCode> codes;

	static {
```

## RuleId[id=UnnecessaryUnboxing]
### UnnecessaryUnboxing
Unnecessary unboxing
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/MavenProjectCache.java`
#### Snippet
```java
	private void check(DOMDocument document) {
		Integer last = lastCheckedVersion.get(URI.create(document.getTextDocument().getUri()).normalize());
		if (last == null || last.intValue() < document.getTextDocument().getVersion()) {
			parseAndCache(document);
		}
```

## RuleId[id=RedundantStreamOptionalCall]
### RedundantStreamOptionalCall
Redundant 'distinct()' call: elements will be distinct anyway when collected to a Set
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/searcher/LocalRepositorySearcher.java`
#### Snippet
```java

	public Set<String> searchGroupIds() throws IOException {
		return getLocalArtifactsLastVersion().stream().map(Artifact::getGroupId).distinct().collect(Collectors.toSet());
	}

```

### RedundantStreamOptionalCall
Redundant 'distinct()' call: elements will be distinct anyway when collected to a Set
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/searcher/LocalRepositorySearcher.java`
#### Snippet
```java

	public Set<String> searchPluginGroupIds() throws IOException {
		return getLocalPluginArtifacts().stream().map(Artifact::getGroupId).distinct().collect(Collectors.toSet());
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

## RuleId[id=SimplifyOptionalCallChains]
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

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/searcher/LocalRepositorySearcher.java`
#### Snippet
```java
				WatchKey key;
				try {
					while ((key = watchService.take()) != null) {
						if (watchKey.equals(key)) {
							cache.remove(localRepository);
```

### NestedAssignment
Result of assignment expression used
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/utils/ParticipantUtils.java`
#### Snippet
```java
		int closeIndex = -1;
		int start = 0;
		while((index = value.indexOf("${", start)) != -1 && 
				(closeIndex = value.indexOf("}", start)) != -1) {
			sb.append(value.substring(start, index));
```

### NestedAssignment
Result of assignment expression used
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/utils/ParticipantUtils.java`
#### Snippet
```java
		int start = 0;
		while((index = value.indexOf("${", start)) != -1 && 
				(closeIndex = value.indexOf("}", start)) != -1) {
			sb.append(value.substring(start, index));
			String propertyName = value.substring(index + 2, closeIndex);
```

### NestedAssignment
Result of assignment expression used
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/diagnostics/ProjectValidator.java`
#### Snippet
```java
	private static boolean lookForIgnoreMarker(@Nonnull DOMElement version, String ignoreString) {
		DOMNode reg = version;
		while ((reg = reg.getNextSibling()) != null && !(reg instanceof DOMElement)) {
			if (reg instanceof DOMComment comm) {
				String data = comm.getData();
```

## RuleId[id=CodeBlock2Expr]
### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/diagnostics/MavenDiagnosticParticipant.java`
#### Snippet
```java
			ProjectValidator projectValidator = new ProjectValidator(plugin);
			projectValidator.validateProject(new DiagnosticRequest(documentElement, xmlDocument))
				.ifPresent(diagnosticList ->{
						diagnostics.addAll(diagnosticList.stream()
							.filter(diagnostic -> !diagnostics.contains(diagnostic)).collect(Collectors.toList()));
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/diagnostics/ProjectValidator.java`
#### Snippet
```java
		List<DOMElement> candidates = new ArrayList<>();
		Optional<DOMElement> dependencies = DOMUtils.findChildElement(node, DEPENDENCIES_ELT);
		dependencies.ifPresent(dependenciesElement -> {
			DOMUtils.findChildElements(dependenciesElement, DEPENDENCY_ELT).stream()
					.filter(dependency -> DOMUtils.findChildElement(dependency, VERSION_ELT).isPresent())
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/diagnostics/ProjectValidator.java`
#### Snippet
```java
		Map<DOMElement, String> candidateProfile = new HashMap<>();
		Optional<DOMElement> profiles = DOMUtils.findChildElement(node, PROFILES_ELT);
		profiles.ifPresent(profilesElement -> {
			DOMUtils.findChildElements(profilesElement, PROFILE_ELT).stream().forEach(profile -> {
				Optional<String> idString = DOMUtils.findChildElementText(profile, ID_ELT);
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/diagnostics/ProjectValidator.java`
#### Snippet
```java
				if (idString.isPresent() && activeprofiles.contains(idString.get())) {
					Optional<DOMElement> profileDependencies = DOMUtils.findChildElement(profile, DEPENDENCIES_ELT);
					profileDependencies.ifPresent(dependenciesElement -> {
						DOMUtils.findChildElements(dependenciesElement, DEPENDENCY_ELT).stream()
								.filter(dependency -> DOMUtils.findChildElement(dependency, VERSION_ELT).isPresent())
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/diagnostics/ProjectValidator.java`
#### Snippet
```java
		build.ifPresent(buildElement -> {
			Optional<DOMElement> plugins = DOMUtils.findChildElement(buildElement, PLUGINS_ELT);
			plugins.ifPresent(pluginsElement -> {
				DOMUtils.findChildElements(pluginsElement, PLUGIN_ELT).stream()
						.filter(plugin -> DOMUtils.findChildElement(plugin, VERSION_ELT).isPresent())
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/diagnostics/ProjectValidator.java`
#### Snippet
```java
		Map<DOMElement, String> candidateProfile = new HashMap<>();
		Optional<DOMElement> profiles = DOMUtils.findChildElement(node, PROFILES_ELT);
		profiles.ifPresent(profilesElement -> {
			DOMUtils.findChildElements(profilesElement, PROFILE_ELT).stream().forEach(profile -> {
				Optional<String> idString = DOMUtils.findChildElementText(profile, ID_ELT);
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/diagnostics/ProjectValidator.java`
#### Snippet
```java
					profileBuild.ifPresent(buildElement -> {
						Optional<DOMElement> plugins = DOMUtils.findChildElement(buildElement, PLUGINS_ELT);
						plugins.ifPresent(pluginsElement -> {
							DOMUtils.findChildElements(pluginsElement, PLUGIN_ELT).stream()
									.filter(plugin -> DOMUtils.findChildElement(plugin, VERSION_ELT).isPresent())
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/searcher/RemoteCentralRepositorySearcher.java`
#### Snippet
```java

		Set<ArtifactVersion> artifactVersions = new HashSet<ArtifactVersion>();
		responseBody.get("docs").getAsJsonArray().forEach(d -> {
			artifactVersions.add(new DefaultArtifactVersion(d.getAsJsonObject().get(VERSION).getAsString()));
		});
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/searcher/RemoteCentralRepositorySearcher.java`
#### Snippet
```java
		
		Set<String> artifactGroupIds = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
		responseBody.get("docs").getAsJsonArray().forEach(d -> {
			artifactGroupIds.add(d.getAsJsonObject().get(GROUP_ID).getAsString());
		});
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/searcher/RemoteCentralRepositorySearcher.java`
#### Snippet
```java

		List<Artifact> artifactInfos = new ArrayList<>();
		responseBody.get("docs").getAsJsonArray().forEach(d -> {
			artifactInfos.add(toArtifactInfo(d.getAsJsonObject()));
		});
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/MavenLemminxExtension.java`
#### Snippet
```java
		Collection<MavenProject> cachedProjects = getProjectCache().getProjects();
		return cachedProjects.stream().filter(p -> {
			return Arrays.stream(removed).anyMatch(uri -> {
				Path removedPath = new File(uri).toPath();
				return p.getFile().toPath().startsWith(removedPath);
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

## RuleId[id=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `initialWorkspaceFolders` is accessed in both synchronized and unsynchronized contexts
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/MavenLemminxExtension.java`
#### Snippet
```java
	XMLMavenSettings settings = new XMLMavenSettings();
	private URIResolverExtensionManager resolverExtensionManager;
	private List<WorkspaceFolder> initialWorkspaceFolders = List.of();
	
	@Override
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `mavenSession` is accessed in both synchronized and unsynchronized contexts
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/MavenLemminxExtension.java`
#### Snippet
```java
	private MavenPluginManager mavenPluginManager;
	private PlexusContainer container;
	private MavenSession mavenSession;
	private BuildPluginManager buildPluginManager;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `cache` is accessed in both synchronized and unsynchronized contexts
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/MavenLemminxExtension.java`
#### Snippet
```java
	private List<ICodeActionParticipant> codeActionParticipants = new ArrayList<>();

	private MavenProjectCache cache;
	private RemoteCentralRepositorySearcher centralSearcher;
	private LocalRepositorySearcher localRepositorySearcher;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `mavenRequest` is accessed in both synchronized and unsynchronized contexts
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/MavenLemminxExtension.java`
#### Snippet
```java
	private RemoteCentralRepositorySearcher centralSearcher;
	private LocalRepositorySearcher localRepositorySearcher;
	private MavenExecutionRequest mavenRequest;
	private MavenPluginManager mavenPluginManager;
	private PlexusContainer container;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `codeActionParticipants` is accessed in both synchronized and unsynchronized contexts
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/MavenLemminxExtension.java`
#### Snippet
```java
	private MavenDefinitionParticipant definitionParticipant;
	private MavenWorkspaceService workspaceServiceParticipant;
	private List<ICodeActionParticipant> codeActionParticipants = new ArrayList<>();

	private MavenProjectCache cache;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `localRepositorySearcher` is accessed in both synchronized and unsynchronized contexts
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/MavenLemminxExtension.java`
#### Snippet
```java
	private MavenProjectCache cache;
	private RemoteCentralRepositorySearcher centralSearcher;
	private LocalRepositorySearcher localRepositorySearcher;
	private MavenExecutionRequest mavenRequest;
	private MavenPluginManager mavenPluginManager;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `mavenPluginManager` is accessed in both synchronized and unsynchronized contexts
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/MavenLemminxExtension.java`
#### Snippet
```java
	private LocalRepositorySearcher localRepositorySearcher;
	private MavenExecutionRequest mavenRequest;
	private MavenPluginManager mavenPluginManager;
	private PlexusContainer container;
	private MavenSession mavenSession;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `container` is accessed in both synchronized and unsynchronized contexts
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/MavenLemminxExtension.java`
#### Snippet
```java
	private MavenExecutionRequest mavenRequest;
	private MavenPluginManager mavenPluginManager;
	private PlexusContainer container;
	private MavenSession mavenSession;
	private BuildPluginManager buildPluginManager;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `settings` is accessed in both synchronized and unsynchronized contexts
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/MavenLemminxExtension.java`
#### Snippet
```java
	private BuildPluginManager buildPluginManager;

	XMLMavenSettings settings = new XMLMavenSettings();
	private URIResolverExtensionManager resolverExtensionManager;
	private List<WorkspaceFolder> initialWorkspaceFolders = List.of();
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `centralSearcher` is accessed in both synchronized and unsynchronized contexts
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/MavenLemminxExtension.java`
#### Snippet
```java

	private MavenProjectCache cache;
	private RemoteCentralRepositorySearcher centralSearcher;
	private LocalRepositorySearcher localRepositorySearcher;
	private MavenExecutionRequest mavenRequest;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `buildPluginManager` is accessed in both synchronized and unsynchronized contexts
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/MavenLemminxExtension.java`
#### Snippet
```java
	private PlexusContainer container;
	private MavenSession mavenSession;
	private BuildPluginManager buildPluginManager;

	XMLMavenSettings settings = new XMLMavenSettings();
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `currentRegistry` is accessed in both synchronized and unsynchronized contexts
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/MavenLemminxExtension.java`
#### Snippet
```java
	private static final String MAVEN_XMLLS_EXTENSION_REALM_ID = MavenLemminxExtension.class.getName();

	private XMLExtensionsRegistry currentRegistry;

	private ICompletionParticipant completionParticipant;
```

## RuleId[id=EmptyMethod]
### EmptyMethod
The method is empty
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/searcher/RemoteCentralRepositorySearcher.java`
#### Snippet
```java
	}
	
	public void closeContext() {
	}
	
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `null` is redundant
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/utils/ParticipantUtils.java`
#### Snippet
```java
	private static final Logger LOGGER = Logger.getLogger(ParticipantUtils.class.getName());

	private static Properties environmentProperties = null;
	
	public static Properties getEnvironmentProperties() {
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/MavenLemminxExtension.java`
#### Snippet
```java
		WorkspaceReader workspaceReader = mavenRequest.getWorkspaceReader();
		if (workspaceReader instanceof MavenLemminxWorkspaceReader reader) {
			Collection<URI> projectsToAdd = computeAddedWorkspaceProjects(added != null? added : new URI[0]);
			Collection<URI> projectsToRemove = computeRemovedWorkspaceProjects(removed != null ? removed : new URI[0]);

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/MavenLemminxExtension.java`
#### Snippet
```java
		if (workspaceReader instanceof MavenLemminxWorkspaceReader reader) {
			Collection<URI> projectsToAdd = computeAddedWorkspaceProjects(added != null? added : new URI[0]);
			Collection<URI> projectsToRemove = computeRemovedWorkspaceProjects(removed != null ? removed : new URI[0]);

			reader.addToWorkspace(projectsToAdd);
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

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `propertyDeclaration` initializer `null` is redundant
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/definition/MavenDefinitionParticipant.java`
#### Snippet
```java
		}

		DOMNode propertyDeclaration = null;
		Predicate<DOMNode> isMavenProperty = (node) -> PROPERTIES_ELT.equals(node.getParentNode().getLocalName());

```

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
Variable `propertyDeclaration` initializer `null` is redundant
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/hover/MavenHoverParticipant.java`
#### Snippet
```java
					}

					DOMNode propertyDeclaration = null;
					Predicate<DOMNode> isMavenProperty = (node) -> PROPERTIES_ELT.equals(node.getParentNode().getLocalName());

```

### UnusedAssignment
Variable `message` initializer `null` is redundant
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/hover/MavenHoverParticipant.java`
#### Snippet
```java
		UnaryOperator<String> toBold = supportsMarkdown ? MarkdownUtils::toBold : UnaryOperator.identity();

		String message = null;
		if (version != null) {
			message = toBold.apply(MessageFormat.format(PomTextHover_managed_version, version));
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

## RuleId[id=MethodOverridesStaticMethod]
### MethodOverridesStaticMethod
Method `getGeneralXMLSettings()` tries to override a static method of a superclass
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/XMLMavenGeneralSettings.java`
#### Snippet
```java
	}

	public static XMLMavenGeneralSettings getGeneralXMLSettings(Object initializationOptionsSettings) {
		return JSONUtility.toModel(initializationOptionsSettings, XMLMavenGeneralSettings.class);
	}
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `MavenParseUtils` has only 'static' members, and lacks a 'private' constructor
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/utils/MavenParseUtils.java`
#### Snippet
```java
import org.eclipse.lemminx.dom.DOMNode;

public class MavenParseUtils {

	private static final Logger LOGGER = Logger.getLogger(MavenParseUtils.class.getName());
```

### UtilityClassWithoutPrivateConstructor
Class `VersionValidator` has only 'static' members, and lacks a 'private' constructor
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/diagnostics/VersionValidator.java`
#### Snippet
```java
import org.eclipse.lsp4j.DiagnosticSeverity;

class VersionValidator {

	private static final Logger LOGGER = Logger.getLogger(VersionValidator.class.getName());
```

### UtilityClassWithoutPrivateConstructor
Class `DOMUtils` has only 'static' members, and lacks a 'private' constructor
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/utils/DOMUtils.java`
#### Snippet
```java
import org.w3c.dom.Text;

public class DOMUtils {

	public static DOMNode findClosestParentNode(final DOMNode node, final String localName) {
```

### UtilityClassWithoutPrivateConstructor
Class `ParticipantUtils` has only 'static' members, and lacks a 'private' constructor
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/utils/ParticipantUtils.java`
#### Snippet
```java
import org.eclipse.lsp4j.Range;

public class ParticipantUtils {
	private static final Logger LOGGER = Logger.getLogger(ParticipantUtils.class.getName());

```

### UtilityClassWithoutPrivateConstructor
Class `PlexusConfigHelper` has only 'static' members, and lacks a 'private' constructor
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/utils/PlexusConfigHelper.java`
#### Snippet
```java
 * @see org.codehaus.plexus.component.configurator.converters.composite.ObjectWithFieldsConverter
 */
public class PlexusConfigHelper {
	// TODO: Rename this class maybe?

```

## RuleId[id=UnnecessarySemicolon]
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

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `equals` may produce `NullPointerException`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/definition/MavenDefinitionParticipant.java`
#### Snippet
```java
		URI childProjectUri = ParticipantUtils.normalizedUri(childProj.getFile().toURI().toString());
		URI thisProjectUri = ParticipantUtils.normalizedUri(xmlDocument.getDocumentURI());
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
Argument `plugin.getProjectCache().getSnapshotProject(artifact.getFile()).orElse(null)` might be null
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/hover/MavenHoverParticipant.java`
#### Snippet
```java
				if (artifact != null && artifact.getFile() != null) {
					yield hoverForProject(request,
							plugin.getProjectCache().getSnapshotProject(artifact.getFile()).orElse(null),
							ParticipantUtils.isWellDefinedDependency(artifactToSearch));
				}
```

### DataFlowIssue
Method invocation `toURI` may produce `NullPointerException`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/hover/MavenHoverParticipant.java`
#### Snippet
```java
		String sourceModelId = project.getGroupId() + ':' + project.getArtifactId() + ':' + project.getVersion();
		File locacion = project.getFile();
		return createVersionMessage(supportsMarkdown, project.getVersion(), (locacion != null && locacion.exists() ? sourceModelId : null), locacion.toURI().toString());
	}
	
```

### DataFlowIssue
Method invocation `equals` may produce `NullPointerException`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/hover/MavenHoverParticipant.java`
#### Snippet
```java
					URI childProjectUri = ParticipantUtils.normalizedUri(childProj.getFile().toURI().toString());
					URI thisProjectUri = ParticipantUtils.normalizedUri(doc.getDocumentURI());
					if (childProjectUri.equals(thisProjectUri)) {
						// Property is defined in the same file as the request
						propertyDeclaration = DOMUtils.findNodesByLocalName(doc, property.getValue()).stream()
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
						// Don't add a diagnostic if it already exists
						diagnostics.addAll(diagnosticList.stream()
								.filter(diagnostic -> !diagnostics.contains(diagnostic)).collect(Collectors.toList()));
					});
				}
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

			reader.addToWorkspace(projectsToAdd);
			projectsToRemove.stream().forEach(reader::remove);
		}
	}
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
'filter()' and 'map()' can be swapped
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/completion/MavenCompletionParticipant.java`
#### Snippet
```java
		String prefix = request.getNode().getNodeValue() != null ? request.getNode().getNodeValue() : "";
		List<String> defaultValues = parameters.stream().filter(p -> (p.getDefaultValue() != null))
				.map(p -> p.getDefaultValue())
				.collect(Collectors.toList());

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

## RuleId[id=OptionalContainsCollection]
### OptionalContainsCollection
'Optional' contains collection `List`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/diagnostics/SubModuleValidator.java`
#### Snippet
```java
	}

	public Optional<List<Diagnostic>> validateSubModuleExistence(DiagnosticRequest diagnosticRequest) {
		DOMNode node = diagnosticRequest.getNode();
		String tagContent = null;
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/diagnostics/MavenDiagnosticParticipant.java`
#### Snippet
```java
	}

	private Map<String, Function<DiagnosticRequest, Optional<List<Diagnostic>>>> configureDiagnosticFunctions() {
		PluginValidator pluginValidator = new PluginValidator(plugin);

```

### OptionalContainsCollection
'Optional' contains collection `List`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/diagnostics/MavenDiagnosticParticipant.java`
#### Snippet
```java
		PluginValidator pluginValidator = new PluginValidator(plugin);

		Function<DiagnosticRequest, Optional<List<Diagnostic>>> validatePluginConfiguration = pluginValidator::validateConfiguration;
		Function<DiagnosticRequest, Optional<List<Diagnostic>>> validatePluginGoal = pluginValidator::validateGoal;

```

### OptionalContainsCollection
'Optional' contains collection `List`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/diagnostics/MavenDiagnosticParticipant.java`
#### Snippet
```java

		Function<DiagnosticRequest, Optional<List<Diagnostic>>> validatePluginConfiguration = pluginValidator::validateConfiguration;
		Function<DiagnosticRequest, Optional<List<Diagnostic>>> validatePluginGoal = pluginValidator::validateGoal;

		Map<String, Function<DiagnosticRequest, Optional<List<Diagnostic>>>> tagDiagnostics = new HashMap<>();
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/diagnostics/MavenDiagnosticParticipant.java`
#### Snippet
```java
		Function<DiagnosticRequest, Optional<List<Diagnostic>>> validatePluginGoal = pluginValidator::validateGoal;

		Map<String, Function<DiagnosticRequest, Optional<List<Diagnostic>>>> tagDiagnostics = new HashMap<>();
		tagDiagnostics.put(CONFIGURATION_ELT, validatePluginConfiguration);
		tagDiagnostics.put(GOAL_ELT, validatePluginGoal);
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/diagnostics/MavenDiagnosticParticipant.java`
#### Snippet
```java
		
		DOMElement documentElement = xmlDocument.getDocumentElement();
		Map<String, Function<DiagnosticRequest, Optional<List<Diagnostic>>>> tagDiagnostics = configureDiagnosticFunctions();

		// Validate project element
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/diagnostics/MavenDiagnosticParticipant.java`
#### Snippet
```java
		while (!nodes.isEmpty()) {
			DOMNode node = nodes.pop();
			for (Entry<String, Function<DiagnosticRequest, Optional<List<Diagnostic>>>> entry : tagDiagnostics
					.entrySet()) {
				if (node.getLocalName() != null && node.getLocalName().equals(entry.getKey())) {
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/diagnostics/VersionValidator.java`
#### Snippet
```java
	private static final Logger LOGGER = Logger.getLogger(VersionValidator.class.getName());

	public static Optional<List<Diagnostic>> validateVersion(DiagnosticRequest diagnosticRequest) {
		DOMNode node = diagnosticRequest.getNode();
		Dependency model = MavenParseUtils.parseArtifact(node);
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/diagnostics/ProjectValidator.java`
#### Snippet
```java
	 * @return
	 */
	private Optional<List<Diagnostic>> validateParentMatchingGroupIdVersion(DiagnosticRequest diagnosticRequest) {
		DOMNode node = diagnosticRequest.getNode();
		if (node == null) {
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/diagnostics/ProjectValidator.java`
#### Snippet
```java
	 * @return
	 */
	public Optional<List<Diagnostic>> validateProject(DiagnosticRequest diagnosticRequest) {
		DOMNode node = diagnosticRequest.getNode();
		if (node == null) {
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/diagnostics/ProjectValidator.java`
#### Snippet
```java
	 * @return
	 */
	private Optional<List<Diagnostic>> validateManagedDependencies(DiagnosticRequest diagnosticRequest,
			MavenProject mavenProject) {
		DOMNode node = diagnosticRequest.getNode();
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/diagnostics/ProjectValidator.java`
#### Snippet
```java
	 * @return
	 */
	private Optional<List<Diagnostic>> validateManagedPlugins(DiagnosticRequest diagnosticRequest,
			MavenProject mavenProject) {
		DOMNode node = diagnosticRequest.getNode();
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/diagnostics/PluginValidator.java`
#### Snippet
```java
	}

	public Optional<List<Diagnostic>> validateConfiguration(DiagnosticRequest diagnosticRequest) {
		DOMNode node = diagnosticRequest.getNode();
		if (node == null) {
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/diagnostics/PluginValidator.java`
#### Snippet
```java
			return Optional.empty();
		}
		Optional<List<Diagnostic>> pluginResolutionError = validatePluginResolution(diagnosticRequest);
		if (pluginResolutionError.isPresent()) {
			return pluginResolutionError;
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/diagnostics/PluginValidator.java`
#### Snippet
```java
	}

	public Optional<List<Diagnostic>> validateGoal(DiagnosticRequest diagnosticRequest) {
		DOMNode node = diagnosticRequest.getNode();
		if (node == null) {
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/diagnostics/PluginValidator.java`
#### Snippet
```java
			return Optional.empty();
		}
		Optional<List<Diagnostic>> pluginResolutionError = validatePluginResolution(diagnosticRequest);
		if (pluginResolutionError.isPresent()) {
			return pluginResolutionError;
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/diagnostics/PluginValidator.java`
#### Snippet
```java
	}

	public Optional<List<Diagnostic>> validatePluginResolution(DiagnosticRequest diagnosticRequest) {
		try {
			MavenPluginUtils.getContainingPluginDescriptor(diagnosticRequest.getNode(), plugin);
```

## RuleId[id=Convert2MethodRef]
### Convert2MethodRef
Lambda can be replaced with method reference
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/completion/MavenCompletionParticipant.java`
#### Snippet
```java
			files.addAll(Arrays.asList(prefixFile.listFiles()));
		}
		return files.stream().filter(file -> file.isDirectory())
				.filter( file -> !file.equals(docFolder))
				.sorted(Comparator.comparing(File::isDirectory) // only folders
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/completion/MavenCompletionParticipant.java`
#### Snippet
```java
		String prefix = request.getNode().getNodeValue() != null ? request.getNode().getNodeValue() : "";
		List<String> defaultValues = parameters.stream().filter(p -> (p.getDefaultValue() != null))
				.map(p -> p.getDefaultValue())
				.collect(Collectors.toList());

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/completion/MavenCompletionParticipant.java`
#### Snippet
```java
		
		parentFiles.stream().filter(file -> (file.isFile() && file.getName().endsWith(".properties")))
			.forEach(file -> result.add(file));
		parentFiles.stream().filter(file -> (file.isDirectory()))
			.forEach(file -> result.addAll(collectRelativePropertiesFiles(file)));
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/completion/MavenCompletionParticipant.java`
#### Snippet
```java
		parentFiles.stream().filter(file -> (file.isFile() && file.getName().endsWith(".properties")))
			.forEach(file -> result.add(file));
		parentFiles.stream().filter(file -> (file.isDirectory()))
			.forEach(file -> result.addAll(collectRelativePropertiesFiles(file)));
		return result;
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
		for (File file : toProcess) {
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

## RuleId[id=EnhancedSwitchMigration]
### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/utils/MavenParseUtils.java`
#### Snippet
```java
					}
					value = value.trim();
					switch (tag.getLocalName()) {
					case GROUP_ID_ELT:
						res.setGroupId(value);
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/utils/ParticipantUtils.java`
#### Snippet
```java
		}
		DOMElement element = (DOMElement) node;
		switch (node.getLocalName()) {
		case MODULE_ELT:
			return element;
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/completion/MavenCompletionParticipant.java`
#### Snippet
```java
		String artifactIdFilter = artifactId.orElse(null);
		
		switch (parent.getLocalName()) {
		case ARTIFACT_ID_ELT:
			plugin.getProjectCache().getProjects().stream() //
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/completion/MavenCompletionParticipant.java`
#### Snippet
```java
		GAVInsertionStrategy gavInsertionStrategy = computeGAVInsertionStrategy(request);
		List<ArtifactWithDescription> allArtifactInfos = Collections.synchronizedList(new ArrayList<>());
		switch (parent.getLocalName()) {
		case SCOPE_ELT:
			collectSimpleCompletionItems(Arrays.asList(DependencyScope.values()), DependencyScope::getName,
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/completion/MavenCompletionParticipant.java`
#### Snippet
```java
			item.setKind(CompletionItemKind.Value);
			textEdit.setRange(replaceRange);
			switch (request.getParentElement().getLocalName()) {
			case ARTIFACT_ID_ELT:
				item.setLabel(artifactInfo.artifact.getArtifactId()
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/completion/MavenCompletionParticipant.java`
#### Snippet
```java
				CompletableFuture.runAsync(() -> {
						cancelChecker.checkCanceled();
						switch (node.getLocalName()) {
						case GROUP_ID_ELT:
							// TODO: just pass only plugins boolean, and make getGroupId's accept a boolean
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

## RuleId[id=PublicFieldAccessedInSynchronizedContext]
### PublicFieldAccessedInSynchronizedContext
Non-private field `settings` accessed in synchronized context
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/MavenLemminxExtension.java`
#### Snippet
```java
		try {
			this.container = newPlexusContainer();
			mavenRequest = initMavenRequest(container, settings);
			DefaultRepositorySystemSessionFactory repositorySessionFactory = container.lookup(DefaultRepositorySystemSessionFactory.class);
			RepositorySystemSession repositorySystemSession = repositorySessionFactory.newRepositorySession(mavenRequest);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `settings` accessed in synchronized context
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/MavenLemminxExtension.java`
#### Snippet
```java
			cache = new MavenProjectCache(this);
			localRepositorySearcher = new LocalRepositorySearcher(mavenSession.getRepositorySession().getLocalRepository().getBasedir());
			if (!settings.getCentral().isSkip()) {
				centralSearcher = new RemoteCentralRepositorySearcher(this);
			}
```

## RuleId[id=UnnecessaryBoxing]
### UnnecessaryBoxing
Redundant boxing, `Integer.parseInt()` call can be used instead
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/codeaction/MavenManagedVersionRemovalCodeAction.java`
#### Snippet
```java
							Object lineObj = dataMap.get(ATTR_MANAGED_VERSION_LINE);
							if (lineObj instanceof String lineString) {
								line = Integer.valueOf(lineString);
							}
							Object columnObj = dataMap.get(ATTR_MANAGED_VERSION_COLUMN);
```

### UnnecessaryBoxing
Redundant boxing, `Integer.parseInt()` call can be used instead
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/codeaction/MavenManagedVersionRemovalCodeAction.java`
#### Snippet
```java
							Object columnObj = dataMap.get(ATTR_MANAGED_VERSION_COLUMN);
							if (columnObj instanceof String columnString) {
								column = Integer.valueOf(columnString);
							}
						} catch (NumberFormatException e) {
```

## RuleId[id=SynchronizeOnNonFinalField]
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
			url.append(SEARCH_URI).append("rows=200&")
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
			url.append(SEARCH_URI).append("rows=100&core=gav&")
				.append(SEARCH_PARAMS).append(URLEncoder.encode(query.toString(), "UTF-8"));
		} catch(UnsupportedEncodingException ex) {
			LOGGER.log(Level.SEVERE, "Maven Central Repo search failed for " + String.join(":", artifactToSearch.getGroupId(),
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/utils/MarkdownUtils.java`
#### Snippet
```java
			String xmlContent = description.substring(openPre + "<pre>".length() + 1, closePre - 1);
			description = description.substring(0, openPre);
			xmlContent = xmlContent.replaceAll("&lt;", "<");
			xmlContent = xmlContent.replaceAll("&gt;", ">");
			xmlContent = "```XML" + "" + NL + xmlContent + NL + "```";
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/utils/MarkdownUtils.java`
#### Snippet
```java
			description = description.substring(0, openPre);
			xmlContent = xmlContent.replaceAll("&lt;", "<");
			xmlContent = xmlContent.replaceAll("&gt;", ">");
			xmlContent = "```XML" + "" + NL + xmlContent + NL + "```";
			description = description + LINE_BREAK + xmlContent;
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.artifact` is unnecessary, and can be replaced with an import
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/DependencyScope.java`
#### Snippet
```java
	RUNTIME(org.apache.maven.artifact.Artifact.SCOPE_RUNTIME,
			"This scope indicates that the dependency is not required for compilation, but is for execution. It is in the runtime and test classpaths, but not the compile classpath."),
	TEST(org.apache.maven.artifact.Artifact.SCOPE_TEST,
			"This scope indicates that the dependency is not required for normal use of the application, and is only available for the test compilation and execution phases. This scope is not transitive."),
	SYSTEM(org.apache.maven.artifact.Artifact.SCOPE_SYSTEM,
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.artifact` is unnecessary, and can be replaced with an import
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/DependencyScope.java`
#### Snippet
```java
	COMPILE(org.apache.maven.artifact.Artifact.SCOPE_COMPILE,
			"This is the default scope, used if none is specified. Compile dependencies are available in all classpaths of a project. Furthermore, those dependencies are propagated to dependent projects."),
	PROVIDED(org.apache.maven.artifact.Artifact.SCOPE_PROVIDED,
			"This is much like compile, but indicates you expect the JDK or a container to provide the dependency at runtime. For example, when building a web application for the Java Enterprise Edition, you would set the dependency on the Servlet API and related Java EE APIs to scope provided because the web container provides those classes. This scope is only available on the compilation and test classpath, and is not transitive."),
	RUNTIME(org.apache.maven.artifact.Artifact.SCOPE_RUNTIME,
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.artifact` is unnecessary, and can be replaced with an import
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/DependencyScope.java`
#### Snippet
```java
public enum DependencyScope {

	COMPILE(org.apache.maven.artifact.Artifact.SCOPE_COMPILE,
			"This is the default scope, used if none is specified. Compile dependencies are available in all classpaths of a project. Furthermore, those dependencies are propagated to dependent projects."),
	PROVIDED(org.apache.maven.artifact.Artifact.SCOPE_PROVIDED,
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.artifact` is unnecessary, and can be replaced with an import
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/DependencyScope.java`
#### Snippet
```java
	PROVIDED(org.apache.maven.artifact.Artifact.SCOPE_PROVIDED,
			"This is much like compile, but indicates you expect the JDK or a container to provide the dependency at runtime. For example, when building a web application for the Java Enterprise Edition, you would set the dependency on the Servlet API and related Java EE APIs to scope provided because the web container provides those classes. This scope is only available on the compilation and test classpath, and is not transitive."),
	RUNTIME(org.apache.maven.artifact.Artifact.SCOPE_RUNTIME,
			"This scope indicates that the dependency is not required for compilation, but is for execution. It is in the runtime and test classpaths, but not the compile classpath."),
	TEST(org.apache.maven.artifact.Artifact.SCOPE_TEST,
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.artifact` is unnecessary, and can be replaced with an import
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/DependencyScope.java`
#### Snippet
```java
	SYSTEM(org.apache.maven.artifact.Artifact.SCOPE_SYSTEM,
			"This scope is similar to provided except that you have to provide the JAR which contains it explicitly. The artifact is always available and is not looked up in a repository."),
	IMPORT_SCOPE(org.apache.maven.artifact.Artifact.SCOPE_IMPORT,
			"This scope is only supported on a dependency of type pom in the <dependencyManagement> section. It indicates the dependency to be replaced with the effective list of dependencies in the specified POM's <dependencyManagement> section. Since they are replaced, dependencies with a scope of import do not actually participate in limiting the transitivity of a dependency.");

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.artifact` is unnecessary, and can be replaced with an import
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/DependencyScope.java`
#### Snippet
```java
	TEST(org.apache.maven.artifact.Artifact.SCOPE_TEST,
			"This scope indicates that the dependency is not required for normal use of the application, and is only available for the test compilation and execution phases. This scope is not transitive."),
	SYSTEM(org.apache.maven.artifact.Artifact.SCOPE_SYSTEM,
			"This scope is similar to provided except that you have to provide the JAR which contains it explicitly. The artifact is always available and is not looked up in a repository."),
	IMPORT_SCOPE(org.apache.maven.artifact.Artifact.SCOPE_IMPORT,
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `description`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/utils/MarkdownUtils.java`
#### Snippet
```java
			//Add markdown formatting to XML
			String xmlContent = description.substring(openPre + "<pre>".length() + 1, closePre - 1);
			description = description.substring(0, openPre);
			xmlContent = xmlContent.replaceAll("&lt;", "<");
			xmlContent = xmlContent.replaceAll("&gt;", ">");
```

### AssignmentToMethodParameter
Assignment to method parameter `description`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/utils/MarkdownUtils.java`
#### Snippet
```java
			xmlContent = xmlContent.replaceAll("&gt;", ">");
			xmlContent = "```XML" + "" + NL + xmlContent + NL + "```";
			description = description + LINE_BREAK + xmlContent;
		}
		return description;
```

### AssignmentToMethodParameter
Assignment to method parameter `dependency`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/utils/ParticipantUtils.java`
#### Snippet
```java
				if (project != null) {
					final Dependency originalDependency = dependency;
					dependency = project.getDependencies().stream()
							.filter(dep -> (originalDependency.getGroupId() == null
									|| originalDependency.getGroupId().equals(dep.getGroupId())
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/definition/MavenDefinitionParticipant.java`
#### Snippet
```java
	private static LocationLink toLocationNoRange(File target, DOMNode originNode) {
		if (target == null) {
			return null;
		}
		Range dumbRange = new Range(new Position(0, 0), new Position(0, 0));
```

### ReturnNull
Return of `null`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/definition/MavenDefinitionParticipant.java`
#### Snippet
```java
		Map.Entry<Range, String> mavenProperty = ParticipantUtils.getMavenPropertyInRequest(request);
		if (mavenProperty == null) {
			return null;
		}
		DOMDocument xmlDocument = request.getXMLDocument();
```

### ReturnNull
Return of `null`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/definition/MavenDefinitionParticipant.java`
#### Snippet
```java
		MavenProject project = plugin.getProjectCache().getLastSuccessfulMavenProject(xmlDocument);
		if (project == null) {
			return null;
		}
		MavenProject childProj = project;
```

### ReturnNull
Return of `null`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/definition/MavenDefinitionParticipant.java`
#### Snippet
```java

		if (propertyDeclaration == null) {
			return null;
		}

```

### ReturnNull
Return of `null`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/utils/MavenParseUtils.java`
#### Snippet
```java
	private static Dependency parseArtifactInternal(DOMElement element) {
		if (element == null) {
			return null;
		}
		Dependency res = new Dependency();
```

### ReturnNull
Return of `null`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/utils/MavenParseUtils.java`
#### Snippet
```java
			LOGGER.log(Level.SEVERE, "Error parsing Artifact", e);
		}
		return isEmpty(res) ? null : res;
	}

```

### ReturnNull
Return of `null`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/utils/MavenParseUtils.java`
#### Snippet
```java
	public static Dependency parseArtifact(DOMNode node) {
		if (node == null) {
			return null;
		}
		if (node.isElement()) {
```

### ReturnNull
Return of `null`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/utils/DOMUtils.java`
#### Snippet
```java
	public static DOMNode findAncestorThatIsAChildOf(IPositionRequest request, String parentName) {
		if (parentName == null || request == null) {
			return null;
		}
		
```

### ReturnNull
Return of `null`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/utils/DOMUtils.java`
#### Snippet
```java
		DOMNode parentNode = request.getNode().getParentNode();
		if (parentNode == null) {
			return null;
		}
		
```

### ReturnNull
Return of `null`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/utils/DOMUtils.java`
#### Snippet
```java
			parentNode = parentNode.getParentNode();
		}
		return null;
	}
}
```

### ReturnNull
Return of `null`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/utils/DOMUtils.java`
#### Snippet
```java
	public static DOMNode findClosestParentNode(final DOMNode node, final String localName) {
		if (localName == null || node == null) {
			return null;
		}

```

### ReturnNull
Return of `null`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/utils/DOMUtils.java`
#### Snippet
```java
		}
		
		return null;
	}
	
```

### ReturnNull
Return of `null`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/utils/ParticipantUtils.java`
#### Snippet
```java
		sb.append(value.substring(start));
		
		return sb.length() == 0 ? null : sb.toString();
	}
	
```

### ReturnNull
Return of `null`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/utils/ParticipantUtils.java`
#### Snippet
```java
		// Here we can search only if all artifact is well defined
		if (!isWellDefinedDependency(artifactToSearch)) {
			return null;
		}
		
```

### ReturnNull
Return of `null`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/utils/ParticipantUtils.java`
#### Snippet
```java
			LOGGER.log(Level.SEVERE, e.getMessage(), e);
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/utils/ParticipantUtils.java`
#### Snippet
```java
		String tagText = tag.getNodeValue();
		if (tagText == null) {
			return null;
		}

```

### ReturnNull
Return of `null`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/utils/ParticipantUtils.java`
#### Snippet
```java
			return Map.entry(propertyRange, propertyText);
		}
		return null;
	}
	
```

### ReturnNull
Return of `null`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/utils/ParticipantUtils.java`
#### Snippet
```java
			MavenLemminxExtension plugin) {
		if (dependency == null || element == null) {
			return null;
		}

```

### ReturnNull
Return of `null`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/utils/ParticipantUtils.java`
#### Snippet
```java
		} catch (IllegalArgumentException e) {
			LOGGER.log(Level.SEVERE, e.getMessage(), e);
			return null;
		}
	}
```

### ReturnNull
Return of `null`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/utils/ParticipantUtils.java`
#### Snippet
```java
	public static DOMElement findInterestingElement(DOMNode node) {
		if (node == null) {
			return null;
		}
		if (!node.isElement()) {
```

### ReturnNull
Return of `null`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/utils/ParticipantUtils.java`
#### Snippet
```java
			return element;
		}
		return null;
	}
	
```

### ReturnNull
Return of `null`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/diagnostics/ProjectValidator.java`
#### Snippet
```java
			return rawMap.get(key).toString();
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/utils/MavenPluginUtils.java`
#### Snippet
```java
				.getLastSuccessfulMavenProject(node.getOwnerDocument());
		if (project == null) {
			return null;
		}
		DOMNode pluginNode = DOMUtils.findClosestParentNode(node, PLUGIN_ELT);
```

### ReturnNull
Return of `null`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/utils/MavenPluginUtils.java`
#### Snippet
```java
		DOMNode pluginNode = DOMUtils.findClosestParentNode(node, PLUGIN_ELT);
		if (pluginNode == null) {
			return null;
		}
		Optional<String> groupId = DOMUtils.findChildElementText(pluginNode, GROUP_ID_ELT);
```

### ReturnNull
Return of `null`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/diagnostics/DiagnosticRequest.java`
#### Snippet
```java
	@Override
	public DOMAttr getCurrentAttribute() {
		return node instanceof DOMAttr attr ? attr : null;
	}

```

### ReturnNull
Return of `null`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/diagnostics/DiagnosticRequest.java`
#### Snippet
```java
	@Override
	public LineIndentInfo getLineIndentInfo() throws BadLocationException {
		return null;
	}

```

### ReturnNull
Return of `null`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/diagnostics/DiagnosticRequest.java`
#### Snippet
```java
	public <T> T getComponent(Class clazz) {
		// TODO: Not sure how to implement this..
		return null;
	}

```

### ReturnNull
Return of `null`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/diagnostics/DiagnosticRequest.java`
#### Snippet
```java
	@Override
	public String getCurrentAttributeName() {
		return null;
	}

```

### ReturnNull
Return of `null`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/diagnostics/DiagnosticRequest.java`
#### Snippet
```java
	@Override
	public Position getPosition() {
		return null;
	}

```

### ReturnNull
Return of `null`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/MavenProjectCache.java`
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
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/MojoParameter.java`
#### Snippet
```java

		if (param == null) {
			return null;
		}

```

### ReturnNull
Return of `null`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/MojoParameter.java`
#### Snippet
```java
			}
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/searcher/RemoteCentralRepositorySearcher.java`
#### Snippet
```java
			LOGGER.log(Level.SEVERE, "Maven Central Repo search failed for " + String.join(":", artifactToSearch.getGroupId(),
					artifactToSearch.getArtifactId(), artifactToSearch.getVersion()), ex.getMessage());
			return null;
		}
		return new Request.Builder().url(url.toString()).build();
```

### ReturnNull
Return of `null`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/searcher/RemoteCentralRepositorySearcher.java`
#### Snippet
```java
			LOGGER.log(Level.SEVERE, "Maven Central Repo search failed for " + String.join(":", artifactToSearch.getGroupId(),
					artifactToSearch.getArtifactId(), artifactToSearch.getVersion()), ex.getMessage());
			return null;
		}
		return new Request.Builder().url(url.toString()).build();
```

### ReturnNull
Return of `null`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/searcher/RemoteCentralRepositorySearcher.java`
#### Snippet
```java
			LOGGER.log(Level.SEVERE, "Maven Central Repo search failed for " + String.join(":", artifactToSearch.getGroupId(),
					artifactToSearch.getArtifactId(), artifactToSearch.getVersion()), ex.getMessage());
			return null;
		}
		return new Request.Builder().url(url.toString()).build();
```

### ReturnNull
Return of `null`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/searcher/RemoteCentralRepositorySearcher.java`
#### Snippet
```java
					artifactToSearch.getArtifactId(), artifactToSearch.getVersion()), ex);
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/MavenLemminxWorkspaceReader.java`
#### Snippet
```java
			}
		}
		return null;
	}
	
```

### ReturnNull
Return of `null`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/MavenLemminxWorkspaceReader.java`
#### Snippet
```java
			return projectArtifact.getFile();
		}
		return null;
	}
	
```

### ReturnNull
Return of `null`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/MavenLemminxExtension.java`
#### Snippet
```java
			return container.lookup(SettingsBuilder.class).build(request).getEffectiveSettings();
		} catch (SettingsBuildingException | ComponentLookupException ex) {
			return null;
		}
	}
```

### ReturnNull
Return of `null`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/utils/PlexusConfigHelper.java`
#### Snippet
```java
		}
		if (!Collection.class.isAssignableFrom(paramClass)) {
			return null;
		}

```

### ReturnNull
Return of `null`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/utils/PlexusConfigHelper.java`
#### Snippet
```java
			}
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/utils/PlexusConfigHelper.java`
#### Snippet
```java
			return (Class<?>) paramedType.getRawType();
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/hover/MavenHoverParticipant.java`
#### Snippet
```java
	public Hover onText(IHoverRequest request) throws Exception {
		if (!MavenLemminxExtension.match(request.getXMLDocument())) {
			return null;
		}

```

### ReturnNull
Return of `null`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/hover/MavenHoverParticipant.java`
#### Snippet
```java
		case GOAL_ELT -> collectGoal(request);
		// TODO consider incomplete GAV (eg plugins), by querying the "key" against project
		default -> null;
		};
	}
```

### ReturnNull
Return of `null`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/hover/MavenHoverParticipant.java`
#### Snippet
```java
	private String getManagedVersionText(IHoverRequest request) {
		if (!MavenLemminxExtension.match(request.getXMLDocument())) {
			return null;
		}

```

### ReturnNull
Return of `null`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/hover/MavenHoverParticipant.java`
#### Snippet
```java
		DOMElement element = ParticipantUtils.findInterestingElement(request.getNode());
		if (element == null || (!DEPENDENCY_ELT.equals(element.getLocalName()) && !PLUGIN_ELT.equals(element.getLocalName()))) {
			return null;
		}
		
```

### ReturnNull
Return of `null`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/hover/MavenHoverParticipant.java`
#### Snippet
```java
					request.getNode().getOwnerDocument().getResolverExtensionManager());
			if (parentXmlDocument == null) {
				return null; // An error occurred while loading the document
			}

```

### ReturnNull
Return of `null`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/hover/MavenHoverParticipant.java`
#### Snippet
```java
			parentPomFile = getParentPomFile(parentMavenProject);
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/hover/MavenHoverParticipant.java`
#### Snippet
```java
	private static String getActualVersionText(boolean supportsMarkdown, MavenProject project) {
		if (project == null) {
			return null;
		}

```

### ReturnNull
Return of `null`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/hover/MavenHoverParticipant.java`
#### Snippet
```java
				}).findAny().orElse(null);
		}
		return null;
	}
}
```

### ReturnNull
Return of `null`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/hover/MavenHoverParticipant.java`
#### Snippet
```java
	private static String getActualVersionText(boolean supportsMarkdown, Model model) {
		if (model == null) {
			return null;
		}

```

### ReturnNull
Return of `null`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/hover/MavenHoverParticipant.java`
#### Snippet
```java
			PluginDescriptor pluginDescriptor = MavenPluginUtils.getContainingPluginDescriptor(node, plugin);
			if (pluginDescriptor == null) { // probable incorrect pom file at this moment
				return null;
			}
			for (MojoDescriptor mojo : pluginDescriptor.getMojos()) {
```

### ReturnNull
Return of `null`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/hover/MavenHoverParticipant.java`
#### Snippet
```java
			LOGGER.log(Level.SEVERE, e.getMessage(), e);
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/hover/MavenHoverParticipant.java`
#### Snippet
```java
		} catch (PluginResolutionException | PluginDescriptorParsingException | InvalidPluginDescriptorException e) {
			LOGGER.log(Level.SEVERE, e.getMessage(), e);
			return null;
		}
		if (CONFIGURATION_ELT.equals(request.getParentElement().getLocalName())) {
```

### ReturnNull
Return of `null`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/hover/MavenHoverParticipant.java`
#### Snippet
```java
			}
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/hover/MavenHoverParticipant.java`
#### Snippet
```java
	public Hover onTag(IHoverRequest request) throws Exception {
		if (!MavenLemminxExtension.match(request.getXMLDocument())) {
			return null;
		}

```

### ReturnNull
Return of `null`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/hover/MavenHoverParticipant.java`
#### Snippet
```java

		if (tag.getLocalName() == null) {
			return null;
		}

```

### ReturnNull
Return of `null`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/hover/MavenHoverParticipant.java`
#### Snippet
```java

		// TODO: Get rid of this?
		return CONFIGURATION_ELT.equals(parent.getLocalName()) ? collectPluginConfiguration(request) : null;
	}

```

### ReturnNull
Return of `null`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/hover/MavenHoverParticipant.java`
#### Snippet
```java

		if (message.isBlank()) {
			return null;
		}
		return new Hover(new MarkupContent(supportsMarkdown ? MarkupKind.MARKDOWN : MarkupKind.PLAINTEXT,
```

### ReturnNull
Return of `null`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/hover/MavenHoverParticipant.java`
#### Snippet
```java
		
		// we don't have description or other valuable information for non-local artifacts.
		return null;
	}

```

### ReturnNull
Return of `null`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/completion/MavenCompletionParticipant.java`
#### Snippet
```java
			} catch (BadLocationException ex) {
				LOGGER.log(Level.SEVERE, ex.getCause().toString(), ex);
				return null;
			}
		}
```

### ReturnNull
Return of `null`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/completion/MavenCompletionParticipant.java`
#### Snippet
```java
	private GAVInsertionStrategy computeGAVInsertionStrategy(ICompletionRequest request) {
		if (request.getParentElement() == null) {
			return null;
		}
		return switch (request.getParentElement().getLocalName()) {
```

## RuleId[id=AssignmentToLambdaParameter]
### AssignmentToLambdaParameter
Assignment to lambda parameter `project`
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/MavenLemminxWorkspaceReader.java`
#### Snippet
```java
						}
						propagateProcessed(pom);
						project = project.getParent();
					}
				}, () -> { // try reading GAV at least
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

## RuleId[id=ClassCanBeRecord]
### ClassCanBeRecord
Class can be a record
in `lemminx-maven/src/main/java/org/eclipse/lemminx/extensions/maven/participants/completion/MavenCompletionParticipant.java`
#### Snippet
```java
		};

		public static final class NodeWithChildrenInsertionStrategy implements GAVInsertionStrategy {
			public final String elementName;

```

