# Cinch 
 
# Bad smells
I found 89 bad smells with 35 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryModifier | 26 | true |
| Convert2Lambda | 8 | false |
| StaticPseudoFunctionalStyleMethod | 8 | false |
| BoundedWildcard | 7 | false |
| ReturnNull | 6 | false |
| ConstantValue | 6 | false |
| DataFlowIssue | 5 | false |
| UnnecessaryLocalVariable | 4 | true |
| UnnecessarySemicolon | 3 | false |
| UnnecessaryUnboxing | 2 | false |
| UtilityClassWithoutPrivateConstructor | 2 | true |
| NonProtectedConstructorInAbstractClass | 2 | true |
| AssignmentToMethodParameter | 2 | false |
| UnnecessaryBoxing | 2 | false |
| Anonymous2MethodRef | 1 | false |
| MismatchedCollectionQueryUpdate | 1 | false |
| PrimitiveArrayArgumentToVariableArgMethod | 1 | false |
| SizeReplaceableByIsEmpty | 1 | true |
| ZeroLengthArrayInitialization | 1 | false |
| AbstractClassNeverImplemented | 1 | false |
## RuleId[id=UnnecessaryUnboxing]
### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/com/palantir/ptoss/cinch/swing/JProgressBarWiringHarness.java`
#### Snippet
```java
        private static int getValueForObject(Object obj) {
            if (obj instanceof Double) {
                return (int)Math.round(((Double)obj).doubleValue() * 100);
            } else if (obj instanceof Integer) {
                return ((Integer)obj).intValue();
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/com/palantir/ptoss/cinch/swing/JProgressBarWiringHarness.java`
#### Snippet
```java
                return (int)Math.round(((Double)obj).doubleValue() * 100);
            } else if (obj instanceof Integer) {
                return ((Integer)obj).intValue();
            } else if (obj instanceof Float) {
                return (int)Math.round(((Float)obj).doubleValue() * 100);
```

## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/com/palantir/ptoss/util/Visitor.java`
#### Snippet
```java
 */
public interface Visitor<T> {
    public void visit(T obj);
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/com/palantir/ptoss/cinch/core/BindingWiring.java`
#### Snippet
```java
     * @return a collection of {@link Binding} objects wired by this {@link BindingWiring} instance.
     */
    public Collection<Binding> wire(BindingContext context);
}

```

### UnnecessaryModifier
Modifier `static` is redundant for inner classes of interfaces
in `src/main/java/com/palantir/ptoss/cinch/swing/Action.java`
#### Snippet
```java
     * Inner utility class used to wire {@link Action} bindings.
     */
    static class Wiring implements BindingWiring {
        private static final Logger logger = LoggerFactory.getLogger(Action.class);

```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `src/main/java/com/palantir/ptoss/cinch/swing/OnClick.java`
#### Snippet
```java
        private final int constant;

        private Button(int constant) {
            this.constant = constant;
        }
```

### UnnecessaryModifier
Modifier `static` is redundant for inner classes of interfaces
in `src/main/java/com/palantir/ptoss/cinch/swing/OnClick.java`
#### Snippet
```java
     *     Inner utility class that performs the runtime wiring of all {@link OnClick} bindings.
     */
    static class Wiring implements BindingWiring {
        private static final Logger logger = LoggerFactory.getLogger(OnClick.class);

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/com/palantir/ptoss/cinch/swing/OnClick.java`
#### Snippet
```java
     * Enum specifying which mouse button is being bound by this binding.
     */
    public enum Button {
        LEFT(MouseEvent.BUTTON1), CENTER(MouseEvent.BUTTON2), RIGHT(MouseEvent.BUTTON3);

```

### UnnecessaryModifier
Modifier `static` is redundant for inner classes of interfaces
in `src/main/java/com/palantir/ptoss/cinch/core/CallOnUpdate.java`
#### Snippet
```java
     * Utility class that performs the wiring for {@link CallOnUpdate} annotations.
     */
    static class Wiring implements BindingWiring {
        private static final Logger logger = LoggerFactory.getLogger(CallOnUpdate.class);

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/com/palantir/ptoss/cinch/swing/BoundExtent.java`
#### Snippet
```java
     * @see Bindings#STANDARD_BINDINGS
     */
    public static class Wiring implements BindingWiring {
        private static final Logger logger = LoggerFactory.getLogger(BoundExtent.class);

```

### UnnecessaryModifier
Modifier `static` is redundant for inner classes of interfaces
in `src/main/java/com/palantir/ptoss/cinch/swing/BoundExtent.java`
#### Snippet
```java
     * @see Bindings#STANDARD_BINDINGS
     */
    public static class Wiring implements BindingWiring {
        private static final Logger logger = LoggerFactory.getLogger(BoundExtent.class);

```

### UnnecessaryModifier
Modifier `static` is redundant for inner classes of interfaces
in `src/main/java/com/palantir/ptoss/cinch/swing/OnFocusChange.java`
#### Snippet
```java
     *     Inner utility class that performs the runtime wiring of all {@link OnFocusChange} bindings.
     */
    static class Wiring implements BindingWiring {
        private static final Logger logger = LoggerFactory.getLogger(OnFocusChange.class);

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/com/palantir/ptoss/cinch/swing/BoundSelection.java`
#### Snippet
```java
     * Inner utility class that performs the runtime wiring of all {@link BoundSelection} bindings.
     */
    public static class Wiring implements BindingWiring {
        private static final Logger logger = LoggerFactory.getLogger(BoundSelection.class);

```

### UnnecessaryModifier
Modifier `static` is redundant for inner classes of interfaces
in `src/main/java/com/palantir/ptoss/cinch/swing/BoundSelection.java`
#### Snippet
```java
     * Inner utility class that performs the runtime wiring of all {@link BoundSelection} bindings.
     */
    public static class Wiring implements BindingWiring {
        private static final Logger logger = LoggerFactory.getLogger(BoundSelection.class);

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/com/palantir/ptoss/cinch/core/Binding.java`
#### Snippet
```java
     * @param changed varargs of {@link ModelUpdate} types that are being fired by this call.
     */
    public <T extends Enum<?> & ModelUpdate> void update(T... changed);
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/com/palantir/ptoss/cinch/swing/BoundLocation.java`
#### Snippet
```java
     * @see Bindings#STANDARD_BINDINGS
     */
    public static class Wiring implements BindingWiring {
        private static final Logger logger = LoggerFactory.getLogger(BoundLocation.class);

```

### UnnecessaryModifier
Modifier `static` is redundant for inner classes of interfaces
in `src/main/java/com/palantir/ptoss/cinch/swing/BoundLocation.java`
#### Snippet
```java
     * @see Bindings#STANDARD_BINDINGS
     */
    public static class Wiring implements BindingWiring {
        private static final Logger logger = LoggerFactory.getLogger(BoundLocation.class);

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/com/palantir/ptoss/cinch/swing/EnabledIf.java`
#### Snippet
```java
     * @see Bindings#STANDARD_BINDINGS
     */
    public static class Wiring implements BindingWiring {
        private static final Logger logger = LoggerFactory.getLogger(EnabledIf.class);

```

### UnnecessaryModifier
Modifier `static` is redundant for inner classes of interfaces
in `src/main/java/com/palantir/ptoss/cinch/swing/EnabledIf.java`
#### Snippet
```java
     * @see Bindings#STANDARD_BINDINGS
     */
    public static class Wiring implements BindingWiring {
        private static final Logger logger = LoggerFactory.getLogger(EnabledIf.class);

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/com/palantir/ptoss/cinch/swing/EnabledIf.java`
#### Snippet
```java
     * Enum to specify if normal or inverted comparisons should be used.
     */
    public enum Type { NORMAL, INVERTED };
    /**
     * The model boolean property to bind to.
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/com/palantir/ptoss/cinch/swing/VisibleIf.java`
#### Snippet
```java
     * Inner utility class that performs the runtime wiring of all {@link VisibleIf} bindings.
     */
    public static class Wiring implements BindingWiring {
        private static final Logger logger = LoggerFactory.getLogger(VisibleIf.class);

```

### UnnecessaryModifier
Modifier `static` is redundant for inner classes of interfaces
in `src/main/java/com/palantir/ptoss/cinch/swing/VisibleIf.java`
#### Snippet
```java
     * Inner utility class that performs the runtime wiring of all {@link VisibleIf} bindings.
     */
    public static class Wiring implements BindingWiring {
        private static final Logger logger = LoggerFactory.getLogger(VisibleIf.class);

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/com/palantir/ptoss/cinch/swing/VisibleIf.java`
#### Snippet
```java
     * Enum to specify if normal or inverted comparisons should be used.
     */
    public enum Type { NORMAL, INVERTED };
    /**
     * The model boolean property to bind to.
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/com/palantir/ptoss/cinch/swing/Bound.java`
#### Snippet
```java
     * @see Bindings#STANDARD_BINDINGS
     */
    public static class Wiring implements BindingWiring {
        static final Logger logger = LoggerFactory.getLogger(Bound.class);

```

### UnnecessaryModifier
Modifier `static` is redundant for inner classes of interfaces
in `src/main/java/com/palantir/ptoss/cinch/swing/Bound.java`
#### Snippet
```java
     * @see Bindings#STANDARD_BINDINGS
     */
    public static class Wiring implements BindingWiring {
        static final Logger logger = LoggerFactory.getLogger(Bound.class);

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/com/palantir/ptoss/cinch/swing/Bound.java`
#### Snippet
```java
     * Inner utility class to simplify figuring out how to display null values in controls.
     */
    public static class Utilities {
        /**
         * If the provided nullValue is null, empty, or just whitespace then the returned value
```

### UnnecessaryModifier
Modifier `static` is redundant for inner classes of interfaces
in `src/main/java/com/palantir/ptoss/cinch/swing/Bound.java`
#### Snippet
```java
     * Inner utility class to simplify figuring out how to display null values in controls.
     */
    public static class Utilities {
        /**
         * If the provided nullValue is null, empty, or just whitespace then the returned value
```

### UnnecessaryModifier
Modifier `static` is redundant for inner classes of interfaces
in `src/main/java/com/palantir/ptoss/cinch/swing/OnChange.java`
#### Snippet
```java
     *     Inner utility class that performs the runtime wiring of all {@link OnChange} bindings.
     */
    static class Wiring implements BindingWiring {
        private static final Logger logger = LoggerFactory.getLogger(OnChange.class);

```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `Utilities` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/palantir/ptoss/cinch/swing/Bound.java`
#### Snippet
```java
     * Inner utility class to simplify figuring out how to display null values in controls.
     */
    public static class Utilities {
        /**
         * If the provided nullValue is null, empty, or just whitespace then the returned value
```

### UtilityClassWithoutPrivateConstructor
Class `Reflections` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/palantir/ptoss/util/Reflections.java`
#### Snippet
```java
 * @see <a href='http://docs.oracle.com/javase/6/docs/api/index.html?java/lang/reflect/package-summary.html'>java.lang.reflect</a>
 */
public class Reflections {

    /**
```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `src/main/java/com/palantir/ptoss/cinch/core/ModelUpdates.java`
#### Snippet
```java
     * react to these model updates.
     */
    ALL;
}

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `src/main/java/com/palantir/ptoss/cinch/swing/EnabledIf.java`
#### Snippet
```java
     * Enum to specify if normal or inverted comparisons should be used.
     */
    public enum Type { NORMAL, INVERTED };
    /**
     * The model boolean property to bind to.
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `src/main/java/com/palantir/ptoss/cinch/swing/VisibleIf.java`
#### Snippet
```java
     * Enum to specify if normal or inverted comparisons should be used.
     */
    public enum Type { NORMAL, INVERTED };
    /**
     * The model boolean property to bind to.
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `getField` may produce `NullPointerException`
in `src/main/java/com/palantir/ptoss/cinch/core/ObjectFieldMethod.java`
#### Snippet
```java
    public static final Function<ObjectFieldMethod, String> TO_FIELD_NAME = new Function<ObjectFieldMethod, String>() {
        public String apply(ObjectFieldMethod from) {
            return from.getField().getName();
        }
    };
```

### DataFlowIssue
Method invocation `getDeclaringClass` may produce `NullPointerException`
in `src/main/java/com/palantir/ptoss/util/Reflections.java`
#### Snippet
```java
    public static final Function<Field, String> FIELD_TO_CONTAINING_CLASS_NAME = new Function<Field, String>() {
        public String apply(Field input) {
            return input.getDeclaringClass().getSimpleName();
        }
    };
```

### DataFlowIssue
Method invocation `getName` may produce `NullPointerException`
in `src/main/java/com/palantir/ptoss/util/Reflections.java`
#### Snippet
```java
    public static final Function<Field, String> FIELD_TO_NAME = new Function<Field, String>() {
        public String apply(Field from) {
            return from.getName();
        }
    };
```

### DataFlowIssue
Dereference of `updateClasses` may produce `NullPointerException`
in `src/main/java/com/palantir/ptoss/cinch/core/BindingContext.java`
#### Snippet
```java
        if (!isNullOrBlank(on)) {
            final List<Class<?>> updateClasses = findModelUpdateClass(model);
            for (Class<?> updateClass : updateClasses) {
                try {
                    onObject = (ModelUpdate)Reflections.evalEnum(updateClass, on);
```

### DataFlowIssue
Method invocation `isEnum` may produce `NullPointerException`
in `src/main/java/com/palantir/ptoss/cinch/core/BindingContext.java`
#### Snippet
```java
        Predicate<Class<?>> isEnum = new Predicate<Class<?>>() {
            public boolean apply(final Class<?> input) {
                return input.isEnum();
            }
        };
```

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `SimpleBinding()` of an abstract class should not be declared 'public'
in `src/main/java/com/palantir/ptoss/cinch/core/SimpleBinding.java`
#### Snippet
```java
     * Default constructor that will fire on any model update.
     */
    public <T extends Enum<?> & ModelUpdate> SimpleBinding() {
        this.on = ImmutableSet.of();
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `SimpleBinding()` of an abstract class should not be declared 'public'
in `src/main/java/com/palantir/ptoss/cinch/core/SimpleBinding.java`
#### Snippet
```java
     * @param on
     */
    public <T extends Enum<?> & ModelUpdate> SimpleBinding(T... on) {
        this.on = ImmutableSet.<Object>copyOf(on);
    }
```

## RuleId[id=Anonymous2MethodRef]
### Anonymous2MethodRef
Anonymous new Predicate() can be replaced with method reference
in `src/main/java/com/palantir/ptoss/util/Reflections.java`
#### Snippet
```java
     * @see Modifier#isFinal(int)
     */
    public static final Predicate<Field> IS_FIELD_FINAL = new Predicate<Field>() {
        public boolean apply(Field from) {
            return isFieldFinal(from);
```

## RuleId[id=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `strongBindings` are updated, but never queried
in `src/main/java/com/palantir/ptoss/cinch/core/WeakBindableModel.java`
#### Snippet
```java
     * of the {@link Binding} objects passed to this model.
     */
    private final List<Binding> strongBindings = Lists.newArrayList();

    /**
```

## RuleId[id=Convert2Lambda]
### Convert2Lambda
Anonymous new Function() can be replaced with lambda
in `src/main/java/com/palantir/ptoss/cinch/core/ObjectFieldMethod.java`
#### Snippet
```java
     * A function that returns the field's name.
     */
    public static final Function<ObjectFieldMethod, String> TO_FIELD_NAME = new Function<ObjectFieldMethod, String>() {
        public String apply(ObjectFieldMethod from) {
            return from.getField().getName();
```

### Convert2Lambda
Anonymous new Function() can be replaced with lambda
in `src/main/java/com/palantir/ptoss/util/Reflections.java`
#### Snippet
```java
            }
            final Method readMethod = method;
            return new Function<F, T>() {
                public T apply(F from) {
                    try {
```

### Convert2Lambda
Anonymous new Function() can be replaced with lambda
in `src/main/java/com/palantir/ptoss/util/Reflections.java`
#### Snippet
```java
     * @see Field#getName()
     */
    public static final Function<Field, String> FIELD_TO_NAME = new Function<Field, String>() {
        public String apply(Field from) {
            return from.getName();
```

### Convert2Lambda
Anonymous new Predicate() can be replaced with lambda
in `src/main/java/com/palantir/ptoss/util/Reflections.java`
#### Snippet
```java
     * @see Modifier#isFinal(int)
     */
    public static final Predicate<Field> IS_FIELD_FINAL = new Predicate<Field>() {
        public boolean apply(Field from) {
            return isFieldFinal(from);
```

### Convert2Lambda
Anonymous new Function() can be replaced with lambda
in `src/main/java/com/palantir/ptoss/util/Reflections.java`
#### Snippet
```java
     * @see Class#getSimpleName()
     */
    public static final Function<Field, String> FIELD_TO_CONTAINING_CLASS_NAME = new Function<Field, String>() {
        public String apply(Field input) {
            return input.getDeclaringClass().getSimpleName();
```

### Convert2Lambda
Anonymous new Function() can be replaced with lambda
in `src/main/java/com/palantir/ptoss/cinch/core/BindingContext.java`
#### Snippet
```java

    public Set<BindableModel> getBindableModels() {
        Function<Field, BindableModel> f = new Function<Field, BindableModel>() {
            public BindableModel apply(Field from) {
                return getFieldObject(from, BindableModel.class);
```

### Convert2Lambda
Anonymous new Predicate() can be replaced with lambda
in `src/main/java/com/palantir/ptoss/cinch/core/BindingContext.java`
#### Snippet
```java
    public List<ObjectFieldMethod> getAnnotatedParameterlessMethods(final Class<? extends Annotation> annotation) {
        return Lists.newArrayList(Iterables.filter(Reflections.getParameterlessMethodsForClassHierarchy(object),
                new Predicate<ObjectFieldMethod>() {
                    public boolean apply(ObjectFieldMethod input) {
                        return input.getMethod().isAnnotationPresent(annotation);
```

### Convert2Lambda
Anonymous new Predicate\>() can be replaced with lambda
in `src/main/java/com/palantir/ptoss/cinch/core/BindingContext.java`
#### Snippet
```java
        List<Class<?>> classes = Reflections.getTypesOfTypeForClassHierarchy(
                modelClass.getClass(), ModelUpdate.class);
        Predicate<Class<?>> isEnum = new Predicate<Class<?>>() {
            public boolean apply(final Class<?> input) {
                return input.isEnum();
```

## RuleId[id=StaticPseudoFunctionalStyleMethod]
### StaticPseudoFunctionalStyleMethod
Pseudo functional style code
in `src/main/java/com/palantir/ptoss/cinch/core/BindingContext.java`
#### Snippet
```java
        List<Field> allModelFields = Reflections.getFieldsOfTypeForClassHierarchy(object.getClass(), BindableModel.class);
        List<Field> notBindableFields = Reflections.getAnnotatedFieldsForClassHierarchy(object.getClass(), NotBindable.class);
        allModelFields = ImmutableList.copyOf(Iterables.filter(allModelFields, Predicates.not(Predicates.in(notBindableFields))));
        List<Field> nonFinalModelFields = ImmutableList.copyOf(Iterables.filter(allModelFields, Predicates.not(Reflections.IS_FIELD_FINAL)));
        if (!nonFinalModelFields.isEmpty()) {
```

### StaticPseudoFunctionalStyleMethod
Pseudo functional style code
in `src/main/java/com/palantir/ptoss/cinch/core/BindingContext.java`
#### Snippet
```java
        List<Field> notBindableFields = Reflections.getAnnotatedFieldsForClassHierarchy(object.getClass(), NotBindable.class);
        allModelFields = ImmutableList.copyOf(Iterables.filter(allModelFields, Predicates.not(Predicates.in(notBindableFields))));
        List<Field> nonFinalModelFields = ImmutableList.copyOf(Iterables.filter(allModelFields, Predicates.not(Reflections.IS_FIELD_FINAL)));
        if (!nonFinalModelFields.isEmpty()) {
            throw new BindingException("All BindableModels have to be final or marked with @NotBindable, but "+
```

### StaticPseudoFunctionalStyleMethod
Pseudo functional style code
in `src/main/java/com/palantir/ptoss/cinch/core/BindingContext.java`
#### Snippet
```java
        if (!nonFinalModelFields.isEmpty()) {
            throw new BindingException("All BindableModels have to be final or marked with @NotBindable, but "+
                Iterables.transform(nonFinalModelFields, Reflections.FIELD_TO_NAME)+" are not.");
        }
        return allModelFields;
```

### StaticPseudoFunctionalStyleMethod
Pseudo functional style code
in `src/main/java/com/palantir/ptoss/cinch/core/BindingContext.java`
#### Snippet
```java
            }
        };
        return ImmutableSet.copyOf(Iterables.transform(bindableModels.values(), f));
    }

```

### StaticPseudoFunctionalStyleMethod
Pseudo functional style code
in `src/main/java/com/palantir/ptoss/cinch/core/BindingContext.java`
#### Snippet
```java

    public List<ObjectFieldMethod> getAnnotatedParameterlessMethods(final Class<? extends Annotation> annotation) {
        return Lists.newArrayList(Iterables.filter(Reflections.getParameterlessMethodsForClassHierarchy(object),
                new Predicate<ObjectFieldMethod>() {
                    public boolean apply(ObjectFieldMethod input) {
```

### StaticPseudoFunctionalStyleMethod
Pseudo functional style code
in `src/main/java/com/palantir/ptoss/cinch/core/BindingContext.java`
#### Snippet
```java
        // Get all fields marked @Bindable
        List<Field> bindables = getAnnotatedFields(Bindable.class);
        if (Iterables.any(bindables, Predicates.not(Reflections.IS_FIELD_FINAL))) {
            throw new BindingException("all @Bindables have to be final");
        }
```

### StaticPseudoFunctionalStyleMethod
Pseudo functional style code
in `src/main/java/com/palantir/ptoss/cinch/core/BindingContext.java`
#### Snippet
```java
        };
        // Look for ModelUpdate classes in implemented interfaces
        classes = Lists.newArrayList(Iterables.filter(classes, isEnum));
        for (Class<?> iface : modelClass.getClass().getInterfaces()) {
            classes.addAll(Lists.newArrayList(Iterables.filter(
```

### StaticPseudoFunctionalStyleMethod
Pseudo functional style code
in `src/main/java/com/palantir/ptoss/cinch/core/BindingContext.java`
#### Snippet
```java
        classes = Lists.newArrayList(Iterables.filter(classes, isEnum));
        for (Class<?> iface : modelClass.getClass().getInterfaces()) {
            classes.addAll(Lists.newArrayList(Iterables.filter(
                    Reflections.getTypesOfTypeForClassHierarchy(
                    iface, ModelUpdate.class), isEnum)));
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `newContents`
in `src/main/java/com/palantir/ptoss/cinch/swing/JListWiringHarness.java`
#### Snippet
```java
    private static void updateListModel(JList list, List<?> newContents) {
        if (newContents == null) {
            newContents = ImmutableList.of();
        }
        ListModel oldModel = list.getModel();
```

### AssignmentToMethodParameter
Assignment to method parameter `klass`
in `src/main/java/com/palantir/ptoss/util/Reflections.java`
#### Snippet
```java
        while (klass != null) {
            visitor.visit(klass);
            klass = klass.getSuperclass();
        }
    }
```

## RuleId[id=PrimitiveArrayArgumentToVariableArgMethod]
### PrimitiveArrayArgumentToVariableArgMethod
Confusing primitive array argument to varargs method
in `src/main/java/com/palantir/ptoss/cinch/swing/JPasswordFieldWiringHarness.java`
#### Snippet
```java
            private void updateModel() {
                try {
                    setter.invoke(model, pwdField.getPassword());
                } catch (Exception ex) {
                    Wiring.logger.error("exception in JPasswordField binding", ex);
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `src/main/java/com/palantir/ptoss/cinch/swing/OnFocusChange.java`
#### Snippet
```java
        private static String normalizeString(String string) {
            if (Bound.Utilities.isNullOrBlank(string)) {
                return null;
            }
            return string;
```

### ReturnNull
Return of `null`
in `src/main/java/com/palantir/ptoss/util/Reflections.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/com/palantir/ptoss/util/Reflections.java`
#### Snippet
```java
        } catch (IllegalAccessException e) {
            // shouldn't happen since we set accessibility above.
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/com/palantir/ptoss/cinch/core/BindingContext.java`
#### Snippet
```java
    public static List<Object> getOnObjects(String[] ons, BindableModel model) {
        if (ons == null) {
            return null;
        }
        List<Object> onObjects = Lists.newArrayList();
```

### ReturnNull
Return of `null`
in `src/main/java/com/palantir/ptoss/cinch/core/BindingContext.java`
#### Snippet
```java
        Field field = bindableModels.get(key);
        if (field == null) {
            return null;
        }
        return getFieldObject(field, BindableModel.class);
```

### ReturnNull
Return of `null`
in `src/main/java/com/palantir/ptoss/cinch/core/BindingContext.java`
#### Snippet
```java
        }
        if (classes.size() == 0) {
            return null;
        }
        return classes;
```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`classes.size() == 0` can be replaced with 'classes.isEmpty()'
in `src/main/java/com/palantir/ptoss/cinch/core/BindingContext.java`
#### Snippet
```java
                    iface, ModelUpdate.class), isEnum)));
        }
        if (classes.size() == 0) {
            return null;
        }
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `kt` is redundant
in `src/main/java/com/palantir/ptoss/util/Throwables.java`
#### Snippet
```java
    public static <K extends Throwable> void throwIfInstance(Throwable t, Class<K> clazz) throws K {
        if ((t != null) && clazz.isAssignableFrom(t.getClass())) {
            K kt = (K) t;
            throw kt;
        }
```

### UnnecessaryLocalVariable
Local variable `binding` is redundant
in `src/main/java/com/palantir/ptoss/cinch/core/CallOnUpdate.java`
#### Snippet
```java
            final Method actualMethod = method.getMethod();
            actualMethod.setAccessible(true);
            final Binding binding = new Binding() {
                public <T extends Enum<?> & ModelUpdate> void update(final T... changed) {
                    if (!BindingContext.isOn(onObjects, changed)) {
```

### UnnecessaryLocalVariable
Local variable `ofm` is redundant
in `src/main/java/com/palantir/ptoss/cinch/core/BindingContext.java`
#### Snippet
```java
    // TODO (regs) dead code?
    public ObjectFieldMethod getBindableModelMethod(String key) {
        ObjectFieldMethod ofm = bindableModelMethods.get(key);
        return ofm;
    }
```

### UnnecessaryLocalVariable
Local variable `ofm` is redundant
in `src/main/java/com/palantir/ptoss/cinch/core/BindingContext.java`
#### Snippet
```java
     */
    public ObjectFieldMethod getBindableMethod(String key) {
        ObjectFieldMethod ofm = bindableMethods.get(key);
        return ofm;
    }
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/com/palantir/ptoss/cinch/swing/JPasswordFieldWiringHarness.java`
#### Snippet
```java
                    char[] charArray = (char[])getter.invoke(model);
                    if (charArray == null) {
                        charArray = new char[0];
                    }
                    if (!Arrays.equals(charArray, pwdField.getPassword())) {
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/com/palantir/ptoss/util/Reflections.java`
#### Snippet
```java
     * of type <code>returnType</code> that resides in field <code>getter</code>
     */
    public static <F, T> Function<F, T> getterFunction(final Class<F> klass, final Class<T> returnType, String getter) {
        try {
            BeanInfo beanInfo = Introspector.getBeanInfo(klass);
```

### BoundedWildcard
Can generalize to `? super Class`
in `src/main/java/com/palantir/ptoss/util/Reflections.java`
#### Snippet
```java
     * @param visitor Visitor object
     */
    public static void visitClassHierarchy(Class<?> klass, Visitor<Class<?>> visitor) {
        while (klass != null) {
            visitor.visit(klass);
```

### BoundedWildcard
Can generalize to `? super PropertyDescriptor`
in `src/main/java/com/palantir/ptoss/cinch/core/BindingContext.java`
#### Snippet
```java
    }

    private Map<String, ObjectFieldMethod> indexBindableProperties(Function<PropertyDescriptor, Method> methodFn) throws IntrospectionException {
        final Map<ObjectFieldMethod, String> getterOfms = Maps.newHashMap();
        for (Field field : Sets.newHashSet(bindableModels.values())) {
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/com/palantir/ptoss/cinch/core/BindingContext.java`
#### Snippet
```java
    }

    private static <T> Map<String, T> dotIndex(Collection<T> items, Function<T, String> qualifierFn, Function<T, String> blindFn) {
        Set<String> ambiguousNames = Sets.newHashSet();
        Map<String, T> results = Maps.newHashMap();
```

### BoundedWildcard
Can generalize to `? super T`
in `src/main/java/com/palantir/ptoss/cinch/core/BindingContext.java`
#### Snippet
```java
    }

    private static <T> Map<String, T> dotIndex(Collection<T> items, Function<T, String> qualifierFn, Function<T, String> blindFn) {
        Set<String> ambiguousNames = Sets.newHashSet();
        Map<String, T> results = Maps.newHashMap();
```

### BoundedWildcard
Can generalize to `? super T`
in `src/main/java/com/palantir/ptoss/cinch/core/BindingContext.java`
#### Snippet
```java
    }

    private static <T> Map<String, T> dotIndex(Collection<T> items, Function<T, String> qualifierFn, Function<T, String> blindFn) {
        Set<String> ambiguousNames = Sets.newHashSet();
        Map<String, T> results = Maps.newHashMap();
```

### BoundedWildcard
Can generalize to `? extends ObjectFieldMethod`
in `src/main/java/com/palantir/ptoss/cinch/core/BindingContext.java`
#### Snippet
```java
    }

    private static Map<String, ObjectFieldMethod> indexMethods(List<ObjectFieldMethod> methods) throws IllegalArgumentException {
        Map<String, ObjectFieldMethod> map = Maps.newHashMap();
        Set<String> ambiguousNames = Sets.newHashSet();
```

## RuleId[id=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `SimpleBinding` has no concrete subclass
in `src/main/java/com/palantir/ptoss/cinch/core/SimpleBinding.java`
#### Snippet
```java
 * their listener's behavior. Any "on" parameters can be passed in at creation time.
 */
public abstract class SimpleBinding implements Binding {

    private final ImmutableSet<Object> on;
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `amlMethod != null` is always `true`
in `src/main/java/com/palantir/ptoss/cinch/swing/OnClick.java`
#### Snippet
```java
            }
            Method amlMethod = field.getType().getMethod("addMouseListener", MouseListener.class);
            if (amlMethod != null) {
                Object actionObject = context.getFieldObject(field, Object.class);
                final ObjectFieldMethod ofm = context.getBindableMethod(call);
```

### ConstantValue
Condition `aflMethod != null` is always `true`
in `src/main/java/com/palantir/ptoss/cinch/swing/OnFocusChange.java`
#### Snippet
```java
            throws SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException {
            Method aflMethod = field.getType().getMethod("addFocusListener", FocusListener.class);
            if (aflMethod != null) {
                Object actionObject = context.getFieldObject(field, Object.class);
                final ObjectFieldMethod lostOFM;
```

### ConstantValue
Condition `setEnabledMethod == null` is always `false`
in `src/main/java/com/palantir/ptoss/cinch/swing/EnabledIf.java`
#### Snippet
```java
            throws SecurityException, NoSuchMethodException, IllegalArgumentException, IntrospectionException {
            final Method setEnabledMethod = field.getType().getMethod("setEnabled", boolean.class);
            if (setEnabledMethod == null) {
                throw new BindingException("no setEnabled call on EnabledIf field: " + field);
            }
```

### ConstantValue
Condition `setVisibleMethod == null` is always `false`
in `src/main/java/com/palantir/ptoss/cinch/swing/VisibleIf.java`
#### Snippet
```java
            throws SecurityException, NoSuchMethodException, IllegalArgumentException, IntrospectionException {
            final Method setVisibleMethod = field.getType().getMethod("setVisible", boolean.class);
            if (setVisibleMethod == null) {
                throw new BindingException("no setVisible call on VisibleIf field: " + field);
            }
```

### ConstantValue
Condition `addChangeMethod != null` is always `true`
in `src/main/java/com/palantir/ptoss/cinch/swing/OnChange.java`
#### Snippet
```java
            final Method adjustMethod = _adjustMethod;
            final Method addChangeMethod = field.getType().getMethod("addChangeListener", ChangeListener.class);
            if (addChangeMethod != null) {
                final Object changeObject = context.getFieldObject(field, Object.class);
                final ObjectFieldMethod ofm = context.getBindableMethod(call);
```

### ConstantValue
Value `onObject` is always 'null'
in `src/main/java/com/palantir/ptoss/cinch/core/BindingContext.java`
#### Snippet
```java
            throw new IllegalArgumentException("could not find \"on\" parameter " + on);
        }
        return onObject;
    }

```

## RuleId[id=UnnecessaryBoxing]
### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `src/main/java/com/palantir/ptoss/cinch/swing/JToggleButtonWiringHarness.java`
#### Snippet
```java
    public static Binding bindJToggleButtonToBoolean(String value,
            final Mutator mutator, final AbstractButton button) {
        final boolean booleanValue = Boolean.valueOf(value);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/com/palantir/ptoss/cinch/swing/JToggleButtonWiringHarness.java`
#### Snippet
```java
            public <T extends Enum<?> & ModelUpdate> void update(T... changed) {
                try {
                    button.setSelected(mutator.get().equals(Boolean.valueOf(booleanValue)));
                } catch (Exception ex) {
                    Wiring.logger.error("exception in JRadioButton binding", ex); //$NON-NLS-1$
```

