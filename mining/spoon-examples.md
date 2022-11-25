# spoon-examples 
 
# Bad smells
I found 97 bad smells with 10 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| SystemOutErr | 15 | false |
| UNUSED_IMPORT | 13 | false |
| ThrowablePrintStackTrace | 8 | false |
| UtilityClassWithoutPrivateConstructor | 6 | true |
| IgnoreResultOfCall | 5 | false |
| DynamicRegexReplaceableByCompiledPattern | 5 | false |
| ReturnNull | 5 | false |
| BoundedWildcard | 4 | false |
| DataFlowIssue | 3 | false |
| ObsoleteCollection | 3 | false |
| RedundantSuppression | 3 | false |
| UnnecessaryFullyQualifiedName | 3 | false |
| IOResource | 2 | false |
| KeySetIterationMayUseEntrySet | 2 | false |
| UnnecessaryToStringCall | 2 | true |
| DefaultAnnotationParam | 2 | false |
| NestedAssignment | 2 | false |
| MismatchedCollectionQueryUpdate | 2 | false |
| SimplifyStreamApiCallChains | 1 | false |
| CommentedOutCode | 1 | false |
| LongLiteralsEndingWithLowercaseL | 1 | false |
| CatchMayIgnoreException | 1 | false |
| AnonymousHasLambdaAlternative | 1 | false |
| StringEqualsEmptyString | 1 | false |
| UnusedLabel | 1 | true |
| SamePackageImport | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| UnnecessaryLocalVariable | 1 | true |
| BusyWait | 1 | false |
| UnusedAssignment | 1 | false |
## RuleId[ruleID=IOResource]
### IOResource
'URLClassLoader' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `src/main/java/fr/inria/gforge/spoon/assertgenerator/test/TestRunner.java`
#### Snippet
```java

    public static List<Failure> runTest(String fullQualifiedName, String testCaseName, String[] classpath) throws MalformedURLException, ClassNotFoundException {
        ClassLoader classLoader = new URLClassLoader(
                arrayStringToArrayUrl.apply(classpath),
                ClassLoader.getSystemClassLoader()
```

### IOResource
'URLClassLoader' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `src/main/java/fr/inria/gforge/spoon/assertgenerator/test/TestRunner.java`
#### Snippet
```java

    public static List<Failure> runTest(String fullQualifiedName, String[] classpath) throws MalformedURLException, ClassNotFoundException {
        ClassLoader classLoader = new URLClassLoader(
                arrayStringToArrayUrl.apply(classpath),
                ClassLoader.getSystemClassLoader()
```

## RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `TestUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/fr/inria/gforge/spoon/transformation/spoonerism/TestUtils.java`
#### Snippet
```java
package fr.inria.gforge.spoon.transformation.spoonerism;

public class TestUtils {
    public static String STANDARD = "standard";
}
```

### UtilityClassWithoutPrivateConstructor
Class `TestRunner` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/fr/inria/gforge/spoon/assertgenerator/test/TestRunner.java`
#### Snippet
```java
 * on 23/05/17
 */
public class TestRunner {

    private static Function<String[], URL[]> arrayStringToArrayUrl = (arrayStr) ->
```

### UtilityClassWithoutPrivateConstructor
Class `Util` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/fr/inria/gforge/spoon/assertgenerator/Util.java`
#### Snippet
```java
 * on 26/06/17
 */
public class Util {


```

### UtilityClassWithoutPrivateConstructor
Class `Logger` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/fr/inria/gforge/spoon/assertgenerator/Logger.java`
#### Snippet
```java
 * on 21/06/17
 */
public class Logger {

	public static Map<String, Object> observations = new HashMap<>();
```

### UtilityClassWithoutPrivateConstructor
Class `IOUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/fr/inria/gforge/spoon/utils/IOUtils.java`
#### Snippet
```java
 * Created by nicolas on 22/01/2015.
 */
public class IOUtils {
	/**
	 * The default buffer size to use.
```

### UtilityClassWithoutPrivateConstructor
Class `Manager` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/fr/inria/gforge/spoon/transformation/spoonerism/Manager.java`
#### Snippet
```java
 * Great to fit on a slide and to execute via ide.
 */
public class Manager {
    public static void main(String[] args) {
        new Spoonerism()
```

## RuleId[ruleID=DataFlowIssue]
### DataFlowIssue
Method invocation `toLowerCase` will produce `NullPointerException`
in `src/main/java/fr/inria/gforge/spoon/transformation/retry/TestClass.java`
#### Snippet
```java
		result.add(System.currentTimeMillis());
		String nullObject = null;
		nullObject.toLowerCase();
	}
}
```

### DataFlowIssue
Dereference of `dest.listFiles()` may produce `NullPointerException`
in `src/main/java/fr/inria/gforge/spoon/utils/TestSpooner.java`
#### Snippet
```java
	public TestSpooner print(File dest) throws Exception {
		dest.mkdirs();
		for (File file : dest.listFiles()) {
			file.delete();
		}
```

### DataFlowIssue
Method invocation `close` may produce `NullPointerException`
in `src/main/java/fr/inria/gforge/spoon/transformation/dbaccess/template/DBCodeTemplate.java`
#### Snippet
```java
        } finally {
            try {
                s.close();
            } catch (Exception ex13) {
                ex13.printStackTrace();
```

## RuleId[ruleID=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `src/main/java/fr/inria/gforge/spoon/assertgenerator/AssertionGenerationTest.java`
#### Snippet
```java
			// Analyze
			Map<CtMethod, List<CtLocalVariable>> localVariablesPerTestMethod = analyzer.analyze(ctClass);
			localVariablesPerTestMethod.keySet().stream().forEach(key -> System.out.println("{"+ key.getParent(CtClass.class).getSimpleName() + "#" + key.getSimpleName() + "=["+ localVariablesPerTestMethod.get(key) +"]"));
			if (!localVariablesPerTestMethod.isEmpty()) {
				// Collect
```

## RuleId[ruleID=CommentedOutCode]
### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/fr/inria/gforge/spoon/analysis/APILauncherExampleTest.java`
#### Snippet
```java
        launcher.getEnvironment().setNoClasspath(true);
        // optional
        // launcher.getEnvironment().setSourceClasspath(
        //        "lib1.jar:lib2.jar".split(":"));
        launcher.getEnvironment().setComplianceLevel(7);
```

## RuleId[ruleID=ObsoleteCollection]
### ObsoleteCollection
Obsolete collection type `Stack` used
in `src/main/java/fr/inria/gforge/spoon/analysis/ReferenceProcessor.java`
#### Snippet
```java
	Set<CtPackageReference> scanned = new HashSet<>();

	void scanDependencies(Stack<CtPackageReference> path) {
		CtPackageReference ref = path.peek();
		// return if already scanned
```

### ObsoleteCollection
Obsolete collection type `Stack` used
in `src/main/java/fr/inria/gforge/spoon/analysis/ReferenceProcessor.java`
#### Snippet
```java
	public void processingDone() {
		for (CtPackageReference p : packRefs.keySet()) {
			Stack<CtPackageReference> path = new Stack<>();
			path.push(p);
			scanDependencies(path);
```

### ObsoleteCollection
Obsolete collection type `Stack<>` used
in `src/main/java/fr/inria/gforge/spoon/analysis/ReferenceProcessor.java`
#### Snippet
```java
	public void processingDone() {
		for (CtPackageReference p : packRefs.keySet()) {
			Stack<CtPackageReference> path = new Stack<>();
			path.push(p);
			scanDependencies(path);
```

## RuleId[ruleID=LongLiteralsEndingWithLowercaseL]
### LongLiteralsEndingWithLowercaseL
'long' literal `50l` ends with lowercase 'l'
in `src/main/java/fr/inria/gforge/spoon/transformation/retry/RetryOnFailure.java`
#### Snippet
```java
	 * Delay between attempts, in time units.
	 */
	long delay() default 50l;

	/**
```

## RuleId[ruleID=KeySetIterationMayUseEntrySet]
### KeySetIterationMayUseEntrySet
Iteration over `localVariablesPerTestMethod.keySet()` may be replaced with 'Map.forEach()' iteration
in `src/main/java/fr/inria/gforge/spoon/assertgenerator/AssertionGenerationTest.java`
#### Snippet
```java
			if (!localVariablesPerTestMethod.isEmpty()) {
				// Collect
				localVariablesPerTestMethod.keySet().forEach(ctMethod -> collector.collect(launcher, ctMethod, localVariablesPerTestMethod.get(ctMethod)));
				// Generate
				localVariablesPerTestMethod.keySet().forEach(ctMethod -> assertionAdder.addAssertion(ctMethod, localVariablesPerTestMethod.get(ctMethod)));
```

### KeySetIterationMayUseEntrySet
Iteration over `localVariablesPerTestMethod.keySet()` may be replaced with 'Map.forEach()' iteration
in `src/main/java/fr/inria/gforge/spoon/assertgenerator/AssertionGenerationTest.java`
#### Snippet
```java
				localVariablesPerTestMethod.keySet().forEach(ctMethod -> collector.collect(launcher, ctMethod, localVariablesPerTestMethod.get(ctMethod)));
				// Generate
				localVariablesPerTestMethod.keySet().forEach(ctMethod -> assertionAdder.addAssertion(ctMethod, localVariablesPerTestMethod.get(ctMethod)));
			}
		});
```

## RuleId[ruleID=CatchMayIgnoreException]
### CatchMayIgnoreException
Empty `catch` block
in `src/main/java/fr/inria/gforge/spoon/transformation/retry/template/RetryTemplate.java`
#### Snippet
```java
				try {
					Thread.sleep(_delay_);
				} catch (InterruptedException ex2) {
				}
			}
```

## RuleId[ruleID=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/fr/inria/gforge/spoon/transformation/OnTheFlyTransfoTest.java`
#### Snippet
```java

	  // compiling and testing the initial class
	  Class<?> fooClass = InMemoryJavaCompiler.newInstance().compile(foo.getQualifiedName(), "package "+foo.getPackage().getQualifiedName()+";"+foo.toString());
	  IFoo x = (IFoo) fooClass.newInstance();
	  // testing its behavior
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/fr/inria/gforge/spoon/transformation/OnTheFlyTransfoTest.java`
#### Snippet
```java
	  
	  // compiling and testing the transformed class
	  fooClass = InMemoryJavaCompiler.newInstance().compile(foo.getQualifiedName(), "package "+foo.getPackage().getQualifiedName()+";"+foo.toString());
	  IFoo y = (IFoo) fooClass.newInstance();
	  // testing its behavior with subtraction
```

## RuleId[ruleID=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/fr/inria/gforge/spoon/transformation/mutation/MutationTester.java`
#### Snippet
```java

	/** applies the test driver of this mutation tester on each mutant instance */
	public void runTestsOnEachMutantInstance(List<T> mutantInstances) throws Exception {
		// now we run the mutants against the test class
		for (T t : mutantInstances) {
```

### BoundedWildcard
Can generalize to `? extends CtClass`
in `src/main/java/fr/inria/gforge/spoon/transformation/mutation/MutationTester.java`
#### Snippet
```java

	/** compiles the mutants on the fly */
	public List<Class<?>> compileMutants(List<CtClass> mutants) throws Exception {
		List<Class<?>> compiledMutants = new ArrayList<>();
		for (CtClass mutantClass : mutants) {
```

### BoundedWildcard
Can generalize to `? extends CtLocalVariable`
in `src/main/java/fr/inria/gforge/spoon/assertgenerator/workflow/AssertionAdder.java`
#### Snippet
```java

	@SuppressWarnings("unchecked")
	public void addAssertion(CtMethod<?> testMethod, List<CtLocalVariable> ctLocalVariables) {
		ctLocalVariables.forEach(ctLocalVariable -> this.addAssertion(testMethod, ctLocalVariable));
		System.out.println(testMethod);
```

### BoundedWildcard
Can generalize to `? extends CtLocalVariable`
in `src/main/java/fr/inria/gforge/spoon/assertgenerator/workflow/Collector.java`
#### Snippet
```java

	@SuppressWarnings("unchecked")
	public void instrument(CtMethod<?> testMethod, List<CtLocalVariable> ctLocalVariables) {
		ctLocalVariables.forEach(ctLocalVariable -> this.instrument(testMethod, ctLocalVariable));
	}
```

## RuleId[ruleID=AnonymousHasLambdaAlternative]
### AnonymousHasLambdaAlternative
Anonymous new Thread() can be replaced with new Thread(() -\> {...})
in `src/main/java/fr/inria/gforge/spoon/assertgenerator/AssertionGenerationTest.java`
#### Snippet
```java
			}
			Process p = Runtime.getRuntime().exec(cmd);
			new Thread() {
				@Override
				public void run() {
```

## RuleId[ruleID=StringEqualsEmptyString]
### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `src/main/java/fr/inria/gforge/spoon/analysis/DocProcessor.java`
#### Snippet
```java
			if (modifiers.contains(PUBLIC) || modifiers.contains(PROTECTED)) {
				String docComment = element.getDocComment();
				if (docComment == null || docComment.equals("")) {
					System.out.println("undocumented element at " + element.getPosition());
					undocumentedElements.add(element);
```

## RuleId[ruleID=UnusedLabel]
### UnusedLabel
Unused label `printing`
in `src/main/java/fr/inria/gforge/spoon/utils/TestSpoonCompiler.java`
#### Snippet
```java

			List<File> printedFiles = new ArrayList<>();
			printing:
			for (spoon.reflect.cu.CompilationUnit cu : getFactory().CompilationUnit()
					.getMap().values()) {
```

## RuleId[ruleID=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `src/main/java/fr/inria/gforge/spoon/assertgenerator/workflow/AssertionAdder.java`
#### Snippet
```java

	@SuppressWarnings("unchecked")
	public void addAssertion(CtMethod<?> testMethod, List<CtLocalVariable> ctLocalVariables) {
		ctLocalVariables.forEach(ctLocalVariable -> this.addAssertion(testMethod, ctLocalVariable));
		System.out.println(testMethod);
```

### RedundantSuppression
Redundant suppression
in `src/main/java/fr/inria/gforge/spoon/assertgenerator/workflow/AssertionAdder.java`
#### Snippet
```java

	@SuppressWarnings("unchecked")
	void addAssertion(CtMethod testMethod, CtLocalVariable localVariable) {
		List<CtMethod> getters =
				getGetters(localVariable);
```

### RedundantSuppression
Redundant suppression
in `src/main/java/fr/inria/gforge/spoon/assertgenerator/workflow/Collector.java`
#### Snippet
```java

	@SuppressWarnings("unchecked")
	public void instrument(CtMethod<?> testMethod, List<CtLocalVariable> ctLocalVariables) {
		ctLocalVariables.forEach(ctLocalVariable -> this.instrument(testMethod, ctLocalVariable));
	}
```

## RuleId[ruleID=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `String.toLowerCase()` is ignored
in `src/main/java/fr/inria/gforge/spoon/transformation/retry/TestClass.java`
#### Snippet
```java
		result.add(System.currentTimeMillis());
		String nullObject = null;
		nullObject.toLowerCase();
	}
}
```

### IgnoreResultOfCall
Result of `File.createNewFile()` is ignored
in `src/main/java/fr/inria/gforge/spoon/utils/TestSpoonCompiler.java`
#### Snippet
```java
						+ File.separatorChar + element.getSimpleName()
						+ DefaultJavaPrettyPrinter.JAVA_FILE_EXTENSION);
				file.createNewFile();

				// the path must be given relatively to to the working directory
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `src/main/java/fr/inria/gforge/spoon/utils/TestSpooner.java`
#### Snippet
```java

	public TestSpooner print(File dest) throws Exception {
		dest.mkdirs();
		for (File file : dest.listFiles()) {
			file.delete();
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `src/main/java/fr/inria/gforge/spoon/utils/TestSpooner.java`
#### Snippet
```java
		dest.mkdirs();
		for (File file : dest.listFiles()) {
			file.delete();
		}

```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `src/main/java/fr/inria/gforge/spoon/assertgenerator/AssertionGenerationTest.java`
#### Snippet
```java
				classpath = buffer.lines().collect(Collectors.joining(System.getProperty("path.separator")));
			}
			file.delete();
			return classpath.split(System.getProperty("path.separator"));
		} catch (IOException | InterruptedException e) {
```

## RuleId[ruleID=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/gforge/spoon/analysis/PatternTest.java`
#### Snippet
```java
			assertEquals(1, matches.size());
			for (Match m : matches) {
				System.out.println(m.getMatchingElement().getPosition());
			}
		}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/gforge/spoon/analysis/PatternTest.java`
#### Snippet
```java
			List<Match> matches3 = t3.getMatches(spoon.getModel().getRootPackage());
			for (Match m : matches3) {
				System.out.println(m.getMatchingElement().getPosition());
			}
			// note that the one called "d" also matches!
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/gforge/spoon/transformation/mutation/MutationTester.java`
#### Snippet
```java
				throw new MutantNotKilledException();
			} catch (AssertionError expected) {
				System.out.println("mutant killed!");
			}
		}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/gforge/spoon/transformation/spoonerism/SecondTest.java`
#### Snippet
```java
        StrangeFixture f = new StrangeFixture();
        String name = f.getClass().getSimpleName().toLowerCase(Locale.ROOT);
        System.out.println(name);
        return name;
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/gforge/spoon/HelloWorldProcessor.java`
#### Snippet
```java
	@Override
	public void process() {
		System.out.println(getFactory().Class().get(getClass().getCanonicalName()).getField("msg").getDefaultExpression());
	}

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/gforge/spoon/utils/TestSpooner.java`
#### Snippet
```java
	public boolean compile() {
		File target = compiler.getSourceOutputDirectory();
		final boolean compile = Main.compile(new String[]{"-1.7 " , "-proc:none", target.toString()}, new PrintWriter(System.out), new PrintWriter(System.out),null);
		return compile;
	}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/gforge/spoon/utils/TestSpooner.java`
#### Snippet
```java
	public boolean compile() {
		File target = compiler.getSourceOutputDirectory();
		final boolean compile = Main.compile(new String[]{"-1.7 " , "-proc:none", target.toString()}, new PrintWriter(System.out), new PrintWriter(System.out),null);
		return compile;
	}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/gforge/spoon/analysis/DocProcessor.java`
#### Snippet
```java
				String docComment = element.getDocComment();
				if (docComment == null || docComment.equals("")) {
					System.out.println("undocumented element at " + element.getPosition());
					undocumentedElements.add(element);
				}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/gforge/spoon/transformation/OnTheFlyTransfoTest.java`
#### Snippet
```java
	  assertEquals(1, y.m());
	  
	  System.out.println("yes y.m()="+y.m());
  }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/gforge/spoon/transformation/bound/src/Main.java`
#### Snippet
```java
				new Main().m(i);
			} catch (RuntimeException e) {
				System.out.println(e.getMessage());
			}
		}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/gforge/spoon/transformation/bound/src/Main.java`
#### Snippet
```java

	public void m(@Bound(min = 2d, max = 8d) int a) {
		System.out.println("Great method!");
	}

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/gforge/spoon/assertgenerator/AssertionGenerationTest.java`
#### Snippet
```java
					while (p.isAlive()) {
						try {
							System.out.print((char) p.getInputStream().read());
						} catch (IOException e) {
							e.printStackTrace();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/gforge/spoon/assertgenerator/AssertionGenerationTest.java`
#### Snippet
```java
			// Analyze
			Map<CtMethod, List<CtLocalVariable>> localVariablesPerTestMethod = analyzer.analyze(ctClass);
			localVariablesPerTestMethod.keySet().stream().forEach(key -> System.out.println("{"+ key.getParent(CtClass.class).getSimpleName() + "#" + key.getSimpleName() + "=["+ localVariablesPerTestMethod.get(key) +"]"));
			if (!localVariablesPerTestMethod.isEmpty()) {
				// Collect
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/gforge/spoon/assertgenerator/workflow/AssertionAdder.java`
#### Snippet
```java
	public void addAssertion(CtMethod<?> testMethod, List<CtLocalVariable> ctLocalVariables) {
		ctLocalVariables.forEach(ctLocalVariable -> this.addAssertion(testMethod, ctLocalVariable));
		System.out.println(testMethod);
	}

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/gforge/spoon/assertgenerator/workflow/Collector.java`
#### Snippet
```java
		instrument(clone, localVariables);
		testClass.addMethod(clone);
		System.out.println(clone);
		run(launcher, testClass, clone);
		testClass.removeMethod(clone);
```

## RuleId[ruleID=DefaultAnnotationParam]
### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/main/java/fr/inria/gforge/spoon/transformation/retry/TestClass.java`
#### Snippet
```java
	private Collection<Long> result = new ArrayList<>();

	@RetryOnFailure(attempts = 3, delay = 10, verbose = false)
	public void retry() {
		result.add(System.currentTimeMillis());
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/main/java/fr/inria/gforge/spoon/transformation/retry/TestClass.java`
#### Snippet
```java
	private Collection<Long> result = new ArrayList<>();

	@RetryOnFailure(attempts = 3, delay = 10, verbose = false)
	public void retry() {
		result.add(System.currentTimeMillis());
```

## RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/fr/inria/gforge/spoon/utils/SpoonClassLoader.java`
#### Snippet
```java
	public Class loadClass(String name) throws ClassNotFoundException {
		try {
			File file = new File(directory, name.replaceAll("\\.", "/") + ".class");

			if (!file.exists()) {
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/fr/inria/gforge/spoon/transformation/spoonerism/Spoonerism.java`
#### Snippet
```java
        String qualifiedName = firstClass.getPackage().getQualifiedName();
        List<String> commonComponents = Arrays.asList(
                qualifiedName.split("[.]"));
        // For all the testing classes find the common subsequence of package names
        for (CtClass<?> ctClass: testingClasses) {
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/fr/inria/gforge/spoon/transformation/spoonerism/Spoonerism.java`
#### Snippet
```java
        for (CtClass<?> ctClass: testingClasses) {
            List<String> currentComponents = Arrays.asList(
                    ctClass.getPackage().getQualifiedName().split("[.]"));
            int max = Math.min(currentComponents.size(), commonComponents.size());
            for (int i = 0; i < max; i++ ) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/fr/inria/gforge/spoon/transformation/retry/RetryTest.java`
#### Snippet
```java
	public void setUp() throws Exception {
		spooner = new TestSpooner()
				.addSource(new File("src/main/java/" + TEST_CLASS.replaceAll("\\.", "/") + ".java"))
				.addTemplate(
						new File("src/main/java/" + RetryTemplate.class.getName().replaceAll("\\.", "/") + ".java"));
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/fr/inria/gforge/spoon/transformation/retry/RetryTest.java`
#### Snippet
```java
				.addSource(new File("src/main/java/" + TEST_CLASS.replaceAll("\\.", "/") + ".java"))
				.addTemplate(
						new File("src/main/java/" + RetryTemplate.class.getName().replaceAll("\\.", "/") + ".java"));
	}

```

## RuleId[ruleID=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `spoon.reflect.cu` is unnecessary, and can be replaced with an import
in `src/main/java/fr/inria/gforge/spoon/utils/TestSpoonCompiler.java`
#### Snippet
```java
			List<File> printedFiles = new ArrayList<>();
			printing:
			for (spoon.reflect.cu.CompilationUnit cu : getFactory().CompilationUnit()
					.getMap().values()) {

```

### UnnecessaryFullyQualifiedName
Qualifier `spoon.reflect.factory` is unnecessary, and can be replaced with an import
in `src/main/java/fr/inria/gforge/spoon/utils/TestSpooner.java`
#### Snippet
```java
	}

	spoon.reflect.factory.Factory getFactory() {
		return compiler.getFactory();
	}
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary and can be removed
in `src/main/java/fr/inria/gforge/spoon/transformation/dbaccess/template/DBCodeTemplate.java`
#### Snippet
```java
            rs.first();
            return rs.getString(1);
        } catch (java.sql.SQLException ex12) {
            ex12.printStackTrace();
        } finally {
```

## RuleId[ruleID=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import spoon.reflect.declaration.CtNamedElement;`
in `src/main/java/fr/inria/gforge/spoon/analysis/DocProcessor.java`
#### Snippet
```java
import spoon.reflect.declaration.CtField;
import spoon.reflect.declaration.CtModifiable;
import spoon.reflect.declaration.CtNamedElement;

import java.util.ArrayList;
```

### UNUSED_IMPORT
Unused import `import spoon.pattern.Quantifier;`
in `src/main/java/fr/inria/gforge/spoon/analysis/PatternTest.java`
#### Snippet
```java
import spoon.pattern.Pattern;
import spoon.pattern.PatternBuilder;
import spoon.pattern.Quantifier;
import spoon.processing.ProcessingManager;
import spoon.reflect.code.CtStatement;
```

### UNUSED_IMPORT
Unused import `import spoon.processing.ProcessingManager;`
in `src/main/java/fr/inria/gforge/spoon/analysis/PatternTest.java`
#### Snippet
```java
import spoon.pattern.PatternBuilder;
import spoon.pattern.Quantifier;
import spoon.processing.ProcessingManager;
import spoon.reflect.code.CtStatement;
import spoon.reflect.declaration.CtElement;
```

### UNUSED_IMPORT
Unused import `import spoon.reflect.code.CtStatement;`
in `src/main/java/fr/inria/gforge/spoon/analysis/PatternTest.java`
#### Snippet
```java
import spoon.pattern.Quantifier;
import spoon.processing.ProcessingManager;
import spoon.reflect.code.CtStatement;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtMethod;
```

### UNUSED_IMPORT
Unused import `import spoon.reflect.declaration.CtElement;`
in `src/main/java/fr/inria/gforge/spoon/analysis/PatternTest.java`
#### Snippet
```java
import spoon.processing.ProcessingManager;
import spoon.reflect.code.CtStatement;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtType;
```

### UNUSED_IMPORT
Unused import `import spoon.reflect.path.CtRole;`
in `src/main/java/fr/inria/gforge/spoon/analysis/PatternTest.java`
#### Snippet
```java
import spoon.reflect.declaration.CtType;
import spoon.reflect.factory.Factory;
import spoon.reflect.path.CtRole;
import spoon.reflect.visitor.Filter;
import spoon.support.QueueProcessingManager;
```

### UNUSED_IMPORT
Unused import `import spoon.reflect.visitor.Filter;`
in `src/main/java/fr/inria/gforge/spoon/analysis/PatternTest.java`
#### Snippet
```java
import spoon.reflect.factory.Factory;
import spoon.reflect.path.CtRole;
import spoon.reflect.visitor.Filter;
import spoon.support.QueueProcessingManager;

```

### UNUSED_IMPORT
Unused import `import spoon.support.QueueProcessingManager;`
in `src/main/java/fr/inria/gforge/spoon/analysis/PatternTest.java`
#### Snippet
```java
import spoon.reflect.path.CtRole;
import spoon.reflect.visitor.Filter;
import spoon.support.QueueProcessingManager;

import java.util.List;
```

### UNUSED_IMPORT
Unused import `import static org.hamcrest.CoreMatchers.is;`
in `src/main/java/fr/inria/gforge/spoon/analysis/PatternTest.java`
#### Snippet
```java
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
```

### UNUSED_IMPORT
Unused import `import static org.junit.Assert.assertThat;`
in `src/main/java/fr/inria/gforge/spoon/analysis/PatternTest.java`
#### Snippet
```java
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

// Examples of Spoon patterns
```

### UNUSED_IMPORT
Unused import `import spoon.reflect.declaration.CtClass;`
in `src/main/java/fr/inria/gforge/spoon/analysis/QueryExampleTest.java`
#### Snippet
```java
import spoon.MavenLauncher;
import spoon.reflect.CtModel;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtPackage;
```

### UNUSED_IMPORT
Unused import `import spoon.reflect.declaration.CtClass;`
in `src/main/java/fr/inria/gforge/spoon/transformation/autologging/TracingTest.java`
#### Snippet
```java
import spoon.processing.AbstractProcessor;
import spoon.reflect.declaration.CtAnnotation;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.factory.Factory;
```

### UNUSED_IMPORT
Unused import `import spoon.reflect.factory.Factory;`
in `src/main/java/fr/inria/gforge/spoon/transformation/autologging/TracingTest.java`
#### Snippet
```java
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.factory.Factory;

import java.lang.annotation.Annotation;
```

## RuleId[ruleID=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `src/main/java/fr/inria/gforge/spoon/utils/IOUtils.java`
#### Snippet
```java
		long count = 0;
		int n = 0;
		while (-1 != (n = input.read(buffer))) {
			output.write(buffer, 0, n);
			count += n;
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/fr/inria/gforge/spoon/transformation/spoonerism/Spoonerism.java`
#### Snippet
```java
                        return true;
                    }
                } while ((current = current.getSuperclass()) != null);
                return false;
            }
```

## RuleId[ruleID=ThrowablePrintStackTrace]
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/gforge/spoon/transformation/retry/template/RetryTemplate.java`
#### Snippet
```java
				lastTh = ex;
				if (_verbose_) {
					ex.printStackTrace();
				}
				try {
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/gforge/spoon/utils/SpoonClassLoader.java`
#### Snippet
```java
			return defineClass(name, classData, 0, classData.length);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/gforge/spoon/utils/SpoonClassLoader.java`
#### Snippet
```java
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/gforge/spoon/transformation/dbaccess/template/DBCodeTemplate.java`
#### Snippet
```java
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return;
        }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/gforge/spoon/transformation/dbaccess/template/DBCodeTemplate.java`
#### Snippet
```java
            new Exception("failed to connect to the database with "
                    + "jdbc:postgresql:" + _database_ + "," + _username_ + ","
                    + _password_).printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/gforge/spoon/transformation/dbaccess/template/DBCodeTemplate.java`
#### Snippet
```java
            return rs.getString(1);
        } catch (java.sql.SQLException ex12) {
            ex12.printStackTrace();
        } finally {
            try {
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/gforge/spoon/transformation/dbaccess/template/DBCodeTemplate.java`
#### Snippet
```java
                s.close();
            } catch (Exception ex13) {
                ex13.printStackTrace();
            }
        }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/gforge/spoon/assertgenerator/AssertionGenerationTest.java`
#### Snippet
```java
							System.out.print((char) p.getInputStream().read());
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
```

## RuleId[ruleID=SamePackageImport]
### SamePackageImport
Unnecessary import from the same package `import fr.inria.gforge.spoon.analysis.CatchProcessor;`
in `src/main/java/fr/inria/gforge/spoon/analysis/CatchProcessorTest.java`
#### Snippet
```java
package fr.inria.gforge.spoon.analysis;

import fr.inria.gforge.spoon.analysis.CatchProcessor;
import org.junit.Test;
import spoon.Launcher;
```

## RuleId[ruleID=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `result` are updated, but never queried
in `src/main/java/fr/inria/gforge/spoon/transformation/retry/TestClass.java`
#### Snippet
```java
public class TestClass {

	private Collection<Long> result = new ArrayList<>();

	@RetryOnFailure(attempts = 3, delay = 10, verbose = false)
```

### MismatchedCollectionQueryUpdate
Contents of collection `testRun` are updated, but never queried
in `src/main/java/fr/inria/gforge/spoon/assertgenerator/test/TestListener.java`
#### Snippet
```java
class TestListener extends RunListener {

    private final List<Description> testRun = new ArrayList<>();
    private final List<Failure> testFails = new ArrayList<>();

```

## RuleId[ruleID=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2022-11-25-20-08-30.602.html`
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
in `src/main/java/fr/inria/gforge/spoon/transformation/dbaccess/src/Person.java`
#### Snippet
```java

    public String getLastName() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/fr/inria/gforge/spoon/transformation/dbaccess/src/Person.java`
#### Snippet
```java

    public String getFirstName() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/fr/inria/gforge/spoon/transformation/autologging/TracingTest.java`
#### Snippet
```java
                    }
                }
                return null;
            }
            @Override
```

### ReturnNull
Return of `null`
in `src/main/java/fr/inria/gforge/spoon/utils/SpoonClassLoader.java`
#### Snippet
```java
		}

		return null;
	}
}
```

### ReturnNull
Return of `null`
in `src/main/java/fr/inria/gforge/spoon/transformation/dbaccess/template/DBCodeTemplate.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

## RuleId[ruleID=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `compile` is redundant
in `src/main/java/fr/inria/gforge/spoon/utils/TestSpooner.java`
#### Snippet
```java
	public boolean compile() {
		File target = compiler.getSourceOutputDirectory();
		final boolean compile = Main.compile(new String[]{"-1.7 " , "-proc:none", target.toString()}, new PrintWriter(System.out), new PrintWriter(System.out),null);
		return compile;
	}
```

## RuleId[ruleID=BusyWait]
### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `src/main/java/fr/inria/gforge/spoon/transformation/retry/template/RetryTemplate.java`
#### Snippet
```java
				}
				try {
					Thread.sleep(_delay_);
				} catch (InterruptedException ex2) {
				}
```

## RuleId[ruleID=UnusedAssignment]
### UnusedAssignment
Variable `n` initializer `0` is redundant
in `src/main/java/fr/inria/gforge/spoon/utils/IOUtils.java`
#### Snippet
```java
		byte[] buffer = new byte[DEFAULT_BUFFER_SIZE];
		long count = 0;
		int n = 0;
		while (-1 != (n = input.read(buffer))) {
			output.write(buffer, 0, n);
```

