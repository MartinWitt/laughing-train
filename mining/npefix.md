# npefix 
 
# Bad smells
I found 673 bad smells with 198 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryModifier | 185 | true |
| UNCHECKED_WARNING | 152 | false |
| FieldMayBeFinal | 76 | false |
| Deprecation | 28 | false |
| DataFlowIssue | 16 | false |
| TrivialIf | 15 | false |
| StringConcatenationInLoops | 14 | false |
| DuplicatedCode | 14 | false |
| ConstantValue | 13 | false |
| JavadocDeclaration | 12 | false |
| CachedNumberConstructorCall | 11 | false |
| FieldCanBeLocal | 10 | false |
| UnusedAssignment | 10 | false |
| NewClassNamingConvention | 10 | false |
| TrivialStringConcatenation | 9 | false |
| IgnoreResultOfCall | 9 | false |
| CommentedOutCode | 7 | false |
| AccessStaticViaInstance | 6 | false |
| StringConcatenationInsideStringBufferAppend | 6 | false |
| RedundantCast | 6 | false |
| EmptyStatementBody | 5 | false |
| UnnecessaryLocalVariable | 5 | true |
| RedundantTypeArguments | 4 | false |
| UnnecessaryContinue | 4 | false |
| JavadocReference | 3 | false |
| StringOperationCanBeSimplified | 3 | false |
| SuspiciousMethodCalls | 3 | false |
| UseBulkOperation | 3 | false |
| ToArrayCallWithZeroLengthArrayArgument | 2 | true |
| UnnecessaryLabelOnContinueStatement | 2 | false |
| BooleanConstructor | 2 | false |
| RedundantCollectionOperation | 2 | false |
| CatchMayIgnoreException | 2 | false |
| CollectionAddAllCanBeReplacedWithConstructor | 2 | false |
| InnerClassMayBeStatic | 2 | true |
| ComparatorMethodParameterNotUsed | 2 | false |
| PointlessBooleanExpression | 2 | true |
| EmptyFinallyBlock | 1 | false |
| ThrowablePrintedToSystemOut | 1 | false |
| IfStatementMissingBreakInLoop | 1 | false |
| RedundantMethodOverride | 1 | false |
| UNUSED_IMPORT | 1 | false |
| ManualArrayToCollectionCopy | 1 | false |
| UnnecessarySemicolon | 1 | false |
| ProtectedMemberInFinalClass | 1 | true |
| ThreadRun | 1 | false |
| UnnecessaryToStringCall | 1 | true |
| WrongPackageStatement | 1 | false |
| ImplicitArrayToString | 1 | false |
| CaughtExceptionImmediatelyRethrown | 1 | false |
| RedundantFileCreation | 1 | false |
| ArraysAsListWithZeroOrOneArgument | 1 | false |
| SuspiciousIndentAfterControlStatement | 1 | false |
## RuleId[id=ToArrayCallWithZeroLengthArrayArgument]
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

## RuleId[id=UnnecessaryModifier]
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

public interface IConstants{
	public interface Class {
		public static final String THROWABLE = "java.lang.Throwable";

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
in `src/main/java/utils/sacha/project/utils/IMavenMerger.java`
#### Snippet
```java
public interface IMavenMerger {

	public void merge();

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

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/utils/sacha/interfaces/IGeneralToJava.java`
#### Snippet
```java
public interface IGeneralToJava {

	public void changeToJava();

}
```

## RuleId[id=EmptyStatementBody]
### EmptyStatementBody
`if` statement has empty body
in `src/main/java/fr/inria/spirals/npefix/main/patch/SortPatch.java`
#### Snippet
```java
		while (keys.hasNext()) {
			String project = keys.next();
			if (!project.contains(AbstractNPEDataset.MATH_290)) {
				//continue;
			}
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/fr/inria/spirals/npefix/main/patch/SortPatch.java`
#### Snippet
```java
		JSONArray executions = root.getJSONArray("executions");
		for (Object execution : executions) {
			if (!((JSONObject) execution).getJSONObject("result").getBoolean("success")) {
				//continue;
			}
```

### EmptyStatementBody
`else` statement has empty body
in `src/main/java/fr/inria/spirals/npefix/resi/ExceptionStack.java`
#### Snippet
```java
		if(tryContexts.get(tryContexts.size()-1).equals(tc)){
			tryContexts.remove(tryContexts.size()-1);
		}else{
			//System.err.println("oops?");
		}
```

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

## RuleId[id=CommentedOutCode]
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
Commented out code (27 lines)
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/VarRetrieveInit.java`
#### Snippet
```java


		/*
		// assign Integer in int
		if(element.getType() != null &&
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

## RuleId[id=EmptyFinallyBlock]
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

## RuleId[id=UnnecessaryLabelOnContinueStatement]
### UnnecessaryLabelOnContinueStatement
Unnecessary label `positionLoop` on continue statement
in `src/main/java/fr/inria/spirals/npefix/patch/sorter/Tokens.java`
#### Snippet
```java
			int expectedPositionToken = position + 1;
			if (expectedPositionToken >= this.fullSize()) {
				continue positionLoop;
			}
			String expected = tokenizer.computeRepresentation(get(expectedPositionToken));
```

### UnnecessaryLabelOnContinueStatement
Unnecessary label `positionLoop` on continue statement
in `src/main/java/fr/inria/spirals/npefix/patch/sorter/Tokens.java`
#### Snippet
```java
			int expectedPositionToken = position + 1;
			if (expectedPositionToken >= this.fullSize()) {
				continue positionLoop;
			}
			output ++;
```

## RuleId[id=Deprecation]
### Deprecation
'readFileToString(java.io.File)' is deprecated
in `src/main/java/fr/inria/spirals/npefix/patch/sorter/SingleFileTokenIterator.java`
#### Snippet
```java
public class SingleFileTokenIterator extends StringTokenIterator {
	public SingleFileTokenIterator(File f, int n) throws IOException {
		super(FileUtils.readFileToString(f), n);
		if (f.isDirectory()) {
			throw new RuntimeException("oops,should be a regular file");
```

### Deprecation
'toURL()' is deprecated
in `src/evaluation/java/fr/inria/spirals/npefix/resi/NPEFixTemplateEvaluation.java`
#### Snippet
```java
			URL[] classloader = new URL[sourceClasspath.length];

			classloader[0] = binFolder.toURL();
			for (int i = 1; i < sourceClasspath.length; i++) {
				String s = sourceClasspath[i];
```

### Deprecation
'toURL()' is deprecated
in `src/evaluation/java/fr/inria/spirals/npefix/resi/NPEFixTemplateEvaluation.java`
#### Snippet
```java
			for (int i = 1; i < sourceClasspath.length; i++) {
				String s = sourceClasspath[i];
				classloader[i] = new File(s).toURL();
			}
			URLClassLoader testClassLoader = new URLClassLoader(classloader,
```

### Deprecation
'readFileToString(java.io.File)' is deprecated
in `src/main/java/fr/inria/spirals/npefix/patch/generator/PatchesGenerator.java`
#### Snippet
```java
	private String getFileContent(File file) {
		try {
			return FileUtils.readFileToString(file);
		} catch (IOException e) {
			throw new RuntimeException("File not found");
```

### Deprecation
'TokenNameIdentifier' is deprecated
in `src/main/java/fr/inria/spirals/npefix/patch/sorter/tokenizer/RenameIdentifierTokenizer.java`
#### Snippet
```java
	@Override
	public String computeRepresentation(Token token) {
		if (token.getType() == ITerminalSymbols.TokenNameIdentifier) {
			return ("ID$");
		}
```

### Deprecation
'isAccessible()' is deprecated
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/AbstractStrategy.java`
#### Snippet
```java
						Class<?>[] types = constructor.getParameterTypes();
						// cannot use the Class constructor
						if(!constructor.isAccessible() &&
								constructor.getDeclaringClass() == Class.class) {
							continue;
```

### Deprecation
'isAccessible()' is deprecated
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/AbstractStrategy.java`
#### Snippet
```java
							continue;
						}
						if(!constructor.isAccessible() &&
								constructor.getDeclaringClass() != Class.class) {
							constructor.setAccessible(true);
```

### Deprecation
'Integer(int)' is deprecated
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/AbstractStrategy.java`
#### Snippet
```java
		List<Instance<T>> instances = new ArrayList<>();
		if(clazz == int.class){
			instances.add(new PrimitiveInstance<T>((T) new Integer(0)));
			instances.add(new PrimitiveInstance<T>((T) new Integer(-1)));
			instances.add(new PrimitiveInstance<T>((T) new Integer(1)));
```

### Deprecation
'Integer(int)' is deprecated
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/AbstractStrategy.java`
#### Snippet
```java
		if(clazz == int.class){
			instances.add(new PrimitiveInstance<T>((T) new Integer(0)));
			instances.add(new PrimitiveInstance<T>((T) new Integer(-1)));
			instances.add(new PrimitiveInstance<T>((T) new Integer(1)));
		}
```

### Deprecation
'Integer(int)' is deprecated
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/AbstractStrategy.java`
#### Snippet
```java
			instances.add(new PrimitiveInstance<T>((T) new Integer(0)));
			instances.add(new PrimitiveInstance<T>((T) new Integer(-1)));
			instances.add(new PrimitiveInstance<T>((T) new Integer(1)));
		}
		if(clazz == char.class){
```

### Deprecation
'Character(char)' is deprecated
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/AbstractStrategy.java`
#### Snippet
```java
		}
		if(clazz == char.class){
			instances.add(new PrimitiveInstance<T>((T) new Character(' ')));
		}
		if(clazz == boolean.class){
```

### Deprecation
'Boolean(boolean)' is deprecated
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/AbstractStrategy.java`
#### Snippet
```java
		}
		if(clazz == boolean.class){
			instances.add(new PrimitiveInstance<T>((T) new Boolean(false)));
			instances.add(new PrimitiveInstance<T>((T) new Boolean(true)));
		}
```

### Deprecation
'Boolean(boolean)' is deprecated
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/AbstractStrategy.java`
#### Snippet
```java
		if(clazz == boolean.class){
			instances.add(new PrimitiveInstance<T>((T) new Boolean(false)));
			instances.add(new PrimitiveInstance<T>((T) new Boolean(true)));
		}
		if(clazz == float.class){
```

### Deprecation
'Float(float)' is deprecated
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/AbstractStrategy.java`
#### Snippet
```java
		}
		if(clazz == float.class){
			instances.add(new PrimitiveInstance<T>((T) new Float(0)));
			instances.add(new PrimitiveInstance<T>((T) new Float(-1)));
			instances.add(new PrimitiveInstance<T>((T) new Float(1)));
```

### Deprecation
'Float(float)' is deprecated
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/AbstractStrategy.java`
#### Snippet
```java
		if(clazz == float.class){
			instances.add(new PrimitiveInstance<T>((T) new Float(0)));
			instances.add(new PrimitiveInstance<T>((T) new Float(-1)));
			instances.add(new PrimitiveInstance<T>((T) new Float(1)));
		}
```

### Deprecation
'Float(float)' is deprecated
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/AbstractStrategy.java`
#### Snippet
```java
			instances.add(new PrimitiveInstance<T>((T) new Float(0)));
			instances.add(new PrimitiveInstance<T>((T) new Float(-1)));
			instances.add(new PrimitiveInstance<T>((T) new Float(1)));
		}
		if(clazz == double.class){
```

### Deprecation
'Double(double)' is deprecated
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/AbstractStrategy.java`
#### Snippet
```java
		}
		if(clazz == double.class){
			instances.add(new PrimitiveInstance<T>((T) new Double(0)));
			instances.add(new PrimitiveInstance<T>((T) new Double(-1)));
			instances.add(new PrimitiveInstance<T>((T) new Double(1)));
```

### Deprecation
'Double(double)' is deprecated
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/AbstractStrategy.java`
#### Snippet
```java
		if(clazz == double.class){
			instances.add(new PrimitiveInstance<T>((T) new Double(0)));
			instances.add(new PrimitiveInstance<T>((T) new Double(-1)));
			instances.add(new PrimitiveInstance<T>((T) new Double(1)));
		}
```

### Deprecation
'Double(double)' is deprecated
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/AbstractStrategy.java`
#### Snippet
```java
			instances.add(new PrimitiveInstance<T>((T) new Double(0)));
			instances.add(new PrimitiveInstance<T>((T) new Double(-1)));
			instances.add(new PrimitiveInstance<T>((T) new Double(1)));
		}
		if(clazz == long.class){
```

### Deprecation
'Long(long)' is deprecated
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/AbstractStrategy.java`
#### Snippet
```java
		}
		if(clazz == long.class){
			instances.add(new PrimitiveInstance<T>((T) new Long(0)));
			instances.add(new PrimitiveInstance<T>((T) new Long(-1)));
			instances.add(new PrimitiveInstance<T>((T) new Long(1)));
```

### Deprecation
'Long(long)' is deprecated
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/AbstractStrategy.java`
#### Snippet
```java
		if(clazz == long.class){
			instances.add(new PrimitiveInstance<T>((T) new Long(0)));
			instances.add(new PrimitiveInstance<T>((T) new Long(-1)));
			instances.add(new PrimitiveInstance<T>((T) new Long(1)));
		}
```

### Deprecation
'Long(long)' is deprecated
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/AbstractStrategy.java`
#### Snippet
```java
			instances.add(new PrimitiveInstance<T>((T) new Long(0)));
			instances.add(new PrimitiveInstance<T>((T) new Long(-1)));
			instances.add(new PrimitiveInstance<T>((T) new Long(1)));
		}
		if(clazz == byte.class){
```

### Deprecation
'Byte(byte)' is deprecated
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/AbstractStrategy.java`
#### Snippet
```java
		}
		if(clazz == byte.class){
			instances.add(new PrimitiveInstance<T>((T) new Byte((byte)0)));
			instances.add(new PrimitiveInstance<T>((T) new Byte((byte)1)));
		}
```

### Deprecation
'Byte(byte)' is deprecated
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/AbstractStrategy.java`
#### Snippet
```java
		if(clazz == byte.class){
			instances.add(new PrimitiveInstance<T>((T) new Byte((byte)0)));
			instances.add(new PrimitiveInstance<T>((T) new Byte((byte)1)));
		}
		if(clazz == short.class){
```

### Deprecation
'Short(short)' is deprecated
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/AbstractStrategy.java`
#### Snippet
```java
		}
		if(clazz == short.class){
			instances.add(new PrimitiveInstance<T>((T) new Short((short) 0)));
			instances.add(new PrimitiveInstance<T>((T) new Short((short) -1)));
			instances.add(new PrimitiveInstance<T>((T) new Short((short) 1)));
```

### Deprecation
'Short(short)' is deprecated
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/AbstractStrategy.java`
#### Snippet
```java
		if(clazz == short.class){
			instances.add(new PrimitiveInstance<T>((T) new Short((short) 0)));
			instances.add(new PrimitiveInstance<T>((T) new Short((short) -1)));
			instances.add(new PrimitiveInstance<T>((T) new Short((short) 1)));
		}
```

### Deprecation
'Short(short)' is deprecated
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/AbstractStrategy.java`
#### Snippet
```java
			instances.add(new PrimitiveInstance<T>((T) new Short((short) 0)));
			instances.add(new PrimitiveInstance<T>((T) new Short((short) -1)));
			instances.add(new PrimitiveInstance<T>((T) new Short((short) 1)));
		}
		return instances;
```

### Deprecation
'toURL()' is deprecated
in `src/main/java/fr/inria/spirals/npefix/main/all/Launcher.java`
#### Snippet
```java
            String s = sourceClasspath[i];
            try {
                uRLClassPath.add(new File(s).toURL());
            } catch (MalformedURLException e) {
                continue;
```

## RuleId[id=TrivialStringConcatenation]
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

## RuleId[id=BooleanConstructor]
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

## RuleId[id=RedundantTypeArguments]
### RedundantTypeArguments
Explicit type arguments can be inferred
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/RemoveNullCheckProcessor.java`
#### Snippet
```java
                        && !isLastStatementOfMethod(ctStatement)) {
                    CtIf anIf = getFactory().Core().createIf();
                    anIf.setCondition(getFactory().Code().<Boolean>createCodeSnippetExpression("true"));
                    anIf.setThenStatement(ctStatement);
                    ctStatement.setParent(anIf);
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/RemoveNullCheckProcessor.java`
#### Snippet
```java
                    && !isLastStatementOfMethod(body)) {
                CtIf anIf = getFactory().Core().createIf();
                anIf.setCondition(getFactory().Code().<Boolean>createCodeSnippetExpression("true"));
                anIf.setThenStatement(body);
                body.setParent(anIf);
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/RemoveNPECheckProcessor.java`
#### Snippet
```java
                        && !isLastStatementOfMethod(ctStatement)) {
                    CtIf anIf = getFactory().Core().createIf();
                    anIf.setCondition(getFactory().Code().<Boolean>createCodeSnippetExpression("true"));
                    anIf.setThenStatement(ctStatement);
                    ctStatement.setParent(anIf);
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/RemoveNPECheckProcessor.java`
#### Snippet
```java
                        && !isLastStatementOfMethod(ctStatement)) {
                    CtIf anIf = getFactory().Core().createIf();
                    anIf.setCondition(getFactory().Code().<Boolean>createCodeSnippetExpression("true"));
                    anIf.setThenStatement(ctStatement);
                    ctStatement.setParent(anIf);
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/fr/inria/spirals/npefix/config/Config.java`
#### Snippet
```java
	private int nbIteration;
	private int timeoutIteration;
	private Properties properties = new Properties();
	private String workingDirectory;
	private String m2Repository;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/fr/inria/spirals/npefix/main/run/Main.java`
#### Snippet
```java

	private List<String> sources = new ArrayList<>();
	private String workingDirectory = ".";
	private String classpath = "";
	private int complianceLevel = 7;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/fr/inria/spirals/npefix/main/run/Main.java`
#### Snippet
```java
	private String classpath = "";
	private int complianceLevel = 7;
	private RepairStrategy repairStrategy;
	private String[] tests;
	private int nbIteration;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/utils/sacha/runner/main/TestRunnerMain.java`
#### Snippet
```java
	private static class MyTextListener extends RunListener{
		private final PrintStream fWriter;
		private int errors=0;
		private int failures=0;
		
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/utils/sacha/runner/main/TestRunnerMain.java`
#### Snippet
```java
		private final PrintStream fWriter;
		private int errors=0;
		private int failures=0;
		
		public MyTextListener(PrintStream writer) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/fr/inria/spirals/npefix/patch/sorter/algorithm/KneserNey.java`
#### Snippet
```java
public class KneserNey extends Algorithm {
	private final Set<Tokens> allBiGram;
	private double d = 0.1;

	public KneserNey(Token token, Tokens predicate, Tokens corpus) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/fr/inria/spirals/npefix/resi/context/TryContext.java`
#### Snippet
```java
	private int id = -1;
	private Class<?>[] types;
	private Class<?> context;

	public TryContext(int id, Class<?> context, String... types) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/RemoveNullCheckProcessor.java`
#### Snippet
```java
public class RemoveNullCheckProcessor extends AbstractProcessor<CtIf> {

    private boolean isProcessed = false;

    private int count = 0;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/fr/inria/spirals/npefix/resi/context/Lapse.java`
#### Snippet
```java
	private static int currentUniqueId = 0;

	private final Selector strategySelector;
	private final int uniqueId;
	private Set<Location> locations;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/fr/inria/spirals/npefix/patch/generator/PatchGenerator.java`
#### Snippet
```java
class PatchGenerator {
	private List<DecisionElement> decisionElement;
	private Launcher spoon;
	private int[] offset;
	private int[] offsetLine;
```

## RuleId[id=ThrowablePrintedToSystemOut]
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

## RuleId[id=IfStatementMissingBreakInLoop]
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

## RuleId[id=IgnoreResultOfCall]
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

## RuleId[id=AccessStaticViaInstance]
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

## RuleId[id=RedundantMethodOverride]
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

## RuleId[id=UNUSED_IMPORT]
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

## RuleId[id=StringConcatenationInLoops]
### StringConcatenationInLoops
String concatenation `+=` in loop
in `src/evaluation/java/fr/inria/spirals/npefix/AbstractEvaluation.java`
#### Snippet
```java
        for (int i = 0; i < deps.length; i++) {
            String dep = deps[i];
            classpath += M2REPO + dep + File.pathSeparator;
        }
        return classpath;
```

### StringConcatenationInLoops
String concatenation `+=` in loop
in `src/main/java/utils/sacha/classloader/enrich/EnrichableClassloader.java`
#### Snippet
```java
				String res = ".";
				for (String path : paths) {
					res+=File.pathSeparator+path;
				}
				return res;
```

### StringConcatenationInLoops
String concatenation `+=` in loop
in `src/main/java/utils/sacha/classloader/enrich/EnrichableClassloader.java`
#### Snippet
```java
										classpaths = currentPathString;
									else
										classpaths+= File.pathSeparator+currentPathString;
								}else if("var".equalsIgnoreCase(node.getAttributes().getNamedItem("kind").getNodeValue())){
									String currentPathString = node.getAttributes().getNamedItem("path").getNodeValue();
```

### StringConcatenationInLoops
String concatenation `+=` in loop
in `src/main/java/utils/sacha/classloader/enrich/EnrichableClassloader.java`
#### Snippet
```java
										classpaths = currentPathString;
									else
										classpaths+= File.pathSeparator+currentPathString;
								}else if("src".equalsIgnoreCase(node.getAttributes().getNamedItem("kind").getNodeValue())){
									String currentPathString = node.getAttributes().getNamedItem("path").getNodeValue();
```

### StringConcatenationInLoops
String concatenation `+=` in loop
in `src/main/java/utils/sacha/classloader/enrich/EnrichableClassloader.java`
#### Snippet
```java
																classpaths = outputPathString;
															else
																classpaths+= File.pathSeparator+outputPathString;
														}
													}
```

### StringConcatenationInLoops
String concatenation `+=` in loop
in `src/main/java/utils/sacha/classloader/enrich/EnrichableClassloader.java`
#### Snippet
```java
												classpaths = currentPathString;
											else
												classpaths+= File.pathSeparator+currentPathString;
										}
									}
```

### StringConcatenationInLoops
String concatenation `+=` in loop
in `src/main/java/fr/inria/spirals/npefix/main/patch/SortPatch.java`
#### Snippet
```java
				}
			} else {
				currentPatch += line.replace("+ ", "") + "\n";
			}
		}
```

### StringConcatenationInLoops
String concatenation `+=` in loop
in `src/main/java/utils/sacha/impl/DefaultSpooner.java`
#### Snippet
```java
			if(string==null || string.length()==0)
				throw new IllegalArgumentException("setSourceFolder can not be used with empty value");
			tmp+=getProjectDir().getAbsolutePath()+"/"+string+":";
		}
		tmp = tmp.substring(0, tmp.length()-1);
```

### StringConcatenationInLoops
String concatenation `+=` in loop
in `src/main/java/utils/sacha/impl/DefaultSpooner.java`
#### Snippet
```java
				if(string==null || string.length()==0)
					throw new IllegalArgumentException("setProcessors can not be used with empty value");
				tmp+=string+":";
			}
			tmp = tmp.substring(0, tmp.length()-1);
```

### StringConcatenationInLoops
String concatenation `+=` in loop
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/ProcessorUtility.java`
#### Snippet
```java
            String targetTypeName = targetType.getQualifiedName();
            for (int i = 0; i < countArray; i++) {
                targetTypeName += "[]";
            }
            targetType = targetType.getFactory().Type().createReference(targetTypeName);
```

### StringConcatenationInLoops
String concatenation `+=` in loop
in `src/main/java/fr/inria/spirals/npefix/patch/generator/PatchGenerator.java`
#### Snippet
```java
			char s = line.charAt(i);
			if (s == ' ' || s == '\t') {
				currentIndentation += s;
				continue;
			}
```

### StringConcatenationInLoops
String concatenation `+=` in loop
in `src/main/java/utils/sacha/impl/TestSuiteCreatorCore.java`
#### Snippet
```java
		String classes = "";
		for (Class<?> clazz : tests) {
			classes+=clazz.getName()+".class";
			classes+=",";
		}
```

### StringConcatenationInLoops
String concatenation `+=` in loop
in `src/evaluation/java/fr/inria/spirals/npefix/resi/NPEDataset.java`
#### Snippet
```java
            Strategy strategy = strategies.get(i);
            if(!bestStrategies.isEmpty()) {
                bestStrategies += ", ";
            }
            bestStrategies += strategy.toString();
```

### StringConcatenationInLoops
String concatenation `+=` in loop
in `src/evaluation/java/fr/inria/spirals/npefix/resi/NPEDataset.java`
#### Snippet
```java
                bestStrategies += ", ";
            }
            bestStrategies += strategy.toString();
        }
        bestStrategies += " with " + minFailing + " failing tests";
```

## RuleId[id=UnusedAssignment]
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
Variable `instance` initializer `null` is redundant
in `src/main/java/fr/inria/spirals/npefix/resi/context/instance/InstanceFactory.java`
#### Snippet
```java

	public static Instance fromCtExpression(CtExpression expression) {
		Instance instance = null;

		if (expression == null) {
```

## RuleId[id=ConstantValue]
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

## RuleId[id=StringConcatenationInsideStringBufferAppend]
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

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `src/main/java/fr/inria/spirals/npefix/resi/context/instance/VariableInstance.java`
#### Snippet
```java
	public T getValue() {
		Object o = CallChecker.getCurrentMethodContext().getVariables().get(variableName);
		return (T) o;
	}

```

### UNCHECKED_WARNING
Unchecked call to 'addTypeCast(CtTypeReference)' as a member of raw type 'spoon.reflect.code.CtExpression'
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/AddImplicitCastChecker.java`
#### Snippet
```java

		CtExpression target = (CtExpression) getFactory().Core().clone(element);
		target.addTypeCast(element.getType());

		CtInvocation invocation = ProcessorUtility
```

### UNCHECKED_WARNING
Unchecked call to 'setDefaultExpression(CtExpression)' as a member of raw type 'spoon.reflect.declaration.CtVariable'
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/AddImplicitCastChecker.java`
#### Snippet
```java
			}
			CtInvocation initInvoc = ProcessorUtility.createStaticCall(getFactory(), CallChecker.class, "init", ProcessorUtility.createCtTypeElement(parentType));
			((CtLocalVariable) parent).setDefaultExpression(initInvoc);
			CtAssignment variableAssignment = getFactory().Code()
					.createVariableAssignment(
```

### UNCHECKED_WARNING
Unchecked assignment: 'spoon.reflect.reference.CtLocalVariableReference' to 'spoon.reflect.reference.CtVariableReference'. Reason: '((CtLocalVariableImpl) parent)' has raw type, so result of getReference is erased
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/AddImplicitCastChecker.java`
#### Snippet
```java
			CtAssignment variableAssignment = getFactory().Code()
					.createVariableAssignment(
							((CtLocalVariableImpl) parent).getReference(),
							false, invocation);
			variableAssignment.setPosition(element.getPosition());
```

### UNCHECKED_WARNING
Unchecked assignment: 'spoon.reflect.code.CtInvocation' to 'spoon.reflect.code.CtExpression'
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/AddImplicitCastChecker.java`
#### Snippet
```java
					.createVariableAssignment(
							((CtLocalVariableImpl) parent).getReference(),
							false, invocation);
			variableAssignment.setPosition(element.getPosition());
			parent.insertAfter(variableAssignment);
```

### UNCHECKED_WARNING
Unchecked assignment: 'spoon.reflect.code.CtInvocation' to 'spoon.reflect.code.CtExpression'
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/AddImplicitCastChecker.java`
#### Snippet
```java
			final CtIf encaps = getFactory().Core().createIf();
			encaps.setPosition(element.getPosition());
			encaps.setCondition(beforeDerefInvocation);
			CtBlock thenBloc = getFactory().Core().createBlock();
			thenBloc.setPosition(element.getPosition());
```

### UNCHECKED_WARNING
Unchecked call to 'setReturnedExpression(CtExpression)' as a member of raw type 'spoon.reflect.code.CtReturn'
in `src/main/java/fr/inria/spirals/npefix/patchTemplate/template/SkipMethodReturn.java`
#### Snippet
```java
			CtReturn aReturn = factory.Core().createReturn();

			aReturn.setReturnedExpression(newInstance);
			anIf.setThenStatement(aReturn);
			superLine.insertBefore(anIf);
```

### UNCHECKED_WARNING
Unchecked call to 'setReturnedExpression(CtExpression)' as a member of raw type 'spoon.reflect.code.CtReturn'
in `src/main/java/fr/inria/spirals/npefix/patchTemplate/template/SkipMethodReturn.java`
#### Snippet
```java
			CtReturn aReturn = factory.Core().createReturn();
			if (((CtMethod) method).getType().equals(factory.Type().voidPrimitiveType())) {
				aReturn.setReturnedExpression(null);
			} else if (((CtMethod) method).getType().isPrimitive()) {
				// cannot return null with primitive
```

### UNCHECKED_WARNING
Unchecked call to 'setReturnedExpression(CtExpression)' as a member of raw type 'spoon.reflect.code.CtReturn'
in `src/main/java/fr/inria/spirals/npefix/patchTemplate/template/SkipMethodReturn.java`
#### Snippet
```java
				throw new RuntimeException("Unsupported patch");
			} else {
				aReturn.setReturnedExpression(factory.Code().createLiteral(null));
			}
			anIf.setThenStatement(aReturn);
```

### UNCHECKED_WARNING
Unchecked assignment: 'fr.inria.spirals.npefix.resi.context.Decision' to 'fr.inria.spirals.npefix.resi.context.Decision'
in `src/main/java/fr/inria/spirals/npefix/resi/selector/MonoExplorerSelector.java`
#### Snippet
```java
				if (!usedDecisions.get(currentTestKey).contains(decision)) {
					decision.setDecisionType(Decision.DecisionType.NEW);
					return decision;
				}
			}
```

### UNCHECKED_WARNING
Unchecked assignment: 'fr.inria.spirals.npefix.resi.context.Decision' to 'fr.inria.spirals.npefix.resi.context.Decision'
in `src/main/java/fr/inria/spirals/npefix/resi/selector/ExplorerSelector.java`
#### Snippet
```java
			for (Decision decision : stackDecision.get(currentTestKey)) {
				if (decisions.contains(decision)) {
					return decision;
				}
			}
```

### UNCHECKED_WARNING
Unchecked assignment: 'fr.inria.spirals.npefix.resi.context.Decision' to 'fr.inria.spirals.npefix.resi.context.Decision'
in `src/main/java/fr/inria/spirals/npefix/resi/selector/ExplorerSelector.java`
#### Snippet
```java
					decision.setDecisionType(Decision.DecisionType.NEW);
					stackDecision.get(currentTestKey).push(decision);
					return decision;
				}
				otherDecision.remove(decision);
```

### UNCHECKED_WARNING
Unchecked assignment: 'spoon.reflect.reference.CtVariableReference' to 'spoon.reflect.reference.CtVariableReference'. Reason: '((CtVariableAccess)nullExpression)' has raw type, so result of getVariable is erased
in `src/main/java/fr/inria/spirals/npefix/patchTemplate/template/ReplaceGlobal.java`
#### Snippet
```java

		boolean isStatic = ((CtVariableAccess) nullExpression).getVariable().getDeclaration().hasModifier(ModifierKind.STATIC);
		CtAssignment variableAssignment = factory.Code().createVariableAssignment(((CtVariableAccess)nullExpression).getVariable(), isStatic, newExpression);

		anIf.setThenStatement(variableAssignment);
```

### UNCHECKED_WARNING
Unchecked assignment: 'spoon.reflect.code.CtExpression' to 'spoon.reflect.code.CtExpression'
in `src/main/java/fr/inria/spirals/npefix/patchTemplate/template/ReplaceGlobal.java`
#### Snippet
```java

		boolean isStatic = ((CtVariableAccess) nullExpression).getVariable().getDeclaration().hasModifier(ModifierKind.STATIC);
		CtAssignment variableAssignment = factory.Code().createVariableAssignment(((CtVariableAccess)nullExpression).getVariable(), isStatic, newExpression);

		anIf.setThenStatement(variableAssignment);
```

### UNCHECKED_WARNING
Unchecked assignment: 'spoon.reflect.reference.CtVariableReference' to 'spoon.reflect.reference.CtVariableReference'. Reason: 'variable' has raw type, so result of getReference is erased
in `src/main/java/fr/inria/spirals/npefix/patchTemplate/template/ReplaceGlobal.java`
#### Snippet
```java

	public ReplaceGlobal(CtVariable variable) {
		this.newExpression = variable.getFactory().Code().createVariableRead(variable.getReference(), variable.hasModifier(ModifierKind.STATIC));
	}

```

### UNCHECKED_WARNING
Unchecked assignment: 'spoon.reflect.reference.CtTypeReference' to 'spoon.reflect.reference.CtTypeReference'. Reason: 'ctClass' has raw type, so result of getReference is erased
in `src/main/java/fr/inria/spirals/npefix/patchTemplate/template/ReplaceGlobal.java`
#### Snippet
```java

	public ReplaceGlobal(CtClass ctClass, CtExpression...args) {
		this.newExpression = ctClass.getFactory().Code().createConstructorCall(ctClass.getReference(), args);
	}

```

### UNCHECKED_WARNING
Unchecked assignment: 'fr.inria.spirals.npefix.resi.context.Decision' to 'fr.inria.spirals.npefix.resi.context.Decision'
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/ArrayReadLast.java`
#### Snippet
```java
		List<Decision<T>> output = new ArrayList<>();
		Instance instance = new ArrayReadInstance("<?>", 0);
		output.add(new Decision<>(this, location, instance, clazz));
		return output;
	}
```

### UNCHECKED_WARNING
Unchecked call to 'Decision(Strategy, Location, Instance, Class)' as a member of raw type 'fr.inria.spirals.npefix.resi.context.Decision'
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/ArrayReadLast.java`
#### Snippet
```java
		List<Decision<T>> output = new ArrayList<>();
		Instance instance = new ArrayReadInstance("<?>", 0);
		output.add(new Decision<>(this, location, instance, clazz));
		return output;
	}
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Class\>' to 'java.lang.Class'
in `src/main/java/fr/inria/spirals/npefix/main/run/Main.java`
#### Snippet
```java

	private RepairStrategy getRepairStrategy() throws Exception {
		Class<RepairStrategy> aClass = (Class<RepairStrategy>) this.getClass().getClassLoader().loadClass(this.repairStrategyClassname);
		Constructor<RepairStrategy> constructor = aClass.getConstructor(String[].class);
		return constructor.newInstance(new Object[]{sources.toArray(new String[]{})});
```

### UNCHECKED_WARNING
Unchecked assignment: 'spoon.reflect.reference.CtTypeReference' to 'spoon.reflect.reference.CtTypeReference'
in `src/main/java/fr/inria/spirals/npefix/resi/context/instance/NewInstance.java`
#### Snippet
```java
			constructorParameters[i] = instance.toCtExpression(factory);
		}
		return factory.Code().createConstructorCall(reference, constructorParameters);
	}
}
```

### UNCHECKED_WARNING
Unchecked cast: 'capture' to 'T'
in `src/main/java/fr/inria/spirals/npefix/resi/context/instance/NewInstance.java`
#### Snippet
```java

				constructor.setAccessible(true);
				return (T) constructor.newInstance(objectParam);
			} catch (ClassNotFoundException e) {
				Constructor<?> constructor = CallChecker.currentClassLoader
```

### UNCHECKED_WARNING
Unchecked cast: 'capture' to 'T'
in `src/main/java/fr/inria/spirals/npefix/resi/context/instance/NewInstance.java`
#### Snippet
```java

				constructor.setAccessible(true);
				return (T) constructor.newInstance(objectParam);
			}
		} catch (Exception e) {
```

### UNCHECKED_WARNING
Unchecked call to 'PrimitiveInstance(T)' as a member of raw type 'fr.inria.spirals.npefix.resi.context.instance.PrimitiveInstance'
in `src/main/java/fr/inria/spirals/npefix/main/patch/SortPatch.java`
#### Snippet
```java
		String clazz = object.getString("class");
		if (value instanceof String && "null".equals(clazz)) {
			return new PrimitiveInstance(null);
		}
		return new PrimitiveInstance<>(value);
```

### UNCHECKED_WARNING
Unchecked call to 'NewArrayInstance(String, List\>)' as a member of raw type 'fr.inria.spirals.npefix.resi.context.instance.NewArrayInstance'
in `src/main/java/fr/inria/spirals/npefix/main/patch/SortPatch.java`
#### Snippet
```java
			}
		}
		return new NewArrayInstance(object.getString("class"), values);
	}
	private static Instance createNewInstanceFromJson(JSONObject object) {
```

### UNCHECKED_WARNING
Unchecked call to 'NewInstance(String, String\[\], List\>)' as a member of raw type 'fr.inria.spirals.npefix.resi.context.instance.NewInstance'
in `src/main/java/fr/inria/spirals/npefix/main/patch/SortPatch.java`
#### Snippet
```java
			}
		}
		return new NewInstance(object.getString("class"), parameterTypes, parameters);
	}
	private static Instance createVariableInstanceFromJson(JSONObject object) {
```

### UNCHECKED_WARNING
Unchecked call to 'setValue(Instance)' as a member of raw type 'fr.inria.spirals.npefix.resi.context.Decision'
in `src/main/java/fr/inria/spirals/npefix/main/patch/SortPatch.java`
#### Snippet
```java
				Decision decision = new Decision(strategy, location);
				decision.setDecisionType(Decision.DecisionType.valueOf(((JSONObject) jsonDecision).getString("decisionType")));
				decision.setValue(createInstanceFromJson(((JSONObject) jsonDecision).getJSONObject("value")));
				decision.setUsed(((JSONObject) jsonDecision).getBoolean("used"));
				decisions.add(decision);
```

### UNCHECKED_WARNING
Unchecked assignment: 'fr.inria.spirals.npefix.resi.context.Decision' to 'fr.inria.spirals.npefix.resi.context.Decision'
in `src/main/java/fr/inria/spirals/npefix/resi/selector/GreedySelector.java`
#### Snippet
```java
			getCurrentLapse().putMetadata("strategy_selection", "best");
			bestDecision.setEpsilon(epsilon);
			return bestDecision;
		}
		// return a random strategy
```

### UNCHECKED_WARNING
Unchecked assignment: 'fr.inria.spirals.npefix.resi.context.Decision' to 'fr.inria.spirals.npefix.resi.context.Decision'
in `src/main/java/fr/inria/spirals/npefix/resi/selector/GreedySelector.java`
#### Snippet
```java
		}
		output.setEpsilon(epsilon);
		return output;
	}

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'
in `src/main/java/fr/inria/spirals/npefix/patch/sorter/Tokens.java`
#### Snippet
```java
	}
	public int count (Token token) {
		return count(token,Collections.EMPTY_LIST);
	}

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `src/main/java/fr/inria/spirals/npefix/resi/context/instance/NewArrayInstance.java`
#### Snippet
```java
	public T getValue() {
		Class<?> aClass = getClassFromString(clazz);
		T t = (T) Array.newInstance(aClass, values.size());
		for (int i = 1; i< level; i++) {
			t = (T) Array.newInstance(t.getClass(), values.size());
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `src/main/java/fr/inria/spirals/npefix/resi/context/instance/NewArrayInstance.java`
#### Snippet
```java
		T t = (T) Array.newInstance(aClass, values.size());
		for (int i = 1; i< level; i++) {
			t = (T) Array.newInstance(t.getClass(), values.size());
		}
		for (int i = 0; i < values.size(); i++) {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `src/main/java/fr/inria/spirals/npefix/resi/context/instance/ArrayReadInstance.java`
#### Snippet
```java
	public T getValue() {
		Object o = CallChecker.getCurrentMethodContext().getVariables().get(variableName);
		return (T) o;
	}

```

### UNCHECKED_WARNING
Unchecked call to 'Decision(Strategy, Location, Instance)' as a member of raw type 'fr.inria.spirals.npefix.resi.context.Decision'
in `src/evaluation/java/fr/inria/spirals/npefix/resi/NPEFixTemplateEvaluation.java`
#### Snippet
```java
		Location location = getLocation(element);

		Decision decision = new Decision<>(new Strat3(), location, new PrimitiveInstance(false));

		output.addAll(applyAndRunPatch(launcher, new SkipLine(), element,
```

### UNCHECKED_WARNING
Unchecked call to 'PrimitiveInstance(T)' as a member of raw type 'fr.inria.spirals.npefix.resi.context.instance.PrimitiveInstance'
in `src/evaluation/java/fr/inria/spirals/npefix/resi/NPEFixTemplateEvaluation.java`
#### Snippet
```java
		Location location = getLocation(element);

		Decision decision = new Decision<>(new Strat3(), location, new PrimitiveInstance(false));

		output.addAll(applyAndRunPatch(launcher, new SkipLine(), element,
```

### UNCHECKED_WARNING
Unchecked assignment: 'spoon.reflect.reference.CtVariableReference' to 'spoon.reflect.reference.CtVariableReference'. Reason: 'ctVariable' has raw type, so result of getReference is erased
in `src/evaluation/java/fr/inria/spirals/npefix/resi/NPEFixTemplateEvaluation.java`
#### Snippet
```java
			}
			boolean isStatic = ctVariable.hasModifier(ModifierKind.STATIC);
			CtVariableAccess variableRead = ctVariable.getFactory().Code().createVariableRead(ctVariable.getReference(), isStatic);
			if (variableRead instanceof CtFieldAccess) {
				((CtFieldAccess) variableRead).setTarget(null);
```

### UNCHECKED_WARNING
Unchecked call to 'setTarget(E)' as a member of raw type 'spoon.reflect.code.CtTargetedExpression'
in `src/evaluation/java/fr/inria/spirals/npefix/resi/NPEFixTemplateEvaluation.java`
#### Snippet
```java
			CtVariableAccess variableRead = ctVariable.getFactory().Code().createVariableRead(ctVariable.getReference(), isStatic);
			if (variableRead instanceof CtFieldAccess) {
				((CtFieldAccess) variableRead).setTarget(null);
			}
			if (ctVariable.getType() instanceof CtArrayTypeReference && !VariableFinder.isAssignableFrom(typeOfElement, ctVariable.getType())) {
```

### UNCHECKED_WARNING
Unchecked call to 'setTarget(E)' as a member of raw type 'spoon.reflect.code.CtTargetedExpression'
in `src/evaluation/java/fr/inria/spirals/npefix/resi/NPEFixTemplateEvaluation.java`
#### Snippet
```java
			if (ctVariable.getType() instanceof CtArrayTypeReference && !VariableFinder.isAssignableFrom(typeOfElement, ctVariable.getType())) {
				CtArrayRead arrayRead = ctVariable.getFactory().Core().createArrayRead();
				arrayRead.setTarget(variableRead);
				arrayRead.setIndexExpression(ctVariable.getFactory().Code().createLiteral(0));
				output.add(arrayRead);
```

### UNCHECKED_WARNING
Unchecked call to 'setIndexExpression(CtExpression)' as a member of raw type 'spoon.reflect.code.CtArrayAccess'
in `src/evaluation/java/fr/inria/spirals/npefix/resi/NPEFixTemplateEvaluation.java`
#### Snippet
```java
				CtArrayRead arrayRead = ctVariable.getFactory().Core().createArrayRead();
				arrayRead.setTarget(variableRead);
				arrayRead.setIndexExpression(ctVariable.getFactory().Code().createLiteral(0));
				output.add(arrayRead);
			} else {
```

### UNCHECKED_WARNING
Unchecked call to 'Decision(Strategy, Location, Instance)' as a member of raw type 'fr.inria.spirals.npefix.resi.context.Decision'
in `src/evaluation/java/fr/inria/spirals/npefix/resi/NPEFixTemplateEvaluation.java`
#### Snippet
```java
			CtExpression newInstance = instances.get(i);

			Decision decision = new Decision<>(new Strat2A(), location,
					InstanceFactory.fromCtExpression(newInstance));
			output.addAll(applyAndRunPatch(launcher, new ReplaceLocal(newInstance), element,
```

### UNCHECKED_WARNING
Unchecked call to 'Decision(Strategy, Location, Instance)' as a member of raw type 'fr.inria.spirals.npefix.resi.context.Decision'
in `src/evaluation/java/fr/inria/spirals/npefix/resi/NPEFixTemplateEvaluation.java`
#### Snippet
```java
			CtExpression newInstance = instances.get(i);

			Decision decision = new Decision<>(new Strat2B(),
					location,
					InstanceFactory.fromCtExpression(newInstance));
```

### UNCHECKED_WARNING
Unchecked call to 'Decision(Strategy, Location, Instance)' as a member of raw type 'fr.inria.spirals.npefix.resi.context.Decision'
in `src/evaluation/java/fr/inria/spirals/npefix/resi/NPEFixTemplateEvaluation.java`
#### Snippet
```java
		for (int i = 0; i < variables.size(); i++) {
			CtExpression ctVariableAccess = variables.get(i);
			Decision decision = new Decision<>(new Strat1A(),
					location,
					InstanceFactory.fromCtExpression(ctVariableAccess));
```

### UNCHECKED_WARNING
Unchecked call to 'Decision(Strategy, Location, Instance)' as a member of raw type 'fr.inria.spirals.npefix.resi.context.Decision'
in `src/evaluation/java/fr/inria/spirals/npefix/resi/NPEFixTemplateEvaluation.java`
#### Snippet
```java
		for (int i = 0; i < variables.size(); i++) {
			CtExpression ctVariableAccess = variables.get(i);
			Decision decision = new Decision<>(new Strat1B(),
					location,
					InstanceFactory.fromCtExpression(ctVariableAccess));
```

### UNCHECKED_WARNING
Unchecked call to 'Decision(Strategy, Location, Instance)' as a member of raw type 'fr.inria.spirals.npefix.resi.context.Decision'
in `src/evaluation/java/fr/inria/spirals/npefix/resi/NPEFixTemplateEvaluation.java`
#### Snippet
```java
				}

				Decision decision = new Decision<>(new Strat4(type), location, instance);
				output.addAll(applyAndRunPatch(launcher, new SkipMethodReturn(ctVariable), element, decision, inputSources));
			}
```

### UNCHECKED_WARNING
Unchecked call to 'setAssignment(CtExpression)' as a member of raw type 'spoon.reflect.code.CtRHSReceiver'
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/TernarySplitter.java`
#### Snippet
```java
            CtAssignment assignment) {
        CtAssignment assignmentThen = assignment.clone();
        assignmentThen.setAssignment(ctConditional.getThenExpression());

        CtAssignment assignmentElse = assignment.clone();
```

### UNCHECKED_WARNING
Unchecked call to 'setAssignment(CtExpression)' as a member of raw type 'spoon.reflect.code.CtRHSReceiver'
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/TernarySplitter.java`
#### Snippet
```java

        CtAssignment assignmentElse = assignment.clone();
        assignmentElse.setAssignment(ctConditional.getElseExpression().clone());

        List<CtTypeReference> typeCasts = ctConditional.getTypeCasts();
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'. Reason: 'ctConditional' has raw type, so result of getTypeCasts is erased
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/TernarySplitter.java`
#### Snippet
```java
        assignmentElse.setAssignment(ctConditional.getElseExpression().clone());

        List<CtTypeReference> typeCasts = ctConditional.getTypeCasts();
        for (int i = 0; i < typeCasts.size(); i++) {
            CtTypeReference ctTypeReference = typeCasts.get(i);
```

### UNCHECKED_WARNING
Unchecked call to 'addTypeCast(CtTypeReference)' as a member of raw type 'spoon.reflect.code.CtExpression'
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/TernarySplitter.java`
#### Snippet
```java
        for (int i = 0; i < typeCasts.size(); i++) {
            CtTypeReference ctTypeReference = typeCasts.get(i);
            assignmentThen.getAssignment().addTypeCast(ctTypeReference.clone());
            assignmentElse.getAssignment().addTypeCast(ctTypeReference.clone());
        }
```

### UNCHECKED_WARNING
Unchecked call to 'addTypeCast(CtTypeReference)' as a member of raw type 'spoon.reflect.code.CtExpression'
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/TernarySplitter.java`
#### Snippet
```java
            CtTypeReference ctTypeReference = typeCasts.get(i);
            assignmentThen.getAssignment().addTypeCast(ctTypeReference.clone());
            assignmentElse.getAssignment().addTypeCast(ctTypeReference.clone());
        }

```

### UNCHECKED_WARNING
Unchecked call to 'setReturnedExpression(CtExpression)' as a member of raw type 'spoon.reflect.code.CtReturn'
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/TernarySplitter.java`
#### Snippet
```java
            CtReturn returnElse = (CtReturn) parent.clone();

            returnThen.setReturnedExpression(ctConditional.getThenExpression());
            returnElse.setReturnedExpression(ctConditional.getElseExpression());

```

### UNCHECKED_WARNING
Unchecked call to 'setReturnedExpression(CtExpression)' as a member of raw type 'spoon.reflect.code.CtReturn'
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/TernarySplitter.java`
#### Snippet
```java

            returnThen.setReturnedExpression(ctConditional.getThenExpression());
            returnElse.setReturnedExpression(ctConditional.getElseExpression());

            List<CtTypeReference> typeCasts = ctConditional.getTypeCasts();
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'. Reason: 'ctConditional' has raw type, so result of getTypeCasts is erased
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/TernarySplitter.java`
#### Snippet
```java
            returnElse.setReturnedExpression(ctConditional.getElseExpression());

            List<CtTypeReference> typeCasts = ctConditional.getTypeCasts();
            for (int i = 0; i < typeCasts.size(); i++) {
                CtTypeReference ctTypeReference = typeCasts.get(i);
```

### UNCHECKED_WARNING
Unchecked call to 'addTypeCast(CtTypeReference)' as a member of raw type 'spoon.reflect.code.CtExpression'
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/TernarySplitter.java`
#### Snippet
```java
            for (int i = 0; i < typeCasts.size(); i++) {
                CtTypeReference ctTypeReference = typeCasts.get(i);
                returnThen.getReturnedExpression().addTypeCast(ctTypeReference.clone());
                returnElse.getReturnedExpression().addTypeCast(ctTypeReference.clone());
            }
```

### UNCHECKED_WARNING
Unchecked call to 'addTypeCast(CtTypeReference)' as a member of raw type 'spoon.reflect.code.CtExpression'
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/TernarySplitter.java`
#### Snippet
```java
                CtTypeReference ctTypeReference = typeCasts.get(i);
                returnThen.getReturnedExpression().addTypeCast(ctTypeReference.clone());
                returnElse.getReturnedExpression().addTypeCast(ctTypeReference.clone());
            }

```

### UNCHECKED_WARNING
Unchecked call to 'setLeftHandOperand(CtExpression)' as a member of raw type 'spoon.reflect.code.CtBinaryOperator'
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/TernarySplitter.java`
#### Snippet
```java

                    if(ctBinaryOperator.getLeftHandOperand().equals(ctConditional)) {
                        cloneThen.setLeftHandOperand(ctConditional.getThenExpression());
                        ctConditional.getThenExpression().setParent(cloneThen);
                        cloneElse.setLeftHandOperand(ctConditional.getElseExpression());
```

### UNCHECKED_WARNING
Unchecked call to 'setLeftHandOperand(CtExpression)' as a member of raw type 'spoon.reflect.code.CtBinaryOperator'
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/TernarySplitter.java`
#### Snippet
```java
                        cloneThen.setLeftHandOperand(ctConditional.getThenExpression());
                        ctConditional.getThenExpression().setParent(cloneThen);
                        cloneElse.setLeftHandOperand(ctConditional.getElseExpression());
                    } else if(ctBinaryOperator.getRightHandOperand().equals(ctConditional)) {
                        cloneThen.setRightHandOperand(ctConditional.getThenExpression());
```

### UNCHECKED_WARNING
Unchecked call to 'setRightHandOperand(CtExpression)' as a member of raw type 'spoon.reflect.code.CtBinaryOperator'
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/TernarySplitter.java`
#### Snippet
```java
                        cloneElse.setLeftHandOperand(ctConditional.getElseExpression());
                    } else if(ctBinaryOperator.getRightHandOperand().equals(ctConditional)) {
                        cloneThen.setRightHandOperand(ctConditional.getThenExpression());
                        cloneElse.setRightHandOperand(ctConditional.getElseExpression());
                    }
```

### UNCHECKED_WARNING
Unchecked call to 'setRightHandOperand(CtExpression)' as a member of raw type 'spoon.reflect.code.CtBinaryOperator'
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/TernarySplitter.java`
#### Snippet
```java
                    } else if(ctBinaryOperator.getRightHandOperand().equals(ctConditional)) {
                        cloneThen.setRightHandOperand(ctConditional.getThenExpression());
                        cloneElse.setRightHandOperand(ctConditional.getElseExpression());
                    }

```

### UNCHECKED_WARNING
Unchecked call to 'setAssignment(CtExpression)' as a member of raw type 'spoon.reflect.code.CtRHSReceiver'
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/TernarySplitter.java`
#### Snippet
```java
                    cloneThen.getLeftHandOperand().setParent(cloneThen);
                    cloneElse.getLeftHandOperand().setParent(cloneElse);
                    ((CtAssignment)((CtBlock)anIf.getThenStatement()).getStatement(0)).setAssignment(cloneThen);
                    ((CtAssignment)((CtBlock)anIf.getElseStatement()).getStatement(0)).setAssignment(cloneElse);
                } else {
```

### UNCHECKED_WARNING
Unchecked call to 'setAssignment(CtExpression)' as a member of raw type 'spoon.reflect.code.CtRHSReceiver'
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/TernarySplitter.java`
#### Snippet
```java
                    cloneElse.getLeftHandOperand().setParent(cloneElse);
                    ((CtAssignment)((CtBlock)anIf.getThenStatement()).getStatement(0)).setAssignment(cloneThen);
                    ((CtAssignment)((CtBlock)anIf.getElseStatement()).getStatement(0)).setAssignment(cloneElse);
                } else {
                    return;
```

### UNCHECKED_WARNING
Unchecked call to 'setDefaultExpression(CtExpression)' as a member of raw type 'spoon.reflect.declaration.CtVariable'
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/TernarySplitter.java`
#### Snippet
```java

            CtLocalVariable clone = localVariable.clone();
            clone.setDefaultExpression(null);

            localVariable.insertBefore(clone);
```

### UNCHECKED_WARNING
Unchecked assignment: 'spoon.reflect.reference.CtLocalVariableReference' to 'spoon.reflect.reference.CtVariableReference'. Reason: 'localVariable' has raw type, so result of getReference is erased
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/TernarySplitter.java`
#### Snippet
```java

            CtAssignment variableAssignment = getFactory().Code()
                    .createVariableAssignment(localVariable.getReference(),
                            false, ctConditional);
            variableAssignment.setType(localVariable.getType().clone());
```

### UNCHECKED_WARNING
Unchecked assignment: 'spoon.reflect.code.CtConditional' to 'spoon.reflect.code.CtExpression'
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/TernarySplitter.java`
#### Snippet
```java
            CtAssignment variableAssignment = getFactory().Code()
                    .createVariableAssignment(localVariable.getReference(),
                            false, ctConditional);
            variableAssignment.setType(localVariable.getType().clone());
            variableAssignment.setPosition(ctConditional.getPosition());
```

### UNCHECKED_WARNING
Unchecked call to 'set(int, E)' as a member of raw type 'java.util.List'
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/TernarySplitter.java`
#### Snippet
```java
                if(o.equals(ctConditional)) {
                    ctConditional.getThenExpression().setParent(invocation);
                    arguments.set(i, ctConditional.getThenExpression());
                    ctConditional.getElseExpression().setParent(invocation);
                    cloneElse.getArguments().set(i, ctConditional.getElseExpression());
```

### UNCHECKED_WARNING
Unchecked call to 'set(int, E)' as a member of raw type 'java.util.List'
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/TernarySplitter.java`
#### Snippet
```java
                    arguments.set(i, ctConditional.getThenExpression());
                    ctConditional.getElseExpression().setParent(invocation);
                    cloneElse.getArguments().set(i, ctConditional.getElseExpression());
                    found = true;
                    break;
```

### UNCHECKED_WARNING
Unchecked call to 'set(int, E)' as a member of raw type 'java.util.List'
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/TernarySplitter.java`
#### Snippet
```java
                Object o =  arguments.get(i);
                if(o.equals(ctConditional)) {
                    arguments.set(i, ctConditional.getThenExpression());
                    cloneElse.getArguments().set(i, ctConditional.getElseExpression());
                    found = true;
```

### UNCHECKED_WARNING
Unchecked call to 'set(int, E)' as a member of raw type 'java.util.List'
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/TernarySplitter.java`
#### Snippet
```java
                if(o.equals(ctConditional)) {
                    arguments.set(i, ctConditional.getThenExpression());
                    cloneElse.getArguments().set(i, ctConditional.getElseExpression());
                    found = true;
                    break;
```

### UNCHECKED_WARNING
Unchecked assignment: 'spoon.reflect.code.CtExpression' to 'spoon.reflect.code.CtExpression'. Reason: 'ctConditional' has raw type, so result of getThenExpression is erased
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/TernarySplitter.java`
#### Snippet
```java
            cloneElse.setParent(anIf);

            cloneThen.setCondition(ctConditional.getThenExpression());
            ctConditional.getThenExpression().setParent(cloneThen);

```

### UNCHECKED_WARNING
Unchecked assignment: 'spoon.reflect.code.CtExpression' to 'spoon.reflect.code.CtExpression'. Reason: 'ctConditional' has raw type, so result of getElseExpression is erased
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/TernarySplitter.java`
#### Snippet
```java
            ctConditional.getThenExpression().setParent(cloneThen);

            cloneElse.setCondition(ctConditional.getElseExpression());
            ctConditional.getElseExpression().setParent(cloneElse);

```

### UNCHECKED_WARNING
Unchecked assignment: 'spoon.reflect.code.CtExpression' to 'spoon.reflect.code.CtExpression'
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/TernarySplitter.java`
#### Snippet
```java
                    .setTypeCasts(ctConditional.getTypeCasts());
        }*/
        anIf.setCondition(condition);
        condition.setParent(anIf);
        parent.replace(anIf);
```

### UNCHECKED_WARNING
Unchecked call to 'PrimitiveInstance(T)' as a member of raw type 'fr.inria.spirals.npefix.resi.context.instance.PrimitiveInstance'
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/ArrayReadFirst.java`
#### Snippet
```java
	public <T> List<Decision<T>> getSearchSpace(Object array, Class<T> clazz, Location location, MethodContext context) {
		List<Decision<T>> output = new ArrayList<>();
		Instance instance = new PrimitiveInstance(1);
		output.add(new Decision<>(this, location, instance, clazz));
		return output;
```

### UNCHECKED_WARNING
Unchecked assignment: 'fr.inria.spirals.npefix.resi.context.Decision' to 'fr.inria.spirals.npefix.resi.context.Decision'
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/ArrayReadFirst.java`
#### Snippet
```java
		List<Decision<T>> output = new ArrayList<>();
		Instance instance = new PrimitiveInstance(1);
		output.add(new Decision<>(this, location, instance, clazz));
		return output;
	}
```

### UNCHECKED_WARNING
Unchecked call to 'Decision(Strategy, Location, Instance, Class)' as a member of raw type 'fr.inria.spirals.npefix.resi.context.Decision'
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/ArrayReadFirst.java`
#### Snippet
```java
		List<Decision<T>> output = new ArrayList<>();
		Instance instance = new PrimitiveInstance(1);
		output.add(new Decision<>(this, location, instance, clazz));
		return output;
	}
```

### UNCHECKED_WARNING
Unchecked call to 'PrimitiveInstance(T)' as a member of raw type 'fr.inria.spirals.npefix.resi.context.instance.PrimitiveInstance'
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/ArrayReadReturnNull.java`
#### Snippet
```java
			Class<T> clazz, Location location, MethodContext context) {
		List<Decision<T>> output = new ArrayList<>();
		Instance instance = new PrimitiveInstance(null);
		output.add(new Decision<>(this, location, instance, clazz));
		return output;
```

### UNCHECKED_WARNING
Unchecked assignment: 'fr.inria.spirals.npefix.resi.context.Decision' to 'fr.inria.spirals.npefix.resi.context.Decision'
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/ArrayReadReturnNull.java`
#### Snippet
```java
		List<Decision<T>> output = new ArrayList<>();
		Instance instance = new PrimitiveInstance(null);
		output.add(new Decision<>(this, location, instance, clazz));
		return output;
	}
```

### UNCHECKED_WARNING
Unchecked call to 'Decision(Strategy, Location, Instance, Class)' as a member of raw type 'fr.inria.spirals.npefix.resi.context.Decision'
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/ArrayReadReturnNull.java`
#### Snippet
```java
		List<Decision<T>> output = new ArrayList<>();
		Instance instance = new PrimitiveInstance(null);
		output.add(new Decision<>(this, location, instance, clazz));
		return output;
	}
```

### UNCHECKED_WARNING
Unchecked assignment: 'spoon.reflect.reference.CtVariableReference' to 'spoon.reflect.reference.CtVariableReference'. Reason: 'variable' has raw type, so result of getReference is erased
in `src/main/java/fr/inria/spirals/npefix/patchTemplate/template/ReplaceLocal.java`
#### Snippet
```java

	public ReplaceLocal(CtVariable variable) {
		this.newExpression = variable.getFactory().Code().createVariableRead(variable.getReference(), variable.hasModifier(ModifierKind.STATIC));
	}

```

### UNCHECKED_WARNING
Unchecked assignment: 'spoon.reflect.reference.CtTypeReference' to 'spoon.reflect.reference.CtTypeReference'. Reason: 'ctClass' has raw type, so result of getReference is erased
in `src/main/java/fr/inria/spirals/npefix/patchTemplate/template/ReplaceLocal.java`
#### Snippet
```java

	public ReplaceLocal(CtClass ctClass, CtExpression...args) {
		this.newExpression = ctClass.getFactory().Code().createConstructorCall(ctClass.getReference(), args);
	}

```

### UNCHECKED_WARNING
Unchecked assignment: 'spoon.reflect.reference.CtLocalVariableReference' to 'spoon.reflect.reference.CtVariableReference'. Reason: '((CtLocalVariable) superLine)' has raw type, so result of getReference is erased
in `src/main/java/fr/inria/spirals/npefix/patchTemplate/template/ReplaceLocal.java`
#### Snippet
```java

		if (superLine instanceof CtLocalVariable) {
			CtAssignment variableAssignment = factory.Code().createVariableAssignment(((CtLocalVariable) superLine).getReference(), false, null);
			CtAssignment assignmentWhenNull = variableAssignment.clone();
			variableAssignment.setAssignment(((CtLocalVariable) superLine).getDefaultExpression());
```

### UNCHECKED_WARNING
Unchecked call to 'setAssignment(CtExpression)' as a member of raw type 'spoon.reflect.code.CtRHSReceiver'
in `src/main/java/fr/inria/spirals/npefix/patchTemplate/template/ReplaceLocal.java`
#### Snippet
```java
			CtAssignment variableAssignment = factory.Code().createVariableAssignment(((CtLocalVariable) superLine).getReference(), false, null);
			CtAssignment assignmentWhenNull = variableAssignment.clone();
			variableAssignment.setAssignment(((CtLocalVariable) superLine).getDefaultExpression());
			((CtLocalVariable) superLine).setDefaultExpression(null);

```

### UNCHECKED_WARNING
Unchecked call to 'setDefaultExpression(CtExpression)' as a member of raw type 'spoon.reflect.declaration.CtVariable'
in `src/main/java/fr/inria/spirals/npefix/patchTemplate/template/ReplaceLocal.java`
#### Snippet
```java
			CtAssignment assignmentWhenNull = variableAssignment.clone();
			variableAssignment.setAssignment(((CtLocalVariable) superLine).getDefaultExpression());
			((CtLocalVariable) superLine).setDefaultExpression(null);

			nullExpression.replace(newExpression);
```

### UNCHECKED_WARNING
Unchecked call to 'setAssignment(CtExpression)' as a member of raw type 'spoon.reflect.code.CtRHSReceiver'
in `src/main/java/fr/inria/spirals/npefix/patchTemplate/template/ReplaceLocal.java`
#### Snippet
```java

			CtLocalVariable parent = (CtLocalVariable) nullExpression.getParent(new LineFilter());
			assignmentWhenNull.setAssignment(parent.getDefaultExpression().clone());
			anIf.setThenStatement(assignmentWhenNull);
			anIf.setElseStatement(variableAssignment);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'. Reason: 'type.getTypeDeclaration()' has raw type, so result of getFields is erased
in `src/main/java/fr/inria/spirals/npefix/patchTemplate/VariableFinder.java`
#### Snippet
```java
			}
		}
		List<CtField> fields = type.getTypeDeclaration().getFields();
		for (int i = 0; i < fields.size(); i++) {
			CtField ctField = fields.get(i);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.Collection'. Reason: 'e' has raw type, so result of getParameters is erased
in `src/main/java/fr/inria/spirals/npefix/patchTemplate/VariableFinder.java`
#### Snippet
```java
			@Override
			public void scanCtExecutable(CtExecutable e) {
				variables.addAll(e.getParameters());
				super.scanCtExecutable(e);
			}
```

### UNCHECKED_WARNING
Unchecked assignment: 'spoon.reflect.declaration.CtExecutable' to 'spoon.reflect.declaration.CtExecutable'
in `src/main/java/fr/inria/spirals/npefix/patchTemplate/VariableFinder.java`
#### Snippet
```java
			public void scanCtExecutable(CtExecutable e) {
				variables.addAll(e.getParameters());
				super.scanCtExecutable(e);
			}

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.lang.Class' to 'java.lang.Class'
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/Strat4.java`
#### Snippet
```java
			Location location,
			MethodContext context) {
		clazz = context.getMethodType();

		List<Decision<T>> output = new ArrayList<>();
```

### UNCHECKED_WARNING
Unchecked assignment: 'fr.inria.spirals.npefix.resi.context.Decision' to 'fr.inria.spirals.npefix.resi.context.Decision'
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/Strat4.java`
#### Snippet
```java
			// constructor don't have expected return
			if (returnType == ReturnType.VOID) {
				output.add(new Decision(this, location, new PrimitiveInstance(null)));
			}
			return output;
```

### UNCHECKED_WARNING
Unchecked call to 'Decision(Strategy, Location, Instance)' as a member of raw type 'fr.inria.spirals.npefix.resi.context.Decision'
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/Strat4.java`
#### Snippet
```java
			// constructor don't have expected return
			if (returnType == ReturnType.VOID) {
				output.add(new Decision(this, location, new PrimitiveInstance(null)));
			}
			return output;
```

### UNCHECKED_WARNING
Unchecked call to 'PrimitiveInstance(T)' as a member of raw type 'fr.inria.spirals.npefix.resi.context.instance.PrimitiveInstance'
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/Strat4.java`
#### Snippet
```java
			// constructor don't have expected return
			if (returnType == ReturnType.VOID) {
				output.add(new Decision(this, location, new PrimitiveInstance(null)));
			}
			return output;
```

### UNCHECKED_WARNING
Unchecked assignment: 'fr.inria.spirals.npefix.resi.context.Decision' to 'fr.inria.spirals.npefix.resi.context.Decision'
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/Strat4.java`
#### Snippet
```java
		case VOID:
			if(void.class.equals(clazz)) {
				output.add(new Decision(this, location, new PrimitiveInstance(null), void.class));
			}
			break;
```

### UNCHECKED_WARNING
Unchecked call to 'Decision(Strategy, Location, Instance, Class)' as a member of raw type 'fr.inria.spirals.npefix.resi.context.Decision'
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/Strat4.java`
#### Snippet
```java
		case VOID:
			if(void.class.equals(clazz)) {
				output.add(new Decision(this, location, new PrimitiveInstance(null), void.class));
			}
			break;
```

### UNCHECKED_WARNING
Unchecked call to 'PrimitiveInstance(T)' as a member of raw type 'fr.inria.spirals.npefix.resi.context.instance.PrimitiveInstance'
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/Strat4.java`
#### Snippet
```java
		case VOID:
			if(void.class.equals(clazz)) {
				output.add(new Decision(this, location, new PrimitiveInstance(null), void.class));
			}
			break;
```

### UNCHECKED_WARNING
Unchecked assignment: 'fr.inria.spirals.npefix.resi.context.Decision' to 'fr.inria.spirals.npefix.resi.context.Decision'
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/Strat4.java`
#### Snippet
```java
		case NULL:
			if(!clazz.isPrimitive()) {
				output.add(new Decision(this, location, new PrimitiveInstance(null), clazz));
			}
			break;
```

### UNCHECKED_WARNING
Unchecked call to 'Decision(Strategy, Location, Instance, Class)' as a member of raw type 'fr.inria.spirals.npefix.resi.context.Decision'
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/Strat4.java`
#### Snippet
```java
		case NULL:
			if(!clazz.isPrimitive()) {
				output.add(new Decision(this, location, new PrimitiveInstance(null), clazz));
			}
			break;
```

### UNCHECKED_WARNING
Unchecked call to 'PrimitiveInstance(T)' as a member of raw type 'fr.inria.spirals.npefix.resi.context.instance.PrimitiveInstance'
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/Strat4.java`
#### Snippet
```java
		case NULL:
			if(!clazz.isPrimitive()) {
				output.add(new Decision(this, location, new PrimitiveInstance(null), clazz));
			}
			break;
```

### UNCHECKED_WARNING
Unchecked call to 'setDeclaringType(CtTypeReference)' as a member of raw type 'spoon.reflect.reference.CtExecutableReference'
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/ProcessorUtility.java`
#### Snippet
```java
        CtTypeReference<?> classReference = factory.Type().createReference(clazz);
        CtExecutableReference execRef = factory.Core().createExecutableReference();
        execRef.setDeclaringType(classReference);
        execRef.setSimpleName(methodName);
        execRef.setStatic(true);
```

### UNCHECKED_WARNING
Unchecked call to 'setAccessedType(CtTypeReference)' as a member of raw type 'spoon.reflect.code.CtTypeAccess'
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/ProcessorUtility.java`
#### Snippet
```java
        CtTypeAccess typeAccess = factory.Core().createTypeAccess();
        typeAccess.setType(classReference);
        typeAccess.setAccessedType(classReference);
        return factory.Code().createInvocation(typeAccess, execRef, arguments);
    }
```

### UNCHECKED_WARNING
Unchecked assignment: 'spoon.reflect.reference.CtExecutableReference' to 'spoon.reflect.reference.CtExecutableReference'
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/ProcessorUtility.java`
#### Snippet
```java
        typeAccess.setType(classReference);
        typeAccess.setAccessedType(classReference);
        return factory.Code().createInvocation(typeAccess, execRef, arguments);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'setTypeCasts(List\>)' as a member of raw type 'spoon.reflect.code.CtExpression'
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/ProcessorUtility.java`
#### Snippet
```java
                        assigned.getFactory().Code().createLiteral(1),
                        operator);
                operand.setTypeCasts(ctUnaryOperator.getTypeCasts());
            }
            operand.setParent(ctUnaryOperator.getParent());
```

### UNCHECKED_WARNING
Unchecked call to 'setVariable(CtVariableReference)' as a member of raw type 'spoon.reflect.code.CtVariableAccess'
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/ProcessorUtility.java`
#### Snippet
```java

            ctType = targetType.getFactory().Core().createFieldRead();
            ((CtFieldAccess) ctType).setVariable(ctfe);
            ctType.setType(targetType.getFactory().Code().createCtTypeReference(Class.class));
        }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Class\>' to 'java.lang.Class'
in `src/main/java/fr/inria/spirals/npefix/resi/context/Decision.java`
#### Snippet
```java
	public Class<T> getValueType() {
		try {
			return (Class<T>) getClass().forName(valueType);
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List\>'
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/NoStrat.java`
#### Snippet
```java
			Location location,
			MethodContext context) {
		return Collections.EMPTY_LIST;
	}
}
```

### UNCHECKED_WARNING
Unchecked call to 'addTypeCast(CtTypeReference)' as a member of raw type 'spoon.reflect.code.CtExpression'
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/VarRetrieveInit.java`
#### Snippet
```java
				!defaultExpression.toString().equals("null")) {
			CtTypeReference destType = element.getType();
			defaultExpression.addTypeCast(destType.clone());
		}
		element.setDefaultExpression(invoc);
```

### UNCHECKED_WARNING
Unchecked call to 'setDefaultExpression(CtExpression)' as a member of raw type 'spoon.reflect.declaration.CtVariable'
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/VarRetrieveInit.java`
#### Snippet
```java
			defaultExpression.addTypeCast(destType.clone());
		}
		element.setDefaultExpression(invoc);


```

### UNCHECKED_WARNING
Unchecked assignment: 'fr.inria.spirals.npefix.resi.context.Decision' to 'fr.inria.spirals.npefix.resi.context.Decision'
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/Strat3.java`
#### Snippet
```java
			MethodContext context) {
		List<Decision<T>> output = new ArrayList<>();
		output.add(new Decision(this, location, new PrimitiveInstance(false), boolean.class));
		return output;
	}
```

### UNCHECKED_WARNING
Unchecked call to 'Decision(Strategy, Location, Instance, Class)' as a member of raw type 'fr.inria.spirals.npefix.resi.context.Decision'
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/Strat3.java`
#### Snippet
```java
			MethodContext context) {
		List<Decision<T>> output = new ArrayList<>();
		output.add(new Decision(this, location, new PrimitiveInstance(false), boolean.class));
		return output;
	}
```

### UNCHECKED_WARNING
Unchecked call to 'PrimitiveInstance(T)' as a member of raw type 'fr.inria.spirals.npefix.resi.context.instance.PrimitiveInstance'
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/Strat3.java`
#### Snippet
```java
			MethodContext context) {
		List<Decision<T>> output = new ArrayList<>();
		output.add(new Decision(this, location, new PrimitiveInstance(false), boolean.class));
		return output;
	}
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.HashSet' to 'java.util.Set'
in `src/main/java/utils/sacha/impl/TestRunnerCore.java`
#### Snippet
```java

		Class<?>[] tests = new TestClassFinder(eClassloader).findTestClasses();
		Set<Class> testList = new HashSet();
		for (int i = 0; i < tests.length; i++) {
			String s = tests[i].getCanonicalName();
```

### UNCHECKED_WARNING
Unchecked assignment: 'spoon.reflect.code.CtExpression' to 'spoon.reflect.code.CtExpression'
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/IfSplitter.java`
#### Snippet
```java
        anIf.setParent(ctIf.getParent());
        ctIf.replace(anIf);
        anIf.setCondition(leftHandOperand);
        ctIf.setCondition(rightHandOperand);
        CtStatement wrappedIf = wrapBlock(ctIf);
```

### UNCHECKED_WARNING
Unchecked assignment: 'spoon.reflect.code.CtExpression' to 'spoon.reflect.code.CtExpression'
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/IfSplitter.java`
#### Snippet
```java
        ctIf.replace(anIf);
        anIf.setCondition(leftHandOperand);
        ctIf.setCondition(rightHandOperand);
        CtStatement wrappedIf = wrapBlock(ctIf);
        if(kind.equals(BinaryOperatorKind.AND)) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'spoon.reflect.code.CtInvocation' to 'spoon.reflect.code.CtExpression'
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/VariableFor.java`
#### Snippet
```java

		CtIf encaps = getFactory().Core().createIf();
		encaps.setCondition(ifInvoc);
		encaps.setPosition(element.getPosition());

```

### UNCHECKED_WARNING
Unchecked call to 'PrimitiveInstance(T)' as a member of raw type 'fr.inria.spirals.npefix.resi.context.instance.PrimitiveInstance'
in `src/main/java/fr/inria/spirals/npefix/resi/context/instance/InstanceFactory.java`
#### Snippet
```java

		if (expression == null) {
			instance = new PrimitiveInstance(null);
		} else if (expression instanceof CtLiteral) {
			instance = new PrimitiveInstance(((CtLiteral) expression).getValue());
```

### UNCHECKED_WARNING
Unchecked call to 'PrimitiveInstance(T)' as a member of raw type 'fr.inria.spirals.npefix.resi.context.instance.PrimitiveInstance'
in `src/main/java/fr/inria/spirals/npefix/resi/context/instance/InstanceFactory.java`
#### Snippet
```java
			instance = new PrimitiveInstance(null);
		} else if (expression instanceof CtLiteral) {
			instance = new PrimitiveInstance(((CtLiteral) expression).getValue());
		} else if (expression instanceof CtVariableAccess) {
			CtVariable declaration = ((CtVariableAccess) expression).getVariable().getDeclaration();
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'. Reason: '((CtConstructorCall) expression).getExecutable()' has raw type, so result of getParameters is erased
in `src/main/java/fr/inria/spirals/npefix/resi/context/instance/InstanceFactory.java`
#### Snippet
```java
		} else if (expression instanceof CtConstructorCall) {
			String classname = (expression).getType().getQualifiedName();
			List<CtTypeReference> parameters = ((CtConstructorCall) expression).getExecutable().getParameters();
			List<CtExpression> constructorArguments = ((CtConstructorCall) expression).getArguments();

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'. Reason: '((CtConstructorCall) expression)' has raw type, so result of getArguments is erased
in `src/main/java/fr/inria/spirals/npefix/resi/context/instance/InstanceFactory.java`
#### Snippet
```java
			String classname = (expression).getType().getQualifiedName();
			List<CtTypeReference> parameters = ((CtConstructorCall) expression).getExecutable().getParameters();
			List<CtExpression> constructorArguments = ((CtConstructorCall) expression).getArguments();

			String[] parameterTypes = new String[parameters.size()];
```

### UNCHECKED_WARNING
Unchecked call to 'NewInstance(String, String\[\], List\>)' as a member of raw type 'fr.inria.spirals.npefix.resi.context.instance.NewInstance'
in `src/main/java/fr/inria/spirals/npefix/resi/context/instance/InstanceFactory.java`
#### Snippet
```java
				arguments.add(fromCtExpression(constructorArguments.get(i)));
			}
			instance = new NewInstance(classname, parameterTypes, arguments);
		} else if (expression instanceof CtThisAccess) {
			instance = new VariableInstance(expression.toString());
```

### UNCHECKED_WARNING
Unchecked call to 'PrimitiveInstance(T)' as a member of raw type 'fr.inria.spirals.npefix.resi.context.instance.PrimitiveInstance'
in `src/main/java/fr/inria/spirals/npefix/resi/context/instance/InstanceFactory.java`
#### Snippet
```java
			instance = new VariableInstance(expression.toString());
		} else {
			instance = new PrimitiveInstance(expression.toString());
			System.err.println(expression.getType() + " not handled");
		}
```

### UNCHECKED_WARNING
Unchecked call to 'isAssignableFrom(Class)' as a member of raw type 'java.lang.Class'
in `src/main/java/fr/inria/spirals/npefix/resi/ExceptionStack.java`
#### Snippet
```java
			}
			for (Class clazz : tryContext.getTypes()) {
				if(clazz.isAssignableFrom(c)){
					return true;
				}
```

### UNCHECKED_WARNING
Unchecked call to 'getConstructor(CtTypeReference...)' as a member of raw type 'spoon.reflect.declaration.CtClass'
in `src/main/java/fr/inria/spirals/npefix/patchTemplate/InstanceCreator.java`
#### Snippet
```java
	private List<CtExpression> newInstance(CtClass ctClass) {
		List<CtExpression> output = new ArrayList<>();
		CtConstructor constructor = ctClass.getConstructor();
		if (constructor != null && constructor.hasModifier(ModifierKind.PUBLIC)) {
			output.add(factory.Code().createConstructorCall(ctClass.getReference()));
```

### UNCHECKED_WARNING
Unchecked assignment: 'spoon.reflect.reference.CtTypeReference' to 'spoon.reflect.reference.CtTypeReference'. Reason: 'ctClass' has raw type, so result of getReference is erased
in `src/main/java/fr/inria/spirals/npefix/patchTemplate/InstanceCreator.java`
#### Snippet
```java
		CtConstructor constructor = ctClass.getConstructor();
		if (constructor != null && constructor.hasModifier(ModifierKind.PUBLIC)) {
			output.add(factory.Code().createConstructorCall(ctClass.getReference()));
		} else {
			Set<CtConstructor> constructors = ctClass.getConstructors();
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Set' to 'java.util.Set'. Reason: 'ctClass' has raw type, so result of getConstructors is erased
in `src/main/java/fr/inria/spirals/npefix/patchTemplate/InstanceCreator.java`
#### Snippet
```java
			output.add(factory.Code().createConstructorCall(ctClass.getReference()));
		} else {
			Set<CtConstructor> constructors = ctClass.getConstructors();

			constructorLoop:
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'. Reason: 'ctConstructor' has raw type, so result of getParameters is erased
in `src/main/java/fr/inria/spirals/npefix/patchTemplate/InstanceCreator.java`
#### Snippet
```java
				CtConstructor ctConstructor = iterator.next();

				List<CtParameter> parameters = ctConstructor.getParameters();
				CtExpression[] values = new CtExpression[parameters.size()];

```

### UNCHECKED_WARNING
Unchecked assignment: 'spoon.reflect.reference.CtTypeReference' to 'spoon.reflect.reference.CtTypeReference'. Reason: 'ctClass' has raw type, so result of getReference is erased
in `src/main/java/fr/inria/spirals/npefix/patchTemplate/InstanceCreator.java`
#### Snippet
```java
				}

				output.add(factory.Code().createConstructorCall(ctClass.getReference(), values));
			}
		}
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `src/main/java/fr/inria/spirals/npefix/resi/context/instance/StaticVariableInstance.java`
#### Snippet
```java
			field.setAccessible(true);
			Object o = field.get(null);
			return (T) o;
		} catch (Exception e) {
			throw new VarNotFound("Unable to get the fied of " + clazz);
```

### UNCHECKED_WARNING
Unchecked assignment: 'spoon.reflect.reference.CtLocalVariableReference' to 'spoon.reflect.reference.CtVariableReference'. Reason: 'variable' has raw type, so result of getReference is erased
in `src/main/java/fr/inria/spirals/npefix/patchTemplate/template/SkipLine.java`
#### Snippet
```java

		CtAssignment variableAssignment = factory.Code()
				.createVariableAssignment(variable.getReference(), false,
						variable.getDefaultExpression());

```

### UNCHECKED_WARNING
Unchecked assignment: 'spoon.reflect.code.CtExpression' to 'spoon.reflect.code.CtExpression'. Reason: 'variable' has raw type, so result of getDefaultExpression is erased
in `src/main/java/fr/inria/spirals/npefix/patchTemplate/template/SkipLine.java`
#### Snippet
```java
		CtAssignment variableAssignment = factory.Code()
				.createVariableAssignment(variable.getReference(), false,
						variable.getDefaultExpression());

		variable.setDefaultExpression(null);
```

### UNCHECKED_WARNING
Unchecked call to 'setDefaultExpression(CtExpression)' as a member of raw type 'spoon.reflect.declaration.CtVariable'
in `src/main/java/fr/inria/spirals/npefix/patchTemplate/template/SkipLine.java`
#### Snippet
```java
						variable.getDefaultExpression());

		variable.setDefaultExpression(null);

		statement.insertAfter(variableAssignment);
```

### UNCHECKED_WARNING
Unchecked method 'sort(List)' invocation
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/Strat2.java`
#### Snippet
```java
		List<Decision<T>> output = new ArrayList<>();
		List<Instance<T>> instances = initNotNull(clazz);
		Collections.sort(instances);
		for (int i = 0; i < instances.size(); i++) {
			Instance<T> instance = instances.get(i);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Vector\>'
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/AbstractStrategy.java`
#### Snippet
```java
				Vector<Class<?>> clazzes;
				try {
					clazzes = (Vector<Class<?>>) ClassLoader_classes_field.get(classLoader);
				} catch (IllegalAccessException e1) {
					classes.add(clazz);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Integer' to 'T'
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/AbstractStrategy.java`
#### Snippet
```java
		List<Instance<T>> instances = new ArrayList<>();
		if(clazz == int.class){
			instances.add(new PrimitiveInstance<T>((T) new Integer(0)));
			instances.add(new PrimitiveInstance<T>((T) new Integer(-1)));
			instances.add(new PrimitiveInstance<T>((T) new Integer(1)));
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Integer' to 'T'
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/AbstractStrategy.java`
#### Snippet
```java
		if(clazz == int.class){
			instances.add(new PrimitiveInstance<T>((T) new Integer(0)));
			instances.add(new PrimitiveInstance<T>((T) new Integer(-1)));
			instances.add(new PrimitiveInstance<T>((T) new Integer(1)));
		}
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Integer' to 'T'
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/AbstractStrategy.java`
#### Snippet
```java
			instances.add(new PrimitiveInstance<T>((T) new Integer(0)));
			instances.add(new PrimitiveInstance<T>((T) new Integer(-1)));
			instances.add(new PrimitiveInstance<T>((T) new Integer(1)));
		}
		if(clazz == char.class){
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Character' to 'T'
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/AbstractStrategy.java`
#### Snippet
```java
		}
		if(clazz == char.class){
			instances.add(new PrimitiveInstance<T>((T) new Character(' ')));
		}
		if(clazz == boolean.class){
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Boolean' to 'T'
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/AbstractStrategy.java`
#### Snippet
```java
		}
		if(clazz == boolean.class){
			instances.add(new PrimitiveInstance<T>((T) new Boolean(false)));
			instances.add(new PrimitiveInstance<T>((T) new Boolean(true)));
		}
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Boolean' to 'T'
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/AbstractStrategy.java`
#### Snippet
```java
		if(clazz == boolean.class){
			instances.add(new PrimitiveInstance<T>((T) new Boolean(false)));
			instances.add(new PrimitiveInstance<T>((T) new Boolean(true)));
		}
		if(clazz == float.class){
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Float' to 'T'
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/AbstractStrategy.java`
#### Snippet
```java
		}
		if(clazz == float.class){
			instances.add(new PrimitiveInstance<T>((T) new Float(0)));
			instances.add(new PrimitiveInstance<T>((T) new Float(-1)));
			instances.add(new PrimitiveInstance<T>((T) new Float(1)));
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Float' to 'T'
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/AbstractStrategy.java`
#### Snippet
```java
		if(clazz == float.class){
			instances.add(new PrimitiveInstance<T>((T) new Float(0)));
			instances.add(new PrimitiveInstance<T>((T) new Float(-1)));
			instances.add(new PrimitiveInstance<T>((T) new Float(1)));
		}
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Float' to 'T'
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/AbstractStrategy.java`
#### Snippet
```java
			instances.add(new PrimitiveInstance<T>((T) new Float(0)));
			instances.add(new PrimitiveInstance<T>((T) new Float(-1)));
			instances.add(new PrimitiveInstance<T>((T) new Float(1)));
		}
		if(clazz == double.class){
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Double' to 'T'
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/AbstractStrategy.java`
#### Snippet
```java
		}
		if(clazz == double.class){
			instances.add(new PrimitiveInstance<T>((T) new Double(0)));
			instances.add(new PrimitiveInstance<T>((T) new Double(-1)));
			instances.add(new PrimitiveInstance<T>((T) new Double(1)));
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Double' to 'T'
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/AbstractStrategy.java`
#### Snippet
```java
		if(clazz == double.class){
			instances.add(new PrimitiveInstance<T>((T) new Double(0)));
			instances.add(new PrimitiveInstance<T>((T) new Double(-1)));
			instances.add(new PrimitiveInstance<T>((T) new Double(1)));
		}
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Double' to 'T'
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/AbstractStrategy.java`
#### Snippet
```java
			instances.add(new PrimitiveInstance<T>((T) new Double(0)));
			instances.add(new PrimitiveInstance<T>((T) new Double(-1)));
			instances.add(new PrimitiveInstance<T>((T) new Double(1)));
		}
		if(clazz == long.class){
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Long' to 'T'
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/AbstractStrategy.java`
#### Snippet
```java
		}
		if(clazz == long.class){
			instances.add(new PrimitiveInstance<T>((T) new Long(0)));
			instances.add(new PrimitiveInstance<T>((T) new Long(-1)));
			instances.add(new PrimitiveInstance<T>((T) new Long(1)));
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Long' to 'T'
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/AbstractStrategy.java`
#### Snippet
```java
		if(clazz == long.class){
			instances.add(new PrimitiveInstance<T>((T) new Long(0)));
			instances.add(new PrimitiveInstance<T>((T) new Long(-1)));
			instances.add(new PrimitiveInstance<T>((T) new Long(1)));
		}
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Long' to 'T'
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/AbstractStrategy.java`
#### Snippet
```java
			instances.add(new PrimitiveInstance<T>((T) new Long(0)));
			instances.add(new PrimitiveInstance<T>((T) new Long(-1)));
			instances.add(new PrimitiveInstance<T>((T) new Long(1)));
		}
		if(clazz == byte.class){
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Byte' to 'T'
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/AbstractStrategy.java`
#### Snippet
```java
		}
		if(clazz == byte.class){
			instances.add(new PrimitiveInstance<T>((T) new Byte((byte)0)));
			instances.add(new PrimitiveInstance<T>((T) new Byte((byte)1)));
		}
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Byte' to 'T'
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/AbstractStrategy.java`
#### Snippet
```java
		if(clazz == byte.class){
			instances.add(new PrimitiveInstance<T>((T) new Byte((byte)0)));
			instances.add(new PrimitiveInstance<T>((T) new Byte((byte)1)));
		}
		if(clazz == short.class){
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Short' to 'T'
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/AbstractStrategy.java`
#### Snippet
```java
		}
		if(clazz == short.class){
			instances.add(new PrimitiveInstance<T>((T) new Short((short) 0)));
			instances.add(new PrimitiveInstance<T>((T) new Short((short) -1)));
			instances.add(new PrimitiveInstance<T>((T) new Short((short) 1)));
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Short' to 'T'
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/AbstractStrategy.java`
#### Snippet
```java
		if(clazz == short.class){
			instances.add(new PrimitiveInstance<T>((T) new Short((short) 0)));
			instances.add(new PrimitiveInstance<T>((T) new Short((short) -1)));
			instances.add(new PrimitiveInstance<T>((T) new Short((short) 1)));
		}
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Short' to 'T'
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/AbstractStrategy.java`
#### Snippet
```java
			instances.add(new PrimitiveInstance<T>((T) new Short((short) 0)));
			instances.add(new PrimitiveInstance<T>((T) new Short((short) -1)));
			instances.add(new PrimitiveInstance<T>((T) new Short((short) 1)));
		}
		return instances;
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map\>'
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/AbstractStrategy.java`
#### Snippet
```java
	protected <T> Map<String, Instance<T>> obtain(Class<?> clazz) {
		if(clazz == null || clazz == void.class) {
			return Collections.EMPTY_MAP;
		}

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List\>'
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/AbstractStrategy.java`
#### Snippet
```java
	protected <T> List<Instance<T>>  initNotNull(Class<T> clazz){
		if(clazz == null) {
			return Collections.EMPTY_LIST;
		}
		List<Instance<T>> instances = new ArrayList<>();
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.Collection\>'
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/AbstractStrategy.java`
#### Snippet
```java
				.hasNext(); ) {
			Class aClass = iterator.next();
			instances.addAll(this.<T>getInstancesClass(aClass));
		}
		return instances;
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.lang.Class' to 'java.lang.Class'
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/AbstractStrategy.java`
#### Snippet
```java
				.hasNext(); ) {
			Class aClass = iterator.next();
			instances.addAll(this.<T>getInstancesClass(aClass));
		}
		return instances;
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `workspaceLocation`
in `src/main/java/utils/sacha/impl/AbstractConfigurator.java`
#### Snippet
```java
     * Get the project location for a project in the eclipse metadata.
     * 
     * @param workspaceLocation the location of the workspace
     * @param project the project subdirectory in the metadata
     * @return the full path to the project.
```

### JavadocReference
Cannot resolve symbol `project`
in `src/main/java/utils/sacha/impl/AbstractConfigurator.java`
#### Snippet
```java
     * 
     * @param workspaceLocation the location of the workspace
     * @param project the project subdirectory in the metadata
     * @return the full path to the project.
     * @throws IOException failures to read location file
```

### JavadocReference
Cannot resolve symbol `SafeChunkyOutputStream`
in `src/main/java/utils/org/eclipse/core/internal/localstore/SafeChunkyInputStream.java`
#### Snippet
```java

/**
 * @see SafeChunkyOutputStream
 */

```

## RuleId[id=ManualArrayToCollectionCopy]
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

## RuleId[id=UnnecessarySemicolon]
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

## RuleId[id=DataFlowIssue]
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

## RuleId[id=StringOperationCanBeSimplified]
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

## RuleId[id=RedundantCollectionOperation]
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

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `src/evaluation/java/fr/inria/spirals/npefix/AbstractEvaluation.java`
#### Snippet
```java
                if (isEnd) {
                    // no more decision
                    countError++;
                    continue;
                }
                countError = 0;
                if(output.size() + result.size() > nbIteration) {
                    output.addAll(result.subList(0, (nbIteration - output.size())));
                } else {
                    output.addAll(result);
                }
```

### DuplicatedCode
Duplicated code
in `src/evaluation/java/fr/inria/spirals/npefix/resi/PaperProjects.java`
#### Snippet
```java
        spoon.Launcher spoon = new Launcher();
        spoon.addInputResource(source);
        source = "/tmp/npefix/" + name + "/src";
        spoon.setSourceOutputDirectory(source);
        spoon.addProcessor(new RemoveNullCheckProcessor());
        spoon.getEnvironment().setAutoImports(true);
        spoon.getModelBuilder().setSourceClasspath(depArrayToClassPath(deps).split(File.pathSeparator));
        spoon.run();
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/spirals/npefix/patch/sorter/Tokens.java`
#### Snippet
```java
			int position = positions.get(i);
			for (int j = 0; j < size - 1; j++) {
				int expectedPositionToken = position - size + j;
				if (expectedPositionToken < 0) {
					continue positionLoop;
				}
				String predicate = tokenizer.computeRepresentation(predicates.get(j));
				String expected = tokenizer.computeRepresentation(get(expectedPositionToken));
				if (!expected.equals(predicate)) {
					continue positionLoop;
				}
			}
			int expectedPositionToken = position + 1;
			if (expectedPositionToken >= this.fullSize()) {
				continue positionLoop;
			}
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/spirals/npefix/patch/sorter/Tokens.java`
#### Snippet
```java
				int expectedPositionToken = position - size + j;
				if (expectedPositionToken < 0) {
					continue positionLoop;
				}
				String predicate = tokenizer.computeRepresentation(predicates.get(j));
				String expected = tokenizer.computeRepresentation(get(expectedPositionToken));
				if (!expected.equals(predicate)) {
					continue positionLoop;
				}
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/spirals/npefix/patchTemplate/template/SkipMethodReturn.java`
#### Snippet
```java
		Factory factory = nullExpression.getFactory();

		CtIf anIf = factory.Core().createIf();


		CtBinaryOperator<Boolean> condition = factory.Code().createBinaryOperator(nullExpression.clone(), factory.Code().createLiteral(null), BinaryOperatorKind.EQ);

		anIf.setCondition(condition);

		CtStatement superLine = nullExpression.getParent(new LineFilter());

		CtTypeMember method = nullExpression.getParent(CtTypeMember.class);
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/spirals/npefix/resi/context/instance/NewArrayInstance.java`
#### Snippet
```java
			for (int i = 0; i < values.size(); i++) {
				Instance<?> instance = values.get(i);
				stringBuilder.append(instance.toString());
				if (i + 1 < values.size()) {
					stringBuilder.append(", ");
				}
			}
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/spirals/npefix/resi/selector/ExplorerSelector.java`
#### Snippet
```java
		for (int i = 0; i < decisions.size(); i++) {
			Decision decision = decisions.get(i);
			if(!this.decisions.containsKey(decision.getLocation())) {
				this.decisions.put(decision.getLocation(), new HashSet<Decision>());
			}
			if(!this.decisions.get(decision.getLocation()).contains(decision)) {
				this.decisions.get(decision.getLocation()).add(decision);
			}
		}
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/spirals/npefix/resi/selector/ExplorerSelector.java`
#### Snippet
```java
		HashSet<Decision> decisions = new HashSet<>();
		Collection<Set<Decision>> values = this.decisions.values();
		for (Iterator<Set<Decision>> iterator = values.iterator(); iterator
				.hasNext(); ) {
			Set<Decision> decisionSet = iterator.next();
			decisions.addAll(decisionSet);
		}
		return decisions;
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/Strat2.java`
#### Snippet
```java
		for (int i = 0; i < instances.size(); i++) {
			Instance<T> instance = instances.get(i);
			Decision<T> decision = new Decision<>(this, location, instance, clazz);
			output.add(decision);
		}
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/RemoveNPECheckProcessor.java`
#### Snippet
```java
            for (int i = 0; i < statements.size(); i++) {
                CtStatement ctStatement = statements.get(i);
                if((ctStatement instanceof CtReturn ||
                        ctStatement instanceof CtContinue ||
                        ctStatement instanceof CtBreak ||
                        ctStatement instanceof CtThrow)
                        && !isLastStatementOfMethod(ctStatement)) {
                    CtIf anIf = getFactory().Core().createIf();
                    anIf.setCondition(getFactory().Code().<Boolean>createCodeSnippetExpression("true"));
                    anIf.setThenStatement(ctStatement);
                    ctStatement.setParent(anIf);
                    ctStatement = anIf;
                }
                ctTry.insertBefore(ctStatement);
                ctStatement.setParent(parent);
            }
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/RemoveNullCheckProcessor.java`
#### Snippet
```java
            if((body instanceof CtReturn ||
                    body instanceof CtContinue ||
                    body instanceof CtBreak ||
                    body instanceof CtThrow)
                    && !isLastStatementOfMethod(body)) {
                CtIf anIf = getFactory().Core().createIf();
                anIf.setCondition(getFactory().Code().<Boolean>createCodeSnippetExpression("true"));
                anIf.setThenStatement(body);
                body.setParent(anIf);
                body = anIf;
            }
            ctIf.insertBefore(body);
            body.setParent(parent);
```

### DuplicatedCode
Duplicated code
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/RemoveNPECheckProcessor.java`
#### Snippet
```java
        CtElement statementParent = statement.getParent();
        if (!(statementParent instanceof CtStatementList)) {
            return isLastStatementOfMethod((CtStatement) statementParent);
        }
        CtStatementList block = (CtStatementList) statementParent;
        if (isLastStatementOf(block, statement)) {
            CtElement blockParent = block.getParent();
            if (blockParent instanceof CtStatement) {
                return isLastStatementOfMethod((CtStatement) blockParent);
            } else {
                return blockParent instanceof CtMethod;
            }
        }
        return false;
```

### DuplicatedCode
Duplicated code
in `src/main/java/utils/sacha/classloader/enrich/EnrichableClassloader.java`
#### Snippet
```java
						FileInputStream reader = new FileInputStream(file);
						Element cpElement;
						try {
							DocumentBuilder parser = DocumentBuilderFactory.newInstance().newDocumentBuilder();
							cpElement = parser.parse(new InputSource(reader)).getDocumentElement();
						} catch (SAXException e) {
							throw new IOException("bad format"); 
						} catch (ParserConfigurationException e) {
							throw new IOException("bad format"); 
						} finally {
							reader.close();
						}
					
						if (!cpElement.getNodeName().equalsIgnoreCase("classpath")) {
							throw new IOException("bad format"); 
						}
						NodeList list = cpElement.getElementsByTagName("classpathentry");
						int length = list.getLength();
						Node node;
```

### DuplicatedCode
Duplicated code
in `src/main/java/utils/sacha/project/utils/MavenModulesMerger.java`
#### Snippet
```java
				FileInputStream meReader = new FileInputStream(meClasspath);
				Element meElement;
				try {
					DocumentBuilder parser = DocumentBuilderFactory.newInstance().newDocumentBuilder();
					meElement = parser.parse(new InputSource(meReader)).getDocumentElement();
				} finally {
					meReader.close();
				}
				NodeList list1 = meElement.getElementsByTagName("classpathentry");
				int length1 = list1.getLength();
				Node node1;
```

## RuleId[id=CatchMayIgnoreException]
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

## RuleId[id=ProtectedMemberInFinalClass]
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

## RuleId[id=ThreadRun]
### ThreadRun
Calls to `run()` should probably be replaced with 'start()'
in `src/main/java/fr/inria/spirals/npefix/main/DecisionServer.java`
#### Snippet
```java

		});
		thread.run();
	}

```

## RuleId[id=CollectionAddAllCanBeReplacedWithConstructor]
### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `src/main/java/fr/inria/spirals/npefix/resi/selector/ExplorerSelector.java`
#### Snippet
```java

			List<Decision> otherDecision = new ArrayList<>();
			otherDecision.addAll(stackDecision.get(currentTestKey));

			for (Decision decision : decisions) {
```

### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `src/main/java/fr/inria/spirals/npefix/resi/selector/ExplorerSelector.java`
#### Snippet
```java

		List<Decision> otherDecision = new ArrayList<>();
		otherDecision.addAll(stackDecision.get(currentTestKey));

		Set<Decision> decisions = this.decisions.get(lastDecision.getLocation());
```

## RuleId[id=UnnecessaryToStringCall]
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

## RuleId[id=SuspiciousMethodCalls]
### SuspiciousMethodCalls
Suspicious call to 'Map.get()'
in `src/main/java/fr/inria/spirals/npefix/main/spoon/MainSpoon.java`
#### Snippet
```java
				    selection = JOptionPane.showInputDialog(null, "Which project?", "spoon", 
				    		JOptionPane.QUESTION_MESSAGE, null, selectionValues, "test");
				    arg=targets.get(selection);
				}
			} finally {
```

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

## RuleId[id=InnerClassMayBeStatic]
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

## RuleId[id=WrongPackageStatement]
### WrongPackageStatement
Package name 'fr.inria.spirals.npefix.resi.selector' does not correspond to the file path 'fr.inria.spirals.npefix'
in `src/evaluation/java/fr/inria/spirals/npefix/SafeMonoEvaluation.java`
#### Snippet
```java
package fr.inria.spirals.npefix.resi.selector;

import org.junit.Before;
```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `src/main/java/fr/inria/spirals/npefix/resi/selector/DomSelector.java`
#### Snippet
```java
	public boolean restartTest(Lapse lapse) {
		super.restartTest(lapse);
		if(currentIndex < decisions.size() - 1) {
			return true;
		}
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/fr/inria/spirals/npefix/resi/context/instance/VariableInstance.java`
#### Snippet
```java
		VariableInstance<?> that = (VariableInstance<?>) o;

		if (variableName != null ?
				!variableName.equals(that.variableName) :
				that.variableName != null)
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/fr/inria/spirals/npefix/resi/context/instance/NewInstance.java`
#### Snippet
```java
		if (!Arrays.equals(parameterType, that.parameterType))
			return false;
		if (parameters != null ?
				!parameters.equals(that.parameters) :
				that.parameters != null)
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/fr/inria/spirals/npefix/resi/context/instance/NewArrayInstance.java`
#### Snippet
```java
			}
		}
		if (level != that.level) {
			return false;
		}
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/ProcessorUtility.java`
#### Snippet
```java
                ((CtFieldAccess) element).getVariable().isStatic())
            return true;
        if (element instanceof CtInvocation<?> &&
                ((CtInvocation) element).getExecutable().isStatic())
            return true;
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/ProcessorUtility.java`
#### Snippet
```java
                ((CtFieldAccess) element).getVariable().isFinal())
            return true;
        if (element instanceof CtInvocation<?> &&
                ((CtInvocation) element).getExecutable().isStatic())
            return true;
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/fr/inria/spirals/npefix/resi/context/Decision.java`
#### Snippet
```java
			return false;

		if (value != null ?
				!value.equals(decision.value) :
				decision.value != null)
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/fr/inria/spirals/npefix/resi/context/Location.java`
#### Snippet
```java
		if (sourceEnd != location.sourceEnd)
			return false;
		if (className != null ?
				!className.equals(location.className) :
				location.className != null)
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/RemoveNullCheckProcessor.java`
#### Snippet
```java
                    return true;
                }
                if(operator.getRightHandOperand().toString().equals("null")) {
                    return true;
                }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/VarRetrieveAssign.java`
#### Snippet
```java
			return false;
		}
		if(element.getParent(CtLambda.class) != null) {
			return false;
		}
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/VarRetrieveInit.java`
#### Snippet
```java
			return false;
		}
		if (defaultExpression.toString().contains("CallChecker.init")) {
			return false;
		}
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/RemoveNPECheckProcessor.java`
#### Snippet
```java
    @Override
    public boolean isToBeProcessed(CtCatch candidate) {
        if(candidate.getParameter().getReference().getType().getQualifiedName().equals(NullPointerException.class.getCanonicalName())) {
            return true;
        }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/VariableFor.java`
#### Snippet
```java
			return false;
		}
		if (element.getMetadata("notnull") != null) {
			return false;
		}
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/fr/inria/spirals/npefix/resi/context/instance/StaticVariableInstance.java`
#### Snippet
```java
		if (clazz != null ? !clazz.equals(that.clazz) : that.clazz != null)
			return false;
		if (fieldName != null ?
				!fieldName.equals(that.fieldName) :
				that.fieldName != null)
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/fr/inria/spirals/npefix/resi/context/instance/PrimitiveInstance.java`
#### Snippet
```java
		PrimitiveInstance<?> that = (PrimitiveInstance<?>) o;

		if (value != null ? !value.equals(that.value) : that.value != null)
			return false;

```

## RuleId[id=ImplicitArrayToString]
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

## RuleId[id=ComparatorMethodParameterNotUsed]
### ComparatorMethodParameterNotUsed
Comparator never returns positive values
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

## RuleId[id=RedundantCast]
### RedundantCast
Casting `parent` to `CtStatement` is redundant
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/AddImplicitCastChecker.java`
#### Snippet
```java
		nbImplicitCast++;

		CtStatement output = (CtStatement) parent;
		CtLiteral<Integer> lineNumber = getFactory().Code().createLiteral(element.getPosition().getLine());
		CtLiteral<Integer> sourceStart = getFactory().Code().createLiteral(element.getPosition().getSourceStart());
```

### RedundantCast
Casting `element` to `CtExpression` is redundant
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/AddImplicitCastChecker.java`
#### Snippet
```java
		invocation.setType(parentType);

		((CtExpression)element).replace(invocation);

		if(parent instanceof CtLocalVariable) {
```

### RedundantCast
Casting `null` to `char[][]` is redundant
in `src/main/java/fr/inria/spirals/npefix/patch/sorter/StringTokenIterator.java`
#### Snippet
```java
		fText = f;
		long complianceLevelValue = CompilerOptions.versionToJdkLevel("1.8");
		scanner = new PublicScanner(false, false, false, 3145728L, complianceLevelValue, (char[][])null, (char[][])null, true, false, false);
		scanner.setSource(fText.toCharArray());
		ngrams = n;
```

### RedundantCast
Casting `null` to `char[][]` is redundant
in `src/main/java/fr/inria/spirals/npefix/patch/sorter/StringTokenIterator.java`
#### Snippet
```java
		fText = f;
		long complianceLevelValue = CompilerOptions.versionToJdkLevel("1.8");
		scanner = new PublicScanner(false, false, false, 3145728L, complianceLevelValue, (char[][])null, (char[][])null, true, false, false);
		scanner.setSource(fText.toCharArray());
		ngrams = n;
```

### RedundantCast
Casting `element` to `CtBinaryOperator` is redundant
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/CheckNotNull.java`
#### Snippet
```java
			return false;
		}
		BinaryOperatorKind kind = ((CtBinaryOperator) element).getKind();
		if (kind.equals(BinaryOperatorKind.EQ) || kind.equals(BinaryOperatorKind.NE)) {
			return ("null".equals(((CtBinaryOperator) element).getLeftHandOperand().toString())
```

### RedundantCast
Casting `parent` to `CtStatement` is redundant
in `src/main/java/fr/inria/spirals/npefix/transformer/processors/VariableFor.java`
#### Snippet
```java
		CtBlock thenBloc = getFactory().Core().createBlock();

		((CtStatement) parent).replace(encaps);
		encaps.setThenStatement(thenBloc);
		thenBloc.addStatement((CtStatement) parent);
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@param decisions` tag description is missing
in `src/main/java/fr/inria/spirals/npefix/resi/selector/RandomSelector.java`
#### Snippet
```java
	 * Select randomly a strategy
	 * @return a strategy
	 * @param decisions
	 */
	@Override
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/fr/inria/spirals/npefix/main/patch/SortPatch.java`
#### Snippet
```java

	/**
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
```

### JavadocDeclaration
`@param className` tag description is missing
in `src/main/java/fr/inria/spirals/npefix/patch/generator/PatchesGenerator.java`
#### Snippet
```java
	/**
	 * Get the CtType from the full qualified name of a class
	 * @param className
	 * @return
	 */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/fr/inria/spirals/npefix/patch/generator/PatchesGenerator.java`
#### Snippet
```java
	 * Get the CtType from the full qualified name of a class
	 * @param className
	 * @return
	 */
	private CtType getCtType(String className) {
```

### JavadocDeclaration
`@param file` tag description is missing
in `src/main/java/fr/inria/spirals/npefix/patch/generator/PatchesGenerator.java`
#### Snippet
```java
	/**
	 * Get the content of the file
	 * @param file
	 * @return
	 */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/fr/inria/spirals/npefix/patch/generator/PatchesGenerator.java`
#### Snippet
```java
	 * Get the content of the file
	 * @param file
	 * @return
	 */
	private String getFileContent(File file) {
```

### JavadocDeclaration
`@param exception` tag description is missing
in `src/main/java/fr/inria/spirals/npefix/resi/oracle/AbstractOracle.java`
#### Snippet
```java
	/**
	 * Print the stack trace of an exception
	 * @param exception
	 * @return
	 */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/fr/inria/spirals/npefix/resi/oracle/AbstractOracle.java`
#### Snippet
```java
	 * Print the stack trace of an exception
	 * @param exception
	 * @return
	 */
	protected String printException(Throwable exception) {
```

### JavadocDeclaration
IOException is not declared to be thrown by method getProjectLocation
in `src/main/java/utils/sacha/impl/AbstractConfigurator.java`
#### Snippet
```java
     * @param project the project subdirectory in the metadata
     * @return the full path to the project.
     * @throws IOException failures to read location file
     * @throws URISyntaxException failures to read location file
     */
```

### JavadocDeclaration
URISyntaxException is not declared to be thrown by method getProjectLocation
in `src/main/java/utils/sacha/impl/AbstractConfigurator.java`
#### Snippet
```java
     * @return the full path to the project.
     * @throws IOException failures to read location file
     * @throws URISyntaxException failures to read location file
     */
	@SuppressWarnings("resource")
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/fr/inria/spirals/npefix/main/ExecutionClient.java`
#### Snippet
```java
	/**
	 * Get the selector instantiated in the RMI server.
	 * @return
	 */
	private Selector getSelector() {
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/fr/inria/spirals/npefix/main/all/Launcher.java`
#### Snippet
```java
    /**
     * Get all classes without tests
     * @return
     */
    private Set<CtType<?>> getAllClasses() {
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `decisions` may be 'final'
in `src/main/java/fr/inria/spirals/npefix/resi/selector/RandomSelector.java`
#### Snippet
```java
public class RandomSelector extends AbstractSelector {

	private Set<Decision> decisions = new HashSet<>();

	@Override
```

### FieldMayBeFinal
Field `decisions` may be 'final'
in `src/main/java/fr/inria/spirals/npefix/resi/selector/DomSelector.java`
#### Snippet
```java
	public static Strategy strategy = new NoStrat();
	public int currentIndex = 0;
	private Set<Decision> decisions = new HashSet<>();

	@Override
```

### FieldMayBeFinal
Field `variableName` may be 'final'
in `src/main/java/fr/inria/spirals/npefix/resi/context/instance/VariableInstance.java`
#### Snippet
```java
public class  VariableInstance<T> extends AbstractInstance<T> {

	private String variableName;
	public VariableInstance(String variableName) {
		this.variableName = variableName;
```

### FieldMayBeFinal
Field `urlClassloader` may be 'final'
in `src/main/java/utils/sacha/finder/main/TestClassFinder.java`
#### Snippet
```java
public class TestClassFinder{
	
	private EnrichableClassloader urlClassloader;

	public TestClassFinder(EnrichableClassloader classloader) {
```

### FieldMayBeFinal
Field `newInstance` may be 'final'
in `src/main/java/fr/inria/spirals/npefix/patchTemplate/template/SkipMethodReturn.java`
#### Snippet
```java
public class SkipMethodReturn implements PatchTemplate {

	private CtExpression newInstance;

	public SkipMethodReturn(CtExpression newInstance){
```

### FieldMayBeFinal
Field `usedDecisions` may be 'final'
in `src/main/java/fr/inria/spirals/npefix/resi/selector/MonoExplorerSelector.java`
#### Snippet
```java
public class MonoExplorerSelector extends AbstractSelector {

	private Map<String, Set<Decision>> usedDecisions = new HashMap<>();
	private Map<Location, Set<Decision>> decisions = new HashMap<>();
	private String currentTestKey;
```

### FieldMayBeFinal
Field `decisions` may be 'final'
in `src/main/java/fr/inria/spirals/npefix/resi/selector/MonoExplorerSelector.java`
#### Snippet
```java

	private Map<String, Set<Decision>> usedDecisions = new HashMap<>();
	private Map<Location, Set<Decision>> decisions = new HashMap<>();
	private String currentTestKey;

```

### FieldMayBeFinal
Field `inputSources` may be 'final'
in `src/main/java/fr/inria/spirals/npefix/main/all/DefaultRepairStrategy.java`
#### Snippet
```java
public class DefaultRepairStrategy implements RepairStrategy {

	private String[] inputSources;
	protected List<AbstractProcessor> processors;

```

### FieldMayBeFinal
Field `host` may be 'final'
in `src/main/java/fr/inria/spirals/npefix/main/DecisionServer.java`
#### Snippet
```java
	private Selector selector;
	private int port = Config.CONFIG.getServerPort();
	private String host = Config.CONFIG.getServerHost();

	public DecisionServer(Selector selector) {
```

### FieldMayBeFinal
Field `selector` may be 'final'
in `src/main/java/fr/inria/spirals/npefix/main/DecisionServer.java`
#### Snippet
```java
	}

	private Selector selector;
	private int port = Config.CONFIG.getServerPort();
	private String host = Config.CONFIG.getServerHost();
```

### FieldMayBeFinal
Field `port` may be 'final'
in `src/main/java/fr/inria/spirals/npefix/main/DecisionServer.java`
#### Snippet
```java

	private Selector selector;
	private int port = Config.CONFIG.getServerPort();
	private String host = Config.CONFIG.getServerHost();

```

### FieldMayBeFinal
Field `strategies` may be 'final'
in `src/main/java/fr/inria/spirals/npefix/resi/selector/ExplorerSelector.java`
#### Snippet
```java
	private Map<String, Stack<Decision>> stackDecision  = new HashMap<>();
	private String currentTestKey;
	private List<Strategy> strategies;

	public ExplorerSelector() {
```

### FieldMayBeFinal
Field `newExpression` may be 'final'
in `src/main/java/fr/inria/spirals/npefix/patchTemplate/template/ReplaceGlobal.java`
#### Snippet
```java
public class ReplaceGlobal implements PatchTemplate {

	private CtExpression newExpression;

	public ReplaceGlobal(CtExpression newExpression) {
```

### FieldMayBeFinal
Field `properties` may be 'final'
in `src/main/java/fr/inria/spirals/npefix/config/Config.java`
#### Snippet
```java
	private int nbIteration;
	private int timeoutIteration;
	private Properties properties = new Properties();
	private String workingDirectory;
	private String m2Repository;
```

### FieldMayBeFinal
Field `workingDirectory` may be 'final'
in `src/main/java/fr/inria/spirals/npefix/main/run/Main.java`
#### Snippet
```java

	private List<String> sources = new ArrayList<>();
	private String workingDirectory = ".";
	private String classpath = "";
	private int complianceLevel = 7;
```

### FieldMayBeFinal
Field `jsap` may be 'final'
in `src/main/java/fr/inria/spirals/npefix/main/run/Main.java`
#### Snippet
```java
public class Main {

	private JSAP jsap = new JSAP();

	private List<String> sources = new ArrayList<>();
```

### FieldMayBeFinal
Field `sources` may be 'final'
in `src/main/java/fr/inria/spirals/npefix/main/run/Main.java`
#### Snippet
```java
	private JSAP jsap = new JSAP();

	private List<String> sources = new ArrayList<>();
	private String workingDirectory = ".";
	private String classpath = "";
```

### FieldMayBeFinal
Field `jsap` may be 'final'
in `src/evaluation/java/fr/inria/spirals/npefix/main/MainEvaluation.java`
#### Snippet
```java
	private static final String TEST_TIMEOUT = "testTimeout";
	private static final String NPEDATASET = "npedataset";
	private static JSAP jsap = new JSAP();

	public static void main(String[] args) {
```

### FieldMayBeFinal
Field `runnedTests` may be 'final'
in `src/main/java/utils/sacha/runner/main/TestRunnerMain.java`
#### Snippet
```java

	public static String eclipseTestReport = null;
	private static TestInfo runnedTests = new TestInfo();
	private static TestInfo importedTests = new TestInfo();

```

### FieldMayBeFinal
Field `errors` may be 'final'
in `src/main/java/utils/sacha/runner/main/TestRunnerMain.java`
#### Snippet
```java
	private static class MyTextListener extends RunListener{
		private final PrintStream fWriter;
		private int errors=0;
		private int failures=0;
		
```

### FieldMayBeFinal
Field `failures` may be 'final'
in `src/main/java/utils/sacha/runner/main/TestRunnerMain.java`
#### Snippet
```java
		private final PrintStream fWriter;
		private int errors=0;
		private int failures=0;
		
		public MyTextListener(PrintStream writer) {
```

### FieldMayBeFinal
Field `importedTests` may be 'final'
in `src/main/java/utils/sacha/runner/main/TestRunnerMain.java`
#### Snippet
```java
	public static String eclipseTestReport = null;
	private static TestInfo runnedTests = new TestInfo();
	private static TestInfo importedTests = new TestInfo();

	public static void main(String[] args) {
```

### FieldMayBeFinal
Field `parameters` may be 'final'
in `src/main/java/fr/inria/spirals/npefix/resi/context/instance/NewInstance.java`
#### Snippet
```java
	private final String clazz;
	private String[] parameterType;
	private List<Instance<?>> parameters;

	public NewInstance(String clazz, String[] parameterType,
```

### FieldMayBeFinal
Field `parameterType` may be 'final'
in `src/main/java/fr/inria/spirals/npefix/resi/context/instance/NewInstance.java`
#### Snippet
```java

	private final String clazz;
	private String[] parameterType;
	private List<Instance<?>> parameters;

```

### FieldMayBeFinal
Field `expression` may be 'final'
in `src/main/java/fr/inria/spirals/npefix/patchTemplate/ThisFinder.java`
#### Snippet
```java

	private final boolean isStaticContext;
	private CtElement expression;

	public ThisFinder(CtElement expression) {
```

### FieldMayBeFinal
Field `counts` may be 'final'
in `src/main/java/fr/inria/spirals/npefix/resi/selector/GreedySelector.java`
#### Snippet
```java

	private double epsilon;
	private Map<Decision<?>, Integer> counts = new HashMap<>();
	private Map<Decision<?>, Double> values = new HashMap<>();
	private Set<Decision<?>> usedDecisions = new HashSet<>();
```

### FieldMayBeFinal
Field `epsilon` may be 'final'
in `src/main/java/fr/inria/spirals/npefix/resi/selector/GreedySelector.java`
#### Snippet
```java
public class GreedySelector extends AbstractSelector {

	private double epsilon;
	private Map<Decision<?>, Integer> counts = new HashMap<>();
	private Map<Decision<?>, Double> values = new HashMap<>();
```

### FieldMayBeFinal
Field `values` may be 'final'
in `src/main/java/fr/inria/spirals/npefix/resi/selector/GreedySelector.java`
#### Snippet
```java
	private double epsilon;
	private Map<Decision<?>, Integer> counts = new HashMap<>();
	private Map<Decision<?>, Double> values = new HashMap<>();
	private Set<Decision<?>> usedDecisions = new HashSet<>();
	private List<Decision<?>> unusedDecisions  = new ArrayList<>();
```

### FieldMayBeFinal
Field `unusedDecisions` may be 'final'
in `src/main/java/fr/inria/spirals/npefix/resi/selector/GreedySelector.java`
#### Snippet
```java
	private Map<Decision<?>, Double> values = new HashMap<>();
	private Set<Decision<?>> usedDecisions = new HashSet<>();
	private List<Decision<?>> unusedDecisions  = new ArrayList<>();

	public GreedySelector() {
```

### FieldMayBeFinal
Field `usedDecisions` may be 'final'
in `src/main/java/fr/inria/spirals/npefix/resi/selector/GreedySelector.java`
#### Snippet
```java
	private Map<Decision<?>, Integer> counts = new HashMap<>();
	private Map<Decision<?>, Double> values = new HashMap<>();
	private Set<Decision<?>> usedDecisions = new HashSet<>();
	private List<Decision<?>> unusedDecisions  = new ArrayList<>();

```

### FieldMayBeFinal
Field `content` may be 'final'
in `src/main/java/fr/inria/spirals/npefix/patch/generator/Writer.java`
#### Snippet
```java

public class Writer {
	private StringBuilder content = new StringBuilder();
	String currentIndentation = "";
	private final String indentation;
```

### FieldMayBeFinal
Field `tokens` may be 'final'
in `src/main/java/fr/inria/spirals/npefix/patch/sorter/Tokens.java`
#### Snippet
```java
public class Tokens implements List<Token>{

	private List<Token> tokens = new ArrayList<>();
	private Map<String, List<Integer>> tokensPosition = new HashMap<>();
	private Tokenizer tokenizer;
```

### FieldMayBeFinal
Field `tokenizer` may be 'final'
in `src/main/java/fr/inria/spirals/npefix/patch/sorter/Tokens.java`
#### Snippet
```java
	private List<Token> tokens = new ArrayList<>();
	private Map<String, List<Integer>> tokensPosition = new HashMap<>();
	private Tokenizer tokenizer;

	public Tokens(Tokenizer tokenizer) {
```

### FieldMayBeFinal
Field `tokensPosition` may be 'final'
in `src/main/java/fr/inria/spirals/npefix/patch/sorter/Tokens.java`
#### Snippet
```java

	private List<Token> tokens = new ArrayList<>();
	private Map<String, List<Integer>> tokensPosition = new HashMap<>();
	private Tokenizer tokenizer;

```

### FieldMayBeFinal
Field `values` may be 'final'
in `src/main/java/fr/inria/spirals/npefix/resi/context/instance/NewArrayInstance.java`
#### Snippet
```java
	private final String clazz;
	private final int level;
	private List<Instance<?>> values;

	public NewArrayInstance(String clazz, List<Instance<?>> values) {
```

### FieldMayBeFinal
Field `urlClassloader` may be 'final'
in `src/main/java/utils/sacha/finder/main/TestInURLClassloader.java`
#### Snippet
```java
public class TestInURLClassloader{
	
	private URLClassLoader urlClassloader;

	public TestInURLClassloader(URLClassLoader classloader) {
```

### FieldMayBeFinal
Field `srcFolder` may be 'final'
in `src/main/java/utils/sacha/finder/classes/impl/SourceFolderFinder.java`
#### Snippet
```java
public class SourceFolderFinder implements ClassFinder {

	private String srcFolder;
	
	public SourceFolderFinder(String srcFolder) {
```

### FieldMayBeFinal
Field `positions` may be 'final'
in `src/evaluation/java/fr/inria/spirals/npefix/resi/NPEFixTemplateEvaluation.java`
#### Snippet
```java
public class NPEFixTemplateEvaluation extends AbstractNPEDataset {

    private Map<String, NpePosition> positions = new HashMap<>();

    public NPEFixTemplateEvaluation() {
```

### FieldMayBeFinal
Field `start` may be 'final'
in `src/evaluation/java/fr/inria/spirals/npefix/resi/NPEFixTemplateEvaluation.java`
#### Snippet
```java
    private class NpePosition {
        private String classname;
        private int start;
        private int end;

```

### FieldMayBeFinal
Field `classname` may be 'final'
in `src/evaluation/java/fr/inria/spirals/npefix/resi/NPEFixTemplateEvaluation.java`
#### Snippet
```java

    private class NpePosition {
        private String classname;
        private int start;
        private int end;
```

### FieldMayBeFinal
Field `end` may be 'final'
in `src/evaluation/java/fr/inria/spirals/npefix/resi/NPEFixTemplateEvaluation.java`
#### Snippet
```java
        private String classname;
        private int start;
        private int end;

        public NpePosition(String classname, int start, int end) {
```

### FieldMayBeFinal
Field `index` may be 'final'
in `src/main/java/fr/inria/spirals/npefix/resi/context/instance/ArrayReadInstance.java`
#### Snippet
```java

	private String variableName;
	private int index;

	public ArrayReadInstance(String variableName, int index) {
```

### FieldMayBeFinal
Field `variableName` may be 'final'
in `src/main/java/fr/inria/spirals/npefix/resi/context/instance/ArrayReadInstance.java`
#### Snippet
```java
public class ArrayReadInstance<T> extends AbstractInstance<T> {

	private String variableName;
	private int index;

```

### FieldMayBeFinal
Field `inputSources` may be 'final'
in `src/main/java/fr/inria/spirals/npefix/patch/generator/PatchesGenerator.java`
#### Snippet
```java
	private List<Decision> decisions;
	private Launcher spoon;
	private String[] inputSources;

	public PatchesGenerator(List<Decision> decisions, Launcher spoon, String[] inputSources) {
```

### FieldMayBeFinal
Field `decisions` may be 'final'
in `src/main/java/fr/inria/spirals/npefix/patch/generator/PatchesGenerator.java`
#### Snippet
```java

public class PatchesGenerator {
	private List<Decision> decisions;
	private Launcher spoon;
	private String[] inputSources;
```

### FieldMayBeFinal
Field `spoon` may be 'final'
in `src/main/java/fr/inria/spirals/npefix/patch/generator/PatchesGenerator.java`
#### Snippet
```java
public class PatchesGenerator {
	private List<Decision> decisions;
	private Launcher spoon;
	private String[] inputSources;

```

### FieldMayBeFinal
Field `newExpression` may be 'final'
in `src/main/java/fr/inria/spirals/npefix/patchTemplate/template/ReplaceLocal.java`
#### Snippet
```java
public class ReplaceLocal implements PatchTemplate {

	private CtExpression newExpression;

	public ReplaceLocal(CtExpression newExpression) {
```

### FieldMayBeFinal
Field `expression` may be 'final'
in `src/main/java/fr/inria/spirals/npefix/patchTemplate/VariableFinder.java`
#### Snippet
```java
public class VariableFinder {

	private CtElement expression;
	private boolean isStaticContext;

```

### FieldMayBeFinal
Field `returnType` may be 'final'
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/Strat4.java`
#### Snippet
```java
public class Strat4 extends AbstractStrategy {

	private ReturnType returnType;

	public Strat4(ReturnType returnType) {
```

### FieldMayBeFinal
Field `d` may be 'final'
in `src/main/java/fr/inria/spirals/npefix/patch/sorter/algorithm/KneserNey.java`
#### Snippet
```java
public class KneserNey extends Algorithm {
	private final Set<Tokens> allBiGram;
	private double d = 0.1;

	public KneserNey(Token token, Tokens predicate, Tokens corpus) {
```

### FieldMayBeFinal
Field `urlClassloader` may be 'final'
in `src/main/java/utils/sacha/finder/classes/impl/ProjectFinder.java`
#### Snippet
```java
public class ProjectFinder implements ClassFinder {

	private EnrichableClassloader urlClassloader;
	public ProjectFinder(EnrichableClassloader urlClassloader) {
		this.urlClassloader = urlClassloader;
```

### FieldMayBeFinal
Field `context` may be 'final'
in `src/main/java/fr/inria/spirals/npefix/resi/context/TryContext.java`
#### Snippet
```java
	private int id = -1;
	private Class<?>[] types;
	private Class<?> context;

	public TryContext(int id, Class<?> context, String... types) {
```

### FieldMayBeFinal
Field `types` may be 'final'
in `src/main/java/fr/inria/spirals/npefix/resi/context/TryContext.java`
#### Snippet
```java

	private int id = -1;
	private Class<?>[] types;
	private Class<?> context;

```

### FieldMayBeFinal
Field `nbApplication` may be 'final'
in `src/main/java/fr/inria/spirals/npefix/resi/context/Lapse.java`
#### Snippet
```java
	private final int uniqueId;
	private Set<Location> locations;
	private Map<Decision, Integer> nbApplication;
	private Map<Decision, Integer> currentIndex;
	private Oracle oracle;
```

### FieldMayBeFinal
Field `inputSources` may be 'final'
in `src/main/java/fr/inria/spirals/npefix/resi/context/Lapse.java`
#### Snippet
```java
	private Date endDate;
	private boolean isFinished = false;
	private String[] inputSources;

	public Lapse(Selector strategySelector, String[] inputSources) {
```

### FieldMayBeFinal
Field `metadata` may be 'final'
in `src/main/java/fr/inria/spirals/npefix/resi/context/Lapse.java`
#### Snippet
```java
	private String testName;
	private List<Decision> decisions = null;
	private Map<String, Object> metadata = new HashMap<>();
	private Date startDate;
	private Date endDate;
```

### FieldMayBeFinal
Field `startDate` may be 'final'
in `src/main/java/fr/inria/spirals/npefix/resi/context/Lapse.java`
#### Snippet
```java
	private List<Decision> decisions = null;
	private Map<String, Object> metadata = new HashMap<>();
	private Date startDate;
	private Date endDate;
	private boolean isFinished = false;
```

### FieldMayBeFinal
Field `locations` may be 'final'
in `src/main/java/fr/inria/spirals/npefix/resi/context/Lapse.java`
#### Snippet
```java
	private final Selector strategySelector;
	private final int uniqueId;
	private Set<Location> locations;
	private Map<Decision, Integer> nbApplication;
	private Map<Decision, Integer> currentIndex;
```

### FieldMayBeFinal
Field `decision` may be 'final'
in `src/main/java/fr/inria/spirals/npefix/resi/exception/ForceReturn.java`
#### Snippet
```java

public class ForceReturn extends RuntimeException {
	private Decision decision;

	public ForceReturn(Decision decision) {
```

### FieldMayBeFinal
Field `runnedTests` may be 'final'
in `src/main/java/utils/sacha/runner/main/TestRunner.java`
#### Snippet
```java
	}

	private TestInfo runnedTests = new TestInfo();

	public ITestResult run(Class<?>[] classesArray) {
```

### FieldMayBeFinal
Field `classTestName` may be 'final'
in `src/main/java/fr/inria/spirals/npefix/main/ExecutionClient.java`
#### Snippet
```java
	}

	private String classTestName;
	private String testName;
	private int port = Config.CONFIG.getServerPort();
```

### FieldMayBeFinal
Field `host` may be 'final'
in `src/main/java/fr/inria/spirals/npefix/main/ExecutionClient.java`
#### Snippet
```java
	private String testName;
	private int port = Config.CONFIG.getServerPort();
	private String host = Config.CONFIG.getServerHost();
	private String[] inputSources;

```

### FieldMayBeFinal
Field `port` may be 'final'
in `src/main/java/fr/inria/spirals/npefix/main/ExecutionClient.java`
#### Snippet
```java
	private String classTestName;
	private String testName;
	private int port = Config.CONFIG.getServerPort();
	private String host = Config.CONFIG.getServerHost();
	private String[] inputSources;
```

### FieldMayBeFinal
Field `testName` may be 'final'
in `src/main/java/fr/inria/spirals/npefix/main/ExecutionClient.java`
#### Snippet
```java

	private String classTestName;
	private String testName;
	private int port = Config.CONFIG.getServerPort();
	private String host = Config.CONFIG.getServerHost();
```

### FieldMayBeFinal
Field `inputSources` may be 'final'
in `src/main/java/fr/inria/spirals/npefix/main/ExecutionClient.java`
#### Snippet
```java
	private int port = Config.CONFIG.getServerPort();
	private String host = Config.CONFIG.getServerHost();
	private String[] inputSources;

	public ExecutionClient(String classTestName, String testName, String[] inputSources) {
```

### FieldMayBeFinal
Field `tryContexts` may be 'final'
in `src/main/java/fr/inria/spirals/npefix/resi/ExceptionStack.java`
#### Snippet
```java
public class ExceptionStack {
	
	private static List<TryContext> tryContexts = new ArrayList<>();
	
	public static void register(TryContext tc) {
```

### FieldMayBeFinal
Field `urlClassloader` may be 'final'
in `src/main/java/utils/sacha/finder/classes/impl/ClassloaderFinder.java`
#### Snippet
```java
public class ClassloaderFinder implements ClassFinder {

	private URLClassLoader urlClassloader;
	public ClassloaderFinder(URLClassLoader urlClassloader) {
		this.urlClassloader = urlClassloader;
```

### FieldMayBeFinal
Field `inCreation` may be 'final'
in `src/main/java/fr/inria/spirals/npefix/patchTemplate/InstanceCreator.java`
#### Snippet
```java
public class InstanceCreator {

	private static Set<CtTypeReference> inCreation = new HashSet<>();

	private final Factory factory;
```

### FieldMayBeFinal
Field `type` may be 'final'
in `src/main/java/fr/inria/spirals/npefix/patchTemplate/InstanceCreator.java`
#### Snippet
```java
	private final Factory factory;
	private final TypeFactory typeF;
	private CtTypeReference type;

	public InstanceCreator(CtTypeReference type) {
```

### FieldMayBeFinal
Field `fieldName` may be 'final'
in `src/main/java/fr/inria/spirals/npefix/resi/context/instance/StaticVariableInstance.java`
#### Snippet
```java

	private final String clazz;
	private String fieldName;

	public StaticVariableInstance(String clazz, String fieldName) {
```

### FieldMayBeFinal
Field `offsetLine` may be 'final'
in `src/main/java/fr/inria/spirals/npefix/patch/generator/PatchGenerator.java`
#### Snippet
```java
	private Launcher spoon;
	private int[] offset;
	private int[] offsetLine;

	public PatchGenerator(List<DecisionElement> decisionElement, Launcher spoon, int[] offset, int[] offsetLine) {
```

### FieldMayBeFinal
Field `decisionElement` may be 'final'
in `src/main/java/fr/inria/spirals/npefix/patch/generator/PatchGenerator.java`
#### Snippet
```java

class PatchGenerator {
	private List<DecisionElement> decisionElement;
	private Launcher spoon;
	private int[] offset;
```

### FieldMayBeFinal
Field `spoon` may be 'final'
in `src/main/java/fr/inria/spirals/npefix/patch/generator/PatchGenerator.java`
#### Snippet
```java
class PatchGenerator {
	private List<DecisionElement> decisionElement;
	private Launcher spoon;
	private int[] offset;
	private int[] offsetLine;
```

### FieldMayBeFinal
Field `offset` may be 'final'
in `src/main/java/fr/inria/spirals/npefix/patch/generator/PatchGenerator.java`
#### Snippet
```java
	private List<DecisionElement> decisionElement;
	private Launcher spoon;
	private int[] offset;
	private int[] offsetLine;

```

### FieldMayBeFinal
Field `primitiveToClass` may be 'final'
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/AbstractStrategy.java`
#### Snippet
```java
	}

	private Map<Class,Class> primitiveToClass = new HashMap<Class,Class>();{
		primitiveToClass.put(int.class, Integer.class);
		primitiveToClass.put(long.class, Long.class);
```

### FieldMayBeFinal
Field `repairStrategy` may be 'final'
in `src/main/java/fr/inria/spirals/npefix/main/all/Launcher.java`
#### Snippet
```java
    private spoon.Launcher spoon;

    private RepairStrategy repairStrategy;

    private final Logger logger = LoggerFactory.getLogger(Launcher.class);
```

## RuleId[id=CachedNumberConstructorCall]
### CachedNumberConstructorCall
Number constructor call with primitive argument
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/AbstractStrategy.java`
#### Snippet
```java
		List<Instance<T>> instances = new ArrayList<>();
		if(clazz == int.class){
			instances.add(new PrimitiveInstance<T>((T) new Integer(0)));
			instances.add(new PrimitiveInstance<T>((T) new Integer(-1)));
			instances.add(new PrimitiveInstance<T>((T) new Integer(1)));
```

### CachedNumberConstructorCall
Number constructor call with primitive argument
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/AbstractStrategy.java`
#### Snippet
```java
		if(clazz == int.class){
			instances.add(new PrimitiveInstance<T>((T) new Integer(0)));
			instances.add(new PrimitiveInstance<T>((T) new Integer(-1)));
			instances.add(new PrimitiveInstance<T>((T) new Integer(1)));
		}
```

### CachedNumberConstructorCall
Number constructor call with primitive argument
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/AbstractStrategy.java`
#### Snippet
```java
			instances.add(new PrimitiveInstance<T>((T) new Integer(0)));
			instances.add(new PrimitiveInstance<T>((T) new Integer(-1)));
			instances.add(new PrimitiveInstance<T>((T) new Integer(1)));
		}
		if(clazz == char.class){
```

### CachedNumberConstructorCall
Number constructor call with primitive argument
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/AbstractStrategy.java`
#### Snippet
```java
		}
		if(clazz == long.class){
			instances.add(new PrimitiveInstance<T>((T) new Long(0)));
			instances.add(new PrimitiveInstance<T>((T) new Long(-1)));
			instances.add(new PrimitiveInstance<T>((T) new Long(1)));
```

### CachedNumberConstructorCall
Number constructor call with primitive argument
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/AbstractStrategy.java`
#### Snippet
```java
		if(clazz == long.class){
			instances.add(new PrimitiveInstance<T>((T) new Long(0)));
			instances.add(new PrimitiveInstance<T>((T) new Long(-1)));
			instances.add(new PrimitiveInstance<T>((T) new Long(1)));
		}
```

### CachedNumberConstructorCall
Number constructor call with primitive argument
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/AbstractStrategy.java`
#### Snippet
```java
			instances.add(new PrimitiveInstance<T>((T) new Long(0)));
			instances.add(new PrimitiveInstance<T>((T) new Long(-1)));
			instances.add(new PrimitiveInstance<T>((T) new Long(1)));
		}
		if(clazz == byte.class){
```

### CachedNumberConstructorCall
Number constructor call with primitive argument
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/AbstractStrategy.java`
#### Snippet
```java
		}
		if(clazz == byte.class){
			instances.add(new PrimitiveInstance<T>((T) new Byte((byte)0)));
			instances.add(new PrimitiveInstance<T>((T) new Byte((byte)1)));
		}
```

### CachedNumberConstructorCall
Number constructor call with primitive argument
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/AbstractStrategy.java`
#### Snippet
```java
		if(clazz == byte.class){
			instances.add(new PrimitiveInstance<T>((T) new Byte((byte)0)));
			instances.add(new PrimitiveInstance<T>((T) new Byte((byte)1)));
		}
		if(clazz == short.class){
```

### CachedNumberConstructorCall
Number constructor call with primitive argument
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/AbstractStrategy.java`
#### Snippet
```java
		}
		if(clazz == short.class){
			instances.add(new PrimitiveInstance<T>((T) new Short((short) 0)));
			instances.add(new PrimitiveInstance<T>((T) new Short((short) -1)));
			instances.add(new PrimitiveInstance<T>((T) new Short((short) 1)));
```

### CachedNumberConstructorCall
Number constructor call with primitive argument
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/AbstractStrategy.java`
#### Snippet
```java
		if(clazz == short.class){
			instances.add(new PrimitiveInstance<T>((T) new Short((short) 0)));
			instances.add(new PrimitiveInstance<T>((T) new Short((short) -1)));
			instances.add(new PrimitiveInstance<T>((T) new Short((short) 1)));
		}
```

### CachedNumberConstructorCall
Number constructor call with primitive argument
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/AbstractStrategy.java`
#### Snippet
```java
			instances.add(new PrimitiveInstance<T>((T) new Short((short) 0)));
			instances.add(new PrimitiveInstance<T>((T) new Short((short) -1)));
			instances.add(new PrimitiveInstance<T>((T) new Short((short) 1)));
		}
		return instances;
```

## RuleId[id=CaughtExceptionImmediatelyRethrown]
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

## RuleId[id=UnnecessaryContinue]
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
in `src/main/java/fr/inria/spirals/npefix/resi/strategies/AbstractStrategy.java`
#### Snippet
```java
					}
				} catch (IllegalAccessException e) {
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

## RuleId[id=NewClassNamingConvention]
### NewClassNamingConvention
Test class name `SafeMonoEvaluation` doesn't match regex '\[A-Z\]\[A-Za-z\\d\]\*Test(s\|Case)?\|Test\[A-Z\]\[A-Za-z\\d\]\*\|IT(.\*)\|(.\*)IT(Case)?'
in `src/evaluation/java/fr/inria/spirals/npefix/SafeMonoEvaluation.java`
#### Snippet
```java

// safe mode for NpeFix, see https://github.com/Spirals-Team/npefix/issues/10
public class SafeMonoEvaluation extends AbstractSelectorEvaluation {
    
    @Before
```

### NewClassNamingConvention
Test class name `NPEFixTemplateEvaluation` doesn't match regex '\[A-Z\]\[A-Za-z\\d\]\*Test(s\|Case)?\|Test\[A-Z\]\[A-Za-z\\d\]\*\|IT(.\*)\|(.\*)IT(Case)?'
in `src/evaluation/java/fr/inria/spirals/npefix/resi/NPEFixTemplateEvaluation.java`
#### Snippet
```java
import java.util.Set;

public class NPEFixTemplateEvaluation extends AbstractNPEDataset {

    private Map<String, NpePosition> positions = new HashMap<>();
```

### NewClassNamingConvention
Test class name `RandomSelectorEvaluation` doesn't match regex '\[A-Z\]\[A-Za-z\\d\]\*Test(s\|Case)?\|Test\[A-Z\]\[A-Za-z\\d\]\*\|IT(.\*)\|(.\*)IT(Case)?'
in `src/evaluation/java/fr/inria/spirals/npefix/resi/selector/RandomSelectorEvaluation.java`
#### Snippet
```java
 * Created by thomas on 13/10/15.
 */
public class RandomSelectorEvaluation extends AbstractSelectorEvaluation {

    @Before
```

### NewClassNamingConvention
Test class name `BenchmarkPaper` doesn't match regex '\[A-Z\]\[A-Za-z\\d\]\*Test(s\|Case)?\|Test\[A-Z\]\[A-Za-z\\d\]\*\|IT(.\*)\|(.\*)IT(Case)?'
in `src/evaluation/java/fr/inria/spirals/npefix/resi/BenchmarkPaper.java`
#### Snippet
```java

@Ignore
public class BenchmarkPaper extends AbstractEvaluation {

    private static final int NBITERATION = 10;
```

### NewClassNamingConvention
Test class name `ExplorationSelectorEvaluation` doesn't match regex '\[A-Z\]\[A-Za-z\\d\]\*Test(s\|Case)?\|Test\[A-Z\]\[A-Za-z\\d\]\*\|IT(.\*)\|(.\*)IT(Case)?'
in `src/evaluation/java/fr/inria/spirals/npefix/resi/selector/ExplorationSelectorEvaluation.java`
#### Snippet
```java
import org.junit.Before;

public class ExplorationSelectorEvaluation extends AbstractSelectorEvaluation {

    @Before
```

### NewClassNamingConvention
Test class name `DomSelectorEvaluation` doesn't match regex '\[A-Z\]\[A-Za-z\\d\]\*Test(s\|Case)?\|Test\[A-Z\]\[A-Za-z\\d\]\*\|IT(.\*)\|(.\*)IT(Case)?'
in `src/evaluation/java/fr/inria/spirals/npefix/resi/selector/DomSelectorEvaluation.java`
#### Snippet
```java
import org.junit.Before;

public class DomSelectorEvaluation extends AbstractSelectorEvaluation {

    @Before
```

### NewClassNamingConvention
Test class name `GreedySelectorEvaluation` doesn't match regex '\[A-Z\]\[A-Za-z\\d\]\*Test(s\|Case)?\|Test\[A-Z\]\[A-Za-z\\d\]\*\|IT(.\*)\|(.\*)IT(Case)?'
in `src/evaluation/java/fr/inria/spirals/npefix/resi/selector/GreedySelectorEvaluation.java`
#### Snippet
```java
 * Created by thomas on 13/10/15.
 */
public class GreedySelectorEvaluation extends AbstractSelectorEvaluation {

    @Before
```

### NewClassNamingConvention
Test class name `MonoExplorationEvaluation` doesn't match regex '\[A-Z\]\[A-Za-z\\d\]\*Test(s\|Case)?\|Test\[A-Z\]\[A-Za-z\\d\]\*\|IT(.\*)\|(.\*)IT(Case)?'
in `src/evaluation/java/fr/inria/spirals/npefix/resi/selector/MonoExplorationEvaluation.java`
#### Snippet
```java
import org.junit.Before;

public class MonoExplorationEvaluation extends AbstractSelectorEvaluation {

    @Before
```

### NewClassNamingConvention
Test class name `NPEDataset` doesn't match regex '\[A-Z\]\[A-Za-z\\d\]\*Test(s\|Case)?\|Test\[A-Z\]\[A-Za-z\\d\]\*\|IT(.\*)\|(.\*)IT(Case)?'
in `src/evaluation/java/fr/inria/spirals/npefix/resi/NPEDataset.java`
#### Snippet
```java
 * Created by thomas on 13/10/15.
 */
public class NPEDataset extends AbstractNPEDataset {
    @Override
    public void eval(NPEOutput results) {
```

### NewClassNamingConvention
Test class name `PaperProjects` doesn't match regex '\[A-Z\]\[A-Za-z\\d\]\*Test(s\|Case)?\|Test\[A-Z\]\[A-Za-z\\d\]\*\|IT(.\*)\|(.\*)IT(Case)?'
in `src/evaluation/java/fr/inria/spirals/npefix/resi/PaperProjects.java`
#### Snippet
```java


public class PaperProjects extends AbstractEvaluation {

    @Test
```

## RuleId[id=UnnecessaryLocalVariable]
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

## RuleId[id=RedundantFileCreation]
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

## RuleId[id=ArraysAsListWithZeroOrOneArgument]
### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/main/java/fr/inria/spirals/npefix/resi/selector/DomSelector.java`
#### Snippet
```java
	@Override
	public List<Strategy> getStrategies() {
		return Arrays.asList(strategy);
	}

```

## RuleId[id=PointlessBooleanExpression]
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

## RuleId[id=UseBulkOperation]
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
in `src/main/java/fr/inria/spirals/npefix/patch/sorter/Tokens.java`
#### Snippet
```java
		Tokens iTokens = new Tokens(tokenizer);
		for (Token token :  tokens.subList(i, i1)) {
			iTokens.add(token);
		}
		return iTokens;
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

## RuleId[id=SuspiciousIndentAfterControlStatement]
### SuspiciousIndentAfterControlStatement
Suspicious indentation after 'if' statement
in `src/main/java/utils/sacha/finder/processor/Processor.java`
#### Snippet
```java
			}
			if(!className.contains("$"))
			try {
				Class<?> clazz = Thread.currentThread().getContextClassLoader().loadClass(className);
				if (clazz.isLocalClass() || clazz.isAnonymousClass()) {
```

