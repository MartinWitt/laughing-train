# guice 
 
# Bad smells
I found 283 bad smells with 44 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| JavadocReference | 48 | false |
| Deprecation | 20 | false |
| UnnecessaryLocalVariable | 18 | true |
| UnnecessaryModifier | 15 | true |
| JavadocLinkAsPlainText | 11 | false |
| TypeParameterExtendsObject | 10 | false |
| DataFlowIssue | 10 | false |
| DeprecatedIsStillUsed | 10 | false |
| FieldMayBeFinal | 8 | false |
| ToArrayCallWithZeroLengthArrayArgument | 7 | true |
| UNCHECKED_WARNING | 7 | false |
| FinalMethodInFinalClass | 6 | false |
| UnnecessarySemicolon | 6 | false |
| TypeParameterHidesVisibleType | 6 | false |
| DuplicatedCode | 6 | false |
| RedundantCast | 6 | false |
| RegExpRedundantEscape | 5 | false |
| FinalStaticMethod | 5 | false |
| WebProperties | 5 | false |
| OptionalUsedAsFieldOrParameterType | 5 | false |
| EqualsBetweenInconvertibleTypes | 4 | false |
| DuplicateCondition | 4 | false |
| FieldCanBeLocal | 4 | false |
| ExtendsAnnotation | 4 | false |
| ConstantValue | 4 | false |
| StringConcatenationInsideStringBufferAppend | 4 | false |
| JavadocDeclaration | 4 | false |
| DanglingJavadoc | 3 | false |
| SynchronizationOnLocalVariableOrMethodParameter | 3 | false |
| ArraysAsListWithZeroOrOneArgument | 3 | false |
| RegExpSimplifiable | 2 | false |
| RedundantTypeArguments | 2 | false |
| DefaultAnnotationParam | 2 | false |
| OptionalGetWithoutIsPresent | 2 | false |
| CatchMayIgnoreException | 2 | false |
| ProtectedMemberInFinalClass | 2 | true |
| TrivialIf | 2 | false |
| CastCanBeRemovedNarrowingVariableType | 2 | false |
| EmptyStatementBody | 1 | false |
| FinalPrivateMethod | 1 | false |
| UnnecessaryReturn | 1 | true |
| TrivialStringConcatenation | 1 | false |
| SuspiciousInvocationHandlerImplementation | 1 | false |
| IgnoreResultOfCall | 1 | false |
| IntegerMultiplicationImplicitCastToLong | 1 | false |
| PointlessNullCheck | 1 | false |
| UnusedAssignment | 1 | false |
| OptionalIsPresent | 1 | false |
| JavaReflectionMemberAccess | 1 | false |
| CollectionAddAllCanBeReplacedWithConstructor | 1 | false |
| UnnecessaryToStringCall | 1 | true |
| CaughtExceptionImmediatelyRethrown | 1 | false |
| InstantiationOfUtilityClass | 1 | false |
| UnnecessaryContinue | 1 | false |
## RuleId[id=ToArrayCallWithZeroLengthArrayArgument]
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

## RuleId[id=UnnecessaryModifier]
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
Modifier `static` is redundant for inner enums
in `extensions/assistedinject/src/com/google/inject/assistedinject/FactoryProvider2.java`
#### Snippet
```java
  }

  private static enum SuperMethodLookup {
    UNREFLECT_SPECIAL {
      @Override
```

## RuleId[id=EmptyStatementBody]
### EmptyStatementBody
`if` statement has empty body
in `extensions/servlet/src/com/google/inject/servlet/ServletUtils.java`
#### Snippet
```java
      String normalized =
          UrlEscapers.urlPathSegmentEscaper().escape(lenientDecode(segment, UTF_8, false));
      if (".".equals(normalized)) {
        // skip
      } else if ("..".equals(normalized)) {
```

## RuleId[id=RegExpRedundantEscape]
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

## RuleId[id=FinalMethodInFinalClass]
### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `core/src/com/google/inject/internal/DuplicateMapKeyError.java`
#### Snippet
```java

  @Override
  protected final void formatDetail(List<ErrorDetail<?>> others, Formatter formatter) {
    formatter.format("\n%s\n", Messages.bold("Duplicates:"));

```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `core/src/com/google/inject/internal/Messages.java`
#### Snippet
```java
  }

  public static final String underline(String text) {
    return formatText(text, FormatOptions.UNDERLINE);
  }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `core/src/com/google/inject/internal/Messages.java`
#### Snippet
```java
  }

  private static final String formatText(String text, FormatOptions... options) {
    if (!InternalFlags.enableColorizeErrorMessages()) {
      return text;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `core/src/com/google/inject/internal/Messages.java`
#### Snippet
```java
  }

  public static final String faint(String text) {
    return formatText(text, FormatOptions.FAINT);
  }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `core/src/com/google/inject/internal/Messages.java`
#### Snippet
```java
  }

  public static final String redBold(String text) {
    return formatText(text, FormatOptions.RED, FormatOptions.BOLD);
  }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `core/src/com/google/inject/internal/Messages.java`
#### Snippet
```java
  }

  public static final String bold(String text) {
    return formatText(text, FormatOptions.BOLD);
  }
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

### RegExpSimplifiable
`[/]` can be simplified to '/'
in `extensions/servlet/src/com/google/inject/servlet/ServletDefinition.java`
#### Snippet
```java
              // https://github.com/google/guice/issues/1655, contextPath is occasionally null
              int contextPathLength = contextPath != null ? contextPath.length() : 0;
              pathInfo = requestUri.substring(contextPathLength).replaceAll("[/]{2,}", "/");
              // See: https://github.com/google/guice/issues/372
              if (pathInfo.startsWith(servletPath)) {
```

## RuleId[id=Deprecation]
### Deprecation
'com.google.inject.matcher.AbstractMatcher' is deprecated
in `core/src/com/google/inject/matcher/Matchers.java`
#### Snippet
```java
  }

  private static class SubclassesOf extends AbstractMatcher<Class> implements Serializable {
    private final Class<?> superclass;

```

### Deprecation
'getPackage(java.lang.String)' is deprecated
in `core/src/com/google/inject/matcher/Matchers.java`
#### Snippet
```java

    public Object readResolve() {
      return inPackage(Package.getPackage(packageName));
    }

```

### Deprecation
'com.google.inject.matcher.AbstractMatcher' is deprecated
in `core/src/com/google/inject/matcher/Matchers.java`
#### Snippet
```java
  }

  private static class AnnotatedWith extends AbstractMatcher<AnnotatedElement>
      implements Serializable {
    private final Annotation annotation;
```

### Deprecation
'com.google.inject.matcher.AbstractMatcher' is deprecated
in `core/src/com/google/inject/matcher/Matchers.java`
#### Snippet
```java
  }

  private static class Only extends AbstractMatcher<Object> implements Serializable {
    private final Object value;

```

### Deprecation
'com.google.inject.matcher.AbstractMatcher' is deprecated
in `core/src/com/google/inject/matcher/Matchers.java`
#### Snippet
```java
  }

  private static class AnnotatedWithType extends AbstractMatcher<AnnotatedElement>
      implements Serializable {
    private final Class<? extends Annotation> annotationType;
```

### Deprecation
'com.google.inject.matcher.AbstractMatcher' is deprecated
in `core/src/com/google/inject/matcher/Matchers.java`
#### Snippet
```java
  }

  private static class Not<T> extends AbstractMatcher<T> implements Serializable {
    final Matcher<? super T> delegate;

```

### Deprecation
'com.google.inject.matcher.AbstractMatcher' is deprecated
in `core/src/com/google/inject/matcher/Matchers.java`
#### Snippet
```java
  }

  static class AndMatcher<T> extends AbstractMatcher<T> implements Serializable {
    private final Matcher<? super T> a, b;

```

### Deprecation
'com.google.inject.matcher.AbstractMatcher' is deprecated
in `core/src/com/google/inject/matcher/Matchers.java`
#### Snippet
```java
  }

  static class OrMatcher<T> extends AbstractMatcher<T> implements Serializable {
    private final Matcher<? super T> a, b;

```

### Deprecation
'com.google.inject.matcher.AbstractMatcher' is deprecated
in `core/src/com/google/inject/matcher/Matchers.java`
#### Snippet
```java
  }

  private static class IdenticalTo extends AbstractMatcher<Object> implements Serializable {
    private final Object value;

```

### Deprecation
'com.google.inject.matcher.AbstractMatcher' is deprecated
in `core/src/com/google/inject/matcher/Matchers.java`
#### Snippet
```java
  }

  private static class Returns extends AbstractMatcher<Method> implements Serializable {
    private final Matcher<? super Class<?>> returnType;

```

### Deprecation
'com.google.inject.matcher.AbstractMatcher' is deprecated
in `core/src/com/google/inject/matcher/Matchers.java`
#### Snippet
```java
  private static final Matcher<Object> ANY = new Any();

  private static class Any extends AbstractMatcher<Object> implements Serializable {
    @Override
    public boolean matches(Object o) {
```

### Deprecation
'com.google.inject.matcher.AbstractMatcher' is deprecated
in `core/src/com/google/inject/matcher/Matchers.java`
#### Snippet
```java
  }

  private static class InSubpackage extends AbstractMatcher<Class> implements Serializable {
    private final String targetPackageName;

```

### Deprecation
'com.google.inject.matcher.AbstractMatcher' is deprecated
in `core/src/com/google/inject/matcher/Matchers.java`
#### Snippet
```java
  }

  private static class InPackage extends AbstractMatcher<Class> implements Serializable {
    private final transient Package targetPackage;
    private final String packageName;
```

### Deprecation
'com.google.inject.matcher.AbstractMatcher' is deprecated
in `core/src/com/google/inject/internal/TypeConverterBindingProcessor.java`
#### Snippet
```java
    internalConvertToTypes(
        injector,
        new AbstractMatcher<TypeLiteral<?>>() {
          @Override
          public boolean matches(TypeLiteral<?> typeLiteral) {
```

### Deprecation
'com.google.inject.matcher.AbstractMatcher' is deprecated
in `core/src/com/google/inject/internal/TypeConverterBindingProcessor.java`
#### Snippet
```java
    internalConvertToTypes(
        injector,
        new AbstractMatcher<TypeLiteral<?>>() {
          @Override
          public boolean matches(TypeLiteral<?> typeLiteral) {
```

### Deprecation
'finalize()' is deprecated
in `core/src/com/google/inject/internal/BytecodeGen.java`
#### Snippet
```java
     *
     * <p>Package-private methods can only be enhanced if they're in the same package as the host
     * and we can define types in the same class loader with Unsafe. The {@link #finalize} method
     * can never be enhanced.
     */
```

### Deprecation
'com.google.inject.assistedinject.FactoryProvider' is deprecated
in `extensions/assistedinject/src/com/google/inject/assistedinject/AssistedInject.java`
#### Snippet
```java
 * AOP).
 *
 * <p><strong>Obsolete Usage:</strong> When used in tandem with {@link FactoryProvider},
 * constructors annotated with {@code @AssistedInject} trigger a "backwards compatibility mode". The
 * assisted parameters must exactly match one corresponding factory method within the factory
```

### Deprecation
'com.google.inject.matcher.AbstractMatcher' is deprecated
in `extensions/persist/src/com/google/inject/persist/PersistModule.java`
#### Snippet
```java

  private static final Matcher<Method> NOT_OBJECT_METHOD =
      new AbstractMatcher<Method>() {
        @Override
        public boolean matches(Method m) {
```

### Deprecation
'com.google.inject.throwingproviders.ThrowingProvider' is deprecated
in `extensions/throwingproviders/src/com/google/inject/throwingproviders/ProviderChecker.java`
#### Snippet
```java
        interfaceType);

    boolean tpMode = interfaceType.getInterfaces()[0] == ThrowingProvider.class;
    if (!tpMode) {
      checkArgument(
```

### Deprecation
'newInstance()' is deprecated
in `extensions/jmx/src/com/google/inject/tools/jmx/Manager.java`
#### Snippet
```java
    }

    Module module = (Module) Class.forName(args[0]).newInstance();
    Injector injector = Guice.createInjector(module);

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

## RuleId[id=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `core/src/com/google/inject/util/Modules.java`
#### Snippet
```java
              sb.append("\n     original binding at " + Errors.convert(scopeBinding.getSource()));
              for (Object usedSource : usedSources) {
                sb.append("\n     bound directly at " + Errors.convert(usedSource) + "");
              }
              binder
```

## RuleId[id=FinalStaticMethod]
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

  public static final String redBold(String text) {
    return formatText(text, FormatOptions.RED, FormatOptions.BOLD);
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

## RuleId[id=RedundantTypeArguments]
### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/com/google/inject/internal/InjectorImpl.java`
#### Snippet
```java
            key,
            source,
            Scoping.<T>scope(key, this, internalFactory, source, scoping),
            scoping,
            providerKey,
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/com/google/inject/internal/InjectorImpl.java`
#### Snippet
```java
        key,
        source,
        Scoping.<T>scope(key, this, factory, source, scoping),
        scoping,
        targetKey);
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

## RuleId[id=EqualsBetweenInconvertibleTypes]
### EqualsBetweenInconvertibleTypes
`equals` between objects of inconvertible types 'Class' and 'Class'
in `extensions/dagger-adapter/src/com/google/inject/daggeradapter/DaggerMethodScanner.java`
#### Snippet
```java
    }
    Class<? extends Annotation> annotationType = annotation.annotationType();
    if (annotationType.equals(Provides.class)) {
      return processMultibindingAnnotations(binder, method, key);
    } else if (annotationType.equals(Binds.class)) {
```

### EqualsBetweenInconvertibleTypes
`equals` between objects of inconvertible types 'Class' and 'Class'
in `extensions/dagger-adapter/src/com/google/inject/daggeradapter/DaggerMethodScanner.java`
#### Snippet
```java
    if (annotationType.equals(Provides.class)) {
      return processMultibindingAnnotations(binder, method, key);
    } else if (annotationType.equals(Binds.class)) {
      configureBindsKey(binder, method, key);
      return null;
```

### EqualsBetweenInconvertibleTypes
`equals` between objects of inconvertible types 'Class' and 'Class'
in `extensions/dagger-adapter/src/com/google/inject/daggeradapter/DaggerMethodScanner.java`
#### Snippet
```java
      configureBindsKey(binder, method, key);
      return null;
    } else if (annotationType.equals(Multibinds.class)) {
      configureMultibindsKey(binder, method, key);
      return null;
```

### EqualsBetweenInconvertibleTypes
`equals` between objects of inconvertible types 'Class' and 'Class'
in `extensions/dagger-adapter/src/com/google/inject/daggeradapter/DaggerMethodScanner.java`
#### Snippet
```java
      configureMultibindsKey(binder, method, key);
      return null;
    } else if (annotationType.equals(BindsOptionalOf.class)) {
      OptionalBinder.newOptionalBinder(binder, key);
      return null;
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `core/src/com/google/inject/AbstractModule.java`
#### Snippet
```java
 *
 * <p>Simply extend this class, then you can add bindings by either defining @Provides methods (see
 * https://github.com/google/guice/wiki/ProvidesMethods) or implementing {@link #configure()}, and
 * calling the inherited methods which mirror those found in {@link Binder}. For example:
 *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `extensions/assistedinject/src/com/google/inject/assistedinject/Parameter.java`
#### Snippet
```java
   * key is bound and not for injecting.
   *
   * <p>See Guice bug 125, https://github.com/google/guice/issues/125
   */
  public Key<?> fixAnnotations(Key<?> key) {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `extensions/grapher/src/com/google/inject/grapher/graphviz/EdgeStyle.java`
#### Snippet
```java
 * Styles for edges.
 *
 * <p>See: http://www.graphviz.org/doc/info/attrs.html#k:style
 *
 * @author phopkins@gmail.com (Pete Hopkins)
```

### JavadocLinkAsPlainText
Link specified as plain text
in `extensions/grapher/src/com/google/inject/grapher/graphviz/ArrowType.java`
#### Snippet
```java
 * double arrows and such.
 *
 * <p>See: http://www.graphviz.org/doc/info/arrows.html
 *
 * @author phopkins@gmail.com (Pete Hopkins)
```

### JavadocLinkAsPlainText
Link specified as plain text
in `extensions/grapher/src/com/google/inject/grapher/graphviz/NodeShape.java`
#### Snippet
```java
 * Enum for the shapes that are most interesting for Guice graphing.
 *
 * <p>See: http://www.graphviz.org/doc/info/shapes.html
 *
 * @author phopkins@gmail.com (Pete Hopkins)
```

### JavadocLinkAsPlainText
Link specified as plain text
in `extensions/grapher/src/com/google/inject/grapher/graphviz/NodeStyle.java`
#### Snippet
```java
 * Styles for nodes. Similar to {@link EdgeStyle} but with a few more options.
 *
 * <p>See: http://www.graphviz.org/doc/info/attrs.html#k:style
 *
 * @author phopkins@gmail.com (Pete Hopkins)
```

### JavadocLinkAsPlainText
Link specified as plain text
in `extensions/grapher/src/com/google/inject/grapher/graphviz/CompassPoint.java`
#### Snippet
```java
 * Enum for the "compass point" values used to control where edge end points appear on the graph.
 *
 * <p>See: http://www.graphviz.org/doc/info/attrs.html#k:portPos
 *
 * @author phopkins@gmail.com (Pete Hopkins)
```

### JavadocLinkAsPlainText
Link specified as plain text
in `extensions/persist/src/com/google/inject/persist/Transactional.java`
#### Snippet
```java
/**
 * Any method or class marked with this annotation will be considered for transactionality. Consult
 * the documentation on https://github.com/google/guice/wiki/GuicePersist for detailed semantics.
 * Marking a method {@code @Transactional} will start a new transaction before the method executes
 * and commit it after the method returns.
```

### JavadocLinkAsPlainText
Link specified as plain text
in `extensions/servlet/src/com/google/inject/servlet/ServletModule.java`
#### Snippet
```java
   *
   * <ul>
   *   <li>http://www.google.com/ajax.html
   *   <li>http://www.google.com/content/ajax/index
   *   <li>http://www.google.com/it/is_totally_ajaxian
```

### JavadocLinkAsPlainText
Link specified as plain text
in `extensions/servlet/src/com/google/inject/servlet/ServletModule.java`
#### Snippet
```java
   * <ul>
   *   <li>http://www.google.com/ajax.html
   *   <li>http://www.google.com/content/ajax/index
   *   <li>http://www.google.com/it/is_totally_ajaxian
   * </ul>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `extensions/servlet/src/com/google/inject/servlet/ServletModule.java`
#### Snippet
```java
   *   <li>http://www.google.com/ajax.html
   *   <li>http://www.google.com/content/ajax/index
   *   <li>http://www.google.com/it/is_totally_ajaxian
   * </ul>
   *
```

## RuleId[id=DuplicateCondition]
### DuplicateCondition
Duplicate condition `annotation instanceof jakarta.inject.Named`
in `extensions/persist/src/com/google/inject/persist/jpa/JpaFinderProxy.java`
#### Snippet
```java
        Named named = (Named) annotation;
        jpaQuery.setParameter(named.value(), argument);
      } else if (annotation instanceof jakarta.inject.Named) {
        jakarta.inject.Named named = (jakarta.inject.Named) annotation;
        jpaQuery.setParameter(named.value(), argument);
```

### DuplicateCondition
Duplicate condition `annotation instanceof jakarta.inject.Named`
in `extensions/persist/src/com/google/inject/persist/jpa/JpaFinderProxy.java`
#### Snippet
```java
        jakarta.inject.Named named = (jakarta.inject.Named) annotation;
        jpaQuery.setParameter(named.value(), argument);
      } else if (annotation instanceof jakarta.inject.Named) {
        jakarta.inject.Named named = (jakarta.inject.Named) annotation;
        jpaQuery.setParameter(named.value(), argument);
```

### DuplicateCondition
Duplicate condition `jakarta.inject.Named.class.equals(annotationType)`
in `extensions/persist/src/com/google/inject/persist/jpa/JpaFinderProxy.java`
#### Snippet
```java
        Class<? extends Annotation> annotationType = annotation.annotationType();
        if (Named.class.equals(annotationType)
            || jakarta.inject.Named.class.equals(annotationType)
            || jakarta.inject.Named.class.equals(annotationType)) {
          discoveredAnnotations[i] = annotation;
```

### DuplicateCondition
Duplicate condition `jakarta.inject.Named.class.equals(annotationType)`
in `extensions/persist/src/com/google/inject/persist/jpa/JpaFinderProxy.java`
#### Snippet
```java
        if (Named.class.equals(annotationType)
            || jakarta.inject.Named.class.equals(annotationType)
            || jakarta.inject.Named.class.equals(annotationType)) {
          discoveredAnnotations[i] = annotation;
          finderDescriptor.isBindAsRawParameters = false;
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `core/src/com/google/inject/internal/SingleParameterInjector.java`
#### Snippet
```java
  private final Dependency<T> dependency;

  private final Object source;

  private final InternalFactory<? extends T> factory;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `extensions/persist/src/com/google/inject/persist/finder/DynamicFinder.java`
#### Snippet
```java
 */
public final class DynamicFinder {
  private final Method method;
  private final Finder finder;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `extensions/assistedinject/src/com/google/inject/assistedinject/FactoryProvider2.java`
#### Snippet
```java
   */
  @SuppressWarnings("FieldCanBeFinal") // non-final for testing
  private static boolean allowMethodHandleWorkaround = true;

  /** if a factory method parameter isn't annotated, it gets this annotation. */
```

### FieldCanBeLocal
Field can be converted to a local variable
in `extensions/assistedinject/src/com/google/inject/assistedinject/FactoryProvider2.java`
#### Snippet
```java
   */
  @SuppressWarnings("FieldCanBeFinal") // non-final for testing
  private static boolean allowPrivateLookupFallback = true;

  /**
```

## RuleId[id=IgnoreResultOfCall]
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

## RuleId[id=IntegerMultiplicationImplicitCastToLong]
### IntegerMultiplicationImplicitCastToLong
COUNTER.getAndIncrement() \<\< 20: integer shift implicitly cast to long
in `core/src/com/google/inject/internal/aop/AbstractGlueGenerator.java`
#### Snippet
```java
  /** Generates a unique name based on the original class name and marker. */
  private static String proxyName(String hostName, String marker, int hash) {
    long id = ((hash & 0x000FFFFF) | (COUNTER.getAndIncrement() << 20));
    String proxyName = hostName + marker + Long.toHexString(id);
    if (proxyName.startsWith("java/") && !ClassDefining.hasPackageAccess()) {
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
Class 'ActualImpl' implements annotation interface `Actual`
in `core/src/com/google/inject/internal/RealOptionalBinder.java`
#### Snippet
```java
  }

  static class ActualImpl extends BaseAnnotation implements Actual {
    public ActualImpl(String value) {
      super(Actual.class, value);
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

## RuleId[id=PointlessNullCheck]
### PointlessNullCheck
Unnecessary 'null' check before 'equals()' call
in `core/src/com/google/inject/matcher/Matchers.java`
#### Snippet
```java
    public boolean matches(AnnotatedElement element) {
      Annotation fromElement = element.getAnnotation(annotation.annotationType());
      return fromElement != null && annotation.equals(fromElement);
    }

```

## RuleId[id=TypeParameterExtendsObject]
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
  public Indexer.IndexedBinding visit(ConvertedConstantBinding<? extends Object> binding) {
    return new Indexer.IndexedBinding(
        binding, BindingType.CONSTANT, scope(binding), binding.getValue());
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
  public Indexer.IndexedBinding visit(InstanceBinding<? extends Object> binding) {
    return new Indexer.IndexedBinding(
        binding, BindingType.INSTANCE, scope(binding), binding.getInstance());
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

## RuleId[id=ConstantValue]
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

### ConstantValue
Condition `annotation instanceof jakarta.inject.Named` is always `false`
in `extensions/persist/src/com/google/inject/persist/jpa/JpaFinderProxy.java`
#### Snippet
```java
        jakarta.inject.Named named = (jakarta.inject.Named) annotation;
        jpaQuery.setParameter(named.value(), argument);
      } else if (annotation instanceof jakarta.inject.Named) {
        jakarta.inject.Named named = (jakarta.inject.Named) annotation;
        jpaQuery.setParameter(named.value(), argument);
```

### ConstantValue
Condition `jakarta.inject.Named.class.equals(annotationType)` is always `false`
in `extensions/persist/src/com/google/inject/persist/jpa/JpaFinderProxy.java`
#### Snippet
```java
        if (Named.class.equals(annotationType)
            || jakarta.inject.Named.class.equals(annotationType)
            || jakarta.inject.Named.class.equals(annotationType)) {
          discoveredAnnotations[i] = annotation;
          finderDescriptor.isBindAsRawParameters = false;
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

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `extensions/dagger-adapter/src/com/google/inject/daggeradapter/DaggerMethodScanner.java`
#### Snippet
```java
        "Missing @MapKey annotation on method %s (make sure the annotation has RUNTIME rentention)",
        method);
    Annotation mapKey = mapKeyOpt.get();
    MapKey mapKeyDefinition = mapKey.annotationType().getAnnotation(MapKey.class);
    if (!mapKeyDefinition.unwrapValue()) {
```

## RuleId[id=StringConcatenationInsideStringBufferAppend]
### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `core/src/com/google/inject/util/Modules.java`
#### Snippet
```java
                  new StringBuilder(
                      "The scope for @%s is bound directly and cannot be overridden.");
              sb.append("\n     original binding at " + Errors.convert(scopeBinding.getSource()));
              for (Object usedSource : usedSources) {
                sb.append("\n     bound directly at " + Errors.convert(usedSource) + "");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `core/src/com/google/inject/util/Modules.java`
#### Snippet
```java
              sb.append("\n     original binding at " + Errors.convert(scopeBinding.getSource()));
              for (Object usedSource : usedSources) {
                sb.append("\n     bound directly at " + Errors.convert(usedSource) + "");
              }
              binder
```

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

## RuleId[id=OptionalIsPresent]
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

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `core/src/com/google/inject/internal/PackageNameCompressor.java`
#### Snippet
```java
    HashMultimap<String, List<String>> shortNameToPartsMap = HashMultimap.create();
    for (String name : names) {
      List<String> parts = new ArrayList<>(PACKAGE_SPLITTER.splitToList(name));
      // Start with the just the class name as the simple name
      String className = parts.remove(parts.size() - 1);
```

### UNCHECKED_WARNING
Unchecked method 'valueOf(Class, String)' invocation
in `core/src/com/google/inject/internal/TypeConverterBindingProcessor.java`
#### Snippet
```java
          @Override
          public Object convert(String value, TypeLiteral<?> toType) {
            return Enum.valueOf((Class) toType.getRawType(), value);
          }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Set' to 'java.util.Set\>'. Reason: '((ConstructorBindingImpl) binding)' has raw type, so result of getInternalDependencies is erased
in `core/src/com/google/inject/internal/InjectorImpl.java`
#### Snippet
```java
  private Set<Dependency<?>> getInternalDependencies(BindingImpl<?> binding) {
    if (binding instanceof ConstructorBindingImpl) {
      return ((ConstructorBindingImpl) binding).getInternalDependencies();
    } else if (binding instanceof HasDependencies) {
      return ((HasDependencies) binding).getDependencies();
```

### UNCHECKED_WARNING
Unchecked cast: 'com.google.inject.internal.BindingImpl' to 'com.google.inject.spi.InstanceBinding'
in `core/src/com/google/inject/internal/InjectorImpl.java`
#### Snippet
```java
    // yet (because we may have been called during InternalInjectorCreator.initializeStatically and
    // instance binding validation hasn't happened yet.)
    String stringValue = ((InstanceBinding<String>) stringBinding).getInstance();
    Object source = stringBinding.getSource();

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.function.BiFunction'
in `core/src/com/google/inject/internal/aop/AbstractGlueGenerator.java`
#### Snippet
```java
        try {
          // pass this signature's index into the table function to retrieve the invoker
          return (BiFunction<Object, Object[], Object>)
              invokerTable.invokeExact(signatureTable.applyAsInt(signature));
        } catch (Throwable e) {
          throw asIfUnchecked(e);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.lang.Class' to 'java.lang.Class

'
in `extensions/throwingproviders/src/com/google/inject/throwingproviders/CheckedProviders.java`
#### Snippet
```java
    // TODO(user): Understand why TypeLiteral#getRawType returns a Class<? super T> rather
    // than a Class<T> and remove this unsafe cast.
    Class<P> providerRaw = (Class) providerType.getRawType();
    checkThrowable(providerRaw, throwable);
    return generateProvider(
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.lang.Class' to 'java.lang.Class

'
in `extensions/throwingproviders/src/com/google/inject/throwingproviders/CheckedProviders.java`
#### Snippet
```java
    // TODO(user): Understand why TypeLiteral#getRawType returns a Class<? super T> rather
    // than a Class<T> and remove this unsafe cast.
    Class<P> providerRaw = (Class) providerType.getRawType();
    return generateProvider(providerRaw, value, handler);
  }
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `PrivateModule`
in `core/src/com/google/inject/Injector.java`
#### Snippet
```java
   *
   * <p>When using hierarchical injectors (via {@link Binder#newPrivateBinder}, {@link
   * Binder#PrivateModule}, or {@link Injector#createChildInjector}), extra care is required to
   * ensure that bindings are associated with the correct injector. Statements that are otherwise
   * unnecessary - such as {code bind(ServiceImpl.class);} - become critical to associate the
```

### JavadocReference
Cannot resolve symbol `Injector.createChildInjector`
in `core/src/com/google/inject/Binder.java`
#### Snippet
```java
 * injectors (via {@code Binder.newPrivateBinder}, {@code Binder.PrivateModule}, or {@code
 * Injector.createChildInjector}), this guidance changes: see the note on hierarchical injectors in
 * {@link Injector.createChildInjector}.
 *
 * <pre>
```

### JavadocReference
Cannot resolve symbol `partialCallStack`
in `core/src/com/google/inject/spi/ModuleSource.java`
#### Snippet
```java
   * @param parent the parent module {@link ModuleSource source}
   * @param moduleClass the corresponding module
   * @param partialCallStack the chunk of call stack that starts from the parent module {@link
   *     Module#configure(Binder) configure(Binder)} call and ends just before the module {@link
   *     Module#configure(Binder) configure(Binder)} method invocation
```

### JavadocReference
Cannot resolve symbol `configure(Binder)`
in `core/src/com/google/inject/spi/ModuleSource.java`
#### Snippet
```java
   * @param moduleClass the corresponding module
   * @param partialCallStack the chunk of call stack that starts from the parent module {@link
   *     Module#configure(Binder) configure(Binder)} call and ends just before the module {@link
   *     Module#configure(Binder) configure(Binder)} method invocation
   */
```

### JavadocReference
Cannot resolve symbol `Binder`
in `core/src/com/google/inject/spi/ModuleSource.java`
#### Snippet
```java
   * @param moduleClass the corresponding module
   * @param partialCallStack the chunk of call stack that starts from the parent module {@link
   *     Module#configure(Binder) configure(Binder)} call and ends just before the module {@link
   *     Module#configure(Binder) configure(Binder)} method invocation
   */
```

### JavadocReference
Cannot resolve symbol `configure(Binder)`
in `core/src/com/google/inject/spi/ModuleSource.java`
#### Snippet
```java
   * @param partialCallStack the chunk of call stack that starts from the parent module {@link
   *     Module#configure(Binder) configure(Binder)} call and ends just before the module {@link
   *     Module#configure(Binder) configure(Binder)} method invocation
   */
  private ModuleSource(
```

### JavadocReference
Cannot resolve symbol `Binder`
in `core/src/com/google/inject/spi/ModuleSource.java`
#### Snippet
```java
   * @param partialCallStack the chunk of call stack that starts from the parent module {@link
   *     Module#configure(Binder) configure(Binder)} call and ends just before the module {@link
   *     Module#configure(Binder) configure(Binder)} method invocation
   */
  private ModuleSource(
```

### JavadocReference
Cannot resolve symbol `configure(Binder)`
in `core/src/com/google/inject/spi/ModuleSource.java`
#### Snippet
```java
 * Associated to a {@link Module module}, provides the module class name, the parent module {@link
 * ModuleSource source}, and the call stack that ends just before the module {@link
 * Module#configure(Binder) configure(Binder)} method invocation.
 */
final class ModuleSource {
```

### JavadocReference
Cannot resolve symbol `Binder`
in `core/src/com/google/inject/spi/ModuleSource.java`
#### Snippet
```java
 * Associated to a {@link Module module}, provides the module class name, the parent module {@link
 * ModuleSource source}, and the call stack that ends just before the module {@link
 * Module#configure(Binder) configure(Binder)} method invocation.
 */
final class ModuleSource {
```

### JavadocReference
Cannot resolve symbol `partialCallStack`
in `core/src/com/google/inject/spi/ElementSource.java`
#### Snippet
```java
   * @param declaringSource the source (in)directly declared the element.
   * @param moduleSource the moduleSource when the element is bound
   * @param partialCallStack the partial call stack from the top module to where the element is
   *     bound
   */
```

### JavadocReference
Cannot resolve symbol `Constructor`
in `core/src/com/google/inject/spi/ElementSource.java`
#### Snippet
```java
  /**
   * Refers to a single location in source code that causes the element creation. It can be any
   * object such as {@link Constructor}, {@link Method}, {@link Field}, {@link StackTraceElement},
   * etc. For example, if the element is created from a method annotated by {@literal @Provides},
   * the declaring source of element would be the method itself.
```

### JavadocReference
Cannot resolve symbol `Method`
in `core/src/com/google/inject/spi/ElementSource.java`
#### Snippet
```java
  /**
   * Refers to a single location in source code that causes the element creation. It can be any
   * object such as {@link Constructor}, {@link Method}, {@link Field}, {@link StackTraceElement},
   * etc. For example, if the element is created from a method annotated by {@literal @Provides},
   * the declaring source of element would be the method itself.
```

### JavadocReference
Cannot resolve symbol `Field`
in `core/src/com/google/inject/spi/ElementSource.java`
#### Snippet
```java
  /**
   * Refers to a single location in source code that causes the element creation. It can be any
   * object such as {@link Constructor}, {@link Method}, {@link Field}, {@link StackTraceElement},
   * etc. For example, if the element is created from a method annotated by {@literal @Provides},
   * the declaring source of element would be the method itself.
```

### JavadocReference
Symbol `defaults` is inaccessible from here
in `core/src/com/google/inject/name/Names.java`
#### Snippet
```java
  /**
   * Creates a constant binding to {@code @Named(key)} for each property. This method binds all
   * properties including those inherited from {@link Properties#defaults defaults}.
   */
  public static void bindProperties(Binder binder, Properties properties) {
```

### JavadocReference
Cannot resolve symbol `Inject`
in `core/src/com/google/inject/util/Modules.java`
#### Snippet
```java

  /**
   * Returns a module that will configure the injector to require {@literal @}{@link Inject} on
   * constructors.
   *
```

### JavadocReference
Cannot resolve symbol `Bindings`
in `core/src/com/google/inject/internal/AbstractBindingProcessor.java`
#### Snippet
```java
  /**
   * We tolerate duplicate bindings if one exposes the other or if the two bindings are considered
   * duplicates (see {@link Bindings#areDuplicates(BindingImpl, BindingImpl)}.
   *
   * @param original the binding in the parent injector (candidate for an exposing binding)
```

### JavadocReference
Cannot resolve symbol `areDuplicates(BindingImpl, BindingImpl)`
in `core/src/com/google/inject/internal/AbstractBindingProcessor.java`
#### Snippet
```java
  /**
   * We tolerate duplicate bindings if one exposes the other or if the two bindings are considered
   * duplicates (see {@link Bindings#areDuplicates(BindingImpl, BindingImpl)}.
   *
   * @param original the binding in the parent injector (candidate for an exposing binding)
```

### JavadocReference
Cannot resolve symbol `Multibinder`
in `core/src/com/google/inject/internal/DuplicateElementError.java`
#### Snippet
```java

/**
 * Error reported by Guice when duplicate elements are found in a {@link Multibinder} that does not
 * permit duplicates.
 */
```

### JavadocReference
Cannot resolve symbol `exit()`
in `core/src/com/google/inject/internal/InternalContext.java`
#### Snippet
```java
  /**
   * The number of times {@link #enter()} has been called + 1 for initial construction. This value
   * is decremented when {@link #exit()} is called.
   */
  private int enterCount;
```

### JavadocReference
Cannot resolve symbol `requireExplicitBindings()`
in `core/src/com/google/inject/internal/InternalInjectorCreator.java`
#### Snippet
```java
  /**
   * Sets the parent of the injector to-be-constructed. As a side effect, this sets this injector's
   * stage to the stage of {@code parent} and sets {@link #requireExplicitBindings()} if the parent
   * injector also required them.
   */
```

### JavadocReference
Cannot resolve symbol `MapBinder`
in `core/src/com/google/inject/internal/DuplicateMapKeyError.java`
#### Snippet
```java

/**
 * Error reported by Guice when a duplicate key is found in a {@link MapBinder} that does not permit
 * duplicates.
 */
```

### JavadocReference
Cannot resolve symbol `MethodHandles.Lookup.ClassOption`
in `core/src/com/google/inject/internal/aop/HiddenClassDefiner.java`
#### Snippet
```java
  }

  /** Creates {@link MethodHandles.Lookup.ClassOption} array with the named options. */
  @SuppressWarnings("unchecked")
  private static Object classOptions(String... options) throws ClassNotFoundException {
```

### JavadocReference
Cannot resolve symbol `RealMapProvider`
in `core/src/com/google/inject/internal/RealMapBinder.java`
#### Snippet
```java
   * different BindingSelections are constructed. Specifically, in the case of two different modules
   * each adding bindings to the same MapBinder. If that happens, we define the BindingSelection
   * held by the {@link RealMapProvider} to be the authoritative one. The logic for this exists in
   * {@link RealMultimapBinderProviderWithDependencies}. This is done to avoid confusion because the
   * BindingSelection contains mutable state.
```

### JavadocReference
Cannot resolve symbol `com.google.common.base.Optional`
in `core/src/com/google/inject/multibindings/OptionalBinder.java`
#### Snippet
```java
 * <p>When an OptionalBinder is added, it will always supply the bindings: {@code Optional<T>} and
 * {@code Optional<Provider<T>>}. Both {@link java.util.Optional java.util.Optional} and {@link
 * com.google.common.base.Optional com.google.common.base.Optional} are bound for compatibility. If
 * {@link #setBinding} or {@link #setDefault} are called, it will also bind {@code T}.
 *
```

### JavadocReference
Cannot resolve symbol `InjectionPoint`
in `extensions/grapher/src/com/google/inject/grapher/ProviderAliasCreator.java`
#### Snippet
```java
/**
 * Alias creator that creates an alias for each {@link ProviderBinding}. These {@link Binding}s
 * arise from an {@link InjectionPoint} for the {@link Provider} interface. Since this isn't very
 * interesting information, we don't render this binding on the graph, and just alias the two nodes.
 *
```

### JavadocReference
Cannot resolve symbol `Provider`
in `extensions/grapher/src/com/google/inject/grapher/ProviderAliasCreator.java`
#### Snippet
```java
/**
 * Alias creator that creates an alias for each {@link ProviderBinding}. These {@link Binding}s
 * arise from an {@link InjectionPoint} for the {@link Provider} interface. Since this isn't very
 * interesting information, we don't render this binding on the graph, and just alias the two nodes.
 *
```

### JavadocReference
Cannot resolve symbol `BindingTargetVisitor`
in `extensions/grapher/src/com/google/inject/grapher/DefaultNodeCreator.java`
#### Snippet
```java

  /**
   * {@link BindingTargetVisitor} that adds nodes to the graph based on the visited {@link Binding}.
   */
  private static final class NodeVisitor
```

### JavadocReference
Cannot resolve symbol `Key`
in `extensions/grapher/src/com/google/inject/grapher/DefaultNodeCreator.java`
#### Snippet
```java
    /**
     * Visitor for {@link InstanceBinding}. We render two nodes in this case: an interface node for
     * the binding's {@link Key}, and then an implementation node for the instance {@link Object}
     * itself.
     */
```

### JavadocReference
Cannot resolve symbol `BindingEdgeType`
in `extensions/grapher/src/com/google/inject/grapher/DefaultNodeCreator.java`
#### Snippet
```java
    /**
     * Same as {@link #visit(InstanceBinding)}, but the binding edge is {@link
     * BindingEdgeType#PROVIDER}.
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `PROVIDER`
in `extensions/grapher/src/com/google/inject/grapher/DefaultNodeCreator.java`
#### Snippet
```java
    /**
     * Same as {@link #visit(InstanceBinding)}, but the binding edge is {@link
     * BindingEdgeType#PROVIDER}.
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `InjectionPoint`
in `extensions/grapher/src/com/google/inject/grapher/DefaultEdgeCreator.java`
#### Snippet
```java
    /**
     * Visitor for {@link ProviderBinding}. These {@link Binding}s arise from an {@link
     * InjectionPoint} for the {@link Provider} interface.
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `Provider`
in `extensions/grapher/src/com/google/inject/grapher/DefaultEdgeCreator.java`
#### Snippet
```java
    /**
     * Visitor for {@link ProviderBinding}. These {@link Binding}s arise from an {@link
     * InjectionPoint} for the {@link Provider} interface.
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `InjectionPoint`
in `extensions/grapher/src/com/google/inject/grapher/DefaultEdgeCreator.java`
#### Snippet
```java
    /**
     * Visitor for {@link InstanceBinding}. We then render any dependency edges that the instance
     * may have, which come either from {@link InjectionPoint}s (method and field) on the instance,
     * or on {@link Dependency}s the instance declares through the {@link HasDependencies}
     * interface.
```

### JavadocReference
Cannot resolve symbol `Key`
in `extensions/grapher/src/com/google/inject/grapher/DefaultEdgeCreator.java`
#### Snippet
```java

    /**
     * Visitor for {@link ConvertedConstantBinding}. The {@link Binding}'s {@link Key} will be of an
     * annotated primitive type, and the value of {@link ConvertedConstantBinding#getSourceKey()}
     * will be of a {@link String} with the same annotation.
```

### JavadocReference
Cannot resolve symbol `BindingTargetVisitor`
in `extensions/grapher/src/com/google/inject/grapher/DefaultEdgeCreator.java`
#### Snippet
```java

  /**
   * {@link BindingTargetVisitor} that adds edges to the graph based on the visited {@link Binding}.
   */
  private static final class EdgeVisitor
```

### JavadocReference
Cannot resolve symbol `Key`
in `extensions/grapher/src/com/google/inject/grapher/DefaultEdgeCreator.java`
#### Snippet
```java
    /**
     * Returns a dependency edge for each {@link Dependency} in the binding. These will be from the
     * given node ID to the {@link Dependency}'s {@link Key}.
     *
     * @param nodeId ID of the node that should be the tail of the dependency edges
```

### JavadocReference
Cannot resolve symbol `using`
in `extensions/throwingproviders/src/com/google/inject/throwingproviders/CheckedProviderWithDependencies.java`
#### Snippet
```java
/**
 * A checked provider with dependencies, so {@link HasDependencies} can be implemented when using
 * the {@link SecondaryBinder#using} methods.
 *
 * @author sameb@google.com (Sam Berlin)
```

### JavadocReference
Cannot resolve symbol `Subject`
in `extensions/testlib/src/com/google/inject/testing/throwingproviders/CheckedProviderSubject.java`
#### Snippet
```java
   * CheckedProvider#get}
   *
   * @return a {@link Subject} for asserting against the return value of {@link CheckedProvider#get}
   */
  public Subject providedValue() {
```

### JavadocReference
Cannot resolve symbol `Subject`
in `extensions/testlib/src/com/google/inject/testing/throwingproviders/CheckedProviderSubject.java`
#### Snippet
```java

/**
 * Truth {@link Subject} for use with {@link CheckedProvider} classes.
 *
 * @author eatnumber1@google.com (Russ Harmon)
```

### JavadocReference
Cannot resolve symbol `ThrowableSubject`
in `extensions/testlib/src/com/google/inject/testing/throwingproviders/CheckedProviderSubject.java`
#### Snippet
```java
   * {@link CheckedProvider#get}
   *
   * @return a {@link ThrowableSubject} for asserting against the {@link Throwable} thrown by {@link
   *     CheckedProvider#get}
   */
```

### JavadocReference
Cannot resolve symbol `Qualifier`
in `extensions/testlib/src/com/google/inject/testing/fieldbinder/BoundFieldModule.java`
#### Snippet
```java
 *       injection time, allowing the field's value to be reassigned during the course of a test's
 *       execution.
 *   <li>If a {@link BindingAnnotation} or {@link Qualifier} is present on the field, that field
 *       will be bound using that annotation via {@link AnnotatedBindingBuilder#annotatedWith}. For
 *       example, {@code bind(Foo.class).annotatedWith(BarAnnotation.class).toInstance(theValue)}.
```

### JavadocReference
Cannot resolve symbol `Qualifier`
in `extensions/testlib/src/com/google/inject/testing/fieldbinder/BoundFieldModule.java`
#### Snippet
```java
 *       will be bound using that annotation via {@link AnnotatedBindingBuilder#annotatedWith}. For
 *       example, {@code bind(Foo.class).annotatedWith(BarAnnotation.class).toInstance(theValue)}.
 *       It is an error to supply more than one {@link BindingAnnotation} or {@link Qualifier}.
 *   <li>If the field is of type {@link Provider}, the field's value will be bound as a {@link
 *       Provider} using {@link LinkedBindingBuilder#toProvider} to the provider's parameterized
```

### JavadocReference
Cannot resolve symbol `Optional`
in `extensions/testlib/src/com/google/inject/testing/fieldbinder/BoundFieldModule.java`
#### Snippet
```java
   *
   * <p>This returns a {@link BoundFieldInfo} if the field has a {@link Bind} annotation. Otherwise
   * it returns {@link Optional#absent()}.
   */
  private Optional<BoundFieldInfo> getBoundFieldInfo(
```

### JavadocReference
Cannot resolve symbol `absent()`
in `extensions/testlib/src/com/google/inject/testing/fieldbinder/BoundFieldModule.java`
#### Snippet
```java
   *
   * <p>This returns a {@link BoundFieldInfo} if the field has a {@link Bind} annotation. Otherwise
   * it returns {@link Optional#absent()}.
   */
  private Optional<BoundFieldInfo> getBoundFieldInfo(
```

### JavadocReference
Cannot resolve symbol `Optional`
in `extensions/testlib/src/com/google/inject/testing/fieldbinder/BoundFieldModule.java`
#### Snippet
```java
     * <p>A field's "natural" type specifically ignores the to() method on the @Bind annotation, is
     * the parameterized type if the field's actual type is a parameterized {@link Provider}, is
     * {@link Optional#absent()} if this field is a non-parameterized {@link Provider} and otherwise
     * is the field's actual type.
     *
```

### JavadocReference
Cannot resolve symbol `absent()`
in `extensions/testlib/src/com/google/inject/testing/fieldbinder/BoundFieldModule.java`
#### Snippet
```java
     * <p>A field's "natural" type specifically ignores the to() method on the @Bind annotation, is
     * the parameterized type if the field's actual type is a parameterized {@link Provider}, is
     * {@link Optional#absent()} if this field is a non-parameterized {@link Provider} and otherwise
     * is the field's actual type.
     *
```

### JavadocReference
Cannot resolve symbol `Optional`
in `extensions/testlib/src/com/google/inject/testing/fieldbinder/BoundFieldModule.java`
#### Snippet
```java
     * is the field's actual type.
     *
     * @return the type this field binds to naturally, or {@link Optional#absent()} if this field is
     *     a non-parameterized {@link Provider}.
     */
```

### JavadocReference
Cannot resolve symbol `absent()`
in `extensions/testlib/src/com/google/inject/testing/fieldbinder/BoundFieldModule.java`
#### Snippet
```java
     * is the field's actual type.
     *
     * @return the type this field binds to naturally, or {@link Optional#absent()} if this field is
     *     a non-parameterized {@link Provider}.
     */
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Casting `rawType` to `Class` may produce `ClassCastException`
in `core/src/com/google/inject/internal/MoreTypes.java`
#### Snippet
```java
          type,
          type.getClass().getName());
      return (Class<?>) rawType;

    } else if (type instanceof GenericArrayType) {
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
Method invocation `getProvider` may produce `NullPointerException`
in `core/src/com/google/inject/internal/RealMapBinder.java`
#### Snippet
```java
    void initialize(InjectorImpl injector, Errors errors) {
      Binding<V> valueBinding = injector.getExistingBinding(valueKey);
      entry = Maps.immutableEntry(key, valueBinding.getProvider());
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
Casting `providerType` to `ParameterizedType` may produce `ClassCastException`
in `extensions/testlib/src/com/google/inject/testing/fieldbinder/BoundFieldModule.java`
#### Snippet
```java
        }
        Preconditions.checkState(providerType instanceof ParameterizedType);
        Type[] providerTypeArguments = ((ParameterizedType) providerType).getActualTypeArguments();
        Preconditions.checkState(providerTypeArguments.length == 1);
        return Optional.<TypeLiteral<?>>of(TypeLiteral.get(providerTypeArguments[0]));
```

### DataFlowIssue
Method invocation `isPresent` may produce `NullPointerException`
in `extensions/testlib/src/com/google/inject/testing/fieldbinder/BoundFieldModule.java`
#### Snippet
```java
      if (bindClass == Bind.class) {
        Preconditions.checkState(naturalType != null);
        if (!naturalType.isPresent()) {
          throw new BoundFieldException(
              new Message(
```

### DataFlowIssue
Method invocation `entrySet` may produce `NullPointerException`
in `extensions/servlet/src/com/google/inject/servlet/ServletScopes.java`
#### Snippet
```java
    final ContinuingHttpServletRequest continuingRequest =
        new ContinuingHttpServletRequest(GuiceFilter.getRequest(Key.get(HttpServletRequest.class)));
    for (Map.Entry<Key<?>, Object> entry : seedMap.entrySet()) {
      Object value = validateAndCanonicalizeValue(entry.getKey(), entry.getValue());
      continuingRequest.setAttribute(entry.getKey().toString(), value);
```

### DataFlowIssue
Dereference of `data` may produce `NullPointerException`
in `extensions/assistedinject/src/com/google/inject/assistedinject/FactoryProvider2.java`
#### Snippet
```java
    checkState(data != null, "No data for method: %s", method);
    Provider<?> provider;
    if (data.cachedBinding != null) { // Try to get optimized form...
      provider = data.cachedBinding.getProvider();
    } else {
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
in `core/src/com/google/inject/internal/RealMapBinder.java`
#### Snippet
```java
      UNINITIALIZED,
      INITIALIZED,
      HAS_ERRORS;
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
  public <T> MembersInjector<T> getMembersInjector(Class<T> type) {
    return getMembersInjector(TypeLiteral.get(type));
  }
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
  public <T> Provider<T> getProvider(Class<T> type) {
    return getProvider(Key.get(type));
  }
```

## RuleId[id=DeprecatedIsStillUsed]
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
Deprecated member 'AbstractMatcher' is still used
in `core/src/com/google/inject/matcher/AbstractMatcher.java`
#### Snippet
```java
 */
@Deprecated
public abstract class AbstractMatcher<T> implements Matcher<T> {
  // FYI: AbstractMatcher explicitly implements `and` and `or` in order
  // to reduce binary compatibility issues, despite their impls directly
```

### DeprecatedIsStillUsed
Deprecated member 'guicify' is still used
in `core/src/com/google/inject/util/Providers.java`
#### Snippet
```java
   */
  @Deprecated
  public static <T> Provider<T> guicify(Provider<T> provider) {
    return provider;
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

## RuleId[id=WebProperties]
### WebProperties
Cannot resolve class or package 'struts2'
in `extensions/struts2/example/root/WEB-INF/web.xml`
#### Snippet
```java

  <listener>
      <listener-class>com.google.inject.struts2.example.ExampleListener</listener-class>
  </listener>  

```

### WebProperties
Cannot resolve class or package 'example'
in `extensions/struts2/example/root/WEB-INF/web.xml`
#### Snippet
```java

  <listener>
      <listener-class>com.google.inject.struts2.example.ExampleListener</listener-class>
  </listener>  

```

### WebProperties
Cannot resolve class 'ExampleListener'
in `extensions/struts2/example/root/WEB-INF/web.xml`
#### Snippet
```java

  <listener>
      <listener-class>com.google.inject.struts2.example.ExampleListener</listener-class>
  </listener>  

```

### WebProperties
Cannot resolve class or package 'servlet'
in `extensions/struts2/example/root/WEB-INF/web.xml`
#### Snippet
```java
  <filter>
    <filter-name>guice</filter-name>
    <filter-class>com.google.inject.servlet.GuiceFilter</filter-class>
  </filter>

```

### WebProperties
Cannot resolve class 'GuiceFilter'
in `extensions/struts2/example/root/WEB-INF/web.xml`
#### Snippet
```java
  <filter>
    <filter-name>guice</filter-name>
    <filter-class>com.google.inject.servlet.GuiceFilter</filter-class>
  </filter>

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

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `core/src/com/google/inject/Scopes.java`
#### Snippet
```java
      if (singleton) {
        return true;
      }

      if (binding instanceof LinkedKeyBinding) {
        LinkedKeyBinding<?> linkedBinding = (LinkedKeyBinding) binding;
        Injector injector = getInjector(linkedBinding);
        if (injector != null) {
          binding = injector.getBinding(linkedBinding.getLinkedKey());
          continue;
        }
      } else if (binding instanceof ExposedBinding) {
        ExposedBinding<?> exposedBinding = (ExposedBinding) binding;
        Injector injector = exposedBinding.getPrivateElements().getInjector();
        if (injector != null) {
          binding = injector.getBinding(exposedBinding.getKey());
          continue;
        }
      }

      return false;
```

### DuplicatedCode
Duplicated code
in `core/src/com/google/inject/internal/InternalProviderInstanceBindingImpl.java`
#### Snippet
```java
      final ConstructionContext<T> constructionContext = context.getConstructionContext(this);
      // We have a circular reference between bindings. Return a proxy.
      if (constructionContext.isConstructing()) {
        Class<?> expectedType = dependency.getKey().getTypeLiteral().getRawType();
        @SuppressWarnings("unchecked")
        T proxyType =
            (T) constructionContext.createProxy(context.getInjectorOptions(), expectedType);
        return proxyType;
      }
      // Optimization: Don't go through the callback stack if no one's listening.
      constructionContext.startConstruction();
      try {
        if (provisionCallback == null) {
          return provision(dependency, context, constructionContext);
        } else {
          return provisionCallback.provision(
              context,
              new ProvisionCallback<T>() {
                @Override
                public T call() throws InternalProvisionException {
                  return provision(dependency, context, constructionContext);
                }
              });
        }
      } finally {
        constructionContext.removeCurrentReference();
        constructionContext.finishConstruction();
      }
```

### DuplicatedCode
Duplicated code
in `core/src/com/google/inject/internal/ProviderMethodsModule.java`
#### Snippet
```java
    int modifiers = b.getModifiers();
    if (Modifier.isPublic(modifiers) || Modifier.isProtected(modifiers)) {
      return true;
    }
    if (Modifier.isPrivate(modifiers)) {
      return false;
    }
    // b must be package-private
    return a.getDeclaringClass().getPackage().equals(b.getDeclaringClass().getPackage());
```

### DuplicatedCode
Duplicated code
in `extensions/assistedinject/src/com/google/inject/assistedinject/FactoryProvider.java`
#### Snippet
```java
            if (method.getDeclaringClass().equals(Object.class)) {
              if ("equals".equals(method.getName())) {
                return proxy == creationArgs[0];
              } else if ("hashCode".equals(method.getName())) {
                return System.identityHashCode(proxy);
              } else {
                return method.invoke(this, creationArgs);
              }
            }
```

### DuplicatedCode
Duplicated code
in `extensions/servlet/src/com/google/inject/servlet/FilterDefinition.java`
#### Snippet
```java
    if (initializedSoFar.contains(filter)) {
      return;
    }

    // initialize our filter with the configured context params and servlet context
    filter.init(
        new FilterConfig() {
          @Override
          public String getFilterName() {
            return filterKey.toString();
          }

          @Override
          public ServletContext getServletContext() {
            return servletContext;
          }

          @Override
          public String getInitParameter(String s) {
            return initParams.get(s);
          }

          @Override
          public Enumeration<String> getInitParameterNames() {
            return Iterators.asEnumeration(initParams.keySet().iterator());
          }
        });

    initializedSoFar.add(filter);
```

### DuplicatedCode
Duplicated code
in `extensions/servlet/src/com/google/inject/servlet/ServletScopes.java`
#### Snippet
```java
          synchronized (request) {
            Object obj = request.getAttribute(name);
            if (NullObject.INSTANCE == obj) {
              return null;
            }
            @SuppressWarnings("unchecked")
            T t = (T) obj;
            if (t == null) {
              t = creator.get();
              if (!Scopes.isCircularProxy(t)) {
                request.setAttribute(name, (t != null) ? t : NullObject.INSTANCE);
              }
            }
            return t;
          }
```

## RuleId[id=CatchMayIgnoreException]
### CatchMayIgnoreException
Empty `catch` block
in `core/src/com/google/inject/internal/aop/UnsafeGetter.java`
#### Snippet
```java
    try {
      return sun.misc.Unsafe.getUnsafe();
    } catch (SecurityException unusedFallbackToReflection) {
    }
    // Note that we do not do this in a privileged action because we expect we're already in a
```

### CatchMayIgnoreException
'catch' parameter named `ignored` is used
in `core/src/com/google/inject/internal/util/LineNumbers.java`
#### Snippet
```java
        try {
          new ClassReader(in).accept(new LineNumberReader(), ClassReader.SKIP_FRAMES);
        } catch (Exception ignored) {
          // We may be trying to inspect classes that were compiled with a more recent version
          // of javac than our ASM supports.  If that happens, just ignore the class and don't
```

## RuleId[id=ProtectedMemberInFinalClass]
### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `core/src/com/google/inject/internal/Messages.java`
#### Snippet
```java

    @Override
    protected int doHash(Throwable t) {
      return Objects.hashCode(t.getClass().hashCode(), t.getMessage(), hash(t.getCause()));
    }
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `core/src/com/google/inject/internal/Messages.java`
#### Snippet
```java

    @Override
    protected boolean doEquivalent(Throwable a, Throwable b) {
      return a.getClass().equals(b.getClass())
          && Objects.equal(a.getMessage(), b.getMessage())
```

## RuleId[id=CollectionAddAllCanBeReplacedWithConstructor]
### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `core/src/com/google/inject/internal/InternalInjectorCreator.java`
#### Snippet
```java
    Collection<BindingImpl<?>> bindingsAtThisLevel =
        (Collection) injector.getBindingData().getExplicitBindingsThisLevel().values();
    candidateBindings.addAll(bindingsAtThisLevel);
    synchronized (injector.getJitBindingData().lock()) {
      // jit bindings must be accessed while holding the lock.
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

## RuleId[id=DanglingJavadoc]
### DanglingJavadoc
Dangling Javadoc comment
in `core/src/com/google/inject/internal/DuplicateElementError.java`
#### Snippet
```java
            source,
            formatter,
            /** omitPreposition= */
            true)
        .format();
```

### DanglingJavadoc
Dangling Javadoc comment
in `core/src/com/google/inject/internal/DuplicateMapKeyError.java`
#### Snippet
```java
                binding.getSource(),
                formatter,
                /** omitPreposition= */
                true)
            .format();
```

### DanglingJavadoc
Dangling Javadoc comment
in `core/src/com/google/inject/internal/SingletonScope.java`
#### Snippet
```java
  @Override
  public <T> Provider<T> scope(final Key<T> key, final Provider<T> creator) {
    /** Locking strategy: */
    return new Provider<T>() {
      /**
```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `extensions/assistedinject/src/com/google/inject/assistedinject/FactoryProvider2.java`
#### Snippet
```java
    Class<?> annotationType = dependency.getKey().getAnnotationType();
    if (annotationType != null && annotationType.equals(Assisted.class)) { // If it's assisted..
      if (dependency
          .getKey()
          .getTypeLiteral()
```

### TrivialIf
`if` statement can be simplified
in `extensions/assistedinject/src/com/google/inject/assistedinject/FactoryProvider2.java`
#### Snippet
```java
        return true;
      }
    } else if (dependency
        .getKey()
        .getTypeLiteral()
```

## RuleId[id=OptionalUsedAsFieldOrParameterType]
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

## RuleId[id=RedundantCast]
### RedundantCast
Casting `providerBinding` to `Binding` is redundant
in `core/src/com/google/inject/spi/DefaultBindingTargetVisitor.java`
#### Snippet
```java
  public V visit(ProviderBinding<? extends T> providerBinding) {
    // TODO(cushon): remove raw (Binding) cast when we don't care about javac 6 anymore
    return visitOther((Binding<? extends T>) (Binding) providerBinding);
  }
}
```

### RedundantCast
Casting `boundProviderFactory` to `InternalFactory` is redundant
in `core/src/com/google/inject/internal/BindingProcessor.java`
#### Snippet
```java
                    key,
                    injector,
                    (InternalFactory<? extends T>) boundProviderFactory,
                    source,
                    scoping);
```

### RedundantCast
Casting `bindingSelection.getMapKey()` to `Key` is redundant
in `core/src/com/google/inject/internal/RealMapBinder.java`
#### Snippet
```java
    binder
        .bind(bindingSelection.getMapOfKeyExtendsValueKey())
        .to((Key) bindingSelection.getMapKey());

    // The Map.Entries are all ProviderMapEntry instances which do not allow setValue, so it is
```

### RedundantCast
Casting `factoryType.getRawType()` to `Class` is redundant
in `extensions/assistedinject/src/com/google/inject/assistedinject/FactoryProvider.java`
#### Snippet
```java

    @SuppressWarnings("unchecked") // we imprecisely treat the class literal of T as a Class<T>
    Class<F> factoryRawType = (Class<F>) (Class<?>) factoryType.getRawType();
    return factoryRawType.cast(
        Proxy.newProxyInstance(
```

### RedundantCast
Casting `cause` to `ResultException` is redundant
in `extensions/throwingproviders/src/com/google/inject/throwingproviders/ThrowingProviderBinder.java`
#### Snippet
```java
                                      Throwable cause = pe.getCause();
                                      if (cause instanceof ResultException) {
                                        throw ((ResultException) cause).getCause();
                                      } else {
                                        throw pe;
```

### RedundantCast
Casting `factoryType.getRawType()` to `Class` is redundant
in `extensions/assistedinject/src/com/google/inject/assistedinject/FactoryProvider2.java`
#### Snippet
```java

    @SuppressWarnings("unchecked") // we imprecisely treat the class literal of T as a Class<T>
    Class<F> factoryRawType = (Class<F>) (Class<?>) factoryType.getRawType();

    try {
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
Javadoc pointing to itself
in `core/src/com/google/inject/Injector.java`
#### Snippet
```java
   * injector}, should one exist.
   *
   * <p>The returned list is immutable; it contains only the elements that were present when {@link
   * #getElements} was invoked. Subsequent calls may return a list with additional elements.
   *
```

### JavadocDeclaration
Wrong tag `ElementSource`
in `core/src/com/google/inject/spi/ElementSource.java`
#### Snippet
```java

  /**
   * Creates a new {@ElementSource} from the given parameters.
   *
   * @param originalSource The source of element that this element was created from (if there is
```

### JavadocDeclaration
Wrong tag `Provides`
in `core/src/com/google/inject/internal/ProvidesMethodScanner.java`
#### Snippet
```java

/**
 * A {@link ModuleAnnotatedMethodScanner} that handles the {@Provides}, {@link ProvidesIntoSet},
 * {@link ProvidesIntoMap} and {@link ProvidesIntoOptional} annotations.
 *
```

### JavadocDeclaration
`@param source` tag description is missing
in `core/src/com/google/inject/internal/InternalProvisionException.java`
#### Snippet
```java
   * <p>It is expected that this method is called as the exception propagates up the stack.
   *
   * @param source
   * @return {@code this}
   */
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `lockThreadIsWaitingOn` may be 'final'
in `core/src/com/google/inject/internal/CycleDetectingLock.java`
#### Snippet
```java
     * <p>Guarded by {@code CycleDetectingLockFactory.class}.
     */
    private static Map<Thread, ReentrantCycleDetectingLock<?>> lockThreadIsWaitingOn =
        Maps.newHashMap();

```

### FieldMayBeFinal
Field `hasAnnotations` may be 'final'
in `core/src/com/google/inject/internal/Annotations.java`
#### Snippet
```java

    /** Returns true if the given class has one of the desired annotations. */
    private CacheLoader<Class<? extends Annotation>, Boolean> hasAnnotations =
        new CacheLoader<Class<? extends Annotation>, Boolean>() {
          @Override
```

### FieldMayBeFinal
Field `subtitles` may be 'final'
in `extensions/grapher/src/com/google/inject/grapher/graphviz/GraphvizNode.java`
#### Snippet
```java

  private String title = "";
  private Map<Integer, String> subtitles = Maps.newTreeMap();

  private String headerTextColor = "#000000";
```

### FieldMayBeFinal
Field `fields` may be 'final'
in `extensions/grapher/src/com/google/inject/grapher/graphviz/GraphvizNode.java`
#### Snippet
```java

  /** {@link Map} from port ID to field title */
  private Map<String, String> fields = Maps.newLinkedHashMap();

  /** @since 4.0 */
```

### FieldMayBeFinal
Field `emProvider` may be 'final'
in `extensions/persist/src/com/google/inject/persist/jpa/JpaLocalTxnInterceptor.java`
#### Snippet
```java

  // TODO(gak): Move these args to the cxtor & make these final.
  @Inject private JpaPersistService emProvider = null;

  @Inject private UnitOfWork unitOfWork = null;
```

### FieldMayBeFinal
Field `unitOfWork` may be 'final'
in `extensions/persist/src/com/google/inject/persist/jpa/JpaLocalTxnInterceptor.java`
#### Snippet
```java
  @Inject private JpaPersistService emProvider = null;

  @Inject private UnitOfWork unitOfWork = null;

  @Transactional
```

### FieldMayBeFinal
Field `allowMethodHandleWorkaround` may be 'final'
in `extensions/assistedinject/src/com/google/inject/assistedinject/FactoryProvider2.java`
#### Snippet
```java
   */
  @SuppressWarnings("FieldCanBeFinal") // non-final for testing
  private static boolean allowMethodHandleWorkaround = true;

  /** if a factory method parameter isn't annotated, it gets this annotation. */
```

### FieldMayBeFinal
Field `allowPrivateLookupFallback` may be 'final'
in `extensions/assistedinject/src/com/google/inject/assistedinject/FactoryProvider2.java`
#### Snippet
```java
   */
  @SuppressWarnings("FieldCanBeFinal") // non-final for testing
  private static boolean allowPrivateLookupFallback = true;

  /**
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

## RuleId[id=InstantiationOfUtilityClass]
### InstantiationOfUtilityClass
Instantiation of utility class `GuiceInternal`
in `core/src/com/google/inject/internal/GuiceInternal.java`
#### Snippet
```java
 */
public final class GuiceInternal {
  static final GuiceInternal GUICE_INTERNAL = new GuiceInternal();

  private GuiceInternal() {}
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

## RuleId[id=UnnecessaryLocalVariable]
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
      return;
    }
    ProvisionException exception = new ProvisionException(getMessages());
    throw exception;
  }
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
      throw exception;
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
    ProvidedByInternalFactory<T> internalFactory =
        new ProvidedByInternalFactory<T>(rawType, providerType, providerKey);
    Object source = rawType;
    BindingImpl<T> binding =
        LinkedProviderBindingImpl.createWithInitializer(
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
    // Look up the target binding.
    final Key<? extends T> targetKey = Key.get(subclass);
    Object source = rawType;
    FactoryProxy<T> factory = new FactoryProxy<>(this, key, targetKey, source);
    // Notify any callbacks that we have a new CreationListener that needs to be notified.
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

## RuleId[id=ArraysAsListWithZeroOrOneArgument]
### ArraysAsListWithZeroOrOneArgument
Call to `asList()` to create an empty List
in `core/src/com/google/inject/util/Modules.java`
#### Snippet
```java
  @Deprecated
  public static OverriddenModuleBuilder override() {
    return override(Arrays.asList());
  }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` to create an empty List
in `core/src/com/google/inject/util/Modules.java`
#### Snippet
```java
    @Override
    public Module with() {
      return with(Arrays.asList());
    }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `extensions/dagger-adapter/src/com/google/inject/daggeradapter/DaggerMethodScanner.java`
#### Snippet
```java

    Method mapKeyValueMethod =
        getOnlyElement(Arrays.asList(mapKey.annotationType().getDeclaredMethods()));
    Object mapKeyValue;
    try {
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

