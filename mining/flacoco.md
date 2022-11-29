# flacoco 
 
# Bad smells
I found 73 bad smells with 7 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| AssignmentToStaticFieldFromInstanceMethod | 21 | false |
| ConstantValue | 7 | false |
| RedundantFieldInitialization | 5 | false |
| DefaultAnnotationParam | 4 | false |
| UnnecessaryModifier | 3 | true |
| UnnecessaryFullyQualifiedName | 3 | false |
| RegExpRedundantEscape | 3 | false |
| ZeroLengthArrayInitialization | 3 | false |
| BoundedWildcard | 3 | false |
| DynamicRegexReplaceableByCompiledPattern | 2 | false |
| DataFlowIssue | 2 | false |
| ReturnNull | 2 | false |
| RegExpUnnecessaryNonCapturingGroup | 2 | false |
| UnnecessaryToStringCall | 2 | true |
| IgnoreResultOfCall | 2 | false |
| SystemOutErr | 1 | false |
| UtilityClassWithoutPrivateConstructor | 1 | true |
| UNUSED_IMPORT | 1 | false |
| NonProtectedConstructorInAbstractClass | 1 | true |
| KeySetIterationMayUseEntrySet | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| UnusedAssignment | 1 | false |
| OptionalGetWithoutIsPresent | 1 | false |
| UnnecessaryBoxing | 1 | false |
## RuleId[ruleID=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/spoonlabs/flacoco/cli/FlacocoMain.java`
#### Snippet
```java
	private OutputStreamWriter getOutputStreamWriter(FlacocoExporter exporter) throws IOException {
		if (this.output == null) {
			return new OutputStreamWriter(System.out);
		} else if (this.output.isEmpty()) {
			File file = new File("flacoco_results." + exporter.extension());
```

## RuleId[ruleID=DefaultAnnotationParam]
### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/main/java/fr/spoonlabs/flacoco/cli/FlacocoMain.java`
#### Snippet
```java
	Set<String> jacocoExcludes = new HashSet<>();

	@CommandLine.ArgGroup(exclusive = false, multiplicity = "0..1", heading = "\nSetting any of these options will result in test detection being bypassed:\n")
	Tests tests = new Tests();

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/main/java/fr/spoonlabs/flacoco/cli/FlacocoMain.java`
#### Snippet
```java
	String output;

	@CommandLine.ArgGroup(exclusive = true, multiplicity = "0..1")
	FormatOption formatOption = new FormatOption();

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/main/java/fr/spoonlabs/flacoco/cli/FlacocoMain.java`
#### Snippet
```java
	String output;

	@CommandLine.ArgGroup(exclusive = true, multiplicity = "0..1")
	FormatOption formatOption = new FormatOption();

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/main/java/fr/spoonlabs/flacoco/cli/FlacocoMain.java`
#### Snippet
```java
			description = "Path to the output file. If no path is provided but the flag is, the result will be stored in flacoco_result.{extension}",
			arity = "0..1",
			fallbackValue = ""
	)
	String output;
```

## RuleId[ruleID=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/fr/spoonlabs/flacoco/core/test/strategies/TestDetectionStrategy.java`
#### Snippet
```java
public interface TestDetectionStrategy {

    public List<TestContext> findTests();

}
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `src/main/java/fr/spoonlabs/flacoco/localization/spectrum/SpectrumFormula.java`
#### Snippet
```java
	private final Formula formula;

	private SpectrumFormula(Formula formula) {
		this.formula = formula;
	}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/fr/spoonlabs/flacoco/localization/spectrum/formulas/Formula.java`
#### Snippet
```java
public interface Formula {

	public double compute(int nPassingNotExecuting, int nFailingNotExecuting, int nPassingExecuting,
			int nFailingExecuting);
}
```

## RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `StackTraceParser` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/ch/scheitlin/alex/java/StackTraceParser.java`
#### Snippet
```java
 * object.
 */
public class StackTraceParser {
    // A typical stack trace element looks like follows:
    // com.myPackage.myClass.myMethod(myClass.java:1)
```

## RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/fr/spoonlabs/flacoco/utils/spoon/SpoonBlockInspector.java`
#### Snippet
```java
    public List<Location> getBlockLocations(StackTraceElement element) {
        // Find the corresponding source code file
        String path = element.getClassName().replace(".", "/") + ".java";
        for (String dir : config.getSrcJavaDir()) {
            if (new File(new File(dir), path).exists()) {
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/fr/spoonlabs/flacoco/core/coverage/CoverageMatrix.java`
#### Snippet
```java
		for (String iClassNameCovered : covLine.getDetailedCoverage().keySet()) {

			String className = iClassNameCovered.replace("/", ".");
			if (!config.isCoverTests() && testClasses.contains(className)) {
				continue;
```

## RuleId[ruleID=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.junit.jupiter.api` is unnecessary, and can be replaced with an import
in `src/main/java/fr/spoonlabs/flacoco/core/test/strategies/classloader/finder/filters/TestMethodFilter.java`
#### Snippet
```java
            // the private ones
            for (Method method : clazz.getDeclaredMethods()) {
                if (method.getAnnotation(org.junit.jupiter.api.Test.class) != null
                        && !isPrivateMethod(method)
                        && !isIgnoredMethod(clazz, method)
```

### UnnecessaryFullyQualifiedName
Qualifier `org.junit` is unnecessary, and can be replaced with an import
in `src/main/java/fr/spoonlabs/flacoco/core/test/strategies/classloader/finder/filters/TestMethodFilter.java`
#### Snippet
```java
        try {
            for (Method method : clazz.getMethods()) {
                if (method.getAnnotation(org.junit.Test.class) != null && !isIgnoredMethod(clazz, method)) {
                    testMethods.add(new StringTestMethod(clazz.getCanonicalName(), method.getName()));
                }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.sun.management` is unnecessary, and can be replaced with an import
in `src/main/java/fr/spoonlabs/flacoco/localization/spectrum/SpectrumRunner.java`
#### Snippet
```java

		// Warn if system memory is lower than 4GiB
		long memorySize = ((com.sun.management.OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean())
				.getTotalPhysicalMemorySize();
		if (memorySize < 4294967296L) {
```

## RuleId[ruleID=DataFlowIssue]
### DataFlowIssue
Method invocation `run` may produce `NullPointerException`
in `src/main/java/fr/spoonlabs/flacoco/api/Flacoco.java`
#### Snippet
```java
	public FlacocoResult run() {
		this.logger.info("Running Flacoco...");
		return this.getRunner().run();
	}

```

### DataFlowIssue
Method invocation `export` may produce `NullPointerException`
in `src/main/java/fr/spoonlabs/flacoco/cli/FlacocoMain.java`
#### Snippet
```java
			FlacocoExporter exporter = getExporter();
			OutputStreamWriter outputStreamWriter = getOutputStreamWriter(exporter);
			exporter.export(result, outputStreamWriter);
			outputStreamWriter.close();
		} catch (IOException e) {
```

## RuleId[ruleID=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import fr.spoonlabs.flacoco.core.config.FlacocoConfig;`
in `src/main/java/fr/spoonlabs/flacoco/api/FlacocoAPI.java`
#### Snippet
```java

import fr.spoonlabs.flacoco.api.result.FlacocoResult;
import fr.spoonlabs.flacoco.core.config.FlacocoConfig;

public interface FlacocoAPI {
```

## RuleId[ruleID=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `TestFrameworkStrategy()` of an abstract class should not be declared 'public'
in `src/main/java/fr/spoonlabs/flacoco/core/coverage/framework/TestFrameworkStrategy.java`
#### Snippet
```java
	protected FlacocoConfig config;

	public TestFrameworkStrategy(FlacocoConfig flacocoConfig) {
		this.config = flacocoConfig;
	}
```

## RuleId[ruleID=AssignmentToStaticFieldFromInstanceMethod]
### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `EntryPoint.useOptionsFile` from instance context
in `src/main/java/fr/spoonlabs/flacoco/core/coverage/framework/TestFrameworkStrategy.java`
#### Snippet
```java
	 */
	protected void setupTestRunnerEntryPoint() {
		EntryPoint.useOptionsFile = true;
		EntryPoint.coverageDetail = ParserOptions.CoverageTransformerDetail.DETAIL_COMPRESSED;
		EntryPoint.workingDirectory = new File(config.getWorkspace());
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `EntryPoint.coverageDetail` from instance context
in `src/main/java/fr/spoonlabs/flacoco/core/coverage/framework/TestFrameworkStrategy.java`
#### Snippet
```java
	protected void setupTestRunnerEntryPoint() {
		EntryPoint.useOptionsFile = true;
		EntryPoint.coverageDetail = ParserOptions.CoverageTransformerDetail.DETAIL_COMPRESSED;
		EntryPoint.workingDirectory = new File(config.getWorkspace());
		EntryPoint.verbose = config.isTestRunnerVerbose();
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `EntryPoint.workingDirectory` from instance context
in `src/main/java/fr/spoonlabs/flacoco/core/coverage/framework/TestFrameworkStrategy.java`
#### Snippet
```java
		EntryPoint.useOptionsFile = true;
		EntryPoint.coverageDetail = ParserOptions.CoverageTransformerDetail.DETAIL_COMPRESSED;
		EntryPoint.workingDirectory = new File(config.getWorkspace());
		EntryPoint.verbose = config.isTestRunnerVerbose();
		EntryPoint.timeoutInMs = config.getTestRunnerTimeoutInMs();
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `EntryPoint.verbose` from instance context
in `src/main/java/fr/spoonlabs/flacoco/core/coverage/framework/TestFrameworkStrategy.java`
#### Snippet
```java
		EntryPoint.coverageDetail = ParserOptions.CoverageTransformerDetail.DETAIL_COMPRESSED;
		EntryPoint.workingDirectory = new File(config.getWorkspace());
		EntryPoint.verbose = config.isTestRunnerVerbose();
		EntryPoint.timeoutInMs = config.getTestRunnerTimeoutInMs();
		EntryPoint.JVMArgs = config.getTestRunnerJVMArgs();
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `EntryPoint.timeoutInMs` from instance context
in `src/main/java/fr/spoonlabs/flacoco/core/coverage/framework/TestFrameworkStrategy.java`
#### Snippet
```java
		EntryPoint.workingDirectory = new File(config.getWorkspace());
		EntryPoint.verbose = config.isTestRunnerVerbose();
		EntryPoint.timeoutInMs = config.getTestRunnerTimeoutInMs();
		EntryPoint.JVMArgs = config.getTestRunnerJVMArgs();
		EntryPoint.jUnit5Mode = false;
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `EntryPoint.JVMArgs` from instance context
in `src/main/java/fr/spoonlabs/flacoco/core/coverage/framework/TestFrameworkStrategy.java`
#### Snippet
```java
		EntryPoint.verbose = config.isTestRunnerVerbose();
		EntryPoint.timeoutInMs = config.getTestRunnerTimeoutInMs();
		EntryPoint.JVMArgs = config.getTestRunnerJVMArgs();
		EntryPoint.jUnit5Mode = false;
		if (!config.getJacocoIncludes().isEmpty()) {
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `EntryPoint.jUnit5Mode` from instance context
in `src/main/java/fr/spoonlabs/flacoco/core/coverage/framework/TestFrameworkStrategy.java`
#### Snippet
```java
		EntryPoint.timeoutInMs = config.getTestRunnerTimeoutInMs();
		EntryPoint.JVMArgs = config.getTestRunnerJVMArgs();
		EntryPoint.jUnit5Mode = false;
		if (!config.getJacocoIncludes().isEmpty()) {
			EntryPoint.jacocoAgentIncludes =
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `EntryPoint.jacocoAgentIncludes` from instance context
in `src/main/java/fr/spoonlabs/flacoco/core/coverage/framework/TestFrameworkStrategy.java`
#### Snippet
```java
		EntryPoint.jUnit5Mode = false;
		if (!config.getJacocoIncludes().isEmpty()) {
			EntryPoint.jacocoAgentIncludes =
					config.getJacocoIncludes().stream().reduce((x, y) -> x + ":" + y).orElse("");
		} else {
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `EntryPoint.jacocoAgentIncludes` from instance context
in `src/main/java/fr/spoonlabs/flacoco/core/coverage/framework/TestFrameworkStrategy.java`
#### Snippet
```java
					config.getJacocoIncludes().stream().reduce((x, y) -> x + ":" + y).orElse("");
		} else {
			EntryPoint.jacocoAgentIncludes = this.computeJacocoIncludes();
		}
		if (!config.getJacocoIncludes().isEmpty()) {
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `EntryPoint.jacocoAgentExcludes` from instance context
in `src/main/java/fr/spoonlabs/flacoco/core/coverage/framework/TestFrameworkStrategy.java`
#### Snippet
```java
		}
		if (!config.getJacocoIncludes().isEmpty()) {
			EntryPoint.jacocoAgentExcludes =
					config.getJacocoExcludes().stream().reduce((x, y) -> x + ":" + y).orElse("");
		}
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `found` from instance context
in `src/main/java/fr/spoonlabs/flacoco/utils/spoon/SpoonBlockLocationsFinder.java`
#### Snippet
```java
        }

        found = bestFit;
    }
}
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `EntryPoint.jUnit5Mode` from instance context
in `src/main/java/fr/spoonlabs/flacoco/core/coverage/framework/JUnit5Strategy.java`
#### Snippet
```java

		// test-runner needs a flag for JUnit5 tests
		EntryPoint.jUnit5Mode = true;

		return EntryPoint.runOnlineCoveredTestResultPerTestMethods(
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `SpoonBlockLocationsFinder.fullyQualifiedClassName` from instance context
in `src/main/java/fr/spoonlabs/flacoco/utils/spoon/SpoonBlockInspector.java`
#### Snippet
```java

        // Process the source code to find the block of the given stack-trace element
        SpoonBlockLocationsFinder.fullyQualifiedClassName = element.getClassName();
        SpoonBlockLocationsFinder.lineNumber = element.getLineNumber();
        SpoonBlockLocationsFinder.found = null;
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `SpoonBlockLocationsFinder.lineNumber` from instance context
in `src/main/java/fr/spoonlabs/flacoco/utils/spoon/SpoonBlockInspector.java`
#### Snippet
```java
        // Process the source code to find the block of the given stack-trace element
        SpoonBlockLocationsFinder.fullyQualifiedClassName = element.getClassName();
        SpoonBlockLocationsFinder.lineNumber = element.getLineNumber();
        SpoonBlockLocationsFinder.found = null;
        launcher.process();
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `SpoonBlockLocationsFinder.found` from instance context
in `src/main/java/fr/spoonlabs/flacoco/utils/spoon/SpoonBlockInspector.java`
#### Snippet
```java
        SpoonBlockLocationsFinder.fullyQualifiedClassName = element.getClassName();
        SpoonBlockLocationsFinder.lineNumber = element.getLineNumber();
        SpoonBlockLocationsFinder.found = null;
        launcher.process();

```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `SpoonBlockLocationsFinder.found` from instance context
in `src/main/java/fr/spoonlabs/flacoco/utils/spoon/SpoonBlockInspector.java`
#### Snippet
```java

        // Clean results
        SpoonBlockLocationsFinder.found = null;

        return locations;
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `found` from instance context
in `src/main/java/fr/spoonlabs/flacoco/utils/spoon/SpoonLocalizedFaultFinder.java`
#### Snippet
```java
	public void process(CtType<?> ctType) {
		List<CtStatement> result = ctType.filterChildren(new SpoonLineFilter(lineNumber)).list();
		found = filterResult(result);
	}

```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `SpoonLocalizedFaultFinder.fullyQualifiedClassName` from instance context
in `src/main/java/fr/spoonlabs/flacoco/utils/spoon/SpoonConverter.java`
#### Snippet
```java
		for (Location location : original.keySet()) {
			// Compute location information
			SpoonLocalizedFaultFinder.fullyQualifiedClassName = location.getClassName();
			SpoonLocalizedFaultFinder.lineNumber = location.getLineNumber();
			SpoonLocalizedFaultFinder.found = null;
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `SpoonLocalizedFaultFinder.lineNumber` from instance context
in `src/main/java/fr/spoonlabs/flacoco/utils/spoon/SpoonConverter.java`
#### Snippet
```java
			// Compute location information
			SpoonLocalizedFaultFinder.fullyQualifiedClassName = location.getClassName();
			SpoonLocalizedFaultFinder.lineNumber = location.getLineNumber();
			SpoonLocalizedFaultFinder.found = null;

```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `SpoonLocalizedFaultFinder.found` from instance context
in `src/main/java/fr/spoonlabs/flacoco/utils/spoon/SpoonConverter.java`
#### Snippet
```java
			SpoonLocalizedFaultFinder.fullyQualifiedClassName = location.getClassName();
			SpoonLocalizedFaultFinder.lineNumber = location.getLineNumber();
			SpoonLocalizedFaultFinder.found = null;

			// Launch processor to find the top-most CtStatement of the given line
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `SpoonLocalizedFaultFinder.found` from instance context
in `src/main/java/fr/spoonlabs/flacoco/utils/spoon/SpoonConverter.java`
#### Snippet
```java

			// Prepare for next key
			SpoonLocalizedFaultFinder.found = null;
		}

```

## RuleId[ruleID=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\/` in RegExp
in `src/main/java/ch/scheitlin/alex/java/StackTraceParser.java`
#### Snippet
```java
    // group 7: null | string
    private static String LINE_SEPARATOR_REGEX = "\\r?\\n|\\r";
    private static String STACK_TRACE_LINE_REGEX = "^\\tat (?:((?:[\\d\\w]*\\.)*[\\d\\w]*)\\/)?((?:(?:[\\d\\w]*\\.)*[\\d\\w]*))\\.([\\d\\w\\$]*)\\.([\\d\\w\\$]*)\\((?:(?:([\\d\\w]*\\.java):(\\d*))|([\\d\\w\\s]*))\\)$";
    private static Pattern STACK_TRACE_LINE_PATTERN = Pattern.compile(STACK_TRACE_LINE_REGEX);

```

### RegExpRedundantEscape
Redundant character escape `\\$` in RegExp
in `src/main/java/ch/scheitlin/alex/java/StackTraceParser.java`
#### Snippet
```java
    // group 7: null | string
    private static String LINE_SEPARATOR_REGEX = "\\r?\\n|\\r";
    private static String STACK_TRACE_LINE_REGEX = "^\\tat (?:((?:[\\d\\w]*\\.)*[\\d\\w]*)\\/)?((?:(?:[\\d\\w]*\\.)*[\\d\\w]*))\\.([\\d\\w\\$]*)\\.([\\d\\w\\$]*)\\((?:(?:([\\d\\w]*\\.java):(\\d*))|([\\d\\w\\s]*))\\)$";
    private static Pattern STACK_TRACE_LINE_PATTERN = Pattern.compile(STACK_TRACE_LINE_REGEX);

```

### RegExpRedundantEscape
Redundant character escape `\\$` in RegExp
in `src/main/java/ch/scheitlin/alex/java/StackTraceParser.java`
#### Snippet
```java
    // group 7: null | string
    private static String LINE_SEPARATOR_REGEX = "\\r?\\n|\\r";
    private static String STACK_TRACE_LINE_REGEX = "^\\tat (?:((?:[\\d\\w]*\\.)*[\\d\\w]*)\\/)?((?:(?:[\\d\\w]*\\.)*[\\d\\w]*))\\.([\\d\\w\\$]*)\\.([\\d\\w\\$]*)\\((?:(?:([\\d\\w]*\\.java):(\\d*))|([\\d\\w\\s]*))\\)$";
    private static Pattern STACK_TRACE_LINE_PATTERN = Pattern.compile(STACK_TRACE_LINE_REGEX);

```

## RuleId[ruleID=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/fr/spoonlabs/flacoco/cli/FlacocoMain.java`
#### Snippet
```java

	@Option(names = {"--includeZeros"}, description = "Flag for including lines with a suspiciousness sore of 0.", defaultValue = "false")
	boolean includeZeros = false;

	@Option(names = {"--complianceLevel"}, description = "Compliance level for Spoon. Default value is 8", defaultValue = "8")
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/fr/spoonlabs/flacoco/cli/FlacocoMain.java`
#### Snippet
```java

	@Option(names = {"--coverTest"}, description = "Indicates if coverage must also cover the tests.", defaultValue = "false")
	boolean coverTest = false;

	@Option(names = {"--testRunnerVerbose"}, description = "Test-runner verbose mode.", defaultValue = "false")
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/fr/spoonlabs/flacoco/cli/FlacocoMain.java`
#### Snippet
```java

	@Option(names = {"--testRunnerJVMArgs"}, description = "JVM args for test-runner's test execution VMs.")
	String testRunnerJVMArgs = null;

	@Option(names = {"--threshold"}, description = "Threshold for suspiciousness score. Flacoco will only return suspicious results with score >= threshold. Results with a score of 0 are only included if the -includeZeros flag is set.", defaultValue = "0.0")
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/fr/spoonlabs/flacoco/cli/FlacocoMain.java`
#### Snippet
```java

	@Option(names = {"--testRunnerVerbose"}, description = "Test-runner verbose mode.", defaultValue = "false")
	boolean testRunnerVerbose = false;

	@Option(names = {"--testRunnerTimeoutInMs"}, description = "Timeout for each test execution with test-runner. Must be greater than 0. Default value is 1000000", defaultValue = "1000000")
```

### RedundantFieldInitialization
Field initialization to `0.0` is redundant
in `src/main/java/fr/spoonlabs/flacoco/cli/FlacocoMain.java`
#### Snippet
```java

	@Option(names = {"--threshold"}, description = "Threshold for suspiciousness score. Flacoco will only return suspicious results with score >= threshold. Results with a score of 0 are only included if the -includeZeros flag is set.", defaultValue = "0.0")
	double threshold = 0.0;

	@Option(names = {"--includeZeros"}, description = "Flag for including lines with a suspiciousness sore of 0.", defaultValue = "false")
```

## RuleId[ruleID=KeySetIterationMayUseEntrySet]
### KeySetIterationMayUseEntrySet
Iteration over `original.keySet()` may be replaced with 'entrySet()' iteration
in `src/main/java/fr/spoonlabs/flacoco/utils/spoon/SpoonConverter.java`
#### Snippet
```java
		Map<Location, CtStatement> mapping = new HashMap<>();
		Map<Location, Suspiciousness> original = flacocoResult.getDefaultSuspiciousnessMap();
		for (Location location : original.keySet()) {
			// Compute location information
			SpoonLocalizedFaultFinder.fullyQualifiedClassName = location.getClassName();
```

## RuleId[ruleID=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2022-11-29-11-15-03.040.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[ruleID=ReturnNull]
### ReturnNull
Return of `null`
in `src/main/java/fr/spoonlabs/flacoco/api/Flacoco.java`
#### Snippet
```java
				return new SpectrumRunner(config);
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `src/main/java/fr/spoonlabs/flacoco/cli/FlacocoMain.java`
#### Snippet
```java
				default:
					// should never happen as the argument is parsed by picocli
					return null;
			}
		} else {
```

## RuleId[ruleID=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/fr/spoonlabs/flacoco/core/test/strategies/classloader/ClassloaderStrategy.java`
#### Snippet
```java
            }
        }
        return urls.toArray(new URL[0]);
    }
}
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/fr/spoonlabs/flacoco/core/test/strategies/classloader/finder/classes/impl/SourceFolderFinder.java`
#### Snippet
```java
    @Override
    public String[] getClasses() {
        return getClassesLoc(new File(srcFolder)).toArray(new String[0]);
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/fr/spoonlabs/flacoco/core/test/strategies/classloader/finder/classes/impl/ClassloaderFinder.java`
#### Snippet
```java
            classes.addAll(SourceFolderFinder.getClassesLoc(new File(url.getPath())));
        }
        return classes.toArray(new String[0]);
    }

```

## RuleId[ruleID=RegExpUnnecessaryNonCapturingGroup]
### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:(?:[\\d\\w]*\\.)*[\\d\\w]*)`
in `src/main/java/ch/scheitlin/alex/java/StackTraceParser.java`
#### Snippet
```java
    // group 7: null | string
    private static String LINE_SEPARATOR_REGEX = "\\r?\\n|\\r";
    private static String STACK_TRACE_LINE_REGEX = "^\\tat (?:((?:[\\d\\w]*\\.)*[\\d\\w]*)\\/)?((?:(?:[\\d\\w]*\\.)*[\\d\\w]*))\\.([\\d\\w\\$]*)\\.([\\d\\w\\$]*)\\((?:(?:([\\d\\w]*\\.java):(\\d*))|([\\d\\w\\s]*))\\)$";
    private static Pattern STACK_TRACE_LINE_PATTERN = Pattern.compile(STACK_TRACE_LINE_REGEX);

```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:([\\d\\w]*\\.java):(\\d*))`
in `src/main/java/ch/scheitlin/alex/java/StackTraceParser.java`
#### Snippet
```java
    // group 7: null | string
    private static String LINE_SEPARATOR_REGEX = "\\r?\\n|\\r";
    private static String STACK_TRACE_LINE_REGEX = "^\\tat (?:((?:[\\d\\w]*\\.)*[\\d\\w]*)\\/)?((?:(?:[\\d\\w]*\\.)*[\\d\\w]*))\\.([\\d\\w\\$]*)\\.([\\d\\w\\$]*)\\((?:(?:([\\d\\w]*\\.java):(\\d*))|([\\d\\w\\s]*))\\)$";
    private static Pattern STACK_TRACE_LINE_PATTERN = Pattern.compile(STACK_TRACE_LINE_REGEX);

```

## RuleId[ruleID=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/ch/scheitlin/alex/java/StackTraceParser.java`
#### Snippet
```java

                // check whether the parsed stack trace element corresponds to the original one
                if (!("\tat " + element.toString()).equals(lines[i])) {
                    throw new Exception("ERROR: Stack trace line could not be parsed to StackTraceElement:\n" +
                            "\tOriginal stack trace line:\t" + lines[i] + "\n" +
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/ch/scheitlin/alex/java/StackTraceParser.java`
#### Snippet
```java
                    throw new Exception("ERROR: Stack trace line could not be parsed to StackTraceElement:\n" +
                            "\tOriginal stack trace line:\t" + lines[i] + "\n" +
                            "\tParsed StackTraceElement:\t" + "\tat " + element.toString());
                }

```

## RuleId[ruleID=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends TestMethod`
in `src/main/java/fr/spoonlabs/flacoco/core/test/TestContext.java`
#### Snippet
```java
	}

	public void addTestMethods(Collection<TestMethod> testMethodCollection) {
		this.testMethods.addAll(testMethodCollection);
	}
```

### BoundedWildcard
Can generalize to `? extends TestContext`
in `src/main/java/fr/spoonlabs/flacoco/core/coverage/CoverageRunner.java`
#### Snippet
```java
	}

	public CoverageMatrix getCoverageMatrix(List<TestContext> testContexts) {
		// This matrix stores the results: the execution of tests and the coverage of
		// that execution on each line
```

### BoundedWildcard
Can generalize to `? extends CtStatement`
in `src/main/java/fr/spoonlabs/flacoco/utils/spoon/SpoonLocalizedFaultFinder.java`
#### Snippet
```java
	 * @return The best-fit CtStatement
	 */
	private CtStatement filterResult(List<CtStatement> list) {
		CtStatement bestFit = null;
		SourcePosition curPos = null;
```

## RuleId[ruleID=UnusedAssignment]
### UnusedAssignment
Variable `clazz` initializer `null` is redundant
in `src/main/java/fr/spoonlabs/flacoco/core/test/strategies/classloader/finder/Processor.java`
#### Snippet
```java
                        testMethods.addAll(tester.acceptClass(clazz));
                    } catch (ClassNotFoundException | IllegalAccessError cnfe2) {
                        Class<?> clazz = null;
                        try {
                            clazz = Class.forName(className, false, ((ClassloaderFinder) finder).urlClassloader);
```

## RuleId[ruleID=ConstantValue]
### ConstantValue
Condition `!nrExecuted` is always `true` when reached
in `src/main/java/fr/spoonlabs/flacoco/localization/spectrum/SpectrumSuspiciousComputation.java`
#### Snippet
```java
				} else if (!iTestPassing && nrExecuted) {
					testsFailingExecuting.add(testMethod);
				} else if (iTestPassing && !nrExecuted) {
					nrTestPassingNotExecuting++;
				} else if (!iTestPassing && !nrExecuted) {
```

### ConstantValue
Value `nrExecuted` is always 'false'
in `src/main/java/fr/spoonlabs/flacoco/localization/spectrum/SpectrumSuspiciousComputation.java`
#### Snippet
```java
				} else if (!iTestPassing && nrExecuted) {
					testsFailingExecuting.add(testMethod);
				} else if (iTestPassing && !nrExecuted) {
					nrTestPassingNotExecuting++;
				} else if (!iTestPassing && !nrExecuted) {
```

### ConstantValue
Condition `!iTestPassing` is always `true`
in `src/main/java/fr/spoonlabs/flacoco/localization/spectrum/SpectrumSuspiciousComputation.java`
#### Snippet
```java
				} else if (iTestPassing && !nrExecuted) {
					nrTestPassingNotExecuting++;
				} else if (!iTestPassing && !nrExecuted) {
					nrTestFailingNotExecuting++;
				}
```

### ConstantValue
Condition `!iTestPassing && !nrExecuted` is always `true`
in `src/main/java/fr/spoonlabs/flacoco/localization/spectrum/SpectrumSuspiciousComputation.java`
#### Snippet
```java
				} else if (iTestPassing && !nrExecuted) {
					nrTestPassingNotExecuting++;
				} else if (!iTestPassing && !nrExecuted) {
					nrTestFailingNotExecuting++;
				}
```

### ConstantValue
Value `iTestPassing` is always 'false'
in `src/main/java/fr/spoonlabs/flacoco/localization/spectrum/SpectrumSuspiciousComputation.java`
#### Snippet
```java
				} else if (iTestPassing && !nrExecuted) {
					nrTestPassingNotExecuting++;
				} else if (!iTestPassing && !nrExecuted) {
					nrTestFailingNotExecuting++;
				}
```

### ConstantValue
Condition `!nrExecuted` is always `true` when reached
in `src/main/java/fr/spoonlabs/flacoco/localization/spectrum/SpectrumSuspiciousComputation.java`
#### Snippet
```java
				} else if (iTestPassing && !nrExecuted) {
					nrTestPassingNotExecuting++;
				} else if (!iTestPassing && !nrExecuted) {
					nrTestFailingNotExecuting++;
				}
```

### ConstantValue
Value `nrExecuted` is always 'false'
in `src/main/java/fr/spoonlabs/flacoco/localization/spectrum/SpectrumSuspiciousComputation.java`
#### Snippet
```java
				} else if (iTestPassing && !nrExecuted) {
					nrTestPassingNotExecuting++;
				} else if (!iTestPassing && !nrExecuted) {
					nrTestFailingNotExecuting++;
				}
```

## RuleId[ruleID=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/fr/spoonlabs/flacoco/cli/FlacocoMain.java`
#### Snippet
```java
			launcher.addInputResource(this.formatOption.customExporter);
			CtClass<FlacocoExporter> exporterClass = (CtClass<FlacocoExporter>) launcher.buildModel().getAllTypes()
					.stream().findFirst().get();

			return exporterClass.newInstance();
```

## RuleId[ruleID=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.createNewFile()` is ignored
in `src/main/java/fr/spoonlabs/flacoco/cli/FlacocoMain.java`
#### Snippet
```java
			File file = new File("flacoco_results." + exporter.extension());
			if (!file.exists()) {
				file.createNewFile();
			}
			return new OutputStreamWriter(new FileOutputStream(file));
```

### IgnoreResultOfCall
Result of `File.createNewFile()` is ignored
in `src/main/java/fr/spoonlabs/flacoco/cli/FlacocoMain.java`
#### Snippet
```java
			File file = new File(this.output);
			if (!file.exists()) {
				file.createNewFile();
			}
			return new OutputStreamWriter(new FileOutputStream(file));
```

## RuleId[ruleID=UnnecessaryBoxing]
### UnnecessaryBoxing
Redundant boxing, `Integer.parseInt()` call can be used instead
in `src/main/java/ch/scheitlin/alex/java/StackTraceParser.java`
#### Snippet
```java
                int lineNumber = -1;
                if (matcher.group(6) != null) {
                    lineNumber = Integer.valueOf(matcher.group(6));
                }

```

