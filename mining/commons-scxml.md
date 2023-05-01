# commons-scxml 
 
# Bad smells
I found 191 bad smells with 15 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryFullyQualifiedName | 30 | false |
| ReturnNull | 25 | false |
| BoundedWildcard | 22 | false |
| SystemOutErr | 11 | false |
| NonProtectedConstructorInAbstractClass | 9 | true |
| AssignmentToMethodParameter | 9 | false |
| ConstantValue | 8 | false |
| NestedAssignment | 7 | false |
| MethodOverloadsParentMethod | 6 | false |
| UseOfPropertiesAsHashtable | 6 | false |
| UnnecessaryCallToStringValueOf | 5 | false |
| NonSerializableFieldInSerializableClass | 5 | false |
| StringEquality | 4 | false |
| DataFlowIssue | 3 | false |
| CharsetObjectCanBeUsed | 3 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 3 | false |
| RedundantFieldInitialization | 3 | false |
| UnusedAssignment | 3 | false |
| UtilityClassWithoutPrivateConstructor | 2 | true |
| CommentedOutCode | 2 | false |
| KeySetIterationMayUseEntrySet | 2 | false |
| SizeReplaceableByIsEmpty | 2 | true |
| RedundantSuppression | 2 | false |
| ReplaceAssignmentWithOperatorAssignment | 2 | false |
| AssignmentUsedAsCondition | 1 | false |
| EmptyStatementBody | 1 | false |
| AssignmentToStaticFieldFromInstanceMethod | 1 | false |
| MismatchedJavadocCode | 1 | false |
| ProtectedMemberInFinalClass | 1 | true |
| UnnecessaryToStringCall | 1 | true |
| AssignmentToForLoopParameter | 1 | false |
| AbstractClassNeverImplemented | 1 | false |
| MissortedModifiers | 1 | false |
| ClassNameSameAsAncestorName | 1 | false |
| MissingDeprecatedAnnotation | 1 | false |
| ThrowablePrintStackTrace | 1 | false |
| ExceptionNameDoesntEndWithException | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| InstanceofCatchParameter | 1 | false |
| SynchronizeOnThis | 1 | false |
| DoubleBraceInitialization | 1 | false |
## RuleId[id=StringEquality]
### StringEquality
String values are compared using `==`, not 'equals()'
in `src/main/java/org/apache/commons/scxml2/env/SimpleErrorReporter.java`
#### Snippet
```java
        msg.append(errCode).append(" (");
        msg.append(errDetail).append("): ");
        if (errCode == ErrorConstants.NO_INITIAL) {
            if (errCtx instanceof SCXML) {
                //determineInitialStates
```

### StringEquality
String values are compared using `==`, not 'equals()'
in `src/main/java/org/apache/commons/scxml2/env/SimpleErrorReporter.java`
#### Snippet
```java
                msg.append("State ").append(LogUtils.getTTPath((State) errCtx));
            }
        } else if (errCode == ErrorConstants.UNKNOWN_ACTION) {
            //executeActionList
            msg.append("Action: ").append(errCtx.getClass().getName());
```

### StringEquality
String values are compared using `==`, not 'equals()'
in `src/main/java/org/apache/commons/scxml2/env/SimpleErrorReporter.java`
#### Snippet
```java
            //executeActionList
            msg.append("Action: ").append(errCtx.getClass().getName());
        } else if (errCode == ErrorConstants.ILLEGAL_CONFIG) {
            //isLegalConfig
            if (errCtx instanceof Map.Entry) { //unchecked cast below
```

### StringEquality
String values are compared using `==`, not 'equals()'
in `src/main/java/org/apache/commons/scxml2/env/SimpleErrorReporter.java`
#### Snippet
```java
                msg.append(']');
            }
        } else if (errCode == ErrorConstants.EXPRESSION_ERROR) {
            if (errCtx instanceof Executable) {
                final TransitionTarget parent = ((Executable) errCtx).getParent();
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `PayloadBuilder` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/scxml2/model/PayloadBuilder.java`
#### Snippet
```java
 * Utility class to build payload from {@link Param}s and/or a namelist
 */
public class PayloadBuilder {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `SCXMLConstants` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/scxml2/SCXMLConstants.java`
#### Snippet
```java
package org.apache.commons.scxml2;

public final class SCXMLConstants {

    /**
```

## RuleId[id=AssignmentUsedAsCondition]
### AssignmentUsedAsCondition
Assignment `transitionMatched = matchTransition(exctx, transition, eventName)` used as condition
in `src/main/java/org/apache/commons/scxml2/semantics/SCXMLSemanticsImpl.java`
#### Snippet
```java
                do {
                    for (final Transition transition : current.getTransitionsList()) {
                        if (transitionMatched = matchTransition(exctx, transition, eventName)) {
                            enabledTransitions.add(transition);
                            break;
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `transform` may produce `NullPointerException`
in `src/main/java/org/apache/commons/scxml2/io/SCXMLWriter.java`
#### Snippet
```java
        final Result output = new StreamResult(out);
        try {
            XFORMER.transform(input, output);
        } catch (final TransformerException te) {
            final org.apache.commons.logging.Log log = LogFactory.getLog(SCXMLWriter.class);
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/org/apache/commons/scxml2/model/Final.java`
#### Snippet
```java
                }
            } catch (final SCXMLExpressionException e) {
                result = null;
                exctx.getInternalIOProcessor().addEvent(new EventBuilder(TriggerEvent.ERROR_EXECUTION, TriggerEvent.ERROR_EVENT).build());
                exctx.getErrorReporter().onError(ErrorConstants.EXPRESSION_ERROR,
```

### DataFlowIssue
Argument `JSEvaluator.class.getResourceAsStream("init_global.js")` might be null
in `src/main/java/org/apache/commons/scxml2/env/javascript/JSEvaluator.java`
#### Snippet
```java
            if (initGlobalsScript == null) {
                try {
                    initGlobalsScript = IOUtils.toString(JSEvaluator.class.getResourceAsStream("init_global.js"), "UTF-8");
                }
                catch (final IOException ioe) {
```

## RuleId[id=EmptyStatementBody]
### EmptyStatementBody
`for` statement has empty body
in `src/main/java/org/apache/commons/scxml2/io/ModelUpdater.java`
#### Snippet
```java
            }
            // find least common ancestor
            for (i = Math.min(i, tt.getNumberOfAncestors()); i > 0 && first.getAncestor(i-1) != tt.getAncestor(i-1); i--) ;
            if (i == 0) {
                // no common ancestor
```

## RuleId[id=AssignmentToStaticFieldFromInstanceMethod]
### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `initGlobalsScript` from instance context
in `src/main/java/org/apache/commons/scxml2/env/javascript/JSEvaluator.java`
#### Snippet
```java
            if (initGlobalsScript == null) {
                try {
                    initGlobalsScript = IOUtils.toString(JSEvaluator.class.getResourceAsStream("init_global.js"), "UTF-8");
                }
                catch (final IOException ioe) {
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (4 lines)
in `src/main/java/org/apache/commons/scxml2/io/SCXMLWriter.java`
#### Snippet
```java
        // Instantiate the XMLOutputFactory
        final XMLOutputFactory factory = XMLOutputFactory.newInstance();
        /*
        if (configuration.factoryId != null && configuration.factoryClassLoader != null) {
            // TODO StAX API bug means we can't use custom factories yet
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/org/apache/commons/scxml2/model/Assign.java`
#### Snippet
```java
        // TODO: introduce a optional 'trace.change' setting or something alike to enable .change events,
       //        but don't do this by default as it can interfere with transitions not expecting such events
        /*
            TriggerEvent ev = new TriggerEvent(location + ".change", TriggerEvent.CHANGE_EVENT);
            exctx.getInternalIOProcessor().addEvent(ev);
```

## RuleId[id=MethodOverloadsParentMethod]
### MethodOverloadsParentMethod
Method `setParent()` overloads a compatible method of a superclass, when overriding might have been intended
in `src/main/java/org/apache/commons/scxml2/model/TransitionalState.java`
#### Snippet
```java
     * @param parent The parent to set.
     */
    public final void setParent(final TransitionalState parent) {
        super.setParent(parent);
    }
```

### MethodOverloadsParentMethod
Method `setParent()` overloads a compatible method of a superclass, when overriding might have been intended
in `src/main/java/org/apache/commons/scxml2/model/SimpleTransition.java`
#### Snippet
```java
     * @param parent The parent to set.
     */
    public final void setParent(final TransitionalState parent) {
        super.setParent(parent);
    }
```

### MethodOverloadsParentMethod
Method `setParent()` overloads a compatible method of a superclass, when overriding might have been intended
in `src/main/java/org/apache/commons/scxml2/model/Finalize.java`
#### Snippet
```java
     * @param parent The parent to set.
     */
    public final void setParent(final TransitionalState parent) {
        super.setParent(parent);
    }
```

### MethodOverloadsParentMethod
Method `addChild()` overloads a compatible method of a superclass, when overriding might have been intended
in `src/main/java/org/apache/commons/scxml2/model/Parallel.java`
#### Snippet
```java
     * @param ts the child to add
     */
    public final void addChild(final TransitionalState ts) {
        super.addChild(ts);
    }
```

### MethodOverloadsParentMethod
Method `setParent()` overloads a compatible method of a superclass, when overriding might have been intended
in `src/main/java/org/apache/commons/scxml2/model/Final.java`
#### Snippet
```java
     * @param parent The parent state to set
     */
    public final void setParent(final State parent) {
        super.setParent(parent);
    }
```

### MethodOverloadsParentMethod
Method `setParent()` overloads a compatible method of a superclass, when overriding might have been intended
in `src/main/java/org/apache/commons/scxml2/model/History.java`
#### Snippet
```java
     * @param parent The parent to set.
     */
    public final void setParent(final TransitionalState parent) {
        super.setParent(parent);
    }
```

## RuleId[id=UnnecessaryCallToStringValueOf]
### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `src/main/java/org/apache/commons/scxml2/env/SimpleDispatcher.java`
#### Snippet
```java
                    ", type: " + type +
                    ", event: " + event +
                    ", data: " + String.valueOf(data) +
                    ", hints: " + String.valueOf(hints) +
                    ", delay: " + delay +
```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `src/main/java/org/apache/commons/scxml2/env/SimpleDispatcher.java`
#### Snippet
```java
                    ", event: " + event +
                    ", data: " + String.valueOf(data) +
                    ", hints: " + String.valueOf(hints) +
                    ", delay: " + delay +
                    ')';
```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `src/main/java/org/apache/commons/scxml2/model/Var.java`
#### Snippet
```java
        if (exctx.getAppLog().isDebugEnabled()) {
            exctx.getAppLog().debug("<var>: Defined variable '" + name
                + "' with initial value '" + String.valueOf(varObj) + "'");
        }
        final TriggerEvent ev = new EventBuilder(name + ".change", TriggerEvent.CHANGE_EVENT).build();
```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `src/main/java/org/apache/commons/scxml2/model/Log.java`
#### Snippet
```java
        final Context ctx = exctx.getContext(getParentEnterableState());
        final Evaluator eval = exctx.getEvaluator();
        exctx.getAppLog().info(label + ": " + String.valueOf(eval.eval(ctx, expr)));
    }
}
```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `src/main/java/org/apache/commons/scxml2/env/SimpleContext.java`
#### Snippet
```java
        getVars().put(name, value);
        if (log.isDebugEnabled()) {
            log.debug(name + " = " + String.valueOf(value));
        }
    }
```

## RuleId[id=KeySetIterationMayUseEntrySet]
### KeySetIterationMayUseEntrySet
Iteration over `data.keySet()` may be replaced with 'entrySet()' iteration
in `src/main/java/org/apache/commons/scxml2/SCInstance.java`
#### Snippet
```java
            // initialize/override global context data
            if (data != null) {
                for (final String key : data.keySet()) {
                    if (globalContext.has(key)) {
                        globalContext.set(key, data.get(key));
```

### KeySetIterationMayUseEntrySet
Iteration over `global.keySet()` may be replaced with 'entrySet()' iteration
in `src/main/java/org/apache/commons/scxml2/env/javascript/JSEvaluator.java`
#### Snippet
```java
    private void copyJavascriptGlobalsToScxmlContext(final Bindings global, final JSContext jsContext) {
        if (global != null) {
            for (final String key : global.keySet()) {
                if (!SCXML_SYSTEM_CONTEXT.equals(key)) {
                    jsContext.set(key, global.get(key));
```

## RuleId[id=NonSerializableFieldInSerializableClass]
### NonSerializableFieldInSerializableClass
Non-serializable field 'data' in a Serializable class
in `src/main/java/org/apache/commons/scxml2/system/EventVariable.java`
#### Snippet
```java
     * Whatever data the sending entity chose to include in the event
     */
    private final Object data;

    public EventVariable(final String name, final String type, final String sendid, final String origin, final String origintype, final String invokeid, final Object data) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'jsonObject' in a Serializable class
in `src/main/java/org/apache/commons/scxml2/model/JsonValue.java`
#### Snippet
```java
     * The Java Object mapped from a json string
     */
    private final Object jsonObject;

    /**
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'data' in a Serializable class
in `src/main/java/org/apache/commons/scxml2/TriggerEvent.java`
#### Snippet
```java
    private final String originType;
    private final String invokeId;
    private final Object data;

    public String getName() {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'executor' in a Serializable class
in `src/main/java/org/apache/commons/scxml2/invoke/SimpleSCXMLInvoker.java`
#### Snippet
```java
    private SCXMLExecutor parentSCXMLExecutor;
    /** The invoked state machine executor. */
    private SCXMLExecutor executor;
    /** Cancellation status. */
    private boolean cancelled;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'parentSCXMLExecutor' in a Serializable class
in `src/main/java/org/apache/commons/scxml2/invoke/SimpleSCXMLInvoker.java`
#### Snippet
```java
    private String invokeId;
    /** Invoking parent SCXMLExecutor */
    private SCXMLExecutor parentSCXMLExecutor;
    /** The invoked state machine executor. */
    private SCXMLExecutor executor;
```

## RuleId[id=MismatchedJavadocCode]
### MismatchedJavadocCode
Method is specified to return 'true' but there's no such enum constant in TransitionType
in `src/main/java/org/apache/commons/scxml2/model/SimpleTransition.java`
#### Snippet
```java

    /**
     * @return true if Transition type == internal or false if type == external (default)
     */
    public final TransitionType getType() {
```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`((Collection)obj).size()==0` can be replaced with '((Collection)obj).isEmpty()'
in `src/main/java/org/apache/commons/scxml2/env/groovy/GroovySCXMLScript.java`
#### Snippet
```java
                (obj instanceof String && ((String)obj).isEmpty()) ||
                ((obj.getClass().isArray() && Array.getLength(obj)==0)) ||
                (obj instanceof Collection && ((Collection)obj).size()==0) ||
                (obj instanceof Map && ((Map)obj).isEmpty());
    }
```

### SizeReplaceableByIsEmpty
`input.trim().length()==0` can be replaced with 'input.trim().isEmpty()'
in `src/main/java/org/apache/commons/scxml2/io/SCXMLReader.java`
#### Snippet
```java
     */
    private static String nullIfEmpty(final String input) {
        return input == null || input.trim().length()==0 ? null : input.trim();
    }

```

## RuleId[id=ProtectedMemberInFinalClass]
### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/org/apache/commons/scxml2/env/EffectiveContextMap.java`
#### Snippet
```java
     * @param map Map to merge vars into
     */
    protected void mergeVars(final Context leaf, final Map<String, Object> map) {
        if (leaf != null) {
            mergeVars(leaf.getParent(), map);
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/commons/scxml2/TriggerEvent.java`
#### Snippet
```java
        }
        if (data != null) {
            buf.append(", data=").append(data.toString());
        }
        buf.append("}");
```

## RuleId[id=AssignmentToForLoopParameter]
### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `src/main/java/org/apache/commons/scxml2/model/SimpleTransition.java`
#### Snippet
```java
                            for (final TransitionTarget tt : targets) {
                                if (i >= tt.getNumberOfAncestors()) {
                                    i = tt.getNumberOfAncestors();
                                    allDescendants = false;
                                    break;
```

## RuleId[id=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `GroovySCXMLScript` has no concrete subclass
in `src/main/java/org/apache/commons/scxml2/env/groovy/GroovySCXMLScript.java`
#### Snippet
```java
 * as well as JEXL like convenience functions {@link #empty(Object)} and {@link #var(String)}.
 */
public abstract class GroovySCXMLScript extends Script {

    private GroovyContext context;
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends Param`
in `src/main/java/org/apache/commons/scxml2/model/PayloadBuilder.java`
#### Snippet
```java
     * @see PayloadBuilder#addToPayload(String, Object, java.util.Map)
     */
    public static void addParamsToPayload(final Context ctx, final Evaluator evaluator, final List<Param> paramsList,
                                          final Map<String, Object> payload)
            throws SCXMLExpressionException {
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/org/apache/commons/scxml2/model/PayloadBuilder.java`
#### Snippet
```java
     */
    @SuppressWarnings("unchecked")
    public static void addToPayload(final String attrName, final Object attrValue, final Map<String, Object> payload) {
        DataValueList valueList = null;
        Object value = payload.get(attrName);
```

### BoundedWildcard
Can generalize to `? extends SCXMLIOProcessor`
in `src/main/java/org/apache/commons/scxml2/env/SimpleDispatcher.java`
#### Snippet
```java
    @see EventDispatcher#send(java.util.Map, String, String, String, String, Object, Object, long)
     */
    public void send(final Map<String, SCXMLIOProcessor> ioProcessors, final String id, final String target,
            final String type, final String event, final Object data, final Object hints, final long delay) {
        if (log.isInfoEnabled()) {
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/org/apache/commons/scxml2/env/EffectiveContextMap.java`
#### Snippet
```java
     * @param map Map to merge vars into
     */
    protected void mergeVars(final Context leaf, final Map<String, Object> map) {
        if (leaf != null) {
            mergeVars(leaf.getParent(), map);
```

### BoundedWildcard
Can generalize to `? extends History`
in `src/main/java/org/apache/commons/scxml2/io/SCXMLWriter.java`
#### Snippet
```java
     * @throws XMLStreamException An exception processing the underlying {@link XMLStreamWriter}.
     */
    private static void writeHistory(final XMLStreamWriter writer, final List<History> history)
            throws XMLStreamException {

```

### BoundedWildcard
Can generalize to `? extends Action`
in `src/main/java/org/apache/commons/scxml2/io/SCXMLWriter.java`
#### Snippet
```java
     * @throws XMLStreamException An exception processing the underlying {@link XMLStreamWriter}.
     */
    private static void writeExecutableContent(final XMLStreamWriter writer, final List<Action> actions)
            throws XMLStreamException {

```

### BoundedWildcard
Can generalize to `? extends Param`
in `src/main/java/org/apache/commons/scxml2/io/SCXMLWriter.java`
#### Snippet
```java
     * @throws XMLStreamException An exception processing the underlying {@link XMLStreamWriter}.
     */
    private static void writeParams(final XMLStreamWriter writer, final List<Param> params)
            throws XMLStreamException {
        for (final Param p : params) {
```

### BoundedWildcard
Can generalize to `? extends EnterableState`
in `src/main/java/org/apache/commons/scxml2/io/SCXMLWriter.java`
#### Snippet
```java
     * @throws XMLStreamException An exception processing the underlying {@link XMLStreamWriter}.
     */
    private static void writeEnterableStates(final XMLStreamWriter writer, final List<EnterableState> states)
            throws XMLStreamException {
        for (final EnterableState es : states) {
```

### BoundedWildcard
Can generalize to `? extends EnterableState`
in `src/main/java/org/apache/commons/scxml2/SCInstance.java`
#### Snippet
```java
     */
    public void setLastConfiguration(final History history,
            final Set<EnterableState> lc) {
        histories.put(history, new HashSet<>(lc));
    }
```

### BoundedWildcard
Can generalize to `? extends TransitionTarget`
in `src/main/java/org/apache/commons/scxml2/io/ModelUpdater.java`
#### Snippet
```java
     */
    private static void updateTransition(final SimpleTransition transition,
                                         final Map<String, TransitionTarget> targets) throws ModelException {
        final String next = transition.getNext();
        if (next == null) { // stay transition
```

### BoundedWildcard
Can generalize to `? extends EnterableState`
in `src/main/java/org/apache/commons/scxml2/io/ModelUpdater.java`
#### Snippet
```java
     * @return Returns the next to be used order value
     */
    private static int initDocumentOrder(final List<EnterableState> states, int nextOrder) {
        for (final EnterableState state : states) {
            state.setOrder(nextOrder++);
```

### BoundedWildcard
Can generalize to `? extends EnterableState`
in `src/main/java/org/apache/commons/scxml2/io/ModelUpdater.java`
#### Snippet
```java
     * @throws ModelException If the object model is flawed
     */
    private static void updateEnterableStates(final List<EnterableState> states,
                                              final Map<String, TransitionTarget> targets)
        throws ModelException {
```

### BoundedWildcard
Can generalize to `? extends TransitionTarget`
in `src/main/java/org/apache/commons/scxml2/io/ModelUpdater.java`
#### Snippet
```java
     *     http://www.w3.org/TR/scxml/#LegalStateConfigurations</a>
     */
    private static boolean verifyTransitionTargets(final Set<TransitionTarget> tts) {
        if (tts.size() < 2) { // No contention
            return true;
```

### BoundedWildcard
Can generalize to `? extends EnterableState`
in `src/main/java/org/apache/commons/scxml2/io/ModelUpdater.java`
#### Snippet
```java
     * @return Returns the next to be used observable id sequence value
     */
    private static int initObservables(final List<EnterableState>states, int nextObservableId) {
        for (final EnterableState es : states) {
            es.setObservableId(nextObservableId++);
```

### BoundedWildcard
Can generalize to `? super EnterableState`
in `src/main/java/org/apache/commons/scxml2/semantics/SCXMLSemanticsImpl.java`
#### Snippet
```java
     * @param activeStates The current active states of the state machine ({@link StateConfiguration#getActiveStates()}).
     */
    public void computeExitSet(final SimpleTransition transition, final Set<EnterableState> exitSet, final Set<EnterableState> activeStates) {
        if (!transition.getTargets().isEmpty()) {
            final TransitionalState transitionDomain = transition.getTransitionDomain();
```

### BoundedWildcard
Can generalize to `? extends EnterableState`
in `src/main/java/org/apache/commons/scxml2/semantics/SCXMLSemanticsImpl.java`
#### Snippet
```java
     * @param activeStates The current active states of the state machine ({@link StateConfiguration#getActiveStates()}).
     */
    public void computeExitSet(final SimpleTransition transition, final Set<EnterableState> exitSet, final Set<EnterableState> activeStates) {
        if (!transition.getTargets().isEmpty()) {
            final TransitionalState transitionDomain = transition.getTransitionDomain();
```

### BoundedWildcard
Can generalize to `? extends EnterableState`
in `src/main/java/org/apache/commons/scxml2/semantics/SCXMLSemanticsImpl.java`
#### Snippet
```java
     * @return true if a given state configuration is legal, false otherwise
     */
    public boolean isLegalConfiguration(final Set<EnterableState> states, final ErrorReporter errRep) {
        /*
         * For every active state we add 1 to the count of its parent. Each
```

### BoundedWildcard
Can generalize to `? extends EnterableState`
in `src/main/java/org/apache/commons/scxml2/semantics/SCXMLSemanticsImpl.java`
#### Snippet
```java
     * @param state the state to check with
     */
    public boolean containsNoDescendant(final Set<EnterableState> states, final EnterableState state) {
        for (final EnterableState es : states) {
            if (es.isDescendantOf(state)) {
```

### BoundedWildcard
Can generalize to `? extends EnterableState`
in `src/main/java/org/apache/commons/scxml2/semantics/SCXMLSemanticsImpl.java`
#### Snippet
```java
     * @param activeStates The current set of all active states in the state machine
     */
    public void recordHistory(final Step step, final Set<EnterableState> atomicStates, final Set<EnterableState> activeStates) {
        for (final EnterableState es : step.getExitSet()) {
            if (es instanceof TransitionalState && ((TransitionalState)es).hasHistory()) {
```

### BoundedWildcard
Can generalize to `? extends TransitionalState`
in `src/main/java/org/apache/commons/scxml2/semantics/SCXMLSemanticsImpl.java`
#### Snippet
```java
     */
    public void initiateInvokes(final SCXMLExecutionContext exctx,
                                final Set<TransitionalState> statesToInvoke) throws ModelException {
        final ActionExecutionContext aexctx = exctx.getActionExecutionContext();
        for (final TransitionalState ts : statesToInvoke) {
```

### BoundedWildcard
Can generalize to `? super TransitionalState`
in `src/main/java/org/apache/commons/scxml2/semantics/SCXMLSemanticsImpl.java`
#### Snippet
```java
     */
    public void enterStates(final SCXMLExecutionContext exctx, final Step step,
                            final Set<TransitionalState> statesToInvoke)
            throws ModelException {
        if (step.getEntrySet().isEmpty()) {
```

### BoundedWildcard
Can generalize to `? extends Transition`
in `src/main/java/org/apache/commons/scxml2/semantics/SCXMLSemanticsImpl.java`
#### Snippet
```java
     */
    public void removeConflictingTransitions(final SCXMLExecutionContext exctx, final Step step,
                                             final List<Transition> enabledTransitions) {
        final LinkedHashSet<Transition> filteredTransitions = new LinkedHashSet<>();
        final LinkedHashSet<Transition> preemptedTransitions = new LinkedHashSet<>();
```

## RuleId[id=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/org/apache/commons/scxml2/io/SCXMLReader.java`
#### Snippet
```java
     * This can be turned on (as needed by SCXMLReader) by setting this property TRUE
     */
    public final static String XMLInputFactory_JDK_PROP_REPORT_CDATA = "http://java.sun.com/xml/stream/properties/report-cdata-event";

    //---------------------- PRIVATE CONSTANTS ----------------------//
```

## RuleId[id=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/scxml2/Builtin.java`
#### Snippet
```java
     */
    @SuppressWarnings("unchecked")
    public static boolean isMember(final Context ctx, final String state) {
        return ((Status)ctx.getSystemContext().getPlatformVariables().get(SCXMLSystemContext.STATUS_KEY)).isInState(state);
    }
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/scxml2/env/groovy/GroovyEvaluator.java`
#### Snippet
```java

    @SuppressWarnings("unchecked")
    protected Script getScript(final GroovyContext groovyContext, final String scriptBaseClassName, final String scriptSource) {
        final Script script = scriptCache.getScript(scriptBaseClassName, scriptSource);
        script.setBinding(groovyContext.getBinding());
```

## RuleId[id=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/scxml2/test/StandaloneJexlExpressions.java`
#### Snippet
```java
    public static void main(final String[] args) {
        if (args.length < 1) {
            System.out.println("USAGE: java "
                    + StandaloneJexlExpressions.class.getName()
                    + "<url|filename>");
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/scxml2/test/StandaloneUtils.java`
#### Snippet
```java
            final SCXML doc = SCXMLReader.read(new URL(documentURI));
            if (doc == null) {
                System.err.println("The SCXML document " + uri
                        + " can not be parsed!");
                System.exit(-1);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/scxml2/test/StandaloneUtils.java`
#### Snippet
```java
                System.exit(-1);
            }
            System.out.println(SCXMLWriter.write(doc));
            final SCXMLExecutor exec = new SCXMLExecutor(evaluator, null, trc);
            exec.setStateMachine(doc);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/scxml2/test/StandaloneUtils.java`
#### Snippet
```java
                event = event.trim();
                if (event.equalsIgnoreCase("help") || event.equals("?")) {
                    System.out.println("Enter a space-separated list of "
                        + "events");
                    System.out.println("To populate a variable in the "
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/scxml2/test/StandaloneUtils.java`
#### Snippet
```java
                    System.out.println("Enter a space-separated list of "
                        + "events");
                    System.out.println("To populate a variable in the "
                        + "current context, type \"name=value\"");
                    System.out.println("To quit, enter \"quit\"");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/scxml2/test/StandaloneUtils.java`
#### Snippet
```java
                    System.out.println("To populate a variable in the "
                        + "current context, type \"name=value\"");
                    System.out.println("To quit, enter \"quit\"");
                    System.out.println("To reset state machine, enter "
                        + "\"reset\"");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/scxml2/test/StandaloneUtils.java`
#### Snippet
```java
                        + "current context, type \"name=value\"");
                    System.out.println("To quit, enter \"quit\"");
                    System.out.println("To reset state machine, enter "
                        + "\"reset\"");
                } else if (event.equalsIgnoreCase("quit")) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/scxml2/test/StandaloneUtils.java`
#### Snippet
```java
                    final String value = event.substring(marker + 1);
                    rootCtx.setLocal(name, value);
                    System.out.println("Set variable " + name + " to "
                        + value);
                } else if (event.trim().isEmpty()
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/scxml2/test/StandaloneUtils.java`
#### Snippet
```java
                    exec.triggerEvents(evts);
                    if (exec.getStatus().isFinal()) {
                        System.out.println("A final configuration reached.");
                    }
                } else {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/scxml2/test/StandaloneUtils.java`
#### Snippet
```java
                    exec.triggerEvents(evts);
                    if (exec.getStatus().isFinal()) {
                        System.out.println("A final configuration reached.");
                    }
                }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/scxml2/io/SCXMLReader.java`
#### Snippet
```java
                    break;
                case XMLStreamConstants.NAMESPACE:
                    System.err.println(reader.getNamespaceCount());
                    break;
                default:
```

## RuleId[id=CharsetObjectCanBeUsed]
### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `src/main/java/org/apache/commons/scxml2/io/ContentParser.java`
#### Snippet
```java
    public ParsedValue parseResource(final String resourceURL) throws IOException {
        try (InputStream in = new URL(resourceURL).openStream()) {
            final String content = IOUtils.toString(in, "UTF-8");
            return parseContent(content);
        }
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `src/main/java/org/apache/commons/scxml2/env/javascript/JSEvaluator.java`
#### Snippet
```java
            if (initGlobalsScript == null) {
                try {
                    initGlobalsScript = IOUtils.toString(JSEvaluator.class.getResourceAsStream("init_global.js"), "UTF-8");
                }
                catch (final IOException ioe) {
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `src/main/java/org/apache/commons/scxml2/io/SCXMLReader.java`
#### Snippet
```java
            }
            try (InputStream in = new URL(resolvedSrc).openStream()){
                script.setScript(IOUtils.toString(in, "UTF-8"));
            }
            catch (final IOException e) {
```

## RuleId[id=ClassNameSameAsAncestorName]
### ClassNameSameAsAncestorName
Class name `JexlContext` is the same as one of its superclass' names
in `src/main/java/org/apache/commons/scxml2/env/jexl/JexlContext.java`
#### Snippet
```java
 * JEXL Context implementation for Commons SCXML.
 */
public class JexlContext extends SimpleContext
    implements org.apache.commons.jexl3.JexlContext {

```

## RuleId[id=MissingDeprecatedAnnotation]
### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `src/main/java/org/apache/commons/scxml2/TriggerEvent.java`
#### Snippet
```java
     * @deprecated use {@link EventBuilder instead}
     */
    public TriggerEvent(final String name, final int type) {
        this(name, type, null, null, null, null, null);
    }
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.scxml2` is unnecessary and can be removed
in `src/main/java/org/apache/commons/scxml2/env/URLResolver.java`
#### Snippet
```java
 * A PathResolver implementation that resolves against a base URL.
 *
 * @see org.apache.commons.scxml2.PathResolver
 */
public class URLResolver implements PathResolver, Serializable {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.scxml2` is unnecessary and can be removed
in `src/main/java/org/apache/commons/scxml2/env/URLResolver.java`
#### Snippet
```java

    /**
     * @see org.apache.commons.scxml2.PathResolver#getResolver(String)
     */
    public PathResolver getResolver(final String ctxPath) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.scxml2` is unnecessary and can be removed
in `src/main/java/org/apache/commons/scxml2/env/URLResolver.java`
#### Snippet
```java
    /**
     * Uses URL(URL, String) constructor to combine URL's.
     * @see org.apache.commons.scxml2.PathResolver#resolvePath(String)
     */
    public String resolvePath(final String ctxPath) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.scxml2` is unnecessary and can be removed
in `src/main/java/org/apache/commons/scxml2/model/CommonsSCXML.java`
#### Snippet
```java

/**
 * A convenient SCXML instance with the {@link org.apache.commons.scxml2.SCXMLConstants#XMLNS_COMMONS_SCXML} namespace
 * pre-configured.
 * <p>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `src/main/java/org/apache/commons/scxml2/model/PayloadBuilder.java`
#### Snippet
```java
     * @param payload the payload data map to be updated
     * @throws SCXMLExpressionException if a malformed or invalid expression is evaluated
     * @see PayloadBuilder#addToPayload(String, Object, java.util.Map)
     */
    public static void addParamsToPayload(final Context ctx, final Evaluator evaluator, final List<Param> paramsList,
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `src/main/java/org/apache/commons/scxml2/model/PayloadBuilder.java`
#### Snippet
```java
     * @param payload the payload data map to be updated
     * @throws SCXMLExpressionException if a malformed or invalid expression is evaluated
     * @see PayloadBuilder#addToPayload(String, Object, java.util.Map)
     */
    public static void addNamelistDataToPayload(final EnterableState parentState, final Context ctx,
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `src/main/java/org/apache/commons/scxml2/env/SimpleDispatcher.java`
#### Snippet
```java

    /**
    @see EventDispatcher#send(java.util.Map, String, String, String, String, Object, Object, long)
     */
    public void send(final Map<String, SCXMLIOProcessor> ioProcessors, final String id, final String target,
```

### UnnecessaryFullyQualifiedName
Qualifier `org.xml.sax` is unnecessary and can be removed
in `src/main/java/org/apache/commons/scxml2/env/Tracer.java`
#### Snippet
```java

    /**
     * @see org.xml.sax.ErrorHandler#warning(org.xml.sax.SAXParseException)
     */
    public void warning(final SAXParseException exception)
```

### UnnecessaryFullyQualifiedName
Qualifier `org.xml.sax` is unnecessary and can be removed
in `src/main/java/org/apache/commons/scxml2/env/Tracer.java`
#### Snippet
```java

    /**
     * @see org.xml.sax.ErrorHandler#warning(org.xml.sax.SAXParseException)
     */
    public void warning(final SAXParseException exception)
```

### UnnecessaryFullyQualifiedName
Qualifier `org.xml.sax` is unnecessary and can be removed
in `src/main/java/org/apache/commons/scxml2/env/Tracer.java`
#### Snippet
```java

    /**
     * @see org.xml.sax.ErrorHandler#fatalError(org.xml.sax.SAXParseException)
     */
    public void fatalError(final SAXParseException exception)
```

### UnnecessaryFullyQualifiedName
Qualifier `org.xml.sax` is unnecessary and can be removed
in `src/main/java/org/apache/commons/scxml2/env/Tracer.java`
#### Snippet
```java

    /**
     * @see org.xml.sax.ErrorHandler#fatalError(org.xml.sax.SAXParseException)
     */
    public void fatalError(final SAXParseException exception)
```

### UnnecessaryFullyQualifiedName
Qualifier `org.xml.sax` is unnecessary and can be removed
in `src/main/java/org/apache/commons/scxml2/env/Tracer.java`
#### Snippet
```java

    /**
     * @see org.xml.sax.ErrorHandler#error(org.xml.sax.SAXParseException)
     */
    public void error(final SAXParseException exception)
```

### UnnecessaryFullyQualifiedName
Qualifier `org.xml.sax` is unnecessary and can be removed
in `src/main/java/org/apache/commons/scxml2/env/Tracer.java`
#### Snippet
```java

    /**
     * @see org.xml.sax.ErrorHandler#error(org.xml.sax.SAXParseException)
     */
    public void error(final SAXParseException exception)
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.scxml2` is unnecessary and can be removed
in `src/main/java/org/apache/commons/scxml2/env/EffectiveContextMap.java`
#### Snippet
```java
    private static final long serialVersionUID = 1L;

    /** The {@link org.apache.commons.scxml2.Context} for the current state. */
    private final Context leaf;

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.scxml2` is unnecessary and can be removed
in `src/main/java/org/apache/commons/scxml2/invoke/Invoker.java`
#### Snippet
```java
 *      (Invoker implementation requires accessible constructor).</li>
 *  <li>Configuration (setters for invoke ID and
 *      {@link org.apache.commons.scxml2.SCXMLExecutor}).</li>
 *  <li>Initiation of invoked activity via invoke() method, passing
 *      the source URI and the map of params.</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `src/main/java/org/apache/commons/scxml2/SCXMLSemantics.java`
#### Snippet
```java
     * <p>
     * This method is also first invoked when manually initializing the status of a state machine through
     * {@link SCXMLExecutor#setConfiguration(java.util.Set)}.
     * </p>
     * @param states a set of states
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.logging` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/commons/scxml2/io/ModelUpdater.java`
#### Snippet
```java
        final MessageFormat msgFormat = new MessageFormat(errType);
        final String errMsg = msgFormat.format(msgArgs);
        final org.apache.commons.logging.Log log = LogFactory.
                getLog(ModelUpdater.class);
        log.error(errMsg);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.scxml2.model` is unnecessary and can be removed
in `src/main/java/org/apache/commons/scxml2/SCXMLListener.java`
#### Snippet
```java
 * {@link org.apache.commons.scxml2.model.State} instances (subscribe to
 * particular entry and exit notifications) and
 * {@link org.apache.commons.scxml2.model.Transition} instances (subscribe to
 * particular transitions).
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.scxml2` is unnecessary and can be removed
in `src/main/java/org/apache/commons/scxml2/env/SimpleContext.java`
#### Snippet
```java
     * @param name The variable name
     * @param value The variable value
     * @see org.apache.commons.scxml2.Context#set(String, Object)
     */
    public void set(final String name, final Object value) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.scxml2` is unnecessary and can be removed
in `src/main/java/org/apache/commons/scxml2/env/SimpleContext.java`
#### Snippet
```java
     * @param name The variable name
     * @return Object The variable value
     * @see org.apache.commons.scxml2.Context#get(String)
     */
    public Object get(final String name) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.scxml2` is unnecessary and can be removed
in `src/main/java/org/apache/commons/scxml2/env/SimpleContext.java`
#### Snippet
```java
     * @param name The variable name
     * @param value The variable value
     * @see org.apache.commons.scxml2.Context#setLocal(String, Object)
     */
    public void setLocal(final String name, final Object value) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.scxml2` is unnecessary and can be removed
in `src/main/java/org/apache/commons/scxml2/env/SimpleContext.java`
#### Snippet
```java
     * Clear this Context.
     *
     * @see org.apache.commons.scxml2.Context#reset()
     */
    public void reset() {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.scxml2` is unnecessary and can be removed
in `src/main/java/org/apache/commons/scxml2/env/SimpleContext.java`
#### Snippet
```java
     * @param name The variable name
     * @return boolean true if this variable exists
     * @see org.apache.commons.scxml2.Context#has(String)
     */
    public boolean has(final String name) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.scxml2` is unnecessary and can be removed
in `src/main/java/org/apache/commons/scxml2/env/SimpleContext.java`
#### Snippet
```java
     *
     * @return Context The parent Context
     * @see org.apache.commons.scxml2.Context#getParent()
     */
    public Context getParent() {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.scxml2` is unnecessary and can be removed
in `src/main/java/org/apache/commons/scxml2/env/SimpleContext.java`
#### Snippet
```java
     * @param name The variable name
     * @return boolean true if this variable exists
     * @see org.apache.commons.scxml2.Context#hasLocal(String)
     */
    public boolean hasLocal(final String name) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `src/main/java/org/apache/commons/scxml2/SCXMLExecutor.java`
#### Snippet
```java
     * stateId is specified, or when the specified active configuration does not represent a legal configuration.
     * @see SCInstance#initialize()
     * @see SCXMLSemantics#isLegalConfiguration(java.util.Set, ErrorReporter)
     */
    public synchronized void setConfiguration(final Set<String> atomicStateIds) throws ModelException {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `src/main/java/org/apache/commons/scxml2/semantics/SCXMLSemanticsImpl.java`
#### Snippet
```java
    /**
     * This method corresponds to the Algorithm for SCXML processing enterStates() procedure, where the states to enter
     * already have been pre-computed in {@link #microStep(SCXMLExecutionContext, Step, java.util.Set)}.
     *
     * @param exctx The execution context for this micro step
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `src/main/java/org/apache/commons/scxml2/semantics/SCXMLSemanticsImpl.java`
#### Snippet
```java
    /**
     * This method corresponds to the Algorithm for SCXML processing exitStates() procedure, where the states to exit
     * already have been pre-computed in {@link #microStep(SCXMLExecutionContext, Step, java.util.Set)}.
     *
     * @param exctx The execution context for this micro step
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.scxml2.model` is unnecessary and can be removed
in `src/main/java/org/apache/commons/scxml2/io/SCXMLReader.java`
#### Snippet
```java
     * @param reader The {@link XMLStreamReader} providing the SCXML document to parse.
     * @param configuration The {@link Configuration} to use while parsing.
     * @param parent The parent {@link org.apache.commons.scxml2.model.ParamsContainer} for this param.
     *
     * @throws XMLStreamException An exception processing the underlying {@link XMLStreamReader}.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.scxml2.model` is unnecessary and can be removed
in `src/main/java/org/apache/commons/scxml2/io/SCXMLReader.java`
#### Snippet
```java
     * @param configuration The {@link Configuration} to use while parsing.
     * @param scxml The root of the object model being parsed.
     * @param ts The parent {@link org.apache.commons.scxml2.model.TransitionalState} for this history.
     *
     * @throws XMLStreamException An exception processing the underlying {@link XMLStreamReader}.
```

## RuleId[id=ReplaceAssignmentWithOperatorAssignment]
### ReplaceAssignmentWithOperatorAssignment
`multiplier = multiplier*MILLIS_IN_A_SECOND` could be simplified to 'multiplier \*= MILLIS_IN_A_SECOND'
in `src/main/java/org/apache/commons/scxml2/model/Send.java`
#### Snippet
```java
                    numericDelay = trimDelay.substring(0, trimDelay.length() - 2);
                } else if (trimDelay.endsWith(SECONDS)) {
                    multiplier = multiplier*MILLIS_IN_A_SECOND;
                    numericDelay = trimDelay.substring(0, trimDelay.length() - 1);
                } else if (trimDelay.endsWith(MINUTES)) { // Not CSS2
```

### ReplaceAssignmentWithOperatorAssignment
`multiplier = multiplier*MILLIS_IN_A_MINUTE` could be simplified to 'multiplier \*= MILLIS_IN_A_MINUTE'
in `src/main/java/org/apache/commons/scxml2/model/Send.java`
#### Snippet
```java
                    numericDelay = trimDelay.substring(0, trimDelay.length() - 1);
                } else if (trimDelay.endsWith(MINUTES)) { // Not CSS2
                    multiplier = multiplier*MILLIS_IN_A_MINUTE;
                    numericDelay = trimDelay.substring(0, trimDelay.length() - 1);
                }
```

## RuleId[id=ThrowablePrintStackTrace]
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/scxml2/test/StandaloneUtils.java`
#### Snippet
```java
            }
        } catch (IOException | ModelException | XMLStreamException e) {
            e.printStackTrace();
        }
    }
```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/scxml2/env/jexl/JexlEvaluator.java`
#### Snippet
```java
                engine = jexlEngine;
                if (engine == null) {
                    jexlEngine = engine = createJexlEngine();
                }
            }
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/scxml2/test/StandaloneUtils.java`
#### Snippet
```java
                InputStreamReader(System.in));
            String event;
            while ((event = br.readLine()) != null) {
                event = event.trim();
                if (event.equalsIgnoreCase("help") || event.equals("?")) {
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/scxml2/env/SimpleContext.java`
#### Snippet
```java
            setVars(new HashMap<>());
        } else {
            setVars(this.vars = initialVars);
        }
    }
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/scxml2/SCXMLExecutor.java`
#### Snippet
```java
    public void triggerEvents() throws ModelException {
        TriggerEvent evt;
        while (exctx.isRunning() && (evt = externalEventQueue.poll()) != null) {
            eventStep(evt);
        }
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/scxml2/semantics/SCXMLSemanticsImpl.java`
#### Snippet
```java
        for (EnterableState es : states) {
            EnterableState parent;
            while ((parent = es.getParent()) != null) {
                final Set<EnterableState> cnt = counts.computeIfAbsent(parent, k -> new HashSet<>());
                cnt.add(es);
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/scxml2/semantics/SCXMLSemanticsImpl.java`
#### Snippet
```java
            final Context context = exctx.getScInstance().getContext(transition.getParent());
            try {
                if ((result = exctx.getEvaluator().evalCond(context, transition.getCond())) == null) {
                    result = Boolean.FALSE;
                    if (exctx.getAppLog().isDebugEnabled()) {
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/scxml2/semantics/SCXMLSemanticsImpl.java`
#### Snippet
```java
                do {
                    for (final Transition transition : current.getTransitionsList()) {
                        if (transitionMatched = matchTransition(exctx, transition, eventName)) {
                            enabledTransitions.add(transition);
                            break;
```

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `AbstractStateMachine()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/commons/scxml2/env/AbstractStateMachine.java`
#### Snippet
```java
     * @since 0.7
     */
    public AbstractStateMachine(final SCXML stateMachine) throws ModelException {
        // default is JEXL
        this(stateMachine, new JexlContext(), new JexlEvaluator());
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractStateMachine()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/commons/scxml2/env/AbstractStateMachine.java`
#### Snippet
```java
     * @see Evaluator
     */
    public AbstractStateMachine(final URL scxmlDocument,
            final Context rootCtx, final Evaluator evaluator) throws ModelException {
        log = LogFactory.getLog(this.getClass());
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractStateMachine()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/commons/scxml2/env/AbstractStateMachine.java`
#### Snippet
```java
     * @throws ModelException in case there is a fatal SCXML object model problem
     */
    public AbstractStateMachine(final URL scxmlDocument) throws ModelException {
        // default is JEXL
        this(scxmlDocument, new JexlContext(), new JexlEvaluator());
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractStateMachine()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/commons/scxml2/env/AbstractStateMachine.java`
#### Snippet
```java
     * @since 0.7
     */
    public AbstractStateMachine(final SCXML stateMachine,
            final Context rootCtx, final Evaluator evaluator) throws ModelException {
        log = LogFactory.getLog(this.getClass());
```

### NonProtectedConstructorInAbstractClass
Constructor `TransitionalState()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/commons/scxml2/model/TransitionalState.java`
#### Snippet
```java
    private final List<EnterableState> children;

    public TransitionalState() {
        transitions = new ArrayList<>();
        history = new ArrayList<>();
```

### NonProtectedConstructorInAbstractClass
Constructor `EnterableState()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/commons/scxml2/model/EnterableState.java`
#### Snippet
```java
    private final List<OnExit> onExits;

    public EnterableState() {
        onEntries = new ArrayList<>();
        onExits = new ArrayList<>();
```

### NonProtectedConstructorInAbstractClass
Constructor `Executable()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/commons/scxml2/model/Executable.java`
#### Snippet
```java
     * Constructor.
     */
    public Executable() {
        this.actions = new ArrayList<>();
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `Action()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/commons/scxml2/model/Action.java`
#### Snippet
```java
     * Constructor.
     */
    public Action() {
        this.parent = null;
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `TransitionTarget()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/commons/scxml2/model/TransitionTarget.java`
#### Snippet
```java
     * Constructor.
     */
    public TransitionTarget() {
        parent = null;
    }
```

## RuleId[id=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `groovyClassLoader` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/scxml2/env/groovy/GroovyExtendableScriptCache.java`
#### Snippet
```java

    /* non-serializable thus transient GroovyClassLoader and CompilerConfiguration */
    private transient GroovyClassLoader groovyClassLoader;
    private transient CompilerConfiguration compilerConfiguration;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `initGlobalsScript` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/scxml2/env/javascript/JSEvaluator.java`
#### Snippet
```java

    /** Nashorn Global initialization script, loaded from <code>init_global.js</code> classpath resource */
    private static String initGlobalsScript;

    /** ScriptContext for a single SCXML instance (JSEvaluator also cannot be shared between SCXML instances) */
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `engine` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/scxml2/env/javascript/JSEvaluator.java`
#### Snippet
```java

    /** Nashorn ScriptEngine **/
    private transient ScriptEngine engine;

    /** Nashorn Global initialization script, loaded from <code>init_global.js</code> classpath resource */
```

## RuleId[id=UseOfPropertiesAsHashtable]
### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `src/main/java/org/apache/commons/scxml2/io/ContentParser.java`
#### Snippet
```java
            final Transformer transformer = TransformerFactory.newInstance().newTransformer();
            final Properties outputProps = new Properties();
            outputProps.put(OutputKeys.OMIT_XML_DECLARATION, "no");
            outputProps.put(OutputKeys.STANDALONE, "no");
            outputProps.put(OutputKeys.INDENT, "yes");
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `src/main/java/org/apache/commons/scxml2/io/ContentParser.java`
#### Snippet
```java
            final Properties outputProps = new Properties();
            outputProps.put(OutputKeys.OMIT_XML_DECLARATION, "no");
            outputProps.put(OutputKeys.STANDALONE, "no");
            outputProps.put(OutputKeys.INDENT, "yes");
            transformer.setOutputProperties(outputProps);
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `src/main/java/org/apache/commons/scxml2/io/ContentParser.java`
#### Snippet
```java
            outputProps.put(OutputKeys.OMIT_XML_DECLARATION, "no");
            outputProps.put(OutputKeys.STANDALONE, "no");
            outputProps.put(OutputKeys.INDENT, "yes");
            transformer.setOutputProperties(outputProps);
            transformer.transform(new DOMSource(node), new StreamResult(writer));
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `src/main/java/org/apache/commons/scxml2/io/SCXMLWriter.java`
#### Snippet
```java
        Transformer transformer;
        final Properties outputProps = new Properties();
        outputProps.put(OutputKeys.OMIT_XML_DECLARATION, "yes");
        outputProps.put(OutputKeys.STANDALONE, "no");
        outputProps.put(OutputKeys.INDENT, "yes");
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `src/main/java/org/apache/commons/scxml2/io/SCXMLWriter.java`
#### Snippet
```java
        final Properties outputProps = new Properties();
        outputProps.put(OutputKeys.OMIT_XML_DECLARATION, "yes");
        outputProps.put(OutputKeys.STANDALONE, "no");
        outputProps.put(OutputKeys.INDENT, "yes");
        try {
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `src/main/java/org/apache/commons/scxml2/io/SCXMLWriter.java`
#### Snippet
```java
        outputProps.put(OutputKeys.OMIT_XML_DECLARATION, "yes");
        outputProps.put(OutputKeys.STANDALONE, "no");
        outputProps.put(OutputKeys.INDENT, "yes");
        try {
            final TransformerFactory tfFactory = TransformerFactory.newInstance();
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/scxml2/env/URLResolver.java`
#### Snippet
```java

    /** The base URL to resolve against. */
    private URL baseURL = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/scxml2/SCInstance.java`
#### Snippet
```java
     * The error reporter.
     */
    private transient ErrorReporter errorReporter = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/scxml2/SCXMLExecutionContext.java`
#### Snippet
```java
     * The environment specific error reporter.
     */
    private ErrorReporter errorReporter = null;

    /**
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `nextOrder`
in `src/main/java/org/apache/commons/scxml2/io/ModelUpdater.java`
#### Snippet
```java
    private static int initDocumentOrder(final List<EnterableState> states, int nextOrder) {
        for (final EnterableState state : states) {
            state.setOrder(nextOrder++);
            if (state instanceof TransitionalState) {
                final TransitionalState ts = (TransitionalState)state;
```

### AssignmentToMethodParameter
Assignment to method parameter `nextOrder`
in `src/main/java/org/apache/commons/scxml2/io/ModelUpdater.java`
#### Snippet
```java
                final TransitionalState ts = (TransitionalState)state;
                for (final Transition t : ts.getTransitionsList()) {
                    t.setOrder(nextOrder++);
                }
                nextOrder = initDocumentOrder(ts.getChildren(), nextOrder);
```

### AssignmentToMethodParameter
Assignment to method parameter `nextOrder`
in `src/main/java/org/apache/commons/scxml2/io/ModelUpdater.java`
#### Snippet
```java
                    t.setOrder(nextOrder++);
                }
                nextOrder = initDocumentOrder(ts.getChildren(), nextOrder);
            }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `nextObservableId`
in `src/main/java/org/apache/commons/scxml2/io/ModelUpdater.java`
#### Snippet
```java
    private static int initObservables(final List<EnterableState>states, int nextObservableId) {
        for (final EnterableState es : states) {
            es.setObservableId(nextObservableId++);
            if (es instanceof TransitionalState) {
                final TransitionalState ts = (TransitionalState)es;
```

### AssignmentToMethodParameter
Assignment to method parameter `nextObservableId`
in `src/main/java/org/apache/commons/scxml2/io/ModelUpdater.java`
#### Snippet
```java
                    final State s = (State)ts;
                    if (s.getInitial() != null && s.getInitial().getTransition() != null) {
                        s.getInitial().getTransition().setObservableId(nextObservableId++);
                    }
                }
```

### AssignmentToMethodParameter
Assignment to method parameter `nextObservableId`
in `src/main/java/org/apache/commons/scxml2/io/ModelUpdater.java`
#### Snippet
```java
                }
                for (final Transition t : ts.getTransitionsList()) {
                    t.setObservableId(nextObservableId++);
                }
                for (final History h : ts.getHistory()) {
```

### AssignmentToMethodParameter
Assignment to method parameter `nextObservableId`
in `src/main/java/org/apache/commons/scxml2/io/ModelUpdater.java`
#### Snippet
```java
                }
                for (final History h : ts.getHistory()) {
                    h.setObservableId(nextObservableId++);
                    if (h.getTransition() != null) {
                        h.getTransition().setObservableId(nextObservableId++);
```

### AssignmentToMethodParameter
Assignment to method parameter `nextObservableId`
in `src/main/java/org/apache/commons/scxml2/io/ModelUpdater.java`
#### Snippet
```java
                    h.setObservableId(nextObservableId++);
                    if (h.getTransition() != null) {
                        h.getTransition().setObservableId(nextObservableId++);
                    }
                }
```

### AssignmentToMethodParameter
Assignment to method parameter `nextObservableId`
in `src/main/java/org/apache/commons/scxml2/io/ModelUpdater.java`
#### Snippet
```java
                    }
                }
                nextObservableId = initObservables(ts.getChildren(), nextObservableId);
            }
        }
```

## RuleId[id=ExceptionNameDoesntEndWithException]
### ExceptionNameDoesntEndWithException
Exception class name `ActionExecutionError` does not end with 'Exception'
in `src/main/java/org/apache/commons/scxml2/model/ActionExecutionError.java`
#### Snippet
```java
 * @see <a href="https://www.w3.org/TR/2015/REC-scxml-20150901/#EvaluationofExecutableContent">SCXML spec 4.9 Evaluation of Executable Content</a>
 */
public final class ActionExecutionError extends RuntimeException {

    private final boolean eventRaised;
```

## RuleId[id=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-05-01-07-35-26.179.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[id=InstanceofCatchParameter]
### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `src/main/java/org/apache/commons/scxml2/model/Invoke.java`
#### Snippet
```java
            axctx.getInternalIOProcessor().addEvent(new EventBuilder(TriggerEvent.ERROR_EXECUTION, TriggerEvent.ERROR_EVENT).build());
            if (e.getMessage() != null) {
                axctx.getErrorReporter().onError(e instanceof SCXMLExpressionException
                        ? ErrorConstants.EXPRESSION_ERROR : ErrorConstants.EXECUTION_ERROR, e.getMessage(), this);
            }
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/scxml2/model/SCXML.java`
#### Snippet
```java
            return children.get(0);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/scxml2/env/URLResolver.java`
#### Snippet
```java
            log.error("Malformed URL", e);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/scxml2/env/URLResolver.java`
#### Snippet
```java
            log.error("Malformed URL", e);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/scxml2/env/jexl/JexlEvaluator.java`
#### Snippet
```java
    throws SCXMLExpressionException {
        if (expr == null) {
            return null;
        }
        if (!(ctx instanceof JexlContext)) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/scxml2/env/jexl/JexlEvaluator.java`
#### Snippet
```java
    throws SCXMLExpressionException {
        if (script == null) {
            return null;
        }
        if (!(ctx instanceof JexlContext)) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/scxml2/env/jexl/JexlEvaluator.java`
#### Snippet
```java
    throws SCXMLExpressionException {
        if (expr == null) {
            return null;
        }
        if (!(ctx instanceof JexlContext)) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/scxml2/env/groovy/GroovyContext.java`
#### Snippet
```java
            return ((GroovyContext)getParent()).getScriptBaseClass();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/scxml2/env/EffectiveContextMap.java`
#### Snippet
```java
            }
        }
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/scxml2/io/ContentParser.java`
#### Snippet
```java
            return buffer.toString();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/scxml2/io/ContentParser.java`
#### Snippet
```java
            throw new IOException(e);
        }
        return doc != null ? doc.getDocumentElement() : null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/scxml2/io/ContentParser.java`
#### Snippet
```java
            return content.substring(start, length);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/scxml2/io/ContentParser.java`
#### Snippet
```java
            return new TextValue(spaceNormalizeContent(src), false);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/scxml2/Status.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/scxml2/io/SCXMLWriter.java`
#### Snippet
```java
    private static String escapeXML(final String str) {
        if (str == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/scxml2/io/SCXMLWriter.java`
#### Snippet
```java
            final org.apache.commons.logging.Log log = LogFactory.getLog(SCXMLWriter.class);
            log.error(t.getMessage(), t);
            return null;
        }
        return transformer;
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/scxml2/SCInstance.java`
#### Snippet
```java
            }
        }
        return systemContext != null ? systemContext.getContext() : null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/scxml2/env/minimal/MinimalContext.java`
#### Snippet
```java
    @Override
    public Object get(final String name) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/scxml2/model/Action.java`
#### Snippet
```java
        if (parent == null && this instanceof Script && ((Script)this).isGlobalScript()) {
            // global script doesn't have a EnterableState
            return null;
        }
        if (parent == null) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/scxml2/env/groovy/GroovyEvaluator.java`
#### Snippet
```java
    public Object evalScript(final Context ctx, final String scriptSource) throws SCXMLExpressionException {
        if (scriptSource == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/scxml2/env/groovy/GroovyEvaluator.java`
#### Snippet
```java
    public Object eval(final Context ctx, final String expr) throws SCXMLExpressionException {
        if (expr == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/scxml2/env/groovy/GroovyEvaluator.java`
#### Snippet
```java
    public Boolean evalCond(final Context ctx, final String expr) throws SCXMLExpressionException {
        if (expr == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/scxml2/env/javascript/JSEvaluator.java`
#### Snippet
```java
    public Object eval(final Context context, final String expression) throws SCXMLExpressionException {
        if (expression == null) {
            return null;
        }
        if (!(context instanceof JSContext)) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/scxml2/env/AbstractBaseEvaluator.java`
#### Snippet
```java
            return map;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/scxml2/env/SimpleContext.java`
#### Snippet
```java
            return parent.get(name);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/scxml2/io/SCXMLReader.java`
#### Snippet
```java
     */
    private static String nullIfEmpty(final String input) {
        return input == null || input.trim().length()==0 ? null : input.trim();
    }

```

## RuleId[id=SynchronizeOnThis]
### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/org/apache/commons/scxml2/env/jexl/JexlEvaluator.java`
#### Snippet
```java
        JexlEngine engine = jexlEngine;
        if (engine == null) {
            synchronized (this) {
                engine = jexlEngine;
                if (engine == null) {
```

## RuleId[id=DoubleBraceInitialization]
### DoubleBraceInitialization
Double brace initialization
in `src/main/java/org/apache/commons/scxml2/env/groovy/GroovyEvaluator.java`
#### Snippet
```java
         * Groovy operator aliases mapped to their underlying Groovy operator
         */
        public final Map<String, String> GROOVY_OPERATOR_ALIASES = Collections.unmodifiableMap(new HashMap<String, String>() {{
            put("and", "&& "); put("or",  "||"); put("not", " ! ");
            put("eq",  "==");  put("lt",  "< "); put("le",  "<=");
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `baseURL` initializer `null` is redundant
in `src/main/java/org/apache/commons/scxml2/env/URLResolver.java`
#### Snippet
```java

    /** The base URL to resolve against. */
    private URL baseURL = null;

    /**
```

### UnusedAssignment
Variable `errorReporter` initializer `null` is redundant
in `src/main/java/org/apache/commons/scxml2/SCInstance.java`
#### Snippet
```java
     * The error reporter.
     */
    private transient ErrorReporter errorReporter = null;

    /**
```

### UnusedAssignment
Variable `errorReporter` initializer `null` is redundant
in `src/main/java/org/apache/commons/scxml2/SCXMLExecutionContext.java`
#### Snippet
```java
     * The environment specific error reporter.
     */
    private ErrorReporter errorReporter = null;

    /**
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `aa instanceof ElseIf` is always `true` when reached
in `src/main/java/org/apache/commons/scxml2/model/If.java`
#### Snippet
```java
            if (execute && !(aa instanceof ElseIf)) {
                aa.execute(exctx);
            } else if (execute && aa instanceof ElseIf) {
                break;
            } else if (aa instanceof Else) {
```

### ConstantValue
Condition `doc == null` is always `false`
in `src/main/java/org/apache/commons/scxml2/test/StandaloneUtils.java`
#### Snippet
```java
            final Tracer trc = new Tracer();
            final SCXML doc = SCXMLReader.read(new URL(documentURI));
            if (doc == null) {
                System.err.println("The SCXML document " + uri
                        + " can not be parsed!");
```

### ConstantValue
Condition `first != null` is always `true`
in `src/main/java/org/apache/commons/scxml2/io/ModelUpdater.java`
#### Snippet
```java
        }
        // least common ancestor must be a parallel
        return first != null && i > 0 && first.getAncestor(i-1) instanceof Parallel;
   }
}
```

### ConstantValue
Condition `scxml != null` is always `true`
in `src/main/java/org/apache/commons/scxml2/io/SCXMLReader.java`
#### Snippet
```java
        }
        final SCXML scxml = readInternal(configuration, null, null, null, null, scxmlSource);
        if (scxml != null) {
            ModelUpdater.updateSCXML(scxml);
        }
```

### ConstantValue
Condition `scxml != null` is always `true`
in `src/main/java/org/apache/commons/scxml2/io/SCXMLReader.java`
#### Snippet
```java
        }
        final SCXML scxml = readInternal(configuration, null, scxmlPath, null, null, null);
        if (scxml != null) {
            ModelUpdater.updateSCXML(scxml);
        }
```

### ConstantValue
Condition `scxml != null` is always `true`
in `src/main/java/org/apache/commons/scxml2/io/SCXMLReader.java`
#### Snippet
```java
        }
        final SCXML scxml = readInternal(configuration, scxmlURL, null, null, null, null);
        if (scxml != null) {
            ModelUpdater.updateSCXML(scxml);
        }
```

### ConstantValue
Condition `scxml != null` is always `true`
in `src/main/java/org/apache/commons/scxml2/io/SCXMLReader.java`
#### Snippet
```java
        }
        final SCXML scxml = readInternal(configuration, null, null, null, scxmlReader, null);
        if (scxml != null) {
            ModelUpdater.updateSCXML(scxml);
        }
```

### ConstantValue
Condition `scxml != null` is always `true`
in `src/main/java/org/apache/commons/scxml2/io/SCXMLReader.java`
#### Snippet
```java
        }
        final SCXML scxml = readInternal(configuration, null, null, scxmlStream, null, null);
        if (scxml != null) {
            ModelUpdater.updateSCXML(scxml);
        }
```

