# transformer 
 
# Bad smells
I found 259 bad smells with 37 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| ReturnNull | 98 | false |
| BoundedWildcard | 28 | false |
| UnnecessaryLocalVariable | 23 | true |
| AssignmentToMethodParameter | 15 | false |
| CallToStringConcatCanBeReplacedByOperator | 13 | false |
| NestedAssignment | 11 | false |
| DefaultAnnotationParam | 9 | false |
| StringEquality | 5 | false |
| CommentedOutCode | 5 | false |
| NonProtectedConstructorInAbstractClass | 5 | true |
| ConstantValue | 5 | false |
| IOResource | 4 | false |
| SystemOutErr | 4 | false |
| UnusedAssignment | 4 | false |
| UnnecessaryToStringCall | 3 | true |
| CodeBlock2Expr | 3 | true |
| UtilityClassWithoutPrivateConstructor | 2 | true |
| DataFlowIssue | 2 | false |
| RedundantMethodOverride | 2 | false |
| EmptyMethod | 2 | false |
| RedundantImplements | 2 | false |
| AssignmentToLambdaParameter | 2 | false |
| ZeroLengthArrayInitialization | 2 | false |
| NonSerializableFieldInSerializableClass | 1 | false |
| SizeReplaceableByIsEmpty | 1 | true |
| AssignmentToForLoopParameter | 1 | false |
| ManualMinMaxCalculation | 1 | false |
| MissortedModifiers | 1 | false |
| RedundantSuppression | 1 | false |
| ThrowFromFinallyBlock | 1 | false |
| DynamicRegexReplaceableByCompiledPattern | 1 | false |
| Java8MapApi | 1 | false |
| MethodOverridesStaticMethod | 1 | false |
## RuleId[ruleID=IOResource]
### IOResource
'PrintWriter' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/ManifestActionImpl.java`
#### Snippet
```java
	@SuppressWarnings("unused")
	protected void writeAsFeature(Manifest manifest, OutputStream outputStream) throws IOException {
		PrintWriter writer = new PrintWriter(outputStream);

		StringBuilder builder = new StringBuilder();
```

### IOResource
'ManifestResource' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `bnd-plugins/org.eclipse.transformer.bnd.analyzer/src/main/java/org/eclipse/transformer/bnd/analyzer/action/AnalyzerAction.java`
#### Snippet
```java
								continue; // no calculated manifest
							}
							resource = new ManifestResource(manifest);
						}
					}
```

### IOResource
'ManifestResource' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `maven-plugins/transformer-maven-plugin/src/main/java/org/eclipse/transformer/maven/action/TransformerJarAction.java`
#### Snippet
```java
								continue; // no calculated manifest
							}
							resource = new ManifestResource(manifest);
						}
					}
```

### IOResource
'BufferedReader' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/TransformProperties.java`
#### Snippet
```java

		try {
			BufferedReader bufferedReader = new BufferedReader(manifestReader);

			String line;
```

## RuleId[ruleID=StringEquality]
### StringEquality
String values are compared using `==`, not 'equals()'
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/ManifestActionImpl.java`
#### Snippet
```java
		}

		if (initialText == text) {
			return null;
		} else {
```

### StringEquality
String values are compared using `==`, not 'equals()'
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/ActionImpl.java`
#### Snippet
```java
		}

		if ( finalValue == initialValue ) {
			useLogger.trace("    String {} {}: {} (unchanged)", inputName, valueCase, initialValue);
			return null;
```

### StringEquality
String values are compared using `==`, not 'equals()'
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/SignatureRuleImpl.java`
#### Snippet
```java
		}

		if (initialText == text) {
			return null;
		} else {
```

### StringEquality
String values are compared using `==`, not 'equals()'
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/SignatureRuleImpl.java`
#### Snippet
```java
		}

		if (initialText == text) {
			return null;
		} else {
```

### StringEquality
String values are compared using `!=`, not 'equals()'
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/SignatureRuleImpl.java`
#### Snippet
```java
		}

		if (finalValue != initialValue) {
			return finalValue;
		} else {
```

## RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `JakartaTransform` has only 'static' members, and lacks a 'private' constructor
in `org.eclipse.transformer.jakarta/src/main/java/org/eclipse/transformer/jakarta/JakartaTransform.java`
#### Snippet
```java
import java.util.function.Function;

public class JakartaTransform {

	public static final String	DEFAULT_SELECTION_REFERENCE		= "jakarta-selection.properties";
```

### UtilityClassWithoutPrivateConstructor
Class `TransformProperties` has only 'static' members, and lacks a 'private' constructor
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/TransformProperties.java`
#### Snippet
```java
import org.eclipse.transformer.action.impl.BundleDataImpl;

public class TransformProperties {
	/** Character used to define a package rename. */
	public static final char	PACKAGE_RENAME_ASSIGNMENT	= '=';
```

## RuleId[ruleID=DataFlowIssue]
### DataFlowIssue
Dereference of `inputDirectory.listFiles()` may produce `NullPointerException`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/DirectoryActionImpl.java`
#### Snippet
```java
	 */
	protected void transformDirectory(String pathFromRoot, File inputDirectory, File rootOutputFile) {
		for (File child : inputDirectory.listFiles()) {

			String childPathFromRoot;
```

### DataFlowIssue
Argument `packageVersions` might be null
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/Transformer.java`
#### Snippet
```java
		}

		boolean missingFinalPackages = !validateVersionUpdates(packageVersions, orphanedFinalPackages);

		for ( Map.Entry<String, Map<String, String>> specificEntry : specificPackageVersions.entrySet() ) {
```

## RuleId[ruleID=CommentedOutCode]
### CommentedOutCode
Commented out code (2 lines)
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/ManifestActionImpl.java`
#### Snippet
```java
		}

		// getLogger().debug("replacePackageVersion: (packageText: {} )",
		// packageText);

```

### CommentedOutCode
Commented out code (4 lines)
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/ManifestActionImpl.java`
#### Snippet
```java
					versionEndIndex--; // just before the 2nd quotation mark

					// getLogger().debug("versionBeginIndex = [{}]",
					// versionBeginIndex);
					// getLogger().debug("versionEndIndex = [{}]",
```

### CommentedOutCode
Commented out code (4 lines)
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/ManifestActionImpl.java`
#### Snippet
```java
		}

		// String oldVersion = packageText.substring(versionBeginIndex,
		// versionEndIndex+1);
		// getLogger().debug("old version[{}] new version[{}]", oldVersion,
```

### CommentedOutCode
Commented out code (3 lines)
in `org.eclipse.transformer.cli/src/main/java/org/eclipse/transformer/cli/TransformerCLI.java`
#### Snippet
```java

		useSysOut.println(message);
		// if ( useSysErr != useSysOut ) {
		// useSysErr.println(message);
		// }
```

### CommentedOutCode
Commented out code (6 lines)
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/BundleDataImpl.java`
#### Snippet
```java
		this.description = description;

		// String nameText = ( addName ? ('+' + name) : name );
		// String descriptionText = ( addDescription ? ('+' + description) :
		// description );
```

## RuleId[ruleID=NonSerializableFieldInSerializableClass]
### NonSerializableFieldInSerializableClass
Non-serializable field 'settings' in a Serializable class
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/AppOption.java`
#### Snippet
```java
	}

	private final Settings settings;

	public String getShortTag() {
```

## RuleId[ruleID=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`sourceClassifier.length() == 0` can be replaced with 'sourceClassifier.isEmpty()'
in `maven-plugins/transformer-maven-plugin/src/main/java/org/eclipse/transformer/maven/TransformerRunMojo.java`
#### Snippet
```java
	public void transform(final Artifact sourceArtifact) throws MojoFailureException, MojoExecutionException {
		final String sourceClassifier = sourceArtifact.getClassifier();
		final String targetClassifier = (sourceClassifier == null || sourceClassifier.length() == 0) ? this.classifier
			: sourceClassifier + "-" + this.classifier;

```

## RuleId[ruleID=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/Transformer.java`
#### Snippet
```java
			inputPath = inputFile.getAbsolutePath();
		} catch (IOException e) {
			getLogger().error(consoleMarker, "Input error [ {} ] [ {} ] ", inputName, e.toString(), e);
			return false;
		}
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/Transformer.java`
#### Snippet
```java
			useOutputPath = useOutputFile.getAbsolutePath();
		} catch (IOException e) {
			getLogger().error(consoleMarker, "Output error [ {} ] [ {} ]", outputName, e.toString(), e);
			return false;
		}
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/TransformProperties.java`
#### Snippet
```java

					if ( nameBuilder.length() != 0 ) {
						throw new IllegalArgumentException("Package version syntax error: Version missing for package [ " + newPackageName + " ] and attribute [ " + nameBuilder.toString() + " ]");
					}
				}
```

## RuleId[ruleID=AssignmentToForLoopParameter]
### AssignmentToForLoopParameter
Assignment to for-loop parameter `constantNo`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/ClassActionImpl.java`
#### Snippet
```java
					// Double(6) entries take two slots in the constant pool.
					// See 4.4.5
					constantNo++;
					break;

```

## RuleId[ruleID=ManualMinMaxCalculation]
### ManualMinMaxCalculation
Can be replaced with 'Math.min()' call
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/util/FileUtils.java`
#### Snippet
```java
				}
				int maxAdjustment = MAX_ARRAY_LENGTH - read;
				int adjustment = ( BUFFER_ADJUSTMENT > maxAdjustment ) ? maxAdjustment : BUFFER_ADJUSTMENT;

				// 'allocate' sets the position to zero, but also sets the limit to
```

## RuleId[ruleID=BoundedWildcard]
### BoundedWildcard
Can generalize to `? super String`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/ActionImpl.java`
#### Snippet
```java
	}

	protected String directGlobalUpdate(String inputName, String initialValue, List<String> cases) {
		String finalValue = getSignatureRule().replaceTextDirectGlobal(initialValue, inputName);
		if (finalValue != null) {
```

### BoundedWildcard
Can generalize to `? super String`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/ActionImpl.java`
#### Snippet
```java
	}

	protected String textUpdate(String inputName, String initialValue, List<String> cases) {
		String finalValue = getSignatureRule().replaceText(inputName, initialValue);
		if (finalValue != null) {
```

### BoundedWildcard
Can generalize to `? super String`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/ActionImpl.java`
#### Snippet
```java
	//

	protected String packagesUpdate(String inputName, String initialValue, List<String> cases) {
		String finalValue = getSignatureRule().replacePackages(initialValue);
		if (finalValue != null) {
```

### BoundedWildcard
Can generalize to `? super String`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/ActionImpl.java`
#### Snippet
```java
	}

	protected String binaryTypeUpdate(String inputName, String initialValue, List<String> cases) {
		String finalValue = getSignatureRule().transformBinaryType(initialValue);
		if (finalValue != null) {
```

### BoundedWildcard
Can generalize to `? super String`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/ActionImpl.java`
#### Snippet
```java
	}

	protected String descriptorUpdate(String inputName, String initialValue, List<String> cases) {
		String finalValue = getSignatureRule().transformDescriptor(initialValue);
		if (finalValue != null) {
```

### BoundedWildcard
Can generalize to `? super String`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/ActionImpl.java`
#### Snippet
```java
	}

	protected String directPerClassUpdate(String inputName, String initialValue, List<String> cases) {
		String finalValue = getSignatureRule().replaceTextDirectPerClass(initialValue, inputName);
		if (finalValue != null) {
```

### BoundedWildcard
Can generalize to `? super String`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/ActionImpl.java`
#### Snippet
```java
	 * @return The modified value. Null if no updates were made.
	 */
	protected String directPerClassUpdate_java(String inputName, String initialValue, List<String> cases) {
		String lookupName = switchExtensionTo(inputName, ".java", ".class");
		if (lookupName == null) {
```

### BoundedWildcard
Can generalize to `? extends StringReplacement`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/ActionImpl.java`
#### Snippet
```java
	protected String updateString(
		String inputName, String valueCase, String initialValue,
		List<StringReplacement> replacements) {

		Logger useLogger = getLogger();
```

### BoundedWildcard
Can generalize to `? super String`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/ActionImpl.java`
#### Snippet
```java
	}

	protected String binaryPackagesUpdate(String inputName, String initialValue, List<String> cases) {
		String finalValue = getSignatureRule().replaceBinaryPackages(initialValue);
		if (finalValue != null) {
```

### BoundedWildcard
Can generalize to `? extends PluginExecution`
in `maven-plugins/transformer-maven-plugin/src/main/java/org/eclipse/transformer/maven/TransformerMavenLifecycleParticipant.java`
#### Snippet
```java
	}

	protected void processExecutions(List<PluginExecution> transformerExecutions, Plugin mavenPackagingPlugin,
		MavenProject project) {
		transformerExecutions.stream()
```

### BoundedWildcard
Can generalize to `? super String`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/ContainerChangesImpl.java`
#### Snippet
```java
	}

	private void addChangeMap(Map<String, int[]> thisChangeMap, Map<String, int[]> otherChangeMap) {
		int[] nextChanges = new int[1];
		for (Map.Entry<String, int[]> mapEntry : otherChangeMap.entrySet()) {
```

### BoundedWildcard
Can generalize to `? super String`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/ContainerChangesImpl.java`
#### Snippet
```java
	//

	private void increment(Map<String, int[]> counter, String name) {
		int[] count = counter.get(name);
		if (count == null) {
```

### BoundedWildcard
Can generalize to `? super String`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/ZipActionImpl.java`
#### Snippet
```java
	protected boolean isDuplicate(
		String inputName, String inputPath, String outputName, String outputPath,
		Set<String> seen) {

		if (seen.add(outputName)) {
```

### BoundedWildcard
Can generalize to `? extends MEMBERINFO`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/ClassActionImpl.java`
#### Snippet
```java

	private <MEMBERINFO extends MemberInfo> MEMBERINFO transform(MEMBERINFO member,
		MemberInfo.Constructor<MEMBERINFO> constructor, SignatureType signatureType, String inputName) {

		String inputDescriptor = member.descriptor;
```

### BoundedWildcard
Can generalize to `? extends ANNOTATIONSATTRIBUTE`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/ClassActionImpl.java`
#### Snippet
```java

	private <ANNOTATIONSATTRIBUTE extends AnnotationsAttribute> ANNOTATIONSATTRIBUTE transform(
		ANNOTATIONSATTRIBUTE inputAttribute, AnnotationsAttribute.Constructor<ANNOTATIONSATTRIBUTE> constructor, String inputName) {

		AnnotationInfo[] outputAnnotations = transform(inputAttribute.annotations, inputName);
```

### BoundedWildcard
Can generalize to `? extends PARAMETERANNOTATIONSATTRIBUTE`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/ClassActionImpl.java`
#### Snippet
```java
	private <PARAMETERANNOTATIONSATTRIBUTE extends ParameterAnnotationsAttribute> PARAMETERANNOTATIONSATTRIBUTE transform(
		PARAMETERANNOTATIONSATTRIBUTE attribute,
		ParameterAnnotationsAttribute.Constructor<PARAMETERANNOTATIONSATTRIBUTE> constructor, String inputName) {

		ParameterAnnotationInfo[] outputParmAnnotations = transform(attribute.parameter_annotations, inputName);
```

### BoundedWildcard
Can generalize to `? extends ANNOTATIONINFO`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/ClassActionImpl.java`
#### Snippet
```java

	private <ANNOTATIONINFO extends AnnotationInfo> ANNOTATIONINFO transform(ANNOTATIONINFO inputAnnotation,
		AnnotationInfo.Constructor<ANNOTATIONINFO> constructor, String inputName) {

		String inputType = inputAnnotation.type;
```

### BoundedWildcard
Can generalize to `? extends TYPEANNOTATIONSATTRIBUTE`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/ClassActionImpl.java`
#### Snippet
```java
	private <TYPEANNOTATIONSATTRIBUTE extends TypeAnnotationsAttribute> TYPEANNOTATIONSATTRIBUTE transform(
		TYPEANNOTATIONSATTRIBUTE inputAttribute,
		TypeAnnotationsAttribute.Constructor<TYPEANNOTATIONSATTRIBUTE> constructor, String inputName) {

		TypeAnnotationInfo[] outputAnnotations = transform(inputAttribute.type_annotations, inputName);
```

### BoundedWildcard
Can generalize to `? super String`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/Transformer.java`
#### Snippet
```java
	}

	protected void merge(String sinkName, Map<String, String> sink, String sourceName, Properties source,
		Set<String> orphanedValues) {

```

### BoundedWildcard
Can generalize to `? super String`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/Transformer.java`
#### Snippet
```java
	 */
	protected void processOrphan(String sourceName, String sinkName, String key, String oldValue, String newValue,
		Set<String> orphans) {

		if ((oldValue != null) && oldValue.equals(newValue)) {
```

### BoundedWildcard
Can generalize to `? super String`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/TransformProperties.java`
#### Snippet
```java
	}

	public static void addSelection(Map<String, String> included, Map<String, String> excluded, String selection, String charset) {
		selection = selection.trim();
		charset = charset.trim();
```

### BoundedWildcard
Can generalize to `? super String`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/TransformProperties.java`
#### Snippet
```java
	}

	public static void addSelection(Map<String, String> included, Map<String, String> excluded, String selection, String charset) {
		selection = selection.trim();
		charset = charset.trim();
```

### BoundedWildcard
Can generalize to `? super String`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/TransformProperties.java`
#### Snippet
```java
	}

	public static void addSelection(Map<String, String> included, Map<String, String> excluded, String selection, String charset) {
		selection = selection.trim();
		charset = charset.trim();
```

### BoundedWildcard
Can generalize to `? super String`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/TransformProperties.java`
#### Snippet
```java
	}

	public static void addSelection(Map<String, String> included, Map<String, String> excluded, String selection, String charset) {
		selection = selection.trim();
		charset = charset.trim();
```

### BoundedWildcard
Can generalize to `? super String`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/TransformProperties.java`
#### Snippet
```java
	public static String setVersion(
		String newPackageName, String newVersion,
		Map<String, String> packageVersions) {

		return packageVersions.put(newPackageName, newVersion);
```

### BoundedWildcard
Can generalize to `? super String`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/TransformProperties.java`
#### Snippet
```java
		String newPackageName, String newVersion,
		StringBuilder nameBuilder, StringBuilder versionBuilder,
		Map<String, String> packageVersions,
		Map<String, Map<String, String>> specificPackageVersions) {

```

### BoundedWildcard
Can generalize to `? super String`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/TransformProperties.java`
#### Snippet
```java
		String newPackageName, String newVersion,
		StringBuilder nameBuilder, StringBuilder versionBuilder,
		Map<String, String> packageVersions,
		Map<String, Map<String, String>> specificPackageVersions) {

```

### BoundedWildcard
Can generalize to `? super String`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/TransformProperties.java`
#### Snippet
```java
		StringBuilder nameBuilder, StringBuilder versionBuilder,
		Map<String, String> packageVersions,
		Map<String, Map<String, String>> specificPackageVersions) {

		String versionText;
```

## RuleId[ruleID=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `final static`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/util/FileUtils.java`
#### Snippet
```java
	//

	private final static Pattern PATH_SPLITTER = Pattern.compile("[/\\\\]");

	/**
```

## RuleId[ruleID=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/TransformProperties.java`
#### Snippet
```java
	 */
	@SuppressWarnings("resource")
	public static boolean isFeatureManifest(String manifestPath, File manifestFile) throws TransformException {
		FileReader manifestReader;
		try {
```

## RuleId[ruleID=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `org.eclipse.transformer.cli/src/main/java/org/eclipse/transformer/cli/JakartaTransformerCLI.java`
#### Snippet
```java
public class JakartaTransformerCLI extends TransformerCLI {
	public static void main(String[] args) throws Exception {
		JakartaTransformerCLI cli = new JakartaTransformerCLI(System.out, System.err, args);
		ResultCode rc = runWith(cli);
		System.exit(rc.ordinal());
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `org.eclipse.transformer.cli/src/main/java/org/eclipse/transformer/cli/JakartaTransformerCLI.java`
#### Snippet
```java
public class JakartaTransformerCLI extends TransformerCLI {
	public static void main(String[] args) throws Exception {
		JakartaTransformerCLI cli = new JakartaTransformerCLI(System.out, System.err, args);
		ResultCode rc = runWith(cli);
		System.exit(rc.ordinal());
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `org.eclipse.transformer.cli/src/main/java/org/eclipse/transformer/cli/TransformerCLI.java`
#### Snippet
```java

	public static void main(String[] args) throws Exception {
		TransformerCLI cli = new TransformerCLI(System.out, System.out, args);
		ResultCode rc = runWith(cli);
		System.exit(rc.ordinal());
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `org.eclipse.transformer.cli/src/main/java/org/eclipse/transformer/cli/TransformerCLI.java`
#### Snippet
```java

	public static void main(String[] args) throws Exception {
		TransformerCLI cli = new TransformerCLI(System.out, System.out, args);
		ResultCode rc = runWith(cli);
		System.exit(rc.ordinal());
```

## RuleId[ruleID=DefaultAnnotationParam]
### DefaultAnnotationParam
Redundant default parameter value assignment
in `maven-plugins/transformer-maven-plugin/src/main/java/org/eclipse/transformer/maven/TransformerDirectoryMojo.java`
#### Snippet
```java
 * This goal has the default phase of "process-classes".
 */
@Mojo(name = "transform", defaultPhase = LifecyclePhase.PROCESS_CLASSES, requiresProject = true, requiresDependencyResolution = ResolutionScope.COMPILE, threadSafe = true)
public class TransformerDirectoryMojo extends AbstractTransformerMojo {
	/**
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `maven-plugins/transformer-maven-plugin/src/main/java/org/eclipse/transformer/maven/TransformerRunMojo.java`
#### Snippet
```java
	private String rulesPerClassConstantUri;

	@Parameter(property = "transformer-plugin.xml", defaultValue = "")
	private String				rulesXmlsUri;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `maven-plugins/transformer-maven-plugin/src/main/java/org/eclipse/transformer/maven/TransformerRunMojo.java`
#### Snippet
```java
	private String				rulesBundlesUri;

	@Parameter(property = "transformer-plugin.direct", defaultValue = "")
	private String				rulesDirectUri;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `maven-plugins/transformer-maven-plugin/src/main/java/org/eclipse/transformer/maven/TransformerRunMojo.java`
#### Snippet
```java
 * This goal has the default phase of "package".
 */
@Mojo(name = "run", defaultPhase = LifecyclePhase.PACKAGE, requiresDependencyResolution = ResolutionScope.RUNTIME_PLUS_SYSTEM, requiresProject = true, threadSafe = true)
public class TransformerRunMojo extends AbstractMojo {
	static final Logger			logger	= LoggerFactory.getLogger(TransformerRunMojo.class);
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `maven-plugins/transformer-maven-plugin/src/main/java/org/eclipse/transformer/maven/TransformerRunMojo.java`
#### Snippet
```java
	private String				rulesRenamesUri;

	@Parameter(property = "transformer-plugin.versions", defaultValue = "")
	private String				rulesVersionUri;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `maven-plugins/transformer-maven-plugin/src/main/java/org/eclipse/transformer/maven/TransformerRunMojo.java`
#### Snippet
```java
	private String				rulesDirectUri;

	@Parameter(property = "transformer-plugin.per-class-constant", defaultValue = "")
	private String rulesPerClassConstantUri;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `maven-plugins/transformer-maven-plugin/src/main/java/org/eclipse/transformer/maven/TransformerRunMojo.java`
#### Snippet
```java
	private String				rulesVersionUri;

	@Parameter(property = "transformer-plugin.bundles", defaultValue = "")
	private String				rulesBundlesUri;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `maven-plugins/transformer-maven-plugin/src/main/java/org/eclipse/transformer/maven/TransformerRunMojo.java`
#### Snippet
```java
	private boolean				attach;

	@Parameter(property = "transformer-plugin.renames", defaultValue = "")
	private String				rulesRenamesUri;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `maven-plugins/transformer-maven-plugin/src/main/java/org/eclipse/transformer/maven/TransformerJarMojo.java`
#### Snippet
```java
 * This goal has the default phase of "package".
 */
@Mojo(name = "jar", defaultPhase = LifecyclePhase.PACKAGE, requiresProject = true, requiresDependencyResolution = ResolutionScope.COMPILE, threadSafe = true)
public class TransformerJarMojo extends AbstractTransformerMojo {
	@Parameter(defaultValue = "${session}", required = true, readonly = true)
```

## RuleId[ruleID=RedundantMethodOverride]
### RedundantMethodOverride
Method `ordering()` only delegates to its super method
in `bnd-plugins/org.eclipse.transformer.bnd.analyzer/src/main/java/org/eclipse/transformer/bnd/analyzer/TransformerVerifierPlugin.java`
#### Snippet
```java

	@Override
	public int ordering() {
		return super.ordering();
	}
```

### RedundantMethodOverride
Method `ordering()` only delegates to its super method
in `bnd-plugins/org.eclipse.transformer.bnd.analyzer/src/main/java/org/eclipse/transformer/bnd/analyzer/TransformerAnalyzerPlugin.java`
#### Snippet
```java

	@Override
	public int ordering() {
		return super.ordering();
	}
```

## RuleId[ruleID=ThrowFromFinallyBlock]
### ThrowFromFinallyBlock
`throw` inside 'finally' block
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/TransformProperties.java`
#### Snippet
```java
				manifestReader.close();
			} catch (IOException e) {
				throw new TransformException("Failed to close  [ " + manifestPath + " ]", e);
			}
		}
```

## RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/TransformProperties.java`
#### Snippet
```java

		if ( (newVersion.indexOf('=') == -1) && (newVersion.indexOf(';') == -1) ) {
			newVersion = newVersion.replace("\\", "");
			setVersion(newPackageName, newVersion, packageVersions);
			return;
```

## RuleId[ruleID=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/TextActionImpl.java`
#### Snippet
```java

	protected void transform(String inputName, LineSeparatorBufferedReader reader, BufferedWriter writer) throws IOException {
		for (String inputLine; (inputLine = reader.readLine()) != null; writer.write(reader.lineSeparator())) {
			String outputLine = transformString(inputName, "text line", inputLine);
			if (outputLine != null) {
```

### NestedAssignment
Result of assignment expression used
in `maven-plugins/transformer-maven-plugin/src/main/java/org/eclipse/transformer/maven/TransformerRunMojo.java`
#### Snippet
```java

	private String emptyAsNull(String input) {
		return (Objects.nonNull(input) && !(input = input.trim()).isEmpty()) ? input : null;
	}

```

### NestedAssignment
Result of assignment expression used
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/util/SignatureUtils.java`
#### Snippet
```java
	public static int segments(String key, char separator) {
		int segments = 1;
		for (int index = 0; (index = key.indexOf(separator, index + 1)) >= 0;) {
			segments++;
		}
```

### NestedAssignment
Result of assignment expression used
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/util/FileUtils.java`
#### Snippet
```java
		long totalBytesRead = 0L;

		for (int bytesRead = 0; (bytesRead = inputStream.read(buffer, 0, buffer.length)) != -1;) {
			totalBytesRead += bytesRead;
			outputStream.write(buffer, 0, bytesRead);
```

### NestedAssignment
Result of assignment expression used
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/util/FileUtils.java`
#### Snippet
```java
			byte[] buf = outputBuffer.array();
			int bytesRead;
			while ( (unread > 0) && ((bytesRead = inputStream.read(buf, read, unread)) != -1) ) {
				read += bytesRead;
				unread -= bytesRead;
```

### NestedAssignment
Result of assignment expression used
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/util/FileUtils.java`
#### Snippet
```java

			int bytesRead;
			while ( (bytesRead = inputStream.read(buf, read, unused)) != -1 ) {
				read += bytesRead;
				unused -= bytesRead;
```

### NestedAssignment
Result of assignment expression used
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/util/FileUtils.java`
#### Snippet
```java
				// 'allocate' sets the position to zero, but also sets the limit to
				// the capacity.  We will correct that before returning the buffer.
				outputBuffer = ByteBuffer.allocate(outputCapacity += adjustment);
				unused = adjustment; // 'unused' must initially be zero.

```

### NestedAssignment
Result of assignment expression used
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/ServiceLoaderConfigActionImpl.java`
#### Snippet
```java

	protected void transform(LineSeparatorBufferedReader reader, BufferedWriter writer) throws IOException {
		for (String inputLine; (inputLine = reader.readLine()) != null; writer.write(reader.lineSeparator())) {
			// Goal is to find the input package name. Find it by
			// successively taking text off of the input line.
```

### NestedAssignment
Result of assignment expression used
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/ZipActionImpl.java`
#### Snippet
```java
		try {
			for ( ZipEntry inputEntry;
				  (inputEntry = zipInputStream.getNextEntry()) != null;
				  prevName = inputName, inputName = null ) {

```

### NestedAssignment
Result of assignment expression used
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/TransformProperties.java`
#### Snippet
```java

			String line;
			while ((line = bufferedReader.readLine()) != null) {
				if (line.length() > 72) {
					return true;
```

### NestedAssignment
Result of assignment expression used
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/TransformProperties.java`
#### Snippet
```java
			Map<String, String> versionsForProperty = specificPackageVersions.get(propertyName);
			if ( versionsForProperty == null ) {
				specificPackageVersions.put( propertyName, (versionsForProperty = new HashMap<>()) );
			}
			versionsForProperty.put(newPackageName, versionText);
```

## RuleId[ruleID=CodeBlock2Expr]
### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/ZipActionImpl.java`
#### Snippet
```java

		ZipEntry outputEntry = createEntry(inputEntry, outputName, outputData);
		putEntry(zipOutputStream, outputEntry, () -> {
			outputData.writeTo(zipOutputStream);
		});
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/ZipActionImpl.java`
#### Snippet
```java

		ZipEntry outputEntry = copyEntry(inputEntry, outputName);
		putEntry(zipOutputStream, outputEntry, () -> {
			outputData.writeTo(zipOutputStream);
		});
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/ZipActionImpl.java`
#### Snippet
```java
									ByteData outputData = zipAction.apply(inputData);
									ZipEntry outputEntry = createEntry(inputEntry, outputName, outputData);
									putEntry(zipOutputStream, outputEntry, () -> {
										outputData.writeTo(zipOutputStream);
									});
```

## RuleId[ruleID=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `ContainerActionImpl()` of an abstract class should not be declared 'public'
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/ContainerActionImpl.java`
#### Snippet
```java
public abstract class ContainerActionImpl extends ActionImpl implements ContainerAction {

	public ContainerActionImpl(ActionContext context, ActionSelector actionSelector) {
		super(context);
		this.actionSelector = actionSelector;
```

### NonProtectedConstructorInAbstractClass
Constructor `ContainerActionImpl()` of an abstract class should not be declared 'public'
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/ContainerActionImpl.java`
#### Snippet
```java
	}

	public ContainerActionImpl(ActionContext context) {
		this(context, new ActionSelectorImpl());
	}
```

### NonProtectedConstructorInAbstractClass
Constructor `ElementActionImpl()` of an abstract class should not be declared 'public'
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/ElementActionImpl.java`
#### Snippet
```java
public abstract class ElementActionImpl extends ActionImpl implements ElementAction {

	public ElementActionImpl(ActionContext context) {
		super(context);
	}
```

### NonProtectedConstructorInAbstractClass
Constructor `ChangesImpl()` of an abstract class should not be declared 'public'
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/ChangesImpl.java`
#### Snippet
```java
public abstract class ChangesImpl implements Changes {

	public ChangesImpl() {
		// Empty
	}
```

### NonProtectedConstructorInAbstractClass
Constructor `ActionImpl()` of an abstract class should not be declared 'public'
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/ActionImpl.java`
#### Snippet
```java
 */
public abstract class ActionImpl implements Action {
	public ActionImpl(ActionContext context) {
		this.context = requireNonNull(context);

```

## RuleId[ruleID=Java8MapApi]
### Java8MapApi
Can be replaced with single 'Map.computeIfAbsent' method call
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/TransformProperties.java`
#### Snippet
```java
		} else {
			Map<String, String> versionsForProperty = specificPackageVersions.get(propertyName);
			if ( versionsForProperty == null ) {
				specificPackageVersions.put( propertyName, (versionsForProperty = new HashMap<>()) );
			}
```

## RuleId[ruleID=EmptyMethod]
### EmptyMethod
Method only calls its super
in `bnd-plugins/org.eclipse.transformer.bnd.analyzer/src/main/java/org/eclipse/transformer/bnd/analyzer/TransformerAnalyzerPlugin.java`
#### Snippet
```java

	@Override
	public int ordering() {
		return super.ordering();
	}
```

### EmptyMethod
Method only calls its super
in `bnd-plugins/org.eclipse.transformer.bnd.analyzer/src/main/java/org/eclipse/transformer/bnd/analyzer/TransformerVerifierPlugin.java`
#### Snippet
```java

	@Override
	public int ordering() {
		return super.ordering();
	}
```

## RuleId[ruleID=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `text`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/ManifestActionImpl.java`
#### Snippet
```java
				}

				text = head + value + tail;

				matchEnd = matchStart + value.length();
```

### AssignmentToMethodParameter
Assignment to method parameter `input`
in `maven-plugins/transformer-maven-plugin/src/main/java/org/eclipse/transformer/maven/TransformerRunMojo.java`
#### Snippet
```java

	private String emptyAsNull(String input) {
		return (Objects.nonNull(input) && !(input = input.trim()).isEmpty()) ? input : null;
	}

```

### AssignmentToMethodParameter
Assignment to method parameter `matchEnd`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/util/SignatureUtils.java`
#### Snippet
```java
					 */
					int backoff = 1;
					while (textLength > ++matchEnd) {
						charAfterMatch = text.charAt(matchEnd);
						if ((charAfterMatch == '.') || (charAfterMatch == '/')) {
```

### AssignmentToMethodParameter
Assignment to method parameter `matchEnd`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/util/SignatureUtils.java`
#### Snippet
```java
						}
					}
					matchEnd -= backoff;
				} else {
					/*
```

### AssignmentToMethodParameter
Assignment to method parameter `outputBuffer`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/util/FileUtils.java`
#### Snippet
```java
				// 'allocate' sets the position to zero, but also sets the limit to
				// the capacity.  We will correct that before returning the buffer.
				outputBuffer = ByteBuffer.allocate(requested);
				outputCapacity = requested;
			}
```

### AssignmentToMethodParameter
Assignment to method parameter `outputBuffer`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/util/FileUtils.java`
#### Snippet
```java
				// 'allocate' sets the position to zero, but also sets the limit to
				// the capacity.  We will correct that before returning the buffer.
				outputBuffer = ByteBuffer.allocate(outputCapacity += adjustment);
				unused = adjustment; // 'unused' must initially be zero.

```

### AssignmentToMethodParameter
Assignment to method parameter `type`
in `maven-plugins/transformer-maven-plugin/src/main/java/org/eclipse/transformer/maven/TransformerJarMojo.java`
#### Snippet
```java
		ArtifactHandler artifactHandler = getArtifactHandlerManager().getArtifactHandler(type);
		if (artifactHandler != null) {
			type = artifactHandler.getExtension();
		}
		return type;
```

### AssignmentToMethodParameter
Assignment to method parameter `text`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/SignatureRuleImpl.java`
#### Snippet
```java
				String head = text.substring(0, matchStart);
				String tail = text.substring(packageEnd);
				text = head + value + tail;

				matchEnd = matchStart + value.length();
```

### AssignmentToMethodParameter
Assignment to method parameter `text`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/SignatureRuleImpl.java`
#### Snippet
```java
				String head = text.substring(0, matchStart);
				String tail = text.substring(matchStart + keyLen);
				text = head + value + tail;

				lastMatchEnd = matchStart + valueLen;
```

### AssignmentToMethodParameter
Assignment to method parameter `substitutionsRef`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/Transformer.java`
#### Snippet
```java
		}

		substitutionsRef = options.normalize(substitutionsRef);

		Map<String, String> substitutionsMap =
```

### AssignmentToMethodParameter
Assignment to method parameter `initialPackageName`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/Transformer.java`
#### Snippet
```java
		if ( invert ) {
			String initialHold = initialPackageName;
			initialPackageName = finalPackageName;
			finalPackageName = initialHold;
		}
```

### AssignmentToMethodParameter
Assignment to method parameter `finalPackageName`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/Transformer.java`
#### Snippet
```java
			String initialHold = initialPackageName;
			initialPackageName = finalPackageName;
			finalPackageName = initialHold;
		}

```

### AssignmentToMethodParameter
Assignment to method parameter `newVersion`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/TransformProperties.java`
#### Snippet
```java

		if ( (newVersion.indexOf('=') == -1) && (newVersion.indexOf(';') == -1) ) {
			newVersion = newVersion.replace("\\", "");
			setVersion(newPackageName, newVersion, packageVersions);
			return;
```

### AssignmentToMethodParameter
Assignment to method parameter `selection`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/TransformProperties.java`
#### Snippet
```java

	public static void addSelection(Map<String, String> included, Map<String, String> excluded, String selection, String charset) {
		selection = selection.trim();
		charset = charset.trim();
		if (charset.startsWith(RESOURCE_EXCLUSION)) {
```

### AssignmentToMethodParameter
Assignment to method parameter `charset`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/TransformProperties.java`
#### Snippet
```java
	public static void addSelection(Map<String, String> included, Map<String, String> excluded, String selection, String charset) {
		selection = selection.trim();
		charset = charset.trim();
		if (charset.startsWith(RESOURCE_EXCLUSION)) {
			excluded.put(selection, charset.substring(1));
```

## RuleId[ruleID=RedundantImplements]
### RedundantImplements
Redundant interface declaration `AnalyzerPlugin`
in `bnd-plugins/org.eclipse.transformer.bnd.analyzer/src/main/java/org/eclipse/transformer/bnd/analyzer/JakartaTransformerAnalyzerPlugin.java`
#### Snippet
```java
 */
@ExternalPlugin(name = "JakartaTransformer", objectClass = AnalyzerPlugin.class)
public class JakartaTransformerAnalyzerPlugin extends TransformerAnalyzerPlugin implements AnalyzerPlugin {
	public JakartaTransformerAnalyzerPlugin() {
		super();
```

### RedundantImplements
Redundant interface declaration `VerifierPlugin`
in `bnd-plugins/org.eclipse.transformer.bnd.analyzer/src/main/java/org/eclipse/transformer/bnd/analyzer/JakartaTransformerVerifierPlugin.java`
#### Snippet
```java
 */
@ExternalPlugin(name = "JakartaTransformer", objectClass = VerifierPlugin.class)
public class JakartaTransformerVerifierPlugin extends TransformerVerifierPlugin implements VerifierPlugin {
	public JakartaTransformerVerifierPlugin() {
		super();
```

## RuleId[ruleID=CallToStringConcatCanBeReplacedByOperator]
### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `org.eclipse.transformer.cli/src/main/java/org/eclipse/transformer/cli/TransformerLoggerFactory.java`
#### Snippet
```java
			return null;
		} else {
			return SIMPLE_LOGGER_PROPERTY_PREFIX.concat(propertyName);
		}
	}
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/ActionType.java`
#### Snippet
```java

	private boolean matchingUnsupported(String resourceName) {
		throw new UnsupportedOperationException(getName().concat(" does not support resource name matching"));
	}

```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/ManifestActionImpl.java`
#### Snippet
```java
				String value = renameEntry.getValue();
				if (matchEnd < packageEnd) {
					value = value.concat(text.substring(matchEnd, packageEnd));
				}

```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/util/SignatureUtils.java`
#### Snippet
```java

	public static String classNameToResourceName(String className) {
		String resourceName = putSlashes(className).concat(CLASS_EXTENSION);
		return resourceName;
	}
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/util/SignatureUtils.java`
#### Snippet
```java
				} else {
					key = key.substring(0, lastIndex)
						.concat(wildcard);
				}
			} else {
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/util/SignatureUtils.java`
#### Snippet
```java
				}
			} else {
				key = key.concat(wildcard);
			}
		}
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/util/FileUtils.java`
#### Snippet
```java
		char lastChar = entryName.charAt(entryName.length() - 1);
		if ((lastChar == '/') || (lastChar == '\\')) {
			normalized = normalized.concat("/");
		}

```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/SignatureRuleImpl.java`
#### Snippet
```java
				String value = renameEntry.getValue();
				if (matchEnd < packageEnd) {
					value = value.concat(text.substring(matchEnd, packageEnd));
				}

```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/SignatureRuleImpl.java`
#### Snippet
```java
			String outputName = transformBinaryType(inputName);
			if (outputName != null) {
				String outputPath = prefix.isEmpty() ? outputName : prefix.concat(outputName);
				return outputPath;
			}
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/SignatureRuleImpl.java`
#### Snippet
```java
				String name = renames.get(key);
				if (containsWildcard(key)) {
					name = name.concat(initialName.substring(key.length() - 2));
				}
				return name;
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/ClassActionImpl.java`
#### Snippet
```java
			 (inputPath.charAt(head - 1) == '/') &&
		     inputPath.regionMatches(head, resourceInputPath, 0, tail) ) {
			return inputPath.substring(0, head).concat(resourceOutputPath);
		}

```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/ClassActionImpl.java`
#### Snippet
```java
			outputPath = resourceOutputPath;
		} else {
			outputPath = prefix.concat(resourceOutputPath);
		}

```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/TransformProperties.java`
#### Snippet
```java
		properties.forEach((key, value) -> {
			if (containsWildcard(key)) {
				value = value.concat(key.substring(key.length() - 2));
				key = stripWildcard(key);
			}
```

## RuleId[ruleID=ReturnNull]
### ReturnNull
Return of `null`
in `bnd-plugins/org.eclipse.transformer.bnd.analyzer/src/main/java/org/eclipse/transformer/bnd/analyzer/TransformerPluginOptions.java`
#### Snippet
```java
		List<String> keys = keys(option);
		if (keys.isEmpty()) {
			return null;
		}
		List<String> values = keys.stream()
```

### ReturnNull
Return of `null`
in `bnd-plugins/org.eclipse.transformer.bnd.analyzer/src/main/java/org/eclipse/transformer/bnd/analyzer/TransformerPluginOptions.java`
#### Snippet
```java
		List<String> keys = keys(option);
		if (keys.isEmpty()) {
			return null;
		}
		String value = keys.stream()
```

### ReturnNull
Return of `null`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/SelectionRuleImpl.java`
#### Snippet
```java
				return Maps.entry("*", all);
			}
			return null;
		}
	}
```

### ReturnNull
Return of `null`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/SelectionRuleImpl.java`
#### Snippet
```java
	private MatchSet processSelections(Map<String, String> selections) {
		if (selections == null) {
			return null;
		}
		Map<String, Charset> exact = new HashMap<>();
```

### ReturnNull
Return of `null`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/SelectionRuleImpl.java`
#### Snippet
```java
		}
		if ((all == null) && exact.isEmpty() && head.isEmpty() && tail.isEmpty() && middle.isEmpty()) {
			return null;
		}
		return new MatchSet(exact, head, tail, middle, all);
```

### ReturnNull
Return of `null`
in `org.eclipse.transformer.cli/src/main/java/org/eclipse/transformer/cli/TransformerLoggerFactory.java`
#### Snippet
```java
	protected String completePropertyName(String propertyName) {
		if (propertyName.startsWith(SIMPLE_LOGGER_PROPERTY_PREFIX)) {
			return null;
		} else if (propertyName.indexOf('.') > -1) {
			return null;
```

### ReturnNull
Return of `null`
in `org.eclipse.transformer.cli/src/main/java/org/eclipse/transformer/cli/TransformerLoggerFactory.java`
#### Snippet
```java
			return null;
		} else if (propertyName.indexOf('.') > -1) {
			return null;
		} else {
			return SIMPLE_LOGGER_PROPERTY_PREFIX.concat(propertyName);
```

### ReturnNull
Return of `null`
in `org.eclipse.transformer.cli/src/main/java/org/eclipse/transformer/cli/TransformerLoggerFactory.java`
#### Snippet
```java
		int equalsOffset = propertyAssignment.indexOf('=');
		if (equalsOffset == -1) {
			return null;
		} else {
			String propertyName = propertyAssignment.substring(0, equalsOffset);
```

### ReturnNull
Return of `null`
in `org.eclipse.transformer.cli/src/main/java/org/eclipse/transformer/cli/TransformerLoggerFactory.java`
#### Snippet
```java
			String propertyValue = propertyAssignment.substring(equalsOffset + 1);
			if (propertyName.isEmpty() || propertyValue.isEmpty()) {
				return null;
			}
			return new String[] {
```

### ReturnNull
Return of `null`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/ManifestActionImpl.java`
#### Snippet
```java

		if (initialText == text) {
			return null;
		} else {
			return text;
```

### ReturnNull
Return of `null`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/ManifestActionImpl.java`
#### Snippet
```java

		if (text == null) {
			return null;
		}

```

### ReturnNull
Return of `null`
in `org.eclipse.transformer.cli/src/main/java/org/eclipse/transformer/cli/TransformerCLI.java`
#### Snippet
```java
			return getParsedArgs().getOptionValue(option.getShortTag());
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.transformer.cli/src/main/java/org/eclipse/transformer/cli/TransformerCLI.java`
#### Snippet
```java
	public String getDefaultValue(AppOption option) {
		Map<String, String> useDefaults = getOptionDefaults();
		return (useDefaults == null) ? null : useDefaults.get(option.getLongTag());
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.transformer.cli/src/main/java/org/eclipse/transformer/cli/TransformerCLI.java`
#### Snippet
```java
			return new ArrayList<>(Arrays.asList(getParsedArgs().getOptionValues(option.getShortTag())));
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.transformer.cli/src/main/java/org/eclipse/transformer/cli/TransformerCLI.java`
#### Snippet
```java
			}
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.transformer.cli/src/main/java/org/eclipse/transformer/cli/TransformerCLI.java`
#### Snippet
```java
			}
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `maven-plugins/transformer-maven-plugin/src/main/java/org/eclipse/transformer/maven/TransformerRunMojo.java`
#### Snippet
```java

	private String emptyAsNull(String input) {
		return (Objects.nonNull(input) && !(input = input.trim()).isEmpty()) ? input : null;
	}

```

### ReturnNull
Return of `null`
in `maven-plugins/transformer-maven-plugin/src/main/java/org/eclipse/transformer/maven/TransformerRunMojo.java`
#### Snippet
```java
					return Collections.singletonList(result);
				}
				return null;
			}

```

### ReturnNull
Return of `null`
in `maven-plugins/transformer-maven-plugin/src/main/java/org/eclipse/transformer/maven/TransformerRunMojo.java`
#### Snippet
```java
						return emptyAsNull(rulesPerClassConstantUri);
					default :
						return null;
				}
			}
```

### ReturnNull
Return of `null`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/ActionImpl.java`
#### Snippet
```java
		String lookupName = switchExtensionTo(inputName, ".java", ".class");
		if (lookupName == null) {
			return null;
		}
		String finalValue = getSignatureRule().replaceTextDirectPerClass(initialValue, lookupName);
```

### ReturnNull
Return of `null`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/ActionImpl.java`
#### Snippet
```java
			.endsWith(initialExt)) {
			getLogger().error("Input [ {} ] does not have expected extension [ {} ]", inputName, initialExt);
			return null;
		}

```

### ReturnNull
Return of `null`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/ActionImpl.java`
#### Snippet
```java
			getLogger().trace("    String {} {}: {} (no-active replacements, unchanged)", inputName, valueCase,
				initialValue);
			return null;
		} else {
			return updateString(inputName, valueCase, initialValue, useReplacements);
```

### ReturnNull
Return of `null`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/ActionImpl.java`
#### Snippet
```java
		if ((initialValue == null) || initialValue.isEmpty()) {
			useLogger.trace("    String {} {}: {} (empty, unchanged)", inputName, valueCase, initialValue);
			return null;
		}

```

### ReturnNull
Return of `null`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/ActionImpl.java`
#### Snippet
```java
		if ( finalValue == initialValue ) {
			useLogger.trace("    String {} {}: {} (unchanged)", inputName, valueCase, initialValue);
			return null;
		} else {
			useLogger.trace("    String {} {}: {} -> {} ({})", inputName, valueCase, initialValue, finalValue, cases);
```

### ReturnNull
Return of `null`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/util/LineSeparatorBufferedReader.java`
#### Snippet
```java
		if (c == -1) {
			eol = 0;
			return null;
		}
		StringBuilder sb = new StringBuilder(80);
```

### ReturnNull
Return of `null`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/TransformOptions.java`
#### Snippet
```java
	 */
	default String getDefaultValue(AppOption option) {
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/TransformOptions.java`
#### Snippet
```java
	 */
	default List<String> getOptionValues(AppOption option) {
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/TransformOptions.java`
#### Snippet
```java
	default String getOptionValue(AppOption option) {
		List<String> result = getOptionValues(option);
		return (Objects.nonNull(result) && !result.isEmpty()) ? result.get(0) : null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/TransformOptions.java`
#### Snippet
```java
	 */
	default String normalize(String value) {
		return Objects.nonNull(value) ? value.replace(File.separatorChar, '/') : null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/TransformOptions.java`
#### Snippet
```java
		return Objects.nonNull(values) ? values.stream()
			.map(this::normalize)
			.collect(toList()) : null;
	}
}
```

### ReturnNull
Return of `null`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/ActionSelector.java`
#### Snippet
```java
			}
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/ActionSelector.java`
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
in `maven-plugins/transformer-maven-plugin/src/main/java/org/eclipse/transformer/maven/TransformerMavenLifecycleParticipant.java`
#### Snippet
```java
			}
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `maven-plugins/transformer-maven-plugin/src/main/java/org/eclipse/transformer/maven/TransformerMavenLifecycleParticipant.java`
#### Snippet
```java
			return getTransformerMavenPluginFromContainer(build);
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `maven-plugins/transformer-maven-plugin/src/main/java/org/eclipse/transformer/maven/TransformerMojoOptions.java`
#### Snippet
```java
	private static List<String> condition(List<String> values) {
		if (values == null) {
			return null;
		}
		for (ListIterator<String> iterator = values.listIterator(); iterator.hasNext();) {
```

### ReturnNull
Return of `null`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/BundleDataImpl.java`
#### Snippet
```java
	private static String unquote(String text) {
		if (text.isEmpty()) {
			return null;
		}

```

### ReturnNull
Return of `null`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/BundleDataImpl.java`
#### Snippet
```java
		int textLen = text.length();
		if (textLen < 2) {
			return null;
		} else if (text.charAt(textLen - 1) != QUOTE_CHAR) {
			return null;
```

### ReturnNull
Return of `null`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/BundleDataImpl.java`
#### Snippet
```java
			return null;
		} else if (text.charAt(textLen - 1) != QUOTE_CHAR) {
			return null;
		}

```

### ReturnNull
Return of `null`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/SignatureRuleImpl.java`
#### Snippet
```java
	public String transformSignature(String initialSignature, SignatureType signatureType) {
		if (unchangedSignatures.contains(initialSignature)) {
			return null;
		}

```

### ReturnNull
Return of `null`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/SignatureRuleImpl.java`
#### Snippet
```java

		if (initialText == text) {
			return null;
		} else {
			return text;
```

### ReturnNull
Return of `null`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/SignatureRuleImpl.java`
#### Snippet
```java

		if (outputArgs == null) {
			return null;
		} else {
			return new SimpleClassTypeSignature(inputSignature.identifier, outputArgs);
```

### ReturnNull
Return of `null`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/SignatureRuleImpl.java`
#### Snippet
```java
		int classStart = qualifiedName.lastIndexOf('.');
		if (classStart == -1) {
			return null;
		}

```

### ReturnNull
Return of `null`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/SignatureRuleImpl.java`
#### Snippet
```java
		String packageName = qualifiedName.substring(0, classStart);
		if (packageName.isEmpty()) {
			return null;
		}

```

### ReturnNull
Return of `null`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/SignatureRuleImpl.java`
#### Snippet
```java
		String outputName = replacePackage(packageName);
		if (outputName == null) {
			return null;
		}

```

### ReturnNull
Return of `null`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/SignatureRuleImpl.java`
#### Snippet
```java
			return transform((ClassTypeSignature) type);
		} else {
			return null;
		}
	}
```

### ReturnNull
Return of `null`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/SignatureRuleImpl.java`
#### Snippet
```java
			// This is now allowed, because of of the new
			// substitution cases (direct, package-rename).
			return null;
		}

```

### ReturnNull
Return of `null`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/SignatureRuleImpl.java`
#### Snippet
```java

		if (initialText == text) {
			return null;
		} else {
			return text;
```

### ReturnNull
Return of `null`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/SignatureRuleImpl.java`
#### Snippet
```java
			return transform((JavaTypeSignature) type);
		} else {
			return null;
		}
	}
```

### ReturnNull
Return of `null`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/SignatureRuleImpl.java`
#### Snippet
```java
		Map<String, String> directStringsForClass = perClassDirectStrings.get(inputName);
		if (directStringsForClass == null) {
			return null; // Nothing specific to do.
		}
		return replaceTextDirect(initialValue, inputName, directStringsForClass, "Per-Class");
```

### ReturnNull
Return of `null`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/SignatureRuleImpl.java`
#### Snippet
```java
			return finalValue;
		} else {
			return null;
		}
	}
```

### ReturnNull
Return of `null`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/SignatureRuleImpl.java`
#### Snippet
```java

		if ((outputTypes == null) && (outputSuperClass == null) && (outputInterfaces == null)) {
			return null;
		} else {
			return new ClassSignature(((outputTypes == null) ? inputTypes : outputTypes),
```

### ReturnNull
Return of `null`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/SignatureRuleImpl.java`
#### Snippet
```java

		if ((outputClassBound == null) && (outputBounds == null)) {
			return null;
		} else {
			return new TypeParameter(inputTypeParameter.identifier,
```

### ReturnNull
Return of `null`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/SignatureRuleImpl.java`
#### Snippet
```java

		if (outputType == null) {
			return null;
		} else {
			return new FieldSignature(outputType);
```

### ReturnNull
Return of `null`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/SignatureRuleImpl.java`
#### Snippet
```java
		}
		if ((inputComponent instanceof BaseType) || (inputComponent instanceof TypeVariableSignature)) {
			return null;
		}

```

### ReturnNull
Return of `null`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/SignatureRuleImpl.java`
#### Snippet
```java
		JavaTypeSignature outputComponent = transform((ClassTypeSignature) inputComponent);
		if (outputComponent == null) {
			return null;
		}

```

### ReturnNull
Return of `null`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/SignatureRuleImpl.java`
#### Snippet
```java
		if ((outputTypeParms == null) && (outputParmTypes == null) && (outputResult == null)
			&& (outputThrows == null)) {
			return null;

		} else {
```

### ReturnNull
Return of `null`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/SignatureRuleImpl.java`
#### Snippet
```java

		} else {
			return null;
		}
	}
```

### ReturnNull
Return of `null`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/SignatureRuleImpl.java`
#### Snippet
```java
	private String basicTransformDescriptor(String inputDescriptor) {
		if (unchangedDescriptors.contains(inputDescriptor)) {
			return null;
		}

```

### ReturnNull
Return of `null`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/SignatureRuleImpl.java`
#### Snippet
```java
		} catch (Throwable th) {
			getLogger().trace("Failed to parse constant as resource reference [ {} ]", inputConstant, th);
			return null;
		}
	}
```

### ReturnNull
Return of `null`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/SignatureRuleImpl.java`
#### Snippet
```java

		if ((outputPackageSpecifier == null) && (outputClassType == null) && (outputInnerTypes == null)) {
			return null;
		} else {
			return new ClassTypeSignature(inputType.binary,
```

### ReturnNull
Return of `null`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/SignatureRuleImpl.java`
#### Snippet
```java
	private String basicTransformBinaryType(String inputName) {
		if (unchangedBinaryTypes.contains(inputName)) {
			return null;
		}

```

### ReturnNull
Return of `null`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/SignatureRuleImpl.java`
#### Snippet
```java
		}

		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/SignatureRuleImpl.java`
#### Snippet
```java
			return transform((ReferenceTypeSignature) type);
		} else {
			return null;
		}
	}
```

### ReturnNull
Return of `null`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/SignatureRuleImpl.java`
#### Snippet
```java
		ReferenceTypeSignature outputSignature = transform(inputSignature);
		if (outputSignature == null) {
			return null;
		} else {
			return new TypeArgument(inputArgument.wildcard, outputSignature);
```

### ReturnNull
Return of `null`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/SignatureRuleImpl.java`
#### Snippet
```java
			useLogger.trace("Manifest attribute {}: Package {} version {} is unchanged", attributeName, packageName,
				oldVersion);
			return null;
		} else if (specificVersion == null) {
			useLogger.trace("Manifest attribute {}: Generic update of package {} version {} to {}", attributeName,
```

### ReturnNull
Return of `null`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/SignatureRuleImpl.java`
#### Snippet
```java
		} catch (Throwable th) {
			getLogger().trace("Failed to parse constant as descriptor [ {} ]", inputConstant, th);
			return null;
		}
	}
```

### ReturnNull
Return of `null`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/ClassActionImpl.java`
#### Snippet
```java
				SignatureAttribute inputAttribute = (SignatureAttribute) attr;
				String outputSignature = transformSignature(inputAttribute.signature, signatureType);
				return ((outputSignature == null) ? null : new SignatureAttribute(outputSignature));
			}

```

### ReturnNull
Return of `null`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/ClassActionImpl.java`
#### Snippet
```java
				}

				return ((outputExceptions == null) ? null : new ExceptionsAttribute(outputExceptions));
			}

```

### ReturnNull
Return of `null`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/ClassActionImpl.java`
#### Snippet
```java

				if ((outputHandlers == null) && (outputAttributes == null)) {
					return null;
				} else {
					return new CodeAttribute(attribute.max_stack, attribute.max_locals, attribute.code,
```

### ReturnNull
Return of `null`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/ClassActionImpl.java`
#### Snippet
```java
					useLogger.trace("Enclosing method [ {} ] Class [ {} ] Descriptor [ {} ]", methodName,
						inputClassName, inputDescriptor);
					return null;
				}

```

### ReturnNull
Return of `null`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/ClassActionImpl.java`
#### Snippet
```java
				}
				if (outputFrames == null) {
					return null;
				} else {
					return new StackMapTableAttribute(outputFrames);
```

### ReturnNull
Return of `null`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/ClassActionImpl.java`
#### Snippet
```java

				if (outputClasses == null) {
					return null;
				} else {
					return new InnerClassesAttribute(outputClasses);
```

### ReturnNull
Return of `null`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/ClassActionImpl.java`
#### Snippet
```java

				if (outputVariables == null) {
					return null;
				} else {
					return new LocalVariableTableAttribute(outputVariables);
```

### ReturnNull
Return of `null`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/ClassActionImpl.java`
#### Snippet
```java

				if (outputTypes == null) {
					return null;
				} else {
					return new LocalVariableTypeTableAttribute(outputTypes);
```

### ReturnNull
Return of `null`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/ClassActionImpl.java`
#### Snippet
```java
				AnnotationDefaultAttribute inputAttribute = (AnnotationDefaultAttribute) attr;
				Object outputValue = transformElementValue(inputAttribute.value, inputName, "", "");
				return ((outputValue == null) ? null : new AnnotationDefaultAttribute(outputValue));
			}

```

### ReturnNull
Return of `null`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/ClassActionImpl.java`
#### Snippet
```java
				if ((outputExports == null) && (outputOpens == null) && (outputUses == null)
					&& (outputProvides == null)) {
					return null;
				}
				if (outputExports == null) {
```

### ReturnNull
Return of `null`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/ClassActionImpl.java`
#### Snippet
```java
				String inputMainClass = inputAttribute.main_class;
				String outputMainClass = transformBinaryType(inputMainClass);
				return (outputMainClass == null) ? null : new ModuleMainClassAttribute(outputMainClass);
			}

```

### ReturnNull
Return of `null`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/ClassActionImpl.java`
#### Snippet
```java
				}

				return (outputPackages == null) ? null : new ModulePackagesAttribute(outputPackages);
			}

```

### ReturnNull
Return of `null`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/ClassActionImpl.java`
#### Snippet
```java
				String inputHostClass = inputAttribute.host_class;
				String outputHostClass = transformBinaryType(inputHostClass);
				return (outputHostClass == null) ? null : new NestHostAttribute(outputHostClass);
			}

```

### ReturnNull
Return of `null`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/ClassActionImpl.java`
#### Snippet
```java
				}

				return (outputClasses == null) ? null : new NestMembersAttribute(outputClasses);
			}

```

### ReturnNull
Return of `null`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/ClassActionImpl.java`
#### Snippet
```java
				Object inputValue = inputAttribute.value;
				Object outputValue = transformConstantValue(inputValue, inputName);
				return ((outputValue == null) ? null : new ConstantValueAttribute(outputValue));
			}

```

### ReturnNull
Return of `null`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/ClassActionImpl.java`
#### Snippet
```java
		}

		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/ClassActionImpl.java`
#### Snippet
```java
		} else {
			getLogger().trace("    Non-String ConstantValue: {} (unchanged)", inputValue);
			return null;
		}
	}
```

### ReturnNull
Return of `null`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/ClassActionImpl.java`
#### Snippet
```java
			String outputType = transformDescriptor(inputType);
			if (outputType == null) {
				return null;
			} else {
				return new EnumConst(outputType, enumValue.name);
```

### ReturnNull
Return of `null`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/ClassActionImpl.java`
#### Snippet
```java
			String outputDescriptor = transformDescriptor(inputDescriptor);
			if (outputDescriptor == null) {
				return null;
			} else {
				return new ResultConst(outputDescriptor);
```

### ReturnNull
Return of `null`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/ClassActionImpl.java`
#### Snippet
```java

		} else {
			return null;
		}
	}
```

### ReturnNull
Return of `null`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/ClassActionImpl.java`
#### Snippet
```java

		if ((outputDescriptor == null) && (outputAttributes == null)) {
			return null;
		}

```

### ReturnNull
Return of `null`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/ClassActionImpl.java`
#### Snippet
```java
		AnnotationInfo[] outputAnnotations = transform(inputAttribute.annotations, inputName);

		return ((outputAnnotations == null) ? null : constructor.init(outputAnnotations));
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/ClassActionImpl.java`
#### Snippet
```java
		ParameterAnnotationInfo[] outputParmAnnotations = transform(attribute.parameter_annotations, inputName);
		if (outputParmAnnotations == null) {
			return null;
		} else {
			return constructor.init(outputParmAnnotations);
```

### ReturnNull
Return of `null`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/ClassActionImpl.java`
#### Snippet
```java
	private VerificationTypeInfo transform(VerificationTypeInfo vti) {
		if (!(vti instanceof ObjectVariableInfo)) {
			return null;
		}
		ObjectVariableInfo inputOvi = (ObjectVariableInfo) vti;
```

### ReturnNull
Return of `null`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/ClassActionImpl.java`
#### Snippet
```java
		String inputType = inputOvi.type;
		if (inputType == null) {
			return null;
		}

```

### ReturnNull
Return of `null`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/ClassActionImpl.java`
#### Snippet
```java
		String outputType = transformBinaryType(inputType);
		if (outputType == null) {
			return null;
		} else {
			return new ObjectVariableInfo(inputOvi.tag, outputType);
```

### ReturnNull
Return of `null`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/ClassActionImpl.java`
#### Snippet
```java

		if ((outputType == null) && (outputValues == null)) {
			return null;
		} else {
			return constructor.init(((outputType == null) ? inputType : outputType),
```

### ReturnNull
Return of `null`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/ClassActionImpl.java`
#### Snippet
```java
		TypeAnnotationInfo[] outputAnnotations = transform(inputAttribute.type_annotations, inputName);
		if (outputAnnotations == null) {
			return null;
		} else {
			return constructor.init(outputAnnotations);
```

### ReturnNull
Return of `null`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/Transformer.java`
#### Snippet
```java
			getLogger().error(consoleMarker, "Incorrect number of arguments to option [ {} ] [ {} ]",
				AppOption.RULES_IMMEDIATE_DATA.getLongTag(), immediateArgs);
			return null;
		}

```

### ReturnNull
Return of `null`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/Transformer.java`
#### Snippet
```java
			if (target == null) {
				getLogger().error(consoleMarker, "Immediate rules target [ {} ] is not valid.", targetText);
				return null;
			}

```

### ReturnNull
Return of `null`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/Transformer.java`
#### Snippet
```java
			return acceptedAction.getLastActiveChanges();
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/Transformer.java`
#### Snippet
```java
			}
		}
		return null;
	}

```

## RuleId[ruleID=AssignmentToLambdaParameter]
### AssignmentToLambdaParameter
Assignment to lambda parameter `value`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/TransformProperties.java`
#### Snippet
```java
		properties.forEach((key, value) -> {
			if (containsWildcard(key)) {
				value = value.concat(key.substring(key.length() - 2));
				key = stripWildcard(key);
			}
```

### AssignmentToLambdaParameter
Assignment to lambda parameter `key`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/TransformProperties.java`
#### Snippet
```java
			if (containsWildcard(key)) {
				value = value.concat(key.substring(key.length() - 2));
				key = stripWildcard(key);
			}
			inverseProperties.put(value, key);
```

## RuleId[ruleID=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `values` is redundant
in `bnd-plugins/org.eclipse.transformer.bnd.analyzer/src/main/java/org/eclipse/transformer/bnd/analyzer/TransformerPluginOptions.java`
#### Snippet
```java
			return null;
		}
		List<String> values = keys.stream()
			.map(parameters::get)
			.flatMap(attrs -> attrs.values()
```

### UnnecessaryLocalVariable
Local variable `value` is redundant
in `bnd-plugins/org.eclipse.transformer.bnd.analyzer/src/main/java/org/eclipse/transformer/bnd/analyzer/TransformerPluginOptions.java`
#### Snippet
```java
			return null;
		}
		String value = keys.stream()
			.map(parameters::get)
			.flatMap(attrs -> attrs.values()
```

### UnnecessaryLocalVariable
Local variable `keys` is redundant
in `bnd-plugins/org.eclipse.transformer.bnd.analyzer/src/main/java/org/eclipse/transformer/bnd/analyzer/TransformerPluginOptions.java`
#### Snippet
```java
		String longTag = option.getLongTag();
		String shortTag = option.getShortTag();
		List<String> keys = parameters.keySet()
			.stream()
			.filter(key -> {
```

### UnnecessaryLocalVariable
Local variable `newText` is redundant
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/ManifestActionImpl.java`
#### Snippet
```java
		String tail = text.substring(versionEndIndex + 1);

		String newText = head + newVersion + tail;
		// getLogger().debug("Old [{}] New [{}]", text , newText);

```

### UnnecessaryLocalVariable
Local variable `rc` is redundant
in `org.eclipse.transformer.cli/src/main/java/org/eclipse/transformer/cli/TransformerCLI.java`
#### Snippet
```java

	public static ResultCode runWith(TransformerCLI cli) {
		ResultCode rc = cli.run();
		return rc;
	}
```

### UnnecessaryLocalVariable
Local variable `outputName` is redundant
in `maven-plugins/transformer-maven-plugin/src/main/java/org/eclipse/transformer/maven/TransformerDirectoryMojo.java`
#### Snippet
```java
			MojoExecution mojoExecution = getMojoExecution();
			String inputName = "transformer:" + mojoExecution.getGoal() + "@" + mojoExecution.getExecutionId();
			String outputName = inputName;

			TransformerJarChanges lastActiveChanges = transform(jar, inputName, outputName);
```

### UnnecessaryLocalVariable
Local variable `resourceName` is redundant
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/util/SignatureUtils.java`
#### Snippet
```java

	public static String classNameToResourceName(String className) {
		String resourceName = putSlashes(className).concat(CLASS_EXTENSION);
		return resourceName;
	}
```

### UnnecessaryLocalVariable
Local variable `stream` is redundant
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/util/FileUtils.java`
#### Snippet
```java

	public static InputStream stream(ByteBuffer buffer) {
		InputStream stream = IO.stream(buffer);
		return stream;
	}
```

### UnnecessaryLocalVariable
Local variable `writer` is redundant
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/util/FileUtils.java`
#### Snippet
```java
	public static BufferedWriter writer(OutputStream outputStream, Charset charset) {
		OutputStreamWriter outputWriter = new OutputStreamWriter(outputStream, charset);
		BufferedWriter writer = new BufferedWriter(outputWriter);
		return writer;
	}
```

### UnnecessaryLocalVariable
Local variable `reader` is redundant
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/util/FileUtils.java`
#### Snippet
```java

	public static Reader reader(ByteBuffer buffer, Charset charset) {
		Reader reader = new InputStreamReader(new ByteBufferInputStream(buffer), charset);
		return reader;
	}
```

### UnnecessaryLocalVariable
Local variable `artifact` is redundant
in `maven-plugins/transformer-maven-plugin/src/main/java/org/eclipse/transformer/maven/TransformerJarMojo.java`
#### Snippet
```java

		try {
			Artifact artifact = getArtifactResolver().resolveArtifact(buildingRequest, coordinate)
				.getArtifact();
			return artifact;
```

### UnnecessaryLocalVariable
Local variable `output` is redundant
in `maven-plugins/transformer-maven-plugin/src/main/java/org/eclipse/transformer/maven/TransformerJarMojo.java`
#### Snippet
```java
			name = getBaseName() + "-" + classifier + "." + extension;
		}
		File output = IO.getBasedFile(getBuildDirectory(), name);
		return output;
	}
```

### UnnecessaryLocalVariable
Local variable `outputPath` is redundant
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/SignatureRuleImpl.java`
#### Snippet
```java
			String outputName = transformBinaryType(inputName);
			if (outputName != null) {
				String outputPath = prefix.isEmpty() ? outputName : prefix.concat(outputName);
				return outputPath;
			}
```

### UnnecessaryLocalVariable
Local variable `finalName` is redundant
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/SignatureRuleImpl.java`
#### Snippet
```java

	private String replacePackage(String initialName, String wildcard, Map<String, String> renames) {
		String finalName = keyStream(initialName, wildcard).filter(renames::containsKey)
			.findFirst()
			.map(key -> {
```

### UnnecessaryLocalVariable
Local variable `outputData` is redundant
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/ZipActionImpl.java`
#### Snippet
```java
				? outputStream.toByteBuffer()
				: inputData.buffer();
			ByteData outputData = new ByteDataImpl(outputPath, outputBuffer, inputData.charset());
			return outputData;
		} finally {
```

### UnnecessaryLocalVariable
Local variable `outputAttribute` is redundant
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/ClassActionImpl.java`
#### Snippet
```java
			case RuntimeVisibleAnnotationsAttribute.NAME : {
				RuntimeVisibleAnnotationsAttribute inputAttribute = (RuntimeVisibleAnnotationsAttribute) attr;
				RuntimeVisibleAnnotationsAttribute outputAttribute = transform(inputAttribute,
					RuntimeVisibleAnnotationsAttribute::new, inputName);
				return outputAttribute;
```

### UnnecessaryLocalVariable
Local variable `outputAttribute` is redundant
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/ClassActionImpl.java`
#### Snippet
```java
			case RuntimeInvisibleAnnotationsAttribute.NAME : {
				RuntimeInvisibleAnnotationsAttribute inputAttribute = (RuntimeInvisibleAnnotationsAttribute) attr;
				RuntimeInvisibleAnnotationsAttribute outputAttribute = transform(inputAttribute,
					RuntimeInvisibleAnnotationsAttribute::new, inputName);
				return outputAttribute;
```

### UnnecessaryLocalVariable
Local variable `outputAttribute` is redundant
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/ClassActionImpl.java`
#### Snippet
```java
			case RuntimeVisibleParameterAnnotationsAttribute.NAME : {
				RuntimeVisibleParameterAnnotationsAttribute inputAttribute = (RuntimeVisibleParameterAnnotationsAttribute) attr;
				RuntimeVisibleParameterAnnotationsAttribute outputAttribute = transform(inputAttribute,
					RuntimeVisibleParameterAnnotationsAttribute::new, inputName);
				return outputAttribute;
```

### UnnecessaryLocalVariable
Local variable `outputAttribute` is redundant
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/ClassActionImpl.java`
#### Snippet
```java
			case RuntimeInvisibleParameterAnnotationsAttribute.NAME : {
				RuntimeInvisibleParameterAnnotationsAttribute inputAttribute = (RuntimeInvisibleParameterAnnotationsAttribute) attr;
				RuntimeInvisibleParameterAnnotationsAttribute outputAttribute = transform(inputAttribute,
					RuntimeInvisibleParameterAnnotationsAttribute::new, inputName);
				return outputAttribute;
```

### UnnecessaryLocalVariable
Local variable `outputAttribute` is redundant
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/ClassActionImpl.java`
#### Snippet
```java
			case RuntimeVisibleTypeAnnotationsAttribute.NAME : {
				RuntimeVisibleTypeAnnotationsAttribute inputAttribute = (RuntimeVisibleTypeAnnotationsAttribute) attr;
				RuntimeVisibleTypeAnnotationsAttribute outputAttribute = transform(inputAttribute,
					RuntimeVisibleTypeAnnotationsAttribute::new, inputName);
				return outputAttribute;
```

### UnnecessaryLocalVariable
Local variable `outputAttribute` is redundant
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/ClassActionImpl.java`
#### Snippet
```java
			case RuntimeInvisibleTypeAnnotationsAttribute.NAME : {
				RuntimeInvisibleTypeAnnotationsAttribute inputAttribute = (RuntimeInvisibleTypeAnnotationsAttribute) attr;
				RuntimeInvisibleTypeAnnotationsAttribute outputAttribute = transform(inputAttribute,
					RuntimeInvisibleTypeAnnotationsAttribute::new, inputName);
				return outputAttribute;
```

### UnnecessaryLocalVariable
Local variable `mergedProperties` is redundant
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/Transformer.java`
#### Snippet
```java
		String referenceName = ruleOption.name();
		String baseReference = rulesReferences.get(0);
		Map<String, String> mergedProperties = rulesReferences.stream()
			.reduce(new HashMap<>(), asBiFunction((props, ref) -> {
				Properties p = loadProperties0(referenceName, ref);
```

### UnnecessaryLocalVariable
Local variable `substitutions` is redundant
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/Transformer.java`
#### Snippet
```java
		List<String> substitutionsRefs = Strings.split(substitutionsRef);

		Map<String, String> substitutions = substitutionsRefs.stream()
			.reduce(new HashMap<>(), asBiFunction((props, ref) -> {
				String relativeSubstitutionsRef = (masterRef != null) ? relativize(ref, masterRef) : ref;
```

## RuleId[ruleID=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `maven-plugins/transformer-maven-plugin/src/main/java/org/eclipse/transformer/maven/TransformerRunMojo.java`
#### Snippet
```java
		}

		return artifactList.toArray(new Artifact[0]);
	}

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/Transformer.java`
#### Snippet
```java
	public ImmediateRuleData[] getImmediateData() {
		if (!options.hasOption(AppOption.RULES_IMMEDIATE_DATA)) {
			return new ImmediateRuleData[] {
				// EMPTY
			};
		}

```

## RuleId[ruleID=UnusedAssignment]
### UnusedAssignment
The value `true` assigned to `foundQuotationMark` is never used
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/ManifestActionImpl.java`
#### Snippet
```java
					// getLogger().debug("versionEndIndex = [{}]",
					// versionEndIndex);
					foundQuotationMark = true; // not necessary, just leave loop
					break;
				}
```

### UnusedAssignment
Variable `bytesRead` initializer `0` is redundant
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/util/FileUtils.java`
#### Snippet
```java
		long totalBytesRead = 0L;

		for (int bytesRead = 0; (bytesRead = inputStream.read(buffer, 0, buffer.length)) != -1;) {
			totalBytesRead += bytesRead;
			outputStream.write(buffer, 0, bytesRead);
```

### UnusedAssignment
The value `requested` assigned to `outputCapacity` is never used
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/util/FileUtils.java`
#### Snippet
```java
				// the capacity.  We will correct that before returning the buffer.
				outputBuffer = ByteBuffer.allocate(requested);
				outputCapacity = requested;
			}

```

### UnusedAssignment
Variable `useOutputPath` initializer `null` is redundant
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/Transformer.java`
#### Snippet
```java

		File useOutputFile = new File(useOutputName);
		String useOutputPath = null;
		try {
			useOutputFile = useOutputFile.getCanonicalFile();
```

## RuleId[ruleID=ConstantValue]
### ConstantValue
Condition `!foundQuotationMark` is always `true`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/ManifestActionImpl.java`
#### Snippet
```java
			// When we find the quotation marks past the equals sign, we are
			// finished.
			if (!foundQuotationMark) {
				if (ch == QUOTE_MARK) {
					versionBeginIndex = i + 1; // just past the 1st quotation mark
```

### ConstantValue
Value `foundQuotationMark` is always 'false'
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/ManifestActionImpl.java`
#### Snippet
```java
			// When we find the quotation marks past the equals sign, we are
			// finished.
			if (!foundQuotationMark) {
				if (ch == QUOTE_MARK) {
					versionBeginIndex = i + 1; // just past the 1st quotation mark
```

### ConstantValue
Condition `nextTail == null` is always `false`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/BundleDataImpl.java`
#### Snippet
```java
			}

			if ((head == null) || (nextTail == null) || nextTail.isEmpty()) {
				throw formatError(packedData);
			}
```

### ConstantValue
Value `action` is always 'null'
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/ZipActionImpl.java`
#### Snippet
```java
					if (action == null) {
						if ( isDuplicate(inputName, inputPath, inputName, outputPath, seen) ) {
							recordDuplicate(action, inputName);
						} else {
							copy(inputEntry, zipInputStream, inputName, zipOutputStream, copyBuffer);
```

### ConstantValue
Condition `inputName != null` is always `false`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/ZipActionImpl.java`
#### Snippet
```java
		} catch (IOException e) {
			String message;
			if (inputName != null) {
				// Actively processing an entry.
				message = "Failure while processing [ " + inputName + " ] from [ " + inputPath + " ]";
```

## RuleId[ruleID=MethodOverridesStaticMethod]
### MethodOverridesStaticMethod
Method `main()` tries to override a static method of a superclass
in `org.eclipse.transformer.cli/src/main/java/org/eclipse/transformer/cli/JakartaTransformerCLI.java`
#### Snippet
```java
@Header(name = "Main-Class", value = "${@class}")
public class JakartaTransformerCLI extends TransformerCLI {
	public static void main(String[] args) throws Exception {
		JakartaTransformerCLI cli = new JakartaTransformerCLI(System.out, System.err, args);
		ResultCode rc = runWith(cli);
```

