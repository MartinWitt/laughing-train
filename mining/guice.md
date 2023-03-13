# guice 
 
# Bad smells
I found 533 bad smells with 63 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryFullyQualifiedName | 71 | false |
| BoundedWildcard | 66 | false |
| ReturnNull | 48 | false |
| AssignmentToMethodParameter | 40 | false |
| RedundantFieldInitialization | 20 | false |
| UnnecessaryLocalVariable | 18 | true |
| NestedAssignment | 17 | false |
| RedundantSuppression | 16 | false |
| UnnecessaryModifier | 15 | true |
| DataFlowIssue | 13 | false |
| OptionalUsedAsFieldOrParameterType | 13 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 11 | false |
| PublicFieldAccessedInSynchronizedContext | 11 | false |
| TypeParameterExtendsObject | 10 | false |
| UtilityClassWithoutPrivateConstructor | 10 | true |
| NonSerializableFieldInSerializableClass | 10 | false |
| SynchronizeOnThis | 9 | false |
| ToArrayCallWithZeroLengthArrayArgument | 8 | true |
| DeprecatedIsStillUsed | 8 | false |
| SizeReplaceableByIsEmpty | 7 | true |
| OptionalIsPresent | 6 | false |
| UnnecessarySemicolon | 6 | false |
| TypeParameterHidesVisibleType | 6 | false |
| DynamicRegexReplaceableByCompiledPattern | 6 | false |
| RegExpRedundantEscape | 5 | false |
| FinalStaticMethod | 5 | false |
| NullableProblems | 5 | false |
| IgnoreResultOfCall | 5 | false |
| ExtendsAnnotation | 4 | false |
| StringConcatenationInsideStringBufferAppend | 4 | false |
| RedundantImplements | 3 | false |
| ZeroLengthArrayInitialization | 3 | false |
| ConstantValue | 3 | false |
| Convert2MethodRef | 3 | false |
| SystemOutErr | 3 | false |
| NonProtectedConstructorInAbstractClass | 3 | true |
| SynchronizationOnLocalVariableOrMethodParameter | 3 | false |
| AssignmentToStaticFieldFromInstanceMethod | 2 | false |
| RegExpSimplifiable | 2 | false |
| MissortedModifiers | 2 | false |
| DefaultAnnotationParam | 2 | false |
| EmptyMethod | 2 | false |
| JavaReflectionMemberAccess | 2 | false |
| AssignmentToForLoopParameter | 2 | false |
| Anonymous2MethodRef | 2 | false |
| CastCanBeRemovedNarrowingVariableType | 2 | false |
| KeySetIterationMayUseEntrySet | 1 | false |
| StaticPseudoFunctionalStyleMethod | 1 | false |
| FinalPrivateMethod | 1 | false |
| UnnecessaryReturn | 1 | true |
| TrivialStringConcatenation | 1 | false |
| SuspiciousInvocationHandlerImplementation | 1 | false |
| ClassNameSameAsAncestorName | 1 | false |
| OptionalAssignedToNull | 1 | false |
| ReplaceAssignmentWithOperatorAssignment | 1 | false |
| EqualsAndHashcode | 1 | false |
| InstanceofCatchParameter | 1 | false |
| NonStaticFinalLogger | 1 | false |
| NonFinalFieldOfException | 1 | false |
| UnusedAssignment | 1 | false |
| OptionalGetWithoutIsPresent | 1 | false |
| UnnecessaryToStringCall | 1 | true |
| StringEqualsEmptyString | 1 | false |
| ThrowablePrintStackTrace | 1 | false |
| JavaReflectionInvocation | 1 | false |
| CaughtExceptionImmediatelyRethrown | 1 | false |
| UnnecessaryContinue | 1 | false |
## RuleId[id=ToArrayCallWithZeroLengthArrayArgument]
### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new FilterDefinition\[filterDefinitions.size()\]'
in `extensions/servlet/src/com/google/inject/servlet/ManagedFilterPipeline.java`
#### Snippet
```java

    // Copy to a fixed-size array for speed of iteration.
    return filterDefinitions.toArray(new FilterDefinition[filterDefinitions.size()]);
  }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new ServletDefinition\[servletDefinitions.size()\]'
in `extensions/servlet/src/com/google/inject/servlet/ManagedServletPipeline.java`
#### Snippet
```java

    // Copy to a fixed size array for speed.
    return servletDefinitions.toArray(new ServletDefinition[servletDefinitions.size()]);
  }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new StackTraceElement\[pruned.size()\]'
in `extensions/servlet/src/com/google/inject/servlet/FilterChainInvocation.java`
#### Snippet
```java
        }
      }
      t.setStackTrace(pruned.toArray(new StackTraceElement[pruned.size()]));
    }
  }
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new ProvisionListener\[listeners.size()\]'
in `core/src/com/google/inject/spi/ProvisionListenerBinding.java`
#### Snippet
```java
    binder
        .withSource(getSource())
        .bindListener(bindingMatcher, listeners.toArray(new ProvisionListener[listeners.size()]));
  }
}
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new MethodInterceptor\[interceptors.size()\]'
in `core/src/com/google/inject/spi/InterceptorBinding.java`
#### Snippet
```java
            classMatcher,
            methodMatcher,
            interceptors.toArray(new MethodInterceptor[interceptors.size()]));
  }
}
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new ProvisionListener\[deDuplicated.size()\]'
in `core/src/com/google/inject/internal/ProvisionListenerStackCallback.java`
#### Snippet
```java
    } else {
      Set<ProvisionListener> deDuplicated = Sets.newLinkedHashSet(listeners);
      this.listeners = deDuplicated.toArray(new ProvisionListener[deDuplicated.size()]);
    }
  }
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new StackTraceElement\[pruned.size()\]'
in `core/src/com/google/inject/internal/InterceptorStackCallback.java`
#### Snippet
```java
        }
      }
      t.setStackTrace(pruned.toArray(new StackTraceElement[pruned.size()]));
    }
  }
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new MethodInterceptor\[interceptors.size()\]'
in `core/src/com/google/inject/internal/InterceptorStackCallback.java`
#### Snippet
```java
      BiFunction<Object, Object[], Object> superInvoker) {
    this.method = method;
    this.interceptors = interceptors.toArray(new MethodInterceptor[interceptors.size()]);
    this.superInvoker = superInvoker;
  }
```

## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `extensions/persist/src/com/google/inject/persist/jpa/JpaFinderProxy.java`
#### Snippet
```java
  }

  private static enum ReturnType {
    PLAIN,
    COLLECTION,
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `extensions/servlet/src/com/google/inject/servlet/RequestScoper.java`
#### Snippet
```java

  /** Closeable subclass that does not throw any exceptions from close. */
  public interface CloseableScope extends Closeable {
    @Override
    void close();
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `extensions/servlet/src/com/google/inject/servlet/UriPatternType.java`
#### Snippet
```java
    private final Kind patternKind;

    private static enum Kind {
      PREFIX,
      SUFFIX,
```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `extensions/servlet/src/com/google/inject/servlet/ServletModule.java`
#### Snippet
```java
   * @since 2.0
   */
  public static interface ServletKeyBindingBuilder {
    void with(Class<? extends HttpServlet> servletKey);

```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `extensions/servlet/src/com/google/inject/servlet/ServletModule.java`
#### Snippet
```java
   * @since 2.0
   */
  public static interface FilterKeyBindingBuilder {
    void through(Class<? extends Filter> filterKey);

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `core/src/com/google/inject/RestrictedBindingSource.java`
#### Snippet
```java
   * @since 5.0
   */
  public static enum RestrictionLevel {
    WARNING,
    ERROR;
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `core/src/com/google/inject/RestrictedBindingSource.java`
#### Snippet
```java
   * @since 5.0
   */
  public static enum RestrictionLevel {
    WARNING,
    ERROR;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `core/src/com/google/inject/RestrictedBindingSource.java`
#### Snippet
```java
  @Retention(RUNTIME)
  @Target(ANNOTATION_TYPE)
  public @interface Permit {}

  /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `core/src/com/google/inject/Scope.java`
#### Snippet
```java
   *     the requested object doesn't already exist in this scope
   */
  public <T> Provider<T> scope(Key<T> key, Provider<T> unscoped);

  /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `core/src/com/google/inject/spi/ProvisionListener.java`
#### Snippet
```java
   * @since 4.0
   */
  public abstract static class ProvisionInvocation<T> {

    /**
```

### UnnecessaryModifier
Modifier `static` is redundant for inner classes of interfaces
in `core/src/com/google/inject/spi/ProvisionListener.java`
#### Snippet
```java
   * @since 4.0
   */
  public abstract static class ProvisionInvocation<T> {

    /**
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `core/src/com/google/inject/Key.java`
#### Snippet
```java
  }

  static enum NullAnnotationStrategy implements AnnotationStrategy {
    INSTANCE;

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `core/src/com/google/inject/util/Modules.java`
#### Snippet
```java
    /** @deprecated there's no reason to use {@code .with()} without any arguments. */
    @Deprecated
    public Module with();

    /** See the EDSL example at {@link Modules#override(Module[]) override()}. */
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `core/src/com/google/inject/internal/ProvisionListenerStackCallback.java`
#### Snippet
```java
  // TODO(sameb): Can this be more InternalFactory-like?
  public interface ProvisionCallback<T> {
    public T call() throws InternalProvisionException;
  }

```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `extensions/assistedinject/src/com/google/inject/assistedinject/FactoryProvider2.java`
#### Snippet
```java
  }

  private static enum SuperMethodLookup {
    UNREFLECT_SPECIAL {
      @Override
```

## RuleId[id=AssignmentToStaticFieldFromInstanceMethod]
### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `GuiceFilter.servletContext` from instance context
in `extensions/servlet/src/com/google/inject/servlet/GuiceServletContextListener.java`
#### Snippet
```java
    // Set the Servletcontext early for those people who are using this class.
    // NOTE(user): This use of the servletContext is deprecated.
    GuiceFilter.servletContext = new WeakReference<>(servletContext);

    Injector injector = getInjector();
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `GuiceFilter.servletContext` from instance context
in `extensions/servlet/src/com/google/inject/servlet/GuiceFilter.java`
#### Snippet
```java

    // Store servlet context in a weakreference, for injection
    GuiceFilter.servletContext = new WeakReference<>(servletContext);

    // In the default pipeline, this is a noop. However, if replaced
```

## RuleId[id=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\(` in RegExp
in `extensions/grapher/src/com/google/inject/grapher/ShortNameFactory.java`
#### Snippet
```java
   */
  private String stripPackages(String str) {
    return str.replaceAll("(^|[< .\\(])([a-z0-9]+\\.)*", "$1");
  }
}
```

### RegExpRedundantEscape
Redundant character escape `\\\"` in RegExp
in `core/src/com/google/inject/internal/PackageNameCompressor.java`
#### Snippet
```java
  // Class names in second group will not be compressed.
  private static final Pattern QUOTED_PATTERN =
      Pattern.compile("([^\\\"]+)((\\\")?[^\\\"\\r\\n]*\\\")?");

  /**
```

### RegExpRedundantEscape
Redundant character escape `\\\"` in RegExp
in `core/src/com/google/inject/internal/PackageNameCompressor.java`
#### Snippet
```java
  // Class names in second group will not be compressed.
  private static final Pattern QUOTED_PATTERN =
      Pattern.compile("([^\\\"]+)((\\\")?[^\\\"\\r\\n]*\\\")?");

  /**
```

### RegExpRedundantEscape
Redundant character escape `\\\"` in RegExp
in `core/src/com/google/inject/internal/PackageNameCompressor.java`
#### Snippet
```java
  // Class names in second group will not be compressed.
  private static final Pattern QUOTED_PATTERN =
      Pattern.compile("([^\\\"]+)((\\\")?[^\\\"\\r\\n]*\\\")?");

  /**
```

### RegExpRedundantEscape
Redundant character escape `\\\"` in RegExp
in `core/src/com/google/inject/internal/PackageNameCompressor.java`
#### Snippet
```java
  // Class names in second group will not be compressed.
  private static final Pattern QUOTED_PATTERN =
      Pattern.compile("([^\\\"]+)((\\\")?[^\\\"\\r\\n]*\\\")?");

  /**
```

## RuleId[id=KeySetIterationMayUseEntrySet]
### KeySetIterationMayUseEntrySet
Iteration over `bindingMap.keySet()` may be replaced with 'entrySet()' iteration
in `core/src/com/google/inject/internal/MissingImplementationErrorHints.java`
#### Snippet
```java
      String want = type.toString();
      Map<Key<?>, Binding<?>> bindingMap = injector.getAllBindings();
      for (Key<?> bindingKey : bindingMap.keySet()) {
        String have = bindingKey.getTypeLiteral().toString();
        if (have.contains(want) || want.contains(have)) {
```

## RuleId[id=StaticPseudoFunctionalStyleMethod]
### StaticPseudoFunctionalStyleMethod
Pseudo functional style code
in `core/src/com/google/inject/internal/ConstructorInjectorStore.java`
#### Snippet
```java
      ImmutableList<MethodAspect> methodAspects =
          ImmutableList.<MethodAspect>builder()
              .addAll(Lists.transform(injectorBindings, MethodAspect::fromBinding))
              .addAll(membersInjector.getAddedAspects())
              .build();
```

## RuleId[id=FinalPrivateMethod]
### FinalPrivateMethod
'private' method declared `final`
in `core/src/com/google/inject/internal/Messages.java`
#### Snippet
```java
  }

  private static final String formatText(String text, FormatOptions... options) {
    if (!InternalFlags.enableColorizeErrorMessages()) {
      return text;
```

## RuleId[id=RegExpSimplifiable]
### RegExpSimplifiable
`[/]` can be simplified to '/'
in `extensions/servlet/src/com/google/inject/servlet/ServletDefinition.java`
#### Snippet
```java
              int servletPathLength = servletPath.length();
              String requestUri = getRequestURI();
              pathInfo = requestUri.substring(getContextPath().length()).replaceAll("[/]{2,}", "/");
              // See: https://github.com/google/guice/issues/372
              if (pathInfo.startsWith(servletPath)) {
```

### RegExpSimplifiable
`[\\W]` can be simplified to '\\W'
in `core/src/com/google/inject/internal/PackageNameCompressor.java`
#### Snippet
```java
      // Start a group to not include the non-word character.
      Pattern.compile(
          "[\\W](([a-z_0-9]++[.]){2,}+"
              // Then match a name starting with an uppercase letter. This is the outer class name.
              + "[A-Z][\\w$]*)");
```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`exceptionTypes.size() == 0` can be replaced with 'exceptionTypes.isEmpty()'
in `extensions/throwingproviders/src/com/google/inject/throwingproviders/CheckedProviders.java`
#### Snippet
```java
        Arrays.asList((Class<? extends Throwable>[]) getMethod.getExceptionTypes());

    if (exceptionTypes.size() == 0) {
      return;
    }
```

### SizeReplaceableByIsEmpty
`jpaUnit.length() > 0` can be replaced with '!jpaUnit.isEmpty()'
in `extensions/persist/src/com/google/inject/persist/jpa/JpaPersistModule.java`
#### Snippet
```java
  public JpaPersistModule(String jpaUnit) {
    Preconditions.checkArgument(
        null != jpaUnit && jpaUnit.length() > 0, "JPA unit name must be a non-empty string.");
    this.jpaUnit = jpaUnit;
  }
```

### SizeReplaceableByIsEmpty
`subtitle.length() != 0` can be replaced with '!subtitle.isEmpty()'
in `extensions/grapher/src/com/google/inject/grapher/graphviz/GraphvizGrapher.java`
#### Snippet
```java

    String subtitle = Joiner.on("<br align=\"left\"/>").join(node.getSubtitles());
    if (subtitle.length() != 0) {
      html.append("<font color=\"").append(node.getHeaderTextColor());
      html.append("\" point-size=\"10\">");
```

### SizeReplaceableByIsEmpty
`requestURI.trim().length() > 0` can be replaced with '!requestURI.trim().isEmpty()'
in `extensions/servlet/src/com/google/inject/servlet/ServletUtils.java`
#### Snippet
```java
        String suffix = requestURI.substring(contextPath.length());
        return normalizePath(suffix);
      } else if (requestURI.trim().length() > 0 && contextPath.length() == requestURI.length()) {
        return "/";
      }
```

### SizeReplaceableByIsEmpty
`value.length() > 0` can be replaced with '!value.isEmpty()'
in `core/src/com/google/inject/internal/InternalFlags.java`
#### Snippet
```java
                }
              });
      return (value != null && value.length() > 0) ? Enum.valueOf(enumType, value) : defaultValue;
    } catch (SecurityException e) {
      return secureValue;
```

### SizeReplaceableByIsEmpty
`s.length() == 0` can be replaced with 's.isEmpty()'
in `core/src/com/google/inject/internal/TypeConverterBindingProcessor.java`
#### Snippet
```java

  private static String capitalize(String s) {
    if (s.length() == 0) {
      return s;
    }
```

### SizeReplaceableByIsEmpty
`modules.length() == 0` can be replaced with 'modules.isEmpty()'
in `core/src/com/google/inject/internal/Messages.java`
#### Snippet
```java
  private static Object appendModules(Object source, ElementSource elementSource) {
    String modules = SourceFormatter.getModuleStack(elementSource);
    if (modules.length() == 0) {
      return source;
    } else {
```

## RuleId[id=UnnecessaryReturn]
### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `core/src/com/google/inject/internal/RealMapBinder.java`
#### Snippet
```java
        Key<Map<K, V>> mapKey, Multimap<K, Binding<V>> duplicates, Errors errors) {
      errors.duplicateMapKey(mapKey, duplicates);
      return;
    }

```

## RuleId[id=FinalStaticMethod]
### FinalStaticMethod
'static' method declared `final`
in `core/src/com/google/inject/internal/Messages.java`
#### Snippet
```java
  }

  private static final String formatText(String text, FormatOptions... options) {
    if (!InternalFlags.enableColorizeErrorMessages()) {
      return text;
```

### FinalStaticMethod
'static' method declared `final`
in `core/src/com/google/inject/internal/Messages.java`
#### Snippet
```java
  }

  public static final String faint(String text) {
    return formatText(text, FormatOptions.FAINT);
  }
```

### FinalStaticMethod
'static' method declared `final`
in `core/src/com/google/inject/internal/Messages.java`
#### Snippet
```java
  }

  public static final String underline(String text) {
    return formatText(text, FormatOptions.UNDERLINE);
  }
```

### FinalStaticMethod
'static' method declared `final`
in `core/src/com/google/inject/internal/Messages.java`
#### Snippet
```java
  }

  public static final String bold(String text) {
    return formatText(text, FormatOptions.BOLD);
  }
```

### FinalStaticMethod
'static' method declared `final`
in `core/src/com/google/inject/internal/Messages.java`
#### Snippet
```java
  }

  public static final String redBold(String text) {
    return formatText(text, FormatOptions.RED, FormatOptions.BOLD);
  }
```

## RuleId[id=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `core/src/com/google/inject/util/Modules.java`
#### Snippet
```java
              sb.append("%n     original binding at " + Errors.convert(scopeBinding.getSource()));
              for (Object usedSource : usedSources) {
                sb.append("%n     bound directly at " + Errors.convert(usedSource) + "");
              }
              binder
```

## RuleId[id=SuspiciousInvocationHandlerImplementation]
### SuspiciousInvocationHandlerImplementation
Method is never used in 'invoke': it's unlikely that 'hashCode', 'equals' and 'toString' are implemented correctly
in `core/src/com/google/inject/internal/InterceptorStackCallback.java`
#### Snippet
```java

  @Override
  public Object invoke(Object proxy, Method unused, Object[] arguments) throws Throwable {
    return new InterceptedMethodInvocation(proxy, arguments, 0).proceed();
  }
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends TypeLiteral`
in `extensions/throwingproviders/src/com/google/inject/throwingproviders/CheckedProvideUtils.java`
#### Snippet
```java
  static void validateExceptions(
      Binder binder,
      Iterable<TypeLiteral<?>> actualExceptionTypes,
      Iterable<Class<? extends Throwable>> expectedExceptionTypes,
      Class<? extends CheckedProvider> checkedProvider) {
```

### BoundedWildcard
Can generalize to `? extends Provider`
in `extensions/throwingproviders/src/com/google/inject/throwingproviders/CheckedProviderMethod.java`
#### Snippet
```java
      Object instance,
      ImmutableSet<Dependency<?>> dependencies,
      List<Provider<?>> parameterProviders,
      Class<? extends Annotation> scopeAnnotation,
      Class<? extends CheckedProvider> checkedProvider,
```

### BoundedWildcard
Can generalize to `? extends Binding`
in `extensions/grapher/src/com/google/inject/grapher/DefaultEdgeCreator.java`
#### Snippet
```java

  @Override
  public Iterable<Edge> getEdges(Iterable<Binding<?>> bindings) {
    List<Edge> edges = Lists.newArrayList();
    EdgeVisitor visitor = new EdgeVisitor();
```

### BoundedWildcard
Can generalize to `? extends Binding`
in `extensions/grapher/src/com/google/inject/grapher/DefaultNodeCreator.java`
#### Snippet
```java
final class DefaultNodeCreator implements NodeCreator {
  @Override
  public Iterable<Node> getNodes(Iterable<Binding<?>> bindings) {
    List<Node> nodes = Lists.newArrayList();
    NodeVisitor visitor = new NodeVisitor();
```

### BoundedWildcard
Can generalize to `? extends Binding`
in `extensions/grapher/src/com/google/inject/grapher/ProviderAliasCreator.java`
#### Snippet
```java
final class ProviderAliasCreator implements AliasCreator {
  @Override
  public Iterable<Alias> createAliases(Iterable<Binding<?>> bindings) {
    List<Alias> aliases = Lists.newArrayList();
    for (Binding<?> binding : bindings) {
```

### BoundedWildcard
Can generalize to `? super Method`
in `extensions/dagger-adapter/src/com/google/inject/daggeradapter/DaggerMethodScanner.java`
#### Snippet
```java
  }

  private DaggerMethodScanner(Predicate<Method> predicate) {
    this.predicate = predicate;
  }
```

### BoundedWildcard
Can generalize to `? extends Node`
in `extensions/grapher/src/com/google/inject/grapher/AbstractInjectorGrapher.java`
#### Snippet
```java
  protected abstract void postProcess() throws IOException;

  private void createNodes(Iterable<Node> nodes, Map<NodeId, NodeId> aliases) throws IOException {
    for (Node node : nodes) {
      NodeId originalId = node.getId();
```

### BoundedWildcard
Can generalize to `? extends Edge`
in `extensions/grapher/src/com/google/inject/grapher/AbstractInjectorGrapher.java`
#### Snippet
```java
  }

  private void createEdges(Iterable<Edge> edges, Map<NodeId, NodeId> aliases) throws IOException {
    for (Edge edge : edges) {
      edge =
```

### BoundedWildcard
Can generalize to `? extends Key`
in `extensions/grapher/src/com/google/inject/grapher/AbstractInjectorGrapher.java`
#### Snippet
```java

  /** Returns the bindings for the root keys and their transitive dependencies. */
  private Iterable<Binding<?>> getBindings(Injector injector, Set<Key<?>> root) {
    Set<Key<?>> keys = Sets.newHashSet(root);
    Set<Key<?>> visitedKeys = Sets.newHashSet();
```

### BoundedWildcard
Can generalize to `? extends EntityManager`
in `extensions/persist/src/com/google/inject/persist/jpa/JpaFinderProxy.java`
#### Snippet
```java

  @Inject
  public JpaFinderProxy(Provider<EntityManager> emProvider) {
    this.emProvider = emProvider;
  }
```

### BoundedWildcard
Can generalize to `? extends ServletContext`
in `extensions/servlet/src/com/google/inject/servlet/ManagedFilterPipeline.java`
#### Snippet
```java
      Injector injector,
      ManagedServletPipeline servletPipeline,
      Provider<ServletContext> servletContext) {
    this.injector = injector;
    this.servletPipeline = servletPipeline;
```

### BoundedWildcard
Can generalize to `? super Filter`
in `extensions/servlet/src/com/google/inject/servlet/FilterDefinition.java`
#### Snippet
```java
  }

  public void destroy(Set<Filter> destroyedSoFar) {
    // filters are always singletons
    Filter reference = filter.get();
```

### BoundedWildcard
Can generalize to `? super Filter`
in `extensions/servlet/src/com/google/inject/servlet/FilterDefinition.java`
#### Snippet
```java

  public void init(
      final ServletContext servletContext, Injector injector, Set<Filter> initializedSoFar)
      throws ServletException {

```

### BoundedWildcard
Can generalize to `? super HttpServlet`
in `extensions/servlet/src/com/google/inject/servlet/ServletDefinition.java`
#### Snippet
```java

  public void init(
      final ServletContext servletContext, Injector injector, Set<HttpServlet> initializedSoFar)
      throws ServletException {

```

### BoundedWildcard
Can generalize to `? super HttpServlet`
in `extensions/servlet/src/com/google/inject/servlet/ServletDefinition.java`
#### Snippet
```java
  }

  public void destroy(Set<HttpServlet> destroyedSoFar) {
    HttpServlet reference = httpServlet.get();

```

### BoundedWildcard
Can generalize to `? extends Element`
in `core/src/com/google/inject/spi/BindingSourceRestriction.java`
#### Snippet
```java
  }

  private static ImmutableList<Message> check(List<Element> elements) {
    ImmutableList.Builder<Message> errorMessagesBuilder = ImmutableList.builder();
    for (Element element : elements) {
```

### BoundedWildcard
Can generalize to `? extends T`
in `extensions/servlet/src/com/google/inject/servlet/ServletScopes.java`
#### Snippet
```java
  }

  private static <T> Callable<T> wrap(Callable<T> delegate, RequestScoper requestScoper) {
    return () -> {
      try (RequestScoper.CloseableScope scope = requestScoper.open()) {
```

### BoundedWildcard
Can generalize to `? extends T`
in `extensions/servlet/src/com/google/inject/servlet/ServletScopes.java`
#### Snippet
```java
  private static final class RequestScope implements Scope {
    @Override
    public <T> Provider<T> scope(final Key<T> key, final Provider<T> creator) {
      return new Provider<T>() {

```

### BoundedWildcard
Can generalize to `? extends T`
in `extensions/servlet/src/com/google/inject/servlet/ServletScopes.java`
#### Snippet
```java
  private static final class SessionScope implements Scope {
    @Override
    public <T> Provider<T> scope(final Key<T> key, final Provider<T> creator) {
      final String name = key.toString();
      return new Provider<T>() {
```

### BoundedWildcard
Can generalize to `? super Integer`
in `core/src/com/google/inject/spi/InjectionPoint.java`
#### Snippet
```java
      AnnotatedType[] annotatedTypes,
      Annotation[][] parameterAnnotationsPerParameter,
      Predicate<Integer> isParameterKotlinNullable) {
    List<Dependency<?>> dependencies = Lists.newArrayList();
    int index = 0;
```

### BoundedWildcard
Can generalize to `? extends Module`
in `core/src/com/google/inject/util/Modules.java`
#### Snippet
```java

    // TODO(diamondm) checkArgument(!overrides.isEmpty())?
    OverrideModule(Iterable<? extends Module> overrides, ImmutableSet<Module> baseModules) {
      this.overrides = ImmutableSet.copyOf(overrides);
      this.baseModules = baseModules;
```

### BoundedWildcard
Can generalize to `? extends Element`
in `core/src/com/google/inject/util/Modules.java`
#### Snippet
```java
  }

  private static Module extractScanners(Iterable<Element> elements) {
    final List<ModuleAnnotatedMethodScannerBinding> scanners = Lists.newArrayList();
    ElementVisitor<Void> visitor =
```

### BoundedWildcard
Can generalize to `? extends Set`
in `core/src/com/google/inject/internal/WeakKeySet.java`
#### Snippet
```java

  private void cleanupOnRemoval(
      RemovalNotification<InjectorBindingData, Set<KeyAndSource>> notification) {
    Preconditions.checkState(RemovalCause.COLLECTED.equals(notification.getCause()));

```

### BoundedWildcard
Can generalize to `? extends T`
in `core/src/com/google/inject/internal/ProvisionListenerStackCallback.java`
#### Snippet
```java
    ProvisionListener erredListener;

    public Provision(ProvisionCallback<T> callable) {
      this.callable = callable;
    }
```

### BoundedWildcard
Can generalize to `? super T`
in `core/src/com/google/inject/internal/ProviderInternalFactory.java`
#### Snippet
```java
      Provider<? extends T> provider,
      Dependency<?> dependency,
      ConstructionContext<T> constructionContext)
      throws InternalProvisionException {
    T t = provider.get();
```

### BoundedWildcard
Can generalize to `? extends Element`
in `core/src/com/google/inject/internal/AbstractProcessor.java`
#### Snippet
```java
  }

  public void process(InjectorImpl injector, List<Element> elements) {
    Errors errorsAnyElement = this.errors;
    this.injector = injector;
```

### BoundedWildcard
Can generalize to `? extends T`
in `core/src/com/google/inject/internal/ConstantFactory.java`
#### Snippet
```java
  private final Initializable<T> initializable;

  public ConstantFactory(Initializable<T> initializable) {
    this.initializable = initializable;
  }
```

### BoundedWildcard
Can generalize to `? extends UriPatternMatcher`
in `extensions/servlet/src/com/google/inject/servlet/ServletsModuleBuilder.java`
#### Snippet
```java
    private final List<UriPatternMatcher> uriPatterns;

    private ServletKeyBindingBuilderImpl(List<UriPatternMatcher> uriPatterns) {
      this.uriPatterns = uriPatterns;
    }
```

### BoundedWildcard
Can generalize to `? super T`
in `core/src/com/google/inject/internal/ConstructorInjector.java`
#### Snippet
```java

  /** Provisions a new T. */
  private T provision(InternalContext context, ConstructionContext<T> constructionContext)
      throws InternalProvisionException {
    try {
```

### BoundedWildcard
Can generalize to `? extends UriPatternMatcher`
in `extensions/servlet/src/com/google/inject/servlet/FiltersModuleBuilder.java`
#### Snippet
```java
    private final List<UriPatternMatcher> uriPatterns;

    private FilterKeyBindingBuilderImpl(List<UriPatternMatcher> uriPatterns) {
      this.uriPatterns = uriPatterns;
    }
```

### BoundedWildcard
Can generalize to `? super Thread`
in `core/src/com/google/inject/internal/CycleDetectingLock.java`
#### Snippet
```java
          Thread thread,
          ReentrantCycleDetectingLock<?> lock,
          ListMultimap<Thread, ID> potentialLocksCycle) {
        boolean found = false;
        Collection<ReentrantCycleDetectingLock<?>> ownedLocks = locksOwnedByThread.get(thread);
```

### BoundedWildcard
Can generalize to `? super ID`
in `core/src/com/google/inject/internal/CycleDetectingLock.java`
#### Snippet
```java
          Thread thread,
          ReentrantCycleDetectingLock<?> lock,
          ListMultimap<Thread, ID> potentialLocksCycle) {
        boolean found = false;
        Collection<ReentrantCycleDetectingLock<?>> ownedLocks = locksOwnedByThread.get(thread);
```

### BoundedWildcard
Can generalize to `? extends ErrorDetail`
in `core/src/com/google/inject/internal/MissingConstructorError.java`
#### Snippet
```java

  @Override
  protected void formatDetail(List<ErrorDetail<?>> mergeableErrors, Formatter formatter) {
    formatter.format("%n");
    Class<?> rawType = type.getRawType();
```

### BoundedWildcard
Can generalize to `? extends Binding`
in `core/src/com/google/inject/internal/DuplicateElementError.java`
#### Snippet
```java
  }

  static <T> ImmutableMultimap<T, Element<T>> indexElements(List<Binding<T>> bindings, T[] values) {
    ImmutableMultimap.Builder<T, Element<T>> map = ImmutableMultimap.builder();
    for (int i = 0; i < values.length; i++) {
```

### BoundedWildcard
Can generalize to `? extends ErrorDetail`
in `core/src/com/google/inject/internal/MissingImplementationError.java`
#### Snippet
```java

  @Override
  public void formatDetail(List<ErrorDetail<?>> mergeableErrors, Formatter formatter) {
    if (!suggestions.isEmpty()) {
      suggestions.forEach(formatter::format);
```

### BoundedWildcard
Can generalize to `? extends ErrorDetail`
in `core/src/com/google/inject/internal/ScopeNotFoundError.java`
#### Snippet
```java

  @Override
  protected void formatDetail(List<ErrorDetail<?>> mergeableErrors, Formatter formatter) {
    List<List<Object>> sourcesSet = new ArrayList<>();
    sourcesSet.add(getSources());
```

### BoundedWildcard
Can generalize to `? extends ErrorDetail`
in `core/src/com/google/inject/internal/ChildBindingAlreadySetError.java`
#### Snippet
```java

  @Override
  public void formatDetail(List<ErrorDetail<?>> mergeableErrors, Formatter formatter) {
    formatter.format("%n%s%n", Messages.bold("Bound at:"));
    int index = 1;
```

### BoundedWildcard
Can generalize to `? extends T`
in `core/src/com/google/inject/internal/Messages.java`
#### Snippet
```java
    final Class<T> type;

    Converter(Class<T> type) {
      this.type = type;
    }
```

### BoundedWildcard
Can generalize to `? super String`
in `core/src/com/google/inject/internal/BytecodeGen.java`
#### Snippet
```java
   */
  static BiFunction<Object, Object[], Object> superMethod(
      Function<String, BiFunction<Object, Object[], Object>> enhancer, Method method) {
    // no need to check 'canEnhance', ProxyFactory will only pick methods from enhanceable list
    return enhancer.apply(signature(method));
```

### BoundedWildcard
Can generalize to `? extends BiFunction`
in `core/src/com/google/inject/internal/BytecodeGen.java`
#### Snippet
```java
   */
  static BiFunction<Object, Object[], Object> superMethod(
      Function<String, BiFunction<Object, Object[], Object>> enhancer, Method method) {
    // no need to check 'canEnhance', ProxyFactory will only pick methods from enhanceable list
    return enhancer.apply(signature(method));
```

### BoundedWildcard
Can generalize to `? super String`
in `core/src/com/google/inject/internal/BytecodeGen.java`
#### Snippet
```java
   */
  static BiFunction<Object, Object[], Object> enhancedConstructor(
      Function<String, BiFunction<Object, Object[], Object>> enhancer, Constructor<?> constructor) {
    checkArgument(canEnhance(constructor), "Constructor is not visible");
    return enhancer.apply(signature(constructor));
```

### BoundedWildcard
Can generalize to `? extends BiFunction`
in `core/src/com/google/inject/internal/BytecodeGen.java`
#### Snippet
```java
   */
  static BiFunction<Object, Object[], Object> enhancedConstructor(
      Function<String, BiFunction<Object, Object[], Object>> enhancer, Constructor<?> constructor) {
    checkArgument(canEnhance(constructor), "Constructor is not visible");
    return enhancer.apply(signature(constructor));
```

### BoundedWildcard
Can generalize to `? super T`
in `core/src/com/google/inject/internal/InternalProviderInstanceBindingImpl.java`
#### Snippet
```java
        Dependency<?> dependency,
        InternalContext context,
        ConstructionContext<T> constructionContext)
        throws InternalProvisionException {
      try {
```

### BoundedWildcard
Can generalize to `? super String`
in `core/src/com/google/inject/internal/aop/ImmutableStringTrie.java`
#### Snippet
```java
    private final ToIntFunction<String> next;

    Overflow(char[] data, String overflowKey, ToIntFunction<String> next) {
      this.trie = new ImmutableStringTrie(data);
      this.overflowKey = overflowKey;
```

### BoundedWildcard
Can generalize to `? extends T`
in `core/src/com/google/inject/internal/SingletonScope.java`
#### Snippet
```java
   */
  @Override
  public <T> Provider<T> scope(final Key<T> key, final Provider<T> creator) {
    /** Locking strategy: */
    return new Provider<T>() {
```

### BoundedWildcard
Can generalize to `? super Method`
in `core/src/com/google/inject/internal/aop/MethodPartition.java`
#### Snippet
```java
  public void collectEnhanceableMethods(
      TypeLiteral<?> hostType,
      Consumer<Method> methodVisitor,
      Map<Method, Method> bridgeDelegates) {

```

### BoundedWildcard
Can generalize to `? super Method`
in `core/src/com/google/inject/internal/aop/MethodPartition.java`
#### Snippet
```java
      TypeLiteral<?> hostType,
      Consumer<Method> methodVisitor,
      Map<Method, Method> bridgeDelegates) {

    Map<String, Method> leafMethods = new HashMap<>();
```

### BoundedWildcard
Can generalize to `? super Method`
in `core/src/com/google/inject/internal/aop/MethodPartition.java`
#### Snippet
```java
      TypeLiteral<?> hostType,
      Consumer<Method> methodVisitor,
      Map<Method, Method> bridgeDelegates) {

    Map<String, Method> leafMethods = new HashMap<>();
```

### BoundedWildcard
Can generalize to `? super ClassLoader`
in `core/src/com/google/inject/internal/aop/GeneratedClassDefiner.java`
#### Snippet
```java
  private final BiFunction<ClassLoader, byte[], Class<?>> defineAccess;

  GeneratedClassDefiner(BiFunction<ClassLoader, byte[], Class<?>> defineAccess) {
    this.defineAccess = defineAccess;
  }
```

### BoundedWildcard
Can generalize to `? super String`
in `core/src/com/google/inject/internal/aop/AbstractGlueGenerator.java`
#### Snippet
```java
  /** Combines the signature and invoker tables into a mapping from signature to invoker. */
  private static Function<String, BiFunction<Object, Object[], Object>> bindSignaturesToInvokers(
      ToIntFunction<String> signatureTable, MethodHandle invokerTable) {

    // single-argument method; the table must be a function from integer index to invoker function
```

### BoundedWildcard
Can generalize to `? extends Executable`
in `core/src/com/google/inject/internal/aop/AbstractGlueGenerator.java`
#### Snippet
```java
   * objects, and invokes the appropriate constructor/method returning the result as an object.
   */
  protected final void generateTrampoline(ClassWriter cw, Collection<Executable> members) {
    MethodVisitor mv =
        cw.visitMethod(PUBLIC | STATIC, TRAMPOLINE_NAME, TRAMPOLINE_DESCRIPTOR, null, null);
```

### BoundedWildcard
Can generalize to `? super BindingSelection`
in `core/src/com/google/inject/internal/RealMultibinder.java`
#### Snippet
```java
    BaseFactory(
        BindingSelection<ValueT> bindingSelection,
        Function<BindingSelection<ValueT>, ImmutableSet<Dependency<?>>> dependenciesFn) {
      // While Multibinders only depend on bindings created in modules so we could theoretically
      // initialize eagerly, they also depend on
```

### BoundedWildcard
Can generalize to `? extends ImmutableSet`>
in `core/src/com/google/inject/internal/RealMultibinder.java`
#### Snippet
```java
    BaseFactory(
        BindingSelection<ValueT> bindingSelection,
        Function<BindingSelection<ValueT>, ImmutableSet<Dependency<?>>> dependenciesFn) {
      // While Multibinders only depend on bindings created in modules so we could theoretically
      // initialize eagerly, they also depend on
```

### BoundedWildcard
Can generalize to `? super Boolean`
in `core/src/com/google/inject/internal/RealMultibinder.java`
#### Snippet
```java
    private final Key<Boolean> key;

    PermitDuplicatesModule(Key<Boolean> key) {
      this.key = key;
    }
```

### BoundedWildcard
Can generalize to `? super String`
in `core/src/com/google/inject/internal/util/NewThrowableFinder.java`
#### Snippet
```java
class NewThrowableFinder implements CallerFinder {
  @Override
  public StackTraceElement findCaller(Predicate<String> shouldBeSkipped) {
    StackTraceElement[] stackTraceElements = new Throwable().getStackTrace();
    for (StackTraceElement element : stackTraceElements) {
```

### BoundedWildcard
Can generalize to `? extends T`
in `core/src/com/google/inject/internal/InjectorImpl.java`
#### Snippet
```java

    SyntheticProviderBindingImpl(
        InjectorImpl injector, Key<Provider<T>> key, Binding<T> providedBinding) {
      super(
          injector,
```

### BoundedWildcard
Can generalize to `? super Key`
in `core/src/com/google/inject/internal/InjectorImpl.java`
#### Snippet
```java
   * failed.
   */
  private boolean cleanup(BindingImpl<?> binding, Set<Key<?>> encountered) {
    boolean bindingFailed = false;
    Set<Dependency<?>> deps = getInternalDependencies(binding);
```

### BoundedWildcard
Can generalize to `? extends T`
in `core/src/com/google/inject/internal/InjectorImpl.java`
#### Snippet
```java

  <T> InternalFactory<? extends T> getInternalFactory(
      Key<T> key, Errors errors, JitLimitation jitType) throws ErrorsException {
    return getBindingOrThrow(key, errors, jitType).getInternalFactory();
  }
```

### BoundedWildcard
Can generalize to `? super T`
in `core/src/com/google/inject/internal/aop/ClassBuilding.java`
#### Snippet
```java
  /** Visit all subclass accessible members in the given array. */
  static <T extends Executable> void visitMembers(
      T[] members, boolean samePackage, Consumer<T> visitor) {
    for (T member : members) {
      if (canAccess(member, samePackage)) {
```

### BoundedWildcard
Can generalize to `? super String`
in `core/src/com/google/inject/internal/aop/ClassBuilding.java`
#### Snippet
```java
   * be the same for the bridge method and its delegate.
   */
  private static void partitionMethod(Method method, Map<String, Object> partitions) {
    String partitionKey = method.getName() + '/' + method.getParameterCount();
    partitions.merge(partitionKey, method, ClassBuilding::mergeMethods);
```

### BoundedWildcard
Can generalize to `? extends T`
in `extensions/assistedinject/src/com/google/inject/assistedinject/AssistedConstructor.java`
#### Snippet
```java
  }

  private AssistedConstructor(Constructor<T> constructor, List<TypeLiteral<?>> parameterTypes) {
    this.constructor = constructor;

```

### BoundedWildcard
Can generalize to `? extends T`
in `extensions/jndi/src/com/google/inject/jndi/JndiIntegration.java`
#### Snippet
```java
    final String name;

    public JndiProvider(Class<T> type, String name) {
      this.type = type;
      this.name = name;
```

### BoundedWildcard
Can generalize to `? extends TypeLiteral`
in `extensions/testlib/src/com/google/inject/testing/fieldbinder/BoundFieldModule.java`
#### Snippet
```java
    }

    private void checkBindingIsAssignable(Field field, Optional<TypeLiteral<?>> naturalType)
        throws BoundFieldException {
      if (naturalType.isPresent()) {
```

### BoundedWildcard
Can generalize to `? super Message`
in `extensions/testlib/src/com/google/inject/testing/fieldbinder/BoundFieldModule.java`
#### Snippet
```java
      TypeLiteral<?> containingClassType,
      Field field,
      ImmutableList.Builder<Message> deferredErrors) {
    Bind bindAnnotation = field.getAnnotation(Bind.class);
    if (bindAnnotation == null) {
```

### BoundedWildcard
Can generalize to `? extends TypeLiteral`
in `extensions/testlib/src/com/google/inject/testing/fieldbinder/BoundFieldModule.java`
#### Snippet
```java
    }

    private TypeLiteral<?> computeBoundType(Optional<TypeLiteral<?>> naturalType)
        throws BoundFieldException {
      Class<?> bindClass = bindAnnotation.to();
```

### BoundedWildcard
Can generalize to `? extends Key`
in `extensions/assistedinject/src/com/google/inject/assistedinject/FactoryProvider2.java`
#### Snippet
```java
   */
  private boolean constructorHasMatchingParams(
      TypeLiteral<?> type, Constructor<?> constructor, List<Key<?>> paramList, Errors errors)
      throws ErrorsException {
    List<TypeLiteral<?>> params = type.getParameterTypes(constructor);
```

## RuleId[id=NullableProblems]
### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `core/src/com/google/inject/internal/MembersInjectorImpl.java`
#### Snippet
```java
  // some memory lookups by representing empty as null.
  @Nullable private final ImmutableList<SingleMemberInjector> memberInjectors;
  @Nullable private final ImmutableList<MembersInjector<? super T>> userMembersInjectors;
  @Nullable private final ImmutableList<InjectionListener<? super T>> injectionListeners;
  @Nullable private final ImmutableList<MethodAspect> addedAspects;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `core/src/com/google/inject/internal/MembersInjectorImpl.java`
#### Snippet
```java
  @Nullable private final ImmutableList<MembersInjector<? super T>> userMembersInjectors;
  @Nullable private final ImmutableList<InjectionListener<? super T>> injectionListeners;
  @Nullable private final ImmutableList<MethodAspect> addedAspects;

  MembersInjectorImpl(
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `core/src/com/google/inject/internal/MembersInjectorImpl.java`
#### Snippet
```java
  @Nullable private final ImmutableList<SingleMemberInjector> memberInjectors;
  @Nullable private final ImmutableList<MembersInjector<? super T>> userMembersInjectors;
  @Nullable private final ImmutableList<InjectionListener<? super T>> injectionListeners;
  @Nullable private final ImmutableList<MethodAspect> addedAspects;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `core/src/com/google/inject/internal/MembersInjectorImpl.java`
#### Snippet
```java
  // a null list means empty. Since it is common for many of these lists to be empty we can save
  // some memory lookups by representing empty as null.
  @Nullable private final ImmutableList<SingleMemberInjector> memberInjectors;
  @Nullable private final ImmutableList<MembersInjector<? super T>> userMembersInjectors;
  @Nullable private final ImmutableList<InjectionListener<? super T>> injectionListeners;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `core/src/com/google/inject/internal/SingletonScope.java`
#### Snippet
```java
       * InternalContext during instantiation.
       */
      final @Nullable InjectorImpl injector;

      {
```

## RuleId[id=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `private static @com.google.inject.Inject`
in `extensions/struts2/src/com/google/inject/struts2/Struts2Factory.java`
#### Snippet
```java
          + "that uses the Struts2GuicePluginModule in your application's web.xml?";

  private static @com.google.inject.Inject Injector injector;

  private final List<ProvidedInterceptor> interceptors = new ArrayList<>();
```

### MissortedModifiers
Missorted modifiers `final @Nullable`
in `core/src/com/google/inject/internal/SingletonScope.java`
#### Snippet
```java
       * InternalContext during instantiation.
       */
      final @Nullable InjectorImpl injector;

      {
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `Class.getDeclaredFields()` is ignored
in `extensions/struts2/src/com/google/inject/struts2/Struts2Factory.java`
#### Snippet
```java
            // Calling these methods now helps us detect ClassNotFoundErrors
            // early.
            clazz.getDeclaredFields();
            clazz.getDeclaredMethods();

```

### IgnoreResultOfCall
Result of `Class.getDeclaredMethods()` is ignored
in `extensions/struts2/src/com/google/inject/struts2/Struts2Factory.java`
#### Snippet
```java
            // early.
            clazz.getDeclaredFields();
            clazz.getDeclaredMethods();

            boundClasses.add(clazz);
```

### IgnoreResultOfCall
Result of `Class.getDeclaredFields()` is ignored
in `extensions/struts2/src/com/google/inject/struts2/GuiceObjectFactory.java`
#### Snippet
```java
            // Calling these methods now helps us detect ClassNotFoundErrors
            // early.
            clazz.getDeclaredFields();
            clazz.getDeclaredMethods();

```

### IgnoreResultOfCall
Result of `Class.getDeclaredMethods()` is ignored
in `extensions/struts2/src/com/google/inject/struts2/GuiceObjectFactory.java`
#### Snippet
```java
            // early.
            clazz.getDeclaredFields();
            clazz.getDeclaredMethods();

            boundClasses.add(clazz);
```

### IgnoreResultOfCall
Result of `Method.getParameterAnnotations()` is ignored
in `extensions/assistedinject/src/com/google/inject/assistedinject/FactoryProvider.java`
#### Snippet
```java
      }

      method.getParameterAnnotations();
      for (Annotation[] parameterAnnotations : method.getParameterAnnotations()) {
        for (Annotation parameterAnnotation : parameterAnnotations) {
```

## RuleId[id=DefaultAnnotationParam]
### DefaultAnnotationParam
Redundant default parameter value assignment
in `core/src/com/google/inject/multibindings/StringMapKey.java`
#### Snippet
```java
 * @since 4.0
 */
@MapKey(unwrapValue = true)
@Documented
@Target(METHOD)
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `core/src/com/google/inject/multibindings/ClassMapKey.java`
#### Snippet
```java
 * @since 4.0
 */
@MapKey(unwrapValue = true)
@Documented
@Target(METHOD)
```

## RuleId[id=ClassNameSameAsAncestorName]
### ClassNameSameAsAncestorName
Class name `Provider` is the same as one of its superclass' names
in `core/src/com/google/inject/Provider.java`
#### Snippet
```java
 * @author crazybob@google.com (Bob Lee)
 */
public interface Provider<T> extends javax.inject.Provider<T> {

  /**
```

## RuleId[id=OptionalAssignedToNull]
### OptionalAssignedToNull
Optional value is compared with null
in `extensions/testlib/src/com/google/inject/testing/fieldbinder/BoundFieldModule.java`
#### Snippet
```java
      // type is requested.
      if (bindClass == Bind.class) {
        Preconditions.checkState(naturalType != null);
        if (!naturalType.isPresent()) {
          throw new BoundFieldException(
```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `core/src/com/google/inject/spi/InjectionPoint.java`
#### Snippet
```java

      lastMethod = method;
      Signature signature = lastSignature = new Signature(method);
      List<InjectableMethod> methods = bySignature.get(signature);
      boolean removed = false;
```

### NestedAssignment
Result of assignment expression used
in `core/src/com/google/inject/spi/InjectionPoint.java`
#### Snippet
```java
    void add(InjectableMember member) {
      if (head == null) {
        head = tail = member;
      } else {
        member.previous = tail;
```

### NestedAssignment
Result of assignment expression used
in `core/src/com/google/inject/internal/WeakKeySet.java`
#### Snippet
```java
      Set<KeyAndSource> keyAndSources = evictionCache.getIfPresent(state);
      if (keyAndSources == null) {
        evictionCache.put(state, keyAndSources = Sets.newHashSet());
      }
      keyAndSources.add(new KeyAndSource(key, convertedSource));
```

### NestedAssignment
Result of assignment expression used
in `core/src/com/google/inject/internal/RealMultibinder.java`
#### Snippet
```java
      Key<Collection<Provider<T>>> local = collectionOfProvidersKey;
      if (local == null) {
        local = collectionOfProvidersKey = setKey.ofType(collectionOfProvidersOf(elementType));
      }
      return local;
```

### NestedAssignment
Result of assignment expression used
in `core/src/com/google/inject/internal/RealMultibinder.java`
#### Snippet
```java
      if (local == null) {
        local =
            permitDuplicatesKey = Key.get(Boolean.class, named(toString() + " permits duplicates"));
      }
      return local;
```

### NestedAssignment
Result of assignment expression used
in `core/src/com/google/inject/internal/RealMultibinder.java`
#### Snippet
```java
      Key<Set<? extends T>> local = setOfExtendsKey;
      if (local == null) {
        local = setOfExtendsKey = setKey.ofType(setOfExtendsOf(elementType));
      }
      return local;
```

### NestedAssignment
Result of assignment expression used
in `core/src/com/google/inject/internal/RealMultibinder.java`
#### Snippet
```java
      if (local == null) {
        local =
            collectionOfJavaxProvidersKey =
                setKey.ofType(collectionOfJavaxProvidersOf(elementType));
      }
      return local;
```

### NestedAssignment
Result of assignment expression used
in `core/src/com/google/inject/internal/InjectorImpl.java`
#### Snippet
```java
    InternalContext ctx = (InternalContext) reference[0];
    if (ctx == null) {
      reference[0] = ctx = new InternalContext(options, reference);
    } else {
      ctx.enter();
```

### NestedAssignment
Result of assignment expression used
in `core/src/com/google/inject/internal/RealMapBinder.java`
#### Snippet
```java
      if (local == null) {
        local =
            providerCollectionMultimapKey =
                mapKey.ofType(mapOfCollectionOfProviderOf(keyType, valueType));
      }
      return local;
```

### NestedAssignment
Result of assignment expression used
in `core/src/com/google/inject/internal/RealMapBinder.java`
#### Snippet
```java
      Key<Map<K, Provider<V>>> local = providerMapKey;
      if (local == null) {
        local = providerMapKey = mapKey.ofType(mapOfProviderOf(keyType, valueType));
      }
      return local;
```

### NestedAssignment
Result of assignment expression used
in `core/src/com/google/inject/internal/RealMapBinder.java`
#### Snippet
```java
      if (local == null) {
        local =
            javaxProviderCollectionMultimapKey =
                mapKey.ofType(mapOfCollectionOfJavaxProviderOf(keyType, valueType));
      }
      return local;
```

### NestedAssignment
Result of assignment expression used
in `core/src/com/google/inject/internal/RealMapBinder.java`
#### Snippet
```java
      Key<Map<K, Set<Provider<V>>>> local = providerSetMultimapKey;
      if (local == null) {
        local = providerSetMultimapKey = mapKey.ofType(mapOfSetOfProviderOf(keyType, valueType));
      }
      return local;
```

### NestedAssignment
Result of assignment expression used
in `core/src/com/google/inject/internal/RealMapBinder.java`
#### Snippet
```java
      if (local == null) {
        local =
            entrySetJavaxProviderKey =
                mapKey.ofType(setOfEntryOfJavaxProviderOf(keyType, valueType));
      }
      return local;
```

### NestedAssignment
Result of assignment expression used
in `core/src/com/google/inject/internal/RealMapBinder.java`
#### Snippet
```java
      if (local == null) {
        local =
            javaxProviderSetMultimapKey =
                mapKey.ofType(mapOfSetOfJavaxProviderOf(keyType, valueType));
      }
      return local;
```

### NestedAssignment
Result of assignment expression used
in `core/src/com/google/inject/internal/RealMapBinder.java`
#### Snippet
```java
        Type mapOfKeyAndExtendsValue = Types.mapOf(keyType.getType(), extendsValue);
        local =
            mapOfKeyExtendsValueKey =
                (Key<Map<K, ? extends V>>) mapKey.ofType(mapOfKeyAndExtendsValue);
      }
      return local;
```

### NestedAssignment
Result of assignment expression used
in `core/src/com/google/inject/internal/RealMapBinder.java`
#### Snippet
```java
      Key<Map<K, javax.inject.Provider<V>>> local = javaxProviderMapKey;
      if (local == null) {
        local = javaxProviderMapKey = mapKey.ofType(mapOfJavaxProviderOf(keyType, valueType));
      }
      return local;
```

### NestedAssignment
Result of assignment expression used
in `core/src/com/google/inject/internal/RealMapBinder.java`
#### Snippet
```java
      Key<Map<K, Set<V>>> local = multimapKey;
      if (local == null) {
        local = multimapKey = mapKey.ofType(mapOf(keyType, setOf(valueType)));
      }
      return local;
```

## RuleId[id=ReplaceAssignmentWithOperatorAssignment]
### ReplaceAssignmentWithOperatorAssignment
`normalized = normalized + "*"` could be simplified to 'normalized += "\*"'
in `extensions/servlet/src/com/google/inject/servlet/UriPatternType.java`
#### Snippet
```java
        normalized = "*" + normalized;
      } else if (patternKind == Kind.SUFFIX) {
        normalized = normalized + "*";
      }
      if (!pattern.equals(normalized)) {
```

## RuleId[id=ExtendsAnnotation]
### ExtendsAnnotation
Class 'NamedImpl' implements annotation interface `Named`
in `core/src/com/google/inject/name/NamedImpl.java`
#### Snippet
```java
import java.lang.annotation.Annotation;

class NamedImpl implements Named, Serializable {

  private final String value;
```

### ExtendsAnnotation
Class 'RealElement' implements annotation interface `Element`
in `core/src/com/google/inject/internal/RealElement.java`
#### Snippet
```java
/** An implementation of Element. */
// TODO(cgruber): Use AutoAnnotation when available, here & wherever else is makes sense.
class RealElement implements Element {
  private static final AtomicInteger nextUniqueId = new AtomicInteger(1);

```

### ExtendsAnnotation
Class 'DefaultImpl' implements annotation interface `Default`
in `core/src/com/google/inject/internal/RealOptionalBinder.java`
#### Snippet
```java
  }

  static class DefaultImpl extends BaseAnnotation implements Default {
    public DefaultImpl(String value) {
      super(Default.class, value);
```

### ExtendsAnnotation
Class 'ActualImpl' implements annotation interface `Actual`
in `core/src/com/google/inject/internal/RealOptionalBinder.java`
#### Snippet
```java
  }

  static class ActualImpl extends BaseAnnotation implements Actual {
    public ActualImpl(String value) {
      super(Actual.class, value);
```

## RuleId[id=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `boundClasses` is accessed in both synchronized and unsynchronized contexts
in `extensions/struts2/src/com/google/inject/struts2/Struts2Factory.java`
#### Snippet
```java
  }

  Set<Class<?>> boundClasses = new HashSet<>();

  @Override
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `interceptors` is accessed in both synchronized and unsynchronized contexts
in `extensions/struts2/src/com/google/inject/struts2/GuiceObjectFactory.java`
#### Snippet
```java
  volatile Injector injector;
  boolean developmentMode = false;
  List<ProvidedInterceptor> interceptors = new ArrayList<>();

  @Override
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `boundClasses` is accessed in both synchronized and unsynchronized contexts
in `extensions/struts2/src/com/google/inject/struts2/GuiceObjectFactory.java`
#### Snippet
```java
  }

  Set<Class<?>> boundClasses = new HashSet<>();

  @SuppressWarnings("rawtypes") // Parent class uses raw type.
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `binder` is accessed in both synchronized and unsynchronized contexts
in `core/src/com/google/inject/AbstractModule.java`
#### Snippet
```java
public abstract class AbstractModule implements Module {

  Binder binder;

  @Override
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `binder` is accessed in both synchronized and unsynchronized contexts
in `core/src/com/google/inject/PrivateModule.java`
#### Snippet
```java

  /** Like abstract module, the binder of the current private module */
  private PrivateBinder binder;

  @Override
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `backingMap` is accessed in both synchronized and unsynchronized contexts
in `core/src/com/google/inject/internal/WeakKeySet.java`
#### Snippet
```java
final class WeakKeySet {

  private Map<Key<?>, Multiset<Object>> backingMap;

  /**
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `lockThreadIsWaitingOn` is accessed in both synchronized and unsynchronized contexts
in `core/src/com/google/inject/internal/CycleDetectingLock.java`
#### Snippet
```java
     * <p>Guarded by {@code CycleDetectingLockFactory.class}.
     */
    private static Map<Thread, ReentrantCycleDetectingLock<?>> lockThreadIsWaitingOn =
        Maps.newHashMap();

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `lockReentranceCount` is accessed in both synchronized and unsynchronized contexts
in `core/src/com/google/inject/internal/CycleDetectingLock.java`
#### Snippet
```java
       * CycleDetectingLockFactory.this}.
       */
      private int lockReentranceCount = 0;

      ReentrantCycleDetectingLock(
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `lockOwnerThread` is accessed in both synchronized and unsynchronized contexts
in `core/src/com/google/inject/internal/CycleDetectingLock.java`
#### Snippet
```java
       * Thread that owns this lock. Nullable. Guarded by {@code CycleDetectingLockFactory.this}.
       */
      private Thread lockOwnerThread = null;

      /**
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `shells` is accessed in both synchronized and unsynchronized contexts
in `core/src/com/google/inject/internal/InternalInjectorCreator.java`
#### Snippet
```java

  private final InjectorShell.Builder shellBuilder = new InjectorShell.Builder();
  private List<InjectorShell> shells;

  public InternalInjectorCreator() {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `membersInjectorStore` is accessed in both synchronized and unsynchronized contexts
in `core/src/com/google/inject/internal/InjectorImpl.java`
#### Snippet
```java

  /** Cached field and method injectors for each type. */
  MembersInjectorStore membersInjectorStore;

  /** Cached provision listener callbacks for each key. */
```

## RuleId[id=EmptyMethod]
### EmptyMethod
All implementations of this method are empty
in `core/src/com/google/inject/internal/KotlinSupportInterface.java`
#### Snippet
```java

  /** Checks for any errors on the constructor's parameters's annotations. */
  void checkConstructorParameterAnnotations(Constructor<?> constructor, Errors errors);

  /** Returns whether the {@code clazz} is a local Kotlin class. */
```

### EmptyMethod
The method is empty
in `core/src/com/google/inject/internal/util/LineNumbers.java`
#### Snippet
```java
      }

      public void visitLocalVariable(
          String name, String desc, String signature, Label start, Label end, int index) {}
    }
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `false` is redundant
in `extensions/grapher/src/com/google/inject/grapher/Node.java`
#### Snippet
```java
   * used in tests.
   */
  static boolean ignoreSourceInComparisons = false;

  private final NodeId id;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `extensions/struts2/src/com/google/inject/struts2/GuiceObjectFactory.java`
#### Snippet
```java
  Module module;
  volatile Injector injector;
  boolean developmentMode = false;
  List<ProvidedInterceptor> interceptors = new ArrayList<>();

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `extensions/persist/src/com/google/inject/persist/jpa/JpaLocalTxnInterceptor.java`
#### Snippet
```java

  // TODO(gak): Move these args to the cxtor & make these final.
  @Inject private JpaPersistService emProvider = null;

  @Inject private UnitOfWork unitOfWork = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `extensions/persist/src/com/google/inject/persist/jpa/JpaLocalTxnInterceptor.java`
#### Snippet
```java
  @Inject private JpaPersistService emProvider = null;

  @Inject private UnitOfWork unitOfWork = null;

  @Transactional
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `extensions/persist/src/com/google/inject/persist/jpa/JpaFinderProxy.java`
#### Snippet
```java
  /** A wrapper data class that caches information about a finder method. */
  private static class FinderDescriptor {
    private volatile boolean isKeyedQuery = false;
    volatile boolean isBindAsRawParameters = true;
    //should we treat the query as having ? instead of :named params
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `extensions/servlet/src/com/google/inject/servlet/ManagedFilterPipeline.java`
#### Snippet
```java

  //Guards a DCL, so needs to be volatile
  private volatile boolean initialized = false;
  private static final TypeLiteral<FilterDefinition> FILTER_DEFS =
      TypeLiteral.get(FilterDefinition.class);
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `extensions/servlet/src/com/google/inject/servlet/FilterChainInvocation.java`
#### Snippet
```java
  private int index = -1;
  // whether or not we've caught an exception & cleaned up stack traces
  private boolean cleanedStacks = false;

  public FilterChainInvocation(
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `core/src/com/google/inject/ConfigurationException.java`
#### Snippet
```java

  private final com.google.common.collect.ImmutableSet<Message> messages;
  private Object partialValue = null;

  /** Creates a ConfigurationException containing {@code messages}. */
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `core/src/com/google/inject/spi/Elements.java`
#### Snippet
```java
     * variable, only custom scanners are.
     */
    private ModuleAnnotatedMethodScanner scannerSource = null;

    private ModuleAnnotatedMethodScanner currentScanner = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `core/src/com/google/inject/spi/Elements.java`
#### Snippet
```java

    /** The current modules stack */
    private ModuleSource moduleSource = null;
    /**
     * The current scanner.
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `core/src/com/google/inject/spi/Elements.java`
#### Snippet
```java
    private ModuleAnnotatedMethodScanner scannerSource = null;

    private ModuleAnnotatedMethodScanner currentScanner = null;
    private boolean trustedSource = false;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `core/src/com/google/inject/spi/Elements.java`
#### Snippet
```java

    private ModuleAnnotatedMethodScanner currentScanner = null;
    private boolean trustedSource = false;

    private RecordingBinder(Stage stage) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `core/src/com/google/inject/internal/InjectorOptionsProcessor.java`
#### Snippet
```java

  private boolean disableCircularProxies = false;
  private boolean jitDisabled = false;
  private boolean atInjectRequired = false;
  private boolean exactBindingAnnotationsRequired = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `core/src/com/google/inject/internal/InjectorOptionsProcessor.java`
#### Snippet
```java
  private boolean disableCircularProxies = false;
  private boolean jitDisabled = false;
  private boolean atInjectRequired = false;
  private boolean exactBindingAnnotationsRequired = false;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `core/src/com/google/inject/internal/InjectorOptionsProcessor.java`
#### Snippet
```java
class InjectorOptionsProcessor extends AbstractProcessor {

  private boolean disableCircularProxies = false;
  private boolean jitDisabled = false;
  private boolean atInjectRequired = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `core/src/com/google/inject/internal/InjectorOptionsProcessor.java`
#### Snippet
```java
  private boolean jitDisabled = false;
  private boolean atInjectRequired = false;
  private boolean exactBindingAnnotationsRequired = false;

  InjectorOptionsProcessor(Errors errors) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `core/src/com/google/inject/internal/CycleDetectingLock.java`
#### Snippet
```java
       * CycleDetectingLockFactory.this}.
       */
      private int lockReentranceCount = 0;

      ReentrantCycleDetectingLock(
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `core/src/com/google/inject/internal/CycleDetectingLock.java`
#### Snippet
```java
       * Thread that owns this lock. Nullable. Guarded by {@code CycleDetectingLockFactory.this}.
       */
      private Thread lockOwnerThread = null;

      /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `core/src/com/google/inject/internal/Initializer.java`
#### Snippet
```java
  private static class InjectableReference<T> implements Initializable<T> {
    private volatile InjectableReferenceState state = InjectableReferenceState.NEW;
    private volatile MembersInjectorImpl<T> membersInjector = null;

    private final InjectorImpl injector;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `core/src/com/google/inject/internal/Initializer.java`
#### Snippet
```java

  /** Is set to true once {@link #validateOustandingInjections} is called. */
  private volatile boolean validationStarted = false;

  /**
```

## RuleId[id=EqualsAndHashcode]
### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `extensions/grapher/src/com/google/inject/grapher/InterfaceNode.java`
#### Snippet
```java
 * @since 4.0 (since 2.0 as an interface)
 */
public class InterfaceNode extends Node {
  public InterfaceNode(NodeId id, Object source) {
    super(id, source);
```

## RuleId[id=RedundantImplements]
### RedundantImplements
Redundant interface declaration `Binder`
in `core/src/com/google/inject/spi/Elements.java`
#### Snippet
```java
  }

  private static class RecordingBinder implements Binder, PrivateBinder {
    private final Stage stage;
    private final Map<Module, ModuleInfo> modules;
```

### RedundantImplements
Redundant interface declaration `HasDependencies`
in `core/src/com/google/inject/internal/ProviderMethod.java`
#### Snippet
```java
 */
public abstract class ProviderMethod<T> extends InternalProviderInstanceBindingImpl.CyclicFactory<T>
    implements HasDependencies, ProvidesMethodBinding<T>, ProviderWithExtensionVisitor<T> {

  /**
```

### RedundantImplements
Redundant interface declaration `Serializable`
in `core/src/com/google/inject/internal/GenericErrorDetail.java`
#### Snippet
```java
/** Generic error message representing a Guice internal error. */
public final class GenericErrorDetail extends InternalErrorDetail<GenericErrorDetail>
    implements Serializable {
  public GenericErrorDetail(
      ErrorId errorId, String message, List<Object> sources, Throwable cause) {
```

## RuleId[id=InstanceofCatchParameter]
### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `extensions/throwingproviders/src/com/google/inject/throwingproviders/ThrowingProviderBinder.java`
#### Snippet
```java
            }

            if (e instanceof RuntimeException) {
              throw (RuntimeException) e;
            } else {
```

## RuleId[id=NonStaticFinalLogger]
### NonStaticFinalLogger
Non-constant logger field `logger`
in `core/src/com/google/inject/internal/util/ContinuousStopwatch.java`
#### Snippet
```java
@NotThreadSafe
public final class ContinuousStopwatch {
  private final Logger logger = Logger.getLogger(ContinuousStopwatch.class.getName());
  private final Stopwatch stopwatch;

```

## RuleId[id=NonFinalFieldOfException]
### NonFinalFieldOfException
Non-final field `partialValue` of exception class
in `core/src/com/google/inject/ConfigurationException.java`
#### Snippet
```java

  private final com.google.common.collect.ImmutableSet<Message> messages;
  private Object partialValue = null;

  /** Creates a ConfigurationException containing {@code messages}. */
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `extensions/persist/src/com/google/inject/persist/jpa/JpaPersistModule.java`
#### Snippet
```java
                  @Override
                  public Object[] getArguments() {
                    return null == args ? new Object[0] : args;
                  }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `core/src/com/google/inject/internal/aop/EnhancerBuilderImpl.java`
#### Snippet
```java

    this.hostClass = hostClass;
    this.enhanceableMethods = enhanceableMethods.toArray(new Method[0]);
    this.bridgeDelegates = ImmutableMap.copyOf(bridgeDelegates);
  }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `core/src/com/google/inject/internal/aop/ClassBuilding.java`
#### Snippet
```java
        });

    return objectMethods.toArray(new Method[0]);
  }

```

## RuleId[id=SynchronizeOnThis]
### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `extensions/struts2/src/com/google/inject/struts2/GuiceObjectFactory.java`
#### Snippet
```java
    Class<?> clazz = super.getClassInstance(name);

    synchronized (this) {
      if (injector == null) {
        // We can only bind each class once.
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `extensions/struts2/src/com/google/inject/struts2/GuiceObjectFactory.java`
#### Snippet
```java
  public Object buildBean(Class clazz, Map<String, Object> extraContext) {
    if (injector == null) {
      synchronized (this) {
        if (injector == null) {
          createInjector();
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `extensions/struts2/src/com/google/inject/struts2/Struts2Factory.java`
#### Snippet
```java
    Class<?> clazz = super.getClassInstance(name);

    synchronized (this) {
      if (strutsInjector == null) {
        // We can only bind each class once.
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `extensions/struts2/src/com/google/inject/struts2/Struts2Factory.java`
#### Snippet
```java
    interceptors.add(providedInterceptor);
    if (strutsInjector != null) {
      synchronized (this) {
        if (strutsInjector != null) {
          providedInterceptor.inject();
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `extensions/struts2/src/com/google/inject/struts2/Struts2Factory.java`
#### Snippet
```java
  public Object buildBean(Class clazz, Map<String, Object> extraContext) {
    if (strutsInjector == null) {
      synchronized (this) {
        if (strutsInjector == null) {
          createInjector();
```

### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `core/src/com/google/inject/internal/CycleDetectingLock.java`
#### Snippet
```java
      public ListMultimap<Thread, ID> lockOrDetectPotentialLocksCycle() {
        final Thread currentThread = Thread.currentThread();
        synchronized (CycleDetectingLockFactory.class) {
          checkState();
          // Add this lock to the waiting map to ensure it is included in any reported lock cycle.
```

### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `core/src/com/google/inject/internal/CycleDetectingLock.java`
#### Snippet
```java
        lockImplementation.lock();

        synchronized (CycleDetectingLockFactory.class) {
          // current thread is no longer waiting on this lock
          lockThreadIsWaitingOn.remove(currentThread);
```

### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `core/src/com/google/inject/internal/CycleDetectingLock.java`
#### Snippet
```java
      public void unlock() {
        final Thread currentThread = Thread.currentThread();
        synchronized (CycleDetectingLockFactory.class) {
          checkState();
          Preconditions.checkState(
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `extensions/assistedinject/src/com/google/inject/assistedinject/Parameter.java`
#### Snippet
```java
  public Object getValue(Injector injector) {
    if (null == provider) {
      synchronized (this) {
        if (null == provider) {
          provider =
```

## RuleId[id=TypeParameterExtendsObject]
### TypeParameterExtendsObject
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `core/src/com/google/inject/internal/Indexer.java`
#### Snippet
```java

  @Override
  public Indexer.IndexedBinding visit(ExposedBinding<? extends Object> binding) {
    return new Indexer.IndexedBinding(binding, BindingType.EXPOSED, scope(binding), binding);
  }
```

### TypeParameterExtendsObject
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `core/src/com/google/inject/internal/Indexer.java`
#### Snippet
```java

  @Override
  public Indexer.IndexedBinding visit(ConstructorBinding<? extends Object> binding) {
    return new Indexer.IndexedBinding(
        binding, BindingType.CONSTRUCTOR, scope(binding), binding.getConstructor());
```

### TypeParameterExtendsObject
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `core/src/com/google/inject/internal/Indexer.java`
#### Snippet
```java

  @Override
  public Indexer.IndexedBinding visit(InstanceBinding<? extends Object> binding) {
    return new Indexer.IndexedBinding(
        binding, BindingType.INSTANCE, scope(binding), binding.getInstance());
```

### TypeParameterExtendsObject
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `core/src/com/google/inject/internal/Indexer.java`
#### Snippet
```java

  @Override
  public Indexer.IndexedBinding visit(ProviderKeyBinding<? extends Object> binding) {
    return new Indexer.IndexedBinding(
        binding, BindingType.PROVIDER_KEY, scope(binding), binding.getProviderKey());
```

### TypeParameterExtendsObject
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `core/src/com/google/inject/internal/Indexer.java`
#### Snippet
```java

  @Override
  public Indexer.IndexedBinding visit(ProviderBinding<? extends Object> binding) {
    return new Indexer.IndexedBinding(
        binding,
```

### TypeParameterExtendsObject
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `core/src/com/google/inject/internal/Indexer.java`
#### Snippet
```java

  @Override
  public Indexer.IndexedBinding visit(ProviderInstanceBinding<? extends Object> binding) {
    return new Indexer.IndexedBinding(
        binding, BindingType.PROVIDER_INSTANCE, scope(binding), binding.getUserSuppliedProvider());
```

### TypeParameterExtendsObject
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `core/src/com/google/inject/internal/Indexer.java`
#### Snippet
```java

  @Override
  public Indexer.IndexedBinding visit(LinkedKeyBinding<? extends Object> binding) {
    return new Indexer.IndexedBinding(
        binding, BindingType.LINKED_KEY, scope(binding), binding.getLinkedKey());
```

### TypeParameterExtendsObject
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `core/src/com/google/inject/internal/Indexer.java`
#### Snippet
```java

  @Override
  public Indexer.IndexedBinding visit(UntargettedBinding<? extends Object> binding) {
    return new Indexer.IndexedBinding(binding, BindingType.UNTARGETTED, scope(binding), null);
  }
```

### TypeParameterExtendsObject
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `core/src/com/google/inject/internal/Indexer.java`
#### Snippet
```java

  @Override
  public Indexer.IndexedBinding visit(ConvertedConstantBinding<? extends Object> binding) {
    return new Indexer.IndexedBinding(
        binding, BindingType.CONSTANT, scope(binding), binding.getValue());
```

### TypeParameterExtendsObject
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `extensions/assistedinject/src/com/google/inject/assistedinject/Parameter.java`
#### Snippet
```java
  private final boolean isProvider;

  private volatile Provider<? extends Object> provider;

  public Parameter(Type type, Annotation[] annotations) {
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `factory` initializer `null` is redundant
in `core/src/com/google/inject/internal/ConstructorInjectorStore.java`
#### Snippet
```java
        (MembersInjectorImpl<T>)
            injector.membersInjectorStore.get(injectionPoint.getDeclaringType(), errors);
    ConstructionProxyFactory<T> factory = null;
    if (InternalFlags.isBytecodeGenEnabled()) {
      ImmutableList<InterceptorBinding> injectorBindings =
```

## RuleId[id=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `core/src/com/google/inject/internal/PackageNameCompressor.java`
#### Snippet
```java
    StringBuilder legendBuilder = new StringBuilder();
    // Find the longest key for building the legend
    int longestKey = replacementMap.keySet().stream().max(comparing(String::length)).get().length();
    for (Map.Entry<String, String> entry : replacementMap.entrySet()) {
      String shortName = entry.getKey();
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `prev != null` is always `true`
in `extensions/grapher/src/com/google/inject/grapher/AbstractInjectorGrapher.java`
#### Snippet
```java

      Set<NodeId> prev = inverse.get(from);
      if (prev != null) {
        for (NodeId id : prev) {
          resolved.remove(id);
```

### ConstantValue
Condition `member.getDeclaringClass().getDeclaredField(member.getName()) != null` is always `true`
in `core/src/com/google/inject/spi/InjectionPoint.java`
#### Snippet
```java
    if (member instanceof Method) {
      try {
        if (member.getDeclaringClass().getDeclaredField(member.getName()) != null) {
          return false;
        }
```

### ConstantValue
Condition `shellBuilder == null` is always `false`
in `core/src/com/google/inject/internal/InternalInjectorCreator.java`
#### Snippet
```java

  public Injector build() {
    if (shellBuilder == null) {
      throw new AssertionError("Already built, builders are not reusable.");
    }
```

## RuleId[id=StringConcatenationInsideStringBufferAppend]
### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `extensions/grapher/src/com/google/inject/grapher/graphviz/GraphvizGrapher.java`
#### Snippet
```java

    html.append("<tr>").append("<td align=\"left\" port=\"header\" ");
    html.append("bgcolor=\"" + node.getHeaderBackgroundColor() + "\">");

    String subtitle = Joiner.on("<br align=\"left\"/>").join(node.getSubtitles());
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `extensions/grapher/src/com/google/inject/grapher/graphviz/GraphvizGrapher.java`
#### Snippet
```java
    }

    html.append("<font color=\"" + node.getHeaderTextColor() + "\">");
    html.append(htmlEscape(node.getTitle())).append("<br align=\"left\"/>");
    html.append("</font>").append("</td>").append("</tr>");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `core/src/com/google/inject/util/Modules.java`
#### Snippet
```java
                  new StringBuilder(
                      "The scope for @%s is bound directly and cannot be overridden.");
              sb.append("%n     original binding at " + Errors.convert(scopeBinding.getSource()));
              for (Object usedSource : usedSources) {
                sb.append("%n     bound directly at " + Errors.convert(usedSource) + "");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `core/src/com/google/inject/util/Modules.java`
#### Snippet
```java
              sb.append("%n     original binding at " + Errors.convert(scopeBinding.getSource()));
              for (Object usedSource : usedSources) {
                sb.append("%n     bound directly at " + Errors.convert(usedSource) + "");
              }
              binder
```

## RuleId[id=OptionalIsPresent]
### OptionalIsPresent
Can be replaced with single expression in functional style
in `core/src/com/google/inject/spi/BindingSourceRestriction.java`
#### Snippet
```java
          public <T> ImmutableList<Message> visit(Binding<T> binding) {
            Optional<Message> errorMessage = check(binding);
            if (errorMessage.isPresent()) {
              return ImmutableList.of(errorMessage.get());
            }
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `core/src/com/google/inject/internal/InjectorJitBindingData.java`
#### Snippet
```java
   */
  void banKeyInParent(Key<?> key, InjectorBindingData injectorBindingData, Object source) {
    if (parent.isPresent()) {
      parent.get().banKey(key, injectorBindingData, source);
    }
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `core/src/com/google/inject/internal/InjectorBindingData.java`
#### Snippet
```java

  public ImmutableList<TypeListenerBinding> getTypeListenerBindings() {
    if (parent.isPresent()) {
      return new ImmutableList.Builder<TypeListenerBinding>()
          .addAll(parent.get().getTypeListenerBindings())
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `core/src/com/google/inject/internal/InjectorBindingData.java`
#### Snippet
```java

  public ImmutableList<ModuleAnnotatedMethodScannerBinding> getScannerBindings() {
    if (parent.isPresent()) {
      return new ImmutableList.Builder<ModuleAnnotatedMethodScannerBinding>()
          .addAll(parent.get().getScannerBindings())
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `core/src/com/google/inject/internal/InjectorBindingData.java`
#### Snippet
```java

  public ImmutableList<ProvisionListenerBinding> getProvisionListenerBindings() {
    if (parent.isPresent()) {
      return new ImmutableList.Builder<ProvisionListenerBinding>()
          .addAll(parent.get().getProvisionListenerBindings())
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `core/src/com/google/inject/internal/InjectorBindingData.java`
#### Snippet
```java

  public ImmutableList<InterceptorBinding> getInterceptorBindings() {
    if (parent.isPresent()) {
      return new ImmutableList.Builder<InterceptorBinding>()
          .addAll(parent.get().getInterceptorBindings())
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `Keys` has only 'static' members, and lacks a 'private' constructor
in `extensions/dagger-adapter/src/com/google/inject/daggeradapter/Keys.java`
#### Snippet
```java

/** Utility methods for creating {@link Key}s. */
final class Keys {
  static Key<?> parameterKey(Parameter parameter) {
    Optional<Annotation> qualifier = getAnnotatedAnnotation(parameter, Qualifier.class);
```

### UtilityClassWithoutPrivateConstructor
Class `SupportedAnnotations` has only 'static' members, and lacks a 'private' constructor
in `extensions/dagger-adapter/src/com/google/inject/daggeradapter/SupportedAnnotations.java`
#### Snippet
```java

/** Collections of annotations that are supported by {@link DaggerAdapter}. */
final class SupportedAnnotations {
  static final ImmutableSet<Class<? extends Annotation>> BINDING_ANNOTATIONS =
      ImmutableSet.of(Provides.class, Binds.class, Multibinds.class, BindsOptionalOf.class);
```

### UtilityClassWithoutPrivateConstructor
Class `Annotations` has only 'static' members, and lacks a 'private' constructor
in `extensions/dagger-adapter/src/com/google/inject/daggeradapter/Annotations.java`
#### Snippet
```java

/** Extensions for {@link Annotation}. */
final class Annotations {
  static Optional<Annotation> getAnnotatedAnnotation(
      AnnotatedElement element, Class<? extends Annotation> annotationClass) {
```

### UtilityClassWithoutPrivateConstructor
Class `Elements` has only 'static' members, and lacks a 'private' constructor
in `core/src/com/google/inject/spi/Elements.java`
#### Snippet
```java
 * @since 2.0
 */
public final class Elements {

  private static final BindingTargetVisitor<Object, Object> GET_INSTANCE_VISITOR =
```

### UtilityClassWithoutPrivateConstructor
Class `Initializables` has only 'static' members, and lacks a 'private' constructor
in `core/src/com/google/inject/internal/Initializables.java`
#### Snippet
```java

/** @author jessewilson@google.com (Jesse Wilson) */
final class Initializables {

  /** Returns an initializable for an instance that requires no initialization. */
```

### UtilityClassWithoutPrivateConstructor
Class `Annotations` has only 'static' members, and lacks a 'private' constructor
in `core/src/com/google/inject/internal/Annotations.java`
#### Snippet
```java
 * @author crazybob@google.com (Bob Lee)
 */
public class Annotations {

  /** Returns {@code true} if the given annotation type has no attributes. */
```

### UtilityClassWithoutPrivateConstructor
Class `BytecodeGen` has only 'static' members, and lacks a 'private' constructor
in `core/src/com/google/inject/internal/BytecodeGen.java`
#### Snippet
```java
 * @author jessewilson@google.com (Jesse Wilson)
 */
public final class BytecodeGen {

  private static final Map<Class<?>, Boolean> circularProxyTypeCache =
```

### UtilityClassWithoutPrivateConstructor
Class `Classes` has only 'static' members, and lacks a 'private' constructor
in `core/src/com/google/inject/internal/util/Classes.java`
#### Snippet
```java

/** Class utilities. */
public final class Classes {

  public static boolean isInnerClass(Class<?> clazz) {
```

### UtilityClassWithoutPrivateConstructor
Class `Manager` has only 'static' members, and lacks a 'private' constructor
in `extensions/jmx/src/com/google/inject/tools/jmx/Manager.java`
#### Snippet
```java
 * @author crazybob@google.com (Bob Lee)
 */
public class Manager {

  /**
```

### UtilityClassWithoutPrivateConstructor
Class `PrivateLookup` has only 'static' members, and lacks a 'private' constructor
in `extensions/assistedinject/src/com/google/inject/assistedinject/FactoryProvider2.java`
#### Snippet
```java
  // Note: this isn't a public API, but we need to use it in order to call default methods on (or
  // with) non-public types. If it doesn't exist, the code falls back to a less precise check.
  static class PrivateLookup {
    PrivateLookup() {}

```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Dereference of `notification.getValue()` may produce `NullPointerException`
in `core/src/com/google/inject/internal/WeakKeySet.java`
#### Snippet
```java
    // that's relevant.
    synchronized (lock) {
      for (KeyAndSource keyAndSource : notification.getValue()) {
        Multiset<Object> set = backingMap.get(keyAndSource.key);
        if (set != null) {
```

### DataFlowIssue
Method invocation `get` may produce `NullPointerException`
in `extensions/testlib/src/com/google/inject/testing/throwingproviders/CheckedProviderSubject.java`
#### Snippet
```java
    T got;
    try {
      got = provider.get();
    } catch (Throwable e) {
      return check("get()'s exception").that(e);
```

### DataFlowIssue
Method invocation `get` may produce `NullPointerException`
in `extensions/testlib/src/com/google/inject/testing/throwingproviders/CheckedProviderSubject.java`
#### Snippet
```java
    T got;
    try {
      got = provider.get();
    } catch (Exception e) {
      failWithCauseAndMessage(e, "checked provider was not expected to throw an exception");
```

### DataFlowIssue
Method invocation `invokeWithArguments` may produce `NullPointerException`
in `extensions/assistedinject/src/com/google/inject/assistedinject/FactoryProvider2.java`
#### Snippet
```java
    // can call the default method implementation (and not our proxied version of it).
    if (methodHandleByMethod.containsKey(method)) {
      return methodHandleByMethod.get(method).invokeWithArguments(args);
    }

```

### DataFlowIssue
Argument `dataSoFar.get(otherMethod)` might be null
in `extensions/assistedinject/src/com/google/inject/assistedinject/FactoryProvider2.java`
#### Snippet
```java
                break;
              } else {
                assistDataBuilder.put(defaultMethod, dataSoFar.get(otherMethod));
                foundMatch = true;
              }
```

### DataFlowIssue
Method invocation `get` may produce `NullPointerException`
in `extensions/throwingproviders/src/com/google/inject/throwingproviders/ThrowingProviderBinder.java`
#### Snippet
```java
            public T get() throws Exception {
              try {
                return typeProvider.get();
              } catch (ProvisionException pe) {
                // Rethrow the provision cause as the actual exception
```

### DataFlowIssue
Method invocation `getUserSuppliedProvider` may produce `NullPointerException`
in `core/src/com/google/inject/internal/RealMapBinder.java`
#### Snippet
```java
      @SuppressWarnings("unchecked")
      ExtensionRealMapProvider<K, V> mapProvider =
          (ExtensionRealMapProvider<K, V>) providerInstanceBinding.getUserSuppliedProvider();

      this.bindingSelection = mapProvider.getBindingSelection();
```

### DataFlowIssue
Argument `bindingSelection.getMapBindings().get(key)` might be null
in `core/src/com/google/inject/internal/RealMapBinder.java`
#### Snippet
```java

        if (value == null) {
          throw createNullValueException(key, bindingSelection.getMapBindings().get(key));
        }

```

### DataFlowIssue
Method invocation `acceptTargetVisitor` may produce `NullPointerException`
in `core/src/com/google/inject/internal/RealMapBinder.java`
#### Snippet
```java
          // Guice deduplication, so we need to re-implement our own here, ignoring
          // uniqueId.
          if (index.put(key, valueBinding.acceptTargetVisitor(indexer))) {

            entriesBuilder.add(Maps.immutableEntry(key, valueBinding));
```

### DataFlowIssue
Argument `injectors` might be null
in `core/src/com/google/inject/internal/RealMapBinder.java`
#### Snippet
```java
                  injector.getParametersInjectors(dependenciesForKey, errors);

          perKeyDatas[i] = new PerKeyData<>(entry.getKey(), bindingsArray, injectors);
          i++;
        }
```

### DataFlowIssue
Method invocation `getSource` may produce `NullPointerException`
in `core/src/com/google/inject/internal/RealMapBinder.java`
#### Snippet
```java
          for (Key<V> key : keysOnlyFromBindings) {
            sb.append(
                Errors.format("  %s bound at: %s%n", key, valueKeyToBinding.get(key).getSource()));
          }
        }
```

### DataFlowIssue
Method invocation `getSource` may produce `NullPointerException`
in `core/src/com/google/inject/internal/RealMapBinder.java`
#### Snippet
```java
                Errors.format(
                    "  '%s' bound at: %s%n",
                    valueKeyToKey.get(key), valueKeyToEntryBinding.get(key).getSource()));
          }
        }
```

### DataFlowIssue
Method invocation `getProvider` may produce `NullPointerException`
in `core/src/com/google/inject/internal/RealMapBinder.java`
#### Snippet
```java
    void initialize(InjectorImpl injector, Errors errors) {
      Binding<V> valueBinding = injector.getExistingBinding(valueKey);
      entry = Maps.immutableEntry(key, valueBinding.getProvider());
    }

```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `core/src/com/google/inject/RestrictedBindingSource.java`
#### Snippet
```java
  public static enum RestrictionLevel {
    WARNING,
    ERROR;
  }

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `core/src/com/google/inject/internal/Element.java`
#### Snippet
```java
  enum Type {
    MAPBINDER,
    MULTIBINDER;
  }

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `core/src/com/google/inject/internal/ErrorId.java`
#### Snippet
```java

  // All other uncommon type of errors
  OTHER;
}

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `core/src/com/google/inject/internal/InternalProviderInstanceBindingImpl.java`
#### Snippet
```java
     * conditionally consume jit bindings created by other other bindings.
     */
    DELAYED;
  }

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `extensions/assistedinject/src/com/google/inject/assistedinject/FactoryProvider2.java`
#### Snippet
```java
    abstract MethodHandle superMethodHandle(Method method, MethodHandles.Lookup lookup)
        throws ReflectiveOperationException;
  };

  // Note: this isn't a public API, but we need to use it in order to call default methods on (or
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `core/src/com/google/inject/internal/RealMapBinder.java`
#### Snippet
```java
      UNINITIALIZED,
      INITIALIZED,
      HAS_ERRORS;
    }

```

## RuleId[id=TypeParameterHidesVisibleType]
### TypeParameterHidesVisibleType
Type parameter `T` hides type parameter 'T'
in `core/src/com/google/inject/spi/MembersInjectorLookup.java`
#### Snippet
```java

  @Override
  public <T> T acceptVisitor(ElementVisitor<T> visitor) {
    return visitor.visit(this);
  }
```

### TypeParameterHidesVisibleType
Type parameter `T` hides type parameter 'T'
in `core/src/com/google/inject/spi/ProviderLookup.java`
#### Snippet
```java

  @Override
  public <T> T acceptVisitor(ElementVisitor<T> visitor) {
    return visitor.visit(this);
  }
```

### TypeParameterHidesVisibleType
Type parameter `T` hides type parameter 'T'
in `core/src/com/google/inject/internal/EncounterImpl.java`
#### Snippet
```java

  @Override
  public <T> Provider<T> getProvider(Class<T> type) {
    return getProvider(Key.get(type));
  }
```

### TypeParameterHidesVisibleType
Type parameter `T` hides type parameter 'T'
in `core/src/com/google/inject/internal/EncounterImpl.java`
#### Snippet
```java

  @Override
  public <T> MembersInjector<T> getMembersInjector(TypeLiteral<T> typeLiteral) {
    checkState(valid, "Encounters may not be used after hear() returns.");
    return lookups.getMembersInjector(typeLiteral);
```

### TypeParameterHidesVisibleType
Type parameter `T` hides type parameter 'T'
in `core/src/com/google/inject/internal/EncounterImpl.java`
#### Snippet
```java

  @Override
  public <T> Provider<T> getProvider(Key<T> key) {
    checkState(valid, "Encounters may not be used after hear() returns.");
    return lookups.getProvider(key);
```

### TypeParameterHidesVisibleType
Type parameter `T` hides type parameter 'T'
in `core/src/com/google/inject/internal/EncounterImpl.java`
#### Snippet
```java

  @Override
  public <T> MembersInjector<T> getMembersInjector(Class<T> type) {
    return getMembersInjector(TypeLiteral.get(type));
  }
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'ThrowingProvider' is still used
in `extensions/throwingproviders/src/com/google/inject/throwingproviders/ThrowingProvider.java`
#### Snippet
```java
 */
@Deprecated
public interface ThrowingProvider<T, E extends Exception> extends CheckedProvider<T> {
  @Override
  T get() throws E;
```

### DeprecatedIsStillUsed
Deprecated member 'continueRequest' is still used
in `extensions/servlet/src/com/google/inject/servlet/ServletScopes.java`
#### Snippet
```java
   */
  @Deprecated
  public static <T> Callable<T> continueRequest(Callable<T> callable, Map<Key<?>, Object> seedMap) {
    return wrap(callable, continueRequest(seedMap));
  }
```

### DeprecatedIsStillUsed
Deprecated member 'combine' is still used
in `core/src/com/google/inject/util/Modules.java`
#### Snippet
```java
  /** @deprecated there's no need to "combine" one module; just install it directly. */
  @Deprecated
  public static Module combine(Module module) {
    return module;
  }
```

### DeprecatedIsStillUsed
Deprecated member 'asModule' is still used
in `core/src/com/google/inject/multibindings/MultibindingsScanner.java`
#### Snippet
```java
   */
  @Deprecated
  public static Module asModule() {
    return Modules.EMPTY_MODULE;
  }
```

### DeprecatedIsStillUsed
Deprecated member 'MultibindingsScanner' is still used
in `core/src/com/google/inject/multibindings/MultibindingsScanner.java`
#### Snippet
```java
 */
@Deprecated
public class MultibindingsScanner {
  private MultibindingsScanner() {}

```

### DeprecatedIsStillUsed
Deprecated member 'getProviderInstance' is still used
in `core/src/com/google/inject/spi/ProviderInstanceBinding.java`
#### Snippet
```java
   */
  @Deprecated
  Provider<? extends T> getProviderInstance();

  /**
```

### DeprecatedIsStillUsed
Deprecated member 'FactoryProvider' is still used
in `extensions/assistedinject/src/com/google/inject/assistedinject/FactoryProvider.java`
#### Snippet
```java
 */
@Deprecated
public class FactoryProvider<F> implements Provider<F>, HasDependencies {

  /*
```

### DeprecatedIsStillUsed
Deprecated member 'bind' is still used
in `extensions/throwingproviders/src/com/google/inject/throwingproviders/ThrowingProviderBinder.java`
#### Snippet
```java
  /** @deprecated Use {@link #bind(Class, Class)} or {@link #bind(Class, TypeLiteral)} instead. */
  @Deprecated
  public <P extends CheckedProvider> SecondaryBinder<P, ?> bind(
      Class<P> interfaceType, Type clazz) {
    return new SecondaryBinder<P, Object>(interfaceType, clazz);
```

## RuleId[id=Convert2MethodRef]
### Convert2MethodRef
Lambda can be replaced with method reference
in `core/src/com/google/inject/internal/RealMultibinder.java`
#### Snippet
```java
    RealMultibinderProvider(BindingSelection<T> bindingSelection) {
      // Note: method reference doesn't work for the 2nd arg for some reason when compiling on java8
      super(bindingSelection, bs -> bs.getDependencies());
    }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `core/src/com/google/inject/internal/RealMultibinder.java`
#### Snippet
```java
    ExtensionRealMultibinderProvider(RealMultibinderProvider<T> delegate) {
      // Note: method reference doesn't work for the 2nd arg for some reason when compiling on java8
      super(delegate.bindingSelection, bs -> bs.getDependencies());
      this.delegate = delegate;
    }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `core/src/com/google/inject/internal/RealMultibinder.java`
#### Snippet
```java
    RealMultibinderCollectionOfProvidersProvider(BindingSelection<T> bindingSelection) {
      // Note: method reference doesn't work for the 2nd arg for some reason when compiling on java8
      super(bindingSelection, bs -> bs.getProviderDependencies());
    }

```

## RuleId[id=JavaReflectionMemberAccess]
### JavaReflectionMemberAccess
Cannot resolve method 'defineHiddenClass'
in `core/src/com/google/inject/internal/aop/HiddenClassDefiner.java`
#### Snippet
```java
      HIDDEN_DEFINE_METHOD =
          Lookup.class.getMethod(
              "defineHiddenClass", byte[].class, boolean.class, HIDDEN_CLASS_OPTIONS.getClass());
    } catch (ReflectiveOperationException e) {
      throw new ExceptionInInitializerError(e);
```

### JavaReflectionMemberAccess
Cannot resolve constructor with specified argument types
in `extensions/assistedinject/src/com/google/inject/assistedinject/FactoryProvider2.java`
#### Snippet
```java
        } catch (NoSuchMethodException ignored) {
          cxtor =
              MethodHandles.Lookup.class.getDeclaredConstructor(
                  Class.class, Class.class, int.class);
        }
        cxtor.setAccessible(true);
```

## RuleId[id=NonSerializableFieldInSerializableClass]
### NonSerializableFieldInSerializableClass
Non-serializable field 'partialValue' in a Serializable class
in `core/src/com/google/inject/ConfigurationException.java`
#### Snippet
```java

  private final com.google.common.collect.ImmutableSet<Message> messages;
  private Object partialValue = null;

  /** Creates a ConfigurationException containing {@code messages}. */
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'value' in a Serializable class
in `core/src/com/google/inject/matcher/Matchers.java`
#### Snippet
```java

  private static class Only extends AbstractMatcher<Object> implements Serializable {
    private final Object value;

    public Only(Object value) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'value' in a Serializable class
in `core/src/com/google/inject/matcher/Matchers.java`
#### Snippet
```java

  private static class IdenticalTo extends AbstractMatcher<Object> implements Serializable {
    private final Object value;

    public IdenticalTo(Object value) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'source' in a Serializable class
in `core/src/com/google/inject/internal/Errors.java`
#### Snippet
```java

  /** The leaf source for errors added here. */
  private final Object source;

  /** null unless (root == this) and error messages exist. Never an empty list. */
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'type' in a Serializable class
in `core/src/com/google/inject/internal/MissingConstructorError.java`
#### Snippet
```java
/** Error reported when Guice can't find an useable constructor to create objects. */
final class MissingConstructorError extends InternalErrorDetail<MissingConstructorError> {
  private final TypeLiteral<?> type;
  private final boolean atInjectRequired;

```

### NonSerializableFieldInSerializableClass
Non-serializable field 'setKey' in a Serializable class
in `core/src/com/google/inject/internal/DuplicateElementError.java`
#### Snippet
```java
 */
final class DuplicateElementError<T> extends InternalErrorDetail<DuplicateElementError<T>> {
  private final Key<Set<T>> setKey;
  private final ImmutableMultimap<T, Element<T>> elements;

```

### NonSerializableFieldInSerializableClass
Non-serializable field 'key' in a Serializable class
in `core/src/com/google/inject/internal/MissingImplementationError.java`
#### Snippet
```java
    extends InternalErrorDetail<MissingImplementationError<T>> {

  private final Key<T> key;
  private final ImmutableList<String> suggestions;

```

### NonSerializableFieldInSerializableClass
Non-serializable field 'key' in a Serializable class
in `core/src/com/google/inject/internal/ChildBindingAlreadySetError.java`
#### Snippet
```java
 */
final class ChildBindingAlreadySetError extends InternalErrorDetail<ChildBindingAlreadySetError> {
  private final Key<?> key;
  private final ImmutableList<Object> existingSources;

```

### NonSerializableFieldInSerializableClass
Non-serializable field 'mapKey' in a Serializable class
in `core/src/com/google/inject/internal/DuplicateMapKeyError.java`
#### Snippet
```java
 */
final class DuplicateMapKeyError<K, V> extends InternalErrorDetail<DuplicateMapKeyError<K, V>> {
  private final Key<Map<K, V>> mapKey;
  private final Multimap<K, Binding<V>> duplicates;

```

### NonSerializableFieldInSerializableClass
Non-serializable field 'value' in a Serializable class
in `extensions/throwingproviders/src/com/google/inject/throwingproviders/ThrowingProviderBinder.java`
#### Snippet
```java
    private static final long serialVersionUID = 0L;

    private final Object value;
    private final Exception exception;

```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `core/src/com/google/inject/internal/RealMultibinder.java`
#### Snippet
```java
      if (local == null) {
        local =
            permitDuplicatesKey = Key.get(Boolean.class, named(toString() + " permits duplicates"));
      }
      return local;
```

## RuleId[id=AssignmentToForLoopParameter]
### AssignmentToForLoopParameter
Assignment to for-loop parameter `index`
in `extensions/persist/src/com/google/inject/persist/jpa/JpaFinderProxy.java`
#### Snippet
```java
        //bind it as a raw param (1-based index, yes I know its different from Hibernate, blargh)
        jpaQuery.setParameter(index, argument);
        index++;
      } else if (annotation instanceof FirstResult) {
        jpaQuery.setFirstResult((Integer) argument);
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `srcPos`
in `extensions/servlet/src/com/google/inject/servlet/ServletUtils.java`
#### Snippet
```java
            if (encoded >= 0) {
              accumulator.append((byte) encoded);
              srcPos += 2;
              processed = true;
            }
```

## RuleId[id=StringEqualsEmptyString]
### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `extensions/persist/src/com/google/inject/persist/jpa/JpaFinderProxy.java`
#### Snippet
```java
    Finder finder = invocation.getMethod().getAnnotation(Finder.class);
    String query = finder.query();
    if (!"".equals(query.trim())) {
      finderDescriptor.setQuery(query);
    } else {
```

## RuleId[id=PublicFieldAccessedInSynchronizedContext]
### PublicFieldAccessedInSynchronizedContext
Non-private field `injector` accessed in synchronized context
in `extensions/struts2/src/com/google/inject/struts2/GuiceObjectFactory.java`
#### Snippet
```java

    synchronized (this) {
      if (injector == null) {
        // We can only bind each class once.
        if (!boundClasses.contains(clazz)) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `boundClasses` accessed in synchronized context
in `extensions/struts2/src/com/google/inject/struts2/GuiceObjectFactory.java`
#### Snippet
```java
      if (injector == null) {
        // We can only bind each class once.
        if (!boundClasses.contains(clazz)) {
          try {
            // Calling these methods now helps us detect ClassNotFoundErrors
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `boundClasses` accessed in synchronized context
in `extensions/struts2/src/com/google/inject/struts2/GuiceObjectFactory.java`
#### Snippet
```java
            clazz.getDeclaredMethods();

            boundClasses.add(clazz);
          } catch (Throwable t) {
            // Struts should still work even though some classes aren't in the
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `injector` accessed in synchronized context
in `extensions/struts2/src/com/google/inject/struts2/GuiceObjectFactory.java`
#### Snippet
```java
    if (injector == null) {
      synchronized (this) {
        if (injector == null) {
          createInjector();
        }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `boundClasses` accessed in synchronized context
in `extensions/struts2/src/com/google/inject/struts2/Struts2Factory.java`
#### Snippet
```java
      if (strutsInjector == null) {
        // We can only bind each class once.
        if (!boundClasses.contains(clazz)) {
          try {
            // Calling these methods now helps us detect ClassNotFoundErrors
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `boundClasses` accessed in synchronized context
in `extensions/struts2/src/com/google/inject/struts2/Struts2Factory.java`
#### Snippet
```java
            clazz.getDeclaredMethods();

            boundClasses.add(clazz);
          } catch (Throwable t) {
            // Struts should still work even though some classes aren't in the
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `this.binder` accessed in synchronized context
in `core/src/com/google/inject/AbstractModule.java`
#### Snippet
```java
  @Override
  public final synchronized void configure(Binder builder) {
    checkState(this.binder == null, "Re-entry is not allowed.");

    this.binder = checkNotNull(builder, "builder");
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `this.binder` accessed in synchronized context
in `core/src/com/google/inject/AbstractModule.java`
#### Snippet
```java
    checkState(this.binder == null, "Re-entry is not allowed.");

    this.binder = checkNotNull(builder, "builder");
    try {
      configure();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `this.binder` accessed in synchronized context
in `core/src/com/google/inject/AbstractModule.java`
#### Snippet
```java
      configure();
    } finally {
      this.binder = null;
    }
  }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `instance` accessed in synchronized context
in `core/src/com/google/inject/internal/SingletonScope.java`
#### Snippet
```java
                  synchronized (constructionContext) {
                    // guarantee thread-safety for instance and proxies initialization
                    instance = providedNotNull;
                    constructionContext.setProxyDelegates(provided);
                  }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `instance` accessed in synchronized context
in `core/src/com/google/inject/internal/SingletonScope.java`
#### Snippet
```java
            synchronized (constructionContext) {
              // guarantee thread-safety for instance and proxies initialization
              if (instance == null) {
                // creating a proxy to satisfy circular dependency across several threads
                Dependency<?> dependency =
```

## RuleId[id=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `core/src/com/google/inject/internal/Messages.java`
#### Snippet
```java

  @SuppressWarnings({"unchecked", "rawtypes"}) // rawtypes aren't avoidable
  private static final Collection<Converter<?>> converters =
      ImmutableList.of(
          new Converter<Class>(Class.class) {
```

### RedundantSuppression
Redundant suppression
in `core/src/com/google/inject/internal/ProviderMethod.java`
#### Snippet
```java
  @Override
  @SuppressWarnings("unchecked")
  public <B, V> V acceptExtensionVisitor(
      BindingTargetVisitor<B, V> visitor, ProviderInstanceBinding<? extends B> binding) {
    if (visitor instanceof ProvidesMethodTargetVisitor) {
```

### RedundantSuppression
Redundant suppression
in `core/src/com/google/inject/internal/RealMapBinder.java`
#### Snippet
```java
    @Override
    @SuppressWarnings("unchecked")
    public <B, W> W acceptExtensionVisitor(
        BindingTargetVisitor<B, W> visitor, ProviderInstanceBinding<? extends B> binding) {
      if (visitor instanceof MultibindingsTargetVisitor) {
```

### RedundantSuppression
Redundant suppression
in `core/src/com/google/inject/internal/RealMapBinder.java`
#### Snippet
```java
          if (userSuppliedProvider instanceof ProviderMapEntry) {
            // Safe because of the instanceof check
            @SuppressWarnings("unchecked")
            ProviderMapEntry<K, V> typedUserSuppliedProvider =
                (ProviderMapEntry<K, V>) userSuppliedProvider;
            ProviderMapEntry<K, V> entry = typedUserSuppliedProvider;

```

### RedundantSuppression
Redundant suppression
in `core/src/com/google/inject/internal/RealMapBinder.java`
#### Snippet
```java
      @Override
      protected void doInitialize(InjectorImpl injector, Errors errors) throws ErrorsException {
        @SuppressWarnings({"unchecked", "rawtypes"})
        PerKeyData<K, V>[] typedPerKeyData =
            new PerKeyData[bindingSelection.getMapBindings().size()];
        perKeyDatas = typedPerKeyData;
        ImmutableSet.Builder<Dependency<?>> dependenciesBuilder = ImmutableSet.builder();
```

### RedundantSuppression
Redundant suppression
in `core/src/com/google/inject/internal/RealMapBinder.java`
#### Snippet
```java

          Set<Binding<V>> bindings = entry.getValue();
          @SuppressWarnings({"unchecked", "rawtypes"})
          Binding<V>[] typedBindings = new Binding[bindings.size()];
          Binding<V>[] bindingsArray = typedBindings;
          int j = 0;
```

### RedundantSuppression
Redundant suppression
in `core/src/com/google/inject/internal/RealMultibinder.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    @Override
    public <B, V> V acceptExtensionVisitor(
        BindingTargetVisitor<B, V> visitor, ProviderInstanceBinding<? extends B> binding) {
      if (visitor instanceof MultibindingsTargetVisitor) {
```

### RedundantSuppression
Redundant suppression
in `core/src/com/google/inject/internal/RealOptionalBinder.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    @Override
    public <B, R> R acceptExtensionVisitor(
        BindingTargetVisitor<B, R> visitor, ProviderInstanceBinding<? extends B> binding) {
      if (visitor instanceof MultibindingsTargetVisitor) {
```

### RedundantSuppression
Redundant suppression
in `core/src/com/google/inject/internal/RealOptionalBinder.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    @Override
    public <B, R> R acceptExtensionVisitor(
        BindingTargetVisitor<B, R> visitor, ProviderInstanceBinding<? extends B> binding) {
      if (visitor instanceof MultibindingsTargetVisitor) {
```

### RedundantSuppression
Redundant suppression
in `core/src/com/google/inject/internal/SingletonScope.java`
#### Snippet
```java
      @SuppressWarnings("DoubleCheckedLocking")
      @Override
      public T get() {
        // cache volatile variable for the usual case of already initialized object
        final Object initialInstance = instance;
```

### RedundantSuppression
Redundant suppression
in `extensions/persist/src/com/google/inject/persist/finder/Finder.java`
#### Snippet
```java
   */
  @SuppressWarnings({"rawtypes"}) // Unavoidable because class literal uses raw types.
  Class<? extends Collection> returnAs() default Collection.class;
}

```

### RedundantSuppression
Redundant suppression
in `extensions/persist/src/com/google/inject/persist/jpa/JpaFinderProxy.java`
#### Snippet
```java

      if (null == annotation)
      //noinspection UnnecessaryContinue
      {
        continue; //skip param as it's not bindable
```

### RedundantSuppression
Redundant suppression
in `extensions/servlet/src/com/google/inject/servlet/ManagedFilterPipeline.java`
#### Snippet
```java
   */
  @SuppressWarnings({"JavaDoc", "deprecation"})
  private ServletRequest withDispatcher(
      ServletRequest servletRequest, final ManagedServletPipeline servletPipeline) {

```

### RedundantSuppression
Redundant suppression
in `extensions/servlet/src/com/google/inject/servlet/ManagedFilterPipeline.java`
#### Snippet
```java

    HttpServletRequest request = (HttpServletRequest) servletRequest;
    //noinspection OverlyComplexAnonymousInnerClass
    return new HttpServletRequestWrapper(request) {

```

### RedundantSuppression
Redundant suppression
in `extensions/struts2/src/com/google/inject/struts2/GuiceObjectFactory.java`
#### Snippet
```java
  @Override
  @SuppressWarnings({"unchecked", "rawtypes"}) // Parent class uses raw type.
  public Object buildBean(Class clazz, Map<String, Object> extraContext) {
    if (injector == null) {
      synchronized (this) {
```

### RedundantSuppression
Redundant suppression
in `extensions/struts2/src/com/google/inject/struts2/Struts2Factory.java`
#### Snippet
```java
  @Override
  @SuppressWarnings({"unchecked", "rawtypes"}) // Parent class uses raw type.
  public Object buildBean(Class clazz, Map<String, Object> extraContext) {
    if (strutsInjector == null) {
      synchronized (this) {
```

## RuleId[id=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'valueType'
in `extensions/throwingproviders/src/com/google/inject/throwingproviders/ProviderChecker.java`
#### Snippet
```java

  static <P extends CheckedProvider<?>> void checkInterface(
      Class<P> interfaceType, Optional<? extends Type> valueType) {
    checkArgument(interfaceType.isInterface(), "%s must be an interface", interfaceType.getName());
    checkArgument(
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'value'
in `extensions/throwingproviders/src/com/google/inject/throwingproviders/CheckedProviders.java`
#### Snippet
```java
  }

  private static Optional<Class<?>> getClassOptional(Optional<?> value) {
    if (!value.isPresent()) {
      return Optional.absent();
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'value'
in `extensions/throwingproviders/src/com/google/inject/throwingproviders/CheckedProviders.java`
#### Snippet
```java

  private static <T, P extends CheckedProvider<? super T>> P generateProvider(
      TypeLiteral<P> providerType, Optional<T> value, InvocationHandler handler) {
    // TODO(user): Understand why TypeLiteral#getRawType returns a Class<? super T> rather
    // than a Class<T> and remove this unsafe cast.
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'value'
in `extensions/throwingproviders/src/com/google/inject/throwingproviders/CheckedProviders.java`
#### Snippet
```java

  private static <T, P extends CheckedProvider<? super T>> P generateProvider(
      Class<P> providerType, Optional<T> value, InvocationHandler handler) {
    checkInterface(providerType, getClassOptional(value));
    Object proxy =
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'parent'
in `core/src/com/google/inject/internal/InjectorJitBindingData.java`
#### Snippet
```java

  // The InjectorJitBindingData corresponding to the Injector's parent, if it exists.
  private final Optional<InjectorJitBindingData> parent;

  /**
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'parent'
in `core/src/com/google/inject/internal/InjectorJitBindingData.java`
#### Snippet
```java
  private final Object lock;

  InjectorJitBindingData(Optional<InjectorJitBindingData> parent) {
    this.parent = parent;
    this.lock = parent.isPresent() ? parent.get().lock() : this;
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'value'
in `core/src/com/google/inject/internal/RealOptionalBinder.java`
#### Snippet
```java
  private static final class RealOptionalProviderProvider<T>
      extends RealOptionalBinderProviderWithDependencies<T, Optional<Provider<T>>> {
    private Optional<Provider<T>> value;

    RealOptionalProviderProvider(BindingSelection<T> bindingSelection) {
```

### OptionalUsedAsFieldOrParameterType
`java.util.Optional`> used as type for field 'value'
in `core/src/com/google/inject/internal/RealOptionalBinder.java`
#### Snippet
```java
  private static final class JavaOptionalProviderProvider<T>
      extends RealOptionalBinderProviderWithDependencies<T, java.util.Optional<Provider<T>>> {
    private java.util.Optional<Provider<T>> value;

    JavaOptionalProviderProvider(BindingSelection<T> bindingSelection) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'parent'
in `core/src/com/google/inject/internal/InjectorBindingData.java`
#### Snippet
```java

  // The parent injector's InjectorBindingData, if the parent injector exists.
  private final Optional<InjectorBindingData> parent;

  // Must be a linked hashmap in order to preserve order of bindings in Modules.
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'parent'
in `core/src/com/google/inject/internal/InjectorBindingData.java`
#### Snippet
```java
      ArrayListMultimap.create();

  InjectorBindingData(Optional<InjectorBindingData> parent) {
    this.parent = parent;
  }
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for parameter 'naturalType'
in `extensions/testlib/src/com/google/inject/testing/fieldbinder/BoundFieldModule.java`
#### Snippet
```java
    }

    private Key<?> computeKey(Optional<TypeLiteral<?>> naturalType, Annotation bindingAnnotation)
        throws BoundFieldException {
      TypeLiteral<?> boundType = computeBoundType(naturalType);
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for parameter 'naturalType'
in `extensions/testlib/src/com/google/inject/testing/fieldbinder/BoundFieldModule.java`
#### Snippet
```java
    }

    private void checkBindingIsAssignable(Field field, Optional<TypeLiteral<?>> naturalType)
        throws BoundFieldException {
      if (naturalType.isPresent()) {
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for parameter 'naturalType'
in `extensions/testlib/src/com/google/inject/testing/fieldbinder/BoundFieldModule.java`
#### Snippet
```java
    }

    private TypeLiteral<?> computeBoundType(Optional<TypeLiteral<?>> naturalType)
        throws BoundFieldException {
      Class<?> bindClass = bindAnnotation.to();
```

## RuleId[id=SystemOutErr]
### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `extensions/jmx/src/com/google/inject/tools/jmx/Manager.java`
#### Snippet
```java
  public static void main(String[] args) throws Exception {
    if (args.length != 1) {
      System.err.println(
          "Usage: java -Dcom.sun.management.jmxremote "
              + Manager.class.getName()
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `extensions/jmx/src/com/google/inject/tools/jmx/Manager.java`
#### Snippet
```java
              + Manager.class.getName()
              + " [module class name]");
      System.err.println("Then run 'jconsole' to connect.");
      System.exit(1);
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `extensions/jmx/src/com/google/inject/tools/jmx/Manager.java`
#### Snippet
```java
    manage(args[0], injector);

    System.out.println("Press Ctrl+C to exit...");

    // Sleep forever.
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `extensions/grapher/src/com/google/inject/grapher/ShortNameFactory.java`
#### Snippet
```java
   */
  private String stripPackages(String str) {
    return str.replaceAll("(^|[< .\\(])([a-z0-9]+\\.)*", "$1");
  }
}
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `extensions/grapher/src/com/google/inject/grapher/ShortNameFactory.java`
#### Snippet
```java
              .substring(1);
      String simpleName = annotationType.getSimpleName();
      return annotationString.replace(canonicalName, simpleName).replace("()", "");
    } else if (annotationType != null) {
      return "@" + annotationType.getSimpleName();
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `extensions/grapher/src/com/google/inject/grapher/graphviz/GraphvizGrapher.java`
#### Snippet
```java

  protected String htmlEscape(String str) {
    return str.replace("&", "&amp;").replace("<", "&lt;").replace(">", "&gt;");
  }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `extensions/grapher/src/com/google/inject/grapher/graphviz/GraphvizGrapher.java`
#### Snippet
```java

  protected String htmlEscape(String str) {
    return str.replace("&", "&amp;").replace("<", "&lt;").replace(">", "&gt;");
  }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `extensions/grapher/src/com/google/inject/grapher/graphviz/GraphvizGrapher.java`
#### Snippet
```java

  protected String htmlEscape(String str) {
    return str.replace("&", "&amp;").replace("<", "&lt;").replace(">", "&gt;");
  }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `extensions/servlet/src/com/google/inject/servlet/ServletDefinition.java`
#### Snippet
```java
              int servletPathLength = servletPath.length();
              String requestUri = getRequestURI();
              pathInfo = requestUri.substring(getContextPath().length()).replaceAll("[/]{2,}", "/");
              // See: https://github.com/google/guice/issues/372
              if (pathInfo.startsWith(servletPath)) {
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `com.google.inject.name` is unnecessary and can be removed
in `extensions/spring/src/com/google/inject/spring/SpringIntegration.java`
#### Snippet
```java
   *
   * @see com.google.inject.name.Named
   * @see com.google.inject.name.Names#named(String)
   */
  public static void bindAll(Binder binder, ListableBeanFactory beanFactory) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.springframework.beans.factory` is unnecessary and can be removed
in `extensions/spring/src/com/google/inject/spring/SpringIntegration.java`
#### Snippet
```java
  /**
   * Creates a provider which looks up objects from Spring using the given name. Expects a binding
   * to {@link org.springframework.beans.factory.BeanFactory}. Example usage:
   *
   * <pre>
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.inject.struts2` is unnecessary and can be removed
in `extensions/struts2/src/com/google/inject/struts2/GuiceObjectFactory.java`
#### Snippet
```java
import java.util.logging.Logger;

/** @deprecated Use {@link com.google.inject.struts2.Struts2Factory} instead. */
@Deprecated
public class GuiceObjectFactory extends ObjectFactory {
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `extensions/persist/src/com/google/inject/persist/PersistFilter.java`
#### Snippet
```java
 * Apply this filter to enable the HTTP Request unit of work and to have guice-persist manage the
 * lifecycle of active units of work. The filter automatically starts and stops the relevant {@link
 * PersistService} upon {@link javax.servlet.Filter#init(javax.servlet.FilterConfig)} and {@link
 * javax.servlet.Filter#destroy()} respectively.
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `extensions/persist/src/com/google/inject/persist/PersistFilter.java`
#### Snippet
```java
 * Apply this filter to enable the HTTP Request unit of work and to have guice-persist manage the
 * lifecycle of active units of work. The filter automatically starts and stops the relevant {@link
 * PersistService} upon {@link javax.servlet.Filter#init(javax.servlet.FilterConfig)} and {@link
 * javax.servlet.Filter#destroy()} respectively.
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `extensions/persist/src/com/google/inject/persist/PersistFilter.java`
#### Snippet
```java
 * lifecycle of active units of work. The filter automatically starts and stops the relevant {@link
 * PersistService} upon {@link javax.servlet.Filter#init(javax.servlet.FilterConfig)} and {@link
 * javax.servlet.Filter#destroy()} respectively.
 *
 * <p>To be able to use the open session-in-view pattern (i.e. work per request), register this
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.inject` is unnecessary and can be removed
in `extensions/servlet/src/com/google/inject/servlet/ManagedFilterPipeline.java`
#### Snippet
```java
   * into a master list.
   *
   * <p>We have a guarantee that {@link com.google.inject.Injector#getBindings()} returns a map that
   * preserves insertion order in entry-set iterators.
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.inject` is unnecessary and can be removed
in `extensions/servlet/src/com/google/inject/servlet/ManagedServletPipeline.java`
#### Snippet
```java
   * into a master list.
   *
   * <p>We have a guarantee that {@link com.google.inject.Injector#getBindings()} returns a map that
   * preserves insertion order in entry-set iterators.
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.inject.servlet` is unnecessary and can be removed
in `extensions/servlet/src/com/google/inject/servlet/DefaultFilterPipeline.java`
#### Snippet
```java
 *
 * @author dhanji@gmail.com (Dhanji R. Prasanna)
 * @see com.google.inject.servlet.ManagedFilterPipeline See Also ManagedFilterPipeline.
 */
class DefaultFilterPipeline implements FilterPipeline {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `extensions/servlet/src/com/google/inject/servlet/ServletModule.java`
#### Snippet
```java
   * Servlets (and filters) allow you to pass in init params using the {@code <init-param>} tag in
   * web.xml. You can similarly pass in parameters to Servlets and filters registered in
   * Guice-servlet using a {@link java.util.Map} of parameter name/value pairs. For example, to
   * initialize {@code MyServlet} with two parameters ({@code name="Dhanji", site="google.com"}) you
   * could write:
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.inject` is unnecessary and can be removed
in `core/src/com/google/inject/Exposed.java`
#### Snippet
```java

/**
 * Acccompanies a {@literal @}{@link com.google.inject.Provides Provides} method annotation in a
 * private module to indicate that the provided binding is exposed.
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.collect` is unnecessary, and can be replaced with an import
in `core/src/com/google/inject/ConfigurationException.java`
#### Snippet
```java
public final class ConfigurationException extends RuntimeException {

  private final com.google.common.collect.ImmutableSet<Message> messages;
  private Object partialValue = null;

```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.collect` is unnecessary, and can be replaced with an import
in `core/src/com/google/inject/ConfigurationException.java`
#### Snippet
```java
  /** Creates a ConfigurationException containing {@code messages}. */
  public ConfigurationException(Iterable<Message> messages) {
    this.messages = com.google.common.collect.ImmutableSet.copyOf(messages);
    initCause(Messages.getOnlyCause(this.messages));
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.inject.binder` is unnecessary and can be removed
in `core/src/com/google/inject/PrivateBinder.java`
#### Snippet
```java
  /**
   * Makes a binding for {@code type} available to the enclosing environment. Use {@link
   * com.google.inject.binder.AnnotatedElementBuilder#annotatedWith(Class) annotatedWith()} to
   * expose {@code type} with a binding annotation.
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.inject` is unnecessary and can be removed
in `core/src/com/google/inject/PrivateBinder.java`
#### Snippet
```java
/**
 * Returns a binder whose configuration information is hidden from its environment by default. See
 * {@link com.google.inject.PrivateModule PrivateModule} for details.
 *
 * @author jessewilson@google.com (Jesse Wilson)
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.inject.spi` is unnecessary and can be removed
in `core/src/com/google/inject/Scopes.java`
#### Snippet
```java
  /**
   * Returns true if {@code binding} is singleton-scoped. If the binding is a {@link
   * com.google.inject.spi.LinkedKeyBinding linked key binding} and belongs to an injector (ie. it
   * was retrieved via {@link Injector#getBinding Injector.getBinding()}), then this method will
   * also true if the target binding is singleton-scoped.
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.inject.spi` is unnecessary and can be removed
in `core/src/com/google/inject/Scopes.java`
#### Snippet
```java
  /**
   * Returns true if {@code binding} has the given scope. If the binding is a {@link
   * com.google.inject.spi.LinkedKeyBinding linked key binding} and belongs to an injector (ie. it
   * was retrieved via {@link Injector#getBinding Injector.getBinding()}), then this method will
   * also true if the target binding has the given scope.
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.inject.matcher` is unnecessary and can be removed
in `core/src/com/google/inject/AbstractModule.java`
#### Snippet
```java

  /**
   * @see Binder#bindListener(com.google.inject.matcher.Matcher, com.google.inject.spi.TypeListener)
   * @since 2.0
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.inject.spi` is unnecessary and can be removed
in `core/src/com/google/inject/AbstractModule.java`
#### Snippet
```java

  /**
   * @see Binder#bindListener(com.google.inject.matcher.Matcher, com.google.inject.spi.TypeListener)
   * @since 2.0
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.inject.spi` is unnecessary and can be removed
in `core/src/com/google/inject/spi/ProvidesMethodTargetVisitor.java`
#### Snippet
```java
 * A visitor for the {@literal @}{@link Provides} bindings.
 *
 * <p>If your {@link com.google.inject.spi.BindingTargetVisitor} implements this interface, bindings
 * created by using {@code @Provides} will be visited through this interface.
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.inject.matcher` is unnecessary and can be removed
in `core/src/com/google/inject/PrivateModule.java`
#### Snippet
```java

  /**
   * @see Binder#bindInterceptor(com.google.inject.matcher.Matcher,
   *     com.google.inject.matcher.Matcher, org.aopalliance.intercept.MethodInterceptor[])
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.inject.matcher` is unnecessary and can be removed
in `core/src/com/google/inject/PrivateModule.java`
#### Snippet
```java
  /**
   * @see Binder#bindInterceptor(com.google.inject.matcher.Matcher,
   *     com.google.inject.matcher.Matcher, org.aopalliance.intercept.MethodInterceptor[])
   */
  protected final void bindInterceptor(
```

### UnnecessaryFullyQualifiedName
Qualifier `org.aopalliance.intercept` is unnecessary and can be removed
in `core/src/com/google/inject/PrivateModule.java`
#### Snippet
```java
  /**
   * @see Binder#bindInterceptor(com.google.inject.matcher.Matcher,
   *     com.google.inject.matcher.Matcher, org.aopalliance.intercept.MethodInterceptor[])
   */
  protected final void bindInterceptor(
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.inject.matcher` is unnecessary and can be removed
in `core/src/com/google/inject/PrivateModule.java`
#### Snippet
```java

  /**
   * @see Binder#convertToTypes(com.google.inject.matcher.Matcher,
   *     com.google.inject.spi.TypeConverter)
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.inject.spi` is unnecessary and can be removed
in `core/src/com/google/inject/PrivateModule.java`
#### Snippet
```java
  /**
   * @see Binder#convertToTypes(com.google.inject.matcher.Matcher,
   *     com.google.inject.spi.TypeConverter)
   */
  protected final void convertToTypes(
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.inject.matcher` is unnecessary and can be removed
in `core/src/com/google/inject/PrivateModule.java`
#### Snippet
```java

  /**
   * @see Binder#bindListener(com.google.inject.matcher.Matcher, com.google.inject.spi.TypeListener)
   */
  protected void bindListener(Matcher<? super TypeLiteral<?>> typeMatcher, TypeListener listener) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.inject.spi` is unnecessary and can be removed
in `core/src/com/google/inject/PrivateModule.java`
#### Snippet
```java

  /**
   * @see Binder#bindListener(com.google.inject.matcher.Matcher, com.google.inject.spi.TypeListener)
   */
  protected void bindListener(Matcher<? super TypeLiteral<?>> typeMatcher, TypeListener listener) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.inject` is unnecessary and can be removed
in `core/src/com/google/inject/PrivateModule.java`
#### Snippet
```java
 *
 * <p>Guice EDSL bindings can be exposed with {@link #expose(Class) expose()}. {@literal @}{@link
 * com.google.inject.Provides Provides} bindings can be exposed with the {@literal @}{@link Exposed}
 * annotation:
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.inject` is unnecessary and can be removed
in `core/src/com/google/inject/spi/MembersInjectorLookup.java`
#### Snippet
```java
/**
 * A lookup of the members injector for a type. Lookups are created explicitly in a module using
 * {@link com.google.inject.Binder#getMembersInjector(Class) getMembersInjector()} statements:
 *
 * <pre>
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.inject` is unnecessary, and can be replaced with an import
in `core/src/com/google/inject/spi/ProviderKeyBinding.java`
#### Snippet
```java
   * Injector.getBinding(providerKey)}
   */
  Key<? extends javax.inject.Provider<? extends T>> getProviderKey();
}

```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.inject` is unnecessary and can be removed
in `core/src/com/google/inject/spi/TypeListenerBinding.java`
#### Snippet
```java
/**
 * Binds types (picked using a Matcher) to an type listener. Registrations are created explicitly in
 * a module using {@link com.google.inject.Binder#bindListener(Matcher, TypeListener)} statements:
 *
 * <pre>{@code
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.inject` is unnecessary and can be removed
in `core/src/com/google/inject/spi/Message.java`
#### Snippet
```java
 * An error message and the context in which it occured. Messages are usually created internally by
 * Guice and its extensions. Messages can be created explicitly in a module using {@link
 * com.google.inject.Binder#addError(Throwable) addError()} statements:
 *
 * <pre>
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.inject` is unnecessary and can be removed
in `core/src/com/google/inject/spi/StaticInjectionRequest.java`
#### Snippet
```java
/**
 * A request to inject the static fields and methods of a type. Requests are created explicitly in a
 * module using {@link com.google.inject.Binder#requestStaticInjection(Class[])
 * requestStaticInjection()} statements:
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.inject` is unnecessary and can be removed
in `core/src/com/google/inject/spi/InjectionRequest.java`
#### Snippet
```java
/**
 * A request to inject the instance fields and methods of an instance. Requests are created
 * explicitly in a module using {@link com.google.inject.Binder#requestInjection(Object)
 * requestInjection()} statements:
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.inject` is unnecessary and can be removed
in `core/src/com/google/inject/spi/ScopeBinding.java`
#### Snippet
```java
/**
 * Registration of a scope annotation with the scope that implements it. Instances are created
 * explicitly in a module using {@link com.google.inject.Binder#bindScope(Class, Scope) bindScope()}
 * statements:
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.inject` is unnecessary and can be removed
in `core/src/com/google/inject/spi/InterceptorBinding.java`
#### Snippet
```java
/**
 * Registration of interceptors for matching methods of matching classes. Instances are created
 * explicitly in a module using {@link com.google.inject.Binder#bindInterceptor( Matcher, Matcher,
 * MethodInterceptor[]) bindInterceptor()} statements:
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.aopalliance.intercept` is unnecessary and can be removed
in `core/src/com/google/inject/spi/InterceptorBinding.java`
#### Snippet
```java
 *
 * or from an injectable type listener using {@link TypeEncounter#bindInterceptor(Matcher,
 * org.aopalliance.intercept.MethodInterceptor[]) TypeEncounter.bindInterceptor()}.
 *
 * @author jessewilson@google.com (Jesse Wilson)
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.inject` is unnecessary and can be removed
in `core/src/com/google/inject/spi/TypeConverterBinding.java`
#### Snippet
```java
/**
 * Registration of type converters for matching target types. Instances are created explicitly in a
 * module using {@link com.google.inject.Binder#convertToTypes(Matcher, TypeConverter)
 * convertToTypes()} statements:
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.inject` is unnecessary and can be removed
in `core/src/com/google/inject/spi/ProviderLookup.java`
#### Snippet
```java
/**
 * A lookup of the provider for a type. Lookups are created explicitly in a module using {@link
 * com.google.inject.Binder#getProvider(Class) getProvider()} statements:
 *
 * <pre>
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.inject.internal` is unnecessary and can be removed
in `core/src/com/google/inject/internal/InternalFactory.java`
#### Snippet
```java
   * @param context of this injection
   * @param linked true if getting as a result of a linked binding
   * @throws com.google.inject.internal.InternalProvisionException if a value cannot be provided
   * @return instance that was created
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang.reflect` is unnecessary and can be removed
in `core/src/com/google/inject/internal/ConstructionProxy.java`
#### Snippet
```java

/**
 * Proxies calls to a {@link java.lang.reflect.Constructor} for a class {@code T}.
 *
 * @author crazybob@google.com (Bob Lee)
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.inject.servlet` is unnecessary and can be removed
in `extensions/servlet/src/com/google/inject/servlet/ServletsModuleBuilder.java`
#### Snippet
```java
/**
 * Builds the guice module that binds configured servlets, with their wrapper ServletDefinitions. Is
 * part of the binding EDSL. Very similar to {@link com.google.inject.servlet.FiltersModuleBuilder}.
 *
 * @author Dhanji R. Prasanna (dhanji@gmail.com)
```

### UnnecessaryFullyQualifiedName
Qualifier `org.aopalliance.intercept` is unnecessary, and can be replaced with an import
in `core/src/com/google/inject/internal/EncounterImpl.java`
#### Snippet
```java
  public void bindInterceptor(
      Matcher<? super Method> methodMatcher,
      org.aopalliance.intercept.MethodInterceptor... interceptors) {
    checkState(valid, "Encounters may not be used after hear() returns.");

```

### UnnecessaryFullyQualifiedName
Qualifier `javax.inject` is unnecessary, and can be replaced with an import
in `core/src/com/google/inject/internal/MoreTypes.java`
#### Snippet
```java
    }

    if (typeLiteral.getRawType() == javax.inject.Provider.class) {
      ParameterizedType parameterizedType = (ParameterizedType) type;

```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.inject.internal` is unnecessary and can be removed
in `core/src/com/google/inject/internal/CycleDetectingLock.java`
#### Snippet
```java
 *     heavy IDs. Lock is referenced by a lock factory as long as it's owned by a thread.
 * @see SingletonScope
 * @see com.google.inject.internal.CycleDetectingLock.CycleDetectingLockFactory
 * @author timofeyb (Timothy Basanov)
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.inject` is unnecessary, and can be replaced with an import
in `core/src/com/google/inject/internal/Annotations.java`
#### Snippet
```java

  private static final AnnotationChecker scopeChecker =
      new AnnotationChecker(Arrays.asList(ScopeAnnotation.class, javax.inject.Scope.class));

  public static boolean isScopeAnnotation(Class<? extends Annotation> annotationType) {
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.inject` is unnecessary, and can be replaced with an import
in `core/src/com/google/inject/internal/InternalProvisionException.java`
#### Snippet
```java

  public static InternalProvisionException subtypeNotProvided(
      Class<? extends javax.inject.Provider<?>> providerType, Class<?> type) {
    return create(
        ErrorId.SUBTYPE_NOT_PROVIDED, "%s doesn't provide instances of %s.", providerType, type);
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.inject` is unnecessary, and can be replaced with an import
in `core/src/com/google/inject/internal/InternalFactoryToInitializableAdapter.java`
#### Snippet
```java
  @Override
  protected T provision(
      javax.inject.Provider<? extends T> provider,
      Dependency<?> dependency,
      ConstructionContext<T> constructionContext)
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.inject` is unnecessary, and can be replaced with an import
in `core/src/com/google/inject/internal/InternalFactoryToInitializableAdapter.java`
#### Snippet
```java

  private final ProvisionListenerStackCallback<T> provisionCallback;
  private final Initializable<? extends javax.inject.Provider<? extends T>> initializable;

  public InternalFactoryToInitializableAdapter(
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.inject` is unnecessary, and can be replaced with an import
in `core/src/com/google/inject/internal/InternalFactoryToInitializableAdapter.java`
#### Snippet
```java

  public InternalFactoryToInitializableAdapter(
      Initializable<? extends javax.inject.Provider<? extends T>> initializable,
      Object source,
      ProvisionListenerStackCallback<T> provisionCallback) {
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.inject` is unnecessary and can be removed
in `core/src/com/google/inject/internal/ProvidedByInternalFactory.java`
#### Snippet
```java
  @Override
  protected T provision(
      javax.inject.Provider<? extends T> provider,
      Dependency<?> dependency,
      ConstructionContext<T> constructionContext)
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.inject.internal` is unnecessary and can be removed
in `core/src/com/google/inject/internal/InternalProviderInstanceBindingImpl.java`
#### Snippet
```java
     * Creates an object to be injected.
     *
     * @throws com.google.inject.internal.InternalProvisionException if a value cannot be provided
     * @return instance to be injected
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.inject` is unnecessary and can be removed
in `core/src/com/google/inject/internal/BoundProviderFactory.java`
#### Snippet
```java
  BoundProviderFactory(
      InjectorImpl injector,
      Key<? extends javax.inject.Provider<? extends T>> providerKey,
      Object source,
      ProvisionListenerStackCallback<T> provisionCallback) {
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.inject` is unnecessary and can be removed
in `core/src/com/google/inject/internal/BoundProviderFactory.java`
#### Snippet
```java
  private final InjectorImpl injector;
  final Key<? extends javax.inject.Provider<? extends T>> providerKey;
  private InternalFactory<? extends javax.inject.Provider<? extends T>> providerFactory;

  BoundProviderFactory(
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.inject` is unnecessary and can be removed
in `core/src/com/google/inject/internal/BoundProviderFactory.java`
#### Snippet
```java
      throws InternalProvisionException {
    try {
      javax.inject.Provider<? extends T> provider = providerFactory.get(context, dependency, true);
      return circularGet(provider, context, dependency, provisionCallback);
    } catch (InternalProvisionException ipe) {
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.inject` is unnecessary and can be removed
in `core/src/com/google/inject/internal/BoundProviderFactory.java`
#### Snippet
```java
  private final ProvisionListenerStackCallback<T> provisionCallback;
  private final InjectorImpl injector;
  final Key<? extends javax.inject.Provider<? extends T>> providerKey;
  private InternalFactory<? extends javax.inject.Provider<? extends T>> providerFactory;

```

### UnnecessaryFullyQualifiedName
Qualifier `javax.inject` is unnecessary, and can be replaced with an import
in `core/src/com/google/inject/internal/LinkedProviderBindingImpl.java`
#### Snippet
```java
      Key<T> key,
      Scoping scoping,
      Key<? extends javax.inject.Provider<? extends T>> providerKey) {
    super(source, key, scoping);
    this.providerKey = providerKey;
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.inject` is unnecessary, and can be replaced with an import
in `core/src/com/google/inject/internal/LinkedProviderBindingImpl.java`
#### Snippet
```java
      InternalFactory<? extends T> internalFactory,
      Scoping scoping,
      Key<? extends javax.inject.Provider<? extends T>> providerKey) {
    this(injector, key, source, internalFactory, scoping, providerKey, null);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.inject` is unnecessary, and can be replaced with an import
in `core/src/com/google/inject/internal/LinkedProviderBindingImpl.java`
#### Snippet
```java
    implements ProviderKeyBinding<T>, HasDependencies, DelayedInitialize {

  final Key<? extends javax.inject.Provider<? extends T>> providerKey;
  final DelayedInitialize delayedInitializer;

```

### UnnecessaryFullyQualifiedName
Qualifier `javax.inject` is unnecessary, and can be replaced with an import
in `core/src/com/google/inject/internal/LinkedProviderBindingImpl.java`
#### Snippet
```java

  @Override
  public Key<? extends javax.inject.Provider<? extends T>> getProviderKey() {
    return providerKey;
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.inject` is unnecessary, and can be replaced with an import
in `core/src/com/google/inject/internal/LinkedProviderBindingImpl.java`
#### Snippet
```java
      InternalFactory<? extends T> internalFactory,
      Scoping scoping,
      Key<? extends javax.inject.Provider<? extends T>> providerKey,
      DelayedInitialize delayedInitializer) {
    super(injector, key, source, internalFactory, scoping);
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.inject` is unnecessary, and can be replaced with an import
in `core/src/com/google/inject/internal/LinkedProviderBindingImpl.java`
#### Snippet
```java
      InternalFactory<? extends T> internalFactory,
      Scoping scoping,
      Key<? extends javax.inject.Provider<? extends T>> providerKey,
      DelayedInitialize delayedInitializer) {
    return new LinkedProviderBindingImpl<T>(
```

### UnnecessaryFullyQualifiedName
Qualifier `org.objectweb.asm` is unnecessary, and can be replaced with an import
in `core/src/com/google/inject/internal/util/LineNumbers.java`
#### Snippet
```java
      return member.getName();
    } else if (member instanceof Method) {
      return member.getName() + org.objectweb.asm.Type.getMethodDescriptor((Method) member);

    } else if (member instanceof Constructor) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.objectweb.asm` is unnecessary, and can be replaced with an import
in `core/src/com/google/inject/internal/util/LineNumbers.java`
#### Snippet
```java
      StringBuilder sb = new StringBuilder().append("<init>(");
      for (Class<?> param : ((Constructor<?>) member).getParameterTypes()) {
        sb.append(org.objectweb.asm.Type.getDescriptor(param));
      }
      return sb.append(")V").toString();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.inject.internal` is unnecessary and can be removed
in `core/src/com/google/inject/internal/InjectorImpl.java`
#### Snippet
```java
   * </ol>
   *
   * @throws com.google.inject.internal.ErrorsException if the binding cannot be created.
   */
  private <T> BindingImpl<T> createJustInTimeBinding(
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.inject.internal` is unnecessary and can be removed
in `core/src/com/google/inject/internal/InjectorImpl.java`
#### Snippet
```java
   *
   * @return the binding if it could be resolved, or null if the binding doesn't exist
   * @throws com.google.inject.internal.ErrorsException if there was an error resolving the binding
   */
  private <T> BindingImpl<T> convertConstantStringBinding(Key<T> key, Errors errors)
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.naming` is unnecessary and can be removed
in `extensions/jndi/src/com/google/inject/jndi/JndiIntegration.java`
#### Snippet
```java

/**
 * Integrates Guice with JNDI. Requires a binding to {@link javax.naming.Context}.
 *
 * @author crazybob@google.com (Bob Lee)
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.inject` is unnecessary, and can be replaced with an import
in `extensions/testlib/src/com/google/inject/testing/fieldbinder/BoundFieldModule.java`
#### Snippet
```java

  private static boolean hasInject(Field field) {
    return field.isAnnotationPresent(javax.inject.Inject.class)
        || field.isAnnotationPresent(com.google.inject.Inject.class);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.inject` is unnecessary, and can be replaced with an import
in `extensions/testlib/src/com/google/inject/testing/fieldbinder/BoundFieldModule.java`
#### Snippet
```java
  private static boolean hasInject(Field field) {
    return field.isAnnotationPresent(javax.inject.Inject.class)
        || field.isAnnotationPresent(com.google.inject.Inject.class);
  }

```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.inject` is unnecessary and can be removed
in `extensions/testlib/src/com/google/inject/testing/fieldbinder/BoundFieldModule.java`
#### Snippet
```java
   * instead.
   *
   * <p>A transparent provider is a {@link com.google.inject.Provider} or {@link
   * javax.inject.Provider} which binds to it's parameterized type when used as the argument to
   * {@link Binder#bind}.
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.inject` is unnecessary and can be removed
in `extensions/testlib/src/com/google/inject/testing/fieldbinder/BoundFieldModule.java`
#### Snippet
```java
   */
  private static boolean isTransparentProvider(Class<?> clazz) {
    return com.google.inject.Provider.class == clazz || javax.inject.Provider.class == clazz;
  }

```

## RuleId[id=ThrowablePrintStackTrace]
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `extensions/struts2/src/com/google/inject/struts2/GuiceObjectFactory.java`
#### Snippet
```java

    } catch (Throwable t) {
      t.printStackTrace();
      System.exit(1);
    }
```

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `AbstractInjectorGrapher()` of an abstract class should not be declared 'public'
in `extensions/grapher/src/com/google/inject/grapher/AbstractInjectorGrapher.java`
#### Snippet
```java
  }

  public AbstractInjectorGrapher(GrapherParameters options) {
    this.rootKeySetCreator = options.getRootKeySetCreator();
    this.aliasCreator = options.getAliasCreator();
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractInjectorGrapher()` of an abstract class should not be declared 'public'
in `extensions/grapher/src/com/google/inject/grapher/AbstractInjectorGrapher.java`
#### Snippet
```java
  }

  public AbstractInjectorGrapher() {
    this(new GrapherParameters());
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractBindingBuilder()` of an abstract class should not be declared 'public'
in `core/src/com/google/inject/internal/AbstractBindingBuilder.java`
#### Snippet
```java
  private BindingImpl<T> binding;

  public AbstractBindingBuilder(Binder binder, List<Element> elements, Object source, Key<T> key) {
    this.binder = binder;
    this.elements = elements;
```

## RuleId[id=Anonymous2MethodRef]
### Anonymous2MethodRef
Anonymous new MethodInvoker() can be replaced with method reference
in `core/src/com/google/inject/internal/SingleMethodInjector.java`
#### Snippet
```java
    }

    return new MethodInvoker() {
      @Override
      public Object invoke(Object target, Object... parameters)
```

### Anonymous2MethodRef
Anonymous new Factory() can be replaced with method reference
in `extensions/testlib/src/com/google/inject/testing/throwingproviders/CheckedProviderSubject.java`
#### Snippet
```java

  private static Factory<UnexpectedFailureSubject, Throwable> unexpectedFailures() {
    return new Factory<UnexpectedFailureSubject, Throwable>() {
      @Override
      public UnexpectedFailureSubject createSubject(FailureMetadata metadata, Throwable actual) {
```

## RuleId[id=JavaReflectionInvocation]
### JavaReflectionInvocation
Argument is not assignable to 'long'
in `core/src/com/google/inject/internal/aop/HiddenClassDefiner.java`
#### Snippet
```java
  public Class<?> define(Class<?> hostClass, byte[] bytecode) throws Exception {
    Lookup trustedLookup =
        (Lookup) GET_OBJECT_METHOD.invoke(THE_UNSAFE, TRUSTED_LOOKUP_BASE, TRUSTED_LOOKUP_OFFSET);
    Lookup definedLookup =
        (Lookup)
```

## RuleId[id=CaughtExceptionImmediatelyRethrown]
### CaughtExceptionImmediatelyRethrown
Caught exception `e` is immediately rethrown
in `core/src/com/google/inject/internal/InjectorImpl.java`
#### Snippet
```java
      return new ConvertedConstantBindingImpl<T>(
          this, key, converted, stringBinding, typeConverterBinding);
    } catch (ErrorsException e) {
      throw e;
    } catch (RuntimeException e) {
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `binder`
in `extensions/spring/src/com/google/inject/spring/SpringIntegration.java`
#### Snippet
```java
   */
  public static void bindAll(Binder binder, ListableBeanFactory beanFactory) {
    binder = binder.skipSources(SpringIntegration.class);

    for (String name : beanFactory.getBeanDefinitionNames()) {
```

### AssignmentToMethodParameter
Assignment to method parameter `binder`
in `extensions/throwingproviders/src/com/google/inject/throwingproviders/CheckedProviderMethod.java`
#### Snippet
```java

  void configure(Binder binder) {
    binder = binder.withSource(method);

    SecondaryBinder<?, ?> sbinder =
```

### AssignmentToMethodParameter
Assignment to method parameter `binder`
in `extensions/throwingproviders/src/com/google/inject/throwingproviders/CheckedProviderMethodsModule.java`
#### Snippet
```java
    @SuppressWarnings("rawtypes") // Class literal uses rawtypes.
    Class<? extends CheckedProvider> throwingProvider = checkedProvides.value();
    binder = binder.withSource(method);
    Errors errors = new Errors(method);

```

### AssignmentToMethodParameter
Assignment to method parameter `binder`
in `extensions/dagger-adapter/src/com/google/inject/daggeradapter/DaggerAdapter.java`
#### Snippet
```java
    @Override
    public void configure(Binder binder) {
      binder = binder.skipSources(getClass());
      ModuleAnnotatedMethodScanner scanner = DaggerMethodScanner.create(predicate);
      for (Object module : deduplicateModules(binder, transitiveModules())) {
```

### AssignmentToMethodParameter
Assignment to method parameter `source`
in `extensions/grapher/src/com/google/inject/grapher/ShortNameFactory.java`
#### Snippet
```java
  public String getSourceName(Object source) {
    if (source instanceof ElementSource) {
      source = ((ElementSource) source).getDeclaringSource();
    }
    if (source instanceof Method) {
```

### AssignmentToMethodParameter
Assignment to method parameter `source`
in `extensions/grapher/src/com/google/inject/grapher/ShortNameFactory.java`
#### Snippet
```java
    }
    if (source instanceof Method) {
      source = StackTraceElements.forMember((Method) source);
    }

```

### AssignmentToMethodParameter
Assignment to method parameter `path`
in `extensions/servlet/src/com/google/inject/servlet/ServletUtils.java`
#### Snippet
```java
    if (queryStart != -1) {
      query = path.substring(queryStart);
      path = path.substring(0, queryStart);
    }
    // Normalize the path.  we need to decode path segments, normalize and rejoin in order to
```

### AssignmentToMethodParameter
Assignment to method parameter `string`
in `extensions/servlet/src/com/google/inject/servlet/ServletUtils.java`
#### Snippet
```java

    if (decodePlus) {
      string = string.replace('+', ' ');
    }

```

### AssignmentToMethodParameter
Assignment to method parameter `uri`
in `extensions/servlet/src/com/google/inject/servlet/UriPatternType.java`
#### Snippet
```java
    int queryIdx = uri.indexOf('?');
    if (queryIdx != -1) {
      uri = uri.substring(0, queryIdx);
    }
    return uri;
```

### AssignmentToMethodParameter
Assignment to method parameter `uri`
in `extensions/servlet/src/com/google/inject/servlet/UriPatternType.java`
#### Snippet
```java
      }

      uri = getUri(uri);
      if (patternKind == Kind.PREFIX) {
        return uri.endsWith(literal);
```

### AssignmentToMethodParameter
Assignment to method parameter `toResolve`
in `core/src/com/google/inject/TypeLiteral.java`
#### Snippet
```java
      if (toResolve instanceof TypeVariable) {
        TypeVariable<?> original = (TypeVariable<?>) toResolve;
        toResolve = MoreTypes.resolveTypeVariable(type, rawType, original);
        if (toResolve == original) {
          return toResolve;
```

### AssignmentToMethodParameter
Assignment to method parameter `binding`
in `core/src/com/google/inject/Scopes.java`
#### Snippet
```java
        Injector injector = getInjector(linkedBinding);
        if (injector != null) {
          binding = injector.getBinding(linkedBinding.getLinkedKey());
          continue;
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `binding`
in `core/src/com/google/inject/Scopes.java`
#### Snippet
```java
        Injector injector = exposedBinding.getPrivateElements().getInjector();
        if (injector != null) {
          binding = injector.getBinding(exposedBinding.getKey());
          continue;
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `binding`
in `core/src/com/google/inject/Scopes.java`
#### Snippet
```java
        Injector injector = getInjector(linkedBinding);
        if (injector != null) {
          binding = injector.getBinding(linkedBinding.getLinkedKey());
          continue;
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `binding`
in `core/src/com/google/inject/Scopes.java`
#### Snippet
```java
        Injector injector = exposedBinding.getPrivateElements().getInjector();
        if (injector != null) {
          binding = injector.getBinding(exposedBinding.getKey());
          continue;
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `elementSource`
in `core/src/com/google/inject/spi/BindingSourceRestriction.java`
#### Snippet
```java
    while (elementSource != null) {
      elementSource.moduleSource.getPermitMap().clear();
      elementSource = elementSource.getOriginalElementSource();
    }
  }
```

### AssignmentToMethodParameter
Assignment to method parameter `annotationType`
in `core/src/com/google/inject/Key.java`
#### Snippet
```java
  /** Gets the strategy for an annotation type. */
  static AnnotationStrategy strategyFor(Class<? extends Annotation> annotationType) {
    annotationType = Annotations.canonicalizeIfNamed(annotationType);
    if (isAllDefaultMethods(annotationType)) {
      return strategyFor(generateAnnotation(annotationType));
```

### AssignmentToMethodParameter
Assignment to method parameter `binder`
in `core/src/com/google/inject/name/Names.java`
#### Snippet
```java
  /** Creates a constant binding to {@code @Named(key)} for each entry in {@code properties}. */
  public static void bindProperties(Binder binder, Map<String, String> properties) {
    binder = binder.skipSources(Names.class);
    for (Map.Entry<String, String> entry : properties.entrySet()) {
      String key = entry.getKey();
```

### AssignmentToMethodParameter
Assignment to method parameter `binder`
in `core/src/com/google/inject/name/Names.java`
#### Snippet
```java
   */
  public static void bindProperties(Binder binder, Properties properties) {
    binder = binder.skipSources(Names.class);

    // use enumeration to include the default properties
```

### AssignmentToMethodParameter
Assignment to method parameter `original`
in `core/src/com/google/inject/internal/AbstractBindingProcessor.java`
#### Snippet
```java
      return (exposedFrom == binding.getInjector());
    } else {
      original = (BindingImpl<?>) bindingData.getExplicitBindingsThisLevel().get(binding.getKey());
      // If no original at this level, the original was on a parent, and we don't
      // allow deduplication between parents & children.
```

### AssignmentToMethodParameter
Assignment to method parameter `binder`
in `core/src/com/google/inject/util/Modules.java`
#### Snippet
```java
    @Override
    public void configure(Binder binder) {
      binder = binder.skipSources(getClass());
      for (Module module : modulesSet) {
        binder.install(module);
```

### AssignmentToMethodParameter
Assignment to method parameter `source`
in `core/src/com/google/inject/internal/WeakKeySet.java`
#### Snippet
```java
    // want to retain.
    if (source instanceof Class || source == SourceProvider.UNKNOWN_SOURCE) {
      source = null;
    }
    Object convertedSource = Errors.convert(source);
```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `core/src/com/google/inject/internal/TypeConverterBindingProcessor.java`
#### Snippet
```java
          @Override
          public Object convert(String value, TypeLiteral<?> toType) {
            value = value.trim();
            if (value.length() != 1) {
              throw new RuntimeException("Length != 1.");
```

### AssignmentToMethodParameter
Assignment to method parameter `binder`
in `core/src/com/google/inject/internal/ProviderMethodsModule.java`
#### Snippet
```java
  private <T> ProviderMethod<T> createProviderMethod(
      Binder binder, Method method, Annotation annotation) {
    binder = binder.withSource(method);
    Errors errors = new Errors(method);

```

### AssignmentToMethodParameter
Assignment to method parameter `elementSource`
in `core/src/com/google/inject/internal/SourceFormatter.java`
#### Snippet
```java
    // Insert any original element sources w/ module info into the path.
    while (elementSource.getOriginalElementSource() != null) {
      elementSource = elementSource.getOriginalElementSource();
      modules.addAll(0, elementSource.getModuleClassNames());
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `rawType`
in `core/src/com/google/inject/internal/MoreTypes.java`
#### Snippet
```java
          return getGenericSupertype(rawType.getGenericSuperclass(), rawSupertype, toResolve);
        }
        rawType = rawSupertype;
      }
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `constructorInjector`
in `core/src/com/google/inject/internal/ConstructorBindingImpl.java`
#### Snippet
```java
    if (constructorInjector == null) {
      try {
        constructorInjector =
            InjectionPoint.forConstructorOf(key.getTypeLiteral(), atInjectRequired);
      } catch (ConfigurationException e) {
```

### AssignmentToMethodParameter
Assignment to method parameter `scoping`
in `core/src/com/google/inject/internal/ConstructorBindingImpl.java`
#### Snippet
```java
      Class<? extends Annotation> scopeAnnotation = findScopeAnnotation(errors, annotatedType);
      if (scopeAnnotation != null) {
        scoping =
            Scoping.makeInjectable(
                Scoping.forAnnotation(scopeAnnotation), injector, errors.withSource(rawType));
```

### AssignmentToMethodParameter
Assignment to method parameter `binder`
in `core/src/com/google/inject/internal/RealOptionalBinder.java`
#### Snippet
```java
public final class RealOptionalBinder<T> implements Module {
  public static <T> RealOptionalBinder<T> newRealOptionalBinder(Binder binder, Key<T> type) {
    binder = binder.skipSources(RealOptionalBinder.class);
    RealOptionalBinder<T> optionalBinder = new RealOptionalBinder<>(binder, type);
    binder.install(optionalBinder);
```

### AssignmentToMethodParameter
Assignment to method parameter `binder`
in `core/src/com/google/inject/internal/InjectorShell.java`
#### Snippet
```java
    @Override
    public void configure(Binder binder) {
      binder = binder.withSource(SourceProvider.UNKNOWN_SOURCE);
      binder.bindScope(Singleton.class, SINGLETON);
      binder.bindScope(javax.inject.Singleton.class, SINGLETON);
```

### AssignmentToMethodParameter
Assignment to method parameter `binder`
in `core/src/com/google/inject/internal/ProviderMethod.java`
#### Snippet
```java

  public void configure(Binder binder) {
    binder = binder.withSource(method);

    if (scopeAnnotation != null) {
```

### AssignmentToMethodParameter
Assignment to method parameter `o`
in `core/src/com/google/inject/internal/Messages.java`
#### Snippet
```java
    if (o instanceof ElementSource) {
      source = (ElementSource) o;
      o = source.getDeclaringSource();
    }
    return convert(o, source);
```

### AssignmentToMethodParameter
Assignment to method parameter `binder`
in `core/src/com/google/inject/internal/RealMultibinder.java`
#### Snippet
```java
  /** Implementation of newSetBinder. */
  public static <T> RealMultibinder<T> newRealSetBinder(Binder binder, Key<T> key) {
    binder = binder.skipSources(RealMultibinder.class);
    RealMultibinder<T> result = new RealMultibinder<>(binder, key);
    binder.install(result);
```

### AssignmentToMethodParameter
Assignment to method parameter `inMemoryStackTraceElement`
in `core/src/com/google/inject/internal/util/StackTraceElements.java`
#### Snippet
```java
      return cached;
    }
    inMemoryStackTraceElement =
        new InMemoryStackTraceElement(
            weakIntern(inMemoryStackTraceElement.getClassName()),
```

### AssignmentToMethodParameter
Assignment to method parameter `key`
in `core/src/com/google/inject/internal/InjectorImpl.java`
#### Snippet
```java
    }

    key = MoreTypes.canonicalizeKey(key); // before storing the key long-term, canonicalize it.
    BindingImpl<T> binding = createJustInTimeBinding(key, errors, jitDisabled, jitType);
    jitBindingData.banKeyInParent(key, bindingData, binding.getSource());
```

### AssignmentToMethodParameter
Assignment to method parameter `binder`
in `extensions/testlib/src/com/google/inject/testing/fieldbinder/BoundFieldModule.java`
#### Snippet
```java
  @Override
  public void configure(Binder binder) {
    binder = binder.skipSources(BoundFieldModule.class);

    for (Message message : deferredBindingErrors) {
```

### AssignmentToMethodParameter
Assignment to method parameter `binder`
in `core/src/com/google/inject/internal/RealMapBinder.java`
#### Snippet
```java
  public static <K, V> RealMapBinder<K, V> newMapRealBinder(
      Binder binder, TypeLiteral<K> keyType, TypeLiteral<V> valueType) {
    binder = binder.skipSources(RealMapBinder.class);
    return newRealMapBinder(
        binder,
```

### AssignmentToMethodParameter
Assignment to method parameter `binder`
in `core/src/com/google/inject/internal/RealMapBinder.java`
#### Snippet
```java
  public static <K, V> RealMapBinder<K, V> newRealMapBinder(
      Binder binder, TypeLiteral<K> keyType, TypeLiteral<V> valueType, Annotation annotation) {
    binder = binder.skipSources(RealMapBinder.class);
    return newRealMapBinder(
        binder,
```

### AssignmentToMethodParameter
Assignment to method parameter `binder`
in `core/src/com/google/inject/internal/RealMapBinder.java`
#### Snippet
```java
      TypeLiteral<V> valueType,
      Class<? extends Annotation> annotationType) {
    binder = binder.skipSources(RealMapBinder.class);
    return newRealMapBinder(
        binder,
```

### AssignmentToMethodParameter
Assignment to method parameter `binder`
in `core/src/com/google/inject/internal/RealMapBinder.java`
#### Snippet
```java
  static <K, V> RealMapBinder<K, V> newRealMapBinder(
      Binder binder, TypeLiteral<K> keyType, Key<V> valueTypeAndAnnotation) {
    binder = binder.skipSources(RealMapBinder.class);
    TypeLiteral<V> valueType = valueTypeAndAnnotation.getTypeLiteral();
    return newRealMapBinder(
```

## RuleId[id=UnnecessaryContinue]
### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `extensions/persist/src/com/google/inject/persist/jpa/JpaFinderProxy.java`
#### Snippet
```java
      //noinspection UnnecessaryContinue
      {
        continue; //skip param as it's not bindable
      } else if (annotation instanceof Named) {
        Named named = (Named) annotation;
```

## RuleId[id=SynchronizationOnLocalVariableOrMethodParameter]
### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `session`
in `extensions/servlet/src/com/google/inject/servlet/ServletScopes.java`
#### Snippet
```java
        public T get() {
          HttpSession session = GuiceFilter.getRequest(key).getSession();
          synchronized (session) {
            Object obj = session.getAttribute(name);
            if (NullObject.INSTANCE == obj) {
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `request`
in `extensions/servlet/src/com/google/inject/servlet/ServletScopes.java`
#### Snippet
```java
          }
          String name = key.toString();
          synchronized (request) {
            Object obj = request.getAttribute(name);
            if (NullObject.INSTANCE == obj) {
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `enhancers`
in `core/src/com/google/inject/internal/aop/EnhancerBuilderImpl.java`
#### Snippet
```java
    Map<BitSet, Function<String, BiFunction<Object, Object[], Object>>> enhancers =
        ENHANCERS.get(hostClass);
    synchronized (enhancers) {
      return enhancers.computeIfAbsent(methodIndices, this::doBuildEnhancer);
    }
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `extensions/dagger-adapter/src/com/google/inject/daggeradapter/DaggerMethodScanner.java`
#### Snippet
```java
    Method method = (Method) injectionPoint.getMember();
    if (!predicate.apply(method)) {
      return null;
    }
    Class<? extends Annotation> annotationType = annotation.annotationType();
```

### ReturnNull
Return of `null`
in `extensions/dagger-adapter/src/com/google/inject/daggeradapter/DaggerMethodScanner.java`
#### Snippet
```java
    } else if (annotationType.equals(Binds.class)) {
      configureBindsKey(binder, method, key);
      return null;
    } else if (annotationType.equals(Multibinds.class)) {
      configureMultibindsKey(binder, method, key);
```

### ReturnNull
Return of `null`
in `extensions/dagger-adapter/src/com/google/inject/daggeradapter/DaggerMethodScanner.java`
#### Snippet
```java
    } else if (annotationType.equals(Multibinds.class)) {
      configureMultibindsKey(binder, method, key);
      return null;
    } else if (annotationType.equals(BindsOptionalOf.class)) {
      OptionalBinder.newOptionalBinder(binder, key);
```

### ReturnNull
Return of `null`
in `extensions/dagger-adapter/src/com/google/inject/daggeradapter/DaggerMethodScanner.java`
#### Snippet
```java
    } else if (annotationType.equals(BindsOptionalOf.class)) {
      OptionalBinder.newOptionalBinder(binder, key);
      return null;
    }

```

### ReturnNull
Return of `null`
in `extensions/persist/src/com/google/inject/persist/finder/DynamicFinder.java`
#### Snippet
```java
   */
  public static DynamicFinder from(Method method) {
    return method.isAnnotationPresent(Finder.class) ? new DynamicFinder(method) : null;
  }

```

### ReturnNull
Return of `null`
in `extensions/servlet/src/com/google/inject/servlet/ServletUtils.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `extensions/servlet/src/com/google/inject/servlet/ManagedServletPipeline.java`
#### Snippet
```java

    //otherwise, can't process
    return null;
  }

```

### ReturnNull
Return of `null`
in `extensions/servlet/src/com/google/inject/servlet/FilterDefinition.java`
#### Snippet
```java
      return filter.get();
    } else {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `extensions/servlet/src/com/google/inject/servlet/FilterChainInvocation.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `extensions/servlet/src/com/google/inject/servlet/UriPatternType.java`
#### Snippet
```java
        }
      }
      return null;
    }

```

### ReturnNull
Return of `null`
in `extensions/servlet/src/com/google/inject/servlet/UriPatternType.java`
#### Snippet
```java
    public String extractPath(String path) {
      if (patternKind == Kind.PREFIX) {
        return null;
      } else if (patternKind == Kind.SUFFIX) {
        String extract = literal;
```

### ReturnNull
Return of `null`
in `extensions/servlet/src/com/google/inject/servlet/UriPatternType.java`
#### Snippet
```java
        return new RegexUriPatternMatcher(pattern);
      default:
        return null;
    }
  }
```

### ReturnNull
Return of `null`
in `extensions/servlet/src/com/google/inject/servlet/ServletDefinition.java`
#### Snippet
```java
            final String info = getPathInfo();

            return (null == info) ? null : getRealPath(info);
          }

```

### ReturnNull
Return of `null`
in `core/src/com/google/inject/Scopes.java`
#### Snippet
```java
      return ((BindingImpl<?>) linkedKeyBinding).getInjector();
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `core/src/com/google/inject/spi/DefaultBindingScopingVisitor.java`
#### Snippet
```java
  /** Default visit implementation. Returns {@code null}. */
  protected V visitOther() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `extensions/servlet/src/com/google/inject/servlet/ServletScopes.java`
#### Snippet
```java
            Object obj = session.getAttribute(name);
            if (NullObject.INSTANCE == obj) {
              return null;
            }
            @SuppressWarnings("unchecked")
```

### ReturnNull
Return of `null`
in `extensions/servlet/src/com/google/inject/servlet/ServletScopes.java`
#### Snippet
```java
              // Accounts for @Nullable providers.
              if (NullObject.INSTANCE == t) {
                return null;
              }

```

### ReturnNull
Return of `null`
in `extensions/servlet/src/com/google/inject/servlet/ServletScopes.java`
#### Snippet
```java
            Object obj = request.getAttribute(name);
            if (NullObject.INSTANCE == obj) {
              return null;
            }
            @SuppressWarnings("unchecked")
```

### ReturnNull
Return of `null`
in `core/src/com/google/inject/Key.java`
#### Snippet
```java
    @Override
    public Class<? extends Annotation> getAnnotationType() {
      return null;
    }

```

### ReturnNull
Return of `null`
in `core/src/com/google/inject/Key.java`
#### Snippet
```java
    @Override
    public Annotation getAnnotation() {
      return null;
    }

```

### ReturnNull
Return of `null`
in `core/src/com/google/inject/spi/DefaultBindingTargetVisitor.java`
#### Snippet
```java
  /** Default visit implementation. Returns {@code null}. */
  protected V visitOther(Binding<? extends T> binding) {
    return null;
  }

```

### ReturnNull
Return of `null`
in `core/src/com/google/inject/spi/DefaultElementVisitor.java`
#### Snippet
```java
  /** Default visit implementation. Returns {@code null}. */
  protected V visitOther(Element element) {
    return null;
  }

```

### ReturnNull
Return of `null`
in `core/src/com/google/inject/internal/WeakKeySet.java`
#### Snippet
```java
    evictionCache.cleanUp();
    Multiset<Object> sources = (backingMap == null) ? null : backingMap.get(key);
    return (sources == null) ? null : sources.elementSet();
  }

```

### ReturnNull
Return of `null`
in `core/src/com/google/inject/internal/ProviderMethodsModule.java`
#### Snippet
```java
          key,
          method);
      return null;
    }

```

### ReturnNull
Return of `null`
in `core/src/com/google/inject/internal/ProviderMethodsModule.java`
#### Snippet
```java

    if (key == null) { // scanner returned null. Skipping the binding.
      return null;
    }

```

### ReturnNull
Return of `null`
in `core/src/com/google/inject/internal/ProviderMethodsModule.java`
#### Snippet
```java
  private Annotation getAnnotation(Binder binder, Method method) {
    if (method.isBridge() || method.isSynthetic()) {
      return null;
    }
    Annotation annotation = null;
```

### ReturnNull
Return of `null`
in `core/src/com/google/inject/internal/ProviderMethodsModule.java`
#### Snippet
```java
                  + " Methods can only have one annotation claimed per scanner.",
              scanner, method);
          return null;
        }
        annotation = foundAnnotation;
```

### ReturnNull
Return of `null`
in `core/src/com/google/inject/internal/Scoping.java`
#### Snippet
```java
  /** Returns the scope instance, or {@code null} if that isn't known for this instance. */
  public Scope getScopeInstance() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `core/src/com/google/inject/internal/Scoping.java`
#### Snippet
```java
  /** Returns the scope annotation, or {@code null} if that isn't known for this instance. */
  public Class<? extends Annotation> getScopeAnnotation() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `core/src/com/google/inject/internal/MoreTypes.java`
#### Snippet
```java
  private static Class<?> declaringClassOf(TypeVariable<?> typeVariable) {
    GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
    return genericDeclaration instanceof Class ? (Class<?>) genericDeclaration : null;
  }

```

### ReturnNull
Return of `null`
in `core/src/com/google/inject/internal/ProvisionListenerCallbackStore.java`
#### Snippet
```java
          (ProvisionListenerStackCallback<T>)
              cache.getUnchecked(new KeyBinding(binding.getKey(), binding));
      return callback.hasListeners() ? callback : null;
    }
    return null;
```

### ReturnNull
Return of `null`
in `core/src/com/google/inject/internal/ProvisionListenerCallbackStore.java`
#### Snippet
```java
      return callback.hasListeners() ? callback : null;
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `core/src/com/google/inject/internal/Messages.java`
#### Snippet
```java

      if (onlyCause != null && !ThrowableEquivalence.INSTANCE.equivalent(onlyCause, messageCause)) {
        return null;
      }

```

### ReturnNull
Return of `null`
in `core/src/com/google/inject/internal/BytecodeGen.java`
#### Snippet
```java
      return fastClass(constructor).apply(signature(constructor));
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `core/src/com/google/inject/internal/BytecodeGen.java`
#### Snippet
```java
      return fastClass(method).apply(signature(method));
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `core/src/com/google/inject/internal/SingletonScope.java`
#### Snippet
```java
          @SuppressWarnings("unchecked")
          T initializedTypedInstance = (T) initializedInstance;
          return initializedInstance == NULL ? null : initializedTypedInstance;
        } else {
          // singleton is already initialized and local cache can be used
```

### ReturnNull
Return of `null`
in `core/src/com/google/inject/internal/SingletonScope.java`
#### Snippet
```java
          @SuppressWarnings("unchecked")
          T typedInitialIntance = (T) initialInstance;
          return initialInstance == NULL ? null : typedInitialIntance;
        }
      }
```

### ReturnNull
Return of `null`
in `core/src/com/google/inject/internal/aop/UnsafeClassDefiner.java`
#### Snippet
```java
    } catch (Throwable e) {
      logger.log(Level.FINE, errorMessage, e);
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `core/src/com/google/inject/internal/util/LineNumbers.java`
#### Snippet
```java
        int access, String name, String desc, String signature, String[] exceptions) {
      if ((access & Opcodes.ACC_PRIVATE) != 0) {
        return null;
      }
      pendingMethod = name + desc;
```

### ReturnNull
Return of `null`
in `core/src/com/google/inject/internal/util/LineNumbers.java`
#### Snippet
```java
    public FieldVisitor visitField(
        int access, String name, String desc, String signature, Object value) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `core/src/com/google/inject/internal/InjectorImpl.java`
#### Snippet
```java
      throws ErrorsException {
    if (parameters.isEmpty()) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `core/src/com/google/inject/internal/InjectorImpl.java`
#### Snippet
```java
    BindingImpl<String> stringBinding = bindingData.getExplicitBinding(stringKey);
    if (stringBinding == null || !stringBinding.isConstant()) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `core/src/com/google/inject/internal/InjectorImpl.java`
#### Snippet
```java
    if (typeConverterBinding == null) {
      // No converter can handle the given type.
      return null;
    }

```

### ReturnNull
Return of `null`
in `core/src/com/google/inject/internal/InjectorImpl.java`
#### Snippet
```java

    // No existing binding exists.
    return null;
  }

```

### ReturnNull
Return of `null`
in `extensions/assistedinject/src/com/google/inject/assistedinject/internal/LookupTester.java`
#### Snippet
```java
  interface Hidden {
    default Hidden method() {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `extensions/assistedinject/src/com/google/inject/assistedinject/FactoryProvider2.java`
#### Snippet
```java
    static MethodHandle superMethodHandle(Method method) throws ReflectiveOperationException {
      if (privateLookupCxtor == null) {
        return null; // fall back to assistDataBuilder workaround
      }
      Class<?> declaringClass = method.getDeclaringClass();
```

### ReturnNull
Return of `null`
in `extensions/assistedinject/src/com/google/inject/assistedinject/FactoryProvider2.java`
#### Snippet
```java
    MethodHandles.Lookup lookup = userLookups == null ? MethodHandles.lookup() : userLookups;
    MethodHandle handle = strategy.superMethodHandle(method, lookup);
    return handle != null ? handle.bindTo(proxy) : null;
  }

```

### ReturnNull
Return of `null`
in `extensions/assistedinject/src/com/google/inject/assistedinject/FactoryProvider2.java`
#### Snippet
```java
        // but we target JDK8.
        // TODO(sameb): When we drop JDK8 support, catch ReflectiveOperation|Security|Inaccessible
        return null;
      }
    }
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `builder` is redundant
in `core/src/com/google/inject/spi/Elements.java`
#### Snippet
```java
    @Override
    public <T> AnnotatedBindingBuilder<T> bind(Key<T> key) {
      BindingBuilder<T> builder =
          new BindingBuilder<T>(this, elements, getElementSource(), MoreTypes.canonicalizeKey(key));
      return builder;
```

### UnnecessaryLocalVariable
Local variable `t` is redundant
in `core/src/com/google/inject/internal/ProviderToInternalFactoryAdapter.java`
#### Snippet
```java
      // scoping implicit bindings.  If we are not actually a linked
      // binding, we'll fail properly elsewhere in the chain.
      T t = internalFactory.get(context, context.getDependency(), true);
      return t;
    } catch (InternalProvisionException e) {
```

### UnnecessaryLocalVariable
Local variable `localTargetKey` is redundant
in `core/src/com/google/inject/internal/FactoryProxy.java`
#### Snippet
```java
  public T get(InternalContext context, Dependency<?> dependency, boolean linked)
      throws InternalProvisionException {
    Key<? extends T> localTargetKey = targetKey;
    try {
      return targetFactory.get(context, dependency, true);
```

### UnnecessaryLocalVariable
Local variable `exception` is redundant
in `core/src/com/google/inject/internal/Errors.java`
#### Snippet
```java
    }

    ConfigurationException exception = new ConfigurationException(getMessages());
    throw exception;
  }
```

### UnnecessaryLocalVariable
Local variable `exception` is redundant
in `core/src/com/google/inject/internal/Errors.java`
#### Snippet
```java
    }

    CreationException exception = new CreationException(getMessages());
    throw exception;
  }
```

### UnnecessaryLocalVariable
Local variable `exception` is redundant
in `core/src/com/google/inject/internal/Errors.java`
#### Snippet
```java
      return;
    }
    ProvisionException exception = new ProvisionException(getMessages());
    throw exception;
  }
```

### UnnecessaryLocalVariable
Local variable `exception` is redundant
in `core/src/com/google/inject/internal/InternalProvisionException.java`
#### Snippet
```java
  /** Returns this exception convered to a ProvisionException. */
  public ProvisionException toProvisionException() {
    ProvisionException exception = new ProvisionException(getErrors());
    return exception;
  }
```

### UnnecessaryLocalVariable
Local variable `localProviderKey` is redundant
in `core/src/com/google/inject/internal/ProvidedByInternalFactory.java`
#### Snippet
```java
      throw new IllegalStateException("not initialized");
    }
    Key<? extends Provider<T>> localProviderKey = providerKey;
    try {
      Provider<? extends T> provider =
```

### UnnecessaryLocalVariable
Local variable `exception` is redundant
in `core/src/com/google/inject/internal/InjectorImpl.java`
#### Snippet
```java
      return result;
    } catch (ErrorsException e) {
      ConfigurationException exception =
          new ConfigurationException(errors.merge(e.getErrors()).getMessages());
      throw exception;
```

### UnnecessaryLocalVariable
Local variable `exception` is redundant
in `core/src/com/google/inject/internal/InjectorImpl.java`
#### Snippet
```java
      return membersInjectorStore.get(typeLiteral, errors);
    } catch (ErrorsException e) {
      ConfigurationException exception =
          new ConfigurationException(errors.merge(e.getErrors()).getMessages());
      throw exception;
```

### UnnecessaryLocalVariable
Local variable `source` is redundant
in `core/src/com/google/inject/internal/InjectorImpl.java`
#### Snippet
```java
    ProvidedByInternalFactory<T> internalFactory =
        new ProvidedByInternalFactory<T>(rawType, providerType, providerKey);
    Object source = rawType;
    BindingImpl<T> binding =
        LinkedProviderBindingImpl.createWithInitializer(
```

### UnnecessaryLocalVariable
Local variable `t` is redundant
in `core/src/com/google/inject/internal/InjectorImpl.java`
#### Snippet
```java
        InternalContext currentContext = enterContext();
        try {
          T t = internalFactory.get(currentContext, dependency, false);
          return t;
        } catch (InternalProvisionException e) {
```

### UnnecessaryLocalVariable
Local variable `exception` is redundant
in `core/src/com/google/inject/internal/InjectorImpl.java`
#### Snippet
```java
      return result;
    } catch (ErrorsException e) {
      ConfigurationException exception =
          new ConfigurationException(errors.merge(e.getErrors()).getMessages());

```

### UnnecessaryLocalVariable
Local variable `source` is redundant
in `core/src/com/google/inject/internal/InjectorImpl.java`
#### Snippet
```java
    // Look up the target binding.
    final Key<? extends T> targetKey = Key.get(subclass);
    Object source = rawType;
    FactoryProxy<T> factory = new FactoryProxy<>(this, key, targetKey, source);
    factory.notify(errors); // causes the factory to initialize itself internally
```

### UnnecessaryLocalVariable
Local variable `exception` is redundant
in `core/src/com/google/inject/internal/InjectorImpl.java`
#### Snippet
```java
        }
      } catch (ErrorsException e) {
        ConfigurationException exception = new ConfigurationException(e.getErrors().getMessages());
        throw exception;
      }
```

### UnnecessaryLocalVariable
Local variable `bindingsArray` is redundant
in `core/src/com/google/inject/internal/RealMapBinder.java`
#### Snippet
```java
          @SuppressWarnings({"unchecked", "rawtypes"})
          Binding<V>[] typedBindings = new Binding[bindings.size()];
          Binding<V>[] bindingsArray = typedBindings;
          int j = 0;
          for (Binding<V> binding : bindings) {
```

### UnnecessaryLocalVariable
Local variable `userSuppliedProvider` is redundant
in `core/src/com/google/inject/internal/RealMapBinder.java`
#### Snippet
```java
          Provider<Map.Entry<K, Provider<V>>> typedProvider =
              (Provider<Map.Entry<K, Provider<V>>>) entryBinding.getUserSuppliedProvider();
          Provider<Map.Entry<K, Provider<V>>> userSuppliedProvider = typedProvider;

          if (userSuppliedProvider instanceof ProviderMapEntry) {
```

### UnnecessaryLocalVariable
Local variable `entry` is redundant
in `core/src/com/google/inject/internal/RealMapBinder.java`
#### Snippet
```java
            ProviderMapEntry<K, V> typedUserSuppliedProvider =
                (ProviderMapEntry<K, V>) userSuppliedProvider;
            ProviderMapEntry<K, V> entry = typedUserSuppliedProvider;

            keyToValueKeyBuilder.put(entry.getKey(), entry.getValueKey());
```

## RuleId[id=CastCanBeRemovedNarrowingVariableType]
### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'o' to 'T'
in `core/src/com/google/inject/internal/ProvidedByInternalFactory.java`
#### Snippet
```java
      }
      @SuppressWarnings("unchecked") // protected by isInstance() check above
      T t = (T) o;
      return t;
    } catch (RuntimeException e) {
```

### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'entry' to 'Binding'
in `core/src/com/google/inject/internal/RealMultibinder.java`
#### Snippet
```java
        if (keyMatches(entry.getKey())) {
          @SuppressWarnings("unchecked") // protected by findBindingsByType()
          Binding<T> binding = (Binding<T>) entry;
          if (index.add(binding.acceptTargetVisitor(indexer))) {
            // TODO(lukes): most of these are linked bindings since user bindings are linked to
```

