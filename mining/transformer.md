# transformer 
 
# Bad smells
I found 96 bad smells with 25 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryLocalVariable | 22 | true |
| EmptyStatementBody | 10 | false |
| DefaultAnnotationParam | 9 | false |
| JavadocDeclaration | 9 | false |
| DuplicatedCode | 9 | false |
| StringEquality | 5 | false |
| CommentedOutCode | 5 | false |
| FieldMayBeFinal | 4 | false |
| UnusedAssignment | 4 | false |
| ConstantValue | 4 | false |
| AutoCloseableResource | 3 | false |
| UnnecessaryToStringCall | 3 | true |
| DataFlowIssue | 2 | false |
| DanglingJavadoc | 2 | false |
| TrivialIf | 2 | false |
| ThrowFromFinallyBlock | 1 | false |
| UnnecessaryUnicodeEscape | 1 | false |
| ManualMinMaxCalculation | 1 | false |
## RuleId[id=StringEquality]
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

## RuleId[id=DefaultAnnotationParam]
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
	private String				rulesBundlesUri;

	@Parameter(property = "transformer-plugin.direct", defaultValue = "")
	private String				rulesDirectUri;

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
	private String				rulesRenamesUri;

	@Parameter(property = "transformer-plugin.versions", defaultValue = "")
	private String				rulesVersionUri;

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
	private String rulesPerClassConstantUri;

	@Parameter(property = "transformer-plugin.xml", defaultValue = "")
	private String				rulesXmlsUri;

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

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'ManifestResource' used without 'try'-with-resources statement
in `bnd-plugins/org.eclipse.transformer.bnd.analyzer/src/main/java/org/eclipse/transformer/bnd/analyzer/action/AnalyzerAction.java`
#### Snippet
```java
								continue; // no calculated manifest
							}
							resource = new ManifestResource(manifest);
						}
					}
```

### AutoCloseableResource
'ManifestResource' used without 'try'-with-resources statement
in `maven-plugins/transformer-maven-plugin/src/main/java/org/eclipse/transformer/maven/action/TransformerJarAction.java`
#### Snippet
```java
								continue; // no calculated manifest
							}
							resource = new ManifestResource(manifest);
						}
					}
```

### AutoCloseableResource
'MapStream' used without 'try'-with-resources statement
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/SignatureRuleImpl.java`
#### Snippet
```java
			// wild cards last.

			MapStream.of(packageRenames)
				.sortedByKey(new RenameKeyComparator('.'))
				.forEachOrdered((initialName, finalName) -> {
```

## RuleId[id=ThrowFromFinallyBlock]
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

## RuleId[id=DataFlowIssue]
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

## RuleId[id=EmptyStatementBody]
### EmptyStatementBody
`else` statement has empty body
in `org.eclipse.transformer.cli/src/main/java/org/eclipse/transformer/cli/TransformerCLI.java`
#### Snippet
```java
			} else if (appOption.getHasArgCount()) {
				builder.numberOfArgs(appOption.getArgCount());
			} else {
				// No arguments are required for this option.
			}
```

### EmptyStatementBody
`else` statement has empty body
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/SignatureRuleImpl.java`
#### Snippet
```java
				outputName = outputSignature.toString()
					.replace('.', '$');
			} else {
				// Leave outputName null.
			}
```

### EmptyStatementBody
`else` statement has empty body
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/SignatureRuleImpl.java`
#### Snippet
```java
				if (outputPackage != null) {
					outputName = outputPackage + inputName.substring(lastSlashOffset);
				} else {
					// Leave outputName null.
				}
```

### EmptyStatementBody
`else` statement has empty body
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/SignatureRuleImpl.java`
#### Snippet
```java
					// Leave outputName null.
				}
			} else {
				// Leave outputName with null;
			}
```

### EmptyStatementBody
`else` statement has empty body
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/SignatureRuleImpl.java`
#### Snippet
```java
			if (outputSignature != null) {
				outputDescriptor = outputSignature.replace('.', '$');
			} else {
				// leave outputDescriptor null
			}
```

### EmptyStatementBody
`else` statement has empty body
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/SignatureRuleImpl.java`
#### Snippet
```java
			if (outputSignature != null) {
				outputDescriptor = outputSignature.replace('.', '$');
			} else {
				// leave outputDescriptor null
			}
```

### EmptyStatementBody
`else` statement has empty body
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/SignatureRuleImpl.java`
#### Snippet
```java
			}

		} else {
			// leave outputDescriptor null
		}
```

### EmptyStatementBody
`else` statement has empty body
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/SignatureRuleImpl.java`
#### Snippet
```java
			if (finalClassSignature != null) {
				finalSignature = finalClassSignature.toString();
			} else {
				// leave output null;
			}
```

### EmptyStatementBody
`else` statement has empty body
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/SignatureRuleImpl.java`
#### Snippet
```java
			if (finalFieldSignature != null) {
				finalSignature = finalFieldSignature.toString();
			} else {
				// leave output null;
			}
```

### EmptyStatementBody
`else` statement has empty body
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/SignatureRuleImpl.java`
#### Snippet
```java
			if (finalMethodSignature != null) {
				finalSignature = finalMethodSignature.toString();
			} else {
				// leave output null
			}
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
Javadoc pointing to itself
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/ByteData.java`
#### Snippet
```java
	 * <p>
	 * For a buffer which has its position set to zero, use instead
	 * {@link #buffer()}.
	 *
	 * @return The buffer associated with the data.
```

### JavadocDeclaration
`@throws` tag description is missing
in `maven-plugins/transformer-maven-plugin/src/main/java/org/eclipse/transformer/maven/TransformerRunMojo.java`
#### Snippet
```java
	 * @throws MojoFailureException Thrown if there is an error during plugin
	 *             execution
	 * @throws MojoExecutionException
	 */
	@Override
```

### JavadocDeclaration
`@throws` tag description is missing
in `maven-plugins/transformer-maven-plugin/src/main/java/org/eclipse/transformer/maven/TransformerRunMojo.java`
#### Snippet
```java
	 * @param sourceArtifact The Artifact to transform
	 * @throws MojoFailureException if plugin execution fails
	 * @throws MojoExecutionException
	 */
	public void transform(final Artifact sourceArtifact) throws MojoFailureException, MojoExecutionException {
```

### JavadocDeclaration
`@param sysOut` tag description is missing
in `org.eclipse.transformer.cli/src/main/java/org/eclipse/transformer/cli/JakartaTransformerCLI.java`
#### Snippet
```java

	/**
	 * @param sysOut
	 * @param sysErr
	 * @param args
```

### JavadocDeclaration
`@param sysErr` tag description is missing
in `org.eclipse.transformer.cli/src/main/java/org/eclipse/transformer/cli/JakartaTransformerCLI.java`
#### Snippet
```java
	/**
	 * @param sysOut
	 * @param sysErr
	 * @param args
	 */
```

### JavadocDeclaration
`@param args` tag description is missing
in `org.eclipse.transformer.cli/src/main/java/org/eclipse/transformer/cli/JakartaTransformerCLI.java`
#### Snippet
```java
	 * @param sysOut
	 * @param sysErr
	 * @param args
	 */
	public JakartaTransformerCLI(PrintStream sysOut, PrintStream sysErr, String... args) {
```

### JavadocDeclaration
`@param indexOfComma` tag description is missing
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/ManifestActionImpl.java`
#### Snippet
```java
	 * @param packageText - Text that immediately follows a package name in a
	 *            MANIFEST.MF attribute
	 * @param indexOfComma
	 * @return
	 */
```

### JavadocDeclaration
`@return` tag description is missing
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/ManifestActionImpl.java`
#### Snippet
```java
	 *            MANIFEST.MF attribute
	 * @param indexOfComma
	 * @return
	 */
	private boolean isPackageDelimitingComma(String testString, String packageText, int indexOfComma) {
```

### JavadocDeclaration
Wrong tag `replacePackage`
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/SignatureRuleImpl.java`
#### Snippet
```java
	 * available.
	 * </p>
	 * See {@replacePackage}.
	 *
	 * @param inputName The input name which is to be renamed.
```

## RuleId[id=CommentedOutCode]
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

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `artifact` may be 'final'
in `maven-plugins/transformer-maven-plugin/src/main/java/org/eclipse/transformer/maven/TransformerJarMojo.java`
#### Snippet
```java
	 */
	@Parameter
	private TransformerArtifact			artifact	= new TransformerArtifact();

	@Component
```

### FieldMayBeFinal
Field `rules` may be 'final'
in `maven-plugins/transformer-maven-plugin/src/main/java/org/eclipse/transformer/maven/AbstractTransformerMojo.java`
#### Snippet
```java
	 */
	@Parameter
	private TransformerRules		rules	= new TransformerRules();

	/**
```

### FieldMayBeFinal
Field `changed` may be 'final'
in `maven-plugins/transformer-maven-plugin/src/main/java/org/eclipse/transformer/maven/action/TransformerJarChanges.java`
#### Snippet
```java

public class TransformerJarChanges extends ContainerChangesImpl {
	private Set<String>	changed	= new HashSet<>();
	private Set<String>	removed	= new HashSet<>();

```

### FieldMayBeFinal
Field `removed` may be 'final'
in `maven-plugins/transformer-maven-plugin/src/main/java/org/eclipse/transformer/maven/action/TransformerJarChanges.java`
#### Snippet
```java
public class TransformerJarChanges extends ContainerChangesImpl {
	private Set<String>	changed	= new HashSet<>();
	private Set<String>	removed	= new HashSet<>();

	public TransformerJarChanges() {
```

## RuleId[id=UnnecessaryUnicodeEscape]
### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0023` can be replaced with '#'
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/ServiceLoaderConfigActionImpl.java`
#### Snippet
```java
 * of fully-qualified binary names of concrete provider classes, one per line.
 * Space and tab characters surrounding each name, as well as blank lines, are
 * ignored. The comment character is '#' ('\u0023', NUMBER SIGN); on each line
 * all characters following the first comment character are ignored. The file
 * must be encoded in UTF-8.
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `bnd-plugins/org.eclipse.transformer.bnd.analyzer/src/main/java/org/eclipse/transformer/bnd/analyzer/action/AnalyzerAction.java`
#### Snippet
```java
			setResourceNames(bundleSymbolicName, bundleSymbolicName);

			Map<String, Resource> resources = jar.getResources();
			List<String> inputPaths = new ArrayList<>(resources.size() + 1);
			if (!resources.containsKey(manifestName)) {
				inputPaths.add(manifestName); // process manifest first
			}
			inputPaths.addAll(resources.keySet());
```

### DuplicatedCode
Duplicated code
in `bnd-plugins/org.eclipse.transformer.bnd.analyzer/src/main/java/org/eclipse/transformer/bnd/analyzer/action/AnalyzerAction.java`
#### Snippet
```java
					Resource resource = jar.getResource(inputPath);
					if (inputPath.equals(manifestName)) {
						if (resource == null) {
							Manifest manifest = jar.getManifest();
							if (manifest == null) {
								continue; // no calculated manifest
							}
							resource = new ManifestResource(manifest);
						}
					}
					ByteBuffer bb = resource.buffer();
					ByteData inputData;
					if (bb != null) {
						Charset charset = resourceCharset(inputPath);
						inputData = new ByteDataImpl(inputPath, bb, charset);
					} else {
						inputData = collect(inputPath, resource.openInputStream(),
							Math.toIntExact(resource.size()));
					}
					ByteData outputData = ((ElementAction)action).apply(inputData);
					recordAction(action, inputPath);
					Changes changes = action.getLastActiveChanges();
```

### DuplicatedCode
Duplicated code
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/Transformer.java`
#### Snippet
```java
				String simpleNameSelector = substitutionRefEntry.getKey();
				String substitutionsRef = options.normalize(substitutionRefEntry.getValue());

				Map<String, String> substitutions =
					loadSubstitutions(masterTextRef, simpleNameSelector, substitutionsRef);
				if (invert) {
					substitutions = TransformProperties.invert(substitutions);
				}

				textMasterProperties.put(simpleNameSelector, substitutionsRef);
```

### DuplicatedCode
Duplicated code
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/ClassActionImpl.java`
#### Snippet
```java
				String[] outputExceptions = null;
				for (int exNo = 0; exNo < inputExceptions.length; exNo++) {
					String exception = transformBinaryType(inputExceptions[exNo]);
					if (exception != null) {
						if (outputExceptions == null) {
							outputExceptions = inputExceptions.clone();
						}
						outputExceptions[exNo] = exception;
					}
				}
```

### DuplicatedCode
Duplicated code
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/ElementActionImpl.java`
#### Snippet
```java
		ByteData inputData = collect(inputName, inputFile);

		ByteData outputData;
		TransformException transformError;
		try {
			outputData = apply(inputData);
			transformError = null;
		} catch (TransformException t) {
			outputData = inputData; // Fallback: copy.
			transformError = t;
		}
```

### DuplicatedCode
Duplicated code
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/JSPActionImpl.java`
#### Snippet
```java
		List<StringReplacement> replacements = super.createActiveReplacements(signatureRule);
		if ( !signatureRule.getPackageRenames().isEmpty() ) {
			replacements.add(this::packagesUpdate);
			replacements.add(this::binaryPackagesUpdate);
		}
		// Do NOT add direct-per-class updates.
		if ( !signatureRule.getDirectGlobalUpdates().isEmpty() ) {
			replacements.add(this::directGlobalUpdate);
		}
		return replacements;
```

### DuplicatedCode
Duplicated code
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/ManifestActionImpl.java`
#### Snippet
```java
				if ( matchStart == -1 ) {
					break;
				}

				matchEnd = matchStart + keyLen;
				int packageEnd = packageMatch(text, matchStart, matchEnd, matchPackageStem);
				if (packageEnd == -1) {
					continue;
				}

				String value = renameEntry.getValue();
				if (matchEnd < packageEnd) {
					value = value.concat(text.substring(matchEnd, packageEnd));
				}

				String head = text.substring(0, matchStart);
				String tail = text.substring(packageEnd);
```

### DuplicatedCode
Duplicated code
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/SignatureRuleImpl.java`
#### Snippet
```java
				matchEnd = matchStart + keyLen;
				int packageEnd = packageMatch(text, matchStart, matchEnd, matchPackageStem);
				if (packageEnd == -1) {
					continue;
				}

				String value = renameEntry.getValue();
				if (matchEnd < packageEnd) {
					value = value.concat(text.substring(matchEnd, packageEnd));
				}

				String head = text.substring(0, matchStart);
				String tail = text.substring(packageEnd);
```

### DuplicatedCode
Duplicated code
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/SignatureRuleImpl.java`
#### Snippet
```java
		TypeParameter[] inputTypes = classSignature.typeParameters;
		TypeParameter[] outputTypes = null;

		for (int parmNo = 0; parmNo < inputTypes.length; parmNo++) {
			TypeParameter inputType = inputTypes[parmNo];
			TypeParameter outputType = transform(inputType);

			if (outputType != null) {
				if (outputTypes == null) {
					outputTypes = inputTypes.clone();
				}
				outputTypes[parmNo] = outputType;
			}
		}
```

## RuleId[id=UnnecessaryLocalVariable]
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

## RuleId[id=ManualMinMaxCalculation]
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

## RuleId[id=UnnecessaryToStringCall]
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

## RuleId[id=DanglingJavadoc]
### DanglingJavadoc
Dangling Javadoc comment
in `bnd-plugins/org.eclipse.transformer.bnd.analyzer/src/main/java/org/eclipse/transformer/bnd/analyzer/TransformerVerifierPlugin.java`
#### Snippet
```java
public class TransformerVerifierPlugin extends BaseTransformerPlugin implements VerifierPlugin {
	public TransformerVerifierPlugin() {
		/**
		 * We want to run after other VerifierPlugins so we will operate on the
		 * final classes and resources.
```

### DanglingJavadoc
Dangling Javadoc comment
in `bnd-plugins/org.eclipse.transformer.bnd.analyzer/src/main/java/org/eclipse/transformer/bnd/analyzer/TransformerAnalyzerPlugin.java`
#### Snippet
```java
public class TransformerAnalyzerPlugin extends BaseTransformerPlugin implements AnalyzerPlugin {
	public TransformerAnalyzerPlugin() {
		/**
		 * We want to run before other AnalyzerPlugins so they will operate on
		 * the transformed classes and resources.
```

## RuleId[id=UnusedAssignment]
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

## RuleId[id=ConstantValue]
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

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/ManifestActionImpl.java`
#### Snippet
```java
				continue;
			}
			if (s.charAt(i) == ';') {
				return true;
			}
```

### TrivialIf
`if` statement can be simplified
in `org.eclipse.transformer/src/main/java/org/eclipse/transformer/action/impl/ManifestActionImpl.java`
#### Snippet
```java
		char characterAfterComma = testString.charAt(indexOfNextNonWhiteSpaceCharAfterComma);
		if (Character.isAlphabetic(characterAfterComma)) {
			if (!hasEvenNumberOfOccurrencesOfChar(packageText, '\"')) {
				return false;
			}
```

