# Cinch 
 
# Bad smells
I found 85 bad smells with 30 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryModifier | 26 | true |
| JavadocDeclaration | 17 | false |
| Deprecation | 10 | false |
| ConstantValue | 6 | false |
| UNCHECKED_WARNING | 5 | false |
| DataFlowIssue | 5 | false |
| UnnecessaryLocalVariable | 4 | true |
| UnnecessarySemicolon | 3 | false |
| SuspiciousMethodCalls | 2 | false |
| RedundantTypeArguments | 2 | false |
| JavadocReference | 1 | false |
| FieldMayBeFinal | 1 | false |
| MismatchedCollectionQueryUpdate | 1 | false |
| PrimitiveArrayArgumentToVariableArgMethod | 1 | false |
| DuplicatedCode | 1 | false |
## RuleId[id=UnnecessaryModifier]
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
Modifier `static` is redundant for inner classes of interfaces
in `src/main/java/com/palantir/ptoss/cinch/swing/OnChange.java`
#### Snippet
```java
     *     Inner utility class that performs the runtime wiring of all {@link OnChange} bindings.
     */
    static class Wiring implements BindingWiring {
        private static final Logger logger = LoggerFactory.getLogger(OnChange.class);

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

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked call to 'addElement(E)' as a member of raw type 'javax.swing.DefaultComboBoxModel'
in `src/main/java/com/palantir/ptoss/cinch/swing/JComboBoxWiringHarness.java`
#### Snippet
```java
        DefaultComboBoxModel comboModel = new DefaultComboBoxModel();
        if (nullValue != null) {
            comboModel.addElement(nullValue);
        }
        for (Object obj : newContents) {
```

### UNCHECKED_WARNING
Unchecked call to 'addElement(E)' as a member of raw type 'javax.swing.DefaultComboBoxModel'
in `src/main/java/com/palantir/ptoss/cinch/swing/JComboBoxWiringHarness.java`
#### Snippet
```java
        }
        for (Object obj : newContents) {
            comboModel.addElement(obj);
        }
        if (comboModel.getIndexOf(selected) != -1) {
```

### UNCHECKED_WARNING
Unchecked call to 'setModel(ComboBoxModel)' as a member of raw type 'javax.swing.JComboBox'
in `src/main/java/com/palantir/ptoss/cinch/swing/JComboBoxWiringHarness.java`
#### Snippet
```java
            }
        }
        combo.setModel(comboModel);
    }
}
```

### UNCHECKED_WARNING
Unchecked call to 'addElement(E)' as a member of raw type 'javax.swing.DefaultListModel'
in `src/main/java/com/palantir/ptoss/cinch/swing/JListWiringHarness.java`
#### Snippet
```java
        listModel.ensureCapacity(newContents.size());
        for (Object obj : newContents) {
            listModel.addElement(obj);
        }
        list.setModel(listModel);
```

### UNCHECKED_WARNING
Unchecked call to 'setModel(ListModel)' as a member of raw type 'javax.swing.JList'
in `src/main/java/com/palantir/ptoss/cinch/swing/JListWiringHarness.java`
#### Snippet
```java
            listModel.addElement(obj);
        }
        list.setModel(listModel);
        List<Integer> newIndices = Lists.newArrayListWithCapacity(selected.length);
        Set<Object> selectedSet = Sets.newHashSet(selected);
```

## RuleId[id=JavadocReference]
### JavadocReference
Symbol `createBindings(BindingContext)` is inaccessible from here
in `src/main/java/com/palantir/ptoss/cinch/swing/Action.java`
#### Snippet
```java
        /**
         * Wires all {@link Action} bindings in the passed context.
         * Called by {@link Bindings#createBindings(BindingContext)} as part of runtime wiring
         * process.
         *
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
in `src/main/java/com/palantir/ptoss/cinch/swing/VisibleIf.java`
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
in `src/main/java/com/palantir/ptoss/cinch/swing/EnabledIf.java`
#### Snippet
```java
     * Enum to specify if normal or inverted comparisons should be used.
     */
    public enum Type { NORMAL, INVERTED };
    /**
     * The model boolean property to bind to.
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@param toBind` tag description is missing
in `src/main/java/com/palantir/ptoss/cinch/core/BindableModel.java`
#### Snippet
```java
     * Attach the binding to the model. Whenever the model is updated then the binding will be
     * triggered.
     * @param toBind
     */
    void bind(Binding toBind);
```

### JavadocDeclaration
`@param toUnbind` tag description is missing
in `src/main/java/com/palantir/ptoss/cinch/core/BindableModel.java`
#### Snippet
```java
    /**
     * Removes the passed binding from this model.
     * @param toUnbind
     */
    void unbind(Binding toUnbind);
```

### JavadocDeclaration
Javadoc pointing to itself
in `src/main/java/com/palantir/ptoss/cinch/core/ModelUpdates.java`
#### Snippet
```java
     * receive updates not sent specifically to any {@link ModelUpdate} - i.e. default updates. To
     * selectively answer a specific {@link ModelUpdate} and also still get default notications,
     * add {@link ModelUpdates#UNSPECIFIED} to the list of {@link ModelUpdate}s passed to {@link Bound#on()}.
     * </p>
     * @see Bound
```

### JavadocDeclaration
`@param ` tag description is missing
in `src/main/java/com/palantir/ptoss/cinch/core/SimpleBinding.java`
#### Snippet
```java
     * Constructor that will make it so this {@link Binding} only fires on the given
     * "on" parameters.
     * @param <T>
     * @param on
     */
```

### JavadocDeclaration
`@param on` tag description is missing
in `src/main/java/com/palantir/ptoss/cinch/core/SimpleBinding.java`
#### Snippet
```java
     * "on" parameters.
     * @param <T>
     * @param on
     */
    public <T extends Enum<?> & ModelUpdate> SimpleBinding(T... on) {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/palantir/ptoss/util/Mutator.java`
#### Snippet
```java
     * @param target the model and field to bind this {@link Mutator} to.
     * @return the {@link Mutator}
     * @throws IntrospectionException
     */
    public static Mutator create(BindingContext context, String target) throws IntrospectionException {
```

### JavadocDeclaration
`@param binding` tag description is missing
in `src/main/java/com/palantir/ptoss/cinch/core/WeakBindableModel.java`
#### Snippet
```java
     * Binds this model to a {@link Binding} using strong references.
     *
     * @param binding
     */
    public void bindStrongly(Binding binding) {
```

### JavadocDeclaration
`@param binding` tag description is missing
in `src/main/java/com/palantir/ptoss/cinch/core/WeakBindableModel.java`
#### Snippet
```java
     * the various {@link WiringHarness} objects to bind individual components to this model.
     *
     * @param binding
     */
    public void bind(Binding binding) {
```

### JavadocDeclaration
`@param context` tag description is missing
in `src/main/java/com/palantir/ptoss/cinch/swing/Action.java`
#### Snippet
```java
         * process.
         *
         * @param context
         */
        public Collection<Binding> wire(BindingContext context) {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/palantir/ptoss/cinch/core/WiringHarness.java`
#### Snippet
```java
     * @param toWire the component to be wired by this harness.
     * @return one or more {@link Binding} objects represent the wirings performed by this harness.
     * @throws IllegalAccessException
     * @throws IntrospectionException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/palantir/ptoss/cinch/core/WiringHarness.java`
#### Snippet
```java
     * @return one or more {@link Binding} objects represent the wirings performed by this harness.
     * @throws IllegalAccessException
     * @throws IntrospectionException
     */
    Collection<? extends Binding> wire(T bound, BindingContext context, W toWire)
```

### JavadocDeclaration
`@param object` tag description is missing
in `src/main/java/com/palantir/ptoss/cinch/core/ObjectFieldMethod.java`
#### Snippet
```java
    /**
     * Constructs a tuple of an object, a field on that object, and a method on that object.
     * @param object
     * @param field
     * @param method
```

### JavadocDeclaration
`@param field` tag description is missing
in `src/main/java/com/palantir/ptoss/cinch/core/ObjectFieldMethod.java`
#### Snippet
```java
     * Constructs a tuple of an object, a field on that object, and a method on that object.
     * @param object
     * @param field
     * @param method
     */
```

### JavadocDeclaration
`@param method` tag description is missing
in `src/main/java/com/palantir/ptoss/cinch/core/ObjectFieldMethod.java`
#### Snippet
```java
     * @param object
     * @param field
     * @param method
     */
    public ObjectFieldMethod(Object object, Field field, Method method) {
```

### JavadocDeclaration
Javadoc pointing to itself
in `src/main/java/com/palantir/ptoss/cinch/swing/Bound.java`
#### Snippet
```java
     * receive not sent specifically to any {@link ModelUpdate} - i.e. default updates. To
     * selectively answer a specific {@link ModelUpdate} and also still get default notications,
     * add {@link ModelUpdates#UNSPECIFIED} to the list of {@link ModelUpdate}s passed to {@link #on()}.
     * @see ModelUpdates
     */
```

### JavadocDeclaration
`@param model` tag description is missing
in `src/main/java/com/palantir/ptoss/cinch/core/BindingContext.java`
#### Snippet
```java
     * a {@link Bound} annotation to an Enum object in this runtime.
     * @param on <code>on</code> parameter from a {@link Bound} annotation.
     * @param model
     * @return the resolved object
     * @throws IllegalArgumentException if the referenced object can't be found.
```

### JavadocDeclaration
`@param modelClass` tag description is missing
in `src/main/java/com/palantir/ptoss/cinch/core/BindingContext.java`
#### Snippet
```java
    /**
     * Returns the list of {@link ModelUpdate} types in this binding context.
     * @param modelClass
     * @return the of {@link Class}es that implement {@link ModelUpdate} in this binding context.
     */
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `wiringHarnesses` may be 'final'
in `src/main/java/com/palantir/ptoss/cinch/swing/Bound.java`
#### Snippet
```java
        static final Logger logger = LoggerFactory.getLogger(Bound.class);

        private static Map<Class<?>, WiringHarness<Bound, Field>> wiringHarnesses =
            ImmutableMap.<Class<?>, WiringHarness<Bound, Field>>builder()
                .put(AbstractButton.class, new AbstractButtonWiringHarness())
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

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `src/main/java/com/palantir/ptoss/cinch/core/BindingContext.java`
#### Snippet
```java
        if (string == null) {
            return true;
        }
        int length = string.length();
        if (length > 0) {
            for (int i = 0; i < length; i++) {
                if (!Character.isWhitespace(string.charAt(i))) {
                    return false;
                }
            }
        }
        return true;
```

## RuleId[id=UnnecessaryLocalVariable]
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

## RuleId[id=Deprecation]
### Deprecation
'getSelectedValues()' is deprecated
in `src/main/java/com/palantir/ptoss/cinch/swing/JListWiringHarness.java`
#### Snippet
```java
            return;
        }
        Object[] selected = list.getSelectedValues();
        DefaultListModel listModel = new DefaultListModel();
        listModel.ensureCapacity(newContents.size());
```

### Deprecation
'isAccessible()' is deprecated
in `src/main/java/com/palantir/ptoss/cinch/swing/OnFocusChange.java`
#### Snippet
```java
                        try {
                            if (lostOFM != null) {
                                boolean accessible = lostOFM.getMethod().isAccessible();
                                lostOFM.getMethod().setAccessible(true);
                                lostOFM.getMethod().invoke(lostOFM.getObject());
```

### Deprecation
'isAccessible()' is deprecated
in `src/main/java/com/palantir/ptoss/cinch/swing/OnFocusChange.java`
#### Snippet
```java
                        try {
                            if (gainedOFM != null) {
                                boolean accessible = gainedOFM.getMethod().isAccessible();
                                gainedOFM.getMethod().setAccessible(true);
                                gainedOFM.getMethod().invoke(gainedOFM.getObject());
```

### Deprecation
'isAccessible()' is deprecated
in `src/main/java/com/palantir/ptoss/util/Mutator.java`
#### Snippet
```java
            throw new IllegalStateException("can not call set() with no setter.");
        }
        boolean accessible = setter.getMethod().isAccessible();
        setter.getMethod().setAccessible(true);
        setter.getMethod().invoke(model, value);
```

### Deprecation
'isAccessible()' is deprecated
in `src/main/java/com/palantir/ptoss/util/Mutator.java`
#### Snippet
```java
            throw new IllegalStateException("can not call get() with no getter.");
        }
        boolean accessible = getter.getMethod().isAccessible();
        getter.getMethod().setAccessible(true);
        Object value = getter.getMethod().invoke(model);
```

### Deprecation
'isAccessible()' is deprecated
in `src/main/java/com/palantir/ptoss/cinch/swing/Action.java`
#### Snippet
```java
                public void actionPerformed(ActionEvent e) {
                    try {
                        boolean accessible = ofm.getMethod().isAccessible();
                        ofm.getMethod().setAccessible(true);
                        ofm.getMethod().invoke(ofm.getObject());
```

### Deprecation
'isAccessible()' is deprecated
in `src/main/java/com/palantir/ptoss/util/Reflections.java`
#### Snippet
```java
    public static <T> T getFieldObject(Object object, Field field, Class<T> klass) {
        try {
            boolean accessible = field.isAccessible();
            field.setAccessible(true);
            Object fieldObject = field.get(object);
```

### Deprecation
'getSelectedValues()' is deprecated
in `src/main/java/com/palantir/ptoss/cinch/swing/BoundSelection.java`
#### Snippet
```java
                        try {
                            if (multi) {
                                mutator.set(ImmutableList.copyOf(list.getSelectedValues()));
                            } else {
                                mutator.set(list.getSelectedValue());
```

### Deprecation
'getSelectedValues()' is deprecated
in `src/main/java/com/palantir/ptoss/cinch/swing/BoundSelection.java`
#### Snippet
```java
                    try {
                        if (multi) {
                            Object[] selVals = list.getSelectedValues();
                            ImmutableList<Object> listCurrent = ImmutableList.copyOf(selVals);
                            Collection<?> current = (Collection<?>)mutator.get();
```

### Deprecation
'isAccessible()' is deprecated
in `src/main/java/com/palantir/ptoss/cinch/core/BindingContext.java`
#### Snippet
```java
        Map<String, Object> map = Maps.newHashMap();
        for (Field field : object.getClass().getDeclaredFields()) {
            boolean accessible = field.isAccessible();
            field.setAccessible(true);
            if (Reflections.isFieldFinal(field) && Reflections.isFieldStatic(field)) {
```

## RuleId[id=SuspiciousMethodCalls]
### SuspiciousMethodCalls
Suspicious call to 'Set.contains()'
in `src/main/java/com/palantir/ptoss/cinch/core/BindingContext.java`
#### Snippet
```java

    static <T> boolean isOn(Object onObject, Set<T> changedSet) {
        if (changedSet.contains(ModelUpdates.ALL)) {
            return true;
        }
```

### SuspiciousMethodCalls
Suspicious call to 'Set.contains()'
in `src/main/java/com/palantir/ptoss/cinch/core/BindingContext.java`
#### Snippet
```java
            return true;
        }
        return changedSet.contains(onObject);
    }

```

## RuleId[id=RedundantTypeArguments]
### RedundantTypeArguments
Explicit type arguments can be inferred
in `src/main/java/com/palantir/ptoss/cinch/core/SimpleBinding.java`
#### Snippet
```java
     */
    public <T extends Enum<?> & ModelUpdate> SimpleBinding(T... on) {
        this.on = ImmutableSet.<Object>copyOf(on);
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `src/main/java/com/palantir/ptoss/cinch/core/SimpleBinding.java`
#### Snippet
```java
        }
        if (fire) {
            this.changed = ImmutableSet.<Object>copyOf(changes);
            onUpdate();
        }
```

## RuleId[id=ConstantValue]
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
Value `onObject` is always 'null'
in `src/main/java/com/palantir/ptoss/cinch/core/BindingContext.java`
#### Snippet
```java
            throw new IllegalArgumentException("could not find \"on\" parameter " + on);
        }
        return onObject;
    }

```

