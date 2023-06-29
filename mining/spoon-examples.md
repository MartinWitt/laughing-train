# spoon-examples 
 
# Bad smells
I found 99 bad smells with 4 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UNCHECKED_WARNING | 26 | false |
| UNUSED_IMPORT | 13 | false |
| Deprecation | 11 | false |
| FieldMayBeFinal | 9 | false |
| IgnoreResultOfCall | 5 | false |
| ConfusingMainMethod | 5 | false |
| DataFlowIssue | 3 | false |
| DuplicatedCode | 2 | false |
| UnnecessaryToStringCall | 2 | true |
| RedundantTypeArguments | 2 | false |
| JavadocLinkAsPlainText | 2 | false |
| DefaultAnnotationParam | 2 | false |
| AutoCloseableResource | 2 | false |
| MismatchedCollectionQueryUpdate | 2 | false |
| NewClassNamingConvention | 2 | false |
| JavadocReference | 1 | false |
| SimplifyStreamApiCallChains | 1 | false |
| CommentedOutCode | 1 | false |
| LongLiteralsEndingWithLowercaseL | 1 | false |
| CatchMayIgnoreException | 1 | false |
| UnusedLabel | 1 | true |
| RedundantCast | 1 | false |
| JavadocDeclaration | 1 | false |
| UnnecessaryLocalVariable | 1 | true |
| BusyWait | 1 | false |
| UnusedAssignment | 1 | false |
## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked assignment: 'spoon.reflect.visitor.filter.TypeFilter' to 'spoon.reflect.visitor.Filter'
in `src/main/java/fr/inria/gforge/spoon/transformation/OnTheFlyTransfoTest.java`
#### Snippet
```java
	  // now we apply a transformation
	  // we replace "+" by "-"
	  for(Object e : foo.getElements(new TypeFilter(CtBinaryOperator.class))) {
		  CtBinaryOperator op = (CtBinaryOperator)e;
		  if (op.getKind()==BinaryOperatorKind.PLUS) {
```

### UNCHECKED_WARNING
Unchecked call to 'TypeFilter(Class)' as a member of raw type 'spoon.reflect.visitor.filter.TypeFilter'
in `src/main/java/fr/inria/gforge/spoon/transformation/OnTheFlyTransfoTest.java`
#### Snippet
```java
	  // now we apply a transformation
	  // we replace "+" by "-"
	  for(Object e : foo.getElements(new TypeFilter(CtBinaryOperator.class))) {
		  CtBinaryOperator op = (CtBinaryOperator)e;
		  if (op.getKind()==BinaryOperatorKind.PLUS) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'spoon.reflect.visitor.filter.TypeFilter' to 'spoon.reflect.visitor.Filter'
in `src/main/java/fr/inria/gforge/spoon/transformation/mutation/MutationTester.java`
#### Snippet
```java

		CtClass origClass = (CtClass) l.getFactory().Package().getRootPackage()
				.getElements(new TypeFilter(CtClass.class)).get(0);

		// now we apply a transformation
```

### UNCHECKED_WARNING
Unchecked call to 'TypeFilter(Class)' as a member of raw type 'spoon.reflect.visitor.filter.TypeFilter'
in `src/main/java/fr/inria/gforge/spoon/transformation/mutation/MutationTester.java`
#### Snippet
```java

		CtClass origClass = (CtClass) l.getFactory().Package().getRootPackage()
				.getElements(new TypeFilter(CtClass.class)).get(0);

		// now we apply a transformation
```

### UNCHECKED_WARNING
Unchecked call to 'process(E)' as a member of raw type 'spoon.processing.Processor'
in `src/main/java/fr/inria/gforge/spoon/transformation/mutation/MutationTester.java`
#### Snippet
```java
			
			// mutate the element
			mutator.process(op);
			
			// temporarily replacing the original AST node with the mutated element 
```

### UNCHECKED_WARNING
Unchecked call to 'isToBeProcessed(E)' as a member of raw type 'spoon.processing.Processor'
in `src/main/java/fr/inria/gforge/spoon/transformation/mutation/MutationTester.java`
#### Snippet
```java
			@Override
			public boolean matches(CtElement arg0) {
				return mutator.isToBeProcessed(arg0);
			}
		});
```

### UNCHECKED_WARNING
Unchecked call to 'test(T)' as a member of raw type 'fr.inria.gforge.spoon.transformation.mutation.TestDriver'
in `src/main/java/fr/inria/gforge/spoon/transformation/mutation/MutationTester.java`
#### Snippet
```java
		for (T t : mutantInstances) {
			try {
				testDriver.test(t);
				throw new MutantNotKilledException();
			} catch (AssertionError expected) {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'. Reason: 'mutantClass' has raw type, so result of newInstance is erased
in `src/main/java/fr/inria/gforge/spoon/transformation/mutation/MutationTester.java`
#### Snippet
```java
		// instantiating the mutant classes
		for (Class mutantClass : compiledMutants) {
			mutantInstances.add((T) mutantClass.newInstance());
		}
		return mutantInstances;
```

### UNCHECKED_WARNING
Unchecked assignment: 'spoon.reflect.reference.CtExecutableReference' to 'spoon.reflect.reference.CtExecutableReference'
in `src/main/java/fr/inria/gforge/spoon/assertgenerator/workflow/AssertionAdder.java`
#### Snippet
```java
		return factory.createInvocation(
				accessToAssert,
				assertEquals,
				parameters[0],
				parameters[1]
```

### UNCHECKED_WARNING
Unchecked call to 'apply(CtType)' as a member of raw type 'spoon.template.Template'
in `src/main/java/fr/inria/gforge/spoon/transformation/bound/processing/BoundTemplateProcessor.java`
#### Snippet
```java
		CtClass<?> type = e.getParent(CtClass.class);
		Template t = new BoundTemplate(getFactory().Type().createReference(Double.class), element.getSimpleName(), annotation.min(), annotation.max());
		final CtBlock apply = (CtBlock) t.apply(type);

		// Apply transformation.
```

### UNCHECKED_WARNING
Unchecked call to 'addMethod(CtMethod)' as a member of raw type 'spoon.reflect.declaration.CtType'
in `src/main/java/fr/inria/gforge/spoon/transformation/BasicTransfoExampleTest.java`
#### Snippet
```java
        aClass.setSimpleName("myNewName");
        CtMethod myMethod = factory.createMethod();
        aClass.addMethod(myMethod);
    }
}
```

### UNCHECKED_WARNING
Unchecked cast: 'spoon.reflect.declaration.CtCodeSnippet' to 'spoon.reflect.code.CtExpression'
in `src/main/java/fr/inria/gforge/spoon/transformation/bound/processing/BoundProcessor.java`
#### Snippet
```java
		anIf.setCondition(getFactory().Code().<Boolean>createCodeSnippetExpression(element.getSimpleName() + " < " + annotation.min()));
		CtThrow throwStmt = getFactory().Core().createThrow();
		throwStmt.setThrownExpression((CtExpression<? extends Throwable>) getFactory().Core().createCodeSnippetExpression().setValue("new RuntimeException(\"out of min bound (\" + " + element.getSimpleName() + " + \" < " + annotation.min() + "\")"));
		anIf.setThenStatement(throwStmt);
		parent.getBody().insertBegin(anIf);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.Set' to 'java.util.Set\>'. Reason: 'localVariable.getType().getDeclaration()' has raw type, so result of getMethods is erased
in `src/main/java/fr/inria/gforge/spoon/assertgenerator/Util.java`
#### Snippet
```java

	public static List<CtMethod> getGetters(CtLocalVariable localVariable) {
		return ((Set<CtMethod<?>>) localVariable.getType().getDeclaration().getMethods()).stream()
				.filter(method -> method.getParameters().isEmpty() &&
						method.getType() != localVariable.getFactory().Type().VOID_PRIMITIVE &&
```

### UNCHECKED_WARNING
Unchecked assignment: 'spoon.reflect.reference.CtLocalVariableReference' to 'spoon.reflect.reference.CtVariableReference'. Reason: 'localVariable' has raw type, so result of getReference is erased
in `src/main/java/fr/inria/gforge/spoon/assertgenerator/Util.java`
#### Snippet
```java
	public static CtInvocation invok(CtMethod method, CtLocalVariable localVariable) {
		final CtExecutableReference reference = method.getReference();
		final CtVariableAccess variableRead = method.getFactory().createVariableRead(localVariable.getReference(), false);
		return method.getFactory().createInvocation(variableRead, reference);
	}
```

### UNCHECKED_WARNING
Unchecked assignment: 'spoon.reflect.reference.CtExecutableReference' to 'spoon.reflect.reference.CtExecutableReference'
in `src/main/java/fr/inria/gforge/spoon/assertgenerator/Util.java`
#### Snippet
```java
		final CtExecutableReference reference = method.getReference();
		final CtVariableAccess variableRead = method.getFactory().createVariableRead(localVariable.getReference(), false);
		return method.getFactory().createInvocation(variableRead, reference);
	}

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'. Reason: 'testMethod' has raw type, so result of getElements is erased
in `src/main/java/fr/inria/gforge/spoon/assertgenerator/workflow/Analyzer.java`
#### Snippet
```java
					}
				};
		return testMethod.getElements(filterLocalVar);
	}

```

### UNCHECKED_WARNING
Unchecked assignment: 'spoon.reflect.visitor.filter.TypeFilter' to 'spoon.reflect.visitor.Filter'
in `src/main/java/fr/inria/gforge/spoon/assertgenerator/workflow/Analyzer.java`
#### Snippet
```java
					}
				};
		return testMethod.getElements(filterLocalVar);
	}

```

### UNCHECKED_WARNING
Unchecked call to 'TypeFilter(Class)' as a member of raw type 'spoon.reflect.visitor.filter.TypeFilter'
in `src/main/java/fr/inria/gforge/spoon/assertgenerator/workflow/Analyzer.java`
#### Snippet
```java
	List<CtLocalVariable> analyze(CtMethod testMethod) {
		TypeFilter filterLocalVar =
				new TypeFilter(CtLocalVariable.class) {
					public boolean matches(CtLocalVariable localVariable) {
						return !localVariable.getType().isPrimitive();
```

### UNCHECKED_WARNING
Unchecked call to 'removeMethod(CtMethod)' as a member of raw type 'spoon.reflect.declaration.CtType'
in `src/main/java/fr/inria/gforge/spoon/assertgenerator/workflow/Collector.java`
#### Snippet
```java
	public void collect(Launcher launcher, CtMethod<?> testMethod, List<CtLocalVariable> localVariables) {
		CtClass testClass = testMethod.getParent(CtClass.class);
		testClass.removeMethod(testMethod);
		CtMethod<?> clone = testMethod.clone();
		instrument(clone, localVariables);
```

### UNCHECKED_WARNING
Unchecked call to 'addMethod(CtMethod)' as a member of raw type 'spoon.reflect.declaration.CtType'
in `src/main/java/fr/inria/gforge/spoon/assertgenerator/workflow/Collector.java`
#### Snippet
```java
		CtMethod<?> clone = testMethod.clone();
		instrument(clone, localVariables);
		testClass.addMethod(clone);
		System.out.println(clone);
		run(launcher, testClass, clone);
```

### UNCHECKED_WARNING
Unchecked call to 'removeMethod(CtMethod)' as a member of raw type 'spoon.reflect.declaration.CtType'
in `src/main/java/fr/inria/gforge/spoon/assertgenerator/workflow/Collector.java`
#### Snippet
```java
		System.out.println(clone);
		run(launcher, testClass, clone);
		testClass.removeMethod(clone);
		testClass.addMethod(testMethod);
	}
```

### UNCHECKED_WARNING
Unchecked call to 'addMethod(CtMethod)' as a member of raw type 'spoon.reflect.declaration.CtType'
in `src/main/java/fr/inria/gforge/spoon/assertgenerator/workflow/Collector.java`
#### Snippet
```java
		run(launcher, testClass, clone);
		testClass.removeMethod(clone);
		testClass.addMethod(testMethod);
	}

```

### UNCHECKED_WARNING
Unchecked assignment: 'spoon.reflect.reference.CtExecutableReference' to 'spoon.reflect.reference.CtExecutableReference'
in `src/main/java/fr/inria/gforge/spoon/assertgenerator/workflow/Collector.java`
#### Snippet
```java
		return factory.createInvocation(
				accessToLogger,
				refObserve,
				factory.createLiteral(getKey(getter)),
				invocationToGetter
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `src/main/java/fr/inria/gforge/spoon/transformation/retry/RetryTest.java`
#### Snippet
```java
	@Test
	public void testRetry() throws Exception {
		spooner.process(RetryProcessor.class);
		spooner.print(new File("target/spooned"));
		Assert.assertTrue(spooner.compile());
```

### UNCHECKED_WARNING
Unchecked call to 'getMethod(String, Class...)' as a member of raw type 'java.lang.Class'
in `src/main/java/fr/inria/gforge/spoon/transformation/retry/RetryTest.java`
#### Snippet
```java
		Object instance = clz.newInstance();
		try {
			clz.getMethod("retry").invoke(instance);
			Assert.fail("retry method should always fail");
		} catch (ReflectiveOperationException | IllegalArgumentException | SecurityException ex) {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Collection'
in `src/main/java/fr/inria/gforge/spoon/transformation/retry/RetryTest.java`
#### Snippet
```java
		Field field = clz.getDeclaredField("result");
		field.setAccessible(true);
		Collection<Long> result = (Collection<Long>) field.get(instance);
		Assert.assertEquals(3, result.size());
	}
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `MutationTesterTest`
in `src/main/java/fr/inria/gforge/spoon/transformation/mutation/MutationTester.java`
#### Snippet
```java
/** mutates and kills mutants of type T.
 * 
 *  @See {@link MutationTesterTest} for an example usage
 */
public class MutationTester<T> {
```

## RuleId[id=DataFlowIssue]
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

## RuleId[id=SimplifyStreamApiCallChains]
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

## RuleId[id=CommentedOutCode]
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

## RuleId[id=LongLiteralsEndingWithLowercaseL]
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

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/gforge/spoon/assertgenerator/test/TestRunner.java`
#### Snippet
```java
        Runner runner = request.getRunner();
        RunNotifier fNotifier = new RunNotifier();
        final TestListener listener = new TestListener();
        fNotifier.addFirstListener(listener);
        fNotifier.fireTestRunStarted(runner.getDescription());
        runner.run(fNotifier);
        return listener.getTestFails();
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/gforge/spoon/transformation/bound/BoundTest.java`
#### Snippet
```java
		launcher.run();

		final CtType<Main> target = launcher.getFactory().Type().get(Main.class);
		final CtMethod<?> m = target.getMethodsByName("m").get(0);

		assertTrue(m.getBody().getStatements().size() >= 2);
		assertTrue(m.getBody().getStatement(0) instanceof CtIf);
		assertTrue(m.getBody().getStatement(1) instanceof CtIf);
```

## RuleId[id=CatchMayIgnoreException]
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

## RuleId[id=Deprecation]
### Deprecation
'spoon.reflect.cu.CompilationUnit' is deprecated
in `src/main/java/fr/inria/gforge/spoon/utils/TestSpoonCompiler.java`
#### Snippet
```java
			List<File> printedFiles = new ArrayList<>();
			printing:
			for (spoon.reflect.cu.CompilationUnit cu : getFactory().CompilationUnit()
					.getMap().values()) {

```

### Deprecation
'newInstance()' is deprecated
in `src/main/java/fr/inria/gforge/spoon/transformation/OnTheFlyTransfoTest.java`
#### Snippet
```java
	  // compiling and testing the initial class
	  Class<?> fooClass = InMemoryJavaCompiler.newInstance().compile(foo.getQualifiedName(), "package "+foo.getPackage().getQualifiedName()+";"+foo.toString());
	  IFoo x = (IFoo) fooClass.newInstance();
	  // testing its behavior
	  assertEquals(5, x.m());
```

### Deprecation
'newInstance()' is deprecated
in `src/main/java/fr/inria/gforge/spoon/transformation/OnTheFlyTransfoTest.java`
#### Snippet
```java
	  // compiling and testing the transformed class
	  fooClass = InMemoryJavaCompiler.newInstance().compile(foo.getQualifiedName(), "package "+foo.getPackage().getQualifiedName()+";"+foo.toString());
	  IFoo y = (IFoo) fooClass.newInstance();
	  // testing its behavior with subtraction
	  assertEquals(1, y.m());
```

### Deprecation
'assertThat(T, org.hamcrest.Matcher)' is deprecated
in `src/main/java/fr/inria/gforge/spoon/analysis/FactoryProcessorTest.java`
#### Snippet
```java
		final ProcessingManager processingManager = new QueueProcessingManager(factory);
		List<CtInterface> listFactoryItf = factory.getModel().getElements(new NamedElementFilter<>(CtInterface.class, "Factory"));
		assertThat(listFactoryItf.size(), is(1));

		final FactoryProcessor processor = new FactoryProcessor(listFactoryItf.get(0).getReference());
```

### Deprecation
'assertThat(T, org.hamcrest.Matcher)' is deprecated
in `src/main/java/fr/inria/gforge/spoon/analysis/FactoryProcessorTest.java`
#### Snippet
```java

		// implicit constructor is also counted
		assertThat(processor.listWrongUses.size(), is(2));
	}
}
```

### Deprecation
'newInstance()' is deprecated
in `src/main/java/fr/inria/gforge/spoon/transformation/mutation/MutationTester.java`
#### Snippet
```java
		// instantiating the mutant classes
		for (Class mutantClass : compiledMutants) {
			mutantInstances.add((T) mutantClass.newInstance());
		}
		return mutantInstances;
```

### Deprecation
'assertThat(T, org.hamcrest.Matcher)' is deprecated
in `src/main/java/fr/inria/gforge/spoon/analysis/DocProcessorTest.java`
#### Snippet
```java

		// implicit constructor is also counted
		assertThat(processor.undocumentedElements.size(), is(4));
	}
}
```

### Deprecation
'assertThat(T, org.hamcrest.Matcher)' is deprecated
in `src/main/java/fr/inria/gforge/spoon/analysis/EmptyMethodBodyProcessorTest.java`
#### Snippet
```java
		processingManager.process(factory.Class().getAll());

		assertThat(processor.emptyMethods.size(), is(4));
	}
}
```

### Deprecation
'assertThat(T, org.hamcrest.Matcher)' is deprecated
in `src/main/java/fr/inria/gforge/spoon/analysis/ReferenceProcessorTest.java`
#### Snippet
```java

		// implicit constructor is also counted
		assertThat(processor.circularPathes.size(), is(2));
	}
}
```

### Deprecation
'newInstance()' is deprecated
in `src/main/java/fr/inria/gforge/spoon/transformation/retry/RetryTest.java`
#### Snippet
```java

		Class clz = spooner.getSpoonedClass(TEST_CLASS);
		Object instance = clz.newInstance();
		try {
			clz.getMethod("retry").invoke(instance);
```

### Deprecation
'newInstance()' is deprecated
in `src/main/java/fr/inria/gforge/spoon/utils/TestSpooner.java`
#### Snippet
```java
		List<Processor<?>> processorsNames = new ArrayList<>();
		for (Class<? extends Processor> processor : processors) {
			processorsNames.add(processor.newInstance());
		}
		compiler.process(processorsNames);
```

## RuleId[id=UnnecessaryToStringCall]
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

## RuleId[id=RedundantTypeArguments]
### RedundantTypeArguments
Explicit type arguments can be inferred
in `src/main/java/fr/inria/gforge/spoon/transformation/bound/processing/BoundProcessor.java`
#### Snippet
```java
		// Build if check for min.
		CtIf anIf = getFactory().Core().createIf();
		anIf.setCondition(getFactory().Code().<Boolean>createCodeSnippetExpression(element.getSimpleName() + " < " + annotation.min()));
		CtThrow throwStmt = getFactory().Core().createThrow();
		throwStmt.setThrownExpression((CtExpression<? extends Throwable>) getFactory().Core().createCodeSnippetExpression().setValue("new RuntimeException(\"out of min bound (\" + " + element.getSimpleName() + " + \" < " + annotation.min() + "\")"));
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `src/main/java/fr/inria/gforge/spoon/transformation/bound/processing/BoundProcessor.java`
#### Snippet
```java
		// Build if check for max.
		anIf = getFactory().Core().createIf();
		anIf.setCondition(getFactory().Code().<Boolean>createCodeSnippetExpression(element.getSimpleName() + " > " + annotation.max()));
		anIf.setThenStatement(getFactory().Code().createCtThrow("new RuntimeException(\"out of max bound (\" + " + element.getSimpleName() + " + \" > " + annotation.max() + "\")"));
		parent.getBody().insertBegin(anIf);
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/fr/inria/gforge/spoon/transformation/autologging/LogProcessor.java`
#### Snippet
```java
 * $ java -jar spoon.jar -i src/main/java -o spooned -p fr.inria.gforge.spoon.transformation.autologging.LogProcessor
 *
 * Of with https://github.com/SpoonLabs/spoon-maven-plugin
 * 
 */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/fr/inria/gforge/spoon/transformation/retry/RetryOnFailure.java`
#### Snippet
```java
 * Annotation inspired by JCabi retry annotation.
 * 
 * http://aspects.jcabi.com/annotation-retryonfailure.html
 *
 * Created by Nicolas Petitprez on 22/01/2015.
```

## RuleId[id=UnusedLabel]
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

## RuleId[id=IgnoreResultOfCall]
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

## RuleId[id=DefaultAnnotationParam]
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

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'URLClassLoader' used without 'try'-with-resources statement
in `src/main/java/fr/inria/gforge/spoon/assertgenerator/test/TestRunner.java`
#### Snippet
```java

    public static List<Failure> runTest(String fullQualifiedName, String testCaseName, String[] classpath) throws MalformedURLException, ClassNotFoundException {
        ClassLoader classLoader = new URLClassLoader(
                arrayStringToArrayUrl.apply(classpath),
                ClassLoader.getSystemClassLoader()
```

### AutoCloseableResource
'URLClassLoader' used without 'try'-with-resources statement
in `src/main/java/fr/inria/gforge/spoon/assertgenerator/test/TestRunner.java`
#### Snippet
```java

    public static List<Failure> runTest(String fullQualifiedName, String[] classpath) throws MalformedURLException, ClassNotFoundException {
        ClassLoader classLoader = new URLClassLoader(
                arrayStringToArrayUrl.apply(classpath),
                ClassLoader.getSystemClassLoader()
```

## RuleId[id=UNUSED_IMPORT]
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

## RuleId[id=RedundantCast]
### RedundantCast
Casting `getFactory().Core().createCodeSnippetExpression().setValue(...)` to `CtExpression` is redundant
in `src/main/java/fr/inria/gforge/spoon/transformation/bound/processing/BoundProcessor.java`
#### Snippet
```java
		anIf.setCondition(getFactory().Code().<Boolean>createCodeSnippetExpression(element.getSimpleName() + " < " + annotation.min()));
		CtThrow throwStmt = getFactory().Core().createThrow();
		throwStmt.setThrownExpression((CtExpression<? extends Throwable>) getFactory().Core().createCodeSnippetExpression().setValue("new RuntimeException(\"out of min bound (\" + " + element.getSimpleName() + " + \" < " + annotation.min() + "\")"));
		anIf.setThenStatement(throwStmt);
		parent.getBody().insertBegin(anIf);
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
Wrong tag `See`
in `src/main/java/fr/inria/gforge/spoon/transformation/mutation/MutationTester.java`
#### Snippet
```java
/** mutates and kills mutants of type T.
 * 
 *  @See {@link MutationTesterTest} for an example usage
 */
public class MutationTester<T> {
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `factoryTypeRef` may be 'final'
in `src/main/java/fr/inria/gforge/spoon/analysis/FactoryProcessor.java`
#### Snippet
```java

	public List<CtConstructorCall> listWrongUses = new ArrayList<>();
	private CtTypeReference factoryTypeRef;

	public FactoryProcessor(CtTypeReference factoryTypeRef) {
```

### FieldMayBeFinal
Field `mutator` may be 'final'
in `src/main/java/fr/inria/gforge/spoon/transformation/mutation/MutationTester.java`
#### Snippet
```java
	private TestDriver testDriver;
	/** mutation operator */
	private Processor mutator;
	
	/** the produced mutants */
```

### FieldMayBeFinal
Field `sourceCodeToBeMutated` may be 'final'
in `src/main/java/fr/inria/gforge/spoon/transformation/mutation/MutationTester.java`
#### Snippet
```java

	/** the content of the Java source code file to be mutated */
	private String sourceCodeToBeMutated;
	/** responsible for killing the mutants */
	private TestDriver testDriver;
```

### FieldMayBeFinal
Field `testDriver` may be 'final'
in `src/main/java/fr/inria/gforge/spoon/transformation/mutation/MutationTester.java`
#### Snippet
```java
	private String sourceCodeToBeMutated;
	/** responsible for killing the mutants */
	private TestDriver testDriver;
	/** mutation operator */
	private Processor mutator;
```

### FieldMayBeFinal
Field `factory` may be 'final'
in `src/main/java/fr/inria/gforge/spoon/assertgenerator/workflow/AssertionAdder.java`
#### Snippet
```java
public class AssertionAdder {

	private Factory factory;

	public AssertionAdder(Factory factory) {
```

### FieldMayBeFinal
Field `arrayStringToArrayUrl` may be 'final'
in `src/main/java/fr/inria/gforge/spoon/assertgenerator/test/TestRunner.java`
#### Snippet
```java
public class TestRunner {

    private static Function<String[], URL[]> arrayStringToArrayUrl = (arrayStr) ->
            Arrays.stream(arrayStr)
                    .map(File::new)
```

### FieldMayBeFinal
Field `result` may be 'final'
in `src/main/java/fr/inria/gforge/spoon/transformation/retry/TestClass.java`
#### Snippet
```java
public class TestClass {

	private Collection<Long> result = new ArrayList<>();

	@RetryOnFailure(attempts = 3, delay = 10, verbose = false)
```

### FieldMayBeFinal
Field `factory` may be 'final'
in `src/main/java/fr/inria/gforge/spoon/assertgenerator/workflow/Collector.java`
#### Snippet
```java
public class Collector {

	private Factory factory;

	public Collector(Factory factory) {
```

### FieldMayBeFinal
Field `ignoredTypes` may be 'final'
in `src/main/java/fr/inria/gforge/spoon/analysis/ReferenceProcessor.java`
#### Snippet
```java
public class ReferenceProcessor extends AbstractProcessor<CtPackage> {

	private List<CtTypeReference<?>> ignoredTypes = new ArrayList<>();
	public List<List<CtPackageReference>> circularPathes = new ArrayList<>();

```

## RuleId[id=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `testRun` are updated, but never queried
in `src/main/java/fr/inria/gforge/spoon/assertgenerator/test/TestListener.java`
#### Snippet
```java
class TestListener extends RunListener {

    private final List<Description> testRun = new ArrayList<>();
    private final List<Failure> testFails = new ArrayList<>();

```

### MismatchedCollectionQueryUpdate
Contents of collection `result` are updated, but never queried
in `src/main/java/fr/inria/gforge/spoon/transformation/retry/TestClass.java`
#### Snippet
```java
public class TestClass {

	private Collection<Long> result = new ArrayList<>();

	@RetryOnFailure(attempts = 3, delay = 10, verbose = false)
```

## RuleId[id=UnnecessaryLocalVariable]
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

## RuleId[id=NewClassNamingConvention]
### NewClassNamingConvention
Test class name `ExistingBase` doesn't match regex '\[A-Z\]\[A-Za-z\\d\]\*Test(s\|Case)?\|Test\[A-Z\]\[A-Za-z\\d\]\*\|IT(.\*)\|(.\*)IT(Case)?'
in `src/main/java/fr/inria/gforge/spoon/transformation/spoonerism/ExistingBase.java`
#### Snippet
```java
import static org.junit.Assert.assertEquals;

public class ExistingBase {
    @Test
    public void test() {
```

### NewClassNamingConvention
Test class name `Bug123BeGone` doesn't match regex '\[A-Z\]\[A-Za-z\\d\]\*Test(s\|Case)?\|Test\[A-Z\]\[A-Za-z\\d\]\*\|IT(.\*)\|(.\*)IT(Case)?'
in `src/main/java/fr/inria/gforge/spoon/transformation/spoonerism/Bug123BeGone.java`
#### Snippet
```java
import static org.junit.Assert.assertEquals;

public class Bug123BeGone {
    @Test
    public void test() {
```

## RuleId[id=ConfusingMainMethod]
### ConfusingMainMethod
Method `main()` does not have signature 'public static void main(String\[\])'
in `src/main/java/fr/inria/gforge/spoon/analysis/APILauncherExampleTest.java`
#### Snippet
```java
public class APILauncherExampleTest {
    @Test
    public void main() {
        Launcher launcher = new Launcher();
        launcher.addInputResource("src/test/resources/src");
```

### ConfusingMainMethod
Method `main()` does not have signature 'public static void main(String\[\])'
in `src/main/java/fr/inria/gforge/spoon/analysis/MavenLauncherExampleTest.java`
#### Snippet
```java
public class MavenLauncherExampleTest {
    @Test
    public void main() {
        MavenLauncher launcher = new MavenLauncher(
                "./src/test/resources/project/",
```

### ConfusingMainMethod
Method `main()` does not have signature 'public static void main(String\[\])'
in `src/main/java/fr/inria/gforge/spoon/transformation/autologging/TracingTest.java`
#### Snippet
```java
public class TracingTest {
    @Test
    public void main() {

        Launcher spoon = new Launcher();
```

### ConfusingMainMethod
Method `main()` does not have signature 'public static void main(String\[\])'
in `src/main/java/fr/inria/gforge/spoon/transformation/BasicTransfoExampleTest.java`
#### Snippet
```java
public class BasicTransfoExampleTest {
    @Test
    public void main() {
        Launcher launcher = new Launcher();

```

### ConfusingMainMethod
Method `main()` does not have signature 'public static void main(String\[\])'
in `src/main/java/fr/inria/gforge/spoon/transformation/apichecking/ProcessorMainTest.java`
#### Snippet
```java
public class ProcessorMainTest {
    @Test
    public void main() {
        String projectPath = ".";

```

## RuleId[id=BusyWait]
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

## RuleId[id=UnusedAssignment]
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

