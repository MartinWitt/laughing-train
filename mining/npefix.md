# npefix 
 
# Bad smells
I found 645 bad smells with 227 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryModifier | 185 | true |
| SystemOutErr | 87 | false |
| RedundantFieldInitialization | 32 | false |
| ThrowablePrintStackTrace | 32 | false |
| AssignmentToMethodParameter | 22 | false |
| ZeroLengthArrayInitialization | 20 | false |
| AssignmentToStaticFieldFromInstanceMethod | 18 | false |
| BoundedWildcard | 16 | false |
| DataFlowIssue | 16 | false |
| ConstantValue | 15 | false |
| UtilityClassWithoutPrivateConstructor | 15 | true |
| UnnecessaryFullyQualifiedName | 13 | false |
| SizeReplaceableByIsEmpty | 11 | true |
| UnusedAssignment | 10 | false |
| TrivialStringConcatenation | 9 | false |
| IgnoreResultOfCall | 9 | false |
| CommentedOutCode | 7 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 7 | false |
| AccessStaticViaInstance | 6 | false |
| InstanceofCatchParameter | 6 | false |
| StringConcatenationInsideStringBufferAppend | 6 | false |
| ReturnNull | 6 | false |
| StaticCallOnSubclass | 5 | false |
| DynamicRegexReplaceableByCompiledPattern | 5 | false |
| Convert2Lambda | 5 | false |
| UnnecessaryLocalVariable | 5 | true |
| NestedAssignment | 4 | false |
| UnnecessaryContinue | 4 | false |
| ObsoleteCollection | 3 | false |
| KeySetIterationMayUseEntrySet | 3 | false |
| StringOperationCanBeSimplified | 3 | false |
| NonProtectedConstructorInAbstractClass | 3 | true |
| UseBulkOperation | 3 | false |
| ToArrayCallWithZeroLengthArrayArgument | 2 | true |
| EmptyStatementBody | 2 | false |
| WhileCanBeForeach | 2 | false |
| BooleanConstructor | 2 | false |
| AbstractClassNeverImplemented | 2 | false |
| RedundantMethodOverride | 2 | false |
| EmptyMethod | 2 | false |
| EqualsAndHashcode | 2 | false |
| IOResource | 2 | false |
| RedundantCollectionOperation | 2 | false |
| CatchMayIgnoreException | 2 | false |
| InnerClassMayBeStatic | 2 | true |
| SuspiciousMethodCalls | 2 | false |
| ComparatorMethodParameterNotUsed | 2 | false |
| PointlessBooleanExpression | 2 | true |
| EmptyFinallyBlock | 1 | false |
| NonShortCircuitBoolean | 1 | false |
| MissortedModifiers | 1 | false |
| IfStatementMissingBreakInLoop | 1 | false |
| ThrowablePrintedToSystemOut | 1 | false |
| UNUSED_IMPORT | 1 | false |
| ReplaceAssignmentWithOperatorAssignment | 1 | false |
| RedundantImplements | 1 | false |
| ExceptionNameDoesntEndWithException | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| NonFinalFieldOfException | 1 | false |
| CastConflictsWithInstanceof | 1 | false |
| ManualArrayToCollectionCopy | 1 | false |
| UnnecessarySemicolon | 1 | false |
| ProtectedMemberInFinalClass | 1 | true |
| ThreadRun | 1 | false |
| UnnecessaryToStringCall | 1 | true |
| WrongPackageStatement | 1 | false |
| RedundantSuppression | 1 | false |
| ImplicitArrayToString | 1 | false |
| ReplaceNullCheck | 1 | false |
| TestCaseWithConstructor | 1 | false |
| CaughtExceptionImmediatelyRethrown | 1 | false |
| RedundantFileCreation | 1 | false |
## RuleId[ruleID=ToArrayCallWithZeroLengthArrayArgument]
### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[tests.size()\]'
in `src/main/java/utils/TestClassesFinder.java`
#### Snippet
```java
            }
        }
        return tests.toArray(new String[tests.size()]);
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[dependencies.size()\]'
in `src/evaluation/java/fr/inria/spirals/npefix/resi/BenchmarkPaper.java`
#### Snippet
```java
        }
        dependencies.addAll(Arrays.asList(deps));
        URLClassLoader urlClassLoader = Launcher.getUrlClassLoader(dependencies.toArray(new String[dependencies.size()]));

        String[] testsString = new TestClassesFinder().findIn(urlClassLoader, false);
```

## RuleId[ruleID=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/utils/sacha/interfaces/IGeneralToJava.java`
#### Snippet
```java
public interface IGeneralToJava {

	public void changeToJava();

}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/utils/sacha/project/utils/IMavenMerger.java`
#### Snippet
```java
public interface IMavenMerger {

	public void merge();

}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String STATIC_CONTEXT = "bcornu.resi.context.StaticContext";
		public static final String CONSTRUCTOR_CONTEXT = "bcornu.resi.context.ConstructorContext";
		public static final String METHODE_CONTEXT = MethodContext.class.getCanonicalName();
		public static final String FAKE_INITIALIZER = "bcornu.resi.utils.FakeInitializer";
		public static final String THROW_MANAGER = "bcornu.resi.context.ThrowManager";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String STATIC_CONTEXT = "bcornu.resi.context.StaticContext";
		public static final String CONSTRUCTOR_CONTEXT = "bcornu.resi.context.ConstructorContext";
		public static final String METHODE_CONTEXT = MethodContext.class.getCanonicalName();
		public static final String FAKE_INITIALIZER = "bcornu.resi.utils.FakeInitializer";
		public static final String THROW_MANAGER = "bcornu.resi.context.ThrowManager";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String STATIC_CONTEXT = "bcornu.resi.context.StaticContext";
		public static final String CONSTRUCTOR_CONTEXT = "bcornu.resi.context.ConstructorContext";
		public static final String METHODE_CONTEXT = MethodContext.class.getCanonicalName();
		public static final String FAKE_INITIALIZER = "bcornu.resi.utils.FakeInitializer";
		public static final String THROW_MANAGER = "bcornu.resi.context.ThrowManager";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String TRY_CONTEXT_CATCH_THROWS = "catchThrows";
		public static final String TRY_CONTEXT_CATCH_END = "catchEnd";
		public static final String TRY_CONTEXT_CATCH_COMPUTE = "catchCompute";
		public static final String TRY_CONTEXT_FINALLY_START = "finallyStart";
		public static final String TRY_CONTEXT_FINALLY_THROWS = "finallyThrows";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String TRY_CONTEXT_CATCH_THROWS = "catchThrows";
		public static final String TRY_CONTEXT_CATCH_END = "catchEnd";
		public static final String TRY_CONTEXT_CATCH_COMPUTE = "catchCompute";
		public static final String TRY_CONTEXT_FINALLY_START = "finallyStart";
		public static final String TRY_CONTEXT_FINALLY_THROWS = "finallyThrows";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String TRY_CONTEXT_CATCH_THROWS = "catchThrows";
		public static final String TRY_CONTEXT_CATCH_END = "catchEnd";
		public static final String TRY_CONTEXT_CATCH_COMPUTE = "catchCompute";
		public static final String TRY_CONTEXT_FINALLY_START = "finallyStart";
		public static final String TRY_CONTEXT_FINALLY_THROWS = "finallyThrows";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String TRY_CONTEXT_ALL_THROWS = "allThrows";
	}
	public interface Var{
		public static final String DEFAULT_THROWABLE = "_bcornu_t";
		public static final String TRY_CONTEXT_PREFIX = "_bcornu_try_context_";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
public interface IConstants{
	public interface Class {
		public static final String THROWABLE = "java.lang.Throwable";

		public static final String SUBMARINE_EXCEPTION = "bcornu.resi.exception.SubMarineException";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
public interface IConstants{
	public interface Class {
		public static final String THROWABLE = "java.lang.Throwable";

		public static final String SUBMARINE_EXCEPTION = "bcornu.resi.exception.SubMarineException";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
public interface IConstants{
	public interface Class {
		public static final String THROWABLE = "java.lang.Throwable";

		public static final String SUBMARINE_EXCEPTION = "bcornu.resi.exception.SubMarineException";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String METHODE_CONTEXT = "_bcornu_methode_context";
		public static final String CONSTRUCTOR_CONTEXT = "_bcornu_constructor_context";
		public static final String THROW_CONTEXT = "_bcornu_throw_context";
	}
	
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String METHODE_CONTEXT = "_bcornu_methode_context";
		public static final String CONSTRUCTOR_CONTEXT = "_bcornu_constructor_context";
		public static final String THROW_CONTEXT = "_bcornu_throw_context";
	}
	
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String METHODE_CONTEXT = "_bcornu_methode_context";
		public static final String CONSTRUCTOR_CONTEXT = "_bcornu_constructor_context";
		public static final String THROW_CONTEXT = "_bcornu_throw_context";
	}
	
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String TRY_CONTEXT_FINALLY_COMPUTE = "finallyCompute";
		public static final String FAKE_INITIALIZER_INITALIZE = "initialize";
		public static final String TRY_CONTEXT_ALL_THROWS = "allThrows";
	}
	public interface Var{
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String TRY_CONTEXT_FINALLY_COMPUTE = "finallyCompute";
		public static final String FAKE_INITIALIZER_INITALIZE = "initialize";
		public static final String TRY_CONTEXT_ALL_THROWS = "allThrows";
	}
	public interface Var{
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String TRY_CONTEXT_FINALLY_COMPUTE = "finallyCompute";
		public static final String FAKE_INITIALIZER_INITALIZE = "initialize";
		public static final String TRY_CONTEXT_ALL_THROWS = "allThrows";
	}
	public interface Var{
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String TRY_CONTEXT_COMPUTE_ALL = "computeAll";
		public static final String TRY_CONTEXT_TRY_START = "tryStart";
		public static final String TRY_CONTEXT_TRY_THROWS = "tryThrows";
		public static final String TRY_CONTEXT_TRY_END = "tryEnd";
		public static final String TRY_CONTEXT_TRY_COMPUTE = "tryCompute";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String TRY_CONTEXT_COMPUTE_ALL = "computeAll";
		public static final String TRY_CONTEXT_TRY_START = "tryStart";
		public static final String TRY_CONTEXT_TRY_THROWS = "tryThrows";
		public static final String TRY_CONTEXT_TRY_END = "tryEnd";
		public static final String TRY_CONTEXT_TRY_COMPUTE = "tryCompute";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String TRY_CONTEXT_COMPUTE_ALL = "computeAll";
		public static final String TRY_CONTEXT_TRY_START = "tryStart";
		public static final String TRY_CONTEXT_TRY_THROWS = "tryThrows";
		public static final String TRY_CONTEXT_TRY_END = "tryEnd";
		public static final String TRY_CONTEXT_TRY_COMPUTE = "tryCompute";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String TRY_CONTEXT_FINALLY_THROWS = "finallyThrows";
		public static final String TRY_CONTEXT_FINALLY_END = "finallyEnd";
		public static final String TRY_CONTEXT_FINALLY_COMPUTE = "finallyCompute";
		public static final String FAKE_INITIALIZER_INITALIZE = "initialize";
		public static final String TRY_CONTEXT_ALL_THROWS = "allThrows";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String TRY_CONTEXT_FINALLY_THROWS = "finallyThrows";
		public static final String TRY_CONTEXT_FINALLY_END = "finallyEnd";
		public static final String TRY_CONTEXT_FINALLY_COMPUTE = "finallyCompute";
		public static final String FAKE_INITIALIZER_INITALIZE = "initialize";
		public static final String TRY_CONTEXT_ALL_THROWS = "allThrows";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String TRY_CONTEXT_FINALLY_THROWS = "finallyThrows";
		public static final String TRY_CONTEXT_FINALLY_END = "finallyEnd";
		public static final String TRY_CONTEXT_FINALLY_COMPUTE = "finallyCompute";
		public static final String FAKE_INITIALIZER_INITALIZE = "initialize";
		public static final String TRY_CONTEXT_ALL_THROWS = "allThrows";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String TRY_CONTEXT_FINALLY_START = "finallyStart";
		public static final String TRY_CONTEXT_FINALLY_THROWS = "finallyThrows";
		public static final String TRY_CONTEXT_FINALLY_END = "finallyEnd";
		public static final String TRY_CONTEXT_FINALLY_COMPUTE = "finallyCompute";
		public static final String FAKE_INITIALIZER_INITALIZE = "initialize";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String TRY_CONTEXT_FINALLY_START = "finallyStart";
		public static final String TRY_CONTEXT_FINALLY_THROWS = "finallyThrows";
		public static final String TRY_CONTEXT_FINALLY_END = "finallyEnd";
		public static final String TRY_CONTEXT_FINALLY_COMPUTE = "finallyCompute";
		public static final String FAKE_INITIALIZER_INITALIZE = "initialize";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String TRY_CONTEXT_FINALLY_START = "finallyStart";
		public static final String TRY_CONTEXT_FINALLY_THROWS = "finallyThrows";
		public static final String TRY_CONTEXT_FINALLY_END = "finallyEnd";
		public static final String TRY_CONTEXT_FINALLY_COMPUTE = "finallyCompute";
		public static final String FAKE_INITIALIZER_INITALIZE = "initialize";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String CONTEXT_LEARN_TRY_THROWN_EXCEPTION = "learnsThatTryHasThrownTheException";
		public static final String CONTEXT_CATCH_ACTIVATED = "setCatchActivated";
		public static final String CONTEXT_CATCH_VISITED = "setCatchVisited";
		public static final String CONTEXT_FINALLY_VISITED = "setFinallyVisited";
		public static final String CONTEXT_FINALLY_ACTIVATED = "setFinallyActivated";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String CONTEXT_LEARN_TRY_THROWN_EXCEPTION = "learnsThatTryHasThrownTheException";
		public static final String CONTEXT_CATCH_ACTIVATED = "setCatchActivated";
		public static final String CONTEXT_CATCH_VISITED = "setCatchVisited";
		public static final String CONTEXT_FINALLY_VISITED = "setFinallyVisited";
		public static final String CONTEXT_FINALLY_ACTIVATED = "setFinallyActivated";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String CONTEXT_LEARN_TRY_THROWN_EXCEPTION = "learnsThatTryHasThrownTheException";
		public static final String CONTEXT_CATCH_ACTIVATED = "setCatchActivated";
		public static final String CONTEXT_CATCH_VISITED = "setCatchVisited";
		public static final String CONTEXT_FINALLY_VISITED = "setFinallyVisited";
		public static final String CONTEXT_FINALLY_ACTIVATED = "setFinallyActivated";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String FAULT_INJECTOR ="bcornu.resi.manager.FaultInjector";
		public static final String RESILIENCE_MANAGER ="bcornu.resi.manager.ResilienceManager";
		public static final String FAKE_EXCEPTION_THROWER ="bcornu.resi.utils.FakeExceptionThrower";
		public static final String STATIC_MANAGER ="bcornu.resi.manager.StaticManager";
		public static final String SUBMARINE_MANAGER ="bcornu.resi.manager.SubMarineManager";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String FAULT_INJECTOR ="bcornu.resi.manager.FaultInjector";
		public static final String RESILIENCE_MANAGER ="bcornu.resi.manager.ResilienceManager";
		public static final String FAKE_EXCEPTION_THROWER ="bcornu.resi.utils.FakeExceptionThrower";
		public static final String STATIC_MANAGER ="bcornu.resi.manager.StaticManager";
		public static final String SUBMARINE_MANAGER ="bcornu.resi.manager.SubMarineManager";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String FAULT_INJECTOR ="bcornu.resi.manager.FaultInjector";
		public static final String RESILIENCE_MANAGER ="bcornu.resi.manager.ResilienceManager";
		public static final String FAKE_EXCEPTION_THROWER ="bcornu.resi.utils.FakeExceptionThrower";
		public static final String STATIC_MANAGER ="bcornu.resi.manager.StaticManager";
		public static final String SUBMARINE_MANAGER ="bcornu.resi.manager.SubMarineManager";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String TRY_CONTEXT_TRY_START = "tryStart";
		public static final String TRY_CONTEXT_TRY_THROWS = "tryThrows";
		public static final String TRY_CONTEXT_TRY_END = "tryEnd";
		public static final String TRY_CONTEXT_TRY_COMPUTE = "tryCompute";
		public static final String TRY_CONTEXT_CATCH_START = "catchStart";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String TRY_CONTEXT_TRY_START = "tryStart";
		public static final String TRY_CONTEXT_TRY_THROWS = "tryThrows";
		public static final String TRY_CONTEXT_TRY_END = "tryEnd";
		public static final String TRY_CONTEXT_TRY_COMPUTE = "tryCompute";
		public static final String TRY_CONTEXT_CATCH_START = "catchStart";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String TRY_CONTEXT_TRY_START = "tryStart";
		public static final String TRY_CONTEXT_TRY_THROWS = "tryThrows";
		public static final String TRY_CONTEXT_TRY_END = "tryEnd";
		public static final String TRY_CONTEXT_TRY_COMPUTE = "tryCompute";
		public static final String TRY_CONTEXT_CATCH_START = "catchStart";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String SUBMARINE_EXCEPTION = "bcornu.resi.exception.SubMarineException";
		public static final String INJECTED_EXCEPTION = "bcornu.resi.exception.InjectedException";
		public static final String CONSTRUCTOR_MANAGER = "bcornu.resi.manager.ConstructorManager";
		public static final String ACTION_PERFORMED_MANAGER = "bcornu.resi.manager.ActionPerformedManager";
		public static final String FAULT_INJECTOR ="bcornu.resi.manager.FaultInjector";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String SUBMARINE_EXCEPTION = "bcornu.resi.exception.SubMarineException";
		public static final String INJECTED_EXCEPTION = "bcornu.resi.exception.InjectedException";
		public static final String CONSTRUCTOR_MANAGER = "bcornu.resi.manager.ConstructorManager";
		public static final String ACTION_PERFORMED_MANAGER = "bcornu.resi.manager.ActionPerformedManager";
		public static final String FAULT_INJECTOR ="bcornu.resi.manager.FaultInjector";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String SUBMARINE_EXCEPTION = "bcornu.resi.exception.SubMarineException";
		public static final String INJECTED_EXCEPTION = "bcornu.resi.exception.InjectedException";
		public static final String CONSTRUCTOR_MANAGER = "bcornu.resi.manager.ConstructorManager";
		public static final String ACTION_PERFORMED_MANAGER = "bcornu.resi.manager.ActionPerformedManager";
		public static final String FAULT_INJECTOR ="bcornu.resi.manager.FaultInjector";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String STATIC_MANAGER ="bcornu.resi.manager.StaticManager";
		public static final String SUBMARINE_MANAGER ="bcornu.resi.manager.SubMarineManager";
		public static final String EXCEPTION_CREATOR ="bcornu.resi.utils.ExceptionCreator";
		public static final String ABEND_MANAGER ="bcornu.resi.manager.AbendManager";
		public static final String CATCH_MANAGER ="bcornu.resi.manager.CatchManager";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String STATIC_MANAGER ="bcornu.resi.manager.StaticManager";
		public static final String SUBMARINE_MANAGER ="bcornu.resi.manager.SubMarineManager";
		public static final String EXCEPTION_CREATOR ="bcornu.resi.utils.ExceptionCreator";
		public static final String ABEND_MANAGER ="bcornu.resi.manager.AbendManager";
		public static final String CATCH_MANAGER ="bcornu.resi.manager.CatchManager";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String STATIC_MANAGER ="bcornu.resi.manager.StaticManager";
		public static final String SUBMARINE_MANAGER ="bcornu.resi.manager.SubMarineManager";
		public static final String EXCEPTION_CREATOR ="bcornu.resi.utils.ExceptionCreator";
		public static final String ABEND_MANAGER ="bcornu.resi.manager.AbendManager";
		public static final String CATCH_MANAGER ="bcornu.resi.manager.CatchManager";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String TRY_CONTEXT_CATCH_START = "catchStart";
		public static final String TRY_CONTEXT_CATCH_THROWS = "catchThrows";
		public static final String TRY_CONTEXT_CATCH_END = "catchEnd";
		public static final String TRY_CONTEXT_CATCH_COMPUTE = "catchCompute";
		public static final String TRY_CONTEXT_FINALLY_START = "finallyStart";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String TRY_CONTEXT_CATCH_START = "catchStart";
		public static final String TRY_CONTEXT_CATCH_THROWS = "catchThrows";
		public static final String TRY_CONTEXT_CATCH_END = "catchEnd";
		public static final String TRY_CONTEXT_CATCH_COMPUTE = "catchCompute";
		public static final String TRY_CONTEXT_FINALLY_START = "finallyStart";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String TRY_CONTEXT_CATCH_START = "catchStart";
		public static final String TRY_CONTEXT_CATCH_THROWS = "catchThrows";
		public static final String TRY_CONTEXT_CATCH_END = "catchEnd";
		public static final String TRY_CONTEXT_CATCH_COMPUTE = "catchCompute";
		public static final String TRY_CONTEXT_FINALLY_START = "finallyStart";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String THROWABLE = "java.lang.Throwable";

		public static final String SUBMARINE_EXCEPTION = "bcornu.resi.exception.SubMarineException";
		public static final String INJECTED_EXCEPTION = "bcornu.resi.exception.InjectedException";
		public static final String CONSTRUCTOR_MANAGER = "bcornu.resi.manager.ConstructorManager";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String THROWABLE = "java.lang.Throwable";

		public static final String SUBMARINE_EXCEPTION = "bcornu.resi.exception.SubMarineException";
		public static final String INJECTED_EXCEPTION = "bcornu.resi.exception.InjectedException";
		public static final String CONSTRUCTOR_MANAGER = "bcornu.resi.manager.ConstructorManager";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String THROWABLE = "java.lang.Throwable";

		public static final String SUBMARINE_EXCEPTION = "bcornu.resi.exception.SubMarineException";
		public static final String INJECTED_EXCEPTION = "bcornu.resi.exception.InjectedException";
		public static final String CONSTRUCTOR_MANAGER = "bcornu.resi.manager.ConstructorManager";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String RESILIENCE_MANAGER ="bcornu.resi.manager.ResilienceManager";
		public static final String FAKE_EXCEPTION_THROWER ="bcornu.resi.utils.FakeExceptionThrower";
		public static final String STATIC_MANAGER ="bcornu.resi.manager.StaticManager";
		public static final String SUBMARINE_MANAGER ="bcornu.resi.manager.SubMarineManager";
		public static final String EXCEPTION_CREATOR ="bcornu.resi.utils.ExceptionCreator";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String RESILIENCE_MANAGER ="bcornu.resi.manager.ResilienceManager";
		public static final String FAKE_EXCEPTION_THROWER ="bcornu.resi.utils.FakeExceptionThrower";
		public static final String STATIC_MANAGER ="bcornu.resi.manager.StaticManager";
		public static final String SUBMARINE_MANAGER ="bcornu.resi.manager.SubMarineManager";
		public static final String EXCEPTION_CREATOR ="bcornu.resi.utils.ExceptionCreator";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String RESILIENCE_MANAGER ="bcornu.resi.manager.ResilienceManager";
		public static final String FAKE_EXCEPTION_THROWER ="bcornu.resi.utils.FakeExceptionThrower";
		public static final String STATIC_MANAGER ="bcornu.resi.manager.StaticManager";
		public static final String SUBMARINE_MANAGER ="bcornu.resi.manager.SubMarineManager";
		public static final String EXCEPTION_CREATOR ="bcornu.resi.utils.ExceptionCreator";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String TRY_CONTEXT_CATCH_END = "catchEnd";
		public static final String TRY_CONTEXT_CATCH_COMPUTE = "catchCompute";
		public static final String TRY_CONTEXT_FINALLY_START = "finallyStart";
		public static final String TRY_CONTEXT_FINALLY_THROWS = "finallyThrows";
		public static final String TRY_CONTEXT_FINALLY_END = "finallyEnd";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String TRY_CONTEXT_CATCH_END = "catchEnd";
		public static final String TRY_CONTEXT_CATCH_COMPUTE = "catchCompute";
		public static final String TRY_CONTEXT_FINALLY_START = "finallyStart";
		public static final String TRY_CONTEXT_FINALLY_THROWS = "finallyThrows";
		public static final String TRY_CONTEXT_FINALLY_END = "finallyEnd";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String TRY_CONTEXT_CATCH_END = "catchEnd";
		public static final String TRY_CONTEXT_CATCH_COMPUTE = "catchCompute";
		public static final String TRY_CONTEXT_FINALLY_START = "finallyStart";
		public static final String TRY_CONTEXT_FINALLY_THROWS = "finallyThrows";
		public static final String TRY_CONTEXT_FINALLY_END = "finallyEnd";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String FAKE_EXCEPTION_THROWER ="bcornu.resi.utils.FakeExceptionThrower";
		public static final String STATIC_MANAGER ="bcornu.resi.manager.StaticManager";
		public static final String SUBMARINE_MANAGER ="bcornu.resi.manager.SubMarineManager";
		public static final String EXCEPTION_CREATOR ="bcornu.resi.utils.ExceptionCreator";
		public static final String ABEND_MANAGER ="bcornu.resi.manager.AbendManager";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String FAKE_EXCEPTION_THROWER ="bcornu.resi.utils.FakeExceptionThrower";
		public static final String STATIC_MANAGER ="bcornu.resi.manager.StaticManager";
		public static final String SUBMARINE_MANAGER ="bcornu.resi.manager.SubMarineManager";
		public static final String EXCEPTION_CREATOR ="bcornu.resi.utils.ExceptionCreator";
		public static final String ABEND_MANAGER ="bcornu.resi.manager.AbendManager";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String FAKE_EXCEPTION_THROWER ="bcornu.resi.utils.FakeExceptionThrower";
		public static final String STATIC_MANAGER ="bcornu.resi.manager.StaticManager";
		public static final String SUBMARINE_MANAGER ="bcornu.resi.manager.SubMarineManager";
		public static final String EXCEPTION_CREATOR ="bcornu.resi.utils.ExceptionCreator";
		public static final String ABEND_MANAGER ="bcornu.resi.manager.AbendManager";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String ABEND_MANAGER ="bcornu.resi.manager.AbendManager";
		public static final String CATCH_MANAGER ="bcornu.resi.manager.CatchManager";
		public static final String TRY_CONTEXT = TryContext.class.getCanonicalName();
		public static final String TRY_CONTEXT_IMPL = "bcornu.resi.context.TryContextImpl";
		public static final String FINALLY_MANAGER = "bcornu.resi.manager.FinallyManager";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String ABEND_MANAGER ="bcornu.resi.manager.AbendManager";
		public static final String CATCH_MANAGER ="bcornu.resi.manager.CatchManager";
		public static final String TRY_CONTEXT = TryContext.class.getCanonicalName();
		public static final String TRY_CONTEXT_IMPL = "bcornu.resi.context.TryContextImpl";
		public static final String FINALLY_MANAGER = "bcornu.resi.manager.FinallyManager";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String ABEND_MANAGER ="bcornu.resi.manager.AbendManager";
		public static final String CATCH_MANAGER ="bcornu.resi.manager.CatchManager";
		public static final String TRY_CONTEXT = TryContext.class.getCanonicalName();
		public static final String TRY_CONTEXT_IMPL = "bcornu.resi.context.TryContextImpl";
		public static final String FINALLY_MANAGER = "bcornu.resi.manager.FinallyManager";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String TRY_CONTEXT_PREFIX = "_bcornu_try_context_";
		public static final String STATIC_CONTEXT = "_bcornu_static_context";
		public static final String METHODE_CONTEXT = "_bcornu_methode_context";
		public static final String CONSTRUCTOR_CONTEXT = "_bcornu_constructor_context";
		public static final String THROW_CONTEXT = "_bcornu_throw_context";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String TRY_CONTEXT_PREFIX = "_bcornu_try_context_";
		public static final String STATIC_CONTEXT = "_bcornu_static_context";
		public static final String METHODE_CONTEXT = "_bcornu_methode_context";
		public static final String CONSTRUCTOR_CONTEXT = "_bcornu_constructor_context";
		public static final String THROW_CONTEXT = "_bcornu_throw_context";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String TRY_CONTEXT_PREFIX = "_bcornu_try_context_";
		public static final String STATIC_CONTEXT = "_bcornu_static_context";
		public static final String METHODE_CONTEXT = "_bcornu_methode_context";
		public static final String CONSTRUCTOR_CONTEXT = "_bcornu_constructor_context";
		public static final String THROW_CONTEXT = "_bcornu_throw_context";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String DEFAULT_THROWABLE = "_bcornu_t";
		public static final String TRY_CONTEXT_PREFIX = "_bcornu_try_context_";
		public static final String STATIC_CONTEXT = "_bcornu_static_context";
		public static final String METHODE_CONTEXT = "_bcornu_methode_context";
		public static final String CONSTRUCTOR_CONTEXT = "_bcornu_constructor_context";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String DEFAULT_THROWABLE = "_bcornu_t";
		public static final String TRY_CONTEXT_PREFIX = "_bcornu_try_context_";
		public static final String STATIC_CONTEXT = "_bcornu_static_context";
		public static final String METHODE_CONTEXT = "_bcornu_methode_context";
		public static final String CONSTRUCTOR_CONTEXT = "_bcornu_constructor_context";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String DEFAULT_THROWABLE = "_bcornu_t";
		public static final String TRY_CONTEXT_PREFIX = "_bcornu_try_context_";
		public static final String STATIC_CONTEXT = "_bcornu_static_context";
		public static final String METHODE_CONTEXT = "_bcornu_methode_context";
		public static final String CONSTRUCTOR_CONTEXT = "_bcornu_constructor_context";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java

public interface IConstants{
	public interface Class {
		public static final String THROWABLE = "java.lang.Throwable";

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String BLOCK_CONTEXT = "bcornu.resi.context.BlockContext";
		public static final String STATIC_CONTEXT = "bcornu.resi.context.StaticContext";
		public static final String CONSTRUCTOR_CONTEXT = "bcornu.resi.context.ConstructorContext";
		public static final String METHODE_CONTEXT = MethodContext.class.getCanonicalName();
		public static final String FAKE_INITIALIZER = "bcornu.resi.utils.FakeInitializer";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String BLOCK_CONTEXT = "bcornu.resi.context.BlockContext";
		public static final String STATIC_CONTEXT = "bcornu.resi.context.StaticContext";
		public static final String CONSTRUCTOR_CONTEXT = "bcornu.resi.context.ConstructorContext";
		public static final String METHODE_CONTEXT = MethodContext.class.getCanonicalName();
		public static final String FAKE_INITIALIZER = "bcornu.resi.utils.FakeInitializer";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String BLOCK_CONTEXT = "bcornu.resi.context.BlockContext";
		public static final String STATIC_CONTEXT = "bcornu.resi.context.StaticContext";
		public static final String CONSTRUCTOR_CONTEXT = "bcornu.resi.context.ConstructorContext";
		public static final String METHODE_CONTEXT = MethodContext.class.getCanonicalName();
		public static final String FAKE_INITIALIZER = "bcornu.resi.utils.FakeInitializer";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String CONTEXT_FINALLY_ACTIVATED = "setFinallyActivated";
		public static final String CONTEXT_LEARN_FINALLY_THROWN_EXCEPTION = "learnsThatFinallyHasThrownTheException";
		public static final String CONTEXT_TRY_FINISHED = "learnsThatTryHasFinished";
		public static final String BLOCK_CONTEXT_THROWS = "blockThrows";
		public static final String BLOCK_CONTEXT_COMPUTE = "compute";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String CONTEXT_FINALLY_ACTIVATED = "setFinallyActivated";
		public static final String CONTEXT_LEARN_FINALLY_THROWN_EXCEPTION = "learnsThatFinallyHasThrownTheException";
		public static final String CONTEXT_TRY_FINISHED = "learnsThatTryHasFinished";
		public static final String BLOCK_CONTEXT_THROWS = "blockThrows";
		public static final String BLOCK_CONTEXT_COMPUTE = "compute";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String CONTEXT_FINALLY_ACTIVATED = "setFinallyActivated";
		public static final String CONTEXT_LEARN_FINALLY_THROWN_EXCEPTION = "learnsThatFinallyHasThrownTheException";
		public static final String CONTEXT_TRY_FINISHED = "learnsThatTryHasFinished";
		public static final String BLOCK_CONTEXT_THROWS = "blockThrows";
		public static final String BLOCK_CONTEXT_COMPUTE = "compute";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String BLOCK_CONTEXT_COMPUTE = "compute";
		public static final String BLOCK_CONTEXT_START = "blockStart";
		public static final String BLOCK_CONTEXT_END = "blockEnd";
		public static final String TRY_CONTEXT_COMPUTE_ALL = "computeAll";
		public static final String TRY_CONTEXT_TRY_START = "tryStart";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String BLOCK_CONTEXT_COMPUTE = "compute";
		public static final String BLOCK_CONTEXT_START = "blockStart";
		public static final String BLOCK_CONTEXT_END = "blockEnd";
		public static final String TRY_CONTEXT_COMPUTE_ALL = "computeAll";
		public static final String TRY_CONTEXT_TRY_START = "tryStart";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String BLOCK_CONTEXT_COMPUTE = "compute";
		public static final String BLOCK_CONTEXT_START = "blockStart";
		public static final String BLOCK_CONTEXT_END = "blockEnd";
		public static final String TRY_CONTEXT_COMPUTE_ALL = "computeAll";
		public static final String TRY_CONTEXT_TRY_START = "tryStart";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String TRY_CONTEXT = TryContext.class.getCanonicalName();
		public static final String TRY_CONTEXT_IMPL = "bcornu.resi.context.TryContextImpl";
		public static final String FINALLY_MANAGER = "bcornu.resi.manager.FinallyManager";
		public static final String BLOCK_CONTEXT = "bcornu.resi.context.BlockContext";
		public static final String STATIC_CONTEXT = "bcornu.resi.context.StaticContext";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String TRY_CONTEXT = TryContext.class.getCanonicalName();
		public static final String TRY_CONTEXT_IMPL = "bcornu.resi.context.TryContextImpl";
		public static final String FINALLY_MANAGER = "bcornu.resi.manager.FinallyManager";
		public static final String BLOCK_CONTEXT = "bcornu.resi.context.BlockContext";
		public static final String STATIC_CONTEXT = "bcornu.resi.context.StaticContext";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String TRY_CONTEXT = TryContext.class.getCanonicalName();
		public static final String TRY_CONTEXT_IMPL = "bcornu.resi.context.TryContextImpl";
		public static final String FINALLY_MANAGER = "bcornu.resi.manager.FinallyManager";
		public static final String BLOCK_CONTEXT = "bcornu.resi.context.BlockContext";
		public static final String STATIC_CONTEXT = "bcornu.resi.context.StaticContext";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String EXCEPTION_CREATOR ="bcornu.resi.utils.ExceptionCreator";
		public static final String ABEND_MANAGER ="bcornu.resi.manager.AbendManager";
		public static final String CATCH_MANAGER ="bcornu.resi.manager.CatchManager";
		public static final String TRY_CONTEXT = TryContext.class.getCanonicalName();
		public static final String TRY_CONTEXT_IMPL = "bcornu.resi.context.TryContextImpl";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String EXCEPTION_CREATOR ="bcornu.resi.utils.ExceptionCreator";
		public static final String ABEND_MANAGER ="bcornu.resi.manager.AbendManager";
		public static final String CATCH_MANAGER ="bcornu.resi.manager.CatchManager";
		public static final String TRY_CONTEXT = TryContext.class.getCanonicalName();
		public static final String TRY_CONTEXT_IMPL = "bcornu.resi.context.TryContextImpl";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String EXCEPTION_CREATOR ="bcornu.resi.utils.ExceptionCreator";
		public static final String ABEND_MANAGER ="bcornu.resi.manager.AbendManager";
		public static final String CATCH_MANAGER ="bcornu.resi.manager.CatchManager";
		public static final String TRY_CONTEXT = TryContext.class.getCanonicalName();
		public static final String TRY_CONTEXT_IMPL = "bcornu.resi.context.TryContextImpl";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String THROW_MANAGER = "bcornu.resi.context.ThrowManager";
	}
	public interface Method{
		public static final String CONTEXT_LEARN_TRY_THROWN_EXCEPTION = "learnsThatTryHasThrownTheException";
		public static final String CONTEXT_CATCH_ACTIVATED = "setCatchActivated";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String BLOCK_CONTEXT_END = "blockEnd";
		public static final String TRY_CONTEXT_COMPUTE_ALL = "computeAll";
		public static final String TRY_CONTEXT_TRY_START = "tryStart";
		public static final String TRY_CONTEXT_TRY_THROWS = "tryThrows";
		public static final String TRY_CONTEXT_TRY_END = "tryEnd";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String BLOCK_CONTEXT_END = "blockEnd";
		public static final String TRY_CONTEXT_COMPUTE_ALL = "computeAll";
		public static final String TRY_CONTEXT_TRY_START = "tryStart";
		public static final String TRY_CONTEXT_TRY_THROWS = "tryThrows";
		public static final String TRY_CONTEXT_TRY_END = "tryEnd";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String BLOCK_CONTEXT_END = "blockEnd";
		public static final String TRY_CONTEXT_COMPUTE_ALL = "computeAll";
		public static final String TRY_CONTEXT_TRY_START = "tryStart";
		public static final String TRY_CONTEXT_TRY_THROWS = "tryThrows";
		public static final String TRY_CONTEXT_TRY_END = "tryEnd";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String CONSTRUCTOR_CONTEXT = "bcornu.resi.context.ConstructorContext";
		public static final String METHODE_CONTEXT = MethodContext.class.getCanonicalName();
		public static final String FAKE_INITIALIZER = "bcornu.resi.utils.FakeInitializer";
		public static final String THROW_MANAGER = "bcornu.resi.context.ThrowManager";
	}
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String CONSTRUCTOR_CONTEXT = "bcornu.resi.context.ConstructorContext";
		public static final String METHODE_CONTEXT = MethodContext.class.getCanonicalName();
		public static final String FAKE_INITIALIZER = "bcornu.resi.utils.FakeInitializer";
		public static final String THROW_MANAGER = "bcornu.resi.context.ThrowManager";
	}
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String CONSTRUCTOR_CONTEXT = "bcornu.resi.context.ConstructorContext";
		public static final String METHODE_CONTEXT = MethodContext.class.getCanonicalName();
		public static final String FAKE_INITIALIZER = "bcornu.resi.utils.FakeInitializer";
		public static final String THROW_MANAGER = "bcornu.resi.context.ThrowManager";
	}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String CONTEXT_LEARN_FINALLY_THROWN_EXCEPTION = "learnsThatFinallyHasThrownTheException";
		public static final String CONTEXT_TRY_FINISHED = "learnsThatTryHasFinished";
		public static final String BLOCK_CONTEXT_THROWS = "blockThrows";
		public static final String BLOCK_CONTEXT_COMPUTE = "compute";
		public static final String BLOCK_CONTEXT_START = "blockStart";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String CONTEXT_LEARN_FINALLY_THROWN_EXCEPTION = "learnsThatFinallyHasThrownTheException";
		public static final String CONTEXT_TRY_FINISHED = "learnsThatTryHasFinished";
		public static final String BLOCK_CONTEXT_THROWS = "blockThrows";
		public static final String BLOCK_CONTEXT_COMPUTE = "compute";
		public static final String BLOCK_CONTEXT_START = "blockStart";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String CONTEXT_LEARN_FINALLY_THROWN_EXCEPTION = "learnsThatFinallyHasThrownTheException";
		public static final String CONTEXT_TRY_FINISHED = "learnsThatTryHasFinished";
		public static final String BLOCK_CONTEXT_THROWS = "blockThrows";
		public static final String BLOCK_CONTEXT_COMPUTE = "compute";
		public static final String BLOCK_CONTEXT_START = "blockStart";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String TRY_CONTEXT_FINALLY_END = "finallyEnd";
		public static final String TRY_CONTEXT_FINALLY_COMPUTE = "finallyCompute";
		public static final String FAKE_INITIALIZER_INITALIZE = "initialize";
		public static final String TRY_CONTEXT_ALL_THROWS = "allThrows";
	}
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String TRY_CONTEXT_FINALLY_END = "finallyEnd";
		public static final String TRY_CONTEXT_FINALLY_COMPUTE = "finallyCompute";
		public static final String FAKE_INITIALIZER_INITALIZE = "initialize";
		public static final String TRY_CONTEXT_ALL_THROWS = "allThrows";
	}
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String TRY_CONTEXT_FINALLY_END = "finallyEnd";
		public static final String TRY_CONTEXT_FINALLY_COMPUTE = "finallyCompute";
		public static final String FAKE_INITIALIZER_INITALIZE = "initialize";
		public static final String TRY_CONTEXT_ALL_THROWS = "allThrows";
	}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String METHODE_CONTEXT = MethodContext.class.getCanonicalName();
		public static final String FAKE_INITIALIZER = "bcornu.resi.utils.FakeInitializer";
		public static final String THROW_MANAGER = "bcornu.resi.context.ThrowManager";
	}
	public interface Method{
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String METHODE_CONTEXT = MethodContext.class.getCanonicalName();
		public static final String FAKE_INITIALIZER = "bcornu.resi.utils.FakeInitializer";
		public static final String THROW_MANAGER = "bcornu.resi.context.ThrowManager";
	}
	public interface Method{
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String METHODE_CONTEXT = MethodContext.class.getCanonicalName();
		public static final String FAKE_INITIALIZER = "bcornu.resi.utils.FakeInitializer";
		public static final String THROW_MANAGER = "bcornu.resi.context.ThrowManager";
	}
	public interface Method{
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String SUBMARINE_MANAGER ="bcornu.resi.manager.SubMarineManager";
		public static final String EXCEPTION_CREATOR ="bcornu.resi.utils.ExceptionCreator";
		public static final String ABEND_MANAGER ="bcornu.resi.manager.AbendManager";
		public static final String CATCH_MANAGER ="bcornu.resi.manager.CatchManager";
		public static final String TRY_CONTEXT = TryContext.class.getCanonicalName();
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String SUBMARINE_MANAGER ="bcornu.resi.manager.SubMarineManager";
		public static final String EXCEPTION_CREATOR ="bcornu.resi.utils.ExceptionCreator";
		public static final String ABEND_MANAGER ="bcornu.resi.manager.AbendManager";
		public static final String CATCH_MANAGER ="bcornu.resi.manager.CatchManager";
		public static final String TRY_CONTEXT = TryContext.class.getCanonicalName();
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String SUBMARINE_MANAGER ="bcornu.resi.manager.SubMarineManager";
		public static final String EXCEPTION_CREATOR ="bcornu.resi.utils.ExceptionCreator";
		public static final String ABEND_MANAGER ="bcornu.resi.manager.AbendManager";
		public static final String CATCH_MANAGER ="bcornu.resi.manager.CatchManager";
		public static final String TRY_CONTEXT = TryContext.class.getCanonicalName();
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
	}
	public interface Var{
		public static final String DEFAULT_THROWABLE = "_bcornu_t";
		public static final String TRY_CONTEXT_PREFIX = "_bcornu_try_context_";
		public static final String STATIC_CONTEXT = "_bcornu_static_context";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
	}
	public interface Var{
		public static final String DEFAULT_THROWABLE = "_bcornu_t";
		public static final String TRY_CONTEXT_PREFIX = "_bcornu_try_context_";
		public static final String STATIC_CONTEXT = "_bcornu_static_context";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
	}
	public interface Var{
		public static final String DEFAULT_THROWABLE = "_bcornu_t";
		public static final String TRY_CONTEXT_PREFIX = "_bcornu_try_context_";
		public static final String STATIC_CONTEXT = "_bcornu_static_context";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java

		public static final String SUBMARINE_EXCEPTION = "bcornu.resi.exception.SubMarineException";
		public static final String INJECTED_EXCEPTION = "bcornu.resi.exception.InjectedException";
		public static final String CONSTRUCTOR_MANAGER = "bcornu.resi.manager.ConstructorManager";
		public static final String ACTION_PERFORMED_MANAGER = "bcornu.resi.manager.ActionPerformedManager";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java

		public static final String SUBMARINE_EXCEPTION = "bcornu.resi.exception.SubMarineException";
		public static final String INJECTED_EXCEPTION = "bcornu.resi.exception.InjectedException";
		public static final String CONSTRUCTOR_MANAGER = "bcornu.resi.manager.ConstructorManager";
		public static final String ACTION_PERFORMED_MANAGER = "bcornu.resi.manager.ActionPerformedManager";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java

		public static final String SUBMARINE_EXCEPTION = "bcornu.resi.exception.SubMarineException";
		public static final String INJECTED_EXCEPTION = "bcornu.resi.exception.InjectedException";
		public static final String CONSTRUCTOR_MANAGER = "bcornu.resi.manager.ConstructorManager";
		public static final String ACTION_PERFORMED_MANAGER = "bcornu.resi.manager.ActionPerformedManager";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String BLOCK_CONTEXT_THROWS = "blockThrows";
		public static final String BLOCK_CONTEXT_COMPUTE = "compute";
		public static final String BLOCK_CONTEXT_START = "blockStart";
		public static final String BLOCK_CONTEXT_END = "blockEnd";
		public static final String TRY_CONTEXT_COMPUTE_ALL = "computeAll";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String BLOCK_CONTEXT_THROWS = "blockThrows";
		public static final String BLOCK_CONTEXT_COMPUTE = "compute";
		public static final String BLOCK_CONTEXT_START = "blockStart";
		public static final String BLOCK_CONTEXT_END = "blockEnd";
		public static final String TRY_CONTEXT_COMPUTE_ALL = "computeAll";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String BLOCK_CONTEXT_THROWS = "blockThrows";
		public static final String BLOCK_CONTEXT_COMPUTE = "compute";
		public static final String BLOCK_CONTEXT_START = "blockStart";
		public static final String BLOCK_CONTEXT_END = "blockEnd";
		public static final String TRY_CONTEXT_COMPUTE_ALL = "computeAll";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String TRY_CONTEXT_CATCH_COMPUTE = "catchCompute";
		public static final String TRY_CONTEXT_FINALLY_START = "finallyStart";
		public static final String TRY_CONTEXT_FINALLY_THROWS = "finallyThrows";
		public static final String TRY_CONTEXT_FINALLY_END = "finallyEnd";
		public static final String TRY_CONTEXT_FINALLY_COMPUTE = "finallyCompute";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String TRY_CONTEXT_CATCH_COMPUTE = "catchCompute";
		public static final String TRY_CONTEXT_FINALLY_START = "finallyStart";
		public static final String TRY_CONTEXT_FINALLY_THROWS = "finallyThrows";
		public static final String TRY_CONTEXT_FINALLY_END = "finallyEnd";
		public static final String TRY_CONTEXT_FINALLY_COMPUTE = "finallyCompute";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String TRY_CONTEXT_CATCH_COMPUTE = "catchCompute";
		public static final String TRY_CONTEXT_FINALLY_START = "finallyStart";
		public static final String TRY_CONTEXT_FINALLY_THROWS = "finallyThrows";
		public static final String TRY_CONTEXT_FINALLY_END = "finallyEnd";
		public static final String TRY_CONTEXT_FINALLY_COMPUTE = "finallyCompute";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String TRY_CONTEXT_TRY_END = "tryEnd";
		public static final String TRY_CONTEXT_TRY_COMPUTE = "tryCompute";
		public static final String TRY_CONTEXT_CATCH_START = "catchStart";
		public static final String TRY_CONTEXT_CATCH_THROWS = "catchThrows";
		public static final String TRY_CONTEXT_CATCH_END = "catchEnd";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String TRY_CONTEXT_TRY_END = "tryEnd";
		public static final String TRY_CONTEXT_TRY_COMPUTE = "tryCompute";
		public static final String TRY_CONTEXT_CATCH_START = "catchStart";
		public static final String TRY_CONTEXT_CATCH_THROWS = "catchThrows";
		public static final String TRY_CONTEXT_CATCH_END = "catchEnd";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String TRY_CONTEXT_TRY_END = "tryEnd";
		public static final String TRY_CONTEXT_TRY_COMPUTE = "tryCompute";
		public static final String TRY_CONTEXT_CATCH_START = "catchStart";
		public static final String TRY_CONTEXT_CATCH_THROWS = "catchThrows";
		public static final String TRY_CONTEXT_CATCH_END = "catchEnd";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
	public interface Var{
		public static final String DEFAULT_THROWABLE = "_bcornu_t";
		public static final String TRY_CONTEXT_PREFIX = "_bcornu_try_context_";
		public static final String STATIC_CONTEXT = "_bcornu_static_context";
		public static final String METHODE_CONTEXT = "_bcornu_methode_context";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
	public interface Var{
		public static final String DEFAULT_THROWABLE = "_bcornu_t";
		public static final String TRY_CONTEXT_PREFIX = "_bcornu_try_context_";
		public static final String STATIC_CONTEXT = "_bcornu_static_context";
		public static final String METHODE_CONTEXT = "_bcornu_methode_context";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
	public interface Var{
		public static final String DEFAULT_THROWABLE = "_bcornu_t";
		public static final String TRY_CONTEXT_PREFIX = "_bcornu_try_context_";
		public static final String STATIC_CONTEXT = "_bcornu_static_context";
		public static final String METHODE_CONTEXT = "_bcornu_methode_context";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String CONTEXT_CATCH_VISITED = "setCatchVisited";
		public static final String CONTEXT_FINALLY_VISITED = "setFinallyVisited";
		public static final String CONTEXT_FINALLY_ACTIVATED = "setFinallyActivated";
		public static final String CONTEXT_LEARN_FINALLY_THROWN_EXCEPTION = "learnsThatFinallyHasThrownTheException";
		public static final String CONTEXT_TRY_FINISHED = "learnsThatTryHasFinished";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String CONTEXT_CATCH_VISITED = "setCatchVisited";
		public static final String CONTEXT_FINALLY_VISITED = "setFinallyVisited";
		public static final String CONTEXT_FINALLY_ACTIVATED = "setFinallyActivated";
		public static final String CONTEXT_LEARN_FINALLY_THROWN_EXCEPTION = "learnsThatFinallyHasThrownTheException";
		public static final String CONTEXT_TRY_FINISHED = "learnsThatTryHasFinished";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String CONTEXT_CATCH_VISITED = "setCatchVisited";
		public static final String CONTEXT_FINALLY_VISITED = "setFinallyVisited";
		public static final String CONTEXT_FINALLY_ACTIVATED = "setFinallyActivated";
		public static final String CONTEXT_LEARN_FINALLY_THROWN_EXCEPTION = "learnsThatFinallyHasThrownTheException";
		public static final String CONTEXT_TRY_FINISHED = "learnsThatTryHasFinished";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
	public interface Method{
		public static final String CONTEXT_LEARN_TRY_THROWN_EXCEPTION = "learnsThatTryHasThrownTheException";
		public static final String CONTEXT_CATCH_ACTIVATED = "setCatchActivated";
		public static final String CONTEXT_CATCH_VISITED = "setCatchVisited";
		public static final String CONTEXT_FINALLY_VISITED = "setFinallyVisited";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
	public interface Method{
		public static final String CONTEXT_LEARN_TRY_THROWN_EXCEPTION = "learnsThatTryHasThrownTheException";
		public static final String CONTEXT_CATCH_ACTIVATED = "setCatchActivated";
		public static final String CONTEXT_CATCH_VISITED = "setCatchVisited";
		public static final String CONTEXT_FINALLY_VISITED = "setFinallyVisited";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
	public interface Method{
		public static final String CONTEXT_LEARN_TRY_THROWN_EXCEPTION = "learnsThatTryHasThrownTheException";
		public static final String CONTEXT_CATCH_ACTIVATED = "setCatchActivated";
		public static final String CONTEXT_CATCH_VISITED = "setCatchVisited";
		public static final String CONTEXT_FINALLY_VISITED = "setFinallyVisited";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String INJECTED_EXCEPTION = "bcornu.resi.exception.InjectedException";
		public static final String CONSTRUCTOR_MANAGER = "bcornu.resi.manager.ConstructorManager";
		public static final String ACTION_PERFORMED_MANAGER = "bcornu.resi.manager.ActionPerformedManager";
		public static final String FAULT_INJECTOR ="bcornu.resi.manager.FaultInjector";
		public static final String RESILIENCE_MANAGER ="bcornu.resi.manager.ResilienceManager";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String INJECTED_EXCEPTION = "bcornu.resi.exception.InjectedException";
		public static final String CONSTRUCTOR_MANAGER = "bcornu.resi.manager.ConstructorManager";
		public static final String ACTION_PERFORMED_MANAGER = "bcornu.resi.manager.ActionPerformedManager";
		public static final String FAULT_INJECTOR ="bcornu.resi.manager.FaultInjector";
		public static final String RESILIENCE_MANAGER ="bcornu.resi.manager.ResilienceManager";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String INJECTED_EXCEPTION = "bcornu.resi.exception.InjectedException";
		public static final String CONSTRUCTOR_MANAGER = "bcornu.resi.manager.ConstructorManager";
		public static final String ACTION_PERFORMED_MANAGER = "bcornu.resi.manager.ActionPerformedManager";
		public static final String FAULT_INJECTOR ="bcornu.resi.manager.FaultInjector";
		public static final String RESILIENCE_MANAGER ="bcornu.resi.manager.ResilienceManager";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String ACTION_PERFORMED_MANAGER = "bcornu.resi.manager.ActionPerformedManager";
		public static final String FAULT_INJECTOR ="bcornu.resi.manager.FaultInjector";
		public static final String RESILIENCE_MANAGER ="bcornu.resi.manager.ResilienceManager";
		public static final String FAKE_EXCEPTION_THROWER ="bcornu.resi.utils.FakeExceptionThrower";
		public static final String STATIC_MANAGER ="bcornu.resi.manager.StaticManager";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String ACTION_PERFORMED_MANAGER = "bcornu.resi.manager.ActionPerformedManager";
		public static final String FAULT_INJECTOR ="bcornu.resi.manager.FaultInjector";
		public static final String RESILIENCE_MANAGER ="bcornu.resi.manager.ResilienceManager";
		public static final String FAKE_EXCEPTION_THROWER ="bcornu.resi.utils.FakeExceptionThrower";
		public static final String STATIC_MANAGER ="bcornu.resi.manager.StaticManager";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String ACTION_PERFORMED_MANAGER = "bcornu.resi.manager.ActionPerformedManager";
		public static final String FAULT_INJECTOR ="bcornu.resi.manager.FaultInjector";
		public static final String RESILIENCE_MANAGER ="bcornu.resi.manager.ResilienceManager";
		public static final String FAKE_EXCEPTION_THROWER ="bcornu.resi.utils.FakeExceptionThrower";
		public static final String STATIC_MANAGER ="bcornu.resi.manager.StaticManager";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String STATIC_CONTEXT = "_bcornu_static_context";
		public static final String METHODE_CONTEXT = "_bcornu_methode_context";
		public static final String CONSTRUCTOR_CONTEXT = "_bcornu_constructor_context";
		public static final String THROW_CONTEXT = "_bcornu_throw_context";
	}
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String STATIC_CONTEXT = "_bcornu_static_context";
		public static final String METHODE_CONTEXT = "_bcornu_methode_context";
		public static final String CONSTRUCTOR_CONTEXT = "_bcornu_constructor_context";
		public static final String THROW_CONTEXT = "_bcornu_throw_context";
	}
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String STATIC_CONTEXT = "_bcornu_static_context";
		public static final String METHODE_CONTEXT = "_bcornu_methode_context";
		public static final String CONSTRUCTOR_CONTEXT = "_bcornu_constructor_context";
		public static final String THROW_CONTEXT = "_bcornu_throw_context";
	}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String CATCH_MANAGER ="bcornu.resi.manager.CatchManager";
		public static final String TRY_CONTEXT = TryContext.class.getCanonicalName();
		public static final String TRY_CONTEXT_IMPL = "bcornu.resi.context.TryContextImpl";
		public static final String FINALLY_MANAGER = "bcornu.resi.manager.FinallyManager";
		public static final String BLOCK_CONTEXT = "bcornu.resi.context.BlockContext";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String CATCH_MANAGER ="bcornu.resi.manager.CatchManager";
		public static final String TRY_CONTEXT = TryContext.class.getCanonicalName();
		public static final String TRY_CONTEXT_IMPL = "bcornu.resi.context.TryContextImpl";
		public static final String FINALLY_MANAGER = "bcornu.resi.manager.FinallyManager";
		public static final String BLOCK_CONTEXT = "bcornu.resi.context.BlockContext";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String CATCH_MANAGER ="bcornu.resi.manager.CatchManager";
		public static final String TRY_CONTEXT = TryContext.class.getCanonicalName();
		public static final String TRY_CONTEXT_IMPL = "bcornu.resi.context.TryContextImpl";
		public static final String FINALLY_MANAGER = "bcornu.resi.manager.FinallyManager";
		public static final String BLOCK_CONTEXT = "bcornu.resi.context.BlockContext";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String CONTEXT_FINALLY_VISITED = "setFinallyVisited";
		public static final String CONTEXT_FINALLY_ACTIVATED = "setFinallyActivated";
		public static final String CONTEXT_LEARN_FINALLY_THROWN_EXCEPTION = "learnsThatFinallyHasThrownTheException";
		public static final String CONTEXT_TRY_FINISHED = "learnsThatTryHasFinished";
		public static final String BLOCK_CONTEXT_THROWS = "blockThrows";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String CONTEXT_FINALLY_VISITED = "setFinallyVisited";
		public static final String CONTEXT_FINALLY_ACTIVATED = "setFinallyActivated";
		public static final String CONTEXT_LEARN_FINALLY_THROWN_EXCEPTION = "learnsThatFinallyHasThrownTheException";
		public static final String CONTEXT_TRY_FINISHED = "learnsThatTryHasFinished";
		public static final String BLOCK_CONTEXT_THROWS = "blockThrows";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String CONTEXT_FINALLY_VISITED = "setFinallyVisited";
		public static final String CONTEXT_FINALLY_ACTIVATED = "setFinallyActivated";
		public static final String CONTEXT_LEARN_FINALLY_THROWN_EXCEPTION = "learnsThatFinallyHasThrownTheException";
		public static final String CONTEXT_TRY_FINISHED = "learnsThatTryHasFinished";
		public static final String BLOCK_CONTEXT_THROWS = "blockThrows";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String TRY_CONTEXT_IMPL = "bcornu.resi.context.TryContextImpl";
		public static final String FINALLY_MANAGER = "bcornu.resi.manager.FinallyManager";
		public static final String BLOCK_CONTEXT = "bcornu.resi.context.BlockContext";
		public static final String STATIC_CONTEXT = "bcornu.resi.context.StaticContext";
		public static final String CONSTRUCTOR_CONTEXT = "bcornu.resi.context.ConstructorContext";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String TRY_CONTEXT_IMPL = "bcornu.resi.context.TryContextImpl";
		public static final String FINALLY_MANAGER = "bcornu.resi.manager.FinallyManager";
		public static final String BLOCK_CONTEXT = "bcornu.resi.context.BlockContext";
		public static final String STATIC_CONTEXT = "bcornu.resi.context.StaticContext";
		public static final String CONSTRUCTOR_CONTEXT = "bcornu.resi.context.ConstructorContext";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String TRY_CONTEXT_IMPL = "bcornu.resi.context.TryContextImpl";
		public static final String FINALLY_MANAGER = "bcornu.resi.manager.FinallyManager";
		public static final String BLOCK_CONTEXT = "bcornu.resi.context.BlockContext";
		public static final String STATIC_CONTEXT = "bcornu.resi.context.StaticContext";
		public static final String CONSTRUCTOR_CONTEXT = "bcornu.resi.context.ConstructorContext";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String BLOCK_CONTEXT_START = "blockStart";
		public static final String BLOCK_CONTEXT_END = "blockEnd";
		public static final String TRY_CONTEXT_COMPUTE_ALL = "computeAll";
		public static final String TRY_CONTEXT_TRY_START = "tryStart";
		public static final String TRY_CONTEXT_TRY_THROWS = "tryThrows";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String BLOCK_CONTEXT_START = "blockStart";
		public static final String BLOCK_CONTEXT_END = "blockEnd";
		public static final String TRY_CONTEXT_COMPUTE_ALL = "computeAll";
		public static final String TRY_CONTEXT_TRY_START = "tryStart";
		public static final String TRY_CONTEXT_TRY_THROWS = "tryThrows";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String BLOCK_CONTEXT_START = "blockStart";
		public static final String BLOCK_CONTEXT_END = "blockEnd";
		public static final String TRY_CONTEXT_COMPUTE_ALL = "computeAll";
		public static final String TRY_CONTEXT_TRY_START = "tryStart";
		public static final String TRY_CONTEXT_TRY_THROWS = "tryThrows";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String CONTEXT_TRY_FINISHED = "learnsThatTryHasFinished";
		public static final String BLOCK_CONTEXT_THROWS = "blockThrows";
		public static final String BLOCK_CONTEXT_COMPUTE = "compute";
		public static final String BLOCK_CONTEXT_START = "blockStart";
		public static final String BLOCK_CONTEXT_END = "blockEnd";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String CONTEXT_TRY_FINISHED = "learnsThatTryHasFinished";
		public static final String BLOCK_CONTEXT_THROWS = "blockThrows";
		public static final String BLOCK_CONTEXT_COMPUTE = "compute";
		public static final String BLOCK_CONTEXT_START = "blockStart";
		public static final String BLOCK_CONTEXT_END = "blockEnd";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String CONTEXT_TRY_FINISHED = "learnsThatTryHasFinished";
		public static final String BLOCK_CONTEXT_THROWS = "blockThrows";
		public static final String BLOCK_CONTEXT_COMPUTE = "compute";
		public static final String BLOCK_CONTEXT_START = "blockStart";
		public static final String BLOCK_CONTEXT_END = "blockEnd";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String FINALLY_MANAGER = "bcornu.resi.manager.FinallyManager";
		public static final String BLOCK_CONTEXT = "bcornu.resi.context.BlockContext";
		public static final String STATIC_CONTEXT = "bcornu.resi.context.StaticContext";
		public static final String CONSTRUCTOR_CONTEXT = "bcornu.resi.context.ConstructorContext";
		public static final String METHODE_CONTEXT = MethodContext.class.getCanonicalName();
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String FINALLY_MANAGER = "bcornu.resi.manager.FinallyManager";
		public static final String BLOCK_CONTEXT = "bcornu.resi.context.BlockContext";
		public static final String STATIC_CONTEXT = "bcornu.resi.context.StaticContext";
		public static final String CONSTRUCTOR_CONTEXT = "bcornu.resi.context.ConstructorContext";
		public static final String METHODE_CONTEXT = MethodContext.class.getCanonicalName();
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String FINALLY_MANAGER = "bcornu.resi.manager.FinallyManager";
		public static final String BLOCK_CONTEXT = "bcornu.resi.context.BlockContext";
		public static final String STATIC_CONTEXT = "bcornu.resi.context.StaticContext";
		public static final String CONSTRUCTOR_CONTEXT = "bcornu.resi.context.ConstructorContext";
		public static final String METHODE_CONTEXT = MethodContext.class.getCanonicalName();
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String TRY_CONTEXT_TRY_THROWS = "tryThrows";
		public static final String TRY_CONTEXT_TRY_END = "tryEnd";
		public static final String TRY_CONTEXT_TRY_COMPUTE = "tryCompute";
		public static final String TRY_CONTEXT_CATCH_START = "catchStart";
		public static final String TRY_CONTEXT_CATCH_THROWS = "catchThrows";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String TRY_CONTEXT_TRY_THROWS = "tryThrows";
		public static final String TRY_CONTEXT_TRY_END = "tryEnd";
		public static final String TRY_CONTEXT_TRY_COMPUTE = "tryCompute";
		public static final String TRY_CONTEXT_CATCH_START = "catchStart";
		public static final String TRY_CONTEXT_CATCH_THROWS = "catchThrows";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String TRY_CONTEXT_TRY_THROWS = "tryThrows";
		public static final String TRY_CONTEXT_TRY_END = "tryEnd";
		public static final String TRY_CONTEXT_TRY_COMPUTE = "tryCompute";
		public static final String TRY_CONTEXT_CATCH_START = "catchStart";
		public static final String TRY_CONTEXT_CATCH_THROWS = "catchThrows";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
	}
	public interface Method{
		public static final String CONTEXT_LEARN_TRY_THROWN_EXCEPTION = "learnsThatTryHasThrownTheException";
		public static final String CONTEXT_CATCH_ACTIVATED = "setCatchActivated";
		public static final String CONTEXT_CATCH_VISITED = "setCatchVisited";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
	}
	public interface Method{
		public static final String CONTEXT_LEARN_TRY_THROWN_EXCEPTION = "learnsThatTryHasThrownTheException";
		public static final String CONTEXT_CATCH_ACTIVATED = "setCatchActivated";
		public static final String CONTEXT_CATCH_VISITED = "setCatchVisited";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
	}
	public interface Method{
		public static final String CONTEXT_LEARN_TRY_THROWN_EXCEPTION = "learnsThatTryHasThrownTheException";
		public static final String CONTEXT_CATCH_ACTIVATED = "setCatchActivated";
		public static final String CONTEXT_CATCH_VISITED = "setCatchVisited";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String CONSTRUCTOR_MANAGER = "bcornu.resi.manager.ConstructorManager";
		public static final String ACTION_PERFORMED_MANAGER = "bcornu.resi.manager.ActionPerformedManager";
		public static final String FAULT_INJECTOR ="bcornu.resi.manager.FaultInjector";
		public static final String RESILIENCE_MANAGER ="bcornu.resi.manager.ResilienceManager";
		public static final String FAKE_EXCEPTION_THROWER ="bcornu.resi.utils.FakeExceptionThrower";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String CONSTRUCTOR_MANAGER = "bcornu.resi.manager.ConstructorManager";
		public static final String ACTION_PERFORMED_MANAGER = "bcornu.resi.manager.ActionPerformedManager";
		public static final String FAULT_INJECTOR ="bcornu.resi.manager.FaultInjector";
		public static final String RESILIENCE_MANAGER ="bcornu.resi.manager.ResilienceManager";
		public static final String FAKE_EXCEPTION_THROWER ="bcornu.resi.utils.FakeExceptionThrower";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String CONSTRUCTOR_MANAGER = "bcornu.resi.manager.ConstructorManager";
		public static final String ACTION_PERFORMED_MANAGER = "bcornu.resi.manager.ActionPerformedManager";
		public static final String FAULT_INJECTOR ="bcornu.resi.manager.FaultInjector";
		public static final String RESILIENCE_MANAGER ="bcornu.resi.manager.ResilienceManager";
		public static final String FAKE_EXCEPTION_THROWER ="bcornu.resi.utils.FakeExceptionThrower";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String TRY_CONTEXT_TRY_COMPUTE = "tryCompute";
		public static final String TRY_CONTEXT_CATCH_START = "catchStart";
		public static final String TRY_CONTEXT_CATCH_THROWS = "catchThrows";
		public static final String TRY_CONTEXT_CATCH_END = "catchEnd";
		public static final String TRY_CONTEXT_CATCH_COMPUTE = "catchCompute";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String TRY_CONTEXT_TRY_COMPUTE = "tryCompute";
		public static final String TRY_CONTEXT_CATCH_START = "catchStart";
		public static final String TRY_CONTEXT_CATCH_THROWS = "catchThrows";
		public static final String TRY_CONTEXT_CATCH_END = "catchEnd";
		public static final String TRY_CONTEXT_CATCH_COMPUTE = "catchCompute";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String TRY_CONTEXT_TRY_COMPUTE = "tryCompute";
		public static final String TRY_CONTEXT_CATCH_START = "catchStart";
		public static final String TRY_CONTEXT_CATCH_THROWS = "catchThrows";
		public static final String TRY_CONTEXT_CATCH_END = "catchEnd";
		public static final String TRY_CONTEXT_CATCH_COMPUTE = "catchCompute";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String CONTEXT_CATCH_ACTIVATED = "setCatchActivated";
		public static final String CONTEXT_CATCH_VISITED = "setCatchVisited";
		public static final String CONTEXT_FINALLY_VISITED = "setFinallyVisited";
		public static final String CONTEXT_FINALLY_ACTIVATED = "setFinallyActivated";
		public static final String CONTEXT_LEARN_FINALLY_THROWN_EXCEPTION = "learnsThatFinallyHasThrownTheException";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String CONTEXT_CATCH_ACTIVATED = "setCatchActivated";
		public static final String CONTEXT_CATCH_VISITED = "setCatchVisited";
		public static final String CONTEXT_FINALLY_VISITED = "setFinallyVisited";
		public static final String CONTEXT_FINALLY_ACTIVATED = "setFinallyActivated";
		public static final String CONTEXT_LEARN_FINALLY_THROWN_EXCEPTION = "learnsThatFinallyHasThrownTheException";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `src/main/java/fr/inria/spirals/npefix/transformer/utils/IConstants.java`
#### Snippet
```java
		public static final String CONTEXT_CATCH_ACTIVATED = "setCatchActivated";
		public static final String CONTEXT_CATCH_VISITED = "setCatchVisited";
		public static final String CONTEXT_FINALLY_VISITED = "setFinallyVisited";
		public static final String CONTEXT_FINALLY_ACTIVATED = "setFinallyActivated";
		public static final String CONTEXT_LEARN_FINALLY_THROWN_EXCEPTION = "learnsThatFinallyHasThrownTheException";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/utils/org/eclipse/core/internal/localstore/ILocalStoreConstants.java`
#### Snippet
```java
	/** chunk delimiter size */
	// BEGIN_CHUNK and END_CHUNK must have the same length
	public static final int CHUNK_DELIMITER_SIZE = BEGIN_CHUNK.length;
}
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `src/main/java/utils/org/eclipse/core/internal/localstore/ILocalStoreConstants.java`
#### Snippet
```java
	/** chunk delimiter size */
	// BEGIN_CHUNK and END_CHUNK must have the same length
	public static final int CHUNK_DELIMITER_SIZE = BEGIN_CHUNK.length;
}
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `src/main/java/utils/org/eclipse/core/internal/localstore/ILocalStoreConstants.java`
#### Snippet
```java
	/** chunk delimiter size */
	// BEGIN_CHUNK and END_CHUNK must have the same length
	public static final int CHUNK_DELIMITER_SIZE = BEGIN_CHUNK.length;
}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/utils/org/eclipse/core/internal/localstore/ILocalStoreConstants.java`
#### Snippet
```java
	public final static int SIZE_LASTMODIFIED = 8;
	public static final int SIZE_COUNTER = 1;
	public static final int SIZE_KEY_SUFFIX = SIZE_LASTMODIFIED + SIZE_COUNTER;

	/** constants for safe chunky streams */
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `src/main/java/utils/org/eclipse/core/internal/localstore/ILocalStoreConstants.java`
#### Snippet
```java
	public final static int SIZE_LASTMODIFIED = 8;
	public static final int SIZE_COUNTER = 1;
	public static final int SIZE_KEY_SUFFIX = SIZE_LASTMODIFIED + SIZE_COUNTER;

	/** constants for safe chunky streams */
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `src/main/java/utils/org/eclipse/core/internal/localstore/ILocalStoreConstants.java`
#### Snippet
```java
	public final static int SIZE_LASTMODIFIED = 8;
	public static final int SIZE_COUNTER = 1;
	public static final int SIZE_KEY_SUFFIX = SIZE_LASTMODIFIED + SIZE_COUNTER;

	/** constants for safe chunky streams */
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/utils/org/eclipse/core/internal/localstore/ILocalStoreConstants.java`
#### Snippet
```java

	/** Common constants for NPEFixExecution Store classes. */
	public final static int SIZE_LASTMODIFIED = 8;
	public static final int SIZE_COUNTER = 1;
	public static final int SIZE_KEY_SUFFIX = SIZE_LASTMODIFIED + SIZE_COUNTER;
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `src/main/java/utils/org/eclipse/core/internal/localstore/ILocalStoreConstants.java`
#### Snippet
```java

	/** Common constants for NPEFixExecution Store classes. */
	public final static int SIZE_LASTMODIFIED = 8;
	public static final int SIZE_COUNTER = 1;
	public static final int SIZE_KEY_SUFFIX = SIZE_LASTMODIFIED + SIZE_COUNTER;
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `src/main/java/utils/org/eclipse/core/internal/localstore/ILocalStoreConstants.java`
#### Snippet
```java

	/** Common constants for NPEFixExecution Store classes. */
	public final static int SIZE_LASTMODIFIED = 8;
	public static final int SIZE_COUNTER = 1;
	public static final int SIZE_KEY_SUFFIX = SIZE_LASTMODIFIED + SIZE_COUNTER;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/utils/org/eclipse/core/internal/localstore/ILocalStoreConstants.java`
#### Snippet
```java

	// c058fbf323bc00141a51f38c7bbb77c6
	public static final byte[] END_CHUNK = {-64, 88, -5, -13, 35, -68, 0, 20, 26, 81, -13, -116, 123, -69, 119, -58};

	/** chunk delimiter size */
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `src/main/java/utils/org/eclipse/core/internal/localstore/ILocalStoreConstants.java`
#### Snippet
```java

	// c058fbf323bc00141a51f38c7bbb77c6
	public static final byte[] END_CHUNK = {-64, 88, -5, -13, 35, -68, 0, 20, 26, 81, -13, -116, 123, -69, 119, -58};

	/** chunk delimiter size */
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `src/main/java/utils/org/eclipse/core/internal/localstore/ILocalStoreConstants.java`
#### Snippet
```java

	// c058fbf323bc00141a51f38c7bbb77c6
	public static final byte[] END_CHUNK = {-64, 88, -5, -13, 35, -68, 0, 20, 26, 81, -13, -116, 123, -69, 119, -58};

	/** chunk delimiter size */
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/utils/org/eclipse/core/internal/localstore/ILocalStoreConstants.java`
#### Snippet
```java
	/** Common constants for NPEFixExecution Store classes. */
	public final static int SIZE_LASTMODIFIED = 8;
	public static final int SIZE_COUNTER = 1;
	public static final int SIZE_KEY_SUFFIX = SIZE_LASTMODIFIED + SIZE_COUNTER;

```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `src/main/java/utils/org/eclipse/core/internal/localstore/ILocalStoreConstants.java`
#### Snippet
```java
	/** Common constants for NPEFixExecution Store classes. */
	public final static int SIZE_LASTMODIFIED = 8;
	public static final int SIZE_COUNTER = 1;
	public static final int SIZE_KEY_SUFFIX = SIZE_LASTMODIFIED + SIZE_COUNTER;

```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `src/main/java/utils/org/eclipse/core/internal/localstore/ILocalStoreConstants.java`
#### Snippet
```java
	/** Common constants for NPEFixExecution Store classes. */
	public final static int SIZE_LASTMODIFIED = 8;
	public static final int SIZE_COUNTER = 1;
	public static final int SIZE_KEY_SUFFIX = SIZE_LASTMODIFIED + SIZE_COUNTER;

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/utils/org/eclipse/core/internal/localstore/ILocalStoreConstants.java`
#### Snippet
```java

	// 40b18b8123bc00141a2596e7a393be1e
	public static final byte[] BEGIN_CHUNK = {64, -79, -117, -127, 35, -68, 0, 20, 26, 37, -106, -25, -93, -109, -66, 30};

	// c058fbf323bc00141a51f38c7bbb77c6
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `src/main/java/utils/org/eclipse/core/internal/localstore/ILocalStoreConstants.java`
#### Snippet
```java

	// 40b18b8123bc00141a2596e7a393be1e
	public static final byte[] BEGIN_CHUNK = {64, -79, -117, -127, 35, -68, 0, 20, 26, 37, -106, -25, -93, -109, -66, 30};

	// c058fbf323bc00141a51f38c7bbb77c6
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `src/main/java/utils/org/eclipse/core/internal/localstore/ILocalStoreConstants.java`
#### Snippet
```java

	// 40b18b8123bc00141a2596e7a393be1e
	public static final byte[] BEGIN_CHUNK = {64, -79, -117, -127, 35, -68, 0, 20, 26, 37, -106, -25, -93, -109, -66, 30};

	// c058fbf323bc00141a51f38c7bbb77c6
```

## RuleId[ruleID=StaticCallOnSubclass]
### StaticCallOnSubclass
Static method `isSyntax()` declared in class 'fr.inria.spirals.npefix.patch.sorter.StringTokenIterator' but referenced via subclass 'fr.inria.spirals.npefix.patch.sorter.SingleFileTokenIterator'
in `src/main/java/fr/inria/spirals/npefix/patch/sorter/TokenImpl.java`
#### Snippet
```java
	@Override
	public boolean isSyntax() {
		return SingleFileTokenIterator.isSyntax(type);
	}

```

### StaticCallOnSubclass
Static method `isLiteral()` declared in class 'fr.inria.spirals.npefix.patch.sorter.StringTokenIterator' but referenced via subclass 'fr.inria.spirals.npefix.patch.sorter.SingleFileTokenIterator'
in `src/main/java/fr/inria/spirals/npefix/patch/sorter/TokenImpl.java`
#### Snippet
```java
	@Override
	public boolean isLiteral() {
		return SingleFileTokenIterator.isLiteral(type);
	}

```

### StaticCallOnSubclass
Static method `isText()` declared in class 'fr.inria.spirals.npefix.patch.sorter.StringTokenIterator' but referenced via subclass 'fr.inria.spirals.npefix.patch.sorter.SingleFileTokenIterator'
in `src/main/java/fr/inria/spirals/npefix/patch/sorter/TokenImpl.java`
#### Snippet
```java
	@Override
	public boolean isText() {
		return SingleFileTokenIterator.isText(type);
	}

```

### StaticCallOnSubclass
Static method `isKeyword()` declared in class 'fr.inria.spirals.npefix.patch.sorter.StringTokenIterator' but referenced via subclass 'fr.inria.spirals.npefix.patch.sorter.SingleFileTokenIterator'
in `src/main/java/fr/inria/spirals/npefix/patch/sorter/TokenImpl.java`
#### Snippet
```java
	@Override
	public boolean isKeyword() {
		return SingleFileTokenIterator.isKeyword(type);
	}

```

### StaticCallOnSubclass
Static method `isOperator()` declared in class 'fr.inria.spirals.npefix.patch.sorter.StringTokenIterator' but referenced via subclass 'fr.inria.spirals.npefix.patch.sorter.SingleFileTokenIterator'
in `src/main/java/fr/inria/spirals/npefix/patch/sorter/TokenImpl.java`
#### Snippet
```java
	@Override
	public boolean isOperator() {
		return SingleFileTokenIterator.isOperator(type);
	}

```

## RuleId[ruleID=EmptyStatementBody]
### EmptyStatementBody
`if` statement has empty body
in `src/main/java/fr/inria/spirals/npefix/patchTemplate/InstanceCreator.java`
#### Snippet
```java
				output.addAll(newInstance(ctClass));
			}
		} else if (type.getTypeDeclaration() instanceof CtEnum) {

		} else if (type.getTypeDeclaration() instanceof CtAnnotation) {
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/fr/inria/spirals/npefix/patchTemplate/InstanceCreator.java`
#### Snippet
```java
		} else if (type.getTypeDeclaration() instanceof CtEnum) {

		} else if (type.getTypeDeclaration() instanceof CtAnnotation) {

		} else if (type.getTypeDeclaration() instanceof CtClass) {
```

## RuleId[ruleID=WhileCanBeForeach]
### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `src/main/java/fr/inria/spirals/npefix/main/all/Launcher.java`
#### Snippet
```java
        Iterator var6 = resources.iterator();

        while(var6.hasNext()) {
            Object resource = var6.next();
            String resourceParentPath = ((File)resource).getParent();
```

### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `src/evaluation/java/fr/inria/spirals/npefix/resi/NPEFixTemplateEvaluation.java`
#### Snippet
```java
		Iterator var6 = resources.iterator();

		while(var6.hasNext()) {
			Object resource = var6.next();
			String resourceParentPath = ((File)resource).getParent();
```

## RuleId[ruleID=EmptyFinallyBlock]
### EmptyFinallyBlock
Empty `finally` block
in `src/main/java/fr/inria/spirals/npefix/main/run/Main.java`
#### Snippet
```java
			main.showUsage();
			throw e;
		} finally {

		}
```

## RuleId[ruleID=CommentedOutCode]
### CommentedOutCode
Commented out code (27 lines)
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/VarRetrieveInit.java`
#### Snippet
```java


		/*
		// assign Integer in int
		if(element.getType() != null &&
```

### CommentedOutCode
Commented out code (3 lines)
in `src/main/java/utils/sacha/runner/utils/TestInfo.java`
#### Snippet
```java
	public static void compare(TestInfo runnedTests, TestInfo importedTests) {
		System.out.println("runned : "+runnedTests.countRun+" / imported : "+importedTests.countRun);
//		int diff = runnedTests.count>importedTests.count?runnedTests.count-importedTests.count:importedTests.count-runnedTests.count;
//		if(diff>0)
//			System.err.println("number of tests diff : "+diff);
```

### CommentedOutCode
Commented out code (3 lines)
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/VarRetrieveAssign.java`
#### Snippet
```java

			CtExpression assigned = element.getAssigned();
			/*if(element.getAssignment().getElements(new AbstractFilter<CtInvocation>(CtInvocation.class) {}).size() == 0) {
				assigned = element.getAssignment();
			}*/
```

### CommentedOutCode
Commented out code (3 lines)
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/NotNullTracer.java`
#### Snippet
```java
	}

	/*static {
		PatchActivationImpl.startRMI();
	}*/
```

### CommentedOutCode
Commented out code (9 lines)
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/TernarySplitter.java`
#### Snippet
```java
            throw new RuntimeException("Other " + parent.getClass());
        }
        /*if(ctConditional.getThenExpression().getTypeCasts() == null ||
                ctConditional.getThenExpression().getTypeCasts().isEmpty()) {
            ((CtExpression)anIf.getThenStatement()).setTypeCasts(ctConditional.getTypeCasts());
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/fr/inria/spirals/npefix/patch/sorter/Experiment.java`
#### Snippet
```java
				result[i] = 1;
			} else {
				//result[i] = new NGram(token, predicate, corpusTokens).perform();
				//result[i] = new KneserNey(token, predicate, corpusTokens).perform();
				result[i] = new Laplace(token, predicate, corpusTokens).perform();
```

### CommentedOutCode
Commented out code (6 lines)
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/AbstractStrategy.java`
#### Snippet
```java
		return instances;

		/*Stack<Set<Object>> stack = CallChecker.getStack();
		for (Iterator<Set<Object>> iterator = stack.iterator(); iterator.hasNext(); ) {
			vars = iterator.next();
```

## RuleId[ruleID=AssignmentToStaticFieldFromInstanceMethod]
### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `RandomGenerator.seed` from instance context
in `src/main/java/fr/inria/spirals/npefix/config/Config.java`
#### Snippet
```java
	public void setRandomSeed(int randomSeed) {
		this.randomSeed = randomSeed;
		RandomGenerator.seed = randomSeed;
	}

```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `CallChecker.strategySelector` from instance context
in `src/main/java/fr/inria/spirals/npefix/main/all/DefaultRepairStrategy.java`
#### Snippet
```java
	public NPEOutput run(Selector selector, List<String> methodTests) {
		CallChecker.enable();
		CallChecker.strategySelector = selector;

		NPEOutput output = new NPEOutput();
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `idCount` from instance context
in `src/main/java/fr/inria/spirals/npefix/resi/context/MethodContext.java`
#### Snippet
```java
		className = stackTrace.getClassName();
		this.location = new Location(stackTrace.getClassName(), line, sourceStart, sourceEnd);
		this.id = idCount++;
	}

```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `counterInstrumentation` from instance context
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/BlockCoverage.java`
#### Snippet
```java
		CtLiteral<Integer> sourceEnd = getFactory().Code().createLiteral(element.getPosition().getSourceEnd());

		counterInstrumentation++;
		boolean isTypeMember = element.getParent() instanceof CtTypeMember;
		if (isTypeMember) {
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `counterMethod` from instance context
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/BlockCoverage.java`
#### Snippet
```java
		boolean isTypeMember = element.getParent() instanceof CtTypeMember;
		if (isTypeMember) {
			counterMethod++;
		}
		counterBlock++;
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `counterBlock` from instance context
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/BlockCoverage.java`
#### Snippet
```java
			counterMethod++;
		}
		counterBlock++;

		CtInvocation blockCoverage = ProcessorUtility.createStaticCall(getFactory(),
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `counterInstrumentation` from instance context
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/NotNullTracer.java`
#### Snippet
```java
		}

		counterInstrumentation++;
		if (element.getKind().equals(BinaryOperatorKind.EQ)) {
			counterCheckNull++;
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `counterCheckNull` from instance context
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/NotNullTracer.java`
#### Snippet
```java
		counterInstrumentation++;
		if (element.getKind().equals(BinaryOperatorKind.EQ)) {
			counterCheckNull++;
		} else {
			counterCheckNotNull++;
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `counterCheckNotNull` from instance context
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/NotNullTracer.java`
#### Snippet
```java
			counterCheckNull++;
		} else {
			counterCheckNotNull++;
		}

```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `CallChecker.currentClassLoader` from instance context
in `src/main/java/fr/inria/spirals/npefix/main/all/Launcher.java`
#### Snippet
```java
        sourceClasspath_temp[0] = spoon.getModelBuilder().getBinaryOutputDirectory().getAbsolutePath();
        System.arraycopy(sourceClasspath, 0, sourceClasspath_temp, 1, sourceClasspath.length);
        CallChecker.currentClassLoader = getUrlClassLoader(sourceClasspath_temp);
        return this.repairStrategy.run(selector, methodTests);
    }
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `CallChecker.currentClassLoader` from instance context
in `src/main/java/fr/inria/spirals/npefix/main/all/Launcher.java`
#### Snippet
```java
        URLClassLoader urlClassLoader = getUrlClassLoader(sourceClasspath);

        CallChecker.currentClassLoader = urlClassLoader;

        return getTests(spoon, urlClassLoader);
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `CallChecker.strategySelector` from instance context
in `src/main/java/fr/inria/spirals/npefix/main/all/Launcher.java`
#### Snippet
```java

        CallChecker.enable();
        CallChecker.strategySelector = selector;

        NPEOutput output = new NPEOutput();
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `DomSelector.strategy` from instance context
in `src/main/java/fr/inria/spirals/npefix/main/all/Launcher.java`
#### Snippet
```java
            Strategy strategy = strategies[i];
            System.out.println(strategy);
            DomSelector.strategy = strategy;
            NPEOutput run = run(selector, tests);
            // NPEOutput run = runCommandLine(selector, tests);
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `CallChecker.currentClassLoader` from instance context
in `src/main/java/fr/inria/spirals/npefix/main/all/Launcher.java`
#### Snippet
```java
        URLClassLoader urlClassLoader = getUrlClassLoader(sourceClasspath);

        CallChecker.currentClassLoader = urlClassLoader;

        return getTestMethods(spoon, urlClassLoader, classnames);
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `currentUniqueId` from instance context
in `src/main/java/fr/inria/spirals/npefix/resi/context/Lapse.java`
#### Snippet
```java

	public Lapse(Selector strategySelector, String[] inputSources) {
		this.uniqueId = currentUniqueId++;
		this.locations = new HashSet<>();
		nbApplication = new HashMap<>();
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `CallChecker.currentClassLoader` from instance context
in `src/main/java/fr/inria/spirals/npefix/main/ExecutionClient.java`
#### Snippet
```java
		}
		//CallChecker.strategySelector = selector;
		CallChecker.currentClassLoader = getClass().getClassLoader();
		final TestRunner testRunner = new TestRunner();
		try {
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `DomSelector.strategy` from instance context
in `src/evaluation/java/fr/inria/spirals/npefix/resi/selector/DomSelectorEvaluation.java`
#### Snippet
```java
        CallChecker.clear();
        setSelector(new DomSelector());
        DomSelector.strategy = new Strat4(ReturnType.VAR);
    }
}
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `currentTest` from instance context
in `src/main/java/utils/sacha/runner/main/TestRunner.java`
#### Snippet
```java
		public void testStarted(Description description) {
			runnedTests.add(description.getClassName(), description.getMethodName());
			currentTest = description;
		}
		public void testIgnored(Description description)
```

## RuleId[ruleID=ObsoleteCollection]
### ObsoleteCollection
Obsolete collection type `Stack` used
in `src/main/java/fr/inria/spirals/npefix/resi/selector/ExplorerSelector.java`
#### Snippet
```java
		usedDecisionSeq.get(currentTestKey).add(lapse.getDecisions());

		stackDecision.put(currentTestKey, new Stack<Decision>());
		for (int i = 0; i < lapse.getDecisions().size(); i++) {
			Decision decision = lapse.getDecisions().get(i);
```

### ObsoleteCollection
Obsolete collection type `Stack` used
in `src/main/java/fr/inria/spirals/npefix/resi/selector/ExplorerSelector.java`
#### Snippet
```java
		this.currentTestKey = getCurrentLapse().getTestClassName() + "#" + getCurrentLapse().getTestName();
		if(!stackDecision.containsKey(currentTestKey)) {
			stackDecision.put(currentTestKey, new Stack<Decision>());
		}
		if(!usedDecisionSeq.containsKey(currentTestKey)) {
```

### ObsoleteCollection
Obsolete collection type `Vector`> used
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/AbstractStrategy.java`
#### Snippet
```java
				}
				ClassLoader_classes_field.setAccessible(true);
				Vector<Class<?>> clazzes;
				try {
					clazzes = (Vector<Class<?>>) ClassLoader_classes_field.get(classLoader);
```

## RuleId[ruleID=KeySetIterationMayUseEntrySet]
### KeySetIterationMayUseEntrySet
Iteration over `importedClasses` may be replaced with 'entrySet()' iteration
in `src/main/java/utils/sacha/runner/utils/TestInfo.java`
#### Snippet
```java
		Set<String> importedClasses = importedTests.keySet();
		int total=0;
		for (String string : importedClasses) {
			if(!runnedClasses.contains(string)){
				System.err.print("imported not runned : "+string);
```

### KeySetIterationMayUseEntrySet
Iteration over `runnedClasses` may be replaced with 'entrySet()' iteration
in `src/main/java/utils/sacha/runner/utils/TestInfo.java`
#### Snippet
```java
			System.err.println("\ttotal number : "+total);
		total = 0;
		for (String string : runnedClasses) {
			if(!importedClasses.contains(string)){
				System.err.print("runned not imported : "+string);
```

### KeySetIterationMayUseEntrySet
Iteration over `strings` may be replaced with 'values()' iteration
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/Strat4.java`
#### Snippet
```java
			Map<String, Instance<T>> variables = obtain(clazz);
			Set<String> strings = variables.keySet();
			for (String key : strings) {
				Decision<T> decision = new Decision<>(this, location,
						variables.get(key), clazz);
```

## RuleId[ruleID=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`string.length()==0` can be replaced with 'string.isEmpty()'
in `src/main/java/utils/sacha/impl/DefaultSpooner.java`
#### Snippet
```java
		String tmp = "";
		for (String string : sources) {
			if(string==null || string.length()==0)
				throw new IllegalArgumentException("setSourceFolder can not be used with empty value");
			tmp+=getProjectDir().getAbsolutePath()+"/"+string+":";
```

### SizeReplaceableByIsEmpty
`string.length()==0` can be replaced with 'string.isEmpty()'
in `src/main/java/utils/sacha/impl/DefaultSpooner.java`
#### Snippet
```java
			tmp = "";
			for (String string : processors) {
				if(string==null || string.length()==0)
					throw new IllegalArgumentException("setProcessors can not be used with empty value");
				tmp+=string+":";
```

### SizeReplaceableByIsEmpty
`outputFolder.length()==0` can be replaced with 'outputFolder.isEmpty()'
in `src/main/java/utils/sacha/impl/DefaultSpooner.java`
#### Snippet
```java
		if(outputFolder != null){
			args.add("-o");
			if(outputFolder==null || outputFolder.length()==0)
				throw new IllegalArgumentException("setOutputFolder can not be used with empty value");
			args.add(outputFolder);
```

### SizeReplaceableByIsEmpty
`elements.size() == 0` can be replaced with 'elements.isEmpty()'
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/ProcessorUtility.java`
#### Snippet
```java
            }
        });
        if (elements.size() == 0) {
            return assigned;
        }
```

### SizeReplaceableByIsEmpty
`element.getStatements().size() > 0` can be replaced with '!element.getStatements().isEmpty()'
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/BlockCoverage.java`
#### Snippet
```java
		// handle this() and super()
		if (element.getParent() instanceof CtConstructor
				&& element.getStatements().size() > 0 &&
				(element.getStatement(0) instanceof CtThisAccess || element.getStatement(0) instanceof CtSuperAccess)) {
			element.getStatement(0).insertAfter(blockCoverage);
```

### SizeReplaceableByIsEmpty
`elements.size() > 0` can be replaced with '!elements.isEmpty()'
in `src/main/java/fr/inria/spirals/npefix/main/all/Launcher.java`
#### Snippet
```java
            // junit 4
            List<CtElement> elements = ctType.getElements(new AnnotationFilter<>(Test.class));
            if(elements.size() > 0) {
                continue;
            }
```

### SizeReplaceableByIsEmpty
`file.length() > 0` can be replaced with '!file.isEmpty()'
in `src/main/java/utils/sacha/impl/AbstractConfigurator.java`
#### Snippet
```java
				String file = dataInputStream.readUTF().trim();

				if (file.length() > 0) {
					if (!file.startsWith("URI//")) {
						throw new IOException(location.getAbsolutePath() + " contains unexpected data: " + file);
```

### SizeReplaceableByIsEmpty
`ctTry.getCatchers().size() == 0` can be replaced with 'ctTry.getCatchers().isEmpty()'
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/RemoveNPECheckProcessor.java`
#### Snippet
```java
        CtElement parent = ctTry.getParent();
        ctTry.removeCatcher(candidate);
        if(ctTry.getCatchers().size() == 0) {
            List<CtStatement> statements = ctTry.getBody().getStatements();
            for (int i = 0; i < statements.size(); i++) {
```

### SizeReplaceableByIsEmpty
`constructors.size() == 0` can be replaced with 'constructors.isEmpty()'
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/AbstractStrategy.java`
#### Snippet
```java
		} catch (Throwable e) {
			try{
				if(constructors.size() == 0) {
					constructors = Arrays.asList(clazz.getDeclaredConstructors());
				}
```

### SizeReplaceableByIsEmpty
`constructors.size() == 0` can be replaced with 'constructors.isEmpty()'
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/AbstractStrategy.java`
#### Snippet
```java
					constructors = Arrays.asList(clazz.getDeclaredConstructors());
				}
				if(constructors.size() == 0) {
					constructors.add(clazz.getEnclosingConstructor());
				}
```

### SizeReplaceableByIsEmpty
`constructors.size() == 0` can be replaced with 'constructors.isEmpty()'
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/AbstractStrategy.java`
#### Snippet
```java
					constructors.add(clazz.getEnclosingConstructor());
				}
				if(constructors.size() == 0) {
					//throw new ErrorInitClass("missing constructor " + clazz);
					return instances;
```

## RuleId[ruleID=NonShortCircuitBoolean]
### NonShortCircuitBoolean
Non-short-circuit boolean expression `delete &= recursifDeleteJavaFiles(child)`
in `src/main/java/fr/inria/spirals/npefix/main/spoon/MainSpoon.java`
#### Snippet
```java
			if (file.isDirectory())
				for (File child : file.listFiles()) {
					delete &= recursifDeleteJavaFiles(child);
				}
			if(!delete || (file.isFile() && !file.getName().endsWith(".java"))){
```

## RuleId[ruleID=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/fr/inria/spirals/npefix/resi/context/instance/PrimitiveInstance.java`
#### Snippet
```java
	@Override
	public String toString() {
		return "" + value;
	}

```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/fr/inria/spirals/npefix/config/Config.java`
#### Snippet
```java
				userProperties.load(new FileReader(currentDir));

				this.timeoutIteration = Integer.parseInt(properties.getProperty(ITERATION_TIMEOUT, timeoutIteration + ""));
				this.nbIteration = Integer.parseInt(userProperties.getProperty(ITERATION_COUNT, nbIteration + ""));
				this.serverPort = Integer.parseInt(userProperties.getProperty(SERVER_PORT, serverPort + ""));
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/fr/inria/spirals/npefix/config/Config.java`
#### Snippet
```java

				this.timeoutIteration = Integer.parseInt(properties.getProperty(ITERATION_TIMEOUT, timeoutIteration + ""));
				this.nbIteration = Integer.parseInt(userProperties.getProperty(ITERATION_COUNT, nbIteration + ""));
				this.serverPort = Integer.parseInt(userProperties.getProperty(SERVER_PORT, serverPort + ""));
				this.serverHost = userProperties.getProperty(SERVER_HOST, serverHost);
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/fr/inria/spirals/npefix/config/Config.java`
#### Snippet
```java
				this.timeoutIteration = Integer.parseInt(properties.getProperty(ITERATION_TIMEOUT, timeoutIteration + ""));
				this.nbIteration = Integer.parseInt(userProperties.getProperty(ITERATION_COUNT, nbIteration + ""));
				this.serverPort = Integer.parseInt(userProperties.getProperty(SERVER_PORT, serverPort + ""));
				this.serverHost = userProperties.getProperty(SERVER_HOST, serverHost);
				this.randomSeed = Integer.parseInt(userProperties.getProperty(RANDOM_SEED, randomSeed + ""));
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/fr/inria/spirals/npefix/config/Config.java`
#### Snippet
```java
				this.serverPort = Integer.parseInt(userProperties.getProperty(SERVER_PORT, serverPort + ""));
				this.serverHost = userProperties.getProperty(SERVER_HOST, serverHost);
				this.randomSeed = Integer.parseInt(userProperties.getProperty(RANDOM_SEED, randomSeed + ""));
				this.greedyEpsilon = Double.parseDouble(userProperties.getProperty(SELECTOR_GREEDY_EPSILON, greedyEpsilon + ""));
				this.datasetRoot = userProperties.getProperty(EVALUATION_DATASET_ROOT, datasetRoot);
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/fr/inria/spirals/npefix/config/Config.java`
#### Snippet
```java
				this.serverHost = userProperties.getProperty(SERVER_HOST, serverHost);
				this.randomSeed = Integer.parseInt(userProperties.getProperty(RANDOM_SEED, randomSeed + ""));
				this.greedyEpsilon = Double.parseDouble(userProperties.getProperty(SELECTOR_GREEDY_EPSILON, greedyEpsilon + ""));
				this.datasetRoot = userProperties.getProperty(EVALUATION_DATASET_ROOT, datasetRoot);
				this.workingDirectory = userProperties.getProperty(EVALUATION_WORKING_DIRECTORY, workingDirectory);
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/fr/inria/spirals/npefix/patch/sorter/tokenizer/TokenTypeTokenizer.java`
#### Snippet
```java
	@Override
	public String computeRepresentation(Token token) {
		return token.getType() + "";
	}

```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/fr/inria/spirals/npefix/main/all/Launcher.java`
#### Snippet
```java
                            className,
                            method,
                            Config.CONFIG.getRandomSeed() + "");
            try {
                // run the new JVM
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/fr/inria/spirals/npefix/main/all/Launcher.java`
#### Snippet
```java
        this.sourcePath = sourcePath;
        this.complianceLevel = complianceLevel;
        if(!File.pathSeparator.equals(classpath.charAt(classpath.length() - 1) + "")) {
            classpath = classpath + File.pathSeparator;
        }
```

## RuleId[ruleID=BooleanConstructor]
### BooleanConstructor
Boolean constructor call
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/AbstractStrategy.java`
#### Snippet
```java
		}
		if(clazz == boolean.class){
			instances.add(new PrimitiveInstance<T>((T) new Boolean(false)));
			instances.add(new PrimitiveInstance<T>((T) new Boolean(true)));
		}
```

### BooleanConstructor
Boolean constructor call
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/AbstractStrategy.java`
#### Snippet
```java
		if(clazz == boolean.class){
			instances.add(new PrimitiveInstance<T>((T) new Boolean(false)));
			instances.add(new PrimitiveInstance<T>((T) new Boolean(true)));
		}
		if(clazz == float.class){
```

## RuleId[ruleID=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `TestRunnerMain` has no concrete subclass
in `src/main/java/utils/sacha/runner/main/TestRunnerMain.java`
#### Snippet
```java


public abstract class TestRunnerMain {
	/**
	 * have to be set in static{testFolder = "%path%";} on instances
```

### AbstractClassNeverImplemented
Abstract class `MainEvaluation` has no concrete subclass
in `src/evaluation/java/fr/inria/spirals/npefix/main/MainEvaluation.java`
#### Snippet
```java
import java.util.Iterator;

public abstract class MainEvaluation {
	private static final String WORKING_DIRECTORY = "workingDirectory";
	private static final String OUTPUT_DIRECTORY = "outputDirectory";
```

## RuleId[ruleID=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends Decision`
in `src/main/java/fr/inria/spirals/npefix/resi/selector/RandomSelector.java`
#### Snippet
```java
	 */
	@Override
	public <T> Decision<T> select(List<Decision<T>> decisions) {
		this.decisions.addAll(decisions);
		int maxValue = decisions.size();
```

### BoundedWildcard
Can generalize to `? extends Decision`
in `src/main/java/fr/inria/spirals/npefix/resi/selector/MonoExplorerSelector.java`
#### Snippet
```java
	}

	private <T> void initDecision(List<Decision<T>> decisions) {
		for (int i = 0; i < decisions.size(); i++) {
			Decision decision = decisions.get(i);
```

### BoundedWildcard
Can generalize to `? extends DecisionElement`
in `src/main/java/fr/inria/spirals/npefix/patch/generator/PatchGenerator.java`
#### Snippet
```java
	}

	private String getPatch(List<DecisionElement> elements) {
		DecisionElement firstDecisionElement = elements.get(0);
		Decision decision = firstDecisionElement.getDecision();
```

### BoundedWildcard
Can generalize to `? extends Instance`
in `src/main/java/fr/inria/spirals/npefix/resi/context/instance/NewArrayInstance.java`
#### Snippet
```java
	private List<Instance<?>> values;

	public NewArrayInstance(String clazz, List<Instance<?>> values) {
		this.clazz = clazz;
		this.values = values;
```

### BoundedWildcard
Can generalize to `? extends Instance`
in `src/main/java/fr/inria/spirals/npefix/resi/context/instance/NewArrayInstance.java`
#### Snippet
```java
	}

	public NewArrayInstance(Class<T> clazz, List<Instance<?>> values) {
		if(!clazz.isArray()) {
			throw new IllegalArgumentException(clazz + " is not an array");
```

### BoundedWildcard
Can generalize to `? extends Decision`
in `src/main/java/fr/inria/spirals/npefix/resi/selector/GreedySelector.java`
#### Snippet
```java
	}

	private <T> void initDecision(List<Decision<T>> decisions) {
		for (int i = 0; i < decisions.size(); i++) {
			Decision decision = decisions.get(i);
```

### BoundedWildcard
Can generalize to `? extends Decision`
in `src/main/java/fr/inria/spirals/npefix/patch/generator/PatchesGenerator.java`
#### Snippet
```java
	}

	private List<DecisionElement> getElements(CtType type, List<Decision> decisions) {
		List<DecisionElement> elements = new ArrayList<>();

```

### BoundedWildcard
Can generalize to `? extends Decision`
in `src/main/java/fr/inria/spirals/npefix/patch/generator/PatchesGenerator.java`
#### Snippet
```java
	private String[] inputSources;

	public PatchesGenerator(List<Decision> decisions, Launcher spoon, String[] inputSources) {
		this.decisions = new ArrayList<>();
		for (int i = 0; i < decisions.size(); i++) {
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/fr/inria/spirals/npefix/resi/context/Decision.java`
#### Snippet
```java
		return value;
	}
	public void setValue(Instance<T> value) {
		this.value = value;
	}
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/fr/inria/spirals/npefix/resi/context/Decision.java`
#### Snippet
```java
	}

	public Decision(Strategy strategy, Location location, Instance<T> value) {
		this(strategy, location);
		this.value = value;
```

### BoundedWildcard
Can generalize to `? extends Decision`
in `src/main/java/fr/inria/spirals/npefix/resi/selector/ExplorerSelector.java`
#### Snippet
```java
	}

	private <T> void initDecision(List<Decision<T>> decisions) {

		for (int i = 0; i < decisions.size(); i++) {
```

### BoundedWildcard
Can generalize to `? extends Token`
in `src/main/java/fr/inria/spirals/npefix/patch/sorter/Tokens.java`
#### Snippet
```java
	}

	public int nbWordCanFollow(List<Token> predicates) {
		int output = 0;
		int size = predicates.size();
```

### BoundedWildcard
Can generalize to `? extends Token`
in `src/main/java/fr/inria/spirals/npefix/patch/sorter/Tokens.java`
#### Snippet
```java
	}

	public int count (Token token, List<Token> predicates) {
		if (!this.contains(token)) {
			return 0;
```

### BoundedWildcard
Can generalize to `? extends Token`
in `src/main/java/fr/inria/spirals/npefix/patch/sorter/Tokens.java`
#### Snippet
```java
	}

	public int countWordCanFollow(List<Token> predicates) {
		Set<String> followingWords = new HashSet<>();
		int size = predicates.size();
```

### BoundedWildcard
Can generalize to `? extends CtTypeReference`
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/TryRegister.java`
#### Snippet
```java
	}

	private CtLocalVariable getNewTrycontext(CtTry element, List<CtTypeReference> catchables) {
		CtTypeReference<Object> tryTypeRef = getFactory().Type().createReference(IConstants.Class.TRY_CONTEXT);

```

### BoundedWildcard
Can generalize to `? extends Decision`
in `src/main/java/fr/inria/spirals/npefix/resi/selector/DomSelector.java`
#### Snippet
```java

	@Override
	public <T> Decision<T> select(List<Decision<T>> decisions) {
		this.decisions.addAll(decisions);
		return decisions.get(currentIndex);
```

## RuleId[ruleID=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/utils/org/eclipse/core/internal/localstore/ILocalStoreConstants.java`
#### Snippet
```java

	/** Common constants for NPEFixExecution Store classes. */
	public final static int SIZE_LASTMODIFIED = 8;
	public static final int SIZE_COUNTER = 1;
	public static final int SIZE_KEY_SUFFIX = SIZE_LASTMODIFIED + SIZE_COUNTER;
```

## RuleId[ruleID=IfStatementMissingBreakInLoop]
### IfStatementMissingBreakInLoop
Loop can be terminated after condition is met
in `src/main/java/utils/sacha/classloader/enrich/EnrichableClassloader.java`
#### Snippet
```java
										currentPathString = workspaceLoc+currentPathString;
										for (String ignoredPath : ignoredPaths)
											if(ignoredPath.equalsIgnoreCase(currentPathString))
												perform=false;
									}
```

## RuleId[ruleID=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `src/evaluation/java/fr/inria/spirals/npefix/AbstractEvaluation.java`
#### Snippet
```java
        File outputSource = new File(Config.CONFIG.getEvaluationWorkingDirectory()  + "/" + name + "/instrumented");

        binFolder.mkdirs();
        outputSource.mkdirs();

```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `src/evaluation/java/fr/inria/spirals/npefix/AbstractEvaluation.java`
#### Snippet
```java

        binFolder.mkdirs();
        outputSource.mkdirs();

        Launcher launcher = new Launcher(
```

### IgnoreResultOfCall
Result of `File.createNewFile()` is ignored
in `src/evaluation/java/fr/inria/spirals/npefix/AbstractEvaluation.java`
#### Snippet
```java
            if(!file.exists()) {
                FileUtils.forceMkdir(file.getParentFile());
                file.createNewFile();
            }
            FileWriter fileWriter = new FileWriter(file);
```

### IgnoreResultOfCall
Result of `File.mkdir()` is ignored
in `src/main/java/utils/sacha/impl/GeneralToJavaCore.java`
#### Snippet
```java
			File prefs = new File(getProjectDir().getAbsoluteFile()+"/.settings/org.eclipse.jdt.core.prefs");
			if(!prefs.getParentFile().exists())
				prefs.getParentFile().mkdir();
			BufferedWriter out=null;
			try {
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `src/main/java/fr/inria/spirals/npefix/main/all/Launcher.java`
#### Snippet
```java
        File directory = new File(sourceOutput);
        if(!directory.exists()) {
            directory.mkdirs();
        }
        Collection resources = FileUtils.listFiles(directory, spoon.RESOURCES_FILE_FILTER, spoon.ALL_DIR_FILTER);
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `src/main/java/fr/inria/spirals/npefix/main/all/Launcher.java`
#### Snippet
```java
            packageDir = packageDir.replace("/java", "").replace("/resources", "");
            String targetDirectory = this.binOutput + packageDir;
            new File(packageDir).mkdirs();

            try {
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `src/main/java/fr/inria/spirals/npefix/main/spoon/MainSpoon.java`
#### Snippet
```java
				return false;
			}
			file.delete();
		}
		return delete;
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `src/evaluation/java/fr/inria/spirals/npefix/resi/NPEFixTemplateEvaluation.java`
#### Snippet
```java
			}
		}
		element.delete();
	}

```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `src/evaluation/java/fr/inria/spirals/npefix/resi/NPEFixTemplateEvaluation.java`
#### Snippet
```java
		File directory = new File(sourceOutput);
		if(!directory.exists()) {
			directory.mkdirs();
		}
		Collection resources = FileUtils
```

## RuleId[ruleID=ThrowablePrintedToSystemOut]
### ThrowablePrintedToSystemOut
'Throwable' argument `e` to 'System.out.println()' call
in `src/main/java/fr/inria/spirals/npefix/resi/context/TryContext.java`
#### Snippet
```java
				this.types[i++] = classLoader.loadClass(str);
			} catch (ClassNotFoundException e) {
				System.out.println(e);
				//throw new RuntimeException(e);
			}
```

## RuleId[ruleID=AccessStaticViaInstance]
### AccessStaticViaInstance
Static member 'java.lang.Class\>.forName(java.lang.String)' accessed via instance reference
in `src/main/java/fr/inria/spirals/npefix/resi/context/instance/AbstractInstance.java`
#### Snippet
```java
		}
		try {
			return getClass().forName(className);
		} catch (ClassNotFoundException e) {
			try {
```

### AccessStaticViaInstance
Static member 'java.lang.Class\>.forName(java.lang.String)' accessed via instance reference
in `src/main/java/fr/inria/spirals/npefix/resi/context/instance/NewInstance.java`
#### Snippet
```java
			}
			try {
				Constructor<?> constructor = getClass().forName(clazz).getConstructor(parameterTypes);

				constructor.setAccessible(true);
```

### AccessStaticViaInstance
Static member 'spoon.Launcher.RESOURCES_FILE_FILTER' accessed via instance reference
in `src/main/java/fr/inria/spirals/npefix/main/all/Launcher.java`
#### Snippet
```java
            directory.mkdirs();
        }
        Collection resources = FileUtils.listFiles(directory, spoon.RESOURCES_FILE_FILTER, spoon.ALL_DIR_FILTER);
        Iterator var6 = resources.iterator();

```

### AccessStaticViaInstance
Static member 'spoon.Launcher.ALL_DIR_FILTER' accessed via instance reference
in `src/main/java/fr/inria/spirals/npefix/main/all/Launcher.java`
#### Snippet
```java
            directory.mkdirs();
        }
        Collection resources = FileUtils.listFiles(directory, spoon.RESOURCES_FILE_FILTER, spoon.ALL_DIR_FILTER);
        Iterator var6 = resources.iterator();

```

### AccessStaticViaInstance
Static member 'java.lang.Class\>.forName(java.lang.String)' accessed via instance reference
in `src/main/java/fr/inria/spirals/npefix/resi/context/Decision.java`
#### Snippet
```java
	public Class<T> getValueType() {
		try {
			return (Class<T>) getClass().forName(valueType);
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
```

### AccessStaticViaInstance
Static member 'java.lang.Class\>.forName(java.lang.String)' accessed via instance reference
in `src/main/java/fr/inria/spirals/npefix/main/ExecutionClient.java`
#### Snippet
```java
		final TestRunner testRunner = new TestRunner();
		try {
			Class<?> testClass = getClass().forName(classTestName);
			final Request request = Request.method(testClass, testName);

```

## RuleId[ruleID=RedundantMethodOverride]
### RedundantMethodOverride
Method `loadClass()` only delegates to its super method
in `src/main/java/utils/sacha/classloader/enrich/EnrichableClassloader.java`
#### Snippet
```java
	
	@Override
	public Class<?> loadClass(String name) throws ClassNotFoundException {
		return super.loadClass(name);
	}
```

### RedundantMethodOverride
Method `hashCode()` is identical to its super method
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/Strat4.java`
#### Snippet
```java

	@Override
	public int hashCode() {
		return this.getClass().getSimpleName().hashCode();
	}
```

## RuleId[ruleID=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import fr.inria.spirals.npefix.main.DecisionServer;`
in `src/main/java/fr/inria/spirals/npefix/main/all/DefaultRepairStrategy.java`
#### Snippet
```java
package fr.inria.spirals.npefix.main.all;

import fr.inria.spirals.npefix.main.DecisionServer;
import fr.inria.spirals.npefix.resi.CallChecker;
import fr.inria.spirals.npefix.resi.context.Lapse;
```

## RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
### ReplaceAssignmentWithOperatorAssignment
`classpath = classpath + File.pathSeparator` could be simplified to 'classpath += File.pathSeparator'
in `src/main/java/fr/inria/spirals/npefix/main/all/Launcher.java`
#### Snippet
```java
        this.complianceLevel = complianceLevel;
        if(!File.pathSeparator.equals(classpath.charAt(classpath.length() - 1) + "")) {
            classpath = classpath + File.pathSeparator;
        }

```

## RuleId[ruleID=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `src/main/java/utils/sacha/classloader/enrich/EnrichableClassloader.java`
#### Snippet
```java
		try {
			String line = null;
			while((line = isr.readLine())!=null){
				if(line.startsWith("org.eclipse.jdt.core.classpathVariable.M2_REPO=")){
					M2REPO = line.replace("org.eclipse.jdt.core.classpathVariable.M2_REPO=", "");
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/utils/sacha/classloader/enrich/EnrichableClassloader.java`
#### Snippet
```java
						Node node;
						for (int i = 0; i < length; ++i) {
							if ((node = list.item(i)).getNodeType() == Node.ELEMENT_NODE){
								if("output".equalsIgnoreCase(node.getAttributes().getNamedItem("kind").getNodeValue()) 
										|| "lib".equalsIgnoreCase(node.getAttributes().getNamedItem("kind").getNodeValue())){
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/utils/sacha/classloader/enrich/EnrichableClassloader.java`
#### Snippet
```java
													Node node1;
													for (int i1 = 0; i1 < length1; ++i1) {
														if ((node1 = list1.item(i1)).getNodeType() == Node.ELEMENT_NODE 
																&& "output".equalsIgnoreCase(node1.getAttributes().getNamedItem("kind").getNodeValue())){
															String outputPathString = projectFolder.getAbsolutePath()+File.separator+node1.getAttributes().getNamedItem("path").getNodeValue();
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/fr/inria/spirals/npefix/main/spoon/MainSpoon.java`
#### Snippet
```java
							new FileInputStream(targetsFile)));
					String line;
					while ((line = br.readLine()) != null) {
						if(line.startsWith("#"))continue;
						String[] lineB = line.split(":",2);
```

## RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `decisions` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/fr/inria/spirals/npefix/resi/selector/MonoExplorerSelector.java`
#### Snippet
```java

	private Map<String, Set<Decision>> usedDecisions = new HashMap<>();
	private Map<Location, Set<Decision>> decisions = new HashMap<>();
	private String currentTestKey;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `currentTestKey` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/fr/inria/spirals/npefix/resi/selector/MonoExplorerSelector.java`
#### Snippet
```java
	private Map<String, Set<Decision>> usedDecisions = new HashMap<>();
	private Map<Location, Set<Decision>> decisions = new HashMap<>();
	private String currentTestKey;

	@Override
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `usedDecisions` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/fr/inria/spirals/npefix/resi/selector/MonoExplorerSelector.java`
#### Snippet
```java
public class MonoExplorerSelector extends AbstractSelector {

	private Map<String, Set<Decision>> usedDecisions = new HashMap<>();
	private Map<Location, Set<Decision>> decisions = new HashMap<>();
	private String currentTestKey;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `currentTestKey` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/fr/inria/spirals/npefix/resi/selector/ExplorerSelector.java`
#### Snippet
```java
	private Map<Location, Set<Decision>> decisions = new HashMap<>();
	private Map<String, Stack<Decision>> stackDecision  = new HashMap<>();
	private String currentTestKey;
	private List<Strategy> strategies;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `usedDecisionSeq` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/fr/inria/spirals/npefix/resi/selector/ExplorerSelector.java`
#### Snippet
```java
public class ExplorerSelector extends AbstractSelector {

	private Map<String, Set<List<Decision>>> usedDecisionSeq = new HashMap<>();
	private Map<Location, Set<Decision>> decisions = new HashMap<>();
	private Map<String, Stack<Decision>> stackDecision  = new HashMap<>();
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `decisions` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/fr/inria/spirals/npefix/resi/selector/ExplorerSelector.java`
#### Snippet
```java

	private Map<String, Set<List<Decision>>> usedDecisionSeq = new HashMap<>();
	private Map<Location, Set<Decision>> decisions = new HashMap<>();
	private Map<String, Stack<Decision>> stackDecision  = new HashMap<>();
	private String currentTestKey;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `stackDecision` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/fr/inria/spirals/npefix/resi/selector/ExplorerSelector.java`
#### Snippet
```java
	private Map<String, Set<List<Decision>>> usedDecisionSeq = new HashMap<>();
	private Map<Location, Set<Decision>> decisions = new HashMap<>();
	private Map<String, Stack<Decision>> stackDecision  = new HashMap<>();
	private String currentTestKey;
	private List<Strategy> strategies;
```

## RuleId[ruleID=EmptyMethod]
### EmptyMethod
The method is empty
in `src/evaluation/java/fr/inria/spirals/npefix/AbstractEvaluation.java`
#### Snippet
```java
    }

    public void printResults(NPEOutput results,
            boolean printException) {
        /*List<Decision> strats = new ArrayList<>(results.getRanStrategies());
```

### EmptyMethod
The method is empty
in `src/main/java/utils/sacha/mains/CheckLoopMain.java`
#### Snippet
```java
public class CheckLoopMain {

	public static void main(String[] args) {

//
```

## RuleId[ruleID=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/utils/sacha/impl/DefaultSpooner.java`
#### Snippet
```java
	private String[] processors = null;
	private String[] sources = null;
	private boolean graphical = false;
	
	
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/utils/sacha/impl/DefaultSpooner.java`
#### Snippet
```java
	}
	private String outputFolder = null;
	private String[] processors = null;
	private String[] sources = null;
	private boolean graphical = false;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/utils/sacha/impl/DefaultSpooner.java`
#### Snippet
```java
	private String outputFolder = null;
	private String[] processors = null;
	private String[] sources = null;
	private boolean graphical = false;
	
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/utils/sacha/impl/DefaultSpooner.java`
#### Snippet
```java
		Launcher.main(new String[]{"-h"});
	}
	private String outputFolder = null;
	private String[] processors = null;
	private String[] sources = null;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/utils/sacha/runner/main/TestRunnerMain.java`
#### Snippet
```java
	private static class MyTextListener extends RunListener{
		private final PrintStream fWriter;
		private int errors=0;
		private int failures=0;
		
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/utils/sacha/runner/main/TestRunnerMain.java`
#### Snippet
```java
	public static Class<?>[] classesArray = null;

	public static String eclipseTestReport = null;
	private static TestInfo runnedTests = new TestInfo();
	private static TestInfo importedTests = new TestInfo();
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/utils/sacha/runner/main/TestRunnerMain.java`
#### Snippet
```java
	 * have to be set in static{testFolder = "%path%";} on instances
	 */
	public static String testFolder = null;
	
	/**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/utils/sacha/runner/main/TestRunnerMain.java`
#### Snippet
```java
	 * can be set instead of testFolder
	 */
	public static Class<?>[] classesArray = null;

	public static String eclipseTestReport = null;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/utils/sacha/runner/main/TestRunnerMain.java`
#### Snippet
```java
		private final PrintStream fWriter;
		private int errors=0;
		private int failures=0;
		
		public MyTextListener(PrintStream writer) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/utils/sacha/classloader/enrich/EnrichableClassloader.java`
#### Snippet
```java
	List<String> addedUrls = new ArrayList<String>();
	private String M2REPO = null;
	private File metadataFolder = null;
	
	public EnrichableClassloader(URL[] urls) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/utils/sacha/classloader/enrich/EnrichableClassloader.java`
#### Snippet
```java
	
	List<String> addedUrls = new ArrayList<String>();
	private String M2REPO = null;
	private File metadataFolder = null;
	
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/RemoveNullCheckProcessor.java`
#### Snippet
```java
public class RemoveNullCheckProcessor extends AbstractProcessor<CtIf> {

    private boolean isProcessed = false;

    private int count = 0;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/RemoveNullCheckProcessor.java`
#### Snippet
```java
    private boolean isProcessed = false;

    private int count = 0;

    @Override
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/VarRetrieveAssign.java`
#### Snippet
```java

	private Date start;
	int nbError = 0;
	int nbAssignment = 0;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/VarRetrieveAssign.java`
#### Snippet
```java
	private Date start;
	int nbError = 0;
	int nbAssignment = 0;

	@Override
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/fr/inria/spirals/npefix/resi/context/Decision.java`
#### Snippet
```java
	private DecisionType decisionType;
	private int nbUse = 0;
	private boolean isUsed = false;
	private double epsilon;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/fr/inria/spirals/npefix/resi/context/Decision.java`
#### Snippet
```java
	private String valueType;
	private DecisionType decisionType;
	private int nbUse = 0;
	private boolean isUsed = false;
	private double epsilon;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/utils/sacha/impl/AbstractConfigurator.java`
#### Snippet
```java
public abstract class AbstractConfigurator implements IEclipseConfigurable {

	private File projectDir = null;
	private String projectName = null;
	private File metadataFolder = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/utils/sacha/impl/AbstractConfigurator.java`
#### Snippet
```java

	private File projectDir = null;
	private String projectName = null;
	private File metadataFolder = null;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/utils/sacha/impl/AbstractConfigurator.java`
#### Snippet
```java
	private File projectDir = null;
	private String projectName = null;
	private File metadataFolder = null;

	@Override
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/TryRegister.java`
#### Snippet
```java
	private Date start;
	private int tryNumber = 0;
	private CtVariableAccess mainContextVar = null;

	@Override
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/TryRegister.java`
#### Snippet
```java

	private Date start;
	private int tryNumber = 0;
	private CtVariableAccess mainContextVar = null;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/fr/inria/spirals/npefix/resi/context/Lapse.java`
#### Snippet
```java
	private static final long serialVersionUID = 1L;

	private static int currentUniqueId = 0;

	private final Selector strategySelector;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/fr/inria/spirals/npefix/resi/context/Lapse.java`
#### Snippet
```java
	private String testClassName;
	private String testName;
	private List<Decision> decisions = null;
	private Map<String, Object> metadata = new HashMap<>();
	private Date startDate;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/fr/inria/spirals/npefix/resi/context/Lapse.java`
#### Snippet
```java
	private Date startDate;
	private Date endDate;
	private boolean isFinished = false;
	private String[] inputSources;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/fr/inria/spirals/npefix/resi/selector/DomSelector.java`
#### Snippet
```java

	public static Strategy strategy = new NoStrat();
	public int currentIndex = 0;
	private Set<Decision> decisions = new HashSet<>();

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/utils/sacha/finder/main/TestInFolder.java`
#### Snippet
```java
public class TestInFolder{
	
	private String testFolder = null;

	public TestInFolder(String testFolder) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/utils/org/eclipse/core/internal/localstore/SafeChunkyInputStream.java`
#### Snippet
```java
	protected byte[] chunk;
	protected int chunkLength = 0;
	protected boolean endOfFile = false;
	protected InputStream input;
	protected int nextByteInBuffer = 0;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/utils/org/eclipse/core/internal/localstore/SafeChunkyInputStream.java`
#### Snippet
```java
	protected static final int BUFFER_SIZE = 8192;
	protected byte[] buffer;
	protected int bufferLength = 0;
	protected byte[] chunk;
	protected int chunkLength = 0;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/utils/org/eclipse/core/internal/localstore/SafeChunkyInputStream.java`
#### Snippet
```java
	protected int bufferLength = 0;
	protected byte[] chunk;
	protected int chunkLength = 0;
	protected boolean endOfFile = false;
	protected InputStream input;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/utils/org/eclipse/core/internal/localstore/SafeChunkyInputStream.java`
#### Snippet
```java
	protected InputStream input;
	protected int nextByteInBuffer = 0;
	protected int nextByteInChunk = 0;

	public SafeChunkyInputStream(File target) throws IOException {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/utils/org/eclipse/core/internal/localstore/SafeChunkyInputStream.java`
#### Snippet
```java
	protected boolean endOfFile = false;
	protected InputStream input;
	protected int nextByteInBuffer = 0;
	protected int nextByteInChunk = 0;

```

## RuleId[ruleID=EqualsAndHashcode]
### EqualsAndHashcode
Class has `hashCode()` defined but does not define `equals()`
in `src/main/java/fr/inria/spirals/npefix/resi/context/instance/ArrayReadInstance.java`
#### Snippet
```java
import spoon.reflect.reference.CtLocalVariableReference;

public class ArrayReadInstance<T> extends AbstractInstance<T> {

	private String variableName;
```

### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `src/main/java/fr/inria/spirals/npefix/resi/context/TryContext.java`
#### Snippet
```java
import fr.inria.spirals.npefix.resi.ExceptionStack;

public class TryContext {

	private int id = -1;
```

## RuleId[ruleID=RedundantImplements]
### RedundantImplements
Redundant interface declaration `Serializable`
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/Strategy.java`
#### Snippet
```java
public interface Strategy extends Comparable<Strategy>, Serializable{

	enum ACTION  implements Serializable {
		// initClass globally a variable
		beforeCalled,
```

## RuleId[ruleID=ExceptionNameDoesntEndWithException]
### ExceptionNameDoesntEndWithException
Exception class name `ForceReturn` does not end with 'Exception'
in `src/main/java/fr/inria/spirals/npefix/resi/exception/ForceReturn.java`
#### Snippet
```java
import fr.inria.spirals.npefix.resi.context.Decision;

public class ForceReturn extends RuntimeException {
	private Decision decision;

```

## RuleId[ruleID=InstanceofCatchParameter]
### InstanceofCatchParameter
'instanceof' on 'catch' parameter `t`
in `src/main/java/utils/sacha/impl/DefaultSpooner.java`
#### Snippet
```java
			Launcher.main(args.toArray(new String[]{}));
		} catch (Exception t) {
			throw t instanceof RuntimeException?(RuntimeException)t:new RuntimeException(t);
		}
	}
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `t`
in `src/main/java/utils/sacha/project/utils/MavenModulesMerger.java`
#### Snippet
```java
 
		}catch(Throwable t){
			throw t instanceof RuntimeException?(RuntimeException)t : new RuntimeException(t);
		}
	}
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `t`
in `src/main/java/utils/sacha/impl/GeneralToJavaCore.java`
#### Snippet
```java
			}
		}catch(Throwable t){
			throw t instanceof RuntimeException?(RuntimeException)t : new RuntimeException(t);
		}
	}
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `t`
in `src/main/java/utils/sacha/impl/GeneralToJavaCore.java`
#### Snippet
```java
			}
		}catch(Throwable t){
			throw t instanceof RuntimeException?(RuntimeException)t : new RuntimeException(t);
		}
	}
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `t`
in `src/main/java/utils/sacha/impl/GeneralToJavaCore.java`
#### Snippet
```java

		}catch(Throwable t){
			throw t instanceof RuntimeException?(RuntimeException)t : new RuntimeException(t);
		}
	}
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `src/main/java/fr/inria/spirals/npefix/resi/selector/ExplorerSelector.java`
#### Snippet
```java
			throw new NoMoreDecision();
		} catch (Throwable e) {
			if (!(e instanceof NoMoreDecision)) {
				e.printStackTrace();
			}
```

## RuleId[ruleID=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2022-11-26-13-18-13.752.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[ruleID=NonFinalFieldOfException]
### NonFinalFieldOfException
Non-final field `decision` of exception class
in `src/main/java/fr/inria/spirals/npefix/resi/exception/ForceReturn.java`
#### Snippet
```java

public class ForceReturn extends RuntimeException {
	private Decision decision;

	public ForceReturn(Decision decision) {
```

## RuleId[ruleID=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/utils/sacha/impl/DefaultSpooner.java`
#### Snippet
```java
			processorNames.add(class1.getCanonicalName());
		}
		this.setProcessors(processorNames.toArray(new String[0]));
	}

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/utils/sacha/impl/DefaultSpooner.java`
#### Snippet
```java
		
		try {
			Launcher.main(args.toArray(new String[]{}));
		} catch (Exception t) {
			throw t instanceof RuntimeException?(RuntimeException)t:new RuntimeException(t);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/utils/sacha/classloader/factory/ClassloaderFactory.java`
#### Snippet
```java
			}
		}
		return new EnrichableClassloader(urls.toArray(new URL[0]));
	}

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/utils/sacha/finder/processor/Processor.java`
#### Snippet
```java
			}
		});
		return classes.toArray(new Class[0]);
	}
	
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/fr/inria/spirals/npefix/main/patch/SortPatch.java`
#### Snippet
```java
			}
		}
		String[] parameterTypes = new String[0];
		if (object.has("parameters")) {
			JSONArray jsonParameterTypes = object.getJSONArray("parameterTypes");
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/utils/sacha/finder/classes/impl/ProjectFinder.java`
#### Snippet
```java
				classes.addAll(SourceFolderFinder.getClassesLoc(new File(url.getPath()), null));	
		}
		return classes.toArray(new String[0]);
	}

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/utils/sacha/finder/classes/impl/SourceFolderFinder.java`
#### Snippet
```java
	@Override
	public String[] getClasses() {
		return getClassesLoc(new File(srcFolder),null).toArray(new String[0]);
	}

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/utils/sacha/finder/classes/impl/ClassloaderFinder.java`
#### Snippet
```java
				classes.addAll(utils.sacha.finder.classes.impl.SourceFolderFinder.getClassesLoc(new File(url.getPath()), null));
		}
		return classes.toArray(new String[0]);
	}

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/fr/inria/spirals/npefix/main/run/Main.java`
#### Snippet
```java
		DecisionServer decisionServer = new DecisionServer(selector);
		decisionServer.startServer();
		List<String> testMethods = npefix.getTests(npeTests.toArray(new String[0]));

		NPEOutput output = new NPEOutput();
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/fr/inria/spirals/npefix/main/run/Main.java`
#### Snippet
```java
		Class<RepairStrategy> aClass = (Class<RepairStrategy>) this.getClass().getClassLoader().loadClass(this.repairStrategyClassname);
		Constructor<RepairStrategy> constructor = aClass.getConstructor(String[].class);
		return constructor.newInstance(new Object[]{sources.toArray(new String[]{})});
	}

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/fr/inria/spirals/npefix/main/run/Main.java`
#### Snippet
```java
	private NPEOutput run() throws Exception {
		repairStrategy = getRepairStrategy();
		Launcher npefix = new Launcher(sources.toArray(new String[]{}), workingDirectory + "/npefix-src", workingDirectory + "/npefix-bin", classpath, complianceLevel, repairStrategy);
		if (!new File(workingDirectory + "/npefix-bin").exists()) {
			npefix.instrument();
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/evaluation/java/fr/inria/spirals/npefix/resi/BenchmarkPaper.java`
#### Snippet
```java
            }
        }
        return tests.toArray(new Class[]{});
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/fr/inria/spirals/npefix/main/all/Launcher.java`
#### Snippet
```java
            }
        }
        return tests.toArray(new Class[]{});
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/fr/inria/spirals/npefix/main/all/Launcher.java`
#### Snippet
```java
            }
        }
        return new URLClassLoader(uRLClassPath.toArray(new URL[]{}), Thread.currentThread().getContextClassLoader());
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/utils/sacha/impl/TestRunnerCore.java`
#### Snippet
```java
			testList.add(tests[i]);
		}
		return new TestRunner().run(testList.toArray(new Class[]{}));
	}

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/TryRegister.java`
#### Snippet
```java
			args.add(getFactory().Code().createLiteral(type.getQualifiedName()));
		}
		CtConstructorCall ctx = getFactory().Code().createConstructorCall(tryTypeRef, args.toArray(new CtExpression[]{}));
		ctx.setPosition(element.getPosition());

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/utils/sacha/finder/classes/impl/ClasspathFinder.java`
#### Snippet
```java
	public String[] getClasses() {
		String classPath = System.getProperty("java.class.path");
		return findClassesInRoots(splitClassPath(classPath)).toArray(new String[0]);
	}

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/fr/inria/spirals/npefix/main/ExecutionClient.java`
#### Snippet
```java

	public static void main(String[] args) {
		ExecutionClient executionClient = new ExecutionClient(args[0], args[1], new String[0]);
		Config.CONFIG.setRandomSeed(Integer.parseInt(args[2]));
		executionClient.run();
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/utils/org/eclipse/core/internal/localstore/SafeChunkyInputStream.java`
#### Snippet
```java

	protected void resetChunk() {
		chunk = new byte[0];
		chunkLength = 0;
		nextByteInChunk = 0;
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/AbstractStrategy.java`
#### Snippet
```java
		}
		try {
			NewInstance<T> newInstance = new NewInstance<>(clazz.getCanonicalName(), new String[0], new ArrayList<Instance<?>>());
			newInstance.getValue();
			instances.add(newInstance);
```

## RuleId[ruleID=CastConflictsWithInstanceof]
### CastConflictsWithInstanceof
Cast to 'CtLocalVariableImpl' type conflicts with preceding 'instanceof CtLocalVariable' check
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/AddImplicitCastChecker.java`
#### Snippet
```java
			CtAssignment variableAssignment = getFactory().Code()
					.createVariableAssignment(
							((CtLocalVariableImpl) parent).getReference(),
							false, invocation);
			variableAssignment.setPosition(element.getPosition());
```

## RuleId[ruleID=UnusedAssignment]
### UnusedAssignment
Variable `currentIndentation` initializer `""` is redundant
in `src/main/java/fr/inria/spirals/npefix/patch/generator/Writer.java`
#### Snippet
```java
public class Writer {
	private StringBuilder content = new StringBuilder();
	String currentIndentation = "";
	private final String indentation;

```

### UnusedAssignment
Variable `instance` initializer `null` is redundant
in `src/main/java/fr/inria/spirals/npefix/resi/context/instance/InstanceFactory.java`
#### Snippet
```java

	public static Instance fromCtExpression(CtExpression expression) {
		Instance instance = null;

		if (expression == null) {
```

### UnusedAssignment
Variable `resultsRootPath` initializer `"/home/thomas/git/bandit-repair-experiments/results/2016-May/exhaustive_exploration"` is redundant
in `src/main/java/fr/inria/spirals/npefix/main/patch/SortPatch.java`
#### Snippet
```java
	 */
	public static void main(String[] args) throws Exception {
		String resultsRootPath = "/home/thomas/git/bandit-repair-experiments/results/2016-May/exhaustive_exploration";
		resultsRootPath = "output/Template";
		String resultsPath = resultsRootPath + "/results.json";
```

### UnusedAssignment
Variable `id` initializer `-1` is redundant
in `src/main/java/fr/inria/spirals/npefix/resi/context/TryContext.java`
#### Snippet
```java
public class TryContext {

	private int id = -1;
	private Class<?>[] types;
	private Class<?> context;
```

### UnusedAssignment
Variable `line` initializer `null` is redundant
in `src/main/java/utils/sacha/classloader/enrich/EnrichableClassloader.java`
#### Snippet
```java
		BufferedReader isr = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
		try {
			String line = null;
			while((line = isr.readLine())!=null){
				if(line.startsWith("org.eclipse.jdt.core.classpathVariable.M2_REPO=")){
```

### UnusedAssignment
Variable `type` initializer `"test"` is redundant
in `src/main/java/fr/inria/spirals/npefix/resi/oracle/AbstractOracle.java`
#### Snippet
```java
	private  boolean isValid;
	private String error;
	private String type = "test";

	public AbstractOracle(String type, boolean isValid)  {
```

### UnusedAssignment
Variable `parentType` initializer `null` is redundant
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/AddImplicitCastChecker.java`
#### Snippet
```java
	public void process(CtTypedElement element) {
		CtStatement parent = (CtStatement) element.getParent();
		CtTypeReference parentType = null;
		if(parent instanceof CtReturn) {
			CtMethod ctMethod = element.getParent(CtMethod.class);
```

### UnusedAssignment
Variable `decisions` initializer `null` is redundant
in `src/main/java/fr/inria/spirals/npefix/resi/context/Lapse.java`
#### Snippet
```java
	private String testClassName;
	private String testName;
	private List<Decision> decisions = null;
	private Map<String, Object> metadata = new HashMap<>();
	private Date startDate;
```

### UnusedAssignment
Variable `testFolder` initializer `null` is redundant
in `src/main/java/utils/sacha/finder/main/TestInFolder.java`
#### Snippet
```java
public class TestInFolder{
	
	private String testFolder = null;

	public TestInFolder(String testFolder) {
```

### UnusedAssignment
Variable `selection` initializer `null` is redundant
in `src/main/java/fr/inria/spirals/npefix/main/spoon/MainSpoon.java`
#### Snippet
```java
		try{
			BufferedReader br = null;
			Object selection = null;
			String[] arg = null;
			try {
```

## RuleId[ruleID=ConstantValue]
### ConstantValue
Condition `outputFolder==null` is always `false`
in `src/main/java/utils/sacha/impl/DefaultSpooner.java`
#### Snippet
```java
		if(outputFolder != null){
			args.add("-o");
			if(outputFolder==null || outputFolder.length()==0)
				throw new IllegalArgumentException("setOutputFolder can not be used with empty value");
			args.add(outputFolder);
```

### ConstantValue
Condition `t instanceof RuntimeException` is always `true`
in `src/main/java/utils/sacha/impl/DefaultSpooner.java`
#### Snippet
```java
			Launcher.main(args.toArray(new String[]{}));
		} catch (Exception t) {
			throw t instanceof RuntimeException?(RuntimeException)t:new RuntimeException(t);
		}
	}
```

### ConstantValue
Condition `currentPatch != null` is always `true`
in `src/main/java/fr/inria/spirals/npefix/main/patch/SortPatch.java`
#### Snippet
```java
			String line = lines[i];
			if (!line.startsWith("+ ")) {
				if (currentPatch != null && !currentPatch.isEmpty()) {
					output.append(currentPatch);
					currentPatch = "";
```

### ConstantValue
Condition `isEnd` is always `true`
in `src/evaluation/java/fr/inria/spirals/npefix/AbstractEvaluation.java`
#### Snippet
```java
                    Lapse lapse = result.get(i);
                    if (lapse.getOracle().getError() != null) {
                        isEnd = isEnd && lapse.getOracle().getError().contains("No more available decision");
                    } else {
                        isEnd = false;
```

### ConstantValue
Condition `true || isSameDecision` is always `true`
in `src/main/java/fr/inria/spirals/npefix/patch/generator/PatchesGenerator.java`
#### Snippet
```java
					}
				}
				if (true  || isSameDecision) {
					PatchGenerator patchGenerator = new PatchGenerator(decisionElements, spoon, offset, offsetLine);
					classContent = patchGenerator.getPatch();
```

### ConstantValue
Condition `isEnd` is always `true`
in `src/main/java/fr/inria/spirals/npefix/main/run/Main.java`
#### Snippet
```java
					Lapse lapse = result.get(i);
					if (lapse.getOracle().getError() != null) {
						isEnd = isEnd && lapse.getOracle().getError().contains(NoMoreDecision.class.getSimpleName()) || lapse.getDecisions().isEmpty();
					} else {
						isEnd = false;
```

### ConstantValue
Condition `isEnd` is always `true`
in `src/main/java/fr/inria/spirals/npefix/main/all/Launcher.java`
#### Snippet
```java
                    Lapse lapse = result.get(i);
                    if (lapse.getOracle().getError() != null) {
                        isEnd = isEnd && lapse.getOracle().getError().contains(NoMoreDecision.class.getSimpleName());
                    } else {
                        isEnd = false;
```

### ConstantValue
Condition `candidate.getParent() instanceof CtStatement ||true` is always `true`
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/TernarySplitter.java`
#### Snippet
```java
            return false;
        }
        return candidate.getParent() instanceof CtStatement ||true;
    }

```

### ConstantValue
Condition `!this.add(next)` is always `false`
in `src/main/java/fr/inria/spirals/npefix/patch/sorter/Tokens.java`
#### Snippet
```java
		for (Iterator<? extends Token> iterator = collection.iterator(); iterator.hasNext(); ) {
			Token next = iterator.next();
			if(!this.add(next)) {
				return false;
			}
```

### ConstantValue
Condition `parent instanceof CtTypedElement` is always `true`
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/AddImplicitCastChecker.java`
#### Snippet
```java
			return ctMethod.getType().isPrimitive();
		}
		if(parent instanceof CtTypedElement) {
			CtTypeReference type1 = ((CtTypedElement) parent).getType();
			if (type1 == null) {
```

### ConstantValue
Condition `isAllUsed` is always `true`
in `src/main/java/fr/inria/spirals/npefix/resi/context/NPEOutput.java`
#### Snippet
```java
				for (int j = 0; j < lapse.getDecisions().size() && isAllUsed; j++) {
					Decision decision = lapse.getDecisions().get(j);
					isAllUsed = isAllUsed && decision.isUsed();
				}
				if (isAllUsed) {
```

### ConstantValue
Value `delete` is always 'true'
in `src/main/java/fr/inria/spirals/npefix/main/spoon/MainSpoon.java`
#### Snippet
```java
			file.delete();
		}
		return delete;
	}

```

### ConstantValue
Condition `constructors.size() == 0` is always `false`
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/AbstractStrategy.java`
#### Snippet
```java
		} catch (Throwable e) {
			try{
				if(constructors.size() == 0) {
					constructors = Arrays.asList(clazz.getDeclaredConstructors());
				}
```

### ConstantValue
Condition `constructors.size() == 0` is always `false`
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/AbstractStrategy.java`
#### Snippet
```java
					constructors = Arrays.asList(clazz.getDeclaredConstructors());
				}
				if(constructors.size() == 0) {
					constructors.add(clazz.getEnclosingConstructor());
				}
```

### ConstantValue
Condition `constructors.size() == 0` is always `false`
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/AbstractStrategy.java`
#### Snippet
```java
					constructors.add(clazz.getEnclosingConstructor());
				}
				if(constructors.size() == 0) {
					//throw new ErrorInitClass("missing constructor " + clazz);
					return instances;
```

## RuleId[ruleID=StringConcatenationInsideStringBufferAppend]
### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/fr/inria/spirals/npefix/resi/oracle/TestOracle.java`
#### Snippet
```java
			Failure failure = failures.get(j);
			Throwable exception = failure.getException();
			output.append(failure.toString() + "\n");
			if(exception != null) {
				output.append(printException(exception));
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/fr/inria/spirals/npefix/resi/oracle/AbstractOracle.java`
#### Snippet
```java
	protected String printException(Throwable exception) {
		StringBuilder output = new StringBuilder();
		output.append(exception.getClass() + ": " + exception.getMessage() + "\n");
		for (int i = 0; i < exception.getStackTrace().length && i < 25; i++) {
			StackTraceElement trace = exception.getStackTrace()[i];
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/fr/inria/spirals/npefix/resi/oracle/AbstractOracle.java`
#### Snippet
```java
		for (int i = 0; i < exception.getStackTrace().length && i < 25; i++) {
			StackTraceElement trace = exception.getStackTrace()[i];
			output.append("    at " + trace.getClassName() + '.' + trace.getMethodName());
			output.append('(' + trace.getFileName() + ':' + trace.getLineNumber() + ")\n");
		}
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/fr/inria/spirals/npefix/resi/oracle/AbstractOracle.java`
#### Snippet
```java
			StackTraceElement trace = exception.getStackTrace()[i];
			output.append("    at " + trace.getClassName() + '.' + trace.getMethodName());
			output.append('(' + trace.getFileName() + ':' + trace.getLineNumber() + ")\n");
		}
		if(exception.getCause() != null) {
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/fr/inria/spirals/npefix/resi/context/Lapse.java`
#### Snippet
```java
		StringBuilder output = new StringBuilder();
		if(testClassName != null) {
			output.append(testClassName + "#" + testName + "\n");
		}

```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/fr/inria/spirals/npefix/resi/context/Lapse.java`
#### Snippet
```java
			for (int i = 0; i < decisions.size(); i++) {
				Decision decision =  decisions.get(i);
				output.append("\t" + (i + 1) + " " + decision.toString() + "\n");
			}
		}
```

## RuleId[ruleID=IOResource]
### IOResource
'Scanner' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `src/main/java/fr/inria/spirals/npefix/main/all/Launcher.java`
#### Snippet
```java
        new Thread(new Runnable() {
            public void run() {
                Scanner sc = new Scanner(src);
                while (sc.hasNextLine()) {
                    dest.println(sc.nextLine());
```

### IOResource
'DataInputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `src/main/java/utils/sacha/impl/AbstractConfigurator.java`
#### Snippet
```java
			try {
				fileInputStream = new SafeChunkyInputStream(location);
				DataInputStream dataInputStream = new DataInputStream(fileInputStream);
				String file = dataInputStream.readUTF().trim();

```

## RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `CheckLoopMain` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/utils/sacha/mains/CheckLoopMain.java`
#### Snippet
```java

/** checks that a Spoon transformation is semantic-preserving */
public class CheckLoopMain {

	public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `InstanceFactory` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/fr/inria/spirals/npefix/resi/context/instance/InstanceFactory.java`
#### Snippet
```java
import java.util.List;

public class InstanceFactory {

	public static Instance fromCtExpression(CtExpression expression) {
```

### UtilityClassWithoutPrivateConstructor
Class `RepairLoop1` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/utils/sacha/mains/RepairLoop1.java`
#### Snippet
```java

/** Is a basic example on how having the repair loop modification -> test suite (TODO Matias) */
public class RepairLoop1 {

	public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `TestRunnerMain` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/utils/sacha/mains/TestRunnerMain.java`
#### Snippet
```java

/** Runs all tests of an Eclipse project */
public class TestRunnerMain  {

	public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `TestFinderMain` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/utils/sacha/mains/TestFinderMain.java`
#### Snippet
```java

/** Runs all tests of an Eclipse project */
public class TestFinderMain  {

	public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `MergeMavenProjects` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/utils/sacha/mains/MergeMavenProjects.java`
#### Snippet
```java

/** Merges Maven projects in one single Eclipse project */
public class MergeMavenProjects {

	public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `ClassloaderFactory` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/utils/sacha/classloader/factory/ClassloaderFactory.java`
#### Snippet
```java
import java.util.List;

public class ClassloaderFactory {

	public static EnrichableClassloader getEnrichableClassloader(){
```

### UtilityClassWithoutPrivateConstructor
Class `SortPatch` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/fr/inria/spirals/npefix/main/patch/SortPatch.java`
#### Snippet
```java
import java.util.List;

public class SortPatch {

	/**
```

### UtilityClassWithoutPrivateConstructor
Class `EclipseGeneralToJavaProject` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/utils/sacha/mains/EclipseGeneralToJavaProject.java`
#### Snippet
```java

/**  Manipulates Eclipse projects (nature, classpath, etc.  **/
public class EclipseGeneralToJavaProject {

	public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `ProcessorUtility` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/ProcessorUtility.java`
#### Snippet
```java


public class ProcessorUtility {

    public static CtInvocation createStaticCall(Factory factory, Class<?> clazz, String methodName, CtExpression...arguments) {
```

### UtilityClassWithoutPrivateConstructor
Class `ExceptionStack` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/fr/inria/spirals/npefix/resi/ExceptionStack.java`
#### Snippet
```java
import java.util.List;

public class ExceptionStack {
	
	private static List<TryContext> tryContexts = new ArrayList<>();
```

### UtilityClassWithoutPrivateConstructor
Class `RandomGenerator` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/fr/inria/spirals/npefix/resi/RandomGenerator.java`
#### Snippet
```java
import java.util.Random;

public class RandomGenerator {
	public static long seed = Config.CONFIG.getRandomSeed();

```

### UtilityClassWithoutPrivateConstructor
Class `RunSpoonWithClasspath` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/utils/sacha/mains/RunSpoonWithClasspath.java`
#### Snippet
```java

/** Runs spoon in an easy manner */
public class RunSpoonWithClasspath {

	public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `TestSuiteGeneratorMain` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/utils/sacha/mains/TestSuiteGeneratorMain.java`
#### Snippet
```java

/** Generates on standard output a JUnit4 test class that runs all the test of a given Eclipse project */
public class TestSuiteGeneratorMain {

	public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `MainSpoon` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/fr/inria/spirals/npefix/main/spoon/MainSpoon.java`
#### Snippet
```java


public class MainSpoon {

	public static void main(String[] args) {
```

## RuleId[ruleID=ManualArrayToCollectionCopy]
### ManualArrayToCollectionCopy
Manual array to collection copy
in `src/main/java/utils/sacha/classloader/enrich/EnrichableClassloader.java`
#### Snippet
```java
					tmp = getEclipseClassPath(folderPath,folderPaths);
					if(tmp!=null && !tmp.isEmpty())
						for (String entry : tmp.split(File.pathSeparator)) {
							paths.add(entry);
						}
```

## RuleId[ruleID=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `src/main/java/utils/sacha/mains/TestFinderMain.java`
#### Snippet
```java
		Class<?>[] tests = finder.findTestClasses();
		for (Class<?> clazz : tests) {
			System.out.println(clazz);;
		}

```

## RuleId[ruleID=DataFlowIssue]
### DataFlowIssue
Method invocation `openStream` may produce `NullPointerException`
in `src/main/java/fr/inria/spirals/npefix/config/Config.java`
#### Snippet
```java
	private Config() {
		try {
			properties.load(getClass().getResource("/config.ini").openStream());

			this.timeoutIteration = Integer.parseInt(properties.getProperty(ITERATION_TIMEOUT));
```

### DataFlowIssue
Method invocation `close` may produce `NullPointerException`
in `src/main/java/utils/sacha/impl/GeneralToJavaCore.java`
#### Snippet
```java
						"</classpath>");
			} finally {
				out.close();
			}
		}catch(Throwable t){
```

### DataFlowIssue
Method invocation `close` may produce `NullPointerException`
in `src/main/java/utils/sacha/impl/GeneralToJavaCore.java`
#### Snippet
```java
						"\norg.eclipse.jdt.core.compiler.source=1.7\norg.eclipse.jdt.core.compiler.compliance=1.7");
			} finally {
				out.close();
			}
		}catch(Throwable t){
```

### DataFlowIssue
Dereference of `currentPath.listFiles()` may produce `NullPointerException`
in `src/main/java/utils/sacha/classloader/enrich/EnrichableClassloader.java`
#### Snippet
```java
				currentPath = currentPath.getParentFile();
			while(currentPath!=null && currentPath.exists()){
				for (File file : currentPath.listFiles()) {
					if(file.getName().equals(".classpath")){
						if(workspaceLoc==null)
```

### DataFlowIssue
Dereference of `projectFolder.listFiles()` may produce `NullPointerException`
in `src/main/java/utils/sacha/classloader/enrich/EnrichableClassloader.java`
#### Snippet
```java
										File projectFolder=new File(currentPathString);
										if(projectFolder.exists() && projectFolder.isDirectory()){
											for (File file1 : projectFolder.listFiles()) {
												if(file1.getName().equals(".classpath")){
													FileInputStream reader1 = new FileInputStream(file1);
```

### DataFlowIssue
Method invocation `setDecisionType` may produce `NullPointerException`
in `src/main/java/fr/inria/spirals/npefix/resi/selector/GreedySelector.java`
#### Snippet
```java
			}
			usedDecisions.add(bestDecision);
			bestDecision.setDecisionType(BEST);
			getCurrentLapse().putMetadata("strategy_selection", "best");
			bestDecision.setEpsilon(epsilon);
```

### DataFlowIssue
Dereference of `testSrcFolder.listFiles()` may produce `NullPointerException`
in `src/main/java/utils/sacha/finder/classes/impl/SourceFolderFinder.java`
#### Snippet
```java
	static List<String> getClassesLoc(File testSrcFolder,String pack) {
		List<String> classes = new ArrayList<>();
		for (File file : testSrcFolder.listFiles()) {
			if(file.isDirectory())
				classes.addAll(getClassesLoc(file, pack==null?file.getName():pack+'.'+file.getName()));
```

### DataFlowIssue
Method invocation `replaceAll` may produce `NullPointerException`
in `src/main/java/fr/inria/spirals/npefix/patch/generator/PatchesGenerator.java`
#### Snippet
```java
		}

		return diff.replaceAll("\n\\\\ No newline at end of file", "");
	}

```

### DataFlowIssue
Method invocation `getClassName` may produce `NullPointerException`
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/BlockCoverage.java`
#### Snippet
```java
	public static void aBlock(boolean isExecutableBlock, int line, int sourceStart, int sourceEnd) {
		Location location = CallChecker.getLocation(line, sourceStart, sourceEnd);
		final String output = new Date().getTime() + "\t" + location.getClassName() + "\t" + location.getLine() + "\t" + location.getSourceStart() + "\t" + location.getSourceEnd();
		if (isExecutableBlock) {
			try (FileWriter writer = new FileWriter("method-output.csv", true)) {
```

### DataFlowIssue
Casting `body` to `CtBlock` may produce `ClassCastException`
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/VarRetrieveAssign.java`
#### Snippet
```java
						((CtLoop) parent).setBody(getFactory().Code().createCtBlock(body));
					}
					((CtBlock)body).insertBegin(invoc);
				} else {
					parent.insertAfter(invoc);
```

### DataFlowIssue
Casting `target` to `CtInvocation` may produce `ClassCastException`
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/VarRetrieveAssign.java`
#### Snippet
```java
				target = ((CtTargetedExpression) target).getTarget();
			}
			CtElement ctElement = (CtElement) ((CtInvocation) target).getArguments().get(0);
			if(ctElement instanceof CtArrayAccess) {
				target = getTargetInINPECheck(((CtArrayAccess) ctElement).getTarget());
```

### DataFlowIssue
Method invocation `getClassName` may produce `NullPointerException`
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/NotNullTracer.java`
#### Snippet
```java
	public static void anIf(boolean value, String expression, int line, int sourceStart, int sourceEnd) {
		Location location = CallChecker.getLocation(line, sourceStart, sourceEnd);
		final String output = new Date().getTime() + "\t" + location.getClassName() + "\t" + location.getLine() + "\t" + location.getSourceStart() + "\t" + location.getSourceEnd() + "\t" + value + "\t" + expression;
		try (FileWriter writer = new FileWriter("instrumentation-output.csv", true)) {
			writer.write(output + System.getProperty("line.separator"));
```

### DataFlowIssue
Result of 'max' is the same as the first argument making the call meaningless
in `src/main/java/fr/inria/spirals/npefix/patch/sorter/Experiment.java`
#### Snippet
```java
		for (int i = 0; i < patchTokens.fullSize(); i++) {
			Token token = patchTokens.get(i);
			Tokens predicate = patchTokens.subList(Math.max(i - n + 1, 0), Math.max(i, 0));
			if (predicate.isEmpty()) {
				result[i] = 1;
```

### DataFlowIssue
Array access `arg[0]` may produce `NullPointerException`
in `src/main/java/fr/inria/spirals/npefix/main/spoon/MainSpoon.java`
#### Snippet
```java
			ISpooner spooner = new DefaultSpooner();
			//project config
			spooner.setEclipseProject(arg[0]);
			spooner.setEclipseMetadataFolder("/home/thomas/workspace/.metadata");
			String[] srcs = arg[1].split(":");
```

### DataFlowIssue
Dereference of `file.listFiles()` may produce `NullPointerException`
in `src/main/java/fr/inria/spirals/npefix/main/spoon/MainSpoon.java`
#### Snippet
```java
		if (file.exists()) {
			if (file.isDirectory())
				for (File child : file.listFiles()) {
					delete &= recursifDeleteJavaFiles(child);
				}
```

### DataFlowIssue
Dereference of `element.listFiles()` may produce `NullPointerException`
in `src/evaluation/java/fr/inria/spirals/npefix/resi/NPEFixTemplateEvaluation.java`
#### Snippet
```java
	public static void deleteFile(File element) {
		if (element.isDirectory()) {
			for (File sub : element.listFiles()) {
				deleteFile(sub);
			}
```

## RuleId[ruleID=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
Call to `substring()` is redundant
in `src/main/java/utils/sacha/finder/classes/impl/SourceFolderFinder.java`
#### Snippet
```java
			else if(file.getName().endsWith(".java")){
				String className= pack==null?file.getName():pack+'.'+file.getName();
				className = className.substring(0, className.length());
				classes.add(className);
			}else if(file.getName().endsWith(".class")){
```

### StringOperationCanBeSimplified
Call to `substring()` is redundant
in `src/main/java/utils/sacha/finder/classes/impl/SourceFolderFinder.java`
#### Snippet
```java
			}else if(file.getName().endsWith(".class")){
				String className= pack==null?file.getName():pack+'.'+file.getName();
				className = className.substring(0, className.length());
				classes.add(className);
			}
```

### StringOperationCanBeSimplified
Call to `substring()` is redundant
in `src/main/java/utils/sacha/finder/main/Main.java`
#### Snippet
```java
	protected static String checkFolder(String testFolder) {
	if(testFolder.endsWith("/")||testFolder.endsWith("\\"))
		testFolder=testFolder.substring(0, testFolder.length());
	
	File testSrcFolder = new File(testFolder);
```

## RuleId[ruleID=RedundantCollectionOperation]
### RedundantCollectionOperation
Unnecessary 'contains()' check
in `src/main/java/fr/inria/spirals/npefix/resi/selector/MonoExplorerSelector.java`
#### Snippet
```java
				this.decisions.put(decision.getLocation(), new HashSet<Decision>());
			}
			if(!this.decisions.get(decision.getLocation()).contains(decision)) {
				this.decisions.get(decision.getLocation()).add(decision);
			}
```

### RedundantCollectionOperation
Unnecessary 'contains()' check
in `src/main/java/fr/inria/spirals/npefix/resi/selector/ExplorerSelector.java`
#### Snippet
```java
				this.decisions.put(decision.getLocation(), new HashSet<Decision>());
			}
			if(!this.decisions.get(decision.getLocation()).contains(decision)) {
				this.decisions.get(decision.getLocation()).add(decision);
			}
```

## RuleId[ruleID=CatchMayIgnoreException]
### CatchMayIgnoreException
Empty `catch` block
in `src/main/java/fr/inria/spirals/npefix/main/patch/SortPatch.java`
#### Snippet
```java
					value = new PrimitiveInstance<>(primitiveValue);
				}
			} catch (RuntimeException e) {

			}
```

### CatchMayIgnoreException
Empty `catch` block
in `src/main/java/utils/sacha/classloader/enrich/EnrichableClassloader.java`
#### Snippet
```java
			try {
				isr.close();
			} catch (IOException e) {
			}
		}
```

## RuleId[ruleID=ProtectedMemberInFinalClass]
### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/utils/TestClassesFinder.java`
#### Snippet
```java
    }

    protected String[] namesFrom(Collection<Class<?>> classes) {
        String[] names = new String[classes.size()];
        int index = 0;
```

## RuleId[ruleID=ThreadRun]
### ThreadRun
Calls to `run()` should probably be replaced with 'start()'
in `src/main/java/fr/inria/spirals/npefix/main/DecisionServer.java`
#### Snippet
```java

		});
		thread.run();
	}

```

## RuleId[ruleID=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/fr/inria/spirals/npefix/resi/oracle/TestOracle.java`
#### Snippet
```java
			Failure failure = failures.get(j);
			Throwable exception = failure.getException();
			output.append(failure.toString() + "\n");
			if(exception != null) {
				output.append(printException(exception));
```

## RuleId[ruleID=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `MyTextListener` may be 'static'
in `src/main/java/utils/sacha/runner/main/TestRunner.java`
#### Snippet
```java
		}
	}
	private class MyTextListener extends RunListener{
		private final PrintStream fWriter;
		
```

### InnerClassMayBeStatic
Inner class `NpePosition` may be 'static'
in `src/evaluation/java/fr/inria/spirals/npefix/resi/NPEFixTemplateEvaluation.java`
#### Snippet
```java
    }

    private class NpePosition {
        private String classname;
        private int start;
```

## RuleId[ruleID=SuspiciousMethodCalls]
### SuspiciousMethodCalls
'List' may not contain objects of type 'ArrayList'
in `src/main/java/fr/inria/spirals/npefix/main/run/Main.java`
#### Snippet
```java
						// passing tests can be ignored
						testMethods.remove(lapse.getTestClassName() + "#" + lapse.getTestName());
						result.remove(lapses);
					}
				}
```

### SuspiciousMethodCalls
'Map' may not contain keys of type 'Location'
in `src/main/java/fr/inria/spirals/npefix/resi/context/Lapse.java`
#### Snippet
```java
			JSONObject locationJSON = location.toJSON();

			Integer executionCount = nbApplication.get(location);
			if (executionCount == null) {
				executionCount = 0;
```

## RuleId[ruleID=WrongPackageStatement]
### WrongPackageStatement
Package name 'fr.inria.spirals.npefix.resi.selector' does not correspond to the file path 'fr.inria.spirals.npefix'
in `src/evaluation/java/fr/inria/spirals/npefix/SafeMonoEvaluation.java`
#### Snippet
```java
package fr.inria.spirals.npefix.resi.selector;

import org.junit.Before;
```

## RuleId[ruleID=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `src/main/java/utils/sacha/impl/AbstractConfigurator.java`
#### Snippet
```java
     */
	@SuppressWarnings("resource")
	private File getProjectLocation(){
		if(projectName==null || metadataFolder==null){
			throw new IllegalArgumentException("you have to use setEclipseProject and setEclipseMetadataFolder before");
```

## RuleId[ruleID=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/utils/sacha/utils/SachaDocumentationGenerator.java`
#### Snippet
```java
  @Override
  public void process() {
    System.out.println("Generated Documentation of sacha-infrastructure\n"+
                       "===============================================\n"+
    		           "(generated with sacha.utils.SachaDocumentationGenerator)\n\n"+
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/utils/sacha/utils/SachaDocumentationGenerator.java`
#### Snippet
```java
      if ("sacha.mains".equals(pack2.getQualifiedName())) {
        for (CtClass c : pack2.getElements(new TypeFilter<CtClass>(CtClass.class))) {
          System.out.println("\n-------------------\n"+c.getSimpleName()+": " + c.getDocComment());
        }
      }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/fr/inria/spirals/npefix/resi/context/instance/InstanceFactory.java`
#### Snippet
```java
		} else {
			instance = new PrimitiveInstance(expression.toString());
			System.err.println(expression.getType() + " not handled");
		}
		return instance;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/spirals/npefix/main/all/DefaultRepairStrategy.java`
#### Snippet
```java
			if (result.getRunCount() > 0) {
				if (oracle.isValid() || !oracle.getError().contains(NoMoreDecision.class.getSimpleName())) {
					System.out.println(lapse);
				}
				output.add(lapse);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/utils/sacha/mains/TestRunnerMain.java`
#### Snippet
```java
		// runs the test folder
		ITestResult res = runner.runAllTestsInClasspath();
		System.out.println(res.getNbRunTests());
		System.out.println(res.getNbFailedTests());

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/utils/sacha/mains/TestRunnerMain.java`
#### Snippet
```java
		ITestResult res = runner.runAllTestsInClasspath();
		System.out.println(res.getNbRunTests());
		System.out.println(res.getNbFailedTests());

	}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/utils/sacha/mains/TestFinderMain.java`
#### Snippet
```java
		Class<?>[] tests = finder.findTestClasses();
		for (Class<?> clazz : tests) {
			System.out.println(clazz);;
		}

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/spirals/npefix/main/DecisionServer.java`
#### Snippet
```java

			Selector selector = new ExplorerSelector(new Strat4(ReturnType.NULL), new Strat4(ReturnType.VAR), new Strat4(ReturnType.NEW), new Strat4(ReturnType.VOID));
			System.out.println("Start selector " + selector);

			startRMI(selector);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/VarRetrieveInit.java`
#### Snippet
```java
	@Override
	public void processingDone() {
		System.out.println("VarInit --> "+ nbVarInit + " in " + (new Date().getTime() - start.getTime()) + "ms");
	}

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/utils/sacha/runner/utils/TestInfo.java`
#### Snippet
```java

	public static void compare(TestInfo runnedTests, TestInfo importedTests) {
		System.out.println("runned : "+runnedTests.countRun+" / imported : "+importedTests.countRun);
//		int diff = runnedTests.count>importedTests.count?runnedTests.count-importedTests.count:importedTests.count-runnedTests.count;
//		if(diff>0)
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/utils/sacha/runner/utils/TestInfo.java`
#### Snippet
```java
		for (String string : importedClasses) {
			if(!runnedClasses.contains(string)){
				System.err.print("imported not runned : "+string);
				System.err.println(" number of tests : "+importedTests.get(string).size());
				total+=importedTests.get(string).size();
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/utils/sacha/runner/utils/TestInfo.java`
#### Snippet
```java
			if(!runnedClasses.contains(string)){
				System.err.print("imported not runned : "+string);
				System.err.println(" number of tests : "+importedTests.get(string).size());
				total+=importedTests.get(string).size();
			}
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/utils/sacha/runner/utils/TestInfo.java`
#### Snippet
```java
		}
		if(total>0)
			System.err.println("\ttotal number : "+total);
		total = 0;
		for (String string : runnedClasses) {
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/utils/sacha/runner/utils/TestInfo.java`
#### Snippet
```java
		for (String string : runnedClasses) {
			if(!importedClasses.contains(string)){
				System.err.print("runned not imported : "+string);
				System.err.println(" number of tests : "+runnedTests.get(string).size());
				total+=runnedTests.get(string).size();
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/utils/sacha/runner/utils/TestInfo.java`
#### Snippet
```java
			if(!importedClasses.contains(string)){
				System.err.print("runned not imported : "+string);
				System.err.println(" number of tests : "+runnedTests.get(string).size());
				total+=runnedTests.get(string).size();
			}
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/utils/sacha/runner/utils/TestInfo.java`
#### Snippet
```java
		}
		if(total>0)
			System.err.println("\ttotal number : "+total);
	}

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/utils/sacha/runner/main/TestRunnerMain.java`
#### Snippet
```java
		JUnitCore runner = new JUnitCore();
		
		MyTextListener listener = new MyTextListener(System.out);

		runner.addListener(listener);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/utils/sacha/runner/main/TestRunnerMain.java`
#### Snippet
```java
			});
		Result result = runner.run(classesArray);
		System.out.println("IGNORED ("+result.getIgnoreCount()+" test"+(result.getIgnoreCount()>1?"s":"")+")\n");
		
		System.out.println("///////////////////////////  results  \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/utils/sacha/runner/main/TestRunnerMain.java`
#### Snippet
```java
		System.out.println("IGNORED ("+result.getIgnoreCount()+" test"+(result.getIgnoreCount()>1?"s":"")+")\n");
		
		System.out.println("///////////////////////////  results  \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
		if(eclipseTestReport!=null)
			compareTests(eclipseTestReport);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/spirals/npefix/main/patch/SortPatch.java`
#### Snippet
```java
			PatchesGenerator patchesGenerator = new PatchesGenerator(decisions, spoon, new String[] {projectSourcePath});
			String diff = patchesGenerator.getDiff();
			System.out.println(diff);
			((JSONObject) execution).put("diff", diff);
			String patch = getChange(diff);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/spirals/npefix/main/patch/SortPatch.java`
#### Snippet
```java
			try {
				double score = experiment.probabilityPatch(new File(projectSourcePath), 3, new FullTokenizer(), patch);
				System.out.println(score);
				if (Double.isInfinite(score)) {
					((JSONObject) execution).put("score", Double.MAX_VALUE);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/spirals/npefix/main/patch/SortPatch.java`
#### Snippet
```java
			} catch (Exception e) {
				diff = patchesGenerator.getDiff();
				System.out.println(diff);
				((JSONObject) execution).put("diff", diff);
				patch = getChange(diff);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/spirals/npefix/main/patch/SortPatch.java`
#### Snippet
```java
				patch = getChange(diff);
				e.printStackTrace();
				System.out.println(patch);
			}
		}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/spirals/npefix/main/patch/SortPatch.java`
#### Snippet
```java
				//continue;
			}
			System.out.println(project);
			long version = root.getLong(project);
			String projectResultPath = resultsRootPath + "/" + project + "/" + version + ".json";
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/spirals/npefix/resi/context/TryContext.java`
#### Snippet
```java
				this.types[i++] = classLoader.loadClass(str);
			} catch (ClassNotFoundException e) {
				System.out.println(e);
				//throw new RuntimeException(e);
			}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/evaluation/java/fr/inria/spirals/npefix/AbstractEvaluation.java`
#### Snippet
```java
                continue;
            }
            System.out.println("Multirun " + output.size() + "/" + nbIteration + " " + ((int)(output.size()/(double)nbIteration * 100)) + "%");
        }
        output.setEnd(new Date());
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/evaluation/java/fr/inria/spirals/npefix/main/MainEvaluation.java`
#### Snippet
```java
		JSAPResult config = jsap.parse(args);
		if (!config.success()) {
			System.err.println();
			for (Iterator<?> errs = config.getErrorMessageIterator(); errs
					.hasNext(); ) {
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/evaluation/java/fr/inria/spirals/npefix/main/MainEvaluation.java`
#### Snippet
```java
			for (Iterator<?> errs = config.getErrorMessageIterator(); errs
					.hasNext(); ) {
				System.err.println("Error: " + errs.next());
			}
			showUsage();
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/evaluation/java/fr/inria/spirals/npefix/main/MainEvaluation.java`
#### Snippet
```java

	private static void showUsage() {
		System.err.println();
		System.err.println("Usage: java -jar npefix.jar");
		System.err.println("                          " + jsap.getUsage());
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/evaluation/java/fr/inria/spirals/npefix/main/MainEvaluation.java`
#### Snippet
```java
	private static void showUsage() {
		System.err.println();
		System.err.println("Usage: java -jar npefix.jar");
		System.err.println("                          " + jsap.getUsage());
		System.err.println();
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/evaluation/java/fr/inria/spirals/npefix/main/MainEvaluation.java`
#### Snippet
```java
		System.err.println();
		System.err.println("Usage: java -jar npefix.jar");
		System.err.println("                          " + jsap.getUsage());
		System.err.println();
		System.err.println(jsap.getHelp());
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/evaluation/java/fr/inria/spirals/npefix/main/MainEvaluation.java`
#### Snippet
```java
		System.err.println("Usage: java -jar npefix.jar");
		System.err.println("                          " + jsap.getUsage());
		System.err.println();
		System.err.println(jsap.getHelp());
	}
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/evaluation/java/fr/inria/spirals/npefix/main/MainEvaluation.java`
#### Snippet
```java
		System.err.println("                          " + jsap.getUsage());
		System.err.println();
		System.err.println(jsap.getHelp());
	}

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/evaluation/java/fr/inria/spirals/npefix/main/MainEvaluation.java`
#### Snippet
```java

	public static void main(String[] args) {
		System.out.println("CONFIGURATION:");
		for (int i = 0; i < args.length; i++) {
			String arg = args[i];
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/evaluation/java/fr/inria/spirals/npefix/main/MainEvaluation.java`
#### Snippet
```java
		for (int i = 0; i < args.length; i++) {
			String arg = args[i];
			System.out.println(arg);
		}
		System.out.println("END CONFIGURATION\n");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/evaluation/java/fr/inria/spirals/npefix/main/MainEvaluation.java`
#### Snippet
```java
			System.out.println(arg);
		}
		System.out.println("END CONFIGURATION\n");
		try {
			initJSAP();
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/evaluation/java/fr/inria/spirals/npefix/main/MainEvaluation.java`
#### Snippet
```java
			}
		} catch (NoSuchMethodException e) {
			System.err.println("The project is not found");
		} catch (Exception e) {
			e.printStackTrace();
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/utils/sacha/classloader/enrich/EnrichableClassloader.java`
#### Snippet
```java
										currentPathString = currentPathString.replaceFirst("M2_REPO", getM2REPO());
									else{
										System.err.println("cannot resolve : "+currentPathString);
										continue;
									}
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/utils/sacha/classloader/enrich/EnrichableClassloader.java`
#### Snippet
```java
			}
		}catch(Exception e){
	    	System.err.println("will use default classpath due to :"+e);
		}
		return classpaths;
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/fr/inria/spirals/npefix/patch/generator/PatchesGenerator.java`
#### Snippet
```java
					offsetLine = patchGenerator.getOffsetLine();
				} else {
					System.err.println("Big problem need ternary");
				}
			} else {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/RemoveNullCheckProcessor.java`
#### Snippet
```java
    @Override
    public void processingDone() {
        System.out.println("Remove " + count + " if null check");
    }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/spirals/npefix/main/run/Main.java`
#### Snippet
```java
				continue;
			}
			System.out.println("Multirun " + output.size() + "/" + nbIteration + " " + ((int)(output.size()/(double)nbIteration * 100)) + "%");
		}
		output.setEnd(new Date());
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/fr/inria/spirals/npefix/main/run/Main.java`
#### Snippet
```java
		JSAPResult jsapConfig = jsap.parse(args);
		if (!jsapConfig.success()) {
			System.err.println();
			for (Iterator<?> errs = jsapConfig.getErrorMessageIterator(); errs.hasNext(); ) {
				System.err.println("Error: " + errs.next());
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/fr/inria/spirals/npefix/main/run/Main.java`
#### Snippet
```java
			System.err.println();
			for (Iterator<?> errs = jsapConfig.getErrorMessageIterator(); errs.hasNext(); ) {
				System.err.println("Error: " + errs.next());
			}
			showUsage();
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/fr/inria/spirals/npefix/main/run/Main.java`
#### Snippet
```java

	private void showUsage() {
		System.err.println();
		System.err.println("Usage: java -jar npefix.jar");
		System.err.println("                          " + jsap.getUsage());
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/fr/inria/spirals/npefix/main/run/Main.java`
#### Snippet
```java
	private void showUsage() {
		System.err.println();
		System.err.println("Usage: java -jar npefix.jar");
		System.err.println("                          " + jsap.getUsage());
		System.err.println();
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/fr/inria/spirals/npefix/main/run/Main.java`
#### Snippet
```java
		System.err.println();
		System.err.println("Usage: java -jar npefix.jar");
		System.err.println("                          " + jsap.getUsage());
		System.err.println();
		System.err.println(jsap.getHelp());
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/fr/inria/spirals/npefix/main/run/Main.java`
#### Snippet
```java
		System.err.println("Usage: java -jar npefix.jar");
		System.err.println("                          " + jsap.getUsage());
		System.err.println();
		System.err.println(jsap.getHelp());
	}
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/fr/inria/spirals/npefix/main/run/Main.java`
#### Snippet
```java
		System.err.println("                          " + jsap.getUsage());
		System.err.println();
		System.err.println(jsap.getHelp());
	}

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/BlockCoverage.java`
#### Snippet
```java
	@Override
	public void processingDone() {
		System.out.println("BlockCoverage in " + (new Date().getTime() - start.getTime()) + "ms");
		try (FileWriter writer = new FileWriter("instrumentation-block-coverage.txt")) {
			writer.write("counterInstrumentation\tcounterMethod\tcounterBlock" + System
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/VarRetrieveAssign.java`
#### Snippet
```java
	@Override
	public void processingDone() {
		System.out.println("Assign --> " + nbAssignment + " (failed: "+ nbError +")" + " in " + (new Date().getTime() - start.getTime()) + "ms");
	}

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/NotNullTracer.java`
#### Snippet
```java
	@Override
	public void processingDone() {
		System.out.println("NotNullTracer in " + (new Date().getTime() - start.getTime()) + "ms");
		try (FileWriter writer = new FileWriter("instrumentation-counter.txt")) {
			writer.write("counterInstrumentation\tcounterCheckNull\tcounterCheckNotNull" + System.getProperty("line.separator"));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/CheckNotNull.java`
#### Snippet
```java
	@Override
	public void processingDone() {
		System.out.println("CheckNotNull  in " + (new Date().getTime() - start.getTime()) + "ms");
	}

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/CheckNotNull.java`
#### Snippet
```java
			}
		} else {
			System.out.println(parent);
		}
		for (int i = 0; i < notNullElements.size(); i++) {
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/CheckNotNull.java`
#### Snippet
```java
			return getNotNullElements(((CtAssignment) notNullElement).getAssigned(), ctElement);
		} else {
			System.err.println(notNullElement);
		}
		return notNulls;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/evaluation/java/fr/inria/spirals/npefix/resi/BenchmarkPaper.java`
#### Snippet
```java
        double executionTimeTransformed = runBench("spojo", source, test, deps);

        System.out.println("Execution time normal " + executionTime);
        System.out.println("Execution time transformed " + executionTimeTransformed);
        System.out.println("Overhead " + (int)((executionTimeTransformed-executionTime)/executionTime * 100)  + "%");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/evaluation/java/fr/inria/spirals/npefix/resi/BenchmarkPaper.java`
#### Snippet
```java

        System.out.println("Execution time normal " + executionTime);
        System.out.println("Execution time transformed " + executionTimeTransformed);
        System.out.println("Overhead " + (int)((executionTimeTransformed-executionTime)/executionTime * 100)  + "%");
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/evaluation/java/fr/inria/spirals/npefix/resi/BenchmarkPaper.java`
#### Snippet
```java
        System.out.println("Execution time normal " + executionTime);
        System.out.println("Execution time transformed " + executionTimeTransformed);
        System.out.println("Overhead " + (int)((executionTimeTransformed-executionTime)/executionTime * 100)  + "%");
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/evaluation/java/fr/inria/spirals/npefix/resi/BenchmarkPaper.java`
#### Snippet
```java
        double executionTimeTransformed = runBench("commonsCodec", source, test, deps);

        System.out.println("Execution time normal " + executionTime);
        System.out.println("Execution time transformed " + executionTimeTransformed);
        System.out.println("Overhead " + (int)((executionTimeTransformed-executionTime)/executionTime * 100)  + "%");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/evaluation/java/fr/inria/spirals/npefix/resi/BenchmarkPaper.java`
#### Snippet
```java

        System.out.println("Execution time normal " + executionTime);
        System.out.println("Execution time transformed " + executionTimeTransformed);
        System.out.println("Overhead " + (int)((executionTimeTransformed-executionTime)/executionTime * 100)  + "%");
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/evaluation/java/fr/inria/spirals/npefix/resi/BenchmarkPaper.java`
#### Snippet
```java
        System.out.println("Execution time normal " + executionTime);
        System.out.println("Execution time transformed " + executionTimeTransformed);
        System.out.println("Overhead " + (int)((executionTimeTransformed-executionTime)/executionTime * 100)  + "%");
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/evaluation/java/fr/inria/spirals/npefix/resi/BenchmarkPaper.java`
#### Snippet
```java
        double executionTimeTransformed = runBench("commonsOkio", source, test, deps);

        System.out.println("Execution time normal " + executionTime);
        System.out.println("Execution time transformed " + executionTimeTransformed);
        System.out.println("Overhead " + (int)((executionTimeTransformed-executionTime)/executionTime * 100)  + "%");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/evaluation/java/fr/inria/spirals/npefix/resi/BenchmarkPaper.java`
#### Snippet
```java

        System.out.println("Execution time normal " + executionTime);
        System.out.println("Execution time transformed " + executionTimeTransformed);
        System.out.println("Overhead " + (int)((executionTimeTransformed-executionTime)/executionTime * 100)  + "%");
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/evaluation/java/fr/inria/spirals/npefix/resi/BenchmarkPaper.java`
#### Snippet
```java
        System.out.println("Execution time normal " + executionTime);
        System.out.println("Execution time transformed " + executionTimeTransformed);
        System.out.println("Overhead " + (int)((executionTimeTransformed-executionTime)/executionTime * 100)  + "%");
    }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/spirals/npefix/main/all/Launcher.java`
#### Snippet
```java
                final Process process = processBuilder.start();
                // print the output to the current console
                inheritIO(process.getInputStream(), System.out);
                inheritIO(process.getErrorStream(), System.err);
                // wait the end of the process
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/fr/inria/spirals/npefix/main/all/Launcher.java`
#### Snippet
```java
                // print the output to the current console
                inheritIO(process.getInputStream(), System.out);
                inheritIO(process.getErrorStream(), System.err);
                // wait the end of the process
                process.waitFor();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/spirals/npefix/main/all/Launcher.java`
#### Snippet
```java
        for (int i = 0; i < strategies.length; i++) {
            Strategy strategy = strategies[i];
            System.out.println(strategy);
            DomSelector.strategy = strategy;
            NPEOutput run = run(selector, tests);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/spirals/npefix/main/all/Launcher.java`
#### Snippet
```java
                continue;
            }
            System.out.println("Multirun " + output.size() + "/" + nbIteration + " " + ((int)(output.size()/(double)nbIteration * 100)) + "%");
        }
        output.setStart(initEndDate);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/spirals/npefix/resi/context/Decision.java`
#### Snippet
```java
		output.put("nbUse", nbUse);
		if (value == null) {
			System.out.println(strategy);
		} else {
			output.put("value", value.toJSON());
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/TernarySplitter.java`
#### Snippet
```java
    @Override
    public void processingDone() {
        System.out.println("TernarySplitter  in " + (new Date().getTime() - start.getTime()) + "ms");
    }

```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/TernarySplitter.java`
#### Snippet
```java
            return;
        } else {
            System.err.println(parent);
            throw new RuntimeException("Other " + parent.getClass());
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/spirals/npefix/patchTemplate/VariableFinder.java`
#### Snippet
```java
					CtStatement ctStatement = e.getStatements().get(i);
					if (ctStatement.getPosition() == null) {
						System.out.println(ctStatement);
					}
					if (ctStatement.getPosition() != null
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/evaluation/java/fr/inria/spirals/npefix/resi/NPEDataset.java`
#### Snippet
```java
        }
        bestStrategies += " with " + minFailing + " failing tests";
        System.out.println(bestStrategies);
        Assert.assertEquals("The best strategies " + bestStrategies, 0, minFailing);
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/evaluation/java/fr/inria/spirals/npefix/resi/NPEDataset.java`
#### Snippet
```java
        };
        NPEOutput results = runProject(COLLECTIONS_360, source, test, deps);
        System.out.println(results);
        boolean start1AOk = results.getExecutionsForStrategy(new Strat1A()).getFailureCount() == 0;
        Assert.assertFalse("Start1A did not work on collections360", start1AOk);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/evaluation/java/fr/inria/spirals/npefix/resi/NPEDataset.java`
#### Snippet
```java

        NPEOutput executionsForStrategy = results.getExecutionsForStrategy(new Strat2A());
        System.out.println(executionsForStrategy.size());
        //Assert.assertTrue("Start2A empty search space on collections360", executionsForStrategy.isEmpty());

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/evaluation/java/fr/inria/spirals/npefix/resi/NPEDataset.java`
#### Snippet
```java

        NPEOutput executionsForStrategy1 = results.getExecutionsForStrategy(new Strat2B());
        System.out.println(executionsForStrategy1.size());
        //Assert.assertTrue("Start2B empty search space on collections360", executionsForStrategy1.isEmpty());

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/evaluation/java/fr/inria/spirals/npefix/resi/selector/AbstractSelectorEvaluation.java`
#### Snippet
```java
		int nbFailing = results.getFailureCount();
		String output = "The selector " + selector + " finishes with " + nbFailing + " failing tests";
		System.out.println(output);
		Assert.assertTrue(output, nbFailing != results.size());
	}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/TryRegister.java`
#### Snippet
```java
	@Override
	public void processingDone() {
		System.out.println("TryRegister # Try: " + tryNumber + " in " + (new Date().getTime() - start.getTime()) + "ms");
	}

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/AddImplicitCastChecker.java`
#### Snippet
```java
		CtTypeReference type = candidate.getType();
		if(type == null) {
			System.out.println(parent);
			return false;
		}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/AddImplicitCastChecker.java`
#### Snippet
```java
	@Override
	public void processingDone() {
		System.out.println("AddImplicitCastChecker --> " + nbImplicitCast + " in " + (new Date().getTime() - start.getTime()) + "ms");
	}

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/VariableFor.java`
#### Snippet
```java
	@Override
	public void processingDone() {
		System.out.println("VariableFor in " + (new Date().getTime() - start.getTime()) + "ms");
	}

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/VariableFor.java`
#### Snippet
```java

		if(element.getVariable().getDeclaration() == null) {
			System.out.println(element.getVariable().getDeclaration());
			return false;
		}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/fr/inria/spirals/npefix/main/ExecutionClient.java`
#### Snippet
```java

			selector.restartTest(lapse);
			System.out.println(lapse);
			System.exit(0);
		} catch (Exception e) {
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/fr/inria/spirals/npefix/main/spoon/MainSpoon.java`
#### Snippet
```java

			spooner.spoon();
			System.err.println("spoon done");
		}catch(Throwable t){
			t.printStackTrace();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/evaluation/java/fr/inria/spirals/npefix/resi/NPEFixTemplateEvaluation.java`
#### Snippet
```java

		try {
			System.out.println(patchTemplate.apply(clonedElement));

			// change the model with the new class
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/evaluation/java/fr/inria/spirals/npefix/resi/NPEFixTemplateEvaluation.java`
#### Snippet
```java
			type = (((CtAssignment) element.getParent()).getType());
		} else {
			System.out.println(element.getParent());
		}
		return type;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/evaluation/java/fr/inria/spirals/npefix/resi/NPEFixTemplateEvaluation.java`
#### Snippet
```java
					lapse.setFinished(true);

					System.out.println(lapse);

					lapses.add(lapse);
```

## RuleId[ruleID=ImplicitArrayToString]
### ImplicitArrayToString
Implicit call to 'toString()' on array `parameterType`
in `src/main/java/fr/inria/spirals/npefix/resi/context/instance/NewInstance.java`
#### Snippet
```java
			}
		} catch (Exception e) {
			throw new ErrorInitClass("Unable to create the new instance of " + parameterType, e);
		} finally {
			if(wasEnable) {
```

## RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/fr/inria/spirals/npefix/config/Config.java`
#### Snippet
```java
			m2Repository += "/";
		}
		this.m2Repository = m2Repository.replaceFirst("^~", System.getProperty("user.home")) + "repository/";
	}

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/utils/sacha/classloader/enrich/EnrichableClassloader.java`
#### Snippet
```java
		String classpaths = null;
		try{
			if(srcFolderPath==null || srcFolderPath.replaceAll("\\s", "").isEmpty())return ".";
			String[] folderPaths = srcFolderPath.split(File.pathSeparator);
			if(folderPaths.length>1){
```

### DynamicRegexReplaceableByCompiledPattern
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/utils/sacha/classloader/enrich/EnrichableClassloader.java`
#### Snippet
```java
									String currentPathString = node.getAttributes().getNamedItem("path").getNodeValue();
									if(currentPathString.contains("M2_REPO"))
										currentPathString = currentPathString.replaceFirst("M2_REPO", getM2REPO());
									else{
										System.err.println("cannot resolve : "+currentPathString);
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/fr/inria/spirals/npefix/patch/generator/PatchesGenerator.java`
#### Snippet
```java
		}

		return diff.replaceAll("\n\\\\ No newline at end of file", "");
	}

```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/fr/inria/spirals/npefix/main/spoon/MainSpoon.java`
#### Snippet
```java
						if(line.startsWith("#"))continue;
						String[] lineB = line.split(":",2);
						String[] arguments = lineB[1].split("\\s");
						targets.put(lineB[0],arguments);
						options.add(lineB[0]);
```

## RuleId[ruleID=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `spoon.processing` is unnecessary, and can be replaced with an import
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/ArrayRead.java`
#### Snippet
```java
 * Encapsulate array access in our framework
 */
public class ArrayRead extends spoon.processing.AbstractProcessor<CtArrayRead> {
	@Override
	public boolean isToBeProcessed(CtArrayRead candidate) {
```

### UnnecessaryFullyQualifiedName
Qualifier `spoon` is unnecessary, and can be replaced with an import
in `src/main/java/fr/inria/spirals/npefix/main/patch/SortPatch.java`
#### Snippet
```java
		String projectName = getProjectName(project);

		spoon.Launcher spoon = new spoon.Launcher();
		spoon.getModelBuilder().setSourceClasspath(AbstractSelectorEvaluation.getClasspathProject(projectName).split(":"));
		spoon.addInputResource(projectSourcePath);
```

### UnnecessaryFullyQualifiedName
Qualifier `spoon` is unnecessary, and can be replaced with an import
in `src/main/java/fr/inria/spirals/npefix/main/patch/SortPatch.java`
#### Snippet
```java
		String projectName = getProjectName(project);

		spoon.Launcher spoon = new spoon.Launcher();
		spoon.getModelBuilder().setSourceClasspath(AbstractSelectorEvaluation.getClasspathProject(projectName).split(":"));
		spoon.addInputResource(projectSourcePath);
```

### UnnecessaryFullyQualifiedName
Qualifier `utils.sacha.interfaces` is unnecessary and can be removed
in `src/main/java/utils/sacha/interfaces/IRunner.java`
#### Snippet
```java

	/** setEclipseClassPath must have been called before */
	utils.sacha.interfaces.ITestResult runAllTestsInClasspath();

	/** dir must be valid source folder */
```

### UnnecessaryFullyQualifiedName
Qualifier `utils.sacha.interfaces` is unnecessary and can be removed
in `src/main/java/utils/sacha/interfaces/IRunner.java`
#### Snippet
```java

	/** dir must be valid source folder */
	utils.sacha.interfaces.ITestResult runAllTestsInDirectory(String dir);

}
```

### UnnecessaryFullyQualifiedName
Qualifier `utils.sacha.finder.classes.impl` is unnecessary and can be removed
in `src/main/java/utils/sacha/finder/classes/impl/ClassloaderFinder.java`
#### Snippet
```java
		for (URL url : urlClassloader.getURLs()) {
			if(new File(url.getPath()).isDirectory())
				classes.addAll(utils.sacha.finder.classes.impl.SourceFolderFinder.getClassesLoc(new File(url.getPath()), null));
		}
		return classes.toArray(new String[0]);
```

### UnnecessaryFullyQualifiedName
Qualifier `spoon` is unnecessary and can be removed
in `src/evaluation/java/fr/inria/spirals/npefix/resi/PaperProjects.java`
#### Snippet
```java
        };

        spoon.Launcher spoon = new Launcher();
        spoon.addInputResource(source);
        source = "/tmp/npefix/" + name + "/src";
```

### UnnecessaryFullyQualifiedName
Qualifier `spoon` is unnecessary and can be removed
in `src/evaluation/java/fr/inria/spirals/npefix/resi/PaperProjects.java`
#### Snippet
```java
        };
        if(isInstrumentCode()) {
            spoon.Launcher spoon = new Launcher();
            spoon.addInputResource(source);
            source = "/tmp/npefix/" + name + "/src";
```

### UnnecessaryFullyQualifiedName
Qualifier `spoon` is unnecessary and can be removed
in `src/evaluation/java/fr/inria/spirals/npefix/resi/PaperProjects.java`
#### Snippet
```java
        };

        spoon.Launcher spoon = new Launcher();
        spoon.addInputResource(source);
        source = "/tmp/npefix/" + name + "/src";
```

### UnnecessaryFullyQualifiedName
Qualifier `utils.sacha.finder.classes.impl` is unnecessary and can be removed
in `src/main/java/utils/sacha/finder/classes/impl/ClasspathFinder.java`
#### Snippet
```java
		for (String root : roots) {
			if(new File(root).isDirectory())
				classes.addAll(utils.sacha.finder.classes.impl.SourceFolderFinder.getClassesLoc(new File(root), null));
		}
		return classes;
```

### UnnecessaryFullyQualifiedName
Qualifier `spoon` is unnecessary and can be removed
in `src/evaluation/java/fr/inria/spirals/npefix/resi/NPEFixTemplateEvaluation.java`
#### Snippet
```java

		// build the model
        spoon.Launcher spoon = new spoon.Launcher();
        spoon.addInputResource(new File(source).getAbsolutePath());
		spoon.addInputResource(test);
```

### UnnecessaryFullyQualifiedName
Qualifier `spoon` is unnecessary and can be removed
in `src/evaluation/java/fr/inria/spirals/npefix/resi/NPEFixTemplateEvaluation.java`
#### Snippet
```java

		// build the model
        spoon.Launcher spoon = new spoon.Launcher();
        spoon.addInputResource(new File(source).getAbsolutePath());
		spoon.addInputResource(test);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/AbstractStrategy.java`
#### Snippet
```java
				}
				Class<?> CL_class = classLoader.getClass();
				while (CL_class != java.lang.ClassLoader.class) {
					CL_class = CL_class.getSuperclass();
				}
```

## RuleId[ruleID=ComparatorMethodParameterNotUsed]
### ComparatorMethodParameterNotUsed
Comparator never returns positive value
in `src/main/java/fr/inria/spirals/npefix/resi/context/instance/AbstractInstance.java`
#### Snippet
```java

	@Override
	public int compareTo(Object o) {
		if (this instanceof PrimitiveInstance) {
			return -5;
```

### ComparatorMethodParameterNotUsed
'compareTo()' parameter `o` is not used
in `src/main/java/fr/inria/spirals/npefix/resi/context/instance/AbstractInstance.java`
#### Snippet
```java

	@Override
	public int compareTo(Object o) {
		if (this instanceof PrimitiveInstance) {
			return -5;
```

## RuleId[ruleID=ThrowablePrintStackTrace]
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/spirals/npefix/main/all/DefaultRepairStrategy.java`
#### Snippet
```java
				request = Request.method(CallChecker.currentClassLoader.loadClass(className), method);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
				continue;
			}
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/spirals/npefix/main/all/DefaultRepairStrategy.java`
#### Snippet
```java
				selector.startLaps(lapse);
			} catch (RemoteException e) {
				e.printStackTrace();
			}
			Result result = testRunner.run(request);
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/spirals/npefix/main/DecisionServer.java`
#### Snippet
```java
			startRMI(selector);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/utils/sacha/classloader/factory/ClassloaderFactory.java`
#### Snippet
```java
				urls.add(new URL("file://"+classpathElement));
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
		}
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/utils/sacha/runner/main/TestRunnerMain.java`
#### Snippet
```java
			TestInfo.compare(runnedTests,importedTests);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/spirals/npefix/main/patch/SortPatch.java`
#### Snippet
```java
				((JSONObject) execution).put("diff", diff);
				patch = getChange(diff);
				e.printStackTrace();
				System.out.println(patch);
			}
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/spirals/npefix/main/patch/SortPatch.java`
#### Snippet
```java
			fileWriter.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/evaluation/java/fr/inria/spirals/npefix/AbstractEvaluation.java`
#### Snippet
```java
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/evaluation/java/fr/inria/spirals/npefix/AbstractEvaluation.java`
#### Snippet
```java
                }
            } catch (OutOfMemoryError e) {
                e.printStackTrace();
                countError++;
                continue;
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/evaluation/java/fr/inria/spirals/npefix/AbstractEvaluation.java`
#### Snippet
```java
                    continue;
                }
                e.printStackTrace();
                countError++;
                continue;
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/evaluation/java/fr/inria/spirals/npefix/main/MainEvaluation.java`
#### Snippet
```java
			System.err.println("The project is not found");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.exit(0);
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/utils/sacha/classloader/enrich/EnrichableClassloader.java`
#### Snippet
```java
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/utils/sacha/classloader/enrich/EnrichableClassloader.java`
#### Snippet
```java
			addURL(new File(url).toURI().toURL());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/spirals/npefix/patch/generator/PatchesGenerator.java`
#### Snippet
```java
							new StringReader(classContent), 1);
		} catch (IOException e) {
			e.printStackTrace();
		}

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/spirals/npefix/main/run/Main.java`
#### Snippet
```java
				}
			} catch (OutOfMemoryError e) {
				e.printStackTrace();
				countError++;
				continue;
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/spirals/npefix/main/run/Main.java`
#### Snippet
```java
					continue;
				}
				e.printStackTrace();
				countError++;
				continue;
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/VarRetrieveAssign.java`
#### Snippet
```java
		}catch(Throwable t){
			nbError++;
			t.printStackTrace();
		}
	}
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/spirals/npefix/main/all/Launcher.java`
#### Snippet
```java
                process.destroy();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/spirals/npefix/main/all/Launcher.java`
#### Snippet
```java
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/spirals/npefix/main/all/Launcher.java`
#### Snippet
```java
            compiler.compile();
        } catch (Throwable e) {
            e.printStackTrace();
            throw e;
        }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/spirals/npefix/main/all/Launcher.java`
#### Snippet
```java
                continue;
            } catch (OutOfMemoryError e) {
                e.printStackTrace();
                countError++;
                continue;
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/spirals/npefix/main/all/Launcher.java`
#### Snippet
```java
                    continue;
                }
                e.printStackTrace();
                countError++;
                continue;
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/spirals/npefix/resi/selector/ExplorerSelector.java`
#### Snippet
```java
		} catch (Throwable e) {
			if (!(e instanceof NoMoreDecision)) {
				e.printStackTrace();
			}
			throw  e;
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/spirals/npefix/main/ExecutionClient.java`
#### Snippet
```java
				lapse = getSelector().getCurrentLapse();
				lapse.setOracle(new ExceptionOracle(e));
				e.printStackTrace();
				handler.cancel(true);
			} catch (ExecutionException e) {
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/spirals/npefix/main/ExecutionClient.java`
#### Snippet
```java
				lapse = getSelector().getCurrentLapse();
				lapse.setOracle(new ExceptionOracle(e));
				e.printStackTrace();
				handler.cancel(true);
			}
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/utils/sacha/runner/main/TestRunner.java`
#### Snippet
```java
					}
				} catch (NoSuchFieldException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/utils/sacha/runner/main/TestRunner.java`
#### Snippet
```java
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				}
				// runnedTests.getResult().
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/spirals/npefix/main/spoon/MainSpoon.java`
#### Snippet
```java
			System.err.println("spoon done");
		}catch(Throwable t){
			t.printStackTrace();
		}
	}
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/evaluation/java/fr/inria/spirals/npefix/resi/NPEFixTemplateEvaluation.java`
#### Snippet
```java
		} catch (RuntimeException e) {
			// the patch template cannot by applied on expression
			e.printStackTrace();
		}
		return Collections.emptyList();
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/evaluation/java/fr/inria/spirals/npefix/resi/NPEFixTemplateEvaluation.java`
#### Snippet
```java
						request = Request.method(testClassLoader.loadClass(testClassName), method);
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
						continue;
					}
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/evaluation/java/fr/inria/spirals/npefix/resi/NPEFixTemplateEvaluation.java`
#### Snippet
```java
			return lapses;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (tempBinFolder != null) {
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/AbstractStrategy.java`
#### Snippet
```java
							}
						}catch (Throwable t){
							t.printStackTrace();
							continue;
						}
```

## RuleId[ruleID=ReplaceNullCheck]
### ReplaceNullCheck
'if' statement can be replaced with call to 'Objects.requireNonNullElse()'
in `src/main/java/fr/inria/spirals/npefix/patch/generator/PatchesGenerator.java`
#### Snippet
```java
		}

		if (relativePath != null) {
			return this.putFirstSlash(relativePath);
		} else {
```

## RuleId[ruleID=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `Algorithm()` of an abstract class should not be declared 'public'
in `src/main/java/fr/inria/spirals/npefix/patch/sorter/algorithm/Algorithm.java`
#### Snippet
```java
	private final Tokens corpus;

	public Algorithm(Token token, Tokens predicate, Tokens corpus) {
		this.token = token;
		this.predicate = predicate;
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractSelectorEvaluation()` of an abstract class should not be declared 'public'
in `src/evaluation/java/fr/inria/spirals/npefix/resi/selector/AbstractSelectorEvaluation.java`
#### Snippet
```java
	protected int nbIteration = Config.CONFIG.getNbIteration();

	public AbstractSelectorEvaluation() {
	}

```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractTokenizer()` of an abstract class should not be declared 'public'
in `src/main/java/fr/inria/spirals/npefix/patch/sorter/tokenizer/AbstractTokenizer.java`
#### Snippet
```java


	public AbstractTokenizer() {
	}

```

## RuleId[ruleID=Convert2Lambda]
### Convert2Lambda
Anonymous new Comparator\>() can be replaced with lambda
in `src/main/java/utils/sacha/finder/processor/Processor.java`
#### Snippet
```java
		}
		
		Collections.sort(classes, new Comparator<Class<?>>() {
			public int compare(Class<?> o1, Class<?> o2) {
				return o1.getName().compareTo(o2.getName());
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `src/main/java/fr/inria/spirals/npefix/main/all/Launcher.java`
#### Snippet
```java

    private static void inheritIO(final InputStream src, final PrintStream dest) {
        new Thread(new Runnable() {
            public void run() {
                Scanner sc = new Scanner(src);
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `src/main/java/fr/inria/spirals/npefix/main/ExecutionClient.java`
#### Snippet
```java
			ExecutorService executor = Executors.newSingleThreadExecutor();

			final Future<Result> handler = executor.submit(new Callable<Result>() {
				@Override
				public Result call() throws Exception {
```

### Convert2Lambda
Anonymous new Comparator() can be replaced with lambda
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/AbstractStrategy.java`
#### Snippet
```java
			classes.add(clazz);
		} else if(clazz.isAssignableFrom(Comparator.class)){
			clazz = new Comparator() {
				public int compare(Object o1, Object o2) {
					return 0;
```

### Convert2Lambda
Anonymous new Comparator\>() can be replaced with lambda
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/AbstractStrategy.java`
#### Snippet
```java
				}
				Collections.sort(constructors,
						new Comparator<Constructor<?>>() {
							@Override
							public int compare(Constructor<?> c1,
```

## RuleId[ruleID=TestCaseWithConstructor]
### TestCaseWithConstructor
Initialization logic in constructor `NPEFixTemplateEvaluation()` instead of 'setup()' life cycle method
in `src/evaluation/java/fr/inria/spirals/npefix/resi/NPEFixTemplateEvaluation.java`
#### Snippet
```java
    private Map<String, NpePosition> positions = new HashMap<>();

    public NPEFixTemplateEvaluation() {
        positions.put(COLLECTIONS_360, new NpePosition("org.apache.commons.collections.iterators.FilterListIterator", 6901, 6908));
        positions.put(FELIX4960, new NpePosition("org.apache.felix.framework.BundleRevisionImpl", 17256, 17266));
```

## RuleId[ruleID=CaughtExceptionImmediatelyRethrown]
### CaughtExceptionImmediatelyRethrown
Caught exception `e` is immediately rethrown
in `src/main/java/fr/inria/spirals/npefix/resi/selector/MonoExplorerSelector.java`
#### Snippet
```java
			}
			throw new NoMoreDecisionException("No more available decision");
		} catch (Throwable e) {
			//e.printStackTrace();
			throw  e;
```

## RuleId[ruleID=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `m2Repository`
in `src/main/java/fr/inria/spirals/npefix/config/Config.java`
#### Snippet
```java
	public void setM2Repository(String m2Repository) {
		if (m2Repository.charAt(m2Repository.length() -1) != '/') {
			m2Repository += "/";
		}
		this.m2Repository = m2Repository.replaceFirst("^~", System.getProperty("user.home")) + "repository/";
```

### AssignmentToMethodParameter
Assignment to method parameter `datasetRoot`
in `src/main/java/fr/inria/spirals/npefix/config/Config.java`
#### Snippet
```java
	public void setDatasetRoot(String datasetRoot) {
		if (datasetRoot.charAt(datasetRoot.length() -1) != '/') {
			datasetRoot += "/";
		}
		this.datasetRoot = datasetRoot;
```

### AssignmentToMethodParameter
Assignment to method parameter `outputDirectory`
in `src/main/java/fr/inria/spirals/npefix/config/Config.java`
#### Snippet
```java
	public void setOutputDirectory(String outputDirectory) {
		if (outputDirectory.charAt(outputDirectory.length() -1) != '/') {
			outputDirectory += "/";
		}
		this.outputDirectory = outputDirectory;
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `src/main/java/fr/inria/spirals/npefix/main/patch/SortPatch.java`
#### Snippet
```java

	private static String getClasspath(String name) {
		name = Character.toUpperCase(name.charAt(0)) + name.substring(1);
		Class<NPEDataset> npeDatasetClass = NPEDataset.class;
		try {
```

### AssignmentToMethodParameter
Assignment to method parameter `clazz`
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/Strat4.java`
#### Snippet
```java
			Location location,
			MethodContext context) {
		clazz = context.getMethodType();

		List<Decision<T>> output = new ArrayList<>();
```

### AssignmentToMethodParameter
Assignment to method parameter `assigned`
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/ProcessorUtility.java`
#### Snippet
```java

    public static CtExpression removeUnaryOperator(CtExpression assigned, boolean beforeStatement) {
        assigned = assigned.clone();
        List<CtUnaryOperator> elements = assigned.getElements(new AbstractFilter<CtUnaryOperator>(CtUnaryOperator.class) {
            @Override
```

### AssignmentToMethodParameter
Assignment to method parameter `targetType`
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/ProcessorUtility.java`
#### Snippet
```java
                    return ctType;
                } else {
                    targetType = ((CtArrayTypeReference) targetType).getComponentType();
                }
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `targetType`
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/ProcessorUtility.java`
#### Snippet
```java
                targetTypeName += "[]";
            }
            targetType = targetType.getFactory().Type().createReference(targetTypeName);

            CtFieldReference<Object> ctfe = targetType.getFactory().Core().createFieldReference();
```

### AssignmentToMethodParameter
Assignment to method parameter `target`
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/VarRetrieveAssign.java`
#### Snippet
```java
			while (target instanceof CtTargetedExpression &&
					((CtTargetedExpression) target).getTarget() != null) {
				target = ((CtTargetedExpression) target).getTarget();
			}
			CtElement ctElement = (CtElement) ((CtInvocation) target).getArguments().get(0);
```

### AssignmentToMethodParameter
Assignment to method parameter `target`
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/VarRetrieveAssign.java`
#### Snippet
```java
			CtElement ctElement = (CtElement) ((CtInvocation) target).getArguments().get(0);
			if(ctElement instanceof CtArrayAccess) {
				target = getTargetInINPECheck(((CtArrayAccess) ctElement).getTarget());
			}
		}
```

### AssignmentToMethodParameter
Assignment to method parameter `classpath`
in `src/main/java/fr/inria/spirals/npefix/main/all/Launcher.java`
#### Snippet
```java
        this.complianceLevel = complianceLevel;
        if(!File.pathSeparator.equals(classpath.charAt(classpath.length() - 1) + "")) {
            classpath = classpath + File.pathSeparator;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `projectName`
in `src/evaluation/java/fr/inria/spirals/npefix/resi/selector/AbstractSelectorEvaluation.java`
#### Snippet
```java

	public static String getClasspathProject(String projectName) {
		projectName = Character.toUpperCase(projectName.charAt(0)) + projectName.substring(1);
		Class<AbstractSelectorEvaluation> evaluationClass = AbstractSelectorEvaluation.class;
		try {
```

### AssignmentToMethodParameter
Assignment to method parameter `testFolder`
in `src/main/java/utils/sacha/finder/main/Main.java`
#### Snippet
```java
	protected static String checkFolder(String testFolder) {
	if(testFolder.endsWith("/")||testFolder.endsWith("\\"))
		testFolder=testFolder.substring(0, testFolder.length());
	
	File testSrcFolder = new File(testFolder);
```

### AssignmentToMethodParameter
Assignment to method parameter `element`
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/AddImplicitCastChecker.java`
#### Snippet
```java
			variableAssignment.setPosition(element.getPosition());
			parent.insertAfter(variableAssignment);
			element = variableAssignment.getAssignment();
		}
		if(element.getParent() instanceof CtAssignment) {
```

### AssignmentToMethodParameter
Assignment to method parameter `startIndex`
in `src/main/java/utils/org/eclipse/core/internal/localstore/SafeChunkyInputStream.java`
#### Snippet
```java
			if (buffer[startIndex] == target)
				return startIndex;
			startIndex++;
		}
		return -1;
```

### AssignmentToMethodParameter
Assignment to method parameter `startIndex`
in `src/main/java/utils/org/eclipse/core/internal/localstore/SafeChunkyInputStream.java`
#### Snippet
```java
			if (source[startIndex] != target[i])
				return false;
			startIndex++;
		}
		return true;
```

### AssignmentToMethodParameter
Assignment to method parameter `clazz`
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/AbstractStrategy.java`
#### Snippet
```java
		}
		if(clazz.isAssignableFrom(Set.class)){
			clazz =  HashSet.class;
			classes.add(clazz);
		} else if(clazz.isAssignableFrom(Comparator.class)){
```

### AssignmentToMethodParameter
Assignment to method parameter `clazz`
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/AbstractStrategy.java`
#### Snippet
```java
			classes.add(clazz);
		} else if(clazz.isAssignableFrom(Comparator.class)){
			clazz = new Comparator() {
				public int compare(Object o1, Object o2) {
					return 0;
```

### AssignmentToMethodParameter
Assignment to method parameter `clazz`
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/AbstractStrategy.java`
#### Snippet
```java
			classes.add(clazz);
		} else if(clazz.isAssignableFrom(List.class)){
			clazz = ArrayList.class;
			classes.add(clazz);
		} else if(clazz.isAssignableFrom(Map.class)){
```

### AssignmentToMethodParameter
Assignment to method parameter `clazz`
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/AbstractStrategy.java`
#### Snippet
```java
			classes.add(clazz);
		} else if(clazz.isAssignableFrom(Map.class)){
			clazz = HashMap.class;
			classes.add(clazz);
		} else {
```

### AssignmentToMethodParameter
Assignment to method parameter `clazz`
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/AbstractStrategy.java`
#### Snippet
```java
		} else {
			try {
				clazz = CallChecker.currentClassLoader.loadClass(clazz.getCanonicalName() + "Impl");
				classes.add(clazz);
			} catch (ClassNotFoundException e) {
```

### AssignmentToMethodParameter
Assignment to method parameter `clazz`
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/AbstractStrategy.java`
#### Snippet
```java
	private <T> Map<String, Instance<T>> obtainInstance(Class<?> clazz, Map<String, Object> vars) {
		if(clazz.isPrimitive()) {
			clazz = primitiveToClass.get(clazz);
		}
		Map<String, Instance<T>> instances = new HashMap<>();
```

## RuleId[ruleID=UnnecessaryContinue]
### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `src/evaluation/java/fr/inria/spirals/npefix/resi/BenchmarkPaper.java`
#### Snippet
```java
                tests.add(aClass);
            } catch (ClassNotFoundException e) {
                continue;
            }
        }
```

### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `src/main/java/fr/inria/spirals/npefix/main/all/Launcher.java`
#### Snippet
```java
                tests.add(aClass);
            } catch (ClassNotFoundException e) {
                continue;
            }
        }
```

### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `src/main/java/fr/inria/spirals/npefix/main/all/Launcher.java`
#### Snippet
```java
                uRLClassPath.add(new File(s).toURL());
            } catch (MalformedURLException e) {
                continue;
            }
        }
```

### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/AbstractStrategy.java`
#### Snippet
```java
					}
				} catch (IllegalAccessException e) {
					continue;
				}
			}
```

## RuleId[ruleID=ReturnNull]
### ReturnNull
Return of `null`
in `src/main/java/fr/inria/spirals/npefix/patchTemplate/template/ReplaceGlobal.java`
#### Snippet
```java
	public CtIf apply(CtExpression nullExpression) {
		if (!(nullExpression instanceof CtVariableAccess)) {
			return null;
		}
		CtStatement superLine = nullExpression.getParent(new LineFilter());
```

### ReturnNull
Return of `null`
in `src/main/java/fr/inria/spirals/npefix/main/patch/SortPatch.java`
#### Snippet
```java
			return new Strat4(ReturnType.NULL);
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `src/evaluation/java/fr/inria/spirals/npefix/main/MainEvaluation.java`
#### Snippet
```java
			}
			showUsage();
			return null;
		}
		if (config.contains(GREEDY_EPSILON)) {
```

### ReturnNull
Return of `null`
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/ProcessorUtility.java`
#### Snippet
```java
    public static CtExpression createCtTypeElement(CtTypeReference targetType) {
        if(targetType == null) {
            return null;
        }
        CtExpression ctType;
```

### ReturnNull
Return of `null`
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/IfSplitter.java`
#### Snippet
```java
    private CtStatement wrapBlock(CtStatement element) {
        if(element == null) {
            return null;
        }
        if(element instanceof CtBlock) {
```

### ReturnNull
Return of `null`
in `src/main/java/fr/inria/spirals/npefix/resi/context/Lapse.java`
#### Snippet
```java
			return patchesGenerator.getDiff();
		} catch (Exception e) {
			return null;
		}
	}
```

## RuleId[ruleID=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `launcher` is redundant
in `src/evaluation/java/fr/inria/spirals/npefix/AbstractEvaluation.java`
#### Snippet
```java
        outputSource.mkdirs();

        Launcher launcher = new Launcher(
                new String[]{source, test},
                outputSource.getAbsolutePath(),
```

### UnnecessaryLocalVariable
Local variable `results` is redundant
in `src/evaluation/java/fr/inria/spirals/npefix/AbstractEvaluation.java`
#### Snippet
```java

    protected NPEOutput runStrategy(Launcher launcher, Strategy...strategy) {
        NPEOutput results = launcher.runStrategy(strategy);
        return results;

```

### UnnecessaryLocalVariable
Local variable `output` is redundant
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/AddImplicitCastChecker.java`
#### Snippet
```java
		nbImplicitCast++;

		CtStatement output = (CtStatement) parent;
		CtLiteral<Integer> lineNumber = getFactory().Code().createLiteral(element.getPosition().getLine());
		CtLiteral<Integer> sourceStart = getFactory().Code().createLiteral(element.getPosition().getSourceStart());
```

### UnnecessaryLocalVariable
Local variable `instance` is redundant
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/AbstractStrategy.java`
#### Snippet
```java
				values.add(initClass(clazz.getComponentType()));
			}
			NewArrayInstance<T> instance = new NewArrayInstance<>(clazz, values);
			return instance;
		}
```

### UnnecessaryLocalVariable
Local variable `instances` is redundant
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/AbstractStrategy.java`
#### Snippet
```java

		MethodContext vars = CallChecker.getCurrentMethodContext();
		Map<String, Instance<T>> instances = obtainInstance(clazz, vars.getVariables());

		return instances;
```

## RuleId[ruleID=RedundantFileCreation]
### RedundantFileCreation
`new File` is redundant
in `src/main/java/utils/sacha/mains/TestSuiteGeneratorMain.java`
#### Snippet
```java
		try
		{
			f = new PrintStream(new File("/home/langloisj/eclipse-workspace-projects-with-junit-tests/jbehave-core/src/test/java/AllTests.java"));	
		}catch(Exception e){throw new RuntimeException(e);}
		tcsc.printJavaTestSuite(f,"AllTests");
```

## RuleId[ruleID=PointlessBooleanExpression]
### PointlessBooleanExpression
`true || isSameDecision` can be simplified to 'true'
in `src/main/java/fr/inria/spirals/npefix/patch/generator/PatchesGenerator.java`
#### Snippet
```java
					}
				}
				if (true  || isSameDecision) {
					PatchGenerator patchGenerator = new PatchGenerator(decisionElements, spoon, offset, offsetLine);
					classContent = patchGenerator.getPatch();
```

### PointlessBooleanExpression
`candidate.getParent() instanceof CtStatement ||true` can be simplified to 'true'
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/TernarySplitter.java`
#### Snippet
```java
            return false;
        }
        return candidate.getParent() instanceof CtStatement ||true;
    }

```

## RuleId[ruleID=UseBulkOperation]
### UseBulkOperation
Iteration can be replaced with bulk 'Collection.addAll()' call
in `src/main/java/utils/sacha/classloader/enrich/EnrichableClassloader.java`
#### Snippet
```java
					if(tmp!=null && !tmp.isEmpty())
						for (String entry : tmp.split(File.pathSeparator)) {
							paths.add(entry);
						}
				}
```

### UseBulkOperation
Iteration can be replaced with bulk 'Collection.addAll()' call
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/CheckNotNull.java`
#### Snippet
```java
								});
							for (CtStatement postElement : postElements) {
								notNullElements.add(postElement);
							}
						}
```

### UseBulkOperation
Iteration can be replaced with bulk 'Collection.addAll()' call
in `src/main/java/fr/inria/spirals/npefix/patch/sorter/Tokens.java`
#### Snippet
```java
		Tokens iTokens = new Tokens(tokenizer);
		for (Token token :  tokens.subList(i, i1)) {
			iTokens.add(token);
		}
		return iTokens;
```

